
package utils;


import javafx.beans.binding.Bindings;
import javafx.beans.binding.NumberBinding;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class SMI {
    private final SimpleIntegerProperty modulesAdded;
    private final SimpleIntegerProperty modulesChanged;
    private final SimpleIntegerProperty modulesDeleted;
    private final SimpleDoubleProperty SMI;
    private final SimpleDoubleProperty total;
    private final SimpleDoubleProperty previousTotal;

    public SMI(double previousTotal) {
        this.previousTotal = new SimpleDoubleProperty(previousTotal);
        this.modulesAdded = new SimpleIntegerProperty(0);
        this.modulesChanged = new SimpleIntegerProperty(0);
        this.modulesDeleted = new SimpleIntegerProperty(0);
        this.SMI = new SimpleDoubleProperty();
        this.total = new SimpleDoubleProperty();
        NumberBinding add = Bindings.add(this.modulesAdded, this.previousTotal);
        NumberBinding minus = Bindings.subtract(add, this.modulesDeleted);
        this.totalProperty().bind(minus);
        NumberBinding addDelete = Bindings.add(this.modulesAdded, this.modulesDeleted);
        NumberBinding changedAddDelete = Bindings.add(this.modulesChanged, addDelete);
        NumberBinding minusTotal = Bindings.subtract(this.total, changedAddDelete);
        NumberBinding SMIFinal = Bindings.divide(minusTotal, this.total);
        this.SMIProperty().bind(SMIFinal);
    }

    public double getPreviousTotal() {
        return previousTotal.get();
    }

    public SimpleDoubleProperty previousTotalProperty() {
        return previousTotal;
    }

    public void setPreviousTotal(double previousTotal) {
        this.previousTotal.set(previousTotal);
    }

    public int getModulesAdded() {
        return modulesAdded.get();
    }

    public SimpleIntegerProperty modulesAddedProperty() {
        return modulesAdded;
    }

    public int getModulesChanged() {
        return modulesChanged.get();
    }

    public SimpleIntegerProperty modulesChangedProperty() {
        return modulesChanged;
    }

    public int getModulesDeleted() {
        return modulesDeleted.get();
    }

    public SimpleIntegerProperty modulesDeletedProperty() {
        return modulesDeleted;
    }

    public void setModulesAdded(int modulesAdded) {
        this.modulesAdded.set(modulesAdded);
    }

    public void setModulesChanged(int modulesChanged) {
        this.modulesChanged.set(modulesChanged);
    }

    public void setModulesDeleted(int modulesDeleted) {
        this.modulesDeleted.set(modulesDeleted);
    }

    public double getSMI() {
        return SMI.get();
    }

    public SimpleDoubleProperty SMIProperty() {
        return SMI;
    }

    public void setSMI(float SMI) {
        this.SMI.set(SMI);
    }

    public double getTotal() {
        return total.get();
    }

    public SimpleDoubleProperty totalProperty() {
        return total;
    }

    public void setTotal(int total) {
        this.total.set(total);
    }
}
