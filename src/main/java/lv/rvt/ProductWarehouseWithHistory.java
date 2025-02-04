package lv.rvt;

public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory history;


    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.history = new ChangeHistory();
        this.history.add(initialBalance);
    }


    public String history(){
        return this.history.toString();
    }

    @Override
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        this.history.add(getBalance());
    }


    @Override
    public double takeFromWarehouse(double amount){
        double taken = super.takeFromWarehouse(amount);
        this.history.add(super.getBalance());
        return taken;


    }
}
