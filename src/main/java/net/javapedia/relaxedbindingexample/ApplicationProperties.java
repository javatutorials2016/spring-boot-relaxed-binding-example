package net.javapedia.relaxedbindingexample;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "host")

public class ApplicationProperties {

    private String Name;
    private String PORT;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPORT() {
        return PORT;
    }

    public void setPORT(String PORT) {
        this.PORT = PORT;
    }

    public String getApp_name() {
        return app_name;
    }

    public void setApp_name(String app_name) {
        this.app_name = app_name;
    }

    private String app_name;

    @Override
    public String toString() {
        return "ApplicationProperties{" +
                "Name='" + Name + '\'' +
                ", PORT='" + PORT + '\'' +
                ", app_name='" + app_name + '\'' +
                '}';
    }
}
