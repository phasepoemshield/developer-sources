/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  net.fabricmc.fabric.api.renderer.v1.mesh.Mesh
 */
package net.caffeinemc.mods.sodium.client.render.frapi.mesh;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.caffeinemc.mods.sodium.client.render.frapi.mesh.MeshViewImpl;
import net.caffeinemc.mods.sodium.client.render.model.QuadViewImpl;
import net.fabricmc.fabric.api.renderer.v1.mesh.Mesh;

public class MeshImpl
extends MeshViewImpl
implements Mesh {
    private static final ThreadLocal<ObjectArrayList<QuadViewImpl>> CURSOR_POOLS = ThreadLocal.withInitial(ObjectArrayList::new);

    MeshImpl(int[] nArray) {
        this.data = nArray;
        this.limit = nArray.length;
    }

    MeshImpl() {
    }
}

