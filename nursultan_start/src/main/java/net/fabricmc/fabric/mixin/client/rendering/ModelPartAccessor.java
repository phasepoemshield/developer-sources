/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.mixin.client.rendering;

import java.util.function.BiConsumer;
import minecraft.class01686;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public interface ModelPartAccessor {
    public void fabric$callForEachChild(BiConsumer<String, class01686> var1);
}

