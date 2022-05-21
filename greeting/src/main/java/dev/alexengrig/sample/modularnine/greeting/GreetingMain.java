package dev.alexengrig.sample.modularnine.greeting;

public class GreetingMain implements Greeting {
    public static void main(String[] args) {
        new GreetingMain().greet();
    }

    @SuppressWarnings({"FieldCanBeLocal", "FieldMayBeFinal"})
    private String name = "Main";

    @Override
    public void greet() {
        System.out.println("Hello, " + name + "!");
    }
}