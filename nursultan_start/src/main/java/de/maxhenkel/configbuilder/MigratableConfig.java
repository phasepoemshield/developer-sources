/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.configbuilder.Config
 *  javax.annotation.Nullable
 */
package de.maxhenkel.configbuilder;

import de.maxhenkel.configbuilder.Config;
import javax.annotation.Nullable;

public interface MigratableConfig
extends Config {
    @Nullable
    public String get(String var1);

    public boolean has(String var1);

    public void set(String var1, String var2);
}

