/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.restrict;

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
import kotakbaz.rain.client.util.other.ServerUtil;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.B;
import kotakbaz.rain.module.setting.Setting;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u00a2\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u00a2\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u0010*\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u00a2\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\u0010*\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u00a2\u0006\u0004\b\u0014\u0010\u0015J;\u0010\u0018\u001a\u00028\u0000\"\f\b\u0000\u0010\u0010*\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u00a2\u0006\u0004\b\u0018\u0010\u0019J3\u0010\u001a\u001a\u00028\u0000\"\f\b\u0000\u0010\u0010*\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0017\u001a\u00028\u00002\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u00a2\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u00a8\u0006\u001e"}, d2={"Lkotakbaz/rain/module/restrict/FuntimeRestrict;", "", "<init>", "()V", "", "isActive", "()Z", "", "token", "Lkotlin/Function0;", "extra", "onlyOnServer", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;", "onlyOnFuntime", "(Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;", "Lkotakbaz/rain/module/Module;", "T", "module", "moduleOnServer", "(Lkotakbaz/rain/module/Module;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lkotakbaz/rain/module/Module;", "moduleOnFuntime", "(Lkotakbaz/rain/module/Module;Lkotlin/jvm/functions/Function0;)Lkotakbaz/rain/module/Module;", "Lkotakbaz/rain/module/setting/Setting;", "setting", "settingOnServer", "(Lkotakbaz/rain/module/setting/Setting;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lkotakbaz/rain/module/setting/Setting;", "settingOnFuntime", "(Lkotakbaz/rain/module/setting/Setting;Lkotlin/jvm/functions/Function0;)Lkotakbaz/rain/module/setting/Setting;", "MODULE_RESTRICTIONS_ENABLED", "Z", "rain-visuals"})
public final class FuntimeRestrict {
    @NotNull
    public static final FuntimeRestrict INSTANCE;
    private static final boolean a = true;
    private static Object[] A;
    private static Object B;
    private static Object[] c;
    private static Object[] b;
    private static Object[] C;
    public static int[] d;

    private FuntimeRestrict() {
    }

    public final boolean isActive() {
        return ServerUtil.INSTANCE.isFunTimeContext();
    }

    @NotNull
    public final Function0<Boolean> onlyOnServer(@NotNull String token, @NotNull Function0<Boolean> extra) {
        int n2 = d[0];
        n2 += d[1];
        Intrinsics.checkNotNullParameter(token, (String)A[n2 -= d[2]]);
        int n3 = d[3];
        n3 ^= d[4];
        Intrinsics.checkNotNullParameter(extra, (String)A[n3 += d[5]]);
        return () -> FuntimeRestrict.onlyOnServer$lambda$1(token, extra);
    }

    public static /* synthetic */ Function0 onlyOnServer$default(FuntimeRestrict funtimeRestrict, String string, Function0 function0, int n2, Object object) {
        int n3 = d[6];
        n3 ^= d[7];
        if ((n2 & (n3 ^= d[8])) != 0) {
            function0 = FuntimeRestrict::onlyOnServer$lambda$0;
        }
        return funtimeRestrict.onlyOnServer(string, function0);
    }

    @NotNull
    public final Function0<Boolean> onlyOnFuntime(@NotNull Function0<Boolean> extra) {
        int n2 = d[9];
        n2 ^= d[10];
        Intrinsics.checkNotNullParameter(extra, (String)A[n2 -= d[11]]);
        return () -> FuntimeRestrict.onlyOnFuntime$lambda$1(extra);
    }

    public static /* synthetic */ Function0 onlyOnFuntime$default(FuntimeRestrict funtimeRestrict, Function0 function0, int n2, Object object) {
        int n3 = d[12];
        n3 ^= d[13];
        if ((n2 & (n3 += d[14])) != 0) {
            function0 = FuntimeRestrict::onlyOnFuntime$lambda$0;
        }
        return funtimeRestrict.onlyOnFuntime(function0);
    }

    @NotNull
    public final <T extends Module> T moduleOnServer(@NotNull T module, @NotNull String token, @NotNull Function0<Boolean> extra) {
        int n2 = d[15];
        n2 += d[16];
        Intrinsics.checkNotNullParameter(module, (String)A[n2 -= d[17]]);
        int n3 = d[18];
        n3 += d[19];
        Intrinsics.checkNotNullParameter(token, (String)A[n3 ^= d[20]]);
        int n4 = d[21];
        n4 -= d[22];
        Intrinsics.checkNotNullParameter(extra, (String)A[n4 -= d[23]]);
        Function0<Boolean> function0 = this.onlyOnServer(token, extra);
        module.addVisibleInGuiCondition(function0);
        module.addAvailabilityCondition(function0);
        return module;
    }

    public static /* synthetic */ Module moduleOnServer$default(FuntimeRestrict funtimeRestrict, Module module, String string, Function0 function0, int n2, Object object) {
        int n3 = d[24];
        n3 += d[25];
        if ((n2 & (n3 -= d[26])) != 0) {
            function0 = FuntimeRestrict::moduleOnServer$lambda$0;
        }
        return funtimeRestrict.moduleOnServer(module, string, function0);
    }

    @NotNull
    public final <T extends Module> T moduleOnFuntime(@NotNull T module, @NotNull Function0<Boolean> extra) {
        int n2 = d[27];
        n2 += d[28];
        Intrinsics.checkNotNullParameter(module, (String)A[n2 += d[29]]);
        int n3 = d[30];
        n3 += d[31];
        Intrinsics.checkNotNullParameter(extra, (String)A[n3 += d[32]]);
        Function0<Boolean> function0 = this.onlyOnFuntime(extra);
        module.addVisibleInGuiCondition(function0);
        module.addAvailabilityCondition(function0);
        return module;
    }

    public static /* synthetic */ Module moduleOnFuntime$default(FuntimeRestrict funtimeRestrict, Module module, Function0 function0, int n2, Object object) {
        int n3 = d[33];
        n3 += d[34];
        if ((n2 & (n3 += d[35])) != 0) {
            function0 = FuntimeRestrict::moduleOnFuntime$lambda$0;
        }
        return funtimeRestrict.moduleOnFuntime(module, function0);
    }

    @NotNull
    public final <T extends B<?>> T settingOnServer(@NotNull T setting, @NotNull String token, @NotNull Function0<Boolean> extra) {
        int n2 = d[36];
        n2 += d[37];
        Intrinsics.checkNotNullParameter(setting, (String)A[n2 ^= d[38]]);
        int n3 = d[39];
        n3 += d[40];
        Intrinsics.checkNotNullParameter(token, (String)A[n3 += d[41]]);
        int n4 = d[42];
        n4 -= d[43];
        Intrinsics.checkNotNullParameter(extra, (String)A[n4 ^= d[44]]);
        setting.addVisibleCondition(this.onlyOnServer(token, extra));
        return setting;
    }

    public static /* synthetic */ Setting settingOnServer$default(FuntimeRestrict funtimeRestrict, Setting setting, String string, Function0 function0, int n2, Object object) {
        int n3 = d[45];
        n3 -= d[46];
        if ((n2 & (n3 += d[47])) != 0) {
            function0 = FuntimeRestrict::settingOnServer$lambda$0;
        }
        return funtimeRestrict.settingOnServer(setting, string, function0);
    }

    @NotNull
    public final <T extends B<?>> T settingOnFuntime(@NotNull T setting, @NotNull Function0<Boolean> extra) {
        int n2 = d[48];
        n2 += d[49];
        Intrinsics.checkNotNullParameter(setting, (String)A[n2 += d[50]]);
        int n3 = d[51];
        n3 += d[52];
        Intrinsics.checkNotNullParameter(extra, (String)A[n3 ^= d[53]]);
        setting.addVisibleCondition(this.onlyOnFuntime(extra));
        return setting;
    }

    public static /* synthetic */ Setting settingOnFuntime$default(FuntimeRestrict funtimeRestrict, Setting setting, Function0 function0, int n2, Object object) {
        int n3 = d[54];
        n3 -= d[55];
        if ((n2 & (n3 -= d[56])) != 0) {
            function0 = FuntimeRestrict::settingOnFuntime$lambda$0;
        }
        return funtimeRestrict.settingOnFuntime(setting, function0);
    }

    private static final boolean onlyOnServer$lambda$0() {
        boolean bl = d[57];
        bl ^= d[58];
        return bl -= d[59];
    }

    private static final boolean onlyOnServer$lambda$1(String $token, Function0 $extra) {
        int n2;
        if (ServerUtil.INSTANCE.isCurrentServerMatching($token) && ((Boolean)$extra.invoke()).booleanValue()) {
            int n3 = d[60];
            n3 ^= d[61];
            n2 = n3 -= d[62];
        } else {
            int n4 = d[63];
            n4 += d[64];
            n2 = n4 ^= d[65];
        }
        return n2 != 0;
    }

    private static final boolean onlyOnFuntime$lambda$0() {
        boolean bl = d[66];
        bl -= d[67];
        return bl ^= d[68];
    }

    private static final boolean onlyOnFuntime$lambda$1(Function0 $extra) {
        boolean bl;
        if (INSTANCE.isActive() && ((Boolean)$extra.invoke()).booleanValue()) {
            boolean bl2 = d[69];
            bl = bl2 ^= d[70];
        } else {
            boolean bl3 = d[71];
            bl3 ^= d[72];
            bl = bl3 -= d[73];
        }
        return bl;
    }

    private static final boolean moduleOnServer$lambda$0() {
        boolean bl = d[74];
        bl ^= d[75];
        return bl ^= d[76];
    }

    private static final boolean moduleOnFuntime$lambda$0() {
        boolean bl = d[77];
        bl ^= d[78];
        return bl -= d[79];
    }

    private static final boolean settingOnServer$lambda$0() {
        boolean bl = d[80];
        bl += d[81];
        return bl -= d[82];
    }

    private static final boolean settingOnFuntime$lambda$0() {
        boolean bl = d[83];
        bl += d[84];
        return bl += d[85];
    }

    static {
        FuntimeRestrict.b();
        long l2 = 4315559870110583515L;
        long l3 = -2094545803357607221L;
        long l4 = 1613012263453213396L;
        long l5 = -7351134813361504394L;
        long l6 = 2196359983924314354L;
        long l7 = 1995242460344204652L;
        long l8 = 2303897824170953668L;
        long l9 = 3752138869364683429L;
        long l10 = -1382276540991826271L;
        long l11 = 5510982088843744083L;
        long l12 = 8950038827133746907L;
        long l13 = 6454376168230181941L;
        long l14 = 3868539364816840756L;
        long l15 = -4512024337504221652L;
        int n2 = d[86];
        n2 ^= d[87];
        A = new Object[n2 ^= d[88]];
        long l16 = l15;
        int n3 = d[89];
        n3 += d[90];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= d[91]);
        Object[] objectArray = new Object[d[92]];
        objectArray[FuntimeRestrict.d[93]] = b;
        objectArray[FuntimeRestrict.d[94]] = d[95];
        int n4 = d[96];
        Object object = FuntimeRestrict.A()[d[97]];
        if (object == null) {
            char[] cArray = "\uc214\uc218\uc289\uc266\uc211\uc280\uc269\uc212\uc266\uc282\uc260\uc2a0\uc26a\uc2ae\uc24c\uc210\uc2a9\uc2b4\uc266\uc283\uc26a\uc263\uc287\uc24c\uc283\uc2a8\uc24d\uc266\uc288\uc2aa\uc287\uc260\uc24c\uc215\uc219\uc2b5\uc217\uc2b2\uc269\uc264\uc267\uc2b9\uc263\uc2a7\uc2ef\uc286\uc286\uc282\uc219\uc260\uc2a5\uc2b8\uc2a4\uc2ab\uc218\uc2b3\uc2b6\uc287\uc281\uc2b4\uc2b6\uc287\uc2b6\uc26a\uc262\uc2a9\uc2b8\uc26a\uc26a\uc212\uc214\uc212\uc286\uc2ef\uc2a5\uc2a1\uc286\uc2b8\uc219\uc287\uc210\uc2aa\uc2a2\uc24c\uc2ee\uc214\uc211\uc2a4\uc26a\uc280\uc2b5\uc2b9\uc216\uc212\uc265\uc217\uc260\uc24e\uc217\uc2b3\uc289\uc263\uc2b3\uc2ec\uc212\uc282\uc26b\uc2ed\uc2ed\uc265\uc282\uc264\uc24d\uc280\uc215\uc2b9\uc285\uc2a9\uc285\uc211\uc281\uc287\uc286\uc2b3\uc211\uc211\uc2a5\uc2b5\uc262\uc2ae\uc2ee\uc2b7\uc265\uc216\uc28a\uc281\uc24e\uc2a5\uc219\uc26a\uc2a2\uc211\uc266\uc210\uc2b6\uc282\uc2a3\uc2a4\uc285\uc2b4\uc210\uc2b9\uc2a7\uc2a0\uc28a\uc2a1\uc2a3\uc2a4\uc2a8\uc210\uc280\uc2ef\uc2a1\uc2b5\uc210\uc280\uc2a9\uc2b6\uc24c\uc28a\uc284\uc25c".toCharArray();
            for (int i2 = d[98]; i2 < d[99]; ++i2) {
                int n5 = cArray[i2];
                n5 -= d[100];
                n5 ^= d[101];
                n5 += d[102];
                n5 ^= d[103];
                n5 ^= d[104];
                n5 ^= d[105];
                n5 += d[106];
                n5 -= d[107];
                n5 ^= d[108];
                n5 ^= d[109];
                n5 ^= d[110];
                cArray[i2] = (char)(n5 += d[111]);
            }
            object = FuntimeRestrict.A()[FuntimeRestrict.d[112]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)FuntimeRestrict.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = d[113];
        n6 += d[114];
        l6 = l17 ^ (0x6100000000L ^ l17) & -1L << (n6 -= d[115]);
        long l18 = l13;
        int n7 = d[116];
        n7 ^= d[117];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 -= d[118]);
        while (true) {
            int n8 = d[119];
            n8 ^= d[120];
            if ((int)l13 >= (int)(l6 >>> (n8 += d[121]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = d[122];
            n10 += d[123];
            int n11 = d[125];
            n11 -= d[126];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 += d[124])) & -1L >>> (n11 += d[127]);
            long l20 = l9;
            int n12 = d[128];
            n12 -= d[129];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 += d[130]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = d[131];
            n14 += d[132];
            int n15 = d[134];
            n15 -= d[135];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= d[133])) & -1L >>> (n15 += d[136]);
            int n16 = d[137];
            n16 += d[138];
            long l22 = l10;
            int n17 = d[140];
            n17 -= d[141];
            l10 = l22 ^ ((long)cArray[n13] << (n16 -= d[139]) ^ l22) & -1L << (n17 += d[142]);
            int n18 = d[143];
            n18 -= d[144];
            n18 += d[145];
            int n19 = d[146];
            n19 += d[147];
            long l23 = l12;
            int n20 = d[149];
            n20 += d[150];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 += d[148]))) ^ l23) & -1L >>> (n20 += d[151]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = d[152];
            n21 -= d[153];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 ^= d[154]);
            while (true) {
                int n22 = d[155];
                n22 += d[156];
                if ((int)(l14 >>> (n22 -= d[157])) >= (int)l12) break;
                int n23 = d[158];
                n23 -= d[159];
                int n24 = d[161];
                n24 -= d[162];
                cArray2[(int)(l14 >>> (n23 ^= FuntimeRestrict.d[160]))] = cArray[(int)l13 + (int)(l14 >>> (n24 ^= d[163]))];
                l14 += 0x100000000L;
            }
            int n25 = d[164];
            n25 ^= d[165];
            int n26 = (int)(l15 >>> (n25 -= d[166]));
            l15 += 0x100000000L;
            FuntimeRestrict.A[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = d[167];
            n27 ^= d[168];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 += d[169]);
        }
        INSTANCE = new FuntimeRestrict();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[d[170]];
        String string = (String)object[d[171]];
        object = object[d[172]];
        Object[] objectArray = c;
        if (c == null) {
            objectArray = c = new Object[d[173]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[d[174]];
                b = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[d[176] ^ d[177]];
                byArray[FuntimeRestrict.d[178] ^ FuntimeRestrict.d[179]] = d[180] ^ d[181];
                byArray[FuntimeRestrict.d[182] ^ FuntimeRestrict.d[183]] = d[184] ^ d[185];
                byArray[FuntimeRestrict.d[186] ^ FuntimeRestrict.d[187]] = d[188] ^ d[189];
                byArray[FuntimeRestrict.d[190] ^ FuntimeRestrict.d[191]] = d[192] ^ d[193];
                byArray[FuntimeRestrict.d[194] ^ FuntimeRestrict.d[195]] = d[196] ^ d[197];
                byArray[FuntimeRestrict.d[198] ^ FuntimeRestrict.d[199]] = d[200] ^ d[201];
                byArray[FuntimeRestrict.d[202] ^ FuntimeRestrict.d[203]] = d[204] ^ d[205];
                byArray[FuntimeRestrict.d[206] ^ FuntimeRestrict.d[207]] = d[208] ^ d[209];
                byArray[FuntimeRestrict.d[210] ^ FuntimeRestrict.d[211]] = d[212] ^ d[213];
                byArray[FuntimeRestrict.d[214] ^ FuntimeRestrict.d[215]] = d[216] ^ d[217];
                byArray[FuntimeRestrict.d[218] ^ FuntimeRestrict.d[219]] = d[220] ^ d[221];
                byArray[FuntimeRestrict.d[222] ^ FuntimeRestrict.d[223]] = d[224] ^ d[225];
                byArray[FuntimeRestrict.d[226] ^ FuntimeRestrict.d[227]] = d[228] ^ d[229];
                byArray[FuntimeRestrict.d[230] ^ FuntimeRestrict.d[231]] = d[232] ^ d[233];
                byArray[FuntimeRestrict.d[234] ^ FuntimeRestrict.d[235]] = d[236] ^ d[237];
                byArray[FuntimeRestrict.d[238] ^ FuntimeRestrict.d[239]] = d[240] ^ d[241];
                objectArray2[FuntimeRestrict.d[175]] = byArray;
            }
            byte[] byArray = (byte[])object3[d[242]];
            if (B == null) {
                byte[] byArray2 = new byte[d[243] ^ d[244]];
                byArray2[FuntimeRestrict.d[245] ^ FuntimeRestrict.d[246]] = d[247] ^ d[248];
                byArray2[FuntimeRestrict.d[249] ^ FuntimeRestrict.d[250]] = d[251] ^ d[252];
                byArray2[FuntimeRestrict.d[253] ^ FuntimeRestrict.d[254]] = d[255] ^ d[256];
                byArray2[FuntimeRestrict.d[257] ^ FuntimeRestrict.d[258]] = d[259] ^ d[260];
                byArray2[FuntimeRestrict.d[261] ^ FuntimeRestrict.d[262]] = d[263] ^ d[264];
                byArray2[FuntimeRestrict.d[265] ^ FuntimeRestrict.d[266]] = d[267] ^ d[268];
                byArray2[FuntimeRestrict.d[269] ^ FuntimeRestrict.d[270]] = d[271] ^ d[272];
                byArray2[FuntimeRestrict.d[273] ^ FuntimeRestrict.d[274]] = d[275] ^ d[276];
                byArray2[FuntimeRestrict.d[277] ^ FuntimeRestrict.d[278]] = d[279] ^ d[280];
                byArray2[FuntimeRestrict.d[281] ^ FuntimeRestrict.d[282]] = d[283] ^ d[284];
                byArray2[FuntimeRestrict.d[285] ^ FuntimeRestrict.d[286]] = d[287] ^ d[288];
                byArray2[FuntimeRestrict.d[289] ^ FuntimeRestrict.d[290]] = d[291] ^ d[292];
                byArray2[FuntimeRestrict.d[293] ^ FuntimeRestrict.d[294]] = d[295] ^ d[296];
                byArray2[FuntimeRestrict.d[297] ^ FuntimeRestrict.d[298]] = d[299] ^ d[300];
                byArray2[FuntimeRestrict.d[301] ^ FuntimeRestrict.d[302]] = d[303] ^ d[304];
                byArray2[FuntimeRestrict.d[305] ^ FuntimeRestrict.d[306]] = d[307] ^ d[308];
                byArray2[FuntimeRestrict.d[309] ^ FuntimeRestrict.d[310]] = d[311] ^ d[312];
                byArray2[FuntimeRestrict.d[313] ^ FuntimeRestrict.d[314]] = d[315] ^ d[316];
                byArray2[FuntimeRestrict.d[317] ^ FuntimeRestrict.d[318]] = d[319] ^ d[320];
                byArray2[FuntimeRestrict.d[321] ^ FuntimeRestrict.d[322]] = d[323] ^ d[324];
                byArray2[FuntimeRestrict.d[325] ^ FuntimeRestrict.d[326]] = d[327] ^ d[328];
                byArray2[FuntimeRestrict.d[329] ^ FuntimeRestrict.d[330]] = d[331] ^ d[332];
                byArray2[FuntimeRestrict.d[333] ^ FuntimeRestrict.d[334]] = d[335] ^ d[336];
                byArray2[FuntimeRestrict.d[337] ^ FuntimeRestrict.d[338]] = d[339] ^ d[340];
                byArray2[FuntimeRestrict.d[341] ^ FuntimeRestrict.d[342]] = d[343] ^ d[344];
                byArray2[FuntimeRestrict.d[345] ^ FuntimeRestrict.d[346]] = d[347] ^ d[348];
                byArray2[FuntimeRestrict.d[349] ^ FuntimeRestrict.d[350]] = d[351] ^ d[352];
                byArray2[FuntimeRestrict.d[353] ^ FuntimeRestrict.d[354]] = d[355] ^ d[356];
                byArray2[FuntimeRestrict.d[357] ^ FuntimeRestrict.d[358]] = d[359] ^ d[360];
                byArray2[FuntimeRestrict.d[361] ^ FuntimeRestrict.d[362]] = d[363] ^ d[364];
                byArray2[FuntimeRestrict.d[365] ^ FuntimeRestrict.d[366]] = d[367] ^ d[368];
                byArray2[FuntimeRestrict.d[369] ^ FuntimeRestrict.d[370]] = d[371] ^ d[372];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, d[373], byArray3, d[374], byArray.length);
                System.arraycopy(byArray2, d[375], byArray3, byArray.length, byArray2.length);
                Object object4 = FuntimeRestrict.A()[d[376]];
                if (object4 == null) {
                    char[] cArray = "\u3ebe\u3fa4\u3ebd\u3faa\u3fb0\u3f94\u3ec1\u3ec7\u3dda\u3ec6\u3fa6\u3de3\u3ecf\u3ec5\u3fb5\u3fa6\u3faf\u3f9f".toCharArray();
                    for (int i2 = d[377]; i2 < d[378]; ++i2) {
                        int n3 = cArray[i2];
                        n3 += d[379];
                        n3 ^= d[380];
                        n3 += d[381];
                        n3 ^= d[382];
                        n3 -= d[383];
                        n3 += d[384];
                        n3 += d[385];
                        n3 -= d[386];
                        n3 -= d[387];
                        n3 -= d[388];
                        n3 -= d[389];
                        n3 += d[390];
                        n3 += d[391];
                        cArray[i2] = (char)(n3 += d[392]);
                    }
                    object4 = FuntimeRestrict.A()[FuntimeRestrict.d[393]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[d[394]];
                byArray4[FuntimeRestrict.d[395]] = d[396];
                byArray4[FuntimeRestrict.d[397]] = d[398];
                byArray4[FuntimeRestrict.d[399]] = -126;
                byArray4[9] = -11;
                byArray4[14] = -19;
                byArray4[2] = -83;
                byArray4[15] = -121;
                byArray4[1] = 39;
                byArray4[12] = 8;
                byArray4[6] = -12;
                byArray4[4] = -110;
                byArray4[8] = -68;
                byArray4[5] = 64;
                byArray4[7] = 73;
                byArray4[10] = 85;
                byArray4[0] = 107;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 22, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = FuntimeRestrict.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u5edd\u5ea9\u5ed3".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= 4449;
                        n4 += 45713;
                        n4 -= 1748;
                        n4 ^= 0xDBF5;
                        n4 ^= 0x7E16;
                        n4 -= 15416;
                        n4 -= 58105;
                        n4 ^= 0x9E39;
                        n4 += 5500;
                        cArray[i3] = (char)(n4 ^= 0xB94D);
                    }
                    object5 = FuntimeRestrict.A()[2] = new String(cArray);
                }
                B = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = FuntimeRestrict.A()[3];
            if (object6 == null) {
                char[] cArray = "\uba9c\uba88\uba76\uba2a\uba86\ubaa5\uba86\uba2a\uba8b\uba8e\uba86\uba76\uba98\uba8b\uba7c\uba67\uba67\uba84\uba69\uba82".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 += 17936;
                    n5 -= 4880;
                    n5 -= 12774;
                    n5 ^= 0x3AE7;
                    n5 ^= 0x1F28;
                    n5 += 54104;
                    n5 += 51129;
                    n5 += 32761;
                    n5 -= 28826;
                    n5 += 17067;
                    n5 ^= 0x67FB;
                    cArray[i4] = (char)(n5 -= 60462);
                }
                object6 = FuntimeRestrict.A()[3] = new String(cArray);
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
        d = new int[0xE1F9 ^ 0xE069];
        FuntimeRestrict.d[0x316D ^ 0x30EA] = 0x9472 ^ 0x30EA;
        FuntimeRestrict.d[0xB394 ^ 0xB3EF] = 0xB3EE ^ 0xB3EF;
        FuntimeRestrict.d[0xCDAE ^ 0xCCF9] = 0xFFFF17C3 ^ 0xCCF9;
        FuntimeRestrict.d[0x2E03 ^ 0x2F1B] = 0x895B ^ 0x2F1B;
        FuntimeRestrict.d[0x98FA ^ 0x99D2] = 0xDD2A ^ 0x99D2;
        FuntimeRestrict.d[0x163B ^ 0x168B] = 0x8B07 ^ 0x168B;
        FuntimeRestrict.d[0xF00 ^ 0xF86] = 0xFFFFF074 ^ 0xF86;
        FuntimeRestrict.d[0xFFAB ^ 0xFF71] = 0x159F ^ 0xFF71;
        FuntimeRestrict.d[0x1DDB ^ 0x1D2A] = 0x4FC3 ^ 0x1D2A;
        FuntimeRestrict.d[0xB08D ^ 0xB0B1] = 0xFFFF4F36 ^ 0xB0B1;
        FuntimeRestrict.d[0xBB4D ^ 0xBA79] = 0x15DD ^ 0xBA79;
        FuntimeRestrict.d[0x4B76 ^ 0x4A38] = 0xFCED ^ 0x4A38;
        FuntimeRestrict.d[0xDD05 ^ 0xDDBD] = 0xFFFE2209 ^ 0xDDBD;
        FuntimeRestrict.d[0xFD7A ^ 0xFDAB] = 0x8857 ^ 0xFDAB;
        FuntimeRestrict.d[0x3556 ^ 0x354D] = 0x3555 ^ 0x354D;
        FuntimeRestrict.d[0x7118 ^ 0x714E] = 0xFFFF8EB3 ^ 0x714E;
        FuntimeRestrict.d[0x8F79 ^ 0x8F14] = 0xBCE3 ^ 0x8F14;
        FuntimeRestrict.d[0xA6FD ^ 0xA6C0] = 0xA6A5 ^ 0xA6C0;
        FuntimeRestrict.d[0x6107 ^ 0x6190] = 0xFFFF9E07 ^ 0x6190;
        FuntimeRestrict.d[0x3D99 ^ 0x3DEC] = 0x3DB4 ^ 0x3DEC;
        FuntimeRestrict.d[0x1EB9 ^ 0x1FD5] = 0x1A86 ^ 0x1FD5;
        FuntimeRestrict.d[0x26CE ^ 0x278E] = 0xA011 ^ 0x278E;
        FuntimeRestrict.d[0xBF7E ^ 0xBE26] = 0x9AFD ^ 0xBE26;
        FuntimeRestrict.d[0x7B77 ^ 0x7B9A] = 0xD387 ^ 0x7B9A;
        FuntimeRestrict.d[0x1421 ^ 0x147B] = 0x143A ^ 0x147B;
        FuntimeRestrict.d[0x167A ^ 0x1693] = 0x5750 ^ 0x1693;
        FuntimeRestrict.d[0x4B13 ^ 0x4B92] = 0x4BB2 ^ 0x4B92;
        FuntimeRestrict.d[0x153C ^ 0x1522] = 0x1553 ^ 0x1522;
        FuntimeRestrict.d[0x1029F ^ 0x103E2] = 0x18284 ^ 0x103E2;
        FuntimeRestrict.d[0xF63A ^ 0xF6D5] = 0xA43C ^ 0xF6D5;
        FuntimeRestrict.d[0x4C0D ^ 0x4CA1] = 0x4CA1 ^ 0x4CA1;
        FuntimeRestrict.d[0x387 ^ 0x206] = 0xCDB5 ^ 0x206;
        FuntimeRestrict.d[0xBD25 ^ 0xBC21] = 0x8F27 ^ 0xBC21;
        FuntimeRestrict.d[0x2046 ^ 0x208D] = 0xA9E2 ^ 0x208D;
        FuntimeRestrict.d[0x9E6B ^ 0x9E01] = 0x4D57 ^ 0x9E01;
        FuntimeRestrict.d[0x25AC ^ 0x24BB] = 0x82A8 ^ 0x24BB;
        FuntimeRestrict.d[0xDEB3 ^ 0xDEAC] = 0xFFFF2117 ^ 0xDEAC;
        FuntimeRestrict.d[0xC5A9 ^ 0xC579] = 0xB0EA ^ 0xC579;
        FuntimeRestrict.d[0x7C6F ^ 0x7CDD] = 0xC1C8 ^ 0x7CDD;
        FuntimeRestrict.d[0xC461 ^ 0xC4BC] = 0x2E5F ^ 0xC4BC;
        FuntimeRestrict.d[0x49FB ^ 0x49D3] = 0x49BB ^ 0x49D3;
        FuntimeRestrict.d[0xB31F ^ 0xB21D] = 0x811B ^ 0xB21D;
        FuntimeRestrict.d[0xC017 ^ 0xC037] = 0xFFFF3FE3 ^ 0xC037;
        FuntimeRestrict.d[0xE167 ^ 0xE02A] = 0x56F2 ^ 0xE02A;
        FuntimeRestrict.d[0xA888 ^ 0xA9EF] = 0xFFFFC9EC ^ 0xA9EF;
        FuntimeRestrict.d[0x1922 ^ 0x182C] = 0xE29E ^ 0x182C;
        FuntimeRestrict.d[0xC877 ^ 0xC82B] = 0xC828 ^ 0xC82B;
        FuntimeRestrict.d[0x1FC7 ^ 0x1EAF] = 0x815E ^ 0x1EAF;
        FuntimeRestrict.d[0x10C6D ^ 0x10CAE] = 0x12A61 ^ 0x10CAE;
        FuntimeRestrict.d[0xC16F ^ 0xC142] = 0xC15B ^ 0xC142;
        FuntimeRestrict.d[0xB5CE ^ 0xB517] = 0xF655 ^ 0xB517;
        FuntimeRestrict.d[0xC63C ^ 0xC6F0] = 0xFFFFB059 ^ 0xC6F0;
        FuntimeRestrict.d[0xF232 ^ 0xF287] = 0x4F9A ^ 0xF287;
        FuntimeRestrict.d[0x38A6 ^ 0x389E] = 0x3886 ^ 0x389E;
        FuntimeRestrict.d[0xAF97 ^ 0xAEB5] = 0xE676 ^ 0xAEB5;
        FuntimeRestrict.d[0xBB4D ^ 0xBBDF] = 0xBBCE ^ 0xBBDF;
        FuntimeRestrict.d[0x117B ^ 0x1190] = 0xB98D ^ 0x1190;
        FuntimeRestrict.d[0xBBFB ^ 0xBBB7] = 0xFFFF443E ^ 0xBBB7;
        FuntimeRestrict.d[0xAEEF ^ 0xAEDB] = 0xAE9F ^ 0xAEDB;
        FuntimeRestrict.d[0x10DB7 ^ 0x10DD0] = 0x17475 ^ 0x10DD0;
        FuntimeRestrict.d[0x5300 ^ 0x53BF] = 0xD9EE ^ 0x53BF;
        FuntimeRestrict.d[0x5BF7 ^ 0x5BF8] = 0x5BD4 ^ 0x5BF8;
        FuntimeRestrict.d[0x879A ^ 0x87E3] = 0x87FD ^ 0x87E3;
        FuntimeRestrict.d[0x5DCD ^ 0x5CEE] = 0x1408 ^ 0x5CEE;
        FuntimeRestrict.d[0x6D81 ^ 0x6DB3] = 0x6D8A ^ 0x6DB3;
        FuntimeRestrict.d[0x1038C ^ 0x10344] = 0xFFFECB25 ^ 0x10344;
        FuntimeRestrict.d[0x4E4D ^ 0x4F02] = 0xF98B ^ 0x4F02;
        FuntimeRestrict.d[0xCAA8 ^ 0xCA9D] = 0xFFFF3538 ^ 0xCA9D;
        FuntimeRestrict.d[0xA4F9 ^ 0xA488] = 0xA491 ^ 0xA488;
        FuntimeRestrict.d[0xB7CB ^ 0xB714] = 0xE401 ^ 0xB714;
        FuntimeRestrict.d[0x5032 ^ 0x515D] = 0xF1B6 ^ 0x515D;
        FuntimeRestrict.d[0x29DD ^ 0x29AF] = 0xFFFFD631 ^ 0x29AF;
        FuntimeRestrict.d[0x3B76 ^ 0x3BFB] = 0x3BBB ^ 0x3BFB;
        FuntimeRestrict.d[0x3D41 ^ 0x3DBA] = 0xCF6A ^ 0x3DBA;
        FuntimeRestrict.d[0x98D7 ^ 0x989A] = 0x98F7 ^ 0x989A;
        FuntimeRestrict.d[0xA55B ^ 0xA5F3] = 0xA5AA ^ 0xA5F3;
        FuntimeRestrict.d[0xA414 ^ 0xA47B] = 0xCA34 ^ 0xA47B;
        FuntimeRestrict.d[0xD21E ^ 0xD2B0] = 0xD2B1 ^ 0xD2B0;
        FuntimeRestrict.d[0x8C5B ^ 0x8CFA] = 0xFFFF7309 ^ 0x8CFA;
        FuntimeRestrict.d[0x7B2A ^ 0x7BF2] = 0xFFFFC720 ^ 0x7BF2;
        FuntimeRestrict.d[0xABF4 ^ 0xAA96] = 0x4B2 ^ 0xAA96;
        FuntimeRestrict.d[0x10A93 ^ 0x10A20] = 0x1B73D ^ 0x10A20;
        FuntimeRestrict.d[0x100AE ^ 0x10008] = 0x10065 ^ 0x10008;
        FuntimeRestrict.d[0x1E2A ^ 0x1E62] = 0xFFFFE18F ^ 0x1E62;
        FuntimeRestrict.d[0xB7F2 ^ 0xB78C] = 0xFFFF4865 ^ 0xB78C;
        FuntimeRestrict.d[0xAC7 ^ 0xAF6] = 0xFFFFF52A ^ 0xAF6;
        FuntimeRestrict.d[0x5123 ^ 0x5049] = 0x551A ^ 0x5049;
        FuntimeRestrict.d[0xABE7 ^ 0xAB81] = 0x10D5 ^ 0xAB81;
        FuntimeRestrict.d[0x7D25 ^ 0x7D6A] = 0xFFFF82AE ^ 0x7D6A;
        FuntimeRestrict.d[0xF112 ^ 0xF1E6] = 0xDDA8 ^ 0xF1E6;
        FuntimeRestrict.d[0xCCAA ^ 0xCC3A] = 0xCC18 ^ 0xCC3A;
        FuntimeRestrict.d[0x929 ^ 0x913] = 0xFFFFF6B9 ^ 0x913;
        FuntimeRestrict.d[0x9025 ^ 0x9122] = 0xFFFF1D33 ^ 0x9122;
        FuntimeRestrict.d[0xF6DA ^ 0xF6FC] = 0xFFFF094F ^ 0xF6FC;
        FuntimeRestrict.d[0x4F1B ^ 0x4E09] = 0x700B ^ 0x4E09;
        FuntimeRestrict.d[0x63BF ^ 0x639D] = 0xFFFF9C07 ^ 0x639D;
        FuntimeRestrict.d[0x2A1D ^ 0x2A74] = 0x9C32 ^ 0x2A74;
        FuntimeRestrict.d[0xC0C4 ^ 0xC1DE] = 0x1846 ^ 0xC1DE;
        FuntimeRestrict.d[0xDC37 ^ 0xDCD9] = 0x8E36 ^ 0xDCD9;
        FuntimeRestrict.d[0xE15F ^ 0xE152] = 0xFFFF1EFC ^ 0xE152;
        FuntimeRestrict.d[0x6C48 ^ 0x6C8E] = 0x5B00 ^ 0x6C8E;
        FuntimeRestrict.d[0xEFBB ^ 0xEFF1] = 0xEFE7 ^ 0xEFF1;
        FuntimeRestrict.d[0xE4DD ^ 0xE447] = 0xE47E ^ 0xE447;
        FuntimeRestrict.d[0x58B2 ^ 0x59EE] = 0xEC5A ^ 0x59EE;
        FuntimeRestrict.d[0x430C ^ 0x43B7] = 0x9759 ^ 0x43B7;
        FuntimeRestrict.d[0x102AB ^ 0x103E8] = 0xFFFFFB31 ^ 0x103E8;
        FuntimeRestrict.d[0xEC60 ^ 0xECC9] = 0xECC4 ^ 0xECC9;
        FuntimeRestrict.d[0xEF6D ^ 0xEFE8] = 0xFFFF1048 ^ 0xEFE8;
        FuntimeRestrict.d[0x9652 ^ 0x961C] = 0xFFFF69B4 ^ 0x961C;
        FuntimeRestrict.d[0x100F2 ^ 0x100A1] = 0xFFFEFF0D ^ 0x100A1;
        FuntimeRestrict.d[0x1211 ^ 0x1328] = 0x9CB7 ^ 0x1328;
        FuntimeRestrict.d[0x4CB0 ^ 0x4C09] = 0x14C4A ^ 0x4C09;
        FuntimeRestrict.d[0x10F19 ^ 0x10E34] = 0x1B251 ^ 0x10E34;
        FuntimeRestrict.d[0x71 ^ 0x67] = 0x46 ^ 0x67;
        FuntimeRestrict.d[0xCA6A ^ 0xCAC8] = 0xFFFF3514 ^ 0xCAC8;
        FuntimeRestrict.d[0x10D2D ^ 0x10C38] = 0x1AA77 ^ 0x10C38;
        FuntimeRestrict.d[0x7B3F ^ 0x7A36] = 0xCB9E ^ 0x7A36;
        FuntimeRestrict.d[0xC7BD ^ 0xC7C2] = 0xC785 ^ 0xC7C2;
        FuntimeRestrict.d[0xCB55 ^ 0xCA1C] = 0x1C10 ^ 0xCA1C;
        FuntimeRestrict.d[0xD840 ^ 0xD8BD] = 0x76E9 ^ 0xD8BD;
        FuntimeRestrict.d[0x4D29 ^ 0x4D74] = 0x4D74 ^ 0x4D74;
        FuntimeRestrict.d[0x89C4 ^ 0x8846] = 0x15F2 ^ 0x8846;
        FuntimeRestrict.d[0x97A ^ 0x92D] = 0x949 ^ 0x92D;
        FuntimeRestrict.d[0xFC1B ^ 0xFCC9] = 0xF4EC ^ 0xFCC9;
        FuntimeRestrict.d[0xB381 ^ 0xB30F] = 0xB377 ^ 0xB30F;
        FuntimeRestrict.d[0x10D4C ^ 0x10C4C] = 0x1A206 ^ 0x10C4C;
        FuntimeRestrict.d[0xF1E4 ^ 0xF094] = 0x5030 ^ 0xF094;
        FuntimeRestrict.d[0xED05 ^ 0xED00] = 0xFFFF12EA ^ 0xED00;
        FuntimeRestrict.d[0xC677 ^ 0xC724] = 0xA034 ^ 0xC724;
        FuntimeRestrict.d[0x99D1 ^ 0x9926] = 0xF991 ^ 0x9926;
        FuntimeRestrict.d[0x7F30 ^ 0x7E6B] = 0xFFFF342F ^ 0x7E6B;
        FuntimeRestrict.d[0x9FEF ^ 0x9F6B] = 0x9F55 ^ 0x9F6B;
        FuntimeRestrict.d[0xBB97 ^ 0xBA14] = 0x3B02 ^ 0xBA14;
        FuntimeRestrict.d[0xE57D ^ 0xE55A] = 0xFFFF1AE0 ^ 0xE55A;
        FuntimeRestrict.d[0x79EC ^ 0x78FF] = 0xFFFFB93C ^ 0x78FF;
        FuntimeRestrict.d[0x482A ^ 0x495C] = 0x495C ^ 0x495C;
        FuntimeRestrict.d[0x4261 ^ 0x430F] = 0xE3AB ^ 0x430F;
        FuntimeRestrict.d[0xC05B ^ 0xC055] = 0xC03F ^ 0xC055;
        FuntimeRestrict.d[0x2F4C ^ 0x2F55] = 0xFFFFD0A9 ^ 0x2F55;
        FuntimeRestrict.d[0x3E65 ^ 0x3E3D] = 0xFFFFC1A9 ^ 0x3E3D;
        FuntimeRestrict.d[0x1E3E ^ 0x1E8A] = 0xA3FB ^ 0x1E8A;
        FuntimeRestrict.d[0x2FF4 ^ 0x2EA1] = 0xA67 ^ 0x2EA1;
        FuntimeRestrict.d[0x9EA4 ^ 0x9E6E] = 0x1703 ^ 0x9E6E;
        FuntimeRestrict.d[0x9FC6 ^ 0x9F46] = 0xFFFF6092 ^ 0x9F46;
        FuntimeRestrict.d[0xED8D ^ 0xEC82] = 0xFFFFE9CA ^ 0xEC82;
        FuntimeRestrict.d[0xAFF8 ^ 0xAE8C] = 0xACC8 ^ 0xAE8C;
        FuntimeRestrict.d[0x6B83 ^ 0x6B80] = 0x6B9B ^ 0x6B80;
        FuntimeRestrict.d[0xDECC ^ 0xDF80] = 0x987 ^ 0xDF80;
        FuntimeRestrict.d[0x1063D ^ 0x10731] = 0x1B68F ^ 0x10731;
        FuntimeRestrict.d[0xC7A7 ^ 0xC6B8] = 0xFFFE3959 ^ 0xC6B8;
        FuntimeRestrict.d[0x96A7 ^ 0x9658] = 0x3845 ^ 0x9658;
        FuntimeRestrict.d[0xB738 ^ 0xB720] = 0xFFFF48BB ^ 0xB720;
        FuntimeRestrict.d[0x229F ^ 0x2223] = 0xF6EA ^ 0x2223;
        FuntimeRestrict.d[0x208D ^ 0x2185] = 0x5200 ^ 0x2185;
        FuntimeRestrict.d[0x528F ^ 0x523E] = 0xCFA2 ^ 0x523E;
        FuntimeRestrict.d[0x19B9 ^ 0x18E6] = 0xFFFEE1D1 ^ 0x18E6;
        FuntimeRestrict.d[0x3763 ^ 0x37E4] = 0xFFFFC877 ^ 0x37E4;
        FuntimeRestrict.d[0xE128 ^ 0xE1CB] = 0xEBB6 ^ 0xE1CB;
        FuntimeRestrict.d[0xCC7C ^ 0xCC7A] = 0xCC21 ^ 0xCC7A;
        FuntimeRestrict.d[0x8736 ^ 0x865D] = 0xFFFF7CB6 ^ 0x865D;
        FuntimeRestrict.d[0xD614 ^ 0xD6AE] = 0x24B ^ 0xD6AE;
        FuntimeRestrict.d[0xD7DD ^ 0xD69F] = 0x1D1FD ^ 0xD69F;
        FuntimeRestrict.d[0x10733 ^ 0x10743] = 0x10743 ^ 0x10743;
        FuntimeRestrict.d[0xB210 ^ 0xB326] = 0x3D58 ^ 0xB326;
        FuntimeRestrict.d[0x61E4 ^ 0x6184] = 0x6186 ^ 0x6184;
        FuntimeRestrict.d[0xCC0A ^ 0xCC93] = 0xCCC7 ^ 0xCC93;
        FuntimeRestrict.d[0xF895 ^ 0xF8C4] = 0xF8F3 ^ 0xF8C4;
        FuntimeRestrict.d[0x4AEC ^ 0x4B92] = 0x3619 ^ 0x4B92;
        FuntimeRestrict.d[0x3EDD ^ 0x3FFA] = 0x7B52 ^ 0x3FFA;
        FuntimeRestrict.d[0xB2BF ^ 0xB233] = 0xFFFF4DDB ^ 0xB233;
        FuntimeRestrict.d[0x10935 ^ 0x1092F] = 0xFFFEF6BC ^ 0x1092F;
        FuntimeRestrict.d[0xEEAD ^ 0xEE38] = 0xEED8 ^ 0xEE38;
        FuntimeRestrict.d[0xF3F1 ^ 0xF3F0] = 0xF3EC ^ 0xF3F0;
        FuntimeRestrict.d[0xE9DE ^ 0xE95C] = 0xE930 ^ 0xE95C;
        FuntimeRestrict.d[0xC831 ^ 0xC8FF] = 0xBD06 ^ 0xC8FF;
        FuntimeRestrict.d[0x1621 ^ 0x1644] = 0x62A5 ^ 0x1644;
        FuntimeRestrict.d[0xBB70 ^ 0xBB79] = 0xBB78 ^ 0xBB79;
        FuntimeRestrict.d[0xDD59 ^ 0xDDC5] = 0xFFFF222A ^ 0xDDC5;
        FuntimeRestrict.d[0xDB90 ^ 0xDBED] = 0xFFFF242F ^ 0xDBED;
        FuntimeRestrict.d[0x4831 ^ 0x4894] = 0xFFFFB76E ^ 0x4894;
        FuntimeRestrict.d[0x4577 ^ 0x4589] = 0xEBC3 ^ 0x4589;
        FuntimeRestrict.d[0x416A ^ 0x41C5] = 0x41C5 ^ 0x41C5;
        FuntimeRestrict.d[0xE9AF ^ 0xE9CC] = 0xE960 ^ 0xE9CC;
        FuntimeRestrict.d[0xF261 ^ 0xF200] = 0xF200 ^ 0xF200;
        FuntimeRestrict.d[0x93C7 ^ 0x9332] = 0xF3EB ^ 0x9332;
        FuntimeRestrict.d[0xE79B ^ 0xE6FF] = 0x48DB ^ 0xE6FF;
        FuntimeRestrict.d[0xC0E7 ^ 0xC04C] = 0xC04E ^ 0xC04C;
        FuntimeRestrict.d[0x166 ^ 0xE0] = 0x8876 ^ 0xE0;
        FuntimeRestrict.d[0x5FFF ^ 0x5FDC] = 0xFFFFA015 ^ 0x5FDC;
        FuntimeRestrict.d[0xE8FC ^ 0xE8BD] = 0xE8CB ^ 0xE8BD;
        FuntimeRestrict.d[0x5406 ^ 0x540A] = 0x5433 ^ 0x540A;
        FuntimeRestrict.d[0xE946 ^ 0xE9E5] = 0xE9D2 ^ 0xE9E5;
        FuntimeRestrict.d[0x25E8 ^ 0x24D8] = 0x98AD ^ 0x24D8;
        FuntimeRestrict.d[0xB41D ^ 0xB422] = 0xB49A ^ 0xB422;
        FuntimeRestrict.d[0x5F75 ^ 0x5E0D] = 0x5E0C ^ 0x5E0D;
        FuntimeRestrict.d[0xA2E7 ^ 0xA3EC] = 0x1232 ^ 0xA3EC;
        FuntimeRestrict.d[0xF0FD ^ 0xF1CA] = 0x7FE1 ^ 0xF1CA;
        FuntimeRestrict.d[0xFE57 ^ 0xFE82] = 0xF6AB ^ 0xFE82;
        FuntimeRestrict.d[0x10DBF ^ 0x10CE5] = 0x1B951 ^ 0x10CE5;
        FuntimeRestrict.d[0xFC0D ^ 0xFC05] = 0xFC3B ^ 0xFC05;
        FuntimeRestrict.d[0x10F4D ^ 0x10F0A] = 0xFFFEF0D3 ^ 0x10F0A;
        FuntimeRestrict.d[0xDE69 ^ 0xDE50] = 0xFFFF21F5 ^ 0xDE50;
        FuntimeRestrict.d[0x7FD4 ^ 0x7F26] = 0x7F26 ^ 0x7F26;
        FuntimeRestrict.d[0x8ECD ^ 0x8E6A] = 0x8E20 ^ 0x8E6A;
        FuntimeRestrict.d[0x6611 ^ 0x6662] = 0xFFFF99F5 ^ 0x6662;
        FuntimeRestrict.d[0x29AF ^ 0x28F6] = 0x9D5D ^ 0x28F6;
        FuntimeRestrict.d[0xECC1 ^ 0xECD2] = 0xFFFF135F ^ 0xECD2;
        FuntimeRestrict.d[0x7FAD ^ 0x7E89] = 0x364A ^ 0x7E89;
        FuntimeRestrict.d[0x9024 ^ 0x9115] = 0x3EB7 ^ 0x9115;
        FuntimeRestrict.d[0x107B4 ^ 0x1068E] = 0x18900 ^ 0x1068E;
        FuntimeRestrict.d[0x35FE ^ 0x34AC] = 0x53A2 ^ 0x34AC;
        FuntimeRestrict.d[0x10D3D ^ 0x10D39] = 0x10D39 ^ 0x10D39;
        FuntimeRestrict.d[0x1D0C ^ 0x1DA8] = 0xFFFFE2DF ^ 0x1DA8;
        FuntimeRestrict.d[0xC38C ^ 0xC2DC] = 0x7409 ^ 0xC2DC;
        FuntimeRestrict.d[0xD24F ^ 0xD294] = 0x3877 ^ 0xD294;
        FuntimeRestrict.d[0x10A83 ^ 0x10BA2] = 0x14372 ^ 0x10BA2;
        FuntimeRestrict.d[0x94A ^ 0x95D] = 0x95A ^ 0x95D;
        FuntimeRestrict.d[0xA1E4 ^ 0xA14E] = 0xA14F ^ 0xA14E;
        FuntimeRestrict.d[0x2E89 ^ 0x2E1A] = 0x2E4D ^ 0x2E1A;
        FuntimeRestrict.d[0x21E6 ^ 0x2179] = 0xFFFFDEEC ^ 0x2179;
        FuntimeRestrict.d[0x7B2B ^ 0x7AAE] = 0xBA78 ^ 0x7AAE;
        FuntimeRestrict.d[0xC120 ^ 0xC0AB] = 0xC0A0 ^ 0xC0AB;
        FuntimeRestrict.d[0xFA04 ^ 0xFA5A] = 0xFA5B ^ 0xFA5A;
        FuntimeRestrict.d[0x93CD ^ 0x931E] = 0x9B37 ^ 0x931E;
        FuntimeRestrict.d[0xC0F9 ^ 0xC0F2] = 0xFFFF3F51 ^ 0xC0F2;
        FuntimeRestrict.d[0x76A ^ 0x60A] = 0x1009D ^ 0x60A;
        FuntimeRestrict.d[0xA6C ^ 0xA28] = 0xFFFFF5CB ^ 0xA28;
        FuntimeRestrict.d[0xC4A9 ^ 0xC432] = 0xFFFF3BEB ^ 0xC432;
        FuntimeRestrict.d[0xEF8E ^ 0xEFD7] = 0xEFCA ^ 0xEFD7;
        FuntimeRestrict.d[0x9335 ^ 0x9234] = 0xA135 ^ 0x9234;
        FuntimeRestrict.d[0xC9BA ^ 0xC8AC] = 0x6EEC ^ 0xC8AC;
        FuntimeRestrict.d[0x7727 ^ 0x776C] = 0xFFFF88F2 ^ 0x776C;
        FuntimeRestrict.d[0x240B ^ 0x24F3] = 0x4429 ^ 0x24F3;
        FuntimeRestrict.d[0x3E9F ^ 0x3FA7] = 0xB1D9 ^ 0x3FA7;
        FuntimeRestrict.d[0xB425 ^ 0xB571] = 0xD27F ^ 0xB571;
        FuntimeRestrict.d[0x173 ^ 0x1E7] = 0xFFFFFE5F ^ 0x1E7;
        FuntimeRestrict.d[0xEFD3 ^ 0xEEC3] = 0x1471 ^ 0xEEC3;
        FuntimeRestrict.d[0xF5AA ^ 0xF4A9] = 0xC7EF ^ 0xF4A9;
        FuntimeRestrict.d[0x44FE ^ 0x443E] = 0xFFFF31C9 ^ 0x443E;
        FuntimeRestrict.d[0x9D08 ^ 0x9C11] = 0x4589 ^ 0x9C11;
        FuntimeRestrict.d[0x4B7F ^ 0x4A63] = 0x93FB ^ 0x4A63;
        FuntimeRestrict.d[0x920 ^ 0x922] = 0x96E ^ 0x922;
        FuntimeRestrict.d[0x75D0 ^ 0x7517] = 0x429A ^ 0x7517;
        FuntimeRestrict.d[0xA64D ^ 0xA732] = 0x99FC ^ 0xA732;
        FuntimeRestrict.d[0x355A ^ 0x3429] = 0xFFFFC9AA ^ 0x3429;
        FuntimeRestrict.d[0xD7C9 ^ 0xD6A8] = 0x7884 ^ 0xD6A8;
        FuntimeRestrict.d[0xAAEF ^ 0xABD1] = 0x2C4E ^ 0xABD1;
        FuntimeRestrict.d[0xCF44 ^ 0xCFA1] = 0xC5DC ^ 0xCFA1;
        FuntimeRestrict.d[0xE5F7 ^ 0xE5A5] = 0xE5CE ^ 0xE5A5;
        FuntimeRestrict.d[0x843A ^ 0x8543] = 0x8543 ^ 0x8543;
        FuntimeRestrict.d[0xD5C5 ^ 0xD4F6] = 0x7B10 ^ 0xD4F6;
        FuntimeRestrict.d[0xBDE4 ^ 0xBD02] = 0xFCCE ^ 0xBD02;
        FuntimeRestrict.d[0x506D ^ 0x502E] = 0xFFFFAF80 ^ 0x502E;
        FuntimeRestrict.d[0x2E97 ^ 0x2E1E] = 0x2E59 ^ 0x2E1E;
        FuntimeRestrict.d[0xB284 ^ 0xB295] = 0xFFFF4D5B ^ 0xB295;
        FuntimeRestrict.d[0x548D ^ 0x54D8] = 0x54F7 ^ 0x54D8;
        FuntimeRestrict.d[0xE6F0 ^ 0xE7B8] = 0x2F48 ^ 0xE7B8;
        FuntimeRestrict.d[0x1167 ^ 0x10E3] = 0xD675 ^ 0x10E3;
        FuntimeRestrict.d[0x627F ^ 0x63F3] = 0x63DD ^ 0x63F3;
        FuntimeRestrict.d[0x6D11 ^ 0x6D3D] = 0x6D7A ^ 0x6D3D;
        FuntimeRestrict.d[0xB026 ^ 0xB11D] = 0xFFFFC162 ^ 0xB11D;
        FuntimeRestrict.d[0xC19E ^ 0xC1B1] = 0xFFFF3E73 ^ 0xC1B1;
        FuntimeRestrict.d[0x7D04 ^ 0x7DE0] = 0x77DF ^ 0x7DE0;
        FuntimeRestrict.d[0x10B3E ^ 0x10BF3] = 0x1829C ^ 0x10BF3;
        FuntimeRestrict.d[0x792E ^ 0x796B] = 0x7922 ^ 0x796B;
        FuntimeRestrict.d[0x7C39 ^ 0x7DB4] = 0x7DB7 ^ 0x7DB4;
        FuntimeRestrict.d[0x4E49 ^ 0x4EDF] = 0xFFFFB176 ^ 0x4EDF;
        FuntimeRestrict.d[0x5677 ^ 0x56B8] = 0x2344 ^ 0x56B8;
        FuntimeRestrict.d[0xE615 ^ 0xE70B] = 0x1E748 ^ 0xE70B;
        FuntimeRestrict.d[0xE0A9 ^ 0xE09A] = 0xFFFF1FF8 ^ 0xE09A;
        FuntimeRestrict.d[0x4414 ^ 0x4478] = 0xAC1F ^ 0x4478;
        FuntimeRestrict.d[0x3AF0 ^ 0x3A88] = 0x3AC5 ^ 0x3A88;
        FuntimeRestrict.d[0xE9AF ^ 0xE96D] = 0xCFA6 ^ 0xE96D;
        FuntimeRestrict.d[0x4224 ^ 0x42F2] = 0x1B7 ^ 0x42F2;
        FuntimeRestrict.d[0x53BC ^ 0x53BC] = 0x5385 ^ 0x53BC;
        FuntimeRestrict.d[0x105A ^ 0x10B2] = 0xFFFFAEEC ^ 0x10B2;
        FuntimeRestrict.d[0xC698 ^ 0xC688] = 0xFFFF3926 ^ 0xC688;
        FuntimeRestrict.d[0x101E2 ^ 0x100A7] = 0x1C843 ^ 0x100A7;
        FuntimeRestrict.d[0xD4AE ^ 0xD584] = 0x1399 ^ 0xD584;
        FuntimeRestrict.d[0xDC5F ^ 0xDC43] = 0xFFFF239F ^ 0xDC43;
        FuntimeRestrict.d[0x5BBF ^ 0x5BD7] = 0x5E2 ^ 0x5BD7;
        FuntimeRestrict.d[0xBC2F ^ 0xBC0E] = 0xBC91 ^ 0xBC0E;
        FuntimeRestrict.d[0xD644 ^ 0xD722] = 0x48D3 ^ 0xD722;
        FuntimeRestrict.d[0x505E ^ 0x5089] = 0x13CB ^ 0x5089;
        FuntimeRestrict.d[0x369A ^ 0x36CE] = 0x36E8 ^ 0x36CE;
        FuntimeRestrict.d[0xB48 ^ 0xB66] = 0xFFFFF4B1 ^ 0xB66;
        FuntimeRestrict.d[0xD8F4 ^ 0xD9C1] = 0x57B1 ^ 0xD9C1;
        FuntimeRestrict.d[0x10223 ^ 0x102A9] = 0x102AE ^ 0x102A9;
        FuntimeRestrict.d[0x2229 ^ 0x2314] = 0xA48A ^ 0x2314;
        FuntimeRestrict.d[0x837E ^ 0x8345] = 0x834B ^ 0x8345;
        FuntimeRestrict.d[0xD41F ^ 0xD4A8] = 0x1D4EB ^ 0xD4A8;
        FuntimeRestrict.d[0xACE4 ^ 0xAC1D] = 0x5EF9 ^ 0xAC1D;
        FuntimeRestrict.d[0x9AC1 ^ 0x9A21] = 0xC965 ^ 0x9A21;
        FuntimeRestrict.d[0x101DD ^ 0x10137] = 0x1A924 ^ 0x10137;
        FuntimeRestrict.d[0x7B28 ^ 0x7B01] = 0xFFFF84E7 ^ 0x7B01;
        FuntimeRestrict.d[0xDBAC ^ 0xDAD9] = 0xDAD9 ^ 0xDAD9;
        FuntimeRestrict.d[0x79B3 ^ 0x7913] = 0xFFFF86F6 ^ 0x7913;
        FuntimeRestrict.d[0x8D30 ^ 0x8CBE] = 0xFFFF7328 ^ 0x8CBE;
        FuntimeRestrict.d[0x2D9D ^ 0x2C89] = 0x128B ^ 0x2C89;
        FuntimeRestrict.d[0x4671 ^ 0x466C] = 0x4661 ^ 0x466C;
        FuntimeRestrict.d[0xEDF ^ 0xF9E] = 0x108F6 ^ 0xF9E;
        FuntimeRestrict.d[0x9412 ^ 0x9499] = 0x94B7 ^ 0x9499;
        FuntimeRestrict.d[0x1091 ^ 0x1118] = 0x1119 ^ 0x1118;
        FuntimeRestrict.d[0xE91B ^ 0xE959] = 0xFFFF16C9 ^ 0xE959;
        FuntimeRestrict.d[0x27EC ^ 0x27B7] = 0x2789 ^ 0x27B7;
        FuntimeRestrict.d[0x66A3 ^ 0x67B2] = 0x59A9 ^ 0x67B2;
        FuntimeRestrict.d[0x10D87 ^ 0x10DFB] = 0xFFFEF217 ^ 0x10DFB;
        FuntimeRestrict.d[0xB77D ^ 0xB7A9] = 0xFFFF4050 ^ 0xB7A9;
        FuntimeRestrict.d[0x6CFB ^ 0x6DD0] = 0xFFFF5476 ^ 0x6DD0;
        FuntimeRestrict.d[0xBB05 ^ 0xBA08] = 0x40A6 ^ 0xBA08;
        FuntimeRestrict.d[0xAA20 ^ 0xAB52] = 0xA916 ^ 0xAB52;
        FuntimeRestrict.d[0x41F7 ^ 0x41C7] = 0xFFFFBE35 ^ 0x41C7;
        FuntimeRestrict.d[0x164F ^ 0x1705] = 0xC102 ^ 0x1705;
        FuntimeRestrict.d[0x2A4A ^ 0x2B30] = 0x2B22 ^ 0x2B30;
        FuntimeRestrict.d[0xD78C ^ 0xD704] = 0xFFFF28C5 ^ 0xD704;
        FuntimeRestrict.d[0x9227 ^ 0x93A8] = 0x93A5 ^ 0x93A8;
        FuntimeRestrict.d[0x47F4 ^ 0x4697] = 0xE8F3 ^ 0x4697;
        FuntimeRestrict.d[0x6B72 ^ 0x6A36] = 0x16D54 ^ 0x6A36;
        FuntimeRestrict.d[0xAA16 ^ 0xAB33] = 0xEFC2 ^ 0xAB33;
        FuntimeRestrict.d[0x367E ^ 0x3699] = 0x775A ^ 0x3699;
        FuntimeRestrict.d[0xB467 ^ 0xB485] = 0xBEF2 ^ 0xB485;
        FuntimeRestrict.d[0x99C7 ^ 0x9896] = 0xFF9D ^ 0x9896;
        FuntimeRestrict.d[0x10D71 ^ 0x10D37] = 0x10D7F ^ 0x10D37;
        FuntimeRestrict.d[0x6D6D ^ 0x6C1C] = 0x6E43 ^ 0x6C1C;
        FuntimeRestrict.d[0x86A0 ^ 0x8780] = 0x187C3 ^ 0x8780;
        FuntimeRestrict.d[0x8A20 ^ 0x8B2A] = 0x3A94 ^ 0x8B2A;
        FuntimeRestrict.d[0xEB20 ^ 0xEA7E] = 0x1ECE9 ^ 0xEA7E;
        FuntimeRestrict.d[0xAB7B ^ 0xAA0C] = 0xAA0C ^ 0xAA0C;
        FuntimeRestrict.d[0xE331 ^ 0xE217] = 0xA6EF ^ 0xE217;
        FuntimeRestrict.d[0xABD6 ^ 0xABFC] = 0xABA8 ^ 0xABFC;
        FuntimeRestrict.d[0xF510 ^ 0xF574] = 0xB064 ^ 0xF574;
        FuntimeRestrict.d[0xCC05 ^ 0xCCC4] = 0x4695 ^ 0xCCC4;
        FuntimeRestrict.d[0x7A73 ^ 0x7A9F] = 0xFFFF2D0C ^ 0x7A9F;
        FuntimeRestrict.d[0xAE3F ^ 0xAE48] = 0xAE07 ^ 0xAE48;
        FuntimeRestrict.d[0x5726 ^ 0x5623] = 0x25AA ^ 0x5623;
        FuntimeRestrict.d[0x10D21 ^ 0x10D97] = 0xDD4 ^ 0x10D97;
        FuntimeRestrict.d[0x6AD9 ^ 0x6AFC] = 0xFFFF9566 ^ 0x6AFC;
        FuntimeRestrict.d[0x888F ^ 0x8851] = 0xDB45 ^ 0x8851;
        FuntimeRestrict.d[0x3DCA ^ 0x3CD1] = 0xFFFF1AF6 ^ 0x3CD1;
        FuntimeRestrict.d[0xD08D ^ 0xD051] = 0xFFFFC506 ^ 0xD051;
        FuntimeRestrict.d[0x67AD ^ 0x6722] = 0x6755 ^ 0x6722;
        FuntimeRestrict.d[0x526C ^ 0x5247] = 0x5256 ^ 0x5247;
        FuntimeRestrict.d[0x4010 ^ 0x4017] = 0x4070 ^ 0x4017;
        FuntimeRestrict.d[0x3D8D ^ 0x3D33] = 0xB76B ^ 0x3D33;
        FuntimeRestrict.d[0x10144 ^ 0x1002D] = 0x10566 ^ 0x1002D;
        FuntimeRestrict.d[0x438B ^ 0x428D] = 0x3108 ^ 0x428D;
        FuntimeRestrict.d[0x10AD ^ 0x105D] = 0x42CC ^ 0x105D;
        FuntimeRestrict.d[0x4D66 ^ 0x4D87] = 0x1E92 ^ 0x4D87;
        FuntimeRestrict.d[0xC740 ^ 0xC66F] = 0xFFFF85B8 ^ 0xC66F;
        FuntimeRestrict.d[0x10DF9 ^ 0x10DB0] = 0x10D84 ^ 0x10DB0;
        FuntimeRestrict.d[0xCB23 ^ 0xCBBB] = 0xCBD6 ^ 0xCBBB;
        FuntimeRestrict.d[0x7A26 ^ 0x7ADC] = 0x882F ^ 0x7ADC;
        FuntimeRestrict.d[0xBBF6 ^ 0xBB33] = 0x9DFC ^ 0xBB33;
        FuntimeRestrict.d[0x10C73 ^ 0x10CEE] = 0xFFFEF346 ^ 0x10CEE;
        FuntimeRestrict.d[0xDEBD ^ 0xDFFA] = 0x1729 ^ 0xDFFA;
        FuntimeRestrict.d[0x32FC ^ 0x33CE] = 0x9C6A ^ 0x33CE;
        FuntimeRestrict.d[0x10D59 ^ 0x10C1F] = 0x1C4EF ^ 0x10C1F;
        FuntimeRestrict.d[0xEDC8 ^ 0xEDB2] = 0xEDA6 ^ 0xEDB2;
        FuntimeRestrict.d[0x90EF ^ 0x906C] = 0xFFFF6F0F ^ 0x906C;
        FuntimeRestrict.d[0x1868 ^ 0x1914] = 0xE591 ^ 0x1914;
        FuntimeRestrict.d[0xDE81 ^ 0xDFAF] = 0x63DA ^ 0xDFAF;
        FuntimeRestrict.d[0x7363 ^ 0x7228] = 0xA402 ^ 0x7228;
        FuntimeRestrict.d[0xB15 ^ 0xB00] = 0xB2E ^ 0xB00;
        FuntimeRestrict.d[0xF6FE ^ 0xF7C1] = 0x7062 ^ 0xF7C1;
        FuntimeRestrict.d[0xA7C9 ^ 0xA6E5] = 0x60F8 ^ 0xA6E5;
        FuntimeRestrict.d[0x217F ^ 0x201A] = 0xBFF9 ^ 0x201A;
        FuntimeRestrict.d[0x2468 ^ 0x245F] = 0x242D ^ 0x245F;
        FuntimeRestrict.d[0xE413 ^ 0xE599] = 0xE589 ^ 0xE599;
        FuntimeRestrict.d[0x6656 ^ 0x674B] = 0x1670C ^ 0x674B;
        FuntimeRestrict.d[0x9D07 ^ 0x9D13] = 0xFFFF62D9 ^ 0x9D13;
        FuntimeRestrict.d[0xC207 ^ 0xC273] = 0xFFFF3DCA ^ 0xC273;
        FuntimeRestrict.d[0x942D ^ 0x94DB] = 0xF401 ^ 0x94DB;
        FuntimeRestrict.d[0x7632 ^ 0x765C] = 0xCDE5 ^ 0x765C;
        FuntimeRestrict.d[0x10157 ^ 0x10135] = 0x10135 ^ 0x10135;
        FuntimeRestrict.d[0x10C77 ^ 0x10C49] = 0xFFFEF3A8 ^ 0x10C49;
        FuntimeRestrict.d[0xFA ^ 6] = 0xF2F5 ^ 6;
        FuntimeRestrict.d[0xBC7B ^ 0xBC5F] = 0xBC48 ^ 0xBC5F;
        FuntimeRestrict.d[0x2B04 ^ 0x2A84] = 0x1836 ^ 0x2A84;
        FuntimeRestrict.d[0x1421 ^ 0x149C] = 0xC072 ^ 0x149C;
        FuntimeRestrict.d[0x99C8 ^ 0x9998] = 0x99AD ^ 0x9998;
        FuntimeRestrict.d[0xE0B8 ^ 0xE026] = 0xFFFF1F7C ^ 0xE026;
        FuntimeRestrict.d[0x1B2E ^ 0x1A12] = 0x959C ^ 0x1A12;
        FuntimeRestrict.d[0xF99A ^ 0xF812] = 0xB849 ^ 0xF812;
        FuntimeRestrict.d[0x10A90 ^ 0x10A9A] = 0xFFFEF535 ^ 0x10A9A;
        FuntimeRestrict.d[0xA66F ^ 0xA630] = 0xA630 ^ 0xA630;
        FuntimeRestrict.d[0x8A69 ^ 0x8AA0] = 0xBD2D ^ 0x8AA0;
        FuntimeRestrict.d[0x62AC ^ 0x62EC] = 0xFFFF9D52 ^ 0x62EC;
        FuntimeRestrict.d[0x5A2A ^ 0x5A5C] = 0xFFFFA59D ^ 0x5A5C;
        FuntimeRestrict.d[0x7697 ^ 0x77EC] = 0x4BA8 ^ 0x77EC;
        FuntimeRestrict.d[0x1549 ^ 0x1522] = 0x2344 ^ 0x1522;
        FuntimeRestrict.d[0x8301 ^ 0x83C5] = 0xFFFF5AAD ^ 0x83C5;
        FuntimeRestrict.d[0xB69E ^ 0xB633] = 0xB632 ^ 0xB633;
        FuntimeRestrict.d[0x390C ^ 0x3851] = 0x13ED3 ^ 0x3851;
        FuntimeRestrict.d[0xBF2A ^ 0xBF1C] = 0xBF90 ^ 0xBF1C;
        FuntimeRestrict.d[0xCC27 ^ 0xCC35] = 0xCC06 ^ 0xCC35;
        FuntimeRestrict.d[0x8E4B ^ 0x8F62] = 0x4965 ^ 0x8F62;
        FuntimeRestrict.d[0x45BC ^ 0x454F] = 0x6921 ^ 0x454F;
        FuntimeRestrict.d[0xAC60 ^ 0xAD0D] = 0xDAB ^ 0xAD0D;
        FuntimeRestrict.d[0xC5CB ^ 0xC55A] = 0xFFFF3AE1 ^ 0xC55A;
        FuntimeRestrict.d[0x39BE ^ 0x38E8] = 0x1C33 ^ 0x38E8;
    }
}

