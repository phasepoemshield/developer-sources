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

final class pw$Message
extends Record {
    private final String author;
    private final long timestamp;
    private static long[] ibln;
    public static final boolean c;
    private final String text;
    private static long[] iblo;
    private static int[] iblf;
    private static int[] iblg;
    public static final int b;
    public static final boolean a;
    private final String role;
    public static final long pj = 4762524516276727691L;

    private static /* synthetic */ long iblm(int n2) {
        return ibln[n2] ^ iblo[n2];
    }

    static {
        iblf = new int[70];
        iblg = new int[70];
        pw$Message.ibpu();
        pw$Message.ibpv();
        ibln = new long[43];
        iblo = new long[43];
        pw$Message.ibpw();
        pw$Message.ibpx();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private pw$Message(String var1_1, String var2_2, String var3_3, long var4_4) {
        var7_5 /* !! */  = pw$Message.b;
        if (var7_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.role = var1_1;
                this.author = var2_2;
                this.text = var3_3;
                this.timestamp = var4_4;
                return;
            }
lbl11:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_5 /* !! */  = (int)pw$Message.iblh("ibli", ible(int ), (int)0);
                    ** GOTO lbl18
                    break;
                }
            }
            case 1: {
                var7_5 /* !! */  = (int)pw$Message.iblh("iblj", ible(int ), (int)1);
                break;
            }
lbl18:
            // 2 sources

            case 2: {
                var7_5 /* !! */  = (int)pw$Message.iblh("iblk", ible(int ), (int)2);
                ** GOTO lbl11
            }
            case 3: 
        }
        var7_5 /* !! */  = (int)pw$Message.iblh("ibll", ible(int ), (int)3);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public String author() {
        v0 /* !! */  = pw$Message.pj;
        block20: while (true) {
            switch ((int)v0 /* !! */ ) {
                case -2072156316: {
                    v0 /* !! */  = (long)(pw$Message.iblh("iboa", iblm(int ), (int)25) - pw$Message.iblh("ibnz", iblm(int ), (int)24));
                    continue block20;
                }
                case -1966903413: {
                    break block20;
                }
            }
            break;
        }
        var3_1 = pw$Message.c;
        v1 /* !! */  = pw$Message.pj;
        if (true) ** GOTO lbl14
        block21: while (true) {
            v1 /* !! */  = (long)(v2 - pw$Message.iblh("ibob", iblm(int ), (int)26));
lbl14:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1966903413: {
                    break block21;
                }
                case -509842405: {
                    v2 = pw$Message.iblh("iboc", iblm(int ), (int)27);
                    continue block21;
                }
                case 176595759: {
                    v2 = pw$Message.iblh("ibod", iblm(int ), (int)28);
                    continue block21;
                }
                case 978240358: {
                    v2 = pw$Message.iblh("iboe", iblm(int ), (int)29);
                    continue block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = pw$Message.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = pw$Message.pj - pw$Message.iblh("ibof", iblm(int ), (int)30)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == pw$Message.iblh("ibog", ible(int ), (int)42)) {
                var1_3 = pw$Message.a;
                if (var3_1) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)pw$Message.iblh("iboh", ible(int ), (int)43);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 != false) return null;
                if (var1_3 != false) return null;
                v4 /* !! */  = pw$Message.pj;
                block23: while (true) {
                    switch ((int)v4 /* !! */ ) {
                        case -1966903413: {
                            return this.author;
                        }
                        case -789988874: {
                            v4 /* !! */  = (long)(pw$Message.iblh("iboj", iblm(int ), (int)32) - pw$Message.iblh("iboi", iblm(int ), (int)31));
                            continue block23;
                        }
                    }
                    break;
                }
                return this.author;
            }
            case 0: {
                ** GOTO lbl62
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)pw$Message.iblh("ibom", ible(int ), (int)46);
                } while (!var3_1);
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)pw$Message.iblh("ibon", ible(int ), (int)47);
                if (var3_1) {
                    throw null;
                }
lbl62:
                // 3 sources

                var2_2 /* !! */  = (int)pw$Message.iblh("ibok", ible(int ), (int)44);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: 
        }
        do {
            var2_2 /* !! */  = (int)pw$Message.iblh("ibol", ible(int ), (int)45);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void ibpu() {
        pw$Message.iblf[0] = 1600775774;
        pw$Message.iblf[1] = 1853566863;
        pw$Message.iblf[2] = 1251106009;
        pw$Message.iblf[3] = 1211673851;
        pw$Message.iblf[4] = -1121613149;
        pw$Message.iblf[5] = -781927621;
        pw$Message.iblf[6] = 50962764;
        pw$Message.iblf[7] = -862620358;
        pw$Message.iblf[8] = -1894622926;
        pw$Message.iblf[9] = -638729200;
        pw$Message.iblf[10] = 282182377;
        pw$Message.iblf[11] = -1202049155;
        pw$Message.iblf[12] = 1978896073;
        pw$Message.iblf[13] = 1150647760;
        pw$Message.iblf[14] = -679333769;
        pw$Message.iblf[15] = -1235484274;
        pw$Message.iblf[16] = 732296277;
        pw$Message.iblf[17] = 1639399592;
        pw$Message.iblf[18] = 831622276;
        pw$Message.iblf[19] = 925060383;
        pw$Message.iblf[20] = -114130058;
        pw$Message.iblf[21] = -353319826;
        pw$Message.iblf[22] = 267005891;
        pw$Message.iblf[23] = -319844062;
        pw$Message.iblf[24] = 1924119678;
        pw$Message.iblf[25] = -861733043;
        pw$Message.iblf[26] = 24103448;
        pw$Message.iblf[27] = -1908169153;
        pw$Message.iblf[28] = -686472959;
        pw$Message.iblf[29] = -1058396022;
        pw$Message.iblf[30] = -1933819901;
        pw$Message.iblf[31] = 1222687222;
        pw$Message.iblf[32] = -1339889667;
        pw$Message.iblf[33] = -1062980948;
        pw$Message.iblf[34] = 344940828;
        pw$Message.iblf[35] = -381598033;
        pw$Message.iblf[36] = -1067448354;
        pw$Message.iblf[37] = 1210274486;
        pw$Message.iblf[38] = 1462148988;
        pw$Message.iblf[39] = -305731636;
        pw$Message.iblf[40] = -951686170;
        pw$Message.iblf[41] = -1128548287;
        pw$Message.iblf[42] = -1768881522;
        pw$Message.iblf[43] = -191413732;
        pw$Message.iblf[44] = 1477619919;
        pw$Message.iblf[45] = 230799226;
        pw$Message.iblf[46] = -379771629;
        pw$Message.iblf[47] = 226472114;
        pw$Message.iblf[48] = -1623084290;
        pw$Message.iblf[49] = -293985748;
        pw$Message.iblf[50] = -266129706;
        pw$Message.iblf[51] = -1070652113;
        pw$Message.iblf[52] = 502709277;
        pw$Message.iblf[53] = 1293540121;
        pw$Message.iblf[54] = -1580280322;
        pw$Message.iblf[55] = -1903363754;
        pw$Message.iblf[56] = 2029966;
        pw$Message.iblf[57] = 1146632884;
        pw$Message.iblf[58] = 1023277304;
        pw$Message.iblf[59] = -1140090094;
        pw$Message.iblf[60] = 1617470856;
        pw$Message.iblf[61] = -596618479;
        pw$Message.iblf[62] = 1305672634;
        pw$Message.iblf[63] = 569757053;
        pw$Message.iblf[64] = 1643274229;
        pw$Message.iblf[65] = 1984115404;
        pw$Message.iblf[66] = 856156341;
        pw$Message.iblf[67] = -1797683023;
        pw$Message.iblf[68] = -716429052;
        pw$Message.iblf[69] = 1093053675;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = pw$Message.pj - pw$Message.iblh("iblp", iblm(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == pw$Message.iblh("iblq", ible(int ), (int)4)) break;
            v0 /* !! */  = (long)pw$Message.iblh("iblr", ible(int ), (int)5);
        }
        var3_1 = pw$Message.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = pw$Message.pj - pw$Message.iblh("ibls", iblm(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == pw$Message.iblh("iblt", ible(int ), (int)6)) break;
            v1 /* !! */  = (long)pw$Message.iblh("iblu", ible(int ), (int)7);
        }
        var2_2 /* !! */  = pw$Message.b;
        v2 /* !! */  = pw$Message.pj;
        if (true) ** GOTO lbl19
        block18: while (true) {
            v2 /* !! */  = (long)(pw$Message.iblh("iblw", iblm(int ), (int)3) - pw$Message.iblh("iblv", iblm(int ), (int)2));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1966903413: {
                    break block18;
                }
                case -464578084: {
                    continue block18;
                }
            }
            break;
        }
        var1_3 = pw$Message.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = pw$Message.pj;
                if (true) ** GOTO lbl37
                block20: while (true) {
                    v3 /* !! */  = (long)(v4 - pw$Message.iblh("iblx", iblm(int ), (int)4));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1966903413: {
                            break block20;
                        }
                        case -355408234: {
                            v4 = pw$Message.iblh("ibly", iblm(int ), (int)5);
                            continue block20;
                        }
                        case -212844347: {
                            v4 = pw$Message.iblh("iblz", iblm(int ), (int)6);
                            continue block20;
                        }
                        case 739697034: {
                            v4 = pw$Message.iblh("ibma", iblm(int ), (int)7);
                            continue block20;
                        }
                    }
                    break;
                }
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{pw$Message.class, "role;author;text;timestamp", "role", "author", "text", "timestamp"}, this);
            }
lbl50:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)pw$Message.iblh("ibmb", ible(int ), (int)8);
                    if (!var3_1) break block4;
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)pw$Message.iblh("ibmc", ible(int ), (int)9);
                if (!var3_1) ** GOTO lbl50
                throw null;
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)pw$Message.iblh("ibmd", ible(int ), (int)10);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)pw$Message.iblh("ibme", ible(int ), (int)11);
        ** while (!var3_1)
lbl67:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ibpw() {
        pw$Message.ibln[0] = 4002677116435558450L;
        pw$Message.ibln[1] = 4161143657659657178L;
        pw$Message.ibln[2] = -4381476832143589903L;
        pw$Message.ibln[3] = 8218120776420009605L;
        pw$Message.ibln[4] = 5363922358090104035L;
        pw$Message.ibln[5] = -777970714270993206L;
        pw$Message.ibln[6] = -3462218775362385940L;
        pw$Message.ibln[7] = -4068569163668624327L;
        pw$Message.ibln[8] = -7748608107200621170L;
        pw$Message.ibln[9] = -4190590853527304568L;
        pw$Message.ibln[10] = -8497086198517429093L;
        pw$Message.ibln[11] = 7571638689716282631L;
        pw$Message.ibln[12] = -9126052787848781044L;
        pw$Message.ibln[13] = -6105369554125099303L;
        pw$Message.ibln[14] = 473090403597040046L;
        pw$Message.ibln[15] = -7261539447396983234L;
        pw$Message.ibln[16] = 8902773328206630913L;
        pw$Message.ibln[17] = 4555239624260232798L;
        pw$Message.ibln[18] = -3014735266505705419L;
        pw$Message.ibln[19] = 6304063744972561445L;
        pw$Message.ibln[20] = 2449225555904791754L;
        pw$Message.ibln[21] = -4896267988487247336L;
        pw$Message.ibln[22] = -6399001008915974014L;
        pw$Message.ibln[23] = 29373637898369239L;
        pw$Message.ibln[24] = -8284686524449839843L;
        pw$Message.ibln[25] = 6117904103453360796L;
        pw$Message.ibln[26] = -2181310584365249107L;
        pw$Message.ibln[27] = 9141900835425936752L;
        pw$Message.ibln[28] = 2715115218011869622L;
        pw$Message.ibln[29] = 7522606784755845524L;
        pw$Message.ibln[30] = 1013631801809000242L;
        pw$Message.ibln[31] = 2254951657193025011L;
        pw$Message.ibln[32] = -1878746508810585808L;
        pw$Message.ibln[33] = -1254541077501510600L;
        pw$Message.ibln[34] = -5039103256357186943L;
        pw$Message.ibln[35] = -4134261522056272740L;
        pw$Message.ibln[36] = -7623338923078682988L;
        pw$Message.ibln[37] = 57289276104296197L;
        pw$Message.ibln[38] = -1262843972171530306L;
        pw$Message.ibln[39] = -8821968813932523132L;
        pw$Message.ibln[40] = 3142235314551944950L;
        pw$Message.ibln[41] = -6894567239661367156L;
        pw$Message.ibln[42] = -3782475718315582371L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = pw$Message.pj - pw$Message.iblh("ibmf", iblm(int ), (int)8)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == pw$Message.iblh("ibmg", ible(int ), (int)12)) break;
            v0 /* !! */  = (long)pw$Message.iblh("ibmh", ible(int ), (int)13);
        }
        var3_1 = pw$Message.c;
        v1 /* !! */  = pw$Message.pj;
        if (true) ** GOTO lbl12
        block15: while (true) {
            v1 /* !! */  = (long)(pw$Message.iblh("ibmj", iblm(int ), (int)10) - pw$Message.iblh("ibmi", iblm(int ), (int)9));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1966903413: {
                    break block15;
                }
                case 929155499: {
                    continue block15;
                }
            }
            break;
        }
        var2_2 /* !! */  = pw$Message.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = pw$Message.pj - pw$Message.iblh("ibmk", iblm(int ), (int)11)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == pw$Message.iblh("ibml", ible(int ), (int)14)) break;
            v2 /* !! */  = (long)pw$Message.iblh("ibmm", ible(int ), (int)15);
        }
        var1_3 = pw$Message.a;
        if (!var3_1) ** GOTO lbl31
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (int)pw$Message.iblh("ibmn", ible(int ), (int)16);
                }
lbl31:
                // 1 sources

                if (var1_3 || var1_3) continue block17;
                v3 /* !! */  = pw$Message.pj;
                if (true) ** GOTO lbl36
                block18: while (true) {
                    v3 /* !! */  = (long)(pw$Message.iblh("ibmp", iblm(int ), (int)13) - pw$Message.iblh("ibmo", iblm(int ), (int)12));
lbl36:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1966903413: {
                            break block18;
                        }
                        case -233955461: {
                            continue block18;
                        }
                    }
                    break;
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{pw$Message.class, "role;author;text;timestamp", "role", "author", "text", "timestamp"}, this);
lbl42:
                // 2 sources

                case 0: {
                    var2_2 /* !! */  = (int)pw$Message.iblh("ibmq", ible(int ), (int)17);
                    if (var3_1) {
                        throw null;
                    }
                }
lbl46:
                // 4 sources

                case 1: {
                    var2_2 /* !! */  = (int)pw$Message.iblh("ibmr", ible(int ), (int)18);
                    if (!var3_1) ** GOTO lbl42
                    throw null;
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)pw$Message.iblh("ibms", ible(int ), (int)19);
                        if (!var3_1) ** GOTO lbl46
                        throw null;
                    }
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)pw$Message.iblh("ibmt", ible(int ), (int)20);
        ** while (!var3_1)
lbl58:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = pw$Message.pj - pw$Message.iblh("ibmu", iblm(int ), (int)14)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == pw$Message.iblh("ibmv", ible(int ), (int)21)) break;
            v0 /* !! */  = (long)pw$Message.iblh("ibmw", ible(int ), (int)22);
        }
        var4_2 = pw$Message.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = pw$Message.pj - pw$Message.iblh("ibmx", iblm(int ), (int)15)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == pw$Message.iblh("ibmy", ible(int ), (int)23)) break;
            v1 /* !! */  = (long)pw$Message.iblh("ibmz", ible(int ), (int)24);
        }
        var3_3 /* !! */  = pw$Message.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = pw$Message.pj - pw$Message.iblh("ibna", iblm(int ), (int)16)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == pw$Message.iblh("ibnb", ible(int ), (int)25)) break;
            v2 /* !! */  = (long)pw$Message.iblh("ibnc", ible(int ), (int)26);
        }
        var2_4 = pw$Message.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
                    return (boolean)pw$Message.iblh("ibnd", ible(int ), (int)27);
                }
                if (var2_4 || var2_4) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = pw$Message.pj - pw$Message.iblh("ibne", iblm(int ), (int)17)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == pw$Message.iblh("ibnf", ible(int ), (int)28)) break;
                    v3 /* !! */  = (long)pw$Message.iblh("ibng", ible(int ), (int)29);
                }
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{pw$Message.class, "role;author;text;timestamp", "role", "author", "text", "timestamp"}, this, var1_1);
            }
lbl37:
            // 2 sources

            case 0: {
                do {
                    var3_3 /* !! */  = (int)pw$Message.iblh("ibnh", ible(int ), (int)30);
                } while (!var4_2);
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)pw$Message.iblh("ibni", ible(int ), (int)31);
                if (var4_2) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)pw$Message.iblh("ibnj", ible(int ), (int)32);
                    if (!var4_2) ** GOTO lbl37
                    throw null;
                }
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)pw$Message.iblh("ibnk", ible(int ), (int)33);
        ** while (!var4_2)
lbl54:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String text() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = pw$Message.pj - pw$Message.iblh("iboo", iblm(int ), (int)33)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == pw$Message.iblh("ibop", ible(int ), (int)48)) break;
            v0 /* !! */  = (long)pw$Message.iblh("iboq", ible(int ), (int)49);
        }
        var3_1 = pw$Message.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = pw$Message.pj - pw$Message.iblh("ibor", iblm(int ), (int)34)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == pw$Message.iblh("ibos", ible(int ), (int)50)) break;
            v1 /* !! */  = (long)pw$Message.iblh("ibot", ible(int ), (int)51);
        }
        var2_2 /* !! */  = pw$Message.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = pw$Message.pj - pw$Message.iblh("ibou", iblm(int ), (int)35)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == pw$Message.iblh("ibov", ible(int ), (int)52)) break;
                    v2 /* !! */  = (long)pw$Message.iblh("ibow", ible(int ), (int)53);
                }
                var1_3 = pw$Message.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = pw$Message.pj - pw$Message.iblh("ibox", iblm(int ), (int)36)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == pw$Message.iblh("iboy", ible(int ), (int)54)) break;
                    v3 /* !! */  = (long)pw$Message.iblh("iboz", ible(int ), (int)55);
                }
                return this.text;
            }
            case 0: {
                var2_2 /* !! */  = (int)pw$Message.iblh("ibpa", ible(int ), (int)56);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)pw$Message.iblh("ibpb", ible(int ), (int)57);
                    if (!var3_1) break block0;
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)pw$Message.iblh("ibpc", ible(int ), (int)58);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)pw$Message.iblh("ibpd", ible(int ), (int)59);
        ** while (!var3_1)
lbl53:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ibpx() {
        pw$Message.iblo[0] = -5030619500430435464L;
        pw$Message.iblo[1] = -6018702052444628106L;
        pw$Message.iblo[2] = -6231032332100053862L;
        pw$Message.iblo[3] = 2343190784944500729L;
        pw$Message.iblo[4] = 1129193706301286736L;
        pw$Message.iblo[5] = 8221412015713182113L;
        pw$Message.iblo[6] = 2157172517225321049L;
        pw$Message.iblo[7] = -3949950783199134114L;
        pw$Message.iblo[8] = 1100750843511104508L;
        pw$Message.iblo[9] = -5533021695406026120L;
        pw$Message.iblo[10] = -4689357220248721085L;
        pw$Message.iblo[11] = 7319851497495203026L;
        pw$Message.iblo[12] = 8088864603261073070L;
        pw$Message.iblo[13] = 5761287892388574503L;
        pw$Message.iblo[14] = -7824482166413292438L;
        pw$Message.iblo[15] = 514519057834420343L;
        pw$Message.iblo[16] = 6501427398546106994L;
        pw$Message.iblo[17] = 6526277690795077081L;
        pw$Message.iblo[18] = -5022795097545130829L;
        pw$Message.iblo[19] = -1019868159452456146L;
        pw$Message.iblo[20] = -5699187361893286173L;
        pw$Message.iblo[21] = -5194875293838546801L;
        pw$Message.iblo[22] = 1472131215684765510L;
        pw$Message.iblo[23] = -560306799641565462L;
        pw$Message.iblo[24] = -2864230497326300729L;
        pw$Message.iblo[25] = 6212836766965728184L;
        pw$Message.iblo[26] = -792621602447312474L;
        pw$Message.iblo[27] = 8901447677799229167L;
        pw$Message.iblo[28] = 527565637949476506L;
        pw$Message.iblo[29] = 4456954634572372951L;
        pw$Message.iblo[30] = -5436816923927422509L;
        pw$Message.iblo[31] = 4504519676075361384L;
        pw$Message.iblo[32] = -5373505861486433263L;
        pw$Message.iblo[33] = 9083667951395105433L;
        pw$Message.iblo[34] = -8365384696076438427L;
        pw$Message.iblo[35] = 4864560329881747832L;
        pw$Message.iblo[36] = -764340301417507453L;
        pw$Message.iblo[37] = -3488763973716458651L;
        pw$Message.iblo[38] = -6531700702033935896L;
        pw$Message.iblo[39] = 4129603378842693368L;
        pw$Message.iblo[40] = 4476327859337173698L;
        pw$Message.iblo[41] = 5507527299695924484L;
        pw$Message.iblo[42] = -2347706050744273427L;
    }

    private static /* synthetic */ void ibpv() {
        pw$Message.iblg[0] = 1600775773;
        pw$Message.iblg[1] = 1853566860;
        pw$Message.iblg[2] = 1251106008;
        pw$Message.iblg[3] = 1211673848;
        pw$Message.iblg[4] = -1121613150;
        pw$Message.iblg[5] = 569047975;
        pw$Message.iblg[6] = 50962765;
        pw$Message.iblg[7] = -1639527000;
        pw$Message.iblg[8] = -1894622926;
        pw$Message.iblg[9] = -638729197;
        pw$Message.iblg[10] = 282182377;
        pw$Message.iblg[11] = -1202049153;
        pw$Message.iblg[12] = 1978896072;
        pw$Message.iblg[13] = 838666003;
        pw$Message.iblg[14] = -679333770;
        pw$Message.iblg[15] = 2030020604;
        pw$Message.iblg[16] = -1306587038;
        pw$Message.iblg[17] = 1639399594;
        pw$Message.iblg[18] = 831622279;
        pw$Message.iblg[19] = 925060382;
        pw$Message.iblg[20] = -114130059;
        pw$Message.iblg[21] = -353319825;
        pw$Message.iblg[22] = -1782466176;
        pw$Message.iblg[23] = -319844061;
        pw$Message.iblg[24] = -742896003;
        pw$Message.iblg[25] = -861733044;
        pw$Message.iblg[26] = -1704610370;
        pw$Message.iblg[27] = -1908169154;
        pw$Message.iblg[28] = 686472958;
        pw$Message.iblg[29] = 1413463767;
        pw$Message.iblg[30] = -1933819902;
        pw$Message.iblg[31] = 1222687222;
        pw$Message.iblg[32] = -1339889666;
        pw$Message.iblg[33] = -1062980945;
        pw$Message.iblg[34] = 344940829;
        pw$Message.iblg[35] = -1734699361;
        pw$Message.iblg[36] = -1067448353;
        pw$Message.iblg[37] = 303229381;
        pw$Message.iblg[38] = 1462148991;
        pw$Message.iblg[39] = -305731635;
        pw$Message.iblg[40] = -951686169;
        pw$Message.iblg[41] = -1128548287;
        pw$Message.iblg[42] = -1768881521;
        pw$Message.iblg[43] = 678911433;
        pw$Message.iblg[44] = 1477619918;
        pw$Message.iblg[45] = 230799226;
        pw$Message.iblg[46] = -379771630;
        pw$Message.iblg[47] = 226472112;
        pw$Message.iblg[48] = -1623084289;
        pw$Message.iblg[49] = 412864349;
        pw$Message.iblg[50] = -266129705;
        pw$Message.iblg[51] = 463642829;
        pw$Message.iblg[52] = 502709276;
        pw$Message.iblg[53] = 351755828;
        pw$Message.iblg[54] = 1580280321;
        pw$Message.iblg[55] = 634257674;
        pw$Message.iblg[56] = 2029966;
        pw$Message.iblg[57] = 1146632887;
        pw$Message.iblg[58] = 1023277304;
        pw$Message.iblg[59] = -1140090094;
        pw$Message.iblg[60] = 1617470857;
        pw$Message.iblg[61] = -1752847721;
        pw$Message.iblg[62] = 1305672635;
        pw$Message.iblg[63] = -648248985;
        pw$Message.iblg[64] = 1643274228;
        pw$Message.iblg[65] = 232426739;
        pw$Message.iblg[66] = 856156341;
        pw$Message.iblg[67] = -1797683024;
        pw$Message.iblg[68] = -716429050;
        pw$Message.iblg[69] = 1093053672;
    }

    /*
     * Enabled aggressive block sorting
     */
    public long timestamp() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = pj - pw$Message.iblh("ibpe", iblm(int ), (int)37)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == pw$Message.iblh("ibpf", ible(int ), (int)60)) break;
            object = pw$Message.iblh("ibpg", ible(int ), (int)61);
        }
        boolean bl3 = c;
        Object object = pj;
        block5: while (true) {
            switch ((int)object) {
                case -1966903413: {
                    break block5;
                }
                case 250921680: {
                    object = pw$Message.iblh("ibpi", iblm(int ), (int)39) - pw$Message.iblh("ibph", iblm(int ), (int)38);
                    continue block5;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object2;
            if ((object2 = (l3 = pj - pw$Message.iblh("ibpj", iblm(int ), (int)40)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object2 == pw$Message.iblh("ibpk", ible(int ), (int)62)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object2 = pw$Message.iblh("ibpl", ible(int ), (int)63);
        }
        if (bl2) return (long)pw$Message.iblh("ibpm", iblm(int ), (int)41);
        if (bl2) return (long)pw$Message.iblh("ibpm", iblm(int ), (int)41);
        while (true) {
            long l4;
            Object object3;
            if ((object3 = (l4 = pj - pw$Message.iblh("ibpn", iblm(int ), (int)42)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object3 == pw$Message.iblh("ibpo", ible(int ), (int)64)) {
                return this.timestamp;
            }
            object3 = pw$Message.iblh("ibpp", ible(int ), (int)65);
        }
    }

    private static /* synthetic */ int ible(int n2) {
        return iblf[n2] ^ iblg[n2];
    }

    public static /* synthetic */ CallSite iblh(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String role() {
        v0 /* !! */  = pw$Message.pj;
        if (true) ** GOTO lbl5
        block14: while (true) {
            v0 /* !! */  = (long)(pw$Message.iblh("ibnm", iblm(int ), (int)19) - pw$Message.iblh("ibnl", iblm(int ), (int)18));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1966903413: {
                    break block14;
                }
                case 696244533: {
                    continue block14;
                }
            }
            break;
        }
        var3_1 = pw$Message.c;
        v1 /* !! */  = pw$Message.pj;
        if (true) ** GOTO lbl15
        block15: while (true) {
            v1 /* !! */  = (long)(pw$Message.iblh("ibno", iblm(int ), (int)21) - pw$Message.iblh("ibnn", iblm(int ), (int)20));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1966903413: {
                    break block15;
                }
                case -1019831124: {
                    continue block15;
                }
            }
            break;
        }
        var2_2 /* !! */  = pw$Message.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = pw$Message.pj - pw$Message.iblh("ibnp", iblm(int ), (int)22)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == pw$Message.iblh("ibnq", ible(int ), (int)34)) break;
            v2 /* !! */  = (long)pw$Message.iblh("ibnr", ible(int ), (int)35);
        }
        var1_3 = pw$Message.a;
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
                    if ((v3 /* !! */  = (cfr_temp_1 = pw$Message.pj - pw$Message.iblh("ibns", iblm(int ), (int)23)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == pw$Message.iblh("ibnt", ible(int ), (int)36)) break;
                    v3 /* !! */  = (long)pw$Message.iblh("ibnu", ible(int ), (int)37);
                }
                return this.role;
            }
            case 0: {
                var2_2 /* !! */  = (int)pw$Message.iblh("ibnv", ible(int ), (int)38);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl52
            }
            case 1: {
                var2_2 /* !! */  = (int)pw$Message.iblh("ibnw", ible(int ), (int)39);
                if (!var3_1) break;
                throw null;
            }
lbl52:
            // 2 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)pw$Message.iblh("ibnx", ible(int ), (int)40);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)pw$Message.iblh("ibny", ible(int ), (int)41);
        } while (!var3_1);
        throw null;
    }
}

