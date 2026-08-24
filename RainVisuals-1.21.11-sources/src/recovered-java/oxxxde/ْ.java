/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
 *  ru.ocz.protection.virtualmachine.annotation.RecompileFormat
 */
package oxxxde;

import java.util.Optional;
import java.util.Set;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
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
import oxxxde.\u0636\u0643;
import oxxxde.\u0638\u0646;
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0003R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b#\u0010$\u00a8\u0006%"}, d2={"Loxxxde/\u0652;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "onDisable", "renderWorldIfNeeded", "", "currentSaturation", "Lnet/minecraft/class_279;", "ensureProcessor", "(F)Lnet/minecraft/class_279;", "Lnet/minecraft/class_9962;", "createPipeline", "(F)Lnet/minecraft/class_9962;", "releaseEffect", "releaseProcessor", "Loxxxde/\u0637\u064f;", "saturation", "Loxxxde/\u0637\u064f;", "Lnet/minecraft/class_2960;", "effectId", "Lnet/minecraft/class_2960;", "swapTargetId", "screenQuadShaderId", "blitShaderId", "saturationShaderId", "cachedSaturation", "F", "processor", "Lnet/minecraft/class_279;", "Lnet/minecraft/class_11278;", "projectionMatrix", "Lnet/minecraft/class_11278;", "Lnet/minecraft/class_9920;", "renderPool", "Lnet/minecraft/class_9920;", "rain-visuals"})
@RecompileFormat
public final class \u0652
extends Module {
    @NotNull
    private static final Identifier swapTargetId;
    @NotNull
    private static final Identifier effectId;
    @NotNull
    private static final SliderSetting saturation;
    @NotNull
    private static final Identifier screenQuadShaderId;
    @NotNull
    private static final Identifier saturationShaderId;
    @Nullable
    private static ProjectionMatrix2 projectionMatrix;
    @NotNull
    private static final Identifier blitShaderId;
    @Nullable
    private static ObjectPool renderPool;
    @NotNull
    public static final \u0652 INSTANCE;
    private static float cachedSaturation;
    @Nullable
    private static PostEffectProcessor processor;

    /*
     * WARNING - void declaration
     */
    private final PostEffectPipeline createPipeline(float currentSaturation) {
        void var3_3;
        PostEffectPipeline.Pass saturationPass = new PostEffectPipeline.Pass(screenQuadShaderId, saturationShaderId, CollectionsKt.listOf(new PostEffectPipeline.TargetSampler("In", DefaultFramebufferSet.MAIN, false, false)), swapTargetId, MapsKt.mapOf(TuplesKt.to("SaturationConfig", CollectionsKt.listOf(new UniformValue.FloatValue(currentSaturation)))));
        PostEffectPipeline.Pass blitPass = new PostEffectPipeline.Pass(screenQuadShaderId, blitShaderId, CollectionsKt.listOf(new PostEffectPipeline.TargetSampler("In", swapTargetId, false, false)), DefaultFramebufferSet.MAIN, MapsKt.mapOf(TuplesKt.to("BlitConfig", CollectionsKt.listOf(new UniformValue.Vec4fValue((Vector4fc)new Vector4f(1.0f, 1.0f, 1.0f, 1.0f))))));
        PostEffectPipeline.Pass[] passArray = new PostEffectPipeline.Pass[2];
        passArray[0] = saturationPass;
        passArray[1] = var3_3;
        return new PostEffectPipeline(MapsKt.mapOf(TuplesKt.to(swapTargetId, new PostEffectPipeline.Targets(Optional.empty(), Optional.empty(), false, 0))), CollectionsKt.listOf(passArray));
    }

    @Override
    public void onDisable() {
        this.releaseEffect();
    }

    private \u0652() {
        super("ColorSaturation", \u0638\u0646.getRENDER(), "\u0418\u0437\u043c\u0435\u043d\u044f\u0435\u0442 \u0446\u0432\u0435\u0442 \u043d\u0430\u0441\u044b\u0449\u0435\u043d\u043d\u043e\u0441\u0442\u0438");
    }

    private final void releaseEffect() {
        this.releaseProcessor();
        ObjectPool objectPool = renderPool;
        if (objectPool != null) {
            objectPool.close();
        }
        renderPool = null;
        cachedSaturation = Float.NaN;
    }

    private final void releaseProcessor() {
        block2: {
            PostEffectProcessor postEffectProcessor = processor;
            if (postEffectProcessor != null) {
                postEffectProcessor.close();
            }
            processor = null;
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

    public final void renderWorldIfNeeded() {
        block7: {
            Object object;
            if (!this.isEnabled()) {
                return;
            }
            if (\u0636\u0643.getMc().world == null || \u0636\u0643.getMc().player == null) {
                return;
            }
            float currentSaturation = ((Number)saturation.getValue()).floatValue();
            if (Math.abs(currentSaturation - 1.0f) <= 0.001f) {
                return;
            }
            PostEffectProcessor postEffectProcessor = this.ensureProcessor(currentSaturation);
            if (postEffectProcessor == null) {
                return;
            }
            PostEffectProcessor activeProcessor = postEffectProcessor;
            ObjectPool objectPool = renderPool;
            if (objectPool == null) {
                ObjectPool it = object = new ObjectPool(3);
                boolean bl = false;
                renderPool = it;
                objectPool = object;
            }
            ObjectPool pool = objectPool;
            \u0652 \u06522 = this;
            try {
                \u0652 $this$renderWorldIfNeeded_u24lambda_u241 = \u06522;
                boolean bl = false;
                activeProcessor.render(\u0636\u0643.getMc().getFramebuffer(), (ObjectAllocator)pool);
                object = Result.constructor-impl(Unit.INSTANCE);
            }
            catch (Throwable bl) {
                object = Result.constructor-impl(ResultKt.createFailure(bl));
            }
            \u06522 = object;
            Throwable throwable = Result.exceptionOrNull-impl(\u06522);
            if (throwable == null) break block7;
            Object it = object = throwable;
            boolean bl = false;
            INSTANCE.releaseEffect();
        }
    }

    /*
     * WARNING - void declaration
     */
    private final PostEffectProcessor ensureProcessor(float currentSaturation) {
        void var4_8;
        void var1_1;
        Object $this$ensureProcessor_u24lambda_u240;
        PostEffectProcessor existingProcessor = processor;
        if (existingProcessor != null) {
            boolean bl = currentSaturation == cachedSaturation;
            if (bl) {
                return existingProcessor;
            }
        }
        this.releaseProcessor();
        ProjectionMatrix2 newProjectionMatrix = new ProjectionMatrix2("rain_color_saturation", 0.05f, 1000.0f, false);
        Object object = this;
        try {
            $this$ensureProcessor_u24lambda_u240 = object;
            boolean bl = false;
            $this$ensureProcessor_u24lambda_u240 = Result.constructor-impl(PostEffectProcessor.parseEffect((PostEffectPipeline)super.createPipeline(currentSaturation), (TextureManager)\u0636\u0643.getMc().getTextureManager(), (Set)DefaultFramebufferSet.MAIN_ONLY, (Identifier)effectId, (ProjectionMatrix2)newProjectionMatrix));
        }
        catch (Throwable bl) {
            $this$ensureProcessor_u24lambda_u240 = Result.constructor-impl(ResultKt.createFailure(bl));
        }
        object = $this$ensureProcessor_u24lambda_u240;
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
        projectionMatrix = newProjectionMatrix;
        processor = newProcessor;
        cachedSaturation = var1_1;
        return var4_8;
    }

    static {
        INSTANCE = new \u0652();
        saturation = Module.slider$default(INSTANCE, "\u041d\u0430\u0441\u044b\u0449\u0435\u043d\u043d\u043e\u0441\u0442\u044c", 1.35f, 0.0f, 2.0f, 0.05f, null, 32, null);
        Identifier identifier = Identifier.of((String)"rain", (String)"color_saturation");
        Intrinsics.checkNotNullExpressionValue(identifier, "fromNamespaceAndPath(...)");
        effectId = identifier;
        Identifier identifier2 = Identifier.of((String)"rain", (String)"color_saturation_swap");
        Intrinsics.checkNotNullExpressionValue(identifier2, "fromNamespaceAndPath(...)");
        swapTargetId = identifier2;
        Identifier identifier3 = Identifier.of((String)"minecraft", (String)"core/screenquad");
        Intrinsics.checkNotNullExpressionValue(identifier3, "fromNamespaceAndPath(...)");
        screenQuadShaderId = identifier3;
        Identifier identifier4 = Identifier.of((String)"minecraft", (String)"post/blit");
        Intrinsics.checkNotNullExpressionValue(identifier4, "fromNamespaceAndPath(...)");
        blitShaderId = identifier4;
        Identifier identifier5 = Identifier.of((String)"rain", (String)"post/saturation");
        Intrinsics.checkNotNullExpressionValue(identifier5, "fromNamespaceAndPath(...)");
        saturationShaderId = identifier5;
        cachedSaturation = Float.NaN;
    }
}

