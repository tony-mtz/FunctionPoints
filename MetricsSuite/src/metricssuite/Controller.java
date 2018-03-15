/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metricssuite;
import com.google.gson.Gson;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.*;
import org.hildan.fxgson.FxGson;
import utils.ProjectCode;
import utils.ProjectData;
import utils.ProjectObject;
import utils.TextFieldTreeCellImpl;

import java.io.*;
import java.net.URL;
import java.util.*;


/**
 *
 * @author tonyd
 */
public class Controller implements Initializable{

    
    
    @FXML
    private MenuItem mLanguage;
    @FXML
    private GridPane gridPane;
    private TabPane tabPane;  
    @FXML
    private Menu metrics;
    @FXML
    private SplitPane splitPane;
    @FXML
    private AnchorPane rightPane;
    @FXML
    private AnchorPane leftPane;
    private TreeView<String> treeView;
    private HashMap<String, Tab> openFPTabs = new HashMap<>();
    private Set<String> openCodeTabs= new HashSet<>();
    private Tab smiTab;
    
    /**
     * Set the setDisable property for metrics on the main menu.
     * @param tf        value to set setDisable to
     */
    
    @FXML
    private void metricsMenu(boolean tf){
        System.out.println("in metrics menu method");
        metrics.setDisable(tf);
    }
    

    /**
     * tab from file
     */
    @FXML
    private void addTab(ProjectData data) {
        try {
            Context.getInstance().setMenuTab(Boolean.FALSE);
            System.out.println(data.getTotalFactors());
            String name = "Function Points - " + data.getName();
            Tab tab = new Tab(name);
            tabPane.getTabs().add(tab);
            openFPTabs.put(name, tab);
            tab.setOnClosed(e -> openFPTabs.remove(name));
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("FPTab.fxml"));
            tab.setContent(loader.load());
            FPTabController controller = loader.getController();
            controller.initProjectData(data);
            treeView.getRoot().getChildren().add(new TreeItem<>(name));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * create from main menu
     */
    @FXML
    private void loadTab(){
         try {             
            Context.getInstance().setMenuTab(Boolean.TRUE);
            String name = "Function Points - " +  promptForName();
            Tab tab = new Tab(name);
            tabPane.getTabs().add(tab);
            openFPTabs.put(name, tab);
            tab.setOnClosed(e -> openFPTabs.remove(name));
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("FPTab.fxml"));
            tab.setContent(loader.load());
            FPTabController controller = loader.getController();
            controller.setName(name);
            treeView.getRoot().getChildren().add(new TreeItem<>(name));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void exit() {       
        Window window = gridPane.getScene().getWindow();
        window.fireEvent(new WindowEvent(window, WindowEvent.WINDOW_CLOSE_REQUEST));
    }

    @FXML
    void popup(Event event) throws IOException{
            
        VBox vbox = FXMLLoader.load(getClass().getResource("LanguageWindow.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(vbox);
        stage.setScene(scene);
        stage.show();
    }
    
    /**
     * Opens new project window
     * Data is saved from NewProjectController btnOk
     * @param event         None
     */
    @FXML
    public void newProject(Event event){
        try {
            VBox vbox = FXMLLoader.load(getClass().getResource("NewProject.fxml"));            
            Stage stage = new Stage();
            Scene scene = new Scene(vbox);
            stage.setScene(scene);
            stage.setTitle("New Project");
            stage.show();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
   
    /**
     * Saves project
     * 
     * Currently: still need:
     *            reference language
     *            weighting factors
     *             input total
     *            computed fp
     * 
     *            And select file to save to 
     *            right now it saves to a predefined file in the local folder 
     * 
     * @param event             None
     */
    @FXML
    public void saveProject(Event event){
       
        //chose file name..ect
        //save to gson before writing
        Gson gson = FxGson.create();//new Gson();
        String dataString = gson.toJson(Context.getInstance().getProjectObject(), ProjectObject.class );        
        try{
                File file = new File("temp1" +".ms");
                Writer writer = new BufferedWriter(new FileWriter(file));
                writer.write(dataString);
                writer.flush();            
                System.out.println("Fin Saved");
                System.out.println("Number of tabs: " +Context.getInstance().getProjectObject().projData.size());
                Context.getInstance().setSaved(true);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }      
        
    }
    /**
     * Load project from selected file
     * 
     * @param event         None
     */
    @FXML
    public void openFile(ActionEvent event){      
        
        Context.getInstance().resetIncr();
        //get file from file chooser
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Project");

        //extension filter
        FileChooser.ExtensionFilter extentionFilter = new FileChooser.ExtensionFilter("ms files (*.ms)", "*.ms");
        fileChooser.getExtensionFilters().add(extentionFilter);        
        File selectedFile = fileChooser.showOpenDialog(null);        

        if(selectedFile != null){
            System.out.println(selectedFile.toString());
            Gson gson = FxGson.create();
            ProjectObject projFile;
            
            try {
                Context.getInstance().setMenuBarName("CECS 543 Metrics Suite");
                projFile = gson.fromJson(new FileReader(selectedFile.toString()), ProjectObject.class);
                Context.getInstance().setProjectObject(projFile);
                System.out.println("context: " +Context.getInstance().getProjectObject().projData.size());
                int size = Context.getInstance().getProjectObject().projData.size();
                Context.getInstance().setMenuBarName("CECS 543 Metrics Suite - " + projFile.projectName);
                
                closeTabs();
                metricsMenu(false); //metrics option available
                //open smi tab first
                openSMI();
                //populate new tabs if any
                for(int i =0; i<size; i++){
                    addTab(projFile.projData.get(i));
                }
                Context.getInstance().setSaved(true);
            System.out.println("End of load size data: " +Context.getInstance().getProjectObject().productName);
            //System.out.println("Context size at the end of open: " +Context.getInstance().getProjectObject().projData.size());
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
        }else{
            System.out.println("nothing");
        }
    }
    
    @FXML
    public void addCode(ActionEvent event){      
        
        
        //get file from file chooser
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Files");

        //extension filter
        FileChooser.ExtensionFilter extentionFilter = new FileChooser.ExtensionFilter("java files (*.java)", "*.java");
        fileChooser.getExtensionFilters().add(extentionFilter);        
        List<File> selectedFile = fileChooser.showOpenMultipleDialog(null);//.showOpenDialog(null);        
        
        if(selectedFile != null){
            for(int i=0; i!=selectedFile.size(); i++){
                ProjectCode projCode = new ProjectCode(selectedFile.get(i).toString(), 
                        selectedFile.get(i).getName());
                System.out.println(selectedFile.get(i).toString());
                System.out.println(selectedFile.get(i).getName());
                Context.getInstance().getProjectObject().projCode.add(projCode);
                treeView.getRoot().getChildren().add(new TreeItem<>(projCode.getName()));
            }
        }
    }
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         //
        Context.getInstance().setMenuBarName("CECS 543 Metrics Suite");
        Context.getInstance().menuBarNameProperty().addListener((observable, oldValue, newValue) -> {
            Stage stage = (Stage) gridPane.getScene().getWindow();
            stage.setTitle(newValue);
            
            closeTabs();
            tabPane = new TabPane();
            rightPane.getChildren().add(tabPane);
            tabPane.prefHeightProperty().bind(rightPane.heightProperty());
            tabPane.prefWidthProperty().bind(rightPane.widthProperty());
            metricsMenu(false); //enable metrics menu
            openSMI();
            initializeTreeView();
        });
    }


    private void initializeTreeView() {
        TreeItem<String> rootNode = new TreeItem<>(Context.getInstance().getProjectObject().projectName);
        rootNode.setExpanded(true);
        rootNode.getChildren().add(new TreeItem<>("SMI"));
        for (ProjectCode code : Context.getInstance().getProjectObject().projCode) {
            TreeItem<String> codeLeaf = new TreeItem<>(code.getName());
            rootNode.getChildren().add(codeLeaf);
        }
        treeView = new TreeView<>(rootNode);
        treeView.setCellFactory(param -> new TextFieldTreeCellImpl(this));
        treeView.prefHeightProperty().bind(leftPane.heightProperty());
        treeView.prefWidthProperty().bind(leftPane.widthProperty());
        leftPane.getChildren().add(treeView);
    }
    
    public void closeTabs(){
        System.out.println("about to try close tabs...");
                if(tabPane!=null){
                    System.out.println("closing some open tabs :) .....");
                    System.out.println(tabPane.getTabs().size());
                    tabPane.getTabs().clear();
                }else{
                    System.out.println("NO tabs to close ...");
                }
    }
    
    public void openSMI(){
        try {
                Tab tab = new Tab("SMI");
                smiTab = tab;
                tab.setOnClosed(e -> smiTab = null);
                tabPane.getTabs().add(tab);
                tab.setContent(FXMLLoader.load(this.getClass().getResource("SMITab.fxml")));
            } catch (IOException e) {
                e.printStackTrace();
            }
    }


    public String promptForName() {
        TextInputDialog dialog = new TextInputDialog();

        dialog.setTitle("Function Points");
        dialog.setHeaderText("Enter a name for this tab:");
        dialog.setContentText("Name:");

        Optional<String> result = dialog.showAndWait();
        return result.get();
    }

    public boolean shutdown() {
        if (!Context.getInstance().isSaved()) {
            Alert closeConfirmation = new Alert(
                    Alert.AlertType.CONFIRMATION,
                    "You have unsaved changes. Are you sure you wish to exit?"
            );
            Button exitButton = (Button) closeConfirmation.getDialogPane().lookupButton(ButtonType.OK);
            exitButton.setText("Exit");
            closeConfirmation.setHeaderText("Confirm Exit");
            closeConfirmation.initModality(Modality.APPLICATION_MODAL);
            Optional<ButtonType> closeResponse = closeConfirmation.showAndWait();
            return ButtonType.OK.equals(closeResponse.get());
        }
        return true;
    }

    public void openTab(String tabName) {
        // Bad string manipulation I know, probably need to change this all later
        System.out.println(tabName);
        if (openFPTabs.containsKey(tabName) || openCodeTabs.contains(tabName)){
            return;
        }
        if (tabName.startsWith("Function Points -")) {
            String name = tabName.substring(18);
            System.out.println(name);
            ProjectData data = Context.getInstance().getProjectataByName(name);
            if (data != null) {
                System.out.println(data.getName());
                addTab(data);
            }
            return;
        } else if (tabName.endsWith(".java")) {
            System.out.println("HELLLO?");
        } else if (tabName.equals("SMI") && smiTab == null) {
            openSMI();
        }
    }

    public void closeOpenTab(String tabName) {
        Tab tab = null;
        if (tabName.equals("SMI")) {
            tab = smiTab;
        } else if (tabName.startsWith("Function Points -")) {
            tab = openFPTabs.get(tabName);
        }
        if (tab == null) {
            return;
        }
        EventHandler<Event> handler = tab.getOnClosed();
        if (null != handler) {
            handler.handle(null);
        }
        tabPane.getTabs().remove(tab);
    }

    public void deleteTab(String tabName) {
        if (tabName.equals("SMI")) {
            return;
        }
        Alert deleteConfirmation = new Alert(
                Alert.AlertType.CONFIRMATION,
                "Are you sure you wish to delete this file?"
        );
        Button deleteButton = (Button) deleteConfirmation.getDialogPane().lookupButton(ButtonType.OK);
        deleteButton.setText("Delete");
        deleteConfirmation.setHeaderText("Confirm Delete");
        Optional<ButtonType> deleteResponse = deleteConfirmation.showAndWait();
        if(ButtonType.OK.equals(deleteResponse.get())) {
            System.out.println("DELETE");
        }
    }
}
