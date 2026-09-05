/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.render.frapi.mesh;

import net.caffeinemc.mods.sodium.client.render.frapi.mesh.MutableMeshImpl;
import net.caffeinemc.mods.sodium.client.render.model.EncodingFormat;
import net.caffeinemc.mods.sodium.client.render.model.MutableQuadViewImpl;

class MutableMeshImpl$1
extends MutableQuadViewImpl {
    final /* synthetic */ MutableMeshImpl this$0;

    MutableMeshImpl$1(MutableMeshImpl mutableMeshImpl) {
        this.this$0 = mutableMeshImpl;
    }

    @Override
    public void emitDirectly() {
        this.computeGeometry();
        this.this$0.limit += EncodingFormat.TOTAL_STRIDE;
        this.this$0.ensureCapacity(EncodingFormat.TOTAL_STRIDE);
        this.baseIndex = this.this$0.limit;
    }
}

