package com.amazon.Runners;



import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/busqueda.feature",
        glue = "com.amazon.StepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class BusquedaRunner {
}
