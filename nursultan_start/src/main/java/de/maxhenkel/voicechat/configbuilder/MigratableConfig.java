/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.configbuilder;

import de.maxhenkel.voicechat.configbuilder.Config;
import javax.annotation.Nullable;

public interface MigratableConfig
extends Config {
    public boolean has(String var1);

    @Nullable
    public String get(String var1);

    public void set(String var1, String var2);
}

