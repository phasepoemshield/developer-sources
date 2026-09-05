/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class02022
 *  minecraft.class06069
 *  minecraft.class06202
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class07295
 *  minecraft.class08743
 *  minecraft.class08877
 *  net.caffeinemc.mods.sodium.client.model.light.LightMode
 *  net.caffeinemc.mods.sodium.client.model.light.LightPipeline
 *  net.caffeinemc.mods.sodium.client.model.light.LightPipelineProvider
 *  net.caffeinemc.mods.sodium.client.model.light.data.QuadLightData
 *  net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline.BlockRenderer
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline.ShapeComparisonCache
 *  net.caffeinemc.mods.sodium.client.services.PlatformBlockAccess
 *  net.caffeinemc.mods.sodium.client.services.PlatformModelAccess
 *  net.caffeinemc.mods.sodium.client.util.DirectionUtil
 *  net.caffeinemc.mods.sodium.client.world.LevelSlice
 *  net.irisshaders.iris.compat.general.IrisModSupport
 *  net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings
 *  net.irisshaders.iris.vertices.sodium.terrain.VertexEncoderInterface
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package net.caffeinemc.mods.sodium.client.render.model;

import com.google.common.base.Suppliers;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class02022;
import minecraft.class06069;
import minecraft.class06202;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class07295;
import minecraft.class08743;
import minecraft.class08877;
import net.caffeinemc.mods.sodium.client.model.light.LightMode;
import net.caffeinemc.mods.sodium.client.model.light.LightPipeline;
import net.caffeinemc.mods.sodium.client.model.light.LightPipelineProvider;
import net.caffeinemc.mods.sodium.client.model.light.data.QuadLightData;
import net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline.BlockRenderer;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline.ShapeComparisonCache;
import net.caffeinemc.mods.sodium.client.render.helper.ColorHelper;
import net.caffeinemc.mods.sodium.client.render.helper.ModelHelper;
import net.caffeinemc.mods.sodium.client.render.model.AbstractBlockRenderContext$BlockEmitter;
import net.caffeinemc.mods.sodium.client.render.model.AbstractRenderContext;
import net.caffeinemc.mods.sodium.client.render.model.AmbientOcclusionMode;
import net.caffeinemc.mods.sodium.client.render.model.MutableQuadViewImpl;
import net.caffeinemc.mods.sodium.client.render.model.SodiumShadeMode;
import net.caffeinemc.mods.sodium.client.services.PlatformBlockAccess;
import net.caffeinemc.mods.sodium.client.services.PlatformModelAccess;
import net.caffeinemc.mods.sodium.client.util.DirectionUtil;
import net.caffeinemc.mods.sodium.client.world.LevelSlice;
import net.irisshaders.iris.compat.general.IrisModSupport;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import net.irisshaders.iris.vertices.sodium.terrain.VertexEncoderInterface;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class AbstractBlockRenderContext
extends AbstractRenderContext {
    private final AbstractBlockRenderContext$BlockEmitter editorQuad = new AbstractBlockRenderContext$BlockEmitter(this);
    protected class07295 level;
    protected LevelSlice slice;
    protected class00500 state;
    protected class07209 pos;
    protected class08743 defaultRenderType;
    protected boolean allowDowngrade;
    private final Supplier<ShapeComparisonCache> occlusionCache = Suppliers.memoize(ShapeComparisonCache::new);
    private final class07218 cachedPositionObject = new class07218();
    private boolean enableCulling = true;
    private int cullCompletionFlags;
    private int cullResultFlags;
    protected class06069 random;
    protected LightPipelineProvider lighters;
    protected final QuadLightData quadLightData = new QuadLightData();
    protected boolean useAmbientOcclusion;
    protected LightMode defaultLightMode = LightMode.FLAT;
    private List<class08877> parts = new ObjectArrayList();

    private void handler$bif000$iris$checkDirectionNeo(class08877 class088772, Predicate predicate, Consumer consumer, CallbackInfo callbackInfo, class07211 class072112) {
        AbstractBlockRenderContext abstractBlockRenderContext = this;
        if (abstractBlockRenderContext instanceof BlockRenderer) {
            BlockRenderer blockRenderer = (BlockRenderer)abstractBlockRenderContext;
            if (WorldRenderingSettings.INSTANCE.getBlockStateIds() != null && class072112 != null && (abstractBlockRenderContext = IrisModSupport.INSTANCE.getModelPartState(class088772)) != null) {
                ((VertexEncoderInterface)blockRenderer).overrideBlock(WorldRenderingSettings.INSTANCE.getBlockStateIds().getInt((Object)abstractBlockRenderContext));
            }
        }
    }

    private void handler$bif000$iris$checkDirectionNeo(class08877 class088772, Predicate predicate, Consumer consumer, CallbackInfo callbackInfo) {
        AbstractBlockRenderContext abstractBlockRenderContext = this;
        if (abstractBlockRenderContext instanceof BlockRenderer) {
            BlockRenderer blockRenderer = (BlockRenderer)abstractBlockRenderContext;
            if (WorldRenderingSettings.INSTANCE.getBlockStateIds() != null) {
                ((VertexEncoderInterface)blockRenderer).restoreBlock();
            }
        }
    }

    public boolean shouldDrawSide(class07211 class072112) {
        class07218 class072182 = this.cachedPositionObject;
        class072182.N((class00753)this.pos, class072112);
        class00500 class005002 = this.level.method_8320((class07209)class072182);
        class00494 class004942 = class005002.N(DirectionUtil.getOpposite((class07211)class072112));
        if (ShapeComparisonCache.isFullShape((class00494)class004942)) {
            return false;
        }
        if (this.state.N(class005002, class072112)) {
            return false;
        }
        if (PlatformBlockAccess.getInstance().shouldSkipRender((class07290)this.level, this.state, class005002, this.pos, (class07209)class072182, class072112)) {
            return false;
        }
        if (ShapeComparisonCache.isEmptyShape((class00494)class004942) || !class005002.G()) {
            return true;
        }
        class00494 class004943 = this.state.N(class072112);
        if (ShapeComparisonCache.isEmptyShape((class00494)class004943)) {
            return true;
        }
        return this.occlusionCache.get().lookup(class004943, class004942);
    }

    protected void prepareCulling(boolean bl) {
        this.enableCulling = bl;
        this.cullCompletionFlags = 0;
        this.cullResultFlags = 0;
    }

    public boolean isFaceCulled(@Nullable class07211 class072112) {
        if (class072112 == null || !this.enableCulling) {
            return false;
        }
        int n = 1 << class072112.L();
        if ((this.cullCompletionFlags & n) == 0) {
            this.cullCompletionFlags |= n;
            if (this.shouldDrawSide(class072112)) {
                this.cullResultFlags |= n;
                return false;
            }
            return true;
        }
        return (this.cullResultFlags & n) == 0;
    }

    @Override
    public MutableQuadViewImpl getForEmitting() {
        this.editorQuad.clear();
        return this.editorQuad;
    }

    public void bufferDefaultModel(class08877 class088772, Predicate<class07211> predicate, Consumer<MutableQuadViewImpl> consumer) {
        AbstractBlockRenderContext$BlockEmitter abstractBlockRenderContext$BlockEmitter = this.editorQuad;
        this.prepareAoInfo(class088772.y());
        class08743 class087432 = PlatformModelAccess.getInstance().getPartRenderType(class088772, this.state, this.defaultRenderType);
        class08743 class087433 = this.defaultRenderType;
        this.defaultRenderType = class087432;
        for (int i = 0; i <= 6; ++i) {
            class07211 class072112 = ModelHelper.faceFromIndex(i);
            if (predicate.test(class072112)) continue;
            AmbientOcclusionMode ambientOcclusionMode = PlatformBlockAccess.getInstance().usesAmbientOcclusion(class088772, this.state, class087432, (class07295)this.slice, this.pos);
            PlatformModelAccess platformModelAccess = PlatformModelAccess.getInstance();
            this.handler$bif000$iris$checkDirectionNeo(class088772, predicate, consumer, null, class072112);
            List list = platformModelAccess.getQuads(this.level, this.pos, class088772, this.state, class072112, this.random, class087432);
            int n = list.size();
            for (int j = 0; j < n; ++j) {
                class02022 class020222 = (class02022)list.get(j);
                abstractBlockRenderContext$BlockEmitter.fromBakedQuad(class020222);
                abstractBlockRenderContext$BlockEmitter.setCullFace(class072112);
                abstractBlockRenderContext$BlockEmitter.setRenderType(class087432);
                abstractBlockRenderContext$BlockEmitter.setAmbientOcclusion(ambientOcclusionMode.toTriState());
                consumer.accept(abstractBlockRenderContext$BlockEmitter);
            }
        }
        abstractBlockRenderContext$BlockEmitter.clear();
        this.defaultRenderType = class087433;
        this.handler$bif000$iris$checkDirectionNeo(class088772, predicate, consumer, null);
    }

    protected abstract void processQuad(MutableQuadViewImpl var1);

    protected void prepareAoInfo(boolean bl) {
        this.useAmbientOcclusion = class06202.yb();
        this.defaultLightMode = this.useAmbientOcclusion && bl && this.state != null && PlatformBlockAccess.getInstance().getLightEmission(this.state, this.level, this.pos) == 0 ? LightMode.SMOOTH : LightMode.FLAT;
    }

    public void shadeQuad(MutableQuadViewImpl mutableQuadViewImpl, LightMode lightMode, boolean bl, SodiumShadeMode sodiumShadeMode) {
        LightPipeline lightPipeline = this.lighters.getLighter(lightMode);
        QuadLightData quadLightData = this.quadLightData;
        lightPipeline.calculate((ModelQuadView)mutableQuadViewImpl, this.pos, quadLightData, mutableQuadViewImpl.getCullFace(), mutableQuadViewImpl.getLightFace(), mutableQuadViewImpl.hasShade(), sodiumShadeMode == SodiumShadeMode.ENHANCED);
        if (bl) {
            for (int i = 0; i < 4; ++i) {
                mutableQuadViewImpl.setLight(i, 0xF000F0);
            }
        } else {
            int[] nArray = quadLightData.lm;
            for (int i = 0; i < 4; ++i) {
                mutableQuadViewImpl.setLight(i, ColorHelper.maxBrightness(mutableQuadViewImpl.getLight(i), nArray[i]));
            }
        }
    }

    void renderQuad(MutableQuadViewImpl mutableQuadViewImpl) {
        if (this.isFaceCulled(mutableQuadViewImpl.getCullFace())) {
            return;
        }
        this.processQuad(mutableQuadViewImpl);
    }
}

