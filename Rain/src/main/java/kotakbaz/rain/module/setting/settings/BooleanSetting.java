/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.setting.settings;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.module.setting.Setting;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/*
 * Signature claims super is kotakbaz.rain.module.setting.B<java.lang.Boolean>, not kotakbaz.rain.module.setting.Setting - discarding signature.
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u000b\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\b\r\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014R<\u0010\u0017\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u000b0\u0015j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u000b`\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u00a8\u0006\u0019"}, d2={"Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "Lkotakbaz/rain/module/setting/Setting;", "", "", "name", "initialValue", "<init>", "(Ljava/lang/String;Z)V", "", "toggle", "()V", "Lkotlin/Function1;", "listener", "onChange", "(Lkotlin/jvm/functions/Function1;)Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "value", "(Z)V", "Lkotlin/Function0;", "condition", "setVisible", "(Lkotlin/jvm/functions/Function0;)Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "listeners", "Ljava/util/ArrayList;", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nBooleanSetting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BooleanSetting.kt\nkotakbaz/rain/module/setting/settings/BooleanSetting\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,29:1\n1915#2,2:30\n*S KotlinDebug\n*F\n+ 1 BooleanSetting.kt\nkotakbaz/rain/module/setting/settings/BooleanSetting\n*L\n21#1:30,2\n*E\n"})
public final class BooleanSetting
extends Setting {
    @NotNull
    private final ArrayList<Function1<Boolean, Unit>> a;
    private static Object[] A;
    private static Object B;
    private static Object[] c;
    private static Object[] b;
    private static Object[] C;
    public static int[] d;

    public BooleanSetting(@NotNull String name, boolean initialValue) {
        int n2 = d[0];
        n2 += d[1];
        Intrinsics.checkNotNullParameter(name, (String)A[n2 -= d[2]]);
        super(name, initialValue);
        this.a = new ArrayList();
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ BooleanSetting(String string, boolean bl, int n2, DefaultConstructorMarker defaultConstructorMarker) {
        int n3;
        void var3_4;
        int n4 = d[3];
        n4 += d[4];
        if ((var3_4 & (n4 -= d[5])) != 0) {
            int n5 = d[6];
            n5 += d[7];
            n3 = n5 ^= d[8];
        }
        this(string, n3 != 0);
    }

    public final void toggle() {
        boolean bl;
        if (!((Boolean)this.getValue()).booleanValue()) {
            boolean bl2 = d[9];
            bl2 += d[10];
            bl = bl2 -= d[11];
        } else {
            boolean bl3 = d[12];
            bl3 ^= d[13];
            bl = bl3 ^= d[14];
        }
        this.set(bl);
    }

    @NotNull
    public final BooleanSetting onChange(@NotNull Function1<? super Boolean, Unit> listener) {
        int n2 = d[15];
        n2 += d[16];
        Intrinsics.checkNotNullParameter(listener, (String)A[n2 += d[17]]);
        ((Collection)this.a).add(listener);
        return this;
    }

    protected void onChange(boolean value2) {
        long l2 = 8026779924034517274L;
        Iterable iterable = this.a;
        long l3 = l2;
        int n2 = d[18];
        n2 += d[19];
        l2 = l3 ^ (0L ^ l3) & -1L << (n2 += d[20]);
        for (Object t2 : iterable) {
            Function1 function1 = (Function1)t2;
            long l4 = l2;
            int n3 = d[21];
            n3 -= d[22];
            l2 = l4 ^ (0L ^ l4) & -1L >>> (n3 ^= d[23]);
            function1.invoke(value2);
        }
    }

    @NotNull
    public BooleanSetting setVisible(@NotNull Function0<Boolean> condition) {
        int n2 = d[24];
        n2 += d[25];
        Intrinsics.checkNotNullParameter(condition, (String)A[n2 ^= d[26]]);
        super.setVisible(condition);
        return this;
    }

    static {
        BooleanSetting.b();
        long l2 = -7481492143194557017L;
        long l3 = 7100532326583932616L;
        long l4 = -4733042036786343295L;
        long l5 = -2125200745091662013L;
        long l6 = -3994347011061099147L;
        long l7 = 7620349851239530304L;
        long l8 = -239503033083982320L;
        long l9 = 3406338384376827037L;
        long l10 = 81317407336281469L;
        long l11 = 1202749079048055185L;
        long l12 = -8885473780009670961L;
        long l13 = -955358003400685787L;
        long l14 = -5330700182969038691L;
        long l15 = -7594620454185968925L;
        int n2 = d[27];
        n2 ^= d[28];
        A = new Object[n2 ^= d[29]];
        long l16 = l15;
        int n3 = d[30];
        n3 ^= d[31];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= d[32]);
        Object[] objectArray = new Object[d[33]];
        objectArray[BooleanSetting.d[34]] = b;
        objectArray[BooleanSetting.d[35]] = d[36];
        int n4 = d[37];
        Object object = BooleanSetting.A()[d[38]];
        if (object == null) {
            char[] cArray = "\u53f4\u543c\u53ef\u53ef\u53d9\u53e7\u53e8\u53d7\u53e6\u53f0\u53e5\u53d5\u540f\u540b\u5413\u5414\u53e8\u5413\u5408\u53fb\u543c\u5444\u53d9\u543c\u5405\u53fb\u5438\u53e4\u5412\u53fc\u5435\u53e6\u53f6\u53fb\u53fb\u53dc\u543b\u53ef\u5412\u53d6\u53fa\u53d7\u5439\u5436\u53e9\u53e4\u53ee\u5410\u53f9\u53fb\u5438\u543b\u5436\u5403\u53fa\u5413\u53f5\u53f8\u5435\u5409\u543b\u543b\u5436\u53e5".toCharArray();
            for (int i2 = d[39]; i2 < d[40]; ++i2) {
                int n5 = cArray[i2];
                n5 += d[41];
                n5 -= d[42];
                n5 -= d[43];
                n5 -= d[44];
                n5 ^= d[45];
                n5 ^= d[46];
                n5 ^= d[47];
                n5 -= d[48];
                n5 += d[49];
                cArray[i2] = (char)(n5 += d[50]);
            }
            object = BooleanSetting.A()[BooleanSetting.d[51]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)BooleanSetting.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = d[52];
        n6 += d[53];
        l6 = l17 ^ (0x1B00000000L ^ l17) & -1L << (n6 -= d[54]);
        long l18 = l13;
        int n7 = d[55];
        n7 -= d[56];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 -= d[57]);
        while (true) {
            int n8 = d[58];
            n8 -= d[59];
            if ((int)l13 >= (int)(l6 >>> (n8 -= d[60]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = d[61];
            n10 ^= d[62];
            int n11 = d[64];
            n11 ^= d[65];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 ^= d[63])) & -1L >>> (n11 -= d[66]);
            long l20 = l9;
            int n12 = d[67];
            n12 -= d[68];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 -= d[69]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = d[70];
            n14 += d[71];
            int n15 = d[73];
            n15 += d[74];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 += d[72])) & -1L >>> (n15 ^= d[75]);
            int n16 = d[76];
            n16 ^= d[77];
            long l22 = l10;
            int n17 = d[79];
            n17 ^= d[80];
            l10 = l22 ^ ((long)cArray[n13] << (n16 -= d[78]) ^ l22) & -1L << (n17 -= d[81]);
            int n18 = d[82];
            n18 -= d[83];
            n18 ^= d[84];
            int n19 = d[85];
            n19 -= d[86];
            long l23 = l12;
            int n20 = d[88];
            n20 ^= d[89];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 -= d[87]))) ^ l23) & -1L >>> (n20 += d[90]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = d[91];
            n21 += d[92];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 -= d[93]);
            while (true) {
                int n22 = d[94];
                n22 -= d[95];
                if ((int)(l14 >>> (n22 -= d[96])) >= (int)l12) break;
                int n23 = d[97];
                n23 ^= d[98];
                int n24 = d[100];
                n24 -= d[101];
                cArray2[(int)(l14 >>> (n23 += BooleanSetting.d[99]))] = cArray[(int)l13 + (int)(l14 >>> (n24 -= d[102]))];
                l14 += 0x100000000L;
            }
            int n25 = d[103];
            n25 -= d[104];
            int n26 = (int)(l15 >>> (n25 -= d[105]));
            l15 += 0x100000000L;
            BooleanSetting.A[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = d[106];
            n27 ^= d[107];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 -= d[108]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[d[109]];
        String string = (String)object[d[110]];
        object = object[d[111]];
        Object[] objectArray = c;
        if (c == null) {
            objectArray = c = new Object[d[112]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[d[113]];
                b = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[d[115] ^ d[116]];
                byArray[BooleanSetting.d[117] ^ BooleanSetting.d[118]] = d[119] ^ d[120];
                byArray[BooleanSetting.d[121] ^ BooleanSetting.d[122]] = d[123] ^ d[124];
                byArray[BooleanSetting.d[125] ^ BooleanSetting.d[126]] = d[127] ^ d[128];
                byArray[BooleanSetting.d[129] ^ BooleanSetting.d[130]] = d[131] ^ d[132];
                byArray[BooleanSetting.d[133] ^ BooleanSetting.d[134]] = d[135] ^ d[136];
                byArray[BooleanSetting.d[137] ^ BooleanSetting.d[138]] = d[139] ^ d[140];
                byArray[BooleanSetting.d[141] ^ BooleanSetting.d[142]] = d[143] ^ d[144];
                byArray[BooleanSetting.d[145] ^ BooleanSetting.d[146]] = d[147] ^ d[148];
                byArray[BooleanSetting.d[149] ^ BooleanSetting.d[150]] = d[151] ^ d[152];
                byArray[BooleanSetting.d[153] ^ BooleanSetting.d[154]] = d[155] ^ d[156];
                byArray[BooleanSetting.d[157] ^ BooleanSetting.d[158]] = d[159] ^ d[160];
                byArray[BooleanSetting.d[161] ^ BooleanSetting.d[162]] = d[163] ^ d[164];
                byArray[BooleanSetting.d[165] ^ BooleanSetting.d[166]] = d[167] ^ d[168];
                byArray[BooleanSetting.d[169] ^ BooleanSetting.d[170]] = d[171] ^ d[172];
                byArray[BooleanSetting.d[173] ^ BooleanSetting.d[174]] = d[175] ^ d[176];
                byArray[BooleanSetting.d[177] ^ BooleanSetting.d[178]] = d[179] ^ d[180];
                objectArray2[BooleanSetting.d[114]] = byArray;
            }
            byte[] byArray = (byte[])object3[d[181]];
            if (B == null) {
                byte[] byArray2 = new byte[d[182] ^ d[183]];
                byArray2[BooleanSetting.d[184] ^ BooleanSetting.d[185]] = d[186] ^ d[187];
                byArray2[BooleanSetting.d[188] ^ BooleanSetting.d[189]] = d[190] ^ d[191];
                byArray2[BooleanSetting.d[192] ^ BooleanSetting.d[193]] = d[194] ^ d[195];
                byArray2[BooleanSetting.d[196] ^ BooleanSetting.d[197]] = d[198] ^ d[199];
                byArray2[BooleanSetting.d[200] ^ BooleanSetting.d[201]] = d[202] ^ d[203];
                byArray2[BooleanSetting.d[204] ^ BooleanSetting.d[205]] = d[206] ^ d[207];
                byArray2[BooleanSetting.d[208] ^ BooleanSetting.d[209]] = d[210] ^ d[211];
                byArray2[BooleanSetting.d[212] ^ BooleanSetting.d[213]] = d[214] ^ d[215];
                byArray2[BooleanSetting.d[216] ^ BooleanSetting.d[217]] = d[218] ^ d[219];
                byArray2[BooleanSetting.d[220] ^ BooleanSetting.d[221]] = d[222] ^ d[223];
                byArray2[BooleanSetting.d[224] ^ BooleanSetting.d[225]] = d[226] ^ d[227];
                byArray2[BooleanSetting.d[228] ^ BooleanSetting.d[229]] = d[230] ^ d[231];
                byArray2[BooleanSetting.d[232] ^ BooleanSetting.d[233]] = d[234] ^ d[235];
                byArray2[BooleanSetting.d[236] ^ BooleanSetting.d[237]] = d[238] ^ d[239];
                byArray2[BooleanSetting.d[240] ^ BooleanSetting.d[241]] = d[242] ^ d[243];
                byArray2[BooleanSetting.d[244] ^ BooleanSetting.d[245]] = d[246] ^ d[247];
                byArray2[BooleanSetting.d[248] ^ BooleanSetting.d[249]] = d[250] ^ d[251];
                byArray2[BooleanSetting.d[252] ^ BooleanSetting.d[253]] = d[254] ^ d[255];
                byArray2[BooleanSetting.d[256] ^ BooleanSetting.d[257]] = d[258] ^ d[259];
                byArray2[BooleanSetting.d[260] ^ BooleanSetting.d[261]] = d[262] ^ d[263];
                byArray2[BooleanSetting.d[264] ^ BooleanSetting.d[265]] = d[266] ^ d[267];
                byArray2[BooleanSetting.d[268] ^ BooleanSetting.d[269]] = d[270] ^ d[271];
                byArray2[BooleanSetting.d[272] ^ BooleanSetting.d[273]] = d[274] ^ d[275];
                byArray2[BooleanSetting.d[276] ^ BooleanSetting.d[277]] = d[278] ^ d[279];
                byArray2[BooleanSetting.d[280] ^ BooleanSetting.d[281]] = d[282] ^ d[283];
                byArray2[BooleanSetting.d[284] ^ BooleanSetting.d[285]] = d[286] ^ d[287];
                byArray2[BooleanSetting.d[288] ^ BooleanSetting.d[289]] = d[290] ^ d[291];
                byArray2[BooleanSetting.d[292] ^ BooleanSetting.d[293]] = d[294] ^ d[295];
                byArray2[BooleanSetting.d[296] ^ BooleanSetting.d[297]] = d[298] ^ d[299];
                byArray2[BooleanSetting.d[300] ^ BooleanSetting.d[301]] = d[302] ^ d[303];
                byArray2[BooleanSetting.d[304] ^ BooleanSetting.d[305]] = d[306] ^ d[307];
                byArray2[BooleanSetting.d[308] ^ BooleanSetting.d[309]] = d[310] ^ d[311];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, d[312], byArray3, d[313], byArray.length);
                System.arraycopy(byArray2, d[314], byArray3, byArray.length, byArray2.length);
                Object object4 = BooleanSetting.A()[d[315]];
                if (object4 == null) {
                    char[] cArray = "\u4fe2\u4f24\u4fc1\u4f36\u4f28\u4f34\u4fdd\u4fcf\u4e06\u4fca\u4f2a\u4fe3\u4fd7\u4fc9\u4fd9\u4f2a\u4f37\u4fc7".toCharArray();
                    for (int i2 = d[316]; i2 < d[317]; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= d[318];
                        n3 -= d[319];
                        n3 -= d[320];
                        n3 ^= d[321];
                        n3 ^= d[322];
                        n3 ^= d[323];
                        n3 += d[324];
                        n3 += d[325];
                        n3 ^= d[326];
                        n3 ^= d[327];
                        n3 -= d[328];
                        cArray[i2] = (char)(n3 ^= d[329]);
                    }
                    object4 = BooleanSetting.A()[BooleanSetting.d[330]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[d[331]];
                byArray4[BooleanSetting.d[332]] = d[333];
                byArray4[BooleanSetting.d[334]] = d[335];
                byArray4[BooleanSetting.d[336]] = d[337];
                byArray4[BooleanSetting.d[338]] = d[339];
                byArray4[BooleanSetting.d[340]] = d[341];
                byArray4[BooleanSetting.d[342]] = d[343];
                byArray4[BooleanSetting.d[344]] = d[345];
                byArray4[BooleanSetting.d[346]] = d[347];
                byArray4[BooleanSetting.d[348]] = d[349];
                byArray4[BooleanSetting.d[350]] = d[351];
                byArray4[BooleanSetting.d[352]] = d[353];
                byArray4[BooleanSetting.d[354]] = d[355];
                byArray4[BooleanSetting.d[356]] = d[357];
                byArray4[BooleanSetting.d[358]] = d[359];
                byArray4[BooleanSetting.d[360]] = d[361];
                byArray4[BooleanSetting.d[362]] = d[363];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, d[364], d[365]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = BooleanSetting.A()[d[366]];
                if (object5 == null) {
                    char[] cArray = "\u2778\u277c\u276a".toCharArray();
                    for (int i3 = d[367]; i3 < d[368]; ++i3) {
                        int n4 = cArray[i3];
                        n4 += d[369];
                        n4 -= d[370];
                        n4 -= d[371];
                        n4 += d[372];
                        n4 ^= d[373];
                        n4 ^= d[374];
                        n4 ^= d[375];
                        n4 += d[376];
                        n4 -= d[377];
                        n4 += d[378];
                        n4 -= d[379];
                        n4 -= d[380];
                        cArray[i3] = (char)(n4 += d[381]);
                    }
                    object5 = BooleanSetting.A()[BooleanSetting.d[382]] = new String(cArray);
                }
                B = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, d[383], d[384]);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, d[385], byArray6.length);
            Object object6 = BooleanSetting.A()[d[386]];
            if (object6 == null) {
                char[] cArray = "\u726a\u7286\u7260\u7254\u7290\u7267\u7290\u7254\u7279\u7278\u7290\u7260\u7276\u7279\u728a\u7aa5\u7aa5\u7ab2\u7aab\u7aac".toCharArray();
                for (int i4 = d[387]; i4 < d[388]; ++i4) {
                    int n5 = cArray[i4];
                    n5 ^= d[389];
                    n5 -= d[390];
                    n5 ^= d[391];
                    n5 -= d[392];
                    n5 ^= d[393];
                    n5 ^= d[394];
                    n5 += d[395];
                    n5 += d[396];
                    n5 -= d[397];
                    n5 += d[398];
                    n5 += d[399];
                    cArray[i4] = (char)(n5 -= 43423);
                }
                object6 = BooleanSetting.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)B), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = C;
        if (C == null) {
            C = new Object[4];
            objectArray = C;
        }
        return objectArray;
    }

    public static void b() {
        d = new int[0x424A ^ 0x43DA];
        BooleanSetting.d[0x920B ^ 0x928E] = 0x19AB1 ^ 0x928E;
        BooleanSetting.d[0xB90D ^ 0xB99F] = 0x40B ^ 0xB99F;
        BooleanSetting.d[0xED9A ^ 0xED52] = 0x3234 ^ 0xED52;
        BooleanSetting.d[0x3807 ^ 0x38D8] = 0x15F ^ 0x38D8;
        BooleanSetting.d[0xD86D ^ 0xD8ED] = 0x4EA2 ^ 0xD8ED;
        BooleanSetting.d[0x8A41 ^ 0x8B07] = 0x667A ^ 0x8B07;
        BooleanSetting.d[0x73D ^ 0x6B8] = 0x4358 ^ 0x6B8;
        BooleanSetting.d[0xD367 ^ 0xD26F] = 0xDA12 ^ 0xD26F;
        BooleanSetting.d[0xA852 ^ 0xA951] = 0xB37A ^ 0xA951;
        BooleanSetting.d[0xBFAD ^ 0xBFFD] = 0xBF9E ^ 0xBFFD;
        BooleanSetting.d[0x3B64 ^ 0x3B25] = 0xFFFFC48E ^ 0x3B25;
        BooleanSetting.d[0x10263 ^ 0x10252] = 0x1B2CF ^ 0x10252;
        BooleanSetting.d[0x1DD1 ^ 0x1D18] = 0xC269 ^ 0x1D18;
        BooleanSetting.d[0xCB6 ^ 0xCC5] = 0xADA5 ^ 0xCC5;
        BooleanSetting.d[0x1561 ^ 0x15E6] = 0xFFFEE22A ^ 0x15E6;
        BooleanSetting.d[0x24F4 ^ 0x2465] = 0x99F6 ^ 0x2465;
        BooleanSetting.d[0xC662 ^ 0xC6C8] = 0xB58F ^ 0xC6C8;
        BooleanSetting.d[0x4FB3 ^ 0x4F6E] = 0x76E9 ^ 0x4F6E;
        BooleanSetting.d[0x1CFF ^ 0x1C77] = 0x11448 ^ 0x1C77;
        BooleanSetting.d[0xFAF ^ 0xF51] = 0xFFFF25B1 ^ 0xF51;
        BooleanSetting.d[0x7B91 ^ 0x7BF9] = 0x7BB2 ^ 0x7BF9;
        BooleanSetting.d[0x1C4C ^ 0x1CD6] = 0x1DA8 ^ 0x1CD6;
        BooleanSetting.d[0x12 ^ 0x13B] = 0x2FF8 ^ 0x13B;
        BooleanSetting.d[0x970B ^ 0x970F] = 0xFFFF68B3 ^ 0x970F;
        BooleanSetting.d[0x9535 ^ 0x95A3] = 0xBD2D ^ 0x95A3;
        BooleanSetting.d[0x8B11 ^ 0x8B08] = 0x8B2E ^ 0x8B08;
        BooleanSetting.d[0x8B4F ^ 0x8B4A] = 0x8B62 ^ 0x8B4A;
        BooleanSetting.d[0x25AC ^ 0x2559] = 0xFA2E ^ 0x2559;
        BooleanSetting.d[0x80EA ^ 0x80E1] = 0xFFFF7F1F ^ 0x80E1;
        BooleanSetting.d[0xC424 ^ 0xC49D] = 0x945A ^ 0xC49D;
        BooleanSetting.d[0x234D ^ 0x237A] = 0xFFFFDCA1 ^ 0x237A;
        BooleanSetting.d[0xD5B9 ^ 0xD521] = 0xFDAF ^ 0xD521;
        BooleanSetting.d[0x536B ^ 0x5396] = 0x86FF ^ 0x5396;
        BooleanSetting.d[0x2C64 ^ 0x2C52] = 0xFFFFD394 ^ 0x2C52;
        BooleanSetting.d[0x10987 ^ 0x10960] = 0x1ADCB ^ 0x10960;
        BooleanSetting.d[0x1F97 ^ 0x1ED9] = 0x1ED9 ^ 0x1ED9;
        BooleanSetting.d[0x66BC ^ 0x67E2] = 0x67EA ^ 0x67E2;
        BooleanSetting.d[0xC2C ^ 0xC0C] = 0xFFFFF3BF ^ 0xC0C;
        BooleanSetting.d[0xDFF7 ^ 0xDFEB] = 0xDFDE ^ 0xDFEB;
        BooleanSetting.d[0x3338 ^ 0x337D] = 0x3370 ^ 0x337D;
        BooleanSetting.d[0x68EF ^ 0x69E3] = 0xA357 ^ 0x69E3;
        BooleanSetting.d[0xE279 ^ 0xE249] = 0x18A3 ^ 0xE249;
        BooleanSetting.d[0x91F5 ^ 0x90B8] = 0x90AD ^ 0x90B8;
        BooleanSetting.d[0x9FAA ^ 0x9EE5] = 0x9EC2 ^ 0x9EE5;
        BooleanSetting.d[0xD8FE ^ 0xD9E5] = 0x57F3 ^ 0xD9E5;
        BooleanSetting.d[0x60EB ^ 0x61A1] = 0x61A0 ^ 0x61A1;
        BooleanSetting.d[0x7BE9 ^ 0x7BC4] = 0x7560 ^ 0x7BC4;
        BooleanSetting.d[0x63DD ^ 0x6305] = 0x3929 ^ 0x6305;
        BooleanSetting.d[0xA94 ^ 0xBF2] = 0xBF9 ^ 0xBF2;
        BooleanSetting.d[0x9DDD ^ 0x9CA0] = 0xFBDE ^ 0x9CA0;
        BooleanSetting.d[0xA4E4 ^ 0xA5FA] = 0xFFFF860A ^ 0xA5FA;
        BooleanSetting.d[0xA83E ^ 0xA938] = 0xFFFF994A ^ 0xA938;
        BooleanSetting.d[0x55E5 ^ 0x5545] = 0x8110 ^ 0x5545;
        BooleanSetting.d[0x9698 ^ 0x969A] = 0x968F ^ 0x969A;
        BooleanSetting.d[0x4818 ^ 0x490B] = 0x6B53 ^ 0x490B;
        BooleanSetting.d[0x79F8 ^ 0x793E] = 0xFFFFB615 ^ 0x793E;
        BooleanSetting.d[0xC39 ^ 0xC92] = 0x7FCB ^ 0xC92;
        BooleanSetting.d[0x7309 ^ 0x7234] = 0x7226 ^ 0x7234;
        BooleanSetting.d[0x6D96 ^ 0x6CB3] = 0x9CA1 ^ 0x6CB3;
        BooleanSetting.d[0x6564 ^ 0x656D] = 0x656D ^ 0x656D;
        BooleanSetting.d[0x58E8 ^ 0x5965] = 0xB28E ^ 0x5965;
        BooleanSetting.d[0x5D27 ^ 0x5D7C] = 0x5DE0 ^ 0x5D7C;
        BooleanSetting.d[0x74A9 ^ 0x74A7] = 0x7482 ^ 0x74A7;
        BooleanSetting.d[0x2056 ^ 0x20C2] = 0x9D56 ^ 0x20C2;
        BooleanSetting.d[0xB115 ^ 0xB199] = 0xF49C ^ 0xB199;
        BooleanSetting.d[0xEBD6 ^ 0xEBC8] = 0xFFFF142B ^ 0xEBC8;
        BooleanSetting.d[0xF121 ^ 0xF15F] = 0x6710 ^ 0xF15F;
        BooleanSetting.d[0xBD67 ^ 0xBD81] = 0xFFFFE6BA ^ 0xBD81;
        BooleanSetting.d[0xBAB9 ^ 0xBA63] = 0xE008 ^ 0xBA63;
        BooleanSetting.d[0xC550 ^ 0xC5CF] = 0x11A5 ^ 0xC5CF;
        BooleanSetting.d[0xE915 ^ 0xE9E9] = 0x3C94 ^ 0xE9E9;
        BooleanSetting.d[0xCA50 ^ 0xCAA8] = 0x94CD ^ 0xCAA8;
        BooleanSetting.d[0xDDA1 ^ 0xDD43] = 0xFFFF1967 ^ 0xDD43;
        BooleanSetting.d[0x81A4 ^ 0x811A] = 0x6C83 ^ 0x811A;
        BooleanSetting.d[0xBA6F ^ 0xBA90] = 0x6FF9 ^ 0xBA90;
        BooleanSetting.d[0x35DC ^ 0x3572] = 0x50F4 ^ 0x3572;
        BooleanSetting.d[0x8B70 ^ 0x8A64] = 0xCFE9 ^ 0x8A64;
        BooleanSetting.d[0x1C2D ^ 0x1D7C] = 0x1D3D ^ 0x1D7C;
        BooleanSetting.d[0x8DA2 ^ 0x8DDE] = 0x28FB ^ 0x8DDE;
        BooleanSetting.d[0x40A ^ 0x484] = 0x8BBA ^ 0x484;
        BooleanSetting.d[0x790D ^ 0x7979] = 0xD809 ^ 0x7979;
        BooleanSetting.d[0xA4D0 ^ 0xA588] = 0xA58A ^ 0xA588;
        BooleanSetting.d[0x8D61 ^ 0x8C76] = 0xC9E3 ^ 0x8C76;
        BooleanSetting.d[0xD8DA ^ 0xD8F9] = 0xD8F8 ^ 0xD8F9;
        BooleanSetting.d[0xF156 ^ 0xF112] = 0xFFFF0EB5 ^ 0xF112;
        BooleanSetting.d[0xB372 ^ 0xB276] = 0x7DF5 ^ 0xB276;
        BooleanSetting.d[0xAE05 ^ 0xAF2E] = 0x81ED ^ 0xAF2E;
        BooleanSetting.d[0x64A ^ 0x708] = 0x655F ^ 0x708;
        BooleanSetting.d[0x8F88 ^ 0x8E85] = 0x443B ^ 0x8E85;
        BooleanSetting.d[0x8341 ^ 0x836F] = 0x4916 ^ 0x836F;
        BooleanSetting.d[0xF2CC ^ 0xF3F5] = 0xF3F5 ^ 0xF3F5;
        BooleanSetting.d[0xA3F0 ^ 0xA278] = 0xDAFD ^ 0xA278;
        BooleanSetting.d[0xB322 ^ 0xB37D] = 0xB330 ^ 0xB37D;
        BooleanSetting.d[0xE9B7 ^ 0xE984] = 0xE984 ^ 0xE984;
        BooleanSetting.d[0x99B5 ^ 0x98D7] = 0x98D8 ^ 0x98D7;
        BooleanSetting.d[0x8459 ^ 0x84FE] = 0xFFFFF643 ^ 0x84FE;
        BooleanSetting.d[0x10546 ^ 0x10414] = 0x10412 ^ 0x10414;
        BooleanSetting.d[0x8614 ^ 0x86AE] = 0xD637 ^ 0x86AE;
        BooleanSetting.d[0x2974 ^ 0x290C] = 0x30A0 ^ 0x290C;
        BooleanSetting.d[0x3E33 ^ 0x3F4A] = 0x16F1 ^ 0x3F4A;
        BooleanSetting.d[0xA34D ^ 0xA35B] = 0xFFFF5CB4 ^ 0xA35B;
        BooleanSetting.d[0x6178 ^ 0x618E] = 0xFFFF4178 ^ 0x618E;
        BooleanSetting.d[0xB22F ^ 0xB22E] = 0xFFFF4DB5 ^ 0xB22E;
        BooleanSetting.d[0x827E ^ 0x834A] = 0x7BC5 ^ 0x834A;
        BooleanSetting.d[0xFD49 ^ 0xFC15] = 0xFC14 ^ 0xFC15;
        BooleanSetting.d[0x4605 ^ 0x4602] = 0xFFFFB9BD ^ 0x4602;
        BooleanSetting.d[0x779B ^ 0x7687] = 0xAAFE ^ 0x7687;
        BooleanSetting.d[0x688F ^ 0x68E0] = 0x68E0 ^ 0x68E0;
        BooleanSetting.d[0x4F2 ^ 0x5A7] = 0x5C8 ^ 0x5A7;
        BooleanSetting.d[0x6EA7 ^ 0x6E62] = 0x5EAA ^ 0x6E62;
        BooleanSetting.d[0x63B ^ 0x688] = 0xFFFFBB23 ^ 0x688;
        BooleanSetting.d[0xCCFF ^ 0xCD8B] = 0xB203 ^ 0xCD8B;
        BooleanSetting.d[0x9092 ^ 0x91A2] = 0x7E75 ^ 0x91A2;
        BooleanSetting.d[0xE2D3 ^ 0xE258] = 0xFFFF58B0 ^ 0xE258;
        BooleanSetting.d[0x2596 ^ 0x2519] = 0xAA1C ^ 0x2519;
        BooleanSetting.d[0x10A49 ^ 0x10B2A] = 0xFFFEF4A9 ^ 0x10B2A;
        BooleanSetting.d[0xFCB8 ^ 0xFCA7] = 0xFC97 ^ 0xFCA7;
        BooleanSetting.d[0xF1D8 ^ 0xF10F] = 0xB114 ^ 0xF10F;
        BooleanSetting.d[0x7B1 ^ 0x692] = 0x10543 ^ 0x692;
        BooleanSetting.d[0x4E3A ^ 0x4F4A] = 0x4F49 ^ 0x4F4A;
        BooleanSetting.d[0xD742 ^ 0xD752] = 0xD737 ^ 0xD752;
        BooleanSetting.d[0xB686 ^ 0xB6D1] = 0xFFFF4941 ^ 0xB6D1;
        BooleanSetting.d[0x10D29 ^ 0x10C58] = 0x1AAFA ^ 0x10C58;
        BooleanSetting.d[0x8423 ^ 0x84E0] = 0x9CD ^ 0x84E0;
        BooleanSetting.d[0x7FDF ^ 0x7F55] = 0x3A50 ^ 0x7F55;
        BooleanSetting.d[0xB27 ^ 0xB13] = 0xFFFFF4B7 ^ 0xB13;
        BooleanSetting.d[0x108C3 ^ 0x108E8] = 0x1C8FA ^ 0x108E8;
        BooleanSetting.d[0xE16C ^ 0xE019] = 0x1ED7 ^ 0xE019;
        BooleanSetting.d[0x7586 ^ 0x7400] = 0x75E3 ^ 0x7400;
        BooleanSetting.d[0xD45A ^ 0xD575] = 0x7ECC ^ 0xD575;
        BooleanSetting.d[0x4BFC ^ 0x4BBC] = 0xFFFFB45E ^ 0x4BBC;
        BooleanSetting.d[0x72F4 ^ 0x728B] = 0xE4BF ^ 0x728B;
        BooleanSetting.d[0x5FE2 ^ 0x5ED8] = 0x5ED8 ^ 0x5ED8;
        BooleanSetting.d[0xE2D9 ^ 0xE228] = 0x7087 ^ 0xE228;
        BooleanSetting.d[0xD218 ^ 0xD268] = 0xD269 ^ 0xD268;
        BooleanSetting.d[0xD274 ^ 0xD315] = 0xD354 ^ 0xD315;
        BooleanSetting.d[0x6220 ^ 0x6291] = 0x20AF ^ 0x6291;
        BooleanSetting.d[0x4F74 ^ 0x4E03] = 0xFB7B ^ 0x4E03;
        BooleanSetting.d[0xFF97 ^ 0xFF97] = 0xFFEC ^ 0xFF97;
        BooleanSetting.d[0x7872 ^ 0x794C] = 0xC90F ^ 0x794C;
        BooleanSetting.d[0xB71D ^ 0xB63B] = 0x466C ^ 0xB63B;
        BooleanSetting.d[0x286 ^ 0x3D1] = 0x383 ^ 0x3D1;
        BooleanSetting.d[0xFC37 ^ 0xFD59] = 0xFD5B ^ 0xFD59;
        BooleanSetting.d[0xF72A ^ 0xF70D] = 0xF70D ^ 0xF70D;
        BooleanSetting.d[0xFD0B ^ 0xFD10] = 0xFD48 ^ 0xFD10;
        BooleanSetting.d[0xD2A5 ^ 0xD393] = 0x2B5E ^ 0xD393;
        BooleanSetting.d[0xFBF0 ^ 0xFB8B] = 0x5EE3 ^ 0xFB8B;
        BooleanSetting.d[0x10B45 ^ 0x10BBE] = 0x155D0 ^ 0x10BBE;
        BooleanSetting.d[0x697D ^ 0x6806] = 0xCFB ^ 0x6806;
        BooleanSetting.d[0x659C ^ 0x64E0] = 0x391D ^ 0x64E0;
        BooleanSetting.d[0x4504 ^ 0x457D] = 0xE050 ^ 0x457D;
        BooleanSetting.d[0xC8D0 ^ 0xC957] = 0x6C42 ^ 0xC957;
        BooleanSetting.d[0xCF9A ^ 0xCFF1] = 0xFFFF3006 ^ 0xCFF1;
        BooleanSetting.d[0xF769 ^ 0xF62E] = 0x4700 ^ 0xF62E;
        BooleanSetting.d[0x11CA ^ 0x1184] = 0x11FE ^ 0x1184;
        BooleanSetting.d[0x7635 ^ 0x7725] = 0x5560 ^ 0x7725;
        BooleanSetting.d[0x1580 ^ 0x14A1] = 0x11770 ^ 0x14A1;
        BooleanSetting.d[0x1D17 ^ 0x1C73] = 0x1C7D ^ 0x1C73;
        BooleanSetting.d[0x4787 ^ 0x46C6] = 0xE310 ^ 0x46C6;
        BooleanSetting.d[0x522D ^ 0x52C3] = 0x5F0E ^ 0x52C3;
        BooleanSetting.d[0xC65F ^ 0xC616] = 0xC6A0 ^ 0xC616;
        BooleanSetting.d[0x19F6 ^ 0x1901] = 0xC676 ^ 0x1901;
        BooleanSetting.d[0xE2C2 ^ 0xE2C1] = 0xE2AF ^ 0xE2C1;
        BooleanSetting.d[0xB253 ^ 0xB214] = 0xB233 ^ 0xB214;
        BooleanSetting.d[0xF0F3 ^ 0xF044] = 0x3B4 ^ 0xF044;
        BooleanSetting.d[0x6871 ^ 0x6978] = 0x610B ^ 0x6978;
        BooleanSetting.d[0x106E7 ^ 0x107C9] = 0xFFFE53D5 ^ 0x107C9;
        BooleanSetting.d[0x101F3 ^ 0x101FF] = 0xFFFEFE14 ^ 0x101FF;
        BooleanSetting.d[0x7CED ^ 0x7C14] = 0x227A ^ 0x7C14;
        BooleanSetting.d[0x1AC ^ 0x199] = 0x1DB ^ 0x199;
        BooleanSetting.d[0x10124 ^ 0x10003] = 0x1F011 ^ 0x10003;
        BooleanSetting.d[0x4DF1 ^ 0x4D24] = 0xD3F ^ 0x4D24;
        BooleanSetting.d[0xCDE3 ^ 0xCCEC] = 0x652 ^ 0xCCEC;
        BooleanSetting.d[0xEE24 ^ 0xEE94] = 0x8B12 ^ 0xEE94;
        BooleanSetting.d[0x64D ^ 0x71E] = 0xFFFFF8EC ^ 0x71E;
        BooleanSetting.d[0x5AE7 ^ 0x5B95] = 0x1B6 ^ 0x5B95;
        BooleanSetting.d[0x2574 ^ 0x2422] = 0x2428 ^ 0x2422;
        BooleanSetting.d[0xC403 ^ 0xC44F] = 0xFFFF3B42 ^ 0xC44F;
        BooleanSetting.d[0xDE99 ^ 0xDEC0] = 0xDEC3 ^ 0xDEC0;
        BooleanSetting.d[0x9423 ^ 0x9443] = 0xFFFF6B91 ^ 0x9443;
        BooleanSetting.d[0x6C7F ^ 0x6CA6] = 0x3686 ^ 0x6CA6;
        BooleanSetting.d[0x911C ^ 0x91B9] = 0x1C9B ^ 0x91B9;
        BooleanSetting.d[0xA2BE ^ 0xA396] = 0x8D4B ^ 0xA396;
        BooleanSetting.d[0xE026 ^ 0xE00A] = 0x93A9 ^ 0xE00A;
        BooleanSetting.d[0x3FB3 ^ 0x3F1E] = 0x5A9A ^ 0x3F1E;
        BooleanSetting.d[0x10440 ^ 0x104AC] = 0x10925 ^ 0x104AC;
        BooleanSetting.d[0x1E0C ^ 0x1F8E] = 0x1F8D ^ 0x1F8E;
        BooleanSetting.d[0x8E00 ^ 0x8EBB] = 0xDE7C ^ 0x8EBB;
        BooleanSetting.d[0x8867 ^ 0x8841] = 0x8841 ^ 0x8841;
        BooleanSetting.d[0x3B19 ^ 0x3BC9] = 0x775A ^ 0x3BC9;
        BooleanSetting.d[0xAB5E ^ 0xABE6] = 0xFB25 ^ 0xABE6;
        BooleanSetting.d[0x8EBD ^ 0x8F3D] = 0x8F2D ^ 0x8F3D;
        BooleanSetting.d[0x4C91 ^ 0x4C2E] = 0xA18A ^ 0x4C2E;
        BooleanSetting.d[0xDA5 ^ 0xDAA] = 0xDA8 ^ 0xDAA;
        BooleanSetting.d[0x7C2C ^ 0x7D06] = 0xFFFFAC4A ^ 0x7D06;
        BooleanSetting.d[0x3748 ^ 0x3677] = 0x9404 ^ 0x3677;
        BooleanSetting.d[0x101EC ^ 0x10104] = 0x1249C ^ 0x10104;
        BooleanSetting.d[0x9ABC ^ 0x9BA1] = 0x47D7 ^ 0x9BA1;
        BooleanSetting.d[0x4F2B ^ 0x4E5D] = 0x7053 ^ 0x4E5D;
        BooleanSetting.d[0xDECA ^ 0xDE4E] = 0x1AB7 ^ 0xDE4E;
        BooleanSetting.d[0xE0F5 ^ 0xE059] = 0x931E ^ 0xE059;
        BooleanSetting.d[0x4BC2 ^ 0x4B8D] = 0x4BB0 ^ 0x4B8D;
        BooleanSetting.d[0x1099A ^ 0x10890] = 0xFFFEFF4C ^ 0x10890;
        BooleanSetting.d[0xFDFB ^ 0xFDE9] = 0xFDEB ^ 0xFDE9;
        BooleanSetting.d[0x63D3 ^ 0x6387] = 0xFFFF9C64 ^ 0x6387;
        BooleanSetting.d[0x448C ^ 0x446D] = 0x7FC5 ^ 0x446D;
        BooleanSetting.d[0x5BE8 ^ 0x5B0B] = 0x60A3 ^ 0x5B0B;
        BooleanSetting.d[0x10116 ^ 0x101EC] = 0x15FD1 ^ 0x101EC;
        BooleanSetting.d[0xA96F ^ 0xA85E] = 0x479A ^ 0xA85E;
        BooleanSetting.d[0x2292 ^ 0x231C] = 0xF052 ^ 0x231C;
        BooleanSetting.d[0xF27F ^ 0xF227] = 0xF235 ^ 0xF227;
        BooleanSetting.d[0xA5D ^ 0xA17] = 0xFFFFF58A ^ 0xA17;
        BooleanSetting.d[0x7E6A ^ 0x7F6F] = 0xB0F7 ^ 0x7F6F;
        BooleanSetting.d[0x12E7 ^ 0x13B7] = 0x13BA ^ 0x13B7;
        BooleanSetting.d[0x5899 ^ 0x59F4] = 0x58F4 ^ 0x59F4;
        BooleanSetting.d[0x8994 ^ 0x893D] = 0xFA7E ^ 0x893D;
        BooleanSetting.d[0x221C ^ 0x230A] = 0x66B9 ^ 0x230A;
        BooleanSetting.d[0x9B9E ^ 0x9BAC] = 0xB951 ^ 0x9BAC;
        BooleanSetting.d[0xDFA4 ^ 0xDF4D] = 0xFAD6 ^ 0xDF4D;
        BooleanSetting.d[0x40F4 ^ 0x41ED] = 0xCFFB ^ 0x41ED;
        BooleanSetting.d[0xF954 ^ 0xF9F5] = 0xC60A ^ 0xF9F5;
        BooleanSetting.d[0xFE01 ^ 0xFE6B] = 0xFFFF01E5 ^ 0xFE6B;
        BooleanSetting.d[0xF3B7 ^ 0xF3BF] = 0xFFFF0C2F ^ 0xF3BF;
        BooleanSetting.d[0xC8A1 ^ 0xC8BB] = 0xFFFF3759 ^ 0xC8BB;
        BooleanSetting.d[0x7481 ^ 0x74E3] = 0x74C2 ^ 0x74E3;
        BooleanSetting.d[0x9756 ^ 0x9745] = 0x9767 ^ 0x9745;
        BooleanSetting.d[0xB175 ^ 0xB186] = 0x2329 ^ 0xB186;
        BooleanSetting.d[0x49C6 ^ 0x498D] = 0x49FE ^ 0x498D;
        BooleanSetting.d[0x85D0 ^ 0x8494] = 0x9513 ^ 0x8494;
        BooleanSetting.d[0x3A03 ^ 0x3AB6] = 0x3AB6 ^ 0x3AB6;
        BooleanSetting.d[0x925 ^ 0x801] = 0xF813 ^ 0x801;
        BooleanSetting.d[0x9682 ^ 0x9695] = 0x96C0 ^ 0x9695;
        BooleanSetting.d[0xD85C ^ 0xD830] = 0xD869 ^ 0xD830;
        BooleanSetting.d[0x7FA8 ^ 0x7F29] = 0xBBD3 ^ 0x7F29;
        BooleanSetting.d[0x347B ^ 0x3570] = 0x3D03 ^ 0x3570;
        BooleanSetting.d[0x2A8 ^ 0x269] = 0x8F44 ^ 0x269;
        BooleanSetting.d[0xC23C ^ 0xC368] = 0xC36C ^ 0xC368;
        BooleanSetting.d[0xEAB8 ^ 0xEA6C] = 0xAA61 ^ 0xEA6C;
        BooleanSetting.d[0x7A9A ^ 0x7B80] = 0xF59C ^ 0x7B80;
        BooleanSetting.d[0x9AD7 ^ 0x9B5D] = 0xF41B ^ 0x9B5D;
        BooleanSetting.d[0xDDE5 ^ 0xDDAD] = 0xDDC4 ^ 0xDDAD;
        BooleanSetting.d[0xF28C ^ 0xF2CF] = 0xFFFF0D1B ^ 0xF2CF;
        BooleanSetting.d[0xD273 ^ 0xD259] = 0x6248 ^ 0xD259;
        BooleanSetting.d[0x76FA ^ 0x7771] = 0x1D06 ^ 0x7771;
        BooleanSetting.d[0x180D ^ 0x185F] = 0x1838 ^ 0x185F;
        BooleanSetting.d[0x10690 ^ 0x10670] = 0x13DCD ^ 0x10670;
        BooleanSetting.d[0xD9E5 ^ 0xD98B] = 0xD989 ^ 0xD98B;
        BooleanSetting.d[0x2EB1 ^ 0x2EF7] = 0xFFFFD186 ^ 0x2EF7;
        BooleanSetting.d[0xC0DC ^ 0xC1C3] = 0x1DB5 ^ 0xC1C3;
        BooleanSetting.d[0xACDA ^ 0xACA8] = 0xACA8 ^ 0xACA8;
        BooleanSetting.d[0xC0B0 ^ 0xC08F] = 0xFFFF3F53 ^ 0xC08F;
        BooleanSetting.d[0xCBD8 ^ 0xCB04] = 0xF29A ^ 0xCB04;
        BooleanSetting.d[0xB9A8 ^ 0xB9DD] = 0xA07C ^ 0xB9DD;
        BooleanSetting.d[0xB510 ^ 0xB5C3] = 0xF959 ^ 0xB5C3;
        BooleanSetting.d[0x3DA5 ^ 0x3C24] = 0x3C34 ^ 0x3C24;
        BooleanSetting.d[0x2FFD ^ 0x2EEF] = 0xFFFFF36D ^ 0x2EEF;
        BooleanSetting.d[0x6D20 ^ 0x6C53] = 0x7CF5 ^ 0x6C53;
        BooleanSetting.d[0x2373 ^ 0x2362] = 0xFFFFDCFB ^ 0x2362;
        BooleanSetting.d[0x4CAB ^ 0x4DB3] = 0xC3A3 ^ 0x4DB3;
        BooleanSetting.d[0xA4ED ^ 0xA569] = 0xA57D ^ 0xA569;
        BooleanSetting.d[0x87CA ^ 0x86F8] = 0xFFFF968D ^ 0x86F8;
        BooleanSetting.d[0x121D ^ 0x1210] = 0xFFFFEDDE ^ 0x1210;
        BooleanSetting.d[0x1B7D ^ 0x1A35] = 0xDA5B ^ 0x1A35;
        BooleanSetting.d[0xFD94 ^ 0xFD46] = 0xFFFF4E49 ^ 0xFD46;
        BooleanSetting.d[0xE854 ^ 0xE825] = 0xE824 ^ 0xE825;
        BooleanSetting.d[0x2CAB ^ 0x2CCF] = 0x2CAB ^ 0x2CCF;
        BooleanSetting.d[0xAE2E ^ 0xAEBD] = 0xFFFFEC88 ^ 0xAEBD;
        BooleanSetting.d[0x1073A ^ 0x10788] = 0x145B8 ^ 0x10788;
        BooleanSetting.d[0x155D ^ 0x1432] = 0x1432 ^ 0x1432;
        BooleanSetting.d[0xCBEB ^ 0xCBCF] = 0xCBCF ^ 0xCBCF;
        BooleanSetting.d[0xBB39 ^ 0xBBAE] = 0xFFFF6CA7 ^ 0xBBAE;
        BooleanSetting.d[0xAEBD ^ 0xAFF8] = 0x8BD4 ^ 0xAFF8;
        BooleanSetting.d[0x9A23 ^ 0x9A7F] = 0xFFFF65E3 ^ 0x9A7F;
        BooleanSetting.d[0xF3C3 ^ 0xF2FF] = 0xF2FF ^ 0xF2FF;
        BooleanSetting.d[0xC9F2 ^ 0xC8C5] = 0x3055 ^ 0xC8C5;
        BooleanSetting.d[0x239D ^ 0x22DE] = 0x6FA9 ^ 0x22DE;
        BooleanSetting.d[0xB1A ^ 0xBE8] = 0x990D ^ 0xBE8;
        BooleanSetting.d[0x3516 ^ 0x356B] = 0xA32B ^ 0x356B;
        BooleanSetting.d[0xBC9E ^ 0xBCE9] = 0xA567 ^ 0xBCE9;
        BooleanSetting.d[0xC0E ^ 0xC93] = 0xD8CA ^ 0xC93;
        BooleanSetting.d[0x712F ^ 0x70A3] = 0xF3D9 ^ 0x70A3;
        BooleanSetting.d[0x8A5 ^ 0x9A5] = 0x139E ^ 0x9A5;
        BooleanSetting.d[0x108DD ^ 0x10850] = 0x18767 ^ 0x10850;
        BooleanSetting.d[0xD809 ^ 0xD969] = 0xD96C ^ 0xD969;
        BooleanSetting.d[0xA950 ^ 0xA935] = 0xA92C ^ 0xA935;
        BooleanSetting.d[0xBF74 ^ 0xBF69] = 0xBF07 ^ 0xBF69;
        BooleanSetting.d[0x2E9 ^ 0x284] = 0x285 ^ 0x284;
        BooleanSetting.d[0x9F96 ^ 0x9F56] = 0x1269 ^ 0x9F56;
        BooleanSetting.d[0x24CC ^ 0x245C] = 0xAB62 ^ 0x245C;
        BooleanSetting.d[0x10F33 ^ 0x10E69] = 0x10E60 ^ 0x10E69;
        BooleanSetting.d[0x65D0 ^ 0x64AA] = 0x4756 ^ 0x64AA;
        BooleanSetting.d[0x100DC ^ 0x10007] = 0x15A27 ^ 0x10007;
        BooleanSetting.d[0x6970 ^ 0x690A] = 0xCC2F ^ 0x690A;
        BooleanSetting.d[0xFE46 ^ 0xFE78] = 0xFE38 ^ 0xFE78;
        BooleanSetting.d[0xDED0 ^ 0xDFF0] = 0x1DC26 ^ 0xDFF0;
        BooleanSetting.d[0x4CAD ^ 0x4CF0] = 0x4CE8 ^ 0x4CF0;
        BooleanSetting.d[0x218A ^ 0x20B9] = 0xCF7D ^ 0x20B9;
        BooleanSetting.d[0x10993 ^ 0x10987] = 0xFFFEF67B ^ 0x10987;
        BooleanSetting.d[0xE73F ^ 0xE79D] = 0xD868 ^ 0xE79D;
        BooleanSetting.d[0x5968 ^ 0x59EA] = 0x9D13 ^ 0x59EA;
        BooleanSetting.d[0x4C1C ^ 0x4D70] = 0x4D6B ^ 0x4D70;
        BooleanSetting.d[0x8025 ^ 0x801E] = 0xFFFF7F81 ^ 0x801E;
        BooleanSetting.d[0x10A9D ^ 0x10A53] = 0xFFFE548C ^ 0x10A53;
        BooleanSetting.d[0x5A8F ^ 0x5A60] = 0x57F8 ^ 0x5A60;
        BooleanSetting.d[0x824 ^ 0x8C9] = 0x551 ^ 0x8C9;
        BooleanSetting.d[0x10490 ^ 0x105F8] = 0x105F4 ^ 0x105F8;
        BooleanSetting.d[0xA10B ^ 0xA1E1] = 0xFFFF7BDE ^ 0xA1E1;
        BooleanSetting.d[0x9BA0 ^ 0x9BA6] = 0xFFFF6477 ^ 0x9BA6;
        BooleanSetting.d[0xF0C3 ^ 0xF00E] = 0x5175 ^ 0xF00E;
        BooleanSetting.d[0x4EF ^ 0x42B] = 0x34E1 ^ 0x42B;
        BooleanSetting.d[0x129F ^ 0x12F9] = 0x12D2 ^ 0x12F9;
        BooleanSetting.d[0xC801 ^ 0xC8CD] = 0x69BE ^ 0xC8CD;
        BooleanSetting.d[0xC9E3 ^ 0xC8E2] = 0xD2C9 ^ 0xC8E2;
        BooleanSetting.d[0x21E9 ^ 0x20B4] = 0xFFFFDF1F ^ 0x20B4;
        BooleanSetting.d[0x51E1 ^ 0x514E] = 0xFFFFCB33 ^ 0x514E;
        BooleanSetting.d[0x752F ^ 0x7451] = 0x7453 ^ 0x7451;
        BooleanSetting.d[0x31AF ^ 0x310C] = 0xFFFFF11D ^ 0x310C;
        BooleanSetting.d[0xC911 ^ 0xC9F5] = 0x6D5B ^ 0xC9F5;
        BooleanSetting.d[0xA0F1 ^ 0xA059] = 0x2D70 ^ 0xA059;
        BooleanSetting.d[0x3F81 ^ 0x3F1F] = 0xEB4A ^ 0x3F1F;
        BooleanSetting.d[0x390E ^ 0x388D] = 0x388D ^ 0x388D;
        BooleanSetting.d[0xC21C ^ 0xC312] = 0xFFFFF675 ^ 0xC312;
        BooleanSetting.d[0x46D5 ^ 0x47F7] = 0x1440E ^ 0x47F7;
        BooleanSetting.d[0x8E24 ^ 0x8EB1] = 0xA63E ^ 0x8EB1;
        BooleanSetting.d[0x529A ^ 0x5282] = 0xFFFFAD38 ^ 0x5282;
        BooleanSetting.d[0x28F7 ^ 0x29DA] = 0x8263 ^ 0x29DA;
        BooleanSetting.d[0x34D7 ^ 0x358C] = 0x35E2 ^ 0x358C;
        BooleanSetting.d[0x10F0C ^ 0x10E67] = 0xFFFEF1E2 ^ 0x10E67;
        BooleanSetting.d[0x5551 ^ 0x5568] = 0xFFFFAA99 ^ 0x5568;
        BooleanSetting.d[0x9E4D ^ 0x9E65] = 0x9E25 ^ 0x9E65;
        BooleanSetting.d[0x28B8 ^ 0x2877] = 0x890C ^ 0x2877;
        BooleanSetting.d[0xB4DC ^ 0xB4FE] = 0xB4FE ^ 0xB4FE;
        BooleanSetting.d[0xCACC ^ 0xCA70] = 0x27CE ^ 0xCA70;
        BooleanSetting.d[0xB1DA ^ 0xB0F6] = 0x1B53 ^ 0xB0F6;
        BooleanSetting.d[0x4E02 ^ 0x4F00] = 0x5511 ^ 0x4F00;
        BooleanSetting.d[0xA5BC ^ 0xA59D] = 0xA59E ^ 0xA59D;
        BooleanSetting.d[0x811C ^ 0x81CA] = 0xC1F2 ^ 0x81CA;
        BooleanSetting.d[0xE494 ^ 0xE5AC] = 0xE5AC ^ 0xE5AC;
        BooleanSetting.d[0x8126 ^ 0x804C] = 0x804F ^ 0x804C;
        BooleanSetting.d[0xA1CE ^ 0xA1DB] = 0xA1BF ^ 0xA1DB;
        BooleanSetting.d[0xE2B9 ^ 0xE3E6] = 0xE3AC ^ 0xE3E6;
        BooleanSetting.d[0x74A5 ^ 0x75C0] = 0x75E0 ^ 0x75C0;
        BooleanSetting.d[0x102F8 ^ 0x102F2] = 0xFFFEFD0D ^ 0x102F2;
        BooleanSetting.d[0x3F2B ^ 0x3FF5] = 0xFFFFF9D9 ^ 0x3FF5;
        BooleanSetting.d[0xF726 ^ 0xF77C] = 0xF773 ^ 0xF77C;
        BooleanSetting.d[0x3ED3 ^ 0x3E38] = 0x1BA3 ^ 0x3E38;
        BooleanSetting.d[0xC42F ^ 0xC44E] = 0xC4F9 ^ 0xC44E;
        BooleanSetting.d[0x5041 ^ 0x5126] = 0xFFFFAE93 ^ 0x5126;
        BooleanSetting.d[0x5A98 ^ 0x5A11] = 0x1F12 ^ 0x5A11;
        BooleanSetting.d[0x5E2C ^ 0x5E4F] = 0xFFFFA1C5 ^ 0x5E4F;
        BooleanSetting.d[0x4E34 ^ 0x4F7F] = 0x4F6F ^ 0x4F7F;
        BooleanSetting.d[0xF55F ^ 0xF46A] = 0xCFA ^ 0xF46A;
        BooleanSetting.d[0xF257 ^ 0xF346] = 0xD11E ^ 0xF346;
        BooleanSetting.d[0xE130 ^ 0xE161] = 0xE15F ^ 0xE161;
        BooleanSetting.d[0xE3B5 ^ 0xE3D2] = 0xE3FF ^ 0xE3D2;
        BooleanSetting.d[0x4557 ^ 0x459C] = 0x9AED ^ 0x459C;
        BooleanSetting.d[0x935E ^ 0x9226] = 0x583D ^ 0x9226;
        BooleanSetting.d[0x742B ^ 0x75A4] = 0xA50A ^ 0x75A4;
        BooleanSetting.d[0x15C9 ^ 0x15EC] = 0x15EE ^ 0x15EC;
        BooleanSetting.d[0xF629 ^ 0xF68D] = 0xC978 ^ 0xF68D;
        BooleanSetting.d[0xBCF8 ^ 0xBC7E] = 0x1B441 ^ 0xBC7E;
        BooleanSetting.d[0x164E ^ 0x1727] = 0x1729 ^ 0x1727;
        BooleanSetting.d[0x105AA ^ 0x10536] = 0x10448 ^ 0x10536;
        BooleanSetting.d[0x17F4 ^ 0x17B9] = 0xFFFFE82E ^ 0x17B9;
        BooleanSetting.d[0x5DC4 ^ 0x5DEB] = 0x11 ^ 0x5DEB;
        BooleanSetting.d[0xFB22 ^ 0xFB1E] = 0xFB70 ^ 0xFB1E;
        BooleanSetting.d[0xB77B ^ 0xB712] = 0xFFFF48D0 ^ 0xB712;
        BooleanSetting.d[0x7202 ^ 0x72A4] = 0xFF8D ^ 0x72A4;
        BooleanSetting.d[0xECB8 ^ 0xECED] = 0xFFFF132E ^ 0xECED;
        BooleanSetting.d[0x9E90 ^ 0x9EE6] = 0x874A ^ 0x9EE6;
        BooleanSetting.d[0xE32A ^ 0xE3B1] = 0xFFFF1D1D ^ 0xE3B1;
        BooleanSetting.d[0xDA9B ^ 0xDAB2] = 0x94C3 ^ 0xDAB2;
        BooleanSetting.d[0xBB69 ^ 0xBBEA] = 0x7F06 ^ 0xBBEA;
        BooleanSetting.d[0x2C8A ^ 0x2CDC] = 0x2CCF ^ 0x2CDC;
        BooleanSetting.d[0xFFC3 ^ 0xFF75] = 0xCA5 ^ 0xFF75;
        BooleanSetting.d[0x20F7 ^ 0x2007] = 0xB2A9 ^ 0x2007;
        BooleanSetting.d[0x522D ^ 0x536D] = 0x9EA9 ^ 0x536D;
        BooleanSetting.d[0xD35 ^ 0xCBC] = 0x7809 ^ 0xCBC;
        BooleanSetting.d[0xB724 ^ 0xB790] = 0xF5A0 ^ 0xB790;
        BooleanSetting.d[0x1EEC ^ 0x1ED1] = 0xFFFFE14C ^ 0x1ED1;
        BooleanSetting.d[0xF446 ^ 0xF47C] = 0xF451 ^ 0xF47C;
        BooleanSetting.d[0xECC6 ^ 0xEC7B] = 0x1DF ^ 0xEC7B;
        BooleanSetting.d[0x6529 ^ 0x6456] = 0x6456 ^ 0x6456;
        BooleanSetting.d[0x505 ^ 0x55B] = 0x564 ^ 0x55B;
        BooleanSetting.d[0x4346 ^ 0x43DF] = 0x42A4 ^ 0x43DF;
        BooleanSetting.d[0xA63B ^ 0xA700] = 0xA701 ^ 0xA700;
        BooleanSetting.d[0xD3B9 ^ 0xD2BE] = 0x1D26 ^ 0xD2BE;
        BooleanSetting.d[0xF4F0 ^ 0xF43A] = 0xFFFFD4B4 ^ 0xF43A;
        BooleanSetting.d[0xD37F ^ 0xD233] = 0xD234 ^ 0xD233;
        BooleanSetting.d[0x9F76 ^ 0x9E63] = 0xDBF6 ^ 0x9E63;
        BooleanSetting.d[0x2AA6 ^ 0x2A52] = 0xF528 ^ 0x2A52;
        BooleanSetting.d[0xE3A1 ^ 0xE363] = 0x6E2E ^ 0xE363;
        BooleanSetting.d[0xF92F ^ 0xF917] = 0xFFFF06DD ^ 0xF917;
        BooleanSetting.d[0x7E55 ^ 0x7E84] = 0x321E ^ 0x7E84;
        BooleanSetting.d[0xA8B9 ^ 0xA8EA] = 0xA89E ^ 0xA8EA;
        BooleanSetting.d[0x80BD ^ 0x80FF] = 0x80D6 ^ 0x80FF;
        BooleanSetting.d[0xE034 ^ 0xE16D] = 0xE127 ^ 0xE16D;
        BooleanSetting.d[0xCFED ^ 0xCF08] = 0x6BA3 ^ 0xCF08;
        BooleanSetting.d[0x5BB4 ^ 0x5AFD] = 0xFC03 ^ 0x5AFD;
        BooleanSetting.d[0xD9BC ^ 0xD97B] = 0xE9B3 ^ 0xD97B;
    }
}

