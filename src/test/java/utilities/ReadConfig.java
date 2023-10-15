package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
    Properties pro;

    public ReadConfig() {
        try {
            File src = new File(System.getProperty("user.dir") + "/Configuration/config.properties");
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getURL() {
        String url = pro.getProperty("baseURL");
        return url;
    }

    public String getUsername() {
        String myUsername = pro.getProperty("username");
        return myUsername;
    }

    public String getPassword() {
        String pass = pro.getProperty("password");
        return pass;
    }
}
