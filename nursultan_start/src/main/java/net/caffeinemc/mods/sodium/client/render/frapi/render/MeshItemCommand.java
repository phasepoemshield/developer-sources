/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01423
 *  minecraft.class02022
 *  minecraft.class03662
 *  minecraft.class07311
 *  minecraft.class08915
 *  net.fabricmc.fabric.api.renderer.v1.mesh.MeshView
 *  net.fabricmc.fabric.api.renderer.v1.render.ItemRenderTypeGetter
 */
package net.caffeinemc.mods.sodium.client.render.frapi.render;

import java.util.List;
import minecraft.class01423;
import minecraft.class02022;
import minecraft.class03662;
import minecraft.class07311;
import minecraft.class08915;
import net.fabricmc.fabric.api.renderer.v1.mesh.MeshView;
import net.fabricmc.fabric.api.renderer.v1.render.ItemRenderTypeGetter;

public record MeshItemCommand(class01423 positionMatrix, class03662 displayContext, int lightCoords, int overlayCoords, int outlineColor, int[] tintLayers, List<class02022> quads, class07311 renderType, class08915 glintType, MeshView mesh, ItemRenderTypeGetter renderTypeGetter) {
}

