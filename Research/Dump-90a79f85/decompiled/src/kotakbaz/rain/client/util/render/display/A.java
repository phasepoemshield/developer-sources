/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.GpuTexture
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  net.minecraft.class_10868
 *  net.minecraft.class_11391
 *  net.minecraft.class_276
 *  org.joml.Vector2f
 */
package kotakbaz.rain.client.util.render.display;

import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.extensions.b_0;
import kotakbaz.rain.client.render.main.ChromaRenderer;
import kotakbaz.rain.client.render.main.buffer.framebuffer.a;
import kotakbaz.rain.client.render.main.e_0;
import kotakbaz.rain.client.render.main.vertex.format.a_0;
import kotakbaz.rain.client.render.main.vertex.mesh.B;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.minecraft.class_10868;
import net.minecraft.class_11391;
import net.minecraft.class_276;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector2f;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\bH\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000f\u00a2\u0006\u0004\b\u001b\u0010\u0003J7\u0010$\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b&\u0010\u0003J\r\u0010'\u001a\u00020\u001e\u00a2\u0006\u0004\b'\u0010(J\r\u0010*\u001a\u00020)\u00a2\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0012\u00a2\u0006\u0004\b,\u0010\u0014R\u0018\u0010-\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b/\u0010.R$\u00102\u001a\u0012\u0012\u0004\u0012\u00020 00j\b\u0012\u0004\u0012\u00020 `18\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u00168\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b9\u0010:\u00a8\u0006;"}, d2={"Lkotakbaz/rain/client/util/render/display/KawaseRenderer;", "Lkotakbaz/rain/client/util/render/engine/Renderable;", "<init>", "()V", "", "name", "()Ljava/lang/String;", "shader", "Lkotakbaz/rain/client/render/main/vertex/DrawMode;", "kotlin.jvm.PlatformType", "drawMode", "()Lkotakbaz/rain/client/render/main/vertex/DrawMode;", "Lkotakbaz/rain/client/render/main/vertex/format/VertexFormat;", "vertexFormat", "()Lkotakbaz/rain/client/render/main/vertex/format/VertexFormat;", "", "load", "createPrograms", "", "hasValidWindowSize", "()Z", "checkResize", "", "width", "height", "createFramebuffers", "(II)V", "applyBlur", "Lkotakbaz/rain/client/render/main/program/GlProgram;", "program", "Lnet/minecraft/class_276;", "source", "Lkotakbaz/rain/client/render/main/buffer/framebuffer/CustomFramebuffer;", "destination", "pass", "maxPass", "applyBlurPass", "(Lkotakbaz/rain/client/render/main/program/GlProgram;Lnet/minecraft/class_276;Lkotakbaz/rain/client/render/main/buffer/framebuffer/CustomFramebuffer;II)V", "drawFullscreenQuad", "framebuffer", "()Lnet/minecraft/class_276;", "Lnet/minecraft/class_11391;", "texture", "()Lnet/minecraft/class_11391;", "hasFramebuffer", "downscaleProgram", "Lkotakbaz/rain/client/render/main/program/GlProgram;", "upscaleProgram", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "fbos", "Ljava/util/ArrayList;", "blurPasses", "I", "", "offset", "F", "initialized", "Z", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nKawaseRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KawaseRenderer.kt\nkotakbaz/rain/client/util/render/display/KawaseRenderer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,152:1\n1915#2,2:153\n*S KotlinDebug\n*F\n+ 1 KawaseRenderer.kt\nkotakbaz/rain/client/util/render/display/KawaseRenderer\n*L\n76#1:153,2\n*E\n"})
public final class A
extends kotakbaz.rain.client.util.render.engine.a_0 {
    @Nullable
    private kotakbaz.rain.client.render.main.program.A a;
    @Nullable
    private kotakbaz.rain.client.render.main.program.A A;
    @NotNull
    private final ArrayList<a> b = new ArrayList();
    private final int B;
    private final float c;
    private boolean C;
    private static Object[] d;
    private static Object e;
    private static Object[] E;
    private static Object[] D;
    private static Object[] f;
    public static int[] F;

    public A() {
        super();
        int n = F[0];
        n ^= F[1];
        this.B = n -= F[2];
        this.c = 25.0f;
    }

    @Override
    @NotNull
    public String name() {
        int n = F[3];
        n ^= F[4];
        return (String)d[n ^= F[5]];
    }

    @Override
    @NotNull
    public String shader() {
        int n = F[6];
        n -= F[7];
        return (String)d[n -= F[8]];
    }

    @Override
    public kotakbaz.rain.client.render.main.vertex.A drawMode() {
        return kotakbaz.rain.client.render.main.vertex.A.E;
    }

    @Override
    @NotNull
    public a_0 vertexFormat() {
        a_0 a_02 = e_0.a;
        int n = F[9];
        n -= F[10];
        Intrinsics.checkNotNullExpressionValue(a_02, (String)d[n += F[11]]);
        return a_02;
    }

    @Override
    public void load() {
        if (this.C) {
            return;
        }
        this.createPrograms();
        if (this.hasValidWindowSize()) {
            this.createFramebuffers(b_0.getMc().method_22683().method_4480(), b_0.getMc().method_22683().method_4507());
        }
        int n = F[12];
        n += F[13];
        this.C = n ^= F[14];
    }

    private final void createPrograms() {
        int n = F[15];
        n -= F[16];
        String string = (String)d[n += F[17]];
        int n2 = F[18];
        n2 ^= F[19];
        String string2 = (String)d[n2 += F[20]];
        String string3 = this.name();
        String string4 = this.shader();
        String string5 = string4 + string3;
        String string6 = string;
        String string7 = this.shader();
        int n3 = F[21];
        n3 -= F[22];
        int n4 = F[24];
        n4 += F[25];
        int n5 = F[27];
        n5 ^= F[28];
        this.a = this.createShaderBuilder(string, string7 + string6, string5).uniform((String)d[n3 -= F[23]], kotakbaz.rain.client.render.main.program.uniform.a_0.d).uniform((String)d[n4 ^= F[26]], kotakbaz.rain.client.render.main.program.uniform.a_0.B).sampler((String)d[n5 += F[29]]).build();
        String string8 = string2;
        String string9 = this.shader();
        int n6 = F[30];
        n6 -= F[31];
        int n7 = F[33];
        n7 ^= F[34];
        int n8 = F[36];
        n8 -= F[37];
        this.A = this.createShaderBuilder(string2, string9 + string8, string5).uniform((String)d[n6 += F[32]], kotakbaz.rain.client.render.main.program.uniform.a_0.d).uniform((String)d[n7 ^= F[35]], kotakbaz.rain.client.render.main.program.uniform.a_0.B).sampler((String)d[n8 ^= F[38]]).build();
        this.setGlProgram(this.a);
    }

    private final boolean hasValidWindowSize() {
        int n;
        if (b_0.getMc().method_22683().method_4480() > 0 && b_0.getMc().method_22683().method_4507() > 0) {
            int n2 = F[39];
            n2 += F[40];
            n = n2 ^= F[41];
        } else {
            int n3 = F[42];
            n3 += F[43];
            n = n3 -= F[44];
        }
        return n != 0;
    }

    private final boolean checkResize() {
        boolean bl;
        block8: {
            long l;
            long l2;
            block7: {
                long l3 = -8175005339133353461L;
                long l4 = 4670609882414843725L;
                l2 = 4067139347412307367L;
                l = -9052257697395075762L;
                if (!this.hasValidWindowSize()) {
                    boolean bl2 = F[45];
                    bl2 -= F[46];
                    return bl2 += F[47];
                }
                int n = F[48];
                n += F[49];
                long l5 = l;
                int n2 = F[51];
                n2 ^= F[52];
                long l6 = l = l5 ^ ((long)b_0.getMc().method_22683().method_4480() << (n -= F[50]) ^ l5) & -1L << (n2 -= F[53]);
                int n3 = F[54];
                n3 -= F[55];
                l = l6 ^ ((long)b_0.getMc().method_22683().method_4507() ^ l6) & -1L >>> (n3 += F[56]);
                if (this.b.isEmpty()) break block7;
                int n4 = F[57];
                n4 += F[58];
                if (((a)((Object)CollectionsKt.first((List)this.b))).field_1482 == (int)(l >>> (n4 += F[59])) && ((a)((Object)CollectionsKt.first((List)this.b))).field_1481 == (int)l) break block8;
            }
            Iterable iterable = this.b;
            long l7 = l2;
            int n = F[60];
            n += F[61];
            l2 = l7 ^ (0L ^ l7) & -1L << (n -= F[62]);
            for (Object t2 : iterable) {
                a a2 = (a)((Object)t2);
                long l8 = l2;
                int n5 = F[63];
                n5 += F[64];
                l2 = l8 ^ (0L ^ l8) & -1L >>> (n5 -= F[65]);
                a2.method_1238();
            }
            this.b.clear();
            int n6 = F[66];
            n6 += F[67];
            this.createFramebuffers((int)(l >>> (n6 += F[68])), (int)l);
        }
        if (!((Collection)this.b).isEmpty()) {
            boolean bl3 = F[69];
            bl3 ^= F[70];
            bl = bl3 ^= F[71];
        } else {
            boolean bl4 = F[72];
            bl4 += F[73];
            bl = bl4 += F[74];
        }
        return bl;
    }

    private final void createFramebuffers(int n, int n2) {
        long l;
        long l2 = 6087113270253067649L;
        long l3 = 4584183911491759944L;
        long l4 = 329229400753522367L;
        long l5 = -6076207930386771221L;
        long l6 = l = -145187209933572255L;
        int n3 = F[75];
        n3 ^= F[76];
        l = l6 ^ (0L ^ l6) & -1L >>> (n3 ^= F[77]);
        int n4 = F[78];
        n4 += F[79];
        long l7 = l;
        int n5 = F[81];
        n5 -= F[82];
        l = l7 ^ ((long)this.B << (n4 -= F[80]) ^ l7) & -1L << (n5 -= F[83]);
        int n6 = F[84];
        n6 -= F[85];
        if ((int)l <= (int)(l >>> (n6 += F[86]))) {
            while (true) {
                int n7 = F[87];
                n7 ^= F[88];
                long l8 = l5;
                int n8 = F[90];
                n8 += F[91];
                l5 = l8 ^ ((long)((int)l) << (n7 ^= F[89]) ^ l8) & -1L << (n8 ^= F[92]);
                int n9 = F[93];
                n9 -= F[94];
                int n10 = F[96];
                n10 ^= F[97];
                boolean bl = F[99];
                bl ^= F[100];
                this.b.add(new a((String)d[n9 += F[95]] + (int)(l5 >>> (n10 += F[98])), n, n2, bl += F[101]));
                int n11 = F[102];
                n11 += F[103];
                if ((int)l == (int)(l >>> (n11 -= F[104]))) break;
                long l9 = l;
                int n12 = F[105];
                n12 ^= F[106];
                int n13 = F[108];
                n13 -= F[109];
                l = l9 ^ (l9 ^ l9 + (long)(n12 ^= F[107])) & -1L >>> (n13 += F[110]);
            }
        }
    }

    public final void applyBlur() {
        long l = -7668668434843262892L;
        long l2 = -5479239130809417545L;
        long l3 = 8310004263584631713L;
        long l4 = 3924304882563495188L;
        long l5 = -6875529335838223416L;
        long l6 = 2280804574597590208L;
        long l7 = 7036474570956526244L;
        long l8 = 7376192128362522162L;
        long l9 = -2792866185481422256L;
        if (!this.checkResize()) {
            return;
        }
        int n = F[111];
        n += F[112];
        n += F[113];
        int n2 = F[114];
        n2 -= F[115];
        n2 ^= F[116];
        int n3 = F[117];
        n3 += F[118];
        long l10 = l8;
        int n4 = F[120];
        n4 ^= F[121];
        l8 = l10 ^ ((long)Math.max(this.b.size() - n, n2) << (n3 += F[119]) ^ l10) & -1L << (n4 ^= F[122]);
        kotakbaz.rain.client.render.main.program.A a2 = this.a;
        if (a2 == null) {
            return;
        }
        class_276 class_2762 = b_0.getMc().method_1522();
        int n5 = F[123];
        n5 -= F[124];
        int n6 = F[126];
        n6 += F[127];
        Intrinsics.checkNotNullExpressionValue(class_2762, (String)d[n5 += F[125]] + (String)d[n6 -= F[128]]);
        int n7 = F[129];
        n7 -= F[130];
        int n8 = F[132];
        n8 -= F[133];
        this.applyBlurPass(a2, class_2762, (a)((Object)CollectionsKt.first((List)this.b)), n7 += F[131], (int)(l8 >>> (n8 += F[134])));
        long l11 = l9;
        int n9 = F[135];
        n9 -= F[136];
        l9 = l11 ^ (0L ^ l11) & -1L << (n9 -= F[137]);
        while (true) {
            int n10 = F[138];
            n10 += F[139];
            int n11 = F[141];
            n11 ^= F[142];
            if ((int)(l9 >>> (n10 -= F[140])) >= (int)(l8 >>> (n11 += F[143]))) break;
            kotakbaz.rain.client.render.main.program.A a3 = this.a;
            if (a3 == null) {
                return;
            }
            int n12 = F[144];
            n12 += F[145];
            a a4 = this.b.get((int)(l9 >>> (n12 ^= F[146])));
            int n13 = F[147];
            n13 -= F[148];
            Intrinsics.checkNotNullExpressionValue((Object)a4, (String)d[n13 ^= F[149]]);
            class_276 class_2763 = a4;
            int n14 = F[150];
            n14 += F[151];
            int n15 = F[153];
            n15 += F[154];
            a a5 = this.b.get((int)(l9 >>> (n14 ^= F[152])) + (n15 -= F[155]));
            int n16 = F[156];
            n16 -= F[157];
            Intrinsics.checkNotNullExpressionValue((Object)a5, (String)d[n16 += F[158]]);
            int n17 = F[159];
            n17 ^= F[160];
            int n18 = F[162];
            n18 ^= F[163];
            int n19 = F[165];
            n19 += F[166];
            this.applyBlurPass(a3, class_2763, a5, (int)(l9 >>> (n17 ^= F[161])) + (n18 += F[164]), (int)(l8 >>> (n19 ^= F[167])));
            l9 += 0x100000000L;
        }
        int n20 = F[168];
        n20 ^= F[169];
        n20 ^= F[170];
        int n21 = F[171];
        n21 -= F[172];
        long l12 = l9;
        int n22 = F[174];
        n22 += F[175];
        l9 = l12 ^ ((long)((int)(l8 >>> n20)) << (n21 ^= F[173]) ^ l12) & -1L << (n22 += F[176]);
        while (true) {
            int n23 = F[177];
            n23 ^= F[178];
            int n24 = F[180];
            n24 += F[181];
            if ((n23 ^= F[179]) >= (int)(l9 >>> (n24 += F[182]))) break;
            kotakbaz.rain.client.render.main.program.A a6 = this.A;
            if (a6 == null) {
                return;
            }
            int n25 = F[183];
            n25 -= F[184];
            a a7 = this.b.get((int)(l9 >>> (n25 -= F[185])));
            int n26 = F[186];
            n26 ^= F[187];
            Intrinsics.checkNotNullExpressionValue((Object)a7, (String)d[n26 -= F[188]]);
            class_276 class_2764 = a7;
            int n27 = F[189];
            n27 ^= F[190];
            int n28 = F[192];
            n28 += F[193];
            a a8 = this.b.get((int)(l9 >>> (n27 ^= F[191])) - (n28 -= F[194]));
            int n29 = F[195];
            n29 -= F[196];
            Intrinsics.checkNotNullExpressionValue((Object)a8, (String)d[n29 += F[197]]);
            int n30 = F[198];
            n30 ^= F[199];
            int n31 = F[201];
            n31 ^= F[202];
            this.applyBlurPass(a6, class_2764, a8, (int)(l9 >>> (n30 -= F[200])), (int)(l8 >>> (n31 -= F[203])));
            l9 += -4294967296L;
        }
    }

    private final void applyBlurPass(kotakbaz.rain.client.render.main.program.A a2, class_276 class_2762, a a3, int n, int n2) {
        ChromaRenderer.disableBlend();
        a3.clearAllTextures();
        ChromaRenderer.bindFramebuffer(a3);
        this.setGlobalProgram(a2);
        this.initMatrix();
        float f2 = 1.0f / (float)class_2762.field_1482;
        float f3 = 1.0f / (float)class_2762.field_1481;
        int n3 = F[204];
        n3 += F[205];
        a2.getUniform((String)d[n3 ^= F[206]], kotakbaz.rain.client.render.main.program.uniform.a_0.d).set(new Vector2f(f2, f3));
        int n4 = F[207];
        n4 -= F[208];
        a2.getUniform((String)d[n4 += F[209]], kotakbaz.rain.client.render.main.program.uniform.a_0.B).set(Float.valueOf(this.c * 0.5f * ((float)n / (float)n2)));
        GpuTextureView gpuTextureView = class_2762.method_71639();
        if (gpuTextureView == null) {
            return;
        }
        GpuTextureView gpuTextureView2 = gpuTextureView;
        int n5 = F[210];
        n5 -= F[211];
        kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.A a4 = a2.getUniform((String)d[n5 += F[212]], kotakbaz.rain.client.render.main.program.uniform.a_0.h);
        if (gpuTextureView2 instanceof class_11391) {
            a4.set((class_11391)gpuTextureView2);
        } else {
            GpuTexture gpuTexture = gpuTextureView2.texture();
            int n6 = F[213];
            n6 += F[214];
            int n7 = F[216];
            n7 += F[217];
            Intrinsics.checkNotNull(gpuTexture, (String)d[n6 += F[215]] + (String)d[n7 += F[218]]);
            a4.set((class_10868)gpuTexture);
        }
        this.drawFullscreenQuad();
    }

    private final void drawFullscreenQuad() {
        float f2 = b_0.getMc().method_22683().method_4486();
        float f3 = b_0.getMc().method_22683().method_4502();
        B b2 = ChromaRenderer.createMesh(this.drawMode(), this.vertexFormat(), arg_0 -> A.drawFullscreenQuad$lambda$0(f3, f2, arg_0));
        int n = F[219];
        n ^= F[220];
        Intrinsics.checkNotNullExpressionValue(b2, (String)d[n -= F[221]]);
        kotakbaz.rain.client.render.main.vertex.mesh.b_0 b_02 = b2;
        ChromaRenderer.draw(b_02);
    }

    @NotNull
    public final class_276 framebuffer() {
        return (class_276)CollectionsKt.first((List)this.b);
    }

    @NotNull
    public final class_11391 texture() {
        GpuTextureView gpuTextureView = ((a)((Object)CollectionsKt.first((List)this.b))).method_71639();
        class_11391 class_113912 = gpuTextureView instanceof class_11391 ? (class_11391)gpuTextureView : null;
        if (class_113912 == null) {
            int n = F[222];
            n -= F[223];
            int n2 = F[225];
            n2 += F[226];
            throw new IllegalStateException(((String)d[n ^= F[224]] + (String)d[n2 += F[227]]).toString());
        }
        return class_113912;
    }

    public final boolean hasFramebuffer() {
        boolean bl;
        if (!((Collection)this.b).isEmpty()) {
            boolean bl2 = F[228];
            bl2 += F[229];
            bl = bl2 ^= F[230];
        } else {
            boolean bl3 = F[231];
            bl3 += F[232];
            bl = bl3 ^= F[233];
        }
        return bl;
    }

    private static final void drawFullscreenQuad$lambda$0(float f2, float f3, kotakbaz.rain.client.render.main.vertex.mesh.A a2) {
        a2.vertex(0.0f, 0.0f, 0.0f);
        a2.vertex(0.0f, f2, 0.0f);
        a2.vertex(f3, f2, 0.0f);
        a2.vertex(f3, 0.0f, 0.0f);
    }

    static {
        kotakbaz.rain.client.util.render.display.A.b();
        long l = -8482539647165762178L;
        long l2 = -6361383506508639304L;
        long l3 = 4039189409694627596L;
        long l4 = 2254339054356091500L;
        long l5 = 7227535783334394250L;
        long l6 = -9199459007981923913L;
        long l7 = -6582877232215715037L;
        long l8 = 6196086825413594864L;
        long l9 = -5619150240647391760L;
        long l10 = -346655591214598897L;
        long l11 = -613131567412471890L;
        long l12 = 6804577467152551298L;
        long l13 = -7414289865281781583L;
        long l14 = -275266225783592383L;
        int n = F[234];
        n -= F[235];
        d = new Object[n ^= F[236]];
        long l15 = l14;
        int n2 = F[237];
        n2 ^= F[238];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 -= F[239]);
        Object[] objectArray = new Object[F[240]];
        objectArray[kotakbaz.rain.client.util.render.display.A.F[241]] = D;
        objectArray[kotakbaz.rain.client.util.render.display.A.F[242]] = F[243];
        int n3 = F[244];
        Object object = kotakbaz.rain.client.util.render.display.A.A()[F[245]];
        if (object == null) {
            char[] cArray = "\uc073\uc07f\uc0b9\uc093\uc097\uc086\uc087\uc075\uc066\uc0a1\uc07b\uc083\uc09e\uc087\uc0a1\uc07a\uc066\uc0b2\uc083\uc09e\uc063\uc080\uc088\uc08f\uc085\uc099\uc097\uc0a1\uc067\uc088\uc064\uc07a\uc09f\uc097\uc06f\uc066\uc0a1\uc07b\uc079\uc09a\uc0b3\uc0b0\uc0a0\uc09a\uc086\uc077\uc083\uc07d\uc08f\uc0b0\uc088\uc09b\uc083\uc066\uc099\uc0b3\uc084\uc09d\uc0b4\uc075\uc061\uc0b4\uc079\uc073\uc0b4\uc084\uc061\uc0b4\uc079\uc063\uc096\uc087\uc0a1\uc062\uc062\uc0bf\uc09d\uc0b0\uc080\uc060\uc08f\uc074\uc0b3\uc085\uc083\uc069\uc06f\uc073\uc09d\uc075\uc096\uc092\uc094\uc074\uc09b\uc0b9\uc0b5\uc086\uc085\uc0a0\uc0bf\uc080\uc089\uc07f\uc099\uc096\uc075\uc060\uc09c\uc097\uc064\uc089\uc09d\uc093\uc082\uc095\uc0b0\uc0b6\uc077\uc0a0\uc096\uc093\uc0a8\uc0a2\uc085\uc093\uc07f\uc09b\uc0bf\uc063\uc0b6\uc095\uc080\uc069\uc0b9\uc0a2\uc088\uc07c\uc073\uc069\uc0b6\uc077\uc063\uc061\uc0bc\uc0a0\uc0b3\uc088\uc097\uc07e\uc095\uc0bf\uc081\uc080\uc0b4\uc089\uc095\uc074\uc0b2\uc067\uc076\uc09a\uc09a\uc09c\uc07a\uc06a\uc089\uc079\uc08a\uc0a8\uc0b2\uc075\uc092\uc0b9\uc077\uc080\uc0b2\uc0a1\uc07f\uc080\uc096\uc0ba\uc06f\uc08a\uc097\uc07b\uc094\uc099\uc060\uc063\uc07b\uc077\uc064\uc099\uc0bc\uc067\uc0bf\uc075\uc06f\uc081\uc0b5\uc0b9\uc09f\uc07c\uc066\uc0a1\uc096\uc0a0\uc0ba\uc062\uc084\uc07b\uc099\uc064\uc064\uc087\uc07d\uc065\uc09b\uc092\uc0b0\uc093\uc0b3\uc07d\uc064\uc09d\uc0a2\uc09d\uc086\uc063\uc099\uc095\uc08f\uc0a1\uc077\uc06f\uc08a\uc080\uc090\uc093\uc076\uc087\uc087\uc0ba\uc092\uc094\uc08a\uc087\uc075\uc07d\uc094\uc066\uc084\uc063\uc06f\uc08a\uc094\uc07f\uc097\uc084\uc068\uc083\uc063\uc066\uc0b5\uc0b0\uc099\uc088\uc07e\uc099\uc069\uc064\uc065\uc097\uc09e\uc082\uc079\uc060\uc0b3\uc073\uc082\uc090\uc08a\uc0b2\uc085\uc07b\uc060\uc0a8\uc093\uc0bf\uc063\uc082\uc089\uc0b3\uc073\uc063\uc07c\uc065\uc09c\uc09e\uc074\uc0bc\uc09f\uc073\uc09b\uc0bc\uc060\uc081\uc09e\uc07c\uc07b\uc075\uc0b4\uc066\uc079\uc067\uc080\uc09b\uc064\uc0a1\uc065\uc08f\uc073\uc084\uc095\uc09d\uc096\uc09f\uc0b4\uc066\uc09a\uc065\uc09e\uc086\uc075\uc069\uc067\uc0a8\uc0b3\uc07f\uc0b4\uc099\uc0b4\uc081\uc068\uc073\uc09b\uc0a0\uc083\uc07f\uc0b4\uc082\uc0b4\uc07c\uc068\uc0b6\uc075\uc086\uc064\uc09f\uc0b5\uc060\uc061\uc09b\uc06a\uc08a\uc087\uc0b0\uc066\uc067\uc0ba\uc093\uc090\uc082\uc0ba\uc074\uc089\uc075\uc066\uc097\uc062\uc089\uc080\uc085\uc07f\uc08a\uc0bc\uc06f\uc06a\uc060\uc069\uc080\uc08f\uc073\uc07d\uc06a\uc07c\uc066\uc0a2\uc087\uc0bf\uc064\uc06f\uc0b0\uc094\uc081\uc0a2\uc09c\uc073\uc087\uc06a\uc062\uc09c\uc064\uc084\uc084\uc0bf\uc0a1\uc07c\uc095\uc0b0\uc076\uc097\uc07e\uc06a\uc06a\uc09f\uc082\uc075\uc062\uc085\uc062\uc088\uc09e\uc095\uc090\uc09b\uc080\uc060\uc07c\uc07a\uc084\uc077\uc080\uc07b\uc09b\uc09e\uc07c\uc0a1\uc08f\uc095\uc065\uc069\uc067\uc0b4\uc07c\uc086\uc088\uc068\uc088\uc07f\uc0b5\uc090\uc062\uc082\uc06a\uc095\uc099\uc0a8\uc0b9\uc0bf\uc0b0\uc081\uc061\uc069\uc068\uc075\uc07f\uc0a0\uc09c\uc0a0\uc09d\uc0b2\uc066\uc067\uc082\uc07f\uc092\uc099\uc077\uc0ba\uc09c\uc09a\uc09d\uc074\uc0b9\uc06f\uc085\uc06f\uc085\uc076\uc09d\uc09f\uc09b\uc0b9\uc06f\uc09c\uc07c\uc061\uc063\uc094\uc0ba\uc077\uc0b9\uc07e\uc061\uc074\uc089\uc082\uc082\uc064\uc065\uc08f\uc092\uc077\uc07f\uc08f\uc0b3\uc076\uc0ba\uc09a\uc07c\uc095\uc064\uc08e\uc08e".toCharArray();
            for (int i = F[246]; i < F[247]; ++i) {
                int n4 = cArray[i];
                n4 ^= F[248];
                n4 += F[249];
                n4 += F[250];
                n4 += F[251];
                n4 += F[252];
                n4 += F[253];
                n4 ^= F[254];
                n4 -= F[255];
                n4 -= F[256];
                n4 -= F[257];
                cArray[i] = (char)(n4 -= F[258]);
            }
            object = kotakbaz.rain.client.util.render.display.A.A()[kotakbaz.rain.client.util.render.display.A.F[259]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)kotakbaz.rain.client.util.render.display.A.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = F[260];
        n5 ^= F[261];
        l5 = l16 ^ (0x17100000000L ^ l16) & -1L << (n5 += F[262]);
        long l17 = l12;
        int n6 = F[263];
        n6 ^= F[264];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 ^= F[265]);
        while (true) {
            int n7 = F[266];
            n7 += F[267];
            if ((int)l12 >= (int)(l5 >>> (n7 += F[268]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = F[269];
            n9 ^= F[270];
            int n10 = F[272];
            n10 += F[273];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 -= F[271])) & -1L >>> (n10 -= F[274]);
            long l19 = l8;
            int n11 = F[275];
            n11 -= F[276];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 -= F[277]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = F[278];
            n13 -= F[279];
            int n14 = F[281];
            n14 -= F[282];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 ^= F[280])) & -1L >>> (n14 += F[283]);
            int n15 = F[284];
            n15 -= F[285];
            long l21 = l9;
            int n16 = F[287];
            n16 ^= F[288];
            l9 = l21 ^ ((long)cArray[n12] << (n15 += F[286]) ^ l21) & -1L << (n16 -= F[289]);
            int n17 = F[290];
            n17 += F[291];
            n17 ^= F[292];
            int n18 = F[293];
            n18 -= F[294];
            long l22 = l11;
            int n19 = F[296];
            n19 ^= F[297];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 += F[295]))) ^ l22) & -1L >>> (n19 -= F[298]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = F[299];
            n20 -= F[300];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 ^= F[301]);
            while (true) {
                int n21 = F[302];
                n21 ^= F[303];
                if ((int)(l13 >>> (n21 += F[304])) >= (int)l11) break;
                int n22 = F[305];
                n22 += F[306];
                int n23 = F[308];
                n23 ^= F[309];
                cArray2[(int)(l13 >>> (n22 -= kotakbaz.rain.client.util.render.display.A.F[307]))] = cArray[(int)l12 + (int)(l13 >>> (n23 -= F[310]))];
                l13 += 0x100000000L;
            }
            int n24 = F[311];
            n24 -= F[312];
            int n25 = (int)(l14 >>> (n24 -= F[313]));
            l14 += 0x100000000L;
            kotakbaz.rain.client.util.render.display.A.d[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = F[314];
            n26 -= F[315];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 += F[316]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[F[317]];
        String string = (String)object[F[318]];
        object = object[F[319]];
        Object[] objectArray = E;
        if (E == null) {
            objectArray = E = new Object[F[320]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[F[321]];
                D = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[F[323] ^ F[324]];
                byArray[kotakbaz.rain.client.util.render.display.A.F[325] ^ kotakbaz.rain.client.util.render.display.A.F[326]] = F[327] ^ F[328];
                byArray[kotakbaz.rain.client.util.render.display.A.F[329] ^ kotakbaz.rain.client.util.render.display.A.F[330]] = F[331] ^ F[332];
                byArray[kotakbaz.rain.client.util.render.display.A.F[333] ^ kotakbaz.rain.client.util.render.display.A.F[334]] = F[335] ^ F[336];
                byArray[kotakbaz.rain.client.util.render.display.A.F[337] ^ kotakbaz.rain.client.util.render.display.A.F[338]] = F[339] ^ F[340];
                byArray[kotakbaz.rain.client.util.render.display.A.F[341] ^ kotakbaz.rain.client.util.render.display.A.F[342]] = F[343] ^ F[344];
                byArray[kotakbaz.rain.client.util.render.display.A.F[345] ^ kotakbaz.rain.client.util.render.display.A.F[346]] = F[347] ^ F[348];
                byArray[kotakbaz.rain.client.util.render.display.A.F[349] ^ kotakbaz.rain.client.util.render.display.A.F[350]] = F[351] ^ F[352];
                byArray[kotakbaz.rain.client.util.render.display.A.F[353] ^ kotakbaz.rain.client.util.render.display.A.F[354]] = F[355] ^ F[356];
                byArray[kotakbaz.rain.client.util.render.display.A.F[357] ^ kotakbaz.rain.client.util.render.display.A.F[358]] = F[359] ^ F[360];
                byArray[kotakbaz.rain.client.util.render.display.A.F[361] ^ kotakbaz.rain.client.util.render.display.A.F[362]] = F[363] ^ F[364];
                byArray[kotakbaz.rain.client.util.render.display.A.F[365] ^ kotakbaz.rain.client.util.render.display.A.F[366]] = F[367] ^ F[368];
                byArray[kotakbaz.rain.client.util.render.display.A.F[369] ^ kotakbaz.rain.client.util.render.display.A.F[370]] = F[371] ^ F[372];
                byArray[kotakbaz.rain.client.util.render.display.A.F[373] ^ kotakbaz.rain.client.util.render.display.A.F[374]] = F[375] ^ F[376];
                byArray[kotakbaz.rain.client.util.render.display.A.F[377] ^ kotakbaz.rain.client.util.render.display.A.F[378]] = F[379] ^ F[380];
                byArray[kotakbaz.rain.client.util.render.display.A.F[381] ^ kotakbaz.rain.client.util.render.display.A.F[382]] = F[383] ^ F[384];
                byArray[kotakbaz.rain.client.util.render.display.A.F[385] ^ kotakbaz.rain.client.util.render.display.A.F[386]] = F[387] ^ F[388];
                objectArray2[kotakbaz.rain.client.util.render.display.A.F[322]] = byArray;
            }
            byte[] byArray = (byte[])object3[F[389]];
            if (e == null) {
                byte[] byArray2 = new byte[F[390] ^ F[391]];
                byArray2[kotakbaz.rain.client.util.render.display.A.F[392] ^ kotakbaz.rain.client.util.render.display.A.F[393]] = F[394] ^ F[395];
                byArray2[kotakbaz.rain.client.util.render.display.A.F[396] ^ kotakbaz.rain.client.util.render.display.A.F[397]] = F[398] ^ F[399];
                byArray2[0xC105 ^ 0xC11D] = 0xFFFF3EB9 ^ 0xC11D;
                byArray2[0x9759 ^ 0x9749] = 0x9744 ^ 0x9749;
                byArray2[0xD580 ^ 0xD59A] = 0xD5BC ^ 0xD59A;
                byArray2[0x61A4 ^ 0x61A5] = 0xFFFF9E5A ^ 0x61A5;
                byArray2[0xE071 ^ 0xE07E] = 0xE03A ^ 0xE07E;
                byArray2[0x10003 ^ 0x1001A] = 0x10008 ^ 0x1001A;
                byArray2[0x108C0 ^ 0x108C5] = 0x1089B ^ 0x108C5;
                byArray2[0x7C0E ^ 0x7C1C] = 0xFFFF83FB ^ 0x7C1C;
                byArray2[0x10B86 ^ 0x10B8E] = 0x10B8D ^ 0x10B8E;
                byArray2[0xE51F ^ 0xE502] = 0xE552 ^ 0xE502;
                byArray2[0xEA75 ^ 0xEA72] = 0xFFFF15F3 ^ 0xEA72;
                byArray2[0xFB7D ^ 0xFB77] = 0xFFFF04CB ^ 0xFB77;
                byArray2[0x1D5F ^ 0x1D4E] = 0xFFFFE2BC ^ 0x1D4E;
                byArray2[0xEC93 ^ 0xEC9E] = 0xFFFF131F ^ 0xEC9E;
                byArray2[0x273F ^ 0x2736] = 0x275D ^ 0x2736;
                byArray2[0xD10 ^ 0xD12] = 0xFFFFF29C ^ 0xD12;
                byArray2[0x6868 ^ 0x6876] = 0x684D ^ 0x6876;
                byArray2[0x1073D ^ 0x10722] = 0xFFFEF8C2 ^ 0x10722;
                byArray2[0xE24E ^ 0xE258] = 0xFFFF1DC0 ^ 0xE258;
                byArray2[0x5BFF ^ 0x5BF9] = 0xFFFFA40C ^ 0x5BF9;
                byArray2[0x538D ^ 0x5389] = 0xFFFFAC7C ^ 0x5389;
                byArray2[0x764 ^ 0x76A] = 0xFFFFF8B0 ^ 0x76A;
                byArray2[0x3527 ^ 0x353B] = 0xFFFFCAD6 ^ 0x353B;
                byArray2[0xD601 ^ 0xD602] = 0xFFFF29CF ^ 0xD602;
                byArray2[0x281 ^ 0x281] = 0x2FD ^ 0x281;
                byArray2[0x4D77 ^ 0x4D7B] = 0xFFFFB2BA ^ 0x4D7B;
                byArray2[0x55BD ^ 0x55AE] = 0x55E5 ^ 0x55AE;
                byArray2[0x5234 ^ 0x523F] = 0xFFFFADC7 ^ 0x523F;
                byArray2[0x470E ^ 0x471B] = 0xFFFFB8BB ^ 0x471B;
                byArray2[0xA652 ^ 0xA646] = 0xFFFF59B0 ^ 0xA646;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = kotakbaz.rain.client.util.render.display.A.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u3dbc\u3dd6\u3dc3\u3dc8\u3dd2\u4226\u3db7\u42e9\u3dd8\u42e4\u3dc4\u42e5\u42f1\u42eb\u3dbb\u3dc4\u3dd1\u4221".toCharArray();
                    for (int i = 0; i < 18; ++i) {
                        int n2 = cArray[i];
                        n2 += 61376;
                        n2 -= 52259;
                        n2 ^= 0x8FA4;
                        n2 ^= 0xE526;
                        n2 -= 57543;
                        n2 -= 49416;
                        n2 ^= 0x49EB;
                        n2 ^= 0x720C;
                        n2 ^= 0xA1A;
                        n2 -= 54683;
                        n2 += 58332;
                        n2 ^= 0x885D;
                        n2 ^= 0x4FFE;
                        cArray[i] = (char)(n2 += 21183);
                    }
                    object4 = kotakbaz.rain.client.util.render.display.A.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[5] = -21;
                byArray4[4] = 41;
                byArray4[9] = 102;
                byArray4[7] = -98;
                byArray4[6] = -21;
                byArray4[14] = 22;
                byArray4[0] = -54;
                byArray4[1] = -68;
                byArray4[8] = 72;
                byArray4[13] = -106;
                byArray4[10] = 43;
                byArray4[11] = -2;
                byArray4[2] = -104;
                byArray4[12] = -25;
                byArray4[15] = -110;
                byArray4[3] = -107;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 25, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = kotakbaz.rain.client.util.render.display.A.A()[2];
                if (object5 == null) {
                    char[] cArray = "\ud741\ud745\ud753".toCharArray();
                    for (int i = 0; i < 3; ++i) {
                        int n3 = cArray[i];
                        n3 -= 50401;
                        n3 -= 29426;
                        n3 -= 37778;
                        n3 -= 34962;
                        n3 += 59826;
                        n3 += 15141;
                        n3 ^= 0x4EC6;
                        n3 -= 40488;
                        n3 += 29610;
                        n3 -= 57050;
                        cArray[i] = (char)(n3 ^= 0xDDCE);
                    }
                    object5 = kotakbaz.rain.client.util.render.display.A.A()[2] = new String(cArray);
                }
                e = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = kotakbaz.rain.client.util.render.display.A.A()[3];
            if (object6 == null) {
                char[] cArray = "\u6921\u6925\u6937\u6993\u6927\u692a\u6927\u6993\u6934\u691f\u6927\u6937\u6995\u6934\u68c1\u68c8\u68c8\u68d9\u68d6\u68db".toCharArray();
                for (int i = 0; i < 20; ++i) {
                    int n4 = cArray[i];
                    n4 += 63536;
                    n4 += 63761;
                    n4 ^= 0x7D56;
                    n4 ^= 0xD898;
                    n4 -= 45512;
                    n4 += 51097;
                    n4 += 34634;
                    n4 ^= 0x535B;
                    n4 += 48188;
                    n4 -= 29532;
                    n4 -= 10910;
                    cArray[i] = (char)(n4 ^= 0xED9F);
                }
                object6 = kotakbaz.rain.client.util.render.display.A.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)e), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = f;
        if (f == null) {
            f = new Object[4];
            objectArray = f;
        }
        return objectArray;
    }

    public static void b() {
        F = new int[0xEFCE ^ 0xEE5E];
        kotakbaz.rain.client.util.render.display.A.F[0x9082 ^ 0x91EA] = 0x113 ^ 0x91EA;
        kotakbaz.rain.client.util.render.display.A.F[0x1278 ^ 0x1319] = 0xF252 ^ 0x1319;
        kotakbaz.rain.client.util.render.display.A.F[0x5DC1 ^ 0x5DE0] = 0xFFFFA241 ^ 0x5DE0;
        kotakbaz.rain.client.util.render.display.A.F[0x2276 ^ 0x2295] = 0xFFFFDD31 ^ 0x2295;
        kotakbaz.rain.client.util.render.display.A.F[0x779D ^ 0x7729] = 0x776D ^ 0x7729;
        kotakbaz.rain.client.util.render.display.A.F[0x9419 ^ 0x9515] = 0xFFFF6A80 ^ 0x9515;
        kotakbaz.rain.client.util.render.display.A.F[0xE394 ^ 0xE36F] = 0x63FE ^ 0xE36F;
        kotakbaz.rain.client.util.render.display.A.F[0xAFBE ^ 0xAFE2] = 0xFFFF5073 ^ 0xAFE2;
        kotakbaz.rain.client.util.render.display.A.F[0x32B7 ^ 0x3287] = 0xFFFFCD2B ^ 0x3287;
        kotakbaz.rain.client.util.render.display.A.F[0xEB18 ^ 0xEB46] = 0xFFFF14A0 ^ 0xEB46;
        kotakbaz.rain.client.util.render.display.A.F[0x101A5 ^ 0x10159] = 0x11CCD ^ 0x10159;
        kotakbaz.rain.client.util.render.display.A.F[0xEF29 ^ 0xEF47] = 0xFFFF10EF ^ 0xEF47;
        kotakbaz.rain.client.util.render.display.A.F[0x5549 ^ 0x554F] = 0x55D7 ^ 0x554F;
        kotakbaz.rain.client.util.render.display.A.F[0xFFCF ^ 0xFEA6] = 0x286E ^ 0xFEA6;
        kotakbaz.rain.client.util.render.display.A.F[0xCF99 ^ 0xCEB8] = 0xFFFF3128 ^ 0xCEB8;
        kotakbaz.rain.client.util.render.display.A.F[0x424B ^ 0x4342] = 0x437A ^ 0x4342;
        kotakbaz.rain.client.util.render.display.A.F[0xC8F7 ^ 0xC821] = 0xFFFF37CF ^ 0xC821;
        kotakbaz.rain.client.util.render.display.A.F[0xB052 ^ 0xB0B8] = 0xFFFF4FC2 ^ 0xB0B8;
        kotakbaz.rain.client.util.render.display.A.F[0xD2A2 ^ 0xD208] = 0xFFFF2DBB ^ 0xD208;
        kotakbaz.rain.client.util.render.display.A.F[0x3B20 ^ 0x3A47] = 0xFFFF5545 ^ 0x3A47;
        kotakbaz.rain.client.util.render.display.A.F[0xA458 ^ 0xA4FD] = 0xA4D3 ^ 0xA4FD;
        kotakbaz.rain.client.util.render.display.A.F[0x446E ^ 0x44D1] = 0x44ED ^ 0x44D1;
        kotakbaz.rain.client.util.render.display.A.F[0xCFC7 ^ 0xCF9E] = 0xFFFF304B ^ 0xCF9E;
        kotakbaz.rain.client.util.render.display.A.F[0x54DF ^ 0x55A1] = 0x64F8 ^ 0x55A1;
        kotakbaz.rain.client.util.render.display.A.F[0x9E3D ^ 0x9E8F] = 0xFFFF6120 ^ 0x9E8F;
        kotakbaz.rain.client.util.render.display.A.F[0x9CB9 ^ 0x9D3C] = 0x9D3C ^ 0x9D3C;
        kotakbaz.rain.client.util.render.display.A.F[0x4BE1 ^ 0x4AA6] = 0xF17 ^ 0x4AA6;
        kotakbaz.rain.client.util.render.display.A.F[0x10C7F ^ 0x10DF1] = 0xFFFE18B6 ^ 0x10DF1;
        kotakbaz.rain.client.util.render.display.A.F[0x883B ^ 0x8940] = 0x189A5 ^ 0x8940;
        kotakbaz.rain.client.util.render.display.A.F[0xD0BC ^ 0xD0C7] = 0xD0C4 ^ 0xD0C7;
        kotakbaz.rain.client.util.render.display.A.F[0x30E7 ^ 0x30A8] = 0xFFFFCF5B ^ 0x30A8;
        kotakbaz.rain.client.util.render.display.A.F[0xBFCA ^ 0xBEC2] = 0xBED3 ^ 0xBEC2;
        kotakbaz.rain.client.util.render.display.A.F[0x6547 ^ 0x65A9] = 0xFFFF9A22 ^ 0x65A9;
        kotakbaz.rain.client.util.render.display.A.F[0xE4FC ^ 0xE4D9] = 0xFFFF1B02 ^ 0xE4D9;
        kotakbaz.rain.client.util.render.display.A.F[0x52A3 ^ 0x52EF] = 0x528D ^ 0x52EF;
        kotakbaz.rain.client.util.render.display.A.F[0x7640 ^ 0x7639] = 0x762A ^ 0x7639;
        kotakbaz.rain.client.util.render.display.A.F[0x8B74 ^ 0x8A4E] = 0xFFFF75E9 ^ 0x8A4E;
        kotakbaz.rain.client.util.render.display.A.F[0x6CF4 ^ 0x6D79] = 0x87FD ^ 0x6D79;
        kotakbaz.rain.client.util.render.display.A.F[0x9341 ^ 0x922F] = 0xB07A ^ 0x922F;
        kotakbaz.rain.client.util.render.display.A.F[0xBD3E ^ 0xBC0C] = 0xFFFF43B2 ^ 0xBC0C;
        kotakbaz.rain.client.util.render.display.A.F[0xFE7D ^ 0xFE36] = 0xFE31 ^ 0xFE36;
        kotakbaz.rain.client.util.render.display.A.F[0x1EA3 ^ 0x1E68] = 0xFFFFE1F9 ^ 0x1E68;
        kotakbaz.rain.client.util.render.display.A.F[0x2D4E ^ 0x2C58] = 0x2C81 ^ 0x2C58;
        kotakbaz.rain.client.util.render.display.A.F[0xBCC6 ^ 0xBD98] = 0x1E1C ^ 0xBD98;
        kotakbaz.rain.client.util.render.display.A.F[0x73E8 ^ 0x73FF] = 0xFFFF8C3E ^ 0x73FF;
        kotakbaz.rain.client.util.render.display.A.F[0xF79E ^ 0xF71A] = 0xF703 ^ 0xF71A;
        kotakbaz.rain.client.util.render.display.A.F[0x721C ^ 0x72FC] = 0x72B6 ^ 0x72FC;
        kotakbaz.rain.client.util.render.display.A.F[0x777A ^ 0x7711] = 0x771C ^ 0x7711;
        kotakbaz.rain.client.util.render.display.A.F[0x108F1 ^ 0x108D2] = 0x108A4 ^ 0x108D2;
        kotakbaz.rain.client.util.render.display.A.F[0x20B6 ^ 0x2068] = 0x20F5 ^ 0x2068;
        kotakbaz.rain.client.util.render.display.A.F[0xB206 ^ 0xB35A] = 0x1965 ^ 0xB35A;
        kotakbaz.rain.client.util.render.display.A.F[0x2014 ^ 0x2076] = 0x204E ^ 0x2076;
        kotakbaz.rain.client.util.render.display.A.F[0xCC20 ^ 0xCCA1] = 0xCC3A ^ 0xCCA1;
        kotakbaz.rain.client.util.render.display.A.F[0xC98A ^ 0xC89E] = 0xFFFF3779 ^ 0xC89E;
        kotakbaz.rain.client.util.render.display.A.F[0xEC29 ^ 0xEC6B] = 0xFFFF130B ^ 0xEC6B;
        kotakbaz.rain.client.util.render.display.A.F[0xD85 ^ 0xDE6] = 0xD87 ^ 0xDE6;
        kotakbaz.rain.client.util.render.display.A.F[0x7E2A ^ 0x7F36] = 0x7F44 ^ 0x7F36;
        kotakbaz.rain.client.util.render.display.A.F[0xB070 ^ 0xB089] = 0x7B98 ^ 0xB089;
        kotakbaz.rain.client.util.render.display.A.F[0x5B2E ^ 0x5A6C] = 0x5A6C ^ 0x5A6C;
        kotakbaz.rain.client.util.render.display.A.F[0xCDBC ^ 0xCCF4] = 0x8929 ^ 0xCCF4;
        kotakbaz.rain.client.util.render.display.A.F[0xEB1 ^ 0xE4E] = 0xD0D2 ^ 0xE4E;
        kotakbaz.rain.client.util.render.display.A.F[0x1534 ^ 0x145F] = 0xFFFF3D1D ^ 0x145F;
        kotakbaz.rain.client.util.render.display.A.F[0x34EA ^ 0x3476] = 0x34FE ^ 0x3476;
        kotakbaz.rain.client.util.render.display.A.F[0xE58F ^ 0xE4E2] = 0xC6BD ^ 0xE4E2;
        kotakbaz.rain.client.util.render.display.A.F[0xC593 ^ 0xC50D] = 0xFFFF3A96 ^ 0xC50D;
        kotakbaz.rain.client.util.render.display.A.F[0xA754 ^ 0xA673] = 0xA604 ^ 0xA673;
        kotakbaz.rain.client.util.render.display.A.F[0xBDA8 ^ 0xBC80] = 0xBCBF ^ 0xBC80;
        kotakbaz.rain.client.util.render.display.A.F[0xFFF9 ^ 0xFF3A] = 0xFFFF00FA ^ 0xFF3A;
        kotakbaz.rain.client.util.render.display.A.F[0x650 ^ 0x635] = 0xFFFFF9D2 ^ 0x635;
        kotakbaz.rain.client.util.render.display.A.F[0x8B04 ^ 0x8B2F] = 0x8B64 ^ 0x8B2F;
        kotakbaz.rain.client.util.render.display.A.F[0xD9ED ^ 0xD897] = 0x1D87B ^ 0xD897;
        kotakbaz.rain.client.util.render.display.A.F[0x5B03 ^ 0x5B89] = 0x5B3B ^ 0x5B89;
        kotakbaz.rain.client.util.render.display.A.F[0x9396 ^ 0x9328] = 0xFFFF6CD1 ^ 0x9328;
        kotakbaz.rain.client.util.render.display.A.F[0x9EA1 ^ 0x9EE7] = 0x9E90 ^ 0x9EE7;
        kotakbaz.rain.client.util.render.display.A.F[0xBA2D ^ 0xBA45] = 0xFFFF45DD ^ 0xBA45;
        kotakbaz.rain.client.util.render.display.A.F[0xB1D8 ^ 0xB16D] = 0xFFFF4E97 ^ 0xB16D;
        kotakbaz.rain.client.util.render.display.A.F[0x286C ^ 0x2836] = 0x2830 ^ 0x2836;
        kotakbaz.rain.client.util.render.display.A.F[0x7DCC ^ 0x7D88] = 0x7DF6 ^ 0x7D88;
        kotakbaz.rain.client.util.render.display.A.F[0xFA61 ^ 0xFAC3] = 0xFABA ^ 0xFAC3;
        kotakbaz.rain.client.util.render.display.A.F[0x10318 ^ 0x10293] = 0x1C4DD ^ 0x10293;
        kotakbaz.rain.client.util.render.display.A.F[0xD012 ^ 0xD062] = 0xD05A ^ 0xD062;
        kotakbaz.rain.client.util.render.display.A.F[0xA094 ^ 0xA045] = 0xFFFF5F96 ^ 0xA045;
        kotakbaz.rain.client.util.render.display.A.F[0xA084 ^ 0xA10B] = 0x4B8F ^ 0xA10B;
        kotakbaz.rain.client.util.render.display.A.F[0xFA0F ^ 0xFB14] = 0xFFFF04D6 ^ 0xFB14;
        kotakbaz.rain.client.util.render.display.A.F[0x25AF ^ 0x24E9] = 0x6134 ^ 0x24E9;
        kotakbaz.rain.client.util.render.display.A.F[0xC267 ^ 0xC330] = 0x2BEB ^ 0xC330;
        kotakbaz.rain.client.util.render.display.A.F[0xCB9B ^ 0xCA84] = 0xFFFF351E ^ 0xCA84;
        kotakbaz.rain.client.util.render.display.A.F[0x98DE ^ 0x98FE] = 0xFFFF6714 ^ 0x98FE;
        kotakbaz.rain.client.util.render.display.A.F[0xB48B ^ 0xB4E6] = 0xB4D7 ^ 0xB4E6;
        kotakbaz.rain.client.util.render.display.A.F[0xC311 ^ 0xC34C] = 0xFFFF3C90 ^ 0xC34C;
        kotakbaz.rain.client.util.render.display.A.F[0xC89B ^ 0xC9AD] = 0xFFFF3617 ^ 0xC9AD;
        kotakbaz.rain.client.util.render.display.A.F[0x17F8 ^ 0x170C] = 0x170E ^ 0x170C;
        kotakbaz.rain.client.util.render.display.A.F[0x80B4 ^ 0x81E2] = 0x6914 ^ 0x81E2;
        kotakbaz.rain.client.util.render.display.A.F[0x101C1 ^ 0x10123] = 0xFFFEFEF5 ^ 0x10123;
        kotakbaz.rain.client.util.render.display.A.F[0x19CE ^ 0x18CC] = 0x1C62 ^ 0x18CC;
        kotakbaz.rain.client.util.render.display.A.F[0xEB05 ^ 0xEA12] = 0xEA79 ^ 0xEA12;
        kotakbaz.rain.client.util.render.display.A.F[0x8E2D ^ 0x8EB5] = 0x8E80 ^ 0x8EB5;
        kotakbaz.rain.client.util.render.display.A.F[0xBB8 ^ 0xB3F] = 0xBA2 ^ 0xB3F;
        kotakbaz.rain.client.util.render.display.A.F[0x43B0 ^ 0x4289] = 0xFFFFBD02 ^ 0x4289;
        kotakbaz.rain.client.util.render.display.A.F[0x5D56 ^ 0x5D98] = 0x5DA5 ^ 0x5D98;
        kotakbaz.rain.client.util.render.display.A.F[0xF168 ^ 0xF11B] = 0xFFFF0E9E ^ 0xF11B;
        kotakbaz.rain.client.util.render.display.A.F[0xBD3C ^ 0xBD8C] = 0xBDA4 ^ 0xBD8C;
        kotakbaz.rain.client.util.render.display.A.F[0x4812 ^ 0x4820] = 0xFFFFB7D4 ^ 0x4820;
        kotakbaz.rain.client.util.render.display.A.F[0x127C ^ 0x12D0] = 0xFFFFED5E ^ 0x12D0;
        kotakbaz.rain.client.util.render.display.A.F[0x2B90 ^ 0x2ADF] = 0xFFFF337F ^ 0x2ADF;
        kotakbaz.rain.client.util.render.display.A.F[0x4376 ^ 0x43E0] = 0x43E5 ^ 0x43E0;
        kotakbaz.rain.client.util.render.display.A.F[0x46F6 ^ 0x4787] = 0x15CD ^ 0x4787;
        kotakbaz.rain.client.util.render.display.A.F[0x10BF7 ^ 0x10AF8] = 0x10ACB ^ 0x10AF8;
        kotakbaz.rain.client.util.render.display.A.F[0x691E ^ 0x69F9] = 0xFFFF9631 ^ 0x69F9;
        kotakbaz.rain.client.util.render.display.A.F[0x6FC ^ 0x619] = 0x616 ^ 0x619;
        kotakbaz.rain.client.util.render.display.A.F[0x9AC0 ^ 0x9BAC] = 0x4D69 ^ 0x9BAC;
        kotakbaz.rain.client.util.render.display.A.F[0x6C41 ^ 0x6D6E] = 0xFFFF92C2 ^ 0x6D6E;
        kotakbaz.rain.client.util.render.display.A.F[0xE427 ^ 0xE4F0] = 0xE4E3 ^ 0xE4F0;
        kotakbaz.rain.client.util.render.display.A.F[0x7734 ^ 0x7646] = 0x240B ^ 0x7646;
        kotakbaz.rain.client.util.render.display.A.F[0xE105 ^ 0xE189] = 0xE196 ^ 0xE189;
        kotakbaz.rain.client.util.render.display.A.F[0xAEEE ^ 0xAFFE] = 0xFFFF5014 ^ 0xAFFE;
        kotakbaz.rain.client.util.render.display.A.F[0xBA41 ^ 0xBA76] = 0xFFFF459C ^ 0xBA76;
        kotakbaz.rain.client.util.render.display.A.F[0x91B4 ^ 0x9160] = 0xFFFF6EE6 ^ 0x9160;
        kotakbaz.rain.client.util.render.display.A.F[0x1E1B ^ 0x1EA7] = 0x1EE2 ^ 0x1EA7;
        kotakbaz.rain.client.util.render.display.A.F[0x9527 ^ 0x95A4] = 0xFFFF6A63 ^ 0x95A4;
        kotakbaz.rain.client.util.render.display.A.F[0x10286 ^ 0x10254] = 0x102F2 ^ 0x10254;
        kotakbaz.rain.client.util.render.display.A.F[0x4127 ^ 0x4010] = 0xFFFFBF96 ^ 0x4010;
        kotakbaz.rain.client.util.render.display.A.F[0x95F5 ^ 0x94B8] = 0x72F1 ^ 0x94B8;
        kotakbaz.rain.client.util.render.display.A.F[0x5BB7 ^ 0x5BCB] = 0xFFFFA41F ^ 0x5BCB;
        kotakbaz.rain.client.util.render.display.A.F[0x4268 ^ 0x4292] = 0x9373 ^ 0x4292;
        kotakbaz.rain.client.util.render.display.A.F[0x4BF7 ^ 0x4B18] = 0xFFFFB4B0 ^ 0x4B18;
        kotakbaz.rain.client.util.render.display.A.F[0xD34E ^ 0xD26C] = 0xFFFF2DCB ^ 0xD26C;
        kotakbaz.rain.client.util.render.display.A.F[0x104BF ^ 0x1044C] = 0x1044C ^ 0x1044C;
        kotakbaz.rain.client.util.render.display.A.F[0xB5EF ^ 0xB52D] = 0xFFFF4AC3 ^ 0xB52D;
        kotakbaz.rain.client.util.render.display.A.F[0xD1CC ^ 0xD11F] = 0xD137 ^ 0xD11F;
        kotakbaz.rain.client.util.render.display.A.F[0xDFE7 ^ 0xDEEC] = 0xFFFF2145 ^ 0xDEEC;
        kotakbaz.rain.client.util.render.display.A.F[0x72C ^ 0x6AA] = 0xEEC0 ^ 0x6AA;
        kotakbaz.rain.client.util.render.display.A.F[0x10AF8 ^ 0x10AC5] = 0xFFFEF577 ^ 0x10AC5;
        kotakbaz.rain.client.util.render.display.A.F[0x6E68 ^ 0x6EFC] = 0xFFFF9154 ^ 0x6EFC;
        kotakbaz.rain.client.util.render.display.A.F[0xE3F6 ^ 0xE2E7] = 0xE293 ^ 0xE2E7;
        kotakbaz.rain.client.util.render.display.A.F[0x64DC ^ 0x64C5] = 0x64D0 ^ 0x64C5;
        kotakbaz.rain.client.util.render.display.A.F[0x6D84 ^ 0x6D2A] = 0x6D20 ^ 0x6D2A;
        kotakbaz.rain.client.util.render.display.A.F[0xDC75 ^ 0xDD3C] = 0x976A ^ 0xDD3C;
        kotakbaz.rain.client.util.render.display.A.F[0x81B5 ^ 0x80E6] = 0xFFFF2083 ^ 0x80E6;
        kotakbaz.rain.client.util.render.display.A.F[0x5B1 ^ 0x5E4] = 0xFFFFFA0D ^ 0x5E4;
        kotakbaz.rain.client.util.render.display.A.F[0x4D ^ 0x171] = 0x127 ^ 0x171;
        kotakbaz.rain.client.util.render.display.A.F[0xEEB8 ^ 0xEE02] = 0xFFFF11B4 ^ 0xEE02;
        kotakbaz.rain.client.util.render.display.A.F[0x8E8B ^ 0x8E5E] = 0x8E59 ^ 0x8E5E;
        kotakbaz.rain.client.util.render.display.A.F[0x9939 ^ 0x984D] = 0xCA00 ^ 0x984D;
        kotakbaz.rain.client.util.render.display.A.F[0xDC36 ^ 0xDCDE] = 0xFFFF2365 ^ 0xDCDE;
        kotakbaz.rain.client.util.render.display.A.F[0xD874 ^ 0xD902] = 0x1D038 ^ 0xD902;
        kotakbaz.rain.client.util.render.display.A.F[0x87F1 ^ 0x87F3] = 0x87E6 ^ 0x87F3;
        kotakbaz.rain.client.util.render.display.A.F[0x8DD5 ^ 0x8CFB] = 0xFFFF7360 ^ 0x8CFB;
        kotakbaz.rain.client.util.render.display.A.F[0x9045 ^ 0x906F] = 0xFFFF6F26 ^ 0x906F;
        kotakbaz.rain.client.util.render.display.A.F[0x8D91 ^ 0x8D75] = 0xFFFF72D7 ^ 0x8D75;
        kotakbaz.rain.client.util.render.display.A.F[0x1AF5 ^ 0x1AFE] = 0x1A83 ^ 0x1AFE;
        kotakbaz.rain.client.util.render.display.A.F[0x2C9 ^ 0x280] = 0xFFFFFD7E ^ 0x280;
        kotakbaz.rain.client.util.render.display.A.F[0x6823 ^ 0x6922] = 0x888C ^ 0x6922;
        kotakbaz.rain.client.util.render.display.A.F[0x19F6 ^ 0x19BB] = 0x19FE ^ 0x19BB;
        kotakbaz.rain.client.util.render.display.A.F[0xF38B ^ 0xF2DA] = 0xAD6D ^ 0xF2DA;
        kotakbaz.rain.client.util.render.display.A.F[0x4E96 ^ 0x4E68] = 0x6492 ^ 0x4E68;
        kotakbaz.rain.client.util.render.display.A.F[0x39A5 ^ 0x38A0] = 0xFFFFC73D ^ 0x38A0;
        kotakbaz.rain.client.util.render.display.A.F[0xE779 ^ 0xE766] = 0xFFFF18AB ^ 0xE766;
        kotakbaz.rain.client.util.render.display.A.F[0x109A4 ^ 0x10900] = 0x1091A ^ 0x10900;
        kotakbaz.rain.client.util.render.display.A.F[0x718C ^ 0x71DE] = 0xFFFF8E1B ^ 0x71DE;
        kotakbaz.rain.client.util.render.display.A.F[0xCB8A ^ 0xCB8F] = 0xCB95 ^ 0xCB8F;
        kotakbaz.rain.client.util.render.display.A.F[0x711E ^ 0x709E] = 0x41C7 ^ 0x709E;
        kotakbaz.rain.client.util.render.display.A.F[0x755A ^ 0x7527] = 0xFFFF8AC6 ^ 0x7527;
        kotakbaz.rain.client.util.render.display.A.F[0x954F ^ 0x9451] = 0xFFFF6BE7 ^ 0x9451;
        kotakbaz.rain.client.util.render.display.A.F[0xC332 ^ 0xC3B7] = 0xFFFF3C7C ^ 0xC3B7;
        kotakbaz.rain.client.util.render.display.A.F[0x1AC0 ^ 0x1A32] = 0x1A33 ^ 0x1A32;
        kotakbaz.rain.client.util.render.display.A.F[0xDC39 ^ 0xDCAB] = 0xDCA0 ^ 0xDCAB;
        kotakbaz.rain.client.util.render.display.A.F[0xDFDE ^ 0xDE9F] = 0xDE9E ^ 0xDE9F;
        kotakbaz.rain.client.util.render.display.A.F[0xB0E5 ^ 0xB1C6] = 0xB1B0 ^ 0xB1C6;
        kotakbaz.rain.client.util.render.display.A.F[0x4D11 ^ 0x4C75] = 0xAD37 ^ 0x4C75;
        kotakbaz.rain.client.util.render.display.A.F[0xCEA4 ^ 0xCE79] = 0xFFFF31EB ^ 0xCE79;
        kotakbaz.rain.client.util.render.display.A.F[0xB13 ^ 0xB88] = 0xFFFFF47E ^ 0xB88;
        kotakbaz.rain.client.util.render.display.A.F[0x32E0 ^ 0x32C2] = 0xFFFFCD18 ^ 0x32C2;
        kotakbaz.rain.client.util.render.display.A.F[0x5368 ^ 0x5272] = 0xFFFFADD9 ^ 0x5272;
        kotakbaz.rain.client.util.render.display.A.F[0xCE8E ^ 0xCE9E] = 0xCEF4 ^ 0xCE9E;
        kotakbaz.rain.client.util.render.display.A.F[0x98EA ^ 0x984B] = 0x9820 ^ 0x984B;
        kotakbaz.rain.client.util.render.display.A.F[0x512F ^ 0x5077] = 0xB881 ^ 0x5077;
        kotakbaz.rain.client.util.render.display.A.F[0xCC72 ^ 0xCCDB] = 0xFFFF3353 ^ 0xCCDB;
        kotakbaz.rain.client.util.render.display.A.F[0xED96 ^ 0xEDAD] = 0xED93 ^ 0xEDAD;
        kotakbaz.rain.client.util.render.display.A.F[0xB401 ^ 0xB449] = 0xFFFF4BCE ^ 0xB449;
        kotakbaz.rain.client.util.render.display.A.F[0x3162 ^ 0x3002] = 0x9386 ^ 0x3002;
        kotakbaz.rain.client.util.render.display.A.F[0x4B58 ^ 0x4A12] = 0x40 ^ 0x4A12;
        kotakbaz.rain.client.util.render.display.A.F[0xE063 ^ 0xE05B] = 0xE072 ^ 0xE05B;
        kotakbaz.rain.client.util.render.display.A.F[0x9F68 ^ 0x9E33] = 0xFFFFCBFF ^ 0x9E33;
        kotakbaz.rain.client.util.render.display.A.F[0xE99C ^ 0xE9DD] = 0xE987 ^ 0xE9DD;
        kotakbaz.rain.client.util.render.display.A.F[0x10BBE ^ 0x10AFE] = 0x10AFF ^ 0x10AFE;
        kotakbaz.rain.client.util.render.display.A.F[0xE9A5 ^ 0xE913] = 0xFFFF16F1 ^ 0xE913;
        kotakbaz.rain.client.util.render.display.A.F[0x4D48 ^ 0x4C75] = 0x4C74 ^ 0x4C75;
        kotakbaz.rain.client.util.render.display.A.F[0x63DF ^ 0x63E5] = 0x63F8 ^ 0x63E5;
        kotakbaz.rain.client.util.render.display.A.F[0xD0FE ^ 0xD076] = 0xD067 ^ 0xD076;
        kotakbaz.rain.client.util.render.display.A.F[0xA7D6 ^ 0xA7E7] = 0xA78F ^ 0xA7E7;
        kotakbaz.rain.client.util.render.display.A.F[0x7BA2 ^ 0x7B44] = 0xFFFF84F4 ^ 0x7B44;
        kotakbaz.rain.client.util.render.display.A.F[0x8045 ^ 0x8126] = 0xFFFF9FC7 ^ 0x8126;
        kotakbaz.rain.client.util.render.display.A.F[0xA40F ^ 0xA411] = 0xFFFF5BE6 ^ 0xA411;
        kotakbaz.rain.client.util.render.display.A.F[0x2730 ^ 0x2742] = 0xFFFFD8E3 ^ 0x2742;
        kotakbaz.rain.client.util.render.display.A.F[0x1B58 ^ 0x1B44] = 0xFFFFE4B9 ^ 0x1B44;
        kotakbaz.rain.client.util.render.display.A.F[0x2C12 ^ 0x2CFB] = 0xFFFFD378 ^ 0x2CFB;
        kotakbaz.rain.client.util.render.display.A.F[0x2D43 ^ 0x2DAE] = 0x2DED ^ 0x2DAE;
        kotakbaz.rain.client.util.render.display.A.F[0x7722 ^ 0x777D] = 0x7761 ^ 0x777D;
        kotakbaz.rain.client.util.render.display.A.F[0xF5E ^ 0xF62] = 0xF6C ^ 0xF62;
        kotakbaz.rain.client.util.render.display.A.F[0x563A ^ 0x56C7] = 0x4301 ^ 0x56C7;
        kotakbaz.rain.client.util.render.display.A.F[0x559F ^ 0x558C] = 0x55FF ^ 0x558C;
        kotakbaz.rain.client.util.render.display.A.F[0xC654 ^ 0xC688] = 0xFFFF397B ^ 0xC688;
        kotakbaz.rain.client.util.render.display.A.F[0xDCC6 ^ 0xDCEE] = 0xDC9B ^ 0xDCEE;
        kotakbaz.rain.client.util.render.display.A.F[0x60DC ^ 0x602D] = 0x602D ^ 0x602D;
        kotakbaz.rain.client.util.render.display.A.F[0x100E5 ^ 0x100D0] = 0x1008D ^ 0x100D0;
        kotakbaz.rain.client.util.render.display.A.F[0x2039 ^ 0x2036] = 0x2033 ^ 0x2036;
        kotakbaz.rain.client.util.render.display.A.F[0xC803 ^ 0xC83D] = 0xFFFF379D ^ 0xC83D;
        kotakbaz.rain.client.util.render.display.A.F[0xD17A ^ 0xD074] = 0xD004 ^ 0xD074;
        kotakbaz.rain.client.util.render.display.A.F[0xFF77 ^ 0xFEFD] = 0x3884 ^ 0xFEFD;
        kotakbaz.rain.client.util.render.display.A.F[0x93C1 ^ 0x932A] = 0xFFFF6CD0 ^ 0x932A;
        kotakbaz.rain.client.util.render.display.A.F[0x70B7 ^ 0x706E] = 0x703C ^ 0x706E;
        kotakbaz.rain.client.util.render.display.A.F[0x3EB2 ^ 0x3FB6] = 0x3FC0 ^ 0x3FB6;
        kotakbaz.rain.client.util.render.display.A.F[0xCF85 ^ 0xCF0C] = 0xCF60 ^ 0xCF0C;
        kotakbaz.rain.client.util.render.display.A.F[0x7E3F ^ 0x7EAE] = 0x7E8C ^ 0x7EAE;
        kotakbaz.rain.client.util.render.display.A.F[0x1A2 ^ 0x18E] = 0xFFFFFE1A ^ 0x18E;
        kotakbaz.rain.client.util.render.display.A.F[0xB676 ^ 0xB602] = 0xB61F ^ 0xB602;
        kotakbaz.rain.client.util.render.display.A.F[0x997 ^ 0x9BA] = 0x98E ^ 0x9BA;
        kotakbaz.rain.client.util.render.display.A.F[0x1F94 ^ 0x1FE2] = 0xFFFFE008 ^ 0x1FE2;
        kotakbaz.rain.client.util.render.display.A.F[0xE9AE ^ 0xE8EB] = 0xAD3A ^ 0xE8EB;
        kotakbaz.rain.client.util.render.display.A.F[0x3E5F ^ 0x3F6B] = 0xFFFFC0D5 ^ 0x3F6B;
        kotakbaz.rain.client.util.render.display.A.F[0xE813 ^ 0xE971] = 0x833 ^ 0xE971;
        kotakbaz.rain.client.util.render.display.A.F[0xC149 ^ 0xC112] = 0xFFFF3EB9 ^ 0xC112;
        kotakbaz.rain.client.util.render.display.A.F[0x945 ^ 0x82F] = 0xDEEA ^ 0x82F;
        kotakbaz.rain.client.util.render.display.A.F[0xDEA7 ^ 0xDFA7] = 0xB0EB ^ 0xDFA7;
        kotakbaz.rain.client.util.render.display.A.F[0x7724 ^ 0x7671] = 0x9E84 ^ 0x7671;
        kotakbaz.rain.client.util.render.display.A.F[0x4EAB ^ 0x4F82] = 0xFFFFB008 ^ 0x4F82;
        kotakbaz.rain.client.util.render.display.A.F[0x4327 ^ 0x43EB] = 0x437C ^ 0x43EB;
        kotakbaz.rain.client.util.render.display.A.F[0x146D ^ 0x1560] = 0x1524 ^ 0x1560;
        kotakbaz.rain.client.util.render.display.A.F[0x711 ^ 0x76F] = 0x707 ^ 0x76F;
        kotakbaz.rain.client.util.render.display.A.F[0xC7AE ^ 0xC6EA] = 0xB054 ^ 0xC6EA;
        kotakbaz.rain.client.util.render.display.A.F[0xF6B1 ^ 0xF6D5] = 0xF6AD ^ 0xF6D5;
        kotakbaz.rain.client.util.render.display.A.F[0x79FE ^ 0x79A9] = 0xFFFF8625 ^ 0x79A9;
        kotakbaz.rain.client.util.render.display.A.F[0x46B4 ^ 0x46AE] = 0x46B0 ^ 0x46AE;
        kotakbaz.rain.client.util.render.display.A.F[0x358F ^ 0x3520] = 0xFFFFCACE ^ 0x3520;
        kotakbaz.rain.client.util.render.display.A.F[0x6FE1 ^ 0x6F14] = 0x6F14 ^ 0x6F14;
        kotakbaz.rain.client.util.render.display.A.F[0x759F ^ 0x75DF] = 0x75CD ^ 0x75DF;
        kotakbaz.rain.client.util.render.display.A.F[0x69FE ^ 0x6937] = 0x690A ^ 0x6937;
        kotakbaz.rain.client.util.render.display.A.F[0x7F36 ^ 0x7F49] = 0xFFFF80B5 ^ 0x7F49;
        kotakbaz.rain.client.util.render.display.A.F[0x9EC4 ^ 0x9FFC] = 0xFFFF6027 ^ 0x9FFC;
        kotakbaz.rain.client.util.render.display.A.F[0x5D96 ^ 0x5D46] = 0xFFFFA28C ^ 0x5D46;
        kotakbaz.rain.client.util.render.display.A.F[0xD91F ^ 0xD9E7] = 0xD4F7 ^ 0xD9E7;
        kotakbaz.rain.client.util.render.display.A.F[0x537F ^ 0x5310] = 0x5322 ^ 0x5310;
        kotakbaz.rain.client.util.render.display.A.F[0xC78C ^ 0xC78B] = 0xC7F3 ^ 0xC78B;
        kotakbaz.rain.client.util.render.display.A.F[0xCFEA ^ 0xCFF7] = 0xCFDC ^ 0xCFF7;
        kotakbaz.rain.client.util.render.display.A.F[0x2106 ^ 0x2167] = 0x2156 ^ 0x2167;
        kotakbaz.rain.client.util.render.display.A.F[0x5CD3 ^ 0x5CDD] = 0x5CB6 ^ 0x5CDD;
        kotakbaz.rain.client.util.render.display.A.F[0x9032 ^ 0x9103] = 0x91D7 ^ 0x9103;
        kotakbaz.rain.client.util.render.display.A.F[0x9B50 ^ 0x9B7E] = 0xFFFF6487 ^ 0x9B7E;
        kotakbaz.rain.client.util.render.display.A.F[0x3422 ^ 0x34D4] = 0x34D4 ^ 0x34D4;
        kotakbaz.rain.client.util.render.display.A.F[0xC03A ^ 0xC111] = 0xFFFF3E6A ^ 0xC111;
        kotakbaz.rain.client.util.render.display.A.F[0xD378 ^ 0xD3DB] = 0xFFFF2C45 ^ 0xD3DB;
        kotakbaz.rain.client.util.render.display.A.F[0xA744 ^ 0xA7D3] = 0xA7C3 ^ 0xA7D3;
        kotakbaz.rain.client.util.render.display.A.F[0x9E00 ^ 0x9F82] = 0xFFCC ^ 0x9F82;
        kotakbaz.rain.client.util.render.display.A.F[0x6D36 ^ 0x6D3B] = 0xFFFF92F4 ^ 0x6D3B;
        kotakbaz.rain.client.util.render.display.A.F[0xCBCA ^ 0xCB5F] = 0xFFFF3488 ^ 0xCB5F;
        kotakbaz.rain.client.util.render.display.A.F[0x4FDE ^ 0x4FCC] = 0xFFFFB028 ^ 0x4FCC;
        kotakbaz.rain.client.util.render.display.A.F[0x7039 ^ 0x7069] = 0xFFFF8FAA ^ 0x7069;
        kotakbaz.rain.client.util.render.display.A.F[0xF138 ^ 0xF1D4] = 0xFFFF0E4E ^ 0xF1D4;
        kotakbaz.rain.client.util.render.display.A.F[0x27B1 ^ 0x27A5] = 0x27DF ^ 0x27A5;
        kotakbaz.rain.client.util.render.display.A.F[0x525 ^ 0x436] = 0xFFFFFBAA ^ 0x436;
        kotakbaz.rain.client.util.render.display.A.F[0xC048 ^ 0xC050] = 0xC056 ^ 0xC050;
        kotakbaz.rain.client.util.render.display.A.F[0xB803 ^ 0xB80A] = 0xFFFF47CD ^ 0xB80A;
        kotakbaz.rain.client.util.render.display.A.F[0x60E0 ^ 0x60D6] = 0xFFFF9F37 ^ 0x60D6;
        kotakbaz.rain.client.util.render.display.A.F[0x43F ^ 0x44A] = 0xFFFFFB8A ^ 0x44A;
        kotakbaz.rain.client.util.render.display.A.F[0x6F17 ^ 0x6F2E] = 0xFFFF90EB ^ 0x6F2E;
        kotakbaz.rain.client.util.render.display.A.F[0x2B82 ^ 0x2BAD] = 0xFFFFD468 ^ 0x2BAD;
        kotakbaz.rain.client.util.render.display.A.F[0x592F ^ 0x580F] = 0x5825 ^ 0x580F;
        kotakbaz.rain.client.util.render.display.A.F[0x4E4C ^ 0x4ECA] = 0xFFFFB118 ^ 0x4ECA;
        kotakbaz.rain.client.util.render.display.A.F[0xEF25 ^ 0xEF88] = 0xFFFF1059 ^ 0xEF88;
        kotakbaz.rain.client.util.render.display.A.F[0x6FB4 ^ 0x6EED] = 0xC4D0 ^ 0x6EED;
        kotakbaz.rain.client.util.render.display.A.F[0x10AA2 ^ 0x10A31] = 0xFFFEF5B2 ^ 0x10A31;
        kotakbaz.rain.client.util.render.display.A.F[0x41C3 ^ 0x4184] = 0x41AF ^ 0x4184;
        kotakbaz.rain.client.util.render.display.A.F[0x4E02 ^ 0x4E14] = 0x4E3D ^ 0x4E14;
        kotakbaz.rain.client.util.render.display.A.F[0x100DE ^ 0x101AB] = 0x891 ^ 0x101AB;
        kotakbaz.rain.client.util.render.display.A.F[0x4F28 ^ 0x4F7E] = 0xFFFFB0EA ^ 0x4F7E;
        kotakbaz.rain.client.util.render.display.A.F[0x5AAE ^ 0x5AF6] = 0x5A8F ^ 0x5AF6;
        kotakbaz.rain.client.util.render.display.A.F[0x1562 ^ 0x1438] = 0xBE07 ^ 0x1438;
        kotakbaz.rain.client.util.render.display.A.F[0x65C1 ^ 0x65C0] = 0xFFFF9A0B ^ 0x65C0;
        kotakbaz.rain.client.util.render.display.A.F[0x5092 ^ 0x50B6] = 0x50EC ^ 0x50B6;
        kotakbaz.rain.client.util.render.display.A.F[0xE397 ^ 0xE330] = 0xFFFF1CE7 ^ 0xE330;
        kotakbaz.rain.client.util.render.display.A.F[0x4EA2 ^ 0x4E29] = 0xFFFFB1A4 ^ 0x4E29;
        kotakbaz.rain.client.util.render.display.A.F[0x10DB8 ^ 0x10C95] = 0xFFFEF351 ^ 0x10C95;
        kotakbaz.rain.client.util.render.display.A.F[0x3A4B ^ 0x3A5E] = 0x3A5C ^ 0x3A5E;
        kotakbaz.rain.client.util.render.display.A.F[0x5094 ^ 0x51E7] = 0xFFFFFC38 ^ 0x51E7;
        kotakbaz.rain.client.util.render.display.A.F[0x2E79 ^ 0x2F6C] = 0xFFFFD0F9 ^ 0x2F6C;
        kotakbaz.rain.client.util.render.display.A.F[0x619E ^ 0x60F8] = 0xF001 ^ 0x60F8;
        kotakbaz.rain.client.util.render.display.A.F[0x6E9B ^ 0x6F12] = 0xA95C ^ 0x6F12;
        kotakbaz.rain.client.util.render.display.A.F[0xB19C ^ 0xB112] = 0xFFFF4EA1 ^ 0xB112;
        kotakbaz.rain.client.util.render.display.A.F[0xC179 ^ 0xC1E6] = 0xFFFF3E32 ^ 0xC1E6;
        kotakbaz.rain.client.util.render.display.A.F[0x61F ^ 0x733] = 0xFFFFF8A4 ^ 0x733;
        kotakbaz.rain.client.util.render.display.A.F[0x76CB ^ 0x76AB] = 0xFFFF8972 ^ 0x76AB;
        kotakbaz.rain.client.util.render.display.A.F[0x1096A ^ 0x108E2] = 0x1CEBB ^ 0x108E2;
        kotakbaz.rain.client.util.render.display.A.F[0xD706 ^ 0xD636] = 0xFFFF29DF ^ 0xD636;
        kotakbaz.rain.client.util.render.display.A.F[0x9721 ^ 0x9715] = 0x977E ^ 0x9715;
        kotakbaz.rain.client.util.render.display.A.F[0x4B96 ^ 0x4ABC] = 0xFFFFB529 ^ 0x4ABC;
        kotakbaz.rain.client.util.render.display.A.F[0x6739 ^ 0x6620] = 0x6629 ^ 0x6620;
        kotakbaz.rain.client.util.render.display.A.F[0x2B1F ^ 0x2B1C] = 0xFFFFD498 ^ 0x2B1C;
        kotakbaz.rain.client.util.render.display.A.F[0x353D ^ 0x358A] = 0xFFFFCA0A ^ 0x358A;
        kotakbaz.rain.client.util.render.display.A.F[0xBBD3 ^ 0xBB19] = 0xFFFF4495 ^ 0xBB19;
        kotakbaz.rain.client.util.render.display.A.F[0x518A ^ 0x50AE] = 0x50A3 ^ 0x50AE;
        kotakbaz.rain.client.util.render.display.A.F[0x7E9 ^ 0x7E3] = 0x7DA ^ 0x7E3;
        kotakbaz.rain.client.util.render.display.A.F[0x67B6 ^ 0x66D9] = 0xFFFFBB1B ^ 0x66D9;
        kotakbaz.rain.client.util.render.display.A.F[0x2C1E ^ 0x2D7B] = 0xBD87 ^ 0x2D7B;
        kotakbaz.rain.client.util.render.display.A.F[0x32A9 ^ 0x32B8] = 0x32D7 ^ 0x32B8;
        kotakbaz.rain.client.util.render.display.A.F[0xC81B ^ 0xC8EB] = 0xC8E8 ^ 0xC8EB;
        kotakbaz.rain.client.util.render.display.A.F[0x44B8 ^ 0x453C] = 0x2572 ^ 0x453C;
        kotakbaz.rain.client.util.render.display.A.F[0x96A1 ^ 0x97F3] = 0xC845 ^ 0x97F3;
        kotakbaz.rain.client.util.render.display.A.F[0x9F1C ^ 0x9E43] = 0xFFFFC251 ^ 0x9E43;
        kotakbaz.rain.client.util.render.display.A.F[0xA154 ^ 0xA02D] = 0x1A0C7 ^ 0xA02D;
        kotakbaz.rain.client.util.render.display.A.F[0x651C ^ 0x6559] = 0x6504 ^ 0x6559;
        kotakbaz.rain.client.util.render.display.A.F[0xD806 ^ 0xD971] = 0xFFFE2FCC ^ 0xD971;
        kotakbaz.rain.client.util.render.display.A.F[0xF795 ^ 0xF751] = 0xFFFF08F2 ^ 0xF751;
        kotakbaz.rain.client.util.render.display.A.F[0x91B0 ^ 0x90E0] = 0x76A1 ^ 0x90E0;
        kotakbaz.rain.client.util.render.display.A.F[0x7C16 ^ 0x7CCC] = 0x7C86 ^ 0x7CCC;
        kotakbaz.rain.client.util.render.display.A.F[0xC0A3 ^ 0xC065] = 0xC0F6 ^ 0xC065;
        kotakbaz.rain.client.util.render.display.A.F[0x9207 ^ 0x9244] = 0x9206 ^ 0x9244;
        kotakbaz.rain.client.util.render.display.A.F[0x8652 ^ 0x871E] = 0xCD4C ^ 0x871E;
        kotakbaz.rain.client.util.render.display.A.F[0x10B2D ^ 0x10BA0] = 0xFFFEF407 ^ 0x10BA0;
        kotakbaz.rain.client.util.render.display.A.F[0xB88E ^ 0xB909] = 0x5143 ^ 0xB909;
        kotakbaz.rain.client.util.render.display.A.F[0xF072 ^ 0xF0EF] = 0xF0FF ^ 0xF0EF;
        kotakbaz.rain.client.util.render.display.A.F[0xC275 ^ 0xC2CE] = 0xFFFF3D22 ^ 0xC2CE;
        kotakbaz.rain.client.util.render.display.A.F[0x53F6 ^ 0x5286] = 0x70D3 ^ 0x5286;
        kotakbaz.rain.client.util.render.display.A.F[0x9B0C ^ 0x9A29] = 0xFFFF65C9 ^ 0x9A29;
        kotakbaz.rain.client.util.render.display.A.F[0x4DF5 ^ 0x4D5D] = 0x4D46 ^ 0x4D5D;
        kotakbaz.rain.client.util.render.display.A.F[0xA452 ^ 0xA49D] = 0xFFFF5B6A ^ 0xA49D;
        kotakbaz.rain.client.util.render.display.A.F[0xAB0A ^ 0xABB3] = 0xFFFF5410 ^ 0xABB3;
        kotakbaz.rain.client.util.render.display.A.F[0x8E39 ^ 0x8FBA] = 0xFFFF105D ^ 0x8FBA;
        kotakbaz.rain.client.util.render.display.A.F[0x1833 ^ 0x1815] = 0x187D ^ 0x1815;
        kotakbaz.rain.client.util.render.display.A.F[0x10997 ^ 0x109B0] = 0xFFFEF622 ^ 0x109B0;
        kotakbaz.rain.client.util.render.display.A.F[0x7C06 ^ 0x7CBE] = 0xFFFF8303 ^ 0x7CBE;
        kotakbaz.rain.client.util.render.display.A.F[0xF1A4 ^ 0xF12B] = 0xF127 ^ 0xF12B;
        kotakbaz.rain.client.util.render.display.A.F[0x6B67 ^ 0x6B90] = 0x6988 ^ 0x6B90;
        kotakbaz.rain.client.util.render.display.A.F[0x210E ^ 0x205A] = 0x7FEC ^ 0x205A;
        kotakbaz.rain.client.util.render.display.A.F[0x7074 ^ 0x70C9] = 0xFFFF8F2C ^ 0x70C9;
        kotakbaz.rain.client.util.render.display.A.F[0x10EE ^ 0x1096] = 0xFFFFEF67 ^ 0x1096;
        kotakbaz.rain.client.util.render.display.A.F[0xF081 ^ 0xF1FD] = 0x1F111 ^ 0xF1FD;
        kotakbaz.rain.client.util.render.display.A.F[0x7272 ^ 0x7374] = 0x7341 ^ 0x7374;
        kotakbaz.rain.client.util.render.display.A.F[0x7B80 ^ 0x7ABB] = 0xFFFF8566 ^ 0x7ABB;
        kotakbaz.rain.client.util.render.display.A.F[0x1079B ^ 0x107EC] = 0x1079A ^ 0x107EC;
        kotakbaz.rain.client.util.render.display.A.F[0xAE5A ^ 0xAE3C] = 0xFFFF5183 ^ 0xAE3C;
        kotakbaz.rain.client.util.render.display.A.F[0x7A63 ^ 0x7B3E] = 0xD8B4 ^ 0x7B3E;
        kotakbaz.rain.client.util.render.display.A.F[0xD358 ^ 0xD266] = 0xD264 ^ 0xD266;
        kotakbaz.rain.client.util.render.display.A.F[0x10B82 ^ 0x10B02] = 0x10B5C ^ 0x10B02;
        kotakbaz.rain.client.util.render.display.A.F[0x7A6D ^ 0x7B6E] = 0x7B6E ^ 0x7B6E;
        kotakbaz.rain.client.util.render.display.A.F[0x10239 ^ 0x10346] = 0xFFFECDCB ^ 0x10346;
        kotakbaz.rain.client.util.render.display.A.F[0xAB2 ^ 0xAA9] = 0xA82 ^ 0xAA9;
        kotakbaz.rain.client.util.render.display.A.F[0x5301 ^ 0x524A] = 0xFFFFE7A2 ^ 0x524A;
        kotakbaz.rain.client.util.render.display.A.F[0x1D70 ^ 0x1D19] = 0x1D02 ^ 0x1D19;
        kotakbaz.rain.client.util.render.display.A.F[0xFA11 ^ 0xFACE] = 0xFA9A ^ 0xFACE;
        kotakbaz.rain.client.util.render.display.A.F[0x9FD1 ^ 0x9FDD] = 0x9F46 ^ 0x9FDD;
        kotakbaz.rain.client.util.render.display.A.F[0x30EB ^ 0x30D4] = 0x30BC ^ 0x30D4;
        kotakbaz.rain.client.util.render.display.A.F[0xFFFD ^ 0xFF9A] = 0xFFFF0063 ^ 0xFF9A;
        kotakbaz.rain.client.util.render.display.A.F[0x3B02 ^ 0x3B31] = 0x3B27 ^ 0x3B31;
        kotakbaz.rain.client.util.render.display.A.F[0xB2E8 ^ 0xB2EC] = 0xFFFF4D6B ^ 0xB2EC;
        kotakbaz.rain.client.util.render.display.A.F[0x8842 ^ 0x88E2] = 0xFFFF777D ^ 0x88E2;
        kotakbaz.rain.client.util.render.display.A.F[0x7EF3 ^ 0x7E6A] = 0x7E77 ^ 0x7E6A;
        kotakbaz.rain.client.util.render.display.A.F[0x3883 ^ 0x39A5] = 0x3992 ^ 0x39A5;
        kotakbaz.rain.client.util.render.display.A.F[0x4E9C ^ 0x4FE1] = 0x7EB7 ^ 0x4FE1;
        kotakbaz.rain.client.util.render.display.A.F[0xB801 ^ 0xB91C] = 0xB914 ^ 0xB91C;
        kotakbaz.rain.client.util.render.display.A.F[0xBEE9 ^ 0xBE28] = 0xBE59 ^ 0xBE28;
        kotakbaz.rain.client.util.render.display.A.F[0x1945 ^ 0x19D5] = 0x19DC ^ 0x19D5;
        kotakbaz.rain.client.util.render.display.A.F[0xB97E ^ 0xB9D5] = 0xFFFF46AA ^ 0xB9D5;
        kotakbaz.rain.client.util.render.display.A.F[0xC7AE ^ 0xC769] = 0xC76D ^ 0xC769;
        kotakbaz.rain.client.util.render.display.A.F[0x88DC ^ 0x89EF] = 0x899D ^ 0x89EF;
        kotakbaz.rain.client.util.render.display.A.F[0xF10E ^ 0xF15A] = 0xF12F ^ 0xF15A;
        kotakbaz.rain.client.util.render.display.A.F[0xE792 ^ 0xE680] = 0xE6BE ^ 0xE680;
        kotakbaz.rain.client.util.render.display.A.F[0x103AF ^ 0x1022E] = 0x1626B ^ 0x1022E;
        kotakbaz.rain.client.util.render.display.A.F[0x1262 ^ 0x1357] = 0x1333 ^ 0x1357;
        kotakbaz.rain.client.util.render.display.A.F[0x4CCC ^ 0x4CC4] = 0x4CDD ^ 0x4CC4;
        kotakbaz.rain.client.util.render.display.A.F[0xFC01 ^ 0xFCB0] = 0xFFFF037A ^ 0xFCB0;
        kotakbaz.rain.client.util.render.display.A.F[0xD91D ^ 0xD977] = 0xD960 ^ 0xD977;
        kotakbaz.rain.client.util.render.display.A.F[0x10377 ^ 0x103ED] = 0xFFFEFC37 ^ 0x103ED;
        kotakbaz.rain.client.util.render.display.A.F[0x8CD9 ^ 0x8DC1] = 0x8DAE ^ 0x8DC1;
        kotakbaz.rain.client.util.render.display.A.F[0x5CDD ^ 0x5CAC] = 0xFFFFA33B ^ 0x5CAC;
        kotakbaz.rain.client.util.render.display.A.F[0xFD62 ^ 0xFDA7] = 0xFFFF0256 ^ 0xFDA7;
        kotakbaz.rain.client.util.render.display.A.F[0x7BE4 ^ 0x7B9E] = 0xFFFF845C ^ 0x7B9E;
        kotakbaz.rain.client.util.render.display.A.F[0x7F86 ^ 0x7FAF] = 0x7FA9 ^ 0x7FAF;
        kotakbaz.rain.client.util.render.display.A.F[0x8220 ^ 0x836E] = 0x652F ^ 0x836E;
        kotakbaz.rain.client.util.render.display.A.F[0x19A1 ^ 0x19EF] = 0xFFFFE61F ^ 0x19EF;
        kotakbaz.rain.client.util.render.display.A.F[0xE532 ^ 0xE40D] = 0xE40D ^ 0xE40D;
        kotakbaz.rain.client.util.render.display.A.F[0x36BC ^ 0x37FF] = 0x4151 ^ 0x37FF;
        kotakbaz.rain.client.util.render.display.A.F[0x104C6 ^ 0x105C1] = 0x105C8 ^ 0x105C1;
        kotakbaz.rain.client.util.render.display.A.F[0xDB33 ^ 0xDBB1] = 0xDBD3 ^ 0xDBB1;
        kotakbaz.rain.client.util.render.display.A.F[0x5FD1 ^ 0x5F82] = 0xFFFFA031 ^ 0x5F82;
        kotakbaz.rain.client.util.render.display.A.F[0x702A ^ 0x70CB] = 0x7043 ^ 0x70CB;
        kotakbaz.rain.client.util.render.display.A.F[0xB720 ^ 0xB7E0] = 0xFFFF489E ^ 0xB7E0;
        kotakbaz.rain.client.util.render.display.A.F[0x3B30 ^ 0x3BEB] = 0x3BB9 ^ 0x3BEB;
        kotakbaz.rain.client.util.render.display.A.F[0x63EE ^ 0x63EE] = 0xFFFF9C3D ^ 0x63EE;
        kotakbaz.rain.client.util.render.display.A.F[0x2300 ^ 0x228C] = 0xC813 ^ 0x228C;
        kotakbaz.rain.client.util.render.display.A.F[0xFB2D ^ 0xFA27] = 0xFAC5 ^ 0xFA27;
        kotakbaz.rain.client.util.render.display.A.F[0xC539 ^ 0xC58A] = 0xC5EF ^ 0xC58A;
        kotakbaz.rain.client.util.render.display.A.F[0x8BCA ^ 0x8B12] = 0xFFFF747F ^ 0x8B12;
        kotakbaz.rain.client.util.render.display.A.F[0xF0FE ^ 0xF0B4] = 0xF0CF ^ 0xF0B4;
        kotakbaz.rain.client.util.render.display.A.F[0x10412 ^ 0x1047E] = 0x104D7 ^ 0x1047E;
        kotakbaz.rain.client.util.render.display.A.F[0x7147 ^ 0x7116] = 0xFFFF8E8E ^ 0x7116;
        kotakbaz.rain.client.util.render.display.A.F[0x104C4 ^ 0x10409] = 0xFFFEFB9D ^ 0x10409;
        kotakbaz.rain.client.util.render.display.A.F[0xEC42 ^ 0xED3A] = 0x1E400 ^ 0xED3A;
        kotakbaz.rain.client.util.render.display.A.F[0xB1E6 ^ 0xB12E] = 0xB159 ^ 0xB12E;
        kotakbaz.rain.client.util.render.display.A.F[0xF08F ^ 0xF029] = 0xFFFF0FE0 ^ 0xF029;
    }
}

