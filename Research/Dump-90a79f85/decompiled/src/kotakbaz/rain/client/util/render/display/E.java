/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_276
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 */
package kotakbaz.rain.client.util.render.display;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.extensions.b_0;
import kotakbaz.rain.client.util.render.display.A;
import kotakbaz.rain.client.util.render.display.B;
import kotakbaz.rain.client.util.render.display.C;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_276;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector4f;
import org.joml.Vector4fc;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\u0018\u0000 <2\u00020\u0001:\u0001<B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\r\u0010\u000eJ-\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f\u00a2\u0006\u0004\b\r\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0018\u00a2\u0006\u0004\b\u0016\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0014\u00a2\u0006\u0004\b\u001a\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0014\u00a2\u0006\u0004\b\u001e\u0010\u0017J\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\u001f\u0010\u000eJU\u0010%\u001a\u00020$2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\f\u00a2\u0006\u0004\b%\u0010&J-\u0010%\u001a\u00020$2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0014\u00a2\u0006\u0004\b%\u0010'J5\u0010%\u001a\u00020$2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\b%\u0010(JE\u0010%\u001a\u00020$2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u0014\u00a2\u0006\u0004\b%\u0010)JE\u0010%\u001a\u00020$2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0014\u00a2\u0006\u0004\b%\u0010*JE\u0010%\u001a\u00020$2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0014\u00a2\u0006\u0004\b%\u0010+JU\u0010%\u001a\u00020$2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\f\u00a2\u0006\u0004\b%\u0010,JU\u0010-\u001a\u00020$2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\f\u00a2\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0003\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u00100R\u0016\u00101\u001a\u00020\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b9\u00108R\u0016\u0010:\u001a\u00020\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b:\u0010;\u00a8\u0006="}, d2={"Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;", "", "Lkotakbaz/rain/client/util/render/display/TextureRectRenderer;", "textureRect", "Lkotakbaz/rain/client/util/render/display/KawaseRenderer;", "kawase", "<init>", "(Lkotakbaz/rain/client/util/render/display/TextureRectRenderer;Lkotakbaz/rain/client/util/render/display/KawaseRenderer;)V", "Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "pipeline", "priority", "(Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;", "Ljava/awt/Color;", "color", "(Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;", "c1", "c2", "c3", "c4", "(Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;", "", "radius", "round", "(F)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;", "Lorg/joml/Vector4f;", "(Lorg/joml/Vector4f;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;", "mix", "width", "border", "(FLjava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;", "borderWidth", "borderColor", "x", "y", "height", "Lkotakbaz/rain/client/util/color/QuadColor;", "", "draw", "(FFFFLorg/joml/Vector4f;Lkotakbaz/rain/client/util/color/QuadColor;FFLjava/awt/Color;)V", "(FFFF)V", "(FFFFF)V", "(FFFFLorg/joml/Vector4f;Lkotakbaz/rain/client/util/color/QuadColor;F)V", "(FFFFFLjava/awt/Color;F)V", "(FFFFLorg/joml/Vector4f;Ljava/awt/Color;F)V", "(FFFFLorg/joml/Vector4f;Ljava/awt/Color;FFLjava/awt/Color;)V", "drawWithBorder", "(FFFFFLjava/awt/Color;FFLjava/awt/Color;)V", "Lkotakbaz/rain/client/util/render/display/TextureRectRenderer;", "Lkotakbaz/rain/client/util/render/display/KawaseRenderer;", "currentPipeline", "Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "cachedRadius", "Lorg/joml/Vector4f;", "cachedColor", "Lkotakbaz/rain/client/util/color/QuadColor;", "cachedMix", "F", "cachedBorderWidth", "cachedBorderColor", "Ljava/awt/Color;", "Companion", "rain-visuals"})
public final class E {
    @NotNull
    public static final B a;
    @NotNull
    private final C A;
    @NotNull
    private final A b;
    @NotNull
    private ClientRenderPipeline B;
    @NotNull
    private final Vector4f c;
    @NotNull
    private final kotakbaz.rain.client.util.color.A C;
    private float d;
    private float D;
    @NotNull
    private Color e;
    @NotNull
    private static final Color E;
    private static Object[] f;
    private static Object g;
    private static Object[] G;
    private static Object[] F;
    private static Object[] h;
    public static int[] H;

    public E(@NotNull C c2, @NotNull A a2) {
        int n = H[0];
        n ^= H[1];
        Intrinsics.checkNotNullParameter(c2, (String)f[n -= H[2]]);
        int n2 = H[3];
        n2 -= H[4];
        Intrinsics.checkNotNullParameter(a2, (String)f[n2 ^= H[5]]);
        super();
        this.A = c2;
        this.b = a2;
        this.B = ClientRenderPipeline.LOW;
        this.c = new Vector4f();
        Color color = Color.WHITE;
        int n3 = H[6];
        n3 += H[7];
        Intrinsics.checkNotNullExpressionValue(color, (String)f[n3 -= H[8]]);
        this.C = new kotakbaz.rain.client.util.color.A(color);
        this.d = 0.2f;
        this.e = E;
    }

    @NotNull
    public final E priority(@NotNull ClientRenderPipeline clientRenderPipeline) {
        int n = H[9];
        n += H[10];
        Intrinsics.checkNotNullParameter((Object)clientRenderPipeline, (String)f[n -= H[11]]);
        this.B = clientRenderPipeline;
        return this;
    }

    @NotNull
    public final E color(@NotNull Color color) {
        int n = H[12];
        n ^= H[13];
        Intrinsics.checkNotNullParameter(color, (String)f[n ^= H[14]]);
        this.C.set(color);
        return this;
    }

    @NotNull
    public final E color(@NotNull Color color, @NotNull Color color2, @NotNull Color color3, @NotNull Color color4) {
        int n = H[15];
        n -= H[16];
        Intrinsics.checkNotNullParameter(color, (String)f[n ^= H[17]]);
        int n2 = H[18];
        n2 -= H[19];
        Intrinsics.checkNotNullParameter(color2, (String)f[n2 ^= H[20]]);
        int n3 = H[21];
        n3 += H[22];
        Intrinsics.checkNotNullParameter(color3, (String)f[n3 -= H[23]]);
        int n4 = H[24];
        n4 ^= H[25];
        Intrinsics.checkNotNullParameter(color4, (String)f[n4 -= H[26]]);
        this.C.set(color, color2, color3, color4);
        return this;
    }

    @NotNull
    public final E round(float f2) {
        this.c.set(f2, f2, f2, f2);
        return this;
    }

    @NotNull
    public final E round(@NotNull Vector4f vector4f) {
        int n = H[27];
        n += H[28];
        Intrinsics.checkNotNullParameter(vector4f, (String)f[n += H[29]]);
        this.c.set((Vector4fc)vector4f);
        return this;
    }

    @NotNull
    public final E mix(float f2) {
        this.d = f2;
        return this;
    }

    @NotNull
    public final E border(float f2, @NotNull Color color) {
        int n = H[30];
        n ^= H[31];
        Intrinsics.checkNotNullParameter(color, (String)f[n -= H[32]]);
        this.D = f2;
        this.e = color;
        return this;
    }

    @NotNull
    public final E borderWidth(float f2) {
        this.D = f2;
        return this;
    }

    @NotNull
    public final E borderColor(@NotNull Color color) {
        int n = H[33];
        n += H[34];
        Intrinsics.checkNotNullParameter(color, (String)f[n += H[35]]);
        this.e = color;
        return this;
    }

    public final void draw(float f2, float f3, float f4, float f5, @NotNull Vector4f vector4f, @NotNull kotakbaz.rain.client.util.color.A a2, float f6, float f7, @NotNull Color color) {
        long l = 6825250860113983793L;
        int n = H[36];
        n -= H[37];
        Intrinsics.checkNotNullParameter(vector4f, (String)f[n += H[38]]);
        int n2 = H[39];
        n2 += H[40];
        Intrinsics.checkNotNullParameter(a2, (String)f[n2 -= H[41]]);
        int n3 = H[42];
        n3 += H[43];
        Intrinsics.checkNotNullParameter(color, (String)f[n3 += H[44]]);
        if (!this.b.hasFramebuffer()) {
            return;
        }
        int n4 = H[45];
        n4 -= H[46];
        long l2 = l;
        int n5 = H[48];
        n5 ^= H[49];
        l = l2 ^ ((long)this.b.texture().method_71638().method_68427() << (n4 -= H[47]) ^ l2) & -1L << (n5 += H[50]);
        class_276 class_2762 = this.b.framebuffer();
        float f8 = b_0.getMc().method_22683().method_4495();
        float f9 = (float)class_2762.field_1482 / f8;
        float f10 = (float)class_2762.field_1481 / f8;
        float f11 = f2 / f9;
        float f12 = f4 / f9;
        float f13 = 1.0f - (f3 + f5) / f10;
        float f14 = f5 / f10;
        float f15 = (float)a2.getColor1().getAlpha() / 255.0f;
        int n6 = H[51];
        n6 += H[52];
        this.A.priority(this.B).texture((int)(l >>> (n6 -= H[53]))).border(f7, color).draw(f2, f3, f4, f5, a2, vector4f, f6, f11, f13, f12, f14, f15);
    }

    public final void draw(float f2, float f3, float f4, float f5) {
        this.draw(f2, f3, f4, f5, this.c, this.C, this.d, this.D, this.e);
        this.D = 0.0f;
        this.e = E;
    }

    public final void draw(float f2, float f3, float f4, float f5, float f6) {
        this.c.set(f6, f6, f6, f6);
        this.draw(f2, f3, f4, f5, this.c, this.C, this.d, this.D, this.e);
        this.D = 0.0f;
        this.e = E;
    }

    public final void draw(float f2, float f3, float f4, float f5, @NotNull Vector4f vector4f, @NotNull kotakbaz.rain.client.util.color.A a2, float f6) {
        int n = H[54];
        n ^= H[55];
        Intrinsics.checkNotNullParameter(vector4f, (String)f[n += H[56]]);
        int n2 = H[57];
        n2 += H[58];
        Intrinsics.checkNotNullParameter(a2, (String)f[n2 ^= H[59]]);
        this.draw(f2, f3, f4, f5, vector4f, a2, f6, this.D, this.e);
        this.D = 0.0f;
        this.e = E;
    }

    public final void draw(float f2, float f3, float f4, float f5, float f6, @NotNull Color color, float f7) {
        int n = H[60];
        n -= H[61];
        Intrinsics.checkNotNullParameter(color, (String)f[n += H[62]]);
        this.C.set(color);
        this.c.set(f6, f6, f6, f6);
        this.draw(f2, f3, f4, f5, this.c, this.C, f7);
    }

    public final void draw(float f2, float f3, float f4, float f5, @NotNull Vector4f vector4f, @NotNull Color color, float f6) {
        int n = H[63];
        n -= H[64];
        Intrinsics.checkNotNullParameter(vector4f, (String)f[n -= H[65]]);
        int n2 = H[66];
        n2 += H[67];
        Intrinsics.checkNotNullParameter(color, (String)f[n2 ^= H[68]]);
        this.C.set(color);
        this.draw(f2, f3, f4, f5, vector4f, this.C, f6);
    }

    public final void draw(float f2, float f3, float f4, float f5, @NotNull Vector4f vector4f, @NotNull Color color, float f6, float f7, @NotNull Color color2) {
        int n = H[69];
        n ^= H[70];
        Intrinsics.checkNotNullParameter(vector4f, (String)f[n += H[71]]);
        int n2 = H[72];
        n2 -= H[73];
        Intrinsics.checkNotNullParameter(color, (String)f[n2 ^= H[74]]);
        int n3 = H[75];
        n3 ^= H[76];
        Intrinsics.checkNotNullParameter(color2, (String)f[n3 -= H[77]]);
        this.C.set(color);
        this.draw(f2, f3, f4, f5, vector4f, this.C, f6, f7, color2);
    }

    public final void drawWithBorder(float f2, float f3, float f4, float f5, float f6, @NotNull Color color, float f7, float f8, @NotNull Color color2) {
        int n = H[78];
        n += H[79];
        Intrinsics.checkNotNullParameter(color, (String)f[n -= H[80]]);
        int n2 = H[81];
        n2 -= H[82];
        Intrinsics.checkNotNullParameter(color2, (String)f[n2 -= H[83]]);
        this.C.set(color);
        this.c.set(f6, f6, f6, f6);
        this.draw(f2, f3, f4, f5, this.c, this.C, f7, f8, color2);
    }

    static {
        kotakbaz.rain.client.util.render.display.E.b();
        long l = -8393660739171474516L;
        long l2 = -4189455498349860249L;
        long l3 = 3711745979837704234L;
        long l4 = 8781635599408500043L;
        long l5 = -7923273027709729714L;
        long l6 = 8287790881891441048L;
        long l7 = 7433954106884765883L;
        long l8 = -6205989389606098644L;
        long l9 = -1277889215286772380L;
        long l10 = -180359885395234122L;
        long l11 = -6529401800773526175L;
        long l12 = 3157410662549633965L;
        long l13 = -8683155457524220922L;
        long l14 = 7702434457041433987L;
        int n = H[84];
        n ^= H[85];
        f = new Object[n -= H[86]];
        long l15 = l14;
        int n2 = H[87];
        n2 -= H[88];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 -= H[89]);
        Object[] objectArray = new Object[H[90]];
        objectArray[kotakbaz.rain.client.util.render.display.E.H[91]] = F;
        objectArray[kotakbaz.rain.client.util.render.display.E.H[92]] = H[93];
        int n3 = H[94];
        Object object = kotakbaz.rain.client.util.render.display.E.A()[H[95]];
        if (object == null) {
            char[] cArray = "\ue6ea\ue82b\ue846\ue816\ue6f0\ue829\ue81a\ue847\ue87c\ue82d\ue86f\ue87c\ue829\ue80f\ue814\ue6e9\ue879\ue6e9\ue6e6\ue849\ue877\ue82d\ue819\ue813\ue871\ue6e7\ue84b\ue843\ue82a\ue877\ue6ec\ue87a\ue6eb\ue834\ue875\ue6ea\ue823\ue876\ue879\ue87e\ue82c\ue874\ue82d\ue815\ue84e\ue878\ue82e\ue87b\ue81e\ue879\ue6e8\ue87a\ue817\ue871\ue81c\ue876\ue843\ue877\ue86f\ue877\ue6e6\ue877\ue874\ue827\ue849\ue834\ue6e5\ue878\ue879\ue878\ue82e\ue849\ue81a\ue6eb\ue815\ue82d\ue826\ue873\ue87b\ue826\ue817\ue847\ue6e9\ue6ee\ue6e8\ue847\ue80f\ue811\ue6ec\ue828\ue876\ue819\ue81b\ue813\ue850\ue87e\ue811\ue879\ue877\ue812\ue813\ue819\ue87c\ue81a\ue823\ue877\ue82a\ue843\ue6ee\ue850\ue847\ue6ea\ue879\ue829\ue87c\ue87b\ue6ec\ue87e\ue819\ue6eb\ue847\ue826\ue6e5\ue850\ue816\ue850\ue84b\ue6f0\ue6e7\ue826\ue6eb\ue845\ue825\ue84b\ue82a\ue87c\ue81a\ue827\ue84e\ue81b\ue815\ue81e\ue6ea\ue872\ue84d\ue6e6\ue875\ue814\ue872\ue6ec\ue82d\ue6e8\ue6e7\ue6e5\ue829\ue846\ue847\ue82b\ue875\ue82d\ue829\ue84c\ue6e9\ue6ed\ue848\ue873\ue829\ue879\ue6e8\ue875\ue6ea\ue84c\ue872\ue847\ue82a\ue87b\ue82e\ue84c\ue817\ue82d\ue875\ue845\ue827\ue877\ue814\ue834\ue873\ue87a\ue829\ue874\ue817\ue87a\ue87b\ue87e\ue6ea\ue81e\ue84b\ue86f\ue81e\ue814\ue825\ue848\ue6ed\ue817\ue813\ue871\ue6e6\ue6ed\ue828\ue872\ue830\ue6ee\ue817\ue84d\ue830\ue871\ue81e\ue6e9\ue86f\ue815\ue6e9\ue845\ue816\ue878\ue813\ue80f\ue827\ue828\ue82b\ue830\ue6ed\ue843\ue879\ue84c\ue84d\ue876\ue874\ue87c\ue874\ue84c\ue6e9\ue87b\ue80f\ue825\ue6ea\ue871\ue82b\ue84b\ue819\ue6ee\ue814\ue80f\ue6ee\ue87e\ue6e9\ue81a\ue6f0\ue847\ue877\ue829\ue84e\ue847\ue819\ue874\ue82b\ue6e8\ue6e6\ue826\ue826\ue814\ue82c\ue6ed\ue843\ue811\ue81a\ue87e\ue6e6\ue876\ue812\ue6ea\ue80f\ue87b\ue825\ue6ec\ue86f\ue6e8\ue80f\ue84d\ue811\ue834\ue6e7\ue82a\ue825\ue6e5\ue87b\ue82a\ue82c\ue825\ue816\ue6e2".toCharArray();
            for (int i = H[96]; i < H[97]; ++i) {
                int n4 = cArray[i];
                n4 += H[98];
                n4 += H[99];
                n4 -= H[100];
                n4 -= H[101];
                n4 += H[102];
                n4 += H[103];
                n4 += H[104];
                n4 ^= H[105];
                n4 ^= H[106];
                n4 += H[107];
                n4 ^= H[108];
                cArray[i] = (char)(n4 += H[109]);
            }
            object = kotakbaz.rain.client.util.render.display.E.A()[kotakbaz.rain.client.util.render.display.E.H[110]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)kotakbaz.rain.client.util.render.display.E.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = H[111];
        n5 += H[112];
        l5 = l16 ^ (0xC400000000L ^ l16) & -1L << (n5 ^= H[113]);
        long l17 = l12;
        int n6 = H[114];
        n6 += H[115];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 += H[116]);
        while (true) {
            int n7 = H[117];
            n7 ^= H[118];
            if ((int)l12 >= (int)(l5 >>> (n7 -= H[119]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = H[120];
            n9 ^= H[121];
            int n10 = H[123];
            n10 ^= H[124];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 -= H[122])) & -1L >>> (n10 ^= H[125]);
            long l19 = l8;
            int n11 = H[126];
            n11 += H[127];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 += H[128]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = H[129];
            n13 += H[130];
            int n14 = H[132];
            n14 -= H[133];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 ^= H[131])) & -1L >>> (n14 -= H[134]);
            int n15 = H[135];
            n15 ^= H[136];
            long l21 = l9;
            int n16 = H[138];
            n16 += H[139];
            l9 = l21 ^ ((long)cArray[n12] << (n15 ^= H[137]) ^ l21) & -1L << (n16 -= H[140]);
            int n17 = H[141];
            n17 ^= H[142];
            n17 ^= H[143];
            int n18 = H[144];
            n18 += H[145];
            long l22 = l11;
            int n19 = H[147];
            n19 += H[148];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 += H[146]))) ^ l22) & -1L >>> (n19 ^= H[149]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = H[150];
            n20 -= H[151];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 ^= H[152]);
            while (true) {
                int n21 = H[153];
                n21 += H[154];
                if ((int)(l13 >>> (n21 -= H[155])) >= (int)l11) break;
                int n22 = H[156];
                n22 ^= H[157];
                int n23 = H[159];
                n23 ^= H[160];
                cArray2[(int)(l13 >>> (n22 += kotakbaz.rain.client.util.render.display.E.H[158]))] = cArray[(int)l12 + (int)(l13 >>> (n23 += H[161]))];
                l13 += 0x100000000L;
            }
            int n24 = H[162];
            n24 += H[163];
            int n25 = (int)(l14 >>> (n24 -= H[164]));
            l14 += 0x100000000L;
            kotakbaz.rain.client.util.render.display.E.f[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = H[165];
            n26 ^= H[166];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 ^= H[167]);
        }
        a = new B(null);
        int n27 = H[168];
        n27 -= H[169];
        n27 -= H[170];
        int n28 = H[171];
        n28 -= H[172];
        int n29 = H[174];
        n29 -= H[175];
        int n30 = H[177];
        n30 ^= H[178];
        E = new Color(n27, n28 -= H[173], n29 += H[176], n30 += H[179]);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[H[180]];
        String string = (String)object[H[181]];
        object = object[H[182]];
        Object[] objectArray = G;
        if (G == null) {
            objectArray = G = new Object[H[183]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[H[184]];
                F = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[H[186] ^ H[187]];
                byArray[kotakbaz.rain.client.util.render.display.E.H[188] ^ kotakbaz.rain.client.util.render.display.E.H[189]] = H[190] ^ H[191];
                byArray[kotakbaz.rain.client.util.render.display.E.H[192] ^ kotakbaz.rain.client.util.render.display.E.H[193]] = H[194] ^ H[195];
                byArray[kotakbaz.rain.client.util.render.display.E.H[196] ^ kotakbaz.rain.client.util.render.display.E.H[197]] = H[198] ^ H[199];
                byArray[kotakbaz.rain.client.util.render.display.E.H[200] ^ kotakbaz.rain.client.util.render.display.E.H[201]] = H[202] ^ H[203];
                byArray[kotakbaz.rain.client.util.render.display.E.H[204] ^ kotakbaz.rain.client.util.render.display.E.H[205]] = H[206] ^ H[207];
                byArray[kotakbaz.rain.client.util.render.display.E.H[208] ^ kotakbaz.rain.client.util.render.display.E.H[209]] = H[210] ^ H[211];
                byArray[kotakbaz.rain.client.util.render.display.E.H[212] ^ kotakbaz.rain.client.util.render.display.E.H[213]] = H[214] ^ H[215];
                byArray[kotakbaz.rain.client.util.render.display.E.H[216] ^ kotakbaz.rain.client.util.render.display.E.H[217]] = H[218] ^ H[219];
                byArray[kotakbaz.rain.client.util.render.display.E.H[220] ^ kotakbaz.rain.client.util.render.display.E.H[221]] = H[222] ^ H[223];
                byArray[kotakbaz.rain.client.util.render.display.E.H[224] ^ kotakbaz.rain.client.util.render.display.E.H[225]] = H[226] ^ H[227];
                byArray[kotakbaz.rain.client.util.render.display.E.H[228] ^ kotakbaz.rain.client.util.render.display.E.H[229]] = H[230] ^ H[231];
                byArray[kotakbaz.rain.client.util.render.display.E.H[232] ^ kotakbaz.rain.client.util.render.display.E.H[233]] = H[234] ^ H[235];
                byArray[kotakbaz.rain.client.util.render.display.E.H[236] ^ kotakbaz.rain.client.util.render.display.E.H[237]] = H[238] ^ H[239];
                byArray[kotakbaz.rain.client.util.render.display.E.H[240] ^ kotakbaz.rain.client.util.render.display.E.H[241]] = H[242] ^ H[243];
                byArray[kotakbaz.rain.client.util.render.display.E.H[244] ^ kotakbaz.rain.client.util.render.display.E.H[245]] = H[246] ^ H[247];
                byArray[kotakbaz.rain.client.util.render.display.E.H[248] ^ kotakbaz.rain.client.util.render.display.E.H[249]] = H[250] ^ H[251];
                objectArray2[kotakbaz.rain.client.util.render.display.E.H[185]] = byArray;
            }
            byte[] byArray = (byte[])object3[H[252]];
            if (g == null) {
                byte[] byArray2 = new byte[H[253] ^ H[254]];
                byArray2[kotakbaz.rain.client.util.render.display.E.H[255] ^ kotakbaz.rain.client.util.render.display.E.H[256]] = H[257] ^ H[258];
                byArray2[kotakbaz.rain.client.util.render.display.E.H[259] ^ kotakbaz.rain.client.util.render.display.E.H[260]] = H[261] ^ H[262];
                byArray2[kotakbaz.rain.client.util.render.display.E.H[263] ^ kotakbaz.rain.client.util.render.display.E.H[264]] = H[265] ^ H[266];
                byArray2[kotakbaz.rain.client.util.render.display.E.H[267] ^ kotakbaz.rain.client.util.render.display.E.H[268]] = H[269] ^ H[270];
                byArray2[kotakbaz.rain.client.util.render.display.E.H[271] ^ kotakbaz.rain.client.util.render.display.E.H[272]] = H[273] ^ H[274];
                byArray2[kotakbaz.rain.client.util.render.display.E.H[275] ^ kotakbaz.rain.client.util.render.display.E.H[276]] = H[277] ^ H[278];
                byArray2[kotakbaz.rain.client.util.render.display.E.H[279] ^ kotakbaz.rain.client.util.render.display.E.H[280]] = H[281] ^ H[282];
                byArray2[kotakbaz.rain.client.util.render.display.E.H[283] ^ kotakbaz.rain.client.util.render.display.E.H[284]] = H[285] ^ H[286];
                byArray2[kotakbaz.rain.client.util.render.display.E.H[287] ^ kotakbaz.rain.client.util.render.display.E.H[288]] = H[289] ^ H[290];
                byArray2[kotakbaz.rain.client.util.render.display.E.H[291] ^ kotakbaz.rain.client.util.render.display.E.H[292]] = H[293] ^ H[294];
                byArray2[kotakbaz.rain.client.util.render.display.E.H[295] ^ kotakbaz.rain.client.util.render.display.E.H[296]] = H[297] ^ H[298];
                byArray2[kotakbaz.rain.client.util.render.display.E.H[299] ^ kotakbaz.rain.client.util.render.display.E.H[300]] = H[301] ^ H[302];
                byArray2[kotakbaz.rain.client.util.render.display.E.H[303] ^ kotakbaz.rain.client.util.render.display.E.H[304]] = H[305] ^ H[306];
                byArray2[kotakbaz.rain.client.util.render.display.E.H[307] ^ kotakbaz.rain.client.util.render.display.E.H[308]] = H[309] ^ H[310];
                byArray2[kotakbaz.rain.client.util.render.display.E.H[311] ^ kotakbaz.rain.client.util.render.display.E.H[312]] = H[313] ^ H[314];
                byArray2[kotakbaz.rain.client.util.render.display.E.H[315] ^ kotakbaz.rain.client.util.render.display.E.H[316]] = H[317] ^ H[318];
                byArray2[kotakbaz.rain.client.util.render.display.E.H[319] ^ kotakbaz.rain.client.util.render.display.E.H[320]] = H[321] ^ H[322];
                byArray2[kotakbaz.rain.client.util.render.display.E.H[323] ^ kotakbaz.rain.client.util.render.display.E.H[324]] = H[325] ^ H[326];
                byArray2[kotakbaz.rain.client.util.render.display.E.H[327] ^ kotakbaz.rain.client.util.render.display.E.H[328]] = H[329] ^ H[330];
                byArray2[kotakbaz.rain.client.util.render.display.E.H[331] ^ kotakbaz.rain.client.util.render.display.E.H[332]] = H[333] ^ H[334];
                byArray2[kotakbaz.rain.client.util.render.display.E.H[335] ^ kotakbaz.rain.client.util.render.display.E.H[336]] = H[337] ^ H[338];
                byArray2[kotakbaz.rain.client.util.render.display.E.H[339] ^ kotakbaz.rain.client.util.render.display.E.H[340]] = H[341] ^ H[342];
                byArray2[kotakbaz.rain.client.util.render.display.E.H[343] ^ kotakbaz.rain.client.util.render.display.E.H[344]] = H[345] ^ H[346];
                byArray2[kotakbaz.rain.client.util.render.display.E.H[347] ^ kotakbaz.rain.client.util.render.display.E.H[348]] = H[349] ^ H[350];
                byArray2[kotakbaz.rain.client.util.render.display.E.H[351] ^ kotakbaz.rain.client.util.render.display.E.H[352]] = H[353] ^ H[354];
                byArray2[kotakbaz.rain.client.util.render.display.E.H[355] ^ kotakbaz.rain.client.util.render.display.E.H[356]] = H[357] ^ H[358];
                byArray2[kotakbaz.rain.client.util.render.display.E.H[359] ^ kotakbaz.rain.client.util.render.display.E.H[360]] = H[361] ^ H[362];
                byArray2[kotakbaz.rain.client.util.render.display.E.H[363] ^ kotakbaz.rain.client.util.render.display.E.H[364]] = H[365] ^ H[366];
                byArray2[kotakbaz.rain.client.util.render.display.E.H[367] ^ kotakbaz.rain.client.util.render.display.E.H[368]] = H[369] ^ H[370];
                byArray2[kotakbaz.rain.client.util.render.display.E.H[371] ^ kotakbaz.rain.client.util.render.display.E.H[372]] = H[373] ^ H[374];
                byArray2[kotakbaz.rain.client.util.render.display.E.H[375] ^ kotakbaz.rain.client.util.render.display.E.H[376]] = H[377] ^ H[378];
                byArray2[kotakbaz.rain.client.util.render.display.E.H[379] ^ kotakbaz.rain.client.util.render.display.E.H[380]] = H[381] ^ H[382];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, H[383], byArray3, H[384], byArray.length);
                System.arraycopy(byArray2, H[385], byArray3, byArray.length, byArray2.length);
                Object object4 = kotakbaz.rain.client.util.render.display.E.A()[H[386]];
                if (object4 == null) {
                    char[] cArray = "\uaf81\uadf7\uadf6\uadfd\uadf3\uaf27\uaf3a\uaf30\ua3ed\uaf49\uade9\ua3ec\uaf58\uaf5e\uaf8e\uade9\uadf8\uaf28".toCharArray();
                    for (int i = H[387]; i < H[388]; ++i) {
                        int n2 = cArray[i];
                        n2 += H[389];
                        n2 -= H[390];
                        n2 ^= H[391];
                        n2 -= H[392];
                        n2 -= H[393];
                        n2 ^= H[394];
                        n2 += H[395];
                        n2 -= H[396];
                        n2 ^= H[397];
                        n2 += H[398];
                        n2 ^= H[399];
                        n2 += 6197;
                        n2 += 54487;
                        cArray[i] = (char)(n2 -= 8159);
                    }
                    object4 = kotakbaz.rain.client.util.render.display.E.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[9] = -27;
                byArray4[11] = -76;
                byArray4[15] = 42;
                byArray4[3] = -69;
                byArray4[7] = 81;
                byArray4[2] = -11;
                byArray4[1] = -52;
                byArray4[4] = -6;
                byArray4[14] = 85;
                byArray4[0] = -56;
                byArray4[6] = -102;
                byArray4[8] = -102;
                byArray4[5] = -53;
                byArray4[12] = 122;
                byArray4[10] = -123;
                byArray4[13] = 111;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 10, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = kotakbaz.rain.client.util.render.display.E.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u5014\u9cd0\u9da6".toCharArray();
                    for (int i = 0; i < 3; ++i) {
                        int n3 = cArray[i];
                        n3 -= 49889;
                        n3 -= 13701;
                        n3 -= 16200;
                        n3 ^= 0xA54B;
                        n3 += 13902;
                        n3 -= 48912;
                        n3 ^= 0xDA12;
                        n3 -= 3508;
                        n3 ^= 0xBF58;
                        n3 ^= 0xC5F9;
                        n3 += 17305;
                        n3 -= 10426;
                        n3 ^= 0xD31C;
                        cArray[i] = (char)(n3 -= 26142);
                    }
                    object5 = kotakbaz.rain.client.util.render.display.E.A()[2] = new String(cArray);
                }
                g = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = kotakbaz.rain.client.util.render.display.E.A()[3];
            if (object6 == null) {
                char[] cArray = "\uf471\uf47d\uf5b3\uf427\uf463\uf478\uf463\uf427\uf586\uf47b\uf463\uf5b3\uf42d\uf586\uf5d1\uf5c2\uf5c2\uf5a9\uf5ac\uf5af".toCharArray();
                for (int i = 0; i < 20; ++i) {
                    int n4 = cArray[i];
                    n4 ^= 0xD660;
                    n4 ^= 0x1672;
                    n4 -= 43554;
                    n4 += 13250;
                    n4 -= 33043;
                    n4 ^= 0xDD64;
                    n4 += 36406;
                    n4 -= 24071;
                    n4 -= 61338;
                    n4 ^= 0xADB;
                    n4 += 43612;
                    cArray[i] = (char)(n4 -= 54029);
                }
                object6 = kotakbaz.rain.client.util.render.display.E.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)g), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = h;
        if (h == null) {
            h = new Object[4];
            objectArray = h;
        }
        return objectArray;
    }

    public static void b() {
        H = new int[0xD958 ^ 0xD8C8];
        kotakbaz.rain.client.util.render.display.E.H[0xA45F ^ 0xA436] = 0x5F4A ^ 0xA436;
        kotakbaz.rain.client.util.render.display.E.H[0x89C5 ^ 0x884D] = 0xE56A ^ 0x884D;
        kotakbaz.rain.client.util.render.display.E.H[0x10DE8 ^ 0x10DE7] = 0x10D92 ^ 0x10DE7;
        kotakbaz.rain.client.util.render.display.E.H[0xC237 ^ 0xC2B8] = 0xC2EE ^ 0xC2B8;
        kotakbaz.rain.client.util.render.display.E.H[0x5E4E ^ 0x5E1A] = 0x5E7E ^ 0x5E1A;
        kotakbaz.rain.client.util.render.display.E.H[0xF841 ^ 0xF9CF] = 0x157F ^ 0xF9CF;
        kotakbaz.rain.client.util.render.display.E.H[0x9901 ^ 0x99BC] = 0xD181 ^ 0x99BC;
        kotakbaz.rain.client.util.render.display.E.H[0xACE8 ^ 0xAC1E] = 0xD04B ^ 0xAC1E;
        kotakbaz.rain.client.util.render.display.E.H[0x357D ^ 0x353C] = 0xFFFFCAFF ^ 0x353C;
        kotakbaz.rain.client.util.render.display.E.H[0x49D1 ^ 0x49C9] = 0xFFFFB60D ^ 0x49C9;
        kotakbaz.rain.client.util.render.display.E.H[0x12A3 ^ 0x12D2] = 0xFFFFED62 ^ 0x12D2;
        kotakbaz.rain.client.util.render.display.E.H[0x362A ^ 0x377F] = 0xB969 ^ 0x377F;
        kotakbaz.rain.client.util.render.display.E.H[0x765F ^ 0x7640] = 0x7615 ^ 0x7640;
        kotakbaz.rain.client.util.render.display.E.H[0xE66D ^ 0xE6A5] = 0x16FA ^ 0xE6A5;
        kotakbaz.rain.client.util.render.display.E.H[0x10E95 ^ 0x10E80] = 0x10E86 ^ 0x10E80;
        kotakbaz.rain.client.util.render.display.E.H[0x7E5 ^ 0x79F] = 0xFFFFF836 ^ 0x79F;
        kotakbaz.rain.client.util.render.display.E.H[0x108D3 ^ 0x1085D] = 0xFFFEF782 ^ 0x1085D;
        kotakbaz.rain.client.util.render.display.E.H[0x37A1 ^ 0x37BA] = 0x37DB ^ 0x37BA;
        kotakbaz.rain.client.util.render.display.E.H[0x9089 ^ 0x9021] = 0xFFFF6FF9 ^ 0x9021;
        kotakbaz.rain.client.util.render.display.E.H[0xA32C ^ 0xA315] = 0xA36D ^ 0xA315;
        kotakbaz.rain.client.util.render.display.E.H[0x870F ^ 0x8770] = 0x8752 ^ 0x8770;
        kotakbaz.rain.client.util.render.display.E.H[0x9E54 ^ 0x9F76] = 0xD46F ^ 0x9F76;
        kotakbaz.rain.client.util.render.display.E.H[0x1CC0 ^ 0x1D4C] = 0x4302 ^ 0x1D4C;
        kotakbaz.rain.client.util.render.display.E.H[0x105F9 ^ 0x105DC] = 0xFFFEFA73 ^ 0x105DC;
        kotakbaz.rain.client.util.render.display.E.H[0xF9E4 ^ 0xF990] = 0xFFFF0675 ^ 0xF990;
        kotakbaz.rain.client.util.render.display.E.H[0x256D ^ 0x240D] = 0xEBE4 ^ 0x240D;
        kotakbaz.rain.client.util.render.display.E.H[0xBA04 ^ 0xBA31] = 0xFFFF45D3 ^ 0xBA31;
        kotakbaz.rain.client.util.render.display.E.H[0x1028A ^ 0x102C6] = 0xFFFEFD7D ^ 0x102C6;
        kotakbaz.rain.client.util.render.display.E.H[0x32DB ^ 0x32EB] = 0x3284 ^ 0x32EB;
        kotakbaz.rain.client.util.render.display.E.H[0x105A6 ^ 0x104BD] = 0x17693 ^ 0x104BD;
        kotakbaz.rain.client.util.render.display.E.H[0x45D9 ^ 0x45BB] = 0x2E0B ^ 0x45BB;
        kotakbaz.rain.client.util.render.display.E.H[0x10E74 ^ 0x10EF0] = 0xFFFEF17B ^ 0x10EF0;
        kotakbaz.rain.client.util.render.display.E.H[0xB465 ^ 0xB45D] = 0xFFFF4B98 ^ 0xB45D;
        kotakbaz.rain.client.util.render.display.E.H[0xDA2 ^ 0xDF3] = 0xD3E ^ 0xDF3;
        kotakbaz.rain.client.util.render.display.E.H[0x7EEE ^ 0x7EAB] = 0xFFFF812D ^ 0x7EAB;
        kotakbaz.rain.client.util.render.display.E.H[0x19FA ^ 0x18E3] = 0x240B ^ 0x18E3;
        kotakbaz.rain.client.util.render.display.E.H[0xCE8A ^ 0xCF0E] = 0xCF1C ^ 0xCF0E;
        kotakbaz.rain.client.util.render.display.E.H[0x373 ^ 0x3B0] = 0x68E4 ^ 0x3B0;
        kotakbaz.rain.client.util.render.display.E.H[0x3279 ^ 0x3295] = 0x614F ^ 0x3295;
        kotakbaz.rain.client.util.render.display.E.H[0xEFE2 ^ 0xEEDC] = 0xD64B ^ 0xEEDC;
        kotakbaz.rain.client.util.render.display.E.H[0x2A32 ^ 0x2A5F] = 0x6250 ^ 0x2A5F;
        kotakbaz.rain.client.util.render.display.E.H[0xA441 ^ 0xA456] = 0xFFFF5BA0 ^ 0xA456;
        kotakbaz.rain.client.util.render.display.E.H[0x1086F ^ 0x10948] = 0x1AA84 ^ 0x10948;
        kotakbaz.rain.client.util.render.display.E.H[0x556E ^ 0x55E5] = 0xFFFFAA7A ^ 0x55E5;
        kotakbaz.rain.client.util.render.display.E.H[0xE7F3 ^ 0xE68B] = 0xF99 ^ 0xE68B;
        kotakbaz.rain.client.util.render.display.E.H[0x54 ^ 0x130] = 0xF39A ^ 0x130;
        kotakbaz.rain.client.util.render.display.E.H[0x821D ^ 0x8309] = 0xAB42 ^ 0x8309;
        kotakbaz.rain.client.util.render.display.E.H[0xE358 ^ 0xE208] = 0xAF6A ^ 0xE208;
        kotakbaz.rain.client.util.render.display.E.H[0xCDA4 ^ 0xCDF9] = 0xCDF9 ^ 0xCDF9;
        kotakbaz.rain.client.util.render.display.E.H[0x609F ^ 0x6013] = 0xFFFF9FBB ^ 0x6013;
        kotakbaz.rain.client.util.render.display.E.H[0xFC35 ^ 0xFC51] = 0x3F33 ^ 0xFC51;
        kotakbaz.rain.client.util.render.display.E.H[0xD5F7 ^ 0xD5D0] = 0xD5DD ^ 0xD5D0;
        kotakbaz.rain.client.util.render.display.E.H[0x3825 ^ 0x3934] = 0x7636 ^ 0x3934;
        kotakbaz.rain.client.util.render.display.E.H[0xF110 ^ 0xF1DB] = 0x187 ^ 0xF1DB;
        kotakbaz.rain.client.util.render.display.E.H[0x5B24 ^ 0x5A2E] = 0x954C ^ 0x5A2E;
        kotakbaz.rain.client.util.render.display.E.H[0x1A97 ^ 0x1B82] = 0xFFFFCC7B ^ 0x1B82;
        kotakbaz.rain.client.util.render.display.E.H[0x3F84 ^ 0x3FAF] = 0xFFFFC034 ^ 0x3FAF;
        kotakbaz.rain.client.util.render.display.E.H[0xF2 ^ 0xF7] = 0xFFFFFF47 ^ 0xF7;
        kotakbaz.rain.client.util.render.display.E.H[0x3ECF ^ 0x3E9F] = 0x3EC3 ^ 0x3E9F;
        kotakbaz.rain.client.util.render.display.E.H[0xA667 ^ 0xA674] = 0xFFFF59A8 ^ 0xA674;
        kotakbaz.rain.client.util.render.display.E.H[0x315D ^ 0x3040] = 0xFFFFBDF5 ^ 0x3040;
        kotakbaz.rain.client.util.render.display.E.H[0x3612 ^ 0x3756] = 0x3DDF ^ 0x3756;
        kotakbaz.rain.client.util.render.display.E.H[0xC608 ^ 0xC6EC] = 0xEBEE ^ 0xC6EC;
        kotakbaz.rain.client.util.render.display.E.H[0x317E ^ 0x31B9] = 0x3DFD ^ 0x31B9;
        kotakbaz.rain.client.util.render.display.E.H[0x3D23 ^ 0x3DBC] = 0xFFFFC269 ^ 0x3DBC;
        kotakbaz.rain.client.util.render.display.E.H[0xA40D ^ 0xA56E] = 0x57DE ^ 0xA56E;
        kotakbaz.rain.client.util.render.display.E.H[0x10594 ^ 0x104FC] = 0x1D92C ^ 0x104FC;
        kotakbaz.rain.client.util.render.display.E.H[0xAFAC ^ 0xAF42] = 0xFFFF034A ^ 0xAF42;
        kotakbaz.rain.client.util.render.display.E.H[0x3D5A ^ 0x3DFF] = 0x3DA1 ^ 0x3DFF;
        kotakbaz.rain.client.util.render.display.E.H[0x5B06 ^ 0x5B71] = 0x5B7D ^ 0x5B71;
        kotakbaz.rain.client.util.render.display.E.H[0x8457 ^ 0x8474] = 0x8447 ^ 0x8474;
        kotakbaz.rain.client.util.render.display.E.H[0xFA36 ^ 0xFAAD] = 0xFAC6 ^ 0xFAAD;
        kotakbaz.rain.client.util.render.display.E.H[0x2DE1 ^ 0x2D1B] = 0xFFFF87E3 ^ 0x2D1B;
        kotakbaz.rain.client.util.render.display.E.H[0xCBEF ^ 0xCAA4] = 0xBE95 ^ 0xCAA4;
        kotakbaz.rain.client.util.render.display.E.H[0x208 ^ 0x323] = 0x9C94 ^ 0x323;
        kotakbaz.rain.client.util.render.display.E.H[0xC1EB ^ 0xC1EC] = 0xFFFF3E42 ^ 0xC1EC;
        kotakbaz.rain.client.util.render.display.E.H[0xF326 ^ 0xF387] = 0xF3DE ^ 0xF387;
        kotakbaz.rain.client.util.render.display.E.H[0xA790 ^ 0xA7D0] = 0xA787 ^ 0xA7D0;
        kotakbaz.rain.client.util.render.display.E.H[0xDE7C ^ 0xDE66] = 0xFFFF2184 ^ 0xDE66;
        kotakbaz.rain.client.util.render.display.E.H[0x7E77 ^ 0x7E2C] = 0x7E2C ^ 0x7E2C;
        kotakbaz.rain.client.util.render.display.E.H[0x2E58 ^ 0x2F5E] = 0x1289A ^ 0x2F5E;
        kotakbaz.rain.client.util.render.display.E.H[0x641 ^ 0x65F] = 0xFFFFF9AE ^ 0x65F;
        kotakbaz.rain.client.util.render.display.E.H[0xBD09 ^ 0xBC70] = 0xFFFFAAEF ^ 0xBC70;
        kotakbaz.rain.client.util.render.display.E.H[0x25D8 ^ 0x2459] = 0x2459 ^ 0x2459;
        kotakbaz.rain.client.util.render.display.E.H[0x935E ^ 0x9315] = 0xFFFF6CE1 ^ 0x9315;
        kotakbaz.rain.client.util.render.display.E.H[0x351A ^ 0x35A6] = 0x7D9E ^ 0x35A6;
        kotakbaz.rain.client.util.render.display.E.H[0x3FCB ^ 0x3EB0] = 0x52AF ^ 0x3EB0;
        kotakbaz.rain.client.util.render.display.E.H[0xE9FF ^ 0xE8E7] = 0xD428 ^ 0xE8E7;
        kotakbaz.rain.client.util.render.display.E.H[0xBF5 ^ 0xAE7] = 0x45FE ^ 0xAE7;
        kotakbaz.rain.client.util.render.display.E.H[0xC8D1 ^ 0xC9EB] = 0x1BE2 ^ 0xC9EB;
        kotakbaz.rain.client.util.render.display.E.H[0xEC5A ^ 0xEC32] = 0x4A9 ^ 0xEC32;
        kotakbaz.rain.client.util.render.display.E.H[0x31D4 ^ 0x313C] = 0x58A6 ^ 0x313C;
        kotakbaz.rain.client.util.render.display.E.H[0x6853 ^ 0x6861] = 0x684A ^ 0x6861;
        kotakbaz.rain.client.util.render.display.E.H[0xC319 ^ 0xC25A] = 0xC8CA ^ 0xC25A;
        kotakbaz.rain.client.util.render.display.E.H[0xA56A ^ 0xA5DA] = 0xA5E1 ^ 0xA5DA;
        kotakbaz.rain.client.util.render.display.E.H[0x4A8F ^ 0x4AAF] = 0xFFFFB53E ^ 0x4AAF;
        kotakbaz.rain.client.util.render.display.E.H[0x9E53 ^ 0x9F3C] = 0xC3D2 ^ 0x9F3C;
        kotakbaz.rain.client.util.render.display.E.H[0xC001 ^ 0xC157] = 0x4F3C ^ 0xC157;
        kotakbaz.rain.client.util.render.display.E.H[0xFA6 ^ 0xFD0] = 0xFC7 ^ 0xFD0;
        kotakbaz.rain.client.util.render.display.E.H[0xB919 ^ 0xB86D] = 0xC4F4 ^ 0xB86D;
        kotakbaz.rain.client.util.render.display.E.H[0xD01A ^ 0xD130] = 0x72F6 ^ 0xD130;
        kotakbaz.rain.client.util.render.display.E.H[0x10150 ^ 0x10012] = 0x1A0DA ^ 0x10012;
        kotakbaz.rain.client.util.render.display.E.H[0x3D47 ^ 0x3D24] = 0x9D85 ^ 0x3D24;
        kotakbaz.rain.client.util.render.display.E.H[0x83F8 ^ 0x835B] = 0xFFFF7CE7 ^ 0x835B;
        kotakbaz.rain.client.util.render.display.E.H[0x95E6 ^ 0x959D] = 0xFFFF6A6F ^ 0x959D;
        kotakbaz.rain.client.util.render.display.E.H[0x5557 ^ 0x5576] = 0x5546 ^ 0x5576;
        kotakbaz.rain.client.util.render.display.E.H[0x1D99 ^ 0x1D74] = 0x4EA6 ^ 0x1D74;
        kotakbaz.rain.client.util.render.display.E.H[0xFB18 ^ 0xFBEC] = 0x87C7 ^ 0xFBEC;
        kotakbaz.rain.client.util.render.display.E.H[0x4BE8 ^ 0x4B2D] = 0x4769 ^ 0x4B2D;
        kotakbaz.rain.client.util.render.display.E.H[0xD61B ^ 0xD719] = 0x673 ^ 0xD719;
        kotakbaz.rain.client.util.render.display.E.H[0x981C ^ 0x989B] = 0xFFFF670D ^ 0x989B;
        kotakbaz.rain.client.util.render.display.E.H[0xADB2 ^ 0xAD19] = 0xAD62 ^ 0xAD19;
        kotakbaz.rain.client.util.render.display.E.H[0x7F77 ^ 0x7FD3] = 0xFFFF8041 ^ 0x7FD3;
        kotakbaz.rain.client.util.render.display.E.H[0x6903 ^ 0x692C] = 0x6963 ^ 0x692C;
        kotakbaz.rain.client.util.render.display.E.H[0x2A6C ^ 0x2AB2] = 0xFFFF1555 ^ 0x2AB2;
        kotakbaz.rain.client.util.render.display.E.H[0x8619 ^ 0x86D4] = 0x87DA ^ 0x86D4;
        kotakbaz.rain.client.util.render.display.E.H[0x4473 ^ 0x4498] = 0x2D02 ^ 0x4498;
        kotakbaz.rain.client.util.render.display.E.H[0x7D56 ^ 0x7C02] = 0xF269 ^ 0x7C02;
        kotakbaz.rain.client.util.render.display.E.H[0xFE24 ^ 0xFF4E] = 0x229E ^ 0xFF4E;
        kotakbaz.rain.client.util.render.display.E.H[0x89FE ^ 0x8897] = 0xFFFFAAA2 ^ 0x8897;
        kotakbaz.rain.client.util.render.display.E.H[0x10527 ^ 0x1059E] = 0x1059E ^ 0x1059E;
        kotakbaz.rain.client.util.render.display.E.H[0x3A88 ^ 0x3BFB] = 0x4760 ^ 0x3BFB;
        kotakbaz.rain.client.util.render.display.E.H[0xCC19 ^ 0xCCAD] = 0xCCAC ^ 0xCCAD;
        kotakbaz.rain.client.util.render.display.E.H[0xA6E6 ^ 0xA7A0] = 0xAD29 ^ 0xA7A0;
        kotakbaz.rain.client.util.render.display.E.H[0x3756 ^ 0x37F8] = 0xFFFFC846 ^ 0x37F8;
        kotakbaz.rain.client.util.render.display.E.H[0xC0E4 ^ 0xC1BD] = 0xFFFF2632 ^ 0xC1BD;
        kotakbaz.rain.client.util.render.display.E.H[0xF3D9 ^ 0xF2CF] = 0xDA84 ^ 0xF2CF;
        kotakbaz.rain.client.util.render.display.E.H[0x2EFB ^ 0x2E35] = 0xFFFFD087 ^ 0x2E35;
        kotakbaz.rain.client.util.render.display.E.H[0x6ECD ^ 0x6E3D] = 0xA951 ^ 0x6E3D;
        kotakbaz.rain.client.util.render.display.E.H[0x29AD ^ 0x295F] = 0xEE26 ^ 0x295F;
        kotakbaz.rain.client.util.render.display.E.H[0xF78D ^ 0xF72F] = 0xFFFF08D9 ^ 0xF72F;
        kotakbaz.rain.client.util.render.display.E.H[0x9AFD ^ 0x9A20] = 0x5A20 ^ 0x9A20;
        kotakbaz.rain.client.util.render.display.E.H[0x4972 ^ 0x4998] = 0xFFFFDFA9 ^ 0x4998;
        kotakbaz.rain.client.util.render.display.E.H[0x85A4 ^ 0x84EE] = 0xC97C ^ 0x84EE;
        kotakbaz.rain.client.util.render.display.E.H[0xF437 ^ 0xF468] = 0xF468 ^ 0xF468;
        kotakbaz.rain.client.util.render.display.E.H[0x990C ^ 0x988C] = 0x988C ^ 0x988C;
        kotakbaz.rain.client.util.render.display.E.H[0x4E7C ^ 0x4E38] = 0x4E03 ^ 0x4E38;
        kotakbaz.rain.client.util.render.display.E.H[0x757 ^ 0x737] = 0x737 ^ 0x737;
        kotakbaz.rain.client.util.render.display.E.H[0xADB6 ^ 0xAD3B] = 0xFFFF52A2 ^ 0xAD3B;
        kotakbaz.rain.client.util.render.display.E.H[0x7411 ^ 0x74B7] = 0x74C0 ^ 0x74B7;
        kotakbaz.rain.client.util.render.display.E.H[0x51C3 ^ 0x5045] = 0x42A7 ^ 0x5045;
        kotakbaz.rain.client.util.render.display.E.H[0x990A ^ 0x99A0] = 0xFFFF6665 ^ 0x99A0;
        kotakbaz.rain.client.util.render.display.E.H[0x7F5A ^ 0x7FCF] = 0xFFFF8049 ^ 0x7FCF;
        kotakbaz.rain.client.util.render.display.E.H[0x6D7D ^ 0x6D75] = 0x6D73 ^ 0x6D75;
        kotakbaz.rain.client.util.render.display.E.H[0x438C ^ 0x4284] = 0x8DE6 ^ 0x4284;
        kotakbaz.rain.client.util.render.display.E.H[0xAD9 ^ 0xA85] = 0xA84 ^ 0xA85;
        kotakbaz.rain.client.util.render.display.E.H[0xCC94 ^ 0xCC44] = 0x736C ^ 0xCC44;
        kotakbaz.rain.client.util.render.display.E.H[0x5755 ^ 0x57C2] = 0xFFFFA87F ^ 0x57C2;
        kotakbaz.rain.client.util.render.display.E.H[0xEE4C ^ 0xEF3A] = 0x93A3 ^ 0xEF3A;
        kotakbaz.rain.client.util.render.display.E.H[0x10522 ^ 0x10570] = 0x1050B ^ 0x10570;
        kotakbaz.rain.client.util.render.display.E.H[0x6739 ^ 0x660E] = 0xB406 ^ 0x660E;
        kotakbaz.rain.client.util.render.display.E.H[0x975 ^ 0x976] = 0xFFFFF608 ^ 0x976;
        kotakbaz.rain.client.util.render.display.E.H[0x753E ^ 0x7406] = 0xA60F ^ 0x7406;
        kotakbaz.rain.client.util.render.display.E.H[0x96B1 ^ 0x96A1] = 0x96B4 ^ 0x96A1;
        kotakbaz.rain.client.util.render.display.E.H[0xAA78 ^ 0xAB6F] = 0x97B7 ^ 0xAB6F;
        kotakbaz.rain.client.util.render.display.E.H[0xA5C4 ^ 0xA59A] = 0xA598 ^ 0xA59A;
        kotakbaz.rain.client.util.render.display.E.H[0x2656 ^ 0x268F] = 0xA4C7 ^ 0x268F;
        kotakbaz.rain.client.util.render.display.E.H[0x5DB6 ^ 0x5CE4] = 0x1186 ^ 0x5CE4;
        kotakbaz.rain.client.util.render.display.E.H[0x141C ^ 0x14BC] = 0x14AE ^ 0x14BC;
        kotakbaz.rain.client.util.render.display.E.H[0x1961 ^ 0x184F] = 0x87ED ^ 0x184F;
        kotakbaz.rain.client.util.render.display.E.H[0xEE60 ^ 0xEEC9] = 0xEEDA ^ 0xEEC9;
        kotakbaz.rain.client.util.render.display.E.H[0x10154 ^ 0x1004E] = 0x13C81 ^ 0x1004E;
        kotakbaz.rain.client.util.render.display.E.H[0x47F4 ^ 0x46C9] = 0xFFFF81CA ^ 0x46C9;
        kotakbaz.rain.client.util.render.display.E.H[0x5B96 ^ 0x5B31] = 0x5B38 ^ 0x5B31;
        kotakbaz.rain.client.util.render.display.E.H[0xD713 ^ 0xD64D] = 0x202B ^ 0xD64D;
        kotakbaz.rain.client.util.render.display.E.H[0xB76 ^ 0xA1B] = 0xFFFF1E8E ^ 0xA1B;
        kotakbaz.rain.client.util.render.display.E.H[0xEB7B ^ 0xEA2C] = 0xF247 ^ 0xEA2C;
        kotakbaz.rain.client.util.render.display.E.H[0x1023A ^ 0x103BD] = 0x1DB1A ^ 0x103BD;
        kotakbaz.rain.client.util.render.display.E.H[0x1C45 ^ 0x1C71] = 0x1C65 ^ 0x1C71;
        kotakbaz.rain.client.util.render.display.E.H[0xB6EB ^ 0xB6C2] = 0xFFFF4971 ^ 0xB6C2;
        kotakbaz.rain.client.util.render.display.E.H[0x5E18 ^ 0x5EE0] = 0xBC6 ^ 0x5EE0;
        kotakbaz.rain.client.util.render.display.E.H[0x5801 ^ 0x591F] = 0x2B39 ^ 0x591F;
        kotakbaz.rain.client.util.render.display.E.H[0x921C ^ 0x92E2] = 0xA98E ^ 0x92E2;
        kotakbaz.rain.client.util.render.display.E.H[0x5712 ^ 0x5631] = 0xB08E ^ 0x5631;
        kotakbaz.rain.client.util.render.display.E.H[0x4D5C ^ 0x4C3D] = 0xFFFF7C56 ^ 0x4C3D;
        kotakbaz.rain.client.util.render.display.E.H[0xE6ED ^ 0xE7AA] = 0xAA3D ^ 0xE7AA;
        kotakbaz.rain.client.util.render.display.E.H[0xBB06 ^ 0xBB3D] = 0xBB62 ^ 0xBB3D;
        kotakbaz.rain.client.util.render.display.E.H[0x6D98 ^ 0x6CB1] = 0xFFFF30BE ^ 0x6CB1;
        kotakbaz.rain.client.util.render.display.E.H[0x4707 ^ 0x460C] = 0x3FB7 ^ 0x460C;
        kotakbaz.rain.client.util.render.display.E.H[0xE46C ^ 0xE462] = 0xFFFF1BD7 ^ 0xE462;
        kotakbaz.rain.client.util.render.display.E.H[0xCD7D ^ 0xCC25] = 0xD458 ^ 0xCC25;
        kotakbaz.rain.client.util.render.display.E.H[0xE107 ^ 0xE077] = 0xBC9F ^ 0xE077;
        kotakbaz.rain.client.util.render.display.E.H[0xC53 ^ 0xD2F] = 0x612D ^ 0xD2F;
        kotakbaz.rain.client.util.render.display.E.H[0x1960 ^ 0x19E9] = 0x19C6 ^ 0x19E9;
        kotakbaz.rain.client.util.render.display.E.H[0x17BA ^ 0x169F] = 0xF078 ^ 0x169F;
        kotakbaz.rain.client.util.render.display.E.H[0xFF70 ^ 0xFE31] = 0x5EDE ^ 0xFE31;
        kotakbaz.rain.client.util.render.display.E.H[0x44D5 ^ 0x458A] = 0x8A7C ^ 0x458A;
        kotakbaz.rain.client.util.render.display.E.H[0x8CBE ^ 0x8D92] = 0x1230 ^ 0x8D92;
        kotakbaz.rain.client.util.render.display.E.H[0xC285 ^ 0xC213] = 0xFFFF3D2D ^ 0xC213;
        kotakbaz.rain.client.util.render.display.E.H[0xDEF7 ^ 0xDFF6] = 0xE83 ^ 0xDFF6;
        kotakbaz.rain.client.util.render.display.E.H[0x7B4A ^ 0x7A06] = 0xE25 ^ 0x7A06;
        kotakbaz.rain.client.util.render.display.E.H[0xA85B ^ 0xA828] = 0xA878 ^ 0xA828;
        kotakbaz.rain.client.util.render.display.E.H[0x59AE ^ 0x59AA] = 0xFFFFA615 ^ 0x59AA;
        kotakbaz.rain.client.util.render.display.E.H[0x78E3 ^ 0x7852] = 0x7877 ^ 0x7852;
        kotakbaz.rain.client.util.render.display.E.H[0xC15F ^ 0xC05F] = 0x1135 ^ 0xC05F;
        kotakbaz.rain.client.util.render.display.E.H[0x4442 ^ 0x4484] = 0xFFFFB71F ^ 0x4484;
        kotakbaz.rain.client.util.render.display.E.H[0xA74E ^ 0xA61F] = 0xEB3B ^ 0xA61F;
        kotakbaz.rain.client.util.render.display.E.H[0xF765 ^ 0xF6E7] = 0xF6E6 ^ 0xF6E7;
        kotakbaz.rain.client.util.render.display.E.H[0x5092 ^ 0x50DB] = 0xFFFFAF20 ^ 0x50DB;
        kotakbaz.rain.client.util.render.display.E.H[0xC37D ^ 0xC38E] = 0x4ED ^ 0xC38E;
        kotakbaz.rain.client.util.render.display.E.H[0xE56 ^ 0xE80] = 0xFFFFC621 ^ 0xE80;
        kotakbaz.rain.client.util.render.display.E.H[0x4B63 ^ 0x4A12] = 0xFFFFE947 ^ 0x4A12;
        kotakbaz.rain.client.util.render.display.E.H[0xF34 ^ 0xE39] = 0x77DE ^ 0xE39;
        kotakbaz.rain.client.util.render.display.E.H[0xADD6 ^ 0xADB0] = 0xA774 ^ 0xADB0;
        kotakbaz.rain.client.util.render.display.E.H[0x8106 ^ 0x8079] = 0x8079 ^ 0x8079;
        kotakbaz.rain.client.util.render.display.E.H[0x28CE ^ 0x289B] = 0x28CF ^ 0x289B;
        kotakbaz.rain.client.util.render.display.E.H[0x108FF ^ 0x108B5] = 0x108FC ^ 0x108B5;
        kotakbaz.rain.client.util.render.display.E.H[0xB0A1 ^ 0xB040] = 0x6A95 ^ 0xB040;
        kotakbaz.rain.client.util.render.display.E.H[0xF967 ^ 0xF869] = 0x81C1 ^ 0xF869;
        kotakbaz.rain.client.util.render.display.E.H[0xF85A ^ 0xF812] = 0xF850 ^ 0xF812;
        kotakbaz.rain.client.util.render.display.E.H[0x76E1 ^ 0x7694] = 0x76AF ^ 0x7694;
        kotakbaz.rain.client.util.render.display.E.H[0x8F17 ^ 0x8E38] = 0x4CED ^ 0x8E38;
        kotakbaz.rain.client.util.render.display.E.H[0x164C ^ 0x16DE] = 0xFFFFE969 ^ 0x16DE;
        kotakbaz.rain.client.util.render.display.E.H[0xB38C ^ 0xB2B3] = 0x1277 ^ 0xB2B3;
        kotakbaz.rain.client.util.render.display.E.H[0x7EDB ^ 0x7FB9] = 0xB050 ^ 0x7FB9;
        kotakbaz.rain.client.util.render.display.E.H[0xD282 ^ 0xD3B9] = 0xEB3E ^ 0xD3B9;
        kotakbaz.rain.client.util.render.display.E.H[0x83FC ^ 0x82D4] = 0x2112 ^ 0x82D4;
        kotakbaz.rain.client.util.render.display.E.H[0x833C ^ 0x82B6] = 0xDFDC ^ 0x82B6;
        kotakbaz.rain.client.util.render.display.E.H[0xD72B ^ 0xD645] = 0x3D48 ^ 0xD645;
        kotakbaz.rain.client.util.render.display.E.H[0xFC7F ^ 0xFCE1] = 0xFFFF037A ^ 0xFCE1;
        kotakbaz.rain.client.util.render.display.E.H[0x237B ^ 0x2369] = 0x2348 ^ 0x2369;
        kotakbaz.rain.client.util.render.display.E.H[0xD5E ^ 0xC6A] = 0x5F4E ^ 0xC6A;
        kotakbaz.rain.client.util.render.display.E.H[0xA3E3 ^ 0xA300] = 0x79D5 ^ 0xA300;
        kotakbaz.rain.client.util.render.display.E.H[0xDE42 ^ 0xDE7C] = 0xFFFF21CF ^ 0xDE7C;
        kotakbaz.rain.client.util.render.display.E.H[0x10D1F ^ 0x10D37] = 0xFFFEF28B ^ 0x10D37;
        kotakbaz.rain.client.util.render.display.E.H[0x1240 ^ 0x129A] = 0xFFFF6F15 ^ 0x129A;
        kotakbaz.rain.client.util.render.display.E.H[0xF5F4 ^ 0xF5E5] = 0xF580 ^ 0xF5E5;
        kotakbaz.rain.client.util.render.display.E.H[0xE292 ^ 0xE3A3] = 0xFFFFDEEF ^ 0xE3A3;
        kotakbaz.rain.client.util.render.display.E.H[0x9C8A ^ 0x9C51] = 0x1E19 ^ 0x9C51;
        kotakbaz.rain.client.util.render.display.E.H[0x5809 ^ 0x58CB] = 0xFFFFCC6D ^ 0x58CB;
        kotakbaz.rain.client.util.render.display.E.H[0x231D ^ 0x2363] = 0xFFFFDC85 ^ 0x2363;
        kotakbaz.rain.client.util.render.display.E.H[0x106F2 ^ 0x10670] = 0x10625 ^ 0x10670;
        kotakbaz.rain.client.util.render.display.E.H[0xBD71 ^ 0xBC2A] = 0x4A41 ^ 0xBC2A;
        kotakbaz.rain.client.util.render.display.E.H[0xD673 ^ 0xD72F] = 0x2149 ^ 0xD72F;
        kotakbaz.rain.client.util.render.display.E.H[0x538E ^ 0x52FB] = 0x2E07 ^ 0x52FB;
        kotakbaz.rain.client.util.render.display.E.H[0x4231 ^ 0x42A8] = 0x4239 ^ 0x42A8;
        kotakbaz.rain.client.util.render.display.E.H[0x1F0E ^ 0x1FBC] = 0x1FE4 ^ 0x1FBC;
        kotakbaz.rain.client.util.render.display.E.H[0xDFC8 ^ 0xDF04] = 0xDE04 ^ 0xDF04;
        kotakbaz.rain.client.util.render.display.E.H[0x9E0A ^ 0x9E1E] = 0x9E58 ^ 0x9E1E;
        kotakbaz.rain.client.util.render.display.E.H[0x4A67 ^ 0x4A3E] = 0x4A11 ^ 0x4A3E;
        kotakbaz.rain.client.util.render.display.E.H[0x7900 ^ 0x796F] = 0xFFFF860D ^ 0x796F;
        kotakbaz.rain.client.util.render.display.E.H[0x2A67 ^ 0x2A1F] = 0x2A3A ^ 0x2A1F;
        kotakbaz.rain.client.util.render.display.E.H[0x33B6 ^ 0x323B] = 0x74B ^ 0x323B;
        kotakbaz.rain.client.util.render.display.E.H[0xD6DB ^ 0xD6DA] = 0xD6CD ^ 0xD6DA;
        kotakbaz.rain.client.util.render.display.E.H[0xEF15 ^ 0xEFC4] = 0x50EA ^ 0xEFC4;
        kotakbaz.rain.client.util.render.display.E.H[0xDBA8 ^ 0xDB84] = 0xFFFF247E ^ 0xDB84;
        kotakbaz.rain.client.util.render.display.E.H[0xD288 ^ 0xD3C5] = 0xA7E3 ^ 0xD3C5;
        kotakbaz.rain.client.util.render.display.E.H[0xA1C1 ^ 0xA088] = 0xED29 ^ 0xA088;
        kotakbaz.rain.client.util.render.display.E.H[0x6AD1 ^ 0x6A11] = 0x14F ^ 0x6A11;
        kotakbaz.rain.client.util.render.display.E.H[0xCA6 ^ 0xD93] = 0xFFFFA14E ^ 0xD93;
        kotakbaz.rain.client.util.render.display.E.H[0x31F1 ^ 0x3169] = 0xFFFFCEC8 ^ 0x3169;
        kotakbaz.rain.client.util.render.display.E.H[0x6CA ^ 0x603] = 0xF65F ^ 0x603;
        kotakbaz.rain.client.util.render.display.E.H[0x8ECE ^ 0x8EAB] = 0x70A8 ^ 0x8EAB;
        kotakbaz.rain.client.util.render.display.E.H[0x3085 ^ 0x31A3] = 0xD715 ^ 0x31A3;
        kotakbaz.rain.client.util.render.display.E.H[0x21AE ^ 0x219F] = 0xFFFFDE05 ^ 0x219F;
        kotakbaz.rain.client.util.render.display.E.H[0xD433 ^ 0xD4EC] = 0x14EC ^ 0xD4EC;
        kotakbaz.rain.client.util.render.display.E.H[0x323E ^ 0x32BB] = 0xFFFFCD7C ^ 0x32BB;
        kotakbaz.rain.client.util.render.display.E.H[0x5930 ^ 0x59C5] = 0x25EF ^ 0x59C5;
        kotakbaz.rain.client.util.render.display.E.H[0xE5EF ^ 0xE5E6] = 0xE5D6 ^ 0xE5E6;
        kotakbaz.rain.client.util.render.display.E.H[0x430D ^ 0x434B] = 0x4360 ^ 0x434B;
        kotakbaz.rain.client.util.render.display.E.H[0x5756 ^ 0x5659] = 0x1954 ^ 0x5659;
        kotakbaz.rain.client.util.render.display.E.H[0xDE7 ^ 0xD8B] = 0x7054 ^ 0xD8B;
        kotakbaz.rain.client.util.render.display.E.H[0x216B ^ 0x21BF] = 0x16F9 ^ 0x21BF;
        kotakbaz.rain.client.util.render.display.E.H[0xADB7 ^ 0xAD40] = 0xD16A ^ 0xAD40;
        kotakbaz.rain.client.util.render.display.E.H[0x5B57 ^ 0x5ADE] = 0xA299 ^ 0x5ADE;
        kotakbaz.rain.client.util.render.display.E.H[0xA632 ^ 0xA688] = 0xE998 ^ 0xA688;
        kotakbaz.rain.client.util.render.display.E.H[0x4C15 ^ 0x4D29] = 0x75BE ^ 0x4D29;
        kotakbaz.rain.client.util.render.display.E.H[0x4B86 ^ 0x4ABF] = 0x98EF ^ 0x4ABF;
        kotakbaz.rain.client.util.render.display.E.H[0x69F ^ 0x682] = 0xFFFFF939 ^ 0x682;
        kotakbaz.rain.client.util.render.display.E.H[0x7126 ^ 0x71A6] = 0x71BE ^ 0x71A6;
        kotakbaz.rain.client.util.render.display.E.H[0xB019 ^ 0xB0FC] = 0x9DF5 ^ 0xB0FC;
        kotakbaz.rain.client.util.render.display.E.H[0x10E86 ^ 0x10E90] = 0x10E90 ^ 0x10E90;
        kotakbaz.rain.client.util.render.display.E.H[0xACF5 ^ 0xAC0A] = 0x7D60 ^ 0xAC0A;
        kotakbaz.rain.client.util.render.display.E.H[0xE7AD ^ 0xE744] = 0x8EDE ^ 0xE744;
        kotakbaz.rain.client.util.render.display.E.H[0x9AA8 ^ 0x9AEF] = 0x9AB2 ^ 0x9AEF;
        kotakbaz.rain.client.util.render.display.E.H[0xFCE ^ 0xFF4] = 0xFFFFF03B ^ 0xFF4;
        kotakbaz.rain.client.util.render.display.E.H[0x4295 ^ 0x4206] = 0xFFFFBD92 ^ 0x4206;
        kotakbaz.rain.client.util.render.display.E.H[0xF10E ^ 0xF011] = 0xBB03 ^ 0xF011;
        kotakbaz.rain.client.util.render.display.E.H[0x3D2A ^ 0x3D0E] = 0xFFFFC252 ^ 0x3D0E;
        kotakbaz.rain.client.util.render.display.E.H[0x3E54 ^ 0x3F38] = 0xD435 ^ 0x3F38;
        kotakbaz.rain.client.util.render.display.E.H[0xE748 ^ 0xE729] = 0xE605 ^ 0xE729;
        kotakbaz.rain.client.util.render.display.E.H[0xA9EE ^ 0xA966] = 0xFFFF56FF ^ 0xA966;
        kotakbaz.rain.client.util.render.display.E.H[0xD342 ^ 0xD37F] = 0xD367 ^ 0xD37F;
        kotakbaz.rain.client.util.render.display.E.H[0x2FA ^ 0x24F] = 0x24D ^ 0x24F;
        kotakbaz.rain.client.util.render.display.E.H[0xE5B8 ^ 0xE58F] = 0xE58E ^ 0xE58F;
        kotakbaz.rain.client.util.render.display.E.H[0xFFAE ^ 0xFF76] = 0x7D33 ^ 0xFF76;
        kotakbaz.rain.client.util.render.display.E.H[0xE74C ^ 0xE65C] = 0xA945 ^ 0xE65C;
        kotakbaz.rain.client.util.render.display.E.H[0xA93E ^ 0xA9FF] = 0xC2AB ^ 0xA9FF;
        kotakbaz.rain.client.util.render.display.E.H[0x4797 ^ 0x468B] = 0x34AD ^ 0x468B;
        kotakbaz.rain.client.util.render.display.E.H[0x38AE ^ 0x383E] = 0x38F2 ^ 0x383E;
        kotakbaz.rain.client.util.render.display.E.H[0x7295 ^ 0x73C8] = 0x85D0 ^ 0x73C8;
        kotakbaz.rain.client.util.render.display.E.H[0x5B29 ^ 0x5A4C] = 0xA8ED ^ 0x5A4C;
        kotakbaz.rain.client.util.render.display.E.H[0xEFAE ^ 0xEF5F] = 0x283C ^ 0xEF5F;
        kotakbaz.rain.client.util.render.display.E.H[0xDE8E ^ 0xDE77] = 0x8B55 ^ 0xDE77;
        kotakbaz.rain.client.util.render.display.E.H[0x8A0 ^ 0x83A] = 0xFFFFF7C0 ^ 0x83A;
        kotakbaz.rain.client.util.render.display.E.H[0x6B29 ^ 0x6BBD] = 0x6BAF ^ 0x6BBD;
        kotakbaz.rain.client.util.render.display.E.H[0x65B9 ^ 0x65D7] = 0x65D7 ^ 0x65D7;
        kotakbaz.rain.client.util.render.display.E.H[0xFF6 ^ 0xFF6] = 0xFFFFF07D ^ 0xFF6;
        kotakbaz.rain.client.util.render.display.E.H[0x48E ^ 0x50B] = 0xA4A ^ 0x50B;
        kotakbaz.rain.client.util.render.display.E.H[0x71A1 ^ 0x71F9] = 0xFFFF8E3B ^ 0x71F9;
        kotakbaz.rain.client.util.render.display.E.H[0x725 ^ 0x793] = 0x793 ^ 0x793;
        kotakbaz.rain.client.util.render.display.E.H[0x41A ^ 0x4E6] = 0x4E6 ^ 0x4E6;
        kotakbaz.rain.client.util.render.display.E.H[0xB4C0 ^ 0xB46C] = 0xB43F ^ 0xB46C;
        kotakbaz.rain.client.util.render.display.E.H[0x1C07 ^ 0x1D26] = 0x5611 ^ 0x1D26;
        kotakbaz.rain.client.util.render.display.E.H[0xF16A ^ 0xF05C] = 0xA378 ^ 0xF05C;
        kotakbaz.rain.client.util.render.display.E.H[0x9015 ^ 0x902A] = 0x9034 ^ 0x902A;
        kotakbaz.rain.client.util.render.display.E.H[0x2E9D ^ 0x2F9A] = 0xE0E6 ^ 0x2F9A;
        kotakbaz.rain.client.util.render.display.E.H[0x882F ^ 0x8894] = 0xC794 ^ 0x8894;
        kotakbaz.rain.client.util.render.display.E.H[0x10D4D ^ 0x10C5E] = 0x1241A ^ 0x10C5E;
        kotakbaz.rain.client.util.render.display.E.H[0x20ED ^ 0x2055] = 0x2054 ^ 0x2055;
        kotakbaz.rain.client.util.render.display.E.H[0x3CE0 ^ 0x3DAF] = 0x70D1 ^ 0x3DAF;
        kotakbaz.rain.client.util.render.display.E.H[0x15B9 ^ 0x14B5] = 0x6D1D ^ 0x14B5;
        kotakbaz.rain.client.util.render.display.E.H[0xCB23 ^ 0xCB3F] = 0xFFFF34D3 ^ 0xCB3F;
        kotakbaz.rain.client.util.render.display.E.H[0xF2C6 ^ 0xF20C] = 0x200 ^ 0xF20C;
        kotakbaz.rain.client.util.render.display.E.H[0xCFA1 ^ 0xCF5A] = 0x9A78 ^ 0xCF5A;
        kotakbaz.rain.client.util.render.display.E.H[0x1631 ^ 0x174B] = 0xFE59 ^ 0x174B;
        kotakbaz.rain.client.util.render.display.E.H[0x6BF4 ^ 0x6BED] = 0x6BC7 ^ 0x6BED;
        kotakbaz.rain.client.util.render.display.E.H[0x2B ^ 0x17] = 0x65 ^ 0x17;
        kotakbaz.rain.client.util.render.display.E.H[0xF28C ^ 0xF271] = 0xC93D ^ 0xF271;
        kotakbaz.rain.client.util.render.display.E.H[0xF95F ^ 0xF979] = 0xF913 ^ 0xF979;
        kotakbaz.rain.client.util.render.display.E.H[0xC29F ^ 0xC3AD] = 0x17C ^ 0xC3AD;
        kotakbaz.rain.client.util.render.display.E.H[0x3C9A ^ 0x3CCD] = 0x3CDC ^ 0x3CCD;
        kotakbaz.rain.client.util.render.display.E.H[0x865E ^ 0x877A] = 0x61CC ^ 0x877A;
        kotakbaz.rain.client.util.render.display.E.H[0x535B ^ 0x53E8] = 0xFFFFAC6B ^ 0x53E8;
        kotakbaz.rain.client.util.render.display.E.H[0xDCFC ^ 0xDDCC] = 0x1F1D ^ 0xDDCC;
        kotakbaz.rain.client.util.render.display.E.H[0x10B5B ^ 0x10B14] = 0xFFFEF4EB ^ 0x10B14;
        kotakbaz.rain.client.util.render.display.E.H[0x10341 ^ 0x10303] = 0xFFFEFCF8 ^ 0x10303;
        kotakbaz.rain.client.util.render.display.E.H[0x7D30 ^ 0x7DE7] = 0x4AA6 ^ 0x7DE7;
        kotakbaz.rain.client.util.render.display.E.H[0x8650 ^ 0x867D] = 0x86EA ^ 0x867D;
        kotakbaz.rain.client.util.render.display.E.H[0x2390 ^ 0x22E7] = 0xCBEE ^ 0x22E7;
        kotakbaz.rain.client.util.render.display.E.H[0x67EB ^ 0x6780] = 0x76F ^ 0x6780;
        kotakbaz.rain.client.util.render.display.E.H[0x6F04 ^ 0x6F5E] = 0x6F5D ^ 0x6F5E;
        kotakbaz.rain.client.util.render.display.E.H[0xCE03 ^ 0xCF65] = 0x3DCF ^ 0xCF65;
        kotakbaz.rain.client.util.render.display.E.H[0x644B ^ 0x6535] = 0x937 ^ 0x6535;
        kotakbaz.rain.client.util.render.display.E.H[0xAD55 ^ 0xAD87] = 0x12E4 ^ 0xAD87;
        kotakbaz.rain.client.util.render.display.E.H[0x9B03 ^ 0x9BAC] = 0xFFFF6455 ^ 0x9BAC;
        kotakbaz.rain.client.util.render.display.E.H[0x82F4 ^ 0x8377] = 0x8377 ^ 0x8377;
        kotakbaz.rain.client.util.render.display.E.H[0x79F8 ^ 0x797E] = 0xFFFF86DA ^ 0x797E;
        kotakbaz.rain.client.util.render.display.E.H[0x16F3 ^ 0x1615] = 0x3B21 ^ 0x1615;
        kotakbaz.rain.client.util.render.display.E.H[0x10AED ^ 0x10A0A] = 0x12703 ^ 0x10A0A;
        kotakbaz.rain.client.util.render.display.E.H[0x108B ^ 0x1086] = 0xFFFFEF4F ^ 0x1086;
        kotakbaz.rain.client.util.render.display.E.H[0xE207 ^ 0xE2AA] = 0xE282 ^ 0xE2AA;
        kotakbaz.rain.client.util.render.display.E.H[0xF422 ^ 0xF4F1] = 0x4BDF ^ 0xF4F1;
        kotakbaz.rain.client.util.render.display.E.H[0x4077 ^ 0x4095] = 0x9A42 ^ 0x4095;
        kotakbaz.rain.client.util.render.display.E.H[0x37BC ^ 0x37B0] = 0x37DE ^ 0x37B0;
        kotakbaz.rain.client.util.render.display.E.H[0x2FA5 ^ 0x2FE8] = 0x2FA1 ^ 0x2FE8;
        kotakbaz.rain.client.util.render.display.E.H[0x7AC5 ^ 0x7AF6] = 0xFFFF8518 ^ 0x7AF6;
        kotakbaz.rain.client.util.render.display.E.H[0x4149 ^ 0x41C3] = 0x41EA ^ 0x41C3;
        kotakbaz.rain.client.util.render.display.E.H[0xDA84 ^ 0xDA15] = 0xFFFF2588 ^ 0xDA15;
        kotakbaz.rain.client.util.render.display.E.H[0xDF65 ^ 0xDFD2] = 0xDFD3 ^ 0xDFD2;
        kotakbaz.rain.client.util.render.display.E.H[0xED44 ^ 0xEC36] = 0xB0DE ^ 0xEC36;
        kotakbaz.rain.client.util.render.display.E.H[0x3493 ^ 0x340F] = 0xFFFFCB71 ^ 0x340F;
        kotakbaz.rain.client.util.render.display.E.H[0x91EC ^ 0x91BA] = 0x91AD ^ 0x91BA;
        kotakbaz.rain.client.util.render.display.E.H[0xC1ED ^ 0xC0AD] = 0x6065 ^ 0xC0AD;
        kotakbaz.rain.client.util.render.display.E.H[0x31C1 ^ 0x31B3] = 0xFFFFCE58 ^ 0x31B3;
        kotakbaz.rain.client.util.render.display.E.H[0x8E5A ^ 0x8E14] = 0x8E72 ^ 0x8E14;
        kotakbaz.rain.client.util.render.display.E.H[0xE46E ^ 0xE55D] = 0xB677 ^ 0xE55D;
        kotakbaz.rain.client.util.render.display.E.H[0x4DFB ^ 0x4DFD] = 0x4D9E ^ 0x4DFD;
        kotakbaz.rain.client.util.render.display.E.H[0xCA0B ^ 0xCA72] = 0xFFFF35FD ^ 0xCA72;
        kotakbaz.rain.client.util.render.display.E.H[0x7C17 ^ 0x7C54] = 0x7C14 ^ 0x7C54;
        kotakbaz.rain.client.util.render.display.E.H[0xCE5E ^ 0xCE23] = 0xCE59 ^ 0xCE23;
        kotakbaz.rain.client.util.render.display.E.H[0xFAC8 ^ 0xFB92] = 0xE3EF ^ 0xFB92;
        kotakbaz.rain.client.util.render.display.E.H[0x684E ^ 0x694A] = 0x16E8E ^ 0x694A;
        kotakbaz.rain.client.util.render.display.E.H[0xC135 ^ 0xC117] = 0xFFFF3E88 ^ 0xC117;
        kotakbaz.rain.client.util.render.display.E.H[0x458D ^ 0x4586] = 0x45AB ^ 0x4586;
        kotakbaz.rain.client.util.render.display.E.H[0xF004 ^ 0xF157] = 0x7F3B ^ 0xF157;
        kotakbaz.rain.client.util.render.display.E.H[0x9018 ^ 0x90D7] = 0x91D9 ^ 0x90D7;
        kotakbaz.rain.client.util.render.display.E.H[0xF70D ^ 0xF723] = 0xF70B ^ 0xF723;
        kotakbaz.rain.client.util.render.display.E.H[0xA779 ^ 0xA7A5] = 0x67A7 ^ 0xA7A5;
        kotakbaz.rain.client.util.render.display.E.H[0xFF77 ^ 0xFFC9] = 0xFFFF482E ^ 0xFFC9;
        kotakbaz.rain.client.util.render.display.E.H[0x99FA ^ 0x98DA] = 0xD3C3 ^ 0x98DA;
        kotakbaz.rain.client.util.render.display.E.H[0x659F ^ 0x65EF] = 0x65C1 ^ 0x65EF;
        kotakbaz.rain.client.util.render.display.E.H[0xF0FD ^ 0xF097] = 0xA48A ^ 0xF097;
        kotakbaz.rain.client.util.render.display.E.H[0x9113 ^ 0x9174] = 0x3442 ^ 0x9174;
        kotakbaz.rain.client.util.render.display.E.H[0x1E1B ^ 0x1E98] = 0x1EFF ^ 0x1E98;
        kotakbaz.rain.client.util.render.display.E.H[0xE443 ^ 0xE546] = 0x1E2FD ^ 0xE546;
        kotakbaz.rain.client.util.render.display.E.H[0x1377 ^ 0x13EA] = 0xFFFFEC11 ^ 0x13EA;
        kotakbaz.rain.client.util.render.display.E.H[0x1877 ^ 0x19F8] = 0x7C2A ^ 0x19F8;
        kotakbaz.rain.client.util.render.display.E.H[0x9496 ^ 0x9417] = 0x9406 ^ 0x9417;
        kotakbaz.rain.client.util.render.display.E.H[0x10635 ^ 0x106E0] = 0x131A1 ^ 0x106E0;
        kotakbaz.rain.client.util.render.display.E.H[0xB72F ^ 0xB719] = 0xB75A ^ 0xB719;
        kotakbaz.rain.client.util.render.display.E.H[0x5E4 ^ 0x55B] = 0x4D66 ^ 0x55B;
        kotakbaz.rain.client.util.render.display.E.H[0x107B3 ^ 0x106B0] = 0x16C ^ 0x106B0;
        kotakbaz.rain.client.util.render.display.E.H[0x10A6A ^ 0x10A16] = 0xFFFEF5BE ^ 0x10A16;
        kotakbaz.rain.client.util.render.display.E.H[0xE5B0 ^ 0xE43B] = 0x88F7 ^ 0xE43B;
        kotakbaz.rain.client.util.render.display.E.H[0xEBE3 ^ 0xEAEA] = 0xFFFFDA15 ^ 0xEAEA;
        kotakbaz.rain.client.util.render.display.E.H[0x4B50 ^ 0x4A37] = 0x97E4 ^ 0x4A37;
        kotakbaz.rain.client.util.render.display.E.H[0xB7EB ^ 0xB70B] = 0x6DD2 ^ 0xB70B;
        kotakbaz.rain.client.util.render.display.E.H[0x4C46 ^ 0x4CA9] = 0x1F7B ^ 0x4CA9;
        kotakbaz.rain.client.util.render.display.E.H[0x7620 ^ 0x776E] = 0x34D ^ 0x776E;
        kotakbaz.rain.client.util.render.display.E.H[0xE8F4 ^ 0xE8FE] = 0xFFFF1700 ^ 0xE8FE;
        kotakbaz.rain.client.util.render.display.E.H[0xA151 ^ 0xA02C] = 0xFFFF33A1 ^ 0xA02C;
        kotakbaz.rain.client.util.render.display.E.H[0xFAE3 ^ 0xFAE1] = 0xFFFF0566 ^ 0xFAE1;
        kotakbaz.rain.client.util.render.display.E.H[0xE395 ^ 0xE3C6] = 0xE3F8 ^ 0xE3C6;
        kotakbaz.rain.client.util.render.display.E.H[0x68FF ^ 0x69D2] = 0xFFFF09A7 ^ 0x69D2;
        kotakbaz.rain.client.util.render.display.E.H[0xE67B ^ 0xE710] = 0xC0C ^ 0xE710;
        kotakbaz.rain.client.util.render.display.E.H[0x10120 ^ 0x101E4] = 0x10DA9 ^ 0x101E4;
        kotakbaz.rain.client.util.render.display.E.H[0x4B2F ^ 0x4A67] = 0x7F5 ^ 0x4A67;
        kotakbaz.rain.client.util.render.display.E.H[0xE57D ^ 0xE557] = 0xE52B ^ 0xE557;
        kotakbaz.rain.client.util.render.display.E.H[0x106AA ^ 0x107EF] = 0xFFFEF28E ^ 0x107EF;
    }
}

