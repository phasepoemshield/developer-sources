/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.od$LoopStrategy;

public class od$FiniteLoopStrategy
implements od$LoopStrategy {
    private static long[] gqa;
    private static int[] gpq;
    private int currentLoop;
    private static int[] gpr;
    private static long[] gpz;
    static final long ad = -7542568768325912878L;
    private final int loopCount;
    public static final int b;
    public static final boolean a;
    public static final boolean c;

    private static /* synthetic */ void gtb() {
        od$FiniteLoopStrategy.gqa[0] = -9048266430891755115L;
        od$FiniteLoopStrategy.gqa[1] = 105439963804135861L;
        od$FiniteLoopStrategy.gqa[2] = -6072146427942674013L;
        od$FiniteLoopStrategy.gqa[3] = -2103327992434692396L;
        od$FiniteLoopStrategy.gqa[4] = -5320629393733291929L;
        od$FiniteLoopStrategy.gqa[5] = -2409743222695967675L;
        od$FiniteLoopStrategy.gqa[6] = -834658844132146380L;
        od$FiniteLoopStrategy.gqa[7] = 6493347373036766644L;
        od$FiniteLoopStrategy.gqa[8] = 2762681685581695714L;
        od$FiniteLoopStrategy.gqa[9] = 3870100927255988630L;
        od$FiniteLoopStrategy.gqa[10] = -140366169967107066L;
        od$FiniteLoopStrategy.gqa[11] = 3760827305101219672L;
        od$FiniteLoopStrategy.gqa[12] = 3059342950448411587L;
        od$FiniteLoopStrategy.gqa[13] = 8399408343345191252L;
        od$FiniteLoopStrategy.gqa[14] = 2998308334180520978L;
        od$FiniteLoopStrategy.gqa[15] = 1144633627607490022L;
        od$FiniteLoopStrategy.gqa[16] = 2936141724780524759L;
        od$FiniteLoopStrategy.gqa[17] = 2374633075910903757L;
        od$FiniteLoopStrategy.gqa[18] = -3625338469864711191L;
        od$FiniteLoopStrategy.gqa[19] = 8340984940115031643L;
        od$FiniteLoopStrategy.gqa[20] = 631258975052546502L;
        od$FiniteLoopStrategy.gqa[21] = 5997133600054599606L;
        od$FiniteLoopStrategy.gqa[22] = 1450530545949107993L;
        od$FiniteLoopStrategy.gqa[23] = 6231734339067259206L;
        od$FiniteLoopStrategy.gqa[24] = -5033337741556890870L;
        od$FiniteLoopStrategy.gqa[25] = -4398965016336357955L;
        od$FiniteLoopStrategy.gqa[26] = 5052421970844711725L;
        od$FiniteLoopStrategy.gqa[27] = -842492543952118722L;
        od$FiniteLoopStrategy.gqa[28] = 87337734168451347L;
        od$FiniteLoopStrategy.gqa[29] = 8200124637231555268L;
        od$FiniteLoopStrategy.gqa[30] = 5207624479079823847L;
        od$FiniteLoopStrategy.gqa[31] = -7623562305718596590L;
        od$FiniteLoopStrategy.gqa[32] = -6243637362355315834L;
        od$FiniteLoopStrategy.gqa[33] = -2976741607733510489L;
        od$FiniteLoopStrategy.gqa[34] = 6581330316390417261L;
    }

    private static /* synthetic */ void gsz() {
        od$FiniteLoopStrategy.gpr[0] = 863025551;
        od$FiniteLoopStrategy.gpr[1] = 12440321;
        od$FiniteLoopStrategy.gpr[2] = 19606025;
        od$FiniteLoopStrategy.gpr[3] = 30458010;
        od$FiniteLoopStrategy.gpr[4] = 2034623923;
        od$FiniteLoopStrategy.gpr[5] = 508723981;
        od$FiniteLoopStrategy.gpr[6] = -696516667;
        od$FiniteLoopStrategy.gpr[7] = 16550314;
        od$FiniteLoopStrategy.gpr[8] = -1063773710;
        od$FiniteLoopStrategy.gpr[9] = -1263815783;
        od$FiniteLoopStrategy.gpr[10] = 492331243;
        od$FiniteLoopStrategy.gpr[11] = 1073750631;
        od$FiniteLoopStrategy.gpr[12] = -2117888827;
        od$FiniteLoopStrategy.gpr[13] = 1631635770;
        od$FiniteLoopStrategy.gpr[14] = -1266303607;
        od$FiniteLoopStrategy.gpr[15] = 1867291122;
        od$FiniteLoopStrategy.gpr[16] = -676023115;
        od$FiniteLoopStrategy.gpr[17] = -725123623;
        od$FiniteLoopStrategy.gpr[18] = -1461745129;
        od$FiniteLoopStrategy.gpr[19] = 380914561;
        od$FiniteLoopStrategy.gpr[20] = -1269483759;
        od$FiniteLoopStrategy.gpr[21] = -1229751586;
        od$FiniteLoopStrategy.gpr[22] = 642506540;
        od$FiniteLoopStrategy.gpr[23] = 230625381;
        od$FiniteLoopStrategy.gpr[24] = 1731709928;
        od$FiniteLoopStrategy.gpr[25] = 240010773;
        od$FiniteLoopStrategy.gpr[26] = -2003174363;
        od$FiniteLoopStrategy.gpr[27] = 1665957785;
        od$FiniteLoopStrategy.gpr[28] = 1676836438;
        od$FiniteLoopStrategy.gpr[29] = -501538384;
        od$FiniteLoopStrategy.gpr[30] = -1800698685;
        od$FiniteLoopStrategy.gpr[31] = 1368594992;
        od$FiniteLoopStrategy.gpr[32] = 1381764201;
        od$FiniteLoopStrategy.gpr[33] = -1039597393;
        od$FiniteLoopStrategy.gpr[34] = 1995147908;
        od$FiniteLoopStrategy.gpr[35] = 856254997;
        od$FiniteLoopStrategy.gpr[36] = 1774104013;
        od$FiniteLoopStrategy.gpr[37] = -1498459686;
        od$FiniteLoopStrategy.gpr[38] = 848720415;
        od$FiniteLoopStrategy.gpr[39] = 601797788;
        od$FiniteLoopStrategy.gpr[40] = -1708133374;
        od$FiniteLoopStrategy.gpr[41] = -1973088531;
        od$FiniteLoopStrategy.gpr[42] = -1046467776;
        od$FiniteLoopStrategy.gpr[43] = -606318172;
        od$FiniteLoopStrategy.gpr[44] = -473495691;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void onLoop() {
        v0 /* !! */  = od$FiniteLoopStrategy.ad;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(od$FiniteLoopStrategy.gps("grb", gpy(int ), (int)10) - od$FiniteLoopStrategy.gps("gra", gpy(int ), (int)9));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -570788142: {
                    break block24;
                }
                case -72624858: {
                    continue block24;
                }
            }
            break;
        }
        var3_1 = od$FiniteLoopStrategy.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = od$FiniteLoopStrategy.ad - od$FiniteLoopStrategy.gps("grc", gpy(int ), (int)11)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == od$FiniteLoopStrategy.gps("grd", gpp(int ), (int)21)) break;
            v1 /* !! */  = (long)od$FiniteLoopStrategy.gps("gre", gpp(int ), (int)22);
        }
        var2_2 /* !! */  = od$FiniteLoopStrategy.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = od$FiniteLoopStrategy.ad - od$FiniteLoopStrategy.gps("grf", gpy(int ), (int)12)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == od$FiniteLoopStrategy.gps("grg", gpp(int ), (int)23)) break;
            v2 /* !! */  = (long)od$FiniteLoopStrategy.gps("grh", gpp(int ), (int)24);
        }
        var1_3 = od$FiniteLoopStrategy.a;
        if (var3_1) {
            throw null;
lbl27:
            // 3 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl27
        v3 /* !! */  = od$FiniteLoopStrategy.ad;
        if (true) ** GOTO lbl34
        block28: while (true) {
            v3 /* !! */  = (long)(v4 - od$FiniteLoopStrategy.gps("gri", gpy(int ), (int)13));
lbl34:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -570788142: {
                    break block28;
                }
                case -494021956: {
                    v4 = od$FiniteLoopStrategy.gps("grj", gpy(int ), (int)14);
                    continue block28;
                }
                case -103927555: {
                    v4 = od$FiniteLoopStrategy.gps("grk", gpy(int ), (int)15);
                    continue block28;
                }
                case 838188957: {
                    v4 = od$FiniteLoopStrategy.gps("grl", gpy(int ), (int)16);
                    continue block28;
                }
            }
            break;
        }
        v5 = this.currentLoop + od$FiniteLoopStrategy.gps("grm", gpp(int ), (int)25);
        v6 /* !! */  = od$FiniteLoopStrategy.ad;
        if (true) ** GOTO lbl51
        block29: while (true) {
            v6 /* !! */  = (long)(v7 - od$FiniteLoopStrategy.gps("grn", gpy(int ), (int)17));
lbl51:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1891698360: {
                    v7 = od$FiniteLoopStrategy.gps("gro", gpy(int ), (int)18);
                    continue block29;
                }
                case -570788142: {
                    break block29;
                }
                case 614003995: {
                    v7 = od$FiniteLoopStrategy.gps("grp", gpy(int ), (int)19);
                    continue block29;
                }
                case 1783277718: {
                    v7 = od$FiniteLoopStrategy.gps("grq", gpy(int ), (int)20);
                    continue block29;
                }
            }
            break;
        }
        this.currentLoop = v5;
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block16 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)od$FiniteLoopStrategy.gps("grr", gpp(int ), (int)26);
                if (!var3_1) break;
                throw null;
            }
lbl75:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)od$FiniteLoopStrategy.gps("grs", gpp(int ), (int)27);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl89
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)od$FiniteLoopStrategy.gps("grt", gpp(int ), (int)28);
                    if (!var3_1) break block16;
                    throw null;
                }
            }
            case 3: {
                var2_2 /* !! */  = (int)od$FiniteLoopStrategy.gps("gru", gpp(int ), (int)29);
                if (!var3_1) ** GOTO lbl75
                throw null;
            }
lbl89:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)od$FiniteLoopStrategy.gps("grv", gpp(int ), (int)30);
                if (!var3_1) break;
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)od$FiniteLoopStrategy.gps("grw", gpp(int ), (int)31);
        ** while (!var3_1)
lbl96:
        // 1 sources

        throw null;
    }

    static {
        gpq = new int[45];
        gpr = new int[45];
        od$FiniteLoopStrategy.gsy();
        od$FiniteLoopStrategy.gsz();
        gpz = new long[35];
        gqa = new long[35];
        od$FiniteLoopStrategy.gta();
        od$FiniteLoopStrategy.gtb();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public boolean isFinished() {
        block45: {
            v0 /* !! */  = od$FiniteLoopStrategy.ad;
            if (true) ** GOTO lbl5
            block31: while (true) {
                v0 /* !! */  = (long)(v1 - od$FiniteLoopStrategy.gps("grx", gpy(int ), (int)21));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1268445256: {
                        v1 = od$FiniteLoopStrategy.gps("gry", gpy(int ), (int)22);
                        continue block31;
                    }
                    case -570788142: {
                        break block31;
                    }
                    case 1957096246: {
                        v1 = od$FiniteLoopStrategy.gps("grz", gpy(int ), (int)23);
                        continue block31;
                    }
                    case 2074223556: {
                        v1 = od$FiniteLoopStrategy.gps("gsa", gpy(int ), (int)24);
                        continue block31;
                    }
                }
                break;
            }
            var3_1 = od$FiniteLoopStrategy.c;
            v2 /* !! */  = od$FiniteLoopStrategy.ad;
            if (true) ** GOTO lbl22
            block32: while (true) {
                v2 /* !! */  = (long)(v3 - od$FiniteLoopStrategy.gps("gsb", gpy(int ), (int)25));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -570788142: {
                        break block32;
                    }
                    case -477572615: {
                        v3 = od$FiniteLoopStrategy.gps("gsc", gpy(int ), (int)26);
                        continue block32;
                    }
                    case 1905922839: {
                        v3 = od$FiniteLoopStrategy.gps("gsd", gpy(int ), (int)27);
                        continue block32;
                    }
                }
                break;
            }
            var2_2 /* !! */  = od$FiniteLoopStrategy.b;
            v4 /* !! */  = od$FiniteLoopStrategy.ad;
            if (true) ** GOTO lbl36
            block33: while (true) {
                v4 /* !! */  = (long)(v5 - od$FiniteLoopStrategy.gps("gse", gpy(int ), (int)28));
lbl36:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -570788142: {
                        break block33;
                    }
                    case 818420398: {
                        v5 = od$FiniteLoopStrategy.gps("gsf", gpy(int ), (int)29);
                        continue block33;
                    }
                    case 931576369: {
                        v5 = od$FiniteLoopStrategy.gps("gsg", gpy(int ), (int)30);
                        continue block33;
                    }
                }
                break;
            }
            var1_3 = od$FiniteLoopStrategy.a;
            if (var3_1) {
                throw null;
lbl48:
                // 4 sources

                return (boolean)od$FiniteLoopStrategy.gps("gsh", gpp(int ), (int)32);
            }
            if (var1_3 || var1_3) ** GOTO lbl48
            v6 /* !! */  = od$FiniteLoopStrategy.ad;
            if (true) ** GOTO lbl55
            block35: while (true) {
                v6 /* !! */  = (long)(v7 - od$FiniteLoopStrategy.gps("gsi", gpy(int ), (int)31));
lbl55:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -1280129034: {
                        v7 = od$FiniteLoopStrategy.gps("gsj", gpy(int ), (int)32);
                        continue block35;
                    }
                    case -570788142: {
                        break block35;
                    }
                    case 1907236310: {
                        v7 = od$FiniteLoopStrategy.gps("gsk", gpy(int ), (int)33);
                        continue block35;
                    }
                }
                break;
            }
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_0 = od$FiniteLoopStrategy.ad - od$FiniteLoopStrategy.gps("gsl", gpy(int ), (int)34)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v8 /* !! */  == od$FiniteLoopStrategy.gps("gsm", gpp(int ), (int)33)) break;
                v8 /* !! */  = (long)od$FiniteLoopStrategy.gps("gsn", gpp(int ), (int)34);
            }
            if (this.currentLoop < this.loopCount) break block45;
            if (var1_3) ** GOTO lbl48
            v9 = od$FiniteLoopStrategy.gps("gso", gpp(int ), (int)35);
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl84
        }
        if (var1_3) ** GOTO lbl48
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block21 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                v9 = od$FiniteLoopStrategy.gps("gsp", gpp(int ), (int)36);
lbl84:
                // 2 sources

                return (boolean)v9;
            }
lbl85:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)od$FiniteLoopStrategy.gps("gsq", gpp(int ), (int)37);
                if (!var3_1) break;
                throw null;
            }
lbl89:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)od$FiniteLoopStrategy.gps("gsr", gpp(int ), (int)38);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl107
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)od$FiniteLoopStrategy.gps("gss", gpp(int ), (int)39);
                    if (!var3_1) break block21;
                    throw null;
                }
            }
lbl99:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)od$FiniteLoopStrategy.gps("gst", gpp(int ), (int)40);
                if (!var3_1) ** GOTO lbl89
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)od$FiniteLoopStrategy.gps("gsu", gpp(int ), (int)41);
                if (!var3_1) ** GOTO lbl99
                throw null;
            }
lbl107:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)od$FiniteLoopStrategy.gps("gsv", gpp(int ), (int)42);
                if (!var3_1) ** GOTO lbl85
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)od$FiniteLoopStrategy.gps("gsw", gpp(int ), (int)43);
                if (!var3_1) break;
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)od$FiniteLoopStrategy.gps("gsx", gpp(int ), (int)44);
        ** while (!var3_1)
lbl118:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public od$FiniteLoopStrategy(int var1_1) {
        var3_2 /* !! */  = od$FiniteLoopStrategy.b;
        super();
        this.loopCount = var1_1 - od$FiniteLoopStrategy.gps("gpt", gpp(int ), (int)0);
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
            case 0: {
                var3_2 /* !! */  = (int)od$FiniteLoopStrategy.gps("gpu", gpp(int ), (int)1);
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)od$FiniteLoopStrategy.gps("gpv", gpp(int ), (int)2);
                    break block0;
                    break;
                }
            }
            case 2: {
                while (true) {
                    var3_2 /* !! */  = (int)od$FiniteLoopStrategy.gps("gpw", gpp(int ), (int)3);
                }
            }
            case 3: 
        }
        var3_2 /* !! */  = (int)od$FiniteLoopStrategy.gps("gpx", gpp(int ), (int)4);
        ** while (true)
    }

    private static /* synthetic */ void gta() {
        od$FiniteLoopStrategy.gpz[0] = 6134784957324848351L;
        od$FiniteLoopStrategy.gpz[1] = -6164709873924382477L;
        od$FiniteLoopStrategy.gpz[2] = 5413952290361234813L;
        od$FiniteLoopStrategy.gpz[3] = 3618937844501749971L;
        od$FiniteLoopStrategy.gpz[4] = 4806406844078142876L;
        od$FiniteLoopStrategy.gpz[5] = 672892015200169998L;
        od$FiniteLoopStrategy.gpz[6] = 3258141859258267332L;
        od$FiniteLoopStrategy.gpz[7] = -7796080730105763430L;
        od$FiniteLoopStrategy.gpz[8] = -1025923844180284264L;
        od$FiniteLoopStrategy.gpz[9] = -1828712028299269675L;
        od$FiniteLoopStrategy.gpz[10] = -7509304091048015460L;
        od$FiniteLoopStrategy.gpz[11] = 1671949476870471327L;
        od$FiniteLoopStrategy.gpz[12] = -1873118913574064441L;
        od$FiniteLoopStrategy.gpz[13] = 5292397963883263461L;
        od$FiniteLoopStrategy.gpz[14] = 2354488449166577921L;
        od$FiniteLoopStrategy.gpz[15] = 5208930600440883824L;
        od$FiniteLoopStrategy.gpz[16] = 3209970027163322948L;
        od$FiniteLoopStrategy.gpz[17] = 5563271779829833314L;
        od$FiniteLoopStrategy.gpz[18] = -8505581936707338307L;
        od$FiniteLoopStrategy.gpz[19] = -5644218781605482864L;
        od$FiniteLoopStrategy.gpz[20] = -2585380889383548412L;
        od$FiniteLoopStrategy.gpz[21] = -4721345730437671654L;
        od$FiniteLoopStrategy.gpz[22] = 8254819873703235802L;
        od$FiniteLoopStrategy.gpz[23] = -4348988511344648208L;
        od$FiniteLoopStrategy.gpz[24] = -7382519007407116542L;
        od$FiniteLoopStrategy.gpz[25] = 6858753263039279110L;
        od$FiniteLoopStrategy.gpz[26] = -3352407348960585037L;
        od$FiniteLoopStrategy.gpz[27] = 1153289347771886763L;
        od$FiniteLoopStrategy.gpz[28] = -6986473085976969665L;
        od$FiniteLoopStrategy.gpz[29] = 2433749655697286041L;
        od$FiniteLoopStrategy.gpz[30] = 6570502226138828431L;
        od$FiniteLoopStrategy.gpz[31] = -7389220935602006814L;
        od$FiniteLoopStrategy.gpz[32] = 8484341241083558888L;
        od$FiniteLoopStrategy.gpz[33] = -3005284099025850645L;
        od$FiniteLoopStrategy.gpz[34] = 7988575034402598416L;
    }

    private static /* synthetic */ void gsy() {
        od$FiniteLoopStrategy.gpq[0] = 863025550;
        od$FiniteLoopStrategy.gpq[1] = 12440321;
        od$FiniteLoopStrategy.gpq[2] = 19606026;
        od$FiniteLoopStrategy.gpq[3] = 30458009;
        od$FiniteLoopStrategy.gpq[4] = 2034623922;
        od$FiniteLoopStrategy.gpq[5] = -508723982;
        od$FiniteLoopStrategy.gpq[6] = 1972420742;
        od$FiniteLoopStrategy.gpq[7] = 16550315;
        od$FiniteLoopStrategy.gpq[8] = 1063773709;
        od$FiniteLoopStrategy.gpq[9] = -1279847785;
        od$FiniteLoopStrategy.gpq[10] = 492331242;
        od$FiniteLoopStrategy.gpq[11] = 1073750631;
        od$FiniteLoopStrategy.gpq[12] = -2117888829;
        od$FiniteLoopStrategy.gpq[13] = 1631635771;
        od$FiniteLoopStrategy.gpq[14] = -1266303607;
        od$FiniteLoopStrategy.gpq[15] = 1867291124;
        od$FiniteLoopStrategy.gpq[16] = -676023119;
        od$FiniteLoopStrategy.gpq[17] = -725123619;
        od$FiniteLoopStrategy.gpq[18] = -1461745130;
        od$FiniteLoopStrategy.gpq[19] = 380914563;
        od$FiniteLoopStrategy.gpq[20] = -1269483759;
        od$FiniteLoopStrategy.gpq[21] = 1229751585;
        od$FiniteLoopStrategy.gpq[22] = 1841362982;
        od$FiniteLoopStrategy.gpq[23] = -230625382;
        od$FiniteLoopStrategy.gpq[24] = -472469133;
        od$FiniteLoopStrategy.gpq[25] = 240010772;
        od$FiniteLoopStrategy.gpq[26] = -2003174367;
        od$FiniteLoopStrategy.gpq[27] = 1665957786;
        od$FiniteLoopStrategy.gpq[28] = 1676836435;
        od$FiniteLoopStrategy.gpq[29] = -501538379;
        od$FiniteLoopStrategy.gpq[30] = -1800698681;
        od$FiniteLoopStrategy.gpq[31] = 1368594997;
        od$FiniteLoopStrategy.gpq[32] = 1381764201;
        od$FiniteLoopStrategy.gpq[33] = 1039597392;
        od$FiniteLoopStrategy.gpq[34] = 155961949;
        od$FiniteLoopStrategy.gpq[35] = 856254996;
        od$FiniteLoopStrategy.gpq[36] = 1774104013;
        od$FiniteLoopStrategy.gpq[37] = -1498459681;
        od$FiniteLoopStrategy.gpq[38] = 848720413;
        od$FiniteLoopStrategy.gpq[39] = 601797787;
        od$FiniteLoopStrategy.gpq[40] = -1708133373;
        od$FiniteLoopStrategy.gpq[41] = -1973088532;
        od$FiniteLoopStrategy.gpq[42] = -1046467770;
        od$FiniteLoopStrategy.gpq[43] = -606318174;
        od$FiniteLoopStrategy.gpq[44] = -473495691;
    }

    private static /* synthetic */ long gpy(int n2) {
        return gpz[n2] ^ gqa[n2];
    }

    public static /* synthetic */ CallSite gps(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public boolean shouldLoop(int var1_1, int var2_2) {
        v0 /* !! */  = od$FiniteLoopStrategy.ad;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(v1 - od$FiniteLoopStrategy.gps("gqb", gpy(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1557663642: {
                    v1 = od$FiniteLoopStrategy.gps("gqc", gpy(int ), (int)1);
                    continue block24;
                }
                case -570788142: {
                    break block24;
                }
                case 1787901699: {
                    v1 = od$FiniteLoopStrategy.gps("gqd", gpy(int ), (int)2);
                    continue block24;
                }
            }
            break;
        }
        var5_3 = od$FiniteLoopStrategy.c;
        v2 /* !! */  = od$FiniteLoopStrategy.ad;
        if (true) ** GOTO lbl19
        block25: while (true) {
            v2 /* !! */  = (long)(od$FiniteLoopStrategy.gps("gqf", gpy(int ), (int)4) - od$FiniteLoopStrategy.gps("gqe", gpy(int ), (int)3));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -570788142: {
                    break block25;
                }
                case 476311988: {
                    continue block25;
                }
            }
            break;
        }
        var4_4 /* !! */  = od$FiniteLoopStrategy.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = od$FiniteLoopStrategy.ad - od$FiniteLoopStrategy.gps("gqg", gpy(int ), (int)5)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == od$FiniteLoopStrategy.gps("gqh", gpp(int ), (int)5)) break;
            v3 /* !! */  = (long)od$FiniteLoopStrategy.gps("gqi", gpp(int ), (int)6);
        }
        var3_5 = od$FiniteLoopStrategy.a;
        if (var5_3) {
            throw null;
lbl34:
            // 4 sources

            return (boolean)od$FiniteLoopStrategy.gps("gqj", gpp(int ), (int)7);
        }
        if (var3_5 || var3_5) ** GOTO lbl34
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_1 < var2_2) ** GOTO lbl63
                if (var3_5) ** GOTO lbl34
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = od$FiniteLoopStrategy.ad - od$FiniteLoopStrategy.gps("gqk", gpy(int ), (int)6)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == od$FiniteLoopStrategy.gps("gql", gpp(int ), (int)8)) break;
                    v4 /* !! */  = (long)od$FiniteLoopStrategy.gps("gqm", gpp(int ), (int)9);
                }
                v5 /* !! */  = od$FiniteLoopStrategy.ad;
                if (true) ** GOTO lbl52
                block29: while (true) {
                    v5 /* !! */  = (long)(od$FiniteLoopStrategy.gps("gqo", gpy(int ), (int)8) - od$FiniteLoopStrategy.gps("gqn", gpy(int ), (int)7));
lbl52:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1837296473: {
                            continue block29;
                        }
                        case -570788142: {
                            break block29;
                        }
                    }
                    break;
                }
                if (this.currentLoop >= this.loopCount) ** GOTO lbl63
                if (var3_5) ** GOTO lbl34
                v6 = od$FiniteLoopStrategy.gps("gqp", gpp(int ), (int)10);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl66
lbl63:
                // 2 sources

                if (!var3_5 && !var3_5) ** break;
                ** continue;
                v6 = od$FiniteLoopStrategy.gps("gqq", gpp(int ), (int)11);
lbl66:
                // 2 sources

                return (boolean)v6;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var4_4 /* !! */  = (int)od$FiniteLoopStrategy.gps("gqr", gpp(int ), (int)12);
                    if (!var5_3) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                do {
                    var4_4 /* !! */  = (int)od$FiniteLoopStrategy.gps("gqs", gpp(int ), (int)13);
                } while (!var5_3);
                throw null;
            }
lbl77:
            // 2 sources

            case 2: {
                var4_4 /* !! */  = (int)od$FiniteLoopStrategy.gps("gqt", gpp(int ), (int)14);
                if (var5_3) {
                    throw null;
                }
            }
            case 3: {
                var4_4 /* !! */  = (int)od$FiniteLoopStrategy.gps("gqu", gpp(int ), (int)15);
                if (var5_3) {
                    throw null;
                }
            }
            case 4: {
                var4_4 /* !! */  = (int)od$FiniteLoopStrategy.gps("gqv", gpp(int ), (int)16);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl99
            }
            case 5: {
                var4_4 /* !! */  = (int)od$FiniteLoopStrategy.gps("gqw", gpp(int ), (int)17);
                if (!var5_3) ** GOTO lbl77
                throw null;
            }
            case 6: {
                do {
                    var4_4 /* !! */  = (int)od$FiniteLoopStrategy.gps("gqx", gpp(int ), (int)18);
                } while (!var5_3);
                throw null;
            }
lbl99:
            // 2 sources

            case 7: {
                do {
                    var4_4 /* !! */  = (int)od$FiniteLoopStrategy.gps("gqy", gpp(int ), (int)19);
                } while (!var5_3);
                throw null;
            }
            case 8: 
        }
        var4_4 /* !! */  = (int)od$FiniteLoopStrategy.gps("gqz", gpp(int ), (int)20);
        ** while (!var5_3)
lbl107:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int gpp(int n2) {
        return gpq[n2] ^ gpr[n2];
    }
}

