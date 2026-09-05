/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.api.config;

import javax.annotation.Nullable;

public interface ConfigAccessor {
    default public String getString(String string, String string2) {
        String string3 = this.getValue(string);
        if (string3 == null) {
            return string2;
        }
        return string3;
    }

    default public boolean getBoolean(String string, boolean bl) {
        String string2 = this.getValue(string);
        if (string2 == null) {
            return bl;
        }
        return Boolean.parseBoolean(string2);
    }

    default public int getInt(String string, int n) {
        String string2 = this.getValue(string);
        if (string2 == null) {
            return n;
        }
        return Integer.parseInt(string2);
    }

    default public double getDouble(String string, double d) {
        String string2 = this.getValue(string);
        if (string2 == null) {
            return d;
        }
        return Double.parseDouble(string2);
    }

    @Nullable
    public String getValue(String var1);

    public boolean hasKey(String var1);
}

