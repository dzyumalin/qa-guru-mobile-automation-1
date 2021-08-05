package config;

import org.aeonbits.owner.Config;

import static org.aeonbits.owner.Config.LoadType.MERGE;

@Config.LoadPolicy(MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/remote.properties"
})

public interface MobileConfig extends Config {

    @Key("browserstack.user")
    String getBrowserStackUser();

    @Key("browserstack.key")
    String getBrowserStackKey();

    @Key("browserstack.url")
    String getUrl();

}
