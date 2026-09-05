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
import java.nio.charset.StandardCharsets;
import ruhack.phobia.mt;

public final class ms {
    private static final Gson GSON;
    private static long[] ftcl;
    private static volatile boolean attempted;
    private static long[] ftck;
    public static final int b;
    public static final boolean c;
    private static final String RESOURCE_PREFIX = "/phobia/aim/ml/";
    static final long my = -1344959844320920402L;
    private static final mt MODEL;
    private static final String BUILTIN = "holy8k";
    private static int[] ftcd;
    public static final boolean a;
    private static int[] ftcc;
    private static volatile boolean ready;

    private static /* synthetic */ int ftca(int n2) {
        return ftcc[n2] ^ ftcd[n2];
    }

    static {
        ftcc = new int[162];
        ftcd = new int[162];
        ms.ftog();
        ms.ftos();
        ms.ftox();
        ms.ftpf();
        ftck = new long[17];
        ftcl = new long[17];
        ms.ftpl();
        ms.ftpn();
        GSON = new Gson();
        MODEL = new mt();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static mt get() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ms.my - ms.ftce("ftcn", ftcj(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ms.ftce("ftco", ftca(int ), (int)3)) break;
            v0 /* !! */  = (long)ms.ftce("ftcp", ftca(int ), (int)4);
        }
        var2 = ms.c;
        v1 /* !! */  = ms.my;
        if (true) ** GOTO lbl11
        block15: while (true) {
            v1 /* !! */  = (long)(v2 - ms.ftce("ftcq", ftcj(int ), (int)1));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1038730066: {
                    break block15;
                }
                case 561745353: {
                    v2 = ms.ftce("ftcr", ftcj(int ), (int)2);
                    continue block15;
                }
                case 717340480: {
                    v2 = ms.ftce("ftcs", ftcj(int ), (int)3);
                    continue block15;
                }
                case 1071631384: {
                    v2 = ms.ftce("ftcu", ftcj(int ), (int)4);
                    continue block15;
                }
            }
            break;
        }
        var1_1 /* !! */  = ms.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ms.my - ms.ftce("ftcx", ftcj(int ), (int)5)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ms.ftce("ftcy", ftca(int ), (int)5)) break;
            v3 /* !! */  = (long)ms.ftce("ftcz", ftca(int ), (int)6);
        }
        var0_2 = ms.a;
        if (!var2) ** GOTO lbl36
        throw null;
lbl-1000:
        // 2 sources

        {
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var1_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl36:
                // 1 sources

                if (var0_2 || var0_2) ** GOTO lbl-1000
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ms.my - ms.ftce("ftdb", ftcj(int ), (int)6)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ms.ftce("ftdc", ftca(int ), (int)7)) break;
                    v4 /* !! */  = (long)ms.ftce("ftde", ftca(int ), (int)8);
                }
                ms.ensureLoaded();
                if (var0_2 || var0_2) continue block17;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = ms.my - ms.ftce("ftdf", ftcj(int ), (int)7)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ms.ftce("ftdh", ftca(int ), (int)9)) break;
                    v5 /* !! */  = (long)ms.ftce("ftdi", ftca(int ), (int)10);
                }
                return ms.MODEL;
                case 0: {
                    var1_1 /* !! */  = (int)ms.ftce("ftdj", ftca(int ), (int)11);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl60
                }
lbl55:
                // 2 sources

                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var1_1 /* !! */  = (int)ms.ftce("ftdk", ftca(int ), (int)12);
                        if (!var2) ** GOTO lbl-1000
                        throw null;
                    }
                }
lbl60:
                // 3 sources

                case 2: {
                    do {
                        var1_1 /* !! */  = (int)ms.ftce("ftdl", ftca(int ), (int)13);
                    } while (!var2);
                    throw null;
                }
                case 3: {
                    var1_1 /* !! */  = (int)ms.ftce("ftdm", ftca(int ), (int)14);
                    if (!var2) ** GOTO lbl55
                    throw null;
                }
                case 4: {
                    var1_1 /* !! */  = (int)ms.ftce("ftdn", ftca(int ), (int)15);
                    if (!var2) ** GOTO lbl60
                    throw null;
                }
                case 5: 
            }
        }
        var1_1 /* !! */  = (int)ms.ftce("ftdo", ftca(int ), (int)16);
        ** while (!var2)
lbl76:
        // 1 sources

        throw null;
    }

    /*
     * Exception decompiling
     */
    private static float[][] loadEmbeddedDataset() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 7[SWITCH]
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

    private static /* synthetic */ void ftox() {
        ms.ftcd[0] = -1956932153;
        ms.ftcd[1] = -865442720;
        ms.ftcd[2] = 7714800;
        ms.ftcd[3] = 55089515;
        ms.ftcd[4] = -602272064;
        ms.ftcd[5] = 481203726;
        ms.ftcd[6] = 1186950676;
        ms.ftcd[7] = -1024857390;
        ms.ftcd[8] = 1994104617;
        ms.ftcd[9] = -1836096617;
        ms.ftcd[10] = 1475803006;
        ms.ftcd[11] = -979836980;
        ms.ftcd[12] = -1454380450;
        ms.ftcd[13] = 808756372;
        ms.ftcd[14] = 600196733;
        ms.ftcd[15] = 676208923;
        ms.ftcd[16] = -2138292777;
        ms.ftcd[17] = -1208456500;
        ms.ftcd[18] = 899087092;
        ms.ftcd[19] = 1018498000;
        ms.ftcd[20] = 486422745;
        ms.ftcd[21] = 439440277;
        ms.ftcd[22] = -905756989;
        ms.ftcd[23] = -381825022;
        ms.ftcd[24] = -799162070;
        ms.ftcd[25] = 253489636;
        ms.ftcd[26] = 1201362229;
        ms.ftcd[27] = 36458518;
        ms.ftcd[28] = 701094901;
        ms.ftcd[29] = 388873131;
        ms.ftcd[30] = -1530856867;
        ms.ftcd[31] = 1656268738;
        ms.ftcd[32] = 2011171249;
        ms.ftcd[33] = 241629483;
        ms.ftcd[34] = 1780875761;
        ms.ftcd[35] = -1105161021;
        ms.ftcd[36] = -472592629;
        ms.ftcd[37] = -1655873105;
        ms.ftcd[38] = 474948307;
        ms.ftcd[39] = -401957658;
        ms.ftcd[40] = 1303607580;
        ms.ftcd[41] = 1112104361;
        ms.ftcd[42] = 853899362;
        ms.ftcd[43] = 1843107534;
        ms.ftcd[44] = 2069459166;
        ms.ftcd[45] = -1500330214;
        ms.ftcd[46] = 177095948;
        ms.ftcd[47] = 550861557;
        ms.ftcd[48] = -1089547812;
        ms.ftcd[49] = -1434530761;
        ms.ftcd[50] = 1122224679;
        ms.ftcd[51] = 2053357808;
        ms.ftcd[52] = 981809192;
        ms.ftcd[53] = 1308022857;
        ms.ftcd[54] = -125613823;
        ms.ftcd[55] = 1064946934;
        ms.ftcd[56] = -1306461806;
        ms.ftcd[57] = 1140500180;
        ms.ftcd[58] = 1305575733;
        ms.ftcd[59] = -1825820254;
        ms.ftcd[60] = -1040171498;
        ms.ftcd[61] = 160294139;
        ms.ftcd[62] = 760758336;
        ms.ftcd[63] = 2079705591;
        ms.ftcd[64] = 628534165;
        ms.ftcd[65] = -745274078;
        ms.ftcd[66] = 1672795731;
        ms.ftcd[67] = -1230639195;
        ms.ftcd[68] = -1981048632;
        ms.ftcd[69] = -1977407275;
        ms.ftcd[70] = 1983415401;
        ms.ftcd[71] = 235229578;
        ms.ftcd[72] = 846461809;
        ms.ftcd[73] = 1828799719;
        ms.ftcd[74] = -1546045540;
        ms.ftcd[75] = -1827459461;
        ms.ftcd[76] = 291538386;
        ms.ftcd[77] = 1653400542;
        ms.ftcd[78] = -1994250828;
        ms.ftcd[79] = 1200945219;
        ms.ftcd[80] = 864790371;
        ms.ftcd[81] = 2055547534;
        ms.ftcd[82] = 45686529;
        ms.ftcd[83] = -1613847829;
        ms.ftcd[84] = -1648728898;
        ms.ftcd[85] = -549780733;
        ms.ftcd[86] = 1309059434;
        ms.ftcd[87] = -1059445701;
        ms.ftcd[88] = 2048801502;
        ms.ftcd[89] = 1945080228;
        ms.ftcd[90] = -1982056251;
        ms.ftcd[91] = 1668867969;
        ms.ftcd[92] = -1976204920;
        ms.ftcd[93] = 1153587348;
        ms.ftcd[94] = -1428875160;
        ms.ftcd[95] = -1616758384;
        ms.ftcd[96] = -752156408;
        ms.ftcd[97] = -439112357;
        ms.ftcd[98] = -1646011905;
        ms.ftcd[99] = -1212288757;
    }

    private static /* synthetic */ void ftpl() {
        ms.ftck[0] = 1980036420334659597L;
        ms.ftck[1] = -5564992010870858703L;
        ms.ftck[2] = -6377256004218351661L;
        ms.ftck[3] = 7082276874987548084L;
        ms.ftck[4] = 6146230335683272189L;
        ms.ftck[5] = -4565675181915611034L;
        ms.ftck[6] = 2639262704191409399L;
        ms.ftck[7] = -443303792509183994L;
        ms.ftck[8] = 5187029394859851800L;
        ms.ftck[9] = 2397183576332950042L;
        ms.ftck[10] = 1915577102729690634L;
        ms.ftck[11] = 3082827046797620062L;
        ms.ftck[12] = 3051194108574316169L;
        ms.ftck[13] = -4214334662072784759L;
        ms.ftck[14] = 5143946588390331059L;
        ms.ftck[15] = -4305692435816908339L;
        ms.ftck[16] = -8443533536692664736L;
    }

    /*
     * Exception decompiling
     */
    private static void ensureLoaded() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[TRYBLOCK]], but top level block is 6[CASE]
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

    public static /* synthetic */ CallSite ftce(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void ftpn() {
        ms.ftcl[0] = 2546127952034921836L;
        ms.ftcl[1] = -861731641633086748L;
        ms.ftcl[2] = 7893115379740095546L;
        ms.ftcl[3] = 8284131505288113433L;
        ms.ftcl[4] = 4986207405258032580L;
        ms.ftcl[5] = -497291413348641081L;
        ms.ftcl[6] = 1881953489016525390L;
        ms.ftcl[7] = 7367750865395324617L;
        ms.ftcl[8] = -6034937682662038479L;
        ms.ftcl[9] = 8486362169029799281L;
        ms.ftcl[10] = 1053491691287040064L;
        ms.ftcl[11] = -4306024877789098985L;
        ms.ftcl[12] = 5821111727279002883L;
        ms.ftcl[13] = 1463639529928501851L;
        ms.ftcl[14] = -6171550291490034394L;
        ms.ftcl[15] = -1643218139923226722L;
        ms.ftcl[16] = 574475458752802133L;
    }

    private static /* synthetic */ void ftpf() {
        ms.ftcd[100] = -273895648;
        ms.ftcd[101] = 40264901;
        ms.ftcd[102] = -1471717985;
        ms.ftcd[103] = -475343133;
        ms.ftcd[104] = 356304701;
        ms.ftcd[105] = -468330230;
        ms.ftcd[106] = 1681901339;
        ms.ftcd[107] = 2141491997;
        ms.ftcd[108] = -612388372;
        ms.ftcd[109] = 1138994734;
        ms.ftcd[110] = -426969962;
        ms.ftcd[111] = 1242898904;
        ms.ftcd[112] = 356282251;
        ms.ftcd[113] = -2060257110;
        ms.ftcd[114] = 1464158809;
        ms.ftcd[115] = 832181390;
        ms.ftcd[116] = 1676442179;
        ms.ftcd[117] = -1275286964;
        ms.ftcd[118] = 1647110118;
        ms.ftcd[119] = -901373031;
        ms.ftcd[120] = -1424796875;
        ms.ftcd[121] = -1914476197;
        ms.ftcd[122] = 1956813389;
        ms.ftcd[123] = -894708743;
        ms.ftcd[124] = -1486541069;
        ms.ftcd[125] = 797652478;
        ms.ftcd[126] = 2058952637;
        ms.ftcd[127] = -423217836;
        ms.ftcd[128] = -498633423;
        ms.ftcd[129] = 117146077;
        ms.ftcd[130] = 929599581;
        ms.ftcd[131] = 1017183293;
        ms.ftcd[132] = 732759995;
        ms.ftcd[133] = -1625776632;
        ms.ftcd[134] = 103612508;
        ms.ftcd[135] = 217152696;
        ms.ftcd[136] = 234587306;
        ms.ftcd[137] = 296461079;
        ms.ftcd[138] = -1138446522;
        ms.ftcd[139] = 753289469;
        ms.ftcd[140] = 549844946;
        ms.ftcd[141] = 725497747;
        ms.ftcd[142] = -49194855;
        ms.ftcd[143] = 109803644;
        ms.ftcd[144] = 989638526;
        ms.ftcd[145] = -259925868;
        ms.ftcd[146] = 46496152;
        ms.ftcd[147] = -427959519;
        ms.ftcd[148] = -1023858593;
        ms.ftcd[149] = -2041542485;
        ms.ftcd[150] = -188768162;
        ms.ftcd[151] = 277322969;
        ms.ftcd[152] = 1707623616;
        ms.ftcd[153] = -439416575;
        ms.ftcd[154] = 1061361717;
        ms.ftcd[155] = -1251664557;
        ms.ftcd[156] = 1988379390;
        ms.ftcd[157] = 337051840;
        ms.ftcd[158] = 777946920;
        ms.ftcd[159] = -2103902197;
        ms.ftcd[160] = -307026121;
        ms.ftcd[161] = 978433713;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean isReady() {
        v0 /* !! */  = ms.my;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(ms.ftce("ftds", ftcj(int ), (int)9) - ms.ftce("ftdr", ftcj(int ), (int)8));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1038730066: {
                    break block21;
                }
                case 102946101: {
                    continue block21;
                }
            }
            break;
        }
        var2 = ms.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ms.my - ms.ftce("ftdt", ftcj(int ), (int)10)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ms.ftce("ftdu", ftca(int ), (int)17)) break;
            v1 /* !! */  = (long)ms.ftce("ftdv", ftca(int ), (int)18);
        }
        var1_1 /* !! */  = ms.b;
        v2 /* !! */  = ms.my;
        if (true) ** GOTO lbl22
        block23: while (true) {
            v2 /* !! */  = (long)(ms.ftce("fteb", ftcj(int ), (int)12) - ms.ftce("ftdz", ftcj(int ), (int)11));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1038730066: {
                    break block23;
                }
                case 1192685374: {
                    continue block23;
                }
            }
            break;
        }
        var0_2 = ms.a;
        if (var2) {
            throw null;
lbl30:
            // 2 sources

            return (boolean)ms.ftce("ftec", ftca(int ), (int)19);
        }
        if (var0_2 || var0_2) ** GOTO lbl30
        v3 /* !! */  = ms.my;
        if (true) ** GOTO lbl37
        block25: while (true) {
            v3 /* !! */  = (long)(v4 - ms.ftce("fted", ftcj(int ), (int)13));
lbl37:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1565327404: {
                    v4 = ms.ftce("ftee", ftcj(int ), (int)14);
                    continue block25;
                }
                case -1038730066: {
                    break block25;
                }
                case 2107437437: {
                    v4 = ms.ftce("ftef", ftcj(int ), (int)15);
                    continue block25;
                }
            }
            break;
        }
        ms.ensureLoaded();
        ** while (var0_2 || var0_2)
lbl48:
        // 1 sources

        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = ms.my - ms.ftce("fteg", ftcj(int ), (int)16)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == ms.ftce("ftei", ftca(int ), (int)20)) break;
                    v5 /* !! */  = (long)ms.ftce("ftej", ftca(int ), (int)21);
                }
                return ms.ready;
            }
lbl58:
            // 3 sources

            case 0: {
                var1_1 /* !! */  = (int)ms.ftce("ftek", ftca(int ), (int)22);
                if (var2) {
                    throw null;
                }
            }
            case 1: {
                var1_1 /* !! */  = (int)ms.ftce("ftel", ftca(int ), (int)23);
                if (!var2) break;
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)ms.ftce("ftem", ftca(int ), (int)24);
                if (!var2) ** GOTO lbl58
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)ms.ftce("ften", ftca(int ), (int)25);
                    if (!var2) ** GOTO lbl58
                    throw null;
                }
            }
            case 4: {
                var1_1 /* !! */  = (int)ms.ftce("fteq", ftca(int ), (int)26);
                if (!var2) break;
                throw null;
            }
            case 5: 
        }
        var1_1 /* !! */  = (int)ms.ftce("fter", ftca(int ), (int)27);
        ** while (!var2)
lbl82:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    private static boolean loadEmbeddedModel() {
        block76: {
            block74: {
                block75: {
                    var5 = ms.c;
                    var4_1 /* !! */  = ms.b;
                    var3_2 = ms.a;
                    if (var5) {
                        throw null;
lbl6:
                        // 23 sources

                        return (boolean)ms.ftce("ftiz", ftca(int ), (int)88);
                    }
                    if (var3_2) ** GOTO lbl6
                    if (var3_2) ** GOTO lbl6
                    var0_3 = ms.class.getResourceAsStream("/phobia/aim/ml/holy8k.model.json");
                    if (var3_2) ** GOTO lbl6
                    if (var3_2) ** GOTO lbl6
                    if (var0_3 != null) break block74;
                    if (var3_2) ** GOTO lbl6
                    var1_5 = ms.ftce("ftja", ftca(int ), (int)89);
                    if (var3_2 || var3_2) ** GOTO lbl6
                    if (var0_3 == null) break block75;
                    if (var3_2) ** GOTO lbl6
                    var0_3.close();
                    if (var3_2) ** GOTO lbl6
                }
                if (var3_2 || var3_2) ** GOTO lbl6
                return (boolean)var1_5;
            }
            if (var3_2 || var3_2) ** GOTO lbl6
            var1_6 = ms.MODEL.loadFramesJson(new String(var0_3.readAllBytes(), StandardCharsets.UTF_8));
            if (var3_2 || var3_2) ** GOTO lbl6
            if (var0_3 == null) break block76;
            if (var3_2) ** GOTO lbl6
            {
                catch (Throwable var1_7) {
                    if (var3_2) ** GOTO lbl6
                    if (var0_3 == null) ** GOTO lbl53
                    if (var3_2) ** GOTO lbl6
                    if (var3_2) ** GOTO lbl6
                    var0_3.close();
                    if (var3_2) ** GOTO lbl6
                    if (var4_1 /* !! */  == 0) ** GOTO lbl-1000
                    switch (var4_1 /* !! */ ) {
                        default: lbl-1000:
                        // 2 sources

                        {
                            if (var3_2) ** GOTO lbl6
                            if (var5) {
                                throw null;
                            }
                            ** GOTO lbl53
                        }
                        catch (Throwable var2_8) {
                            if (var3_2) ** GOTO lbl6
                            var1_7.addSuppressed(var2_8);
                            if (var3_2) ** GOTO lbl6
                        }
lbl53:
                        // 3 sources

                        if (var3_2 || var3_2) ** GOTO lbl6
                        throw var1_7;
                    }
                }
            }
            var0_3.close();
            if (var3_2) ** GOTO lbl6
        }
        if (var3_2 || var3_2) ** GOTO lbl6
        return var1_6;
        {
            catch (Exception var0_4) {
                if (!var3_2 && !var3_2) ** break;
                ** continue;
                return (boolean)ms.ftce("ftjf", ftca(int ), (int)90);
            }
lbl64:
            // 2 sources

            case 0: {
                var4_1 /* !! */  = (int)ms.ftce("ftjg", ftca(int ), (int)91);
                if (var5) {
                    throw null;
                }
                ** GOTO lbl186
            }
lbl69:
            // 2 sources

            case 1: {
                var4_1 /* !! */  = (int)ms.ftce("ftji", ftca(int ), (int)92);
                if (var5) {
                    throw null;
                }
                ** GOTO lbl121
            }
            case 2: {
                var4_1 /* !! */  = (int)ms.ftce("ftjj", ftca(int ), (int)93);
                if (var5) {
                    throw null;
                }
                ** GOTO lbl117
            }
lbl79:
            // 3 sources

            case 3: {
                var4_1 /* !! */  = (int)ms.ftce("ftjk", ftca(int ), (int)94);
                if (var5) {
                    throw null;
                }
                ** GOTO lbl107
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_1 /* !! */  = (int)ms.ftce("ftjm", ftca(int ), (int)95);
                    if (var5) {
                        throw null;
                    }
                    ** GOTO lbl130
                    break;
                }
            }
lbl90:
            // 2 sources

            case 5: {
                var4_1 /* !! */  = (int)ms.ftce("ftjo", ftca(int ), (int)96);
                if (!var5) ** GOTO lbl64
                throw null;
            }
lbl94:
            // 2 sources

            case 6: {
                var4_1 /* !! */  = (int)ms.ftce("ftjq", ftca(int ), (int)97);
                if (var5) {
                    throw null;
                }
                ** GOTO lbl139
            }
lbl99:
            // 3 sources

            case 7: {
                var4_1 /* !! */  = (int)ms.ftce("ftjs", ftca(int ), (int)98);
                if (!var5) ** GOTO lbl69
                throw null;
            }
            case 8: {
                var4_1 /* !! */  = (int)ms.ftce("ftjw", ftca(int ), (int)99);
                if (!var5) ** GOTO lbl90
                throw null;
            }
lbl107:
            // 2 sources

            case 9: {
                do {
                    var4_1 /* !! */  = (int)ms.ftce("ftjx", ftca(int ), (int)100);
                } while (!var5);
                throw null;
            }
            case 10: {
                var4_1 /* !! */  = (int)ms.ftce("ftjy", ftca(int ), (int)101);
                if (var5) {
                    throw null;
                }
                ** GOTO lbl144
            }
lbl117:
            // 4 sources

            case 11: {
                var4_1 /* !! */  = (int)ms.ftce("ftjz", ftca(int ), (int)102);
                if (!var5) break;
                throw null;
            }
lbl121:
            // 2 sources

            case 12: {
                var4_1 /* !! */  = (int)ms.ftce("ftkb", ftca(int ), (int)103);
                if (!var5) break;
                throw null;
            }
            case 13: {
                var4_1 /* !! */  = (int)ms.ftce("ftkd", ftca(int ), (int)104);
                if (var5) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl130:
            // 3 sources

            case 14: {
                var4_1 /* !! */  = (int)ms.ftce("ftkf", ftca(int ), (int)105);
                if (var5) {
                    throw null;
                }
                ** GOTO lbl170
            }
            case 15: {
                var4_1 /* !! */  = (int)ms.ftce("ftkj", ftca(int ), (int)106);
                if (!var5) ** GOTO lbl94
                throw null;
            }
lbl139:
            // 2 sources

            case 16: {
                var4_1 /* !! */  = (int)ms.ftce("ftkk", ftca(int ), (int)107);
                if (var5) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl144:
            // 2 sources

            case 17: {
                var4_1 /* !! */  = (int)ms.ftce("ftkl", ftca(int ), (int)108);
                if (var5) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl149:
            // 2 sources

            case 18: {
                var4_1 /* !! */  = (int)ms.ftce("ftkn", ftca(int ), (int)109);
                if (var5) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl154:
            // 4 sources

            case 19: {
                var4_1 /* !! */  = (int)ms.ftce("ftko", ftca(int ), (int)110);
                if (var5) {
                    throw null;
                }
            }
            case 20: {
                var4_1 /* !! */  = (int)ms.ftce("ftkr", ftca(int ), (int)111);
                if (!var5) ** GOTO lbl99
                throw null;
            }
            case 21: {
                var4_1 /* !! */  = (int)ms.ftce("ftkt", ftca(int ), (int)112);
                if (!var5) ** GOTO lbl99
                throw null;
            }
            case 22: {
                var4_1 /* !! */  = (int)ms.ftce("ftku", ftca(int ), (int)113);
                if (!var5) ** GOTO lbl117
                throw null;
            }
lbl170:
            // 2 sources

            case 23: {
                var4_1 /* !! */  = (int)ms.ftce("ftkw", ftca(int ), (int)114);
                if (!var5) ** GOTO lbl154
                throw null;
            }
            case 24: {
                var4_1 /* !! */  = (int)ms.ftce("ftkx", ftca(int ), (int)115);
                if (!var5) ** GOTO lbl79
                throw null;
            }
lbl178:
            // 2 sources

            case 25: {
                var4_1 /* !! */  = (int)ms.ftce("ftkz", ftca(int ), (int)116);
                if (var5) {
                    throw null;
                }
            }
            case 26: {
                var4_1 /* !! */  = (int)ms.ftce("ftla", ftca(int ), (int)117);
                if (!var5) ** GOTO lbl117
                throw null;
            }
lbl186:
            // 2 sources

            case 27: {
                do {
                    var4_1 /* !! */  = (int)ms.ftce("ftlc", ftca(int ), (int)118);
                } while (!var5);
                throw null;
            }
            case 28: {
                var4_1 /* !! */  = (int)ms.ftce("ftld", ftca(int ), (int)119);
                if (!var5) ** GOTO lbl79
                throw null;
            }
            case 29: {
                do {
                    var4_1 /* !! */  = (int)ms.ftce("ftlf", ftca(int ), (int)120);
                } while (!var5);
                throw null;
            }
            case 30: {
                var4_1 /* !! */  = (int)ms.ftce("ftlg", ftca(int ), (int)121);
                if (!var5) ** GOTO lbl149
                throw null;
            }
lbl204:
            // 2 sources

            case 31: {
                var4_1 /* !! */  = (int)ms.ftce("ftli", ftca(int ), (int)122);
                if (!var5) ** GOTO lbl130
                throw null;
            }
            ** case 32:
        }
lbl209:
        // 3 sources

        var4_1 /* !! */  = (int)ms.ftce("ftlj", ftca(int ), (int)123);
        ** while (!var5)
lbl211:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long ftcj(int n2) {
        return ftck[n2] ^ ftcl[n2];
    }

    private static /* synthetic */ void ftog() {
        ms.ftcc[0] = -1956932155;
        ms.ftcc[1] = -865442720;
        ms.ftcc[2] = 7714801;
        ms.ftcc[3] = -55089516;
        ms.ftcc[4] = 1850176205;
        ms.ftcc[5] = -481203727;
        ms.ftcc[6] = -164363093;
        ms.ftcc[7] = 1024857389;
        ms.ftcc[8] = -1864550196;
        ms.ftcc[9] = -1836096618;
        ms.ftcc[10] = -995781807;
        ms.ftcc[11] = -979836978;
        ms.ftcc[12] = -1454380454;
        ms.ftcc[13] = 808756373;
        ms.ftcc[14] = 600196735;
        ms.ftcc[15] = 676208927;
        ms.ftcc[16] = -2138292781;
        ms.ftcc[17] = 1208456499;
        ms.ftcc[18] = 1870042859;
        ms.ftcc[19] = 1018498000;
        ms.ftcc[20] = 486422744;
        ms.ftcc[21] = -1091107219;
        ms.ftcc[22] = -905756992;
        ms.ftcc[23] = -381825024;
        ms.ftcc[24] = -799162069;
        ms.ftcc[25] = 253489638;
        ms.ftcc[26] = 1201362231;
        ms.ftcc[27] = 36458515;
        ms.ftcc[28] = 701094900;
        ms.ftcc[29] = 388873130;
        ms.ftcc[30] = -1530856868;
        ms.ftcc[31] = 1656268739;
        ms.ftcc[32] = 2011171258;
        ms.ftcc[33] = 241629470;
        ms.ftcc[34] = 1780875735;
        ms.ftcc[35] = -1105161016;
        ms.ftcc[36] = -472592640;
        ms.ftcc[37] = -1655873102;
        ms.ftcc[38] = 474948311;
        ms.ftcc[39] = -401957674;
        ms.ftcc[40] = 1303607600;
        ms.ftcc[41] = 1112104366;
        ms.ftcc[42] = 853899330;
        ms.ftcc[43] = 1843107561;
        ms.ftcc[44] = 2069459157;
        ms.ftcc[45] = -1500330211;
        ms.ftcc[46] = 177095981;
        ms.ftcc[47] = 550861566;
        ms.ftcc[48] = -1089547826;
        ms.ftcc[49] = -1434530809;
        ms.ftcc[50] = 1122224654;
        ms.ftcc[51] = 2053357817;
        ms.ftcc[52] = 981809182;
        ms.ftcc[53] = 1308022857;
        ms.ftcc[54] = -125613818;
        ms.ftcc[55] = 1064946911;
        ms.ftcc[56] = -1306461787;
        ms.ftcc[57] = 1140500220;
        ms.ftcc[58] = 1305575720;
        ms.ftcc[59] = -1825820236;
        ms.ftcc[60] = -1040171494;
        ms.ftcc[61] = 160294111;
        ms.ftcc[62] = 760758368;
        ms.ftcc[63] = 2079705578;
        ms.ftcc[64] = 628534149;
        ms.ftcc[65] = -745274061;
        ms.ftcc[66] = 1672795723;
        ms.ftcc[67] = -1230639218;
        ms.ftcc[68] = -1981048635;
        ms.ftcc[69] = -1977407262;
        ms.ftcc[70] = 1983415388;
        ms.ftcc[71] = 235229574;
        ms.ftcc[72] = 846461810;
        ms.ftcc[73] = 1828799699;
        ms.ftcc[74] = -1546045542;
        ms.ftcc[75] = -1827459496;
        ms.ftcc[76] = 291538419;
        ms.ftcc[77] = 1653400530;
        ms.ftcc[78] = -1994250847;
        ms.ftcc[79] = 1200945240;
        ms.ftcc[80] = 864790356;
        ms.ftcc[81] = 2055547566;
        ms.ftcc[82] = 45686542;
        ms.ftcc[83] = -1613847829;
        ms.ftcc[84] = -1648728906;
        ms.ftcc[85] = -549780684;
        ms.ftcc[86] = 1309059416;
        ms.ftcc[87] = -1059445727;
        ms.ftcc[88] = 2048801502;
        ms.ftcc[89] = 1945080228;
        ms.ftcc[90] = -1982056251;
        ms.ftcc[91] = 1668867971;
        ms.ftcc[92] = -1976204903;
        ms.ftcc[93] = 1153587336;
        ms.ftcc[94] = -1428875166;
        ms.ftcc[95] = -1616758370;
        ms.ftcc[96] = -752156386;
        ms.ftcc[97] = -439112366;
        ms.ftcc[98] = -1646011928;
        ms.ftcc[99] = -1212288759;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private ms() {
        block7: {
            var2_1 /* !! */  = ms.b;
            if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            do {
                switch (cfr_temp_0 == -2147483648 ? var2_1 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        super();
                        return;
                    }
                    case 0: {
                        ** break;
                    }
                    case 2: {
                        break block7;
                    }
lbl13:
                    // 2 sources

                    while (true) {
                        cfr_temp_0 = 1;
                        var2_1 /* !! */  = (int)ms.ftce("ftcg", ftca(int ), (int)0);
                        break;
                    }
                    case 1: 
                }
                break;
            } while (true);
            var2_1 /* !! */  = (int)ms.ftce("ftch", ftca(int ), (int)1);
        }
        var2_1 /* !! */  = (int)ms.ftce("ftci", ftca(int ), (int)2);
        ** while (true)
    }

    private static /* synthetic */ void ftos() {
        ms.ftcc[100] = -273895632;
        ms.ftcc[101] = 40264899;
        ms.ftcc[102] = -1471717992;
        ms.ftcc[103] = -475343125;
        ms.ftcc[104] = 356304674;
        ms.ftcc[105] = -468330227;
        ms.ftcc[106] = 1681901329;
        ms.ftcc[107] = 2141491973;
        ms.ftcc[108] = -612388376;
        ms.ftcc[109] = 1138994720;
        ms.ftcc[110] = -426969970;
        ms.ftcc[111] = 1242898880;
        ms.ftcc[112] = 356282265;
        ms.ftcc[113] = -2060257115;
        ms.ftcc[114] = 1464158787;
        ms.ftcc[115] = 832181380;
        ms.ftcc[116] = 1676442197;
        ms.ftcc[117] = -1275286976;
        ms.ftcc[118] = 1647110114;
        ms.ftcc[119] = -901373041;
        ms.ftcc[120] = -1424796868;
        ms.ftcc[121] = -1914476208;
        ms.ftcc[122] = 1956813421;
        ms.ftcc[123] = -894708761;
        ms.ftcc[124] = -1486541066;
        ms.ftcc[125] = 797652446;
        ms.ftcc[126] = 2058952608;
        ms.ftcc[127] = -423217829;
        ms.ftcc[128] = -498633437;
        ms.ftcc[129] = 117146111;
        ms.ftcc[130] = 929599572;
        ms.ftcc[131] = 1017183294;
        ms.ftcc[132] = 732759990;
        ms.ftcc[133] = -1625776619;
        ms.ftcc[134] = 103612511;
        ms.ftcc[135] = 217152681;
        ms.ftcc[136] = 234587323;
        ms.ftcc[137] = 296461066;
        ms.ftcc[138] = -1138446516;
        ms.ftcc[139] = 753289461;
        ms.ftcc[140] = 549844953;
        ms.ftcc[141] = 725497748;
        ms.ftcc[142] = -49194849;
        ms.ftcc[143] = 109803625;
        ms.ftcc[144] = 989638523;
        ms.ftcc[145] = -259925835;
        ms.ftcc[146] = 46496144;
        ms.ftcc[147] = -427959504;
        ms.ftcc[148] = -1023858621;
        ms.ftcc[149] = -2041542489;
        ms.ftcc[150] = -188768171;
        ms.ftcc[151] = 277323001;
        ms.ftcc[152] = 1707623616;
        ms.ftcc[153] = -439416571;
        ms.ftcc[154] = 1061361710;
        ms.ftcc[155] = -1251664561;
        ms.ftcc[156] = 1988379382;
        ms.ftcc[157] = 337051865;
        ms.ftcc[158] = 777946892;
        ms.ftcc[159] = -2103902205;
        ms.ftcc[160] = -307026140;
        ms.ftcc[161] = 978433682;
    }
}

