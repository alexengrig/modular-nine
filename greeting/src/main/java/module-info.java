import dev.alexengrig.sample.modularnine.greeting.Greeting;
import dev.alexengrig.sample.modularnine.greeting.hidden.HiddenGreeting;

module modular.nine.greeting {
    exports dev.alexengrig.sample.modularnine.greeting;
    exports dev.alexengrig.sample.modularnine.greeting.open;

    opens dev.alexengrig.sample.modularnine.greeting.open;

    provides Greeting with HiddenGreeting;
}