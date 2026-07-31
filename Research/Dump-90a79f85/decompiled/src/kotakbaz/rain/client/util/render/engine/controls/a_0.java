/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10366
 *  net.minecraft.class_11278
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fStack
 *  org.joml.Matrix4fc
 */
package kotakbaz.rain.client.util.render.engine.controls;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.RenderSystem;
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
import kotakbaz.rain.client.extensions.A;
import kotakbaz.rain.client.extensions.b_0;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import net.minecraft.class_10366;
import net.minecraft.class_11278;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Matrix4fc;

/*
 * Renamed from kotakbaz.rain.client.util.render.engine.controls.a
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0003J%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0004\u00a2\u0006\u0004\b\r\u0010\u0003J\r\u0010\u000e\u001a\u00020\u0004\u00a2\u0006\u0004\b\u000e\u0010\u0003J\r\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\u0004\b\u000f\u0010\u0003R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u00a8\u0006\u0019"}, d2={"Lkotakbaz/rain/client/util/render/engine/controls/MatrixControl;", "", "<init>", "()V", "", "unscaledProjection", "scaledProjection", "", "x", "y", "scale", "startScale", "(FFF)V", "reset", "pushMatrix", "popMatrix", "Lnet/minecraft/class_11278;", "matrix", "Lnet/minecraft/class_11278;", "Lorg/joml/Matrix4f;", "projectionMatrix", "Lorg/joml/Matrix4f;", "Lorg/joml/Matrix4fStack;", "matrix4fStack", "Lorg/joml/Matrix4fStack;", "rain-visuals"})
public final class a_0 {
    @NotNull
    public static final a_0 INSTANCE;
    @NotNull
    private static final class_11278 a;
    @NotNull
    private static final Matrix4f A;
    @JvmField
    @NotNull
    public static final Matrix4fStack b;
    private static Object[] B;
    private static Object C;
    private static Object[] d;
    private static Object[] c;
    private static Object[] D;
    public static int[] e;

    private a_0() {
        super();
    }

    public final void unscaledProjection() {
        float f2 = b_0.getMc().method_22683().method_4486();
        float f3 = b_0.getMc().method_22683().method_4502();
        RenderSystem.setProjectionMatrix((GpuBufferSlice)a.method_71092(f2, f3), (class_10366)class_10366.field_54954);
        A.set((Matrix4fc)a.method_71094(f2, f3));
    }

    public final void scaledProjection() {
        int n = e[0];
        n += e[1];
        float f2 = (float)b_0.getMc().method_22683().method_4486() / (float)(n += e[2]);
        int n2 = e[3];
        n2 ^= e[4];
        float f3 = (float)b_0.getMc().method_22683().method_4502() / (float)(n2 -= e[5]);
        RenderSystem.setProjectionMatrix((GpuBufferSlice)a.method_71092(f2, f3), (class_10366)class_10366.field_54953);
        A.set((Matrix4fc)a.method_71094(f2, f3));
    }

    public final void startScale(float f2, float f3, float f4) {
        b.translate(f2, f3, 0.0f);
        b.scale(f4, f4, 1.0f);
        b.translate(-f2, -f3, 0.0f);
    }

    public final void reset() {
        b.identity();
    }

    public final void pushMatrix() {
        b.pushMatrix();
    }

    public final void popMatrix() {
        b.popMatrix();
    }

    static {
        a_0.b();
        long l = -2434508537020563642L;
        long l2 = -6457218686757161335L;
        long l3 = -17494253000000671L;
        long l4 = 1692375129644927257L;
        long l5 = -2594582869389177799L;
        long l6 = -986261662074682826L;
        long l7 = -9193308379408784294L;
        long l8 = -5068172189770056349L;
        long l9 = -5373105987456423757L;
        long l10 = -5173694751624787204L;
        long l11 = -8621064723377051696L;
        long l12 = -3487611274359415671L;
        long l13 = -6941379757901442993L;
        long l14 = 3203733480158716502L;
        int n = e[6];
        n ^= e[7];
        B = new Object[n -= e[8]];
        long l15 = l14;
        int n2 = e[9];
        n2 -= e[10];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 -= e[11]);
        Object[] objectArray = new Object[e[12]];
        objectArray[a_0.e[13]] = c;
        objectArray[a_0.e[14]] = e[15];
        int n3 = e[16];
        Object object = a_0.A()[e[17]];
        if (object == null) {
            char[] cArray = "\u587d\u5810\u5836\u5831\u5883\u5819\u5bee\u5be5\u5857\u582f\u5835\u5835\u581d\u5816\u5822\u5be2\u5be3\u5816\u5889\u5810\u5814\u582e\u5bee\u5835\u582d\u5885\u587c\u5884\u5888\u583f\u581d\u5817\u584d\u580e\u5812\u580a\u5834\u580d\u5833\u5810\u5812\u5bef\u580c\u582e\u582f\u580f\u5824\u587c\u5be4\u5815\u580f\u582b\u5be2\u5be8\u583e\u5819\u5838\u584d\u5834\u5889\u580d\u5831\u582e\u5be4".toCharArray();
            for (int i = e[18]; i < e[19]; ++i) {
                int n4 = cArray[i];
                n4 += e[20];
                n4 -= e[21];
                n4 ^= e[22];
                n4 ^= e[23];
                n4 ^= e[24];
                n4 ^= e[25];
                n4 += e[26];
                n4 ^= e[27];
                n4 -= e[28];
                n4 += e[29];
                n4 -= e[30];
                n4 -= e[31];
                cArray[i] = (char)(n4 -= e[32]);
            }
            object = a_0.A()[a_0.e[33]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        Object object2 = ((String)a_0.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = e[34];
        n5 += e[35];
        l5 = l16 ^ (0x1600000000L ^ l16) & -1L << (n5 += e[36]);
        long l17 = l12;
        int n6 = e[37];
        n6 ^= e[38];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 ^= e[39]);
        while (true) {
            int n7 = e[40];
            n7 += e[41];
            if ((int)l12 >= (int)(l5 >>> (n7 += e[42]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = e[43];
            n9 += e[44];
            int n10 = e[46];
            n10 -= e[47];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 -= e[45])) & -1L >>> (n10 += e[48]);
            long l19 = l8;
            int n11 = e[49];
            n11 += e[50];
            l8 = l19 ^ ((long)object2[n8] ^ l19) & -1L >>> (n11 ^= e[51]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = e[52];
            n13 -= e[53];
            int n14 = e[55];
            n14 ^= e[56];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 ^= e[54])) & -1L >>> (n14 += e[57]);
            int n15 = e[58];
            n15 ^= e[59];
            long l21 = l9;
            int n16 = e[61];
            n16 -= e[62];
            l9 = l21 ^ ((long)object2[n12] << (n15 ^= e[60]) ^ l21) & -1L << (n16 ^= e[63]);
            int n17 = e[64];
            n17 ^= e[65];
            n17 ^= e[66];
            int n18 = e[67];
            n18 += e[68];
            long l22 = l11;
            int n19 = e[70];
            n19 ^= e[71];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 += e[69]))) ^ l22) & -1L >>> (n19 += e[72]);
            char[] cArray = new char[(int)l11];
            long l23 = l13;
            int n20 = e[73];
            n20 -= e[74];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 ^= e[75]);
            while (true) {
                int n21 = e[76];
                n21 ^= e[77];
                if ((int)(l13 >>> (n21 ^= e[78])) >= (int)l11) break;
                int n22 = e[79];
                n22 -= e[80];
                int n23 = e[82];
                n23 ^= e[83];
                cArray[(int)(l13 >>> (n22 ^= a_0.e[81]))] = object2[(int)l12 + (int)(l13 >>> (n23 -= e[84]))];
                l13 += 0x100000000L;
            }
            int n24 = e[85];
            n24 ^= e[86];
            int n25 = (int)(l14 >>> (n24 -= e[87]));
            l14 += 0x100000000L;
            a_0.B[n25] = new String(cArray);
            long l24 = l12;
            int n26 = e[88];
            n26 -= e[89];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 -= e[90]);
        }
        INSTANCE = new a_0();
        String string = kotakbaz.rain.client.extensions.A.getCLIENT_ID();
        int n27 = e[91];
        n27 += e[92];
        int n28 = e[94];
        n28 += e[95];
        boolean bl = e[97];
        bl += e[98];
        a = new class_11278(string + ((String)B[n27 += e[93]] + (String)B[n28 += e[96]]), -1000.0f, 1000.0f, bl -= e[99]);
        A = new Matrix4f();
        int n29 = e[100];
        n29 += e[101];
        Matrix4fStack matrix4fStack = new Matrix4fStack(n29 ^= e[102]);
        object2 = matrix4fStack;
        long l25 = l5;
        int n30 = e[103];
        n30 ^= e[104];
        l5 = l25 ^ (0L ^ l25) & -1L << (n30 ^= e[105]);
        object2.identity();
        b = matrix4fStack;
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[e[106]];
        String string = (String)object[e[107]];
        object = object[e[108]];
        Object[] objectArray = d;
        if (d == null) {
            objectArray = d = new Object[e[109]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[e[110]];
                c = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[e[112] ^ e[113]];
                byArray[a_0.e[114] ^ a_0.e[115]] = e[116] ^ e[117];
                byArray[a_0.e[118] ^ a_0.e[119]] = e[120] ^ e[121];
                byArray[a_0.e[122] ^ a_0.e[123]] = e[124] ^ e[125];
                byArray[a_0.e[126] ^ a_0.e[127]] = e[128] ^ e[129];
                byArray[a_0.e[130] ^ a_0.e[131]] = e[132] ^ e[133];
                byArray[a_0.e[134] ^ a_0.e[135]] = e[136] ^ e[137];
                byArray[a_0.e[138] ^ a_0.e[139]] = e[140] ^ e[141];
                byArray[a_0.e[142] ^ a_0.e[143]] = e[144] ^ e[145];
                byArray[a_0.e[146] ^ a_0.e[147]] = e[148] ^ e[149];
                byArray[a_0.e[150] ^ a_0.e[151]] = e[152] ^ e[153];
                byArray[a_0.e[154] ^ a_0.e[155]] = e[156] ^ e[157];
                byArray[a_0.e[158] ^ a_0.e[159]] = e[160] ^ e[161];
                byArray[a_0.e[162] ^ a_0.e[163]] = e[164] ^ e[165];
                byArray[a_0.e[166] ^ a_0.e[167]] = e[168] ^ e[169];
                byArray[a_0.e[170] ^ a_0.e[171]] = e[172] ^ e[173];
                byArray[a_0.e[174] ^ a_0.e[175]] = e[176] ^ e[177];
                objectArray2[a_0.e[111]] = byArray;
            }
            byte[] byArray = (byte[])object3[e[178]];
            if (C == null) {
                byte[] byArray2 = new byte[e[179] ^ e[180]];
                byArray2[a_0.e[181] ^ a_0.e[182]] = e[183] ^ e[184];
                byArray2[a_0.e[185] ^ a_0.e[186]] = e[187] ^ e[188];
                byArray2[a_0.e[189] ^ a_0.e[190]] = e[191] ^ e[192];
                byArray2[a_0.e[193] ^ a_0.e[194]] = e[195] ^ e[196];
                byArray2[a_0.e[197] ^ a_0.e[198]] = e[199] ^ e[200];
                byArray2[a_0.e[201] ^ a_0.e[202]] = e[203] ^ e[204];
                byArray2[a_0.e[205] ^ a_0.e[206]] = e[207] ^ e[208];
                byArray2[a_0.e[209] ^ a_0.e[210]] = e[211] ^ e[212];
                byArray2[a_0.e[213] ^ a_0.e[214]] = e[215] ^ e[216];
                byArray2[a_0.e[217] ^ a_0.e[218]] = e[219] ^ e[220];
                byArray2[a_0.e[221] ^ a_0.e[222]] = e[223] ^ e[224];
                byArray2[a_0.e[225] ^ a_0.e[226]] = e[227] ^ e[228];
                byArray2[a_0.e[229] ^ a_0.e[230]] = e[231] ^ e[232];
                byArray2[a_0.e[233] ^ a_0.e[234]] = e[235] ^ e[236];
                byArray2[a_0.e[237] ^ a_0.e[238]] = e[239] ^ e[240];
                byArray2[a_0.e[241] ^ a_0.e[242]] = e[243] ^ e[244];
                byArray2[a_0.e[245] ^ a_0.e[246]] = e[247] ^ e[248];
                byArray2[a_0.e[249] ^ a_0.e[250]] = e[251] ^ e[252];
                byArray2[a_0.e[253] ^ a_0.e[254]] = e[255] ^ e[256];
                byArray2[a_0.e[257] ^ a_0.e[258]] = e[259] ^ e[260];
                byArray2[a_0.e[261] ^ a_0.e[262]] = e[263] ^ e[264];
                byArray2[a_0.e[265] ^ a_0.e[266]] = e[267] ^ e[268];
                byArray2[a_0.e[269] ^ a_0.e[270]] = e[271] ^ e[272];
                byArray2[a_0.e[273] ^ a_0.e[274]] = e[275] ^ e[276];
                byArray2[a_0.e[277] ^ a_0.e[278]] = e[279] ^ e[280];
                byArray2[a_0.e[281] ^ a_0.e[282]] = e[283] ^ e[284];
                byArray2[a_0.e[285] ^ a_0.e[286]] = e[287] ^ e[288];
                byArray2[a_0.e[289] ^ a_0.e[290]] = e[291] ^ e[292];
                byArray2[a_0.e[293] ^ a_0.e[294]] = e[295] ^ e[296];
                byArray2[a_0.e[297] ^ a_0.e[298]] = e[299] ^ e[300];
                byArray2[a_0.e[301] ^ a_0.e[302]] = e[303] ^ e[304];
                byArray2[a_0.e[305] ^ a_0.e[306]] = e[307] ^ e[308];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, e[309], byArray3, e[310], byArray.length);
                System.arraycopy(byArray2, e[311], byArray3, byArray.length, byArray2.length);
                Object object4 = a_0.A()[e[312]];
                if (object4 == null) {
                    char[] cArray = "\u8c1e\u8c08\u8c25\u8c0a\u8c14\u8c78\u8db9\u8cc3\u8c3a\u8cc6\u8c26\u8c2f\u8dab\u8dad\u8c1d\u8c26\u8c0b\u8c7b".toCharArray();
                    for (int i = e[313]; i < e[314]; ++i) {
                        int n2 = cArray[i];
                        n2 ^= e[315];
                        n2 -= e[316];
                        n2 -= e[317];
                        n2 += e[318];
                        n2 -= e[319];
                        n2 ^= e[320];
                        n2 -= e[321];
                        n2 -= e[322];
                        n2 += e[323];
                        n2 ^= e[324];
                        n2 ^= e[325];
                        n2 += e[326];
                        n2 += e[327];
                        n2 += e[328];
                        n2 += e[329];
                        cArray[i] = (char)(n2 += e[330]);
                    }
                    object4 = a_0.A()[a_0.e[331]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[e[332]];
                byArray4[a_0.e[333]] = e[334];
                byArray4[a_0.e[335]] = e[336];
                byArray4[a_0.e[337]] = e[338];
                byArray4[a_0.e[339]] = e[340];
                byArray4[a_0.e[341]] = e[342];
                byArray4[a_0.e[343]] = e[344];
                byArray4[a_0.e[345]] = e[346];
                byArray4[a_0.e[347]] = e[348];
                byArray4[a_0.e[349]] = e[350];
                byArray4[a_0.e[351]] = e[352];
                byArray4[a_0.e[353]] = e[354];
                byArray4[a_0.e[355]] = e[356];
                byArray4[a_0.e[357]] = e[358];
                byArray4[a_0.e[359]] = e[360];
                byArray4[a_0.e[361]] = e[362];
                byArray4[a_0.e[363]] = e[364];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, e[365], e[366]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = a_0.A()[e[367]];
                if (object5 == null) {
                    char[] cArray = "\ub6ea\ub6e6\ub758".toCharArray();
                    for (int i = e[368]; i < e[369]; ++i) {
                        int n3 = cArray[i];
                        n3 += e[370];
                        n3 ^= e[371];
                        n3 -= e[372];
                        n3 -= e[373];
                        n3 ^= e[374];
                        n3 -= e[375];
                        n3 += e[376];
                        n3 += e[377];
                        n3 += e[378];
                        n3 += e[379];
                        cArray[i] = (char)(n3 ^= e[380]);
                    }
                    object5 = a_0.A()[a_0.e[381]] = new String(cArray);
                }
                C = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, e[382], e[383]);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, e[384], byArray6.length);
            Object object6 = a_0.A()[e[385]];
            if (object6 == null) {
                char[] cArray = "\uc8a5\uc969\uc97f\uc89b\uc96f\uc880\uc96f\uc89b\uc976\uc977\uc96f\uc97f\uc899\uc976\uc885\u334a\u334a\u334d\u335c\u3353".toCharArray();
                for (int i = e[386]; i < e[387]; ++i) {
                    int n4 = cArray[i];
                    n4 ^= e[388];
                    n4 -= e[389];
                    n4 ^= e[390];
                    n4 ^= e[391];
                    n4 ^= e[392];
                    n4 ^= e[393];
                    n4 ^= e[394];
                    n4 += e[395];
                    n4 -= e[396];
                    n4 ^= e[397];
                    n4 += e[398];
                    n4 -= e[399];
                    n4 ^= 0x96FD;
                    cArray[i] = (char)(n4 += 8382);
                }
                object6 = a_0.A()[3] = new String(cArray);
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
        e = new int[0x9B7D ^ 0x9AED];
        a_0.e[0x15BD ^ 0x15AF] = 0x15AF ^ 0x15AF;
        a_0.e[0x8E38 ^ 0x8E5D] = 0x8E70 ^ 0x8E5D;
        a_0.e[0xEE66 ^ 0xEF07] = 0xEF05 ^ 0xEF07;
        a_0.e[0x6864 ^ 0x680B] = 0x680B ^ 0x680B;
        a_0.e[0x5E86 ^ 0x5FA3] = 0xC0F7 ^ 0x5FA3;
        a_0.e[0x2D23 ^ 0x2D0E] = 0xFFFFD2B4 ^ 0x2D0E;
        a_0.e[0xE10 ^ 0xE82] = 0xCCA1 ^ 0xE82;
        a_0.e[0x200C ^ 0x2006] = 0x2011 ^ 0x2006;
        a_0.e[0xE686 ^ 0xE6A3] = 0xE6AA ^ 0xE6A3;
        a_0.e[0x5590 ^ 0x54A7] = 0x54A7 ^ 0x54A7;
        a_0.e[0xE6C6 ^ 0xE698] = 0xE6A3 ^ 0xE698;
        a_0.e[0xFA9 ^ 0xED4] = 0xED6 ^ 0xED4;
        a_0.e[0x3BC0 ^ 0x3BA1] = 0x3BDD ^ 0x3BA1;
        a_0.e[0x44EB ^ 0x45C7] = 0x87B8 ^ 0x45C7;
        a_0.e[0x55C7 ^ 0x5515] = 0x958C ^ 0x5515;
        a_0.e[0x7DAB ^ 0x7CD7] = 0x914D ^ 0x7CD7;
        a_0.e[0x6363 ^ 0x63EF] = 0x4883 ^ 0x63EF;
        a_0.e[0xDB0 ^ 0xCF1] = 0xE1BE ^ 0xCF1;
        a_0.e[0x2392 ^ 0x2385] = 0x34CA ^ 0x2385;
        a_0.e[0xB448 ^ 0xB4FF] = 0xFFFFF8A8 ^ 0xB4FF;
        a_0.e[0x1016B ^ 0x10022] = 0x125FF ^ 0x10022;
        a_0.e[0xFAE0 ^ 0xFAD0] = 0xFFFF0567 ^ 0xFAD0;
        a_0.e[0xAAF5 ^ 0xAAC7] = 0xAAD1 ^ 0xAAC7;
        a_0.e[0x100E6 ^ 0x101D5] = 0x163F5 ^ 0x101D5;
        a_0.e[0x3D06 ^ 0x3C19] = 0x3E23 ^ 0x3C19;
        a_0.e[0x9282 ^ 0x92FE] = 0x68D3 ^ 0x92FE;
        a_0.e[0x83F ^ 0x810] = 0xFFFFF7CB ^ 0x810;
        a_0.e[0x6F89 ^ 0x6E07] = 0x2F5F ^ 0x6E07;
        a_0.e[0xE306 ^ 0xE387] = 0x43D7 ^ 0xE387;
        a_0.e[0xC607 ^ 0xC765] = 0xFFFF38A7 ^ 0xC765;
        a_0.e[0x451 ^ 0x451] = 0x47F ^ 0x451;
        a_0.e[0x177A ^ 0x1659] = 0xFFFF6B9F ^ 0x1659;
        a_0.e[0xB084 ^ 0xB07F] = 0xFFFF62A5 ^ 0xB07F;
        a_0.e[0xB22A ^ 0xB2F4] = 0x2FE3 ^ 0xB2F4;
        a_0.e[0x7368 ^ 0x73F8] = 0xE152 ^ 0x73F8;
        a_0.e[0xBE7C ^ 0xBF78] = 0xABF8 ^ 0xBF78;
        a_0.e[0xB73F ^ 0xB701] = 0xFFFF489E ^ 0xB701;
        a_0.e[0xB050 ^ 0xB0AE] = 0x431A ^ 0xB0AE;
        a_0.e[0xB5D4 ^ 0xB5B9] = 0xB5B8 ^ 0xB5B9;
        a_0.e[0xF9DC ^ 0xF8DD] = 0xEC59 ^ 0xF8DD;
        a_0.e[0x52B8 ^ 0x5220] = 0xC268 ^ 0x5220;
        a_0.e[0xD573 ^ 0xD5B3] = 0x5495 ^ 0xD5B3;
        a_0.e[0x5AB8 ^ 0x5BFB] = 0xFAA ^ 0x5BFB;
        a_0.e[0xFDB1 ^ 0xFD46] = 0xFFFFD3BA ^ 0xFD46;
        a_0.e[0xBAA1 ^ 0xBA01] = 0x2344 ^ 0xBA01;
        a_0.e[0xA088 ^ 0xA103] = 0xAAB1 ^ 0xA103;
        a_0.e[0xCC10 ^ 0xCD12] = 0xD992 ^ 0xCD12;
        a_0.e[0xEB5A ^ 0xEA64] = 0xA3EE ^ 0xEA64;
        a_0.e[0x7441 ^ 0x7559] = 0x3F49 ^ 0x7559;
        a_0.e[0x66D6 ^ 0x6630] = 0x5333 ^ 0x6630;
        a_0.e[0x509F ^ 0x51C4] = 0x51C4 ^ 0x51C4;
        a_0.e[0x9F81 ^ 0x9F1B] = 0x65DA ^ 0x9F1B;
        a_0.e[0xA6 ^ 0xE6] = 0xFFFFFF08 ^ 0xE6;
        a_0.e[0x8BD1 ^ 0x8A9D] = 0x8A8D ^ 0x8A9D;
        a_0.e[0xD683 ^ 0xD6FA] = 0xDFA5 ^ 0xD6FA;
        a_0.e[0xDC0 ^ 0xC82] = 0x2D12 ^ 0xC82;
        a_0.e[0xC2C6 ^ 0xC3B4] = 0xE694 ^ 0xC3B4;
        a_0.e[0x641E ^ 0x6576] = 0xFFFF9A9F ^ 0x6576;
        a_0.e[0xAAE3 ^ 0xABF4] = 0xFFFF1E2B ^ 0xABF4;
        a_0.e[0x2087 ^ 0x2064] = 0xFFFFFF7C ^ 0x2064;
        a_0.e[0x991A ^ 0x9850] = 0xE6CE ^ 0x9850;
        a_0.e[0x66A ^ 0x69F] = 0xD78C ^ 0x69F;
        a_0.e[0x7124 ^ 0x7031] = 0x3A33 ^ 0x7031;
        a_0.e[0x542D ^ 0x543E] = 0x547E ^ 0x543E;
        a_0.e[0x6799 ^ 0x6769] = 0x3DD2 ^ 0x6769;
        a_0.e[0xA589 ^ 0xA512] = 0x5FDF ^ 0xA512;
        a_0.e[0x4A45 ^ 0x4AD8] = 0xB015 ^ 0x4AD8;
        a_0.e[0x602D ^ 0x605A] = 0x6905 ^ 0x605A;
        a_0.e[0xE30B ^ 0xE373] = 0xEA0B ^ 0xE373;
        a_0.e[0x4332 ^ 0x422F] = 0x4062 ^ 0x422F;
        a_0.e[0x103CC ^ 0x102B8] = 0x17209 ^ 0x102B8;
        a_0.e[0x1D11 ^ 0x1C4C] = 0x1C49 ^ 0x1C4C;
        a_0.e[0x26C0 ^ 0x27BE] = 0x27BE ^ 0x27BE;
        a_0.e[0x454D ^ 0x4506] = 0xFFFFBACA ^ 0x4506;
        a_0.e[0x5BB9 ^ 0x5AE3] = 0x5ABF ^ 0x5AE3;
        a_0.e[0xD101 ^ 0xD047] = 0x31F ^ 0xD047;
        a_0.e[0xFDC0 ^ 0xFDA4] = 0xFD95 ^ 0xFDA4;
        a_0.e[0x9935 ^ 0x9980] = 0x2A1C ^ 0x9980;
        a_0.e[0xB609 ^ 0xB6DD] = 0x7644 ^ 0xB6DD;
        a_0.e[0x791F ^ 0x79AE] = 0xCBB3 ^ 0x79AE;
        a_0.e[0x1B66 ^ 0x1B06] = 0xFFFFE4D0 ^ 0x1B06;
        a_0.e[0xC07 ^ 0xCFE] = 0x21AB ^ 0xCFE;
        a_0.e[0xF499 ^ 0xF4F5] = 0xF4F5 ^ 0xF4F5;
        a_0.e[0x373D ^ 0x363E] = 0xFFFFDD7A ^ 0x363E;
        a_0.e[0x8E85 ^ 0x8E2B] = 0x3C34 ^ 0x8E2B;
        a_0.e[0x90D2 ^ 0x907B] = 0xB506 ^ 0x907B;
        a_0.e[0x8A99 ^ 0x8BA6] = 0xBACD ^ 0x8BA6;
        a_0.e[0xA3E1 ^ 0xA3D0] = 0xFFFF5C41 ^ 0xA3D0;
        a_0.e[0xBC1B ^ 0xBC3D] = 0xFFFF4397 ^ 0xBC3D;
        a_0.e[0x10710 ^ 0x1069A] = 0x1D474 ^ 0x1069A;
        a_0.e[0xAFC3 ^ 0xAF93] = 0xFFFF5079 ^ 0xAF93;
        a_0.e[0x1B2D ^ 0x1A1C] = 0x781E ^ 0x1A1C;
        a_0.e[0x4FFA ^ 0x4EAD] = 0x4EA2 ^ 0x4EAD;
        a_0.e[0x108D9 ^ 0x1085C] = 0xD5A ^ 0x1085C;
        a_0.e[0x9953 ^ 0x998E] = 0x496 ^ 0x998E;
        a_0.e[0xF97E ^ 0xF91D] = 0xF922 ^ 0xF91D;
        a_0.e[0x4F7A ^ 0x4FBF] = 0x5F30 ^ 0x4FBF;
        a_0.e[0x6CE4 ^ 0x6DC2] = 0xF29D ^ 0x6DC2;
        a_0.e[0xAB91 ^ 0xAAFA] = 0xAAFD ^ 0xAAFA;
        a_0.e[0xE221 ^ 0xE2E2] = 0xF36E ^ 0xE2E2;
        a_0.e[0x10196 ^ 0x1015B] = 0x1924C ^ 0x1015B;
        a_0.e[0xC980 ^ 0xC8FF] = 0xC8EF ^ 0xC8FF;
        a_0.e[0xC475 ^ 0xC451] = 0xFFFF3BB6 ^ 0xC451;
        a_0.e[0x431D ^ 0x4253] = 0x4256 ^ 0x4253;
        a_0.e[0x6A7E ^ 0x6B31] = 0x6B3C ^ 0x6B31;
        a_0.e[0x4200 ^ 0x438C] = 0xC2BF ^ 0x438C;
        a_0.e[0x10436 ^ 0x10506] = 0x67A ^ 0x10506;
        a_0.e[0x5B3A ^ 0x5A7E] = 0x514C ^ 0x5A7E;
        a_0.e[0x2320 ^ 0x23A0] = 0x83A2 ^ 0x23A0;
        a_0.e[0xBF85 ^ 0xBEAA] = 0x1BDC7 ^ 0xBEAA;
        a_0.e[0x8AB9 ^ 0x8B93] = 0x49EC ^ 0x8B93;
        a_0.e[0x582C ^ 0x588A] = 0x7DF1 ^ 0x588A;
        a_0.e[0x80A6 ^ 0x80EF] = 0x80D2 ^ 0x80EF;
        a_0.e[0x1F6E ^ 0x1F68] = 0x1F7D ^ 0x1F68;
        a_0.e[0x753D ^ 0x7536] = 0x750A ^ 0x7536;
        a_0.e[0x8012 ^ 0x8106] = 0xDA92 ^ 0x8106;
        a_0.e[0x65B4 ^ 0x65B6] = 0xFFFF9A63 ^ 0x65B6;
        a_0.e[0xF326 ^ 0xF23C] = 0x65D3 ^ 0xF23C;
        a_0.e[0xAF17 ^ 0xAE5C] = 0xAE5D ^ 0xAE5C;
        a_0.e[0x93FD ^ 0x92A3] = 0xFFFF6D6D ^ 0x92A3;
        a_0.e[0x77AC ^ 0x7698] = 0x1487 ^ 0x7698;
        a_0.e[0x56C1 ^ 0x56EA] = 0x56E5 ^ 0x56EA;
        a_0.e[0x41B ^ 0x593] = 0xCABA ^ 0x593;
        a_0.e[0x4550 ^ 0x447E] = 0x14702 ^ 0x447E;
        a_0.e[0x10B27 ^ 0x10BA1] = 0x1CEF1 ^ 0x10BA1;
        a_0.e[0x68D9 ^ 0x6828] = 0x5E6A ^ 0x6828;
        a_0.e[0xACAF ^ 0xADFB] = 0xFFFF522D ^ 0xADFB;
        a_0.e[0xB1B6 ^ 0xB195] = 0xFFFF4E4B ^ 0xB195;
        a_0.e[0x9B90 ^ 0x9B8F] = 0xF597 ^ 0x9B8F;
        a_0.e[0x1E87 ^ 0x1EED] = 0x1EEC ^ 0x1EED;
        a_0.e[0xB79F ^ 0xB782] = 0xF1D4 ^ 0xB782;
        a_0.e[0x180D ^ 0x1857] = 0xFFFFE7D3 ^ 0x1857;
        a_0.e[0xD7BF ^ 0xD69B] = 0x54B5 ^ 0xD69B;
        a_0.e[0x5E54 ^ 0x5F3D] = 0x5F33 ^ 0x5F3D;
        a_0.e[0x9F1A ^ 0x9F0A] = 0x9F08 ^ 0x9F0A;
        a_0.e[0xAE26 ^ 0xAE0E] = 0xAE60 ^ 0xAE0E;
        a_0.e[0x8222 ^ 0x8211] = 0xFFFF7D96 ^ 0x8211;
        a_0.e[0x4ADF ^ 0x4A97] = 0xFFFFB536 ^ 0x4A97;
        a_0.e[0xFDD7 ^ 0xFD1B] = 0x32D4 ^ 0xFD1B;
        a_0.e[0xA111 ^ 0xA13B] = 0xFFFF5EA9 ^ 0xA13B;
        a_0.e[0xEF1F ^ 0xEF4E] = 0xEF71 ^ 0xEF4E;
        a_0.e[0xD5A ^ 0xDB2] = 0x38B1 ^ 0xDB2;
        a_0.e[0x105F4 ^ 0x10596] = 0xFFFEFA52 ^ 0x10596;
        a_0.e[0x4452 ^ 0x457B] = 0x8707 ^ 0x457B;
        a_0.e[0x509A ^ 0x5024] = 0xD102 ^ 0x5024;
        a_0.e[0x1DA ^ 0xF7] = 0x1039D ^ 0xF7;
        a_0.e[0x1004 ^ 0x113F] = 0x3C7E ^ 0x113F;
        a_0.e[0x38DB ^ 0x3868] = 0xBC70 ^ 0x3868;
        a_0.e[0x7E42 ^ 0x7FCF] = 0x553B ^ 0x7FCF;
        a_0.e[0x5233 ^ 0x52EA] = 0x51D6 ^ 0x52EA;
        a_0.e[0x60DA ^ 0x60DB] = 0xFFFF9F24 ^ 0x60DB;
        a_0.e[0x77AB ^ 0x7760] = 0xFFFF4714 ^ 0x7760;
        a_0.e[0x8F7F ^ 0x8E0A] = 0x239 ^ 0x8E0A;
        a_0.e[0xE4A0 ^ 0xE5AC] = 0xBFDC ^ 0xE5AC;
        a_0.e[0xB9F6 ^ 0xB99D] = 0xB99F ^ 0xB99D;
        a_0.e[0x87F1 ^ 0x8697] = 0xFFFF7942 ^ 0x8697;
        a_0.e[0x10F54 ^ 0x10E4A] = 0x10C12 ^ 0x10E4A;
        a_0.e[0x984E ^ 0x9801] = 0x9808 ^ 0x9801;
        a_0.e[0x413 ^ 0x44B] = 0xFFFFFBB6 ^ 0x44B;
        a_0.e[0x2E7A ^ 0x2F00] = 0xBC48 ^ 0x2F00;
        a_0.e[0xAC30 ^ 0xAD11] = 0x2F39 ^ 0xAD11;
        a_0.e[0x4445 ^ 0x452B] = 0x442B ^ 0x452B;
        a_0.e[0x49AE ^ 0x49C7] = 0x49BF ^ 0x49C7;
        a_0.e[0xCD93 ^ 0xCD02] = 0x5FCA ^ 0xCD02;
        a_0.e[0x4F66 ^ 0x4F9A] = 0x62D7 ^ 0x4F9A;
        a_0.e[0x9EF2 ^ 0x9FFF] = 0xDAD5 ^ 0x9FFF;
        a_0.e[0xFFE3 ^ 0xFF2C] = 0x6C0A ^ 0xFF2C;
        a_0.e[0x45D6 ^ 0x44AD] = 0x3444 ^ 0x44AD;
        a_0.e[0xE5BA ^ 0xE5AC] = 0x52A7 ^ 0xE5AC;
        a_0.e[0x16A2 ^ 0x1695] = 0x1698 ^ 0x1695;
        a_0.e[0x92D6 ^ 0x93A0] = 0x44E4 ^ 0x93A0;
        a_0.e[0x4CE6 ^ 0x4C06] = 0xD111 ^ 0x4C06;
        a_0.e[0x66AC ^ 0x66D2] = 0xC683 ^ 0x66D2;
        a_0.e[0x6CFA ^ 0x6C16] = 0x9B26 ^ 0x6C16;
        a_0.e[0x4D41 ^ 0x4D45] = 0x4D20 ^ 0x4D45;
        a_0.e[0xAC37 ^ 0xAC60] = 0xFFFF53A8 ^ 0xAC60;
        a_0.e[0xA52E ^ 0xA443] = 0xA44B ^ 0xA443;
        a_0.e[0x5F95 ^ 0x5ED8] = 0x5ED0 ^ 0x5ED8;
        a_0.e[0x10DCB ^ 0x10CCE] = 0x1085B ^ 0x10CCE;
        a_0.e[0xF978 ^ 0xF9E6] = 0x60AE ^ 0xF9E6;
        a_0.e[0x7221 ^ 0x72D7] = 0xA3C6 ^ 0x72D7;
        a_0.e[0x3449 ^ 0x3510] = 0x3519 ^ 0x3510;
        a_0.e[0x58EC ^ 0x59EC] = 0xAA58 ^ 0x59EC;
        a_0.e[0x18C9 ^ 0x1871] = 0xABE5 ^ 0x1871;
        a_0.e[0xFDDB ^ 0xFD0E] = 0x578B ^ 0xFD0E;
        a_0.e[0x73D4 ^ 0x7375] = 0xEA39 ^ 0x7375;
        a_0.e[0xEE06 ^ 0xEE6E] = 0xEE6D ^ 0xEE6E;
        a_0.e[0x6259 ^ 0x6353] = 0x3923 ^ 0x6353;
        a_0.e[0xD2BE ^ 0xD253] = 0x88F1 ^ 0xD253;
        a_0.e[0xC5E5 ^ 0xC482] = 0xC486 ^ 0xC482;
        a_0.e[0xB581 ^ 0xB5B9] = 0xFFFF4A66 ^ 0xB5B9;
        a_0.e[0xDCBF ^ 0xDC23] = 0xFFFFD954 ^ 0xDC23;
        a_0.e[0x7859 ^ 0x7942] = 0xFFFF1175 ^ 0x7942;
        a_0.e[0xEE83 ^ 0xEED5] = 0xFFFF1178 ^ 0xEED5;
        a_0.e[0x841F ^ 0x8547] = 0xFFFF7AF9 ^ 0x8547;
        a_0.e[0x6789 ^ 0x6703] = 0x4C7D ^ 0x6703;
        a_0.e[0xD201 ^ 0xD2F3] = 0xE4A2 ^ 0xD2F3;
        a_0.e[0xA9B3 ^ 0xA9F6] = 0xA9FC ^ 0xA9F6;
        a_0.e[0xFC5 ^ 0xF98] = 0xFB7 ^ 0xF98;
        a_0.e[0x6A12 ^ 0x6A6D] = 0xCA3D ^ 0x6A6D;
        a_0.e[0xAB5C ^ 0xAB48] = 0xA689 ^ 0xAB48;
        a_0.e[0x94AB ^ 0x9596] = 0xBD70 ^ 0x9596;
        a_0.e[0xBA68 ^ 0xBACA] = 0x5EE9 ^ 0xBACA;
        a_0.e[0x9842 ^ 0x9874] = 0x984E ^ 0x9874;
        a_0.e[0x39D1 ^ 0x38A6] = 0x4B42 ^ 0x38A6;
        a_0.e[0x51CC ^ 0x51AB] = 0x51F0 ^ 0x51AB;
        a_0.e[0xD3EB ^ 0xD2EC] = 0xD64F ^ 0xD2EC;
        a_0.e[0xBC5F ^ 0xBC83] = 0xBFBE ^ 0xBC83;
        a_0.e[0xD430 ^ 0xD522] = 0x8EB6 ^ 0xD522;
        a_0.e[0x8EFD ^ 0x8EE6] = 0xF32 ^ 0x8EE6;
        a_0.e[0x18A6 ^ 0x198D] = 0xDBEE ^ 0x198D;
        a_0.e[0xB2D9 ^ 0xB3A9] = 0xB3A9 ^ 0xB3A9;
        a_0.e[0x678E ^ 0x6782] = 0x6781 ^ 0x6782;
        a_0.e[0x7539 ^ 0x75DB] = 0x551A ^ 0x75DB;
        a_0.e[0x8F87 ^ 0x8FA0] = 0xFFFF7023 ^ 0x8FA0;
        a_0.e[0xAB8 ^ 0xA2C] = 0xFFFF3787 ^ 0xA2C;
        a_0.e[0xD956 ^ 0xD8D5] = 0xD8C1 ^ 0xD8D5;
        a_0.e[0x10D29 ^ 0x10D2A] = 0x10D75 ^ 0x10D2A;
        a_0.e[0x3B48 ^ 0x3A6A] = 0xB844 ^ 0x3A6A;
        a_0.e[0xAE84 ^ 0xAE77] = 0xFFFF67C8 ^ 0xAE77;
        a_0.e[0x2D80 ^ 0x2D5B] = 0xFFFFD189 ^ 0x2D5B;
        a_0.e[0x3F74 ^ 0x3FC8] = 0x8FA5 ^ 0x3FC8;
        a_0.e[0xD85A ^ 0xD865] = 0xFFFF27F8 ^ 0xD865;
        a_0.e[0xFBB8 ^ 0xFAD2] = 0xFA9C ^ 0xFAD2;
        a_0.e[0x4D07 ^ 0x4DB3] = 0xC98B ^ 0x4DB3;
        a_0.e[0x106E7 ^ 0x10782] = 0x10781 ^ 0x10782;
        a_0.e[0x7171 ^ 0x7158] = 0x7178 ^ 0x7158;
        a_0.e[0xA903 ^ 0xA912] = 0xA912 ^ 0xA912;
        a_0.e[0x3D64 ^ 0x3D3F] = 0x3D35 ^ 0x3D3F;
        a_0.e[0x26AD ^ 0x27D4] = 0xE3F3 ^ 0x27D4;
        a_0.e[0xE014 ^ 0xE036] = 0xE06D ^ 0xE036;
        a_0.e[0x955B ^ 0x9462] = 0x9462 ^ 0x9462;
        a_0.e[0 ^ 0xC7] = 0xFFFFEFB6 ^ 0xC7;
        a_0.e[0x27D4 ^ 0x27CE] = 0x837C ^ 0x27CE;
        a_0.e[0x6388 ^ 0x63FC] = 0x1993 ^ 0x63FC;
        a_0.e[0xE2B1 ^ 0xE2CB] = 0x18C3 ^ 0xE2CB;
        a_0.e[0x4366 ^ 0x4277] = 0x19F2 ^ 0x4277;
        a_0.e[0xADF3 ^ 0xAD41] = 0xAD41 ^ 0xAD41;
        a_0.e[0x2981 ^ 0x2947] = 0x39D3 ^ 0x2947;
        a_0.e[0xE944 ^ 0xE91B] = 0xFFFF16F4 ^ 0xE91B;
        a_0.e[0x78A1 ^ 0x7846] = 0xFFFFB287 ^ 0x7846;
        a_0.e[0x4ECC ^ 0x4FD0] = 0xD83F ^ 0x4FD0;
        a_0.e[0xF509 ^ 0xF48D] = 0xC30F ^ 0xF48D;
        a_0.e[0x10237 ^ 0x10357] = 0x1036C ^ 0x10357;
        a_0.e[0xBC4A ^ 0xBC8B] = 0xAD6F ^ 0xBC8B;
        a_0.e[0x10CA4 ^ 0x10CAB] = 0x10CAB ^ 0x10CAB;
        a_0.e[0x2D5 ^ 0x2D8] = 0x2D8 ^ 0x2D8;
        a_0.e[0xE098 ^ 0xE1C8] = 0xE184 ^ 0xE1C8;
        a_0.e[0x26F4 ^ 0x267F] = 0xD0F ^ 0x267F;
        a_0.e[0x9444 ^ 0x9409] = 0xFFFF6BBC ^ 0x9409;
        a_0.e[0x404A ^ 0x4082] = 0x5016 ^ 0x4082;
        a_0.e[0xC1D0 ^ 0xC15E] = 0x539C ^ 0xC15E;
        a_0.e[0x565E ^ 0x57DE] = 0x57CE ^ 0x57DE;
        a_0.e[0x76A7 ^ 0x7648] = 0x2C8B ^ 0x7648;
        a_0.e[0xCB24 ^ 0xCBB2] = 0x5BDD ^ 0xCBB2;
        a_0.e[0xE2C8 ^ 0xE222] = 0x1512 ^ 0xE222;
        a_0.e[0x793C ^ 0x782F] = 0x23A8 ^ 0x782F;
        a_0.e[0xEA9F ^ 0xEADC] = 0xEAF3 ^ 0xEADC;
        a_0.e[0xAC97 ^ 0xAC34] = 0x481C ^ 0xAC34;
        a_0.e[0x569 ^ 0x560] = 0x513 ^ 0x560;
        a_0.e[0xD6B9 ^ 0xD602] = 0x6624 ^ 0xD602;
        a_0.e[0x6283 ^ 0x628B] = 0x62A6 ^ 0x628B;
        a_0.e[0xE73 ^ 0xEDB] = 0xFFFFD464 ^ 0xEDB;
        a_0.e[0x9331 ^ 0x939B] = 0xDCCA ^ 0x939B;
        a_0.e[0x8AFF ^ 0x8BAE] = 0x8BA5 ^ 0x8BAE;
        a_0.e[0x67E3 ^ 0x67D9] = 0xFFFF983B ^ 0x67D9;
        a_0.e[0xFE80 ^ 0xFFE4] = 0xFFFF0066 ^ 0xFFE4;
        a_0.e[0xDAE7 ^ 0xDB96] = 0xDB95 ^ 0xDB96;
        a_0.e[0x5E23 ^ 0x5F0B] = 0xC054 ^ 0x5F0B;
        a_0.e[0x1233 ^ 0x1266] = 0x1223 ^ 0x1266;
        a_0.e[0x48B4 ^ 0x483C] = 0x8D1B ^ 0x483C;
        a_0.e[0x10EC4 ^ 0x10E00] = 0x11FE4 ^ 0x10E00;
        a_0.e[0x5C09 ^ 0x5D5B] = 0xFFFFA2F7 ^ 0x5D5B;
        a_0.e[0x7297 ^ 0x72F9] = 0x72F8 ^ 0x72F9;
        a_0.e[0x6E17 ^ 0x6E95] = 0x16B9B ^ 0x6E95;
        a_0.e[0x4845 ^ 0x4850] = 0xECDB ^ 0x4850;
        a_0.e[0x10839 ^ 0x10956] = 0x10954 ^ 0x10956;
        a_0.e[0x5B19 ^ 0x5A59] = 0x9392 ^ 0x5A59;
        a_0.e[0x6E80 ^ 0x6E85] = 0x6EBD ^ 0x6E85;
        a_0.e[0xE336 ^ 0xE3CB] = 0x1073 ^ 0xE3CB;
        a_0.e[0x10B8E ^ 0x10B07] = 0x1CE50 ^ 0x10B07;
        a_0.e[0x395E ^ 0x398D] = 0xFFFF06B2 ^ 0x398D;
        a_0.e[0x6E91 ^ 0x6E2B] = 0xDE46 ^ 0x6E2B;
        a_0.e[0xB320 ^ 0xB387] = 0x96FA ^ 0xB387;
        a_0.e[0x705B ^ 0x7152] = 0x2B2C ^ 0x7152;
        a_0.e[0x3857 ^ 0x3886] = 0xF80B ^ 0x3886;
        a_0.e[0x2A7C ^ 0x2A0C] = 0xC5EB ^ 0x2A0C;
        a_0.e[0xED70 ^ 0xEC66] = 0xA676 ^ 0xEC66;
        a_0.e[0x6B1E ^ 0x6B87] = 0xFBED ^ 0x6B87;
        a_0.e[0xB5A1 ^ 0xB56F] = 0x2675 ^ 0xB56F;
        a_0.e[0xA7C7 ^ 0xA76A] = 0xE832 ^ 0xA76A;
        a_0.e[0x52C1 ^ 0x521E] = 0xCF15 ^ 0x521E;
        a_0.e[0x8697 ^ 0x87FB] = 0x87E6 ^ 0x87FB;
        a_0.e[0xFE71 ^ 0xFFF3] = 0xFFF3 ^ 0xFFF3;
        a_0.e[0xCEA4 ^ 0xCE7E] = 0xCD43 ^ 0xCE7E;
        a_0.e[0x9316 ^ 0x9365] = 0xE917 ^ 0x9365;
        a_0.e[0x954E ^ 0x953B] = 0xEF49 ^ 0x953B;
        a_0.e[0x2A1 ^ 0x295] = 0x290 ^ 0x295;
        a_0.e[0x8498 ^ 0x8471] = 0x735F ^ 0x8471;
        a_0.e[0x1D38 ^ 0x1D26] = 0xBBE ^ 0x1D26;
        a_0.e[0x1774 ^ 0x1672] = 0x12E0 ^ 0x1672;
        a_0.e[0xB74D ^ 0xB70F] = 0xFFFF48AD ^ 0xB70F;
        a_0.e[0xC7F1 ^ 0xC6A2] = 0xC6A3 ^ 0xC6A2;
        a_0.e[0xA760 ^ 0xA78E] = 0xFD35 ^ 0xA78E;
        a_0.e[0x57CA ^ 0x564D] = 0xA7E5 ^ 0x564D;
        a_0.e[0xDA6F ^ 0xDB33] = 0xDB5F ^ 0xDB33;
        a_0.e[0xF5FC ^ 0xF58D] = 0x1A7A ^ 0xF58D;
        a_0.e[0x57A8 ^ 0x5718] = 0xFFFF1A88 ^ 0x5718;
        a_0.e[0x4138 ^ 0x414A] = 0x3B37 ^ 0x414A;
        a_0.e[0xCB0E ^ 0xCA06] = 0xCE94 ^ 0xCA06;
        a_0.e[0x295B ^ 0x284B] = 0x6D7B ^ 0x284B;
        a_0.e[0x6DCE ^ 0x6CEE] = 0x6EB6 ^ 0x6CEE;
        a_0.e[0xCC54 ^ 0xCCB1] = 0xF9A5 ^ 0xCCB1;
        a_0.e[0x3C79 ^ 0x3CDC] = 0xD8F4 ^ 0x3CDC;
        a_0.e[0xBFC4 ^ 0xBF53] = 0x2F39 ^ 0xBF53;
        a_0.e[0xFE8E ^ 0xFFB2] = 0xC2D0 ^ 0xFFB2;
        a_0.e[0xE91 ^ 0xE2C] = 0x8F15 ^ 0xE2C;
        a_0.e[0x408A ^ 0x4021] = 0xF79 ^ 0x4021;
        a_0.e[0x900B ^ 0x9052] = 0x900B ^ 0x9052;
        a_0.e[0xAA7 ^ 0xA58] = 0xFFFF0679 ^ 0xA58;
        a_0.e[0xF47 ^ 0xFC4] = 0x10AC2 ^ 0xFC4;
        a_0.e[0xBD87 ^ 0xBD4D] = 0x7282 ^ 0xBD4D;
        a_0.e[0x106D3 ^ 0x10687] = 0xFFFEF967 ^ 0x10687;
        a_0.e[0xCE7B ^ 0xCFFD] = 0xFE35 ^ 0xCFFD;
        a_0.e[0xEA50 ^ 0xEAFF] = 0x58E2 ^ 0xEAFF;
        a_0.e[0xF898 ^ 0xF85A] = 0xE9BE ^ 0xF85A;
        a_0.e[0x922B ^ 0x925D] = 0x9B02 ^ 0x925D;
        a_0.e[0x20D5 ^ 0x202D] = 0xF13C ^ 0x202D;
        a_0.e[0x3BFF ^ 0x3B84] = 0xC18F ^ 0x3B84;
        a_0.e[0xB6F ^ 0xB8E] = 0x2B4A ^ 0xB8E;
        a_0.e[0x9E22 ^ 0x9EF2] = 0xDE8 ^ 0x9EF2;
        a_0.e[0x2A3F ^ 0x2BB0] = 0xC64A ^ 0x2BB0;
        a_0.e[0xA7B2 ^ 0xA76A] = 0xDE6 ^ 0xA76A;
        a_0.e[0x5668 ^ 0x570B] = 0x5707 ^ 0x570B;
        a_0.e[0xE8DC ^ 0xE994] = 0x516F ^ 0xE994;
        a_0.e[0x310E ^ 0x3029] = 0xFFFF509C ^ 0x3029;
        a_0.e[0x10B8B ^ 0x10B92] = 0x17CA3 ^ 0x10B92;
        a_0.e[0x71AB ^ 0x712C] = 0xB47B ^ 0x712C;
        a_0.e[0xD31F ^ 0xD390] = 0x4158 ^ 0xD390;
        a_0.e[0x6005 ^ 0x6063] = 0x602D ^ 0x6063;
        a_0.e[0x81D7 ^ 0x81CF] = 0x5C80 ^ 0x81CF;
        a_0.e[0x5035 ^ 0x5079] = 0xFFFFAFF7 ^ 0x5079;
        a_0.e[0xE323 ^ 0xE22D] = 0xA71D ^ 0xE22D;
        a_0.e[0x10825 ^ 0x10877] = 0x10814 ^ 0x10877;
        a_0.e[0xAFAE ^ 0xAF67] = 0x60B8 ^ 0xAF67;
        a_0.e[0x169C ^ 0x1618] = 0xFFFEECE9 ^ 0x1618;
        a_0.e[0xB912 ^ 0xB90E] = 0xCFFB ^ 0xB90E;
        a_0.e[0x66AF ^ 0x6678] = 0xFFFF337D ^ 0x6678;
        a_0.e[0xD77B ^ 0xD73D] = 0xD779 ^ 0xD73D;
        a_0.e[0x860 ^ 0x918] = 0x455D ^ 0x918;
        a_0.e[0x20CF ^ 0x2042] = 0xB32 ^ 0x2042;
        a_0.e[0xDE50 ^ 0xDF15] = 0xC861 ^ 0xDF15;
        a_0.e[0x8E93 ^ 0x8EAE] = 0xFFFF71F2 ^ 0x8EAE;
        a_0.e[0x10880 ^ 0x10813] = 0x1CA3D ^ 0x10813;
        a_0.e[0xFBA5 ^ 0xFAFA] = 0xFAF0 ^ 0xFAFA;
        a_0.e[0xEC64 ^ 0xED51] = 0xED51 ^ 0xED51;
        a_0.e[0x40DD ^ 0x4029] = 0x7678 ^ 0x4029;
        a_0.e[0x87D8 ^ 0x87A5] = 0x7DAE ^ 0x87A5;
        a_0.e[0x2D4 ^ 0x287] = 0x2E4 ^ 0x287;
        a_0.e[0x1384 ^ 0x13A4] = 0x2F9A ^ 0x13A4;
        a_0.e[0x97C6 ^ 0x977F] = 0x2718 ^ 0x977F;
        a_0.e[0x51D3 ^ 0x5138] = 0xA60F ^ 0x5138;
        a_0.e[0x4BDB ^ 0x4AC2] = 0xDD31 ^ 0x4AC2;
        a_0.e[0xBFA9 ^ 0xBF53] = 0x921E ^ 0xBF53;
        a_0.e[0x2B21 ^ 0x2B1A] = 0xFFFFD4E4 ^ 0x2B1A;
        a_0.e[0xE268 ^ 0xE2DE] = 0x514A ^ 0xE2DE;
        a_0.e[0xE2E5 ^ 0xE2A1] = 0xFFFF1D46 ^ 0xE2A1;
        a_0.e[0xE02 ^ 0xED4] = 0xA458 ^ 0xED4;
        a_0.e[0x6337 ^ 0x6379] = 0x6362 ^ 0x6379;
        a_0.e[0x5FFF ^ 0x5EF4] = 0x4E4 ^ 0x5EF4;
        a_0.e[0xC00D ^ 0xC13B] = 0xC13B ^ 0xC13B;
        a_0.e[0xBC5 ^ 0xB61] = 0xFFFF10BC ^ 0xB61;
        a_0.e[0x9536 ^ 0x940C] = 0x941E ^ 0x940C;
        a_0.e[0x3035 ^ 0x303B] = 0x303A ^ 0x303B;
        a_0.e[0x9990 ^ 0x9974] = 0xB9B5 ^ 0x9974;
        a_0.e[0x5149 ^ 0x50C8] = 0x50CB ^ 0x50C8;
        a_0.e[0xE990 ^ 0xE9B1] = 0xE9B1 ^ 0xE9B1;
        a_0.e[0x2F7B ^ 0x2F47] = 0x2F7B ^ 0x2F47;
        a_0.e[0xC427 ^ 0xC498] = 0x45CF ^ 0xC498;
        a_0.e[0x6D8B ^ 0x6D8C] = 0x6DB6 ^ 0x6D8C;
        a_0.e[0x10348 ^ 0x102CD] = 0x1E4A5 ^ 0x102CD;
        a_0.e[0xA9B4 ^ 0xA8F3] = 0x7BAA ^ 0xA8F3;
        a_0.e[0x473F ^ 0x4607] = 0x4606 ^ 0x4607;
        a_0.e[0x89D0 ^ 0x894F] = 0x1003 ^ 0x894F;
        a_0.e[0x96C1 ^ 0x97CE] = 0xFFFF2D54 ^ 0x97CE;
        a_0.e[0xE22B ^ 0xE277] = 0xFFFF1DBF ^ 0xE277;
        a_0.e[0x36AE ^ 0x37FB] = 0x37FD ^ 0x37FB;
        a_0.e[0x6128 ^ 0x6106] = 0x6142 ^ 0x6106;
        a_0.e[0x8343 ^ 0x836F] = 0xFFFF7CC3 ^ 0x836F;
        a_0.e[0x26AA ^ 0x2606] = 0xFFFF969A ^ 0x2606;
        a_0.e[0xB467 ^ 0xB45E] = 0xB410 ^ 0xB45E;
        a_0.e[0x2C8F ^ 0x2DD9] = 0xFFFFD273 ^ 0x2DD9;
        a_0.e[0x10AC9 ^ 0x10B40] = 0x19C0D ^ 0x10B40;
        a_0.e[0x10813 ^ 0x10854] = 0x1086F ^ 0x10854;
        a_0.e[0x1B76 ^ 0x1BE3] = 0xD9CD ^ 0x1BE3;
        a_0.e[0xD12D ^ 0xD167] = 0xD136 ^ 0xD167;
        a_0.e[0x10888 ^ 0x108BD] = 0xFFFEF777 ^ 0x108BD;
        a_0.e[0xA22B ^ 0xA358] = 0xE818 ^ 0xA358;
        a_0.e[0xE81C ^ 0xE92E] = 0x8B31 ^ 0xE92E;
        a_0.e[0xBC54 ^ 0xBC15] = 0xBC49 ^ 0xBC15;
    }
}

