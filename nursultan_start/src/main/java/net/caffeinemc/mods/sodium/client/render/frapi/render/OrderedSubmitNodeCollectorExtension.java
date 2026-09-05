/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01421
 *  minecraft.class02022
 *  minecraft.class03662
 *  minecraft.class07311
 *  minecraft.class08915
 *  net.fabricmc.fabric.api.renderer.v1.mesh.MeshView
 *  net.fabricmc.fabric.api.renderer.v1.render.ItemRenderTypeGetter
 */
package net.caffeinemc.mods.sodium.client.render.frapi.render;

import java.util.List;
import minecraft.class01421;
import minecraft.class02022;
import minecraft.class03662;
import minecraft.class07311;
import minecraft.class08915;
import net.fabricmc.fabric.api.renderer.v1.mesh.MeshView;
import net.fabricmc.fabric.api.renderer.v1.render.ItemRenderTypeGetter;

public interface OrderedSubmitNodeCollectorExtension {
    public void fabric_submitItem(class01421 var1, class03662 var2, int var3, int var4, int var5, int[] var6, List<class02022> var7, class07311 var8, class08915 var9, MeshView var10, ItemRenderTypeGetter var11);
}

