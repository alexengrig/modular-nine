package dev.alexengrig.sample.modularnine;

import dev.alexengrig.sample.modularnine.greeting.Greeting;
import dev.alexengrig.sample.modularnine.greeting.GreetingMain;
import dev.alexengrig.sample.modularnine.greeting.open.OpenGreeting;

import java.lang.reflect.Field;
import java.lang.reflect.InaccessibleObjectException;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        ServiceLoader<Greeting> greetings = ServiceLoader.load(Greeting.class);
        greetings.forEach(Greeting::greet);

        GreetingMain main = new GreetingMain();
        main.greet();
        try {
            Field field = GreetingMain.class.getDeclaredField("name");
            field.setAccessible(true);
            field.set(main, "Hacked Main");
            main.greet();
        } catch (InaccessibleObjectException | NoSuchFieldException | IllegalAccessException e) {
            System.out.println(e.getMessage());
        }

        OpenGreeting open = new OpenGreeting();
        open.greet();
        try {
            Field field = OpenGreeting.class.getDeclaredField("name");
            field.setAccessible(true);
            field.set(open, "Hacked Open");
            open.greet();
        } catch (InaccessibleObjectException | NoSuchFieldException | IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }
}
