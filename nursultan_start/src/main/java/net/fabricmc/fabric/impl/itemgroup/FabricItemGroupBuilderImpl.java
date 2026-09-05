/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class06911
 *  minecraft.class06921
 */
package net.fabricmc.fabric.impl.itemgroup;

import minecraft.class00392;
import minecraft.class06911;
import minecraft.class06921;

public final class FabricItemGroupBuilderImpl
extends class06921 {
    private boolean hasDisplayName = false;

    public FabricItemGroupBuilderImpl() {
        super(null, -1);
    }

    public class06911 method_47324() {
        if (!this.hasDisplayName) {
            throw new IllegalStateException("No display name set for ItemGroup");
        }
        return super.method_47324();
    }

    public class06921 method_47321(class00392 class003922) {
        this.hasDisplayName = true;
        return super.method_47321(class003922);
    }
}

