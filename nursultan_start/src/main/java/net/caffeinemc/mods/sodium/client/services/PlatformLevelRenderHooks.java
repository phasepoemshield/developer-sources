/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01383
 *  minecraft.class01391
 *  minecraft.class03063
 *  minecraft.class05363
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07311
 *  minecraft.class08743
 *  org.joml.Matrix4f
 */
package net.caffeinemc.mods.sodium.client.services;

import java.util.List;
import java.util.function.Function;
import minecraft.class01383;
import minecraft.class01391;
import minecraft.class03063;
import minecraft.class05363;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07311;
import minecraft.class08743;
import net.caffeinemc.mods.sodium.client.services.Services;
import net.caffeinemc.mods.sodium.client.world.LevelSlice;
import org.joml.Matrix4f;

public interface PlatformLevelRenderHooks {
    public static final PlatformLevelRenderHooks INSTANCE = Services.load(PlatformLevelRenderHooks.class);

    public static PlatformLevelRenderHooks getInstance() {
        return INSTANCE;
    }

    public void runChunkMeshAppenders(List<?> var1, Function<class08743, class01391> var2, LevelSlice var3);

    public List<?> retrieveChunkMeshAppenders(class07299 var1, class07209 var2);

    public void runChunkLayerEvents(class07311 var1, class07299 var2, class03063 var3, Matrix4f var4, Matrix4f var5, int var6, class05363 var7, class01383 var8);
}

