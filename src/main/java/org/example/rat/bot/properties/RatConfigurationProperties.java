package org.example.rat.bot.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

@Getter
@Setter
@ConfigurationProperties(prefix = "rat")
public class RatConfigurationProperties {
    @NestedConfigurationProperty
    private Bot bot;

    @Getter
    @Setter
    public static class Bot {
        private String token;
        private String name;
    }
}
