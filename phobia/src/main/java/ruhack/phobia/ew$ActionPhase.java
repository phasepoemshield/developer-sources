/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

final class ew$ActionPhase
extends Enum<ew$ActionPhase> {
    public static final /* enum */ ew$ActionPhase WAIT_USE_HALF;
    public static final boolean a;
    private static final /* synthetic */ ew$ActionPhase[] $VALUES;
    public static final int b;
    private static final long kk = 7779491031104881534L;
    public static final /* enum */ ew$ActionPhase WAIT_RESTORE_STOP;
    public static final /* enum */ ew$ActionPhase IDLE;
    private static int[] eefx;
    private static long[] eefs;
    private static long[] eefr;
    private static int[] eefw;
    public static final boolean c;
    public static final /* enum */ ew$ActionPhase WAIT_RESTORE;
    public static final /* enum */ ew$ActionPhase WAIT_USE_STOP;

    private static /* synthetic */ void eeiy() {
        ew$ActionPhase.eefs[0] = 4047581073204871712L;
        ew$ActionPhase.eefs[1] = -6141157808580960201L;
        ew$ActionPhase.eefs[2] = -6701256654291825617L;
        ew$ActionPhase.eefs[3] = 5777323052531596707L;
        ew$ActionPhase.eefs[4] = -3479578514490328201L;
        ew$ActionPhase.eefs[5] = -8139920203810349534L;
        ew$ActionPhase.eefs[6] = -8674575007295200234L;
        ew$ActionPhase.eefs[7] = 2323804366729389074L;
        ew$ActionPhase.eefs[8] = -3101688934180794961L;
        ew$ActionPhase.eefs[9] = 631123564868433827L;
        ew$ActionPhase.eefs[10] = 2449833747535358571L;
        ew$ActionPhase.eefs[11] = 4265180560618033181L;
        ew$ActionPhase.eefs[12] = -5318137368506210015L;
        ew$ActionPhase.eefs[13] = -2162073446483001086L;
        ew$ActionPhase.eefs[14] = 6552489281645960130L;
        ew$ActionPhase.eefs[15] = -5095261170519664817L;
        ew$ActionPhase.eefs[16] = 3730569993138466566L;
        ew$ActionPhase.eefs[17] = 1593944264704228794L;
        ew$ActionPhase.eefs[18] = -6058337388194894837L;
        ew$ActionPhase.eefs[19] = -8648707050398313301L;
        ew$ActionPhase.eefs[20] = 1664541756841796116L;
        ew$ActionPhase.eefs[21] = 8119020592669661127L;
        ew$ActionPhase.eefs[22] = 2189677301121546078L;
        ew$ActionPhase.eefs[23] = 2074360372454674874L;
        ew$ActionPhase.eefs[24] = 3670393536474697481L;
        ew$ActionPhase.eefs[25] = 4926124899736175836L;
        ew$ActionPhase.eefs[26] = -3915373033863581520L;
        ew$ActionPhase.eefs[27] = -2264991903684096141L;
        ew$ActionPhase.eefs[28] = 2463877992964444642L;
        ew$ActionPhase.eefs[29] = 8604328588538905136L;
        ew$ActionPhase.eefs[30] = -1857436175149584475L;
        ew$ActionPhase.eefs[31] = -6919295528733736322L;
        ew$ActionPhase.eefs[32] = -714210645073513662L;
        ew$ActionPhase.eefs[33] = -7136938264211088626L;
        ew$ActionPhase.eefs[34] = 3181003576605203362L;
        ew$ActionPhase.eefs[35] = -2231513031780360389L;
        ew$ActionPhase.eefs[36] = 7175590427491340995L;
        ew$ActionPhase.eefs[37] = -4209156562736825282L;
        ew$ActionPhase.eefs[38] = -2831350408994110334L;
        ew$ActionPhase.eefs[39] = -2475309803663294630L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ew$ActionPhase() {
        var4_3 /* !! */  = ew$ActionPhase.b;
        var3_4 = ew$ActionPhase.a;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super(var1_1, var2_2);
                return;
            }
lbl8:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)ew$ActionPhase.eeft("eehe", eefv(int ), (int)18);
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)ew$ActionPhase.eeft("eehf", eefv(int ), (int)19);
                    ** GOTO lbl8
                    break;
                }
            }
            case 2: 
        }
        var4_3 /* !! */  = (int)ew$ActionPhase.eeft("eehg", eefv(int ), (int)20);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ ew$ActionPhase[] $values() {
        v0 /* !! */  = ew$ActionPhase.kk;
        if (true) ** GOTO lbl5
        block44: while (true) {
            v0 /* !! */  = (long)(v1 - ew$ActionPhase.eeft("eehh", eefq(int ), (int)15));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 307757950: {
                    break block44;
                }
                case 354564334: {
                    v1 = ew$ActionPhase.eeft("eehi", eefq(int ), (int)16);
                    continue block44;
                }
                case 1723470483: {
                    v1 = ew$ActionPhase.eeft("eehj", eefq(int ), (int)17);
                    continue block44;
                }
                case 1945570622: {
                    v1 = ew$ActionPhase.eeft("eehk", eefq(int ), (int)18);
                    continue block44;
                }
            }
            break;
        }
        var2 = ew$ActionPhase.c;
        v2 /* !! */  = ew$ActionPhase.kk;
        if (true) ** GOTO lbl22
        block45: while (true) {
            v2 /* !! */  = (long)(v3 - ew$ActionPhase.eeft("eehl", eefq(int ), (int)19));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -585844270: {
                    v3 = ew$ActionPhase.eeft("eehm", eefq(int ), (int)20);
                    continue block45;
                }
                case 307757950: {
                    break block45;
                }
                case 1494229094: {
                    v3 = ew$ActionPhase.eeft("eehn", eefq(int ), (int)21);
                    continue block45;
                }
            }
            break;
        }
        var1_1 /* !! */  = ew$ActionPhase.b;
        v4 /* !! */  = ew$ActionPhase.kk;
        if (true) ** GOTO lbl36
        block46: while (true) {
            v4 /* !! */  = (long)(v5 - ew$ActionPhase.eeft("eeho", eefq(int ), (int)22));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 90353257: {
                    v5 = ew$ActionPhase.eeft("eehp", eefq(int ), (int)23);
                    continue block46;
                }
                case 307757950: {
                    break block46;
                }
                case 2082354048: {
                    v5 = ew$ActionPhase.eeft("eehq", eefq(int ), (int)24);
                    continue block46;
                }
            }
            break;
        }
        var0_2 = ew$ActionPhase.a;
        if (var2) {
            throw null;
            return null;
        }
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2 || var0_2) ** continue;
                v6 = new ew$ActionPhase[5];
                v7 = ew$ActionPhase.eeft("eehr", eefv(int ), (int)21);
                v8 /* !! */  = ew$ActionPhase.kk;
                if (true) ** GOTO lbl60
                block48: while (true) {
                    v8 /* !! */  = (long)(v9 - ew$ActionPhase.eeft("eehs", eefq(int ), (int)25));
lbl60:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -946439399: {
                            v9 = ew$ActionPhase.eeft("eeht", eefq(int ), (int)26);
                            continue block48;
                        }
                        case -862626007: {
                            v9 = ew$ActionPhase.eeft("eehu", eefq(int ), (int)27);
                            continue block48;
                        }
                        case 307757950: {
                            break block48;
                        }
                        case 1063439152: {
                            v9 = ew$ActionPhase.eeft("eehv", eefq(int ), (int)28);
                            continue block48;
                        }
                    }
                    break;
                }
                v6[v7] = ew$ActionPhase.IDLE;
                v10 = ew$ActionPhase.eeft("eehw", eefv(int ), (int)22);
                while (true) {
                    if ((v11 = (cfr_temp_0 = ew$ActionPhase.kk - ew$ActionPhase.eeft("eehx", eefq(int ), (int)29)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v11 == ew$ActionPhase.eeft("eehy", eefv(int ), (int)23)) break;
                    v11 = 554077692;
                }
                v6[v10] = ew$ActionPhase.WAIT_USE_HALF;
                v12 = ew$ActionPhase.eeft("eehz", eefv(int ), (int)24);
                v13 /* !! */  = ew$ActionPhase.kk;
                if (true) ** GOTO lbl86
                block50: while (true) {
                    v13 /* !! */  = (long)(v14 - ew$ActionPhase.eeft("eeia", eefq(int ), (int)30));
lbl86:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1806120545: {
                            v14 = ew$ActionPhase.eeft("eeib", eefq(int ), (int)31);
                            continue block50;
                        }
                        case -1315561202: {
                            v14 = ew$ActionPhase.eeft("eeic", eefq(int ), (int)32);
                            continue block50;
                        }
                        case 307757950: {
                            break block50;
                        }
                    }
                    break;
                }
                v6[v12] = ew$ActionPhase.WAIT_USE_STOP;
                v15 = ew$ActionPhase.eeft("eeid", eefv(int ), (int)25);
                v16 /* !! */  = ew$ActionPhase.kk;
                if (true) ** GOTO lbl101
                block51: while (true) {
                    v16 /* !! */  = (long)(v17 - ew$ActionPhase.eeft("eeie", eefq(int ), (int)33));
lbl101:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case 307757950: {
                            break block51;
                        }
                        case 1586046474: {
                            v17 = ew$ActionPhase.eeft("eeif", eefq(int ), (int)34);
                            continue block51;
                        }
                        case 1820749984: {
                            v17 = ew$ActionPhase.eeft("eeig", eefq(int ), (int)35);
                            continue block51;
                        }
                    }
                    break;
                }
                v6[v15] = ew$ActionPhase.WAIT_RESTORE;
                v18 = ew$ActionPhase.eeft("eeih", eefv(int ), (int)26);
                v19 /* !! */  = ew$ActionPhase.kk;
                if (true) ** GOTO lbl116
                block52: while (true) {
                    v19 /* !! */  = (long)(v20 - ew$ActionPhase.eeft("eeii", eefq(int ), (int)36));
lbl116:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -1125384188: {
                            v20 = ew$ActionPhase.eeft("eeij", eefq(int ), (int)37);
                            continue block52;
                        }
                        case 307757950: {
                            break block52;
                        }
                        case 1106818113: {
                            v20 = ew$ActionPhase.eeft("eeik", eefq(int ), (int)38);
                            continue block52;
                        }
                        case 1650909319: {
                            v20 = ew$ActionPhase.eeft("eeil", eefq(int ), (int)39);
                            continue block52;
                        }
                    }
                    break;
                }
                v6[v18] = ew$ActionPhase.WAIT_RESTORE_STOP;
                return v6;
            }
lbl130:
            // 2 sources

            case 0: {
                do {
                    var1_1 /* !! */  = (int)ew$ActionPhase.eeft("eeim", eefv(int ), (int)27);
                } while (!var2);
                throw null;
            }
lbl135:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)ew$ActionPhase.eeft("eein", eefv(int ), (int)28);
                    if (!var2) ** GOTO lbl130
                    throw null;
                }
            }
            case 2: {
                var1_1 /* !! */  = (int)ew$ActionPhase.eeft("eeio", eefv(int ), (int)29);
                if (!var2) ** GOTO lbl135
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)ew$ActionPhase.eeft("eeip", eefv(int ), (int)30);
        ** while (!var2)
lbl147:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void eeiw() {
        ew$ActionPhase.eefx[0] = -941708409;
        ew$ActionPhase.eefx[1] = -1940545125;
        ew$ActionPhase.eefx[2] = -2044773692;
        ew$ActionPhase.eefx[3] = 340936020;
        ew$ActionPhase.eefx[4] = -953383643;
        ew$ActionPhase.eefx[5] = 1629178145;
        ew$ActionPhase.eefx[6] = -1493281330;
        ew$ActionPhase.eefx[7] = -1558540738;
        ew$ActionPhase.eefx[8] = 1726389452;
        ew$ActionPhase.eefx[9] = 1676811305;
        ew$ActionPhase.eefx[10] = 1444095629;
        ew$ActionPhase.eefx[11] = 898241975;
        ew$ActionPhase.eefx[12] = -631050627;
        ew$ActionPhase.eefx[13] = 754801516;
        ew$ActionPhase.eefx[14] = 585767112;
        ew$ActionPhase.eefx[15] = 1232836553;
        ew$ActionPhase.eefx[16] = 1435531246;
        ew$ActionPhase.eefx[17] = -1961387280;
        ew$ActionPhase.eefx[18] = 827125961;
        ew$ActionPhase.eefx[19] = 1384699696;
        ew$ActionPhase.eefx[20] = -1798917111;
        ew$ActionPhase.eefx[21] = -722750764;
        ew$ActionPhase.eefx[22] = -1215553484;
        ew$ActionPhase.eefx[23] = -277978936;
        ew$ActionPhase.eefx[24] = 912373625;
        ew$ActionPhase.eefx[25] = -214600089;
        ew$ActionPhase.eefx[26] = 900889551;
        ew$ActionPhase.eefx[27] = -721304059;
        ew$ActionPhase.eefx[28] = 1982048464;
        ew$ActionPhase.eefx[29] = -1475052899;
        ew$ActionPhase.eefx[30] = 1400484436;
        ew$ActionPhase.eefx[31] = 55633505;
        ew$ActionPhase.eefx[32] = 210924605;
        ew$ActionPhase.eefx[33] = -1248857853;
        ew$ActionPhase.eefx[34] = -703692341;
        ew$ActionPhase.eefx[35] = 1885686427;
    }

    private static /* synthetic */ int eefv(int n2) {
        return eefw[n2] ^ eefx[n2];
    }

    private static /* synthetic */ long eefq(int n2) {
        return eefr[n2] ^ eefs[n2];
    }

    private static /* synthetic */ void eeiv() {
        ew$ActionPhase.eefw[0] = -941708410;
        ew$ActionPhase.eefw[1] = 1748996847;
        ew$ActionPhase.eefw[2] = -2044773691;
        ew$ActionPhase.eefw[3] = -352653878;
        ew$ActionPhase.eefw[4] = -953383644;
        ew$ActionPhase.eefw[5] = -323509287;
        ew$ActionPhase.eefw[6] = -1493281329;
        ew$ActionPhase.eefw[7] = -1999745541;
        ew$ActionPhase.eefw[8] = 1726389455;
        ew$ActionPhase.eefw[9] = 1676811306;
        ew$ActionPhase.eefw[10] = 1444095629;
        ew$ActionPhase.eefw[11] = 898241974;
        ew$ActionPhase.eefw[12] = -631050628;
        ew$ActionPhase.eefw[13] = 256738267;
        ew$ActionPhase.eefw[14] = 585767113;
        ew$ActionPhase.eefw[15] = 1232836554;
        ew$ActionPhase.eefw[16] = 1435531245;
        ew$ActionPhase.eefw[17] = -1961387280;
        ew$ActionPhase.eefw[18] = 827125963;
        ew$ActionPhase.eefw[19] = 1384699696;
        ew$ActionPhase.eefw[20] = -1798917109;
        ew$ActionPhase.eefw[21] = -722750764;
        ew$ActionPhase.eefw[22] = -1215553483;
        ew$ActionPhase.eefw[23] = -277978935;
        ew$ActionPhase.eefw[24] = 912373627;
        ew$ActionPhase.eefw[25] = -214600092;
        ew$ActionPhase.eefw[26] = 900889547;
        ew$ActionPhase.eefw[27] = -721304059;
        ew$ActionPhase.eefw[28] = 1982048464;
        ew$ActionPhase.eefw[29] = -1475052897;
        ew$ActionPhase.eefw[30] = 1400484438;
        ew$ActionPhase.eefw[31] = 55633505;
        ew$ActionPhase.eefw[32] = 210924604;
        ew$ActionPhase.eefw[33] = -1248857855;
        ew$ActionPhase.eefw[34] = -703692344;
        ew$ActionPhase.eefw[35] = 1885686431;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ew$ActionPhase[] values() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ew$ActionPhase.kk - ew$ActionPhase.eeft("eefu", eefq(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ew$ActionPhase.eeft("eefy", eefv(int ), (int)0)) break;
            v0 /* !! */  = (long)ew$ActionPhase.eeft("eefz", eefv(int ), (int)1);
        }
        var2 = ew$ActionPhase.c;
        v1 /* !! */  = ew$ActionPhase.kk;
        if (true) ** GOTO lbl12
        block11: while (true) {
            v1 /* !! */  = (long)(ew$ActionPhase.eeft("eegb", eefq(int ), (int)2) - ew$ActionPhase.eeft("eega", eefq(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 4461498: {
                    continue block11;
                }
                case 307757950: {
                    break block11;
                }
            }
            break;
        }
        var1_1 /* !! */  = ew$ActionPhase.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ew$ActionPhase.kk - ew$ActionPhase.eeft("eegc", eefq(int ), (int)3)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ew$ActionPhase.eeft("eegd", eefv(int ), (int)2)) break;
            v2 /* !! */  = (long)ew$ActionPhase.eeft("eege", eefv(int ), (int)3);
        }
        var0_2 = ew$ActionPhase.a;
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
                    if ((v3 /* !! */  = (cfr_temp_2 = ew$ActionPhase.kk - ew$ActionPhase.eeft("eegf", eefq(int ), (int)4)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ew$ActionPhase.eeft("eegg", eefv(int ), (int)4)) break;
                    v3 /* !! */  = (long)ew$ActionPhase.eeft("eegh", eefv(int ), (int)5);
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = ew$ActionPhase.kk - ew$ActionPhase.eeft("eegi", eefq(int ), (int)5)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ew$ActionPhase.eeft("eegj", eefv(int ), (int)6)) break;
                    v4 /* !! */  = (long)ew$ActionPhase.eeft("eegk", eefv(int ), (int)7);
                }
                return (ew$ActionPhase[])ew$ActionPhase.$VALUES.clone();
            }
            case 0: {
                var1_1 /* !! */  = (int)ew$ActionPhase.eeft("eegl", eefv(int ), (int)8);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl57
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)ew$ActionPhase.eeft("eegm", eefv(int ), (int)9);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl57:
            // 2 sources

            case 2: {
                var1_1 /* !! */  = (int)ew$ActionPhase.eeft("eegn", eefv(int ), (int)10);
                if (!var2) break;
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)ew$ActionPhase.eeft("eego", eefv(int ), (int)11);
        ** while (!var2)
lbl64:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ew$ActionPhase valueOf(String var0) {
        v0 /* !! */  = ew$ActionPhase.kk;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - ew$ActionPhase.eeft("eegp", eefq(int ), (int)6));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -781202795: {
                    v1 = ew$ActionPhase.eeft("eegq", eefq(int ), (int)7);
                    continue block20;
                }
                case 307757950: {
                    break block20;
                }
                case 589522332: {
                    v1 = ew$ActionPhase.eeft("eegr", eefq(int ), (int)8);
                    continue block20;
                }
                case 1487275527: {
                    v1 = ew$ActionPhase.eeft("eegs", eefq(int ), (int)9);
                    continue block20;
                }
            }
            break;
        }
        var3_1 = ew$ActionPhase.c;
        v2 /* !! */  = ew$ActionPhase.kk;
        if (true) ** GOTO lbl22
        block21: while (true) {
            v2 /* !! */  = (long)(ew$ActionPhase.eeft("eegu", eefq(int ), (int)11) - ew$ActionPhase.eeft("eegt", eefq(int ), (int)10));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -459978687: {
                    continue block21;
                }
                case 307757950: {
                    break block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = ew$ActionPhase.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = ew$ActionPhase.kk - ew$ActionPhase.eeft("eegv", eefq(int ), (int)12)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ew$ActionPhase.eeft("eegw", eefv(int ), (int)12)) break;
            v3 /* !! */  = (long)ew$ActionPhase.eeft("eegx", eefv(int ), (int)13);
        }
        var1_3 = ew$ActionPhase.a;
        if (var3_1) {
            throw null;
lbl37:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = ew$ActionPhase.kk;
                if (true) ** GOTO lbl48
                block24: while (true) {
                    v4 /* !! */  = (long)(ew$ActionPhase.eeft("eegz", eefq(int ), (int)14) - ew$ActionPhase.eeft("eegy", eefq(int ), (int)13));
lbl48:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1154546437: {
                            continue block24;
                        }
                        case 307757950: {
                            break block24;
                        }
                    }
                    break;
                }
                return Enum.valueOf(ew$ActionPhase.class, var0);
            }
lbl54:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ew$ActionPhase.eeft("eeha", eefv(int ), (int)14);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl63
            }
            case 1: {
                var2_2 /* !! */  = (int)ew$ActionPhase.eeft("eehb", eefv(int ), (int)15);
                if (var3_1) {
                    throw null;
                }
            }
lbl63:
            // 4 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ew$ActionPhase.eeft("eehc", eefv(int ), (int)16);
                    if (!var3_1) ** GOTO lbl54
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ew$ActionPhase.eeft("eehd", eefv(int ), (int)17);
        ** while (!var3_1)
lbl71:
        // 1 sources

        throw null;
    }

    static {
        eefw = new int[36];
        eefx = new int[36];
        ew$ActionPhase.eeiv();
        ew$ActionPhase.eeiw();
        eefr = new long[40];
        eefs = new long[40];
        ew$ActionPhase.eeix();
        ew$ActionPhase.eeiy();
        IDLE = new ew$ActionPhase();
        WAIT_USE_HALF = new ew$ActionPhase();
        WAIT_USE_STOP = new ew$ActionPhase();
        WAIT_RESTORE = new ew$ActionPhase();
        WAIT_RESTORE_STOP = new ew$ActionPhase();
        $VALUES = ew$ActionPhase.$values();
    }

    public static /* synthetic */ CallSite eeft(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void eeix() {
        ew$ActionPhase.eefr[0] = -2618878801832046763L;
        ew$ActionPhase.eefr[1] = 7290461670764589160L;
        ew$ActionPhase.eefr[2] = -6838831770500957656L;
        ew$ActionPhase.eefr[3] = 6647708229952679758L;
        ew$ActionPhase.eefr[4] = -8797456641242429194L;
        ew$ActionPhase.eefr[5] = -4322765385451491930L;
        ew$ActionPhase.eefr[6] = -6151994312644095943L;
        ew$ActionPhase.eefr[7] = 7435529881591671894L;
        ew$ActionPhase.eefr[8] = 40202835770569527L;
        ew$ActionPhase.eefr[9] = 4437661293846984657L;
        ew$ActionPhase.eefr[10] = 5102577491494324246L;
        ew$ActionPhase.eefr[11] = 6427597846771920996L;
        ew$ActionPhase.eefr[12] = 6462927538819684032L;
        ew$ActionPhase.eefr[13] = -1772714710937794676L;
        ew$ActionPhase.eefr[14] = -9127087765292230403L;
        ew$ActionPhase.eefr[15] = 5688805824080548132L;
        ew$ActionPhase.eefr[16] = 6195301858530326048L;
        ew$ActionPhase.eefr[17] = -8470434043722435650L;
        ew$ActionPhase.eefr[18] = -5282487261068001527L;
        ew$ActionPhase.eefr[19] = -2775684125105442060L;
        ew$ActionPhase.eefr[20] = 3589069954800893925L;
        ew$ActionPhase.eefr[21] = 3114103785128393104L;
        ew$ActionPhase.eefr[22] = 753349428099876243L;
        ew$ActionPhase.eefr[23] = -8852462323593069547L;
        ew$ActionPhase.eefr[24] = 8360221810653092167L;
        ew$ActionPhase.eefr[25] = 6250850717031943673L;
        ew$ActionPhase.eefr[26] = 5187811014245916172L;
        ew$ActionPhase.eefr[27] = -2852705243615411725L;
        ew$ActionPhase.eefr[28] = 8497649530408724694L;
        ew$ActionPhase.eefr[29] = 7693288015015238940L;
        ew$ActionPhase.eefr[30] = 4080919054567611918L;
        ew$ActionPhase.eefr[31] = 6486596220825621661L;
        ew$ActionPhase.eefr[32] = -1918151270307243494L;
        ew$ActionPhase.eefr[33] = -8926011970809200350L;
        ew$ActionPhase.eefr[34] = 4352197574727642290L;
        ew$ActionPhase.eefr[35] = 3967929164072285967L;
        ew$ActionPhase.eefr[36] = 2411682118505567182L;
        ew$ActionPhase.eefr[37] = -8339925658251444157L;
        ew$ActionPhase.eefr[38] = 4447784831561773749L;
        ew$ActionPhase.eefr[39] = 5388416813578022716L;
    }
}

