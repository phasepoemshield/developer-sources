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
import ruhack.phobia.ds;

public final class ml
extends Record {
    public static final boolean a;
    private static int[] heyn;
    private final float width;
    private static long[] heyv;
    public static final long oe = 2564703547105038327L;
    public static final int b;
    private final ds module;
    private static int[] heym;
    private final float x;
    private final float y;
    private final float height;
    private static long[] heyw;
    public static final boolean c;

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public float width() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = ml.oe - ml.heyo("hfcq", heyu(int ), (int)50)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ml.heyo("hfcr", heyl(int ), (int)51)) break;
            v0 /* !! */  = (long)ml.heyo("hfcs", heyl(int ), (int)52);
        }
        var3_1 = ml.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_2 = ml.oe - ml.heyo("hfct", heyu(int ), (int)51)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ml.heyo("hfcu", heyl(int ), (int)53)) break;
            v1 /* !! */  = (long)ml.heyo("hfcv", heyl(int ), (int)54);
        }
        var2_2 /* !! */  = ml.b;
        v2 /* !! */  = ml.oe;
        block12: while (true) {
            switch ((int)v2 /* !! */ ) {
                case -1486794761: {
                    break block12;
                }
                case 1293719835: {
                    v2 /* !! */  = (long)(ml.heyo("hfcx", heyu(int ), (int)53) - ml.heyo("hfcw", heyu(int ), (int)52));
                    continue block12;
                }
            }
            break;
        }
        var1_3 = ml.a;
        if (var3_1) {
            throw null;
        }
        if (var1_3 != false) return (float)ml.heyo("hfcy", hfbr(int ), (int)55);
        if (var1_3 != false) return (float)ml.heyo("hfcy", hfbr(int ), (int)55);
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        if ((v3 /* !! */  = (cfr_temp_3 = ml.oe - ml.heyo("hfcz", heyu(int ), (int)54)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v3 /* !! */  == ml.heyo("hfda", heyl(int ), (int)56)) {
                            return this.width;
                        }
                        v3 /* !! */  = (long)ml.heyo("hfdb", heyl(int ), (int)57);
                    }
                }
                case 2: {
                    do {
                        var2_2 /* !! */  = (int)ml.heyo("hfde", heyl(int ), (int)60);
                    } while (!var3_1);
                    throw null;
                }
                case 3: {
                    var2_2 /* !! */  = (int)ml.heyo("hfdf", heyl(int ), (int)61);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                case 0: lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)ml.heyo("hfdc", heyl(int ), (int)58);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: 
            }
            if (true) ** GOTO lbl55
            break;
        }
        do {
            if (true) ** continue;
lbl55:
            // 2 sources

            var2_2 /* !! */  = (int)ml.heyo("hfdd", heyl(int ), (int)59);
            cfr_temp_0 = 0;
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float y() {
        v0 /* !! */  = ml.oe;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(ml.heyo("hfca", heyu(int ), (int)41) - ml.heyo("hfbz", heyu(int ), (int)40));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1486794761: {
                    break block21;
                }
                case 736255128: {
                    continue block21;
                }
            }
            break;
        }
        var3_1 = ml.c;
        v1 /* !! */  = ml.oe;
        if (true) ** GOTO lbl15
        block22: while (true) {
            v1 /* !! */  = (long)(v2 - ml.heyo("hfcb", heyu(int ), (int)42));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1486794761: {
                    break block22;
                }
                case -691327147: {
                    v2 = ml.heyo("hfcc", heyu(int ), (int)43);
                    continue block22;
                }
                case -290041697: {
                    v2 = ml.heyo("hfcd", heyu(int ), (int)44);
                    continue block22;
                }
                case 186741225: {
                    v2 = ml.heyo("hfce", heyu(int ), (int)45);
                    continue block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = ml.b;
        v3 /* !! */  = ml.oe;
        if (true) ** GOTO lbl32
        block23: while (true) {
            v3 /* !! */  = (long)(v4 - ml.heyo("hfcf", heyu(int ), (int)46));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1486794761: {
                    break block23;
                }
                case 891962316: {
                    v4 = ml.heyo("hfcg", heyu(int ), (int)47);
                    continue block23;
                }
                case 1991973068: {
                    v4 = ml.heyo("hfch", heyu(int ), (int)48);
                    continue block23;
                }
            }
            break;
        }
        var1_3 = ml.a;
        if (var3_1) {
            throw null;
lbl44:
            // 2 sources

            return (float)ml.heyo("hfci", hfbr(int ), (int)44);
        }
        if (var1_3) ** GOTO lbl44
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = ml.oe - ml.heyo("hfcj", heyu(int ), (int)49)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == ml.heyo("hfck", heyl(int ), (int)45)) break;
                    v5 /* !! */  = (long)ml.heyo("hfcl", heyl(int ), (int)46);
                }
                return this.y;
            }
lbl58:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ml.heyo("hfcm", heyl(int ), (int)47);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)ml.heyo("hfcn", heyl(int ), (int)48);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ml.heyo("hfco", heyl(int ), (int)49);
                if (!var3_1) ** GOTO lbl58
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ml.heyo("hfcp", heyl(int ), (int)50);
        ** while (!var3_1)
lbl74:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ml.oe - ml.heyo("hezm", heyu(int ), (int)7)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ml.heyo("hezn", heyl(int ), (int)13)) break;
            v0 /* !! */  = (long)ml.heyo("hezo", heyl(int ), (int)14);
        }
        var3_1 = ml.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ml.oe - ml.heyo("hezp", heyu(int ), (int)8)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ml.heyo("hezq", heyl(int ), (int)15)) break;
            v1 /* !! */  = (long)ml.heyo("hezr", heyl(int ), (int)16);
        }
        var2_2 /* !! */  = ml.b;
        v2 /* !! */  = ml.oe;
        if (true) ** GOTO lbl19
        block19: while (true) {
            v2 /* !! */  = (long)(v3 - ml.heyo("hezs", heyu(int ), (int)9));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1486794761: {
                    break block19;
                }
                case 350960620: {
                    v3 = ml.heyo("hezt", heyu(int ), (int)10);
                    continue block19;
                }
                case 737773347: {
                    v3 = ml.heyo("hezu", heyu(int ), (int)11);
                    continue block19;
                }
                case 1738441500: {
                    v3 = ml.heyo("hezv", heyu(int ), (int)12);
                    continue block19;
                }
            }
            break;
        }
        var1_3 = ml.a;
        if (!var3_1) ** GOTO lbl38
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (int)ml.heyo("hezw", heyl(int ), (int)17);
                }
lbl38:
                // 1 sources

                if (var1_3 || var1_3) continue block20;
                v4 /* !! */  = ml.oe;
                if (true) ** GOTO lbl43
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - ml.heyo("hezx", heyu(int ), (int)13));
lbl43:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1486794761: {
                            break block21;
                        }
                        case -665398869: {
                            v5 = ml.heyo("hezy", heyu(int ), (int)14);
                            continue block21;
                        }
                        case 1909355914: {
                            v5 = ml.heyo("hezz", heyu(int ), (int)15);
                            continue block21;
                        }
                    }
                    break;
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ml.class, "module;x;y;width;height", "module", "x", "y", "width", "height"}, this);
                case 0: {
                    var2_2 /* !! */  = (int)ml.heyo("hfaa", heyl(int ), (int)18);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl62
                }
                case 1: {
                    var2_2 /* !! */  = (int)ml.heyo("hfab", heyl(int ), (int)19);
                    if (var3_1) {
                        throw null;
                    }
                }
lbl62:
                // 4 sources

                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)ml.heyo("hfac", heyl(int ), (int)20);
                        if (!var3_1) break block20;
                        throw null;
                    }
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)ml.heyo("hfad", heyl(int ), (int)21);
        ** while (!var3_1)
lbl70:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float hfbr(int n2) {
        return Float.intBitsToFloat(heym[n2] ^ heyn[n2]);
    }

    private static /* synthetic */ void hfdw() {
        ml.heym[0] = -1955777906;
        ml.heym[1] = -36929148;
        ml.heym[2] = 2118119186;
        ml.heym[3] = -1139273885;
        ml.heym[4] = 801043547;
        ml.heym[5] = 1077162399;
        ml.heym[6] = 2032349050;
        ml.heym[7] = -179095464;
        ml.heym[8] = 175064966;
        ml.heym[9] = 108727965;
        ml.heym[10] = -734515612;
        ml.heym[11] = -1799518108;
        ml.heym[12] = -455800468;
        ml.heym[13] = -1725722804;
        ml.heym[14] = -1251517612;
        ml.heym[15] = 1308245862;
        ml.heym[16] = -1834776883;
        ml.heym[17] = -318134174;
        ml.heym[18] = 6545079;
        ml.heym[19] = 985798495;
        ml.heym[20] = 713203937;
        ml.heym[21] = -962381251;
        ml.heym[22] = 1974099106;
        ml.heym[23] = 532445879;
        ml.heym[24] = 1212175235;
        ml.heym[25] = 1785427291;
        ml.heym[26] = -435284787;
        ml.heym[27] = 377600730;
        ml.heym[28] = 135549998;
        ml.heym[29] = -1238930883;
        ml.heym[30] = 1748467374;
        ml.heym[31] = -2095449182;
        ml.heym[32] = 1391133985;
        ml.heym[33] = -2062867779;
        ml.heym[34] = -1906033932;
        ml.heym[35] = 145352821;
        ml.heym[36] = -1983852526;
        ml.heym[37] = 1898929319;
        ml.heym[38] = -1442285411;
        ml.heym[39] = 1495161821;
        ml.heym[40] = -409553581;
        ml.heym[41] = -366413712;
        ml.heym[42] = -1178409646;
        ml.heym[43] = -2029091633;
        ml.heym[44] = 1555012825;
        ml.heym[45] = -858994622;
        ml.heym[46] = 2049696022;
        ml.heym[47] = 1438982841;
        ml.heym[48] = 501843176;
        ml.heym[49] = 518980448;
        ml.heym[50] = 1532736135;
        ml.heym[51] = -1620118173;
        ml.heym[52] = 747777727;
        ml.heym[53] = 1703110625;
        ml.heym[54] = 523795335;
        ml.heym[55] = 700372249;
        ml.heym[56] = -1889512958;
        ml.heym[57] = -1447785178;
        ml.heym[58] = -152254883;
        ml.heym[59] = 370963126;
        ml.heym[60] = 621557826;
        ml.heym[61] = -1868853970;
        ml.heym[62] = -1316323438;
        ml.heym[63] = -483114535;
        ml.heym[64] = -954473669;
        ml.heym[65] = 182629362;
        ml.heym[66] = -2060057818;
        ml.heym[67] = 1022204874;
        ml.heym[68] = 158658176;
        ml.heym[69] = -1635418249;
        ml.heym[70] = -1526393238;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ds module() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ml.oe - ml.heyo("hfav", heyu(int ), (int)24)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ml.heyo("hfaw", heyl(int ), (int)31)) break;
            v0 /* !! */  = (long)ml.heyo("hfax", heyl(int ), (int)32);
        }
        var3_1 = ml.c;
        v1 /* !! */  = ml.oe;
        if (true) ** GOTO lbl12
        block15: while (true) {
            v1 /* !! */  = (long)(ml.heyo("hfaz", heyu(int ), (int)26) - ml.heyo("hfay", heyu(int ), (int)25));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1486794761: {
                    break block15;
                }
                case -125026514: {
                    continue block15;
                }
            }
            break;
        }
        var2_2 /* !! */  = ml.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ml.oe - ml.heyo("hfba", heyu(int ), (int)27)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ml.heyo("hfbb", heyl(int ), (int)33)) break;
            v2 /* !! */  = (long)ml.heyo("hfbc", heyl(int ), (int)34);
        }
        var1_3 = ml.a;
        if (var3_1) {
            throw null;
lbl27:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v3 /* !! */  = ml.oe;
                if (true) ** GOTO lbl38
                block18: while (true) {
                    v3 /* !! */  = (long)(ml.heyo("hfbe", heyu(int ), (int)29) - ml.heyo("hfbd", heyu(int ), (int)28));
lbl38:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1486794761: {
                            break block18;
                        }
                        case -97922028: {
                            continue block18;
                        }
                    }
                    break;
                }
                return this.module;
            }
lbl44:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ml.heyo("hfbf", heyl(int ), (int)35);
                    if (!var3_1) break block4;
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)ml.heyo("hfbg", heyl(int ), (int)36);
                if (!var3_1) ** GOTO lbl44
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)ml.heyo("hfbh", heyl(int ), (int)37);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ml.heyo("hfbi", heyl(int ), (int)38);
        ** while (!var3_1)
lbl60:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int heyl(int n2) {
        return heym[n2] ^ heyn[n2];
    }

    private static /* synthetic */ void hfdy() {
        ml.heyv[0] = -8081128446472714078L;
        ml.heyv[1] = 3343156363799843885L;
        ml.heyv[2] = -8332208439160461996L;
        ml.heyv[3] = 7876052764556049835L;
        ml.heyv[4] = -5712432025419704884L;
        ml.heyv[5] = -4566727517751838127L;
        ml.heyv[6] = -676047311663936033L;
        ml.heyv[7] = -1924643489581465869L;
        ml.heyv[8] = -6396467323166514842L;
        ml.heyv[9] = 2847471444766392469L;
        ml.heyv[10] = -4643334299612687339L;
        ml.heyv[11] = 1089128970444723629L;
        ml.heyv[12] = 6462830918899095028L;
        ml.heyv[13] = 8385692432533426401L;
        ml.heyv[14] = -1373619142095427262L;
        ml.heyv[15] = -2397222810045523749L;
        ml.heyv[16] = -5961513976799513368L;
        ml.heyv[17] = 7045130888043099494L;
        ml.heyv[18] = 5861521747150861813L;
        ml.heyv[19] = 1319792259477789722L;
        ml.heyv[20] = 6171395382368587950L;
        ml.heyv[21] = 531866335303378901L;
        ml.heyv[22] = -9033650667739534762L;
        ml.heyv[23] = 4757184418674557306L;
        ml.heyv[24] = -3853870901201836113L;
        ml.heyv[25] = 4115279853288253419L;
        ml.heyv[26] = 2094448478451600117L;
        ml.heyv[27] = 8181273287992084961L;
        ml.heyv[28] = 9123440129488875441L;
        ml.heyv[29] = 1539777467922632031L;
        ml.heyv[30] = -2675698853196083527L;
        ml.heyv[31] = -5276739012567078270L;
        ml.heyv[32] = 5346075993496522190L;
        ml.heyv[33] = -2805492972569138634L;
        ml.heyv[34] = 1106955974655624396L;
        ml.heyv[35] = -2474455331769083472L;
        ml.heyv[36] = 3908890974344707852L;
        ml.heyv[37] = 7519782225021632624L;
        ml.heyv[38] = 1429478165223076663L;
        ml.heyv[39] = -6378166110786354344L;
        ml.heyv[40] = 5237363137904773847L;
        ml.heyv[41] = 2827664441849133930L;
        ml.heyv[42] = 3094437643364184642L;
        ml.heyv[43] = 2055840967420611614L;
        ml.heyv[44] = 3524104704042300619L;
        ml.heyv[45] = 6170136888396222645L;
        ml.heyv[46] = -8831023318784376245L;
        ml.heyv[47] = 5024679898274820389L;
        ml.heyv[48] = -894368738813525764L;
        ml.heyv[49] = 4374784541683525823L;
        ml.heyv[50] = -4074209353098784045L;
        ml.heyv[51] = -5940138894099719372L;
        ml.heyv[52] = 3465446009727321084L;
        ml.heyv[53] = -4112570472402546567L;
        ml.heyv[54] = 6472532782814749582L;
        ml.heyv[55] = -5127451917014852357L;
        ml.heyv[56] = -6561179041412828200L;
        ml.heyv[57] = -4717284543975586515L;
        ml.heyv[58] = 8005060333837854970L;
        ml.heyv[59] = -286057278794005210L;
        ml.heyv[60] = 7215510939250039940L;
        ml.heyv[61] = -3271256842958975608L;
    }

    static {
        heym = new int[71];
        heyn = new int[71];
        ml.hfdw();
        ml.hfdx();
        heyv = new long[62];
        heyw = new long[62];
        ml.hfdy();
        ml.hfdz();
    }

    private static /* synthetic */ long heyu(int n2) {
        return heyv[n2] ^ heyw[n2];
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public float x() {
        Object object = oe;
        boolean bl2 = true;
        block18: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - ml.heyo("hfbj", heyu(int ), (int)30);
            }
            switch ((int)object) {
                case -1486794761: {
                    break block18;
                }
                case -180443321: {
                    callSite = ml.heyo("hfbk", heyu(int ), (int)31);
                    continue block18;
                }
                case 2033824116: {
                    callSite = ml.heyo("hfbl", heyu(int ), (int)32);
                    continue block18;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = oe;
        block19: while (true) {
            switch ((int)object2) {
                case -1486794761: {
                    break block19;
                }
                case -758460434: {
                    object2 = ml.heyo("hfbn", heyu(int ), (int)34) - ml.heyo("hfbm", heyu(int ), (int)33);
                    continue block19;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = oe;
        boolean bl4 = true;
        block20: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object3 = callSite - ml.heyo("hfbo", heyu(int ), (int)35);
            }
            switch ((int)object3) {
                case -1486794761: {
                    break block20;
                }
                case 1423669066: {
                    callSite = ml.heyo("hfbp", heyu(int ), (int)36);
                    continue block20;
                }
                case 1950216640: {
                    callSite = ml.heyo("hfbq", heyu(int ), (int)37);
                    continue block20;
                }
            }
            break;
        }
        boolean bl5 = a;
        if (bl3) {
            throw null;
        }
        if (bl5) return (float)ml.heyo("hfbs", hfbr(int ), (int)39);
        if (bl5) return (float)ml.heyo("hfbs", hfbr(int ), (int)39);
        Object object4 = oe;
        block21: while (true) {
            switch ((int)object4) {
                case -1486794761: {
                    return this.x;
                }
                case 1561110463: {
                    object4 = ml.heyo("hfbu", heyu(int ), (int)39) - ml.heyo("hfbt", heyu(int ), (int)38);
                    continue block21;
                }
            }
            break;
        }
        return this.x;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public float height() {
        boolean bl2;
        Object object = oe;
        block9: while (true) {
            switch ((int)object) {
                case -1486794761: {
                    break block9;
                }
                case 90567689: {
                    object = ml.heyo("hfdh", heyu(int ), (int)56) - ml.heyo("hfdg", heyu(int ), (int)55);
                    continue block9;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = oe - ml.heyo("hfdi", heyu(int ), (int)57)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == ml.heyo("hfdj", heyl(int ), (int)62)) break;
            object2 = ml.heyo("hfdk", heyl(int ), (int)63);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = oe - ml.heyo("hfdl", heyu(int ), (int)58)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == ml.heyo("hfdm", heyl(int ), (int)64)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = ml.heyo("hfdn", heyl(int ), (int)65);
        }
        if (bl2) return (float)ml.heyo("hfdo", hfbr(int ), (int)66);
        if (bl2) return (float)ml.heyo("hfdo", hfbr(int ), (int)66);
        Object object4 = oe;
        boolean bl4 = true;
        block12: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object4 = callSite - ml.heyo("hfdp", heyu(int ), (int)59);
            }
            switch ((int)object4) {
                case -1486794761: {
                    return this.height;
                }
                case -312863895: {
                    callSite = ml.heyo("hfdq", heyu(int ), (int)60);
                    continue block12;
                }
                case 2117427780: {
                    callSite = ml.heyo("hfdr", heyu(int ), (int)61);
                    continue block12;
                }
            }
            break;
        }
        return this.height;
    }

    public static /* synthetic */ CallSite heyo(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public final boolean equals(Object var1_1) {
        while (true) {
            block29: {
                if ((v0 /* !! */  = (cfr_temp_1 = ml.oe - ml.heyo("hfae", heyu(int ), (int)16)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  != ml.heyo("hfaf", heyl(int ), (int)22)) break block29;
                var4_2 = ml.c;
                v1 /* !! */  = ml.oe;
                if (true) ** GOTO lbl13
            }
            v0 /* !! */  = (long)ml.heyo("hfag", heyl(int ), (int)23);
        }
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - ml.heyo("hfah", heyu(int ), (int)17));
lbl13:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1998871250: {
                    v2 = ml.heyo("hfai", heyu(int ), (int)18);
                    continue block17;
                }
                case -1486794761: {
                    break block17;
                }
                case 225454219: {
                    v2 = ml.heyo("hfaj", heyu(int ), (int)19);
                    continue block17;
                }
                case 571654800: {
                    v2 = ml.heyo("hfak", heyu(int ), (int)20);
                    continue block17;
                }
            }
            break;
        }
        var3_3 /* !! */  = ml.b;
        v3 /* !! */  = ml.oe;
        block18: while (true) {
            switch ((int)v3 /* !! */ ) {
                case -1486794761: {
                    break block18;
                }
                case 1114633866: {
                    v3 /* !! */  = (long)(ml.heyo("hfam", heyu(int ), (int)22) - ml.heyo("hfal", heyu(int ), (int)21));
                    continue block18;
                }
            }
            break;
        }
        var2_4 = ml.a;
        if (var4_2) {
            throw null;
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block19: while (true) {
            block30: {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var2_4 != false) return (boolean)ml.heyo("hfan", heyl(int ), (int)24);
                        if (var2_4 != false) return (boolean)ml.heyo("hfan", heyl(int ), (int)24);
                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_2 = ml.oe - ml.heyo("hfao", heyu(int ), (int)23)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v4 /* !! */  == ml.heyo("hfap", heyl(int ), (int)25)) {
                                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ml.class, "module;x;y;width;height", "module", "x", "y", "width", "height"}, this, var1_1);
                            }
                            v4 /* !! */  = (long)ml.heyo("hfaq", heyl(int ), (int)26);
                        }
                    }
                    case 0: {
                        var3_3 /* !! */  = (int)ml.heyo("hfar", heyl(int ), (int)27);
                        cfr_temp_0 = 1;
                        if (var4_2) {
                            throw null;
                        }
                        break block30;
                    }
                    case 3: {
                        var3_3 /* !! */  = (int)ml.heyo("hfau", heyl(int ), (int)30);
                        if (var4_2) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 1: lbl-1000:
                    // 2 sources

                    {
                        var3_3 /* !! */  = (int)ml.heyo("hfas", heyl(int ), (int)28);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 2: 
                }
                ** GOTO lbl71
            }
            do {
                if (true) continue block19;
lbl71:
                // 2 sources

                var3_3 /* !! */  = (int)ml.heyo("hfat", heyl(int ), (int)29);
                cfr_temp_0 = 1;
            } while (!var4_2);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void hfdz() {
        ml.heyw[0] = -3112480716088177865L;
        ml.heyw[1] = 6045063338842162206L;
        ml.heyw[2] = -6635816903106663579L;
        ml.heyw[3] = -6812826221729124044L;
        ml.heyw[4] = 4782934357205896909L;
        ml.heyw[5] = 8272129759483442160L;
        ml.heyw[6] = 3111766189526061561L;
        ml.heyw[7] = 3369020794014614662L;
        ml.heyw[8] = 1775124010095329972L;
        ml.heyw[9] = 603889170198164344L;
        ml.heyw[10] = 4242262633368784583L;
        ml.heyw[11] = 201787450995944458L;
        ml.heyw[12] = 8865842179389158138L;
        ml.heyw[13] = 8616616524952295408L;
        ml.heyw[14] = -5360720642018063671L;
        ml.heyw[15] = -2114413927912015959L;
        ml.heyw[16] = 3276044163492935020L;
        ml.heyw[17] = 8271097960188007167L;
        ml.heyw[18] = 6370500180223351812L;
        ml.heyw[19] = -4128631707642273498L;
        ml.heyw[20] = -4489763795981134661L;
        ml.heyw[21] = 7651589506076457668L;
        ml.heyw[22] = 4968656191247246841L;
        ml.heyw[23] = 4340243704801441803L;
        ml.heyw[24] = 4208788904593861714L;
        ml.heyw[25] = -5438240317941287727L;
        ml.heyw[26] = 8322545384237584658L;
        ml.heyw[27] = 7835549956896775770L;
        ml.heyw[28] = -3182127083443317818L;
        ml.heyw[29] = -2885566472605371822L;
        ml.heyw[30] = 1859948274433413290L;
        ml.heyw[31] = -4256406656570912272L;
        ml.heyw[32] = 1658981731250087914L;
        ml.heyw[33] = 8976846454186301688L;
        ml.heyw[34] = 2342344820903359457L;
        ml.heyw[35] = -2603885175307829291L;
        ml.heyw[36] = -8334903260768256681L;
        ml.heyw[37] = 4346540195789189305L;
        ml.heyw[38] = 2526663501123454488L;
        ml.heyw[39] = -6407543872380592184L;
        ml.heyw[40] = 7722025900675637670L;
        ml.heyw[41] = 1214189621933783229L;
        ml.heyw[42] = 6698311532509341262L;
        ml.heyw[43] = -5659599964428328853L;
        ml.heyw[44] = -8699800762834857674L;
        ml.heyw[45] = -4144465492334086696L;
        ml.heyw[46] = -2403233982355671145L;
        ml.heyw[47] = -6950798668918560380L;
        ml.heyw[48] = 6528238670354705547L;
        ml.heyw[49] = 5548018014634999699L;
        ml.heyw[50] = 6673366140970035028L;
        ml.heyw[51] = 8139314042732929038L;
        ml.heyw[52] = 4351329230042020540L;
        ml.heyw[53] = 3057720789508896189L;
        ml.heyw[54] = -4634578210987439828L;
        ml.heyw[55] = -4475355078399877671L;
        ml.heyw[56] = 3278816937453322279L;
        ml.heyw[57] = 8346907124754937389L;
        ml.heyw[58] = 5447798233961012847L;
        ml.heyw[59] = 4647982777518119994L;
        ml.heyw[60] = -4808928235368930998L;
        ml.heyw[61] = -663278281722189894L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ml(ds var1_1, float var2_2, float var3_3, float var4_4, float var5_5) {
        var7_6 /* !! */  = ml.b;
        super();
        this.module = var1_1;
        this.x = var2_2;
        this.y = var3_3;
        this.width = var4_4;
        if (var7_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.height = var5_5;
                return;
            }
            case 0: {
                var7_6 /* !! */  = (int)ml.heyo("heyp", heyl(int ), (int)0);
                break;
            }
lbl15:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_6 /* !! */  = (int)ml.heyo("heyq", heyl(int ), (int)1);
                    continue;
                    break;
                }
            }
            case 2: {
                var7_6 /* !! */  = (int)ml.heyo("heyr", heyl(int ), (int)2);
                break;
            }
            case 3: {
                var7_6 /* !! */  = (int)ml.heyo("heys", heyl(int ), (int)3);
                ** GOTO lbl15
            }
            case 4: 
        }
        var7_6 /* !! */  = (int)ml.heyo("heyt", heyl(int ), (int)4);
        ** while (true)
    }

    private static /* synthetic */ void hfdx() {
        ml.heyn[0] = -1955777906;
        ml.heyn[1] = -36929152;
        ml.heyn[2] = 2118119184;
        ml.heyn[3] = -1139273881;
        ml.heyn[4] = 801043546;
        ml.heyn[5] = -1077162400;
        ml.heyn[6] = -1056628653;
        ml.heyn[7] = -179095463;
        ml.heyn[8] = -822804102;
        ml.heyn[9] = 108727967;
        ml.heyn[10] = -734515610;
        ml.heyn[11] = -1799518106;
        ml.heyn[12] = -455800465;
        ml.heyn[13] = -1725722803;
        ml.heyn[14] = -1195731318;
        ml.heyn[15] = 1308245863;
        ml.heyn[16] = 1460304454;
        ml.heyn[17] = -412138741;
        ml.heyn[18] = 6545077;
        ml.heyn[19] = 985798494;
        ml.heyn[20] = 713203937;
        ml.heyn[21] = -962381252;
        ml.heyn[22] = 1974099107;
        ml.heyn[23] = -1354248677;
        ml.heyn[24] = 1212175234;
        ml.heyn[25] = -1785427292;
        ml.heyn[26] = -1664296493;
        ml.heyn[27] = 377600729;
        ml.heyn[28] = 135549996;
        ml.heyn[29] = -1238930881;
        ml.heyn[30] = 1748467373;
        ml.heyn[31] = -2095449181;
        ml.heyn[32] = -1528621152;
        ml.heyn[33] = -2062867780;
        ml.heyn[34] = 1261673827;
        ml.heyn[35] = 145352823;
        ml.heyn[36] = -1983852526;
        ml.heyn[37] = 1898929317;
        ml.heyn[38] = -1442285409;
        ml.heyn[39] = 1738376677;
        ml.heyn[40] = -409553582;
        ml.heyn[41] = -366413711;
        ml.heyn[42] = -1178409647;
        ml.heyn[43] = -2029091633;
        ml.heyn[44] = 1654885881;
        ml.heyn[45] = 858994621;
        ml.heyn[46] = -702111737;
        ml.heyn[47] = 1438982841;
        ml.heyn[48] = 501843177;
        ml.heyn[49] = 518980448;
        ml.heyn[50] = 1532736133;
        ml.heyn[51] = -1620118174;
        ml.heyn[52] = 1982750358;
        ml.heyn[53] = 1703110624;
        ml.heyn[54] = -2113246980;
        ml.heyn[55] = 380280862;
        ml.heyn[56] = -1889512957;
        ml.heyn[57] = 1256670927;
        ml.heyn[58] = -152254882;
        ml.heyn[59] = 370963125;
        ml.heyn[60] = 621557827;
        ml.heyn[61] = -1868853969;
        ml.heyn[62] = -1316323437;
        ml.heyn[63] = 22812964;
        ml.heyn[64] = 954473668;
        ml.heyn[65] = 1625061680;
        ml.heyn[66] = -1168310746;
        ml.heyn[67] = 1022204874;
        ml.heyn[68] = 158658178;
        ml.heyn[69] = -1635418249;
        ml.heyn[70] = -1526393237;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        v0 /* !! */  = ml.oe;
        if (true) ** GOTO lbl5
        block9: while (true) {
            v0 /* !! */  = (long)(ml.heyo("heyy", heyu(int ), (int)1) - ml.heyo("heyx", heyu(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1486794761: {
                    break block9;
                }
                case 1701910752: {
                    continue block9;
                }
            }
            break;
        }
        var3_1 = ml.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ml.oe - ml.heyo("heyz", heyu(int ), (int)2)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ml.heyo("heza", heyl(int ), (int)5)) break;
            v1 /* !! */  = (long)ml.heyo("hezb", heyl(int ), (int)6);
        }
        var2_2 = ml.b;
        v2 /* !! */  = ml.oe;
        if (true) ** GOTO lbl22
        block11: while (true) {
            v2 /* !! */  = (long)(v3 - ml.heyo("hezc", heyu(int ), (int)3));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1486794761: {
                    break block11;
                }
                case -1310448195: {
                    v3 = ml.heyo("hezd", heyu(int ), (int)4);
                    continue block11;
                }
                case 1553962794: {
                    v3 = ml.heyo("heze", heyu(int ), (int)5);
                    continue block11;
                }
            }
            break;
        }
        var1_3 = ml.a;
        if (var3_1) {
            throw null;
lbl34:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl37:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = ml.oe - ml.heyo("hezf", heyu(int ), (int)6)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == ml.heyo("hezg", heyl(int ), (int)7)) break;
            v4 /* !! */  = (long)ml.heyo("hezh", heyl(int ), (int)8);
        }
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ml.class, "module;x;y;width;height", "module", "x", "y", "width", "height"}, this);
    }
}

