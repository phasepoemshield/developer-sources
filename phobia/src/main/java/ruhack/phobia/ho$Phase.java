/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

final class ho$Phase
extends Enum<ho$Phase> {
    private static final long ab = -5514046090743757197L;
    public static final /* enum */ ho$Phase IDLE;
    public static final boolean a;
    public static final /* enum */ ho$Phase REQUEST_JUMP;
    private static final /* synthetic */ ho$Phase[] $VALUES;
    private static int[] fyb;
    private static int[] fya;
    public static final /* enum */ ho$Phase WAIT_NEW_STOP;
    public static final boolean c;
    public static final /* enum */ ho$Phase WAIT_AIRBORNE_PACKET;
    public static final /* enum */ ho$Phase WAIT_ROTATE;
    private static long[] fxq;
    public static final int b;
    public static final /* enum */ ho$Phase WAIT_RESTORE;
    private static long[] fxr;

    static {
        fya = new int[42];
        fyb = new int[42];
        ho$Phase.gjp();
        ho$Phase.gjq();
        fxq = new long[36];
        fxr = new long[36];
        ho$Phase.gjr();
        ho$Phase.gjs();
        IDLE = new ho$Phase();
        WAIT_NEW_STOP = new ho$Phase();
        WAIT_ROTATE = new ho$Phase();
        REQUEST_JUMP = new ho$Phase();
        WAIT_AIRBORNE_PACKET = new ho$Phase();
        WAIT_RESTORE = new ho$Phase();
        $VALUES = ho$Phase.$values();
    }

    public static /* synthetic */ CallSite fxs(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void gjs() {
        ho$Phase.fxr[0] = -5121343149967975057L;
        ho$Phase.fxr[1] = 3396629304692614018L;
        ho$Phase.fxr[2] = 6613606112315930179L;
        ho$Phase.fxr[3] = 4250813767598109840L;
        ho$Phase.fxr[4] = -2166179914763779496L;
        ho$Phase.fxr[5] = -1093986652160116136L;
        ho$Phase.fxr[6] = 5352039071885832665L;
        ho$Phase.fxr[7] = -6544544288187653682L;
        ho$Phase.fxr[8] = 3963625312030132372L;
        ho$Phase.fxr[9] = 3253893045802198356L;
        ho$Phase.fxr[10] = -3854786206099067322L;
        ho$Phase.fxr[11] = -5340945442528452562L;
        ho$Phase.fxr[12] = 2034278973316994493L;
        ho$Phase.fxr[13] = 1937834110075522282L;
        ho$Phase.fxr[14] = -3795348185267240L;
        ho$Phase.fxr[15] = -424885731848555467L;
        ho$Phase.fxr[16] = -1596325021241467359L;
        ho$Phase.fxr[17] = -3037441798008867639L;
        ho$Phase.fxr[18] = -7352043538798741932L;
        ho$Phase.fxr[19] = 2937888763517205125L;
        ho$Phase.fxr[20] = 2025317128064816226L;
        ho$Phase.fxr[21] = -1425369345887800829L;
        ho$Phase.fxr[22] = 7797028982685572866L;
        ho$Phase.fxr[23] = -7576293186900321454L;
        ho$Phase.fxr[24] = -6076056694280339077L;
        ho$Phase.fxr[25] = -8375854433933344106L;
        ho$Phase.fxr[26] = -843479926926282998L;
        ho$Phase.fxr[27] = 7464476667733775681L;
        ho$Phase.fxr[28] = -5477134189139212570L;
        ho$Phase.fxr[29] = -5923890981316817294L;
        ho$Phase.fxr[30] = 875134756308297362L;
        ho$Phase.fxr[31] = 139274076934440054L;
        ho$Phase.fxr[32] = -5178280258565772807L;
        ho$Phase.fxr[33] = 8421189562369952167L;
        ho$Phase.fxr[34] = 6406664368783060427L;
        ho$Phase.fxr[35] = -188214792378724547L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ho$Phase[] values() {
        v0 /* !! */  = ho$Phase.ab;
        if (true) ** GOTO lbl5
        block10: while (true) {
            v0 /* !! */  = (long)(v1 - ho$Phase.fxs("fxt", fxp(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1911142797: {
                    break block10;
                }
                case -1253751081: {
                    v1 = ho$Phase.fxs("fxu", fxp(int ), (int)1);
                    continue block10;
                }
                case 172398449: {
                    v1 = ho$Phase.fxs("fxw", fxp(int ), (int)2);
                    continue block10;
                }
            }
            break;
        }
        var2 = ho$Phase.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ho$Phase.ab - ho$Phase.fxs("fxx", fxp(int ), (int)3)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ho$Phase.fxs("fyc", fxz(int ), (int)0)) break;
            v2 /* !! */  = (long)ho$Phase.fxs("fye", fxz(int ), (int)1);
        }
        var1_1 = ho$Phase.b;
        v3 /* !! */  = ho$Phase.ab;
        if (true) ** GOTO lbl26
        block12: while (true) {
            v3 /* !! */  = (long)(v4 - ho$Phase.fxs("fyf", fxp(int ), (int)4));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1911142797: {
                    break block12;
                }
                case -1804286371: {
                    v4 = ho$Phase.fxs("fyh", fxp(int ), (int)5);
                    continue block12;
                }
                case 39444158: {
                    v4 = ho$Phase.fxs("fyi", fxp(int ), (int)6);
                    continue block12;
                }
            }
            break;
        }
        var0_2 = ho$Phase.a;
        if (var2) {
            throw null;
lbl38:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl41:
        // 1 sources

        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = ho$Phase.ab - ho$Phase.fxs("fyk", fxp(int ), (int)7)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == ho$Phase.fxs("fyl", fxz(int ), (int)2)) break;
            v5 /* !! */  = (long)ho$Phase.fxs("fym", fxz(int ), (int)3);
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = ho$Phase.ab - ho$Phase.fxs("fyn", fxp(int ), (int)8)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v6 /* !! */  == ho$Phase.fxs("fyo", fxz(int ), (int)4)) break;
            v6 /* !! */  = (long)ho$Phase.fxs("fyp", fxz(int ), (int)5);
        }
        return (ho$Phase[])ho$Phase.$VALUES.clone();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static ho$Phase valueOf(String var0) {
        while (true) {
            block26: {
                if ((v0 /* !! */  = (cfr_temp_0 = ho$Phase.ab - ho$Phase.fxs("fyx", fxp(int ), (int)9)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  != ho$Phase.fxs("fyy", fxz(int ), (int)10)) break block26;
                var3_1 = ho$Phase.c;
                v1 /* !! */  = ho$Phase.ab;
                if (true) ** GOTO lbl13
            }
            v0 /* !! */  = (long)ho$Phase.fxs("fyz", fxz(int ), (int)11);
        }
        block13: while (true) {
            v1 /* !! */  = (long)(v2 - ho$Phase.fxs("fza", fxp(int ), (int)10));
lbl13:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2087743709: {
                    v2 = ho$Phase.fxs("fzb", fxp(int ), (int)11);
                    continue block13;
                }
                case -1911142797: {
                    break block13;
                }
                case -1333637654: {
                    v2 = ho$Phase.fxs("fzc", fxp(int ), (int)12);
                    continue block13;
                }
                case 1903785678: {
                    v2 = ho$Phase.fxs("fzd", fxp(int ), (int)13);
                    continue block13;
                }
            }
            break;
        }
        var2_2 /* !! */  = ho$Phase.b;
        while (true) {
            block27: {
                if ((v3 /* !! */  = (cfr_temp_1 = ho$Phase.ab - ho$Phase.fxs("ghi", fxp(int ), (int)14)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  != ho$Phase.fxs("ghj", fxz(int ), (int)12)) break block27;
                var1_3 = ho$Phase.a;
                if (var2_2 /* !! */  != 0) {
                    break;
                }
                ** GOTO lbl-1000
            }
            v3 /* !! */  = (long)ho$Phase.fxs("ghk", fxz(int ), (int)13);
        }
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                }
                if (var1_3 != false) return null;
                if (var1_3 != false) return null;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ho$Phase.ab - ho$Phase.fxs("ghm", fxp(int ), (int)15)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ho$Phase.fxs("ghn", fxz(int ), (int)14)) {
                        return Enum.valueOf(ho$Phase.class, var0);
                    }
                    v4 /* !! */  = (long)ho$Phase.fxs("gho", fxz(int ), (int)15);
                }
            }
            case 0: {
                ** GOTO lbl61
            }
            case 2: {
                var2_2 /* !! */  = (int)ho$Phase.fxs("ghr", fxz(int ), (int)18);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl-1000
            }
            case 3: lbl-1000:
            // 2 sources

            {
                var2_2 /* !! */  = (int)ho$Phase.fxs("ghs", fxz(int ), (int)19);
                if (var3_1) {
                    throw null;
                }
lbl61:
                // 3 sources

                var2_2 /* !! */  = (int)ho$Phase.fxs("ghp", fxz(int ), (int)16);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: 
        }
        do {
            var2_2 /* !! */  = (int)ho$Phase.fxs("ghq", fxz(int ), (int)17);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ ho$Phase[] $values() {
        v0 /* !! */  = ho$Phase.ab;
        if (true) ** GOTO lbl5
        block35: while (true) {
            v0 /* !! */  = (long)(v1 - ho$Phase.fxs("ghx", fxp(int ), (int)16));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1911142797: {
                    break block35;
                }
                case -62652749: {
                    v1 = ho$Phase.fxs("ghy", fxp(int ), (int)17);
                    continue block35;
                }
                case 543986207: {
                    v1 = ho$Phase.fxs("ghz", fxp(int ), (int)18);
                    continue block35;
                }
            }
            break;
        }
        var2 = ho$Phase.c;
        v2 /* !! */  = ho$Phase.ab;
        if (true) ** GOTO lbl19
        block36: while (true) {
            v2 /* !! */  = (long)(v3 - ho$Phase.fxs("gib", fxp(int ), (int)19));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1911142797: {
                    break block36;
                }
                case -431467190: {
                    v3 = ho$Phase.fxs("gic", fxp(int ), (int)20);
                    continue block36;
                }
                case 115466719: {
                    v3 = ho$Phase.fxs("gid", fxp(int ), (int)21);
                    continue block36;
                }
                case 1738586179: {
                    v3 = ho$Phase.fxs("gie", fxp(int ), (int)22);
                    continue block36;
                }
            }
            break;
        }
        var1_1 /* !! */  = ho$Phase.b;
        v4 /* !! */  = ho$Phase.ab;
        if (true) ** GOTO lbl36
        block37: while (true) {
            v4 /* !! */  = (long)(v5 - ho$Phase.fxs("gif", fxp(int ), (int)23));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1911142797: {
                    break block37;
                }
                case 2045316262: {
                    v5 = ho$Phase.fxs("gig", fxp(int ), (int)24);
                    continue block37;
                }
                case 2065430842: {
                    v5 = ho$Phase.fxs("gih", fxp(int ), (int)25);
                    continue block37;
                }
            }
            break;
        }
        var0_2 = ho$Phase.a;
        if (var2) {
            throw null;
lbl48:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl51:
        // 1 sources

        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v6 = new ho$Phase[6];
                v7 = ho$Phase.fxs("gij", fxz(int ), (int)23);
                v8 /* !! */  = ho$Phase.ab;
                if (true) ** GOTO lbl60
                block39: while (true) {
                    v8 /* !! */  = (long)(ho$Phase.fxs("gil", fxp(int ), (int)27) - ho$Phase.fxs("gik", fxp(int ), (int)26));
lbl60:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1911142797: {
                            break block39;
                        }
                        case 205141680: {
                            continue block39;
                        }
                    }
                    break;
                }
                v6[v7] = ho$Phase.IDLE;
                v9 = ho$Phase.fxs("gim", fxz(int ), (int)24);
                v10 /* !! */  = ho$Phase.ab;
                if (true) ** GOTO lbl71
                block40: while (true) {
                    v10 /* !! */  = (long)(ho$Phase.fxs("gio", fxp(int ), (int)29) - ho$Phase.fxs("gin", fxp(int ), (int)28));
lbl71:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1911142797: {
                            break block40;
                        }
                        case -1712778073: {
                            continue block40;
                        }
                    }
                    break;
                }
                v6[v9] = ho$Phase.WAIT_NEW_STOP;
                v11 = ho$Phase.fxs("gip", fxz(int ), (int)25);
                while (true) {
                    if ((v12 = (cfr_temp_0 = ho$Phase.ab - ho$Phase.fxs("gir", fxp(int ), (int)30)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v12 == ho$Phase.fxs("gis", fxz(int ), (int)26)) break;
                    v12 = -1844336400;
                }
                v6[v11] = ho$Phase.WAIT_ROTATE;
                v13 = ho$Phase.fxs("giu", fxz(int ), (int)27);
                while (true) {
                    if ((v14 = (cfr_temp_1 = ho$Phase.ab - ho$Phase.fxs("giv", fxp(int ), (int)31)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v14 == ho$Phase.fxs("giw", fxz(int ), (int)28)) break;
                    v14 = 1406385312;
                }
                v6[v13] = ho$Phase.REQUEST_JUMP;
                v15 = ho$Phase.fxs("gix", fxz(int ), (int)29);
                while (true) {
                    if ((v16 = (cfr_temp_2 = ho$Phase.ab - ho$Phase.fxs("giy", fxp(int ), (int)32)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v16 == ho$Phase.fxs("giz", fxz(int ), (int)30)) break;
                    v16 = -23867030;
                }
                v6[v15] = ho$Phase.WAIT_AIRBORNE_PACKET;
                v17 = ho$Phase.fxs("gja", fxz(int ), (int)31);
                v18 /* !! */  = ho$Phase.ab;
                if (true) ** GOTO lbl106
                block44: while (true) {
                    v18 /* !! */  = (long)(v19 - ho$Phase.fxs("gjc", fxp(int ), (int)33));
lbl106:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1911142797: {
                            break block44;
                        }
                        case -893445130: {
                            v19 = ho$Phase.fxs("gjd", fxp(int ), (int)34);
                            continue block44;
                        }
                        case 13539152: {
                            v19 = ho$Phase.fxs("gje", fxp(int ), (int)35);
                            continue block44;
                        }
                    }
                    break;
                }
                v6[v17] = ho$Phase.WAIT_RESTORE;
                return v6;
            }
            case 0: {
                var1_1 /* !! */  = (int)ho$Phase.fxs("gjf", fxz(int ), (int)32);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl126
            }
            case 1: {
                var1_1 /* !! */  = (int)ho$Phase.fxs("gjg", fxz(int ), (int)33);
                if (!var2) break;
                throw null;
            }
lbl126:
            // 2 sources

            case 2: {
                var1_1 /* !! */  = (int)ho$Phase.fxs("gjh", fxz(int ), (int)34);
                if (!var2) break;
                throw null;
            }
            case 3: 
        }
        do {
            var1_1 /* !! */  = (int)ho$Phase.fxs("gji", fxz(int ), (int)35);
        } while (!var2);
        throw null;
    }

    private static /* synthetic */ void gjq() {
        ho$Phase.fyb[0] = 563966109;
        ho$Phase.fyb[1] = -2085653629;
        ho$Phase.fyb[2] = 1153080237;
        ho$Phase.fyb[3] = 1213210506;
        ho$Phase.fyb[4] = -1420788522;
        ho$Phase.fyb[5] = -1888586558;
        ho$Phase.fyb[6] = 1752077903;
        ho$Phase.fyb[7] = 1393410815;
        ho$Phase.fyb[8] = -1646826161;
        ho$Phase.fyb[9] = 1130458970;
        ho$Phase.fyb[10] = 738815188;
        ho$Phase.fyb[11] = -1258635376;
        ho$Phase.fyb[12] = 1005828190;
        ho$Phase.fyb[13] = -1980433648;
        ho$Phase.fyb[14] = -806186859;
        ho$Phase.fyb[15] = 2009512030;
        ho$Phase.fyb[16] = 499195156;
        ho$Phase.fyb[17] = -1219933841;
        ho$Phase.fyb[18] = -979360325;
        ho$Phase.fyb[19] = -835922898;
        ho$Phase.fyb[20] = -657076463;
        ho$Phase.fyb[21] = -456502040;
        ho$Phase.fyb[22] = -2091090403;
        ho$Phase.fyb[23] = -1877540771;
        ho$Phase.fyb[24] = -775382490;
        ho$Phase.fyb[25] = -81861850;
        ho$Phase.fyb[26] = 1848939697;
        ho$Phase.fyb[27] = -996645109;
        ho$Phase.fyb[28] = -284909201;
        ho$Phase.fyb[29] = 1147682384;
        ho$Phase.fyb[30] = 678135677;
        ho$Phase.fyb[31] = 211435724;
        ho$Phase.fyb[32] = 658069376;
        ho$Phase.fyb[33] = 1941407505;
        ho$Phase.fyb[34] = 657595048;
        ho$Phase.fyb[35] = -74867641;
        ho$Phase.fyb[36] = -985749827;
        ho$Phase.fyb[37] = -838674401;
        ho$Phase.fyb[38] = 167672583;
        ho$Phase.fyb[39] = -1469469941;
        ho$Phase.fyb[40] = -1275382076;
        ho$Phase.fyb[41] = -1959613004;
    }

    private static /* synthetic */ long fxp(int n2) {
        return fxq[n2] ^ fxr[n2];
    }

    private static /* synthetic */ int fxz(int n2) {
        return fya[n2] ^ fyb[n2];
    }

    private static /* synthetic */ void gjp() {
        ho$Phase.fya[0] = -563966110;
        ho$Phase.fya[1] = 1365422726;
        ho$Phase.fya[2] = -1153080238;
        ho$Phase.fya[3] = 883421738;
        ho$Phase.fya[4] = -1420788521;
        ho$Phase.fya[5] = 1708417815;
        ho$Phase.fya[6] = 1752077902;
        ho$Phase.fya[7] = 1393410812;
        ho$Phase.fya[8] = -1646826163;
        ho$Phase.fya[9] = 1130458970;
        ho$Phase.fya[10] = -738815189;
        ho$Phase.fya[11] = -1181567123;
        ho$Phase.fya[12] = -1005828191;
        ho$Phase.fya[13] = -249303043;
        ho$Phase.fya[14] = 806186858;
        ho$Phase.fya[15] = -1935743007;
        ho$Phase.fya[16] = 499195157;
        ho$Phase.fya[17] = -1219933844;
        ho$Phase.fya[18] = -979360328;
        ho$Phase.fya[19] = -835922898;
        ho$Phase.fya[20] = -657076464;
        ho$Phase.fya[21] = -456502039;
        ho$Phase.fya[22] = -2091090403;
        ho$Phase.fya[23] = -1877540771;
        ho$Phase.fya[24] = -775382489;
        ho$Phase.fya[25] = -81861852;
        ho$Phase.fya[26] = -1848939698;
        ho$Phase.fya[27] = -996645112;
        ho$Phase.fya[28] = -284909202;
        ho$Phase.fya[29] = 1147682388;
        ho$Phase.fya[30] = 678135676;
        ho$Phase.fya[31] = 211435721;
        ho$Phase.fya[32] = 658069379;
        ho$Phase.fya[33] = 1941407504;
        ho$Phase.fya[34] = 657595049;
        ho$Phase.fya[35] = -74867641;
        ho$Phase.fya[36] = -985749827;
        ho$Phase.fya[37] = -838674402;
        ho$Phase.fya[38] = 167672581;
        ho$Phase.fya[39] = -1469469944;
        ho$Phase.fya[40] = -1275382080;
        ho$Phase.fya[41] = -1959613007;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ho$Phase() {
        var4_3 /* !! */  = ho$Phase.b;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var3_4 = ho$Phase.a;
                super(var1_1, var2_2);
                return;
            }
            case 0: {
                var4_3 /* !! */  = (int)ho$Phase.fxs("ghu", fxz(int ), (int)20);
                break;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)ho$Phase.fxs("ghv", fxz(int ), (int)21);
                    continue;
                    break;
                }
            }
            case 2: 
        }
        var4_3 /* !! */  = (int)ho$Phase.fxs("ghw", fxz(int ), (int)22);
        ** while (true)
    }

    private static /* synthetic */ void gjr() {
        ho$Phase.fxq[0] = -8764370396595907001L;
        ho$Phase.fxq[1] = -5111748426338674171L;
        ho$Phase.fxq[2] = -3755015378489560160L;
        ho$Phase.fxq[3] = 7447087198139836018L;
        ho$Phase.fxq[4] = -7407933301474970401L;
        ho$Phase.fxq[5] = 2429475897612227630L;
        ho$Phase.fxq[6] = -6641329366995966663L;
        ho$Phase.fxq[7] = 5103107530541442556L;
        ho$Phase.fxq[8] = -6098699296536158668L;
        ho$Phase.fxq[9] = -2971064268959295659L;
        ho$Phase.fxq[10] = 1922313617001045215L;
        ho$Phase.fxq[11] = -8697254804861597131L;
        ho$Phase.fxq[12] = 4042930023178367687L;
        ho$Phase.fxq[13] = 1393844108193579163L;
        ho$Phase.fxq[14] = -1163072157812698269L;
        ho$Phase.fxq[15] = -2036702337234582496L;
        ho$Phase.fxq[16] = -5372017760549054381L;
        ho$Phase.fxq[17] = -5340256833334433862L;
        ho$Phase.fxq[18] = -6670956684511150187L;
        ho$Phase.fxq[19] = -4473582681121262290L;
        ho$Phase.fxq[20] = 151316758951502164L;
        ho$Phase.fxq[21] = -1644788395952018184L;
        ho$Phase.fxq[22] = -4082290808711956388L;
        ho$Phase.fxq[23] = 5284373598677245106L;
        ho$Phase.fxq[24] = 5279768270567364950L;
        ho$Phase.fxq[25] = 4485421776327982939L;
        ho$Phase.fxq[26] = 4095249366872306355L;
        ho$Phase.fxq[27] = -344893141502329229L;
        ho$Phase.fxq[28] = -5195428642214690498L;
        ho$Phase.fxq[29] = 2956129859013059258L;
        ho$Phase.fxq[30] = 1011724271811452968L;
        ho$Phase.fxq[31] = -7226622034648070431L;
        ho$Phase.fxq[32] = 2528610660570723642L;
        ho$Phase.fxq[33] = 3630382493015781220L;
        ho$Phase.fxq[34] = -1191593727895430133L;
        ho$Phase.fxq[35] = 7887081747862336815L;
    }
}

