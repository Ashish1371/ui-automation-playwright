package stepDefinitions;

import com.microsoft.playwright.*;
import helpers.BrowserFactory;
import helpers.PropertyReader;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.testng.annotations.BeforeTest;

import java.util.Arrays;

public class BaseTest {
    public static Page page;
    private BrowserFactory factory = new BrowserFactory();

    @Before
    public void Initialize() throws Exception {
        page = factory.initializeBrowser("chrome", false);
        page.navigate(PropertyReader.getConfig("url"));
    }
}
