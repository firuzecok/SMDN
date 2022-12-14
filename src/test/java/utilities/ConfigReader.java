package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
   public static Properties properties;

    static{
        String dosyaYolu="confıguration.properties";
        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            // fis dosyayolunu tanimladigimiz configuration.properties dosyasini okudu

            properties = new Properties();
            properties.load(fis); //fis in okudugu bilgileri properties e yukledi


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String key){

        /*
        test methodundan yolladigimiz string key degerlerini alip
        Properties class'indan getProperty( ) method'unu kullanarak
        bu key'e ait value'u bize getirdi
         */
        return properties.getProperty(key);
    }
}
