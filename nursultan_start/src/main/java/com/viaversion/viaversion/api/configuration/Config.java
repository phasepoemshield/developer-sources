/*
 * Decompiled with CFR 0.152.
 */
package com.viaversion.viaversion.api.configuration;

import java.util.Map;

public interface Config {
    public void reload();

    public void set(String var1, Object var2);

    public void save();

    public Map<String, Object> getValues();
}

