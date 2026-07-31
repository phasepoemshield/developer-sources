/*
 * Decompiled with CFR 0.152.
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
import kotakbaz.rain.client.extensions.b;
import kotakbaz.rain.client.util.color.QuadColor;
import kotakbaz.rain.client.util.render.display.B;
import kotakbaz.rain.client.util.render.display.KawaseRenderer;
import kotakbaz.rain.client.util.render.display.TextureRectRenderer;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.gl.Framebuffer;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector4f;
import org.joml.Vector4fc;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\u0018\u0000 <2\u00020\u0001:\u0001<B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\r\u0010\u000eJ-\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f\u00a2\u0006\u0004\b\r\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0018\u00a2\u0006\u0004\b\u0016\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0014\u00a2\u0006\u0004\b\u001a\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0014\u00a2\u0006\u0004\b\u001e\u0010\u0017J\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\u001f\u0010\u000eJU\u0010%\u001a\u00020$2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\f\u00a2\u0006\u0004\b%\u0010&J-\u0010%\u001a\u00020$2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0014\u00a2\u0006\u0004\b%\u0010'J5\u0010%\u001a\u00020$2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\b%\u0010(JE\u0010%\u001a\u00020$2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u0014\u00a2\u0006\u0004\b%\u0010)JE\u0010%\u001a\u00020$2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0014\u00a2\u0006\u0004\b%\u0010*JE\u0010%\u001a\u00020$2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0014\u00a2\u0006\u0004\b%\u0010+JU\u0010%\u001a\u00020$2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\f\u00a2\u0006\u0004\b%\u0010,JU\u0010-\u001a\u00020$2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\f\u00a2\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0003\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u00100R\u0016\u00101\u001a\u00020\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b9\u00108R\u0016\u0010:\u001a\u00020\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b:\u0010;\u00a8\u0006="}, d2={"Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;", "", "Lkotakbaz/rain/client/util/render/display/TextureRectRenderer;", "textureRect", "Lkotakbaz/rain/client/util/render/display/KawaseRenderer;", "kawase", "<init>", "(Lkotakbaz/rain/client/util/render/display/TextureRectRenderer;Lkotakbaz/rain/client/util/render/display/KawaseRenderer;)V", "Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "pipeline", "priority", "(Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;", "Ljava/awt/Color;", "color", "(Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;", "c1", "c2", "c3", "c4", "(Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;", "", "radius", "round", "(F)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;", "Lorg/joml/Vector4f;", "(Lorg/joml/Vector4f;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;", "mix", "width", "border", "(FLjava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;", "borderWidth", "borderColor", "x", "y", "height", "Lkotakbaz/rain/client/util/color/QuadColor;", "", "draw", "(FFFFLorg/joml/Vector4f;Lkotakbaz/rain/client/util/color/QuadColor;FFLjava/awt/Color;)V", "(FFFF)V", "(FFFFF)V", "(FFFFLorg/joml/Vector4f;Lkotakbaz/rain/client/util/color/QuadColor;F)V", "(FFFFFLjava/awt/Color;F)V", "(FFFFLorg/joml/Vector4f;Ljava/awt/Color;F)V", "(FFFFLorg/joml/Vector4f;Ljava/awt/Color;FFLjava/awt/Color;)V", "drawWithBorder", "(FFFFFLjava/awt/Color;FFLjava/awt/Color;)V", "Lkotakbaz/rain/client/util/render/display/TextureRectRenderer;", "Lkotakbaz/rain/client/util/render/display/KawaseRenderer;", "currentPipeline", "Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "cachedRadius", "Lorg/joml/Vector4f;", "cachedColor", "Lkotakbaz/rain/client/util/color/QuadColor;", "cachedMix", "F", "cachedBorderWidth", "cachedBorderColor", "Ljava/awt/Color;", "Companion", "rain-visuals"})
public final class BlurredRectRenderer {
    @NotNull
    public static final B a;
    @NotNull
    private final TextureRectRenderer A;
    @NotNull
    private final KawaseRenderer b;
    @NotNull
    private ClientRenderPipeline B;
    @NotNull
    private final Vector4f c;
    @NotNull
    private final QuadColor C;
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

    public BlurredRectRenderer(@NotNull TextureRectRenderer textureRect, @NotNull KawaseRenderer kawase) {
        int n2 = H[0];
        n2 ^= H[1];
        Intrinsics.checkNotNullParameter(textureRect, (String)f[n2 -= H[2]]);
        int n3 = H[3];
        n3 -= H[4];
        Intrinsics.checkNotNullParameter(kawase, (String)f[n3 ^= H[5]]);
        this.A = textureRect;
        this.b = kawase;
        this.B = ClientRenderPipeline.LOW;
        this.c = new Vector4f();
        Color color = Color.WHITE;
        int n4 = H[6];
        n4 += H[7];
        Intrinsics.checkNotNullExpressionValue(color, (String)f[n4 -= H[8]]);
        this.C = new QuadColor(color);
        this.d = 0.2f;
        this.e = E;
    }

    @NotNull
    public final BlurredRectRenderer priority(@NotNull ClientRenderPipeline pipeline) {
        int n2 = H[9];
        n2 += H[10];
        Intrinsics.checkNotNullParameter((Object)pipeline, (String)f[n2 -= H[11]]);
        this.B = pipeline;
        return this;
    }

    @NotNull
    public final BlurredRectRenderer color(@NotNull Color color) {
        int n2 = H[12];
        n2 ^= H[13];
        Intrinsics.checkNotNullParameter(color, (String)f[n2 ^= H[14]]);
        this.C.set(color);
        return this;
    }

    @NotNull
    public final BlurredRectRenderer color(@NotNull Color c1, @NotNull Color c2, @NotNull Color c3, @NotNull Color c4) {
        int n2 = H[15];
        n2 -= H[16];
        Intrinsics.checkNotNullParameter(c1, (String)f[n2 ^= H[17]]);
        int n3 = H[18];
        n3 -= H[19];
        Intrinsics.checkNotNullParameter(c2, (String)f[n3 ^= H[20]]);
        int n4 = H[21];
        n4 += H[22];
        Intrinsics.checkNotNullParameter(c3, (String)f[n4 -= H[23]]);
        int n5 = H[24];
        n5 ^= H[25];
        Intrinsics.checkNotNullParameter(c4, (String)f[n5 -= H[26]]);
        this.C.set(c1, c2, c3, c4);
        return this;
    }

    @NotNull
    public final BlurredRectRenderer round(float radius) {
        this.c.set(radius, radius, radius, radius);
        return this;
    }

    @NotNull
    public final BlurredRectRenderer round(@NotNull Vector4f radius) {
        int n2 = H[27];
        n2 += H[28];
        Intrinsics.checkNotNullParameter(radius, (String)f[n2 += H[29]]);
        this.c.set((Vector4fc)radius);
        return this;
    }

    @NotNull
    public final BlurredRectRenderer mix(float mix) {
        this.d = mix;
        return this;
    }

    @NotNull
    public final BlurredRectRenderer border(float width2, @NotNull Color color) {
        int n2 = H[30];
        n2 ^= H[31];
        Intrinsics.checkNotNullParameter(color, (String)f[n2 -= H[32]]);
        this.D = width2;
        this.e = color;
        return this;
    }

    @NotNull
    public final BlurredRectRenderer borderWidth(float width2) {
        this.D = width2;
        return this;
    }

    @NotNull
    public final BlurredRectRenderer borderColor(@NotNull Color color) {
        int n2 = H[33];
        n2 += H[34];
        Intrinsics.checkNotNullParameter(color, (String)f[n2 += H[35]]);
        this.e = color;
        return this;
    }

    public final void draw(float x2, float y, float width2, float height, @NotNull Vector4f radius, @NotNull QuadColor color, float mix, float borderWidth, @NotNull Color borderColor) {
        long l2 = 6825250860113983793L;
        int n2 = H[36];
        n2 -= H[37];
        Intrinsics.checkNotNullParameter(radius, (String)f[n2 += H[38]]);
        int n3 = H[39];
        n3 += H[40];
        Intrinsics.checkNotNullParameter(color, (String)f[n3 -= H[41]]);
        int n4 = H[42];
        n4 += H[43];
        Intrinsics.checkNotNullParameter(borderColor, (String)f[n4 += H[44]]);
        if (!this.b.hasFramebuffer()) {
            return;
        }
        int n5 = H[45];
        n5 -= H[46];
        long l3 = l2;
        int n6 = H[48];
        n6 ^= H[49];
        l2 = l3 ^ ((long)this.b.texture().texture().getGlId() << (n5 -= H[47]) ^ l3) & -1L << (n6 += H[50]);
        Framebuffer framebuffer = this.b.framebuffer();
        float f2 = kotakbaz.rain.client.extensions.b.getMc().getWindow().getScaleFactor();
        float f3 = (float)framebuffer.textureWidth / f2;
        float f4 = (float)framebuffer.textureHeight / f2;
        float f5 = x2 / f3;
        float f6 = width2 / f3;
        float f7 = 1.0f - (y + height) / f4;
        float f8 = height / f4;
        float f9 = (float)color.getColor1().getAlpha() / 255.0f;
        int n7 = H[51];
        n7 += H[52];
        this.A.priority(this.B).texture((int)(l2 >>> (n7 -= H[53]))).border(borderWidth, borderColor).draw(x2, y, width2, height, color, radius, mix, f5, f7, f6, f8, f9);
    }

    public final void draw(float x2, float y, float width2, float height) {
        this.draw(x2, y, width2, height, this.c, this.C, this.d, this.D, this.e);
        this.D = 0.0f;
        this.e = E;
    }

    public final void draw(float x2, float y, float width2, float height, float radius) {
        this.c.set(radius, radius, radius, radius);
        this.draw(x2, y, width2, height, this.c, this.C, this.d, this.D, this.e);
        this.D = 0.0f;
        this.e = E;
    }

    public final void draw(float x2, float y, float width2, float height, @NotNull Vector4f radius, @NotNull QuadColor color, float mix) {
        int n2 = H[54];
        n2 ^= H[55];
        Intrinsics.checkNotNullParameter(radius, (String)f[n2 += H[56]]);
        int n3 = H[57];
        n3 += H[58];
        Intrinsics.checkNotNullParameter(color, (String)f[n3 ^= H[59]]);
        this.draw(x2, y, width2, height, radius, color, mix, this.D, this.e);
        this.D = 0.0f;
        this.e = E;
    }

    public final void draw(float x2, float y, float width2, float height, float radius, @NotNull Color color, float mix) {
        int n2 = H[60];
        n2 -= H[61];
        Intrinsics.checkNotNullParameter(color, (String)f[n2 += H[62]]);
        this.C.set(color);
        this.c.set(radius, radius, radius, radius);
        this.draw(x2, y, width2, height, this.c, this.C, mix);
    }

    public final void draw(float x2, float y, float width2, float height, @NotNull Vector4f radius, @NotNull Color color, float mix) {
        int n2 = H[63];
        n2 -= H[64];
        Intrinsics.checkNotNullParameter(radius, (String)f[n2 -= H[65]]);
        int n3 = H[66];
        n3 += H[67];
        Intrinsics.checkNotNullParameter(color, (String)f[n3 ^= H[68]]);
        this.C.set(color);
        this.draw(x2, y, width2, height, radius, this.C, mix);
    }

    public final void draw(float x2, float y, float width2, float height, @NotNull Vector4f radius, @NotNull Color color, float mix, float borderWidth, @NotNull Color borderColor) {
        int n2 = H[69];
        n2 ^= H[70];
        Intrinsics.checkNotNullParameter(radius, (String)f[n2 += H[71]]);
        int n3 = H[72];
        n3 -= H[73];
        Intrinsics.checkNotNullParameter(color, (String)f[n3 ^= H[74]]);
        int n4 = H[75];
        n4 ^= H[76];
        Intrinsics.checkNotNullParameter(borderColor, (String)f[n4 -= H[77]]);
        this.C.set(color);
        this.draw(x2, y, width2, height, radius, this.C, mix, borderWidth, borderColor);
    }

    public final void drawWithBorder(float x2, float y, float width2, float height, float radius, @NotNull Color color, float mix, float borderWidth, @NotNull Color borderColor) {
        int n2 = H[78];
        n2 += H[79];
        Intrinsics.checkNotNullParameter(color, (String)f[n2 -= H[80]]);
        int n3 = H[81];
        n3 -= H[82];
        Intrinsics.checkNotNullParameter(borderColor, (String)f[n3 -= H[83]]);
        this.C.set(color);
        this.c.set(radius, radius, radius, radius);
        this.draw(x2, y, width2, height, this.c, this.C, mix, borderWidth, borderColor);
    }

    static {
        BlurredRectRenderer.b();
        long l2 = -8393660739171474516L;
        long l3 = -4189455498349860249L;
        long l4 = 3711745979837704234L;
        long l5 = 8781635599408500043L;
        long l6 = -7923273027709729714L;
        long l7 = 8287790881891441048L;
        long l8 = 7433954106884765883L;
        long l9 = -6205989389606098644L;
        long l10 = -1277889215286772380L;
        long l11 = -180359885395234122L;
        long l12 = -6529401800773526175L;
        long l13 = 3157410662549633965L;
        long l14 = -8683155457524220922L;
        long l15 = 7702434457041433987L;
        int n2 = H[84];
        n2 ^= H[85];
        f = new Object[n2 -= H[86]];
        long l16 = l15;
        int n3 = H[87];
        n3 -= H[88];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= H[89]);
        Object[] objectArray = new Object[H[90]];
        objectArray[BlurredRectRenderer.H[91]] = F;
        objectArray[BlurredRectRenderer.H[92]] = H[93];
        int n4 = H[94];
        Object object = BlurredRectRenderer.A()[H[95]];
        if (object == null) {
            char[] cArray = "\ue6ea\ue82b\ue846\ue816\ue6f0\ue829\ue81a\ue847\ue87c\ue82d\ue86f\ue87c\ue829\ue80f\ue814\ue6e9\ue879\ue6e9\ue6e6\ue849\ue877\ue82d\ue819\ue813\ue871\ue6e7\ue84b\ue843\ue82a\ue877\ue6ec\ue87a\ue6eb\ue834\ue875\ue6ea\ue823\ue876\ue879\ue87e\ue82c\ue874\ue82d\ue815\ue84e\ue878\ue82e\ue87b\ue81e\ue879\ue6e8\ue87a\ue817\ue871\ue81c\ue876\ue843\ue877\ue86f\ue877\ue6e6\ue877\ue874\ue827\ue849\ue834\ue6e5\ue878\ue879\ue878\ue82e\ue849\ue81a\ue6eb\ue815\ue82d\ue826\ue873\ue87b\ue826\ue817\ue847\ue6e9\ue6ee\ue6e8\ue847\ue80f\ue811\ue6ec\ue828\ue876\ue819\ue81b\ue813\ue850\ue87e\ue811\ue879\ue877\ue812\ue813\ue819\ue87c\ue81a\ue823\ue877\ue82a\ue843\ue6ee\ue850\ue847\ue6ea\ue879\ue829\ue87c\ue87b\ue6ec\ue87e\ue819\ue6eb\ue847\ue826\ue6e5\ue850\ue816\ue850\ue84b\ue6f0\ue6e7\ue826\ue6eb\ue845\ue825\ue84b\ue82a\ue87c\ue81a\ue827\ue84e\ue81b\ue815\ue81e\ue6ea\ue872\ue84d\ue6e6\ue875\ue814\ue872\ue6ec\ue82d\ue6e8\ue6e7\ue6e5\ue829\ue846\ue847\ue82b\ue875\ue82d\ue829\ue84c\ue6e9\ue6ed\ue848\ue873\ue829\ue879\ue6e8\ue875\ue6ea\ue84c\ue872\ue847\ue82a\ue87b\ue82e\ue84c\ue817\ue82d\ue875\ue845\ue827\ue877\ue814\ue834\ue873\ue87a\ue829\ue874\ue817\ue87a\ue87b\ue87e\ue6ea\ue81e\ue84b\ue86f\ue81e\ue814\ue825\ue848\ue6ed\ue817\ue813\ue871\ue6e6\ue6ed\ue828\ue872\ue830\ue6ee\ue817\ue84d\ue830\ue871\ue81e\ue6e9\ue86f\ue815\ue6e9\ue845\ue816\ue878\ue813\ue80f\ue827\ue828\ue82b\ue830\ue6ed\ue843\ue879\ue84c\ue84d\ue876\ue874\ue87c\ue874\ue84c\ue6e9\ue87b\ue80f\ue825\ue6ea\ue871\ue82b\ue84b\ue819\ue6ee\ue814\ue80f\ue6ee\ue87e\ue6e9\ue81a\ue6f0\ue847\ue877\ue829\ue84e\ue847\ue819\ue874\ue82b\ue6e8\ue6e6\ue826\ue826\ue814\ue82c\ue6ed\ue843\ue811\ue81a\ue87e\ue6e6\ue876\ue812\ue6ea\ue80f\ue87b\ue825\ue6ec\ue86f\ue6e8\ue80f\ue84d\ue811\ue834\ue6e7\ue82a\ue825\ue6e5\ue87b\ue82a\ue82c\ue825\ue816\ue6e2".toCharArray();
            for (int i2 = H[96]; i2 < H[97]; ++i2) {
                int n5 = cArray[i2];
                n5 += H[98];
                n5 += H[99];
                n5 -= H[100];
                n5 -= H[101];
                n5 += H[102];
                n5 += H[103];
                n5 += H[104];
                n5 ^= H[105];
                n5 ^= H[106];
                n5 += H[107];
                n5 ^= H[108];
                cArray[i2] = (char)(n5 += H[109]);
            }
            object = BlurredRectRenderer.A()[BlurredRectRenderer.H[110]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)BlurredRectRenderer.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = H[111];
        n6 += H[112];
        l6 = l17 ^ (0xC400000000L ^ l17) & -1L << (n6 ^= H[113]);
        long l18 = l13;
        int n7 = H[114];
        n7 += H[115];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 += H[116]);
        while (true) {
            int n8 = H[117];
            n8 ^= H[118];
            if ((int)l13 >= (int)(l6 >>> (n8 -= H[119]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = H[120];
            n10 ^= H[121];
            int n11 = H[123];
            n11 ^= H[124];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 -= H[122])) & -1L >>> (n11 ^= H[125]);
            long l20 = l9;
            int n12 = H[126];
            n12 += H[127];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 += H[128]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = H[129];
            n14 += H[130];
            int n15 = H[132];
            n15 -= H[133];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= H[131])) & -1L >>> (n15 -= H[134]);
            int n16 = H[135];
            n16 ^= H[136];
            long l22 = l10;
            int n17 = H[138];
            n17 += H[139];
            l10 = l22 ^ ((long)cArray[n13] << (n16 ^= H[137]) ^ l22) & -1L << (n17 -= H[140]);
            int n18 = H[141];
            n18 ^= H[142];
            n18 ^= H[143];
            int n19 = H[144];
            n19 += H[145];
            long l23 = l12;
            int n20 = H[147];
            n20 += H[148];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 += H[146]))) ^ l23) & -1L >>> (n20 ^= H[149]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = H[150];
            n21 -= H[151];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 ^= H[152]);
            while (true) {
                int n22 = H[153];
                n22 += H[154];
                if ((int)(l14 >>> (n22 -= H[155])) >= (int)l12) break;
                int n23 = H[156];
                n23 ^= H[157];
                int n24 = H[159];
                n24 ^= H[160];
                cArray2[(int)(l14 >>> (n23 += BlurredRectRenderer.H[158]))] = cArray[(int)l13 + (int)(l14 >>> (n24 += H[161]))];
                l14 += 0x100000000L;
            }
            int n25 = H[162];
            n25 += H[163];
            int n26 = (int)(l15 >>> (n25 -= H[164]));
            l15 += 0x100000000L;
            BlurredRectRenderer.f[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = H[165];
            n27 ^= H[166];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 ^= H[167]);
        }
        a = new B(null);
        int n28 = H[168];
        n28 -= H[169];
        n28 -= H[170];
        int n29 = H[171];
        n29 -= H[172];
        int n30 = H[174];
        n30 -= H[175];
        int n31 = H[177];
        n31 ^= H[178];
        E = new Color(n28, n29 -= H[173], n30 += H[176], n31 += H[179]);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[H[180]];
        String string = (String)object[H[181]];
        object = object[H[182]];
        Object[] objectArray = G;
        if (G == null) {
            objectArray = G = new Object[H[183]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[H[184]];
                F = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[H[186] ^ H[187]];
                byArray[BlurredRectRenderer.H[188] ^ BlurredRectRenderer.H[189]] = H[190] ^ H[191];
                byArray[BlurredRectRenderer.H[192] ^ BlurredRectRenderer.H[193]] = H[194] ^ H[195];
                byArray[BlurredRectRenderer.H[196] ^ BlurredRectRenderer.H[197]] = H[198] ^ H[199];
                byArray[BlurredRectRenderer.H[200] ^ BlurredRectRenderer.H[201]] = H[202] ^ H[203];
                byArray[BlurredRectRenderer.H[204] ^ BlurredRectRenderer.H[205]] = H[206] ^ H[207];
                byArray[BlurredRectRenderer.H[208] ^ BlurredRectRenderer.H[209]] = H[210] ^ H[211];
                byArray[BlurredRectRenderer.H[212] ^ BlurredRectRenderer.H[213]] = H[214] ^ H[215];
                byArray[BlurredRectRenderer.H[216] ^ BlurredRectRenderer.H[217]] = H[218] ^ H[219];
                byArray[BlurredRectRenderer.H[220] ^ BlurredRectRenderer.H[221]] = H[222] ^ H[223];
                byArray[BlurredRectRenderer.H[224] ^ BlurredRectRenderer.H[225]] = H[226] ^ H[227];
                byArray[BlurredRectRenderer.H[228] ^ BlurredRectRenderer.H[229]] = H[230] ^ H[231];
                byArray[BlurredRectRenderer.H[232] ^ BlurredRectRenderer.H[233]] = H[234] ^ H[235];
                byArray[BlurredRectRenderer.H[236] ^ BlurredRectRenderer.H[237]] = H[238] ^ H[239];
                byArray[BlurredRectRenderer.H[240] ^ BlurredRectRenderer.H[241]] = H[242] ^ H[243];
                byArray[BlurredRectRenderer.H[244] ^ BlurredRectRenderer.H[245]] = H[246] ^ H[247];
                byArray[BlurredRectRenderer.H[248] ^ BlurredRectRenderer.H[249]] = H[250] ^ H[251];
                objectArray2[BlurredRectRenderer.H[185]] = byArray;
            }
            byte[] byArray = (byte[])object3[H[252]];
            if (g == null) {
                byte[] byArray2 = new byte[H[253] ^ H[254]];
                byArray2[BlurredRectRenderer.H[255] ^ BlurredRectRenderer.H[256]] = H[257] ^ H[258];
                byArray2[BlurredRectRenderer.H[259] ^ BlurredRectRenderer.H[260]] = H[261] ^ H[262];
                byArray2[BlurredRectRenderer.H[263] ^ BlurredRectRenderer.H[264]] = H[265] ^ H[266];
                byArray2[BlurredRectRenderer.H[267] ^ BlurredRectRenderer.H[268]] = H[269] ^ H[270];
                byArray2[BlurredRectRenderer.H[271] ^ BlurredRectRenderer.H[272]] = H[273] ^ H[274];
                byArray2[BlurredRectRenderer.H[275] ^ BlurredRectRenderer.H[276]] = H[277] ^ H[278];
                byArray2[BlurredRectRenderer.H[279] ^ BlurredRectRenderer.H[280]] = H[281] ^ H[282];
                byArray2[BlurredRectRenderer.H[283] ^ BlurredRectRenderer.H[284]] = H[285] ^ H[286];
                byArray2[BlurredRectRenderer.H[287] ^ BlurredRectRenderer.H[288]] = H[289] ^ H[290];
                byArray2[BlurredRectRenderer.H[291] ^ BlurredRectRenderer.H[292]] = H[293] ^ H[294];
                byArray2[BlurredRectRenderer.H[295] ^ BlurredRectRenderer.H[296]] = H[297] ^ H[298];
                byArray2[BlurredRectRenderer.H[299] ^ BlurredRectRenderer.H[300]] = H[301] ^ H[302];
                byArray2[BlurredRectRenderer.H[303] ^ BlurredRectRenderer.H[304]] = H[305] ^ H[306];
                byArray2[BlurredRectRenderer.H[307] ^ BlurredRectRenderer.H[308]] = H[309] ^ H[310];
                byArray2[BlurredRectRenderer.H[311] ^ BlurredRectRenderer.H[312]] = H[313] ^ H[314];
                byArray2[BlurredRectRenderer.H[315] ^ BlurredRectRenderer.H[316]] = H[317] ^ H[318];
                byArray2[BlurredRectRenderer.H[319] ^ BlurredRectRenderer.H[320]] = H[321] ^ H[322];
                byArray2[BlurredRectRenderer.H[323] ^ BlurredRectRenderer.H[324]] = H[325] ^ H[326];
                byArray2[BlurredRectRenderer.H[327] ^ BlurredRectRenderer.H[328]] = H[329] ^ H[330];
                byArray2[BlurredRectRenderer.H[331] ^ BlurredRectRenderer.H[332]] = H[333] ^ H[334];
                byArray2[BlurredRectRenderer.H[335] ^ BlurredRectRenderer.H[336]] = H[337] ^ H[338];
                byArray2[BlurredRectRenderer.H[339] ^ BlurredRectRenderer.H[340]] = H[341] ^ H[342];
                byArray2[BlurredRectRenderer.H[343] ^ BlurredRectRenderer.H[344]] = H[345] ^ H[346];
                byArray2[BlurredRectRenderer.H[347] ^ BlurredRectRenderer.H[348]] = H[349] ^ H[350];
                byArray2[BlurredRectRenderer.H[351] ^ BlurredRectRenderer.H[352]] = H[353] ^ H[354];
                byArray2[BlurredRectRenderer.H[355] ^ BlurredRectRenderer.H[356]] = H[357] ^ H[358];
                byArray2[BlurredRectRenderer.H[359] ^ BlurredRectRenderer.H[360]] = H[361] ^ H[362];
                byArray2[BlurredRectRenderer.H[363] ^ BlurredRectRenderer.H[364]] = H[365] ^ H[366];
                byArray2[BlurredRectRenderer.H[367] ^ BlurredRectRenderer.H[368]] = H[369] ^ H[370];
                byArray2[BlurredRectRenderer.H[371] ^ BlurredRectRenderer.H[372]] = H[373] ^ H[374];
                byArray2[BlurredRectRenderer.H[375] ^ BlurredRectRenderer.H[376]] = H[377] ^ H[378];
                byArray2[BlurredRectRenderer.H[379] ^ BlurredRectRenderer.H[380]] = H[381] ^ H[382];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, H[383], byArray3, H[384], byArray.length);
                System.arraycopy(byArray2, H[385], byArray3, byArray.length, byArray2.length);
                Object object4 = BlurredRectRenderer.A()[H[386]];
                if (object4 == null) {
                    char[] cArray = "\uaf81\uadf7\uadf6\uadfd\uadf3\uaf27\uaf3a\uaf30\ua3ed\uaf49\uade9\ua3ec\uaf58\uaf5e\uaf8e\uade9\uadf8\uaf28".toCharArray();
                    for (int i2 = H[387]; i2 < H[388]; ++i2) {
                        int n3 = cArray[i2];
                        n3 += H[389];
                        n3 -= H[390];
                        n3 ^= H[391];
                        n3 -= H[392];
                        n3 -= H[393];
                        n3 ^= H[394];
                        n3 += H[395];
                        n3 -= H[396];
                        n3 ^= H[397];
                        n3 += H[398];
                        n3 ^= H[399];
                        n3 += 6197;
                        n3 += 54487;
                        cArray[i2] = (char)(n3 -= 8159);
                    }
                    object4 = BlurredRectRenderer.A()[1] = new String(cArray);
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
                Object object5 = BlurredRectRenderer.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u5014\u9cd0\u9da6".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= 49889;
                        n4 -= 13701;
                        n4 -= 16200;
                        n4 ^= 0xA54B;
                        n4 += 13902;
                        n4 -= 48912;
                        n4 ^= 0xDA12;
                        n4 -= 3508;
                        n4 ^= 0xBF58;
                        n4 ^= 0xC5F9;
                        n4 += 17305;
                        n4 -= 10426;
                        n4 ^= 0xD31C;
                        cArray[i3] = (char)(n4 -= 26142);
                    }
                    object5 = BlurredRectRenderer.A()[2] = new String(cArray);
                }
                g = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = BlurredRectRenderer.A()[3];
            if (object6 == null) {
                char[] cArray = "\uf471\uf47d\uf5b3\uf427\uf463\uf478\uf463\uf427\uf586\uf47b\uf463\uf5b3\uf42d\uf586\uf5d1\uf5c2\uf5c2\uf5a9\uf5ac\uf5af".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 ^= 0xD660;
                    n5 ^= 0x1672;
                    n5 -= 43554;
                    n5 += 13250;
                    n5 -= 33043;
                    n5 ^= 0xDD64;
                    n5 += 36406;
                    n5 -= 24071;
                    n5 -= 61338;
                    n5 ^= 0xADB;
                    n5 += 43612;
                    cArray[i4] = (char)(n5 -= 54029);
                }
                object6 = BlurredRectRenderer.A()[3] = new String(cArray);
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
        BlurredRectRenderer.H[0xA45F ^ 0xA436] = 0x5F4A ^ 0xA436;
        BlurredRectRenderer.H[0x89C5 ^ 0x884D] = 0xE56A ^ 0x884D;
        BlurredRectRenderer.H[0x10DE8 ^ 0x10DE7] = 0x10D92 ^ 0x10DE7;
        BlurredRectRenderer.H[0xC237 ^ 0xC2B8] = 0xC2EE ^ 0xC2B8;
        BlurredRectRenderer.H[0x5E4E ^ 0x5E1A] = 0x5E7E ^ 0x5E1A;
        BlurredRectRenderer.H[0xF841 ^ 0xF9CF] = 0x157F ^ 0xF9CF;
        BlurredRectRenderer.H[0x9901 ^ 0x99BC] = 0xD181 ^ 0x99BC;
        BlurredRectRenderer.H[0xACE8 ^ 0xAC1E] = 0xD04B ^ 0xAC1E;
        BlurredRectRenderer.H[0x357D ^ 0x353C] = 0xFFFFCAFF ^ 0x353C;
        BlurredRectRenderer.H[0x49D1 ^ 0x49C9] = 0xFFFFB60D ^ 0x49C9;
        BlurredRectRenderer.H[0x12A3 ^ 0x12D2] = 0xFFFFED62 ^ 0x12D2;
        BlurredRectRenderer.H[0x362A ^ 0x377F] = 0xB969 ^ 0x377F;
        BlurredRectRenderer.H[0x765F ^ 0x7640] = 0x7615 ^ 0x7640;
        BlurredRectRenderer.H[0xE66D ^ 0xE6A5] = 0x16FA ^ 0xE6A5;
        BlurredRectRenderer.H[0x10E95 ^ 0x10E80] = 0x10E86 ^ 0x10E80;
        BlurredRectRenderer.H[0x7E5 ^ 0x79F] = 0xFFFFF836 ^ 0x79F;
        BlurredRectRenderer.H[0x108D3 ^ 0x1085D] = 0xFFFEF782 ^ 0x1085D;
        BlurredRectRenderer.H[0x37A1 ^ 0x37BA] = 0x37DB ^ 0x37BA;
        BlurredRectRenderer.H[0x9089 ^ 0x9021] = 0xFFFF6FF9 ^ 0x9021;
        BlurredRectRenderer.H[0xA32C ^ 0xA315] = 0xA36D ^ 0xA315;
        BlurredRectRenderer.H[0x870F ^ 0x8770] = 0x8752 ^ 0x8770;
        BlurredRectRenderer.H[0x9E54 ^ 0x9F76] = 0xD46F ^ 0x9F76;
        BlurredRectRenderer.H[0x1CC0 ^ 0x1D4C] = 0x4302 ^ 0x1D4C;
        BlurredRectRenderer.H[0x105F9 ^ 0x105DC] = 0xFFFEFA73 ^ 0x105DC;
        BlurredRectRenderer.H[0xF9E4 ^ 0xF990] = 0xFFFF0675 ^ 0xF990;
        BlurredRectRenderer.H[0x256D ^ 0x240D] = 0xEBE4 ^ 0x240D;
        BlurredRectRenderer.H[0xBA04 ^ 0xBA31] = 0xFFFF45D3 ^ 0xBA31;
        BlurredRectRenderer.H[0x1028A ^ 0x102C6] = 0xFFFEFD7D ^ 0x102C6;
        BlurredRectRenderer.H[0x32DB ^ 0x32EB] = 0x3284 ^ 0x32EB;
        BlurredRectRenderer.H[0x105A6 ^ 0x104BD] = 0x17693 ^ 0x104BD;
        BlurredRectRenderer.H[0x45D9 ^ 0x45BB] = 0x2E0B ^ 0x45BB;
        BlurredRectRenderer.H[0x10E74 ^ 0x10EF0] = 0xFFFEF17B ^ 0x10EF0;
        BlurredRectRenderer.H[0xB465 ^ 0xB45D] = 0xFFFF4B98 ^ 0xB45D;
        BlurredRectRenderer.H[0xDA2 ^ 0xDF3] = 0xD3E ^ 0xDF3;
        BlurredRectRenderer.H[0x7EEE ^ 0x7EAB] = 0xFFFF812D ^ 0x7EAB;
        BlurredRectRenderer.H[0x19FA ^ 0x18E3] = 0x240B ^ 0x18E3;
        BlurredRectRenderer.H[0xCE8A ^ 0xCF0E] = 0xCF1C ^ 0xCF0E;
        BlurredRectRenderer.H[0x373 ^ 0x3B0] = 0x68E4 ^ 0x3B0;
        BlurredRectRenderer.H[0x3279 ^ 0x3295] = 0x614F ^ 0x3295;
        BlurredRectRenderer.H[0xEFE2 ^ 0xEEDC] = 0xD64B ^ 0xEEDC;
        BlurredRectRenderer.H[0x2A32 ^ 0x2A5F] = 0x6250 ^ 0x2A5F;
        BlurredRectRenderer.H[0xA441 ^ 0xA456] = 0xFFFF5BA0 ^ 0xA456;
        BlurredRectRenderer.H[0x1086F ^ 0x10948] = 0x1AA84 ^ 0x10948;
        BlurredRectRenderer.H[0x556E ^ 0x55E5] = 0xFFFFAA7A ^ 0x55E5;
        BlurredRectRenderer.H[0xE7F3 ^ 0xE68B] = 0xF99 ^ 0xE68B;
        BlurredRectRenderer.H[0x54 ^ 0x130] = 0xF39A ^ 0x130;
        BlurredRectRenderer.H[0x821D ^ 0x8309] = 0xAB42 ^ 0x8309;
        BlurredRectRenderer.H[0xE358 ^ 0xE208] = 0xAF6A ^ 0xE208;
        BlurredRectRenderer.H[0xCDA4 ^ 0xCDF9] = 0xCDF9 ^ 0xCDF9;
        BlurredRectRenderer.H[0x609F ^ 0x6013] = 0xFFFF9FBB ^ 0x6013;
        BlurredRectRenderer.H[0xFC35 ^ 0xFC51] = 0x3F33 ^ 0xFC51;
        BlurredRectRenderer.H[0xD5F7 ^ 0xD5D0] = 0xD5DD ^ 0xD5D0;
        BlurredRectRenderer.H[0x3825 ^ 0x3934] = 0x7636 ^ 0x3934;
        BlurredRectRenderer.H[0xF110 ^ 0xF1DB] = 0x187 ^ 0xF1DB;
        BlurredRectRenderer.H[0x5B24 ^ 0x5A2E] = 0x954C ^ 0x5A2E;
        BlurredRectRenderer.H[0x1A97 ^ 0x1B82] = 0xFFFFCC7B ^ 0x1B82;
        BlurredRectRenderer.H[0x3F84 ^ 0x3FAF] = 0xFFFFC034 ^ 0x3FAF;
        BlurredRectRenderer.H[0xF2 ^ 0xF7] = 0xFFFFFF47 ^ 0xF7;
        BlurredRectRenderer.H[0x3ECF ^ 0x3E9F] = 0x3EC3 ^ 0x3E9F;
        BlurredRectRenderer.H[0xA667 ^ 0xA674] = 0xFFFF59A8 ^ 0xA674;
        BlurredRectRenderer.H[0x315D ^ 0x3040] = 0xFFFFBDF5 ^ 0x3040;
        BlurredRectRenderer.H[0x3612 ^ 0x3756] = 0x3DDF ^ 0x3756;
        BlurredRectRenderer.H[0xC608 ^ 0xC6EC] = 0xEBEE ^ 0xC6EC;
        BlurredRectRenderer.H[0x317E ^ 0x31B9] = 0x3DFD ^ 0x31B9;
        BlurredRectRenderer.H[0x3D23 ^ 0x3DBC] = 0xFFFFC269 ^ 0x3DBC;
        BlurredRectRenderer.H[0xA40D ^ 0xA56E] = 0x57DE ^ 0xA56E;
        BlurredRectRenderer.H[0x10594 ^ 0x104FC] = 0x1D92C ^ 0x104FC;
        BlurredRectRenderer.H[0xAFAC ^ 0xAF42] = 0xFFFF034A ^ 0xAF42;
        BlurredRectRenderer.H[0x3D5A ^ 0x3DFF] = 0x3DA1 ^ 0x3DFF;
        BlurredRectRenderer.H[0x5B06 ^ 0x5B71] = 0x5B7D ^ 0x5B71;
        BlurredRectRenderer.H[0x8457 ^ 0x8474] = 0x8447 ^ 0x8474;
        BlurredRectRenderer.H[0xFA36 ^ 0xFAAD] = 0xFAC6 ^ 0xFAAD;
        BlurredRectRenderer.H[0x2DE1 ^ 0x2D1B] = 0xFFFF87E3 ^ 0x2D1B;
        BlurredRectRenderer.H[0xCBEF ^ 0xCAA4] = 0xBE95 ^ 0xCAA4;
        BlurredRectRenderer.H[0x208 ^ 0x323] = 0x9C94 ^ 0x323;
        BlurredRectRenderer.H[0xC1EB ^ 0xC1EC] = 0xFFFF3E42 ^ 0xC1EC;
        BlurredRectRenderer.H[0xF326 ^ 0xF387] = 0xF3DE ^ 0xF387;
        BlurredRectRenderer.H[0xA790 ^ 0xA7D0] = 0xA787 ^ 0xA7D0;
        BlurredRectRenderer.H[0xDE7C ^ 0xDE66] = 0xFFFF2184 ^ 0xDE66;
        BlurredRectRenderer.H[0x7E77 ^ 0x7E2C] = 0x7E2C ^ 0x7E2C;
        BlurredRectRenderer.H[0x2E58 ^ 0x2F5E] = 0x1289A ^ 0x2F5E;
        BlurredRectRenderer.H[0x641 ^ 0x65F] = 0xFFFFF9AE ^ 0x65F;
        BlurredRectRenderer.H[0xBD09 ^ 0xBC70] = 0xFFFFAAEF ^ 0xBC70;
        BlurredRectRenderer.H[0x25D8 ^ 0x2459] = 0x2459 ^ 0x2459;
        BlurredRectRenderer.H[0x935E ^ 0x9315] = 0xFFFF6CE1 ^ 0x9315;
        BlurredRectRenderer.H[0x351A ^ 0x35A6] = 0x7D9E ^ 0x35A6;
        BlurredRectRenderer.H[0x3FCB ^ 0x3EB0] = 0x52AF ^ 0x3EB0;
        BlurredRectRenderer.H[0xE9FF ^ 0xE8E7] = 0xD428 ^ 0xE8E7;
        BlurredRectRenderer.H[0xBF5 ^ 0xAE7] = 0x45FE ^ 0xAE7;
        BlurredRectRenderer.H[0xC8D1 ^ 0xC9EB] = 0x1BE2 ^ 0xC9EB;
        BlurredRectRenderer.H[0xEC5A ^ 0xEC32] = 0x4A9 ^ 0xEC32;
        BlurredRectRenderer.H[0x31D4 ^ 0x313C] = 0x58A6 ^ 0x313C;
        BlurredRectRenderer.H[0x6853 ^ 0x6861] = 0x684A ^ 0x6861;
        BlurredRectRenderer.H[0xC319 ^ 0xC25A] = 0xC8CA ^ 0xC25A;
        BlurredRectRenderer.H[0xA56A ^ 0xA5DA] = 0xA5E1 ^ 0xA5DA;
        BlurredRectRenderer.H[0x4A8F ^ 0x4AAF] = 0xFFFFB53E ^ 0x4AAF;
        BlurredRectRenderer.H[0x9E53 ^ 0x9F3C] = 0xC3D2 ^ 0x9F3C;
        BlurredRectRenderer.H[0xC001 ^ 0xC157] = 0x4F3C ^ 0xC157;
        BlurredRectRenderer.H[0xFA6 ^ 0xFD0] = 0xFC7 ^ 0xFD0;
        BlurredRectRenderer.H[0xB919 ^ 0xB86D] = 0xC4F4 ^ 0xB86D;
        BlurredRectRenderer.H[0xD01A ^ 0xD130] = 0x72F6 ^ 0xD130;
        BlurredRectRenderer.H[0x10150 ^ 0x10012] = 0x1A0DA ^ 0x10012;
        BlurredRectRenderer.H[0x3D47 ^ 0x3D24] = 0x9D85 ^ 0x3D24;
        BlurredRectRenderer.H[0x83F8 ^ 0x835B] = 0xFFFF7CE7 ^ 0x835B;
        BlurredRectRenderer.H[0x95E6 ^ 0x959D] = 0xFFFF6A6F ^ 0x959D;
        BlurredRectRenderer.H[0x5557 ^ 0x5576] = 0x5546 ^ 0x5576;
        BlurredRectRenderer.H[0x1D99 ^ 0x1D74] = 0x4EA6 ^ 0x1D74;
        BlurredRectRenderer.H[0xFB18 ^ 0xFBEC] = 0x87C7 ^ 0xFBEC;
        BlurredRectRenderer.H[0x4BE8 ^ 0x4B2D] = 0x4769 ^ 0x4B2D;
        BlurredRectRenderer.H[0xD61B ^ 0xD719] = 0x673 ^ 0xD719;
        BlurredRectRenderer.H[0x981C ^ 0x989B] = 0xFFFF670D ^ 0x989B;
        BlurredRectRenderer.H[0xADB2 ^ 0xAD19] = 0xAD62 ^ 0xAD19;
        BlurredRectRenderer.H[0x7F77 ^ 0x7FD3] = 0xFFFF8041 ^ 0x7FD3;
        BlurredRectRenderer.H[0x6903 ^ 0x692C] = 0x6963 ^ 0x692C;
        BlurredRectRenderer.H[0x2A6C ^ 0x2AB2] = 0xFFFF1555 ^ 0x2AB2;
        BlurredRectRenderer.H[0x8619 ^ 0x86D4] = 0x87DA ^ 0x86D4;
        BlurredRectRenderer.H[0x4473 ^ 0x4498] = 0x2D02 ^ 0x4498;
        BlurredRectRenderer.H[0x7D56 ^ 0x7C02] = 0xF269 ^ 0x7C02;
        BlurredRectRenderer.H[0xFE24 ^ 0xFF4E] = 0x229E ^ 0xFF4E;
        BlurredRectRenderer.H[0x89FE ^ 0x8897] = 0xFFFFAAA2 ^ 0x8897;
        BlurredRectRenderer.H[0x10527 ^ 0x1059E] = 0x1059E ^ 0x1059E;
        BlurredRectRenderer.H[0x3A88 ^ 0x3BFB] = 0x4760 ^ 0x3BFB;
        BlurredRectRenderer.H[0xCC19 ^ 0xCCAD] = 0xCCAC ^ 0xCCAD;
        BlurredRectRenderer.H[0xA6E6 ^ 0xA7A0] = 0xAD29 ^ 0xA7A0;
        BlurredRectRenderer.H[0x3756 ^ 0x37F8] = 0xFFFFC846 ^ 0x37F8;
        BlurredRectRenderer.H[0xC0E4 ^ 0xC1BD] = 0xFFFF2632 ^ 0xC1BD;
        BlurredRectRenderer.H[0xF3D9 ^ 0xF2CF] = 0xDA84 ^ 0xF2CF;
        BlurredRectRenderer.H[0x2EFB ^ 0x2E35] = 0xFFFFD087 ^ 0x2E35;
        BlurredRectRenderer.H[0x6ECD ^ 0x6E3D] = 0xA951 ^ 0x6E3D;
        BlurredRectRenderer.H[0x29AD ^ 0x295F] = 0xEE26 ^ 0x295F;
        BlurredRectRenderer.H[0xF78D ^ 0xF72F] = 0xFFFF08D9 ^ 0xF72F;
        BlurredRectRenderer.H[0x9AFD ^ 0x9A20] = 0x5A20 ^ 0x9A20;
        BlurredRectRenderer.H[0x4972 ^ 0x4998] = 0xFFFFDFA9 ^ 0x4998;
        BlurredRectRenderer.H[0x85A4 ^ 0x84EE] = 0xC97C ^ 0x84EE;
        BlurredRectRenderer.H[0xF437 ^ 0xF468] = 0xF468 ^ 0xF468;
        BlurredRectRenderer.H[0x990C ^ 0x988C] = 0x988C ^ 0x988C;
        BlurredRectRenderer.H[0x4E7C ^ 0x4E38] = 0x4E03 ^ 0x4E38;
        BlurredRectRenderer.H[0x757 ^ 0x737] = 0x737 ^ 0x737;
        BlurredRectRenderer.H[0xADB6 ^ 0xAD3B] = 0xFFFF52A2 ^ 0xAD3B;
        BlurredRectRenderer.H[0x7411 ^ 0x74B7] = 0x74C0 ^ 0x74B7;
        BlurredRectRenderer.H[0x51C3 ^ 0x5045] = 0x42A7 ^ 0x5045;
        BlurredRectRenderer.H[0x990A ^ 0x99A0] = 0xFFFF6665 ^ 0x99A0;
        BlurredRectRenderer.H[0x7F5A ^ 0x7FCF] = 0xFFFF8049 ^ 0x7FCF;
        BlurredRectRenderer.H[0x6D7D ^ 0x6D75] = 0x6D73 ^ 0x6D75;
        BlurredRectRenderer.H[0x438C ^ 0x4284] = 0x8DE6 ^ 0x4284;
        BlurredRectRenderer.H[0xAD9 ^ 0xA85] = 0xA84 ^ 0xA85;
        BlurredRectRenderer.H[0xCC94 ^ 0xCC44] = 0x736C ^ 0xCC44;
        BlurredRectRenderer.H[0x5755 ^ 0x57C2] = 0xFFFFA87F ^ 0x57C2;
        BlurredRectRenderer.H[0xEE4C ^ 0xEF3A] = 0x93A3 ^ 0xEF3A;
        BlurredRectRenderer.H[0x10522 ^ 0x10570] = 0x1050B ^ 0x10570;
        BlurredRectRenderer.H[0x6739 ^ 0x660E] = 0xB406 ^ 0x660E;
        BlurredRectRenderer.H[0x975 ^ 0x976] = 0xFFFFF608 ^ 0x976;
        BlurredRectRenderer.H[0x753E ^ 0x7406] = 0xA60F ^ 0x7406;
        BlurredRectRenderer.H[0x96B1 ^ 0x96A1] = 0x96B4 ^ 0x96A1;
        BlurredRectRenderer.H[0xAA78 ^ 0xAB6F] = 0x97B7 ^ 0xAB6F;
        BlurredRectRenderer.H[0xA5C4 ^ 0xA59A] = 0xA598 ^ 0xA59A;
        BlurredRectRenderer.H[0x2656 ^ 0x268F] = 0xA4C7 ^ 0x268F;
        BlurredRectRenderer.H[0x5DB6 ^ 0x5CE4] = 0x1186 ^ 0x5CE4;
        BlurredRectRenderer.H[0x141C ^ 0x14BC] = 0x14AE ^ 0x14BC;
        BlurredRectRenderer.H[0x1961 ^ 0x184F] = 0x87ED ^ 0x184F;
        BlurredRectRenderer.H[0xEE60 ^ 0xEEC9] = 0xEEDA ^ 0xEEC9;
        BlurredRectRenderer.H[0x10154 ^ 0x1004E] = 0x13C81 ^ 0x1004E;
        BlurredRectRenderer.H[0x47F4 ^ 0x46C9] = 0xFFFF81CA ^ 0x46C9;
        BlurredRectRenderer.H[0x5B96 ^ 0x5B31] = 0x5B38 ^ 0x5B31;
        BlurredRectRenderer.H[0xD713 ^ 0xD64D] = 0x202B ^ 0xD64D;
        BlurredRectRenderer.H[0xB76 ^ 0xA1B] = 0xFFFF1E8E ^ 0xA1B;
        BlurredRectRenderer.H[0xEB7B ^ 0xEA2C] = 0xF247 ^ 0xEA2C;
        BlurredRectRenderer.H[0x1023A ^ 0x103BD] = 0x1DB1A ^ 0x103BD;
        BlurredRectRenderer.H[0x1C45 ^ 0x1C71] = 0x1C65 ^ 0x1C71;
        BlurredRectRenderer.H[0xB6EB ^ 0xB6C2] = 0xFFFF4971 ^ 0xB6C2;
        BlurredRectRenderer.H[0x5E18 ^ 0x5EE0] = 0xBC6 ^ 0x5EE0;
        BlurredRectRenderer.H[0x5801 ^ 0x591F] = 0x2B39 ^ 0x591F;
        BlurredRectRenderer.H[0x921C ^ 0x92E2] = 0xA98E ^ 0x92E2;
        BlurredRectRenderer.H[0x5712 ^ 0x5631] = 0xB08E ^ 0x5631;
        BlurredRectRenderer.H[0x4D5C ^ 0x4C3D] = 0xFFFF7C56 ^ 0x4C3D;
        BlurredRectRenderer.H[0xE6ED ^ 0xE7AA] = 0xAA3D ^ 0xE7AA;
        BlurredRectRenderer.H[0xBB06 ^ 0xBB3D] = 0xBB62 ^ 0xBB3D;
        BlurredRectRenderer.H[0x6D98 ^ 0x6CB1] = 0xFFFF30BE ^ 0x6CB1;
        BlurredRectRenderer.H[0x4707 ^ 0x460C] = 0x3FB7 ^ 0x460C;
        BlurredRectRenderer.H[0xE46C ^ 0xE462] = 0xFFFF1BD7 ^ 0xE462;
        BlurredRectRenderer.H[0xCD7D ^ 0xCC25] = 0xD458 ^ 0xCC25;
        BlurredRectRenderer.H[0xE107 ^ 0xE077] = 0xBC9F ^ 0xE077;
        BlurredRectRenderer.H[0xC53 ^ 0xD2F] = 0x612D ^ 0xD2F;
        BlurredRectRenderer.H[0x1960 ^ 0x19E9] = 0x19C6 ^ 0x19E9;
        BlurredRectRenderer.H[0x17BA ^ 0x169F] = 0xF078 ^ 0x169F;
        BlurredRectRenderer.H[0xFF70 ^ 0xFE31] = 0x5EDE ^ 0xFE31;
        BlurredRectRenderer.H[0x44D5 ^ 0x458A] = 0x8A7C ^ 0x458A;
        BlurredRectRenderer.H[0x8CBE ^ 0x8D92] = 0x1230 ^ 0x8D92;
        BlurredRectRenderer.H[0xC285 ^ 0xC213] = 0xFFFF3D2D ^ 0xC213;
        BlurredRectRenderer.H[0xDEF7 ^ 0xDFF6] = 0xE83 ^ 0xDFF6;
        BlurredRectRenderer.H[0x7B4A ^ 0x7A06] = 0xE25 ^ 0x7A06;
        BlurredRectRenderer.H[0xA85B ^ 0xA828] = 0xA878 ^ 0xA828;
        BlurredRectRenderer.H[0x59AE ^ 0x59AA] = 0xFFFFA615 ^ 0x59AA;
        BlurredRectRenderer.H[0x78E3 ^ 0x7852] = 0x7877 ^ 0x7852;
        BlurredRectRenderer.H[0xC15F ^ 0xC05F] = 0x1135 ^ 0xC05F;
        BlurredRectRenderer.H[0x4442 ^ 0x4484] = 0xFFFFB71F ^ 0x4484;
        BlurredRectRenderer.H[0xA74E ^ 0xA61F] = 0xEB3B ^ 0xA61F;
        BlurredRectRenderer.H[0xF765 ^ 0xF6E7] = 0xF6E6 ^ 0xF6E7;
        BlurredRectRenderer.H[0x5092 ^ 0x50DB] = 0xFFFFAF20 ^ 0x50DB;
        BlurredRectRenderer.H[0xC37D ^ 0xC38E] = 0x4ED ^ 0xC38E;
        BlurredRectRenderer.H[0xE56 ^ 0xE80] = 0xFFFFC621 ^ 0xE80;
        BlurredRectRenderer.H[0x4B63 ^ 0x4A12] = 0xFFFFE947 ^ 0x4A12;
        BlurredRectRenderer.H[0xF34 ^ 0xE39] = 0x77DE ^ 0xE39;
        BlurredRectRenderer.H[0xADD6 ^ 0xADB0] = 0xA774 ^ 0xADB0;
        BlurredRectRenderer.H[0x8106 ^ 0x8079] = 0x8079 ^ 0x8079;
        BlurredRectRenderer.H[0x28CE ^ 0x289B] = 0x28CF ^ 0x289B;
        BlurredRectRenderer.H[0x108FF ^ 0x108B5] = 0x108FC ^ 0x108B5;
        BlurredRectRenderer.H[0xB0A1 ^ 0xB040] = 0x6A95 ^ 0xB040;
        BlurredRectRenderer.H[0xF967 ^ 0xF869] = 0x81C1 ^ 0xF869;
        BlurredRectRenderer.H[0xF85A ^ 0xF812] = 0xF850 ^ 0xF812;
        BlurredRectRenderer.H[0x76E1 ^ 0x7694] = 0x76AF ^ 0x7694;
        BlurredRectRenderer.H[0x8F17 ^ 0x8E38] = 0x4CED ^ 0x8E38;
        BlurredRectRenderer.H[0x164C ^ 0x16DE] = 0xFFFFE969 ^ 0x16DE;
        BlurredRectRenderer.H[0xB38C ^ 0xB2B3] = 0x1277 ^ 0xB2B3;
        BlurredRectRenderer.H[0x7EDB ^ 0x7FB9] = 0xB050 ^ 0x7FB9;
        BlurredRectRenderer.H[0xD282 ^ 0xD3B9] = 0xEB3E ^ 0xD3B9;
        BlurredRectRenderer.H[0x83FC ^ 0x82D4] = 0x2112 ^ 0x82D4;
        BlurredRectRenderer.H[0x833C ^ 0x82B6] = 0xDFDC ^ 0x82B6;
        BlurredRectRenderer.H[0xD72B ^ 0xD645] = 0x3D48 ^ 0xD645;
        BlurredRectRenderer.H[0xFC7F ^ 0xFCE1] = 0xFFFF037A ^ 0xFCE1;
        BlurredRectRenderer.H[0x237B ^ 0x2369] = 0x2348 ^ 0x2369;
        BlurredRectRenderer.H[0xD5E ^ 0xC6A] = 0x5F4E ^ 0xC6A;
        BlurredRectRenderer.H[0xA3E3 ^ 0xA300] = 0x79D5 ^ 0xA300;
        BlurredRectRenderer.H[0xDE42 ^ 0xDE7C] = 0xFFFF21CF ^ 0xDE7C;
        BlurredRectRenderer.H[0x10D1F ^ 0x10D37] = 0xFFFEF28B ^ 0x10D37;
        BlurredRectRenderer.H[0x1240 ^ 0x129A] = 0xFFFF6F15 ^ 0x129A;
        BlurredRectRenderer.H[0xF5F4 ^ 0xF5E5] = 0xF580 ^ 0xF5E5;
        BlurredRectRenderer.H[0xE292 ^ 0xE3A3] = 0xFFFFDEEF ^ 0xE3A3;
        BlurredRectRenderer.H[0x9C8A ^ 0x9C51] = 0x1E19 ^ 0x9C51;
        BlurredRectRenderer.H[0x5809 ^ 0x58CB] = 0xFFFFCC6D ^ 0x58CB;
        BlurredRectRenderer.H[0x231D ^ 0x2363] = 0xFFFFDC85 ^ 0x2363;
        BlurredRectRenderer.H[0x106F2 ^ 0x10670] = 0x10625 ^ 0x10670;
        BlurredRectRenderer.H[0xBD71 ^ 0xBC2A] = 0x4A41 ^ 0xBC2A;
        BlurredRectRenderer.H[0xD673 ^ 0xD72F] = 0x2149 ^ 0xD72F;
        BlurredRectRenderer.H[0x538E ^ 0x52FB] = 0x2E07 ^ 0x52FB;
        BlurredRectRenderer.H[0x4231 ^ 0x42A8] = 0x4239 ^ 0x42A8;
        BlurredRectRenderer.H[0x1F0E ^ 0x1FBC] = 0x1FE4 ^ 0x1FBC;
        BlurredRectRenderer.H[0xDFC8 ^ 0xDF04] = 0xDE04 ^ 0xDF04;
        BlurredRectRenderer.H[0x9E0A ^ 0x9E1E] = 0x9E58 ^ 0x9E1E;
        BlurredRectRenderer.H[0x4A67 ^ 0x4A3E] = 0x4A11 ^ 0x4A3E;
        BlurredRectRenderer.H[0x7900 ^ 0x796F] = 0xFFFF860D ^ 0x796F;
        BlurredRectRenderer.H[0x2A67 ^ 0x2A1F] = 0x2A3A ^ 0x2A1F;
        BlurredRectRenderer.H[0x33B6 ^ 0x323B] = 0x74B ^ 0x323B;
        BlurredRectRenderer.H[0xD6DB ^ 0xD6DA] = 0xD6CD ^ 0xD6DA;
        BlurredRectRenderer.H[0xEF15 ^ 0xEFC4] = 0x50EA ^ 0xEFC4;
        BlurredRectRenderer.H[0xDBA8 ^ 0xDB84] = 0xFFFF247E ^ 0xDB84;
        BlurredRectRenderer.H[0xD288 ^ 0xD3C5] = 0xA7E3 ^ 0xD3C5;
        BlurredRectRenderer.H[0xA1C1 ^ 0xA088] = 0xED29 ^ 0xA088;
        BlurredRectRenderer.H[0x6AD1 ^ 0x6A11] = 0x14F ^ 0x6A11;
        BlurredRectRenderer.H[0xCA6 ^ 0xD93] = 0xFFFFA14E ^ 0xD93;
        BlurredRectRenderer.H[0x31F1 ^ 0x3169] = 0xFFFFCEC8 ^ 0x3169;
        BlurredRectRenderer.H[0x6CA ^ 0x603] = 0xF65F ^ 0x603;
        BlurredRectRenderer.H[0x8ECE ^ 0x8EAB] = 0x70A8 ^ 0x8EAB;
        BlurredRectRenderer.H[0x3085 ^ 0x31A3] = 0xD715 ^ 0x31A3;
        BlurredRectRenderer.H[0x21AE ^ 0x219F] = 0xFFFFDE05 ^ 0x219F;
        BlurredRectRenderer.H[0xD433 ^ 0xD4EC] = 0x14EC ^ 0xD4EC;
        BlurredRectRenderer.H[0x323E ^ 0x32BB] = 0xFFFFCD7C ^ 0x32BB;
        BlurredRectRenderer.H[0x5930 ^ 0x59C5] = 0x25EF ^ 0x59C5;
        BlurredRectRenderer.H[0xE5EF ^ 0xE5E6] = 0xE5D6 ^ 0xE5E6;
        BlurredRectRenderer.H[0x430D ^ 0x434B] = 0x4360 ^ 0x434B;
        BlurredRectRenderer.H[0x5756 ^ 0x5659] = 0x1954 ^ 0x5659;
        BlurredRectRenderer.H[0xDE7 ^ 0xD8B] = 0x7054 ^ 0xD8B;
        BlurredRectRenderer.H[0x216B ^ 0x21BF] = 0x16F9 ^ 0x21BF;
        BlurredRectRenderer.H[0xADB7 ^ 0xAD40] = 0xD16A ^ 0xAD40;
        BlurredRectRenderer.H[0x5B57 ^ 0x5ADE] = 0xA299 ^ 0x5ADE;
        BlurredRectRenderer.H[0xA632 ^ 0xA688] = 0xE998 ^ 0xA688;
        BlurredRectRenderer.H[0x4C15 ^ 0x4D29] = 0x75BE ^ 0x4D29;
        BlurredRectRenderer.H[0x4B86 ^ 0x4ABF] = 0x98EF ^ 0x4ABF;
        BlurredRectRenderer.H[0x69F ^ 0x682] = 0xFFFFF939 ^ 0x682;
        BlurredRectRenderer.H[0x7126 ^ 0x71A6] = 0x71BE ^ 0x71A6;
        BlurredRectRenderer.H[0xB019 ^ 0xB0FC] = 0x9DF5 ^ 0xB0FC;
        BlurredRectRenderer.H[0x10E86 ^ 0x10E90] = 0x10E90 ^ 0x10E90;
        BlurredRectRenderer.H[0xACF5 ^ 0xAC0A] = 0x7D60 ^ 0xAC0A;
        BlurredRectRenderer.H[0xE7AD ^ 0xE744] = 0x8EDE ^ 0xE744;
        BlurredRectRenderer.H[0x9AA8 ^ 0x9AEF] = 0x9AB2 ^ 0x9AEF;
        BlurredRectRenderer.H[0xFCE ^ 0xFF4] = 0xFFFFF03B ^ 0xFF4;
        BlurredRectRenderer.H[0x4295 ^ 0x4206] = 0xFFFFBD92 ^ 0x4206;
        BlurredRectRenderer.H[0xF10E ^ 0xF011] = 0xBB03 ^ 0xF011;
        BlurredRectRenderer.H[0x3D2A ^ 0x3D0E] = 0xFFFFC252 ^ 0x3D0E;
        BlurredRectRenderer.H[0x3E54 ^ 0x3F38] = 0xD435 ^ 0x3F38;
        BlurredRectRenderer.H[0xE748 ^ 0xE729] = 0xE605 ^ 0xE729;
        BlurredRectRenderer.H[0xA9EE ^ 0xA966] = 0xFFFF56FF ^ 0xA966;
        BlurredRectRenderer.H[0xD342 ^ 0xD37F] = 0xD367 ^ 0xD37F;
        BlurredRectRenderer.H[0x2FA ^ 0x24F] = 0x24D ^ 0x24F;
        BlurredRectRenderer.H[0xE5B8 ^ 0xE58F] = 0xE58E ^ 0xE58F;
        BlurredRectRenderer.H[0xFFAE ^ 0xFF76] = 0x7D33 ^ 0xFF76;
        BlurredRectRenderer.H[0xE74C ^ 0xE65C] = 0xA945 ^ 0xE65C;
        BlurredRectRenderer.H[0xA93E ^ 0xA9FF] = 0xC2AB ^ 0xA9FF;
        BlurredRectRenderer.H[0x4797 ^ 0x468B] = 0x34AD ^ 0x468B;
        BlurredRectRenderer.H[0x38AE ^ 0x383E] = 0x38F2 ^ 0x383E;
        BlurredRectRenderer.H[0x7295 ^ 0x73C8] = 0x85D0 ^ 0x73C8;
        BlurredRectRenderer.H[0x5B29 ^ 0x5A4C] = 0xA8ED ^ 0x5A4C;
        BlurredRectRenderer.H[0xEFAE ^ 0xEF5F] = 0x283C ^ 0xEF5F;
        BlurredRectRenderer.H[0xDE8E ^ 0xDE77] = 0x8B55 ^ 0xDE77;
        BlurredRectRenderer.H[0x8A0 ^ 0x83A] = 0xFFFFF7C0 ^ 0x83A;
        BlurredRectRenderer.H[0x6B29 ^ 0x6BBD] = 0x6BAF ^ 0x6BBD;
        BlurredRectRenderer.H[0x65B9 ^ 0x65D7] = 0x65D7 ^ 0x65D7;
        BlurredRectRenderer.H[0xFF6 ^ 0xFF6] = 0xFFFFF07D ^ 0xFF6;
        BlurredRectRenderer.H[0x48E ^ 0x50B] = 0xA4A ^ 0x50B;
        BlurredRectRenderer.H[0x71A1 ^ 0x71F9] = 0xFFFF8E3B ^ 0x71F9;
        BlurredRectRenderer.H[0x725 ^ 0x793] = 0x793 ^ 0x793;
        BlurredRectRenderer.H[0x41A ^ 0x4E6] = 0x4E6 ^ 0x4E6;
        BlurredRectRenderer.H[0xB4C0 ^ 0xB46C] = 0xB43F ^ 0xB46C;
        BlurredRectRenderer.H[0x1C07 ^ 0x1D26] = 0x5611 ^ 0x1D26;
        BlurredRectRenderer.H[0xF16A ^ 0xF05C] = 0xA378 ^ 0xF05C;
        BlurredRectRenderer.H[0x9015 ^ 0x902A] = 0x9034 ^ 0x902A;
        BlurredRectRenderer.H[0x2E9D ^ 0x2F9A] = 0xE0E6 ^ 0x2F9A;
        BlurredRectRenderer.H[0x882F ^ 0x8894] = 0xC794 ^ 0x8894;
        BlurredRectRenderer.H[0x10D4D ^ 0x10C5E] = 0x1241A ^ 0x10C5E;
        BlurredRectRenderer.H[0x20ED ^ 0x2055] = 0x2054 ^ 0x2055;
        BlurredRectRenderer.H[0x3CE0 ^ 0x3DAF] = 0x70D1 ^ 0x3DAF;
        BlurredRectRenderer.H[0x15B9 ^ 0x14B5] = 0x6D1D ^ 0x14B5;
        BlurredRectRenderer.H[0xCB23 ^ 0xCB3F] = 0xFFFF34D3 ^ 0xCB3F;
        BlurredRectRenderer.H[0xF2C6 ^ 0xF20C] = 0x200 ^ 0xF20C;
        BlurredRectRenderer.H[0xCFA1 ^ 0xCF5A] = 0x9A78 ^ 0xCF5A;
        BlurredRectRenderer.H[0x1631 ^ 0x174B] = 0xFE59 ^ 0x174B;
        BlurredRectRenderer.H[0x6BF4 ^ 0x6BED] = 0x6BC7 ^ 0x6BED;
        BlurredRectRenderer.H[0x2B ^ 0x17] = 0x65 ^ 0x17;
        BlurredRectRenderer.H[0xF28C ^ 0xF271] = 0xC93D ^ 0xF271;
        BlurredRectRenderer.H[0xF95F ^ 0xF979] = 0xF913 ^ 0xF979;
        BlurredRectRenderer.H[0xC29F ^ 0xC3AD] = 0x17C ^ 0xC3AD;
        BlurredRectRenderer.H[0x3C9A ^ 0x3CCD] = 0x3CDC ^ 0x3CCD;
        BlurredRectRenderer.H[0x865E ^ 0x877A] = 0x61CC ^ 0x877A;
        BlurredRectRenderer.H[0x535B ^ 0x53E8] = 0xFFFFAC6B ^ 0x53E8;
        BlurredRectRenderer.H[0xDCFC ^ 0xDDCC] = 0x1F1D ^ 0xDDCC;
        BlurredRectRenderer.H[0x10B5B ^ 0x10B14] = 0xFFFEF4EB ^ 0x10B14;
        BlurredRectRenderer.H[0x10341 ^ 0x10303] = 0xFFFEFCF8 ^ 0x10303;
        BlurredRectRenderer.H[0x7D30 ^ 0x7DE7] = 0x4AA6 ^ 0x7DE7;
        BlurredRectRenderer.H[0x8650 ^ 0x867D] = 0x86EA ^ 0x867D;
        BlurredRectRenderer.H[0x2390 ^ 0x22E7] = 0xCBEE ^ 0x22E7;
        BlurredRectRenderer.H[0x67EB ^ 0x6780] = 0x76F ^ 0x6780;
        BlurredRectRenderer.H[0x6F04 ^ 0x6F5E] = 0x6F5D ^ 0x6F5E;
        BlurredRectRenderer.H[0xCE03 ^ 0xCF65] = 0x3DCF ^ 0xCF65;
        BlurredRectRenderer.H[0x644B ^ 0x6535] = 0x937 ^ 0x6535;
        BlurredRectRenderer.H[0xAD55 ^ 0xAD87] = 0x12E4 ^ 0xAD87;
        BlurredRectRenderer.H[0x9B03 ^ 0x9BAC] = 0xFFFF6455 ^ 0x9BAC;
        BlurredRectRenderer.H[0x82F4 ^ 0x8377] = 0x8377 ^ 0x8377;
        BlurredRectRenderer.H[0x79F8 ^ 0x797E] = 0xFFFF86DA ^ 0x797E;
        BlurredRectRenderer.H[0x16F3 ^ 0x1615] = 0x3B21 ^ 0x1615;
        BlurredRectRenderer.H[0x10AED ^ 0x10A0A] = 0x12703 ^ 0x10A0A;
        BlurredRectRenderer.H[0x108B ^ 0x1086] = 0xFFFFEF4F ^ 0x1086;
        BlurredRectRenderer.H[0xE207 ^ 0xE2AA] = 0xE282 ^ 0xE2AA;
        BlurredRectRenderer.H[0xF422 ^ 0xF4F1] = 0x4BDF ^ 0xF4F1;
        BlurredRectRenderer.H[0x4077 ^ 0x4095] = 0x9A42 ^ 0x4095;
        BlurredRectRenderer.H[0x37BC ^ 0x37B0] = 0x37DE ^ 0x37B0;
        BlurredRectRenderer.H[0x2FA5 ^ 0x2FE8] = 0x2FA1 ^ 0x2FE8;
        BlurredRectRenderer.H[0x7AC5 ^ 0x7AF6] = 0xFFFF8518 ^ 0x7AF6;
        BlurredRectRenderer.H[0x4149 ^ 0x41C3] = 0x41EA ^ 0x41C3;
        BlurredRectRenderer.H[0xDA84 ^ 0xDA15] = 0xFFFF2588 ^ 0xDA15;
        BlurredRectRenderer.H[0xDF65 ^ 0xDFD2] = 0xDFD3 ^ 0xDFD2;
        BlurredRectRenderer.H[0xED44 ^ 0xEC36] = 0xB0DE ^ 0xEC36;
        BlurredRectRenderer.H[0x3493 ^ 0x340F] = 0xFFFFCB71 ^ 0x340F;
        BlurredRectRenderer.H[0x91EC ^ 0x91BA] = 0x91AD ^ 0x91BA;
        BlurredRectRenderer.H[0xC1ED ^ 0xC0AD] = 0x6065 ^ 0xC0AD;
        BlurredRectRenderer.H[0x31C1 ^ 0x31B3] = 0xFFFFCE58 ^ 0x31B3;
        BlurredRectRenderer.H[0x8E5A ^ 0x8E14] = 0x8E72 ^ 0x8E14;
        BlurredRectRenderer.H[0xE46E ^ 0xE55D] = 0xB677 ^ 0xE55D;
        BlurredRectRenderer.H[0x4DFB ^ 0x4DFD] = 0x4D9E ^ 0x4DFD;
        BlurredRectRenderer.H[0xCA0B ^ 0xCA72] = 0xFFFF35FD ^ 0xCA72;
        BlurredRectRenderer.H[0x7C17 ^ 0x7C54] = 0x7C14 ^ 0x7C54;
        BlurredRectRenderer.H[0xCE5E ^ 0xCE23] = 0xCE59 ^ 0xCE23;
        BlurredRectRenderer.H[0xFAC8 ^ 0xFB92] = 0xE3EF ^ 0xFB92;
        BlurredRectRenderer.H[0x684E ^ 0x694A] = 0x16E8E ^ 0x694A;
        BlurredRectRenderer.H[0xC135 ^ 0xC117] = 0xFFFF3E88 ^ 0xC117;
        BlurredRectRenderer.H[0x458D ^ 0x4586] = 0x45AB ^ 0x4586;
        BlurredRectRenderer.H[0xF004 ^ 0xF157] = 0x7F3B ^ 0xF157;
        BlurredRectRenderer.H[0x9018 ^ 0x90D7] = 0x91D9 ^ 0x90D7;
        BlurredRectRenderer.H[0xF70D ^ 0xF723] = 0xF70B ^ 0xF723;
        BlurredRectRenderer.H[0xA779 ^ 0xA7A5] = 0x67A7 ^ 0xA7A5;
        BlurredRectRenderer.H[0xFF77 ^ 0xFFC9] = 0xFFFF482E ^ 0xFFC9;
        BlurredRectRenderer.H[0x99FA ^ 0x98DA] = 0xD3C3 ^ 0x98DA;
        BlurredRectRenderer.H[0x659F ^ 0x65EF] = 0x65C1 ^ 0x65EF;
        BlurredRectRenderer.H[0xF0FD ^ 0xF097] = 0xA48A ^ 0xF097;
        BlurredRectRenderer.H[0x9113 ^ 0x9174] = 0x3442 ^ 0x9174;
        BlurredRectRenderer.H[0x1E1B ^ 0x1E98] = 0x1EFF ^ 0x1E98;
        BlurredRectRenderer.H[0xE443 ^ 0xE546] = 0x1E2FD ^ 0xE546;
        BlurredRectRenderer.H[0x1377 ^ 0x13EA] = 0xFFFFEC11 ^ 0x13EA;
        BlurredRectRenderer.H[0x1877 ^ 0x19F8] = 0x7C2A ^ 0x19F8;
        BlurredRectRenderer.H[0x9496 ^ 0x9417] = 0x9406 ^ 0x9417;
        BlurredRectRenderer.H[0x10635 ^ 0x106E0] = 0x131A1 ^ 0x106E0;
        BlurredRectRenderer.H[0xB72F ^ 0xB719] = 0xB75A ^ 0xB719;
        BlurredRectRenderer.H[0x5E4 ^ 0x55B] = 0x4D66 ^ 0x55B;
        BlurredRectRenderer.H[0x107B3 ^ 0x106B0] = 0x16C ^ 0x106B0;
        BlurredRectRenderer.H[0x10A6A ^ 0x10A16] = 0xFFFEF5BE ^ 0x10A16;
        BlurredRectRenderer.H[0xE5B0 ^ 0xE43B] = 0x88F7 ^ 0xE43B;
        BlurredRectRenderer.H[0xEBE3 ^ 0xEAEA] = 0xFFFFDA15 ^ 0xEAEA;
        BlurredRectRenderer.H[0x4B50 ^ 0x4A37] = 0x97E4 ^ 0x4A37;
        BlurredRectRenderer.H[0xB7EB ^ 0xB70B] = 0x6DD2 ^ 0xB70B;
        BlurredRectRenderer.H[0x4C46 ^ 0x4CA9] = 0x1F7B ^ 0x4CA9;
        BlurredRectRenderer.H[0x7620 ^ 0x776E] = 0x34D ^ 0x776E;
        BlurredRectRenderer.H[0xE8F4 ^ 0xE8FE] = 0xFFFF1700 ^ 0xE8FE;
        BlurredRectRenderer.H[0xA151 ^ 0xA02C] = 0xFFFF33A1 ^ 0xA02C;
        BlurredRectRenderer.H[0xFAE3 ^ 0xFAE1] = 0xFFFF0566 ^ 0xFAE1;
        BlurredRectRenderer.H[0xE395 ^ 0xE3C6] = 0xE3F8 ^ 0xE3C6;
        BlurredRectRenderer.H[0x68FF ^ 0x69D2] = 0xFFFF09A7 ^ 0x69D2;
        BlurredRectRenderer.H[0xE67B ^ 0xE710] = 0xC0C ^ 0xE710;
        BlurredRectRenderer.H[0x10120 ^ 0x101E4] = 0x10DA9 ^ 0x101E4;
        BlurredRectRenderer.H[0x4B2F ^ 0x4A67] = 0x7F5 ^ 0x4A67;
        BlurredRectRenderer.H[0xE57D ^ 0xE557] = 0xE52B ^ 0xE557;
        BlurredRectRenderer.H[0x106AA ^ 0x107EF] = 0xFFFEF28E ^ 0x107EF;
    }
}

