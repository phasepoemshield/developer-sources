/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.Iris
 */
package net.irisshaders.iris.shaderpack.properties;

import net.irisshaders.iris.Iris;

public enum ParticleRenderingSettings {
    UNSET,
    BEFORE,
    MIXED,
    AFTER;


    public static ParticleRenderingSettings fromString(String string) {
        try {
            return ParticleRenderingSettings.valueOf(string);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            Iris.logger.error("Invalid particle rendering settings! " + string);
            return UNSET;
        }
    }
}

