
package utils;



public class SMI {
    private int modulesAdded;
    private int modulesChanged;
    private int modulesDeleted;

    public SMI(int modulesAdded, int modulesChanged, int modulesDeleted) {
        this.modulesAdded = modulesAdded;
        this.modulesChanged = modulesChanged;
        this.modulesDeleted = modulesDeleted;
    }

    public int getModulesAdded() {
        return modulesAdded;
    }

    public void setModulesAdded(int modulesAdded) {
        this.modulesAdded = modulesAdded;
    }

    public int getModulesChanged() {
        return modulesChanged;
    }

    public void setModulesChanged(int modulesChanged) {
        this.modulesChanged = modulesChanged;
    }

    public int getModulesDeleted() {
        return modulesDeleted;
    }

    public void setModulesDeleted(int modulesDeleted) {
        this.modulesDeleted = modulesDeleted;
    }
    
    
}
