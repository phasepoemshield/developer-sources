/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.Mesh
 *  net.fabricmc.fabric.api.renderer.v1.mesh.MutableMesh
 *  net.fabricmc.fabric.api.renderer.v1.mesh.MutableQuadView
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter
 */
package net.fabricmc.fabric.impl.client.indigo.renderer.mesh;

import java.util.function.Consumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.Mesh;
import net.fabricmc.fabric.api.renderer.v1.mesh.MutableMesh;
import net.fabricmc.fabric.api.renderer.v1.mesh.MutableQuadView;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import net.fabricmc.fabric.impl.client.indigo.renderer.mesh.EncodingFormat;
import net.fabricmc.fabric.impl.client.indigo.renderer.mesh.MeshImpl;
import net.fabricmc.fabric.impl.client.indigo.renderer.mesh.MeshViewImpl;
import net.fabricmc.fabric.impl.client.indigo.renderer.mesh.MutableMeshImpl$1;
import net.fabricmc.fabric.impl.client.indigo.renderer.mesh.MutableQuadViewImpl;

@Environment(value=EnvType.CLIENT)
public class MutableMeshImpl
extends MeshViewImpl
implements MutableMesh {
    private final MutableQuadViewImpl emitter = new MutableMeshImpl$1(this);

    public MutableMeshImpl() {
        this.data = new int[8 * EncodingFormat.TOTAL_STRIDE];
        this.limit = 0;
        this.ensureCapacity(EncodingFormat.TOTAL_STRIDE);
        this.emitter.data = this.data;
        this.emitter.baseIndex = this.limit;
        this.emitter.clear();
    }

    public void clear() {
        this.emitter.baseIndex = this.limit = 0;
        this.emitter.clear();
    }

    void ensureCapacity(int n) {
        if (n > this.data.length - this.limit) {
            int[] nArray = new int[this.data.length * 2];
            System.arraycopy(this.data, 0, nArray, 0, this.limit);
            this.data = nArray;
            this.emitter.data = this.data;
        }
    }

    public Mesh immutableCopy() {
        int[] nArray = new int[this.limit];
        System.arraycopy(this.data, 0, nArray, 0, this.limit);
        return new MeshImpl(nArray);
    }

    public void forEachMutable(Consumer<? super MutableQuadView> consumer) {
        this.forEach(consumer, this.emitter);
        this.emitter.data = this.data;
        this.emitter.baseIndex = this.limit;
    }

    public QuadEmitter emitter() {
        this.emitter.clear();
        return this.emitter;
    }
}

