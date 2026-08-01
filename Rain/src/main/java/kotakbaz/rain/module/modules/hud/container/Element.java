/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.modules.hud.container;

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
import kotakbaz.rain.client.util.animations.AnimationUtil;
import kotakbaz.rain.client.util.render.font.E;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.module.modules.hud.container.A;
import kotakbaz.rain.module.modules.hud.container.B;
import kotakbaz.rain.module.modules.hud.container.C;
import kotakbaz.rain.module.modules.hud.container.HudStyle;
import kotakbaz.rain.module.modules.hud.container.a_0;
import kotakbaz.rain.module.modules.hud.container.b_0;
import kotakbaz.rain.module.modules.hud.container.d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n\u00a2\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\"\u001a\u00020\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\rR\"\u0010'\u001a\u00020\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%\"\u0004\b)\u0010\rR\"\u0010*\u001a\u00020\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%\"\u0004\b,\u0010\rR\"\u0010-\u001a\u00020\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b-\u0010#\u001a\u0004\b.\u0010%\"\u0004\b/\u0010\rR\u0017\u00101\u001a\u0002008\u0006\u00a2\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104\u00a8\u00065"}, d2={"Lkotakbaz/rain/module/modules/hud/container/Element;", "", "Lkotakbaz/rain/module/modules/hud/container/Data$First;", "first", "Lkotakbaz/rain/module/modules/hud/container/Data$Second;", "second", "<init>", "(Lkotakbaz/rain/module/modules/hud/container/Data$First;Lkotakbaz/rain/module/modules/hud/container/Data$Second;)V", "", "updateData", "", "textSize", "updateSize", "(F)V", "gapBetweenColumns", "totalWidth", "(F)F", "Lkotakbaz/rain/module/modules/hud/container/Data$First;", "getFirst", "()Lkotakbaz/rain/module/modules/hud/container/Data$First;", "setFirst", "(Lkotakbaz/rain/module/modules/hud/container/Data$First;)V", "Lkotakbaz/rain/module/modules/hud/container/Data$Second;", "getSecond", "()Lkotakbaz/rain/module/modules/hud/container/Data$Second;", "setSecond", "(Lkotakbaz/rain/module/modules/hud/container/Data$Second;)V", "", "valid", "Z", "getValid", "()Z", "setValid", "(Z)V", "progress", "F", "getProgress", "()F", "setProgress", "cachedWidthLeading", "getCachedWidthLeading", "setCachedWidthLeading", "cachedWidthFirst", "getCachedWidthFirst", "setCachedWidthFirst", "cachedWidthSecond", "getCachedWidthSecond", "setCachedWidthSecond", "Lkotakbaz/rain/client/util/animations/AnimationUtil;", "animation", "Lkotakbaz/rain/client/util/animations/AnimationUtil;", "getAnimation", "()Lkotakbaz/rain/client/util/animations/AnimationUtil;", "rain-visuals"})
public final class Element {
    @NotNull
    private b_0 a;
    @NotNull
    private d A;
    private boolean b;
    private float B;
    private float c;
    private float C;
    private float d;
    @NotNull
    private final AnimationUtil D;
    private static Object[] e;
    private static Object f;
    private static Object[] F;
    private static Object[] E;
    private static Object[] g;
    public static int[] G;

    public Element(@NotNull b_0 first, @NotNull d second) {
        int n2 = G[0];
        n2 -= G[1];
        Intrinsics.checkNotNullParameter(first, (String)e[n2 ^= G[2]]);
        int n3 = G[3];
        n3 ^= G[4];
        Intrinsics.checkNotNullParameter(second, (String)e[n3 ^= G[5]]);
        this.a = first;
        this.A = second;
        int n4 = G[6];
        n4 ^= G[7];
        this.b = n4 -= G[8];
        this.D = new AnimationUtil(0.0f);
    }

    @NotNull
    public final b_0 getFirst() {
        return this.a;
    }

    public final void setFirst(@NotNull b_0 b_02) {
        int n2 = G[9];
        n2 ^= G[10];
        Intrinsics.checkNotNullParameter(b_02, (String)e[n2 ^= G[11]]);
        this.a = b_02;
    }

    @NotNull
    public final d getSecond() {
        return this.A;
    }

    public final void setSecond(@NotNull d d2) {
        int n2 = G[12];
        n2 += G[13];
        Intrinsics.checkNotNullParameter(d2, (String)e[n2 -= G[14]]);
        this.A = d2;
    }

    public final boolean getValid() {
        return this.b;
    }

    public final void setValid(boolean bl) {
        this.b = bl;
    }

    public final float getProgress() {
        return this.B;
    }

    public final void setProgress(float f2) {
        this.B = f2;
    }

    public final float getCachedWidthLeading() {
        return this.c;
    }

    public final void setCachedWidthLeading(float f2) {
        this.c = f2;
    }

    public final float getCachedWidthFirst() {
        return this.C;
    }

    public final void setCachedWidthFirst(float f2) {
        this.C = f2;
    }

    public final float getCachedWidthSecond() {
        return this.d;
    }

    public final void setCachedWidthSecond(float f2) {
        this.d = f2;
    }

    @NotNull
    public final AnimationUtil getAnimation() {
        return this.D;
    }

    public final void updateData(@NotNull b_0 first, @NotNull d second) {
        int n2 = G[15];
        n2 -= G[16];
        Intrinsics.checkNotNullParameter(first, (String)e[n2 += G[17]]);
        int n3 = G[18];
        n3 ^= G[19];
        Intrinsics.checkNotNullParameter(second, (String)e[n3 -= G[20]]);
        this.a = first;
        this.A = second;
    }

    public final void updateSize(float textSize) {
        float f2;
        float f3 = HudStyle.INSTANCE.rowLeadingSize(textSize);
        B b2 = this.a.getLeading();
        if (b2 instanceof A) {
            int n2 = G[21];
            n2 -= G[22];
            f2 = kotakbaz.rain.client.util.render.font.E.getWidth$default(Font.INSTANCE.getICON(), ((A)b2).getText(), f3, 0.0f, n2 -= G[23], null);
        } else if (b2 instanceof a_0) {
            f2 = f3;
        } else if (b2 instanceof C) {
            f2 = f3;
        } else if (b2 == null) {
            f2 = 0.0f;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.c = f2;
        float f4 = this.a.getLeading() != null ? HudStyle.INSTANCE.rowLeadingGap() : 0.0f;
        int n3 = G[24];
        n3 -= G[25];
        this.C = this.c + f4 + kotakbaz.rain.client.util.render.font.E.getWidth$default(Font.INSTANCE.getGS_MEDIUM(), this.a.getText(), textSize, 0.0f, n3 -= G[26], null);
        int n4 = G[27];
        n4 -= G[28];
        this.d = kotakbaz.rain.client.util.render.font.E.getWidth$default(Font.INSTANCE.getGS_MEDIUM(), this.A.getText(), textSize, 0.0f, n4 -= G[29], null);
    }

    public final float totalWidth(float gapBetweenColumns) {
        return this.C + gapBetweenColumns + this.d;
    }

    static {
        Element.b();
        long l2 = -585805838448352351L;
        long l3 = 6453552886896757572L;
        long l4 = 6769610361230519488L;
        long l5 = -8720365691921520417L;
        long l6 = 4024211611171225599L;
        long l7 = -486284719367671730L;
        long l8 = 8597931260459401248L;
        long l9 = 7016520487393275609L;
        long l10 = 2993799213483417156L;
        long l11 = 4291228271465074517L;
        long l12 = -8429372139251296098L;
        long l13 = -936693875204728319L;
        long l14 = 753314795310755946L;
        long l15 = 961218389405310355L;
        int n2 = G[30];
        n2 += G[31];
        e = new Object[n2 ^= G[32]];
        long l16 = l15;
        int n3 = G[33];
        n3 += G[34];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 ^= G[35]);
        Object[] objectArray = new Object[G[36]];
        objectArray[Element.G[37]] = E;
        objectArray[Element.G[38]] = G[39];
        int n4 = G[40];
        Object object = Element.A()[G[41]];
        if (object == null) {
            char[] cArray = "\u7158\u7139\u71e2\u7198\u717d\u715f\u714c\u7142\u711b\u714c\u717a\u7178\u7177\u7180\u7142\u7194\u7148\u718e\u7194\u714c\u71e8\u713e\u71e3\u716e\u7119\u717d\u718e\u7178\u7459\u72a3\u7151\u715f\u7155\u717f\u711b\u71e8\u72a3\u714b\u711c\u7145\u7195\u7177\u7174\u745b\u7148\u7145\u715f\u711c\u71e2\u7148\u71e4\u7194\u714e\u7459\u7158\u713b\u7148\u715f\u7160\u717a\u7177\u716e\u7459\u7149\u71e3\u714c\u7178\u717a\u71e8\u71de\u7178\u717d\u711c\u7157\u715f\u7197\u7198\u713c\u72a2\u718a\u717f\u7151\u711b\u7174\u71e7\u7171\u71e2\u71e9\u716a\u7195\u7174\u72a2\u7157\u714e\u7196\u71e4\u713f\u717f\u713b\u7195\u7197\u745c\u7195\u713a\u7151\u7158\u715d\u716d".toCharArray();
            for (int i2 = G[42]; i2 < G[43]; ++i2) {
                int n5 = cArray[i2];
                n5 += G[44];
                n5 ^= G[45];
                n5 ^= G[46];
                n5 -= G[47];
                n5 -= G[48];
                n5 -= G[49];
                n5 ^= G[50];
                n5 -= G[51];
                n5 ^= G[52];
                n5 += G[53];
                n5 -= G[54];
                n5 ^= G[55];
                cArray[i2] = (char)(n5 += G[56]);
            }
            object = Element.A()[Element.G[57]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)Element.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = G[58];
        n6 -= G[59];
        l6 = l17 ^ (0x3000000000L ^ l17) & -1L << (n6 += G[60]);
        long l18 = l13;
        int n7 = G[61];
        n7 ^= G[62];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 ^= G[63]);
        while (true) {
            int n8 = G[64];
            n8 -= G[65];
            if ((int)l13 >= (int)(l6 >>> (n8 ^= G[66]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = G[67];
            n10 ^= G[68];
            int n11 = G[70];
            n11 += G[71];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 += G[69])) & -1L >>> (n11 ^= G[72]);
            long l20 = l9;
            int n12 = G[73];
            n12 += G[74];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 ^= G[75]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = G[76];
            n14 -= G[77];
            int n15 = G[79];
            n15 ^= G[80];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= G[78])) & -1L >>> (n15 += G[81]);
            int n16 = G[82];
            n16 ^= G[83];
            long l22 = l10;
            int n17 = G[85];
            n17 ^= G[86];
            l10 = l22 ^ ((long)cArray[n13] << (n16 ^= G[84]) ^ l22) & -1L << (n17 += G[87]);
            int n18 = G[88];
            n18 -= G[89];
            n18 += G[90];
            int n19 = G[91];
            n19 ^= G[92];
            long l23 = l12;
            int n20 = G[94];
            n20 += G[95];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 += G[93]))) ^ l23) & -1L >>> (n20 += G[96]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = G[97];
            n21 -= G[98];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 ^= G[99]);
            while (true) {
                int n22 = G[100];
                n22 += G[101];
                if ((int)(l14 >>> (n22 -= G[102])) >= (int)l12) break;
                int n23 = G[103];
                n23 -= G[104];
                int n24 = G[106];
                n24 -= G[107];
                cArray2[(int)(l14 >>> (n23 += Element.G[105]))] = cArray[(int)l13 + (int)(l14 >>> (n24 -= G[108]))];
                l14 += 0x100000000L;
            }
            int n25 = G[109];
            n25 ^= G[110];
            int n26 = (int)(l15 >>> (n25 ^= G[111]));
            l15 += 0x100000000L;
            Element.e[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = G[112];
            n27 += G[113];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 -= G[114]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[G[115]];
        String string = (String)object[G[116]];
        object = object[G[117]];
        Object[] objectArray = F;
        if (F == null) {
            objectArray = F = new Object[G[118]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[G[119]];
                E = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[G[121] ^ G[122]];
                byArray[Element.G[123] ^ Element.G[124]] = G[125] ^ G[126];
                byArray[Element.G[127] ^ Element.G[128]] = G[129] ^ G[130];
                byArray[Element.G[131] ^ Element.G[132]] = G[133] ^ G[134];
                byArray[Element.G[135] ^ Element.G[136]] = G[137] ^ G[138];
                byArray[Element.G[139] ^ Element.G[140]] = G[141] ^ G[142];
                byArray[Element.G[143] ^ Element.G[144]] = G[145] ^ G[146];
                byArray[Element.G[147] ^ Element.G[148]] = G[149] ^ G[150];
                byArray[Element.G[151] ^ Element.G[152]] = G[153] ^ G[154];
                byArray[Element.G[155] ^ Element.G[156]] = G[157] ^ G[158];
                byArray[Element.G[159] ^ Element.G[160]] = G[161] ^ G[162];
                byArray[Element.G[163] ^ Element.G[164]] = G[165] ^ G[166];
                byArray[Element.G[167] ^ Element.G[168]] = G[169] ^ G[170];
                byArray[Element.G[171] ^ Element.G[172]] = G[173] ^ G[174];
                byArray[Element.G[175] ^ Element.G[176]] = G[177] ^ G[178];
                byArray[Element.G[179] ^ Element.G[180]] = G[181] ^ G[182];
                byArray[Element.G[183] ^ Element.G[184]] = G[185] ^ G[186];
                objectArray2[Element.G[120]] = byArray;
            }
            byte[] byArray = (byte[])object3[G[187]];
            if (f == null) {
                byte[] byArray2 = new byte[G[188] ^ G[189]];
                byArray2[Element.G[190] ^ Element.G[191]] = G[192] ^ G[193];
                byArray2[Element.G[194] ^ Element.G[195]] = G[196] ^ G[197];
                byArray2[Element.G[198] ^ Element.G[199]] = G[200] ^ G[201];
                byArray2[Element.G[202] ^ Element.G[203]] = G[204] ^ G[205];
                byArray2[Element.G[206] ^ Element.G[207]] = G[208] ^ G[209];
                byArray2[Element.G[210] ^ Element.G[211]] = G[212] ^ G[213];
                byArray2[Element.G[214] ^ Element.G[215]] = G[216] ^ G[217];
                byArray2[Element.G[218] ^ Element.G[219]] = G[220] ^ G[221];
                byArray2[Element.G[222] ^ Element.G[223]] = G[224] ^ G[225];
                byArray2[Element.G[226] ^ Element.G[227]] = G[228] ^ G[229];
                byArray2[Element.G[230] ^ Element.G[231]] = G[232] ^ G[233];
                byArray2[Element.G[234] ^ Element.G[235]] = G[236] ^ G[237];
                byArray2[Element.G[238] ^ Element.G[239]] = G[240] ^ G[241];
                byArray2[Element.G[242] ^ Element.G[243]] = G[244] ^ G[245];
                byArray2[Element.G[246] ^ Element.G[247]] = G[248] ^ G[249];
                byArray2[Element.G[250] ^ Element.G[251]] = G[252] ^ G[253];
                byArray2[Element.G[254] ^ Element.G[255]] = G[256] ^ G[257];
                byArray2[Element.G[258] ^ Element.G[259]] = G[260] ^ G[261];
                byArray2[Element.G[262] ^ Element.G[263]] = G[264] ^ G[265];
                byArray2[Element.G[266] ^ Element.G[267]] = G[268] ^ G[269];
                byArray2[Element.G[270] ^ Element.G[271]] = G[272] ^ G[273];
                byArray2[Element.G[274] ^ Element.G[275]] = G[276] ^ G[277];
                byArray2[Element.G[278] ^ Element.G[279]] = G[280] ^ G[281];
                byArray2[Element.G[282] ^ Element.G[283]] = G[284] ^ G[285];
                byArray2[Element.G[286] ^ Element.G[287]] = G[288] ^ G[289];
                byArray2[Element.G[290] ^ Element.G[291]] = G[292] ^ G[293];
                byArray2[Element.G[294] ^ Element.G[295]] = G[296] ^ G[297];
                byArray2[Element.G[298] ^ Element.G[299]] = G[300] ^ G[301];
                byArray2[Element.G[302] ^ Element.G[303]] = G[304] ^ G[305];
                byArray2[Element.G[306] ^ Element.G[307]] = G[308] ^ G[309];
                byArray2[Element.G[310] ^ Element.G[311]] = G[312] ^ G[313];
                byArray2[Element.G[314] ^ Element.G[315]] = G[316] ^ G[317];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, G[318], byArray3, G[319], byArray.length);
                System.arraycopy(byArray2, G[320], byArray3, byArray.length, byArray2.length);
                Object object4 = Element.A()[G[321]];
                if (object4 == null) {
                    char[] cArray = "\ucff2\ucfe0\ucfe5\ucfde\ucfec\ucfd0\ucff9\ucf07\ucf0e\ucf0a\ucfea\ucf13\uceff\ucefd\ucfed\ucfea\ucfdf\ucfcf".toCharArray();
                    for (int i2 = G[322]; i2 < G[323]; ++i2) {
                        int n3 = cArray[i2];
                        n3 -= G[324];
                        n3 += G[325];
                        n3 ^= G[326];
                        n3 += G[327];
                        n3 += G[328];
                        n3 += G[329];
                        n3 -= G[330];
                        n3 -= G[331];
                        n3 += G[332];
                        n3 -= G[333];
                        n3 += G[334];
                        n3 -= G[335];
                        cArray[i2] = (char)(n3 -= G[336]);
                    }
                    object4 = Element.A()[Element.G[337]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[G[338]];
                byArray4[Element.G[339]] = G[340];
                byArray4[Element.G[341]] = G[342];
                byArray4[Element.G[343]] = G[344];
                byArray4[Element.G[345]] = G[346];
                byArray4[Element.G[347]] = G[348];
                byArray4[Element.G[349]] = G[350];
                byArray4[Element.G[351]] = G[352];
                byArray4[Element.G[353]] = G[354];
                byArray4[Element.G[355]] = G[356];
                byArray4[Element.G[357]] = G[358];
                byArray4[Element.G[359]] = G[360];
                byArray4[Element.G[361]] = G[362];
                byArray4[Element.G[363]] = G[364];
                byArray4[Element.G[365]] = G[366];
                byArray4[Element.G[367]] = G[368];
                byArray4[Element.G[369]] = G[370];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, G[371], G[372]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = Element.A()[G[373]];
                if (object5 == null) {
                    char[] cArray = "\udd8e\udd7a\udd88".toCharArray();
                    for (int i3 = G[374]; i3 < G[375]; ++i3) {
                        int n4 = cArray[i3];
                        n4 ^= G[376];
                        n4 ^= G[377];
                        n4 ^= G[378];
                        n4 += G[379];
                        n4 -= G[380];
                        n4 ^= G[381];
                        n4 ^= G[382];
                        n4 += G[383];
                        n4 ^= G[384];
                        n4 -= G[385];
                        n4 += G[386];
                        n4 ^= G[387];
                        n4 += G[388];
                        n4 += G[389];
                        cArray[i3] = (char)(n4 -= G[390]);
                    }
                    object5 = Element.A()[Element.G[391]] = new String(cArray);
                }
                f = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, G[392], G[393]);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, G[394], byArray6.length);
            Object object6 = Element.A()[G[395]];
            if (object6 == null) {
                char[] cArray = "\u2043\u204f\u2055\u20b9\u2045\u2044\u2045\u20b9\u2052\u207d\u2045\u2055\u207f\u2052\u2063\u206e\u206e\u20fb\u20f8\u20c1".toCharArray();
                for (int i4 = G[396]; i4 < G[397]; ++i4) {
                    int n5 = cArray[i4];
                    n5 += G[398];
                    n5 ^= G[399];
                    n5 -= 44452;
                    n5 ^= 0x94E9;
                    n5 += 2126;
                    n5 -= 58574;
                    n5 += 49135;
                    n5 += 61296;
                    n5 -= 8241;
                    n5 ^= 0x1A33;
                    n5 += 50868;
                    n5 ^= 0x9A75;
                    cArray[i4] = (char)(n5 += 10390);
                }
                object6 = Element.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)f), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = g;
        if (g == null) {
            g = new Object[4];
            objectArray = g;
        }
        return objectArray;
    }

    public static void b() {
        G = new int[0x3A99 ^ 0x3B09];
        Element.G[0xE070 ^ 0xE0AC] = 0xFFFFFD3F ^ 0xE0AC;
        Element.G[0xEA4C ^ 0xEB5B] = 0x70DF ^ 0xEB5B;
        Element.G[0x1D58 ^ 0x1D06] = 0x1D78 ^ 0x1D06;
        Element.G[0x9153 ^ 0x91D1] = 0x9601 ^ 0x91D1;
        Element.G[0x75E7 ^ 0x7462] = 0x785E ^ 0x7462;
        Element.G[0x957 ^ 0x84D] = 0xC0E5 ^ 0x84D;
        Element.G[0x9A8D ^ 0x9ABD] = 0x5DF1 ^ 0x9ABD;
        Element.G[0xE359 ^ 0xE367] = 0xFFFF1CC0 ^ 0xE367;
        Element.G[0xA732 ^ 0xA7A9] = 0xCD82 ^ 0xA7A9;
        Element.G[0xA7EA ^ 0xA6F5] = 0xBD26 ^ 0xA6F5;
        Element.G[0x7797 ^ 0x76CB] = 0x769C ^ 0x76CB;
        Element.G[0x50B9 ^ 0x51E6] = 0x51E8 ^ 0x51E6;
        Element.G[0x4E1E ^ 0x4ED7] = 0xB230 ^ 0x4ED7;
        Element.G[0x10B97 ^ 0x10BF1] = 0xFFFEF439 ^ 0x10BF1;
        Element.G[0x6DBF ^ 0x6D2C] = 0xF062 ^ 0x6D2C;
        Element.G[0x2CD6 ^ 0x2DAE] = 0xFFAE ^ 0x2DAE;
        Element.G[0xD634 ^ 0xD677] = 0xFFFF29D7 ^ 0xD677;
        Element.G[0xE7FD ^ 0xE71F] = 0x1E393 ^ 0xE71F;
        Element.G[0x3664 ^ 0x3604] = 0xFFFFC9E2 ^ 0x3604;
        Element.G[0xD6D4 ^ 0xD670] = 0xBE37 ^ 0xD670;
        Element.G[0x1A69 ^ 0x1AC8] = 0xCE9E ^ 0x1AC8;
        Element.G[0xCEB7 ^ 0xCE33] = 0x340C ^ 0xCE33;
        Element.G[0x1057F ^ 0x10413] = 0xFFFEFBAD ^ 0x10413;
        Element.G[0x8104 ^ 0x813F] = 0xFFFF7EF8 ^ 0x813F;
        Element.G[0x108A ^ 0x101C] = 0x8D5E ^ 0x101C;
        Element.G[0x77D1 ^ 0x7659] = 0x7659 ^ 0x7659;
        Element.G[0xDDB1 ^ 0xDDA2] = 0xFFFF2251 ^ 0xDDA2;
        Element.G[0xAEF7 ^ 0xAE54] = 0xC619 ^ 0xAE54;
        Element.G[0x5C3 ^ 0x5E8] = 0x584 ^ 0x5E8;
        Element.G[0xC949 ^ 0xC9C8] = 0xCE45 ^ 0xC9C8;
        Element.G[0x9529 ^ 0x9589] = 0x41BC ^ 0x9589;
        Element.G[0xDC0D ^ 0xDC71] = 0x3F33 ^ 0xDC71;
        Element.G[0xA92D ^ 0xA943] = 0xA962 ^ 0xA943;
        Element.G[0x676C ^ 0x676C] = 0xFFFF981D ^ 0x676C;
        Element.G[0x9124 ^ 0x9009] = 0x2A5F ^ 0x9009;
        Element.G[0x7726 ^ 0x7664] = 0x7664 ^ 0x7664;
        Element.G[0xADAA ^ 0xACB7] = 0x6415 ^ 0xACB7;
        Element.G[0xB142 ^ 0xB11A] = 0xB177 ^ 0xB11A;
        Element.G[0xDEB2 ^ 0xDE7C] = 0xA95B ^ 0xDE7C;
        Element.G[0x8B12 ^ 0x8B60] = 0x8B7B ^ 0x8B60;
        Element.G[0x9236 ^ 0x92FB] = 0x19495 ^ 0x92FB;
        Element.G[0xA90C ^ 0xA9F9] = 0x929D ^ 0xA9F9;
        Element.G[0x623D ^ 0x62C4] = 0x8F12 ^ 0x62C4;
        Element.G[0x3287 ^ 0x3279] = 0x228F ^ 0x3279;
        Element.G[0x22B1 ^ 0x23E6] = 0x23E6 ^ 0x23E6;
        Element.G[0x861B ^ 0x86B0] = 0x8BA8 ^ 0x86B0;
        Element.G[0x9678 ^ 0x96BF] = 0x6A58 ^ 0x96BF;
        Element.G[0x9C7B ^ 0x9C30] = 0x9C09 ^ 0x9C30;
        Element.G[0xF305 ^ 0xF220] = 0xE6BF ^ 0xF220;
        Element.G[0x7DF2 ^ 0x7C80] = 0xFFFF8312 ^ 0x7C80;
        Element.G[0xA724 ^ 0xA7B6] = 0x38BF ^ 0xA7B6;
        Element.G[0xA60D ^ 0xA618] = 0xA6B2 ^ 0xA618;
        Element.G[0x81CC ^ 0x813D] = 0x11DF ^ 0x813D;
        Element.G[0x8715 ^ 0x87EA] = 0x970B ^ 0x87EA;
        Element.G[0xFA9 ^ 0xE23] = 0xE33 ^ 0xE23;
        Element.G[0x4C97 ^ 0x4C02] = 0xFFFF2EDF ^ 0x4C02;
        Element.G[0x3158 ^ 0x31EF] = 0xA0F7 ^ 0x31EF;
        Element.G[0xCCBB ^ 0xCC5B] = 0x1C454 ^ 0xCC5B;
        Element.G[0x776D ^ 0x77E4] = 0x6715 ^ 0x77E4;
        Element.G[0xC67A ^ 0xC6AF] = 0xE10C ^ 0xC6AF;
        Element.G[0x1F1E ^ 0x1FC8] = 0x11B1D ^ 0x1FC8;
        Element.G[0xB413 ^ 0xB527] = 0xFFFF73AD ^ 0xB527;
        Element.G[0xF2C6 ^ 0xF393] = 0xF39B ^ 0xF393;
        Element.G[0x76EC ^ 0x77A5] = 0xD4C8 ^ 0x77A5;
        Element.G[0x946F ^ 0x941A] = 0x941A ^ 0x941A;
        Element.G[0x74C4 ^ 0x7483] = 0x7491 ^ 0x7483;
        Element.G[0x7F27 ^ 0x7E21] = 0xE26 ^ 0x7E21;
        Element.G[0xE6B7 ^ 0xE6A6] = 0xFFFF1951 ^ 0xE6A6;
        Element.G[0x6EB8 ^ 0x6FC1] = 0x5340 ^ 0x6FC1;
        Element.G[0x2EE ^ 0x2F6] = 0x24B ^ 0x2F6;
        Element.G[0xCAD1 ^ 0xCAFD] = 0xF9FA ^ 0xCAFD;
        Element.G[0x1399 ^ 0x1383] = 0x13DA ^ 0x1383;
        Element.G[0x10F7D ^ 0x10E35] = 0x1E718 ^ 0x10E35;
        Element.G[0x2AF5 ^ 0x2B90] = 0x2B9F ^ 0x2B90;
        Element.G[0xBB1C ^ 0xBB74] = 0xBB26 ^ 0xBB74;
        Element.G[0x5EB3 ^ 0x5FB8] = 0x9627 ^ 0x5FB8;
        Element.G[0x4AD2 ^ 0x4AFC] = 0x4037 ^ 0x4AFC;
        Element.G[0x9C31 ^ 0x9C99] = 0x234D ^ 0x9C99;
        Element.G[0x1A19 ^ 0x1A2B] = 0x7A1A ^ 0x1A2B;
        Element.G[0xBE8D ^ 0xBE4F] = 0x726B ^ 0xBE4F;
        Element.G[0x108A7 ^ 0x10981] = 0x1BA15 ^ 0x10981;
        Element.G[0xF354 ^ 0xF389] = 0x11B6 ^ 0xF389;
        Element.G[0x9862 ^ 0x987B] = 0x981B ^ 0x987B;
        Element.G[0x494B ^ 0x499C] = 0x14D52 ^ 0x499C;
        Element.G[0xB ^ 0xF] = 0x38 ^ 0xF;
        Element.G[0xC845 ^ 0xC92B] = 0xC92A ^ 0xC92B;
        Element.G[0x4272 ^ 0x4224] = 0xFFFFBDC1 ^ 0x4224;
        Element.G[0x10BAB ^ 0x10B93] = 0x19A0F ^ 0x10B93;
        Element.G[0x8A26 ^ 0x8A76] = 0xFFFF75BD ^ 0x8A76;
        Element.G[0x7E28 ^ 0x7F06] = 0x9E6F ^ 0x7F06;
        Element.G[0x6A75 ^ 0x6A29] = 0x6A03 ^ 0x6A29;
        Element.G[0xF796 ^ 0xF720] = 0xD967 ^ 0xF720;
        Element.G[0x1801 ^ 0x18CB] = 0x11EB3 ^ 0x18CB;
        Element.G[0x52A2 ^ 0x5204] = 0x3A43 ^ 0x5204;
        Element.G[0x7987 ^ 0x79A8] = 0xC143 ^ 0x79A8;
        Element.G[0xCC57 ^ 0xCD6F] = 0x475 ^ 0xCD6F;
        Element.G[0xAAA6 ^ 0xAB27] = 0x37F0 ^ 0xAB27;
        Element.G[0xDEFC ^ 0xDE55] = 0x61D0 ^ 0xDE55;
        Element.G[0xED27 ^ 0xED18] = 0xFFFF12F9 ^ 0xED18;
        Element.G[0xFBFF ^ 0xFBD8] = 0xFBD8 ^ 0xFBD8;
        Element.G[0x5E42 ^ 0x5E21] = 0x5E29 ^ 0x5E21;
        Element.G[0x8E21 ^ 0x8EB5] = 0x13F7 ^ 0x8EB5;
        Element.G[0x9D80 ^ 0x9DEA] = 0xFFFF6298 ^ 0x9DEA;
        Element.G[0xAA54 ^ 0xAB1A] = 0xD8C3 ^ 0xAB1A;
        Element.G[0x73B8 ^ 0x72B8] = 0x627D ^ 0x72B8;
        Element.G[0x28FE ^ 0x298D] = 0x298E ^ 0x298D;
        Element.G[0x62E9 ^ 0x629F] = 0x629E ^ 0x629F;
        Element.G[0x181D ^ 0x18B2] = 0xD59C ^ 0x18B2;
        Element.G[0x6767 ^ 0x67BE] = 0x16370 ^ 0x67BE;
        Element.G[0x216D ^ 0x201A] = 0x2019 ^ 0x201A;
        Element.G[0x5B04 ^ 0x5A71] = 0x5A73 ^ 0x5A71;
        Element.G[0x16E0 ^ 0x17B6] = 0x17DA ^ 0x17B6;
        Element.G[0xA89F ^ 0xA99D] = 0x83BA ^ 0xA99D;
        Element.G[0xBFB0 ^ 0xBFB9] = 0xFFFF4029 ^ 0xBFB9;
        Element.G[0x56AF ^ 0x5682] = 0x6D2B ^ 0x5682;
        Element.G[0x4B0E ^ 0x4BF6] = 0xFFFF598E ^ 0x4BF6;
        Element.G[0x10693 ^ 0x10661] = 0x13D1B ^ 0x10661;
        Element.G[0xF83A ^ 0xF82A] = 0xF848 ^ 0xF82A;
        Element.G[0x8DBE ^ 0x8CD8] = 0x8CAF ^ 0x8CD8;
        Element.G[0xCE4E ^ 0xCE86] = 0x3263 ^ 0xCE86;
        Element.G[0x84AF ^ 0x85B9] = 0x1E35 ^ 0x85B9;
        Element.G[0x9BDA ^ 0x9B9B] = 0x9BCF ^ 0x9B9B;
        Element.G[0x4CC0 ^ 0x4CDB] = 0xFFFFB3BF ^ 0x4CDB;
        Element.G[0xC6A ^ 0xCAB] = 0xB1CC ^ 0xCAB;
        Element.G[0x25C4 ^ 0x25D0] = 0x25AE ^ 0x25D0;
        Element.G[0x5194 ^ 0x5099] = 0x9906 ^ 0x5099;
        Element.G[0xDF26 ^ 0xDF3A] = 0xFFFF20B1 ^ 0xDF3A;
        Element.G[0x23C8 ^ 0x2357] = 0xF769 ^ 0x2357;
        Element.G[0xD4D9 ^ 0xD4D2] = 0xFFFF2B72 ^ 0xD4D2;
        Element.G[0x4E3C ^ 0x4F0C] = 0xFFFF51AB ^ 0x4F0C;
        Element.G[0x149A ^ 0x1451] = 0x1123F ^ 0x1451;
        Element.G[0x228B ^ 0x23E8] = 0x23E4 ^ 0x23E8;
        Element.G[0xFFFB ^ 0xFFAC] = 0xFFFF000F ^ 0xFFAC;
        Element.G[0xC326 ^ 0xC22F] = 0xB234 ^ 0xC22F;
        Element.G[0x5B ^ 0x120] = 0x8FE4 ^ 0x120;
        Element.G[0xE651 ^ 0xE61C] = 0xE629 ^ 0xE61C;
        Element.G[0x7D7D ^ 0x7CFE] = 0x75E7 ^ 0x7CFE;
        Element.G[0x6FAD ^ 0x6E9A] = 0xA7EF ^ 0x6E9A;
        Element.G[0xDB43 ^ 0xDA04] = 0x3AC8 ^ 0xDA04;
        Element.G[0xAD3E ^ 0xAC27] = 0x37A3 ^ 0xAC27;
        Element.G[0x793C ^ 0x790B] = 0xE010 ^ 0x790B;
        Element.G[0x62F5 ^ 0x6252] = 0xDD81 ^ 0x6252;
        Element.G[0xCE91 ^ 0xCFB5] = 0xDB7D ^ 0xCFB5;
        Element.G[0xDFF8 ^ 0xDF0C] = 0xE415 ^ 0xDF0C;
        Element.G[0x1030C ^ 0x103D8] = 0x1243F ^ 0x103D8;
        Element.G[0xA930 ^ 0xA854] = 0xFFFF5789 ^ 0xA854;
        Element.G[0x96FB ^ 0x97C8] = 0xAEA3 ^ 0x97C8;
        Element.G[0x2CFA ^ 0x2DA0] = 0x2DBB ^ 0x2DA0;
        Element.G[0x788 ^ 0x696] = 0x1D55 ^ 0x696;
        Element.G[0x3806 ^ 0x3940] = 0x8BC6 ^ 0x3940;
        Element.G[0x5A77 ^ 0x5B1C] = 0x5B1B ^ 0x5B1C;
        Element.G[0xA69F ^ 0xA7CF] = 0x85B1 ^ 0xA7CF;
        Element.G[0x6F63 ^ 0x6FDD] = 0xD2AF ^ 0x6FDD;
        Element.G[0xD638 ^ 0xD6DC] = 0x1D264 ^ 0xD6DC;
        Element.G[0x9D88 ^ 0x9CA7] = 0x7DD7 ^ 0x9CA7;
        Element.G[0x7C98 ^ 0x7DC1] = 0x7DCC ^ 0x7DC1;
        Element.G[0x10343 ^ 0x103EE] = 0xFFFEF106 ^ 0x103EE;
        Element.G[0x2384 ^ 0x23B7] = 0x88C3 ^ 0x23B7;
        Element.G[0x47A2 ^ 0x4729] = 0xFB43 ^ 0x4729;
        Element.G[0x10E48 ^ 0x10ECF] = 0x11E1B ^ 0x10ECF;
        Element.G[0x17D6 ^ 0x172C] = 0x379 ^ 0x172C;
        Element.G[0x2D18 ^ 0x2C33] = 0x9665 ^ 0x2C33;
        Element.G[0xD597 ^ 0xD499] = 0xD009 ^ 0xD499;
        Element.G[0xA484 ^ 0xA4AE] = 0xA4AE ^ 0xA4AE;
        Element.G[0xE952 ^ 0xE872] = 0xF3D0 ^ 0xE872;
        Element.G[0x10F00 ^ 0x10F16] = 0x10F46 ^ 0x10F16;
        Element.G[0xD864 ^ 0xD81A] = 0x3B58 ^ 0xD81A;
        Element.G[0xF5A7 ^ 0xF4EB] = 0x613 ^ 0xF4EB;
        Element.G[0x951B ^ 0x9593] = 0x8544 ^ 0x9593;
        Element.G[0x8FF9 ^ 0x8E77] = 0x33B5 ^ 0x8E77;
        Element.G[0x7529 ^ 0x757A] = 0xFFFF8AC0 ^ 0x757A;
        Element.G[0xA0DB ^ 0xA0E6] = 0xA080 ^ 0xA0E6;
        Element.G[0x25F5 ^ 0x25BC] = 0xFFFFDA18 ^ 0x25BC;
        Element.G[0x2E5E ^ 0x2E18] = 0xFFFFD1EB ^ 0x2E18;
        Element.G[0x10AEB ^ 0x10A7B] = 0x19572 ^ 0x10A7B;
        Element.G[0x3766 ^ 0x3704] = 0x3737 ^ 0x3704;
        Element.G[0x458F ^ 0x45A7] = 0x45A5 ^ 0x45A7;
        Element.G[0x1C88 ^ 0x1C63] = 0x82 ^ 0x1C63;
        Element.G[0x2CB2 ^ 0x2DB3] = 0x3D52 ^ 0x2DB3;
        Element.G[0x98E0 ^ 0x99BD] = 0x99B9 ^ 0x99BD;
        Element.G[0xA4DB ^ 0xA467] = 0xA6B2 ^ 0xA467;
        Element.G[0x78C7 ^ 0x79EB] = 0xFFFF3C37 ^ 0x79EB;
        Element.G[0xCFBD ^ 0xCF17] = 0x70C3 ^ 0xCF17;
        Element.G[0x3BA9 ^ 0x3B41] = 0xFFFF3D43 ^ 0x3B41;
        Element.G[0xF73F ^ 0xF67A] = 0x377E ^ 0xF67A;
        Element.G[0xD5CD ^ 0xD49F] = 0xD48F ^ 0xD49F;
        Element.G[0xA35A ^ 0xA39C] = 0x5F64 ^ 0xA39C;
        Element.G[0xEA1B ^ 0xEAC5] = 0x1E2B4 ^ 0xEAC5;
        Element.G[0xEED4 ^ 0xEE76] = 0x3A43 ^ 0xEE76;
        Element.G[0xF4D ^ 0xF0F] = 0xF57 ^ 0xF0F;
        Element.G[0x7D6E ^ 0x7D5A] = 0x3D0F ^ 0x7D5A;
        Element.G[0xFB4E ^ 0xFB41] = 0xFB2D ^ 0xFB41;
        Element.G[0xD0F6 ^ 0xD1F9] = 0xD56D ^ 0xD1F9;
        Element.G[0x4CE3 ^ 0x4C6F] = 0xF00C ^ 0x4C6F;
        Element.G[0x67FC ^ 0x67E2] = 0xFFFF980E ^ 0x67E2;
        Element.G[0x3248 ^ 0x3374] = 0xFC4C ^ 0x3374;
        Element.G[0xE07E ^ 0xE0FE] = 0xE72E ^ 0xE0FE;
        Element.G[0x786 ^ 0x781] = 0x7D0 ^ 0x781;
        Element.G[0x1379 ^ 0x1268] = 0x16FC ^ 0x1268;
        Element.G[0x19B1 ^ 0x19B0] = 0xFFFFE61E ^ 0x19B0;
        Element.G[0xA348 ^ 0xA3C2] = 0xB315 ^ 0xA3C2;
        Element.G[0x71DD ^ 0x7164] = 0xE041 ^ 0x7164;
        Element.G[0x14A5 ^ 0x14F0] = 0xFFFFEB68 ^ 0x14F0;
        Element.G[0xE515 ^ 0xE5F3] = 0x1C2B ^ 0xE5F3;
        Element.G[0x1EE ^ 0x174] = 0x4045 ^ 0x174;
        Element.G[0x8B47 ^ 0x8BFD] = 0x1AE3 ^ 0x8BFD;
        Element.G[0x7E6 ^ 0x7FB] = 0xFFFFF82E ^ 0x7FB;
        Element.G[0xBD0F ^ 0xBD72] = 0x5E60 ^ 0xBD72;
        Element.G[0x71F8 ^ 0x708C] = 0x718C ^ 0x708C;
        Element.G[0xE7ED ^ 0xE7B4] = 0xE7D5 ^ 0xE7B4;
        Element.G[0x9D79 ^ 0x9D5A] = 0x9D2F ^ 0x9D5A;
        Element.G[0xCB7A ^ 0xCAFC] = 0xB3E1 ^ 0xCAFC;
        Element.G[0xB3AE ^ 0xB3A8] = 0xB3D2 ^ 0xB3A8;
        Element.G[0x9978 ^ 0x9932] = 0x9947 ^ 0x9932;
        Element.G[0x675E ^ 0x672E] = 0x67B3 ^ 0x672E;
        Element.G[0x1A2D ^ 0x1B38] = 0x49C4 ^ 0x1B38;
        Element.G[0xE029 ^ 0xE125] = 0x28AF ^ 0xE125;
        Element.G[0xF3C2 ^ 0xF37F] = 0xF18A ^ 0xF37F;
        Element.G[0xB82B ^ 0xB89A] = 0x75D4 ^ 0xB89A;
        Element.G[0xEC69 ^ 0xED52] = 0x2277 ^ 0xED52;
        Element.G[0x4802 ^ 0x4871] = 0x4870 ^ 0x4871;
        Element.G[0x232D ^ 0x2242] = 0x2248 ^ 0x2242;
        Element.G[0x9BB6 ^ 0x9B7A] = 0x19D6D ^ 0x9B7A;
        Element.G[0xBCE3 ^ 0xBDF3] = 0xB918 ^ 0xBDF3;
        Element.G[0x47C2 ^ 0x46A5] = 0x46A6 ^ 0x46A5;
        Element.G[0x8D49 ^ 0x8D99] = 0xFFFF055E ^ 0x8D99;
        Element.G[0xD59F ^ 0xD4CE] = 0xD4CF ^ 0xD4CE;
        Element.G[0xC5E7 ^ 0xC4D1] = 0xDA3 ^ 0xC4D1;
        Element.G[0xDFD9 ^ 0xDF2E] = 0x32F8 ^ 0xDF2E;
        Element.G[0x8BF6 ^ 0x8AE4] = 0xD81E ^ 0x8AE4;
        Element.G[0xBAAE ^ 0xBA74] = 0x5853 ^ 0xBA74;
        Element.G[0x683A ^ 0x6907] = 0xA622 ^ 0x6907;
        Element.G[0xC7D1 ^ 0xC69B] = 0xE3AF ^ 0xC69B;
        Element.G[0x439B ^ 0x42CF] = 0xFFFFBD15 ^ 0x42CF;
        Element.G[0xE557 ^ 0xE443] = 0xB68C ^ 0xE443;
        Element.G[0x19A4 ^ 0x19A6] = 0xFFFFE661 ^ 0x19A6;
        Element.G[0x3A30 ^ 0x3A7F] = 0xFFFFC5B3 ^ 0x3A7F;
        Element.G[0xD5EE ^ 0xD5BA] = 0xFFFF2A1B ^ 0xD5BA;
        Element.G[0xDAD4 ^ 0xDA6F] = 0xDA6F ^ 0xDA6F;
        Element.G[0x6210 ^ 0x62E0] = 0xF220 ^ 0x62E0;
        Element.G[0x1358 ^ 0x1228] = 0x121E ^ 0x1228;
        Element.G[0xD248 ^ 0xD309] = 0xD308 ^ 0xD309;
        Element.G[0x2B7E ^ 0x2B13] = 0x2B39 ^ 0x2B13;
        Element.G[0xA7DA ^ 0xA657] = 0xA643 ^ 0xA657;
        Element.G[0x4DFE ^ 0x4C9F] = 0x4C9D ^ 0x4C9F;
        Element.G[0x10878 ^ 0x108F5] = 0x1B4B0 ^ 0x108F5;
        Element.G[0xBA96 ^ 0xBAFF] = 0xBAD1 ^ 0xBAFF;
        Element.G[0xD176 ^ 0xD1C4] = 0x1CEF ^ 0xD1C4;
        Element.G[0x2D82 ^ 0x2DDD] = 0xFFFFD261 ^ 0x2DDD;
        Element.G[0xE814 ^ 0xE86B] = 0xEFB6 ^ 0xE86B;
        Element.G[0xAFCF ^ 0xAF41] = 0x1322 ^ 0xAF41;
        Element.G[0x106E8 ^ 0x1061E] = 0x1EBD2 ^ 0x1061E;
        Element.G[0x2537 ^ 0x2558] = 0x2573 ^ 0x2558;
        Element.G[0xA00D ^ 0xA069] = 0xA025 ^ 0xA069;
        Element.G[0xA271 ^ 0xA2C9] = 0x33D7 ^ 0xA2C9;
        Element.G[0x10243 ^ 0x102A2] = 0xADD ^ 0x102A2;
        Element.G[0x7425 ^ 0x74CA] = 0xE428 ^ 0x74CA;
        Element.G[0xA71 ^ 0xA47] = 0x73BD ^ 0xA47;
        Element.G[0xDBF9 ^ 0xDAB2] = 0x2024 ^ 0xDAB2;
        Element.G[0xE9D1 ^ 0xE914] = 0x253B ^ 0xE914;
        Element.G[0x59A6 ^ 0x594F] = 0xA08A ^ 0x594F;
        Element.G[0xA291 ^ 0xA2D1] = 0xA21D ^ 0xA2D1;
        Element.G[0x40D1 ^ 0x40BA] = 0xFFFFBF7B ^ 0x40BA;
        Element.G[0x9499 ^ 0x9408] = 0xB07 ^ 0x9408;
        Element.G[0x613C ^ 0x6144] = 0x6144 ^ 0x6144;
        Element.G[0x3C50 ^ 0x3C5C] = 0x3C67 ^ 0x3C5C;
        Element.G[0x605 ^ 0x672] = 0x673 ^ 0x672;
        Element.G[0xC681 ^ 0xC705] = 0xBBBF ^ 0xC705;
        Element.G[0x6069 ^ 0x616E] = 0x1175 ^ 0x616E;
        Element.G[0xCC35 ^ 0xCCCE] = 0xD89E ^ 0xCCCE;
        Element.G[0xA4F5 ^ 0xA4A8] = 0xFFFF5B3C ^ 0xA4A8;
        Element.G[0x36EC ^ 0x36C9] = 0x36C9 ^ 0x36C9;
        Element.G[0x61AB ^ 0x60B7] = 0xFFFF57FB ^ 0x60B7;
        Element.G[0xC57 ^ 0xD26] = 0xD27 ^ 0xD26;
        Element.G[0xC3D3 ^ 0xC320] = 0xF844 ^ 0xC320;
        Element.G[0xD3E9 ^ 0xD3D5] = 0xD3C8 ^ 0xD3D5;
        Element.G[0xBD75 ^ 0xBCF2] = 0xBCF0 ^ 0xBCF2;
        Element.G[0x7239 ^ 0x7367] = 0xFFFF8CC0 ^ 0x7367;
        Element.G[0x2172 ^ 0x2160] = 0xFFFFDE12 ^ 0x2160;
        Element.G[0x9C3A ^ 0x9C6B] = 0x9C72 ^ 0x9C6B;
        Element.G[0xBD89 ^ 0xBD11] = 0xFC20 ^ 0xBD11;
        Element.G[0xC4A ^ 0xC49] = 0xFFFFF3AE ^ 0xC49;
        Element.G[0x41FA ^ 0x41DB] = 0x41A3 ^ 0x41DB;
        Element.G[0x10AEB ^ 0x10AB1] = 0x10AB5 ^ 0x10AB1;
        Element.G[0x6750 ^ 0x6724] = 0x6726 ^ 0x6724;
        Element.G[0x1CA1 ^ 0x1C3C] = 0xFFFF89EF ^ 0x1C3C;
        Element.G[0x4076 ^ 0x4095] = 0x1440B ^ 0x4095;
        Element.G[0xF3A3 ^ 0xF3D8] = 0x1092 ^ 0xF3D8;
        Element.G[0xD340 ^ 0xD228] = 0xFFFF2D8A ^ 0xD228;
        Element.G[0xC93B ^ 0xC9F4] = 0xBEC2 ^ 0xC9F4;
        Element.G[0xCE6F ^ 0xCECA] = 0xA684 ^ 0xCECA;
        Element.G[0x3D8D ^ 0x3D60] = 0x2181 ^ 0x3D60;
        Element.G[0x64C1 ^ 0x64CF] = 0xFFFF9B1B ^ 0x64CF;
        Element.G[0xDB0E ^ 0xDB4A] = 0xDB2D ^ 0xDB4A;
        Element.G[0xD21F ^ 0xD325] = 0x1C03 ^ 0xD325;
        Element.G[0x6244 ^ 0x62A3] = 0x9B66 ^ 0x62A3;
        Element.G[0x36B7 ^ 0x37CD] = 0xAD4C ^ 0x37CD;
        Element.G[0xDE03 ^ 0xDF6E] = 0xDF6B ^ 0xDF6E;
        Element.G[0x63B ^ 0x64A] = 0xFFFFF9D4 ^ 0x64A;
        Element.G[0x36C0 ^ 0x37C8] = 0x4783 ^ 0x37C8;
        Element.G[0xD652 ^ 0xD72F] = 0x96C0 ^ 0xD72F;
        Element.G[0xCC18 ^ 0xCD98] = 0x3DAC ^ 0xCD98;
        Element.G[0xDDC0 ^ 0xDCA9] = 0xDCA0 ^ 0xDCA9;
        Element.G[0x704B ^ 0x70AE] = 0x17430 ^ 0x70AE;
        Element.G[0x2E73 ^ 0x2EDF] = 0x23C8 ^ 0x2EDF;
        Element.G[0x74AE ^ 0x7475] = 0x964A ^ 0x7475;
        Element.G[0x109DB ^ 0x108E2] = 0x1C197 ^ 0x108E2;
        Element.G[0xE46A ^ 0xE47D] = 0xE42B ^ 0xE47D;
        Element.G[0xE908 ^ 0xE92A] = 0xFFFF16F7 ^ 0xE92A;
        Element.G[0xEB9F ^ 0xEAA0] = 0xEAA0 ^ 0xEAA0;
        Element.G[0x10F02 ^ 0x10E68] = 0x10E38 ^ 0x10E68;
        Element.G[0x84C7 ^ 0x84E7] = 0x84CD ^ 0x84E7;
        Element.G[0x40CC ^ 0x41AC] = 0x41F0 ^ 0x41AC;
        Element.G[0x92E8 ^ 0x9284] = 0xFFFF6D15 ^ 0x9284;
        Element.G[0xC34F ^ 0xC3A5] = 0xDF45 ^ 0xC3A5;
        Element.G[0x256E ^ 0x2444] = 0x9E1E ^ 0x2444;
        Element.G[0x9795 ^ 0x97AC] = 0x97AC ^ 0x97AC;
        Element.G[0xB4A8 ^ 0xB43F] = 0xF50F ^ 0xB43F;
        Element.G[0xEABA ^ 0xEB9D] = 0x5804 ^ 0xEB9D;
        Element.G[0xF5C1 ^ 0xF5A4] = 0xFFFF0A38 ^ 0xF5A4;
        Element.G[0x25AC ^ 0x24F4] = 0x24A2 ^ 0x24F4;
        Element.G[0x10D23 ^ 0x10D66] = 0x10D5C ^ 0x10D66;
        Element.G[0x104CC ^ 0x10422] = 0x194D4 ^ 0x10422;
        Element.G[0xCD1B ^ 0xCC97] = 0xCC97 ^ 0xCC97;
        Element.G[0x822C ^ 0x82FE] = 0xA55D ^ 0x82FE;
        Element.G[0xAA8F ^ 0xAA4F] = 0x1712 ^ 0xAA4F;
        Element.G[0xB19B ^ 0xB0DB] = 0xB0DB ^ 0xB0DB;
        Element.G[0x10D57 ^ 0x10DD8] = 0x192DF ^ 0x10DD8;
        Element.G[0x50BD ^ 0x519E] = 0x4501 ^ 0x519E;
        Element.G[0xA414 ^ 0xA4D7] = 0x68F8 ^ 0xA4D7;
        Element.G[0x6556 ^ 0x640D] = 0x6406 ^ 0x640D;
        Element.G[0x5A07 ^ 0x5B1F] = 0xFFFF3F78 ^ 0x5B1F;
        Element.G[0xEB33 ^ 0xEA7C] = 0x106 ^ 0xEA7C;
        Element.G[0xFEC8 ^ 0xFFB6] = 0x21D9 ^ 0xFFB6;
        Element.G[0x5BFA ^ 0x5B22] = 0xFFFEA046 ^ 0x5B22;
        Element.G[0xC414 ^ 0xC497] = 0x3EA8 ^ 0xC497;
        Element.G[0x79DE ^ 0x7922] = 0xFFFF92BF ^ 0x7922;
        Element.G[0xACDA ^ 0xAC65] = 0x1102 ^ 0xAC65;
        Element.G[0xDC74 ^ 0xDD37] = 0xDD25 ^ 0xDD37;
        Element.G[0xF83F ^ 0xF9B4] = 0xF9B7 ^ 0xF9B4;
        Element.G[0xFA5A ^ 0xFAA7] = 0xEEF7 ^ 0xFAA7;
        Element.G[0x14B8 ^ 0x1489] = 0x4945 ^ 0x1489;
        Element.G[0x4C35 ^ 0x4DBA] = 0xBF99 ^ 0x4DBA;
        Element.G[0x4E5A ^ 0x4F73] = 0xFCEA ^ 0x4F73;
        Element.G[0xC28 ^ 0xC60] = 0xC45 ^ 0xC60;
        Element.G[0xB5ED ^ 0xB4D8] = 0x8DB3 ^ 0xB4D8;
        Element.G[0x19AA ^ 0x19CB] = 0x1990 ^ 0x19CB;
        Element.G[0x2786 ^ 0x2783] = 0xFFFFD853 ^ 0x2783;
        Element.G[0xA0D6 ^ 0xA053] = 0x5A65 ^ 0xA053;
        Element.G[0x6BDA ^ 0x6AAC] = 0x6AAC ^ 0x6AAC;
        Element.G[0xB817 ^ 0xB8FB] = 0xFFFF5BAC ^ 0xB8FB;
        Element.G[0x85B5 ^ 0x84B0] = 0xAE95 ^ 0x84B0;
        Element.G[0xB351 ^ 0xB3FF] = 0xBEE8 ^ 0xB3FF;
        Element.G[0x3C36 ^ 0x3CE9] = 0x13496 ^ 0x3CE9;
        Element.G[0xDFE1 ^ 0xDF55] = 0xF112 ^ 0xDF55;
        Element.G[0x1BB0 ^ 0x1AE3] = 0x1AE5 ^ 0x1AE3;
        Element.G[0x9E37 ^ 0x9F16] = 0x84C5 ^ 0x9F16;
        Element.G[0x2731 ^ 0x2739] = 0x2713 ^ 0x2739;
        Element.G[0x5FB7 ^ 0x5FD0] = 0x5F94 ^ 0x5FD0;
        Element.G[0x77 ^ 0xE9] = 0x6AC6 ^ 0xE9;
        Element.G[0x6CDE ^ 0x6CA4] = 0x8004 ^ 0x6CA4;
        Element.G[0xEDEA ^ 0xEC96] = 0xB671 ^ 0xEC96;
        Element.G[0x132A ^ 0x1214] = 0x1214 ^ 0x1214;
        Element.G[0x46B5 ^ 0x4664] = 0x3152 ^ 0x4664;
        Element.G[0xA475 ^ 0xA478] = 0xFFFF5BE3 ^ 0xA478;
        Element.G[0x9E05 ^ 0x9E7C] = 0x72CC ^ 0x9E7C;
        Element.G[0x6B69 ^ 0x6B27] = 0xFFFF94BE ^ 0x6B27;
        Element.G[0xA137 ^ 0xA102] = 0xA4BB ^ 0xA102;
        Element.G[0x79C2 ^ 0x78D1] = 0x2A2D ^ 0x78D1;
        Element.G[0x2502 ^ 0x2433] = 0xC543 ^ 0x2433;
        Element.G[0x10883 ^ 0x109CE] = 0x13556 ^ 0x109CE;
        Element.G[0xB9E7 ^ 0xB86E] = 0xB87E ^ 0xB86E;
        Element.G[0xFB15 ^ 0xFB1F] = 0xFB2A ^ 0xFB1F;
        Element.G[0x87D3 ^ 0x879F] = 0xFFFF7852 ^ 0x879F;
        Element.G[0xE66C ^ 0xE648] = 0xE64B ^ 0xE648;
        Element.G[0xA3CE ^ 0xA30A] = 0x6F4F ^ 0xA30A;
        Element.G[0x3BE2 ^ 0x3AA6] = 0x56A7 ^ 0x3AA6;
        Element.G[0xE992 ^ 0xE922] = 0x2409 ^ 0xE922;
        Element.G[0x9EB5 ^ 0x9EEE] = 0x9E48 ^ 0x9EEE;
        Element.G[0x4F95 ^ 0x4F09] = 0x2526 ^ 0x4F09;
        Element.G[0x8717 ^ 0x87A4] = 0xA9E1 ^ 0x87A4;
        Element.G[0xD86 ^ 0xC9D] = 0xC43F ^ 0xC9D;
        Element.G[0xC9B1 ^ 0xC9AE] = 0xC9EE ^ 0xC9AE;
        Element.G[0xB741 ^ 0xB645] = 0x9C76 ^ 0xB645;
        Element.G[0x44CA ^ 0x45E8] = 0x517E ^ 0x45E8;
        Element.G[0x25DB ^ 0x2589] = 0x25B2 ^ 0x2589;
        Element.G[0x8482 ^ 0x85E0] = 0xFFFF7A3E ^ 0x85E0;
        Element.G[0xBED2 ^ 0xBFAD] = 0xB5DD ^ 0xBFAD;
        Element.G[0x9A31 ^ 0x9BB3] = 0x436A ^ 0x9BB3;
        Element.G[0x6048 ^ 0x617A] = 0x5802 ^ 0x617A;
        Element.G[0xD59C ^ 0xD4B4] = 0xFFFF98C4 ^ 0xD4B4;
        Element.G[0xF90B ^ 0xF808] = 0xD22D ^ 0xF808;
        Element.G[0xF472 ^ 0xF45B] = 0xF45B ^ 0xF45B;
        Element.G[0xE88E ^ 0xE817] = 0xFFFF56B5 ^ 0xE817;
        Element.G[0xD67B ^ 0xD65D] = 0xD65C ^ 0xD65D;
        Element.G[0xFA9B ^ 0xFAA1] = 0xFFFF056B ^ 0xFAA1;
        Element.G[0xE2C6 ^ 0xE240] = 0x187F ^ 0xE240;
        Element.G[0x8B1A ^ 0x8BC9] = 0xAC6A ^ 0x8BC9;
        Element.G[0xAF1B ^ 0xAFAE] = 0xFFFF7E17 ^ 0xAFAE;
        Element.G[0xF985 ^ 0xF88F] = 0x311F ^ 0xF88F;
    }
}

