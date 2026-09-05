/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.render.frapi.render;

import net.caffeinemc.mods.sodium.client.render.frapi.render.ItemRenderContext;
import net.caffeinemc.mods.sodium.client.render.model.EncodingFormat;
import net.caffeinemc.mods.sodium.client.render.model.MutableQuadViewImpl;

public class ItemRenderContext$ItemEmitter
extends MutableQuadViewImpl {
    final /* synthetic */ ItemRenderContext this$0;

    public ItemRenderContext$ItemEmitter(ItemRenderContext itemRenderContext) {
        this.this$0 = itemRenderContext;
        this.data = new int[EncodingFormat.TOTAL_STRIDE];
        this.clear();
    }

    @Override
    public void emitDirectly() {
        this.this$0.renderQuad(this);
    }
}

