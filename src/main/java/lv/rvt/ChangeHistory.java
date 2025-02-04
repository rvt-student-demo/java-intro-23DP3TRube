package lv.rvt;
import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }


    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }


    @Override
    public String toString() {
        return history.toString();
    }
}
