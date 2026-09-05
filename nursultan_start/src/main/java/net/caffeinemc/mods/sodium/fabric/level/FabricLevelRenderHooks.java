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
package net.caffeinemc.mods.sodium.fabric.level;

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
import net.caffeinemc.mods.sodium.client.services.PlatformLevelRenderHooks;
import net.caffeinemc.mods.sodium.client.world.LevelSlice;
import org.joml.Matrix4f;

public class FabricLevelRenderHooks
implements PlatformLevelRenderHooks {
    @Override
    public void runChunkMeshAppenders(List<?> list, Function<class08743, class01391> function, LevelSlice levelSlice) {
    }

    @Override
    public List<?> retrieveChunkMeshAppenders(class07299 class072992, class07209 class072092) {
        return List.of();
    }

    @Override
    public void runChunkLayerEvents(class07311 class073112, class07299 class072992, class03063 class030632, Matrix4f matrix4f, Matrix4f matrix4f2, int n, class05363 class053632, class01383 class013832) {
    }
}

