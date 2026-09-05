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

final class mm$Entry
extends Record {
    public static final int b;
    private final String section;
    private final String description;
    public static final boolean c;
    private static int[] lpnp;
    private static int[] lpno;
    public static final boolean a;
    private static long[] lpnw;
    static final long uj = -5448623565549876637L;
    private final int sectionOrder;
    private final int itemOrder;
    private static long[] lpnx;

    private mm$Entry(String string, int n2, int n3, String string2) {
        int n4 = b;
        this.section = string;
        this.sectionOrder = n2;
        this.itemOrder = n3;
        this.description = string2;
    }

    private static /* synthetic */ long lpnv(int n2) {
        return lpnw[n2] ^ lpnx[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mm$Entry.uj - mm$Entry.lpnq("lpop", lpnv(int ), (int)9)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mm$Entry.lpnq("lpoq", lpnn(int ), (int)12)) break;
            v0 /* !! */  = (long)mm$Entry.lpnq("lpor", lpnn(int ), (int)13);
        }
        var3_1 = mm$Entry.c;
        v1 /* !! */  = mm$Entry.uj;
        if (true) ** GOTO lbl12
        block22: while (true) {
            v1 /* !! */  = (long)(mm$Entry.lpnq("lpot", lpnv(int ), (int)11) - mm$Entry.lpnq("lpos", lpnv(int ), (int)10));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 36165755: {
                    continue block22;
                }
                case 882100835: {
                    break block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = mm$Entry.b;
        v2 /* !! */  = mm$Entry.uj;
        if (true) ** GOTO lbl22
        block23: while (true) {
            v2 /* !! */  = (long)(v3 - mm$Entry.lpnq("lpou", lpnv(int ), (int)12));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2145679646: {
                    v3 = mm$Entry.lpnq("lpov", lpnv(int ), (int)13);
                    continue block23;
                }
                case 471439254: {
                    v3 = mm$Entry.lpnq("lpow", lpnv(int ), (int)14);
                    continue block23;
                }
                case 882100835: {
                    break block23;
                }
            }
            break;
        }
        var1_3 = mm$Entry.a;
        if (var3_1) {
            throw null;
lbl34:
            // 2 sources

            return (int)mm$Entry.lpnq("lpox", lpnn(int ), (int)14);
        }
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block9 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = mm$Entry.uj;
                if (true) ** GOTO lbl45
                block25: while (true) {
                    v4 /* !! */  = (long)(v5 - mm$Entry.lpnq("lpoy", lpnv(int ), (int)15));
lbl45:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1480084307: {
                            v5 = mm$Entry.lpnq("lpoz", lpnv(int ), (int)16);
                            continue block25;
                        }
                        case -815058891: {
                            v5 = mm$Entry.lpnq("lppa", lpnv(int ), (int)17);
                            continue block25;
                        }
                        case 315821740: {
                            v5 = mm$Entry.lpnq("lppb", lpnv(int ), (int)18);
                            continue block25;
                        }
                        case 882100835: {
                            break block25;
                        }
                    }
                    break;
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{mm$Entry.class, "section;sectionOrder;itemOrder;description", "section", "sectionOrder", "itemOrder", "description"}, this);
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mm$Entry.lpnq("lppc", lpnn(int ), (int)15);
                    if (!var3_1) break block9;
                    throw null;
                }
            }
lbl63:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)mm$Entry.lpnq("lppd", lpnn(int ), (int)16);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)mm$Entry.lpnq("lppe", lpnn(int ), (int)17);
                if (!var3_1) ** GOTO lbl63
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mm$Entry.lpnq("lppf", lpnn(int ), (int)18);
        ** while (!var3_1)
lbl74:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public int sectionOrder() {
        Object object = uj;
        block13: while (true) {
            switch ((int)object) {
                case 882100835: {
                    break block13;
                }
                case 1213938175: {
                    object = mm$Entry.lpnq("lpqn", lpnv(int ), (int)37) - mm$Entry.lpnq("lpqm", lpnv(int ), (int)36);
                    continue block13;
                }
            }
            break;
        }
        boolean bl2 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = uj - mm$Entry.lpnq("lpqo", lpnv(int ), (int)38)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == mm$Entry.lpnq("lpqp", lpnn(int ), (int)34)) break;
            object2 = mm$Entry.lpnq("lpqq", lpnn(int ), (int)35);
        }
        int n2 = b;
        Object object3 = uj;
        block15: while (true) {
            switch ((int)object3) {
                case 553997530: {
                    object3 = mm$Entry.lpnq("lpqs", lpnv(int ), (int)40) - mm$Entry.lpnq("lpqr", lpnv(int ), (int)39);
                    continue block15;
                }
                case 882100835: {
                    break block15;
                }
            }
            break;
        }
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3) return (int)mm$Entry.lpnq("lpqt", lpnn(int ), (int)36);
        if (bl3) return (int)mm$Entry.lpnq("lpqt", lpnn(int ), (int)36);
        Object object4 = uj;
        boolean bl4 = true;
        block16: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object4 = callSite - mm$Entry.lpnq("lpqu", lpnv(int ), (int)41);
            }
            switch ((int)object4) {
                case -1824090630: {
                    callSite = mm$Entry.lpnq("lpqv", lpnv(int ), (int)42);
                    continue block16;
                }
                case -61654278: {
                    callSite = mm$Entry.lpnq("lpqw", lpnv(int ), (int)43);
                    continue block16;
                }
                case 882100835: {
                    return this.sectionOrder;
                }
            }
            break;
        }
        return this.sectionOrder;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mm$Entry.uj - mm$Entry.lpnq("lppg", lpnv(int ), (int)19)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mm$Entry.lpnq("lpph", lpnn(int ), (int)19)) break;
            v0 /* !! */  = (long)mm$Entry.lpnq("lppi", lpnn(int ), (int)20);
        }
        var4_2 = mm$Entry.c;
        v1 /* !! */  = mm$Entry.uj;
        if (true) ** GOTO lbl12
        block21: while (true) {
            v1 /* !! */  = (long)(mm$Entry.lpnq("lppk", lpnv(int ), (int)21) - mm$Entry.lpnq("lppj", lpnv(int ), (int)20));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 882100835: {
                    break block21;
                }
                case 1679160475: {
                    continue block21;
                }
            }
            break;
        }
        var3_3 /* !! */  = mm$Entry.b;
        v2 /* !! */  = mm$Entry.uj;
        if (true) ** GOTO lbl22
        block22: while (true) {
            v2 /* !! */  = (long)(v3 - mm$Entry.lpnq("lppl", lpnv(int ), (int)22));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 882100835: {
                    break block22;
                }
                case 1216824263: {
                    v3 = mm$Entry.lpnq("lppm", lpnv(int ), (int)23);
                    continue block22;
                }
                case 1492364932: {
                    v3 = mm$Entry.lpnq("lppn", lpnv(int ), (int)24);
                    continue block22;
                }
            }
            break;
        }
        var2_4 = mm$Entry.a;
        if (var4_2) {
            throw null;
lbl34:
            // 1 sources

            return (boolean)mm$Entry.lpnq("lppo", lpnn(int ), (int)21);
        }
        ** while (var2_4 || var2_4)
lbl37:
        // 1 sources

        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = mm$Entry.uj;
                if (true) ** GOTO lbl44
                block24: while (true) {
                    v4 /* !! */  = (long)(v5 - mm$Entry.lpnq("lppp", lpnv(int ), (int)25));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1822656208: {
                            v5 = mm$Entry.lpnq("lppq", lpnv(int ), (int)26);
                            continue block24;
                        }
                        case 882100835: {
                            break block24;
                        }
                        case 1607047489: {
                            v5 = mm$Entry.lpnq("lppr", lpnv(int ), (int)27);
                            continue block24;
                        }
                    }
                    break;
                }
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{mm$Entry.class, "section;sectionOrder;itemOrder;description", "section", "sectionOrder", "itemOrder", "description"}, this, var1_1);
            }
lbl54:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)mm$Entry.lpnq("lpps", lpnn(int ), (int)22);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)mm$Entry.lpnq("lppt", lpnn(int ), (int)23);
                if (!var4_2) ** GOTO lbl54
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)mm$Entry.lpnq("lppu", lpnn(int ), (int)24);
                if (!var4_2) break;
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)mm$Entry.lpnq("lppv", lpnn(int ), (int)25);
        ** while (!var4_2)
lbl70:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lpsn() {
        mm$Entry.lpnp[0] = -1120233598;
        mm$Entry.lpnp[1] = 1807436292;
        mm$Entry.lpnp[2] = 632958808;
        mm$Entry.lpnp[3] = -1385492259;
        mm$Entry.lpnp[4] = -475947583;
        mm$Entry.lpnp[5] = 1771248614;
        mm$Entry.lpnp[6] = -792037787;
        mm$Entry.lpnp[7] = -897421381;
        mm$Entry.lpnp[8] = -886465865;
        mm$Entry.lpnp[9] = 809006809;
        mm$Entry.lpnp[10] = 1993207393;
        mm$Entry.lpnp[11] = 1995717149;
        mm$Entry.lpnp[12] = 944536159;
        mm$Entry.lpnp[13] = -1688957372;
        mm$Entry.lpnp[14] = 523588121;
        mm$Entry.lpnp[15] = -1253413943;
        mm$Entry.lpnp[16] = 605289670;
        mm$Entry.lpnp[17] = -1963632093;
        mm$Entry.lpnp[18] = 945252278;
        mm$Entry.lpnp[19] = 1222792290;
        mm$Entry.lpnp[20] = -789229693;
        mm$Entry.lpnp[21] = -1888441155;
        mm$Entry.lpnp[22] = 1406607221;
        mm$Entry.lpnp[23] = -1357518094;
        mm$Entry.lpnp[24] = -627690028;
        mm$Entry.lpnp[25] = 957811032;
        mm$Entry.lpnp[26] = -1649411820;
        mm$Entry.lpnp[27] = 2023316942;
        mm$Entry.lpnp[28] = -1557503805;
        mm$Entry.lpnp[29] = 1195681053;
        mm$Entry.lpnp[30] = 1962609052;
        mm$Entry.lpnp[31] = -91576127;
        mm$Entry.lpnp[32] = 555574533;
        mm$Entry.lpnp[33] = -1436430317;
        mm$Entry.lpnp[34] = 1489118012;
        mm$Entry.lpnp[35] = 152456598;
        mm$Entry.lpnp[36] = 229151220;
        mm$Entry.lpnp[37] = 1110617626;
        mm$Entry.lpnp[38] = -220825311;
        mm$Entry.lpnp[39] = -115568830;
        mm$Entry.lpnp[40] = -1723873048;
        mm$Entry.lpnp[41] = 644256265;
        mm$Entry.lpnp[42] = 1422864753;
        mm$Entry.lpnp[43] = -1858857491;
        mm$Entry.lpnp[44] = 1577293751;
        mm$Entry.lpnp[45] = 167503693;
        mm$Entry.lpnp[46] = -310467634;
        mm$Entry.lpnp[47] = 1451822127;
        mm$Entry.lpnp[48] = -555832198;
        mm$Entry.lpnp[49] = 1362626152;
        mm$Entry.lpnp[50] = -125954753;
        mm$Entry.lpnp[51] = -1272802692;
        mm$Entry.lpnp[52] = 1531966009;
        mm$Entry.lpnp[53] = -605167077;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String section() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mm$Entry.uj - mm$Entry.lpnq("lppw", lpnv(int ), (int)28)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mm$Entry.lpnq("lppx", lpnn(int ), (int)26)) break;
            v0 /* !! */  = (long)mm$Entry.lpnq("lppy", lpnn(int ), (int)27);
        }
        var3_1 = mm$Entry.c;
        v1 /* !! */  = mm$Entry.uj;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - mm$Entry.lpnq("lppz", lpnv(int ), (int)29));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1793728983: {
                    v2 = mm$Entry.lpnq("lpqa", lpnv(int ), (int)30);
                    continue block17;
                }
                case -15206028: {
                    v2 = mm$Entry.lpnq("lpqb", lpnv(int ), (int)31);
                    continue block17;
                }
                case 882100835: {
                    break block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = mm$Entry.b;
        v3 /* !! */  = mm$Entry.uj;
        if (true) ** GOTO lbl26
        block18: while (true) {
            v3 /* !! */  = (long)(v4 - mm$Entry.lpnq("lpqc", lpnv(int ), (int)32));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -13271549: {
                    v4 = mm$Entry.lpnq("lpqd", lpnv(int ), (int)33);
                    continue block18;
                }
                case 882100835: {
                    break block18;
                }
                case 1958142627: {
                    v4 = mm$Entry.lpnq("lpqe", lpnv(int ), (int)34);
                    continue block18;
                }
            }
            break;
        }
        var1_3 = mm$Entry.a;
        if (var3_1) {
            throw null;
lbl38:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl38
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = mm$Entry.uj - mm$Entry.lpnq("lpqf", lpnv(int ), (int)35)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == mm$Entry.lpnq("lpqg", lpnn(int ), (int)28)) break;
                    v5 /* !! */  = (long)mm$Entry.lpnq("lpqh", lpnn(int ), (int)29);
                }
                return this.section;
            }
            case 0: {
                var2_2 /* !! */  = (int)mm$Entry.lpnq("lpqi", lpnn(int ), (int)30);
                if (!var3_1) break;
                throw null;
            }
lbl56:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)mm$Entry.lpnq("lpqj", lpnn(int ), (int)31);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mm$Entry.lpnq("lpqk", lpnn(int ), (int)32);
                    if (!var3_1) ** GOTO lbl56
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mm$Entry.lpnq("lpql", lpnn(int ), (int)33);
        ** while (!var3_1)
lbl69:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int lpnn(int n2) {
        return lpno[n2] ^ lpnp[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String description() {
        v0 /* !! */  = mm$Entry.uj;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(v1 - mm$Entry.lpnq("lprt", lpnv(int ), (int)55));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1632541440: {
                    v1 = mm$Entry.lpnq("lpru", lpnv(int ), (int)56);
                    continue block24;
                }
                case -557648465: {
                    v1 = mm$Entry.lpnq("lprv", lpnv(int ), (int)57);
                    continue block24;
                }
                case 498237941: {
                    v1 = mm$Entry.lpnq("lprw", lpnv(int ), (int)58);
                    continue block24;
                }
                case 882100835: {
                    break block24;
                }
            }
            break;
        }
        var3_1 = mm$Entry.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mm$Entry.uj - mm$Entry.lpnq("lprx", lpnv(int ), (int)59)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mm$Entry.lpnq("lpry", lpnn(int ), (int)48)) break;
            v2 /* !! */  = (long)mm$Entry.lpnq("lprz", lpnn(int ), (int)49);
        }
        var2_2 /* !! */  = mm$Entry.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = mm$Entry.uj;
                if (true) ** GOTO lbl32
                block26: while (true) {
                    v3 /* !! */  = (long)(v4 - mm$Entry.lpnq("lpsa", lpnv(int ), (int)60));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1351305512: {
                            v4 = mm$Entry.lpnq("lpsb", lpnv(int ), (int)61);
                            continue block26;
                        }
                        case -524674441: {
                            v4 = mm$Entry.lpnq("lpsc", lpnv(int ), (int)62);
                            continue block26;
                        }
                        case -264686812: {
                            v4 = mm$Entry.lpnq("lpsd", lpnv(int ), (int)63);
                            continue block26;
                        }
                        case 882100835: {
                            break block26;
                        }
                    }
                    break;
                }
                var1_3 = mm$Entry.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v5 /* !! */  = mm$Entry.uj;
                if (true) ** GOTO lbl54
                block28: while (true) {
                    v5 /* !! */  = (long)(v6 - mm$Entry.lpnq("lpse", lpnv(int ), (int)64));
lbl54:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1357105898: {
                            v6 = mm$Entry.lpnq("lpsf", lpnv(int ), (int)65);
                            continue block28;
                        }
                        case -690996320: {
                            v6 = mm$Entry.lpnq("lpsg", lpnv(int ), (int)66);
                            continue block28;
                        }
                        case 882100835: {
                            break block28;
                        }
                        case 1031112383: {
                            v6 = mm$Entry.lpnq("lpsh", lpnv(int ), (int)67);
                            continue block28;
                        }
                    }
                    break;
                }
                return this.description;
            }
            case 0: {
                var2_2 /* !! */  = (int)mm$Entry.lpnq("lpsi", lpnn(int ), (int)50);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl77
            }
lbl72:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)mm$Entry.lpnq("lpsj", lpnn(int ), (int)51);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl77:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)mm$Entry.lpnq("lpsk", lpnn(int ), (int)52);
                if (!var3_1) ** GOTO lbl72
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mm$Entry.lpnq("lpsl", lpnn(int ), (int)53);
        ** while (!var3_1)
lbl84:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mm$Entry.uj - mm$Entry.lpnq("lpny", lpnv(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mm$Entry.lpnq("lpnz", lpnn(int ), (int)4)) break;
            v0 /* !! */  = (long)mm$Entry.lpnq("lpoa", lpnn(int ), (int)5);
        }
        var3_1 = mm$Entry.c;
        v1 /* !! */  = mm$Entry.uj;
        if (true) ** GOTO lbl12
        block12: while (true) {
            v1 /* !! */  = (long)(v2 - mm$Entry.lpnq("lpob", lpnv(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -782957429: {
                    v2 = mm$Entry.lpnq("lpoc", lpnv(int ), (int)2);
                    continue block12;
                }
                case -624654198: {
                    v2 = mm$Entry.lpnq("lpod", lpnv(int ), (int)3);
                    continue block12;
                }
                case 882100835: {
                    break block12;
                }
            }
            break;
        }
        var2_2 = mm$Entry.b;
        v3 /* !! */  = mm$Entry.uj;
        if (true) ** GOTO lbl26
        block13: while (true) {
            v3 /* !! */  = (long)(v4 - mm$Entry.lpnq("lpoe", lpnv(int ), (int)4));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1371921598: {
                    v4 = mm$Entry.lpnq("lpof", lpnv(int ), (int)5);
                    continue block13;
                }
                case 398106639: {
                    v4 = mm$Entry.lpnq("lpog", lpnv(int ), (int)6);
                    continue block13;
                }
                case 882100835: {
                    break block13;
                }
                case 2114765700: {
                    v4 = mm$Entry.lpnq("lpoh", lpnv(int ), (int)7);
                    continue block13;
                }
            }
            break;
        }
        var1_3 = mm$Entry.a;
        if (var3_1) {
            throw null;
lbl41:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl44:
        // 1 sources

        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = mm$Entry.uj - mm$Entry.lpnq("lpoi", lpnv(int ), (int)8)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == mm$Entry.lpnq("lpoj", lpnn(int ), (int)6)) break;
            v5 /* !! */  = (long)mm$Entry.lpnq("lpok", lpnn(int ), (int)7);
        }
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{mm$Entry.class, "section;sectionOrder;itemOrder;description", "section", "sectionOrder", "itemOrder", "description"}, this);
    }

    private static /* synthetic */ void lpsm() {
        mm$Entry.lpno[0] = -1120233599;
        mm$Entry.lpno[1] = 1807436293;
        mm$Entry.lpno[2] = 632958810;
        mm$Entry.lpno[3] = -1385492260;
        mm$Entry.lpno[4] = 475947582;
        mm$Entry.lpno[5] = 2032049364;
        mm$Entry.lpno[6] = 792037786;
        mm$Entry.lpno[7] = -1659815016;
        mm$Entry.lpno[8] = -886465865;
        mm$Entry.lpno[9] = 809006810;
        mm$Entry.lpno[10] = 1993207395;
        mm$Entry.lpno[11] = 1995717150;
        mm$Entry.lpno[12] = -944536160;
        mm$Entry.lpno[13] = -751219867;
        mm$Entry.lpno[14] = 1514535433;
        mm$Entry.lpno[15] = -1253413941;
        mm$Entry.lpno[16] = 605289670;
        mm$Entry.lpno[17] = -1963632093;
        mm$Entry.lpno[18] = 945252279;
        mm$Entry.lpno[19] = 1222792291;
        mm$Entry.lpno[20] = 1195888873;
        mm$Entry.lpno[21] = -1888441155;
        mm$Entry.lpno[22] = 1406607222;
        mm$Entry.lpno[23] = -1357518094;
        mm$Entry.lpno[24] = -627690026;
        mm$Entry.lpno[25] = 957811035;
        mm$Entry.lpno[26] = -1649411819;
        mm$Entry.lpno[27] = 1246635432;
        mm$Entry.lpno[28] = 1557503804;
        mm$Entry.lpno[29] = -764015565;
        mm$Entry.lpno[30] = 1962609052;
        mm$Entry.lpno[31] = -91576127;
        mm$Entry.lpno[32] = 555574534;
        mm$Entry.lpno[33] = -1436430319;
        mm$Entry.lpno[34] = -1489118013;
        mm$Entry.lpno[35] = -1638496548;
        mm$Entry.lpno[36] = 960245039;
        mm$Entry.lpno[37] = 1110617625;
        mm$Entry.lpno[38] = -220825312;
        mm$Entry.lpno[39] = -115568829;
        mm$Entry.lpno[40] = -1723873047;
        mm$Entry.lpno[41] = -644256266;
        mm$Entry.lpno[42] = -1620465483;
        mm$Entry.lpno[43] = -749206746;
        mm$Entry.lpno[44] = 1577293748;
        mm$Entry.lpno[45] = 167503692;
        mm$Entry.lpno[46] = -310467633;
        mm$Entry.lpno[47] = 1451822125;
        mm$Entry.lpno[48] = 555832197;
        mm$Entry.lpno[49] = 45821067;
        mm$Entry.lpno[50] = -125954755;
        mm$Entry.lpno[51] = -1272802689;
        mm$Entry.lpno[52] = 1531966009;
        mm$Entry.lpno[53] = -605167078;
    }

    private static /* synthetic */ void lpsp() {
        mm$Entry.lpnx[0] = -1950052411583012460L;
        mm$Entry.lpnx[1] = 2420224473910433810L;
        mm$Entry.lpnx[2] = -2264340073755643282L;
        mm$Entry.lpnx[3] = -7604780641352249551L;
        mm$Entry.lpnx[4] = 3486356334145054627L;
        mm$Entry.lpnx[5] = 3194765561818757651L;
        mm$Entry.lpnx[6] = -8084181012293150658L;
        mm$Entry.lpnx[7] = -5282594073397584879L;
        mm$Entry.lpnx[8] = -6482441358099033880L;
        mm$Entry.lpnx[9] = 2356132323898037954L;
        mm$Entry.lpnx[10] = 2170583631329164781L;
        mm$Entry.lpnx[11] = -8279358535234321152L;
        mm$Entry.lpnx[12] = -7717532551384268383L;
        mm$Entry.lpnx[13] = -6589339348544394006L;
        mm$Entry.lpnx[14] = 8109253150295087306L;
        mm$Entry.lpnx[15] = 5613445186432234751L;
        mm$Entry.lpnx[16] = 8420583244415465004L;
        mm$Entry.lpnx[17] = 7393188130620526100L;
        mm$Entry.lpnx[18] = -4215863032010820381L;
        mm$Entry.lpnx[19] = 8368546377689390824L;
        mm$Entry.lpnx[20] = 7838577111505022806L;
        mm$Entry.lpnx[21] = 1688678444306439583L;
        mm$Entry.lpnx[22] = 3292191444449691428L;
        mm$Entry.lpnx[23] = -3157697942458041811L;
        mm$Entry.lpnx[24] = 4315657997906558490L;
        mm$Entry.lpnx[25] = 141330895415294973L;
        mm$Entry.lpnx[26] = 7591483888167514113L;
        mm$Entry.lpnx[27] = -7572024419393902853L;
        mm$Entry.lpnx[28] = 4069033482191381007L;
        mm$Entry.lpnx[29] = -792711347773963775L;
        mm$Entry.lpnx[30] = -3866623436402087789L;
        mm$Entry.lpnx[31] = -1139855240044803000L;
        mm$Entry.lpnx[32] = 1425523263332249238L;
        mm$Entry.lpnx[33] = 1136133285602044438L;
        mm$Entry.lpnx[34] = 8703774908673907976L;
        mm$Entry.lpnx[35] = -7860879233644738181L;
        mm$Entry.lpnx[36] = 3691479068061987865L;
        mm$Entry.lpnx[37] = -6598625422330671245L;
        mm$Entry.lpnx[38] = 4683488140158736758L;
        mm$Entry.lpnx[39] = 6759946257239701176L;
        mm$Entry.lpnx[40] = -3826223870577311126L;
        mm$Entry.lpnx[41] = 633677194896334229L;
        mm$Entry.lpnx[42] = -8605797843097214400L;
        mm$Entry.lpnx[43] = 8328682468857894609L;
        mm$Entry.lpnx[44] = 8794297637722907392L;
        mm$Entry.lpnx[45] = 1570703347564268599L;
        mm$Entry.lpnx[46] = 7093139959621156773L;
        mm$Entry.lpnx[47] = -1506674027260049212L;
        mm$Entry.lpnx[48] = -4927424964963990224L;
        mm$Entry.lpnx[49] = -6012477756612320455L;
        mm$Entry.lpnx[50] = 5597217787726012491L;
        mm$Entry.lpnx[51] = 8880058263980418807L;
        mm$Entry.lpnx[52] = -7820233528226632220L;
        mm$Entry.lpnx[53] = 7684998703915009997L;
        mm$Entry.lpnx[54] = -316311962263874297L;
        mm$Entry.lpnx[55] = -1552958176866623963L;
        mm$Entry.lpnx[56] = -4962099538893922640L;
        mm$Entry.lpnx[57] = 8927012244554260263L;
        mm$Entry.lpnx[58] = 5412744696635234850L;
        mm$Entry.lpnx[59] = 1044151848268641699L;
        mm$Entry.lpnx[60] = -8443728277007145203L;
        mm$Entry.lpnx[61] = -3209431050800752147L;
        mm$Entry.lpnx[62] = -5643014906678588707L;
        mm$Entry.lpnx[63] = -3941174234962645455L;
        mm$Entry.lpnx[64] = 4273361372287728822L;
        mm$Entry.lpnx[65] = 517260432916510851L;
        mm$Entry.lpnx[66] = 835513207078423754L;
        mm$Entry.lpnx[67] = -1349984254850790641L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int itemOrder() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mm$Entry.uj - mm$Entry.lpnq("lprb", lpnv(int ), (int)44)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mm$Entry.lpnq("lprc", lpnn(int ), (int)41)) break;
            v0 /* !! */  = (long)mm$Entry.lpnq("lprd", lpnn(int ), (int)42);
        }
        var3_1 = mm$Entry.c;
        v1 /* !! */  = mm$Entry.uj;
        if (true) ** GOTO lbl12
        block23: while (true) {
            v1 /* !! */  = (long)(v2 - mm$Entry.lpnq("lpre", lpnv(int ), (int)45));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -9243264: {
                    v2 = mm$Entry.lpnq("lprf", lpnv(int ), (int)46);
                    continue block23;
                }
                case 882100835: {
                    break block23;
                }
                case 2131685636: {
                    v2 = mm$Entry.lpnq("lprg", lpnv(int ), (int)47);
                    continue block23;
                }
            }
            break;
        }
        var2_2 /* !! */  = mm$Entry.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = mm$Entry.uj;
                if (true) ** GOTO lbl29
                block24: while (true) {
                    v3 /* !! */  = (long)(v4 - mm$Entry.lpnq("lprh", lpnv(int ), (int)48));
lbl29:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -2077739246: {
                            v4 = mm$Entry.lpnq("lpri", lpnv(int ), (int)49);
                            continue block24;
                        }
                        case 882100835: {
                            break block24;
                        }
                        case 947898027: {
                            v4 = mm$Entry.lpnq("lprj", lpnv(int ), (int)50);
                            continue block24;
                        }
                        case 1736410241: {
                            v4 = mm$Entry.lpnq("lprk", lpnv(int ), (int)51);
                            continue block24;
                        }
                    }
                    break;
                }
                var1_3 = mm$Entry.a;
                if (var3_1) {
                    throw null;
                    return (int)mm$Entry.lpnq("lprl", lpnn(int ), (int)43);
                }
                if (var1_3 || var1_3) ** continue;
                v5 /* !! */  = mm$Entry.uj;
                if (true) ** GOTO lbl51
                block26: while (true) {
                    v5 /* !! */  = (long)(v6 - mm$Entry.lpnq("lprm", lpnv(int ), (int)52));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 882100835: {
                            break block26;
                        }
                        case 1477900732: {
                            v6 = mm$Entry.lpnq("lprn", lpnv(int ), (int)53);
                            continue block26;
                        }
                        case 1647426750: {
                            v6 = mm$Entry.lpnq("lpro", lpnv(int ), (int)54);
                            continue block26;
                        }
                    }
                    break;
                }
                return this.itemOrder;
            }
lbl61:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)mm$Entry.lpnq("lprp", lpnn(int ), (int)44);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl71
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)mm$Entry.lpnq("lprq", lpnn(int ), (int)45);
                } while (!var3_1);
                throw null;
            }
lbl71:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mm$Entry.lpnq("lprr", lpnn(int ), (int)46);
                    if (!var3_1) ** GOTO lbl61
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mm$Entry.lpnq("lprs", lpnn(int ), (int)47);
        ** while (!var3_1)
lbl79:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite lpnq(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void lpso() {
        mm$Entry.lpnw[0] = 3698626986159451941L;
        mm$Entry.lpnw[1] = -6620329507346806562L;
        mm$Entry.lpnw[2] = -8602096869266724130L;
        mm$Entry.lpnw[3] = -5258125155183197969L;
        mm$Entry.lpnw[4] = 8563921522757010787L;
        mm$Entry.lpnw[5] = 5652713727069191535L;
        mm$Entry.lpnw[6] = 6004364985826228584L;
        mm$Entry.lpnw[7] = -3221264543233008875L;
        mm$Entry.lpnw[8] = -3708255320007547324L;
        mm$Entry.lpnw[9] = 5308780375365639138L;
        mm$Entry.lpnw[10] = 2491630351385679572L;
        mm$Entry.lpnw[11] = 1014216466765543946L;
        mm$Entry.lpnw[12] = -5987751456561198655L;
        mm$Entry.lpnw[13] = -5607488946542950578L;
        mm$Entry.lpnw[14] = 8757086824199677631L;
        mm$Entry.lpnw[15] = 8702164099335681999L;
        mm$Entry.lpnw[16] = -3767522270604317612L;
        mm$Entry.lpnw[17] = 6981136117218209439L;
        mm$Entry.lpnw[18] = -6776771231944027843L;
        mm$Entry.lpnw[19] = -1079503199958651220L;
        mm$Entry.lpnw[20] = 3909188637744235417L;
        mm$Entry.lpnw[21] = -4388605331487768469L;
        mm$Entry.lpnw[22] = -3872459878769571467L;
        mm$Entry.lpnw[23] = -995078153843958207L;
        mm$Entry.lpnw[24] = 3285917251621932131L;
        mm$Entry.lpnw[25] = 5164481959344553722L;
        mm$Entry.lpnw[26] = 2255466666417781913L;
        mm$Entry.lpnw[27] = 1431480351646627853L;
        mm$Entry.lpnw[28] = -6038857691410925371L;
        mm$Entry.lpnw[29] = -14499013269416224L;
        mm$Entry.lpnw[30] = -2706880566401324543L;
        mm$Entry.lpnw[31] = 4807755090108061668L;
        mm$Entry.lpnw[32] = 4407481644320726664L;
        mm$Entry.lpnw[33] = -5958132297766325475L;
        mm$Entry.lpnw[34] = 5072787997446368201L;
        mm$Entry.lpnw[35] = -4193174100244550496L;
        mm$Entry.lpnw[36] = -7199512839010262936L;
        mm$Entry.lpnw[37] = 4834830951725509514L;
        mm$Entry.lpnw[38] = 8602621446507350951L;
        mm$Entry.lpnw[39] = -4954540191063068338L;
        mm$Entry.lpnw[40] = -5528599206147411928L;
        mm$Entry.lpnw[41] = -2989391933024513761L;
        mm$Entry.lpnw[42] = 5391605544326680225L;
        mm$Entry.lpnw[43] = -4616243447133940197L;
        mm$Entry.lpnw[44] = -4138551363355917828L;
        mm$Entry.lpnw[45] = 4535760123649197048L;
        mm$Entry.lpnw[46] = -2686394096538812614L;
        mm$Entry.lpnw[47] = -1567987903921355352L;
        mm$Entry.lpnw[48] = 24218721339952088L;
        mm$Entry.lpnw[49] = 8000062546716190730L;
        mm$Entry.lpnw[50] = 494532367301321168L;
        mm$Entry.lpnw[51] = -7030436814457073555L;
        mm$Entry.lpnw[52] = 2416602079615157799L;
        mm$Entry.lpnw[53] = 8491306027665177929L;
        mm$Entry.lpnw[54] = -6590695972727894269L;
        mm$Entry.lpnw[55] = 8316706029974961580L;
        mm$Entry.lpnw[56] = 5527103413190440753L;
        mm$Entry.lpnw[57] = -5011466225016243756L;
        mm$Entry.lpnw[58] = 3502037215442458993L;
        mm$Entry.lpnw[59] = 6712866622647958462L;
        mm$Entry.lpnw[60] = -6854304836320670858L;
        mm$Entry.lpnw[61] = -5025391498524853604L;
        mm$Entry.lpnw[62] = -3158027274423097988L;
        mm$Entry.lpnw[63] = -3518022969932309447L;
        mm$Entry.lpnw[64] = -3022272535827758704L;
        mm$Entry.lpnw[65] = -5744561378622499826L;
        mm$Entry.lpnw[66] = 3958396806633667845L;
        mm$Entry.lpnw[67] = -949998466430741167L;
    }

    static {
        lpno = new int[54];
        lpnp = new int[54];
        mm$Entry.lpsm();
        mm$Entry.lpsn();
        lpnw = new long[68];
        lpnx = new long[68];
        mm$Entry.lpso();
        mm$Entry.lpsp();
    }
}

