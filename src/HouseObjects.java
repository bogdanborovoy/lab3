import java.util.UUID;

public class HouseObjects {
    Location location = Location.HOUSE;
    @Override
    public String toString() {
        return "Объекты в доме";
    }
    public UUID hashcode(){
        return UUID.randomUUID();
    }
    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HouseObjects that = (HouseObjects) o;

        return this.hashcode() == that.hashcode();
    }
}
