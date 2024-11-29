import java.util.UUID;

public final class Karlson extends Person implements Flyable{
    public Karlson(String mood, String location) {
        this.name = "Карлсон";
        this.mood = EmotionalState.valueOf(mood);
        this.location = Location.valueOf(location);
    }

    @Override
    public String toString() {
        return "Карлсон";
    }

    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Karlson that = (Karlson) o;

        return this.hashcode() == that.hashcode();
    }

    public void fly(){
        System.out.println(this+" улетел");
    }
}
