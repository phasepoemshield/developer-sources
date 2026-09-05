/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07211
 *  minecraft.class08877
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.render.model;

import java.util.function.Consumer;
import java.util.function.Predicate;
import minecraft.class07211;
import minecraft.class08877;
import net.caffeinemc.mods.sodium.client.render.model.AbstractBlockRenderContext;
import net.caffeinemc.mods.sodium.client.render.model.EncodingFormat;
import net.caffeinemc.mods.sodium.client.render.model.MutableQuadViewImpl;
import org.jspecify.annotations.Nullable;

public class AbstractBlockRenderContext$BlockEmitter
extends MutableQuadViewImpl {
    final /* synthetic */ AbstractBlockRenderContext this$0;

    public AbstractBlockRenderContext$BlockEmitter(AbstractBlockRenderContext abstractBlockRenderContext) {
        this.this$0 = abstractBlockRenderContext;
        this.data = new int[EncodingFormat.TOTAL_STRIDE];
        this.clear();
    }

    public void emitPart(class08877 class088772, Predicate<@Nullable class07211> predicate, Consumer<MutableQuadViewImpl> consumer) {
        this.this$0.bufferDefaultModel(class088772, predicate, consumer);
    }

    public void markInvalidToDowngrade() {
        this.this$0.allowDowngrade = false;
    }

    @Override
    public void emitDirectly() {
        this.this$0.renderQuad(this);
    }
}

