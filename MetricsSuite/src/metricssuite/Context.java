package metricssuite;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import utils.ProjectData;
import utils.ProjectObject;

import java.util.HashMap;
import java.util.Map;

public class Context {
    public String getMenuBarName() {
        return menuBarName.get();
    }

    public StringProperty menuBarNameProperty() {
        return menuBarName;
    }

    public void setMenuBarName(String menuBarName) {
        this.menuBarName.set(menuBarName);
    }

    private boolean saved = true;
    private final StringProperty menuBarName = new SimpleStringProperty();
    private final static Map<String, Integer> languageCodeSize;

    static {
        languageCodeSize = new HashMap<>();
        languageCodeSize.put("Assembler", 209);
        languageCodeSize.put("Ada 95", 154);
        languageCodeSize.put("C", 148);
        languageCodeSize.put("C++", 59);
        languageCodeSize.put("C#", 58);
        languageCodeSize.put("COBOL", 80);
        languageCodeSize.put("FORTRAN", 90);
        languageCodeSize.put("HTML", 43);
        languageCodeSize.put("Java", 55);
        languageCodeSize.put("JavaScript", 54);
        languageCodeSize.put("VBScript", 38);
        languageCodeSize.put("Visual Basic", 50);
        languageCodeSize.put("None", 0);
    }

    private final static Context instance = new Context();

    public boolean isSaved() {
        return saved;
    }

    public void setSaved(boolean saved) {
        this.saved = saved;
    }

    private String path = "";

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public static Context getInstance() {
        return instance;
    }

    public String getDefaultLanguage() {
        return obj.getLanguage();
    }

    public void setDefaultLanguage(String newLanguage) {
        obj.setLanguage(newLanguage);
        setSaved(false);
    }

    private ProjectObject obj;// = new ProjectObject();

    public ProjectObject getProjectObject() {
        return obj;
    }

    public void setProjectObject(ProjectObject newObj) {
        obj = newObj;
        setSaved(false);
    }

    public ProjectData createNewData(String name) {
        return obj.createNewData(name);
    }

    public int getCodeRatio(String language) {
        return languageCodeSize.get(language);
    }

    public ProjectData getProjectDataByName(String name) {
        return obj.getDataByName(name);
    }
}
