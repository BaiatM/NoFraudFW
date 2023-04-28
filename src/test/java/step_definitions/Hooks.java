package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ConfigReader;
import utils.DriverUtils;


public class Hooks {
    @Before
    public void setUp() {
        ConfigReader.initializeProperties();
        DriverUtils.createDriver();
    }

    @After
    public void cleanUp() {
        DriverUtils.quitDriver();
    }
}