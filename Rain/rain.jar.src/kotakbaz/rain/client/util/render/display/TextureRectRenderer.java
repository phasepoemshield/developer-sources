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
import kotakbaz.rain.client.render.texture.A;
import kotakbaz.rain.client.util.color.QuadColor;
import kotakbaz.rain.client.util.render.display.AdvancedRectRenderer;
import kotakbaz.rain.client.util.render.display.e;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector4f;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 -2\u00020\u0001:\u0001-B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\f\u0010\rJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\b\f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\b\u0015\u0010\u0016Jm\u0010$\u001a\u00020#2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011\u00a2\u0006\u0004\b$\u0010%Jy\u0010$\u001a\u00020#2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010 \u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020\u0011\u00a2\u0006\u0004\b$\u0010&Jy\u0010$\u001a\u00020#2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010 \u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020\u0011\u00a2\u0006\u0004\b$\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0003\u0010(R\u0016\u0010)\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b+\u0010,\u00a8\u0006."}, d2={"Lkotakbaz/rain/client/util/render/display/TextureRectRenderer;", "", "Lkotakbaz/rain/client/util/render/display/AdvancedRectRenderer;", "advanced", "<init>", "(Lkotakbaz/rain/client/util/render/display/AdvancedRectRenderer;)V", "Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "pipeline", "priority", "(Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/TextureRectRenderer;", "", "id", "texture", "(I)Lkotakbaz/rain/client/util/render/display/TextureRectRenderer;", "Lkotakbaz/rain/client/render/texture/GlTex;", "glTex", "(Lkotakbaz/rain/client/render/texture/GlTex;)Lkotakbaz/rain/client/util/render/display/TextureRectRenderer;", "", "width", "Ljava/awt/Color;", "color", "border", "(FLjava/awt/Color;)Lkotakbaz/rain/client/util/render/display/TextureRectRenderer;", "x", "y", "height", "Lkotakbaz/rain/client/util/color/QuadColor;", "Lorg/joml/Vector4f;", "radius", "mix", "u", "v", "texW", "texH", "alpha", "", "draw", "(FFFFLkotakbaz/rain/client/util/color/QuadColor;Lorg/joml/Vector4f;FFFFFF)V", "(FFFFLjava/awt/Color;FFFFFFF)V", "(FFFFLjava/awt/Color;Lorg/joml/Vector4f;FFFFFF)V", "Lkotakbaz/rain/client/util/render/display/AdvancedRectRenderer;", "cachedBorderWidth", "F", "cachedBorderColor", "Ljava/awt/Color;", "Companion", "rain-visuals"})
public final class TextureRectRenderer {
    @NotNull
    public static final e a;
    @NotNull
    private final AdvancedRectRenderer A;
    private float b;
    @NotNull
    private Color B;
    @NotNull
    private static final Color c;
    private static Object[] C;
    private static Object D;
    private static Object[] e;
    private static Object[] d;
    private static Object[] E;
    public static int[] f;

    public TextureRectRenderer(@NotNull AdvancedRectRenderer advanced) {
        int n2 = f[0];
        n2 ^= f[1];
        Intrinsics.checkNotNullParameter(advanced, (String)C[n2 -= f[2]]);
        this.A = advanced;
        this.B = c;
    }

    @NotNull
    public final TextureRectRenderer priority(@NotNull ClientRenderPipeline pipeline) {
        int n2 = f[3];
        n2 += f[4];
        Intrinsics.checkNotNullParameter((Object)pipeline, (String)C[n2 ^= f[5]]);
        this.A.priority(pipeline);
        return this;
    }

    @NotNull
    public final TextureRectRenderer texture(int id) {
        this.A.texture(id);
        return this;
    }

    @NotNull
    public final TextureRectRenderer texture(@NotNull A glTex) {
        int n2 = f[6];
        n2 ^= f[7];
        Intrinsics.checkNotNullParameter(glTex, (String)C[n2 += f[8]]);
        this.A.texture(glTex);
        return this;
    }

    @NotNull
    public final TextureRectRenderer border(float width2, @NotNull Color color) {
        int n2 = f[9];
        n2 -= f[10];
        Intrinsics.checkNotNullParameter(color, (String)C[n2 ^= f[11]]);
        this.b = width2;
        this.B = color;
        return this;
    }

    public final void draw(float x2, float y, float width2, float height, @NotNull QuadColor color, @NotNull Vector4f radius, float mix, float u, float v, float texW, float texH, float alpha2) {
        int n2 = f[12];
        n2 += f[13];
        Intrinsics.checkNotNullParameter(color, (String)C[n2 ^= f[14]]);
        int n3 = f[15];
        n3 += f[16];
        Intrinsics.checkNotNullParameter(radius, (String)C[n3 -= f[17]]);
        this.A.border(this.b, this.B).drawTexture(x2, y, width2, height, color, mix, alpha2, u, v, texW, texH, radius);
        this.A.border(0.0f, c);
        this.b = 0.0f;
        this.B = c;
    }

    public final void draw(float x2, float y, float width2, float height, @NotNull Color color, float radius, float mix, float u, float v, float texW, float texH, float alpha2) {
        int n2 = f[18];
        n2 -= f[19];
        Intrinsics.checkNotNullParameter(color, (String)C[n2 -= f[20]]);
        this.draw(x2, y, width2, height, new QuadColor(color), new Vector4f(radius, radius, radius, radius), mix, u, v, texW, texH, alpha2);
    }

    public static /* synthetic */ void draw$default(TextureRectRenderer textureRectRenderer, float f2, float f3, float f4, float f5, Color color, float f6, float f7, float f8, float f9, float f10, float f11, float f12, int n2, Object object) {
        int n3 = f[21];
        n3 -= f[22];
        if ((n2 & (n3 += f[23])) != 0) {
            f7 = 0.0f;
        }
        int n4 = f[24];
        n4 ^= f[25];
        if ((n2 & (n4 += f[26])) != 0) {
            f8 = 0.0f;
        }
        int n5 = f[27];
        n5 -= f[28];
        if ((n2 & (n5 += f[29])) != 0) {
            f9 = 0.0f;
        }
        int n6 = f[30];
        n6 += f[31];
        if ((n2 & (n6 -= f[32])) != 0) {
            f10 = 1.0f;
        }
        int n7 = f[33];
        n7 ^= f[34];
        if ((n2 & (n7 ^= f[35])) != 0) {
            f11 = 1.0f;
        }
        int n8 = f[36];
        n8 -= f[37];
        if ((n2 & (n8 ^= f[38])) != 0) {
            f12 = 1.0f;
        }
        textureRectRenderer.draw(f2, f3, f4, f5, color, f6, f7, f8, f9, f10, f11, f12);
    }

    public final void draw(float x2, float y, float width2, float height, @NotNull Color color, @NotNull Vector4f radius, float mix, float u, float v, float texW, float texH, float alpha2) {
        int n2 = f[39];
        n2 -= f[40];
        Intrinsics.checkNotNullParameter(color, (String)C[n2 -= f[41]]);
        int n3 = f[42];
        n3 += f[43];
        Intrinsics.checkNotNullParameter(radius, (String)C[n3 += f[44]]);
        this.draw(x2, y, width2, height, new QuadColor(color), radius, mix, u, v, texW, texH, alpha2);
    }

    public static /* synthetic */ void draw$default(TextureRectRenderer textureRectRenderer, float f2, float f3, float f4, float f5, Color color, Vector4f vector4f, float f6, float f7, float f8, float f9, float f10, float f11, int n2, Object object) {
        int n3 = f[45];
        n3 ^= f[46];
        if ((n2 & (n3 ^= f[47])) != 0) {
            f6 = 0.0f;
        }
        int n4 = f[48];
        n4 -= f[49];
        if ((n2 & (n4 ^= f[50])) != 0) {
            f7 = 0.0f;
        }
        int n5 = f[51];
        n5 ^= f[52];
        if ((n2 & (n5 -= f[53])) != 0) {
            f8 = 0.0f;
        }
        int n6 = f[54];
        n6 ^= f[55];
        if ((n2 & (n6 ^= f[56])) != 0) {
            f9 = 1.0f;
        }
        int n7 = f[57];
        n7 ^= f[58];
        if ((n2 & (n7 += f[59])) != 0) {
            f10 = 1.0f;
        }
        int n8 = f[60];
        n8 ^= f[61];
        if ((n2 & (n8 += f[62])) != 0) {
            f11 = 1.0f;
        }
        textureRectRenderer.draw(f2, f3, f4, f5, color, vector4f, f6, f7, f8, f9, f10, f11);
    }

    static {
        TextureRectRenderer.b();
        long l2 = 8036656612308128107L;
        long l3 = -2610259515241723145L;
        long l4 = -1520137190153642171L;
        long l5 = 3040779131357594935L;
        long l6 = 5555173378020229439L;
        long l7 = -5912478464531744832L;
        long l8 = -5746565187473096541L;
        long l9 = 5759357476172834059L;
        long l10 = 1319550735018093442L;
        long l11 = -6987060679636327383L;
        long l12 = -8956934038736972382L;
        long l13 = 5527532281866210514L;
        long l14 = -135123586300365646L;
        long l15 = 73788519403999421L;
        int n2 = f[63];
        n2 += f[64];
        C = new Object[n2 ^= f[65]];
        long l16 = l15;
        int n3 = f[66];
        n3 += f[67];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 ^= f[68]);
        Object[] objectArray = new Object[f[69]];
        objectArray[TextureRectRenderer.f[70]] = d;
        objectArray[TextureRectRenderer.f[71]] = f[72];
        int n4 = f[73];
        Object object = TextureRectRenderer.A()[f[74]];
        if (object == null) {
            char[] cArray = "\u9517\u954e\u9532\u9516\u9555\u94fc\u9555\u955f\u949b\u9534\u952e\u94fd\u9551\u9542\u94ff\u9557\u94fc\u9537\u9551\u9551\u94fb\u9561\u9563\u955a\u94f8\u9563\u9536\u9530\u949b\u9557\u9512\u9551\u9553\u9563\u9515\u9530\u9549\u9564\u9499\u9563\u9549\u9515\u9560\u9512\u9556\u9533\u9514\u9553\u955e\u9499\u9543\u9565\u9515\u9562\u94fd\u94fb\u9547\u9533\u952e\u952e\u9535\u9499\u955e\u9513\u9555\u9531\u954e\u9559\u9544\u949f\u955c\u9550\u9552\u9512\u9562\u9500\u9501\u9567\u955f\u94fb\u9563\u9554\u9555\u9517\u94fe\u9556\u9499\u9562\u94fb\u9560\u9556\u949b\u9547\u955a\u9512\u9533\u952e\u94fd\u9558\u94f8\u9561\u9514\u94fe\u9536\u955d\u9515\u9564\u9542\u9550\u9515\u9512\u94fe\u949b\u9564\u9537\u9555\u9566\u955f\u9544\u9556\u9532\u9569\u9550\u9549\u94f9\u955a\u955e\u94fd".toCharArray();
            for (int i2 = f[75]; i2 < f[76]; ++i2) {
                int n5 = cArray[i2];
                n5 -= f[77];
                n5 ^= f[78];
                n5 ^= f[79];
                n5 ^= f[80];
                n5 ^= f[81];
                n5 += f[82];
                n5 -= f[83];
                n5 += f[84];
                n5 ^= f[85];
                cArray[i2] = (char)(n5 -= f[86]);
            }
            object = TextureRectRenderer.A()[TextureRectRenderer.f[87]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)TextureRectRenderer.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = f[88];
        n6 ^= f[89];
        l6 = l17 ^ (0x4700000000L ^ l17) & -1L << (n6 -= f[90]);
        long l18 = l13;
        int n7 = f[91];
        n7 += f[92];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 ^= f[93]);
        while (true) {
            int n8 = f[94];
            n8 -= f[95];
            if ((int)l13 >= (int)(l6 >>> (n8 ^= f[96]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = f[97];
            n10 += f[98];
            int n11 = f[100];
            n11 += f[101];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 ^= f[99])) & -1L >>> (n11 -= f[102]);
            long l20 = l9;
            int n12 = f[103];
            n12 ^= f[104];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 -= f[105]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = f[106];
            n14 -= f[107];
            int n15 = f[109];
            n15 ^= f[110];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= f[108])) & -1L >>> (n15 += f[111]);
            int n16 = f[112];
            n16 ^= f[113];
            long l22 = l10;
            int n17 = f[115];
            n17 += f[116];
            l10 = l22 ^ ((long)cArray[n13] << (n16 ^= f[114]) ^ l22) & -1L << (n17 ^= f[117]);
            int n18 = f[118];
            n18 ^= f[119];
            n18 -= f[120];
            int n19 = f[121];
            n19 += f[122];
            long l23 = l12;
            int n20 = f[124];
            n20 ^= f[125];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 ^= f[123]))) ^ l23) & -1L >>> (n20 += f[126]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = f[127];
            n21 += f[128];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 ^= f[129]);
            while (true) {
                int n22 = f[130];
                n22 += f[131];
                if ((int)(l14 >>> (n22 += f[132])) >= (int)l12) break;
                int n23 = f[133];
                n23 += f[134];
                int n24 = f[136];
                n24 ^= f[137];
                cArray2[(int)(l14 >>> (n23 += TextureRectRenderer.f[135]))] = cArray[(int)l13 + (int)(l14 >>> (n24 -= f[138]))];
                l14 += 0x100000000L;
            }
            int n25 = f[139];
            n25 -= f[140];
            int n26 = (int)(l15 >>> (n25 ^= f[141]));
            l15 += 0x100000000L;
            TextureRectRenderer.C[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = f[142];
            n27 -= f[143];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 += f[144]);
        }
        a = new e(null);
        int n28 = f[145];
        n28 += f[146];
        n28 += f[147];
        int n29 = f[148];
        n29 += f[149];
        int n30 = f[151];
        n30 += f[152];
        int n31 = f[154];
        n31 += f[155];
        c = new Color(n28, n29 -= f[150], n30 += f[153], n31 -= f[156]);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[f[157]];
        String string = (String)object[f[158]];
        object = object[f[159]];
        Object[] objectArray = e;
        if (e == null) {
            objectArray = e = new Object[f[160]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[f[161]];
                d = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[f[163] ^ f[164]];
                byArray[TextureRectRenderer.f[165] ^ TextureRectRenderer.f[166]] = f[167] ^ f[168];
                byArray[TextureRectRenderer.f[169] ^ TextureRectRenderer.f[170]] = f[171] ^ f[172];
                byArray[TextureRectRenderer.f[173] ^ TextureRectRenderer.f[174]] = f[175] ^ f[176];
                byArray[TextureRectRenderer.f[177] ^ TextureRectRenderer.f[178]] = f[179] ^ f[180];
                byArray[TextureRectRenderer.f[181] ^ TextureRectRenderer.f[182]] = f[183] ^ f[184];
                byArray[TextureRectRenderer.f[185] ^ TextureRectRenderer.f[186]] = f[187] ^ f[188];
                byArray[TextureRectRenderer.f[189] ^ TextureRectRenderer.f[190]] = f[191] ^ f[192];
                byArray[TextureRectRenderer.f[193] ^ TextureRectRenderer.f[194]] = f[195] ^ f[196];
                byArray[TextureRectRenderer.f[197] ^ TextureRectRenderer.f[198]] = f[199] ^ f[200];
                byArray[TextureRectRenderer.f[201] ^ TextureRectRenderer.f[202]] = f[203] ^ f[204];
                byArray[TextureRectRenderer.f[205] ^ TextureRectRenderer.f[206]] = f[207] ^ f[208];
                byArray[TextureRectRenderer.f[209] ^ TextureRectRenderer.f[210]] = f[211] ^ f[212];
                byArray[TextureRectRenderer.f[213] ^ TextureRectRenderer.f[214]] = f[215] ^ f[216];
                byArray[TextureRectRenderer.f[217] ^ TextureRectRenderer.f[218]] = f[219] ^ f[220];
                byArray[TextureRectRenderer.f[221] ^ TextureRectRenderer.f[222]] = f[223] ^ f[224];
                byArray[TextureRectRenderer.f[225] ^ TextureRectRenderer.f[226]] = f[227] ^ f[228];
                objectArray2[TextureRectRenderer.f[162]] = byArray;
            }
            byte[] byArray = (byte[])object3[f[229]];
            if (D == null) {
                byte[] byArray2 = new byte[f[230] ^ f[231]];
                byArray2[TextureRectRenderer.f[232] ^ TextureRectRenderer.f[233]] = f[234] ^ f[235];
                byArray2[TextureRectRenderer.f[236] ^ TextureRectRenderer.f[237]] = f[238] ^ f[239];
                byArray2[TextureRectRenderer.f[240] ^ TextureRectRenderer.f[241]] = f[242] ^ f[243];
                byArray2[TextureRectRenderer.f[244] ^ TextureRectRenderer.f[245]] = f[246] ^ f[247];
                byArray2[TextureRectRenderer.f[248] ^ TextureRectRenderer.f[249]] = f[250] ^ f[251];
                byArray2[TextureRectRenderer.f[252] ^ TextureRectRenderer.f[253]] = f[254] ^ f[255];
                byArray2[TextureRectRenderer.f[256] ^ TextureRectRenderer.f[257]] = f[258] ^ f[259];
                byArray2[TextureRectRenderer.f[260] ^ TextureRectRenderer.f[261]] = f[262] ^ f[263];
                byArray2[TextureRectRenderer.f[264] ^ TextureRectRenderer.f[265]] = f[266] ^ f[267];
                byArray2[TextureRectRenderer.f[268] ^ TextureRectRenderer.f[269]] = f[270] ^ f[271];
                byArray2[TextureRectRenderer.f[272] ^ TextureRectRenderer.f[273]] = f[274] ^ f[275];
                byArray2[TextureRectRenderer.f[276] ^ TextureRectRenderer.f[277]] = f[278] ^ f[279];
                byArray2[TextureRectRenderer.f[280] ^ TextureRectRenderer.f[281]] = f[282] ^ f[283];
                byArray2[TextureRectRenderer.f[284] ^ TextureRectRenderer.f[285]] = f[286] ^ f[287];
                byArray2[TextureRectRenderer.f[288] ^ TextureRectRenderer.f[289]] = f[290] ^ f[291];
                byArray2[TextureRectRenderer.f[292] ^ TextureRectRenderer.f[293]] = f[294] ^ f[295];
                byArray2[TextureRectRenderer.f[296] ^ TextureRectRenderer.f[297]] = f[298] ^ f[299];
                byArray2[TextureRectRenderer.f[300] ^ TextureRectRenderer.f[301]] = f[302] ^ f[303];
                byArray2[TextureRectRenderer.f[304] ^ TextureRectRenderer.f[305]] = f[306] ^ f[307];
                byArray2[TextureRectRenderer.f[308] ^ TextureRectRenderer.f[309]] = f[310] ^ f[311];
                byArray2[TextureRectRenderer.f[312] ^ TextureRectRenderer.f[313]] = f[314] ^ f[315];
                byArray2[TextureRectRenderer.f[316] ^ TextureRectRenderer.f[317]] = f[318] ^ f[319];
                byArray2[TextureRectRenderer.f[320] ^ TextureRectRenderer.f[321]] = f[322] ^ f[323];
                byArray2[TextureRectRenderer.f[324] ^ TextureRectRenderer.f[325]] = f[326] ^ f[327];
                byArray2[TextureRectRenderer.f[328] ^ TextureRectRenderer.f[329]] = f[330] ^ f[331];
                byArray2[TextureRectRenderer.f[332] ^ TextureRectRenderer.f[333]] = f[334] ^ f[335];
                byArray2[TextureRectRenderer.f[336] ^ TextureRectRenderer.f[337]] = f[338] ^ f[339];
                byArray2[TextureRectRenderer.f[340] ^ TextureRectRenderer.f[341]] = f[342] ^ f[343];
                byArray2[TextureRectRenderer.f[344] ^ TextureRectRenderer.f[345]] = f[346] ^ f[347];
                byArray2[TextureRectRenderer.f[348] ^ TextureRectRenderer.f[349]] = f[350] ^ f[351];
                byArray2[TextureRectRenderer.f[352] ^ TextureRectRenderer.f[353]] = f[354] ^ f[355];
                byArray2[TextureRectRenderer.f[356] ^ TextureRectRenderer.f[357]] = f[358] ^ f[359];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, f[360], byArray3, f[361], byArray.length);
                System.arraycopy(byArray2, f[362], byArray3, byArray.length, byArray2.length);
                Object object4 = TextureRectRenderer.A()[f[363]];
                if (object4 == null) {
                    char[] cArray = "\u79db\u79ed\u79d6\u79ef\u79d1\u793d\u79c2\u79f4\u79ff\u79f3\u79d3\u79f8\u798c\u798e\u79de\u79d3\u79ec\u793c".toCharArray();
                    for (int i2 = f[364]; i2 < f[365]; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= f[366];
                        n3 -= f[367];
                        n3 += f[368];
                        n3 += f[369];
                        n3 += f[370];
                        n3 ^= f[371];
                        n3 ^= f[372];
                        n3 += f[373];
                        n3 += f[374];
                        n3 += f[375];
                        cArray[i2] = (char)(n3 += f[376]);
                    }
                    object4 = TextureRectRenderer.A()[TextureRectRenderer.f[377]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[f[378]];
                byArray4[TextureRectRenderer.f[379]] = f[380];
                byArray4[TextureRectRenderer.f[381]] = f[382];
                byArray4[TextureRectRenderer.f[383]] = f[384];
                byArray4[TextureRectRenderer.f[385]] = f[386];
                byArray4[TextureRectRenderer.f[387]] = f[388];
                byArray4[TextureRectRenderer.f[389]] = f[390];
                byArray4[TextureRectRenderer.f[391]] = f[392];
                byArray4[TextureRectRenderer.f[393]] = f[394];
                byArray4[TextureRectRenderer.f[395]] = f[396];
                byArray4[TextureRectRenderer.f[397]] = f[398];
                byArray4[TextureRectRenderer.f[399]] = 81;
                byArray4[3] = 93;
                byArray4[5] = -75;
                byArray4[1] = 58;
                byArray4[6] = -76;
                byArray4[4] = 79;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 26, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = TextureRectRenderer.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u0ae8\u0ae4\u0afa".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= 40464;
                        n4 ^= 0xE6A1;
                        n4 ^= 0x52C3;
                        n4 += 57987;
                        n4 += 34373;
                        n4 += 46165;
                        n4 ^= 0xE767;
                        n4 += 63992;
                        n4 -= 36922;
                        n4 -= 18620;
                        cArray[i3] = (char)(n4 += 52367);
                    }
                    object5 = TextureRectRenderer.A()[2] = new String(cArray);
                }
                D = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = TextureRectRenderer.A()[3];
            if (object6 == null) {
                char[] cArray = "\ucca9\ucc9d\ucc17\ucc83\ucca7\uccaa\ucca7\ucc83\ucc0c\ucc0f\ucca7\ucc17\ucc6d\ucc0c\uccc9\uccc0\uccc0\uccb1\uccc6\uccbb".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 += 52176;
                    n5 -= 28001;
                    n5 += 19938;
                    n5 += 62067;
                    n5 -= 14611;
                    n5 += 40820;
                    n5 ^= 0x4BB6;
                    n5 += 34358;
                    n5 -= 21065;
                    n5 ^= 0xFEAB;
                    cArray[i4] = (char)(n5 ^= 0x308F);
                }
                object6 = TextureRectRenderer.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)D), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = E;
        if (E == null) {
            E = new Object[4];
            objectArray = E;
        }
        return objectArray;
    }

    public static void b() {
        f = new int[0x959A ^ 0x940A];
        TextureRectRenderer.f[0xD73E ^ 0xD76C] = 0xF6C4 ^ 0xD76C;
        TextureRectRenderer.f[0x187 ^ 0x1E5] = 0x1F2 ^ 0x1E5;
        TextureRectRenderer.f[0xADA2 ^ 0xAD8E] = 0xAD97 ^ 0xAD8E;
        TextureRectRenderer.f[0xAF82 ^ 0xAE09] = 0xAE09 ^ 0xAE09;
        TextureRectRenderer.f[0xC866 ^ 0xC89E] = 0xE166 ^ 0xC89E;
        TextureRectRenderer.f[0xAD15 ^ 0xAC61] = 0xBA6 ^ 0xAC61;
        TextureRectRenderer.f[0xC864 ^ 0xC810] = 0xFFFF37A9 ^ 0xC810;
        TextureRectRenderer.f[0xD610 ^ 0xD766] = 0x584F ^ 0xD766;
        TextureRectRenderer.f[0x6267 ^ 0x63E8] = 0x63E1 ^ 0x63E8;
        TextureRectRenderer.f[0x831B ^ 0x826A] = 0x72AF ^ 0x826A;
        TextureRectRenderer.f[0xE5E9 ^ 0xE56A] = 0xFFFF1AC2 ^ 0xE56A;
        TextureRectRenderer.f[0x18EC ^ 0x18FC] = 0x18BF ^ 0x18FC;
        TextureRectRenderer.f[0x75F6 ^ 0x74FE] = 0x6271 ^ 0x74FE;
        TextureRectRenderer.f[0x35 ^ 0xA4] = 6 ^ 0xA4;
        TextureRectRenderer.f[0x4AF ^ 0x4A4] = 0xFFFFFB11 ^ 0x4A4;
        TextureRectRenderer.f[0x2122 ^ 0x2160] = 0xFFFFDEB5 ^ 0x2160;
        TextureRectRenderer.f[0x5CA8 ^ 0x5C61] = 0x5D78 ^ 0x5C61;
        TextureRectRenderer.f[0x400D ^ 0x40C5] = 0xAD3C ^ 0x40C5;
        TextureRectRenderer.f[0x9D57 ^ 0x9C55] = 0x251A ^ 0x9C55;
        TextureRectRenderer.f[0x377F ^ 0x3781] = 0xFFFF4A73 ^ 0x3781;
        TextureRectRenderer.f[0x857B ^ 0x855A] = 0xFFFF7EE0 ^ 0x855A;
        TextureRectRenderer.f[0x9837 ^ 0x98AF] = 0xFFFF6722 ^ 0x98AF;
        TextureRectRenderer.f[0x44C1 ^ 0x4426] = 0x7612 ^ 0x4426;
        TextureRectRenderer.f[0x889D ^ 0x89E2] = 0x89EE ^ 0x89E2;
        TextureRectRenderer.f[0xFBE ^ 0xE9A] = 0x52AD ^ 0xE9A;
        TextureRectRenderer.f[0xADF5 ^ 0xAD47] = 0xAD32 ^ 0xAD47;
        TextureRectRenderer.f[0xBCE ^ 0xB62] = 0x10D18 ^ 0xB62;
        TextureRectRenderer.f[0xC8B4 ^ 0xC9A9] = 0x7281 ^ 0xC9A9;
        TextureRectRenderer.f[0xA34F ^ 0xA3CA] = 0xA3ED ^ 0xA3CA;
        TextureRectRenderer.f[0x116D ^ 0x113B] = 0xFA35 ^ 0x113B;
        TextureRectRenderer.f[0xE278 ^ 0xE306] = 0xFFFF1CD2 ^ 0xE306;
        TextureRectRenderer.f[0x925C ^ 0x9283] = 0xA083 ^ 0x9283;
        TextureRectRenderer.f[0xF43E ^ 0xF4DD] = 0xEF40 ^ 0xF4DD;
        TextureRectRenderer.f[0x1C79 ^ 0x1CB2] = 0xFFFFE27E ^ 0x1CB2;
        TextureRectRenderer.f[0x1756 ^ 0x17F8] = 0x35E6 ^ 0x17F8;
        TextureRectRenderer.f[0xEE8E ^ 0xEE58] = 0x6864 ^ 0xEE58;
        TextureRectRenderer.f[0xEB67 ^ 0xEB0A] = 0xFFFF1473 ^ 0xEB0A;
        TextureRectRenderer.f[0x1555 ^ 0x1443] = 0xB650 ^ 0x1443;
        TextureRectRenderer.f[0x61B ^ 0x601] = 0x616 ^ 0x601;
        TextureRectRenderer.f[0x3135 ^ 0x3042] = 0xA89 ^ 0x3042;
        TextureRectRenderer.f[0x2F27 ^ 0x2FA6] = 0x2FAA ^ 0x2FA6;
        TextureRectRenderer.f[0x10EFA ^ 0x10E0D] = 0x16520 ^ 0x10E0D;
        TextureRectRenderer.f[0x9D63 ^ 0x9C6C] = 0x76C5 ^ 0x9C6C;
        TextureRectRenderer.f[0xE282 ^ 0xE3E3] = 0x9290 ^ 0xE3E3;
        TextureRectRenderer.f[0xF044 ^ 0xF122] = 0xFFFE00FB ^ 0xF122;
        TextureRectRenderer.f[0xC0F0 ^ 0xC033] = 0xFFFF0CC0 ^ 0xC033;
        TextureRectRenderer.f[0xD9CF ^ 0xD8A6] = 0xD8A6 ^ 0xD8A6;
        TextureRectRenderer.f[0xB8E ^ 0xB1D] = 0xFFFFF4AD ^ 0xB1D;
        TextureRectRenderer.f[0x1E77 ^ 0x1F44] = 0xFE75 ^ 0x1F44;
        TextureRectRenderer.f[0x3825 ^ 0x3965] = 0xE798 ^ 0x3965;
        TextureRectRenderer.f[0x8FF5 ^ 0x8F0E] = 0xA6E7 ^ 0x8F0E;
        TextureRectRenderer.f[0xFE82 ^ 0xFEF0] = 0xFECD ^ 0xFEF0;
        TextureRectRenderer.f[0x292A ^ 0x294E] = 0xFFFFD6C8 ^ 0x294E;
        TextureRectRenderer.f[0x28A3 ^ 0x2867] = 0x1B36 ^ 0x2867;
        TextureRectRenderer.f[0x4E5F ^ 0x4E90] = 0x5952 ^ 0x4E90;
        TextureRectRenderer.f[0x647A ^ 0x6528] = 0xFFFF9DBF ^ 0x6528;
        TextureRectRenderer.f[0xA622 ^ 0xA6DB] = 0x8F32 ^ 0xA6DB;
        TextureRectRenderer.f[0x6E8A ^ 0x6E3A] = 0x4C24 ^ 0x6E3A;
        TextureRectRenderer.f[0x577D ^ 0x5792] = 0x59ED ^ 0x5792;
        TextureRectRenderer.f[0xE017 ^ 0xE154] = 0x3FA0 ^ 0xE154;
        TextureRectRenderer.f[0x931A ^ 0x9321] = 0xFFFF6CBB ^ 0x9321;
        TextureRectRenderer.f[0xD34 ^ 0xC1F] = 0x8FB9 ^ 0xC1F;
        TextureRectRenderer.f[0x2EEA ^ 0x2EDD] = 0x2E8C ^ 0x2EDD;
        TextureRectRenderer.f[0x10597 ^ 0x1053C] = 0x330 ^ 0x1053C;
        TextureRectRenderer.f[0x90BD ^ 0x91FC] = 0x4F08 ^ 0x91FC;
        TextureRectRenderer.f[0x267B ^ 0x266A] = 0x2603 ^ 0x266A;
        TextureRectRenderer.f[0x10B16 ^ 0x10B78] = 0xFFFEF49D ^ 0x10B78;
        TextureRectRenderer.f[0xF686 ^ 0xF69D] = 0xF719 ^ 0xF69D;
        TextureRectRenderer.f[0x1A2D ^ 0x1A8F] = 0x1A8F ^ 0x1A8F;
        TextureRectRenderer.f[0x98F3 ^ 0x9836] = 0x75C3 ^ 0x9836;
        TextureRectRenderer.f[0x239A ^ 0x22CA] = 0x2586 ^ 0x22CA;
        TextureRectRenderer.f[0x9B8E ^ 0x9BFF] = 0x9B9F ^ 0x9BFF;
        TextureRectRenderer.f[0x9A3F ^ 0x9B46] = 0x9B47 ^ 0x9B46;
        TextureRectRenderer.f[0x63EA ^ 0x62C2] = 0xE172 ^ 0x62C2;
        TextureRectRenderer.f[0xF7EC ^ 0xF7C8] = 0xF03E ^ 0xF7C8;
        TextureRectRenderer.f[0xF1E9 ^ 0xF1E5] = 0xF187 ^ 0xF1E5;
        TextureRectRenderer.f[0x10540 ^ 0x1059B] = 0x13A52 ^ 0x1059B;
        TextureRectRenderer.f[0x6F03 ^ 0x6F3B] = 0x6F51 ^ 0x6F3B;
        TextureRectRenderer.f[0x70F9 ^ 0x704E] = 0x24B4 ^ 0x704E;
        TextureRectRenderer.f[0xBA87 ^ 0xBA5E] = 0x85C9 ^ 0xBA5E;
        TextureRectRenderer.f[0xC296 ^ 0xC2E9] = 0xC2CD ^ 0xC2E9;
        TextureRectRenderer.f[0x6A05 ^ 0x6A59] = 0x6A41 ^ 0x6A59;
        TextureRectRenderer.f[0xC5E7 ^ 0xC4B4] = 0xC3F8 ^ 0xC4B4;
        TextureRectRenderer.f[0xA7BA ^ 0xA7B4] = 0xA7D7 ^ 0xA7B4;
        TextureRectRenderer.f[0xD4E9 ^ 0xD5C7] = 0x85DA ^ 0xD5C7;
        TextureRectRenderer.f[0xC191 ^ 0xC120] = 0xC15D ^ 0xC120;
        TextureRectRenderer.f[0x3215 ^ 0x3313] = 0xFFFF54EA ^ 0x3313;
        TextureRectRenderer.f[0x3B ^ 0xEB] = 0x1712 ^ 0xEB;
        TextureRectRenderer.f[0x1652 ^ 0x1720] = 0xD255 ^ 0x1720;
        TextureRectRenderer.f[0x59C4 ^ 0x58A8] = 0x58A8 ^ 0x58A8;
        TextureRectRenderer.f[0xF7A ^ 0xE61] = 0xDB51 ^ 0xE61;
        TextureRectRenderer.f[0x3BAA ^ 0x3B0E] = 0x728B ^ 0x3B0E;
        TextureRectRenderer.f[0xC5EE ^ 0xC4FF] = 0x3807 ^ 0xC4FF;
        TextureRectRenderer.f[0x2D2B ^ 0x2C64] = 0xF29F ^ 0x2C64;
        TextureRectRenderer.f[0x4E85 ^ 0x4FE8] = 0x4FFA ^ 0x4FE8;
        TextureRectRenderer.f[0x80E ^ 0x94B] = 0x4E81 ^ 0x94B;
        TextureRectRenderer.f[0xC4D ^ 0xD09] = 0x4ADF ^ 0xD09;
        TextureRectRenderer.f[0x7979 ^ 0x79D0] = 0x17FAF ^ 0x79D0;
        TextureRectRenderer.f[0xF8F6 ^ 0xF8BB] = 0x8AC9 ^ 0xF8BB;
        TextureRectRenderer.f[0x87DA ^ 0x87B6] = 0xFFFF7800 ^ 0x87B6;
        TextureRectRenderer.f[0x817F ^ 0x8118] = 0x8147 ^ 0x8118;
        TextureRectRenderer.f[0x66F4 ^ 0x66E9] = 0xFFFF996C ^ 0x66E9;
        TextureRectRenderer.f[0xF540 ^ 0xF5B6] = 0x9E88 ^ 0xF5B6;
        TextureRectRenderer.f[0xD24B ^ 0xD200] = 0xD200 ^ 0xD200;
        TextureRectRenderer.f[0xE5DE ^ 0xE4EC] = 0xFFFFFA11 ^ 0xE4EC;
        TextureRectRenderer.f[0x4F4B ^ 0x4F11] = 0x4F5D ^ 0x4F11;
        TextureRectRenderer.f[0x8596 ^ 0x85CF] = 0xFFFF7A1B ^ 0x85CF;
        TextureRectRenderer.f[0x10B1E ^ 0x10BF2] = 0x10587 ^ 0x10BF2;
        TextureRectRenderer.f[0x4401 ^ 0x448D] = 0x44A4 ^ 0x448D;
        TextureRectRenderer.f[0xE569 ^ 0xE4EE] = 0xE4E3 ^ 0xE4EE;
        TextureRectRenderer.f[0x8C05 ^ 0x8C26] = 0xFFFF73EC ^ 0x8C26;
        TextureRectRenderer.f[0x13A4 ^ 0x12F9] = 0x96E0 ^ 0x12F9;
        TextureRectRenderer.f[0xEEC8 ^ 0xEF90] = 0xCE32 ^ 0xEF90;
        TextureRectRenderer.f[0x2D51 ^ 0x2C7E] = 0x7C36 ^ 0x2C7E;
        TextureRectRenderer.f[0x8896 ^ 0x89AC] = 0xFFFF619B ^ 0x89AC;
        TextureRectRenderer.f[0xC65F ^ 0xC763] = 0x1C9F6 ^ 0xC763;
        TextureRectRenderer.f[0xD7 ^ 0xB4] = 0xDA ^ 0xB4;
        TextureRectRenderer.f[0xD4EE ^ 0xD43D] = 0xE99 ^ 0xD43D;
        TextureRectRenderer.f[0x462D ^ 0x462F] = 0x4622 ^ 0x462F;
        TextureRectRenderer.f[0x57FC ^ 0x5698] = 0x15895 ^ 0x5698;
        TextureRectRenderer.f[0xB98 ^ 0xBB8] = 0xBD3 ^ 0xBB8;
        TextureRectRenderer.f[0xE1E6 ^ 0xE083] = 0x1EE81 ^ 0xE083;
        TextureRectRenderer.f[0x600C ^ 0x6106] = 0x77E7 ^ 0x6106;
        TextureRectRenderer.f[0xFFAC ^ 0xFE89] = 0xA2B6 ^ 0xFE89;
        TextureRectRenderer.f[0xFB59 ^ 0xFB5D] = 0xFB11 ^ 0xFB5D;
        TextureRectRenderer.f[0x73D2 ^ 0x733A] = 0xDB1E ^ 0x733A;
        TextureRectRenderer.f[0x7AA5 ^ 0x7A5F] = 0xFFFFAC07 ^ 0x7A5F;
        TextureRectRenderer.f[0x108C7 ^ 0x10943] = 0xFFFEF6B2 ^ 0x10943;
        TextureRectRenderer.f[0x1C72 ^ 0x1D2C] = 0x9904 ^ 0x1D2C;
        TextureRectRenderer.f[0x102B1 ^ 0x10384] = 0x8EA ^ 0x10384;
        TextureRectRenderer.f[0xAF9A ^ 0xAEA4] = 0xFFFE5FF8 ^ 0xAEA4;
        TextureRectRenderer.f[0x30B4 ^ 0x30E9] = 0xFFFFCF0E ^ 0x30E9;
        TextureRectRenderer.f[0x34F2 ^ 0x35AB] = 0x141C ^ 0x35AB;
        TextureRectRenderer.f[0x30FE ^ 0x30B8] = 0x30B8 ^ 0x30B8;
        TextureRectRenderer.f[0x8754 ^ 0x865D] = 0x90D1 ^ 0x865D;
        TextureRectRenderer.f[0x693 ^ 0x7BF] = 0x57F0 ^ 0x7BF;
        TextureRectRenderer.f[0xEC3F ^ 0xEC20] = 0xEC46 ^ 0xEC20;
        TextureRectRenderer.f[0xFE41 ^ 0xFFC3] = 0xFFFF0013 ^ 0xFFC3;
        TextureRectRenderer.f[0x1803 ^ 0x191F] = 0xA22A ^ 0x191F;
        TextureRectRenderer.f[0x237F ^ 0x2236] = 0xE20C ^ 0x2236;
        TextureRectRenderer.f[0xC32F ^ 0xC31D] = 0xC304 ^ 0xC31D;
        TextureRectRenderer.f[0xBEF2 ^ 0xBE60] = 0xFFFF41CE ^ 0xBE60;
        TextureRectRenderer.f[0xEF0E ^ 0xEF74] = 0xEF06 ^ 0xEF74;
        TextureRectRenderer.f[0xFEFA ^ 0xFFF9] = 0x46B8 ^ 0xFFF9;
        TextureRectRenderer.f[0xB8B1 ^ 0xB854] = 0xB854 ^ 0xB854;
        TextureRectRenderer.f[0xAF7F ^ 0xAF36] = 0xAF34 ^ 0xAF36;
        TextureRectRenderer.f[0x61A7 ^ 0x616D] = 0x607A ^ 0x616D;
        TextureRectRenderer.f[0x1C97 ^ 0x1CD6] = 0x1C89 ^ 0x1CD6;
        TextureRectRenderer.f[0x86E4 ^ 0x87F4] = 0x7B0D ^ 0x87F4;
        TextureRectRenderer.f[0x49E0 ^ 0x4953] = 0x492F ^ 0x4953;
        TextureRectRenderer.f[0x1677 ^ 0x170D] = 0x171D ^ 0x170D;
        TextureRectRenderer.f[0x7E87 ^ 0x7F89] = 0xFFFF6AC8 ^ 0x7F89;
        TextureRectRenderer.f[0x3651 ^ 0x3705] = 0xB85E ^ 0x3705;
        TextureRectRenderer.f[0xBEB9 ^ 0xBF80] = 0xA826 ^ 0xBF80;
        TextureRectRenderer.f[0x7B81 ^ 0x7B0A] = 0xFFFF84C0 ^ 0x7B0A;
        TextureRectRenderer.f[0xD218 ^ 0xD328] = 0x3207 ^ 0xD328;
        TextureRectRenderer.f[0x102B6 ^ 0x102FE] = 0x102FE ^ 0x102FE;
        TextureRectRenderer.f[0xA5CF ^ 0xA5B7] = 0xA5AC ^ 0xA5B7;
        TextureRectRenderer.f[0x5048 ^ 0x51C4] = 0x5189 ^ 0x51C4;
        TextureRectRenderer.f[0xF304 ^ 0xF26C] = 0xF26C ^ 0xF26C;
        TextureRectRenderer.f[0x3A95 ^ 0x3AA5] = 0x3A21 ^ 0x3AA5;
        TextureRectRenderer.f[0x29EC ^ 0x28E0] = 0xC256 ^ 0x28E0;
        TextureRectRenderer.f[0x7FB7 ^ 0x7EAD] = 0xFFFF5415 ^ 0x7EAD;
        TextureRectRenderer.f[0x9EF9 ^ 0x9E77] = 0x9E3C ^ 0x9E77;
        TextureRectRenderer.f[0xE628 ^ 0xE708] = 0xE6DC ^ 0xE708;
        TextureRectRenderer.f[0x4475 ^ 0x44DA] = 0xFFFF992A ^ 0x44DA;
        TextureRectRenderer.f[0x9EA0 ^ 0x9E5D] = 0x1C3C ^ 0x9E5D;
        TextureRectRenderer.f[0x4B3B ^ 0x4A4E] = 0xC7F9 ^ 0x4A4E;
        TextureRectRenderer.f[0xE252 ^ 0xE332] = 0x924C ^ 0xE332;
        TextureRectRenderer.f[0xC590 ^ 0xC5E9] = 0xFFFF3A0D ^ 0xC5E9;
        TextureRectRenderer.f[0x309 ^ 0x36C] = 0x32F ^ 0x36C;
        TextureRectRenderer.f[0x5CAD ^ 0x5DF2] = 0xD9EB ^ 0x5DF2;
        TextureRectRenderer.f[0x193E ^ 0x199F] = 0x199E ^ 0x199F;
        TextureRectRenderer.f[0xBC46 ^ 0xBD72] = 0x1B60E ^ 0xBD72;
        TextureRectRenderer.f[0xB4D6 ^ 0xB40C] = 0x8B90 ^ 0xB40C;
        TextureRectRenderer.f[0xDA4 ^ 0xD58] = 0x8F21 ^ 0xD58;
        TextureRectRenderer.f[0x2BA1 ^ 0x2AC6] = 0x124C4 ^ 0x2AC6;
        TextureRectRenderer.f[0x5942 ^ 0x58C1] = 0x58CA ^ 0x58C1;
        TextureRectRenderer.f[0x295F ^ 0x284C] = 0xD4B4 ^ 0x284C;
        TextureRectRenderer.f[0x1DC5 ^ 0x1D85] = 0x1DED ^ 0x1D85;
        TextureRectRenderer.f[0x3C05 ^ 0x3D53] = 0xFFFF4DAF ^ 0x3D53;
        TextureRectRenderer.f[0x9485 ^ 0x95A3] = 0xC998 ^ 0x95A3;
        TextureRectRenderer.f[0x304 ^ 0x278] = 0x21C ^ 0x278;
        TextureRectRenderer.f[0xD9F5 ^ 0xD8E0] = 0x7AB2 ^ 0xD8E0;
        TextureRectRenderer.f[0x9C5F ^ 0x9C29] = 0x9C7B ^ 0x9C29;
        TextureRectRenderer.f[0xABC7 ^ 0xAB7D] = 0x8228 ^ 0xAB7D;
        TextureRectRenderer.f[0x6C0B ^ 0x6D3C] = 0x16652 ^ 0x6D3C;
        TextureRectRenderer.f[0xFD88 ^ 0xFC8D] = 0x64E2 ^ 0xFC8D;
        TextureRectRenderer.f[0xAF95 ^ 0xAF2A] = 0x5F4C ^ 0xAF2A;
        TextureRectRenderer.f[0x9480 ^ 0x950D] = 0x950A ^ 0x950D;
        TextureRectRenderer.f[0x9C80 ^ 0x9C1E] = 0x9C1C ^ 0x9C1E;
        TextureRectRenderer.f[0xFB7A ^ 0xFB29] = 0x91C3 ^ 0xFB29;
        TextureRectRenderer.f[0xC706 ^ 0xC72C] = 0xFFFF38C7 ^ 0xC72C;
        TextureRectRenderer.f[0x7E8 ^ 0x6F0] = 0xD3D0 ^ 0x6F0;
        TextureRectRenderer.f[0x8AC7 ^ 0x8B9D] = 0xAA78 ^ 0x8B9D;
        TextureRectRenderer.f[0xFCC4 ^ 0xFC18] = 0xC384 ^ 0xFC18;
        TextureRectRenderer.f[0xF256 ^ 0xF263] = 0xFFFF0DB1 ^ 0xF263;
        TextureRectRenderer.f[0x32F5 ^ 0x33C8] = 0x13D5B ^ 0x33C8;
        TextureRectRenderer.f[0xBD0D ^ 0xBC2F] = 0xFFFF4231 ^ 0xBC2F;
        TextureRectRenderer.f[0x6990 ^ 0x69FB] = 0x69E9 ^ 0x69FB;
        TextureRectRenderer.f[0xA16 ^ 0xAF0] = 0x38E4 ^ 0xAF0;
        TextureRectRenderer.f[0xF796 ^ 0xF72E] = 0xA39F ^ 0xF72E;
        TextureRectRenderer.f[0xD59E ^ 0xD528] = 0x8199 ^ 0xD528;
        TextureRectRenderer.f[0x9978 ^ 0x99C6] = 0x69BD ^ 0x99C6;
        TextureRectRenderer.f[0xDFAD ^ 0xDFF6] = 0xFFFF2059 ^ 0xDFF6;
        TextureRectRenderer.f[0x8670 ^ 0x8675] = 0x867A ^ 0x8675;
        TextureRectRenderer.f[0x2E00 ^ 0x2E94] = 0xFFFFD131 ^ 0x2E94;
        TextureRectRenderer.f[0x5040 ^ 0x5111] = 0x565D ^ 0x5111;
        TextureRectRenderer.f[0xCD0 ^ 0xC75] = 0x10A0D ^ 0xC75;
        TextureRectRenderer.f[0x50E2 ^ 0x5035] = 0xD67B ^ 0x5035;
        TextureRectRenderer.f[0x2A0B ^ 0x2AD3] = 0xACEF ^ 0x2AD3;
        TextureRectRenderer.f[0x106B ^ 0x1025] = 0xF533 ^ 0x1025;
        TextureRectRenderer.f[0xF1A7 ^ 0xF12D] = 0xF125 ^ 0xF12D;
        TextureRectRenderer.f[0x24F8 ^ 0x2439] = 0x176E ^ 0x2439;
        TextureRectRenderer.f[0xB1BB ^ 0xB0F9] = 0x6E76 ^ 0xB0F9;
        TextureRectRenderer.f[0x974B ^ 0x9654] = 0x2D7C ^ 0x9654;
        TextureRectRenderer.f[0x2193 ^ 0x2193] = 0xFFFFDE10 ^ 0x2193;
        TextureRectRenderer.f[0xE0A3 ^ 0xE0D0] = 0xFFFF1F18 ^ 0xE0D0;
        TextureRectRenderer.f[0xE22F ^ 0xE2B6] = 0xE2E8 ^ 0xE2B6;
        TextureRectRenderer.f[0x3FDB ^ 0x3F4D] = 0xFFFFC0FB ^ 0x3F4D;
        TextureRectRenderer.f[0x4C2E ^ 0x4DA7] = 0x4DA5 ^ 0x4DA7;
        TextureRectRenderer.f[0xF82F ^ 0xF8DB] = 0x93EF ^ 0xF8DB;
        TextureRectRenderer.f[0x9158 ^ 0x9123] = 0x9155 ^ 0x9123;
        TextureRectRenderer.f[0x499C ^ 0x498A] = 0x49AF ^ 0x498A;
        TextureRectRenderer.f[0x9923 ^ 0x99FE] = 0xAB9C ^ 0x99FE;
        TextureRectRenderer.f[0x2B1E ^ 0x2B8E] = 0x2B96 ^ 0x2B8E;
        TextureRectRenderer.f[0x9FD2 ^ 0x9ED5] = 0x6BA ^ 0x9ED5;
        TextureRectRenderer.f[0x722 ^ 0x77C] = 0xFFFFF8A1 ^ 0x77C;
        TextureRectRenderer.f[0x1B1 ^ 0x135] = 0xFFFFFEC0 ^ 0x135;
        TextureRectRenderer.f[0x6E34 ^ 0x6EBC] = 0x6EE0 ^ 0x6EBC;
        TextureRectRenderer.f[0x7801 ^ 0x787F] = 0x7877 ^ 0x787F;
        TextureRectRenderer.f[0xF558 ^ 0xF5BC] = 0xEE79 ^ 0xF5BC;
        TextureRectRenderer.f[0x2F5A ^ 0x2E30] = 0x2E30 ^ 0x2E30;
        TextureRectRenderer.f[0xE8F8 ^ 0xE871] = 0xE805 ^ 0xE871;
        TextureRectRenderer.f[0xA885 ^ 0xA9BD] = 0xBE19 ^ 0xA9BD;
        TextureRectRenderer.f[0xC4EF ^ 0xC5F8] = 0x67AA ^ 0xC5F8;
        TextureRectRenderer.f[0xD848 ^ 0xD923] = 0xD922 ^ 0xD923;
        TextureRectRenderer.f[0x9568 ^ 0x940A] = 0xFFFF1AD7 ^ 0x940A;
        TextureRectRenderer.f[0x6C88 ^ 0x6C48] = 0x9C33 ^ 0x6C48;
        TextureRectRenderer.f[0x106CF ^ 0x1061E] = 0x1DC88 ^ 0x1061E;
        TextureRectRenderer.f[0xA36F ^ 0xA306] = 0xA35A ^ 0xA306;
        TextureRectRenderer.f[0x5689 ^ 0x57E7] = 0x5456 ^ 0x57E7;
        TextureRectRenderer.f[0x671B ^ 0x673E] = 0xFFFF98E5 ^ 0x673E;
        TextureRectRenderer.f[0xF82C ^ 0xF9A9] = 0xF9A7 ^ 0xF9A9;
        TextureRectRenderer.f[0xA86 ^ 0xA75] = 0x5D36 ^ 0xA75;
        TextureRectRenderer.f[0x8FF0 ^ 0x8FF8] = 0x8F95 ^ 0x8FF8;
        TextureRectRenderer.f[0x8D57 ^ 0x8D44] = 0xFFFF72B2 ^ 0x8D44;
        TextureRectRenderer.f[0x40A ^ 0x53C] = 0xFFFEF1AB ^ 0x53C;
        TextureRectRenderer.f[0xE1F2 ^ 0xE0A7] = 0x6FF2 ^ 0xE0A7;
        TextureRectRenderer.f[0x897F ^ 0x897E] = 0xFFFF76F2 ^ 0x897E;
        TextureRectRenderer.f[0xD7DE ^ 0xD7BF] = 0xD7E7 ^ 0xD7BF;
        TextureRectRenderer.f[0x1D81 ^ 0x1DFD] = 0x1DD3 ^ 0x1DFD;
        TextureRectRenderer.f[0x2CDA ^ 0x2CE7] = 0x2C96 ^ 0x2CE7;
        TextureRectRenderer.f[0xC5BC ^ 0xC5EC] = 0x514 ^ 0xC5EC;
        TextureRectRenderer.f[0x2620 ^ 0x272B] = 0x31A7 ^ 0x272B;
        TextureRectRenderer.f[0x8C62 ^ 0x8D2C] = 0xFFFFAC13 ^ 0x8D2C;
        TextureRectRenderer.f[0x53D0 ^ 0x539A] = 0x539A ^ 0x539A;
        TextureRectRenderer.f[0xA51F ^ 0xA584] = 0xA591 ^ 0xA584;
        TextureRectRenderer.f[0xCA3B ^ 0xCB48] = 0x25EE ^ 0xCB48;
        TextureRectRenderer.f[0xA6D8 ^ 0xA6FA] = 0xA68A ^ 0xA6FA;
        TextureRectRenderer.f[0xC495 ^ 0xC47C] = 0x6C54 ^ 0xC47C;
        TextureRectRenderer.f[0xBF3C ^ 0xBEBC] = 0xFFFF4144 ^ 0xBEBC;
        TextureRectRenderer.f[0x107A2 ^ 0x10716] = 0x10763 ^ 0x10716;
        TextureRectRenderer.f[0x10414 ^ 0x10400] = 0xFFFEFBB5 ^ 0x10400;
        TextureRectRenderer.f[0xB0E7 ^ 0xB1AD] = 0x7189 ^ 0xB1AD;
        TextureRectRenderer.f[0x7DD1 ^ 0x7DF8] = 0xFFFF8216 ^ 0x7DF8;
        TextureRectRenderer.f[0x114C ^ 0x115E] = 0xFFFFEEF0 ^ 0x115E;
        TextureRectRenderer.f[0x250 ^ 0x249] = 0xFFFFFDF4 ^ 0x249;
        TextureRectRenderer.f[0x272F ^ 0x2763] = 0x27E3 ^ 0x2763;
        TextureRectRenderer.f[0x3E30 ^ 0x3E96] = 0x138EC ^ 0x3E96;
        TextureRectRenderer.f[0x8995 ^ 0x892C] = 0xA07E ^ 0x892C;
        TextureRectRenderer.f[0x3FC2 ^ 0x3ECF] = 0xD466 ^ 0x3ECF;
        TextureRectRenderer.f[0x9F48 ^ 0x9FF5] = 0x6F81 ^ 0x9FF5;
        TextureRectRenderer.f[0x52DC ^ 0x5288] = 0xBD04 ^ 0x5288;
        TextureRectRenderer.f[0x843C ^ 0x8420] = 0x8429 ^ 0x8420;
        TextureRectRenderer.f[0x916E ^ 0x91BB] = 0x1783 ^ 0x91BB;
        TextureRectRenderer.f[0x1635 ^ 0x1773] = 0xFFFFAF4F ^ 0x1773;
        TextureRectRenderer.f[0xBE45 ^ 0xBEC5] = 0xBECD ^ 0xBEC5;
        TextureRectRenderer.f[0x1028A ^ 0x1020C] = 0x1021A ^ 0x1020C;
        TextureRectRenderer.f[0xF638 ^ 0xF7B0] = 0xFFFF086C ^ 0xF7B0;
        TextureRectRenderer.f[0x1A44 ^ 0x1AEC] = 0x11C96 ^ 0x1AEC;
        TextureRectRenderer.f[0xC88F ^ 0xC897] = 0xFFFF3743 ^ 0xC897;
        TextureRectRenderer.f[0x77BF ^ 0x76F2] = 0xA809 ^ 0x76F2;
        TextureRectRenderer.f[0xF47C ^ 0xF45A] = 0xF441 ^ 0xF45A;
        TextureRectRenderer.f[0x1CD9 ^ 0x1C7A] = 0x55EF ^ 0x1C7A;
        TextureRectRenderer.f[0x1573 ^ 0x1434] = 0x53FE ^ 0x1434;
        TextureRectRenderer.f[0x51E8 ^ 0x51B7] = 0x51A4 ^ 0x51B7;
        TextureRectRenderer.f[0x971C ^ 0x97A0] = 0xBEF5 ^ 0x97A0;
        TextureRectRenderer.f[0xB97F ^ 0xB8F5] = 0xFFFF4713 ^ 0xB8F5;
        TextureRectRenderer.f[0x11B5 ^ 0x112F] = 0x1106 ^ 0x112F;
        TextureRectRenderer.f[0x48BC ^ 0x49EB] = 0xC6BE ^ 0x49EB;
        TextureRectRenderer.f[0x46AD ^ 0x4780] = 0x17C8 ^ 0x4780;
        TextureRectRenderer.f[0xC3A7 ^ 0xC286] = 0xC357 ^ 0xC286;
        TextureRectRenderer.f[0x975A ^ 0x9735] = 0xFFFF68B1 ^ 0x9735;
        TextureRectRenderer.f[0x9FCD ^ 0x9F50] = 0x9F51 ^ 0x9F50;
        TextureRectRenderer.f[0xB420 ^ 0xB511] = 0x5420 ^ 0xB511;
        TextureRectRenderer.f[0x3900 ^ 0x390A] = 0x391C ^ 0x390A;
        TextureRectRenderer.f[0x29B ^ 0x3D3] = 0xC3FA ^ 0x3D3;
        TextureRectRenderer.f[0xC30 ^ 0xC27] = 0xC79 ^ 0xC27;
        TextureRectRenderer.f[0x4A52 ^ 0x4B7B] = 0xC8DD ^ 0x4B7B;
        TextureRectRenderer.f[0xD400 ^ 0xD4B5] = 0x8005 ^ 0xD4B5;
        TextureRectRenderer.f[0xA750 ^ 0xA7CC] = 0xA7F2 ^ 0xA7CC;
        TextureRectRenderer.f[0x107D1 ^ 0x106AA] = 0x106A0 ^ 0x106AA;
        TextureRectRenderer.f[0xA142 ^ 0xA171] = 0xA1A7 ^ 0xA171;
        TextureRectRenderer.f[0x9F89 ^ 0x9FEF] = 0xFFFF6046 ^ 0x9FEF;
        TextureRectRenderer.f[0xD960 ^ 0xD9AE] = 0xCE57 ^ 0xD9AE;
        TextureRectRenderer.f[0x2EF ^ 0x298] = 0x2E1 ^ 0x298;
        TextureRectRenderer.f[0xDAD2 ^ 0xDBF1] = 0xDA20 ^ 0xDBF1;
        TextureRectRenderer.f[0xBDBD ^ 0xBDBB] = 0xFFFF4259 ^ 0xBDBB;
        TextureRectRenderer.f[0x599A ^ 0x59BD] = 0xFFFFA610 ^ 0x59BD;
        TextureRectRenderer.f[0xC8D0 ^ 0xC881] = 0xB159 ^ 0xC881;
        TextureRectRenderer.f[0x6720 ^ 0x67E2] = 0x54B3 ^ 0x67E2;
        TextureRectRenderer.f[0x5873 ^ 0x5803] = 0x587E ^ 0x5803;
        TextureRectRenderer.f[0x81F1 ^ 0x81F8] = 0xFFFF7E3E ^ 0x81F8;
        TextureRectRenderer.f[0x1648 ^ 0x1676] = 0x1667 ^ 0x1676;
        TextureRectRenderer.f[0xCB1 ^ 0xC8B] = 0xCE8 ^ 0xC8B;
        TextureRectRenderer.f[0x53C ^ 0x512] = 0xFFFFFADF ^ 0x512;
        TextureRectRenderer.f[0xDEAA ^ 0xDE78] = 0x4E3 ^ 0xDE78;
        TextureRectRenderer.f[0xC4FA ^ 0xC4CB] = 0xFFFF3B20 ^ 0xC4CB;
        TextureRectRenderer.f[0x7B77 ^ 0x7A18] = 0x3BB ^ 0x7A18;
        TextureRectRenderer.f[0x3410 ^ 0x34F1] = 0x2F3D ^ 0x34F1;
        TextureRectRenderer.f[0x5AB ^ 0x4E0] = 0xC4DA ^ 0x4E0;
        TextureRectRenderer.f[0x4A4 ^ 0x43B] = 0x43B ^ 0x43B;
        TextureRectRenderer.f[0x555B ^ 0x5545] = 0x5740 ^ 0x5545;
        TextureRectRenderer.f[0x86FF ^ 0x878F] = 0x88BA ^ 0x878F;
        TextureRectRenderer.f[0x83D2 ^ 0x83B2] = 0xFFFF7C58 ^ 0x83B2;
        TextureRectRenderer.f[0xA649 ^ 0xA67F] = 0xA444 ^ 0xA67F;
        TextureRectRenderer.f[0xECB7 ^ 0xEDA5] = 0xFFFFEE82 ^ 0xEDA5;
        TextureRectRenderer.f[0x10535 ^ 0x105C7] = 0x15288 ^ 0x105C7;
        TextureRectRenderer.f[0xCC12 ^ 0xCC90] = 0xCC13 ^ 0xCC90;
        TextureRectRenderer.f[0xFC39 ^ 0xFC44] = 0xFC72 ^ 0xFC44;
        TextureRectRenderer.f[0xB45D ^ 0xB475] = 0xFFFF4BCA ^ 0xB475;
        TextureRectRenderer.f[0x15F1 ^ 0x15C5] = 0x15C1 ^ 0x15C5;
        TextureRectRenderer.f[0x2DEB ^ 0x2D35] = 0x1F57 ^ 0x2D35;
        TextureRectRenderer.f[0x7982 ^ 0x7939] = 0x5030 ^ 0x7939;
        TextureRectRenderer.f[0xE2D1 ^ 0xE284] = 0x575A ^ 0xE284;
        TextureRectRenderer.f[0xA5BF ^ 0xA5FB] = 0xA5E2 ^ 0xA5FB;
        TextureRectRenderer.f[0x6720 ^ 0x6767] = 0x6766 ^ 0x6767;
        TextureRectRenderer.f[0x57A ^ 0x5B6] = 0x4A1 ^ 0x5B6;
        TextureRectRenderer.f[0x60FD ^ 0x6173] = 0x6122 ^ 0x6173;
        TextureRectRenderer.f[0x987F ^ 0x9961] = 0xFFFFDD9B ^ 0x9961;
        TextureRectRenderer.f[0xE0CB ^ 0xE1CF] = 0x79BB ^ 0xE1CF;
        TextureRectRenderer.f[0x4CCF ^ 0x4CC8] = 0x4CB3 ^ 0x4CC8;
        TextureRectRenderer.f[0xFE8A ^ 0xFEB5] = 0xFFFF015B ^ 0xFEB5;
        TextureRectRenderer.f[0xCA6F ^ 0xCA38] = 0xCA38 ^ 0xCA38;
        TextureRectRenderer.f[0xF99E ^ 0xF8A5] = 0xEF03 ^ 0xF8A5;
        TextureRectRenderer.f[0x672A ^ 0x675F] = 0xFFFF98FE ^ 0x675F;
        TextureRectRenderer.f[0x9A64 ^ 0x9AC9] = 0xB8DD ^ 0x9AC9;
        TextureRectRenderer.f[0x9B83 ^ 0x9B61] = 0x80A4 ^ 0x9B61;
        TextureRectRenderer.f[0x92EB ^ 0x924C] = 0xFFFE6BE2 ^ 0x924C;
        TextureRectRenderer.f[0x9907 ^ 0x99F6] = 0xCEB5 ^ 0x99F6;
        TextureRectRenderer.f[0x2DC6 ^ 0x2D49] = 0x2D0A ^ 0x2D49;
        TextureRectRenderer.f[0x1B69 ^ 0x1BA4] = 0xC5E ^ 0x1BA4;
        TextureRectRenderer.f[0x34A9 ^ 0x3495] = 0x330B ^ 0x3495;
        TextureRectRenderer.f[0x3F5 ^ 0x315] = 0x3177 ^ 0x315;
        TextureRectRenderer.f[0xD2F3 ^ 0xD253] = 0xD252 ^ 0xD253;
        TextureRectRenderer.f[0x10AF2 ^ 0x10B74] = 0x10B2E ^ 0x10B74;
        TextureRectRenderer.f[0xB291 ^ 0xB257] = 0x5FAE ^ 0xB257;
        TextureRectRenderer.f[0x96B3 ^ 0x9698] = 0x9698 ^ 0x9698;
        TextureRectRenderer.f[0x9ABF ^ 0x9AB2] = 0x9AB0 ^ 0x9AB2;
        TextureRectRenderer.f[0x10545 ^ 0x10582] = 0xFFFE17AB ^ 0x10582;
        TextureRectRenderer.f[0xB268 ^ 0xB342] = 0x30B3 ^ 0xB342;
        TextureRectRenderer.f[0x4AF2 ^ 0x4A9A] = 0x4AB9 ^ 0x4A9A;
        TextureRectRenderer.f[0x10415 ^ 0x10532] = 0x1590D ^ 0x10532;
        TextureRectRenderer.f[0xD44D ^ 0xD572] = 0x1DBE1 ^ 0xD572;
        TextureRectRenderer.f[0x2EFF ^ 0x2FA3] = 0xABA0 ^ 0x2FA3;
        TextureRectRenderer.f[0x9D1A ^ 0x9D55] = 0x5BD3 ^ 0x9D55;
        TextureRectRenderer.f[0x72FA ^ 0x73E3] = 0xA6D3 ^ 0x73E3;
        TextureRectRenderer.f[0x1094B ^ 0x109C6] = 0xFFFEF647 ^ 0x109C6;
        TextureRectRenderer.f[0xD72F ^ 0xD7A8] = 0xFFFF284B ^ 0xD7A8;
        TextureRectRenderer.f[0x7AE8 ^ 0x7AE7] = 0x7AC9 ^ 0x7AE7;
        TextureRectRenderer.f[0x105D ^ 0x10B0] = 0x1ECF ^ 0x10B0;
        TextureRectRenderer.f[0x6CBC ^ 0x6C56] = 0xC42E ^ 0x6C56;
        TextureRectRenderer.f[0x80EB ^ 0x81A7] = 0x5F58 ^ 0x81A7;
        TextureRectRenderer.f[0xA3D2 ^ 0xA3D1] = 0xFFFF5C13 ^ 0xA3D1;
        TextureRectRenderer.f[0xF293 ^ 0xF312] = 0xF31D ^ 0xF312;
        TextureRectRenderer.f[0x16EC ^ 0x16C1] = 0xFFFFE90B ^ 0x16C1;
        TextureRectRenderer.f[0x853B ^ 0x85EF] = 0x5F74 ^ 0x85EF;
        TextureRectRenderer.f[0x3C30 ^ 0x3D31] = 0x8470 ^ 0x3D31;
        TextureRectRenderer.f[0x8E3E ^ 0x8ED5] = 0x26FD ^ 0x8ED5;
        TextureRectRenderer.f[0x72BB ^ 0x73BB] = 0xCAEE ^ 0x73BB;
        TextureRectRenderer.f[0x84E3 ^ 0x859E] = 0x8596 ^ 0x859E;
        TextureRectRenderer.f[0xF767 ^ 0xF63C] = 0xD78B ^ 0xF63C;
        TextureRectRenderer.f[0x5B47 ^ 0x5B04] = 0x5B60 ^ 0x5B04;
        TextureRectRenderer.f[0x100D6 ^ 0x101AE] = 0x118E0 ^ 0x101AE;
        TextureRectRenderer.f[0x1018F ^ 0x101CA] = 0x101C9 ^ 0x101CA;
        TextureRectRenderer.f[0x7886 ^ 0x78DE] = 0xFFFF8766 ^ 0x78DE;
        TextureRectRenderer.f[0x8F16 ^ 0x8F2F] = 0x8B2A ^ 0x8F2F;
        TextureRectRenderer.f[0xD6C8 ^ 0xD6A2] = 0xFFFF296B ^ 0xD6A2;
        TextureRectRenderer.f[0x23AC ^ 0x23B9] = 0x23BE ^ 0x23B9;
        TextureRectRenderer.f[0x4A63 ^ 0x4A4C] = 0x4A0B ^ 0x4A4C;
        TextureRectRenderer.f[0x108E0 ^ 0x1080E] = 0x10643 ^ 0x1080E;
        TextureRectRenderer.f[0xAEF6 ^ 0xAE61] = 0xAE74 ^ 0xAE61;
        TextureRectRenderer.f[0xCDCE ^ 0xCD31] = 0x4F50 ^ 0xCD31;
        TextureRectRenderer.f[0xF6B6 ^ 0xF643] = 0x9D6E ^ 0xF643;
        TextureRectRenderer.f[0x64B ^ 0x6BB] = 0x51F3 ^ 0x6BB;
        TextureRectRenderer.f[0x1832 ^ 0x1926] = 0xBB63 ^ 0x1926;
        TextureRectRenderer.f[0x465 ^ 0x4CF] = 0x102B5 ^ 0x4CF;
        TextureRectRenderer.f[0x42A4 ^ 0x4231] = 0x4220 ^ 0x4231;
        TextureRectRenderer.f[0xB315 ^ 0xB276] = 0xC305 ^ 0xB276;
    }
}

