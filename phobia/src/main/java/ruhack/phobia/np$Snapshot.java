/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;

final class np$Snapshot
extends Record {
    public static final boolean a;
    private static int[] hcdd;
    private static int[] hcde;
    public static final int b;
    private final boolean scoreboard;
    public static final boolean c;
    private final float health;
    private static long[] hcdk;
    private static long[] hcdl;
    protected static final long oa = 5562615879824573991L;

    public static /* synthetic */ CallSite hcdf(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void hcyq() {
        np$Snapshot.hcdl[0] = -1043510298338717855L;
        np$Snapshot.hcdl[1] = 2418842155890260795L;
        np$Snapshot.hcdl[2] = 8054284545176027883L;
        np$Snapshot.hcdl[3] = 1281042103898816026L;
        np$Snapshot.hcdl[4] = -8342405345786213325L;
        np$Snapshot.hcdl[5] = 5549988884384595551L;
        np$Snapshot.hcdl[6] = -5131153418042970066L;
        np$Snapshot.hcdl[7] = -1558997754289257962L;
        np$Snapshot.hcdl[8] = -6246592497330092382L;
        np$Snapshot.hcdl[9] = -885982586386899944L;
        np$Snapshot.hcdl[10] = 7591307716159078581L;
        np$Snapshot.hcdl[11] = 3620082626284390716L;
        np$Snapshot.hcdl[12] = 8107370267264247967L;
        np$Snapshot.hcdl[13] = -974206169322194265L;
        np$Snapshot.hcdl[14] = 6722851068228345886L;
        np$Snapshot.hcdl[15] = -3322190598611216676L;
        np$Snapshot.hcdl[16] = 5483336804192951818L;
        np$Snapshot.hcdl[17] = -7730882566642031285L;
        np$Snapshot.hcdl[18] = 2033583731717656443L;
        np$Snapshot.hcdl[19] = -6479373701868116512L;
        np$Snapshot.hcdl[20] = -5460309217078073598L;
        np$Snapshot.hcdl[21] = 2354244093092877379L;
        np$Snapshot.hcdl[22] = -2466893115430202640L;
        np$Snapshot.hcdl[23] = -8716437140895235046L;
        np$Snapshot.hcdl[24] = 7913586884636362737L;
        np$Snapshot.hcdl[25] = -7881949152133286828L;
        np$Snapshot.hcdl[26] = -119588126315593645L;
        np$Snapshot.hcdl[27] = -3418029524425603551L;
        np$Snapshot.hcdl[28] = -4452410075488588799L;
        np$Snapshot.hcdl[29] = 1727836083604063648L;
        np$Snapshot.hcdl[30] = -3732530218860656431L;
        np$Snapshot.hcdl[31] = -3846500671705119045L;
        np$Snapshot.hcdl[32] = 1986882013213436902L;
        np$Snapshot.hcdl[33] = 3146447279471373559L;
        np$Snapshot.hcdl[34] = -2732092307883394535L;
        np$Snapshot.hcdl[35] = -2827081362567572853L;
        np$Snapshot.hcdl[36] = -4617609475519446523L;
        np$Snapshot.hcdl[37] = 7168436943407559973L;
        np$Snapshot.hcdl[38] = -6761160962399578052L;
        np$Snapshot.hcdl[39] = 8552895716793319914L;
        np$Snapshot.hcdl[40] = -2744296612848333539L;
        np$Snapshot.hcdl[41] = 2384031743321870967L;
        np$Snapshot.hcdl[42] = -8303662235977872050L;
        np$Snapshot.hcdl[43] = 3755113550624757891L;
    }

    static {
        hcdd = new int[41];
        hcde = new int[41];
        np$Snapshot.hcyn();
        np$Snapshot.hcyo();
        hcdk = new long[44];
        hcdl = new long[44];
        np$Snapshot.hcyp();
        np$Snapshot.hcyq();
    }

    private static /* synthetic */ long hcdj(int n2) {
        return hcdk[n2] ^ hcdl[n2];
    }

    private static /* synthetic */ void hcyo() {
        np$Snapshot.hcde[0] = -263436527;
        np$Snapshot.hcde[1] = -1221397926;
        np$Snapshot.hcde[2] = 433306485;
        np$Snapshot.hcde[3] = 1630257003;
        np$Snapshot.hcde[4] = 1662025856;
        np$Snapshot.hcde[5] = -1175307317;
        np$Snapshot.hcde[6] = -1089453869;
        np$Snapshot.hcde[7] = -609953828;
        np$Snapshot.hcde[8] = 1316554858;
        np$Snapshot.hcde[9] = -1016663726;
        np$Snapshot.hcde[10] = -127417728;
        np$Snapshot.hcde[11] = -152762735;
        np$Snapshot.hcde[12] = -1814989930;
        np$Snapshot.hcde[13] = -104936155;
        np$Snapshot.hcde[14] = -262206015;
        np$Snapshot.hcde[15] = 212971537;
        np$Snapshot.hcde[16] = 1173613364;
        np$Snapshot.hcde[17] = 539627811;
        np$Snapshot.hcde[18] = 2082134897;
        np$Snapshot.hcde[19] = -1417037880;
        np$Snapshot.hcde[20] = 616552872;
        np$Snapshot.hcde[21] = -2058321821;
        np$Snapshot.hcde[22] = -697506668;
        np$Snapshot.hcde[23] = 641917188;
        np$Snapshot.hcde[24] = -1034078871;
        np$Snapshot.hcde[25] = -1351819022;
        np$Snapshot.hcde[26] = 505898929;
        np$Snapshot.hcde[27] = 378172151;
        np$Snapshot.hcde[28] = -287862125;
        np$Snapshot.hcde[29] = -1503772345;
        np$Snapshot.hcde[30] = 1163141632;
        np$Snapshot.hcde[31] = 47978027;
        np$Snapshot.hcde[32] = 594486668;
        np$Snapshot.hcde[33] = -162475392;
        np$Snapshot.hcde[34] = 1703442756;
        np$Snapshot.hcde[35] = -1274429200;
        np$Snapshot.hcde[36] = 838831255;
        np$Snapshot.hcde[37] = -369901608;
        np$Snapshot.hcde[38] = 1864317635;
        np$Snapshot.hcde[39] = 880144887;
        np$Snapshot.hcde[40] = 244369741;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = np$Snapshot.oa - np$Snapshot.hcdf("hcdm", hcdj(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == np$Snapshot.hcdf("hcdn", hcdc(int ), (int)3)) break;
            v0 /* !! */  = (long)np$Snapshot.hcdf("hcdo", hcdc(int ), (int)4);
        }
        var3_1 = np$Snapshot.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = np$Snapshot.oa - np$Snapshot.hcdf("hcdp", hcdj(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == np$Snapshot.hcdf("hcdq", hcdc(int ), (int)5)) break;
            v1 /* !! */  = (long)np$Snapshot.hcdf("hcdr", hcdc(int ), (int)6);
        }
        var2_2 /* !! */  = np$Snapshot.b;
        v2 /* !! */  = np$Snapshot.oa;
        if (true) ** GOTO lbl19
        block12: while (true) {
            v2 /* !! */  = (long)(np$Snapshot.hcdf("hcdt", hcdj(int ), (int)3) - np$Snapshot.hcdf("hcds", hcdj(int ), (int)2));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1293679065: {
                    break block12;
                }
                case 1887698008: {
                    continue block12;
                }
            }
            break;
        }
        var1_3 = np$Snapshot.a;
        if (var3_1) {
            throw null;
            return null;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = np$Snapshot.oa - np$Snapshot.hcdf("hcdu", hcdj(int ), (int)4)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == np$Snapshot.hcdf("hcdv", hcdc(int ), (int)7)) break;
                    v3 /* !! */  = (long)np$Snapshot.hcdf("hcdw", hcdc(int ), (int)8);
                }
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{np$Snapshot.class, "health;scoreboard", "health", "scoreboard"}, this);
            }
lbl40:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)np$Snapshot.hcdf("hcdx", hcdc(int ), (int)9);
                } while (!var3_1);
                throw null;
            }
lbl45:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)np$Snapshot.hcdf("hcdy", hcdc(int ), (int)10);
                if (!var3_1) ** GOTO lbl40
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)np$Snapshot.hcdf("hcdz", hcdc(int ), (int)11);
                    if (!var3_1) ** GOTO lbl45
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)np$Snapshot.hcdf("hcea", hcdc(int ), (int)12);
        ** while (!var3_1)
lbl57:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        v0 /* !! */  = np$Snapshot.oa;
        if (true) ** GOTO lbl5
        block26: while (true) {
            v0 /* !! */  = (long)(np$Snapshot.hcdf("hcet", hcdj(int ), (int)12) - np$Snapshot.hcdf("hces", hcdj(int ), (int)11));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1293679065: {
                    break block26;
                }
                case -251669120: {
                    continue block26;
                }
            }
            break;
        }
        var4_2 = np$Snapshot.c;
        v1 /* !! */  = np$Snapshot.oa;
        if (true) ** GOTO lbl15
        block27: while (true) {
            v1 /* !! */  = (long)(v2 - np$Snapshot.hcdf("hceu", hcdj(int ), (int)13));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1293679065: {
                    break block27;
                }
                case -772999180: {
                    v2 = np$Snapshot.hcdf("hcev", hcdj(int ), (int)14);
                    continue block27;
                }
                case -90139752: {
                    v2 = np$Snapshot.hcdf("hcew", hcdj(int ), (int)15);
                    continue block27;
                }
                case 1467013453: {
                    v2 = np$Snapshot.hcdf("hcex", hcdj(int ), (int)16);
                    continue block27;
                }
            }
            break;
        }
        var3_3 /* !! */  = np$Snapshot.b;
        v3 /* !! */  = np$Snapshot.oa;
        if (true) ** GOTO lbl32
        block28: while (true) {
            v3 /* !! */  = (long)(v4 - np$Snapshot.hcdf("hcey", hcdj(int ), (int)17));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1510741164: {
                    v4 = np$Snapshot.hcdf("hcez", hcdj(int ), (int)18);
                    continue block28;
                }
                case -1293679065: {
                    break block28;
                }
                case 516583290: {
                    v4 = np$Snapshot.hcdf("hcfa", hcdj(int ), (int)19);
                    continue block28;
                }
                case 1506233593: {
                    v4 = np$Snapshot.hcdf("hcfb", hcdj(int ), (int)20);
                    continue block28;
                }
            }
            break;
        }
        var2_4 = np$Snapshot.a;
        if (var4_2) {
            throw null;
            return (boolean)np$Snapshot.hcdf("hcfc", hcdc(int ), (int)24);
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block16 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** continue;
                v5 /* !! */  = np$Snapshot.oa;
                if (true) ** GOTO lbl57
                block30: while (true) {
                    v5 /* !! */  = (long)(np$Snapshot.hcdf("hcfe", hcdj(int ), (int)22) - np$Snapshot.hcdf("hcfd", hcdj(int ), (int)21));
lbl57:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1293679065: {
                            break block30;
                        }
                        case 1997800700: {
                            continue block30;
                        }
                    }
                    break;
                }
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{np$Snapshot.class, "health;scoreboard", "health", "scoreboard"}, this, var1_1);
            }
            case 0: {
                var3_3 /* !! */  = (int)np$Snapshot.hcdf("hcff", hcdc(int ), (int)25);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl73
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)np$Snapshot.hcdf("hcfg", hcdc(int ), (int)26);
                    if (!var4_2) break block16;
                    throw null;
                }
            }
lbl73:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)np$Snapshot.hcdf("hcfh", hcdc(int ), (int)27);
                if (!var4_2) break;
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)np$Snapshot.hcdf("hcfi", hcdc(int ), (int)28);
        ** while (!var4_2)
lbl80:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float hcfr(int n2) {
        return Float.intBitsToFloat(hcdd[n2] ^ hcde[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean scoreboard() {
        v0 /* !! */  = np$Snapshot.oa;
        if (true) ** GOTO lbl5
        block26: while (true) {
            v0 /* !! */  = (long)(np$Snapshot.hcdf("hcxx", hcdj(int ), (int)33) - np$Snapshot.hcdf("hcxw", hcdj(int ), (int)32));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1293679065: {
                    break block26;
                }
                case 1887807405: {
                    continue block26;
                }
            }
            break;
        }
        var3_1 = np$Snapshot.c;
        v1 /* !! */  = np$Snapshot.oa;
        if (true) ** GOTO lbl15
        block27: while (true) {
            v1 /* !! */  = (long)(v2 - np$Snapshot.hcdf("hcxy", hcdj(int ), (int)34));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1293679065: {
                    break block27;
                }
                case -581587781: {
                    v2 = np$Snapshot.hcdf("hcxz", hcdj(int ), (int)35);
                    continue block27;
                }
                case 1725123822: {
                    v2 = np$Snapshot.hcdf("hcya", hcdj(int ), (int)36);
                    continue block27;
                }
                case 2013806999: {
                    v2 = np$Snapshot.hcdf("hcyb", hcdj(int ), (int)37);
                    continue block27;
                }
            }
            break;
        }
        var2_2 /* !! */  = np$Snapshot.b;
        v3 /* !! */  = np$Snapshot.oa;
        if (true) ** GOTO lbl32
        block28: while (true) {
            v3 /* !! */  = (long)(v4 - np$Snapshot.hcdf("hcyc", hcdj(int ), (int)38));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1948866240: {
                    v4 = np$Snapshot.hcdf("hcyd", hcdj(int ), (int)39);
                    continue block28;
                }
                case -1293679065: {
                    break block28;
                }
                case -1149826743: {
                    v4 = np$Snapshot.hcdf("hcye", hcdj(int ), (int)40);
                    continue block28;
                }
                case -1053652246: {
                    v4 = np$Snapshot.hcdf("hcyf", hcdj(int ), (int)41);
                    continue block28;
                }
            }
            break;
        }
        var1_3 = np$Snapshot.a;
        if (var3_1) {
            throw null;
lbl47:
            // 1 sources

            return (boolean)np$Snapshot.hcdf("hcyg", hcdc(int ), (int)36);
        }
        ** while (var1_3 || var1_3)
lbl50:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block16 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v5 /* !! */  = np$Snapshot.oa;
                if (true) ** GOTO lbl57
                block30: while (true) {
                    v5 /* !! */  = (long)(np$Snapshot.hcdf("hcyi", hcdj(int ), (int)43) - np$Snapshot.hcdf("hcyh", hcdj(int ), (int)42));
lbl57:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1293679065: {
                            break block30;
                        }
                        case 1317453767: {
                            continue block30;
                        }
                    }
                    break;
                }
                return this.scoreboard;
            }
            case 0: {
                var2_2 /* !! */  = (int)np$Snapshot.hcdf("hcyj", hcdc(int ), (int)37);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)np$Snapshot.hcdf("hcyk", hcdc(int ), (int)38);
                if (!var3_1) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)np$Snapshot.hcdf("hcyl", hcdc(int ), (int)39);
                    if (!var3_1) break block16;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)np$Snapshot.hcdf("hcym", hcdc(int ), (int)40);
        ** while (!var3_1)
lbl79:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hcyn() {
        np$Snapshot.hcdd[0] = -263436527;
        np$Snapshot.hcdd[1] = -1221397925;
        np$Snapshot.hcdd[2] = 433306487;
        np$Snapshot.hcdd[3] = 1630257002;
        np$Snapshot.hcdd[4] = -134250425;
        np$Snapshot.hcdd[5] = -1175307318;
        np$Snapshot.hcdd[6] = -468991229;
        np$Snapshot.hcdd[7] = -609953827;
        np$Snapshot.hcdd[8] = 982001992;
        np$Snapshot.hcdd[9] = -1016663725;
        np$Snapshot.hcdd[10] = -127417726;
        np$Snapshot.hcdd[11] = -152762735;
        np$Snapshot.hcdd[12] = -1814989930;
        np$Snapshot.hcdd[13] = 104936154;
        np$Snapshot.hcdd[14] = 1244916885;
        np$Snapshot.hcdd[15] = 212971536;
        np$Snapshot.hcdd[16] = 2090287193;
        np$Snapshot.hcdd[17] = -539627812;
        np$Snapshot.hcdd[18] = -521944839;
        np$Snapshot.hcdd[19] = -806808419;
        np$Snapshot.hcdd[20] = 616552872;
        np$Snapshot.hcdd[21] = -2058321824;
        np$Snapshot.hcdd[22] = -697506666;
        np$Snapshot.hcdd[23] = 641917189;
        np$Snapshot.hcdd[24] = -1034078872;
        np$Snapshot.hcdd[25] = -1351819024;
        np$Snapshot.hcdd[26] = 505898928;
        np$Snapshot.hcdd[27] = 378172151;
        np$Snapshot.hcdd[28] = -287862127;
        np$Snapshot.hcdd[29] = -1732760959;
        np$Snapshot.hcdd[30] = 1163141633;
        np$Snapshot.hcdd[31] = -1335280609;
        np$Snapshot.hcdd[32] = 594486671;
        np$Snapshot.hcdd[33] = -162475392;
        np$Snapshot.hcdd[34] = 1703442757;
        np$Snapshot.hcdd[35] = -1274429198;
        np$Snapshot.hcdd[36] = 838831254;
        np$Snapshot.hcdd[37] = -369901608;
        np$Snapshot.hcdd[38] = 1864317635;
        np$Snapshot.hcdd[39] = 880144885;
        np$Snapshot.hcdd[40] = 244369743;
    }

    private static /* synthetic */ int hcdc(int n2) {
        return hcdd[n2] ^ hcde[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float health() {
        v0 /* !! */  = np$Snapshot.oa;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - np$Snapshot.hcdf("hcfj", hcdj(int ), (int)23));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1293679065: {
                    break block20;
                }
                case -184403764: {
                    v1 = np$Snapshot.hcdf("hcfk", hcdj(int ), (int)24);
                    continue block20;
                }
                case 83278957: {
                    v1 = np$Snapshot.hcdf("hcfl", hcdj(int ), (int)25);
                    continue block20;
                }
                case 310932558: {
                    v1 = np$Snapshot.hcdf("hcfm", hcdj(int ), (int)26);
                    continue block20;
                }
            }
            break;
        }
        var3_1 = np$Snapshot.c;
        v2 /* !! */  = np$Snapshot.oa;
        if (true) ** GOTO lbl22
        block21: while (true) {
            v2 /* !! */  = (long)(np$Snapshot.hcdf("hcfo", hcdj(int ), (int)28) - np$Snapshot.hcdf("hcfn", hcdj(int ), (int)27));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1293679065: {
                    break block21;
                }
                case 732591667: {
                    continue block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = np$Snapshot.b;
        v3 /* !! */  = np$Snapshot.oa;
        if (true) ** GOTO lbl32
        block22: while (true) {
            v3 /* !! */  = (long)(np$Snapshot.hcdf("hcfq", hcdj(int ), (int)30) - np$Snapshot.hcdf("hcfp", hcdj(int ), (int)29));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1766525225: {
                    continue block22;
                }
                case -1293679065: {
                    break block22;
                }
            }
            break;
        }
        var1_3 = np$Snapshot.a;
        if (var3_1) {
            throw null;
lbl40:
            // 2 sources

            return (float)np$Snapshot.hcdf("hcfs", hcfr(int ), (int)29);
        }
        if (var1_3) ** GOTO lbl40
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = np$Snapshot.oa - np$Snapshot.hcdf("hcft", hcdj(int ), (int)31)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == np$Snapshot.hcdf("hcfu", hcdc(int ), (int)30)) break;
                    v4 /* !! */  = (long)np$Snapshot.hcdf("hcfv", hcdc(int ), (int)31);
                }
                return this.health;
            }
            case 0: {
                var2_2 /* !! */  = (int)np$Snapshot.hcdf("hcfw", hcdc(int ), (int)32);
                if (!var3_1) break;
                throw null;
            }
lbl58:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)np$Snapshot.hcdf("hcxt", hcdc(int ), (int)33);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)np$Snapshot.hcdf("hcxu", hcdc(int ), (int)34);
                    if (!var3_1) ** GOTO lbl58
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)np$Snapshot.hcdf("hcxv", hcdc(int ), (int)35);
        ** while (!var3_1)
lbl70:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = np$Snapshot.oa - np$Snapshot.hcdf("hceb", hcdj(int ), (int)5)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == np$Snapshot.hcdf("hcec", hcdc(int ), (int)13)) break;
            v0 /* !! */  = (long)np$Snapshot.hcdf("hced", hcdc(int ), (int)14);
        }
        var3_1 = np$Snapshot.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = np$Snapshot.oa - np$Snapshot.hcdf("hcee", hcdj(int ), (int)6)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == np$Snapshot.hcdf("hcef", hcdc(int ), (int)15)) break;
            v1 /* !! */  = (long)np$Snapshot.hcdf("hceg", hcdc(int ), (int)16);
        }
        var2_2 /* !! */  = np$Snapshot.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = np$Snapshot.oa - np$Snapshot.hcdf("hceh", hcdj(int ), (int)7)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == np$Snapshot.hcdf("hcei", hcdc(int ), (int)17)) break;
            v2 /* !! */  = (long)np$Snapshot.hcdf("hcej", hcdc(int ), (int)18);
        }
        var1_3 = np$Snapshot.a;
        if (!var3_1) ** GOTO lbl28
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (int)np$Snapshot.hcdf("hcek", hcdc(int ), (int)19);
                }
lbl28:
                // 1 sources

                if (var1_3 || var1_3) continue block14;
                v3 /* !! */  = np$Snapshot.oa;
                if (true) ** GOTO lbl33
                block15: while (true) {
                    v3 /* !! */  = (long)(v4 - np$Snapshot.hcdf("hcel", hcdj(int ), (int)8));
lbl33:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1293679065: {
                            break block15;
                        }
                        case -85654155: {
                            v4 = np$Snapshot.hcdf("hcem", hcdj(int ), (int)9);
                            continue block15;
                        }
                        case 1495650370: {
                            v4 = np$Snapshot.hcdf("hcen", hcdj(int ), (int)10);
                            continue block15;
                        }
                    }
                    break;
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{np$Snapshot.class, "health;scoreboard", "health", "scoreboard"}, this);
                case 0: {
                    var2_2 /* !! */  = (int)np$Snapshot.hcdf("hceo", hcdc(int ), (int)20);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: {
                    var2_2 /* !! */  = (int)np$Snapshot.hcdf("hcep", hcdc(int ), (int)21);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)np$Snapshot.hcdf("hceq", hcdc(int ), (int)22);
                        if (!var3_1) ** GOTO lbl-1000
                        throw null;
                    }
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)np$Snapshot.hcdf("hcer", hcdc(int ), (int)23);
        ** while (!var3_1)
lbl59:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hcyp() {
        np$Snapshot.hcdk[0] = 4023087889816541726L;
        np$Snapshot.hcdk[1] = -5041983548463450469L;
        np$Snapshot.hcdk[2] = 5460241716137075020L;
        np$Snapshot.hcdk[3] = -1675518787045935244L;
        np$Snapshot.hcdk[4] = -7542973673532228162L;
        np$Snapshot.hcdk[5] = 4085208222348942001L;
        np$Snapshot.hcdk[6] = -8456194795766940080L;
        np$Snapshot.hcdk[7] = -7754404340130499380L;
        np$Snapshot.hcdk[8] = -7919757446207581109L;
        np$Snapshot.hcdk[9] = -2809208862708466757L;
        np$Snapshot.hcdk[10] = -1018186926835784893L;
        np$Snapshot.hcdk[11] = -2025305566110523472L;
        np$Snapshot.hcdk[12] = -4112864789328065742L;
        np$Snapshot.hcdk[13] = 8343788679256932542L;
        np$Snapshot.hcdk[14] = 1142944615082006472L;
        np$Snapshot.hcdk[15] = 7745352067796865389L;
        np$Snapshot.hcdk[16] = 8213693098813460457L;
        np$Snapshot.hcdk[17] = 8558919849158105441L;
        np$Snapshot.hcdk[18] = 1696923051113575523L;
        np$Snapshot.hcdk[19] = 6685472132098200291L;
        np$Snapshot.hcdk[20] = -9157814758779940671L;
        np$Snapshot.hcdk[21] = 595412401052529753L;
        np$Snapshot.hcdk[22] = -946178035689778876L;
        np$Snapshot.hcdk[23] = 9053873534995646154L;
        np$Snapshot.hcdk[24] = -6281315856217970313L;
        np$Snapshot.hcdk[25] = 598706815208296204L;
        np$Snapshot.hcdk[26] = -2841940068185185787L;
        np$Snapshot.hcdk[27] = 9166638223273492805L;
        np$Snapshot.hcdk[28] = 6865687981164620783L;
        np$Snapshot.hcdk[29] = 7992245134048614904L;
        np$Snapshot.hcdk[30] = -5972079031281993677L;
        np$Snapshot.hcdk[31] = -1329077137138662120L;
        np$Snapshot.hcdk[32] = -5592203730488860572L;
        np$Snapshot.hcdk[33] = 7909707731916085132L;
        np$Snapshot.hcdk[34] = 6023806222476105433L;
        np$Snapshot.hcdk[35] = 7470021957723182914L;
        np$Snapshot.hcdk[36] = -827506404227576161L;
        np$Snapshot.hcdk[37] = 264007359860860012L;
        np$Snapshot.hcdk[38] = -6602278075349542734L;
        np$Snapshot.hcdk[39] = 8577771305121337382L;
        np$Snapshot.hcdk[40] = -7152832907542287820L;
        np$Snapshot.hcdk[41] = 4263074651728740727L;
        np$Snapshot.hcdk[42] = 6149945268261893530L;
        np$Snapshot.hcdk[43] = -3823823368249684187L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private np$Snapshot(float var1_1, boolean var2_2) {
        var4_3 /* !! */  = np$Snapshot.b;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.health = var1_1;
                this.scoreboard = var2_2;
                return;
            }
            case 0: {
                while (true) {
                    var4_3 /* !! */  = (int)np$Snapshot.hcdf("hcdg", hcdc(int ), (int)0);
                }
            }
            case 1: {
                var4_3 /* !! */  = (int)np$Snapshot.hcdf("hcdh", hcdc(int ), (int)1);
            }
            case 2: 
        }
        while (true) {
            var4_3 /* !! */  = (int)np$Snapshot.hcdf("hcdi", hcdc(int ), (int)2);
        }
    }
}

