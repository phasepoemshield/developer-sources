/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 */
package ruhack.phobia;

import com.google.gson.Gson;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.file.Path;

public class ao {
    private static int[] bxef = new int[108];
    private static ao instance;
    public static final int b;
    private final Path configPath;
    private final Gson gson;
    public static final boolean c;
    public static final boolean a;
    private static int[] bxeg;
    private static long[] bxex;
    private static long[] bxez;
    private static final long er = -7166605098734570540L;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ao getInstance() {
        block37: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = ao.er - ao.bxeh("bxfc", bxev(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == ao.bxeh("bxfd", bxee(int ), (int)8)) break;
                v0 /* !! */  = (long)ao.bxeh("bxff", bxee(int ), (int)9);
            }
            var2 = ao.c;
            v1 /* !! */  = ao.er;
            if (true) ** GOTO lbl11
            block28: while (true) {
                v1 /* !! */  = (long)(v2 - ao.bxeh("bxfh", bxev(int ), (int)1));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case 208417748: {
                        break block28;
                    }
                    case 2045770014: {
                        v2 = ao.bxeh("bxfj", bxev(int ), (int)2);
                        continue block28;
                    }
                    case 2100808812: {
                        v2 = ao.bxeh("bxfk", bxev(int ), (int)3);
                        continue block28;
                    }
                }
                break;
            }
            var1_1 = ao.b;
            v3 /* !! */  = ao.er;
            if (true) ** GOTO lbl25
            block29: while (true) {
                v3 /* !! */  = (long)(v4 - ao.bxeh("bxfp", bxev(int ), (int)4));
lbl25:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case 208417748: {
                        break block29;
                    }
                    case 240398788: {
                        v4 = ao.bxeh("bxfq", bxev(int ), (int)5);
                        continue block29;
                    }
                    case 911826725: {
                        v4 = ao.bxeh("bxfr", bxev(int ), (int)6);
                        continue block29;
                    }
                    case 1380995488: {
                        v4 = ao.bxeh("bxfs", bxev(int ), (int)7);
                        continue block29;
                    }
                }
                break;
            }
            var0_2 = ao.a;
            if (var2) {
                throw null;
lbl40:
                // 4 sources

                return null;
            }
            if (var0_2 || var0_2) ** GOTO lbl40
            v5 /* !! */  = ao.er;
            if (true) ** GOTO lbl47
            block31: while (true) {
                v5 /* !! */  = (long)(v6 - ao.bxeh("bxft", bxev(int ), (int)8));
lbl47:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1579138806: {
                        v6 = ao.bxeh("bxfu", bxev(int ), (int)9);
                        continue block31;
                    }
                    case -1573841641: {
                        v6 = ao.bxeh("bxfw", bxev(int ), (int)10);
                        continue block31;
                    }
                    case 183755313: {
                        v6 = ao.bxeh("bxga", bxev(int ), (int)11);
                        continue block31;
                    }
                    case 208417748: {
                        break block31;
                    }
                }
                break;
            }
            if (ao.instance != null) break block37;
            if (var0_2 || var0_2) ** GOTO lbl40
            v7 /* !! */  = ao.er;
            if (true) ** GOTO lbl65
            block32: while (true) {
                v7 /* !! */  = (long)(v8 - ao.bxeh("bxge", bxev(int ), (int)12));
lbl65:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case 208417748: {
                        break block32;
                    }
                    case 907609914: {
                        v8 = ao.bxeh("bxgf", bxev(int ), (int)13);
                        continue block32;
                    }
                    case 1934876172: {
                        v8 = ao.bxeh("bxgg", bxev(int ), (int)14);
                        continue block32;
                    }
                }
                break;
            }
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_1 = ao.er - ao.bxeh("bxgh", bxev(int ), (int)15)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == ao.bxeh("bxgi", bxee(int ), (int)10)) break;
                v9 /* !! */  = (long)ao.bxeh("bxgk", bxee(int ), (int)11);
            }
            v10 = new ao();
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_2 = ao.er - ao.bxeh("bxgp", bxev(int ), (int)16)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == ao.bxeh("bxgr", bxee(int ), (int)12)) break;
                v11 /* !! */  = (long)ao.bxeh("bxgt", bxee(int ), (int)13);
            }
            ao.instance = v10;
            if (var0_2) ** GOTO lbl40
        }
        if (!var0_2 && !var0_2) ** break;
        ** while (true)
        v12 /* !! */  = ao.er;
        if (true) ** GOTO lbl94
        block35: while (true) {
            v12 /* !! */  = (long)(v13 - ao.bxeh("bxgu", bxev(int ), (int)17));
lbl94:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -290221745: {
                    v13 = ao.bxeh("bxgv", bxev(int ), (int)18);
                    continue block35;
                }
                case 208417748: {
                    break block35;
                }
                case 1696305202: {
                    v13 = ao.bxeh("bxgw", bxev(int ), (int)19);
                    continue block35;
                }
            }
            break;
        }
        return ao.instance;
    }

    /*
     * Exception decompiling
     */
    private ao() {
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

    private static /* synthetic */ void bxlx() {
        ao.bxef[100] = -934362069;
        ao.bxef[101] = 960550382;
        ao.bxef[102] = 1717006864;
        ao.bxef[103] = 1822716700;
        ao.bxef[104] = 274683016;
        ao.bxef[105] = 539786234;
        ao.bxef[106] = -705407574;
        ao.bxef[107] = 2105207366;
    }

    private static /* synthetic */ void bxly() {
        ao.bxeg[0] = -1713770848;
        ao.bxeg[1] = -987254407;
        ao.bxeg[2] = -645371258;
        ao.bxeg[3] = -660349076;
        ao.bxeg[4] = 2016183807;
        ao.bxeg[5] = 1855526722;
        ao.bxeg[6] = 1970480578;
        ao.bxeg[7] = 2136172676;
        ao.bxeg[8] = 116442212;
        ao.bxeg[9] = -1398672904;
        ao.bxeg[10] = 609842863;
        ao.bxeg[11] = -1624899441;
        ao.bxeg[12] = -815942824;
        ao.bxeg[13] = 1253988842;
        ao.bxeg[14] = 1435971669;
        ao.bxeg[15] = -2050763007;
        ao.bxeg[16] = -1238117203;
        ao.bxeg[17] = -1943956317;
        ao.bxeg[18] = -841808295;
        ao.bxeg[19] = 1687149229;
        ao.bxeg[20] = -975972329;
        ao.bxeg[21] = -1102700122;
        ao.bxeg[22] = -180187638;
        ao.bxeg[23] = 1675137982;
        ao.bxeg[24] = -899270732;
        ao.bxeg[25] = 76436717;
        ao.bxeg[26] = 876898493;
        ao.bxeg[27] = -1148040763;
        ao.bxeg[28] = 2032920856;
        ao.bxeg[29] = -183189805;
        ao.bxeg[30] = 832863316;
        ao.bxeg[31] = 291449042;
        ao.bxeg[32] = -711157485;
        ao.bxeg[33] = 1636537847;
        ao.bxeg[34] = 1698718967;
        ao.bxeg[35] = -1867816168;
        ao.bxeg[36] = -154511729;
        ao.bxeg[37] = 1100409736;
        ao.bxeg[38] = 303353348;
        ao.bxeg[39] = -113817391;
        ao.bxeg[40] = 131372699;
        ao.bxeg[41] = 1407147970;
        ao.bxeg[42] = -1961695677;
        ao.bxeg[43] = -330270113;
        ao.bxeg[44] = -42015289;
        ao.bxeg[45] = 603790007;
        ao.bxeg[46] = 542925662;
        ao.bxeg[47] = -1586915149;
        ao.bxeg[48] = 393271985;
        ao.bxeg[49] = 2131955026;
        ao.bxeg[50] = -1451767665;
        ao.bxeg[51] = -70117390;
        ao.bxeg[52] = -1377165856;
        ao.bxeg[53] = -672219496;
        ao.bxeg[54] = -336206693;
        ao.bxeg[55] = -1555687339;
        ao.bxeg[56] = -1911645488;
        ao.bxeg[57] = -1644091087;
        ao.bxeg[58] = -400770306;
        ao.bxeg[59] = 1244162384;
        ao.bxeg[60] = 479997517;
        ao.bxeg[61] = -859214553;
        ao.bxeg[62] = -1648669593;
        ao.bxeg[63] = 615979766;
        ao.bxeg[64] = 303851012;
        ao.bxeg[65] = -1282254356;
        ao.bxeg[66] = 361558630;
        ao.bxeg[67] = -827506277;
        ao.bxeg[68] = 700065110;
        ao.bxeg[69] = 602936481;
        ao.bxeg[70] = 1321878115;
        ao.bxeg[71] = 1858785210;
        ao.bxeg[72] = -435403921;
        ao.bxeg[73] = 1484480149;
        ao.bxeg[74] = 938519506;
        ao.bxeg[75] = -337270247;
        ao.bxeg[76] = 1252226711;
        ao.bxeg[77] = 1092370443;
        ao.bxeg[78] = -1532410460;
        ao.bxeg[79] = -72000982;
        ao.bxeg[80] = 1463492807;
        ao.bxeg[81] = -1089594561;
        ao.bxeg[82] = -2075492608;
        ao.bxeg[83] = -625147212;
        ao.bxeg[84] = 1196544383;
        ao.bxeg[85] = 1155754923;
        ao.bxeg[86] = -1409833166;
        ao.bxeg[87] = -1664255310;
        ao.bxeg[88] = 1072140502;
        ao.bxeg[89] = 1450161542;
        ao.bxeg[90] = -1071873821;
        ao.bxeg[91] = 1758704251;
        ao.bxeg[92] = -1435678766;
        ao.bxeg[93] = 1575119245;
        ao.bxeg[94] = 171070602;
        ao.bxeg[95] = 658884386;
        ao.bxeg[96] = 282188281;
        ao.bxeg[97] = 247841028;
        ao.bxeg[98] = -459327966;
        ao.bxeg[99] = 1656973343;
    }

    private static /* synthetic */ void bxmb() {
        ao.bxez[0] = 4584915810125516886L;
        ao.bxez[1] = -2441303396426798847L;
        ao.bxez[2] = -316513427537829250L;
        ao.bxez[3] = 3000530334046720603L;
        ao.bxez[4] = -1661569673341543243L;
        ao.bxez[5] = -1271104075662772462L;
        ao.bxez[6] = 5458136116939647883L;
        ao.bxez[7] = 1467381628430473324L;
        ao.bxez[8] = -1245883888564104994L;
        ao.bxez[9] = -1665739516531411061L;
        ao.bxez[10] = -5224883823911429531L;
        ao.bxez[11] = 9003139431589121779L;
        ao.bxez[12] = -677351978895810351L;
        ao.bxez[13] = -5634199073940578231L;
        ao.bxez[14] = -2477138488522746577L;
        ao.bxez[15] = 2564248308656134749L;
        ao.bxez[16] = -5679522461809747094L;
        ao.bxez[17] = -18383564616641636L;
        ao.bxez[18] = 6110875364996224576L;
        ao.bxez[19] = 8354328572664515537L;
    }

    public static /* synthetic */ CallSite bxeh(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    static {
        bxeg = new int[108];
        ao.bxlw();
        ao.bxlx();
        ao.bxly();
        ao.bxlz();
        bxex = new long[20];
        bxez = new long[20];
        ao.bxma();
        ao.bxmb();
    }

    private static /* synthetic */ int bxee(int n2) {
        return bxef[n2] ^ bxeg[n2];
    }

    private static /* synthetic */ long bxev(int n2) {
        return bxex[n2] ^ bxez[n2];
    }

    private static /* synthetic */ void bxma() {
        ao.bxex[0] = 7220768594525068280L;
        ao.bxex[1] = -4724963051871557633L;
        ao.bxex[2] = 2541058216427500230L;
        ao.bxex[3] = 4111617433541602639L;
        ao.bxex[4] = 4859132474993253205L;
        ao.bxex[5] = -5987055552231648184L;
        ao.bxex[6] = -1015318605305094505L;
        ao.bxex[7] = 8307803289920808146L;
        ao.bxex[8] = -4546273081892417951L;
        ao.bxex[9] = -4750517528166712253L;
        ao.bxex[10] = 3313870101288728000L;
        ao.bxex[11] = 5801689480612191300L;
        ao.bxex[12] = -2301997787732683162L;
        ao.bxex[13] = 4905255983850186529L;
        ao.bxex[14] = -6874343823019607018L;
        ao.bxex[15] = -5416695347411619187L;
        ao.bxex[16] = -8338482963181684428L;
        ao.bxex[17] = 826599004025715679L;
        ao.bxex[18] = -562196600836671731L;
        ao.bxex[19] = -3353225563470017113L;
    }

    private static /* synthetic */ void bxlw() {
        ao.bxef[0] = -1713770847;
        ao.bxef[1] = -987254406;
        ao.bxef[2] = -645371258;
        ao.bxef[3] = -660349078;
        ao.bxef[4] = 2016183803;
        ao.bxef[5] = 1855526721;
        ao.bxef[6] = 1970480578;
        ao.bxef[7] = 2136172674;
        ao.bxef[8] = -116442213;
        ao.bxef[9] = 1381879642;
        ao.bxef[10] = 609842862;
        ao.bxef[11] = -1283543269;
        ao.bxef[12] = 815942823;
        ao.bxef[13] = -600927143;
        ao.bxef[14] = 1435971668;
        ao.bxef[15] = -2050763003;
        ao.bxef[16] = -1238117201;
        ao.bxef[17] = -1943956317;
        ao.bxef[18] = -841808294;
        ao.bxef[19] = 1687149229;
        ao.bxef[20] = -975972321;
        ao.bxef[21] = -1102700121;
        ao.bxef[22] = -180187636;
        ao.bxef[23] = 1675137978;
        ao.bxef[24] = -899270736;
        ao.bxef[25] = 76436728;
        ao.bxef[26] = 876898479;
        ao.bxef[27] = -1148040746;
        ao.bxef[28] = 2032920851;
        ao.bxef[29] = -183189820;
        ao.bxef[30] = 832863299;
        ao.bxef[31] = 291449047;
        ao.bxef[32] = -711157501;
        ao.bxef[33] = 1636537828;
        ao.bxef[34] = 1698718957;
        ao.bxef[35] = -1867816178;
        ao.bxef[36] = -154511742;
        ao.bxef[37] = 1100409732;
        ao.bxef[38] = 303353367;
        ao.bxef[39] = -113817405;
        ao.bxef[40] = 131372678;
        ao.bxef[41] = 1407147981;
        ao.bxef[42] = -1961695673;
        ao.bxef[43] = -330270138;
        ao.bxef[44] = -42015290;
        ao.bxef[45] = 603790014;
        ao.bxef[46] = 542925641;
        ao.bxef[47] = -1586915164;
        ao.bxef[48] = 393271971;
        ao.bxef[49] = 2131955034;
        ao.bxef[50] = -1451767655;
        ao.bxef[51] = -70117386;
        ao.bxef[52] = -1377165840;
        ao.bxef[53] = -672219470;
        ao.bxef[54] = -336206665;
        ao.bxef[55] = -1555687338;
        ao.bxef[56] = -1911645493;
        ao.bxef[57] = -1644091090;
        ao.bxef[58] = -400770312;
        ao.bxef[59] = 1244162378;
        ao.bxef[60] = 479997551;
        ao.bxef[61] = -859214544;
        ao.bxef[62] = -1648669626;
        ao.bxef[63] = 615979770;
        ao.bxef[64] = 303851010;
        ao.bxef[65] = -1282254359;
        ao.bxef[66] = 361558651;
        ao.bxef[67] = -827506292;
        ao.bxef[68] = 700065089;
        ao.bxef[69] = 602936454;
        ao.bxef[70] = 1321878125;
        ao.bxef[71] = 1858785160;
        ao.bxef[72] = -435403915;
        ao.bxef[73] = 1484480136;
        ao.bxef[74] = 938519543;
        ao.bxef[75] = -337270223;
        ao.bxef[76] = 1252226688;
        ao.bxef[77] = 1092370462;
        ao.bxef[78] = -1532410451;
        ao.bxef[79] = -72000971;
        ao.bxef[80] = 1463492844;
        ao.bxef[81] = -1089594597;
        ao.bxef[82] = -2075492597;
        ao.bxef[83] = -625147244;
        ao.bxef[84] = 1196544360;
        ao.bxef[85] = 1155754929;
        ao.bxef[86] = -1409833192;
        ao.bxef[87] = -1664255297;
        ao.bxef[88] = 1072140541;
        ao.bxef[89] = 1450161539;
        ao.bxef[90] = -1071873843;
        ao.bxef[91] = 1758704217;
        ao.bxef[92] = -1435678750;
        ao.bxef[93] = 1575119253;
        ao.bxef[94] = 171070624;
        ao.bxef[95] = 658884401;
        ao.bxef[96] = 282188253;
        ao.bxef[97] = 247841026;
        ao.bxef[98] = -459327989;
        ao.bxef[99] = 1656973340;
    }

    /*
     * Exception decompiling
     */
    public void load() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 6[CASE]
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
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 3[CASE]
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

    private static /* synthetic */ void bxlz() {
        ao.bxeg[100] = -934362072;
        ao.bxeg[101] = 960550399;
        ao.bxeg[102] = 1717006877;
        ao.bxeg[103] = 1822716718;
        ao.bxeg[104] = 274683042;
        ao.bxeg[105] = 539786205;
        ao.bxeg[106] = -705407592;
        ao.bxeg[107] = 2105207415;
    }
}

