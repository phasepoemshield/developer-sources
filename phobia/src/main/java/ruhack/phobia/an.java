/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonObject
 */
package ruhack.phobia;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.file.Path;
import ruhack.phobia.oh;

public class an {
    private static long[] byqk;
    private oh lastUsedProxy;
    private final Path configPath;
    private static long[] byqj;
    private static int[] bypt;
    private static final long fa = 4049792710068238366L;
    private final Gson gson;
    public static final boolean c;
    private static int[] bypu;
    public static final boolean a;
    private oh defaultProxy;
    public static final int b;
    private boolean proxyEnabled;
    private static an instance;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static an getInstance() {
        v0 /* !! */  = an.fa;
        if (true) ** GOTO lbl5
        block36: while (true) {
            v0 /* !! */  = (long)(an.bypv("byqm", byqi(int ), (int)1) - an.bypv("byql", byqi(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1502967838: {
                    break block36;
                }
                case 2063928384: {
                    continue block36;
                }
            }
            break;
        }
        var2 = an.c;
        v1 /* !! */  = an.fa;
        if (true) ** GOTO lbl15
        block37: while (true) {
            v1 /* !! */  = (long)(v2 - an.bypv("byqn", byqi(int ), (int)2));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -421887796: {
                    v2 = an.bypv("byqo", byqi(int ), (int)3);
                    continue block37;
                }
                case -36685978: {
                    v2 = an.bypv("byqp", byqi(int ), (int)4);
                    continue block37;
                }
                case 620155419: {
                    v2 = an.bypv("byqq", byqi(int ), (int)5);
                    continue block37;
                }
                case 1502967838: {
                    break block37;
                }
            }
            break;
        }
        var1_1 /* !! */  = an.b;
        v3 /* !! */  = an.fa;
        if (true) ** GOTO lbl32
        block38: while (true) {
            v3 /* !! */  = (long)(v4 - an.bypv("byqr", byqi(int ), (int)6));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -914651963: {
                    v4 = an.bypv("byqs", byqi(int ), (int)7);
                    continue block38;
                }
                case 1156968676: {
                    v4 = an.bypv("byqt", byqi(int ), (int)8);
                    continue block38;
                }
                case 1502967838: {
                    break block38;
                }
                case 1677865068: {
                    v4 = an.bypv("byqu", byqi(int ), (int)9);
                    continue block38;
                }
            }
            break;
        }
        var0_2 = an.a;
        if (var2) {
            throw null;
lbl47:
            // 4 sources

            return null;
        }
        if (var0_2 || var0_2) ** GOTO lbl47
        v5 /* !! */  = an.fa;
        if (true) ** GOTO lbl54
        block40: while (true) {
            v5 /* !! */  = (long)(an.bypv("byqw", byqi(int ), (int)11) - an.bypv("byqv", byqi(int ), (int)10));
lbl54:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case 514681842: {
                    continue block40;
                }
                case 1502967838: {
                    break block40;
                }
            }
            break;
        }
        if (an.instance != null) ** GOTO lbl90
        if (var0_2 || var0_2) ** GOTO lbl47
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_0 = an.fa - an.bypv("byqx", byqi(int ), (int)12)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == an.bypv("byqy", byps(int ), (int)12)) break;
            v6 /* !! */  = (long)an.bypv("byqz", byps(int ), (int)13);
        }
        v7 /* !! */  = an.fa;
        if (true) ** GOTO lbl70
        block42: while (true) {
            v7 /* !! */  = (long)(v8 - an.bypv("byra", byqi(int ), (int)13));
lbl70:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case 857463602: {
                    v8 = an.bypv("byrb", byqi(int ), (int)14);
                    continue block42;
                }
                case 859496290: {
                    v8 = an.bypv("byrc", byqi(int ), (int)15);
                    continue block42;
                }
                case 1502967838: {
                    break block42;
                }
            }
            break;
        }
        v9 = new an();
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_1 = an.fa - an.bypv("byrd", byqi(int ), (int)16)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == an.bypv("byre", byps(int ), (int)14)) break;
            v10 /* !! */  = (long)an.bypv("byrf", byps(int ), (int)15);
        }
        an.instance = v9;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** GOTO lbl47
lbl90:
                // 2 sources

                if (!var0_2 && !var0_2) ** break;
                ** continue;
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_2 = an.fa - an.bypv("byrg", byqi(int ), (int)17)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == an.bypv("byrh", byps(int ), (int)16)) break;
                    v11 /* !! */  = (long)an.bypv("byri", byps(int ), (int)17);
                }
                return an.instance;
            }
lbl98:
            // 3 sources

            case 0: {
                var1_1 /* !! */  = (int)an.bypv("byrj", byps(int ), (int)18);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl126
            }
            case 1: {
                do {
                    var1_1 /* !! */  = (int)an.bypv("byrk", byps(int ), (int)19);
                } while (!var2);
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)an.bypv("byrl", byps(int ), (int)20);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl121
            }
lbl113:
            // 3 sources

            case 3: {
                var1_1 /* !! */  = (int)an.bypv("byrm", byps(int ), (int)21);
                if (!var2) ** GOTO lbl98
                throw null;
            }
            case 4: {
                var1_1 /* !! */  = (int)an.bypv("byrn", byps(int ), (int)22);
                if (!var2) break;
                throw null;
            }
lbl121:
            // 2 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)an.bypv("byro", byps(int ), (int)23);
                    if (!var2) ** GOTO lbl98
                    throw null;
                }
            }
lbl126:
            // 2 sources

            case 6: {
                var1_1 /* !! */  = (int)an.bypv("byrp", byps(int ), (int)24);
                if (!var2) ** GOTO lbl113
                throw null;
            }
            case 7: {
                var1_1 /* !! */  = (int)an.bypv("byrq", byps(int ), (int)25);
                if (!var2) ** GOTO lbl113
                throw null;
            }
            case 8: 
        }
        var1_1 /* !! */  = (int)an.bypv("byrr", byps(int ), (int)26);
        ** while (!var2)
lbl137:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bzim() {
        an.bypt[100] = 2017901193;
        an.bypt[101] = 459656163;
        an.bypt[102] = 314106621;
        an.bypt[103] = 1823436218;
        an.bypt[104] = 1874973693;
        an.bypt[105] = 1026640190;
        an.bypt[106] = 1041109188;
        an.bypt[107] = 1843473877;
        an.bypt[108] = -1928909762;
        an.bypt[109] = 828707919;
        an.bypt[110] = -1783824267;
        an.bypt[111] = -982752853;
        an.bypt[112] = -434551534;
        an.bypt[113] = 1318480714;
        an.bypt[114] = -450423198;
        an.bypt[115] = -905924705;
        an.bypt[116] = -153919800;
        an.bypt[117] = 1668051214;
        an.bypt[118] = -161551591;
        an.bypt[119] = -85510448;
        an.bypt[120] = 2031548313;
        an.bypt[121] = -1041771086;
        an.bypt[122] = -1016801400;
        an.bypt[123] = 1923386603;
        an.bypt[124] = 1634132987;
        an.bypt[125] = 839171872;
        an.bypt[126] = -430528992;
        an.bypt[127] = -1622029441;
        an.bypt[128] = -664512519;
        an.bypt[129] = -1132327488;
        an.bypt[130] = -1561267634;
        an.bypt[131] = -1227975375;
        an.bypt[132] = 1297538678;
        an.bypt[133] = -1294290048;
        an.bypt[134] = 743042962;
        an.bypt[135] = 260001459;
        an.bypt[136] = 2115939268;
        an.bypt[137] = -551755048;
        an.bypt[138] = 1706078821;
        an.bypt[139] = 470641926;
        an.bypt[140] = -1658679161;
        an.bypt[141] = -1576542726;
        an.bypt[142] = -1887892453;
        an.bypt[143] = 1188671236;
        an.bypt[144] = -1674511076;
        an.bypt[145] = 1856075116;
        an.bypt[146] = -2104374190;
        an.bypt[147] = -390318637;
        an.bypt[148] = -181230725;
        an.bypt[149] = 997496818;
        an.bypt[150] = -778642699;
        an.bypt[151] = 348729381;
        an.bypt[152] = -2128917716;
        an.bypt[153] = -2139722432;
        an.bypt[154] = 1089831093;
        an.bypt[155] = -628147683;
        an.bypt[156] = 1216208867;
        an.bypt[157] = -842325333;
        an.bypt[158] = -1499899235;
        an.bypt[159] = -2048539987;
        an.bypt[160] = 1654416910;
        an.bypt[161] = 908198384;
        an.bypt[162] = 305958595;
        an.bypt[163] = -366629419;
        an.bypt[164] = -1414658227;
        an.bypt[165] = 1674517335;
        an.bypt[166] = -944225158;
        an.bypt[167] = -451822441;
        an.bypt[168] = 268007513;
        an.bypt[169] = 903387708;
        an.bypt[170] = -13995358;
        an.bypt[171] = -1364833939;
        an.bypt[172] = 558015201;
        an.bypt[173] = -1674473515;
        an.bypt[174] = -680746656;
        an.bypt[175] = 1482527778;
        an.bypt[176] = -538825494;
        an.bypt[177] = 1153306319;
        an.bypt[178] = 1664951112;
        an.bypt[179] = -1774107146;
        an.bypt[180] = 463706519;
        an.bypt[181] = -131829279;
        an.bypt[182] = 65280409;
        an.bypt[183] = -2107663451;
        an.bypt[184] = -693281873;
        an.bypt[185] = 1230133988;
        an.bypt[186] = -598672286;
        an.bypt[187] = -88499504;
        an.bypt[188] = -1430756498;
        an.bypt[189] = -836760358;
        an.bypt[190] = 1676264311;
        an.bypt[191] = -1350763858;
        an.bypt[192] = -1337721866;
        an.bypt[193] = 1861846876;
        an.bypt[194] = 1679297658;
        an.bypt[195] = -1267239672;
        an.bypt[196] = 337523606;
        an.bypt[197] = -331423819;
        an.bypt[198] = -1126750583;
        an.bypt[199] = 1827772237;
    }

    static {
        bypt = new int[239];
        bypu = new int[239];
        an.bzil();
        an.bzim();
        an.bzin();
        an.bzio();
        an.bzip();
        an.bziq();
        byqj = new long[147];
        byqk = new long[147];
        an.bzir();
        an.bzis();
        an.bzit();
        an.bziu();
    }

    private static /* synthetic */ void bzio() {
        an.bypu[0] = -1713386099;
        an.bypu[1] = -2142738982;
        an.bypu[2] = -1373558896;
        an.bypu[3] = 193943193;
        an.bypu[4] = -433224967;
        an.bypu[5] = -1267708277;
        an.bypu[6] = -1389386604;
        an.bypu[7] = -191101015;
        an.bypu[8] = -522533621;
        an.bypu[9] = 1035611996;
        an.bypu[10] = 1521331229;
        an.bypu[11] = -969004495;
        an.bypu[12] = -2137761320;
        an.bypu[13] = 1696125727;
        an.bypu[14] = 310594966;
        an.bypu[15] = 538810141;
        an.bypu[16] = 2138293181;
        an.bypu[17] = -2062528482;
        an.bypu[18] = -1335226287;
        an.bypu[19] = -444090466;
        an.bypu[20] = 1153490594;
        an.bypu[21] = 595213996;
        an.bypu[22] = -1365155017;
        an.bypu[23] = 1308850955;
        an.bypu[24] = 549645245;
        an.bypu[25] = -601610848;
        an.bypu[26] = 2129001600;
        an.bypu[27] = 256843836;
        an.bypu[28] = 2125874890;
        an.bypu[29] = 1711733057;
        an.bypu[30] = 800349580;
        an.bypu[31] = -1693906355;
        an.bypu[32] = -1038397455;
        an.bypu[33] = -1099168624;
        an.bypu[34] = -1468858926;
        an.bypu[35] = -1683057542;
        an.bypu[36] = -291692506;
        an.bypu[37] = -256274463;
        an.bypu[38] = 2141073375;
        an.bypu[39] = 750660819;
        an.bypu[40] = -393961518;
        an.bypu[41] = 73063597;
        an.bypu[42] = -1235299682;
        an.bypu[43] = 2144593456;
        an.bypu[44] = -1846287438;
        an.bypu[45] = 525044390;
        an.bypu[46] = 755258074;
        an.bypu[47] = -274156191;
        an.bypu[48] = -1233128449;
        an.bypu[49] = -866403828;
        an.bypu[50] = 1147060481;
        an.bypu[51] = -1414804054;
        an.bypu[52] = -1216519729;
        an.bypu[53] = -1773961409;
        an.bypu[54] = -595722453;
        an.bypu[55] = -697249682;
        an.bypu[56] = -1850323269;
        an.bypu[57] = 1144093588;
        an.bypu[58] = -165196967;
        an.bypu[59] = 1302643753;
        an.bypu[60] = 1468451520;
        an.bypu[61] = -1704349845;
        an.bypu[62] = 1772268033;
        an.bypu[63] = -1226373469;
        an.bypu[64] = -221860758;
        an.bypu[65] = 2083969408;
        an.bypu[66] = -275385142;
        an.bypu[67] = -1459442078;
        an.bypu[68] = -1363785938;
        an.bypu[69] = 767686529;
        an.bypu[70] = -1480879725;
        an.bypu[71] = 1607995231;
        an.bypu[72] = 227910680;
        an.bypu[73] = -1853309983;
        an.bypu[74] = 698291641;
        an.bypu[75] = -770877699;
        an.bypu[76] = 233054373;
        an.bypu[77] = -10154772;
        an.bypu[78] = 1298815385;
        an.bypu[79] = -442993866;
        an.bypu[80] = -1430218767;
        an.bypu[81] = 2007294234;
        an.bypu[82] = 1383186515;
        an.bypu[83] = 44284183;
        an.bypu[84] = -541033963;
        an.bypu[85] = -858583897;
        an.bypu[86] = -287918127;
        an.bypu[87] = 913440365;
        an.bypu[88] = 1024882122;
        an.bypu[89] = 264688738;
        an.bypu[90] = -2088520441;
        an.bypu[91] = 1090394816;
        an.bypu[92] = 2068289617;
        an.bypu[93] = 1285118405;
        an.bypu[94] = 171257979;
        an.bypu[95] = 1130169216;
        an.bypu[96] = -130545769;
        an.bypu[97] = 159200325;
        an.bypu[98] = -59283704;
        an.bypu[99] = -1045891202;
    }

    /*
     * Exception decompiling
     */
    private an() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
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
    public void save() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[CASE]
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

    private static /* synthetic */ void bzir() {
        an.byqj[0] = 7184470214389600332L;
        an.byqj[1] = -6286215442069500965L;
        an.byqj[2] = 8095907660519258756L;
        an.byqj[3] = -4754916717498924941L;
        an.byqj[4] = -1988711848694609337L;
        an.byqj[5] = -8018769070684721420L;
        an.byqj[6] = -7121725452667993408L;
        an.byqj[7] = 6624338993663804714L;
        an.byqj[8] = -4081374548346525670L;
        an.byqj[9] = -4610932974196263977L;
        an.byqj[10] = -3694877322743888375L;
        an.byqj[11] = 7584673557576654750L;
        an.byqj[12] = -889385554141334374L;
        an.byqj[13] = -3252174310736715928L;
        an.byqj[14] = -5744636122922370143L;
        an.byqj[15] = 2257888773803850716L;
        an.byqj[16] = 7729712591181200957L;
        an.byqj[17] = 4494102775770095584L;
        an.byqj[18] = -2016011662794540420L;
        an.byqj[19] = 1785317219264105722L;
        an.byqj[20] = -5183268758609734929L;
        an.byqj[21] = -3811679760400144952L;
        an.byqj[22] = 1574071267628165201L;
        an.byqj[23] = -3523589648566777360L;
        an.byqj[24] = -5322221118346210327L;
        an.byqj[25] = -6840116944745189926L;
        an.byqj[26] = -3573393990612743286L;
        an.byqj[27] = -4189307147182193599L;
        an.byqj[28] = -465870633365078942L;
        an.byqj[29] = -6898480395975405081L;
        an.byqj[30] = 121308674878942581L;
        an.byqj[31] = -281585462502622983L;
        an.byqj[32] = -7993643462855762741L;
        an.byqj[33] = -1482540189598849232L;
        an.byqj[34] = -1122237106357173373L;
        an.byqj[35] = 4066774315479185127L;
        an.byqj[36] = 2191915987734842194L;
        an.byqj[37] = -5177929373998503074L;
        an.byqj[38] = -9061927261294132994L;
        an.byqj[39] = -8542198149606604720L;
        an.byqj[40] = -4433016246212521015L;
        an.byqj[41] = -6257786448651927827L;
        an.byqj[42] = 7883064389296939941L;
        an.byqj[43] = 9092305775406377418L;
        an.byqj[44] = 6975134874210551715L;
        an.byqj[45] = -2304649063341677408L;
        an.byqj[46] = 8910513565958726653L;
        an.byqj[47] = 3812381426702722972L;
        an.byqj[48] = 8924686180258879354L;
        an.byqj[49] = 4059413736719785440L;
        an.byqj[50] = -2813768631429163942L;
        an.byqj[51] = -5218885122700829885L;
        an.byqj[52] = -3409752637476035750L;
        an.byqj[53] = 5374920419758150592L;
        an.byqj[54] = -4515610771492351766L;
        an.byqj[55] = -2778557501264878458L;
        an.byqj[56] = -6115697121207537804L;
        an.byqj[57] = 4823041119535686004L;
        an.byqj[58] = 6775744682969222675L;
        an.byqj[59] = -8119746656575959355L;
        an.byqj[60] = -1096299255600924678L;
        an.byqj[61] = -6440277701258821207L;
        an.byqj[62] = 5200332275566123812L;
        an.byqj[63] = -6267175462275163689L;
        an.byqj[64] = 7325586644967163961L;
        an.byqj[65] = 8901458517043499523L;
        an.byqj[66] = -8630509043570284002L;
        an.byqj[67] = -5982215789663183408L;
        an.byqj[68] = -8800296887781164210L;
        an.byqj[69] = -7756414788041707912L;
        an.byqj[70] = 6193757209730473669L;
        an.byqj[71] = -1285897939047010722L;
        an.byqj[72] = 6040159872919624566L;
        an.byqj[73] = -2437205701208847012L;
        an.byqj[74] = 5693494692643918106L;
        an.byqj[75] = -5704061285374201882L;
        an.byqj[76] = 1796987681665877070L;
        an.byqj[77] = -2866188964572428080L;
        an.byqj[78] = -4396368750766873076L;
        an.byqj[79] = -2650278087007486797L;
        an.byqj[80] = -1745732824685473532L;
        an.byqj[81] = -3039877000027353343L;
        an.byqj[82] = -1459396048002650927L;
        an.byqj[83] = -3802394582234603713L;
        an.byqj[84] = -2877869225156116090L;
        an.byqj[85] = 1329587825467613872L;
        an.byqj[86] = -6951847289592765155L;
        an.byqj[87] = 2214244033809938168L;
        an.byqj[88] = -3206543071906275876L;
        an.byqj[89] = 1376068999888060805L;
        an.byqj[90] = -5200922992108888370L;
        an.byqj[91] = 4224657926172239003L;
        an.byqj[92] = -2569794427099727092L;
        an.byqj[93] = 875301287782472623L;
        an.byqj[94] = -8692988215666679172L;
        an.byqj[95] = 6021070148504035339L;
        an.byqj[96] = -7670093049168996485L;
        an.byqj[97] = 7369736403928596730L;
        an.byqj[98] = -8308257045350886514L;
        an.byqj[99] = 3153259029456716420L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setProxyEnabled(boolean var1_1) {
        v0 /* !! */  = an.fa;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - an.bypv("bzfi", byqi(int ), (int)99));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1383962475: {
                    v1 = an.bypv("bzfj", byqi(int ), (int)100);
                    continue block21;
                }
                case -10431202: {
                    v1 = an.bypv("bzfk", byqi(int ), (int)101);
                    continue block21;
                }
                case 1502967838: {
                    break block21;
                }
            }
            break;
        }
        var4_2 = an.c;
        v2 /* !! */  = an.fa;
        if (true) ** GOTO lbl19
        block22: while (true) {
            v2 /* !! */  = (long)(an.bypv("bzfm", byqi(int ), (int)103) - an.bypv("bzfl", byqi(int ), (int)102));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -483018137: {
                    continue block22;
                }
                case 1502967838: {
                    break block22;
                }
            }
            break;
        }
        var3_3 /* !! */  = an.b;
        v3 /* !! */  = an.fa;
        if (true) ** GOTO lbl29
        block23: while (true) {
            v3 /* !! */  = (long)(v4 - an.bypv("bzfn", byqi(int ), (int)104));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2021864807: {
                    v4 = an.bypv("bzfo", byqi(int ), (int)105);
                    continue block23;
                }
                case 361746208: {
                    v4 = an.bypv("bzfp", byqi(int ), (int)106);
                    continue block23;
                }
                case 1502967838: {
                    break block23;
                }
            }
            break;
        }
        var2_4 = an.a;
        if (var4_2) {
            throw null;
lbl41:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl41
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_0 = an.fa - an.bypv("bzfq", byqi(int ), (int)107)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == an.bypv("bzfr", byps(int ), (int)206)) break;
            v5 /* !! */  = (long)an.bypv("bzfs", byps(int ), (int)207);
        }
        this.proxyEnabled = var1_1;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
lbl56:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)an.bypv("bzft", byps(int ), (int)208);
                if (var4_2) {
                    throw null;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)an.bypv("bzfu", byps(int ), (int)209);
                if (!var4_2) ** GOTO lbl56
                throw null;
            }
lbl64:
            // 2 sources

            case 2: {
                do {
                    var3_3 /* !! */  = (int)an.bypv("bzfv", byps(int ), (int)210);
                } while (!var4_2);
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)an.bypv("bzfw", byps(int ), (int)211);
                if (!var4_2) ** GOTO lbl64
                throw null;
            }
            case 4: 
        }
        do {
            var3_3 /* !! */  = (int)an.bypv("bzfx", byps(int ), (int)212);
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setDefaultProxyAndSave(oh var1_1) {
        v0 /* !! */  = an.fa;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(an.bypv("bzag", byqi(int ), (int)67) - an.bypv("bzaf", byqi(int ), (int)66));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 637980907: {
                    continue block18;
                }
                case 1502967838: {
                    break block18;
                }
            }
            break;
        }
        var4_2 = an.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = an.fa - an.bypv("bzah", byqi(int ), (int)68)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == an.bypv("bzai", byps(int ), (int)153)) break;
            v1 /* !! */  = (long)an.bypv("bzaj", byps(int ), (int)154);
        }
        var3_3 /* !! */  = an.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = an.fa - an.bypv("bzak", byqi(int ), (int)69)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == an.bypv("bzal", byps(int ), (int)155)) break;
            v2 /* !! */  = (long)an.bypv("bzam", byps(int ), (int)156);
        }
        var2_4 = an.a;
        if (var4_2) {
            throw null;
lbl25:
            // 3 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl25
        v3 /* !! */  = an.fa;
        if (true) ** GOTO lbl32
        block22: while (true) {
            v3 /* !! */  = (long)(an.bypv("bzao", byqi(int ), (int)71) - an.bypv("bzan", byqi(int ), (int)70));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 1226689495: {
                    continue block22;
                }
                case 1502967838: {
                    break block22;
                }
            }
            break;
        }
        this.defaultProxy = var1_1;
        if (var2_4 || var2_4) ** GOTO lbl25
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = an.fa - an.bypv("bzap", byqi(int ), (int)72)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == an.bypv("bzaq", byps(int ), (int)157)) break;
            v4 /* !! */  = (long)an.bypv("bzar", byps(int ), (int)158);
        }
        this.save();
        ** while (var2_4 || var2_4)
lbl46:
        // 1 sources

        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl50:
            // 4 sources

            case 0: {
                var3_3 /* !! */  = (int)an.bypv("bzas", byps(int ), (int)159);
                if (var4_2) {
                    throw null;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)an.bypv("bzat", byps(int ), (int)160);
                if (!var4_2) ** GOTO lbl50
                throw null;
            }
lbl58:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)an.bypv("bzau", byps(int ), (int)161);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl72
            }
            case 3: {
                var3_3 /* !! */  = (int)an.bypv("bzav", byps(int ), (int)162);
                if (!var4_2) ** GOTO lbl58
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)an.bypv("bzaw", byps(int ), (int)163);
                    if (!var4_2) ** GOTO lbl50
                    throw null;
                }
            }
lbl72:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)an.bypv("bzax", byps(int ), (int)164);
                if (!var4_2) ** GOTO lbl50
                throw null;
            }
            case 6: {
                do {
                    var3_3 /* !! */  = (int)an.bypv("bzay", byps(int ), (int)165);
                } while (!var4_2);
                throw null;
            }
            case 7: 
        }
        var3_3 /* !! */  = (int)an.bypv("bzaz", byps(int ), (int)166);
        ** while (!var4_2)
lbl84:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bzip() {
        an.bypu[100] = 2017901203;
        an.bypu[101] = 459656171;
        an.bypu[102] = 314106590;
        an.bypu[103] = 1823436189;
        an.bypu[104] = 1874973683;
        an.bypu[105] = 1026640164;
        an.bypu[106] = 1041109196;
        an.bypu[107] = 1843473876;
        an.bypu[108] = 373450177;
        an.bypu[109] = -828707920;
        an.bypu[110] = 1419237519;
        an.bypu[111] = -982752854;
        an.bypu[112] = -1584078843;
        an.bypu[113] = -1318480715;
        an.bypu[114] = 2031941995;
        an.bypu[115] = -905924706;
        an.bypu[116] = -1010913226;
        an.bypu[117] = -1668051215;
        an.bypu[118] = 1528602648;
        an.bypu[119] = 85510447;
        an.bypu[120] = -1257818827;
        an.bypu[121] = -1041771085;
        an.bypu[122] = 938614977;
        an.bypu[123] = 1923386602;
        an.bypu[124] = -917449409;
        an.bypu[125] = 839171877;
        an.bypu[126] = -430528969;
        an.bypu[127] = -1622029467;
        an.bypu[128] = -664512530;
        an.bypu[129] = -1132327483;
        an.bypu[130] = -1561267620;
        an.bypu[131] = -1227975392;
        an.bypu[132] = 1297538661;
        an.bypu[133] = -1294290032;
        an.bypu[134] = 743042960;
        an.bypu[135] = 260001446;
        an.bypu[136] = 2115939286;
        an.bypu[137] = -551755044;
        an.bypu[138] = 1706078824;
        an.bypu[139] = 470641932;
        an.bypu[140] = -1658679155;
        an.bypu[141] = -1576542729;
        an.bypu[142] = -1887892453;
        an.bypu[143] = 1188671263;
        an.bypu[144] = -1674511091;
        an.bypu[145] = 1856075132;
        an.bypu[146] = -2104374204;
        an.bypu[147] = -390318628;
        an.bypu[148] = -181230727;
        an.bypu[149] = 997496808;
        an.bypu[150] = -778642714;
        an.bypu[151] = 348729380;
        an.bypu[152] = -2128917706;
        an.bypu[153] = -2139722431;
        an.bypu[154] = 1869732885;
        an.bypu[155] = -628147684;
        an.bypu[156] = -803570032;
        an.bypu[157] = -842325334;
        an.bypu[158] = -1928969297;
        an.bypu[159] = -2048539992;
        an.bypu[160] = 1654416904;
        an.bypu[161] = 908198386;
        an.bypu[162] = 305958597;
        an.bypu[163] = -366629420;
        an.bypu[164] = -1414658230;
        an.bypu[165] = 1674517334;
        an.bypu[166] = -944225158;
        an.bypu[167] = -451822442;
        an.bypu[168] = -2135645921;
        an.bypu[169] = 903387709;
        an.bypu[170] = 1384685640;
        an.bypu[171] = -1364833940;
        an.bypu[172] = -519447538;
        an.bypu[173] = -1674473518;
        an.bypu[174] = -680746652;
        an.bypu[175] = 1482527780;
        an.bypu[176] = -538825493;
        an.bypu[177] = 1153306312;
        an.bypu[178] = 1664951116;
        an.bypu[179] = -1774107147;
        an.bypu[180] = 463706515;
        an.bypu[181] = -131829280;
        an.bypu[182] = -1362040341;
        an.bypu[183] = 2107663450;
        an.bypu[184] = -2110663129;
        an.bypu[185] = 1230133989;
        an.bypu[186] = -971763725;
        an.bypu[187] = -88499500;
        an.bypu[188] = -1430756499;
        an.bypu[189] = -836760356;
        an.bypu[190] = 1676264310;
        an.bypu[191] = -1350763864;
        an.bypu[192] = -1337721871;
        an.bypu[193] = 1861846878;
        an.bypu[194] = 1679297660;
        an.bypu[195] = -1267239671;
        an.bypu[196] = 1255266450;
        an.bypu[197] = 331423818;
        an.bypu[198] = -300055502;
        an.bypu[199] = 1827772237;
    }

    private static /* synthetic */ int byps(int n2) {
        return bypt[n2] ^ bypu[n2];
    }

    private static /* synthetic */ void bzin() {
        an.bypt[200] = -828585467;
        an.bypt[201] = 2000195042;
        an.bypt[202] = -219214195;
        an.bypt[203] = -1769881396;
        an.bypt[204] = 1619453829;
        an.bypt[205] = -1979541162;
        an.bypt[206] = 685115631;
        an.bypt[207] = -1966823977;
        an.bypt[208] = -1129598450;
        an.bypt[209] = -167352693;
        an.bypt[210] = 858230001;
        an.bypt[211] = 1596014291;
        an.bypt[212] = -971453671;
        an.bypt[213] = 2096241415;
        an.bypt[214] = -1822698350;
        an.bypt[215] = 2032055622;
        an.bypt[216] = -707730854;
        an.bypt[217] = -641011788;
        an.bypt[218] = -659288369;
        an.bypt[219] = 1320748533;
        an.bypt[220] = 504980323;
        an.bypt[221] = -1039273622;
        an.bypt[222] = 1489034402;
        an.bypt[223] = 1487570515;
        an.bypt[224] = 1586990226;
        an.bypt[225] = 1580118990;
        an.bypt[226] = -1958062869;
        an.bypt[227] = 1408449460;
        an.bypt[228] = -1757361409;
        an.bypt[229] = 1998103705;
        an.bypt[230] = 688762860;
        an.bypt[231] = -566425455;
        an.bypt[232] = 953926711;
        an.bypt[233] = -1690811286;
        an.bypt[234] = 1583619830;
        an.bypt[235] = 1041780830;
        an.bypt[236] = 1691412998;
        an.bypt[237] = 1787653061;
        an.bypt[238] = 1045521887;
    }

    private static /* synthetic */ void bziu() {
        an.byqk[100] = 7526523340384601656L;
        an.byqk[101] = -5091587104683648936L;
        an.byqk[102] = -4037362669757878030L;
        an.byqk[103] = 7182486664462112266L;
        an.byqk[104] = 3471097533408858978L;
        an.byqk[105] = 8907260509146807750L;
        an.byqk[106] = -1701452924272619278L;
        an.byqk[107] = -5695501142893836659L;
        an.byqk[108] = 2858251967786259064L;
        an.byqk[109] = 5654873227947519111L;
        an.byqk[110] = -6768779443054743496L;
        an.byqk[111] = -5101347454233589260L;
        an.byqk[112] = -1877165495328298840L;
        an.byqk[113] = 5553315147833499400L;
        an.byqk[114] = 5493726027837720384L;
        an.byqk[115] = 4789762634673553680L;
        an.byqk[116] = -1171667281863568327L;
        an.byqk[117] = -3851022632536084153L;
        an.byqk[118] = 1358383590177263902L;
        an.byqk[119] = -2151584160863761789L;
        an.byqk[120] = -3482403814207140941L;
        an.byqk[121] = -6724307596456695212L;
        an.byqk[122] = -9132152845381866302L;
        an.byqk[123] = -5833484346693046900L;
        an.byqk[124] = 1516258654623131409L;
        an.byqk[125] = 8938854273229799676L;
        an.byqk[126] = 538861124338248963L;
        an.byqk[127] = -2571579048594993991L;
        an.byqk[128] = -5242207832790824023L;
        an.byqk[129] = 8685046962637613828L;
        an.byqk[130] = 8013858350169242511L;
        an.byqk[131] = -4222298960559452980L;
        an.byqk[132] = 6315137232053993694L;
        an.byqk[133] = 3829254602466227996L;
        an.byqk[134] = -4674021744378432936L;
        an.byqk[135] = 4285573245645383033L;
        an.byqk[136] = -689641681426794655L;
        an.byqk[137] = -700600861114496911L;
        an.byqk[138] = -1913814160008849211L;
        an.byqk[139] = 7860520316442428997L;
        an.byqk[140] = -5924590715906108379L;
        an.byqk[141] = -1850588267256609774L;
        an.byqk[142] = -426808801429782070L;
        an.byqk[143] = -7315190625356919784L;
        an.byqk[144] = 8283336625551708560L;
        an.byqk[145] = -305997208651312004L;
        an.byqk[146] = 6461585341856196826L;
    }

    /*
     * Handled duff style switch with additional control
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public void setProxyEnabledAndSave(boolean bl2) {
        boolean bl3;
        Object object = fa;
        boolean bl4 = true;
        block21: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object = callSite - an.bypv("bzba", byqi(int ), (int)73);
            }
            switch ((int)object) {
                case -110300524: {
                    callSite = an.bypv("bzbb", byqi(int ), (int)74);
                    continue block21;
                }
                case 1017150606: {
                    callSite = an.bypv("bzbc", byqi(int ), (int)75);
                    continue block21;
                }
                case 1114742617: {
                    callSite = an.bypv("bzbd", byqi(int ), (int)76);
                    continue block21;
                }
                case 1502967838: {
                    break block21;
                }
            }
            break;
        }
        boolean bl5 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = fa - an.bypv("bzbe", byqi(int ), (int)77)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == an.bypv("bzbf", byps(int ), (int)167)) break;
            object2 = an.bypv("bzbg", byps(int ), (int)168);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = fa - an.bypv("bzbh", byqi(int ), (int)78)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == an.bypv("bzbi", byps(int ), (int)169)) {
                bl3 = a;
                if (bl5) {
                    throw null;
                }
                break;
            }
            object3 = an.bypv("bzbj", byps(int ), (int)170);
        }
        if (bl3 || bl3) return;
        Object object4 = fa;
        boolean bl6 = true;
        block24: while (true) {
            CallSite callSite;
            if (!bl6 || (bl6 = false) || !true) {
                object4 = callSite - an.bypv("bzbk", byqi(int ), (int)79);
            }
            switch ((int)object4) {
                case -1338232902: {
                    callSite = an.bypv("bzbl", byqi(int ), (int)80);
                    continue block24;
                }
                case 36732075: {
                    callSite = an.bypv("bzbm", byqi(int ), (int)81);
                    continue block24;
                }
                case 1502967838: {
                    break block24;
                }
            }
            break;
        }
        this.proxyEnabled = bl2;
        if (bl3 || bl3) return;
        while (true) {
            long l4;
            Object object5;
            if ((object5 = (l4 = fa - an.bypv("bzbn", byqi(int ), (int)82)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object5 == an.bypv("bzbo", byps(int ), (int)171)) {
                this.save();
                if (bl3) return;
                break;
            }
            object5 = an.bypv("bzbp", byps(int ), (int)172);
        }
        if (bl3) {
            return;
        }
        boolean bl7 = true;
        block26: do {
            int n3;
            if (bl7 && !(bl7 = false)) {
                if (n2 == 0) return;
                n3 = Integer.MIN_VALUE;
            }
            switch (n3 == Integer.MIN_VALUE ? n2 : n3) {
                default: {
                    return;
                }
                case 0: {
                    CallSite callSite = an.bypv("bzbq", byps(int ), (int)173);
                    n3 = 5;
                    if (!bl5) continue block26;
                    throw null;
                }
                case 1: {
                    CallSite callSite = an.bypv("bzbr", byps(int ), (int)174);
                    n3 = 4;
                    if (!bl5) continue block26;
                    throw null;
                }
                case 2: {
                    do {
                        CallSite callSite = an.bypv("bzbs", byps(int ), (int)175);
                    } while (!bl5);
                    throw null;
                }
                case 3: {
                    CallSite callSite = an.bypv("bzbt", byps(int ), (int)176);
                    n3 = 5;
                    if (!bl5) continue block26;
                    throw null;
                }
                case 4: {
                    CallSite callSite = an.bypv("bzbu", byps(int ), (int)177);
                    if (bl5) {
                        throw null;
                    }
                }
                case 5: {
                    CallSite callSite = an.bypv("bzbv", byps(int ), (int)178);
                    if (!bl5) break;
                    throw null;
                }
                case 6: {
                    CallSite callSite = an.bypv("bzbw", byps(int ), (int)179);
                    if (!bl5) break;
                    throw null;
                }
                case 7: 
            }
            break;
        } while (true);
        do {
            CallSite callSite = an.bypv("bzbx", byps(int ), (int)180);
        } while (!bl5);
        throw null;
    }

    /*
     * Exception decompiling
     */
    private oh parseProxy(JsonObject var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 45[SWITCH]
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
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isProxyEnabled() {
        v0 /* !! */  = an.fa;
        if (true) ** GOTO lbl5
        block11: while (true) {
            v0 /* !! */  = (long)(v1 - an.bypv("bzer", byqi(int ), (int)93));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -957068036: {
                    v1 = an.bypv("bzes", byqi(int ), (int)94);
                    continue block11;
                }
                case -641210856: {
                    v1 = an.bypv("bzet", byqi(int ), (int)95);
                    continue block11;
                }
                case 1502967838: {
                    break block11;
                }
            }
            break;
        }
        var3_1 = an.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = an.fa - an.bypv("bzeu", byqi(int ), (int)96)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == an.bypv("bzev", byps(int ), (int)195)) break;
            v2 /* !! */  = (long)an.bypv("bzew", byps(int ), (int)196);
        }
        var2_2 /* !! */  = an.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = an.fa - an.bypv("bzex", byqi(int ), (int)97)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == an.bypv("bzey", byps(int ), (int)197)) break;
            v3 /* !! */  = (long)an.bypv("bzez", byps(int ), (int)198);
        }
        var1_3 = an.a;
        if (var3_1) {
            throw null;
lbl31:
            // 2 sources

            return (boolean)an.bypv("bzfa", byps(int ), (int)199);
        }
        if (var1_3) ** GOTO lbl31
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = an.fa - an.bypv("bzfb", byqi(int ), (int)98)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == an.bypv("bzfc", byps(int ), (int)200)) break;
                    v4 /* !! */  = (long)an.bypv("bzfd", byps(int ), (int)201);
                }
                return this.proxyEnabled;
            }
lbl45:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)an.bypv("bzfe", byps(int ), (int)202);
                if (var3_1) {
                    throw null;
                }
            }
lbl49:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)an.bypv("bzff", byps(int ), (int)203);
                if (!var3_1) ** GOTO lbl45
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)an.bypv("bzfg", byps(int ), (int)204);
                if (!var3_1) ** GOTO lbl49
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)an.bypv("bzfh", byps(int ), (int)205);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void bzit() {
        an.byqk[0] = 5333711013380126416L;
        an.byqk[1] = 513149985307083506L;
        an.byqk[2] = 1745923074006988390L;
        an.byqk[3] = -1584701403735692437L;
        an.byqk[4] = -3525671848027827991L;
        an.byqk[5] = 1425292509861648970L;
        an.byqk[6] = -1252690062842807802L;
        an.byqk[7] = 8286554248901984031L;
        an.byqk[8] = 6280613589894044446L;
        an.byqk[9] = -1647119879668898478L;
        an.byqk[10] = -1242219552753356451L;
        an.byqk[11] = 7963093479456100951L;
        an.byqk[12] = -5032942859577886453L;
        an.byqk[13] = 8020330335927990818L;
        an.byqk[14] = -3246716023511438127L;
        an.byqk[15] = 7993503520377293343L;
        an.byqk[16] = 369680221159122105L;
        an.byqk[17] = 519070354147627904L;
        an.byqk[18] = -4250629726345657610L;
        an.byqk[19] = 7902589355034775195L;
        an.byqk[20] = -5780851107369062661L;
        an.byqk[21] = 8857186063263577074L;
        an.byqk[22] = -5397220888469235469L;
        an.byqk[23] = 7663643817942451409L;
        an.byqk[24] = -6120160762928224061L;
        an.byqk[25] = -841767352391363969L;
        an.byqk[26] = 6860289858237317332L;
        an.byqk[27] = 4210226248875324381L;
        an.byqk[28] = -7252418248883336057L;
        an.byqk[29] = 2928670010608840991L;
        an.byqk[30] = 5453869297238240558L;
        an.byqk[31] = -1529797497724128998L;
        an.byqk[32] = -3142088281331410172L;
        an.byqk[33] = 4451900826648090621L;
        an.byqk[34] = -6365901076877284342L;
        an.byqk[35] = -7274943323544478121L;
        an.byqk[36] = 8834203088540177469L;
        an.byqk[37] = -7145646710925014529L;
        an.byqk[38] = -4829887881573714333L;
        an.byqk[39] = -8753301515609092449L;
        an.byqk[40] = -2977456103047519701L;
        an.byqk[41] = -7450342552890690954L;
        an.byqk[42] = 8187462711392325779L;
        an.byqk[43] = 1035276762952825688L;
        an.byqk[44] = -8727547485157817719L;
        an.byqk[45] = -2107095891377051654L;
        an.byqk[46] = 6696340260502185429L;
        an.byqk[47] = -5963347347623904916L;
        an.byqk[48] = -7602157557667683275L;
        an.byqk[49] = -6139275915610795802L;
        an.byqk[50] = -2457867871294258999L;
        an.byqk[51] = -8339022814197570106L;
        an.byqk[52] = 5958297148187862961L;
        an.byqk[53] = -1221735562347423783L;
        an.byqk[54] = 5669604319192552436L;
        an.byqk[55] = -7997274744128151079L;
        an.byqk[56] = 3893752033790701475L;
        an.byqk[57] = 2691495200096391741L;
        an.byqk[58] = 8183592550326436181L;
        an.byqk[59] = -7209911916831675739L;
        an.byqk[60] = 647683496398542706L;
        an.byqk[61] = -2505387393470791553L;
        an.byqk[62] = 7897005543658232208L;
        an.byqk[63] = 2676212114155568393L;
        an.byqk[64] = -1436727758226278570L;
        an.byqk[65] = -3587499451764882009L;
        an.byqk[66] = -5156403406056952143L;
        an.byqk[67] = 5406586401026325197L;
        an.byqk[68] = 8037662014904001411L;
        an.byqk[69] = 1063425409299182896L;
        an.byqk[70] = 3831146562727338630L;
        an.byqk[71] = 4837337369087204373L;
        an.byqk[72] = 5741112600939019403L;
        an.byqk[73] = 2390625630758959655L;
        an.byqk[74] = 8337922261566132054L;
        an.byqk[75] = 7867115512435601983L;
        an.byqk[76] = -3880415058557703899L;
        an.byqk[77] = 7799815094028690819L;
        an.byqk[78] = 4225465026927098107L;
        an.byqk[79] = -1878724892509112893L;
        an.byqk[80] = 1967757915338346522L;
        an.byqk[81] = -1405538020888049066L;
        an.byqk[82] = -151181513636198560L;
        an.byqk[83] = 4531556699571622848L;
        an.byqk[84] = -2110877580448779367L;
        an.byqk[85] = 2699158879474641104L;
        an.byqk[86] = -396018222437860351L;
        an.byqk[87] = -3453309242551095275L;
        an.byqk[88] = 1421671084261891L;
        an.byqk[89] = 7555835295552394517L;
        an.byqk[90] = -9054842241268274673L;
        an.byqk[91] = 6332639028098588945L;
        an.byqk[92] = 7729599916046368757L;
        an.byqk[93] = -9179670544896501241L;
        an.byqk[94] = -7664847009052481962L;
        an.byqk[95] = -4283609360541287740L;
        an.byqk[96] = -5590594113185171970L;
        an.byqk[97] = 434608969172390527L;
        an.byqk[98] = -7533203232322937350L;
        an.byqk[99] = 8176242760317896781L;
    }

    /*
     * Exception decompiling
     */
    public void load() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 4[CASE]
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

    private static /* synthetic */ void bzil() {
        an.bypt[0] = -1713386099;
        an.bypt[1] = -2142738992;
        an.bypt[2] = -1373558889;
        an.bypt[3] = 193943196;
        an.bypt[4] = -433224975;
        an.bypt[5] = -1267708285;
        an.bypt[6] = -1389386594;
        an.bypt[7] = -191101011;
        an.bypt[8] = -522533619;
        an.bypt[9] = 1035611994;
        an.bypt[10] = 1521331220;
        an.bypt[11] = -969004488;
        an.bypt[12] = 2137761319;
        an.bypt[13] = 342476969;
        an.bypt[14] = -310594967;
        an.bypt[15] = 1393644414;
        an.bypt[16] = -2138293182;
        an.bypt[17] = 777270154;
        an.bypt[18] = -1335226286;
        an.bypt[19] = -444090472;
        an.bypt[20] = 1153490598;
        an.bypt[21] = 595213995;
        an.bypt[22] = -1365155021;
        an.bypt[23] = 1308850952;
        an.bypt[24] = 549645244;
        an.bypt[25] = -601610841;
        an.bypt[26] = 2129001604;
        an.bypt[27] = 256843838;
        an.bypt[28] = 2125874899;
        an.bypt[29] = 1711733086;
        an.bypt[30] = 800349609;
        an.bypt[31] = -1693906368;
        an.bypt[32] = -1038397461;
        an.bypt[33] = -1099168623;
        an.bypt[34] = -1468858920;
        an.bypt[35] = -1683057575;
        an.bypt[36] = -291692493;
        an.bypt[37] = -256274445;
        an.bypt[38] = 2141073404;
        an.bypt[39] = 750660810;
        an.bypt[40] = -393961511;
        an.bypt[41] = 73063567;
        an.bypt[42] = -1235299692;
        an.bypt[43] = 2144593445;
        an.bypt[44] = -1846287450;
        an.bypt[45] = 525044407;
        an.bypt[46] = 755258072;
        an.bypt[47] = -274156162;
        an.bypt[48] = -1233128455;
        an.bypt[49] = -866403819;
        an.bypt[50] = 1147060514;
        an.bypt[51] = -1414804033;
        an.bypt[52] = -1216519730;
        an.bypt[53] = -1773961430;
        an.bypt[54] = -595722483;
        an.bypt[55] = -697249681;
        an.bypt[56] = -1850323298;
        an.bypt[57] = 1144093582;
        an.bypt[58] = -165196989;
        an.bypt[59] = 1302643768;
        an.bypt[60] = 1468451536;
        an.bypt[61] = -1704349841;
        an.bypt[62] = 1772268051;
        an.bypt[63] = -1226373450;
        an.bypt[64] = -221860745;
        an.bypt[65] = 2083969411;
        an.bypt[66] = -275385111;
        an.bypt[67] = -1459442079;
        an.bypt[68] = -1363785940;
        an.bypt[69] = 767686546;
        an.bypt[70] = -1480879727;
        an.bypt[71] = 1607995222;
        an.bypt[72] = 227910683;
        an.bypt[73] = -1853309969;
        an.bypt[74] = 698291611;
        an.bypt[75] = -770877724;
        an.bypt[76] = 233054392;
        an.bypt[77] = -10154803;
        an.bypt[78] = 1298815369;
        an.bypt[79] = -442993885;
        an.bypt[80] = -1430218776;
        an.bypt[81] = 2007294238;
        an.bypt[82] = 1383186503;
        an.bypt[83] = 44284166;
        an.bypt[84] = -541033936;
        an.bypt[85] = -858583936;
        an.bypt[86] = -287918138;
        an.bypt[87] = 913440325;
        an.bypt[88] = 1024882136;
        an.bypt[89] = 264688765;
        an.bypt[90] = -2088520418;
        an.bypt[91] = 1090394835;
        an.bypt[92] = 2068289605;
        an.bypt[93] = 1285118408;
        an.bypt[94] = 171257979;
        an.bypt[95] = 1130169235;
        an.bypt[96] = -130545763;
        an.bypt[97] = 159200350;
        an.bypt[98] = -59283712;
        an.bypt[99] = -1045891232;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setDefaultProxy(oh var1_1) {
        v0 /* !! */  = an.fa;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - an.bypv("bzgp", byqi(int ), (int)117));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -442393116: {
                    v1 = an.bypv("bzgq", byqi(int ), (int)118);
                    continue block20;
                }
                case 714273408: {
                    v1 = an.bypv("bzgr", byqi(int ), (int)119);
                    continue block20;
                }
                case 1502967838: {
                    break block20;
                }
            }
            break;
        }
        var4_2 = an.c;
        v2 /* !! */  = an.fa;
        if (true) ** GOTO lbl19
        block21: while (true) {
            v2 /* !! */  = (long)(an.bypv("bzgt", byqi(int ), (int)121) - an.bypv("bzgs", byqi(int ), (int)120));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -706243708: {
                    continue block21;
                }
                case 1502967838: {
                    break block21;
                }
            }
            break;
        }
        var3_3 /* !! */  = an.b;
        v3 /* !! */  = an.fa;
        if (true) ** GOTO lbl29
        block22: while (true) {
            v3 /* !! */  = (long)(an.bypv("bzgv", byqi(int ), (int)123) - an.bypv("bzgu", byqi(int ), (int)122));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 716197491: {
                    continue block22;
                }
                case 1502967838: {
                    break block22;
                }
            }
            break;
        }
        var2_4 = an.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
lbl40:
                    // 2 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl40
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = an.fa - an.bypv("bzgw", byqi(int ), (int)124)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == an.bypv("bzgx", byps(int ), (int)221)) break;
                    v4 /* !! */  = (long)an.bypv("bzgy", byps(int ), (int)222);
                }
                this.defaultProxy = var1_1;
                if (!var2_4) ** break;
                ** continue;
                return;
            }
lbl52:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)an.bypv("bzgz", byps(int ), (int)223);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl65
            }
lbl57:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)an.bypv("bzha", byps(int ), (int)224);
                if (!var4_2) ** GOTO lbl52
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)an.bypv("bzhb", byps(int ), (int)225);
                if (!var4_2) break;
                throw null;
            }
lbl65:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)an.bypv("bzhc", byps(int ), (int)226);
                    if (!var4_2) ** GOTO lbl57
                    throw null;
                }
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)an.bypv("bzhd", byps(int ), (int)227);
        ** while (!var4_2)
lbl73:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bziq() {
        an.bypu[200] = -828585468;
        an.bypu[201] = -430947396;
        an.bypu[202] = -219214195;
        an.bypu[203] = -1769881393;
        an.bypu[204] = 1619453830;
        an.bypu[205] = -1979541164;
        an.bypu[206] = 685115630;
        an.bypu[207] = -162169842;
        an.bypu[208] = -1129598451;
        an.bypu[209] = -167352689;
        an.bypu[210] = 858230005;
        an.bypu[211] = 1596014291;
        an.bypu[212] = -971453672;
        an.bypu[213] = 2096241414;
        an.bypu[214] = 429126425;
        an.bypu[215] = 2032055623;
        an.bypu[216] = -575594242;
        an.bypu[217] = -641011786;
        an.bypu[218] = -659288372;
        an.bypu[219] = 1320748533;
        an.bypu[220] = 504980321;
        an.bypu[221] = -1039273621;
        an.bypu[222] = 1662331736;
        an.bypu[223] = 1487570512;
        an.bypu[224] = 1586990224;
        an.bypu[225] = 1580118988;
        an.bypu[226] = -1958062871;
        an.bypu[227] = 1408449463;
        an.bypu[228] = -1757361410;
        an.bypu[229] = 1382339564;
        an.bypu[230] = 688762860;
        an.bypu[231] = -566425454;
        an.bypu[232] = 953926708;
        an.bypu[233] = -1690811288;
        an.bypu[234] = 1583619830;
        an.bypu[235] = 1041780828;
        an.bypu[236] = 1691412994;
        an.bypu[237] = 1787653062;
        an.bypu[238] = 1045521885;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setLastUsedProxy(oh var1_1) {
        v0 /* !! */  = an.fa;
        if (true) ** GOTO lbl5
        block26: while (true) {
            v0 /* !! */  = (long)(v1 - an.bypv("bzhv", byqi(int ), (int)136));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -582821501: {
                    v1 = an.bypv("bzhw", byqi(int ), (int)137);
                    continue block26;
                }
                case 1502967838: {
                    break block26;
                }
                case 1599552850: {
                    v1 = an.bypv("bzhx", byqi(int ), (int)138);
                    continue block26;
                }
            }
            break;
        }
        var4_2 = an.c;
        v2 /* !! */  = an.fa;
        if (true) ** GOTO lbl19
        block27: while (true) {
            v2 /* !! */  = (long)(an.bypv("bzhz", byqi(int ), (int)140) - an.bypv("bzhy", byqi(int ), (int)139));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1736543494: {
                    continue block27;
                }
                case 1502967838: {
                    break block27;
                }
            }
            break;
        }
        var3_3 /* !! */  = an.b;
        v3 /* !! */  = an.fa;
        if (true) ** GOTO lbl29
        block28: while (true) {
            v3 /* !! */  = (long)(an.bypv("bzib", byqi(int ), (int)142) - an.bypv("bzia", byqi(int ), (int)141));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -517717515: {
                    continue block28;
                }
                case 1502967838: {
                    break block28;
                }
            }
            break;
        }
        var2_4 = an.a;
        if (var4_2) {
            throw null;
lbl37:
            // 2 sources

            return;
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl37
                v4 /* !! */  = an.fa;
                if (true) ** GOTO lbl47
                block30: while (true) {
                    v4 /* !! */  = (long)(v5 - an.bypv("bzic", byqi(int ), (int)143));
lbl47:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1888601386: {
                            v5 = an.bypv("bzid", byqi(int ), (int)144);
                            continue block30;
                        }
                        case 1502967838: {
                            break block30;
                        }
                        case 1876380414: {
                            v5 = an.bypv("bzie", byqi(int ), (int)145);
                            continue block30;
                        }
                        case 2126241863: {
                            v5 = an.bypv("bzif", byqi(int ), (int)146);
                            continue block30;
                        }
                    }
                    break;
                }
                this.lastUsedProxy = var1_1;
                if (!var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                do {
                    var3_3 /* !! */  = (int)an.bypv("bzig", byps(int ), (int)234);
                } while (!var4_2);
                throw null;
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)an.bypv("bzih", byps(int ), (int)235);
                } while (!var4_2);
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)an.bypv("bzii", byps(int ), (int)236);
                if (var4_2) {
                    throw null;
                }
            }
            case 3: {
                do {
                    var3_3 /* !! */  = (int)an.bypv("bzij", byps(int ), (int)237);
                } while (!var4_2);
                throw null;
            }
            case 4: 
        }
        do {
            var3_3 /* !! */  = (int)an.bypv("bzik", byps(int ), (int)238);
        } while (!var4_2);
        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void setLastUsedProxyAndSave(oh var1_1) {
        v0 /* !! */  = an.fa;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - an.bypv("bzby", byqi(int ), (int)83));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1766661705: {
                    v1 = an.bypv("bzbz", byqi(int ), (int)84);
                    continue block21;
                }
                case 239048660: {
                    v1 = an.bypv("bzca", byqi(int ), (int)85);
                    continue block21;
                }
                case 1502967838: {
                    break block21;
                }
            }
            break;
        }
        var4_2 = an.c;
        v2 /* !! */  = an.fa;
        if (true) ** GOTO lbl19
        block22: while (true) {
            v2 /* !! */  = (long)(v3 - an.bypv("bzcb", byqi(int ), (int)86));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -694477851: {
                    v3 = an.bypv("bzcc", byqi(int ), (int)87);
                    continue block22;
                }
                case 1502967838: {
                    break block22;
                }
                case 1829923520: {
                    v3 = an.bypv("bzcd", byqi(int ), (int)88);
                    continue block22;
                }
                case 2119029250: {
                    v3 = an.bypv("bzce", byqi(int ), (int)89);
                    continue block22;
                }
            }
            break;
        }
        var3_3 /* !! */  = an.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = an.fa - an.bypv("bzcf", byqi(int ), (int)90)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == an.bypv("bzcg", byps(int ), (int)181)) {
                var2_4 = an.a;
                if (var4_2) {
                    throw null;
                }
                break;
            }
            v4 /* !! */  = (long)an.bypv("bzch", byps(int ), (int)182);
        }
        if (var2_4 || var2_4) return;
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_2 = an.fa - an.bypv("bzci", byqi(int ), (int)91)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == an.bypv("bzcj", byps(int ), (int)183)) {
                this.lastUsedProxy = var1_1;
                if (var2_4) return;
                break;
            }
            v5 /* !! */  = (long)an.bypv("bzck", byps(int ), (int)184);
        }
        if (var2_4) return;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block25: while (true) {
            block46: {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            if ((v6 /* !! */  = (cfr_temp_3 = an.fa - an.bypv("bzcl", byqi(int ), (int)92)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v6 /* !! */  == an.bypv("bzcm", byps(int ), (int)185)) {
                                this.save();
                                if (var2_4) return;
                                break;
                            }
                            v6 /* !! */  = (long)an.bypv("bzcn", byps(int ), (int)186);
                        }
                        if (!var2_4) return;
                        return;
                    }
                    case 0: {
                        ** GOTO lbl89
                    }
                    case 2: {
                        var3_3 /* !! */  = (int)an.bypv("bzel", byps(int ), (int)189);
                        cfr_temp_0 = 5;
                        if (var4_2) {
                            throw null;
                        }
                        break block46;
                    }
                    case 6: {
                        var3_3 /* !! */  = (int)an.bypv("bzep", byps(int ), (int)193);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 5: {
                        var3_3 /* !! */  = (int)an.bypv("bzeo", byps(int ), (int)192);
                        if (!var4_2) ** break;
                        throw null;
                    }
                    case 7: {
                        var3_3 /* !! */  = (int)an.bypv("bzeq", byps(int ), (int)194);
                        if (var4_2) {
                            throw null;
                        }
lbl89:
                        // 3 sources

                        var3_3 /* !! */  = (int)an.bypv("bzej", byps(int ), (int)187);
                        cfr_temp_0 = 4;
                        if (var4_2) {
                            throw null;
                        }
                        break block46;
                    }
                    case 1: {
                        var3_3 /* !! */  = (int)an.bypv("bzek", byps(int ), (int)188);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 4: {
                        var3_3 /* !! */  = (int)an.bypv("bzen", byps(int ), (int)191);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 3: 
                }
                ** GOTO lbl107
            }
            do {
                if (true) continue block25;
lbl107:
                // 2 sources

                var3_3 /* !! */  = (int)an.bypv("bzem", byps(int ), (int)190);
                cfr_temp_0 = 1;
            } while (!var4_2);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public oh getLastUsedProxy() {
        v0 /* !! */  = an.fa;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - an.bypv("bzhe", byqi(int ), (int)125));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1163741471: {
                    v1 = an.bypv("bzhf", byqi(int ), (int)126);
                    continue block22;
                }
                case 396691537: {
                    v1 = an.bypv("bzhg", byqi(int ), (int)127);
                    continue block22;
                }
                case 1502967838: {
                    break block22;
                }
            }
            break;
        }
        var3_1 = an.c;
        v2 /* !! */  = an.fa;
        if (true) ** GOTO lbl19
        block23: while (true) {
            v2 /* !! */  = (long)(v3 - an.bypv("bzhh", byqi(int ), (int)128));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1276551930: {
                    v3 = an.bypv("bzhi", byqi(int ), (int)129);
                    continue block23;
                }
                case -876828738: {
                    v3 = an.bypv("bzhj", byqi(int ), (int)130);
                    continue block23;
                }
                case 451623648: {
                    v3 = an.bypv("bzhk", byqi(int ), (int)131);
                    continue block23;
                }
                case 1502967838: {
                    break block23;
                }
            }
            break;
        }
        var2_2 /* !! */  = an.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = an.fa - an.bypv("bzhl", byqi(int ), (int)132)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == an.bypv("bzhm", byps(int ), (int)228)) break;
            v4 /* !! */  = (long)an.bypv("bzhn", byps(int ), (int)229);
        }
        var1_3 = an.a;
        if (var3_1) {
            throw null;
lbl41:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl41
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block11 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v5 /* !! */  = an.fa;
                if (true) ** GOTO lbl52
                block26: while (true) {
                    v5 /* !! */  = (long)(v6 - an.bypv("bzho", byqi(int ), (int)133));
lbl52:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -325860838: {
                            v6 = an.bypv("bzhp", byqi(int ), (int)134);
                            continue block26;
                        }
                        case 1481626965: {
                            v6 = an.bypv("bzhq", byqi(int ), (int)135);
                            continue block26;
                        }
                        case 1502967838: {
                            break block26;
                        }
                    }
                    break;
                }
                return this.lastUsedProxy;
            }
            case 0: {
                var2_2 /* !! */  = (int)an.bypv("bzhr", byps(int ), (int)230);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)an.bypv("bzhs", byps(int ), (int)231);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)an.bypv("bzht", byps(int ), (int)232);
                    if (!var3_1) break block11;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)an.bypv("bzhu", byps(int ), (int)233);
        ** while (!var3_1)
lbl78:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long byqi(int n2) {
        return byqj[n2] ^ byqk[n2];
    }

    public static /* synthetic */ CallSite bypv(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public oh getDefaultProxy() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = an.fa - an.bypv("bzfy", byqi(int ), (int)108)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == an.bypv("bzfz", byps(int ), (int)213)) break;
            v0 /* !! */  = (long)an.bypv("bzga", byps(int ), (int)214);
        }
        var3_1 = an.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = an.fa - an.bypv("bzgb", byqi(int ), (int)109)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == an.bypv("bzgc", byps(int ), (int)215)) break;
            v1 /* !! */  = (long)an.bypv("bzgd", byps(int ), (int)216);
        }
        var2_2 /* !! */  = an.b;
        v2 /* !! */  = an.fa;
        if (true) ** GOTO lbl19
        block19: while (true) {
            v2 /* !! */  = (long)(v3 - an.bypv("bzge", byqi(int ), (int)110));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -830910887: {
                    v3 = an.bypv("bzgf", byqi(int ), (int)111);
                    continue block19;
                }
                case 453741217: {
                    v3 = an.bypv("bzgg", byqi(int ), (int)112);
                    continue block19;
                }
                case 1502967838: {
                    break block19;
                }
                case 1586264296: {
                    v3 = an.bypv("bzgh", byqi(int ), (int)113);
                    continue block19;
                }
            }
            break;
        }
        var1_3 = an.a;
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
                v4 /* !! */  = an.fa;
                if (true) ** GOTO lbl45
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - an.bypv("bzgi", byqi(int ), (int)114));
lbl45:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1778304519: {
                            v5 = an.bypv("bzgj", byqi(int ), (int)115);
                            continue block21;
                        }
                        case 1502967838: {
                            break block21;
                        }
                        case 1506032148: {
                            v5 = an.bypv("bzgk", byqi(int ), (int)116);
                            continue block21;
                        }
                    }
                    break;
                }
                return this.defaultProxy;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)an.bypv("bzgl", byps(int ), (int)217);
                } while (!var3_1);
                throw null;
            }
lbl60:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)an.bypv("bzgm", byps(int ), (int)218);
                if (!var3_1) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)an.bypv("bzgn", byps(int ), (int)219);
                    if (!var3_1) ** GOTO lbl60
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)an.bypv("bzgo", byps(int ), (int)220);
        ** while (!var3_1)
lbl72:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bzis() {
        an.byqj[100] = -3293602932715008915L;
        an.byqj[101] = 1910675938279834511L;
        an.byqj[102] = 4519464434426336691L;
        an.byqj[103] = -5871777374595993508L;
        an.byqj[104] = 504095290312161692L;
        an.byqj[105] = 4400086145726686910L;
        an.byqj[106] = 4598039457765334959L;
        an.byqj[107] = -6311108700279953886L;
        an.byqj[108] = -8593256776244814248L;
        an.byqj[109] = -2744933953574538139L;
        an.byqj[110] = 3368637745246390197L;
        an.byqj[111] = 4064233578123907071L;
        an.byqj[112] = -1618309075593353984L;
        an.byqj[113] = -8637478427902224831L;
        an.byqj[114] = 674502555826488629L;
        an.byqj[115] = 2249732018888908496L;
        an.byqj[116] = -7590772109979463745L;
        an.byqj[117] = -6446168853049106870L;
        an.byqj[118] = -7681160145104897245L;
        an.byqj[119] = -3920659668240743617L;
        an.byqj[120] = -2116646865078891807L;
        an.byqj[121] = 8094674741489295797L;
        an.byqj[122] = -1741157786440602522L;
        an.byqj[123] = 4037973383148914305L;
        an.byqj[124] = -7525895481000883566L;
        an.byqj[125] = -4444071214937261037L;
        an.byqj[126] = -3366228292883582089L;
        an.byqj[127] = 3026194946885734297L;
        an.byqj[128] = 8697693924507459563L;
        an.byqj[129] = -6613247827282130260L;
        an.byqj[130] = -4157038095699251840L;
        an.byqj[131] = 4967643351996378441L;
        an.byqj[132] = 8930197034618470261L;
        an.byqj[133] = 7895716725469395349L;
        an.byqj[134] = 2103954704153906331L;
        an.byqj[135] = 8023210774552144891L;
        an.byqj[136] = 8308651954153198297L;
        an.byqj[137] = -1112278569066510734L;
        an.byqj[138] = 5155196335979381125L;
        an.byqj[139] = 1042652832629479497L;
        an.byqj[140] = -2867993335662877729L;
        an.byqj[141] = 765247070779707829L;
        an.byqj[142] = 5290198010131319220L;
        an.byqj[143] = 5910745170670662390L;
        an.byqj[144] = -5227230403445239375L;
        an.byqj[145] = -1084021563553481399L;
        an.byqj[146] = 5345690500036188348L;
    }
}

