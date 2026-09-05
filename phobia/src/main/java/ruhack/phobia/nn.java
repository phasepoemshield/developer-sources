/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public final class nn
extends Enum<nn> {
    private static int[] lwms;
    private final int priority;
    public static final /* enum */ nn HIGH_IMPORTANCE_3;
    public static final int b;
    public static final boolean a;
    private static long[] lwmc;
    private static int[] lwmr;
    public static final /* enum */ nn STANDARD;
    public static final /* enum */ nn LOW_PRIORITY;
    private static final /* synthetic */ nn[] $VALUES;
    public static final /* enum */ nn CRUCIAL_FOR_PLAYER_LIFE;
    public static final /* enum */ nn HIGH_IMPORTANCE_1;
    public static final /* enum */ nn HIGH_IMPORTANCE_2;
    static final long up = 427131254241852181L;
    public static final boolean c;
    private static long[] lwmb;
    public static final /* enum */ nn CRITICAL_FOR_USER_PROTECTION;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getPriority() {
        v0 /* !! */  = nn.up;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(nn.lwmd("lwnn", lwma(int ), (int)18) - nn.lwmd("lwnm", lwma(int ), (int)17));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -645039339: {
                    break block22;
                }
                case 3866417: {
                    continue block22;
                }
            }
            break;
        }
        var3_1 = nn.c;
        v1 /* !! */  = nn.up;
        if (true) ** GOTO lbl15
        block23: while (true) {
            v1 /* !! */  = (long)(nn.lwmd("lwnp", lwma(int ), (int)20) - nn.lwmd("lwno", lwma(int ), (int)19));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -645039339: {
                    break block23;
                }
                case -114193204: {
                    continue block23;
                }
            }
            break;
        }
        var2_2 /* !! */  = nn.b;
        v2 /* !! */  = nn.up;
        if (true) ** GOTO lbl25
        block24: while (true) {
            v2 /* !! */  = (long)(nn.lwmd("lwnr", lwma(int ), (int)22) - nn.lwmd("lwnq", lwma(int ), (int)21));
lbl25:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1568075404: {
                    continue block24;
                }
                case -645039339: {
                    break block24;
                }
            }
            break;
        }
        var1_3 = nn.a;
        if (var3_1) {
            throw null;
lbl33:
            // 1 sources

            return (int)nn.lwmd("lwns", lwmq(int ), (int)14);
        }
        ** while (var1_3 || var1_3)
lbl36:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = nn.up;
                if (true) ** GOTO lbl43
                block26: while (true) {
                    v3 /* !! */  = (long)(nn.lwmd("lwnu", lwma(int ), (int)24) - nn.lwmd("lwnt", lwma(int ), (int)23));
lbl43:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -645039339: {
                            break block26;
                        }
                        case 9455290: {
                            continue block26;
                        }
                    }
                    break;
                }
                return this.priority;
            }
lbl49:
            // 3 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)nn.lwmd("lwnv", lwmq(int ), (int)15);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)nn.lwmd("lwnw", lwmq(int ), (int)16);
                if (!var3_1) ** GOTO lbl49
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)nn.lwmd("lwnx", lwmq(int ), (int)17);
                if (!var3_1) ** GOTO lbl49
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)nn.lwmd("lwny", lwmq(int ), (int)18);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ long lwma(int n2) {
        return lwmb[n2] ^ lwmc[n2];
    }

    private nn(int n3) {
        int n4 = b;
        boolean bl2 = a;
        this.priority = n3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static nn[] values() {
        v0 /* !! */  = nn.up;
        if (true) ** GOTO lbl5
        block28: while (true) {
            v0 /* !! */  = (long)(nn.lwmd("lwmf", lwma(int ), (int)1) - nn.lwmd("lwme", lwma(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -645039339: {
                    break block28;
                }
                case -351451164: {
                    continue block28;
                }
            }
            break;
        }
        var2 = nn.c;
        v1 /* !! */  = nn.up;
        if (true) ** GOTO lbl15
        block29: while (true) {
            v1 /* !! */  = (long)(v2 - nn.lwmd("lwmg", lwma(int ), (int)2));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1527678985: {
                    v2 = nn.lwmd("lwmh", lwma(int ), (int)3);
                    continue block29;
                }
                case -645039339: {
                    break block29;
                }
                case -577239491: {
                    v2 = nn.lwmd("lwmi", lwma(int ), (int)4);
                    continue block29;
                }
            }
            break;
        }
        var1_1 /* !! */  = nn.b;
        v3 /* !! */  = nn.up;
        if (true) ** GOTO lbl29
        block30: while (true) {
            v3 /* !! */  = (long)(nn.lwmd("lwmk", lwma(int ), (int)6) - nn.lwmd("lwmj", lwma(int ), (int)5));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -645039339: {
                    break block30;
                }
                case 767994272: {
                    continue block30;
                }
            }
            break;
        }
        var0_2 = nn.a;
        if (var2) {
            throw null;
lbl37:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl37
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                v4 /* !! */  = nn.up;
                if (true) ** GOTO lbl48
                block32: while (true) {
                    v4 /* !! */  = (long)(nn.lwmd("lwmm", lwma(int ), (int)8) - nn.lwmd("lwml", lwma(int ), (int)7));
lbl48:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -645039339: {
                            break block32;
                        }
                        case 1737926847: {
                            continue block32;
                        }
                    }
                    break;
                }
                v5 /* !! */  = nn.up;
                if (true) ** GOTO lbl57
                block33: while (true) {
                    v5 /* !! */  = (long)(v6 - nn.lwmd("lwmn", lwma(int ), (int)9));
lbl57:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1929154119: {
                            v6 = nn.lwmd("lwmo", lwma(int ), (int)10);
                            continue block33;
                        }
                        case -1512389132: {
                            v6 = nn.lwmd("lwmp", lwma(int ), (int)11);
                            continue block33;
                        }
                        case -645039339: {
                            break block33;
                        }
                    }
                    break;
                }
                return (nn[])nn.$VALUES.clone();
            }
lbl67:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)nn.lwmd("lwmt", lwmq(int ), (int)0);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl76
            }
            case 1: {
                var1_1 /* !! */  = (int)nn.lwmd("lwmu", lwmq(int ), (int)1);
                if (var2) {
                    throw null;
                }
            }
lbl76:
            // 4 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)nn.lwmd("lwmv", lwmq(int ), (int)2);
                    if (!var2) ** GOTO lbl67
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)nn.lwmd("lwmw", lwmq(int ), (int)3);
        ** while (!var2)
lbl84:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite lwmd(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ nn[] $values() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nn.up - nn.lwmd("lwoc", lwma(int ), (int)25)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nn.lwmd("lwod", lwmq(int ), (int)22)) break;
            v0 /* !! */  = (long)nn.lwmd("lwoe", lwmq(int ), (int)23);
        }
        var2 = nn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nn.up - nn.lwmd("lwof", lwma(int ), (int)26)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == nn.lwmd("lwog", lwmq(int ), (int)24)) break;
            v1 /* !! */  = (long)nn.lwmd("lwoh", lwmq(int ), (int)25);
        }
        var1_1 /* !! */  = nn.b;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = nn.up;
                if (true) ** GOTO lbl22
                block32: while (true) {
                    v2 /* !! */  = (long)(v3 - nn.lwmd("lwoi", lwma(int ), (int)27));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -693789405: {
                            v3 = nn.lwmd("lwoj", lwma(int ), (int)28);
                            continue block32;
                        }
                        case -645039339: {
                            break block32;
                        }
                        case -302174961: {
                            v3 = nn.lwmd("lwok", lwma(int ), (int)29);
                            continue block32;
                        }
                    }
                    break;
                }
                var0_2 = nn.a;
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                v4 = new nn[7];
                v5 = nn.lwmd("lwol", lwmq(int ), (int)26);
                while (true) {
                    if ((v6 = (cfr_temp_2 = nn.up - nn.lwmd("lwom", lwma(int ), (int)30)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 == nn.lwmd("lwon", lwmq(int ), (int)27)) break;
                    v6 = -1447303284;
                }
                v4[v5] = nn.CRITICAL_FOR_USER_PROTECTION;
                v7 = nn.lwmd("lwoo", lwmq(int ), (int)28);
                while (true) {
                    if ((v8 = (cfr_temp_3 = nn.up - nn.lwmd("lwop", lwma(int ), (int)31)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 == nn.lwmd("lwoq", lwmq(int ), (int)29)) break;
                    v8 = 862766469;
                }
                v4[v7] = nn.CRUCIAL_FOR_PLAYER_LIFE;
                v9 = nn.lwmd("lwor", lwmq(int ), (int)30);
                v10 /* !! */  = nn.up;
                if (true) ** GOTO lbl59
                block36: while (true) {
                    v10 /* !! */  = (long)(nn.lwmd("lwot", lwma(int ), (int)33) - nn.lwmd("lwos", lwma(int ), (int)32));
lbl59:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -645039339: {
                            break block36;
                        }
                        case 86047083: {
                            continue block36;
                        }
                    }
                    break;
                }
                v4[v9] = nn.HIGH_IMPORTANCE_3;
                v11 = nn.lwmd("lwou", lwmq(int ), (int)31);
                while (true) {
                    if ((v12 = (cfr_temp_4 = nn.up - nn.lwmd("lwov", lwma(int ), (int)34)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v12 == nn.lwmd("lwow", lwmq(int ), (int)32)) break;
                    v12 = 53497090;
                }
                v4[v11] = nn.HIGH_IMPORTANCE_2;
                v13 = nn.lwmd("lwox", lwmq(int ), (int)33);
                v14 /* !! */  = nn.up;
                if (true) ** GOTO lbl78
                block38: while (true) {
                    v14 /* !! */  = (long)(nn.lwmd("lwoz", lwma(int ), (int)36) - nn.lwmd("lwoy", lwma(int ), (int)35));
lbl78:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -645039339: {
                            break block38;
                        }
                        case 836736577: {
                            continue block38;
                        }
                    }
                    break;
                }
                v4[v13] = nn.HIGH_IMPORTANCE_1;
                v15 = nn.lwmd("lwpa", lwmq(int ), (int)34);
                v16 /* !! */  = nn.up;
                if (true) ** GOTO lbl89
                block39: while (true) {
                    v16 /* !! */  = (long)(v17 - nn.lwmd("lwpb", lwma(int ), (int)37));
lbl89:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1836895174: {
                            v17 = nn.lwmd("lwpc", lwma(int ), (int)38);
                            continue block39;
                        }
                        case -645039339: {
                            break block39;
                        }
                        case 259780429: {
                            v17 = nn.lwmd("lwpd", lwma(int ), (int)39);
                            continue block39;
                        }
                        case 332681451: {
                            v17 = nn.lwmd("lwpe", lwma(int ), (int)40);
                            continue block39;
                        }
                    }
                    break;
                }
                v4[v15] = nn.STANDARD;
                v18 = nn.lwmd("lwpf", lwmq(int ), (int)35);
                v19 /* !! */  = nn.up;
                if (true) ** GOTO lbl107
                block40: while (true) {
                    v19 /* !! */  = (long)(v20 - nn.lwmd("lwpg", lwma(int ), (int)41));
lbl107:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -645039339: {
                            break block40;
                        }
                        case -451320475: {
                            v20 = nn.lwmd("lwph", lwma(int ), (int)42);
                            continue block40;
                        }
                        case 317949844: {
                            v20 = nn.lwmd("lwpi", lwma(int ), (int)43);
                            continue block40;
                        }
                    }
                    break;
                }
                v4[v18] = nn.LOW_PRIORITY;
                return v4;
            }
lbl118:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)nn.lwmd("lwpj", lwmq(int ), (int)36);
                    if (!var2) break block0;
                    throw null;
                }
            }
            case 1: {
                var1_1 /* !! */  = (int)nn.lwmd("lwpk", lwmq(int ), (int)37);
                if (!var2) ** GOTO lbl118
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)nn.lwmd("lwpl", lwmq(int ), (int)38);
                if (!var2) ** GOTO lbl118
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)nn.lwmd("lwpm", lwmq(int ), (int)39);
        ** while (!var2)
lbl134:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lwqe() {
        nn.lwmc[0] = -8454534116466671329L;
        nn.lwmc[1] = 1625677063941632687L;
        nn.lwmc[2] = 116627568443006665L;
        nn.lwmc[3] = 6053737425149615418L;
        nn.lwmc[4] = 6050188799023339512L;
        nn.lwmc[5] = 8967102897983098638L;
        nn.lwmc[6] = -2859243890263428371L;
        nn.lwmc[7] = 3848628668667655808L;
        nn.lwmc[8] = 3447055306608303286L;
        nn.lwmc[9] = 2791866161748398430L;
        nn.lwmc[10] = -2933508422642113650L;
        nn.lwmc[11] = 422713834380986347L;
        nn.lwmc[12] = -4829436784026879655L;
        nn.lwmc[13] = 5925371493713336658L;
        nn.lwmc[14] = 3028966751488774062L;
        nn.lwmc[15] = 2162555943782898270L;
        nn.lwmc[16] = 6199785539278156840L;
        nn.lwmc[17] = 8597318280973534216L;
        nn.lwmc[18] = 90235603753087510L;
        nn.lwmc[19] = -5865901688255484854L;
        nn.lwmc[20] = 8667170064949903665L;
        nn.lwmc[21] = 1548134362893640455L;
        nn.lwmc[22] = 8660104430664754903L;
        nn.lwmc[23] = -9068040983922152912L;
        nn.lwmc[24] = -51434219735403051L;
        nn.lwmc[25] = 3332468703221994370L;
        nn.lwmc[26] = -2373147974526741400L;
        nn.lwmc[27] = -2674227433893759963L;
        nn.lwmc[28] = -4268259959815806484L;
        nn.lwmc[29] = -7727016401360317189L;
        nn.lwmc[30] = 1888313807475536769L;
        nn.lwmc[31] = -6529928812339935349L;
        nn.lwmc[32] = 1330182718679589382L;
        nn.lwmc[33] = -1750194727966955205L;
        nn.lwmc[34] = 5384632694738205985L;
        nn.lwmc[35] = 2031160152781019661L;
        nn.lwmc[36] = 1224227223448135653L;
        nn.lwmc[37] = -4958580865724595781L;
        nn.lwmc[38] = -4557350254594868901L;
        nn.lwmc[39] = -5173921196155516413L;
        nn.lwmc[40] = 4004149939701495396L;
        nn.lwmc[41] = 4628579130081534805L;
        nn.lwmc[42] = 5649258119541676576L;
        nn.lwmc[43] = -166753730027712015L;
    }

    static {
        lwmr = new int[54];
        lwms = new int[54];
        nn.lwqb();
        nn.lwqc();
        lwmb = new long[44];
        lwmc = new long[44];
        nn.lwqd();
        nn.lwqe();
        CRITICAL_FOR_USER_PROTECTION = new nn((int)nn.lwmd("lwpo", lwmq(int ), (int)41));
        CRUCIAL_FOR_PLAYER_LIFE = new nn((int)nn.lwmd("lwpq", lwmq(int ), (int)43));
        HIGH_IMPORTANCE_3 = new nn((int)nn.lwmd("lwps", lwmq(int ), (int)45));
        HIGH_IMPORTANCE_2 = new nn((int)nn.lwmd("lwpu", lwmq(int ), (int)47));
        HIGH_IMPORTANCE_1 = new nn((int)nn.lwmd("lwpw", lwmq(int ), (int)49));
        STANDARD = new nn((int)nn.lwmd("lwpy", lwmq(int ), (int)51));
        LOW_PRIORITY = new nn((int)nn.lwmd("lwqa", lwmq(int ), (int)53));
        $VALUES = nn.$values();
    }

    private static /* synthetic */ void lwqd() {
        nn.lwmb[0] = -749283855986757750L;
        nn.lwmb[1] = 3468819489154788435L;
        nn.lwmb[2] = 584106113905479359L;
        nn.lwmb[3] = -4747758722401199472L;
        nn.lwmb[4] = -2551437812935580121L;
        nn.lwmb[5] = 1797504693238385533L;
        nn.lwmb[6] = -7524677685480956952L;
        nn.lwmb[7] = -2130492529114997280L;
        nn.lwmb[8] = 2679878823810682086L;
        nn.lwmb[9] = -1448196230100442883L;
        nn.lwmb[10] = 7918357009613610983L;
        nn.lwmb[11] = 7459262521502263996L;
        nn.lwmb[12] = -5751506455851288905L;
        nn.lwmb[13] = 3321238839620636372L;
        nn.lwmb[14] = 4877501111017271191L;
        nn.lwmb[15] = 2064954463939889809L;
        nn.lwmb[16] = -5721796751917048242L;
        nn.lwmb[17] = 2665506858573768439L;
        nn.lwmb[18] = -817836608960627818L;
        nn.lwmb[19] = 667051031607553501L;
        nn.lwmb[20] = 1811821845429026223L;
        nn.lwmb[21] = -3730119272057401004L;
        nn.lwmb[22] = 6993543601938295488L;
        nn.lwmb[23] = 5521407608223956129L;
        nn.lwmb[24] = -2391335482357728206L;
        nn.lwmb[25] = 1266264212611439038L;
        nn.lwmb[26] = 544879156447254094L;
        nn.lwmb[27] = 3147272768205596017L;
        nn.lwmb[28] = 5654268983291282640L;
        nn.lwmb[29] = -2472813668313064134L;
        nn.lwmb[30] = 4243025858442764767L;
        nn.lwmb[31] = -391614425788428031L;
        nn.lwmb[32] = 6247156032916965401L;
        nn.lwmb[33] = 6253512174565037087L;
        nn.lwmb[34] = 7845327827640410832L;
        nn.lwmb[35] = 5151335992705729227L;
        nn.lwmb[36] = 2741786553535476271L;
        nn.lwmb[37] = 4183019983141477011L;
        nn.lwmb[38] = 8922442654045145089L;
        nn.lwmb[39] = -1235865605725282501L;
        nn.lwmb[40] = 2293501780504600668L;
        nn.lwmb[41] = 7353582896962832719L;
        nn.lwmb[42] = 910361514996088279L;
        nn.lwmb[43] = 9188848501162393808L;
    }

    private static /* synthetic */ void lwqb() {
        nn.lwmr[0] = -1309922645;
        nn.lwmr[1] = 2093085568;
        nn.lwmr[2] = -682998763;
        nn.lwmr[3] = -1442450393;
        nn.lwmr[4] = 503281821;
        nn.lwmr[5] = 365399114;
        nn.lwmr[6] = 2018107127;
        nn.lwmr[7] = -1484777934;
        nn.lwmr[8] = -1483323587;
        nn.lwmr[9] = 2049375025;
        nn.lwmr[10] = 29945946;
        nn.lwmr[11] = 1616581265;
        nn.lwmr[12] = -949887327;
        nn.lwmr[13] = 1855481363;
        nn.lwmr[14] = -896605508;
        nn.lwmr[15] = -157981177;
        nn.lwmr[16] = 12671342;
        nn.lwmr[17] = -562271950;
        nn.lwmr[18] = -568855415;
        nn.lwmr[19] = 604399777;
        nn.lwmr[20] = -140402084;
        nn.lwmr[21] = 1744749563;
        nn.lwmr[22] = -917877240;
        nn.lwmr[23] = -1390631013;
        nn.lwmr[24] = 984409799;
        nn.lwmr[25] = 2014895968;
        nn.lwmr[26] = 37633797;
        nn.lwmr[27] = 2016644294;
        nn.lwmr[28] = -1218014363;
        nn.lwmr[29] = 480637911;
        nn.lwmr[30] = -1875495998;
        nn.lwmr[31] = 356357490;
        nn.lwmr[32] = 229909191;
        nn.lwmr[33] = 155705911;
        nn.lwmr[34] = -266314518;
        nn.lwmr[35] = 1003209518;
        nn.lwmr[36] = -1127155710;
        nn.lwmr[37] = -1663917557;
        nn.lwmr[38] = 1204544148;
        nn.lwmr[39] = 118462197;
        nn.lwmr[40] = -1248577548;
        nn.lwmr[41] = -960431595;
        nn.lwmr[42] = 608595248;
        nn.lwmr[43] = 1237069459;
        nn.lwmr[44] = -2145296147;
        nn.lwmr[45] = -1684394116;
        nn.lwmr[46] = -1953201037;
        nn.lwmr[47] = -356074984;
        nn.lwmr[48] = -2003498091;
        nn.lwmr[49] = 1760137158;
        nn.lwmr[50] = -1371895487;
        nn.lwmr[51] = -1167248315;
        nn.lwmr[52] = -993792684;
        nn.lwmr[53] = -158799071;
    }

    private static /* synthetic */ int lwmq(int n2) {
        return lwmr[n2] ^ lwms[n2];
    }

    private static /* synthetic */ void lwqc() {
        nn.lwms[0] = -1309922647;
        nn.lwms[1] = 2093085571;
        nn.lwms[2] = -682998764;
        nn.lwms[3] = -1442450393;
        nn.lwms[4] = -503281822;
        nn.lwms[5] = -1146138701;
        nn.lwms[6] = 2018107126;
        nn.lwms[7] = -877942635;
        nn.lwms[8] = -1483323588;
        nn.lwms[9] = 1850183313;
        nn.lwms[10] = 29945944;
        nn.lwms[11] = 1616581265;
        nn.lwms[12] = -949887327;
        nn.lwms[13] = 1855481363;
        nn.lwms[14] = -1617492044;
        nn.lwms[15] = -157981179;
        nn.lwms[16] = 12671342;
        nn.lwms[17] = -562271951;
        nn.lwms[18] = -568855414;
        nn.lwms[19] = 604399779;
        nn.lwms[20] = -140402084;
        nn.lwms[21] = 1744749562;
        nn.lwms[22] = 917877239;
        nn.lwms[23] = -132793919;
        nn.lwms[24] = 984409798;
        nn.lwms[25] = -533178878;
        nn.lwms[26] = 37633797;
        nn.lwms[27] = -2016644295;
        nn.lwms[28] = -1218014364;
        nn.lwms[29] = -480637912;
        nn.lwms[30] = -1875496000;
        nn.lwms[31] = 356357489;
        nn.lwms[32] = -229909192;
        nn.lwms[33] = 155705907;
        nn.lwms[34] = -266314513;
        nn.lwms[35] = 1003209512;
        nn.lwms[36] = -1127155712;
        nn.lwms[37] = -1663917558;
        nn.lwms[38] = 1204544148;
        nn.lwms[39] = 118462197;
        nn.lwms[40] = -1248577548;
        nn.lwms[41] = -960431575;
        nn.lwms[42] = 608595249;
        nn.lwms[43] = 1237069499;
        nn.lwms[44] = -2145296145;
        nn.lwms[45] = -1684394145;
        nn.lwms[46] = -1953201040;
        nn.lwms[47] = -356075002;
        nn.lwms[48] = -2003498095;
        nn.lwms[49] = 1760137170;
        nn.lwms[50] = -1371895484;
        nn.lwms[51] = -1167248315;
        nn.lwms[52] = -993792686;
        nn.lwms[53] = 158799053;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static nn valueOf(String var0) {
        v0 /* !! */  = nn.up;
        if (true) ** GOTO lbl5
        block10: while (true) {
            v0 /* !! */  = (long)(nn.lwmd("lwmy", lwma(int ), (int)13) - nn.lwmd("lwmx", lwma(int ), (int)12));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -645039339: {
                    break block10;
                }
                case 2014069508: {
                    continue block10;
                }
            }
            break;
        }
        var3_1 = nn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = nn.up - nn.lwmd("lwmz", lwma(int ), (int)14)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == nn.lwmd("lwna", lwmq(int ), (int)4)) break;
            v1 /* !! */  = (long)nn.lwmd("lwnb", lwmq(int ), (int)5);
        }
        var2_2 /* !! */  = nn.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = nn.up - nn.lwmd("lwnc", lwma(int ), (int)15)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == nn.lwmd("lwnd", lwmq(int ), (int)6)) break;
            v2 /* !! */  = (long)nn.lwmd("lwne", lwmq(int ), (int)7);
        }
        var1_3 = nn.a;
        if (!var3_1) ** GOTO lbl31
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl31:
                // 1 sources

                if (var1_3 || var1_3) continue block13;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = nn.up - nn.lwmd("lwnf", lwma(int ), (int)16)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == nn.lwmd("lwng", lwmq(int ), (int)8)) break;
                    v3 /* !! */  = (long)nn.lwmd("lwnh", lwmq(int ), (int)9);
                }
                return Enum.valueOf(nn.class, var0);
lbl39:
                // 2 sources

                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)nn.lwmd("lwni", lwmq(int ), (int)10);
                        if (!var3_1) ** GOTO lbl-1000
                        throw null;
                    }
                }
                case 1: {
                    var2_2 /* !! */  = (int)nn.lwmd("lwnj", lwmq(int ), (int)11);
                    if (!var3_1) ** GOTO lbl39
                    throw null;
                }
                case 2: {
                    do {
                        var2_2 /* !! */  = (int)nn.lwmd("lwnk", lwmq(int ), (int)12);
                    } while (!var3_1);
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)nn.lwmd("lwnl", lwmq(int ), (int)13);
        ** while (!var3_1)
lbl56:
        // 1 sources

        throw null;
    }
}

