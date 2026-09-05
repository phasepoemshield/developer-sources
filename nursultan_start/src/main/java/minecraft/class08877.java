/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02022
 *  minecraft.class07211
 *  minecraft.class08388
 *  net.caffeinemc.mods.sodium.client.render.frapi.SodiumRenderer
 *  net.caffeinemc.mods.sodium.client.render.frapi.wrapper.MutableQuadViewWrapper
 *  net.caffeinemc.mods.sodium.client.render.model.AbstractBlockRenderContext$BlockEmitter
 *  net.caffeinemc.mods.sodium.client.render.model.MutableQuadViewImpl
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter
 *  net.fabricmc.fabric.api.renderer.v1.model.FabricBlockModelPart
 *  net.fabricmc.fabric.mixin.renderer.client.block.model.BlockModelPartMixin
 *  net.irisshaders.iris.compat.general.IrisModelPart
 *  net.irisshaders.iris.mixin.MixinBlockModelPart
 *  net.irisshaders.iris.mixin.MixinBlockState
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import java.util.function.Predicate;
import minecraft.class02022;
import minecraft.class07211;
import minecraft.class08388;
import net.caffeinemc.mods.sodium.client.render.frapi.SodiumRenderer;
import net.caffeinemc.mods.sodium.client.render.frapi.wrapper.MutableQuadViewWrapper;
import net.caffeinemc.mods.sodium.client.render.model.AbstractBlockRenderContext;
import net.caffeinemc.mods.sodium.client.render.model.MutableQuadViewImpl;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import net.fabricmc.fabric.api.renderer.v1.model.FabricBlockModelPart;
import net.fabricmc.fabric.mixin.renderer.client.block.model.BlockModelPartMixin;
import net.irisshaders.iris.compat.general.IrisModelPart;
import net.irisshaders.iris.mixin.MixinBlockModelPart;
import net.irisshaders.iris.mixin.MixinBlockState;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public interface class08877
extends FabricBlockModelPart,
BlockModelPartMixin,
IrisModelPart,
MixinBlockModelPart,
MixinBlockState {
    public class08388 L();

    public boolean y();

    public List<class02022> N(@Nullable class07211 var1);

    default public void emitQuads(QuadEmitter quadEmitter, /*
     * Issues handling annotations - annotations may be inaccurate
     */
    @Nullable Predicate predicate) {
        MutableQuadViewImpl mutableQuadViewImpl;
        if (quadEmitter instanceof MutableQuadViewWrapper && (mutableQuadViewImpl = ((MutableQuadViewWrapper)quadEmitter).getOriginal()) instanceof AbstractBlockRenderContext.BlockEmitter) {
            ((AbstractBlockRenderContext.BlockEmitter)mutableQuadViewImpl).emitPart(this, predicate, SodiumRenderer.BUFFERER);
        } else {
            super.emitQuads(quadEmitter, predicate);
        }
    }
}

