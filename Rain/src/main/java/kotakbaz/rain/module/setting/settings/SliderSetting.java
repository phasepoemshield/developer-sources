/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.setting.settings;

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
import kotakbaz.rain.module.setting.Setting;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/*
 * Signature claims super is kotakbaz.rain.module.setting.B<java.lang.Float>, not kotakbaz.rain.module.setting.Setting - discarding signature.
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0019\u0010\u0010\u00a8\u0006\u001a"}, d2={"Lkotakbaz/rain/module/setting/settings/SliderSetting;", "Lkotakbaz/rain/module/setting/Setting;", "", "", "name", "initialValue", "min", "max", "step", "<init>", "(Ljava/lang/String;FFFF)V", "raw", "", "setClamped", "(F)V", "progress", "()F", "Lkotlin/Function0;", "", "condition", "setVisible", "(Lkotlin/jvm/functions/Function0;)Lkotakbaz/rain/module/setting/settings/SliderSetting;", "F", "getMin", "getMax", "getStep", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nSliderSetting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SliderSetting.kt\nkotakbaz/rain/module/setting/settings/SliderSetting\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
public final class SliderSetting
extends Setting {
    private final float a;
    private final float A;
    private final float b;
    private static Object[] B;
    private static Object C;
    private static Object[] d;
    private static Object[] c;
    private static Object[] D;
    public static int[] e;

    public SliderSetting(@NotNull String name, float initialValue, float min, float max, float step) {
        int n2;
        long l2 = 7286578656927584179L;
        int n3 = e[0];
        n3 += e[1];
        Intrinsics.checkNotNullParameter(name, (String)B[n3 -= e[2]]);
        super(name, Float.valueOf(RangesKt.coerceIn(initialValue, min, max)));
        this.a = min;
        this.A = max;
        this.b = step;
        if (this.A >= this.a) {
            int n4 = e[3];
            n4 += e[4];
            n2 = n4 -= e[5];
        } else {
            int n5 = e[6];
            n5 -= e[7];
            n2 = n5 += e[8];
        }
        if (n2 == 0) {
            long l3 = l2;
            int n6 = e[9];
            n6 += e[10];
            l2 = l3 ^ (0L ^ l3) & -1L << (n6 += e[11]);
            int n7 = e[12];
            n7 += e[13];
            int n8 = e[15];
            n8 += e[16];
            String string = (String)B[n7 -= e[14]] + (String)B[n8 += e[17]];
            throw new IllegalArgumentException(string.toString());
        }
    }

    public /* synthetic */ SliderSetting(String string, float f2, float f3, float f4, float f5, int n2, DefaultConstructorMarker defaultConstructorMarker) {
        int n3 = e[18];
        n3 += e[19];
        if ((n2 & (n3 ^= e[20])) != 0) {
            f5 = 0.0f;
        }
        this(string, f2, f3, f4, f5);
    }

    public final float getMin() {
        return this.a;
    }

    public final float getMax() {
        return this.A;
    }

    public final float getStep() {
        return this.b;
    }

    public final void setClamped(float raw) {
        float f2 = RangesKt.coerceIn(raw, this.a, this.A);
        if (this.b > 0.0f) {
            float f3 = (float)Math.rint((f2 - this.a) / this.b);
            f2 = RangesKt.coerceIn(this.a + f3 * this.b, this.a, this.A);
        }
        this.set(Float.valueOf(f2));
    }

    public final float progress() {
        float f2 = this.A - this.a;
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        return RangesKt.coerceIn((((Number)this.getValue()).floatValue() - this.a) / f2, 0.0f, 1.0f);
    }

    @NotNull
    public SliderSetting setVisible(@NotNull Function0<Boolean> condition) {
        int n2 = e[21];
        n2 -= e[22];
        Intrinsics.checkNotNullParameter(condition, (String)B[n2 += e[23]]);
        super.setVisible(condition);
        return this;
    }

    static {
        SliderSetting.b();
        long l2 = 2208201176797028225L;
        long l3 = -8661654133337197758L;
        long l4 = 3657336271054555208L;
        long l5 = 163760285129023351L;
        long l6 = 5724964489259939409L;
        long l7 = 1923044094995203827L;
        long l8 = 4080769391727441039L;
        long l9 = -8621597451590477522L;
        long l10 = -25663633356428612L;
        long l11 = 3942042619746562220L;
        long l12 = -3965892022883493710L;
        long l13 = 3899357774805037166L;
        long l14 = 4750620173641773817L;
        long l15 = -8939250068544617301L;
        int n2 = e[24];
        n2 -= e[25];
        B = new Object[n2 -= e[26]];
        long l16 = l15;
        int n3 = e[27];
        n3 ^= e[28];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 += e[29]);
        Object[] objectArray = new Object[e[30]];
        objectArray[SliderSetting.e[31]] = c;
        objectArray[SliderSetting.e[32]] = e[33];
        int n4 = e[34];
        Object object = SliderSetting.A()[e[35]];
        if (object == null) {
            char[] cArray = "\u6f66\u69d3\u6f9a\u6f6c\u69c8\u69d5\u6a30\u6a30\u6aa7\u69e3\u6a37\u69e3\u6a3c\u6a30\u69e1\u6f9c\u698d\u6989\u69e3\u6f9a\u6a06\u6f9d\u6f4e\u69d0\u6f9d\u6980\u69d1\u6a3f\u6f6c\u69e2\u6f99\u69da\u69d1\u70ae\u69dd\u70a3\u7084\u6f4e\u698d\u69e2\u6aa7\u6aa7\u69df\u69d7\u6a28\u6f42\u6f66\u70a2\u69d0\u6f60\u70a2\u69d5\u6f9c\u6f69\u69d3\u6f6c\u69c4\u6a39\u69d3\u69e1\u6a35\u6a3b\u6a31\u6f99\u69c8\u6f9c\u6a3e\u6a33\u698d\u69d3\u6989\u6a24\u6a28\u6a14\u69d1\u69d2\u6a28\u6f99\u70a2\u6a39\u69e1\u6a3e\u6f66\u6a24\u6aa6\u69d2\u6f98\u6f98".toCharArray();
            for (int i2 = e[36]; i2 < e[37]; ++i2) {
                int n5 = cArray[i2];
                n5 += e[38];
                n5 ^= e[39];
                n5 ^= e[40];
                n5 -= e[41];
                n5 -= e[42];
                n5 += e[43];
                n5 ^= e[44];
                n5 -= e[45];
                n5 += e[46];
                n5 ^= e[47];
                n5 += e[48];
                n5 ^= e[49];
                n5 += e[50];
                n5 ^= e[51];
                cArray[i2] = (char)(n5 += e[52]);
            }
            object = SliderSetting.A()[SliderSetting.e[53]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)SliderSetting.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = e[54];
        n6 += e[55];
        l6 = l17 ^ (0x2700000000L ^ l17) & -1L << (n6 ^= e[56]);
        long l18 = l13;
        int n7 = e[57];
        n7 += e[58];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 -= e[59]);
        while (true) {
            int n8 = e[60];
            n8 ^= e[61];
            if ((int)l13 >= (int)(l6 >>> (n8 ^= e[62]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = e[63];
            n10 -= e[64];
            int n11 = e[66];
            n11 -= e[67];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 += e[65])) & -1L >>> (n11 -= e[68]);
            long l20 = l9;
            int n12 = e[69];
            n12 += e[70];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 ^= e[71]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = e[72];
            n14 -= e[73];
            int n15 = e[75];
            n15 -= e[76];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 -= e[74])) & -1L >>> (n15 -= e[77]);
            int n16 = e[78];
            n16 ^= e[79];
            long l22 = l10;
            int n17 = e[81];
            n17 += e[82];
            l10 = l22 ^ ((long)cArray[n13] << (n16 ^= e[80]) ^ l22) & -1L << (n17 += e[83]);
            int n18 = e[84];
            n18 += e[85];
            n18 -= e[86];
            int n19 = e[87];
            n19 -= e[88];
            long l23 = l12;
            int n20 = e[90];
            n20 += e[91];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 ^= e[89]))) ^ l23) & -1L >>> (n20 += e[92]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = e[93];
            n21 += e[94];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 -= e[95]);
            while (true) {
                int n22 = e[96];
                n22 ^= e[97];
                if ((int)(l14 >>> (n22 += e[98])) >= (int)l12) break;
                int n23 = e[99];
                n23 += e[100];
                int n24 = e[102];
                n24 ^= e[103];
                cArray2[(int)(l14 >>> (n23 ^= SliderSetting.e[101]))] = cArray[(int)l13 + (int)(l14 >>> (n24 ^= e[104]))];
                l14 += 0x100000000L;
            }
            int n25 = e[105];
            n25 ^= e[106];
            int n26 = (int)(l15 >>> (n25 -= e[107]));
            l15 += 0x100000000L;
            SliderSetting.B[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = e[108];
            n27 += e[109];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 += e[110]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[e[111]];
        String string = (String)object[e[112]];
        object = object[e[113]];
        Object[] objectArray = d;
        if (d == null) {
            objectArray = d = new Object[e[114]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[e[115]];
                c = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[e[117] ^ e[118]];
                byArray[SliderSetting.e[119] ^ SliderSetting.e[120]] = e[121] ^ e[122];
                byArray[SliderSetting.e[123] ^ SliderSetting.e[124]] = e[125] ^ e[126];
                byArray[SliderSetting.e[127] ^ SliderSetting.e[128]] = e[129] ^ e[130];
                byArray[SliderSetting.e[131] ^ SliderSetting.e[132]] = e[133] ^ e[134];
                byArray[SliderSetting.e[135] ^ SliderSetting.e[136]] = e[137] ^ e[138];
                byArray[SliderSetting.e[139] ^ SliderSetting.e[140]] = e[141] ^ e[142];
                byArray[SliderSetting.e[143] ^ SliderSetting.e[144]] = e[145] ^ e[146];
                byArray[SliderSetting.e[147] ^ SliderSetting.e[148]] = e[149] ^ e[150];
                byArray[SliderSetting.e[151] ^ SliderSetting.e[152]] = e[153] ^ e[154];
                byArray[SliderSetting.e[155] ^ SliderSetting.e[156]] = e[157] ^ e[158];
                byArray[SliderSetting.e[159] ^ SliderSetting.e[160]] = e[161] ^ e[162];
                byArray[SliderSetting.e[163] ^ SliderSetting.e[164]] = e[165] ^ e[166];
                byArray[SliderSetting.e[167] ^ SliderSetting.e[168]] = e[169] ^ e[170];
                byArray[SliderSetting.e[171] ^ SliderSetting.e[172]] = e[173] ^ e[174];
                byArray[SliderSetting.e[175] ^ SliderSetting.e[176]] = e[177] ^ e[178];
                byArray[SliderSetting.e[179] ^ SliderSetting.e[180]] = e[181] ^ e[182];
                objectArray2[SliderSetting.e[116]] = byArray;
            }
            byte[] byArray = (byte[])object3[e[183]];
            if (C == null) {
                byte[] byArray2 = new byte[e[184] ^ e[185]];
                byArray2[SliderSetting.e[186] ^ SliderSetting.e[187]] = e[188] ^ e[189];
                byArray2[SliderSetting.e[190] ^ SliderSetting.e[191]] = e[192] ^ e[193];
                byArray2[SliderSetting.e[194] ^ SliderSetting.e[195]] = e[196] ^ e[197];
                byArray2[SliderSetting.e[198] ^ SliderSetting.e[199]] = e[200] ^ e[201];
                byArray2[SliderSetting.e[202] ^ SliderSetting.e[203]] = e[204] ^ e[205];
                byArray2[SliderSetting.e[206] ^ SliderSetting.e[207]] = e[208] ^ e[209];
                byArray2[SliderSetting.e[210] ^ SliderSetting.e[211]] = e[212] ^ e[213];
                byArray2[SliderSetting.e[214] ^ SliderSetting.e[215]] = e[216] ^ e[217];
                byArray2[SliderSetting.e[218] ^ SliderSetting.e[219]] = e[220] ^ e[221];
                byArray2[SliderSetting.e[222] ^ SliderSetting.e[223]] = e[224] ^ e[225];
                byArray2[SliderSetting.e[226] ^ SliderSetting.e[227]] = e[228] ^ e[229];
                byArray2[SliderSetting.e[230] ^ SliderSetting.e[231]] = e[232] ^ e[233];
                byArray2[SliderSetting.e[234] ^ SliderSetting.e[235]] = e[236] ^ e[237];
                byArray2[SliderSetting.e[238] ^ SliderSetting.e[239]] = e[240] ^ e[241];
                byArray2[SliderSetting.e[242] ^ SliderSetting.e[243]] = e[244] ^ e[245];
                byArray2[SliderSetting.e[246] ^ SliderSetting.e[247]] = e[248] ^ e[249];
                byArray2[SliderSetting.e[250] ^ SliderSetting.e[251]] = e[252] ^ e[253];
                byArray2[SliderSetting.e[254] ^ SliderSetting.e[255]] = e[256] ^ e[257];
                byArray2[SliderSetting.e[258] ^ SliderSetting.e[259]] = e[260] ^ e[261];
                byArray2[SliderSetting.e[262] ^ SliderSetting.e[263]] = e[264] ^ e[265];
                byArray2[SliderSetting.e[266] ^ SliderSetting.e[267]] = e[268] ^ e[269];
                byArray2[SliderSetting.e[270] ^ SliderSetting.e[271]] = e[272] ^ e[273];
                byArray2[SliderSetting.e[274] ^ SliderSetting.e[275]] = e[276] ^ e[277];
                byArray2[SliderSetting.e[278] ^ SliderSetting.e[279]] = e[280] ^ e[281];
                byArray2[SliderSetting.e[282] ^ SliderSetting.e[283]] = e[284] ^ e[285];
                byArray2[SliderSetting.e[286] ^ SliderSetting.e[287]] = e[288] ^ e[289];
                byArray2[SliderSetting.e[290] ^ SliderSetting.e[291]] = e[292] ^ e[293];
                byArray2[SliderSetting.e[294] ^ SliderSetting.e[295]] = e[296] ^ e[297];
                byArray2[SliderSetting.e[298] ^ SliderSetting.e[299]] = e[300] ^ e[301];
                byArray2[SliderSetting.e[302] ^ SliderSetting.e[303]] = e[304] ^ e[305];
                byArray2[SliderSetting.e[306] ^ SliderSetting.e[307]] = e[308] ^ e[309];
                byArray2[SliderSetting.e[310] ^ SliderSetting.e[311]] = e[312] ^ e[313];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, e[314], byArray3, e[315], byArray.length);
                System.arraycopy(byArray2, e[316], byArray3, byArray.length, byArray2.length);
                Object object4 = SliderSetting.A()[e[317]];
                if (object4 == null) {
                    char[] cArray = "\u2d02\u2d04\u2d3d\u2d06\u2d08\u2d14\u2d39\u2ddb\u2dd6\u2d2a\u2d0a\u2ddf\u2d23\u2d25\u2d35\u2d0a\u2d03\u2d13".toCharArray();
                    for (int i2 = e[318]; i2 < e[319]; ++i2) {
                        int n3 = cArray[i2];
                        n3 += e[320];
                        n3 ^= e[321];
                        n3 ^= e[322];
                        n3 += e[323];
                        n3 -= e[324];
                        n3 -= e[325];
                        n3 -= e[326];
                        n3 += e[327];
                        n3 += e[328];
                        n3 += e[329];
                        n3 -= e[330];
                        n3 += e[331];
                        n3 ^= e[332];
                        cArray[i2] = (char)(n3 -= e[333]);
                    }
                    object4 = SliderSetting.A()[SliderSetting.e[334]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[e[335]];
                byArray4[SliderSetting.e[336]] = e[337];
                byArray4[SliderSetting.e[338]] = e[339];
                byArray4[SliderSetting.e[340]] = e[341];
                byArray4[SliderSetting.e[342]] = e[343];
                byArray4[SliderSetting.e[344]] = e[345];
                byArray4[SliderSetting.e[346]] = e[347];
                byArray4[SliderSetting.e[348]] = e[349];
                byArray4[SliderSetting.e[350]] = e[351];
                byArray4[SliderSetting.e[352]] = e[353];
                byArray4[SliderSetting.e[354]] = e[355];
                byArray4[SliderSetting.e[356]] = e[357];
                byArray4[SliderSetting.e[358]] = e[359];
                byArray4[SliderSetting.e[360]] = e[361];
                byArray4[SliderSetting.e[362]] = e[363];
                byArray4[SliderSetting.e[364]] = e[365];
                byArray4[SliderSetting.e[366]] = e[367];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, e[368], e[369]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = SliderSetting.A()[e[370]];
                if (object5 == null) {
                    char[] cArray = "\ua0a8\ua0ac\ua07e".toCharArray();
                    for (int i3 = e[371]; i3 < e[372]; ++i3) {
                        int n4 = cArray[i3];
                        n4 += e[373];
                        n4 ^= e[374];
                        n4 += e[375];
                        n4 ^= e[376];
                        n4 -= e[377];
                        n4 ^= e[378];
                        n4 -= e[379];
                        n4 -= e[380];
                        n4 += e[381];
                        n4 ^= e[382];
                        n4 += e[383];
                        cArray[i3] = (char)(n4 += e[384]);
                    }
                    object5 = SliderSetting.A()[SliderSetting.e[385]] = new String(cArray);
                }
                C = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, e[386], e[387]);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, e[388], byArray6.length);
            Object object6 = SliderSetting.A()[e[389]];
            if (object6 == null) {
                char[] cArray = "\u6b51\u6b4d\u6b23\u74a7\u6b53\u6b74\u6b53\u74a7\u6b42\u6b4b\u6b53\u6b23\u74bd\u6b42\u74f1\u74ee\u74ee\u74e9\u74e8\u74ef".toCharArray();
                for (int i4 = e[390]; i4 < e[391]; ++i4) {
                    int n5 = cArray[i4];
                    n5 ^= e[392];
                    n5 -= e[393];
                    n5 ^= e[394];
                    n5 ^= e[395];
                    n5 -= e[396];
                    n5 += e[397];
                    n5 -= e[398];
                    n5 -= e[399];
                    n5 -= 24694;
                    n5 ^= 0xB319;
                    n5 ^= 0x3399;
                    n5 ^= 0xCCBE;
                    n5 -= 9567;
                    cArray[i4] = (char)(n5 ^= 0x5CDF);
                }
                object6 = SliderSetting.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)C), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = D;
        if (D == null) {
            D = new Object[4];
            objectArray = D;
        }
        return objectArray;
    }

    public static void b() {
        e = new int[0xA25A ^ 0xA3CA];
        SliderSetting.e[0xE89E ^ 0xE884] = 0xE8CE ^ 0xE884;
        SliderSetting.e[0x1277 ^ 0x123B] = 0x1228 ^ 0x123B;
        SliderSetting.e[0xA723 ^ 0xA7A5] = 0x2FA4 ^ 0xA7A5;
        SliderSetting.e[0xA0D0 ^ 0xA092] = 0xFFFF5F77 ^ 0xA092;
        SliderSetting.e[0xE7AE ^ 0xE74F] = 0xBC9 ^ 0xE74F;
        SliderSetting.e[0x756 ^ 0x7FB] = 0x55 ^ 0x7FB;
        SliderSetting.e[0x89A8 ^ 0x899B] = 0x3F46 ^ 0x899B;
        SliderSetting.e[0x2932 ^ 0x29D8] = 0x5FE0 ^ 0x29D8;
        SliderSetting.e[0x44C ^ 0x55C] = 0x1F01 ^ 0x55C;
        SliderSetting.e[0x9A96 ^ 0x9BBD] = 0x9525 ^ 0x9BBD;
        SliderSetting.e[0xF509 ^ 0xF598] = 0xFFFFED9B ^ 0xF598;
        SliderSetting.e[0x46E2 ^ 0x4650] = 0x2EB3 ^ 0x4650;
        SliderSetting.e[0xE066 ^ 0xE107] = 0xFFFF1EE0 ^ 0xE107;
        SliderSetting.e[0xCADC ^ 0xCA18] = 0x36D0 ^ 0xCA18;
        SliderSetting.e[0x19F7 ^ 0x199D] = 0xFFFFE616 ^ 0x199D;
        SliderSetting.e[0xCE31 ^ 0xCE31] = 0xFFFF3162 ^ 0xCE31;
        SliderSetting.e[0x6C62 ^ 0x6D09] = 0x6D2A ^ 0x6D09;
        SliderSetting.e[0xF00F ^ 0xF026] = 0xDD60 ^ 0xF026;
        SliderSetting.e[0xF6C9 ^ 0xF748] = 0xF74A ^ 0xF748;
        SliderSetting.e[0x3433 ^ 0x3443] = 0x3441 ^ 0x3443;
        SliderSetting.e[0x2676 ^ 0x2649] = 0x2673 ^ 0x2649;
        SliderSetting.e[0xC534 ^ 0xC591] = 0xF0EA ^ 0xC591;
        SliderSetting.e[0xFC2D ^ 0xFD33] = 0x38A7 ^ 0xFD33;
        SliderSetting.e[0xFE46 ^ 0xFEDB] = 0x68C5 ^ 0xFEDB;
        SliderSetting.e[0x9819 ^ 0x98D0] = 0xB1CF ^ 0x98D0;
        SliderSetting.e[0xCCB8 ^ 0xCDF3] = 0x4604 ^ 0xCDF3;
        SliderSetting.e[0x677E ^ 0x6629] = 0xFFFF99FF ^ 0x6629;
        SliderSetting.e[0x7B7E ^ 0x7AFE] = 0x5DF1 ^ 0x7AFE;
        SliderSetting.e[0xC52D ^ 0xC578] = 0xC531 ^ 0xC578;
        SliderSetting.e[0x1530 ^ 0x1458] = 0x1452 ^ 0x1458;
        SliderSetting.e[0xD152 ^ 0xD192] = 0xFFFFC8C4 ^ 0xD192;
        SliderSetting.e[0x569B ^ 0x5625] = 0xB0B7 ^ 0x5625;
        SliderSetting.e[0x32D9 ^ 0x32F6] = 0xAC64 ^ 0x32F6;
        SliderSetting.e[0x3163 ^ 0x30EF] = 0x78E7 ^ 0x30EF;
        SliderSetting.e[0x2BC7 ^ 0x2A87] = 0xD987 ^ 0x2A87;
        SliderSetting.e[0x1E34 ^ 0x1E0F] = 0x1E48 ^ 0x1E0F;
        SliderSetting.e[0xB4F5 ^ 0xB5B3] = 0x21F4 ^ 0xB5B3;
        SliderSetting.e[0x3F75 ^ 0x3FD5] = 0xF95B ^ 0x3FD5;
        SliderSetting.e[0xCD25 ^ 0xCD34] = 0xFFFF32C1 ^ 0xCD34;
        SliderSetting.e[0xA3CC ^ 0xA349] = 0x2B73 ^ 0xA349;
        SliderSetting.e[0x136B ^ 0x1395] = 0x4823 ^ 0x1395;
        SliderSetting.e[0xDDEB ^ 0xDCF0] = 0x3F09 ^ 0xDCF0;
        SliderSetting.e[0xFB7C ^ 0xFBA2] = 0x1725 ^ 0xFBA2;
        SliderSetting.e[0x54CC ^ 0x5479] = 0x8811 ^ 0x5479;
        SliderSetting.e[0x5578 ^ 0x55EE] = 0x98FF ^ 0x55EE;
        SliderSetting.e[0xB084 ^ 0xB01A] = 0x264A ^ 0xB01A;
        SliderSetting.e[0xEA8E ^ 0xEA53] = 0x1526 ^ 0xEA53;
        SliderSetting.e[0xE4A1 ^ 0xE447] = 0xD0AB ^ 0xE447;
        SliderSetting.e[0xB2DD ^ 0xB2F6] = 0x8679 ^ 0xB2F6;
        SliderSetting.e[0x8A99 ^ 0x8BDB] = 0x1DFA ^ 0x8BDB;
        SliderSetting.e[0x6EC3 ^ 0x6F9A] = 0x6F9A ^ 0x6F9A;
        SliderSetting.e[0xF14 ^ 0xF0C] = 0xF6E ^ 0xF0C;
        SliderSetting.e[0x7611 ^ 0x7741] = 0x774A ^ 0x7741;
        SliderSetting.e[0xBA6E ^ 0xBB44] = 0xB5C1 ^ 0xBB44;
        SliderSetting.e[0x24DD ^ 0x24B1] = 0x24BD ^ 0x24B1;
        SliderSetting.e[0xD2FA ^ 0xD2B9] = 0xFFFF2D44 ^ 0xD2B9;
        SliderSetting.e[0xB519 ^ 0xB524] = 0xFFFF4ACC ^ 0xB524;
        SliderSetting.e[0xCE64 ^ 0xCF31] = 0xFFFF30BD ^ 0xCF31;
        SliderSetting.e[0x54FD ^ 0x55C8] = 0xB81D ^ 0x55C8;
        SliderSetting.e[0x4B97 ^ 0x4B7C] = 0x3D55 ^ 0x4B7C;
        SliderSetting.e[0x2B7E ^ 0x2BF3] = 0x60B8 ^ 0x2BF3;
        SliderSetting.e[0x109A3 ^ 0x1091C] = 0x1EF98 ^ 0x1091C;
        SliderSetting.e[0xB8F7 ^ 0xB87F] = 0x3B91 ^ 0xB87F;
        SliderSetting.e[0x55AF ^ 0x55CE] = 0xFFFFAA32 ^ 0x55CE;
        SliderSetting.e[0xDE82 ^ 0xDF94] = 0xA8DF ^ 0xDF94;
        SliderSetting.e[0x11EF ^ 0x1177] = 0x234E ^ 0x1177;
        SliderSetting.e[0x5DA3 ^ 0x5D13] = 0x35F0 ^ 0x5D13;
        SliderSetting.e[0x1E57 ^ 0x1F13] = 0x8B97 ^ 0x1F13;
        SliderSetting.e[0x624A ^ 0x633E] = 0x633D ^ 0x633E;
        SliderSetting.e[0x8913 ^ 0x8926] = 0x8926 ^ 0x8926;
        SliderSetting.e[0x2576 ^ 0x2448] = 0x2448 ^ 0x2448;
        SliderSetting.e[0x48D8 ^ 0x495F] = 0x494B ^ 0x495F;
        SliderSetting.e[0xD2BD ^ 0xD3CF] = 0xD3CD ^ 0xD3CF;
        SliderSetting.e[0xC058 ^ 0xC147] = 0x4D4 ^ 0xC147;
        SliderSetting.e[0x7F1E ^ 0x7E78] = 0x7E7B ^ 0x7E78;
        SliderSetting.e[0x1A58 ^ 0x1B79] = 0xDEEA ^ 0x1B79;
        SliderSetting.e[0x5726 ^ 0x573D] = 0xFFFFA883 ^ 0x573D;
        SliderSetting.e[0xAF0D ^ 0xAF75] = 0x6A81 ^ 0xAF75;
        SliderSetting.e[0xBFC ^ 0xBE2] = 0xBE1 ^ 0xBE2;
        SliderSetting.e[0x10C10 ^ 0x10CAB] = 0x15E9E ^ 0x10CAB;
        SliderSetting.e[0xF1FC ^ 0xF111] = 0x8738 ^ 0xF111;
        SliderSetting.e[0xDEFF ^ 0xDE9D] = 0xDED9 ^ 0xDE9D;
        SliderSetting.e[0x95A9 ^ 0x953D] = 0x582C ^ 0x953D;
        SliderSetting.e[0x31 ^ 0x141] = 0x152 ^ 0x141;
        SliderSetting.e[0x10495 ^ 0x1043E] = 0x10388 ^ 0x1043E;
        SliderSetting.e[0xBBD0 ^ 0xBAC2] = 0xAC38 ^ 0xBAC2;
        SliderSetting.e[0x610A ^ 0x6043] = 0x634C ^ 0x6043;
        SliderSetting.e[0xE676 ^ 0xE738] = 0xE739 ^ 0xE738;
        SliderSetting.e[0x113B ^ 0x1044] = 0x5228 ^ 0x1044;
        SliderSetting.e[0xC787 ^ 0xC7C1] = 0xFFFF383C ^ 0xC7C1;
        SliderSetting.e[0xEBEC ^ 0xEA6A] = 0xEA6A ^ 0xEA6A;
        SliderSetting.e[0x77CD ^ 0x77C5] = 0x77FA ^ 0x77C5;
        SliderSetting.e[0xD32E ^ 0xD27D] = 0xD247 ^ 0xD27D;
        SliderSetting.e[0x9057 ^ 0x90A4] = 0x69C9 ^ 0x90A4;
        SliderSetting.e[0x7775 ^ 0x767F] = 0x4D97 ^ 0x767F;
        SliderSetting.e[0xFCEE ^ 0xFD98] = 0x8E79 ^ 0xFD98;
        SliderSetting.e[0x7FD ^ 0x78A] = 0xC27E ^ 0x78A;
        SliderSetting.e[0x13A0 ^ 0x12D3] = 0x12D3 ^ 0x12D3;
        SliderSetting.e[0x10C5C ^ 0x10C91] = 0x1CF75 ^ 0x10C91;
        SliderSetting.e[0xC31A ^ 0xC3AB] = 0xFFFF54F6 ^ 0xC3AB;
        SliderSetting.e[0x9BDB ^ 0x9BA6] = 0x1E02 ^ 0x9BA6;
        SliderSetting.e[0x7CBB ^ 0x7DD4] = 0xFFFF8236 ^ 0x7DD4;
        SliderSetting.e[0x4113 ^ 0x41D4] = 0x68CB ^ 0x41D4;
        SliderSetting.e[0x65D9 ^ 0x648B] = 0x6483 ^ 0x648B;
        SliderSetting.e[0x7C8E ^ 0x7DB2] = 0x7DB2 ^ 0x7DB2;
        SliderSetting.e[0x92B6 ^ 0x93EA] = 0x93EB ^ 0x93EA;
        SliderSetting.e[0xB5D5 ^ 0xB574] = 0x738F ^ 0xB574;
        SliderSetting.e[0xAC03 ^ 0xAD32] = 0x7D07 ^ 0xAD32;
        SliderSetting.e[0x8FD9 ^ 0x8EC4] = 0x6D3D ^ 0x8EC4;
        SliderSetting.e[0x6D3 ^ 0x6B4] = 0xFFFFF919 ^ 0x6B4;
        SliderSetting.e[0xEDF6 ^ 0xECAE] = 0xECAA ^ 0xECAE;
        SliderSetting.e[0x880C ^ 0x88F0] = 0xFFFF1DA0 ^ 0x88F0;
        SliderSetting.e[0x151F ^ 0x15EF] = 0xFFFF66A8 ^ 0x15EF;
        SliderSetting.e[0x95DC ^ 0x94DD] = 0xCF61 ^ 0x94DD;
        SliderSetting.e[0x6E7D ^ 0x6E24] = 0x6E78 ^ 0x6E24;
        SliderSetting.e[0x7C55 ^ 0x7C70] = 0x7C28 ^ 0x7C70;
        SliderSetting.e[0x23 ^ 0x7B] = 0x3A ^ 0x7B;
        SliderSetting.e[0xE32E ^ 0xE217] = 0xA8D3 ^ 0xE217;
        SliderSetting.e[0xFF8B ^ 0xFF89] = 0xFFFF002C ^ 0xFF89;
        SliderSetting.e[0xFB69 ^ 0xFB39] = 0xFFFF04AE ^ 0xFB39;
        SliderSetting.e[0x35C5 ^ 0x3480] = 0x27A6 ^ 0x3480;
        SliderSetting.e[0xBFA7 ^ 0xBED9] = 0x1DE2 ^ 0xBED9;
        SliderSetting.e[0x53D7 ^ 0x5334] = 0xFDD5 ^ 0x5334;
        SliderSetting.e[0xBFCD ^ 0xBF79] = 0x630B ^ 0xBF79;
        SliderSetting.e[0x1ECC ^ 0x1ED8] = 0x1EA6 ^ 0x1ED8;
        SliderSetting.e[0x300E ^ 0x3005] = 0xFFFFCFC5 ^ 0x3005;
        SliderSetting.e[0xD276 ^ 0xD257] = 0xD257 ^ 0xD257;
        SliderSetting.e[0x8A01 ^ 0x8B33] = 0x66F1 ^ 0x8B33;
        SliderSetting.e[0x6EE2 ^ 0x6E7D] = 0xA8F1 ^ 0x6E7D;
        SliderSetting.e[0x58AB ^ 0x5892] = 0x580F ^ 0x5892;
        SliderSetting.e[0xF654 ^ 0xF6DD] = 0xFFFF8ACC ^ 0xF6DD;
        SliderSetting.e[0xA8E8 ^ 0xA829] = 0x4EAD ^ 0xA829;
        SliderSetting.e[0x3850 ^ 0x3802] = 0xFFFFC7D4 ^ 0x3802;
        SliderSetting.e[0x7E21 ^ 0x7E83] = 0xB80D ^ 0x7E83;
        SliderSetting.e[0x7F57 ^ 0x7E67] = 0xFFFF51FD ^ 0x7E67;
        SliderSetting.e[0x104FB ^ 0x1045D] = 0x13157 ^ 0x1045D;
        SliderSetting.e[0xBC4F ^ 0xBD75] = 0xBD75 ^ 0xBD75;
        SliderSetting.e[0xB138 ^ 0xB132] = 0xFFFF4EB4 ^ 0xB132;
        SliderSetting.e[0x10CFE ^ 0x10C91] = 0x10C90 ^ 0x10C91;
        SliderSetting.e[0x2E68 ^ 0x2F7F] = 0x5830 ^ 0x2F7F;
        SliderSetting.e[0xD1E5 ^ 0xD0E1] = 0x2682 ^ 0xD0E1;
        SliderSetting.e[0xF037 ^ 0xF06D] = 0xFFFF0FB8 ^ 0xF06D;
        SliderSetting.e[0x5C7A ^ 0x5C7E] = 0xFFFFA3D8 ^ 0x5C7E;
        SliderSetting.e[0xEEA4 ^ 0xEE86] = 0xEE84 ^ 0xEE86;
        SliderSetting.e[0x2C99 ^ 0x2DB7] = 0xFD8E ^ 0x2DB7;
        SliderSetting.e[0xBDD8 ^ 0xBD53] = 0xF62A ^ 0xBD53;
        SliderSetting.e[0x72C1 ^ 0x7209] = 0x5B19 ^ 0x7209;
        SliderSetting.e[0xF7CA ^ 0xF737] = 0x9D81 ^ 0xF737;
        SliderSetting.e[0x3A80 ^ 0x3B89] = 0x50D0 ^ 0x3B89;
        SliderSetting.e[0x5ACB ^ 0x5AC7] = 0x5AFF ^ 0x5AC7;
        SliderSetting.e[0x4AEA ^ 0x4ABD] = 0x4A00 ^ 0x4ABD;
        SliderSetting.e[0xB2A6 ^ 0xB2DA] = 0x3750 ^ 0xB2DA;
        SliderSetting.e[0xC3E6 ^ 0xC392] = 0xC392 ^ 0xC392;
        SliderSetting.e[0xF78 ^ 0xF48] = 0x427B ^ 0xF48;
        SliderSetting.e[0x4722 ^ 0x47A6] = 0xCFA7 ^ 0x47A6;
        SliderSetting.e[0x5AD9 ^ 0x5BD7] = 0x41C4 ^ 0x5BD7;
        SliderSetting.e[0x4EFE ^ 0x4E34] = 0x8DC4 ^ 0x4E34;
        SliderSetting.e[0x94C9 ^ 0x948E] = 0x94ED ^ 0x948E;
        SliderSetting.e[0x5668 ^ 0x5767] = 0x4D6A ^ 0x5767;
        SliderSetting.e[0xC33F ^ 0xC360] = 0xC369 ^ 0xC360;
        SliderSetting.e[0x2B28 ^ 0x2B1A] = 0x7C00 ^ 0x2B1A;
        SliderSetting.e[0x5FA0 ^ 0x5F7B] = 0xA00E ^ 0x5F7B;
        SliderSetting.e[0xA70F ^ 0xA7C9] = 0x8ECE ^ 0xA7C9;
        SliderSetting.e[0xB882 ^ 0xB8FB] = 0x7D6F ^ 0xB8FB;
        SliderSetting.e[0xA52C ^ 0xA5D3] = 0xFE6F ^ 0xA5D3;
        SliderSetting.e[0x358F ^ 0x340B] = 0x341B ^ 0x340B;
        SliderSetting.e[0x150A ^ 0x150B] = 0x1559 ^ 0x150B;
        SliderSetting.e[0x8189 ^ 0x81FB] = 0x81FA ^ 0x81FB;
        SliderSetting.e[0xFD59 ^ 0xFDDE] = 0x7E37 ^ 0xFDDE;
        SliderSetting.e[0x7A7A ^ 0x7AFA] = 0x8F51 ^ 0x7AFA;
        SliderSetting.e[0x3E38 ^ 0x3E2E] = 0xFFFFC1BA ^ 0x3E2E;
        SliderSetting.e[0xC18F ^ 0xC1E1] = 0xC1DC ^ 0xC1E1;
        SliderSetting.e[0x6C2D ^ 0x6D08] = 0x7D56 ^ 0x6D08;
        SliderSetting.e[0xA737 ^ 0xA7AB] = 0x31FB ^ 0xA7AB;
        SliderSetting.e[0x8726 ^ 0x87B6] = 0x6002 ^ 0x87B6;
        SliderSetting.e[0x12B4 ^ 0x1298] = 0x6168 ^ 0x1298;
        SliderSetting.e[0xC7F9 ^ 0xC6CA] = 0x2B1F ^ 0xC6CA;
        SliderSetting.e[0xB113 ^ 0xB17B] = 0xFFFF4E9F ^ 0xB17B;
        SliderSetting.e[0xA523 ^ 0xA50E] = 0xFDFF ^ 0xA50E;
        SliderSetting.e[0x792F ^ 0x7936] = 0x7922 ^ 0x7936;
        SliderSetting.e[0xB97 ^ 0xB04] = 0xC616 ^ 0xB04;
        SliderSetting.e[0x1F6 ^ 0xEF] = 0x77A0 ^ 0xEF;
        SliderSetting.e[0x7203 ^ 0x720D] = 0xFFFF8DCC ^ 0x720D;
        SliderSetting.e[0x2B3C ^ 0x2A56] = 0x2A58 ^ 0x2A56;
        SliderSetting.e[0xEDD1 ^ 0xEDE6] = 0xFFFF1250 ^ 0xEDE6;
        SliderSetting.e[0x3D5C ^ 0x3D85] = 0x4B42 ^ 0x3D85;
        SliderSetting.e[0x10196 ^ 0x100DB] = 0x14B24 ^ 0x100DB;
        SliderSetting.e[0x4EF3 ^ 0x4FCB] = 0x540 ^ 0x4FCB;
        SliderSetting.e[0xB7 ^ 0xD7] = 0xF7 ^ 0xD7;
        SliderSetting.e[0xEA17 ^ 0xEB70] = 0xFFFF14E8 ^ 0xEB70;
        SliderSetting.e[0xD1DF ^ 0xD0F0] = 0xC5 ^ 0xD0F0;
        SliderSetting.e[0xBB97 ^ 0xBB75] = 0x1599 ^ 0xBB75;
        SliderSetting.e[0x70C1 ^ 0x71D5] = 0xFFFF98AB ^ 0x71D5;
        SliderSetting.e[0x8152 ^ 0x814D] = 0x814D ^ 0x814D;
        SliderSetting.e[0x5942 ^ 0x5838] = 0x843C ^ 0x5838;
        SliderSetting.e[0x77F ^ 0x7D3] = 0x64 ^ 0x7D3;
        SliderSetting.e[0x2C13 ^ 0x2C6D] = 0xA9E7 ^ 0x2C6D;
        SliderSetting.e[0x4F1C ^ 0x4E1A] = 0x2556 ^ 0x4E1A;
        SliderSetting.e[0x1395 ^ 0x137B] = 0x9FE4 ^ 0x137B;
        SliderSetting.e[0x2EF1 ^ 0x2FED] = 0xFFFF3388 ^ 0x2FED;
        SliderSetting.e[0x20AD ^ 0x200A] = 0x29E ^ 0x200A;
        SliderSetting.e[0xB732 ^ 0xB6BB] = 0x9AB8 ^ 0xB6BB;
        SliderSetting.e[0x8CB5 ^ 0x8CB0] = 0xFFFF7332 ^ 0x8CB0;
        SliderSetting.e[0xF367 ^ 0xF247] = 0xFFFFC813 ^ 0xF247;
        SliderSetting.e[0xC1C ^ 0xD2A] = 0x47EE ^ 0xD2A;
        SliderSetting.e[0x916C ^ 0x914C] = 0x914D ^ 0x914C;
        SliderSetting.e[0x4897 ^ 0x4891] = 0xFFFFB7FC ^ 0x4891;
        SliderSetting.e[0xB6A8 ^ 0xB7A0] = 0xDCEE ^ 0xB7A0;
        SliderSetting.e[0xD249 ^ 0xD2BB] = 0x2BC9 ^ 0xD2BB;
        SliderSetting.e[0xA0CA ^ 0xA051] = 0x360B ^ 0xA051;
        SliderSetting.e[0x270F ^ 0x27F8] = 0x6409 ^ 0x27F8;
        SliderSetting.e[0x8E5B ^ 0x8F72] = 0x8838 ^ 0x8F72;
        SliderSetting.e[0x8622 ^ 0x8768] = 0x501C ^ 0x8768;
        SliderSetting.e[0x781D ^ 0x780A] = 0x7867 ^ 0x780A;
        SliderSetting.e[0xE54F ^ 0xE583] = 0xFFFFD9B9 ^ 0xE583;
        SliderSetting.e[0x6BDD ^ 0x6BDE] = 0xFFFF9403 ^ 0x6BDE;
        SliderSetting.e[0xBF99 ^ 0xBF0E] = 0x8D3E ^ 0xBF0E;
        SliderSetting.e[0x6DF4 ^ 0x6CD3] = 0x6B99 ^ 0x6CD3;
        SliderSetting.e[0x84F7 ^ 0x84A6] = 0x8433 ^ 0x84A6;
        SliderSetting.e[0x8087 ^ 0x81A3] = 0x91E3 ^ 0x81A3;
        SliderSetting.e[0x685B ^ 0x688E] = 0x41F ^ 0x688E;
        SliderSetting.e[0xE33A ^ 0xE256] = 0xE250 ^ 0xE256;
        SliderSetting.e[0xF1E2 ^ 0xF15E] = 0xFFFF5CF7 ^ 0xF15E;
        SliderSetting.e[0x5B21 ^ 0x5AAC] = 0xC0A5 ^ 0x5AAC;
        SliderSetting.e[0xD7B3 ^ 0xD73C] = 0x308D ^ 0xD73C;
        SliderSetting.e[0xE289 ^ 0xE26E] = 0xD69B ^ 0xE26E;
        SliderSetting.e[0xA46B ^ 0xA573] = 0xD217 ^ 0xA573;
        SliderSetting.e[0x761 ^ 0x7DC] = 0x55E9 ^ 0x7DC;
        SliderSetting.e[0x109E4 ^ 0x10936] = 0x165AF ^ 0x10936;
        SliderSetting.e[0xB35C ^ 0xB259] = 0x4472 ^ 0xB259;
        SliderSetting.e[0x6DB1 ^ 0x6CF6] = 0x2331 ^ 0x6CF6;
        SliderSetting.e[0xCC64 ^ 0xCCF1] = 0xFFFFFE42 ^ 0xCCF1;
        SliderSetting.e[0x74FD ^ 0x75AB] = 0x75A6 ^ 0x75AB;
        SliderSetting.e[0x6B2C ^ 0x6A48] = 0x6A44 ^ 0x6A48;
        SliderSetting.e[0x35A1 ^ 0x34F5] = 0x34FC ^ 0x34F5;
        SliderSetting.e[0x1709 ^ 0x167E] = 0xBB1A ^ 0x167E;
        SliderSetting.e[0xF08A ^ 0xF048] = 0xCF3 ^ 0xF048;
        SliderSetting.e[0x98C6 ^ 0x99BB] = 0xE9BC ^ 0x99BB;
        SliderSetting.e[0x1664 ^ 0x1681] = 0xB860 ^ 0x1681;
        SliderSetting.e[0x9594 ^ 0x94B9] = 0x9A21 ^ 0x94B9;
        SliderSetting.e[0xEE9D ^ 0xEFE6] = 0xA043 ^ 0xEFE6;
        SliderSetting.e[0x71F6 ^ 0x70C9] = 0x70DB ^ 0x70C9;
        SliderSetting.e[0x71DA ^ 0x70F2] = 0xFFFF881F ^ 0x70F2;
        SliderSetting.e[0x3547 ^ 0x3507] = 0x3537 ^ 0x3507;
        SliderSetting.e[0x8BBF ^ 0x8B8B] = 0xA7D4 ^ 0x8B8B;
        SliderSetting.e[0x5515 ^ 0x554B] = 0xFFFFAACD ^ 0x554B;
        SliderSetting.e[0x164D ^ 0x1628] = 0x1633 ^ 0x1628;
        SliderSetting.e[0x4959 ^ 0x48DB] = 0x48DB ^ 0x48DB;
        SliderSetting.e[0x2135 ^ 0x21EA] = 0xCD6C ^ 0x21EA;
        SliderSetting.e[0xBCAE ^ 0xBD93] = 0xBD92 ^ 0xBD93;
        SliderSetting.e[0x5BF ^ 0x587] = 0x58C ^ 0x587;
        SliderSetting.e[0xA648 ^ 0xA6D1] = 0xFFFF6B18 ^ 0xA6D1;
        SliderSetting.e[0x1CAD ^ 0x1DF2] = 0xFFFFE201 ^ 0x1DF2;
        SliderSetting.e[0x15E ^ 0x10D] = 0xFFFFFEB8 ^ 0x10D;
        SliderSetting.e[0x88CE ^ 0x882A] = 0xFFFFD91C ^ 0x882A;
        SliderSetting.e[0x6EB6 ^ 0x6EC5] = 0x6EC4 ^ 0x6EC5;
        SliderSetting.e[0x268 ^ 0x29E] = 0x4161 ^ 0x29E;
        SliderSetting.e[0xB65C ^ 0xB731] = 0xFFFF48D6 ^ 0xB731;
        SliderSetting.e[0x73AB ^ 0x7290] = 0x7290 ^ 0x7290;
        SliderSetting.e[0xB053 ^ 0xB0D9] = 0x3337 ^ 0xB0D9;
        SliderSetting.e[0xC0C5 ^ 0xC03C] = 0x83CD ^ 0xC03C;
        SliderSetting.e[0x414 ^ 0x4EF] = 0x6E59 ^ 0x4EF;
        SliderSetting.e[0xB51B ^ 0xB57F] = 0xFFFF4A90 ^ 0xB57F;
        SliderSetting.e[0xA980 ^ 0xA9FF] = 0x5C58 ^ 0xA9FF;
        SliderSetting.e[0xBE51 ^ 0xBFDE] = 0x994A ^ 0xBFDE;
        SliderSetting.e[0x1EC9 ^ 0x1E3D] = 0xFFFF18C7 ^ 0x1E3D;
        SliderSetting.e[0x9991 ^ 0x9942] = 0xF5D3 ^ 0x9942;
        SliderSetting.e[0xFF06 ^ 0xFFEA] = 0x89BB ^ 0xFFEA;
        SliderSetting.e[0x6F0D ^ 0x6FDB] = 0x1917 ^ 0x6FDB;
        SliderSetting.e[0xDA76 ^ 0xDAA1] = 0xAC66 ^ 0xDAA1;
        SliderSetting.e[0xE020 ^ 0xE03D] = 0xFFFF1F94 ^ 0xE03D;
        SliderSetting.e[0x73CD ^ 0x73FB] = 0x738E ^ 0x73FB;
        SliderSetting.e[0x7DD1 ^ 0x7D79] = 0x5FE5 ^ 0x7D79;
        SliderSetting.e[0x1570 ^ 0x1534] = 0xFFFFEAFC ^ 0x1534;
        SliderSetting.e[0x4C3 ^ 0x423] = 0xE8F7 ^ 0x423;
        SliderSetting.e[0xC16B ^ 0xC071] = 0x2393 ^ 0xC071;
        SliderSetting.e[0x9107 ^ 0x9172] = 0x250 ^ 0x9172;
        SliderSetting.e[0xD9F0 ^ 0xD8F7] = 0xB3AE ^ 0xD8F7;
        SliderSetting.e[0x43DC ^ 0x435F] = 0xCB5A ^ 0x435F;
        SliderSetting.e[0xEFF ^ 0xEF2] = 0xFFFFF17E ^ 0xEF2;
        SliderSetting.e[0xEBBC ^ 0xEA88] = 0xFFFFF883 ^ 0xEA88;
        SliderSetting.e[0xB391 ^ 0xB3DA] = 0xB3BB ^ 0xB3DA;
        SliderSetting.e[0xEA94 ^ 0xEA5F] = 0x29BB ^ 0xEA5F;
        SliderSetting.e[0xA4DA ^ 0xA4F4] = 0xB5A6 ^ 0xA4F4;
        SliderSetting.e[0x12AC ^ 0x1222] = 0x5956 ^ 0x1222;
        SliderSetting.e[0xB9B8 ^ 0xB968] = 0x8719 ^ 0xB968;
        SliderSetting.e[0x36CD ^ 0x3793] = 0x3791 ^ 0x3793;
        SliderSetting.e[0xE739 ^ 0xE729] = 0xFFFF18E5 ^ 0xE729;
        SliderSetting.e[0xB872 ^ 0xB833] = 0xFFFF47C4 ^ 0xB833;
        SliderSetting.e[0x7F3A ^ 0x7E39] = 0x8812 ^ 0x7E39;
        SliderSetting.e[0xF890 ^ 0xF81C] = 0xB368 ^ 0xF81C;
        SliderSetting.e[0x1578 ^ 0x15DC] = 0x20D6 ^ 0x15DC;
        SliderSetting.e[0xAAD6 ^ 0xAAFC] = 0xDBF1 ^ 0xAAFC;
        SliderSetting.e[0xC41B ^ 0xC590] = 0x3EB8 ^ 0xC590;
        SliderSetting.e[0xE8EA ^ 0xE9F9] = 0xFF13 ^ 0xE9F9;
        SliderSetting.e[0xAD15 ^ 0xADDA] = 0x93B8 ^ 0xADDA;
        SliderSetting.e[0xA095 ^ 0xA110] = 0xA113 ^ 0xA110;
        SliderSetting.e[0x1759 ^ 0x16D7] = 0x2603 ^ 0x16D7;
        SliderSetting.e[0xC961 ^ 0xC908] = 0xFFFF3693 ^ 0xC908;
        SliderSetting.e[0xB8AF ^ 0xB98C] = 0xA9D2 ^ 0xB98C;
        SliderSetting.e[0x12ED ^ 0x1388] = 0xFFFFEC64 ^ 0x1388;
        SliderSetting.e[0xA96B ^ 0xA9C2] = 0x8B7C ^ 0xA9C2;
        SliderSetting.e[0x149F ^ 0x1593] = 0x2E57 ^ 0x1593;
        SliderSetting.e[0x5475 ^ 0x549D] = 0xFFFF9FD2 ^ 0x549D;
        SliderSetting.e[0xC8E9 ^ 0xC827] = 0xF659 ^ 0xC827;
        SliderSetting.e[0x6B5D ^ 0x6B63] = 0x6B1D ^ 0x6B63;
        SliderSetting.e[0x5A2B ^ 0x5A77] = 0x5A1B ^ 0x5A77;
        SliderSetting.e[0x621E ^ 0x6366] = 0xD012 ^ 0x6366;
        SliderSetting.e[0x2C67 ^ 0x2D36] = 0x2D67 ^ 0x2D36;
        SliderSetting.e[0x3B7D ^ 0x3BA5] = 0xFFFFB2D9 ^ 0x3BA5;
        SliderSetting.e[0x20F1 ^ 0x2179] = 0x2798 ^ 0x2179;
        SliderSetting.e[0x4B64 ^ 0x4BFE] = 0x79C7 ^ 0x4BFE;
        SliderSetting.e[0xBFF0 ^ 0xBF93] = 0xBFDF ^ 0xBF93;
        SliderSetting.e[0x4523 ^ 0x4405] = 0x435D ^ 0x4405;
        SliderSetting.e[0xE12D ^ 0xE04E] = 0xFFFF1FD7 ^ 0xE04E;
        SliderSetting.e[0xBD24 ^ 0xBD49] = 0xFFFF429E ^ 0xBD49;
        SliderSetting.e[0x980D ^ 0x9840] = 0x986E ^ 0x9840;
        SliderSetting.e[0x85E2 ^ 0x849E] = 0x3248 ^ 0x849E;
        SliderSetting.e[0x8313 ^ 0x824E] = 0xFFFF7DCC ^ 0x824E;
        SliderSetting.e[0xBD6E ^ 0xBC17] = 0x38A3 ^ 0xBC17;
        SliderSetting.e[0xB0D2 ^ 0xB189] = 0xFFFF4E15 ^ 0xB189;
        SliderSetting.e[0x5FF5 ^ 0x5F8E] = 0xDA0A ^ 0x5F8E;
        SliderSetting.e[0x109C0 ^ 0x10963] = 0x13C6F ^ 0x10963;
        SliderSetting.e[0x6576 ^ 0x65CC] = 0x37FF ^ 0x65CC;
        SliderSetting.e[0x5728 ^ 0x562A] = 0xA012 ^ 0x562A;
        SliderSetting.e[0xA504 ^ 0xA44B] = 0xA45B ^ 0xA44B;
        SliderSetting.e[0x695E ^ 0x68DD] = 0x68CD ^ 0x68DD;
        SliderSetting.e[0x2379 ^ 0x23D3] = 0x14F ^ 0x23D3;
        SliderSetting.e[0x1043D ^ 0x1053D] = 0x15E8B ^ 0x1053D;
        SliderSetting.e[0x9631 ^ 0x9751] = 0x975E ^ 0x9751;
        SliderSetting.e[0x9AA3 ^ 0x9BE2] = 0x1E63 ^ 0x9BE2;
        SliderSetting.e[0x7FF2 ^ 0x7F31] = 0x8389 ^ 0x7F31;
        SliderSetting.e[0xEC6F ^ 0xEC66] = 0xECBC ^ 0xEC66;
        SliderSetting.e[0x8064 ^ 0x802C] = 0xFFFF7F62 ^ 0x802C;
        SliderSetting.e[0xD98F ^ 0xD8E1] = 0xD8E4 ^ 0xD8E1;
        SliderSetting.e[0xEB85 ^ 0xEBB4] = 0xB46C ^ 0xEBB4;
        SliderSetting.e[0x9676 ^ 0x9622] = 0xFFFF699A ^ 0x9622;
        SliderSetting.e[0x142 ^ 0x19E] = 0xFED4 ^ 0x19E;
        SliderSetting.e[0x79DB ^ 0x791E] = 0x85A6 ^ 0x791E;
        SliderSetting.e[0x2CE4 ^ 0x2C0B] = 0xA09D ^ 0x2C0B;
        SliderSetting.e[0xA9DB ^ 0xA923] = 0xFFFF1571 ^ 0xA923;
        SliderSetting.e[0x5BE2 ^ 0x5BA8] = 0xFFFFA41E ^ 0x5BA8;
        SliderSetting.e[0x83F4 ^ 0x82AE] = 0x82AE ^ 0x82AE;
        SliderSetting.e[0xA6E5 ^ 0xA667] = 0x53CC ^ 0xA667;
        SliderSetting.e[0x1B2F ^ 0x1B0B] = 0x1B0B ^ 0x1B0B;
        SliderSetting.e[0xE1A2 ^ 0xE0B3] = 0xFABE ^ 0xE0B3;
        SliderSetting.e[0x9F65 ^ 0x9F43] = 0x4803 ^ 0x9F43;
        SliderSetting.e[0x21D1 ^ 0x21DE] = 0x219E ^ 0x21DE;
        SliderSetting.e[0xD5B6 ^ 0xD518] = 0xD2AF ^ 0xD518;
        SliderSetting.e[0x842E ^ 0x8458] = 0x176A ^ 0x8458;
        SliderSetting.e[0x420C ^ 0x429E] = 0xA52A ^ 0x429E;
        SliderSetting.e[0x1016 ^ 0x104D] = 0xFFFFEF92 ^ 0x104D;
        SliderSetting.e[0xEC6 ^ 0xE12] = 0xFFFF9D0E ^ 0xE12;
        SliderSetting.e[0xD0CB ^ 0xD08E] = 0xD0C8 ^ 0xD08E;
        SliderSetting.e[0x67E3 ^ 0x67C0] = 0x67C0 ^ 0x67C0;
        SliderSetting.e[0xE82E ^ 0xE8FF] = 0xD69D ^ 0xE8FF;
        SliderSetting.e[0x6676 ^ 0x6714] = 0x6713 ^ 0x6714;
        SliderSetting.e[0xC6B0 ^ 0xC79C] = 0xC965 ^ 0xC79C;
        SliderSetting.e[0xFB73 ^ 0xFBC4] = 0xFBC4 ^ 0xFBC4;
        SliderSetting.e[0xA5F8 ^ 0xA557] = 0xCDBB ^ 0xA557;
        SliderSetting.e[0x2376 ^ 0x235E] = 0xB19A ^ 0x235E;
        SliderSetting.e[0x508A ^ 0x503C] = 0x8C4E ^ 0x503C;
        SliderSetting.e[0xA4FD ^ 0xA5BE] = 0xBEBD ^ 0xA5BE;
        SliderSetting.e[0x28CC ^ 0x2883] = 0x28C2 ^ 0x2883;
        SliderSetting.e[0xD643 ^ 0xD6F0] = 0xA89 ^ 0xD6F0;
        SliderSetting.e[0x4661 ^ 0x4610] = 0x4610 ^ 0x4610;
        SliderSetting.e[0x95D3 ^ 0x94BA] = 0xFFFF6B1C ^ 0x94BA;
        SliderSetting.e[0xF269 ^ 0xF321] = 0x920B ^ 0xF321;
        SliderSetting.e[0x4427 ^ 0x44A6] = 0xFFFF4E97 ^ 0x44A6;
        SliderSetting.e[0x20B5 ^ 0x20FC] = 0xFFFFDF6B ^ 0x20FC;
        SliderSetting.e[0x7ACB ^ 0x7BBE] = 0x11CE ^ 0x7BBE;
        SliderSetting.e[0x7AD5 ^ 0x7A3C] = 0x4EC9 ^ 0x7A3C;
        SliderSetting.e[0xF092 ^ 0xF0A8] = 0xFFFF0F62 ^ 0xF0A8;
        SliderSetting.e[0x1061D ^ 0x106E7] = 0x16C53 ^ 0x106E7;
        SliderSetting.e[0xDADB ^ 0xDAFC] = 0xF55F ^ 0xDAFC;
        SliderSetting.e[0xD22 ^ 0xD44] = 0xD2D ^ 0xD44;
        SliderSetting.e[0xD602 ^ 0xD678] = 0x138C ^ 0xD678;
        SliderSetting.e[0x861F ^ 0x8714] = 0xBCF9 ^ 0x8714;
        SliderSetting.e[0x285B ^ 0x296C] = 0x63A8 ^ 0x296C;
        SliderSetting.e[0xD8EA ^ 0xD830] = 0x275F ^ 0xD830;
        SliderSetting.e[0x4B34 ^ 0x4A45] = 0x4B45 ^ 0x4A45;
        SliderSetting.e[0x4626 ^ 0x469E] = 0xD673 ^ 0x469E;
        SliderSetting.e[0x4565 ^ 0x4579] = 0xFFFFBAB0 ^ 0x4579;
        SliderSetting.e[0xAA23 ^ 0xABA9] = 0x228C ^ 0xABA9;
        SliderSetting.e[0x4333 ^ 0x430F] = 0xFFFFBCB9 ^ 0x430F;
        SliderSetting.e[0xDAD2 ^ 0xDBF0] = 0xCBA1 ^ 0xDBF0;
        SliderSetting.e[0x2B7C ^ 0x2B89] = 0xD2E4 ^ 0x2B89;
        SliderSetting.e[0x10963 ^ 0x10876] = 0x11E9C ^ 0x10876;
        SliderSetting.e[0x51EF ^ 0x5184] = 0xFFFFAE74 ^ 0x5184;
        SliderSetting.e[0xEE00 ^ 0xEE15] = 0xFFFF113C ^ 0xEE15;
        SliderSetting.e[0xA483 ^ 0xA58E] = 0x9E63 ^ 0xA58E;
        SliderSetting.e[0xB374 ^ 0xB367] = 0xB34E ^ 0xB367;
        SliderSetting.e[0x992C ^ 0x9995] = 0x958 ^ 0x9995;
        SliderSetting.e[0x15A2 ^ 0x15A5] = 0xFFFFEA09 ^ 0x15A5;
        SliderSetting.e[0x28EC ^ 0x281D] = 0xA48B ^ 0x281D;
        SliderSetting.e[0x8BFA ^ 0x8BA7] = 0x8B04 ^ 0x8BA7;
        SliderSetting.e[0x627F ^ 0x6333] = 0x544B ^ 0x6333;
        SliderSetting.e[0xB80 ^ 0xBD6] = 0xFFFFF427 ^ 0xBD6;
        SliderSetting.e[0x2F53 ^ 0x2F1D] = 0xFFFFD0EB ^ 0x2F1D;
        SliderSetting.e[0x1691 ^ 0x1683] = 0x16C6 ^ 0x1683;
    }
}

