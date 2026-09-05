/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

final class iy$StorageType
extends Enum<iy$StorageType> {
    private static final long sy = -7835774276125304943L;
    private static final /* synthetic */ iy$StorageType[] $VALUES;
    private final String blockName;
    public static final /* enum */ iy$StorageType CHEST;
    private static long[] kqrj;
    public static final /* enum */ iy$StorageType BREWING_STAND;
    public static final int b;
    private final int color;
    private static int[] kqry;
    public static final /* enum */ iy$StorageType SHULKER;
    private static long[] kqri;
    private static int[] kqrw;
    public static final boolean a;
    public static final boolean c;

    private static /* synthetic */ long kqrg(int n2) {
        return kqri[n2] ^ kqrj[n2];
    }

    public static /* synthetic */ CallSite kqrl(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static iy$StorageType valueOf(String var0) {
        v0 /* !! */  = iy$StorageType.sy;
        if (true) ** GOTO lbl5
        block10: while (true) {
            v0 /* !! */  = (long)(iy$StorageType.kqrl("kqtb", kqrg(int ), (int)7) - iy$StorageType.kqrl("kqsz", kqrg(int ), (int)6));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1471159955: {
                    continue block10;
                }
                case -1016572015: {
                    break block10;
                }
            }
            break;
        }
        var3_1 = iy$StorageType.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = iy$StorageType.sy - iy$StorageType.kqrl("kqte", kqrg(int ), (int)8)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == iy$StorageType.kqrl("kqtf", kqrv(int ), (int)12)) break;
            v1 /* !! */  = (long)iy$StorageType.kqrl("kqtg", kqrv(int ), (int)13);
        }
        var2_2 = iy$StorageType.b;
        v2 /* !! */  = iy$StorageType.sy;
        if (true) ** GOTO lbl22
        block12: while (true) {
            v2 /* !! */  = (long)(v3 - iy$StorageType.kqrl("kqth", kqrg(int ), (int)9));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2094267585: {
                    v3 = iy$StorageType.kqrl("kqtj", kqrg(int ), (int)10);
                    continue block12;
                }
                case -1016572015: {
                    break block12;
                }
                case -740402359: {
                    v3 = iy$StorageType.kqrl("kqtl", kqrg(int ), (int)11);
                    continue block12;
                }
                case 468175637: {
                    v3 = iy$StorageType.kqrl("kqtn", kqrg(int ), (int)12);
                    continue block12;
                }
            }
            break;
        }
        var1_3 = iy$StorageType.a;
        if (var3_1) {
            throw null;
lbl37:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl40:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = iy$StorageType.sy - iy$StorageType.kqrl("kqtr", kqrg(int ), (int)13)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == iy$StorageType.kqrl("kqts", kqrv(int ), (int)14)) break;
            v4 /* !! */  = (long)iy$StorageType.kqrl("kqtu", kqrv(int ), (int)15);
        }
        return Enum.valueOf(iy$StorageType.class, var0);
    }

    private static /* synthetic */ void kqwl() {
        iy$StorageType.kqrw[0] = 1781644123;
        iy$StorageType.kqrw[1] = 1688739920;
        iy$StorageType.kqrw[2] = -1048681;
        iy$StorageType.kqrw[3] = -1032190459;
        iy$StorageType.kqrw[4] = -277599943;
        iy$StorageType.kqrw[5] = 1758324998;
        iy$StorageType.kqrw[6] = 1742505774;
        iy$StorageType.kqrw[7] = 1049948723;
        iy$StorageType.kqrw[8] = -814892867;
        iy$StorageType.kqrw[9] = -790570402;
        iy$StorageType.kqrw[10] = -1973898268;
        iy$StorageType.kqrw[11] = -690217983;
        iy$StorageType.kqrw[12] = -1703080057;
        iy$StorageType.kqrw[13] = -894195735;
        iy$StorageType.kqrw[14] = -1603252239;
        iy$StorageType.kqrw[15] = -1929067605;
        iy$StorageType.kqrw[16] = -491459253;
        iy$StorageType.kqrw[17] = -959880543;
        iy$StorageType.kqrw[18] = -1766534150;
        iy$StorageType.kqrw[19] = 2116116511;
        iy$StorageType.kqrw[20] = 134269253;
        iy$StorageType.kqrw[21] = -2012427593;
        iy$StorageType.kqrw[22] = 321123919;
        iy$StorageType.kqrw[23] = -1825539510;
        iy$StorageType.kqrw[24] = 1791207350;
        iy$StorageType.kqrw[25] = 1491403448;
        iy$StorageType.kqrw[26] = -832262929;
        iy$StorageType.kqrw[27] = 662193617;
        iy$StorageType.kqrw[28] = -988177859;
        iy$StorageType.kqrw[29] = -451063039;
        iy$StorageType.kqrw[30] = 1018737893;
        iy$StorageType.kqrw[31] = -264012550;
        iy$StorageType.kqrw[32] = 1613599380;
        iy$StorageType.kqrw[33] = -1884624440;
        iy$StorageType.kqrw[34] = -1952145099;
        iy$StorageType.kqrw[35] = 110485940;
        iy$StorageType.kqrw[36] = 2045574186;
        iy$StorageType.kqrw[37] = -1520841622;
        iy$StorageType.kqrw[38] = -1013863775;
        iy$StorageType.kqrw[39] = 1207114851;
        iy$StorageType.kqrw[40] = -1490229313;
        iy$StorageType.kqrw[41] = 1121480105;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static iy$StorageType[] values() {
        v0 /* !! */  = iy$StorageType.sy;
        if (true) ** GOTO lbl5
        block10: while (true) {
            v0 /* !! */  = (long)(iy$StorageType.kqrl("kqrq", kqrg(int ), (int)1) - iy$StorageType.kqrl("kqro", kqrg(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1016572015: {
                    break block10;
                }
                case 659574890: {
                    continue block10;
                }
            }
            break;
        }
        var2 = iy$StorageType.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = iy$StorageType.sy - iy$StorageType.kqrl("kqrs", kqrg(int ), (int)2)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == iy$StorageType.kqrl("kqsa", kqrv(int ), (int)0)) break;
            v1 /* !! */  = (long)iy$StorageType.kqrl("kqsb", kqrv(int ), (int)1);
        }
        var1_1 /* !! */  = iy$StorageType.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = iy$StorageType.sy - iy$StorageType.kqrl("kqsd", kqrg(int ), (int)3)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == iy$StorageType.kqrl("kqsf", kqrv(int ), (int)2)) break;
            v2 /* !! */  = (long)iy$StorageType.kqrl("kqsh", kqrv(int ), (int)3);
        }
        var0_2 = iy$StorageType.a;
        if (var2) {
            throw null;
lbl27:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl27
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = iy$StorageType.sy - iy$StorageType.kqrl("kqsk", kqrg(int ), (int)4)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == iy$StorageType.kqrl("kqsl", kqrv(int ), (int)4)) break;
                    v3 /* !! */  = (long)iy$StorageType.kqrl("kqsn", kqrv(int ), (int)5);
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = iy$StorageType.sy - iy$StorageType.kqrl("kqso", kqrg(int ), (int)5)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == iy$StorageType.kqrl("kqsp", kqrv(int ), (int)6)) break;
                    v4 /* !! */  = (long)iy$StorageType.kqrl("kqsq", kqrv(int ), (int)7);
                }
                return (iy$StorageType[])iy$StorageType.$VALUES.clone();
            }
lbl47:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)iy$StorageType.kqrl("kqsr", kqrv(int ), (int)8);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl57
            }
            case 1: {
                do {
                    var1_1 /* !! */  = (int)iy$StorageType.kqrl("kqss", kqrv(int ), (int)9);
                } while (!var2);
                throw null;
            }
lbl57:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)iy$StorageType.kqrl("kqst", kqrv(int ), (int)10);
                    if (!var2) ** GOTO lbl47
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)iy$StorageType.kqrl("kqsu", kqrv(int ), (int)11);
        ** while (!var2)
lbl65:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kqwx() {
        iy$StorageType.kqrj[0] = 4759139677941328407L;
        iy$StorageType.kqrj[1] = 8643617961997253567L;
        iy$StorageType.kqrj[2] = -6590938868572776296L;
        iy$StorageType.kqrj[3] = 1288107745722212070L;
        iy$StorageType.kqrj[4] = -2245261855114099792L;
        iy$StorageType.kqrj[5] = 3833697168080114281L;
        iy$StorageType.kqrj[6] = 3551271680420809475L;
        iy$StorageType.kqrj[7] = -5241574075547252349L;
        iy$StorageType.kqrj[8] = 3223045128530051481L;
        iy$StorageType.kqrj[9] = -8723969964018230290L;
        iy$StorageType.kqrj[10] = 4677919303952098974L;
        iy$StorageType.kqrj[11] = -8384110147548175239L;
        iy$StorageType.kqrj[12] = -1695894719850105553L;
        iy$StorageType.kqrj[13] = -5205114979263517773L;
        iy$StorageType.kqrj[14] = 875333081989316854L;
        iy$StorageType.kqrj[15] = 2923221785265261721L;
        iy$StorageType.kqrj[16] = 3354787692481130442L;
        iy$StorageType.kqrj[17] = -6676003427894526714L;
        iy$StorageType.kqrj[18] = 8027680732356430554L;
        iy$StorageType.kqrj[19] = -3591902152570533115L;
        iy$StorageType.kqrj[20] = -5434166235503730061L;
        iy$StorageType.kqrj[21] = 4450466743596382085L;
        iy$StorageType.kqrj[22] = 3596277758061507260L;
        iy$StorageType.kqrj[23] = -6675289838321002673L;
        iy$StorageType.kqrj[24] = -5408047700875461237L;
        iy$StorageType.kqrj[25] = -6852074600955728633L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private iy$StorageType(String var3_3, int var4_4) {
        var6_5 /* !! */  = iy$StorageType.b;
        var5_6 = iy$StorageType.a;
        super(var1_1, var2_2);
        this.blockName = var3_3;
        if (var6_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.color = var4_4;
                return;
            }
lbl10:
            // 3 sources

            case 0: {
                var6_5 /* !! */  = (int)iy$StorageType.kqrl("kqui", kqrv(int ), (int)20);
                break;
            }
            case 1: {
                var6_5 /* !! */  = (int)iy$StorageType.kqrl("kquk", kqrv(int ), (int)21);
                ** GOTO lbl10
            }
            case 2: {
                var6_5 /* !! */  = (int)iy$StorageType.kqrl("kqul", kqrv(int ), (int)22);
                break;
            }
            case 3: {
                var6_5 /* !! */  = (int)iy$StorageType.kqrl("kqun", kqrv(int ), (int)23);
                ** GOTO lbl10
            }
            case 4: 
        }
        while (true) {
            var6_5 /* !! */  = (int)iy$StorageType.kqrl("kqup", kqrv(int ), (int)24);
        }
    }

    private static /* synthetic */ void kqwo() {
        iy$StorageType.kqry[0] = 1781644122;
        iy$StorageType.kqry[1] = 2132633482;
        iy$StorageType.kqry[2] = 1048680;
        iy$StorageType.kqry[3] = -491021142;
        iy$StorageType.kqry[4] = 277599942;
        iy$StorageType.kqry[5] = -111189992;
        iy$StorageType.kqry[6] = -1742505775;
        iy$StorageType.kqry[7] = -784523209;
        iy$StorageType.kqry[8] = -814892866;
        iy$StorageType.kqry[9] = -790570404;
        iy$StorageType.kqry[10] = -1973898266;
        iy$StorageType.kqry[11] = -690217983;
        iy$StorageType.kqry[12] = 1703080056;
        iy$StorageType.kqry[13] = 1514811275;
        iy$StorageType.kqry[14] = 1603252238;
        iy$StorageType.kqry[15] = 533560078;
        iy$StorageType.kqry[16] = -491459254;
        iy$StorageType.kqry[17] = -959880542;
        iy$StorageType.kqry[18] = -1766534151;
        iy$StorageType.kqry[19] = 2116116510;
        iy$StorageType.kqry[20] = 134269254;
        iy$StorageType.kqry[21] = -2012427597;
        iy$StorageType.kqry[22] = 321123916;
        iy$StorageType.kqry[23] = -1825539509;
        iy$StorageType.kqry[24] = 1791207351;
        iy$StorageType.kqry[25] = -1491403449;
        iy$StorageType.kqry[26] = -1416076671;
        iy$StorageType.kqry[27] = 662193617;
        iy$StorageType.kqry[28] = -988177860;
        iy$StorageType.kqry[29] = 451063038;
        iy$StorageType.kqry[30] = 1018737895;
        iy$StorageType.kqry[31] = 264012549;
        iy$StorageType.kqry[32] = 1613599383;
        iy$StorageType.kqry[33] = -1884624440;
        iy$StorageType.kqry[34] = -1952145097;
        iy$StorageType.kqry[35] = 110485942;
        iy$StorageType.kqry[36] = 2045574186;
        iy$StorageType.kqry[37] = -1519637968;
        iy$StorageType.kqry[38] = -1013863776;
        iy$StorageType.kqry[39] = 1191987631;
        iy$StorageType.kqry[40] = -1490229315;
        iy$StorageType.kqry[41] = 1109903258;
    }

    private static /* synthetic */ void kqwu() {
        iy$StorageType.kqri[0] = 3162053743862308045L;
        iy$StorageType.kqri[1] = 3421073050323573312L;
        iy$StorageType.kqri[2] = 2874947355710053562L;
        iy$StorageType.kqri[3] = -5755170770374321020L;
        iy$StorageType.kqri[4] = 4178011260322489224L;
        iy$StorageType.kqri[5] = 7747663890272910483L;
        iy$StorageType.kqri[6] = -665721168463419384L;
        iy$StorageType.kqri[7] = 453514078209554514L;
        iy$StorageType.kqri[8] = 1902415559424597053L;
        iy$StorageType.kqri[9] = -6803894135448948342L;
        iy$StorageType.kqri[10] = 3124810997787592381L;
        iy$StorageType.kqri[11] = 3507291652774549510L;
        iy$StorageType.kqri[12] = -1282614048156889623L;
        iy$StorageType.kqri[13] = 5823222765586189791L;
        iy$StorageType.kqri[14] = -5825904340071756191L;
        iy$StorageType.kqri[15] = 4451561130099624939L;
        iy$StorageType.kqri[16] = 4797377716273029590L;
        iy$StorageType.kqri[17] = -1301665132256294824L;
        iy$StorageType.kqri[18] = 5865714351016233929L;
        iy$StorageType.kqri[19] = 4749811403527397846L;
        iy$StorageType.kqri[20] = 2692036952122610192L;
        iy$StorageType.kqri[21] = 7421978993032962204L;
        iy$StorageType.kqri[22] = 8209125942276476906L;
        iy$StorageType.kqri[23] = 2966915804712558099L;
        iy$StorageType.kqri[24] = 1126351893648399065L;
        iy$StorageType.kqri[25] = -6860927426829403489L;
    }

    private static /* synthetic */ int kqrv(int n2) {
        return kqrw[n2] ^ kqry[n2];
    }

    static {
        kqrw = new int[42];
        kqry = new int[42];
        iy$StorageType.kqwl();
        iy$StorageType.kqwo();
        kqri = new long[26];
        kqrj = new long[26];
        iy$StorageType.kqwu();
        iy$StorageType.kqwx();
        CHEST = new iy$StorageType("chest", (int)iy$StorageType.kqrl("kqwd", kqrv(int ), (int)37));
        SHULKER = new iy$StorageType("shulker_box", (int)iy$StorageType.kqrl("kqwf", kqrv(int ), (int)39));
        BREWING_STAND = new iy$StorageType("brewing_stand", (int)iy$StorageType.kqrl("kqwi", kqrv(int ), (int)41));
        $VALUES = iy$StorageType.$values();
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ iy$StorageType[] $values() {
        Object object = sy;
        boolean bl2 = true;
        block15: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - iy$StorageType.kqrl("kqus", kqrg(int ), (int)14);
            }
            switch ((int)object) {
                case -1226787242: {
                    callSite = iy$StorageType.kqrl("kquu", kqrg(int ), (int)15);
                    continue block15;
                }
                case -1016572015: {
                    break block15;
                }
                case 479564416: {
                    callSite = iy$StorageType.kqrl("kquw", kqrg(int ), (int)16);
                    continue block15;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = sy - iy$StorageType.kqrl("kquy", kqrg(int ), (int)17)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == iy$StorageType.kqrl("kqva", kqrv(int ), (int)25)) break;
            object2 = iy$StorageType.kqrl("kqvb", kqrv(int ), (int)26);
        }
        int n2 = b;
        Object object3 = sy;
        block17: while (true) {
            switch ((int)object3) {
                case -1016572015: {
                    break block17;
                }
                case 565285109: {
                    object3 = iy$StorageType.kqrl("kqvf", kqrg(int ), (int)19) - iy$StorageType.kqrl("kqvd", kqrg(int ), (int)18);
                    continue block17;
                }
            }
            break;
        }
        boolean bl4 = a;
        if (bl3) {
            throw null;
        }
        if (bl4 || bl4) {
            return null;
        }
        iy$StorageType[] iy$StorageTypeArray = new iy$StorageType[3];
        CallSite callSite = iy$StorageType.kqrl("kqvh", kqrv(int ), (int)27);
        Object object4 = sy;
        boolean bl5 = true;
        block18: while (true) {
            CallSite callSite2;
            if (!bl5 || (bl5 = false) || !true) {
                object4 = callSite2 - iy$StorageType.kqrl("kqvj", kqrg(int ), (int)20);
            }
            switch ((int)object4) {
                case -1671309028: {
                    callSite2 = iy$StorageType.kqrl("kqvl", kqrg(int ), (int)21);
                    continue block18;
                }
                case -1216268136: {
                    callSite2 = iy$StorageType.kqrl("kqvm", kqrg(int ), (int)22);
                    continue block18;
                }
                case -1016572015: {
                    break block18;
                }
                case -365920258: {
                    callSite2 = iy$StorageType.kqrl("kqvo", kqrg(int ), (int)23);
                    continue block18;
                }
            }
            break;
        }
        iy$StorageTypeArray[callSite] = CHEST;
        CallSite callSite3 = iy$StorageType.kqrl("kqvp", kqrv(int ), (int)28);
        while (true) {
            long l3;
            long l4;
            if ((l4 = (l3 = sy - iy$StorageType.kqrl("kqvq", kqrg(int ), (int)24)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (l4 == iy$StorageType.kqrl("kqvr", kqrv(int ), (int)29)) break;
            l4 = 1047758176;
        }
        iy$StorageTypeArray[callSite3] = SHULKER;
        CallSite callSite4 = iy$StorageType.kqrl("kqvs", kqrv(int ), (int)30);
        while (true) {
            long l5;
            long l6;
            if ((l6 = (l5 = sy - iy$StorageType.kqrl("kqvt", kqrg(int ), (int)25)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (l6 == iy$StorageType.kqrl("kqvv", kqrv(int ), (int)31)) {
                iy$StorageTypeArray[callSite4] = BREWING_STAND;
                return iy$StorageTypeArray;
            }
            l6 = -1593170421;
        }
    }
}

