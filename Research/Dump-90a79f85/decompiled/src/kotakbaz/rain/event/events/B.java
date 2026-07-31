/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_4587
 */
package kotakbaz.rain.event.events;

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
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_4587;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u00020\u0012H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u00020\u0015H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b\u00a8\u0006\u001c"}, d2={"Lkotakbaz/rain/event/events/Render3DEvent;", "", "Lnet/minecraft/class_4587;", "matrices", "", "partialTicks", "<init>", "(Lnet/minecraft/class_4587;F)V", "component1", "()Lnet/minecraft/class_4587;", "component2", "()F", "copy", "(Lnet/minecraft/class_4587;F)Lkotakbaz/rain/event/events/Render3DEvent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lnet/minecraft/class_4587;", "getMatrices", "F", "getPartialTicks", "rain-visuals"})
public final class B {
    @NotNull
    private final class_4587 a;
    private final float A;
    private static Object[] b;
    private static Object c;
    private static Object[] C;
    private static Object[] B;
    private static Object[] d;
    public static int[] D;

    public B(@NotNull class_4587 class_45872, float f2) {
        int n = D[0];
        n -= D[1];
        Intrinsics.checkNotNullParameter(class_45872, (String)b[n += D[2]]);
        super();
        this.a = class_45872;
        this.A = f2;
    }

    @NotNull
    public final class_4587 getMatrices() {
        return this.a;
    }

    public final float getPartialTicks() {
        return this.A;
    }

    @NotNull
    public final class_4587 component1() {
        return this.a;
    }

    public final float component2() {
        return this.A;
    }

    @NotNull
    public final B copy(@NotNull class_4587 class_45872, float f2) {
        int n = D[3];
        n += D[4];
        Intrinsics.checkNotNullParameter(class_45872, (String)b[n ^= D[5]]);
        return new B(class_45872, f2);
    }

    public static /* synthetic */ B copy$default(B b2, class_4587 class_45872, float f2, int n, Object object) {
        int n2 = D[6];
        n2 ^= D[7];
        if ((n & (n2 ^= D[8])) != 0) {
            class_45872 = b2.a;
        }
        int n3 = D[9];
        n3 -= D[10];
        if ((n & (n3 -= D[11])) != 0) {
            f2 = b2.A;
        }
        return b2.copy(class_45872, f2);
    }

    @NotNull
    public String toString() {
        float f2 = this.A;
        class_4587 class_45872 = this.a;
        int n = D[12];
        n += D[13];
        n ^= D[14];
        int n2 = D[15];
        n2 -= D[16];
        int n3 = D[18];
        n3 += D[19];
        int n4 = D[21];
        n4 -= D[22];
        return (String)b[n] + (String)b[n2 ^= D[17]] + class_45872 + (String)b[n3 ^= D[20]] + f2 + (String)b[n4 -= D[23]];
    }

    public int hashCode() {
        long l = 5186886238468753036L;
        long l2 = 5832378751292353556L;
        int n = D[24];
        n += D[25];
        long l3 = l2;
        int n2 = D[27];
        n2 += D[28];
        l2 = l3 ^ ((long)this.a.hashCode() << (n += D[26]) ^ l3) & -1L << (n2 -= D[29]);
        int n3 = D[30];
        n3 -= D[31];
        n3 -= D[32];
        int n4 = D[33];
        n4 ^= D[34];
        n4 += D[35];
        int n5 = D[36];
        n5 ^= D[37];
        long l4 = l2;
        int n6 = D[39];
        n6 += D[40];
        l2 = l4 ^ ((long)((int)(l2 >>> n3) * n4 + Float.hashCode(this.A)) << (n5 ^= D[38]) ^ l4) & -1L << (n6 += D[41]);
        int n7 = D[42];
        n7 -= D[43];
        return (int)(l2 >>> (n7 ^= D[44]));
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            boolean bl = D[45];
            bl += D[46];
            return bl += D[47];
        }
        if (!(object instanceof B)) {
            boolean bl = D[48];
            bl ^= D[49];
            return bl += D[50];
        }
        B b2 = (B)object;
        if (!Intrinsics.areEqual(this.a, b2.a)) {
            boolean bl = D[51];
            bl ^= D[52];
            return bl ^= D[53];
        }
        if (Float.compare(this.A, b2.A) != 0) {
            boolean bl = D[54];
            bl ^= D[55];
            return bl += D[56];
        }
        boolean bl = D[57];
        bl += D[58];
        return bl ^= D[59];
    }

    static {
        kotakbaz.rain.event.events.B.b();
        long l = -1458318229504693456L;
        long l2 = -2060142304223980035L;
        long l3 = 1165943340059481668L;
        long l4 = -7574565747495735522L;
        long l5 = 1362383589202332067L;
        long l6 = -4561235181999579334L;
        long l7 = 6967605856569338699L;
        long l8 = -3879335693326215324L;
        long l9 = -830721223511547893L;
        long l10 = -2713070600192422443L;
        long l11 = 626582918008053114L;
        long l12 = 8859588744437441279L;
        long l13 = 4627394012800689963L;
        long l14 = 5871266518205776865L;
        int n = D[60];
        n += D[61];
        b = new Object[n += D[62]];
        long l15 = l14;
        int n2 = D[63];
        n2 -= D[64];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 -= D[65]);
        Object[] objectArray = new Object[D[66]];
        objectArray[kotakbaz.rain.event.events.B.D[67]] = B;
        objectArray[kotakbaz.rain.event.events.B.D[68]] = D[69];
        int n3 = D[70];
        Object object = kotakbaz.rain.event.events.B.A()[D[71]];
        if (object == null) {
            char[] cArray = "\ucfcb\ucf20\ud008\ucfb8\ucf1e\ucfcb\ud008\ud008\ucf17\ucfb0\ud002\ucf1d\ucffa\ud05d\ucfb1\ucf20\ucfb1\ucf28\ucf20\ud00b\ucfd1\ud05d\ucfd3\ucffe\ucfb0\ud003\ucf28\ucfaf\ucf1a\ucfd2\ucf22\ucfb5\ucf1a\ud015\ud015\ucfd2\ucf1d\ucf23\ucf1f\ucf22\ucf19\ucfcf\ucfaf\ucfd1\ucffa\ucffc\ucfd5\ucfd3\ud005\ucf1f\ucfcf\ucf2b\ud001\ucfcb\ud008\ucfce\ucfb8\ucf16\ucf28\ud00b\ucf22\ucfff\ud014\ud012\ud00b\ucfcf\ucfb1\ucf28\ucff6\ucfd4\ud059\ucf16\ucf1b\ucffe\ucffd\ucffe\ucff7\ud00e\ud000\ucfff\ucf1a\ucfb2\ud012\ucffc\ucfd4\ucffe\ucf19\ucfff\ucf17\ucfae\ucfd8\ucffa\ucf1b\ucffa\ucf1a\ucffe\ud001\ucfb8\ucfb8\ucfd2\ucfd4\ucfd0\ud004\ucffe\ucfce\ud011\ucffd\ud00f\ud014\ud00e\ucffb\ucfd4\ucf20\ucf1a\ud005\ucf20\ucffc\ucf1c\ud05d\ucfcb\ucff9\ucf19\ucfd1\ucf22\ucfb3\ucfb8\ud001\ucf16".toCharArray();
            for (int i = D[72]; i < D[73]; ++i) {
                int n4 = cArray[i];
                n4 += D[74];
                n4 += D[75];
                n4 ^= D[76];
                n4 -= D[77];
                n4 += D[78];
                n4 += D[79];
                n4 += D[80];
                n4 += D[81];
                n4 += D[82];
                n4 += D[83];
                n4 ^= D[84];
                cArray[i] = (char)(n4 -= D[85]);
            }
            object = kotakbaz.rain.event.events.B.A()[kotakbaz.rain.event.events.B.D[86]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)kotakbaz.rain.event.events.B.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = D[87];
        n5 ^= D[88];
        l5 = l16 ^ (0x4300000000L ^ l16) & -1L << (n5 += D[89]);
        long l17 = l12;
        int n6 = D[90];
        n6 -= D[91];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 += D[92]);
        while (true) {
            int n7 = D[93];
            n7 -= D[94];
            if ((int)l12 >= (int)(l5 >>> (n7 -= D[95]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = D[96];
            n9 -= D[97];
            int n10 = D[99];
            n10 -= D[100];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 += D[98])) & -1L >>> (n10 -= D[101]);
            long l19 = l8;
            int n11 = D[102];
            n11 -= D[103];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 ^= D[104]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = D[105];
            n13 += D[106];
            int n14 = D[108];
            n14 ^= D[109];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 ^= D[107])) & -1L >>> (n14 -= D[110]);
            int n15 = D[111];
            n15 += D[112];
            long l21 = l9;
            int n16 = D[114];
            n16 -= D[115];
            l9 = l21 ^ ((long)cArray[n12] << (n15 += D[113]) ^ l21) & -1L << (n16 -= D[116]);
            int n17 = D[117];
            n17 -= D[118];
            n17 += D[119];
            int n18 = D[120];
            n18 += D[121];
            long l22 = l11;
            int n19 = D[123];
            n19 -= D[124];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 -= D[122]))) ^ l22) & -1L >>> (n19 -= D[125]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = D[126];
            n20 -= D[127];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 -= D[128]);
            while (true) {
                int n21 = D[129];
                n21 -= D[130];
                if ((int)(l13 >>> (n21 += D[131])) >= (int)l11) break;
                int n22 = D[132];
                n22 += D[133];
                int n23 = D[135];
                n23 -= D[136];
                cArray2[(int)(l13 >>> (n22 += kotakbaz.rain.event.events.B.D[134]))] = cArray[(int)l12 + (int)(l13 >>> (n23 ^= D[137]))];
                l13 += 0x100000000L;
            }
            int n24 = D[138];
            n24 ^= D[139];
            int n25 = (int)(l14 >>> (n24 += D[140]));
            l14 += 0x100000000L;
            kotakbaz.rain.event.events.B.b[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = D[141];
            n26 -= D[142];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 ^= D[143]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[D[144]];
        String string = (String)object[D[145]];
        object = object[D[146]];
        Object[] objectArray = C;
        if (C == null) {
            objectArray = C = new Object[D[147]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[D[148]];
                B = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[D[150] ^ D[151]];
                byArray[kotakbaz.rain.event.events.B.D[152] ^ kotakbaz.rain.event.events.B.D[153]] = D[154] ^ D[155];
                byArray[kotakbaz.rain.event.events.B.D[156] ^ kotakbaz.rain.event.events.B.D[157]] = D[158] ^ D[159];
                byArray[kotakbaz.rain.event.events.B.D[160] ^ kotakbaz.rain.event.events.B.D[161]] = D[162] ^ D[163];
                byArray[kotakbaz.rain.event.events.B.D[164] ^ kotakbaz.rain.event.events.B.D[165]] = D[166] ^ D[167];
                byArray[kotakbaz.rain.event.events.B.D[168] ^ kotakbaz.rain.event.events.B.D[169]] = D[170] ^ D[171];
                byArray[kotakbaz.rain.event.events.B.D[172] ^ kotakbaz.rain.event.events.B.D[173]] = D[174] ^ D[175];
                byArray[kotakbaz.rain.event.events.B.D[176] ^ kotakbaz.rain.event.events.B.D[177]] = D[178] ^ D[179];
                byArray[kotakbaz.rain.event.events.B.D[180] ^ kotakbaz.rain.event.events.B.D[181]] = D[182] ^ D[183];
                byArray[kotakbaz.rain.event.events.B.D[184] ^ kotakbaz.rain.event.events.B.D[185]] = D[186] ^ D[187];
                byArray[kotakbaz.rain.event.events.B.D[188] ^ kotakbaz.rain.event.events.B.D[189]] = D[190] ^ D[191];
                byArray[kotakbaz.rain.event.events.B.D[192] ^ kotakbaz.rain.event.events.B.D[193]] = D[194] ^ D[195];
                byArray[kotakbaz.rain.event.events.B.D[196] ^ kotakbaz.rain.event.events.B.D[197]] = D[198] ^ D[199];
                byArray[kotakbaz.rain.event.events.B.D[200] ^ kotakbaz.rain.event.events.B.D[201]] = D[202] ^ D[203];
                byArray[kotakbaz.rain.event.events.B.D[204] ^ kotakbaz.rain.event.events.B.D[205]] = D[206] ^ D[207];
                byArray[kotakbaz.rain.event.events.B.D[208] ^ kotakbaz.rain.event.events.B.D[209]] = D[210] ^ D[211];
                byArray[kotakbaz.rain.event.events.B.D[212] ^ kotakbaz.rain.event.events.B.D[213]] = D[214] ^ D[215];
                objectArray2[kotakbaz.rain.event.events.B.D[149]] = byArray;
            }
            byte[] byArray = (byte[])object3[D[216]];
            if (c == null) {
                byte[] byArray2 = new byte[D[217] ^ D[218]];
                byArray2[kotakbaz.rain.event.events.B.D[219] ^ kotakbaz.rain.event.events.B.D[220]] = D[221] ^ D[222];
                byArray2[kotakbaz.rain.event.events.B.D[223] ^ kotakbaz.rain.event.events.B.D[224]] = D[225] ^ D[226];
                byArray2[kotakbaz.rain.event.events.B.D[227] ^ kotakbaz.rain.event.events.B.D[228]] = D[229] ^ D[230];
                byArray2[kotakbaz.rain.event.events.B.D[231] ^ kotakbaz.rain.event.events.B.D[232]] = D[233] ^ D[234];
                byArray2[kotakbaz.rain.event.events.B.D[235] ^ kotakbaz.rain.event.events.B.D[236]] = D[237] ^ D[238];
                byArray2[kotakbaz.rain.event.events.B.D[239] ^ kotakbaz.rain.event.events.B.D[240]] = D[241] ^ D[242];
                byArray2[kotakbaz.rain.event.events.B.D[243] ^ kotakbaz.rain.event.events.B.D[244]] = D[245] ^ D[246];
                byArray2[kotakbaz.rain.event.events.B.D[247] ^ kotakbaz.rain.event.events.B.D[248]] = D[249] ^ D[250];
                byArray2[kotakbaz.rain.event.events.B.D[251] ^ kotakbaz.rain.event.events.B.D[252]] = D[253] ^ D[254];
                byArray2[kotakbaz.rain.event.events.B.D[255] ^ kotakbaz.rain.event.events.B.D[256]] = D[257] ^ D[258];
                byArray2[kotakbaz.rain.event.events.B.D[259] ^ kotakbaz.rain.event.events.B.D[260]] = D[261] ^ D[262];
                byArray2[kotakbaz.rain.event.events.B.D[263] ^ kotakbaz.rain.event.events.B.D[264]] = D[265] ^ D[266];
                byArray2[kotakbaz.rain.event.events.B.D[267] ^ kotakbaz.rain.event.events.B.D[268]] = D[269] ^ D[270];
                byArray2[kotakbaz.rain.event.events.B.D[271] ^ kotakbaz.rain.event.events.B.D[272]] = D[273] ^ D[274];
                byArray2[kotakbaz.rain.event.events.B.D[275] ^ kotakbaz.rain.event.events.B.D[276]] = D[277] ^ D[278];
                byArray2[kotakbaz.rain.event.events.B.D[279] ^ kotakbaz.rain.event.events.B.D[280]] = D[281] ^ D[282];
                byArray2[kotakbaz.rain.event.events.B.D[283] ^ kotakbaz.rain.event.events.B.D[284]] = D[285] ^ D[286];
                byArray2[kotakbaz.rain.event.events.B.D[287] ^ kotakbaz.rain.event.events.B.D[288]] = D[289] ^ D[290];
                byArray2[kotakbaz.rain.event.events.B.D[291] ^ kotakbaz.rain.event.events.B.D[292]] = D[293] ^ D[294];
                byArray2[kotakbaz.rain.event.events.B.D[295] ^ kotakbaz.rain.event.events.B.D[296]] = D[297] ^ D[298];
                byArray2[kotakbaz.rain.event.events.B.D[299] ^ kotakbaz.rain.event.events.B.D[300]] = D[301] ^ D[302];
                byArray2[kotakbaz.rain.event.events.B.D[303] ^ kotakbaz.rain.event.events.B.D[304]] = D[305] ^ D[306];
                byArray2[kotakbaz.rain.event.events.B.D[307] ^ kotakbaz.rain.event.events.B.D[308]] = D[309] ^ D[310];
                byArray2[kotakbaz.rain.event.events.B.D[311] ^ kotakbaz.rain.event.events.B.D[312]] = D[313] ^ D[314];
                byArray2[kotakbaz.rain.event.events.B.D[315] ^ kotakbaz.rain.event.events.B.D[316]] = D[317] ^ D[318];
                byArray2[kotakbaz.rain.event.events.B.D[319] ^ kotakbaz.rain.event.events.B.D[320]] = D[321] ^ D[322];
                byArray2[kotakbaz.rain.event.events.B.D[323] ^ kotakbaz.rain.event.events.B.D[324]] = D[325] ^ D[326];
                byArray2[kotakbaz.rain.event.events.B.D[327] ^ kotakbaz.rain.event.events.B.D[328]] = D[329] ^ D[330];
                byArray2[kotakbaz.rain.event.events.B.D[331] ^ kotakbaz.rain.event.events.B.D[332]] = D[333] ^ D[334];
                byArray2[kotakbaz.rain.event.events.B.D[335] ^ kotakbaz.rain.event.events.B.D[336]] = D[337] ^ D[338];
                byArray2[kotakbaz.rain.event.events.B.D[339] ^ kotakbaz.rain.event.events.B.D[340]] = D[341] ^ D[342];
                byArray2[kotakbaz.rain.event.events.B.D[343] ^ kotakbaz.rain.event.events.B.D[344]] = D[345] ^ D[346];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, D[347], byArray3, D[348], byArray.length);
                System.arraycopy(byArray2, D[349], byArray3, byArray.length, byArray2.length);
                Object object4 = kotakbaz.rain.event.events.B.A()[D[350]];
                if (object4 == null) {
                    char[] cArray = "\u034c\u0352\u0357\u0358\u035e\u02a2\u034b\u02f9\u0368\u0304\u0364\u0305\u02f1\u02ef\u033f\u0364\u0351\u02a1".toCharArray();
                    for (int i = D[351]; i < D[352]; ++i) {
                        int n2 = cArray[i];
                        n2 += D[353];
                        n2 ^= D[354];
                        n2 -= D[355];
                        n2 -= D[356];
                        n2 -= D[357];
                        n2 ^= D[358];
                        n2 ^= D[359];
                        n2 -= D[360];
                        n2 += D[361];
                        cArray[i] = (char)(n2 += D[362]);
                    }
                    object4 = kotakbaz.rain.event.events.B.A()[kotakbaz.rain.event.events.B.D[363]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[D[364]];
                byArray4[kotakbaz.rain.event.events.B.D[365]] = D[366];
                byArray4[kotakbaz.rain.event.events.B.D[367]] = D[368];
                byArray4[kotakbaz.rain.event.events.B.D[369]] = D[370];
                byArray4[kotakbaz.rain.event.events.B.D[371]] = D[372];
                byArray4[kotakbaz.rain.event.events.B.D[373]] = D[374];
                byArray4[kotakbaz.rain.event.events.B.D[375]] = D[376];
                byArray4[kotakbaz.rain.event.events.B.D[377]] = D[378];
                byArray4[kotakbaz.rain.event.events.B.D[379]] = D[380];
                byArray4[kotakbaz.rain.event.events.B.D[381]] = D[382];
                byArray4[kotakbaz.rain.event.events.B.D[383]] = D[384];
                byArray4[kotakbaz.rain.event.events.B.D[385]] = D[386];
                byArray4[kotakbaz.rain.event.events.B.D[387]] = D[388];
                byArray4[kotakbaz.rain.event.events.B.D[389]] = D[390];
                byArray4[kotakbaz.rain.event.events.B.D[391]] = D[392];
                byArray4[kotakbaz.rain.event.events.B.D[393]] = D[394];
                byArray4[kotakbaz.rain.event.events.B.D[395]] = D[396];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, D[397], D[398]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = kotakbaz.rain.event.events.B.A()[D[399]];
                if (object5 == null) {
                    char[] cArray = "\u9be3\u9b9f\u9bc1".toCharArray();
                    for (int i = 0; i < 3; ++i) {
                        int n3 = cArray[i];
                        n3 ^= 0x6121;
                        n3 -= 19945;
                        n3 -= 24909;
                        n3 += 52592;
                        n3 += 41361;
                        n3 += 64338;
                        n3 ^= 0x7C14;
                        n3 += 53142;
                        n3 ^= 0xF0B7;
                        n3 -= 16824;
                        n3 -= 55641;
                        n3 += 4667;
                        n3 += 6524;
                        cArray[i] = (char)(n3 ^= 0x7A3D);
                    }
                    object5 = kotakbaz.rain.event.events.B.A()[2] = new String(cArray);
                }
                c = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = kotakbaz.rain.event.events.B.A()[3];
            if (object6 == null) {
                char[] cArray = "\u3150\u3134\u3262\u31de\u3132\u314f\u3132\u31de\u327d\u314a\u3132\u3262\u31c4\u327d\u30f0\u31d1\u31d1\u30e8\u318b\u30e6".toCharArray();
                for (int i = 0; i < 20; ++i) {
                    int n4 = cArray[i];
                    n4 += 18311;
                    n4 -= 11720;
                    n4 -= 39817;
                    n4 += 36329;
                    n4 ^= 0x788C;
                    n4 += 22124;
                    n4 ^= 0x460F;
                    n4 ^= 0x19D5;
                    n4 -= 1269;
                    n4 -= 64630;
                    n4 ^= 0x3DB6;
                    n4 ^= 0x2CF8;
                    n4 += 39836;
                    n4 ^= 0xBDBC;
                    cArray[i] = (char)(n4 ^= 0xD2FD);
                }
                object6 = kotakbaz.rain.event.events.B.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)c), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = d;
        if (d == null) {
            d = new Object[4];
            objectArray = d;
        }
        return objectArray;
    }

    public static void b() {
        D = new int[0xF8C4 ^ 0xF954];
        kotakbaz.rain.event.events.B.D[0x4329 ^ 0x4376] = 0x435B ^ 0x4376;
        kotakbaz.rain.event.events.B.D[0xF7D ^ 0xFD3] = 0xFFFF5A46 ^ 0xFD3;
        kotakbaz.rain.event.events.B.D[0x4B0D ^ 0x4B47] = 0xEA47 ^ 0x4B47;
        kotakbaz.rain.event.events.B.D[0x38A8 ^ 0x39C8] = 0x39DA ^ 0x39C8;
        kotakbaz.rain.event.events.B.D[0x106E6 ^ 0x107F0] = 0x1D77E ^ 0x107F0;
        kotakbaz.rain.event.events.B.D[0xFC35 ^ 0xFD1C] = 0xFFFF0178 ^ 0xFD1C;
        kotakbaz.rain.event.events.B.D[0x9A4B ^ 0x9ACF] = 0xFFFF65B3 ^ 0x9ACF;
        kotakbaz.rain.event.events.B.D[0x26C1 ^ 0x27A2] = 0x18F4 ^ 0x27A2;
        kotakbaz.rain.event.events.B.D[0xA3E4 ^ 0xA2C9] = 0xFFFF13F6 ^ 0xA2C9;
        kotakbaz.rain.event.events.B.D[0x25B8 ^ 0x25DF] = 0x25E5 ^ 0x25DF;
        kotakbaz.rain.event.events.B.D[0xED20 ^ 0xEC46] = 0x818F ^ 0xEC46;
        kotakbaz.rain.event.events.B.D[0xC7D9 ^ 0xC7BB] = 0xFFFF3858 ^ 0xC7BB;
        kotakbaz.rain.event.events.B.D[0x9FAD ^ 0x9F6C] = 0x95FE ^ 0x9F6C;
        kotakbaz.rain.event.events.B.D[0x52C8 ^ 0x53B4] = 0x53F9 ^ 0x53B4;
        kotakbaz.rain.event.events.B.D[0x406F ^ 0x409A] = 0xFFFF1054 ^ 0x409A;
        kotakbaz.rain.event.events.B.D[0xBFB2 ^ 0xBF00] = 0xFFFFF70A ^ 0xBF00;
        kotakbaz.rain.event.events.B.D[0xE44 ^ 0xE48] = 0xE57 ^ 0xE48;
        kotakbaz.rain.event.events.B.D[0x3969 ^ 0x38E9] = 0xFFFFC70E ^ 0x38E9;
        kotakbaz.rain.event.events.B.D[0xEFB7 ^ 0xEFB5] = 0xEF8E ^ 0xEFB5;
        kotakbaz.rain.event.events.B.D[0xF817 ^ 0xF8CD] = 0xCB3F ^ 0xF8CD;
        kotakbaz.rain.event.events.B.D[0xB9DA ^ 0xB880] = 0x9DC2 ^ 0xB880;
        kotakbaz.rain.event.events.B.D[0xADDA ^ 0xAD8B] = 0x78B2 ^ 0xAD8B;
        kotakbaz.rain.event.events.B.D[0xD2E9 ^ 0xD234] = 0xFFFF8CCC ^ 0xD234;
        kotakbaz.rain.event.events.B.D[0x26A7 ^ 0x2697] = 0xFFFFD901 ^ 0x2697;
        kotakbaz.rain.event.events.B.D[0xC7E9 ^ 0xC66D] = 0xFFFF39CB ^ 0xC66D;
        kotakbaz.rain.event.events.B.D[0x1B21 ^ 0x1B75] = 0x8BEB ^ 0x1B75;
        kotakbaz.rain.event.events.B.D[0x5616 ^ 0x56F2] = 0x3D30 ^ 0x56F2;
        kotakbaz.rain.event.events.B.D[0x4C8 ^ 0x4F6] = 0xFFFFFB12 ^ 0x4F6;
        kotakbaz.rain.event.events.B.D[0x66C5 ^ 0x660D] = 0x4403 ^ 0x660D;
        kotakbaz.rain.event.events.B.D[0x9BFF ^ 0x9A84] = 0x9A88 ^ 0x9A84;
        kotakbaz.rain.event.events.B.D[0xC402 ^ 0xC555] = 0xE010 ^ 0xC555;
        kotakbaz.rain.event.events.B.D[0x218D ^ 0x212B] = 0x88D7 ^ 0x212B;
        kotakbaz.rain.event.events.B.D[0x4C90 ^ 0x4C6D] = 0xFFFF68EA ^ 0x4C6D;
        kotakbaz.rain.event.events.B.D[0x1E51 ^ 0x1F4A] = 0x9A99 ^ 0x1F4A;
        kotakbaz.rain.event.events.B.D[0x10159 ^ 0x1007D] = 0x17D75 ^ 0x1007D;
        kotakbaz.rain.event.events.B.D[0xC449 ^ 0xC4A3] = 0xD11B ^ 0xC4A3;
        kotakbaz.rain.event.events.B.D[0x101CF ^ 0x10144] = 0xFFFEFEBF ^ 0x10144;
        kotakbaz.rain.event.events.B.D[0xC340 ^ 0xC210] = 0xF68B ^ 0xC210;
        kotakbaz.rain.event.events.B.D[0x648F ^ 0x6446] = 0x464E ^ 0x6446;
        kotakbaz.rain.event.events.B.D[0x916F ^ 0x900A] = 0xF1F2 ^ 0x900A;
        kotakbaz.rain.event.events.B.D[0xDA74 ^ 0xDB46] = 0x3AD6 ^ 0xDB46;
        kotakbaz.rain.event.events.B.D[0x4DBC ^ 0x4CC8] = 0x4CBC ^ 0x4CC8;
        kotakbaz.rain.event.events.B.D[0x2CDB ^ 0x2CE9] = 0x2C93 ^ 0x2CE9;
        kotakbaz.rain.event.events.B.D[0x9B27 ^ 0x9B55] = 0xFFFF64EE ^ 0x9B55;
        kotakbaz.rain.event.events.B.D[0x4E62 ^ 0x4FEA] = 0x4FA3 ^ 0x4FEA;
        kotakbaz.rain.event.events.B.D[0xCE7C ^ 0xCE0D] = 0xCE70 ^ 0xCE0D;
        kotakbaz.rain.event.events.B.D[0x781D ^ 0x7806] = 0xFFFF8781 ^ 0x7806;
        kotakbaz.rain.event.events.B.D[0xEEC2 ^ 0xEE39] = 0x3524 ^ 0xEE39;
        kotakbaz.rain.event.events.B.D[0x501 ^ 0x463] = 0x726 ^ 0x463;
        kotakbaz.rain.event.events.B.D[0x104 ^ 0x69] = 0x68 ^ 0x69;
        kotakbaz.rain.event.events.B.D[0x5365 ^ 0x534E] = 0xFFFFACF2 ^ 0x534E;
        kotakbaz.rain.event.events.B.D[0x3CB4 ^ 0x3C29] = 0x8261 ^ 0x3C29;
        kotakbaz.rain.event.events.B.D[0x14B2 ^ 0x1432] = 0x1440 ^ 0x1432;
        kotakbaz.rain.event.events.B.D[0xBAB3 ^ 0xBBE6] = 0x647E ^ 0xBBE6;
        kotakbaz.rain.event.events.B.D[0x4197 ^ 0x40C8] = 0x40C8 ^ 0x40C8;
        kotakbaz.rain.event.events.B.D[0xC11A ^ 0xC006] = 0x45D9 ^ 0xC006;
        kotakbaz.rain.event.events.B.D[0x1820 ^ 0x1978] = 0x3C3A ^ 0x1978;
        kotakbaz.rain.event.events.B.D[0x7470 ^ 0x7506] = 0xFFFF8AFA ^ 0x7506;
        kotakbaz.rain.event.events.B.D[0xF748 ^ 0xF609] = 0xFFFFF74A ^ 0xF609;
        kotakbaz.rain.event.events.B.D[0x6570 ^ 0x6458] = 0x67A1 ^ 0x6458;
        kotakbaz.rain.event.events.B.D[0xA597 ^ 0xA5D3] = 0xA5D2 ^ 0xA5D3;
        kotakbaz.rain.event.events.B.D[0x39E9 ^ 0x38D8] = 0xFFFF26ED ^ 0x38D8;
        kotakbaz.rain.event.events.B.D[0x2630 ^ 0x275C] = 0x274C ^ 0x275C;
        kotakbaz.rain.event.events.B.D[0x2655 ^ 0x2651] = 0xFFFFD9CE ^ 0x2651;
        kotakbaz.rain.event.events.B.D[0x91C9 ^ 0x9086] = 0xA410 ^ 0x9086;
        kotakbaz.rain.event.events.B.D[0x6FA0 ^ 0x6E22] = 0x6E05 ^ 0x6E22;
        kotakbaz.rain.event.events.B.D[0x6DC0 ^ 0x6C8C] = 0x8890 ^ 0x6C8C;
        kotakbaz.rain.event.events.B.D[0x62FA ^ 0x62EA] = 0x62CA ^ 0x62EA;
        kotakbaz.rain.event.events.B.D[0x8C3 ^ 0x83B] = 0xFEA1 ^ 0x83B;
        kotakbaz.rain.event.events.B.D[0x8EF0 ^ 0x8E45] = 0x2966 ^ 0x8E45;
        kotakbaz.rain.event.events.B.D[0xC83D ^ 0xC81D] = 0xFFFF37AB ^ 0xC81D;
        kotakbaz.rain.event.events.B.D[0x8EDF ^ 0x8F52] = 0x8F4E ^ 0x8F52;
        kotakbaz.rain.event.events.B.D[0x281F ^ 0x2825] = 0xFFFFD7D9 ^ 0x2825;
        kotakbaz.rain.event.events.B.D[0x89BD ^ 0x89AA] = 0xFFFF7618 ^ 0x89AA;
        kotakbaz.rain.event.events.B.D[0x5AC4 ^ 0x5BCD] = 0xA3C9 ^ 0x5BCD;
        kotakbaz.rain.event.events.B.D[0x415F ^ 0x416C] = 0x413E ^ 0x416C;
        kotakbaz.rain.event.events.B.D[0xD721 ^ 0xD726] = 0xFFFF28CD ^ 0xD726;
        kotakbaz.rain.event.events.B.D[0x1D5F ^ 0x1D7B] = 0x1D03 ^ 0x1D7B;
        kotakbaz.rain.event.events.B.D[0x6E1D ^ 0x6EA1] = 0xC0DA ^ 0x6EA1;
        kotakbaz.rain.event.events.B.D[0x95E3 ^ 0x95BA] = 0xFFFF6A1F ^ 0x95BA;
        kotakbaz.rain.event.events.B.D[0x88E9 ^ 0x88EF] = 0xFFFF776B ^ 0x88EF;
        kotakbaz.rain.event.events.B.D[0xF456 ^ 0xF532] = 0xA135 ^ 0xF532;
        kotakbaz.rain.event.events.B.D[0x460D ^ 0x4734] = 0xFFFF1FAA ^ 0x4734;
        kotakbaz.rain.event.events.B.D[0x69B1 ^ 0x6984] = 0xFFFF9625 ^ 0x6984;
        kotakbaz.rain.event.events.B.D[0x10231 ^ 0x102E1] = 0x138F8 ^ 0x102E1;
        kotakbaz.rain.event.events.B.D[0xC4B ^ 0xD4F] = 0x6633 ^ 0xD4F;
        kotakbaz.rain.event.events.B.D[0xA74F ^ 0xA7F6] = 0xBE85 ^ 0xA7F6;
        kotakbaz.rain.event.events.B.D[0xE2A4 ^ 0xE201] = 0x4BA6 ^ 0xE201;
        kotakbaz.rain.event.events.B.D[0xA159 ^ 0xA1C1] = 0xF331 ^ 0xA1C1;
        kotakbaz.rain.event.events.B.D[0x1C5D ^ 0x1C8E] = 0x269D ^ 0x1C8E;
        kotakbaz.rain.event.events.B.D[0xBB93 ^ 0xBAF9] = 0xC146 ^ 0xBAF9;
        kotakbaz.rain.event.events.B.D[0x65EA ^ 0x649F] = 0x649F ^ 0x649F;
        kotakbaz.rain.event.events.B.D[0xC40B ^ 0xC4A8] = 0x77DB ^ 0xC4A8;
        kotakbaz.rain.event.events.B.D[0x10741 ^ 0x10767] = 0xFFFEF8B5 ^ 0x10767;
        kotakbaz.rain.event.events.B.D[0xCD73 ^ 0xCC30] = 0x1C21C ^ 0xCC30;
        kotakbaz.rain.event.events.B.D[0x222D ^ 0x2273] = 0xFFFFDD8E ^ 0x2273;
        kotakbaz.rain.event.events.B.D[0x796C ^ 0x782C] = 0x86C8 ^ 0x782C;
        kotakbaz.rain.event.events.B.D[0x10F33 ^ 0x10E2A] = 0x1DEB7 ^ 0x10E2A;
        kotakbaz.rain.event.events.B.D[0x3410 ^ 0x34C2] = 0xEA4 ^ 0x34C2;
        kotakbaz.rain.event.events.B.D[0x451F ^ 0x458E] = 0x458C ^ 0x458E;
        kotakbaz.rain.event.events.B.D[0xF758 ^ 0xF649] = 0x7C1A ^ 0xF649;
        kotakbaz.rain.event.events.B.D[0xE84 ^ 0xE74] = 0x93FB ^ 0xE74;
        kotakbaz.rain.event.events.B.D[0xD5B7 ^ 0xD521] = 0xE5C4 ^ 0xD521;
        kotakbaz.rain.event.events.B.D[0xAAF6 ^ 0xABAB] = 0xABAB ^ 0xABAB;
        kotakbaz.rain.event.events.B.D[0x9359 ^ 0x93A7] = 0x48BC ^ 0x93A7;
        kotakbaz.rain.event.events.B.D[0x46EB ^ 0x46B6] = 0x46FC ^ 0x46B6;
        kotakbaz.rain.event.events.B.D[0x97CA ^ 0x9705] = 0x19B7D ^ 0x9705;
        kotakbaz.rain.event.events.B.D[0x73D1 ^ 0x733E] = 0xEEA8 ^ 0x733E;
        kotakbaz.rain.event.events.B.D[0x823A ^ 0x8210] = 0xFFFF7D84 ^ 0x8210;
        kotakbaz.rain.event.events.B.D[0x10322 ^ 0x103FD] = 0x13E65 ^ 0x103FD;
        kotakbaz.rain.event.events.B.D[0x824F ^ 0x8281] = 0xFFFE712C ^ 0x8281;
        kotakbaz.rain.event.events.B.D[0x3C77 ^ 0x3D07] = 0xFFFFC2C1 ^ 0x3D07;
        kotakbaz.rain.event.events.B.D[0x63A ^ 0x6D7] = 0xD8BE ^ 0x6D7;
        kotakbaz.rain.event.events.B.D[0x1399 ^ 0x1330] = 0x7287 ^ 0x1330;
        kotakbaz.rain.event.events.B.D[0xC0CD ^ 0xC1FB] = 0xA56A ^ 0xC1FB;
        kotakbaz.rain.event.events.B.D[0x91A9 ^ 0x91A4] = 0x91E5 ^ 0x91A4;
        kotakbaz.rain.event.events.B.D[0x3833 ^ 0x3812] = 0x3855 ^ 0x3812;
        kotakbaz.rain.event.events.B.D[0x661B ^ 0x6769] = 0x6757 ^ 0x6769;
        kotakbaz.rain.event.events.B.D[0xE944 ^ 0xE920] = 0xFFFF16AF ^ 0xE920;
        kotakbaz.rain.event.events.B.D[0x4E20 ^ 0x4E6E] = 0x12FB ^ 0x4E6E;
        kotakbaz.rain.event.events.B.D[0x8EBC ^ 0x8E92] = 0x8EF6 ^ 0x8E92;
        kotakbaz.rain.event.events.B.D[0x6551 ^ 0x641F] = 0x8003 ^ 0x641F;
        kotakbaz.rain.event.events.B.D[0x93D0 ^ 0x9343] = 0x9342 ^ 0x9343;
        kotakbaz.rain.event.events.B.D[0xC560 ^ 0xC5BC] = 0x64A6 ^ 0xC5BC;
        kotakbaz.rain.event.events.B.D[0x1D76 ^ 0x1D4F] = 0xFFFFE2E4 ^ 0x1D4F;
        kotakbaz.rain.event.events.B.D[0xABFF ^ 0xAACA] = 0xFFFF31EA ^ 0xAACA;
        kotakbaz.rain.event.events.B.D[0x106E9 ^ 0x10791] = 0xFFFEF823 ^ 0x10791;
        kotakbaz.rain.event.events.B.D[0xF3DB ^ 0xF30E] = 0x97D0 ^ 0xF30E;
        kotakbaz.rain.event.events.B.D[0x3070 ^ 0x311F] = 0x3117 ^ 0x311F;
        kotakbaz.rain.event.events.B.D[0x6EC8 ^ 0x6E3A] = 0xF3B5 ^ 0x6E3A;
        kotakbaz.rain.event.events.B.D[0xF17F ^ 0xF024] = 0xF024 ^ 0xF024;
        kotakbaz.rain.event.events.B.D[0xEFAF ^ 0xEF5B] = 0x4046 ^ 0xEF5B;
        kotakbaz.rain.event.events.B.D[0xA295 ^ 0xA2AD] = 0xA2C3 ^ 0xA2AD;
        kotakbaz.rain.event.events.B.D[0x1BB9 ^ 0x1AA3] = 0xCA6E ^ 0x1AA3;
        kotakbaz.rain.event.events.B.D[0x6356 ^ 0x625E] = 0x9A36 ^ 0x625E;
        kotakbaz.rain.event.events.B.D[0x1044A ^ 0x1056B] = 0x4F9 ^ 0x1056B;
        kotakbaz.rain.event.events.B.D[0x1021 ^ 0x10A0] = 0xFFFFEF74 ^ 0x10A0;
        kotakbaz.rain.event.events.B.D[0x24C0 ^ 0x2482] = 0x2481 ^ 0x2482;
        kotakbaz.rain.event.events.B.D[0x6F2C ^ 0x6E52] = 0xFFFF9197 ^ 0x6E52;
        kotakbaz.rain.event.events.B.D[0x10547 ^ 0x1043A] = 0x10437 ^ 0x1043A;
        kotakbaz.rain.event.events.B.D[0x7556 ^ 0x7555] = 0x751C ^ 0x7555;
        kotakbaz.rain.event.events.B.D[0xBD3C ^ 0xBDA6] = 0xFFFF10E7 ^ 0xBDA6;
        kotakbaz.rain.event.events.B.D[0x1075F ^ 0x107CA] = 0x107CA ^ 0x107CA;
        kotakbaz.rain.event.events.B.D[0xB322 ^ 0xB354] = 0xB361 ^ 0xB354;
        kotakbaz.rain.event.events.B.D[0x2C6E ^ 0x2C1A] = 0xFFFFD3BA ^ 0x2C1A;
        kotakbaz.rain.event.events.B.D[0x5E8C ^ 0x5F80] = 0x4A9 ^ 0x5F80;
        kotakbaz.rain.event.events.B.D[0x1A43 ^ 0x1AC4] = 0xFFFFE56C ^ 0x1AC4;
        kotakbaz.rain.event.events.B.D[0x5F2F ^ 0x5FE3] = 0x15396 ^ 0x5FE3;
        kotakbaz.rain.event.events.B.D[0x10A2C ^ 0x10B7A] = 0x1D498 ^ 0x10B7A;
        kotakbaz.rain.event.events.B.D[0x59C3 ^ 0x5969] = 0xFFFFC760 ^ 0x5969;
        kotakbaz.rain.event.events.B.D[0x6E88 ^ 0x6EF8] = 0xFFFF9155 ^ 0x6EF8;
        kotakbaz.rain.event.events.B.D[0x52CF ^ 0x53E5] = 0x501C ^ 0x53E5;
        kotakbaz.rain.event.events.B.D[0x4F7B ^ 0x4FFE] = 0x4FA8 ^ 0x4FFE;
        kotakbaz.rain.event.events.B.D[0xCC4B ^ 0xCD53] = 0x1D9E ^ 0xCD53;
        kotakbaz.rain.event.events.B.D[0x7F44 ^ 0x7E37] = 0x7E3C ^ 0x7E37;
        kotakbaz.rain.event.events.B.D[0x6674 ^ 0x669C] = 0x7324 ^ 0x669C;
        kotakbaz.rain.event.events.B.D[0xCA76 ^ 0xCA1A] = 0xCA00 ^ 0xCA1A;
        kotakbaz.rain.event.events.B.D[0x956B ^ 0x951C] = 0x9522 ^ 0x951C;
        kotakbaz.rain.event.events.B.D[0xB9E4 ^ 0xB9A8] = 0xA5EA ^ 0xB9A8;
        kotakbaz.rain.event.events.B.D[0x812 ^ 0x8BE] = 0xA2EC ^ 0x8BE;
        kotakbaz.rain.event.events.B.D[0xB538 ^ 0xB560] = 0xB533 ^ 0xB560;
        kotakbaz.rain.event.events.B.D[0x8532 ^ 0x8523] = 0x856D ^ 0x8523;
        kotakbaz.rain.event.events.B.D[0x32B8 ^ 0x32B1] = 0x32BF ^ 0x32B1;
        kotakbaz.rain.event.events.B.D[0xD54F ^ 0xD5FB] = 0x72DD ^ 0xD5FB;
        kotakbaz.rain.event.events.B.D[0x411A ^ 0x403F] = 0x3D63 ^ 0x403F;
        kotakbaz.rain.event.events.B.D[0x2A1B ^ 0x2ABF] = 0x831B ^ 0x2ABF;
        kotakbaz.rain.event.events.B.D[0x8DF ^ 0x892] = 0xCE90 ^ 0x892;
        kotakbaz.rain.event.events.B.D[0x269 ^ 0x346] = 0xE2CD ^ 0x346;
        kotakbaz.rain.event.events.B.D[0xF6BF ^ 0xF675] = 0xD45D ^ 0xF675;
        kotakbaz.rain.event.events.B.D[0x7B04 ^ 0x7A88] = 0x7AA6 ^ 0x7A88;
        kotakbaz.rain.event.events.B.D[0x7A67 ^ 0x7A5C] = 0xFFFF85FA ^ 0x7A5C;
        kotakbaz.rain.event.events.B.D[0x815E ^ 0x8186] = 0x8186 ^ 0x8186;
        kotakbaz.rain.event.events.B.D[0xE0CB ^ 0xE084] = 0x494D ^ 0xE084;
        kotakbaz.rain.event.events.B.D[0x35FA ^ 0x3585] = 0xFFFFCA7B ^ 0x3585;
        kotakbaz.rain.event.events.B.D[0x2442 ^ 0x2484] = 0xFFFF20AB ^ 0x2484;
        kotakbaz.rain.event.events.B.D[0xDAB2 ^ 0xDBA7] = 0xFFFFF4D1 ^ 0xDBA7;
        kotakbaz.rain.event.events.B.D[0x22F9 ^ 0x23D5] = 0x6D42 ^ 0x23D5;
        kotakbaz.rain.event.events.B.D[0xAC1 ^ 0xAD5] = 0xFFFFF516 ^ 0xAD5;
        kotakbaz.rain.event.events.B.D[0xBF02 ^ 0xBE2C] = 0xF0BB ^ 0xBE2C;
        kotakbaz.rain.event.events.B.D[0x6487 ^ 0x64DD] = 0xFFFF9B39 ^ 0x64DD;
        kotakbaz.rain.event.events.B.D[0xAF15 ^ 0xAF85] = 0xAF84 ^ 0xAF85;
        kotakbaz.rain.event.events.B.D[0xA19 ^ 0xAE0] = 0xFC5E ^ 0xAE0;
        kotakbaz.rain.event.events.B.D[0xFF6B ^ 0xFE5B] = 0x1FCB ^ 0xFE5B;
        kotakbaz.rain.event.events.B.D[0x2BD2 ^ 0x2BC4] = 0x2B84 ^ 0x2BC4;
        kotakbaz.rain.event.events.B.D[0x13E7 ^ 0x135D] = 0xA56 ^ 0x135D;
        kotakbaz.rain.event.events.B.D[0xCB93 ^ 0xCBD6] = 0xCBD6 ^ 0xCBD6;
        kotakbaz.rain.event.events.B.D[0x37FA ^ 0x371D] = 0x22B4 ^ 0x371D;
        kotakbaz.rain.event.events.B.D[0xD11D ^ 0xD01A] = 0x2873 ^ 0xD01A;
        kotakbaz.rain.event.events.B.D[0x31A3 ^ 0x31F5] = 0x31F5 ^ 0x31F5;
        kotakbaz.rain.event.events.B.D[0x10170 ^ 0x1007E] = 0x15B57 ^ 0x1007E;
        kotakbaz.rain.event.events.B.D[0x1233 ^ 0x129E] = 0xB8C2 ^ 0x129E;
        kotakbaz.rain.event.events.B.D[0x1034D ^ 0x1030E] = 0x1030E ^ 0x1030E;
        kotakbaz.rain.event.events.B.D[0x101DC ^ 0x10085] = 0x125CA ^ 0x10085;
        kotakbaz.rain.event.events.B.D[0x63A1 ^ 0x63B3] = 0xFFFF9C25 ^ 0x63B3;
        kotakbaz.rain.event.events.B.D[0xE25C ^ 0xE270] = 0xFFFF1D88 ^ 0xE270;
        kotakbaz.rain.event.events.B.D[0xB475 ^ 0xB45A] = 0xFFFF4BF8 ^ 0xB45A;
        kotakbaz.rain.event.events.B.D[0xB52D ^ 0xB4A4] = 0xB4AE ^ 0xB4A4;
        kotakbaz.rain.event.events.B.D[0xA410 ^ 0xA512] = 0xBE4B ^ 0xA512;
        kotakbaz.rain.event.events.B.D[0x53A9 ^ 0x52A8] = 0xFFFFB668 ^ 0x52A8;
        kotakbaz.rain.event.events.B.D[0x9150 ^ 0x9166] = 0xFFFF6EC4 ^ 0x9166;
        kotakbaz.rain.event.events.B.D[0xF1F6 ^ 0xF079] = 0xF07B ^ 0xF079;
        kotakbaz.rain.event.events.B.D[0x7E3A ^ 0x7E42] = 0xFFFF81E7 ^ 0x7E42;
        kotakbaz.rain.event.events.B.D[0xBA97 ^ 0xBB9C] = 0xE0A1 ^ 0xBB9C;
        kotakbaz.rain.event.events.B.D[0xEAB1 ^ 0xEA60] = 0xD073 ^ 0xEA60;
        kotakbaz.rain.event.events.B.D[0xD51D ^ 0xD43B] = 0xA933 ^ 0xD43B;
        kotakbaz.rain.event.events.B.D[0x733C ^ 0x7243] = 0x7240 ^ 0x7243;
        kotakbaz.rain.event.events.B.D[0x924A ^ 0x92DE] = 0x92DF ^ 0x92DE;
        kotakbaz.rain.event.events.B.D[0xE08B ^ 0xE093] = 0xFFFF1F6D ^ 0xE093;
        kotakbaz.rain.event.events.B.D[0x72B ^ 0x73E] = 0xFFFFF8CA ^ 0x73E;
        kotakbaz.rain.event.events.B.D[0x5A5A ^ 0x5A7D] = 0xFFFFA59B ^ 0x5A7D;
        kotakbaz.rain.event.events.B.D[0x1E5B ^ 0x1ED7] = 0x1E8B ^ 0x1ED7;
        kotakbaz.rain.event.events.B.D[0x5510 ^ 0x5598] = 0xFFFFAA44 ^ 0x5598;
        kotakbaz.rain.event.events.B.D[0x2449 ^ 0x2574] = 0x2F36 ^ 0x2574;
        kotakbaz.rain.event.events.B.D[0xD447 ^ 0xD4E0] = 0x7D47 ^ 0xD4E0;
        kotakbaz.rain.event.events.B.D[0xA927 ^ 0xA9C2] = 0xFFFF3DD2 ^ 0xA9C2;
        kotakbaz.rain.event.events.B.D[0xDF81 ^ 0xDEC8] = 0xFFFF32F8 ^ 0xDEC8;
        kotakbaz.rain.event.events.B.D[0x3694 ^ 0x3691] = 0xFFFFC979 ^ 0x3691;
        kotakbaz.rain.event.events.B.D[0x275B ^ 0x2736] = 0x2725 ^ 0x2736;
        kotakbaz.rain.event.events.B.D[0x10A4F ^ 0x10BCA] = 0x10BCF ^ 0x10BCA;
        kotakbaz.rain.event.events.B.D[0x3EBF ^ 0x3FD8] = 0xE782 ^ 0x3FD8;
        kotakbaz.rain.event.events.B.D[0x3D4 ^ 0x2C9] = 0x8704 ^ 0x2C9;
        kotakbaz.rain.event.events.B.D[0xA560 ^ 0xA4E1] = 0xA4E8 ^ 0xA4E1;
        kotakbaz.rain.event.events.B.D[0xB787 ^ 0xB738] = 0x1943 ^ 0xB738;
        kotakbaz.rain.event.events.B.D[0x82A8 ^ 0x83F6] = 0x83F7 ^ 0x83F6;
        kotakbaz.rain.event.events.B.D[0xC611 ^ 0xC656] = 0xC656 ^ 0xC656;
        kotakbaz.rain.event.events.B.D[0xEAEC ^ 0xEAD1] = 0xFFFF1574 ^ 0xEAD1;
        kotakbaz.rain.event.events.B.D[0x4D6F ^ 0x4D1C] = 0xFFFFB2E7 ^ 0x4D1C;
        kotakbaz.rain.event.events.B.D[0x325B ^ 0x3210] = 0x1E02 ^ 0x3210;
        kotakbaz.rain.event.events.B.D[0x4B4B ^ 0x4B19] = 0x4335 ^ 0x4B19;
        kotakbaz.rain.event.events.B.D[0xA34C ^ 0xA241] = 0xF934 ^ 0xA241;
        kotakbaz.rain.event.events.B.D[0x26D1 ^ 0x27D1] = 0x3C88 ^ 0x27D1;
        kotakbaz.rain.event.events.B.D[0xA3A9 ^ 0xA2E3] = 0xB102 ^ 0xA2E3;
        kotakbaz.rain.event.events.B.D[0x10FE7 ^ 0x10E6C] = 0x10E6B ^ 0x10E6C;
        kotakbaz.rain.event.events.B.D[0xAC50 ^ 0xAD12] = 0x53F6 ^ 0xAD12;
        kotakbaz.rain.event.events.B.D[0x63C2 ^ 0x63BE] = 0x639C ^ 0x63BE;
        kotakbaz.rain.event.events.B.D[0xE17B ^ 0xE069] = 0x6A40 ^ 0xE069;
        kotakbaz.rain.event.events.B.D[0x61A3 ^ 0x60B0] = 0xB030 ^ 0x60B0;
        kotakbaz.rain.event.events.B.D[0x7A25 ^ 0x7A44] = 0xFFFF85DA ^ 0x7A44;
        kotakbaz.rain.event.events.B.D[0x2FDB ^ 0x2F45] = 0xFFFF6E84 ^ 0x2F45;
        kotakbaz.rain.event.events.B.D[0x697F ^ 0x694E] = 0x695E ^ 0x694E;
        kotakbaz.rain.event.events.B.D[0x7E04 ^ 0x7E67] = 0xFFFF81E0 ^ 0x7E67;
        kotakbaz.rain.event.events.B.D[0x10553 ^ 0x105FB] = 0x16440 ^ 0x105FB;
        kotakbaz.rain.event.events.B.D[0xEFE7 ^ 0xEEE1] = 0x859D ^ 0xEEE1;
        kotakbaz.rain.event.events.B.D[0xB285 ^ 0xB20B] = 0xB230 ^ 0xB20B;
        kotakbaz.rain.event.events.B.D[0xC1E ^ 0xCED] = 0xA3EA ^ 0xCED;
        kotakbaz.rain.event.events.B.D[0x60C2 ^ 0x601B] = 0x53C9 ^ 0x601B;
        kotakbaz.rain.event.events.B.D[0xB15C ^ 0xB1E1] = 0x1F9A ^ 0xB1E1;
        kotakbaz.rain.event.events.B.D[0x622B ^ 0x6298] = 0xD567 ^ 0x6298;
        kotakbaz.rain.event.events.B.D[0x99CC ^ 0x99A2] = 0xFFFF664B ^ 0x99A2;
        kotakbaz.rain.event.events.B.D[0xC7E3 ^ 0xC7A5] = 0xC7A7 ^ 0xC7A5;
        kotakbaz.rain.event.events.B.D[0xE57D ^ 0xE4FA] = 0xE4F4 ^ 0xE4FA;
        kotakbaz.rain.event.events.B.D[0xDE62 ^ 0xDE8B] = 0xCB2C ^ 0xDE8B;
        kotakbaz.rain.event.events.B.D[0xADD1 ^ 0xADDF] = 0xADBB ^ 0xADDF;
        kotakbaz.rain.event.events.B.D[0x607C ^ 0x6029] = 0xB206 ^ 0x6029;
        kotakbaz.rain.event.events.B.D[0xBB0 ^ 0xB7D] = 0x10705 ^ 0xB7D;
        kotakbaz.rain.event.events.B.D[0x10CF7 ^ 0x10C71] = 0x10C3F ^ 0x10C71;
        kotakbaz.rain.event.events.B.D[0x836C ^ 0x8305] = 0xFFFF7CC4 ^ 0x8305;
        kotakbaz.rain.event.events.B.D[0xBE6D ^ 0xBE0D] = 0xFFFF41B1 ^ 0xBE0D;
        kotakbaz.rain.event.events.B.D[0x10811 ^ 0x10912] = 0x1626B ^ 0x10912;
        kotakbaz.rain.event.events.B.D[0x44EF ^ 0x4440] = 0xEE1C ^ 0x4440;
        kotakbaz.rain.event.events.B.D[0xD163 ^ 0xD0ED] = 0xD1ED ^ 0xD0ED;
        kotakbaz.rain.event.events.B.D[0x600F ^ 0x60F5] = 0x966F ^ 0x60F5;
        kotakbaz.rain.event.events.B.D[0x6E8C ^ 0x6E4F] = 0x64DD ^ 0x6E4F;
        kotakbaz.rain.event.events.B.D[0x101F9 ^ 0x101E0] = 0xFFFEFE24 ^ 0x101E0;
        kotakbaz.rain.event.events.B.D[0xDE1B ^ 0xDF6A] = 0xDF68 ^ 0xDF6A;
        kotakbaz.rain.event.events.B.D[0xC5F1 ^ 0xC5A1] = 0xF938 ^ 0xC5A1;
        kotakbaz.rain.event.events.B.D[0x53D9 ^ 0x5354] = 0x5313 ^ 0x5354;
        kotakbaz.rain.event.events.B.D[0x54F8 ^ 0x5596] = 0xFFFFAA15 ^ 0x5596;
        kotakbaz.rain.event.events.B.D[0xBB38 ^ 0xBBBB] = 0xFFFF444A ^ 0xBBBB;
        kotakbaz.rain.event.events.B.D[0x6888 ^ 0x687F] = 0x9EF9 ^ 0x687F;
        kotakbaz.rain.event.events.B.D[0xA31B ^ 0xA36E] = 0xA369 ^ 0xA36E;
        kotakbaz.rain.event.events.B.D[0x3EEC ^ 0x3EF2] = 0xFFFFC118 ^ 0x3EF2;
        kotakbaz.rain.event.events.B.D[0xDFE6 ^ 0xDF8D] = 0xDF90 ^ 0xDF8D;
        kotakbaz.rain.event.events.B.D[0xF2DE ^ 0xF3C9] = 0x2319 ^ 0xF3C9;
        kotakbaz.rain.event.events.B.D[0x9D5E ^ 0x9D24] = 0xFFFF62B3 ^ 0x9D24;
        kotakbaz.rain.event.events.B.D[0xB213 ^ 0xB20E] = 0xFFFF4DD6 ^ 0xB20E;
        kotakbaz.rain.event.events.B.D[0xE9FC ^ 0xE94D] = 0x5EB2 ^ 0xE94D;
        kotakbaz.rain.event.events.B.D[0xF56E ^ 0xF44D] = 0x894C ^ 0xF44D;
        kotakbaz.rain.event.events.B.D[0x37B0 ^ 0x3690] = 0x1373B ^ 0x3690;
        kotakbaz.rain.event.events.B.D[0x116 ^ 0x52] = 0x10E71 ^ 0x52;
        kotakbaz.rain.event.events.B.D[0xD2B2 ^ 0xD38C] = 0xD9AE ^ 0xD38C;
        kotakbaz.rain.event.events.B.D[0xEE39 ^ 0xEF1E] = 0xECF4 ^ 0xEF1E;
        kotakbaz.rain.event.events.B.D[0x72D0 ^ 0x728B] = 0x7299 ^ 0x728B;
        kotakbaz.rain.event.events.B.D[0x2570 ^ 0x24F3] = 0x24F5 ^ 0x24F3;
        kotakbaz.rain.event.events.B.D[0xF448 ^ 0xF4C7] = 0xF4EB ^ 0xF4C7;
        kotakbaz.rain.event.events.B.D[0x4E72 ^ 0x4E6E] = 0x4E1F ^ 0x4E6E;
        kotakbaz.rain.event.events.B.D[0x75FE ^ 0x75FE] = 0xFFFF8AB3 ^ 0x75FE;
        kotakbaz.rain.event.events.B.D[0x10169 ^ 0x1015E] = 0x1016E ^ 0x1015E;
        kotakbaz.rain.event.events.B.D[0x6336 ^ 0x625D] = 0x625C ^ 0x625D;
        kotakbaz.rain.event.events.B.D[0xD94 ^ 0xD2C] = 0x145D ^ 0xD2C;
        kotakbaz.rain.event.events.B.D[0xEABA ^ 0xEA04] = 0x4415 ^ 0xEA04;
        kotakbaz.rain.event.events.B.D[0xB3AF ^ 0xB2C6] = 0x5B1D ^ 0xB2C6;
        kotakbaz.rain.event.events.B.D[0x7418 ^ 0x7524] = 0x7F06 ^ 0x7524;
        kotakbaz.rain.event.events.B.D[0x2C5B ^ 0x2C9B] = 0x2608 ^ 0x2C9B;
        kotakbaz.rain.event.events.B.D[0xB8D5 ^ 0xB9EE] = 0xB3D2 ^ 0xB9EE;
        kotakbaz.rain.event.events.B.D[0xF649 ^ 0xF676] = 0xF67F ^ 0xF676;
        kotakbaz.rain.event.events.B.D[0x357C ^ 0x352F] = 0x5212 ^ 0x352F;
        kotakbaz.rain.event.events.B.D[0x14D1 ^ 0x14CB] = 0x1495 ^ 0x14CB;
        kotakbaz.rain.event.events.B.D[0xAFDF ^ 0xAF08] = 0xCBD6 ^ 0xAF08;
        kotakbaz.rain.event.events.B.D[0x9930 ^ 0x9878] = 0x8B99 ^ 0x9878;
        kotakbaz.rain.event.events.B.D[0x410F ^ 0x400A] = 0x2B5C ^ 0x400A;
        kotakbaz.rain.event.events.B.D[0x99B6 ^ 0x98B9] = 0x128F ^ 0x98B9;
        kotakbaz.rain.event.events.B.D[0x4B0E ^ 0x4B11] = 0x4B05 ^ 0x4B11;
        kotakbaz.rain.event.events.B.D[0x4E17 ^ 0x4E5E] = 0x4EDE ^ 0x4E5E;
        kotakbaz.rain.event.events.B.D[0xFC07 ^ 0xFCEB] = 0x22BB ^ 0xFCEB;
        kotakbaz.rain.event.events.B.D[0x9620 ^ 0x976B] = 0x7374 ^ 0x976B;
        kotakbaz.rain.event.events.B.D[0xDB84 ^ 0xDBEE] = 0xDBB5 ^ 0xDBEE;
        kotakbaz.rain.event.events.B.D[0x8A83 ^ 0x8A23] = 0x3957 ^ 0x8A23;
        kotakbaz.rain.event.events.B.D[0x43F ^ 0x477] = 0x477 ^ 0x477;
        kotakbaz.rain.event.events.B.D[0xD8C2 ^ 0xD83E] = 0x325 ^ 0xD83E;
        kotakbaz.rain.event.events.B.D[0x4F39 ^ 0x4E03] = 0xE94D ^ 0x4E03;
        kotakbaz.rain.event.events.B.D[0x109B6 ^ 0x1091D] = 0x168AA ^ 0x1091D;
        kotakbaz.rain.event.events.B.D[0x10A56 ^ 0x10A9D] = 0x12895 ^ 0x10A9D;
        kotakbaz.rain.event.events.B.D[0x445D ^ 0x4455] = 0x443B ^ 0x4455;
        kotakbaz.rain.event.events.B.D[0xD49E ^ 0xD4C2] = 0xD48C ^ 0xD4C2;
        kotakbaz.rain.event.events.B.D[0x9B10 ^ 0x9A0F] = 0x19BA4 ^ 0x9A0F;
        kotakbaz.rain.event.events.B.D[0x10C0E ^ 0x10D3A] = 0x169AB ^ 0x10D3A;
        kotakbaz.rain.event.events.B.D[0x577E ^ 0x5622] = 0x5622 ^ 0x5622;
        kotakbaz.rain.event.events.B.D[0x4AF4 ^ 0x4A17] = 0x21C3 ^ 0x4A17;
        kotakbaz.rain.event.events.B.D[0x28AC ^ 0x28FB] = 0x28D3 ^ 0x28FB;
        kotakbaz.rain.event.events.B.D[0x2349 ^ 0x2348] = 0xFFFFDCCD ^ 0x2348;
        kotakbaz.rain.event.events.B.D[0x7F1E ^ 0x7F67] = 0x7F75 ^ 0x7F67;
        kotakbaz.rain.event.events.B.D[0x10E3B ^ 0x10E7B] = 0xFFFEF1A4 ^ 0x10E7B;
        kotakbaz.rain.event.events.B.D[0x3BC8 ^ 0x3A9C] = 0xE57E ^ 0x3A9C;
        kotakbaz.rain.event.events.B.D[0xCB68 ^ 0xCBDE] = 0x6C80 ^ 0xCBDE;
        kotakbaz.rain.event.events.B.D[0x108A9 ^ 0x108D2] = 0x1085A ^ 0x108D2;
        kotakbaz.rain.event.events.B.D[0xA5E5 ^ 0xA4DD] = 0x393 ^ 0xA4DD;
        kotakbaz.rain.event.events.B.D[0x1FB3 ^ 0x1ED2] = 0xCC43 ^ 0x1ED2;
        kotakbaz.rain.event.events.B.D[0xAE85 ^ 0xAEED] = 0xAED2 ^ 0xAEED;
        kotakbaz.rain.event.events.B.D[0x695D ^ 0x6978] = 0xFFFF96F2 ^ 0x6978;
        kotakbaz.rain.event.events.B.D[0xDE0C ^ 0xDECB] = 0x256F ^ 0xDECB;
        kotakbaz.rain.event.events.B.D[0x4C9F ^ 0x4C03] = 0xF243 ^ 0x4C03;
        kotakbaz.rain.event.events.B.D[0x6B6F ^ 0x6B46] = 0xFFFF9484 ^ 0x6B46;
        kotakbaz.rain.event.events.B.D[0xAE72 ^ 0xAF66] = 0x7FE8 ^ 0xAF66;
        kotakbaz.rain.event.events.B.D[0xB793 ^ 0xB798] = 0xFFFF4879 ^ 0xB798;
        kotakbaz.rain.event.events.B.D[0xEDC7 ^ 0xECAF] = 0x56B5 ^ 0xECAF;
        kotakbaz.rain.event.events.B.D[0x101F1 ^ 0x10194] = 0xFFFEFE4C ^ 0x10194;
        kotakbaz.rain.event.events.B.D[0x260D ^ 0x2639] = 0xFFFFD9CA ^ 0x2639;
        kotakbaz.rain.event.events.B.D[0x63A9 ^ 0x636D] = 0x98C0 ^ 0x636D;
        kotakbaz.rain.event.events.B.D[0xFB88 ^ 0xFBC9] = 0xFBC3 ^ 0xFBC9;
        kotakbaz.rain.event.events.B.D[0x76CF ^ 0x779C] = 0xA86E ^ 0x779C;
        kotakbaz.rain.event.events.B.D[0x8999 ^ 0x88D4] = 0xFFFF9379 ^ 0x88D4;
        kotakbaz.rain.event.events.B.D[0x765E ^ 0x7724] = 0xFFFF88AE ^ 0x7724;
        kotakbaz.rain.event.events.B.D[0x3D61 ^ 0x3DE3] = 0xFFFFC246 ^ 0x3DE3;
        kotakbaz.rain.event.events.B.D[0x6DBC ^ 0x6DDA] = 0x6D83 ^ 0x6DDA;
        kotakbaz.rain.event.events.B.D[0x89A7 ^ 0x8973] = 0xEDA6 ^ 0x8973;
        kotakbaz.rain.event.events.B.D[0xEB5A ^ 0xEBC5] = 0x558D ^ 0xEBC5;
        kotakbaz.rain.event.events.B.D[0x27DB ^ 0x27D4] = 0x27BB ^ 0x27D4;
        kotakbaz.rain.event.events.B.D[0xD298 ^ 0xD24E] = 0xB6A3 ^ 0xD24E;
        kotakbaz.rain.event.events.B.D[0xD148 ^ 0xD0C2] = 0xD0E2 ^ 0xD0C2;
        kotakbaz.rain.event.events.B.D[0x6B20 ^ 0x6A02] = 0x16BA9 ^ 0x6A02;
        kotakbaz.rain.event.events.B.D[0xF51C ^ 0xF5FE] = 0xC871 ^ 0xF5FE;
        kotakbaz.rain.event.events.B.D[0x1060 ^ 0x1170] = 0x9B59 ^ 0x1170;
        kotakbaz.rain.event.events.B.D[0xFD5A ^ 0xFDFB] = 0x4E88 ^ 0xFDFB;
        kotakbaz.rain.event.events.B.D[0x922B ^ 0x936E] = 0x19D2D ^ 0x936E;
        kotakbaz.rain.event.events.B.D[0x8848 ^ 0x8836] = 0x88A6 ^ 0x8836;
        kotakbaz.rain.event.events.B.D[0x4087 ^ 0x41C0] = 0x5233 ^ 0x41C0;
        kotakbaz.rain.event.events.B.D[0x69B4 ^ 0x68AA] = 0xED75 ^ 0x68AA;
        kotakbaz.rain.event.events.B.D[0x3601 ^ 0x36F7] = 0x99EA ^ 0x36F7;
        kotakbaz.rain.event.events.B.D[0x8108 ^ 0x812B] = 0x815C ^ 0x812B;
        kotakbaz.rain.event.events.B.D[0xBE65 ^ 0xBF12] = 0xBF16 ^ 0xBF12;
        kotakbaz.rain.event.events.B.D[0xECED ^ 0xECE7] = 0xECCC ^ 0xECE7;
        kotakbaz.rain.event.events.B.D[0xA9A3 ^ 0xA93A] = 0xFBC5 ^ 0xA93A;
        kotakbaz.rain.event.events.B.D[0x310 ^ 0x3D2] = 0xFFFFF6C0 ^ 0x3D2;
        kotakbaz.rain.event.events.B.D[0x8079 ^ 0x8088] = 0x1D66 ^ 0x8088;
        kotakbaz.rain.event.events.B.D[0x9FC2 ^ 0x9FD1] = 0x9FE1 ^ 0x9FD1;
        kotakbaz.rain.event.events.B.D[0x5211 ^ 0x52CF] = 0xF3D5 ^ 0x52CF;
        kotakbaz.rain.event.events.B.D[0xA9FC ^ 0xA939] = 0x529D ^ 0xA939;
        kotakbaz.rain.event.events.B.D[0xB272 ^ 0xB299] = 0x6CC2 ^ 0xB299;
        kotakbaz.rain.event.events.B.D[0xECBE ^ 0xEDEF] = 0xD96E ^ 0xEDEF;
        kotakbaz.rain.event.events.B.D[0x9063 ^ 0x904B] = 0x9033 ^ 0x904B;
        kotakbaz.rain.event.events.B.D[0xD61F ^ 0xD695] = 0xD6AA ^ 0xD695;
        kotakbaz.rain.event.events.B.D[0x5E92 ^ 0x5E49] = 0xFF51 ^ 0x5E49;
        kotakbaz.rain.event.events.B.D[0x1670 ^ 0x1690] = 0x2B1F ^ 0x1690;
        kotakbaz.rain.event.events.B.D[0x1002D ^ 0x10106] = 0x14F9B ^ 0x10106;
        kotakbaz.rain.event.events.B.D[0x1666 ^ 0x16D6] = 0xA12D ^ 0x16D6;
        kotakbaz.rain.event.events.B.D[0x5DDE ^ 0x5DF3] = 0xFFFFA208 ^ 0x5DF3;
        kotakbaz.rain.event.events.B.D[0xA1C ^ 0xA8E] = 0xA8E ^ 0xA8E;
        kotakbaz.rain.event.events.B.D[0x7615 ^ 0x767A] = 0xFFFF898C ^ 0x767A;
        kotakbaz.rain.event.events.B.D[0x67EB ^ 0x6762] = 0xFFFF988E ^ 0x6762;
        kotakbaz.rain.event.events.B.D[0x217A ^ 0x219B] = 0xFFFFE3DE ^ 0x219B;
        kotakbaz.rain.event.events.B.D[0x3E1F ^ 0x3EA8] = 0x998B ^ 0x3EA8;
        kotakbaz.rain.event.events.B.D[0x9304 ^ 0x9326] = 0xFFFF6CC9 ^ 0x9326;
        kotakbaz.rain.event.events.B.D[0x951A ^ 0x949C] = 0x948D ^ 0x949C;
        kotakbaz.rain.event.events.B.D[0xD9CD ^ 0xD95A] = 0xE9AF ^ 0xD95A;
        kotakbaz.rain.event.events.B.D[0xCA66 ^ 0xCB55] = 0xAFC0 ^ 0xCB55;
        kotakbaz.rain.event.events.B.D[0xC7E0 ^ 0xC6EA] = 0x3E82 ^ 0xC6EA;
        kotakbaz.rain.event.events.B.D[0x8224 ^ 0x835D] = 0x8352 ^ 0x835D;
        kotakbaz.rain.event.events.B.D[0xFE0B ^ 0xFE90] = 0xAC6F ^ 0xFE90;
        kotakbaz.rain.event.events.B.D[0x783C ^ 0x789E] = 0xCB83 ^ 0x789E;
        kotakbaz.rain.event.events.B.D[0x3ABB ^ 0x3BE9] = 0xF72 ^ 0x3BE9;
        kotakbaz.rain.event.events.B.D[0x73F1 ^ 0x72C6] = 0xD580 ^ 0x72C6;
        kotakbaz.rain.event.events.B.D[0x6086 ^ 0x61C0] = 0x16FE3 ^ 0x61C0;
        kotakbaz.rain.event.events.B.D[0x1AC4 ^ 0x1A3B] = 0x177 ^ 0x1A3B;
        kotakbaz.rain.event.events.B.D[0x9F91 ^ 0x9FEC] = 0x9FAA ^ 0x9FEC;
        kotakbaz.rain.event.events.B.D[0x948F ^ 0x9461] = 0x4A31 ^ 0x9461;
        kotakbaz.rain.event.events.B.D[0x4053 ^ 0x40B5] = 0x2B77 ^ 0x40B5;
        kotakbaz.rain.event.events.B.D[0xB6CD ^ 0xB6F1] = 0xB68C ^ 0xB6F1;
        kotakbaz.rain.event.events.B.D[0x462C ^ 0x4697] = 0x5FE4 ^ 0x4697;
        kotakbaz.rain.event.events.B.D[0xE523 ^ 0xE41C] = 0x1AE0 ^ 0xE41C;
    }
}

