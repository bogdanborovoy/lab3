import java.util.UUID;

public final class Carpet extends HouseObjects{
    @Override
    public String toString() {
        return "ковёр";
    }

    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Carpet that = (Carpet) o;

        return this.hashcode() == that.hashcode();
    }


}
