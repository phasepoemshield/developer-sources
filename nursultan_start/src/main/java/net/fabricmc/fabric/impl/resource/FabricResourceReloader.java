/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01081
 *  minecraft.class01894
 */
package net.fabricmc.fabric.impl.resource;

import minecraft.class01081;
import minecraft.class01894;

public interface FabricResourceReloader
extends class01081 {
    public class01894 fabric$getId();

    default public String method_22322() {
        return String.valueOf(this.fabric$getId()) + " (" + this.getClass().getSimpleName() + ")";
    }
}

