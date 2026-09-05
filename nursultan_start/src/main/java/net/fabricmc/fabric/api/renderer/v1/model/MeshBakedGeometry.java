/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08496
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.renderer.v1.model;

import java.util.List;
import minecraft.class08496;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.Mesh;

@Environment(value=EnvType.CLIENT)
public final class MeshBakedGeometry
extends class08496 {
    private final Mesh mesh;

    public MeshBakedGeometry(Mesh mesh) {
        super(List.of(), List.of(), List.of(), List.of(), List.of(), List.of(), List.of(), List.of());
        this.mesh = mesh;
    }

    public Mesh getMesh() {
        return this.mesh;
    }
}

