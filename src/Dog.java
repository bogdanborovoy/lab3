import java.util.UUID;

public abstract class Dog implements Animal{
    Location location;
    EmotionalState mood;
    String name;
    @Override
    public String toString() {
        return "Собака";
    }
    public UUID hashcode(){
        return UUID.randomUUID();
    }
    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog that = (Dog) o;

        return this.hashcode() == that.hashcode();
    }
    public void lie(){};
    public void buryHeadInto(){};
    public void closeEyes(){};
    public void bangTail(){};
    public void yap(){};
    public void jump(){};
}
