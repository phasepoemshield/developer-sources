/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

final class pt$Type
extends Enum<pt$Type> {
    public static final boolean c;
    public static final /* enum */ pt$Type ADDED;
    private static long[] eqcx;
    private static long[] eqcw;
    public static final int b;
    private static int[] eqdp;
    private static final /* synthetic */ pt$Type[] $VALUES;
    private final String label;
    protected static final long le = -3586520024806095905L;
    private static int[] eqdq;
    public static final boolean a;
    public static final /* enum */ pt$Type REMOVED;
    public static final /* enum */ pt$Type FIXED;

    private pt$Type(String string2) {
        int n3 = b;
        boolean bl2 = a;
        this.label = string2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ pt$Type[] $values() {
        v0 /* !! */  = pt$Type.le;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - pt$Type.eqcy("eqgh", eqct(int ), (int)20));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2013427988: {
                    v1 = pt$Type.eqcy("eqgi", eqct(int ), (int)21);
                    continue block21;
                }
                case -557892693: {
                    v1 = pt$Type.eqcy("eqgj", eqct(int ), (int)22);
                    continue block21;
                }
                case 630948831: {
                    break block21;
                }
                case 2127146774: {
                    v1 = pt$Type.eqcy("eqgk", eqct(int ), (int)23);
                    continue block21;
                }
            }
            break;
        }
        var2 = pt$Type.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = pt$Type.le - pt$Type.eqcy("eqgl", eqct(int ), (int)24)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == pt$Type.eqcy("eqgq", eqdn(int ), (int)20)) break;
            v2 /* !! */  = (long)pt$Type.eqcy("eqgs", eqdn(int ), (int)21);
        }
        var1_1 = pt$Type.b;
        v3 /* !! */  = pt$Type.le;
        if (true) ** GOTO lbl29
        block23: while (true) {
            v3 /* !! */  = (long)(v4 - pt$Type.eqcy("eqgt", eqct(int ), (int)25));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1684473059: {
                    v4 = pt$Type.eqcy("eqgv", eqct(int ), (int)26);
                    continue block23;
                }
                case -397162454: {
                    v4 = pt$Type.eqcy("eqgw", eqct(int ), (int)27);
                    continue block23;
                }
                case 630948831: {
                    break block23;
                }
            }
            break;
        }
        var0_2 = pt$Type.a;
        if (var2) {
            throw null;
lbl41:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl44:
        // 1 sources

        v5 = new pt$Type[3];
        v6 = pt$Type.eqcy("eqgx", eqdn(int ), (int)22);
        while (true) {
            if ((v7 = (cfr_temp_1 = pt$Type.le - pt$Type.eqcy("eqgy", eqct(int ), (int)28)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v7 == pt$Type.eqcy("eqhb", eqdn(int ), (int)23)) break;
            v7 = -1085409247;
        }
        v5[v6] = pt$Type.ADDED;
        v8 = pt$Type.eqcy("eqhd", eqdn(int ), (int)24);
        v9 /* !! */  = pt$Type.le;
        if (true) ** GOTO lbl58
        block26: while (true) {
            v9 /* !! */  = (long)(v10 - pt$Type.eqcy("eqhf", eqct(int ), (int)29));
lbl58:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case 630948831: {
                    break block26;
                }
                case 1412452043: {
                    v10 = pt$Type.eqcy("eqhg", eqct(int ), (int)30);
                    continue block26;
                }
                case 1764896795: {
                    v10 = pt$Type.eqcy("eqhh", eqct(int ), (int)31);
                    continue block26;
                }
            }
            break;
        }
        v5[v8] = pt$Type.FIXED;
        v11 = pt$Type.eqcy("eqhj", eqdn(int ), (int)25);
        v12 /* !! */  = pt$Type.le;
        if (true) ** GOTO lbl73
        block27: while (true) {
            v12 /* !! */  = (long)(v13 - pt$Type.eqcy("eqhm", eqct(int ), (int)32));
lbl73:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -1002141498: {
                    v13 = pt$Type.eqcy("eqhn", eqct(int ), (int)33);
                    continue block27;
                }
                case 630948831: {
                    break block27;
                }
                case 656066462: {
                    v13 = pt$Type.eqcy("eqho", eqct(int ), (int)34);
                    continue block27;
                }
            }
            break;
        }
        v5[v11] = pt$Type.REMOVED;
        return v5;
    }

    private static /* synthetic */ void eqir() {
        pt$Type.eqcw[0] = -2495492967713433813L;
        pt$Type.eqcw[1] = -8031151910003278360L;
        pt$Type.eqcw[2] = 4411296293360823895L;
        pt$Type.eqcw[3] = -5577203525167762094L;
        pt$Type.eqcw[4] = 641908528070459418L;
        pt$Type.eqcw[5] = -7890324522296138501L;
        pt$Type.eqcw[6] = -3060047833597997996L;
        pt$Type.eqcw[7] = 320844079666978295L;
        pt$Type.eqcw[8] = 123767533617444597L;
        pt$Type.eqcw[9] = 9178872054977762838L;
        pt$Type.eqcw[10] = 9185207922670391879L;
        pt$Type.eqcw[11] = -9189749280194909102L;
        pt$Type.eqcw[12] = -3648144961399948079L;
        pt$Type.eqcw[13] = 46839651908491269L;
        pt$Type.eqcw[14] = -292379293943336715L;
        pt$Type.eqcw[15] = -3032476383877117126L;
        pt$Type.eqcw[16] = -2086050427797494074L;
        pt$Type.eqcw[17] = 8672520173790461604L;
        pt$Type.eqcw[18] = -5131187854980109585L;
        pt$Type.eqcw[19] = 7226431547047241055L;
        pt$Type.eqcw[20] = 9137108045993590122L;
        pt$Type.eqcw[21] = 1562066025996089724L;
        pt$Type.eqcw[22] = -7029932388200945238L;
        pt$Type.eqcw[23] = 7751487114464478200L;
        pt$Type.eqcw[24] = -6659605381070176874L;
        pt$Type.eqcw[25] = 8560114943198910044L;
        pt$Type.eqcw[26] = 6374117355892560926L;
        pt$Type.eqcw[27] = 145744280156388238L;
        pt$Type.eqcw[28] = 3028270889470586270L;
        pt$Type.eqcw[29] = 3127932267569209210L;
        pt$Type.eqcw[30] = -5693720834968149436L;
        pt$Type.eqcw[31] = -5638505282903012803L;
        pt$Type.eqcw[32] = 8531774459602890741L;
        pt$Type.eqcw[33] = 4288331326442750327L;
        pt$Type.eqcw[34] = 1499696330143759900L;
    }

    private static /* synthetic */ void eqil() {
        pt$Type.eqdq[0] = -699432114;
        pt$Type.eqdq[1] = -1317678407;
        pt$Type.eqdq[2] = -931000530;
        pt$Type.eqdq[3] = 1420336328;
        pt$Type.eqdq[4] = 1394704235;
        pt$Type.eqdq[5] = -1905885353;
        pt$Type.eqdq[6] = 877968313;
        pt$Type.eqdq[7] = 18012611;
        pt$Type.eqdq[8] = 1690221327;
        pt$Type.eqdq[9] = -2011598728;
        pt$Type.eqdq[10] = 1814962654;
        pt$Type.eqdq[11] = -427021396;
        pt$Type.eqdq[12] = -71520885;
        pt$Type.eqdq[13] = -1203276634;
        pt$Type.eqdq[14] = 2006474685;
        pt$Type.eqdq[15] = -1946169743;
        pt$Type.eqdq[16] = -1469808467;
        pt$Type.eqdq[17] = -1859056705;
        pt$Type.eqdq[18] = -1133211859;
        pt$Type.eqdq[19] = -1171097994;
        pt$Type.eqdq[20] = -1955248125;
        pt$Type.eqdq[21] = 1315522949;
        pt$Type.eqdq[22] = -124326478;
        pt$Type.eqdq[23] = 979151070;
        pt$Type.eqdq[24] = -1412023756;
        pt$Type.eqdq[25] = -958160037;
        pt$Type.eqdq[26] = 715595383;
        pt$Type.eqdq[27] = 1060227494;
        pt$Type.eqdq[28] = -614277978;
        pt$Type.eqdq[29] = -554488020;
        pt$Type.eqdq[30] = 83731175;
        pt$Type.eqdq[31] = -1985633868;
        pt$Type.eqdq[32] = 568537119;
    }

    private static /* synthetic */ int eqdn(int n2) {
        return eqdp[n2] ^ eqdq[n2];
    }

    static {
        eqdp = new int[33];
        eqdq = new int[33];
        pt$Type.eqid();
        pt$Type.eqil();
        eqcw = new long[35];
        eqcx = new long[35];
        pt$Type.eqir();
        pt$Type.eqis();
        ADDED = new pt$Type("[+]");
        FIXED = new pt$Type("[/]");
        REMOVED = new pt$Type("[-]");
        $VALUES = pt$Type.$values();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static pt$Type valueOf(String var0) {
        v0 /* !! */  = pt$Type.le;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(pt$Type.eqcy("eqen", eqct(int ), (int)13) - pt$Type.eqcy("eqem", eqct(int ), (int)12));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -415798684: {
                    continue block16;
                }
                case 630948831: {
                    break block16;
                }
            }
            break;
        }
        var3_1 = pt$Type.c;
        v1 /* !! */  = pt$Type.le;
        if (true) ** GOTO lbl15
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - pt$Type.eqcy("eqeo", eqct(int ), (int)14));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1768614846: {
                    v2 = pt$Type.eqcy("eqep", eqct(int ), (int)15);
                    continue block17;
                }
                case -460687785: {
                    v2 = pt$Type.eqcy("eqeq", eqct(int ), (int)16);
                    continue block17;
                }
                case 380262112: {
                    v2 = pt$Type.eqcy("eqer", eqct(int ), (int)17);
                    continue block17;
                }
                case 630948831: {
                    break block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = pt$Type.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = pt$Type.le - pt$Type.eqcy("eqey", eqct(int ), (int)18)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == pt$Type.eqcy("eqfa", eqdn(int ), (int)8)) break;
            v3 /* !! */  = (long)pt$Type.eqcy("eqfc", eqdn(int ), (int)9);
        }
        var1_3 = pt$Type.a;
        if (var3_1) {
            throw null;
lbl37:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl40:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = pt$Type.le - pt$Type.eqcy("eqfg", eqct(int ), (int)19)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == pt$Type.eqcy("eqfi", eqdn(int ), (int)10)) break;
                    v4 /* !! */  = (long)pt$Type.eqcy("eqfk", eqdn(int ), (int)11);
                }
                return Enum.valueOf(pt$Type.class, var0);
            }
lbl50:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)pt$Type.eqcy("eqfl", eqdn(int ), (int)12);
                if (!var3_1) break;
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)pt$Type.eqcy("eqfm", eqdn(int ), (int)13);
                    if (!var3_1) ** GOTO lbl50
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)pt$Type.eqcy("eqfr", eqdn(int ), (int)14);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)pt$Type.eqcy("eqfu", eqdn(int ), (int)15);
        ** while (!var3_1)
lbl66:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static pt$Type[] values() {
        v0 /* !! */  = pt$Type.le;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - pt$Type.eqcy("eqda", eqct(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1965030146: {
                    v1 = pt$Type.eqcy("eqdc", eqct(int ), (int)1);
                    continue block22;
                }
                case 630948831: {
                    break block22;
                }
                case 1381208150: {
                    v1 = pt$Type.eqcy("eqdd", eqct(int ), (int)2);
                    continue block22;
                }
                case 1975772859: {
                    v1 = pt$Type.eqcy("eqdg", eqct(int ), (int)3);
                    continue block22;
                }
            }
            break;
        }
        var2 = pt$Type.c;
        v2 /* !! */  = pt$Type.le;
        block23: while (true) {
            switch ((int)v2 /* !! */ ) {
                case 630948831: {
                    break block23;
                }
                case 683658900: {
                    v2 /* !! */  = (long)(pt$Type.eqcy("eqdk", eqct(int ), (int)5) - pt$Type.eqcy("eqdi", eqct(int ), (int)4));
                    continue block23;
                }
            }
            break;
        }
        var1_1 /* !! */  = pt$Type.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = pt$Type.le - pt$Type.eqcy("eqdm", eqct(int ), (int)6)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == pt$Type.eqcy("eqds", eqdn(int ), (int)0)) {
                var0_2 = pt$Type.a;
                if (var2) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)pt$Type.eqcy("eqdt", eqdn(int ), (int)1);
        }
        if (var0_2 != false) return null;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2 != false) return null;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = pt$Type.le - pt$Type.eqcy("eqdw", eqct(int ), (int)7)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  != pt$Type.eqcy("eqdy", eqdn(int ), (int)2)) ** GOTO lbl48
                    v5 /* !! */  = pt$Type.le;
                    if (true) ** GOTO lbl71
lbl48:
                    // 1 sources

                    v4 /* !! */  = (long)pt$Type.eqcy("eqdz", eqdn(int ), (int)3);
                }
            }
            case 0: {
                ** GOTO lbl61
            }
            case 2: {
                var1_1 /* !! */  = (int)pt$Type.eqcy("eqek", eqdn(int ), (int)6);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl-1000
            }
            case 3: lbl-1000:
            // 2 sources

            {
                var1_1 /* !! */  = (int)pt$Type.eqcy("eqel", eqdn(int ), (int)7);
                if (var2) {
                    throw null;
                }
lbl61:
                // 3 sources

                var1_1 /* !! */  = (int)pt$Type.eqcy("eqei", eqdn(int ), (int)4);
                if (var2) {
                    throw null;
                }
            }
            case 1: 
        }
        do {
            var1_1 /* !! */  = (int)pt$Type.eqcy("eqej", eqdn(int ), (int)5);
        } while (!var2);
        throw null;
        block27: while (true) {
            v5 /* !! */  = (long)(v6 - pt$Type.eqcy("eqeb", eqct(int ), (int)8));
lbl71:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1598643691: {
                    v6 = pt$Type.eqcy("eqec", eqct(int ), (int)9);
                    continue block27;
                }
                case 630948831: {
                    return (pt$Type[])pt$Type.$VALUES.clone();
                }
                case 924947754: {
                    v6 = pt$Type.eqcy("eqeg", eqct(int ), (int)10);
                    continue block27;
                }
                case 1636418624: {
                    v6 = pt$Type.eqcy("eqeh", eqct(int ), (int)11);
                    continue block27;
                }
            }
            break;
        }
        return (pt$Type[])pt$Type.$VALUES.clone();
    }

    public static /* synthetic */ CallSite eqcy(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void eqid() {
        pt$Type.eqdp[0] = 699432113;
        pt$Type.eqdp[1] = -368119806;
        pt$Type.eqdp[2] = -931000529;
        pt$Type.eqdp[3] = -737335744;
        pt$Type.eqdp[4] = 1394704232;
        pt$Type.eqdp[5] = -1905885353;
        pt$Type.eqdp[6] = 877968313;
        pt$Type.eqdp[7] = 18012610;
        pt$Type.eqdp[8] = -1690221328;
        pt$Type.eqdp[9] = -412635836;
        pt$Type.eqdp[10] = -1814962655;
        pt$Type.eqdp[11] = -138394646;
        pt$Type.eqdp[12] = -71520887;
        pt$Type.eqdp[13] = -1203276636;
        pt$Type.eqdp[14] = 2006474686;
        pt$Type.eqdp[15] = -1946169742;
        pt$Type.eqdp[16] = -1469808467;
        pt$Type.eqdp[17] = -1859056705;
        pt$Type.eqdp[18] = -1133211858;
        pt$Type.eqdp[19] = -1171097995;
        pt$Type.eqdp[20] = 1955248124;
        pt$Type.eqdp[21] = -1046813417;
        pt$Type.eqdp[22] = -124326478;
        pt$Type.eqdp[23] = -979151071;
        pt$Type.eqdp[24] = -1412023755;
        pt$Type.eqdp[25] = -958160039;
        pt$Type.eqdp[26] = 715595381;
        pt$Type.eqdp[27] = 1060227493;
        pt$Type.eqdp[28] = -614277980;
        pt$Type.eqdp[29] = -554488020;
        pt$Type.eqdp[30] = 83731175;
        pt$Type.eqdp[31] = -1985633867;
        pt$Type.eqdp[32] = 568537117;
    }

    private static /* synthetic */ long eqct(int n2) {
        return eqcw[n2] ^ eqcx[n2];
    }

    private static /* synthetic */ void eqis() {
        pt$Type.eqcx[0] = 741265670281545447L;
        pt$Type.eqcx[1] = 6915907781127058537L;
        pt$Type.eqcx[2] = 6419641726663206315L;
        pt$Type.eqcx[3] = -4059808760191285596L;
        pt$Type.eqcx[4] = 3871997710707862979L;
        pt$Type.eqcx[5] = 5899930985046631829L;
        pt$Type.eqcx[6] = -3777011333357525534L;
        pt$Type.eqcx[7] = -6640087136763805171L;
        pt$Type.eqcx[8] = 4295108183307665024L;
        pt$Type.eqcx[9] = 6624878548515327802L;
        pt$Type.eqcx[10] = 7857039421529752786L;
        pt$Type.eqcx[11] = 413349157630154252L;
        pt$Type.eqcx[12] = -8081485838810775867L;
        pt$Type.eqcx[13] = -7865647111856580688L;
        pt$Type.eqcx[14] = -9172703801763637735L;
        pt$Type.eqcx[15] = -3897903867046806922L;
        pt$Type.eqcx[16] = -5786465888312291141L;
        pt$Type.eqcx[17] = -5280834087926073655L;
        pt$Type.eqcx[18] = -2448063458203080992L;
        pt$Type.eqcx[19] = 5062664740809970735L;
        pt$Type.eqcx[20] = -2887929238158517810L;
        pt$Type.eqcx[21] = -3139252148723931376L;
        pt$Type.eqcx[22] = -5561945378469141588L;
        pt$Type.eqcx[23] = 2804262856023937924L;
        pt$Type.eqcx[24] = -6041322865105891175L;
        pt$Type.eqcx[25] = -8222434002799115682L;
        pt$Type.eqcx[26] = -1390617007757983749L;
        pt$Type.eqcx[27] = 5701895616484625330L;
        pt$Type.eqcx[28] = 4101668774112161056L;
        pt$Type.eqcx[29] = 5657451596327608650L;
        pt$Type.eqcx[30] = 5599133922909440836L;
        pt$Type.eqcx[31] = -1697590661837160812L;
        pt$Type.eqcx[32] = -5555980014991242622L;
        pt$Type.eqcx[33] = -5068979190765636003L;
        pt$Type.eqcx[34] = 8232368702029973008L;
    }
}

