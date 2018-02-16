package metricssuite;

import utils.ProjectData;
import utils.ProjectObject;

public class Context {
    private final static Context instance = new Context();
    private String defaultLanguage = "Java";
    
    private String path= "";

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
        return defaultLanguage;
    }

    public void setDefaultLanguage(String newLanguage) {
        defaultLanguage = newLanguage;
    }
    
    private ProjectObject obj = new ProjectObject();
    
    public ProjectObject getProjectObject(){
        return obj;
    }

    public void setProjectObject(ProjectObject newObj) {
        obj = newObj;
    }

    public int createNewData() {
        return obj.createNewData();
    }
    
}
