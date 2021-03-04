package m06.s15;

public abstract class Pet {
    private String name;

    protected Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void saySomething();
}