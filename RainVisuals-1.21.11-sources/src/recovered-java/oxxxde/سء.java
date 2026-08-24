/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.client.gl.PostEffectPass
 *  net.minecraft.client.gl.PostEffectPipeline
 *  net.minecraft.client.gl.PostEffectPipeline$Pass
 *  net.minecraft.client.gl.PostEffectPipeline$TargetSampler
 *  net.minecraft.client.gl.PostEffectPipeline$Targets
 *  net.minecraft.client.gl.PostEffectProcessor
 *  net.minecraft.client.gl.UniformValue$FloatValue
 *  net.minecraft.client.gl.UniformValue$Vec4fValue
 *  net.minecraft.client.render.DefaultFramebufferSet
 *  net.minecraft.client.render.ProjectionMatrix2
 *  net.minecraft.client.texture.TextureManager
 *  net.minecraft.client.util.memory.ObjectAllocator
 *  net.minecraft.client.util.memory.ObjectPool
 *  net.minecraft.util.Identifier
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 *  org.lwjgl.system.MemoryStack
 */
package oxxxde;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import kotakbaz.rain.mixin.PostChainAccessor;
import kotakbaz.rain.mixin.PostPassAccessor;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.gl.PostEffectPass;
import net.minecraft.client.gl.PostEffectPipeline;
import net.minecraft.client.gl.PostEffectProcessor;
import net.minecraft.client.gl.UniformValue;
import net.minecraft.client.render.DefaultFramebufferSet;
import net.minecraft.client.render.ProjectionMatrix2;
import net.minecraft.client.texture.TextureManager;
import net.minecraft.client.util.memory.ObjectAllocator;
import net.minecraft.client.util.memory.ObjectPool;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector4f;
import org.joml.Vector4fc;
import org.lwjgl.system.MemoryStack;
import oxxxde.\u0636\u0643;
import oxxxde.\u0638\u0646;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\t\u001a\u00020\bH\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\bH\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u001a\u0010\u0003R\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010)\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b)\u0010&R\u0014\u0010*\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b*\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b5\u0010\u001cR\u0016\u00106\u001a\u00020\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b6\u0010\u001cR\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b8\u00109\u00a8\u0006:"}, d2={"Loxxxde/\u0633\u0621;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "onEnable", "onDisable", "renderWorldIfNeeded", "", "updateAnimatedRatio", "()F", "Lnet/minecraft/class_279;", "ensureProcessor", "()Lnet/minecraft/class_279;", "chain", "Lcom/mojang/blaze3d/buffers/GpuBuffer;", "replaceRatioUniform", "(Lnet/minecraft/class_279;)Lcom/mojang/blaze3d/buffers/GpuBuffer;", "currentRatio", "", "updateRatioUniform", "(F)Z", "Lnet/minecraft/class_9962;", "createPipeline", "()Lnet/minecraft/class_9962;", "releaseEffect", "releaseProcessor", "ANIMATION_SPEED", "F", "RATIO_EPSILON", "", "UNIFORM_NAME", "Ljava/lang/String;", "Loxxxde/\u0637\u064f;", "ratio", "Loxxxde/\u0637\u064f;", "Lnet/minecraft/class_2960;", "effectId", "Lnet/minecraft/class_2960;", "swapTargetId", "screenQuadShaderId", "blitShaderId", "aspectShaderId", "processor", "Lnet/minecraft/class_279;", "Lnet/minecraft/class_11278;", "projectionMatrix", "Lnet/minecraft/class_11278;", "Lnet/minecraft/class_9920;", "renderPool", "Lnet/minecraft/class_9920;", "ratioUniform", "Lcom/mojang/blaze3d/buffers/GpuBuffer;", "uploadedRatio", "animatedRatio", "", "lastFrameNanos", "J", "rain-visuals"})
public final class \u0633\u0621
extends Module {
    private static float animatedRatio;
    @NotNull
    private static final String UNIFORM_NAME = "AspectConfig";
    private static float uploadedRatio;
    private static long lastFrameNanos;
    @Nullable
    private static GpuBuffer ratioUniform;
    @NotNull
    private static final Identifier screenQuadShaderId;
    @Nullable
    private static ProjectionMatrix2 projectionMatrix;
    @NotNull
    public static final \u0633\u0621 INSTANCE;
    @Nullable
    private static ObjectPool renderPool;
    @NotNull
    private static final Identifier effectId;
    private static final float ANIMATION_SPEED = 9.0f;
    private static final float RATIO_EPSILON = 0.001f;
    @NotNull
    private static final Identifier aspectShaderId;
    @NotNull
    private static final Identifier swapTargetId;
    @NotNull
    private static final SliderSetting ratio;
    @NotNull
    private static final Identifier blitShaderId;
    @Nullable
    private static PostEffectProcessor processor;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private final boolean updateRatioUniform(float currentRatio) {
        Object object;
        if (Math.abs(currentRatio - uploadedRatio) <= 1.0E-5f) {
            return true;
        }
        GpuBuffer gpuBuffer = ratioUniform;
        if (gpuBuffer == null) {
            return false;
        }
        GpuBuffer uniform = gpuBuffer;
        \u0633\u0621 \u0633\u06212 = this;
        try {
            \u0633\u0621 $this$updateRatioUniform_u24lambda_u240 = \u0633\u06212;
            boolean bl = false;
            AutoCloseable autoCloseable = (AutoCloseable)MemoryStack.stackPush();
            Throwable throwable = null;
            try {
                void var10_13;
                MemoryStack stack = (MemoryStack)autoCloseable;
                boolean bl2 = false;
                ByteBuffer data = stack.malloc(4);
                data.putFloat(0, currentRatio);
                RenderSystem.getDevice().createCommandEncoder().writeToBuffer(uniform.slice(0L, 4L), (ByteBuffer)var10_13);
                Unit unit = Unit.INSTANCE;
            }
            catch (Throwable throwable2) {
                throwable = throwable2;
                throw throwable2;
            }
            finally {
                AutoCloseableKt.closeFinally(autoCloseable, throwable);
            }
            uploadedRatio = currentRatio;
            object = Result.constructor-impl(Unit.INSTANCE);
        }
        catch (Throwable throwable) {
            object = Result.constructor-impl(ResultKt.createFailure(throwable));
        }
        return Result.isSuccess-impl(object);
    }

    static {
        INSTANCE = new \u0633\u0621();
        ratio = Module.slider$default(INSTANCE, "\u0420\u0430\u0437\u0440\u0435\u0448\u0435\u043d\u0438\u0435", 1.25f, 1.0f, 2.0f, 0.01f, null, 32, null);
        Identifier identifier = Identifier.of((String)"rain", (String)"aspect_ratio");
        Intrinsics.checkNotNullExpressionValue(identifier, "fromNamespaceAndPath(...)");
        effectId = identifier;
        Identifier identifier2 = Identifier.of((String)"rain", (String)"aspect_ratio_swap");
        Intrinsics.checkNotNullExpressionValue(identifier2, "fromNamespaceAndPath(...)");
        swapTargetId = identifier2;
        Identifier identifier3 = Identifier.of((String)"minecraft", (String)"core/screenquad");
        Intrinsics.checkNotNullExpressionValue(identifier3, "fromNamespaceAndPath(...)");
        screenQuadShaderId = identifier3;
        Identifier identifier4 = Identifier.of((String)"minecraft", (String)"post/blit");
        Intrinsics.checkNotNullExpressionValue(identifier4, "fromNamespaceAndPath(...)");
        blitShaderId = identifier4;
        Identifier identifier5 = Identifier.of((String)"rain", (String)"post/aspect_ratio");
        Intrinsics.checkNotNullExpressionValue(identifier5, "fromNamespaceAndPath(...)");
        aspectShaderId = identifier5;
        uploadedRatio = Float.NaN;
        animatedRatio = 1.0f;
    }

    private final float updateAnimatedRatio() {
        long now = System.nanoTime();
        float deltaSeconds = lastFrameNanos == 0L ? 0.0f : RangesKt.coerceAtMost((float)RangesKt.coerceAtLeast(now - lastFrameNanos, 0L) / 1.0E9f, 0.05f);
        lastFrameNanos = now;
        float targetRatio = this.isEnabled() ? ((Number)ratio.getValue()).floatValue() : 1.0f;
        float difference = targetRatio - animatedRatio;
        if (Math.abs(difference) <= 0.001f) {
            animatedRatio = targetRatio;
            return animatedRatio;
        }
        float factor = (float)(1.0 - Math.exp(-9.0f * deltaSeconds));
        return animatedRatio += difference * factor;
    }

    @Override
    public void onEnable() {
        lastFrameNanos = System.nanoTime();
    }

    private final void releaseProcessor() {
        block2: {
            PostEffectProcessor postEffectProcessor = processor;
            if (postEffectProcessor != null) {
                postEffectProcessor.close();
            }
            processor = null;
            ratioUniform = null;
            ProjectionMatrix2 projectionMatrix2 = projectionMatrix;
            if (projectionMatrix2 != null) {
                projectionMatrix2.close();
            }
            projectionMatrix = null;
            ObjectPool objectPool = renderPool;
            if (objectPool == null) break block2;
            objectPool.clear();
        }
    }

    private final void releaseEffect() {
        this.releaseProcessor();
        ObjectPool objectPool = renderPool;
        if (objectPool != null) {
            objectPool.close();
        }
        renderPool = null;
        uploadedRatio = Float.NaN;
    }

    /*
     * WARNING - void declaration
     */
    private final PostEffectProcessor ensureProcessor() {
        void var2_9;
        void var3_2;
        Object $this$ensureProcessor_u24lambda_u241;
        PostEffectProcessor postEffectProcessor = processor;
        if (postEffectProcessor != null) {
            PostEffectProcessor it = postEffectProcessor;
            boolean bl = false;
            return it;
        }
        this.releaseProcessor();
        ProjectionMatrix2 newProjectionMatrix = new ProjectionMatrix2("rain_aspect_ratio", 0.05f, 1000.0f, false);
        Object object = this;
        try {
            $this$ensureProcessor_u24lambda_u241 = object;
            boolean bl = false;
            $this$ensureProcessor_u24lambda_u241 = Result.constructor-impl(PostEffectProcessor.parseEffect((PostEffectPipeline)super.createPipeline(), (TextureManager)\u0636\u0643.getMc().getTextureManager(), (Set)DefaultFramebufferSet.MAIN_ONLY, (Identifier)effectId, (ProjectionMatrix2)newProjectionMatrix));
        }
        catch (Throwable bl) {
            $this$ensureProcessor_u24lambda_u241 = Result.constructor-impl(ResultKt.createFailure(bl));
        }
        object = $this$ensureProcessor_u24lambda_u241;
        Throwable throwable = Result.exceptionOrNull-impl(object);
        if (throwable != null) {
            Throwable it = throwable;
            boolean bl = false;
            newProjectionMatrix.close();
            return null;
        }
        Object object2 = object;
        Intrinsics.checkNotNullExpressionValue(object2, "getOrElse(...)");
        PostEffectProcessor newProcessor = (PostEffectProcessor)object2;
        GpuBuffer mutableRatioUniform = this.replaceRatioUniform(newProcessor);
        if (mutableRatioUniform == null) {
            newProcessor.close();
            newProjectionMatrix.close();
            return null;
        }
        projectionMatrix = newProjectionMatrix;
        processor = newProcessor;
        ratioUniform = var3_2;
        uploadedRatio = 1.0f;
        return var2_9;
    }

    @Override
    public void onDisable() {
        lastFrameNanos = System.nanoTime();
    }

    private static final String replaceRatioUniform$lambda$0$0$0() {
        return "rain_aspect_ratio_uniform";
    }

    private \u0633\u0621() {
        super("AspectRatio", \u0638\u0646.getRENDER(), "\u0418\u0437\u043c\u0435\u043d\u0435\u043d\u0438\u0435 \u0440\u0430\u0441\u0442\u044f\u0433\u0430 \u044d\u043a\u0440\u0430\u043d\u0430");
    }

    public final void renderWorldIfNeeded() {
        block9: {
            Object object;
            if (\u0636\u0643.getMc().world == null || \u0636\u0643.getMc().player == null) {
                lastFrameNanos = System.nanoTime();
                if (!this.isEnabled()) {
                    animatedRatio = 1.0f;
                    this.releaseEffect();
                }
                return;
            }
            float currentRatio = this.updateAnimatedRatio();
            if (Math.abs(currentRatio - 1.0f) <= 0.001f) {
                if (processor != null) {
                    this.releaseEffect();
                }
                return;
            }
            PostEffectProcessor postEffectProcessor = this.ensureProcessor();
            if (postEffectProcessor == null) {
                return;
            }
            PostEffectProcessor activeProcessor = postEffectProcessor;
            if (!this.updateRatioUniform(currentRatio)) {
                this.releaseEffect();
                return;
            }
            ObjectPool objectPool = renderPool;
            if (objectPool == null) {
                ObjectPool it = object = new ObjectPool(3);
                boolean bl = false;
                renderPool = it;
                objectPool = object;
            }
            ObjectPool pool = objectPool;
            \u0633\u0621 \u0633\u06212 = this;
            try {
                \u0633\u0621 $this$renderWorldIfNeeded_u24lambda_u241 = \u0633\u06212;
                boolean bl = false;
                activeProcessor.render(\u0636\u0643.getMc().getFramebuffer(), (ObjectAllocator)pool);
                object = Result.constructor-impl(Unit.INSTANCE);
            }
            catch (Throwable bl) {
                object = Result.constructor-impl(ResultKt.createFailure(bl));
            }
            \u0633\u06212 = object;
            Throwable throwable = Result.exceptionOrNull-impl(\u0633\u06212);
            if (throwable == null) break block9;
            Object it = object = throwable;
            boolean bl = false;
            INSTANCE.releaseEffect();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private final GpuBuffer replaceRatioUniform(PostEffectProcessor chain) {
        Object object;
        Intrinsics.checkNotNull(chain, "null cannot be cast to non-null type kotakbaz.rain.mixin.PostChainAccessor");
        List<PostEffectPass> list = ((PostChainAccessor)chain).rain$getPasses();
        Intrinsics.checkNotNullExpressionValue(list, "rain$getPasses(...)");
        PostEffectPass postEffectPass = CollectionsKt.firstOrNull(list);
        if (postEffectPass == null) {
            return null;
        }
        PostEffectPass pass = postEffectPass;
        Map<String, GpuBuffer> uniforms = ((PostPassAccessor)pass).rain$getCustomUniforms();
        GpuBuffer gpuBuffer = uniforms.get(UNIFORM_NAME);
        if (gpuBuffer == null) {
            return null;
        }
        GpuBuffer original = gpuBuffer;
        Object object2 = this;
        try {
            void var10_11;
            \u0633\u0621 $this$replaceRatioUniform_u24lambda_u240 = object2;
            boolean bl = false;
            AutoCloseable autoCloseable = (AutoCloseable)MemoryStack.stackPush();
            Throwable throwable = null;
            try {
                void var13_16;
                MemoryStack stack = (MemoryStack)autoCloseable;
                boolean bl2 = false;
                ByteBuffer initialData = stack.calloc((int)original.size());
                initialData.putFloat(0, 1.0f);
                GpuBuffer gpuBuffer2 = RenderSystem.getDevice().createBuffer(\u0633\u0621::replaceRatioUniform$lambda$0$0$0, 136, initialData);
                Intrinsics.checkNotNullExpressionValue(gpuBuffer2, "createBuffer(...)");
                GpuBuffer mutable = gpuBuffer2;
                Intrinsics.checkNotNull(uniforms);
                uniforms.put(UNIFORM_NAME, mutable);
                original.close();
                var10_11 = var13_16;
            }
            catch (Throwable throwable2) {
                throwable = throwable2;
                throw throwable2;
            }
            finally {
                AutoCloseableKt.closeFinally(autoCloseable, throwable);
            }
            object = Result.constructor-impl(var10_11);
        }
        catch (Throwable throwable) {
            object = Result.constructor-impl(ResultKt.createFailure(throwable));
        }
        object2 = object;
        return (GpuBuffer)(Result.isFailure-impl(object2) ? null : object2);
    }

    /*
     * WARNING - void declaration
     */
    private final PostEffectPipeline createPipeline() {
        void var2_2;
        void var1_1;
        PostEffectPipeline.Pass aspectPass = new PostEffectPipeline.Pass(screenQuadShaderId, aspectShaderId, CollectionsKt.listOf(new PostEffectPipeline.TargetSampler("In", DefaultFramebufferSet.MAIN, false, false)), swapTargetId, MapsKt.mapOf(TuplesKt.to(UNIFORM_NAME, CollectionsKt.listOf(new UniformValue.FloatValue(1.0f)))));
        PostEffectPipeline.Pass blitPass = new PostEffectPipeline.Pass(screenQuadShaderId, blitShaderId, CollectionsKt.listOf(new PostEffectPipeline.TargetSampler("In", swapTargetId, false, false)), DefaultFramebufferSet.MAIN, MapsKt.mapOf(TuplesKt.to("BlitConfig", CollectionsKt.listOf(new UniformValue.Vec4fValue((Vector4fc)new Vector4f(1.0f, 1.0f, 1.0f, 1.0f))))));
        PostEffectPipeline.Pass[] passArray = new PostEffectPipeline.Pass[2];
        passArray[0] = var1_1;
        passArray[1] = var2_2;
        return new PostEffectPipeline(MapsKt.mapOf(TuplesKt.to(swapTargetId, new PostEffectPipeline.Targets(Optional.empty(), Optional.empty(), false, 0))), CollectionsKt.listOf(passArray));
    }
}

