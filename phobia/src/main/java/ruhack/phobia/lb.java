/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_3298
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3298;

public final class lb {
    private static long[] iufc;
    private static int[] iuer;
    private static long[] iufb;
    public static final boolean c;
    private static volatile Boolean customPanorama;
    public static final int b;
    private static int[] iuep;
    public static final boolean a;
    private static final long qk = -7467463005171467815L;

    private static /* synthetic */ void iulm() {
        lb.iuep[100] = -891985199;
        lb.iuep[101] = 1907061573;
        lb.iuep[102] = -539799592;
        lb.iuep[103] = 1057328568;
        lb.iuep[104] = 13831766;
        lb.iuep[105] = -1936000377;
        lb.iuep[106] = -1092852814;
        lb.iuep[107] = 1272303322;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static boolean isBuiltinPack(class_3298 var0) {
        v0 /* !! */  = lb.qk;
        if (true) ** GOTO lbl5
        block41: while (true) {
            v0 /* !! */  = (long)(v1 - lb.iues("iujw", iufa(int ), (int)36));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1486688490: {
                    v1 = lb.iues("iujx", iufa(int ), (int)37);
                    continue block41;
                }
                case -437734971: {
                    v1 = lb.iues("iujy", iufa(int ), (int)38);
                    continue block41;
                }
                case 190986713: {
                    break block41;
                }
                case 335943304: {
                    v1 = lb.iues("iujz", iufa(int ), (int)39);
                    continue block41;
                }
            }
            break;
        }
        var4_1 = lb.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = lb.qk - lb.iues("iuka", iufa(int ), (int)40)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == lb.iues("iukb", iueo(int ), (int)85)) break;
            v2 /* !! */  = (long)lb.iues("iukc", iueo(int ), (int)86);
        }
        var3_2 /* !! */  = lb.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = lb.qk - lb.iues("iukd", iufa(int ), (int)41)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == lb.iues("iuke", iueo(int ), (int)87)) {
                var2_3 = lb.a;
                if (var4_1) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)lb.iues("iukf", iueo(int ), (int)88);
        }
        if (var2_3 || var2_3) return (boolean)lb.iues("iukg", iueo(int ), (int)89);
        v4 /* !! */  = lb.qk;
        if (true) ** GOTO lbl38
        block44: while (true) {
            v4 /* !! */  = (long)(v5 - lb.iues("iukh", iufa(int ), (int)42));
lbl38:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1891365635: {
                    v5 = lb.iues("iuki", iufa(int ), (int)43);
                    continue block44;
                }
                case 151998052: {
                    v5 = lb.iues("iukj", iufa(int ), (int)44);
                    continue block44;
                }
                case 190986713: {
                    break block44;
                }
                case 1417049982: {
                    v5 = lb.iues("iukk", iufa(int ), (int)45);
                    continue block44;
                }
            }
            break;
        }
        v6 = var0.method_45304();
        v7 /* !! */  = lb.qk;
        if (true) ** GOTO lbl55
        block45: while (true) {
            v7 /* !! */  = (long)(v8 - lb.iues("iukl", iufa(int ), (int)46));
lbl55:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case 190986713: {
                    break block45;
                }
                case 415369345: {
                    v8 = lb.iues("iukm", iufa(int ), (int)47);
                    continue block45;
                }
                case 1097613511: {
                    v8 = lb.iues("iukn", iufa(int ), (int)48);
                    continue block45;
                }
            }
            break;
        }
        var1_4 = v6.method_14409();
        if (var2_3 || var2_3) return (boolean)lb.iues("iukg", iueo(int ), (int)89);
        v9 /* !! */  = lb.qk;
        block46: while (true) {
            switch ((int)v9 /* !! */ ) {
                case 190986713: {
                    break block46;
                }
                case 1265715549: {
                    v9 /* !! */  = (long)(lb.iues("iukp", iufa(int ), (int)50) - lb.iues("iuko", iufa(int ), (int)49));
                    continue block46;
                }
            }
            break;
        }
        if ("vanilla".equals(var1_4)) ** GOTO lbl100
        if (var2_3) return (boolean)lb.iues("iukg", iueo(int ), (int)89);
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block47: while (true) {
            block72: {
                switch (cfr_temp_0 == -2147483648 ? var3_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        v10 /* !! */  = lb.qk;
                        block48: while (true) {
                            switch ((int)v10 /* !! */ ) {
                                case 190986713: {
                                    break block48;
                                }
                                case 1707138875: {
                                    v10 /* !! */  = (long)(lb.iues("iukr", iufa(int ), (int)52) - lb.iues("iukq", iufa(int ), (int)51));
                                    continue block48;
                                }
                            }
                            break;
                        }
                        if ("fabric".equals(var1_4)) ** GOTO lbl100
                        if (var2_3) return (boolean)lb.iues("iukg", iueo(int ), (int)89);
                        while (true) {
                            if ((v11 /* !! */  = (cfr_temp_3 = lb.qk - lb.iues("iuks", iufa(int ), (int)53)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v11 /* !! */  != lb.iues("iukt", iueo(int ), (int)90)) ** GOTO lbl97
                            if ("programmer_art".equals(var1_4)) {
                                break;
                            }
                            ** GOTO lbl104
lbl97:
                            // 1 sources

                            v11 /* !! */  = (long)lb.iues("iuku", iueo(int ), (int)91);
                        }
                        if (var2_3) return (boolean)lb.iues("iukg", iueo(int ), (int)89);
lbl100:
                        // 3 sources

                        if (var2_3 || var2_3) return (boolean)lb.iues("iukg", iueo(int ), (int)89);
                        v12 = lb.iues("iukv", iueo(int ), (int)92);
                        if (!var4_1) return (boolean)v12;
                        throw null;
lbl104:
                        // 1 sources

                        if (var2_3 || var2_3) {
                            return (boolean)lb.iues("iukg", iueo(int ), (int)89);
                        }
                        v12 = lb.iues("iukw", iueo(int ), (int)93);
                        return (boolean)v12;
                    }
                    case 1: {
                        var3_2 /* !! */  = (int)lb.iues("iuky", iueo(int ), (int)95);
                        cfr_temp_0 = 9;
                        if (var4_1) {
                            throw null;
                        }
                        break block72;
                    }
                    case 3: {
                        var3_2 /* !! */  = (int)lb.iues("iula", iueo(int ), (int)97);
                        cfr_temp_0 = 2;
                        if (var4_1) {
                            throw null;
                        }
                        break block72;
                    }
                    case 7: {
                        var3_2 /* !! */  = (int)lb.iues("iule", iueo(int ), (int)101);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 9: {
                        var3_2 /* !! */  = (int)lb.iues("iulg", iueo(int ), (int)103);
                        cfr_temp_0 = 2;
                        if (var4_1) {
                            throw null;
                        }
                        break block72;
                    }
                    case 10: {
                        var3_2 /* !! */  = (int)lb.iues("iulh", iueo(int ), (int)104);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 8: {
                        var3_2 /* !! */  = (int)lb.iues("iulf", iueo(int ), (int)102);
                        cfr_temp_0 = 0;
                        if (var4_1) {
                            throw null;
                        }
                        break block72;
                    }
                    case 11: {
                        var3_2 /* !! */  = (int)lb.iues("iuli", iueo(int ), (int)105);
                        cfr_temp_0 = 4;
                        if (var4_1) {
                            throw null;
                        }
                        break block72;
                    }
                    case 12: {
                        var3_2 /* !! */  = (int)lb.iues("iulj", iueo(int ), (int)106);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 4: {
                        var3_2 /* !! */  = (int)lb.iues("iulb", iueo(int ), (int)98);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 2: {
                        var3_2 /* !! */  = (int)lb.iues("iukz", iueo(int ), (int)96);
                        cfr_temp_0 = 5;
                        if (var4_1) {
                            throw null;
                        }
                        break block72;
                    }
                    case 13: {
                        var3_2 /* !! */  = (int)lb.iues("iulk", iueo(int ), (int)107);
                        if (var4_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 0: {
                        var3_2 /* !! */  = (int)lb.iues("iukx", iueo(int ), (int)94);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 5: lbl-1000:
                    // 2 sources

                    {
                        var3_2 /* !! */  = (int)lb.iues("iulc", iueo(int ), (int)99);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 6: 
                }
                ** GOTO lbl178
            }
            do {
                if (true) continue block47;
lbl178:
                // 2 sources

                var3_2 /* !! */  = (int)lb.iues("iuld", iueo(int ), (int)100);
                cfr_temp_0 = 0;
            } while (!var4_1);
            break;
        }
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean hasCustomPanorama(class_310 class_3102) {
        boolean bl2;
        block18: {
            Boolean bl3;
            while (true) {
                long l2;
                Object object;
                if ((object = (l2 = qk - lb.iues("iufv", iufa(int ), (int)8)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
                if (object == lb.iues("iufw", iueo(int ), (int)11)) break;
                object = lb.iues("iufx", iueo(int ), (int)12);
            }
            boolean bl4 = c;
            while (true) {
                long l3;
                Object object;
                if ((object = (l3 = qk - lb.iues("iufz", iufa(int ), (int)9)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
                if (object == lb.iues("iuga", iueo(int ), (int)13)) break;
                object = lb.iues("iugb", iueo(int ), (int)14);
            }
            int n2 = b;
            while (true) {
                long l4;
                Object object;
                if ((object = (l4 = qk - lb.iues("iugc", iufa(int ), (int)10)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
                if (object == lb.iues("iugd", iueo(int ), (int)15)) {
                    bl2 = a;
                    if (bl4) {
                        throw null;
                    }
                    break;
                }
                object = lb.iues("iuge", iueo(int ), (int)16);
            }
            if (bl2) return (boolean)lb.iues("iugf", iueo(int ), (int)17);
            if (bl2) return (boolean)lb.iues("iugf", iueo(int ), (int)17);
            if (class_3102 == null) {
                if (bl2) return (boolean)lb.iues("iugf", iueo(int ), (int)17);
                if (bl2) return (boolean)lb.iues("iugf", iueo(int ), (int)17);
                return (boolean)lb.iues("iugg", iueo(int ), (int)18);
            }
            if (bl2) return (boolean)lb.iues("iugf", iueo(int ), (int)17);
            if (bl2) return (boolean)lb.iues("iugf", iueo(int ), (int)17);
            while (true) {
                long l5;
                Object object;
                if ((object = (l5 = qk - lb.iues("iugh", iufa(int ), (int)11)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
                if (object == lb.iues("iugi", iueo(int ), (int)19)) {
                    bl3 = customPanorama;
                    if (bl2) return (boolean)lb.iues("iugf", iueo(int ), (int)17);
                    if (bl2) return (boolean)lb.iues("iugf", iueo(int ), (int)17);
                    if (bl3 != null) {
                        break;
                    }
                    break block18;
                }
                object = lb.iues("iugj", iueo(int ), (int)20);
            }
            if (bl2) return (boolean)lb.iues("iugf", iueo(int ), (int)17);
            if (bl2) return (boolean)lb.iues("iugf", iueo(int ), (int)17);
            while (true) {
                long l6;
                Object object;
                if ((object = (l6 = qk - lb.iues("iugl", iufa(int ), (int)12)) == 0L ? 0 : (l6 < 0L ? -1 : 1)) == false) continue;
                if (object == lb.iues("iugm", iueo(int ), (int)21)) {
                    return bl3;
                }
                object = lb.iues("iugn", iueo(int ), (int)22);
            }
        }
        if (bl2) return (boolean)lb.iues("iugf", iueo(int ), (int)17);
        if (bl2) return (boolean)lb.iues("iugf", iueo(int ), (int)17);
        while (true) {
            long l7;
            Object object;
            if ((object = (l7 = qk - lb.iues("iugo", iufa(int ), (int)13)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) == false) continue;
            if (object == lb.iues("iugp", iueo(int ), (int)23)) break;
            object = lb.iues("iugq", iueo(int ), (int)24);
        }
        boolean bl5 = lb.detect(class_3102);
        if (bl2) return (boolean)lb.iues("iugf", iueo(int ), (int)17);
        if (bl2) return (boolean)lb.iues("iugf", iueo(int ), (int)17);
        while (true) {
            long l8;
            Object object;
            if ((object = (l8 = qk - lb.iues("iugs", iufa(int ), (int)14)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) == false) continue;
            if (object == lb.iues("iugt", iueo(int ), (int)25)) break;
            object = lb.iues("iugu", iueo(int ), (int)26);
        }
        Boolean bl6 = bl5;
        Object object = qk;
        block11: while (true) {
            switch ((int)object) {
                case -1518943482: {
                    object = lb.iues("iugw", iufa(int ), (int)16) - lb.iues("iugv", iufa(int ), (int)15);
                    continue block11;
                }
                case 190986713: {
                    break block11;
                }
            }
            break;
        }
        customPanorama = bl6;
        if (bl2) return (boolean)lb.iues("iugf", iueo(int ), (int)17);
        if (bl2) return (boolean)lb.iues("iugf", iueo(int ), (int)17);
        return bl5;
    }

    private static /* synthetic */ void iulp() {
        lb.iufb[0] = 1822527145639758147L;
        lb.iufb[1] = 2620286095958878782L;
        lb.iufb[2] = -4704893469052910551L;
        lb.iufb[3] = -3867539856777451956L;
        lb.iufb[4] = -726807430488819489L;
        lb.iufb[5] = -2263189652505704294L;
        lb.iufb[6] = -3103893853341730858L;
        lb.iufb[7] = -3161396419104106582L;
        lb.iufb[8] = 6984053734966162867L;
        lb.iufb[9] = 2370250107402241502L;
        lb.iufb[10] = -2346318042227996100L;
        lb.iufb[11] = -2556614898851513003L;
        lb.iufb[12] = -1660899457168965228L;
        lb.iufb[13] = 3264136804313891304L;
        lb.iufb[14] = 8243758544795405608L;
        lb.iufb[15] = 8981401024035258415L;
        lb.iufb[16] = 4630152401512223889L;
        lb.iufb[17] = 4289077314688627544L;
        lb.iufb[18] = 6010847561935561805L;
        lb.iufb[19] = 5770441595414231096L;
        lb.iufb[20] = 37972091204514823L;
        lb.iufb[21] = 1689438337091228773L;
        lb.iufb[22] = -2401583403789363897L;
        lb.iufb[23] = 8485800518547824448L;
        lb.iufb[24] = 1519701816668234580L;
        lb.iufb[25] = -4701140920242837331L;
        lb.iufb[26] = 719352136448929886L;
        lb.iufb[27] = 2046247584021829675L;
        lb.iufb[28] = -3468454588454857212L;
        lb.iufb[29] = 7471337997186106991L;
        lb.iufb[30] = 5151995112120053031L;
        lb.iufb[31] = 1339883887347921745L;
        lb.iufb[32] = 4573909076436421616L;
        lb.iufb[33] = 4310937489008215786L;
        lb.iufb[34] = -2731055334299639893L;
        lb.iufb[35] = -3281924187722031782L;
        lb.iufb[36] = 6167351358171372137L;
        lb.iufb[37] = 19580293289996596L;
        lb.iufb[38] = -5705441210740701403L;
        lb.iufb[39] = 5955838310143307580L;
        lb.iufb[40] = -5042962671769470214L;
        lb.iufb[41] = 8144346499360902090L;
        lb.iufb[42] = 679733607653793395L;
        lb.iufb[43] = -5164404713722694705L;
        lb.iufb[44] = -495099961397283909L;
        lb.iufb[45] = 727882150160196838L;
        lb.iufb[46] = -73200453471079415L;
        lb.iufb[47] = -2832475875126039350L;
        lb.iufb[48] = -4164419548605133338L;
        lb.iufb[49] = 8186155554415000113L;
        lb.iufb[50] = 3844096395129589843L;
        lb.iufb[51] = -4370748736255558589L;
        lb.iufb[52] = 6426390132583360697L;
        lb.iufb[53] = 6726289678776333532L;
    }

    private static /* synthetic */ void iull() {
        lb.iuep[0] = -2024647960;
        lb.iuep[1] = 636379736;
        lb.iuep[2] = -680279927;
        lb.iuep[3] = -2089356202;
        lb.iuep[4] = 2109529908;
        lb.iuep[5] = -1966594408;
        lb.iuep[6] = -250975084;
        lb.iuep[7] = -1376821603;
        lb.iuep[8] = 959906527;
        lb.iuep[9] = 1744587145;
        lb.iuep[10] = 1695734504;
        lb.iuep[11] = -2037657472;
        lb.iuep[12] = -1395926942;
        lb.iuep[13] = 1675366663;
        lb.iuep[14] = -811704033;
        lb.iuep[15] = -1069923245;
        lb.iuep[16] = 1684395171;
        lb.iuep[17] = -1846422204;
        lb.iuep[18] = 657002654;
        lb.iuep[19] = -1967804693;
        lb.iuep[20] = 1461737632;
        lb.iuep[21] = 1606140954;
        lb.iuep[22] = -766852847;
        lb.iuep[23] = 1404845199;
        lb.iuep[24] = -821041384;
        lb.iuep[25] = -1132914611;
        lb.iuep[26] = -1449129868;
        lb.iuep[27] = 2039059486;
        lb.iuep[28] = -1989285076;
        lb.iuep[29] = 900539603;
        lb.iuep[30] = -1380541555;
        lb.iuep[31] = 1606921876;
        lb.iuep[32] = -1696089252;
        lb.iuep[33] = 1824693094;
        lb.iuep[34] = 1167019233;
        lb.iuep[35] = 1193321210;
        lb.iuep[36] = 903596267;
        lb.iuep[37] = -2035065341;
        lb.iuep[38] = -336443919;
        lb.iuep[39] = 2020527162;
        lb.iuep[40] = 758643164;
        lb.iuep[41] = -178344661;
        lb.iuep[42] = 47389200;
        lb.iuep[43] = -2027565830;
        lb.iuep[44] = -2005514576;
        lb.iuep[45] = 451319311;
        lb.iuep[46] = 1646563605;
        lb.iuep[47] = -419921052;
        lb.iuep[48] = -1318065500;
        lb.iuep[49] = 394804418;
        lb.iuep[50] = -1856273890;
        lb.iuep[51] = -199654891;
        lb.iuep[52] = 425875843;
        lb.iuep[53] = -460026358;
        lb.iuep[54] = 1620086117;
        lb.iuep[55] = -458866846;
        lb.iuep[56] = -1145124221;
        lb.iuep[57] = -1661029923;
        lb.iuep[58] = 343086189;
        lb.iuep[59] = -1486095950;
        lb.iuep[60] = 578814644;
        lb.iuep[61] = -1118662169;
        lb.iuep[62] = 1613756643;
        lb.iuep[63] = -566942277;
        lb.iuep[64] = -2014514248;
        lb.iuep[65] = 899897356;
        lb.iuep[66] = 1670776407;
        lb.iuep[67] = 298979951;
        lb.iuep[68] = 1160047490;
        lb.iuep[69] = -900372019;
        lb.iuep[70] = -1913480804;
        lb.iuep[71] = -2095942656;
        lb.iuep[72] = 682433192;
        lb.iuep[73] = -572864542;
        lb.iuep[74] = -544124119;
        lb.iuep[75] = 1672740822;
        lb.iuep[76] = -777877132;
        lb.iuep[77] = -836544056;
        lb.iuep[78] = 1517262300;
        lb.iuep[79] = 1689095575;
        lb.iuep[80] = -1134928176;
        lb.iuep[81] = 1178647314;
        lb.iuep[82] = -902427384;
        lb.iuep[83] = -638585959;
        lb.iuep[84] = -361237716;
        lb.iuep[85] = 362330714;
        lb.iuep[86] = 1070957219;
        lb.iuep[87] = 1342569890;
        lb.iuep[88] = -1528960121;
        lb.iuep[89] = -739933858;
        lb.iuep[90] = 1562682465;
        lb.iuep[91] = -225966902;
        lb.iuep[92] = -1428327517;
        lb.iuep[93] = -2087843636;
        lb.iuep[94] = 821365720;
        lb.iuep[95] = 1828861614;
        lb.iuep[96] = -1622180672;
        lb.iuep[97] = -1933751441;
        lb.iuep[98] = -1672798425;
        lb.iuep[99] = -468034873;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void invalidate() {
        v0 /* !! */  = lb.qk;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - lb.iues("iufd", iufa(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1243287834: {
                    v1 = lb.iues("iufe", iufa(int ), (int)1);
                    continue block21;
                }
                case 190986713: {
                    break block21;
                }
                case 1184905835: {
                    v1 = lb.iues("iuff", iufa(int ), (int)2);
                    continue block21;
                }
            }
            break;
        }
        var2 = lb.c;
        v2 /* !! */  = lb.qk;
        if (true) ** GOTO lbl19
        block22: while (true) {
            v2 /* !! */  = (long)(lb.iues("iufh", iufa(int ), (int)4) - lb.iues("iufg", iufa(int ), (int)3));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 190986713: {
                    break block22;
                }
                case 559966538: {
                    continue block22;
                }
            }
            break;
        }
        var1_1 /* !! */  = lb.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = lb.qk - lb.iues("iufj", iufa(int ), (int)5)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == lb.iues("iufk", iueo(int ), (int)3)) break;
            v3 /* !! */  = (long)lb.iues("iufl", iueo(int ), (int)4);
        }
        var0_2 = lb.a;
        if (var2) {
            throw null;
lbl34:
            // 3 sources

            return;
        }
        if (var0_2 || var0_2) ** GOTO lbl34
        v4 /* !! */  = lb.qk;
        if (true) ** GOTO lbl41
        block25: while (true) {
            v4 /* !! */  = (long)(lb.iues("iufn", iufa(int ), (int)7) - lb.iues("iufm", iufa(int ), (int)6));
lbl41:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2010809832: {
                    continue block25;
                }
                case 190986713: {
                    break block25;
                }
            }
            break;
        }
        lb.customPanorama = null;
        if (var0_2) ** GOTO lbl34
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var0_2) ** break;
                ** continue;
                return;
            }
            case 0: {
                var1_1 /* !! */  = (int)lb.iues("iufo", iueo(int ), (int)5);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl64
            }
            case 1: {
                var1_1 /* !! */  = (int)lb.iues("iufp", iueo(int ), (int)6);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl69
            }
lbl64:
            // 3 sources

            case 2: {
                var1_1 /* !! */  = (int)lb.iues("iufq", iueo(int ), (int)7);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl74
            }
lbl69:
            // 2 sources

            case 3: {
                do {
                    var1_1 /* !! */  = (int)lb.iues("iufs", iueo(int ), (int)8);
                } while (!var2);
                throw null;
            }
lbl74:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)lb.iues("iuft", iueo(int ), (int)9);
                    if (!var2) ** GOTO lbl64
                    throw null;
                }
            }
            case 5: 
        }
        var1_1 /* !! */  = (int)lb.iues("iufu", iueo(int ), (int)10);
        ** while (!var2)
lbl82:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long iufa(int n2) {
        return iufb[n2] ^ iufc[n2];
    }

    static {
        iuep = new int[108];
        iuer = new int[108];
        lb.iull();
        lb.iulm();
        lb.iuln();
        lb.iulo();
        iufb = new long[54];
        iufc = new long[54];
        lb.iulp();
        lb.iulq();
    }

    public static /* synthetic */ CallSite iues(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ int iueo(int n2) {
        return iuep[n2] ^ iuer[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private lb() {
        var2_1 /* !! */  = lb.b;
        super();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)lb.iues("iueu", iueo(int ), (int)0);
                    break block0;
                    break;
                }
            }
            case 1: {
                while (true) {
                    var2_1 /* !! */  = (int)lb.iues("iuew", iueo(int ), (int)1);
                }
            }
            case 2: 
        }
        var2_1 /* !! */  = (int)lb.iues("iuey", iueo(int ), (int)2);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static boolean detect(class_310 var0) {
        v0 /* !! */  = lb.qk;
        if (true) ** GOTO lbl5
        block50: while (true) {
            v0 /* !! */  = (long)(lb.iues("iuhr", iufa(int ), (int)18) - lb.iues("iuhq", iufa(int ), (int)17));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -989958669: {
                    continue block50;
                }
                case 190986713: {
                    break block50;
                }
            }
            break;
        }
        var7_1 = lb.c;
        v1 /* !! */  = lb.qk;
        if (true) ** GOTO lbl15
        block51: while (true) {
            v1 /* !! */  = (long)(lb.iues("iuht", iufa(int ), (int)20) - lb.iues("iuhs", iufa(int ), (int)19));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -502089411: {
                    continue block51;
                }
                case 190986713: {
                    break block51;
                }
            }
            break;
        }
        var6_2 /* !! */  = lb.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = lb.qk - lb.iues("iuhu", iufa(int ), (int)21)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == lb.iues("iuhv", iueo(int ), (int)46)) break;
            v2 /* !! */  = (long)lb.iues("iuhw", iueo(int ), (int)47);
        }
        var5_3 = lb.a;
        if (var7_1) {
            throw null;
lbl29:
            // 13 sources

            return (boolean)lb.iues("iuhx", iueo(int ), (int)48);
        }
        if (var5_3 || var5_3) ** GOTO lbl29
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = lb.qk - lb.iues("iuhy", iufa(int ), (int)22)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == lb.iues("iuhz", iueo(int ), (int)49)) break;
            v3 /* !! */  = (long)lb.iues("iuia", iueo(int ), (int)50);
        }
        var1_4 = var0.method_1478();
        if (var5_3 || var5_3) ** GOTO lbl29
        var2_5 = lb.iues("iuib", iueo(int ), (int)51);
        if (var5_3) ** GOTO lbl29
        block55: while (true) {
            if (var5_3) ** GOTO lbl29
            if (var6_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var6_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var5_3) ** GOTO lbl29
                    if (var2_5 >= lb.iues("iuic", iueo(int ), (int)52)) ** GOTO lbl122
                    if (var5_3 || var5_3) ** GOTO lbl29
                    while (true) {
                        if ((v4 /* !! */  = (cfr_temp_2 = lb.qk - lb.iues("iuid", iufa(int ), (int)23)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v4 /* !! */  == lb.iues("iuie", iueo(int ), (int)53)) break;
                        v4 /* !! */  = (long)lb.iues("iuif", iueo(int ), (int)54);
                    }
                    v5 = "textures/gui/title/background/panorama_" + (int)var2_5 + ".png";
                    v6 /* !! */  = lb.qk;
                    if (true) ** GOTO lbl59
                    block57: while (true) {
                        v6 /* !! */  = (long)(v7 - lb.iues("iuig", iufa(int ), (int)24));
lbl59:
                        // 2 sources

                        switch ((int)v6 /* !! */ ) {
                            case -200328184: {
                                v7 = lb.iues("iuih", iufa(int ), (int)25);
                                continue block57;
                            }
                            case 190986713: {
                                break block57;
                            }
                            case 788353325: {
                                v7 = lb.iues("iuii", iufa(int ), (int)26);
                                continue block57;
                            }
                            case 1308858060: {
                                v7 = lb.iues("iuij", iufa(int ), (int)27);
                                continue block57;
                            }
                        }
                        break;
                    }
                    var3_6 = class_2960.method_60656((String)v5);
                    if (var5_3 || var5_3) ** GOTO lbl29
                    v8 /* !! */  = lb.qk;
                    if (true) ** GOTO lbl77
                    block58: while (true) {
                        v8 /* !! */  = (long)(v9 - lb.iues("iuik", iufa(int ), (int)28));
lbl77:
                        // 2 sources

                        switch ((int)v8 /* !! */ ) {
                            case 190986713: {
                                break block58;
                            }
                            case 407143234: {
                                v9 = lb.iues("iuil", iufa(int ), (int)29);
                                continue block58;
                            }
                            case 840302750: {
                                v9 = lb.iues("iuim", iufa(int ), (int)30);
                                continue block58;
                            }
                        }
                        break;
                    }
                    var4_7 = var1_4.method_14486(var3_6);
                    if (var5_3 || var5_3) ** GOTO lbl29
                    while (true) {
                        if ((v10 /* !! */  = (cfr_temp_3 = lb.qk - lb.iues("iuin", iufa(int ), (int)31)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v10 /* !! */  == lb.iues("iuio", iueo(int ), (int)55)) break;
                        v10 /* !! */  = (long)lb.iues("iuip", iueo(int ), (int)56);
                    }
                    if (!var4_7.isPresent()) ** GOTO lbl117
                    if (var5_3) ** GOTO lbl29
                    v11 /* !! */  = lb.qk;
                    if (true) ** GOTO lbl99
                    block60: while (true) {
                        v11 /* !! */  = (long)(v12 - lb.iues("iuiq", iufa(int ), (int)32));
lbl99:
                        // 2 sources

                        switch ((int)v11 /* !! */ ) {
                            case -6089284: {
                                v12 = lb.iues("iuir", iufa(int ), (int)33);
                                continue block60;
                            }
                            case 190986713: {
                                break block60;
                            }
                            case 1403431367: {
                                v12 = lb.iues("iuis", iufa(int ), (int)34);
                                continue block60;
                            }
                        }
                        break;
                    }
                    v13 = (class_3298)var4_7.get();
                    while (true) {
                        if ((v14 /* !! */  = (cfr_temp_4 = lb.qk - lb.iues("iuit", iufa(int ), (int)35)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v14 /* !! */  == lb.iues("iuiu", iueo(int ), (int)57)) break;
                        v14 /* !! */  = (long)lb.iues("iuiv", iueo(int ), (int)58);
                    }
                    if (lb.isBuiltinPack(v13)) ** GOTO lbl117
                    if (var5_3 || var5_3) ** GOTO lbl29
                    return (boolean)lb.iues("iuiw", iueo(int ), (int)59);
lbl117:
                    // 2 sources

                    if (var5_3 || var5_3) ** GOTO lbl29
                    ++var2_5;
                    if (var5_3) ** GOTO lbl29
                    if (!var7_1) continue block55;
                    throw null;
lbl122:
                    // 1 sources

                    if (!var5_3 && !var5_3) ** break;
                    ** continue;
                    return (boolean)lb.iues("iuix", iueo(int ), (int)60);
                }
                case 0: {
                    var6_2 /* !! */  = (int)lb.iues("iuiy", iueo(int ), (int)61);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl158
                }
lbl130:
                // 4 sources

                case 1: {
                    var6_2 /* !! */  = (int)lb.iues("iuiz", iueo(int ), (int)62);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl216
                }
lbl135:
                // 3 sources

                case 2: {
                    var6_2 /* !! */  = (int)lb.iues("iuja", iueo(int ), (int)63);
                    if (!var7_1) break block55;
                    throw null;
                }
                case 3: {
                    var6_2 /* !! */  = (int)lb.iues("iujb", iueo(int ), (int)64);
                    if (!var7_1) ** GOTO lbl130
                    throw null;
                }
lbl143:
                // 3 sources

                case 4: {
                    var6_2 /* !! */  = (int)lb.iues("iujc", iueo(int ), (int)65);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl154
                }
lbl148:
                // 3 sources

                case 5: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var6_2 /* !! */  = (int)lb.iues("iujd", iueo(int ), (int)66);
                        if (var7_1) {
                            throw null;
                        }
                        ** GOTO lbl186
                        break;
                    }
                }
lbl154:
                // 2 sources

                case 6: {
                    var6_2 /* !! */  = (int)lb.iues("iuje", iueo(int ), (int)67);
                    if (!var7_1) ** GOTO lbl143
                    throw null;
                }
lbl158:
                // 2 sources

                case 7: {
                    var6_2 /* !! */  = (int)lb.iues("iujf", iueo(int ), (int)68);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl220
                }
                case 8: {
                    var6_2 /* !! */  = (int)lb.iues("iujg", iueo(int ), (int)69);
                    if (!var7_1) ** GOTO lbl135
                    throw null;
                }
                case 9: {
                    var6_2 /* !! */  = (int)lb.iues("iujh", iueo(int ), (int)70);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl224
                }
                case 10: {
                    var6_2 /* !! */  = (int)lb.iues("iuji", iueo(int ), (int)71);
                    if (!var7_1) ** GOTO lbl135
                    throw null;
                }
                case 11: {
                    var6_2 /* !! */  = (int)lb.iues("iujj", iueo(int ), (int)72);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl212
                }
                case 12: {
                    var6_2 /* !! */  = (int)lb.iues("iujk", iueo(int ), (int)73);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl220
                }
lbl186:
                // 3 sources

                case 13: {
                    var6_2 /* !! */  = (int)lb.iues("iujl", iueo(int ), (int)74);
                    if (!var7_1) ** GOTO lbl130
                    throw null;
                }
                case 14: {
                    var6_2 /* !! */  = (int)lb.iues("iujm", iueo(int ), (int)75);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl199
                }
                case 15: {
                    var6_2 /* !! */  = (int)lb.iues("iujn", iueo(int ), (int)76);
                    if (!var7_1) ** GOTO lbl186
                    throw null;
                }
lbl199:
                // 3 sources

                case 16: {
                    var6_2 /* !! */  = (int)lb.iues("iujo", iueo(int ), (int)77);
                    if (!var7_1) ** GOTO lbl148
                    throw null;
                }
                case 17: {
                    var6_2 /* !! */  = (int)lb.iues("iujp", iueo(int ), (int)78);
                    if (!var7_1) ** GOTO lbl130
                    throw null;
                }
                case 18: {
                    var6_2 /* !! */  = (int)lb.iues("iujq", iueo(int ), (int)79);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl220
                }
lbl212:
                // 3 sources

                case 19: {
                    var6_2 /* !! */  = (int)lb.iues("iujr", iueo(int ), (int)80);
                    if (!var7_1) ** GOTO lbl199
                    throw null;
                }
lbl216:
                // 2 sources

                case 20: {
                    var6_2 /* !! */  = (int)lb.iues("iujs", iueo(int ), (int)81);
                    if (!var7_1) ** GOTO lbl148
                    throw null;
                }
lbl220:
                // 4 sources

                case 21: {
                    var6_2 /* !! */  = (int)lb.iues("iujt", iueo(int ), (int)82);
                    if (!var7_1) ** GOTO lbl143
                    throw null;
                }
lbl224:
                // 2 sources

                case 22: {
                    var6_2 /* !! */  = (int)lb.iues("iuju", iueo(int ), (int)83);
                    if (!var7_1) ** GOTO lbl212
                    throw null;
                }
                case 23: 
            }
            break;
        }
        var6_2 /* !! */  = (int)lb.iues("iujv", iueo(int ), (int)84);
        ** while (!var7_1)
lbl231:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void iuln() {
        lb.iuer[0] = -2024647959;
        lb.iuer[1] = 636379737;
        lb.iuer[2] = -680279927;
        lb.iuer[3] = -2089356201;
        lb.iuer[4] = 501115576;
        lb.iuer[5] = -1966594407;
        lb.iuer[6] = -250975083;
        lb.iuer[7] = -1376821604;
        lb.iuer[8] = 959906522;
        lb.iuer[9] = 1744587145;
        lb.iuer[10] = 1695734507;
        lb.iuer[11] = 2037657471;
        lb.iuer[12] = 18782424;
        lb.iuer[13] = -1675366664;
        lb.iuer[14] = 2132432067;
        lb.iuer[15] = 1069923244;
        lb.iuer[16] = -2003021511;
        lb.iuer[17] = -1846422203;
        lb.iuer[18] = 657002654;
        lb.iuer[19] = 1967804692;
        lb.iuer[20] = -904504381;
        lb.iuer[21] = -1606140955;
        lb.iuer[22] = -1020390552;
        lb.iuer[23] = -1404845200;
        lb.iuer[24] = 499185063;
        lb.iuer[25] = 1132914610;
        lb.iuer[26] = -921934329;
        lb.iuer[27] = 2039059483;
        lb.iuer[28] = -1989285075;
        lb.iuer[29] = 900539586;
        lb.iuer[30] = -1380541566;
        lb.iuer[31] = 1606921887;
        lb.iuer[32] = -1696089249;
        lb.iuer[33] = 1824693103;
        lb.iuer[34] = 1167019241;
        lb.iuer[35] = 1193321209;
        lb.iuer[36] = 903596265;
        lb.iuer[37] = -2035065325;
        lb.iuer[38] = -336443918;
        lb.iuer[39] = 2020527155;
        lb.iuer[40] = 758643164;
        lb.iuer[41] = -178344664;
        lb.iuer[42] = 47389211;
        lb.iuer[43] = -2027565828;
        lb.iuer[44] = -2005514566;
        lb.iuer[45] = 451319300;
        lb.iuer[46] = -1646563606;
        lb.iuer[47] = -153366052;
        lb.iuer[48] = -1318065500;
        lb.iuer[49] = -394804419;
        lb.iuer[50] = -1430828372;
        lb.iuer[51] = -199654891;
        lb.iuer[52] = 425875845;
        lb.iuer[53] = 460026357;
        lb.iuer[54] = 1134023920;
        lb.iuer[55] = 458866845;
        lb.iuer[56] = 1918452767;
        lb.iuer[57] = 1661029922;
        lb.iuer[58] = -500021155;
        lb.iuer[59] = -1486095949;
        lb.iuer[60] = 578814644;
        lb.iuer[61] = -1118662166;
        lb.iuer[62] = 1613756662;
        lb.iuer[63] = -566942277;
        lb.iuer[64] = -2014514253;
        lb.iuer[65] = 899897373;
        lb.iuer[66] = 1670776405;
        lb.iuer[67] = 298979944;
        lb.iuer[68] = 1160047507;
        lb.iuer[69] = -900372018;
        lb.iuer[70] = -1913480816;
        lb.iuer[71] = -2095942636;
        lb.iuer[72] = 682433190;
        lb.iuer[73] = -572864521;
        lb.iuer[74] = -544124128;
        lb.iuer[75] = 1672740828;
        lb.iuer[76] = -777877128;
        lb.iuer[77] = -836544064;
        lb.iuer[78] = 1517262293;
        lb.iuer[79] = 1689095555;
        lb.iuer[80] = -1134928166;
        lb.iuer[81] = 1178647296;
        lb.iuer[82] = -902427383;
        lb.iuer[83] = -638585963;
        lb.iuer[84] = -361237698;
        lb.iuer[85] = -362330715;
        lb.iuer[86] = 797941745;
        lb.iuer[87] = 1342569891;
        lb.iuer[88] = -1070030973;
        lb.iuer[89] = -739933858;
        lb.iuer[90] = -1562682466;
        lb.iuer[91] = 1928197373;
        lb.iuer[92] = -1428327518;
        lb.iuer[93] = -2087843636;
        lb.iuer[94] = 821365725;
        lb.iuer[95] = 1828861606;
        lb.iuer[96] = -1622180660;
        lb.iuer[97] = -1933751448;
        lb.iuer[98] = -1672798422;
        lb.iuer[99] = -468034874;
    }

    private static /* synthetic */ void iulq() {
        lb.iufc[0] = 2410476247723151800L;
        lb.iufc[1] = -48810866476130761L;
        lb.iufc[2] = 5916913820960594717L;
        lb.iufc[3] = -590914057151355598L;
        lb.iufc[4] = -2913689701860014812L;
        lb.iufc[5] = 8517734824417546598L;
        lb.iufc[6] = 6952940086140824484L;
        lb.iufc[7] = -2628996719284203396L;
        lb.iufc[8] = -6026639900719496869L;
        lb.iufc[9] = -4637970817760769223L;
        lb.iufc[10] = 3607261416186552626L;
        lb.iufc[11] = -2292307939119646687L;
        lb.iufc[12] = -7610820406088667853L;
        lb.iufc[13] = 2175454632231343019L;
        lb.iufc[14] = 6578906146688744249L;
        lb.iufc[15] = -2573549612442982342L;
        lb.iufc[16] = -8098121869389081911L;
        lb.iufc[17] = 1515818638546304427L;
        lb.iufc[18] = 7571723222083058304L;
        lb.iufc[19] = 1308862235406644868L;
        lb.iufc[20] = 8711324933100302042L;
        lb.iufc[21] = -1160129368951129542L;
        lb.iufc[22] = 2687035670786579214L;
        lb.iufc[23] = 1191162820314407495L;
        lb.iufc[24] = -7625211305264302335L;
        lb.iufc[25] = 957290841098325131L;
        lb.iufc[26] = -6947983386657811821L;
        lb.iufc[27] = 4188403108445895329L;
        lb.iufc[28] = 2652591851533111415L;
        lb.iufc[29] = -8724285479288820159L;
        lb.iufc[30] = -3487221382571216707L;
        lb.iufc[31] = 2440925246013180977L;
        lb.iufc[32] = 5292905177281932066L;
        lb.iufc[33] = 7458667258398328147L;
        lb.iufc[34] = -1792175824025419995L;
        lb.iufc[35] = 7157432654459040672L;
        lb.iufc[36] = 5663820802047861272L;
        lb.iufc[37] = 4473765266731320646L;
        lb.iufc[38] = 7305115177212138767L;
        lb.iufc[39] = -4310158433604623466L;
        lb.iufc[40] = 4870836645577272482L;
        lb.iufc[41] = -929679446403206813L;
        lb.iufc[42] = 3889746896136366869L;
        lb.iufc[43] = -4230115370824979811L;
        lb.iufc[44] = -5008847286111280583L;
        lb.iufc[45] = 5905886918411360592L;
        lb.iufc[46] = -4818527844757313005L;
        lb.iufc[47] = -6099524721671512226L;
        lb.iufc[48] = -2467910166203893101L;
        lb.iufc[49] = -2164444930316597945L;
        lb.iufc[50] = 4616896123222849783L;
        lb.iufc[51] = 5661449710505195296L;
        lb.iufc[52] = -7667659006396623250L;
        lb.iufc[53] = 4293775797304999388L;
    }

    private static /* synthetic */ void iulo() {
        lb.iuer[100] = -891985187;
        lb.iuer[101] = 1907061583;
        lb.iuer[102] = -539799599;
        lb.iuer[103] = 1057328574;
        lb.iuer[104] = 13831764;
        lb.iuer[105] = -1936000372;
        lb.iuer[106] = -1092852810;
        lb.iuer[107] = 1272303318;
    }
}

