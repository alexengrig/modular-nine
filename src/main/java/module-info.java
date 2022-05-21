import dev.alexengrig.sample.modularnine.greeting.Greeting;

module modular.nine.parent {
    requires modular.nine.greeting;
    uses Greeting;
}
