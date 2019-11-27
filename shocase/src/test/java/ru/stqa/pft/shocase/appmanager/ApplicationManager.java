package ru.stqa.pft.shocase.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.safari.SafariDriver;
import ru.stqa.pft.shocase.pages.MainPage;
import ru.stqa.pft.shocase.pages.ProfilePage;
import ru.stqa.pft.shocase.pages.SignUpPage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.remote.BrowserType.FIREFOX;

public class ApplicationManager {
    public WebDriver driver;
    private Map<String, Object> vars;
    private String browser;
    private SignUpPage signUpPage;
    private MainPage mainPage;
    private ProfilePage profilePage;


    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {
        if (browser.equals(FIREFOX)) {
            driver = new FirefoxDriver();
        } else if (browser.equals(BrowserType.CHROME)) {
            driver = new ChromeDriver();
        } else if (browser.equals(BrowserType.IE)) {
            driver = new InternetExplorerDriver();
        }
        else if (browser.equals(BrowserType.SAFARI)) {
            driver = new SafariDriver();
        }

        vars = new HashMap<String, Object>();
        driver.manage().timeouts().pageLoadTimeout(30000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
        signUpPage = new SignUpPage(driver);
        mainPage = new MainPage(driver);
        profilePage = new ProfilePage(driver);


    }

    public void stop() {
        driver.quit();
    }

    public SignUpPage signUpPage() {
        return signUpPage;
    }

    public MainPage mainPage() {
        return mainPage;
    }

    public ProfilePage profilePage() {
        return profilePage;
    }


}
