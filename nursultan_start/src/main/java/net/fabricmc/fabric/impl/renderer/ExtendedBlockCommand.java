/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01423
 *  minecraft.class07209
 *  minecraft.class07295
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.renderer;

import minecraft.class00500;
import minecraft.class01423;
import minecraft.class07209;
import minecraft.class07295;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public record ExtendedBlockCommand(class01423 matricesEntry, class00500 state, int lightCoords, int overlayCoords, int outlineColor, class07295 blockView, class07209 pos) {
}

