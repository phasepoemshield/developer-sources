/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.client.indigo.renderer.render;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.indigo.renderer.mesh.EncodingFormat;
import net.fabricmc.fabric.impl.client.indigo.renderer.mesh.MutableQuadViewImpl;
import net.fabricmc.fabric.impl.client.indigo.renderer.render.AbstractRenderContext;

@Environment(value=EnvType.CLIENT)
class AbstractRenderContext$1
extends MutableQuadViewImpl {
    final /* synthetic */ AbstractRenderContext this$0;

    AbstractRenderContext$1(AbstractRenderContext abstractRenderContext) {
        this.this$0 = abstractRenderContext;
        this.data = new int[EncodingFormat.TOTAL_STRIDE];
        this.clear();
    }

    @Override
    public void emitDirectly() {
        this.this$0.bufferQuad(this);
    }
}

