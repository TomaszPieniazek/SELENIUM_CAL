package TestSuits;

import Steps.CheckboxPageSteps;
import Steps.RadioButtonPageSteps;
import Steps.SimpleDemoPageSteps;
import org.jbehave.core.embedder.Embedder;
import java.util.Arrays;
import java.util.List;

public class SimpleTestTwo {

    private static Embedder embedder = new Embedder();
    private static List<String> storyPaths = Arrays
            .asList("RadioButtonPage.story");

    public static void main(String[] args) {
        embedder.candidateSteps().add(new CheckboxPageSteps());
        embedder.candidateSteps().add(new RadioButtonPageSteps());
        embedder.candidateSteps().add(new SimpleDemoPageSteps());

        embedder.runStoriesAsPaths(storyPaths);
    }
}