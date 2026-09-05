/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_2338;

public final class na {
    private static Method getPathPositionsMethod;
    private static Method getCurrentPathMethod;
    private static final Map<String, Object> commandSnapshot;
    private static final String[] COMMAND_SETTINGS;
    private static long[] hrxa;
    public static final int b;
    private static Method getCustomGoalProcessMethod;
    private static final String[] AUTO_SETTINGS;
    private static Method getExecutorPositionMethod;
    private static Method cancelEverythingMethod;
    private static Constructor<?> goalNearConstructor;
    private static Method setGoalMethod;
    private static Method getPathingBehaviorMethod;
    private static Method getSettingsMethod;
    private static final Map<String, Object> settingsSnapshot;
    private static boolean checked;
    private static final long ov = 7951961779244057533L;
    private static Method getProviderMethod;
    public static final boolean a;
    private static int[] hrtx;
    private static Method getPrimaryBaritoneMethod;
    private static long[] hrwz;
    private static Method getExecutorPathMethod;
    private static boolean available;
    private static Method getInventoryPauserProcessMethod;
    private static int[] hrty;
    private static Method isPathingMethod;
    private static Method setGoalAndPathMethod;
    private static Method stationaryForInventoryMoveMethod;
    public static final boolean c;

    private static /* synthetic */ int hrtw(int n2) {
        return hrtx[n2] ^ hrty[n2];
    }

    /*
     * Exception decompiling
     */
    public static boolean goTo(class_2338 var0, int var1_1) {
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

    private static /* synthetic */ void htci() {
        na.hrxa[100] = -4799528998351440789L;
        na.hrxa[101] = 3182471310005328043L;
        na.hrxa[102] = -3109353090186848742L;
        na.hrxa[103] = 1164082377595177922L;
        na.hrxa[104] = -3173509138539691163L;
        na.hrxa[105] = -1695026599809618187L;
        na.hrxa[106] = -2017193828290405967L;
        na.hrxa[107] = -5973768909657453617L;
        na.hrxa[108] = 7288754566867429239L;
        na.hrxa[109] = -5086248013267657074L;
        na.hrxa[110] = -1765408613856984161L;
        na.hrxa[111] = 2515290747541135408L;
        na.hrxa[112] = 6417905438161071875L;
        na.hrxa[113] = -7593380031483892749L;
        na.hrxa[114] = 5932012723588580953L;
        na.hrxa[115] = 4421226349658089448L;
        na.hrxa[116] = -7454591084629603608L;
        na.hrxa[117] = -7803536840119392718L;
        na.hrxa[118] = -4679336554887212450L;
        na.hrxa[119] = -2486043377068541905L;
        na.hrxa[120] = 7547250795193996862L;
        na.hrxa[121] = 5112475424883315911L;
        na.hrxa[122] = -3490714716628249976L;
        na.hrxa[123] = 2074514611567710063L;
        na.hrxa[124] = -950875905744327353L;
        na.hrxa[125] = -3011750540145282150L;
        na.hrxa[126] = -5001989815549080285L;
        na.hrxa[127] = -5219632130970618352L;
        na.hrxa[128] = -6658354926174709249L;
        na.hrxa[129] = 3767696750420590302L;
        na.hrxa[130] = 6211198207253152268L;
        na.hrxa[131] = 1528176596333211514L;
        na.hrxa[132] = -6079971657440860528L;
        na.hrxa[133] = -184773052674185431L;
        na.hrxa[134] = 7039571481571060133L;
        na.hrxa[135] = 7149644896980765689L;
        na.hrxa[136] = -4631274004015199312L;
        na.hrxa[137] = 8700417241672161481L;
        na.hrxa[138] = 3438630019111639943L;
        na.hrxa[139] = -1548516079761323975L;
        na.hrxa[140] = -5021505392258609073L;
        na.hrxa[141] = 1069065086212431408L;
        na.hrxa[142] = -3515113997715277315L;
        na.hrxa[143] = 8278052817712412188L;
        na.hrxa[144] = 4372656316896400365L;
        na.hrxa[145] = 4897947685227678538L;
        na.hrxa[146] = 8038153259707938494L;
        na.hrxa[147] = 4308664665213085324L;
        na.hrxa[148] = -4705278838287918186L;
        na.hrxa[149] = 3391328909743148021L;
        na.hrxa[150] = -5181035206336050980L;
        na.hrxa[151] = 3047058503322056799L;
        na.hrxa[152] = 5450363615122188825L;
        na.hrxa[153] = -1462525160576571974L;
        na.hrxa[154] = -4655249213273143588L;
        na.hrxa[155] = -1559600113994335824L;
        na.hrxa[156] = -7037422731002525162L;
        na.hrxa[157] = 8455934302546562895L;
        na.hrxa[158] = 6176101849153940229L;
        na.hrxa[159] = 1962284557829119213L;
        na.hrxa[160] = 8500328373489858024L;
        na.hrxa[161] = -3151198590203028913L;
        na.hrxa[162] = 532978230419254384L;
        na.hrxa[163] = -5556139680302542571L;
        na.hrxa[164] = 3017624696275778138L;
        na.hrxa[165] = 1595215152621717655L;
        na.hrxa[166] = 6908697265095101934L;
        na.hrxa[167] = -417676024997922838L;
        na.hrxa[168] = -4348200920255394984L;
        na.hrxa[169] = 5246856417674085376L;
        na.hrxa[170] = 8924763322238968371L;
        na.hrxa[171] = -5131656915348189183L;
        na.hrxa[172] = -7620845375865630344L;
        na.hrxa[173] = -138192920397399635L;
        na.hrxa[174] = 8373564024304824509L;
        na.hrxa[175] = -2004369406324039257L;
        na.hrxa[176] = -7103400368289848748L;
        na.hrxa[177] = -1530089639963332761L;
        na.hrxa[178] = 2946073362688228435L;
        na.hrxa[179] = 1761674638588095448L;
        na.hrxa[180] = -7227663461466616627L;
        na.hrxa[181] = -5499700902758802816L;
        na.hrxa[182] = 1476119859707453216L;
        na.hrxa[183] = 8539050628668951648L;
        na.hrxa[184] = 6919815125607994715L;
        na.hrxa[185] = -3215496473652050712L;
        na.hrxa[186] = -757454071645239800L;
        na.hrxa[187] = 1415398526879096286L;
        na.hrxa[188] = -8258909203696240419L;
        na.hrxa[189] = -1382855522758937898L;
        na.hrxa[190] = 945718193610894815L;
        na.hrxa[191] = 5448610315495157582L;
        na.hrxa[192] = 3025016497263522608L;
        na.hrxa[193] = 7766104675940731440L;
        na.hrxa[194] = -1805182120719311738L;
        na.hrxa[195] = -5001973490145947712L;
        na.hrxa[196] = -7342918106738318834L;
        na.hrxa[197] = -2934263846333085783L;
        na.hrxa[198] = 1581869424290999811L;
        na.hrxa[199] = 3444068000147200037L;
    }

    /*
     * Exception decompiling
     */
    public static class_2338 nextPathNode(int var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
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
    public static boolean isPathing() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 34[SWITCH]
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

    public static /* synthetic */ CallSite hrtz(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ long hrwy(int n2) {
        return hrwz[n2] ^ hrxa[n2];
    }

    static {
        hrtx = new int[643];
        hrty = new int[643];
        na.htbq();
        na.htbr();
        na.htbs();
        na.htbt();
        na.htbu();
        na.htbv();
        na.htbw();
        na.htbx();
        na.htby();
        na.htbz();
        na.htca();
        na.htcb();
        na.htcc();
        na.htcd();
        hrwz = new long[227];
        hrxa = new long[227];
        na.htce();
        na.htcf();
        na.htcg();
        na.htch();
        na.htci();
        na.htcj();
        AUTO_SETTINGS = new String[]{"allowBreak", "allowPlace", "allowParkour", "allowSprint", "renderPath", "smoothLook", "smoothLookTicks"};
        settingsSnapshot = new HashMap<String, Object>();
        COMMAND_SETTINGS = new String[]{"prefixControl", "chatControl", "chatControlAnyway"};
        commandSnapshot = new HashMap<String, Object>();
    }

    private static /* synthetic */ void htcg() {
        na.hrwz[200] = 5590632053460504382L;
        na.hrwz[201] = 600171959344648281L;
        na.hrwz[202] = 4266805369733025093L;
        na.hrwz[203] = 2132503103028356907L;
        na.hrwz[204] = 893698691507005492L;
        na.hrwz[205] = -8190229955762836669L;
        na.hrwz[206] = 232093368681008162L;
        na.hrwz[207] = 5289692035830656411L;
        na.hrwz[208] = 6532170633133271217L;
        na.hrwz[209] = 8807022497133913703L;
        na.hrwz[210] = -8730395300762023528L;
        na.hrwz[211] = 7953043266214340249L;
        na.hrwz[212] = -3880010627573859855L;
        na.hrwz[213] = -7706866417233681054L;
        na.hrwz[214] = -356677596976660168L;
        na.hrwz[215] = -8386439345589258634L;
        na.hrwz[216] = -6280391833915175711L;
        na.hrwz[217] = 4388791502706534201L;
        na.hrwz[218] = -1491125668427911785L;
        na.hrwz[219] = 48531191361549471L;
        na.hrwz[220] = -8779000166097074867L;
        na.hrwz[221] = 8545528141793595595L;
        na.hrwz[222] = -2280155679967270987L;
        na.hrwz[223] = -3394944893881161999L;
        na.hrwz[224] = 3500105678230553038L;
        na.hrwz[225] = -4967746233873677581L;
        na.hrwz[226] = 4476400294285994123L;
    }

    /*
     * Exception decompiling
     */
    public static void stop() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 31[SWITCH]
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
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static void restoreSnapshot(Object var0) throws Exception {
        block85: {
            while (true) {
                block87: {
                    if ((v0 /* !! */  = (cfr_temp_1 = na.ov - na.hrtz("hswp", hrwy(int ), (int)170)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  != na.hrtz("hswq", hrtw(int ), (int)569)) break block87;
                    var5_1 = na.c;
                    v1 /* !! */  = na.ov;
                    if (true) ** GOTO lbl12
                }
                v0 /* !! */  = (long)na.hrtz("hswr", hrtw(int ), (int)570);
            }
            block48: while (true) {
                v1 /* !! */  = (long)(v2 - na.hrtz("hsws", hrwy(int ), (int)171));
lbl12:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1591429642: {
                        v2 = na.hrtz("hswt", hrwy(int ), (int)172);
                        continue block48;
                    }
                    case -764769638: {
                        v2 = na.hrtz("hswu", hrwy(int ), (int)173);
                        continue block48;
                    }
                    case 1599292349: {
                        break block48;
                    }
                }
                break;
            }
            var4_2 /* !! */  = na.b;
            if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block49: do {
                switch (cfr_temp_0 == -2147483648 ? var4_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            if ((v3 /* !! */  = (cfr_temp_2 = na.ov - na.hrtz("hswv", hrwy(int ), (int)174)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                            if (v3 /* !! */  == na.hrtz("hsww", hrtw(int ), (int)571)) {
                                var3_3 = na.a;
                                if (var5_1) {
                                    throw null;
                                }
                                break;
                            }
                            v3 /* !! */  = (long)na.hrtz("hswx", hrtw(int ), (int)572);
                        }
                        if (var3_3 || var3_3) return;
                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_3 = na.ov - na.hrtz("hswy", hrwy(int ), (int)175)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v4 /* !! */  != na.hrtz("hswz", hrtw(int ), (int)573)) {
                                v4 /* !! */  = (long)na.hrtz("hsxa", hrtw(int ), (int)574);
                                continue;
                            }
                            break block85;
                            break;
                        }
                    }
                    case 0: {
                        var4_2 /* !! */  = (int)na.hrtz("hsyf", hrtw(int ), (int)587);
                        cfr_temp_0 = 14;
                        if (!var5_1) continue block49;
                        throw null;
                    }
                    case 1: {
                        var4_2 /* !! */  = (int)na.hrtz("hsyg", hrtw(int ), (int)588);
                        cfr_temp_0 = 10;
                        if (!var5_1) continue block49;
                        throw null;
                    }
                    case 2: {
                        var4_2 /* !! */  = (int)na.hrtz("hsyh", hrtw(int ), (int)589);
                        cfr_temp_0 = 7;
                        if (!var5_1) continue block49;
                        throw null;
                    }
                    case 4: {
                        var4_2 /* !! */  = (int)na.hrtz("hsyj", hrtw(int ), (int)591);
                        cfr_temp_0 = 13;
                        if (!var5_1) continue block49;
                        throw null;
                    }
                    case 6: {
                        var4_2 /* !! */  = (int)na.hrtz("hsyl", hrtw(int ), (int)593);
                        if (var5_1) {
                            throw null;
                        }
                    }
                    case 5: {
                        var4_2 /* !! */  = (int)na.hrtz("hsyk", hrtw(int ), (int)592);
                        if (var5_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 7: {
                        var4_2 /* !! */  = (int)na.hrtz("hsym", hrtw(int ), (int)594);
                        cfr_temp_0 = 3;
                        if (!var5_1) continue block49;
                        throw null;
                    }
                    case 8: {
                        ** GOTO lbl103
                    }
                    case 12: {
                        do {
                            var4_2 /* !! */  = (int)na.hrtz("hsyr", hrtw(int ), (int)599);
                        } while (!var5_1);
                        throw null;
                    }
                    case 14: {
                        var4_2 /* !! */  = (int)na.hrtz("hsyt", hrtw(int ), (int)601);
                        cfr_temp_0 = 11;
                        if (!var5_1) continue block49;
                        throw null;
                    }
                    case 16: {
                        var4_2 /* !! */  = (int)na.hrtz("hsyv", hrtw(int ), (int)603);
                        cfr_temp_0 = 10;
                        if (!var5_1) continue block49;
                        throw null;
                    }
                    case 18: {
                        var4_2 /* !! */  = (int)na.hrtz("hsyx", hrtw(int ), (int)605);
                        cfr_temp_0 = 3;
                        if (!var5_1) continue block49;
                        throw null;
                    }
                    case 19: lbl-1000:
                    // 2 sources

                    {
                        var4_2 /* !! */  = (int)na.hrtz("hsyy", hrtw(int ), (int)606);
                        if (var5_1) {
                            throw null;
                        }
lbl103:
                        // 3 sources

                        var4_2 /* !! */  = (int)na.hrtz("hsyn", hrtw(int ), (int)595);
                        if (var5_1) {
                            throw null;
                        }
                    }
                    case 11: {
                        var4_2 /* !! */  = (int)na.hrtz("hsyq", hrtw(int ), (int)598);
                        if (var5_1) {
                            throw null;
                        }
                    }
                    case 10: {
                        var4_2 /* !! */  = (int)na.hrtz("hsyp", hrtw(int ), (int)597);
                        if (var5_1) {
                            throw null;
                        }
                    }
                    case 9: {
                        var4_2 /* !! */  = (int)na.hrtz("hsyo", hrtw(int ), (int)596);
                        if (var5_1) {
                            throw null;
                        }
                    }
                    case 3: {
                        var4_2 /* !! */  = (int)na.hrtz("hsyi", hrtw(int ), (int)590);
                        if (var5_1) {
                            throw null;
                        }
                    }
                    case 17: {
                        var4_2 /* !! */  = (int)na.hrtz("hsyw", hrtw(int ), (int)604);
                        if (var5_1) {
                            throw null;
                        }
                    }
                    case 15: {
                        var4_2 /* !! */  = (int)na.hrtz("hsyu", hrtw(int ), (int)602);
                        if (var5_1) {
                            throw null;
                        }
                    }
                    case 13: 
                }
                break;
            } while (true);
            do {
                var4_2 /* !! */  = (int)na.hrtz("hsys", hrtw(int ), (int)600);
            } while (!var5_1);
            throw null;
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_4 = na.ov - na.hrtz("hsxb", hrwy(int ), (int)176)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == na.hrtz("hsxc", hrtw(int ), (int)575)) break;
            v5 /* !! */  = (long)na.hrtz("hsxd", hrtw(int ), (int)576);
        }
        v6 = na.settingsSnapshot.entrySet();
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_5 = na.ov - na.hrtz("hsxe", hrwy(int ), (int)177)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == na.hrtz("hsxf", hrtw(int ), (int)577)) {
                var1_4 = v6.iterator();
                if (var3_3) return;
                break;
            }
            v7 /* !! */  = (long)na.hrtz("hsxg", hrtw(int ), (int)578);
        }
        while (!var3_3 && !var3_3) {
            block88: {
                block86: {
                    while (true) {
                        if ((v8 /* !! */  = (cfr_temp_6 = na.ov - na.hrtz("hsxh", hrwy(int ), (int)178)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v8 /* !! */  == na.hrtz("hsxi", hrtw(int ), (int)579)) {
                            if (var1_4.hasNext()) {
                                break;
                            }
                            break block86;
                        }
                        v8 /* !! */  = (long)na.hrtz("hsxj", hrtw(int ), (int)580);
                    }
                    if (var3_3) return;
                    break block88;
                }
                if (var3_3 || var3_3) return;
                v9 /* !! */  = na.ov;
                if (true) ** GOTO lbl219
            }
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_7 = na.ov - na.hrtz("hsxk", hrwy(int ), (int)179)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == na.hrtz("hsxl", hrtw(int ), (int)581)) {
                    var2_5 = var1_4.next();
                    if (var3_3) return;
                    break;
                }
                v10 /* !! */  = (long)na.hrtz("hsxm", hrtw(int ), (int)582);
            }
            if (var3_3) return;
            v11 /* !! */  = na.ov;
            if (true) ** GOTO lbl181
            block59: while (true) {
                v11 /* !! */  = (long)(v12 - na.hrtz("hsxn", hrwy(int ), (int)180));
lbl181:
                // 2 sources

                switch ((int)v11 /* !! */ ) {
                    case -314214714: {
                        v12 = na.hrtz("hsxo", hrwy(int ), (int)181);
                        continue block59;
                    }
                    case 1599292349: {
                        break block59;
                    }
                    case 1642146415: {
                        v12 = na.hrtz("hsxp", hrwy(int ), (int)182);
                        continue block59;
                    }
                }
                break;
            }
            if (var2_5.getValue() != null) {
                if (var3_3 || var3_3) return;
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_8 = na.ov - na.hrtz("hsxq", hrwy(int ), (int)183)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == na.hrtz("hsxr", hrtw(int ), (int)583)) break;
                    v13 /* !! */  = (long)na.hrtz("hsxs", hrtw(int ), (int)584);
                }
                v14 /* !! */  = na.ov;
                block61: while (true) {
                    switch ((int)v14 /* !! */ ) {
                        case -1104551151: {
                            v14 /* !! */  = (long)(na.hrtz("hsxu", hrwy(int ), (int)185) - na.hrtz("hsxt", hrwy(int ), (int)184));
                            continue block61;
                        }
                        case 1599292349: {
                            break block61;
                        }
                    }
                    break;
                }
                v15 = var2_5.getValue();
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_9 = na.ov - na.hrtz("hsxv", hrwy(int ), (int)186)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == na.hrtz("hsxw", hrtw(int ), (int)585)) {
                        na.setSetting(var0, var2_5.getKey(), v15);
                        if (var3_3) return;
                        break;
                    }
                    v16 /* !! */  = (long)na.hrtz("hsxx", hrtw(int ), (int)586);
                }
            }
            if (var3_3 || var3_3) return;
            if (!var5_1) continue;
            throw null;
            block63: while (true) {
                v9 /* !! */  = (long)(v17 - na.hrtz("hsxy", hrwy(int ), (int)187));
lbl219:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case 928559565: {
                        v17 = na.hrtz("hsxz", hrwy(int ), (int)188);
                        continue block63;
                    }
                    case 1599292349: {
                        break block63;
                    }
                    case 2001007195: {
                        v17 = na.hrtz("hsya", hrwy(int ), (int)189);
                        continue block63;
                    }
                }
                break;
            }
            v18 /* !! */  = na.ov;
            if (true) ** GOTO lbl232
            block64: while (true) {
                v18 /* !! */  = (long)(v19 - na.hrtz("hsyb", hrwy(int ), (int)190));
lbl232:
                // 2 sources

                switch ((int)v18 /* !! */ ) {
                    case 224828436: {
                        v19 = na.hrtz("hsyc", hrwy(int ), (int)191);
                        continue block64;
                    }
                    case 1251927947: {
                        v19 = na.hrtz("hsyd", hrwy(int ), (int)192);
                        continue block64;
                    }
                    case 1599292349: {
                        break block64;
                    }
                    case 1712503078: {
                        v19 = na.hrtz("hsye", hrwy(int ), (int)193);
                        continue block64;
                    }
                }
                break;
            }
            na.settingsSnapshot.clear();
            if (!var3_3 && !var3_3) return;
        }
    }

    private static /* synthetic */ void htbt() {
        na.hrtx[300] = 1916537367;
        na.hrtx[301] = -449055559;
        na.hrtx[302] = 46642763;
        na.hrtx[303] = 1714539471;
        na.hrtx[304] = -424202455;
        na.hrtx[305] = 659656644;
        na.hrtx[306] = -134354386;
        na.hrtx[307] = -899322854;
        na.hrtx[308] = 1482305057;
        na.hrtx[309] = 1345585296;
        na.hrtx[310] = 861120794;
        na.hrtx[311] = -364686724;
        na.hrtx[312] = 755041614;
        na.hrtx[313] = 1290927827;
        na.hrtx[314] = -155177739;
        na.hrtx[315] = -964387143;
        na.hrtx[316] = 681641472;
        na.hrtx[317] = 1443077765;
        na.hrtx[318] = -1993252412;
        na.hrtx[319] = -467124309;
        na.hrtx[320] = -697789993;
        na.hrtx[321] = -1210934033;
        na.hrtx[322] = 796805727;
        na.hrtx[323] = -287313036;
        na.hrtx[324] = -1248192439;
        na.hrtx[325] = 250195654;
        na.hrtx[326] = 362048556;
        na.hrtx[327] = -922138446;
        na.hrtx[328] = 1425011865;
        na.hrtx[329] = 582067505;
        na.hrtx[330] = 1050708660;
        na.hrtx[331] = 640129506;
        na.hrtx[332] = -1274211721;
        na.hrtx[333] = 1354529012;
        na.hrtx[334] = 137572067;
        na.hrtx[335] = 1924084040;
        na.hrtx[336] = -598180359;
        na.hrtx[337] = 302749370;
        na.hrtx[338] = 1835386508;
        na.hrtx[339] = 742461204;
        na.hrtx[340] = -673169246;
        na.hrtx[341] = -1128269429;
        na.hrtx[342] = 2081249552;
        na.hrtx[343] = -1686503605;
        na.hrtx[344] = -809357117;
        na.hrtx[345] = 1148709880;
        na.hrtx[346] = 324278931;
        na.hrtx[347] = -1016137238;
        na.hrtx[348] = -497051736;
        na.hrtx[349] = 2072478145;
        na.hrtx[350] = 1222860258;
        na.hrtx[351] = 773586052;
        na.hrtx[352] = 109760915;
        na.hrtx[353] = -1535762381;
        na.hrtx[354] = -1134842882;
        na.hrtx[355] = 1336529964;
        na.hrtx[356] = 1378634820;
        na.hrtx[357] = -16997079;
        na.hrtx[358] = -1200553451;
        na.hrtx[359] = -1883076177;
        na.hrtx[360] = 449742759;
        na.hrtx[361] = 996476602;
        na.hrtx[362] = -1847755361;
        na.hrtx[363] = -1754044985;
        na.hrtx[364] = 1800862858;
        na.hrtx[365] = 1273329801;
        na.hrtx[366] = 247265093;
        na.hrtx[367] = 1989591158;
        na.hrtx[368] = 506203546;
        na.hrtx[369] = 580809029;
        na.hrtx[370] = 1493717932;
        na.hrtx[371] = 749670177;
        na.hrtx[372] = -597268660;
        na.hrtx[373] = 1568940026;
        na.hrtx[374] = -1391490571;
        na.hrtx[375] = 1908401790;
        na.hrtx[376] = 1135505741;
        na.hrtx[377] = 1425090150;
        na.hrtx[378] = 1966975234;
        na.hrtx[379] = -1958157437;
        na.hrtx[380] = 1531753975;
        na.hrtx[381] = 791260637;
        na.hrtx[382] = 929193023;
        na.hrtx[383] = 55684957;
        na.hrtx[384] = 1207854354;
        na.hrtx[385] = -1879889976;
        na.hrtx[386] = -1049578735;
        na.hrtx[387] = 716542904;
        na.hrtx[388] = 864900056;
        na.hrtx[389] = -657043230;
        na.hrtx[390] = -1940180070;
        na.hrtx[391] = 265310204;
        na.hrtx[392] = -1556275327;
        na.hrtx[393] = 702957796;
        na.hrtx[394] = -1078888851;
        na.hrtx[395] = -1768609677;
        na.hrtx[396] = -451586253;
        na.hrtx[397] = -180300946;
        na.hrtx[398] = -1876699797;
        na.hrtx[399] = 1916034882;
    }

    private static /* synthetic */ void htcb() {
        na.hrty[400] = -634729195;
        na.hrty[401] = -567732715;
        na.hrty[402] = -1839862834;
        na.hrty[403] = 570592467;
        na.hrty[404] = -1584891433;
        na.hrty[405] = 954165434;
        na.hrty[406] = -1028591023;
        na.hrty[407] = -1231516906;
        na.hrty[408] = -1770352882;
        na.hrty[409] = 393087435;
        na.hrty[410] = 1853043647;
        na.hrty[411] = -262543087;
        na.hrty[412] = -1408982653;
        na.hrty[413] = -1161048956;
        na.hrty[414] = 1514808378;
        na.hrty[415] = 1492850886;
        na.hrty[416] = -2005529267;
        na.hrty[417] = 741545021;
        na.hrty[418] = -1147610156;
        na.hrty[419] = -241389312;
        na.hrty[420] = 593820057;
        na.hrty[421] = 1462989146;
        na.hrty[422] = -520080686;
        na.hrty[423] = 908548163;
        na.hrty[424] = -1590406936;
        na.hrty[425] = -1795073739;
        na.hrty[426] = 1459467216;
        na.hrty[427] = -1705083244;
        na.hrty[428] = -183599904;
        na.hrty[429] = -1075037263;
        na.hrty[430] = -606897575;
        na.hrty[431] = -1431582765;
        na.hrty[432] = 929412142;
        na.hrty[433] = 1168644347;
        na.hrty[434] = 1593137441;
        na.hrty[435] = 480615702;
        na.hrty[436] = 1975957084;
        na.hrty[437] = 623860954;
        na.hrty[438] = 1801584396;
        na.hrty[439] = 455688872;
        na.hrty[440] = 602297995;
        na.hrty[441] = 1512041915;
        na.hrty[442] = 639288668;
        na.hrty[443] = 145887971;
        na.hrty[444] = -286239599;
        na.hrty[445] = -874725013;
        na.hrty[446] = 1783453579;
        na.hrty[447] = 35674587;
        na.hrty[448] = -2012466632;
        na.hrty[449] = -413569624;
        na.hrty[450] = -917161401;
        na.hrty[451] = 777873948;
        na.hrty[452] = 633584601;
        na.hrty[453] = 95792629;
        na.hrty[454] = 748699325;
        na.hrty[455] = 652200085;
        na.hrty[456] = -524880061;
        na.hrty[457] = 2141909678;
        na.hrty[458] = -934255079;
        na.hrty[459] = -290348078;
        na.hrty[460] = -1402626848;
        na.hrty[461] = -2091168421;
        na.hrty[462] = -1038485171;
        na.hrty[463] = 1762331249;
        na.hrty[464] = 783580954;
        na.hrty[465] = -1154331064;
        na.hrty[466] = -494610158;
        na.hrty[467] = -1145793330;
        na.hrty[468] = -766016518;
        na.hrty[469] = -1233279148;
        na.hrty[470] = 866404908;
        na.hrty[471] = 1266578944;
        na.hrty[472] = 2007962898;
        na.hrty[473] = 141338633;
        na.hrty[474] = 2009645553;
        na.hrty[475] = 90384393;
        na.hrty[476] = -1758320227;
        na.hrty[477] = -981276947;
        na.hrty[478] = -1998358773;
        na.hrty[479] = -592697528;
        na.hrty[480] = 1584156388;
        na.hrty[481] = -1954829289;
        na.hrty[482] = -1635009924;
        na.hrty[483] = -253595342;
        na.hrty[484] = -819375390;
        na.hrty[485] = -1990135548;
        na.hrty[486] = 420633826;
        na.hrty[487] = -994330047;
        na.hrty[488] = -1780583126;
        na.hrty[489] = 376572330;
        na.hrty[490] = 873440252;
        na.hrty[491] = -1664053461;
        na.hrty[492] = -1292156408;
        na.hrty[493] = -1415361842;
        na.hrty[494] = 513578092;
        na.hrty[495] = 1089918295;
        na.hrty[496] = 550140903;
        na.hrty[497] = 1983988114;
        na.hrty[498] = -1557097538;
        na.hrty[499] = 1759469196;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Object primaryBaritone() {
        v0 /* !! */  = na.ov;
        block38: while (true) {
            switch ((int)v0 /* !! */ ) {
                case 1599292349: {
                    break block38;
                }
                case 1707244742: {
                    v0 /* !! */  = (long)(na.hrtz("hrxc", hrwy(int ), (int)1) - na.hrtz("hrxb", hrwy(int ), (int)0));
                    continue block38;
                }
            }
            break;
        }
        var3 = na.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = na.ov - na.hrtz("hrxd", hrwy(int ), (int)2)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == na.hrtz("hrxe", hrtw(int ), (int)76)) break;
            v1 /* !! */  = (long)na.hrtz("hrxf", hrtw(int ), (int)77);
        }
        var2_1 /* !! */  = na.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = na.ov - na.hrtz("hrxg", hrwy(int ), (int)3)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == na.hrtz("hrxh", hrtw(int ), (int)78)) {
                var1_2 = na.a;
                if (var3) {
                    throw null;
                }
                break;
            }
            v2 /* !! */  = (long)na.hrtz("hrxi", hrtw(int ), (int)79);
        }
        if (var1_2 != false) return null;
        if (var1_2 != false) return null;
        v3 /* !! */  = na.ov;
        if (true) ** GOTO lbl31
        block41: while (true) {
            v3 /* !! */  = (long)(v4 - na.hrtz("hrxj", hrwy(int ), (int)4));
lbl31:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -35781368: {
                    v4 = na.hrtz("hrxk", hrwy(int ), (int)5);
                    continue block41;
                }
                case 11695599: {
                    v4 = na.hrtz("hrxl", hrwy(int ), (int)6);
                    continue block41;
                }
                case 1599292349: {
                    break block41;
                }
            }
            break;
        }
        na.resolve();
        if (var1_2 != false) return null;
        if (var1_2 != false) return null;
        v5 /* !! */  = na.ov;
        if (true) ** GOTO lbl47
        block42: while (true) {
            v5 /* !! */  = (long)(v6 - na.hrtz("hrxm", hrwy(int ), (int)7));
lbl47:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1139809201: {
                    v6 = na.hrtz("hrxn", hrwy(int ), (int)8);
                    continue block42;
                }
                case 1599292349: {
                    break block42;
                }
                case 2112529336: {
                    v6 = na.hrtz("hrxo", hrwy(int ), (int)9);
                    continue block42;
                }
            }
            break;
        }
        if (!na.available) {
            if (var1_2 != false) return null;
            if (var1_2 != false) return null;
            return null;
        }
        try {
            block68: {
                block67: {
                    if (var1_2 != false) return null;
                    if (var1_2 != false) return null;
                    while (true) {
                        if ((v7 /* !! */  = (cfr_temp_3 = na.ov - na.hrtz("hrxp", hrwy(int ), (int)10)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v7 /* !! */  == na.hrtz("hrxq", hrtw(int ), (int)80)) break;
                        v7 /* !! */  = (long)na.hrtz("hrxr", hrtw(int ), (int)81);
                    }
                    v8 = new Object[]{};
                    while (true) {
                        if ((v9 /* !! */  = (cfr_temp_4 = na.ov - na.hrtz("hrxs", hrwy(int ), (int)11)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v9 /* !! */  == na.hrtz("hrxt", hrtw(int ), (int)82)) {
                            var0_3 = na.getProviderMethod.invoke(null, v8);
                            if (var1_2 != false) return null;
                            if (var1_2 != false) return null;
                            if (var0_3 == null) {
                                break;
                            }
                            break block67;
                        }
                        v9 /* !! */  = (long)na.hrtz("hrxu", hrtw(int ), (int)83);
                    }
                    if (var1_2 != false) return null;
                    if (var1_2 != false) return null;
                    return null;
                }
                if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
                cfr_temp_0 = -2147483648;
                block45: do {
                    switch (cfr_temp_0 == -2147483648 ? var2_1 /* !! */  : cfr_temp_0) {
                        default: lbl-1000:
                        // 2 sources

                        {
                            if (var1_2 != false) return null;
                            if (var1_2 != false) return null;
                            while (true) {
                                if ((v10 /* !! */  = (cfr_temp_5 = na.ov - na.hrtz("hrxv", hrwy(int ), (int)12)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                                if (v10 /* !! */  == na.hrtz("hrxw", hrtw(int ), (int)84)) {
                                    v11 = new Object[]{};
                                    break block68;
                                }
                                v10 /* !! */  = (long)na.hrtz("hrxx", hrtw(int ), (int)85);
                            }
                        }
                        case 3: {
                            var2_1 /* !! */  = (int)na.hrtz("hrye", hrtw(int ), (int)91);
                            if (var3) {
                                throw null;
                            }
                        }
                        case 0: {
                            var2_1 /* !! */  = (int)na.hrtz("hryb", hrtw(int ), (int)88);
                            if (var3) {
                                throw null;
                            }
                        }
                        case 2: {
                            var2_1 /* !! */  = (int)na.hrtz("hryd", hrtw(int ), (int)90);
                            if (var3) {
                                throw null;
                            }
                        }
                        case 1: {
                            var2_1 /* !! */  = (int)na.hrtz("hryc", hrtw(int ), (int)89);
                            cfr_temp_0 = 15;
                            if (!var3) continue block45;
                            throw null;
                        }
                        case 4: {
                            var2_1 /* !! */  = (int)na.hrtz("hryf", hrtw(int ), (int)92);
                            cfr_temp_0 = 6;
                            if (!var3) continue block45;
                            throw null;
                        }
                        case 5: {
                            var2_1 /* !! */  = (int)na.hrtz("hryg", hrtw(int ), (int)93);
                            cfr_temp_0 = 15;
                            if (!var3) continue block45;
                            throw null;
                        }
                        case 8: {
                            var2_1 /* !! */  = (int)na.hrtz("hryj", hrtw(int ), (int)96);
                            cfr_temp_0 = 7;
                            if (!var3) continue block45;
                            throw null;
                        }
                        case 11: {
                            var2_1 /* !! */  = (int)na.hrtz("hrym", hrtw(int ), (int)99);
                            if (var3) {
                                throw null;
                            }
                        }
                        case 7: {
                            var2_1 /* !! */  = (int)na.hrtz("hryi", hrtw(int ), (int)95);
                            cfr_temp_0 = 14;
                            if (!var3) continue block45;
                            throw null;
                        }
                        case 13: {
                            var2_1 /* !! */  = (int)na.hrtz("hryo", hrtw(int ), (int)101);
                            if (var3) {
                                throw null;
                            }
                        }
                        case 14: {
                            var2_1 /* !! */  = (int)na.hrtz("hryp", hrtw(int ), (int)102);
                            if (var3) {
                                throw null;
                            }
                        }
                        case 10: {
                            var2_1 /* !! */  = (int)na.hrtz("hryl", hrtw(int ), (int)98);
                            cfr_temp_0 = 6;
                            if (!var3) continue block45;
                            throw null;
                        }
                        case 15: {
                            do {
                                var2_1 /* !! */  = (int)na.hrtz("hryq", hrtw(int ), (int)103);
                            } while (!var3);
                            throw null;
                        }
                        case 16: {
                            ** GOTO lbl176
                        }
                        case 17: {
                            var2_1 /* !! */  = (int)na.hrtz("hrys", hrtw(int ), (int)105);
                            if (var3) {
                                throw null;
                            }
                        }
                        case 9: {
                            var2_1 /* !! */  = (int)na.hrtz("hryk", hrtw(int ), (int)97);
                            if (var3) {
                                throw null;
                            }
                        }
                        case 12: {
                            var2_1 /* !! */  = (int)na.hrtz("hryn", hrtw(int ), (int)100);
                            cfr_temp_0 = 6;
                            if (!var3) continue block45;
                            throw null;
                        }
                        case 18: {
                            var2_1 /* !! */  = (int)na.hrtz("hryt", hrtw(int ), (int)106);
                            if (var3) {
                                throw null;
                            }
lbl176:
                            // 3 sources

                            var2_1 /* !! */  = (int)na.hrtz("hryr", hrtw(int ), (int)104);
                            if (var3) {
                                throw null;
                            }
                        }
                        case 6: 
                    }
                    break;
                } while (true);
                do {
                    var2_1 /* !! */  = (int)na.hrtz("hryh", hrtw(int ), (int)94);
                } while (!var3);
                throw null;
            }
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_6 = na.ov - na.hrtz("hrxy", hrwy(int ), (int)13)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v12 /* !! */  == na.hrtz("hrxz", hrtw(int ), (int)86)) {
                    return na.getPrimaryBaritoneMethod.invoke(var0_3, v11);
                }
                v12 /* !! */  = (long)na.hrtz("hrya", hrtw(int ), (int)87);
            }
        }
        catch (Exception var0_4) {
            if (var1_2 != false) return null;
            if (var1_2 != false) return null;
            return null;
        }
    }

    private static /* synthetic */ void htbz() {
        na.hrty[200] = 1447178575;
        na.hrty[201] = 1479133529;
        na.hrty[202] = 1368353989;
        na.hrty[203] = -68692252;
        na.hrty[204] = -1483660912;
        na.hrty[205] = 2083656432;
        na.hrty[206] = 2031883644;
        na.hrty[207] = 2139371219;
        na.hrty[208] = 36698176;
        na.hrty[209] = -2052510171;
        na.hrty[210] = 1208318462;
        na.hrty[211] = 598420174;
        na.hrty[212] = 19404435;
        na.hrty[213] = 979825401;
        na.hrty[214] = 561493180;
        na.hrty[215] = -1043454724;
        na.hrty[216] = 283529205;
        na.hrty[217] = -2006433269;
        na.hrty[218] = 1528906289;
        na.hrty[219] = -1573457488;
        na.hrty[220] = 1417538277;
        na.hrty[221] = 409244515;
        na.hrty[222] = -380773963;
        na.hrty[223] = -656983573;
        na.hrty[224] = -188745138;
        na.hrty[225] = -1900251894;
        na.hrty[226] = 261069593;
        na.hrty[227] = 444931506;
        na.hrty[228] = -217456300;
        na.hrty[229] = 1274792456;
        na.hrty[230] = -2101759106;
        na.hrty[231] = 1734250344;
        na.hrty[232] = 552804030;
        na.hrty[233] = 1973342415;
        na.hrty[234] = -806255694;
        na.hrty[235] = -2116354744;
        na.hrty[236] = 1045247396;
        na.hrty[237] = -2084879912;
        na.hrty[238] = 2046162791;
        na.hrty[239] = -1284757143;
        na.hrty[240] = -1805129040;
        na.hrty[241] = -1500640488;
        na.hrty[242] = -2140643214;
        na.hrty[243] = -1008902197;
        na.hrty[244] = 1547106181;
        na.hrty[245] = -603847956;
        na.hrty[246] = 1910616379;
        na.hrty[247] = 1885581488;
        na.hrty[248] = -135573545;
        na.hrty[249] = 225242064;
        na.hrty[250] = 804550903;
        na.hrty[251] = -1224720982;
        na.hrty[252] = 1687111285;
        na.hrty[253] = 1341968149;
        na.hrty[254] = 1395276365;
        na.hrty[255] = -1071565211;
        na.hrty[256] = 1501814945;
        na.hrty[257] = 1653158608;
        na.hrty[258] = -712059590;
        na.hrty[259] = 1756559970;
        na.hrty[260] = 1172860373;
        na.hrty[261] = 2004828829;
        na.hrty[262] = 1591554349;
        na.hrty[263] = -845101103;
        na.hrty[264] = -1604407644;
        na.hrty[265] = -1348993444;
        na.hrty[266] = 1279399450;
        na.hrty[267] = -1248490755;
        na.hrty[268] = -403162748;
        na.hrty[269] = 1266032608;
        na.hrty[270] = 1361595303;
        na.hrty[271] = -1986077266;
        na.hrty[272] = -1527163365;
        na.hrty[273] = -1558529439;
        na.hrty[274] = -1450104750;
        na.hrty[275] = 765753691;
        na.hrty[276] = 1709227089;
        na.hrty[277] = 1510724662;
        na.hrty[278] = -1434138859;
        na.hrty[279] = -1086910339;
        na.hrty[280] = 2030095171;
        na.hrty[281] = -2089887766;
        na.hrty[282] = -107951848;
        na.hrty[283] = -342345756;
        na.hrty[284] = -666524493;
        na.hrty[285] = 1149595215;
        na.hrty[286] = -2092555214;
        na.hrty[287] = -997856022;
        na.hrty[288] = 1851787568;
        na.hrty[289] = -219835947;
        na.hrty[290] = 1676072367;
        na.hrty[291] = -1518613781;
        na.hrty[292] = 679432820;
        na.hrty[293] = 1137640222;
        na.hrty[294] = -1510638253;
        na.hrty[295] = -1144151052;
        na.hrty[296] = -1396297716;
        na.hrty[297] = -58002735;
        na.hrty[298] = -1259002722;
        na.hrty[299] = -637112134;
    }

    private static /* synthetic */ void htce() {
        na.hrwz[0] = -5375037197809545809L;
        na.hrwz[1] = -861903230963592233L;
        na.hrwz[2] = -1127923868029474403L;
        na.hrwz[3] = 4324480228444512359L;
        na.hrwz[4] = -131044867740887664L;
        na.hrwz[5] = -5904853621949437564L;
        na.hrwz[6] = -4929108372570062L;
        na.hrwz[7] = 6685037624688919916L;
        na.hrwz[8] = -2001174156656363546L;
        na.hrwz[9] = 5105228702139746057L;
        na.hrwz[10] = 6810066461227606123L;
        na.hrwz[11] = -3310541641469634130L;
        na.hrwz[12] = -1200532845039458913L;
        na.hrwz[13] = -1632927345413684619L;
        na.hrwz[14] = 5779759732687466692L;
        na.hrwz[15] = 3298136594233652887L;
        na.hrwz[16] = -8689714723317634160L;
        na.hrwz[17] = -1737559206009628604L;
        na.hrwz[18] = 2202342646843195787L;
        na.hrwz[19] = -6175441694535732477L;
        na.hrwz[20] = 5639554470547470197L;
        na.hrwz[21] = 5933374435344476107L;
        na.hrwz[22] = -7666726204332093356L;
        na.hrwz[23] = 888392258402610575L;
        na.hrwz[24] = 1067932419446800655L;
        na.hrwz[25] = -7588633341361344324L;
        na.hrwz[26] = -1844189583416444030L;
        na.hrwz[27] = 1387918954373019278L;
        na.hrwz[28] = -7654942637038055846L;
        na.hrwz[29] = 6341980248343468762L;
        na.hrwz[30] = 9092140948831375177L;
        na.hrwz[31] = -7785315312349561039L;
        na.hrwz[32] = -2174071359024447592L;
        na.hrwz[33] = 7095459200541231731L;
        na.hrwz[34] = -3280531263588467358L;
        na.hrwz[35] = 6936671569527469429L;
        na.hrwz[36] = 9155824593742256177L;
        na.hrwz[37] = -1806846153014844882L;
        na.hrwz[38] = 8035662968358286871L;
        na.hrwz[39] = -4343611481857126482L;
        na.hrwz[40] = 7226647713471620091L;
        na.hrwz[41] = -297203319246272886L;
        na.hrwz[42] = 5110923911543173733L;
        na.hrwz[43] = 6891281742228537257L;
        na.hrwz[44] = -3432028325378943029L;
        na.hrwz[45] = -7129617218933465902L;
        na.hrwz[46] = 4627983669539652745L;
        na.hrwz[47] = -4344641061447015074L;
        na.hrwz[48] = -2329670163423730369L;
        na.hrwz[49] = -6775991747391254397L;
        na.hrwz[50] = 2921915256884243255L;
        na.hrwz[51] = 8515052336146408713L;
        na.hrwz[52] = -7658582046097620722L;
        na.hrwz[53] = 5542725275115865757L;
        na.hrwz[54] = -5070007245497353004L;
        na.hrwz[55] = -3384360593574936544L;
        na.hrwz[56] = -6760081308100261270L;
        na.hrwz[57] = 2117826840878652211L;
        na.hrwz[58] = -8161789773984859278L;
        na.hrwz[59] = 1808068404192926090L;
        na.hrwz[60] = 2225642977018271272L;
        na.hrwz[61] = 7177947263925159770L;
        na.hrwz[62] = 2118304895997392290L;
        na.hrwz[63] = -5648212223683435468L;
        na.hrwz[64] = 3006487742308479897L;
        na.hrwz[65] = 2772762489220883779L;
        na.hrwz[66] = 1867705499332029236L;
        na.hrwz[67] = -804432664900978061L;
        na.hrwz[68] = -236653071337149294L;
        na.hrwz[69] = -522205734591729287L;
        na.hrwz[70] = 493205046901261157L;
        na.hrwz[71] = -6592107100545943788L;
        na.hrwz[72] = -3104424576214984793L;
        na.hrwz[73] = -5839365499650725568L;
        na.hrwz[74] = 957278574838236188L;
        na.hrwz[75] = 7228293648245041931L;
        na.hrwz[76] = 2752371893434270226L;
        na.hrwz[77] = -3369966406495882108L;
        na.hrwz[78] = 2982400205669419445L;
        na.hrwz[79] = 1622915843725826531L;
        na.hrwz[80] = 1465458527887372311L;
        na.hrwz[81] = 3399603035365467931L;
        na.hrwz[82] = 8946467843156218152L;
        na.hrwz[83] = -3646706131261566625L;
        na.hrwz[84] = -8588123383529630477L;
        na.hrwz[85] = 4146500169240360577L;
        na.hrwz[86] = -858735487908696413L;
        na.hrwz[87] = 6283452023017529594L;
        na.hrwz[88] = -7518415849216113574L;
        na.hrwz[89] = -930519591733262783L;
        na.hrwz[90] = -5206124815188551951L;
        na.hrwz[91] = -7923266333077055622L;
        na.hrwz[92] = 7241449181120998199L;
        na.hrwz[93] = -7122351327951871666L;
        na.hrwz[94] = -5820051464710105860L;
        na.hrwz[95] = 9055890454956793189L;
        na.hrwz[96] = 4898364216988810380L;
        na.hrwz[97] = -7921761186230394483L;
        na.hrwz[98] = -5643437119578186584L;
        na.hrwz[99] = 5829471478084389439L;
    }

    /*
     * Exception decompiling
     */
    private static void resolve() {
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

    private static /* synthetic */ void htcf() {
        na.hrwz[100] = 3252300471972500070L;
        na.hrwz[101] = -941223344745138682L;
        na.hrwz[102] = -8518189040279944538L;
        na.hrwz[103] = 8898550659188142150L;
        na.hrwz[104] = 6891929812761752049L;
        na.hrwz[105] = -2574505800107893817L;
        na.hrwz[106] = -5491859160959723311L;
        na.hrwz[107] = -8506004306845897996L;
        na.hrwz[108] = 8475547179841986298L;
        na.hrwz[109] = 3003808117411858923L;
        na.hrwz[110] = -8338408371117892337L;
        na.hrwz[111] = -8699135939515659114L;
        na.hrwz[112] = -4767331114289486152L;
        na.hrwz[113] = 3396275942629573370L;
        na.hrwz[114] = -6241794950725110350L;
        na.hrwz[115] = 4864558727555196600L;
        na.hrwz[116] = -2559581827495050477L;
        na.hrwz[117] = -4535795921475812763L;
        na.hrwz[118] = -8722059484699657712L;
        na.hrwz[119] = 6838466304399849560L;
        na.hrwz[120] = 877151409649869579L;
        na.hrwz[121] = -1145635322647367270L;
        na.hrwz[122] = -1725144934558264746L;
        na.hrwz[123] = 6524713226498053538L;
        na.hrwz[124] = -7829063944244467221L;
        na.hrwz[125] = 3284636722100503659L;
        na.hrwz[126] = -716434107725924868L;
        na.hrwz[127] = 6564569800074870064L;
        na.hrwz[128] = -6104875313369597296L;
        na.hrwz[129] = -7942190876935870564L;
        na.hrwz[130] = -6024108242597737856L;
        na.hrwz[131] = -6990951003760892093L;
        na.hrwz[132] = -4997784162390272913L;
        na.hrwz[133] = -2753318488499235597L;
        na.hrwz[134] = -2074701174465488817L;
        na.hrwz[135] = 6624106814814235852L;
        na.hrwz[136] = 4360684794896427689L;
        na.hrwz[137] = 1933613563461166614L;
        na.hrwz[138] = 1015414977607690078L;
        na.hrwz[139] = 2968509553703337156L;
        na.hrwz[140] = -6658225409625264210L;
        na.hrwz[141] = -2067830089251666433L;
        na.hrwz[142] = -7833055197545780107L;
        na.hrwz[143] = -6124002803902108757L;
        na.hrwz[144] = 2575328214650415934L;
        na.hrwz[145] = 5752372351551996558L;
        na.hrwz[146] = 1993541090178103062L;
        na.hrwz[147] = -3389871891837175637L;
        na.hrwz[148] = -7409832636022995415L;
        na.hrwz[149] = 3950532167912854613L;
        na.hrwz[150] = 2824298377028752904L;
        na.hrwz[151] = 1369962656324495211L;
        na.hrwz[152] = -4932773935795943318L;
        na.hrwz[153] = 5578588489644727648L;
        na.hrwz[154] = 3968805826325220408L;
        na.hrwz[155] = 8803943659893933916L;
        na.hrwz[156] = 7151426805400611604L;
        na.hrwz[157] = 8952503397724372434L;
        na.hrwz[158] = -3001643460663361713L;
        na.hrwz[159] = -5194914721177448256L;
        na.hrwz[160] = 3093671919522527150L;
        na.hrwz[161] = -207386652212830608L;
        na.hrwz[162] = 4413876388589723814L;
        na.hrwz[163] = 3588420994496448250L;
        na.hrwz[164] = 1009421039010038480L;
        na.hrwz[165] = -4611218453440472365L;
        na.hrwz[166] = -2535815737637820688L;
        na.hrwz[167] = -7567487329171180201L;
        na.hrwz[168] = -6983717139200956230L;
        na.hrwz[169] = -7487615659456826694L;
        na.hrwz[170] = 5537864487941097968L;
        na.hrwz[171] = 2755108792008791279L;
        na.hrwz[172] = 2208904883021934898L;
        na.hrwz[173] = -9032881482273754268L;
        na.hrwz[174] = 3655218164693919847L;
        na.hrwz[175] = -1335930942554036566L;
        na.hrwz[176] = -7531617059822343232L;
        na.hrwz[177] = -1067944589063282079L;
        na.hrwz[178] = -6323525280636991270L;
        na.hrwz[179] = -1332971970371846663L;
        na.hrwz[180] = -6741546084079465019L;
        na.hrwz[181] = 8435576464030129403L;
        na.hrwz[182] = -3323239905821199097L;
        na.hrwz[183] = -3475990673054227232L;
        na.hrwz[184] = -1315749920780844115L;
        na.hrwz[185] = -3150131620159400017L;
        na.hrwz[186] = 4042103076574042509L;
        na.hrwz[187] = 2851091175204043679L;
        na.hrwz[188] = -9057539179210319132L;
        na.hrwz[189] = -7419039173240062301L;
        na.hrwz[190] = 4778572061312817212L;
        na.hrwz[191] = 7912833966060880613L;
        na.hrwz[192] = -4083885065701492017L;
        na.hrwz[193] = 4689720913808792970L;
        na.hrwz[194] = 6705206122111504092L;
        na.hrwz[195] = -8871843653142091213L;
        na.hrwz[196] = -7124044440709380966L;
        na.hrwz[197] = 8758492357933150249L;
        na.hrwz[198] = -8673538463165137231L;
        na.hrwz[199] = -8468701057789008505L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean isAvailable() {
        block16: {
            block15: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = na.ov - na.hrtz("hryu", hrwy(int ), (int)14)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v0 /* !! */  == na.hrtz("hryv", hrtw(int ), (int)107)) break;
                    v0 /* !! */  = (long)na.hrtz("hryw", hrtw(int ), (int)108);
                }
                var2 = na.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_1 = na.ov - na.hrtz("hryx", hrwy(int ), (int)15)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v1 /* !! */  == na.hrtz("hryy", hrtw(int ), (int)109)) break;
                    v1 /* !! */  = (long)na.hrtz("hryz", hrtw(int ), (int)110);
                }
                var1_1 = na.b;
                v2 /* !! */  = na.ov;
                if (true) ** GOTO lbl19
                block7: while (true) {
                    v2 /* !! */  = (long)(v3 - na.hrtz("hrza", hrwy(int ), (int)16));
lbl19:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1745317964: {
                            v3 = na.hrtz("hrzb", hrwy(int ), (int)17);
                            continue block7;
                        }
                        case -1365712053: {
                            v3 = na.hrtz("hrzc", hrwy(int ), (int)18);
                            continue block7;
                        }
                        case 1599292349: {
                            break block7;
                        }
                    }
                    break;
                }
                var0_2 = na.a;
                if (var2) {
                    throw null;
lbl31:
                    // 3 sources

                    return (boolean)na.hrtz("hrzd", hrtw(int ), (int)111);
                }
                if (var0_2 || var0_2) ** GOTO lbl31
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = na.ov - na.hrtz("hrze", hrwy(int ), (int)19)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == na.hrtz("hrzf", hrtw(int ), (int)112)) break;
                    v4 /* !! */  = (long)na.hrtz("hrzg", hrtw(int ), (int)113);
                }
                if (na.primaryBaritone() == null) break block15;
                if (var0_2) ** GOTO lbl31
                v5 = na.hrtz("hrzh", hrtw(int ), (int)114);
                if (var2) {
                    throw null;
                }
                break block16;
            }
            if (!var0_2 && !var0_2) ** break;
            ** while (true)
            v5 = na.hrtz("hrzi", hrtw(int ), (int)115);
        }
        return (boolean)v5;
    }

    private static /* synthetic */ void htcc() {
        na.hrty[500] = -416434447;
        na.hrty[501] = -2666415;
        na.hrty[502] = 1093183144;
        na.hrty[503] = 2068612075;
        na.hrty[504] = 100961020;
        na.hrty[505] = 1763886255;
        na.hrty[506] = 1586352019;
        na.hrty[507] = -1843200993;
        na.hrty[508] = -524648540;
        na.hrty[509] = -1596409109;
        na.hrty[510] = -838577830;
        na.hrty[511] = -67804974;
        na.hrty[512] = 1602557620;
        na.hrty[513] = -1802083722;
        na.hrty[514] = 321247824;
        na.hrty[515] = 470931257;
        na.hrty[516] = 1965933513;
        na.hrty[517] = -367084015;
        na.hrty[518] = -9081647;
        na.hrty[519] = -1130933868;
        na.hrty[520] = -1426109942;
        na.hrty[521] = -1151380659;
        na.hrty[522] = 962710446;
        na.hrty[523] = 1039197472;
        na.hrty[524] = -8108240;
        na.hrty[525] = -782805002;
        na.hrty[526] = -1326835978;
        na.hrty[527] = -927873364;
        na.hrty[528] = 117152839;
        na.hrty[529] = 668273310;
        na.hrty[530] = -938500798;
        na.hrty[531] = -1527031362;
        na.hrty[532] = 1036576871;
        na.hrty[533] = 49232058;
        na.hrty[534] = -916397811;
        na.hrty[535] = 1107201906;
        na.hrty[536] = 1944933144;
        na.hrty[537] = 42234016;
        na.hrty[538] = -1933072700;
        na.hrty[539] = -344861701;
        na.hrty[540] = 590152161;
        na.hrty[541] = 296769194;
        na.hrty[542] = -1422253068;
        na.hrty[543] = -1187744902;
        na.hrty[544] = 477346881;
        na.hrty[545] = -269841236;
        na.hrty[546] = -1436955569;
        na.hrty[547] = 1074291823;
        na.hrty[548] = -430007480;
        na.hrty[549] = -1106007418;
        na.hrty[550] = -1208044133;
        na.hrty[551] = -1988936545;
        na.hrty[552] = 2003872192;
        na.hrty[553] = 2105177926;
        na.hrty[554] = 560330485;
        na.hrty[555] = -1462734197;
        na.hrty[556] = 520565803;
        na.hrty[557] = -1817248536;
        na.hrty[558] = -1965808513;
        na.hrty[559] = 1586501823;
        na.hrty[560] = 1668603228;
        na.hrty[561] = -1674980129;
        na.hrty[562] = 880526574;
        na.hrty[563] = 1845167484;
        na.hrty[564] = -1715244078;
        na.hrty[565] = -1444351374;
        na.hrty[566] = -855833826;
        na.hrty[567] = -549039922;
        na.hrty[568] = 498505789;
        na.hrty[569] = -1776803875;
        na.hrty[570] = 7587904;
        na.hrty[571] = 977015109;
        na.hrty[572] = -1419180396;
        na.hrty[573] = -2102813502;
        na.hrty[574] = 508730731;
        na.hrty[575] = 867723027;
        na.hrty[576] = 2000476070;
        na.hrty[577] = 1149842450;
        na.hrty[578] = 415729437;
        na.hrty[579] = -700834285;
        na.hrty[580] = 1099854317;
        na.hrty[581] = -502186478;
        na.hrty[582] = -1352554340;
        na.hrty[583] = -680610166;
        na.hrty[584] = 1275438363;
        na.hrty[585] = -1085451860;
        na.hrty[586] = 350371415;
        na.hrty[587] = -56561200;
        na.hrty[588] = -1831867944;
        na.hrty[589] = 1950287145;
        na.hrty[590] = -494232237;
        na.hrty[591] = 1951177280;
        na.hrty[592] = 128357655;
        na.hrty[593] = -1830190495;
        na.hrty[594] = -2078441951;
        na.hrty[595] = 147469597;
        na.hrty[596] = -243917399;
        na.hrty[597] = 1624351734;
        na.hrty[598] = -2077623175;
        na.hrty[599] = 368679826;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static Object getSettingSafe(Object var0, String var1_1) {
        v0 /* !! */  = na.ov;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(na.hrtz("hsth", hrwy(int ), (int)138) - na.hrtz("hstg", hrwy(int ), (int)137));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1347720119: {
                    continue block24;
                }
                case 1599292349: {
                    break block24;
                }
            }
            break;
        }
        var5_2 = na.c;
        v1 /* !! */  = na.ov;
        if (true) ** GOTO lbl15
        block25: while (true) {
            v1 /* !! */  = (long)(na.hrtz("hstj", hrwy(int ), (int)140) - na.hrtz("hsti", hrwy(int ), (int)139));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1844894428: {
                    continue block25;
                }
                case 1599292349: {
                    break block25;
                }
            }
            break;
        }
        var4_3 /* !! */  = na.b;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = na.ov;
                if (true) ** GOTO lbl28
                block26: while (true) {
                    v2 /* !! */  = (long)(v3 - na.hrtz("hstk", hrwy(int ), (int)141));
lbl28:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -839058610: {
                            v3 = na.hrtz("hstl", hrwy(int ), (int)142);
                            continue block26;
                        }
                        case 314078864: {
                            v3 = na.hrtz("hstm", hrwy(int ), (int)143);
                            continue block26;
                        }
                        case 555866931: {
                            v3 = na.hrtz("hstn", hrwy(int ), (int)144);
                            continue block26;
                        }
                        case 1599292349: {
                            break block26;
                        }
                    }
                    break;
                }
                var3_4 = na.a;
                if (var5_2) {
                    throw null;
lbl43:
                    // 3 sources

                    return null;
                }
                if (var3_4) ** GOTO lbl43
                try {
                    if (var3_4) ** GOTO lbl43
                    while (true) {
                        if ((v4 /* !! */  = (cfr_temp_0 = na.ov - na.hrtz("hsto", hrwy(int ), (int)145)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v4 /* !! */  == na.hrtz("hstp", hrtw(int ), (int)515)) break;
                        v4 /* !! */  = (long)na.hrtz("hstq", hrtw(int ), (int)516);
                    }
                    return na.getSetting(var0, var1_1);
                }
                catch (Exception var2_5) {
                    if (!var3_4 && !var3_4) ** break;
                    ** continue;
                    return null;
                }
            }
lbl59:
            // 4 sources

            case 0: {
                var4_3 /* !! */  = (int)na.hrtz("hstr", hrtw(int ), (int)517);
                if (!var5_2) break;
                throw null;
            }
            case 1: {
                var4_3 /* !! */  = (int)na.hrtz("hsts", hrtw(int ), (int)518);
                if (!var5_2) ** GOTO lbl59
                throw null;
            }
lbl67:
            // 2 sources

            case 2: {
                var4_3 /* !! */  = (int)na.hrtz("hstt", hrtw(int ), (int)519);
                if (!var5_2) ** GOTO lbl59
                throw null;
            }
            case 3: {
                var4_3 /* !! */  = (int)na.hrtz("hstu", hrtw(int ), (int)520);
                if (!var5_2) ** GOTO lbl67
                throw null;
            }
            case 4: {
                var4_3 /* !! */  = (int)na.hrtz("hstv", hrtw(int ), (int)521);
                if (!var5_2) ** GOTO lbl59
                throw null;
            }
            case 5: 
        }
        do {
            var4_3 /* !! */  = (int)na.hrtz("hstw", hrtw(int ), (int)522);
        } while (!var5_2);
        throw null;
    }

    private static /* synthetic */ void htcj() {
        na.hrxa[200] = -4186515156729727753L;
        na.hrxa[201] = -9162998685291510866L;
        na.hrxa[202] = -1325356568245093771L;
        na.hrxa[203] = -2251265137815070571L;
        na.hrxa[204] = -3428046785085821478L;
        na.hrxa[205] = 1750676834703105290L;
        na.hrxa[206] = 4236952139331982752L;
        na.hrxa[207] = 7259424648640790827L;
        na.hrxa[208] = -5671659144207516924L;
        na.hrxa[209] = 1080163851596066109L;
        na.hrxa[210] = -7924528972616044488L;
        na.hrxa[211] = 3141124769364722804L;
        na.hrxa[212] = -2455016997313333103L;
        na.hrxa[213] = 2132862428357949516L;
        na.hrxa[214] = -2761610114702290542L;
        na.hrxa[215] = 8286629955945180042L;
        na.hrxa[216] = 3631102129668724126L;
        na.hrxa[217] = 199730968575488050L;
        na.hrxa[218] = -569196957998933641L;
        na.hrxa[219] = -294573650361841597L;
        na.hrxa[220] = 2628124956106373821L;
        na.hrxa[221] = -8619482857242082536L;
        na.hrxa[222] = 176740751264935078L;
        na.hrxa[223] = -5098271159385702909L;
        na.hrxa[224] = -8682918312945118910L;
        na.hrxa[225] = -17060179347248855L;
        na.hrxa[226] = 124682153631785734L;
    }

    /*
     * Exception decompiling
     */
    public static void setCommandsEnabled(boolean var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 6[CASE]
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
    private static void snapshotIfNeeded(Object var0) throws Exception {
        block74: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = na.ov - na.hrtz("hsuq", hrwy(int ), (int)152)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == na.hrtz("hsur", hrtw(int ), (int)536)) break;
                v0 /* !! */  = (long)na.hrtz("hsus", hrtw(int ), (int)537);
            }
            var7_1 = na.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = na.ov - na.hrtz("hsut", hrwy(int ), (int)153)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == na.hrtz("hsuu", hrtw(int ), (int)538)) break;
                v1 /* !! */  = (long)na.hrtz("hsuv", hrtw(int ), (int)539);
            }
            var6_2 /* !! */  = na.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = na.ov - na.hrtz("hsuw", hrwy(int ), (int)154)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == na.hrtz("hsux", hrtw(int ), (int)540)) break;
                v2 /* !! */  = (long)na.hrtz("hsuy", hrtw(int ), (int)541);
            }
            var5_3 = na.a;
            if (var7_1) {
                throw null;
lbl21:
                // 13 sources

                return;
            }
            if (var5_3 || var5_3) ** GOTO lbl21
            v3 /* !! */  = na.ov;
            if (true) ** GOTO lbl28
            block49: while (true) {
                v3 /* !! */  = (long)(v4 - na.hrtz("hsuz", hrwy(int ), (int)155));
lbl28:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -274712434: {
                        v4 = na.hrtz("hsva", hrwy(int ), (int)156);
                        continue block49;
                    }
                    case 1045740477: {
                        v4 = na.hrtz("hsvb", hrwy(int ), (int)157);
                        continue block49;
                    }
                    case 1599292349: {
                        break block49;
                    }
                }
                break;
            }
            v5 /* !! */  = na.ov;
            if (true) ** GOTO lbl41
            block50: while (true) {
                v5 /* !! */  = (long)(v6 - na.hrtz("hsvc", hrwy(int ), (int)158));
lbl41:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1614203130: {
                        v6 = na.hrtz("hsvd", hrwy(int ), (int)159);
                        continue block50;
                    }
                    case -1037485836: {
                        v6 = na.hrtz("hsve", hrwy(int ), (int)160);
                        continue block50;
                    }
                    case 524166469: {
                        v6 = na.hrtz("hsvf", hrwy(int ), (int)161);
                        continue block50;
                    }
                    case 1599292349: {
                        break block50;
                    }
                }
                break;
            }
            if (na.settingsSnapshot.isEmpty()) break block74;
            if (var5_3 || var5_3) ** GOTO lbl21
            return;
        }
        if (var5_3 || var5_3) ** GOTO lbl21
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_3 = na.ov - na.hrtz("hsvg", hrwy(int ), (int)162)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == na.hrtz("hsvh", hrtw(int ), (int)542)) break;
            v7 /* !! */  = (long)na.hrtz("hsvi", hrtw(int ), (int)543);
        }
        var1_4 = na.AUTO_SETTINGS;
        if (var5_3) ** GOTO lbl21
        var2_5 = var1_4.length;
        if (var5_3) ** GOTO lbl21
        var3_6 = na.hrtz("hsvj", hrtw(int ), (int)544);
        if (var5_3) ** GOTO lbl21
        block52: while (true) {
            if (var5_3 || var5_3) ** GOTO lbl21
            if (var3_6 >= var2_5) ** GOTO lbl117
            if (var5_3) ** GOTO lbl21
            var4_7 = var1_4[var3_6];
            if (var5_3) ** GOTO lbl21
            if (var6_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var6_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var5_3) ** GOTO lbl21
                    v8 /* !! */  = na.ov;
                    if (true) ** GOTO lbl83
                    block53: while (true) {
                        v8 /* !! */  = (long)(v9 - na.hrtz("hsvk", hrwy(int ), (int)163));
lbl83:
                        // 2 sources

                        switch ((int)v8 /* !! */ ) {
                            case -1640795384: {
                                v9 = na.hrtz("hsvl", hrwy(int ), (int)164);
                                continue block53;
                            }
                            case -1537158670: {
                                v9 = na.hrtz("hsvm", hrwy(int ), (int)165);
                                continue block53;
                            }
                            case -186004577: {
                                v9 = na.hrtz("hsvn", hrwy(int ), (int)166);
                                continue block53;
                            }
                            case 1599292349: {
                                break block53;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v10 /* !! */  = (cfr_temp_4 = na.ov - na.hrtz("hsvo", hrwy(int ), (int)167)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v10 /* !! */  == na.hrtz("hsvp", hrtw(int ), (int)545)) break;
                        v10 /* !! */  = (long)na.hrtz("hsvq", hrtw(int ), (int)546);
                    }
                    v11 = na.getSetting(var0, var4_7);
                    v12 /* !! */  = na.ov;
                    if (true) ** GOTO lbl105
                    block55: while (true) {
                        v12 /* !! */  = (long)(na.hrtz("hsvs", hrwy(int ), (int)169) - na.hrtz("hsvr", hrwy(int ), (int)168));
lbl105:
                        // 2 sources

                        switch ((int)v12 /* !! */ ) {
                            case 84844530: {
                                continue block55;
                            }
                            case 1599292349: {
                                break block55;
                            }
                        }
                        break;
                    }
                    na.settingsSnapshot.put(var4_7, v11);
                    if (var5_3 || var5_3) ** GOTO lbl21
                    ++var3_6;
                    if (var5_3) ** GOTO lbl21
                    if (!var7_1) continue block52;
                    throw null;
                }
lbl117:
                // 1 sources

                if (!var5_3 && !var5_3) ** break;
                ** continue;
                return;
lbl120:
                // 3 sources

                case 0: {
                    var6_2 /* !! */  = (int)na.hrtz("hsvt", hrtw(int ), (int)547);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl153
                }
                case 1: {
                    var6_2 /* !! */  = (int)na.hrtz("hsvu", hrtw(int ), (int)548);
                    if (var7_1) {
                        throw null;
                    }
                }
lbl129:
                // 4 sources

                case 2: {
                    var6_2 /* !! */  = (int)na.hrtz("hsvv", hrtw(int ), (int)549);
                    if (!var7_1) ** GOTO lbl120
                    throw null;
                }
                case 3: {
                    var6_2 /* !! */  = (int)na.hrtz("hsvw", hrtw(int ), (int)550);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl195
                }
lbl138:
                // 2 sources

                case 4: {
                    do {
                        var6_2 /* !! */  = (int)na.hrtz("hsvx", hrtw(int ), (int)551);
                    } while (!var7_1);
                    throw null;
                }
                case 5: {
                    var6_2 /* !! */  = (int)na.hrtz("hsvy", hrtw(int ), (int)552);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl183
                }
                case 6: {
                    var6_2 /* !! */  = (int)na.hrtz("hsvz", hrtw(int ), (int)553);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl187
                }
lbl153:
                // 2 sources

                case 7: {
                    var6_2 /* !! */  = (int)na.hrtz("hswa", hrtw(int ), (int)554);
                    if (!var7_1) ** GOTO lbl138
                    throw null;
                }
lbl157:
                // 4 sources

                case 8: {
                    var6_2 /* !! */  = (int)na.hrtz("hswb", hrtw(int ), (int)555);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl199
                }
lbl162:
                // 3 sources

                case 9: {
                    var6_2 /* !! */  = (int)na.hrtz("hswc", hrtw(int ), (int)556);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl175
                }
                case 10: {
                    var6_2 /* !! */  = (int)na.hrtz("hswd", hrtw(int ), (int)557);
                    if (!var7_1) ** GOTO lbl157
                    throw null;
                }
                case 11: {
                    var6_2 /* !! */  = (int)na.hrtz("hswe", hrtw(int ), (int)558);
                    if (!var7_1) ** GOTO lbl129
                    throw null;
                }
lbl175:
                // 2 sources

                case 12: {
                    var6_2 /* !! */  = (int)na.hrtz("hswf", hrtw(int ), (int)559);
                    if (!var7_1) ** GOTO lbl162
                    throw null;
                }
lbl179:
                // 3 sources

                case 13: {
                    var6_2 /* !! */  = (int)na.hrtz("hswg", hrtw(int ), (int)560);
                    if (!var7_1) ** GOTO lbl162
                    throw null;
                }
lbl183:
                // 3 sources

                case 14: {
                    var6_2 /* !! */  = (int)na.hrtz("hswh", hrtw(int ), (int)561);
                    if (!var7_1) ** GOTO lbl157
                    throw null;
                }
lbl187:
                // 2 sources

                case 15: {
                    var6_2 /* !! */  = (int)na.hrtz("hswi", hrtw(int ), (int)562);
                    if (!var7_1) ** GOTO lbl120
                    throw null;
                }
                case 16: {
                    var6_2 /* !! */  = (int)na.hrtz("hswj", hrtw(int ), (int)563);
                    if (!var7_1) ** GOTO lbl183
                    throw null;
                }
lbl195:
                // 3 sources

                case 17: {
                    var6_2 /* !! */  = (int)na.hrtz("hswk", hrtw(int ), (int)564);
                    if (!var7_1) ** GOTO lbl157
                    throw null;
                }
lbl199:
                // 2 sources

                case 18: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var6_2 /* !! */  = (int)na.hrtz("hswl", hrtw(int ), (int)565);
                        if (!var7_1) ** GOTO lbl179
                        throw null;
                    }
                }
                case 19: {
                    var6_2 /* !! */  = (int)na.hrtz("hswm", hrtw(int ), (int)566);
                    if (!var7_1) ** GOTO lbl195
                    throw null;
                }
                case 20: {
                    var6_2 /* !! */  = (int)na.hrtz("hswn", hrtw(int ), (int)567);
                    if (!var7_1) ** GOTO lbl179
                    throw null;
                }
                case 21: 
            }
            break;
        }
        var6_2 /* !! */  = (int)na.hrtz("hswo", hrtw(int ), (int)568);
        ** while (!var7_1)
lbl215:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void htbu() {
        na.hrtx[400] = -634729205;
        na.hrtx[401] = -567732731;
        na.hrtx[402] = -1839862803;
        na.hrtx[403] = 570592450;
        na.hrtx[404] = -1584891430;
        na.hrtx[405] = 954165407;
        na.hrtx[406] = -1028590987;
        na.hrtx[407] = -1231516917;
        na.hrtx[408] = -1770352884;
        na.hrtx[409] = 393087455;
        na.hrtx[410] = 1853043637;
        na.hrtx[411] = -262543084;
        na.hrtx[412] = -1408982638;
        na.hrtx[413] = -1161048923;
        na.hrtx[414] = 1514808376;
        na.hrtx[415] = 1492850902;
        na.hrtx[416] = -2005529267;
        na.hrtx[417] = 741544984;
        na.hrtx[418] = -1147610124;
        na.hrtx[419] = -241389311;
        na.hrtx[420] = -1170409954;
        na.hrtx[421] = 1462989147;
        na.hrtx[422] = -1758186136;
        na.hrtx[423] = 908548162;
        na.hrtx[424] = -2014425378;
        na.hrtx[425] = -1795073740;
        na.hrtx[426] = 1709795502;
        na.hrtx[427] = -1705083243;
        na.hrtx[428] = -778860846;
        na.hrtx[429] = -1075037264;
        na.hrtx[430] = 799330771;
        na.hrtx[431] = -1431582767;
        na.hrtx[432] = 929412128;
        na.hrtx[433] = 1168644341;
        na.hrtx[434] = 1593137444;
        na.hrtx[435] = 480615702;
        na.hrtx[436] = 1975957079;
        na.hrtx[437] = 623860950;
        na.hrtx[438] = 1801584398;
        na.hrtx[439] = 455688889;
        na.hrtx[440] = 602297995;
        na.hrtx[441] = 1512041914;
        na.hrtx[442] = 639288659;
        na.hrtx[443] = 145887969;
        na.hrtx[444] = -286239616;
        na.hrtx[445] = -874724997;
        na.hrtx[446] = 1783453572;
        na.hrtx[447] = 35674591;
        na.hrtx[448] = -2012466635;
        na.hrtx[449] = -413569624;
        na.hrtx[450] = -917161373;
        na.hrtx[451] = 777873925;
        na.hrtx[452] = 633584618;
        na.hrtx[453] = 95792581;
        na.hrtx[454] = 748699281;
        na.hrtx[455] = 652200071;
        na.hrtx[456] = -524880046;
        na.hrtx[457] = 2141909687;
        na.hrtx[458] = -934255057;
        na.hrtx[459] = -290348082;
        na.hrtx[460] = -1402626875;
        na.hrtx[461] = -2091168446;
        na.hrtx[462] = -1038485155;
        na.hrtx[463] = 1762331217;
        na.hrtx[464] = 783580950;
        na.hrtx[465] = -1154331047;
        na.hrtx[466] = -494610133;
        na.hrtx[467] = -1145793313;
        na.hrtx[468] = -766016546;
        na.hrtx[469] = -1233279117;
        na.hrtx[470] = 866404895;
        na.hrtx[471] = 1266578968;
        na.hrtx[472] = 2007962888;
        na.hrtx[473] = 141338651;
        na.hrtx[474] = 2009645533;
        na.hrtx[475] = 90384438;
        na.hrtx[476] = -1758320235;
        na.hrtx[477] = -981276954;
        na.hrtx[478] = -1998358772;
        na.hrtx[479] = -592697484;
        na.hrtx[480] = 1584156366;
        na.hrtx[481] = -1954829307;
        na.hrtx[482] = -1635009926;
        na.hrtx[483] = -253595354;
        na.hrtx[484] = -819375386;
        na.hrtx[485] = -1990135489;
        na.hrtx[486] = 420633855;
        na.hrtx[487] = -994329992;
        na.hrtx[488] = -1780583116;
        na.hrtx[489] = 376572326;
        na.hrtx[490] = 873440250;
        na.hrtx[491] = -1664053477;
        na.hrtx[492] = -1292156385;
        na.hrtx[493] = -1415361837;
        na.hrtx[494] = 513578105;
        na.hrtx[495] = 1089918284;
        na.hrtx[496] = 550140903;
        na.hrtx[497] = 1983988104;
        na.hrtx[498] = -1557097543;
        na.hrtx[499] = 1759469220;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void setAllowBreak(boolean var0) {
        block66: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = na.ov - na.hrtz("hsov", hrwy(int ), (int)119)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == na.hrtz("hsow", hrtw(int ), (int)419)) break;
                v0 /* !! */  = (long)na.hrtz("hsox", hrtw(int ), (int)420);
            }
            var4_1 = na.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = na.ov - na.hrtz("hsoy", hrwy(int ), (int)120)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == na.hrtz("hsoz", hrtw(int ), (int)421)) break;
                v1 /* !! */  = (long)na.hrtz("hspa", hrtw(int ), (int)422);
            }
            var3_2 /* !! */  = na.b;
            v2 /* !! */  = na.ov;
            if (true) ** GOTO lbl17
            block42: while (true) {
                v2 /* !! */  = (long)(v3 - na.hrtz("hspb", hrwy(int ), (int)121));
lbl17:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1709919829: {
                        v3 = na.hrtz("hspc", hrwy(int ), (int)122);
                        continue block42;
                    }
                    case 908690662: {
                        v3 = na.hrtz("hspd", hrwy(int ), (int)123);
                        continue block42;
                    }
                    case 1481278581: {
                        v3 = na.hrtz("hspe", hrwy(int ), (int)124);
                        continue block42;
                    }
                    case 1599292349: {
                        break block42;
                    }
                }
                break;
            }
            var2_3 = na.a;
            if (var4_1) {
                throw null;
lbl32:
                // 9 sources

                return;
            }
            if (var2_3 || var2_3) ** GOTO lbl32
            v4 /* !! */  = na.ov;
            if (true) ** GOTO lbl39
            block44: while (true) {
                v4 /* !! */  = (long)(v5 - na.hrtz("hspf", hrwy(int ), (int)125));
lbl39:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -1976010590: {
                        v5 = na.hrtz("hspg", hrwy(int ), (int)126);
                        continue block44;
                    }
                    case -793085978: {
                        v5 = na.hrtz("hsph", hrwy(int ), (int)127);
                        continue block44;
                    }
                    case 28971027: {
                        v5 = na.hrtz("hspi", hrwy(int ), (int)128);
                        continue block44;
                    }
                    case 1599292349: {
                        break block44;
                    }
                }
                break;
            }
            na.resolve();
            if (var2_3 || var2_3) ** GOTO lbl32
            v6 /* !! */  = na.ov;
            if (true) ** GOTO lbl57
            block45: while (true) {
                v6 /* !! */  = (long)(v7 - na.hrtz("hspj", hrwy(int ), (int)129));
lbl57:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -1775018015: {
                        v7 = na.hrtz("hspk", hrwy(int ), (int)130);
                        continue block45;
                    }
                    case 557922918: {
                        v7 = na.hrtz("hspl", hrwy(int ), (int)131);
                        continue block45;
                    }
                    case 938953305: {
                        v7 = na.hrtz("hspm", hrwy(int ), (int)132);
                        continue block45;
                    }
                    case 1599292349: {
                        break block45;
                    }
                }
                break;
            }
            if (na.available) break block66;
            if (var2_3 || var2_3) ** GOTO lbl32
            return;
        }
        try {
            if (var2_3 || var2_3) ** GOTO lbl32
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_2 = na.ov - na.hrtz("hspn", hrwy(int ), (int)133)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == na.hrtz("hspo", hrtw(int ), (int)423)) break;
                v8 /* !! */  = (long)na.hrtz("hspp", hrtw(int ), (int)424);
            }
            v9 = new Object[]{};
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_3 = na.ov - na.hrtz("hspq", hrwy(int ), (int)134)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == na.hrtz("hspr", hrtw(int ), (int)425)) break;
                v10 /* !! */  = (long)na.hrtz("hsps", hrtw(int ), (int)426);
            }
            var1_4 = na.getSettingsMethod.invoke(null, v9);
            if (var2_3 || var2_3) ** GOTO lbl32
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_4 = na.ov - na.hrtz("hspt", hrwy(int ), (int)135)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == na.hrtz("hspu", hrtw(int ), (int)427)) break;
                v11 /* !! */  = (long)na.hrtz("hspv", hrtw(int ), (int)428);
            }
            v12 = var0;
            while (true) {
                if ((v13 /* !! */  = (cfr_temp_5 = na.ov - na.hrtz("hspw", hrwy(int ), (int)136)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v13 /* !! */  == na.hrtz("hspx", hrtw(int ), (int)429)) break;
                v13 /* !! */  = (long)na.hrtz("hspy", hrtw(int ), (int)430);
            }
            na.setSetting(var1_4, "allowBreak", v12);
            if (var2_3 || var2_3) ** GOTO lbl32
            ** if (!var4_1) goto lbl-1000
        }
        catch (Exception var1_5) {
            if (var2_3) ** GOTO lbl32
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
        if (var2_3) ** GOTO lbl32
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_2 /* !! */  = (int)na.hrtz("hspz", hrtw(int ), (int)431);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl141
            }
lbl118:
            // 3 sources

            case 1: {
                var3_2 /* !! */  = (int)na.hrtz("hsqa", hrtw(int ), (int)432);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl146
            }
            case 2: {
                var3_2 /* !! */  = (int)na.hrtz("hsqb", hrtw(int ), (int)433);
                if (!var4_1) break;
                throw null;
            }
            case 3: {
                var3_2 /* !! */  = (int)na.hrtz("hsqc", hrtw(int ), (int)434);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl132:
            // 2 sources

            case 4: {
                var3_2 /* !! */  = (int)na.hrtz("hsqd", hrtw(int ), (int)435);
                if (!var4_1) ** GOTO lbl118
                throw null;
            }
lbl136:
            // 2 sources

            case 5: {
                var3_2 /* !! */  = (int)na.hrtz("hsqe", hrtw(int ), (int)436);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl171
            }
lbl141:
            // 2 sources

            case 6: {
                var3_2 /* !! */  = (int)na.hrtz("hsqf", hrtw(int ), (int)437);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl146:
            // 2 sources

            case 7: {
                var3_2 /* !! */  = (int)na.hrtz("hsqg", hrtw(int ), (int)438);
                if (var4_1) {
                    throw null;
                }
            }
            case 8: {
                var3_2 /* !! */  = (int)na.hrtz("hsqh", hrtw(int ), (int)439);
                if (!var4_1) ** GOTO lbl136
                throw null;
            }
lbl154:
            // 3 sources

            case 9: {
                var3_2 /* !! */  = (int)na.hrtz("hsqi", hrtw(int ), (int)440);
                if (!var4_1) ** GOTO lbl118
                throw null;
            }
lbl158:
            // 2 sources

            case 10: {
                var3_2 /* !! */  = (int)na.hrtz("hsqj", hrtw(int ), (int)441);
                if (!var4_1) break;
                throw null;
            }
lbl162:
            // 2 sources

            case 11: {
                var3_2 /* !! */  = (int)na.hrtz("hsqk", hrtw(int ), (int)442);
                if (!var4_1) break;
                throw null;
            }
lbl166:
            // 2 sources

            case 12: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)na.hrtz("hsql", hrtw(int ), (int)443);
                    if (!var4_1) ** GOTO lbl132
                    throw null;
                }
            }
lbl171:
            // 2 sources

            case 13: {
                var3_2 /* !! */  = (int)na.hrtz("hsqm", hrtw(int ), (int)444);
                if (!var4_1) ** GOTO lbl154
                throw null;
            }
            case 14: {
                var3_2 /* !! */  = (int)na.hrtz("hsqn", hrtw(int ), (int)445);
                if (!var4_1) ** GOTO lbl158
                throw null;
            }
            case 15: {
                var3_2 /* !! */  = (int)na.hrtz("hsqo", hrtw(int ), (int)446);
                if (!var4_1) ** GOTO lbl162
                throw null;
            }
            case 16: {
                do {
                    var3_2 /* !! */  = (int)na.hrtz("hsqp", hrtw(int ), (int)447);
                } while (!var4_1);
                throw null;
            }
            case 17: 
        }
        var3_2 /* !! */  = (int)na.hrtz("hsqq", hrtw(int ), (int)448);
        ** while (!var4_1)
lbl191:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void htbw() {
        na.hrtx[600] = 1571161414;
        na.hrtx[601] = 970634690;
        na.hrtx[602] = 548875219;
        na.hrtx[603] = -198245122;
        na.hrtx[604] = -1292005773;
        na.hrtx[605] = -1287100245;
        na.hrtx[606] = 1144117933;
        na.hrtx[607] = 748997763;
        na.hrtx[608] = -388494863;
        na.hrtx[609] = 1570746500;
        na.hrtx[610] = 1396816798;
        na.hrtx[611] = -1127309294;
        na.hrtx[612] = -1140542535;
        na.hrtx[613] = 1415831897;
        na.hrtx[614] = -1248705430;
        na.hrtx[615] = -550170298;
        na.hrtx[616] = 495123872;
        na.hrtx[617] = -209265392;
        na.hrtx[618] = 1307955851;
        na.hrtx[619] = -1470502932;
        na.hrtx[620] = -1271380463;
        na.hrtx[621] = 1403435040;
        na.hrtx[622] = -265907947;
        na.hrtx[623] = -1162159290;
        na.hrtx[624] = -1412728085;
        na.hrtx[625] = 580588707;
        na.hrtx[626] = -1659787806;
        na.hrtx[627] = 818727225;
        na.hrtx[628] = 314457239;
        na.hrtx[629] = -1921559419;
        na.hrtx[630] = -400272402;
        na.hrtx[631] = 11168446;
        na.hrtx[632] = -1852011803;
        na.hrtx[633] = 1342437051;
        na.hrtx[634] = 1817145999;
        na.hrtx[635] = -1988766116;
        na.hrtx[636] = -1229826041;
        na.hrtx[637] = -1944443068;
        na.hrtx[638] = 2080603276;
        na.hrtx[639] = -411987557;
        na.hrtx[640] = 1657286064;
        na.hrtx[641] = 1755423123;
        na.hrtx[642] = -656991191;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static Object getSetting(Object object, String string) throws Exception {
        boolean bl2;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = ov - na.hrtz("hsyz", hrwy(int ), (int)194)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == na.hrtz("hsza", hrtw(int ), (int)607)) break;
            object2 = na.hrtz("hszb", hrtw(int ), (int)608);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = ov - na.hrtz("hszc", hrwy(int ), (int)195)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == na.hrtz("hszd", hrtw(int ), (int)609)) break;
            object3 = na.hrtz("hsze", hrtw(int ), (int)610);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object4;
            if ((object4 = (l4 = ov - na.hrtz("hszf", hrwy(int ), (int)196)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object4 == na.hrtz("hszg", hrtw(int ), (int)611)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object4 = na.hrtz("hszh", hrtw(int ), (int)612);
        }
        if (bl2) return null;
        if (bl2) return null;
        Object object5 = ov;
        block23: while (true) {
            switch ((int)object5) {
                case 838717897: {
                    object5 = na.hrtz("hszj", hrwy(int ), (int)198) - na.hrtz("hszi", hrwy(int ), (int)197);
                    continue block23;
                }
                case 1599292349: {
                    break block23;
                }
            }
            break;
        }
        Class<?> clazz = object.getClass();
        Object object6 = ov;
        boolean bl4 = true;
        block24: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object6 = callSite - na.hrtz("hszk", hrwy(int ), (int)199);
            }
            switch ((int)object6) {
                case -2140373950: {
                    callSite = na.hrtz("hszl", hrwy(int ), (int)200);
                    continue block24;
                }
                case -370056324: {
                    callSite = na.hrtz("hszm", hrwy(int ), (int)201);
                    continue block24;
                }
                case 1599292349: {
                    break block24;
                }
            }
            break;
        }
        Field field = clazz.getField(string);
        Object object7 = ov;
        boolean bl5 = true;
        block25: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object7 = callSite - na.hrtz("hszn", hrwy(int ), (int)202);
            }
            switch ((int)object7) {
                case -1632716319: {
                    callSite = na.hrtz("hszo", hrwy(int ), (int)203);
                    continue block25;
                }
                case 1599292349: {
                    break block25;
                }
                case 2039841180: {
                    callSite = na.hrtz("hszp", hrwy(int ), (int)204);
                    continue block25;
                }
            }
            break;
        }
        Object object8 = field.get(object);
        if (bl2) return null;
        if (bl2) return null;
        Object object9 = ov;
        boolean bl6 = true;
        block26: while (true) {
            CallSite callSite;
            if (!bl6 || (bl6 = false) || !true) {
                object9 = callSite - na.hrtz("hszq", hrwy(int ), (int)205);
            }
            switch ((int)object9) {
                case -327044295: {
                    callSite = na.hrtz("hszr", hrwy(int ), (int)206);
                    continue block26;
                }
                case -239127703: {
                    callSite = na.hrtz("hszs", hrwy(int ), (int)207);
                    continue block26;
                }
                case 1478875726: {
                    callSite = na.hrtz("hszt", hrwy(int ), (int)208);
                    continue block26;
                }
                case 1599292349: {
                    break block26;
                }
            }
            break;
        }
        Class<?> clazz2 = object8.getClass();
        while (true) {
            long l5;
            Object object10;
            if ((object10 = (l5 = ov - na.hrtz("hszu", hrwy(int ), (int)209)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object10 == na.hrtz("hszv", hrtw(int ), (int)613)) break;
            object10 = na.hrtz("hszw", hrtw(int ), (int)614);
        }
        Field field2 = clazz2.getField("value");
        if (bl2) return null;
        if (bl2) return null;
        while (true) {
            long l6;
            Object object11;
            if ((object11 = (l6 = ov - na.hrtz("hszx", hrwy(int ), (int)210)) == 0L ? 0 : (l6 < 0L ? -1 : 1)) == false) continue;
            if (object11 == na.hrtz("hszy", hrtw(int ), (int)615)) {
                return field2.get(object8);
            }
            object11 = na.hrtz("hszz", hrtw(int ), (int)616);
        }
    }

    private static /* synthetic */ void htbv() {
        na.hrtx[500] = -416434434;
        na.hrtx[501] = -2666410;
        na.hrtx[502] = 1093183133;
        na.hrtx[503] = 2068612058;
        na.hrtx[504] = 100960987;
        na.hrtx[505] = 1763886212;
        na.hrtx[506] = 1586352062;
        na.hrtx[507] = -1843200991;
        na.hrtx[508] = -524648563;
        na.hrtx[509] = -1596409102;
        na.hrtx[510] = -838577805;
        na.hrtx[511] = -67804985;
        na.hrtx[512] = 1602557586;
        na.hrtx[513] = -1802083722;
        na.hrtx[514] = 321247809;
        na.hrtx[515] = 470931256;
        na.hrtx[516] = 1779754287;
        na.hrtx[517] = -367084011;
        na.hrtx[518] = -9081648;
        na.hrtx[519] = -1130933872;
        na.hrtx[520] = -1426109943;
        na.hrtx[521] = -1151380657;
        na.hrtx[522] = 962710443;
        na.hrtx[523] = -1039197473;
        na.hrtx[524] = -865207318;
        na.hrtx[525] = -782805001;
        na.hrtx[526] = 1222881966;
        na.hrtx[527] = -927873361;
        na.hrtx[528] = 117152847;
        na.hrtx[529] = 668273307;
        na.hrtx[530] = -938500799;
        na.hrtx[531] = -1527031361;
        na.hrtx[532] = 1036576867;
        na.hrtx[533] = 49232062;
        na.hrtx[534] = -916397813;
        na.hrtx[535] = 1107201907;
        na.hrtx[536] = 1944933145;
        na.hrtx[537] = -147694987;
        na.hrtx[538] = -1933072699;
        na.hrtx[539] = -1721065437;
        na.hrtx[540] = 590152160;
        na.hrtx[541] = 1063281908;
        na.hrtx[542] = -1422253067;
        na.hrtx[543] = 1618899777;
        na.hrtx[544] = 477346881;
        na.hrtx[545] = -269841235;
        na.hrtx[546] = 1599880059;
        na.hrtx[547] = 1074291818;
        na.hrtx[548] = -430007484;
        na.hrtx[549] = -1106007420;
        na.hrtx[550] = -1208044145;
        na.hrtx[551] = -1988936562;
        na.hrtx[552] = 2003872199;
        na.hrtx[553] = 2105177943;
        na.hrtx[554] = 560330491;
        na.hrtx[555] = -1462734195;
        na.hrtx[556] = 520565817;
        na.hrtx[557] = -1817248541;
        na.hrtx[558] = -1965808532;
        na.hrtx[559] = 1586501812;
        na.hrtx[560] = 1668603224;
        na.hrtx[561] = -1674980146;
        na.hrtx[562] = 880526564;
        na.hrtx[563] = 1845167479;
        na.hrtx[564] = -1715244071;
        na.hrtx[565] = -1444351391;
        na.hrtx[566] = -855833833;
        na.hrtx[567] = -549039909;
        na.hrtx[568] = 498505768;
        na.hrtx[569] = -1776803876;
        na.hrtx[570] = -1700606695;
        na.hrtx[571] = 977015108;
        na.hrtx[572] = -295909311;
        na.hrtx[573] = -2102813501;
        na.hrtx[574] = 638816028;
        na.hrtx[575] = 867723026;
        na.hrtx[576] = 160414093;
        na.hrtx[577] = 1149842451;
        na.hrtx[578] = 415442048;
        na.hrtx[579] = -700834286;
        na.hrtx[580] = 15922554;
        na.hrtx[581] = -502186477;
        na.hrtx[582] = -1828203939;
        na.hrtx[583] = -680610165;
        na.hrtx[584] = -329706532;
        na.hrtx[585] = -1085451859;
        na.hrtx[586] = 1651134318;
        na.hrtx[587] = -56561197;
        na.hrtx[588] = -1831867938;
        na.hrtx[589] = 1950287150;
        na.hrtx[590] = -494232256;
        na.hrtx[591] = 1951177285;
        na.hrtx[592] = 128357650;
        na.hrtx[593] = -1830190495;
        na.hrtx[594] = -2078441949;
        na.hrtx[595] = 147469584;
        na.hrtx[596] = -243917407;
        na.hrtx[597] = 1624351719;
        na.hrtx[598] = -2077623170;
        na.hrtx[599] = 368679810;
    }

    /*
     * Exception decompiling
     */
    public static boolean setGoal(class_2338 var0, int var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 29[SWITCH]
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
    public static void applySettings(boolean var0, boolean var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[SWITCH]
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
    public static void applyMiningSettings(boolean var0, boolean var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[SWITCH]
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

    private static /* synthetic */ void htbq() {
        na.hrtx[0] = -1951160917;
        na.hrtx[1] = -1017842174;
        na.hrtx[2] = 1969802128;
        na.hrtx[3] = 522298746;
        na.hrtx[4] = 1472909326;
        na.hrtx[5] = 451204796;
        na.hrtx[6] = 539327747;
        na.hrtx[7] = -750004529;
        na.hrtx[8] = -1423767284;
        na.hrtx[9] = 2103724994;
        na.hrtx[10] = 883312650;
        na.hrtx[11] = -216108766;
        na.hrtx[12] = -808325871;
        na.hrtx[13] = 309960778;
        na.hrtx[14] = 998842081;
        na.hrtx[15] = 1736239855;
        na.hrtx[16] = 542486208;
        na.hrtx[17] = -884723035;
        na.hrtx[18] = 1455410011;
        na.hrtx[19] = 1869866855;
        na.hrtx[20] = 1464832132;
        na.hrtx[21] = -1091015096;
        na.hrtx[22] = 794462909;
        na.hrtx[23] = -2023145570;
        na.hrtx[24] = 255626453;
        na.hrtx[25] = -1653204036;
        na.hrtx[26] = 407720249;
        na.hrtx[27] = -748530264;
        na.hrtx[28] = 528133393;
        na.hrtx[29] = 1021262451;
        na.hrtx[30] = 210491010;
        na.hrtx[31] = -638319409;
        na.hrtx[32] = 734910056;
        na.hrtx[33] = -723198871;
        na.hrtx[34] = -168373627;
        na.hrtx[35] = 1389413467;
        na.hrtx[36] = -1786836040;
        na.hrtx[37] = -337464229;
        na.hrtx[38] = 492243151;
        na.hrtx[39] = 773770189;
        na.hrtx[40] = -1520603056;
        na.hrtx[41] = 1446594990;
        na.hrtx[42] = 1481182890;
        na.hrtx[43] = 1107908100;
        na.hrtx[44] = 1553500003;
        na.hrtx[45] = 719456357;
        na.hrtx[46] = 986113894;
        na.hrtx[47] = 127749216;
        na.hrtx[48] = -1008764956;
        na.hrtx[49] = -399007332;
        na.hrtx[50] = 1563091581;
        na.hrtx[51] = -533531070;
        na.hrtx[52] = -1263969594;
        na.hrtx[53] = -1801425463;
        na.hrtx[54] = 1868126336;
        na.hrtx[55] = -1230275352;
        na.hrtx[56] = 608621590;
        na.hrtx[57] = -948976051;
        na.hrtx[58] = -59428234;
        na.hrtx[59] = -1126017216;
        na.hrtx[60] = -1684177994;
        na.hrtx[61] = -1037137020;
        na.hrtx[62] = 979195130;
        na.hrtx[63] = 589297442;
        na.hrtx[64] = 896654474;
        na.hrtx[65] = 415910064;
        na.hrtx[66] = 862937494;
        na.hrtx[67] = 643580213;
        na.hrtx[68] = -1339225950;
        na.hrtx[69] = -1959941416;
        na.hrtx[70] = -638687904;
        na.hrtx[71] = -1208700740;
        na.hrtx[72] = -1823011641;
        na.hrtx[73] = 1270628745;
        na.hrtx[74] = -651010936;
        na.hrtx[75] = 1734553526;
        na.hrtx[76] = 1010052786;
        na.hrtx[77] = 134307504;
        na.hrtx[78] = 1453896891;
        na.hrtx[79] = 400800257;
        na.hrtx[80] = 1438348945;
        na.hrtx[81] = -842782936;
        na.hrtx[82] = 1020309740;
        na.hrtx[83] = -545094465;
        na.hrtx[84] = -472324129;
        na.hrtx[85] = -1031949488;
        na.hrtx[86] = 1974261266;
        na.hrtx[87] = -1696228786;
        na.hrtx[88] = -1536289970;
        na.hrtx[89] = -774892859;
        na.hrtx[90] = -864447232;
        na.hrtx[91] = 1194496714;
        na.hrtx[92] = 1305928935;
        na.hrtx[93] = -1889253044;
        na.hrtx[94] = -1202352357;
        na.hrtx[95] = -745909889;
        na.hrtx[96] = -262022869;
        na.hrtx[97] = 1187777069;
        na.hrtx[98] = 728387851;
        na.hrtx[99] = -476333726;
    }

    private static /* synthetic */ void htca() {
        na.hrty[300] = 1916537406;
        na.hrty[301] = -449055571;
        na.hrty[302] = 46642770;
        na.hrty[303] = 1714539468;
        na.hrty[304] = -424202458;
        na.hrty[305] = 659656673;
        na.hrty[306] = -134354382;
        na.hrty[307] = -899322868;
        na.hrty[308] = 1482305058;
        na.hrty[309] = 1345585307;
        na.hrty[310] = 861120779;
        na.hrty[311] = -364686757;
        na.hrty[312] = 755041647;
        na.hrty[313] = 1290927839;
        na.hrty[314] = -155177737;
        na.hrty[315] = -964387181;
        na.hrty[316] = 681641492;
        na.hrty[317] = 1443077785;
        na.hrty[318] = -1993252384;
        na.hrty[319] = -467124294;
        na.hrty[320] = -697789954;
        na.hrty[321] = -1210934028;
        na.hrty[322] = 796805699;
        na.hrty[323] = -287313037;
        na.hrty[324] = -1248192404;
        na.hrty[325] = 250195692;
        na.hrty[326] = 362048566;
        na.hrty[327] = -922138441;
        na.hrty[328] = 1425011852;
        na.hrty[329] = 582067490;
        na.hrty[330] = 1050708651;
        na.hrty[331] = 640129477;
        na.hrty[332] = -1274211738;
        na.hrty[333] = 1354529006;
        na.hrty[334] = 137572086;
        na.hrty[335] = 1924084055;
        na.hrty[336] = -598180359;
        na.hrty[337] = 302749370;
        na.hrty[338] = 1835386508;
        na.hrty[339] = 742461205;
        na.hrty[340] = -673169245;
        na.hrty[341] = -1128269427;
        na.hrty[342] = 2081249549;
        na.hrty[343] = -1686503602;
        na.hrty[344] = -809357115;
        na.hrty[345] = 1148709862;
        na.hrty[346] = 324278915;
        na.hrty[347] = -1016137243;
        na.hrty[348] = -497051738;
        na.hrty[349] = 2072478155;
        na.hrty[350] = 1222860268;
        na.hrty[351] = 773586057;
        na.hrty[352] = 109760920;
        na.hrty[353] = -1535762400;
        na.hrty[354] = -1134842891;
        na.hrty[355] = 1336529960;
        na.hrty[356] = 1378634840;
        na.hrty[357] = -16997060;
        na.hrty[358] = -1200553464;
        na.hrty[359] = -1883076187;
        na.hrty[360] = 449742778;
        na.hrty[361] = 996476601;
        na.hrty[362] = -1847755384;
        na.hrty[363] = -1754044985;
        na.hrty[364] = 1800862853;
        na.hrty[365] = 1273329803;
        na.hrty[366] = 247265115;
        na.hrty[367] = 1989591157;
        na.hrty[368] = 506203547;
        na.hrty[369] = 580809043;
        na.hrty[370] = 1493717928;
        na.hrty[371] = 749670176;
        na.hrty[372] = -597268643;
        na.hrty[373] = 1568940021;
        na.hrty[374] = -1391490591;
        na.hrty[375] = 1908401791;
        na.hrty[376] = 1135505741;
        na.hrty[377] = 1425090151;
        na.hrty[378] = 1966975235;
        na.hrty[379] = -1958157438;
        na.hrty[380] = 1531753972;
        na.hrty[381] = 791260620;
        na.hrty[382] = 929192988;
        na.hrty[383] = 55684991;
        na.hrty[384] = 1207854341;
        na.hrty[385] = -1879889984;
        na.hrty[386] = -1049578739;
        na.hrty[387] = 716542898;
        na.hrty[388] = 864900033;
        na.hrty[389] = -657043211;
        na.hrty[390] = -1940180079;
        na.hrty[391] = 265310180;
        na.hrty[392] = -1556275299;
        na.hrty[393] = 702957822;
        na.hrty[394] = -1078888835;
        na.hrty[395] = -1768609688;
        na.hrty[396] = -451586269;
        na.hrty[397] = -180300949;
        na.hrty[398] = -1876699831;
        na.hrty[399] = 1916034894;
    }

    private static /* synthetic */ void htch() {
        na.hrxa[0] = 6687778732235995138L;
        na.hrxa[1] = 1995013174591487910L;
        na.hrxa[2] = 2478045677291830876L;
        na.hrxa[3] = 1870013605214099178L;
        na.hrxa[4] = 6430915695240837589L;
        na.hrxa[5] = -5801150165322074606L;
        na.hrxa[6] = -6428785071379626913L;
        na.hrxa[7] = 6549715179617777255L;
        na.hrxa[8] = -332405058508052642L;
        na.hrxa[9] = -4877489917048963845L;
        na.hrxa[10] = -1138783949769717529L;
        na.hrxa[11] = -6684267725083144888L;
        na.hrxa[12] = -165044447761597636L;
        na.hrxa[13] = -2393632548509569191L;
        na.hrxa[14] = 1024069890360772262L;
        na.hrxa[15] = 8712824172830372863L;
        na.hrxa[16] = 8172309534908066694L;
        na.hrxa[17] = -2906071552828153353L;
        na.hrxa[18] = -7490107446388953305L;
        na.hrxa[19] = 4114200489092719249L;
        na.hrxa[20] = -2249802102373073688L;
        na.hrxa[21] = -5049698030806611288L;
        na.hrxa[22] = -9129070590087711346L;
        na.hrxa[23] = -2818413061187866297L;
        na.hrxa[24] = 6947820440601076341L;
        na.hrxa[25] = 5686208640752282865L;
        na.hrxa[26] = -989618025872232870L;
        na.hrxa[27] = 5863750632993989180L;
        na.hrxa[28] = 7018092130583534153L;
        na.hrxa[29] = -2340399930062403595L;
        na.hrxa[30] = 8488876185017089322L;
        na.hrxa[31] = 1195353810009339174L;
        na.hrxa[32] = 2173043616594295023L;
        na.hrxa[33] = 8500266909289811328L;
        na.hrxa[34] = 3646860613588586496L;
        na.hrxa[35] = -7805992849755389586L;
        na.hrxa[36] = 8970831209318176242L;
        na.hrxa[37] = 8410787783794853749L;
        na.hrxa[38] = -8103301318999270671L;
        na.hrxa[39] = 9102509392109655566L;
        na.hrxa[40] = -7372140915807448756L;
        na.hrxa[41] = 7892971218361538793L;
        na.hrxa[42] = 2486619858401213733L;
        na.hrxa[43] = 8951566239382709768L;
        na.hrxa[44] = 2294875084998330772L;
        na.hrxa[45] = -2920425827911464144L;
        na.hrxa[46] = -3508369481665090927L;
        na.hrxa[47] = 5269186338784974786L;
        na.hrxa[48] = -145419118198025302L;
        na.hrxa[49] = -1498498422189026861L;
        na.hrxa[50] = -8333682925692529096L;
        na.hrxa[51] = -4640983494656052998L;
        na.hrxa[52] = -4804056872653200301L;
        na.hrxa[53] = -4816415189793636676L;
        na.hrxa[54] = -3555421928769479291L;
        na.hrxa[55] = 7747372235309311846L;
        na.hrxa[56] = -6920281197327310562L;
        na.hrxa[57] = 7968084122875631817L;
        na.hrxa[58] = -4951094659628507633L;
        na.hrxa[59] = -6197870743164757688L;
        na.hrxa[60] = 8810109024140313795L;
        na.hrxa[61] = 2944093378341745680L;
        na.hrxa[62] = 4627509595086558940L;
        na.hrxa[63] = -4432279445573954623L;
        na.hrxa[64] = -6681302843370007210L;
        na.hrxa[65] = -7541808408295416731L;
        na.hrxa[66] = -4787198871794705077L;
        na.hrxa[67] = 3029996678631626408L;
        na.hrxa[68] = 7580602652823162402L;
        na.hrxa[69] = 41378872738786829L;
        na.hrxa[70] = 1841813401211416303L;
        na.hrxa[71] = 5178081439684535284L;
        na.hrxa[72] = 5227679707530111159L;
        na.hrxa[73] = -8675238724671119375L;
        na.hrxa[74] = -7873915516667762146L;
        na.hrxa[75] = -2294607515046644958L;
        na.hrxa[76] = 76114480167548927L;
        na.hrxa[77] = 5556339224757469259L;
        na.hrxa[78] = -6309481547000778511L;
        na.hrxa[79] = 6935226808397767873L;
        na.hrxa[80] = -3169714380239707986L;
        na.hrxa[81] = 2572422563565307492L;
        na.hrxa[82] = 8715576391089238030L;
        na.hrxa[83] = -8835959686607278452L;
        na.hrxa[84] = 165702228060051889L;
        na.hrxa[85] = 3415888969050698091L;
        na.hrxa[86] = -7475056736563355951L;
        na.hrxa[87] = 5027816205863887404L;
        na.hrxa[88] = -1730263049523626736L;
        na.hrxa[89] = -6031508895523015910L;
        na.hrxa[90] = 305551727714432586L;
        na.hrxa[91] = 2553184014713943521L;
        na.hrxa[92] = 2046170742219964040L;
        na.hrxa[93] = 257776996206839868L;
        na.hrxa[94] = 3878647103776828700L;
        na.hrxa[95] = -848186268143350469L;
        na.hrxa[96] = 6733653064100769504L;
        na.hrxa[97] = -3878090257461037527L;
        na.hrxa[98] = -6365814552331563449L;
        na.hrxa[99] = -5372263744304212676L;
    }

    /*
     * Exception decompiling
     */
    public static void pauseForInventoryAction() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 42[SWITCH]
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

    private static /* synthetic */ void htbs() {
        na.hrtx[200] = 1447178574;
        na.hrtx[201] = -1424047228;
        na.hrtx[202] = 1368353988;
        na.hrtx[203] = 414282592;
        na.hrtx[204] = -1483660899;
        na.hrtx[205] = 2083656433;
        na.hrtx[206] = 2031883643;
        na.hrtx[207] = 2139371229;
        na.hrtx[208] = 36698179;
        na.hrtx[209] = -2052510161;
        na.hrtx[210] = 1208318463;
        na.hrtx[211] = 598420161;
        na.hrtx[212] = 19404438;
        na.hrtx[213] = 979825402;
        na.hrtx[214] = 561493174;
        na.hrtx[215] = -1043454723;
        na.hrtx[216] = 283529214;
        na.hrtx[217] = -2006433271;
        na.hrtx[218] = 1528906273;
        na.hrtx[219] = -1573457487;
        na.hrtx[220] = 1417538282;
        na.hrtx[221] = 409244513;
        na.hrtx[222] = -380773964;
        na.hrtx[223] = 1547400184;
        na.hrtx[224] = -188745137;
        na.hrtx[225] = 1866380903;
        na.hrtx[226] = 261069592;
        na.hrtx[227] = -1052376928;
        na.hrtx[228] = -217456299;
        na.hrtx[229] = 375478456;
        na.hrtx[230] = -2101759105;
        na.hrtx[231] = -1105358802;
        na.hrtx[232] = 552804031;
        na.hrtx[233] = -794219121;
        na.hrtx[234] = -806255692;
        na.hrtx[235] = -2116354725;
        na.hrtx[236] = 1045247412;
        na.hrtx[237] = -2084879907;
        na.hrtx[238] = 2046162791;
        na.hrtx[239] = -1284757150;
        na.hrtx[240] = -1805129039;
        na.hrtx[241] = -1500640488;
        na.hrtx[242] = -2140643208;
        na.hrtx[243] = -1008902205;
        na.hrtx[244] = 1547106189;
        na.hrtx[245] = -603847961;
        na.hrtx[246] = 1910616367;
        na.hrtx[247] = 1885581488;
        na.hrtx[248] = -135573542;
        na.hrtx[249] = 225242052;
        na.hrtx[250] = 804550898;
        na.hrtx[251] = -1224720979;
        na.hrtx[252] = 1687111286;
        na.hrtx[253] = 1341968152;
        na.hrtx[254] = 1395276355;
        na.hrtx[255] = -1071565212;
        na.hrtx[256] = -2025668413;
        na.hrtx[257] = 1653158609;
        na.hrtx[258] = -712059590;
        na.hrtx[259] = 1756559971;
        na.hrtx[260] = 1700715983;
        na.hrtx[261] = 2004828828;
        na.hrtx[262] = 871979643;
        na.hrtx[263] = -845101104;
        na.hrtx[264] = 1002954106;
        na.hrtx[265] = -1348993443;
        na.hrtx[266] = 1279399451;
        na.hrtx[267] = 924458854;
        na.hrtx[268] = -403162747;
        na.hrtx[269] = 1266032608;
        na.hrtx[270] = 1361595303;
        na.hrtx[271] = -1986077268;
        na.hrtx[272] = -1527163367;
        na.hrtx[273] = -1558529423;
        na.hrtx[274] = -1450104739;
        na.hrtx[275] = 765753689;
        na.hrtx[276] = 1709227093;
        na.hrtx[277] = 1510724664;
        na.hrtx[278] = -1434138863;
        na.hrtx[279] = -1086910344;
        na.hrtx[280] = 2030095177;
        na.hrtx[281] = -2089887765;
        na.hrtx[282] = -107951843;
        na.hrtx[283] = -342345738;
        na.hrtx[284] = -666524510;
        na.hrtx[285] = 1149595203;
        na.hrtx[286] = -2092555230;
        na.hrtx[287] = -997856032;
        na.hrtx[288] = 1851787573;
        na.hrtx[289] = -219835946;
        na.hrtx[290] = 1676072354;
        na.hrtx[291] = -1518613782;
        na.hrtx[292] = 679432820;
        na.hrtx[293] = 1137640223;
        na.hrtx[294] = -1510638247;
        na.hrtx[295] = -1144151085;
        na.hrtx[296] = -1396297703;
        na.hrtx[297] = -58002726;
        na.hrtx[298] = -1259002721;
        na.hrtx[299] = -637112148;
    }

    private static /* synthetic */ void htcd() {
        na.hrty[600] = 1571161418;
        na.hrty[601] = 970634693;
        na.hrty[602] = 548875221;
        na.hrty[603] = -198245127;
        na.hrty[604] = -1292005765;
        na.hrty[605] = -1287100230;
        na.hrty[606] = 1144117935;
        na.hrty[607] = 748997762;
        na.hrty[608] = 530553888;
        na.hrty[609] = 1570746501;
        na.hrty[610] = 1019627466;
        na.hrty[611] = -1127309293;
        na.hrty[612] = 1383142392;
        na.hrty[613] = -1415831898;
        na.hrty[614] = -997610519;
        na.hrty[615] = -550170297;
        na.hrty[616] = -802048260;
        na.hrty[617] = -209265387;
        na.hrty[618] = 1307955848;
        na.hrty[619] = -1470502931;
        na.hrty[620] = -1271380457;
        na.hrty[621] = 1403435043;
        na.hrty[622] = -265907950;
        na.hrty[623] = -1162159292;
        na.hrty[624] = -1412728086;
        na.hrty[625] = 580588706;
        na.hrty[626] = -795921960;
        na.hrty[627] = 818727224;
        na.hrty[628] = 1096109854;
        na.hrty[629] = -1921559420;
        na.hrty[630] = 388708922;
        na.hrty[631] = 11168447;
        na.hrty[632] = -1877903702;
        na.hrty[633] = 1342437042;
        na.hrty[634] = 1817145991;
        na.hrty[635] = -1988766118;
        na.hrty[636] = -1229826044;
        na.hrty[637] = -1944443069;
        na.hrty[638] = 2080603269;
        na.hrty[639] = -411987558;
        na.hrty[640] = 1657286072;
        na.hrty[641] = 1755423123;
        na.hrty[642] = -656991189;
    }

    private static /* synthetic */ void htbr() {
        na.hrtx[100] = 628459691;
        na.hrtx[101] = 202561867;
        na.hrtx[102] = 714951418;
        na.hrtx[103] = -1277203290;
        na.hrtx[104] = 751113856;
        na.hrtx[105] = -976236054;
        na.hrtx[106] = 565757050;
        na.hrtx[107] = -1593083286;
        na.hrtx[108] = -650066600;
        na.hrtx[109] = -1162128828;
        na.hrtx[110] = -52515793;
        na.hrtx[111] = -733823320;
        na.hrtx[112] = 712860936;
        na.hrtx[113] = -1485990206;
        na.hrtx[114] = -1566929896;
        na.hrtx[115] = -46555757;
        na.hrtx[116] = -2018576621;
        na.hrtx[117] = -790513797;
        na.hrtx[118] = -325103323;
        na.hrtx[119] = 1875004016;
        na.hrtx[120] = -62904647;
        na.hrtx[121] = 957559544;
        na.hrtx[122] = 602421228;
        na.hrtx[123] = 1432820000;
        na.hrtx[124] = 506297123;
        na.hrtx[125] = -483295247;
        na.hrtx[126] = -1950236696;
        na.hrtx[127] = -82105307;
        na.hrtx[128] = 1861119940;
        na.hrtx[129] = -888390841;
        na.hrtx[130] = -1701642288;
        na.hrtx[131] = 6704941;
        na.hrtx[132] = -2108894407;
        na.hrtx[133] = 1375257878;
        na.hrtx[134] = -238065004;
        na.hrtx[135] = -898011623;
        na.hrtx[136] = -967745423;
        na.hrtx[137] = -2012160036;
        na.hrtx[138] = -627727873;
        na.hrtx[139] = -342134545;
        na.hrtx[140] = 795322183;
        na.hrtx[141] = 547535712;
        na.hrtx[142] = 238868101;
        na.hrtx[143] = -1676659491;
        na.hrtx[144] = -615700315;
        na.hrtx[145] = -826366881;
        na.hrtx[146] = -2091704714;
        na.hrtx[147] = 1077539959;
        na.hrtx[148] = 645259348;
        na.hrtx[149] = 1464397820;
        na.hrtx[150] = -2132701569;
        na.hrtx[151] = 465312213;
        na.hrtx[152] = -1176172855;
        na.hrtx[153] = 410841195;
        na.hrtx[154] = -1027673063;
        na.hrtx[155] = 1596022557;
        na.hrtx[156] = -695801459;
        na.hrtx[157] = -1034601513;
        na.hrtx[158] = 260242312;
        na.hrtx[159] = -1685857321;
        na.hrtx[160] = -1842560614;
        na.hrtx[161] = 2054337755;
        na.hrtx[162] = -2051628972;
        na.hrtx[163] = 304947119;
        na.hrtx[164] = 865363575;
        na.hrtx[165] = -1527180550;
        na.hrtx[166] = 681877332;
        na.hrtx[167] = 1932936243;
        na.hrtx[168] = -224491809;
        na.hrtx[169] = -30474782;
        na.hrtx[170] = 1572994966;
        na.hrtx[171] = -1903080937;
        na.hrtx[172] = -1972901543;
        na.hrtx[173] = -169606293;
        na.hrtx[174] = -338349902;
        na.hrtx[175] = -284843252;
        na.hrtx[176] = 1997914350;
        na.hrtx[177] = -531322696;
        na.hrtx[178] = -1658566159;
        na.hrtx[179] = -1742083302;
        na.hrtx[180] = 448676142;
        na.hrtx[181] = -1508382781;
        na.hrtx[182] = 371452916;
        na.hrtx[183] = -693705359;
        na.hrtx[184] = 1706053880;
        na.hrtx[185] = -943723499;
        na.hrtx[186] = 1255951159;
        na.hrtx[187] = 1038367541;
        na.hrtx[188] = 580838732;
        na.hrtx[189] = 716524793;
        na.hrtx[190] = -482433330;
        na.hrtx[191] = -1662203271;
        na.hrtx[192] = 1309358310;
        na.hrtx[193] = 883822561;
        na.hrtx[194] = 1799802327;
        na.hrtx[195] = 2061356483;
        na.hrtx[196] = -1830810400;
        na.hrtx[197] = -975020948;
        na.hrtx[198] = 1855998680;
        na.hrtx[199] = 1142247018;
    }

    /*
     * Exception decompiling
     */
    private static void setSettingSafe(Object var0, String var1_1, Object var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 7[SWITCH]
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
    private static void setSetting(Object var0, String var1_1, Object var2_2) throws Exception {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = na.ov - na.hrtz("htai", hrwy(int ), (int)211)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == na.hrtz("htaj", hrtw(int ), (int)625)) break;
            v0 /* !! */  = (long)na.hrtz("htak", hrtw(int ), (int)626);
        }
        var7_3 = na.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = na.ov - na.hrtz("htal", hrwy(int ), (int)212)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == na.hrtz("htam", hrtw(int ), (int)627)) break;
            v1 /* !! */  = (long)na.hrtz("htan", hrtw(int ), (int)628);
        }
        var6_4 /* !! */  = na.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = na.ov - na.hrtz("htao", hrwy(int ), (int)213)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == na.hrtz("htap", hrtw(int ), (int)629)) break;
            v2 /* !! */  = (long)na.hrtz("htaq", hrtw(int ), (int)630);
        }
        var5_5 = na.a;
        if (var7_3) {
            throw null;
lbl21:
            // 4 sources

            return;
        }
        if (var5_5 || var5_5) ** GOTO lbl21
        v3 /* !! */  = na.ov;
        if (true) ** GOTO lbl28
        block38: while (true) {
            v3 /* !! */  = (long)(na.hrtz("htas", hrwy(int ), (int)215) - na.hrtz("htar", hrwy(int ), (int)214));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -787437540: {
                    continue block38;
                }
                case 1599292349: {
                    break block38;
                }
            }
            break;
        }
        v4 = var0.getClass();
        v5 /* !! */  = na.ov;
        if (true) ** GOTO lbl38
        block39: while (true) {
            v5 /* !! */  = (long)(na.hrtz("htau", hrwy(int ), (int)217) - na.hrtz("htat", hrwy(int ), (int)216));
lbl38:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case 707828760: {
                    continue block39;
                }
                case 1599292349: {
                    break block39;
                }
            }
            break;
        }
        v6 = v4.getField(var1_1);
        v7 /* !! */  = na.ov;
        if (true) ** GOTO lbl48
        block40: while (true) {
            v7 /* !! */  = (long)(na.hrtz("htaw", hrwy(int ), (int)219) - na.hrtz("htav", hrwy(int ), (int)218));
lbl48:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case 266588916: {
                    continue block40;
                }
                case 1599292349: {
                    break block40;
                }
            }
            break;
        }
        var3_6 = v6.get(var0);
        if (var5_5 || var5_5) ** GOTO lbl21
        v8 /* !! */  = na.ov;
        if (true) ** GOTO lbl59
        block41: while (true) {
            v8 /* !! */  = (long)(v9 - na.hrtz("htax", hrwy(int ), (int)220));
lbl59:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case 694241713: {
                    v9 = na.hrtz("htay", hrwy(int ), (int)221);
                    continue block41;
                }
                case 758347271: {
                    v9 = na.hrtz("htaz", hrwy(int ), (int)222);
                    continue block41;
                }
                case 1599292349: {
                    break block41;
                }
            }
            break;
        }
        v10 = var3_6.getClass();
        v11 /* !! */  = na.ov;
        if (true) ** GOTO lbl73
        block42: while (true) {
            v11 /* !! */  = (long)(v12 - na.hrtz("htba", hrwy(int ), (int)223));
lbl73:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -1085115790: {
                    v12 = na.hrtz("htbb", hrwy(int ), (int)224);
                    continue block42;
                }
                case 1599292349: {
                    break block42;
                }
                case 1647347770: {
                    v12 = na.hrtz("htbc", hrwy(int ), (int)225);
                    continue block42;
                }
            }
            break;
        }
        var4_7 = v10.getField("value");
        if (var5_5 || var5_5) ** GOTO lbl21
        if (var6_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_3 = na.ov - na.hrtz("htbd", hrwy(int ), (int)226)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == na.hrtz("htbe", hrtw(int ), (int)631)) break;
                    v13 /* !! */  = (long)na.hrtz("htbf", hrtw(int ), (int)632);
                }
                var4_7.set(var3_6, var2_2);
                if (var5_5 || var5_5) ** continue;
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var6_4 /* !! */  = (int)na.hrtz("htbg", hrtw(int ), (int)633);
                    if (!var7_3) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                do {
                    var6_4 /* !! */  = (int)na.hrtz("htbh", hrtw(int ), (int)634);
                } while (!var7_3);
                throw null;
            }
lbl105:
            // 3 sources

            case 2: {
                var6_4 /* !! */  = (int)na.hrtz("htbi", hrtw(int ), (int)635);
                if (!var7_3) break;
                throw null;
            }
            case 3: {
                var6_4 /* !! */  = (int)na.hrtz("htbj", hrtw(int ), (int)636);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl118
            }
            case 4: {
                var6_4 /* !! */  = (int)na.hrtz("htbk", hrtw(int ), (int)637);
                if (!var7_3) ** GOTO lbl105
                throw null;
            }
lbl118:
            // 3 sources

            case 5: {
                var6_4 /* !! */  = (int)na.hrtz("htbl", hrtw(int ), (int)638);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl132
            }
            case 6: {
                var6_4 /* !! */  = (int)na.hrtz("htbm", hrtw(int ), (int)639);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl132
            }
            case 7: {
                var6_4 /* !! */  = (int)na.hrtz("htbn", hrtw(int ), (int)640);
                if (!var7_3) ** GOTO lbl105
                throw null;
            }
lbl132:
            // 3 sources

            case 8: {
                var6_4 /* !! */  = (int)na.hrtz("htbo", hrtw(int ), (int)641);
                if (!var7_3) ** GOTO lbl118
                throw null;
            }
            case 9: 
        }
        var6_4 /* !! */  = (int)na.hrtz("htbp", hrtw(int ), (int)642);
        ** while (!var7_3)
lbl139:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void htby() {
        na.hrty[100] = 628459681;
        na.hrty[101] = 202561860;
        na.hrty[102] = 714951412;
        na.hrty[103] = -1277203285;
        na.hrty[104] = 751113863;
        na.hrty[105] = -976236063;
        na.hrty[106] = 565757048;
        na.hrty[107] = -1593083285;
        na.hrty[108] = -927078854;
        na.hrty[109] = -1162128827;
        na.hrty[110] = 2134048302;
        na.hrty[111] = -733823320;
        na.hrty[112] = 712860937;
        na.hrty[113] = -200131452;
        na.hrty[114] = -1566929895;
        na.hrty[115] = -46555757;
        na.hrty[116] = -2018576619;
        na.hrty[117] = -790513796;
        na.hrty[118] = -325103326;
        na.hrty[119] = 1875004016;
        na.hrty[120] = -62904647;
        na.hrty[121] = 957559546;
        na.hrty[122] = 602421230;
        na.hrty[123] = 1432820000;
        na.hrty[124] = 506297122;
        na.hrty[125] = -98440723;
        na.hrty[126] = -1950236695;
        na.hrty[127] = 1153768293;
        na.hrty[128] = 1861119941;
        na.hrty[129] = -888390842;
        na.hrty[130] = -791513787;
        na.hrty[131] = 6704941;
        na.hrty[132] = -2108894408;
        na.hrty[133] = 1956585282;
        na.hrty[134] = -238065003;
        na.hrty[135] = 436510441;
        na.hrty[136] = -967745424;
        na.hrty[137] = -2012160035;
        na.hrty[138] = 1881819003;
        na.hrty[139] = -342134546;
        na.hrty[140] = -621833277;
        na.hrty[141] = 547535713;
        na.hrty[142] = 238868101;
        na.hrty[143] = -1676659511;
        na.hrty[144] = -615700318;
        na.hrty[145] = -826366886;
        na.hrty[146] = -2091704706;
        na.hrty[147] = 1077539963;
        na.hrty[148] = 645259356;
        na.hrty[149] = 1464397818;
        na.hrty[150] = -2132701579;
        na.hrty[151] = 465312193;
        na.hrty[152] = -1176172838;
        na.hrty[153] = 410841215;
        na.hrty[154] = -1027673072;
        na.hrty[155] = 1596022547;
        na.hrty[156] = -695801458;
        na.hrty[157] = -1034601518;
        na.hrty[158] = 260242308;
        na.hrty[159] = -1685857327;
        na.hrty[160] = -1842560622;
        na.hrty[161] = 2054337754;
        na.hrty[162] = -2051628965;
        na.hrty[163] = 304947132;
        na.hrty[164] = 865363574;
        na.hrty[165] = 207098279;
        na.hrty[166] = 681877333;
        na.hrty[167] = -1817868947;
        na.hrty[168] = -224491809;
        na.hrty[169] = -30474781;
        na.hrty[170] = 1936156664;
        na.hrty[171] = -1903080937;
        na.hrty[172] = -1972901544;
        na.hrty[173] = 1939261977;
        na.hrty[174] = -338349901;
        na.hrty[175] = 344466796;
        na.hrty[176] = 1997914350;
        na.hrty[177] = -531322702;
        na.hrty[178] = -1658566152;
        na.hrty[179] = -1742083303;
        na.hrty[180] = 448676138;
        na.hrty[181] = -1508382775;
        na.hrty[182] = 371452922;
        na.hrty[183] = -693705358;
        na.hrty[184] = 1706053882;
        na.hrty[185] = -943723493;
        na.hrty[186] = 1255951154;
        na.hrty[187] = 1038367536;
        na.hrty[188] = 580838732;
        na.hrty[189] = 716524794;
        na.hrty[190] = -482433333;
        na.hrty[191] = -1662203267;
        na.hrty[192] = 1309358311;
        na.hrty[193] = 154464298;
        na.hrty[194] = -1799802328;
        na.hrty[195] = 947009201;
        na.hrty[196] = -1830810399;
        na.hrty[197] = 764077806;
        na.hrty[198] = 1855998681;
        na.hrty[199] = 1409746634;
    }

    private static /* synthetic */ void htbx() {
        na.hrty[0] = -1951160919;
        na.hrty[1] = -1017842176;
        na.hrty[2] = 1969802130;
        na.hrty[3] = 522298747;
        na.hrty[4] = 1472909327;
        na.hrty[5] = 451204796;
        na.hrty[6] = 539327761;
        na.hrty[7] = -750004521;
        na.hrty[8] = -1423767294;
        na.hrty[9] = 2103725042;
        na.hrty[10] = 883312654;
        na.hrty[11] = -216108790;
        na.hrty[12] = -808325829;
        na.hrty[13] = 309960797;
        na.hrty[14] = 998842100;
        na.hrty[15] = 1736239845;
        na.hrty[16] = 542486245;
        na.hrty[17] = -884723014;
        na.hrty[18] = 1455410016;
        na.hrty[19] = 1869866856;
        na.hrty[20] = 1464832164;
        na.hrty[21] = -1091015052;
        na.hrty[22] = 794462910;
        na.hrty[23] = -2023145573;
        na.hrty[24] = 255626457;
        na.hrty[25] = -1653204063;
        na.hrty[26] = 407720244;
        na.hrty[27] = -748530274;
        na.hrty[28] = 528133411;
        na.hrty[29] = 1021262385;
        na.hrty[30] = 210491070;
        na.hrty[31] = -638319361;
        na.hrty[32] = 734909992;
        na.hrty[33] = -723198876;
        na.hrty[34] = -168373607;
        na.hrty[35] = 1389413451;
        na.hrty[36] = -1786836076;
        na.hrty[37] = -337464196;
        na.hrty[38] = 492243173;
        na.hrty[39] = 773770215;
        na.hrty[40] = -1520603039;
        na.hrty[41] = 1446594996;
        na.hrty[42] = 1481182853;
        na.hrty[43] = 1107908128;
        na.hrty[44] = 1553499993;
        na.hrty[45] = 719456368;
        na.hrty[46] = 986113865;
        na.hrty[47] = 127749247;
        na.hrty[48] = -1008764967;
        na.hrty[49] = -399007307;
        na.hrty[50] = 1563091535;
        na.hrty[51] = -533531038;
        na.hrty[52] = -1263969578;
        na.hrty[53] = -1801425446;
        na.hrty[54] = 1868126374;
        na.hrty[55] = -1230275385;
        na.hrty[56] = 608621605;
        na.hrty[57] = -948976001;
        na.hrty[58] = -59428301;
        na.hrty[59] = -1126017173;
        na.hrty[60] = -1684177930;
        na.hrty[61] = -1037136962;
        na.hrty[62] = 979195096;
        na.hrty[63] = 589297427;
        na.hrty[64] = 896654497;
        na.hrty[65] = 415910048;
        na.hrty[66] = 862937554;
        na.hrty[67] = 643580200;
        na.hrty[68] = -1339225947;
        na.hrty[69] = -1959941421;
        na.hrty[70] = -638687902;
        na.hrty[71] = -1208700791;
        na.hrty[72] = -1823011604;
        na.hrty[73] = 1270628761;
        na.hrty[74] = -651010897;
        na.hrty[75] = 1734553500;
        na.hrty[76] = 1010052787;
        na.hrty[77] = -592821924;
        na.hrty[78] = 1453896890;
        na.hrty[79] = -405278022;
        na.hrty[80] = 1438348944;
        na.hrty[81] = 1251003430;
        na.hrty[82] = -1020309741;
        na.hrty[83] = -293383320;
        na.hrty[84] = -472324130;
        na.hrty[85] = 863162562;
        na.hrty[86] = 1974261267;
        na.hrty[87] = 469693249;
        na.hrty[88] = -1536289969;
        na.hrty[89] = -774892852;
        na.hrty[90] = -864447227;
        na.hrty[91] = 1194496730;
        na.hrty[92] = 1305928949;
        na.hrty[93] = -1889253047;
        na.hrty[94] = -1202352354;
        na.hrty[95] = -745909891;
        na.hrty[96] = -262022873;
        na.hrty[97] = 1187777084;
        na.hrty[98] = 728387842;
        na.hrty[99] = -476333725;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private na() {
        var2_1 /* !! */  = na.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                return;
            }
lbl7:
            // 2 sources

            case 0: {
                while (true) {
                    var2_1 /* !! */  = (int)na.hrtz("hrua", hrtw(int ), (int)0);
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)na.hrtz("hrub", hrtw(int ), (int)1);
                    ** GOTO lbl7
                    break;
                }
            }
            case 2: 
        }
        var2_1 /* !! */  = (int)na.hrtz("hruc", hrtw(int ), (int)2);
        ** while (true)
    }
}

