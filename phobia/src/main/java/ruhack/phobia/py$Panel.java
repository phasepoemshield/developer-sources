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
import ruhack.phobia.mj;

record py$Panel(String name, mj category) {
    private static int[] ccu;
    private static int[] cct;
    static final long k = -4058341851882688227L;
    private static long[] cda;
    private final String name;
    private static long[] cdb;
    public static final int b;
    public static final boolean c;
    private final mj category;
    public static final boolean a;

    private static /* synthetic */ long ccz(int n2) {
        return cda[n2] ^ cdb[n2];
    }

    static {
        cct = new int[39];
        ccu = new int[39];
        py$Panel.cgf();
        py$Panel.cgg();
        cda = new long[45];
        cdb = new long[45];
        py$Panel.cgh();
        py$Panel.cgi();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        v0 /* !! */  = py$Panel.k;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(v1 - py$Panel.ccv("cds", ccz(int ), (int)12));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -291060974: {
                    v1 = py$Panel.ccv("cdt", ccz(int ), (int)13);
                    continue block15;
                }
                case 1957422907: {
                    v1 = py$Panel.ccv("cdu", ccz(int ), (int)14);
                    continue block15;
                }
                case 1970172189: {
                    break block15;
                }
            }
            break;
        }
        var3_1 = py$Panel.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = py$Panel.k - py$Panel.ccv("cdv", ccz(int ), (int)15)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == py$Panel.ccv("cdw", ccs(int ), (int)7)) break;
            v2 /* !! */  = (long)py$Panel.ccv("cdx", ccs(int ), (int)8);
        }
        var2_2 /* !! */  = py$Panel.b;
        v3 /* !! */  = py$Panel.k;
        if (true) ** GOTO lbl26
        block17: while (true) {
            v3 /* !! */  = (long)(py$Panel.ccv("cdz", ccz(int ), (int)17) - py$Panel.ccv("cdy", ccz(int ), (int)16));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1195730426: {
                    continue block17;
                }
                case 1970172189: {
                    break block17;
                }
            }
            break;
        }
        var1_3 = py$Panel.a;
        if (var3_1) {
            throw null;
            return (int)py$Panel.ccv("cea", ccs(int ), (int)9);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = py$Panel.k - py$Panel.ccv("ceb", ccz(int ), (int)18)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == py$Panel.ccv("cec", ccs(int ), (int)10)) break;
                    v4 /* !! */  = (long)py$Panel.ccv("ced", ccs(int ), (int)11);
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{py$Panel.class, "name;category", "name", "category"}, this);
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)py$Panel.ccv("cee", ccs(int ), (int)12);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)py$Panel.ccv("cef", ccs(int ), (int)13);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)py$Panel.ccv("ceg", ccs(int ), (int)14);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)py$Panel.ccv("ceh", ccs(int ), (int)15);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void cgh() {
        py$Panel.cda[0] = -4622306994339404735L;
        py$Panel.cda[1] = -5160874203254824636L;
        py$Panel.cda[2] = -8002166498721366212L;
        py$Panel.cda[3] = 1884350087440102523L;
        py$Panel.cda[4] = 1657282257910637433L;
        py$Panel.cda[5] = -458370051102622578L;
        py$Panel.cda[6] = -6911366750015381354L;
        py$Panel.cda[7] = -8372333101377191040L;
        py$Panel.cda[8] = -1820187306686769676L;
        py$Panel.cda[9] = -2714491840295621363L;
        py$Panel.cda[10] = 662146459819573874L;
        py$Panel.cda[11] = -7019293544258801121L;
        py$Panel.cda[12] = -5279477345927762374L;
        py$Panel.cda[13] = 4100541986548640224L;
        py$Panel.cda[14] = -6681445534246517737L;
        py$Panel.cda[15] = -5291178555497354657L;
        py$Panel.cda[16] = -8163602802578880731L;
        py$Panel.cda[17] = 5618510012157046622L;
        py$Panel.cda[18] = -4163729962632779634L;
        py$Panel.cda[19] = 4681557134275950738L;
        py$Panel.cda[20] = 1096890625886433221L;
        py$Panel.cda[21] = -278685816690063638L;
        py$Panel.cda[22] = 4704148213264558394L;
        py$Panel.cda[23] = 3133350891953438728L;
        py$Panel.cda[24] = -7114791720229704542L;
        py$Panel.cda[25] = -4383567205632267782L;
        py$Panel.cda[26] = 895420338866646569L;
        py$Panel.cda[27] = -4972645516986331933L;
        py$Panel.cda[28] = -7663953721554330176L;
        py$Panel.cda[29] = -6407093076106630735L;
        py$Panel.cda[30] = -8173739165466240147L;
        py$Panel.cda[31] = -7637543529761847621L;
        py$Panel.cda[32] = 6968495854826560104L;
        py$Panel.cda[33] = -4400873714826073875L;
        py$Panel.cda[34] = 8597238153350894812L;
        py$Panel.cda[35] = -2001236006213908468L;
        py$Panel.cda[36] = 3306656795323030589L;
        py$Panel.cda[37] = -6148542002859715002L;
        py$Panel.cda[38] = -531496609499082560L;
        py$Panel.cda[39] = 6781888667990481303L;
        py$Panel.cda[40] = 8357644577153739154L;
        py$Panel.cda[41] = 684192508235653600L;
        py$Panel.cda[42] = -1695703653971612731L;
        py$Panel.cda[43] = -2721977142745443171L;
        py$Panel.cda[44] = 2123238604424859382L;
    }

    public static /* synthetic */ CallSite ccv(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private py$Panel(String var1_1, mj var2_2) {
        var4_3 /* !! */  = py$Panel.b;
        super();
        this.name = var1_1;
        this.category = var2_2;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
            case 0: {
                ** GOTO lbl13
            }
            case 2: {
                var4_3 /* !! */  = (int)py$Panel.ccv("ccy", ccs(int ), (int)2);
lbl13:
                // 2 sources

                var4_3 /* !! */  = (int)py$Panel.ccv("ccw", ccs(int ), (int)0);
            }
            case 1: 
        }
        while (true) {
            var4_3 /* !! */  = (int)py$Panel.ccv("ccx", ccs(int ), (int)1);
        }
    }

    private static /* synthetic */ void cgi() {
        py$Panel.cdb[0] = -779995030139694309L;
        py$Panel.cdb[1] = -5798241897610061020L;
        py$Panel.cdb[2] = 2339838446116163703L;
        py$Panel.cdb[3] = -3923346493322245326L;
        py$Panel.cdb[4] = -6755261154670018011L;
        py$Panel.cdb[5] = -5440269936145172330L;
        py$Panel.cdb[6] = -6113909069849147649L;
        py$Panel.cdb[7] = 2744699720799296153L;
        py$Panel.cdb[8] = 8246203219753414127L;
        py$Panel.cdb[9] = 8284021865948900572L;
        py$Panel.cdb[10] = 2868858363830960274L;
        py$Panel.cdb[11] = -2151449212459961185L;
        py$Panel.cdb[12] = -7292743182131411859L;
        py$Panel.cdb[13] = 8405061386744610560L;
        py$Panel.cdb[14] = -1133384324072571491L;
        py$Panel.cdb[15] = 3636877780227598093L;
        py$Panel.cdb[16] = 5835546109993021372L;
        py$Panel.cdb[17] = -2744549003278153884L;
        py$Panel.cdb[18] = -2682559790349859001L;
        py$Panel.cdb[19] = -2955233070692223260L;
        py$Panel.cdb[20] = -1526080640497862275L;
        py$Panel.cdb[21] = -2123701686787978474L;
        py$Panel.cdb[22] = 8741968168568177460L;
        py$Panel.cdb[23] = 7585204921383903725L;
        py$Panel.cdb[24] = -3181613392165305359L;
        py$Panel.cdb[25] = -8520806288781583623L;
        py$Panel.cdb[26] = 27142301256148561L;
        py$Panel.cdb[27] = -7774033410185109655L;
        py$Panel.cdb[28] = 5689324018904579802L;
        py$Panel.cdb[29] = 3684225680521326118L;
        py$Panel.cdb[30] = -981798131090403674L;
        py$Panel.cdb[31] = -5174632607271956913L;
        py$Panel.cdb[32] = 3056853713528658124L;
        py$Panel.cdb[33] = 3532223441123819917L;
        py$Panel.cdb[34] = -2500870395802081319L;
        py$Panel.cdb[35] = 3873135596042688270L;
        py$Panel.cdb[36] = -3422302314830101194L;
        py$Panel.cdb[37] = -2212949055303469598L;
        py$Panel.cdb[38] = -2454959704370721406L;
        py$Panel.cdb[39] = -3506961629842771238L;
        py$Panel.cdb[40] = 3900126707809277590L;
        py$Panel.cdb[41] = 8359844384977274006L;
        py$Panel.cdb[42] = -8301600646388823220L;
        py$Panel.cdb[43] = 6824238786728900942L;
        py$Panel.cdb[44] = -7746343039535297898L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public mj category() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = py$Panel.k - py$Panel.ccv("cfo", ccz(int ), (int)38)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == py$Panel.ccv("cfp", ccs(int ), (int)29)) break;
            v0 /* !! */  = (long)py$Panel.ccv("cfq", ccs(int ), (int)30);
        }
        var3_1 = py$Panel.c;
        v1 /* !! */  = py$Panel.k;
        if (true) ** GOTO lbl12
        block13: while (true) {
            v1 /* !! */  = (long)(v2 - py$Panel.ccv("cfr", ccz(int ), (int)39));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1645306015: {
                    v2 = py$Panel.ccv("cfs", ccz(int ), (int)40);
                    continue block13;
                }
                case 189953603: {
                    v2 = py$Panel.ccv("cft", ccz(int ), (int)41);
                    continue block13;
                }
                case 746664811: {
                    v2 = py$Panel.ccv("cfu", ccz(int ), (int)42);
                    continue block13;
                }
                case 1970172189: {
                    break block13;
                }
            }
            break;
        }
        var2_2 /* !! */  = py$Panel.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = py$Panel.k - py$Panel.ccv("cfv", ccz(int ), (int)43)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == py$Panel.ccv("cfw", ccs(int ), (int)31)) break;
            v3 /* !! */  = (long)py$Panel.ccv("cfx", ccs(int ), (int)32);
        }
        var1_3 = py$Panel.a;
        if (var3_1) {
            throw null;
lbl34:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = py$Panel.k - py$Panel.ccv("cfy", ccz(int ), (int)44)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == py$Panel.ccv("cfz", ccs(int ), (int)33)) break;
                    v4 /* !! */  = (long)py$Panel.ccv("cga", ccs(int ), (int)34);
                }
                return this.category;
            }
lbl48:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)py$Panel.ccv("cgb", ccs(int ), (int)35);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)py$Panel.ccv("cgc", ccs(int ), (int)36);
                if (!var3_1) ** GOTO lbl48
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)py$Panel.ccv("cgd", ccs(int ), (int)37);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)py$Panel.ccv("cge", ccs(int ), (int)38);
        ** while (!var3_1)
lbl64:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        v0 /* !! */  = py$Panel.k;
        if (true) ** GOTO lbl5
        block26: while (true) {
            v0 /* !! */  = (long)(v1 - py$Panel.ccv("cdc", ccz(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1338087322: {
                    v1 = py$Panel.ccv("cdd", ccz(int ), (int)1);
                    continue block26;
                }
                case -869387914: {
                    v1 = py$Panel.ccv("cde", ccz(int ), (int)2);
                    continue block26;
                }
                case -855878670: {
                    v1 = py$Panel.ccv("cdf", ccz(int ), (int)3);
                    continue block26;
                }
                case 1970172189: {
                    break block26;
                }
            }
            break;
        }
        var3_1 = py$Panel.c;
        v2 /* !! */  = py$Panel.k;
        if (true) ** GOTO lbl22
        block27: while (true) {
            v2 /* !! */  = (long)(py$Panel.ccv("cdh", ccz(int ), (int)5) - py$Panel.ccv("cdg", ccz(int ), (int)4));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 1069274145: {
                    continue block27;
                }
                case 1970172189: {
                    break block27;
                }
            }
            break;
        }
        var2_2 /* !! */  = py$Panel.b;
        v3 /* !! */  = py$Panel.k;
        if (true) ** GOTO lbl32
        block28: while (true) {
            v3 /* !! */  = (long)(v4 - py$Panel.ccv("cdi", ccz(int ), (int)6));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 153923651: {
                    v4 = py$Panel.ccv("cdj", ccz(int ), (int)7);
                    continue block28;
                }
                case 209220632: {
                    v4 = py$Panel.ccv("cdk", ccz(int ), (int)8);
                    continue block28;
                }
                case 220579422: {
                    v4 = py$Panel.ccv("cdl", ccz(int ), (int)9);
                    continue block28;
                }
                case 1970172189: {
                    break block28;
                }
            }
            break;
        }
        var1_3 = py$Panel.a;
        if (var3_1) {
            throw null;
lbl47:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl50:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block16 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v5 /* !! */  = py$Panel.k;
                if (true) ** GOTO lbl57
                block30: while (true) {
                    v5 /* !! */  = (long)(py$Panel.ccv("cdn", ccz(int ), (int)11) - py$Panel.ccv("cdm", ccz(int ), (int)10));
lbl57:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 1213562548: {
                            continue block30;
                        }
                        case 1970172189: {
                            break block30;
                        }
                    }
                    break;
                }
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{py$Panel.class, "name;category", "name", "category"}, this);
            }
lbl63:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)py$Panel.ccv("cdo", ccs(int ), (int)3);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)py$Panel.ccv("cdp", ccs(int ), (int)4);
                if (!var3_1) ** GOTO lbl63
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)py$Panel.ccv("cdq", ccs(int ), (int)5);
                    if (!var3_1) break block16;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)py$Panel.ccv("cdr", ccs(int ), (int)6);
        ** while (!var3_1)
lbl79:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String name() {
        v0 /* !! */  = py$Panel.k;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(py$Panel.ccv("cez", ccz(int ), (int)29) - py$Panel.ccv("cey", ccz(int ), (int)28));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1752846230: {
                    continue block15;
                }
                case 1970172189: {
                    break block15;
                }
            }
            break;
        }
        var3_1 = py$Panel.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = py$Panel.k - py$Panel.ccv("cfa", ccz(int ), (int)30)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == py$Panel.ccv("cfb", ccs(int ), (int)23)) break;
            v1 /* !! */  = (long)py$Panel.ccv("cfc", ccs(int ), (int)24);
        }
        var2_2 = py$Panel.b;
        v2 /* !! */  = py$Panel.k;
        if (true) ** GOTO lbl22
        block17: while (true) {
            v2 /* !! */  = (long)(v3 - py$Panel.ccv("cfd", ccz(int ), (int)31));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1331859777: {
                    v3 = py$Panel.ccv("cfe", ccz(int ), (int)32);
                    continue block17;
                }
                case 121041634: {
                    v3 = py$Panel.ccv("cff", ccz(int ), (int)33);
                    continue block17;
                }
                case 301921205: {
                    v3 = py$Panel.ccv("cfg", ccz(int ), (int)34);
                    continue block17;
                }
                case 1970172189: {
                    break block17;
                }
            }
            break;
        }
        var1_3 = py$Panel.a;
        if (var3_1) {
            throw null;
lbl37:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl40:
        // 1 sources

        v4 /* !! */  = py$Panel.k;
        if (true) ** GOTO lbl44
        block19: while (true) {
            v4 /* !! */  = (long)(v5 - py$Panel.ccv("cfh", ccz(int ), (int)35));
lbl44:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -632741375: {
                    v5 = py$Panel.ccv("cfi", ccz(int ), (int)36);
                    continue block19;
                }
                case 1185806405: {
                    v5 = py$Panel.ccv("cfj", ccz(int ), (int)37);
                    continue block19;
                }
                case 1970172189: {
                    break block19;
                }
            }
            break;
        }
        return this.name;
    }

    private static /* synthetic */ int ccs(int n2) {
        return cct[n2] ^ ccu[n2];
    }

    private static /* synthetic */ void cgf() {
        py$Panel.cct[0] = 1542189793;
        py$Panel.cct[1] = -1646451623;
        py$Panel.cct[2] = 1312619639;
        py$Panel.cct[3] = -1577638727;
        py$Panel.cct[4] = -1025993705;
        py$Panel.cct[5] = -1780862471;
        py$Panel.cct[6] = -83012033;
        py$Panel.cct[7] = 280474979;
        py$Panel.cct[8] = 1831302919;
        py$Panel.cct[9] = -364737475;
        py$Panel.cct[10] = 1204769620;
        py$Panel.cct[11] = 269360051;
        py$Panel.cct[12] = 45928852;
        py$Panel.cct[13] = 1427571543;
        py$Panel.cct[14] = -532170057;
        py$Panel.cct[15] = 1990455981;
        py$Panel.cct[16] = -1936328319;
        py$Panel.cct[17] = 1327179218;
        py$Panel.cct[18] = -863902713;
        py$Panel.cct[19] = -1358957211;
        py$Panel.cct[20] = 893961998;
        py$Panel.cct[21] = 1242638270;
        py$Panel.cct[22] = -1288213781;
        py$Panel.cct[23] = 97256774;
        py$Panel.cct[24] = 1161245417;
        py$Panel.cct[25] = -775495965;
        py$Panel.cct[26] = 1120732593;
        py$Panel.cct[27] = -1541215486;
        py$Panel.cct[28] = -2129298152;
        py$Panel.cct[29] = -843558394;
        py$Panel.cct[30] = 1282807647;
        py$Panel.cct[31] = 1550824741;
        py$Panel.cct[32] = 1296194754;
        py$Panel.cct[33] = -1954155870;
        py$Panel.cct[34] = 656049598;
        py$Panel.cct[35] = 1154249514;
        py$Panel.cct[36] = -1500364668;
        py$Panel.cct[37] = 729371142;
        py$Panel.cct[38] = 1782958640;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public final boolean equals(Object object) {
        boolean bl2;
        Object object2 = k;
        boolean bl3 = true;
        block14: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object2 = callSite - py$Panel.ccv("cei", ccz(int ), (int)19);
            }
            switch ((int)object2) {
                case -1659215368: {
                    callSite = py$Panel.ccv("cej", ccz(int ), (int)20);
                    continue block14;
                }
                case 823396980: {
                    callSite = py$Panel.ccv("cek", ccz(int ), (int)21);
                    continue block14;
                }
                case 1970172189: {
                    break block14;
                }
            }
            break;
        }
        boolean bl4 = c;
        Object object3 = k;
        block15: while (true) {
            switch ((int)object3) {
                case -947420920: {
                    object3 = py$Panel.ccv("cem", ccz(int ), (int)23) - py$Panel.ccv("cel", ccz(int ), (int)22);
                    continue block15;
                }
                case 1970172189: {
                    break block15;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object4;
            if ((object4 = (l2 = k - py$Panel.ccv("cen", ccz(int ), (int)24)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == py$Panel.ccv("ceo", ccs(int ), (int)16)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object4 = py$Panel.ccv("cep", ccs(int ), (int)17);
        }
        if (bl2) return (boolean)py$Panel.ccv("ceq", ccs(int ), (int)18);
        if (bl2) return (boolean)py$Panel.ccv("ceq", ccs(int ), (int)18);
        Object object5 = k;
        boolean bl5 = true;
        block17: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object5 = callSite - py$Panel.ccv("cer", ccz(int ), (int)25);
            }
            switch ((int)object5) {
                case -36801974: {
                    callSite = py$Panel.ccv("ces", ccz(int ), (int)26);
                    continue block17;
                }
                case 1196211524: {
                    callSite = py$Panel.ccv("cet", ccz(int ), (int)27);
                    continue block17;
                }
                case 1970172189: {
                    return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{py$Panel.class, "name;category", "name", "category"}, this, object);
                }
            }
            break;
        }
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{py$Panel.class, "name;category", "name", "category"}, this, object);
    }

    private static /* synthetic */ void cgg() {
        py$Panel.ccu[0] = 1542189792;
        py$Panel.ccu[1] = -1646451623;
        py$Panel.ccu[2] = 1312619637;
        py$Panel.ccu[3] = -1577638726;
        py$Panel.ccu[4] = -1025993705;
        py$Panel.ccu[5] = -1780862469;
        py$Panel.ccu[6] = -83012033;
        py$Panel.ccu[7] = 280474978;
        py$Panel.ccu[8] = 901511027;
        py$Panel.ccu[9] = -2115122905;
        py$Panel.ccu[10] = -1204769621;
        py$Panel.ccu[11] = 1939070234;
        py$Panel.ccu[12] = 45928852;
        py$Panel.ccu[13] = 1427571542;
        py$Panel.ccu[14] = -532170060;
        py$Panel.ccu[15] = 1990455983;
        py$Panel.ccu[16] = 1936328318;
        py$Panel.ccu[17] = 4309175;
        py$Panel.ccu[18] = -863902713;
        py$Panel.ccu[19] = -1358957209;
        py$Panel.ccu[20] = 893961997;
        py$Panel.ccu[21] = 1242638269;
        py$Panel.ccu[22] = -1288213783;
        py$Panel.ccu[23] = -97256775;
        py$Panel.ccu[24] = 1632342118;
        py$Panel.ccu[25] = -775495968;
        py$Panel.ccu[26] = 1120732592;
        py$Panel.ccu[27] = -1541215486;
        py$Panel.ccu[28] = -2129298151;
        py$Panel.ccu[29] = 843558393;
        py$Panel.ccu[30] = -1910957654;
        py$Panel.ccu[31] = 1550824740;
        py$Panel.ccu[32] = 1402408015;
        py$Panel.ccu[33] = -1954155869;
        py$Panel.ccu[34] = -1709555179;
        py$Panel.ccu[35] = 1154249512;
        py$Panel.ccu[36] = -1500364668;
        py$Panel.ccu[37] = 729371140;
        py$Panel.ccu[38] = 1782958642;
    }
}

