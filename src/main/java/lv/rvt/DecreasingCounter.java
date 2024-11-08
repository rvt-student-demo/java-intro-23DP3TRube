package lv.rvt;

public class DecreasingCounter {
    private int value;
    private int init;   

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
        this.init = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        if(this.value !=0) {
            {this.value -= 1; }
        }
    }

    public void reset(){
        this.value = 0;
    }
    
    public void setInitial(){
        this.value = this.init;
    }
}