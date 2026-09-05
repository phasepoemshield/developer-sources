/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

final class jr$TagTransform {
    private static long[] dkbd;
    private static int[] dkbj;
    private float scale;
    private float anchorX;
    private static int[] dkbi;
    public static final boolean c;
    static final long hn = -3445765270024038789L;
    public static final boolean a;
    public static final int b;
    private static long[] dkbe;
    private float anchorY;

    private static /* synthetic */ void dkey() {
        jr$TagTransform.dkbd[0] = 1397467049774828044L;
        jr$TagTransform.dkbd[1] = -6115761462482692676L;
        jr$TagTransform.dkbd[2] = -5210209732967264826L;
        jr$TagTransform.dkbd[3] = -4083912410796716209L;
        jr$TagTransform.dkbd[4] = -5242315137270659138L;
        jr$TagTransform.dkbd[5] = 2297594149554440657L;
        jr$TagTransform.dkbd[6] = -6377885539555359057L;
        jr$TagTransform.dkbd[7] = -5668332161594944415L;
        jr$TagTransform.dkbd[8] = -4359629847673252339L;
        jr$TagTransform.dkbd[9] = 6040351483992218015L;
        jr$TagTransform.dkbd[10] = 7451366130022691936L;
        jr$TagTransform.dkbd[11] = -5802501069940943921L;
        jr$TagTransform.dkbd[12] = -1914145397702614817L;
        jr$TagTransform.dkbd[13] = 9137880703229041827L;
        jr$TagTransform.dkbd[14] = 6955714578989140426L;
        jr$TagTransform.dkbd[15] = 5356800103168623300L;
        jr$TagTransform.dkbd[16] = 8990349378812655202L;
        jr$TagTransform.dkbd[17] = -3390119853041366398L;
        jr$TagTransform.dkbd[18] = 5836185844840851446L;
        jr$TagTransform.dkbd[19] = 4716553929627513330L;
        jr$TagTransform.dkbd[20] = -7348263981249034793L;
        jr$TagTransform.dkbd[21] = 7578168545342576395L;
        jr$TagTransform.dkbd[22] = -8242648575335932823L;
        jr$TagTransform.dkbd[23] = 6956856435597474367L;
        jr$TagTransform.dkbd[24] = 6008069807474869210L;
        jr$TagTransform.dkbd[25] = -4904538199215699015L;
        jr$TagTransform.dkbd[26] = 1387226887105936432L;
        jr$TagTransform.dkbd[27] = -6536358393303725470L;
        jr$TagTransform.dkbd[28] = -2933353254911818519L;
        jr$TagTransform.dkbd[29] = 1953126351037132172L;
        jr$TagTransform.dkbd[30] = -790427069803556077L;
        jr$TagTransform.dkbd[31] = -1688516874925738278L;
        jr$TagTransform.dkbd[32] = -4314922904355369898L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    float sz(float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jr$TagTransform.hn - jr$TagTransform.dkbf("dkeg", dkbc(int ), (int)26)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jr$TagTransform.dkbf("dkeh", dkbh(int ), (int)48)) break;
            v0 /* !! */  = (long)jr$TagTransform.dkbf("dkei", dkbh(int ), (int)49);
        }
        var4_2 = jr$TagTransform.c;
        v1 /* !! */  = jr$TagTransform.hn;
        if (true) ** GOTO lbl12
        block16: while (true) {
            v1 /* !! */  = (long)(jr$TagTransform.dkbf("dkek", dkbc(int ), (int)28) - jr$TagTransform.dkbf("dkej", dkbc(int ), (int)27));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1542598073: {
                    continue block16;
                }
                case 1289148027: {
                    break block16;
                }
            }
            break;
        }
        var3_3 /* !! */  = jr$TagTransform.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = jr$TagTransform.hn - jr$TagTransform.dkbf("dkel", dkbc(int ), (int)29)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == jr$TagTransform.dkbf("dkem", dkbh(int ), (int)50)) break;
            v2 /* !! */  = (long)jr$TagTransform.dkbf("dken", dkbh(int ), (int)51);
        }
        var2_4 = jr$TagTransform.a;
        if (var4_2) {
            throw null;
lbl27:
            // 1 sources

            return (float)jr$TagTransform.dkbf("dkeo", dkct(int ), (int)52);
        }
        ** while (var2_4 || var2_4)
lbl30:
        // 1 sources

        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = jr$TagTransform.hn;
                if (true) ** GOTO lbl37
                block19: while (true) {
                    v3 /* !! */  = (long)(v4 - jr$TagTransform.dkbf("dkep", dkbc(int ), (int)30));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -579290132: {
                            v4 = jr$TagTransform.dkbf("dkeq", dkbc(int ), (int)31);
                            continue block19;
                        }
                        case 1289148027: {
                            break block19;
                        }
                        case 2138284776: {
                            v4 = jr$TagTransform.dkbf("dker", dkbc(int ), (int)32);
                            continue block19;
                        }
                    }
                    break;
                }
                return var1_1 * this.scale;
            }
            case 0: {
                var3_3 /* !! */  = (int)jr$TagTransform.dkbf("dkes", dkbh(int ), (int)53);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl56
            }
lbl52:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)jr$TagTransform.dkbf("dket", dkbh(int ), (int)54);
                if (!var4_2) break;
                throw null;
            }
lbl56:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)jr$TagTransform.dkbf("dkeu", dkbh(int ), (int)55);
                if (!var4_2) ** GOTO lbl52
                throw null;
            }
            case 3: 
        }
        do {
            var3_3 /* !! */  = (int)jr$TagTransform.dkbf("dkev", dkbh(int ), (int)56);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ float dkct(int n2) {
        return Float.intBitsToFloat(dkbi[n2] ^ dkbj[n2]);
    }

    static {
        dkbi = new int[57];
        dkbj = new int[57];
        jr$TagTransform.dkew();
        jr$TagTransform.dkex();
        dkbd = new long[33];
        dkbe = new long[33];
        jr$TagTransform.dkey();
        jr$TagTransform.dkez();
    }

    private static /* synthetic */ void dkew() {
        jr$TagTransform.dkbi[0] = -2043544605;
        jr$TagTransform.dkbi[1] = -1578172048;
        jr$TagTransform.dkbi[2] = -1132323973;
        jr$TagTransform.dkbi[3] = -564162206;
        jr$TagTransform.dkbi[4] = -19036412;
        jr$TagTransform.dkbi[5] = 1178273912;
        jr$TagTransform.dkbi[6] = -1196944900;
        jr$TagTransform.dkbi[7] = -62045248;
        jr$TagTransform.dkbi[8] = -1948954199;
        jr$TagTransform.dkbi[9] = 348284621;
        jr$TagTransform.dkbi[10] = -353268497;
        jr$TagTransform.dkbi[11] = 1625320500;
        jr$TagTransform.dkbi[12] = 675364895;
        jr$TagTransform.dkbi[13] = 1698387069;
        jr$TagTransform.dkbi[14] = 2100802061;
        jr$TagTransform.dkbi[15] = 1553748588;
        jr$TagTransform.dkbi[16] = -95563166;
        jr$TagTransform.dkbi[17] = -1069578933;
        jr$TagTransform.dkbi[18] = 788471444;
        jr$TagTransform.dkbi[19] = 388926101;
        jr$TagTransform.dkbi[20] = 1629797057;
        jr$TagTransform.dkbi[21] = 487828222;
        jr$TagTransform.dkbi[22] = 1890640321;
        jr$TagTransform.dkbi[23] = -1831946050;
        jr$TagTransform.dkbi[24] = -1256818546;
        jr$TagTransform.dkbi[25] = 125516026;
        jr$TagTransform.dkbi[26] = 1261678931;
        jr$TagTransform.dkbi[27] = 1480099535;
        jr$TagTransform.dkbi[28] = 831685301;
        jr$TagTransform.dkbi[29] = 148379744;
        jr$TagTransform.dkbi[30] = 1266489115;
        jr$TagTransform.dkbi[31] = 1074200876;
        jr$TagTransform.dkbi[32] = -757584315;
        jr$TagTransform.dkbi[33] = -22618815;
        jr$TagTransform.dkbi[34] = -313238229;
        jr$TagTransform.dkbi[35] = -1276477668;
        jr$TagTransform.dkbi[36] = 2020170608;
        jr$TagTransform.dkbi[37] = 113556242;
        jr$TagTransform.dkbi[38] = 1617393942;
        jr$TagTransform.dkbi[39] = 526242220;
        jr$TagTransform.dkbi[40] = 1964790662;
        jr$TagTransform.dkbi[41] = 1434234916;
        jr$TagTransform.dkbi[42] = 123817022;
        jr$TagTransform.dkbi[43] = -1687523297;
        jr$TagTransform.dkbi[44] = -547271815;
        jr$TagTransform.dkbi[45] = -1302774642;
        jr$TagTransform.dkbi[46] = 1264937093;
        jr$TagTransform.dkbi[47] = 1331217316;
        jr$TagTransform.dkbi[48] = 1712319275;
        jr$TagTransform.dkbi[49] = -1018763653;
        jr$TagTransform.dkbi[50] = -1739217733;
        jr$TagTransform.dkbi[51] = 1650289704;
        jr$TagTransform.dkbi[52] = -460703850;
        jr$TagTransform.dkbi[53] = -924237236;
        jr$TagTransform.dkbi[54] = 1354335935;
        jr$TagTransform.dkbi[55] = 198288595;
        jr$TagTransform.dkbi[56] = 817405585;
    }

    private static /* synthetic */ void dkex() {
        jr$TagTransform.dkbj[0] = 2043544604;
        jr$TagTransform.dkbj[1] = 1934951329;
        jr$TagTransform.dkbj[2] = -1132323974;
        jr$TagTransform.dkbj[3] = -711987268;
        jr$TagTransform.dkbj[4] = 19036411;
        jr$TagTransform.dkbj[5] = 11891627;
        jr$TagTransform.dkbj[6] = 1196944899;
        jr$TagTransform.dkbj[7] = 1244619828;
        jr$TagTransform.dkbj[8] = 1948954198;
        jr$TagTransform.dkbj[9] = -1433478912;
        jr$TagTransform.dkbj[10] = -353268498;
        jr$TagTransform.dkbj[11] = -1216378138;
        jr$TagTransform.dkbj[12] = 675364894;
        jr$TagTransform.dkbj[13] = 1698387071;
        jr$TagTransform.dkbj[14] = 2100802062;
        jr$TagTransform.dkbj[15] = 1553748591;
        jr$TagTransform.dkbj[16] = -95563163;
        jr$TagTransform.dkbj[17] = -1069578942;
        jr$TagTransform.dkbj[18] = 788471447;
        jr$TagTransform.dkbj[19] = 388926102;
        jr$TagTransform.dkbj[20] = 1629797062;
        jr$TagTransform.dkbj[21] = 487828223;
        jr$TagTransform.dkbj[22] = -1890640322;
        jr$TagTransform.dkbj[23] = -682465933;
        jr$TagTransform.dkbj[24] = 1256818545;
        jr$TagTransform.dkbj[25] = -1923358700;
        jr$TagTransform.dkbj[26] = 1970470195;
        jr$TagTransform.dkbj[27] = -1480099536;
        jr$TagTransform.dkbj[28] = 658333368;
        jr$TagTransform.dkbj[29] = -148379745;
        jr$TagTransform.dkbj[30] = -382353320;
        jr$TagTransform.dkbj[31] = 1074200877;
        jr$TagTransform.dkbj[32] = -757584314;
        jr$TagTransform.dkbj[33] = -22618813;
        jr$TagTransform.dkbj[34] = -313238231;
        jr$TagTransform.dkbj[35] = 1276477667;
        jr$TagTransform.dkbj[36] = 142626581;
        jr$TagTransform.dkbj[37] = 966029146;
        jr$TagTransform.dkbj[38] = -1617393943;
        jr$TagTransform.dkbj[39] = -1858804763;
        jr$TagTransform.dkbj[40] = -1964790663;
        jr$TagTransform.dkbj[41] = 1415551468;
        jr$TagTransform.dkbj[42] = -123817023;
        jr$TagTransform.dkbj[43] = -439769137;
        jr$TagTransform.dkbj[44] = -547271814;
        jr$TagTransform.dkbj[45] = -1302774642;
        jr$TagTransform.dkbj[46] = 1264937094;
        jr$TagTransform.dkbj[47] = 1331217319;
        jr$TagTransform.dkbj[48] = -1712319276;
        jr$TagTransform.dkbj[49] = -1713529209;
        jr$TagTransform.dkbj[50] = 1739217732;
        jr$TagTransform.dkbj[51] = -858606089;
        jr$TagTransform.dkbj[52] = -605287769;
        jr$TagTransform.dkbj[53] = -924237234;
        jr$TagTransform.dkbj[54] = 1354335934;
        jr$TagTransform.dkbj[55] = 198288592;
        jr$TagTransform.dkbj[56] = 817405586;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    float x(float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jr$TagTransform.hn - jr$TagTransform.dkbf("dkcl", dkbc(int ), (int)6)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jr$TagTransform.dkbf("dkcm", dkbh(int ), (int)22)) break;
            v0 /* !! */  = (long)jr$TagTransform.dkbf("dkcn", dkbh(int ), (int)23);
        }
        var4_2 = jr$TagTransform.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = jr$TagTransform.hn - jr$TagTransform.dkbf("dkco", dkbc(int ), (int)7)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == jr$TagTransform.dkbf("dkcp", dkbh(int ), (int)24)) break;
            v1 /* !! */  = (long)jr$TagTransform.dkbf("dkcq", dkbh(int ), (int)25);
        }
        var3_3 /* !! */  = jr$TagTransform.b;
        v2 /* !! */  = jr$TagTransform.hn;
        if (true) ** GOTO lbl19
        block17: while (true) {
            v2 /* !! */  = (long)(jr$TagTransform.dkbf("dkcs", dkbc(int ), (int)9) - jr$TagTransform.dkbf("dkcr", dkbc(int ), (int)8));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 424390297: {
                    continue block17;
                }
                case 1289148027: {
                    break block17;
                }
            }
            break;
        }
        var2_4 = jr$TagTransform.a;
        if (var4_2) {
            throw null;
            return (float)jr$TagTransform.dkbf("dkcu", dkct(int ), (int)26);
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** continue;
                v3 /* !! */  = jr$TagTransform.hn;
                if (true) ** GOTO lbl37
                block19: while (true) {
                    v3 /* !! */  = (long)(v4 - jr$TagTransform.dkbf("dkcv", dkbc(int ), (int)10));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1430652492: {
                            v4 = jr$TagTransform.dkbf("dkcw", dkbc(int ), (int)11);
                            continue block19;
                        }
                        case 103974798: {
                            v4 = jr$TagTransform.dkbf("dkcx", dkbc(int ), (int)12);
                            continue block19;
                        }
                        case 1289148027: {
                            break block19;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = jr$TagTransform.hn - jr$TagTransform.dkbf("dkcy", dkbc(int ), (int)13)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == jr$TagTransform.dkbf("dkcz", dkbh(int ), (int)27)) break;
                    v5 /* !! */  = (long)jr$TagTransform.dkbf("dkda", dkbh(int ), (int)28);
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = jr$TagTransform.hn - jr$TagTransform.dkbf("dkdb", dkbc(int ), (int)14)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == jr$TagTransform.dkbf("dkdc", dkbh(int ), (int)29)) break;
                    v6 /* !! */  = (long)jr$TagTransform.dkbf("dkdd", dkbh(int ), (int)30);
                }
                return this.anchorX + (var1_1 - this.anchorX) * this.scale;
            }
            case 0: {
                do {
                    var3_3 /* !! */  = (int)jr$TagTransform.dkbf("dkde", dkbh(int ), (int)31);
                } while (!var4_2);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)jr$TagTransform.dkbf("dkdf", dkbh(int ), (int)32);
                    if (!var4_2) break block4;
                    throw null;
                }
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)jr$TagTransform.dkbf("dkdg", dkbh(int ), (int)33);
                } while (!var4_2);
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)jr$TagTransform.dkbf("dkdh", dkbh(int ), (int)34);
        ** while (!var4_2)
lbl77:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long dkbc(int n2) {
        return dkbd[n2] ^ dkbe[n2];
    }

    private static /* synthetic */ int dkbh(int n2) {
        return dkbi[n2] ^ dkbj[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    float y(float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jr$TagTransform.hn - jr$TagTransform.dkbf("dkdi", dkbc(int ), (int)15)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jr$TagTransform.dkbf("dkdj", dkbh(int ), (int)35)) break;
            v0 /* !! */  = (long)jr$TagTransform.dkbf("dkdk", dkbh(int ), (int)36);
        }
        var4_2 = jr$TagTransform.c;
        v1 /* !! */  = jr$TagTransform.hn;
        if (true) ** GOTO lbl12
        block18: while (true) {
            v1 /* !! */  = (long)(v2 - jr$TagTransform.dkbf("dkdl", dkbc(int ), (int)16));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1740279085: {
                    v2 = jr$TagTransform.dkbf("dkdm", dkbc(int ), (int)17);
                    continue block18;
                }
                case -1004595240: {
                    v2 = jr$TagTransform.dkbf("dkdn", dkbc(int ), (int)18);
                    continue block18;
                }
                case 1289148027: {
                    break block18;
                }
                case 1965857445: {
                    v2 = jr$TagTransform.dkbf("dkdo", dkbc(int ), (int)19);
                    continue block18;
                }
            }
            break;
        }
        var3_3 /* !! */  = jr$TagTransform.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = jr$TagTransform.hn;
                if (true) ** GOTO lbl32
                block19: while (true) {
                    v3 /* !! */  = (long)(v4 - jr$TagTransform.dkbf("dkdp", dkbc(int ), (int)20));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1950599148: {
                            v4 = jr$TagTransform.dkbf("dkdq", dkbc(int ), (int)21);
                            continue block19;
                        }
                        case -893569757: {
                            v4 = jr$TagTransform.dkbf("dkdr", dkbc(int ), (int)22);
                            continue block19;
                        }
                        case 1289148027: {
                            break block19;
                        }
                    }
                    break;
                }
                var2_4 = jr$TagTransform.a;
                if (var4_2) {
                    throw null;
                    return (float)jr$TagTransform.dkbf("dkds", dkct(int ), (int)37);
                }
                if (var2_4 || var2_4) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = jr$TagTransform.hn - jr$TagTransform.dkbf("dkdt", dkbc(int ), (int)23)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == jr$TagTransform.dkbf("dkdu", dkbh(int ), (int)38)) break;
                    v5 /* !! */  = (long)jr$TagTransform.dkbf("dkdv", dkbh(int ), (int)39);
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = jr$TagTransform.hn - jr$TagTransform.dkbf("dkdw", dkbc(int ), (int)24)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == jr$TagTransform.dkbf("dkdx", dkbh(int ), (int)40)) break;
                    v6 /* !! */  = (long)jr$TagTransform.dkbf("dkdy", dkbh(int ), (int)41);
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = jr$TagTransform.hn - jr$TagTransform.dkbf("dkdz", dkbc(int ), (int)25)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == jr$TagTransform.dkbf("dkea", dkbh(int ), (int)42)) break;
                    v7 /* !! */  = (long)jr$TagTransform.dkbf("dkeb", dkbh(int ), (int)43);
                }
                return this.anchorY + (var1_1 - this.anchorY) * this.scale;
            }
            case 0: {
                var3_3 /* !! */  = (int)jr$TagTransform.dkbf("dkec", dkbh(int ), (int)44);
                if (!var4_2) break;
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)jr$TagTransform.dkbf("dked", dkbh(int ), (int)45);
                if (!var4_2) break;
                throw null;
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)jr$TagTransform.dkbf("dkee", dkbh(int ), (int)46);
                } while (!var4_2);
                throw null;
            }
            case 3: 
        }
        do {
            var3_3 /* !! */  = (int)jr$TagTransform.dkbf("dkef", dkbh(int ), (int)47);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void dkez() {
        jr$TagTransform.dkbe[0] = -421137524654783810L;
        jr$TagTransform.dkbe[1] = 2720319486182852875L;
        jr$TagTransform.dkbe[2] = 7017315931505618805L;
        jr$TagTransform.dkbe[3] = -6456155812105613978L;
        jr$TagTransform.dkbe[4] = 5010709445495243369L;
        jr$TagTransform.dkbe[5] = -6704623284758416949L;
        jr$TagTransform.dkbe[6] = -8334033598466597937L;
        jr$TagTransform.dkbe[7] = 7829117812618965834L;
        jr$TagTransform.dkbe[8] = -6307551309882201480L;
        jr$TagTransform.dkbe[9] = -3381550343013126353L;
        jr$TagTransform.dkbe[10] = -2781427089344621475L;
        jr$TagTransform.dkbe[11] = -374965009953009694L;
        jr$TagTransform.dkbe[12] = -5208806836510540106L;
        jr$TagTransform.dkbe[13] = 8710312306263827458L;
        jr$TagTransform.dkbe[14] = 8475662505369634032L;
        jr$TagTransform.dkbe[15] = 1848314693311646319L;
        jr$TagTransform.dkbe[16] = -7071685777594481027L;
        jr$TagTransform.dkbe[17] = 5305118450630146632L;
        jr$TagTransform.dkbe[18] = 2501020487513870137L;
        jr$TagTransform.dkbe[19] = -2492005735361650065L;
        jr$TagTransform.dkbe[20] = -3820332870884832389L;
        jr$TagTransform.dkbe[21] = 6354815061078728482L;
        jr$TagTransform.dkbe[22] = 7583161983487567804L;
        jr$TagTransform.dkbe[23] = 7252804883621708264L;
        jr$TagTransform.dkbe[24] = -6739832874045398851L;
        jr$TagTransform.dkbe[25] = -5172120243414265692L;
        jr$TagTransform.dkbe[26] = 8499466588857648252L;
        jr$TagTransform.dkbe[27] = -2194418679967607706L;
        jr$TagTransform.dkbe[28] = 2908788853777248260L;
        jr$TagTransform.dkbe[29] = -1128182147389651617L;
        jr$TagTransform.dkbe[30] = -2647574568134101301L;
        jr$TagTransform.dkbe[31] = -6957942123226447230L;
        jr$TagTransform.dkbe[32] = -1636567133357040374L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private jr$TagTransform set(float var1_1, float var2_2, float var3_3) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jr$TagTransform.hn - jr$TagTransform.dkbf("dkbg", dkbc(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == jr$TagTransform.dkbf("dkbk", dkbh(int ), (int)0)) break;
            v0 /* !! */  = (long)jr$TagTransform.dkbf("dkbl", dkbh(int ), (int)1);
        }
        var6_4 = jr$TagTransform.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = jr$TagTransform.hn - jr$TagTransform.dkbf("dkbm", dkbc(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == jr$TagTransform.dkbf("dkbn", dkbh(int ), (int)2)) break;
            v1 /* !! */  = (long)jr$TagTransform.dkbf("dkbo", dkbh(int ), (int)3);
        }
        var5_5 /* !! */  = jr$TagTransform.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = jr$TagTransform.hn - jr$TagTransform.dkbf("dkbp", dkbc(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == jr$TagTransform.dkbf("dkbq", dkbh(int ), (int)4)) break;
            v2 /* !! */  = (long)jr$TagTransform.dkbf("dkbr", dkbh(int ), (int)5);
        }
        var4_6 = jr$TagTransform.a;
        if (var6_4) {
            throw null;
lbl21:
            // 4 sources

            return null;
        }
        if (var4_6 || var4_6) ** GOTO lbl21
        if (var5_5 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var5_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = jr$TagTransform.hn - jr$TagTransform.dkbf("dkbs", dkbc(int ), (int)3)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == jr$TagTransform.dkbf("dkbt", dkbh(int ), (int)6)) break;
                    v3 /* !! */  = (long)jr$TagTransform.dkbf("dkbu", dkbh(int ), (int)7);
                }
                this.anchorX = var1_1;
                if (var4_6 || var4_6) ** GOTO lbl21
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_4 = jr$TagTransform.hn - jr$TagTransform.dkbf("dkbv", dkbc(int ), (int)4)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == jr$TagTransform.dkbf("dkbw", dkbh(int ), (int)8)) break;
                    v4 /* !! */  = (long)jr$TagTransform.dkbf("dkbx", dkbh(int ), (int)9);
                }
                this.anchorY = var2_2;
                if (var4_6 || var4_6) ** GOTO lbl21
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_5 = jr$TagTransform.hn - jr$TagTransform.dkbf("dkby", dkbc(int ), (int)5)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == jr$TagTransform.dkbf("dkbz", dkbh(int ), (int)10)) break;
                    v5 /* !! */  = (long)jr$TagTransform.dkbf("dkca", dkbh(int ), (int)11);
                }
                this.scale = var3_3;
                if (var4_6 || var4_6) ** continue;
                return this;
            }
lbl49:
            // 2 sources

            case 0: {
                var5_5 /* !! */  = (int)jr$TagTransform.dkbf("dkcb", dkbh(int ), (int)12);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl59
            }
            case 1: {
                var5_5 /* !! */  = (int)jr$TagTransform.dkbf("dkcc", dkbh(int ), (int)13);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl63
            }
lbl59:
            // 3 sources

            case 2: {
                var5_5 /* !! */  = (int)jr$TagTransform.dkbf("dkcd", dkbh(int ), (int)14);
                if (!var6_4) ** GOTO lbl49
                throw null;
            }
lbl63:
            // 2 sources

            case 3: {
                var5_5 /* !! */  = (int)jr$TagTransform.dkbf("dkce", dkbh(int ), (int)15);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl73
            }
            case 4: {
                var5_5 /* !! */  = (int)jr$TagTransform.dkbf("dkcf", dkbh(int ), (int)16);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl82
            }
lbl73:
            // 2 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_5 /* !! */  = (int)jr$TagTransform.dkbf("dkcg", dkbh(int ), (int)17);
                    if (!var6_4) break block0;
                    throw null;
                }
            }
            case 6: {
                var5_5 /* !! */  = (int)jr$TagTransform.dkbf("dkch", dkbh(int ), (int)18);
                if (var6_4) {
                    throw null;
                }
            }
lbl82:
            // 4 sources

            case 7: {
                do {
                    var5_5 /* !! */  = (int)jr$TagTransform.dkbf("dkci", dkbh(int ), (int)19);
                } while (!var6_4);
                throw null;
            }
            case 8: {
                var5_5 /* !! */  = (int)jr$TagTransform.dkbf("dkcj", dkbh(int ), (int)20);
                if (!var6_4) ** GOTO lbl59
                throw null;
            }
            case 9: 
        }
        var5_5 /* !! */  = (int)jr$TagTransform.dkbf("dkck", dkbh(int ), (int)21);
        ** while (!var6_4)
lbl94:
        // 1 sources

        throw null;
    }

    private jr$TagTransform() {
    }

    public static /* synthetic */ CallSite dkbf(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }
}

