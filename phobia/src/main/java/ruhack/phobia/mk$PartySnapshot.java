/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.runtime.ObjectMethods
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.function.Predicate;

public record mk$PartySnapshot(String owner, List<String> members) {
    private final String owner;
    public static final boolean a;
    private static int[] ht;
    public static final boolean c;
    private static long[] il;
    private static final mk$PartySnapshot EMPTY;
    private static int[] hu;
    private final List<String> members;
    public static final int b;
    private static long[] ij;
    private static final long g = -2512638311655402021L;

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public mk$PartySnapshot(String var1_1, List<String> var2_2) {
        block13: {
            var4_3 /* !! */  = mk$PartySnapshot.b;
            super();
            var1_1 = var1_1 == null ? "" : var1_1;
            var2_2 = List.copyOf(var2_2);
            if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            do {
                switch (cfr_temp_0 == -2147483648 ? var4_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        this.owner = var1_1;
                        this.members = var2_2;
                        return;
                    }
                    case 0: {
                        var4_3 /* !! */  = (int)mk$PartySnapshot.hv("hx", fv(int ), (int)0);
                        break block13;
                    }
                    case 1: {
                        while (true) {
                            var4_3 /* !! */  = (int)mk$PartySnapshot.hv("hy", fv(int ), (int)1);
                        }
                    }
                    case 3: {
                        ** break;
                    }
                    case 5: {
                        var4_3 /* !! */  = (int)mk$PartySnapshot.hv("ie", fv(int ), (int)5);
                    }
                    case 2: {
                        var4_3 /* !! */  = (int)mk$PartySnapshot.hv("hz", fv(int ), (int)2);
                        break block13;
                    }
                    case 6: {
                        var4_3 /* !! */  = (int)mk$PartySnapshot.hv("if", fv(int ), (int)6);
                        break block13;
                    }
                    case 7: {
                        break block13;
                    }
lbl33:
                    // 2 sources

                    while (true) {
                        cfr_temp_0 = 4;
                        var4_3 /* !! */  = (int)mk$PartySnapshot.hv("ib", fv(int ), (int)3);
                        break;
                    }
                    case 4: 
                }
                break;
            } while (true);
            var4_3 /* !! */  = (int)mk$PartySnapshot.hv("id", fv(int ), (int)4);
        }
        var4_3 /* !! */  = (int)mk$PartySnapshot.hv("ig", fv(int ), (int)7);
        ** while (true)
    }

    static {
        ht = new int[83];
        hu = new int[83];
        mk$PartySnapshot.yd();
        mk$PartySnapshot.ye();
        ij = new long[59];
        il = new long[59];
        mk$PartySnapshot.yf();
        mk$PartySnapshot.yg();
        EMPTY = new mk$PartySnapshot("", List.of());
    }

    private static /* synthetic */ void ye() {
        mk$PartySnapshot.hu[0] = 37783540;
        mk$PartySnapshot.hu[1] = 867429252;
        mk$PartySnapshot.hu[2] = 1981196482;
        mk$PartySnapshot.hu[3] = -1722245063;
        mk$PartySnapshot.hu[4] = 1219206513;
        mk$PartySnapshot.hu[5] = 1556361616;
        mk$PartySnapshot.hu[6] = -1281466399;
        mk$PartySnapshot.hu[7] = 1590251302;
        mk$PartySnapshot.hu[8] = 971512794;
        mk$PartySnapshot.hu[9] = 1664652170;
        mk$PartySnapshot.hu[10] = 817280511;
        mk$PartySnapshot.hu[11] = -1619672340;
        mk$PartySnapshot.hu[12] = 302665647;
        mk$PartySnapshot.hu[13] = -1208748823;
        mk$PartySnapshot.hu[14] = 1484008656;
        mk$PartySnapshot.hu[15] = -909153642;
        mk$PartySnapshot.hu[16] = -1002867501;
        mk$PartySnapshot.hu[17] = 170693227;
        mk$PartySnapshot.hu[18] = 1537242639;
        mk$PartySnapshot.hu[19] = 306769551;
        mk$PartySnapshot.hu[20] = 1235086249;
        mk$PartySnapshot.hu[21] = -1705866832;
        mk$PartySnapshot.hu[22] = 1517764538;
        mk$PartySnapshot.hu[23] = -346304290;
        mk$PartySnapshot.hu[24] = 1978098956;
        mk$PartySnapshot.hu[25] = 991916790;
        mk$PartySnapshot.hu[26] = -2028172585;
        mk$PartySnapshot.hu[27] = -2145200627;
        mk$PartySnapshot.hu[28] = -1699386344;
        mk$PartySnapshot.hu[29] = -334772048;
        mk$PartySnapshot.hu[30] = -1716020940;
        mk$PartySnapshot.hu[31] = 182106647;
        mk$PartySnapshot.hu[32] = -457014614;
        mk$PartySnapshot.hu[33] = 647258489;
        mk$PartySnapshot.hu[34] = 1165441172;
        mk$PartySnapshot.hu[35] = -1724071903;
        mk$PartySnapshot.hu[36] = -1116237440;
        mk$PartySnapshot.hu[37] = -530356059;
        mk$PartySnapshot.hu[38] = 2015443345;
        mk$PartySnapshot.hu[39] = -392153791;
        mk$PartySnapshot.hu[40] = 1380529867;
        mk$PartySnapshot.hu[41] = -22795811;
        mk$PartySnapshot.hu[42] = 493296262;
        mk$PartySnapshot.hu[43] = -1937622947;
        mk$PartySnapshot.hu[44] = -701540559;
        mk$PartySnapshot.hu[45] = -1405271151;
        mk$PartySnapshot.hu[46] = -1173925619;
        mk$PartySnapshot.hu[47] = -958159339;
        mk$PartySnapshot.hu[48] = 466878190;
        mk$PartySnapshot.hu[49] = 943103259;
        mk$PartySnapshot.hu[50] = -933685184;
        mk$PartySnapshot.hu[51] = -702961350;
        mk$PartySnapshot.hu[52] = -1849935252;
        mk$PartySnapshot.hu[53] = 87812751;
        mk$PartySnapshot.hu[54] = -1945728170;
        mk$PartySnapshot.hu[55] = 115286962;
        mk$PartySnapshot.hu[56] = 2146268596;
        mk$PartySnapshot.hu[57] = -1481259946;
        mk$PartySnapshot.hu[58] = 513643656;
        mk$PartySnapshot.hu[59] = -1798711510;
        mk$PartySnapshot.hu[60] = 46253685;
        mk$PartySnapshot.hu[61] = 1157078776;
        mk$PartySnapshot.hu[62] = -239155493;
        mk$PartySnapshot.hu[63] = -1447017658;
        mk$PartySnapshot.hu[64] = -249354541;
        mk$PartySnapshot.hu[65] = 1619703197;
        mk$PartySnapshot.hu[66] = 612173016;
        mk$PartySnapshot.hu[67] = -1579115686;
        mk$PartySnapshot.hu[68] = 832395970;
        mk$PartySnapshot.hu[69] = 853533264;
        mk$PartySnapshot.hu[70] = 1215268146;
        mk$PartySnapshot.hu[71] = 453270075;
        mk$PartySnapshot.hu[72] = 1945820940;
        mk$PartySnapshot.hu[73] = -819963488;
        mk$PartySnapshot.hu[74] = -2037523472;
        mk$PartySnapshot.hu[75] = -859882091;
        mk$PartySnapshot.hu[76] = -1815537248;
        mk$PartySnapshot.hu[77] = -713693709;
        mk$PartySnapshot.hu[78] = 1543107356;
        mk$PartySnapshot.hu[79] = 588748326;
        mk$PartySnapshot.hu[80] = 1580866209;
        mk$PartySnapshot.hu[81] = 1305164056;
        mk$PartySnapshot.hu[82] = -778984416;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public List<String> members() {
        v0 /* !! */  = mk$PartySnapshot.g;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - mk$PartySnapshot.hv("wu", ii(int ), (int)43));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1755200503: {
                    v1 = mk$PartySnapshot.hv("wv", ii(int ), (int)44);
                    continue block23;
                }
                case -1598155301: {
                    break block23;
                }
                case -796361556: {
                    v1 = mk$PartySnapshot.hv("ww", ii(int ), (int)45);
                    continue block23;
                }
            }
            break;
        }
        var3_1 = mk$PartySnapshot.c;
        v2 /* !! */  = mk$PartySnapshot.g;
        if (true) ** GOTO lbl19
        block24: while (true) {
            v2 /* !! */  = (long)(v3 - mk$PartySnapshot.hv("wx", ii(int ), (int)46));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1598155301: {
                    break block24;
                }
                case -1510574265: {
                    v3 = mk$PartySnapshot.hv("wy", ii(int ), (int)47);
                    continue block24;
                }
                case -472026852: {
                    v3 = mk$PartySnapshot.hv("wz", ii(int ), (int)48);
                    continue block24;
                }
                case 1285057983: {
                    v3 = mk$PartySnapshot.hv("xa", ii(int ), (int)49);
                    continue block24;
                }
            }
            break;
        }
        var2_2 /* !! */  = mk$PartySnapshot.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = mk$PartySnapshot.g - mk$PartySnapshot.hv("xb", ii(int ), (int)50)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == mk$PartySnapshot.hv("xc", fv(int ), (int)64)) break;
                    v4 /* !! */  = (long)mk$PartySnapshot.hv("xd", fv(int ), (int)65);
                }
                var1_3 = mk$PartySnapshot.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v5 /* !! */  = mk$PartySnapshot.g;
                if (true) ** GOTO lbl51
                block27: while (true) {
                    v5 /* !! */  = (long)(v6 - mk$PartySnapshot.hv("xe", ii(int ), (int)51));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1598155301: {
                            break block27;
                        }
                        case -315199400: {
                            v6 = mk$PartySnapshot.hv("xf", ii(int ), (int)52);
                            continue block27;
                        }
                        case -270584083: {
                            v6 = mk$PartySnapshot.hv("xg", ii(int ), (int)53);
                            continue block27;
                        }
                        case 2063555461: {
                            v6 = mk$PartySnapshot.hv("xh", ii(int ), (int)54);
                            continue block27;
                        }
                    }
                    break;
                }
                return this.members;
            }
lbl64:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)mk$PartySnapshot.hv("xi", fv(int ), (int)66);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)mk$PartySnapshot.hv("xj", fv(int ), (int)67);
                if (!var3_1) ** GOTO lbl64
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)mk$PartySnapshot.hv("xk", fv(int ), (int)68);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mk$PartySnapshot.hv("xl", fv(int ), (int)69);
        ** while (!var3_1)
lbl80:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mk$PartySnapshot.g - mk$PartySnapshot.hv("ri", ii(int ), (int)19)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mk$PartySnapshot.hv("rj", fv(int ), (int)38)) break;
            v0 /* !! */  = (long)mk$PartySnapshot.hv("rm", fv(int ), (int)39);
        }
        var3_1 = mk$PartySnapshot.c;
        v1 /* !! */  = mk$PartySnapshot.g;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - mk$PartySnapshot.hv("rn", ii(int ), (int)20));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1891661045: {
                    v2 = mk$PartySnapshot.hv("ro", ii(int ), (int)21);
                    continue block17;
                }
                case -1598155301: {
                    break block17;
                }
                case 254070151: {
                    v2 = mk$PartySnapshot.hv("rp", ii(int ), (int)22);
                    continue block17;
                }
                case 1021085318: {
                    v2 = mk$PartySnapshot.hv("rq", ii(int ), (int)23);
                    continue block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = mk$PartySnapshot.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = mk$PartySnapshot.g - mk$PartySnapshot.hv("rt", ii(int ), (int)24)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == mk$PartySnapshot.hv("ru", fv(int ), (int)40)) break;
            v3 /* !! */  = (long)mk$PartySnapshot.hv("rw", fv(int ), (int)41);
        }
        var1_3 = mk$PartySnapshot.a;
        if (!var3_1) ** GOTO lbl38
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (int)mk$PartySnapshot.hv("rx", fv(int ), (int)42);
                }
lbl38:
                // 1 sources

                if (var1_3 || var1_3) continue block19;
                v4 /* !! */  = mk$PartySnapshot.g;
                if (true) ** GOTO lbl43
                block20: while (true) {
                    v4 /* !! */  = (long)(mk$PartySnapshot.hv("sb", ii(int ), (int)26) - mk$PartySnapshot.hv("rz", ii(int ), (int)25));
lbl43:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1598155301: {
                            break block20;
                        }
                        case 1141372941: {
                            continue block20;
                        }
                    }
                    break;
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{mk$PartySnapshot.class, "owner;members", "owner", "members"}, this);
                case 0: {
                    var2_2 /* !! */  = (int)mk$PartySnapshot.hv("sc", fv(int ), (int)43);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl58
                }
                case 1: {
                    var2_2 /* !! */  = (int)mk$PartySnapshot.hv("se", fv(int ), (int)44);
                    if (var3_1) {
                        throw null;
                    }
                }
lbl58:
                // 4 sources

                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)mk$PartySnapshot.hv("sf", fv(int ), (int)45);
                        if (!var3_1) ** GOTO lbl-1000
                        throw null;
                    }
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)mk$PartySnapshot.hv("up", fv(int ), (int)46);
        ** while (!var3_1)
lbl66:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void yd() {
        mk$PartySnapshot.ht[0] = 37783539;
        mk$PartySnapshot.ht[1] = 867429254;
        mk$PartySnapshot.ht[2] = 1981196487;
        mk$PartySnapshot.ht[3] = -1722245063;
        mk$PartySnapshot.ht[4] = 1219206512;
        mk$PartySnapshot.ht[5] = 1556361622;
        mk$PartySnapshot.ht[6] = -1281466398;
        mk$PartySnapshot.ht[7] = 1590251298;
        mk$PartySnapshot.ht[8] = 971512795;
        mk$PartySnapshot.ht[9] = -1911233551;
        mk$PartySnapshot.ht[10] = 817280510;
        mk$PartySnapshot.ht[11] = 487149298;
        mk$PartySnapshot.ht[12] = 302665646;
        mk$PartySnapshot.ht[13] = -1208748824;
        mk$PartySnapshot.ht[14] = -1275691070;
        mk$PartySnapshot.ht[15] = 909153641;
        mk$PartySnapshot.ht[16] = -994455901;
        mk$PartySnapshot.ht[17] = 170693226;
        mk$PartySnapshot.ht[18] = 1537242639;
        mk$PartySnapshot.ht[19] = 306769547;
        mk$PartySnapshot.ht[20] = 1235086251;
        mk$PartySnapshot.ht[21] = -1705866832;
        mk$PartySnapshot.ht[22] = 1517764542;
        mk$PartySnapshot.ht[23] = -346304291;
        mk$PartySnapshot.ht[24] = 1978098953;
        mk$PartySnapshot.ht[25] = 991916784;
        mk$PartySnapshot.ht[26] = -2028172591;
        mk$PartySnapshot.ht[27] = -2145200631;
        mk$PartySnapshot.ht[28] = 1699386343;
        mk$PartySnapshot.ht[29] = -440503729;
        mk$PartySnapshot.ht[30] = -1716020939;
        mk$PartySnapshot.ht[31] = 1718203209;
        mk$PartySnapshot.ht[32] = 457014613;
        mk$PartySnapshot.ht[33] = 841806972;
        mk$PartySnapshot.ht[34] = 1165441175;
        mk$PartySnapshot.ht[35] = -1724071903;
        mk$PartySnapshot.ht[36] = -1116237440;
        mk$PartySnapshot.ht[37] = -530356059;
        mk$PartySnapshot.ht[38] = 2015443344;
        mk$PartySnapshot.ht[39] = -1115868424;
        mk$PartySnapshot.ht[40] = 1380529866;
        mk$PartySnapshot.ht[41] = 332338444;
        mk$PartySnapshot.ht[42] = 1285751880;
        mk$PartySnapshot.ht[43] = -1937622946;
        mk$PartySnapshot.ht[44] = -701540560;
        mk$PartySnapshot.ht[45] = -1405271149;
        mk$PartySnapshot.ht[46] = -1173925618;
        mk$PartySnapshot.ht[47] = 958159338;
        mk$PartySnapshot.ht[48] = -648077536;
        mk$PartySnapshot.ht[49] = 943103258;
        mk$PartySnapshot.ht[50] = -933685182;
        mk$PartySnapshot.ht[51] = -702961349;
        mk$PartySnapshot.ht[52] = -1849935249;
        mk$PartySnapshot.ht[53] = 87812751;
        mk$PartySnapshot.ht[54] = 1945728169;
        mk$PartySnapshot.ht[55] = 1986142874;
        mk$PartySnapshot.ht[56] = 2146268597;
        mk$PartySnapshot.ht[57] = 2086650083;
        mk$PartySnapshot.ht[58] = 513643657;
        mk$PartySnapshot.ht[59] = -93790275;
        mk$PartySnapshot.ht[60] = 46253684;
        mk$PartySnapshot.ht[61] = 1157078777;
        mk$PartySnapshot.ht[62] = -239155496;
        mk$PartySnapshot.ht[63] = -1447017660;
        mk$PartySnapshot.ht[64] = 249354540;
        mk$PartySnapshot.ht[65] = -625251289;
        mk$PartySnapshot.ht[66] = 612173017;
        mk$PartySnapshot.ht[67] = -1579115687;
        mk$PartySnapshot.ht[68] = 832395970;
        mk$PartySnapshot.ht[69] = 853533267;
        mk$PartySnapshot.ht[70] = -1215268147;
        mk$PartySnapshot.ht[71] = -562661711;
        mk$PartySnapshot.ht[72] = -1945820941;
        mk$PartySnapshot.ht[73] = -1209184232;
        mk$PartySnapshot.ht[74] = 2037523471;
        mk$PartySnapshot.ht[75] = -751871529;
        mk$PartySnapshot.ht[76] = -1815537247;
        mk$PartySnapshot.ht[77] = 713693708;
        mk$PartySnapshot.ht[78] = 1054600987;
        mk$PartySnapshot.ht[79] = 588748324;
        mk$PartySnapshot.ht[80] = 1580866211;
        mk$PartySnapshot.ht[81] = 1305164057;
        mk$PartySnapshot.ht[82] = -778984416;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$contains$0(String var0, String var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mk$PartySnapshot.g - mk$PartySnapshot.hv("xm", ii(int ), (int)55)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mk$PartySnapshot.hv("xn", fv(int ), (int)70)) break;
            v0 /* !! */  = (long)mk$PartySnapshot.hv("xo", fv(int ), (int)71);
        }
        var4_2 = mk$PartySnapshot.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = mk$PartySnapshot.g - mk$PartySnapshot.hv("xp", ii(int ), (int)56)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mk$PartySnapshot.hv("xq", fv(int ), (int)72)) break;
            v1 /* !! */  = (long)mk$PartySnapshot.hv("xr", fv(int ), (int)73);
        }
        var3_3 /* !! */  = mk$PartySnapshot.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = mk$PartySnapshot.g - mk$PartySnapshot.hv("xs", ii(int ), (int)57)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mk$PartySnapshot.hv("xt", fv(int ), (int)74)) break;
            v2 /* !! */  = (long)mk$PartySnapshot.hv("xu", fv(int ), (int)75);
        }
        var2_4 = mk$PartySnapshot.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
                    return (boolean)mk$PartySnapshot.hv("xv", fv(int ), (int)76);
                }
                if (var2_4 || var2_4) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = mk$PartySnapshot.g - mk$PartySnapshot.hv("xw", ii(int ), (int)58)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == mk$PartySnapshot.hv("xx", fv(int ), (int)77)) break;
                    v3 /* !! */  = (long)mk$PartySnapshot.hv("xy", fv(int ), (int)78);
                }
                return var1_1.equalsIgnoreCase(var0);
            }
            case 0: {
                do {
                    var3_3 /* !! */  = (int)mk$PartySnapshot.hv("xz", fv(int ), (int)79);
                } while (!var4_2);
                throw null;
            }
lbl42:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)mk$PartySnapshot.hv("ya", fv(int ), (int)80);
                if (var4_2) {
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)mk$PartySnapshot.hv("yb", fv(int ), (int)81);
                if (!var4_2) ** GOTO lbl42
                throw null;
            }
            case 3: 
        }
        do {
            var3_3 /* !! */  = (int)mk$PartySnapshot.hv("yc", fv(int ), (int)82);
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mk$PartySnapshot.g - mk$PartySnapshot.hv("ut", ii(int ), (int)27)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mk$PartySnapshot.hv("uu", fv(int ), (int)47)) break;
            v0 /* !! */  = (long)mk$PartySnapshot.hv("uv", fv(int ), (int)48);
        }
        var4_2 = mk$PartySnapshot.c;
        v1 /* !! */  = mk$PartySnapshot.g;
        if (true) ** GOTO lbl12
        block15: while (true) {
            v1 /* !! */  = (long)(v2 - mk$PartySnapshot.hv("ux", ii(int ), (int)28));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1598155301: {
                    break block15;
                }
                case 666729835: {
                    v2 = mk$PartySnapshot.hv("uz", ii(int ), (int)29);
                    continue block15;
                }
                case 764657533: {
                    v2 = mk$PartySnapshot.hv("va", ii(int ), (int)30);
                    continue block15;
                }
            }
            break;
        }
        var3_3 = mk$PartySnapshot.b;
        v3 /* !! */  = mk$PartySnapshot.g;
        if (true) ** GOTO lbl26
        block16: while (true) {
            v3 /* !! */  = (long)(v4 - mk$PartySnapshot.hv("vb", ii(int ), (int)31));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1740258686: {
                    v4 = mk$PartySnapshot.hv("vc", ii(int ), (int)32);
                    continue block16;
                }
                case -1598155301: {
                    break block16;
                }
                case 614635097: {
                    v4 = mk$PartySnapshot.hv("vd", ii(int ), (int)33);
                    continue block16;
                }
            }
            break;
        }
        var2_4 = mk$PartySnapshot.a;
        if (var4_2) {
            throw null;
lbl38:
            // 1 sources

            return (boolean)mk$PartySnapshot.hv("vf", fv(int ), (int)49);
        }
        ** while (var2_4 || var2_4)
lbl41:
        // 1 sources

        v5 /* !! */  = mk$PartySnapshot.g;
        if (true) ** GOTO lbl45
        block18: while (true) {
            v5 /* !! */  = (long)(mk$PartySnapshot.hv("vj", ii(int ), (int)35) - mk$PartySnapshot.hv("vh", ii(int ), (int)34));
lbl45:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1598155301: {
                    break block18;
                }
                case 1147260965: {
                    continue block18;
                }
            }
            break;
        }
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{mk$PartySnapshot.class, "owner;members", "owner", "members"}, this, var1_1);
    }

    public static /* synthetic */ CallSite hv(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void yg() {
        mk$PartySnapshot.il[0] = 3561884418904335579L;
        mk$PartySnapshot.il[1] = -700438302473230874L;
        mk$PartySnapshot.il[2] = -5410529290224201294L;
        mk$PartySnapshot.il[3] = -2603531968515401344L;
        mk$PartySnapshot.il[4] = -7840384781189256220L;
        mk$PartySnapshot.il[5] = 4691438183971854573L;
        mk$PartySnapshot.il[6] = -9037114397847076545L;
        mk$PartySnapshot.il[7] = -8504187688960225195L;
        mk$PartySnapshot.il[8] = -5183508616730460854L;
        mk$PartySnapshot.il[9] = -8565577328878672775L;
        mk$PartySnapshot.il[10] = -6498732408810955500L;
        mk$PartySnapshot.il[11] = 6451817933727601581L;
        mk$PartySnapshot.il[12] = -5795157134983102377L;
        mk$PartySnapshot.il[13] = -2152980089457226353L;
        mk$PartySnapshot.il[14] = -1969086087856258488L;
        mk$PartySnapshot.il[15] = 1700351895437416068L;
        mk$PartySnapshot.il[16] = -5932097748701287362L;
        mk$PartySnapshot.il[17] = 5934455659443079635L;
        mk$PartySnapshot.il[18] = -1468415118519526685L;
        mk$PartySnapshot.il[19] = -4419419894487745146L;
        mk$PartySnapshot.il[20] = -7683979923411293081L;
        mk$PartySnapshot.il[21] = -4356396076492178425L;
        mk$PartySnapshot.il[22] = 1362097013099949059L;
        mk$PartySnapshot.il[23] = 7405192750949975363L;
        mk$PartySnapshot.il[24] = 1647690034663026151L;
        mk$PartySnapshot.il[25] = -4785597338424564686L;
        mk$PartySnapshot.il[26] = -4697715560284374701L;
        mk$PartySnapshot.il[27] = 6435052971175779136L;
        mk$PartySnapshot.il[28] = -7588795269529195657L;
        mk$PartySnapshot.il[29] = 3970400882778306001L;
        mk$PartySnapshot.il[30] = 4256731825797366628L;
        mk$PartySnapshot.il[31] = -6492395302350328533L;
        mk$PartySnapshot.il[32] = 9082894652051548447L;
        mk$PartySnapshot.il[33] = -3096729639035335876L;
        mk$PartySnapshot.il[34] = -7971788484778318632L;
        mk$PartySnapshot.il[35] = 4553770892673064122L;
        mk$PartySnapshot.il[36] = 2931191030607460134L;
        mk$PartySnapshot.il[37] = -3115134135227732911L;
        mk$PartySnapshot.il[38] = -2682280789200638284L;
        mk$PartySnapshot.il[39] = -5555103129835125616L;
        mk$PartySnapshot.il[40] = 8437330189109344001L;
        mk$PartySnapshot.il[41] = 2923956500359227570L;
        mk$PartySnapshot.il[42] = 4246294010597066420L;
        mk$PartySnapshot.il[43] = -4199977906936787693L;
        mk$PartySnapshot.il[44] = 6927689316232959049L;
        mk$PartySnapshot.il[45] = 7408029259119778701L;
        mk$PartySnapshot.il[46] = 4309740211777027713L;
        mk$PartySnapshot.il[47] = 3980208073673106189L;
        mk$PartySnapshot.il[48] = -907512466018280250L;
        mk$PartySnapshot.il[49] = 3316017489118030298L;
        mk$PartySnapshot.il[50] = 4963415758194787118L;
        mk$PartySnapshot.il[51] = -1761688057051598742L;
        mk$PartySnapshot.il[52] = -356328162987182742L;
        mk$PartySnapshot.il[53] = -186032924356431504L;
        mk$PartySnapshot.il[54] = 4747105870713948160L;
        mk$PartySnapshot.il[55] = -413989176629084274L;
        mk$PartySnapshot.il[56] = 4638160818191449630L;
        mk$PartySnapshot.il[57] = -3090883228458411408L;
        mk$PartySnapshot.il[58] = 5846646624895273493L;
    }

    private static /* synthetic */ int fv(int n2) {
        return ht[n2] ^ hu[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String owner() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mk$PartySnapshot.g - mk$PartySnapshot.hv("vt", ii(int ), (int)36)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mk$PartySnapshot.hv("vu", fv(int ), (int)54)) break;
            v0 /* !! */  = (long)mk$PartySnapshot.hv("vw", fv(int ), (int)55);
        }
        var3_1 = mk$PartySnapshot.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = mk$PartySnapshot.g - mk$PartySnapshot.hv("vy", ii(int ), (int)37)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mk$PartySnapshot.hv("vz", fv(int ), (int)56)) break;
            v1 /* !! */  = (long)mk$PartySnapshot.hv("wb", fv(int ), (int)57);
        }
        var2_2 /* !! */  = mk$PartySnapshot.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = mk$PartySnapshot.g - mk$PartySnapshot.hv("we", ii(int ), (int)38)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == mk$PartySnapshot.hv("wg", fv(int ), (int)58)) break;
                    v2 /* !! */  = (long)mk$PartySnapshot.hv("wh", fv(int ), (int)59);
                }
                var1_3 = mk$PartySnapshot.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = mk$PartySnapshot.g;
                if (true) ** GOTO lbl34
                block16: while (true) {
                    v3 /* !! */  = (long)(v4 - mk$PartySnapshot.hv("wj", ii(int ), (int)39));
lbl34:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1598155301: {
                            break block16;
                        }
                        case -961927516: {
                            v4 = mk$PartySnapshot.hv("wl", ii(int ), (int)40);
                            continue block16;
                        }
                        case 299841806: {
                            v4 = mk$PartySnapshot.hv("wn", ii(int ), (int)41);
                            continue block16;
                        }
                        case 1455603622: {
                            v4 = mk$PartySnapshot.hv("wp", ii(int ), (int)42);
                            continue block16;
                        }
                    }
                    break;
                }
                return this.owner;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)mk$PartySnapshot.hv("wq", fv(int ), (int)60);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)mk$PartySnapshot.hv("wr", fv(int ), (int)61);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)mk$PartySnapshot.hv("ws", fv(int ), (int)62);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)mk$PartySnapshot.hv("wt", fv(int ), (int)63);
        } while (!var3_1);
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final String toString() {
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = g - mk$PartySnapshot.hv("pr", ii(int ), (int)14)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == mk$PartySnapshot.hv("ps", fv(int ), (int)28)) break;
            object = mk$PartySnapshot.hv("pt", fv(int ), (int)29);
        }
        boolean bl2 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = g - mk$PartySnapshot.hv("pv", ii(int ), (int)15)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == mk$PartySnapshot.hv("py", fv(int ), (int)30)) break;
            object = mk$PartySnapshot.hv("pz", fv(int ), (int)31);
        }
        int n2 = b;
        Object object = g;
        block6: while (true) {
            switch ((int)object) {
                case -1598155301: {
                    break block6;
                }
                case -397177345: {
                    object = mk$PartySnapshot.hv("qe", ii(int ), (int)17) - mk$PartySnapshot.hv("qb", ii(int ), (int)16);
                    continue block6;
                }
            }
            break;
        }
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3) return null;
        if (bl3) return null;
        while (true) {
            long l4;
            Object object2;
            if ((object2 = (l4 = g - mk$PartySnapshot.hv("qk", ii(int ), (int)18)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object2 == mk$PartySnapshot.hv("qm", fv(int ), (int)32)) {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{mk$PartySnapshot.class, "owner;members", "owner", "members"}, this);
            }
            object2 = mk$PartySnapshot.hv("qp", fv(int ), (int)33);
        }
    }

    private static /* synthetic */ void yf() {
        mk$PartySnapshot.ij[0] = -2706394197602513316L;
        mk$PartySnapshot.ij[1] = -3603790578276786103L;
        mk$PartySnapshot.ij[2] = 378093678439125878L;
        mk$PartySnapshot.ij[3] = -9074751268477429764L;
        mk$PartySnapshot.ij[4] = 5826193837720540602L;
        mk$PartySnapshot.ij[5] = -1291720251592555223L;
        mk$PartySnapshot.ij[6] = 3529747501129803388L;
        mk$PartySnapshot.ij[7] = 4947846745366911890L;
        mk$PartySnapshot.ij[8] = 660620920638331437L;
        mk$PartySnapshot.ij[9] = -7007195904838801586L;
        mk$PartySnapshot.ij[10] = 1751989454182771219L;
        mk$PartySnapshot.ij[11] = 3069674328483791534L;
        mk$PartySnapshot.ij[12] = 2240999337906927547L;
        mk$PartySnapshot.ij[13] = 4158402956887469734L;
        mk$PartySnapshot.ij[14] = -2089280756870320968L;
        mk$PartySnapshot.ij[15] = -4577217466039964092L;
        mk$PartySnapshot.ij[16] = -3887509031055943187L;
        mk$PartySnapshot.ij[17] = -5144430614914748071L;
        mk$PartySnapshot.ij[18] = -7907770330514379126L;
        mk$PartySnapshot.ij[19] = 5154561298195445200L;
        mk$PartySnapshot.ij[20] = -5779669757637133890L;
        mk$PartySnapshot.ij[21] = 7701718853276109326L;
        mk$PartySnapshot.ij[22] = 1924000511345305396L;
        mk$PartySnapshot.ij[23] = 906308535391314665L;
        mk$PartySnapshot.ij[24] = -5781347000431026628L;
        mk$PartySnapshot.ij[25] = 6831323845485009478L;
        mk$PartySnapshot.ij[26] = 162832246856148752L;
        mk$PartySnapshot.ij[27] = -6711909613627196236L;
        mk$PartySnapshot.ij[28] = -2917518451904156106L;
        mk$PartySnapshot.ij[29] = 4343962835376637810L;
        mk$PartySnapshot.ij[30] = -6221245603019508219L;
        mk$PartySnapshot.ij[31] = -8521689438938402910L;
        mk$PartySnapshot.ij[32] = -6970784116797543737L;
        mk$PartySnapshot.ij[33] = -2585573866534802603L;
        mk$PartySnapshot.ij[34] = 6872357931710639358L;
        mk$PartySnapshot.ij[35] = 8276182831199743614L;
        mk$PartySnapshot.ij[36] = 2146826202227940735L;
        mk$PartySnapshot.ij[37] = 1292178153743690354L;
        mk$PartySnapshot.ij[38] = 768941639305452579L;
        mk$PartySnapshot.ij[39] = 62373644914087826L;
        mk$PartySnapshot.ij[40] = 784501214314783907L;
        mk$PartySnapshot.ij[41] = 713533558334581497L;
        mk$PartySnapshot.ij[42] = -6887288892629048144L;
        mk$PartySnapshot.ij[43] = 7947384327636171795L;
        mk$PartySnapshot.ij[44] = -3253744537931647116L;
        mk$PartySnapshot.ij[45] = -3504577721970929119L;
        mk$PartySnapshot.ij[46] = 5541531752783260316L;
        mk$PartySnapshot.ij[47] = -7321591432993217476L;
        mk$PartySnapshot.ij[48] = 3639805851152129063L;
        mk$PartySnapshot.ij[49] = -5875243930426408659L;
        mk$PartySnapshot.ij[50] = 6006964410957973289L;
        mk$PartySnapshot.ij[51] = -1883370554582682799L;
        mk$PartySnapshot.ij[52] = 9196606723596995007L;
        mk$PartySnapshot.ij[53] = -4326707936730431522L;
        mk$PartySnapshot.ij[54] = -5554591266298540564L;
        mk$PartySnapshot.ij[55] = -6788380125462071409L;
        mk$PartySnapshot.ij[56] = 1778597679048326724L;
        mk$PartySnapshot.ij[57] = -1928026025541253211L;
        mk$PartySnapshot.ij[58] = -6558221354645395977L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean contains(String var1_1) {
        v0 /* !! */  = mk$PartySnapshot.g;
        if (true) ** GOTO lbl5
        block27: while (true) {
            v0 /* !! */  = (long)(v1 - mk$PartySnapshot.hv("im", ii(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1615981201: {
                    v1 = mk$PartySnapshot.hv("in", ii(int ), (int)1);
                    continue block27;
                }
                case -1598155301: {
                    break block27;
                }
                case -1413441643: {
                    v1 = mk$PartySnapshot.hv("ip", ii(int ), (int)2);
                    continue block27;
                }
                case 1560806352: {
                    v1 = mk$PartySnapshot.hv("iq", ii(int ), (int)3);
                    continue block27;
                }
            }
            break;
        }
        var4_2 = mk$PartySnapshot.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mk$PartySnapshot.g - mk$PartySnapshot.hv("is", ii(int ), (int)4)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == mk$PartySnapshot.hv("it", fv(int ), (int)8)) break;
            v2 /* !! */  = (long)mk$PartySnapshot.hv("iv", fv(int ), (int)9);
        }
        var3_3 /* !! */  = mk$PartySnapshot.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = mk$PartySnapshot.g - mk$PartySnapshot.hv("iw", ii(int ), (int)5)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == mk$PartySnapshot.hv("iy", fv(int ), (int)10)) break;
            v3 /* !! */  = (long)mk$PartySnapshot.hv("ja", fv(int ), (int)11);
        }
        var2_4 = mk$PartySnapshot.a;
        if (var4_2) {
            throw null;
lbl32:
            // 4 sources

            return (boolean)mk$PartySnapshot.hv("jb", fv(int ), (int)12);
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block6 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl32
                if (var1_1 == null) ** GOTO lbl83
                if (var2_4) ** GOTO lbl32
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = mk$PartySnapshot.g - mk$PartySnapshot.hv("jd", ii(int ), (int)6)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == mk$PartySnapshot.hv("je", fv(int ), (int)13)) break;
                    v4 /* !! */  = (long)mk$PartySnapshot.hv("jf", fv(int ), (int)14);
                }
                v5 /* !! */  = mk$PartySnapshot.g;
                if (true) ** GOTO lbl49
                block32: while (true) {
                    v5 /* !! */  = (long)(v6 - mk$PartySnapshot.hv("jh", ii(int ), (int)7));
lbl49:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1598155301: {
                            break block32;
                        }
                        case 113286298: {
                            v6 = mk$PartySnapshot.hv("ji", ii(int ), (int)8);
                            continue block32;
                        }
                        case 952719945: {
                            v6 = mk$PartySnapshot.hv("jk", ii(int ), (int)9);
                            continue block32;
                        }
                        case 1890538092: {
                            v6 = mk$PartySnapshot.hv("jl", ii(int ), (int)10);
                            continue block32;
                        }
                    }
                    break;
                }
                v7 = this.members.stream();
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = mk$PartySnapshot.g - mk$PartySnapshot.hv("jn", ii(int ), (int)11)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == mk$PartySnapshot.hv("jo", fv(int ), (int)15)) break;
                    v8 /* !! */  = (long)mk$PartySnapshot.hv("jq", fv(int ), (int)16);
                }
                v9 = (Predicate<String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$contains$0(java.lang.String java.lang.String ), (Ljava/lang/String;)Z)((String)var1_1);
                v10 /* !! */  = mk$PartySnapshot.g;
                if (true) ** GOTO lbl72
                block34: while (true) {
                    v10 /* !! */  = (long)(mk$PartySnapshot.hv("jt", ii(int ), (int)13) - mk$PartySnapshot.hv("jr", ii(int ), (int)12));
lbl72:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1598155301: {
                            break block34;
                        }
                        case 866990439: {
                            continue block34;
                        }
                    }
                    break;
                }
                if (!v7.anyMatch(v9)) ** GOTO lbl83
                if (var2_4) ** GOTO lbl32
                v11 = mk$PartySnapshot.hv("mh", fv(int ), (int)17);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl86
lbl83:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v11 = mk$PartySnapshot.hv("mk", fv(int ), (int)18);
lbl86:
                // 2 sources

                return (boolean)v11;
            }
            case 0: {
                var3_3 /* !! */  = (int)mk$PartySnapshot.hv("ml", fv(int ), (int)19);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl106
            }
            case 1: {
                var3_3 /* !! */  = (int)mk$PartySnapshot.hv("mn", fv(int ), (int)20);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl106
            }
lbl97:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)mk$PartySnapshot.hv("mt", fv(int ), (int)21);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl120
            }
lbl102:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)mk$PartySnapshot.hv("mx", fv(int ), (int)22);
                if (!var4_2) ** GOTO lbl97
                throw null;
            }
lbl106:
            // 3 sources

            case 4: {
                var3_3 /* !! */  = (int)mk$PartySnapshot.hv("nc", fv(int ), (int)23);
                if (!var4_2) break;
                throw null;
            }
            case 5: {
                var3_3 /* !! */  = (int)mk$PartySnapshot.hv("ng", fv(int ), (int)24);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl120
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)mk$PartySnapshot.hv("ni", fv(int ), (int)25);
                    if (!var4_2) break block6;
                    throw null;
                }
            }
lbl120:
            // 3 sources

            case 7: {
                var3_3 /* !! */  = (int)mk$PartySnapshot.hv("nk", fv(int ), (int)26);
                if (!var4_2) ** GOTO lbl102
                throw null;
            }
            case 8: 
        }
        var3_3 /* !! */  = (int)mk$PartySnapshot.hv("nl", fv(int ), (int)27);
        ** while (!var4_2)
lbl127:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long ii(int n2) {
        return ij[n2] ^ il[n2];
    }
}

