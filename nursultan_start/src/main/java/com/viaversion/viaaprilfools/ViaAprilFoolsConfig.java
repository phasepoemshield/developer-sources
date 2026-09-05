/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.util.Config
 */
package com.viaversion.viaaprilfools;

import com.viaversion.viaversion.util.Config;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class ViaAprilFoolsConfig
extends Config
implements com.viaversion.viaaprilfools.platform.ViaAprilFoolsConfig {
    public void reload() {
        super.reload();
        this.loadFields();
    }

    public ViaAprilFoolsConfig(File configFile, Logger logger) {
        super(configFile, logger);
    }

    protected void handleConfig(Map<String, Object> map) {
    }

    private void loadFields() {
    }

    public URL getDefaultConfigURL() {
        return this.getClass().getClassLoader().getResource("assets/viaaprilfools/viaaprilfools.yml");
    }

    public List<String> getUnsupportedOptions() {
        return Collections.emptyList();
    }

    public InputStream getDefaultConfigInputStream() {
        return this.getClass().getClassLoader().getResourceAsStream("assets/viaaprilfools/viaaprilfools.yml");
    }
}

