package br.com.voffice.loja.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {

    static Properties props = null;

    public static Properties getProperties() {
        if (props != null) {
            return props;
        } else {
            InputStream is = null;
            Properties p = null;
            try {
                is = PropertiesUtil.class.getResourceAsStream("/config.properties");
                p = new Properties();
                p.load(is);
            } catch (IOException ex) {
                System.out.println("Erro: ");
                ex.printStackTrace();
            } finally {
                try {
                    if (is != null) {
                        is.close();
                    }
                } catch (IOException ex) {
                    System.out.println("Erro: ");
                    ex.printStackTrace();
                }
            }
            return p;
        }
    }
}
