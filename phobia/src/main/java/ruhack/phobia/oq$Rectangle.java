/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.runtime.ObjectMethods
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;

record oq$Rectangle(double h, double w, double x, double y) {
    public static final boolean c;
    private final double h;
    private final double w;
    private static int[] ipsa;
    public static final boolean a;
    private static long[] ipsi;
    private final double x;
    private final double y;
    public static final int b;
    private static long[] ipsh;
    private static int[] iprz;
    static final long qd = 4253019830378202959L;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private oq$Rectangle(double var1_1, double var3_2, double var5_3, double var7_4) {
        var10_5 /* !! */  = oq$Rectangle.b;
        if (var10_5 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var10_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.x = var1_1;
                this.y = var3_2;
                this.w = var5_3;
                this.h = var7_4;
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var10_5 /* !! */  = (int)oq$Rectangle.ipsb("ipsc", ipry(int ), (int)0);
                    break block0;
                    break;
                }
            }
lbl15:
            // 2 sources

            case 1: {
                var10_5 /* !! */  = (int)oq$Rectangle.ipsb("ipsd", ipry(int ), (int)1);
            }
            case 2: {
                var10_5 /* !! */  = (int)oq$Rectangle.ipsb("ipse", ipry(int ), (int)2);
                ** GOTO lbl15
            }
            case 3: 
        }
        var10_5 /* !! */  = (int)oq$Rectangle.ipsb("ipsf", ipry(int ), (int)3);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public double h() {
        v0 /* !! */  = oq$Rectangle.qd;
        if (true) ** GOTO lbl5
        block25: while (true) {
            v0 /* !! */  = (long)(oq$Rectangle.ipsb("ipwm", ipsg(int ), (int)50) - oq$Rectangle.ipsb("ipwl", ipsg(int ), (int)49));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1805482161: {
                    break block25;
                }
                case 2058764355: {
                    continue block25;
                }
            }
            break;
        }
        var3_1 = oq$Rectangle.c;
        v1 /* !! */  = oq$Rectangle.qd;
        if (true) ** GOTO lbl15
        block26: while (true) {
            v1 /* !! */  = (long)(v2 - oq$Rectangle.ipsb("ipwn", ipsg(int ), (int)51));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1805482161: {
                    break block26;
                }
                case -571323809: {
                    v2 = oq$Rectangle.ipsb("ipwo", ipsg(int ), (int)52);
                    continue block26;
                }
                case 147544061: {
                    v2 = oq$Rectangle.ipsb("ipwp", ipsg(int ), (int)53);
                    continue block26;
                }
            }
            break;
        }
        var2_2 /* !! */  = oq$Rectangle.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block9 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = oq$Rectangle.qd;
                if (true) ** GOTO lbl32
                block27: while (true) {
                    v3 /* !! */  = (long)(oq$Rectangle.ipsb("ipwr", ipsg(int ), (int)55) - oq$Rectangle.ipsb("ipwq", ipsg(int ), (int)54));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1805482161: {
                            break block27;
                        }
                        case 2126710867: {
                            continue block27;
                        }
                    }
                    break;
                }
                var1_3 = oq$Rectangle.a;
                if (var3_1) {
                    throw null;
                    return (double)oq$Rectangle.ipsb("ipws", ipus(int ), (int)56);
                }
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = oq$Rectangle.qd;
                if (true) ** GOTO lbl47
                block29: while (true) {
                    v4 /* !! */  = (long)(v5 - oq$Rectangle.ipsb("ipwt", ipsg(int ), (int)57));
lbl47:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1805482161: {
                            break block29;
                        }
                        case -1780023913: {
                            v5 = oq$Rectangle.ipsb("ipwu", ipsg(int ), (int)58);
                            continue block29;
                        }
                        case 175335781: {
                            v5 = oq$Rectangle.ipsb("ipwv", ipsg(int ), (int)59);
                            continue block29;
                        }
                        case 778187613: {
                            v5 = oq$Rectangle.ipsb("ipww", ipsg(int ), (int)60);
                            continue block29;
                        }
                    }
                    break;
                }
                return this.h;
            }
lbl60:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)oq$Rectangle.ipsb("ipwx", ipry(int ), (int)60);
                } while (!var3_1);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)oq$Rectangle.ipsb("ipwy", ipry(int ), (int)61);
                    if (!var3_1) break block9;
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)oq$Rectangle.ipsb("ipwz", ipry(int ), (int)62);
                if (!var3_1) ** GOTO lbl60
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)oq$Rectangle.ipsb("ipxa", ipry(int ), (int)63);
        ** while (!var3_1)
lbl77:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public double x() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = oq$Rectangle.qd - oq$Rectangle.ipsb("ipuj", ipsg(int ), (int)28)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == oq$Rectangle.ipsb("ipuk", ipry(int ), (int)28)) break;
            v0 /* !! */  = (long)oq$Rectangle.ipsb("ipul", ipry(int ), (int)29);
        }
        var3_1 = oq$Rectangle.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = oq$Rectangle.qd - oq$Rectangle.ipsb("ipum", ipsg(int ), (int)29)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == oq$Rectangle.ipsb("ipun", ipry(int ), (int)30)) break;
            v1 /* !! */  = (long)oq$Rectangle.ipsb("ipuo", ipry(int ), (int)31);
        }
        var2_2 /* !! */  = oq$Rectangle.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = oq$Rectangle.qd - oq$Rectangle.ipsb("ipup", ipsg(int ), (int)30)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == oq$Rectangle.ipsb("ipuq", ipry(int ), (int)32)) break;
            v2 /* !! */  = (long)oq$Rectangle.ipsb("ipur", ipry(int ), (int)33);
        }
        var1_3 = oq$Rectangle.a;
        if (var3_1) {
            throw null;
            return (double)oq$Rectangle.ipsb("iput", ipus(int ), (int)31);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = oq$Rectangle.qd - oq$Rectangle.ipsb("ipuu", ipsg(int ), (int)32)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == oq$Rectangle.ipsb("ipuv", ipry(int ), (int)34)) break;
                    v3 /* !! */  = (long)oq$Rectangle.ipsb("ipuw", ipry(int ), (int)35);
                }
                return this.x;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)oq$Rectangle.ipsb("ipux", ipry(int ), (int)36);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)oq$Rectangle.ipsb("ipuy", ipry(int ), (int)37);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)oq$Rectangle.ipsb("ipuz", ipry(int ), (int)38);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)oq$Rectangle.ipsb("ipva", ipry(int ), (int)39);
        ** while (!var3_1)
lbl53:
        // 1 sources

        throw null;
    }

    static {
        iprz = new int[64];
        ipsa = new int[64];
        oq$Rectangle.ipxb();
        oq$Rectangle.ipxc();
        ipsh = new long[61];
        ipsi = new long[61];
        oq$Rectangle.ipxd();
        oq$Rectangle.ipxe();
    }

    private static /* synthetic */ void ipxb() {
        oq$Rectangle.iprz[0] = 2045421340;
        oq$Rectangle.iprz[1] = 858057862;
        oq$Rectangle.iprz[2] = 496823150;
        oq$Rectangle.iprz[3] = 13445516;
        oq$Rectangle.iprz[4] = 1240926312;
        oq$Rectangle.iprz[5] = 1441053086;
        oq$Rectangle.iprz[6] = 1759670220;
        oq$Rectangle.iprz[7] = -1692333594;
        oq$Rectangle.iprz[8] = -1133269138;
        oq$Rectangle.iprz[9] = -1822129442;
        oq$Rectangle.iprz[10] = 1253897854;
        oq$Rectangle.iprz[11] = -476587802;
        oq$Rectangle.iprz[12] = -1928083288;
        oq$Rectangle.iprz[13] = 1020454304;
        oq$Rectangle.iprz[14] = -253520096;
        oq$Rectangle.iprz[15] = 364660741;
        oq$Rectangle.iprz[16] = 1650118832;
        oq$Rectangle.iprz[17] = 649983107;
        oq$Rectangle.iprz[18] = 1117397703;
        oq$Rectangle.iprz[19] = -1233163962;
        oq$Rectangle.iprz[20] = -457776250;
        oq$Rectangle.iprz[21] = -1047869019;
        oq$Rectangle.iprz[22] = -216778243;
        oq$Rectangle.iprz[23] = 877545798;
        oq$Rectangle.iprz[24] = -1964395330;
        oq$Rectangle.iprz[25] = -733176959;
        oq$Rectangle.iprz[26] = -1211929513;
        oq$Rectangle.iprz[27] = -1836182763;
        oq$Rectangle.iprz[28] = -1726299294;
        oq$Rectangle.iprz[29] = -596208566;
        oq$Rectangle.iprz[30] = -799874828;
        oq$Rectangle.iprz[31] = 1956168343;
        oq$Rectangle.iprz[32] = -452363171;
        oq$Rectangle.iprz[33] = -706327636;
        oq$Rectangle.iprz[34] = 2116775670;
        oq$Rectangle.iprz[35] = 958874148;
        oq$Rectangle.iprz[36] = -430364342;
        oq$Rectangle.iprz[37] = -1090722470;
        oq$Rectangle.iprz[38] = -1075635848;
        oq$Rectangle.iprz[39] = 1384572363;
        oq$Rectangle.iprz[40] = 588714928;
        oq$Rectangle.iprz[41] = 1169106679;
        oq$Rectangle.iprz[42] = -1524898382;
        oq$Rectangle.iprz[43] = -1387193996;
        oq$Rectangle.iprz[44] = 1051154049;
        oq$Rectangle.iprz[45] = -194422243;
        oq$Rectangle.iprz[46] = -864657907;
        oq$Rectangle.iprz[47] = -1734374807;
        oq$Rectangle.iprz[48] = 80649371;
        oq$Rectangle.iprz[49] = -1201841713;
        oq$Rectangle.iprz[50] = -308344117;
        oq$Rectangle.iprz[51] = -254347784;
        oq$Rectangle.iprz[52] = 454447662;
        oq$Rectangle.iprz[53] = -1048796435;
        oq$Rectangle.iprz[54] = -499192529;
        oq$Rectangle.iprz[55] = 526968212;
        oq$Rectangle.iprz[56] = 816474083;
        oq$Rectangle.iprz[57] = -1397269893;
        oq$Rectangle.iprz[58] = 550361315;
        oq$Rectangle.iprz[59] = 558859358;
        oq$Rectangle.iprz[60] = 1684205247;
        oq$Rectangle.iprz[61] = -1392852433;
        oq$Rectangle.iprz[62] = -1064474578;
        oq$Rectangle.iprz[63] = 1199700614;
    }

    private static /* synthetic */ int ipry(int n2) {
        return iprz[n2] ^ ipsa[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = oq$Rectangle.qd - oq$Rectangle.ipsb("iptu", ipsg(int ), (int)22)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == oq$Rectangle.ipsb("iptv", ipry(int ), (int)19)) break;
            v0 /* !! */  = (long)oq$Rectangle.ipsb("iptw", ipry(int ), (int)20);
        }
        var4_2 = oq$Rectangle.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = oq$Rectangle.qd - oq$Rectangle.ipsb("iptx", ipsg(int ), (int)23)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == oq$Rectangle.ipsb("ipty", ipry(int ), (int)21)) break;
            v1 /* !! */  = (long)oq$Rectangle.ipsb("iptz", ipry(int ), (int)22);
        }
        var3_3 /* !! */  = oq$Rectangle.b;
        v2 /* !! */  = oq$Rectangle.qd;
        if (true) ** GOTO lbl19
        block16: while (true) {
            v2 /* !! */  = (long)(oq$Rectangle.ipsb("ipub", ipsg(int ), (int)25) - oq$Rectangle.ipsb("ipua", ipsg(int ), (int)24));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1805482161: {
                    break block16;
                }
                case 1662805688: {
                    continue block16;
                }
            }
            break;
        }
        var2_4 = oq$Rectangle.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
                    return (boolean)oq$Rectangle.ipsb("ipuc", ipry(int ), (int)23);
                }
                if (var2_4 || var2_4) ** continue;
                v3 /* !! */  = oq$Rectangle.qd;
                if (true) ** GOTO lbl37
                block18: while (true) {
                    v3 /* !! */  = (long)(oq$Rectangle.ipsb("ipue", ipsg(int ), (int)27) - oq$Rectangle.ipsb("ipud", ipsg(int ), (int)26));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1805482161: {
                            break block18;
                        }
                        case 143663282: {
                            continue block18;
                        }
                    }
                    break;
                }
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{oq$Rectangle.class, "x;y;w;h", "x", "y", "w", "h"}, this, var1_1);
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)oq$Rectangle.ipsb("ipuf", ipry(int ), (int)24);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl48:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)oq$Rectangle.ipsb("ipug", ipry(int ), (int)25);
                if (!var4_2) break;
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)oq$Rectangle.ipsb("ipuh", ipry(int ), (int)26);
                if (!var4_2) ** GOTO lbl48
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)oq$Rectangle.ipsb("ipui", ipry(int ), (int)27);
        ** while (!var4_2)
lbl59:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = oq$Rectangle.qd - oq$Rectangle.ipsb("ipsj", ipsg(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == oq$Rectangle.ipsb("ipsk", ipry(int ), (int)4)) break;
            v0 /* !! */  = (long)oq$Rectangle.ipsb("ipsl", ipry(int ), (int)5);
        }
        var3_1 = oq$Rectangle.c;
        v1 /* !! */  = oq$Rectangle.qd;
        if (true) ** GOTO lbl12
        block25: while (true) {
            v1 /* !! */  = (long)(v2 - oq$Rectangle.ipsb("ipsm", ipsg(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1805482161: {
                    break block25;
                }
                case 891880207: {
                    v2 = oq$Rectangle.ipsb("ipsn", ipsg(int ), (int)2);
                    continue block25;
                }
                case 1155957207: {
                    v2 = oq$Rectangle.ipsb("ipso", ipsg(int ), (int)3);
                    continue block25;
                }
                case 1486646037: {
                    v2 = oq$Rectangle.ipsb("ipsp", ipsg(int ), (int)4);
                    continue block25;
                }
            }
            break;
        }
        var2_2 /* !! */  = oq$Rectangle.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = oq$Rectangle.qd;
                if (true) ** GOTO lbl32
                block26: while (true) {
                    v3 /* !! */  = (long)(v4 - oq$Rectangle.ipsb("ipsq", ipsg(int ), (int)5));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1805482161: {
                            break block26;
                        }
                        case -1052850869: {
                            v4 = oq$Rectangle.ipsb("ipsr", ipsg(int ), (int)6);
                            continue block26;
                        }
                        case -410331213: {
                            v4 = oq$Rectangle.ipsb("ipss", ipsg(int ), (int)7);
                            continue block26;
                        }
                        case 10365546: {
                            v4 = oq$Rectangle.ipsb("ipst", ipsg(int ), (int)8);
                            continue block26;
                        }
                    }
                    break;
                }
                var1_3 = oq$Rectangle.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v5 /* !! */  = oq$Rectangle.qd;
                if (true) ** GOTO lbl54
                block28: while (true) {
                    v5 /* !! */  = (long)(v6 - oq$Rectangle.ipsb("ipsu", ipsg(int ), (int)9));
lbl54:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1805482161: {
                            break block28;
                        }
                        case -1376002951: {
                            v6 = oq$Rectangle.ipsb("ipsv", ipsg(int ), (int)10);
                            continue block28;
                        }
                        case -331321904: {
                            v6 = oq$Rectangle.ipsb("ipsw", ipsg(int ), (int)11);
                            continue block28;
                        }
                        case 299592389: {
                            v6 = oq$Rectangle.ipsb("ipsx", ipsg(int ), (int)12);
                            continue block28;
                        }
                    }
                    break;
                }
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{oq$Rectangle.class, "x;y;w;h", "x", "y", "w", "h"}, this);
            }
lbl67:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)oq$Rectangle.ipsb("ipsy", ipry(int ), (int)6);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)oq$Rectangle.ipsb("ipsz", ipry(int ), (int)7);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)oq$Rectangle.ipsb("ipta", ipry(int ), (int)8);
                if (!var3_1) ** GOTO lbl67
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)oq$Rectangle.ipsb("iptb", ipry(int ), (int)9);
        ** while (!var3_1)
lbl83:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ipxd() {
        oq$Rectangle.ipsh[0] = -5943857693265854396L;
        oq$Rectangle.ipsh[1] = 8395806320713942828L;
        oq$Rectangle.ipsh[2] = -3137092661251926035L;
        oq$Rectangle.ipsh[3] = -7666141145211489382L;
        oq$Rectangle.ipsh[4] = 4066240394439662814L;
        oq$Rectangle.ipsh[5] = -803995398326011384L;
        oq$Rectangle.ipsh[6] = 7489597397158690062L;
        oq$Rectangle.ipsh[7] = 7219849863934274858L;
        oq$Rectangle.ipsh[8] = -6267348667521123173L;
        oq$Rectangle.ipsh[9] = 8721040974825205607L;
        oq$Rectangle.ipsh[10] = -5957651768030986250L;
        oq$Rectangle.ipsh[11] = 8011654872273247368L;
        oq$Rectangle.ipsh[12] = 965461504485936951L;
        oq$Rectangle.ipsh[13] = 4218925367474053727L;
        oq$Rectangle.ipsh[14] = -7558887084064695480L;
        oq$Rectangle.ipsh[15] = 7099947922330968768L;
        oq$Rectangle.ipsh[16] = -5590061508693671520L;
        oq$Rectangle.ipsh[17] = 1478577667562980090L;
        oq$Rectangle.ipsh[18] = -6900448361784316433L;
        oq$Rectangle.ipsh[19] = -4955706675574315701L;
        oq$Rectangle.ipsh[20] = 7503752477092534551L;
        oq$Rectangle.ipsh[21] = -6846046391850300135L;
        oq$Rectangle.ipsh[22] = 4040477741187420106L;
        oq$Rectangle.ipsh[23] = 9190346480864073550L;
        oq$Rectangle.ipsh[24] = -5538338872270180679L;
        oq$Rectangle.ipsh[25] = 4393965234634444038L;
        oq$Rectangle.ipsh[26] = 658132607545648543L;
        oq$Rectangle.ipsh[27] = -8947968141695776206L;
        oq$Rectangle.ipsh[28] = -4597370700695149797L;
        oq$Rectangle.ipsh[29] = -404260879943521843L;
        oq$Rectangle.ipsh[30] = 3560738059933189354L;
        oq$Rectangle.ipsh[31] = 407081291376907887L;
        oq$Rectangle.ipsh[32] = 5398203899977230906L;
        oq$Rectangle.ipsh[33] = -1019288011974996564L;
        oq$Rectangle.ipsh[34] = -7496710295948387753L;
        oq$Rectangle.ipsh[35] = 7654001535200230145L;
        oq$Rectangle.ipsh[36] = -405830873274076119L;
        oq$Rectangle.ipsh[37] = 8558317766622790334L;
        oq$Rectangle.ipsh[38] = -6650922463149905942L;
        oq$Rectangle.ipsh[39] = -6900773313338765233L;
        oq$Rectangle.ipsh[40] = -5708395286716272L;
        oq$Rectangle.ipsh[41] = 8482263371191318831L;
        oq$Rectangle.ipsh[42] = 7148853637261206690L;
        oq$Rectangle.ipsh[43] = 706801156694965653L;
        oq$Rectangle.ipsh[44] = -8131123873768726870L;
        oq$Rectangle.ipsh[45] = 2116908800308835635L;
        oq$Rectangle.ipsh[46] = -1035264594478546535L;
        oq$Rectangle.ipsh[47] = -1196612092090317281L;
        oq$Rectangle.ipsh[48] = 4494937648453079827L;
        oq$Rectangle.ipsh[49] = 3677681001711139077L;
        oq$Rectangle.ipsh[50] = 536404785637447215L;
        oq$Rectangle.ipsh[51] = 3213176460333552311L;
        oq$Rectangle.ipsh[52] = 1371148500545070844L;
        oq$Rectangle.ipsh[53] = 116374532030196545L;
        oq$Rectangle.ipsh[54] = 309427230515052577L;
        oq$Rectangle.ipsh[55] = 8528536619070453264L;
        oq$Rectangle.ipsh[56] = -6740188005904458402L;
        oq$Rectangle.ipsh[57] = -1011056099449872373L;
        oq$Rectangle.ipsh[58] = -8304302630597580585L;
        oq$Rectangle.ipsh[59] = 7039569650084637463L;
        oq$Rectangle.ipsh[60] = -8482940846150525294L;
    }

    private static /* synthetic */ long ipsg(int n2) {
        return ipsh[n2] ^ ipsi[n2];
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public double w() {
        block22: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_1 = oq$Rectangle.qd - oq$Rectangle.ipsb("ipvt", ipsg(int ), (int)41)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == oq$Rectangle.ipsb("ipvu", ipry(int ), (int)50)) break;
                v0 /* !! */  = (long)oq$Rectangle.ipsb("ipvv", ipry(int ), (int)51);
            }
            var3_1 = oq$Rectangle.c;
            while (true) {
                block23: {
                    if ((v1 /* !! */  = (cfr_temp_2 = oq$Rectangle.qd - oq$Rectangle.ipsb("ipvw", ipsg(int ), (int)42)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  != oq$Rectangle.ipsb("ipvx", ipry(int ), (int)52)) break block23;
                    var2_2 /* !! */  = oq$Rectangle.b;
                    v2 /* !! */  = oq$Rectangle.qd;
                    if (true) ** GOTO lbl18
                }
                v1 /* !! */  = (long)oq$Rectangle.ipsb("ipvy", ipry(int ), (int)53);
            }
            block14: while (true) {
                v2 /* !! */  = (long)(v3 - oq$Rectangle.ipsb("ipvz", ipsg(int ), (int)43));
lbl18:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -2101775532: {
                        v3 = oq$Rectangle.ipsb("ipwa", ipsg(int ), (int)44);
                        continue block14;
                    }
                    case -1805482161: {
                        break block14;
                    }
                    case 1213781858: {
                        v3 = oq$Rectangle.ipsb("ipwb", ipsg(int ), (int)45);
                        continue block14;
                    }
                    case 1980233045: {
                        v3 = oq$Rectangle.ipsb("ipwc", ipsg(int ), (int)46);
                        continue block14;
                    }
                }
                break;
            }
            var1_3 = oq$Rectangle.a;
            if (var3_1) {
                throw null;
            }
            if (var1_3 != false) return (double)oq$Rectangle.ipsb("ipwd", ipus(int ), (int)47);
            if (var1_3 != false) return (double)oq$Rectangle.ipsb("ipwd", ipus(int ), (int)47);
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block15: do {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_3 = oq$Rectangle.qd - oq$Rectangle.ipsb("ipwe", ipsg(int ), (int)48)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v4 /* !! */  == oq$Rectangle.ipsb("ipwf", ipry(int ), (int)54)) {
                                return this.w;
                            }
                            v4 /* !! */  = (long)oq$Rectangle.ipsb("ipwg", ipry(int ), (int)55);
                        }
                    }
                    case 2: {
                        var2_2 /* !! */  = (int)oq$Rectangle.ipsb("ipwj", ipry(int ), (int)58);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 0: {
                        ** break;
                    }
                    case 3: {
                        break block22;
                    }
lbl54:
                    // 2 sources

                    while (true) {
                        var2_2 /* !! */  = (int)oq$Rectangle.ipsb("ipwh", ipry(int ), (int)56);
                        cfr_temp_0 = 1;
                        if (!var3_1) continue block15;
                        throw null;
                    }
                    case 1: 
                }
                break;
            } while (true);
            var2_2 /* !! */  = (int)oq$Rectangle.ipsb("ipwi", ipry(int ), (int)57);
            if (var3_1) {
                throw null;
            }
        }
        var2_2 /* !! */  = (int)oq$Rectangle.ipsb("ipwk", ipry(int ), (int)59);
        ** while (!var3_1)
lbl68:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        v0 /* !! */  = oq$Rectangle.qd;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - oq$Rectangle.ipsb("iptc", ipsg(int ), (int)13));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1805482161: {
                    break block17;
                }
                case -402697353: {
                    v1 = oq$Rectangle.ipsb("iptd", ipsg(int ), (int)14);
                    continue block17;
                }
                case 646478169: {
                    v1 = oq$Rectangle.ipsb("ipte", ipsg(int ), (int)15);
                    continue block17;
                }
                case 1109592930: {
                    v1 = oq$Rectangle.ipsb("iptf", ipsg(int ), (int)16);
                    continue block17;
                }
            }
            break;
        }
        var3_1 = oq$Rectangle.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = oq$Rectangle.qd - oq$Rectangle.ipsb("iptg", ipsg(int ), (int)17)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == oq$Rectangle.ipsb("ipth", ipry(int ), (int)10)) break;
            v2 /* !! */  = (long)oq$Rectangle.ipsb("ipti", ipry(int ), (int)11);
        }
        var2_2 /* !! */  = oq$Rectangle.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = oq$Rectangle.qd - oq$Rectangle.ipsb("iptj", ipsg(int ), (int)18)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == oq$Rectangle.ipsb("iptk", ipry(int ), (int)12)) break;
            v3 /* !! */  = (long)oq$Rectangle.ipsb("iptl", ipry(int ), (int)13);
        }
        var1_3 = oq$Rectangle.a;
        if (!var3_1) ** GOTO lbl38
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (int)oq$Rectangle.ipsb("iptm", ipry(int ), (int)14);
                }
lbl38:
                // 1 sources

                if (var1_3 || var1_3) continue block20;
                v4 /* !! */  = oq$Rectangle.qd;
                if (true) ** GOTO lbl43
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - oq$Rectangle.ipsb("iptn", ipsg(int ), (int)19));
lbl43:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1805482161: {
                            break block21;
                        }
                        case -616948739: {
                            v5 = oq$Rectangle.ipsb("ipto", ipsg(int ), (int)20);
                            continue block21;
                        }
                        case 2076523581: {
                            v5 = oq$Rectangle.ipsb("iptp", ipsg(int ), (int)21);
                            continue block21;
                        }
                    }
                    break;
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{oq$Rectangle.class, "x;y;w;h", "x", "y", "w", "h"}, this);
                case 0: {
                    do {
                        var2_2 /* !! */  = (int)oq$Rectangle.ipsb("iptq", ipry(int ), (int)15);
                    } while (!var3_1);
                    throw null;
                }
                case 1: {
                    do {
                        var2_2 /* !! */  = (int)oq$Rectangle.ipsb("iptr", ipry(int ), (int)16);
                    } while (!var3_1);
                    throw null;
                }
                case 2: {
                    do {
                        var2_2 /* !! */  = (int)oq$Rectangle.ipsb("ipts", ipry(int ), (int)17);
                    } while (!var3_1);
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var2_2 /* !! */  = (int)oq$Rectangle.ipsb("iptt", ipry(int ), (int)18);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void ipxc() {
        oq$Rectangle.ipsa[0] = 2045421340;
        oq$Rectangle.ipsa[1] = 858057861;
        oq$Rectangle.ipsa[2] = 496823148;
        oq$Rectangle.ipsa[3] = 13445516;
        oq$Rectangle.ipsa[4] = -1240926313;
        oq$Rectangle.ipsa[5] = 1357398024;
        oq$Rectangle.ipsa[6] = 1759670220;
        oq$Rectangle.ipsa[7] = -1692333596;
        oq$Rectangle.ipsa[8] = -1133269140;
        oq$Rectangle.ipsa[9] = -1822129444;
        oq$Rectangle.ipsa[10] = 1253897855;
        oq$Rectangle.ipsa[11] = -47574748;
        oq$Rectangle.ipsa[12] = -1928083287;
        oq$Rectangle.ipsa[13] = 115638240;
        oq$Rectangle.ipsa[14] = 1944976676;
        oq$Rectangle.ipsa[15] = 364660740;
        oq$Rectangle.ipsa[16] = 1650118833;
        oq$Rectangle.ipsa[17] = 649983106;
        oq$Rectangle.ipsa[18] = 1117397700;
        oq$Rectangle.ipsa[19] = 1233163961;
        oq$Rectangle.ipsa[20] = 1931729689;
        oq$Rectangle.ipsa[21] = -1047869020;
        oq$Rectangle.ipsa[22] = 1880565701;
        oq$Rectangle.ipsa[23] = 877545799;
        oq$Rectangle.ipsa[24] = -1964395331;
        oq$Rectangle.ipsa[25] = -733176958;
        oq$Rectangle.ipsa[26] = -1211929513;
        oq$Rectangle.ipsa[27] = -1836182761;
        oq$Rectangle.ipsa[28] = -1726299293;
        oq$Rectangle.ipsa[29] = 600508282;
        oq$Rectangle.ipsa[30] = -799874827;
        oq$Rectangle.ipsa[31] = 521269587;
        oq$Rectangle.ipsa[32] = -452363172;
        oq$Rectangle.ipsa[33] = -1054895790;
        oq$Rectangle.ipsa[34] = -2116775671;
        oq$Rectangle.ipsa[35] = 2140437146;
        oq$Rectangle.ipsa[36] = -430364343;
        oq$Rectangle.ipsa[37] = -1090722472;
        oq$Rectangle.ipsa[38] = -1075635848;
        oq$Rectangle.ipsa[39] = 1384572363;
        oq$Rectangle.ipsa[40] = 588714929;
        oq$Rectangle.ipsa[41] = -1450555332;
        oq$Rectangle.ipsa[42] = -1524898381;
        oq$Rectangle.ipsa[43] = 1979800029;
        oq$Rectangle.ipsa[44] = 1051154048;
        oq$Rectangle.ipsa[45] = 439943104;
        oq$Rectangle.ipsa[46] = -864657906;
        oq$Rectangle.ipsa[47] = -1734374805;
        oq$Rectangle.ipsa[48] = 80649371;
        oq$Rectangle.ipsa[49] = -1201841716;
        oq$Rectangle.ipsa[50] = -308344118;
        oq$Rectangle.ipsa[51] = -585181183;
        oq$Rectangle.ipsa[52] = 454447663;
        oq$Rectangle.ipsa[53] = 262166681;
        oq$Rectangle.ipsa[54] = -499192530;
        oq$Rectangle.ipsa[55] = -1232533940;
        oq$Rectangle.ipsa[56] = 816474082;
        oq$Rectangle.ipsa[57] = -1397269895;
        oq$Rectangle.ipsa[58] = 550361312;
        oq$Rectangle.ipsa[59] = 558859356;
        oq$Rectangle.ipsa[60] = 1684205247;
        oq$Rectangle.ipsa[61] = -1392852433;
        oq$Rectangle.ipsa[62] = -1064474578;
        oq$Rectangle.ipsa[63] = 1199700612;
    }

    private static /* synthetic */ double ipus(int n2) {
        return Double.longBitsToDouble(ipsh[n2] ^ ipsi[n2]);
    }

    private static /* synthetic */ void ipxe() {
        oq$Rectangle.ipsi[0] = -3077224544303457956L;
        oq$Rectangle.ipsi[1] = -7089433902278130212L;
        oq$Rectangle.ipsi[2] = -6725116202068981892L;
        oq$Rectangle.ipsi[3] = -3534147700186123568L;
        oq$Rectangle.ipsi[4] = 7061513178137149282L;
        oq$Rectangle.ipsi[5] = 2637737415023354460L;
        oq$Rectangle.ipsi[6] = 2581145375991722317L;
        oq$Rectangle.ipsi[7] = 7702706419547966546L;
        oq$Rectangle.ipsi[8] = 5234229182133940065L;
        oq$Rectangle.ipsi[9] = 4529383327238489027L;
        oq$Rectangle.ipsi[10] = -3463626885382273532L;
        oq$Rectangle.ipsi[11] = -2643080795990040103L;
        oq$Rectangle.ipsi[12] = 5624580802913293525L;
        oq$Rectangle.ipsi[13] = -1420515016435066191L;
        oq$Rectangle.ipsi[14] = -611326306049768957L;
        oq$Rectangle.ipsi[15] = -4390006704654769886L;
        oq$Rectangle.ipsi[16] = 3260509627533071813L;
        oq$Rectangle.ipsi[17] = -6655690972205359109L;
        oq$Rectangle.ipsi[18] = 3565026904067784953L;
        oq$Rectangle.ipsi[19] = -3905109985917611005L;
        oq$Rectangle.ipsi[20] = 6756506534538144721L;
        oq$Rectangle.ipsi[21] = 7145376931145879874L;
        oq$Rectangle.ipsi[22] = 8453103558054083968L;
        oq$Rectangle.ipsi[23] = -7485759674061067710L;
        oq$Rectangle.ipsi[24] = -372017306354899030L;
        oq$Rectangle.ipsi[25] = -4120365425920711613L;
        oq$Rectangle.ipsi[26] = 5078956196235842556L;
        oq$Rectangle.ipsi[27] = -5643193629633720338L;
        oq$Rectangle.ipsi[28] = 285237751673636688L;
        oq$Rectangle.ipsi[29] = -2124427408565460691L;
        oq$Rectangle.ipsi[30] = -7999410677759414218L;
        oq$Rectangle.ipsi[31] = 4215321690550677743L;
        oq$Rectangle.ipsi[32] = 1464402406790966485L;
        oq$Rectangle.ipsi[33] = -4186615575082757333L;
        oq$Rectangle.ipsi[34] = 8054286063425034086L;
        oq$Rectangle.ipsi[35] = 4668168890633967898L;
        oq$Rectangle.ipsi[36] = 5605781921153193775L;
        oq$Rectangle.ipsi[37] = -176405521522531895L;
        oq$Rectangle.ipsi[38] = 5685059840734786770L;
        oq$Rectangle.ipsi[39] = -6921390985826251497L;
        oq$Rectangle.ipsi[40] = 9115154904347031644L;
        oq$Rectangle.ipsi[41] = -2631599181761079811L;
        oq$Rectangle.ipsi[42] = -6397408233900422914L;
        oq$Rectangle.ipsi[43] = 8680756663351282210L;
        oq$Rectangle.ipsi[44] = -926396384674777291L;
        oq$Rectangle.ipsi[45] = -7167986230564915211L;
        oq$Rectangle.ipsi[46] = 332622091992445969L;
        oq$Rectangle.ipsi[47] = -3422361468233775825L;
        oq$Rectangle.ipsi[48] = 2367460160794843768L;
        oq$Rectangle.ipsi[49] = 8001129033778039258L;
        oq$Rectangle.ipsi[50] = 3250725890627496215L;
        oq$Rectangle.ipsi[51] = -4421947699441369012L;
        oq$Rectangle.ipsi[52] = 706167544355838004L;
        oq$Rectangle.ipsi[53] = -8345886362925759776L;
        oq$Rectangle.ipsi[54] = -3592405646369273350L;
        oq$Rectangle.ipsi[55] = 1451365949340922553L;
        oq$Rectangle.ipsi[56] = -7082410392509301994L;
        oq$Rectangle.ipsi[57] = -5075449849409211645L;
        oq$Rectangle.ipsi[58] = -2114834014180702801L;
        oq$Rectangle.ipsi[59] = -8151159519838291421L;
        oq$Rectangle.ipsi[60] = -3582468895243323465L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public double y() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = oq$Rectangle.qd - oq$Rectangle.ipsb("ipvb", ipsg(int ), (int)33)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == oq$Rectangle.ipsb("ipvc", ipry(int ), (int)40)) break;
            v0 /* !! */  = (long)oq$Rectangle.ipsb("ipvd", ipry(int ), (int)41);
        }
        var3_1 = oq$Rectangle.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = oq$Rectangle.qd - oq$Rectangle.ipsb("ipve", ipsg(int ), (int)34)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == oq$Rectangle.ipsb("ipvf", ipry(int ), (int)42)) break;
            v1 /* !! */  = (long)oq$Rectangle.ipsb("ipvg", ipry(int ), (int)43);
        }
        var2_2 /* !! */  = oq$Rectangle.b;
        v2 /* !! */  = oq$Rectangle.qd;
        if (true) ** GOTO lbl19
        block14: while (true) {
            v2 /* !! */  = (long)(v3 - oq$Rectangle.ipsb("ipvh", ipsg(int ), (int)35));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1805482161: {
                    break block14;
                }
                case -1210265173: {
                    v3 = oq$Rectangle.ipsb("ipvi", ipsg(int ), (int)36);
                    continue block14;
                }
                case -452686808: {
                    v3 = oq$Rectangle.ipsb("ipvj", ipsg(int ), (int)37);
                    continue block14;
                }
                case 1459899315: {
                    v3 = oq$Rectangle.ipsb("ipvk", ipsg(int ), (int)38);
                    continue block14;
                }
            }
            break;
        }
        var1_3 = oq$Rectangle.a;
        if (var3_1) {
            throw null;
            return (double)oq$Rectangle.ipsb("ipvl", ipus(int ), (int)39);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = oq$Rectangle.qd - oq$Rectangle.ipsb("ipvm", ipsg(int ), (int)40)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == oq$Rectangle.ipsb("ipvn", ipry(int ), (int)44)) break;
                    v4 /* !! */  = (long)oq$Rectangle.ipsb("ipvo", ipry(int ), (int)45);
                }
                return this.y;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)oq$Rectangle.ipsb("ipvp", ipry(int ), (int)46);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)oq$Rectangle.ipsb("ipvq", ipry(int ), (int)47);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)oq$Rectangle.ipsb("ipvr", ipry(int ), (int)48);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)oq$Rectangle.ipsb("ipvs", ipry(int ), (int)49);
        ** while (!var3_1)
lbl63:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite ipsb(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }
}

