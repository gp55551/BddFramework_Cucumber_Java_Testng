package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverManager;
import utils.ConfigReader;

public class Hooks {

    @Before
    public void setup() {
        ConfigReader.loadConfig();
        DriverManager.initDriver();
        DriverManager.getDriver().get(ConfigReader.getProperty("baseUrl"));
    }

    @After
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
