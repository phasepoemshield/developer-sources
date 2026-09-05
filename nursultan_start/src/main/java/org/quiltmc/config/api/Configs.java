/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.impl.util.ConfigsImpl
 */
package org.quiltmc.config.api;

import org.quiltmc.config.api.Config;
import org.quiltmc.config.impl.util.ConfigsImpl;

public final class Configs {
    public static Iterable getAll() {
        return ConfigsImpl.getAll();
    }

    private Configs() {
    }

    public static Config getConfig(String string, String string2) {
        return ConfigsImpl.getConfig((String)string, (String)string2);
    }

    public static Iterable getConfigs(String string) {
        return ConfigsImpl.getConfigs((String)string);
    }
}

