/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package net.irisshaders.iris.pathways.colorspace;

import minecraft.class00392;

public enum ColorSpace {
    SRGB("SRGB"),
    DCI_P3("DCI_P3"),
    DISPLAY_P3("DISPLAY_P3"),
    REC2020("REC2020"),
    ADOBE_RGB("ADOBE_RGB");

    private final String name;

    private ColorSpace(String string2) {
        this.name = string2;
    }

    public class00392 getName() {
        return class00392.y((String)this.name);
    }
}

