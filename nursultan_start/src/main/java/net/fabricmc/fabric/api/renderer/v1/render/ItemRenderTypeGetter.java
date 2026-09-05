/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07311
 *  minecraft.class08743
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadAtlas
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.renderer.v1.render;

import minecraft.class07311;
import minecraft.class08743;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadAtlas;
import org.jspecify.annotations.Nullable;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface ItemRenderTypeGetter {
    public @Nullable class07311 renderType(QuadAtlas var1, @Nullable class08743 var2);
}

