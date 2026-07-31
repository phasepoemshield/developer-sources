/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.ui.menu.layout;

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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u00020\u0012H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u00020\u0015H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\t\u00a8\u0006\u001c"}, d2={"Lkotakbaz/rain/ui/menu/layout/CategorySlot;", "", "", "x", "y", "size", "<init>", "(FFF)V", "component1", "()F", "component2", "component3", "copy", "(FFF)Lkotakbaz/rain/ui/menu/layout/CategorySlot;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "F", "getX", "getY", "getSize", "rain-visuals"})
public final class CategorySlot {
    private final float x;
    private final float y;
    private final float size;
    private static Object[] a;
    private static Object b;
    private static Object[] B;
    private static Object[] A;
    private static Object[] c;
    public static int[] C;

    public CategorySlot(float f2, float f3, float f4) {
        super();
        this.x = f2;
        this.y = f3;
        this.size = f4;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public final float getSize() {
        return this.size;
    }

    public final float component1() {
        return this.x;
    }

    public final float component2() {
        return this.y;
    }

    public final float component3() {
        return this.size;
    }

    @NotNull
    public final CategorySlot copy(float f2, float f3, float f4) {
        return new CategorySlot(f2, f3, f4);
    }

    public static /* synthetic */ CategorySlot copy$default(CategorySlot categorySlot, float f2, float f3, float f4, int n, Object object) {
        int n2 = C[0];
        n2 ^= C[1];
        if ((n & (n2 ^= C[2])) != 0) {
            f2 = categorySlot.x;
        }
        int n3 = C[3];
        n3 ^= C[4];
        if ((n & (n3 -= C[5])) != 0) {
            f3 = categorySlot.y;
        }
        int n4 = C[6];
        n4 -= C[7];
        if ((n & (n4 ^= C[8])) != 0) {
            f4 = categorySlot.size;
        }
        return categorySlot.copy(f2, f3, f4);
    }

    @NotNull
    public String toString() {
        float f2 = this.size;
        float f3 = this.y;
        float f4 = this.x;
        int n = C[9];
        n -= C[10];
        n -= C[11];
        int n2 = C[12];
        n2 ^= C[13];
        int n3 = C[15];
        n3 -= C[16];
        int n4 = C[18];
        n4 -= C[19];
        return (String)a[n] + f4 + (String)a[n2 ^= C[14]] + f3 + (String)a[n3 -= C[17]] + f2 + (String)a[n4 ^= C[20]];
    }

    public int hashCode() {
        long l = -5818154697260344005L;
        long l2 = 8397080656457267443L;
        long l3 = 8075831110697540310L;
        int n = C[21];
        n += C[22];
        long l4 = l3;
        int n2 = C[24];
        n2 += C[25];
        l3 = l4 ^ ((long)Float.hashCode(this.x) << (n -= C[23]) ^ l4) & -1L << (n2 -= C[26]);
        int n3 = C[27];
        n3 ^= C[28];
        n3 ^= C[29];
        int n4 = C[30];
        n4 += C[31];
        n4 += C[32];
        int n5 = C[33];
        n5 ^= C[34];
        long l5 = l3;
        int n6 = C[36];
        n6 -= C[37];
        l3 = l5 ^ ((long)((int)(l3 >>> n3) * n4 + Float.hashCode(this.y)) << (n5 += C[35]) ^ l5) & -1L << (n6 -= C[38]);
        int n7 = C[39];
        n7 += C[40];
        n7 -= C[41];
        int n8 = C[42];
        n8 += C[43];
        n8 ^= C[44];
        int n9 = C[45];
        n9 -= C[46];
        long l6 = l3;
        int n10 = C[48];
        n10 -= C[49];
        l3 = l6 ^ ((long)((int)(l3 >>> n7) * n8 + Float.hashCode(this.size)) << (n9 -= C[47]) ^ l6) & -1L << (n10 -= C[50]);
        int n11 = C[51];
        n11 -= C[52];
        return (int)(l3 >>> (n11 ^= C[53]));
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            boolean bl = C[54];
            bl -= C[55];
            return bl -= C[56];
        }
        if (!(object instanceof CategorySlot)) {
            boolean bl = C[57];
            bl -= C[58];
            return bl ^= C[59];
        }
        CategorySlot categorySlot = (CategorySlot)object;
        if (Float.compare(this.x, categorySlot.x) != 0) {
            boolean bl = C[60];
            bl += C[61];
            return bl += C[62];
        }
        if (Float.compare(this.y, categorySlot.y) != 0) {
            boolean bl = C[63];
            bl += C[64];
            return bl -= C[65];
        }
        if (Float.compare(this.size, categorySlot.size) != 0) {
            boolean bl = C[66];
            bl ^= C[67];
            return bl ^= C[68];
        }
        boolean bl = C[69];
        bl += C[70];
        return bl -= C[71];
    }

    static {
        CategorySlot.b();
        long l = 971635992692216258L;
        long l2 = -3159187325041768186L;
        long l3 = 1038466482552282225L;
        long l4 = -253955253677905077L;
        long l5 = -192100276897837101L;
        long l6 = -6473562781678505987L;
        long l7 = 7538063263500279170L;
        long l8 = -5236843503745270144L;
        long l9 = 1425497129331084600L;
        long l10 = -2370939720439024459L;
        long l11 = -1782216092362901156L;
        long l12 = 2504502540556388275L;
        long l13 = 108750518298919136L;
        long l14 = 7414424125383261110L;
        int n = C[72];
        n -= C[73];
        a = new Object[n += C[74]];
        long l15 = l14;
        int n2 = C[75];
        n2 += C[76];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 += C[77]);
        Object[] objectArray = new Object[C[78]];
        objectArray[CategorySlot.C[79]] = A;
        objectArray[CategorySlot.C[80]] = C[81];
        int n3 = C[82];
        Object object = CategorySlot.A()[C[83]];
        if (object == null) {
            char[] cArray = "\u69fc\u69c7\u6468\u69a3\u69c8\u69c1\u690e\u6918\u69f5\u6467\u6596\u69fc\u69fc\u6469\u69d6\u69ef\u69d2\u69c8\u69c1\u69ee\u69be\u690e\u69f6\u6469\u69f2\u6900\u69ad\u69c1\u6904\u69d4\u6596\u646a\u6467\u6900\u6903\u69c9\u691e\u690e\u6467\u6592\u646a\u69ad\u69f2\u69ba\u6469\u69f0\u69d0\u69c9\u6595\u6594\u69b7\u691a\u69ee\u691a\u6467\u646a\u69f3\u6469\u6469\u69d4\u6469\u6592\u69f3\u6904\u69bd\u69f5\u6467\u6590\u6468\u69f6\u69b7\u646a\u6596\u69d3\u69a1\u69be\u69ef\u659c\u690d\u690d\u6596\u69fb\u69b9\u69c8\u69c9\u69be\u690c\u690c".toCharArray();
            for (int i2 = C[84]; i2 < C[85]; ++i2) {
                int n4 = cArray[i2];
                n4 += C[86];
                n4 ^= C[87];
                n4 += C[88];
                n4 += C[89];
                n4 += C[90];
                n4 ^= C[91];
                n4 += C[92];
                n4 ^= C[93];
                n4 ^= C[94];
                n4 += C[95];
                n4 ^= C[96];
                n4 += C[97];
                cArray[i2] = (char)(n4 += C[98]);
            }
            object = CategorySlot.A()[CategorySlot.C[99]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)CategorySlot.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = C[100];
        n5 ^= C[101];
        l5 = l16 ^ (0x2300000000L ^ l16) & -1L << (n5 ^= C[102]);
        long l17 = l12;
        int n6 = C[103];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 -= C[104]);
        while (true) {
            int n7 = C[105];
            n7 ^= C[106];
            if ((int)l12 >= (int)(l5 >>> (n7 ^= C[107]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = C[108];
            n9 += C[109];
            int n10 = C[111];
            n10 += C[112];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 ^= C[110])) & -1L >>> (n10 += C[113]);
            long l19 = l8;
            int n11 = C[114];
            n11 -= C[115];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 += C[116]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = C[117];
            n13 += C[118];
            int n14 = C[120];
            n14 -= C[121];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 += C[119])) & -1L >>> (n14 += C[122]);
            int n15 = C[123];
            n15 += C[124];
            long l21 = l9;
            int n16 = C[126];
            n16 += C[127];
            l9 = l21 ^ ((long)cArray[n12] << (n15 += C[125]) ^ l21) & -1L << (n16 ^= C[128]);
            int n17 = C[129];
            n17 += C[130];
            n17 ^= C[131];
            int n18 = C[132];
            n18 += C[133];
            long l22 = l11;
            int n19 = C[135];
            n19 -= C[136];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 += C[134]))) ^ l22) & -1L >>> (n19 -= C[137]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = C[138];
            n20 -= C[139];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 ^= C[140]);
            while (true) {
                int n21 = C[141];
                n21 ^= C[142];
                if ((int)(l13 >>> (n21 ^= C[143])) >= (int)l11) break;
                int n22 = C[144];
                n22 ^= C[145];
                int n23 = C[147];
                n23 ^= C[148];
                cArray2[(int)(l13 >>> (n22 ^= CategorySlot.C[146]))] = cArray[(int)l12 + (int)(l13 >>> (n23 += C[149]))];
                l13 += 0x100000000L;
            }
            int n24 = C[150];
            n24 -= C[151];
            int n25 = (int)(l14 >>> (n24 -= C[152]));
            l14 += 0x100000000L;
            CategorySlot.a[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = C[153];
            n26 -= C[154];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 ^= C[155]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[C[156]];
        String string = (String)object[C[157]];
        object = object[C[158]];
        Object[] objectArray = B;
        if (B == null) {
            objectArray = B = new Object[C[159]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[C[160]];
                A = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[C[162] ^ C[163]];
                byArray[CategorySlot.C[164] ^ CategorySlot.C[165]] = C[166] ^ C[167];
                byArray[CategorySlot.C[168] ^ CategorySlot.C[169]] = C[170] ^ C[171];
                byArray[CategorySlot.C[172] ^ CategorySlot.C[173]] = C[174] ^ C[175];
                byArray[CategorySlot.C[176] ^ CategorySlot.C[177]] = C[178] ^ C[179];
                byArray[CategorySlot.C[180] ^ CategorySlot.C[181]] = C[182] ^ C[183];
                byArray[CategorySlot.C[184] ^ CategorySlot.C[185]] = C[186] ^ C[187];
                byArray[CategorySlot.C[188] ^ CategorySlot.C[189]] = C[190] ^ C[191];
                byArray[CategorySlot.C[192] ^ CategorySlot.C[193]] = C[194] ^ C[195];
                byArray[CategorySlot.C[196] ^ CategorySlot.C[197]] = C[198] ^ C[199];
                byArray[CategorySlot.C[200] ^ CategorySlot.C[201]] = C[202] ^ C[203];
                byArray[CategorySlot.C[204] ^ CategorySlot.C[205]] = C[206] ^ C[207];
                byArray[CategorySlot.C[208] ^ CategorySlot.C[209]] = C[210] ^ C[211];
                byArray[CategorySlot.C[212] ^ CategorySlot.C[213]] = C[214] ^ C[215];
                byArray[CategorySlot.C[216] ^ CategorySlot.C[217]] = C[218] ^ C[219];
                byArray[CategorySlot.C[220] ^ CategorySlot.C[221]] = C[222] ^ C[223];
                byArray[CategorySlot.C[224] ^ CategorySlot.C[225]] = C[226] ^ C[227];
                objectArray2[CategorySlot.C[161]] = byArray;
            }
            byte[] byArray = (byte[])object3[C[228]];
            if (b == null) {
                byte[] byArray2 = new byte[C[229] ^ C[230]];
                byArray2[CategorySlot.C[231] ^ CategorySlot.C[232]] = C[233] ^ C[234];
                byArray2[CategorySlot.C[235] ^ CategorySlot.C[236]] = C[237] ^ C[238];
                byArray2[CategorySlot.C[239] ^ CategorySlot.C[240]] = C[241] ^ C[242];
                byArray2[CategorySlot.C[243] ^ CategorySlot.C[244]] = C[245] ^ C[246];
                byArray2[CategorySlot.C[247] ^ CategorySlot.C[248]] = C[249] ^ C[250];
                byArray2[CategorySlot.C[251] ^ CategorySlot.C[252]] = C[253] ^ C[254];
                byArray2[CategorySlot.C[255] ^ CategorySlot.C[256]] = C[257] ^ C[258];
                byArray2[CategorySlot.C[259] ^ CategorySlot.C[260]] = C[261] ^ C[262];
                byArray2[CategorySlot.C[263] ^ CategorySlot.C[264]] = C[265] ^ C[266];
                byArray2[CategorySlot.C[267] ^ CategorySlot.C[268]] = C[269] ^ C[270];
                byArray2[CategorySlot.C[271] ^ CategorySlot.C[272]] = C[273] ^ C[274];
                byArray2[CategorySlot.C[275] ^ CategorySlot.C[276]] = C[277] ^ C[278];
                byArray2[CategorySlot.C[279] ^ CategorySlot.C[280]] = C[281] ^ C[282];
                byArray2[CategorySlot.C[283] ^ CategorySlot.C[284]] = C[285] ^ C[286];
                byArray2[CategorySlot.C[287] ^ CategorySlot.C[288]] = C[289] ^ C[290];
                byArray2[CategorySlot.C[291] ^ CategorySlot.C[292]] = C[293] ^ C[294];
                byArray2[CategorySlot.C[295] ^ CategorySlot.C[296]] = C[297] ^ C[298];
                byArray2[CategorySlot.C[299] ^ CategorySlot.C[300]] = C[301] ^ C[302];
                byArray2[CategorySlot.C[303] ^ CategorySlot.C[304]] = C[305] ^ C[306];
                byArray2[CategorySlot.C[307] ^ CategorySlot.C[308]] = C[309] ^ C[310];
                byArray2[CategorySlot.C[311] ^ CategorySlot.C[312]] = C[313] ^ C[314];
                byArray2[CategorySlot.C[315] ^ CategorySlot.C[316]] = C[317] ^ C[318];
                byArray2[CategorySlot.C[319] ^ CategorySlot.C[320]] = C[321] ^ C[322];
                byArray2[CategorySlot.C[323] ^ CategorySlot.C[324]] = C[325] ^ C[326];
                byArray2[CategorySlot.C[327] ^ CategorySlot.C[328]] = C[329] ^ C[330];
                byArray2[CategorySlot.C[331] ^ CategorySlot.C[332]] = C[333] ^ C[334];
                byArray2[CategorySlot.C[335] ^ CategorySlot.C[336]] = C[337] ^ C[338];
                byArray2[CategorySlot.C[339] ^ CategorySlot.C[340]] = C[341] ^ C[342];
                byArray2[CategorySlot.C[343] ^ CategorySlot.C[344]] = C[345] ^ C[346];
                byArray2[CategorySlot.C[347] ^ CategorySlot.C[348]] = C[349] ^ C[350];
                byArray2[CategorySlot.C[351] ^ CategorySlot.C[352]] = C[353] ^ C[354];
                byArray2[CategorySlot.C[355] ^ CategorySlot.C[356]] = C[357] ^ C[358];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, C[359], byArray3, C[360], byArray.length);
                System.arraycopy(byArray2, C[361], byArray3, byArray.length, byArray2.length);
                Object object4 = CategorySlot.A()[C[362]];
                if (object4 == null) {
                    char[] cArray = "\u90e5\u8f13\u90ec\u8f11\u90ef\u8f03\u90c0\u90ce\u90c1\u90cd\u90ed\u90ca\u90f6\u90f4\u90e4\u90ed\u8f16\u8f06".toCharArray();
                    for (int i2 = C[363]; i2 < C[364]; ++i2) {
                        int n2 = cArray[i2];
                        n2 ^= C[365];
                        n2 ^= C[366];
                        n2 -= C[367];
                        n2 -= C[368];
                        n2 ^= C[369];
                        n2 += C[370];
                        n2 -= C[371];
                        n2 += C[372];
                        n2 += C[373];
                        n2 -= C[374];
                        n2 -= C[375];
                        n2 += C[376];
                        cArray[i2] = (char)(n2 -= C[377]);
                    }
                    object4 = CategorySlot.A()[CategorySlot.C[378]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[C[379]];
                byArray4[CategorySlot.C[380]] = C[381];
                byArray4[CategorySlot.C[382]] = C[383];
                byArray4[CategorySlot.C[384]] = C[385];
                byArray4[CategorySlot.C[386]] = C[387];
                byArray4[CategorySlot.C[388]] = C[389];
                byArray4[CategorySlot.C[390]] = C[391];
                byArray4[CategorySlot.C[392]] = C[393];
                byArray4[CategorySlot.C[394]] = C[395];
                byArray4[CategorySlot.C[396]] = C[397];
                byArray4[CategorySlot.C[398]] = C[399];
                byArray4[14] = -67;
                byArray4[1] = -21;
                byArray4[13] = 93;
                byArray4[6] = -58;
                byArray4[5] = 61;
                byArray4[15] = 66;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 2, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = CategorySlot.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u5969\u5955\u5957".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n3 = cArray[i3];
                        n3 -= 38144;
                        n3 += 46690;
                        n3 -= 60963;
                        n3 -= 52164;
                        n3 += 6934;
                        n3 ^= 0x91F6;
                        n3 += 45255;
                        n3 += 59272;
                        n3 += 14457;
                        n3 -= 23545;
                        cArray[i3] = (char)(n3 -= 48794);
                    }
                    object5 = CategorySlot.A()[2] = new String(cArray);
                }
                b = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = CategorySlot.A()[3];
            if (object6 == null) {
                char[] cArray = "\ue176\ue142\ue214\ue348\ue164\ue16b\ue164\ue348\ue165\ue16c\ue164\ue214\ue352\ue165\ue216\ue161\ue161\ue21e\ue20f\ue160".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n4 = cArray[i4];
                    n4 += 17344;
                    n4 ^= 0xEE61;
                    n4 ^= 0x1DC2;
                    n4 -= 21669;
                    n4 ^= 0x1316;
                    n4 -= 32711;
                    n4 -= 55191;
                    n4 ^= 0x1818;
                    n4 += 13738;
                    n4 ^= 0xB37B;
                    n4 += 65484;
                    cArray[i4] = (char)(n4 -= 59852);
                }
                object6 = CategorySlot.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)b), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = c;
        if (c == null) {
            c = new Object[4];
            objectArray = c;
        }
        return objectArray;
    }

    public static void b() {
        C = new int[0x7B22 ^ 0x7AB2];
        CategorySlot.C[0x106EF ^ 0x1069F] = 0xFFFEF932 ^ 0x1069F;
        CategorySlot.C[0xEA35 ^ 0xEAC1] = 0x8E17 ^ 0xEAC1;
        CategorySlot.C[0x8536 ^ 0x85AA] = 0x85AB ^ 0x85AA;
        CategorySlot.C[0x32D8 ^ 0x33ED] = 0xFFFF0249 ^ 0x33ED;
        CategorySlot.C[0xD695 ^ 0xD6DB] = 0xD6D8 ^ 0xD6DB;
        CategorySlot.C[0x44C0 ^ 0x44C0] = 0xFFFFBB70 ^ 0x44C0;
        CategorySlot.C[0x2BC1 ^ 0x2ACE] = 0x5841 ^ 0x2ACE;
        CategorySlot.C[0x27EB ^ 0x26A5] = 0x6505 ^ 0x26A5;
        CategorySlot.C[0xED14 ^ 0xEDC9] = 0x3228 ^ 0xEDC9;
        CategorySlot.C[0x46F3 ^ 0x4670] = 0x466D ^ 0x4670;
        CategorySlot.C[0xFC03 ^ 0xFD40] = 0x5DAA ^ 0xFD40;
        CategorySlot.C[0x2378 ^ 0x220B] = 0xDB3A ^ 0x220B;
        CategorySlot.C[0x4293 ^ 0x4255] = 0x9B63 ^ 0x4255;
        CategorySlot.C[0x618C ^ 0x6124] = 0x6BE9 ^ 0x6124;
        CategorySlot.C[0x7468 ^ 0x7559] = 0xA26B ^ 0x7559;
        CategorySlot.C[0xB4A4 ^ 0xB464] = 0x37A ^ 0xB464;
        CategorySlot.C[0x6A10 ^ 0x6B66] = 0xF37C ^ 0x6B66;
        CategorySlot.C[0xDB27 ^ 0xDB79] = 0x57F7 ^ 0xDB79;
        CategorySlot.C[0xC473 ^ 0xC417] = 0xC44C ^ 0xC417;
        CategorySlot.C[0x44E9 ^ 0x4498] = 0x44E3 ^ 0x4498;
        CategorySlot.C[0xBCDA ^ 0xBCE2] = 0xBC89 ^ 0xBCE2;
        CategorySlot.C[0x4CDA ^ 0x4CCA] = 0x4CE6 ^ 0x4CCA;
        CategorySlot.C[0x40D ^ 0x525] = 2 ^ 0x525;
        CategorySlot.C[0xBFD2 ^ 0xBEFE] = 0xA500 ^ 0xBEFE;
        CategorySlot.C[0x930 ^ 0x9E6] = 0xFFFF0DAB ^ 0x9E6;
        CategorySlot.C[0x6901 ^ 0x69E7] = 0x312E ^ 0x69E7;
        CategorySlot.C[0xEB5 ^ 0xFE0] = 0xBB1B ^ 0xFE0;
        CategorySlot.C[0xEEB4 ^ 0xEE16] = 0x8DAD ^ 0xEE16;
        CategorySlot.C[0xD9FC ^ 0xD8E7] = 0x2C55 ^ 0xD8E7;
        CategorySlot.C[0x5C3F ^ 0x5D09] = 0x937A ^ 0x5D09;
        CategorySlot.C[0x3CB4 ^ 0x3CEF] = 0xDAE4 ^ 0x3CEF;
        CategorySlot.C[0x4796 ^ 0x473F] = 0x4DFE ^ 0x473F;
        CategorySlot.C[0x6FB6 ^ 0x6EDA] = 0x6EC8 ^ 0x6EDA;
        CategorySlot.C[0x8798 ^ 0x8682] = 0x7D0D ^ 0x8682;
        CategorySlot.C[0x1DEC ^ 0x1D16] = 0xF894 ^ 0x1D16;
        CategorySlot.C[0x576B ^ 0x566F] = 0xA40B ^ 0x566F;
        CategorySlot.C[0xE844 ^ 0xE92C] = 0xE92C ^ 0xE92C;
        CategorySlot.C[0x48D4 ^ 0x481D] = 0x67F2 ^ 0x481D;
        CategorySlot.C[0x158E ^ 0x1507] = 0xFFFFEA8D ^ 0x1507;
        CategorySlot.C[0x7A39 ^ 0x7B3E] = 4 ^ 0x7B3E;
        CategorySlot.C[0xC90E ^ 0xC978] = 0xFFFF36E1 ^ 0xC978;
        CategorySlot.C[0x2CC4 ^ 0x2C97] = 0x2C97 ^ 0x2C97;
        CategorySlot.C[0x3DC7 ^ 0x3C4C] = 0x3C4C ^ 0x3C4C;
        CategorySlot.C[0x447F ^ 0x4486] = 0xFFFF5ECE ^ 0x4486;
        CategorySlot.C[0xAEF1 ^ 0xAEDC] = 0xAE48 ^ 0xAEDC;
        CategorySlot.C[0x288C ^ 0x2833] = 0x1A ^ 0x2833;
        CategorySlot.C[0xE8D1 ^ 0xE80E] = 0x37EF ^ 0xE80E;
        CategorySlot.C[0xB451 ^ 0xB505] = 0x1EC ^ 0xB505;
        CategorySlot.C[0x9D58 ^ 0x9D44] = 0xFFFF62E3 ^ 0x9D44;
        CategorySlot.C[0x4149 ^ 0x4017] = 0x37D2 ^ 0x4017;
        CategorySlot.C[0xB862 ^ 0xB96E] = 0x37AF ^ 0xB96E;
        CategorySlot.C[0x7AC2 ^ 0x7A84] = 0xFFFF851C ^ 0x7A84;
        CategorySlot.C[0xC99A ^ 0xC8B8] = 0x8CA6 ^ 0xC8B8;
        CategorySlot.C[0x781C ^ 0x7996] = 0x7994 ^ 0x7996;
        CategorySlot.C[0xF900 ^ 0xF9B4] = 0x477F ^ 0xF9B4;
        CategorySlot.C[0xAF74 ^ 0xAF93] = 0x3586 ^ 0xAF93;
        CategorySlot.C[0x81F ^ 0x884] = 0xFFFFF75E ^ 0x884;
        CategorySlot.C[0x1634 ^ 0x1687] = 0x9DEB ^ 0x1687;
        CategorySlot.C[0xEA26 ^ 0xEA55] = 0xEA63 ^ 0xEA55;
        CategorySlot.C[0x3C0F ^ 0x3C63] = 0x3C43 ^ 0x3C63;
        CategorySlot.C[0x7493 ^ 0x74AD] = 0xFFFF8B04 ^ 0x74AD;
        CategorySlot.C[0x4EE4 ^ 0x4EE8] = 0x4ECE ^ 0x4EE8;
        CategorySlot.C[0x59FD ^ 0x5960] = 0x5962 ^ 0x5960;
        CategorySlot.C[0x104E7 ^ 0x1059B] = 0x1059B ^ 0x1059B;
        CategorySlot.C[0x2802 ^ 0x28B5] = 0x9673 ^ 0x28B5;
        CategorySlot.C[0x10162 ^ 0x10170] = 0x101E2 ^ 0x10170;
        CategorySlot.C[0xBC41 ^ 0xBCC6] = 0xFFFF4308 ^ 0xBCC6;
        CategorySlot.C[0xBC46 ^ 0xBD65] = 0xDED9 ^ 0xBD65;
        CategorySlot.C[0x17D4 ^ 0x16E8] = 0x2107 ^ 0x16E8;
        CategorySlot.C[0xC95F ^ 0xC9A4] = 0x3305 ^ 0xC9A4;
        CategorySlot.C[0x1044F ^ 0x104DC] = 0x104D4 ^ 0x104DC;
        CategorySlot.C[0x20EA ^ 0x2068] = 0xFFFFDF8B ^ 0x2068;
        CategorySlot.C[0xD55B ^ 0xD514] = 0xD514 ^ 0xD514;
        CategorySlot.C[0x5B05 ^ 0x5A65] = 0xF112 ^ 0x5A65;
        CategorySlot.C[0xD5A9 ^ 0xD570] = 0xF188 ^ 0xD570;
        CategorySlot.C[0xF6A7 ^ 0xF686] = 0xFFFF0907 ^ 0xF686;
        CategorySlot.C[0xE636 ^ 0xE7BF] = 0xFFFF1841 ^ 0xE7BF;
        CategorySlot.C[0x118D ^ 0x11A7] = 0xFFFFEE76 ^ 0x11A7;
        CategorySlot.C[0x580C ^ 0x5806] = 0xFFFFA7C9 ^ 0x5806;
        CategorySlot.C[0xAA85 ^ 0xAA86] = 0xAA98 ^ 0xAA86;
        CategorySlot.C[0xB3A3 ^ 0xB34C] = 0x7B5A ^ 0xB34C;
        CategorySlot.C[0x9233 ^ 0x936F] = 0xE4AA ^ 0x936F;
        CategorySlot.C[0x1802 ^ 0x1861] = 0x1861 ^ 0x1861;
        CategorySlot.C[0xE050 ^ 0xE11B] = 0xA2BD ^ 0xE11B;
        CategorySlot.C[0x1F96 ^ 0x1FA0] = 0x1F0C ^ 0x1FA0;
        CategorySlot.C[0xA276 ^ 0xA364] = 0xD1FC ^ 0xA364;
        CategorySlot.C[0xE594 ^ 0xE57F] = 0x57C9 ^ 0xE57F;
        CategorySlot.C[0xBAC8 ^ 0xBA58] = 0xFFFF45AC ^ 0xBA58;
        CategorySlot.C[0x8908 ^ 0x886B] = 0x833B ^ 0x886B;
        CategorySlot.C[0x133F ^ 0x1399] = 0xBFCA ^ 0x1399;
        CategorySlot.C[0x4501 ^ 0x45A1] = 0x45A0 ^ 0x45A1;
        CategorySlot.C[0xC80F ^ 0xC966] = 0xC966 ^ 0xC966;
        CategorySlot.C[0x97A ^ 0x820] = 0x14FF ^ 0x820;
        CategorySlot.C[0x7120 ^ 0x7068] = 0x9A14 ^ 0x7068;
        CategorySlot.C[0x2887 ^ 0x28F0] = 0x28AF ^ 0x28F0;
        CategorySlot.C[0xA600 ^ 0xA6C3] = 0x11D6 ^ 0xA6C3;
        CategorySlot.C[0xE654 ^ 0xE652] = 0xE660 ^ 0xE652;
        CategorySlot.C[0x3D5D ^ 0x3C5D] = 0x7B92 ^ 0x3C5D;
        CategorySlot.C[0xE739 ^ 0xE780] = 0x5CBD ^ 0xE780;
        CategorySlot.C[0x8215 ^ 0x824A] = 0x88E4 ^ 0x824A;
        CategorySlot.C[0xB1E5 ^ 0xB173] = 0xB10F ^ 0xB173;
        CategorySlot.C[0x4789 ^ 0x46E3] = 0x46E2 ^ 0x46E3;
        CategorySlot.C[0x211F ^ 0x2060] = 0x202F ^ 0x2060;
        CategorySlot.C[0xC27A ^ 0xC350] = 0xC677 ^ 0xC350;
        CategorySlot.C[0x448A ^ 0x45B5] = 0x53BE ^ 0x45B5;
        CategorySlot.C[0x9018 ^ 0x90F9] = 0x6FDB ^ 0x90F9;
        CategorySlot.C[0x5A80 ^ 0x5ACB] = 0x5A89 ^ 0x5ACB;
        CategorySlot.C[0x60A5 ^ 0x618E] = 0x7A6F ^ 0x618E;
        CategorySlot.C[0x98F0 ^ 0x9988] = 0x1F95 ^ 0x9988;
        CategorySlot.C[0x2685 ^ 0x26DD] = 0xA9F ^ 0x26DD;
        CategorySlot.C[0x3CE3 ^ 0x3C5D] = 0x146D ^ 0x3C5D;
        CategorySlot.C[0x7A55 ^ 0x7AF1] = 0xD6CF ^ 0x7AF1;
        CategorySlot.C[0x4C27 ^ 0x4D3E] = 0xFFFF4953 ^ 0x4D3E;
        CategorySlot.C[0xC3AF ^ 0xC32A] = 0xC32A ^ 0xC32A;
        CategorySlot.C[0xB855 ^ 0xB83C] = 0xB825 ^ 0xB83C;
        CategorySlot.C[0xE512 ^ 0xE501] = 0xE575 ^ 0xE501;
        CategorySlot.C[0x23BA ^ 0x22A5] = 0x66AF ^ 0x22A5;
        CategorySlot.C[0xEB96 ^ 0xEAFB] = 0x2F5E ^ 0xEAFB;
        CategorySlot.C[0xD34C ^ 0xD3C1] = 0xFFFF2C5C ^ 0xD3C1;
        CategorySlot.C[0xB175 ^ 0xB195] = 0x4EB2 ^ 0xB195;
        CategorySlot.C[0xED84 ^ 0xECBC] = 0x97DE ^ 0xECBC;
        CategorySlot.C[0xF007 ^ 0xF0CC] = 0xDF23 ^ 0xF0CC;
        CategorySlot.C[0x920E ^ 0x934A] = 0x33A5 ^ 0x934A;
        CategorySlot.C[0xD1CC ^ 0xD1A6] = 0xD193 ^ 0xD1A6;
        CategorySlot.C[0x2810 ^ 0x2823] = 0x285B ^ 0x2823;
        CategorySlot.C[0x8BE4 ^ 0x8AA8] = 0xC908 ^ 0x8AA8;
        CategorySlot.C[0x532A ^ 0x530A] = 0xFFFFAC83 ^ 0x530A;
        CategorySlot.C[0xF4AA ^ 0xF525] = 0xF510 ^ 0xF525;
        CategorySlot.C[0x8292 ^ 0x83C4] = 0x372D ^ 0x83C4;
        CategorySlot.C[0xEF56 ^ 0xEE62] = 0x2011 ^ 0xEE62;
        CategorySlot.C[0xCAC8 ^ 0xCA94] = 0xF178 ^ 0xCA94;
        CategorySlot.C[0x1E6 ^ 0x1E3] = 0x1EE ^ 0x1E3;
        CategorySlot.C[0xF3DA ^ 0xF2D7] = 0x7C75 ^ 0xF2D7;
        CategorySlot.C[0xA99D ^ 0xA9F2] = 0xFFFF560A ^ 0xA9F2;
        CategorySlot.C[0x375C ^ 0x37E0] = 0x1FCB ^ 0x37E0;
        CategorySlot.C[0xCC80 ^ 0xCD0C] = 0xCD05 ^ 0xCD0C;
        CategorySlot.C[0x43F2 ^ 0x4376] = 0x430D ^ 0x4376;
        CategorySlot.C[0xBDA0 ^ 0xBD2F] = 0xBD5C ^ 0xBD2F;
        CategorySlot.C[0xF830 ^ 0xF870] = 0xF876 ^ 0xF870;
        CategorySlot.C[0x104AC ^ 0x104E0] = 0xFFFEFB09 ^ 0x104E0;
        CategorySlot.C[0xA40 ^ 0xB2F] = 0x4148 ^ 0xB2F;
        CategorySlot.C[0xE407 ^ 0xE4F4] = 0x803B ^ 0xE4F4;
        CategorySlot.C[0xD88A ^ 0xD8BB] = 0xD8FB ^ 0xD8BB;
        CategorySlot.C[0x2279 ^ 0x22AC] = 0xD95D ^ 0x22AC;
        CategorySlot.C[0x634E ^ 0x6317] = 0x3B92 ^ 0x6317;
        CategorySlot.C[0x29D8 ^ 0x2974] = 0x12A3 ^ 0x2974;
        CategorySlot.C[0xC6A7 ^ 0xC68E] = 0xC6BC ^ 0xC68E;
        CategorySlot.C[0x209 ^ 0x25D] = 0x25D ^ 0x25D;
        CategorySlot.C[0x1C86 ^ 0x1DCB] = 0xFFFFA1BC ^ 0x1DCB;
        CategorySlot.C[0x4A73 ^ 0x4A22] = 0x4A22 ^ 0x4A22;
        CategorySlot.C[0x5B36 ^ 0x5A33] = 0xA80C ^ 0x5A33;
        CategorySlot.C[0x870 ^ 0x950] = 0x4D4E ^ 0x950;
        CategorySlot.C[0xE086 ^ 0xE0FE] = 0xE0F1 ^ 0xE0FE;
        CategorySlot.C[0xB0A4 ^ 0xB0D8] = 0xFFFF4F66 ^ 0xB0D8;
        CategorySlot.C[0xD688 ^ 0xD6AF] = 0xD66B ^ 0xD6AF;
        CategorySlot.C[0x10AA5 ^ 0x10A81] = 0x10A3E ^ 0x10A81;
        CategorySlot.C[0xE80A ^ 0xE8BB] = 0x63D7 ^ 0xE8BB;
        CategorySlot.C[0xB003 ^ 0xB02C] = 0xB05B ^ 0xB02C;
        CategorySlot.C[0x7DAF ^ 0x7CF8] = 0x6026 ^ 0x7CF8;
        CategorySlot.C[0x6826 ^ 0x68FC] = 0xFFFFB3A5 ^ 0x68FC;
        CategorySlot.C[0xFB23 ^ 0xFB32] = 0xFFFF0480 ^ 0xFB32;
        CategorySlot.C[0x36B7 ^ 0x37E7] = 0x9930 ^ 0x37E7;
        CategorySlot.C[0xA5F9 ^ 0xA4A2] = 0xD37C ^ 0xA4A2;
        CategorySlot.C[0x223C ^ 0x22E0] = 0xFD06 ^ 0x22E0;
        CategorySlot.C[0x6D25 ^ 0x6D84] = 0x6D84 ^ 0x6D84;
        CategorySlot.C[0xE142 ^ 0xE05F] = 0xFFFFEB39 ^ 0xE05F;
        CategorySlot.C[0x9018 ^ 0x9003] = 0xFFFF6FAA ^ 0x9003;
        CategorySlot.C[0x1720 ^ 0x17F7] = 0xEC06 ^ 0x17F7;
        CategorySlot.C[0x90D6 ^ 0x905C] = 0xFFFF6F87 ^ 0x905C;
        CategorySlot.C[0x6023 ^ 0x60BB] = 0x6092 ^ 0x60BB;
        CategorySlot.C[0xB767 ^ 0xB72E] = 0xB77B ^ 0xB72E;
        CategorySlot.C[0xCB25 ^ 0xCA58] = 0xFFFF35EC ^ 0xCA58;
        CategorySlot.C[0x10633 ^ 0x1060C] = 0x10608 ^ 0x1060C;
        CategorySlot.C[0xB10F ^ 0xB170] = 0xB126 ^ 0xB170;
        CategorySlot.C[0x49CB ^ 0x490F] = 0x901E ^ 0x490F;
        CategorySlot.C[0x2C67 ^ 0x2D71] = 0x2401 ^ 0x2D71;
        CategorySlot.C[0xA1A3 ^ 0xA180] = 0xA19E ^ 0xA180;
        CategorySlot.C[0xD45C ^ 0xD5D1] = 0xFFFF2A4B ^ 0xD5D1;
        CategorySlot.C[0x8149 ^ 0x811C] = 0x8144 ^ 0x811C;
        CategorySlot.C[0x26DD ^ 0x2621] = 0xDC8D ^ 0x2621;
        CategorySlot.C[0xED26 ^ 0xEDA6] = 0xFFFF1262 ^ 0xEDA6;
        CategorySlot.C[0x5661 ^ 0x564D] = 0xFFFFA9A9 ^ 0x564D;
        CategorySlot.C[0x37FF ^ 0x3715] = 0xAD0C ^ 0x3715;
        CategorySlot.C[0x9DD3 ^ 0x9DF8] = 0x9DD2 ^ 0x9DF8;
        CategorySlot.C[0xDB6B ^ 0xDA50] = 0xEDA1 ^ 0xDA50;
        CategorySlot.C[0xDA41 ^ 0xDACF] = 0xFFFF2501 ^ 0xDACF;
        CategorySlot.C[0x62A ^ 0x779] = 0xB393 ^ 0x779;
        CategorySlot.C[0xD923 ^ 0xD9ED] = 0xFFFF9B53 ^ 0xD9ED;
        CategorySlot.C[0xCCD8 ^ 0xCDD1] = 0xFFFF4970 ^ 0xCDD1;
        CategorySlot.C[0x5FF3 ^ 0x5F48] = 0xE475 ^ 0x5F48;
        CategorySlot.C[0xD747 ^ 0xD794] = 0x527D ^ 0xD794;
        CategorySlot.C[0x16F4 ^ 0x162A] = 0xC9F4 ^ 0x162A;
        CategorySlot.C[0x32A5 ^ 0x32E7] = 0x32B4 ^ 0x32E7;
        CategorySlot.C[0x5448 ^ 0x54B5] = 0xFFFF51B8 ^ 0x54B5;
        CategorySlot.C[0x1E53 ^ 0x1F02] = 0xFFFF4E39 ^ 0x1F02;
        CategorySlot.C[0x5E5D ^ 0x5F4E] = 0x5630 ^ 0x5F4E;
        CategorySlot.C[0x18DD ^ 0x188A] = 0x91EA ^ 0x188A;
        CategorySlot.C[0x10664 ^ 0x10656] = 0x10657 ^ 0x10656;
        CategorySlot.C[0xBADD ^ 0xBB84] = 0xFFFF58C6 ^ 0xBB84;
        CategorySlot.C[0xCF32 ^ 0xCFA8] = 0xFFFF3053 ^ 0xCFA8;
        CategorySlot.C[0x55FD ^ 0x5540] = 0x7D69 ^ 0x5540;
        CategorySlot.C[0xC1F6 ^ 0xC113] = 0x99FA ^ 0xC113;
        CategorySlot.C[0xE4E1 ^ 0xE5C7] = 0x8661 ^ 0xE5C7;
        CategorySlot.C[0x30E2 ^ 0x307D] = 0x307C ^ 0x307D;
        CategorySlot.C[0x6F61 ^ 0x6FCE] = 0x5410 ^ 0x6FCE;
        CategorySlot.C[0x10590 ^ 0x104E7] = 0x132FB ^ 0x104E7;
        CategorySlot.C[0xE4EB ^ 0xE472] = 0xFFFF1B87 ^ 0xE472;
        CategorySlot.C[0x5ABA ^ 0x5BDE] = 0x5089 ^ 0x5BDE;
        CategorySlot.C[0xB3C ^ 0xA0B] = 0x716B ^ 0xA0B;
        CategorySlot.C[0xD3D1 ^ 0xD321] = 0x1B27 ^ 0xD321;
        CategorySlot.C[0xC6F4 ^ 0xC6F0] = 0xC6E1 ^ 0xC6F0;
        CategorySlot.C[0x85A0 ^ 0x85B4] = 0x85A9 ^ 0x85B4;
        CategorySlot.C[0x1CA6 ^ 0x1DB6] = 0x6F2E ^ 0x1DB6;
        CategorySlot.C[0xCD65 ^ 0xCDD5] = 0x46B6 ^ 0xCDD5;
        CategorySlot.C[0xAD2B ^ 0xACA9] = 0xACA5 ^ 0xACA9;
        CategorySlot.C[0xD931 ^ 0xD815] = 0xBBB3 ^ 0xD815;
        CategorySlot.C[0x77D0 ^ 0x779A] = 0xFFFF880A ^ 0x779A;
        CategorySlot.C[0x8A1F ^ 0x8A06] = 0x8A46 ^ 0x8A06;
        CategorySlot.C[0xC840 ^ 0xC877] = 0xC837 ^ 0xC877;
        CategorySlot.C[0x9CB3 ^ 0x9C10] = 0xFFBB ^ 0x9C10;
        CategorySlot.C[0x84D0 ^ 0x84B2] = 0xCD8D ^ 0x84B2;
        CategorySlot.C[0x92DB ^ 0x9261] = 0xFFFFD6F6 ^ 0x9261;
        CategorySlot.C[0xCCE7 ^ 0xCC2F] = 0xE3C8 ^ 0xCC2F;
        CategorySlot.C[0x230C ^ 0x239D] = 0xFFFFDC63 ^ 0x239D;
        CategorySlot.C[0xD80B ^ 0xD965] = 0x7C20 ^ 0xD965;
        CategorySlot.C[0x98F7 ^ 0x98CD] = 0x98DE ^ 0x98CD;
        CategorySlot.C[0xB66 ^ 0xB0D] = 0xB01 ^ 0xB0D;
        CategorySlot.C[0x66E1 ^ 0x66F4] = 0x66E8 ^ 0x66F4;
        CategorySlot.C[0xEA16 ^ 0xEB28] = 0xDCC7 ^ 0xEB28;
        CategorySlot.C[0xC ^ 1] = 0xFFFFFFF4 ^ 1;
        CategorySlot.C[0x9FAC ^ 0x9EEA] = 0x3E05 ^ 0x9EEA;
        CategorySlot.C[0xD861 ^ 0xD81A] = 0xD843 ^ 0xD81A;
        CategorySlot.C[0x27B2 ^ 0x27BC] = 0xFFFFD86D ^ 0x27BC;
        CategorySlot.C[0x731C ^ 0x7294] = 0x7297 ^ 0x7294;
        CategorySlot.C[0xA51A ^ 0xA435] = 0x7346 ^ 0xA435;
        CategorySlot.C[0x1A6F ^ 0x1A75] = 0xFFFFE5B7 ^ 0x1A75;
        CategorySlot.C[0x8085 ^ 0x80E2] = 0x80EB ^ 0x80E2;
        CategorySlot.C[0x3C97 ^ 0x3C79] = 0x8EDC ^ 0x3C79;
        CategorySlot.C[0x217E ^ 0x207D] = 0xD216 ^ 0x207D;
        CategorySlot.C[0x1012 ^ 0x10C6] = 0xEB36 ^ 0x10C6;
        CategorySlot.C[0x1AD ^ 0x1B0] = 0x19E ^ 0x1B0;
        CategorySlot.C[0xFDA8 ^ 0xFDC6] = 0xFDDA ^ 0xFDC6;
        CategorySlot.C[0x2D1C ^ 0x2C7D] = 0xFFFF78DB ^ 0x2C7D;
        CategorySlot.C[0x7458 ^ 0x74F3] = 0x7E32 ^ 0x74F3;
        CategorySlot.C[0xDA8C ^ 0xDB99] = 0xFFFF2D55 ^ 0xDB99;
        CategorySlot.C[0x44F4 ^ 0x4489] = 0x4480 ^ 0x4489;
        CategorySlot.C[0x3871 ^ 0x3933] = 0x2F32 ^ 0x3933;
        CategorySlot.C[0x70B4 ^ 0x718D] = 0xAC1 ^ 0x718D;
        CategorySlot.C[0x10680 ^ 0x106CD] = 0xFFFEF938 ^ 0x106CD;
        CategorySlot.C[0x2D35 ^ 0x2DB3] = 0xFFFFD216 ^ 0x2DB3;
        CategorySlot.C[0x9255 ^ 0x92BC] = 0x8EF ^ 0x92BC;
        CategorySlot.C[0xF37 ^ 0xFC5] = 0xC7C3 ^ 0xFC5;
        CategorySlot.C[0x9CFC ^ 0x9DC6] = 0xE6A4 ^ 0x9DC6;
        CategorySlot.C[0x7E88 ^ 0x7E2F] = 0xD215 ^ 0x7E2F;
        CategorySlot.C[0x1037D ^ 0x1027C] = 0x1459C ^ 0x1027C;
        CategorySlot.C[0x43B ^ 0x45A] = 0xCC41 ^ 0x45A;
        CategorySlot.C[0x50A4 ^ 0x505B] = 0x179C ^ 0x505B;
        CategorySlot.C[0xE656 ^ 0xE674] = 0xFFFF19F7 ^ 0xE674;
        CategorySlot.C[0xE061 ^ 0xE118] = 0x1587 ^ 0xE118;
        CategorySlot.C[0x45ED ^ 0x446A] = 0xFFFFBBA8 ^ 0x446A;
        CategorySlot.C[0x2913 ^ 0x29FF] = 0x9B5A ^ 0x29FF;
        CategorySlot.C[0x9661 ^ 0x96B9] = 0xB242 ^ 0x96B9;
        CategorySlot.C[0xE9 ^ 0x1DA] = 0xCFB8 ^ 0x1DA;
        CategorySlot.C[0x2290 ^ 0x22A9] = 0x22E8 ^ 0x22A9;
        CategorySlot.C[0xFEB9 ^ 0xFE5A] = 0x178 ^ 0xFE5A;
        CategorySlot.C[0x8BD7 ^ 0x8BB1] = 0x8BAA ^ 0x8BB1;
        CategorySlot.C[0xBC5B ^ 0xBD12] = 0x577A ^ 0xBD12;
        CategorySlot.C[0x3022 ^ 0x3128] = 0x4A0F ^ 0x3128;
        CategorySlot.C[0x5A6E ^ 0x5A6C] = 0xFFFFA59B ^ 0x5A6C;
        CategorySlot.C[0x4EBF ^ 0x4E7E] = 0xF96B ^ 0x4E7E;
        CategorySlot.C[0xF77 ^ 0xFDA] = 0x3404 ^ 0xFDA;
        CategorySlot.C[0xE747 ^ 0xE641] = 0x1425 ^ 0xE641;
        CategorySlot.C[0x187F ^ 0x194D] = 0xCE3A ^ 0x194D;
        CategorySlot.C[0x3F5B ^ 0x3FC9] = 0x3FE3 ^ 0x3FC9;
        CategorySlot.C[0x4ED8 ^ 0x4FA8] = 0x7562 ^ 0x4FA8;
        CategorySlot.C[0xE8EE ^ 0xE9F2] = 0x1D56 ^ 0xE9F2;
        CategorySlot.C[0xC5F8 ^ 0xC5C8] = 0xC5A9 ^ 0xC5C8;
        CategorySlot.C[0x9369 ^ 0x9341] = 0xFFFF6CCF ^ 0x9341;
        CategorySlot.C[0xC5A7 ^ 0xC4E6] = 0xD2DD ^ 0xC4E6;
        CategorySlot.C[0x1A83 ^ 0x1BF8] = 0x1BE8 ^ 0x1BF8;
        CategorySlot.C[0x10185 ^ 0x10167] = 0x1FE60 ^ 0x10167;
        CategorySlot.C[0xED13 ^ 0xED43] = 0xED42 ^ 0xED43;
        CategorySlot.C[0x4AD9 ^ 0x4BCE] = 0xB041 ^ 0x4BCE;
        CategorySlot.C[0xE8C5 ^ 0xE83B] = 0x1297 ^ 0xE83B;
        CategorySlot.C[0x447D ^ 0x44E3] = 0x44E3 ^ 0x44E3;
        CategorySlot.C[0x10B19 ^ 0x10BEE] = 0x1EE79 ^ 0x10BEE;
        CategorySlot.C[0x5660 ^ 0x56EB] = 0x56AE ^ 0x56EB;
        CategorySlot.C[0xE2DD ^ 0xE2D2] = 0xFFFF1D0C ^ 0xE2D2;
        CategorySlot.C[0x6CA7 ^ 0x6DD2] = 0x436A ^ 0x6DD2;
        CategorySlot.C[0xCC08 ^ 0xCC00] = 0xFFFF33B1 ^ 0xCC00;
        CategorySlot.C[0x2490 ^ 0x2440] = 0xA1A3 ^ 0x2440;
        CategorySlot.C[0x56FA ^ 0x56A0] = 0x44EA ^ 0x56A0;
        CategorySlot.C[0xD826 ^ 0xD941] = 0xD941 ^ 0xD941;
        CategorySlot.C[0xB598 ^ 0xB54A] = 0xFFFFCF23 ^ 0xB54A;
        CategorySlot.C[0x2705 ^ 0x27C0] = 0xFED7 ^ 0x27C0;
        CategorySlot.C[0xBA30 ^ 0xBAD4] = 0xBAD4 ^ 0xBAD4;
        CategorySlot.C[0x2B53 ^ 0x2A29] = 0x2A28 ^ 0x2A29;
        CategorySlot.C[0x1082F ^ 0x10842] = 0xFFFEF7BF ^ 0x10842;
        CategorySlot.C[0xD84D ^ 0xD908] = 0x7992 ^ 0xD908;
        CategorySlot.C[0xD5DA ^ 0xD5CD] = 0xFFFF2A3E ^ 0xD5CD;
        CategorySlot.C[0x926D ^ 0x92F9] = 0x9299 ^ 0x92F9;
        CategorySlot.C[0x3A8A ^ 0x3B09] = 0x3B54 ^ 0x3B09;
        CategorySlot.C[0x6EE4 ^ 0x6F65] = 0xFFFF909A ^ 0x6F65;
        CategorySlot.C[0xE064 ^ 0xE0DC] = 0x5BE1 ^ 0xE0DC;
        CategorySlot.C[0x32CC ^ 0x33ED] = 0xFFFF8843 ^ 0x33ED;
        CategorySlot.C[0x8D2D ^ 0x8DA1] = 0xFFFF7217 ^ 0x8DA1;
        CategorySlot.C[0x3C2F ^ 0x3C8A] = 0x90B0 ^ 0x3C8A;
        CategorySlot.C[0xACC5 ^ 0xAC34] = 0x640E ^ 0xAC34;
        CategorySlot.C[0xD6BA ^ 0xD797] = 0xCC4C ^ 0xD797;
        CategorySlot.C[0xFAF5 ^ 0xFA3F] = 0xFFFF2A06 ^ 0xFA3F;
        CategorySlot.C[0xB4A3 ^ 0xB4D9] = 0xB48C ^ 0xB4D9;
        CategorySlot.C[0x2C2F ^ 0x2C30] = 0x2C62 ^ 0x2C30;
        CategorySlot.C[0x2DBA ^ 0x2CE5] = 0x8799 ^ 0x2CE5;
        CategorySlot.C[0xB351 ^ 0xB39C] = 0xECC ^ 0xB39C;
        CategorySlot.C[0x1813 ^ 0x190D] = 0xEDA9 ^ 0x190D;
        CategorySlot.C[0xEA19 ^ 0xEA5C] = 0xEA05 ^ 0xEA5C;
        CategorySlot.C[0xED2D ^ 0xED65] = 0xEDAC ^ 0xED65;
        CategorySlot.C[0x5614 ^ 0x5671] = 0x5611 ^ 0x5671;
        CategorySlot.C[0x100F5 ^ 0x100B4] = 0x100BE ^ 0x100B4;
        CategorySlot.C[0x4AED ^ 0x4B6B] = 0x4B61 ^ 0x4B6B;
        CategorySlot.C[0xFE0D ^ 0xFF5F] = 0x5188 ^ 0xFF5F;
        CategorySlot.C[0x721F ^ 0x731D] = 0x34D2 ^ 0x731D;
        CategorySlot.C[0x5884 ^ 0x59B4] = 0x8EC3 ^ 0x59B4;
        CategorySlot.C[0xF72D ^ 0xF75F] = 0xFFFF0882 ^ 0xF75F;
        CategorySlot.C[0x3771 ^ 0x367A] = 0xB8A3 ^ 0x367A;
        CategorySlot.C[0x9B1F ^ 0x9A55] = 0x7029 ^ 0x9A55;
        CategorySlot.C[0xA9F9 ^ 0xA9D7] = 0xFFFF562A ^ 0xA9D7;
        CategorySlot.C[0xEEB7 ^ 0xEFF0] = 0x585 ^ 0xEFF0;
        CategorySlot.C[0xE535 ^ 0xE509] = 0xE567 ^ 0xE509;
        CategorySlot.C[0xBE03 ^ 0xBE1B] = 0xFFFF41B9 ^ 0xBE1B;
        CategorySlot.C[0x8667 ^ 0x86F0] = 0x86C3 ^ 0x86F0;
        CategorySlot.C[0x9911 ^ 0x9874] = 0xFFFF6CAC ^ 0x9874;
        CategorySlot.C[0x1A9B ^ 0x1A9C] = 0x1AE1 ^ 0x1A9C;
        CategorySlot.C[0x5496 ^ 0x5518] = 0x551C ^ 0x5518;
        CategorySlot.C[0x4ACD ^ 0x4AB9] = 0x4AC0 ^ 0x4AB9;
        CategorySlot.C[0xB856 ^ 0xB828] = 0xFFFF47A6 ^ 0xB828;
        CategorySlot.C[0xDF27 ^ 0xDFD1] = 0xBB07 ^ 0xDFD1;
        CategorySlot.C[0x79C3 ^ 0x78B1] = 0xAF81 ^ 0x78B1;
        CategorySlot.C[0xE212 ^ 0xE397] = 0xFFFF1C6A ^ 0xE397;
        CategorySlot.C[0xDE7A ^ 0xDF27] = 0xA8A6 ^ 0xDF27;
        CategorySlot.C[0xF589 ^ 0xF545] = 0x481B ^ 0xF545;
        CategorySlot.C[0x6CC5 ^ 0x6DB4] = 0x70BA ^ 0x6DB4;
        CategorySlot.C[0x5D53 ^ 0x5D2A] = 0x5D6E ^ 0x5D2A;
        CategorySlot.C[0xEC81 ^ 0xECB4] = 0xEC91 ^ 0xECB4;
        CategorySlot.C[0xD50F ^ 0xD559] = 0x1B59 ^ 0xD559;
        CategorySlot.C[0x21C5 ^ 0x20B1] = 0x98C6 ^ 0x20B1;
        CategorySlot.C[0xA334 ^ 0xA354] = 0x7487 ^ 0xA354;
        CategorySlot.C[0xC449 ^ 0xC547] = 0x4B86 ^ 0xC547;
        CategorySlot.C[0x10DAC ^ 0x10CA4] = 0x17783 ^ 0x10CA4;
        CategorySlot.C[0xA120 ^ 0xA17D] = 0xEC13 ^ 0xA17D;
        CategorySlot.C[0xF387 ^ 0xF3C4] = 0xFFFF0C1E ^ 0xF3C4;
        CategorySlot.C[0x78E ^ 0x7C9] = 0xFFFFF839 ^ 0x7C9;
        CategorySlot.C[0x972C ^ 0x9782] = 0xFFFF53EB ^ 0x9782;
        CategorySlot.C[0x5402 ^ 0x5446] = 0xFFFFABCF ^ 0x5446;
        CategorySlot.C[0x62C7 ^ 0x622F] = 0xF836 ^ 0x622F;
        CategorySlot.C[0x9FBE ^ 0x9F79] = 0x466E ^ 0x9F79;
        CategorySlot.C[0x7E24 ^ 0x7FA4] = 0x7FA3 ^ 0x7FA4;
        CategorySlot.C[0x3680 ^ 0x36BD] = 0xFFFFC954 ^ 0x36BD;
        CategorySlot.C[0x3C90 ^ 0x3C22] = 0xB712 ^ 0x3C22;
        CategorySlot.C[0xC7AF ^ 0xC6C9] = 0xCD9E ^ 0xC6C9;
        CategorySlot.C[0xD354 ^ 0xD20C] = 0xCED3 ^ 0xD20C;
        CategorySlot.C[0x1C2C ^ 0x1CB9] = 0xFFFFE301 ^ 0x1CB9;
        CategorySlot.C[0xFE64 ^ 0xFFE0] = 0xFFEB ^ 0xFFE0;
        CategorySlot.C[0x5DBB ^ 0x5DB0] = 0x5DD3 ^ 0x5DB0;
        CategorySlot.C[0x5278 ^ 0x52A3] = 0x765B ^ 0x52A3;
        CategorySlot.C[0xCDAD ^ 0xCC84] = 0xC9AF ^ 0xCC84;
        CategorySlot.C[0xAA4F ^ 0xAB68] = 0xAE53 ^ 0xAB68;
        CategorySlot.C[0x1067E ^ 0x106C8] = 0xFFFE4788 ^ 0x106C8;
        CategorySlot.C[0x10762 ^ 0x1077C] = 0x10738 ^ 0x1077C;
        CategorySlot.C[0xE331 ^ 0xE3F3] = 0x5491 ^ 0xE3F3;
        CategorySlot.C[0x9497 ^ 0x95F5] = 0x3E82 ^ 0x95F5;
        CategorySlot.C[0xB4DE ^ 0xB4DF] = 0xB499 ^ 0xB4DF;
        CategorySlot.C[0xD8C1 ^ 0xD840] = 0xD86A ^ 0xD840;
        CategorySlot.C[0xB8FD ^ 0xB9BD] = 0xAFBC ^ 0xB9BD;
        CategorySlot.C[0xCFC1 ^ 0xCFE4] = 0xCF84 ^ 0xCFE4;
        CategorySlot.C[0x5E92 ^ 0x5E38] = 0x54EC ^ 0x5E38;
        CategorySlot.C[0xFF8B ^ 0xFEB6] = 0xC90C ^ 0xFEB6;
        CategorySlot.C[0x10511 ^ 0x1045E] = 0x1AA9B ^ 0x1045E;
        CategorySlot.C[0xC932 ^ 0xC924] = 0xFFFF36D3 ^ 0xC924;
        CategorySlot.C[0xD469 ^ 0xD484] = 0x6639 ^ 0xD484;
        CategorySlot.C[0x905D ^ 0x9028] = 0x9021 ^ 0x9028;
        CategorySlot.C[0xB923 ^ 0xB80D] = 0xA3F3 ^ 0xB80D;
        CategorySlot.C[0xC4F2 ^ 0xC5D7] = 0xFFFF59CF ^ 0xC5D7;
        CategorySlot.C[0xB2EF ^ 0xB267] = 0xB243 ^ 0xB267;
        CategorySlot.C[0xD366 ^ 0xD272] = 0xDB02 ^ 0xD272;
        CategorySlot.C[0x10E4F ^ 0x10EFA] = 0x1B03C ^ 0x10EFA;
        CategorySlot.C[0xB4E3 ^ 0xB4D8] = 0xB4F6 ^ 0xB4D8;
        CategorySlot.C[0xB306 ^ 0xB3D7] = 0x363E ^ 0xB3D7;
        CategorySlot.C[0xFB75 ^ 0xFB53] = 0xFB6C ^ 0xFB53;
        CategorySlot.C[0xFFFB ^ 0xFF03] = 0x1A81 ^ 0xFF03;
        CategorySlot.C[0x2197 ^ 0x21A3] = 0x21D0 ^ 0x21A3;
        CategorySlot.C[0xACBF ^ 0xADD4] = 0xADD4 ^ 0xADD4;
        CategorySlot.C[0xA212 ^ 0xA2DD] = 0x1F8D ^ 0xA2DD;
        CategorySlot.C[0x58AC ^ 0x58A5] = 0x5896 ^ 0x58A5;
        CategorySlot.C[0xD564 ^ 0xD50C] = 0xFFFF2AE5 ^ 0xD50C;
        CategorySlot.C[0xA629 ^ 0xA67B] = 0xA679 ^ 0xA67B;
        CategorySlot.C[0x67AD ^ 0x6758] = 0xFFFFFC6B ^ 0x6758;
        CategorySlot.C[0x3E16 ^ 0x3F0E] = 0xC481 ^ 0x3F0E;
        CategorySlot.C[0xC56D ^ 0xC47C] = 0xB6A8 ^ 0xC47C;
        CategorySlot.C[0x43C7 ^ 0x42B9] = 0x42B1 ^ 0x42B9;
    }
}

