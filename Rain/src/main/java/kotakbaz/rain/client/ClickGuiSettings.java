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
import kotakbaz.rain.client.util.animations.AnimationUtil;
import kotakbaz.rain.client.util.animations.Easings;
import kotakbaz.rain.module.setting.B;
import kotakbaz.rain.module.setting.Setting;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004\u00a2\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0011\u0010\u0006J\r\u0010\u0012\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0012\u0010\u0006J\r\u0010\u0013\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0013\u0010\u0006J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0014\u0010\u000bJ\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0015\u0010\u000eJ\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0016\u0010\u000eJ\r\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\f\u00a2\u0006\u0004\b\u001a\u0010\u0003R\u001a\u0010\u001c\u001a\u00020\u001b8\u0006X\u0086D\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b(\u0010)R!\u0010,\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030+0*8\u0006\u00a2\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\u00a8\u00060"}, d2={"Lkotakbaz/rain/client/ClickGuiSettings;", "", "<init>", "()V", "", "scale", "()F", "scalePercent", "scaleProgress", "progress", "scalePercentForProgress", "(F)F", "", "setScaleProgress", "(F)V", "value", "setScalePercent", "hudScale", "hudScalePercent", "hudScaleProgress", "hudScalePercentForProgress", "setHudScaleProgress", "setHudScalePercent", "", "renderGuiBackground", "()Z", "toggleGuiBackground", "", "openKey", "I", "getOpenKey", "()I", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "scaleSetting", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "hudScaleSetting", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "guiBackgroundSetting", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "Lkotakbaz/rain/client/util/animations/AnimationUtil;", "scaleAnimation", "Lkotakbaz/rain/client/util/animations/AnimationUtil;", "", "Lkotakbaz/rain/module/setting/Setting;", "settings", "Ljava/util/List;", "getSettings", "()Ljava/util/List;", "rain-visuals"})
public final class ClickGuiSettings {
    @NotNull
    public static final ClickGuiSettings INSTANCE;
    private static final int a;
    @NotNull
    private static final SliderSetting A;
    @NotNull
    private static final SliderSetting b;
    @NotNull
    private static final BooleanSetting B;
    @NotNull
    private static final AnimationUtil c;
    @NotNull
    private static final List<B<?>> C;
    private static Object[] d;
    private static Object e;
    private static Object[] E;
    private static Object[] D;
    private static Object[] f;
    public static int[] F;

    private ClickGuiSettings() {
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
        return c.animate(f2, 150.0f, new A(Easings.INSTANCE));
    }

    public final float scalePercent() {
        return ((Number)A.getValue()).floatValue();
    }

    public final float scaleProgress() {
        return A.progress();
    }

    public final float scalePercentForProgress(float progress2) {
        float f2 = RangesKt.coerceIn(progress2, 0.0f, 1.0f);
        return A.getMin() + (A.getMax() - A.getMin()) * f2;
    }

    public final void setScaleProgress(float progress2) {
        this.setScalePercent(this.scalePercentForProgress(progress2));
    }

    public final void setScalePercent(float value2) {
        A.setClamped(value2);
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

    public final float hudScalePercentForProgress(float progress2) {
        float f2 = RangesKt.coerceIn(progress2, 0.0f, 1.0f);
        return b.getMin() + (b.getMax() - b.getMin()) * f2;
    }

    public final void setHudScaleProgress(float progress2) {
        this.setHudScalePercent(this.hudScalePercentForProgress(progress2));
    }

    public final void setHudScalePercent(float value2) {
        b.setClamped(value2);
    }

    public final boolean renderGuiBackground() {
        return (Boolean)B.getValue();
    }

    public final void toggleGuiBackground() {
        B.toggle();
    }

    static {
        ClickGuiSettings.b();
        long l2 = 2183955289549154986L;
        long l3 = -4305976263019585924L;
        long l4 = 7589040472486778082L;
        long l5 = -8065381097231305239L;
        long l6 = -469328086432599926L;
        long l7 = -5964332004523956887L;
        long l8 = 6321615829852759287L;
        long l9 = -292590077412020896L;
        long l10 = 2932228624130931759L;
        long l11 = -3524111931788697454L;
        long l12 = 1295161084317226651L;
        long l13 = -3572416716875996935L;
        long l14 = -741150903919663622L;
        long l15 = 8096627684735784408L;
        int n2 = F[0];
        n2 += F[1];
        d = new Object[n2 -= F[2]];
        long l16 = l15;
        int n3 = F[3];
        n3 ^= F[4];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 ^= F[5]);
        Object[] objectArray = new Object[F[6]];
        objectArray[ClickGuiSettings.F[7]] = D;
        objectArray[ClickGuiSettings.F[8]] = F[9];
        int n4 = F[10];
        Object object = ClickGuiSettings.A()[F[11]];
        if (object == null) {
            char[] cArray = "\uc42f\uc40b\uc442\uc42c\uc417\uc1f7\uc43a\uc430\uc3fd\uc40f\uc403\uc403\uc41e\uc42c\uc405\uc438\uc42b\uc1e5\uc41f\uc408\uc40f\uc448\uc40c\uc1f5\uc410\uc42b\uc1f6\uc421\uc422\uc408\uc1f4\uc1f5\uc43c\uc40e\uc41c\uc42d\uc420\uc422\uc40d\uc1f5\uc1f9\uc413\uc1f9\uc413\uc42a\uc41c\uc41c\uc3fd\uc1e5\uc40c\uc43e\uc436\uc1f5\uc448\uc418\uc442\uc421\uc40c\uc420\uc42f\uc414\uc431\uc43a\uc1f0\uc422\uc428\uc44a\uc41c\uc430\uc1f7\uc402\uc418\uc43c\uc417\uc420\uc44b\uc1f4\uc423\uc1f9\uc415\uc3fe\uc419\uc43a\uc448\uc42f\uc414\uc43d\uc414\uc40e\uc1f9\uc441\uc42b\uc415\uc1f3\uc401\uc405\uc415\uc436\uc430\uc42f\uc3ff\uc3fc\uc41a\uc40d\uc1f7\uc43f\uc420\uc424".toCharArray();
            for (int i2 = F[12]; i2 < F[13]; ++i2) {
                int n5 = cArray[i2];
                n5 -= F[14];
                n5 += F[15];
                n5 -= F[16];
                n5 += F[17];
                n5 ^= F[18];
                n5 += F[19];
                n5 -= F[20];
                n5 -= F[21];
                n5 += F[22];
                n5 -= F[23];
                n5 -= F[24];
                n5 ^= F[25];
                n5 -= F[26];
                cArray[i2] = (char)(n5 -= F[27]);
            }
            object = ClickGuiSettings.A()[ClickGuiSettings.F[28]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)ClickGuiSettings.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = F[29];
        n6 -= F[30];
        l6 = l17 ^ (0x2200000000L ^ l17) & -1L << (n6 -= F[31]);
        long l18 = l13;
        int n7 = F[32];
        n7 -= F[33];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 ^= F[34]);
        while (true) {
            int n8 = F[35];
            n8 ^= F[36];
            if ((int)l13 >= (int)(l6 >>> (n8 ^= F[37]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = F[38];
            n10 += F[39];
            int n11 = F[41];
            n11 -= F[42];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 += F[40])) & -1L >>> (n11 += F[43]);
            long l20 = l9;
            int n12 = F[44];
            n12 ^= F[45];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 += F[46]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = F[47];
            n14 -= F[48];
            int n15 = F[50];
            n15 -= F[51];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= F[49])) & -1L >>> (n15 ^= F[52]);
            int n16 = F[53];
            n16 += F[54];
            long l22 = l10;
            int n17 = F[56];
            n17 += F[57];
            l10 = l22 ^ ((long)cArray[n13] << (n16 += F[55]) ^ l22) & -1L << (n17 -= F[58]);
            int n18 = F[59];
            n18 ^= F[60];
            n18 -= F[61];
            int n19 = F[62];
            n19 ^= F[63];
            long l23 = l12;
            int n20 = F[65];
            n20 -= F[66];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 ^= F[64]))) ^ l23) & -1L >>> (n20 ^= F[67]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = F[68];
            n21 ^= F[69];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 -= F[70]);
            while (true) {
                int n22 = F[71];
                n22 ^= F[72];
                if ((int)(l14 >>> (n22 += F[73])) >= (int)l12) break;
                int n23 = F[74];
                n23 += F[75];
                int n24 = F[77];
                n24 += F[78];
                cArray2[(int)(l14 >>> (n23 ^= ClickGuiSettings.F[76]))] = cArray[(int)l13 + (int)(l14 >>> (n24 += F[79]))];
                l14 += 0x100000000L;
            }
            int n25 = F[80];
            n25 ^= F[81];
            int n26 = (int)(l15 >>> (n25 ^= F[82]));
            l15 += 0x100000000L;
            ClickGuiSettings.d[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = F[83];
            n27 += F[84];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 += F[85]);
        }
        INSTANCE = new ClickGuiSettings();
        int n28 = F[86];
        n28 += F[87];
        a = n28 += F[88];
        int n29 = F[89];
        n29 += F[90];
        A = new SliderSetting((String)d[n29 ^= F[91]], 120.0f, 75.0f, 150.0f, 1.0f);
        int n30 = F[92];
        n30 += F[93];
        b = new SliderSetting((String)d[n30 -= F[94]], 120.0f, 50.0f, 200.0f, 1.0f);
        int n31 = F[95];
        n31 -= F[96];
        boolean bl = F[98];
        bl += F[99];
        B = new BooleanSetting((String)d[n31 += F[97]], bl -= F[100]);
        c = new AnimationUtil(1.0f);
        int n32 = F[101];
        n32 += F[102];
        Setting[] settingArray = new Setting[n32 += F[103]];
        int n33 = F[104];
        n33 -= F[105];
        settingArray[n33 -= ClickGuiSettings.F[106]] = A;
        int n34 = F[107];
        n34 -= F[108];
        settingArray[n34 -= ClickGuiSettings.F[109]] = b;
        int n35 = F[110];
        n35 += F[111];
        settingArray[n35 ^= ClickGuiSettings.F[112]] = B;
        C = CollectionsKt.listOf(settingArray);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[F[113]];
        String string = (String)object[F[114]];
        object = object[F[115]];
        Object[] objectArray = E;
        if (E == null) {
            objectArray = E = new Object[F[116]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[F[117]];
                D = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[F[119] ^ F[120]];
                byArray[ClickGuiSettings.F[121] ^ ClickGuiSettings.F[122]] = F[123] ^ F[124];
                byArray[ClickGuiSettings.F[125] ^ ClickGuiSettings.F[126]] = F[127] ^ F[128];
                byArray[ClickGuiSettings.F[129] ^ ClickGuiSettings.F[130]] = F[131] ^ F[132];
                byArray[ClickGuiSettings.F[133] ^ ClickGuiSettings.F[134]] = F[135] ^ F[136];
                byArray[ClickGuiSettings.F[137] ^ ClickGuiSettings.F[138]] = F[139] ^ F[140];
                byArray[ClickGuiSettings.F[141] ^ ClickGuiSettings.F[142]] = F[143] ^ F[144];
                byArray[ClickGuiSettings.F[145] ^ ClickGuiSettings.F[146]] = F[147] ^ F[148];
                byArray[ClickGuiSettings.F[149] ^ ClickGuiSettings.F[150]] = F[151] ^ F[152];
                byArray[ClickGuiSettings.F[153] ^ ClickGuiSettings.F[154]] = F[155] ^ F[156];
                byArray[ClickGuiSettings.F[157] ^ ClickGuiSettings.F[158]] = F[159] ^ F[160];
                byArray[ClickGuiSettings.F[161] ^ ClickGuiSettings.F[162]] = F[163] ^ F[164];
                byArray[ClickGuiSettings.F[165] ^ ClickGuiSettings.F[166]] = F[167] ^ F[168];
                byArray[ClickGuiSettings.F[169] ^ ClickGuiSettings.F[170]] = F[171] ^ F[172];
                byArray[ClickGuiSettings.F[173] ^ ClickGuiSettings.F[174]] = F[175] ^ F[176];
                byArray[ClickGuiSettings.F[177] ^ ClickGuiSettings.F[178]] = F[179] ^ F[180];
                byArray[ClickGuiSettings.F[181] ^ ClickGuiSettings.F[182]] = F[183] ^ F[184];
                objectArray2[ClickGuiSettings.F[118]] = byArray;
            }
            byte[] byArray = (byte[])object3[F[185]];
            if (e == null) {
                byte[] byArray2 = new byte[F[186] ^ F[187]];
                byArray2[ClickGuiSettings.F[188] ^ ClickGuiSettings.F[189]] = F[190] ^ F[191];
                byArray2[ClickGuiSettings.F[192] ^ ClickGuiSettings.F[193]] = F[194] ^ F[195];
                byArray2[ClickGuiSettings.F[196] ^ ClickGuiSettings.F[197]] = F[198] ^ F[199];
                byArray2[ClickGuiSettings.F[200] ^ ClickGuiSettings.F[201]] = F[202] ^ F[203];
                byArray2[ClickGuiSettings.F[204] ^ ClickGuiSettings.F[205]] = F[206] ^ F[207];
                byArray2[ClickGuiSettings.F[208] ^ ClickGuiSettings.F[209]] = F[210] ^ F[211];
                byArray2[ClickGuiSettings.F[212] ^ ClickGuiSettings.F[213]] = F[214] ^ F[215];
                byArray2[ClickGuiSettings.F[216] ^ ClickGuiSettings.F[217]] = F[218] ^ F[219];
                byArray2[ClickGuiSettings.F[220] ^ ClickGuiSettings.F[221]] = F[222] ^ F[223];
                byArray2[ClickGuiSettings.F[224] ^ ClickGuiSettings.F[225]] = F[226] ^ F[227];
                byArray2[ClickGuiSettings.F[228] ^ ClickGuiSettings.F[229]] = F[230] ^ F[231];
                byArray2[ClickGuiSettings.F[232] ^ ClickGuiSettings.F[233]] = F[234] ^ F[235];
                byArray2[ClickGuiSettings.F[236] ^ ClickGuiSettings.F[237]] = F[238] ^ F[239];
                byArray2[ClickGuiSettings.F[240] ^ ClickGuiSettings.F[241]] = F[242] ^ F[243];
                byArray2[ClickGuiSettings.F[244] ^ ClickGuiSettings.F[245]] = F[246] ^ F[247];
                byArray2[ClickGuiSettings.F[248] ^ ClickGuiSettings.F[249]] = F[250] ^ F[251];
                byArray2[ClickGuiSettings.F[252] ^ ClickGuiSettings.F[253]] = F[254] ^ F[255];
                byArray2[ClickGuiSettings.F[256] ^ ClickGuiSettings.F[257]] = F[258] ^ F[259];
                byArray2[ClickGuiSettings.F[260] ^ ClickGuiSettings.F[261]] = F[262] ^ F[263];
                byArray2[ClickGuiSettings.F[264] ^ ClickGuiSettings.F[265]] = F[266] ^ F[267];
                byArray2[ClickGuiSettings.F[268] ^ ClickGuiSettings.F[269]] = F[270] ^ F[271];
                byArray2[ClickGuiSettings.F[272] ^ ClickGuiSettings.F[273]] = F[274] ^ F[275];
                byArray2[ClickGuiSettings.F[276] ^ ClickGuiSettings.F[277]] = F[278] ^ F[279];
                byArray2[ClickGuiSettings.F[280] ^ ClickGuiSettings.F[281]] = F[282] ^ F[283];
                byArray2[ClickGuiSettings.F[284] ^ ClickGuiSettings.F[285]] = F[286] ^ F[287];
                byArray2[ClickGuiSettings.F[288] ^ ClickGuiSettings.F[289]] = F[290] ^ F[291];
                byArray2[ClickGuiSettings.F[292] ^ ClickGuiSettings.F[293]] = F[294] ^ F[295];
                byArray2[ClickGuiSettings.F[296] ^ ClickGuiSettings.F[297]] = F[298] ^ F[299];
                byArray2[ClickGuiSettings.F[300] ^ ClickGuiSettings.F[301]] = F[302] ^ F[303];
                byArray2[ClickGuiSettings.F[304] ^ ClickGuiSettings.F[305]] = F[306] ^ F[307];
                byArray2[ClickGuiSettings.F[308] ^ ClickGuiSettings.F[309]] = F[310] ^ F[311];
                byArray2[ClickGuiSettings.F[312] ^ ClickGuiSettings.F[313]] = F[314] ^ F[315];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, F[316], byArray3, F[317], byArray.length);
                System.arraycopy(byArray2, F[318], byArray3, byArray.length, byArray2.length);
                Object object4 = ClickGuiSettings.A()[F[319]];
                if (object4 == null) {
                    char[] cArray = "\u3f66\u3f74\u3f7d\u3f7a\u3f78\u3f44\u3f69\u3f1f\u3f0a\u3f1e\u3f7e\u3f03\u3f17\u3f15\u3f65\u3f7e\u3f77\u3f47".toCharArray();
                    for (int i2 = F[320]; i2 < F[321]; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= F[322];
                        n3 ^= F[323];
                        n3 ^= F[324];
                        n3 ^= F[325];
                        n3 ^= F[326];
                        n3 += F[327];
                        n3 += F[328];
                        n3 -= F[329];
                        n3 -= F[330];
                        n3 -= F[331];
                        cArray[i2] = (char)(n3 += F[332]);
                    }
                    object4 = ClickGuiSettings.A()[ClickGuiSettings.F[333]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[F[334]];
                byArray4[ClickGuiSettings.F[335]] = F[336];
                byArray4[ClickGuiSettings.F[337]] = F[338];
                byArray4[ClickGuiSettings.F[339]] = F[340];
                byArray4[ClickGuiSettings.F[341]] = F[342];
                byArray4[ClickGuiSettings.F[343]] = F[344];
                byArray4[ClickGuiSettings.F[345]] = F[346];
                byArray4[ClickGuiSettings.F[347]] = F[348];
                byArray4[ClickGuiSettings.F[349]] = F[350];
                byArray4[ClickGuiSettings.F[351]] = F[352];
                byArray4[ClickGuiSettings.F[353]] = F[354];
                byArray4[ClickGuiSettings.F[355]] = F[356];
                byArray4[ClickGuiSettings.F[357]] = F[358];
                byArray4[ClickGuiSettings.F[359]] = F[360];
                byArray4[ClickGuiSettings.F[361]] = F[362];
                byArray4[ClickGuiSettings.F[363]] = F[364];
                byArray4[ClickGuiSettings.F[365]] = F[366];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, F[367], F[368]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = ClickGuiSettings.A()[F[369]];
                if (object5 == null) {
                    char[] cArray = "\ufb7c\ufb80\ufb6e".toCharArray();
                    for (int i3 = F[370]; i3 < F[371]; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= F[372];
                        n4 ^= F[373];
                        n4 ^= F[374];
                        n4 ^= F[375];
                        n4 -= F[376];
                        n4 += F[377];
                        n4 -= F[378];
                        n4 += F[379];
                        n4 ^= F[380];
                        n4 -= F[381];
                        n4 += F[382];
                        n4 -= F[383];
                        n4 += F[384];
                        cArray[i3] = (char)(n4 += F[385]);
                    }
                    object5 = ClickGuiSettings.A()[ClickGuiSettings.F[386]] = new String(cArray);
                }
                e = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, F[387], F[388]);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, F[389], byArray6.length);
            Object object6 = ClickGuiSettings.A()[F[390]];
            if (object6 == null) {
                char[] cArray = "\u2a34\u2a30\u2a26\u2a8a\u2a36\u2a37\u2a36\u2a8a\u2a25\u2a2e\u2a36\u2a26\u2a80\u2a25\u2a54\u2a51\u2a51\u2a4c\u2a4b\u2a52".toCharArray();
                for (int i4 = F[391]; i4 < F[392]; ++i4) {
                    int n5 = cArray[i4];
                    n5 += F[393];
                    n5 += F[394];
                    n5 -= F[395];
                    n5 -= F[396];
                    n5 -= F[397];
                    n5 += F[398];
                    n5 -= F[399];
                    n5 += 6898;
                    n5 -= 5397;
                    n5 -= 27478;
                    n5 += 3479;
                    n5 += 7450;
                    cArray[i4] = (char)(n5 ^= 0x92DD);
                }
                object6 = ClickGuiSettings.A()[3] = new String(cArray);
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
        ClickGuiSettings.F[0x46DA ^ 0x47BE] = 0xFFFFB873 ^ 0x47BE;
        ClickGuiSettings.F[0x5A1A ^ 0x5ADC] = 0xFFFFA275 ^ 0x5ADC;
        ClickGuiSettings.F[0x467 ^ 0x5EC] = 0x9088 ^ 0x5EC;
        ClickGuiSettings.F[0x6463 ^ 0x645A] = 0x640E ^ 0x645A;
        ClickGuiSettings.F[0x51C ^ 0x501] = 0xFFFFFAEF ^ 0x501;
        ClickGuiSettings.F[0xB0BD ^ 0xB132] = 0x645F ^ 0xB132;
        ClickGuiSettings.F[0x4E9A ^ 0x4E7D] = 0xA4E ^ 0x4E7D;
        ClickGuiSettings.F[0x5DBB ^ 0x5C9C] = 0xD4CD ^ 0x5C9C;
        ClickGuiSettings.F[0x402C ^ 0x4134] = 0x5170 ^ 0x4134;
        ClickGuiSettings.F[0xC30C ^ 0xC221] = 0x663D ^ 0xC221;
        ClickGuiSettings.F[0xD8EC ^ 0xD845] = 0x47AC ^ 0xD845;
        ClickGuiSettings.F[0x6F36 ^ 0x6F5A] = 0xFFFF90A5 ^ 0x6F5A;
        ClickGuiSettings.F[0x524B ^ 0x5274] = 0xFFFFAD81 ^ 0x5274;
        ClickGuiSettings.F[0x2D52 ^ 0x2C5B] = 0xBF07 ^ 0x2C5B;
        ClickGuiSettings.F[0x99DF ^ 0x98C3] = 0x37DF ^ 0x98C3;
        ClickGuiSettings.F[0x1480 ^ 0x14A2] = 0xFFFFEB03 ^ 0x14A2;
        ClickGuiSettings.F[0x6DC7 ^ 0x6C9F] = 0x6CDC ^ 0x6C9F;
        ClickGuiSettings.F[0xCFE3 ^ 0xCF30] = 0xE79A ^ 0xCF30;
        ClickGuiSettings.F[0x10911 ^ 0x109F3] = 0xFFFEA7C7 ^ 0x109F3;
        ClickGuiSettings.F[0xAD7F ^ 0xAC09] = 0x268C ^ 0xAC09;
        ClickGuiSettings.F[0x1650 ^ 0x177C] = 0xB376 ^ 0x177C;
        ClickGuiSettings.F[0xA538 ^ 0xA551] = 0xFFFF5AE7 ^ 0xA551;
        ClickGuiSettings.F[0x242 ^ 0x2D4] = 0xD918 ^ 0x2D4;
        ClickGuiSettings.F[0x4878 ^ 0x49FC] = 0x49EC ^ 0x49FC;
        ClickGuiSettings.F[0xB451 ^ 0xB53D] = 0xB572 ^ 0xB53D;
        ClickGuiSettings.F[0xB87 ^ 0xAE2] = 0xAE8 ^ 0xAE2;
        ClickGuiSettings.F[0x333F ^ 0x3270] = 0x3273 ^ 0x3270;
        ClickGuiSettings.F[0x535A ^ 0x53DA] = 0x392B ^ 0x53DA;
        ClickGuiSettings.F[0x20A9 ^ 0x2028] = 0xFB73 ^ 0x2028;
        ClickGuiSettings.F[0xC878 ^ 0xC879] = 0xC82A ^ 0xC879;
        ClickGuiSettings.F[0xFB69 ^ 0xFBE5] = 0xAB53 ^ 0xFBE5;
        ClickGuiSettings.F[0xADA6 ^ 0xAD6C] = 0xFFFFE01D ^ 0xAD6C;
        ClickGuiSettings.F[0x5CDF ^ 0x5C96] = 0x5CDE ^ 0x5C96;
        ClickGuiSettings.F[0xC5E6 ^ 0xC54B] = 0x227 ^ 0xC54B;
        ClickGuiSettings.F[0x3F53 ^ 0x3F23] = 0x3F3F ^ 0x3F23;
        ClickGuiSettings.F[0x4CE9 ^ 0x4DF6] = 0xE2FB ^ 0x4DF6;
        ClickGuiSettings.F[0x9911 ^ 0x986A] = 0x153E ^ 0x986A;
        ClickGuiSettings.F[0xFF05 ^ 0xFF6A] = 0xFFFF00D9 ^ 0xFF6A;
        ClickGuiSettings.F[0xCA77 ^ 0xCA9C] = 0x9344 ^ 0xCA9C;
        ClickGuiSettings.F[0xACEE ^ 0xAC5D] = 0xFFFE5BF1 ^ 0xAC5D;
        ClickGuiSettings.F[0x95A5 ^ 0x9577] = 0xFFFF422A ^ 0x9577;
        ClickGuiSettings.F[0x720 ^ 0x768] = 0x700 ^ 0x768;
        ClickGuiSettings.F[0x10290 ^ 0x10312] = 0x10310 ^ 0x10312;
        ClickGuiSettings.F[0xF1EB ^ 0xF0EA] = 0xBE06 ^ 0xF0EA;
        ClickGuiSettings.F[0x70FB ^ 0x7175] = 0xDA9E ^ 0x7175;
        ClickGuiSettings.F[0x9FFA ^ 0x9F15] = 0xD26D ^ 0x9F15;
        ClickGuiSettings.F[0x12D1 ^ 0x1292] = 0xFFFFED4E ^ 0x1292;
        ClickGuiSettings.F[0xA34E ^ 0xA31E] = 0xFFFF5CC1 ^ 0xA31E;
        ClickGuiSettings.F[0xA625 ^ 0xA6A2] = 0xCC67 ^ 0xA6A2;
        ClickGuiSettings.F[0xBC19 ^ 0xBCBD] = 0x809E ^ 0xBCBD;
        ClickGuiSettings.F[0x94F2 ^ 0x94B2] = 0x94A8 ^ 0x94B2;
        ClickGuiSettings.F[0x71B8 ^ 0x7188] = 0xFFFF8E13 ^ 0x7188;
        ClickGuiSettings.F[0xFACB ^ 0xFBE9] = 0xFFFF7031 ^ 0xFBE9;
        ClickGuiSettings.F[0x937F ^ 0x936B] = 0xAB07 ^ 0x936B;
        ClickGuiSettings.F[0xEEC1 ^ 0xEF9F] = 0xFFFF1059 ^ 0xEF9F;
        ClickGuiSettings.F[0xCAEA ^ 0xCAE0] = 0xCAE2 ^ 0xCAE0;
        ClickGuiSettings.F[0x898E ^ 0x8960] = 0xC409 ^ 0x8960;
        ClickGuiSettings.F[0xCF5 ^ 0xC82] = 0xD06 ^ 0xC82;
        ClickGuiSettings.F[0xDAFF ^ 0xDBC1] = 0xDBC1 ^ 0xDBC1;
        ClickGuiSettings.F[0x10FCB ^ 0x10E83] = 0x1BF68 ^ 0x10E83;
        ClickGuiSettings.F[0x1BDA ^ 0x1BF0] = 0x1BC8 ^ 0x1BF0;
        ClickGuiSettings.F[0x47BD ^ 0x4740] = 0x3E3E ^ 0x4740;
        ClickGuiSettings.F[0x4CEF ^ 0x4CC2] = 0xFFFFB36C ^ 0x4CC2;
        ClickGuiSettings.F[0x41BC ^ 0x4109] = 0xA2D0 ^ 0x4109;
        ClickGuiSettings.F[0x3BA7 ^ 0x3A9B] = 0x3A9B ^ 0x3A9B;
        ClickGuiSettings.F[0x1016F ^ 0x1000E] = 0x10009 ^ 0x1000E;
        ClickGuiSettings.F[0xBB9E ^ 0xBAFC] = 0xBADA ^ 0xBAFC;
        ClickGuiSettings.F[0x3CAA ^ 0x3C27] = 0x9A8F ^ 0x3C27;
        ClickGuiSettings.F[0x2889 ^ 0x29AF] = 0xFFFF5E45 ^ 0x29AF;
        ClickGuiSettings.F[0xF94A ^ 0xF85F] = 0x145A ^ 0xF85F;
        ClickGuiSettings.F[0x109FD ^ 0x10940] = 0x1619C ^ 0x10940;
        ClickGuiSettings.F[0x4B68 ^ 0x4B94] = 0x32FA ^ 0x4B94;
        ClickGuiSettings.F[0x11D8 ^ 0x1156] = 0xB7F2 ^ 0x1156;
        ClickGuiSettings.F[0xEED2 ^ 0xEFFC] = 0x4BCC ^ 0xEFFC;
        ClickGuiSettings.F[0x321A ^ 0x3299] = 0xFFFF167C ^ 0x3299;
        ClickGuiSettings.F[0xFF45 ^ 0xFF8D] = 0x4D0C ^ 0xFF8D;
        ClickGuiSettings.F[0x10886 ^ 0x109B0] = 0x169B5 ^ 0x109B0;
        ClickGuiSettings.F[0x7E71 ^ 0x7EEE] = 0xFFFF1FC9 ^ 0x7EEE;
        ClickGuiSettings.F[0x9212 ^ 0x92EC] = 0xFFFF1460 ^ 0x92EC;
        ClickGuiSettings.F[0xC2D6 ^ 0xC355] = 0xC355 ^ 0xC355;
        ClickGuiSettings.F[0xB87E ^ 0xB82B] = 0xB811 ^ 0xB82B;
        ClickGuiSettings.F[0x89D3 ^ 0x8936] = 0xCD05 ^ 0x8936;
        ClickGuiSettings.F[0x40C2 ^ 0x40BA] = 0x412E ^ 0x40BA;
        ClickGuiSettings.F[0xA0DA ^ 0xA088] = 0xFFFF5F06 ^ 0xA088;
        ClickGuiSettings.F[0x1556 ^ 0x14DE] = 0x14CA ^ 0x14DE;
        ClickGuiSettings.F[0x10258 ^ 0x102A9] = 0x15CDA ^ 0x102A9;
        ClickGuiSettings.F[0xF454 ^ 0xF4FF] = 0x6B58 ^ 0xF4FF;
        ClickGuiSettings.F[0x3A4E ^ 0x3B79] = 0x5B06 ^ 0x3B79;
        ClickGuiSettings.F[0x4311 ^ 0x4263] = 0x4263 ^ 0x4263;
        ClickGuiSettings.F[0xA8AD ^ 0xA83C] = 0x25E9 ^ 0xA83C;
        ClickGuiSettings.F[0x72C9 ^ 0x73BA] = 0x73B9 ^ 0x73BA;
        ClickGuiSettings.F[0xA024 ^ 0xA09F] = 0xD7 ^ 0xA09F;
        ClickGuiSettings.F[0xB3F4 ^ 0xB3B8] = 0xFFFF4C28 ^ 0xB3B8;
        ClickGuiSettings.F[0x1A14 ^ 0x1B6C] = 0xEF80 ^ 0x1B6C;
        ClickGuiSettings.F[0xE196 ^ 0xE0BE] = 0x4CF2 ^ 0xE0BE;
        ClickGuiSettings.F[0xEC4B ^ 0xECBD] = 0x52F ^ 0xECBD;
        ClickGuiSettings.F[0xE158 ^ 0xE155] = 0xE139 ^ 0xE155;
        ClickGuiSettings.F[0x2742 ^ 0x2792] = 0xF3E ^ 0x2792;
        ClickGuiSettings.F[0xAD0E ^ 0xADCA] = 0xAACF ^ 0xADCA;
        ClickGuiSettings.F[0x719C ^ 0x71C0] = 0x71A2 ^ 0x71C0;
        ClickGuiSettings.F[0x7B87 ^ 0x7ADD] = 0xFFFF855E ^ 0x7ADD;
        ClickGuiSettings.F[0x5D22 ^ 0x5DCA] = 0x412 ^ 0x5DCA;
        ClickGuiSettings.F[0xB298 ^ 0xB3B9] = 0xC7F4 ^ 0xB3B9;
        ClickGuiSettings.F[0x7B87 ^ 0x7B5A] = 0xF49E ^ 0x7B5A;
        ClickGuiSettings.F[0xBC15 ^ 0xBC8E] = 0x5E67 ^ 0xBC8E;
        ClickGuiSettings.F[0xD642 ^ 0xD74C] = 0xFFFF8F3D ^ 0xD74C;
        ClickGuiSettings.F[0x7259 ^ 0x72E7] = 0xFFFFE5FB ^ 0x72E7;
        ClickGuiSettings.F[0xEE1D ^ 0xEF41] = 0xFFFF10E0 ^ 0xEF41;
        ClickGuiSettings.F[0x31F8 ^ 0x316F] = 0xFFFF152C ^ 0x316F;
        ClickGuiSettings.F[0xDF35 ^ 0xDF3C] = 0xDF3C ^ 0xDF3C;
        ClickGuiSettings.F[0x6555 ^ 0x659B] = 0xFFFF48A7 ^ 0x659B;
        ClickGuiSettings.F[0x6FE9 ^ 0x6EEC] = 0xD3B3 ^ 0x6EEC;
        ClickGuiSettings.F[0xF37 ^ 0xFFE] = 0xBD6D ^ 0xFFE;
        ClickGuiSettings.F[0xD84 ^ 0xD00] = 0xD651 ^ 0xD00;
        ClickGuiSettings.F[0x7F9D ^ 0x7FF3] = 0x7F98 ^ 0x7FF3;
        ClickGuiSettings.F[0xCEF9 ^ 0xCFFB] = 0xFFFF7ECD ^ 0xCFFB;
        ClickGuiSettings.F[0x8AF7 ^ 0x8A4B] = 0xE282 ^ 0x8A4B;
        ClickGuiSettings.F[0xA56D ^ 0xA5DB] = 0x460B ^ 0xA5DB;
        ClickGuiSettings.F[0x6CA9 ^ 0x6DCF] = 0x6DCE ^ 0x6DCF;
        ClickGuiSettings.F[0x726 ^ 0x62D] = 0x9571 ^ 0x62D;
        ClickGuiSettings.F[0x10ABF ^ 0x10A9C] = 0xFFFEF55F ^ 0x10A9C;
        ClickGuiSettings.F[0xE25E ^ 0xE223] = 0x88D6 ^ 0xE223;
        ClickGuiSettings.F[0x10661 ^ 0x10602] = 0x10603 ^ 0x10602;
        ClickGuiSettings.F[0x6FA9 ^ 0x6ECE] = 0x6ECB ^ 0x6ECE;
        ClickGuiSettings.F[0x7E7C ^ 0x7EAD] = 0x5607 ^ 0x7EAD;
        ClickGuiSettings.F[0x796B ^ 0x7960] = 0x7960 ^ 0x7960;
        ClickGuiSettings.F[0xBD29 ^ 0xBD21] = 0xBD20 ^ 0xBD21;
        ClickGuiSettings.F[0x5D1B ^ 0x5DFA] = 0xC53 ^ 0x5DFA;
        ClickGuiSettings.F[0xC141 ^ 0xC160] = 0xC152 ^ 0xC160;
        ClickGuiSettings.F[0x8EA0 ^ 0x8FF4] = 0xFFFF703B ^ 0x8FF4;
        ClickGuiSettings.F[0x649C ^ 0x642E] = 0x16C7D ^ 0x642E;
        ClickGuiSettings.F[0x94A3 ^ 0x95FA] = 0x95F3 ^ 0x95FA;
        ClickGuiSettings.F[0x7BD3 ^ 0x7B92] = 0x7BDC ^ 0x7B92;
        ClickGuiSettings.F[0x1B44 ^ 0x1A08] = 0xEBE7 ^ 0x1A08;
        ClickGuiSettings.F[0x540A ^ 0x550A] = 0x1BE5 ^ 0x550A;
        ClickGuiSettings.F[0xC541 ^ 0xC408] = 0xDBD4 ^ 0xC408;
        ClickGuiSettings.F[0x97 ^ 0x23] = 0x10870 ^ 0x23;
        ClickGuiSettings.F[0x4D93 ^ 0x4D79] = 0xFFFFEB79 ^ 0x4D79;
        ClickGuiSettings.F[0x1399 ^ 0x1301] = 0xC8CD ^ 0x1301;
        ClickGuiSettings.F[0x2DB9 ^ 0x2DEF] = 0x2C9A ^ 0x2DEF;
        ClickGuiSettings.F[0x2657 ^ 0x269C] = 0x940F ^ 0x269C;
        ClickGuiSettings.F[0x18DA ^ 0x18EB] = 0x18B1 ^ 0x18EB;
        ClickGuiSettings.F[0x721D ^ 0x724C] = 0x723D ^ 0x724C;
        ClickGuiSettings.F[0x7BF1 ^ 0x7A9A] = 0x7A97 ^ 0x7A9A;
        ClickGuiSettings.F[0x3104 ^ 0x3052] = 0x3051 ^ 0x3052;
        ClickGuiSettings.F[0x54CA ^ 0x54D0] = 0xA6AB ^ 0x54D0;
        ClickGuiSettings.F[0xB262 ^ 0xB20F] = 0xFFFF4DF8 ^ 0xB20F;
        ClickGuiSettings.F[0xC8E5 ^ 0xC9F3] = 0x25E2 ^ 0xC9F3;
        ClickGuiSettings.F[0xDC0A ^ 0xDC32] = 0xFFFF23CB ^ 0xDC32;
        ClickGuiSettings.F[0xD53C ^ 0xD467] = 0xD469 ^ 0xD467;
        ClickGuiSettings.F[0x9F73 ^ 0x9F07] = 0x9F06 ^ 0x9F07;
        ClickGuiSettings.F[0xA6AB ^ 0xA67F] = 0xC6AA ^ 0xA67F;
        ClickGuiSettings.F[0x9B6F ^ 0x9BAF] = 0x7553 ^ 0x9BAF;
        ClickGuiSettings.F[0x5395 ^ 0x5350] = 0x5458 ^ 0x5350;
        ClickGuiSettings.F[0x9CA9 ^ 0x9D23] = 0x9981 ^ 0x9D23;
        ClickGuiSettings.F[0xC283 ^ 0xC3CE] = 0xC3CF ^ 0xC3CE;
        ClickGuiSettings.F[0xFF2 ^ 0xEDD] = 0xAAC1 ^ 0xEDD;
        ClickGuiSettings.F[0x12C4 ^ 0x12AF] = 0xFFFFED58 ^ 0x12AF;
        ClickGuiSettings.F[0x9B7D ^ 0x9B6F] = 0x269 ^ 0x9B6F;
        ClickGuiSettings.F[0x84CC ^ 0x8449] = 0xEEC2 ^ 0x8449;
        ClickGuiSettings.F[0x4189 ^ 0x40A0] = 0xECE2 ^ 0x40A0;
        ClickGuiSettings.F[0x5D96 ^ 0x5CC1] = 0x5CC7 ^ 0x5CC1;
        ClickGuiSettings.F[0xFF82 ^ 0xFEC3] = 0xFED1 ^ 0xFEC3;
        ClickGuiSettings.F[0x8901 ^ 0x899B] = 0x6B69 ^ 0x899B;
        ClickGuiSettings.F[0x824F ^ 0x830C] = 0x80AF ^ 0x830C;
        ClickGuiSettings.F[0x264 ^ 0x357] = 0xC50E ^ 0x357;
        ClickGuiSettings.F[0x10FA5 ^ 0x10E86] = 0x17ACB ^ 0x10E86;
        ClickGuiSettings.F[0x538 ^ 0x5A8] = 0xA30C ^ 0x5A8;
        ClickGuiSettings.F[0x7AE9 ^ 0x7BFD] = 0x97E6 ^ 0x7BFD;
        ClickGuiSettings.F[0x61CC ^ 0x614A] = 0xBC7 ^ 0x614A;
        ClickGuiSettings.F[0x4EF6 ^ 0x4EDA] = 0xFFFFB1EC ^ 0x4EDA;
        ClickGuiSettings.F[0xA5D4 ^ 0xA5AB] = 0xFFFF30B0 ^ 0xA5AB;
        ClickGuiSettings.F[0x1D0D ^ 0x1D0B] = 0x1D08 ^ 0x1D0B;
        ClickGuiSettings.F[0x2F4D ^ 0x2FC7] = 0x7F71 ^ 0x2FC7;
        ClickGuiSettings.F[0x18A6 ^ 0x18A2] = 0x18EA ^ 0x18A2;
        ClickGuiSettings.F[0x1637 ^ 0x1749] = 0xE35F ^ 0x1749;
        ClickGuiSettings.F[0x8514 ^ 0x85B2] = 0x7002 ^ 0x85B2;
        ClickGuiSettings.F[0x1081B ^ 0x10921] = 0xFFFE239B ^ 0x10921;
        ClickGuiSettings.F[0xD2F0 ^ 0xD3EA] = 0xFFFF3C39 ^ 0xD3EA;
        ClickGuiSettings.F[0x6D6A ^ 0x6D5E] = 0xFFFF92B6 ^ 0x6D5E;
        ClickGuiSettings.F[0x1DA6 ^ 0x1CB7] = 0x827F ^ 0x1CB7;
        ClickGuiSettings.F[0xAB63 ^ 0xAB64] = 0xAB64 ^ 0xAB64;
        ClickGuiSettings.F[0x3E9E ^ 0x3F93] = 0x9863 ^ 0x3F93;
        ClickGuiSettings.F[0x107E5 ^ 0x107B8] = 0xFFFEF856 ^ 0x107B8;
        ClickGuiSettings.F[0x5CDF ^ 0x5DEF] = 0x9BA5 ^ 0x5DEF;
        ClickGuiSettings.F[0xC4A4 ^ 0xC5E6] = 0x7C55 ^ 0xC5E6;
        ClickGuiSettings.F[0x1EBD ^ 0x1FB2] = 0xB842 ^ 0x1FB2;
        ClickGuiSettings.F[0x1007B ^ 0x10065] = 0x10067 ^ 0x10065;
        ClickGuiSettings.F[0x1B74 ^ 0x1B99] = 0x56E1 ^ 0x1B99;
        ClickGuiSettings.F[0x31C3 ^ 0x30C7] = 0x8D92 ^ 0x30C7;
        ClickGuiSettings.F[0x6B46 ^ 0x6B78] = 0xFFFF94B7 ^ 0x6B78;
        ClickGuiSettings.F[0xF6F4 ^ 0xF610] = 0xB224 ^ 0xF610;
        ClickGuiSettings.F[0x6056 ^ 0x612A] = 0xB59E ^ 0x612A;
        ClickGuiSettings.F[0xBF34 ^ 0xBFEE] = 0xFFFFBC99 ^ 0xBFEE;
        ClickGuiSettings.F[0x10D6F ^ 0x10DCC] = 0xFFFECE43 ^ 0x10DCC;
        ClickGuiSettings.F[0x9F2C ^ 0x9EA0] = 0x8B84 ^ 0x9EA0;
        ClickGuiSettings.F[0x24C9 ^ 0x2497] = 0x24D9 ^ 0x2497;
        ClickGuiSettings.F[0x1105 ^ 0x11CA] = 0xC310 ^ 0x11CA;
        ClickGuiSettings.F[0x8AEF ^ 0x8A76] = 0x6887 ^ 0x8A76;
        ClickGuiSettings.F[0x696B ^ 0x6850] = 0xBD5D ^ 0x6850;
        ClickGuiSettings.F[0xC7D ^ 0xCB1] = 0xDE7F ^ 0xCB1;
        ClickGuiSettings.F[0xB3DE ^ 0xB3F1] = 0xFFFF4C07 ^ 0xB3F1;
        ClickGuiSettings.F[0x823C ^ 0x8369] = 0x8366 ^ 0x8369;
        ClickGuiSettings.F[0x34D3 ^ 0x34C3] = 0x7300 ^ 0x34C3;
        ClickGuiSettings.F[0x105E2 ^ 0x105BB] = 0xFFFEFA68 ^ 0x105BB;
        ClickGuiSettings.F[0x5017 ^ 0x5014] = 0x5047 ^ 0x5014;
        ClickGuiSettings.F[0x3B95 ^ 0x3AAC] = 0xEFA1 ^ 0x3AAC;
        ClickGuiSettings.F[0x1022 ^ 0x109D] = 0x7841 ^ 0x109D;
        ClickGuiSettings.F[0x53E9 ^ 0x5309] = 0x2A2 ^ 0x5309;
        ClickGuiSettings.F[0x40DB ^ 0x40F2] = 0x4063 ^ 0x40F2;
        ClickGuiSettings.F[0xD3BA ^ 0xD3F8] = 0xD3AA ^ 0xD3F8;
        ClickGuiSettings.F[0xF986 ^ 0xF801] = 0xF801 ^ 0xF801;
        ClickGuiSettings.F[0x490 ^ 0x5FA] = 0x581 ^ 0x5FA;
        ClickGuiSettings.F[0x3768 ^ 0x3714] = 0xD414 ^ 0x3714;
        ClickGuiSettings.F[0xE819 ^ 0xE878] = 0xE876 ^ 0xE878;
        ClickGuiSettings.F[0xB087 ^ 0xB0B2] = 0xFFFF4FDF ^ 0xB0B2;
        ClickGuiSettings.F[0xD409 ^ 0xD45A] = 0xD451 ^ 0xD45A;
        ClickGuiSettings.F[0x2C93 ^ 0x2D13] = 0x412A ^ 0x2D13;
        ClickGuiSettings.F[0xB4BE ^ 0xB4D4] = 0xFFFF4B64 ^ 0xB4D4;
        ClickGuiSettings.F[0x1EFA ^ 0x1F85] = 0xEB52 ^ 0x1F85;
        ClickGuiSettings.F[0x1880 ^ 0x18B3] = 0xFFFFE769 ^ 0x18B3;
        ClickGuiSettings.F[0x192A ^ 0x1838] = 0xFFFF7901 ^ 0x1838;
        ClickGuiSettings.F[0x12EA ^ 0x1277] = 0x8CDF ^ 0x1277;
        ClickGuiSettings.F[0x8290 ^ 0x82F8] = 0xFFFF7D9E ^ 0x82F8;
        ClickGuiSettings.F[0xC9A4 ^ 0xC8A2] = 0xFFFF8A74 ^ 0xC8A2;
        ClickGuiSettings.F[0xD03B ^ 0xD1BA] = 0x4061 ^ 0xD1BA;
        ClickGuiSettings.F[0xF65 ^ 0xF76] = 0xAD10 ^ 0xF76;
        ClickGuiSettings.F[0x1929 ^ 0x192C] = 0x1917 ^ 0x192C;
        ClickGuiSettings.F[0xF595 ^ 0xF517] = 0x2E46 ^ 0xF517;
        ClickGuiSettings.F[0x4B55 ^ 0x4A25] = 0x4B25 ^ 0x4A25;
        ClickGuiSettings.F[0xFF38 ^ 0xFE57] = 0xFE4E ^ 0xFE57;
        ClickGuiSettings.F[0x99D8 ^ 0x9996] = 0xFFFF661C ^ 0x9996;
        ClickGuiSettings.F[0x1591 ^ 0x1528] = 0x1528 ^ 0x1528;
        ClickGuiSettings.F[0xE2E8 ^ 0xE3F1] = 0xF3BD ^ 0xE3F1;
        ClickGuiSettings.F[0xB97A ^ 0xB82A] = 0xB81B ^ 0xB82A;
        ClickGuiSettings.F[0x3E8B ^ 0x3F9C] = 0xD399 ^ 0x3F9C;
        ClickGuiSettings.F[0xEC06 ^ 0xECA4] = 0xD087 ^ 0xECA4;
        ClickGuiSettings.F[0x63BA ^ 0x6291] = 0xCED3 ^ 0x6291;
        ClickGuiSettings.F[0x5BE2 ^ 0x5A8C] = 0x5AA4 ^ 0x5A8C;
        ClickGuiSettings.F[0x73A7 ^ 0x73B0] = 0x5644 ^ 0x73B0;
        ClickGuiSettings.F[0x921C ^ 0x9328] = 0xF34B ^ 0x9328;
        ClickGuiSettings.F[0x1030 ^ 0x10EC] = 0x9F35 ^ 0x10EC;
        ClickGuiSettings.F[0x69A9 ^ 0x6956] = 0x1028 ^ 0x6956;
        ClickGuiSettings.F[0xD721 ^ 0xD716] = 0xD75D ^ 0xD716;
        ClickGuiSettings.F[0x31AC ^ 0x30E9] = 0x9841 ^ 0x30E9;
        ClickGuiSettings.F[0x2645 ^ 0x269E] = 0xDA10 ^ 0x269E;
        ClickGuiSettings.F[0xB8C8 ^ 0xB8E8] = 0xFFFF475B ^ 0xB8E8;
        ClickGuiSettings.F[0xC0D8 ^ 0xC1FD] = 0x49AC ^ 0xC1FD;
        ClickGuiSettings.F[0x4CFE ^ 0x4C39] = 0x4B31 ^ 0x4C39;
        ClickGuiSettings.F[0x253F ^ 0x2452] = 0x245A ^ 0x2452;
        ClickGuiSettings.F[0x3E06 ^ 0x3E61] = 0xFFFFC1C1 ^ 0x3E61;
        ClickGuiSettings.F[0x107A9 ^ 0x10782] = 0xFFFEF845 ^ 0x10782;
        ClickGuiSettings.F[0x606F ^ 0x60FC] = 0xED66 ^ 0x60FC;
        ClickGuiSettings.F[0x86E6 ^ 0x87A1] = 0x6EFB ^ 0x87A1;
        ClickGuiSettings.F[0xCF67 ^ 0xCF41] = 0xFFFF306F ^ 0xCF41;
        ClickGuiSettings.F[0x128F ^ 0x1242] = 0xC098 ^ 0x1242;
        ClickGuiSettings.F[0xB306 ^ 0xB3B6] = 0x74DD ^ 0xB3B6;
        ClickGuiSettings.F[0xC1E6 ^ 0xC1A0] = 0xC1A6 ^ 0xC1A0;
        ClickGuiSettings.F[0x6889 ^ 0x6806] = 0xFFFF310F ^ 0x6806;
        ClickGuiSettings.F[0x49E ^ 0x446] = 0xF8C3 ^ 0x446;
        ClickGuiSettings.F[0x5138 ^ 0x51FA] = 0xFFFF4082 ^ 0x51FA;
        ClickGuiSettings.F[0x50A1 ^ 0x5058] = 0x7004 ^ 0x5058;
        ClickGuiSettings.F[0xC751 ^ 0xC638] = 0xC63A ^ 0xC638;
        ClickGuiSettings.F[0x51A4 ^ 0x5150] = 0xB8BC ^ 0x5150;
        ClickGuiSettings.F[0x5EBA ^ 0x5F85] = 0x5F84 ^ 0x5F85;
        ClickGuiSettings.F[0x9EA ^ 0x893] = 0xCD3F ^ 0x893;
        ClickGuiSettings.F[0x109AC ^ 0x10954] = 0x12901 ^ 0x10954;
        ClickGuiSettings.F[0x6729 ^ 0x665D] = 0x9BBF ^ 0x665D;
        ClickGuiSettings.F[0x3E98 ^ 0x3F8B] = 0xA143 ^ 0x3F8B;
        ClickGuiSettings.F[0x23FA ^ 0x22DA] = 0x568E ^ 0x22DA;
        ClickGuiSettings.F[0xD0F1 ^ 0xD0EE] = 0xFFFF2F22 ^ 0xD0EE;
        ClickGuiSettings.F[0x6D71 ^ 0x6C3F] = 0x6C2F ^ 0x6C3F;
        ClickGuiSettings.F[0xDAD0 ^ 0xDAA6] = 0xDAA6 ^ 0xDAA6;
        ClickGuiSettings.F[0x680E ^ 0x6987] = 0xE2A6 ^ 0x6987;
        ClickGuiSettings.F[0x8E13 ^ 0x8E0F] = 0x8E0F ^ 0x8E0F;
        ClickGuiSettings.F[0x46FC ^ 0x468E] = 0x468C ^ 0x468E;
        ClickGuiSettings.F[0x75A3 ^ 0x75C1] = 0x75F6 ^ 0x75C1;
        ClickGuiSettings.F[0xFDA ^ 0xF90] = 0xFFFFF028 ^ 0xF90;
        ClickGuiSettings.F[0x88CB ^ 0x89C1] = 0x1A9A ^ 0x89C1;
        ClickGuiSettings.F[0xF65D ^ 0xF71D] = 0xF71D ^ 0xF71D;
        ClickGuiSettings.F[0x577 ^ 0x545] = 0xFFFFFAE7 ^ 0x545;
        ClickGuiSettings.F[0xB4A ^ 0xB71] = 0xBFF ^ 0xB71;
        ClickGuiSettings.F[0x514B ^ 0x503A] = 0x5038 ^ 0x503A;
        ClickGuiSettings.F[0x59C ^ 0x5E9] = 0x5E8 ^ 0x5E9;
        ClickGuiSettings.F[0x1A34 ^ 0x1AA0] = 0x9775 ^ 0x1AA0;
        ClickGuiSettings.F[0x10B7B ^ 0x10B5F] = 0x10B68 ^ 0x10B5F;
        ClickGuiSettings.F[0x405F ^ 0x4047] = 0x3A12 ^ 0x4047;
        ClickGuiSettings.F[0xA295 ^ 0xA3A8] = 0xA3A8 ^ 0xA3A8;
        ClickGuiSettings.F[0x6AF2 ^ 0x6B9A] = 0x6BA2 ^ 0x6B9A;
        ClickGuiSettings.F[0x37BC ^ 0x3729] = 0xECEB ^ 0x3729;
        ClickGuiSettings.F[0x523C ^ 0x5322] = 0xFFFF03B6 ^ 0x5322;
        ClickGuiSettings.F[0x8E05 ^ 0x8F0D] = 0x1C4B ^ 0x8F0D;
        ClickGuiSettings.F[0xBCBE ^ 0xBDB2] = 0x1A5D ^ 0xBDB2;
        ClickGuiSettings.F[0xC1F1 ^ 0xC0C0] = 0x699 ^ 0xC0C0;
        ClickGuiSettings.F[0xFBE0 ^ 0xFB23] = 0x15DB ^ 0xFB23;
        ClickGuiSettings.F[0x20A9 ^ 0x2007] = 0xE76C ^ 0x2007;
        ClickGuiSettings.F[0xDA72 ^ 0xDA94] = 0xFFFF6154 ^ 0xDA94;
        ClickGuiSettings.F[0xAD6E ^ 0xAC19] = 0x6D33 ^ 0xAC19;
        ClickGuiSettings.F[0x6004 ^ 0x60FE] = 0x40C8 ^ 0x60FE;
        ClickGuiSettings.F[0x1D59 ^ 0x1D65] = 0x1D60 ^ 0x1D65;
        ClickGuiSettings.F[0x10AAA ^ 0x10AA5] = 0x1A7C6 ^ 0x10AA5;
        ClickGuiSettings.F[0x1AF4 ^ 0x1A5C] = 0xEFEC ^ 0x1A5C;
        ClickGuiSettings.F[0x1011E ^ 0x10151] = 0x10128 ^ 0x10151;
        ClickGuiSettings.F[0xE789 ^ 0xE77B] = 0xB91A ^ 0xE77B;
        ClickGuiSettings.F[0x7571 ^ 0x7443] = 0xFFFF4DB1 ^ 0x7443;
        ClickGuiSettings.F[0x91BE ^ 0x9157] = 0xC88F ^ 0x9157;
        ClickGuiSettings.F[0x39E6 ^ 0x39A1] = 0xFFFFC611 ^ 0x39A1;
        ClickGuiSettings.F[0x9C42 ^ 0x9CDE] = 0x7E2C ^ 0x9CDE;
        ClickGuiSettings.F[0x7A8E ^ 0x7A95] = 0xDEC8 ^ 0x7A95;
        ClickGuiSettings.F[0x6DBD ^ 0x6D1C] = 0x5130 ^ 0x6D1C;
        ClickGuiSettings.F[0x9DD7 ^ 0x9DF0] = 0x9D81 ^ 0x9DF0;
        ClickGuiSettings.F[0x2FAB ^ 0x2F5E] = 0xC6BE ^ 0x2F5E;
        ClickGuiSettings.F[0x6429 ^ 0x6407] = 0xFFFF9B8F ^ 0x6407;
        ClickGuiSettings.F[0xC8D ^ 0xC53] = 0xFFFF7C20 ^ 0xC53;
        ClickGuiSettings.F[0x77C9 ^ 0x769A] = 0x7696 ^ 0x769A;
        ClickGuiSettings.F[0xB55F ^ 0xB40D] = 0xFFFF4BE3 ^ 0xB40D;
        ClickGuiSettings.F[0x10BA8 ^ 0x10AF7] = 0x10AF3 ^ 0x10AF7;
        ClickGuiSettings.F[0x9927 ^ 0x9978] = 0x9937 ^ 0x9978;
        ClickGuiSettings.F[0x1BB5 ^ 0x1BEE] = 0xFFFFE43B ^ 0x1BEE;
        ClickGuiSettings.F[0x632 ^ 0x76F] = 0x76F ^ 0x76F;
        ClickGuiSettings.F[0x5A47 ^ 0x5BC2] = 0x5BD2 ^ 0x5BC2;
        ClickGuiSettings.F[0xB99B ^ 0xB8EE] = 0xB68C ^ 0xB8EE;
        ClickGuiSettings.F[0x7D9F ^ 0x7C82] = 0xD38F ^ 0x7C82;
        ClickGuiSettings.F[0x4035 ^ 0x41B3] = 0x41B0 ^ 0x41B3;
        ClickGuiSettings.F[0x13F5 ^ 0x13DD] = 0x13BF ^ 0x13DD;
        ClickGuiSettings.F[0x6D9D ^ 0x6C10] = 0x7499 ^ 0x6C10;
        ClickGuiSettings.F[0x33F1 ^ 0x33F1] = 0xFFFFCC77 ^ 0x33F1;
        ClickGuiSettings.F[0xFD55 ^ 0xFDED] = 0x1E3D ^ 0xFDED;
        ClickGuiSettings.F[0x7B89 ^ 0x7B9F] = 0x352E ^ 0x7B9F;
        ClickGuiSettings.F[0xD3AE ^ 0xD284] = 0xFFFF812F ^ 0xD284;
        ClickGuiSettings.F[0xECC3 ^ 0xEDC0] = 0xA32C ^ 0xEDC0;
        ClickGuiSettings.F[0xBC0B ^ 0xBCD4] = 0x3310 ^ 0xBCD4;
        ClickGuiSettings.F[0x16C1 ^ 0x1617] = 0x76DF ^ 0x1617;
        ClickGuiSettings.F[0x5378 ^ 0x532F] = 0xFFFFAC86 ^ 0x532F;
        ClickGuiSettings.F[0x103CC ^ 0x103B7] = 0x1E08B ^ 0x103B7;
        ClickGuiSettings.F[0xE1F0 ^ 0xE08D] = 0xA4D8 ^ 0xE08D;
        ClickGuiSettings.F[0xDC61 ^ 0xDD02] = 0xDD09 ^ 0xDD02;
        ClickGuiSettings.F[0xFFE3 ^ 0xFF90] = 0xFF90 ^ 0xFF90;
        ClickGuiSettings.F[0xE3E3 ^ 0xE322] = 0xDDA ^ 0xE322;
        ClickGuiSettings.F[0x7032 ^ 0x7023] = 0x4506 ^ 0x7023;
        ClickGuiSettings.F[0x46C0 ^ 0x465E] = 0xD8FE ^ 0x465E;
        ClickGuiSettings.F[0xBD41 ^ 0xBD7C] = 0xBD07 ^ 0xBD7C;
        ClickGuiSettings.F[0x1013A ^ 0x101C1] = 0x1219D ^ 0x101C1;
        ClickGuiSettings.F[0x816 ^ 0x8C3] = 0x680D ^ 0x8C3;
        ClickGuiSettings.F[0xA5A7 ^ 0xA5E2] = 0xA5D1 ^ 0xA5E2;
        ClickGuiSettings.F[0x9F2 ^ 0x9F0] = 0xFFFFF626 ^ 0x9F0;
        ClickGuiSettings.F[0x7215 ^ 0x72E2] = 0x9B02 ^ 0x72E2;
        ClickGuiSettings.F[0xC7BE ^ 0xC6B9] = 0x7BE6 ^ 0xC6B9;
        ClickGuiSettings.F[0x5887 ^ 0x59CD] = 0xE6E3 ^ 0x59CD;
        ClickGuiSettings.F[0xB53A ^ 0xB40F] = 0xD470 ^ 0xB40F;
        ClickGuiSettings.F[0xACA2 ^ 0xADD8] = 0x2FAC ^ 0xADD8;
        ClickGuiSettings.F[0x6C48 ^ 0x6D19] = 0x6D18 ^ 0x6D19;
        ClickGuiSettings.F[0x5FAF ^ 0x5F05] = 0xC0E1 ^ 0x5F05;
        ClickGuiSettings.F[0xC1D7 ^ 0xC145] = 0x4C90 ^ 0xC145;
        ClickGuiSettings.F[0x3393 ^ 0x33F5] = 0x3388 ^ 0x33F5;
        ClickGuiSettings.F[0xEE1D ^ 0xEE11] = 0xEE11 ^ 0xEE11;
        ClickGuiSettings.F[0x2E32 ^ 0x2E79] = 0xFFFFD181 ^ 0x2E79;
        ClickGuiSettings.F[0x63B2 ^ 0x633B] = 0x338F ^ 0x633B;
        ClickGuiSettings.F[0xFE93 ^ 0xFEED] = 0x941C ^ 0xFEED;
        ClickGuiSettings.F[0x8554 ^ 0x85E3] = 0x6649 ^ 0x85E3;
        ClickGuiSettings.F[0x5D02 ^ 0x5D78] = 0xBE78 ^ 0x5D78;
        ClickGuiSettings.F[0x7A04 ^ 0x7A5C] = 0x7A66 ^ 0x7A5C;
        ClickGuiSettings.F[0x28EB ^ 0x29AD] = 0x8DF4 ^ 0x29AD;
        ClickGuiSettings.F[0xAE53 ^ 0xAEDB] = 0xC456 ^ 0xAEDB;
        ClickGuiSettings.F[0x947D ^ 0x9404] = 0x770F ^ 0x9404;
        ClickGuiSettings.F[0x32A1 ^ 0x3399] = 0xE68C ^ 0x3399;
        ClickGuiSettings.F[0x37C ^ 0x369] = 0x5344 ^ 0x369;
        ClickGuiSettings.F[0x105DC ^ 0x105D2] = 0x10613 ^ 0x105D2;
        ClickGuiSettings.F[0x870D ^ 0x8737] = 0x871A ^ 0x8737;
        ClickGuiSettings.F[0xC9A0 ^ 0xC94C] = 0x8431 ^ 0xC94C;
        ClickGuiSettings.F[0x27FD ^ 0x269D] = 0xFFFFD941 ^ 0x269D;
        ClickGuiSettings.F[0xB80 ^ 0xBDA] = 0xBDB ^ 0xBDA;
        ClickGuiSettings.F[0x10506 ^ 0x1044D] = 0x19F43 ^ 0x1044D;
        ClickGuiSettings.F[0xF846 ^ 0xF837] = 0xF836 ^ 0xF837;
        ClickGuiSettings.F[0x867D ^ 0x86DA] = 0xFFFF8C95 ^ 0x86DA;
        ClickGuiSettings.F[0xECB2 ^ 0xECD7] = 0xFFFF1331 ^ 0xECD7;
        ClickGuiSettings.F[0x8116 ^ 0x810F] = 0x9C79 ^ 0x810F;
        ClickGuiSettings.F[0xFA0A ^ 0xFB4E] = 0x9FFD ^ 0xFB4E;
        ClickGuiSettings.F[0xB4FF ^ 0xB445] = 0x142D ^ 0xB445;
        ClickGuiSettings.F[0xA5C4 ^ 0xA5A4] = 0xA5F9 ^ 0xA5A4;
        ClickGuiSettings.F[0x23D3 ^ 0x237F] = 0xBC9B ^ 0x237F;
        ClickGuiSettings.F[0x95D ^ 0x846] = 0x180A ^ 0x846;
        ClickGuiSettings.F[0x7A2F ^ 0x7A7B] = 0xFFFF85A0 ^ 0x7A7B;
        ClickGuiSettings.F[0x1078A ^ 0x107CE] = 0x107DB ^ 0x107CE;
        ClickGuiSettings.F[0xD864 ^ 0xD8C4] = 0x4664 ^ 0xD8C4;
        ClickGuiSettings.F[0xB975 ^ 0xB9AC] = 0x4522 ^ 0xB9AC;
        ClickGuiSettings.F[0x24F ^ 0x279] = 0x211 ^ 0x279;
        ClickGuiSettings.F[0x4D07 ^ 0x4DF4] = 0x1387 ^ 0x4DF4;
        ClickGuiSettings.F[0xE7E ^ 0xEDB] = 0xFB6E ^ 0xEDB;
        ClickGuiSettings.F[0x4750 ^ 0x4787] = 0x2749 ^ 0x4787;
        ClickGuiSettings.F[0x25C2 ^ 0x24E6] = 0xACB6 ^ 0x24E6;
        ClickGuiSettings.F[0x549 ^ 0x5B9] = 0x5BDD ^ 0x5B9;
        ClickGuiSettings.F[0xF4DA ^ 0xF475] = 0x3364 ^ 0xF475;
        ClickGuiSettings.F[0x205D ^ 0x20D6] = 0x7079 ^ 0x20D6;
        ClickGuiSettings.F[0xD8BC ^ 0xD8F1] = 0xD8EC ^ 0xD8F1;
        ClickGuiSettings.F[0x7C6A ^ 0x7D7A] = 0xE3BD ^ 0x7D7A;
        ClickGuiSettings.F[0x10CBC ^ 0x10C5F] = 0x15DF6 ^ 0x10C5F;
        ClickGuiSettings.F[0x634A ^ 0x636F] = 0xFFFF9CBB ^ 0x636F;
        ClickGuiSettings.F[0xCF71 ^ 0xCFC0] = 0x1C792 ^ 0xCFC0;
        ClickGuiSettings.F[0x10B57 ^ 0x10B33] = 0x10B0B ^ 0x10B33;
    }
}

