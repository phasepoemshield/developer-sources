/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.HashMap;
import java.util.Map;

public class pm {
    private static long[] kxzt;
    public static final int b;
    private static final Map<Integer, String> KEY_NAMES;
    private static int[] kyab;
    private static final Map<String, Integer> NAME_TO_KEY;
    public static final boolean c;
    public static final boolean a;
    private static final long th = -4171641502475902829L;
    private static int[] kyac;
    private static long[] kxzu;

    public pm() {
    }

    private static /* synthetic */ long kxzs(int n2) {
        return kxzt[n2] ^ kxzu[n2];
    }

    private static /* synthetic */ void kyia() {
        pm.kyac[100] = -1375642354;
        pm.kyac[101] = -1175525031;
        pm.kyac[102] = -1181518623;
        pm.kyac[103] = -1771371919;
        pm.kyac[104] = 451448478;
        pm.kyac[105] = -2056099803;
        pm.kyac[106] = -1199950948;
        pm.kyac[107] = -305713067;
        pm.kyac[108] = -606075012;
        pm.kyac[109] = -456833740;
        pm.kyac[110] = 1674764183;
        pm.kyac[111] = 177167539;
        pm.kyac[112] = 1140303669;
        pm.kyac[113] = 496416645;
        pm.kyac[114] = -654500813;
        pm.kyac[115] = -368406978;
        pm.kyac[116] = 763935752;
        pm.kyac[117] = -1493497257;
        pm.kyac[118] = -782106816;
        pm.kyac[119] = -814247395;
        pm.kyac[120] = 1067241965;
        pm.kyac[121] = 1675581915;
        pm.kyac[122] = -1892343393;
        pm.kyac[123] = 375679417;
        pm.kyac[124] = 558099929;
        pm.kyac[125] = -1833965782;
        pm.kyac[126] = 1403229736;
        pm.kyac[127] = 145637848;
        pm.kyac[128] = -1375946432;
        pm.kyac[129] = 1249589112;
        pm.kyac[130] = 281078477;
        pm.kyac[131] = -727628053;
        pm.kyac[132] = -277519909;
        pm.kyac[133] = 1540059786;
        pm.kyac[134] = 467703807;
        pm.kyac[135] = 1062267555;
        pm.kyac[136] = -669765205;
        pm.kyac[137] = 286438501;
        pm.kyac[138] = -687046064;
        pm.kyac[139] = -4821303;
        pm.kyac[140] = 1394811708;
        pm.kyac[141] = -551664057;
        pm.kyac[142] = 1882157657;
        pm.kyac[143] = -1985164978;
        pm.kyac[144] = -1687554514;
        pm.kyac[145] = 349172442;
        pm.kyac[146] = -325802275;
        pm.kyac[147] = -2118240863;
        pm.kyac[148] = 196511729;
        pm.kyac[149] = -241440345;
        pm.kyac[150] = 499901742;
        pm.kyac[151] = -1121384640;
        pm.kyac[152] = -292850481;
        pm.kyac[153] = -549657144;
        pm.kyac[154] = -736908337;
        pm.kyac[155] = 164008338;
        pm.kyac[156] = -1624685265;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static boolean isValidKey(String string) {
        boolean bl2;
        Object object = th;
        boolean bl3 = true;
        block14: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - pm.kxzv("kycb", kxzs(int ), (int)30);
            }
            switch ((int)object) {
                case -492461933: {
                    break block14;
                }
                case 127382972: {
                    callSite = pm.kxzv("kycc", kxzs(int ), (int)31);
                    continue block14;
                }
                case 690963051: {
                    callSite = pm.kxzv("kycd", kxzs(int ), (int)32);
                    continue block14;
                }
                case 1892281812: {
                    callSite = pm.kxzv("kyce", kxzs(int ), (int)33);
                    continue block14;
                }
            }
            break;
        }
        boolean bl4 = c;
        Object object2 = th;
        block15: while (true) {
            switch ((int)object2) {
                case -492461933: {
                    break block15;
                }
                case -381538720: {
                    object2 = pm.kxzv("kycg", kxzs(int ), (int)35) - pm.kxzv("kycf", kxzs(int ), (int)34);
                    continue block15;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = th - pm.kxzv("kych", kxzs(int ), (int)36)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object3 == pm.kxzv("kyci", kyaa(int ), (int)24)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = pm.kxzv("kycj", kyaa(int ), (int)25);
        }
        if (bl2) return (boolean)pm.kxzv("kyck", kyaa(int ), (int)26);
        if (bl2) return (boolean)pm.kxzv("kyck", kyaa(int ), (int)26);
        while (true) {
            long l3;
            Object object4;
            if ((object4 = (l3 = th - pm.kxzv("kycl", kxzs(int ), (int)37)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object4 == pm.kxzv("kycm", kyaa(int ), (int)27)) break;
            object4 = pm.kxzv("kycn", kyaa(int ), (int)28);
        }
        while (true) {
            long l4;
            Object object5;
            if ((object5 = (l4 = th - pm.kxzv("kyco", kxzs(int ), (int)38)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object5 == pm.kxzv("kycp", kyaa(int ), (int)29)) break;
            object5 = pm.kxzv("kycq", kyaa(int ), (int)30);
        }
        String string2 = string.toLowerCase();
        Object object6 = th;
        block19: while (true) {
            switch ((int)object6) {
                case -492461933: {
                    return NAME_TO_KEY.containsKey(string2);
                }
                case 1678764138: {
                    object6 = pm.kxzv("kycs", kxzs(int ), (int)40) - pm.kxzv("kycr", kxzs(int ), (int)39);
                    continue block19;
                }
            }
            break;
        }
        return NAME_TO_KEY.containsKey(string2);
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static String getKeyName(int var0) {
        v0 /* !! */  = pm.th;
        if (true) ** GOTO lbl5
        block25: while (true) {
            v0 /* !! */  = (long)(v1 - pm.kxzv("kxzw", kxzs(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1105556439: {
                    v1 = pm.kxzv("kxzx", kxzs(int ), (int)1);
                    continue block25;
                }
                case -492461933: {
                    break block25;
                }
                case 2058197694: {
                    v1 = pm.kxzv("kxzy", kxzs(int ), (int)2);
                    continue block25;
                }
            }
            break;
        }
        var3_1 = pm.c;
        while (true) {
            block39: {
                if ((v2 /* !! */  = (cfr_temp_1 = pm.th - pm.kxzv("kxzz", kxzs(int ), (int)3)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  != pm.kxzv("kyad", kyaa(int ), (int)0)) break block39;
                var2_2 /* !! */  = pm.b;
                v3 /* !! */  = pm.th;
                if (true) ** GOTO lbl26
            }
            v2 /* !! */  = (long)pm.kxzv("kyae", kyaa(int ), (int)1);
        }
        block27: while (true) {
            v3 /* !! */  = (long)(v4 - pm.kxzv("kyaf", kxzs(int ), (int)4));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1179098546: {
                    v4 = pm.kxzv("kyag", kxzs(int ), (int)5);
                    continue block27;
                }
                case -492461933: {
                    break block27;
                }
                case 48933224: {
                    v4 = pm.kxzv("kyah", kxzs(int ), (int)6);
                    continue block27;
                }
                case 1648346606: {
                    v4 = pm.kxzv("kyai", kxzs(int ), (int)7);
                    continue block27;
                }
            }
            break;
        }
        var1_3 = pm.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var3_1) {
                        throw null;
                    }
                    if (var1_3 != false) return null;
                    if (var1_3 != false) return null;
                    while (true) {
                        if ((v5 /* !! */  = (cfr_temp_2 = pm.th - pm.kxzv("kyaj", kxzs(int ), (int)8)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v5 /* !! */  != pm.kxzv("kyak", kyaa(int ), (int)2)) {
                            v5 /* !! */  = (long)pm.kxzv("kyal", kyaa(int ), (int)3);
                            continue;
                        }
                        ** GOTO lbl64
                        break;
                    }
                }
                case 2: {
                    do {
                        var2_2 /* !! */  = (int)pm.kxzv("kyav", kyaa(int ), (int)8);
                    } while (!var3_1);
                    throw null;
                }
                case 3: {
                    var2_2 /* !! */  = (int)pm.kxzv("kyaw", kyaa(int ), (int)9);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
lbl64:
                // 1 sources

                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = pm.th - pm.kxzv("kyam", kxzs(int ), (int)9)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == pm.kxzv("kyan", kyaa(int ), (int)4)) break;
                    v6 /* !! */  = (long)pm.kxzv("kyao", kyaa(int ), (int)5);
                }
                v7 = var0;
                v8 /* !! */  = pm.th;
                block32: while (true) {
                    switch ((int)v8 /* !! */ ) {
                        case -492461933: {
                            break block32;
                        }
                        case 266886514: {
                            v8 /* !! */  = (long)(pm.kxzv("kyaq", kxzs(int ), (int)11) - pm.kxzv("kyap", kxzs(int ), (int)10));
                            continue block32;
                        }
                    }
                    break;
                }
                v9 = "Unknown(" + var0 + ")";
                v10 /* !! */  = pm.th;
                block33: while (true) {
                    switch ((int)v10 /* !! */ ) {
                        case -492461933: {
                            return pm.KEY_NAMES.getOrDefault(v7, v9);
                        }
                        case 1153806270: {
                            v10 /* !! */  = (long)(pm.kxzv("kyas", kxzs(int ), (int)13) - pm.kxzv("kyar", kxzs(int ), (int)12));
                            continue block33;
                        }
                    }
                    break;
                }
                return pm.KEY_NAMES.getOrDefault(v7, v9);
                case 0: lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)pm.kxzv("kyat", kyaa(int ), (int)6);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: 
            }
            if (true) ** GOTO lbl96
            break;
        }
        do {
            if (true) ** continue;
lbl96:
            // 2 sources

            var2_2 /* !! */  = (int)pm.kxzv("kyau", kyaa(int ), (int)7);
            cfr_temp_0 = 0;
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ int kyaa(int n2) {
        return kyab[n2] ^ kyac[n2];
    }

    private static /* synthetic */ void kyhz() {
        pm.kyac[0] = -1789940618;
        pm.kyac[1] = -2000760723;
        pm.kyac[2] = -444600900;
        pm.kyac[3] = -782279296;
        pm.kyac[4] = 1638076558;
        pm.kyac[5] = 356608883;
        pm.kyac[6] = 742313823;
        pm.kyac[7] = -1600341609;
        pm.kyac[8] = 1298704798;
        pm.kyac[9] = -1912934550;
        pm.kyac[10] = -250306119;
        pm.kyac[11] = -1392928265;
        pm.kyac[12] = 2046838559;
        pm.kyac[13] = 683328220;
        pm.kyac[14] = -1790139741;
        pm.kyac[15] = 1085639810;
        pm.kyac[16] = -1551048360;
        pm.kyac[17] = -1170209151;
        pm.kyac[18] = 796029875;
        pm.kyac[19] = -1158875197;
        pm.kyac[20] = 1574221066;
        pm.kyac[21] = 1821918158;
        pm.kyac[22] = -198148749;
        pm.kyac[23] = -225829202;
        pm.kyac[24] = 1370509808;
        pm.kyac[25] = 1990211677;
        pm.kyac[26] = 1620295183;
        pm.kyac[27] = 501644460;
        pm.kyac[28] = -785832903;
        pm.kyac[29] = 1020202937;
        pm.kyac[30] = -1347355639;
        pm.kyac[31] = 1801487260;
        pm.kyac[32] = -1771613816;
        pm.kyac[33] = -719588012;
        pm.kyac[34] = 1551299724;
        pm.kyac[35] = 1644469827;
        pm.kyac[36] = -111117885;
        pm.kyac[37] = -1072857891;
        pm.kyac[38] = -1130566479;
        pm.kyac[39] = -28314212;
        pm.kyac[40] = -382501655;
        pm.kyac[41] = -229423818;
        pm.kyac[42] = -413882697;
        pm.kyac[43] = -686358254;
        pm.kyac[44] = 1848319110;
        pm.kyac[45] = 1201818630;
        pm.kyac[46] = -80281477;
        pm.kyac[47] = -1740446270;
        pm.kyac[48] = 1148647082;
        pm.kyac[49] = -356824342;
        pm.kyac[50] = 495087123;
        pm.kyac[51] = 847575598;
        pm.kyac[52] = 16085729;
        pm.kyac[53] = 1261695309;
        pm.kyac[54] = 777723155;
        pm.kyac[55] = 822375145;
        pm.kyac[56] = 1959669063;
        pm.kyac[57] = -173583219;
        pm.kyac[58] = -646625768;
        pm.kyac[59] = -1276756884;
        pm.kyac[60] = -1450178834;
        pm.kyac[61] = 1142330799;
        pm.kyac[62] = -182494344;
        pm.kyac[63] = 240554822;
        pm.kyac[64] = -240866522;
        pm.kyac[65] = -1843680109;
        pm.kyac[66] = -899463585;
        pm.kyac[67] = -288463756;
        pm.kyac[68] = 131468100;
        pm.kyac[69] = -1499385239;
        pm.kyac[70] = 1931203131;
        pm.kyac[71] = 1692262132;
        pm.kyac[72] = 298406564;
        pm.kyac[73] = -1524113565;
        pm.kyac[74] = -43324839;
        pm.kyac[75] = 1091963548;
        pm.kyac[76] = 929470192;
        pm.kyac[77] = 603565996;
        pm.kyac[78] = 2074316240;
        pm.kyac[79] = -1695254489;
        pm.kyac[80] = 315934881;
        pm.kyac[81] = 1714807704;
        pm.kyac[82] = -880501347;
        pm.kyac[83] = -1152295280;
        pm.kyac[84] = 1361422277;
        pm.kyac[85] = -543142117;
        pm.kyac[86] = -842012401;
        pm.kyac[87] = -1593722462;
        pm.kyac[88] = 1531298051;
        pm.kyac[89] = 2010229887;
        pm.kyac[90] = -1038410651;
        pm.kyac[91] = 107232720;
        pm.kyac[92] = -176113956;
        pm.kyac[93] = -770841007;
        pm.kyac[94] = 678327733;
        pm.kyac[95] = -2102839999;
        pm.kyac[96] = 573201203;
        pm.kyac[97] = -1176466276;
        pm.kyac[98] = -1256233970;
        pm.kyac[99] = -1240294865;
    }

    public static /* synthetic */ CallSite kxzv(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    static {
        kyab = new int[157];
        kyac = new int[157];
        pm.kyhx();
        pm.kyhy();
        pm.kyhz();
        pm.kyia();
        kxzt = new long[49];
        kxzu = new long[49];
        pm.kyib();
        pm.kyic();
        KEY_NAMES = new HashMap<Integer, String>();
        NAME_TO_KEY = new HashMap<String, Integer>();
        KEY_NAMES.put((int)pm.kxzv("kydt", kyaa(int ), (int)49), "Mouse3");
        KEY_NAMES.put((int)pm.kxzv("kydu", kyaa(int ), (int)50), "Mouse4");
        KEY_NAMES.put((int)pm.kxzv("kydv", kyaa(int ), (int)51), "Mouse5");
        KEY_NAMES.put((int)pm.kxzv("kydw", kyaa(int ), (int)52), "Mouse6");
        KEY_NAMES.put((int)pm.kxzv("kydx", kyaa(int ), (int)53), "Mouse7");
        KEY_NAMES.put((int)pm.kxzv("kydy", kyaa(int ), (int)54), "Mouse8");
        KEY_NAMES.put((int)pm.kxzv("kydz", kyaa(int ), (int)55), "Space");
        KEY_NAMES.put((int)pm.kxzv("kyea", kyaa(int ), (int)56), "'");
        KEY_NAMES.put((int)pm.kxzv("kyeb", kyaa(int ), (int)57), ",");
        KEY_NAMES.put((int)pm.kxzv("kyec", kyaa(int ), (int)58), "-");
        KEY_NAMES.put((int)pm.kxzv("kyed", kyaa(int ), (int)59), ".");
        KEY_NAMES.put((int)pm.kxzv("kyee", kyaa(int ), (int)60), "/");
        KEY_NAMES.put((int)pm.kxzv("kyef", kyaa(int ), (int)61), "0");
        KEY_NAMES.put((int)pm.kxzv("kyeg", kyaa(int ), (int)62), "1");
        KEY_NAMES.put((int)pm.kxzv("kyeh", kyaa(int ), (int)63), "2");
        KEY_NAMES.put((int)pm.kxzv("kyei", kyaa(int ), (int)64), "3");
        KEY_NAMES.put((int)pm.kxzv("kyej", kyaa(int ), (int)65), "4");
        KEY_NAMES.put((int)pm.kxzv("kyek", kyaa(int ), (int)66), "5");
        KEY_NAMES.put((int)pm.kxzv("kyel", kyaa(int ), (int)67), "6");
        KEY_NAMES.put((int)pm.kxzv("kyem", kyaa(int ), (int)68), "7");
        KEY_NAMES.put((int)pm.kxzv("kyen", kyaa(int ), (int)69), "8");
        KEY_NAMES.put((int)pm.kxzv("kyeo", kyaa(int ), (int)70), "9");
        KEY_NAMES.put((int)pm.kxzv("kyep", kyaa(int ), (int)71), ";");
        KEY_NAMES.put((int)pm.kxzv("kyeq", kyaa(int ), (int)72), "=");
        KEY_NAMES.put((int)pm.kxzv("kyer", kyaa(int ), (int)73), "A");
        KEY_NAMES.put((int)pm.kxzv("kyes", kyaa(int ), (int)74), "B");
        KEY_NAMES.put((int)pm.kxzv("kyet", kyaa(int ), (int)75), "C");
        KEY_NAMES.put((int)pm.kxzv("kyeu", kyaa(int ), (int)76), "D");
        KEY_NAMES.put((int)pm.kxzv("kyev", kyaa(int ), (int)77), "E");
        KEY_NAMES.put((int)pm.kxzv("kyew", kyaa(int ), (int)78), "F");
        KEY_NAMES.put((int)pm.kxzv("kyex", kyaa(int ), (int)79), "G");
        KEY_NAMES.put((int)pm.kxzv("kyey", kyaa(int ), (int)80), "H");
        KEY_NAMES.put((int)pm.kxzv("kyez", kyaa(int ), (int)81), "I");
        KEY_NAMES.put((int)pm.kxzv("kyfa", kyaa(int ), (int)82), "J");
        KEY_NAMES.put((int)pm.kxzv("kyfb", kyaa(int ), (int)83), "K");
        KEY_NAMES.put((int)pm.kxzv("kyfc", kyaa(int ), (int)84), "L");
        KEY_NAMES.put((int)pm.kxzv("kyfd", kyaa(int ), (int)85), "M");
        KEY_NAMES.put((int)pm.kxzv("kyfe", kyaa(int ), (int)86), "N");
        KEY_NAMES.put((int)pm.kxzv("kyff", kyaa(int ), (int)87), "O");
        KEY_NAMES.put((int)pm.kxzv("kyfg", kyaa(int ), (int)88), "P");
        KEY_NAMES.put((int)pm.kxzv("kyfh", kyaa(int ), (int)89), "Q");
        KEY_NAMES.put((int)pm.kxzv("kyfi", kyaa(int ), (int)90), "R");
        KEY_NAMES.put((int)pm.kxzv("kyfj", kyaa(int ), (int)91), "S");
        KEY_NAMES.put((int)pm.kxzv("kyfk", kyaa(int ), (int)92), "T");
        KEY_NAMES.put((int)pm.kxzv("kyfl", kyaa(int ), (int)93), "U");
        KEY_NAMES.put((int)pm.kxzv("kyfm", kyaa(int ), (int)94), "V");
        KEY_NAMES.put((int)pm.kxzv("kyfn", kyaa(int ), (int)95), "W");
        KEY_NAMES.put((int)pm.kxzv("kyfo", kyaa(int ), (int)96), "X");
        KEY_NAMES.put((int)pm.kxzv("kyfp", kyaa(int ), (int)97), "Y");
        KEY_NAMES.put((int)pm.kxzv("kyfq", kyaa(int ), (int)98), "Z");
        KEY_NAMES.put((int)pm.kxzv("kyfr", kyaa(int ), (int)99), "[");
        KEY_NAMES.put((int)pm.kxzv("kyfs", kyaa(int ), (int)100), "\\");
        KEY_NAMES.put((int)pm.kxzv("kyft", kyaa(int ), (int)101), "]");
        KEY_NAMES.put((int)pm.kxzv("kyfu", kyaa(int ), (int)102), "`");
        KEY_NAMES.put((int)pm.kxzv("kyfv", kyaa(int ), (int)103), "Escape");
        KEY_NAMES.put((int)pm.kxzv("kyfw", kyaa(int ), (int)104), "Enter");
        KEY_NAMES.put((int)pm.kxzv("kyfx", kyaa(int ), (int)105), "Tab");
        KEY_NAMES.put((int)pm.kxzv("kyfy", kyaa(int ), (int)106), "Backspace");
        KEY_NAMES.put((int)pm.kxzv("kyfz", kyaa(int ), (int)107), "Insert");
        KEY_NAMES.put((int)pm.kxzv("kyga", kyaa(int ), (int)108), "Delete");
        KEY_NAMES.put((int)pm.kxzv("kygb", kyaa(int ), (int)109), "Right");
        KEY_NAMES.put((int)pm.kxzv("kygc", kyaa(int ), (int)110), "Left");
        KEY_NAMES.put((int)pm.kxzv("kygd", kyaa(int ), (int)111), "Down");
        KEY_NAMES.put((int)pm.kxzv("kyge", kyaa(int ), (int)112), "Up");
        KEY_NAMES.put((int)pm.kxzv("kygf", kyaa(int ), (int)113), "PageUp");
        KEY_NAMES.put((int)pm.kxzv("kygg", kyaa(int ), (int)114), "PageDown");
        KEY_NAMES.put((int)pm.kxzv("kygh", kyaa(int ), (int)115), "Home");
        KEY_NAMES.put((int)pm.kxzv("kygi", kyaa(int ), (int)116), "End");
        KEY_NAMES.put((int)pm.kxzv("kygj", kyaa(int ), (int)117), "CapsLock");
        KEY_NAMES.put((int)pm.kxzv("kygk", kyaa(int ), (int)118), "ScrollLock");
        KEY_NAMES.put((int)pm.kxzv("kygl", kyaa(int ), (int)119), "NumLock");
        KEY_NAMES.put((int)pm.kxzv("kygm", kyaa(int ), (int)120), "PrintScreen");
        KEY_NAMES.put((int)pm.kxzv("kygn", kyaa(int ), (int)121), "Pause");
        KEY_NAMES.put((int)pm.kxzv("kygo", kyaa(int ), (int)122), "F1");
        KEY_NAMES.put((int)pm.kxzv("kygp", kyaa(int ), (int)123), "F2");
        KEY_NAMES.put((int)pm.kxzv("kygq", kyaa(int ), (int)124), "F3");
        KEY_NAMES.put((int)pm.kxzv("kygr", kyaa(int ), (int)125), "F4");
        KEY_NAMES.put((int)pm.kxzv("kygs", kyaa(int ), (int)126), "F5");
        KEY_NAMES.put((int)pm.kxzv("kygt", kyaa(int ), (int)127), "F6");
        KEY_NAMES.put((int)pm.kxzv("kygu", kyaa(int ), (int)128), "F7");
        KEY_NAMES.put((int)pm.kxzv("kygv", kyaa(int ), (int)129), "F8");
        KEY_NAMES.put((int)pm.kxzv("kygw", kyaa(int ), (int)130), "F9");
        KEY_NAMES.put((int)pm.kxzv("kygx", kyaa(int ), (int)131), "F10");
        KEY_NAMES.put((int)pm.kxzv("kygy", kyaa(int ), (int)132), "F11");
        KEY_NAMES.put((int)pm.kxzv("kygz", kyaa(int ), (int)133), "F12");
        KEY_NAMES.put((int)pm.kxzv("kyha", kyaa(int ), (int)134), "Numpad0");
        KEY_NAMES.put((int)pm.kxzv("kyhb", kyaa(int ), (int)135), "Numpad1");
        KEY_NAMES.put((int)pm.kxzv("kyhc", kyaa(int ), (int)136), "Numpad2");
        KEY_NAMES.put((int)pm.kxzv("kyhd", kyaa(int ), (int)137), "Numpad3");
        KEY_NAMES.put((int)pm.kxzv("kyhe", kyaa(int ), (int)138), "Numpad4");
        KEY_NAMES.put((int)pm.kxzv("kyhf", kyaa(int ), (int)139), "Numpad5");
        KEY_NAMES.put((int)pm.kxzv("kyhg", kyaa(int ), (int)140), "Numpad6");
        KEY_NAMES.put((int)pm.kxzv("kyhh", kyaa(int ), (int)141), "Numpad7");
        KEY_NAMES.put((int)pm.kxzv("kyhi", kyaa(int ), (int)142), "Numpad8");
        KEY_NAMES.put((int)pm.kxzv("kyhj", kyaa(int ), (int)143), "Numpad9");
        KEY_NAMES.put((int)pm.kxzv("kyhk", kyaa(int ), (int)144), "NumpadDecimal");
        KEY_NAMES.put((int)pm.kxzv("kyhl", kyaa(int ), (int)145), "NumpadDivide");
        KEY_NAMES.put((int)pm.kxzv("kyhm", kyaa(int ), (int)146), "NumpadMultiply");
        KEY_NAMES.put((int)pm.kxzv("kyhn", kyaa(int ), (int)147), "NumpadSubtract");
        KEY_NAMES.put((int)pm.kxzv("kyho", kyaa(int ), (int)148), "NumpadAdd");
        KEY_NAMES.put((int)pm.kxzv("kyhp", kyaa(int ), (int)149), "NumpadEnter");
        KEY_NAMES.put((int)pm.kxzv("kyhq", kyaa(int ), (int)150), "LShift");
        KEY_NAMES.put((int)pm.kxzv("kyhr", kyaa(int ), (int)151), "LCtrl");
        KEY_NAMES.put((int)pm.kxzv("kyhs", kyaa(int ), (int)152), "LAlt");
        KEY_NAMES.put((int)pm.kxzv("kyht", kyaa(int ), (int)153), "RShift");
        KEY_NAMES.put((int)pm.kxzv("kyhu", kyaa(int ), (int)154), "RCtrl");
        KEY_NAMES.put((int)pm.kxzv("kyhv", kyaa(int ), (int)155), "RAlt");
        KEY_NAMES.put((int)pm.kxzv("kyhw", kyaa(int ), (int)156), "Menu");
        for (Map.Entry<Integer, String> entry : KEY_NAMES.entrySet()) {
            NAME_TO_KEY.put(entry.getValue().toLowerCase(), entry.getKey());
        }
    }

    private static /* synthetic */ void kyhy() {
        pm.kyab[100] = -1375642286;
        pm.kyab[101] = -1175525116;
        pm.kyab[102] = -1181518719;
        pm.kyab[103] = -1771371663;
        pm.kyab[104] = 451448735;
        pm.kyab[105] = -2056099545;
        pm.kyab[106] = -1199951201;
        pm.kyab[107] = -305712815;
        pm.kyab[108] = -606075271;
        pm.kyab[109] = -456833998;
        pm.kyab[110] = 1674763920;
        pm.kyab[111] = 177167803;
        pm.kyab[112] = 1140303420;
        pm.kyab[113] = 496416399;
        pm.kyab[114] = -654500552;
        pm.kyab[115] = -368406734;
        pm.kyab[116] = 763936005;
        pm.kyab[117] = -1493497009;
        pm.kyab[118] = -782107047;
        pm.kyab[119] = -814247161;
        pm.kyab[120] = 1067241718;
        pm.kyab[121] = 1675581639;
        pm.kyab[122] = -1892343619;
        pm.kyab[123] = 375679130;
        pm.kyab[124] = 558099709;
        pm.kyab[125] = -1833966065;
        pm.kyab[126] = 1403229966;
        pm.kyab[127] = 145637631;
        pm.kyab[128] = -1375946648;
        pm.kyab[129] = 1249588817;
        pm.kyab[130] = 281078759;
        pm.kyab[131] = -727627840;
        pm.kyab[132] = -277520137;
        pm.kyab[133] = 1540060071;
        pm.kyab[134] = 467703487;
        pm.kyab[135] = 1062267874;
        pm.kyab[136] = -669765399;
        pm.kyab[137] = 286438694;
        pm.kyab[138] = -687045868;
        pm.kyab[139] = -4821108;
        pm.kyab[140] = 1394811514;
        pm.kyab[141] = -551663872;
        pm.kyab[142] = 1882157841;
        pm.kyab[143] = -1985165305;
        pm.kyab[144] = -1687554204;
        pm.kyab[145] = 349172625;
        pm.kyab[146] = -325802095;
        pm.kyab[147] = -2118241044;
        pm.kyab[148] = 196511423;
        pm.kyab[149] = -241440536;
        pm.kyab[150] = 499901562;
        pm.kyab[151] = -1121384939;
        pm.kyab[152] = -292850279;
        pm.kyab[153] = -549657456;
        pm.kyab[154] = -736908650;
        pm.kyab[155] = 164008136;
        pm.kyab[156] = -1624685453;
    }

    private static /* synthetic */ void kyib() {
        pm.kxzt[0] = 4691946835582305668L;
        pm.kxzt[1] = -3444965848159568756L;
        pm.kxzt[2] = -7874945291719856759L;
        pm.kxzt[3] = 436869431868572464L;
        pm.kxzt[4] = 2650986330916325400L;
        pm.kxzt[5] = 5616180773190748586L;
        pm.kxzt[6] = 4452601145103115935L;
        pm.kxzt[7] = -667722118695192996L;
        pm.kxzt[8] = 4661484431573588357L;
        pm.kxzt[9] = -8992809531488324614L;
        pm.kxzt[10] = 8837457981776033942L;
        pm.kxzt[11] = 8084784485181356528L;
        pm.kxzt[12] = 1265543139953036852L;
        pm.kxzt[13] = -6158215001166125434L;
        pm.kxzt[14] = -7271241522123277829L;
        pm.kxzt[15] = 7200748949239464485L;
        pm.kxzt[16] = -4609234891518534927L;
        pm.kxzt[17] = -5877526726161333013L;
        pm.kxzt[18] = 1986814709114860111L;
        pm.kxzt[19] = 4891693057894830723L;
        pm.kxzt[20] = 6377993867908310791L;
        pm.kxzt[21] = -1114624651924535381L;
        pm.kxzt[22] = -8030648288464668223L;
        pm.kxzt[23] = -126794727879699144L;
        pm.kxzt[24] = 6364957681359667266L;
        pm.kxzt[25] = -4712664801799136753L;
        pm.kxzt[26] = -7664999382755124508L;
        pm.kxzt[27] = -182657512524098711L;
        pm.kxzt[28] = 1001519155362605521L;
        pm.kxzt[29] = 1919010018903535617L;
        pm.kxzt[30] = -8679504096082191445L;
        pm.kxzt[31] = -603117837685244107L;
        pm.kxzt[32] = -2490672502342794571L;
        pm.kxzt[33] = 4831780307580416328L;
        pm.kxzt[34] = 5766649497574739041L;
        pm.kxzt[35] = -2264000049886731081L;
        pm.kxzt[36] = -540345889024028044L;
        pm.kxzt[37] = 4821059795352272179L;
        pm.kxzt[38] = -61778434838618139L;
        pm.kxzt[39] = -1355983917703263640L;
        pm.kxzt[40] = 2418630372604135655L;
        pm.kxzt[41] = 1166749872532780439L;
        pm.kxzt[42] = 3726912973111253064L;
        pm.kxzt[43] = 4747446505389440105L;
        pm.kxzt[44] = -529957553939502811L;
        pm.kxzt[45] = -6687884980136612164L;
        pm.kxzt[46] = 8632729620344514898L;
        pm.kxzt[47] = -5673206569636667992L;
        pm.kxzt[48] = -390426689457138586L;
    }

    private static /* synthetic */ void kyhx() {
        pm.kyab[0] = 1789940617;
        pm.kyab[1] = 1413885265;
        pm.kyab[2] = 444600899;
        pm.kyab[3] = 79053182;
        pm.kyab[4] = -1638076559;
        pm.kyab[5] = 1873441468;
        pm.kyab[6] = 742313823;
        pm.kyab[7] = -1600341610;
        pm.kyab[8] = 1298704796;
        pm.kyab[9] = -1912934549;
        pm.kyab[10] = 250306118;
        pm.kyab[11] = -908398395;
        pm.kyab[12] = -2046838560;
        pm.kyab[13] = 650373378;
        pm.kyab[14] = -938041532;
        pm.kyab[15] = -1085639811;
        pm.kyab[16] = -1551048359;
        pm.kyab[17] = -89331212;
        pm.kyab[18] = -796029876;
        pm.kyab[19] = 1961642261;
        pm.kyab[20] = 1574221066;
        pm.kyab[21] = 1821918159;
        pm.kyab[22] = -198148749;
        pm.kyab[23] = -225829202;
        pm.kyab[24] = -1370509809;
        pm.kyab[25] = 1336616801;
        pm.kyab[26] = 1620295183;
        pm.kyab[27] = -501644461;
        pm.kyab[28] = -271613299;
        pm.kyab[29] = -1020202938;
        pm.kyab[30] = -1570401731;
        pm.kyab[31] = 1801487263;
        pm.kyab[32] = -1771613815;
        pm.kyab[33] = -719588009;
        pm.kyab[34] = 1551299725;
        pm.kyab[35] = -1644469828;
        pm.kyab[36] = -489360271;
        pm.kyab[37] = 1072857890;
        pm.kyab[38] = -722041237;
        pm.kyab[39] = -28314211;
        pm.kyab[40] = 361010091;
        pm.kyab[41] = 229423817;
        pm.kyab[42] = 1045117730;
        pm.kyab[43] = 686358253;
        pm.kyab[44] = 1483596222;
        pm.kyab[45] = 1201818631;
        pm.kyab[46] = -80281480;
        pm.kyab[47] = -1740446272;
        pm.kyab[48] = 1148647082;
        pm.kyab[49] = -356824344;
        pm.kyab[50] = 495087120;
        pm.kyab[51] = 847575594;
        pm.kyab[52] = 16085732;
        pm.kyab[53] = 1261695307;
        pm.kyab[54] = 777723156;
        pm.kyab[55] = 822375113;
        pm.kyab[56] = 1959669088;
        pm.kyab[57] = -173583199;
        pm.kyab[58] = -646625739;
        pm.kyab[59] = -1276756926;
        pm.kyab[60] = -1450178879;
        pm.kyab[61] = 1142330783;
        pm.kyab[62] = -182494391;
        pm.kyab[63] = 240554868;
        pm.kyab[64] = -240866539;
        pm.kyab[65] = -1843680089;
        pm.kyab[66] = -899463574;
        pm.kyab[67] = -288463806;
        pm.kyab[68] = 131468147;
        pm.kyab[69] = -1499385263;
        pm.kyab[70] = 1931203074;
        pm.kyab[71] = 1692262095;
        pm.kyab[72] = 298406553;
        pm.kyab[73] = -1524113630;
        pm.kyab[74] = -43324901;
        pm.kyab[75] = 1091963615;
        pm.kyab[76] = 929470132;
        pm.kyab[77] = 603566057;
        pm.kyab[78] = 2074316182;
        pm.kyab[79] = -1695254432;
        pm.kyab[80] = 315934953;
        pm.kyab[81] = 1714807761;
        pm.kyab[82] = -880501289;
        pm.kyab[83] = -1152295205;
        pm.kyab[84] = 1361422217;
        pm.kyab[85] = -543142058;
        pm.kyab[86] = -842012351;
        pm.kyab[87] = -1593722387;
        pm.kyab[88] = 1531298131;
        pm.kyab[89] = 2010229806;
        pm.kyab[90] = -1038410697;
        pm.kyab[91] = 107232643;
        pm.kyab[92] = -176114040;
        pm.kyab[93] = -770841084;
        pm.kyab[94] = 678327779;
        pm.kyab[95] = -2102840042;
        pm.kyab[96] = 573201259;
        pm.kyab[97] = -1176466235;
        pm.kyab[98] = -1256233900;
        pm.kyab[99] = -1240294796;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static int getKeyCode(String string) {
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = th - pm.kxzv("kyax", kxzs(int ), (int)14)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == pm.kxzv("kyay", kyaa(int ), (int)10)) break;
            object = pm.kxzv("kyaz", kyaa(int ), (int)11);
        }
        boolean bl2 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = th - pm.kxzv("kyba", kxzs(int ), (int)15)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == pm.kxzv("kybb", kyaa(int ), (int)12)) break;
            object = pm.kxzv("kybc", kyaa(int ), (int)13);
        }
        int n2 = b;
        Object object = th;
        block22: while (true) {
            switch ((int)object) {
                case -989891791: {
                    object = pm.kxzv("kybe", kxzs(int ), (int)17) - pm.kxzv("kybd", kxzs(int ), (int)16);
                    continue block22;
                }
                case -492461933: {
                    break block22;
                }
            }
            break;
        }
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3) return (int)pm.kxzv("kybf", kyaa(int ), (int)14);
        if (bl3) return (int)pm.kxzv("kybf", kyaa(int ), (int)14);
        Object object2 = th;
        boolean bl4 = true;
        block23: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - pm.kxzv("kybg", kxzs(int ), (int)18);
            }
            switch ((int)object2) {
                case -1738654062: {
                    callSite = pm.kxzv("kybh", kxzs(int ), (int)19);
                    continue block23;
                }
                case -841704902: {
                    callSite = pm.kxzv("kybi", kxzs(int ), (int)20);
                    continue block23;
                }
                case -492461933: {
                    break block23;
                }
                case 747055791: {
                    callSite = pm.kxzv("kybj", kxzs(int ), (int)21);
                    continue block23;
                }
            }
            break;
        }
        Object object3 = th;
        block24: while (true) {
            switch ((int)object3) {
                case -1639481980: {
                    object3 = pm.kxzv("kybl", kxzs(int ), (int)23) - pm.kxzv("kybk", kxzs(int ), (int)22);
                    continue block24;
                }
                case -492461933: {
                    break block24;
                }
            }
            break;
        }
        String string2 = string.toLowerCase();
        CallSite callSite = pm.kxzv("kybm", kyaa(int ), (int)15);
        Object object4 = th;
        boolean bl5 = true;
        block25: while (true) {
            CallSite callSite2;
            if (!bl5 || (bl5 = false) || !true) {
                object4 = callSite2 - pm.kxzv("kybn", kxzs(int ), (int)24);
            }
            switch ((int)object4) {
                case -492461933: {
                    break block25;
                }
                case -375614109: {
                    callSite2 = pm.kxzv("kybo", kxzs(int ), (int)25);
                    continue block25;
                }
                case 370890771: {
                    callSite2 = pm.kxzv("kybp", kxzs(int ), (int)26);
                    continue block25;
                }
                case 1082357425: {
                    callSite2 = pm.kxzv("kybq", kxzs(int ), (int)27);
                    continue block25;
                }
            }
            break;
        }
        Integer n3 = (int)callSite;
        while (true) {
            long l4;
            Object object5;
            if ((object5 = (l4 = th - pm.kxzv("kybr", kxzs(int ), (int)28)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object5 == pm.kxzv("kybs", kyaa(int ), (int)16)) break;
            object5 = pm.kxzv("kybt", kyaa(int ), (int)17);
        }
        while (true) {
            long l5;
            Object object6;
            if ((object6 = (l5 = th - pm.kxzv("kybu", kxzs(int ), (int)29)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object6 == pm.kxzv("kybv", kyaa(int ), (int)18)) {
                return NAME_TO_KEY.getOrDefault(string2, n3);
            }
            object6 = pm.kxzv("kybw", kyaa(int ), (int)19);
        }
    }

    private static /* synthetic */ void kyic() {
        pm.kxzu[0] = -8495846214063643714L;
        pm.kxzu[1] = 6027252951653748569L;
        pm.kxzu[2] = 4865475034686929048L;
        pm.kxzu[3] = -2118152436916923762L;
        pm.kxzu[4] = 5692245948162838913L;
        pm.kxzu[5] = 5679580765562821038L;
        pm.kxzu[6] = 1553787391189617452L;
        pm.kxzu[7] = -2081251258213116009L;
        pm.kxzu[8] = 870159348587684241L;
        pm.kxzu[9] = 9010083664258037555L;
        pm.kxzu[10] = -1436737821574025273L;
        pm.kxzu[11] = -574079702577676291L;
        pm.kxzu[12] = 8714993290557556779L;
        pm.kxzu[13] = 908524285167334217L;
        pm.kxzu[14] = -8187824986105947118L;
        pm.kxzu[15] = -7295499507638125530L;
        pm.kxzu[16] = -8699213790966687786L;
        pm.kxzu[17] = -6765407344663712657L;
        pm.kxzu[18] = 5029173673970856809L;
        pm.kxzu[19] = 986500251838847383L;
        pm.kxzu[20] = -8711067933361169656L;
        pm.kxzu[21] = 7291688666375114079L;
        pm.kxzu[22] = -1782161418896925580L;
        pm.kxzu[23] = -7531859882733133641L;
        pm.kxzu[24] = -1761544378862708249L;
        pm.kxzu[25] = 8273799946669628384L;
        pm.kxzu[26] = -4704316164481705676L;
        pm.kxzu[27] = 6734848606227742862L;
        pm.kxzu[28] = -4813752284776633426L;
        pm.kxzu[29] = 4890833237045331901L;
        pm.kxzu[30] = -8959423274181229138L;
        pm.kxzu[31] = 9080129938752632662L;
        pm.kxzu[32] = -7650980699011198181L;
        pm.kxzu[33] = -4914766131062832057L;
        pm.kxzu[34] = 6697699443008182168L;
        pm.kxzu[35] = -7970479480030954896L;
        pm.kxzu[36] = -1979908720389196927L;
        pm.kxzu[37] = 442382309890550676L;
        pm.kxzu[38] = -3617949080884361015L;
        pm.kxzu[39] = 524457937052573267L;
        pm.kxzu[40] = 1099393546135379729L;
        pm.kxzu[41] = -1696721606402373358L;
        pm.kxzu[42] = -3780130830727379469L;
        pm.kxzu[43] = -3702688800923809591L;
        pm.kxzu[44] = -4850394404153899181L;
        pm.kxzu[45] = -2775234071312878029L;
        pm.kxzu[46] = 3262997865126472437L;
        pm.kxzu[47] = -4440361252966407552L;
        pm.kxzu[48] = -6414297727525217713L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static String[] getAllKeyNames() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = pm.th - pm.kxzv("kycx", kxzs(int ), (int)41)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == pm.kxzv("kycy", kyaa(int ), (int)35)) break;
            v0 /* !! */  = (long)pm.kxzv("kycz", kyaa(int ), (int)36);
        }
        var2 = pm.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = pm.th - pm.kxzv("kyda", kxzs(int ), (int)42)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == pm.kxzv("kydb", kyaa(int ), (int)37)) break;
            v1 /* !! */  = (long)pm.kxzv("kydc", kyaa(int ), (int)38);
        }
        var1_1 /* !! */  = pm.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = pm.th - pm.kxzv("kydd", kxzs(int ), (int)43)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == pm.kxzv("kyde", kyaa(int ), (int)39)) break;
            v2 /* !! */  = (long)pm.kxzv("kydf", kyaa(int ), (int)40);
        }
        var0_2 = pm.a;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = pm.th - pm.kxzv("kydg", kxzs(int ), (int)44)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == pm.kxzv("kydh", kyaa(int ), (int)41)) break;
                    v3 /* !! */  = (long)pm.kxzv("kydi", kyaa(int ), (int)42);
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_4 = pm.th - pm.kxzv("kydj", kxzs(int ), (int)45)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == pm.kxzv("kydk", kyaa(int ), (int)43)) break;
                    v4 /* !! */  = (long)pm.kxzv("kydl", kyaa(int ), (int)44);
                }
                v5 = pm.KEY_NAMES.values();
                v6 = new String[]{};
                v7 /* !! */  = pm.th;
                if (true) ** GOTO lbl43
                block17: while (true) {
                    v7 /* !! */  = (long)(v8 - pm.kxzv("kydm", kxzs(int ), (int)46));
lbl43:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -2116603029: {
                            v8 = pm.kxzv("kydn", kxzs(int ), (int)47);
                            continue block17;
                        }
                        case -492461933: {
                            break block17;
                        }
                        case 628926900: {
                            v8 = pm.kxzv("kydo", kxzs(int ), (int)48);
                            continue block17;
                        }
                    }
                    break;
                }
                return v5.toArray(v6);
            }
            case 0: {
                do {
                    var1_1 /* !! */  = (int)pm.kxzv("kydp", kyaa(int ), (int)45);
                } while (!var2);
                throw null;
            }
lbl58:
            // 2 sources

            case 1: {
                var1_1 /* !! */  = (int)pm.kxzv("kydq", kyaa(int ), (int)46);
                if (!var2) break;
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)pm.kxzv("kydr", kyaa(int ), (int)47);
                if (!var2) ** GOTO lbl58
                throw null;
            }
            case 3: 
        }
        do {
            var1_1 /* !! */  = (int)pm.kxzv("kyds", kyaa(int ), (int)48);
        } while (!var2);
        throw null;
    }
}

