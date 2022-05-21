package dev.alexengrig.sample.modularnine.greeting.hidden;

import dev.alexengrig.sample.modularnine.greeting.Greeting;

public class HiddenGreeting implements Greeting {
    @Override
    public void greet() {
        System.out.println("Hello...");
    }
}
