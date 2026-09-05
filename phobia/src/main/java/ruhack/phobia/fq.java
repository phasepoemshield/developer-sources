/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  net.minecraft.class_310
 *  net.minecraft.class_315
 *  net.minecraft.class_4063
 *  net.minecraft.class_4066
 *  net.minecraft.class_5365
 *  net.minecraft.class_6597
 *  net.minecraft.class_9927
 */
package ruhack.phobia;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import net.minecraft.class_310;
import net.minecraft.class_315;
import net.minecraft.class_4063;
import net.minecraft.class_4066;
import net.minecraft.class_5365;
import net.minecraft.class_6597;
import net.minecraft.class_9927;
import ruhack.phobia.ai;
import ruhack.phobia.fq$Snapshot;

public final class fq {
    private static long[] hbnt;
    public static final int b;
    protected static final long nz = -4892077092592358809L;
    private static final int MAX_RENDER_DISTANCE = 8;
    private static final Gson GSON;
    private static int[] hbnl;
    private static int[] hbnm;
    public static final boolean a;
    private static final int UNLIMITED_FRAMERATE = 260;
    public static final boolean c;
    private static long[] hbns;
    private static final Path BACKUP_FILE;
    private static final int MAX_SIMULATION_DISTANCE = 6;

    private static /* synthetic */ double hbuw(int n2) {
        return Double.longBitsToDouble(hbns[n2] ^ hbnt[n2]);
    }

    /*
     * Exception decompiling
     */
    private static void disable(class_315 var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 71[SWITCH]
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

    private static /* synthetic */ void hccx() {
        fq.hbnm[200] = 1901737262;
        fq.hbnm[201] = 1912312458;
        fq.hbnm[202] = 570740289;
        fq.hbnm[203] = -2117809678;
        fq.hbnm[204] = -195258232;
        fq.hbnm[205] = -63369951;
        fq.hbnm[206] = 1710606357;
        fq.hbnm[207] = -180228497;
        fq.hbnm[208] = -1816893330;
        fq.hbnm[209] = 430380277;
        fq.hbnm[210] = -1286612578;
        fq.hbnm[211] = 21077922;
        fq.hbnm[212] = -1056972413;
        fq.hbnm[213] = 614128290;
        fq.hbnm[214] = -984608314;
        fq.hbnm[215] = 1781021907;
        fq.hbnm[216] = 1398141850;
        fq.hbnm[217] = -1322519800;
        fq.hbnm[218] = 1766194519;
        fq.hbnm[219] = -1327203129;
        fq.hbnm[220] = -1771093663;
        fq.hbnm[221] = -1989070402;
        fq.hbnm[222] = -1306463303;
        fq.hbnm[223] = -30314629;
        fq.hbnm[224] = -1098155900;
        fq.hbnm[225] = -620757630;
        fq.hbnm[226] = -447957177;
        fq.hbnm[227] = -377578824;
        fq.hbnm[228] = -1810104944;
        fq.hbnm[229] = -23715082;
        fq.hbnm[230] = 1865211978;
        fq.hbnm[231] = 0x3FF3AA3F;
        fq.hbnm[232] = 792168527;
        fq.hbnm[233] = 1494577868;
        fq.hbnm[234] = 1040749952;
        fq.hbnm[235] = -2097577757;
    }

    /*
     * Exception decompiling
     */
    private static fq$Snapshot readSnapshot() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 15[SWITCH]
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

    public static /* synthetic */ CallSite hbnn(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private fq() {
        var2_1 /* !! */  = fq.b;
        super();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
            case 0: {
                while (true) {
                    var2_1 /* !! */  = (int)fq.hbnn("hbno", hbnk(int ), (int)0);
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)fq.hbnn("hbnp", hbnk(int ), (int)1);
                    break;
                }
            }
            case 2: 
        }
        var2_1 /* !! */  = (int)fq.hbnn("hbnq", hbnk(int ), (int)2);
        ** while (true)
    }

    private static /* synthetic */ void hccz() {
        fq.hbns[100] = 3954304652060997689L;
        fq.hbns[101] = -2508985279033529144L;
        fq.hbns[102] = 8077704750218005678L;
        fq.hbns[103] = 7666355291578002038L;
        fq.hbns[104] = -447238071661279077L;
        fq.hbns[105] = -7269693491104850739L;
        fq.hbns[106] = 7438377944943319600L;
        fq.hbns[107] = 9020557137719887194L;
        fq.hbns[108] = -8138251324707766580L;
        fq.hbns[109] = 2442249905046982480L;
        fq.hbns[110] = 6593901137538205343L;
        fq.hbns[111] = 7289233882808056249L;
        fq.hbns[112] = 3619781578395252619L;
        fq.hbns[113] = 8909710084524396208L;
        fq.hbns[114] = -153971171751675178L;
        fq.hbns[115] = 4897806526969613168L;
        fq.hbns[116] = 263033386465012818L;
        fq.hbns[117] = -104520835559434041L;
        fq.hbns[118] = 2143865139374909149L;
        fq.hbns[119] = -1642925344271889507L;
        fq.hbns[120] = -3015015496489636597L;
        fq.hbns[121] = 8921925095732621017L;
        fq.hbns[122] = -5473968276663538141L;
        fq.hbns[123] = 1447712105879547114L;
        fq.hbns[124] = -4997413851276377771L;
        fq.hbns[125] = -5959098213464795660L;
        fq.hbns[126] = -6127650146583219216L;
        fq.hbns[127] = -2358910456432849780L;
        fq.hbns[128] = 427468548017402812L;
        fq.hbns[129] = -5995927000977419335L;
        fq.hbns[130] = -7817536838393315078L;
        fq.hbns[131] = -118533399946388911L;
        fq.hbns[132] = -5784596396491315124L;
        fq.hbns[133] = -6496126124528166585L;
        fq.hbns[134] = -2478912415422521028L;
        fq.hbns[135] = -6906079552456310111L;
        fq.hbns[136] = 4696478046212805027L;
        fq.hbns[137] = 5551835212106966824L;
        fq.hbns[138] = -4159256038247330782L;
        fq.hbns[139] = -8945976076841759619L;
        fq.hbns[140] = 2565739610236254833L;
        fq.hbns[141] = 4954326633112735774L;
        fq.hbns[142] = 5897470249645275849L;
        fq.hbns[143] = 5249120845133779080L;
        fq.hbns[144] = 7484091232407844523L;
        fq.hbns[145] = 5851690895632076578L;
        fq.hbns[146] = 4640997410109511142L;
        fq.hbns[147] = 7716527473770882882L;
        fq.hbns[148] = -6932820700785298650L;
        fq.hbns[149] = -6198449484440045597L;
        fq.hbns[150] = -4342374766960582369L;
        fq.hbns[151] = -6936168594657838238L;
        fq.hbns[152] = -5014483824503562987L;
        fq.hbns[153] = -2986202786088089678L;
    }

    private static /* synthetic */ void hccv() {
        fq.hbnm[0] = -1677219703;
        fq.hbnm[1] = 910860573;
        fq.hbnm[2] = -1103720059;
        fq.hbnm[3] = 1500945303;
        fq.hbnm[4] = 610678214;
        fq.hbnm[5] = -447311002;
        fq.hbnm[6] = 436912630;
        fq.hbnm[7] = -283244305;
        fq.hbnm[8] = 1097688128;
        fq.hbnm[9] = 1389914208;
        fq.hbnm[10] = -1181678865;
        fq.hbnm[11] = -1760269068;
        fq.hbnm[12] = 462369244;
        fq.hbnm[13] = -876482382;
        fq.hbnm[14] = -1023796491;
        fq.hbnm[15] = 947084496;
        fq.hbnm[16] = -155905077;
        fq.hbnm[17] = 250568826;
        fq.hbnm[18] = -2002754916;
        fq.hbnm[19] = -1917759207;
        fq.hbnm[20] = -1180492010;
        fq.hbnm[21] = -1476762509;
        fq.hbnm[22] = 165170957;
        fq.hbnm[23] = 259273021;
        fq.hbnm[24] = -1668643135;
        fq.hbnm[25] = -1240945219;
        fq.hbnm[26] = 979860710;
        fq.hbnm[27] = 108551595;
        fq.hbnm[28] = -2071190822;
        fq.hbnm[29] = -743859334;
        fq.hbnm[30] = 149457829;
        fq.hbnm[31] = 81180327;
        fq.hbnm[32] = -1273245511;
        fq.hbnm[33] = 810766277;
        fq.hbnm[34] = 483309831;
        fq.hbnm[35] = -2086972491;
        fq.hbnm[36] = -1427405175;
        fq.hbnm[37] = -2008192904;
        fq.hbnm[38] = -1528615740;
        fq.hbnm[39] = -1625670848;
        fq.hbnm[40] = -120558309;
        fq.hbnm[41] = -1528509695;
        fq.hbnm[42] = -35665658;
        fq.hbnm[43] = 1019400183;
        fq.hbnm[44] = 1423574036;
        fq.hbnm[45] = -1383096969;
        fq.hbnm[46] = 806889687;
        fq.hbnm[47] = -1791079462;
        fq.hbnm[48] = -177023181;
        fq.hbnm[49] = 2110784671;
        fq.hbnm[50] = 571395254;
        fq.hbnm[51] = -1909812269;
        fq.hbnm[52] = 12010635;
        fq.hbnm[53] = -618418027;
        fq.hbnm[54] = 240358549;
        fq.hbnm[55] = -488215447;
        fq.hbnm[56] = 2068498756;
        fq.hbnm[57] = -1891154013;
        fq.hbnm[58] = -1460614858;
        fq.hbnm[59] = -1965498413;
        fq.hbnm[60] = 1217025945;
        fq.hbnm[61] = -1344034569;
        fq.hbnm[62] = 1061530210;
        fq.hbnm[63] = -2117549196;
        fq.hbnm[64] = -237752051;
        fq.hbnm[65] = 1913960745;
        fq.hbnm[66] = 1790439847;
        fq.hbnm[67] = -472878183;
        fq.hbnm[68] = 2007978823;
        fq.hbnm[69] = -646079332;
        fq.hbnm[70] = 612365230;
        fq.hbnm[71] = 300401801;
        fq.hbnm[72] = -669181489;
        fq.hbnm[73] = -774894514;
        fq.hbnm[74] = -2094832492;
        fq.hbnm[75] = -250244091;
        fq.hbnm[76] = 1914057314;
        fq.hbnm[77] = 886371775;
        fq.hbnm[78] = -529017260;
        fq.hbnm[79] = -1008281540;
        fq.hbnm[80] = -1439742113;
        fq.hbnm[81] = 248394244;
        fq.hbnm[82] = 1692386791;
        fq.hbnm[83] = 1808608953;
        fq.hbnm[84] = 312644279;
        fq.hbnm[85] = -1267389995;
        fq.hbnm[86] = -1235968920;
        fq.hbnm[87] = 214703498;
        fq.hbnm[88] = 328510241;
        fq.hbnm[89] = 2116539271;
        fq.hbnm[90] = 880072924;
        fq.hbnm[91] = 990416555;
        fq.hbnm[92] = 1796437132;
        fq.hbnm[93] = 727027686;
        fq.hbnm[94] = 447469789;
        fq.hbnm[95] = 1932301792;
        fq.hbnm[96] = 1253954405;
        fq.hbnm[97] = 1755682337;
        fq.hbnm[98] = 1081804668;
        fq.hbnm[99] = -1411301435;
    }

    private static /* synthetic */ void hccs() {
        fq.hbnl[0] = -1677219703;
        fq.hbnl[1] = 910860573;
        fq.hbnl[2] = -1103720059;
        fq.hbnl[3] = 1500945302;
        fq.hbnl[4] = 782857017;
        fq.hbnl[5] = 447311001;
        fq.hbnl[6] = 1942585875;
        fq.hbnl[7] = 283244304;
        fq.hbnl[8] = 478548296;
        fq.hbnl[9] = -1389914209;
        fq.hbnl[10] = 950093013;
        fq.hbnl[11] = 1760269067;
        fq.hbnl[12] = -1830076844;
        fq.hbnl[13] = -876482380;
        fq.hbnl[14] = -1023796484;
        fq.hbnl[15] = 947084508;
        fq.hbnl[16] = -155905062;
        fq.hbnl[17] = 250568811;
        fq.hbnl[18] = -2002754922;
        fq.hbnl[19] = -1917759203;
        fq.hbnl[20] = -1180492002;
        fq.hbnl[21] = -1476762507;
        fq.hbnl[22] = 165170972;
        fq.hbnl[23] = 259273007;
        fq.hbnl[24] = -1668643127;
        fq.hbnl[25] = -1240945234;
        fq.hbnl[26] = 979860724;
        fq.hbnl[27] = 108551610;
        fq.hbnl[28] = -2071190840;
        fq.hbnl[29] = -743859342;
        fq.hbnl[30] = 149457846;
        fq.hbnl[31] = 81180328;
        fq.hbnl[32] = -1273245518;
        fq.hbnl[33] = 810766280;
        fq.hbnl[34] = 483309830;
        fq.hbnl[35] = -1366078778;
        fq.hbnl[36] = 1427405174;
        fq.hbnl[37] = -229110578;
        fq.hbnl[38] = 1528615739;
        fq.hbnl[39] = 570251771;
        fq.hbnl[40] = 120558308;
        fq.hbnl[41] = 1789093825;
        fq.hbnl[42] = -35665657;
        fq.hbnl[43] = 361774950;
        fq.hbnl[44] = -1423574037;
        fq.hbnl[45] = -286133738;
        fq.hbnl[46] = 806889685;
        fq.hbnl[47] = -1791079471;
        fq.hbnl[48] = -177023182;
        fq.hbnl[49] = 2110784659;
        fq.hbnl[50] = 571395262;
        fq.hbnl[51] = -1909812263;
        fq.hbnl[52] = 12010626;
        fq.hbnl[53] = -618418030;
        fq.hbnl[54] = 240358556;
        fq.hbnl[55] = -488215448;
        fq.hbnl[56] = 2068498754;
        fq.hbnl[57] = -1891154002;
        fq.hbnl[58] = -1460614861;
        fq.hbnl[59] = -1965498408;
        fq.hbnl[60] = 1217025944;
        fq.hbnl[61] = -1344034564;
        fq.hbnl[62] = 1061530221;
        fq.hbnl[63] = -2117549192;
        fq.hbnl[64] = -237752052;
        fq.hbnl[65] = -1056441720;
        fq.hbnl[66] = -1790439848;
        fq.hbnl[67] = 287509808;
        fq.hbnl[68] = 2007978822;
        fq.hbnl[69] = 637976214;
        fq.hbnl[70] = -612365231;
        fq.hbnl[71] = 313634935;
        fq.hbnl[72] = -669181490;
        fq.hbnl[73] = 723631260;
        fq.hbnl[74] = 2094832491;
        fq.hbnl[75] = 1523071953;
        fq.hbnl[76] = 1914057313;
        fq.hbnl[77] = 886371758;
        fq.hbnl[78] = -529017268;
        fq.hbnl[79] = -1008281559;
        fq.hbnl[80] = -1439742115;
        fq.hbnl[81] = 248394248;
        fq.hbnl[82] = 1692386803;
        fq.hbnl[83] = 1808608936;
        fq.hbnl[84] = 312644270;
        fq.hbnl[85] = -1267390011;
        fq.hbnl[86] = -1235968924;
        fq.hbnl[87] = 214703494;
        fq.hbnl[88] = 328510268;
        fq.hbnl[89] = 2116539283;
        fq.hbnl[90] = 880072921;
        fq.hbnl[91] = 990416562;
        fq.hbnl[92] = 1796437131;
        fq.hbnl[93] = 727027700;
        fq.hbnl[94] = 447469788;
        fq.hbnl[95] = 1932301811;
        fq.hbnl[96] = 1253954420;
        fq.hbnl[97] = 1755682342;
        fq.hbnl[98] = 1081804649;
        fq.hbnl[99] = -1411301430;
    }

    /*
     * Exception decompiling
     */
    private static boolean writeSnapshot(fq$Snapshot var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 54[SWITCH]
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

    private static /* synthetic */ void hccu() {
        fq.hbnl[200] = 1901737260;
        fq.hbnl[201] = 1912312452;
        fq.hbnl[202] = 570740289;
        fq.hbnl[203] = -2117809673;
        fq.hbnl[204] = -195258229;
        fq.hbnl[205] = -63369952;
        fq.hbnl[206] = 1710606341;
        fq.hbnl[207] = -180228512;
        fq.hbnl[208] = -1816893318;
        fq.hbnl[209] = 430380287;
        fq.hbnl[210] = -1286612582;
        fq.hbnl[211] = 21077922;
        fq.hbnl[212] = -1056972400;
        fq.hbnl[213] = 614128300;
        fq.hbnl[214] = -984608313;
        fq.hbnl[215] = -352669293;
        fq.hbnl[216] = -1398141851;
        fq.hbnl[217] = -1916357880;
        fq.hbnl[218] = 1766194518;
        fq.hbnl[219] = -2043015212;
        fq.hbnl[220] = 1771093662;
        fq.hbnl[221] = 1250482345;
        fq.hbnl[222] = 1306463302;
        fq.hbnl[223] = 1234596972;
        fq.hbnl[224] = 1098155899;
        fq.hbnl[225] = -1667803394;
        fq.hbnl[226] = -447957182;
        fq.hbnl[227] = -377578822;
        fq.hbnl[228] = -1810104941;
        fq.hbnl[229] = -23715084;
        fq.hbnl[230] = 1865211980;
        fq.hbnl[231] = 1072933437;
        fq.hbnl[232] = 792168521;
        fq.hbnl[233] = 1494577871;
        fq.hbnl[234] = 1040749956;
        fq.hbnl[235] = -2097577756;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static synchronized void setEnabled(boolean var0) {
        block76: {
            block75: {
                block74: {
                    while (true) {
                        if ((v0 /* !! */  = (cfr_temp_0 = fq.nz - fq.hbnn("hbnu", hbnr(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                        if (v0 /* !! */  == fq.hbnn("hbnv", hbnk(int ), (int)3)) break;
                        v0 /* !! */  = (long)fq.hbnn("hbnw", hbnk(int ), (int)4);
                    }
                    var4_1 = fq.c;
                    while (true) {
                        if ((v1 /* !! */  = (cfr_temp_1 = fq.nz - fq.hbnn("hbnx", hbnr(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v1 /* !! */  == fq.hbnn("hbny", hbnk(int ), (int)5)) break;
                        v1 /* !! */  = (long)fq.hbnn("hbnz", hbnk(int ), (int)6);
                    }
                    var3_2 /* !! */  = fq.b;
                    while (true) {
                        if ((v2 /* !! */  = (cfr_temp_2 = fq.nz - fq.hbnn("hboa", hbnr(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v2 /* !! */  == fq.hbnn("hbob", hbnk(int ), (int)7)) break;
                        v2 /* !! */  = (long)fq.hbnn("hboc", hbnk(int ), (int)8);
                    }
                    var2_3 = fq.a;
                    if (var4_1) {
                        throw null;
lbl21:
                        // 11 sources

                        return;
                    }
                    if (var2_3 || var2_3) ** GOTO lbl21
                    v3 /* !! */  = fq.nz;
                    if (true) ** GOTO lbl28
                    block46: while (true) {
                        v3 /* !! */  = (long)(v4 - fq.hbnn("hbod", hbnr(int ), (int)3));
lbl28:
                        // 2 sources

                        switch ((int)v3 /* !! */ ) {
                            case -1702727340: {
                                v4 = fq.hbnn("hboe", hbnr(int ), (int)4);
                                continue block46;
                            }
                            case -1170937241: {
                                break block46;
                            }
                            case -294868017: {
                                v4 = fq.hbnn("hbof", hbnr(int ), (int)5);
                                continue block46;
                            }
                            case 1442769120: {
                                v4 = fq.hbnn("hbog", hbnr(int ), (int)6);
                                continue block46;
                            }
                        }
                        break;
                    }
                    var1_4 = class_310.method_1551();
                    if (var2_3 || var2_3) ** GOTO lbl21
                    if (var1_4 == null) break block74;
                    if (var2_3) ** GOTO lbl21
                    v5 /* !! */  = fq.nz;
                    if (true) ** GOTO lbl48
                    block47: while (true) {
                        v5 /* !! */  = (long)(v6 - fq.hbnn("hboh", hbnr(int ), (int)7));
lbl48:
                        // 2 sources

                        switch ((int)v5 /* !! */ ) {
                            case -1720532895: {
                                v6 = fq.hbnn("hboi", hbnr(int ), (int)8);
                                continue block47;
                            }
                            case -1373146571: {
                                v6 = fq.hbnn("hboj", hbnr(int ), (int)9);
                                continue block47;
                            }
                            case -1170937241: {
                                break block47;
                            }
                        }
                        break;
                    }
                    if (var1_4.field_1690 != null) break block75;
                    if (var2_3) ** GOTO lbl21
                }
                if (var2_3 || var2_3) ** GOTO lbl21
                return;
            }
            if (var2_3 || var2_3) ** GOTO lbl21
            if (!var0) break block76;
            if (var2_3 || var2_3) ** GOTO lbl21
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_3 = fq.nz - fq.hbnn("hbok", hbnr(int ), (int)10)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v7 /* !! */  == fq.hbnn("hbol", hbnk(int ), (int)9)) break;
                v7 /* !! */  = (long)fq.hbnn("hbom", hbnk(int ), (int)10);
            }
            v8 = var1_4.field_1690;
            v9 /* !! */  = fq.nz;
            if (true) ** GOTO lbl76
            block49: while (true) {
                v9 /* !! */  = (long)(fq.hbnn("hboo", hbnr(int ), (int)12) - fq.hbnn("hbon", hbnr(int ), (int)11));
lbl76:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -1170937241: {
                        break block49;
                    }
                    case 319760769: {
                        continue block49;
                    }
                }
                break;
            }
            fq.enable(v8);
            if (var2_3) ** GOTO lbl21
            if (var4_1) {
                throw null;
            }
            ** GOTO lbl108
        }
        if (var2_3 || var2_3) ** GOTO lbl21
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v10 /* !! */  = fq.nz;
                if (true) ** GOTO lbl95
                block50: while (true) {
                    v10 /* !! */  = (long)(fq.hbnn("hboq", hbnr(int ), (int)14) - fq.hbnn("hbop", hbnr(int ), (int)13));
lbl95:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1170937241: {
                            break block50;
                        }
                        case 1725448010: {
                            continue block50;
                        }
                    }
                    break;
                }
                v11 = var1_4.field_1690;
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_4 = fq.nz - fq.hbnn("hbor", hbnr(int ), (int)15)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == fq.hbnn("hbos", hbnk(int ), (int)11)) break;
                    v12 /* !! */  = (long)fq.hbnn("hbot", hbnk(int ), (int)12);
                }
                fq.disable(v11);
                if (var2_3) ** GOTO lbl21
lbl108:
                // 2 sources

                if (!var2_3 && !var2_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_2 /* !! */  = (int)fq.hbnn("hbou", hbnk(int ), (int)13);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl136
            }
            case 1: {
                do {
                    var3_2 /* !! */  = (int)fq.hbnn("hbov", hbnk(int ), (int)14);
                } while (!var4_1);
                throw null;
            }
            case 2: {
                var3_2 /* !! */  = (int)fq.hbnn("hbow", hbnk(int ), (int)15);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl149
            }
            case 3: {
                var3_2 /* !! */  = (int)fq.hbnn("hbox", hbnk(int ), (int)16);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl131:
            // 2 sources

            case 4: {
                var3_2 /* !! */  = (int)fq.hbnn("hboy", hbnk(int ), (int)17);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl145
            }
lbl136:
            // 4 sources

            case 5: {
                var3_2 /* !! */  = (int)fq.hbnn("hboz", hbnk(int ), (int)18);
                if (!var4_1) ** GOTO lbl131
                throw null;
            }
lbl140:
            // 2 sources

            case 6: {
                var3_2 /* !! */  = (int)fq.hbnn("hbpa", hbnk(int ), (int)19);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl179
            }
lbl145:
            // 2 sources

            case 7: {
                var3_2 /* !! */  = (int)fq.hbnn("hbpb", hbnk(int ), (int)20);
                if (!var4_1) ** GOTO lbl140
                throw null;
            }
lbl149:
            // 3 sources

            case 8: {
                var3_2 /* !! */  = (int)fq.hbnn("hbpc", hbnk(int ), (int)21);
                if (!var4_1) ** GOTO lbl136
                throw null;
            }
lbl153:
            // 2 sources

            case 9: {
                var3_2 /* !! */  = (int)fq.hbnn("hbpd", hbnk(int ), (int)22);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl162
            }
lbl158:
            // 2 sources

            case 10: {
                var3_2 /* !! */  = (int)fq.hbnn("hbpe", hbnk(int ), (int)23);
                if (!var4_1) ** GOTO lbl149
                throw null;
            }
lbl162:
            // 2 sources

            case 11: {
                var3_2 /* !! */  = (int)fq.hbnn("hbpf", hbnk(int ), (int)24);
                if (var4_1) {
                    throw null;
                }
            }
lbl166:
            // 4 sources

            case 12: {
                var3_2 /* !! */  = (int)fq.hbnn("hbpg", hbnk(int ), (int)25);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl175
            }
            case 13: {
                var3_2 /* !! */  = (int)fq.hbnn("hbph", hbnk(int ), (int)26);
                if (var4_1) {
                    throw null;
                }
            }
lbl175:
            // 4 sources

            case 14: {
                var3_2 /* !! */  = (int)fq.hbnn("hbpi", hbnk(int ), (int)27);
                if (!var4_1) ** GOTO lbl158
                throw null;
            }
lbl179:
            // 3 sources

            case 15: {
                var3_2 /* !! */  = (int)fq.hbnn("hbpj", hbnk(int ), (int)28);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl198
            }
            case 16: {
                var3_2 /* !! */  = (int)fq.hbnn("hbpk", hbnk(int ), (int)29);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl198
            }
            case 17: {
                var3_2 /* !! */  = (int)fq.hbnn("hbpl", hbnk(int ), (int)30);
                if (!var4_1) ** GOTO lbl153
                throw null;
            }
            case 18: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)fq.hbnn("hbpm", hbnk(int ), (int)31);
                    if (!var4_1) ** GOTO lbl136
                    throw null;
                }
            }
lbl198:
            // 3 sources

            case 19: {
                var3_2 /* !! */  = (int)fq.hbnn("hbpn", hbnk(int ), (int)32);
                if (!var4_1) ** GOTO lbl179
                throw null;
            }
            case 20: 
        }
        var3_2 /* !! */  = (int)fq.hbnn("hbpo", hbnk(int ), (int)33);
        ** while (!var4_1)
lbl205:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hccw() {
        fq.hbnm[100] = -149106663;
        fq.hbnm[101] = -192697595;
        fq.hbnm[102] = 300717667;
        fq.hbnm[103] = 372096546;
        fq.hbnm[104] = -412291367;
        fq.hbnm[105] = -312174738;
        fq.hbnm[106] = 806757690;
        fq.hbnm[107] = -542341756;
        fq.hbnm[108] = -885080164;
        fq.hbnm[109] = -1271459335;
        fq.hbnm[110] = -686556340;
        fq.hbnm[111] = -1350815736;
        fq.hbnm[112] = 474081898;
        fq.hbnm[113] = -1282600962;
        fq.hbnm[114] = 38516585;
        fq.hbnm[115] = 1146401213;
        fq.hbnm[116] = -883975667;
        fq.hbnm[117] = -1514477411;
        fq.hbnm[118] = -2022541877;
        fq.hbnm[119] = 1119305174;
        fq.hbnm[120] = -1985360447;
        fq.hbnm[121] = -1148782132;
        fq.hbnm[122] = 1942546571;
        fq.hbnm[123] = -735584258;
        fq.hbnm[124] = 1281970625;
        fq.hbnm[125] = 975494849;
        fq.hbnm[126] = -1949427723;
        fq.hbnm[127] = 2048073455;
        fq.hbnm[128] = -943691042;
        fq.hbnm[129] = -301553740;
        fq.hbnm[130] = -1848250106;
        fq.hbnm[131] = 507198880;
        fq.hbnm[132] = 1268694693;
        fq.hbnm[133] = 123398567;
        fq.hbnm[134] = -914336863;
        fq.hbnm[135] = 232586166;
        fq.hbnm[136] = -1171292991;
        fq.hbnm[137] = 1193555456;
        fq.hbnm[138] = -728370030;
        fq.hbnm[139] = 1249601850;
        fq.hbnm[140] = 1355168413;
        fq.hbnm[141] = 211285847;
        fq.hbnm[142] = 172153808;
        fq.hbnm[143] = -1712799349;
        fq.hbnm[144] = -515152563;
        fq.hbnm[145] = -322058351;
        fq.hbnm[146] = 1183056642;
        fq.hbnm[147] = -301104747;
        fq.hbnm[148] = 1877175726;
        fq.hbnm[149] = -305818835;
        fq.hbnm[150] = -118368188;
        fq.hbnm[151] = 659434818;
        fq.hbnm[152] = 110760651;
        fq.hbnm[153] = -681828899;
        fq.hbnm[154] = -597055190;
        fq.hbnm[155] = -1652328400;
        fq.hbnm[156] = -1718784382;
        fq.hbnm[157] = -433406888;
        fq.hbnm[158] = 1219770884;
        fq.hbnm[159] = -92289627;
        fq.hbnm[160] = -1884641177;
        fq.hbnm[161] = 784881518;
        fq.hbnm[162] = 208145763;
        fq.hbnm[163] = -1319619649;
        fq.hbnm[164] = -1767250559;
        fq.hbnm[165] = 111089129;
        fq.hbnm[166] = -1895487843;
        fq.hbnm[167] = 284399979;
        fq.hbnm[168] = -1671586708;
        fq.hbnm[169] = 1879345680;
        fq.hbnm[170] = -216864916;
        fq.hbnm[171] = 1400158594;
        fq.hbnm[172] = 281505725;
        fq.hbnm[173] = -161771677;
        fq.hbnm[174] = 1111044107;
        fq.hbnm[175] = -295023029;
        fq.hbnm[176] = -415288634;
        fq.hbnm[177] = 1751266221;
        fq.hbnm[178] = 1392000008;
        fq.hbnm[179] = 1432617679;
        fq.hbnm[180] = 1716358146;
        fq.hbnm[181] = -1699907430;
        fq.hbnm[182] = -1325386796;
        fq.hbnm[183] = 1857875826;
        fq.hbnm[184] = -26078765;
        fq.hbnm[185] = -200847567;
        fq.hbnm[186] = 1661858560;
        fq.hbnm[187] = -190563076;
        fq.hbnm[188] = 1418888616;
        fq.hbnm[189] = 2090047101;
        fq.hbnm[190] = -103795783;
        fq.hbnm[191] = -78026223;
        fq.hbnm[192] = 87733484;
        fq.hbnm[193] = -383299802;
        fq.hbnm[194] = -928682149;
        fq.hbnm[195] = -1237193677;
        fq.hbnm[196] = 191956906;
        fq.hbnm[197] = 2062760877;
        fq.hbnm[198] = 708170987;
        fq.hbnm[199] = 1983462323;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void applyPreset(class_315 var0) {
        var3_1 = fq.c;
        var2_2 /* !! */  = fq.b;
        var1_3 = fq.a;
        if (var3_1) {
            throw null;
lbl6:
            // 23 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl6
        var0.method_75329().method_41748((Object)class_5365.field_25427);
        if (var1_3 || var1_3) ** GOTO lbl6
        var0.method_42528().method_41748((Object)class_4063.field_18162);
        if (var1_3 || var1_3) ** GOTO lbl6
        var0.method_42475().method_41748((Object)class_4066.field_18199);
        if (var1_3 || var1_3) ** GOTO lbl6
        var0.method_41798().method_41748((Object)class_6597.field_34788);
        if (var1_3) ** GOTO lbl6
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl6
                var0.method_61970().method_41748((Object)class_9927.field_52744);
                if (var1_3 || var1_3) ** GOTO lbl6
                var0.method_42435().method_41748((Object)((boolean)fq.hbnn("hbun", hbnk(int ), (int)106)));
                if (var1_3 || var1_3) ** GOTO lbl6
                var0.method_41792().method_41748((Object)((boolean)fq.hbnn("hbuo", hbnk(int ), (int)107)));
                if (var1_3 || var1_3) ** GOTO lbl6
                var0.method_75335().method_41748((Object)((boolean)fq.hbnn("hbup", hbnk(int ), (int)108)));
                if (var1_3 || var1_3) ** GOTO lbl6
                var0.method_75337().method_41748((Object)((boolean)fq.hbnn("hbuq", hbnk(int ), (int)109)));
                if (var1_3 || var1_3) ** GOTO lbl6
                var0.method_75334().method_41748((Object)((boolean)fq.hbnn("hbur", hbnk(int ), (int)110)));
                if (var1_3 || var1_3) ** GOTO lbl6
                var0.method_42448().method_41748((Object)((boolean)fq.hbnn("hbus", hbnk(int ), (int)111)));
                if (var1_3 || var1_3) ** GOTO lbl6
                var0.method_42433().method_41748((Object)((boolean)fq.hbnn("hbut", hbnk(int ), (int)112)));
                if (var1_3 || var1_3) ** GOTO lbl6
                var0.method_42524().method_41748((Object)((int)fq.hbnn("hbuu", hbnk(int ), (int)113)));
                if (var1_3 || var1_3) ** GOTO lbl6
                var0.method_41805().method_41748((Object)((int)fq.hbnn("hbuv", hbnk(int ), (int)114)));
                if (var1_3 || var1_3) ** GOTO lbl6
                var0.method_42517().method_41748((Object)((double)fq.hbnn("hbux", hbuw(int ), (int)72)));
                if (var1_3 || var1_3) ** GOTO lbl6
                var0.method_76253().method_41748((Object)0.0);
                if (var1_3 || var1_3) ** GOTO lbl6
                var0.method_57702().method_41748((Object)((int)fq.hbnn("hbuy", hbnk(int ), (int)115)));
                if (var1_3 || var1_3) ** GOTO lbl6
                var0.method_48580().method_41748((Object)0.0);
                if (var1_3 || var1_3) ** GOTO lbl6
                var0.method_48581().method_41748((Object)0.0);
                if (var1_3 || var1_3) ** GOTO lbl6
                var0.method_42503().method_41748((Object)Math.min((Integer)var0.method_42503().method_41753(), (int)fq.hbnn("hbuz", hbnk(int ), (int)116)));
                if (var1_3 || var1_3) ** GOTO lbl6
                var0.method_42510().method_41748((Object)Math.min((Integer)var0.method_42510().method_41753(), (int)fq.hbnn("hbva", hbnk(int ), (int)117)));
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl57:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)fq.hbnn("hbvb", hbnk(int ), (int)118);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl224
            }
            case 1: {
                var2_2 /* !! */  = (int)fq.hbnn("hbvc", hbnk(int ), (int)119);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl67:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)fq.hbnn("hbvd", hbnk(int ), (int)120);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl228
            }
lbl72:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)fq.hbnn("hbve", hbnk(int ), (int)121);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl145
            }
lbl77:
            // 3 sources

            case 4: {
                var2_2 /* !! */  = (int)fq.hbnn("hbvf", hbnk(int ), (int)122);
                if (!var3_1) ** GOTO lbl57
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)fq.hbnn("hbvg", hbnk(int ), (int)123);
                if (!var3_1) ** GOTO lbl77
                throw null;
            }
lbl85:
            // 3 sources

            case 6: {
                var2_2 /* !! */  = (int)fq.hbnn("hbvh", hbnk(int ), (int)124);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl212
            }
            case 7: {
                var2_2 /* !! */  = (int)fq.hbnn("hbvi", hbnk(int ), (int)125);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl232
            }
lbl95:
            // 4 sources

            case 8: {
                var2_2 /* !! */  = (int)fq.hbnn("hbvj", hbnk(int ), (int)126);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl109
            }
lbl100:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)fq.hbnn("hbvk", hbnk(int ), (int)127);
                if (!var3_1) ** GOTO lbl77
                throw null;
            }
lbl104:
            // 4 sources

            case 10: {
                var2_2 /* !! */  = (int)fq.hbnn("hbvl", hbnk(int ), (int)128);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl127
            }
lbl109:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)fq.hbnn("hbvm", hbnk(int ), (int)129);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl114:
            // 2 sources

            case 12: {
                var2_2 /* !! */  = (int)fq.hbnn("hbvn", hbnk(int ), (int)130);
                if (!var3_1) ** GOTO lbl85
                throw null;
            }
            case 13: {
                var2_2 /* !! */  = (int)fq.hbnn("hbvo", hbnk(int ), (int)131);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl123:
            // 2 sources

            case 14: {
                var2_2 /* !! */  = (int)fq.hbnn("hbvp", hbnk(int ), (int)132);
                if (!var3_1) ** GOTO lbl104
                throw null;
            }
lbl127:
            // 2 sources

            case 15: {
                var2_2 /* !! */  = (int)fq.hbnn("hbvq", hbnk(int ), (int)133);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl165
            }
lbl132:
            // 4 sources

            case 16: {
                var2_2 /* !! */  = (int)fq.hbnn("hbvr", hbnk(int ), (int)134);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl212
            }
            case 17: {
                var2_2 /* !! */  = (int)fq.hbnn("hbvs", hbnk(int ), (int)135);
                if (!var3_1) ** GOTO lbl104
                throw null;
            }
lbl141:
            // 3 sources

            case 18: {
                var2_2 /* !! */  = (int)fq.hbnn("hbvt", hbnk(int ), (int)136);
                if (!var3_1) ** GOTO lbl104
                throw null;
            }
lbl145:
            // 2 sources

            case 19: {
                var2_2 /* !! */  = (int)fq.hbnn("hbvu", hbnk(int ), (int)137);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl156
            }
lbl150:
            // 2 sources

            case 20: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fq.hbnn("hbvv", hbnk(int ), (int)138);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl174
                    break;
                }
            }
lbl156:
            // 2 sources

            case 21: {
                var2_2 /* !! */  = (int)fq.hbnn("hbvw", hbnk(int ), (int)139);
                if (!var3_1) ** GOTO lbl123
                throw null;
            }
            case 22: {
                var2_2 /* !! */  = (int)fq.hbnn("hbvx", hbnk(int ), (int)140);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl165:
            // 2 sources

            case 23: {
                var2_2 /* !! */  = (int)fq.hbnn("hbvy", hbnk(int ), (int)141);
                if (!var3_1) ** GOTO lbl67
                throw null;
            }
            case 24: {
                var2_2 /* !! */  = (int)fq.hbnn("hbvz", hbnk(int ), (int)142);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl174:
            // 2 sources

            case 25: {
                var2_2 /* !! */  = (int)fq.hbnn("hbwa", hbnk(int ), (int)143);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl224
            }
            case 26: {
                var2_2 /* !! */  = (int)fq.hbnn("hbwb", hbnk(int ), (int)144);
                if (!var3_1) ** GOTO lbl72
                throw null;
            }
lbl183:
            // 3 sources

            case 27: {
                do {
                    var2_2 /* !! */  = (int)fq.hbnn("hbwc", hbnk(int ), (int)145);
                } while (!var3_1);
                throw null;
            }
            case 28: {
                var2_2 /* !! */  = (int)fq.hbnn("hbwd", hbnk(int ), (int)146);
                if (!var3_1) ** GOTO lbl95
                throw null;
            }
lbl192:
            // 2 sources

            case 29: {
                var2_2 /* !! */  = (int)fq.hbnn("hbwe", hbnk(int ), (int)147);
                if (!var3_1) ** GOTO lbl57
                throw null;
            }
            case 30: {
                var2_2 /* !! */  = (int)fq.hbnn("hbwf", hbnk(int ), (int)148);
                if (!var3_1) ** GOTO lbl132
                throw null;
            }
            case 31: {
                var2_2 /* !! */  = (int)fq.hbnn("hbwg", hbnk(int ), (int)149);
                if (!var3_1) ** GOTO lbl114
                throw null;
            }
lbl204:
            // 2 sources

            case 32: {
                var2_2 /* !! */  = (int)fq.hbnn("hbwh", hbnk(int ), (int)150);
                if (!var3_1) ** GOTO lbl95
                throw null;
            }
            case 33: {
                var2_2 /* !! */  = (int)fq.hbnn("hbwi", hbnk(int ), (int)151);
                if (!var3_1) ** GOTO lbl95
                throw null;
            }
lbl212:
            // 3 sources

            case 34: {
                var2_2 /* !! */  = (int)fq.hbnn("hbwj", hbnk(int ), (int)152);
                if (var3_1) {
                    throw null;
                }
            }
lbl216:
            // 4 sources

            case 35: {
                var2_2 /* !! */  = (int)fq.hbnn("hbwk", hbnk(int ), (int)153);
                if (!var3_1) ** GOTO lbl141
                throw null;
            }
lbl220:
            // 2 sources

            case 36: {
                var2_2 /* !! */  = (int)fq.hbnn("hbwl", hbnk(int ), (int)154);
                if (!var3_1) ** GOTO lbl183
                throw null;
            }
lbl224:
            // 5 sources

            case 37: {
                var2_2 /* !! */  = (int)fq.hbnn("hbwm", hbnk(int ), (int)155);
                if (!var3_1) ** GOTO lbl220
                throw null;
            }
lbl228:
            // 2 sources

            case 38: {
                var2_2 /* !! */  = (int)fq.hbnn("hbwn", hbnk(int ), (int)156);
                if (!var3_1) ** GOTO lbl141
                throw null;
            }
lbl232:
            // 2 sources

            case 39: {
                var2_2 /* !! */  = (int)fq.hbnn("hbwo", hbnk(int ), (int)157);
                if (!var3_1) ** GOTO lbl132
                throw null;
            }
            case 40: {
                var2_2 /* !! */  = (int)fq.hbnn("hbwp", hbnk(int ), (int)158);
                if (!var3_1) ** GOTO lbl192
                throw null;
            }
            case 41: {
                var2_2 /* !! */  = (int)fq.hbnn("hbwq", hbnk(int ), (int)159);
                if (!var3_1) ** GOTO lbl85
                throw null;
            }
            case 42: {
                var2_2 /* !! */  = (int)fq.hbnn("hbwr", hbnk(int ), (int)160);
                if (!var3_1) ** GOTO lbl132
                throw null;
            }
            case 43: {
                var2_2 /* !! */  = (int)fq.hbnn("hbws", hbnk(int ), (int)161);
                if (!var3_1) ** GOTO lbl100
                throw null;
            }
            case 44: {
                var2_2 /* !! */  = (int)fq.hbnn("hbwt", hbnk(int ), (int)162);
                if (!var3_1) ** GOTO lbl150
                throw null;
            }
            case 45: 
        }
        var2_2 /* !! */  = (int)fq.hbnn("hbwu", hbnk(int ), (int)163);
        ** while (!var3_1)
lbl259:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hcdb() {
        fq.hbnt[100] = -2881946457826034745L;
        fq.hbnt[101] = 1123827136418935784L;
        fq.hbnt[102] = -4649370181463080538L;
        fq.hbnt[103] = -713648276129864966L;
        fq.hbnt[104] = -6076754056635763973L;
        fq.hbnt[105] = -6583488385864213863L;
        fq.hbnt[106] = -1363617670613027164L;
        fq.hbnt[107] = -845093607708261038L;
        fq.hbnt[108] = 3039385223082417684L;
        fq.hbnt[109] = -1864594932263204209L;
        fq.hbnt[110] = 4601202113535630406L;
        fq.hbnt[111] = -6995616943516233214L;
        fq.hbnt[112] = 2837449995942097719L;
        fq.hbnt[113] = -2619994984519400206L;
        fq.hbnt[114] = 3202231692479451642L;
        fq.hbnt[115] = 4504305793545800693L;
        fq.hbnt[116] = 3572033281804611476L;
        fq.hbnt[117] = -9111679478949716318L;
        fq.hbnt[118] = 2446843654431335289L;
        fq.hbnt[119] = 859440571642297448L;
        fq.hbnt[120] = -8397720509607385734L;
        fq.hbnt[121] = -5386642586772570930L;
        fq.hbnt[122] = -8887948473306661150L;
        fq.hbnt[123] = -3124160460149718358L;
        fq.hbnt[124] = -1979914330745642781L;
        fq.hbnt[125] = -9212299404010167158L;
        fq.hbnt[126] = -2367825558448388901L;
        fq.hbnt[127] = -6500168313382041309L;
        fq.hbnt[128] = -608664706725533366L;
        fq.hbnt[129] = -3534653307361866819L;
        fq.hbnt[130] = -2117275614706162467L;
        fq.hbnt[131] = -1092915520446897443L;
        fq.hbnt[132] = -2710390751565433519L;
        fq.hbnt[133] = -5513831420634369019L;
        fq.hbnt[134] = -2638614071369898744L;
        fq.hbnt[135] = 9001940129815750672L;
        fq.hbnt[136] = 1498962921792132735L;
        fq.hbnt[137] = -44821873194032667L;
        fq.hbnt[138] = 252018697935416379L;
        fq.hbnt[139] = -7687796343971371112L;
        fq.hbnt[140] = -2708192103984896365L;
        fq.hbnt[141] = 8703422342387534905L;
        fq.hbnt[142] = -2685682325210316207L;
        fq.hbnt[143] = 1080690871822512441L;
        fq.hbnt[144] = 941888123291615969L;
        fq.hbnt[145] = 511443667004990355L;
        fq.hbnt[146] = -7882647414394556445L;
        fq.hbnt[147] = -8478355862996843561L;
        fq.hbnt[148] = -6832597012071483179L;
        fq.hbnt[149] = -5363749016272920354L;
        fq.hbnt[150] = -7316811569893212789L;
        fq.hbnt[151] = -7108784603606711049L;
        fq.hbnt[152] = -4969141675050618909L;
        fq.hbnt[153] = -1719792388970688991L;
    }

    private static /* synthetic */ int hbnk(int n2) {
        return hbnl[n2] ^ hbnm[n2];
    }

    private static /* synthetic */ void hcda() {
        fq.hbnt[0] = -4754366462837496147L;
        fq.hbnt[1] = 380122584766425953L;
        fq.hbnt[2] = 3286166532469473367L;
        fq.hbnt[3] = -6045750951026603556L;
        fq.hbnt[4] = -6796931721955078296L;
        fq.hbnt[5] = -1390255103881647007L;
        fq.hbnt[6] = -3415894475881118232L;
        fq.hbnt[7] = 1437568203302618679L;
        fq.hbnt[8] = -559131714506591397L;
        fq.hbnt[9] = 5817800881256939929L;
        fq.hbnt[10] = -2711682530056030178L;
        fq.hbnt[11] = -4279945267944142028L;
        fq.hbnt[12] = -7833869024218843311L;
        fq.hbnt[13] = 5184646270756738666L;
        fq.hbnt[14] = -8231153471410911415L;
        fq.hbnt[15] = -3610298884528115525L;
        fq.hbnt[16] = -9020637976947606435L;
        fq.hbnt[17] = -8501930193715748895L;
        fq.hbnt[18] = 5208001555828579385L;
        fq.hbnt[19] = 3318784509446733685L;
        fq.hbnt[20] = 688069218093346547L;
        fq.hbnt[21] = 5292347770374671016L;
        fq.hbnt[22] = -6653450256911540148L;
        fq.hbnt[23] = 9024407687336247336L;
        fq.hbnt[24] = 8941614232689792041L;
        fq.hbnt[25] = -7438244398200484401L;
        fq.hbnt[26] = 3940719102174355440L;
        fq.hbnt[27] = -5455260661596038144L;
        fq.hbnt[28] = 5884064166918682808L;
        fq.hbnt[29] = -7610807260123192718L;
        fq.hbnt[30] = 3402175824508343372L;
        fq.hbnt[31] = -5175147086654069401L;
        fq.hbnt[32] = -8951837369959775908L;
        fq.hbnt[33] = -5825588047295344436L;
        fq.hbnt[34] = -8598935361481890773L;
        fq.hbnt[35] = 8444587013493607608L;
        fq.hbnt[36] = 10783696803688930L;
        fq.hbnt[37] = -1440693969876184920L;
        fq.hbnt[38] = 8294598159030617459L;
        fq.hbnt[39] = -6423111737222199665L;
        fq.hbnt[40] = -5553970860893703252L;
        fq.hbnt[41] = 6970274983511598779L;
        fq.hbnt[42] = 5202989394556723878L;
        fq.hbnt[43] = 4444545248269394858L;
        fq.hbnt[44] = -7421248522320253345L;
        fq.hbnt[45] = 7290474564383069628L;
        fq.hbnt[46] = -734896729965027959L;
        fq.hbnt[47] = -2424481142996111831L;
        fq.hbnt[48] = -5372026981345538146L;
        fq.hbnt[49] = -2178124286020098764L;
        fq.hbnt[50] = -8330248710560434120L;
        fq.hbnt[51] = 4686963075836565408L;
        fq.hbnt[52] = 4092326605338983326L;
        fq.hbnt[53] = -9038069922674981021L;
        fq.hbnt[54] = 3281099441016291489L;
        fq.hbnt[55] = 2250296838093949865L;
        fq.hbnt[56] = -836370510403781701L;
        fq.hbnt[57] = 7089371418213955338L;
        fq.hbnt[58] = 387703736333074960L;
        fq.hbnt[59] = 5706911859903971682L;
        fq.hbnt[60] = -1735848034065430027L;
        fq.hbnt[61] = 2372623226321055080L;
        fq.hbnt[62] = -2918139192919991884L;
        fq.hbnt[63] = -869014726472498805L;
        fq.hbnt[64] = -9047894395197783123L;
        fq.hbnt[65] = -6347161136363467372L;
        fq.hbnt[66] = -1666115929990849857L;
        fq.hbnt[67] = -3427205172928932974L;
        fq.hbnt[68] = 6407210193716206521L;
        fq.hbnt[69] = 5469288413043233222L;
        fq.hbnt[70] = -5550168565465256090L;
        fq.hbnt[71] = -6482013320645012370L;
        fq.hbnt[72] = -2388251986106631210L;
        fq.hbnt[73] = -7437568447456801700L;
        fq.hbnt[74] = -8923284681418955281L;
        fq.hbnt[75] = -573726611683475871L;
        fq.hbnt[76] = -8261822682037910872L;
        fq.hbnt[77] = 231108891896458641L;
        fq.hbnt[78] = -7398487460933724078L;
        fq.hbnt[79] = -2066021809691662616L;
        fq.hbnt[80] = -6029259957696340604L;
        fq.hbnt[81] = 6536706932584456609L;
        fq.hbnt[82] = 6566145802910171251L;
        fq.hbnt[83] = -9160781479281016017L;
        fq.hbnt[84] = -8956540752717562584L;
        fq.hbnt[85] = 8470945502125083355L;
        fq.hbnt[86] = -5314486310461668614L;
        fq.hbnt[87] = 5726937746507299376L;
        fq.hbnt[88] = 8056821713166124496L;
        fq.hbnt[89] = -2523160652035161456L;
        fq.hbnt[90] = 4131432053925643471L;
        fq.hbnt[91] = -6168060001848546607L;
        fq.hbnt[92] = 1600987872104000605L;
        fq.hbnt[93] = 3092769418012188321L;
        fq.hbnt[94] = 5629848851578392322L;
        fq.hbnt[95] = 432042519025314239L;
        fq.hbnt[96] = 3897778017827374948L;
        fq.hbnt[97] = 4718276285887586243L;
        fq.hbnt[98] = -4929750658724449391L;
        fq.hbnt[99] = -2489655893141766263L;
    }

    static {
        hbnl = new int[236];
        hbnm = new int[236];
        fq.hccs();
        fq.hcct();
        fq.hccu();
        fq.hccv();
        fq.hccw();
        fq.hccx();
        hbns = new long[154];
        hbnt = new long[154];
        fq.hccy();
        fq.hccz();
        fq.hcda();
        fq.hcdb();
        GSON = new GsonBuilder().setPrettyPrinting().create();
        BACKUP_FILE = Path.of("", new String[0]).toAbsolutePath().resolve("Phobia").resolve("configs").resolve("autocfg").resolve("extra-optimization-backup.json");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void enable(class_315 var0) {
        v0 /* !! */  = fq.nz;
        if (true) ** GOTO lbl5
        block42: while (true) {
            v0 /* !! */  = (long)(fq.hbnn("hbpq", hbnr(int ), (int)17) - fq.hbnn("hbpp", hbnr(int ), (int)16));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1573367876: {
                    continue block42;
                }
                case -1170937241: {
                    break block42;
                }
            }
            break;
        }
        var3_1 = fq.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = fq.nz - fq.hbnn("hbpr", hbnr(int ), (int)18)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == fq.hbnn("hbps", hbnk(int ), (int)34)) break;
            v1 /* !! */  = (long)fq.hbnn("hbpt", hbnk(int ), (int)35);
        }
        var2_2 /* !! */  = fq.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = fq.nz - fq.hbnn("hbpu", hbnr(int ), (int)19)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fq.hbnn("hbpv", hbnk(int ), (int)36)) break;
            v2 /* !! */  = (long)fq.hbnn("hbpw", hbnk(int ), (int)37);
        }
        var1_3 = fq.a;
        if (!var3_1) ** GOTO lbl29
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl29:
                // 1 sources

                if (var1_3 || var1_3) continue block45;
                v3 /* !! */  = fq.nz;
                if (true) ** GOTO lbl34
                block46: while (true) {
                    v3 /* !! */  = (long)(fq.hbnn("hbpy", hbnr(int ), (int)21) - fq.hbnn("hbpx", hbnr(int ), (int)20));
lbl34:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1170937241: {
                            break block46;
                        }
                        case 1692021503: {
                            continue block46;
                        }
                    }
                    break;
                }
                v4 = new LinkOption[]{};
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = fq.nz - fq.hbnn("hbpz", hbnr(int ), (int)22)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == fq.hbnn("hbqa", hbnk(int ), (int)38)) break;
                    v5 /* !! */  = (long)fq.hbnn("hbqb", hbnk(int ), (int)39);
                }
                if (Files.exists(fq.BACKUP_FILE, v4)) ** GOTO lbl80
                if (var1_3) continue block45;
                v6 /* !! */  = fq.nz;
                if (true) ** GOTO lbl51
                block48: while (true) {
                    v6 /* !! */  = (long)(fq.hbnn("hbqd", hbnr(int ), (int)24) - fq.hbnn("hbqc", hbnr(int ), (int)23));
lbl51:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1170937241: {
                            break block48;
                        }
                        case 1997936836: {
                            continue block48;
                        }
                    }
                    break;
                }
                v7 = fq$Snapshot.capture(var0);
                v8 /* !! */  = fq.nz;
                if (true) ** GOTO lbl61
                block49: while (true) {
                    v8 /* !! */  = (long)(v9 - fq.hbnn("hbqe", hbnr(int ), (int)25));
lbl61:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1926507666: {
                            v9 = fq.hbnn("hbqf", hbnr(int ), (int)26);
                            continue block49;
                        }
                        case -1170937241: {
                            break block49;
                        }
                        case -942158008: {
                            v9 = fq.hbnn("hbqg", hbnr(int ), (int)27);
                            continue block49;
                        }
                    }
                    break;
                }
                if (!fq.writeSnapshot(v7)) {
                    if (var1_3 || var1_3) continue block45;
                    while (true) {
                        if ((v10 /* !! */  = (cfr_temp_3 = fq.nz - fq.hbnn("hbqh", hbnr(int ), (int)28)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v10 /* !! */  == fq.hbnn("hbqi", hbnk(int ), (int)40)) break;
                        v10 /* !! */  = (long)fq.hbnn("hbqj", hbnk(int ), (int)41);
                    }
                    ai.error("Optimization: failed to save the original Minecraft settings");
                    if (var1_3 || var1_3) continue block45;
                    return;
                }
lbl80:
                // 3 sources

                if (var1_3 || var1_3) continue block45;
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_4 = fq.nz - fq.hbnn("hbqk", hbnr(int ), (int)29)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == fq.hbnn("hbql", hbnk(int ), (int)42)) break;
                    v11 /* !! */  = (long)fq.hbnn("hbqm", hbnk(int ), (int)43);
                }
                fq.applyPreset(var0);
                if (var1_3 || var1_3) continue block45;
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_5 = fq.nz - fq.hbnn("hbqn", hbnr(int ), (int)30)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == fq.hbnn("hbqo", hbnk(int ), (int)44)) break;
                    v12 /* !! */  = (long)fq.hbnn("hbqp", hbnk(int ), (int)45);
                }
                var0.method_1640();
                if (var1_3 || var1_3) continue block45;
                v13 /* !! */  = fq.nz;
                if (true) ** GOTO lbl99
                block53: while (true) {
                    v13 /* !! */  = (long)(v14 - fq.hbnn("hbqq", hbnr(int ), (int)31));
lbl99:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1170937241: {
                            break block53;
                        }
                        case -454340296: {
                            v14 = fq.hbnn("hbqr", hbnr(int ), (int)32);
                            continue block53;
                        }
                        case 1272687745: {
                            v14 = fq.hbnn("hbqs", hbnr(int ), (int)33);
                            continue block53;
                        }
                    }
                    break;
                }
                ai.info("Optimization: extra optimization enabled");
                if (!var1_3 && !var1_3) ** break;
                continue block45;
                return;
                case 0: {
                    var2_2 /* !! */  = (int)fq.hbnn("hbqt", hbnk(int ), (int)46);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl122
                }
                case 1: {
                    var2_2 /* !! */  = (int)fq.hbnn("hbqu", hbnk(int ), (int)47);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl184
                }
lbl122:
                // 2 sources

                case 2: {
                    var2_2 /* !! */  = (int)fq.hbnn("hbqv", hbnk(int ), (int)48);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl146
                }
                case 3: {
                    var2_2 /* !! */  = (int)fq.hbnn("hbqw", hbnk(int ), (int)49);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl176
                }
                case 4: {
                    var2_2 /* !! */  = (int)fq.hbnn("hbqx", hbnk(int ), (int)50);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl142
                }
                case 5: {
                    var2_2 /* !! */  = (int)fq.hbnn("hbqy", hbnk(int ), (int)51);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl151
                }
lbl142:
                // 2 sources

                case 6: {
                    var2_2 /* !! */  = (int)fq.hbnn("hbqz", hbnk(int ), (int)52);
                    if (!var3_1) break block45;
                    throw null;
                }
lbl146:
                // 5 sources

                case 7: {
                    var2_2 /* !! */  = (int)fq.hbnn("hbra", hbnk(int ), (int)53);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl184
                }
lbl151:
                // 3 sources

                case 8: {
                    var2_2 /* !! */  = (int)fq.hbnn("hbrb", hbnk(int ), (int)54);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl180
                }
                case 9: {
                    var2_2 /* !! */  = (int)fq.hbnn("hbrc", hbnk(int ), (int)55);
                    if (!var3_1) ** GOTO lbl146
                    throw null;
                }
lbl160:
                // 3 sources

                case 10: {
                    var2_2 /* !! */  = (int)fq.hbnn("hbrd", hbnk(int ), (int)56);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 11: {
                    var2_2 /* !! */  = (int)fq.hbnn("hbre", hbnk(int ), (int)57);
                    if (!var3_1) ** GOTO lbl151
                    throw null;
                }
                case 12: {
                    var2_2 /* !! */  = (int)fq.hbnn("hbrf", hbnk(int ), (int)58);
                    if (!var3_1) break block45;
                    throw null;
                }
                case 13: {
                    var2_2 /* !! */  = (int)fq.hbnn("hbrg", hbnk(int ), (int)59);
                    if (!var3_1) ** GOTO lbl146
                    throw null;
                }
lbl176:
                // 2 sources

                case 14: {
                    var2_2 /* !! */  = (int)fq.hbnn("hbrh", hbnk(int ), (int)60);
                    if (!var3_1) ** GOTO lbl160
                    throw null;
                }
lbl180:
                // 2 sources

                case 15: {
                    var2_2 /* !! */  = (int)fq.hbnn("hbri", hbnk(int ), (int)61);
                    if (!var3_1) ** GOTO lbl160
                    throw null;
                }
lbl184:
                // 3 sources

                case 16: {
                    var2_2 /* !! */  = (int)fq.hbnn("hbrj", hbnk(int ), (int)62);
                    if (!var3_1) ** GOTO lbl146
                    throw null;
                }
                case 17: 
            }
        }
        do {
            var2_2 /* !! */  = (int)fq.hbnn("hbrk", hbnk(int ), (int)63);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ long hbnr(int n2) {
        return hbns[n2] ^ hbnt[n2];
    }

    private static /* synthetic */ void hcct() {
        fq.hbnl[100] = -149106676;
        fq.hbnl[101] = -192697595;
        fq.hbnl[102] = 300717680;
        fq.hbnl[103] = 372096557;
        fq.hbnl[104] = -412291370;
        fq.hbnl[105] = -312174745;
        fq.hbnl[106] = 806757690;
        fq.hbnl[107] = -542341756;
        fq.hbnl[108] = -885080164;
        fq.hbnl[109] = -1271459335;
        fq.hbnl[110] = -686556340;
        fq.hbnl[111] = -1350815736;
        fq.hbnl[112] = 474081898;
        fq.hbnl[113] = -1282601222;
        fq.hbnl[114] = 38516585;
        fq.hbnl[115] = 1146401213;
        fq.hbnl[116] = -883975675;
        fq.hbnl[117] = -1514477413;
        fq.hbnl[118] = -2022541879;
        fq.hbnl[119] = 1119305163;
        fq.hbnl[120] = -1985360414;
        fq.hbnl[121] = -1148782116;
        fq.hbnl[122] = 1942546571;
        fq.hbnl[123] = -735584267;
        fq.hbnl[124] = 1281970626;
        fq.hbnl[125] = 975494877;
        fq.hbnl[126] = -1949427743;
        fq.hbnl[127] = 2048073410;
        fq.hbnl[128] = -943691069;
        fq.hbnl[129] = -301553767;
        fq.hbnl[130] = -1848250090;
        fq.hbnl[131] = 507198848;
        fq.hbnl[132] = 1268694698;
        fq.hbnl[133] = 123398540;
        fq.hbnl[134] = -914336852;
        fq.hbnl[135] = 232586142;
        fq.hbnl[136] = -1171292960;
        fq.hbnl[137] = 1193555498;
        fq.hbnl[138] = -728370025;
        fq.hbnl[139] = 1249601822;
        fq.hbnl[140] = 1355168443;
        fq.hbnl[141] = 211285874;
        fq.hbnl[142] = 172153814;
        fq.hbnl[143] = -1712799355;
        fq.hbnl[144] = -515152555;
        fq.hbnl[145] = -322058352;
        fq.hbnl[146] = 1183056647;
        fq.hbnl[147] = -301104747;
        fq.hbnl[148] = 1877175694;
        fq.hbnl[149] = -305818866;
        fq.hbnl[150] = -118368148;
        fq.hbnl[151] = 659434829;
        fq.hbnl[152] = 110760672;
        fq.hbnl[153] = -681828905;
        fq.hbnl[154] = -597055226;
        fq.hbnl[155] = -1652328398;
        fq.hbnl[156] = -1718784378;
        fq.hbnl[157] = -433406853;
        fq.hbnl[158] = 1219770925;
        fq.hbnl[159] = -92289657;
        fq.hbnl[160] = -1884641209;
        fq.hbnl[161] = 784881535;
        fq.hbnl[162] = 208145785;
        fq.hbnl[163] = -1319619651;
        fq.hbnl[164] = -1767250559;
        fq.hbnl[165] = -111089130;
        fq.hbnl[166] = 1924861709;
        fq.hbnl[167] = -284399980;
        fq.hbnl[168] = 521881231;
        fq.hbnl[169] = 1879345681;
        fq.hbnl[170] = 625470760;
        fq.hbnl[171] = -1400158595;
        fq.hbnl[172] = 1495959721;
        fq.hbnl[173] = -161771678;
        fq.hbnl[174] = -1955438357;
        fq.hbnl[175] = -295023030;
        fq.hbnl[176] = 2054683215;
        fq.hbnl[177] = -1751266222;
        fq.hbnl[178] = 373525525;
        fq.hbnl[179] = 1432617679;
        fq.hbnl[180] = 1716358147;
        fq.hbnl[181] = 1699907429;
        fq.hbnl[182] = 1325386795;
        fq.hbnl[183] = -1693329489;
        fq.hbnl[184] = 26078764;
        fq.hbnl[185] = 847844373;
        fq.hbnl[186] = 1661858560;
        fq.hbnl[187] = -190563075;
        fq.hbnl[188] = -1418888617;
        fq.hbnl[189] = -211271765;
        fq.hbnl[190] = 103795782;
        fq.hbnl[191] = 1002836352;
        fq.hbnl[192] = 87733484;
        fq.hbnl[193] = -383299800;
        fq.hbnl[194] = -928682165;
        fq.hbnl[195] = -1237193674;
        fq.hbnl[196] = 191956903;
        fq.hbnl[197] = 2062760872;
        fq.hbnl[198] = 708170991;
        fq.hbnl[199] = 1983462327;
    }

    private static /* synthetic */ void hccy() {
        fq.hbns[0] = 964353627038325050L;
        fq.hbns[1] = -919608351099870716L;
        fq.hbns[2] = 4077393320397804366L;
        fq.hbns[3] = -2484129240436656898L;
        fq.hbns[4] = 3459190169521832013L;
        fq.hbns[5] = -1973548755365403147L;
        fq.hbns[6] = 8611050462890598221L;
        fq.hbns[7] = 7732233884537645348L;
        fq.hbns[8] = 1374775031972357552L;
        fq.hbns[9] = 2453574245672677669L;
        fq.hbns[10] = 1643337345733698200L;
        fq.hbns[11] = -5866689711805209313L;
        fq.hbns[12] = -730061018535980143L;
        fq.hbns[13] = 6307005227705875693L;
        fq.hbns[14] = -7254701091742092074L;
        fq.hbns[15] = -7800828042218329760L;
        fq.hbns[16] = 8350316592336318875L;
        fq.hbns[17] = -3117738267970257365L;
        fq.hbns[18] = -94538145314997000L;
        fq.hbns[19] = 4788303249221211068L;
        fq.hbns[20] = -7518869417233237116L;
        fq.hbns[21] = -4316315396298321163L;
        fq.hbns[22] = -1792659505418023847L;
        fq.hbns[23] = -6522596366144083659L;
        fq.hbns[24] = -2270849449937090214L;
        fq.hbns[25] = -6496255641469796528L;
        fq.hbns[26] = -6074660026310784898L;
        fq.hbns[27] = 1447861125272506779L;
        fq.hbns[28] = -5924050156613946725L;
        fq.hbns[29] = 2004617068413774306L;
        fq.hbns[30] = 2036299907550660076L;
        fq.hbns[31] = -7328811141846001768L;
        fq.hbns[32] = 2956300260976972600L;
        fq.hbns[33] = -6653742998331419126L;
        fq.hbns[34] = 3318853064071756284L;
        fq.hbns[35] = 4534199498026201372L;
        fq.hbns[36] = -6262319405107545338L;
        fq.hbns[37] = -4516567920872476516L;
        fq.hbns[38] = 859940773923716522L;
        fq.hbns[39] = -5371164757557710731L;
        fq.hbns[40] = -516321562326057105L;
        fq.hbns[41] = -1787019686848498281L;
        fq.hbns[42] = -1834013302011983554L;
        fq.hbns[43] = -4759368061797887466L;
        fq.hbns[44] = -2617834132672591421L;
        fq.hbns[45] = 5318459649123117055L;
        fq.hbns[46] = 6538848785949967001L;
        fq.hbns[47] = -4146748601799179275L;
        fq.hbns[48] = -3404376379321451461L;
        fq.hbns[49] = -7440599487567996334L;
        fq.hbns[50] = 4440562194721239618L;
        fq.hbns[51] = -7809033846981104939L;
        fq.hbns[52] = -1182411934714668341L;
        fq.hbns[53] = -7930821355606268354L;
        fq.hbns[54] = -1648559297658582013L;
        fq.hbns[55] = -6636569350178165936L;
        fq.hbns[56] = 3467863699472648724L;
        fq.hbns[57] = 4483458114085919264L;
        fq.hbns[58] = -8945734621130089919L;
        fq.hbns[59] = 753124297201870555L;
        fq.hbns[60] = 8520516818636080705L;
        fq.hbns[61] = 2380254952057618724L;
        fq.hbns[62] = 7557933748731622313L;
        fq.hbns[63] = 5445985246062297129L;
        fq.hbns[64] = -1739772507020616097L;
        fq.hbns[65] = 5078280816040505975L;
        fq.hbns[66] = 5094143668756196066L;
        fq.hbns[67] = 8883229133067347753L;
        fq.hbns[68] = 1607263461887879176L;
        fq.hbns[69] = -7764068116682382701L;
        fq.hbns[70] = 2061636189070141072L;
        fq.hbns[71] = -8650025425823302880L;
        fq.hbns[72] = -2217115200266552362L;
        fq.hbns[73] = 7622491362333390671L;
        fq.hbns[74] = 2808974841694354163L;
        fq.hbns[75] = -4677774023297695355L;
        fq.hbns[76] = 2342498448981666497L;
        fq.hbns[77] = 4709354245627192429L;
        fq.hbns[78] = -6628497842228053189L;
        fq.hbns[79] = -4085251071373541549L;
        fq.hbns[80] = -7942270442389997683L;
        fq.hbns[81] = -7031512289612228609L;
        fq.hbns[82] = -8668762049913596348L;
        fq.hbns[83] = 108241245833748823L;
        fq.hbns[84] = -8370128841223489865L;
        fq.hbns[85] = 8118262563175159004L;
        fq.hbns[86] = -1310093283957548423L;
        fq.hbns[87] = 7939384966327274759L;
        fq.hbns[88] = 4947363763520611154L;
        fq.hbns[89] = 5782991530801945046L;
        fq.hbns[90] = 4412433143987528539L;
        fq.hbns[91] = -3493535748451282313L;
        fq.hbns[92] = -8629745255503376118L;
        fq.hbns[93] = -7505581496350746968L;
        fq.hbns[94] = 4339150236381843661L;
        fq.hbns[95] = -6194810016395946090L;
        fq.hbns[96] = 191022930943726619L;
        fq.hbns[97] = -1256720839004426375L;
        fq.hbns[98] = -3265919177112188934L;
        fq.hbns[99] = 5963118619737707109L;
    }
}

