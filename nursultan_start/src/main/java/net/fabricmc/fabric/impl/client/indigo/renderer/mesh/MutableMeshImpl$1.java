/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.client.indigo.renderer.mesh;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.indigo.renderer.mesh.EncodingFormat;
import net.fabricmc.fabric.impl.client.indigo.renderer.mesh.MutableMeshImpl;
import net.fabricmc.fabric.impl.client.indigo.renderer.mesh.MutableQuadViewImpl;

@Environment(value=EnvType.CLIENT)
class MutableMeshImpl$1
extends MutableQuadViewImpl {
    final /* synthetic */ MutableMeshImpl this$0;

    MutableMeshImpl$1(MutableMeshImpl mutableMeshImpl) {
        this.this$0 = mutableMeshImpl;
    }

    @Override
    protected void emitDirectly() {
        this.computeGeometry();
        this.this$0.limit += EncodingFormat.TOTAL_STRIDE;
        this.this$0.ensureCapacity(EncodingFormat.TOTAL_STRIDE);
        this.baseIndex = this.this$0.limit;
    }
}

