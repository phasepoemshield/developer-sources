/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05096
 */
package com.terraformersmc.modmenu.api;

import minecraft.class05096;

@FunctionalInterface
public interface ConfigScreenFactory<S extends class05096> {
    public S create(class05096 var1);
}

