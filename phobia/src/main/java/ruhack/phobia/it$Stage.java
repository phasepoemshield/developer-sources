/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public final class it$Stage
extends Enum<it$Stage> {
    public static final /* enum */ it$Stage ATTACKING;
    private static int[] bfcl;
    private static long[] bfcb;
    public static final int b;
    private static long[] bfca;
    private static final /* synthetic */ it$Stage[] $VALUES;
    public static final boolean c;
    private static int[] bfck;
    public static final /* enum */ it$Stage TARGETTING;
    public static final boolean a;
    public static final /* enum */ it$Stage FLYING_UP;
    private static final long db = 7904120909884866827L;
    public static final /* enum */ it$Stage PREPARE;

    private static /* synthetic */ int bfcj(int n2) {
        return bfck[n2] ^ bfcl[n2];
    }

    private static /* synthetic */ void bfew() {
        it$Stage.bfck[0] = 1444602344;
        it$Stage.bfck[1] = -1864306386;
        it$Stage.bfck[2] = -1118314502;
        it$Stage.bfck[3] = 1418385157;
        it$Stage.bfck[4] = -1790224252;
        it$Stage.bfck[5] = -1633944852;
        it$Stage.bfck[6] = -96508649;
        it$Stage.bfck[7] = -703055584;
        it$Stage.bfck[8] = 188607031;
        it$Stage.bfck[9] = -2019677283;
        it$Stage.bfck[10] = 154170522;
        it$Stage.bfck[11] = -96561482;
        it$Stage.bfck[12] = -688632654;
        it$Stage.bfck[13] = 1160989621;
        it$Stage.bfck[14] = 958436004;
        it$Stage.bfck[15] = 1092285140;
        it$Stage.bfck[16] = -209944109;
        it$Stage.bfck[17] = 840681638;
        it$Stage.bfck[18] = -207119052;
        it$Stage.bfck[19] = -551356886;
        it$Stage.bfck[20] = -2017167225;
        it$Stage.bfck[21] = -428984762;
        it$Stage.bfck[22] = 893577556;
        it$Stage.bfck[23] = 713962766;
        it$Stage.bfck[24] = -1708768258;
        it$Stage.bfck[25] = -1963674931;
        it$Stage.bfck[26] = 1396856020;
        it$Stage.bfck[27] = -1747714585;
        it$Stage.bfck[28] = -1097378334;
        it$Stage.bfck[29] = 582392133;
        it$Stage.bfck[30] = -1702765361;
        it$Stage.bfck[31] = 904376792;
        it$Stage.bfck[32] = -1214197370;
        it$Stage.bfck[33] = -119121502;
        it$Stage.bfck[34] = 1960963610;
        it$Stage.bfck[35] = 1034594106;
        it$Stage.bfck[36] = -919024003;
        it$Stage.bfck[37] = 1207922902;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private it$Stage() {
        var4_3 /* !! */  = it$Stage.b;
        var3_4 = it$Stage.a;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super(var1_1, var2_2);
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)it$Stage.bfcc("bfdo", bfcj(int ), (int)16);
                    continue;
                    break;
                }
            }
            case 1: {
                var4_3 /* !! */  = (int)it$Stage.bfcc("bfdp", bfcj(int ), (int)17);
            }
            case 2: 
        }
        var4_3 /* !! */  = (int)it$Stage.bfcc("bfdq", bfcj(int ), (int)18);
        ** while (true)
    }

    private static /* synthetic */ void bfex() {
        it$Stage.bfcl[0] = 1444602345;
        it$Stage.bfcl[1] = -370519678;
        it$Stage.bfcl[2] = -1118314501;
        it$Stage.bfcl[3] = -493128020;
        it$Stage.bfcl[4] = -1790224251;
        it$Stage.bfcl[5] = -1633944849;
        it$Stage.bfcl[6] = -96508649;
        it$Stage.bfcl[7] = -703055583;
        it$Stage.bfcl[8] = 188607030;
        it$Stage.bfcl[9] = 300196074;
        it$Stage.bfcl[10] = 154170523;
        it$Stage.bfcl[11] = 873183946;
        it$Stage.bfcl[12] = -688632655;
        it$Stage.bfcl[13] = 1160989620;
        it$Stage.bfcl[14] = 958436005;
        it$Stage.bfcl[15] = 1092285140;
        it$Stage.bfcl[16] = -209944110;
        it$Stage.bfcl[17] = 840681636;
        it$Stage.bfcl[18] = -207119052;
        it$Stage.bfcl[19] = -551356885;
        it$Stage.bfcl[20] = -579282433;
        it$Stage.bfcl[21] = -428984761;
        it$Stage.bfcl[22] = -973957632;
        it$Stage.bfcl[23] = 713962766;
        it$Stage.bfcl[24] = -1708768257;
        it$Stage.bfcl[25] = -1963674932;
        it$Stage.bfcl[26] = 1396856022;
        it$Stage.bfcl[27] = -1747714586;
        it$Stage.bfcl[28] = -1097378335;
        it$Stage.bfcl[29] = 582392132;
        it$Stage.bfcl[30] = -1702765363;
        it$Stage.bfcl[31] = 904376793;
        it$Stage.bfcl[32] = -1214197372;
        it$Stage.bfcl[33] = -119121501;
        it$Stage.bfcl[34] = 1960963610;
        it$Stage.bfcl[35] = 1034594107;
        it$Stage.bfcl[36] = -919024001;
        it$Stage.bfcl[37] = 1207922901;
    }

    public static /* synthetic */ CallSite bfcc(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void bfey() {
        it$Stage.bfca[0] = 4212793018786099547L;
        it$Stage.bfca[1] = -5072243823566114636L;
        it$Stage.bfca[2] = -1368100916311888996L;
        it$Stage.bfca[3] = 7975082039950939775L;
        it$Stage.bfca[4] = -5624220001267314410L;
        it$Stage.bfca[5] = -1399217032235274711L;
        it$Stage.bfca[6] = -266117339255848087L;
        it$Stage.bfca[7] = 2970167456642040742L;
        it$Stage.bfca[8] = 2499287003269515142L;
        it$Stage.bfca[9] = -2344102812251343698L;
        it$Stage.bfca[10] = 7904218014757249883L;
        it$Stage.bfca[11] = -3281644550460138912L;
        it$Stage.bfca[12] = 8539934152499897121L;
        it$Stage.bfca[13] = 448927531811761886L;
        it$Stage.bfca[14] = 1597165270841194617L;
        it$Stage.bfca[15] = 884346827167439840L;
        it$Stage.bfca[16] = 2844232296941561053L;
        it$Stage.bfca[17] = -8358956181585346868L;
        it$Stage.bfca[18] = -8811006852104717697L;
        it$Stage.bfca[19] = 4213648954133862448L;
        it$Stage.bfca[20] = 8338196461800613255L;
        it$Stage.bfca[21] = -4909889841583919599L;
        it$Stage.bfca[22] = -4593063376806523399L;
        it$Stage.bfca[23] = 7752308741031571775L;
        it$Stage.bfca[24] = 6018842065374663859L;
        it$Stage.bfca[25] = 8355828960290779125L;
        it$Stage.bfca[26] = 1458759608258267236L;
        it$Stage.bfca[27] = -5207117304392686787L;
        it$Stage.bfca[28] = -6583188748877704949L;
        it$Stage.bfca[29] = 4906804829835582018L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ it$Stage[] $values() {
        v0 /* !! */  = it$Stage.db;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - it$Stage.bfcc("bfdr", bfbz(int ), (int)18));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -143867637: {
                    break block17;
                }
                case 1038338760: {
                    v1 = it$Stage.bfcc("bfds", bfbz(int ), (int)19);
                    continue block17;
                }
                case 1877811701: {
                    v1 = it$Stage.bfcc("bfdt", bfbz(int ), (int)20);
                    continue block17;
                }
                case 1937886900: {
                    v1 = it$Stage.bfcc("bfdu", bfbz(int ), (int)21);
                    continue block17;
                }
            }
            break;
        }
        var2 = it$Stage.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = it$Stage.db - it$Stage.bfcc("bfdv", bfbz(int ), (int)22)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == it$Stage.bfcc("bfdw", bfcj(int ), (int)19)) break;
            v2 /* !! */  = (long)it$Stage.bfcc("bfdx", bfcj(int ), (int)20);
        }
        var1_1 /* !! */  = it$Stage.b;
        while (true) {
            block34: {
                if ((v3 /* !! */  = (cfr_temp_2 = it$Stage.db - it$Stage.bfcc("bfdy", bfbz(int ), (int)23)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  != it$Stage.bfcc("bfdz", bfcj(int ), (int)21)) break block34;
                var0_2 = it$Stage.a;
                if (var1_1 /* !! */  != 0) {
                    break;
                }
                ** GOTO lbl-1000
            }
            v3 /* !! */  = (long)it$Stage.bfcc("bfea", bfcj(int ), (int)22);
        }
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var1_1 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var2) {
                        throw null;
                    }
                    if (var0_2 || var0_2) {
                        return null;
                    }
                    v4 = new it$Stage[4];
                    v5 = it$Stage.bfcc("bfeb", bfcj(int ), (int)23);
                    v6 /* !! */  = it$Stage.db;
                    block21: while (true) {
                        switch ((int)v6 /* !! */ ) {
                            case -143867637: {
                                break block21;
                            }
                            case 611688201: {
                                v7 = it$Stage.bfcc("bfed", bfbz(int ), (int)25);
                                ** GOTO lbl54
                            }
                            case 2073048551: {
                                v7 = it$Stage.bfcc("bfee", bfbz(int ), (int)26);
lbl54:
                                // 2 sources

                                v6 /* !! */  = (long)(v7 - it$Stage.bfcc("bfec", bfbz(int ), (int)24));
                                continue block21;
                            }
                        }
                        break;
                    }
                    v4[v5] = it$Stage.PREPARE;
                    v8 = it$Stage.bfcc("bfef", bfcj(int ), (int)24);
                    while (true) {
                        if ((v9 = (cfr_temp_3 = it$Stage.db - it$Stage.bfcc("bfeg", bfbz(int ), (int)27)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v9 == it$Stage.bfcc("bfeh", bfcj(int ), (int)25)) {
                            v4[v8] = it$Stage.FLYING_UP;
                            v10 = it$Stage.bfcc("bfei", bfcj(int ), (int)26);
                            ** break;
                        }
                        v9 = -554425942;
                    }
                }
                case 3: {
                    var1_1 /* !! */  = (int)it$Stage.bfcc("bfer", bfcj(int ), (int)33);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
lbl71:
                // 1 sources

                while (true) {
                    if ((v11 = (cfr_temp_4 = it$Stage.db - it$Stage.bfcc("bfej", bfbz(int ), (int)28)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v11 == it$Stage.bfcc("bfek", bfcj(int ), (int)27)) break;
                    v11 = 829447334;
                }
                v4[v10] = it$Stage.TARGETTING;
                v12 = it$Stage.bfcc("bfel", bfcj(int ), (int)28);
                while (true) {
                    if ((v13 = (cfr_temp_5 = it$Stage.db - it$Stage.bfcc("bfem", bfbz(int ), (int)29)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v13 == it$Stage.bfcc("bfen", bfcj(int ), (int)29)) {
                        v4[v12] = it$Stage.ATTACKING;
                        return v4;
                    }
                    v13 = -1333035401;
                }
                case 0: {
                    var1_1 /* !! */  = (int)it$Stage.bfcc("bfeo", bfcj(int ), (int)30);
                    if (var2) {
                        throw null;
                    }
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)it$Stage.bfcc("bfep", bfcj(int ), (int)31);
                    if (var2) {
                        throw null;
                    }
                }
                case 2: 
            }
            if (true) ** GOTO lbl97
            break;
        }
        do {
            if (true) ** continue;
lbl97:
            // 2 sources

            var1_1 /* !! */  = (int)it$Stage.bfcc("bfeq", bfcj(int ), (int)32);
            cfr_temp_0 = 0;
        } while (!var2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static it$Stage valueOf(String var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = it$Stage.db - it$Stage.bfcc("bfcy", bfbz(int ), (int)10)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == it$Stage.bfcc("bfcz", bfcj(int ), (int)8)) break;
            v0 /* !! */  = (long)it$Stage.bfcc("bfda", bfcj(int ), (int)9);
        }
        var3_1 = it$Stage.c;
        v1 /* !! */  = it$Stage.db;
        if (true) ** GOTO lbl12
        block11: while (true) {
            v1 /* !! */  = (long)(v2 - it$Stage.bfcc("bfdb", bfbz(int ), (int)11));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -143867637: {
                    break block11;
                }
                case 486302483: {
                    v2 = it$Stage.bfcc("bfdc", bfbz(int ), (int)12);
                    continue block11;
                }
                case 486856024: {
                    v2 = it$Stage.bfcc("bfdd", bfbz(int ), (int)13);
                    continue block11;
                }
                case 1917886755: {
                    v2 = it$Stage.bfcc("bfde", bfbz(int ), (int)14);
                    continue block11;
                }
            }
            break;
        }
        var2_2 = it$Stage.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = it$Stage.db - it$Stage.bfcc("bfdf", bfbz(int ), (int)15)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == it$Stage.bfcc("bfdg", bfcj(int ), (int)10)) break;
            v3 /* !! */  = (long)it$Stage.bfcc("bfdh", bfcj(int ), (int)11);
        }
        var1_3 = it$Stage.a;
        if (var3_1) {
            throw null;
lbl34:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl37:
        // 1 sources

        v4 /* !! */  = it$Stage.db;
        if (true) ** GOTO lbl41
        block14: while (true) {
            v4 /* !! */  = (long)(it$Stage.bfcc("bfdj", bfbz(int ), (int)17) - it$Stage.bfcc("bfdi", bfbz(int ), (int)16));
lbl41:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1182646642: {
                    continue block14;
                }
                case -143867637: {
                    break block14;
                }
            }
            break;
        }
        return Enum.valueOf(it$Stage.class, var0);
    }

    static {
        bfck = new int[38];
        bfcl = new int[38];
        it$Stage.bfew();
        it$Stage.bfex();
        bfca = new long[30];
        bfcb = new long[30];
        it$Stage.bfey();
        it$Stage.bfez();
        PREPARE = new it$Stage();
        FLYING_UP = new it$Stage();
        TARGETTING = new it$Stage();
        ATTACKING = new it$Stage();
        $VALUES = it$Stage.$values();
    }

    private static /* synthetic */ void bfez() {
        it$Stage.bfcb[0] = 6895644836907228075L;
        it$Stage.bfcb[1] = 8121898399670040708L;
        it$Stage.bfcb[2] = 2394720459484267997L;
        it$Stage.bfcb[3] = -1600240510002529618L;
        it$Stage.bfcb[4] = -5080821082797254901L;
        it$Stage.bfcb[5] = 7721570792152369479L;
        it$Stage.bfcb[6] = -1314037417724880049L;
        it$Stage.bfcb[7] = -7563690182402834799L;
        it$Stage.bfcb[8] = 7510038003702944712L;
        it$Stage.bfcb[9] = -5452086912264956581L;
        it$Stage.bfcb[10] = 8662607305307762581L;
        it$Stage.bfcb[11] = 8186965224347942250L;
        it$Stage.bfcb[12] = 8004290785940170529L;
        it$Stage.bfcb[13] = 5556858609588436015L;
        it$Stage.bfcb[14] = 8647630598253941283L;
        it$Stage.bfcb[15] = -2213610467295248803L;
        it$Stage.bfcb[16] = 8886235113313221500L;
        it$Stage.bfcb[17] = -1572370529991135007L;
        it$Stage.bfcb[18] = 760735219124722189L;
        it$Stage.bfcb[19] = -7589647900402557281L;
        it$Stage.bfcb[20] = 7553436149957909842L;
        it$Stage.bfcb[21] = -3051153417036725195L;
        it$Stage.bfcb[22] = 1157047316801470208L;
        it$Stage.bfcb[23] = -5696540712657650038L;
        it$Stage.bfcb[24] = -1750090088536736374L;
        it$Stage.bfcb[25] = -1288430003778353567L;
        it$Stage.bfcb[26] = 5373010856767528374L;
        it$Stage.bfcb[27] = 1859806274498927679L;
        it$Stage.bfcb[28] = 6784475605815067519L;
        it$Stage.bfcb[29] = -330740326215383345L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static it$Stage[] values() {
        v0 /* !! */  = it$Stage.db;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(it$Stage.bfcc("bfce", bfbz(int ), (int)1) - it$Stage.bfcc("bfcd", bfbz(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -143867637: {
                    break block20;
                }
                case 2098021850: {
                    continue block20;
                }
            }
            break;
        }
        var2 = it$Stage.c;
        v1 /* !! */  = it$Stage.db;
        if (true) ** GOTO lbl15
        block21: while (true) {
            v1 /* !! */  = (long)(v2 - it$Stage.bfcc("bfcf", bfbz(int ), (int)2));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -143867637: {
                    break block21;
                }
                case 699630611: {
                    v2 = it$Stage.bfcc("bfcg", bfbz(int ), (int)3);
                    continue block21;
                }
                case 783516702: {
                    v2 = it$Stage.bfcc("bfch", bfbz(int ), (int)4);
                    continue block21;
                }
            }
            break;
        }
        var1_1 /* !! */  = it$Stage.b;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_0 = it$Stage.db - it$Stage.bfcc("bfci", bfbz(int ), (int)5)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == it$Stage.bfcc("bfcm", bfcj(int ), (int)0)) break;
                    v3 /* !! */  = (long)it$Stage.bfcc("bfcn", bfcj(int ), (int)1);
                }
                var0_2 = it$Stage.a;
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                v4 /* !! */  = it$Stage.db;
                if (true) ** GOTO lbl44
                block24: while (true) {
                    v4 /* !! */  = (long)(v5 - it$Stage.bfcc("bfco", bfbz(int ), (int)6));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1574765083: {
                            v5 = it$Stage.bfcc("bfcp", bfbz(int ), (int)7);
                            continue block24;
                        }
                        case -143867637: {
                            break block24;
                        }
                        case 1876679599: {
                            v5 = it$Stage.bfcc("bfcq", bfbz(int ), (int)8);
                            continue block24;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = it$Stage.db - it$Stage.bfcc("bfcr", bfbz(int ), (int)9)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == it$Stage.bfcc("bfcs", bfcj(int ), (int)2)) break;
                    v6 /* !! */  = (long)it$Stage.bfcc("bfct", bfcj(int ), (int)3);
                }
                return (it$Stage[])it$Stage.$VALUES.clone();
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)it$Stage.bfcc("bfcu", bfcj(int ), (int)4);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl70
                    break;
                }
            }
            case 1: {
                var1_1 /* !! */  = (int)it$Stage.bfcc("bfcv", bfcj(int ), (int)5);
                if (!var2) break;
                throw null;
            }
lbl70:
            // 2 sources

            case 2: {
                var1_1 /* !! */  = (int)it$Stage.bfcc("bfcw", bfcj(int ), (int)6);
                if (!var2) break;
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)it$Stage.bfcc("bfcx", bfcj(int ), (int)7);
        ** while (!var2)
lbl77:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long bfbz(int n2) {
        return bfca[n2] ^ bfcb[n2];
    }
}

