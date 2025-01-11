package helpers;

import com.microsoft.playwright.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

public class BrowserFactory {

    ThreadLocal<Playwright> playwright = new ThreadLocal<Playwright>();
    ThreadLocal<Browser> browser = new ThreadLocal<Browser>();


    public Page initializeBrowser(String browserName, boolean headless) throws IllegalArgumentException {
        boolean isHeadless = headless;

        playwright.set(Playwright.create());

        switch (browserName.toLowerCase()) {
            case "chromium":
                browser.set(playwright.get().chromium().launch(new BrowserType.LaunchOptions().setArgs(Arrays.asList("--start-maximized")).setHeadless(isHeadless)));
                break;
            case "chrome":
                browser.set(playwright.get().chromium().launch(new BrowserType.LaunchOptions().setArgs(Arrays.asList("--start-maximized")).setChannel("chrome").setHeadless(isHeadless)));
                break;
            case "firefox":
                browser.set(playwright.get().firefox().launch(new BrowserType.LaunchOptions().setArgs(Arrays.asList("--start-maximized")).setHeadless(isHeadless)));
                break;
            case "webkit":
                browser.set(playwright.get().webkit().launch(new BrowserType.LaunchOptions().setArgs(Arrays.asList("--start-maximized")).setHeadless(isHeadless)));
                break;
            default:
                throw new IllegalArgumentException("Please provide a valid browser name (chrome, firefox, webkit or chromium).");
        }

        BrowserContext browserContext = browser.get().newContext(new Browser.NewContextOptions()
                .setViewportSize(null));
        return browserContext.newPage();
    }
}