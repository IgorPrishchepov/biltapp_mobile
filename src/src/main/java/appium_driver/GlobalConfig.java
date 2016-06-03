package appium_driver;

import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by Ihar_Pryshchepau on 6/2/2016.
 */
public class GlobalConfig {

    private static GlobalConfig globalConfig;
    private String driverType;
    private DesiredCapabilities caps;
    private String appPath;

    private GlobalConfig() {
        this.driverType = driverType;
        this.caps = caps;
        this.appPath = appPath;
    }

    public static GlobalConfig getConfig(){
        if (globalConfig == null) {
            globalConfig = new GlobalConfig();
        }
        return globalConfig;
    }

    public void setDriverType(String driverType) {
        this.driverType = driverType;
    }

    public void setCaps(DesiredCapabilities caps) {
        this.caps = caps;
    }

    public String getDriverType() {
        return driverType;
    }

    public DesiredCapabilities getCaps() {
        return caps;
    }

}
