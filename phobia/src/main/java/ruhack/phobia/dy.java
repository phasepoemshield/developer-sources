/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.List;
import java.util.function.Supplier;
import ruhack.phobia.eb;
import ruhack.phobia.jx;
import ruhack.phobia.kb;
import ruhack.phobia.ke;
import ruhack.phobia.kf;
import ruhack.phobia.kg;

public final class dy {
    public final ke interfaceSettings;
    public static final int b;
    private static long[] cfej;
    private static final dy INSTANCE;
    private static final long fq = -2761755393117011104L;
    public static final boolean c;
    private static long[] cfei;
    public final kb blurEnabled;
    public final kg backgroundAlpha;
    private static int[] cfes;
    public final kg blurStrength;
    public final kf backgroundStyle;
    private static int[] cfet;
    public static final boolean a;

    public static /* synthetic */ CallSite cfek(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isNewBackground() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dy.fq - dy.cfek("cfja", cfeg(int ), (int)23)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == dy.cfek("cfjc", cfer(int ), (int)39)) break;
            v0 /* !! */  = (long)dy.cfek("cfjd", cfer(int ), (int)40);
        }
        var3_1 = dy.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = dy.fq - dy.cfek("cfjf", cfeg(int ), (int)24)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == dy.cfek("cfjg", cfer(int ), (int)41)) break;
            v1 /* !! */  = (long)dy.cfek("cfji", cfer(int ), (int)42);
        }
        var2_2 /* !! */  = dy.b;
        v2 /* !! */  = dy.fq;
        if (true) ** GOTO lbl19
        block16: while (true) {
            v2 /* !! */  = (long)(dy.cfek("cfjl", cfeg(int ), (int)26) - dy.cfek("cfjj", cfeg(int ), (int)25));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -711719968: {
                    continue block16;
                }
                case 884851552: {
                    break block16;
                }
            }
            break;
        }
        var1_3 = dy.a;
        if (var3_1) {
            throw null;
lbl27:
            // 2 sources

            return (boolean)dy.cfek("cfjm", cfer(int ), (int)43);
        }
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v3 /* !! */  = dy.fq;
                if (true) ** GOTO lbl38
                block18: while (true) {
                    v3 /* !! */  = (long)(dy.cfek("cfjs", cfeg(int ), (int)28) - dy.cfek("cfjn", cfeg(int ), (int)27));
lbl38:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 60166481: {
                            continue block18;
                        }
                        case 884851552: {
                            break block18;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = dy.fq - dy.cfek("cfjt", cfeg(int ), (int)29)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == dy.cfek("cfju", cfer(int ), (int)44)) break;
                    v4 /* !! */  = (long)dy.cfek("cfjv", cfer(int ), (int)45);
                }
                return this.backgroundStyle.isSelected("\u041d\u043e\u0432\u044b\u0439");
            }
            case 0: {
                var2_2 /* !! */  = (int)dy.cfek("cfjw", cfer(int ), (int)46);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl60
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)dy.cfek("cfjx", cfer(int ), (int)47);
                } while (!var3_1);
                throw null;
            }
lbl60:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)dy.cfek("cfkd", cfer(int ), (int)48);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)dy.cfek("cfkg", cfer(int ), (int)49);
        ** while (!var3_1)
lbl68:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public boolean isState() {
        CallSite callSite;
        boolean bl2;
        block21: {
            while (true) {
                long l2;
                Object object;
                if ((object = (l2 = fq - dy.cfek("cflc", cfeg(int ), (int)34)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
                if (object == dy.cfek("cfle", cfer(int ), (int)60)) break;
                object = dy.cfek("cflf", cfer(int ), (int)61);
            }
            boolean bl3 = c;
            while (true) {
                long l3;
                Object object;
                if ((object = (l3 = fq - dy.cfek("cflk", cfeg(int ), (int)35)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
                if (object == dy.cfek("cfll", cfer(int ), (int)62)) break;
                object = dy.cfek("cflm", cfer(int ), (int)63);
            }
            int n2 = b;
            while (true) {
                long l4;
                Object object;
                if ((object = (l4 = fq - dy.cfek("cfln", cfeg(int ), (int)36)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
                if (object == dy.cfek("cflo", cfer(int ), (int)64)) {
                    bl2 = a;
                    if (bl3) {
                        throw null;
                    }
                    break;
                }
                object = dy.cfek("cflp", cfer(int ), (int)65);
            }
            if (bl2 || bl2) return (boolean)dy.cfek("cflr", cfer(int ), (int)66);
            Object object = fq;
            boolean bl4 = true;
            block8: while (true) {
                CallSite callSite2;
                if (!bl4 || (bl4 = false) || !true) {
                    object = callSite2 - dy.cfek("cfls", cfeg(int ), (int)37);
                }
                switch ((int)object) {
                    case -2079453085: {
                        callSite2 = dy.cfek("cflu", cfeg(int ), (int)38);
                        continue block8;
                    }
                    case 560820146: {
                        callSite2 = dy.cfek("cflv", cfeg(int ), (int)39);
                        continue block8;
                    }
                    case 884851552: {
                        break block8;
                    }
                }
                break;
            }
            eb eb2 = eb.getInstance();
            if (bl2 || bl2) return (boolean)dy.cfek("cflr", cfer(int ), (int)66);
            if (eb2 != null) {
                if (bl2) return (boolean)dy.cfek("cflr", cfer(int ), (int)66);
                while (true) {
                    long l5;
                    Object object2;
                    if ((object2 = (l5 = fq - dy.cfek("cflx", cfeg(int ), (int)40)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
                    if (object2 == dy.cfek("cflz", cfer(int ), (int)67)) {
                        if (eb2.isState()) {
                            break;
                        }
                        break block21;
                    }
                    object2 = dy.cfek("cfma", cfer(int ), (int)68);
                }
                if (bl2) return (boolean)dy.cfek("cflr", cfer(int ), (int)66);
                callSite = dy.cfek("cfme", cfer(int ), (int)69);
                if (!bl3) return (boolean)callSite;
                throw null;
            }
        }
        if (bl2 || bl2) {
            return (boolean)dy.cfek("cflr", cfer(int ), (int)66);
        }
        callSite = dy.cfek("cfmf", cfer(int ), (int)70);
        return (boolean)callSite;
    }

    private static /* synthetic */ void cfoi() {
        dy.cfet[0] = -1129657426;
        dy.cfet[1] = 1087269556;
        dy.cfet[2] = -1972094741;
        dy.cfet[3] = 780571398;
        dy.cfet[4] = 1303214948;
        dy.cfet[5] = 1114576468;
        dy.cfet[6] = -1802315117;
        dy.cfet[7] = -1188159837;
        dy.cfet[8] = -1370833102;
        dy.cfet[9] = -323486099;
        dy.cfet[10] = 1375789671;
        dy.cfet[11] = -1192270881;
        dy.cfet[12] = -639857816;
        dy.cfet[13] = -621956084;
        dy.cfet[14] = -857699689;
        dy.cfet[15] = 967172326;
        dy.cfet[16] = -2009854565;
        dy.cfet[17] = -1552564732;
        dy.cfet[18] = -1706634699;
        dy.cfet[19] = 643673291;
        dy.cfet[20] = -1727915612;
        dy.cfet[21] = 2092679097;
        dy.cfet[22] = -1122331438;
        dy.cfet[23] = -1199952416;
        dy.cfet[24] = -1644174940;
        dy.cfet[25] = 2005615757;
        dy.cfet[26] = -1600345528;
        dy.cfet[27] = 1786587561;
        dy.cfet[28] = -1881906015;
        dy.cfet[29] = -427828816;
        dy.cfet[30] = -976907833;
        dy.cfet[31] = -1169086359;
        dy.cfet[32] = -1172306166;
        dy.cfet[33] = 1080361531;
        dy.cfet[34] = -663532428;
        dy.cfet[35] = 1426743062;
        dy.cfet[36] = -1836425402;
        dy.cfet[37] = 1460870956;
        dy.cfet[38] = -1354617690;
        dy.cfet[39] = 188866252;
        dy.cfet[40] = -1065451709;
        dy.cfet[41] = -125474494;
        dy.cfet[42] = 1283025955;
        dy.cfet[43] = 92940574;
        dy.cfet[44] = 1028660717;
        dy.cfet[45] = -312638;
        dy.cfet[46] = -1187120671;
        dy.cfet[47] = -1231293315;
        dy.cfet[48] = -749158611;
        dy.cfet[49] = 1463874028;
        dy.cfet[50] = -1324671084;
        dy.cfet[51] = -145073327;
        dy.cfet[52] = -6772276;
        dy.cfet[53] = -1302294810;
        dy.cfet[54] = -2086695403;
        dy.cfet[55] = 545713023;
        dy.cfet[56] = -496202862;
        dy.cfet[57] = -482732025;
        dy.cfet[58] = 1882039826;
        dy.cfet[59] = 1139877039;
        dy.cfet[60] = 1274242536;
        dy.cfet[61] = 1443839827;
        dy.cfet[62] = 505196829;
        dy.cfet[63] = -1191986843;
        dy.cfet[64] = 892144034;
        dy.cfet[65] = -1907138513;
        dy.cfet[66] = -898290221;
        dy.cfet[67] = -1426840743;
        dy.cfet[68] = 1195201282;
        dy.cfet[69] = 1802138695;
        dy.cfet[70] = -275701462;
        dy.cfet[71] = -502793945;
        dy.cfet[72] = 1714275104;
        dy.cfet[73] = 1899669424;
        dy.cfet[74] = -680057680;
        dy.cfet[75] = -2091504943;
        dy.cfet[76] = -1792414608;
        dy.cfet[77] = -652142536;
        dy.cfet[78] = -410735323;
        dy.cfet[79] = -521969647;
        dy.cfet[80] = 1060588123;
        dy.cfet[81] = 194730798;
        dy.cfet[82] = 789061931;
        dy.cfet[83] = -1075857126;
        dy.cfet[84] = 1439216089;
        dy.cfet[85] = 1699950164;
        dy.cfet[86] = 2103075458;
        dy.cfet[87] = 23797463;
        dy.cfet[88] = 469767814;
        dy.cfet[89] = 1208725283;
        dy.cfet[90] = -1702510152;
        dy.cfet[91] = -619843638;
        dy.cfet[92] = -1802951689;
        dy.cfet[93] = 925841587;
    }

    private static /* synthetic */ void cfnv() {
        dy.cfes[0] = -1129657425;
        dy.cfes[1] = 1517002761;
        dy.cfes[2] = 1972094740;
        dy.cfes[3] = 1204613340;
        dy.cfes[4] = -1303214949;
        dy.cfes[5] = 990388333;
        dy.cfes[6] = -1802315118;
        dy.cfes[7] = -1188159838;
        dy.cfes[8] = -1370833102;
        dy.cfes[9] = -323486097;
        dy.cfes[10] = 281076327;
        dy.cfes[11] = -1192270881;
        dy.cfes[12] = -639857769;
        dy.cfes[13] = -621956084;
        dy.cfes[14] = -1944024425;
        dy.cfes[15] = 967172327;
        dy.cfes[16] = -2009854581;
        dy.cfes[17] = -1552564735;
        dy.cfes[18] = -1706634697;
        dy.cfes[19] = 643673293;
        dy.cfes[20] = -1727915610;
        dy.cfes[21] = 2092679099;
        dy.cfes[22] = -1122331438;
        dy.cfes[23] = -1199952410;
        dy.cfes[24] = -1644174937;
        dy.cfes[25] = -2005615758;
        dy.cfes[26] = -1654806647;
        dy.cfes[27] = -1786587562;
        dy.cfes[28] = -2034480975;
        dy.cfes[29] = -427828815;
        dy.cfes[30] = 215813018;
        dy.cfes[31] = 1169086358;
        dy.cfes[32] = -1676643648;
        dy.cfes[33] = -1080361532;
        dy.cfes[34] = 1075392837;
        dy.cfes[35] = 1426743063;
        dy.cfes[36] = -1836425404;
        dy.cfes[37] = 1460870957;
        dy.cfes[38] = -1354617692;
        dy.cfes[39] = -188866253;
        dy.cfes[40] = 1785167124;
        dy.cfes[41] = -125474493;
        dy.cfes[42] = -573474600;
        dy.cfes[43] = 92940575;
        dy.cfes[44] = -1028660718;
        dy.cfes[45] = 1748616192;
        dy.cfes[46] = -1187120669;
        dy.cfes[47] = -1231293315;
        dy.cfes[48] = -749158611;
        dy.cfes[49] = 1463874031;
        dy.cfes[50] = 1324671083;
        dy.cfes[51] = -92383817;
        dy.cfes[52] = 6772275;
        dy.cfes[53] = 378747933;
        dy.cfes[54] = -1100457243;
        dy.cfes[55] = 532011084;
        dy.cfes[56] = -496202864;
        dy.cfes[57] = -482732028;
        dy.cfes[58] = 1882039827;
        dy.cfes[59] = 1139877039;
        dy.cfes[60] = -1274242537;
        dy.cfes[61] = -2049858148;
        dy.cfes[62] = 505196828;
        dy.cfes[63] = 942188326;
        dy.cfes[64] = -892144035;
        dy.cfes[65] = -1856937579;
        dy.cfes[66] = -898290221;
        dy.cfes[67] = 1426840742;
        dy.cfes[68] = -1225506720;
        dy.cfes[69] = 1802138694;
        dy.cfes[70] = -275701462;
        dy.cfes[71] = -502793945;
        dy.cfes[72] = 1714275106;
        dy.cfes[73] = 1899669430;
        dy.cfes[74] = -680057677;
        dy.cfes[75] = -2091504942;
        dy.cfes[76] = -1792414598;
        dy.cfes[77] = -652142532;
        dy.cfes[78] = -410735325;
        dy.cfes[79] = -521969646;
        dy.cfes[80] = 1060588113;
        dy.cfes[81] = 194730792;
        dy.cfes[82] = -789061932;
        dy.cfes[83] = -749878948;
        dy.cfes[84] = -1439216090;
        dy.cfes[85] = -267477546;
        dy.cfes[86] = -2103075459;
        dy.cfes[87] = 1091738234;
        dy.cfes[88] = 469767815;
        dy.cfes[89] = 1094533060;
        dy.cfes[90] = -1702510152;
        dy.cfes[91] = -619843639;
        dy.cfes[92] = -1802951692;
        dy.cfes[93] = 925841584;
    }

    private static /* synthetic */ int cfer(int n2) {
        return cfes[n2] ^ cfet[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$0() {
        v0 /* !! */  = dy.fq;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(v1 - dy.cfek("cfms", cfeg(int ), (int)41));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1007917139: {
                    v1 = dy.cfek("cfmt", cfeg(int ), (int)42);
                    continue block15;
                }
                case 884851552: {
                    break block15;
                }
                case 1045419242: {
                    v1 = dy.cfek("cfmu", cfeg(int ), (int)43);
                    continue block15;
                }
            }
            break;
        }
        var3_1 = dy.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = dy.fq - dy.cfek("cfmv", cfeg(int ), (int)44)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == dy.cfek("cfmx", cfer(int ), (int)82)) break;
            v2 /* !! */  = (long)dy.cfek("cfmy", cfer(int ), (int)83);
        }
        var2_2 /* !! */  = dy.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = dy.fq - dy.cfek("cfnb", cfeg(int ), (int)45)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == dy.cfek("cfnc", cfer(int ), (int)84)) break;
            v3 /* !! */  = (long)dy.cfek("cfne", cfer(int ), (int)85);
        }
        var1_3 = dy.a;
        if (var3_1) {
            throw null;
lbl31:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl31
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = dy.fq - dy.cfek("cfnf", cfeg(int ), (int)46)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == dy.cfek("cfnh", cfer(int ), (int)86)) break;
                    v4 /* !! */  = (long)dy.cfek("cfni", cfer(int ), (int)87);
                }
                v5 /* !! */  = dy.fq;
                if (true) ** GOTO lbl48
                block20: while (true) {
                    v5 /* !! */  = (long)(dy.cfek("cfnl", cfeg(int ), (int)48) - dy.cfek("cfnj", cfeg(int ), (int)47));
lbl48:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1638494430: {
                            continue block20;
                        }
                        case 884851552: {
                            break block20;
                        }
                    }
                    break;
                }
                v6 = this.blurEnabled.isValue();
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = dy.fq - dy.cfek("cfnm", cfeg(int ), (int)49)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == dy.cfek("cfnn", cfer(int ), (int)88)) break;
                    v7 /* !! */  = (long)dy.cfek("cfno", cfer(int ), (int)89);
                }
                return v6;
            }
            case 0: {
                var2_2 /* !! */  = (int)dy.cfek("cfnp", cfer(int ), (int)90);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)dy.cfek("cfnq", cfer(int ), (int)91);
                if (!var3_1) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)dy.cfek("cfns", cfer(int ), (int)92);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)dy.cfek("cfnt", cfer(int ), (int)93);
        ** while (!var3_1)
lbl77:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static dy getInstance() {
        v0 /* !! */  = dy.fq;
        if (true) ** GOTO lbl5
        block10: while (true) {
            v0 /* !! */  = (long)(dy.cfek("cfep", cfeg(int ), (int)1) - dy.cfek("cfeo", cfeg(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 884851552: {
                    break block10;
                }
                case 1083586788: {
                    continue block10;
                }
            }
            break;
        }
        var2 = dy.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = dy.fq - dy.cfek("cfeq", cfeg(int ), (int)2)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == dy.cfek("cfew", cfer(int ), (int)0)) break;
            v1 /* !! */  = (long)dy.cfek("cfex", cfer(int ), (int)1);
        }
        var1_1 /* !! */  = dy.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = dy.fq - dy.cfek("cfey", cfeg(int ), (int)3)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == dy.cfek("cfez", cfer(int ), (int)2)) break;
            v2 /* !! */  = (long)dy.cfek("cffa", cfer(int ), (int)3);
        }
        var0_2 = dy.a;
        if (var2) {
            throw null;
lbl27:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl27
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = dy.fq - dy.cfek("cffb", cfeg(int ), (int)4)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == dy.cfek("cffc", cfer(int ), (int)4)) break;
                    v3 /* !! */  = (long)dy.cfek("cffe", cfer(int ), (int)5);
                }
                return dy.INSTANCE;
            }
lbl41:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)dy.cfek("cfff", cfer(int ), (int)6);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl50
            }
            case 1: {
                var1_1 /* !! */  = (int)dy.cfek("cffg", cfer(int ), (int)7);
                if (!var2) ** GOTO lbl41
                throw null;
            }
lbl50:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)dy.cfek("cffh", cfer(int ), (int)8);
                    if (!var2) break block4;
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)dy.cfek("cffi", cfer(int ), (int)9);
        ** while (!var2)
lbl58:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private dy() {
        var2_1 /* !! */  = dy.b;
        var1_2 = dy.a;
        super();
        this.interfaceSettings = new ke("\u042d\u043b\u0435\u043c\u0435\u043d\u0442\u044b", "\u041d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u043e\u0432 \u0438\u043d\u0442\u0435\u0440\u0444\u0435\u0439\u0441\u0430").value(new String[]{"Watermark", "Info", "Notifications", "Keybinds", "Effects", "ArmorHud", "Cooldowns", "Music Player", "TargetHUD"}).selected(new String[]{"Watermark", "Info", "Notifications", "Keybinds", "Effects", "ArmorHud", "Cooldowns", "Music Player", "TargetHUD"});
        this.backgroundStyle = new kf("\u0424\u043e\u043d", "\u0421\u0442\u0438\u043b\u044c \u043e\u0441\u043d\u043e\u0432\u043d\u043e\u0433\u043e \u0444\u043e\u043d\u0430 HUD", "\u041d\u043e\u0432\u044b\u0439", new String[]{"\u0421\u0442\u0430\u0440\u044b\u0439", "\u041d\u043e\u0432\u044b\u0439"});
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.backgroundAlpha = new kg("HUD: Background Alpha", "Background opacity for HUD elements", (float)dy.cfek("cffs", cffo(int ), (int)10)).range((int)dy.cfek("cffu", cfer(int ), (int)11), (int)dy.cfek("cffv", cfer(int ), (int)12));
                this.blurEnabled = new kb("\u0420\u0430\u0437\u043c\u044b\u0442\u0438\u0435", "\u0420\u0430\u0437\u043c\u044b\u0442\u0438\u0435 \u0444\u043e\u043d\u0430 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u043e\u0432 HUD").setValue((boolean)dy.cfek("cffx", cfer(int ), (int)13));
                this.blurStrength = new kg("\u0421\u0438\u043b\u0430 \u0440\u0430\u0437\u043c\u044b\u0442\u0438\u044f", "\u0421\u0438\u043b\u0430 \u0440\u0430\u0437\u043c\u044b\u0442\u0438\u044f \u0444\u043e\u043d\u0430 HUD", (float)dy.cfek("cfga", cffo(int ), (int)14)).range((int)dy.cfek("cfgb", cfer(int ), (int)15), (int)dy.cfek("cfgc", cfer(int ), (int)16)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$0(), ()Ljava/lang/Boolean;)((dy)this));
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)dy.cfek("cfge", cfer(int ), (int)17);
                ** GOTO lbl33
            }
            case 1: {
                while (true) {
                    var2_1 /* !! */  = (int)dy.cfek("cfgg", cfer(int ), (int)18);
                }
            }
lbl20:
            // 2 sources

            case 2: {
                var2_1 /* !! */  = (int)dy.cfek("cfgi", cfer(int ), (int)19);
                ** GOTO lbl26
            }
            case 3: {
                var2_1 /* !! */  = (int)dy.cfek("cfgk", cfer(int ), (int)20);
                ** GOTO lbl29
            }
lbl26:
            // 2 sources

            case 4: {
                var2_1 /* !! */  = (int)dy.cfek("cfgm", cfer(int ), (int)21);
                ** GOTO lbl33
            }
lbl29:
            // 2 sources

            case 5: {
                while (true) {
                    var2_1 /* !! */  = (int)dy.cfek("cfgn", cfer(int ), (int)22);
                }
            }
lbl33:
            // 3 sources

            case 6: {
                var2_1 /* !! */  = (int)dy.cfek("cfgp", cfer(int ), (int)23);
                ** GOTO lbl20
            }
            case 7: 
        }
        while (true) {
            var2_1 /* !! */  = (int)dy.cfek("cfgq", cfer(int ), (int)24);
        }
    }

    private static /* synthetic */ void cfov() {
        dy.cfej[0] = -7054880217754891551L;
        dy.cfej[1] = 8928675766297493117L;
        dy.cfej[2] = -656586034802324612L;
        dy.cfej[3] = -4434902049524253862L;
        dy.cfej[4] = -2909675954260909104L;
        dy.cfej[5] = -4500385953634309088L;
        dy.cfej[6] = 5956951877516724184L;
        dy.cfej[7] = 4164087355933458253L;
        dy.cfej[8] = 4510350700993994717L;
        dy.cfej[9] = 6976036719967874118L;
        dy.cfej[10] = -4426444885323350627L;
        dy.cfej[11] = 3523336168705560023L;
        dy.cfej[12] = -1498444488506072293L;
        dy.cfej[13] = 1810093907197365084L;
        dy.cfej[14] = 6032291791072223476L;
        dy.cfej[15] = 5513561634108415570L;
        dy.cfej[16] = 8411902751162520149L;
        dy.cfej[17] = 4063210363266350014L;
        dy.cfej[18] = -9172103733580918819L;
        dy.cfej[19] = 343387750201701789L;
        dy.cfej[20] = -2754742943133202852L;
        dy.cfej[21] = 6502963849126823987L;
        dy.cfej[22] = 85620807821304214L;
        dy.cfej[23] = -3432236462994485659L;
        dy.cfej[24] = 4689761649923800747L;
        dy.cfej[25] = 1452780716401697878L;
        dy.cfej[26] = -4490013481241067558L;
        dy.cfej[27] = -9086447479269352940L;
        dy.cfej[28] = -2210896475429488130L;
        dy.cfej[29] = -4269698634388036643L;
        dy.cfej[30] = 8257063614966304434L;
        dy.cfej[31] = -4837076043592826870L;
        dy.cfej[32] = -4634044545873959959L;
        dy.cfej[33] = 4218164604879499998L;
        dy.cfej[34] = 2903969583289820973L;
        dy.cfej[35] = -2165706917735896786L;
        dy.cfej[36] = -3150222514992602648L;
        dy.cfej[37] = 1298175345577434784L;
        dy.cfej[38] = 5243933470248718217L;
        dy.cfej[39] = 5170439609726665591L;
        dy.cfej[40] = 1202568241285316859L;
        dy.cfej[41] = -2739047555859322568L;
        dy.cfej[42] = 4280591551079088025L;
        dy.cfej[43] = 8612189037213854526L;
        dy.cfej[44] = -1387133525438125464L;
        dy.cfej[45] = -6094862428499688979L;
        dy.cfej[46] = 277265553139817612L;
        dy.cfej[47] = 3741125288945870511L;
        dy.cfej[48] = 3301811325326438411L;
        dy.cfej[49] = -198418331783646212L;
    }

    private static /* synthetic */ void cfoq() {
        dy.cfei[0] = -2675198673863601843L;
        dy.cfei[1] = -1851618863948570650L;
        dy.cfei[2] = 6184626488314322155L;
        dy.cfei[3] = -2842402720012440636L;
        dy.cfei[4] = 4281141535443040360L;
        dy.cfei[5] = -8440895066247348051L;
        dy.cfei[6] = 5333375672071694862L;
        dy.cfei[7] = 4898447075160649902L;
        dy.cfei[8] = -3744423953909750431L;
        dy.cfei[9] = -7603730554170843431L;
        dy.cfei[10] = 7819293066297286991L;
        dy.cfei[11] = 1317856935040300288L;
        dy.cfei[12] = -3713094480945510218L;
        dy.cfei[13] = -5166287850878218066L;
        dy.cfei[14] = 2492612084318970902L;
        dy.cfei[15] = -7003902337969732819L;
        dy.cfei[16] = -2482254770359915063L;
        dy.cfei[17] = -4777260763148821015L;
        dy.cfei[18] = -7572877293905156839L;
        dy.cfei[19] = -8645590327942316787L;
        dy.cfei[20] = -6823442160527887739L;
        dy.cfei[21] = -4170838593373437521L;
        dy.cfei[22] = 1987818411405342594L;
        dy.cfei[23] = -7638751441711929030L;
        dy.cfei[24] = -8752393956035471557L;
        dy.cfei[25] = -5367406069729453236L;
        dy.cfei[26] = -7075254168450692564L;
        dy.cfei[27] = 2872692532649443014L;
        dy.cfei[28] = 2827775883380952270L;
        dy.cfei[29] = -6556488057676303581L;
        dy.cfei[30] = -5885785931958266071L;
        dy.cfei[31] = -8280508102003500123L;
        dy.cfei[32] = -7081208998847863601L;
        dy.cfei[33] = 9207491489624222893L;
        dy.cfei[34] = 2997137249877720992L;
        dy.cfei[35] = 5073022993118045405L;
        dy.cfei[36] = -6388058396575817101L;
        dy.cfei[37] = -7737370840605635458L;
        dy.cfei[38] = 8604043601698869677L;
        dy.cfei[39] = 7425453036715802296L;
        dy.cfei[40] = 3653271769779597538L;
        dy.cfei[41] = -1183086083598592406L;
        dy.cfei[42] = -8391488101564713450L;
        dy.cfei[43] = -9014472666630436036L;
        dy.cfei[44] = -7802985469271001313L;
        dy.cfei[45] = -7289810137066562311L;
        dy.cfei[46] = -2434076520618276570L;
        dy.cfei[47] = 2346167154822157357L;
        dy.cfei[48] = 7692175640988953785L;
        dy.cfei[49] = 3295581198208544360L;
    }

    private static /* synthetic */ float cffo(int n2) {
        return Float.intBitsToFloat(cfes[n2] ^ cfet[n2]);
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public List<jx> settings() {
        block49: {
            block51: {
                while (true) {
                    block50: {
                        if ((v0 /* !! */  = (cfr_temp_1 = dy.fq - dy.cfek("cfgs", cfeg(int ), (int)5)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v0 /* !! */  != dy.cfek("cfgu", cfer(int ), (int)25)) break block50;
                        var3_1 = dy.c;
                        v1 /* !! */  = dy.fq;
                        if (true) ** GOTO lbl13
                    }
                    v0 /* !! */  = (long)dy.cfek("cfgv", cfer(int ), (int)26);
                }
                block28: while (true) {
                    v1 /* !! */  = (long)(v2 - dy.cfek("cfgw", cfeg(int ), (int)6));
lbl13:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case -1011741432: {
                            v2 = dy.cfek("cfhc", cfeg(int ), (int)7);
                            continue block28;
                        }
                        case 594638971: {
                            v2 = dy.cfek("cfhd", cfeg(int ), (int)8);
                            continue block28;
                        }
                        case 884851552: {
                            break block28;
                        }
                    }
                    break;
                }
                var2_2 /* !! */  = dy.b;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = dy.fq - dy.cfek("cfhe", cfeg(int ), (int)9)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == dy.cfek("cfhf", cfer(int ), (int)27)) {
                        var1_3 = dy.a;
                        if (var3_1) {
                            throw null;
                        }
                        break;
                    }
                    v3 /* !! */  = (long)dy.cfek("cfhg", cfer(int ), (int)28);
                }
                if (!var1_3 && !var1_3) ** GOTO lbl40
                if (var2_2 /* !! */  == 0) return null;
                cfr_temp_0 = -2147483648;
lbl36:
                // 2 sources

                block30: while (true) {
                    switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                        default: {
                            return null;
                        }
lbl40:
                        // 1 sources

                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_3 = dy.fq - dy.cfek("cfhj", cfeg(int ), (int)10)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v4 /* !! */  != dy.cfek("cfhk", cfer(int ), (int)29)) {
                                v4 /* !! */  = (long)dy.cfek("cfhp", cfer(int ), (int)30);
                                continue;
                            }
                            ** GOTO lbl56
                            break;
                        }
                        case 0: {
                            do {
                                var2_2 /* !! */  = (int)dy.cfek("cfis", cfer(int ), (int)35);
                            } while (!var3_1);
                            throw null;
                        }
                        case 1: {
                            ** break;
                        }
                        case 3: {
                            break block49;
                        }
lbl56:
                        // 1 sources

                        while (true) {
                            if ((v5 /* !! */  = (cfr_temp_4 = dy.fq - dy.cfek("cfhq", cfeg(int ), (int)11)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v5 /* !! */  != dy.cfek("cfhr", cfer(int ), (int)31)) ** GOTO lbl62
                            v6 /* !! */  = dy.fq;
                            if (true) ** GOTO lbl66
lbl62:
                            // 1 sources

                            v5 /* !! */  = (long)dy.cfek("cfhs", cfer(int ), (int)32);
                        }
                        block34: while (true) {
                            v6 /* !! */  = (long)(v7 - dy.cfek("cfht", cfeg(int ), (int)12));
lbl66:
                            // 2 sources

                            switch ((int)v6 /* !! */ ) {
                                case -1665706363: {
                                    v7 = dy.cfek("cfhv", cfeg(int ), (int)13);
                                    continue block34;
                                }
                                case -1387781416: {
                                    v7 = dy.cfek("cfib", cfeg(int ), (int)14);
                                    continue block34;
                                }
                                case 321886562: {
                                    v7 = dy.cfek("cfid", cfeg(int ), (int)15);
                                    continue block34;
                                }
                                case 884851552: {
                                    break block34;
                                }
                            }
                            break;
                        }
                        v8 /* !! */  = dy.fq;
                        block35: while (true) {
                            switch ((int)v8 /* !! */ ) {
                                case 92129427: {
                                    v8 /* !! */  = (long)(dy.cfek("cfif", cfeg(int ), (int)17) - dy.cfek("cfie", cfeg(int ), (int)16));
                                    continue block35;
                                }
                                case 884851552: {
                                    break block35;
                                }
                            }
                            break;
                        }
                        v9 /* !! */  = dy.fq;
                        if (true) ** GOTO lbl90
                        block36: while (true) {
                            v9 /* !! */  = (long)(v10 - dy.cfek("cfig", cfeg(int ), (int)18));
lbl90:
                            // 2 sources

                            switch ((int)v9 /* !! */ ) {
                                case -1728152530: {
                                    v10 = dy.cfek("cfih", cfeg(int ), (int)19);
                                    continue block36;
                                }
                                case -1394317105: {
                                    v10 = dy.cfek("cfij", cfeg(int ), (int)20);
                                    continue block36;
                                }
                                case 884851552: {
                                    break block36;
                                }
                                case 1216037059: {
                                    v10 = dy.cfek("cfim", cfeg(int ), (int)21);
                                    continue block36;
                                }
                            }
                            break;
                        }
                        while (true) {
                            if ((v11 /* !! */  = (cfr_temp_5 = dy.fq - dy.cfek("cfio", cfeg(int ), (int)22)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v11 /* !! */  == dy.cfek("cfip", cfer(int ), (int)33)) {
                                return List.of(this.interfaceSettings, this.backgroundStyle, this.backgroundAlpha, this.blurEnabled, this.blurStrength);
                            }
                            v11 /* !! */  = (long)dy.cfek("cfir", cfer(int ), (int)34);
                        }
lbl109:
                        // 2 sources

                        while (true) {
                            var2_2 /* !! */  = (int)dy.cfek("cfit", cfer(int ), (int)36);
                            cfr_temp_0 = 2;
                            if (!var3_1) continue block30;
                            throw null;
                        }
                        case 2: 
                    }
                    break;
                }
                break block51;
                ** while (true)
            }
            var2_2 /* !! */  = (int)dy.cfek("cfiv", cfer(int ), (int)37);
            if (var3_1) {
                throw null;
            }
        }
        var2_2 /* !! */  = (int)dy.cfek("cfix", cfer(int ), (int)38);
        ** while (!var3_1)
lbl124:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float getInterfaceScale() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dy.fq - dy.cfek("cfkh", cfeg(int ), (int)30)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == dy.cfek("cfki", cfer(int ), (int)50)) break;
            v0 /* !! */  = (long)dy.cfek("cfkj", cfer(int ), (int)51);
        }
        var3_1 = dy.c;
        v1 /* !! */  = dy.fq;
        if (true) ** GOTO lbl12
        block11: while (true) {
            v1 /* !! */  = (long)(dy.cfek("cfkn", cfeg(int ), (int)32) - dy.cfek("cfkk", cfeg(int ), (int)31));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 651880835: {
                    continue block11;
                }
                case 884851552: {
                    break block11;
                }
            }
            break;
        }
        var2_2 /* !! */  = dy.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = dy.fq - dy.cfek("cfkp", cfeg(int ), (int)33)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == dy.cfek("cfkq", cfer(int ), (int)52)) break;
                    v2 /* !! */  = (long)dy.cfek("cfkr", cfer(int ), (int)53);
                }
                var1_3 = dy.a;
                if (var3_1) {
                    throw null;
                    return (float)dy.cfek("cfkt", cffo(int ), (int)54);
                }
                if (var1_3 || var1_3) ** continue;
                return (float)dy.cfek("cfku", cffo(int ), (int)55);
            }
            case 0: {
                var2_2 /* !! */  = (int)dy.cfek("cfkv", cfer(int ), (int)56);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl43
            }
lbl39:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)dy.cfek("cfkx", cfer(int ), (int)57);
                if (!var3_1) break;
                throw null;
            }
lbl43:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)dy.cfek("cfky", cfer(int ), (int)58);
                if (!var3_1) ** GOTO lbl39
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)dy.cfek("cfla", cfer(int ), (int)59);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ long cfeg(int n2) {
        return cfei[n2] ^ cfej[n2];
    }

    static {
        cfes = new int[94];
        cfet = new int[94];
        dy.cfnv();
        dy.cfoi();
        cfei = new long[50];
        cfej = new long[50];
        dy.cfoq();
        dy.cfov();
        INSTANCE = new dy();
    }
}

