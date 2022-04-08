package config;

import org.aeonbits.owner.ConfigFactory;

public class Project {

    public static WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

    public static String browserName() {
        return config.browserName();
    }

    public static boolean isRemoteWebDriver() {
        return !config.remoteUrl().equals("");
    }

    public static boolean isVideoOn() {
        return !config.videoStorage().equals("");
    }

}
