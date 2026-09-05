/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.Mesh
 */
package net.fabricmc.fabric.impl.client.indigo.renderer.mesh;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.Mesh;
import net.fabricmc.fabric.impl.client.indigo.renderer.mesh.MeshViewImpl;

@Environment(value=EnvType.CLIENT)
public class MeshImpl
extends MeshViewImpl
implements Mesh {
    public MeshImpl(int[] nArray) {
        this.data = nArray;
        this.limit = nArray.length;
    }
}

