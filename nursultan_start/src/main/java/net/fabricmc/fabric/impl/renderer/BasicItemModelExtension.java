/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02601
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.Mesh
 */
package net.fabricmc.fabric.impl.renderer;

import minecraft.class02601;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.Mesh;

@Environment(value=EnvType.CLIENT)
public interface BasicItemModelExtension {
    public void fabric_setMesh(Mesh var1, class02601 var2);
}

