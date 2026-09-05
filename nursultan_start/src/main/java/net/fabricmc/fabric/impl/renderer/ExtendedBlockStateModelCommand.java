/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01423
 *  minecraft.class07209
 *  minecraft.class07295
 *  minecraft.class07311
 *  minecraft.class08743
 *  minecraft.class08887
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.renderer;

import java.util.function.Function;
import minecraft.class00500;
import minecraft.class01423;
import minecraft.class07209;
import minecraft.class07295;
import minecraft.class07311;
import minecraft.class08743;
import minecraft.class08887;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public record ExtendedBlockStateModelCommand(class01423 matricesEntry, Function<class08743, class07311> renderLayerFunction, class08887 model, float r, float g, float b, int lightCoords, int overlayCoords, int outlineColor, class07295 blockView, class07209 pos, class00500 state) {
}

