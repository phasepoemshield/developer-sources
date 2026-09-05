/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.vertices.ImmediateState
 *  org.lwjgl.opengl.GL32C
 */
package net.caffeinemc.mods.sodium.client.gl.device;

import net.caffeinemc.mods.sodium.client.gl.device.DrawCommandList;
import net.caffeinemc.mods.sodium.client.gl.device.GLRenderDevice;
import net.caffeinemc.mods.sodium.client.gl.device.MultiDrawBatch;
import net.caffeinemc.mods.sodium.client.gl.tessellation.GlIndexType;
import net.caffeinemc.mods.sodium.client.gl.tessellation.GlPrimitiveType;
import net.irisshaders.iris.vertices.ImmediateState;
import org.lwjgl.opengl.GL32C;

class GLRenderDevice$ImmediateDrawCommandList
implements DrawCommandList {
    final /* synthetic */ GLRenderDevice this$0;

    public GLRenderDevice$ImmediateDrawCommandList(GLRenderDevice gLRenderDevice) {
        this.this$0 = gLRenderDevice;
    }

    @Override
    public void flush() {
        if (this.this$0.activeTessellation != null) {
            this.endTessellating();
        }
    }

    private int redirect$bil000$iris$replaceId(GlPrimitiveType glPrimitiveType) {
        if (ImmediateState.usingTessellation) {
            return 14;
        }
        return glPrimitiveType.getId();
    }

    @Override
    public void multiDrawElementsBaseVertex(MultiDrawBatch multiDrawBatch, GlIndexType glIndexType) {
        GlPrimitiveType glPrimitiveType;
        GlPrimitiveType glPrimitiveType2 = glPrimitiveType = this.this$0.activeTessellation.getPrimitiveType();
        GL32C.nglMultiDrawElementsBaseVertex((int)this.redirect$bil000$iris$replaceId(glPrimitiveType2), (long)multiDrawBatch.pElementCount, (int)glIndexType.getFormatId(), (long)multiDrawBatch.pElementPointer, (int)multiDrawBatch.size, (long)multiDrawBatch.pBaseVertex);
    }

    @Override
    public void endTessellating() {
        this.this$0.activeTessellation.unbind(this.this$0.commandList);
        this.this$0.activeTessellation = null;
    }
}

