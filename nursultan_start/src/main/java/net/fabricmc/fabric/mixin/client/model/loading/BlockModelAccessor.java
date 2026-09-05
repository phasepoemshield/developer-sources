/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  minecraft.class04237
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.mixin.client.model.loading;

import com.google.gson.Gson;
import minecraft.class04237;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public interface BlockModelAccessor {
    public static /* synthetic */ Gson fabric_getGson() {
        return class04237.N();
    }
}

