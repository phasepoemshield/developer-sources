/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.event.lifecycle.v1;

import minecraft.class03448;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface ClientTickEvents$StartWorldTick {
    public void onStartTick(class03448 var1);
}

