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
import kotakbaz.rain.client.util.color.QuadColor;
import kotakbaz.rain.client.util.render.display.AdvancedRectRenderer;
import kotakbaz.rain.client.util.render.display.D;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.engine.controls.RectType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector4f;
import org.joml.Vector4fc;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 22\u00020\u0001:\u00012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ-\u0010\u0007\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0007\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0019\u00a2\u0006\u0004\b\u0017\u0010\u001aJ=\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b!\u0010\"J-\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0015\u00a2\u0006\u0004\b!\u0010#J\u001d\u0010$\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0015\u00a2\u0006\u0004\b&\u0010\u0018J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b'\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0003\u0010(R\u0014\u0010)\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b0\u00101\u00a8\u00063"}, d2={"Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;", "", "Lkotakbaz/rain/client/util/render/display/AdvancedRectRenderer;", "advanced", "<init>", "(Lkotakbaz/rain/client/util/render/display/AdvancedRectRenderer;)V", "Ljava/awt/Color;", "color", "(Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;", "c1", "c2", "c3", "c4", "(Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;", "Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "pipeline", "priority", "(Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;", "Lkotakbaz/rain/client/util/render/engine/controls/RectType;", "type", "(Lkotakbaz/rain/client/util/render/engine/controls/RectType;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;", "", "r", "round", "(F)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;", "Lorg/joml/Vector4f;", "(Lorg/joml/Vector4f;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;", "x", "y", "width", "height", "radius", "", "draw", "(FFFFFLjava/awt/Color;)V", "(FFFF)V", "border", "(FLjava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;", "borderWidth", "borderColor", "Lkotakbaz/rain/client/util/render/display/AdvancedRectRenderer;", "cachedRadius", "Lorg/joml/Vector4f;", "Lkotakbaz/rain/client/util/color/QuadColor;", "cachedColor", "Lkotakbaz/rain/client/util/color/QuadColor;", "cachedBorderWidth", "F", "cachedBorderColor", "Ljava/awt/Color;", "Companion", "rain-visuals"})
public final class BasicRectRenderer {
    @NotNull
    public static final D a;
    @NotNull
    private final AdvancedRectRenderer A;
    @NotNull
    private final Vector4f b;
    @NotNull
    private final QuadColor B;
    private float c;
    @NotNull
    private Color C;
    @NotNull
    private static final Color d;
    private static Object[] D;
    private static Object E;
    private static Object[] f;
    private static Object[] e;
    private static Object[] F;
    public static int[] g;

    public BasicRectRenderer(@NotNull AdvancedRectRenderer advanced) {
        int n2 = g[0];
        n2 += g[1];
        Intrinsics.checkNotNullParameter(advanced, (String)D[n2 -= g[2]]);
        this.A = advanced;
        this.b = new Vector4f();
        Color color = Color.WHITE;
        int n3 = g[3];
        n3 ^= g[4];
        Intrinsics.checkNotNullExpressionValue(color, (String)D[n3 -= g[5]]);
        this.B = new QuadColor(color);
        this.C = d;
    }

    @NotNull
    public final BasicRectRenderer color(@NotNull Color color) {
        int n2 = g[6];
        n2 -= g[7];
        Intrinsics.checkNotNullParameter(color, (String)D[n2 ^= g[8]]);
        this.A.color(color);
        this.B.set(color);
        return this;
    }

    @NotNull
    public final BasicRectRenderer color(@NotNull Color c1, @NotNull Color c2, @NotNull Color c3, @NotNull Color c4) {
        int n2 = g[9];
        n2 += g[10];
        Intrinsics.checkNotNullParameter(c1, (String)D[n2 += g[11]]);
        int n3 = g[12];
        n3 ^= g[13];
        Intrinsics.checkNotNullParameter(c2, (String)D[n3 -= g[14]]);
        int n4 = g[15];
        n4 -= g[16];
        Intrinsics.checkNotNullParameter(c3, (String)D[n4 ^= g[17]]);
        int n5 = g[18];
        n5 += g[19];
        Intrinsics.checkNotNullParameter(c4, (String)D[n5 ^= g[20]]);
        this.A.color(c1, c2, c3, c4);
        this.B.set(c1, c2, c3, c4);
        return this;
    }

    @NotNull
    public final BasicRectRenderer priority(@NotNull ClientRenderPipeline pipeline) {
        int n2 = g[21];
        n2 -= g[22];
        Intrinsics.checkNotNullParameter((Object)pipeline, (String)D[n2 ^= g[23]]);
        this.A.priority(pipeline);
        return this;
    }

    @NotNull
    public final BasicRectRenderer type(@NotNull RectType type) {
        int n2 = g[24];
        n2 += g[25];
        Intrinsics.checkNotNullParameter((Object)type, (String)D[n2 ^= g[26]]);
        this.A.type(type);
        return this;
    }

    @NotNull
    public final BasicRectRenderer round(float r) {
        this.A.round(r);
        this.b.set(r, r, r, r);
        return this;
    }

    @NotNull
    public final BasicRectRenderer round(@NotNull Vector4f r) {
        int n2 = g[27];
        n2 += g[28];
        Intrinsics.checkNotNullParameter(r, (String)D[n2 -= g[29]]);
        this.A.round(r);
        this.b.set((Vector4fc)r);
        return this;
    }

    public final void draw(float x2, float y, float width2, float height, float radius, @NotNull Color color) {
        int n2 = g[30];
        n2 ^= g[31];
        Intrinsics.checkNotNullParameter(color, (String)D[n2 ^= g[32]]);
        this.B.set(color);
        this.b.set(radius, radius, radius, radius);
        this.A.type(RectType.BASIC);
        this.A.drawRect(x2, y, width2, height, this.B, this.b, this.c, this.C);
        this.c = 0.0f;
        this.C = d;
    }

    public final void draw(float x2, float y, float width2, float height) {
        this.A.type(RectType.BASIC);
        this.A.drawRect(x2, y, width2, height, this.B, this.b, this.c, this.C);
        this.c = 0.0f;
        this.C = d;
    }

    @NotNull
    public final BasicRectRenderer border(float width2, @NotNull Color color) {
        int n2 = g[33];
        n2 -= g[34];
        Intrinsics.checkNotNullParameter(color, (String)D[n2 ^= g[35]]);
        this.c = width2;
        this.C = color;
        return this;
    }

    @NotNull
    public final BasicRectRenderer borderWidth(float width2) {
        this.c = width2;
        return this;
    }

    @NotNull
    public final BasicRectRenderer borderColor(@NotNull Color color) {
        int n2 = g[36];
        n2 ^= g[37];
        Intrinsics.checkNotNullParameter(color, (String)D[n2 -= g[38]]);
        this.C = color;
        return this;
    }

    static {
        BasicRectRenderer.b();
        long l2 = -4225194329255967451L;
        long l3 = 2355736030434976558L;
        long l4 = 2328174653980324233L;
        long l5 = -7348666504884295177L;
        long l6 = 8356615734274958945L;
        long l7 = -5149304377124201155L;
        long l8 = -27217425835790173L;
        long l9 = -5657823798848177248L;
        long l10 = 4818319374208682127L;
        long l11 = 1909066209535659131L;
        long l12 = -9169589214167615778L;
        long l13 = 1902608197116701237L;
        long l14 = 5491707763153393979L;
        long l15 = -3431080995979665962L;
        int n2 = g[39];
        n2 -= g[40];
        D = new Object[n2 ^= g[41]];
        long l16 = l15;
        int n3 = g[42];
        n3 ^= g[43];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 += g[44]);
        Object[] objectArray = new Object[g[45]];
        objectArray[BasicRectRenderer.g[46]] = e;
        objectArray[BasicRectRenderer.g[47]] = g[48];
        int n4 = g[49];
        Object object = BasicRectRenderer.A()[g[50]];
        if (object == null) {
            char[] cArray = "\uaccb\uacdf\uacc0\uace0\uace9\uace1\uace3\uacc5\uacca\uad82\uace3\uacc0\uace7\uacc5\uace2\uacba\uacd1\uacca\uacdf\uaceb\uacec\uaceb\uacde\uad89\uacaf\uac90\uace5\uacc7\uac8e\uad89\uacaf\uad85\uad82\uad5d\uacb6\uacba\uace8\uac8f\uacaf\uaceb\uaccb\uac9b\uace9\uacb5\uac9a\uace1\uacc2\uaccb\uacc8\uac95\uace2\uad5d\uacca\uad89\uacc2\uacb7\uacde\uac9c\uac9b\uacb1\uace5\uac97\uac8e\uad89\uace3\uad71\uaceb\uac90\uace0\uace5\uad82\uace1\uaceb\uaceb\uad7e\uad8a\uacdf\uaceb\uacec\uac90\uace0\uacc1\uace8\uacbd\uad89\uace1\uacc0\uace0\uad80\uacc0\uacec\uace4\uad87\uac9c\uac8e\uacbf\uace0\uacc3\uaccb\uac98\uad85\uacd1\uac90\uacb1\uacdf\uace4\uac9d\uacc9\uacbc\uacd1\uad7e\uacbb\uac98\uac96\uad8b\uacbd\uacb1\uad85\uad89\uacd1\uacbb\uad87\uacb6\uaccc\uad8c\uacc2\uac98\uacc7\uac95\uac98\uacb1\uacbc\uad82\uace5\uace4\uad8b\uaceb\uacec\uace7\uacbf\uaceb\uac9d\uace2\uaceb\uac9b\uacc0\uace7\uad8c\uacb7\uacb1\uacb3\uacb3".toCharArray();
            for (int i2 = g[51]; i2 < g[52]; ++i2) {
                int n5 = cArray[i2];
                n5 += g[53];
                n5 += g[54];
                n5 += g[55];
                n5 += g[56];
                n5 ^= g[57];
                n5 -= g[58];
                n5 ^= g[59];
                n5 ^= g[60];
                n5 -= g[61];
                n5 += g[62];
                n5 ^= g[63];
                n5 += g[64];
                cArray[i2] = (char)(n5 -= g[65]);
            }
            object = BasicRectRenderer.A()[BasicRectRenderer.g[66]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)BasicRectRenderer.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = g[67];
        n6 += g[68];
        l6 = l17 ^ (0x5000000000L ^ l17) & -1L << (n6 -= g[69]);
        long l18 = l13;
        int n7 = g[70];
        n7 ^= g[71];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 += g[72]);
        while (true) {
            int n8 = g[73];
            n8 ^= g[74];
            if ((int)l13 >= (int)(l6 >>> (n8 -= g[75]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = g[76];
            n10 ^= g[77];
            int n11 = g[79];
            n11 -= g[80];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 ^= g[78])) & -1L >>> (n11 += g[81]);
            long l20 = l9;
            int n12 = g[82];
            n12 += g[83];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 -= g[84]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = g[85];
            n14 ^= g[86];
            int n15 = g[88];
            n15 ^= g[89];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 -= g[87])) & -1L >>> (n15 += g[90]);
            int n16 = g[91];
            n16 -= g[92];
            long l22 = l10;
            int n17 = g[94];
            n17 ^= g[95];
            l10 = l22 ^ ((long)cArray[n13] << (n16 ^= g[93]) ^ l22) & -1L << (n17 += g[96]);
            int n18 = g[97];
            n18 -= g[98];
            n18 += g[99];
            int n19 = g[100];
            n19 += g[101];
            long l23 = l12;
            int n20 = g[103];
            n20 -= g[104];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 -= g[102]))) ^ l23) & -1L >>> (n20 ^= g[105]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = g[106];
            n21 ^= g[107];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 -= g[108]);
            while (true) {
                int n22 = g[109];
                n22 += g[110];
                if ((int)(l14 >>> (n22 -= g[111])) >= (int)l12) break;
                int n23 = g[112];
                n23 ^= g[113];
                int n24 = g[115];
                n24 ^= g[116];
                cArray2[(int)(l14 >>> (n23 -= BasicRectRenderer.g[114]))] = cArray[(int)l13 + (int)(l14 >>> (n24 += g[117]))];
                l14 += 0x100000000L;
            }
            int n25 = g[118];
            n25 -= g[119];
            int n26 = (int)(l15 >>> (n25 += g[120]));
            l15 += 0x100000000L;
            BasicRectRenderer.D[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = g[121];
            n27 ^= g[122];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 += g[123]);
        }
        a = new D(null);
        int n28 = g[124];
        n28 ^= g[125];
        n28 -= g[126];
        int n29 = g[127];
        n29 -= g[128];
        int n30 = g[130];
        n30 ^= g[131];
        int n31 = g[133];
        n31 -= g[134];
        d = new Color(n28, n29 ^= g[129], n30 ^= g[132], n31 += g[135]);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[g[136]];
        String string = (String)object[g[137]];
        object = object[g[138]];
        Object[] objectArray = f;
        if (f == null) {
            objectArray = f = new Object[g[139]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[g[140]];
                e = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[g[142] ^ g[143]];
                byArray[BasicRectRenderer.g[144] ^ BasicRectRenderer.g[145]] = g[146] ^ g[147];
                byArray[BasicRectRenderer.g[148] ^ BasicRectRenderer.g[149]] = g[150] ^ g[151];
                byArray[BasicRectRenderer.g[152] ^ BasicRectRenderer.g[153]] = g[154] ^ g[155];
                byArray[BasicRectRenderer.g[156] ^ BasicRectRenderer.g[157]] = g[158] ^ g[159];
                byArray[BasicRectRenderer.g[160] ^ BasicRectRenderer.g[161]] = g[162] ^ g[163];
                byArray[BasicRectRenderer.g[164] ^ BasicRectRenderer.g[165]] = g[166] ^ g[167];
                byArray[BasicRectRenderer.g[168] ^ BasicRectRenderer.g[169]] = g[170] ^ g[171];
                byArray[BasicRectRenderer.g[172] ^ BasicRectRenderer.g[173]] = g[174] ^ g[175];
                byArray[BasicRectRenderer.g[176] ^ BasicRectRenderer.g[177]] = g[178] ^ g[179];
                byArray[BasicRectRenderer.g[180] ^ BasicRectRenderer.g[181]] = g[182] ^ g[183];
                byArray[BasicRectRenderer.g[184] ^ BasicRectRenderer.g[185]] = g[186] ^ g[187];
                byArray[BasicRectRenderer.g[188] ^ BasicRectRenderer.g[189]] = g[190] ^ g[191];
                byArray[BasicRectRenderer.g[192] ^ BasicRectRenderer.g[193]] = g[194] ^ g[195];
                byArray[BasicRectRenderer.g[196] ^ BasicRectRenderer.g[197]] = g[198] ^ g[199];
                byArray[BasicRectRenderer.g[200] ^ BasicRectRenderer.g[201]] = g[202] ^ g[203];
                byArray[BasicRectRenderer.g[204] ^ BasicRectRenderer.g[205]] = g[206] ^ g[207];
                objectArray2[BasicRectRenderer.g[141]] = byArray;
            }
            byte[] byArray = (byte[])object3[g[208]];
            if (E == null) {
                byte[] byArray2 = new byte[g[209] ^ g[210]];
                byArray2[BasicRectRenderer.g[211] ^ BasicRectRenderer.g[212]] = g[213] ^ g[214];
                byArray2[BasicRectRenderer.g[215] ^ BasicRectRenderer.g[216]] = g[217] ^ g[218];
                byArray2[BasicRectRenderer.g[219] ^ BasicRectRenderer.g[220]] = g[221] ^ g[222];
                byArray2[BasicRectRenderer.g[223] ^ BasicRectRenderer.g[224]] = g[225] ^ g[226];
                byArray2[BasicRectRenderer.g[227] ^ BasicRectRenderer.g[228]] = g[229] ^ g[230];
                byArray2[BasicRectRenderer.g[231] ^ BasicRectRenderer.g[232]] = g[233] ^ g[234];
                byArray2[BasicRectRenderer.g[235] ^ BasicRectRenderer.g[236]] = g[237] ^ g[238];
                byArray2[BasicRectRenderer.g[239] ^ BasicRectRenderer.g[240]] = g[241] ^ g[242];
                byArray2[BasicRectRenderer.g[243] ^ BasicRectRenderer.g[244]] = g[245] ^ g[246];
                byArray2[BasicRectRenderer.g[247] ^ BasicRectRenderer.g[248]] = g[249] ^ g[250];
                byArray2[BasicRectRenderer.g[251] ^ BasicRectRenderer.g[252]] = g[253] ^ g[254];
                byArray2[BasicRectRenderer.g[255] ^ BasicRectRenderer.g[256]] = g[257] ^ g[258];
                byArray2[BasicRectRenderer.g[259] ^ BasicRectRenderer.g[260]] = g[261] ^ g[262];
                byArray2[BasicRectRenderer.g[263] ^ BasicRectRenderer.g[264]] = g[265] ^ g[266];
                byArray2[BasicRectRenderer.g[267] ^ BasicRectRenderer.g[268]] = g[269] ^ g[270];
                byArray2[BasicRectRenderer.g[271] ^ BasicRectRenderer.g[272]] = g[273] ^ g[274];
                byArray2[BasicRectRenderer.g[275] ^ BasicRectRenderer.g[276]] = g[277] ^ g[278];
                byArray2[BasicRectRenderer.g[279] ^ BasicRectRenderer.g[280]] = g[281] ^ g[282];
                byArray2[BasicRectRenderer.g[283] ^ BasicRectRenderer.g[284]] = g[285] ^ g[286];
                byArray2[BasicRectRenderer.g[287] ^ BasicRectRenderer.g[288]] = g[289] ^ g[290];
                byArray2[BasicRectRenderer.g[291] ^ BasicRectRenderer.g[292]] = g[293] ^ g[294];
                byArray2[BasicRectRenderer.g[295] ^ BasicRectRenderer.g[296]] = g[297] ^ g[298];
                byArray2[BasicRectRenderer.g[299] ^ BasicRectRenderer.g[300]] = g[301] ^ g[302];
                byArray2[BasicRectRenderer.g[303] ^ BasicRectRenderer.g[304]] = g[305] ^ g[306];
                byArray2[BasicRectRenderer.g[307] ^ BasicRectRenderer.g[308]] = g[309] ^ g[310];
                byArray2[BasicRectRenderer.g[311] ^ BasicRectRenderer.g[312]] = g[313] ^ g[314];
                byArray2[BasicRectRenderer.g[315] ^ BasicRectRenderer.g[316]] = g[317] ^ g[318];
                byArray2[BasicRectRenderer.g[319] ^ BasicRectRenderer.g[320]] = g[321] ^ g[322];
                byArray2[BasicRectRenderer.g[323] ^ BasicRectRenderer.g[324]] = g[325] ^ g[326];
                byArray2[BasicRectRenderer.g[327] ^ BasicRectRenderer.g[328]] = g[329] ^ g[330];
                byArray2[BasicRectRenderer.g[331] ^ BasicRectRenderer.g[332]] = g[333] ^ g[334];
                byArray2[BasicRectRenderer.g[335] ^ BasicRectRenderer.g[336]] = g[337] ^ g[338];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, g[339], byArray3, g[340], byArray.length);
                System.arraycopy(byArray2, g[341], byArray3, byArray.length, byArray2.length);
                Object object4 = BasicRectRenderer.A()[g[342]];
                if (object4 == null) {
                    char[] cArray = "\u0a08\u0ade\u0a37\u0a3c\u0a32\u0a2e\u0a23\u0a11\uf58c\u0a10\u0a30\uf5f5\u0a39\u0a3f\u0a0f\u0a30\u0ad9\u0a29".toCharArray();
                    for (int i2 = g[343]; i2 < g[344]; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= g[345];
                        n3 ^= g[346];
                        n3 += g[347];
                        n3 ^= g[348];
                        n3 ^= g[349];
                        n3 += g[350];
                        n3 += g[351];
                        n3 ^= g[352];
                        n3 += g[353];
                        n3 += g[354];
                        n3 += g[355];
                        n3 -= g[356];
                        cArray[i2] = (char)(n3 -= g[357]);
                    }
                    object4 = BasicRectRenderer.A()[BasicRectRenderer.g[358]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[g[359]];
                byArray4[BasicRectRenderer.g[360]] = g[361];
                byArray4[BasicRectRenderer.g[362]] = g[363];
                byArray4[BasicRectRenderer.g[364]] = g[365];
                byArray4[BasicRectRenderer.g[366]] = g[367];
                byArray4[BasicRectRenderer.g[368]] = g[369];
                byArray4[BasicRectRenderer.g[370]] = g[371];
                byArray4[BasicRectRenderer.g[372]] = g[373];
                byArray4[BasicRectRenderer.g[374]] = g[375];
                byArray4[BasicRectRenderer.g[376]] = g[377];
                byArray4[BasicRectRenderer.g[378]] = g[379];
                byArray4[BasicRectRenderer.g[380]] = g[381];
                byArray4[BasicRectRenderer.g[382]] = g[383];
                byArray4[BasicRectRenderer.g[384]] = g[385];
                byArray4[BasicRectRenderer.g[386]] = g[387];
                byArray4[BasicRectRenderer.g[388]] = g[389];
                byArray4[BasicRectRenderer.g[390]] = g[391];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, g[392], g[393]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = BasicRectRenderer.A()[g[394]];
                if (object5 == null) {
                    char[] cArray = "\u4fa2\u4fa6\u4fb8".toCharArray();
                    for (int i3 = g[395]; i3 < g[396]; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= g[397];
                        n4 ^= g[398];
                        n4 -= g[399];
                        n4 += 27766;
                        n4 += 19062;
                        n4 += 1753;
                        n4 ^= 0xA9B;
                        n4 -= 28124;
                        n4 += 13757;
                        n4 ^= 0xC2DD;
                        n4 += 20686;
                        cArray[i3] = (char)(n4 -= 59231);
                    }
                    object5 = BasicRectRenderer.A()[2] = new String(cArray);
                }
                E = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = BasicRectRenderer.A()[3];
            if (object6 == null) {
                char[] cArray = "\uf020\uf01c\uef62\uf016\uf012\uf011\uf012\uf016\uef6f\uef6a\uf012\uef62\uef8c\uef6f\uef80\uef7b\uef7b\uef78\uef55\uef7e".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 -= 27473;
                    n5 -= 34211;
                    n5 += 18341;
                    n5 ^= 0x9745;
                    n5 -= 55350;
                    n5 ^= 0x7766;
                    n5 ^= 0x6F7;
                    n5 -= 55896;
                    n5 ^= 0xA0F8;
                    n5 += 8265;
                    cArray[i4] = (char)(n5 += 53609);
                }
                object6 = BasicRectRenderer.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)E), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = F;
        if (F == null) {
            F = new Object[4];
            objectArray = F;
        }
        return objectArray;
    }

    public static void b() {
        g = new int[0xAF53 ^ 0xAEC3];
        BasicRectRenderer.g[0xCE9E ^ 0xCFE3] = 0xCF89 ^ 0xCFE3;
        BasicRectRenderer.g[0x1FE2 ^ 0x1EEF] = 0xFFFF83F7 ^ 0x1EEF;
        BasicRectRenderer.g[0x9600 ^ 0x9699] = 0xA5A1 ^ 0x9699;
        BasicRectRenderer.g[0x7D31 ^ 0x7D51] = 0xFFFF82A9 ^ 0x7D51;
        BasicRectRenderer.g[0xD4BD ^ 0xD429] = 0x5DA2 ^ 0xD429;
        BasicRectRenderer.g[0x89C9 ^ 0x891F] = 0x7894 ^ 0x891F;
        BasicRectRenderer.g[0x245D ^ 0x2491] = 0x3FAF ^ 0x2491;
        BasicRectRenderer.g[0xE962 ^ 0xE947] = 0xFFFF16E8 ^ 0xE947;
        BasicRectRenderer.g[0x85CF ^ 0x8576] = 0xA700 ^ 0x8576;
        BasicRectRenderer.g[0x1CD ^ 0x1A9] = 0x1D9 ^ 0x1A9;
        BasicRectRenderer.g[0xE674 ^ 0xE603] = 0xFFFF19EA ^ 0xE603;
        BasicRectRenderer.g[0xDF6C ^ 0xDE7B] = 0x8EE8 ^ 0xDE7B;
        BasicRectRenderer.g[0x822D ^ 0x837D] = 0xDD8 ^ 0x837D;
        BasicRectRenderer.g[0x2C13 ^ 0x2C82] = 0xF442 ^ 0x2C82;
        BasicRectRenderer.g[0xEF1D ^ 0xEE5E] = 0x586 ^ 0xEE5E;
        BasicRectRenderer.g[0x5FBD ^ 0x5FDE] = 0x5FC8 ^ 0x5FDE;
        BasicRectRenderer.g[0x635C ^ 0x63C1] = 0xCEA ^ 0x63C1;
        BasicRectRenderer.g[0x5161 ^ 0x5032] = 0x5032 ^ 0x5032;
        BasicRectRenderer.g[0x8729 ^ 0x8701] = 0xFFFF7898 ^ 0x8701;
        BasicRectRenderer.g[0x2D5D ^ 0x2D6B] = 0xB888 ^ 0x2D6B;
        BasicRectRenderer.g[0x6B5A ^ 0x6A00] = 0x3AE5 ^ 0x6A00;
        BasicRectRenderer.g[0x5B2B ^ 0x5B93] = 0x79E2 ^ 0x5B93;
        BasicRectRenderer.g[0xB558 ^ 0xB55B] = 0xFFFF4AFD ^ 0xB55B;
        BasicRectRenderer.g[0x9D25 ^ 0x9D90] = 0xC4A1 ^ 0x9D90;
        BasicRectRenderer.g[0xFE38 ^ 0xFF43] = 0xFF4D ^ 0xFF43;
        BasicRectRenderer.g[0x554F ^ 0x54CD] = 0x54C8 ^ 0x54CD;
        BasicRectRenderer.g[0x25E6 ^ 0x2576] = 0xFDB5 ^ 0x2576;
        BasicRectRenderer.g[0xF5AD ^ 0xF48B] = 0x80DF ^ 0xF48B;
        BasicRectRenderer.g[0xF2B1 ^ 0xF38C] = 0x852C ^ 0xF38C;
        BasicRectRenderer.g[0x8B69 ^ 0x8B42] = 0x8B07 ^ 0x8B42;
        BasicRectRenderer.g[0x94BF ^ 0x9412] = 0x32FD ^ 0x9412;
        BasicRectRenderer.g[0xC672 ^ 0xC6DA] = 0x10C0 ^ 0xC6DA;
        BasicRectRenderer.g[0xE0B2 ^ 0xE00F] = 0xF6DA ^ 0xE00F;
        BasicRectRenderer.g[0xEC23 ^ 0xECC4] = 0xF4C0 ^ 0xECC4;
        BasicRectRenderer.g[0xA6C5 ^ 0xA743] = 0xA744 ^ 0xA743;
        BasicRectRenderer.g[0x66E6 ^ 0x6688] = 0xFFFF9903 ^ 0x6688;
        BasicRectRenderer.g[0x68E7 ^ 0x6821] = 0xFFFF4286 ^ 0x6821;
        BasicRectRenderer.g[0x8FD0 ^ 0x8EA3] = 0xFFFF7138 ^ 0x8EA3;
        BasicRectRenderer.g[0x4E22 ^ 0x4F53] = 0xFFFFB0EC ^ 0x4F53;
        BasicRectRenderer.g[0x8CE7 ^ 0x8CAB] = 0xFFFF7300 ^ 0x8CAB;
        BasicRectRenderer.g[0x10310 ^ 0x10228] = 0x15264 ^ 0x10228;
        BasicRectRenderer.g[0xB6A8 ^ 0xB6DE] = 0xFFFF4963 ^ 0xB6DE;
        BasicRectRenderer.g[0xBC3 ^ 0xAFC] = 0x1E5C ^ 0xAFC;
        BasicRectRenderer.g[0x6C88 ^ 0x6CFC] = 0xFFFF9351 ^ 0x6CFC;
        BasicRectRenderer.g[0xFFCB ^ 0xFEC7] = 0x9C58 ^ 0xFEC7;
        BasicRectRenderer.g[0xA2D1 ^ 0xA2D7] = 0xFFFF5D1A ^ 0xA2D7;
        BasicRectRenderer.g[0x7AC6 ^ 0x7BB3] = 0xFFFF8444 ^ 0x7BB3;
        BasicRectRenderer.g[0xF61C ^ 0xF703] = 0x6DC7 ^ 0xF703;
        BasicRectRenderer.g[0x235D ^ 0x23A5] = 0xFB4D ^ 0x23A5;
        BasicRectRenderer.g[0xA65D ^ 0xA66C] = 0xA66E ^ 0xA66C;
        BasicRectRenderer.g[0xAFE1 ^ 0xAF1D] = 0x6D06 ^ 0xAF1D;
        BasicRectRenderer.g[0xDC50 ^ 0xDD6A] = 0x8D26 ^ 0xDD6A;
        BasicRectRenderer.g[0x334A ^ 0x33BA] = 0x6207 ^ 0x33BA;
        BasicRectRenderer.g[0x1974 ^ 0x186E] = 0x48FF ^ 0x186E;
        BasicRectRenderer.g[0xC4A9 ^ 0xC5CB] = 0x158 ^ 0xC5CB;
        BasicRectRenderer.g[0x1B54 ^ 0x1BD2] = 0x1BD9 ^ 0x1BD2;
        BasicRectRenderer.g[0xB340 ^ 0xB208] = 0x1B142 ^ 0xB208;
        BasicRectRenderer.g[0xF546 ^ 0xF57E] = 0x5BB4 ^ 0xF57E;
        BasicRectRenderer.g[0x1B67 ^ 0x1B1F] = 0x1B53 ^ 0x1B1F;
        BasicRectRenderer.g[0x10E31 ^ 0x10EF8] = 0x13F75 ^ 0x10EF8;
        BasicRectRenderer.g[0xF7A1 ^ 0xF74B] = 0xEF48 ^ 0xF74B;
        BasicRectRenderer.g[0xF9F1 ^ 0xF8C5] = 0xDD39 ^ 0xF8C5;
        BasicRectRenderer.g[0x6555 ^ 0x65B9] = 0x5250 ^ 0x65B9;
        BasicRectRenderer.g[0xCA64 ^ 0xCA61] = 0xFFFF35A3 ^ 0xCA61;
        BasicRectRenderer.g[0x61EF ^ 0x60DC] = 0x453E ^ 0x60DC;
        BasicRectRenderer.g[0xBF3E ^ 0xBFFF] = 0x827A ^ 0xBFFF;
        BasicRectRenderer.g[0x2ED4 ^ 0x2E2D] = 0xFFFF091F ^ 0x2E2D;
        BasicRectRenderer.g[0xEC40 ^ 0xECA8] = 0xF4AB ^ 0xECA8;
        BasicRectRenderer.g[0xD68A ^ 0xD7E3] = 0xFFFF281C ^ 0xD7E3;
        BasicRectRenderer.g[0x7F6B ^ 0x7F58] = 0x7F58 ^ 0x7F58;
        BasicRectRenderer.g[0x45B6 ^ 0x45E0] = 0xFFFFBA6D ^ 0x45E0;
        BasicRectRenderer.g[0x7F1F ^ 0x7FD0] = 0x64E3 ^ 0x7FD0;
        BasicRectRenderer.g[0xCB71 ^ 0xCA59] = 0x75EF ^ 0xCA59;
        BasicRectRenderer.g[0xA8EF ^ 0xA84D] = 0x1016 ^ 0xA84D;
        BasicRectRenderer.g[0x2FE5 ^ 0x2F43] = 0xFFFF4CC6 ^ 0x2F43;
        BasicRectRenderer.g[0x813C ^ 0x8126] = 0x8133 ^ 0x8126;
        BasicRectRenderer.g[0xCDB4 ^ 0xCDF1] = 0xFFFF3234 ^ 0xCDF1;
        BasicRectRenderer.g[0xDF ^ 0x52] = 0x52 ^ 0x52;
        BasicRectRenderer.g[0x80D1 ^ 0x81E3] = 0xC4F0 ^ 0x81E3;
        BasicRectRenderer.g[0x11B8 ^ 0x11A6] = 0x1195 ^ 0x11A6;
        BasicRectRenderer.g[0x60E8 ^ 0x61A7] = 0xEF13 ^ 0x61A7;
        BasicRectRenderer.g[0xB09D ^ 0xB184] = 0xE136 ^ 0xB184;
        BasicRectRenderer.g[0x91C3 ^ 0x9164] = 0xD44 ^ 0x9164;
        BasicRectRenderer.g[0xBA51 ^ 0xBA89] = 0x695D ^ 0xBA89;
        BasicRectRenderer.g[0x9091 ^ 0x9080] = 0x9098 ^ 0x9080;
        BasicRectRenderer.g[0x2B97 ^ 0x2B40] = 0xF882 ^ 0x2B40;
        BasicRectRenderer.g[0x5563 ^ 0x556D] = 0xFFFFAAB8 ^ 0x556D;
        BasicRectRenderer.g[0xF595 ^ 0xF530] = 0x6910 ^ 0xF530;
        BasicRectRenderer.g[0x37BB ^ 0x3705] = 0xFFFFDE62 ^ 0x3705;
        BasicRectRenderer.g[0xE652 ^ 0xE65F] = 0xFFFF1983 ^ 0xE65F;
        BasicRectRenderer.g[0x63FB ^ 0x62EB] = 0x166BB ^ 0x62EB;
        BasicRectRenderer.g[0xD8F9 ^ 0xD9FA] = 0x1DF56 ^ 0xD9FA;
        BasicRectRenderer.g[0x5EFC ^ 0x5FA9] = 0x5FA9 ^ 0x5FA9;
        BasicRectRenderer.g[0x668F ^ 0x6634] = 0x4442 ^ 0x6634;
        BasicRectRenderer.g[0x10CEF ^ 0x10D83] = 0x10D85 ^ 0x10D83;
        BasicRectRenderer.g[0xD9D1 ^ 0xD98D] = 0xFFFF2628 ^ 0xD98D;
        BasicRectRenderer.g[0x10A28 ^ 0x10BA8] = 0x10BA5 ^ 0x10BA8;
        BasicRectRenderer.g[0xBFBE ^ 0xBF7D] = 0x82F8 ^ 0xBF7D;
        BasicRectRenderer.g[0x2F3E ^ 0x2FA4] = 0xFFFFE348 ^ 0x2FA4;
        BasicRectRenderer.g[0xF5EE ^ 0xF500] = 0xC2E9 ^ 0xF500;
        BasicRectRenderer.g[0xEBFF ^ 0xEA95] = 0xEA9B ^ 0xEA95;
        BasicRectRenderer.g[0x4E12 ^ 0x4EE4] = 0x8A5E ^ 0x4EE4;
        BasicRectRenderer.g[0x4615 ^ 0x4770] = 0xBB07 ^ 0x4770;
        BasicRectRenderer.g[0x3DD5 ^ 0x3D47] = 0xFFFF1A16 ^ 0x3D47;
        BasicRectRenderer.g[0x105C4 ^ 0x10506] = 0x138C6 ^ 0x10506;
        BasicRectRenderer.g[0xD845 ^ 0xD853] = 0xD82A ^ 0xD853;
        BasicRectRenderer.g[0x6651 ^ 0x672F] = 0x6724 ^ 0x672F;
        BasicRectRenderer.g[0x9F9E ^ 0x9F8E] = 0x9F8E ^ 0x9F8E;
        BasicRectRenderer.g[0x945 ^ 0x991] = 0xF81A ^ 0x991;
        BasicRectRenderer.g[0x1FF2 ^ 0x1EB0] = 0xA10 ^ 0x1EB0;
        BasicRectRenderer.g[0x83D4 ^ 0x83EB] = 0x5E51 ^ 0x83EB;
        BasicRectRenderer.g[0x877 ^ 0x85B] = 0xFFFFF79D ^ 0x85B;
        BasicRectRenderer.g[0x8C87 ^ 0x8DC2] = 0xFFFF99D0 ^ 0x8DC2;
        BasicRectRenderer.g[0xA8F8 ^ 0xA893] = 0xA896 ^ 0xA893;
        BasicRectRenderer.g[0xE881 ^ 0xE8F8] = 0xFFFF170E ^ 0xE8F8;
        BasicRectRenderer.g[0x4346 ^ 0x437B] = 0x16E2 ^ 0x437B;
        BasicRectRenderer.g[0xBE17 ^ 0xBF6F] = 0xBF65 ^ 0xBF6F;
        BasicRectRenderer.g[0x11F7 ^ 0x11D5] = 0xFFFFEE1A ^ 0x11D5;
        BasicRectRenderer.g[0x19DA ^ 0x18F5] = 0x5DE5 ^ 0x18F5;
        BasicRectRenderer.g[0xE852 ^ 0xE858] = 0xFFFF17D6 ^ 0xE858;
        BasicRectRenderer.g[0xC614 ^ 0xC791] = 0xC790 ^ 0xC791;
        BasicRectRenderer.g[0x2E43 ^ 0x2E1E] = 0x2E15 ^ 0x2E1E;
        BasicRectRenderer.g[0xCD5 ^ 0xCFB] = 0xCFB ^ 0xCFB;
        BasicRectRenderer.g[0xDD9B ^ 0xDCF0] = 0xFFFF236E ^ 0xDCF0;
        BasicRectRenderer.g[0x3A4C ^ 0x3A8C] = 0x709 ^ 0x3A8C;
        BasicRectRenderer.g[0x707D ^ 0x70E5] = 0x43D1 ^ 0x70E5;
        BasicRectRenderer.g[0xD9B9 ^ 0xD9EB] = 0xD9E0 ^ 0xD9EB;
        BasicRectRenderer.g[0xCB85 ^ 0xCB35] = 0x8C88 ^ 0xCB35;
        BasicRectRenderer.g[0xDEB6 ^ 0xDEE8] = 0xFFFF212E ^ 0xDEE8;
        BasicRectRenderer.g[0xB699 ^ 0xB6E6] = 0xFFFF4939 ^ 0xB6E6;
        BasicRectRenderer.g[0x7E4E ^ 0x7EEE] = 0xC6F6 ^ 0x7EEE;
        BasicRectRenderer.g[0x98CA ^ 0x99E6] = 0x1971D ^ 0x99E6;
        BasicRectRenderer.g[0x1071 ^ 0x1162] = 0x37E ^ 0x1162;
        BasicRectRenderer.g[0x6797 ^ 0x66C1] = 0x66C0 ^ 0x66C1;
        BasicRectRenderer.g[0x54E8 ^ 0x55A1] = 0xFFFEA927 ^ 0x55A1;
        BasicRectRenderer.g[0xE287 ^ 0xE23D] = 0xC05F ^ 0xE23D;
        BasicRectRenderer.g[0x58D2 ^ 0x59E9] = 0x2F51 ^ 0x59E9;
        BasicRectRenderer.g[0x108B7 ^ 0x108F8] = 0x108C3 ^ 0x108F8;
        BasicRectRenderer.g[0x3F2E ^ 0x3E12] = 0x48A5 ^ 0x3E12;
        BasicRectRenderer.g[0xCE4D ^ 0xCE42] = 0xCE5D ^ 0xCE42;
        BasicRectRenderer.g[0x3444 ^ 0x3551] = 0x274B ^ 0x3551;
        BasicRectRenderer.g[0x748E ^ 0x758C] = 0x1360 ^ 0x758C;
        BasicRectRenderer.g[0x72FA ^ 0x7237] = 0x6904 ^ 0x7237;
        BasicRectRenderer.g[0xBD14 ^ 0xBD03] = 0xFFFF42F1 ^ 0xBD03;
        BasicRectRenderer.g[0xB735 ^ 0xB647] = 0xB64F ^ 0xB647;
        BasicRectRenderer.g[0xA61 ^ 0xB2B] = 0x10861 ^ 0xB2B;
        BasicRectRenderer.g[0x1F3E ^ 0x1F40] = 0xFFFFE094 ^ 0x1F40;
        BasicRectRenderer.g[0x2E95 ^ 0x2E5B] = 0xFFFFCA8C ^ 0x2E5B;
        BasicRectRenderer.g[0xA90D ^ 0xA879] = 0xA87A ^ 0xA879;
        BasicRectRenderer.g[0x7126 ^ 0x703B] = 0xFFFFD0A9 ^ 0x703B;
        BasicRectRenderer.g[0xA716 ^ 0xA792] = 0xFFFF5838 ^ 0xA792;
        BasicRectRenderer.g[0x1031B ^ 0x10231] = 0x1BD87 ^ 0x10231;
        BasicRectRenderer.g[0x8FE9 ^ 0x8FF6] = 0xFFFF700D ^ 0x8FF6;
        BasicRectRenderer.g[0xB707 ^ 0xB7DD] = 0x6409 ^ 0xB7DD;
        BasicRectRenderer.g[0x4170 ^ 0x4118] = 0x417A ^ 0x4118;
        BasicRectRenderer.g[0x43D ^ 0x4C6] = 0xC6D3 ^ 0x4C6;
        BasicRectRenderer.g[0xF551 ^ 0xF506] = 0xF50A ^ 0xF506;
        BasicRectRenderer.g[0xA ^ 0x134] = 0x7783 ^ 0x134;
        BasicRectRenderer.g[0xAC6 ^ 0xA19] = 0x5911 ^ 0xA19;
        BasicRectRenderer.g[0x1021 ^ 0x10E6] = 0xC5A9 ^ 0x10E6;
        BasicRectRenderer.g[0xEB9A ^ 0xEB30] = 0x3D5F ^ 0xEB30;
        BasicRectRenderer.g[0x1D62 ^ 0x1DE2] = 0x1DFD ^ 0x1DE2;
        BasicRectRenderer.g[0xAE7C ^ 0xAF12] = 0xAF12 ^ 0xAF12;
        BasicRectRenderer.g[0x1EB1 ^ 0x1E00] = 0x59B3 ^ 0x1E00;
        BasicRectRenderer.g[0x2D8A ^ 0x2D68] = 0x7E79 ^ 0x2D68;
        BasicRectRenderer.g[0xE63F ^ 0xE622] = 0xE61D ^ 0xE622;
        BasicRectRenderer.g[0x8FAB ^ 0x8FA3] = 0x8FBF ^ 0x8FA3;
        BasicRectRenderer.g[0xBD3A ^ 0xBC45] = 0xFFFF43A9 ^ 0xBC45;
        BasicRectRenderer.g[0x401F ^ 0x412F] = 0x43C ^ 0x412F;
        BasicRectRenderer.g[0x9DD9 ^ 0x9D72] = 0x4B69 ^ 0x9D72;
        BasicRectRenderer.g[0xCDCA ^ 0xCCC4] = 0xAE5B ^ 0xCCC4;
        BasicRectRenderer.g[0x74E1 ^ 0x75C5] = 0x191 ^ 0x75C5;
        BasicRectRenderer.g[0xA50C ^ 0xA546] = 0xFFFF5ABC ^ 0xA546;
        BasicRectRenderer.g[0x2653 ^ 0x261E] = 0xFFFFD9E0 ^ 0x261E;
        BasicRectRenderer.g[0xF68D ^ 0xF7A0] = 0x1F95F ^ 0xF7A0;
        BasicRectRenderer.g[0xF73C ^ 0xF77F] = 0xF768 ^ 0xF77F;
        BasicRectRenderer.g[0xEE90 ^ 0xEE33] = 0x5621 ^ 0xEE33;
        BasicRectRenderer.g[0xB9FB ^ 0xB8D2] = 0x729 ^ 0xB8D2;
        BasicRectRenderer.g[0x8E9D ^ 0x8EC7] = 0xFFFF7123 ^ 0x8EC7;
        BasicRectRenderer.g[0x6D58 ^ 0x6C6F] = 0x3C3F ^ 0x6C6F;
        BasicRectRenderer.g[0xBB9B ^ 0xBB37] = 0x1DDC ^ 0xBB37;
        BasicRectRenderer.g[0xD1C3 ^ 0xD1C2] = 0xFFFF2E6D ^ 0xD1C2;
        BasicRectRenderer.g[0x31BB ^ 0x3037] = 0x3034 ^ 0x3037;
        BasicRectRenderer.g[0x1686 ^ 0x160C] = 0x160C ^ 0x160C;
        BasicRectRenderer.g[0x6FEC ^ 0x6F50] = 0x7983 ^ 0x6F50;
        BasicRectRenderer.g[0xB8C6 ^ 0xB851] = 0x31D5 ^ 0xB851;
        BasicRectRenderer.g[0x46E2 ^ 0x4769] = 0x4769 ^ 0x4769;
        BasicRectRenderer.g[0x526A ^ 0x5287] = 0x6516 ^ 0x5287;
        BasicRectRenderer.g[0x60B6 ^ 0x6055] = 0x1E83 ^ 0x6055;
        BasicRectRenderer.g[0x108E0 ^ 0x108DE] = 0x14A27 ^ 0x108DE;
        BasicRectRenderer.g[0xD813 ^ 0xD942] = 0xFFFFA87B ^ 0xD942;
        BasicRectRenderer.g[0x96B5 ^ 0x97EE] = 0xC368 ^ 0x97EE;
        BasicRectRenderer.g[0x9C03 ^ 0x9D35] = 0xB8C9 ^ 0x9D35;
        BasicRectRenderer.g[0xDD1A ^ 0xDD9F] = 0xFFFF2202 ^ 0xDD9F;
        BasicRectRenderer.g[0x2DE7 ^ 0x2DCA] = 0x2DC9 ^ 0x2DCA;
        BasicRectRenderer.g[0x4A61 ^ 0x4A4E] = 0x4A4F ^ 0x4A4E;
        BasicRectRenderer.g[0xFE56 ^ 0xFE43] = 0xFE31 ^ 0xFE43;
        BasicRectRenderer.g[0x5A03 ^ 0x5A81] = 0xFFFFA54F ^ 0x5A81;
        BasicRectRenderer.g[0x7422 ^ 0x7483] = 0xCC91 ^ 0x7483;
        BasicRectRenderer.g[0x10FCC ^ 0x10EEE] = 0x19435 ^ 0x10EEE;
        BasicRectRenderer.g[0x669B ^ 0x6646] = 0xFFFF8F8C ^ 0x6646;
        BasicRectRenderer.g[0xB8B9 ^ 0xB883] = 0xB3CC ^ 0xB883;
        BasicRectRenderer.g[0x91B3 ^ 0x9177] = 0x443A ^ 0x9177;
        BasicRectRenderer.g[0x4B15 ^ 0x4A9B] = 0x4DF ^ 0x4A9B;
        BasicRectRenderer.g[0x9EEA ^ 0x9ED3] = 0x9B3F ^ 0x9ED3;
        BasicRectRenderer.g[0x73DB ^ 0x73C8] = 0xFFFF8C70 ^ 0x73C8;
        BasicRectRenderer.g[0x218C ^ 0x21AB] = 0xFFFFDED8 ^ 0x21AB;
        BasicRectRenderer.g[0x3F26 ^ 0x3E50] = 0x3E59 ^ 0x3E50;
        BasicRectRenderer.g[0xA529 ^ 0xA5D7] = 0x67CC ^ 0xA5D7;
        BasicRectRenderer.g[0x3EA7 ^ 0x3E76] = 0x7A03 ^ 0x3E76;
        BasicRectRenderer.g[0x10D22 ^ 0x10D45] = 0x10D82 ^ 0x10D45;
        BasicRectRenderer.g[0xF4C9 ^ 0xF4B4] = 0xFFFF0B1F ^ 0xF4B4;
        BasicRectRenderer.g[0x771E ^ 0x7765] = 0xFFFF88D4 ^ 0x7765;
        BasicRectRenderer.g[0xDF3C ^ 0xDF30] = 0xDF39 ^ 0xDF30;
        BasicRectRenderer.g[0x2CD4 ^ 0x2C1F] = 0x1D92 ^ 0x2C1F;
        BasicRectRenderer.g[0x9FF4 ^ 0x9FC6] = 0x9FC6 ^ 0x9FC6;
        BasicRectRenderer.g[0x519 ^ 0x440] = 0x2100 ^ 0x440;
        BasicRectRenderer.g[0x10B5 ^ 0x1082] = 0x3B06 ^ 0x1082;
        BasicRectRenderer.g[0xFFCE ^ 0xFFD7] = 0xFFF7 ^ 0xFFD7;
        BasicRectRenderer.g[0x824A ^ 0x8361] = 0x18D8A ^ 0x8361;
        BasicRectRenderer.g[0x6623 ^ 0x664A] = 0x660F ^ 0x664A;
        BasicRectRenderer.g[0x7A6B ^ 0x7AE7] = 0x7AE6 ^ 0x7AE7;
        BasicRectRenderer.g[0x105AE ^ 0x105E9] = 0xFFFEFA02 ^ 0x105E9;
        BasicRectRenderer.g[0x10789 ^ 0x10698] = 0xFFFFFD67 ^ 0x10698;
        BasicRectRenderer.g[0x9E60 ^ 0x9E05] = 0xFFFF61A0 ^ 0x9E05;
        BasicRectRenderer.g[0xC37F ^ 0xC39E] = 0x909F ^ 0xC39E;
        BasicRectRenderer.g[0x3C87 ^ 0x3C5B] = 0x2A54 ^ 0x3C5B;
        BasicRectRenderer.g[0xC4D1 ^ 0xC4B3] = 0xFFFF3B1E ^ 0xC4B3;
        BasicRectRenderer.g[0xC674 ^ 0xC6FA] = 0xC2A1 ^ 0xC6FA;
        BasicRectRenderer.g[0xF11 ^ 0xF18] = 0xFBC ^ 0xF18;
        BasicRectRenderer.g[0x1EC0 ^ 0x1EB0] = 0xFFFFE124 ^ 0x1EB0;
        BasicRectRenderer.g[0xD0B4 ^ 0xD0E0] = 0xFFFF2F13 ^ 0xD0E0;
        BasicRectRenderer.g[0xC1FB ^ 0xC0E3] = 0x9072 ^ 0xC0E3;
        BasicRectRenderer.g[0xC6EA ^ 0xC7E3] = 0x9343 ^ 0xC7E3;
        BasicRectRenderer.g[0xB24B ^ 0xB2C0] = 0xB2C1 ^ 0xB2C0;
        BasicRectRenderer.g[0x57D3 ^ 0x570D] = 0x4102 ^ 0x570D;
        BasicRectRenderer.g[0x739C ^ 0x72FD] = 0xBFAC ^ 0x72FD;
        BasicRectRenderer.g[0x4925 ^ 0x49F5] = 0x49F5 ^ 0x49F5;
        BasicRectRenderer.g[0x2510 ^ 0x256C] = 0x2513 ^ 0x256C;
        BasicRectRenderer.g[0x4F50 ^ 0x4EDD] = 0x36DC ^ 0x4EDD;
        BasicRectRenderer.g[0xE380 ^ 0xE374] = 0x27CE ^ 0xE374;
        BasicRectRenderer.g[0x8896 ^ 0x885E] = 0xB9D8 ^ 0x885E;
        BasicRectRenderer.g[0x938A ^ 0x9202] = 0x920E ^ 0x9202;
        BasicRectRenderer.g[0x41F4 ^ 0x410B] = 0x27F3 ^ 0x410B;
        BasicRectRenderer.g[0xED56 ^ 0xEDC9] = 0x82E2 ^ 0xEDC9;
        BasicRectRenderer.g[0x3B20 ^ 0x3A7D] = 0xBA35 ^ 0x3A7D;
        BasicRectRenderer.g[0x51FA ^ 0x5073] = 0x5173 ^ 0x5073;
        BasicRectRenderer.g[0xCC5D ^ 0xCC61] = 0xBEB0 ^ 0xCC61;
        BasicRectRenderer.g[0x60D0 ^ 0x6092] = 0x6092 ^ 0x6092;
        BasicRectRenderer.g[0x6A23 ^ 0x6A51] = 0x6A6D ^ 0x6A51;
        BasicRectRenderer.g[0x6AB0 ^ 0x6A41] = 0x3BF4 ^ 0x6A41;
        BasicRectRenderer.g[0x4DE8 ^ 0x4CE8] = 0x2A04 ^ 0x4CE8;
        BasicRectRenderer.g[0x1E6E ^ 0x1F31] = 0x981F ^ 0x1F31;
        BasicRectRenderer.g[0x458 ^ 0x559] = 0x6383 ^ 0x559;
        BasicRectRenderer.g[0xEBAD ^ 0xEA9C] = 0xFFFF5023 ^ 0xEA9C;
        BasicRectRenderer.g[0x1FDC ^ 0x1F38] = 0x61E4 ^ 0x1F38;
        BasicRectRenderer.g[0xFC14 ^ 0xFC61] = 0xFC0E ^ 0xFC61;
        BasicRectRenderer.g[0xAE72 ^ 0xAE36] = 0xFFFF51F8 ^ 0xAE36;
        BasicRectRenderer.g[0xC74D ^ 0xC71E] = 0xC716 ^ 0xC71E;
        BasicRectRenderer.g[0xB35F ^ 0xB34D] = 0xB38D ^ 0xB34D;
        BasicRectRenderer.g[0xCED6 ^ 0xCEBA] = 0xCEA4 ^ 0xCEBA;
        BasicRectRenderer.g[0xBDD2 ^ 0xBD21] = 0x799D ^ 0xBD21;
        BasicRectRenderer.g[0xD01E ^ 0xD162] = 0xD166 ^ 0xD162;
        BasicRectRenderer.g[0xA918 ^ 0xA90C] = 0xA977 ^ 0xA90C;
        BasicRectRenderer.g[0xAFB9 ^ 0xAF16] = 0x9F9 ^ 0xAF16;
        BasicRectRenderer.g[0xB04F ^ 0xB01A] = 0xFFFF4F9A ^ 0xB01A;
        BasicRectRenderer.g[0xC45B ^ 0xC505] = 0x6C0F ^ 0xC505;
        BasicRectRenderer.g[0x631D ^ 0x6215] = 0x3692 ^ 0x6215;
        BasicRectRenderer.g[0x99CB ^ 0x999B] = 0x99DE ^ 0x999B;
        BasicRectRenderer.g[0x9F91 ^ 0x9EF5] = 0xE422 ^ 0x9EF5;
        BasicRectRenderer.g[0x1617 ^ 0x165E] = 0xFFFFE9FE ^ 0x165E;
        BasicRectRenderer.g[0x1031A ^ 0x1034B] = 0x10361 ^ 0x1034B;
        BasicRectRenderer.g[0x2055 ^ 0x2107] = 0xAFA2 ^ 0x2107;
        BasicRectRenderer.g[0x20BD ^ 0x2139] = 0x2136 ^ 0x2139;
        BasicRectRenderer.g[0x5F62 ^ 0x5F08] = 0x5F33 ^ 0x5F08;
        BasicRectRenderer.g[0x85BB ^ 0x8591] = 0x858E ^ 0x8591;
        BasicRectRenderer.g[0x1FD8 ^ 0x1F43] = 0x2C7B ^ 0x1F43;
        BasicRectRenderer.g[0x2466 ^ 0x247E] = 0xFFFFDB81 ^ 0x247E;
        BasicRectRenderer.g[0xF116 ^ 0xF1CD] = 0xE7CA ^ 0xF1CD;
        BasicRectRenderer.g[0x3D57 ^ 0x3C2E] = 0x3C4F ^ 0x3C2E;
        BasicRectRenderer.g[0xF5A1 ^ 0xF581] = 0xFFFF0A45 ^ 0xF581;
        BasicRectRenderer.g[0x64C2 ^ 0x6417] = 0xFFFF6A78 ^ 0x6417;
        BasicRectRenderer.g[0x3976 ^ 0x392D] = 0xFFFFC6FD ^ 0x392D;
        BasicRectRenderer.g[0xB78E ^ 0xB7B5] = 0xBB84 ^ 0xB7B5;
        BasicRectRenderer.g[0xA838 ^ 0xA93E] = 0x1AF97 ^ 0xA93E;
        BasicRectRenderer.g[0xDB3D ^ 0xDA21] = 0x851A ^ 0xDA21;
        BasicRectRenderer.g[0x8799 ^ 0x8726] = 0x91F3 ^ 0x8726;
        BasicRectRenderer.g[0x63BD ^ 0x630A] = 0x3A3B ^ 0x630A;
        BasicRectRenderer.g[0x217C ^ 0x2028] = 0x2028 ^ 0x2028;
        BasicRectRenderer.g[0x3804 ^ 0x391A] = 0x6621 ^ 0x391A;
        BasicRectRenderer.g[0xC6EF ^ 0xC780] = 0xC794 ^ 0xC780;
        BasicRectRenderer.g[0xF396 ^ 0xF363] = 0x3795 ^ 0xF363;
        BasicRectRenderer.g[0x223F ^ 0x2372] = 0xFFFF87D5 ^ 0x2372;
        BasicRectRenderer.g[0xD66F ^ 0xD75A] = 0xF2C4 ^ 0xD75A;
        BasicRectRenderer.g[0x13A7 ^ 0x1393] = 0x130B ^ 0x1393;
        BasicRectRenderer.g[0x29D8 ^ 0x2893] = 0x73AB ^ 0x2893;
        BasicRectRenderer.g[0xAF7A ^ 0xAF7D] = 0xFFFF50C9 ^ 0xAF7D;
        BasicRectRenderer.g[0xC8A2 ^ 0xC849] = 0xFFB7 ^ 0xC849;
        BasicRectRenderer.g[0x428D ^ 0x42CC] = 0x6053 ^ 0x42CC;
        BasicRectRenderer.g[0x24B ^ 0x317] = 0x3830 ^ 0x317;
        BasicRectRenderer.g[0xA6E7 ^ 0xA671] = 0x2FE8 ^ 0xA671;
        BasicRectRenderer.g[0xFB15 ^ 0xFBEF] = 0x2307 ^ 0xFBEF;
        BasicRectRenderer.g[0x3399 ^ 0x3392] = 0xFFFFCC45 ^ 0x3392;
        BasicRectRenderer.g[0x283B ^ 0x28DB] = 0x7BCA ^ 0x28DB;
        BasicRectRenderer.g[0xDAAE ^ 0xDA59] = 0x2A3 ^ 0xDA59;
        BasicRectRenderer.g[0x9C70 ^ 0x9DFF] = 0x4D0A ^ 0x9DFF;
        BasicRectRenderer.g[0xC768 ^ 0xC7DA] = 0x8019 ^ 0xC7DA;
        BasicRectRenderer.g[0xC9BD ^ 0xC8B8] = 0x1CE14 ^ 0xC8B8;
        BasicRectRenderer.g[0x1DCA ^ 0x1CEA] = 0x8631 ^ 0x1CEA;
        BasicRectRenderer.g[0xAD8B ^ 0xADA8] = 0xADE5 ^ 0xADA8;
        BasicRectRenderer.g[0x10792 ^ 0x107E8] = 0xFFFEF871 ^ 0x107E8;
        BasicRectRenderer.g[0x9C0 ^ 0x999] = 0x9C1 ^ 0x999;
        BasicRectRenderer.g[0x10CA4 ^ 0x10C56] = 0x15DEB ^ 0x10C56;
        BasicRectRenderer.g[0xA92C ^ 0xA99A] = 0xF098 ^ 0xA99A;
        BasicRectRenderer.g[0x104A5 ^ 0x10436] = 0x1DCF6 ^ 0x10436;
        BasicRectRenderer.g[0xEE21 ^ 0xEF49] = 0xEF4B ^ 0xEF49;
        BasicRectRenderer.g[0x1ECA ^ 0x1ED1] = 0x1EF4 ^ 0x1ED1;
        BasicRectRenderer.g[0xFA93 ^ 0xFBD2] = 0xEF27 ^ 0xFBD2;
        BasicRectRenderer.g[0x3D81 ^ 0x3D4B] = 0xFFFFF339 ^ 0x3D4B;
        BasicRectRenderer.g[0x8535 ^ 0x8573] = 0x8571 ^ 0x8573;
        BasicRectRenderer.g[0x744 ^ 0x627] = 0x1BB1 ^ 0x627;
        BasicRectRenderer.g[0x392F ^ 0x398B] = 0xA5AE ^ 0x398B;
        BasicRectRenderer.g[0xB3CF ^ 0xB316] = 0x6087 ^ 0xB316;
        BasicRectRenderer.g[0x2686 ^ 0x27A1] = 0x9804 ^ 0x27A1;
        BasicRectRenderer.g[0xEBD9 ^ 0xEB91] = 0xEBA6 ^ 0xEB91;
        BasicRectRenderer.g[0x10B46 ^ 0x10A65] = 0x17E24 ^ 0x10A65;
        BasicRectRenderer.g[0xA37F ^ 0xA20F] = 0xA203 ^ 0xA20F;
        BasicRectRenderer.g[0xE20A ^ 0xE36C] = 0xE36D ^ 0xE36C;
        BasicRectRenderer.g[0x51DE ^ 0x50C8] = 0x42D9 ^ 0x50C8;
        BasicRectRenderer.g[0x209E ^ 0x20B8] = 0xFFFFDF34 ^ 0x20B8;
        BasicRectRenderer.g[0xE1A3 ^ 0xE09A] = 0xB0C6 ^ 0xE09A;
        BasicRectRenderer.g[0x7979 ^ 0x7949] = 0x7949 ^ 0x7949;
        BasicRectRenderer.g[0xB6C1 ^ 0xB74B] = 0xB749 ^ 0xB74B;
        BasicRectRenderer.g[0xC6B9 ^ 0xC7BE] = 0x9330 ^ 0xC7BE;
        BasicRectRenderer.g[0xC83C ^ 0xC8D5] = 0xD0DE ^ 0xC8D5;
        BasicRectRenderer.g[0xE7C8 ^ 0xE71B] = 0x168B ^ 0xE71B;
        BasicRectRenderer.g[0xA75F ^ 0xA7DE] = 0xFFFF581E ^ 0xA7DE;
        BasicRectRenderer.g[0x10A39 ^ 0x10A0C] = 0x11A0D ^ 0x10A0C;
        BasicRectRenderer.g[0xE2EC ^ 0xE3E8] = 0x1E541 ^ 0xE3E8;
        BasicRectRenderer.g[0x1B27 ^ 0x1B78] = 0xFFFFE496 ^ 0x1B78;
        BasicRectRenderer.g[0xEE7B ^ 0xEF71] = 0xBBF6 ^ 0xEF71;
        BasicRectRenderer.g[0xC946 ^ 0xC80A] = 0x932A ^ 0xC80A;
        BasicRectRenderer.g[0x1086B ^ 0x1080A] = 0xFFFEF7AD ^ 0x1080A;
        BasicRectRenderer.g[0xB112 ^ 0xB04A] = 0xB058 ^ 0xB04A;
        BasicRectRenderer.g[0x2500 ^ 0x25E6] = 0x5B3A ^ 0x25E6;
        BasicRectRenderer.g[0x6030 ^ 0x607E] = 0x602A ^ 0x607E;
        BasicRectRenderer.g[0x18F7 ^ 0x1891] = 0xFFFFE764 ^ 0x1891;
        BasicRectRenderer.g[0x6DF ^ 0x79B] = 0xEC47 ^ 0x79B;
        BasicRectRenderer.g[0x35D8 ^ 0x3498] = 0x2038 ^ 0x3498;
        BasicRectRenderer.g[0x7AA7 ^ 0x7A86] = 0x7A92 ^ 0x7A86;
        BasicRectRenderer.g[0xAE5B ^ 0xAE1B] = 0x3BC7 ^ 0xAE1B;
        BasicRectRenderer.g[0x69CC ^ 0x69BF] = 0x69A3 ^ 0x69BF;
        BasicRectRenderer.g[0xAD5F ^ 0xACDC] = 0xACF2 ^ 0xACDC;
        BasicRectRenderer.g[0xC04D ^ 0xC064] = 0xFFFF3FB3 ^ 0xC064;
        BasicRectRenderer.g[0x118D ^ 0x118F] = 0xFFFFEE22 ^ 0x118F;
        BasicRectRenderer.g[0xDAF9 ^ 0xDA76] = 0xDE3D ^ 0xDA76;
        BasicRectRenderer.g[0x74C6 ^ 0x7541] = 0xFFFF8AAE ^ 0x7541;
        BasicRectRenderer.g[0x10B90 ^ 0x10AB1] = 0xFFFE6FCF ^ 0x10AB1;
        BasicRectRenderer.g[0x6A02 ^ 0x6A9E] = 0x5BC ^ 0x6A9E;
        BasicRectRenderer.g[0x7518 ^ 0x75B1] = 0xA3AA ^ 0x75B1;
        BasicRectRenderer.g[0x6F07 ^ 0x6F84] = 0x6FE0 ^ 0x6F84;
        BasicRectRenderer.g[0x10796 ^ 0x106B3] = 0x172D0 ^ 0x106B3;
        BasicRectRenderer.g[0x92F4 ^ 0x9383] = 0x93C0 ^ 0x9383;
        BasicRectRenderer.g[0x5B39 ^ 0x5B61] = 0x5B05 ^ 0x5B61;
        BasicRectRenderer.g[0x2ABE ^ 0x2BF0] = 0x70D0 ^ 0x2BF0;
        BasicRectRenderer.g[0xF68E ^ 0xF692] = 0xF68C ^ 0xF692;
        BasicRectRenderer.g[0x10397 ^ 0x103DC] = 0x103E6 ^ 0x103DC;
        BasicRectRenderer.g[0x4F7A ^ 0x4E1A] = 0x19AA ^ 0x4E1A;
        BasicRectRenderer.g[0x932A ^ 0x923E] = 0x802F ^ 0x923E;
        BasicRectRenderer.g[0x59CD ^ 0x5953] = 0x3669 ^ 0x5953;
        BasicRectRenderer.g[0x7BC0 ^ 0x7B2F] = 0x2A88 ^ 0x7B2F;
        BasicRectRenderer.g[0x95F7 ^ 0x9532] = 0x407D ^ 0x9532;
        BasicRectRenderer.g[0x74F0 ^ 0x7422] = 0x3077 ^ 0x7422;
        BasicRectRenderer.g[0x450D ^ 0x4416] = 0x1B30 ^ 0x4416;
        BasicRectRenderer.g[0xBC69 ^ 0xBD2E] = 0x1BE65 ^ 0xBD2E;
        BasicRectRenderer.g[0x9F20 ^ 0x9E32] = 0x19A62 ^ 0x9E32;
        BasicRectRenderer.g[0xCC03 ^ 0xCC96] = 0x4512 ^ 0xCC96;
        BasicRectRenderer.g[0x6353 ^ 0x63AE] = 0xA1E7 ^ 0x63AE;
        BasicRectRenderer.g[0xBDB4 ^ 0xBCE3] = 0xBCE3 ^ 0xBCE3;
        BasicRectRenderer.g[0x1D6A ^ 0x1C2C] = 0xF7F0 ^ 0x1C2C;
        BasicRectRenderer.g[0x976D ^ 0x97E5] = 0x97E4 ^ 0x97E5;
        BasicRectRenderer.g[0xF41E ^ 0xF497] = 0xF495 ^ 0xF497;
        BasicRectRenderer.g[0x1662 ^ 0x1662] = 0x1666 ^ 0x1662;
        BasicRectRenderer.g[0x8B44 ^ 0x8A3E] = 0x8A3F ^ 0x8A3E;
        BasicRectRenderer.g[0x39A8 ^ 0x38C5] = 0x3898 ^ 0x38C5;
        BasicRectRenderer.g[0xA8E1 ^ 0xA986] = 0xA996 ^ 0xA986;
        BasicRectRenderer.g[0x8E1E ^ 0x8F30] = 0x181CB ^ 0x8F30;
        BasicRectRenderer.g[0xEE3E ^ 0xEE8A] = 0xB7B3 ^ 0xEE8A;
        BasicRectRenderer.g[0x1002F ^ 0x100A8] = 0x100C6 ^ 0x100A8;
        BasicRectRenderer.g[0x8743 ^ 0x87ED] = 0xFFFFDEFE ^ 0x87ED;
        BasicRectRenderer.g[0x98A3 ^ 0x99AC] = 0x19DF0 ^ 0x99AC;
        BasicRectRenderer.g[0x29EF ^ 0x29CB] = 0x29EA ^ 0x29CB;
        BasicRectRenderer.g[0x431C ^ 0x4217] = 0x2083 ^ 0x4217;
        BasicRectRenderer.g[0x8ECC ^ 0x8EC8] = 0x8EAD ^ 0x8EC8;
        BasicRectRenderer.g[0x5416 ^ 0x5467] = 0xFFFFABAF ^ 0x5467;
        BasicRectRenderer.g[0xBA7F ^ 0xBACC] = 0xFD7F ^ 0xBACC;
        BasicRectRenderer.g[0x974A ^ 0x9725] = 0x9719 ^ 0x9725;
        BasicRectRenderer.g[0xFC04 ^ 0xFD85] = 0xFFFF024F ^ 0xFD85;
        BasicRectRenderer.g[0x4D01 ^ 0x4D6C] = 0x4DBD ^ 0x4D6C;
        BasicRectRenderer.g[0xF5DC ^ 0xF539] = 0xFFFF7456 ^ 0xF539;
    }
}

