/*
 * Decompiled with CFR 0.152.
 */
package com.viaversion.viaversion.libs.snakeyaml.util;

public class PlatformFeatureDetector {
    private Boolean isRunningOnAndroid = null;

    public boolean isIntrospectionAvailable() {
        if (this.isRunningOnAndroid()) {
            return false;
        }
        try {
            Class.forName("java.beans.Introspector");
            return true;
        }
        catch (ClassNotFoundException ex) {
            return false;
        }
    }

    public boolean isRunningOnAndroid() {
        if (this.isRunningOnAndroid == null) {
            String name = System.getProperty("java.runtime.name");
            this.isRunningOnAndroid = name != null && name.startsWith("Android Runtime");
        }
        return this.isRunningOnAndroid;
    }
}

