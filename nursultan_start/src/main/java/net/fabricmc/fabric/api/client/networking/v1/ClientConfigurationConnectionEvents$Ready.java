/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01874
 *  minecraft.class06202
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.networking.v1;

import minecraft.class01874;
import minecraft.class06202;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Deprecated
@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface ClientConfigurationConnectionEvents$Ready {
    public void onConfigurationReady(class01874 var1, class06202 var2);
}

