package lv.rvt;
import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    @Override
    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        if (history.isEmpty()) {
            return 0;
        }
        return Collections.max(history);
    }

    public double minValue() {
        if (history.isEmpty()) {
            return 0;
        }
        return Collections.min(history);
    }

    public double average() {
        if (history.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (double value : history) {
            sum += value;
        }
        return sum / history.size();
    }
}
