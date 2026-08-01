/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.modules.render;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.Optional;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.extensions.a_0;
import kotakbaz.rain.client.extensions.b;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import net.minecraft.client.gl.PostEffectPipeline;
import net.minecraft.client.gl.PostEffectProcessor;
import net.minecraft.client.gl.UniformValue;
import net.minecraft.client.render.DefaultFramebufferSet;
import net.minecraft.client.render.ProjectionMatrix2;
import net.minecraft.client.texture.TextureManager;
import net.minecraft.client.util.ObjectAllocator;
import net.minecraft.client.util.Pool;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector4f;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0003R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u001c\u0010\u0019\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u001c\u0010\u001a\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b#\u0010$\u00a8\u0006%"}, d2={"Lkotakbaz/rain/module/modules/render/ModuleAspectRatio;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "onDisable", "renderWorldIfNeeded", "", "currentRatio", "Lnet/minecraft/class_279;", "ensureProcessor", "(F)Lnet/minecraft/class_279;", "Lnet/minecraft/class_9962;", "createPipeline", "(F)Lnet/minecraft/class_9962;", "releaseEffect", "releaseProcessor", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "ratio", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "Lnet/minecraft/class_2960;", "kotlin.jvm.PlatformType", "effectId", "Lnet/minecraft/class_2960;", "swapTargetId", "blitShaderId", "aspectShaderId", "cachedRatio", "F", "processor", "Lnet/minecraft/class_279;", "Lnet/minecraft/class_11278;", "projectionMatrix", "Lnet/minecraft/class_11278;", "Lnet/minecraft/class_9920;", "renderPool", "Lnet/minecraft/class_9920;", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nModuleAspectRatio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModuleAspectRatio.kt\nkotakbaz/rain/module/modules/render/ModuleAspectRatio\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n1#2:152\n*E\n"})
public final class ModuleAspectRatio
extends Module {
    @NotNull
    public static final ModuleAspectRatio INSTANCE;
    @NotNull
    private static final SliderSetting a;
    private static final Identifier A;
    private static final Identifier b;
    private static final Identifier B;
    private static final Identifier c;
    private static float C;
    @Nullable
    private static PostEffectProcessor d;
    @Nullable
    private static ProjectionMatrix2 D;
    @Nullable
    private static Pool e;
    private static Object[] E;
    private static Object F;
    private static Object[] g;
    private static Object[] f;
    private static Object[] G;
    public static int[] h;

    private ModuleAspectRatio() {
        int n2 = h[0];
        n2 ^= h[1];
        int n3 = h[3];
        n3 += h[4];
        int n4 = h[6];
        n4 ^= h[7];
        super((String)E[n2 -= h[2]], a_0.getRENDER(), (String)E[n3 ^= h[5]] + (String)E[n4 ^= h[8]]);
    }

    @Override
    public void onDisable() {
        this.releaseEffect();
    }

    public final void renderWorldIfNeeded() {
        block7: {
            Object object;
            Object object2;
            long l2 = 3054784870840622313L;
            long l3 = 1701067783081849573L;
            if (!this.isEnabled()) {
                return;
            }
            if (kotakbaz.rain.client.extensions.b.getMc().world == null || kotakbaz.rain.client.extensions.b.getMc().player == null) {
                return;
            }
            float f2 = ((Number)a.getValue()).floatValue();
            if (Math.abs(f2 - 1.0f) <= 0.001f) {
                return;
            }
            PostEffectProcessor postEffectProcessor = this.ensureProcessor(f2);
            if (postEffectProcessor == null) {
                return;
            }
            PostEffectProcessor postEffectProcessor2 = postEffectProcessor;
            Object object3 = e;
            if (object3 == null) {
                int n2 = h[9];
                n2 -= h[10];
                object = object2 = new Pool(n2 -= h[11]);
                long l4 = l3;
                int n3 = h[12];
                n3 -= h[13];
                l3 = l4 ^ (0L ^ l4) & -1L << (n3 += h[14]);
                e = object;
                object3 = object2;
            }
            Pool pool = object3;
            Object object4 = this;
            try {
                object2 = object4;
                long l5 = l2;
                int n4 = h[15];
                n4 += h[16];
                l2 = l5 ^ (0L ^ l5) & -1L >>> (n4 -= h[17]);
                RenderSystem.resetTextureMatrix();
                postEffectProcessor2.render(kotakbaz.rain.client.extensions.b.getMc().getFramebuffer(), (ObjectAllocator)pool);
                pool.decrementLifespan();
                object2 = Result.cfr_renamed_1(Unit.INSTANCE);
            }
            catch (Throwable throwable) {
                object2 = Result.cfr_renamed_1(ResultKt.createFailure(throwable));
            }
            object4 = object2;
            Throwable throwable = Result.cfr_renamed_2(object4);
            if (throwable == null) break block7;
            object = object2 = throwable;
            long l6 = l3;
            int n5 = h[18];
            n5 -= h[19];
            l3 = l6 ^ (0L ^ l6) & -1L << (n5 -= h[20]);
            INSTANCE.releaseEffect();
        }
    }

    private final PostEffectProcessor ensureProcessor(float currentRatio) {
        Object object;
        long l2 = 5248326976716558734L;
        PostEffectProcessor postEffectProcessor = d;
        if (postEffectProcessor != null) {
            int n2;
            if (currentRatio == C) {
                int n3 = h[21];
                n3 ^= h[22];
                n2 = n3 -= h[23];
            } else {
                int n4 = h[24];
                n4 -= h[25];
                n2 = n4 += h[26];
            }
            if (n2 != 0) {
                return postEffectProcessor;
            }
        }
        this.releaseProcessor();
        int n5 = h[27];
        n5 -= h[28];
        int n6 = h[30];
        n6 -= h[31];
        boolean bl = h[33];
        bl += h[34];
        ProjectionMatrix2 projectionMatrix2 = new ProjectionMatrix2((String)E[n5 ^= h[29]] + (String)E[n6 -= h[32]], 0.05f, 1000.0f, bl += h[35]);
        Object object2 = this;
        try {
            object = object2;
            long l3 = l2;
            int n7 = h[36];
            n7 ^= h[37];
            l2 = l3 ^ (0L ^ l3) & -1L << (n7 ^= h[38]);
            object = Result.cfr_renamed_1(PostEffectProcessor.parseEffect((PostEffectPipeline)super.createPipeline(currentRatio), (TextureManager)kotakbaz.rain.client.extensions.b.getMc().getTextureManager(), (Set)DefaultFramebufferSet.MAIN_ONLY, (Identifier)A, (ProjectionMatrix2)projectionMatrix2));
        }
        catch (Throwable throwable) {
            object = Result.cfr_renamed_1(ResultKt.createFailure(throwable));
        }
        object2 = object;
        Throwable throwable = Result.cfr_renamed_2(object2);
        if (throwable != null) {
            object = throwable;
            long l4 = l2;
            int n8 = h[39];
            n8 -= h[40];
            l2 = l4 ^ (0L ^ l4) & -1L << (n8 -= h[41]);
            projectionMatrix2.close();
            return null;
        }
        PostEffectProcessor postEffectProcessor2 = (PostEffectProcessor)object2;
        D = projectionMatrix2;
        d = postEffectProcessor2;
        C = currentRatio;
        return postEffectProcessor2;
    }

    private final PostEffectPipeline createPipeline(float currentRatio) {
        int n2 = h[42];
        n2 ^= h[43];
        n2 -= h[44];
        boolean bl = h[45];
        bl ^= h[46];
        boolean bl2 = h[48];
        bl2 -= h[49];
        int n3 = h[51];
        n3 -= h[52];
        PostEffectPipeline.Pass pass = new PostEffectPipeline.Pass(B, c, CollectionsKt.listOf(new PostEffectPipeline.TargetSampler((String)E[n2], DefaultFramebufferSet.MAIN, bl -= h[47], bl2 ^= h[50])), b, MapsKt.mapOf(TuplesKt.to((String)E[n3 += h[53]], CollectionsKt.listOf(new UniformValue.FloatValue(currentRatio)))));
        int n4 = h[54];
        n4 += h[55];
        n4 += h[56];
        boolean bl3 = h[57];
        bl3 ^= h[58];
        boolean bl4 = h[60];
        bl4 -= h[61];
        int n5 = h[63];
        n5 += h[64];
        PostEffectPipeline.Pass pass2 = new PostEffectPipeline.Pass(B, B, CollectionsKt.listOf(new PostEffectPipeline.TargetSampler((String)E[n4], b, bl3 -= h[59], bl4 ^= h[62])), DefaultFramebufferSet.MAIN, MapsKt.mapOf(TuplesKt.to((String)E[n5 -= h[65]], CollectionsKt.listOf(new UniformValue.Vec4fValue(new Vector4f(1.0f, 1.0f, 1.0f, 1.0f))))));
        boolean bl5 = h[66];
        bl5 += h[67];
        bl5 += h[68];
        int n6 = h[69];
        n6 -= h[70];
        n6 += h[71];
        int n7 = h[72];
        n7 ^= h[73];
        PostEffectPipeline.Pass[] passArray = new PostEffectPipeline.Pass[n7 -= h[74]];
        int n8 = h[75];
        n8 -= h[76];
        passArray[n8 ^= ModuleAspectRatio.h[77]] = pass;
        int n9 = h[78];
        n9 ^= h[79];
        passArray[n9 -= ModuleAspectRatio.h[80]] = pass2;
        return new PostEffectPipeline(MapsKt.mapOf(TuplesKt.to(b, new PostEffectPipeline.Targets(Optional.empty(), Optional.empty(), bl5, n6))), CollectionsKt.listOf(passArray));
    }

    private final void releaseEffect() {
        this.releaseProcessor();
        Pool pool = e;
        if (pool != null) {
            pool.close();
        }
        e = null;
        C = Float.NaN;
    }

    private final void releaseProcessor() {
        block2: {
            PostEffectProcessor postEffectProcessor = d;
            if (postEffectProcessor != null) {
                postEffectProcessor.close();
            }
            d = null;
            ProjectionMatrix2 projectionMatrix2 = D;
            if (projectionMatrix2 != null) {
                projectionMatrix2.close();
            }
            D = null;
            Pool pool = e;
            if (pool == null) break block2;
            pool.clear();
        }
    }

    static {
        ModuleAspectRatio.b();
        long l2 = 4321058388021075655L;
        long l3 = -351236965732551516L;
        long l4 = -8865703404564874181L;
        long l5 = -2717797706194675542L;
        long l6 = 8207257736988297688L;
        long l7 = -5960159060941713981L;
        long l8 = 1976664370903291982L;
        long l9 = 4852586108492369136L;
        long l10 = 705106430870489786L;
        long l11 = -7832549560093580671L;
        long l12 = 7741801942424930363L;
        long l13 = -5431731638548493368L;
        long l14 = 4205860184867992260L;
        long l15 = -901546563456975856L;
        int n2 = h[81];
        n2 ^= h[82];
        E = new Object[n2 -= h[83]];
        long l16 = l15;
        int n3 = h[84];
        n3 += h[85];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= h[86]);
        Object[] objectArray = new Object[h[87]];
        objectArray[ModuleAspectRatio.h[88]] = f;
        objectArray[ModuleAspectRatio.h[89]] = h[90];
        int n4 = h[91];
        Object object = ModuleAspectRatio.A()[h[92]];
        if (object == null) {
            char[] cArray = "\uea88\ueaf1\uea90\ueaf0\ueaed\ueac3\uead0\ueade\uead3\ueaf8\uead8\ueae3\ueaf3\ueac1\ueac9\uead8\uea90\ueac6\ueaf9\uea97\ueaf4\uea89\ueae3\uea27\ueac9\ueae5\ueafb\ueaee\uead7\ueac0\ueade\ueae2\ueacc\uead9\ueac9\uead0\ueafc\ueae9\uea86\ueae2\uea20\uea89\ueac3\ueadb\ueafc\uead8\ueaf8\uead0\uead0\ueae6\ueafc\ueafe\ueafb\uea8f\ueaed\uea20\uea90\uead0\ueac3\ueae5\ueaed\uea8e\ueace\uea21\ueae9\uead7\ueacc\ueae3\ueaea\ueae2\ueaec\ueaef\uead3\ueae8\ueaf0\ueaf7\ueae2\ueaea\uead7\ueafd\ueac1\ueac0\ueaf9\ueac6\uea21\uea9c\uea89\ueae6\ueafd\ueac9\uea90\ueae8\ueaee\uead9\ueac7\ueac6\uead1\ueaef\ueace\uea22\ueaed\ueaf3\uea21\uea86\ueada\uea20\uea86\ueae8\uea8e\uea20\ueac9\ueada\uea27\uea8f\uea9c\uea20\uead0\ueac2\ueac5\uead1\uea97\uea8a\uea22\ueadd\ueaf0\ueaf0\ueaf3\ueae3\ueac5\uea8d\ueac2\ueade\uea86\ueae2\uea90\ueac2\ueac7\ueaec\ueafc\uea8a\ueac9\uead3\ueaf9\uea22\uea83\ueafd\uead8\ueaf0\uea8f\uead1\uea8a\uead4\ueac3\ueae5\ueae3\uead8\uea83\uea8f\uea86\uea90\ueafc\uea22\uea88\uea22\ueaf1\ueaef\uea21\ueafe\ueafb\uea8a\uea86\uea8d\uead3\ueac2\uead3\uea90\ueac7\ueacc\ueafd\uea8f\ueaf1\ueade\ueaf3\ueac9\ueae2\uea20\uea8a\uea86\uead9\uea89\ueaed\ueaca\ueafe\ueac7\ueaf0\ueada\ueac7\uea27\ueaf7\ueaee\uead8\ueacf\uea8f\uea89\ueafa\ueaf9\ueaec\uead8\ueac8\uea8d\ueaea\ueac1\ueade\uead7\ueabc\ueafa\ueafe\ueac6\uea21\ueaee\uea21\uead0\ueada\uea86\ueacf\ueac6\uea22\ueadb\ueade\ueaf9\uead0\uead9\ueafe\ueace\ueac7\ueacd\ueada\ueae3\ueae3\ueabc\uea8d\uea20\uea89\ueacf\ueafd\ueaf8\ueac0\uea83\uea8a\ueafa\uead0\uea21\ueaf9\ueadd\uea8d\ueae6\ueaf7\ueac6\uea97\ueacc\ueaf9\ueae8\ueace\ueac6\ueaf8\ueac9\ueaef\ueada\ueac7\ueadb\ueac5\uea21\uea22\ueafa\uead7\uea8e\ueacc\ueac8\ueae8\ueae8\ueac8\ueac2\uea89\ueac6\ueacf\uead4\uea90\ueac3\ueafa\uea27\uea8f\ueacd\uea8a\uea83\uea83\ueaf0\ueae3\uead3\ueae2\ueac9\uead9\uea9c\uea8e\uea86\ueac8\ueafc\ueaea\ueaf3\ueae6\ueaec\ueafa\ueaf1\ueafa\ueac5\ueaec\ueaf0\ueacd\ueadb\ueace\ueac8\ueac9\ueae5\ueace\uea90\ueac9\ueafb\ueac3\ueaf7\ueac7\ueaea\ueaca\uead9\ueac3\ueafa\ueadb\uead1\ueae3\uea97\ueac5\ueace\ueacd\ueae8\uead9\ueaf1\uea22\ueafe\ueac7\ueafd\uea97\uea90\uea27\uea21\ueafc\uea9c\ueaec\uead0\ueafb\ueaea\uea8e\ueacf\uea27\ueac3\ueaca\uea84".toCharArray();
            for (int i2 = h[93]; i2 < h[94]; ++i2) {
                int n5 = cArray[i2];
                n5 -= h[95];
                n5 ^= h[96];
                n5 ^= h[97];
                n5 ^= h[98];
                n5 -= h[99];
                n5 ^= h[100];
                n5 ^= h[101];
                n5 -= h[102];
                n5 += h[103];
                n5 ^= h[104];
                n5 ^= h[105];
                n5 ^= h[106];
                cArray[i2] = (char)(n5 += h[107]);
            }
            object = ModuleAspectRatio.A()[ModuleAspectRatio.h[108]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)ModuleAspectRatio.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = h[109];
        n6 -= h[110];
        l6 = l17 ^ (0xD100000000L ^ l17) & -1L << (n6 -= h[111]);
        long l18 = l13;
        int n7 = h[112];
        n7 -= h[113];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 += h[114]);
        while (true) {
            int n8 = h[115];
            n8 ^= h[116];
            if ((int)l13 >= (int)(l6 >>> (n8 += h[117]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = h[118];
            n10 ^= h[119];
            int n11 = h[121];
            n11 -= h[122];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 -= h[120])) & -1L >>> (n11 -= h[123]);
            long l20 = l9;
            int n12 = h[124];
            n12 += h[125];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 -= h[126]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = h[127];
            n14 += h[128];
            int n15 = h[130];
            n15 -= h[131];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 += h[129])) & -1L >>> (n15 -= h[132]);
            int n16 = h[133];
            n16 ^= h[134];
            long l22 = l10;
            int n17 = h[136];
            n17 ^= h[137];
            l10 = l22 ^ ((long)cArray[n13] << (n16 += h[135]) ^ l22) & -1L << (n17 ^= h[138]);
            int n18 = h[139];
            n18 += h[140];
            n18 ^= h[141];
            int n19 = h[142];
            n19 -= h[143];
            long l23 = l12;
            int n20 = h[145];
            n20 -= h[146];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 -= h[144]))) ^ l23) & -1L >>> (n20 -= h[147]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = h[148];
            n21 -= h[149];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 += h[150]);
            while (true) {
                int n22 = h[151];
                n22 ^= h[152];
                if ((int)(l14 >>> (n22 += h[153])) >= (int)l12) break;
                int n23 = h[154];
                n23 ^= h[155];
                int n24 = h[157];
                n24 -= h[158];
                cArray2[(int)(l14 >>> (n23 ^= ModuleAspectRatio.h[156]))] = cArray[(int)l13 + (int)(l14 >>> (n24 -= h[159]))];
                l14 += 0x100000000L;
            }
            int n25 = h[160];
            n25 -= h[161];
            int n26 = (int)(l15 >>> (n25 -= h[162]));
            l15 += 0x100000000L;
            ModuleAspectRatio.E[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = h[163];
            n27 ^= h[164];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 += h[165]);
        }
        INSTANCE = new ModuleAspectRatio();
        int n28 = h[166];
        n28 += h[167];
        a = INSTANCE.slider((String)E[n28 += h[168]], 1.0f, 1.0f, 2.0f, 0.01f);
        int n29 = h[169];
        n29 ^= h[170];
        int n30 = h[172];
        n30 ^= h[173];
        A = Identifier.of((String)((String)E[n29 -= h[171]]), (String)((String)E[n30 ^= h[174]]));
        int n31 = h[175];
        n31 += h[176];
        n31 ^= h[177];
        int n32 = h[178];
        n32 -= h[179];
        int n33 = h[181];
        n33 += h[182];
        int n34 = h[184];
        n34 ^= h[185];
        b = Identifier.of((String)((String)E[n31]), (String)((String)E[n32 -= h[180]] + (String)E[n33 += h[183]] + (String)E[n34 ^= h[186]]));
        int n35 = h[187];
        n35 ^= h[188];
        int n36 = h[190];
        n36 -= h[191];
        B = Identifier.of((String)((String)E[n35 ^= h[189]]), (String)((String)E[n36 ^= h[192]]));
        int n37 = h[193];
        n37 += h[194];
        int n38 = h[196];
        n38 -= h[197];
        int n39 = h[199];
        n39 += h[200];
        c = Identifier.of((String)((String)E[n37 ^= h[195]]), (String)((String)E[n38 ^= h[198]] + (String)E[n39 -= h[201]]));
        C = Float.NaN;
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[h[202]];
        String string = (String)object[h[203]];
        object = object[h[204]];
        Object[] objectArray = g;
        if (g == null) {
            objectArray = g = new Object[h[205]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[h[206]];
                f = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[h[208] ^ h[209]];
                byArray[ModuleAspectRatio.h[210] ^ ModuleAspectRatio.h[211]] = h[212] ^ h[213];
                byArray[ModuleAspectRatio.h[214] ^ ModuleAspectRatio.h[215]] = h[216] ^ h[217];
                byArray[ModuleAspectRatio.h[218] ^ ModuleAspectRatio.h[219]] = h[220] ^ h[221];
                byArray[ModuleAspectRatio.h[222] ^ ModuleAspectRatio.h[223]] = h[224] ^ h[225];
                byArray[ModuleAspectRatio.h[226] ^ ModuleAspectRatio.h[227]] = h[228] ^ h[229];
                byArray[ModuleAspectRatio.h[230] ^ ModuleAspectRatio.h[231]] = h[232] ^ h[233];
                byArray[ModuleAspectRatio.h[234] ^ ModuleAspectRatio.h[235]] = h[236] ^ h[237];
                byArray[ModuleAspectRatio.h[238] ^ ModuleAspectRatio.h[239]] = h[240] ^ h[241];
                byArray[ModuleAspectRatio.h[242] ^ ModuleAspectRatio.h[243]] = h[244] ^ h[245];
                byArray[ModuleAspectRatio.h[246] ^ ModuleAspectRatio.h[247]] = h[248] ^ h[249];
                byArray[ModuleAspectRatio.h[250] ^ ModuleAspectRatio.h[251]] = h[252] ^ h[253];
                byArray[ModuleAspectRatio.h[254] ^ ModuleAspectRatio.h[255]] = h[256] ^ h[257];
                byArray[ModuleAspectRatio.h[258] ^ ModuleAspectRatio.h[259]] = h[260] ^ h[261];
                byArray[ModuleAspectRatio.h[262] ^ ModuleAspectRatio.h[263]] = h[264] ^ h[265];
                byArray[ModuleAspectRatio.h[266] ^ ModuleAspectRatio.h[267]] = h[268] ^ h[269];
                byArray[ModuleAspectRatio.h[270] ^ ModuleAspectRatio.h[271]] = h[272] ^ h[273];
                objectArray2[ModuleAspectRatio.h[207]] = byArray;
            }
            byte[] byArray = (byte[])object3[h[274]];
            if (F == null) {
                byte[] byArray2 = new byte[h[275] ^ h[276]];
                byArray2[ModuleAspectRatio.h[277] ^ ModuleAspectRatio.h[278]] = h[279] ^ h[280];
                byArray2[ModuleAspectRatio.h[281] ^ ModuleAspectRatio.h[282]] = h[283] ^ h[284];
                byArray2[ModuleAspectRatio.h[285] ^ ModuleAspectRatio.h[286]] = h[287] ^ h[288];
                byArray2[ModuleAspectRatio.h[289] ^ ModuleAspectRatio.h[290]] = h[291] ^ h[292];
                byArray2[ModuleAspectRatio.h[293] ^ ModuleAspectRatio.h[294]] = h[295] ^ h[296];
                byArray2[ModuleAspectRatio.h[297] ^ ModuleAspectRatio.h[298]] = h[299] ^ h[300];
                byArray2[ModuleAspectRatio.h[301] ^ ModuleAspectRatio.h[302]] = h[303] ^ h[304];
                byArray2[ModuleAspectRatio.h[305] ^ ModuleAspectRatio.h[306]] = h[307] ^ h[308];
                byArray2[ModuleAspectRatio.h[309] ^ ModuleAspectRatio.h[310]] = h[311] ^ h[312];
                byArray2[ModuleAspectRatio.h[313] ^ ModuleAspectRatio.h[314]] = h[315] ^ h[316];
                byArray2[ModuleAspectRatio.h[317] ^ ModuleAspectRatio.h[318]] = h[319] ^ h[320];
                byArray2[ModuleAspectRatio.h[321] ^ ModuleAspectRatio.h[322]] = h[323] ^ h[324];
                byArray2[ModuleAspectRatio.h[325] ^ ModuleAspectRatio.h[326]] = h[327] ^ h[328];
                byArray2[ModuleAspectRatio.h[329] ^ ModuleAspectRatio.h[330]] = h[331] ^ h[332];
                byArray2[ModuleAspectRatio.h[333] ^ ModuleAspectRatio.h[334]] = h[335] ^ h[336];
                byArray2[ModuleAspectRatio.h[337] ^ ModuleAspectRatio.h[338]] = h[339] ^ h[340];
                byArray2[ModuleAspectRatio.h[341] ^ ModuleAspectRatio.h[342]] = h[343] ^ h[344];
                byArray2[ModuleAspectRatio.h[345] ^ ModuleAspectRatio.h[346]] = h[347] ^ h[348];
                byArray2[ModuleAspectRatio.h[349] ^ ModuleAspectRatio.h[350]] = h[351] ^ h[352];
                byArray2[ModuleAspectRatio.h[353] ^ ModuleAspectRatio.h[354]] = h[355] ^ h[356];
                byArray2[ModuleAspectRatio.h[357] ^ ModuleAspectRatio.h[358]] = h[359] ^ h[360];
                byArray2[ModuleAspectRatio.h[361] ^ ModuleAspectRatio.h[362]] = h[363] ^ h[364];
                byArray2[ModuleAspectRatio.h[365] ^ ModuleAspectRatio.h[366]] = h[367] ^ h[368];
                byArray2[ModuleAspectRatio.h[369] ^ ModuleAspectRatio.h[370]] = h[371] ^ h[372];
                byArray2[ModuleAspectRatio.h[373] ^ ModuleAspectRatio.h[374]] = h[375] ^ h[376];
                byArray2[ModuleAspectRatio.h[377] ^ ModuleAspectRatio.h[378]] = h[379] ^ h[380];
                byArray2[ModuleAspectRatio.h[381] ^ ModuleAspectRatio.h[382]] = h[383] ^ h[384];
                byArray2[ModuleAspectRatio.h[385] ^ ModuleAspectRatio.h[386]] = h[387] ^ h[388];
                byArray2[ModuleAspectRatio.h[389] ^ ModuleAspectRatio.h[390]] = h[391] ^ h[392];
                byArray2[ModuleAspectRatio.h[393] ^ ModuleAspectRatio.h[394]] = h[395] ^ h[396];
                byArray2[ModuleAspectRatio.h[397] ^ ModuleAspectRatio.h[398]] = h[399] ^ 0xD3D;
                byArray2[0xED23 ^ 0xED32] = 0xED0C ^ 0xED32;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = ModuleAspectRatio.A()[1];
                if (object4 == null) {
                    char[] cArray = "\ud725\ud733\ud72a\ud729\ud737\ue8c3\ud726\ud70c\ue8f9\ud70d\ud72d\ud700\ud714\ud712\ud722\ud72d\ud734\ue8c4".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= 0xC8E1;
                        n3 += 29444;
                        n3 -= 7077;
                        n3 -= 42566;
                        n3 += 18535;
                        n3 ^= 0x4EE7;
                        n3 += 47113;
                        n3 -= 59022;
                        n3 -= 11536;
                        n3 -= 8370;
                        n3 -= 65108;
                        n3 += 25300;
                        n3 += 54358;
                        n3 += 33238;
                        n3 -= 33463;
                        n3 += 28316;
                        cArray[i2] = (char)(n3 ^= 0x81BD);
                    }
                    object4 = ModuleAspectRatio.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[15] = 55;
                byArray4[1] = 10;
                byArray4[8] = 110;
                byArray4[9] = -54;
                byArray4[12] = -72;
                byArray4[7] = -23;
                byArray4[0] = 46;
                byArray4[14] = -103;
                byArray4[11] = 118;
                byArray4[10] = 112;
                byArray4[6] = 30;
                byArray4[13] = 60;
                byArray4[2] = -57;
                byArray4[5] = -115;
                byArray4[4] = 71;
                byArray4[3] = 111;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 9, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = ModuleAspectRatio.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u54fa\ua306\u54e8".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= 64448;
                        n4 ^= 0xA5D0;
                        n4 += 61282;
                        n4 += 35042;
                        n4 ^= 0x82D3;
                        n4 += 22676;
                        n4 ^= 0x84B4;
                        n4 += 53797;
                        n4 += 13783;
                        n4 += 20440;
                        n4 -= 60777;
                        cArray[i3] = (char)(n4 -= 15951);
                    }
                    object5 = ModuleAspectRatio.A()[2] = new String(cArray);
                }
                F = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = ModuleAspectRatio.A()[3];
            if (object6 == null) {
                char[] cArray = "\uf386\uf392\uf398\uf37c\uf388\uf389\uf388\uf37c\uf397\uf390\uf388\uf398\uf382\uf397\uf326\uf333\uf333\uf30e\uf33d\uf334".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 ^= 0xC620;
                    n5 ^= 0x9431;
                    n5 += 22754;
                    n5 ^= 0xE954;
                    n5 += 11797;
                    n5 += 8645;
                    n5 -= 25989;
                    n5 += 42406;
                    n5 -= 55927;
                    n5 += 10846;
                    cArray[i4] = (char)(n5 -= 62158);
                }
                object6 = ModuleAspectRatio.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)F), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = G;
        if (G == null) {
            G = new Object[4];
            objectArray = G;
        }
        return objectArray;
    }

    public static void b() {
        h = new int[0x10371 ^ 0x102E1];
        ModuleAspectRatio.h[0x3DEB ^ 0x3CA7] = 0x80AB ^ 0x3CA7;
        ModuleAspectRatio.h[0x93F9 ^ 0x92C6] = 0xFFFF716E ^ 0x92C6;
        ModuleAspectRatio.h[0x57B0 ^ 0x5762] = 0x508D ^ 0x5762;
        ModuleAspectRatio.h[0xB39E ^ 0xB380] = 0xB396 ^ 0xB380;
        ModuleAspectRatio.h[0xA91C ^ 0xA937] = 0xFFFF5688 ^ 0xA937;
        ModuleAspectRatio.h[0x548F ^ 0x5496] = 0x549A ^ 0x5496;
        ModuleAspectRatio.h[0x85FA ^ 0x85D8] = 0x85C8 ^ 0x85D8;
        ModuleAspectRatio.h[0xC1C1 ^ 0xC093] = 0x441 ^ 0xC093;
        ModuleAspectRatio.h[0x4B28 ^ 0x4BE9] = 0xFFFFB454 ^ 0x4BE9;
        ModuleAspectRatio.h[0xD7CF ^ 0xD796] = 0xD797 ^ 0xD796;
        ModuleAspectRatio.h[0x7131 ^ 0x71D4] = 0x6A ^ 0x71D4;
        ModuleAspectRatio.h[0x57EC ^ 0x57A4] = 0xFFFFA82D ^ 0x57A4;
        ModuleAspectRatio.h[0x103B8 ^ 0x1029F] = 0xFFFFFF8B ^ 0x1029F;
        ModuleAspectRatio.h[0x9031 ^ 0x9086] = 0xFFFF6F44 ^ 0x9086;
        ModuleAspectRatio.h[0x8D88 ^ 0x8DAC] = 0x8D98 ^ 0x8DAC;
        ModuleAspectRatio.h[0xDDBF ^ 0xDD98] = 0xDD92 ^ 0xDD98;
        ModuleAspectRatio.h[0xAE5F ^ 0xAE04] = 0xAE06 ^ 0xAE04;
        ModuleAspectRatio.h[0x66ED ^ 0x67F8] = 0xE30B ^ 0x67F8;
        ModuleAspectRatio.h[0xC287 ^ 0xC398] = 0x5CB6 ^ 0xC398;
        ModuleAspectRatio.h[0xB38B ^ 0xB286] = 0xC599 ^ 0xB286;
        ModuleAspectRatio.h[0x3C0C ^ 0x3C64] = 0x68F2 ^ 0x3C64;
        ModuleAspectRatio.h[0xDB75 ^ 0xDA22] = 0x9A38 ^ 0xDA22;
        ModuleAspectRatio.h[0xE5C0 ^ 0xE482] = 0xDE8C ^ 0xE482;
        ModuleAspectRatio.h[0xB3F5 ^ 0xB3DB] = 0xB3EC ^ 0xB3DB;
        ModuleAspectRatio.h[0x541D ^ 0x544F] = 0xFFFFABFE ^ 0x544F;
        ModuleAspectRatio.h[0x453D ^ 0x45E7] = 0x448B ^ 0x45E7;
        ModuleAspectRatio.h[0xC022 ^ 0xC0B9] = 0xFFFF3F21 ^ 0xC0B9;
        ModuleAspectRatio.h[0x3F16 ^ 0x3E47] = 0xFA83 ^ 0x3E47;
        ModuleAspectRatio.h[0x11B ^ 0x18F] = 0xFFFFFEDD ^ 0x18F;
        ModuleAspectRatio.h[0x39C8 ^ 0x3847] = 0x356A ^ 0x3847;
        ModuleAspectRatio.h[0xCDD4 ^ 0xCD24] = 0xFFFFEE3B ^ 0xCD24;
        ModuleAspectRatio.h[0x35C5 ^ 0x354E] = 0x3552 ^ 0x354E;
        ModuleAspectRatio.h[0x10B49 ^ 0x10BBE] = 0x16DEE ^ 0x10BBE;
        ModuleAspectRatio.h[0xF63C ^ 0xF771] = 0x9DFD ^ 0xF771;
        ModuleAspectRatio.h[0x1C3E ^ 0x1D3C] = 0x4ACB ^ 0x1D3C;
        ModuleAspectRatio.h[0x486F ^ 0x482A] = 0x483F ^ 0x482A;
        ModuleAspectRatio.h[0xEBA6 ^ 0xEAEF] = 0x56FC ^ 0xEAEF;
        ModuleAspectRatio.h[0xB8EF ^ 0xB8FE] = 0xFFFF475D ^ 0xB8FE;
        ModuleAspectRatio.h[0x1EE3 ^ 0x1F62] = 0xBF57 ^ 0x1F62;
        ModuleAspectRatio.h[0x82DA ^ 0x83A0] = 0x137C ^ 0x83A0;
        ModuleAspectRatio.h[0xB3C9 ^ 0xB30F] = 0xB374 ^ 0xB30F;
        ModuleAspectRatio.h[0xE7D4 ^ 0xE7BF] = 0xE381 ^ 0xE7BF;
        ModuleAspectRatio.h[0x3C33 ^ 0x3C94] = 0xFFFFC32E ^ 0x3C94;
        ModuleAspectRatio.h[0xC495 ^ 0xC48A] = 0xC4FE ^ 0xC48A;
        ModuleAspectRatio.h[0xD25B ^ 0xD249] = 0xD200 ^ 0xD249;
        ModuleAspectRatio.h[0xB0CB ^ 0xB0A4] = 0xB0C3 ^ 0xB0A4;
        ModuleAspectRatio.h[0x3381 ^ 0x32DF] = 0xEF64 ^ 0x32DF;
        ModuleAspectRatio.h[0x2775 ^ 0x26FE] = 0x7D8D ^ 0x26FE;
        ModuleAspectRatio.h[0x2521 ^ 0x25B8] = 0xFFFFDA1D ^ 0x25B8;
        ModuleAspectRatio.h[0xBB12 ^ 0xBA4A] = 0xFA5C ^ 0xBA4A;
        ModuleAspectRatio.h[0xD01F ^ 0xD13B] = 0xB264 ^ 0xD13B;
        ModuleAspectRatio.h[0x8AF3 ^ 0x8A75] = 0x8A50 ^ 0x8A75;
        ModuleAspectRatio.h[0xDED4 ^ 0xDFBB] = 0x2118 ^ 0xDFBB;
        ModuleAspectRatio.h[0x2241 ^ 0x221F] = 0x2373 ^ 0x221F;
        ModuleAspectRatio.h[0x33D6 ^ 0x336B] = 0x3376 ^ 0x336B;
        ModuleAspectRatio.h[0xE4DA ^ 0xE4DF] = 0xFFFF1B7B ^ 0xE4DF;
        ModuleAspectRatio.h[0xDE80 ^ 0xDEBE] = 0xFFFF2164 ^ 0xDEBE;
        ModuleAspectRatio.h[0x4602 ^ 0x46CA] = 0xFFFFB945 ^ 0x46CA;
        ModuleAspectRatio.h[0xF127 ^ 0xF160] = 0xFFFF0EE4 ^ 0xF160;
        ModuleAspectRatio.h[0x2134 ^ 0x21B3] = 0x219C ^ 0x21B3;
        ModuleAspectRatio.h[0x69B2 ^ 0x6884] = 0xB593 ^ 0x6884;
        ModuleAspectRatio.h[0xF160 ^ 0xF01F] = 0x1CB2 ^ 0xF01F;
        ModuleAspectRatio.h[0x833B ^ 0x8389] = 0xFFFF7C41 ^ 0x8389;
        ModuleAspectRatio.h[0xEE31 ^ 0xEE7B] = 0xEE55 ^ 0xEE7B;
        ModuleAspectRatio.h[0x50B9 ^ 0x5001] = 0x5053 ^ 0x5001;
        ModuleAspectRatio.h[0x9EF2 ^ 0x9F80] = 0x92CF ^ 0x9F80;
        ModuleAspectRatio.h[0x7F17 ^ 0x7FF4] = 0xE4A ^ 0x7FF4;
        ModuleAspectRatio.h[0xF742 ^ 0xF7C0] = 0xF7D7 ^ 0xF7C0;
        ModuleAspectRatio.h[0x88A8 ^ 0x8859] = 0x54B9 ^ 0x8859;
        ModuleAspectRatio.h[0xCF8 ^ 0xCD1] = 0xC9A ^ 0xCD1;
        ModuleAspectRatio.h[0xCE3B ^ 0xCF6B] = 0xA5E0 ^ 0xCF6B;
        ModuleAspectRatio.h[0x9408 ^ 0x9578] = 0x6BBA ^ 0x9578;
        ModuleAspectRatio.h[0x41F8 ^ 0x418B] = 0x41D0 ^ 0x418B;
        ModuleAspectRatio.h[0x14A9 ^ 0x1494] = 0xFFFFEB59 ^ 0x1494;
        ModuleAspectRatio.h[0xCE93 ^ 0xCE59] = 0xCE58 ^ 0xCE59;
        ModuleAspectRatio.h[0xA60A ^ 0xA732] = 0x7A25 ^ 0xA732;
        ModuleAspectRatio.h[0x804C ^ 0x80F7] = 0xFFFF7F7D ^ 0x80F7;
        ModuleAspectRatio.h[0x711E ^ 0x71F1] = 0xAD11 ^ 0x71F1;
        ModuleAspectRatio.h[0x53C6 ^ 0x52E0] = 0x1504D ^ 0x52E0;
        ModuleAspectRatio.h[0x3D84 ^ 0x3D63] = 0xDDDA ^ 0x3D63;
        ModuleAspectRatio.h[0xC639 ^ 0xC69F] = 0xC6B3 ^ 0xC69F;
        ModuleAspectRatio.h[0x286E ^ 0x2933] = 0xF49C ^ 0x2933;
        ModuleAspectRatio.h[0xF496 ^ 0xF448] = 0xBEB5 ^ 0xF448;
        ModuleAspectRatio.h[0xF441 ^ 0xF514] = 0xB519 ^ 0xF514;
        ModuleAspectRatio.h[0x732F ^ 0x73A5] = 0x739E ^ 0x73A5;
        ModuleAspectRatio.h[0xC03A ^ 0xC136] = 0xB63F ^ 0xC136;
        ModuleAspectRatio.h[0xCAE1 ^ 0xCBF9] = 0x4F01 ^ 0xCBF9;
        ModuleAspectRatio.h[0x3D50 ^ 0x3C4D] = 0xA300 ^ 0x3C4D;
        ModuleAspectRatio.h[0x23E0 ^ 0x22A4] = 0x18AA ^ 0x22A4;
        ModuleAspectRatio.h[0xD7D3 ^ 0xD7EB] = 0xD7E2 ^ 0xD7EB;
        ModuleAspectRatio.h[0xC68C ^ 0xC68B] = 0xFFFF390D ^ 0xC68B;
        ModuleAspectRatio.h[0x10BB9 ^ 0x10BF2] = 0xFFFEF465 ^ 0x10BF2;
        ModuleAspectRatio.h[0x3BF0 ^ 0x3AC0] = 0xC585 ^ 0x3AC0;
        ModuleAspectRatio.h[0x10450 ^ 0x104BE] = 0x1D859 ^ 0x104BE;
        ModuleAspectRatio.h[0x644C ^ 0x6567] = 0xFFFE96C7 ^ 0x6567;
        ModuleAspectRatio.h[0x7CE1 ^ 0x7CF5] = 0xFFFF8332 ^ 0x7CF5;
        ModuleAspectRatio.h[0xD301 ^ 0xD201] = 0xFFFFAF89 ^ 0xD201;
        ModuleAspectRatio.h[0x1C35 ^ 0x1CC3] = 0x7A98 ^ 0x1CC3;
        ModuleAspectRatio.h[0x95AF ^ 0x9580] = 0xFFFF6A27 ^ 0x9580;
        ModuleAspectRatio.h[0x2673 ^ 0x2714] = 0x8621 ^ 0x2714;
        ModuleAspectRatio.h[0x10905 ^ 0x10925] = 0xFFFEF6B2 ^ 0x10925;
        ModuleAspectRatio.h[0x54E2 ^ 0x55D8] = 0x18F5 ^ 0x55D8;
        ModuleAspectRatio.h[0x4F06 ^ 0x4F49] = 0x4F72 ^ 0x4F49;
        ModuleAspectRatio.h[0xC2D0 ^ 0xC3B1] = 0xE154 ^ 0xC3B1;
        ModuleAspectRatio.h[0x7529 ^ 0x7438] = 0xCE40 ^ 0x7438;
        ModuleAspectRatio.h[0x10C09 ^ 0x10D75] = 0x19DA9 ^ 0x10D75;
        ModuleAspectRatio.h[0xC6D6 ^ 0xC75C] = 0x9C65 ^ 0xC75C;
        ModuleAspectRatio.h[0x401 ^ 0x4B5] = 0x49A ^ 0x4B5;
        ModuleAspectRatio.h[0x3A16 ^ 0x3B27] = 0x996D ^ 0x3B27;
        ModuleAspectRatio.h[0xA9B5 ^ 0xA968] = 0xA802 ^ 0xA968;
        ModuleAspectRatio.h[0x6E5D ^ 0x6E20] = 0x6E31 ^ 0x6E20;
        ModuleAspectRatio.h[0x7D19 ^ 0x7DE6] = 0xFFC0 ^ 0x7DE6;
        ModuleAspectRatio.h[0x8BB6 ^ 0x8B0F] = 0xFFFF74C1 ^ 0x8B0F;
        ModuleAspectRatio.h[0x785B ^ 0x7966] = 0x6538 ^ 0x7966;
        ModuleAspectRatio.h[0xF96B ^ 0xF929] = 0xF931 ^ 0xF929;
        ModuleAspectRatio.h[0x7541 ^ 0x7400] = 0x4E1D ^ 0x7400;
        ModuleAspectRatio.h[0x37E5 ^ 0x3797] = 0x37C0 ^ 0x3797;
        ModuleAspectRatio.h[0x7AAA ^ 0x7B93] = 0x36B1 ^ 0x7B93;
        ModuleAspectRatio.h[0x1034F ^ 0x103F1] = 0x10375 ^ 0x103F1;
        ModuleAspectRatio.h[0x639C ^ 0x6326] = 0xFFFF9CBF ^ 0x6326;
        ModuleAspectRatio.h[0xBFE5 ^ 0xBECA] = 0x4187 ^ 0xBECA;
        ModuleAspectRatio.h[0x75DD ^ 0x7523] = 0xF700 ^ 0x7523;
        ModuleAspectRatio.h[0x396 ^ 0x2E7] = 0xFAD ^ 0x2E7;
        ModuleAspectRatio.h[0x1014 ^ 0x106C] = 0xFFFFEF97 ^ 0x106C;
        ModuleAspectRatio.h[0x48A2 ^ 0x48C0] = 0x88A3 ^ 0x48C0;
        ModuleAspectRatio.h[0x32C ^ 0x267] = 0xFFFF41D7 ^ 0x267;
        ModuleAspectRatio.h[0xE2E9 ^ 0xE271] = 0xFFFF1DFD ^ 0xE271;
        ModuleAspectRatio.h[0x10880 ^ 0x108AA] = 0xFFFEF734 ^ 0x108AA;
        ModuleAspectRatio.h[0xF21D ^ 0xF329] = 0x5171 ^ 0xF329;
        ModuleAspectRatio.h[0x9630 ^ 0x9749] = 0x789 ^ 0x9749;
        ModuleAspectRatio.h[0x1032D ^ 0x10323] = 0xFFFEFCA5 ^ 0x10323;
        ModuleAspectRatio.h[0x784D ^ 0x78E5] = 0x78CF ^ 0x78E5;
        ModuleAspectRatio.h[0xE595 ^ 0xE419] = 0xBF20 ^ 0xE419;
        ModuleAspectRatio.h[0x9C3E ^ 0x9D2C] = 0x9D2C ^ 0x9D2C;
        ModuleAspectRatio.h[0x45F7 ^ 0x44A4] = 0xFFFF7F90 ^ 0x44A4;
        ModuleAspectRatio.h[0x9F19 ^ 0x9E67] = 0x72FB ^ 0x9E67;
        ModuleAspectRatio.h[0x3122 ^ 0x31D6] = 0x4AFD ^ 0x31D6;
        ModuleAspectRatio.h[0x10ACB ^ 0x10BAB] = 0x1D610 ^ 0x10BAB;
        ModuleAspectRatio.h[0x2367 ^ 0x236E] = 0xFFFFDCB5 ^ 0x236E;
        ModuleAspectRatio.h[0x71C7 ^ 0x71CA] = 0xFFFF8E70 ^ 0x71CA;
        ModuleAspectRatio.h[0x5E05 ^ 0x5EDD] = 0x206C ^ 0x5EDD;
        ModuleAspectRatio.h[0xCF94 ^ 0xCF18] = 0xCF09 ^ 0xCF18;
        ModuleAspectRatio.h[0xA32E ^ 0xA3BD] = 0xA3B6 ^ 0xA3BD;
        ModuleAspectRatio.h[0xDA28 ^ 0xDA12] = 0xFFFF25FF ^ 0xDA12;
        ModuleAspectRatio.h[0x1037D ^ 0x10209] = 0x10F46 ^ 0x10209;
        ModuleAspectRatio.h[0x9637 ^ 0x9771] = 0xC846 ^ 0x9771;
        ModuleAspectRatio.h[0x8A8E ^ 0x8BCB] = 0xD4F0 ^ 0x8BCB;
        ModuleAspectRatio.h[0x5A33 ^ 0x5ABA] = 0xFFFFA55C ^ 0x5ABA;
        ModuleAspectRatio.h[0xDD8C ^ 0xDCA5] = 0x1D0B0 ^ 0xDCA5;
        ModuleAspectRatio.h[0x235F ^ 0x239C] = 0xFFFFDC5A ^ 0x239C;
        ModuleAspectRatio.h[0x8920 ^ 0x887B] = 0x6120 ^ 0x887B;
        ModuleAspectRatio.h[0xA29B ^ 0xA3DC] = 0xFCDD ^ 0xA3DC;
        ModuleAspectRatio.h[0x7B65 ^ 0x7AE5] = 0x9679 ^ 0x7AE5;
        ModuleAspectRatio.h[0x60C8 ^ 0x6081] = 0xFFFF9F38 ^ 0x6081;
        ModuleAspectRatio.h[0xA15B ^ 0xA1EA] = 0xA1B5 ^ 0xA1EA;
        ModuleAspectRatio.h[0xD4E ^ 0xD03] = 0xFFFFF2F3 ^ 0xD03;
        ModuleAspectRatio.h[0xC3F0 ^ 0xC2EB] = 0x308A ^ 0xC2EB;
        ModuleAspectRatio.h[0x64ED ^ 0x6480] = 0x6448 ^ 0x6480;
        ModuleAspectRatio.h[0x245D ^ 0x24FE] = 0xFFFFDB24 ^ 0x24FE;
        ModuleAspectRatio.h[0xA281 ^ 0xA2EB] = 0x3530 ^ 0xA2EB;
        ModuleAspectRatio.h[0xA3D5 ^ 0xA2F0] = 0x1A050 ^ 0xA2F0;
        ModuleAspectRatio.h[0x367A ^ 0x3698] = 0x4725 ^ 0x3698;
        ModuleAspectRatio.h[0x7D8C ^ 0x7DCF] = 0xFFFF8241 ^ 0x7DCF;
        ModuleAspectRatio.h[0xF352 ^ 0xF3CF] = 0xFFFF0C72 ^ 0xF3CF;
        ModuleAspectRatio.h[0x3C70 ^ 0x3C27] = 0x3C24 ^ 0x3C27;
        ModuleAspectRatio.h[0x3495 ^ 0x35F0] = 0x94A3 ^ 0x35F0;
        ModuleAspectRatio.h[0xBC78 ^ 0xBC73] = 0xBC7A ^ 0xBC73;
        ModuleAspectRatio.h[0xF682 ^ 0xF7DD] = 0x2A73 ^ 0xF7DD;
        ModuleAspectRatio.h[0x4271 ^ 0x4242] = 0x42DA ^ 0x4242;
        ModuleAspectRatio.h[0xE27 ^ 0xEFE] = 0x700D ^ 0xEFE;
        ModuleAspectRatio.h[0x6630 ^ 0x66DA] = 0xF6FF ^ 0x66DA;
        ModuleAspectRatio.h[0x677B ^ 0x66F3] = 0x4A8E ^ 0x66F3;
        ModuleAspectRatio.h[0xFA0A ^ 0xFB02] = 0xD92A ^ 0xFB02;
        ModuleAspectRatio.h[0xE316 ^ 0xE21F] = 0xC04C ^ 0xE21F;
        ModuleAspectRatio.h[0x679D ^ 0x6767] = 0x83D ^ 0x6767;
        ModuleAspectRatio.h[0x550E ^ 0x5426] = 0x1568B ^ 0x5426;
        ModuleAspectRatio.h[0xEA84 ^ 0xEA68] = 0xFFFF85A5 ^ 0xEA68;
        ModuleAspectRatio.h[0x14E6 ^ 0x14E5] = 0x14F7 ^ 0x14E5;
        ModuleAspectRatio.h[0xD761 ^ 0xD7C0] = 0xFFFF284A ^ 0xD7C0;
        ModuleAspectRatio.h[0x5C19 ^ 0x5C35] = 0x5C3A ^ 0x5C35;
        ModuleAspectRatio.h[0xA3CB ^ 0xA3A2] = 0xA0F8 ^ 0xA3A2;
        ModuleAspectRatio.h[0xD61B ^ 0xD76C] = 0xFFFFA76B ^ 0xD76C;
        ModuleAspectRatio.h[0x2B0B ^ 0x2B0A] = 0x2B68 ^ 0x2B0A;
        ModuleAspectRatio.h[0x29F4 ^ 0x28F7] = 0x7F09 ^ 0x28F7;
        ModuleAspectRatio.h[0xDBE ^ 0xCD5] = 0xFFFF6462 ^ 0xCD5;
        ModuleAspectRatio.h[0x1CE2 ^ 0x1DFE] = 0xEFA1 ^ 0x1DFE;
        ModuleAspectRatio.h[0x7DAB ^ 0x7CC2] = 0xEBCF ^ 0x7CC2;
        ModuleAspectRatio.h[0x4260 ^ 0x4303] = 0x619E ^ 0x4303;
        ModuleAspectRatio.h[0xA172 ^ 0xA02B] = 0x497C ^ 0xA02B;
        ModuleAspectRatio.h[0x39BD ^ 0x390D] = 0x396C ^ 0x390D;
        ModuleAspectRatio.h[0xE6B5 ^ 0xE732] = 0xFFFF34F9 ^ 0xE732;
        ModuleAspectRatio.h[0x447C ^ 0x4534] = 0x1A03 ^ 0x4534;
        ModuleAspectRatio.h[0x8305 ^ 0x837F] = 0x832B ^ 0x837F;
        ModuleAspectRatio.h[0x99B3 ^ 0x998F] = 0xFFFF6628 ^ 0x998F;
        ModuleAspectRatio.h[0x10CA2 ^ 0x10D80] = 0x16EDF ^ 0x10D80;
        ModuleAspectRatio.h[0xBF41 ^ 0xBF85] = 0xBFF8 ^ 0xBF85;
        ModuleAspectRatio.h[0x2631 ^ 0x26DC] = 0xB6F5 ^ 0x26DC;
        ModuleAspectRatio.h[0x4BB3 ^ 0x4BA8] = 0xFFFFB46F ^ 0x4BA8;
        ModuleAspectRatio.h[0x7210 ^ 0x7216] = 0xFFFF8DBE ^ 0x7216;
        ModuleAspectRatio.h[0x7AD3 ^ 0x7BE6] = 0xA6E6 ^ 0x7BE6;
        ModuleAspectRatio.h[0xA387 ^ 0xA2FF] = 0x2D6F ^ 0xA2FF;
        ModuleAspectRatio.h[0x6577 ^ 0x6519] = 0x6558 ^ 0x6519;
        ModuleAspectRatio.h[0x14EA ^ 0x141F] = 0x6F34 ^ 0x141F;
        ModuleAspectRatio.h[0xFCB0 ^ 0xFC80] = 0xFFFF0334 ^ 0xFC80;
        ModuleAspectRatio.h[0xD63D ^ 0xD729] = 0x8CA5 ^ 0xD729;
        ModuleAspectRatio.h[0x95A9 ^ 0x9550] = 0xF300 ^ 0x9550;
        ModuleAspectRatio.h[0x979B ^ 0x97A2] = 0x9785 ^ 0x97A2;
        ModuleAspectRatio.h[0xD633 ^ 0xD740] = 0xDA45 ^ 0xD740;
        ModuleAspectRatio.h[0xA168 ^ 0xA15C] = 0xA17B ^ 0xA15C;
        ModuleAspectRatio.h[0x9B7C ^ 0x9A0A] = 0x159A ^ 0x9A0A;
        ModuleAspectRatio.h[0x108F4 ^ 0x108FE] = 0xFFFEF731 ^ 0x108FE;
        ModuleAspectRatio.h[0xD081 ^ 0xD060] = 0x9A92 ^ 0xD060;
        ModuleAspectRatio.h[0x7A60 ^ 0x7AE4] = 0xFFFF851C ^ 0x7AE4;
        ModuleAspectRatio.h[0x42F4 ^ 0x43E7] = 0x184B ^ 0x43E7;
        ModuleAspectRatio.h[0x1F1 ^ 0x192] = 0x4B7 ^ 0x192;
        ModuleAspectRatio.h[0x83B0 ^ 0x837E] = 0x837F ^ 0x837E;
        ModuleAspectRatio.h[0x8AFC ^ 0x8ACD] = 0xFFFF7522 ^ 0x8ACD;
        ModuleAspectRatio.h[0x65C8 ^ 0x64CF] = 0x469C ^ 0x64CF;
        ModuleAspectRatio.h[0x998A ^ 0x9924] = 0x992F ^ 0x9924;
        ModuleAspectRatio.h[0x3B3E ^ 0x3BDA] = 0x4A51 ^ 0x3BDA;
        ModuleAspectRatio.h[0xE213 ^ 0xE2B3] = 0xFFFF1DED ^ 0xE2B3;
        ModuleAspectRatio.h[0x7DAE ^ 0x7D78] = 0x385 ^ 0x7D78;
        ModuleAspectRatio.h[0x9FD6 ^ 0x9F49] = 0xFFFF60AF ^ 0x9F49;
        ModuleAspectRatio.h[0x8517 ^ 0x8501] = 0x8501 ^ 0x8501;
        ModuleAspectRatio.h[0x5A46 ^ 0x5A70] = 0x5A6C ^ 0x5A70;
        ModuleAspectRatio.h[0x68F0 ^ 0x6820] = 0xB17C ^ 0x6820;
        ModuleAspectRatio.h[0x3981 ^ 0x3973] = 0x4258 ^ 0x3973;
        ModuleAspectRatio.h[0x7D2 ^ 0x6A7] = 0x892A ^ 0x6A7;
        ModuleAspectRatio.h[0xF804 ^ 0xF825] = 0xFFFF07B4 ^ 0xF825;
        ModuleAspectRatio.h[0x2D57 ^ 0x2D97] = 0x2DCA ^ 0x2D97;
        ModuleAspectRatio.h[0x7F3C ^ 0x7F26] = 0xFFFF8096 ^ 0x7F26;
        ModuleAspectRatio.h[0x4158 ^ 0x414D] = 0xFFFFBEE5 ^ 0x414D;
        ModuleAspectRatio.h[0xE2F2 ^ 0xE3DE] = 0x1EFDE ^ 0xE3DE;
        ModuleAspectRatio.h[0x33F0 ^ 0x33BC] = 0xFFFFCC1B ^ 0x33BC;
        ModuleAspectRatio.h[0xACD3 ^ 0xADF9] = 0x1A1F9 ^ 0xADF9;
        ModuleAspectRatio.h[0xEF02 ^ 0xEF51] = 0xFFFF1091 ^ 0xEF51;
        ModuleAspectRatio.h[0x5C88 ^ 0x5DBF] = 0x80E2 ^ 0x5DBF;
        ModuleAspectRatio.h[0x801 ^ 0x8FC] = 0x67A4 ^ 0x8FC;
        ModuleAspectRatio.h[0xEDAD ^ 0xEDAD] = 0xEDA8 ^ 0xEDAD;
        ModuleAspectRatio.h[0x6F27 ^ 0x6FE8] = 0x6FE8 ^ 0x6FE8;
        ModuleAspectRatio.h[0x6228 ^ 0x6266] = 0xFFFF9DA8 ^ 0x6266;
        ModuleAspectRatio.h[0x3BBB ^ 0x3B50] = 0xAB79 ^ 0x3B50;
        ModuleAspectRatio.h[0x6922 ^ 0x68AB] = 0x338B ^ 0x68AB;
        ModuleAspectRatio.h[0x281B ^ 0x284A] = 0x282E ^ 0x284A;
        ModuleAspectRatio.h[0x93D0 ^ 0x9394] = 0x93CE ^ 0x9394;
        ModuleAspectRatio.h[0xF012 ^ 0xF152] = 0xED0D ^ 0xF152;
        ModuleAspectRatio.h[0xD415 ^ 0xD41A] = 0xFFFF2B71 ^ 0xD41A;
        ModuleAspectRatio.h[0x2981 ^ 0x28EB] = 0xBFEC ^ 0x28EB;
        ModuleAspectRatio.h[0x3F0 ^ 0x321] = 0xDA6D ^ 0x321;
        ModuleAspectRatio.h[0x16DC ^ 0x16B8] = 0x3111 ^ 0x16B8;
        ModuleAspectRatio.h[0xF6C7 ^ 0xF66D] = 0xFFFF09A1 ^ 0xF66D;
        ModuleAspectRatio.h[0x9AE3 ^ 0x9A6C] = 0xFFFF65A6 ^ 0x9A6C;
        ModuleAspectRatio.h[0x19D0 ^ 0x1991] = 0xFFFFE656 ^ 0x1991;
        ModuleAspectRatio.h[0x2318 ^ 0x23CB] = 0x2420 ^ 0x23CB;
        ModuleAspectRatio.h[0x9F8B ^ 0x9FF2] = 0x9FBA ^ 0x9FF2;
        ModuleAspectRatio.h[0x53C4 ^ 0x52CB] = 0xE8B3 ^ 0x52CB;
        ModuleAspectRatio.h[0xFFBE ^ 0xFF61] = 0xB593 ^ 0xFF61;
        ModuleAspectRatio.h[0xD6E6 ^ 0xD7E3] = 0x801D ^ 0xD7E3;
        ModuleAspectRatio.h[0x55F7 ^ 0x548A] = 0xB816 ^ 0x548A;
        ModuleAspectRatio.h[0xF4 ^ 0x1EE] = 0xF3B1 ^ 0x1EE;
        ModuleAspectRatio.h[0x3764 ^ 0x37A9] = 0x37A8 ^ 0x37A9;
        ModuleAspectRatio.h[0x7206 ^ 0x7233] = 0xFFFF8DA6 ^ 0x7233;
        ModuleAspectRatio.h[0xE963 ^ 0xE83F] = 0x161 ^ 0xE83F;
        ModuleAspectRatio.h[0x148C ^ 0x1440] = 0x1440 ^ 0x1440;
        ModuleAspectRatio.h[0x597D ^ 0x596D] = 0x5935 ^ 0x596D;
        ModuleAspectRatio.h[0x14B9 ^ 0x1491] = 0xFFFFEB0E ^ 0x1491;
        ModuleAspectRatio.h[0x3C79 ^ 0x3CD5] = 0x3C97 ^ 0x3CD5;
        ModuleAspectRatio.h[0x596D ^ 0x5919] = 0x5928 ^ 0x5919;
        ModuleAspectRatio.h[0x576D ^ 0x579E] = 0x2CB5 ^ 0x579E;
        ModuleAspectRatio.h[0x8B2F ^ 0x8BF8] = 0xF50B ^ 0x8BF8;
        ModuleAspectRatio.h[0x9DE6 ^ 0x9D55] = 0xFFFF62C3 ^ 0x9D55;
        ModuleAspectRatio.h[0x109A4 ^ 0x109BC] = 0x109E0 ^ 0x109BC;
        ModuleAspectRatio.h[0xD5D6 ^ 0xD540] = 0xD51B ^ 0xD540;
        ModuleAspectRatio.h[0x631C ^ 0x63A9] = 0xFFFF9C44 ^ 0x63A9;
        ModuleAspectRatio.h[0x89EE ^ 0x89E6] = 0x89DC ^ 0x89E6;
        ModuleAspectRatio.h[0xA15 ^ 0xA75] = 0xCCF4 ^ 0xA75;
        ModuleAspectRatio.h[0x2A96 ^ 0x2BB7] = 0x48EC ^ 0x2BB7;
        ModuleAspectRatio.h[0xE939 ^ 0xE986] = 0xE9BE ^ 0xE986;
        ModuleAspectRatio.h[0x6145 ^ 0x601F] = 0x8941 ^ 0x601F;
        ModuleAspectRatio.h[0xF12C ^ 0xF173] = 0xECF3 ^ 0xF173;
        ModuleAspectRatio.h[0x5D13 ^ 0x5DA5] = 0x5DC1 ^ 0x5DA5;
        ModuleAspectRatio.h[0xF9C7 ^ 0xF9A0] = 0x1454 ^ 0xF9A0;
        ModuleAspectRatio.h[0x6BCE ^ 0x6BAF] = 0xC8EE ^ 0x6BAF;
        ModuleAspectRatio.h[0x4914 ^ 0x49BB] = 0xFFFFB641 ^ 0x49BB;
        ModuleAspectRatio.h[0x6B4B ^ 0x6B27] = 0x6B27 ^ 0x6B27;
        ModuleAspectRatio.h[0xE652 ^ 0xE6C3] = 0xFFFF191B ^ 0xE6C3;
        ModuleAspectRatio.h[0x528A ^ 0x5221] = 0xFFFFADF1 ^ 0x5221;
        ModuleAspectRatio.h[0xEFF ^ 0xE72] = 0xE4F ^ 0xE72;
        ModuleAspectRatio.h[0xB7FF ^ 0xB6A9] = 0xF6BF ^ 0xB6A9;
        ModuleAspectRatio.h[0x3A5 ^ 0x3E5] = 0x3F4 ^ 0x3E5;
        ModuleAspectRatio.h[0xE789 ^ 0xE69F] = 0x6267 ^ 0xE69F;
        ModuleAspectRatio.h[0xC182 ^ 0xC1D2] = 0xFFFF3E26 ^ 0xC1D2;
        ModuleAspectRatio.h[0xF716 ^ 0xF743] = 0xFFFF088F ^ 0xF743;
        ModuleAspectRatio.h[0x43B8 ^ 0x4351] = 0xA3E8 ^ 0x4351;
        ModuleAspectRatio.h[0x10D37 ^ 0x10DD7] = 0xFFFEB8A2 ^ 0x10DD7;
        ModuleAspectRatio.h[0xFC31 ^ 0xFCFA] = 0xFCF8 ^ 0xFCFA;
        ModuleAspectRatio.h[0x319B ^ 0x3139] = 0xFFFFCE8D ^ 0x3139;
        ModuleAspectRatio.h[0x8B8 ^ 0x815] = 0x855 ^ 0x815;
        ModuleAspectRatio.h[0x9BD1 ^ 0x9AF2] = 0xFFFF0616 ^ 0x9AF2;
        ModuleAspectRatio.h[0xA9C0 ^ 0xA9F7] = 0xFFFF5610 ^ 0xA9F7;
        ModuleAspectRatio.h[0x2BB6 ^ 0x2A3B] = 0x2700 ^ 0x2A3B;
        ModuleAspectRatio.h[0x7F9A ^ 0x7FBF] = 0x7FF7 ^ 0x7FBF;
        ModuleAspectRatio.h[0x532A ^ 0x53F6] = 0xFFFFAD28 ^ 0x53F6;
        ModuleAspectRatio.h[0x833B ^ 0x8216] = 0x7D51 ^ 0x8216;
        ModuleAspectRatio.h[0x913 ^ 0x82F] = 0x4502 ^ 0x82F;
        ModuleAspectRatio.h[0x87FA ^ 0x8692] = 0x27D1 ^ 0x8692;
        ModuleAspectRatio.h[0xBA6C ^ 0xBA10] = 0xFFFF45DF ^ 0xBA10;
        ModuleAspectRatio.h[0xC2CF ^ 0xC234] = 0xAD6C ^ 0xC234;
        ModuleAspectRatio.h[0xF635 ^ 0xF72C] = 0x57B ^ 0xF72C;
        ModuleAspectRatio.h[0x496E ^ 0x49BA] = 0x4E60 ^ 0x49BA;
        ModuleAspectRatio.h[0xEDD9 ^ 0xED59] = 0xED01 ^ 0xED59;
        ModuleAspectRatio.h[0x9C0 ^ 0x8CB] = 0x7FD4 ^ 0x8CB;
        ModuleAspectRatio.h[0x54B3 ^ 0x553D] = 0x5800 ^ 0x553D;
        ModuleAspectRatio.h[0x102 ^ 0x1C5] = 0xFFFFFE33 ^ 0x1C5;
        ModuleAspectRatio.h[0x38FB ^ 0x389D] = 0x680F ^ 0x389D;
        ModuleAspectRatio.h[0xF8B0 ^ 0xF827] = 0xFFFF07D0 ^ 0xF827;
        ModuleAspectRatio.h[0xD314 ^ 0xD332] = 0xD36E ^ 0xD332;
        ModuleAspectRatio.h[0x191F ^ 0x19A3] = 0xFFFFE63E ^ 0x19A3;
        ModuleAspectRatio.h[0x105A3 ^ 0x105BE] = 0xFFFEFA14 ^ 0x105BE;
        ModuleAspectRatio.h[0x931C ^ 0x929F] = 0xFFFFCD35 ^ 0x929F;
        ModuleAspectRatio.h[0x6248 ^ 0x62A0] = 0x821B ^ 0x62A0;
        ModuleAspectRatio.h[0xC7AF ^ 0xC6E1] = 0xAC6A ^ 0xC6E1;
        ModuleAspectRatio.h[0xA377 ^ 0xA260] = 0x26A3 ^ 0xA260;
        ModuleAspectRatio.h[0x8B91 ^ 0x8BB2] = 0x8BED ^ 0x8BB2;
        ModuleAspectRatio.h[0xD6ED ^ 0xD7AE] = 0xFFFF120E ^ 0xD7AE;
        ModuleAspectRatio.h[0x6FF3 ^ 0x6F61] = 0xFFFF90CC ^ 0x6F61;
        ModuleAspectRatio.h[0x6C0D ^ 0x6C93] = 0xFFFF9324 ^ 0x6C93;
        ModuleAspectRatio.h[0x9CD1 ^ 0x9DB7] = 0x3CF4 ^ 0x9DB7;
        ModuleAspectRatio.h[0x10A04 ^ 0x10A7A] = 0xFFFEF5BA ^ 0x10A7A;
        ModuleAspectRatio.h[0xD3C0 ^ 0xD34E] = 0xD32B ^ 0xD34E;
        ModuleAspectRatio.h[0xC427 ^ 0xC47D] = 0xC47D ^ 0xC47D;
        ModuleAspectRatio.h[0x3DD2 ^ 0x3D57] = 0xFFFFC283 ^ 0x3D57;
        ModuleAspectRatio.h[0x104D1 ^ 0x10553] = 0x1A568 ^ 0x10553;
        ModuleAspectRatio.h[0x4795 ^ 0x46FB] = 0xB839 ^ 0x46FB;
        ModuleAspectRatio.h[0x1067A ^ 0x10678] = 0x10627 ^ 0x10678;
        ModuleAspectRatio.h[0xD7F3 ^ 0xD7A5] = 0xFFFF282E ^ 0xD7A5;
        ModuleAspectRatio.h[0x1F49 ^ 0x1FD9] = 0x1FA2 ^ 0x1FD9;
        ModuleAspectRatio.h[0x1BFF ^ 0x1AFE] = 0x98D8 ^ 0x1AFE;
        ModuleAspectRatio.h[0xB8FF ^ 0xB85B] = 0xFFFF47FD ^ 0xB85B;
        ModuleAspectRatio.h[0xA77E ^ 0xA709] = 0xFFFF58D7 ^ 0xA709;
        ModuleAspectRatio.h[0x4E9A ^ 0x4E96] = 0x4EC2 ^ 0x4E96;
        ModuleAspectRatio.h[0x48F7 ^ 0x49D7] = 0xD682 ^ 0x49D7;
        ModuleAspectRatio.h[0x95FC ^ 0x94E2] = 0xBB7 ^ 0x94E2;
        ModuleAspectRatio.h[0x19EA ^ 0x19C7] = 0xFFFFE657 ^ 0x19C7;
        ModuleAspectRatio.h[0x6FF8 ^ 0x6E7D] = 0x421E ^ 0x6E7D;
        ModuleAspectRatio.h[0xA8D6 ^ 0xA873] = 0xFFFF57D7 ^ 0xA873;
        ModuleAspectRatio.h[0x4D95 ^ 0x4D69] = 0x2262 ^ 0x4D69;
        ModuleAspectRatio.h[0x3EC5 ^ 0x3EFE] = 0xFFFFC134 ^ 0x3EFE;
        ModuleAspectRatio.h[0x1B4D ^ 0x1B28] = 0xC185 ^ 0x1B28;
        ModuleAspectRatio.h[0x5204 ^ 0x52FC] = 0xFFFFCB11 ^ 0x52FC;
        ModuleAspectRatio.h[0xA1AA ^ 0xA1FE] = 0xFFFF5E21 ^ 0xA1FE;
        ModuleAspectRatio.h[0xC12F ^ 0xC054] = 0x50BD ^ 0xC054;
        ModuleAspectRatio.h[0x9D33 ^ 0x9C00] = 0x3E37 ^ 0x9C00;
        ModuleAspectRatio.h[0x9FC3 ^ 0x9EF8] = 0xFFFF2C24 ^ 0x9EF8;
        ModuleAspectRatio.h[0x3D33 ^ 0x3C79] = 0x8075 ^ 0x3C79;
        ModuleAspectRatio.h[0xB1F ^ 0xB20] = 0xFFFFF496 ^ 0xB20;
        ModuleAspectRatio.h[0xDC78 ^ 0xDC03] = 0xFFFF23D7 ^ 0xDC03;
        ModuleAspectRatio.h[0xEFC1 ^ 0xEF9C] = 0xEF9C ^ 0xEF9C;
        ModuleAspectRatio.h[0x9298 ^ 0x93D7] = 0xFFFF0690 ^ 0x93D7;
        ModuleAspectRatio.h[0xFF50 ^ 0xFFC5] = 0xFFFF0048 ^ 0xFFC5;
        ModuleAspectRatio.h[0x9B1 ^ 0x930] = 0x929 ^ 0x930;
        ModuleAspectRatio.h[0x7000 ^ 0x7070] = 0xFFFF8F9F ^ 0x7070;
        ModuleAspectRatio.h[0x416F ^ 0x41E7] = 0xFFFFBE1A ^ 0x41E7;
        ModuleAspectRatio.h[0xF180 ^ 0xF15B] = 0xF031 ^ 0xF15B;
        ModuleAspectRatio.h[0xA5CF ^ 0xA593] = 0xA593 ^ 0xA593;
        ModuleAspectRatio.h[0x92C6 ^ 0x9203] = 0x920B ^ 0x9203;
        ModuleAspectRatio.h[0xA4A9 ^ 0xA5CD] = 0x872B ^ 0xA5CD;
        ModuleAspectRatio.h[0x10864 ^ 0x10882] = 0x1E83A ^ 0x10882;
        ModuleAspectRatio.h[0xBF21 ^ 0xBE31] = 0xFFFFFBB7 ^ 0xBE31;
        ModuleAspectRatio.h[0x29A1 ^ 0x29A5] = 0xFFFFD63C ^ 0x29A5;
        ModuleAspectRatio.h[0x221B ^ 0x2377] = 0xB470 ^ 0x2377;
        ModuleAspectRatio.h[0x92EA ^ 0x92F9] = 0x929B ^ 0x92F9;
        ModuleAspectRatio.h[0x977B ^ 0x967F] = 0xC1B3 ^ 0x967F;
        ModuleAspectRatio.h[0x4787 ^ 0x47DF] = 0x47DF ^ 0x47DF;
        ModuleAspectRatio.h[0x887 ^ 0x8B5] = 0xFFFFF770 ^ 0x8B5;
        ModuleAspectRatio.h[0x672 ^ 0x60D] = 0xFFFFF99D ^ 0x60D;
        ModuleAspectRatio.h[0xB82A ^ 0xB836] = 0xB816 ^ 0xB836;
        ModuleAspectRatio.h[0x8BB2 ^ 0x8A9C] = 0x75D9 ^ 0x8A9C;
        ModuleAspectRatio.h[0x6992 ^ 0x6908] = 0x6977 ^ 0x6908;
        ModuleAspectRatio.h[0x1220 ^ 0x1251] = 0x1277 ^ 0x1251;
        ModuleAspectRatio.h[0x4B94 ^ 0x4B08] = 0xFFFFB4CF ^ 0x4B08;
        ModuleAspectRatio.h[0xA8F4 ^ 0xA972] = 0x850F ^ 0xA972;
        ModuleAspectRatio.h[0x930A ^ 0x9234] = 0x8E6B ^ 0x9234;
        ModuleAspectRatio.h[0x73B3 ^ 0x72B5] = 0x50EC ^ 0x72B5;
        ModuleAspectRatio.h[0x9412 ^ 0x9464] = 0x9446 ^ 0x9464;
        ModuleAspectRatio.h[0xA036 ^ 0xA0FF] = 0xFFFF5F7B ^ 0xA0FF;
        ModuleAspectRatio.h[0x791F ^ 0x79B6] = 0x79A8 ^ 0x79B6;
        ModuleAspectRatio.h[0x10102 ^ 0x10060] = 0x12286 ^ 0x10060;
        ModuleAspectRatio.h[0xB05E ^ 0xB150] = 0xB25 ^ 0xB150;
        ModuleAspectRatio.h[0x5229 ^ 0x523E] = 0xFFFFAD99 ^ 0x523E;
        ModuleAspectRatio.h[0xA327 ^ 0xA24A] = 0x5C92 ^ 0xA24A;
        ModuleAspectRatio.h[0x325 ^ 0x3F0] = 0x41B ^ 0x3F0;
        ModuleAspectRatio.h[0x4DAD ^ 0x4D6F] = 0x4D6B ^ 0x4D6F;
        ModuleAspectRatio.h[0x364D ^ 0x377F] = 0x9527 ^ 0x377F;
        ModuleAspectRatio.h[0x89C6 ^ 0x8980] = 0xFFFF7619 ^ 0x8980;
        ModuleAspectRatio.h[0x9742 ^ 0x97C1] = 0xFFFF683E ^ 0x97C1;
        ModuleAspectRatio.h[0x1075E ^ 0x10654] = 0x17143 ^ 0x10654;
        ModuleAspectRatio.h[0x9444 ^ 0x9510] = 0x51C2 ^ 0x9510;
        ModuleAspectRatio.h[0xCB3B ^ 0xCB4E] = 0xFFFF34F8 ^ 0xCB4E;
        ModuleAspectRatio.h[0x5342 ^ 0x52C6] = 0xF2FD ^ 0x52C6;
    }
}

