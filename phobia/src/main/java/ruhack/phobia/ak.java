/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 */
package ruhack.phobia;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;

public class ak {
    private static long[] cefq;
    public static final boolean a;
    private static int[] cefe;
    private final Path configPath;
    private static int[] ceff;
    protected static final long fm = -5502596236443729601L;
    public static final int b;
    private static ak instance;
    private static long[] cefr;
    private final Gson gson;
    public static final boolean c;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ak getInstance() {
        v0 /* !! */  = ak.fm;
        if (true) ** GOTO lbl5
        block30: while (true) {
            v0 /* !! */  = (long)(v1 - ak.cefg("cefs", cefp(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2141273793: {
                    break block30;
                }
                case 88283828: {
                    v1 = ak.cefg("ceft", cefp(int ), (int)1);
                    continue block30;
                }
                case 1625196002: {
                    v1 = ak.cefg("cefu", cefp(int ), (int)2);
                    continue block30;
                }
            }
            break;
        }
        var2 = ak.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ak.fm - ak.cefg("cefv", cefp(int ), (int)3)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ak.cefg("cefw", cefd(int ), (int)8)) break;
            v2 /* !! */  = (long)ak.cefg("cefx", cefd(int ), (int)9);
        }
        var1_1 /* !! */  = ak.b;
        v3 /* !! */  = ak.fm;
        if (true) ** GOTO lbl25
        block32: while (true) {
            v3 /* !! */  = (long)(v4 - ak.cefg("cefy", cefp(int ), (int)4));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2141273793: {
                    break block32;
                }
                case -1608750540: {
                    v4 = ak.cefg("cefz", cefp(int ), (int)5);
                    continue block32;
                }
                case -663550966: {
                    v4 = ak.cefg("cega", cefp(int ), (int)6);
                    continue block32;
                }
            }
            break;
        }
        var0_2 = ak.a;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2) {
                    throw null;
lbl40:
                    // 4 sources

                    return null;
                }
                if (var0_2 || var0_2) ** GOTO lbl40
                v5 /* !! */  = ak.fm;
                if (true) ** GOTO lbl47
                block34: while (true) {
                    v5 /* !! */  = (long)(ak.cefg("cegc", cefp(int ), (int)8) - ak.cefg("cegb", cefp(int ), (int)7));
lbl47:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -2141273793: {
                            break block34;
                        }
                        case -261996897: {
                            continue block34;
                        }
                    }
                    break;
                }
                if (ak.instance != null) ** GOTO lbl80
                if (var0_2 || var0_2) ** GOTO lbl40
                v6 /* !! */  = ak.fm;
                if (true) ** GOTO lbl58
                block35: while (true) {
                    v6 /* !! */  = (long)(v7 - ak.cefg("cegd", cefp(int ), (int)9));
lbl58:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -2141273793: {
                            break block35;
                        }
                        case -1910396879: {
                            v7 = ak.cefg("cege", cefp(int ), (int)10);
                            continue block35;
                        }
                        case 1716897989: {
                            v7 = ak.cefg("cegf", cefp(int ), (int)11);
                            continue block35;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_1 = ak.fm - ak.cefg("cegg", cefp(int ), (int)12)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == ak.cefg("cegh", cefd(int ), (int)10)) break;
                    v8 /* !! */  = (long)ak.cefg("cegi", cefd(int ), (int)11);
                }
                v9 = new ak();
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_2 = ak.fm - ak.cefg("cegj", cefp(int ), (int)13)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == ak.cefg("cegk", cefd(int ), (int)12)) break;
                    v10 /* !! */  = (long)ak.cefg("cegl", cefd(int ), (int)13);
                }
                ak.instance = v9;
                if (var0_2) ** GOTO lbl40
lbl80:
                // 2 sources

                if (!var0_2 && !var0_2) ** break;
                ** continue;
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = ak.fm - ak.cefg("cegm", cefp(int ), (int)14)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == ak.cefg("cegn", cefd(int ), (int)14)) break;
                    v11 /* !! */  = (long)ak.cefg("cego", cefd(int ), (int)15);
                }
                return ak.instance;
            }
            case 0: {
                var1_1 /* !! */  = (int)ak.cefg("cegp", cefd(int ), (int)16);
                if (var2) {
                    throw null;
                }
            }
lbl92:
            // 4 sources

            case 1: {
                var1_1 /* !! */  = (int)ak.cefg("cegq", cefd(int ), (int)17);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl116
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)ak.cefg("cegr", cefd(int ), (int)18);
                    if (!var2) ** GOTO lbl92
                    throw null;
                }
            }
lbl102:
            // 2 sources

            case 3: {
                var1_1 /* !! */  = (int)ak.cefg("cegs", cefd(int ), (int)19);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl116
            }
            case 4: {
                var1_1 /* !! */  = (int)ak.cefg("cegt", cefd(int ), (int)20);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl116
            }
            case 5: {
                var1_1 /* !! */  = (int)ak.cefg("cegu", cefd(int ), (int)21);
                if (!var2) ** GOTO lbl102
                throw null;
            }
lbl116:
            // 5 sources

            case 6: {
                var1_1 /* !! */  = (int)ak.cefg("cegv", cefd(int ), (int)22);
                if (var2) {
                    throw null;
                }
            }
            case 7: {
                var1_1 /* !! */  = (int)ak.cefg("cegw", cefd(int ), (int)23);
                if (!var2) ** GOTO lbl116
                throw null;
            }
            case 8: 
        }
        var1_1 /* !! */  = (int)ak.cefg("cegx", cefd(int ), (int)24);
        ** while (!var2)
lbl127:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cekf() {
        ak.cefe[0] = -1712231850;
        ak.cefe[1] = -1314225410;
        ak.cefe[2] = 736845490;
        ak.cefe[3] = -1538147303;
        ak.cefe[4] = 808483301;
        ak.cefe[5] = -2047478680;
        ak.cefe[6] = 1415913737;
        ak.cefe[7] = 1417012508;
        ak.cefe[8] = 469828656;
        ak.cefe[9] = 1408012629;
        ak.cefe[10] = 751850709;
        ak.cefe[11] = 305010801;
        ak.cefe[12] = -1383440649;
        ak.cefe[13] = -2058528821;
        ak.cefe[14] = 1473270996;
        ak.cefe[15] = 750398222;
        ak.cefe[16] = -1502847288;
        ak.cefe[17] = 2054849829;
        ak.cefe[18] = 1255220629;
        ak.cefe[19] = 209772967;
        ak.cefe[20] = 509992102;
        ak.cefe[21] = 298060610;
        ak.cefe[22] = -1577225671;
        ak.cefe[23] = 2022677767;
        ak.cefe[24] = -1058885565;
        ak.cefe[25] = 80959861;
        ak.cefe[26] = -261620577;
        ak.cefe[27] = -377209653;
        ak.cefe[28] = 1359772102;
        ak.cefe[29] = 173956151;
        ak.cefe[30] = 831530657;
        ak.cefe[31] = 901656971;
        ak.cefe[32] = 466634725;
        ak.cefe[33] = 296928679;
        ak.cefe[34] = -1683590129;
        ak.cefe[35] = -1972312543;
        ak.cefe[36] = 570702821;
        ak.cefe[37] = 963464162;
        ak.cefe[38] = -1662417822;
        ak.cefe[39] = 447862230;
        ak.cefe[40] = 215908941;
        ak.cefe[41] = 983357294;
        ak.cefe[42] = 966702403;
        ak.cefe[43] = -1639744109;
        ak.cefe[44] = -826830705;
        ak.cefe[45] = 16157206;
        ak.cefe[46] = -1112310888;
        ak.cefe[47] = 1285992473;
        ak.cefe[48] = -1556291488;
        ak.cefe[49] = 329891400;
        ak.cefe[50] = 810666737;
        ak.cefe[51] = -2121266351;
        ak.cefe[52] = 316184707;
        ak.cefe[53] = -105814428;
        ak.cefe[54] = -511500623;
        ak.cefe[55] = -982018047;
        ak.cefe[56] = -1335502353;
        ak.cefe[57] = -898470737;
        ak.cefe[58] = -1750927576;
        ak.cefe[59] = -606808783;
        ak.cefe[60] = 1972413130;
        ak.cefe[61] = 1716320745;
        ak.cefe[62] = 1025171811;
        ak.cefe[63] = -1996901713;
        ak.cefe[64] = 347832192;
        ak.cefe[65] = 1287702414;
        ak.cefe[66] = -1276159297;
        ak.cefe[67] = -1885126088;
        ak.cefe[68] = -298551492;
        ak.cefe[69] = -48046419;
        ak.cefe[70] = 1967531755;
        ak.cefe[71] = -1971380588;
        ak.cefe[72] = -450499118;
        ak.cefe[73] = 904226984;
        ak.cefe[74] = -2071729534;
        ak.cefe[75] = -1672425379;
        ak.cefe[76] = 1581739830;
        ak.cefe[77] = 324565171;
        ak.cefe[78] = -1188552584;
        ak.cefe[79] = -632114800;
        ak.cefe[80] = -1172467781;
        ak.cefe[81] = -69931818;
        ak.cefe[82] = -2056538031;
        ak.cefe[83] = -199092270;
        ak.cefe[84] = -1915264317;
        ak.cefe[85] = -760164703;
        ak.cefe[86] = -887620588;
        ak.cefe[87] = 457098315;
        ak.cefe[88] = 1540042864;
        ak.cefe[89] = 393139653;
        ak.cefe[90] = 2035320278;
        ak.cefe[91] = -165551912;
        ak.cefe[92] = 779838069;
        ak.cefe[93] = 1234235817;
        ak.cefe[94] = 509895342;
        ak.cefe[95] = 1886457532;
        ak.cefe[96] = 170385036;
        ak.cefe[97] = 764410586;
        ak.cefe[98] = 761769670;
        ak.cefe[99] = 789988994;
    }

    private static /* synthetic */ int cefd(int n2) {
        return cefe[n2] ^ ceff[n2];
    }

    private static /* synthetic */ void cevv() {
        ak.cefr[0] = -4285062601251419028L;
        ak.cefr[1] = 6189180944827732699L;
        ak.cefr[2] = -8234733917503102914L;
        ak.cefr[3] = 3002140223841821774L;
        ak.cefr[4] = -1354096586328205426L;
        ak.cefr[5] = 8157368904291589744L;
        ak.cefr[6] = 7773505758042236553L;
        ak.cefr[7] = 9033838919867031253L;
        ak.cefr[8] = -9619490413819421L;
        ak.cefr[9] = -6773815229658757673L;
        ak.cefr[10] = 9086171948763727386L;
        ak.cefr[11] = 4915191645933279389L;
        ak.cefr[12] = -3009058314382104854L;
        ak.cefr[13] = 7598443791261715698L;
        ak.cefr[14] = -2397885476608495210L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private ak() {
        var4_1 /* !! */  = ak.b;
        super();
        if (var4_1 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block12: while (true) {
            block14: {
                switch (cfr_temp_0 == -2147483648 ? var4_1 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        this.gson = new GsonBuilder().setPrettyPrinting().create();
                        var1_2 = Paths.get("Phobia", new String[]{"configs"});
                        try {
                            Files.createDirectories(var1_2, new FileAttribute[0]);
                        }
                        catch (IOException var2_3) {
                            // empty catch block
                        }
                        this.configPath = var1_2.resolve("friends.file");
                        return;
                    }
                    case 0: {
                        var4_1 /* !! */  = (int)ak.cefg("cefh", cefd(int ), (int)0);
                    }
                    case 1: {
                        var4_1 /* !! */  = (int)ak.cefg("cefi", cefd(int ), (int)1);
                        cfr_temp_0 = 5;
                        break block14;
                    }
                    case 2: {
                        ** GOTO lbl32
                    }
                    case 5: {
                        var4_1 /* !! */  = (int)ak.cefg("cefm", cefd(int ), (int)5);
                        cfr_temp_0 = 3;
                        break block14;
                    }
                    case 7: {
                        var4_1 /* !! */  = (int)ak.cefg("cefo", cefd(int ), (int)7);
lbl32:
                        // 2 sources

                        var4_1 /* !! */  = (int)ak.cefg("cefj", cefd(int ), (int)2);
                        cfr_temp_0 = 6;
                        break block14;
                    }
                    case 3: {
                        var4_1 /* !! */  = (int)ak.cefg("cefk", cefd(int ), (int)3);
                    }
                    case 4: {
                        var4_1 /* !! */  = (int)ak.cefg("cefl", cefd(int ), (int)4);
                    }
                    case 6: 
                }
                ** GOTO lbl44
            }
            while (true) {
                if (true) continue block12;
lbl44:
                // 2 sources

                var4_1 /* !! */  = (int)ak.cefg("cefn", cefd(int ), (int)6);
                cfr_temp_0 = 3;
            }
            break;
        }
    }

    public static /* synthetic */ CallSite cefg(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void cevu() {
        ak.cefq[0] = -5695615278173782560L;
        ak.cefq[1] = 7102132556563018307L;
        ak.cefq[2] = 8490352053467274543L;
        ak.cefq[3] = -4135204850874617484L;
        ak.cefq[4] = 894491743682150739L;
        ak.cefq[5] = -5972083329211710600L;
        ak.cefq[6] = -1444501138129437362L;
        ak.cefq[7] = 6873685484731395715L;
        ak.cefq[8] = 6914030743406226170L;
        ak.cefq[9] = -7311608970069948735L;
        ak.cefq[10] = 2562277793737343231L;
        ak.cefq[11] = -5665076652984137601L;
        ak.cefq[12] = 2388740685731606640L;
        ak.cefq[13] = -6764944824624701102L;
        ak.cefq[14] = -5196364778708885579L;
    }

    static {
        cefe = new int[110];
        ceff = new int[110];
        ak.cekf();
        ak.cevr();
        ak.cevs();
        ak.cevt();
        cefq = new long[15];
        cefr = new long[15];
        ak.cevu();
        ak.cevv();
    }

    private static /* synthetic */ void cevs() {
        ak.ceff[0] = -1712231852;
        ak.ceff[1] = -1314225414;
        ak.ceff[2] = 736845489;
        ak.ceff[3] = -1538147298;
        ak.ceff[4] = 808483302;
        ak.ceff[5] = -2047478680;
        ak.ceff[6] = 1415913739;
        ak.ceff[7] = 1417012506;
        ak.ceff[8] = -469828657;
        ak.ceff[9] = 1836458632;
        ak.ceff[10] = -751850710;
        ak.ceff[11] = -1270463662;
        ak.ceff[12] = 1383440648;
        ak.ceff[13] = 621992303;
        ak.ceff[14] = -1473270997;
        ak.ceff[15] = 365041215;
        ak.ceff[16] = -1502847288;
        ak.ceff[17] = 2054849831;
        ak.ceff[18] = 1255220637;
        ak.ceff[19] = 209772960;
        ak.ceff[20] = 509992099;
        ak.ceff[21] = 298060609;
        ak.ceff[22] = -1577225670;
        ak.ceff[23] = 2022677766;
        ak.ceff[24] = -1058885561;
        ak.ceff[25] = 80959860;
        ak.ceff[26] = -261620606;
        ak.ceff[27] = -377209659;
        ak.ceff[28] = 1359772115;
        ak.ceff[29] = 173956134;
        ak.ceff[30] = 831530672;
        ak.ceff[31] = 901656974;
        ak.ceff[32] = 466634720;
        ak.ceff[33] = 296928695;
        ak.ceff[34] = -1683590133;
        ak.ceff[35] = -1972312518;
        ak.ceff[36] = 570702841;
        ak.ceff[37] = 963464166;
        ak.ceff[38] = -1662417797;
        ak.ceff[39] = 447862214;
        ak.ceff[40] = 215908937;
        ak.ceff[41] = 983357299;
        ak.ceff[42] = 966702430;
        ak.ceff[43] = -1639744098;
        ak.ceff[44] = -826830698;
        ak.ceff[45] = 16157188;
        ak.ceff[46] = -1112310884;
        ak.ceff[47] = 1285992478;
        ak.ceff[48] = -1556291474;
        ak.ceff[49] = 329891404;
        ak.ceff[50] = 810666744;
        ak.ceff[51] = -2121266347;
        ak.ceff[52] = 316184735;
        ak.ceff[53] = -105814423;
        ak.ceff[54] = -511500631;
        ak.ceff[55] = -982018037;
        ak.ceff[56] = -1335502357;
        ak.ceff[57] = -898470771;
        ak.ceff[58] = -1750927575;
        ak.ceff[59] = -606808827;
        ak.ceff[60] = 1972413180;
        ak.ceff[61] = 1716320736;
        ak.ceff[62] = 1025171788;
        ak.ceff[63] = -1996901754;
        ak.ceff[64] = 347832213;
        ak.ceff[65] = 1287702437;
        ak.ceff[66] = -1276159341;
        ak.ceff[67] = -1885126119;
        ak.ceff[68] = -298551542;
        ak.ceff[69] = -48046437;
        ak.ceff[70] = 1967531713;
        ak.ceff[71] = -1971380594;
        ak.ceff[72] = -450499086;
        ak.ceff[73] = 904226981;
        ak.ceff[74] = -2071729489;
        ak.ceff[75] = -1672425407;
        ak.ceff[76] = 1581739802;
        ak.ceff[77] = 324565164;
        ak.ceff[78] = -1188552612;
        ak.ceff[79] = -632114783;
        ak.ceff[80] = -1172467781;
        ak.ceff[81] = -69931836;
        ak.ceff[82] = -2056538040;
        ak.ceff[83] = -199092240;
        ak.ceff[84] = -1915264273;
        ak.ceff[85] = -760164723;
        ak.ceff[86] = -887620607;
        ak.ceff[87] = 457098311;
        ak.ceff[88] = 1540042849;
        ak.ceff[89] = 393139675;
        ak.ceff[90] = 2035320317;
        ak.ceff[91] = -165551907;
        ak.ceff[92] = 779838020;
        ak.ceff[93] = 1234235801;
        ak.ceff[94] = 509895338;
        ak.ceff[95] = 1886457480;
        ak.ceff[96] = 170385030;
        ak.ceff[97] = 764410602;
        ak.ceff[98] = 761769667;
        ak.ceff[99] = 789988994;
    }

    private static /* synthetic */ void cevr() {
        ak.cefe[100] = -394313893;
        ak.cefe[101] = -755435900;
        ak.cefe[102] = -510114089;
        ak.cefe[103] = 206410855;
        ak.cefe[104] = -750346620;
        ak.cefe[105] = -1865250664;
        ak.cefe[106] = -1364894650;
        ak.cefe[107] = 1095101571;
        ak.cefe[108] = -1660557007;
        ak.cefe[109] = -1972142559;
    }

    private static /* synthetic */ void cevt() {
        ak.ceff[100] = -394313916;
        ak.ceff[101] = -755435888;
        ak.ceff[102] = -510114075;
        ak.ceff[103] = 206410864;
        ak.ceff[104] = -750346624;
        ak.ceff[105] = -1865250671;
        ak.ceff[106] = -1364894622;
        ak.ceff[107] = 1095101600;
        ak.ceff[108] = -1660557040;
        ak.ceff[109] = -1972142569;
    }

    /*
     * Exception decompiling
     */
    public void save() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 3[CASE]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    public void load() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 7[DOLOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static /* synthetic */ long cefp(int n2) {
        return cefq[n2] ^ cefr[n2];
    }
}

