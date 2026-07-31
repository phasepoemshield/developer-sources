/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.draggable.animation;

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
import kotakbaz.rain.client.draggable.animation.Easing;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0019\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0011\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0011\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0011\u0010\u0013J-\u0010\u0011\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\b\u0011\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014\u00a2\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014\u00a2\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0014\u00a2\u0006\u0004\b\u001a\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\"\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\"\u0010#R\u0016\u0010\u001f\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001f\u0010$R$\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r8\u0006@BX\u0086\u000e\u00a2\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&R$\u0010'\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@BX\u0086\u000e\u00a2\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001cR$\u0010*\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@BX\u0086\u000e\u00a2\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u001cR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0005\u0010(R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0010\u0010,\u00a8\u0006-"}, d2={"Lkotakbaz/rain/client/draggable/animation/AnimationUtil;", "", "<init>", "()V", "", "value", "", "snap", "(D)V", "", "get", "()F", "valueTo", "", "duration", "Lkotakbaz/rain/client/draggable/animation/Easing;", "easing", "run", "(FJLkotakbaz/rain/client/draggable/animation/Easing;)Lkotakbaz/rain/client/draggable/animation/AnimationUtil;", "(DJLkotakbaz/rain/client/draggable/animation/Easing;)Lkotakbaz/rain/client/draggable/animation/AnimationUtil;", "", "safe", "(DJLkotakbaz/rain/client/draggable/animation/Easing;Z)Lkotakbaz/rain/client/draggable/animation/AnimationUtil;", "update", "()Z", "alive", "finished", "calculatePart", "()D", "check", "(ZD)Z", "start", "end", "delta", "interpolate", "(DDD)D", "J", "getDuration", "()J", "fromValue", "D", "getFromValue", "toValue", "getToValue", "Lkotakbaz/rain/client/draggable/animation/Easing;", "rain-visuals"})
public final class AnimationUtil {
    private long a;
    private long A;
    private double b;
    private double B;
    private double c;
    @NotNull
    private Easing C = Easing.A;
    private static Object[] d;
    private static Object e;
    private static Object[] E;
    private static Object[] D;
    private static Object[] f;
    public static int[] F;

    public final long getDuration() {
        return this.A;
    }

    public final double getFromValue() {
        return this.b;
    }

    public final double getToValue() {
        return this.B;
    }

    public final void snap(double value2) {
        this.c = value2;
        this.b = value2;
        this.B = value2;
    }

    public final float get() {
        return (float)this.c;
    }

    @NotNull
    public final AnimationUtil run(float valueTo, long duration, @NotNull Easing easing) {
        int n2 = F[0];
        n2 ^= F[1];
        Intrinsics.checkNotNullParameter((Object)easing, (String)d[n2 -= F[2]]);
        boolean bl = F[3];
        bl ^= F[4];
        return this.run(valueTo, duration, easing, bl -= F[5]);
    }

    @NotNull
    public final AnimationUtil run(double valueTo, long duration, @NotNull Easing easing) {
        int n2 = F[6];
        n2 ^= F[7];
        Intrinsics.checkNotNullParameter((Object)easing, (String)d[n2 += F[8]]);
        boolean bl = F[9];
        bl -= F[10];
        return this.run(valueTo, duration, easing, bl ^= F[11]);
    }

    @NotNull
    public final AnimationUtil run(double valueTo, long duration, @NotNull Easing easing, boolean safe) {
        int n2 = F[12];
        n2 -= F[13];
        Intrinsics.checkNotNullParameter((Object)easing, (String)d[n2 -= F[14]]);
        if (!this.check(safe, valueTo)) {
            this.C = easing;
            this.A = duration;
            this.a = System.currentTimeMillis();
            this.b = this.c;
            this.B = valueTo;
        }
        return this;
    }

    public final boolean update() {
        long l2 = 2504467260376866885L;
        long l3 = 3579147690383134921L;
        int n2 = F[15];
        n2 += F[16];
        long l4 = l3;
        int n3 = F[18];
        n3 += F[19];
        l3 = l4 ^ ((long)this.alive() << (n2 -= F[17]) ^ l4) & -1L << (n3 ^= F[20]);
        int n4 = F[21];
        n4 += F[22];
        if ((int)(l3 >>> (n4 -= F[23])) != 0) {
            this.c = this.interpolate(this.b, this.B, this.C.apply(this.calculatePart()));
        } else {
            this.a = 0L;
            this.c = this.B;
        }
        int n5 = F[24];
        n5 ^= F[25];
        return (int)(l3 >>> (n5 += F[26])) != 0;
    }

    public final boolean alive() {
        boolean bl;
        if (!this.finished()) {
            boolean bl2 = F[27];
            bl2 -= F[28];
            bl = bl2 -= F[29];
        } else {
            boolean bl3 = F[30];
            bl3 ^= F[31];
            bl = bl3 -= F[32];
        }
        return bl;
    }

    public final boolean finished() {
        boolean bl;
        if (this.calculatePart() >= 1.0) {
            boolean bl2 = F[33];
            bl2 += F[34];
            bl = bl2 -= F[35];
        } else {
            boolean bl3 = F[36];
            bl3 -= F[37];
            bl = bl3 ^= F[38];
        }
        return bl;
    }

    private final double calculatePart() {
        if (this.A <= 0L) {
            return 1.0;
        }
        return (double)(System.currentTimeMillis() - this.a) / (double)this.A;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final boolean check(boolean safe, double valueTo) {
        int n2;
        block9: {
            block10: {
                int n3;
                int n4;
                int n5;
                if (!safe || !this.alive()) break block9;
                if (valueTo == this.b) {
                    int n6 = F[39];
                    n6 ^= F[40];
                    n5 = n6 += F[41];
                } else {
                    int n7 = F[42];
                    n7 += F[43];
                    n5 = n7 += F[44];
                }
                if (n5 != 0) break block10;
                if (valueTo == this.B) {
                    int n8 = F[45];
                    n8 -= F[46];
                    n4 = n8 -= F[47];
                } else {
                    int n9 = F[48];
                    n9 ^= F[49];
                    n4 = n9 -= F[50];
                }
                if (n4 != 0) break block10;
                if (valueTo == this.c) {
                    int n10 = F[51];
                    n10 -= F[52];
                    n3 = n10 ^= F[53];
                } else {
                    int n11 = F[54];
                    n11 ^= F[55];
                    n3 = n11 -= F[56];
                }
                if (n3 == 0) break block9;
            }
            int n12 = F[57];
            n12 ^= F[58];
            n2 = n12 ^= F[59];
            return n2 != 0;
        }
        int n13 = F[60];
        n13 ^= F[61];
        n2 = n13 -= F[62];
        return n2 != 0;
    }

    private final double interpolate(double start, double end, double delta) {
        return start + (end - start) * delta;
    }

    static {
        AnimationUtil.b();
        long l2 = -5104616036826223441L;
        long l3 = 271106249924435337L;
        long l4 = -3770693419470087072L;
        long l5 = 8027749770277673563L;
        long l6 = -3152197291291970421L;
        long l7 = 6578905325250735075L;
        long l8 = 1666017194711405991L;
        long l9 = -6351952440439618089L;
        long l10 = 2656457135916393569L;
        long l11 = 6095898402521579289L;
        long l12 = -4806243826023789102L;
        long l13 = 6158728730975769352L;
        long l14 = -4059973639639475468L;
        long l15 = -7957659913232866286L;
        int n2 = F[63];
        n2 -= F[64];
        d = new Object[n2 -= F[65]];
        long l16 = l15;
        int n3 = F[66];
        n3 += F[67];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 += F[68]);
        Object[] objectArray = new Object[F[69]];
        objectArray[AnimationUtil.F[70]] = D;
        objectArray[AnimationUtil.F[71]] = F[72];
        int n4 = F[73];
        Object object = AnimationUtil.A()[F[74]];
        if (object == null) {
            char[] cArray = "\u0a9e\u0aee\u0af6\u0a4c\u0ac1\u0afe\u0a88\u0aff\u0af3\u0a9f\u0ac3\u0a9b\u0a97\u0a61\u0a60\u0a21\u0a9d\u0afd\u0aee\u0a96\u0ac4\u0a8c\u0a96\u0aea\u0a9a\u0af9\u0ad3\u0a9a\u0af3\u0afc\u0ac3\u0ace\u0aee\u0a8c\u0a88\u0ac3\u0a9c\u0a22\u0a64\u0af8\u0ac3\u0a49\u0aa0\u0a22\u0ad3\u0af0\u0aff\u0a9e\u0ace\u0afb\u0afa\u0aec\u0a62\u0a5e\u0a8c\u0a62\u0afc\u0b00\u0af6\u0afd\u0ac2\u0a99\u0a63\u0ace".toCharArray();
            for (int i2 = F[75]; i2 < F[76]; ++i2) {
                int n5 = cArray[i2];
                n5 -= F[77];
                n5 ^= F[78];
                n5 -= F[79];
                n5 += F[80];
                n5 -= F[81];
                n5 ^= F[82];
                n5 += F[83];
                n5 -= F[84];
                n5 -= F[85];
                n5 += F[86];
                n5 += F[87];
                n5 ^= F[88];
                cArray[i2] = (char)(n5 += F[89]);
            }
            object = AnimationUtil.A()[AnimationUtil.F[90]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)AnimationUtil.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = F[91];
        n6 += F[92];
        l6 = l17 ^ (0x1800000000L ^ l17) & -1L << (n6 -= F[93]);
        long l18 = l13;
        int n7 = F[94];
        n7 -= F[95];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 += F[96]);
        while (true) {
            int n8 = F[97];
            n8 ^= F[98];
            if ((int)l13 >= (int)(l6 >>> (n8 -= F[99]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = F[100];
            n10 += F[101];
            int n11 = F[103];
            n11 += F[104];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 += F[102])) & -1L >>> (n11 ^= F[105]);
            long l20 = l9;
            int n12 = F[106];
            n12 += F[107];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 += F[108]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = F[109];
            n14 -= F[110];
            int n15 = F[112];
            n15 ^= F[113];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 -= F[111])) & -1L >>> (n15 += F[114]);
            int n16 = F[115];
            n16 += F[116];
            long l22 = l10;
            int n17 = F[118];
            n17 += F[119];
            l10 = l22 ^ ((long)cArray[n13] << (n16 ^= F[117]) ^ l22) & -1L << (n17 ^= F[120]);
            int n18 = F[121];
            n18 ^= F[122];
            n18 += F[123];
            int n19 = F[124];
            n19 -= F[125];
            long l23 = l12;
            int n20 = F[127];
            n20 ^= F[128];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 ^= F[126]))) ^ l23) & -1L >>> (n20 += F[129]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = F[130];
            n21 -= F[131];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 += F[132]);
            while (true) {
                int n22 = F[133];
                n22 += F[134];
                if ((int)(l14 >>> (n22 ^= F[135])) >= (int)l12) break;
                int n23 = F[136];
                n23 += F[137];
                int n24 = F[139];
                n24 ^= F[140];
                cArray2[(int)(l14 >>> (n23 ^= AnimationUtil.F[138]))] = cArray[(int)l13 + (int)(l14 >>> (n24 += F[141]))];
                l14 += 0x100000000L;
            }
            int n25 = F[142];
            n25 -= F[143];
            int n26 = (int)(l15 >>> (n25 += F[144]));
            l15 += 0x100000000L;
            AnimationUtil.d[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = F[145];
            n27 ^= F[146];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 -= F[147]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[F[148]];
        String string = (String)object[F[149]];
        object = object[F[150]];
        Object[] objectArray = E;
        if (E == null) {
            objectArray = E = new Object[F[151]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[F[152]];
                D = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[F[154] ^ F[155]];
                byArray[AnimationUtil.F[156] ^ AnimationUtil.F[157]] = F[158] ^ F[159];
                byArray[AnimationUtil.F[160] ^ AnimationUtil.F[161]] = F[162] ^ F[163];
                byArray[AnimationUtil.F[164] ^ AnimationUtil.F[165]] = F[166] ^ F[167];
                byArray[AnimationUtil.F[168] ^ AnimationUtil.F[169]] = F[170] ^ F[171];
                byArray[AnimationUtil.F[172] ^ AnimationUtil.F[173]] = F[174] ^ F[175];
                byArray[AnimationUtil.F[176] ^ AnimationUtil.F[177]] = F[178] ^ F[179];
                byArray[AnimationUtil.F[180] ^ AnimationUtil.F[181]] = F[182] ^ F[183];
                byArray[AnimationUtil.F[184] ^ AnimationUtil.F[185]] = F[186] ^ F[187];
                byArray[AnimationUtil.F[188] ^ AnimationUtil.F[189]] = F[190] ^ F[191];
                byArray[AnimationUtil.F[192] ^ AnimationUtil.F[193]] = F[194] ^ F[195];
                byArray[AnimationUtil.F[196] ^ AnimationUtil.F[197]] = F[198] ^ F[199];
                byArray[AnimationUtil.F[200] ^ AnimationUtil.F[201]] = F[202] ^ F[203];
                byArray[AnimationUtil.F[204] ^ AnimationUtil.F[205]] = F[206] ^ F[207];
                byArray[AnimationUtil.F[208] ^ AnimationUtil.F[209]] = F[210] ^ F[211];
                byArray[AnimationUtil.F[212] ^ AnimationUtil.F[213]] = F[214] ^ F[215];
                byArray[AnimationUtil.F[216] ^ AnimationUtil.F[217]] = F[218] ^ F[219];
                objectArray2[AnimationUtil.F[153]] = byArray;
            }
            byte[] byArray = (byte[])object3[F[220]];
            if (e == null) {
                byte[] byArray2 = new byte[F[221] ^ F[222]];
                byArray2[AnimationUtil.F[223] ^ AnimationUtil.F[224]] = F[225] ^ F[226];
                byArray2[AnimationUtil.F[227] ^ AnimationUtil.F[228]] = F[229] ^ F[230];
                byArray2[AnimationUtil.F[231] ^ AnimationUtil.F[232]] = F[233] ^ F[234];
                byArray2[AnimationUtil.F[235] ^ AnimationUtil.F[236]] = F[237] ^ F[238];
                byArray2[AnimationUtil.F[239] ^ AnimationUtil.F[240]] = F[241] ^ F[242];
                byArray2[AnimationUtil.F[243] ^ AnimationUtil.F[244]] = F[245] ^ F[246];
                byArray2[AnimationUtil.F[247] ^ AnimationUtil.F[248]] = F[249] ^ F[250];
                byArray2[AnimationUtil.F[251] ^ AnimationUtil.F[252]] = F[253] ^ F[254];
                byArray2[AnimationUtil.F[255] ^ AnimationUtil.F[256]] = F[257] ^ F[258];
                byArray2[AnimationUtil.F[259] ^ AnimationUtil.F[260]] = F[261] ^ F[262];
                byArray2[AnimationUtil.F[263] ^ AnimationUtil.F[264]] = F[265] ^ F[266];
                byArray2[AnimationUtil.F[267] ^ AnimationUtil.F[268]] = F[269] ^ F[270];
                byArray2[AnimationUtil.F[271] ^ AnimationUtil.F[272]] = F[273] ^ F[274];
                byArray2[AnimationUtil.F[275] ^ AnimationUtil.F[276]] = F[277] ^ F[278];
                byArray2[AnimationUtil.F[279] ^ AnimationUtil.F[280]] = F[281] ^ F[282];
                byArray2[AnimationUtil.F[283] ^ AnimationUtil.F[284]] = F[285] ^ F[286];
                byArray2[AnimationUtil.F[287] ^ AnimationUtil.F[288]] = F[289] ^ F[290];
                byArray2[AnimationUtil.F[291] ^ AnimationUtil.F[292]] = F[293] ^ F[294];
                byArray2[AnimationUtil.F[295] ^ AnimationUtil.F[296]] = F[297] ^ F[298];
                byArray2[AnimationUtil.F[299] ^ AnimationUtil.F[300]] = F[301] ^ F[302];
                byArray2[AnimationUtil.F[303] ^ AnimationUtil.F[304]] = F[305] ^ F[306];
                byArray2[AnimationUtil.F[307] ^ AnimationUtil.F[308]] = F[309] ^ F[310];
                byArray2[AnimationUtil.F[311] ^ AnimationUtil.F[312]] = F[313] ^ F[314];
                byArray2[AnimationUtil.F[315] ^ AnimationUtil.F[316]] = F[317] ^ F[318];
                byArray2[AnimationUtil.F[319] ^ AnimationUtil.F[320]] = F[321] ^ F[322];
                byArray2[AnimationUtil.F[323] ^ AnimationUtil.F[324]] = F[325] ^ F[326];
                byArray2[AnimationUtil.F[327] ^ AnimationUtil.F[328]] = F[329] ^ F[330];
                byArray2[AnimationUtil.F[331] ^ AnimationUtil.F[332]] = F[333] ^ F[334];
                byArray2[AnimationUtil.F[335] ^ AnimationUtil.F[336]] = F[337] ^ F[338];
                byArray2[AnimationUtil.F[339] ^ AnimationUtil.F[340]] = F[341] ^ F[342];
                byArray2[AnimationUtil.F[343] ^ AnimationUtil.F[344]] = F[345] ^ F[346];
                byArray2[AnimationUtil.F[347] ^ AnimationUtil.F[348]] = F[349] ^ F[350];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, F[351], byArray3, F[352], byArray.length);
                System.arraycopy(byArray2, F[353], byArray3, byArray.length, byArray2.length);
                Object object4 = AnimationUtil.A()[F[354]];
                if (object4 == null) {
                    char[] cArray = "\ua60f\ua639\ua610\ua63b\ua635\ua609\ua624\ua62e\ua6cb\ua757\ua637\ua62a\ua756\ua758\ua628\ua637\ua636\ua606".toCharArray();
                    for (int i2 = F[355]; i2 < F[356]; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= F[357];
                        n3 ^= F[358];
                        n3 += F[359];
                        n3 -= F[360];
                        n3 -= F[361];
                        n3 ^= F[362];
                        n3 += F[363];
                        n3 ^= F[364];
                        n3 += F[365];
                        n3 -= F[366];
                        cArray[i2] = (char)(n3 -= F[367]);
                    }
                    object4 = AnimationUtil.A()[AnimationUtil.F[368]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[F[369]];
                byArray4[AnimationUtil.F[370]] = F[371];
                byArray4[AnimationUtil.F[372]] = F[373];
                byArray4[AnimationUtil.F[374]] = F[375];
                byArray4[AnimationUtil.F[376]] = F[377];
                byArray4[AnimationUtil.F[378]] = F[379];
                byArray4[AnimationUtil.F[380]] = F[381];
                byArray4[AnimationUtil.F[382]] = F[383];
                byArray4[AnimationUtil.F[384]] = F[385];
                byArray4[AnimationUtil.F[386]] = F[387];
                byArray4[AnimationUtil.F[388]] = F[389];
                byArray4[AnimationUtil.F[390]] = F[391];
                byArray4[AnimationUtil.F[392]] = F[393];
                byArray4[AnimationUtil.F[394]] = F[395];
                byArray4[AnimationUtil.F[396]] = F[397];
                byArray4[AnimationUtil.F[398]] = F[399];
                byArray4[4] = 91;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 12, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = AnimationUtil.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u5d37\u5d4b\u5d29".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= 17728;
                        n4 -= 47203;
                        n4 ^= 0x2673;
                        n4 += 34948;
                        n4 -= 52197;
                        n4 += 34839;
                        n4 += 49960;
                        n4 += 57210;
                        n4 ^= 0x3C8B;
                        n4 += 65308;
                        n4 -= 22142;
                        cArray[i3] = (char)(n4 += 63983);
                    }
                    object5 = AnimationUtil.A()[2] = new String(cArray);
                }
                e = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = AnimationUtil.A()[3];
            if (object6 == null) {
                char[] cArray = "\u32fa\u32f6\u3dc8\u331c\u32f8\u32fb\u32f8\u331c\u32fd\u3de0\u32f8\u3dc8\u3de6\u32fd\u3dda\u3dd9\u3dd9\u3dc2\u3ddf\u3dd4".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 -= 16496;
                    n5 ^= 0x570;
                    n5 += 41233;
                    n5 += 21110;
                    n5 += 48361;
                    n5 -= 233;
                    n5 -= 12859;
                    n5 ^= 0xF6BB;
                    n5 ^= 0x41AD;
                    cArray[i4] = (char)(n5 -= 49679);
                }
                object6 = AnimationUtil.A()[3] = new String(cArray);
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
        F = new int[0x2D38 ^ 0x2CA8];
        AnimationUtil.F[0xD910 ^ 0xD9DD] = 0x44EE ^ 0xD9DD;
        AnimationUtil.F[0xE0CC ^ 0xE08F] = 0xE084 ^ 0xE08F;
        AnimationUtil.F[0x9A80 ^ 0x9BD8] = 0xD544 ^ 0x9BD8;
        AnimationUtil.F[0xA835 ^ 0xA8C0] = 0xFFFFF818 ^ 0xA8C0;
        AnimationUtil.F[0x288 ^ 0x3B4] = 0xAD09 ^ 0x3B4;
        AnimationUtil.F[0x5D2D ^ 0x5C6B] = 0x1E53 ^ 0x5C6B;
        AnimationUtil.F[0x69C9 ^ 0x6977] = 0xEC58 ^ 0x6977;
        AnimationUtil.F[0x19A1 ^ 0x18A8] = 0xFFFF0066 ^ 0x18A8;
        AnimationUtil.F[0x1A4E ^ 0x1A8A] = 0xC3C2 ^ 0x1A8A;
        AnimationUtil.F[0x30A0 ^ 0x3180] = 0x288D ^ 0x3180;
        AnimationUtil.F[0x401 ^ 0x4DF] = 0x9389 ^ 0x4DF;
        AnimationUtil.F[0xB333 ^ 0xB34C] = 0xB376 ^ 0xB34C;
        AnimationUtil.F[0xC4B0 ^ 0xC5C4] = 0xC5C1 ^ 0xC5C4;
        AnimationUtil.F[0xF909 ^ 0xF969] = 0xFFFF0690 ^ 0xF969;
        AnimationUtil.F[0x35C4 ^ 0x3481] = 0xFFFF8943 ^ 0x3481;
        AnimationUtil.F[0xD748 ^ 0xD7B7] = 0xF50E ^ 0xD7B7;
        AnimationUtil.F[0xFAB5 ^ 0xFB31] = 0xFB3F ^ 0xFB31;
        AnimationUtil.F[0xFAF3 ^ 0xFAA1] = 0x8169 ^ 0xFAA1;
        AnimationUtil.F[0xDC60 ^ 0xDD31] = 0x6814 ^ 0xDD31;
        AnimationUtil.F[0x90AE ^ 0x905D] = 0x3F76 ^ 0x905D;
        AnimationUtil.F[0x447E ^ 0x4442] = 0xFFFFBBD9 ^ 0x4442;
        AnimationUtil.F[0x5EC8 ^ 0x5FEB] = 0xAE02 ^ 0x5FEB;
        AnimationUtil.F[0x4AD4 ^ 0x4A7E] = 0xDC51 ^ 0x4A7E;
        AnimationUtil.F[0xF288 ^ 0xF2BE] = 0xF2DD ^ 0xF2BE;
        AnimationUtil.F[0x1B80 ^ 0x1A8A] = 0xFD85 ^ 0x1A8A;
        AnimationUtil.F[0xF951 ^ 0xF985] = 0xF21F ^ 0xF985;
        AnimationUtil.F[0x7BBF ^ 0x7BF5] = 0x7BF5 ^ 0x7BF5;
        AnimationUtil.F[0x3CC6 ^ 0x3C93] = 0xBE07 ^ 0x3C93;
        AnimationUtil.F[0x6962 ^ 0x69B7] = 0x6226 ^ 0x69B7;
        AnimationUtil.F[0x27FA ^ 0x278E] = 0x27FD ^ 0x278E;
        AnimationUtil.F[0xC375 ^ 0xC21A] = 0x96A4 ^ 0xC21A;
        AnimationUtil.F[0x56D3 ^ 0x57BD] = 0x38A0 ^ 0x57BD;
        AnimationUtil.F[0x9F6E ^ 0x9F35] = 0xFFFF60CC ^ 0x9F35;
        AnimationUtil.F[0xC57B ^ 0xC438] = 0x8614 ^ 0xC438;
        AnimationUtil.F[0x8F3D ^ 0x8FA7] = 0xC342 ^ 0x8FA7;
        AnimationUtil.F[0x5320 ^ 0x5394] = 0x63C1 ^ 0x5394;
        AnimationUtil.F[0x2DF7 ^ 0x2DD7] = 0xFFFFD241 ^ 0x2DD7;
        AnimationUtil.F[0x8009 ^ 0x815D] = 0x1850E ^ 0x815D;
        AnimationUtil.F[0x9EE3 ^ 0x9E03] = 0x7678 ^ 0x9E03;
        AnimationUtil.F[0x49D6 ^ 0x490F] = 0x8052 ^ 0x490F;
        AnimationUtil.F[0xCE19 ^ 0xCE20] = 0xCE08 ^ 0xCE20;
        AnimationUtil.F[0x1F4A ^ 0x1E03] = 0x4AC0 ^ 0x1E03;
        AnimationUtil.F[0x2A6A ^ 0x2AB2] = 0xE3E0 ^ 0x2AB2;
        AnimationUtil.F[0x95AB ^ 0x95F5] = 0xFFFF6A46 ^ 0x95F5;
        AnimationUtil.F[0xAD1 ^ 0xAAC] = 0xAAA ^ 0xAAC;
        AnimationUtil.F[0xFAE6 ^ 0xFBAC] = 0xAF75 ^ 0xFBAC;
        AnimationUtil.F[0xD265 ^ 0xD2EC] = 0xFFFF2D70 ^ 0xD2EC;
        AnimationUtil.F[0xC697 ^ 0xC689] = 0xC681 ^ 0xC689;
        AnimationUtil.F[0xB5D2 ^ 0xB5A5] = 0xFFFF4A0F ^ 0xB5A5;
        AnimationUtil.F[0xAB49 ^ 0xAB2A] = 0xAB61 ^ 0xAB2A;
        AnimationUtil.F[0x17E7 ^ 0x1770] = 0x1771 ^ 0x1770;
        AnimationUtil.F[0x2750 ^ 0x279A] = 0xFFFFCC8D ^ 0x279A;
        AnimationUtil.F[0x9CCF ^ 0x9C68] = 0xC39B ^ 0x9C68;
        AnimationUtil.F[0x550 ^ 0x45D] = 0xFFFF8127 ^ 0x45D;
        AnimationUtil.F[0x511A ^ 0x5092] = 0x5092 ^ 0x5092;
        AnimationUtil.F[0x55F2 ^ 0x5491] = 0x5491 ^ 0x5491;
        AnimationUtil.F[0x8FAD ^ 0x8F32] = 0xCEED ^ 0x8F32;
        AnimationUtil.F[0xA74A ^ 0xA77B] = 0xFFFF58A4 ^ 0xA77B;
        AnimationUtil.F[0xE11A ^ 0xE05E] = 0xA266 ^ 0xE05E;
        AnimationUtil.F[0xB109 ^ 0xB1CE] = 0x6885 ^ 0xB1CE;
        AnimationUtil.F[0x34E ^ 0x3EE] = 0x40E0 ^ 0x3EE;
        AnimationUtil.F[0x219 ^ 0x2B7] = 0xFFFF264E ^ 0x2B7;
        AnimationUtil.F[0x53F5 ^ 0x5336] = 0x8C6D ^ 0x5336;
        AnimationUtil.F[0xA1CB ^ 0xA084] = 0x15AF ^ 0xA084;
        AnimationUtil.F[0xB475 ^ 0xB53D] = 0xE1E4 ^ 0xB53D;
        AnimationUtil.F[0x7D80 ^ 0x7D06] = 0xFFFF82CF ^ 0x7D06;
        AnimationUtil.F[0x24F0 ^ 0x2445] = 0x1418 ^ 0x2445;
        AnimationUtil.F[0x101C6 ^ 0x101E2] = 0x101B0 ^ 0x101E2;
        AnimationUtil.F[0x355 ^ 0x378] = 0xFFFFFC17 ^ 0x378;
        AnimationUtil.F[0x1C69 ^ 0x1C90] = 0xD6E4 ^ 0x1C90;
        AnimationUtil.F[0x5D17 ^ 0x5D78] = 0xFFFFA2D8 ^ 0x5D78;
        AnimationUtil.F[0x9E8F ^ 0x9F8D] = 0xBD2A ^ 0x9F8D;
        AnimationUtil.F[0x3054 ^ 0x312B] = 0x3159 ^ 0x312B;
        AnimationUtil.F[0xF123 ^ 0xF19C] = 0x7484 ^ 0xF19C;
        AnimationUtil.F[0x3194 ^ 0x3084] = 0xA4DE ^ 0x3084;
        AnimationUtil.F[0xDCC ^ 0xCC0] = 0x7623 ^ 0xCC0;
        AnimationUtil.F[0x29AB ^ 0x2828] = 0xFFFFD7D1 ^ 0x2828;
        AnimationUtil.F[0xFB12 ^ 0xFA28] = 0xD36 ^ 0xFA28;
        AnimationUtil.F[0x28D1 ^ 0x286D] = 0xAD78 ^ 0x286D;
        AnimationUtil.F[0x4E7F ^ 0x4EE7] = 0x4EE6 ^ 0x4EE7;
        AnimationUtil.F[0x6E48 ^ 0x6E4B] = 0x6E66 ^ 0x6E4B;
        AnimationUtil.F[0x88FE ^ 0x88C4] = 0xFFFF773A ^ 0x88C4;
        AnimationUtil.F[0xE5ED ^ 0xE5E4] = 0xE567 ^ 0xE5E4;
        AnimationUtil.F[0x182C ^ 0x193F] = 0xD9C ^ 0x193F;
        AnimationUtil.F[0x830 ^ 0x82D] = 0x80D ^ 0x82D;
        AnimationUtil.F[0x843C ^ 0x8466] = 0x8466 ^ 0x8466;
        AnimationUtil.F[0x4ED ^ 0x483] = 0xFFFFFB7F ^ 0x483;
        AnimationUtil.F[0xF0D6 ^ 0xF0F5] = 0xF0CB ^ 0xF0F5;
        AnimationUtil.F[0x26FE ^ 0x26FB] = 0x26A5 ^ 0x26FB;
        AnimationUtil.F[0xA474 ^ 0xA470] = 0xA403 ^ 0xA470;
        AnimationUtil.F[0x10361 ^ 0x1035A] = 0xFFFEFC8D ^ 0x1035A;
        AnimationUtil.F[0xEF28 ^ 0xEFD3] = 0x20A1 ^ 0xEFD3;
        AnimationUtil.F[0xDC9E ^ 0xDDDC] = 0xB41A ^ 0xDDDC;
        AnimationUtil.F[0xA6A6 ^ 0xA7E8] = 0x829A ^ 0xA7E8;
        AnimationUtil.F[0x7A97 ^ 0x7B96] = 0xFFFFA6D8 ^ 0x7B96;
        AnimationUtil.F[0x90AE ^ 0x90AF] = 0xFFFF6F50 ^ 0x90AF;
        AnimationUtil.F[0xD828 ^ 0xD8CA] = 0x30B1 ^ 0xD8CA;
        AnimationUtil.F[0x9848 ^ 0x9894] = 0x9894 ^ 0x9894;
        AnimationUtil.F[0x177 ^ 0x164] = 0xFFFFFEFB ^ 0x164;
        AnimationUtil.F[0xE390 ^ 0xE3A5] = 0xFFFF1C02 ^ 0xE3A5;
        AnimationUtil.F[0x4F0 ^ 0x41B] = 0x850A ^ 0x41B;
        AnimationUtil.F[0x72E5 ^ 0x729D] = 0xFFFF8D4D ^ 0x729D;
        AnimationUtil.F[0x1061F ^ 0x1077F] = 0x1077F ^ 0x1077F;
        AnimationUtil.F[0x95CD ^ 0x94B0] = 0x94CB ^ 0x94B0;
        AnimationUtil.F[0x561F ^ 0x5634] = 0x5671 ^ 0x5634;
        AnimationUtil.F[0x69B7 ^ 0x6953] = 0xCFC5 ^ 0x6953;
        AnimationUtil.F[0x1A5A ^ 0x1B67] = 0xFFFF4A79 ^ 0x1B67;
        AnimationUtil.F[0xD575 ^ 0xD476] = 0xD771 ^ 0xD476;
        AnimationUtil.F[0xDDC5 ^ 0xDDD2] = 0xDDA7 ^ 0xDDD2;
        AnimationUtil.F[0x87F5 ^ 0x86A3] = 0x182F0 ^ 0x86A3;
        AnimationUtil.F[0x4D6E ^ 0x4D05] = 0xFFFFB2AE ^ 0x4D05;
        AnimationUtil.F[0xADB4 ^ 0xACD3] = 0x29E2 ^ 0xACD3;
        AnimationUtil.F[0x83F ^ 0x86B] = 0xE379 ^ 0x86B;
        AnimationUtil.F[0x318B ^ 0x309E] = 0x245E ^ 0x309E;
        AnimationUtil.F[0x10914 ^ 0x10962] = 0x10924 ^ 0x10962;
        AnimationUtil.F[0xE79B ^ 0xE71B] = 0xE74A ^ 0xE71B;
        AnimationUtil.F[0x5602 ^ 0x560C] = 0x5662 ^ 0x560C;
        AnimationUtil.F[0x6BC6 ^ 0x6B4E] = 0xFFFF94A4 ^ 0x6B4E;
        AnimationUtil.F[0x51E9 ^ 0x5088] = 0x5088 ^ 0x5088;
        AnimationUtil.F[0xB991 ^ 0xB932] = 0xFA36 ^ 0xB932;
        AnimationUtil.F[0xCFCE ^ 0xCEE6] = 0xE6AD ^ 0xCEE6;
        AnimationUtil.F[0x83B9 ^ 0x83DF] = 0xFFFF7C28 ^ 0x83DF;
        AnimationUtil.F[0xFEE5 ^ 0xFE77] = 0xFE42 ^ 0xFE77;
        AnimationUtil.F[0xD021 ^ 0xD0B4] = 0xD0B6 ^ 0xD0B4;
        AnimationUtil.F[0x9AAA ^ 0x9A68] = 0x4560 ^ 0x9A68;
        AnimationUtil.F[0x2823 ^ 0x283F] = 0xFFFFD7E0 ^ 0x283F;
        AnimationUtil.F[0x39EE ^ 0x3945] = 0xAF21 ^ 0x3945;
        AnimationUtil.F[0x364 ^ 0x206] = 0x207 ^ 0x206;
        AnimationUtil.F[0x1AF3 ^ 0x1A1B] = 0x4D57 ^ 0x1A1B;
        AnimationUtil.F[0x62B7 ^ 0x62C5] = 0x62CF ^ 0x62C5;
        AnimationUtil.F[0x15E3 ^ 0x14F1] = 0x80AB ^ 0x14F1;
        AnimationUtil.F[0xCB31 ^ 0xCBFE] = 0x56CD ^ 0xCBFE;
        AnimationUtil.F[0x4A7D ^ 0x4B72] = 0xDF30 ^ 0x4B72;
        AnimationUtil.F[0xB5E2 ^ 0xB5B5] = 0x7B89 ^ 0xB5B5;
        AnimationUtil.F[0xF521 ^ 0xF4A1] = 0xF4AA ^ 0xF4A1;
        AnimationUtil.F[0xCCFD ^ 0xCC0B] = 0x632C ^ 0xCC0B;
        AnimationUtil.F[0x2895 ^ 0x29C6] = 0x12D92 ^ 0x29C6;
        AnimationUtil.F[0x1CCC ^ 0x1C23] = 0xC4D7 ^ 0x1C23;
        AnimationUtil.F[0x8F4B ^ 0x8E40] = 0xF4AE ^ 0x8E40;
        AnimationUtil.F[0xC436 ^ 0xC571] = 0x91BA ^ 0xC571;
        AnimationUtil.F[0x89AB ^ 0x89FD] = 0xCCC9 ^ 0x89FD;
        AnimationUtil.F[0x791E ^ 0x7993] = 0xFFFF8612 ^ 0x7993;
        AnimationUtil.F[0x681D ^ 0x6896] = 0x680A ^ 0x6896;
        AnimationUtil.F[0x13D3 ^ 0x128A] = 0x5C4E ^ 0x128A;
        AnimationUtil.F[0xF1F2 ^ 0xF1B2] = 0xF1A2 ^ 0xF1B2;
        AnimationUtil.F[0x1FAC ^ 0x1F4A] = 0xB9DC ^ 0x1F4A;
        AnimationUtil.F[0x2B14 ^ 0x2BA2] = 0xFFFFE423 ^ 0x2BA2;
        AnimationUtil.F[0x257A ^ 0x2533] = 0x2531 ^ 0x2533;
        AnimationUtil.F[0x8B86 ^ 0x8AB1] = 0x7DA1 ^ 0x8AB1;
        AnimationUtil.F[0xABDC ^ 0xAAB6] = 0x9221 ^ 0xAAB6;
        AnimationUtil.F[0xD901 ^ 0xD804] = 0xFFFF24CD ^ 0xD804;
        AnimationUtil.F[0x10176 ^ 0x10028] = 0x1D717 ^ 0x10028;
        AnimationUtil.F[0x8273 ^ 0x826A] = 0x8269 ^ 0x826A;
        AnimationUtil.F[0xD345 ^ 0xD308] = 0xE6C9 ^ 0xD308;
        AnimationUtil.F[0x87A9 ^ 0x877F] = 0x8CFC ^ 0x877F;
        AnimationUtil.F[0x1549 ^ 0x15E6] = 0xCE80 ^ 0x15E6;
        AnimationUtil.F[0x65B1 ^ 0x6540] = 0xBDB3 ^ 0x6540;
        AnimationUtil.F[0xA36D ^ 0xA367] = 0xA33E ^ 0xA367;
        AnimationUtil.F[0x987E ^ 0x9894] = 0xCFD8 ^ 0x9894;
        AnimationUtil.F[0x20F3 ^ 0x2009] = 0xEA71 ^ 0x2009;
        AnimationUtil.F[0x10871 ^ 0x10804] = 0x1085C ^ 0x10804;
        AnimationUtil.F[0xFAE3 ^ 0xFBD5] = 0x1F28 ^ 0xFBD5;
        AnimationUtil.F[0xAF2D ^ 0xAE46] = 0xCE3E ^ 0xAE46;
        AnimationUtil.F[0xD81A ^ 0xD907] = 0xFFFF0199 ^ 0xD907;
        AnimationUtil.F[0x4479 ^ 0x4503] = 0x4502 ^ 0x4503;
        AnimationUtil.F[0xEE5D ^ 0xEE9D] = 0x31C0 ^ 0xEE9D;
        AnimationUtil.F[0x7340 ^ 0x73C3] = 0x7385 ^ 0x73C3;
        AnimationUtil.F[0xE45 ^ 0xFC9] = 0xFCB ^ 0xFC9;
        AnimationUtil.F[0xC188 ^ 0xC130] = 0x1CFD8 ^ 0xC130;
        AnimationUtil.F[0x6FFC ^ 0x6E85] = 0x6E8B ^ 0x6E85;
        AnimationUtil.F[0xAC0C ^ 0xAD13] = 0xB407 ^ 0xAD13;
        AnimationUtil.F[0xF9D9 ^ 0xF9B0] = 0xFFFF0610 ^ 0xF9B0;
        AnimationUtil.F[0x72B0 ^ 0x72E3] = 0x3DAE ^ 0x72E3;
        AnimationUtil.F[0x332B ^ 0x3266] = 0xFFFFE8D2 ^ 0x3266;
        AnimationUtil.F[0x89B4 ^ 0x88C3] = 0x8892 ^ 0x88C3;
        AnimationUtil.F[0xBABF ^ 0xBA30] = 0xFFFF45D6 ^ 0xBA30;
        AnimationUtil.F[0x1377 ^ 0x131F] = 0x134D ^ 0x131F;
        AnimationUtil.F[0x10FAD ^ 0x10E2B] = 0x10E24 ^ 0x10E2B;
        AnimationUtil.F[0x48C2 ^ 0x494D] = 0x497D ^ 0x494D;
        AnimationUtil.F[0x4E49 ^ 0x4EB9] = 0x964B ^ 0x4EB9;
        AnimationUtil.F[0x6F9D ^ 0x6FAD] = 0xFFFF9029 ^ 0x6FAD;
        AnimationUtil.F[0xC461 ^ 0xC4C3] = 0x87FD ^ 0xC4C3;
        AnimationUtil.F[0x167 ^ 0x19A] = 0xFFFF3106 ^ 0x19A;
        AnimationUtil.F[0xF46C ^ 0xF401] = 0xFFFF0B9C ^ 0xF401;
        AnimationUtil.F[0xC28F ^ 0xC24A] = 0x1B01 ^ 0xC24A;
        AnimationUtil.F[0xDBCC ^ 0xDB38] = 0x741F ^ 0xDB38;
        AnimationUtil.F[0xBBF9 ^ 0xBAA5] = 0x6D9A ^ 0xBAA5;
        AnimationUtil.F[0x6C2B ^ 0x6C64] = 0xB46 ^ 0x6C64;
        AnimationUtil.F[0x9DF5 ^ 0x9CCE] = 0x3260 ^ 0x9CCE;
        AnimationUtil.F[0x3769 ^ 0x3650] = 0xFFFF3EEE ^ 0x3650;
        AnimationUtil.F[0xD1EA ^ 0xD1FB] = 0xFFFF2E5B ^ 0xD1FB;
        AnimationUtil.F[0x9D69 ^ 0x9C25] = 0xB957 ^ 0x9C25;
        AnimationUtil.F[0x6802 ^ 0x6936] = 0x8DCB ^ 0x6936;
        AnimationUtil.F[0x8E16 ^ 0x8E5D] = 0x8E5D ^ 0x8E5D;
        AnimationUtil.F[0x27E4 ^ 0x26BB] = 0x26BB ^ 0x26BB;
        AnimationUtil.F[0xC7D3 ^ 0xC693] = 0xAF55 ^ 0xC693;
        AnimationUtil.F[0x4F41 ^ 0x4F0F] = 0xCEED ^ 0x4F0F;
        AnimationUtil.F[0x947A ^ 0x945B] = 0x941E ^ 0x945B;
        AnimationUtil.F[0xCCA6 ^ 0xCC43] = 0x6AA1 ^ 0xCC43;
        AnimationUtil.F[0x7E54 ^ 0x7F52] = 0x7C51 ^ 0x7F52;
        AnimationUtil.F[0xFD9F ^ 0xFC83] = 0xDB85 ^ 0xFC83;
        AnimationUtil.F[0x23B5 ^ 0x2311] = 0x7CE7 ^ 0x2311;
        AnimationUtil.F[0xF026 ^ 0xF0E7] = 0x2FBC ^ 0xF0E7;
        AnimationUtil.F[0x548E ^ 0x54A4] = 0xFFFFABE4 ^ 0x54A4;
        AnimationUtil.F[0x5B18 ^ 0x5A3C] = 0xABDA ^ 0x5A3C;
        AnimationUtil.F[0xD6C6 ^ 0xD63A] = 0x1957 ^ 0xD63A;
        AnimationUtil.F[0xF56 ^ 0xF84] = 0xFFFF4665 ^ 0xF84;
        AnimationUtil.F[0xBDF4 ^ 0xBDEC] = 0xFFFF4228 ^ 0xBDEC;
        AnimationUtil.F[0x6510 ^ 0x6581] = 0x653F ^ 0x6581;
        AnimationUtil.F[0x4F54 ^ 0x4F31] = 0xFFFFB0CB ^ 0x4F31;
        AnimationUtil.F[0x5D36 ^ 0x5DA8] = 0xFFFFE3D7 ^ 0x5DA8;
        AnimationUtil.F[0xC53E ^ 0xC58C] = 0xC157 ^ 0xC58C;
        AnimationUtil.F[0x6090 ^ 0x600B] = 0x2CFE ^ 0x600B;
        AnimationUtil.F[0xE245 ^ 0xE207] = 0xFFFF1DF0 ^ 0xE207;
        AnimationUtil.F[0xB57B ^ 0xB570] = 0xB55A ^ 0xB570;
        AnimationUtil.F[0xE189 ^ 0xE1A5] = 0xE1DE ^ 0xE1A5;
        AnimationUtil.F[0x10BDF ^ 0x10AA1] = 0x10AAC ^ 0x10AA1;
        AnimationUtil.F[0x3F00 ^ 0x3E38] = 0xC926 ^ 0x3E38;
        AnimationUtil.F[0x66F6 ^ 0x6647] = 0x62DC ^ 0x6647;
        AnimationUtil.F[0x9BDD ^ 0x9B59] = 0xFFFF64EC ^ 0x9B59;
        AnimationUtil.F[0x7236 ^ 0x731C] = 0x5B57 ^ 0x731C;
        AnimationUtil.F[0x94C3 ^ 0x9588] = 0xB0F1 ^ 0x9588;
        AnimationUtil.F[0xD7A1 ^ 0xD7C6] = 0xFFFF28E8 ^ 0xD7C6;
        AnimationUtil.F[0x10018 ^ 0x1016E] = 0x10164 ^ 0x1016E;
        AnimationUtil.F[0xE06D ^ 0xE0EC] = 0xFFFF1F59 ^ 0xE0EC;
        AnimationUtil.F[0x5265 ^ 0x521E] = 0xFFFFADB7 ^ 0x521E;
        AnimationUtil.F[0x1012E ^ 0x101AC] = 0x1011D ^ 0x101AC;
        AnimationUtil.F[0x987D ^ 0x9901] = 0x9908 ^ 0x9901;
        AnimationUtil.F[0xAF92 ^ 0xAF9E] = 0xAFAA ^ 0xAF9E;
        AnimationUtil.F[0x6852 ^ 0x69D0] = 0x69D8 ^ 0x69D0;
        AnimationUtil.F[0xFCA7 ^ 0xFD8C] = 0x70EF ^ 0xFD8C;
        AnimationUtil.F[0xBB5B ^ 0xBB25] = 0xFFFF44E4 ^ 0xBB25;
        AnimationUtil.F[0x21DF ^ 0x20F1] = 0xAD9B ^ 0x20F1;
        AnimationUtil.F[0x192 ^ 0x1BA] = 0xFFFFFE73 ^ 0x1BA;
        AnimationUtil.F[0x4A6C ^ 0x4A7C] = 0xFFFFB597 ^ 0x4A7C;
        AnimationUtil.F[0xB900 ^ 0xB9A1] = 0xFAA5 ^ 0xB9A1;
        AnimationUtil.F[0xBE34 ^ 0xBE22] = 0xFFFF4189 ^ 0xBE22;
        AnimationUtil.F[0x4424 ^ 0x4478] = 0x441A ^ 0x4478;
        AnimationUtil.F[0xB726 ^ 0xB7C8] = 0x36CF ^ 0xB7C8;
        AnimationUtil.F[0x43C5 ^ 0x4375] = 0x47E0 ^ 0x4375;
        AnimationUtil.F[0x2B98 ^ 0x2B49] = 0x9D7C ^ 0x2B49;
        AnimationUtil.F[0x10B72 ^ 0x10A7A] = 0x1ED75 ^ 0x10A7A;
        AnimationUtil.F[0x135 ^ 0x18C] = 0x10F63 ^ 0x18C;
        AnimationUtil.F[0x999 ^ 0x8E9] = 0x8E8 ^ 0x8E9;
        AnimationUtil.F[0x9F6C ^ 0x9E3B] = 0xD0BC ^ 0x9E3B;
        AnimationUtil.F[0xB287 ^ 0xB21E] = 0xB21E ^ 0xB21E;
        AnimationUtil.F[0xC667 ^ 0xC757] = 0x6E9A ^ 0xC757;
        AnimationUtil.F[0xD70B ^ 0xD659] = 0x6363 ^ 0xD659;
        AnimationUtil.F[0x20E9 ^ 0x20DD] = 0xFFFFDF30 ^ 0x20DD;
        AnimationUtil.F[0x8E46 ^ 0x8EB8] = 0x41D5 ^ 0x8EB8;
        AnimationUtil.F[0xF0BC ^ 0xF05D] = 0x1854 ^ 0xF05D;
        AnimationUtil.F[0x941B ^ 0x9435] = 0xFFFF6BA8 ^ 0x9435;
        AnimationUtil.F[0xA36B ^ 0xA3F7] = 0xE224 ^ 0xA3F7;
        AnimationUtil.F[0x64E7 ^ 0x6473] = 0x6472 ^ 0x6473;
        AnimationUtil.F[0xF972 ^ 0xF935] = 0xF934 ^ 0xF935;
        AnimationUtil.F[0xC754 ^ 0xC79A] = 0x5AC9 ^ 0xC79A;
        AnimationUtil.F[0x72C8 ^ 0x7246] = 0x7214 ^ 0x7246;
        AnimationUtil.F[0xB426 ^ 0xB444] = 0xFFFF4B99 ^ 0xB444;
        AnimationUtil.F[0xBD94 ^ 0xBCB1] = 0x4D05 ^ 0xBCB1;
        AnimationUtil.F[0xD985 ^ 0xD8D5] = 0x6DEF ^ 0xD8D5;
        AnimationUtil.F[0x486 ^ 0x5E0] = 0x3511 ^ 0x5E0;
        AnimationUtil.F[0x1029 ^ 0x1081] = 0x86E4 ^ 0x1081;
        AnimationUtil.F[0x34DD ^ 0x3553] = 0x355F ^ 0x3553;
        AnimationUtil.F[0x2E53 ^ 0x2E0E] = 0x2E35 ^ 0x2E0E;
        AnimationUtil.F[0x7B8 ^ 0x695] = 0xFFFF7435 ^ 0x695;
        AnimationUtil.F[0x10175 ^ 0x1000E] = 0x1000F ^ 0x1000E;
        AnimationUtil.F[0xC656 ^ 0xC63A] = 0xC66F ^ 0xC63A;
        AnimationUtil.F[0x5B98 ^ 0x5B43] = 0x921E ^ 0x5B43;
        AnimationUtil.F[0xA24E ^ 0xA2A7] = 0xF5AD ^ 0xA2A7;
        AnimationUtil.F[0x7722 ^ 0x7633] = 0xFFFF1D87 ^ 0x7633;
        AnimationUtil.F[0x352F ^ 0x35E4] = 0x2122 ^ 0x35E4;
        AnimationUtil.F[0xCD44 ^ 0xCC62] = 0x3D84 ^ 0xCC62;
        AnimationUtil.F[0xE522 ^ 0xE543] = 0xFFFF1AF5 ^ 0xE543;
        AnimationUtil.F[0xDAF4 ^ 0xDB75] = 0xDB5A ^ 0xDB75;
        AnimationUtil.F[0xFD3 ^ 0xE54] = 0xFFFFF1EB ^ 0xE54;
        AnimationUtil.F[0x2B5E ^ 0x2BB2] = 0xAAB5 ^ 0x2BB2;
        AnimationUtil.F[0x167C ^ 0x16D5] = 0x80B1 ^ 0x16D5;
        AnimationUtil.F[0x9401 ^ 0x947B] = 0xFFFF6B96 ^ 0x947B;
        AnimationUtil.F[0xC8AE ^ 0xC8D7] = 0xFFFF375D ^ 0xC8D7;
        AnimationUtil.F[0xF9EC ^ 0xF9B3] = 0xFFFF063F ^ 0xF9B3;
        AnimationUtil.F[0xA118 ^ 0xA1B5] = 0x7AD3 ^ 0xA1B5;
        AnimationUtil.F[0x6529 ^ 0x6558] = 0x650C ^ 0x6558;
        AnimationUtil.F[0x365F ^ 0x377D] = 0x2E70 ^ 0x377D;
        AnimationUtil.F[0xEA33 ^ 0xEB01] = 0x42CC ^ 0xEB01;
        AnimationUtil.F[0x8020 ^ 0x8136] = 0x9585 ^ 0x8136;
        AnimationUtil.F[0x5324 ^ 0x524C] = 0xE94D ^ 0x524C;
        AnimationUtil.F[0xA30C ^ 0xA39F] = 0xA3F4 ^ 0xA39F;
        AnimationUtil.F[0x8AF5 ^ 0x8AEF] = 0x8AB6 ^ 0x8AEF;
        AnimationUtil.F[0xB06B ^ 0xB17C] = 0x3BE4 ^ 0xB17C;
        AnimationUtil.F[0xA9CB ^ 0xA9D0] = 0xA9D0 ^ 0xA9D0;
        AnimationUtil.F[0xD051 ^ 0xD124] = 0xD17A ^ 0xD124;
        AnimationUtil.F[0xCFAB ^ 0xCE98] = 0x2A72 ^ 0xCE98;
        AnimationUtil.F[0x3291 ^ 0x32B3] = 0xFFFFCD49 ^ 0x32B3;
        AnimationUtil.F[0xD3EE ^ 0xD263] = 0xD270 ^ 0xD263;
        AnimationUtil.F[0xD987 ^ 0xD880] = 0x3F8D ^ 0xD880;
        AnimationUtil.F[0x627B ^ 0x62C6] = 0xE7DE ^ 0x62C6;
        AnimationUtil.F[0x18D7 ^ 0x18D5] = 0x18B2 ^ 0x18D5;
        AnimationUtil.F[0x1459 ^ 0x1409] = 0x1D2C ^ 0x1409;
        AnimationUtil.F[0xC7E0 ^ 0xC718] = 0xD60 ^ 0xC718;
        AnimationUtil.F[0x10F46 ^ 0x10EC3] = 0x10EAA ^ 0x10EC3;
        AnimationUtil.F[0xDFCF ^ 0xDE46] = 0xDE6F ^ 0xDE46;
        AnimationUtil.F[0xAAC7 ^ 0xABA2] = 0x3ED2 ^ 0xABA2;
        AnimationUtil.F[0x1032E ^ 0x1039D] = 0x10706 ^ 0x1039D;
        AnimationUtil.F[0xF38F ^ 0xF355] = 0x3A39 ^ 0xF355;
        AnimationUtil.F[0x1080E ^ 0x10839] = 0xFFFEF7BB ^ 0x10839;
        AnimationUtil.F[0x47E2 ^ 0x4768] = 0xFFFFB8CE ^ 0x4768;
        AnimationUtil.F[0xE09 ^ 0xEC5] = 0x93F2 ^ 0xEC5;
        AnimationUtil.F[0x558B ^ 0x5490] = 0x738C ^ 0x5490;
        AnimationUtil.F[0x51D8 ^ 0x5082] = 0x1E1E ^ 0x5082;
        AnimationUtil.F[0x7512 ^ 0x747E] = 0xDEB5 ^ 0x747E;
        AnimationUtil.F[0x347B ^ 0x354E] = 0xD1C6 ^ 0x354E;
        AnimationUtil.F[0xB753 ^ 0xB775] = 0xB70C ^ 0xB775;
        AnimationUtil.F[0x98E1 ^ 0x9892] = 0x9897 ^ 0x9892;
        AnimationUtil.F[0xCB8D ^ 0xCAAC] = 0xD3D4 ^ 0xCAAC;
        AnimationUtil.F[0xBBAF ^ 0xBAD7] = 0xBAD0 ^ 0xBAD7;
        AnimationUtil.F[0x82C2 ^ 0x8279] = 0x18C96 ^ 0x8279;
        AnimationUtil.F[0x2640 ^ 0x2733] = 0xFFFFD896 ^ 0x2733;
        AnimationUtil.F[0x89EB ^ 0x88F1] = 0x27C ^ 0x88F1;
        AnimationUtil.F[0x5A2A ^ 0x5B6B] = 0xFFFFCD76 ^ 0x5B6B;
        AnimationUtil.F[0x97AE ^ 0x9767] = 0x83A1 ^ 0x9767;
        AnimationUtil.F[0xE7AC ^ 0xE7FD] = 0x157A ^ 0xE7FD;
        AnimationUtil.F[0x302D ^ 0x311C] = 0xFFFF672C ^ 0x311C;
        AnimationUtil.F[0x94ED ^ 0x95E3] = 0xEF00 ^ 0x95E3;
        AnimationUtil.F[0x6C79 ^ 0x6C7E] = 0x6C68 ^ 0x6C7E;
        AnimationUtil.F[0x1B7D ^ 0x1B68] = 0x1B82 ^ 0x1B68;
        AnimationUtil.F[0xE077 ^ 0xE00B] = 0xFFFF1FEC ^ 0xE00B;
        AnimationUtil.F[0x7CB9 ^ 0x7C5E] = 0x2B17 ^ 0x7C5E;
        AnimationUtil.F[0xAD64 ^ 0xACEE] = 0xACE8 ^ 0xACEE;
        AnimationUtil.F[0x9D2B ^ 0x9D18] = 0xFFFF628B ^ 0x9D18;
        AnimationUtil.F[0x2A1D ^ 0x2A25] = 0xFFFFD5C4 ^ 0x2A25;
        AnimationUtil.F[0xB36D ^ 0xB309] = 0xB319 ^ 0xB309;
        AnimationUtil.F[0x45A1 ^ 0x4488] = 0x6C84 ^ 0x4488;
        AnimationUtil.F[0xFBB3 ^ 0xFA8D] = 0x5430 ^ 0xFA8D;
        AnimationUtil.F[0xF1EA ^ 0xF087] = 0xF68B ^ 0xF087;
        AnimationUtil.F[0x414B ^ 0x4039] = 0x403A ^ 0x4039;
        AnimationUtil.F[0xFF30 ^ 0xFF76] = 0xFF76 ^ 0xFF76;
        AnimationUtil.F[0x3887 ^ 0x38ED] = 0x38CD ^ 0x38ED;
        AnimationUtil.F[0xF2FD ^ 0xF3FD] = 0xD15A ^ 0xF3FD;
        AnimationUtil.F[0xF358 ^ 0xF3FD] = 0xAC0E ^ 0xF3FD;
        AnimationUtil.F[0x954C ^ 0x954A] = 0x9521 ^ 0x954A;
        AnimationUtil.F[0xBAFF ^ 0xBA12] = 0xFFFFC4A2 ^ 0xBA12;
        AnimationUtil.F[0xE5E5 ^ 0xE549] = 0x3E26 ^ 0xE549;
        AnimationUtil.F[0x9ACA ^ 0x9A57] = 0xDB88 ^ 0x9A57;
        AnimationUtil.F[0x7324 ^ 0x73E2] = 0xFFFF557F ^ 0x73E2;
        AnimationUtil.F[0xE1B6 ^ 0xE1BE] = 0xFFFF1E3D ^ 0xE1BE;
        AnimationUtil.F[0x101D0 ^ 0x100B9] = 0x1404A ^ 0x100B9;
        AnimationUtil.F[0xC7BE ^ 0xC7B1] = 0xFFFF3864 ^ 0xC7B1;
        AnimationUtil.F[0x9E53 ^ 0x9F6C] = 0xF6B7 ^ 0x9F6C;
        AnimationUtil.F[0xE91C ^ 0xE818] = 0xEB1B ^ 0xE818;
        AnimationUtil.F[0xA66D ^ 0xA65F] = 0xA604 ^ 0xA65F;
        AnimationUtil.F[0x5B25 ^ 0x5A0A] = 0xF3CF ^ 0x5A0A;
        AnimationUtil.F[0x9FBA ^ 0x9EE1] = 0x49DD ^ 0x9EE1;
        AnimationUtil.F[0x8D0B ^ 0x8D47] = 0x8D07 ^ 0x8D47;
        AnimationUtil.F[0xE15A ^ 0xE145] = 0xFFFF1EDB ^ 0xE145;
        AnimationUtil.F[0x267E ^ 0x26AD] = 0x9098 ^ 0x26AD;
        AnimationUtil.F[0xE5BE ^ 0xE539] = 0xE576 ^ 0xE539;
        AnimationUtil.F[0xDBA6 ^ 0xDB2A] = 0xDB29 ^ 0xDB2A;
        AnimationUtil.F[0xD68 ^ 0xD20] = 0xD20 ^ 0xD20;
        AnimationUtil.F[0x9AA6 ^ 0x9AFE] = 0x2AC2 ^ 0x9AFE;
        AnimationUtil.F[0x4C8A ^ 0x4C2C] = 0xFFFFEC12 ^ 0x4C2C;
        AnimationUtil.F[0x106B9 ^ 0x107A1] = 0x18D2C ^ 0x107A1;
        AnimationUtil.F[0x35B9 ^ 0x3587] = 0xFFFFCA0F ^ 0x3587;
        AnimationUtil.F[0x782D ^ 0x790A] = 0x514B ^ 0x790A;
        AnimationUtil.F[0xE1D ^ 0xF79] = 0xF6B ^ 0xF79;
        AnimationUtil.F[0xAA2 ^ 0xAA2] = 0xFFFFF535 ^ 0xAA2;
        AnimationUtil.F[0xFEF8 ^ 0xFEF5] = 0xFFFF0131 ^ 0xFEF5;
        AnimationUtil.F[0x10153 ^ 0x1000E] = 0x1D777 ^ 0x1000E;
        AnimationUtil.F[0xA1A3 ^ 0xA08F] = 0x2DE5 ^ 0xA08F;
        AnimationUtil.F[0x3E63 ^ 0x3E13] = 0x3E51 ^ 0x3E13;
        AnimationUtil.F[0x10762 ^ 0x107B5] = 0x10C24 ^ 0x107B5;
        AnimationUtil.F[0xF3B5 ^ 0xF392] = 0xF3F3 ^ 0xF392;
        AnimationUtil.F[0xB58 ^ 0xB19] = 0xB25 ^ 0xB19;
        AnimationUtil.F[0x20ED ^ 0x2025] = 0x34E1 ^ 0x2025;
        AnimationUtil.F[0x7422 ^ 0x74C1] = 0xD257 ^ 0x74C1;
        AnimationUtil.F[0x482C ^ 0x4935] = 0xFFFF3C2F ^ 0x4935;
        AnimationUtil.F[0x8DB1 ^ 0x8D34] = 0x8D92 ^ 0x8D34;
        AnimationUtil.F[0x10378 ^ 0x103A8] = 0x1B59D ^ 0x103A8;
        AnimationUtil.F[0x3A09 ^ 0x3A20] = 0x3A79 ^ 0x3A20;
        AnimationUtil.F[0x960F ^ 0x96D2] = 0x1A4 ^ 0x96D2;
        AnimationUtil.F[0x9832 ^ 0x9877] = 0x9874 ^ 0x9877;
        AnimationUtil.F[0x327C ^ 0x330D] = 0x331D ^ 0x330D;
        AnimationUtil.F[0x455 ^ 0x4E2] = 0x34BF ^ 0x4E2;
        AnimationUtil.F[0x185C ^ 0x18CA] = 0x18CA ^ 0x18CA;
        AnimationUtil.F[0xBC0A ^ 0xBC2F] = 0xFFFF43F6 ^ 0xBC2F;
        AnimationUtil.F[0x1543 ^ 0x1551] = 0x15FA ^ 0x1551;
        AnimationUtil.F[0x6ED1 ^ 0x6E95] = 0x6E8B ^ 0x6E95;
        AnimationUtil.F[0x1B5F ^ 0x1BE5] = 0xFFFEEAC2 ^ 0x1BE5;
        AnimationUtil.F[0xE193 ^ 0xE1CA] = 0xDA74 ^ 0xE1CA;
        AnimationUtil.F[0xC6B3 ^ 0xC68C] = 0xC6C3 ^ 0xC68C;
        AnimationUtil.F[0x5CFA ^ 0x5C6A] = 0xFFFFA3DE ^ 0x5C6A;
        AnimationUtil.F[0x2B3C ^ 0x2A28] = 0x3E9B ^ 0x2A28;
        AnimationUtil.F[0x1048A ^ 0x10594] = 0x12292 ^ 0x10594;
        AnimationUtil.F[0xBCE7 ^ 0xBC10] = 0x7674 ^ 0xBC10;
        AnimationUtil.F[0xC795 ^ 0xC74A] = 0x2F30 ^ 0xC74A;
        AnimationUtil.F[0x716E ^ 0x719C] = 0xA96E ^ 0x719C;
        AnimationUtil.F[0xA0E7 ^ 0xA0DA] = 0xA0C9 ^ 0xA0DA;
        AnimationUtil.F[0x1EF ^ 0x64] = 0x6E ^ 0x64;
        AnimationUtil.F[0xEB7E ^ 0xEA2B] = 0xFFFE11C8 ^ 0xEA2B;
        AnimationUtil.F[0x107EB ^ 0x107C4] = 0xFFFEF815 ^ 0x107C4;
        AnimationUtil.F[0xB782 ^ 0xB796] = 0xB7FC ^ 0xB796;
    }
}

