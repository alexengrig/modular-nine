package dev.alexengrig.sample.modularnine.greeting.open;

import dev.alexengrig.sample.modularnine.greeting.Greeting;

public class OpenGreeting implements Greeting {
    @SuppressWarnings({"FieldCanBeLocal", "FieldMayBeFinal"})
    private String name = "Open";

    @Override
    public void greet() {
        System.out.println("Hello, " + name + "!");
    }
}
