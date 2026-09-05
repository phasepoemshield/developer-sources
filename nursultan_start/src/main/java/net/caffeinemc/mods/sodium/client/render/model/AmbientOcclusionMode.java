/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02584
 */
package net.caffeinemc.mods.sodium.client.render.model;

import minecraft.class02584;

public enum AmbientOcclusionMode {
    ENABLED,
    DEFAULT,
    DISABLED;

    private static final class02584[] TRISTATES;

    static {
        TRISTATES = new class02584[]{class02584.field_52394, class02584.field_52396, class02584.field_52395};
    }

    public class02584 toTriState() {
        return TRISTATES[this.ordinal()];
    }
}

