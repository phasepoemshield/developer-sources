/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01089
 *  minecraft.class08918
 */
package net.irisshaders.iris.pbr.loader;

import minecraft.class01089;
import minecraft.class08918;
import net.irisshaders.iris.pbr.loader.PBRTextureLoader$PBRTextureConsumer;

public interface PBRTextureLoader<T extends class08918> {
    public void load(T var1, class01089 var2, PBRTextureLoader$PBRTextureConsumer var3);
}

