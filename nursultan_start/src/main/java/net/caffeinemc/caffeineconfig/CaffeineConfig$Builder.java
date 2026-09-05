/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 */
package net.caffeinemc.caffeineconfig;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Properties;
import net.caffeinemc.caffeineconfig.CaffeineConfig;
import org.slf4j.Logger;

public final class CaffeineConfig$Builder {
    private boolean alreadyBuilt = false;
    private String infoUrl;
    private String jsonKey;
    final /* synthetic */ CaffeineConfig this$0;

    CaffeineConfig$Builder(CaffeineConfig caffeineConfig) {
        this.this$0 = caffeineConfig;
    }

    public CaffeineConfig build(Path path) {
        if (this.alreadyBuilt) {
            throw new IllegalStateException("Cannot build a CaffeineConfig twice from the same builder");
        }
        this.this$0.applyOverrideableChecks();
        if (Files.exists(path, new LinkOption[0])) {
            Properties properties = new Properties();
            try (InputStream inputStream = Files.newInputStream(path, new OpenOption[0]);){
                properties.load(inputStream);
            }
            catch (IOException iOException) {
                throw new RuntimeException("Could not load config file", iOException);
            }
            this.this$0.readProperties(properties);
        } else {
            try {
                CaffeineConfig.writeDefaultConfig(path, this.this$0.modName, this.infoUrl);
            }
            catch (IOException iOException) {
                this.this$0.logger.warn("Could not write default configuration file", (Throwable)iOException);
            }
        }
        CaffeineConfig.PLATFORM.applyModOverrides(this.this$0, this.jsonKey);
        while (this.this$0.applyDependencies()) {
        }
        this.this$0.applyChildOptionsStateChecks();
        this.alreadyBuilt = true;
        return this.this$0;
    }

    public CaffeineConfig$Builder addOptionDependency(String string, String string2, boolean bl) {
        this.this$0.addOptionDependency(string, string2, bl);
        return this;
    }

    public CaffeineConfig$Builder withLogger(Logger logger) {
        this.this$0.logger = logger;
        return this;
    }

    public CaffeineConfig$Builder addMixinOption(String string, boolean bl, boolean bl2) {
        this.this$0.addMixinOption(string, bl, bl2);
        return this;
    }

    public CaffeineConfig$Builder addMixinOption(String string, boolean bl) {
        this.this$0.addMixinOption(string, bl);
        return this;
    }

    public CaffeineConfig$Builder withSettingsKey(String string) {
        this.jsonKey = string;
        return this;
    }

    public CaffeineConfig$Builder withInfoUrl(String string) {
        this.infoUrl = string;
        return this;
    }
}

