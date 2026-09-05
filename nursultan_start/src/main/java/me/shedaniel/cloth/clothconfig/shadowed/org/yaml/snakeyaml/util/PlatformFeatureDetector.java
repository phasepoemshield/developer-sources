/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.util;

public class PlatformFeatureDetector {
    private Boolean isRunningOnAndroid = null;

    public boolean isRunningOnAndroid() {
        if (this.isRunningOnAndroid == null) {
            String string = System.getProperty("java.runtime.name");
            this.isRunningOnAndroid = string != null && string.startsWith("Android Runtime");
        }
        return this.isRunningOnAndroid;
    }
}

