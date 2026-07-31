/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.A;
import kotakbaz.rain.client.util.animations.b;
import kotakbaz.rain.module.setting.B;
import kotakbaz.rain.module.setting.settings.c;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from kotakbaz.rain.client.a
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004\u00a2\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0011\u0010\u0006J\r\u0010\u0012\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0012\u0010\u0006J\r\u0010\u0013\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0013\u0010\u0006J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0014\u0010\u000bJ\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0015\u0010\u000eJ\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0016\u0010\u000eJ\r\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\f\u00a2\u0006\u0004\b\u001a\u0010\u0003R\u001a\u0010\u001c\u001a\u00020\u001b8\u0006X\u0086D\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b(\u0010)R!\u0010,\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030+0*8\u0006\u00a2\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\u00a8\u00060"}, d2={"Lkotakbaz/rain/client/ClickGuiSettings;", "", "<init>", "()V", "", "scale", "()F", "scalePercent", "scaleProgress", "progress", "scalePercentForProgress", "(F)F", "", "setScaleProgress", "(F)V", "value", "setScalePercent", "hudScale", "hudScalePercent", "hudScaleProgress", "hudScalePercentForProgress", "setHudScaleProgress", "setHudScalePercent", "", "renderGuiBackground", "()Z", "toggleGuiBackground", "", "openKey", "I", "getOpenKey", "()I", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "scaleSetting", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "hudScaleSetting", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "guiBackgroundSetting", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "Lkotakbaz/rain/client/util/animations/AnimationUtil;", "scaleAnimation", "Lkotakbaz/rain/client/util/animations/AnimationUtil;", "", "Lkotakbaz/rain/module/setting/Setting;", "settings", "Ljava/util/List;", "getSettings", "()Ljava/util/List;", "rain-visuals"})
public final class a_0 {
    @NotNull
    public static final a_0 INSTANCE;
    private static final int a;
    @NotNull
    private static final kotakbaz.rain.module.setting.settings.a_0 A;
    @NotNull
    private static final kotakbaz.rain.module.setting.settings.a_0 b;
    @NotNull
    private static final c B;
    @NotNull
    private static final b c;
    @NotNull
    private static final List<B<?>> C;
    private static Object[] d;
    private static Object e;
    private static Object[] E;
    private static Object[] D;
    private static Object[] f;
    public static int[] F;

    private a_0() {
        super();
    }

    public final int getOpenKey() {
        return a;
    }

    @NotNull
    public final List<B<?>> getSettings() {
        return C;
    }

    public final float scale() {
        float f2 = ((Number)A.getValue()).floatValue() / 100.0f;
        return c.animate(f2, 150.0f, new A(kotakbaz.rain.client.util.animations.A.INSTANCE));
    }

    public final float scalePercent() {
        return ((Number)A.getValue()).floatValue();
    }

    public final float scaleProgress() {
        return A.progress();
    }

    public final float scalePercentForProgress(float f2) {
        float f3 = RangesKt.coerceIn(f2, 0.0f, 1.0f);
        return A.getMin() + (A.getMax() - A.getMin()) * f3;
    }

    public final void setScaleProgress(float f2) {
        this.setScalePercent(this.scalePercentForProgress(f2));
    }

    public final void setScalePercent(float f2) {
        A.setClamped(f2);
    }

    public final float hudScale() {
        return ((Number)b.getValue()).floatValue() / 100.0f;
    }

    public final float hudScalePercent() {
        return ((Number)b.getValue()).floatValue();
    }

    public final float hudScaleProgress() {
        return b.progress();
    }

    public final float hudScalePercentForProgress(float f2) {
        float f3 = RangesKt.coerceIn(f2, 0.0f, 1.0f);
        return b.getMin() + (b.getMax() - b.getMin()) * f3;
    }

    public final void setHudScaleProgress(float f2) {
        this.setHudScalePercent(this.hudScalePercentForProgress(f2));
    }

    public final void setHudScalePercent(float f2) {
        b.setClamped(f2);
    }

    public final boolean renderGuiBackground() {
        return (Boolean)B.getValue();
    }

    public final void toggleGuiBackground() {
        B.toggle();
    }

    static {
        a_0.b();
        long l = 2183955289549154986L;
        long l2 = -4305976263019585924L;
        long l3 = 7589040472486778082L;
        long l4 = -8065381097231305239L;
        long l5 = -469328086432599926L;
        long l6 = -5964332004523956887L;
        long l7 = 6321615829852759287L;
        long l8 = -292590077412020896L;
        long l9 = 2932228624130931759L;
        long l10 = -3524111931788697454L;
        long l11 = 1295161084317226651L;
        long l12 = -3572416716875996935L;
        long l13 = -741150903919663622L;
        long l14 = 8096627684735784408L;
        int n = F[0];
        n += F[1];
        d = new Object[n -= F[2]];
        long l15 = l14;
        int n2 = F[3];
        n2 ^= F[4];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 ^= F[5]);
        Object[] objectArray = new Object[F[6]];
        objectArray[a_0.F[7]] = D;
        objectArray[a_0.F[8]] = F[9];
        int n3 = F[10];
        Object object = a_0.A()[F[11]];
        if (object == null) {
            char[] cArray = "\uc42f\uc40b\uc442\uc42c\uc417\uc1f7\uc43a\uc430\uc3fd\uc40f\uc403\uc403\uc41e\uc42c\uc405\uc438\uc42b\uc1e5\uc41f\uc408\uc40f\uc448\uc40c\uc1f5\uc410\uc42b\uc1f6\uc421\uc422\uc408\uc1f4\uc1f5\uc43c\uc40e\uc41c\uc42d\uc420\uc422\uc40d\uc1f5\uc1f9\uc413\uc1f9\uc413\uc42a\uc41c\uc41c\uc3fd\uc1e5\uc40c\uc43e\uc436\uc1f5\uc448\uc418\uc442\uc421\uc40c\uc420\uc42f\uc414\uc431\uc43a\uc1f0\uc422\uc428\uc44a\uc41c\uc430\uc1f7\uc402\uc418\uc43c\uc417\uc420\uc44b\uc1f4\uc423\uc1f9\uc415\uc3fe\uc419\uc43a\uc448\uc42f\uc414\uc43d\uc414\uc40e\uc1f9\uc441\uc42b\uc415\uc1f3\uc401\uc405\uc415\uc436\uc430\uc42f\uc3ff\uc3fc\uc41a\uc40d\uc1f7\uc43f\uc420\uc424".toCharArray();
            for (int i = F[12]; i < F[13]; ++i) {
                int n4 = cArray[i];
                n4 -= F[14];
                n4 += F[15];
                n4 -= F[16];
                n4 += F[17];
                n4 ^= F[18];
                n4 += F[19];
                n4 -= F[20];
                n4 -= F[21];
                n4 += F[22];
                n4 -= F[23];
                n4 -= F[24];
                n4 ^= F[25];
                n4 -= F[26];
                cArray[i] = (char)(n4 -= F[27]);
            }
            object = a_0.A()[a_0.F[28]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)a_0.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = F[29];
        n5 -= F[30];
        l5 = l16 ^ (0x2200000000L ^ l16) & -1L << (n5 -= F[31]);
        long l17 = l12;
        int n6 = F[32];
        n6 -= F[33];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 ^= F[34]);
        while (true) {
            int n7 = F[35];
            n7 ^= F[36];
            if ((int)l12 >= (int)(l5 >>> (n7 ^= F[37]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = F[38];
            n9 += F[39];
            int n10 = F[41];
            n10 -= F[42];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 += F[40])) & -1L >>> (n10 += F[43]);
            long l19 = l8;
            int n11 = F[44];
            n11 ^= F[45];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 += F[46]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = F[47];
            n13 -= F[48];
            int n14 = F[50];
            n14 -= F[51];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 ^= F[49])) & -1L >>> (n14 ^= F[52]);
            int n15 = F[53];
            n15 += F[54];
            long l21 = l9;
            int n16 = F[56];
            n16 += F[57];
            l9 = l21 ^ ((long)cArray[n12] << (n15 += F[55]) ^ l21) & -1L << (n16 -= F[58]);
            int n17 = F[59];
            n17 ^= F[60];
            n17 -= F[61];
            int n18 = F[62];
            n18 ^= F[63];
            long l22 = l11;
            int n19 = F[65];
            n19 -= F[66];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 ^= F[64]))) ^ l22) & -1L >>> (n19 ^= F[67]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = F[68];
            n20 ^= F[69];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 -= F[70]);
            while (true) {
                int n21 = F[71];
                n21 ^= F[72];
                if ((int)(l13 >>> (n21 += F[73])) >= (int)l11) break;
                int n22 = F[74];
                n22 += F[75];
                int n23 = F[77];
                n23 += F[78];
                cArray2[(int)(l13 >>> (n22 ^= a_0.F[76]))] = cArray[(int)l12 + (int)(l13 >>> (n23 += F[79]))];
                l13 += 0x100000000L;
            }
            int n24 = F[80];
            n24 ^= F[81];
            int n25 = (int)(l14 >>> (n24 ^= F[82]));
            l14 += 0x100000000L;
            a_0.d[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = F[83];
            n26 += F[84];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 += F[85]);
        }
        INSTANCE = new a_0();
        int n27 = F[86];
        n27 += F[87];
        a = n27 += F[88];
        int n28 = F[89];
        n28 += F[90];
        A = new kotakbaz.rain.module.setting.settings.a_0((String)d[n28 ^= F[91]], 120.0f, 75.0f, 150.0f, 1.0f);
        int n29 = F[92];
        n29 += F[93];
        b = new kotakbaz.rain.module.setting.settings.a_0((String)d[n29 -= F[94]], 120.0f, 50.0f, 200.0f, 1.0f);
        int n30 = F[95];
        n30 -= F[96];
        boolean bl = F[98];
        bl += F[99];
        B = new c((String)d[n30 += F[97]], bl -= F[100]);
        c = new b(1.0f);
        int n31 = F[101];
        n31 += F[102];
        B[] bArray = new B[n31 += F[103]];
        int n32 = F[104];
        n32 -= F[105];
        bArray[n32 -= a_0.F[106]] = A;
        int n33 = F[107];
        n33 -= F[108];
        bArray[n33 -= a_0.F[109]] = b;
        int n34 = F[110];
        n34 += F[111];
        bArray[n34 ^= a_0.F[112]] = B;
        C = CollectionsKt.listOf(bArray);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[F[113]];
        String string = (String)object[F[114]];
        object = object[F[115]];
        Object[] objectArray = E;
        if (E == null) {
            objectArray = E = new Object[F[116]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[F[117]];
                D = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[F[119] ^ F[120]];
                byArray[a_0.F[121] ^ a_0.F[122]] = F[123] ^ F[124];
                byArray[a_0.F[125] ^ a_0.F[126]] = F[127] ^ F[128];
                byArray[a_0.F[129] ^ a_0.F[130]] = F[131] ^ F[132];
                byArray[a_0.F[133] ^ a_0.F[134]] = F[135] ^ F[136];
                byArray[a_0.F[137] ^ a_0.F[138]] = F[139] ^ F[140];
                byArray[a_0.F[141] ^ a_0.F[142]] = F[143] ^ F[144];
                byArray[a_0.F[145] ^ a_0.F[146]] = F[147] ^ F[148];
                byArray[a_0.F[149] ^ a_0.F[150]] = F[151] ^ F[152];
                byArray[a_0.F[153] ^ a_0.F[154]] = F[155] ^ F[156];
                byArray[a_0.F[157] ^ a_0.F[158]] = F[159] ^ F[160];
                byArray[a_0.F[161] ^ a_0.F[162]] = F[163] ^ F[164];
                byArray[a_0.F[165] ^ a_0.F[166]] = F[167] ^ F[168];
                byArray[a_0.F[169] ^ a_0.F[170]] = F[171] ^ F[172];
                byArray[a_0.F[173] ^ a_0.F[174]] = F[175] ^ F[176];
                byArray[a_0.F[177] ^ a_0.F[178]] = F[179] ^ F[180];
                byArray[a_0.F[181] ^ a_0.F[182]] = F[183] ^ F[184];
                objectArray2[a_0.F[118]] = byArray;
            }
            byte[] byArray = (byte[])object3[F[185]];
            if (e == null) {
                byte[] byArray2 = new byte[F[186] ^ F[187]];
                byArray2[a_0.F[188] ^ a_0.F[189]] = F[190] ^ F[191];
                byArray2[a_0.F[192] ^ a_0.F[193]] = F[194] ^ F[195];
                byArray2[a_0.F[196] ^ a_0.F[197]] = F[198] ^ F[199];
                byArray2[a_0.F[200] ^ a_0.F[201]] = F[202] ^ F[203];
                byArray2[a_0.F[204] ^ a_0.F[205]] = F[206] ^ F[207];
                byArray2[a_0.F[208] ^ a_0.F[209]] = F[210] ^ F[211];
                byArray2[a_0.F[212] ^ a_0.F[213]] = F[214] ^ F[215];
                byArray2[a_0.F[216] ^ a_0.F[217]] = F[218] ^ F[219];
                byArray2[a_0.F[220] ^ a_0.F[221]] = F[222] ^ F[223];
                byArray2[a_0.F[224] ^ a_0.F[225]] = F[226] ^ F[227];
                byArray2[a_0.F[228] ^ a_0.F[229]] = F[230] ^ F[231];
                byArray2[a_0.F[232] ^ a_0.F[233]] = F[234] ^ F[235];
                byArray2[a_0.F[236] ^ a_0.F[237]] = F[238] ^ F[239];
                byArray2[a_0.F[240] ^ a_0.F[241]] = F[242] ^ F[243];
                byArray2[a_0.F[244] ^ a_0.F[245]] = F[246] ^ F[247];
                byArray2[a_0.F[248] ^ a_0.F[249]] = F[250] ^ F[251];
                byArray2[a_0.F[252] ^ a_0.F[253]] = F[254] ^ F[255];
                byArray2[a_0.F[256] ^ a_0.F[257]] = F[258] ^ F[259];
                byArray2[a_0.F[260] ^ a_0.F[261]] = F[262] ^ F[263];
                byArray2[a_0.F[264] ^ a_0.F[265]] = F[266] ^ F[267];
                byArray2[a_0.F[268] ^ a_0.F[269]] = F[270] ^ F[271];
                byArray2[a_0.F[272] ^ a_0.F[273]] = F[274] ^ F[275];
                byArray2[a_0.F[276] ^ a_0.F[277]] = F[278] ^ F[279];
                byArray2[a_0.F[280] ^ a_0.F[281]] = F[282] ^ F[283];
                byArray2[a_0.F[284] ^ a_0.F[285]] = F[286] ^ F[287];
                byArray2[a_0.F[288] ^ a_0.F[289]] = F[290] ^ F[291];
                byArray2[a_0.F[292] ^ a_0.F[293]] = F[294] ^ F[295];
                byArray2[a_0.F[296] ^ a_0.F[297]] = F[298] ^ F[299];
                byArray2[a_0.F[300] ^ a_0.F[301]] = F[302] ^ F[303];
                byArray2[a_0.F[304] ^ a_0.F[305]] = F[306] ^ F[307];
                byArray2[a_0.F[308] ^ a_0.F[309]] = F[310] ^ F[311];
                byArray2[a_0.F[312] ^ a_0.F[313]] = F[314] ^ F[315];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, F[316], byArray3, F[317], byArray.length);
                System.arraycopy(byArray2, F[318], byArray3, byArray.length, byArray2.length);
                Object object4 = a_0.A()[F[319]];
                if (object4 == null) {
                    char[] cArray = "\u3f66\u3f74\u3f7d\u3f7a\u3f78\u3f44\u3f69\u3f1f\u3f0a\u3f1e\u3f7e\u3f03\u3f17\u3f15\u3f65\u3f7e\u3f77\u3f47".toCharArray();
                    for (int i = F[320]; i < F[321]; ++i) {
                        int n2 = cArray[i];
                        n2 ^= F[322];
                        n2 ^= F[323];
                        n2 ^= F[324];
                        n2 ^= F[325];
                        n2 ^= F[326];
                        n2 += F[327];
                        n2 += F[328];
                        n2 -= F[329];
                        n2 -= F[330];
                        n2 -= F[331];
                        cArray[i] = (char)(n2 += F[332]);
                    }
                    object4 = a_0.A()[a_0.F[333]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[F[334]];
                byArray4[a_0.F[335]] = F[336];
                byArray4[a_0.F[337]] = F[338];
                byArray4[a_0.F[339]] = F[340];
                byArray4[a_0.F[341]] = F[342];
                byArray4[a_0.F[343]] = F[344];
                byArray4[a_0.F[345]] = F[346];
                byArray4[a_0.F[347]] = F[348];
                byArray4[a_0.F[349]] = F[350];
                byArray4[a_0.F[351]] = F[352];
                byArray4[a_0.F[353]] = F[354];
                byArray4[a_0.F[355]] = F[356];
                byArray4[a_0.F[357]] = F[358];
                byArray4[a_0.F[359]] = F[360];
                byArray4[a_0.F[361]] = F[362];
                byArray4[a_0.F[363]] = F[364];
                byArray4[a_0.F[365]] = F[366];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, F[367], F[368]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = a_0.A()[F[369]];
                if (object5 == null) {
                    char[] cArray = "\ufb7c\ufb80\ufb6e".toCharArray();
                    for (int i = F[370]; i < F[371]; ++i) {
                        int n3 = cArray[i];
                        n3 -= F[372];
                        n3 ^= F[373];
                        n3 ^= F[374];
                        n3 ^= F[375];
                        n3 -= F[376];
                        n3 += F[377];
                        n3 -= F[378];
                        n3 += F[379];
                        n3 ^= F[380];
                        n3 -= F[381];
                        n3 += F[382];
                        n3 -= F[383];
                        n3 += F[384];
                        cArray[i] = (char)(n3 += F[385]);
                    }
                    object5 = a_0.A()[a_0.F[386]] = new String(cArray);
                }
                e = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, F[387], F[388]);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, F[389], byArray6.length);
            Object object6 = a_0.A()[F[390]];
            if (object6 == null) {
                char[] cArray = "\u2a34\u2a30\u2a26\u2a8a\u2a36\u2a37\u2a36\u2a8a\u2a25\u2a2e\u2a36\u2a26\u2a80\u2a25\u2a54\u2a51\u2a51\u2a4c\u2a4b\u2a52".toCharArray();
                for (int i = F[391]; i < F[392]; ++i) {
                    int n4 = cArray[i];
                    n4 += F[393];
                    n4 += F[394];
                    n4 -= F[395];
                    n4 -= F[396];
                    n4 -= F[397];
                    n4 += F[398];
                    n4 -= F[399];
                    n4 += 6898;
                    n4 -= 5397;
                    n4 -= 27478;
                    n4 += 3479;
                    n4 += 7450;
                    cArray[i] = (char)(n4 ^= 0x92DD);
                }
                object6 = a_0.A()[3] = new String(cArray);
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
        F = new int[0xF0CB ^ 0xF15B];
        a_0.F[0x46DA ^ 0x47BE] = 0xFFFFB873 ^ 0x47BE;
        a_0.F[0x5A1A ^ 0x5ADC] = 0xFFFFA275 ^ 0x5ADC;
        a_0.F[0x467 ^ 0x5EC] = 0x9088 ^ 0x5EC;
        a_0.F[0x6463 ^ 0x645A] = 0x640E ^ 0x645A;
        a_0.F[0x51C ^ 0x501] = 0xFFFFFAEF ^ 0x501;
        a_0.F[0xB0BD ^ 0xB132] = 0x645F ^ 0xB132;
        a_0.F[0x4E9A ^ 0x4E7D] = 0xA4E ^ 0x4E7D;
        a_0.F[0x5DBB ^ 0x5C9C] = 0xD4CD ^ 0x5C9C;
        a_0.F[0x402C ^ 0x4134] = 0x5170 ^ 0x4134;
        a_0.F[0xC30C ^ 0xC221] = 0x663D ^ 0xC221;
        a_0.F[0xD8EC ^ 0xD845] = 0x47AC ^ 0xD845;
        a_0.F[0x6F36 ^ 0x6F5A] = 0xFFFF90A5 ^ 0x6F5A;
        a_0.F[0x524B ^ 0x5274] = 0xFFFFAD81 ^ 0x5274;
        a_0.F[0x2D52 ^ 0x2C5B] = 0xBF07 ^ 0x2C5B;
        a_0.F[0x99DF ^ 0x98C3] = 0x37DF ^ 0x98C3;
        a_0.F[0x1480 ^ 0x14A2] = 0xFFFFEB03 ^ 0x14A2;
        a_0.F[0x6DC7 ^ 0x6C9F] = 0x6CDC ^ 0x6C9F;
        a_0.F[0xCFE3 ^ 0xCF30] = 0xE79A ^ 0xCF30;
        a_0.F[0x10911 ^ 0x109F3] = 0xFFFEA7C7 ^ 0x109F3;
        a_0.F[0xAD7F ^ 0xAC09] = 0x268C ^ 0xAC09;
        a_0.F[0x1650 ^ 0x177C] = 0xB376 ^ 0x177C;
        a_0.F[0xA538 ^ 0xA551] = 0xFFFF5AE7 ^ 0xA551;
        a_0.F[0x242 ^ 0x2D4] = 0xD918 ^ 0x2D4;
        a_0.F[0x4878 ^ 0x49FC] = 0x49EC ^ 0x49FC;
        a_0.F[0xB451 ^ 0xB53D] = 0xB572 ^ 0xB53D;
        a_0.F[0xB87 ^ 0xAE2] = 0xAE8 ^ 0xAE2;
        a_0.F[0x333F ^ 0x3270] = 0x3273 ^ 0x3270;
        a_0.F[0x535A ^ 0x53DA] = 0x392B ^ 0x53DA;
        a_0.F[0x20A9 ^ 0x2028] = 0xFB73 ^ 0x2028;
        a_0.F[0xC878 ^ 0xC879] = 0xC82A ^ 0xC879;
        a_0.F[0xFB69 ^ 0xFBE5] = 0xAB53 ^ 0xFBE5;
        a_0.F[0xADA6 ^ 0xAD6C] = 0xFFFFE01D ^ 0xAD6C;
        a_0.F[0x5CDF ^ 0x5C96] = 0x5CDE ^ 0x5C96;
        a_0.F[0xC5E6 ^ 0xC54B] = 0x227 ^ 0xC54B;
        a_0.F[0x3F53 ^ 0x3F23] = 0x3F3F ^ 0x3F23;
        a_0.F[0x4CE9 ^ 0x4DF6] = 0xE2FB ^ 0x4DF6;
        a_0.F[0x9911 ^ 0x986A] = 0x153E ^ 0x986A;
        a_0.F[0xFF05 ^ 0xFF6A] = 0xFFFF00D9 ^ 0xFF6A;
        a_0.F[0xCA77 ^ 0xCA9C] = 0x9344 ^ 0xCA9C;
        a_0.F[0xACEE ^ 0xAC5D] = 0xFFFE5BF1 ^ 0xAC5D;
        a_0.F[0x95A5 ^ 0x9577] = 0xFFFF422A ^ 0x9577;
        a_0.F[0x720 ^ 0x768] = 0x700 ^ 0x768;
        a_0.F[0x10290 ^ 0x10312] = 0x10310 ^ 0x10312;
        a_0.F[0xF1EB ^ 0xF0EA] = 0xBE06 ^ 0xF0EA;
        a_0.F[0x70FB ^ 0x7175] = 0xDA9E ^ 0x7175;
        a_0.F[0x9FFA ^ 0x9F15] = 0xD26D ^ 0x9F15;
        a_0.F[0x12D1 ^ 0x1292] = 0xFFFFED4E ^ 0x1292;
        a_0.F[0xA34E ^ 0xA31E] = 0xFFFF5CC1 ^ 0xA31E;
        a_0.F[0xA625 ^ 0xA6A2] = 0xCC67 ^ 0xA6A2;
        a_0.F[0xBC19 ^ 0xBCBD] = 0x809E ^ 0xBCBD;
        a_0.F[0x94F2 ^ 0x94B2] = 0x94A8 ^ 0x94B2;
        a_0.F[0x71B8 ^ 0x7188] = 0xFFFF8E13 ^ 0x7188;
        a_0.F[0xFACB ^ 0xFBE9] = 0xFFFF7031 ^ 0xFBE9;
        a_0.F[0x937F ^ 0x936B] = 0xAB07 ^ 0x936B;
        a_0.F[0xEEC1 ^ 0xEF9F] = 0xFFFF1059 ^ 0xEF9F;
        a_0.F[0xCAEA ^ 0xCAE0] = 0xCAE2 ^ 0xCAE0;
        a_0.F[0x898E ^ 0x8960] = 0xC409 ^ 0x8960;
        a_0.F[0xCF5 ^ 0xC82] = 0xD06 ^ 0xC82;
        a_0.F[0xDAFF ^ 0xDBC1] = 0xDBC1 ^ 0xDBC1;
        a_0.F[0x10FCB ^ 0x10E83] = 0x1BF68 ^ 0x10E83;
        a_0.F[0x1BDA ^ 0x1BF0] = 0x1BC8 ^ 0x1BF0;
        a_0.F[0x47BD ^ 0x4740] = 0x3E3E ^ 0x4740;
        a_0.F[0x4CEF ^ 0x4CC2] = 0xFFFFB36C ^ 0x4CC2;
        a_0.F[0x41BC ^ 0x4109] = 0xA2D0 ^ 0x4109;
        a_0.F[0x3BA7 ^ 0x3A9B] = 0x3A9B ^ 0x3A9B;
        a_0.F[0x1016F ^ 0x1000E] = 0x10009 ^ 0x1000E;
        a_0.F[0xBB9E ^ 0xBAFC] = 0xBADA ^ 0xBAFC;
        a_0.F[0x3CAA ^ 0x3C27] = 0x9A8F ^ 0x3C27;
        a_0.F[0x2889 ^ 0x29AF] = 0xFFFF5E45 ^ 0x29AF;
        a_0.F[0xF94A ^ 0xF85F] = 0x145A ^ 0xF85F;
        a_0.F[0x109FD ^ 0x10940] = 0x1619C ^ 0x10940;
        a_0.F[0x4B68 ^ 0x4B94] = 0x32FA ^ 0x4B94;
        a_0.F[0x11D8 ^ 0x1156] = 0xB7F2 ^ 0x1156;
        a_0.F[0xEED2 ^ 0xEFFC] = 0x4BCC ^ 0xEFFC;
        a_0.F[0x321A ^ 0x3299] = 0xFFFF167C ^ 0x3299;
        a_0.F[0xFF45 ^ 0xFF8D] = 0x4D0C ^ 0xFF8D;
        a_0.F[0x10886 ^ 0x109B0] = 0x169B5 ^ 0x109B0;
        a_0.F[0x7E71 ^ 0x7EEE] = 0xFFFF1FC9 ^ 0x7EEE;
        a_0.F[0x9212 ^ 0x92EC] = 0xFFFF1460 ^ 0x92EC;
        a_0.F[0xC2D6 ^ 0xC355] = 0xC355 ^ 0xC355;
        a_0.F[0xB87E ^ 0xB82B] = 0xB811 ^ 0xB82B;
        a_0.F[0x89D3 ^ 0x8936] = 0xCD05 ^ 0x8936;
        a_0.F[0x40C2 ^ 0x40BA] = 0x412E ^ 0x40BA;
        a_0.F[0xA0DA ^ 0xA088] = 0xFFFF5F06 ^ 0xA088;
        a_0.F[0x1556 ^ 0x14DE] = 0x14CA ^ 0x14DE;
        a_0.F[0x10258 ^ 0x102A9] = 0x15CDA ^ 0x102A9;
        a_0.F[0xF454 ^ 0xF4FF] = 0x6B58 ^ 0xF4FF;
        a_0.F[0x3A4E ^ 0x3B79] = 0x5B06 ^ 0x3B79;
        a_0.F[0x4311 ^ 0x4263] = 0x4263 ^ 0x4263;
        a_0.F[0xA8AD ^ 0xA83C] = 0x25E9 ^ 0xA83C;
        a_0.F[0x72C9 ^ 0x73BA] = 0x73B9 ^ 0x73BA;
        a_0.F[0xA024 ^ 0xA09F] = 0xD7 ^ 0xA09F;
        a_0.F[0xB3F4 ^ 0xB3B8] = 0xFFFF4C28 ^ 0xB3B8;
        a_0.F[0x1A14 ^ 0x1B6C] = 0xEF80 ^ 0x1B6C;
        a_0.F[0xE196 ^ 0xE0BE] = 0x4CF2 ^ 0xE0BE;
        a_0.F[0xEC4B ^ 0xECBD] = 0x52F ^ 0xECBD;
        a_0.F[0xE158 ^ 0xE155] = 0xE139 ^ 0xE155;
        a_0.F[0x2742 ^ 0x2792] = 0xF3E ^ 0x2792;
        a_0.F[0xAD0E ^ 0xADCA] = 0xAACF ^ 0xADCA;
        a_0.F[0x719C ^ 0x71C0] = 0x71A2 ^ 0x71C0;
        a_0.F[0x7B87 ^ 0x7ADD] = 0xFFFF855E ^ 0x7ADD;
        a_0.F[0x5D22 ^ 0x5DCA] = 0x412 ^ 0x5DCA;
        a_0.F[0xB298 ^ 0xB3B9] = 0xC7F4 ^ 0xB3B9;
        a_0.F[0x7B87 ^ 0x7B5A] = 0xF49E ^ 0x7B5A;
        a_0.F[0xBC15 ^ 0xBC8E] = 0x5E67 ^ 0xBC8E;
        a_0.F[0xD642 ^ 0xD74C] = 0xFFFF8F3D ^ 0xD74C;
        a_0.F[0x7259 ^ 0x72E7] = 0xFFFFE5FB ^ 0x72E7;
        a_0.F[0xEE1D ^ 0xEF41] = 0xFFFF10E0 ^ 0xEF41;
        a_0.F[0x31F8 ^ 0x316F] = 0xFFFF152C ^ 0x316F;
        a_0.F[0xDF35 ^ 0xDF3C] = 0xDF3C ^ 0xDF3C;
        a_0.F[0x6555 ^ 0x659B] = 0xFFFF48A7 ^ 0x659B;
        a_0.F[0x6FE9 ^ 0x6EEC] = 0xD3B3 ^ 0x6EEC;
        a_0.F[0xF37 ^ 0xFFE] = 0xBD6D ^ 0xFFE;
        a_0.F[0xD84 ^ 0xD00] = 0xD651 ^ 0xD00;
        a_0.F[0x7F9D ^ 0x7FF3] = 0x7F98 ^ 0x7FF3;
        a_0.F[0xCEF9 ^ 0xCFFB] = 0xFFFF7ECD ^ 0xCFFB;
        a_0.F[0x8AF7 ^ 0x8A4B] = 0xE282 ^ 0x8A4B;
        a_0.F[0xA56D ^ 0xA5DB] = 0x460B ^ 0xA5DB;
        a_0.F[0x6CA9 ^ 0x6DCF] = 0x6DCE ^ 0x6DCF;
        a_0.F[0x726 ^ 0x62D] = 0x9571 ^ 0x62D;
        a_0.F[0x10ABF ^ 0x10A9C] = 0xFFFEF55F ^ 0x10A9C;
        a_0.F[0xE25E ^ 0xE223] = 0x88D6 ^ 0xE223;
        a_0.F[0x10661 ^ 0x10602] = 0x10603 ^ 0x10602;
        a_0.F[0x6FA9 ^ 0x6ECE] = 0x6ECB ^ 0x6ECE;
        a_0.F[0x7E7C ^ 0x7EAD] = 0x5607 ^ 0x7EAD;
        a_0.F[0x796B ^ 0x7960] = 0x7960 ^ 0x7960;
        a_0.F[0xBD29 ^ 0xBD21] = 0xBD20 ^ 0xBD21;
        a_0.F[0x5D1B ^ 0x5DFA] = 0xC53 ^ 0x5DFA;
        a_0.F[0xC141 ^ 0xC160] = 0xC152 ^ 0xC160;
        a_0.F[0x8EA0 ^ 0x8FF4] = 0xFFFF703B ^ 0x8FF4;
        a_0.F[0x649C ^ 0x642E] = 0x16C7D ^ 0x642E;
        a_0.F[0x94A3 ^ 0x95FA] = 0x95F3 ^ 0x95FA;
        a_0.F[0x7BD3 ^ 0x7B92] = 0x7BDC ^ 0x7B92;
        a_0.F[0x1B44 ^ 0x1A08] = 0xEBE7 ^ 0x1A08;
        a_0.F[0x540A ^ 0x550A] = 0x1BE5 ^ 0x550A;
        a_0.F[0xC541 ^ 0xC408] = 0xDBD4 ^ 0xC408;
        a_0.F[0x97 ^ 0x23] = 0x10870 ^ 0x23;
        a_0.F[0x4D93 ^ 0x4D79] = 0xFFFFEB79 ^ 0x4D79;
        a_0.F[0x1399 ^ 0x1301] = 0xC8CD ^ 0x1301;
        a_0.F[0x2DB9 ^ 0x2DEF] = 0x2C9A ^ 0x2DEF;
        a_0.F[0x2657 ^ 0x269C] = 0x940F ^ 0x269C;
        a_0.F[0x18DA ^ 0x18EB] = 0x18B1 ^ 0x18EB;
        a_0.F[0x721D ^ 0x724C] = 0x723D ^ 0x724C;
        a_0.F[0x7BF1 ^ 0x7A9A] = 0x7A97 ^ 0x7A9A;
        a_0.F[0x3104 ^ 0x3052] = 0x3051 ^ 0x3052;
        a_0.F[0x54CA ^ 0x54D0] = 0xA6AB ^ 0x54D0;
        a_0.F[0xB262 ^ 0xB20F] = 0xFFFF4DF8 ^ 0xB20F;
        a_0.F[0xC8E5 ^ 0xC9F3] = 0x25E2 ^ 0xC9F3;
        a_0.F[0xDC0A ^ 0xDC32] = 0xFFFF23CB ^ 0xDC32;
        a_0.F[0xD53C ^ 0xD467] = 0xD469 ^ 0xD467;
        a_0.F[0x9F73 ^ 0x9F07] = 0x9F06 ^ 0x9F07;
        a_0.F[0xA6AB ^ 0xA67F] = 0xC6AA ^ 0xA67F;
        a_0.F[0x9B6F ^ 0x9BAF] = 0x7553 ^ 0x9BAF;
        a_0.F[0x5395 ^ 0x5350] = 0x5458 ^ 0x5350;
        a_0.F[0x9CA9 ^ 0x9D23] = 0x9981 ^ 0x9D23;
        a_0.F[0xC283 ^ 0xC3CE] = 0xC3CF ^ 0xC3CE;
        a_0.F[0xFF2 ^ 0xEDD] = 0xAAC1 ^ 0xEDD;
        a_0.F[0x12C4 ^ 0x12AF] = 0xFFFFED58 ^ 0x12AF;
        a_0.F[0x9B7D ^ 0x9B6F] = 0x269 ^ 0x9B6F;
        a_0.F[0x84CC ^ 0x8449] = 0xEEC2 ^ 0x8449;
        a_0.F[0x4189 ^ 0x40A0] = 0xECE2 ^ 0x40A0;
        a_0.F[0x5D96 ^ 0x5CC1] = 0x5CC7 ^ 0x5CC1;
        a_0.F[0xFF82 ^ 0xFEC3] = 0xFED1 ^ 0xFEC3;
        a_0.F[0x8901 ^ 0x899B] = 0x6B69 ^ 0x899B;
        a_0.F[0x824F ^ 0x830C] = 0x80AF ^ 0x830C;
        a_0.F[0x264 ^ 0x357] = 0xC50E ^ 0x357;
        a_0.F[0x10FA5 ^ 0x10E86] = 0x17ACB ^ 0x10E86;
        a_0.F[0x538 ^ 0x5A8] = 0xA30C ^ 0x5A8;
        a_0.F[0x7AE9 ^ 0x7BFD] = 0x97E6 ^ 0x7BFD;
        a_0.F[0x61CC ^ 0x614A] = 0xBC7 ^ 0x614A;
        a_0.F[0x4EF6 ^ 0x4EDA] = 0xFFFFB1EC ^ 0x4EDA;
        a_0.F[0xA5D4 ^ 0xA5AB] = 0xFFFF30B0 ^ 0xA5AB;
        a_0.F[0x1D0D ^ 0x1D0B] = 0x1D08 ^ 0x1D0B;
        a_0.F[0x2F4D ^ 0x2FC7] = 0x7F71 ^ 0x2FC7;
        a_0.F[0x18A6 ^ 0x18A2] = 0x18EA ^ 0x18A2;
        a_0.F[0x1637 ^ 0x1749] = 0xE35F ^ 0x1749;
        a_0.F[0x8514 ^ 0x85B2] = 0x7002 ^ 0x85B2;
        a_0.F[0x1081B ^ 0x10921] = 0xFFFE239B ^ 0x10921;
        a_0.F[0xD2F0 ^ 0xD3EA] = 0xFFFF3C39 ^ 0xD3EA;
        a_0.F[0x6D6A ^ 0x6D5E] = 0xFFFF92B6 ^ 0x6D5E;
        a_0.F[0x1DA6 ^ 0x1CB7] = 0x827F ^ 0x1CB7;
        a_0.F[0xAB63 ^ 0xAB64] = 0xAB64 ^ 0xAB64;
        a_0.F[0x3E9E ^ 0x3F93] = 0x9863 ^ 0x3F93;
        a_0.F[0x107E5 ^ 0x107B8] = 0xFFFEF856 ^ 0x107B8;
        a_0.F[0x5CDF ^ 0x5DEF] = 0x9BA5 ^ 0x5DEF;
        a_0.F[0xC4A4 ^ 0xC5E6] = 0x7C55 ^ 0xC5E6;
        a_0.F[0x1EBD ^ 0x1FB2] = 0xB842 ^ 0x1FB2;
        a_0.F[0x1007B ^ 0x10065] = 0x10067 ^ 0x10065;
        a_0.F[0x1B74 ^ 0x1B99] = 0x56E1 ^ 0x1B99;
        a_0.F[0x31C3 ^ 0x30C7] = 0x8D92 ^ 0x30C7;
        a_0.F[0x6B46 ^ 0x6B78] = 0xFFFF94B7 ^ 0x6B78;
        a_0.F[0xF6F4 ^ 0xF610] = 0xB224 ^ 0xF610;
        a_0.F[0x6056 ^ 0x612A] = 0xB59E ^ 0x612A;
        a_0.F[0xBF34 ^ 0xBFEE] = 0xFFFFBC99 ^ 0xBFEE;
        a_0.F[0x10D6F ^ 0x10DCC] = 0xFFFECE43 ^ 0x10DCC;
        a_0.F[0x9F2C ^ 0x9EA0] = 0x8B84 ^ 0x9EA0;
        a_0.F[0x24C9 ^ 0x2497] = 0x24D9 ^ 0x2497;
        a_0.F[0x1105 ^ 0x11CA] = 0xC310 ^ 0x11CA;
        a_0.F[0x8AEF ^ 0x8A76] = 0x6887 ^ 0x8A76;
        a_0.F[0x696B ^ 0x6850] = 0xBD5D ^ 0x6850;
        a_0.F[0xC7D ^ 0xCB1] = 0xDE7F ^ 0xCB1;
        a_0.F[0xB3DE ^ 0xB3F1] = 0xFFFF4C07 ^ 0xB3F1;
        a_0.F[0x823C ^ 0x8369] = 0x8366 ^ 0x8369;
        a_0.F[0x34D3 ^ 0x34C3] = 0x7300 ^ 0x34C3;
        a_0.F[0x105E2 ^ 0x105BB] = 0xFFFEFA68 ^ 0x105BB;
        a_0.F[0x5017 ^ 0x5014] = 0x5047 ^ 0x5014;
        a_0.F[0x3B95 ^ 0x3AAC] = 0xEFA1 ^ 0x3AAC;
        a_0.F[0x1022 ^ 0x109D] = 0x7841 ^ 0x109D;
        a_0.F[0x53E9 ^ 0x5309] = 0x2A2 ^ 0x5309;
        a_0.F[0x40DB ^ 0x40F2] = 0x4063 ^ 0x40F2;
        a_0.F[0xD3BA ^ 0xD3F8] = 0xD3AA ^ 0xD3F8;
        a_0.F[0xF986 ^ 0xF801] = 0xF801 ^ 0xF801;
        a_0.F[0x490 ^ 0x5FA] = 0x581 ^ 0x5FA;
        a_0.F[0x3768 ^ 0x3714] = 0xD414 ^ 0x3714;
        a_0.F[0xE819 ^ 0xE878] = 0xE876 ^ 0xE878;
        a_0.F[0xB087 ^ 0xB0B2] = 0xFFFF4FDF ^ 0xB0B2;
        a_0.F[0xD409 ^ 0xD45A] = 0xD451 ^ 0xD45A;
        a_0.F[0x2C93 ^ 0x2D13] = 0x412A ^ 0x2D13;
        a_0.F[0xB4BE ^ 0xB4D4] = 0xFFFF4B64 ^ 0xB4D4;
        a_0.F[0x1EFA ^ 0x1F85] = 0xEB52 ^ 0x1F85;
        a_0.F[0x1880 ^ 0x18B3] = 0xFFFFE769 ^ 0x18B3;
        a_0.F[0x192A ^ 0x1838] = 0xFFFF7901 ^ 0x1838;
        a_0.F[0x12EA ^ 0x1277] = 0x8CDF ^ 0x1277;
        a_0.F[0x8290 ^ 0x82F8] = 0xFFFF7D9E ^ 0x82F8;
        a_0.F[0xC9A4 ^ 0xC8A2] = 0xFFFF8A74 ^ 0xC8A2;
        a_0.F[0xD03B ^ 0xD1BA] = 0x4061 ^ 0xD1BA;
        a_0.F[0xF65 ^ 0xF76] = 0xAD10 ^ 0xF76;
        a_0.F[0x1929 ^ 0x192C] = 0x1917 ^ 0x192C;
        a_0.F[0xF595 ^ 0xF517] = 0x2E46 ^ 0xF517;
        a_0.F[0x4B55 ^ 0x4A25] = 0x4B25 ^ 0x4A25;
        a_0.F[0xFF38 ^ 0xFE57] = 0xFE4E ^ 0xFE57;
        a_0.F[0x99D8 ^ 0x9996] = 0xFFFF661C ^ 0x9996;
        a_0.F[0x1591 ^ 0x1528] = 0x1528 ^ 0x1528;
        a_0.F[0xE2E8 ^ 0xE3F1] = 0xF3BD ^ 0xE3F1;
        a_0.F[0xB97A ^ 0xB82A] = 0xB81B ^ 0xB82A;
        a_0.F[0x3E8B ^ 0x3F9C] = 0xD399 ^ 0x3F9C;
        a_0.F[0xEC06 ^ 0xECA4] = 0xD087 ^ 0xECA4;
        a_0.F[0x63BA ^ 0x6291] = 0xCED3 ^ 0x6291;
        a_0.F[0x5BE2 ^ 0x5A8C] = 0x5AA4 ^ 0x5A8C;
        a_0.F[0x73A7 ^ 0x73B0] = 0x5644 ^ 0x73B0;
        a_0.F[0x921C ^ 0x9328] = 0xF34B ^ 0x9328;
        a_0.F[0x1030 ^ 0x10EC] = 0x9F35 ^ 0x10EC;
        a_0.F[0x69A9 ^ 0x6956] = 0x1028 ^ 0x6956;
        a_0.F[0xD721 ^ 0xD716] = 0xD75D ^ 0xD716;
        a_0.F[0x31AC ^ 0x30E9] = 0x9841 ^ 0x30E9;
        a_0.F[0x2645 ^ 0x269E] = 0xDA10 ^ 0x269E;
        a_0.F[0xB8C8 ^ 0xB8E8] = 0xFFFF475B ^ 0xB8E8;
        a_0.F[0xC0D8 ^ 0xC1FD] = 0x49AC ^ 0xC1FD;
        a_0.F[0x4CFE ^ 0x4C39] = 0x4B31 ^ 0x4C39;
        a_0.F[0x253F ^ 0x2452] = 0x245A ^ 0x2452;
        a_0.F[0x3E06 ^ 0x3E61] = 0xFFFFC1C1 ^ 0x3E61;
        a_0.F[0x107A9 ^ 0x10782] = 0xFFFEF845 ^ 0x10782;
        a_0.F[0x606F ^ 0x60FC] = 0xED66 ^ 0x60FC;
        a_0.F[0x86E6 ^ 0x87A1] = 0x6EFB ^ 0x87A1;
        a_0.F[0xCF67 ^ 0xCF41] = 0xFFFF306F ^ 0xCF41;
        a_0.F[0x128F ^ 0x1242] = 0xC098 ^ 0x1242;
        a_0.F[0xB306 ^ 0xB3B6] = 0x74DD ^ 0xB3B6;
        a_0.F[0xC1E6 ^ 0xC1A0] = 0xC1A6 ^ 0xC1A0;
        a_0.F[0x6889 ^ 0x6806] = 0xFFFF310F ^ 0x6806;
        a_0.F[0x49E ^ 0x446] = 0xF8C3 ^ 0x446;
        a_0.F[0x5138 ^ 0x51FA] = 0xFFFF4082 ^ 0x51FA;
        a_0.F[0x50A1 ^ 0x5058] = 0x7004 ^ 0x5058;
        a_0.F[0xC751 ^ 0xC638] = 0xC63A ^ 0xC638;
        a_0.F[0x51A4 ^ 0x5150] = 0xB8BC ^ 0x5150;
        a_0.F[0x5EBA ^ 0x5F85] = 0x5F84 ^ 0x5F85;
        a_0.F[0x9EA ^ 0x893] = 0xCD3F ^ 0x893;
        a_0.F[0x109AC ^ 0x10954] = 0x12901 ^ 0x10954;
        a_0.F[0x6729 ^ 0x665D] = 0x9BBF ^ 0x665D;
        a_0.F[0x3E98 ^ 0x3F8B] = 0xA143 ^ 0x3F8B;
        a_0.F[0x23FA ^ 0x22DA] = 0x568E ^ 0x22DA;
        a_0.F[0xD0F1 ^ 0xD0EE] = 0xFFFF2F22 ^ 0xD0EE;
        a_0.F[0x6D71 ^ 0x6C3F] = 0x6C2F ^ 0x6C3F;
        a_0.F[0xDAD0 ^ 0xDAA6] = 0xDAA6 ^ 0xDAA6;
        a_0.F[0x680E ^ 0x6987] = 0xE2A6 ^ 0x6987;
        a_0.F[0x8E13 ^ 0x8E0F] = 0x8E0F ^ 0x8E0F;
        a_0.F[0x46FC ^ 0x468E] = 0x468C ^ 0x468E;
        a_0.F[0x75A3 ^ 0x75C1] = 0x75F6 ^ 0x75C1;
        a_0.F[0xFDA ^ 0xF90] = 0xFFFFF028 ^ 0xF90;
        a_0.F[0x88CB ^ 0x89C1] = 0x1A9A ^ 0x89C1;
        a_0.F[0xF65D ^ 0xF71D] = 0xF71D ^ 0xF71D;
        a_0.F[0x577 ^ 0x545] = 0xFFFFFAE7 ^ 0x545;
        a_0.F[0xB4A ^ 0xB71] = 0xBFF ^ 0xB71;
        a_0.F[0x514B ^ 0x503A] = 0x5038 ^ 0x503A;
        a_0.F[0x59C ^ 0x5E9] = 0x5E8 ^ 0x5E9;
        a_0.F[0x1A34 ^ 0x1AA0] = 0x9775 ^ 0x1AA0;
        a_0.F[0x10B7B ^ 0x10B5F] = 0x10B68 ^ 0x10B5F;
        a_0.F[0x405F ^ 0x4047] = 0x3A12 ^ 0x4047;
        a_0.F[0xA295 ^ 0xA3A8] = 0xA3A8 ^ 0xA3A8;
        a_0.F[0x6AF2 ^ 0x6B9A] = 0x6BA2 ^ 0x6B9A;
        a_0.F[0x37BC ^ 0x3729] = 0xECEB ^ 0x3729;
        a_0.F[0x523C ^ 0x5322] = 0xFFFF03B6 ^ 0x5322;
        a_0.F[0x8E05 ^ 0x8F0D] = 0x1C4B ^ 0x8F0D;
        a_0.F[0xBCBE ^ 0xBDB2] = 0x1A5D ^ 0xBDB2;
        a_0.F[0xC1F1 ^ 0xC0C0] = 0x699 ^ 0xC0C0;
        a_0.F[0xFBE0 ^ 0xFB23] = 0x15DB ^ 0xFB23;
        a_0.F[0x20A9 ^ 0x2007] = 0xE76C ^ 0x2007;
        a_0.F[0xDA72 ^ 0xDA94] = 0xFFFF6154 ^ 0xDA94;
        a_0.F[0xAD6E ^ 0xAC19] = 0x6D33 ^ 0xAC19;
        a_0.F[0x6004 ^ 0x60FE] = 0x40C8 ^ 0x60FE;
        a_0.F[0x1D59 ^ 0x1D65] = 0x1D60 ^ 0x1D65;
        a_0.F[0x10AAA ^ 0x10AA5] = 0x1A7C6 ^ 0x10AA5;
        a_0.F[0x1AF4 ^ 0x1A5C] = 0xEFEC ^ 0x1A5C;
        a_0.F[0x1011E ^ 0x10151] = 0x10128 ^ 0x10151;
        a_0.F[0xE789 ^ 0xE77B] = 0xB91A ^ 0xE77B;
        a_0.F[0x7571 ^ 0x7443] = 0xFFFF4DB1 ^ 0x7443;
        a_0.F[0x91BE ^ 0x9157] = 0xC88F ^ 0x9157;
        a_0.F[0x39E6 ^ 0x39A1] = 0xFFFFC611 ^ 0x39A1;
        a_0.F[0x9C42 ^ 0x9CDE] = 0x7E2C ^ 0x9CDE;
        a_0.F[0x7A8E ^ 0x7A95] = 0xDEC8 ^ 0x7A95;
        a_0.F[0x6DBD ^ 0x6D1C] = 0x5130 ^ 0x6D1C;
        a_0.F[0x9DD7 ^ 0x9DF0] = 0x9D81 ^ 0x9DF0;
        a_0.F[0x2FAB ^ 0x2F5E] = 0xC6BE ^ 0x2F5E;
        a_0.F[0x6429 ^ 0x6407] = 0xFFFF9B8F ^ 0x6407;
        a_0.F[0xC8D ^ 0xC53] = 0xFFFF7C20 ^ 0xC53;
        a_0.F[0x77C9 ^ 0x769A] = 0x7696 ^ 0x769A;
        a_0.F[0xB55F ^ 0xB40D] = 0xFFFF4BE3 ^ 0xB40D;
        a_0.F[0x10BA8 ^ 0x10AF7] = 0x10AF3 ^ 0x10AF7;
        a_0.F[0x9927 ^ 0x9978] = 0x9937 ^ 0x9978;
        a_0.F[0x1BB5 ^ 0x1BEE] = 0xFFFFE43B ^ 0x1BEE;
        a_0.F[0x632 ^ 0x76F] = 0x76F ^ 0x76F;
        a_0.F[0x5A47 ^ 0x5BC2] = 0x5BD2 ^ 0x5BC2;
        a_0.F[0xB99B ^ 0xB8EE] = 0xB68C ^ 0xB8EE;
        a_0.F[0x7D9F ^ 0x7C82] = 0xD38F ^ 0x7C82;
        a_0.F[0x4035 ^ 0x41B3] = 0x41B0 ^ 0x41B3;
        a_0.F[0x13F5 ^ 0x13DD] = 0x13BF ^ 0x13DD;
        a_0.F[0x6D9D ^ 0x6C10] = 0x7499 ^ 0x6C10;
        a_0.F[0x33F1 ^ 0x33F1] = 0xFFFFCC77 ^ 0x33F1;
        a_0.F[0xFD55 ^ 0xFDED] = 0x1E3D ^ 0xFDED;
        a_0.F[0x7B89 ^ 0x7B9F] = 0x352E ^ 0x7B9F;
        a_0.F[0xD3AE ^ 0xD284] = 0xFFFF812F ^ 0xD284;
        a_0.F[0xECC3 ^ 0xEDC0] = 0xA32C ^ 0xEDC0;
        a_0.F[0xBC0B ^ 0xBCD4] = 0x3310 ^ 0xBCD4;
        a_0.F[0x16C1 ^ 0x1617] = 0x76DF ^ 0x1617;
        a_0.F[0x5378 ^ 0x532F] = 0xFFFFAC86 ^ 0x532F;
        a_0.F[0x103CC ^ 0x103B7] = 0x1E08B ^ 0x103B7;
        a_0.F[0xE1F0 ^ 0xE08D] = 0xA4D8 ^ 0xE08D;
        a_0.F[0xDC61 ^ 0xDD02] = 0xDD09 ^ 0xDD02;
        a_0.F[0xFFE3 ^ 0xFF90] = 0xFF90 ^ 0xFF90;
        a_0.F[0xE3E3 ^ 0xE322] = 0xDDA ^ 0xE322;
        a_0.F[0x7032 ^ 0x7023] = 0x4506 ^ 0x7023;
        a_0.F[0x46C0 ^ 0x465E] = 0xD8FE ^ 0x465E;
        a_0.F[0xBD41 ^ 0xBD7C] = 0xBD07 ^ 0xBD7C;
        a_0.F[0x1013A ^ 0x101C1] = 0x1219D ^ 0x101C1;
        a_0.F[0x816 ^ 0x8C3] = 0x680D ^ 0x8C3;
        a_0.F[0xA5A7 ^ 0xA5E2] = 0xA5D1 ^ 0xA5E2;
        a_0.F[0x9F2 ^ 0x9F0] = 0xFFFFF626 ^ 0x9F0;
        a_0.F[0x7215 ^ 0x72E2] = 0x9B02 ^ 0x72E2;
        a_0.F[0xC7BE ^ 0xC6B9] = 0x7BE6 ^ 0xC6B9;
        a_0.F[0x5887 ^ 0x59CD] = 0xE6E3 ^ 0x59CD;
        a_0.F[0xB53A ^ 0xB40F] = 0xD470 ^ 0xB40F;
        a_0.F[0xACA2 ^ 0xADD8] = 0x2FAC ^ 0xADD8;
        a_0.F[0x6C48 ^ 0x6D19] = 0x6D18 ^ 0x6D19;
        a_0.F[0x5FAF ^ 0x5F05] = 0xC0E1 ^ 0x5F05;
        a_0.F[0xC1D7 ^ 0xC145] = 0x4C90 ^ 0xC145;
        a_0.F[0x3393 ^ 0x33F5] = 0x3388 ^ 0x33F5;
        a_0.F[0xEE1D ^ 0xEE11] = 0xEE11 ^ 0xEE11;
        a_0.F[0x2E32 ^ 0x2E79] = 0xFFFFD181 ^ 0x2E79;
        a_0.F[0x63B2 ^ 0x633B] = 0x338F ^ 0x633B;
        a_0.F[0xFE93 ^ 0xFEED] = 0x941C ^ 0xFEED;
        a_0.F[0x8554 ^ 0x85E3] = 0x6649 ^ 0x85E3;
        a_0.F[0x5D02 ^ 0x5D78] = 0xBE78 ^ 0x5D78;
        a_0.F[0x7A04 ^ 0x7A5C] = 0x7A66 ^ 0x7A5C;
        a_0.F[0x28EB ^ 0x29AD] = 0x8DF4 ^ 0x29AD;
        a_0.F[0xAE53 ^ 0xAEDB] = 0xC456 ^ 0xAEDB;
        a_0.F[0x947D ^ 0x9404] = 0x770F ^ 0x9404;
        a_0.F[0x32A1 ^ 0x3399] = 0xE68C ^ 0x3399;
        a_0.F[0x37C ^ 0x369] = 0x5344 ^ 0x369;
        a_0.F[0x105DC ^ 0x105D2] = 0x10613 ^ 0x105D2;
        a_0.F[0x870D ^ 0x8737] = 0x871A ^ 0x8737;
        a_0.F[0xC9A0 ^ 0xC94C] = 0x8431 ^ 0xC94C;
        a_0.F[0x27FD ^ 0x269D] = 0xFFFFD941 ^ 0x269D;
        a_0.F[0xB80 ^ 0xBDA] = 0xBDB ^ 0xBDA;
        a_0.F[0x10506 ^ 0x1044D] = 0x19F43 ^ 0x1044D;
        a_0.F[0xF846 ^ 0xF837] = 0xF836 ^ 0xF837;
        a_0.F[0x867D ^ 0x86DA] = 0xFFFF8C95 ^ 0x86DA;
        a_0.F[0xECB2 ^ 0xECD7] = 0xFFFF1331 ^ 0xECD7;
        a_0.F[0x8116 ^ 0x810F] = 0x9C79 ^ 0x810F;
        a_0.F[0xFA0A ^ 0xFB4E] = 0x9FFD ^ 0xFB4E;
        a_0.F[0xB4FF ^ 0xB445] = 0x142D ^ 0xB445;
        a_0.F[0xA5C4 ^ 0xA5A4] = 0xA5F9 ^ 0xA5A4;
        a_0.F[0x23D3 ^ 0x237F] = 0xBC9B ^ 0x237F;
        a_0.F[0x95D ^ 0x846] = 0x180A ^ 0x846;
        a_0.F[0x7A2F ^ 0x7A7B] = 0xFFFF85A0 ^ 0x7A7B;
        a_0.F[0x1078A ^ 0x107CE] = 0x107DB ^ 0x107CE;
        a_0.F[0xD864 ^ 0xD8C4] = 0x4664 ^ 0xD8C4;
        a_0.F[0xB975 ^ 0xB9AC] = 0x4522 ^ 0xB9AC;
        a_0.F[0x24F ^ 0x279] = 0x211 ^ 0x279;
        a_0.F[0x4D07 ^ 0x4DF4] = 0x1387 ^ 0x4DF4;
        a_0.F[0xE7E ^ 0xEDB] = 0xFB6E ^ 0xEDB;
        a_0.F[0x4750 ^ 0x4787] = 0x2749 ^ 0x4787;
        a_0.F[0x25C2 ^ 0x24E6] = 0xACB6 ^ 0x24E6;
        a_0.F[0x549 ^ 0x5B9] = 0x5BDD ^ 0x5B9;
        a_0.F[0xF4DA ^ 0xF475] = 0x3364 ^ 0xF475;
        a_0.F[0x205D ^ 0x20D6] = 0x7079 ^ 0x20D6;
        a_0.F[0xD8BC ^ 0xD8F1] = 0xD8EC ^ 0xD8F1;
        a_0.F[0x7C6A ^ 0x7D7A] = 0xE3BD ^ 0x7D7A;
        a_0.F[0x10CBC ^ 0x10C5F] = 0x15DF6 ^ 0x10C5F;
        a_0.F[0x634A ^ 0x636F] = 0xFFFF9CBB ^ 0x636F;
        a_0.F[0xCF71 ^ 0xCFC0] = 0x1C792 ^ 0xCFC0;
        a_0.F[0x10B57 ^ 0x10B33] = 0x10B0B ^ 0x10B33;
    }
}

