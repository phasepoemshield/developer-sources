/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.io.File;
import java.io.FilenameFilter;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class b {
    static final long dr = 8301642700061845822L;
    private static long[] bpkv;
    private static long[] bpkw;
    public static final int b;
    private static int[] bplg;
    public static final boolean c;
    private static int[] bplh;
    public static final String CHARSET = "\"\\\" \u00a1\u2030\u00b7\u20b4\u2260\u00bf\u00d7\u00d8\u00f8\u0410\u0411\u0412\u0413\u0414\u0415\u0401\u0416\u0417\u0418\u0419\u041a\u041b\u041c\u041d\u041e\u041f\u0420\u0421\u0422\u0423\u0424\u0425\u0426\u0427\u0428\u0429\u042a\u042b\u042c\u042d\u042e\u042f\u0430\u0431\u0432\u0433\u0434\u0435\u0451\u0436\u0437\u0438\u0439\u043a\u043b\u043c\u043d\u043e\u043f\u0440\u0441\u0442\u0443\u0444\u0445\u0446\u0447\u0448\u0449\u044a\u044b\u044c\u044d\u044e\u044f\u0454\u2013\u2014\u2018\u2019\u201c\u201d\u201e\u2026\u2190\u2191\u2192\u2193\u02bb\u02cc\u037e\u2070\u00b9\u00b3\u2074\u2075\u2076\u2077\u2078\u2079\u207a\u207b\u207c\u207d\u207e\u2071\u2122\u0294\u0295\u00a4\u00a5\u00a9\u00ae\u00b5\u00b6\u00bc\u00bd\u00be\u0387\u2010\u201a\u2020\u2021\u2022\u2032\u2033\u2034\u2039\u203a\u203d\u2042\u2117\u2212\u221e\u0404\u2660\u2663\u2665\u2666\u266d\u266e\u266f\u2680\u2681\u2682\u2683\u2684\u2685\u02ac\u2744\u23cf\u23fb\u23fc\u23fd\u2b58\u25b2\u25b6\u25bc\u25c0\u25cf\u25e6 \u00a6\u1d00\u0299\u1d04\u1d05\u1d07\ua730\u0262\u029c\u1d0a\u1d0b\u029f\u1d0d\u0274\u1d0f\u1d18\ua7af\u0280\ua731\u1d1b\u1d1c\u1d20\u1d21\u028f\u1d22\u00a7\u02a1\u02a2\u0298\u01c0\u01c3\u01c2\u01c1\u2602\u2664\u2667\u2661\u2662\u2194\u2211\u25a1\u25b3\u25b7\u25bd\u25c1\u25cb\u2606\u2605\u2080\u2081\u2082\u2083\u2084\u2085\u2086\u2087\u2088\u2089\u208a\u208b\u208c\u208d\u208e\u222b\u2300\u2318\u26a0\u24ea\u2460\u2461\u2462\u2463\u2464\u2465\u2466\u2467\u2468\u2469\u246a\u246b\u246c\u246d\u246e\u246f\u2470\u2471\u2472\u2473\u24b6\u24b7\u24b8\u24b9\u24ba\u24bb\u24bc\u24bd\u24be\u24bf\u24c0\u24c1\u24c2\u24c3\u24c4\u24c5\u24c6\u24c7\u24c8\u24c9\u24ca\u24cb\u24cc\u24cd\u24ce\u24cf\u24d0\u24d1\u24d2\u24d3\u24d4\u24d5\u24d6\u24d7\u24d8\u24d9\u24da\u24db\u24dc\u24dd\u24de\u24df\u24e0\u24e1\u24e2\u24e3\u24e4\u24e5\u24e6\u24e7\u24e8\u24e9\u2611\u2612!#$%&'()*+,-./0123456789:;<=>[\\\\]^_`?@ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz{|}~\u00a3\u0192\u00aa\u00ba\u00ac\u00ab\u00bb\u2261\u00b1\u2265\u2264\u2320\u2321\u00f7\u2248\u00b0\u2219\u221a\u207f\u00b2\u25a0\"";
    public static final boolean a;

    /*
     * Exception decompiling
     */
    private static /* synthetic */ void lambda$generate$1(File var0, String var1_1, Path var2_2, List var3_3) {
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
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static /* synthetic */ int bplf(int n2) {
        return bplg[n2] ^ bplh[n2];
    }

    public static /* synthetic */ CallSite bpkx(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void bprz() {
        ruhack.phobia.b.bpkw[0] = 7286225815118285455L;
        ruhack.phobia.b.bpkw[1] = -6174875095964982460L;
        ruhack.phobia.b.bpkw[2] = -8563391874458807229L;
        ruhack.phobia.b.bpkw[3] = -8410836554768645571L;
        ruhack.phobia.b.bpkw[4] = -832717126468152556L;
        ruhack.phobia.b.bpkw[5] = -1463006252642935542L;
        ruhack.phobia.b.bpkw[6] = 4126469775449456204L;
        ruhack.phobia.b.bpkw[7] = 6508340958988188801L;
        ruhack.phobia.b.bpkw[8] = -5129610780249506668L;
        ruhack.phobia.b.bpkw[9] = 1999256138582697461L;
        ruhack.phobia.b.bpkw[10] = 1015164031479840112L;
        ruhack.phobia.b.bpkw[11] = -1606436470030577501L;
        ruhack.phobia.b.bpkw[12] = -115615153805061417L;
        ruhack.phobia.b.bpkw[13] = -8877078212836349300L;
        ruhack.phobia.b.bpkw[14] = 4873672640759805821L;
        ruhack.phobia.b.bpkw[15] = 124274930088232341L;
        ruhack.phobia.b.bpkw[16] = 5788633992171706103L;
        ruhack.phobia.b.bpkw[17] = 2985705539351500863L;
        ruhack.phobia.b.bpkw[18] = -7260407459753656870L;
        ruhack.phobia.b.bpkw[19] = 5064771698267059042L;
    }

    private static /* synthetic */ void bprw() {
        ruhack.phobia.b.bpkv[0] = -2813349805626798652L;
        ruhack.phobia.b.bpkv[1] = 1095371319814356221L;
        ruhack.phobia.b.bpkv[2] = -3109156973784974200L;
        ruhack.phobia.b.bpkv[3] = 4396422271233332209L;
        ruhack.phobia.b.bpkv[4] = -2821390609844497616L;
        ruhack.phobia.b.bpkv[5] = -4354248257209146177L;
        ruhack.phobia.b.bpkv[6] = 3899794193744647515L;
        ruhack.phobia.b.bpkv[7] = -7087617548851931397L;
        ruhack.phobia.b.bpkv[8] = -4093284990746966709L;
        ruhack.phobia.b.bpkv[9] = -5984306471066001072L;
        ruhack.phobia.b.bpkv[10] = 7207514788129935081L;
        ruhack.phobia.b.bpkv[11] = -7616935566824198308L;
        ruhack.phobia.b.bpkv[12] = -6101080920358531228L;
        ruhack.phobia.b.bpkv[13] = -9001393228011025398L;
        ruhack.phobia.b.bpkv[14] = -199765336217846761L;
        ruhack.phobia.b.bpkv[15] = 4533691531675852170L;
        ruhack.phobia.b.bpkv[16] = 8591425020286266454L;
        ruhack.phobia.b.bpkv[17] = -4222288374983296153L;
        ruhack.phobia.b.bpkv[18] = -1171003811577873298L;
        ruhack.phobia.b.bpkv[19] = -8305934272731622407L;
    }

    private static /* synthetic */ void bprq() {
        ruhack.phobia.b.bplg[0] = -438769637;
        ruhack.phobia.b.bplg[1] = -804397841;
        ruhack.phobia.b.bplg[2] = 1760844886;
        ruhack.phobia.b.bplg[3] = -1745269097;
        ruhack.phobia.b.bplg[4] = -172925037;
        ruhack.phobia.b.bplg[5] = -339352411;
        ruhack.phobia.b.bplg[6] = -1805973152;
        ruhack.phobia.b.bplg[7] = 1578423840;
        ruhack.phobia.b.bplg[8] = -1424668010;
        ruhack.phobia.b.bplg[9] = 1270072262;
        ruhack.phobia.b.bplg[10] = 2142952901;
        ruhack.phobia.b.bplg[11] = 78893781;
        ruhack.phobia.b.bplg[12] = -1015240179;
        ruhack.phobia.b.bplg[13] = 829316569;
        ruhack.phobia.b.bplg[14] = 508104181;
        ruhack.phobia.b.bplg[15] = 1883078458;
        ruhack.phobia.b.bplg[16] = -2078092312;
        ruhack.phobia.b.bplg[17] = 1002050409;
        ruhack.phobia.b.bplg[18] = -817870057;
        ruhack.phobia.b.bplg[19] = 1609648863;
        ruhack.phobia.b.bplg[20] = 1354514331;
        ruhack.phobia.b.bplg[21] = -478740628;
        ruhack.phobia.b.bplg[22] = 707437339;
        ruhack.phobia.b.bplg[23] = -1335453458;
        ruhack.phobia.b.bplg[24] = 966485946;
        ruhack.phobia.b.bplg[25] = 781420935;
        ruhack.phobia.b.bplg[26] = 1501036005;
        ruhack.phobia.b.bplg[27] = 1218604356;
        ruhack.phobia.b.bplg[28] = 900315297;
        ruhack.phobia.b.bplg[29] = -497583310;
        ruhack.phobia.b.bplg[30] = -336037462;
        ruhack.phobia.b.bplg[31] = -1370994667;
        ruhack.phobia.b.bplg[32] = -1937126585;
        ruhack.phobia.b.bplg[33] = -1075678671;
        ruhack.phobia.b.bplg[34] = -741629498;
        ruhack.phobia.b.bplg[35] = 1202436637;
        ruhack.phobia.b.bplg[36] = -1594261666;
        ruhack.phobia.b.bplg[37] = -254753262;
        ruhack.phobia.b.bplg[38] = 1974626405;
        ruhack.phobia.b.bplg[39] = 1524479974;
        ruhack.phobia.b.bplg[40] = 510281190;
        ruhack.phobia.b.bplg[41] = -1973346503;
        ruhack.phobia.b.bplg[42] = -754263788;
        ruhack.phobia.b.bplg[43] = 1300168167;
        ruhack.phobia.b.bplg[44] = -172715959;
        ruhack.phobia.b.bplg[45] = -331752669;
        ruhack.phobia.b.bplg[46] = 1831083349;
        ruhack.phobia.b.bplg[47] = -1892905038;
        ruhack.phobia.b.bplg[48] = 1244729237;
        ruhack.phobia.b.bplg[49] = 894756180;
        ruhack.phobia.b.bplg[50] = -191454343;
        ruhack.phobia.b.bplg[51] = -232287907;
        ruhack.phobia.b.bplg[52] = 771340851;
        ruhack.phobia.b.bplg[53] = -656481097;
        ruhack.phobia.b.bplg[54] = 901087897;
        ruhack.phobia.b.bplg[55] = -131464393;
        ruhack.phobia.b.bplg[56] = -507523485;
        ruhack.phobia.b.bplg[57] = 843113406;
        ruhack.phobia.b.bplg[58] = 116091186;
        ruhack.phobia.b.bplg[59] = 1215176318;
        ruhack.phobia.b.bplg[60] = 163792144;
        ruhack.phobia.b.bplg[61] = -1856383419;
        ruhack.phobia.b.bplg[62] = -936989402;
        ruhack.phobia.b.bplg[63] = -1475977514;
        ruhack.phobia.b.bplg[64] = 1900766548;
        ruhack.phobia.b.bplg[65] = -127949868;
        ruhack.phobia.b.bplg[66] = -1734520069;
        ruhack.phobia.b.bplg[67] = 855667633;
        ruhack.phobia.b.bplg[68] = -3706750;
        ruhack.phobia.b.bplg[69] = -231369705;
        ruhack.phobia.b.bplg[70] = 862657292;
        ruhack.phobia.b.bplg[71] = -1951554348;
        ruhack.phobia.b.bplg[72] = 431594034;
        ruhack.phobia.b.bplg[73] = -327136708;
        ruhack.phobia.b.bplg[74] = 555282395;
        ruhack.phobia.b.bplg[75] = 1376741879;
        ruhack.phobia.b.bplg[76] = -352469829;
        ruhack.phobia.b.bplg[77] = 714976038;
        ruhack.phobia.b.bplg[78] = -314687057;
        ruhack.phobia.b.bplg[79] = -1878050335;
        ruhack.phobia.b.bplg[80] = -618625734;
        ruhack.phobia.b.bplg[81] = 673797970;
        ruhack.phobia.b.bplg[82] = 2036476758;
        ruhack.phobia.b.bplg[83] = 1007999019;
        ruhack.phobia.b.bplg[84] = 1989346153;
        ruhack.phobia.b.bplg[85] = 1897700065;
        ruhack.phobia.b.bplg[86] = -1840550778;
        ruhack.phobia.b.bplg[87] = 1660854382;
        ruhack.phobia.b.bplg[88] = 1674696127;
        ruhack.phobia.b.bplg[89] = 220395438;
        ruhack.phobia.b.bplg[90] = 676041860;
        ruhack.phobia.b.bplg[91] = -1733060582;
        ruhack.phobia.b.bplg[92] = -111778589;
        ruhack.phobia.b.bplg[93] = 2041228614;
        ruhack.phobia.b.bplg[94] = 386067395;
        ruhack.phobia.b.bplg[95] = -1547745710;
        ruhack.phobia.b.bplg[96] = -610540752;
        ruhack.phobia.b.bplg[97] = 1422582826;
        ruhack.phobia.b.bplg[98] = 987755618;
        ruhack.phobia.b.bplg[99] = -521954691;
    }

    private static /* synthetic */ void bprt() {
        ruhack.phobia.b.bplh[100] = -924253852;
        ruhack.phobia.b.bplh[101] = -1332781398;
        ruhack.phobia.b.bplh[102] = -1284074817;
        ruhack.phobia.b.bplh[103] = 126705843;
        ruhack.phobia.b.bplh[104] = -1372942157;
        ruhack.phobia.b.bplh[105] = 349426514;
        ruhack.phobia.b.bplh[106] = -17288166;
        ruhack.phobia.b.bplh[107] = -69465038;
        ruhack.phobia.b.bplh[108] = 205161227;
        ruhack.phobia.b.bplh[109] = 1809274659;
        ruhack.phobia.b.bplh[110] = 98010655;
        ruhack.phobia.b.bplh[111] = 1857411322;
        ruhack.phobia.b.bplh[112] = 179437236;
        ruhack.phobia.b.bplh[113] = 89290952;
        ruhack.phobia.b.bplh[114] = -80243801;
        ruhack.phobia.b.bplh[115] = -1402107325;
        ruhack.phobia.b.bplh[116] = -1138984624;
        ruhack.phobia.b.bplh[117] = -77532523;
        ruhack.phobia.b.bplh[118] = 7297749;
        ruhack.phobia.b.bplh[119] = 655313140;
        ruhack.phobia.b.bplh[120] = -1437790712;
        ruhack.phobia.b.bplh[121] = 775558823;
        ruhack.phobia.b.bplh[122] = -320327575;
        ruhack.phobia.b.bplh[123] = -960600471;
        ruhack.phobia.b.bplh[124] = -805928184;
        ruhack.phobia.b.bplh[125] = -1111402166;
        ruhack.phobia.b.bplh[126] = 959349845;
        ruhack.phobia.b.bplh[127] = -1595537545;
        ruhack.phobia.b.bplh[128] = 1907995180;
        ruhack.phobia.b.bplh[129] = 78290330;
        ruhack.phobia.b.bplh[130] = 1769069457;
        ruhack.phobia.b.bplh[131] = 1922759596;
        ruhack.phobia.b.bplh[132] = -1947907845;
        ruhack.phobia.b.bplh[133] = 646195308;
        ruhack.phobia.b.bplh[134] = 438965035;
        ruhack.phobia.b.bplh[135] = -1414708005;
        ruhack.phobia.b.bplh[136] = -1369631789;
        ruhack.phobia.b.bplh[137] = -357409426;
        ruhack.phobia.b.bplh[138] = 909274489;
        ruhack.phobia.b.bplh[139] = -1921540066;
        ruhack.phobia.b.bplh[140] = -1983890566;
        ruhack.phobia.b.bplh[141] = -546589274;
        ruhack.phobia.b.bplh[142] = -973520593;
        ruhack.phobia.b.bplh[143] = 1101567994;
        ruhack.phobia.b.bplh[144] = -1763419726;
        ruhack.phobia.b.bplh[145] = -194322981;
        ruhack.phobia.b.bplh[146] = -1034931752;
        ruhack.phobia.b.bplh[147] = -66803538;
        ruhack.phobia.b.bplh[148] = -1607445727;
        ruhack.phobia.b.bplh[149] = 1104533469;
        ruhack.phobia.b.bplh[150] = 1301476426;
    }

    public b() {
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void main(String[] var0) {
        v0 /* !! */  = ruhack.phobia.b.dr;
        if (true) ** GOTO lbl5
        block31: while (true) {
            v0 /* !! */  = (long)(ruhack.phobia.b.bpkx("bpkz", bpku(int ), (int)1) - ruhack.phobia.b.bpkx("bpky", bpku(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 584521983: {
                    continue block31;
                }
                case 1030138174: {
                    break block31;
                }
            }
            break;
        }
        var5_1 = ruhack.phobia.b.c;
        v1 /* !! */  = ruhack.phobia.b.dr;
        if (true) ** GOTO lbl15
        block32: while (true) {
            v1 /* !! */  = (long)(v2 - ruhack.phobia.b.bpkx("bpla", bpku(int ), (int)2));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1624546309: {
                    v2 = ruhack.phobia.b.bpkx("bplb", bpku(int ), (int)3);
                    continue block32;
                }
                case -747144874: {
                    v2 = ruhack.phobia.b.bpkx("bplc", bpku(int ), (int)4);
                    continue block32;
                }
                case 383218795: {
                    v2 = ruhack.phobia.b.bpkx("bpld", bpku(int ), (int)5);
                    continue block32;
                }
                case 1030138174: {
                    break block32;
                }
            }
            break;
        }
        var4_2 /* !! */  = ruhack.phobia.b.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = ruhack.phobia.b.dr - ruhack.phobia.b.bpkx("bple", bpku(int ), (int)6)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ruhack.phobia.b.bpkx("bpli", bplf(int ), (int)0)) break;
            v3 /* !! */  = (long)ruhack.phobia.b.bpkx("bplj", bplf(int ), (int)1);
        }
        var3_3 = ruhack.phobia.b.a;
        if (var5_1) {
            throw null;
lbl36:
            // 6 sources

            return;
        }
        if (var3_3 || var3_3) ** GOTO lbl36
        var1_4 = "mtsdf-font/";
        if (var3_3 || var3_3) ** GOTO lbl36
        v4 /* !! */  = ruhack.phobia.b.dr;
        if (true) ** GOTO lbl45
        block35: while (true) {
            v4 /* !! */  = (long)(v5 - ruhack.phobia.b.bpkx("bplk", bpku(int ), (int)7));
lbl45:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1997398659: {
                    v5 = ruhack.phobia.b.bpkx("bpll", bpku(int ), (int)8);
                    continue block35;
                }
                case -606597998: {
                    v5 = ruhack.phobia.b.bpkx("bplm", bpku(int ), (int)9);
                    continue block35;
                }
                case 1030138174: {
                    break block35;
                }
            }
            break;
        }
        var2_5 = ruhack.phobia.b.initFile(var1_4);
        if (var3_3 || var3_3) ** GOTO lbl36
        if (var2_5 != null) ** GOTO lbl62
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_3) ** GOTO lbl36
                return;
            }
lbl62:
            // 1 sources

            if (var3_3 || var3_3) ** GOTO lbl36
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_1 = ruhack.phobia.b.dr - ruhack.phobia.b.bpkx("bpln", bpku(int ), (int)10)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == ruhack.phobia.b.bpkx("bplo", bplf(int ), (int)2)) break;
                v6 /* !! */  = (long)ruhack.phobia.b.bpkx("bplp", bplf(int ), (int)3);
            }
            ruhack.phobia.b.generate(var1_4, var2_5, "icons");
            if (!var3_3 && !var3_3) ** break;
            ** continue;
            return;
            case 0: {
                var4_2 /* !! */  = (int)ruhack.phobia.b.bpkx("bplq", bplf(int ), (int)4);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl101
            }
            case 1: {
                var4_2 /* !! */  = (int)ruhack.phobia.b.bpkx("bplr", bplf(int ), (int)5);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl96
            }
            case 2: {
                var4_2 /* !! */  = (int)ruhack.phobia.b.bpkx("bpls", bplf(int ), (int)6);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl123
            }
lbl87:
            // 3 sources

            case 3: {
                var4_2 /* !! */  = (int)ruhack.phobia.b.bpkx("bplt", bplf(int ), (int)7);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl110
            }
lbl92:
            // 2 sources

            case 4: {
                var4_2 /* !! */  = (int)ruhack.phobia.b.bpkx("bplu", bplf(int ), (int)8);
                if (var5_1) {
                    throw null;
                }
            }
lbl96:
            // 4 sources

            case 5: {
                var4_2 /* !! */  = (int)ruhack.phobia.b.bpkx("bplv", bplf(int ), (int)9);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl123
            }
lbl101:
            // 2 sources

            case 6: {
                var4_2 /* !! */  = (int)ruhack.phobia.b.bpkx("bplw", bplf(int ), (int)10);
                if (!var5_1) ** GOTO lbl87
                throw null;
            }
            case 7: {
                do {
                    var4_2 /* !! */  = (int)ruhack.phobia.b.bpkx("bplx", bplf(int ), (int)11);
                } while (!var5_1);
                throw null;
            }
lbl110:
            // 3 sources

            case 8: {
                var4_2 /* !! */  = (int)ruhack.phobia.b.bpkx("bply", bplf(int ), (int)12);
                if (!var5_1) break;
                throw null;
            }
            case 9: {
                var4_2 /* !! */  = (int)ruhack.phobia.b.bpkx("bplz", bplf(int ), (int)13);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl127
            }
            case 10: {
                var4_2 /* !! */  = (int)ruhack.phobia.b.bpkx("bpma", bplf(int ), (int)14);
                if (!var5_1) ** GOTO lbl110
                throw null;
            }
lbl123:
            // 3 sources

            case 11: {
                var4_2 /* !! */  = (int)ruhack.phobia.b.bpkx("bpmb", bplf(int ), (int)15);
                if (!var5_1) ** GOTO lbl87
                throw null;
            }
lbl127:
            // 2 sources

            case 12: {
                var4_2 /* !! */  = (int)ruhack.phobia.b.bpkx("bpmc", bplf(int ), (int)16);
                if (!var5_1) ** GOTO lbl92
                throw null;
            }
            case 13: 
        }
        do {
            var4_2 /* !! */  = (int)ruhack.phobia.b.bpkx("bpmd", bplf(int ), (int)17);
        } while (!var5_1);
        throw null;
    }

    private static /* synthetic */ long bpku(int n2) {
        return bpkv[n2] ^ bpkw[n2];
    }

    static {
        bplg = new int[151];
        bplh = new int[151];
        ruhack.phobia.b.bprq();
        ruhack.phobia.b.bprr();
        ruhack.phobia.b.bprs();
        ruhack.phobia.b.bprt();
        bpkv = new long[20];
        bpkw = new long[20];
        ruhack.phobia.b.bprw();
        ruhack.phobia.b.bprz();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void generate(String var0, Path var1_1, String var2_2) {
        block114: {
            var13_3 = ruhack.phobia.b.c;
            var12_4 /* !! */  = ruhack.phobia.b.b;
            var11_5 = ruhack.phobia.b.a;
            if (var13_3) {
                throw null;
lbl6:
                // 33 sources

                return;
            }
            if (var11_5 || var11_5) ** GOTO lbl6
            var3_6 = new File(var0 + var2_2);
            if (var11_5 || var11_5) ** GOTO lbl6
            var4_7 = var3_6.listFiles((FilenameFilter)LambdaMetafactory.metafactory(null, null, null, (Ljava/io/File;Ljava/lang/String;)Z, lambda$generate$0(java.io.File java.lang.String ), (Ljava/io/File;Ljava/lang/String;)Z)());
            if (var11_5 || var11_5) ** GOTO lbl6
            if (var4_7 == null) ** GOTO lbl78
            if (var11_5) ** GOTO lbl6
            if (var4_7.length <= 0) ** GOTO lbl78
            if (var11_5 || var11_5) ** GOTO lbl6
            var5_8 = Executors.newFixedThreadPool(var4_7.length);
            if (var11_5 || var11_5) ** GOTO lbl6
            var6_9 = new ArrayList<E>();
            if (var11_5 || var11_5) ** GOTO lbl6
            var7_10 = var4_7;
            if (var11_5) ** GOTO lbl6
            var8_12 = ((File[])var7_10).length;
            if (var11_5) ** GOTO lbl6
            var9_14 = ruhack.phobia.b.bpkx("bpme", bplf(int ), (int)18);
            if (var11_5) ** GOTO lbl6
            do {
                if (var11_5 || var11_5) ** GOTO lbl6
                if (var9_14 >= var8_12) break block114;
                if (var11_5) ** GOTO lbl6
                var10_15 = var7_10[var9_14];
                if (var11_5 || var11_5) ** GOTO lbl6
                var5_8.execute((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$generate$1(java.io.File java.lang.String java.nio.file.Path java.util.List ), ()V)((File)var10_15, (String)var0, (Path)var1_1, var6_9));
                if (var11_5 || var11_5) ** GOTO lbl6
                ++var9_14;
                if (var11_5) ** GOTO lbl6
            } while (!var13_3);
            throw null;
        }
        if (var11_5 || var11_5) ** GOTO lbl6
        var5_8.shutdown();
        if (var11_5) ** GOTO lbl6
        try {
            block115: {
                if (var11_5) ** GOTO lbl6
                if (!var5_8.awaitTermination((long)ruhack.phobia.b.bpkx("bpmf", bpku(int ), (int)11), TimeUnit.NANOSECONDS)) break block115;
                if (var11_5 || var11_5) ** GOTO lbl6
                System.out.println("\u041f\u0440\u043e\u0446\u0435\u0441\u0441 \u0437\u0430\u0432\u0435\u0440\u0448\u0451\u043d.");
                if (var11_5) ** GOTO lbl6
            }
            if (var11_5 || var11_5) ** GOTO lbl6
            ** if (!var13_3) goto lbl-1000
        }
        catch (InterruptedException var7_11) {
            if (var11_5 || var11_5) ** GOTO lbl6
            System.err.println("\u041e\u0448\u0438\u0431\u043a\u0430 \u043f\u0440\u0438 \u043e\u0436\u0438\u0434\u0430\u043d\u0438\u0438 \u0437\u0430\u0432\u0435\u0440\u0448\u0435\u043d\u0438\u044f \u043f\u043e\u0442\u043e\u043a\u043e\u0432: " + var7_11.getMessage());
            if (var11_5) ** GOTO lbl6
        }
lbl-1000:
        // 1 sources

        {
            throw null;
        }
lbl-1000:
        // 1 sources

        {
        }
        if (var11_5 || var11_5) ** GOTO lbl6
        var7_10 = var6_9.iterator();
        if (var11_5) ** GOTO lbl6
        block63: while (true) {
            if (var11_5 || var11_5) ** GOTO lbl6
            if (!var7_10.hasNext()) ** GOTO lbl74
            if (var11_5) ** GOTO lbl6
            if (var12_4 /* !! */  == 0) ** GOTO lbl-1000
            switch (var12_4 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    var8_13 = (Process)var7_10.next();
                    if (var11_5 || var11_5) ** GOTO lbl6
                    var8_13.destroy();
                    if (var11_5 || var11_5) ** GOTO lbl6
                    if (!var13_3) continue block63;
                    throw null;
                }
lbl74:
                // 1 sources

                if (var11_5 || var11_5) ** GOTO lbl6
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl81
lbl78:
                // 2 sources

                if (var11_5 || var11_5) ** GOTO lbl6
                System.out.println("\u041d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d\u044b \u0444\u0430\u0439\u043b\u044b \u0448\u0440\u0438\u0444\u0442\u043e\u0432 \u0432 \u0443\u043a\u0430\u0437\u0430\u043d\u043d\u043e\u0439 \u043f\u0430\u043f\u043a\u0435.");
                if (var11_5) ** GOTO lbl6
lbl81:
                // 2 sources

                if (!var11_5 && !var11_5) ** break;
                ** continue;
                return;
lbl84:
                // 2 sources

                case 0: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpmg", bplf(int ), (int)19);
                    if (var13_3) {
                        throw null;
                    }
                    ** GOTO lbl290
                }
lbl89:
                // 3 sources

                case 1: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpmh", bplf(int ), (int)20);
                    if (var13_3) {
                        throw null;
                    }
                    ** GOTO lbl268
                }
lbl94:
                // 3 sources

                case 2: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpmi", bplf(int ), (int)21);
                    if (var13_3) {
                        throw null;
                    }
                    ** GOTO lbl290
                }
                case 3: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpmj", bplf(int ), (int)22);
                    if (!var13_3) break block63;
                    throw null;
                }
                case 4: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpmk", bplf(int ), (int)23);
                    if (var13_3) {
                        throw null;
                    }
                    ** GOTO lbl149
                }
lbl108:
                // 5 sources

                case 5: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpml", bplf(int ), (int)24);
                    if (var13_3) {
                        throw null;
                    }
                    ** GOTO lbl219
                }
lbl113:
                // 2 sources

                case 6: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpmm", bplf(int ), (int)25);
                    if (var13_3) {
                        throw null;
                    }
                    ** GOTO lbl268
                }
lbl118:
                // 2 sources

                case 7: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpmn", bplf(int ), (int)26);
                    if (var13_3) {
                        throw null;
                    }
                    ** GOTO lbl330
                }
lbl123:
                // 2 sources

                case 8: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpmo", bplf(int ), (int)27);
                    if (!var13_3) ** GOTO lbl108
                    throw null;
                }
lbl127:
                // 2 sources

                case 9: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpmp", bplf(int ), (int)28);
                    if (!var13_3) ** GOTO lbl108
                    throw null;
                }
                case 10: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpmq", bplf(int ), (int)29);
                    if (!var13_3) ** GOTO lbl94
                    throw null;
                }
lbl135:
                // 2 sources

                case 11: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpmr", bplf(int ), (int)30);
                    if (var13_3) {
                        throw null;
                    }
                    ** GOTO lbl314
                }
lbl140:
                // 3 sources

                case 12: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpms", bplf(int ), (int)31);
                    if (var13_3) {
                        throw null;
                    }
                    ** GOTO lbl326
                }
                case 13: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpmt", bplf(int ), (int)32);
                    if (!var13_3) ** GOTO lbl108
                    throw null;
                }
lbl149:
                // 3 sources

                case 14: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpmu", bplf(int ), (int)33);
                    if (var13_3) {
                        throw null;
                    }
                    ** GOTO lbl174
                }
                case 15: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpmv", bplf(int ), (int)34);
                    if (var13_3) {
                        throw null;
                    }
                    ** GOTO lbl196
                }
                case 16: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpmw", bplf(int ), (int)35);
                    if (var13_3) {
                        throw null;
                    }
                    ** GOTO lbl183
                }
                case 17: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpmx", bplf(int ), (int)36);
                    if (var13_3) {
                        throw null;
                    }
                    ** GOTO lbl255
                }
                case 18: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpmy", bplf(int ), (int)37);
                    if (var13_3) {
                        throw null;
                    }
                    ** GOTO lbl306
                }
lbl174:
                // 2 sources

                case 19: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpmz", bplf(int ), (int)38);
                    if (!var13_3) ** GOTO lbl94
                    throw null;
                }
                case 20: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpna", bplf(int ), (int)39);
                    if (var13_3) {
                        throw null;
                    }
                    ** GOTO lbl294
                }
lbl183:
                // 3 sources

                case 21: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpnb", bplf(int ), (int)40);
                    if (!var13_3) ** GOTO lbl108
                    throw null;
                }
                case 22: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpnc", bplf(int ), (int)41);
                    if (!var13_3) ** GOTO lbl127
                    throw null;
                }
lbl191:
                // 3 sources

                case 23: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpnd", bplf(int ), (int)42);
                    if (var13_3) {
                        throw null;
                    }
                    ** GOTO lbl250
                }
lbl196:
                // 5 sources

                case 24: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpne", bplf(int ), (int)43);
                    if (var13_3) {
                        throw null;
                    }
                    ** GOTO lbl272
                }
lbl201:
                // 2 sources

                case 25: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpnf", bplf(int ), (int)44);
                    if (!var13_3) ** GOTO lbl196
                    throw null;
                }
                case 26: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpng", bplf(int ), (int)45);
                    if (var13_3) {
                        throw null;
                    }
                    ** GOTO lbl290
                }
                case 27: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpnh", bplf(int ), (int)46);
                    if (var13_3) {
                        throw null;
                    }
                    ** GOTO lbl298
                }
                case 28: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpni", bplf(int ), (int)47);
                    if (!var13_3) ** GOTO lbl123
                    throw null;
                }
lbl219:
                // 2 sources

                case 29: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpnj", bplf(int ), (int)48);
                    if (var13_3) {
                        throw null;
                    }
                    ** GOTO lbl302
                }
                case 30: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpnk", bplf(int ), (int)49);
                    if (!var13_3) ** GOTO lbl196
                    throw null;
                }
                case 31: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpnl", bplf(int ), (int)50);
                    if (!var13_3) ** GOTO lbl84
                    throw null;
                }
                case 32: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpnm", bplf(int ), (int)51);
                    if (var13_3) {
                        throw null;
                    }
                    ** GOTO lbl318
                }
                case 33: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpnn", bplf(int ), (int)52);
                    if (!var13_3) ** GOTO lbl89
                    throw null;
                }
lbl241:
                // 2 sources

                case 34: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpno", bplf(int ), (int)53);
                    if (!var13_3) ** GOTO lbl140
                    throw null;
                }
                case 35: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpnp", bplf(int ), (int)54);
                    if (var13_3) {
                        throw null;
                    }
                    ** GOTO lbl302
                }
lbl250:
                // 3 sources

                case 36: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpnq", bplf(int ), (int)55);
                    if (var13_3) {
                        throw null;
                    }
                    ** GOTO lbl298
                }
lbl255:
                // 2 sources

                case 37: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpnr", bplf(int ), (int)56);
                    if (var13_3) {
                        throw null;
                    }
                }
                case 38: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpns", bplf(int ), (int)57);
                    if (!var13_3) ** GOTO lbl89
                    throw null;
                }
                case 39: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpnt", bplf(int ), (int)58);
                    if (var13_3) {
                        throw null;
                    }
                    ** GOTO lbl285
                }
lbl268:
                // 3 sources

                case 40: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpnu", bplf(int ), (int)59);
                    if (!var13_3) ** GOTO lbl250
                    throw null;
                }
lbl272:
                // 2 sources

                case 41: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpnv", bplf(int ), (int)60);
                    if (!var13_3) ** GOTO lbl191
                    throw null;
                }
                case 42: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpnw", bplf(int ), (int)61);
                    if (var13_3) {
                        throw null;
                    }
                    ** GOTO lbl310
                }
                case 43: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpnx", bplf(int ), (int)62);
                    if (!var13_3) ** GOTO lbl140
                    throw null;
                }
lbl285:
                // 2 sources

                case 44: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpny", bplf(int ), (int)63);
                    if (var13_3) {
                        throw null;
                    }
                    ** GOTO lbl310
                }
lbl290:
                // 4 sources

                case 45: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpnz", bplf(int ), (int)64);
                    if (!var13_3) ** GOTO lbl191
                    throw null;
                }
lbl294:
                // 2 sources

                case 46: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpoa", bplf(int ), (int)65);
                    if (!var13_3) ** GOTO lbl241
                    throw null;
                }
lbl298:
                // 4 sources

                case 47: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpob", bplf(int ), (int)66);
                    if (!var13_3) ** GOTO lbl118
                    throw null;
                }
lbl302:
                // 3 sources

                case 48: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpoc", bplf(int ), (int)67);
                    if (!var13_3) ** GOTO lbl135
                    throw null;
                }
lbl306:
                // 2 sources

                case 49: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpod", bplf(int ), (int)68);
                    if (!var13_3) ** GOTO lbl201
                    throw null;
                }
lbl310:
                // 3 sources

                case 50: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpoe", bplf(int ), (int)69);
                    if (var13_3) {
                        throw null;
                    }
                }
lbl314:
                // 4 sources

                case 51: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpof", bplf(int ), (int)70);
                    if (!var13_3) ** GOTO lbl298
                    throw null;
                }
lbl318:
                // 2 sources

                case 52: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpog", bplf(int ), (int)71);
                    if (!var13_3) ** GOTO lbl149
                    throw null;
                }
                case 53: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpoh", bplf(int ), (int)72);
                    if (!var13_3) ** GOTO lbl113
                    throw null;
                }
lbl326:
                // 2 sources

                case 54: {
                    var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpoi", bplf(int ), (int)73);
                    if (!var13_3) ** GOTO lbl183
                    throw null;
                }
lbl330:
                // 2 sources

                case 55: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpoj", bplf(int ), (int)74);
                        if (!var13_3) ** GOTO lbl196
                        throw null;
                    }
                }
                case 56: 
            }
            break;
        }
        var12_4 /* !! */  = (int)ruhack.phobia.b.bpkx("bpok", bplf(int ), (int)75);
        ** while (!var13_3)
lbl338:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bprr() {
        ruhack.phobia.b.bplg[100] = -924253849;
        ruhack.phobia.b.bplg[101] = -1332781400;
        ruhack.phobia.b.bplg[102] = -1284074830;
        ruhack.phobia.b.bplg[103] = 126705839;
        ruhack.phobia.b.bplg[104] = -1372942172;
        ruhack.phobia.b.bplg[105] = 349426515;
        ruhack.phobia.b.bplg[106] = -17288177;
        ruhack.phobia.b.bplg[107] = -69465037;
        ruhack.phobia.b.bplg[108] = 205161224;
        ruhack.phobia.b.bplg[109] = 1809274663;
        ruhack.phobia.b.bplg[110] = 98010636;
        ruhack.phobia.b.bplg[111] = 1857411297;
        ruhack.phobia.b.bplg[112] = 179437239;
        ruhack.phobia.b.bplg[113] = 89290944;
        ruhack.phobia.b.bplg[114] = -80243780;
        ruhack.phobia.b.bplg[115] = -1402107315;
        ruhack.phobia.b.bplg[116] = -1138984629;
        ruhack.phobia.b.bplg[117] = -77532513;
        ruhack.phobia.b.bplg[118] = 7297758;
        ruhack.phobia.b.bplg[119] = 655313146;
        ruhack.phobia.b.bplg[120] = -1437790701;
        ruhack.phobia.b.bplg[121] = 775558823;
        ruhack.phobia.b.bplg[122] = -320327573;
        ruhack.phobia.b.bplg[123] = -960600463;
        ruhack.phobia.b.bplg[124] = -805928161;
        ruhack.phobia.b.bplg[125] = -1111402174;
        ruhack.phobia.b.bplg[126] = 959349847;
        ruhack.phobia.b.bplg[127] = -1595537555;
        ruhack.phobia.b.bplg[128] = 1907995198;
        ruhack.phobia.b.bplg[129] = 78290326;
        ruhack.phobia.b.bplg[130] = 1769069449;
        ruhack.phobia.b.bplg[131] = 1922759614;
        ruhack.phobia.b.bplg[132] = -1947907844;
        ruhack.phobia.b.bplg[133] = 646195320;
        ruhack.phobia.b.bplg[134] = 438965051;
        ruhack.phobia.b.bplg[135] = -1414708002;
        ruhack.phobia.b.bplg[136] = -1369631806;
        ruhack.phobia.b.bplg[137] = -357409431;
        ruhack.phobia.b.bplg[138] = 909274488;
        ruhack.phobia.b.bplg[139] = -860049340;
        ruhack.phobia.b.bplg[140] = -1983890565;
        ruhack.phobia.b.bplg[141] = -1267174540;
        ruhack.phobia.b.bplg[142] = -973520594;
        ruhack.phobia.b.bplg[143] = -1101567995;
        ruhack.phobia.b.bplg[144] = 720414317;
        ruhack.phobia.b.bplg[145] = -194322982;
        ruhack.phobia.b.bplg[146] = 1889850252;
        ruhack.phobia.b.bplg[147] = -66803540;
        ruhack.phobia.b.bplg[148] = -1607445728;
        ruhack.phobia.b.bplg[149] = 1104533468;
        ruhack.phobia.b.bplg[150] = 1301476426;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$generate$0(File var0, String var1_1) {
        v0 /* !! */  = ruhack.phobia.b.dr;
        if (true) ** GOTO lbl5
        block12: while (true) {
            v0 /* !! */  = (long)(v1 - ruhack.phobia.b.bpkx("bpqv", bpku(int ), (int)12));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1475282856: {
                    v1 = ruhack.phobia.b.bpkx("bpqw", bpku(int ), (int)13);
                    continue block12;
                }
                case -806104613: {
                    v1 = ruhack.phobia.b.bpkx("bpqx", bpku(int ), (int)14);
                    continue block12;
                }
                case 677076475: {
                    v1 = ruhack.phobia.b.bpkx("bpqy", bpku(int ), (int)15);
                    continue block12;
                }
                case 1030138174: {
                    break block12;
                }
            }
            break;
        }
        var4_2 = ruhack.phobia.b.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ruhack.phobia.b.dr - ruhack.phobia.b.bpkx("bpqz", bpku(int ), (int)16)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ruhack.phobia.b.bpkx("bpra", bplf(int ), (int)138)) break;
            v2 /* !! */  = (long)ruhack.phobia.b.bpkx("bprb", bplf(int ), (int)139);
        }
        var3_3 /* !! */  = ruhack.phobia.b.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ruhack.phobia.b.dr - ruhack.phobia.b.bpkx("bprc", bpku(int ), (int)17)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ruhack.phobia.b.bpkx("bprd", bplf(int ), (int)140)) break;
            v3 /* !! */  = (long)ruhack.phobia.b.bpkx("bpre", bplf(int ), (int)141);
        }
        var2_4 = ruhack.phobia.b.a;
        if (var4_2) {
            throw null;
lbl32:
            // 2 sources

            return (boolean)ruhack.phobia.b.bpkx("bprf", bplf(int ), (int)142);
        }
        if (var2_4) ** GOTO lbl32
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ruhack.phobia.b.dr - ruhack.phobia.b.bpkx("bprg", bpku(int ), (int)18)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ruhack.phobia.b.bpkx("bprh", bplf(int ), (int)143)) break;
                    v4 /* !! */  = (long)ruhack.phobia.b.bpkx("bpri", bplf(int ), (int)144);
                }
                v5 = var1_1.toLowerCase();
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = ruhack.phobia.b.dr - ruhack.phobia.b.bpkx("bprj", bpku(int ), (int)19)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ruhack.phobia.b.bpkx("bprk", bplf(int ), (int)145)) break;
                    v6 /* !! */  = (long)ruhack.phobia.b.bpkx("bprl", bplf(int ), (int)146);
                }
                return v5.endsWith(".ttf");
            }
            case 0: {
                var3_3 /* !! */  = (int)ruhack.phobia.b.bpkx("bprm", bplf(int ), (int)147);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl61
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)ruhack.phobia.b.bpkx("bprn", bplf(int ), (int)148);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl61:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)ruhack.phobia.b.bpkx("bpro", bplf(int ), (int)149);
                if (!var4_2) break;
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)ruhack.phobia.b.bpkx("bprp", bplf(int ), (int)150);
        ** while (!var4_2)
lbl68:
        // 1 sources

        throw null;
    }

    /*
     * Exception decompiling
     */
    private static Path initFile(String var0) {
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

    private static /* synthetic */ void bprs() {
        ruhack.phobia.b.bplh[0] = -438769638;
        ruhack.phobia.b.bplh[1] = 652676683;
        ruhack.phobia.b.bplh[2] = 1760844887;
        ruhack.phobia.b.bplh[3] = -99579585;
        ruhack.phobia.b.bplh[4] = -172925038;
        ruhack.phobia.b.bplh[5] = -339352409;
        ruhack.phobia.b.bplh[6] = -1805973145;
        ruhack.phobia.b.bplh[7] = 1578423850;
        ruhack.phobia.b.bplh[8] = -1424668002;
        ruhack.phobia.b.bplh[9] = 1270072259;
        ruhack.phobia.b.bplh[10] = 2142952903;
        ruhack.phobia.b.bplh[11] = 78893788;
        ruhack.phobia.b.bplh[12] = -1015240185;
        ruhack.phobia.b.bplh[13] = 829316561;
        ruhack.phobia.b.bplh[14] = 508104190;
        ruhack.phobia.b.bplh[15] = 1883078458;
        ruhack.phobia.b.bplh[16] = -2078092315;
        ruhack.phobia.b.bplh[17] = 1002050404;
        ruhack.phobia.b.bplh[18] = -817870057;
        ruhack.phobia.b.bplh[19] = 1609648862;
        ruhack.phobia.b.bplh[20] = 1354514324;
        ruhack.phobia.b.bplh[21] = -478740645;
        ruhack.phobia.b.bplh[22] = 707437334;
        ruhack.phobia.b.bplh[23] = -1335453454;
        ruhack.phobia.b.bplh[24] = 966485922;
        ruhack.phobia.b.bplh[25] = 781420961;
        ruhack.phobia.b.bplh[26] = 1501035985;
        ruhack.phobia.b.bplh[27] = 1218604388;
        ruhack.phobia.b.bplh[28] = 900315277;
        ruhack.phobia.b.bplh[29] = -497583324;
        ruhack.phobia.b.bplh[30] = -336037450;
        ruhack.phobia.b.bplh[31] = -1370994669;
        ruhack.phobia.b.bplh[32] = -1937126539;
        ruhack.phobia.b.bplh[33] = -1075678695;
        ruhack.phobia.b.bplh[34] = -741629488;
        ruhack.phobia.b.bplh[35] = 1202436664;
        ruhack.phobia.b.bplh[36] = -1594261694;
        ruhack.phobia.b.bplh[37] = -254753263;
        ruhack.phobia.b.bplh[38] = 1974626400;
        ruhack.phobia.b.bplh[39] = 1524479984;
        ruhack.phobia.b.bplh[40] = 510281173;
        ruhack.phobia.b.bplh[41] = -1973346543;
        ruhack.phobia.b.bplh[42] = -754263755;
        ruhack.phobia.b.bplh[43] = 1300168183;
        ruhack.phobia.b.bplh[44] = -172715905;
        ruhack.phobia.b.bplh[45] = -331752702;
        ruhack.phobia.b.bplh[46] = 1831083328;
        ruhack.phobia.b.bplh[47] = -1892905035;
        ruhack.phobia.b.bplh[48] = 1244729270;
        ruhack.phobia.b.bplh[49] = 894756171;
        ruhack.phobia.b.bplh[50] = -191454361;
        ruhack.phobia.b.bplh[51] = -232287873;
        ruhack.phobia.b.bplh[52] = 771340805;
        ruhack.phobia.b.bplh[53] = -656481092;
        ruhack.phobia.b.bplh[54] = 901087897;
        ruhack.phobia.b.bplh[55] = -131464426;
        ruhack.phobia.b.bplh[56] = -507523516;
        ruhack.phobia.b.bplh[57] = 843113389;
        ruhack.phobia.b.bplh[58] = 116091170;
        ruhack.phobia.b.bplh[59] = 1215176306;
        ruhack.phobia.b.bplh[60] = 163792137;
        ruhack.phobia.b.bplh[61] = -1856383386;
        ruhack.phobia.b.bplh[62] = -936989377;
        ruhack.phobia.b.bplh[63] = -1475977531;
        ruhack.phobia.b.bplh[64] = 1900766558;
        ruhack.phobia.b.bplh[65] = -127949887;
        ruhack.phobia.b.bplh[66] = -1734520075;
        ruhack.phobia.b.bplh[67] = 855667642;
        ruhack.phobia.b.bplh[68] = -3706701;
        ruhack.phobia.b.bplh[69] = -231369714;
        ruhack.phobia.b.bplh[70] = 862657310;
        ruhack.phobia.b.bplh[71] = -1951554307;
        ruhack.phobia.b.bplh[72] = 431594006;
        ruhack.phobia.b.bplh[73] = -327136714;
        ruhack.phobia.b.bplh[74] = 555282371;
        ruhack.phobia.b.bplh[75] = 1376741887;
        ruhack.phobia.b.bplh[76] = -352469856;
        ruhack.phobia.b.bplh[77] = 714976034;
        ruhack.phobia.b.bplh[78] = -314687055;
        ruhack.phobia.b.bplh[79] = -1878050310;
        ruhack.phobia.b.bplh[80] = -618625742;
        ruhack.phobia.b.bplh[81] = 673797981;
        ruhack.phobia.b.bplh[82] = 2036476742;
        ruhack.phobia.b.bplh[83] = 1007999027;
        ruhack.phobia.b.bplh[84] = 1989346145;
        ruhack.phobia.b.bplh[85] = 1897700087;
        ruhack.phobia.b.bplh[86] = -1840550773;
        ruhack.phobia.b.bplh[87] = 1660854398;
        ruhack.phobia.b.bplh[88] = 1674696110;
        ruhack.phobia.b.bplh[89] = 220395436;
        ruhack.phobia.b.bplh[90] = 676041863;
        ruhack.phobia.b.bplh[91] = -1733060601;
        ruhack.phobia.b.bplh[92] = -111778566;
        ruhack.phobia.b.bplh[93] = 2041228614;
        ruhack.phobia.b.bplh[94] = 386067410;
        ruhack.phobia.b.bplh[95] = -1547745714;
        ruhack.phobia.b.bplh[96] = -610540744;
        ruhack.phobia.b.bplh[97] = 1422582847;
        ruhack.phobia.b.bplh[98] = 987755624;
        ruhack.phobia.b.bplh[99] = -521954701;
    }
}

