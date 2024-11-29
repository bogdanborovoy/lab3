public class Main {
    public static void main(String[] args) {
        Karlson karlson = new Karlson("HAPPY", "HOUSE");
        Baby baby = new Baby("HAPPY","HOUSE");
        Bimbo bimbo = new Bimbo("ATTENTIONSEEKING", "HOUSE");

        Floor floor = new Floor();
        Carpet carpet = new Carpet();

        karlson.fly();
        karlson.location = Location.STREET;

        bimbo.lie(floor);
        bimbo.bangTail();

        baby.lie(floor);
        bimbo.jump();
        bimbo.mood = EmotionalState.DELIGHTED;
        bimbo.yap();

        bimbo.buryHeadInto(baby);
        bimbo.closeEyes();
    }
}