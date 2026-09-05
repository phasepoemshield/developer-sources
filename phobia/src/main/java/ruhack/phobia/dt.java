/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.List;
import ruhack.phobia.aw;
import ruhack.phobia.ax;
import ruhack.phobia.c;
import ruhack.phobia.cn;
import ruhack.phobia.ds;

public class dt
implements c {
    private final List<ds> moduleStructures;
    private static long[] ctik;
    public static final boolean a;
    protected static final long gj = 4955841232096162109L;
    public static final boolean c;
    private static int[] cths;
    public static final int b;
    private static long[] ctil;
    private static int[] cthr;

    private static /* synthetic */ long ctij(int n2) {
        return ctik[n2] ^ ctil[n2];
    }

    static {
        cthr = new int[60];
        cths = new int[60];
        dt.ctog();
        dt.ctoh();
        ctik = new long[37];
        ctil = new long[37];
        dt.ctoi();
        dt.ctoj();
    }

    private static /* synthetic */ void ctoi() {
        dt.ctik[0] = 5454120340433562739L;
        dt.ctik[1] = -8093595137364162875L;
        dt.ctik[2] = 7363072833130301479L;
        dt.ctik[3] = 1022201975093172814L;
        dt.ctik[4] = -6523954237855019658L;
        dt.ctik[5] = -702045257179846800L;
        dt.ctik[6] = 7623568071130462818L;
        dt.ctik[7] = 7612518050311423791L;
        dt.ctik[8] = -3095572748852190756L;
        dt.ctik[9] = 8709506999211978033L;
        dt.ctik[10] = 5096832005555923243L;
        dt.ctik[11] = 5046865723894805350L;
        dt.ctik[12] = -4554169482485357873L;
        dt.ctik[13] = 6038260975280046070L;
        dt.ctik[14] = 8017111135684163222L;
        dt.ctik[15] = -1096885762269748419L;
        dt.ctik[16] = 3267828002481442457L;
        dt.ctik[17] = 3092168392792469831L;
        dt.ctik[18] = 9107374565397449021L;
        dt.ctik[19] = 7592799640950767283L;
        dt.ctik[20] = 8669723031277325867L;
        dt.ctik[21] = -2262642167476816697L;
        dt.ctik[22] = 7269328505572620550L;
        dt.ctik[23] = -5404172257338891509L;
        dt.ctik[24] = 2549554863069477824L;
        dt.ctik[25] = -6624966038056233527L;
        dt.ctik[26] = 7116164817125207943L;
        dt.ctik[27] = 8141874234522081460L;
        dt.ctik[28] = 5152854613117849186L;
        dt.ctik[29] = -4486026592005940477L;
        dt.ctik[30] = -5894483206310703688L;
        dt.ctik[31] = -5330131044122934416L;
        dt.ctik[32] = -3750721650468695680L;
        dt.ctik[33] = 6539121523713229389L;
        dt.ctik[34] = 1719978281003069438L;
        dt.ctik[35] = 543704748478960044L;
        dt.ctik[36] = 1421716707392492632L;
    }

    private static /* synthetic */ void ctog() {
        dt.cthr[0] = -1642207554;
        dt.cthr[1] = -1159020734;
        dt.cthr[2] = 1350681688;
        dt.cthr[3] = -675777109;
        dt.cthr[4] = 1692685174;
        dt.cthr[5] = 1210239806;
        dt.cthr[6] = -56816511;
        dt.cthr[7] = 2118005978;
        dt.cthr[8] = 423093016;
        dt.cthr[9] = 291364692;
        dt.cthr[10] = -2044719461;
        dt.cthr[11] = 681235486;
        dt.cthr[12] = 1836070187;
        dt.cthr[13] = -2104680777;
        dt.cthr[14] = 854918969;
        dt.cthr[15] = -701122226;
        dt.cthr[16] = 1506877558;
        dt.cthr[17] = -162401039;
        dt.cthr[18] = -1742499470;
        dt.cthr[19] = -1007410985;
        dt.cthr[20] = 1876698662;
        dt.cthr[21] = -956194918;
        dt.cthr[22] = 1653774721;
        dt.cthr[23] = 544639482;
        dt.cthr[24] = 880528350;
        dt.cthr[25] = 1516984874;
        dt.cthr[26] = 1749236447;
        dt.cthr[27] = 2025643647;
        dt.cthr[28] = 1242852368;
        dt.cthr[29] = 360977355;
        dt.cthr[30] = 1619723877;
        dt.cthr[31] = 1480971086;
        dt.cthr[32] = -1141148349;
        dt.cthr[33] = -752606796;
        dt.cthr[34] = 809868539;
        dt.cthr[35] = -2140402355;
        dt.cthr[36] = 1406831364;
        dt.cthr[37] = 1812918354;
        dt.cthr[38] = -278827065;
        dt.cthr[39] = 32681811;
        dt.cthr[40] = 57434943;
        dt.cthr[41] = 1285994354;
        dt.cthr[42] = -379167771;
        dt.cthr[43] = 1311113068;
        dt.cthr[44] = -656212789;
        dt.cthr[45] = 1969782646;
        dt.cthr[46] = -397252342;
        dt.cthr[47] = 82203083;
        dt.cthr[48] = -299120921;
        dt.cthr[49] = -1353016041;
        dt.cthr[50] = -667865124;
        dt.cthr[51] = -1373798215;
        dt.cthr[52] = 1203352559;
        dt.cthr[53] = -400440130;
        dt.cthr[54] = 1672282219;
        dt.cthr[55] = 816909166;
        dt.cthr[56] = -1777592953;
        dt.cthr[57] = 815304795;
        dt.cthr[58] = 800890063;
        dt.cthr[59] = 207205348;
    }

    public static /* synthetic */ CallSite ctht(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void ctoj() {
        dt.ctil[0] = 3240131874892761729L;
        dt.ctil[1] = -5325777205057425282L;
        dt.ctil[2] = 6238640382866956452L;
        dt.ctil[3] = 3665421707192109535L;
        dt.ctil[4] = -5750684649904302102L;
        dt.ctil[5] = -3034649143372163461L;
        dt.ctil[6] = -7128339340371489547L;
        dt.ctil[7] = 2238990183815250307L;
        dt.ctil[8] = 1177377716914153419L;
        dt.ctil[9] = -8091488037768391786L;
        dt.ctil[10] = -4142418557242838974L;
        dt.ctil[11] = -7012860680983748866L;
        dt.ctil[12] = 8611597883842216219L;
        dt.ctil[13] = -1269152759607138048L;
        dt.ctil[14] = 5169952429228180343L;
        dt.ctil[15] = -2620851650623859595L;
        dt.ctil[16] = 7754308079125196170L;
        dt.ctil[17] = 8554709705462899097L;
        dt.ctil[18] = 1979939316938225806L;
        dt.ctil[19] = -690118954460839431L;
        dt.ctil[20] = 693157349414194161L;
        dt.ctil[21] = 1879418337795838207L;
        dt.ctil[22] = 185315193759735555L;
        dt.ctil[23] = 8184453833292828521L;
        dt.ctil[24] = -577965340339655321L;
        dt.ctil[25] = 1718735503133287063L;
        dt.ctil[26] = 5340541266393207131L;
        dt.ctil[27] = -8137053453395510096L;
        dt.ctil[28] = 7562434153512554820L;
        dt.ctil[29] = -5225354810038278569L;
        dt.ctil[30] = -2744382017311680425L;
        dt.ctil[31] = 5434887136942146113L;
        dt.ctil[32] = -5245499570265679572L;
        dt.ctil[33] = 5578780100278687220L;
        dt.ctil[34] = -3289617026509977305L;
        dt.ctil[35] = 2291683927437427960L;
        dt.ctil[36] = -8638463630412251059L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void handleModuleState(ds var1_1, int var2_2) {
        block16: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = dt.gj - dt.ctht("ctng", ctij(int ), (int)29)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == dt.ctht("ctnh", cthq(int ), (int)42)) break;
                v0 /* !! */  = (long)dt.ctht("ctni", cthq(int ), (int)43);
            }
            var5_3 = dt.c;
            v1 /* !! */  = dt.gj;
            if (true) ** GOTO lbl11
            block10: while (true) {
                v1 /* !! */  = (long)(v2 - dt.ctht("ctnj", ctij(int ), (int)30));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -385359717: {
                        v2 = dt.ctht("ctnk", ctij(int ), (int)31);
                        continue block10;
                    }
                    case -363630275: {
                        break block10;
                    }
                    case 202206466: {
                        v2 = dt.ctht("ctnl", ctij(int ), (int)32);
                        continue block10;
                    }
                }
                break;
            }
            var4_4 = dt.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = dt.gj - dt.ctht("ctnm", ctij(int ), (int)33)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == dt.ctht("ctnn", cthq(int ), (int)44)) break;
                v3 /* !! */  = (long)dt.ctht("ctno", cthq(int ), (int)45);
            }
            var3_5 = dt.a;
            if (var5_3) {
                throw null;
lbl29:
                // 5 sources

                return;
            }
            if (var3_5 || var3_5) ** GOTO lbl29
            v4 /* !! */  = dt.gj;
            if (true) ** GOTO lbl36
            block13: while (true) {
                v4 /* !! */  = (long)(dt.ctht("ctnq", ctij(int ), (int)35) - dt.ctht("ctnp", ctij(int ), (int)34));
lbl36:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -363630275: {
                        break block13;
                    }
                    case 1534283907: {
                        continue block13;
                    }
                }
                break;
            }
            if (var1_1.getType() != dt.ctht("ctnr", cthq(int ), (int)46)) break block16;
            if (var3_5) ** GOTO lbl29
            if (var2_2 != dt.ctht("ctns", cthq(int ), (int)47)) break block16;
            if (var3_5 || var3_5) ** GOTO lbl29
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_2 = dt.gj - dt.ctht("ctnt", ctij(int ), (int)36)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == dt.ctht("ctnu", cthq(int ), (int)48)) break;
                v5 /* !! */  = (long)dt.ctht("ctnv", cthq(int ), (int)49);
            }
            var1_1.switchState();
            if (var3_5) ** GOTO lbl29
        }
        if (!var3_5 && !var3_5) ** break;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    @aw
    public void onKey(cn var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 65[SWITCH]
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

    private static /* synthetic */ void ctoh() {
        dt.cths[0] = -1642207553;
        dt.cths[1] = -1159020735;
        dt.cths[2] = 1350681689;
        dt.cths[3] = -675777111;
        dt.cths[4] = 1692685173;
        dt.cths[5] = 1210239807;
        dt.cths[6] = 1132799883;
        dt.cths[7] = -2118005979;
        dt.cths[8] = -544745694;
        dt.cths[9] = 291364693;
        dt.cths[10] = -220534636;
        dt.cths[11] = -681235487;
        dt.cths[12] = 1389227475;
        dt.cths[13] = -2104680778;
        dt.cths[14] = 599949305;
        dt.cths[15] = -701122225;
        dt.cths[16] = -476297436;
        dt.cths[17] = -162401050;
        dt.cths[18] = -1742499465;
        dt.cths[19] = -1007410990;
        dt.cths[20] = 1876698672;
        dt.cths[21] = -956194919;
        dt.cths[22] = 1653774732;
        dt.cths[23] = 544639483;
        dt.cths[24] = 880528349;
        dt.cths[25] = 1516984879;
        dt.cths[26] = 1749236446;
        dt.cths[27] = 2025643636;
        dt.cths[28] = 1242852360;
        dt.cths[29] = 360977346;
        dt.cths[30] = 1619723873;
        dt.cths[31] = 1480971084;
        dt.cths[32] = -1141148345;
        dt.cths[33] = -752606786;
        dt.cths[34] = 809868542;
        dt.cths[35] = -2140402343;
        dt.cths[36] = 1406831380;
        dt.cths[37] = 1812918363;
        dt.cths[38] = -278827061;
        dt.cths[39] = 32681816;
        dt.cths[40] = 57434924;
        dt.cths[41] = 1285994343;
        dt.cths[42] = 379167770;
        dt.cths[43] = 1134573384;
        dt.cths[44] = -656212790;
        dt.cths[45] = -1639708248;
        dt.cths[46] = -397252341;
        dt.cths[47] = 82203082;
        dt.cths[48] = -299120922;
        dt.cths[49] = 2084300600;
        dt.cths[50] = -667865123;
        dt.cths[51] = -1373798210;
        dt.cths[52] = 1203352551;
        dt.cths[53] = -400440131;
        dt.cths[54] = 1672282223;
        dt.cths[55] = 816909164;
        dt.cths[56] = -1777592959;
        dt.cths[57] = 815304792;
        dt.cths[58] = 800890061;
        dt.cths[59] = 207205351;
    }

    private static /* synthetic */ int cthq(int n2) {
        return cthr[n2] ^ cths[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public dt(List<ds> var1_1, ax var2_2) {
        var4_3 /* !! */  = dt.b;
        super();
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.moduleStructures = var1_1;
                ax.register(this);
                return;
            }
lbl10:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)dt.ctht("cthu", cthq(int ), (int)0);
                    break block0;
                    break;
                }
            }
            case 1: {
                var4_3 /* !! */  = (int)dt.ctht("cthv", cthq(int ), (int)1);
                ** GOTO lbl10
            }
            case 2: {
                var4_3 /* !! */  = (int)dt.ctht("cthw", cthq(int ), (int)2);
                break;
            }
            case 3: {
                while (true) {
                    var4_3 /* !! */  = (int)dt.ctht("cthx", cthq(int ), (int)3);
                }
            }
            case 4: 
        }
        var4_3 /* !! */  = (int)dt.ctht("cthy", cthq(int ), (int)4);
        ** while (true)
    }
}

