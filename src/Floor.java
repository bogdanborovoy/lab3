import java.util.UUID;

public final class Floor extends HouseObjects{
    @Override
    public String toString() {
        return "пол";
    }

    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Floor that = (Floor) o;

        return this.hashcode() == that.hashcode();
    }
}
