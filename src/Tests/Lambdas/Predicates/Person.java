package Tests.Lambdas.Predicates;

public class Person {
    enum Geschlecht{
        MAENNLICH, WEIBLICH, DIVERS;
    }

    private int alter;
    private Geschlecht geschlecht;

    public Person(int alter, Geschlecht geschlecht){
        this.alter = alter;
        this.geschlecht = geschlecht;
    }

    public int getAlter() {
        return alter;
    }

    public Geschlecht getGeschlecht() {
        return geschlecht;
    }
}
