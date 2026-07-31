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

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0003R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u001c\u0010\u0019\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u001c\u0010\u001a\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b#\u0010$\u00a8\u0006%"}, d2={"Lkotakbaz/rain/module/modules/render/ModuleColorSaturation;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "onDisable", "renderWorldIfNeeded", "", "currentSaturation", "Lnet/minecraft/class_279;", "ensureProcessor", "(F)Lnet/minecraft/class_279;", "Lnet/minecraft/class_9962;", "createPipeline", "(F)Lnet/minecraft/class_9962;", "releaseEffect", "releaseProcessor", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "saturation", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "Lnet/minecraft/class_2960;", "kotlin.jvm.PlatformType", "effectId", "Lnet/minecraft/class_2960;", "swapTargetId", "blitShaderId", "saturationShaderId", "cachedSaturation", "F", "processor", "Lnet/minecraft/class_279;", "Lnet/minecraft/class_11278;", "projectionMatrix", "Lnet/minecraft/class_11278;", "Lnet/minecraft/class_9920;", "renderPool", "Lnet/minecraft/class_9920;", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nModuleColorSaturation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModuleColorSaturation.kt\nkotakbaz/rain/module/modules/render/ModuleColorSaturation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,150:1\n1#2:151\n*E\n"})
public final class ModuleColorSaturation
extends Module {
    @NotNull
    public static final ModuleColorSaturation INSTANCE;
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

    private ModuleColorSaturation() {
        int n2 = h[0];
        n2 ^= h[1];
        int n3 = h[3];
        n3 -= h[4];
        int n4 = h[6];
        n4 ^= h[7];
        super((String)E[n2 -= h[2]], a_0.getRENDER(), (String)E[n3 += h[5]] + (String)E[n4 += h[8]]);
    }

    @Override
    public void onDisable() {
        this.releaseEffect();
    }

    public final void renderWorldIfNeeded() {
        block7: {
            Object object;
            Object object2;
            long l2 = 3574602454022133663L;
            long l3 = 6579138805165499469L;
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
                object = object2 = new Pool(n2 ^= h[11]);
                long l4 = l3;
                int n3 = h[12];
                n3 ^= h[13];
                l3 = l4 ^ (0L ^ l4) & -1L << (n3 -= h[14]);
                e = object;
                object3 = object2;
            }
            Pool pool = object3;
            Object object4 = this;
            try {
                object2 = object4;
                long l5 = l2;
                int n4 = h[15];
                n4 ^= h[16];
                l2 = l5 ^ (0L ^ l5) & -1L >>> (n4 += h[17]);
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
            n5 ^= h[19];
            l3 = l6 ^ (0L ^ l6) & -1L << (n5 += h[20]);
            INSTANCE.releaseEffect();
        }
    }

    private final PostEffectProcessor ensureProcessor(float currentSaturation) {
        Object object;
        long l2 = -4934667850991205489L;
        PostEffectProcessor postEffectProcessor = d;
        if (postEffectProcessor != null) {
            int n2;
            if (currentSaturation == C) {
                int n3 = h[21];
                n3 -= h[22];
                n2 = n3 ^= h[23];
            } else {
                int n4 = h[24];
                n4 += h[25];
                n2 = n4 -= h[26];
            }
            if (n2 != 0) {
                return postEffectProcessor;
            }
        }
        this.releaseProcessor();
        int n5 = h[27];
        n5 -= h[28];
        int n6 = h[30];
        n6 += h[31];
        boolean bl = h[33];
        bl -= h[34];
        ProjectionMatrix2 projectionMatrix2 = new ProjectionMatrix2((String)E[n5 += h[29]] + (String)E[n6 -= h[32]], 0.05f, 1000.0f, bl -= h[35]);
        Object object2 = this;
        try {
            object = object2;
            long l3 = l2;
            int n7 = h[36];
            n7 += h[37];
            l2 = l3 ^ (0L ^ l3) & -1L << (n7 ^= h[38]);
            object = Result.cfr_renamed_1(PostEffectProcessor.parseEffect((PostEffectPipeline)super.createPipeline(currentSaturation), (TextureManager)kotakbaz.rain.client.extensions.b.getMc().getTextureManager(), (Set)DefaultFramebufferSet.MAIN_ONLY, (Identifier)A, (ProjectionMatrix2)projectionMatrix2));
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
            n8 += h[40];
            l2 = l4 ^ (0L ^ l4) & -1L << (n8 -= h[41]);
            projectionMatrix2.close();
            return null;
        }
        PostEffectProcessor postEffectProcessor2 = (PostEffectProcessor)object2;
        D = projectionMatrix2;
        d = postEffectProcessor2;
        C = currentSaturation;
        return postEffectProcessor2;
    }

    private final PostEffectPipeline createPipeline(float currentSaturation) {
        int n2 = h[42];
        n2 -= h[43];
        n2 ^= h[44];
        boolean bl = h[45];
        bl ^= h[46];
        bl ^= h[47];
        boolean bl2 = h[48];
        bl2 -= h[49];
        int n3 = h[51];
        n3 ^= h[52];
        int n4 = h[54];
        n4 += h[55];
        PostEffectPipeline.Pass pass = new PostEffectPipeline.Pass(B, c, CollectionsKt.listOf(new PostEffectPipeline.TargetSampler((String)E[n2], DefaultFramebufferSet.MAIN, bl, bl2 ^= h[50])), b, MapsKt.mapOf(TuplesKt.to((String)E[n3 -= h[53]] + (String)E[n4 ^= h[56]], CollectionsKt.listOf(new UniformValue.FloatValue(currentSaturation)))));
        int n5 = h[57];
        n5 ^= h[58];
        n5 ^= h[59];
        boolean bl3 = h[60];
        bl3 -= h[61];
        boolean bl4 = h[63];
        bl4 += h[64];
        int n6 = h[66];
        n6 ^= h[67];
        PostEffectPipeline.Pass pass2 = new PostEffectPipeline.Pass(B, B, CollectionsKt.listOf(new PostEffectPipeline.TargetSampler((String)E[n5], b, bl3 ^= h[62], bl4 ^= h[65])), DefaultFramebufferSet.MAIN, MapsKt.mapOf(TuplesKt.to((String)E[n6 ^= h[68]], CollectionsKt.listOf(new UniformValue.Vec4fValue(new Vector4f(1.0f, 1.0f, 1.0f, 1.0f))))));
        boolean bl5 = h[69];
        bl5 += h[70];
        bl5 += h[71];
        int n7 = h[72];
        n7 ^= h[73];
        n7 -= h[74];
        int n8 = h[75];
        n8 ^= h[76];
        PostEffectPipeline.Pass[] passArray = new PostEffectPipeline.Pass[n8 += h[77]];
        int n9 = h[78];
        n9 += h[79];
        passArray[n9 += ModuleColorSaturation.h[80]] = pass;
        int n10 = h[81];
        n10 += h[82];
        passArray[n10 ^= ModuleColorSaturation.h[83]] = pass2;
        return new PostEffectPipeline(MapsKt.mapOf(TuplesKt.to(b, new PostEffectPipeline.Targets(Optional.empty(), Optional.empty(), bl5, n7))), CollectionsKt.listOf(passArray));
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
        ModuleColorSaturation.b();
        long l2 = -2338166063813603695L;
        long l3 = 3976352908275497860L;
        long l4 = -8593704070953626638L;
        long l5 = -1559754082067110465L;
        long l6 = -6925221256748928049L;
        long l7 = 6380156898416740006L;
        long l8 = 5374307038993328768L;
        long l9 = -6649065864176486476L;
        long l10 = -1450781249920367774L;
        long l11 = 6293019797987006897L;
        long l12 = 250733268837873714L;
        long l13 = 4123373737372513827L;
        long l14 = 178777912383861150L;
        long l15 = -7245001066334764029L;
        int n2 = h[84];
        n2 += h[85];
        E = new Object[n2 += h[86]];
        long l16 = l15;
        int n3 = h[87];
        n3 -= h[88];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= h[89]);
        Object[] objectArray = new Object[h[90]];
        objectArray[ModuleColorSaturation.h[91]] = f;
        objectArray[ModuleColorSaturation.h[92]] = h[93];
        int n4 = h[94];
        Object object = ModuleColorSaturation.A()[h[95]];
        if (object == null) {
            char[] cArray = "\u1519\u151b\u14e1\u14f9\u14f6\u1507\u14e7\u1513\u151d\u14e8\u1514\u150c\u14f3\u14df\u1519\u1638\u150b\u1633\u14f5\u1639\u1502\u151a\u163a\u163a\u1507\u1506\u14e7\u150c\u14e2\u151a\u1508\u1639\u167e\u151b\u14e2\u1513\u1509\u14e1\u1514\u14e0\u1518\u14e6\u14f2\u1508\u1635\u1506\u14eb\u1634\u14f4\u151d\u1632\u151b\u14f9\u167f\u1638\u1506\u14f5\u14eb\u150a\u14f2\u14e2\u14f8\u1637\u14f6\u1639\u150a\u151a\u14de\u1634\u14e8\u14f3\u167f\u1512\u1506\u14ed\u1508\u1633\u14e3\u1541\u163c\u167e\u1502\u1513\u151c\u1638\u162a\u163d\u1506\u1503\u1519\u14e6\u14f3\u14f5\u162d\u1514\u14df\u14ed\u1519\u1513\u1513\u1517\u14e0\u1541\u1512\u150b\u162a\u162c\u14e2\u1518\u150d\u14f2\u1507\u14f7\u14de\u1518\u162a\u1634\u14e0\u14f6\u14de\u14f4\u14f8\u1681\u14de\u1515\u151b\u1639\u150c\u1518\u14f3\u162c\u163b\u151d\u163c\u163b\u151b\u150c\u151a\u14e2\u1639\u163b\u151d\u162a\u167e\u1514\u14de\u151a\u14e2\u14e3\u1507\u14f2\u14e6\u14e3\u14f9\u1519\u150b\u1507\u14e3\u162c\u167e\u14e2\u1680\u150c\u1515\u1507\u1680\u14e0\u151d\u1513\u1519\u14f3\u14de\u1636\u151b\u1638\u14eb\u1512\u14f3\u1512\u1519\u167e\u151b\u1516\u1518\u14f3\u1506\u1636\u1636\u1637\u14f9\u14df\u14f2\u1638\u151c\u162c\u163b\u14f9\u1509\u1680\u14ec\u14de\u14de\u151c\u1633\u14ed\u1680\u14df\u1518\u14e2\u1637\u1516\u14f7\u1513\u1635\u14eb\u1634\u14e0\u1638\u1632\u167e\u150a\u1639\u150b\u14ed\u14f2\u167e\u167e\u1515\u14eb\u14ed\u163c\u14ed\u1638\u14f2\u14e3\u1516\u14f2\u1681\u150d\u1515\u162d\u150d\u1503\u1502\u163c\u151a\u151d\u1518\u1632\u14f4\u1635\u163b\u163b\u14ec\u1518\u162d\u14e6\u1637\u1503\u14f7\u1507\u1638\u14e9\u14e2\u14f4\u1506\u14e9\u1506\u14f2\u1517\u1636\u1636\u1506\u14e6\u14e9\u14e8\u1514\u150c\u14ed\u1632\u162b\u1517\u1636\u14e3\u1636\u1513\u14e3\u14df\u14f6\u14f2\u14e3\u1636\u14e7\u14de\u1638\u1635\u14f3\u1519\u162a\u150a\u14f5\u151c\u163c\u14f9\u1513\u1635\u14f2\u1514\u14f7\u150b\u1502\u14f4\u1638\u162c\u14e7\u1517\u1516\u1516\u1541\u14de\u1636\u14f6\u151c\u163a\u14e8\u1638\u163a\u163a\u14df\u151d\u1541\u1634\u162c\u1503\u14e3\u1513\u1519\u151c\u162c\u14f7\u1517\u1513\u151c\u1502\u1636\u1635\u163a\u162a\u14f8\u14e9\u14e9\u1518\u162d\u14e9\u14de\u14f9\u14ed\u150a\u14f8\u1516\u162c\u14f5\u163a\u1680\u1680\u163d\u14eb\u14ed\u1680\u14f8\u1514\u1518\u1506\u162c\u1519\u1508\u14df\u1507\u14de\u1519\u1633\u14ec\u1518\u1634".toCharArray();
            for (int i2 = h[96]; i2 < h[97]; ++i2) {
                int n5 = cArray[i2];
                n5 += h[98];
                n5 ^= h[99];
                n5 -= h[100];
                n5 += h[101];
                n5 += h[102];
                n5 += h[103];
                n5 ^= h[104];
                n5 -= h[105];
                n5 -= h[106];
                cArray[i2] = (char)(n5 += h[107]);
            }
            object = ModuleColorSaturation.A()[ModuleColorSaturation.h[108]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)ModuleColorSaturation.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = h[109];
        n6 ^= h[110];
        l6 = l17 ^ (0xE500000000L ^ l17) & -1L << (n6 ^= h[111]);
        long l18 = l13;
        int n7 = h[112];
        n7 -= h[113];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 ^= h[114]);
        while (true) {
            int n8 = h[115];
            n8 -= h[116];
            if ((int)l13 >= (int)(l6 >>> (n8 -= h[117]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = h[118];
            n10 += h[119];
            int n11 = h[121];
            n11 += h[122];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 ^= h[120])) & -1L >>> (n11 -= h[123]);
            long l20 = l9;
            int n12 = h[124];
            n12 += h[125];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 -= h[126]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = h[127];
            n14 += h[128];
            int n15 = h[130];
            n15 += h[131];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= h[129])) & -1L >>> (n15 ^= h[132]);
            int n16 = h[133];
            n16 -= h[134];
            long l22 = l10;
            int n17 = h[136];
            n17 += h[137];
            l10 = l22 ^ ((long)cArray[n13] << (n16 -= h[135]) ^ l22) & -1L << (n17 += h[138]);
            int n18 = h[139];
            n18 += h[140];
            n18 += h[141];
            int n19 = h[142];
            n19 ^= h[143];
            long l23 = l12;
            int n20 = h[145];
            n20 += h[146];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 ^= h[144]))) ^ l23) & -1L >>> (n20 -= h[147]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = h[148];
            n21 ^= h[149];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 += h[150]);
            while (true) {
                int n22 = h[151];
                n22 ^= h[152];
                if ((int)(l14 >>> (n22 ^= h[153])) >= (int)l12) break;
                int n23 = h[154];
                n23 += h[155];
                int n24 = h[157];
                n24 -= h[158];
                cArray2[(int)(l14 >>> (n23 ^= ModuleColorSaturation.h[156]))] = cArray[(int)l13 + (int)(l14 >>> (n24 ^= h[159]))];
                l14 += 0x100000000L;
            }
            int n25 = h[160];
            n25 ^= h[161];
            int n26 = (int)(l15 >>> (n25 += h[162]));
            l15 += 0x100000000L;
            ModuleColorSaturation.E[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = h[163];
            n27 += h[164];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 -= h[165]);
        }
        INSTANCE = new ModuleColorSaturation();
        int n28 = h[166];
        n28 += h[167];
        a = INSTANCE.slider((String)E[n28 -= h[168]], 1.35f, 0.0f, 2.0f, 0.05f);
        int n29 = h[169];
        n29 += h[170];
        int n30 = h[172];
        n30 += h[173];
        int n31 = h[175];
        n31 += h[176];
        A = Identifier.of((String)((String)E[n29 -= h[171]]), (String)((String)E[n30 -= h[174]] + (String)E[n31 ^= h[177]]));
        int n32 = h[178];
        n32 -= h[179];
        int n33 = h[181];
        n33 += h[182];
        int n34 = h[184];
        n34 += h[185];
        b = Identifier.of((String)((String)E[n32 -= h[180]]), (String)((String)E[n33 ^= h[183]] + (String)E[n34 -= h[186]]));
        int n35 = h[187];
        n35 += h[188];
        int n36 = h[190];
        n36 ^= h[191];
        B = Identifier.of((String)((String)E[n35 ^= h[189]]), (String)((String)E[n36 += h[192]]));
        int n37 = h[193];
        n37 ^= h[194];
        int n38 = h[196];
        n38 -= h[197];
        c = Identifier.of((String)((String)E[n37 += h[195]]), (String)((String)E[n38 -= h[198]]));
        C = Float.NaN;
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[h[199]];
        String string = (String)object[h[200]];
        object = object[h[201]];
        Object[] objectArray = g;
        if (g == null) {
            objectArray = g = new Object[h[202]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[h[203]];
                f = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[h[205] ^ h[206]];
                byArray[ModuleColorSaturation.h[207] ^ ModuleColorSaturation.h[208]] = h[209] ^ h[210];
                byArray[ModuleColorSaturation.h[211] ^ ModuleColorSaturation.h[212]] = h[213] ^ h[214];
                byArray[ModuleColorSaturation.h[215] ^ ModuleColorSaturation.h[216]] = h[217] ^ h[218];
                byArray[ModuleColorSaturation.h[219] ^ ModuleColorSaturation.h[220]] = h[221] ^ h[222];
                byArray[ModuleColorSaturation.h[223] ^ ModuleColorSaturation.h[224]] = h[225] ^ h[226];
                byArray[ModuleColorSaturation.h[227] ^ ModuleColorSaturation.h[228]] = h[229] ^ h[230];
                byArray[ModuleColorSaturation.h[231] ^ ModuleColorSaturation.h[232]] = h[233] ^ h[234];
                byArray[ModuleColorSaturation.h[235] ^ ModuleColorSaturation.h[236]] = h[237] ^ h[238];
                byArray[ModuleColorSaturation.h[239] ^ ModuleColorSaturation.h[240]] = h[241] ^ h[242];
                byArray[ModuleColorSaturation.h[243] ^ ModuleColorSaturation.h[244]] = h[245] ^ h[246];
                byArray[ModuleColorSaturation.h[247] ^ ModuleColorSaturation.h[248]] = h[249] ^ h[250];
                byArray[ModuleColorSaturation.h[251] ^ ModuleColorSaturation.h[252]] = h[253] ^ h[254];
                byArray[ModuleColorSaturation.h[255] ^ ModuleColorSaturation.h[256]] = h[257] ^ h[258];
                byArray[ModuleColorSaturation.h[259] ^ ModuleColorSaturation.h[260]] = h[261] ^ h[262];
                byArray[ModuleColorSaturation.h[263] ^ ModuleColorSaturation.h[264]] = h[265] ^ h[266];
                byArray[ModuleColorSaturation.h[267] ^ ModuleColorSaturation.h[268]] = h[269] ^ h[270];
                objectArray2[ModuleColorSaturation.h[204]] = byArray;
            }
            byte[] byArray = (byte[])object3[h[271]];
            if (F == null) {
                byte[] byArray2 = new byte[h[272] ^ h[273]];
                byArray2[ModuleColorSaturation.h[274] ^ ModuleColorSaturation.h[275]] = h[276] ^ h[277];
                byArray2[ModuleColorSaturation.h[278] ^ ModuleColorSaturation.h[279]] = h[280] ^ h[281];
                byArray2[ModuleColorSaturation.h[282] ^ ModuleColorSaturation.h[283]] = h[284] ^ h[285];
                byArray2[ModuleColorSaturation.h[286] ^ ModuleColorSaturation.h[287]] = h[288] ^ h[289];
                byArray2[ModuleColorSaturation.h[290] ^ ModuleColorSaturation.h[291]] = h[292] ^ h[293];
                byArray2[ModuleColorSaturation.h[294] ^ ModuleColorSaturation.h[295]] = h[296] ^ h[297];
                byArray2[ModuleColorSaturation.h[298] ^ ModuleColorSaturation.h[299]] = h[300] ^ h[301];
                byArray2[ModuleColorSaturation.h[302] ^ ModuleColorSaturation.h[303]] = h[304] ^ h[305];
                byArray2[ModuleColorSaturation.h[306] ^ ModuleColorSaturation.h[307]] = h[308] ^ h[309];
                byArray2[ModuleColorSaturation.h[310] ^ ModuleColorSaturation.h[311]] = h[312] ^ h[313];
                byArray2[ModuleColorSaturation.h[314] ^ ModuleColorSaturation.h[315]] = h[316] ^ h[317];
                byArray2[ModuleColorSaturation.h[318] ^ ModuleColorSaturation.h[319]] = h[320] ^ h[321];
                byArray2[ModuleColorSaturation.h[322] ^ ModuleColorSaturation.h[323]] = h[324] ^ h[325];
                byArray2[ModuleColorSaturation.h[326] ^ ModuleColorSaturation.h[327]] = h[328] ^ h[329];
                byArray2[ModuleColorSaturation.h[330] ^ ModuleColorSaturation.h[331]] = h[332] ^ h[333];
                byArray2[ModuleColorSaturation.h[334] ^ ModuleColorSaturation.h[335]] = h[336] ^ h[337];
                byArray2[ModuleColorSaturation.h[338] ^ ModuleColorSaturation.h[339]] = h[340] ^ h[341];
                byArray2[ModuleColorSaturation.h[342] ^ ModuleColorSaturation.h[343]] = h[344] ^ h[345];
                byArray2[ModuleColorSaturation.h[346] ^ ModuleColorSaturation.h[347]] = h[348] ^ h[349];
                byArray2[ModuleColorSaturation.h[350] ^ ModuleColorSaturation.h[351]] = h[352] ^ h[353];
                byArray2[ModuleColorSaturation.h[354] ^ ModuleColorSaturation.h[355]] = h[356] ^ h[357];
                byArray2[ModuleColorSaturation.h[358] ^ ModuleColorSaturation.h[359]] = h[360] ^ h[361];
                byArray2[ModuleColorSaturation.h[362] ^ ModuleColorSaturation.h[363]] = h[364] ^ h[365];
                byArray2[ModuleColorSaturation.h[366] ^ ModuleColorSaturation.h[367]] = h[368] ^ h[369];
                byArray2[ModuleColorSaturation.h[370] ^ ModuleColorSaturation.h[371]] = h[372] ^ h[373];
                byArray2[ModuleColorSaturation.h[374] ^ ModuleColorSaturation.h[375]] = h[376] ^ h[377];
                byArray2[ModuleColorSaturation.h[378] ^ ModuleColorSaturation.h[379]] = h[380] ^ h[381];
                byArray2[ModuleColorSaturation.h[382] ^ ModuleColorSaturation.h[383]] = h[384] ^ h[385];
                byArray2[ModuleColorSaturation.h[386] ^ ModuleColorSaturation.h[387]] = h[388] ^ h[389];
                byArray2[ModuleColorSaturation.h[390] ^ ModuleColorSaturation.h[391]] = h[392] ^ h[393];
                byArray2[ModuleColorSaturation.h[394] ^ ModuleColorSaturation.h[395]] = h[396] ^ h[397];
                byArray2[ModuleColorSaturation.h[398] ^ ModuleColorSaturation.h[399]] = 0xE393 ^ 0xE3D2;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = ModuleColorSaturation.A()[1];
                if (object4 == null) {
                    char[] cArray = "\uc4b2\uc48c\uc4b7\uc48e\uc488\uc49c\uc4bb\uc4d5\uc4de\uc4aa\uc48a\uc4d1\uc4ad\uc4af\uc4bf\uc48a\uc48d\uc49d".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= 0x350;
                        n3 ^= 0xF145;
                        n3 += 2997;
                        n3 -= 52470;
                        n3 += 58086;
                        n3 -= 39878;
                        n3 -= 11049;
                        n3 -= 49801;
                        n3 += 18778;
                        n3 += 55101;
                        n3 -= 27949;
                        cArray[i2] = (char)(n3 -= 33262);
                    }
                    object4 = ModuleColorSaturation.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[9] = 98;
                byArray4[3] = 50;
                byArray4[11] = -121;
                byArray4[4] = 42;
                byArray4[14] = -12;
                byArray4[7] = 106;
                byArray4[6] = 60;
                byArray4[1] = 104;
                byArray4[0] = 73;
                byArray4[8] = -2;
                byArray4[5] = -114;
                byArray4[2] = -23;
                byArray4[15] = -64;
                byArray4[10] = -17;
                byArray4[13] = -117;
                byArray4[12] = 120;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 15, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = ModuleColorSaturation.A()[2];
                if (object5 == null) {
                    char[] cArray = "\uf56b\uf567\uf551".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= 36752;
                        n4 ^= 0x753;
                        n4 += 26309;
                        n4 -= 36006;
                        n4 ^= 0xDF17;
                        n4 -= 5047;
                        n4 -= 11497;
                        n4 ^= 0xE9DA;
                        n4 += 5258;
                        n4 += 50030;
                        cArray[i3] = (char)(n4 += 56703);
                    }
                    object5 = ModuleColorSaturation.A()[2] = new String(cArray);
                }
                F = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = ModuleColorSaturation.A()[3];
            if (object6 == null) {
                char[] cArray = "\ub2df\ub2d3\ub2e5\ub3b1\ub2d5\ub2d4\ub2d5\ub3b1\ub2ee\ub2cd\ub2d5\ub2e5\ub343\ub2ee\ub2ff\ub2f2\ub2f2\ub2f7\ub2f0\ub2f9".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 ^= 0x3840;
                    n5 ^= 0xB120;
                    n5 ^= 0x57E2;
                    n5 ^= 0x91E3;
                    n5 ^= 0xA64;
                    n5 -= 38566;
                    n5 += 52072;
                    n5 ^= 0xD00A;
                    n5 ^= 0xE0B0;
                    n5 -= 31441;
                    n5 += 40819;
                    n5 -= 60884;
                    cArray[i4] = (char)(n5 ^= 0x52B5);
                }
                object6 = ModuleColorSaturation.A()[3] = new String(cArray);
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
        h = new int[0xFC99 ^ 0xFD09];
        ModuleColorSaturation.h[0xF152 ^ 0xF110] = 0xF107 ^ 0xF110;
        ModuleColorSaturation.h[0xFA1B ^ 0xFA4A] = 0xFA7A ^ 0xFA4A;
        ModuleColorSaturation.h[0x95E9 ^ 0x95AE] = 0x95A9 ^ 0x95AE;
        ModuleColorSaturation.h[0x18EE ^ 0x181D] = 0x19F2 ^ 0x181D;
        ModuleColorSaturation.h[0xCDAF ^ 0xCC84] = 0x7838 ^ 0xCC84;
        ModuleColorSaturation.h[0x37E1 ^ 0x37E9] = 0xFFFFC853 ^ 0x37E9;
        ModuleColorSaturation.h[0x4EE0 ^ 0x4EA5] = 0xFFFFB133 ^ 0x4EA5;
        ModuleColorSaturation.h[0x1DDF ^ 0x1D82] = 0x1D82 ^ 0x1D82;
        ModuleColorSaturation.h[0xE9CC ^ 0xE9EE] = 0xE9DD ^ 0xE9EE;
        ModuleColorSaturation.h[0x49DD ^ 0x4898] = 0xBE9 ^ 0x4898;
        ModuleColorSaturation.h[0x5B57 ^ 0x5BC2] = 0x5BBA ^ 0x5BC2;
        ModuleColorSaturation.h[0x63A1 ^ 0x6333] = 0x6333 ^ 0x6333;
        ModuleColorSaturation.h[0x9D99 ^ 0x9D73] = 0x1BF6 ^ 0x9D73;
        ModuleColorSaturation.h[0xA632 ^ 0xA673] = 0xA61E ^ 0xA673;
        ModuleColorSaturation.h[0xC020 ^ 0xC12F] = 0xC12F ^ 0xC12F;
        ModuleColorSaturation.h[0x8041 ^ 0x8160] = 0xC6C0 ^ 0x8160;
        ModuleColorSaturation.h[0xFF40 ^ 0xFFB0] = 0x4752 ^ 0xFFB0;
        ModuleColorSaturation.h[0x3EC4 ^ 0x3E4D] = 0x3E0D ^ 0x3E4D;
        ModuleColorSaturation.h[0xAA20 ^ 0xABAE] = 0x4861 ^ 0xABAE;
        ModuleColorSaturation.h[0xB6B5 ^ 0xB7BB] = 0x4C37 ^ 0xB7BB;
        ModuleColorSaturation.h[0xC919 ^ 0xC995] = 0xFFFF361D ^ 0xC995;
        ModuleColorSaturation.h[0xC71C ^ 0xC742] = 0xC740 ^ 0xC742;
        ModuleColorSaturation.h[0x10A8A ^ 0x10AAA] = 0xFFFEF543 ^ 0x10AAA;
        ModuleColorSaturation.h[0x1BAD ^ 0x1AA9] = 0x29FC ^ 0x1AA9;
        ModuleColorSaturation.h[0x42DE ^ 0x4352] = 0x75C8 ^ 0x4352;
        ModuleColorSaturation.h[0x9B4A ^ 0x9A7A] = 0xFFFF3B2B ^ 0x9A7A;
        ModuleColorSaturation.h[0x3B8B ^ 0x3B48] = 0x3B7C ^ 0x3B48;
        ModuleColorSaturation.h[0x74A5 ^ 0x75C8] = 0xE998 ^ 0x75C8;
        ModuleColorSaturation.h[0xB6D1 ^ 0xB6DD] = 0xB666 ^ 0xB6DD;
        ModuleColorSaturation.h[0x135C ^ 0x1225] = 0x9E2D ^ 0x1225;
        ModuleColorSaturation.h[0x29E3 ^ 0x29D6] = 0x2989 ^ 0x29D6;
        ModuleColorSaturation.h[0xBFDB ^ 0xBE97] = 0x1751 ^ 0xBE97;
        ModuleColorSaturation.h[0xB8C4 ^ 0xB86D] = 0xB8EE ^ 0xB86D;
        ModuleColorSaturation.h[0x92E6 ^ 0x92E1] = 0x92F0 ^ 0x92E1;
        ModuleColorSaturation.h[0x4081 ^ 0x41B2] = 0x4BA6 ^ 0x41B2;
        ModuleColorSaturation.h[0x9CE7 ^ 0x9C80] = 0xB7D7 ^ 0x9C80;
        ModuleColorSaturation.h[0x6B46 ^ 0x6B52] = 0x6B7D ^ 0x6B52;
        ModuleColorSaturation.h[0x10E0A ^ 0x10EBD] = 0x10ED2 ^ 0x10EBD;
        ModuleColorSaturation.h[0x8483 ^ 0x8481] = 0x848F ^ 0x8481;
        ModuleColorSaturation.h[0x996 ^ 0x95E] = 0x95C ^ 0x95E;
        ModuleColorSaturation.h[0xBCA ^ 0xB6A] = 0xFFFFF49C ^ 0xB6A;
        ModuleColorSaturation.h[0xCF9D ^ 0xCF81] = 0xFFFF3061 ^ 0xCF81;
        ModuleColorSaturation.h[0x80D2 ^ 0x8056] = 0xFFFF7FF6 ^ 0x8056;
        ModuleColorSaturation.h[0xFCD4 ^ 0xFC03] = 0x2C0C ^ 0xFC03;
        ModuleColorSaturation.h[0x7C5B ^ 0x7C61] = 0xFFFF83D9 ^ 0x7C61;
        ModuleColorSaturation.h[0x6D81 ^ 0x6D4C] = 0x87C0 ^ 0x6D4C;
        ModuleColorSaturation.h[0x1591 ^ 0x1523] = 0x153E ^ 0x1523;
        ModuleColorSaturation.h[0xE744 ^ 0xE638] = 0xFFFE1FFE ^ 0xE638;
        ModuleColorSaturation.h[0xD7B8 ^ 0xD684] = 0x8DCB ^ 0xD684;
        ModuleColorSaturation.h[0x3A80 ^ 0x3BD3] = 0xAFB4 ^ 0x3BD3;
        ModuleColorSaturation.h[0xD063 ^ 0xD075] = 0xFFFF2FE8 ^ 0xD075;
        ModuleColorSaturation.h[0x1BB9 ^ 0x1B84] = 0xFFFFE45F ^ 0x1B84;
        ModuleColorSaturation.h[0x8200 ^ 0x8338] = 0xA5AF ^ 0x8338;
        ModuleColorSaturation.h[0x2974 ^ 0x29C0] = 0xFFFFD673 ^ 0x29C0;
        ModuleColorSaturation.h[0x73B0 ^ 0x7290] = 0x352F ^ 0x7290;
        ModuleColorSaturation.h[0xDC28 ^ 0xDCA3] = 0xDCBD ^ 0xDCA3;
        ModuleColorSaturation.h[0x98B6 ^ 0x9866] = 0x55F5 ^ 0x9866;
        ModuleColorSaturation.h[0x10719 ^ 0x1065A] = 0x1452B ^ 0x1065A;
        ModuleColorSaturation.h[0x4688 ^ 0x46FC] = 0xFFFFB973 ^ 0x46FC;
        ModuleColorSaturation.h[0x10C54 ^ 0x10CE8] = 0xFFFEF332 ^ 0x10CE8;
        ModuleColorSaturation.h[0x12AB ^ 0x1261] = 0x1260 ^ 0x1261;
        ModuleColorSaturation.h[0xBDD9 ^ 0xBC9D] = 0xFFFF0052 ^ 0xBC9D;
        ModuleColorSaturation.h[0x80DE ^ 0x81D8] = 0xB28D ^ 0x81D8;
        ModuleColorSaturation.h[0x37ED ^ 0x36F6] = 0xAAB4 ^ 0x36F6;
        ModuleColorSaturation.h[0x9DE5 ^ 0x9DBF] = 0x9DBC ^ 0x9DBF;
        ModuleColorSaturation.h[0x809F ^ 0x818C] = 0x47B6 ^ 0x818C;
        ModuleColorSaturation.h[0x2E00 ^ 0x2E6A] = 0x41A6 ^ 0x2E6A;
        ModuleColorSaturation.h[0x31EB ^ 0x3144] = 0x31DF ^ 0x3144;
        ModuleColorSaturation.h[0x48BD ^ 0x4893] = 0x48C2 ^ 0x4893;
        ModuleColorSaturation.h[0xEF76 ^ 0xEE04] = 0xC1B6 ^ 0xEE04;
        ModuleColorSaturation.h[0x6C1D ^ 0x6D3F] = 0xC1F0 ^ 0x6D3F;
        ModuleColorSaturation.h[0x9CBD ^ 0x9C3E] = 0x9C5A ^ 0x9C3E;
        ModuleColorSaturation.h[0x7114 ^ 0x7104] = 0xFFFF8EDB ^ 0x7104;
        ModuleColorSaturation.h[0x402 ^ 0x418] = 0xFFFFFBD9 ^ 0x418;
        ModuleColorSaturation.h[0xDBEA ^ 0xDBBA] = 0xDB87 ^ 0xDBBA;
        ModuleColorSaturation.h[0xAAD1 ^ 0xABC4] = 0x6DFE ^ 0xABC4;
        ModuleColorSaturation.h[0xF577 ^ 0xF5D9] = 0xFFFF0A6D ^ 0xF5D9;
        ModuleColorSaturation.h[0x6EEB ^ 0x6F8C] = 0xA6D0 ^ 0x6F8C;
        ModuleColorSaturation.h[0x1E23 ^ 0x1E32] = 0x1E26 ^ 0x1E32;
        ModuleColorSaturation.h[0x353C ^ 0x3443] = 0x69EA ^ 0x3443;
        ModuleColorSaturation.h[0xE8EA ^ 0xE85B] = 0xE817 ^ 0xE85B;
        ModuleColorSaturation.h[0xD21F ^ 0xD34F] = 0xFAAA ^ 0xD34F;
        ModuleColorSaturation.h[0xB324 ^ 0xB3CF] = 0x7499 ^ 0xB3CF;
        ModuleColorSaturation.h[0xFD9C ^ 0xFDAD] = 0xFFFF025A ^ 0xFDAD;
        ModuleColorSaturation.h[0x84A3 ^ 0x85A9] = 0x387E ^ 0x85A9;
        ModuleColorSaturation.h[0xD5BC ^ 0xD4A5] = 0x71F9 ^ 0xD4A5;
        ModuleColorSaturation.h[0x6955 ^ 0x69CD] = 0xFFFF9603 ^ 0x69CD;
        ModuleColorSaturation.h[0x8855 ^ 0x8925] = 0x18A65 ^ 0x8925;
        ModuleColorSaturation.h[0x2417 ^ 0x257E] = 0xEC22 ^ 0x257E;
        ModuleColorSaturation.h[0x9F15 ^ 0x9F66] = 0xFFFF6003 ^ 0x9F66;
        ModuleColorSaturation.h[0x980C ^ 0x980F] = 0x981E ^ 0x980F;
        ModuleColorSaturation.h[0x84E5 ^ 0x85D8] = 0xDEDB ^ 0x85D8;
        ModuleColorSaturation.h[0x28CF ^ 0x29D2] = 0xB590 ^ 0x29D2;
        ModuleColorSaturation.h[0x46DB ^ 0x47FD] = 0x6BFA ^ 0x47FD;
        ModuleColorSaturation.h[0xCF93 ^ 0xCF40] = 0x1C8FB ^ 0xCF40;
        ModuleColorSaturation.h[0x3637 ^ 0x36FC] = 0x36FD ^ 0x36FC;
        ModuleColorSaturation.h[0x10F78 ^ 0x10E42] = 0x15558 ^ 0x10E42;
        ModuleColorSaturation.h[0xAA7F ^ 0xAA93] = 0x6DC8 ^ 0xAA93;
        ModuleColorSaturation.h[0x1648 ^ 0x1638] = 0xFFFFE9EC ^ 0x1638;
        ModuleColorSaturation.h[0xDF69 ^ 0xDF3D] = 0xDF17 ^ 0xDF3D;
        ModuleColorSaturation.h[0x15A7 ^ 0x150D] = 0xFFFFEAF9 ^ 0x150D;
        ModuleColorSaturation.h[0x8AE7 ^ 0x8A74] = 0xFFFF759C ^ 0x8A74;
        ModuleColorSaturation.h[0x75A8 ^ 0x756C] = 0xFFFF8AC8 ^ 0x756C;
        ModuleColorSaturation.h[0x5521 ^ 0x541E] = 0x813A ^ 0x541E;
        ModuleColorSaturation.h[0xA69E ^ 0xA7AC] = 0xADB2 ^ 0xA7AC;
        ModuleColorSaturation.h[0xC0C5 ^ 0xC073] = 0xFFFF3FCB ^ 0xC073;
        ModuleColorSaturation.h[0x694E ^ 0x6811] = 0x3AFF ^ 0x6811;
        ModuleColorSaturation.h[0xBAAA ^ 0xBA52] = 0x36C0 ^ 0xBA52;
        ModuleColorSaturation.h[0xB5C3 ^ 0xB5D0] = 0xB596 ^ 0xB5D0;
        ModuleColorSaturation.h[0x3D80 ^ 0x3D56] = 0x13AE8 ^ 0x3D56;
        ModuleColorSaturation.h[0xCE04 ^ 0xCF8F] = 0xF96A ^ 0xCF8F;
        ModuleColorSaturation.h[0x8A38 ^ 0x8ADC] = 0x18C99 ^ 0x8ADC;
        ModuleColorSaturation.h[0xA41A ^ 0xA575] = 0x1A666 ^ 0xA575;
        ModuleColorSaturation.h[0x904 ^ 0x9FB] = 0x312C ^ 0x9FB;
        ModuleColorSaturation.h[0x225A ^ 0x2300] = 0xE2F3 ^ 0x2300;
        ModuleColorSaturation.h[0x1DF6 ^ 0x1DFC] = 0x1DA0 ^ 0x1DFC;
        ModuleColorSaturation.h[0x29C9 ^ 0x29D4] = 0x29BB ^ 0x29D4;
        ModuleColorSaturation.h[0xC925 ^ 0xC913] = 0xC97C ^ 0xC913;
        ModuleColorSaturation.h[0x1521 ^ 0x1435] = 0xD27E ^ 0x1435;
        ModuleColorSaturation.h[0xAD2B ^ 0xAD4A] = 0xACCA ^ 0xAD4A;
        ModuleColorSaturation.h[0x1033B ^ 0x10334] = 0xFFFEFCE7 ^ 0x10334;
        ModuleColorSaturation.h[0xE69D ^ 0xE7E3] = 0xBA58 ^ 0xE7E3;
        ModuleColorSaturation.h[0xE65A ^ 0xE722] = 0xFFFF94B6 ^ 0xE722;
        ModuleColorSaturation.h[0x68DC ^ 0x68DA] = 0x6887 ^ 0x68DA;
        ModuleColorSaturation.h[0xE562 ^ 0xE5E4] = 0xFFFF1A62 ^ 0xE5E4;
        ModuleColorSaturation.h[0xB6DA ^ 0xB634] = 0x716F ^ 0xB634;
        ModuleColorSaturation.h[0x9C28 ^ 0x9C0C] = 0xFFFF637A ^ 0x9C0C;
        ModuleColorSaturation.h[0x54F6 ^ 0x55EC] = 0xC9BD ^ 0x55EC;
        ModuleColorSaturation.h[0x4929 ^ 0x4835] = 0xFFFF2BCC ^ 0x4835;
        ModuleColorSaturation.h[0x106AA ^ 0x107CC] = 0x1CE8E ^ 0x107CC;
        ModuleColorSaturation.h[0x7131 ^ 0x71B6] = 0x718B ^ 0x71B6;
        ModuleColorSaturation.h[0xB537 ^ 0xB53E] = 0xFFFF4AD1 ^ 0xB53E;
        ModuleColorSaturation.h[0x22C5 ^ 0x2382] = 0x4DAD ^ 0x2382;
        ModuleColorSaturation.h[0xD528 ^ 0xD585] = 0xD5D3 ^ 0xD585;
        ModuleColorSaturation.h[0x10736 ^ 0x10664] = 0x19217 ^ 0x10664;
        ModuleColorSaturation.h[0xB775 ^ 0xB7F7] = 0xFFFF48EB ^ 0xB7F7;
        ModuleColorSaturation.h[0x8C47 ^ 0x8D42] = 0xBE79 ^ 0x8D42;
        ModuleColorSaturation.h[0x5849 ^ 0x580D] = 0xFFFFA7F9 ^ 0x580D;
        ModuleColorSaturation.h[0x5F18 ^ 0x5F7C] = 0x530F ^ 0x5F7C;
        ModuleColorSaturation.h[0x53C4 ^ 0x52E3] = 0x7EE6 ^ 0x52E3;
        ModuleColorSaturation.h[0x8C9B ^ 0x8DF9] = 0xAD04 ^ 0x8DF9;
        ModuleColorSaturation.h[0x1157 ^ 0x103B] = 0xFFFF738B ^ 0x103B;
        ModuleColorSaturation.h[0x62B ^ 0x728] = 0x347C ^ 0x728;
        ModuleColorSaturation.h[0x8BB6 ^ 0x8B69] = 0x4ED2 ^ 0x8B69;
        ModuleColorSaturation.h[0x8738 ^ 0x8774] = 0xFFFF78D2 ^ 0x8774;
        ModuleColorSaturation.h[0x7C55 ^ 0x7CBC] = 0xFFFF0587 ^ 0x7CBC;
        ModuleColorSaturation.h[0xF8EF ^ 0xF8B3] = 0xF8B2 ^ 0xF8B3;
        ModuleColorSaturation.h[0x36BC ^ 0x3641] = 0xC143 ^ 0x3641;
        ModuleColorSaturation.h[0xE074 ^ 0xE0F9] = 0xE093 ^ 0xE0F9;
        ModuleColorSaturation.h[0x90B ^ 0x930] = 0x94D ^ 0x930;
        ModuleColorSaturation.h[0xC73 ^ 0xC25] = 0xC7B ^ 0xC25;
        ModuleColorSaturation.h[0x1A1D ^ 0x1A78] = 0xB4BB ^ 0x1A78;
        ModuleColorSaturation.h[0x3832 ^ 0x38DF] = 0xFFC2 ^ 0x38DF;
        ModuleColorSaturation.h[0xEE5B ^ 0xEEB8] = 0x1E8FD ^ 0xEEB8;
        ModuleColorSaturation.h[0x6212 ^ 0x62E3] = 0xFFFF25DF ^ 0x62E3;
        ModuleColorSaturation.h[0xE4FA ^ 0xE4BA] = 0xFFFF1B55 ^ 0xE4BA;
        ModuleColorSaturation.h[0xF613 ^ 0xF6F4] = 0x7078 ^ 0xF6F4;
        ModuleColorSaturation.h[0xAFD0 ^ 0xAF41] = 0xAF49 ^ 0xAF41;
        ModuleColorSaturation.h[0x12FF ^ 0x12B4] = 0x1296 ^ 0x12B4;
        ModuleColorSaturation.h[0x243D ^ 0x2577] = 0x8C83 ^ 0x2577;
        ModuleColorSaturation.h[0x10098 ^ 0x1003E] = 0xFFFEFF9C ^ 0x1003E;
        ModuleColorSaturation.h[0x9E3D ^ 0x9EE9] = 0x19957 ^ 0x9EE9;
        ModuleColorSaturation.h[0x9E0F ^ 0x9E7D] = 0xFFFF618A ^ 0x9E7D;
        ModuleColorSaturation.h[0x166 ^ 0x1E7] = 0xFFFFFE11 ^ 0x1E7;
        ModuleColorSaturation.h[0x989B ^ 0x99D9] = 0xDAAD ^ 0x99D9;
        ModuleColorSaturation.h[0xF477 ^ 0xF41A] = 0xF466 ^ 0xF41A;
        ModuleColorSaturation.h[0xD5FC ^ 0xD566] = 0xFFFF2A9B ^ 0xD566;
        ModuleColorSaturation.h[0xD9D5 ^ 0xD9CE] = 0xFFFF264A ^ 0xD9CE;
        ModuleColorSaturation.h[0xDE81 ^ 0xDEEF] = 0xFFFF2151 ^ 0xDEEF;
        ModuleColorSaturation.h[0x3E0F ^ 0x3F47] = 0x5108 ^ 0x3F47;
        ModuleColorSaturation.h[0x1048C ^ 0x104C3] = 0xFFFEFB60 ^ 0x104C3;
        ModuleColorSaturation.h[0x55E9 ^ 0x5515] = 0xA236 ^ 0x5515;
        ModuleColorSaturation.h[0xEAB7 ^ 0xEBA6] = 0x1EA98 ^ 0xEBA6;
        ModuleColorSaturation.h[0x7979 ^ 0x7830] = 0x161F ^ 0x7830;
        ModuleColorSaturation.h[0x8E56 ^ 0x8F17] = 0x5A33 ^ 0x8F17;
        ModuleColorSaturation.h[0x53EC ^ 0x538E] = 0xCAC ^ 0x538E;
        ModuleColorSaturation.h[0xB717 ^ 0xB7F8] = 0xF12 ^ 0xB7F8;
        ModuleColorSaturation.h[0x99ED ^ 0x998B] = 0x781E ^ 0x998B;
        ModuleColorSaturation.h[0xB1DC ^ 0xB11D] = 0xB15D ^ 0xB11D;
        ModuleColorSaturation.h[0xDD1C ^ 0xDDBB] = 0xFFFF2254 ^ 0xDDBB;
        ModuleColorSaturation.h[0xB544 ^ 0xB5B6] = 0xD54 ^ 0xB5B6;
        ModuleColorSaturation.h[0xC8D0 ^ 0xC9D2] = 0xF10B ^ 0xC9D2;
        ModuleColorSaturation.h[0x2D0B ^ 0x2D45] = 0x2D65 ^ 0x2D45;
        ModuleColorSaturation.h[0xF8ED ^ 0xF8CA] = 0xF86B ^ 0xF8CA;
        ModuleColorSaturation.h[0xC586 ^ 0xC5B8] = 0xC5F1 ^ 0xC5B8;
        ModuleColorSaturation.h[0xDA11 ^ 0xDB91] = 0xFFFF79AD ^ 0xDB91;
        ModuleColorSaturation.h[0x253C ^ 0x25E7] = 0xB5E9 ^ 0x25E7;
        ModuleColorSaturation.h[0xE9A6 ^ 0xE9DB] = 0xE9D8 ^ 0xE9DB;
        ModuleColorSaturation.h[0xE065 ^ 0xE0C9] = 0xFFFF1FA0 ^ 0xE0C9;
        ModuleColorSaturation.h[0x39A0 ^ 0x392E] = 0xFFFFC6DF ^ 0x392E;
        ModuleColorSaturation.h[0x10618 ^ 0x106A1] = 0x106F8 ^ 0x106A1;
        ModuleColorSaturation.h[0x105EB ^ 0x105D7] = 0x105F3 ^ 0x105D7;
        ModuleColorSaturation.h[0xDB79 ^ 0xDB0F] = 0xDB11 ^ 0xDB0F;
        ModuleColorSaturation.h[0xCE2 ^ 0xC07] = 0x10A2C ^ 0xC07;
        ModuleColorSaturation.h[0x689F ^ 0x69B3] = 0xFFFF22A2 ^ 0x69B3;
        ModuleColorSaturation.h[0xE091 ^ 0xE0D2] = 0xFFFF1F39 ^ 0xE0D2;
        ModuleColorSaturation.h[0xA2FA ^ 0xA3D0] = 0x176D ^ 0xA3D0;
        ModuleColorSaturation.h[0xE98D ^ 0xE9D8] = 0xFFFF1655 ^ 0xE9D8;
        ModuleColorSaturation.h[0xD02E ^ 0xD0B1] = 0xD092 ^ 0xD0B1;
        ModuleColorSaturation.h[0xE2F7 ^ 0xE249] = 0xFFFF1DAF ^ 0xE249;
        ModuleColorSaturation.h[0xA82D ^ 0xA914] = 0x8FB4 ^ 0xA914;
        ModuleColorSaturation.h[0xEC70 ^ 0xECC0] = 0xFFFF1368 ^ 0xECC0;
        ModuleColorSaturation.h[0x22C ^ 0x2E0] = 0x2E0 ^ 0x2E0;
        ModuleColorSaturation.h[0x35D4 ^ 0x3554] = 0xFFFFCA8E ^ 0x3554;
        ModuleColorSaturation.h[0xDA41 ^ 0xDA6E] = 0xDA69 ^ 0xDA6E;
        ModuleColorSaturation.h[0xE81 ^ 0xE99] = 0xFFFFF144 ^ 0xE99;
        ModuleColorSaturation.h[0x611E ^ 0x6009] = 0xC555 ^ 0x6009;
        ModuleColorSaturation.h[0xBB12 ^ 0xBBDC] = 0x5140 ^ 0xBBDC;
        ModuleColorSaturation.h[0x7A28 ^ 0x7A60] = 0x7A1D ^ 0x7A60;
        ModuleColorSaturation.h[0xAE97 ^ 0xAF1D] = 0x99F3 ^ 0xAF1D;
        ModuleColorSaturation.h[0x8F7C ^ 0x8EF3] = 0x6D21 ^ 0x8EF3;
        ModuleColorSaturation.h[0x10B18 ^ 0x10B41] = 0xFFFEF4C9 ^ 0x10B41;
        ModuleColorSaturation.h[0x7613 ^ 0x765A] = 0xFFFF89A0 ^ 0x765A;
        ModuleColorSaturation.h[0xA70E ^ 0xA79E] = 0xFFFF5858 ^ 0xA79E;
        ModuleColorSaturation.h[0x9803 ^ 0x98D6] = 0xFFFE60DD ^ 0x98D6;
        ModuleColorSaturation.h[0x3F0E ^ 0x3F66] = 0x4BDE ^ 0x3F66;
        ModuleColorSaturation.h[0xBE92 ^ 0xBEF1] = 0x20D2 ^ 0xBEF1;
        ModuleColorSaturation.h[0x105EE ^ 0x104B8] = 0x10779 ^ 0x104B8;
        ModuleColorSaturation.h[0xA39B ^ 0xA3A2] = 0xFFFF5C60 ^ 0xA3A2;
        ModuleColorSaturation.h[0x8D47 ^ 0x8DDC] = 0x8DDC ^ 0x8DDC;
        ModuleColorSaturation.h[0x95A0 ^ 0x95BE] = 0xFFFF6A14 ^ 0x95BE;
        ModuleColorSaturation.h[0xEFC1 ^ 0xEED1] = 0x1EFCF ^ 0xEED1;
        ModuleColorSaturation.h[0x588E ^ 0x58BD] = 0x58DE ^ 0x58BD;
        ModuleColorSaturation.h[0xD3AC ^ 0xD38F] = 0xD39A ^ 0xD38F;
        ModuleColorSaturation.h[0xC2AE ^ 0xC28F] = 0xC2C7 ^ 0xC28F;
        ModuleColorSaturation.h[0x23AF ^ 0x234D] = 0xE6FD ^ 0x234D;
        ModuleColorSaturation.h[0xD736 ^ 0xD79E] = 0xFFFF280E ^ 0xD79E;
        ModuleColorSaturation.h[0xC52C ^ 0xC448] = 0xFFFF1B50 ^ 0xC448;
        ModuleColorSaturation.h[0x7B02 ^ 0x7B9C] = 0xFFFF8463 ^ 0x7B9C;
        ModuleColorSaturation.h[0x48CE ^ 0x4859] = 0x486F ^ 0x4859;
        ModuleColorSaturation.h[0xA334 ^ 0xA3CE] = 0x2F5C ^ 0xA3CE;
        ModuleColorSaturation.h[0x1186 ^ 0x1139] = 0xFFFFEEF2 ^ 0x1139;
        ModuleColorSaturation.h[0x91E7 ^ 0x90AC] = 0x3951 ^ 0x90AC;
        ModuleColorSaturation.h[0xE5BB ^ 0xE54F] = 0xE4A6 ^ 0xE54F;
        ModuleColorSaturation.h[0x57BA ^ 0x569E] = 0xFFFF0583 ^ 0x569E;
        ModuleColorSaturation.h[0xE8C1 ^ 0xE89A] = 0xE89A ^ 0xE89A;
        ModuleColorSaturation.h[0x7F39 ^ 0x7EBA] = 0xCD0B ^ 0x7EBA;
        ModuleColorSaturation.h[0x10E9A ^ 0x10F1C] = 0xFCD ^ 0x10F1C;
        ModuleColorSaturation.h[0xAC8 ^ 0xAB7] = 0xAAA ^ 0xAB7;
        ModuleColorSaturation.h[0xFB80 ^ 0xFA07] = 0x1FAC0 ^ 0xFA07;
        ModuleColorSaturation.h[0x6BF ^ 0x61D] = 0x647 ^ 0x61D;
        ModuleColorSaturation.h[0xBF28 ^ 0xBFBE] = 0xFFFF405B ^ 0xBFBE;
        ModuleColorSaturation.h[0xE401 ^ 0xE459] = 0xE41A ^ 0xE459;
        ModuleColorSaturation.h[0x6366 ^ 0x639F] = 0xEF4C ^ 0x639F;
        ModuleColorSaturation.h[0xA41D ^ 0xA4D2] = 0x6945 ^ 0xA4D2;
        ModuleColorSaturation.h[0x3C40 ^ 0x3D19] = 0x3EC2 ^ 0x3D19;
        ModuleColorSaturation.h[0x6500 ^ 0x643B] = 0x3F38 ^ 0x643B;
        ModuleColorSaturation.h[0xB88D ^ 0xB9D5] = 0xBA7B ^ 0xB9D5;
        ModuleColorSaturation.h[0x3F9C ^ 0x3F92] = 0x3FFC ^ 0x3F92;
        ModuleColorSaturation.h[0xE558 ^ 0xE5B0] = 0x6335 ^ 0xE5B0;
        ModuleColorSaturation.h[0x40D ^ 0x494] = 0xFFFFFB4C ^ 0x494;
        ModuleColorSaturation.h[0x5EFB ^ 0x5FD3] = 0xFFFF8C7D ^ 0x5FD3;
        ModuleColorSaturation.h[0xF95 ^ 0xEA4] = 0x5047 ^ 0xEA4;
        ModuleColorSaturation.h[0x56CD ^ 0x56E4] = 0x56B9 ^ 0x56E4;
        ModuleColorSaturation.h[0x10530 ^ 0x1045E] = 0x74A ^ 0x1045E;
        ModuleColorSaturation.h[0xCAA1 ^ 0xCBF4] = 0x5F93 ^ 0xCBF4;
        ModuleColorSaturation.h[0xBB32 ^ 0xBA57] = 0x9AAC ^ 0xBA57;
        ModuleColorSaturation.h[7 ^ 0x176] = 0x10265 ^ 0x176;
        ModuleColorSaturation.h[0x43BF ^ 0x43B4] = 0xFFFFBC24 ^ 0x43B4;
        ModuleColorSaturation.h[0x8FE ^ 0x9FF] = 0x3174 ^ 0x9FF;
        ModuleColorSaturation.h[0x70EC ^ 0x71BD] = 0x584C ^ 0x71BD;
        ModuleColorSaturation.h[0xE8DB ^ 0xE9BA] = 0xBB54 ^ 0xE9BA;
        ModuleColorSaturation.h[0x24FD ^ 0x257F] = 0x96D5 ^ 0x257F;
        ModuleColorSaturation.h[0x9BBB ^ 0x9BB6] = 0x9B83 ^ 0x9BB6;
        ModuleColorSaturation.h[0x5F51 ^ 0x5E5C] = 0xFFFF5A0E ^ 0x5E5C;
        ModuleColorSaturation.h[0x78F6 ^ 0x79D5] = 0xD512 ^ 0x79D5;
        ModuleColorSaturation.h[0x22E9 ^ 0x23E2] = 0xD862 ^ 0x23E2;
        ModuleColorSaturation.h[0xFFF2 ^ 0xFF20] = 0x32B3 ^ 0xFF20;
        ModuleColorSaturation.h[0xD7E5 ^ 0xD7CD] = 0xFFFF2811 ^ 0xD7CD;
        ModuleColorSaturation.h[0xE3C ^ 0xE0E] = 0xE64 ^ 0xE0E;
        ModuleColorSaturation.h[0xC629 ^ 0xC769] = 0xFFFFEDC3 ^ 0xC769;
        ModuleColorSaturation.h[0x75A0 ^ 0x75ED] = 0x7593 ^ 0x75ED;
        ModuleColorSaturation.h[0x395A ^ 0x3844] = 0x7FE4 ^ 0x3844;
        ModuleColorSaturation.h[0x6108 ^ 0x61D0] = 0xB1D0 ^ 0x61D0;
        ModuleColorSaturation.h[0xEA3A ^ 0xEA4F] = 0xFFFF15F9 ^ 0xEA4F;
        ModuleColorSaturation.h[0x4EEE ^ 0x4F67] = 0x14FA0 ^ 0x4F67;
        ModuleColorSaturation.h[0xCE8E ^ 0xCE04] = 0xFFFF31DD ^ 0xCE04;
        ModuleColorSaturation.h[0x5E57 ^ 0x5EFC] = 0x5E91 ^ 0x5EFC;
        ModuleColorSaturation.h[0x8DBA ^ 0x8C9F] = 0x2058 ^ 0x8C9F;
        ModuleColorSaturation.h[0x12EA ^ 0x120C] = 0x11449 ^ 0x120C;
        ModuleColorSaturation.h[0x10E2A ^ 0x10EB6] = 0xFFFEF16B ^ 0x10EB6;
        ModuleColorSaturation.h[0x6A83 ^ 0x6BDF] = 0xFFFF55EF ^ 0x6BDF;
        ModuleColorSaturation.h[0x720E ^ 0x720B] = 0xFFFF8DA8 ^ 0x720B;
        ModuleColorSaturation.h[0xE0F ^ 0xEAB] = 0xFFFFF117 ^ 0xEAB;
        ModuleColorSaturation.h[0xD990 ^ 0xD8E3] = 0xF755 ^ 0xD8E3;
        ModuleColorSaturation.h[0xA0D2 ^ 0xA0C5] = 0xFFFF5F41 ^ 0xA0C5;
        ModuleColorSaturation.h[0xF402 ^ 0xF52C] = 0xABCC ^ 0xF52C;
        ModuleColorSaturation.h[0x6639 ^ 0x674C] = 0x48FA ^ 0x674C;
        ModuleColorSaturation.h[0x2DB4 ^ 0x2D98] = 0x2DEC ^ 0x2D98;
        ModuleColorSaturation.h[0x912F ^ 0x901A] = 0x9A0E ^ 0x901A;
        ModuleColorSaturation.h[0x10507 ^ 0x10471] = 0x18861 ^ 0x10471;
        ModuleColorSaturation.h[0xF406 ^ 0xF47A] = 0xF416 ^ 0xF47A;
        ModuleColorSaturation.h[0xAF75 ^ 0xAEFD] = 0x1AE25 ^ 0xAEFD;
        ModuleColorSaturation.h[0x6CC3 ^ 0x6CDC] = 0x6C98 ^ 0x6CDC;
        ModuleColorSaturation.h[0xF7C2 ^ 0xF7F2] = 0xF793 ^ 0xF7F2;
        ModuleColorSaturation.h[0x7492 ^ 0x74AA] = 0x7490 ^ 0x74AA;
        ModuleColorSaturation.h[0x733B ^ 0x720C] = 0x54AC ^ 0x720C;
        ModuleColorSaturation.h[0xD3F9 ^ 0xD30F] = 0xD2E6 ^ 0xD30F;
        ModuleColorSaturation.h[0xB55A ^ 0xB593] = 0xB593 ^ 0xB593;
        ModuleColorSaturation.h[0x2DA4 ^ 0x2DB6] = 0xFFFFD201 ^ 0x2DB6;
        ModuleColorSaturation.h[0x299D ^ 0x293E] = 0x291B ^ 0x293E;
        ModuleColorSaturation.h[0x6568 ^ 0x6468] = 0x5CB1 ^ 0x6468;
        ModuleColorSaturation.h[0x88AC ^ 0x89C4] = 0xFFFFBF29 ^ 0x89C4;
        ModuleColorSaturation.h[0x401F ^ 0x400A] = 0xFFFFBF28 ^ 0x400A;
        ModuleColorSaturation.h[0xB200 ^ 0xB2D9] = 0x628C ^ 0xB2D9;
        ModuleColorSaturation.h[0xFF7C ^ 0xFE6E] = 0x3858 ^ 0xFE6E;
        ModuleColorSaturation.h[0x6AB ^ 0x7A2] = 0xFFFF45EC ^ 0x7A2;
        ModuleColorSaturation.h[0x419 ^ 0x45F] = 0x43C ^ 0x45F;
        ModuleColorSaturation.h[0x4F55 ^ 0x4E1A] = 0x67EB ^ 0x4E1A;
        ModuleColorSaturation.h[0x6B1C ^ 0x6B4F] = 0x6B3A ^ 0x6B4F;
        ModuleColorSaturation.h[0xD492 ^ 0xD4B4] = 0xFFFF2B5E ^ 0xD4B4;
        ModuleColorSaturation.h[0xC4D2 ^ 0xC585] = 0xC65E ^ 0xC585;
        ModuleColorSaturation.h[0x1B14 ^ 0x1A74] = 0x48EA ^ 0x1A74;
        ModuleColorSaturation.h[0xB191 ^ 0xB015] = 0x38B ^ 0xB015;
        ModuleColorSaturation.h[0x426F ^ 0x4217] = 0xFFFFBDBA ^ 0x4217;
        ModuleColorSaturation.h[0xDD69 ^ 0xDDE6] = 0xDDF1 ^ 0xDDE6;
        ModuleColorSaturation.h[0x10C79 ^ 0x10DF4] = 0x13B11 ^ 0x10DF4;
        ModuleColorSaturation.h[0xD6B9 ^ 0xD7F4] = 0x7E09 ^ 0xD7F4;
        ModuleColorSaturation.h[0x1B2E ^ 0x1BFF] = 0xFFFF2994 ^ 0x1BFF;
        ModuleColorSaturation.h[0x8D76 ^ 0x8CF3] = 0x3F42 ^ 0x8CF3;
        ModuleColorSaturation.h[0xC5E9 ^ 0xC4E5] = 0x3F69 ^ 0xC4E5;
        ModuleColorSaturation.h[0xE52D ^ 0xE4AC] = 0xB905 ^ 0xE4AC;
        ModuleColorSaturation.h[0x6383 ^ 0x62FE] = 0x16486 ^ 0x62FE;
        ModuleColorSaturation.h[0x6121 ^ 0x6125] = 0xFFFF9E81 ^ 0x6125;
        ModuleColorSaturation.h[0xCA64 ^ 0xCB5A] = 0x1E6B ^ 0xCB5A;
        ModuleColorSaturation.h[0x9554 ^ 0x95B4] = 0x5004 ^ 0x95B4;
        ModuleColorSaturation.h[0x453B ^ 0x45FC] = 0x45FD ^ 0x45FC;
        ModuleColorSaturation.h[0xA310 ^ 0xA3B1] = 0xA381 ^ 0xA3B1;
        ModuleColorSaturation.h[0xED4B ^ 0xED31] = 0xFFFF12F6 ^ 0xED31;
        ModuleColorSaturation.h[0x1D1D ^ 0x1DA0] = 0x1DA8 ^ 0x1DA0;
        ModuleColorSaturation.h[0xBFA ^ 0xB01] = 0xFC21 ^ 0xB01;
        ModuleColorSaturation.h[0x3597 ^ 0x348F] = 0x9197 ^ 0x348F;
        ModuleColorSaturation.h[0x390E ^ 0x39CE] = 0xFFFFC62A ^ 0x39CE;
        ModuleColorSaturation.h[0x10A51 ^ 0x10B7E] = 0x1559D ^ 0x10B7E;
        ModuleColorSaturation.h[0x10CB4 ^ 0x10DC0] = 0xFFFEDDED ^ 0x10DC0;
        ModuleColorSaturation.h[0xA473 ^ 0xA545] = 0x83E8 ^ 0xA545;
        ModuleColorSaturation.h[0x43DF ^ 0x43B6] = 0x679F ^ 0x43B6;
        ModuleColorSaturation.h[0xCE0B ^ 0xCED7] = 0x5EDE ^ 0xCED7;
        ModuleColorSaturation.h[0x99A8 ^ 0x9983] = 0xFFFF664E ^ 0x9983;
        ModuleColorSaturation.h[0xD10C ^ 0xD004] = 0x6DD3 ^ 0xD004;
        ModuleColorSaturation.h[0xF17F ^ 0xF188] = 0x7D10 ^ 0xF188;
        ModuleColorSaturation.h[0x108E2 ^ 0x10851] = 0x10807 ^ 0x10851;
        ModuleColorSaturation.h[0xD3B1 ^ 0xD2C6] = 0x5ECE ^ 0xD2C6;
        ModuleColorSaturation.h[0x7CC9 ^ 0x7D97] = 0x2F6E ^ 0x7D97;
        ModuleColorSaturation.h[0x6EC3 ^ 0x6E4B] = 0x6E4C ^ 0x6E4B;
        ModuleColorSaturation.h[0xBD65 ^ 0xBC1E] = 0x1BA66 ^ 0xBC1E;
        ModuleColorSaturation.h[0x5A9 ^ 0x5FE] = 0xFFFFFA15 ^ 0x5FE;
        ModuleColorSaturation.h[0xFBCE ^ 0xFB4B] = 0xFFFF04A8 ^ 0xFB4B;
        ModuleColorSaturation.h[0x92A5 ^ 0x921E] = 0x9234 ^ 0x921E;
        ModuleColorSaturation.h[0x2CA6 ^ 0x2D8F] = 0x18A ^ 0x2D8F;
        ModuleColorSaturation.h[0xC2C5 ^ 0xC21B] = 0x5212 ^ 0xC21B;
        ModuleColorSaturation.h[0x8E82 ^ 0x8E82] = 0x8EE6 ^ 0x8E82;
        ModuleColorSaturation.h[0xBF1C ^ 0xBFA6] = 0xFFFF4074 ^ 0xBFA6;
        ModuleColorSaturation.h[0x4274 ^ 0x4275] = 0x421F ^ 0x4275;
        ModuleColorSaturation.h[0x7E86 ^ 0x7EED] = 0xD8B1 ^ 0x7EED;
        ModuleColorSaturation.h[0x9AC2 ^ 0x9B99] = 0x5A76 ^ 0x9B99;
        ModuleColorSaturation.h[0x663E ^ 0x6613] = 0x6645 ^ 0x6613;
        ModuleColorSaturation.h[0x6794 ^ 0x67C6] = 0x6782 ^ 0x67C6;
        ModuleColorSaturation.h[0xF161 ^ 0xF1BB] = 0x21BB ^ 0xF1BB;
        ModuleColorSaturation.h[0x2023 ^ 0x20BE] = 0x20BC ^ 0x20BE;
        ModuleColorSaturation.h[0x6B7C ^ 0x6B0B] = 0xFFFF9485 ^ 0x6B0B;
        ModuleColorSaturation.h[0x695 ^ 0x7D3] = 0x69ED ^ 0x7D3;
        ModuleColorSaturation.h[0x99B2 ^ 0x9986] = 0x9984 ^ 0x9986;
        ModuleColorSaturation.h[0x5F18 ^ 0x5F32] = 0x5F75 ^ 0x5F32;
        ModuleColorSaturation.h[0x10C8 ^ 0x1195] = 0xD07A ^ 0x1195;
        ModuleColorSaturation.h[0x2E11 ^ 0x2E85] = 0x2EC6 ^ 0x2E85;
        ModuleColorSaturation.h[0xC23D ^ 0xC369] = 0x577D ^ 0xC369;
        ModuleColorSaturation.h[0x8147 ^ 0x802C] = 0x1C7C ^ 0x802C;
        ModuleColorSaturation.h[0xC38C ^ 0xC34E] = 0xFFFF3CD0 ^ 0xC34E;
        ModuleColorSaturation.h[0xE1F ^ 0xE66] = 0xEE3 ^ 0xE66;
        ModuleColorSaturation.h[0x453 ^ 0x545] = 0xA006 ^ 0x545;
        ModuleColorSaturation.h[0xC389 ^ 0xC377] = 0x3454 ^ 0xC377;
        ModuleColorSaturation.h[0xDA6A ^ 0xDA1B] = 0xFFFF25E6 ^ 0xDA1B;
        ModuleColorSaturation.h[0x3AF4 ^ 0x3BBA] = 0x125B ^ 0x3BBA;
        ModuleColorSaturation.h[0xFEE ^ 0xF90] = 0xFDF ^ 0xF90;
        ModuleColorSaturation.h[0xAC1C ^ 0xACA9] = 0xAC03 ^ 0xACA9;
        ModuleColorSaturation.h[0x5FCB ^ 0x5EFF] = 0x5499 ^ 0x5EFF;
        ModuleColorSaturation.h[0x66FC ^ 0x67FB] = 0xDA2E ^ 0x67FB;
        ModuleColorSaturation.h[0x383E ^ 0x395D] = 0x19A6 ^ 0x395D;
        ModuleColorSaturation.h[0xCE7E ^ 0xCE5B] = 0xCE0F ^ 0xCE5B;
        ModuleColorSaturation.h[0x55AB ^ 0x550E] = 0xFFFFAACF ^ 0x550E;
        ModuleColorSaturation.h[0x499F ^ 0x4986] = 0xFFFFB662 ^ 0x4986;
        ModuleColorSaturation.h[0x701D ^ 0x70C0] = 0xE0CE ^ 0x70C0;
        ModuleColorSaturation.h[0x1154 ^ 0x11EC] = 0xFFFFEE91 ^ 0x11EC;
        ModuleColorSaturation.h[0x97F8 ^ 0x9783] = 0x97AF ^ 0x9783;
        ModuleColorSaturation.h[0xC9B6 ^ 0xC8CC] = 0x1CEBB ^ 0xC8CC;
        ModuleColorSaturation.h[0xD8C8 ^ 0xD8F7] = 0xD889 ^ 0xD8F7;
        ModuleColorSaturation.h[0x3649 ^ 0x3723] = 0xAB7D ^ 0x3723;
        ModuleColorSaturation.h[0x1EF2 ^ 0x1E34] = 0xFFFFE1F8 ^ 0x1E34;
        ModuleColorSaturation.h[0x2724 ^ 0x274B] = 0xFFFFD8A9 ^ 0x274B;
        ModuleColorSaturation.h[0xB921 ^ 0xB80C] = 0xCB0 ^ 0xB80C;
        ModuleColorSaturation.h[0xB95B ^ 0xB9BA] = 0xFFFF83C1 ^ 0xB9BA;
        ModuleColorSaturation.h[0xEE29 ^ 0xEF36] = 0xA896 ^ 0xEF36;
        ModuleColorSaturation.h[0x97D8 ^ 0x972D] = 0xFFFF6910 ^ 0x972D;
        ModuleColorSaturation.h[0x4FD0 ^ 0x4F8F] = 0x4F8F ^ 0x4F8F;
        ModuleColorSaturation.h[0x8B18 ^ 0x8B74] = 0x8B74 ^ 0x8B74;
        ModuleColorSaturation.h[0xD856 ^ 0xD81C] = 0xFFFF279B ^ 0xD81C;
        ModuleColorSaturation.h[0xEAF9 ^ 0xEA3C] = 0xFFFF15F3 ^ 0xEA3C;
        ModuleColorSaturation.h[0x10377 ^ 0x10340] = 0xFFFEFC8A ^ 0x10340;
        ModuleColorSaturation.h[0x8BAB ^ 0x8BCB] = 0x8BCB ^ 0x8BCB;
    }
}

