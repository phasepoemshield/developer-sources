/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.ui.api;

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
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.ui.api.RenderIn;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\f\u00a8\u0006\u000f"}, d2={"Lkotakbaz/rain/ui/api/PipelineManager;", "", "<init>", "()V", "Lkotakbaz/rain/ui/api/RenderIn;", "renderIn", "", "Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "getPipelines", "(Lkotakbaz/rain/ui/api/RenderIn;)Ljava/util/List;", "", "HUD_PIPELINES", "[Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "GUI_PIPELINES", "WINDOW_PIPELINES", "rain-visuals"})
public final class PipelineManager {
    @NotNull
    public static final PipelineManager INSTANCE;
    @NotNull
    private static final ClientRenderPipeline[] HUD_PIPELINES;
    @NotNull
    private static final ClientRenderPipeline[] GUI_PIPELINES;
    @NotNull
    private static final ClientRenderPipeline[] WINDOW_PIPELINES;
    private static Object[] a;
    private static Object b;
    private static Object[] B;
    private static Object[] A;
    private static Object[] c;
    public static int[] C;

    private PipelineManager() {
    }

    @NotNull
    public final List<ClientRenderPipeline> getPipelines(@NotNull RenderIn renderIn) {
        int n2 = C[0];
        n2 -= C[1];
        Intrinsics.checkNotNullParameter((Object)renderIn, (String)a[n2 += C[2]]);
        return switch (WhenMappings.$EnumSwitchMapping$0[renderIn.ordinal()]) {
            case 1 -> ArraysKt.asList(HUD_PIPELINES);
            case 2 -> ArraysKt.asList(GUI_PIPELINES);
            case 3 -> ArraysKt.asList(WINDOW_PIPELINES);
            default -> throw new NoWhenBranchMatchedException();
        };
    }

    static {
        PipelineManager.b();
        long l2 = 6609585296981976522L;
        long l3 = -985998020517936357L;
        long l4 = 6805269321555720207L;
        long l5 = -1670239871786386667L;
        long l6 = 8366802388513056935L;
        long l7 = -4622830849946918895L;
        long l8 = 5869519913879246939L;
        long l9 = 6524305853429165669L;
        long l10 = 7808734536220174452L;
        long l11 = 60263712649738429L;
        long l12 = -7146075334247434315L;
        long l13 = 6089365211965698094L;
        long l14 = 5434092319675562635L;
        long l15 = -8598250815760262773L;
        int n2 = C[3];
        n2 ^= C[4];
        a = new Object[n2 ^= C[5]];
        long l16 = l15;
        int n3 = C[6];
        n3 += C[7];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= C[8]);
        Object[] objectArray = new Object[C[9]];
        objectArray[PipelineManager.C[10]] = A;
        objectArray[PipelineManager.C[11]] = C[12];
        int n4 = C[13];
        Object object = PipelineManager.A()[C[14]];
        if (object == null) {
            char[] cArray = "\u8e35\u8e6e\u8e3a\u8e36\u8e3f\u8e33\u8e6f\u8e38\u8f9c\u8e0b\u8e79\u8e7d\u8e3a\u8f9c\u8e6a\u8e70\u8e0a\u8e79\u8e3f\u8e31\u8e34\u8e0d\u8e6a\u8e38\u8f9d\u8e32\u8e7f\u8e36\u8e7a\u8f9c\u8e3f\u8e6b\u8f99\u8e0b\u8e77\u8e73\u8e77\u8e30\u8e01\u8e6a\u8e32\u8e33\u8e03\u8e65".toCharArray();
            for (int i2 = C[15]; i2 < C[16]; ++i2) {
                int n5 = cArray[i2];
                n5 ^= C[17];
                n5 ^= C[18];
                n5 += C[19];
                n5 -= C[20];
                n5 += C[21];
                n5 -= C[22];
                n5 -= C[23];
                n5 -= C[24];
                n5 ^= C[25];
                n5 -= C[26];
                cArray[i2] = (char)(n5 ^= C[27]);
            }
            object = PipelineManager.A()[PipelineManager.C[28]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)PipelineManager.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = C[29];
        n6 -= C[30];
        l6 = l17 ^ (0xA00000000L ^ l17) & -1L << (n6 -= C[31]);
        long l18 = l13;
        int n7 = C[32];
        n7 -= C[33];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 -= C[34]);
        while (true) {
            int n8 = C[35];
            n8 ^= C[36];
            if ((int)l13 >= (int)(l6 >>> (n8 ^= C[37]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = C[38];
            n10 -= C[39];
            int n11 = C[41];
            n11 += C[42];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 -= C[40])) & -1L >>> (n11 += C[43]);
            long l20 = l9;
            int n12 = C[44];
            n12 ^= C[45];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 += C[46]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = C[47];
            n14 -= C[48];
            int n15 = C[50];
            n15 ^= C[51];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 += C[49])) & -1L >>> (n15 ^= C[52]);
            int n16 = C[53];
            n16 -= C[54];
            long l22 = l10;
            int n17 = C[56];
            n17 ^= C[57];
            l10 = l22 ^ ((long)cArray[n13] << (n16 += C[55]) ^ l22) & -1L << (n17 ^= C[58]);
            int n18 = C[59];
            n18 ^= C[60];
            int n19 = C[62];
            long l23 = l12;
            int n20 = C[64];
            n20 ^= C[65];
            l12 = l23 ^ ((long)((int)l9 << (n18 -= C[61]) | (int)(l10 >>> (n19 -= C[63]))) ^ l23) & -1L >>> (n20 -= C[66]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = C[67];
            n21 ^= C[68];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 -= C[69]);
            while (true) {
                int n22 = C[70];
                n22 ^= C[71];
                if ((int)(l14 >>> (n22 -= C[72])) >= (int)l12) break;
                int n23 = C[73];
                n23 ^= C[74];
                int n24 = C[76];
                n24 += C[77];
                cArray2[(int)(l14 >>> (n23 ^= PipelineManager.C[75]))] = cArray[(int)l13 + (int)(l14 >>> (n24 += C[78]))];
                l14 += 0x100000000L;
            }
            int n25 = C[79];
            n25 += C[80];
            int n26 = (int)(l15 >>> (n25 += C[81]));
            l15 += 0x100000000L;
            PipelineManager.a[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = C[82];
            n27 -= C[83];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 -= C[84]);
        }
        INSTANCE = new PipelineManager();
        int n28 = C[85];
        n28 ^= C[86];
        ClientRenderPipeline[] clientRenderPipelineArray = new ClientRenderPipeline[n28 ^= C[87]];
        int n29 = C[88];
        n29 += C[89];
        clientRenderPipelineArray[n29 -= PipelineManager.C[90]] = ClientRenderPipeline.HUD_RECT;
        int n30 = C[91];
        n30 += C[92];
        clientRenderPipelineArray[n30 -= PipelineManager.C[93]] = ClientRenderPipeline.HUD_SPECIAL;
        int n31 = C[94];
        n31 += C[95];
        clientRenderPipelineArray[n31 += PipelineManager.C[96]] = ClientRenderPipeline.HUD_TEXT;
        HUD_PIPELINES = clientRenderPipelineArray;
        int n32 = C[97];
        n32 ^= C[98];
        clientRenderPipelineArray = new ClientRenderPipeline[n32 += C[99]];
        int n33 = C[100];
        n33 += C[101];
        clientRenderPipelineArray[n33 += PipelineManager.C[102]] = ClientRenderPipeline.GUI_RECT;
        int n34 = C[103];
        n34 ^= C[104];
        clientRenderPipelineArray[n34 += PipelineManager.C[105]] = ClientRenderPipeline.GUI_SPECIAL;
        int n35 = C[106];
        n35 += C[107];
        clientRenderPipelineArray[n35 += PipelineManager.C[108]] = ClientRenderPipeline.GUI_TEXT;
        GUI_PIPELINES = clientRenderPipelineArray;
        int n36 = C[109];
        n36 ^= C[110];
        clientRenderPipelineArray = new ClientRenderPipeline[n36 ^= C[111]];
        int n37 = C[112];
        n37 ^= C[113];
        clientRenderPipelineArray[n37 -= PipelineManager.C[114]] = ClientRenderPipeline.WINDOW_RECT;
        int n38 = C[115];
        n38 ^= C[116];
        clientRenderPipelineArray[n38 -= PipelineManager.C[117]] = ClientRenderPipeline.WINDOW_SPECIAL;
        int n39 = C[118];
        n39 += C[119];
        clientRenderPipelineArray[n39 += PipelineManager.C[120]] = ClientRenderPipeline.WINDOW_TEXT;
        WINDOW_PIPELINES = clientRenderPipelineArray;
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[C[121]];
        String string = (String)object[C[122]];
        object = object[C[123]];
        Object[] objectArray = B;
        if (B == null) {
            objectArray = B = new Object[C[124]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[C[125]];
                A = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[C[127] ^ C[128]];
                byArray[PipelineManager.C[129] ^ PipelineManager.C[130]] = C[131] ^ C[132];
                byArray[PipelineManager.C[133] ^ PipelineManager.C[134]] = C[135] ^ C[136];
                byArray[PipelineManager.C[137] ^ PipelineManager.C[138]] = C[139] ^ C[140];
                byArray[PipelineManager.C[141] ^ PipelineManager.C[142]] = C[143] ^ C[144];
                byArray[PipelineManager.C[145] ^ PipelineManager.C[146]] = C[147] ^ C[148];
                byArray[PipelineManager.C[149] ^ PipelineManager.C[150]] = C[151] ^ C[152];
                byArray[PipelineManager.C[153] ^ PipelineManager.C[154]] = C[155] ^ C[156];
                byArray[PipelineManager.C[157] ^ PipelineManager.C[158]] = C[159] ^ C[160];
                byArray[PipelineManager.C[161] ^ PipelineManager.C[162]] = C[163] ^ C[164];
                byArray[PipelineManager.C[165] ^ PipelineManager.C[166]] = C[167] ^ C[168];
                byArray[PipelineManager.C[169] ^ PipelineManager.C[170]] = C[171] ^ C[172];
                byArray[PipelineManager.C[173] ^ PipelineManager.C[174]] = C[175] ^ C[176];
                byArray[PipelineManager.C[177] ^ PipelineManager.C[178]] = C[179] ^ C[180];
                byArray[PipelineManager.C[181] ^ PipelineManager.C[182]] = C[183] ^ C[184];
                byArray[PipelineManager.C[185] ^ PipelineManager.C[186]] = C[187] ^ C[188];
                byArray[PipelineManager.C[189] ^ PipelineManager.C[190]] = C[191] ^ C[192];
                objectArray2[PipelineManager.C[126]] = byArray;
            }
            byte[] byArray = (byte[])object3[C[193]];
            if (b == null) {
                byte[] byArray2 = new byte[C[194] ^ C[195]];
                byArray2[PipelineManager.C[196] ^ PipelineManager.C[197]] = C[198] ^ C[199];
                byArray2[PipelineManager.C[200] ^ PipelineManager.C[201]] = C[202] ^ C[203];
                byArray2[PipelineManager.C[204] ^ PipelineManager.C[205]] = C[206] ^ C[207];
                byArray2[PipelineManager.C[208] ^ PipelineManager.C[209]] = C[210] ^ C[211];
                byArray2[PipelineManager.C[212] ^ PipelineManager.C[213]] = C[214] ^ C[215];
                byArray2[PipelineManager.C[216] ^ PipelineManager.C[217]] = C[218] ^ C[219];
                byArray2[PipelineManager.C[220] ^ PipelineManager.C[221]] = C[222] ^ C[223];
                byArray2[PipelineManager.C[224] ^ PipelineManager.C[225]] = C[226] ^ C[227];
                byArray2[PipelineManager.C[228] ^ PipelineManager.C[229]] = C[230] ^ C[231];
                byArray2[PipelineManager.C[232] ^ PipelineManager.C[233]] = C[234] ^ C[235];
                byArray2[PipelineManager.C[236] ^ PipelineManager.C[237]] = C[238] ^ C[239];
                byArray2[PipelineManager.C[240] ^ PipelineManager.C[241]] = C[242] ^ C[243];
                byArray2[PipelineManager.C[244] ^ PipelineManager.C[245]] = C[246] ^ C[247];
                byArray2[PipelineManager.C[248] ^ PipelineManager.C[249]] = C[250] ^ C[251];
                byArray2[PipelineManager.C[252] ^ PipelineManager.C[253]] = C[254] ^ C[255];
                byArray2[PipelineManager.C[256] ^ PipelineManager.C[257]] = C[258] ^ C[259];
                byArray2[PipelineManager.C[260] ^ PipelineManager.C[261]] = C[262] ^ C[263];
                byArray2[PipelineManager.C[264] ^ PipelineManager.C[265]] = C[266] ^ C[267];
                byArray2[PipelineManager.C[268] ^ PipelineManager.C[269]] = C[270] ^ C[271];
                byArray2[PipelineManager.C[272] ^ PipelineManager.C[273]] = C[274] ^ C[275];
                byArray2[PipelineManager.C[276] ^ PipelineManager.C[277]] = C[278] ^ C[279];
                byArray2[PipelineManager.C[280] ^ PipelineManager.C[281]] = C[282] ^ C[283];
                byArray2[PipelineManager.C[284] ^ PipelineManager.C[285]] = C[286] ^ C[287];
                byArray2[PipelineManager.C[288] ^ PipelineManager.C[289]] = C[290] ^ C[291];
                byArray2[PipelineManager.C[292] ^ PipelineManager.C[293]] = C[294] ^ C[295];
                byArray2[PipelineManager.C[296] ^ PipelineManager.C[297]] = C[298] ^ C[299];
                byArray2[PipelineManager.C[300] ^ PipelineManager.C[301]] = C[302] ^ C[303];
                byArray2[PipelineManager.C[304] ^ PipelineManager.C[305]] = C[306] ^ C[307];
                byArray2[PipelineManager.C[308] ^ PipelineManager.C[309]] = C[310] ^ C[311];
                byArray2[PipelineManager.C[312] ^ PipelineManager.C[313]] = C[314] ^ C[315];
                byArray2[PipelineManager.C[316] ^ PipelineManager.C[317]] = C[318] ^ C[319];
                byArray2[PipelineManager.C[320] ^ PipelineManager.C[321]] = C[322] ^ C[323];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, C[324], byArray3, C[325], byArray.length);
                System.arraycopy(byArray2, C[326], byArray3, byArray.length, byArray2.length);
                Object object4 = PipelineManager.A()[C[327]];
                if (object4 == null) {
                    char[] cArray = "\u6c37\u6c21\u6c38\u6c23\u6c3d\u6c31\u6dec\u6dde\u6c73\u6ddf\u6c3f\u6dda\u6dc6\u6dc0\u6dd0\u6c3f\u6c26\u6c36".toCharArray();
                    for (int i2 = C[328]; i2 < C[329]; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= C[330];
                        n3 += C[331];
                        n3 += C[332];
                        n3 -= C[333];
                        n3 ^= C[334];
                        n3 ^= C[335];
                        n3 -= C[336];
                        n3 -= C[337];
                        n3 ^= C[338];
                        n3 -= C[339];
                        cArray[i2] = (char)(n3 += C[340]);
                    }
                    object4 = PipelineManager.A()[PipelineManager.C[341]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[C[342]];
                byArray4[PipelineManager.C[343]] = C[344];
                byArray4[PipelineManager.C[345]] = C[346];
                byArray4[PipelineManager.C[347]] = C[348];
                byArray4[PipelineManager.C[349]] = C[350];
                byArray4[PipelineManager.C[351]] = C[352];
                byArray4[PipelineManager.C[353]] = C[354];
                byArray4[PipelineManager.C[355]] = C[356];
                byArray4[PipelineManager.C[357]] = C[358];
                byArray4[PipelineManager.C[359]] = C[360];
                byArray4[PipelineManager.C[361]] = C[362];
                byArray4[PipelineManager.C[363]] = C[364];
                byArray4[PipelineManager.C[365]] = C[366];
                byArray4[PipelineManager.C[367]] = C[368];
                byArray4[PipelineManager.C[369]] = C[370];
                byArray4[PipelineManager.C[371]] = C[372];
                byArray4[PipelineManager.C[373]] = C[374];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, C[375], C[376]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = PipelineManager.A()[C[377]];
                if (object5 == null) {
                    char[] cArray = "\u411f\u4113\u4105".toCharArray();
                    for (int i3 = C[378]; i3 < C[379]; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= C[380];
                        n4 += C[381];
                        n4 += C[382];
                        n4 += C[383];
                        n4 -= C[384];
                        n4 += C[385];
                        n4 += C[386];
                        n4 ^= C[387];
                        n4 -= C[388];
                        n4 += C[389];
                        n4 += C[390];
                        cArray[i3] = (char)(n4 -= C[391]);
                    }
                    object5 = PipelineManager.A()[PipelineManager.C[392]] = new String(cArray);
                }
                b = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, C[393], C[394]);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, C[395], byArray6.length);
            Object object6 = PipelineManager.A()[C[396]];
            if (object6 == null) {
                char[] cArray = "\u0c98\u0c9c\u0e0a\u0ca6\u0c9a\u0c97\u0c9a\u0ca6\u0e05\u0e02\u0c9a\u0e0a\u0cac\u0e05\u0df8\u0df9\u0df9\u0e00\u0de3\u0dfe".toCharArray();
                for (int i4 = C[397]; i4 < C[398]; ++i4) {
                    int n5 = cArray[i4];
                    n5 ^= C[399];
                    n5 -= 16977;
                    n5 ^= 0x6B1;
                    n5 += 31730;
                    n5 -= 57795;
                    n5 += 45924;
                    n5 -= 61413;
                    n5 += 11431;
                    n5 += 53929;
                    n5 -= 31609;
                    n5 -= 38297;
                    cArray[i4] = (char)(n5 += 40799);
                }
                object6 = PipelineManager.A()[3] = new String(cArray);
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
        C = new int[0xE684 ^ 0xE714];
        PipelineManager.C[0xA71B ^ 0xA70F] = 0x10C ^ 0xA70F;
        PipelineManager.C[0xB4A1 ^ 0xB52D] = 0xB52E ^ 0xB52D;
        PipelineManager.C[0xCE0F ^ 0xCF06] = 0xDF ^ 0xCF06;
        PipelineManager.C[0xF99B ^ 0xF97F] = 0xF3C0 ^ 0xF97F;
        PipelineManager.C[0xD644 ^ 0xD651] = 0xB415 ^ 0xD651;
        PipelineManager.C[0x7893 ^ 0x7819] = 0x6E20 ^ 0x7819;
        PipelineManager.C[0xB7F6 ^ 0xB6B1] = 0xB6B0 ^ 0xB6B1;
        PipelineManager.C[0x68D3 ^ 0x6826] = 0xBD60 ^ 0x6826;
        PipelineManager.C[0x4C73 ^ 0x4D6D] = 0xFFFFAD6E ^ 0x4D6D;
        PipelineManager.C[0x69A9 ^ 0x68B4] = 0x7760 ^ 0x68B4;
        PipelineManager.C[0xDEF8 ^ 0xDE86] = 0xDE86 ^ 0xDE86;
        PipelineManager.C[0x3946 ^ 0x3837] = 0x383F ^ 0x3837;
        PipelineManager.C[0x8327 ^ 0x83C6] = 0xDEA0 ^ 0x83C6;
        PipelineManager.C[0x10109 ^ 0x1013B] = 0xFFFEFEC9 ^ 0x1013B;
        PipelineManager.C[0x3319 ^ 0x3224] = 0x136E1 ^ 0x3224;
        PipelineManager.C[0x7E29 ^ 0x7F75] = 0x7F17 ^ 0x7F75;
        PipelineManager.C[0x107C6 ^ 0x10752] = 0x10420 ^ 0x10752;
        PipelineManager.C[0x10E71 ^ 0x10F25] = 0x134CB ^ 0x10F25;
        PipelineManager.C[0xC792 ^ 0xC6B7] = 0x58E1 ^ 0xC6B7;
        PipelineManager.C[0xD6F3 ^ 0xD626] = 0xBE4D ^ 0xD626;
        PipelineManager.C[0x8F2F ^ 0x8E67] = 0x8E67 ^ 0x8E67;
        PipelineManager.C[0x10821 ^ 0x10811] = 0xFFFEF7ED ^ 0x10811;
        PipelineManager.C[0xA1EE ^ 0xA1FE] = 0xA1D2 ^ 0xA1FE;
        PipelineManager.C[0xC3C4 ^ 0xC3E8] = 0xFFFF3C6B ^ 0xC3E8;
        PipelineManager.C[0x10570 ^ 0x10444] = 0x16673 ^ 0x10444;
        PipelineManager.C[0xB94C ^ 0xB9CE] = 0xDEE3 ^ 0xB9CE;
        PipelineManager.C[0x9734 ^ 0x971F] = 0x976B ^ 0x971F;
        PipelineManager.C[0xF2B2 ^ 0xF3EB] = 0xF3E1 ^ 0xF3EB;
        PipelineManager.C[0xD80C ^ 0xD963] = 0xD961 ^ 0xD963;
        PipelineManager.C[0xFF85 ^ 0xFF21] = 0xE519 ^ 0xFF21;
        PipelineManager.C[0xE2A4 ^ 0xE3BF] = 0xFF8A ^ 0xE3BF;
        PipelineManager.C[0xADFD ^ 0xAD90] = 0xADFF ^ 0xAD90;
        PipelineManager.C[0x103DE ^ 0x102E1] = 0x624 ^ 0x102E1;
        PipelineManager.C[0x8211 ^ 0x8397] = 0xD838 ^ 0x8397;
        PipelineManager.C[0xE1EE ^ 0xE1D0] = 0xE1C7 ^ 0xE1D0;
        PipelineManager.C[0xBA34 ^ 0xBB50] = 0xBB04 ^ 0xBB50;
        PipelineManager.C[0xC79F ^ 0xC6CE] = 0x8954 ^ 0xC6CE;
        PipelineManager.C[0x555 ^ 0x595] = 0xADEE ^ 0x595;
        PipelineManager.C[0xB076 ^ 0xB132] = 0xB132 ^ 0xB132;
        PipelineManager.C[0xCBA9 ^ 0xCAE6] = 0xE13C ^ 0xCAE6;
        PipelineManager.C[0x4004 ^ 0x4023] = 0x4026 ^ 0x4023;
        PipelineManager.C[0x2E56 ^ 0x2F23] = 0x2F28 ^ 0x2F23;
        PipelineManager.C[0xBE48 ^ 0xBF71] = 0x50B3 ^ 0xBF71;
        PipelineManager.C[0xE05C ^ 0xE0A4] = 0x23D ^ 0xE0A4;
        PipelineManager.C[0x94DC ^ 0x944D] = 0x973E ^ 0x944D;
        PipelineManager.C[0x3DFF ^ 0x3D37] = 0x6CB5 ^ 0x3D37;
        PipelineManager.C[0x24E9 ^ 0x25CF] = 0xFFFF4471 ^ 0x25CF;
        PipelineManager.C[0x88DB ^ 0x88F8] = 0x88C8 ^ 0x88F8;
        PipelineManager.C[0xAC08 ^ 0xAC01] = 0xAC02 ^ 0xAC01;
        PipelineManager.C[0x41D9 ^ 0x4170] = 0xE4C3 ^ 0x4170;
        PipelineManager.C[0x2055 ^ 0x20F5] = 0xA0D4 ^ 0x20F5;
        PipelineManager.C[0x1F1E ^ 0x1FC3] = 0x78C7 ^ 0x1FC3;
        PipelineManager.C[0x4E57 ^ 0x4EF2] = 0x5848 ^ 0x4EF2;
        PipelineManager.C[0xAB7D ^ 0xABCB] = 0x79A1 ^ 0xABCB;
        PipelineManager.C[0x9991 ^ 0x993C] = 0x89B2 ^ 0x993C;
        PipelineManager.C[0x9EAB ^ 0x9E57] = 0x4323 ^ 0x9E57;
        PipelineManager.C[0x8E75 ^ 0x8F71] = 0x8265 ^ 0x8F71;
        PipelineManager.C[0x3AAA ^ 0x3A73] = 0xC4B1 ^ 0x3A73;
        PipelineManager.C[0xF635 ^ 0xF746] = 0xF74B ^ 0xF746;
        PipelineManager.C[0x134F ^ 0x1265] = 0xFFFFD132 ^ 0x1265;
        PipelineManager.C[0x6678 ^ 0x6697] = 0x337D ^ 0x6697;
        PipelineManager.C[0x4A4A ^ 0x4B50] = 0x5706 ^ 0x4B50;
        PipelineManager.C[0x10C81 ^ 0x10C8A] = 0x10C8B ^ 0x10C8A;
        PipelineManager.C[0x103E5 ^ 0x1038D] = 0x103B9 ^ 0x1038D;
        PipelineManager.C[0x615C ^ 0x6115] = 0x6125 ^ 0x6115;
        PipelineManager.C[0xA5AE ^ 0xA558] = 0xFFFF8F85 ^ 0xA558;
        PipelineManager.C[0xB606 ^ 0xB747] = 0x5D37 ^ 0xB747;
        PipelineManager.C[0x5328 ^ 0x53B4] = 0x3F06 ^ 0x53B4;
        PipelineManager.C[0x1422 ^ 0x1550] = 0xFFFFEA98 ^ 0x1550;
        PipelineManager.C[0x2078 ^ 0x2159] = 0xB0D0 ^ 0x2159;
        PipelineManager.C[0x5906 ^ 0x580E] = 0x97CE ^ 0x580E;
        PipelineManager.C[0x9725 ^ 0x9666] = 0x7C16 ^ 0x9666;
        PipelineManager.C[0x6EAF ^ 0x6FCC] = 0x6FC3 ^ 0x6FCC;
        PipelineManager.C[0x19F ^ 0x14E] = 0x8DE6 ^ 0x14E;
        PipelineManager.C[0x6698 ^ 0x67C0] = 0x67DC ^ 0x67C0;
        PipelineManager.C[0xBDAC ^ 0xBCD8] = 0xFFFF4343 ^ 0xBCD8;
        PipelineManager.C[0xA15F ^ 0xA043] = 0xBF85 ^ 0xA043;
        PipelineManager.C[0x917 ^ 0x9A4] = 0x10E07 ^ 0x9A4;
        PipelineManager.C[0x102A2 ^ 0x103DB] = 0x103D9 ^ 0x103DB;
        PipelineManager.C[0x6FF3 ^ 0x6FFF] = 0x6FFF ^ 0x6FFF;
        PipelineManager.C[0x35A8 ^ 0x3573] = 0xCBB1 ^ 0x3573;
        PipelineManager.C[0x2144 ^ 0x21F8] = 0x9DFC ^ 0x21F8;
        PipelineManager.C[0x450B ^ 0x4590] = 0x2952 ^ 0x4590;
        PipelineManager.C[0xDD36 ^ 0xDC04] = 0x931A ^ 0xDC04;
        PipelineManager.C[0xB770 ^ 0xB607] = 0xB61E ^ 0xB607;
        PipelineManager.C[0xB2F3 ^ 0xB398] = 0xB39E ^ 0xB398;
        PipelineManager.C[0x3629 ^ 0x36A0] = 0x209F ^ 0x36A0;
        PipelineManager.C[0x1078B ^ 0x1075B] = 0x18BFE ^ 0x1075B;
        PipelineManager.C[0x7FE1 ^ 0x7F07] = 0xFFFF8A39 ^ 0x7F07;
        PipelineManager.C[0x7DF1 ^ 0x7CC6] = 0x1EEC ^ 0x7CC6;
        PipelineManager.C[0x8E1E ^ 0x8E8E] = 0xA544 ^ 0x8E8E;
        PipelineManager.C[0x209 ^ 0x2C2] = 0x535B ^ 0x2C2;
        PipelineManager.C[0x749D ^ 0x7487] = 0x6EDB ^ 0x7487;
        PipelineManager.C[0x5976 ^ 0x5956] = 0x5916 ^ 0x5956;
        PipelineManager.C[0xF152 ^ 0xF165] = 0xF15B ^ 0xF165;
        PipelineManager.C[0xCBBB ^ 0xCB0C] = 0x192B ^ 0xCB0C;
        PipelineManager.C[0x28FA ^ 0x299F] = 0x2998 ^ 0x299F;
        PipelineManager.C[0x50BA ^ 0x513A] = 0xF94C ^ 0x513A;
        PipelineManager.C[0xC94 ^ 0xCCB] = 0xCBB ^ 0xCCB;
        PipelineManager.C[0xA9EC ^ 0xA99E] = 0xA9E0 ^ 0xA99E;
        PipelineManager.C[0xCB82 ^ 0xCBE1] = 0xFFFF3447 ^ 0xCBE1;
        PipelineManager.C[0x53C9 ^ 0x53D8] = 0xD1E8 ^ 0x53D8;
        PipelineManager.C[0x84F7 ^ 0x85CD] = 0x6A29 ^ 0x85CD;
        PipelineManager.C[0x2A3D ^ 0x2AAE] = 0x29E4 ^ 0x2AAE;
        PipelineManager.C[0x4E3C ^ 0x4E6E] = 0x4E77 ^ 0x4E6E;
        PipelineManager.C[0xC630 ^ 0xC6B4] = 0xA199 ^ 0xC6B4;
        PipelineManager.C[0x89F1 ^ 0x8994] = 0xFFFF760B ^ 0x8994;
        PipelineManager.C[0xDF42 ^ 0xDE61] = 0x4FE8 ^ 0xDE61;
        PipelineManager.C[0xEA73 ^ 0xEA4C] = 0xFFFF15BB ^ 0xEA4C;
        PipelineManager.C[0x5BD7 ^ 0x5A50] = 0x69CF ^ 0x5A50;
        PipelineManager.C[0xCC98 ^ 0xCD98] = 0x4D45 ^ 0xCD98;
        PipelineManager.C[0x5369 ^ 0x5310] = 0x5311 ^ 0x5310;
        PipelineManager.C[0x374D ^ 0x3632] = 0xAB84 ^ 0x3632;
        PipelineManager.C[0x52D3 ^ 0x5294] = 0xFFFFAD05 ^ 0x5294;
        PipelineManager.C[0x61DB ^ 0x61BF] = 0x6197 ^ 0x61BF;
        PipelineManager.C[0x764C ^ 0x7713] = 0x771A ^ 0x7713;
        PipelineManager.C[0x3936 ^ 0x3811] = 0xA647 ^ 0x3811;
        PipelineManager.C[0x3C61 ^ 0x3D23] = 0xFFFF28A7 ^ 0x3D23;
        PipelineManager.C[0xBBB8 ^ 0xBB52] = 0xFFFFE185 ^ 0xBB52;
        PipelineManager.C[0x7AE0 ^ 0x7A81] = 0x7AF5 ^ 0x7A81;
        PipelineManager.C[0x39E0 ^ 0x393E] = 0xFFFFA1A5 ^ 0x393E;
        PipelineManager.C[0x21C4 ^ 0x2123] = 0x2B82 ^ 0x2123;
        PipelineManager.C[0x5A41 ^ 0x5AE6] = 0xFFFFB3F6 ^ 0x5AE6;
        PipelineManager.C[0x40E5 ^ 0x40A1] = 0xFFFFBF5A ^ 0x40A1;
        PipelineManager.C[0x336C ^ 0x33A5] = 0x623C ^ 0x33A5;
        PipelineManager.C[0x8D43 ^ 0x8D3B] = 0x8D27 ^ 0x8D3B;
        PipelineManager.C[0x10870 ^ 0x10827] = 0x1087A ^ 0x10827;
        PipelineManager.C[0x44BD ^ 0x4456] = 0xE141 ^ 0x4456;
        PipelineManager.C[0x9483 ^ 0x94BF] = 0x94BD ^ 0x94BF;
        PipelineManager.C[0x9A65 ^ 0x9A66] = 0x9A5D ^ 0x9A66;
        PipelineManager.C[0x423E ^ 0x42D7] = 0xE7C0 ^ 0x42D7;
        PipelineManager.C[0x1011F ^ 0x10126] = 0x10140 ^ 0x10126;
        PipelineManager.C[0x3EB7 ^ 0x3F98] = 0xAD5 ^ 0x3F98;
        PipelineManager.C[0xF60E ^ 0xF750] = 0xFFFF08BF ^ 0xF750;
        PipelineManager.C[0x76A0 ^ 0x77A6] = 0x7AB3 ^ 0x77A6;
        PipelineManager.C[0xF0E8 ^ 0xF050] = 0x223A ^ 0xF050;
        PipelineManager.C[0x9BC0 ^ 0x9AC5] = 0x97DB ^ 0x9AC5;
        PipelineManager.C[0xA482 ^ 0xA580] = 0xFFFFDA97 ^ 0xA580;
        PipelineManager.C[0x39D1 ^ 0x3917] = 0xFFFFD452 ^ 0x3917;
        PipelineManager.C[0x3C2A ^ 0x3CF9] = 0xB051 ^ 0x3CF9;
        PipelineManager.C[0x2210 ^ 0x2224] = 0x2228 ^ 0x2224;
        PipelineManager.C[0x10F8C ^ 0x10E98] = 0x1F76E ^ 0x10E98;
        PipelineManager.C[0x5E6C ^ 0x5F47] = 0x63FA ^ 0x5F47;
        PipelineManager.C[0x889A ^ 0x89A9] = 0xC686 ^ 0x89A9;
        PipelineManager.C[0x1D8F ^ 0x1DAE] = 0xFFFFE216 ^ 0x1DAE;
        PipelineManager.C[0xAA65 ^ 0xAA2D] = 0xFFFF558D ^ 0xAA2D;
        PipelineManager.C[0xA272 ^ 0xA286] = 0x77C8 ^ 0xA286;
        PipelineManager.C[0x69E9 ^ 0x6968] = 0xE4A ^ 0x6968;
        PipelineManager.C[0x94F6 ^ 0x9491] = 0x94FF ^ 0x9491;
        PipelineManager.C[0x7A6F ^ 0x7B6C] = 0xFBA0 ^ 0x7B6C;
        PipelineManager.C[0xDA79 ^ 0xDB3C] = 0xDB3C ^ 0xDB3C;
        PipelineManager.C[0x6469 ^ 0x6523] = 0x7A91 ^ 0x6523;
        PipelineManager.C[0x584 ^ 0x5F7] = 0xFFFFFA1D ^ 0x5F7;
        PipelineManager.C[0x86E7 ^ 0x86DA] = 0x86A9 ^ 0x86DA;
        PipelineManager.C[0xE28A ^ 0xE284] = 0xE284 ^ 0xE284;
        PipelineManager.C[0x2220 ^ 0x23A3] = 0x11D8 ^ 0x23A3;
        PipelineManager.C[0x62ED ^ 0x62B4] = 0xFFFF9D4A ^ 0x62B4;
        PipelineManager.C[0x44 ^ 0x1C9] = 0x1C9 ^ 0x1C9;
        PipelineManager.C[0xBA1B ^ 0xBA1E] = 0xFFFF45CE ^ 0xBA1E;
        PipelineManager.C[0x8AD7 ^ 0x8A6C] = 0x366C ^ 0x8A6C;
        PipelineManager.C[0x13A5 ^ 0x136F] = 0xFFFFBD62 ^ 0x136F;
        PipelineManager.C[0x4D0E ^ 0x4DD6] = 0xB31D ^ 0x4DD6;
        PipelineManager.C[0x5BCD ^ 0x5B0E] = 0xA5D5 ^ 0x5B0E;
        PipelineManager.C[0x257C ^ 0x250B] = 0xFFFFDAEC ^ 0x250B;
        PipelineManager.C[0xB3A5 ^ 0xB3C5] = 0xB3A6 ^ 0xB3C5;
        PipelineManager.C[0xA666 ^ 0xA638] = 0xFFFF5917 ^ 0xA638;
        PipelineManager.C[0x2A15 ^ 0x2A7A] = 0xFFFFD5DA ^ 0x2A7A;
        PipelineManager.C[0x47D1 ^ 0x4780] = 0xFFFFB824 ^ 0x4780;
        PipelineManager.C[0xDEE3 ^ 0xDEB7] = 0xDE9C ^ 0xDEB7;
        PipelineManager.C[0xD904 ^ 0xD826] = 0x49FD ^ 0xD826;
        PipelineManager.C[0x1F9E ^ 0x1F09] = 0xBE2F ^ 0x1F09;
        PipelineManager.C[0x6646 ^ 0x6624] = 0x660D ^ 0x6624;
        PipelineManager.C[0xA3E ^ 0xB77] = 0xB65 ^ 0xB77;
        PipelineManager.C[0x2B3 ^ 0x22D] = 0x820C ^ 0x22D;
        PipelineManager.C[0xDD5A ^ 0xDD41] = 0x65BE ^ 0xDD41;
        PipelineManager.C[0x71B5 ^ 0x70B2] = 0x7DAC ^ 0x70B2;
        PipelineManager.C[0xFC3F ^ 0xFC49] = 0xFFFF03B6 ^ 0xFC49;
        PipelineManager.C[0xB383 ^ 0xB3C2] = 0xFFFF4C3F ^ 0xB3C2;
        PipelineManager.C[0x44B6 ^ 0x45DA] = 0x45A4 ^ 0x45DA;
        PipelineManager.C[0x3470 ^ 0x3540] = 0x7A6E ^ 0x3540;
        PipelineManager.C[0x9F1E ^ 0x9F36] = 0xFFFF60AC ^ 0x9F36;
        PipelineManager.C[0x170C ^ 0x1734] = 0xFFFFE8A0 ^ 0x1734;
        PipelineManager.C[0x14B8 ^ 0x15F4] = 0x9010 ^ 0x15F4;
        PipelineManager.C[0xC624 ^ 0xC60E] = 0xFFFF39B3 ^ 0xC60E;
        PipelineManager.C[0x7CD8 ^ 0x7C9B] = 0x7CD4 ^ 0x7C9B;
        PipelineManager.C[0xCA6D ^ 0xCA23] = 0xFFFF35A5 ^ 0xCA23;
        PipelineManager.C[0xB0C6 ^ 0xB1B6] = 0xB1B1 ^ 0xB1B6;
        PipelineManager.C[0xC01B ^ 0xC191] = 0xC181 ^ 0xC191;
        PipelineManager.C[0x2566 ^ 0x25D2] = 0x12239 ^ 0x25D2;
        PipelineManager.C[0x1EBF ^ 0x1F8E] = 0x50A1 ^ 0x1F8E;
        PipelineManager.C[0x101D6 ^ 0x10163] = 0x1D30C ^ 0x10163;
        PipelineManager.C[0xA14A ^ 0xA1E0] = 0x454 ^ 0xA1E0;
        PipelineManager.C[0x3947 ^ 0x39C1] = 0x2D3F ^ 0x39C1;
        PipelineManager.C[0xE784 ^ 0xE6B2] = 0x84D0 ^ 0xE6B2;
        PipelineManager.C[0xB340 ^ 0xB3BD] = 0x6ECF ^ 0xB3BD;
        PipelineManager.C[0x6109 ^ 0x61D3] = 0x9F7C ^ 0x61D3;
        PipelineManager.C[0x6F91 ^ 0x6EF6] = 0x6EFA ^ 0x6EF6;
        PipelineManager.C[0x8D41 ^ 0x8CCE] = 0xD4CE ^ 0x8CCE;
        PipelineManager.C[0xAB17 ^ 0xAA9C] = 0xAA8C ^ 0xAA9C;
        PipelineManager.C[0x1985 ^ 0x18BB] = 0xFFFEE3EC ^ 0x18BB;
        PipelineManager.C[0xC1C8 ^ 0xC1C5] = 0xC1C7 ^ 0xC1C5;
        PipelineManager.C[0x3062 ^ 0x3102] = 0xFFFFCEB6 ^ 0x3102;
        PipelineManager.C[0xD68D ^ 0xD673] = 0xFFFFF4AF ^ 0xD673;
        PipelineManager.C[0xAC18 ^ 0xAD24] = 0x1A9EF ^ 0xAD24;
        PipelineManager.C[0x14CE ^ 0x1445] = 0x26D ^ 0x1445;
        PipelineManager.C[0x13F3 ^ 0x136B] = 0xB24A ^ 0x136B;
        PipelineManager.C[0xA1F7 ^ 0xA076] = 0xD04E ^ 0xA076;
        PipelineManager.C[0x71F0 ^ 0x71E2] = 0xB43 ^ 0x71E2;
        PipelineManager.C[0xBEB6 ^ 0xBFFD] = 0xAD9E ^ 0xBFFD;
        PipelineManager.C[0x26E7 ^ 0x26FB] = 0x26FB ^ 0x26FB;
        PipelineManager.C[0x942 ^ 0x948] = 0x948 ^ 0x948;
        PipelineManager.C[0x7D83 ^ 0x7D41] = 0x83BA ^ 0x7D41;
        PipelineManager.C[0x22B5 ^ 0x22D9] = 0x2283 ^ 0x22D9;
        PipelineManager.C[0x7F84 ^ 0x7EDE] = 0x7EE6 ^ 0x7EDE;
        PipelineManager.C[0x4DAB ^ 0x4DED] = 0x4DBC ^ 0x4DED;
        PipelineManager.C[0x8C59 ^ 0x8D30] = 0x8D30 ^ 0x8D30;
        PipelineManager.C[0xFFD1 ^ 0xFEC8] = 0xE2FD ^ 0xFEC8;
        PipelineManager.C[0xD7B0 ^ 0xD71F] = 0xC7C5 ^ 0xD71F;
        PipelineManager.C[0x21D6 ^ 0x2180] = 0xFFFFDE1D ^ 0x2180;
        PipelineManager.C[0xC4DC ^ 0xC459] = 0xD0AB ^ 0xC459;
        PipelineManager.C[0x10973 ^ 0x10972] = 0xFFFEF68C ^ 0x10972;
        PipelineManager.C[0x25CC ^ 0x25D1] = 0x2582 ^ 0x25D1;
        PipelineManager.C[0x1C4E ^ 0x1C4A] = 0xFFFFE3A0 ^ 0x1C4A;
        PipelineManager.C[0x6CD2 ^ 0x6DC5] = 0x9436 ^ 0x6DC5;
        PipelineManager.C[0x748E ^ 0x746C] = 0xFFFFD682 ^ 0x746C;
        PipelineManager.C[0xCEEE ^ 0xCE2F] = 0xCE2F ^ 0xCE2F;
        PipelineManager.C[0xA26A ^ 0xA3E2] = 0xA3E0 ^ 0xA3E2;
        PipelineManager.C[0xE78 ^ 0xE16] = 0xFFFFF1DA ^ 0xE16;
        PipelineManager.C[0x36E7 ^ 0x378D] = 0xFFFFC859 ^ 0x378D;
        PipelineManager.C[0x999F ^ 0x99B0] = 0x99FD ^ 0x99B0;
        PipelineManager.C[0x960D ^ 0x9655] = 0x967D ^ 0x9655;
        PipelineManager.C[0xEA2 ^ 0xE53] = 0x2A7E ^ 0xE53;
        PipelineManager.C[0xC182 ^ 0xC1EB] = 0xFFFF3E4C ^ 0xC1EB;
        PipelineManager.C[0x934B ^ 0x9237] = 0xB907 ^ 0x9237;
        PipelineManager.C[0x56AC ^ 0x57D4] = 0x56D4 ^ 0x57D4;
        PipelineManager.C[0xB134 ^ 0xB195] = 0xABA0 ^ 0xB195;
        PipelineManager.C[0x470B ^ 0x4730] = 0x47B1 ^ 0x4730;
        PipelineManager.C[0x10503 ^ 0x10580] = 0xFFFE9D46 ^ 0x10580;
        PipelineManager.C[0x9DB ^ 0x886] = 0x887 ^ 0x886;
        PipelineManager.C[0x54EA ^ 0x54C7] = 0x54B6 ^ 0x54C7;
        PipelineManager.C[0x8B7D ^ 0x8B26] = 0x8B13 ^ 0x8B26;
        PipelineManager.C[0x6C00 ^ 0x6D0E] = 0xD2C6 ^ 0x6D0E;
        PipelineManager.C[0x4640 ^ 0x4647] = 0xFFFFB9DE ^ 0x4647;
        PipelineManager.C[0x284 ^ 0x292] = 0xA596 ^ 0x292;
        PipelineManager.C[0x6E45 ^ 0x6F55] = 0xD1DF ^ 0x6F55;
        PipelineManager.C[0xCE08 ^ 0xCE95] = 0x4EBF ^ 0xCE95;
        PipelineManager.C[0xF0FD ^ 0xF0EE] = 0x52AC ^ 0xF0EE;
        PipelineManager.C[0x9052 ^ 0x90FC] = 0x8076 ^ 0x90FC;
        PipelineManager.C[0x19D5 ^ 0x19F0] = 0x19F8 ^ 0x19F0;
        PipelineManager.C[0x8083 ^ 0x80B9] = 0xFFFF7F6B ^ 0x80B9;
        PipelineManager.C[0x10A01 ^ 0x10A0E] = 0x10A0E ^ 0x10A0E;
        PipelineManager.C[0x37B7 ^ 0x37FD] = 0xFFFFC801 ^ 0x37FD;
        PipelineManager.C[0xCC69 ^ 0xCD7B] = 0xFFFF8C34 ^ 0xCD7B;
        PipelineManager.C[0x2F70 ^ 0x2FC1] = 0x12822 ^ 0x2FC1;
        PipelineManager.C[0xBEAE ^ 0xBEEE] = 0xFFFF4110 ^ 0xBEEE;
        PipelineManager.C[0x4E7D ^ 0x4EB3] = 0xFFFF5FBA ^ 0x4EB3;
        PipelineManager.C[0xEF86 ^ 0xEFF7] = 0xFFFF102D ^ 0xEFF7;
        PipelineManager.C[0x1020E ^ 0x102D2] = 0x165C1 ^ 0x102D2;
        PipelineManager.C[0x7B42 ^ 0x7B5B] = 0xB160 ^ 0x7B5B;
        PipelineManager.C[0x7E6E ^ 0x7EDE] = 0x6E54 ^ 0x7EDE;
        PipelineManager.C[0xE7FF ^ 0xE6D1] = 0xD3A4 ^ 0xE6D1;
        PipelineManager.C[0xD7F8 ^ 0xD682] = 0xD682 ^ 0xD682;
        PipelineManager.C[0xC3D4 ^ 0xC337] = 0x9E51 ^ 0xC337;
        PipelineManager.C[0xA333 ^ 0xA3DD] = 0xF62C ^ 0xA3DD;
        PipelineManager.C[0xE4D7 ^ 0xE469] = 0x4C12 ^ 0xE469;
        PipelineManager.C[0x499E ^ 0x49D2] = 0x4901 ^ 0x49D2;
        PipelineManager.C[0xE5FE ^ 0xE4D2] = 0xD18A ^ 0xE4D2;
        PipelineManager.C[0x69B1 ^ 0x6913] = 0x732B ^ 0x6913;
        PipelineManager.C[0x39EB ^ 0x38E0] = 0xF739 ^ 0x38E0;
        PipelineManager.C[0xA8AA ^ 0xA8DF] = 0xA8CC ^ 0xA8DF;
        PipelineManager.C[0x633A ^ 0x62B3] = 0x62B3 ^ 0x62B3;
        PipelineManager.C[0x10AA4 ^ 0x10AE6] = 0xFFFEF505 ^ 0x10AE6;
        PipelineManager.C[0x1970 ^ 0x1982] = 0x3DB8 ^ 0x1982;
        PipelineManager.C[0x45C8 ^ 0x455E] = 0xE47F ^ 0x455E;
        PipelineManager.C[0xB8D0 ^ 0xB883] = 0xFFFF474D ^ 0xB883;
        PipelineManager.C[0x424D ^ 0x4376] = 0xACB4 ^ 0x4376;
        PipelineManager.C[0x40DA ^ 0x40EC] = 0x40B1 ^ 0x40EC;
        PipelineManager.C[0xE23F ^ 0xE369] = 0xE379 ^ 0xE369;
        PipelineManager.C[0xA249 ^ 0xA26F] = 0xFFFF5DCF ^ 0xA26F;
        PipelineManager.C[0x1D68 ^ 0x1C48] = 0x8DDE ^ 0x1C48;
        PipelineManager.C[0x79B1 ^ 0x7895] = 0xE6D0 ^ 0x7895;
        PipelineManager.C[0x10A99 ^ 0x10A0C] = 0x1AB24 ^ 0x10A0C;
        PipelineManager.C[0x10F4 ^ 0x1189] = 0xCF28 ^ 0x1189;
        PipelineManager.C[0xD4BC ^ 0xD5A9] = 0x2C5A ^ 0xD5A9;
        PipelineManager.C[0xA98 ^ 0xA5C] = 0x18CD ^ 0xA5C;
        PipelineManager.C[0x6DDB ^ 0x6C8E] = 0x6C8F ^ 0x6C8E;
        PipelineManager.C[0x1085D ^ 0x1085F] = 0x1087E ^ 0x1085F;
        PipelineManager.C[0xDBCD ^ 0xDB4D] = 0xA265 ^ 0xDB4D;
        PipelineManager.C[0xAA40 ^ 0xAB41] = 0x2B8D ^ 0xAB41;
        PipelineManager.C[0xAF95 ^ 0xAE8D] = 0xB2BF ^ 0xAE8D;
        PipelineManager.C[0x3E4C ^ 0x3EBF] = 0x1A92 ^ 0x3EBF;
        PipelineManager.C[0x7FBA ^ 0x7F05] = 0xD752 ^ 0x7F05;
        PipelineManager.C[0x1EFC ^ 0x1FF0] = 0xA00C ^ 0x1FF0;
        PipelineManager.C[0xE2D2 ^ 0xE297] = 0xFFFF1D03 ^ 0xE297;
        PipelineManager.C[0x2D92 ^ 0x2DA1] = 0xFFFFD27F ^ 0x2DA1;
        PipelineManager.C[0x824E ^ 0x8358] = 0x7AA2 ^ 0x8358;
        PipelineManager.C[0xD70E ^ 0xD7C9] = 0xC54E ^ 0xD7C9;
        PipelineManager.C[0xA16 ^ 0xB92] = 0x6E69 ^ 0xB92;
        PipelineManager.C[0xFFB6 ^ 0xFF2C] = 0x939E ^ 0xFF2C;
        PipelineManager.C[0x9A53 ^ 0x9B13] = 0x716F ^ 0x9B13;
        PipelineManager.C[0x6F32 ^ 0x6EBC] = 0x6EA8 ^ 0x6EBC;
        PipelineManager.C[0x5AF6 ^ 0x5A7E] = 0x4E80 ^ 0x5A7E;
        PipelineManager.C[0xEDEC ^ 0xED98] = 0xFFFF1266 ^ 0xED98;
        PipelineManager.C[0xFE2B ^ 0xFF26] = 0x40CE ^ 0xFF26;
        PipelineManager.C[0xF382 ^ 0xF3F8] = 0xF3FA ^ 0xF3F8;
        PipelineManager.C[0x3573 ^ 0x341D] = 0xFFFFCBAF ^ 0x341D;
        PipelineManager.C[0x5564 ^ 0x550E] = 0xFFFFAAFE ^ 0x550E;
        PipelineManager.C[0x1063C ^ 0x10742] = 0x16801 ^ 0x10742;
        PipelineManager.C[0xBF48 ^ 0xBF33] = 0xBF33 ^ 0xBF33;
        PipelineManager.C[0x68A1 ^ 0x68B9] = 0x83CE ^ 0x68B9;
        PipelineManager.C[0x6340 ^ 0x620D] = 0xA145 ^ 0x620D;
        PipelineManager.C[0xE694 ^ 0xE658] = 0x8CE ^ 0xE658;
        PipelineManager.C[0x6616 ^ 0x6609] = 0x6616 ^ 0x6609;
        PipelineManager.C[0x4BF0 ^ 0x4BEE] = 0x4BFA ^ 0x4BEE;
        PipelineManager.C[0x20CB ^ 0x2052] = 0x4CEA ^ 0x2052;
        PipelineManager.C[0x5790 ^ 0x56A5] = 0x348F ^ 0x56A5;
        PipelineManager.C[0x58E7 ^ 0x59B7] = 0x268D ^ 0x59B7;
        PipelineManager.C[0x23B2 ^ 0x229F] = 0x17D2 ^ 0x229F;
        PipelineManager.C[0xD8FA ^ 0xD9C2] = 0x361C ^ 0xD9C2;
        PipelineManager.C[0xC460 ^ 0xC43D] = 0xC44B ^ 0xC43D;
        PipelineManager.C[0x9877 ^ 0x982B] = 0x9869 ^ 0x982B;
        PipelineManager.C[0x18CF ^ 0x1840] = 0x33CF ^ 0x1840;
        PipelineManager.C[0xB4FF ^ 0xB413] = 0xE1FA ^ 0xB413;
        PipelineManager.C[0x22E3 ^ 0x2382] = 0x238C ^ 0x2382;
        PipelineManager.C[0xCAA0 ^ 0xCA08] = 0xDCB2 ^ 0xCA08;
        PipelineManager.C[0x36CF ^ 0x3675] = 0x8A71 ^ 0x3675;
        PipelineManager.C[0x8884 ^ 0x8849] = 0x66D0 ^ 0x8849;
        PipelineManager.C[0x60C9 ^ 0x614B] = 0x21B1 ^ 0x614B;
        PipelineManager.C[0x3B18 ^ 0x3B0F] = 0x12D8 ^ 0x3B0F;
        PipelineManager.C[0x225F ^ 0x220F] = 0xFFFFDDD5 ^ 0x220F;
        PipelineManager.C[0x6793 ^ 0x668C] = 0x7958 ^ 0x668C;
        PipelineManager.C[0x7256 ^ 0x7230] = 0x7209 ^ 0x7230;
        PipelineManager.C[0xB852 ^ 0xB82D] = 0xC115 ^ 0xB82D;
        PipelineManager.C[0x61E6 ^ 0x6154] = 0x166BF ^ 0x6154;
        PipelineManager.C[0x3B92 ^ 0x3BDD] = 0x3B7F ^ 0x3BDD;
        PipelineManager.C[0xF59D ^ 0xF492] = 0x4B7A ^ 0xF492;
        PipelineManager.C[0x9C53 ^ 0x9D59] = 0xFFFFAD59 ^ 0x9D59;
        PipelineManager.C[0xBED5 ^ 0xBE98] = 0xFFFF415F ^ 0xBE98;
        PipelineManager.C[0x1786 ^ 0x17FA] = 0x17FB ^ 0x17FA;
        PipelineManager.C[0x142E ^ 0x1555] = 0x1556 ^ 0x1555;
        PipelineManager.C[0x21D1 ^ 0x219A] = 0xFFFFDE76 ^ 0x219A;
        PipelineManager.C[0x452B ^ 0x452D] = 0x4501 ^ 0x452D;
        PipelineManager.C[0x5E10 ^ 0x5E60] = 0xFFFFA1C4 ^ 0x5E60;
        PipelineManager.C[0x5B86 ^ 0x5AF0] = 0x5ADE ^ 0x5AF0;
        PipelineManager.C[0x5300 ^ 0x53AB] = 0xF606 ^ 0x53AB;
        PipelineManager.C[0x23B5 ^ 0x2327] = 0x2055 ^ 0x2327;
        PipelineManager.C[0xA451 ^ 0xA4A6] = 0x71E0 ^ 0xA4A6;
        PipelineManager.C[0xF54C ^ 0xF5B7] = 0x1725 ^ 0xF5B7;
        PipelineManager.C[0x7469 ^ 0x74AC] = 0x662B ^ 0x74AC;
        PipelineManager.C[0x1055F ^ 0x1044E] = 0x1BAC4 ^ 0x1044E;
        PipelineManager.C[0x5398 ^ 0x5367] = 0x8E15 ^ 0x5367;
        PipelineManager.C[0xD49B ^ 0xD5C0] = 0xD5C3 ^ 0xD5C0;
        PipelineManager.C[0x5800 ^ 0x585A] = 0x587C ^ 0x585A;
        PipelineManager.C[0x338F ^ 0x32E2] = 0x32E6 ^ 0x32E2;
        PipelineManager.C[0x29BB ^ 0x293C] = 0xFFFFC260 ^ 0x293C;
        PipelineManager.C[0xC1C0 ^ 0xC120] = 0x9C5C ^ 0xC120;
        PipelineManager.C[0x7E70 ^ 0x7E78] = 0xFFFF81DD ^ 0x7E78;
        PipelineManager.C[0x37AE ^ 0x36BD] = 0x8837 ^ 0x36BD;
        PipelineManager.C[0xA9C6 ^ 0xA923] = 0xA382 ^ 0xA923;
        PipelineManager.C[0x10C4E ^ 0x10CC3] = 0x1270B ^ 0x10CC3;
        PipelineManager.C[0x54A3 ^ 0x5474] = 0x3C1F ^ 0x5474;
        PipelineManager.C[0xF7AC ^ 0xF6C4] = 0xF6F8 ^ 0xF6C4;
        PipelineManager.C[0xEBE7 ^ 0xEB33] = 0x835A ^ 0xEB33;
        PipelineManager.C[0x63E2 ^ 0x63B7] = 0xFFFF9C74 ^ 0x63B7;
        PipelineManager.C[0xB12B ^ 0xB1C6] = 0xE42C ^ 0xB1C6;
        PipelineManager.C[0x9317 ^ 0x9240] = 0x9245 ^ 0x9240;
        PipelineManager.C[0xDAA3 ^ 0xDA7C] = 0xBD78 ^ 0xDA7C;
        PipelineManager.C[0x4E5E ^ 0x4F18] = 0x4F18 ^ 0x4F18;
        PipelineManager.C[0x7DA4 ^ 0x7D95] = 0xFFFF8225 ^ 0x7D95;
        PipelineManager.C[0xCDC3 ^ 0xCD4D] = 0xE687 ^ 0xCD4D;
        PipelineManager.C[0x10AF3 ^ 0x10A50] = 0xFFFEEFDF ^ 0x10A50;
        PipelineManager.C[0x3A84 ^ 0x3A4B] = 0xD4D2 ^ 0x3A4B;
        PipelineManager.C[0xA229 ^ 0xA34F] = 0xA302 ^ 0xA34F;
        PipelineManager.C[0x8CB1 ^ 0x8DE3] = 0xCA4F ^ 0x8DE3;
        PipelineManager.C[0x10BC ^ 0x1010] = 0xB5A4 ^ 0x1010;
        PipelineManager.C[0xAC46 ^ 0xAC90] = 0xFFFF3B33 ^ 0xAC90;
        PipelineManager.C[0x8A7D ^ 0x8A7D] = 0xFFFF75A0 ^ 0x8A7D;
        PipelineManager.C[0xFB7A ^ 0xFBC7] = 0x53B2 ^ 0xFBC7;
        PipelineManager.C[0x984E ^ 0x9900] = 0x259 ^ 0x9900;
        PipelineManager.C[0xE07A ^ 0xE053] = 0xFFFF1FBC ^ 0xE053;
        PipelineManager.C[0x6F44 ^ 0x6F71] = 0x6F4E ^ 0x6F71;
        PipelineManager.C[0x4882 ^ 0x48FF] = 0x48FE ^ 0x48FF;
        PipelineManager.C[0xE0CC ^ 0xE1E4] = 0xDD41 ^ 0xE1E4;
        PipelineManager.C[0xC2AD ^ 0xC384] = 0xFF39 ^ 0xC384;
        PipelineManager.C[0x5034 ^ 0x5156] = 0x513E ^ 0x5156;
        PipelineManager.C[0x5DB8 ^ 0x5D6A] = 0xD1D1 ^ 0x5D6A;
        PipelineManager.C[0xE044 ^ 0xE0DB] = 0xFFFF9F1C ^ 0xE0DB;
        PipelineManager.C[0x630A ^ 0x63B3] = 0xDFB4 ^ 0x63B3;
        PipelineManager.C[0x2966 ^ 0x28E3] = 0x2D0D ^ 0x28E3;
        PipelineManager.C[0xC7D0 ^ 0xC729] = 0x25BB ^ 0xC729;
        PipelineManager.C[0x10D36 ^ 0x10D18] = 0x10D36 ^ 0x10D18;
        PipelineManager.C[0x370E ^ 0x372C] = 0x3744 ^ 0x372C;
        PipelineManager.C[0xFD45 ^ 0xFDB5] = 0xD99C ^ 0xFDB5;
        PipelineManager.C[0xD415 ^ 0xD4FD] = 0x71FA ^ 0xD4FD;
        PipelineManager.C[0xA845 ^ 0xA82E] = 0xFFFF5796 ^ 0xA82E;
        PipelineManager.C[0x7D7F ^ 0x7DD9] = 0x6B63 ^ 0x7DD9;
        PipelineManager.C[0x6A56 ^ 0x6B05] = 0xC138 ^ 0x6B05;
        PipelineManager.C[0x84CB ^ 0x8431] = 0x66C5 ^ 0x8431;
        PipelineManager.C[0x80FC ^ 0x8070] = 0x9649 ^ 0x8070;
        PipelineManager.C[0x38AC ^ 0x3888] = 0x3890 ^ 0x3888;
    }

    @Metadata(mv={2, 3, 0}, k=3, xi=48)
    public static final class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static int[] A;

        static {
            WhenMappings.a();
            int[] nArray = new int[RenderIn.values().length];
            try {
                int n2 = A[0];
                n2 ^= A[1];
                nArray[RenderIn.HUD.ordinal()] = n2 += A[2];
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                int n3 = A[3];
                n3 += A[4];
                nArray[RenderIn.GUI.ordinal()] = n3 -= A[5];
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                int n4 = A[6];
                n4 ^= A[7];
                nArray[RenderIn.WINDOW.ordinal()] = n4 -= A[8];
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            $EnumSwitchMapping$0 = nArray;
        }

        public static void a() {
            A = new int[0x6B5F ^ 0x6B56];
            WhenMappings.A[0x7BCF ^ 0x7BCD] = 0xFFFF842F ^ 0x7BCD;
            WhenMappings.A[0x1CE3 ^ 0x1CEB] = 0xFFFFE36A ^ 0x1CEB;
            WhenMappings.A[0x7D93 ^ 0x7D96] = 0x7DB9 ^ 0x7D96;
            WhenMappings.A[0x73D9 ^ 0x73DE] = 0xFFFF8C31 ^ 0x73DE;
            WhenMappings.A[0xC212 ^ 0xC216] = 0xFFFF3DD5 ^ 0xC216;
            WhenMappings.A[0xA9B3 ^ 0xA9B0] = 0xA9DE ^ 0xA9B0;
            WhenMappings.A[0xEB6F ^ 0xEB6F] = 0xEB23 ^ 0xEB6F;
            WhenMappings.A[0x9850 ^ 0x9856] = 0x983D ^ 0x9856;
            WhenMappings.A[0x63A4 ^ 0x63A5] = 0x63F6 ^ 0x63A5;
        }
    }
}

