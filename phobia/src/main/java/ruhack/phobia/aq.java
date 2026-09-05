/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;
import ruhack.phobia.aa;
import ruhack.phobia.ac;
import ruhack.phobia.ai;
import ruhack.phobia.ap;
import ruhack.phobia.ee;

public class aq {
    public static final int b;
    public static final boolean c;
    private static final long hl = -3606441598928025563L;
    public static final boolean a;
    private static int[] divu;
    private static long[] diwk;
    private ap activeConfig;
    private static int[] divr;
    private static long[] diwo;
    private static aq instance;
    private final List<ap> configs;

    /*
     * Exception decompiling
     */
    private static long lastModified(Path var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 9[SWITCH]
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
    public List<ap> getConfigs() {
        v0 /* !! */  = aq.hl;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - aq.divw("djjv", diwi(int ), (int)114));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1558245998: {
                    v1 = aq.divw("djjw", diwi(int ), (int)115);
                    continue block17;
                }
                case -924356779: {
                    v1 = aq.divw("djjx", diwi(int ), (int)116);
                    continue block17;
                }
                case 951322661: {
                    break block17;
                }
                case 1271378535: {
                    v1 = aq.divw("djjy", diwi(int ), (int)117);
                    continue block17;
                }
            }
            break;
        }
        var3_1 = aq.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = aq.hl - aq.divw("djjz", diwi(int ), (int)118)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == aq.divw("djka", divp(int ), (int)193)) break;
            v2 /* !! */  = (long)aq.divw("djkb", divp(int ), (int)194);
        }
        var2_2 /* !! */  = aq.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = aq.hl - aq.divw("djkc", diwi(int ), (int)119)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == aq.divw("djkd", divp(int ), (int)195)) break;
            v3 /* !! */  = (long)aq.divw("djke", divp(int ), (int)196);
        }
        var1_3 = aq.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = aq.hl - aq.divw("djkf", diwi(int ), (int)120)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == aq.divw("djkg", divp(int ), (int)197)) break;
                    v4 /* !! */  = (long)aq.divw("djkh", divp(int ), (int)198);
                }
                v5 /* !! */  = aq.hl;
                if (true) ** GOTO lbl50
                block22: while (true) {
                    v5 /* !! */  = (long)(v6 - aq.divw("djki", diwi(int ), (int)121));
lbl50:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -114684786: {
                            v6 = aq.divw("djkj", diwi(int ), (int)122);
                            continue block22;
                        }
                        case 542291351: {
                            v6 = aq.divw("djkk", diwi(int ), (int)123);
                            continue block22;
                        }
                        case 951322661: {
                            break block22;
                        }
                    }
                    break;
                }
                return List.copyOf(this.configs);
            }
lbl60:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)aq.divw("djkl", divp(int ), (int)199);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl70
            }
lbl65:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)aq.divw("djkm", divp(int ), (int)200);
                    if (!var3_1) ** GOTO lbl60
                    throw null;
                }
            }
lbl70:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)aq.divw("djkn", divp(int ), (int)201);
                if (!var3_1) ** GOTO lbl65
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)aq.divw("djko", divp(int ), (int)202);
        ** while (!var3_1)
lbl77:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private ap find(String string) {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = hl - aq.divw("djmz", diwi(int ), (int)154)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == aq.divw("djna", divp(int ), (int)235)) break;
            object = aq.divw("djnb", divp(int ), (int)236);
        }
        boolean bl3 = c;
        Object object = hl;
        block21: while (true) {
            switch ((int)object) {
                case -1274640282: {
                    object = aq.divw("djnd", diwi(int ), (int)156) - aq.divw("djnc", diwi(int ), (int)155);
                    continue block21;
                }
                case 951322661: {
                    break block21;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object2;
            if ((object2 = (l3 = hl - aq.divw("djne", diwi(int ), (int)157)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object2 == aq.divw("djnf", divp(int ), (int)237)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object2 = aq.divw("djng", divp(int ), (int)238);
        }
        if (bl2) return null;
        if (bl2) return null;
        Object object3 = hl;
        boolean bl4 = true;
        block23: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object3 = callSite - aq.divw("djnh", diwi(int ), (int)158);
            }
            switch ((int)object3) {
                case -1164509362: {
                    callSite = aq.divw("djni", diwi(int ), (int)159);
                    continue block23;
                }
                case 951322661: {
                    break block23;
                }
                case 1104646405: {
                    callSite = aq.divw("djnj", diwi(int ), (int)160);
                    continue block23;
                }
                case 1335317180: {
                    callSite = aq.divw("djnk", diwi(int ), (int)161);
                    continue block23;
                }
            }
            break;
        }
        Object object4 = hl;
        boolean bl5 = true;
        block24: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object4 = callSite - aq.divw("djnl", diwi(int ), (int)162);
            }
            switch ((int)object4) {
                case -1094847704: {
                    callSite = aq.divw("djnm", diwi(int ), (int)163);
                    continue block24;
                }
                case 717726338: {
                    callSite = aq.divw("djnn", diwi(int ), (int)164);
                    continue block24;
                }
                case 951322661: {
                    break block24;
                }
                case 1938212403: {
                    callSite = aq.divw("djno", diwi(int ), (int)165);
                    continue block24;
                }
            }
            break;
        }
        Stream stream = this.configs.stream();
        Object object5 = hl;
        block25: while (true) {
            switch ((int)object5) {
                case 432532479: {
                    object5 = aq.divw("djnq", diwi(int ), (int)167) - aq.divw("djnp", diwi(int ), (int)166);
                    continue block25;
                }
                case 951322661: {
                    break block25;
                }
            }
            break;
        }
        Predicate<ap> predicate = arg_0 -> aq.lambda$find$0(string, arg_0);
        while (true) {
            long l4;
            Object object6;
            if ((object6 = (l4 = hl - aq.divw("djnr", diwi(int ), (int)168)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object6 == aq.divw("djns", divp(int ), (int)239)) break;
            object6 = aq.divw("djnt", divp(int ), (int)240);
        }
        Stream<ap> stream2 = stream.filter(predicate);
        while (true) {
            long l5;
            Object object7;
            if ((object7 = (l5 = hl - aq.divw("djnu", diwi(int ), (int)169)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object7 == aq.divw("djnv", divp(int ), (int)241)) break;
            object7 = aq.divw("djnw", divp(int ), (int)242);
        }
        Optional<ap> optional = stream2.findFirst();
        while (true) {
            long l6;
            Object object8;
            if ((object8 = (l6 = hl - aq.divw("djnx", diwi(int ), (int)170)) == 0L ? 0 : (l6 < 0L ? -1 : 1)) == false) continue;
            if (object8 == aq.divw("djny", divp(int ), (int)243)) {
                return optional.orElse(null);
            }
            object8 = aq.divw("djnz", divp(int ), (int)244);
        }
    }

    public static /* synthetic */ CallSite divw(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Exception decompiling
     */
    public void init() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 10[SWITCH]
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

    private static /* synthetic */ void djqf() {
        aq.diwk[0] = 350593765238445963L;
        aq.diwk[1] = 8590917870419013056L;
        aq.diwk[2] = 4627315719156434088L;
        aq.diwk[3] = -8203715803467983580L;
        aq.diwk[4] = -2371308867503125098L;
        aq.diwk[5] = 6740582951817153547L;
        aq.diwk[6] = -6549474786361034111L;
        aq.diwk[7] = -5314867018389421733L;
        aq.diwk[8] = 1463400641344364816L;
        aq.diwk[9] = -8891825248943465017L;
        aq.diwk[10] = 2626157295128353709L;
        aq.diwk[11] = 6818429580315015045L;
        aq.diwk[12] = -8574301579319265271L;
        aq.diwk[13] = 2475827075721044934L;
        aq.diwk[14] = 4040276597822889374L;
        aq.diwk[15] = -573576939193763133L;
        aq.diwk[16] = 8019432789399157229L;
        aq.diwk[17] = -8581387758787190483L;
        aq.diwk[18] = -7671511212063183495L;
        aq.diwk[19] = 8066519980087104464L;
        aq.diwk[20] = 8429853163089235672L;
        aq.diwk[21] = -5358425893671403476L;
        aq.diwk[22] = -7449572777248456753L;
        aq.diwk[23] = 6988526530121745737L;
        aq.diwk[24] = 7865224817645309303L;
        aq.diwk[25] = -8182762059094859606L;
        aq.diwk[26] = -8945766636065342705L;
        aq.diwk[27] = -4581983904491713421L;
        aq.diwk[28] = 5276681351490704014L;
        aq.diwk[29] = -1851737606759876910L;
        aq.diwk[30] = -8741911273632151280L;
        aq.diwk[31] = 2230514327535574967L;
        aq.diwk[32] = -2228792106996710037L;
        aq.diwk[33] = 2797394134809568959L;
        aq.diwk[34] = -6734896807684795135L;
        aq.diwk[35] = -3567200222506623610L;
        aq.diwk[36] = -4312802132193078095L;
        aq.diwk[37] = 96401730914812339L;
        aq.diwk[38] = -677072036952420761L;
        aq.diwk[39] = -866219851689561820L;
        aq.diwk[40] = 6419838626938399297L;
        aq.diwk[41] = 1202461105209553514L;
        aq.diwk[42] = 8065283442567467717L;
        aq.diwk[43] = 818059840114893373L;
        aq.diwk[44] = 2363196536195083204L;
        aq.diwk[45] = 4118039778489506637L;
        aq.diwk[46] = 6929767063070364850L;
        aq.diwk[47] = 788562065564087155L;
        aq.diwk[48] = -85768423302045991L;
        aq.diwk[49] = 3104376502373752565L;
        aq.diwk[50] = -5258611120193029183L;
        aq.diwk[51] = 9084204686842669163L;
        aq.diwk[52] = -5705228531570574172L;
        aq.diwk[53] = 4015382316125886829L;
        aq.diwk[54] = -4320891137972428453L;
        aq.diwk[55] = -8074932384302192518L;
        aq.diwk[56] = -3503442158162535989L;
        aq.diwk[57] = 4690500023980313149L;
        aq.diwk[58] = 375227208271457938L;
        aq.diwk[59] = -3043432660276394723L;
        aq.diwk[60] = 7614473748098505902L;
        aq.diwk[61] = 77788261745467401L;
        aq.diwk[62] = 7669862146928261336L;
        aq.diwk[63] = -654640449087005198L;
        aq.diwk[64] = 5199538645569522392L;
        aq.diwk[65] = -4249933343143957860L;
        aq.diwk[66] = -2712006525979063986L;
        aq.diwk[67] = -2892955444472969411L;
        aq.diwk[68] = -1883158730571313984L;
        aq.diwk[69] = 5952809787399652923L;
        aq.diwk[70] = 1438361964528910254L;
        aq.diwk[71] = -625933588299086446L;
        aq.diwk[72] = 2432193748388993052L;
        aq.diwk[73] = -3211835147591458527L;
        aq.diwk[74] = 8752094211287775530L;
        aq.diwk[75] = -8311570001241601636L;
        aq.diwk[76] = 2080459087579342659L;
        aq.diwk[77] = 2156303125594678921L;
        aq.diwk[78] = -491457617614490073L;
        aq.diwk[79] = -5381158403840920523L;
        aq.diwk[80] = 4616242071812827555L;
        aq.diwk[81] = 4192770813755868360L;
        aq.diwk[82] = 4109365600758375918L;
        aq.diwk[83] = -4142246355790650109L;
        aq.diwk[84] = -6861531060525835916L;
        aq.diwk[85] = 861547152010555328L;
        aq.diwk[86] = 2198559899116731749L;
        aq.diwk[87] = 6997198250292544285L;
        aq.diwk[88] = -5487850050491147369L;
        aq.diwk[89] = 6535902977002249159L;
        aq.diwk[90] = -6814403246839457338L;
        aq.diwk[91] = -7499453534772169355L;
        aq.diwk[92] = 7916563275291634487L;
        aq.diwk[93] = 32662874891493518L;
        aq.diwk[94] = -5108052773458392580L;
        aq.diwk[95] = 2375625517158975715L;
        aq.diwk[96] = 5000019694235617245L;
        aq.diwk[97] = -753763044903179698L;
        aq.diwk[98] = -7961092540427753921L;
        aq.diwk[99] = 2122266479320043368L;
    }

    static {
        divr = new int[276];
        divu = new int[276];
        aq.djpz();
        aq.djqa();
        aq.djqb();
        aq.djqc();
        aq.djqd();
        aq.djqe();
        diwk = new long[191];
        diwo = new long[191];
        aq.djqf();
        aq.djqg();
        aq.djqh();
        aq.djqi();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static aq getInstance() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = aq.hl - aq.divw("diwq", diwi(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == aq.divw("diws", divp(int ), (int)5)) break;
            v0 /* !! */  = (long)aq.divw("diwu", divp(int ), (int)6);
        }
        var2 = aq.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = aq.hl - aq.divw("diww", diwi(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == aq.divw("diwy", divp(int ), (int)7)) break;
            v1 /* !! */  = (long)aq.divw("dixa", divp(int ), (int)8);
        }
        var1_1 /* !! */  = aq.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = aq.hl - aq.divw("dixf", diwi(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == aq.divw("dixh", divp(int ), (int)9)) break;
            v2 /* !! */  = (long)aq.divw("dixi", divp(int ), (int)10);
        }
        var0_2 = aq.a;
        if (var2) {
            throw null;
lbl21:
            // 5 sources

            return null;
        }
        if (var0_2) ** GOTO lbl21
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** GOTO lbl21
                v3 /* !! */  = aq.hl;
                if (true) ** GOTO lbl32
                block25: while (true) {
                    v3 /* !! */  = (long)(v4 - aq.divw("dixl", diwi(int ), (int)3));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1369401855: {
                            v4 = aq.divw("dixm", diwi(int ), (int)4);
                            continue block25;
                        }
                        case -730213967: {
                            v4 = aq.divw("dixn", diwi(int ), (int)5);
                            continue block25;
                        }
                        case 951322661: {
                            break block25;
                        }
                    }
                    break;
                }
                if (aq.instance != null) ** GOTO lbl63
                if (var0_2 || var0_2) ** GOTO lbl21
                v5 /* !! */  = aq.hl;
                if (true) ** GOTO lbl47
                block26: while (true) {
                    v5 /* !! */  = (long)(v6 - aq.divw("dixo", diwi(int ), (int)6));
lbl47:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -971157042: {
                            v6 = aq.divw("dixv", diwi(int ), (int)7);
                            continue block26;
                        }
                        case 951322661: {
                            break block26;
                        }
                        case 2022228002: {
                            v6 = aq.divw("dixw", diwi(int ), (int)8);
                            continue block26;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = aq.hl - aq.divw("dixy", diwi(int ), (int)9)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == aq.divw("dixz", divp(int ), (int)11)) break;
                    v7 /* !! */  = (long)aq.divw("diya", divp(int ), (int)12);
                }
                new aq();
                if (var0_2) ** GOTO lbl21
lbl63:
                // 2 sources

                if (!var0_2 && !var0_2) ** break;
                ** continue;
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = aq.hl - aq.divw("diyc", diwi(int ), (int)10)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == aq.divw("diye", divp(int ), (int)13)) break;
                    v8 /* !! */  = (long)aq.divw("diyk", divp(int ), (int)14);
                }
                return aq.instance;
            }
lbl71:
            // 3 sources

            case 0: {
                var1_1 /* !! */  = (int)aq.divw("diyl", divp(int ), (int)15);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl102
            }
lbl76:
            // 3 sources

            case 1: {
                var1_1 /* !! */  = (int)aq.divw("diym", divp(int ), (int)16);
                if (!var2) ** GOTO lbl71
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)aq.divw("diyn", divp(int ), (int)17);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl98
            }
lbl85:
            // 2 sources

            case 3: {
                do {
                    var1_1 /* !! */  = (int)aq.divw("diyo", divp(int ), (int)18);
                } while (!var2);
                throw null;
            }
            case 4: {
                var1_1 /* !! */  = (int)aq.divw("diyp", divp(int ), (int)19);
                if (!var2) ** GOTO lbl85
                throw null;
            }
            case 5: {
                var1_1 /* !! */  = (int)aq.divw("diyq", divp(int ), (int)20);
                if (!var2) ** GOTO lbl76
                throw null;
            }
lbl98:
            // 2 sources

            case 6: {
                var1_1 /* !! */  = (int)aq.divw("diyr", divp(int ), (int)21);
                if (!var2) ** GOTO lbl71
                throw null;
            }
lbl102:
            // 2 sources

            case 7: {
                var1_1 /* !! */  = (int)aq.divw("diyt", divp(int ), (int)22);
                if (!var2) ** GOTO lbl76
                throw null;
            }
            case 8: 
        }
        do {
            var1_1 /* !! */  = (int)aq.divw("diyu", divp(int ), (int)23);
        } while (!var2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setActiveConfigName(String var1_1) {
        v0 /* !! */  = aq.hl;
        if (true) ** GOTO lbl5
        block34: while (true) {
            v0 /* !! */  = (long)(v1 - aq.divw("djlf", diwi(int ), (int)134));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1918038950: {
                    v1 = aq.divw("djlg", diwi(int ), (int)135);
                    continue block34;
                }
                case -1278199638: {
                    v1 = aq.divw("djlh", diwi(int ), (int)136);
                    continue block34;
                }
                case 951322661: {
                    break block34;
                }
                case 1337112020: {
                    v1 = aq.divw("djli", diwi(int ), (int)137);
                    continue block34;
                }
            }
            break;
        }
        var4_2 = aq.c;
        v2 /* !! */  = aq.hl;
        if (true) ** GOTO lbl22
        block35: while (true) {
            v2 /* !! */  = (long)(aq.divw("djlk", diwi(int ), (int)139) - aq.divw("djlj", diwi(int ), (int)138));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 951322661: {
                    break block35;
                }
                case 1435424114: {
                    continue block35;
                }
            }
            break;
        }
        var3_3 /* !! */  = aq.b;
        v3 /* !! */  = aq.hl;
        if (true) ** GOTO lbl32
        block36: while (true) {
            v3 /* !! */  = (long)(v4 - aq.divw("djll", diwi(int ), (int)140));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1290182556: {
                    v4 = aq.divw("djlm", diwi(int ), (int)141);
                    continue block36;
                }
                case -37996961: {
                    v4 = aq.divw("djln", diwi(int ), (int)142);
                    continue block36;
                }
                case 951322661: {
                    break block36;
                }
                case 1170705745: {
                    v4 = aq.divw("djlo", diwi(int ), (int)143);
                    continue block36;
                }
            }
            break;
        }
        var2_4 = aq.a;
        if (var4_2) {
            throw null;
lbl47:
            // 4 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl47
        v5 /* !! */  = aq.hl;
        if (true) ** GOTO lbl54
        block38: while (true) {
            v5 /* !! */  = (long)(aq.divw("djlq", diwi(int ), (int)145) - aq.divw("djlp", diwi(int ), (int)144));
lbl54:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -273478256: {
                    continue block38;
                }
                case 951322661: {
                    break block38;
                }
            }
            break;
        }
        this.loadConfigList();
        if (var2_4 || var2_4) ** GOTO lbl47
        v6 /* !! */  = aq.hl;
        if (true) ** GOTO lbl65
        block39: while (true) {
            v6 /* !! */  = (long)(aq.divw("djls", diwi(int ), (int)147) - aq.divw("djlr", diwi(int ), (int)146));
lbl65:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1959777151: {
                    continue block39;
                }
                case 951322661: {
                    break block39;
                }
            }
            break;
        }
        v7 = ac.sanitizeConfigName(var1_1);
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_0 = aq.hl - aq.divw("djlt", diwi(int ), (int)148)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == aq.divw("djlu", divp(int ), (int)209)) break;
            v8 /* !! */  = (long)aq.divw("djlv", divp(int ), (int)210);
        }
        v9 = this.find(v7);
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_1 = aq.hl - aq.divw("djlw", diwi(int ), (int)149)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == aq.divw("djlx", divp(int ), (int)211)) break;
            v10 /* !! */  = (long)aq.divw("djly", divp(int ), (int)212);
        }
        this.activeConfig = v9;
        if (var2_4) ** GOTO lbl47
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)aq.divw("djlz", divp(int ), (int)213);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl111
            }
lbl95:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)aq.divw("djma", divp(int ), (int)214);
                if (!var4_2) break;
                throw null;
            }
lbl99:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)aq.divw("djmb", divp(int ), (int)215);
                if (!var4_2) break;
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)aq.divw("djmc", divp(int ), (int)216);
                if (!var4_2) ** GOTO lbl95
                throw null;
            }
lbl107:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)aq.divw("djmd", divp(int ), (int)217);
                if (!var4_2) break;
                throw null;
            }
lbl111:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)aq.divw("djme", divp(int ), (int)218);
                if (!var4_2) ** GOTO lbl107
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)aq.divw("djmf", divp(int ), (int)219);
                if (!var4_2) ** GOTO lbl99
                throw null;
            }
            case 7: 
        }
        do {
            var3_3 /* !! */  = (int)aq.divw("djmg", divp(int ), (int)220);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void djqg() {
        aq.diwk[100] = -3963120432103670127L;
        aq.diwk[101] = -2887243804638702703L;
        aq.diwk[102] = 5809361905460739364L;
        aq.diwk[103] = -4292441062977005861L;
        aq.diwk[104] = -8525591313275043420L;
        aq.diwk[105] = 3614034719595646939L;
        aq.diwk[106] = -304120076638469339L;
        aq.diwk[107] = 6075395104807871369L;
        aq.diwk[108] = -9131425573919963778L;
        aq.diwk[109] = 5370373102522069370L;
        aq.diwk[110] = 7418426911716603045L;
        aq.diwk[111] = 8538473739140286732L;
        aq.diwk[112] = 1602254990942946488L;
        aq.diwk[113] = 2422728656624956185L;
        aq.diwk[114] = -8719625144148155940L;
        aq.diwk[115] = -4191930608513359966L;
        aq.diwk[116] = 1913849041786225182L;
        aq.diwk[117] = 687843495014520967L;
        aq.diwk[118] = -8569714331409797886L;
        aq.diwk[119] = -2864019795382308705L;
        aq.diwk[120] = -3038212753867799381L;
        aq.diwk[121] = 9212850718210677095L;
        aq.diwk[122] = 4301819909947649197L;
        aq.diwk[123] = -4886192537265946127L;
        aq.diwk[124] = -5243344498562678184L;
        aq.diwk[125] = -2745720553568205512L;
        aq.diwk[126] = -6672506441705507699L;
        aq.diwk[127] = -6547699583946447837L;
        aq.diwk[128] = 8815075880724488196L;
        aq.diwk[129] = 4076062140299148479L;
        aq.diwk[130] = 4820780568456488425L;
        aq.diwk[131] = -8962313484485940375L;
        aq.diwk[132] = 5168288713636345664L;
        aq.diwk[133] = -7951283418492288850L;
        aq.diwk[134] = -313569200638241416L;
        aq.diwk[135] = 8320497706354806924L;
        aq.diwk[136] = 7574655782242653360L;
        aq.diwk[137] = -1703685041360971460L;
        aq.diwk[138] = -1557349807032048753L;
        aq.diwk[139] = -1131091151523992178L;
        aq.diwk[140] = -4928827903380915267L;
        aq.diwk[141] = 6756630313322056434L;
        aq.diwk[142] = 3100452057699619883L;
        aq.diwk[143] = -6551935171643277133L;
        aq.diwk[144] = -5688796233225780643L;
        aq.diwk[145] = 4932074120781034644L;
        aq.diwk[146] = 1448644462525851599L;
        aq.diwk[147] = -35330324448648322L;
        aq.diwk[148] = -1163580053943802986L;
        aq.diwk[149] = -4281198894973823477L;
        aq.diwk[150] = -968911278884224338L;
        aq.diwk[151] = 198972052787920397L;
        aq.diwk[152] = 1023010921246057936L;
        aq.diwk[153] = 5097039649386393975L;
        aq.diwk[154] = 1599259695927261276L;
        aq.diwk[155] = -7157322252097925529L;
        aq.diwk[156] = 4021540260884482666L;
        aq.diwk[157] = -2655728740023509870L;
        aq.diwk[158] = 8334042522475339328L;
        aq.diwk[159] = -5271873416696523282L;
        aq.diwk[160] = 7428909817127959604L;
        aq.diwk[161] = 5171744260648921363L;
        aq.diwk[162] = -8285335410623946905L;
        aq.diwk[163] = -1929596449832354692L;
        aq.diwk[164] = -7383940651572377891L;
        aq.diwk[165] = -5465390360759628058L;
        aq.diwk[166] = -6175043134337518476L;
        aq.diwk[167] = 7404113012793159804L;
        aq.diwk[168] = -6510706889654514802L;
        aq.diwk[169] = -8454289740540377400L;
        aq.diwk[170] = -7765798694043197650L;
        aq.diwk[171] = -2455735299887235220L;
        aq.diwk[172] = 8240425804699637818L;
        aq.diwk[173] = 9032372919473939531L;
        aq.diwk[174] = -5579357696618676388L;
        aq.diwk[175] = 2873285935946092122L;
        aq.diwk[176] = 330094874583369434L;
        aq.diwk[177] = 3024490839750331663L;
        aq.diwk[178] = 542954016550658171L;
        aq.diwk[179] = 1867669569543981005L;
        aq.diwk[180] = 7402695037933715810L;
        aq.diwk[181] = 923360867438226623L;
        aq.diwk[182] = 6518447250532654699L;
        aq.diwk[183] = 996409845229881693L;
        aq.diwk[184] = 8917503089265056252L;
        aq.diwk[185] = -6703889642581915559L;
        aq.diwk[186] = -1288199423285560833L;
        aq.diwk[187] = 2278630585126524620L;
        aq.diwk[188] = -6668863417334547016L;
        aq.diwk[189] = 3739090514586291032L;
        aq.diwk[190] = -3269191826596186751L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void loadConfigList() {
        block81: {
            block84: {
                block83: {
                    block82: {
                        var10_1 = aq.c;
                        var9_2 /* !! */  = aq.b;
                        var8_3 = aq.a;
                        if (var10_1) {
                            throw null;
lbl6:
                            // 18 sources

                            return;
                        }
                        if (var8_3 || var8_3) ** GOTO lbl6
                        if (this.activeConfig != null) break block82;
                        if (var8_3) ** GOTO lbl6
                        v0 = null;
                        if (var10_1) {
                            throw null;
                        }
                        break block83;
                    }
                    if (var8_3 || var8_3) ** GOTO lbl6
                    v0 = var1_4 = this.activeConfig.getName();
                }
                if (var8_3 || var8_3) ** GOTO lbl6
                this.configs.clear();
                if (var8_3 || var8_3) ** GOTO lbl6
                var2_5 = aa.getInstance();
                if (var8_3 || var8_3) ** GOTO lbl6
                if (var2_5 != null) break block84;
                if (var8_3 || var8_3) ** GOTO lbl6
                this.activeConfig = null;
                if (var8_3 || var8_3) ** GOTO lbl6
                return;
            }
            if (var8_3 || var8_3) ** GOTO lbl6
            var3_6 = var2_5.listNamedConfigs().iterator();
            if (var8_3) ** GOTO lbl6
            do {
                if (var8_3 || var8_3) ** GOTO lbl6
                if (!var3_6.hasNext()) break block81;
                if (var8_3) ** GOTO lbl6
                var4_7 = var3_6.next();
                if (var8_3 || var8_3) ** GOTO lbl6
                var5_8 = ac.getNamedConfigFile(var4_7);
                if (var8_3 || var8_3) ** GOTO lbl6
                var6_9 = aq.lastModified(var5_8);
                if (var8_3 || var8_3) ** GOTO lbl6
                this.configs.add(new ap(var4_7, "Local", var5_8.getFileName().toString(), var6_9, var6_9));
                if (var8_3 || var8_3) ** GOTO lbl6
            } while (!var10_1);
            throw null;
        }
        if (var8_3 || var8_3) ** GOTO lbl6
        if (var1_4 == null) {
            v1 = null;
            if (var10_1) {
                throw null;
            }
        } else {
            v1 = this.activeConfig = this.find(var1_4);
        }
        if (var9_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var8_3 && !var8_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var9_2 /* !! */  = (int)aq.divw("djah", divp(int ), (int)47);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl67:
            // 2 sources

            case 1: {
                var9_2 /* !! */  = (int)aq.divw("djai", divp(int ), (int)48);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl77
            }
lbl72:
            // 2 sources

            case 2: {
                var9_2 /* !! */  = (int)aq.divw("djaj", divp(int ), (int)49);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl77:
            // 3 sources

            case 3: {
                var9_2 /* !! */  = (int)aq.divw("djak", divp(int ), (int)50);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl182
            }
lbl82:
            // 2 sources

            case 4: {
                var9_2 /* !! */  = (int)aq.divw("djal", divp(int ), (int)51);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl123
            }
            case 5: {
                var9_2 /* !! */  = (int)aq.divw("djam", divp(int ), (int)52);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl103
            }
            case 6: {
                var9_2 /* !! */  = (int)aq.divw("djan", divp(int ), (int)53);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl136
            }
lbl97:
            // 2 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_2 /* !! */  = (int)aq.divw("djao", divp(int ), (int)54);
                    if (var10_1) {
                        throw null;
                    }
                    ** GOTO lbl155
                    break;
                }
            }
lbl103:
            // 3 sources

            case 8: {
                var9_2 /* !! */  = (int)aq.divw("djap", divp(int ), (int)55);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 9: {
                var9_2 /* !! */  = (int)aq.divw("djaq", divp(int ), (int)56);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl113:
            // 2 sources

            case 10: {
                var9_2 /* !! */  = (int)aq.divw("djar", divp(int ), (int)57);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl182
            }
            case 11: {
                var9_2 /* !! */  = (int)aq.divw("djat", divp(int ), (int)58);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl160
            }
lbl123:
            // 4 sources

            case 12: {
                var9_2 /* !! */  = (int)aq.divw("djau", divp(int ), (int)59);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl128:
            // 2 sources

            case 13: {
                var9_2 /* !! */  = (int)aq.divw("djav", divp(int ), (int)60);
                if (!var10_1) ** GOTO lbl113
                throw null;
            }
            case 14: {
                var9_2 /* !! */  = (int)aq.divw("djaw", divp(int ), (int)61);
                if (!var10_1) ** GOTO lbl77
                throw null;
            }
lbl136:
            // 3 sources

            case 15: {
                var9_2 /* !! */  = (int)aq.divw("djax", divp(int ), (int)62);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl199
            }
            case 16: {
                var9_2 /* !! */  = (int)aq.divw("djay", divp(int ), (int)63);
                if (!var10_1) ** GOTO lbl123
                throw null;
            }
lbl145:
            // 2 sources

            case 17: {
                var9_2 /* !! */  = (int)aq.divw("djaz", divp(int ), (int)64);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 18: {
                var9_2 /* !! */  = (int)aq.divw("djba", divp(int ), (int)65);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl155:
            // 2 sources

            case 19: {
                var9_2 /* !! */  = (int)aq.divw("djbb", divp(int ), (int)66);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl194
            }
lbl160:
            // 3 sources

            case 20: {
                var9_2 /* !! */  = (int)aq.divw("djbc", divp(int ), (int)67);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl223
            }
            case 21: {
                var9_2 /* !! */  = (int)aq.divw("djbd", divp(int ), (int)68);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl182
            }
lbl170:
            // 2 sources

            case 22: {
                var9_2 /* !! */  = (int)aq.divw("djbe", divp(int ), (int)69);
                if (!var10_1) ** GOTO lbl160
                throw null;
            }
            case 23: {
                var9_2 /* !! */  = (int)aq.divw("djbf", divp(int ), (int)70);
                if (!var10_1) ** GOTO lbl67
                throw null;
            }
            case 24: {
                var9_2 /* !! */  = (int)aq.divw("djbg", divp(int ), (int)71);
                if (!var10_1) ** GOTO lbl97
                throw null;
            }
lbl182:
            // 4 sources

            case 25: {
                var9_2 /* !! */  = (int)aq.divw("djbh", divp(int ), (int)72);
                if (!var10_1) ** GOTO lbl72
                throw null;
            }
            case 26: {
                var9_2 /* !! */  = (int)aq.divw("djbi", divp(int ), (int)73);
                if (!var10_1) ** GOTO lbl145
                throw null;
            }
lbl190:
            // 2 sources

            case 27: {
                var9_2 /* !! */  = (int)aq.divw("djbj", divp(int ), (int)74);
                if (!var10_1) ** GOTO lbl170
                throw null;
            }
lbl194:
            // 2 sources

            case 28: {
                var9_2 /* !! */  = (int)aq.divw("djbk", divp(int ), (int)75);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl199:
            // 2 sources

            case 29: {
                var9_2 /* !! */  = (int)aq.divw("djbl", divp(int ), (int)76);
                if (!var10_1) ** GOTO lbl123
                throw null;
            }
            case 30: {
                var9_2 /* !! */  = (int)aq.divw("djbn", divp(int ), (int)77);
                if (!var10_1) ** GOTO lbl136
                throw null;
            }
lbl207:
            // 2 sources

            case 31: {
                var9_2 /* !! */  = (int)aq.divw("djbo", divp(int ), (int)78);
                if (!var10_1) ** GOTO lbl103
                throw null;
            }
lbl211:
            // 5 sources

            case 32: {
                var9_2 /* !! */  = (int)aq.divw("djbp", divp(int ), (int)79);
                if (!var10_1) ** GOTO lbl128
                throw null;
            }
            case 33: {
                var9_2 /* !! */  = (int)aq.divw("djbq", divp(int ), (int)80);
                if (!var10_1) break;
                throw null;
            }
lbl219:
            // 3 sources

            case 34: {
                var9_2 /* !! */  = (int)aq.divw("djbr", divp(int ), (int)81);
                if (!var10_1) ** GOTO lbl82
                throw null;
            }
lbl223:
            // 3 sources

            case 35: {
                var9_2 /* !! */  = (int)aq.divw("djbs", divp(int ), (int)82);
                if (!var10_1) ** GOTO lbl211
                throw null;
            }
            case 36: 
        }
        var9_2 /* !! */  = (int)aq.divw("djbt", divp(int ), (int)83);
        ** while (!var10_1)
lbl230:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void djqh() {
        aq.diwo[0] = -8758176650973673700L;
        aq.diwo[1] = 202863084474223912L;
        aq.diwo[2] = -6539912689119396563L;
        aq.diwo[3] = -1946615496435742558L;
        aq.diwo[4] = 7217540910343287815L;
        aq.diwo[5] = 5269870131166261407L;
        aq.diwo[6] = -5865469013539772640L;
        aq.diwo[7] = -4172512386626201933L;
        aq.diwo[8] = -2441439739071748079L;
        aq.diwo[9] = 7847263388901934836L;
        aq.diwo[10] = 4383565681581641558L;
        aq.diwo[11] = 4989159001041498870L;
        aq.diwo[12] = 8297897603889647303L;
        aq.diwo[13] = -6970321177452840025L;
        aq.diwo[14] = -8141962788925298959L;
        aq.diwo[15] = 3496719216774666621L;
        aq.diwo[16] = 151951397897799950L;
        aq.diwo[17] = 1911707561049916766L;
        aq.diwo[18] = -4781901673677072482L;
        aq.diwo[19] = -2198782340475268097L;
        aq.diwo[20] = 4800172058865571814L;
        aq.diwo[21] = 6893411213984069557L;
        aq.diwo[22] = -8956033047191525032L;
        aq.diwo[23] = 5088599567529012485L;
        aq.diwo[24] = -7997053944379801516L;
        aq.diwo[25] = -6541982838955659150L;
        aq.diwo[26] = -7876609246446035847L;
        aq.diwo[27] = -7837739800777197845L;
        aq.diwo[28] = -3891568833711011908L;
        aq.diwo[29] = 5684545370096908507L;
        aq.diwo[30] = 5506786550501248757L;
        aq.diwo[31] = 6764962760769776719L;
        aq.diwo[32] = -8648563547592281636L;
        aq.diwo[33] = 952138992660255488L;
        aq.diwo[34] = 6454898620073829521L;
        aq.diwo[35] = 976634152993721336L;
        aq.diwo[36] = 5833543011668252948L;
        aq.diwo[37] = 2603245867291277559L;
        aq.diwo[38] = -4989305234789885998L;
        aq.diwo[39] = -6667214866181735494L;
        aq.diwo[40] = -7545404599422513589L;
        aq.diwo[41] = -6930857393899160085L;
        aq.diwo[42] = 2759222824266511227L;
        aq.diwo[43] = 631073371626257247L;
        aq.diwo[44] = 8682085901530726070L;
        aq.diwo[45] = 7584566058852822974L;
        aq.diwo[46] = -3871252211847619828L;
        aq.diwo[47] = 4917360744272671780L;
        aq.diwo[48] = -6747879535321248013L;
        aq.diwo[49] = 9150247086499165638L;
        aq.diwo[50] = -6349540251226089837L;
        aq.diwo[51] = 4099892297053296432L;
        aq.diwo[52] = -6300321882440446875L;
        aq.diwo[53] = 900645395105129395L;
        aq.diwo[54] = 4579928135824997248L;
        aq.diwo[55] = -6567814346515863892L;
        aq.diwo[56] = -4696294942448382027L;
        aq.diwo[57] = 3594616914925157443L;
        aq.diwo[58] = 8148380725249377879L;
        aq.diwo[59] = -3066145084053326397L;
        aq.diwo[60] = -5835607732857986255L;
        aq.diwo[61] = -6898293204398645168L;
        aq.diwo[62] = 31182190653864355L;
        aq.diwo[63] = -6982861542520702269L;
        aq.diwo[64] = 280529236959884678L;
        aq.diwo[65] = -7615508967514777235L;
        aq.diwo[66] = 1465746672194228400L;
        aq.diwo[67] = 4128347582735102470L;
        aq.diwo[68] = -6865360091813265958L;
        aq.diwo[69] = 4063170439171583246L;
        aq.diwo[70] = 4019376034546260355L;
        aq.diwo[71] = -3246475757122542434L;
        aq.diwo[72] = 3824797543948182741L;
        aq.diwo[73] = -7682044948592810415L;
        aq.diwo[74] = 8485333102088087631L;
        aq.diwo[75] = -1257184486206565128L;
        aq.diwo[76] = 9094068953042582676L;
        aq.diwo[77] = 151246940266598260L;
        aq.diwo[78] = 3031483505018911184L;
        aq.diwo[79] = -3654235337234989277L;
        aq.diwo[80] = -5975596228102307383L;
        aq.diwo[81] = -8741957468535948788L;
        aq.diwo[82] = 2139993109210133972L;
        aq.diwo[83] = 8084686350836068524L;
        aq.diwo[84] = -8811014873012403955L;
        aq.diwo[85] = 6538413829305776964L;
        aq.diwo[86] = -955345582633846262L;
        aq.diwo[87] = 6356449389586523090L;
        aq.diwo[88] = -7271702672472871417L;
        aq.diwo[89] = -3806267341598732021L;
        aq.diwo[90] = 7047986326292556725L;
        aq.diwo[91] = 4262402306610260592L;
        aq.diwo[92] = 6197070409386547358L;
        aq.diwo[93] = -4229552289345660218L;
        aq.diwo[94] = -2535663820214593306L;
        aq.diwo[95] = -7153134965855425789L;
        aq.diwo[96] = 934051565771967332L;
        aq.diwo[97] = 3078729792917671504L;
        aq.diwo[98] = -5637170040775812152L;
        aq.diwo[99] = 1890827712759478931L;
    }

    private static /* synthetic */ void djqd() {
        aq.divu[100] = 852257540;
        aq.divu[101] = 390072779;
        aq.divu[102] = 1820351800;
        aq.divu[103] = -2100822101;
        aq.divu[104] = 1208135808;
        aq.divu[105] = -1814914937;
        aq.divu[106] = 92726924;
        aq.divu[107] = -1212015422;
        aq.divu[108] = 1162984991;
        aq.divu[109] = 1128004882;
        aq.divu[110] = -939764783;
        aq.divu[111] = 1294865466;
        aq.divu[112] = -552600247;
        aq.divu[113] = -1469866510;
        aq.divu[114] = 2083488698;
        aq.divu[115] = -1777748218;
        aq.divu[116] = 2078375007;
        aq.divu[117] = -1065968151;
        aq.divu[118] = 1940996942;
        aq.divu[119] = 876360658;
        aq.divu[120] = -1274622692;
        aq.divu[121] = -104082716;
        aq.divu[122] = 382932887;
        aq.divu[123] = 776115488;
        aq.divu[124] = 1730421997;
        aq.divu[125] = 1557841763;
        aq.divu[126] = 583205013;
        aq.divu[127] = -1930447982;
        aq.divu[128] = 1093121386;
        aq.divu[129] = -492318403;
        aq.divu[130] = 1377687890;
        aq.divu[131] = -451039643;
        aq.divu[132] = -1854996318;
        aq.divu[133] = -1088874275;
        aq.divu[134] = 1131346846;
        aq.divu[135] = 1741987642;
        aq.divu[136] = -1489828257;
        aq.divu[137] = 1866793836;
        aq.divu[138] = -1533050804;
        aq.divu[139] = -1099099560;
        aq.divu[140] = -543244700;
        aq.divu[141] = -888584659;
        aq.divu[142] = -1205849888;
        aq.divu[143] = 372798791;
        aq.divu[144] = -496804859;
        aq.divu[145] = 1618781663;
        aq.divu[146] = -1636049638;
        aq.divu[147] = 679640791;
        aq.divu[148] = -1382731816;
        aq.divu[149] = 175679843;
        aq.divu[150] = -2114117702;
        aq.divu[151] = 589656590;
        aq.divu[152] = 891845658;
        aq.divu[153] = 172345985;
        aq.divu[154] = 52279672;
        aq.divu[155] = -1558223984;
        aq.divu[156] = -173541217;
        aq.divu[157] = 1130257972;
        aq.divu[158] = -965663944;
        aq.divu[159] = -1880276836;
        aq.divu[160] = 1826860104;
        aq.divu[161] = 829961098;
        aq.divu[162] = 360260470;
        aq.divu[163] = 1281859463;
        aq.divu[164] = -913674720;
        aq.divu[165] = 1299618856;
        aq.divu[166] = -171890074;
        aq.divu[167] = 860672075;
        aq.divu[168] = -1324703149;
        aq.divu[169] = -1343698607;
        aq.divu[170] = -64439694;
        aq.divu[171] = 1078122039;
        aq.divu[172] = 1901127849;
        aq.divu[173] = -1534684990;
        aq.divu[174] = 1658074154;
        aq.divu[175] = 623560417;
        aq.divu[176] = -630804499;
        aq.divu[177] = -1432771008;
        aq.divu[178] = 1296404701;
        aq.divu[179] = 1627037328;
        aq.divu[180] = 916447220;
        aq.divu[181] = 2052245782;
        aq.divu[182] = 2101917139;
        aq.divu[183] = -1246287752;
        aq.divu[184] = -1932411736;
        aq.divu[185] = -1767714320;
        aq.divu[186] = -183945639;
        aq.divu[187] = -91907780;
        aq.divu[188] = -866891709;
        aq.divu[189] = -402900215;
        aq.divu[190] = 1962517276;
        aq.divu[191] = -2116170316;
        aq.divu[192] = 1232803001;
        aq.divu[193] = -153916957;
        aq.divu[194] = -236058466;
        aq.divu[195] = 363807864;
        aq.divu[196] = -1070215182;
        aq.divu[197] = 489325652;
        aq.divu[198] = -436616061;
        aq.divu[199] = -56769788;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean lambda$find$0(String var0, ap var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = aq.hl - aq.divw("djpf", diwi(int ), (int)184)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == aq.divw("djpg", divp(int ), (int)263)) break;
            v0 /* !! */  = (long)aq.divw("djph", divp(int ), (int)264);
        }
        var4_2 = aq.c;
        while (true) {
            block24: {
                if ((v1 /* !! */  = (cfr_temp_2 = aq.hl - aq.divw("djpi", diwi(int ), (int)185)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  != aq.divw("djpj", divp(int ), (int)265)) break block24;
                var3_3 /* !! */  = aq.b;
                v2 /* !! */  = aq.hl;
                if (true) ** GOTO lbl18
            }
            v1 /* !! */  = (long)aq.divw("djpk", divp(int ), (int)266);
        }
        block13: while (true) {
            v2 /* !! */  = (long)(v3 - aq.divw("djpl", diwi(int ), (int)186));
lbl18:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1475183615: {
                    v3 = aq.divw("djpm", diwi(int ), (int)187);
                    continue block13;
                }
                case -50977435: {
                    v3 = aq.divw("djpn", diwi(int ), (int)188);
                    continue block13;
                }
                case 951322661: {
                    break block13;
                }
            }
            break;
        }
        var2_4 = aq.a;
        if (var4_2) {
            throw null;
        }
        if (var2_4 != false) return (boolean)aq.divw("djpo", divp(int ), (int)267);
        if (var2_4 != false) return (boolean)aq.divw("djpo", divp(int ), (int)267);
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block14: while (true) {
            block25: {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_3 = aq.hl - aq.divw("djpp", diwi(int ), (int)189)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v4 /* !! */  == aq.divw("djpq", divp(int ), (int)268)) {
                                v5 = var1_1.getName();
                                ** break;
                            }
                            v4 /* !! */  = (long)aq.divw("djpr", divp(int ), (int)269);
                        }
                    }
                    case 2: {
                        var3_3 /* !! */  = (int)aq.divw("djpx", divp(int ), (int)274);
                        cfr_temp_0 = 1;
                        if (var4_2) {
                            throw null;
                        }
                        break block25;
                    }
                    case 3: {
                        var3_3 /* !! */  = (int)aq.divw("djpy", divp(int ), (int)275);
                        if (var4_2) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
lbl55:
                    // 1 sources

                    while (true) {
                        if ((v6 /* !! */  = (cfr_temp_4 = aq.hl - aq.divw("djps", diwi(int ), (int)190)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v6 /* !! */  == aq.divw("djpt", divp(int ), (int)270)) {
                            return v5.equalsIgnoreCase(var0);
                        }
                        v6 /* !! */  = (long)aq.divw("djpu", divp(int ), (int)271);
                    }
                    case 0: lbl-1000:
                    // 2 sources

                    {
                        var3_3 /* !! */  = (int)aq.divw("djpv", divp(int ), (int)272);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 1: 
                }
                ** GOTO lbl70
            }
            do {
                if (true) continue block14;
lbl70:
                // 2 sources

                var3_3 /* !! */  = (int)aq.divw("djpw", divp(int ), (int)273);
                cfr_temp_0 = 0;
            } while (!var4_2);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void deleteConfig(ap var1_1) {
        block111: {
            block110: {
                block109: {
                    v0 /* !! */  = aq.hl;
                    if (true) ** GOTO lbl5
                    block67: while (true) {
                        v0 /* !! */  = (long)(aq.divw("djgx", diwi(int ), (int)83) - aq.divw("djgw", diwi(int ), (int)82));
lbl5:
                        // 2 sources

                        switch ((int)v0 /* !! */ ) {
                            case 116624689: {
                                continue block67;
                            }
                            case 951322661: {
                                break block67;
                            }
                        }
                        break;
                    }
                    var5_2 = aq.c;
                    while (true) {
                        if ((v1 /* !! */  = (cfr_temp_0 = aq.hl - aq.divw("djgy", diwi(int ), (int)84)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                        if (v1 /* !! */  == aq.divw("djgz", divp(int ), (int)149)) break;
                        v1 /* !! */  = (long)aq.divw("djha", divp(int ), (int)150);
                    }
                    var4_3 /* !! */  = aq.b;
                    while (true) {
                        if ((v2 /* !! */  = (cfr_temp_1 = aq.hl - aq.divw("djhb", diwi(int ), (int)85)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v2 /* !! */  == aq.divw("djhc", divp(int ), (int)151)) break;
                        v2 /* !! */  = (long)aq.divw("djhd", divp(int ), (int)152);
                    }
                    var3_4 = aq.a;
                    if (var5_2) {
                        throw null;
lbl25:
                        // 14 sources

                        return;
                    }
                    if (var3_4 || var3_4) ** GOTO lbl25
                    while (true) {
                        if ((v3 /* !! */  = (cfr_temp_2 = aq.hl - aq.divw("djhe", diwi(int ), (int)86)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v3 /* !! */  == aq.divw("djhg", divp(int ), (int)153)) break;
                        v3 /* !! */  = (long)aq.divw("djhh", divp(int ), (int)154);
                    }
                    var2_5 = aa.getInstance();
                    if (var3_4 || var3_4) ** GOTO lbl25
                    if (var2_5 == null) break block109;
                    if (var3_4) ** GOTO lbl25
                    if (var1_1 == null) break block109;
                    if (var3_4) ** GOTO lbl25
                    v4 /* !! */  = aq.hl;
                    if (true) ** GOTO lbl43
                    block72: while (true) {
                        v4 /* !! */  = (long)(v5 - aq.divw("djhi", diwi(int ), (int)87));
lbl43:
                        // 2 sources

                        switch ((int)v4 /* !! */ ) {
                            case 406318345: {
                                v5 = aq.divw("djhj", diwi(int ), (int)88);
                                continue block72;
                            }
                            case 951322661: {
                                break block72;
                            }
                            case 1353704821: {
                                v5 = aq.divw("djhk", diwi(int ), (int)89);
                                continue block72;
                            }
                            case 1785965075: {
                                v5 = aq.divw("djhl", diwi(int ), (int)90);
                                continue block72;
                            }
                        }
                        break;
                    }
                    v6 = var1_1.getName();
                    while (true) {
                        if ((v7 /* !! */  = (cfr_temp_3 = aq.hl - aq.divw("djhm", diwi(int ), (int)91)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v7 /* !! */  == aq.divw("djhn", divp(int ), (int)155)) break;
                        v7 /* !! */  = (long)aq.divw("djho", divp(int ), (int)156);
                    }
                    if (var2_5.deleteNamed(v6)) break block110;
                    if (var3_4) ** GOTO lbl25
                }
                if (var3_4 || var3_4) ** GOTO lbl25
                v8 /* !! */  = aq.hl;
                if (true) ** GOTO lbl69
                block74: while (true) {
                    v8 /* !! */  = (long)(v9 - aq.divw("djhp", diwi(int ), (int)92));
lbl69:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -168388396: {
                            v9 = aq.divw("djhq", diwi(int ), (int)93);
                            continue block74;
                        }
                        case -37594571: {
                            v9 = aq.divw("djhr", diwi(int ), (int)94);
                            continue block74;
                        }
                        case 951322661: {
                            break block74;
                        }
                        case 1933053139: {
                            v9 = aq.divw("djhs", diwi(int ), (int)95);
                            continue block74;
                        }
                    }
                    break;
                }
                ai.error("UserConfig: Failed to delete config!");
                if (var3_4 || var3_4) ** GOTO lbl25
                return;
            }
            if (var3_4 || var3_4) ** GOTO lbl25
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_4 = aq.hl - aq.divw("djht", diwi(int ), (int)96)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == aq.divw("djhu", divp(int ), (int)157)) break;
                v10 /* !! */  = (long)aq.divw("djhv", divp(int ), (int)158);
            }
            if (this.activeConfig == null) break block111;
            if (var3_4) ** GOTO lbl25
            v11 /* !! */  = aq.hl;
            if (true) ** GOTO lbl97
            block76: while (true) {
                v11 /* !! */  = (long)(aq.divw("djhx", diwi(int ), (int)98) - aq.divw("djhw", diwi(int ), (int)97));
lbl97:
                // 2 sources

                switch ((int)v11 /* !! */ ) {
                    case 951322661: {
                        break block76;
                    }
                    case 1695519081: {
                        continue block76;
                    }
                }
                break;
            }
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_5 = aq.hl - aq.divw("djhy", diwi(int ), (int)99)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v12 /* !! */  == aq.divw("djhz", divp(int ), (int)159)) break;
                v12 /* !! */  = (long)aq.divw("djia", divp(int ), (int)160);
            }
            v13 = this.activeConfig.getName();
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_6 = aq.hl - aq.divw("djib", diwi(int ), (int)100)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  == aq.divw("djic", divp(int ), (int)161)) break;
                v14 /* !! */  = (long)aq.divw("djid", divp(int ), (int)162);
            }
            v15 = var1_1.getName();
            v16 /* !! */  = aq.hl;
            if (true) ** GOTO lbl118
            block79: while (true) {
                v16 /* !! */  = (long)(v17 - aq.divw("djie", diwi(int ), (int)101));
lbl118:
                // 2 sources

                switch ((int)v16 /* !! */ ) {
                    case -1872488683: {
                        v17 = aq.divw("djif", diwi(int ), (int)102);
                        continue block79;
                    }
                    case -175858248: {
                        v17 = aq.divw("djig", diwi(int ), (int)103);
                        continue block79;
                    }
                    case 951322661: {
                        break block79;
                    }
                }
                break;
            }
            if (!v13.equalsIgnoreCase(v15)) break block111;
            if (var3_4 || var3_4) ** GOTO lbl25
            v18 /* !! */  = aq.hl;
            if (true) ** GOTO lbl133
            block80: while (true) {
                v18 /* !! */  = (long)(v19 - aq.divw("djih", diwi(int ), (int)104));
lbl133:
                // 2 sources

                switch ((int)v18 /* !! */ ) {
                    case -1847361668: {
                        v19 = aq.divw("djii", diwi(int ), (int)105);
                        continue block80;
                    }
                    case -1789448577: {
                        v19 = aq.divw("djij", diwi(int ), (int)106);
                        continue block80;
                    }
                    case 951322661: {
                        break block80;
                    }
                }
                break;
            }
            this.activeConfig = null;
            if (var3_4) ** GOTO lbl25
        }
        if (var3_4 || var3_4) ** GOTO lbl25
        v20 /* !! */  = aq.hl;
        if (true) ** GOTO lbl150
        block81: while (true) {
            v20 /* !! */  = (long)(v21 - aq.divw("djik", diwi(int ), (int)107));
lbl150:
            // 2 sources

            switch ((int)v20 /* !! */ ) {
                case -2057867192: {
                    v21 = aq.divw("djil", diwi(int ), (int)108);
                    continue block81;
                }
                case -1054836303: {
                    v21 = aq.divw("djim", diwi(int ), (int)109);
                    continue block81;
                }
                case 951322661: {
                    break block81;
                }
            }
            break;
        }
        this.loadConfigList();
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4 || var3_4) ** GOTO lbl25
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_7 = aq.hl - aq.divw("djin", diwi(int ), (int)110)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == aq.divw("djio", divp(int ), (int)163)) break;
                    v22 /* !! */  = (long)aq.divw("djip", divp(int ), (int)164);
                }
                v23 = var1_1.getName();
                v24 /* !! */  = aq.hl;
                if (true) ** GOTO lbl174
                block83: while (true) {
                    v24 /* !! */  = (long)(aq.divw("djir", diwi(int ), (int)112) - aq.divw("djiq", diwi(int ), (int)111));
lbl174:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case 908065825: {
                            continue block83;
                        }
                        case 951322661: {
                            break block83;
                        }
                    }
                    break;
                }
                v25 = "UserConfig: Deleted config '" + v23 + "'";
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_8 = aq.hl - aq.divw("djis", diwi(int ), (int)113)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v26 /* !! */  == aq.divw("djit", divp(int ), (int)165)) break;
                    v26 /* !! */  = (long)aq.divw("djiu", divp(int ), (int)166);
                }
                ai.success(v25);
                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var4_3 /* !! */  = (int)aq.divw("djiv", divp(int ), (int)167);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl293
            }
            case 1: {
                var4_3 /* !! */  = (int)aq.divw("djiw", divp(int ), (int)168);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl199:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)aq.divw("djix", divp(int ), (int)169);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl257
                    break;
                }
            }
lbl205:
            // 3 sources

            case 3: {
                var4_3 /* !! */  = (int)aq.divw("djiy", divp(int ), (int)170);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl253
            }
            case 4: {
                var4_3 /* !! */  = (int)aq.divw("djiz", divp(int ), (int)171);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl253
            }
lbl215:
            // 3 sources

            case 5: {
                var4_3 /* !! */  = (int)aq.divw("djja", divp(int ), (int)172);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl280
            }
lbl220:
            // 2 sources

            case 6: {
                var4_3 /* !! */  = (int)aq.divw("djjb", divp(int ), (int)173);
                if (!var5_2) ** GOTO lbl205
                throw null;
            }
            case 7: {
                var4_3 /* !! */  = (int)aq.divw("djjc", divp(int ), (int)174);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl284
            }
lbl229:
            // 2 sources

            case 8: {
                var4_3 /* !! */  = (int)aq.divw("djjd", divp(int ), (int)175);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl293
            }
            case 9: {
                var4_3 /* !! */  = (int)aq.divw("djje", divp(int ), (int)176);
                if (!var5_2) ** GOTO lbl205
                throw null;
            }
lbl238:
            // 2 sources

            case 10: {
                var4_3 /* !! */  = (int)aq.divw("djjf", divp(int ), (int)177);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl276
            }
            case 11: {
                var4_3 /* !! */  = (int)aq.divw("djjg", divp(int ), (int)178);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl288
            }
            case 12: {
                var4_3 /* !! */  = (int)aq.divw("djjh", divp(int ), (int)179);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl257
            }
lbl253:
            // 3 sources

            case 13: {
                var4_3 /* !! */  = (int)aq.divw("djji", divp(int ), (int)180);
                if (!var5_2) ** GOTO lbl220
                throw null;
            }
lbl257:
            // 3 sources

            case 14: {
                var4_3 /* !! */  = (int)aq.divw("djjj", divp(int ), (int)181);
                if (!var5_2) ** GOTO lbl215
                throw null;
            }
            case 15: {
                var4_3 /* !! */  = (int)aq.divw("djjk", divp(int ), (int)182);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl276
            }
            case 16: {
                var4_3 /* !! */  = (int)aq.divw("djjl", divp(int ), (int)183);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl297
            }
            case 17: {
                var4_3 /* !! */  = (int)aq.divw("djjm", divp(int ), (int)184);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl284
            }
lbl276:
            // 3 sources

            case 18: {
                var4_3 /* !! */  = (int)aq.divw("djjn", divp(int ), (int)185);
                if (!var5_2) ** GOTO lbl238
                throw null;
            }
lbl280:
            // 3 sources

            case 19: {
                var4_3 /* !! */  = (int)aq.divw("djjo", divp(int ), (int)186);
                if (!var5_2) ** GOTO lbl215
                throw null;
            }
lbl284:
            // 3 sources

            case 20: {
                var4_3 /* !! */  = (int)aq.divw("djjp", divp(int ), (int)187);
                if (!var5_2) ** GOTO lbl280
                throw null;
            }
lbl288:
            // 4 sources

            case 21: {
                var4_3 /* !! */  = (int)aq.divw("djjq", divp(int ), (int)188);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl301
            }
lbl293:
            // 3 sources

            case 22: {
                var4_3 /* !! */  = (int)aq.divw("djjr", divp(int ), (int)189);
                if (!var5_2) ** GOTO lbl288
                throw null;
            }
lbl297:
            // 2 sources

            case 23: {
                var4_3 /* !! */  = (int)aq.divw("djjs", divp(int ), (int)190);
                if (!var5_2) ** GOTO lbl199
                throw null;
            }
lbl301:
            // 2 sources

            case 24: {
                var4_3 /* !! */  = (int)aq.divw("djjt", divp(int ), (int)191);
                if (!var5_2) ** GOTO lbl288
                throw null;
            }
            case 25: 
        }
        var4_3 /* !! */  = (int)aq.divw("djju", divp(int ), (int)192);
        ** while (!var5_2)
lbl308:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void djpz() {
        aq.divr[0] = -1703767378;
        aq.divr[1] = -965082305;
        aq.divr[2] = 1896586653;
        aq.divr[3] = 76413420;
        aq.divr[4] = -1538902180;
        aq.divr[5] = 1756598871;
        aq.divr[6] = 598138981;
        aq.divr[7] = -1182771134;
        aq.divr[8] = -1894040395;
        aq.divr[9] = -380972615;
        aq.divr[10] = -1501739515;
        aq.divr[11] = 1153190278;
        aq.divr[12] = 1925781540;
        aq.divr[13] = -1732798580;
        aq.divr[14] = 1245459963;
        aq.divr[15] = 1310811139;
        aq.divr[16] = 1786722375;
        aq.divr[17] = -726786143;
        aq.divr[18] = -733782447;
        aq.divr[19] = 1637127254;
        aq.divr[20] = -540642725;
        aq.divr[21] = 236879677;
        aq.divr[22] = -155760042;
        aq.divr[23] = -359884336;
        aq.divr[24] = 407459032;
        aq.divr[25] = 1529119900;
        aq.divr[26] = -1563921168;
        aq.divr[27] = 0x44408808;
        aq.divr[28] = 270809606;
        aq.divr[29] = -49171290;
        aq.divr[30] = -315031679;
        aq.divr[31] = 2045525338;
        aq.divr[32] = 1046919757;
        aq.divr[33] = -1622611979;
        aq.divr[34] = 251816703;
        aq.divr[35] = -52708619;
        aq.divr[36] = -40374889;
        aq.divr[37] = 1128691875;
        aq.divr[38] = -946186356;
        aq.divr[39] = 1033455952;
        aq.divr[40] = -929438221;
        aq.divr[41] = -1406993986;
        aq.divr[42] = 1488360383;
        aq.divr[43] = -637624489;
        aq.divr[44] = -669428646;
        aq.divr[45] = 804312191;
        aq.divr[46] = -794356718;
        aq.divr[47] = -692719571;
        aq.divr[48] = -184921092;
        aq.divr[49] = -253522977;
        aq.divr[50] = 71530826;
        aq.divr[51] = 1084148497;
        aq.divr[52] = 263651662;
        aq.divr[53] = 1434739647;
        aq.divr[54] = -588448421;
        aq.divr[55] = -1645842875;
        aq.divr[56] = -303012248;
        aq.divr[57] = -1805380659;
        aq.divr[58] = -105036736;
        aq.divr[59] = 476601112;
        aq.divr[60] = -297198359;
        aq.divr[61] = -1928976490;
        aq.divr[62] = 1308951772;
        aq.divr[63] = 1165037881;
        aq.divr[64] = -2006468295;
        aq.divr[65] = -2087940996;
        aq.divr[66] = -235357491;
        aq.divr[67] = 1278677880;
        aq.divr[68] = 1716277787;
        aq.divr[69] = 1208882945;
        aq.divr[70] = 228121027;
        aq.divr[71] = -889414781;
        aq.divr[72] = 1258666849;
        aq.divr[73] = -1343553995;
        aq.divr[74] = 885404322;
        aq.divr[75] = 621715381;
        aq.divr[76] = 1451770938;
        aq.divr[77] = 723424151;
        aq.divr[78] = 1028292885;
        aq.divr[79] = -537129392;
        aq.divr[80] = -1875833123;
        aq.divr[81] = 1237171205;
        aq.divr[82] = 1202213704;
        aq.divr[83] = 1454007292;
        aq.divr[84] = -1896398731;
        aq.divr[85] = -471727422;
        aq.divr[86] = 27646877;
        aq.divr[87] = -996111068;
        aq.divr[88] = 1089931288;
        aq.divr[89] = -2138503665;
        aq.divr[90] = 351358794;
        aq.divr[91] = -1831699473;
        aq.divr[92] = 578397447;
        aq.divr[93] = 1868452414;
        aq.divr[94] = 627774048;
        aq.divr[95] = 1974723939;
        aq.divr[96] = 81963644;
        aq.divr[97] = -2124806511;
        aq.divr[98] = 45717884;
        aq.divr[99] = 1762537335;
    }

    private static /* synthetic */ void djqi() {
        aq.diwo[100] = -7639774614001494627L;
        aq.diwo[101] = -228186992857133963L;
        aq.diwo[102] = 8880877373992585833L;
        aq.diwo[103] = 1171743861746584593L;
        aq.diwo[104] = 6688206822922200842L;
        aq.diwo[105] = -2707331526745011481L;
        aq.diwo[106] = 7977513488470766018L;
        aq.diwo[107] = -8669454856947066941L;
        aq.diwo[108] = 4829531060158132852L;
        aq.diwo[109] = 6612626242183430619L;
        aq.diwo[110] = -6261272074359523155L;
        aq.diwo[111] = -934043006525562086L;
        aq.diwo[112] = -3547242905780425258L;
        aq.diwo[113] = -7166689914526176710L;
        aq.diwo[114] = -656814675407668550L;
        aq.diwo[115] = 7915975671581849717L;
        aq.diwo[116] = 1990352609667452822L;
        aq.diwo[117] = -2303990904244184504L;
        aq.diwo[118] = 272976947713537771L;
        aq.diwo[119] = -5707106236082694877L;
        aq.diwo[120] = 6514527263037823849L;
        aq.diwo[121] = -2321719692320667012L;
        aq.diwo[122] = 6606080931339465543L;
        aq.diwo[123] = -70298705759727930L;
        aq.diwo[124] = 4038280357862500173L;
        aq.diwo[125] = -9182876134117352408L;
        aq.diwo[126] = 2896714751991484450L;
        aq.diwo[127] = -6780107134105696620L;
        aq.diwo[128] = -5741455140846800441L;
        aq.diwo[129] = -7134115537089224594L;
        aq.diwo[130] = -4935867191311387291L;
        aq.diwo[131] = -3586294967218784321L;
        aq.diwo[132] = -8084641727835213966L;
        aq.diwo[133] = -5695634804080266600L;
        aq.diwo[134] = -3702629216420379381L;
        aq.diwo[135] = 3072179906595060333L;
        aq.diwo[136] = -4604711327925775814L;
        aq.diwo[137] = -8256206658876684930L;
        aq.diwo[138] = 6970107373194354950L;
        aq.diwo[139] = -5273265881244459415L;
        aq.diwo[140] = -4906115243546286904L;
        aq.diwo[141] = -7256147499224598507L;
        aq.diwo[142] = -5506247020866949394L;
        aq.diwo[143] = -4505770616613610943L;
        aq.diwo[144] = -6880676406716813481L;
        aq.diwo[145] = 339083806759914493L;
        aq.diwo[146] = -1814896497538161183L;
        aq.diwo[147] = 5727658801344835931L;
        aq.diwo[148] = -1548104515459163841L;
        aq.diwo[149] = -3489618567097702641L;
        aq.diwo[150] = 3315276348921009050L;
        aq.diwo[151] = 622718554064373321L;
        aq.diwo[152] = -5617463052240162463L;
        aq.diwo[153] = -104986043141428324L;
        aq.diwo[154] = 4470977982823566070L;
        aq.diwo[155] = 5601624945786721109L;
        aq.diwo[156] = -648309863498713928L;
        aq.diwo[157] = -7396376325672528027L;
        aq.diwo[158] = 7168856754298587678L;
        aq.diwo[159] = -1780280126127610945L;
        aq.diwo[160] = -156302179443875691L;
        aq.diwo[161] = -970961641214706196L;
        aq.diwo[162] = 6228476406640791660L;
        aq.diwo[163] = 3400042044497035661L;
        aq.diwo[164] = 34020546807923083L;
        aq.diwo[165] = -2757991115889389750L;
        aq.diwo[166] = -9030084966545348849L;
        aq.diwo[167] = -203681341871683084L;
        aq.diwo[168] = 559455111818916738L;
        aq.diwo[169] = 2701623222223445068L;
        aq.diwo[170] = 8590401746488778858L;
        aq.diwo[171] = 5873296754176361828L;
        aq.diwo[172] = -1803899436302971412L;
        aq.diwo[173] = 131581018251060551L;
        aq.diwo[174] = 1897308265605384348L;
        aq.diwo[175] = 8420878521624398502L;
        aq.diwo[176] = -4813998569164403938L;
        aq.diwo[177] = 8212030987541187688L;
        aq.diwo[178] = 4285800927107998592L;
        aq.diwo[179] = -5745194050594865906L;
        aq.diwo[180] = 8422117314181799080L;
        aq.diwo[181] = 8312124552253509080L;
        aq.diwo[182] = -5806255319325614686L;
        aq.diwo[183] = -8225379655017511779L;
        aq.diwo[184] = 6078611667089604177L;
        aq.diwo[185] = -6753814683780098940L;
        aq.diwo[186] = -5992813784245279246L;
        aq.diwo[187] = -3649826644587572998L;
        aq.diwo[188] = -3111006389167433831L;
        aq.diwo[189] = -4895326230557487538L;
        aq.diwo[190] = -1791890373723765330L;
    }

    private static /* synthetic */ void djqe() {
        aq.divu[200] = 802844192;
        aq.divu[201] = -525428736;
        aq.divu[202] = -548746835;
        aq.divu[203] = -525547165;
        aq.divu[204] = -452186373;
        aq.divu[205] = 1531997761;
        aq.divu[206] = 20676904;
        aq.divu[207] = 1660235163;
        aq.divu[208] = 1414935545;
        aq.divu[209] = -726035010;
        aq.divu[210] = -1413214107;
        aq.divu[211] = -685627901;
        aq.divu[212] = 1420783953;
        aq.divu[213] = -90571161;
        aq.divu[214] = -906690261;
        aq.divu[215] = 2015395217;
        aq.divu[216] = -292991501;
        aq.divu[217] = 2076429009;
        aq.divu[218] = -998642626;
        aq.divu[219] = 1026633837;
        aq.divu[220] = -44186510;
        aq.divu[221] = 661454460;
        aq.divu[222] = -1532329666;
        aq.divu[223] = 221072638;
        aq.divu[224] = 356717633;
        aq.divu[225] = -708823973;
        aq.divu[226] = 1711859028;
        aq.divu[227] = -1154931166;
        aq.divu[228] = 734624756;
        aq.divu[229] = -2140159246;
        aq.divu[230] = 1182508583;
        aq.divu[231] = -1976078514;
        aq.divu[232] = 177016373;
        aq.divu[233] = 1540023402;
        aq.divu[234] = 331749050;
        aq.divu[235] = 213423592;
        aq.divu[236] = -261230872;
        aq.divu[237] = 1291217611;
        aq.divu[238] = 362729587;
        aq.divu[239] = -243004675;
        aq.divu[240] = 612141018;
        aq.divu[241] = 1933502886;
        aq.divu[242] = 1052411226;
        aq.divu[243] = 513122758;
        aq.divu[244] = 1735191738;
        aq.divu[245] = -1421276715;
        aq.divu[246] = -430193059;
        aq.divu[247] = 215470165;
        aq.divu[248] = -895989960;
        aq.divu[249] = -411120247;
        aq.divu[250] = -781243553;
        aq.divu[251] = 1762065972;
        aq.divu[252] = -30819172;
        aq.divu[253] = 163731305;
        aq.divu[254] = 924651536;
        aq.divu[255] = -1556625501;
        aq.divu[256] = 211746007;
        aq.divu[257] = -2055683030;
        aq.divu[258] = -2141182942;
        aq.divu[259] = -967049008;
        aq.divu[260] = -1188801922;
        aq.divu[261] = -1133119178;
        aq.divu[262] = 880608687;
        aq.divu[263] = 1086792740;
        aq.divu[264] = -1402275873;
        aq.divu[265] = 2139467631;
        aq.divu[266] = 511882936;
        aq.divu[267] = 424998797;
        aq.divu[268] = -1478132408;
        aq.divu[269] = 2030939964;
        aq.divu[270] = 1587899286;
        aq.divu[271] = -1327255413;
        aq.divu[272] = 1587266516;
        aq.divu[273] = -1200075817;
        aq.divu[274] = 1346008342;
        aq.divu[275] = -1260949901;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void loadConfig(ap var1_1) {
        block93: {
            block92: {
                v0 /* !! */  = aq.hl;
                if (true) ** GOTO lbl5
                block61: while (true) {
                    v0 /* !! */  = (long)(aq.divw("djei", diwi(int ), (int)54) - aq.divw("djeh", diwi(int ), (int)53));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -132734266: {
                            continue block61;
                        }
                        case 951322661: {
                            break block61;
                        }
                    }
                    break;
                }
                var5_2 = aq.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_0 = aq.hl - aq.divw("djej", diwi(int ), (int)55)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  == aq.divw("djek", divp(int ), (int)115)) break;
                    v1 /* !! */  = (long)aq.divw("djel", divp(int ), (int)116);
                }
                var4_3 /* !! */  = aq.b;
                v2 /* !! */  = aq.hl;
                if (true) ** GOTO lbl21
                block63: while (true) {
                    v2 /* !! */  = (long)(v3 - aq.divw("djem", diwi(int ), (int)56));
lbl21:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1011932289: {
                            v3 = aq.divw("djen", diwi(int ), (int)57);
                            continue block63;
                        }
                        case -211701386: {
                            v3 = aq.divw("djeo", diwi(int ), (int)58);
                            continue block63;
                        }
                        case 883688172: {
                            v3 = aq.divw("djep", diwi(int ), (int)59);
                            continue block63;
                        }
                        case 951322661: {
                            break block63;
                        }
                    }
                    break;
                }
                var3_4 = aq.a;
                if (var5_2) {
                    throw null;
lbl36:
                    // 11 sources

                    return;
                }
                if (var3_4 || var3_4) ** GOTO lbl36
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = aq.hl - aq.divw("djeq", diwi(int ), (int)60)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == aq.divw("djer", divp(int ), (int)117)) break;
                    v4 /* !! */  = (long)aq.divw("djes", divp(int ), (int)118);
                }
                var2_5 = aa.getInstance();
                if (var3_4 || var3_4) ** GOTO lbl36
                if (var2_5 == null) break block92;
                if (var3_4) ** GOTO lbl36
                if (var1_1 == null) break block92;
                if (var3_4) ** GOTO lbl36
                v5 /* !! */  = aq.hl;
                if (true) ** GOTO lbl54
                block66: while (true) {
                    v5 /* !! */  = (long)(aq.divw("djev", diwi(int ), (int)62) - aq.divw("djeu", diwi(int ), (int)61));
lbl54:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -239675335: {
                            continue block66;
                        }
                        case 951322661: {
                            break block66;
                        }
                    }
                    break;
                }
                v6 = var1_1.getName();
                v7 /* !! */  = aq.hl;
                if (true) ** GOTO lbl64
                block67: while (true) {
                    v7 /* !! */  = (long)(v8 - aq.divw("djew", diwi(int ), (int)63));
lbl64:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1540786979: {
                            v8 = aq.divw("djex", diwi(int ), (int)64);
                            continue block67;
                        }
                        case -515884923: {
                            v8 = aq.divw("djey", diwi(int ), (int)65);
                            continue block67;
                        }
                        case 951322661: {
                            break block67;
                        }
                    }
                    break;
                }
                if (var2_5.loadNamed(v6)) break block93;
                if (var3_4) ** GOTO lbl36
            }
            if (var3_4 || var3_4) ** GOTO lbl36
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_2 = aq.hl - aq.divw("djez", diwi(int ), (int)66)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == aq.divw("djfa", divp(int ), (int)119)) break;
                v9 /* !! */  = (long)aq.divw("djfb", divp(int ), (int)120);
            }
            ai.error("UserConfig: Failed to load config!");
            if (var3_4 || var3_4) ** GOTO lbl36
            return;
        }
        if (var3_4 || var3_4) ** GOTO lbl36
        v10 /* !! */  = aq.hl;
        if (true) ** GOTO lbl91
        block69: while (true) {
            v10 /* !! */  = (long)(v11 - aq.divw("djfc", diwi(int ), (int)67));
lbl91:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1380466176: {
                    v11 = aq.divw("djfd", diwi(int ), (int)68);
                    continue block69;
                }
                case -349396388: {
                    v11 = aq.divw("djfe", diwi(int ), (int)69);
                    continue block69;
                }
                case 951322661: {
                    break block69;
                }
                case 1788317506: {
                    v11 = aq.divw("djff", diwi(int ), (int)70);
                    continue block69;
                }
            }
            break;
        }
        this.activeConfig = var1_1;
        if (var3_4 || var3_4) ** GOTO lbl36
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_3 = aq.hl - aq.divw("djfg", diwi(int ), (int)71)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == aq.divw("djfh", divp(int ), (int)121)) break;
            v12 /* !! */  = (long)aq.divw("djfi", divp(int ), (int)122);
        }
        v13 = var1_1.getName();
        v14 /* !! */  = aq.hl;
        if (true) ** GOTO lbl115
        block71: while (true) {
            v14 /* !! */  = (long)(v15 - aq.divw("djfj", diwi(int ), (int)72));
lbl115:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -643614970: {
                    v15 = aq.divw("djfk", diwi(int ), (int)73);
                    continue block71;
                }
                case 951322661: {
                    break block71;
                }
                case 1529543480: {
                    v15 = aq.divw("djfm", diwi(int ), (int)74);
                    continue block71;
                }
                case 2071111611: {
                    v15 = aq.divw("djfn", diwi(int ), (int)75);
                    continue block71;
                }
            }
            break;
        }
        v16 = "UserConfig: Loaded config '" + v13 + "'";
        v17 /* !! */  = aq.hl;
        if (true) ** GOTO lbl132
        block72: while (true) {
            v17 /* !! */  = (long)(v18 - aq.divw("djfo", diwi(int ), (int)76));
lbl132:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case -2075631375: {
                    v18 = aq.divw("djfp", diwi(int ), (int)77);
                    continue block72;
                }
                case -874995575: {
                    v18 = aq.divw("djfq", diwi(int ), (int)78);
                    continue block72;
                }
                case 916904510: {
                    v18 = aq.divw("djfr", diwi(int ), (int)79);
                    continue block72;
                }
                case 951322661: {
                    break block72;
                }
            }
            break;
        }
        ai.success(v16);
        if (var3_4 || var3_4) ** GOTO lbl36
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_4 = aq.hl - aq.divw("djfs", diwi(int ), (int)80)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == aq.divw("djft", divp(int ), (int)123)) break;
                    v19 /* !! */  = (long)aq.divw("djfu", divp(int ), (int)124);
                }
                v20 = var1_1.getName();
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_5 = aq.hl - aq.divw("djfv", diwi(int ), (int)81)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == aq.divw("djfw", divp(int ), (int)125)) break;
                    v21 /* !! */  = (long)aq.divw("djfx", divp(int ), (int)126);
                }
                ee.config(v20);
                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return;
            }
lbl164:
            // 3 sources

            case 0: {
                var4_3 /* !! */  = (int)aq.divw("djfy", divp(int ), (int)127);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl169:
            // 4 sources

            case 1: {
                var4_3 /* !! */  = (int)aq.divw("djfz", divp(int ), (int)128);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl246
            }
lbl174:
            // 2 sources

            case 2: {
                var4_3 /* !! */  = (int)aq.divw("djga", divp(int ), (int)129);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl217
            }
            case 3: {
                var4_3 /* !! */  = (int)aq.divw("djgb", divp(int ), (int)130);
                if (!var5_2) ** GOTO lbl169
                throw null;
            }
lbl183:
            // 3 sources

            case 4: {
                var4_3 /* !! */  = (int)aq.divw("djgc", divp(int ), (int)131);
                if (!var5_2) ** GOTO lbl164
                throw null;
            }
lbl187:
            // 2 sources

            case 5: {
                var4_3 /* !! */  = (int)aq.divw("djgd", divp(int ), (int)132);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl238
            }
lbl192:
            // 3 sources

            case 6: {
                var4_3 /* !! */  = (int)aq.divw("djgf", divp(int ), (int)133);
                if (!var5_2) ** GOTO lbl183
                throw null;
            }
            case 7: {
                var4_3 /* !! */  = (int)aq.divw("djgg", divp(int ), (int)134);
                if (!var5_2) ** GOTO lbl192
                throw null;
            }
lbl200:
            // 2 sources

            case 8: {
                var4_3 /* !! */  = (int)aq.divw("djgh", divp(int ), (int)135);
                if (!var5_2) ** GOTO lbl169
                throw null;
            }
lbl204:
            // 4 sources

            case 9: {
                var4_3 /* !! */  = (int)aq.divw("djgi", divp(int ), (int)136);
                if (!var5_2) ** GOTO lbl183
                throw null;
            }
            case 10: {
                var4_3 /* !! */  = (int)aq.divw("djgj", divp(int ), (int)137);
                if (!var5_2) ** GOTO lbl164
                throw null;
            }
            case 11: {
                do {
                    var4_3 /* !! */  = (int)aq.divw("djgk", divp(int ), (int)138);
                } while (!var5_2);
                throw null;
            }
lbl217:
            // 2 sources

            case 12: {
                var4_3 /* !! */  = (int)aq.divw("djgl", divp(int ), (int)139);
                if (!var5_2) ** GOTO lbl200
                throw null;
            }
            case 13: {
                var4_3 /* !! */  = (int)aq.divw("djgm", divp(int ), (int)140);
                if (!var5_2) ** GOTO lbl174
                throw null;
            }
            case 14: {
                var4_3 /* !! */  = (int)aq.divw("djgn", divp(int ), (int)141);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl238
            }
            case 15: {
                var4_3 /* !! */  = (int)aq.divw("djgo", divp(int ), (int)142);
                if (!var5_2) ** GOTO lbl169
                throw null;
            }
lbl234:
            // 2 sources

            case 16: {
                var4_3 /* !! */  = (int)aq.divw("djgp", divp(int ), (int)143);
                if (!var5_2) ** GOTO lbl204
                throw null;
            }
lbl238:
            // 3 sources

            case 17: {
                var4_3 /* !! */  = (int)aq.divw("djgq", divp(int ), (int)144);
                if (!var5_2) ** GOTO lbl187
                throw null;
            }
            case 18: {
                var4_3 /* !! */  = (int)aq.divw("djgr", divp(int ), (int)145);
                if (!var5_2) ** GOTO lbl192
                throw null;
            }
lbl246:
            // 2 sources

            case 19: {
                var4_3 /* !! */  = (int)aq.divw("djgs", divp(int ), (int)146);
                if (!var5_2) ** GOTO lbl204
                throw null;
            }
            case 20: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)aq.divw("djgt", divp(int ), (int)147);
                    if (!var5_2) ** GOTO lbl234
                    throw null;
                }
            }
            case 21: 
        }
        var4_3 /* !! */  = (int)aq.divw("djgv", divp(int ), (int)148);
        ** while (!var5_2)
lbl258:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public ap getActiveConfig() {
        Object object = hl;
        boolean bl2 = true;
        block15: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - aq.divw("djkp", diwi(int ), (int)124);
            }
            switch ((int)object) {
                case -1895562306: {
                    callSite = aq.divw("djkq", diwi(int ), (int)125);
                    continue block15;
                }
                case -428656863: {
                    callSite = aq.divw("djkr", diwi(int ), (int)126);
                    continue block15;
                }
                case 951322661: {
                    break block15;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = hl - aq.divw("djks", diwi(int ), (int)127)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == aq.divw("djkt", divp(int ), (int)203)) break;
            object2 = aq.divw("djku", divp(int ), (int)204);
        }
        int n2 = b;
        Object object3 = hl;
        block17: while (true) {
            switch ((int)object3) {
                case -179428634: {
                    object3 = aq.divw("djkw", diwi(int ), (int)129) - aq.divw("djkv", diwi(int ), (int)128);
                    continue block17;
                }
                case 951322661: {
                    break block17;
                }
            }
            break;
        }
        boolean bl4 = a;
        if (bl3) {
            throw null;
        }
        if (bl4) return null;
        if (bl4) return null;
        Object object4 = hl;
        boolean bl5 = true;
        block18: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object4 = callSite - aq.divw("djkx", diwi(int ), (int)130);
            }
            switch ((int)object4) {
                case -1550618180: {
                    callSite = aq.divw("djky", diwi(int ), (int)131);
                    continue block18;
                }
                case -343955673: {
                    callSite = aq.divw("djkz", diwi(int ), (int)132);
                    continue block18;
                }
                case 951322661: {
                    return this.activeConfig;
                }
                case 1831025471: {
                    callSite = aq.divw("djla", diwi(int ), (int)133);
                    continue block18;
                }
            }
            break;
        }
        return this.activeConfig;
    }

    private static /* synthetic */ void djqc() {
        aq.divu[0] = -1703767377;
        aq.divu[1] = -965082309;
        aq.divu[2] = 1896586654;
        aq.divu[3] = 76413422;
        aq.divu[4] = -1538902180;
        aq.divu[5] = 1756598870;
        aq.divu[6] = -1618890947;
        aq.divu[7] = 1182771133;
        aq.divu[8] = -746248671;
        aq.divu[9] = 380972614;
        aq.divu[10] = 1693663569;
        aq.divu[11] = -1153190279;
        aq.divu[12] = 204477207;
        aq.divu[13] = 1732798579;
        aq.divu[14] = -1967018830;
        aq.divu[15] = 1310811136;
        aq.divu[16] = 1786722368;
        aq.divu[17] = -726786142;
        aq.divu[18] = -733782445;
        aq.divu[19] = 1637127251;
        aq.divu[20] = -540642724;
        aq.divu[21] = 236879677;
        aq.divu[22] = -155760045;
        aq.divu[23] = -359884332;
        aq.divu[24] = -407459033;
        aq.divu[25] = -771510603;
        aq.divu[26] = -1563921167;
        aq.divu[27] = 441328705;
        aq.divu[28] = -270809607;
        aq.divu[29] = -840771436;
        aq.divu[30] = 315031678;
        aq.divu[31] = 1788076052;
        aq.divu[32] = -1046919758;
        aq.divu[33] = -1524677522;
        aq.divu[34] = 251816697;
        aq.divu[35] = -52708610;
        aq.divu[36] = -40374891;
        aq.divu[37] = 1128691872;
        aq.divu[38] = -946186363;
        aq.divu[39] = 1033455960;
        aq.divu[40] = -929438220;
        aq.divu[41] = -1406993989;
        aq.divu[42] = 1488360377;
        aq.divu[43] = -637624484;
        aq.divu[44] = -669428655;
        aq.divu[45] = 804312191;
        aq.divu[46] = -794356706;
        aq.divu[47] = -692719580;
        aq.divu[48] = -184921098;
        aq.divu[49] = -253522979;
        aq.divu[50] = 71530821;
        aq.divu[51] = 1084148501;
        aq.divu[52] = 263651660;
        aq.divu[53] = 1434739638;
        aq.divu[54] = -588448445;
        aq.divu[55] = -1645842876;
        aq.divu[56] = -303012243;
        aq.divu[57] = -1805380631;
        aq.divu[58] = -105036708;
        aq.divu[59] = 476601108;
        aq.divu[60] = -297198346;
        aq.divu[61] = -1928976500;
        aq.divu[62] = 1308951805;
        aq.divu[63] = 1165037859;
        aq.divu[64] = -2006468318;
        aq.divu[65] = -2087941000;
        aq.divu[66] = -235357457;
        aq.divu[67] = 1278677862;
        aq.divu[68] = 1716277780;
        aq.divu[69] = 1208882954;
        aq.divu[70] = 228121034;
        aq.divu[71] = -889414766;
        aq.divu[72] = 1258666867;
        aq.divu[73] = -1343554008;
        aq.divu[74] = 885404327;
        aq.divu[75] = 621715389;
        aq.divu[76] = 1451770939;
        aq.divu[77] = 723424130;
        aq.divu[78] = 1028292889;
        aq.divu[79] = -537129403;
        aq.divu[80] = -1875833134;
        aq.divu[81] = 1237171226;
        aq.divu[82] = 1202213724;
        aq.divu[83] = 1454007280;
        aq.divu[84] = 1896398730;
        aq.divu[85] = -1064007000;
        aq.divu[86] = -27646878;
        aq.divu[87] = -1424316500;
        aq.divu[88] = -1089931289;
        aq.divu[89] = -707057483;
        aq.divu[90] = -351358795;
        aq.divu[91] = 1743271419;
        aq.divu[92] = 578397441;
        aq.divu[93] = 1868452411;
        aq.divu[94] = 627774059;
        aq.divu[95] = 1974723955;
        aq.divu[96] = 81963638;
        aq.divu[97] = -2124806525;
        aq.divu[98] = 45717887;
        aq.divu[99] = 1762537338;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void saveConfig(String var1_1) {
        block103: {
            block102: {
                v0 /* !! */  = aq.hl;
                if (true) ** GOTO lbl5
                block67: while (true) {
                    v0 /* !! */  = (long)(v1 - aq.divw("djbu", diwi(int ), (int)23));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1781274951: {
                            v1 = aq.divw("djbw", diwi(int ), (int)24);
                            continue block67;
                        }
                        case -57219373: {
                            v1 = aq.divw("djbx", diwi(int ), (int)25);
                            continue block67;
                        }
                        case 14594846: {
                            v1 = aq.divw("djby", diwi(int ), (int)26);
                            continue block67;
                        }
                        case 951322661: {
                            break block67;
                        }
                    }
                    break;
                }
                var6_2 = aq.c;
                v2 /* !! */  = aq.hl;
                if (true) ** GOTO lbl22
                block68: while (true) {
                    v2 /* !! */  = (long)(aq.divw("djca", diwi(int ), (int)28) - aq.divw("djbz", diwi(int ), (int)27));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -268822105: {
                            continue block68;
                        }
                        case 951322661: {
                            break block68;
                        }
                    }
                    break;
                }
                var5_3 /* !! */  = aq.b;
                v3 /* !! */  = aq.hl;
                if (true) ** GOTO lbl32
                block69: while (true) {
                    v3 /* !! */  = (long)(v4 - aq.divw("djcb", diwi(int ), (int)29));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -356916945: {
                            v4 = aq.divw("djcc", diwi(int ), (int)30);
                            continue block69;
                        }
                        case -42896697: {
                            v4 = aq.divw("djcd", diwi(int ), (int)31);
                            continue block69;
                        }
                        case 688487093: {
                            v4 = aq.divw("djce", diwi(int ), (int)32);
                            continue block69;
                        }
                        case 951322661: {
                            break block69;
                        }
                    }
                    break;
                }
                var4_4 = aq.a;
                if (var6_2) {
                    throw null;
lbl47:
                    // 11 sources

                    return;
                }
                if (var4_4 || var4_4) ** GOTO lbl47
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = aq.hl - aq.divw("djcf", diwi(int ), (int)33)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == aq.divw("djcg", divp(int ), (int)84)) break;
                    v5 /* !! */  = (long)aq.divw("djch", divp(int ), (int)85);
                }
                var2_5 = aa.getInstance();
                if (var4_4 || var4_4) ** GOTO lbl47
                if (var2_5 == null) break block102;
                if (var4_4) ** GOTO lbl47
                v6 /* !! */  = aq.hl;
                if (true) ** GOTO lbl63
                block72: while (true) {
                    v6 /* !! */  = (long)(v7 - aq.divw("djci", diwi(int ), (int)34));
lbl63:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1422859642: {
                            v7 = aq.divw("djcj", diwi(int ), (int)35);
                            continue block72;
                        }
                        case -425200416: {
                            v7 = aq.divw("djck", diwi(int ), (int)36);
                            continue block72;
                        }
                        case 684089060: {
                            v7 = aq.divw("djcl", diwi(int ), (int)37);
                            continue block72;
                        }
                        case 951322661: {
                            break block72;
                        }
                    }
                    break;
                }
                if (var2_5.saveNamed(var1_1)) break block103;
                if (var4_4) ** GOTO lbl47
            }
            if (var4_4 || var4_4) ** GOTO lbl47
            v8 /* !! */  = aq.hl;
            if (true) ** GOTO lbl83
            block73: while (true) {
                v8 /* !! */  = (long)(v9 - aq.divw("djcm", diwi(int ), (int)38));
lbl83:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case -1636316617: {
                        v9 = aq.divw("djco", diwi(int ), (int)39);
                        continue block73;
                    }
                    case 951322661: {
                        break block73;
                    }
                    case 1574324448: {
                        v9 = aq.divw("djcp", diwi(int ), (int)40);
                        continue block73;
                    }
                    case 1650237375: {
                        v9 = aq.divw("djcq", diwi(int ), (int)41);
                        continue block73;
                    }
                }
                break;
            }
            ai.error("UserConfig: Failed to save config!");
            if (var4_4 || var4_4) ** GOTO lbl47
            return;
        }
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4 || var4_4) ** GOTO lbl47
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_1 = aq.hl - aq.divw("djcr", diwi(int ), (int)42)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == aq.divw("djcs", divp(int ), (int)86)) break;
                    v10 /* !! */  = (long)aq.divw("djct", divp(int ), (int)87);
                }
                var3_6 = ac.sanitizeConfigName(var1_1);
                if (var4_4 || var4_4) ** GOTO lbl47
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_2 = aq.hl - aq.divw("djcu", diwi(int ), (int)43)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == aq.divw("djcv", divp(int ), (int)88)) break;
                    v11 /* !! */  = (long)aq.divw("djcw", divp(int ), (int)89);
                }
                this.loadConfigList();
                if (var4_4 || var4_4) ** GOTO lbl47
                v12 /* !! */  = aq.hl;
                if (true) ** GOTO lbl121
                block76: while (true) {
                    v12 /* !! */  = (long)(v13 - aq.divw("djcx", diwi(int ), (int)44));
lbl121:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1694713973: {
                            v13 = aq.divw("djcy", diwi(int ), (int)45);
                            continue block76;
                        }
                        case 951322661: {
                            break block76;
                        }
                        case 1040274806: {
                            v13 = aq.divw("djcz", diwi(int ), (int)46);
                            continue block76;
                        }
                    }
                    break;
                }
                v14 = this.find(var3_6);
                v15 /* !! */  = aq.hl;
                if (true) ** GOTO lbl135
                block77: while (true) {
                    v15 /* !! */  = (long)(aq.divw("djdc", diwi(int ), (int)48) - aq.divw("djda", diwi(int ), (int)47));
lbl135:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1555387313: {
                            continue block77;
                        }
                        case 951322661: {
                            break block77;
                        }
                    }
                    break;
                }
                this.activeConfig = v14;
                if (var4_4 || var4_4) ** GOTO lbl47
                v16 /* !! */  = aq.hl;
                if (true) ** GOTO lbl146
                block78: while (true) {
                    v16 /* !! */  = (long)(v17 - aq.divw("djdd", diwi(int ), (int)49));
lbl146:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1515139936: {
                            v17 = aq.divw("djde", diwi(int ), (int)50);
                            continue block78;
                        }
                        case 815418918: {
                            v17 = aq.divw("djdf", diwi(int ), (int)51);
                            continue block78;
                        }
                        case 951322661: {
                            break block78;
                        }
                    }
                    break;
                }
                v18 = "UserConfig: Saved config '" + var3_6 + "'";
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_3 = aq.hl - aq.divw("djdg", diwi(int ), (int)52)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == aq.divw("djdh", divp(int ), (int)90)) break;
                    v19 /* !! */  = (long)aq.divw("djdi", divp(int ), (int)91);
                }
                ai.success(v18);
                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
            }
lbl165:
            // 2 sources

            case 0: {
                var5_3 /* !! */  = (int)aq.divw("djdj", divp(int ), (int)92);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl218
            }
            case 1: {
                var5_3 /* !! */  = (int)aq.divw("djdk", divp(int ), (int)93);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl251
            }
lbl175:
            // 2 sources

            case 2: {
                var5_3 /* !! */  = (int)aq.divw("djdl", divp(int ), (int)94);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl255
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)aq.divw("djdm", divp(int ), (int)95);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl196
                    break;
                }
            }
            case 4: {
                var5_3 /* !! */  = (int)aq.divw("djdo", divp(int ), (int)96);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl196
            }
lbl191:
            // 2 sources

            case 5: {
                var5_3 /* !! */  = (int)aq.divw("djdp", divp(int ), (int)97);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl205
            }
lbl196:
            // 4 sources

            case 6: {
                var5_3 /* !! */  = (int)aq.divw("djdq", divp(int ), (int)98);
                if (!var6_2) ** GOTO lbl191
                throw null;
            }
            case 7: {
                var5_3 /* !! */  = (int)aq.divw("djdr", divp(int ), (int)99);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl205:
            // 3 sources

            case 8: {
                var5_3 /* !! */  = (int)aq.divw("djds", divp(int ), (int)100);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl241
            }
lbl210:
            // 2 sources

            case 9: {
                var5_3 /* !! */  = (int)aq.divw("djdt", divp(int ), (int)101);
                if (!var6_2) ** GOTO lbl165
                throw null;
            }
            case 10: {
                var5_3 /* !! */  = (int)aq.divw("djdu", divp(int ), (int)102);
                if (!var6_2) break;
                throw null;
            }
lbl218:
            // 2 sources

            case 11: {
                var5_3 /* !! */  = (int)aq.divw("djdv", divp(int ), (int)103);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl255
            }
lbl223:
            // 2 sources

            case 12: {
                var5_3 /* !! */  = (int)aq.divw("djdw", divp(int ), (int)104);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl237
            }
            case 13: {
                var5_3 /* !! */  = (int)aq.divw("djdx", divp(int ), (int)105);
                if (!var6_2) ** GOTO lbl196
                throw null;
            }
            case 14: {
                var5_3 /* !! */  = (int)aq.divw("djdy", divp(int ), (int)106);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl264
            }
lbl237:
            // 2 sources

            case 15: {
                var5_3 /* !! */  = (int)aq.divw("djdz", divp(int ), (int)107);
                if (!var6_2) ** GOTO lbl205
                throw null;
            }
lbl241:
            // 2 sources

            case 16: {
                var5_3 /* !! */  = (int)aq.divw("djea", divp(int ), (int)108);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl260
            }
            case 17: {
                do {
                    var5_3 /* !! */  = (int)aq.divw("djeb", divp(int ), (int)109);
                } while (!var6_2);
                throw null;
            }
lbl251:
            // 2 sources

            case 18: {
                var5_3 /* !! */  = (int)aq.divw("djec", divp(int ), (int)110);
                if (!var6_2) ** GOTO lbl175
                throw null;
            }
lbl255:
            // 3 sources

            case 19: {
                do {
                    var5_3 /* !! */  = (int)aq.divw("djed", divp(int ), (int)111);
                } while (!var6_2);
                throw null;
            }
lbl260:
            // 2 sources

            case 20: {
                var5_3 /* !! */  = (int)aq.divw("djee", divp(int ), (int)112);
                if (!var6_2) break;
                throw null;
            }
lbl264:
            // 2 sources

            case 21: {
                var5_3 /* !! */  = (int)aq.divw("djef", divp(int ), (int)113);
                if (!var6_2) ** GOTO lbl210
                throw null;
            }
            case 22: 
        }
        var5_3 /* !! */  = (int)aq.divw("djeg", divp(int ), (int)114);
        ** while (!var6_2)
lbl271:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long diwi(int n2) {
        return diwk[n2] ^ diwo[n2];
    }

    private static /* synthetic */ int divp(int n2) {
        return divr[n2] ^ divu[n2];
    }

    /*
     * Enabled aggressive block sorting
     */
    public void clearActiveConfig() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = hl - aq.divw("djmh", diwi(int ), (int)150)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == aq.divw("djmi", divp(int ), (int)221)) break;
            object = aq.divw("djmj", divp(int ), (int)222);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = hl - aq.divw("djmk", diwi(int ), (int)151)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == aq.divw("djml", divp(int ), (int)223)) break;
            object = aq.divw("djmm", divp(int ), (int)224);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = hl - aq.divw("djmn", diwi(int ), (int)152)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == aq.divw("djmo", divp(int ), (int)225)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = aq.divw("djmp", divp(int ), (int)226);
        }
        if (bl2 || bl2) return;
        while (true) {
            long l5;
            Object object;
            if ((object = (l5 = hl - aq.divw("djmq", diwi(int ), (int)153)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object == aq.divw("djmr", divp(int ), (int)227)) {
                this.activeConfig = null;
                if (bl2) return;
                break;
            }
            object = aq.divw("djms", divp(int ), (int)228);
        }
        if (bl2) {
            return;
        }
        if (n2 == 0) return;
        switch (n2) {
            default: {
                return;
            }
            case 2: {
                do {
                    CallSite callSite = aq.divw("djmv", divp(int ), (int)231);
                } while (!bl3);
                throw null;
            }
            case 3: {
                CallSite callSite = aq.divw("djmw", divp(int ), (int)232);
                if (bl3) {
                    throw null;
                }
            }
            case 1: {
                CallSite callSite = aq.divw("djmu", divp(int ), (int)230);
                if (bl3) {
                    throw null;
                }
            }
            case 0: {
                CallSite callSite = aq.divw("djmt", divp(int ), (int)229);
                if (bl3) {
                    throw null;
                }
            }
            case 4: {
                CallSite callSite = aq.divw("djmx", divp(int ), (int)233);
                if (!bl3) break;
                throw null;
            }
            case 5: 
        }
        do {
            CallSite callSite = aq.divw("djmy", divp(int ), (int)234);
        } while (!bl3);
        throw null;
    }

    private static /* synthetic */ void djqb() {
        aq.divr[200] = 802844194;
        aq.divr[201] = -525428735;
        aq.divr[202] = -548746833;
        aq.divr[203] = 525547164;
        aq.divr[204] = 1945477365;
        aq.divr[205] = 1531997760;
        aq.divr[206] = 20676904;
        aq.divr[207] = 1660235160;
        aq.divr[208] = 1414935546;
        aq.divr[209] = 726035009;
        aq.divr[210] = 1618115062;
        aq.divr[211] = 685627900;
        aq.divr[212] = -643052239;
        aq.divr[213] = -90571163;
        aq.divr[214] = -906690261;
        aq.divr[215] = 2015395222;
        aq.divr[216] = -292991501;
        aq.divr[217] = 2076429013;
        aq.divr[218] = -998642631;
        aq.divr[219] = 1026633833;
        aq.divr[220] = -44186510;
        aq.divr[221] = -661454461;
        aq.divr[222] = -760404140;
        aq.divr[223] = -221072639;
        aq.divr[224] = -1377847540;
        aq.divr[225] = -708823974;
        aq.divr[226] = -973060198;
        aq.divr[227] = -1154931165;
        aq.divr[228] = 617794483;
        aq.divr[229] = -2140159245;
        aq.divr[230] = 1182508583;
        aq.divr[231] = -1976078516;
        aq.divr[232] = 177016374;
        aq.divr[233] = 1540023402;
        aq.divr[234] = 331749048;
        aq.divr[235] = -213423593;
        aq.divr[236] = 1923594222;
        aq.divr[237] = -1291217612;
        aq.divr[238] = -1120673324;
        aq.divr[239] = -243004676;
        aq.divr[240] = 572846655;
        aq.divr[241] = 1933502887;
        aq.divr[242] = -429178139;
        aq.divr[243] = -513122759;
        aq.divr[244] = -1495390793;
        aq.divr[245] = -1421276716;
        aq.divr[246] = -430193059;
        aq.divr[247] = 215470167;
        aq.divr[248] = -895989958;
        aq.divr[249] = -411120248;
        aq.divr[250] = 1843875346;
        aq.divr[251] = 1762065973;
        aq.divr[252] = -2119427568;
        aq.divr[253] = -163731306;
        aq.divr[254] = 1199977086;
        aq.divr[255] = -1556625502;
        aq.divr[256] = 2014891518;
        aq.divr[257] = -2055683029;
        aq.divr[258] = -2141182943;
        aq.divr[259] = -967049008;
        aq.divr[260] = -1188801926;
        aq.divr[261] = -1133119180;
        aq.divr[262] = 880608683;
        aq.divr[263] = -1086792741;
        aq.divr[264] = 178412311;
        aq.divr[265] = -2139467632;
        aq.divr[266] = -1535091584;
        aq.divr[267] = 424998796;
        aq.divr[268] = -1478132407;
        aq.divr[269] = 817278013;
        aq.divr[270] = -1587899287;
        aq.divr[271] = -1572207749;
        aq.divr[272] = 1587266517;
        aq.divr[273] = -1200075819;
        aq.divr[274] = 1346008340;
        aq.divr[275] = -1260949901;
    }

    private static /* synthetic */ void djqa() {
        aq.divr[100] = 852257556;
        aq.divr[101] = 390072770;
        aq.divr[102] = 1820351804;
        aq.divr[103] = -2100822106;
        aq.divr[104] = 1208135818;
        aq.divr[105] = -1814914923;
        aq.divr[106] = 92726940;
        aq.divr[107] = -1212015414;
        aq.divr[108] = 1162984972;
        aq.divr[109] = 1128004893;
        aq.divr[110] = -939764800;
        aq.divr[111] = 1294865458;
        aq.divr[112] = -552600228;
        aq.divr[113] = -1469866499;
        aq.divr[114] = 2083488684;
        aq.divr[115] = 1777748217;
        aq.divr[116] = 1865632993;
        aq.divr[117] = -1065968152;
        aq.divr[118] = -604962014;
        aq.divr[119] = -876360659;
        aq.divr[120] = -643464226;
        aq.divr[121] = 104082715;
        aq.divr[122] = 167488216;
        aq.divr[123] = -776115489;
        aq.divr[124] = -499199462;
        aq.divr[125] = 1557841762;
        aq.divr[126] = 50438280;
        aq.divr[127] = -1930447984;
        aq.divr[128] = 1093121382;
        aq.divr[129] = -492318412;
        aq.divr[130] = 1377687891;
        aq.divr[131] = -451039636;
        aq.divr[132] = -1854996304;
        aq.divr[133] = -1088874282;
        aq.divr[134] = 1131346847;
        aq.divr[135] = 1741987646;
        aq.divr[136] = -1489828273;
        aq.divr[137] = 1866793830;
        aq.divr[138] = -1533050803;
        aq.divr[139] = -1099099553;
        aq.divr[140] = -543244693;
        aq.divr[141] = -888584666;
        aq.divr[142] = -1205849868;
        aq.divr[143] = 372798792;
        aq.divr[144] = -496804843;
        aq.divr[145] = 1618781644;
        aq.divr[146] = -1636049649;
        aq.divr[147] = 679640772;
        aq.divr[148] = -1382731816;
        aq.divr[149] = -175679844;
        aq.divr[150] = 1341793598;
        aq.divr[151] = -589656591;
        aq.divr[152] = -231857030;
        aq.divr[153] = -172345986;
        aq.divr[154] = -493093790;
        aq.divr[155] = -1558223983;
        aq.divr[156] = -1932054806;
        aq.divr[157] = -1130257973;
        aq.divr[158] = 2038104122;
        aq.divr[159] = 1880276835;
        aq.divr[160] = 175221178;
        aq.divr[161] = -829961099;
        aq.divr[162] = 1878009271;
        aq.divr[163] = -1281859464;
        aq.divr[164] = 1918403244;
        aq.divr[165] = 1299618857;
        aq.divr[166] = -1990258204;
        aq.divr[167] = 860672074;
        aq.divr[168] = -1324703148;
        aq.divr[169] = -1343698601;
        aq.divr[170] = -64439683;
        aq.divr[171] = 1078122041;
        aq.divr[172] = 1901127843;
        aq.divr[173] = -1534684983;
        aq.divr[174] = 1658074159;
        aq.divr[175] = 623560421;
        aq.divr[176] = -630804502;
        aq.divr[177] = -1432771003;
        aq.divr[178] = 1296404699;
        aq.divr[179] = 1627037314;
        aq.divr[180] = 916447202;
        aq.divr[181] = 2052245777;
        aq.divr[182] = 2101917143;
        aq.divr[183] = -1246287745;
        aq.divr[184] = -1932411742;
        aq.divr[185] = -1767714311;
        aq.divr[186] = -183945651;
        aq.divr[187] = -91907786;
        aq.divr[188] = -866891689;
        aq.divr[189] = -402900221;
        aq.divr[190] = 1962517274;
        aq.divr[191] = -2116170318;
        aq.divr[192] = 1232803007;
        aq.divr[193] = -153916958;
        aq.divr[194] = 219962666;
        aq.divr[195] = -363807865;
        aq.divr[196] = -28433172;
        aq.divr[197] = 489325653;
        aq.divr[198] = 835570726;
        aq.divr[199] = -56769786;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public aq() {
        var2_1 /* !! */  = aq.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.configs = new ArrayList<ap>();
                aq.instance = this;
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)aq.divw("divy", divp(int ), (int)0);
                ** GOTO lbl14
            }
lbl12:
            // 3 sources

            case 1: {
                var2_1 /* !! */  = (int)aq.divw("diwb", divp(int ), (int)1);
            }
lbl14:
            // 3 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)aq.divw("diwc", divp(int ), (int)2);
                    ** GOTO lbl12
                    break;
                }
            }
            case 3: {
                var2_1 /* !! */  = (int)aq.divw("diwe", divp(int ), (int)3);
                ** GOTO lbl12
            }
            case 4: 
        }
        var2_1 /* !! */  = (int)aq.divw("diwf", divp(int ), (int)4);
        ** while (true)
    }
}

