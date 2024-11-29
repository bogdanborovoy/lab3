import java.util.UUID;

public abstract class Person {
    Location location;
    EmotionalState mood;
    String name;
    @Override
    public String toString() {
        return "Человек";
    }
    public UUID hashcode(){
        return UUID.randomUUID();
    }
    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person that = (Person) o;

        return this.hashcode() == that.hashcode();
    }
    public void lie(HouseObjects obj){
        System.out.println(this+" лёг на "+obj);
    }
}
