package helpers;

import java.io.FileReader;
import java.util.Properties;

public class PropertyReader {

    public static String getConfig(String config) throws Exception {
        try {
            Properties property = new Properties();
            FileReader reader = new FileReader(Constants.configProperties);
            property.load(reader);
            return property.getProperty(config);
        } catch (Exception e) {
            throw new Exception("unable to read configuration");
        }
    }


}
