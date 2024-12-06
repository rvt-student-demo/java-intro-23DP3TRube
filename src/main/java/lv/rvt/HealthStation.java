package lv.rvt;

public class HealthStation {

    private int weight;

    public int weigh(Person person) {
        
        return person.getWeight();
         
    }

    public void feed(Person person){
        person.setWeight(person.getWeight() + 1);
    }

}