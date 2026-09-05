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
import ruhack.phobia.av;
import ruhack.phobia.d;

public class aj {
    public static final boolean c;
    private static final int LAYOUT_VERSION = 3;
    private final Gson gson;
    private static int[] cfwh;
    public static final int b;
    private final Path configPath;
    static final long fr = -368613258980106232L;
    public static final boolean a;
    private static long[] cfws;
    private static long[] cfwt;
    private static int[] cfwg;
    private static aj instance;

    private static /* synthetic */ void cggp() {
        aj.cfwh[0] = -1711847104;
        aj.cfwh[1] = 1825257306;
        aj.cfwh[2] = 8657852;
        aj.cfwh[3] = -683855030;
        aj.cfwh[4] = -1640925472;
        aj.cfwh[5] = -875746382;
        aj.cfwh[6] = -1943953443;
        aj.cfwh[7] = -910261184;
        aj.cfwh[8] = 870940776;
        aj.cfwh[9] = 1291375945;
        aj.cfwh[10] = -2077763301;
        aj.cfwh[11] = -33277916;
        aj.cfwh[12] = -1346414951;
        aj.cfwh[13] = 687149319;
        aj.cfwh[14] = 1311159493;
        aj.cfwh[15] = 1694865520;
        aj.cfwh[16] = -600831580;
        aj.cfwh[17] = 107581430;
        aj.cfwh[18] = 1570095861;
        aj.cfwh[19] = 1531749665;
        aj.cfwh[20] = -791951462;
        aj.cfwh[21] = 887277697;
        aj.cfwh[22] = -1384076188;
        aj.cfwh[23] = 521101651;
        aj.cfwh[24] = 464883780;
        aj.cfwh[25] = 1687632401;
        aj.cfwh[26] = 2129987192;
        aj.cfwh[27] = -2133006643;
        aj.cfwh[28] = 836425393;
        aj.cfwh[29] = -204342139;
        aj.cfwh[30] = -1937819049;
        aj.cfwh[31] = 1402746249;
        aj.cfwh[32] = -1519143338;
        aj.cfwh[33] = -1121365450;
        aj.cfwh[34] = 1341555488;
        aj.cfwh[35] = -337016179;
        aj.cfwh[36] = 494153928;
        aj.cfwh[37] = 417598574;
        aj.cfwh[38] = -438768812;
        aj.cfwh[39] = -468116605;
        aj.cfwh[40] = -2085813305;
        aj.cfwh[41] = -991149285;
        aj.cfwh[42] = 1386167409;
        aj.cfwh[43] = 762410888;
        aj.cfwh[44] = -384476290;
        aj.cfwh[45] = -1660333121;
        aj.cfwh[46] = -1351760673;
        aj.cfwh[47] = 258646339;
        aj.cfwh[48] = 1200022792;
        aj.cfwh[49] = -1706665046;
        aj.cfwh[50] = -1166993392;
        aj.cfwh[51] = 1291597370;
        aj.cfwh[52] = -1261828810;
        aj.cfwh[53] = -49700501;
        aj.cfwh[54] = -1702613790;
        aj.cfwh[55] = 1842755424;
        aj.cfwh[56] = -731367537;
        aj.cfwh[57] = -726359677;
        aj.cfwh[58] = 934248007;
        aj.cfwh[59] = -217757967;
        aj.cfwh[60] = -1466508905;
        aj.cfwh[61] = 1089188444;
        aj.cfwh[62] = 552014375;
        aj.cfwh[63] = -180588670;
        aj.cfwh[64] = 518841940;
        aj.cfwh[65] = -148933767;
        aj.cfwh[66] = 2103937668;
        aj.cfwh[67] = -1945384877;
        aj.cfwh[68] = 1874486797;
        aj.cfwh[69] = 1776385005;
        aj.cfwh[70] = 1265673439;
        aj.cfwh[71] = 971803367;
        aj.cfwh[72] = 922785364;
        aj.cfwh[73] = -1171194863;
        aj.cfwh[74] = 555600858;
        aj.cfwh[75] = 377515478;
        aj.cfwh[76] = -260698553;
        aj.cfwh[77] = -1534900623;
        aj.cfwh[78] = -1660707042;
        aj.cfwh[79] = 1206606049;
        aj.cfwh[80] = -1796054254;
        aj.cfwh[81] = 1595372550;
        aj.cfwh[82] = -1388079746;
        aj.cfwh[83] = -1693727161;
        aj.cfwh[84] = -1554968393;
        aj.cfwh[85] = -865888342;
        aj.cfwh[86] = 724901212;
        aj.cfwh[87] = 1372022102;
        aj.cfwh[88] = 160672529;
        aj.cfwh[89] = 509424840;
        aj.cfwh[90] = 30793547;
        aj.cfwh[91] = 65458756;
        aj.cfwh[92] = -1727554795;
        aj.cfwh[93] = -1522143918;
        aj.cfwh[94] = 338233077;
        aj.cfwh[95] = 995391295;
        aj.cfwh[96] = -508302245;
        aj.cfwh[97] = -775906568;
        aj.cfwh[98] = 1757918783;
        aj.cfwh[99] = 624945858;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static aj getInstance() {
        v0 /* !! */  = aj.fr;
        if (true) ** GOTO lbl5
        block27: while (true) {
            v0 /* !! */  = (long)(v1 - aj.cfwi("cfwu", cfwr(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1791374119: {
                    v1 = aj.cfwi("cfwv", cfwr(int ), (int)1);
                    continue block27;
                }
                case -1493311480: {
                    break block27;
                }
                case -1409847042: {
                    v1 = aj.cfwi("cfww", cfwr(int ), (int)2);
                    continue block27;
                }
                case 41531455: {
                    v1 = aj.cfwi("cfwx", cfwr(int ), (int)3);
                    continue block27;
                }
            }
            break;
        }
        var2 = aj.c;
        v2 /* !! */  = aj.fr;
        if (true) ** GOTO lbl22
        block28: while (true) {
            v2 /* !! */  = (long)(aj.cfwi("cfwz", cfwr(int ), (int)5) - aj.cfwi("cfwy", cfwr(int ), (int)4));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1493311480: {
                    break block28;
                }
                case 1585816210: {
                    continue block28;
                }
            }
            break;
        }
        var1_1 /* !! */  = aj.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = aj.fr - aj.cfwi("cfxa", cfwr(int ), (int)6)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == aj.cfwi("cfxb", cfwf(int ), (int)8)) break;
            v3 /* !! */  = (long)aj.cfwi("cfxc", cfwf(int ), (int)9);
        }
        var0_2 = aj.a;
        if (var2) {
            throw null;
lbl36:
            // 4 sources

            return null;
        }
        if (var0_2 || var0_2) ** GOTO lbl36
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = aj.fr - aj.cfwi("cfxd", cfwr(int ), (int)7)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == aj.cfwi("cfxe", cfwf(int ), (int)10)) break;
            v4 /* !! */  = (long)aj.cfwi("cfxf", cfwf(int ), (int)11);
        }
        if (aj.instance != null) ** GOTO lbl78
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2 || var0_2) ** GOTO lbl36
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = aj.fr - aj.cfwi("cfxg", cfwr(int ), (int)8)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == aj.cfwi("cfxh", cfwf(int ), (int)12)) break;
                    v5 /* !! */  = (long)aj.cfwi("cfxi", cfwf(int ), (int)13);
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = aj.fr - aj.cfwi("cfxj", cfwr(int ), (int)9)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == aj.cfwi("cfxk", cfwf(int ), (int)14)) break;
                    v6 /* !! */  = (long)aj.cfwi("cfxl", cfwf(int ), (int)15);
                }
                v7 = new aj();
                v8 /* !! */  = aj.fr;
                if (true) ** GOTO lbl64
                block34: while (true) {
                    v8 /* !! */  = (long)(v9 - aj.cfwi("cfxm", cfwr(int ), (int)10));
lbl64:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1493311480: {
                            break block34;
                        }
                        case -1352411075: {
                            v9 = aj.cfwi("cfxn", cfwr(int ), (int)11);
                            continue block34;
                        }
                        case -942246325: {
                            v9 = aj.cfwi("cfxo", cfwr(int ), (int)12);
                            continue block34;
                        }
                        case 268261392: {
                            v9 = aj.cfwi("cfxp", cfwr(int ), (int)13);
                            continue block34;
                        }
                    }
                    break;
                }
                aj.instance = v7;
                if (var0_2) ** GOTO lbl36
lbl78:
                // 2 sources

                if (!var0_2 && !var0_2) ** break;
                ** continue;
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = aj.fr - aj.cfwi("cfxq", cfwr(int ), (int)14)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == aj.cfwi("cfxr", cfwf(int ), (int)16)) break;
                    v10 /* !! */  = (long)aj.cfwi("cfxs", cfwf(int ), (int)17);
                }
                return aj.instance;
            }
lbl86:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)aj.cfwi("cfxt", cfwf(int ), (int)18);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl100
            }
            case 1: {
                var1_1 /* !! */  = (int)aj.cfwi("cfxu", cfwf(int ), (int)19);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl114
            }
            case 2: {
                var1_1 /* !! */  = (int)aj.cfwi("cfxv", cfwf(int ), (int)20);
                if (!var2) ** GOTO lbl86
                throw null;
            }
lbl100:
            // 4 sources

            case 3: {
                var1_1 /* !! */  = (int)aj.cfwi("cfxw", cfwf(int ), (int)21);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl110
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)aj.cfwi("cfxx", cfwf(int ), (int)22);
                    if (!var2) ** GOTO lbl100
                    throw null;
                }
            }
lbl110:
            // 2 sources

            case 5: {
                var1_1 /* !! */  = (int)aj.cfwi("cfxy", cfwf(int ), (int)23);
                if (!var2) ** GOTO lbl100
                throw null;
            }
lbl114:
            // 2 sources

            case 6: {
                do {
                    var1_1 /* !! */  = (int)aj.cfwi("cfxz", cfwf(int ), (int)24);
                } while (!var2);
                throw null;
            }
            case 7: {
                do {
                    var1_1 /* !! */  = (int)aj.cfwi("cfya", cfwf(int ), (int)25);
                } while (!var2);
                throw null;
            }
            case 8: 
        }
        var1_1 /* !! */  = (int)aj.cfwi("cfyb", cfwf(int ), (int)26);
        ** while (!var2)
lbl127:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private aj() {
        var4_1 /* !! */  = aj.b;
        super();
        if (var4_1 /* !! */  == 0) ** GOTO lbl-1000
        block1 : switch (var4_1 /* !! */ ) {
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
                this.configPath = var1_2.resolve("draggables.file");
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_1 /* !! */  = (int)aj.cfwi("cfwj", cfwf(int ), (int)0);
                    break block1;
                    break;
                }
            }
lbl20:
            // 2 sources

            case 1: {
                var4_1 /* !! */  = (int)aj.cfwi("cfwk", cfwf(int ), (int)1);
                ** GOTO lbl28
            }
            case 2: {
                var4_1 /* !! */  = (int)aj.cfwi("cfwl", cfwf(int ), (int)2);
            }
            case 3: {
                var4_1 /* !! */  = (int)aj.cfwi("cfwm", cfwf(int ), (int)3);
                ** GOTO lbl31
            }
lbl28:
            // 3 sources

            case 4: {
                var4_1 /* !! */  = (int)aj.cfwi("cfwn", cfwf(int ), (int)4);
                break;
            }
lbl31:
            // 2 sources

            case 5: {
                var4_1 /* !! */  = (int)aj.cfwi("cfwo", cfwf(int ), (int)5);
                ** GOTO lbl20
            }
            case 6: {
                var4_1 /* !! */  = (int)aj.cfwi("cfwp", cfwf(int ), (int)6);
                ** GOTO lbl28
            }
            case 7: 
        }
        var4_1 /* !! */  = (int)aj.cfwi("cfwq", cfwf(int ), (int)7);
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public void load() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[TRYBLOCK]], but top level block is 8[SWITCH]
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

    private static /* synthetic */ int cfwf(int n2) {
        return cfwg[n2] ^ cfwh[n2];
    }

    /*
     * Exception decompiling
     */
    public void save() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 3[SWITCH]
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

    private static /* synthetic */ void cggq() {
        aj.cfwh[100] = 848817884;
        aj.cfwh[101] = -1383970922;
        aj.cfwh[102] = 795018922;
        aj.cfwh[103] = -1209508055;
        aj.cfwh[104] = -980700931;
        aj.cfwh[105] = 724941037;
        aj.cfwh[106] = 370818300;
        aj.cfwh[107] = 1306916743;
        aj.cfwh[108] = -887122484;
        aj.cfwh[109] = -1805679723;
        aj.cfwh[110] = 227414814;
        aj.cfwh[111] = 1290999223;
        aj.cfwh[112] = -1662481528;
        aj.cfwh[113] = 645650738;
        aj.cfwh[114] = 633617480;
        aj.cfwh[115] = -1531710032;
        aj.cfwh[116] = 393913958;
        aj.cfwh[117] = 778995173;
        aj.cfwh[118] = 427591514;
        aj.cfwh[119] = 185346589;
        aj.cfwh[120] = 1227629458;
        aj.cfwh[121] = -437202683;
        aj.cfwh[122] = -1949613171;
        aj.cfwh[123] = -327758291;
        aj.cfwh[124] = -875095949;
        aj.cfwh[125] = 959460623;
        aj.cfwh[126] = -220017846;
        aj.cfwh[127] = 953122983;
        aj.cfwh[128] = 1450201651;
        aj.cfwh[129] = -695459110;
        aj.cfwh[130] = -718251687;
        aj.cfwh[131] = 88570944;
        aj.cfwh[132] = 732834174;
        aj.cfwh[133] = 1586512910;
        aj.cfwh[134] = -376533954;
        aj.cfwh[135] = 2082693424;
        aj.cfwh[136] = -580759927;
        aj.cfwh[137] = -903089961;
        aj.cfwh[138] = 177355743;
        aj.cfwh[139] = -1483504638;
        aj.cfwh[140] = -2066362027;
        aj.cfwh[141] = -1342255916;
        aj.cfwh[142] = -702773910;
        aj.cfwh[143] = 1203885483;
        aj.cfwh[144] = -1348015564;
        aj.cfwh[145] = -1298284715;
        aj.cfwh[146] = 2141663605;
        aj.cfwh[147] = 1649260766;
        aj.cfwh[148] = 983320204;
        aj.cfwh[149] = 1077066438;
        aj.cfwh[150] = 1802426470;
        aj.cfwh[151] = 1948211358;
        aj.cfwh[152] = -1864770086;
        aj.cfwh[153] = -888338587;
        aj.cfwh[154] = -588224236;
        aj.cfwh[155] = -620669932;
        aj.cfwh[156] = -232811783;
        aj.cfwh[157] = -1713437381;
        aj.cfwh[158] = -2107247186;
        aj.cfwh[159] = -200748126;
        aj.cfwh[160] = -1367726684;
        aj.cfwh[161] = 1220647240;
        aj.cfwh[162] = 994634459;
        aj.cfwh[163] = -1413391561;
        aj.cfwh[164] = -1521272775;
        aj.cfwh[165] = -1864058368;
        aj.cfwh[166] = -811723485;
        aj.cfwh[167] = -2037191195;
        aj.cfwh[168] = -1051365953;
        aj.cfwh[169] = 525848310;
        aj.cfwh[170] = -1154344820;
        aj.cfwh[171] = 3036848;
        aj.cfwh[172] = -563747798;
        aj.cfwh[173] = 1389090775;
        aj.cfwh[174] = -382517624;
        aj.cfwh[175] = 557099687;
        aj.cfwh[176] = 1128566493;
        aj.cfwh[177] = 1074550841;
        aj.cfwh[178] = 561591663;
        aj.cfwh[179] = -1910024256;
        aj.cfwh[180] = -330622287;
        aj.cfwh[181] = -1423748766;
        aj.cfwh[182] = -1763864592;
        aj.cfwh[183] = -949765617;
        aj.cfwh[184] = 1547960663;
        aj.cfwh[185] = 266663470;
        aj.cfwh[186] = 533008745;
        aj.cfwh[187] = -1257180802;
        aj.cfwh[188] = -736212287;
        aj.cfwh[189] = 1156569587;
        aj.cfwh[190] = 1907679346;
        aj.cfwh[191] = -1322938775;
        aj.cfwh[192] = 1060792630;
        aj.cfwh[193] = 1479941934;
        aj.cfwh[194] = 777400094;
        aj.cfwh[195] = -1211139858;
        aj.cfwh[196] = 1075749629;
        aj.cfwh[197] = 1431961333;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private av getHudManager() {
        block54: {
            block53: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = aj.fr - aj.cfwi("cgfb", cfwr(int ), (int)15)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == aj.cfwi("cgfc", cfwf(int ), (int)177)) break;
                    v0 /* !! */  = (long)aj.cfwi("cgfd", cfwf(int ), (int)178);
                }
                var3_1 = aj.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_1 = aj.fr - aj.cfwi("cgfe", cfwr(int ), (int)16)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  == aj.cfwi("cgff", cfwf(int ), (int)179)) break;
                    v1 /* !! */  = (long)aj.cfwi("cgfg", cfwf(int ), (int)180);
                }
                var2_2 /* !! */  = aj.b;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = aj.fr - aj.cfwi("cgfh", cfwr(int ), (int)17)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == aj.cfwi("cgfi", cfwf(int ), (int)181)) break;
                    v2 /* !! */  = (long)aj.cfwi("cgfj", cfwf(int ), (int)182);
                }
                var1_3 = aj.a;
                if (var3_1) {
                    throw null;
lbl21:
                    // 6 sources

                    return null;
                }
                if (var1_3 || var1_3) ** GOTO lbl21
                v3 /* !! */  = aj.fr;
                if (true) ** GOTO lbl28
                block37: while (true) {
                    v3 /* !! */  = (long)(aj.cfwi("cgfl", cfwr(int ), (int)19) - aj.cfwi("cgfk", cfwr(int ), (int)18));
lbl28:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1493311480: {
                            break block37;
                        }
                        case 995688277: {
                            continue block37;
                        }
                    }
                    break;
                }
                if (d.getInstance() != null) break block53;
                if (var1_3) ** GOTO lbl21
                return null;
            }
            if (var1_3 || var1_3) ** GOTO lbl21
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_3 = aj.fr - aj.cfwi("cgfm", cfwr(int ), (int)20)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == aj.cfwi("cgfn", cfwf(int ), (int)183)) break;
                v4 /* !! */  = (long)aj.cfwi("cgfo", cfwf(int ), (int)184);
            }
            v5 = d.getInstance();
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_4 = aj.fr - aj.cfwi("cgfp", cfwr(int ), (int)21)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == aj.cfwi("cgfq", cfwf(int ), (int)185)) break;
                v6 /* !! */  = (long)aj.cfwi("cgfr", cfwf(int ), (int)186);
            }
            if (v5.getManager() != null) break block54;
            if (var1_3) ** GOTO lbl21
            return null;
        }
        if (var1_3) ** GOTO lbl21
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                v7 /* !! */  = aj.fr;
                if (true) ** GOTO lbl63
                block40: while (true) {
                    v7 /* !! */  = (long)(v8 - aj.cfwi("cgfs", cfwr(int ), (int)22));
lbl63:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1493311480: {
                            break block40;
                        }
                        case 1083764642: {
                            v8 = aj.cfwi("cgft", cfwr(int ), (int)23);
                            continue block40;
                        }
                        case 1754120230: {
                            v8 = aj.cfwi("cgfu", cfwr(int ), (int)24);
                            continue block40;
                        }
                    }
                    break;
                }
                v9 = d.getInstance();
                v10 /* !! */  = aj.fr;
                if (true) ** GOTO lbl77
                block41: while (true) {
                    v10 /* !! */  = (long)(v11 - aj.cfwi("cgfv", cfwr(int ), (int)25));
lbl77:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1493311480: {
                            break block41;
                        }
                        case -916475004: {
                            v11 = aj.cfwi("cgfw", cfwr(int ), (int)26);
                            continue block41;
                        }
                        case 1609496487: {
                            v11 = aj.cfwi("cgfx", cfwr(int ), (int)27);
                            continue block41;
                        }
                    }
                    break;
                }
                v12 = v9.getManager();
                v13 /* !! */  = aj.fr;
                if (true) ** GOTO lbl91
                block42: while (true) {
                    v13 /* !! */  = (long)(v14 - aj.cfwi("cgfy", cfwr(int ), (int)28));
lbl91:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1493311480: {
                            break block42;
                        }
                        case -874962961: {
                            v14 = aj.cfwi("cgfz", cfwr(int ), (int)29);
                            continue block42;
                        }
                        case 709588510: {
                            v14 = aj.cfwi("cgga", cfwr(int ), (int)30);
                            continue block42;
                        }
                        case 960400672: {
                            v14 = aj.cfwi("cggb", cfwr(int ), (int)31);
                            continue block42;
                        }
                    }
                    break;
                }
                return v12.getHudManager();
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)aj.cfwi("cggc", cfwf(int ), (int)187);
                } while (!var3_1);
                throw null;
            }
lbl109:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)aj.cfwi("cggd", cfwf(int ), (int)188);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl127
            }
            case 2: {
                var2_2 /* !! */  = (int)aj.cfwi("cgge", cfwf(int ), (int)189);
                if (!var3_1) break;
                throw null;
            }
lbl118:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)aj.cfwi("cggf", cfwf(int ), (int)190);
                if (!var3_1) ** GOTO lbl109
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)aj.cfwi("cggg", cfwf(int ), (int)191);
                    if (!var3_1) break block4;
                    throw null;
                }
            }
lbl127:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)aj.cfwi("cggh", cfwf(int ), (int)192);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl146
            }
            case 6: {
                var2_2 /* !! */  = (int)aj.cfwi("cggi", cfwf(int ), (int)193);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl142
            }
lbl137:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)aj.cfwi("cggj", cfwf(int ), (int)194);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl142:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)aj.cfwi("cggk", cfwf(int ), (int)195);
                if (!var3_1) ** GOTO lbl118
                throw null;
            }
lbl146:
            // 3 sources

            case 9: {
                var2_2 /* !! */  = (int)aj.cfwi("cggl", cfwf(int ), (int)196);
                if (!var3_1) ** GOTO lbl137
                throw null;
            }
            case 10: 
        }
        var2_2 /* !! */  = (int)aj.cfwi("cggm", cfwf(int ), (int)197);
        ** while (!var3_1)
lbl153:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cggn() {
        aj.cfwg[0] = -1711847102;
        aj.cfwg[1] = 1825257306;
        aj.cfwg[2] = 8657854;
        aj.cfwg[3] = -683855029;
        aj.cfwg[4] = -1640925470;
        aj.cfwg[5] = -875746383;
        aj.cfwg[6] = -1943953447;
        aj.cfwg[7] = -910261181;
        aj.cfwg[8] = 870940777;
        aj.cfwg[9] = -1429626724;
        aj.cfwg[10] = -2077763302;
        aj.cfwg[11] = -2098111452;
        aj.cfwg[12] = -1346414952;
        aj.cfwg[13] = -768357746;
        aj.cfwg[14] = -1311159494;
        aj.cfwg[15] = 1607166891;
        aj.cfwg[16] = 600831579;
        aj.cfwg[17] = 1153166636;
        aj.cfwg[18] = 1570095860;
        aj.cfwg[19] = 1531749670;
        aj.cfwg[20] = -791951459;
        aj.cfwg[21] = 887277705;
        aj.cfwg[22] = -1384076192;
        aj.cfwg[23] = 521101648;
        aj.cfwg[24] = 464883777;
        aj.cfwg[25] = 1687632406;
        aj.cfwg[26] = 2129987198;
        aj.cfwg[27] = -2133006642;
        aj.cfwg[28] = 836425369;
        aj.cfwg[29] = -204342097;
        aj.cfwg[30] = -1937819052;
        aj.cfwg[31] = 1402746267;
        aj.cfwg[32] = -1519143341;
        aj.cfwg[33] = -1121365451;
        aj.cfwg[34] = 1341555518;
        aj.cfwg[35] = -337016154;
        aj.cfwg[36] = 494153935;
        aj.cfwg[37] = 417598573;
        aj.cfwg[38] = -438768822;
        aj.cfwg[39] = -468116568;
        aj.cfwg[40] = -2085813288;
        aj.cfwg[41] = -991149292;
        aj.cfwg[42] = 1386167413;
        aj.cfwg[43] = 762410898;
        aj.cfwg[44] = -384476290;
        aj.cfwg[45] = -1660333133;
        aj.cfwg[46] = -1351760647;
        aj.cfwg[47] = 258646340;
        aj.cfwg[48] = 1200022790;
        aj.cfwg[49] = -1706665054;
        aj.cfwg[50] = -1166993406;
        aj.cfwg[51] = 1291597374;
        aj.cfwg[52] = -1261828805;
        aj.cfwg[53] = -49700505;
        aj.cfwg[54] = -1702613790;
        aj.cfwg[55] = 1842755430;
        aj.cfwg[56] = -731367533;
        aj.cfwg[57] = -726359663;
        aj.cfwg[58] = 934248016;
        aj.cfwg[59] = -217757961;
        aj.cfwg[60] = -1466508905;
        aj.cfwg[61] = 1089188429;
        aj.cfwg[62] = 552014383;
        aj.cfwg[63] = -180588635;
        aj.cfwg[64] = 518841924;
        aj.cfwg[65] = -148933782;
        aj.cfwg[66] = 2103937694;
        aj.cfwg[67] = -1945384841;
        aj.cfwg[68] = 1874486811;
        aj.cfwg[69] = 1776384995;
        aj.cfwg[70] = 1265673413;
        aj.cfwg[71] = 971803388;
        aj.cfwg[72] = 922785370;
        aj.cfwg[73] = -1171194851;
        aj.cfwg[74] = 555600859;
        aj.cfwg[75] = 377515476;
        aj.cfwg[76] = -260698559;
        aj.cfwg[77] = -1534900663;
        aj.cfwg[78] = -1660707043;
        aj.cfwg[79] = 1206606055;
        aj.cfwg[80] = -1795350190;
        aj.cfwg[81] = 1595372583;
        aj.cfwg[82] = -1388079833;
        aj.cfwg[83] = -1693727118;
        aj.cfwg[84] = -1554968399;
        aj.cfwg[85] = -865888349;
        aj.cfwg[86] = 724901186;
        aj.cfwg[87] = 1372022140;
        aj.cfwg[88] = 160672555;
        aj.cfwg[89] = 509424876;
        aj.cfwg[90] = 30793552;
        aj.cfwg[91] = 65458779;
        aj.cfwg[92] = -1727554730;
        aj.cfwg[93] = -1522143929;
        aj.cfwg[94] = 338233034;
        aj.cfwg[95] = 995391274;
        aj.cfwg[96] = -508302309;
        aj.cfwg[97] = -775906649;
        aj.cfwg[98] = 1757918729;
        aj.cfwg[99] = 624945858;
    }

    private static /* synthetic */ long cfwr(int n2) {
        return cfws[n2] ^ cfwt[n2];
    }

    private static /* synthetic */ void cggr() {
        aj.cfws[0] = 7296884637616370579L;
        aj.cfws[1] = 3471129195918679559L;
        aj.cfws[2] = 564305153755434830L;
        aj.cfws[3] = -7933381412859298668L;
        aj.cfws[4] = 2492000443617878640L;
        aj.cfws[5] = 5012222089032876457L;
        aj.cfws[6] = -4946855659634610685L;
        aj.cfws[7] = -1279266398799156243L;
        aj.cfws[8] = -4780940768386084377L;
        aj.cfws[9] = -3136089743167815580L;
        aj.cfws[10] = 64569534322274311L;
        aj.cfws[11] = -1400717587704801952L;
        aj.cfws[12] = -609604200810370580L;
        aj.cfws[13] = -306690511613709690L;
        aj.cfws[14] = 1797591389417526607L;
        aj.cfws[15] = 4295528742626875107L;
        aj.cfws[16] = 7233711228006459318L;
        aj.cfws[17] = 6483318179858224593L;
        aj.cfws[18] = -5421081703818517628L;
        aj.cfws[19] = 4653925633476172723L;
        aj.cfws[20] = 8250391430181461713L;
        aj.cfws[21] = 2447289789438601129L;
        aj.cfws[22] = 8279195582743499010L;
        aj.cfws[23] = 704040261179492597L;
        aj.cfws[24] = 6307405713387840676L;
        aj.cfws[25] = 8755814750304122004L;
        aj.cfws[26] = 2796247738545891442L;
        aj.cfws[27] = -230148781403822834L;
        aj.cfws[28] = 157653838211067909L;
        aj.cfws[29] = -6165446903582882503L;
        aj.cfws[30] = 2238002309724880805L;
        aj.cfws[31] = -3073231520763377411L;
    }

    static {
        cfwg = new int[198];
        cfwh = new int[198];
        aj.cggn();
        aj.cggo();
        aj.cggp();
        aj.cggq();
        cfws = new long[32];
        cfwt = new long[32];
        aj.cggr();
        aj.cggs();
    }

    public static /* synthetic */ CallSite cfwi(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void cggs() {
        aj.cfwt[0] = 7332500850112768882L;
        aj.cfwt[1] = -6223610745927562476L;
        aj.cfwt[2] = -459719507696177651L;
        aj.cfwt[3] = 3831803640981701826L;
        aj.cfwt[4] = -3272505983331809644L;
        aj.cfwt[5] = -1277228316722354620L;
        aj.cfwt[6] = 5902801131926534216L;
        aj.cfwt[7] = 6313767224298782831L;
        aj.cfwt[8] = 1172537876766697835L;
        aj.cfwt[9] = -5330167334114231545L;
        aj.cfwt[10] = -2627917997832152044L;
        aj.cfwt[11] = 893967325426797282L;
        aj.cfwt[12] = -7048829706698655436L;
        aj.cfwt[13] = -8263856650779042344L;
        aj.cfwt[14] = 7345375236586734837L;
        aj.cfwt[15] = -9976313058181618L;
        aj.cfwt[16] = -6157272870095560186L;
        aj.cfwt[17] = 9040726729265885673L;
        aj.cfwt[18] = 2519145504352895144L;
        aj.cfwt[19] = 7234412785166973046L;
        aj.cfwt[20] = 3281646844272772557L;
        aj.cfwt[21] = 1311222671816189152L;
        aj.cfwt[22] = -6018442482114181365L;
        aj.cfwt[23] = -1762729381583112813L;
        aj.cfwt[24] = -6898021203386209536L;
        aj.cfwt[25] = 1864413911592471882L;
        aj.cfwt[26] = -6091431700810543334L;
        aj.cfwt[27] = -2470382559755469991L;
        aj.cfwt[28] = -8540945761070032446L;
        aj.cfwt[29] = 4778357050357194464L;
        aj.cfwt[30] = -8140807001441754092L;
        aj.cfwt[31] = 2505276266641479838L;
    }

    private static /* synthetic */ void cggo() {
        aj.cfwg[100] = 848817872;
        aj.cfwg[101] = -1383970908;
        aj.cfwg[102] = 795018918;
        aj.cfwg[103] = -1209508054;
        aj.cfwg[104] = -980701012;
        aj.cfwg[105] = 724941011;
        aj.cfwg[106] = 370818208;
        aj.cfwg[107] = 1306916772;
        aj.cfwg[108] = -887122560;
        aj.cfwg[109] = -1805679676;
        aj.cfwg[110] = 227414854;
        aj.cfwg[111] = 1290999186;
        aj.cfwg[112] = -1662481484;
        aj.cfwg[113] = 645650688;
        aj.cfwg[114] = 633617472;
        aj.cfwg[115] = -1531710076;
        aj.cfwg[116] = 393913894;
        aj.cfwg[117] = 778995177;
        aj.cfwg[118] = 427591453;
        aj.cfwg[119] = 185346641;
        aj.cfwg[120] = 1227629508;
        aj.cfwg[121] = -437202606;
        aj.cfwg[122] = -1949613151;
        aj.cfwg[123] = -327758302;
        aj.cfwg[124] = -875095998;
        aj.cfwg[125] = 959460695;
        aj.cfwg[126] = -220017917;
        aj.cfwg[127] = 953123002;
        aj.cfwg[128] = 1450201657;
        aj.cfwg[129] = -695459195;
        aj.cfwg[130] = -718251712;
        aj.cfwg[131] = 88570886;
        aj.cfwg[132] = 732834166;
        aj.cfwg[133] = 1586512927;
        aj.cfwg[134] = -376533900;
        aj.cfwg[135] = 2082693391;
        aj.cfwg[136] = -580759907;
        aj.cfwg[137] = -903089957;
        aj.cfwg[138] = 177355774;
        aj.cfwg[139] = -1483504566;
        aj.cfwg[140] = -2066362088;
        aj.cfwg[141] = -1342255936;
        aj.cfwg[142] = -702773974;
        aj.cfwg[143] = 1203885539;
        aj.cfwg[144] = -1348015586;
        aj.cfwg[145] = -1298284780;
        aj.cfwg[146] = 2141663606;
        aj.cfwg[147] = 1649260736;
        aj.cfwg[148] = 983320235;
        aj.cfwg[149] = 1077066440;
        aj.cfwg[150] = 1802426410;
        aj.cfwg[151] = 1948211422;
        aj.cfwg[152] = -1864770055;
        aj.cfwg[153] = -888338617;
        aj.cfwg[154] = -588224210;
        aj.cfwg[155] = -620669904;
        aj.cfwg[156] = -232811814;
        aj.cfwg[157] = -1713437344;
        aj.cfwg[158] = -2107247132;
        aj.cfwg[159] = -200748061;
        aj.cfwg[160] = -1367726701;
        aj.cfwg[161] = 1220647194;
        aj.cfwg[162] = 994634461;
        aj.cfwg[163] = -1413391507;
        aj.cfwg[164] = -1521272804;
        aj.cfwg[165] = -1864058363;
        aj.cfwg[166] = -811723466;
        aj.cfwg[167] = -2037191233;
        aj.cfwg[168] = -1051365969;
        aj.cfwg[169] = 525848251;
        aj.cfwg[170] = -1154344826;
        aj.cfwg[171] = 3036903;
        aj.cfwg[172] = -563747818;
        aj.cfwg[173] = 1389090692;
        aj.cfwg[174] = -382517604;
        aj.cfwg[175] = 557099770;
        aj.cfwg[176] = 1128566522;
        aj.cfwg[177] = 1074550840;
        aj.cfwg[178] = -355722003;
        aj.cfwg[179] = -1910024255;
        aj.cfwg[180] = -1527582074;
        aj.cfwg[181] = 1423748765;
        aj.cfwg[182] = 391136022;
        aj.cfwg[183] = 949765616;
        aj.cfwg[184] = 1233519487;
        aj.cfwg[185] = -266663471;
        aj.cfwg[186] = 2118763576;
        aj.cfwg[187] = -1257180810;
        aj.cfwg[188] = -736212284;
        aj.cfwg[189] = 1156569591;
        aj.cfwg[190] = 1907679355;
        aj.cfwg[191] = -1322938781;
        aj.cfwg[192] = 1060792627;
        aj.cfwg[193] = 1479941934;
        aj.cfwg[194] = 777400084;
        aj.cfwg[195] = -1211139865;
        aj.cfwg[196] = 1075749627;
        aj.cfwg[197] = 1431961341;
    }
}

