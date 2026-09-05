/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1011
 *  org.joml.Matrix4f
 */
package ruhack.phobia;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.imageio.ImageReader;
import javax.imageio.metadata.IIOMetadataNode;
import net.minecraft.class_1011;
import org.joml.Matrix4f;
import ruhack.phobia.kw$FrameMeta;
import ruhack.phobia.kw$GifAnimation;
import ruhack.phobia.lm;

public class kw {
    static private final Map<String, kw$GifAnimation> CACHE;
    static public final int b;
    static private int[] gsjt;
    static private long[] gsjm;
    static public final boolean a;
    static public final boolean c;
    static private int[] gsju;
    static private long[] gsjn;
    static final long np = -6880415240967116614L;

    private static void gumf() {
        kw.gsju[0] = 1072729457;
        kw.gsju[1] = -175529761;
        kw.gsju[2] = -513934115;
        kw.gsju[3] = 1757212659;
        kw.gsju[4] = 2030393583;
        kw.gsju[5] = 1572415631;
        kw.gsju[6] = -493932583;
        kw.gsju[7] = 1982145794;
        kw.gsju[8] = 1987820683;
        kw.gsju[9] = -1342972899;
        kw.gsju[10] = 617002632;
        kw.gsju[11] = 455379690;
        kw.gsju[12] = -1898663106;
        kw.gsju[13] = -878518292;
        kw.gsju[14] = 1978116421;
        kw.gsju[15] = -1086370005;
        kw.gsju[16] = -655241461;
        kw.gsju[17] = 1862179431;
        kw.gsju[18] = 232485030;
        kw.gsju[19] = -1652841873;
        kw.gsju[20] = -158391595;
        kw.gsju[21] = 115358783;
        kw.gsju[22] = 1208914311;
        kw.gsju[23] = -1615198237;
        kw.gsju[24] = -794340023;
        kw.gsju[25] = 901320147;
        kw.gsju[26] = -1365202061;
        kw.gsju[27] = -213915600;
        kw.gsju[28] = 1866064681;
        kw.gsju[29] = -1027795633;
        kw.gsju[30] = -1900874650;
        kw.gsju[31] = 646124329;
        kw.gsju[32] = 416127222;
        kw.gsju[33] = -1825478717;
        kw.gsju[34] = -1798426048;
        kw.gsju[35] = -478959431;
        kw.gsju[36] = 1538290407;
        kw.gsju[37] = 1970913065;
        kw.gsju[38] = -986965957;
        kw.gsju[39] = 807550059;
        kw.gsju[40] = 1131761910;
        kw.gsju[41] = 1676261393;
        kw.gsju[42] = -1520010295;
        kw.gsju[43] = -1988153752;
        kw.gsju[44] = -325032425;
        kw.gsju[45] = -109005601;
        kw.gsju[46] = 1470344941;
        kw.gsju[47] = -20890108;
        kw.gsju[48] = 403912860;
        kw.gsju[49] = -985447431;
        kw.gsju[50] = -1532252603;
        kw.gsju[51] = 77144945;
        kw.gsju[52] = -374556377;
        kw.gsju[53] = 1681148812;
        kw.gsju[54] = -1801388093;
        kw.gsju[55] = 2136639489;
        kw.gsju[56] = 516484101;
        kw.gsju[57] = 279113008;
        kw.gsju[58] = -806360293;
        kw.gsju[59] = -825779686;
        kw.gsju[60] = -863129438;
        kw.gsju[61] = 452831818;
        kw.gsju[62] = 135712848;
        kw.gsju[63] = -1852382663;
        kw.gsju[64] = -1258812353;
        kw.gsju[65] = 126413490;
        kw.gsju[66] = -226176118;
        kw.gsju[67] = -1005394887;
        kw.gsju[68] = 1583803361;
        kw.gsju[69] = -1549481580;
        kw.gsju[70] = -1483279827;
        kw.gsju[71] = 1497108693;
        kw.gsju[72] = -474246772;
        kw.gsju[73] = -1985459045;
        kw.gsju[74] = -945236696;
        kw.gsju[75] = -581317781;
        kw.gsju[76] = -1074323279;
        kw.gsju[77] = 1914071371;
        kw.gsju[78] = 1638921354;
        kw.gsju[79] = 745506818;
        kw.gsju[80] = -624951836;
        kw.gsju[81] = -1370260306;
        kw.gsju[82] = -1087578022;
        kw.gsju[83] = 181880206;
        kw.gsju[84] = -89066031;
        kw.gsju[85] = 1917327666;
        kw.gsju[86] = -1985494361;
        kw.gsju[87] = 982706290;
        kw.gsju[88] = -637575312;
        kw.gsju[89] = -2117579055;
        kw.gsju[90] = 598372061;
        kw.gsju[91] = 16398661;
        kw.gsju[92] = 958705015;
        kw.gsju[93] = 711250290;
        kw.gsju[94] = 192647770;
        kw.gsju[95] = -1933729393;
        kw.gsju[96] = 100915776;
        kw.gsju[97] = -1129358732;
        kw.gsju[98] = 1178326138;
        kw.gsju[99] = -1109481817;
    }

    /*
     * Exception decompiling
     */
    private static kw$FrameMeta readMeta(ImageReader var0, int var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [40[CATCHBLOCK]], but top level block is 2[CASE]
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
    private static boolean keyBg(String var0, int var1_1, int var2_2, int var3_3) {
        v0 /* !! */  = kw.np;
        if (true) ** GOTO lbl5
        block54: while (true) {
            v0 /* !! */  = (long)(kw.gsjo("gugb", gsjl(int ), (int)90) - kw.gsjo("guga", gsjl(int ), (int)89));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -688346950: {
                    break block54;
                }
                case 1664333777: {
                    continue block54;
                }
            }
            break;
        }
        var8_4 = kw.c;
        v1 /* !! */  = kw.np;
        if (true) ** GOTO lbl15
        block55: while (true) {
            v1 /* !! */  = (long)(v2 - kw.gsjo("gugc", gsjl(int ), (int)91));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -688346950: {
                    break block55;
                }
                case -158822354: {
                    v2 = kw.gsjo("gugd", gsjl(int ), (int)92);
                    continue block55;
                }
                case 1913214106: {
                    v2 = kw.gsjo("gugg", gsjl(int ), (int)93);
                    continue block55;
                }
                case 2029886221: {
                    v2 = kw.gsjo("gugi", gsjl(int ), (int)94);
                    continue block55;
                }
            }
            break;
        }
        var7_5 /* !! */  = kw.b;
        v3 /* !! */  = kw.np;
        if (true) ** GOTO lbl32
        block56: while (true) {
            v3 /* !! */  = (long)(kw.gsjo("gugn", gsjl(int ), (int)96) - kw.gsjo("gugj", gsjl(int ), (int)95));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -688346950: {
                    break block56;
                }
                case 2079971287: {
                    continue block56;
                }
            }
            break;
        }
        var6_6 = kw.a;
        if (var7_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var8_4) {
                    throw null;
lbl43:
                    // 14 sources

                    return (boolean)kw.gsjo("gugo", gsjs(int ), (int)212);
                }
                if (var6_6 || var6_6) ** GOTO lbl43
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = kw.np - kw.gsjo("gugq", gsjl(int ), (int)97)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == kw.gsjo("gugs", gsjs(int ), (int)213)) break;
                    v4 /* !! */  = (long)kw.gsjo("gugt", gsjs(int ), (int)214);
                }
                if (!var0.contains("xz")) ** GOTO lbl66
                if (var6_6 || var6_6) ** GOTO lbl43
                if (var1_1 <= kw.gsjo("gugv", gsjs(int ), (int)215)) ** GOTO lbl63
                if (var6_6) ** GOTO lbl43
                if (var2_2 <= kw.gsjo("gugw", gsjs(int ), (int)216)) ** GOTO lbl63
                if (var6_6) ** GOTO lbl43
                if (var3_3 <= kw.gsjo("gugx", gsjs(int ), (int)217)) ** GOTO lbl63
                if (var6_6) ** GOTO lbl43
                v5 = kw.gsjo("gugy", gsjs(int ), (int)218);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl65
lbl63:
                // 3 sources

                if (var6_6 || var6_6) ** GOTO lbl43
                v5 = kw.gsjo("gugz", gsjs(int ), (int)219);
lbl65:
                // 2 sources

                return (boolean)v5;
lbl66:
                // 1 sources

                if (var6_6 || var6_6) ** GOTO lbl43
                v6 /* !! */  = kw.np;
                if (true) ** GOTO lbl71
                block59: while (true) {
                    v6 /* !! */  = (long)(v7 - kw.gsjo("guha", gsjl(int ), (int)98));
lbl71:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -707284786: {
                            v7 = kw.gsjo("guhb", gsjl(int ), (int)99);
                            continue block59;
                        }
                        case -688346950: {
                            break block59;
                        }
                        case -631559106: {
                            v7 = kw.gsjo("guhc", gsjl(int ), (int)100);
                            continue block59;
                        }
                    }
                    break;
                }
                if (var0.contains("update")) ** GOTO lbl83
                if (var6_6 || var6_6) ** GOTO lbl43
                return (boolean)kw.gsjo("guhd", gsjs(int ), (int)220);
lbl83:
                // 1 sources

                if (var6_6 || var6_6) ** GOTO lbl43
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_1 = kw.np - kw.gsjo("guhe", gsjl(int ), (int)101)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == kw.gsjo("guhg", gsjs(int ), (int)221)) break;
                    v8 /* !! */  = (long)kw.gsjo("guhn", gsjs(int ), (int)222);
                }
                v9 = Math.max(var2_2, var3_3);
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_2 = kw.np - kw.gsjo("guho", gsjl(int ), (int)102)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == kw.gsjo("guhp", gsjs(int ), (int)223)) break;
                    v10 /* !! */  = (long)kw.gsjo("guhq", gsjs(int ), (int)224);
                }
                var4_7 = Math.max(var1_1, v9);
                if (var6_6 || var6_6) ** GOTO lbl43
                v11 /* !! */  = kw.np;
                if (true) ** GOTO lbl101
                block62: while (true) {
                    v11 /* !! */  = (long)(v12 - kw.gsjo("guhs", gsjl(int ), (int)103));
lbl101:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -2022115078: {
                            v12 = kw.gsjo("guhu", gsjl(int ), (int)104);
                            continue block62;
                        }
                        case -1777284735: {
                            v12 = kw.gsjo("guhv", gsjl(int ), (int)105);
                            continue block62;
                        }
                        case -688346950: {
                            break block62;
                        }
                        case -662623358: {
                            v12 = kw.gsjo("guia", gsjl(int ), (int)106);
                            continue block62;
                        }
                    }
                    break;
                }
                v13 = Math.min(var2_2, var3_3);
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_3 = kw.np - kw.gsjo("guic", gsjl(int ), (int)107)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == kw.gsjo("guid", gsjs(int ), (int)225)) break;
                    v14 /* !! */  = (long)kw.gsjo("guie", gsjs(int ), (int)226);
                }
                var5_8 = Math.min(var1_1, v13);
                if (var6_6 || var6_6) ** GOTO lbl43
                if (var4_7 < kw.gsjo("guif", gsjs(int ), (int)227)) ** GOTO lbl129
                if (var6_6) ** GOTO lbl43
                if (var4_7 - var5_8 >= kw.gsjo("guig", gsjs(int ), (int)228)) ** GOTO lbl129
                if (var6_6) ** GOTO lbl43
                v15 = kw.gsjo("guii", gsjs(int ), (int)229);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl132
lbl129:
                // 2 sources

                if (!var6_6 && !var6_6) ** break;
                ** continue;
                v15 = kw.gsjo("guio", gsjs(int ), (int)230);
lbl132:
                // 2 sources

                return (boolean)v15;
            }
lbl133:
            // 2 sources

            case 0: {
                var7_5 /* !! */  = (int)kw.gsjo("guip", gsjs(int ), (int)231);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl138:
            // 2 sources

            case 1: {
                var7_5 /* !! */  = (int)kw.gsjo("guiq", gsjs(int ), (int)232);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl186
            }
lbl143:
            // 2 sources

            case 2: {
                var7_5 /* !! */  = (int)kw.gsjo("guis", gsjs(int ), (int)233);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl243
            }
            case 3: {
                var7_5 /* !! */  = (int)kw.gsjo("guiu", gsjs(int ), (int)234);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl204
            }
            case 4: {
                var7_5 /* !! */  = (int)kw.gsjo("guix", gsjs(int ), (int)235);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl204
            }
            case 5: {
                do {
                    var7_5 /* !! */  = (int)kw.gsjo("guiz", gsjs(int ), (int)236);
                } while (!var8_4);
                throw null;
            }
lbl163:
            // 2 sources

            case 6: {
                var7_5 /* !! */  = (int)kw.gsjo("gujc", gsjs(int ), (int)237);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl208
            }
lbl168:
            // 2 sources

            case 7: {
                var7_5 /* !! */  = (int)kw.gsjo("gujd", gsjs(int ), (int)238);
                if (var8_4) {
                    throw null;
                }
            }
lbl172:
            // 5 sources

            case 8: {
                var7_5 /* !! */  = (int)kw.gsjo("gujg", gsjs(int ), (int)239);
                if (!var8_4) ** GOTO lbl168
                throw null;
            }
lbl176:
            // 2 sources

            case 9: {
                var7_5 /* !! */  = (int)kw.gsjo("gujh", gsjs(int ), (int)240);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl247
            }
lbl181:
            // 3 sources

            case 10: {
                do {
                    var7_5 /* !! */  = (int)kw.gsjo("gujj", gsjs(int ), (int)241);
                } while (!var8_4);
                throw null;
            }
lbl186:
            // 3 sources

            case 11: {
                var7_5 /* !! */  = (int)kw.gsjo("gujl", gsjs(int ), (int)242);
                if (!var8_4) ** GOTO lbl172
                throw null;
            }
            case 12: {
                var7_5 /* !! */  = (int)kw.gsjo("gujp", gsjs(int ), (int)243);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl243
            }
            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_5 /* !! */  = (int)kw.gsjo("gujq", gsjs(int ), (int)244);
                    if (!var8_4) ** GOTO lbl181
                    throw null;
                }
            }
            case 14: {
                var7_5 /* !! */  = (int)kw.gsjo("gujr", gsjs(int ), (int)245);
                if (!var8_4) ** GOTO lbl172
                throw null;
            }
lbl204:
            // 3 sources

            case 15: {
                var7_5 /* !! */  = (int)kw.gsjo("gujw", gsjs(int ), (int)246);
                if (!var8_4) ** GOTO lbl176
                throw null;
            }
lbl208:
            // 2 sources

            case 16: {
                var7_5 /* !! */  = (int)kw.gsjo("gujy", gsjs(int ), (int)247);
                if (!var8_4) ** GOTO lbl143
                throw null;
            }
lbl212:
            // 2 sources

            case 17: {
                var7_5 /* !! */  = (int)kw.gsjo("guka", gsjs(int ), (int)248);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl225
            }
            case 18: {
                var7_5 /* !! */  = (int)kw.gsjo("gukc", gsjs(int ), (int)249);
                if (!var8_4) ** GOTO lbl138
                throw null;
            }
            case 19: {
                var7_5 /* !! */  = (int)kw.gsjo("gukd", gsjs(int ), (int)250);
                if (!var8_4) ** GOTO lbl133
                throw null;
            }
lbl225:
            // 2 sources

            case 20: {
                var7_5 /* !! */  = (int)kw.gsjo("guke", gsjs(int ), (int)251);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl235
            }
            case 21: {
                do {
                    var7_5 /* !! */  = (int)kw.gsjo("gukf", gsjs(int ), (int)252);
                } while (!var8_4);
                throw null;
            }
lbl235:
            // 3 sources

            case 22: {
                var7_5 /* !! */  = (int)kw.gsjo("gukk", gsjs(int ), (int)253);
                if (!var8_4) ** GOTO lbl163
                throw null;
            }
            case 23: {
                var7_5 /* !! */  = (int)kw.gsjo("gukm", gsjs(int ), (int)254);
                if (!var8_4) ** GOTO lbl186
                throw null;
            }
lbl243:
            // 3 sources

            case 24: {
                var7_5 /* !! */  = (int)kw.gsjo("guko", gsjs(int ), (int)255);
                if (!var8_4) ** GOTO lbl212
                throw null;
            }
lbl247:
            // 2 sources

            case 25: {
                var7_5 /* !! */  = (int)kw.gsjo("gukq", gsjs(int ), (int)256);
                if (!var8_4) ** GOTO lbl235
                throw null;
            }
            case 26: 
        }
        var7_5 /* !! */  = (int)kw.gsjo("gukr", gsjs(int ), (int)257);
        ** while (!var8_4)
lbl254:
        // 1 sources

        throw null;
    }

    private static void guny() {
        kw.gsjm[0] = 7083195445306757640L;
        kw.gsjm[1] = 9040466300993111397L;
        kw.gsjm[2] = 2051586723300174700L;
        kw.gsjm[3] = 3278228592679271282L;
        kw.gsjm[4] = -397939366954497394L;
        kw.gsjm[5] = -6742599004927930368L;
        kw.gsjm[6] = -8290023975154836133L;
        kw.gsjm[7] = 2594016702688245087L;
        kw.gsjm[8] = 7193961946226796627L;
        kw.gsjm[9] = -8631213344666309308L;
        kw.gsjm[10] = -8072733048370357405L;
        kw.gsjm[11] = 1739932687071591262L;
        kw.gsjm[12] = 8125007757539170148L;
        kw.gsjm[13] = -7721730382974601315L;
        kw.gsjm[14] = 1787164972357903300L;
        kw.gsjm[15] = -6346892860242294726L;
        kw.gsjm[16] = -4389663007627367395L;
        kw.gsjm[17] = -1668036975115946703L;
        kw.gsjm[18] = 5416743792023913113L;
        kw.gsjm[19] = 6344445265663630675L;
        kw.gsjm[20] = -561079080519531078L;
        kw.gsjm[21] = 6148143022459480940L;
        kw.gsjm[22] = 8561684411699655978L;
        kw.gsjm[23] = -930797548923763278L;
        kw.gsjm[24] = 5196096460900120525L;
        kw.gsjm[25] = -5110827219286292764L;
        kw.gsjm[26] = 4214202360955476269L;
        kw.gsjm[27] = -4785761261865543044L;
        kw.gsjm[28] = -2654932595316372254L;
        kw.gsjm[29] = -6706150313898080679L;
        kw.gsjm[30] = -3207503124284561266L;
        kw.gsjm[31] = 7764825949840759945L;
        kw.gsjm[32] = 5723850045243387827L;
        kw.gsjm[33] = 8587215156006851930L;
        kw.gsjm[34] = 47109912856207388L;
        kw.gsjm[35] = 7635635868307580639L;
        kw.gsjm[36] = -2657251594683301414L;
        kw.gsjm[37] = 4230880999040786138L;
        kw.gsjm[38] = 7799908171713766376L;
        kw.gsjm[39] = -7388820615572167343L;
        kw.gsjm[40] = 5636731964545924005L;
        kw.gsjm[41] = -1603086881242563673L;
        kw.gsjm[42] = 288037919740487565L;
        kw.gsjm[43] = -5370974538399902471L;
        kw.gsjm[44] = -3537616897504259979L;
        kw.gsjm[45] = 1461981702221599956L;
        kw.gsjm[46] = -5493185439385078618L;
        kw.gsjm[47] = -7045195329509461466L;
        kw.gsjm[48] = 3643730306824123925L;
        kw.gsjm[49] = 4583707394192844326L;
        kw.gsjm[50] = -1335017801373040477L;
        kw.gsjm[51] = 88600444961196978L;
        kw.gsjm[52] = -7082770743209744147L;
        kw.gsjm[53] = 7381350499847611504L;
        kw.gsjm[54] = -7742825349614349664L;
        kw.gsjm[55] = -1985883444423535852L;
        kw.gsjm[56] = -5879644769462499044L;
        kw.gsjm[57] = 2887203072874439088L;
        kw.gsjm[58] = 974456015320064299L;
        kw.gsjm[59] = -4698371375672845490L;
        kw.gsjm[60] = -1840149614620282076L;
        kw.gsjm[61] = 7335825866066304087L;
        kw.gsjm[62] = 6325188361566506049L;
        kw.gsjm[63] = 6707315413289209587L;
        kw.gsjm[64] = -3971354736551181917L;
        kw.gsjm[65] = 8075334361144635772L;
        kw.gsjm[66] = 5951496363052515806L;
        kw.gsjm[67] = 8469984903714400086L;
        kw.gsjm[68] = 6214140024343193289L;
        kw.gsjm[69] = -8276994180977839675L;
        kw.gsjm[70] = 7528803394125371625L;
        kw.gsjm[71] = 2076157286028399049L;
        kw.gsjm[72] = -3799216963775803981L;
        kw.gsjm[73] = -6555050980882600091L;
        kw.gsjm[74] = -5341324027613471406L;
        kw.gsjm[75] = -2619303713027164488L;
        kw.gsjm[76] = 1034750386306458013L;
        kw.gsjm[77] = -6389996462907797002L;
        kw.gsjm[78] = 834694410868379362L;
        kw.gsjm[79] = -7381842062087127656L;
        kw.gsjm[80] = 6231832449481531160L;
        kw.gsjm[81] = -5107410459723815266L;
        kw.gsjm[82] = 1166179062417264853L;
        kw.gsjm[83] = -1311113971157900974L;
        kw.gsjm[84] = -2108876398495302398L;
        kw.gsjm[85] = -3586632403483995013L;
        kw.gsjm[86] = -6767742570770143386L;
        kw.gsjm[87] = -1928349616747781462L;
        kw.gsjm[88] = 5200366087826289766L;
        kw.gsjm[89] = 7545146907091238051L;
        kw.gsjm[90] = 895374702754208715L;
        kw.gsjm[91] = -8283551070440334745L;
        kw.gsjm[92] = -776016209893594666L;
        kw.gsjm[93] = 3186564294648117708L;
        kw.gsjm[94] = -8024525214279572425L;
        kw.gsjm[95] = -6145325044217950518L;
        kw.gsjm[96] = 1927670044824764787L;
        kw.gsjm[97] = -5371646860727081865L;
        kw.gsjm[98] = -2890524612502860597L;
        kw.gsjm[99] = -7238041551466914108L;
    }

    private static int gsjs(int n2) {
        return gsjt[n2] ^ gsju[n2];
    }

    private static void gunj() {
        kw.gsju[200] = 1813148760;
        kw.gsju[201] = -997316456;
        kw.gsju[202] = -864102320;
        kw.gsju[203] = 1325247017;
        kw.gsju[204] = 1841539021;
        kw.gsju[205] = 185329057;
        kw.gsju[206] = -1818980733;
        kw.gsju[207] = -672718255;
        kw.gsju[208] = -1411925358;
        kw.gsju[209] = 282178320;
        kw.gsju[210] = 1023572423;
        kw.gsju[211] = -1404867111;
        kw.gsju[212] = -1056038256;
        kw.gsju[213] = -1678099356;
        kw.gsju[214] = 538434511;
        kw.gsju[215] = -446752555;
        kw.gsju[216] = 92703738;
        kw.gsju[217] = 1482553499;
        kw.gsju[218] = -1273628635;
        kw.gsju[219] = -1312567329;
        kw.gsju[220] = -1951590776;
        kw.gsju[221] = 1957827262;
        kw.gsju[222] = -1894035777;
        kw.gsju[223] = -1563837637;
        kw.gsju[224] = -1827873333;
        kw.gsju[225] = 443052990;
        kw.gsju[226] = -1610888306;
        kw.gsju[227] = -880942770;
        kw.gsju[228] = -853217788;
        kw.gsju[229] = 1598315192;
        kw.gsju[230] = 456362986;
        kw.gsju[231] = -1831567589;
        kw.gsju[232] = -1035535955;
        kw.gsju[233] = 434057045;
        kw.gsju[234] = -1540043239;
        kw.gsju[235] = 1520913073;
        kw.gsju[236] = -1184169283;
        kw.gsju[237] = 21674783;
        kw.gsju[238] = -2084619504;
        kw.gsju[239] = -972108309;
        kw.gsju[240] = -1645850347;
        kw.gsju[241] = 40084501;
        kw.gsju[242] = 881301400;
        kw.gsju[243] = 1179426216;
        kw.gsju[244] = -1641736911;
        kw.gsju[245] = -2141055535;
        kw.gsju[246] = -34201427;
        kw.gsju[247] = -96722553;
        kw.gsju[248] = -1025929572;
        kw.gsju[249] = 459888877;
        kw.gsju[250] = -914499319;
        kw.gsju[251] = -794717199;
        kw.gsju[252] = 5416358;
        kw.gsju[253] = -1435566941;
        kw.gsju[254] = -727540742;
        kw.gsju[255] = -48595365;
        kw.gsju[256] = -1758073773;
        kw.gsju[257] = 3700403;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static class_1011 toNative(BufferedImage var0, String var1_1) {
        block99: {
            var12_2 = kw.c;
            var11_3 /* !! */  = kw.b;
            var10_4 = kw.a;
            if (var12_2) {
                throw null;
            }
            if (var10_4 || var10_4) return null;
            var2_5 = new class_1011(var0.getWidth(), var0.getHeight(), (boolean)kw.gsjo("gsyg", gsjs(int ), (int)157));
            if (var10_4 || var10_4) return null;
            var3_6 = kw.gsjo("gsyi", gsjs(int ), (int)158);
            if (var10_4) return null;
            block43: while (!var10_4 && !var10_4) {
                if (var3_6 < var0.getHeight()) {
                    if (var10_4 || var10_4) return null;
                    var4_7 = kw.gsjo("gsyk", gsjs(int ), (int)159);
                    if (var10_4) return null;
                } else {
                    if (var10_4 || var10_4) return null;
                    return var2_5;
                }
                block44: while (!var10_4) {
                    if (var11_3 /* !! */  == 0) ** GOTO lbl-1000
                    cfr_temp_0 = -2147483648;
                    while (true) {
                        switch (cfr_temp_0 == -2147483648 ? var11_3 /* !! */  : cfr_temp_0) {
                            default: lbl-1000:
                            // 2 sources

                            {
                                if (var10_4) return null;
                                if (var4_7 < var0.getWidth()) {
                                    if (var10_4 || var10_4) return null;
                                    var5_8 = var0.getRGB((int)var4_7, (int)var3_6);
                                    if (var10_4 || var10_4) return null;
                                    var6_9 /* !! */  = var5_8 >> kw.gsjo("gsyl", gsjs(int ), (int)160) & kw.gsjo("gsym", gsjs(int ), (int)161);
                                    if (var10_4 || var10_4) return null;
                                    var7_10 = var5_8 >> kw.gsjo("gsyo", gsjs(int ), (int)162) & kw.gsjo("gsyp", gsjs(int ), (int)163);
                                    if (var10_4 || var10_4) return null;
                                    var8_11 = var5_8 >> kw.gsjo("gsyq", gsjs(int ), (int)164) & kw.gsjo("gsyr", gsjs(int ), (int)165);
                                    if (var10_4 || var10_4) return null;
                                    var9_12 = var5_8 & kw.gsjo("gsys", gsjs(int ), (int)166);
                                    if (var10_4 || var10_4) return null;
                                    if (var6_9 /* !! */  > 0) {
                                        if (var10_4) return null;
                                        if (kw.keyBg(var1_1, var7_10, var8_11, var9_12)) {
                                            if (var10_4 || var10_4) return null;
                                            var6_9 /* !! */  = (int)kw.gsjo("gucg", gsjs(int ), (int)167);
                                            if (var10_4) return null;
                                        }
                                    }
                                    if (var10_4 || var10_4) return null;
                                    var2_5.method_4305((int)var4_7, (int)var3_6, var6_9 /* !! */  << kw.gsjo("gucj", gsjs(int ), (int)168) | var9_12 << kw.gsjo("gucl", gsjs(int ), (int)169) | var8_11 << kw.gsjo("gucn", gsjs(int ), (int)170) | var7_10);
                                    if (var10_4 || var10_4) return null;
                                    ++var4_7;
                                    if (var10_4) return null;
                                    if (!var12_2) continue block44;
                                    throw null;
                                }
                                if (var10_4 || var10_4) return null;
                                ++var3_6;
                                if (var10_4) return null;
                                if (!var12_2) continue block43;
                                throw null;
                            }
                        }
                        break;
                    }
                }
                return null;
                {
                    case 11: {
                        var11_3 /* !! */  = (int)kw.gsjo("gudn", gsjs(int ), (int)182);
                        cfr_temp_0 = 29;
                        if (var12_2) {
                            throw null;
                        }
                        break block99;
                    }
                    case 12: {
                        var11_3 /* !! */  = (int)kw.gsjo("gudo", gsjs(int ), (int)183);
                        cfr_temp_0 = 33;
                        if (var12_2) {
                            throw null;
                        }
                        break block99;
                    }
                    case 15: {
                        var11_3 /* !! */  = (int)kw.gsjo("gudt", gsjs(int ), (int)186);
                        cfr_temp_0 = 25;
                        if (var12_2) {
                            throw null;
                        }
                        break block99;
                    }
                    case 16: {
                        var11_3 /* !! */  = (int)kw.gsjo("gudw", gsjs(int ), (int)187);
                        cfr_temp_0 = 38;
                        if (var12_2) {
                            throw null;
                        }
                        break block99;
                    }
                    case 17: {
                        var11_3 /* !! */  = (int)kw.gsjo("guea", gsjs(int ), (int)188);
                        cfr_temp_0 = 10;
                        if (var12_2) {
                            throw null;
                        }
                        break block99;
                    }
                    case 19: {
                        var11_3 /* !! */  = (int)kw.gsjo("guec", gsjs(int ), (int)190);
                        if (var12_2) {
                            throw null;
                        }
                    }
                    case 5: {
                        var11_3 /* !! */  = (int)kw.gsjo("guda", gsjs(int ), (int)176);
                        cfr_temp_0 = 14;
                        if (var12_2) {
                            throw null;
                        }
                        break block99;
                    }
                    case 20: {
                        var11_3 /* !! */  = (int)kw.gsjo("guee", gsjs(int ), (int)191);
                        cfr_temp_0 = 38;
                        if (var12_2) {
                            throw null;
                        }
                        break block99;
                    }
                    case 24: {
                        var11_3 /* !! */  = (int)kw.gsjo("guer", gsjs(int ), (int)195);
                        cfr_temp_0 = 38;
                        if (var12_2) {
                            throw null;
                        }
                        break block99;
                    }
                    case 26: {
                        var11_3 /* !! */  = (int)kw.gsjo("guev", gsjs(int ), (int)197);
                        if (var12_2) {
                            throw null;
                        }
                    }
                    case 22: {
                        var11_3 /* !! */  = (int)kw.gsjo("guen", gsjs(int ), (int)193);
                        cfr_temp_0 = 38;
                        if (var12_2) {
                            throw null;
                        }
                        break block99;
                    }
                    case 29: {
                        var11_3 /* !! */  = (int)kw.gsjo("gufa", gsjs(int ), (int)200);
                        cfr_temp_0 = 32;
                        if (var12_2) {
                            throw null;
                        }
                        break block99;
                    }
                    case 30: {
                        var11_3 /* !! */  = (int)kw.gsjo("gufb", gsjs(int ), (int)201);
                        cfr_temp_0 = 13;
                        if (var12_2) {
                            throw null;
                        }
                        break block99;
                    }
                    case 31: {
                        var11_3 /* !! */  = (int)kw.gsjo("gufc", gsjs(int ), (int)202);
                        cfr_temp_0 = 36;
                        if (var12_2) {
                            throw null;
                        }
                        break block99;
                    }
                    case 32: {
                        var11_3 /* !! */  = (int)kw.gsjo("gufd", gsjs(int ), (int)203);
                        if (var12_2) {
                            throw null;
                        }
                    }
                    case 21: {
                        var11_3 /* !! */  = (int)kw.gsjo("guel", gsjs(int ), (int)192);
                        cfr_temp_0 = 33;
                        if (var12_2) {
                            throw null;
                        }
                        break block99;
                    }
                    case 35: {
                        var11_3 /* !! */  = (int)kw.gsjo("gufk", gsjs(int ), (int)206);
                        cfr_temp_0 = 10;
                        if (var12_2) {
                            throw null;
                        }
                        break block99;
                    }
                    case 36: {
                        var11_3 /* !! */  = (int)kw.gsjo("gufm", gsjs(int ), (int)207);
                        cfr_temp_0 = 0;
                        if (var12_2) {
                            throw null;
                        }
                        break block99;
                    }
                    case 38: {
                        var11_3 /* !! */  = (int)kw.gsjo("gufq", gsjs(int ), (int)209);
                        if (var12_2) {
                            throw null;
                        }
                    }
                    case 18: {
                        var11_3 /* !! */  = (int)kw.gsjo("gueb", gsjs(int ), (int)189);
                        if (var12_2) {
                            throw null;
                        }
                    }
                    case 37: {
                        var11_3 /* !! */  = (int)kw.gsjo("gufo", gsjs(int ), (int)208);
                        if (var12_2) {
                            throw null;
                        }
                    }
                    case 4: {
                        var11_3 /* !! */  = (int)kw.gsjo("gucz", gsjs(int ), (int)175);
                        if (var12_2) {
                            throw null;
                        }
                    }
                    case 28: {
                        var11_3 /* !! */  = (int)kw.gsjo("guez", gsjs(int ), (int)199);
                        cfr_temp_0 = 33;
                        if (var12_2) {
                            throw null;
                        }
                        break block99;
                    }
                    case 40: {
                        var11_3 /* !! */  = (int)kw.gsjo("gufs", gsjs(int ), (int)211);
                        if (var12_2) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 0: {
                        var11_3 /* !! */  = (int)kw.gsjo("gucp", gsjs(int ), (int)171);
                        if (var12_2) {
                            throw null;
                        }
                    }
                    case 8: {
                        var11_3 /* !! */  = (int)kw.gsjo("gude", gsjs(int ), (int)179);
                        if (var12_2) {
                            throw null;
                        }
                    }
                    case 9: {
                        var11_3 /* !! */  = (int)kw.gsjo("gudh", gsjs(int ), (int)180);
                        cfr_temp_0 = 0;
                        if (var12_2) {
                            throw null;
                        }
                        break block99;
                    }
                    case 1: lbl-1000:
                    // 2 sources

                    {
                        var11_3 /* !! */  = (int)kw.gsjo("gucq", gsjs(int ), (int)172);
                        if (var12_2) {
                            throw null;
                        }
                    }
                    case 10: {
                        var11_3 /* !! */  = (int)kw.gsjo("gudm", gsjs(int ), (int)181);
                        if (var12_2) {
                            throw null;
                        }
                    }
                    case 25: {
                        var11_3 /* !! */  = (int)kw.gsjo("guet", gsjs(int ), (int)196);
                        if (var12_2) {
                            throw null;
                        }
                    }
                    case 6: {
                        var11_3 /* !! */  = (int)kw.gsjo("gudb", gsjs(int ), (int)177);
                        if (var12_2) {
                            throw null;
                        }
                    }
                    case 33: {
                        var11_3 /* !! */  = (int)kw.gsjo("guff", gsjs(int ), (int)204);
                        if (var12_2) {
                            throw null;
                        }
                    }
                    case 39: {
                        var11_3 /* !! */  = (int)kw.gsjo("gufr", gsjs(int ), (int)210);
                        if (var12_2) {
                            throw null;
                        }
                    }
                    case 23: {
                        var11_3 /* !! */  = (int)kw.gsjo("guep", gsjs(int ), (int)194);
                        if (var12_2) {
                            throw null;
                        }
                    }
                    case 13: {
                        var11_3 /* !! */  = (int)kw.gsjo("gudp", gsjs(int ), (int)184);
                        if (var12_2) {
                            throw null;
                        }
                    }
                    case 27: {
                        var11_3 /* !! */  = (int)kw.gsjo("guey", gsjs(int ), (int)198);
                        if (var12_2) {
                            throw null;
                        }
                    }
                    case 14: {
                        var11_3 /* !! */  = (int)kw.gsjo("gudr", gsjs(int ), (int)185);
                        if (var12_2) {
                            throw null;
                        }
                    }
                    case 2: {
                        var11_3 /* !! */  = (int)kw.gsjo("gucs", gsjs(int ), (int)173);
                        if (var12_2) {
                            throw null;
                        }
                    }
                    case 34: {
                        var11_3 /* !! */  = (int)kw.gsjo("gufi", gsjs(int ), (int)205);
                        cfr_temp_0 = 1;
                        if (var12_2) {
                            throw null;
                        }
                        break block99;
                    }
                    case 3: {
                        var11_3 /* !! */  = (int)kw.gsjo("gucy", gsjs(int ), (int)174);
                        if (var12_2) {
                            throw null;
                        }
                    }
                    case 7: {
                        break block43;
                    }
                    return null;
                }
            }
            ** GOTO lbl261
        }
        do {
            if (true) ** continue;
lbl261:
            // 2 sources

            var11_3 /* !! */  = (int)kw.gsjo("gudc", gsjs(int ), (int)178);
            cfr_temp_0 = 3;
        } while (!var12_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static IIOMetadataNode node(IIOMetadataNode var0, String var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kw.np - kw.gsjo("gsry", gsjl(int ), (int)50)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == kw.gsjo("gsrz", gsjs(int ), (int)95)) break;
            v0 /* !! */  = (long)kw.gsjo("gssd", gsjs(int ), (int)96);
        }
        var5_2 = kw.c;
        v1 /* !! */  = kw.np;
        if (true) ** GOTO lbl11
        block38: while (true) {
            v1 /* !! */  = (long)(v2 - kw.gsjo("gsse", gsjl(int ), (int)51));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -688346950: {
                    break block38;
                }
                case -509579012: {
                    v2 = kw.gsjo("gssf", gsjl(int ), (int)52);
                    continue block38;
                }
                case 756688440: {
                    v2 = kw.gsjo("gssg", gsjl(int ), (int)53);
                    continue block38;
                }
                case 1890639447: {
                    v2 = kw.gsjo("gssj", gsjl(int ), (int)54);
                    continue block38;
                }
            }
            break;
        }
        var4_3 /* !! */  = kw.b;
        v3 /* !! */  = kw.np;
        if (true) ** GOTO lbl28
        block39: while (true) {
            v3 /* !! */  = (long)(kw.gsjo("gssm", gsjl(int ), (int)56) - kw.gsjo("gssk", gsjl(int ), (int)55));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -688346950: {
                    break block39;
                }
                case 1434632353: {
                    continue block39;
                }
            }
            break;
        }
        var3_4 = kw.a;
        if (var5_2) {
            throw null;
lbl36:
            // 8 sources

            return null;
        }
        if (var3_4 || var3_4) ** GOTO lbl36
        var2_5 = kw.gsjo("gsso", gsjs(int ), (int)97);
        if (var3_4) ** GOTO lbl36
        block41: while (true) {
            if (var3_4 || var3_4) ** GOTO lbl36
            v4 /* !! */  = kw.np;
            if (true) ** GOTO lbl47
            block42: while (true) {
                v4 /* !! */  = (long)(kw.gsjo("gsss", gsjl(int ), (int)58) - kw.gsjo("gssq", gsjl(int ), (int)57));
lbl47:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -688346950: {
                        break block42;
                    }
                    case -514435433: {
                        continue block42;
                    }
                }
                break;
            }
            if (var2_5 >= var0.getLength()) ** GOTO lbl91
            if (var3_4 || var3_4) ** GOTO lbl36
            if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var4_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        if ((v5 /* !! */  = (cfr_temp_1 = kw.np - kw.gsjo("gsst", gsjl(int ), (int)59)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v5 /* !! */  == kw.gsjo("gssv", gsjs(int ), (int)98)) break;
                        v5 /* !! */  = (long)kw.gsjo("gssw", gsjs(int ), (int)99);
                    }
                    v6 = var0.item((int)var2_5);
                    while (true) {
                        if ((v7 /* !! */  = (cfr_temp_2 = kw.np - kw.gsjo("gssx", gsjl(int ), (int)60)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v7 /* !! */  == kw.gsjo("gssy", gsjs(int ), (int)100)) break;
                        v7 /* !! */  = (long)kw.gsjo("gssz", gsjs(int ), (int)101);
                    }
                    v8 = v6.getNodeName();
                    while (true) {
                        if ((v9 /* !! */  = (cfr_temp_3 = kw.np - kw.gsjo("gstb", gsjl(int ), (int)61)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v9 /* !! */  == kw.gsjo("gstc", gsjs(int ), (int)102)) break;
                        v9 /* !! */  = (long)kw.gsjo("gsti", gsjs(int ), (int)103);
                    }
                    if (!v8.equalsIgnoreCase(var1_1)) ** GOTO lbl86
                    if (var3_4 || var3_4) ** GOTO lbl36
                    v10 /* !! */  = kw.np;
                    if (true) ** GOTO lbl80
                    block46: while (true) {
                        v10 /* !! */  = (long)(kw.gsjo("gstk", gsjl(int ), (int)63) - kw.gsjo("gstj", gsjl(int ), (int)62));
lbl80:
                        // 2 sources

                        switch ((int)v10 /* !! */ ) {
                            case -688346950: {
                                break block46;
                            }
                            case -135439254: {
                                continue block46;
                            }
                        }
                        break;
                    }
                    return (IIOMetadataNode)var0.item((int)var2_5);
lbl86:
                    // 1 sources

                    if (var3_4 || var3_4) ** GOTO lbl36
                    ++var2_5;
                    if (var3_4) ** GOTO lbl36
                    if (!var5_2) continue block41;
                    throw null;
                }
lbl91:
                // 1 sources

                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return null;
                case 0: {
                    var4_3 /* !! */  = (int)kw.gsjo("gstl", gsjs(int ), (int)104);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl104
                }
                case 1: {
                    var4_3 /* !! */  = (int)kw.gsjo("gstm", gsjs(int ), (int)105);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl152
                }
lbl104:
                // 2 sources

                case 2: {
                    var4_3 /* !! */  = (int)kw.gsjo("gstn", gsjs(int ), (int)106);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl152
                }
                case 3: {
                    var4_3 /* !! */  = (int)kw.gsjo("gsto", gsjs(int ), (int)107);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl143
                }
lbl114:
                // 2 sources

                case 4: {
                    var4_3 /* !! */  = (int)kw.gsjo("gstp", gsjs(int ), (int)108);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl147
                }
                case 5: {
                    var4_3 /* !! */  = (int)kw.gsjo("gstq", gsjs(int ), (int)109);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl157
                }
                case 6: {
                    var4_3 /* !! */  = (int)kw.gsjo("gstr", gsjs(int ), (int)110);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl157
                }
lbl129:
                // 2 sources

                case 7: {
                    var4_3 /* !! */  = (int)kw.gsjo("gsts", gsjs(int ), (int)111);
                    if (!var5_2) ** GOTO lbl114
                    throw null;
                }
                case 8: {
                    var4_3 /* !! */  = (int)kw.gsjo("gstt", gsjs(int ), (int)112);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl152
                }
lbl138:
                // 2 sources

                case 9: {
                    var4_3 /* !! */  = (int)kw.gsjo("gstx", gsjs(int ), (int)113);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl161
                }
lbl143:
                // 4 sources

                case 10: {
                    var4_3 /* !! */  = (int)kw.gsjo("gsty", gsjs(int ), (int)114);
                    if (!var5_2) ** GOTO lbl129
                    throw null;
                }
lbl147:
                // 2 sources

                case 11: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var4_3 /* !! */  = (int)kw.gsjo("gstz", gsjs(int ), (int)115);
                        if (!var5_2) ** GOTO lbl143
                        throw null;
                    }
                }
lbl152:
                // 5 sources

                case 12: {
                    var4_3 /* !! */  = (int)kw.gsjo("gsua", gsjs(int ), (int)116);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl161
                }
lbl157:
                // 3 sources

                case 13: {
                    var4_3 /* !! */  = (int)kw.gsjo("gsub", gsjs(int ), (int)117);
                    if (!var5_2) ** GOTO lbl143
                    throw null;
                }
lbl161:
                // 3 sources

                case 14: {
                    var4_3 /* !! */  = (int)kw.gsjo("gsud", gsjs(int ), (int)118);
                    if (!var5_2) ** GOTO lbl152
                    throw null;
                }
                case 15: {
                    var4_3 /* !! */  = (int)kw.gsjo("gsue", gsjs(int ), (int)119);
                    if (!var5_2) ** GOTO lbl138
                    throw null;
                }
                case 16: 
            }
            break;
        }
        var4_3 /* !! */  = (int)kw.gsjo("gsuf", gsjs(int ), (int)120);
        ** while (!var5_2)
lbl172:
        // 1 sources

        throw null;
    }

    private static void guor() {
        kw.gsjm[100] = 4139429026852691250L;
        kw.gsjm[101] = 7626910707775648723L;
        kw.gsjm[102] = 7383177225666735044L;
        kw.gsjm[103] = 7960970057828148159L;
        kw.gsjm[104] = -1632526267703276619L;
        kw.gsjm[105] = -1546878659271392045L;
        kw.gsjm[106] = -8951509940394239668L;
        kw.gsjm[107] = -1742308693067499871L;
    }

    private static void guls() {
        kw.gsjt[200] = 1813148761;
        kw.gsjt[201] = -997316470;
        kw.gsjt[202] = -864102321;
        kw.gsjt[203] = 1325247015;
        kw.gsjt[204] = 1841539028;
        kw.gsjt[205] = 185329075;
        kw.gsjt[206] = -1818980704;
        kw.gsjt[207] = -672718256;
        kw.gsjt[208] = -1411925372;
        kw.gsjt[209] = 282178325;
        kw.gsjt[210] = 1023572436;
        kw.gsjt[211] = -1404867111;
        kw.gsjt[212] = -1056038255;
        kw.gsjt[213] = 1678099355;
        kw.gsjt[214] = -1192377874;
        kw.gsjt[215] = -446752727;
        kw.gsjt[216] = 92703494;
        kw.gsjt[217] = 1482553447;
        kw.gsjt[218] = -1273628636;
        kw.gsjt[219] = -1312567329;
        kw.gsjt[220] = -1951590776;
        kw.gsjt[221] = 1957827263;
        kw.gsjt[222] = 1703279466;
        kw.gsjt[223] = 1563837636;
        kw.gsjt[224] = 1729736461;
        kw.gsjt[225] = 443052991;
        kw.gsjt[226] = -1333609878;
        kw.gsjt[227] = -880942678;
        kw.gsjt[228] = -853217768;
        kw.gsjt[229] = 1598315193;
        kw.gsjt[230] = 456362986;
        kw.gsjt[231] = -1831567589;
        kw.gsjt[232] = -1035535941;
        kw.gsjt[233] = 434057051;
        kw.gsjt[234] = -1540043250;
        kw.gsjt[235] = 1520913080;
        kw.gsjt[236] = -1184169283;
        kw.gsjt[237] = 21674767;
        kw.gsjt[238] = -2084619503;
        kw.gsjt[239] = -972108319;
        kw.gsjt[240] = -1645850363;
        kw.gsjt[241] = 40084501;
        kw.gsjt[242] = 881301388;
        kw.gsjt[243] = 1179426238;
        kw.gsjt[244] = -1641736903;
        kw.gsjt[245] = -2141055531;
        kw.gsjt[246] = -34201435;
        kw.gsjt[247] = -96722560;
        kw.gsjt[248] = -1025929595;
        kw.gsjt[249] = 459888878;
        kw.gsjt[250] = -914499321;
        kw.gsjt[251] = -794717191;
        kw.gsjt[252] = 5416370;
        kw.gsjt[253] = -1435566932;
        kw.gsjt[254] = -727540756;
        kw.gsjt[255] = -48595371;
        kw.gsjt[256] = -1758073768;
        kw.gsjt[257] = 3700400;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static void init() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kw.np - kw.gsjo("gsjq", gsjl(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == kw.gsjo("gsjv", gsjs(int ), (int)0)) break;
            v0 /* !! */  = (long)kw.gsjo("gsjw", gsjs(int ), (int)1);
        }
        var2 = kw.c;
        while (true) {
            block20: {
                if ((v1 /* !! */  = (cfr_temp_1 = kw.np - kw.gsjo("gsjx", gsjl(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  != kw.gsjo("gsjy", gsjs(int ), (int)2)) break block20;
                var1_1 /* !! */  = kw.b;
                v2 /* !! */  = kw.np;
                if (true) ** GOTO lbl18
            }
            v1 /* !! */  = (long)kw.gsjo("gsjz", gsjs(int ), (int)3);
        }
        block13: while (true) {
            v2 /* !! */  = (long)(v3 - kw.gsjo("gska", gsjl(int ), (int)2));
lbl18:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -688346950: {
                    break block13;
                }
                case -561816189: {
                    v3 = kw.gsjo("gskb", gsjl(int ), (int)3);
                    continue block13;
                }
                case -534773626: {
                    v3 = kw.gsjo("gskc", gsjl(int ), (int)4);
                    continue block13;
                }
            }
            break;
        }
        var0_2 = kw.a;
        if (var2) {
            throw null;
        }
        if (var0_2 || var0_2) {
            return;
        }
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
            case 0: {
                var1_1 /* !! */  = (int)kw.gsjo("gskd", gsjs(int ), (int)4);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl-1000
            }
            case 1: {
                ** GOTO lbl47
            }
            case 3: lbl-1000:
            // 2 sources

            {
                var1_1 /* !! */  = (int)kw.gsjo("gski", gsjs(int ), (int)7);
                if (var2) {
                    throw null;
                }
lbl47:
                // 3 sources

                var1_1 /* !! */  = (int)kw.gsjo("gskf", gsjs(int ), (int)5);
                if (var2) {
                    throw null;
                }
            }
            case 2: 
        }
        do {
            var1_1 /* !! */  = (int)kw.gsjo("gskg", gsjs(int ), (int)6);
        } while (!var2);
        throw null;
    }

    public static CallSite gsjo(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void shutdown() {
        v0 /* !! */  = kw.np;
        if (true) ** GOTO lbl5
        block35: while (true) {
            v0 /* !! */  = (long)(v1 - kw.gsjo("gsne", gsjl(int ), (int)31));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -688346950: {
                    break block35;
                }
                case -602864432: {
                    v1 = kw.gsjo("gsng", gsjl(int ), (int)32);
                    continue block35;
                }
                case -335623758: {
                    v1 = kw.gsjo("gsnh", gsjl(int ), (int)33);
                    continue block35;
                }
                case 1581128873: {
                    v1 = kw.gsjo("gsnk", gsjl(int ), (int)34);
                    continue block35;
                }
            }
            break;
        }
        var2 = kw.c;
        v2 /* !! */  = kw.np;
        if (true) ** GOTO lbl22
        block36: while (true) {
            v2 /* !! */  = (long)(v3 - kw.gsjo("gsnm", gsjl(int ), (int)35));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -688346950: {
                    break block36;
                }
                case -107857827: {
                    v3 = kw.gsjo("gsnn", gsjl(int ), (int)36);
                    continue block36;
                }
                case -17873588: {
                    v3 = kw.gsjo("gsno", gsjl(int ), (int)37);
                    continue block36;
                }
                case 571788829: {
                    v3 = kw.gsjo("gsnp", gsjl(int ), (int)38);
                    continue block36;
                }
            }
            break;
        }
        var1_1 /* !! */  = kw.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = kw.np - kw.gsjo("gsnq", gsjl(int ), (int)39)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == kw.gsjo("gsnr", gsjs(int ), (int)32)) break;
            v4 /* !! */  = (long)kw.gsjo("gsns", gsjs(int ), (int)33);
        }
        var0_2 = kw.a;
        if (var2) {
            throw null;
lbl43:
            // 4 sources

            return;
        }
        if (var0_2) ** GOTO lbl43
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** GOTO lbl43
                v5 /* !! */  = kw.np;
                if (true) ** GOTO lbl54
                block39: while (true) {
                    v5 /* !! */  = (long)(kw.gsjo("gsnv", gsjl(int ), (int)41) - kw.gsjo("gsnu", gsjl(int ), (int)40));
lbl54:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -789529418: {
                            continue block39;
                        }
                        case -688346950: {
                            break block39;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = kw.np - kw.gsjo("gsnw", gsjl(int ), (int)42)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == kw.gsjo("gsny", gsjs(int ), (int)34)) break;
                    v6 /* !! */  = (long)kw.gsjo("gsob", gsjs(int ), (int)35);
                }
                v7 = kw.CACHE.values();
                v8 /* !! */  = kw.np;
                if (true) ** GOTO lbl69
                block41: while (true) {
                    v8 /* !! */  = (long)(v9 - kw.gsjo("gsoc", gsjl(int ), (int)43));
lbl69:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -688346950: {
                            break block41;
                        }
                        case -317645353: {
                            v9 = kw.gsjo("gsoe", gsjl(int ), (int)44);
                            continue block41;
                        }
                        case 916118552: {
                            v9 = kw.gsjo("gsof", gsjl(int ), (int)45);
                            continue block41;
                        }
                    }
                    break;
                }
                v10 = (Consumer<kw$GifAnimation>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, dispose(), (Lruhack/phobia/kw$GifAnimation;)V)();
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_2 = kw.np - kw.gsjo("gsoh", gsjl(int ), (int)46)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == kw.gsjo("gsoi", gsjs(int ), (int)36)) break;
                    v11 /* !! */  = (long)kw.gsjo("gsoj", gsjs(int ), (int)37);
                }
                v7.forEach(v10);
                if (var0_2 || var0_2) ** GOTO lbl43
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_3 = kw.np - kw.gsjo("gsol", gsjl(int ), (int)47)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == kw.gsjo("gsom", gsjs(int ), (int)38)) break;
                    v12 /* !! */  = (long)kw.gsjo("gson", gsjs(int ), (int)39);
                }
                v13 /* !! */  = kw.np;
                if (true) ** GOTO lbl95
                block44: while (true) {
                    v13 /* !! */  = (long)(kw.gsjo("gsop", gsjl(int ), (int)49) - kw.gsjo("gsoo", gsjl(int ), (int)48));
lbl95:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1848816486: {
                            continue block44;
                        }
                        case -688346950: {
                            break block44;
                        }
                    }
                    break;
                }
                kw.CACHE.clear();
                if (!var0_2 && !var0_2) ** break;
                ** continue;
                return;
            }
            case 0: {
                var1_1 /* !! */  = (int)kw.gsjo("gsor", gsjs(int ), (int)40);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl132
            }
lbl109:
            // 2 sources

            case 1: {
                var1_1 /* !! */  = (int)kw.gsjo("gsos", gsjs(int ), (int)41);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl132
            }
            case 2: {
                var1_1 /* !! */  = (int)kw.gsjo("gsow", gsjs(int ), (int)42);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl132
            }
lbl119:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)kw.gsjo("gsox", gsjs(int ), (int)43);
                    if (!var2) ** GOTO lbl109
                    throw null;
                }
            }
            case 4: {
                var1_1 /* !! */  = (int)kw.gsjo("gsoz", gsjs(int ), (int)44);
                if (!var2) break;
                throw null;
            }
            case 5: {
                var1_1 /* !! */  = (int)kw.gsjo("gspa", gsjs(int ), (int)45);
                if (var2) {
                    throw null;
                }
            }
lbl132:
            // 6 sources

            case 6: {
                var1_1 /* !! */  = (int)kw.gsjo("gspc", gsjs(int ), (int)46);
                if (!var2) ** GOTO lbl119
                throw null;
            }
            case 7: 
        }
        var1_1 /* !! */  = (int)kw.gsjo("gspd", gsjs(int ), (int)47);
        ** while (!var2)
lbl139:
        // 1 sources

        throw null;
    }

    private static void gumv() {
        kw.gsju[100] = 1734590259;
        kw.gsju[101] = 345043831;
        kw.gsju[102] = 392475629;
        kw.gsju[103] = -1348992817;
        kw.gsju[104] = -686972043;
        kw.gsju[105] = 2088865719;
        kw.gsju[106] = 1532394574;
        kw.gsju[107] = -1663841485;
        kw.gsju[108] = -99371268;
        kw.gsju[109] = -340116218;
        kw.gsju[110] = -1255634449;
        kw.gsju[111] = 1277176544;
        kw.gsju[112] = -1882798865;
        kw.gsju[113] = 936540726;
        kw.gsju[114] = -1521601685;
        kw.gsju[115] = -736904159;
        kw.gsju[116] = -1968257100;
        kw.gsju[117] = -129505387;
        kw.gsju[118] = -81214276;
        kw.gsju[119] = -1081754420;
        kw.gsju[120] = 1835739918;
        kw.gsju[121] = 1146083946;
        kw.gsju[122] = -923254202;
        kw.gsju[123] = -1158507274;
        kw.gsju[124] = -484872792;
        kw.gsju[125] = -1495889436;
        kw.gsju[126] = -2093243599;
        kw.gsju[127] = -630447791;
        kw.gsju[128] = -1334557145;
        kw.gsju[129] = 1743128034;
        kw.gsju[130] = 1609401315;
        kw.gsju[131] = -647853628;
        kw.gsju[132] = -1182676353;
        kw.gsju[133] = 1952626641;
        kw.gsju[134] = -496720243;
        kw.gsju[135] = 1684270551;
        kw.gsju[136] = 1789862360;
        kw.gsju[137] = -64705410;
        kw.gsju[138] = -1802087695;
        kw.gsju[139] = 24687715;
        kw.gsju[140] = -671883121;
        kw.gsju[141] = -2033324901;
        kw.gsju[142] = 1675988790;
        kw.gsju[143] = -1728670977;
        kw.gsju[144] = -893872404;
        kw.gsju[145] = 840503180;
        kw.gsju[146] = 684343896;
        kw.gsju[147] = -818062678;
        kw.gsju[148] = -385454283;
        kw.gsju[149] = 409370993;
        kw.gsju[150] = -1357595270;
        kw.gsju[151] = 1663880609;
        kw.gsju[152] = -954659592;
        kw.gsju[153] = -1564215997;
        kw.gsju[154] = 500007461;
        kw.gsju[155] = 303261046;
        kw.gsju[156] = -1539806648;
        kw.gsju[157] = -185266725;
        kw.gsju[158] = 1633441469;
        kw.gsju[159] = 648340666;
        kw.gsju[160] = 1469073528;
        kw.gsju[161] = -1262240678;
        kw.gsju[162] = 2135441385;
        kw.gsju[163] = -1487799265;
        kw.gsju[164] = -524053776;
        kw.gsju[165] = 1268577389;
        kw.gsju[166] = 1989499270;
        kw.gsju[167] = -937893282;
        kw.gsju[168] = 73655104;
        kw.gsju[169] = 9298129;
        kw.gsju[170] = -1351431458;
        kw.gsju[171] = -118684069;
        kw.gsju[172] = 156545657;
        kw.gsju[173] = 188832793;
        kw.gsju[174] = 408373785;
        kw.gsju[175] = -1343930490;
        kw.gsju[176] = -1574974536;
        kw.gsju[177] = -1001016913;
        kw.gsju[178] = 765321971;
        kw.gsju[179] = -948821885;
        kw.gsju[180] = 1065735170;
        kw.gsju[181] = -1235293416;
        kw.gsju[182] = 2073818287;
        kw.gsju[183] = 1490309132;
        kw.gsju[184] = 317651799;
        kw.gsju[185] = 2104110459;
        kw.gsju[186] = 2101648203;
        kw.gsju[187] = 1814367254;
        kw.gsju[188] = -988992767;
        kw.gsju[189] = -853873821;
        kw.gsju[190] = 1241315316;
        kw.gsju[191] = 398539570;
        kw.gsju[192] = -935181012;
        kw.gsju[193] = 1472392899;
        kw.gsju[194] = 1200098491;
        kw.gsju[195] = -888557514;
        kw.gsju[196] = 2087864763;
        kw.gsju[197] = -1486717126;
        kw.gsju[198] = -265805943;
        kw.gsju[199] = 2054259740;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void draw(Matrix4f var0, float var1_1, float var2_2, float var3_3, String var4_4, int var5_5, float var6_6, float var7_7) {
        block86: {
            v0 /* !! */  = kw.np;
            if (true) ** GOTO lbl5
            block57: while (true) {
                v0 /* !! */  = (long)(v1 - kw.gsjo("gskj", gsjl(int ), (int)5));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -2078391158: {
                        v1 = kw.gsjo("gskl", gsjl(int ), (int)6);
                        continue block57;
                    }
                    case -1346416964: {
                        v1 = kw.gsjo("gskm", gsjl(int ), (int)7);
                        continue block57;
                    }
                    case -688346950: {
                        break block57;
                    }
                    case 1897668173: {
                        v1 = kw.gsjo("gskn", gsjl(int ), (int)8);
                        continue block57;
                    }
                }
                break;
            }
            var12_8 = kw.c;
            v2 /* !! */  = kw.np;
            if (true) ** GOTO lbl22
            block58: while (true) {
                v2 /* !! */  = (long)(kw.gsjo("gskp", gsjl(int ), (int)10) - kw.gsjo("gsko", gsjl(int ), (int)9));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -688346950: {
                        break block58;
                    }
                    case 1550875497: {
                        continue block58;
                    }
                }
                break;
            }
            var11_9 /* !! */  = kw.b;
            v3 /* !! */  = kw.np;
            if (true) ** GOTO lbl32
            block59: while (true) {
                v3 /* !! */  = (long)(v4 - kw.gsjo("gskq", gsjl(int ), (int)11));
lbl32:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1106797716: {
                        v4 = kw.gsjo("gskr", gsjl(int ), (int)12);
                        continue block59;
                    }
                    case -825074729: {
                        v4 = kw.gsjo("gskt", gsjl(int ), (int)13);
                        continue block59;
                    }
                    case -688346950: {
                        break block59;
                    }
                    case 2031178748: {
                        v4 = kw.gsjo("gsku", gsjl(int ), (int)14);
                        continue block59;
                    }
                }
                break;
            }
            var10_10 = kw.a;
            if (var12_8) {
                throw null;
lbl47:
                // 8 sources

                return;
            }
            if (var10_10 || var10_10) ** GOTO lbl47
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_0 = kw.np - kw.gsjo("gskv", gsjl(int ), (int)15)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v5 /* !! */  == kw.gsjo("gskw", gsjs(int ), (int)8)) break;
                v5 /* !! */  = (long)kw.gsjo("gskx", gsjs(int ), (int)9);
            }
            v6 /* !! */  = kw.np;
            if (true) ** GOTO lbl60
            block62: while (true) {
                v6 /* !! */  = (long)(v7 - kw.gsjo("gsky", gsjl(int ), (int)16));
lbl60:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -688346950: {
                        break block62;
                    }
                    case -576617926: {
                        v7 = kw.gsjo("gsla", gsjl(int ), (int)17);
                        continue block62;
                    }
                    case 1115324820: {
                        v7 = kw.gsjo("gslb", gsjl(int ), (int)18);
                        continue block62;
                    }
                }
                break;
            }
            v8 = (Function<String, kw$GifAnimation>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, <init>(java.lang.String ), (Ljava/lang/String;)Lruhack/phobia/kw$GifAnimation;)();
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_1 = kw.np - kw.gsjo("gsld", gsjl(int ), (int)19)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v9 /* !! */  == kw.gsjo("gsle", gsjs(int ), (int)10)) break;
                v9 /* !! */  = (long)kw.gsjo("gslf", gsjs(int ), (int)11);
            }
            var8_11 = kw.CACHE.computeIfAbsent(var4_4, v8);
            if (var10_10 || var10_10) ** GOTO lbl47
            v10 /* !! */  = kw.np;
            if (true) ** GOTO lbl82
            block64: while (true) {
                v10 /* !! */  = (long)(v11 - kw.gsjo("gslg", gsjl(int ), (int)20));
lbl82:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -1951832154: {
                        v11 = kw.gsjo("gslh", gsjl(int ), (int)21);
                        continue block64;
                    }
                    case -1384467293: {
                        v11 = kw.gsjo("gslj", gsjl(int ), (int)22);
                        continue block64;
                    }
                    case -688346950: {
                        break block64;
                    }
                    case 435351131: {
                        v11 = kw.gsjo("gslk", gsjl(int ), (int)23);
                        continue block64;
                    }
                }
                break;
            }
            v12 = var8_11.views;
            while (true) {
                if ((v13 /* !! */  = (cfr_temp_2 = kw.np - kw.gsjo("gsll", gsjl(int ), (int)24)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v13 /* !! */  == kw.gsjo("gslm", gsjs(int ), (int)12)) break;
                v13 /* !! */  = (long)kw.gsjo("gsln", gsjs(int ), (int)13);
            }
            if (!v12.isEmpty()) break block86;
            if (var10_10 || var10_10) ** GOTO lbl47
            return;
        }
        if (var10_10 || var10_10) ** GOTO lbl47
        v14 /* !! */  = kw.np;
        if (true) ** GOTO lbl110
        block66: while (true) {
            v14 /* !! */  = (long)(v15 - kw.gsjo("gslo", gsjl(int ), (int)25));
lbl110:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -688346950: {
                    break block66;
                }
                case 239854185: {
                    v15 = kw.gsjo("gsls", gsjl(int ), (int)26);
                    continue block66;
                }
                case 814143647: {
                    v15 = kw.gsjo("gslt", gsjl(int ), (int)27);
                    continue block66;
                }
                case 1256763647: {
                    v15 = kw.gsjo("gslv", gsjl(int ), (int)28);
                    continue block66;
                }
            }
            break;
        }
        var9_12 = var8_11.getCurrentFrame();
        if (var10_10 || var10_10) ** GOTO lbl47
        if (var9_12 == null) ** GOTO lbl140
        if (var11_9 /* !! */  == 0) ** GOTO lbl-1000
        switch (var11_9 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var10_10 || var10_10) ** GOTO lbl47
                v16 /* !! */  = kw.np;
                if (true) ** GOTO lbl133
                block67: while (true) {
                    v16 /* !! */  = (long)(kw.gsjo("gslz", gsjl(int ), (int)30) - kw.gsjo("gsly", gsjl(int ), (int)29));
lbl133:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -688346950: {
                            break block67;
                        }
                        case -430673490: {
                            continue block67;
                        }
                    }
                    break;
                }
                lm.draw(var0, var1_1, var2_2, var3_3, var9_12, var5_5, var6_6, var7_7);
                if (var10_10) ** GOTO lbl47
lbl140:
                // 2 sources

                if (!var10_10 && !var10_10) ** break;
                ** continue;
                return;
            }
lbl143:
            // 2 sources

            case 0: {
                var11_9 /* !! */  = (int)kw.gsjo("gsmb", gsjs(int ), (int)14);
                if (var12_8) {
                    throw null;
                }
                ** GOTO lbl195
            }
lbl148:
            // 2 sources

            case 1: {
                var11_9 /* !! */  = (int)kw.gsjo("gsmc", gsjs(int ), (int)15);
                if (var12_8) {
                    throw null;
                }
                ** GOTO lbl180
            }
            case 2: {
                var11_9 /* !! */  = (int)kw.gsjo("gsmd", gsjs(int ), (int)16);
                if (var12_8) {
                    throw null;
                }
                ** GOTO lbl180
            }
lbl158:
            // 2 sources

            case 3: {
                var11_9 /* !! */  = (int)kw.gsjo("gsme", gsjs(int ), (int)17);
                if (var12_8) {
                    throw null;
                }
                ** GOTO lbl180
            }
            case 4: {
                var11_9 /* !! */  = (int)kw.gsjo("gsmg", gsjs(int ), (int)18);
                if (var12_8) {
                    throw null;
                }
                ** GOTO lbl199
            }
            case 5: {
                var11_9 /* !! */  = (int)kw.gsjo("gsmi", gsjs(int ), (int)19);
                if (!var12_8) break;
                throw null;
            }
            case 6: {
                var11_9 /* !! */  = (int)kw.gsjo("gsmj", gsjs(int ), (int)20);
                if (!var12_8) break;
                throw null;
            }
            case 7: {
                var11_9 /* !! */  = (int)kw.gsjo("gsml", gsjs(int ), (int)21);
                if (!var12_8) ** GOTO lbl148
                throw null;
            }
lbl180:
            // 4 sources

            case 8: {
                var11_9 /* !! */  = (int)kw.gsjo("gsmm", gsjs(int ), (int)22);
                if (var12_8) {
                    throw null;
                }
                ** GOTO lbl199
            }
lbl185:
            // 2 sources

            case 9: {
                var11_9 /* !! */  = (int)kw.gsjo("gsmq", gsjs(int ), (int)23);
                if (!var12_8) break;
                throw null;
            }
            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var11_9 /* !! */  = (int)kw.gsjo("gsms", gsjs(int ), (int)24);
                    if (var12_8) {
                        throw null;
                    }
                    ** GOTO lbl208
                    break;
                }
            }
lbl195:
            // 3 sources

            case 11: {
                var11_9 /* !! */  = (int)kw.gsjo("gsmt", gsjs(int ), (int)25);
                if (!var12_8) break;
                throw null;
            }
lbl199:
            // 3 sources

            case 12: {
                do {
                    var11_9 /* !! */  = (int)kw.gsjo("gsmu", gsjs(int ), (int)26);
                } while (!var12_8);
                throw null;
            }
            case 13: {
                var11_9 /* !! */  = (int)kw.gsjo("gsmv", gsjs(int ), (int)27);
                if (!var12_8) ** GOTO lbl195
                throw null;
            }
lbl208:
            // 2 sources

            case 14: {
                var11_9 /* !! */  = (int)kw.gsjo("gsmw", gsjs(int ), (int)28);
                if (!var12_8) ** GOTO lbl143
                throw null;
            }
            case 15: {
                var11_9 /* !! */  = (int)kw.gsjo("gsmx", gsjs(int ), (int)29);
                if (!var12_8) ** GOTO lbl185
                throw null;
            }
            case 16: {
                var11_9 /* !! */  = (int)kw.gsjo("gsna", gsjs(int ), (int)30);
                if (!var12_8) ** GOTO lbl158
                throw null;
            }
            case 17: 
        }
        var11_9 /* !! */  = (int)kw.gsjo("gsnc", gsjs(int ), (int)31);
        ** while (!var12_8)
lbl223:
        // 1 sources

        throw null;
    }

    private static void gupf() {
        kw.gsjn[100] = 7229746336200466613L;
        kw.gsjn[101] = -584467338098169644L;
        kw.gsjn[102] = 6543468458670038184L;
        kw.gsjn[103] = -248594145594052293L;
        kw.gsjn[104] = 5142059384088086156L;
        kw.gsjn[105] = 4543914072948284018L;
        kw.gsjn[106] = 3358680850273992920L;
        kw.gsjn[107] = 8884017574335617351L;
    }

    private static void guos() {
        kw.gsjn[0] = -8738761354290392936L;
        kw.gsjn[1] = 1798168094774327628L;
        kw.gsjn[2] = 77634880201457724L;
        kw.gsjn[3] = 4144961398104049890L;
        kw.gsjn[4] = 6450595587858246564L;
        kw.gsjn[5] = 8017267365035405031L;
        kw.gsjn[6] = -2529477042148768076L;
        kw.gsjn[7] = -6904460411727208667L;
        kw.gsjn[8] = 1057654915182911454L;
        kw.gsjn[9] = -752594354148745135L;
        kw.gsjn[10] = -6543110107144809839L;
        kw.gsjn[11] = -707472247363599863L;
        kw.gsjn[12] = -5656719326959570903L;
        kw.gsjn[13] = 5868073094350440835L;
        kw.gsjn[14] = -9019792738440955915L;
        kw.gsjn[15] = -307220440748979503L;
        kw.gsjn[16] = 6452035885181555303L;
        kw.gsjn[17] = -8895354895112163136L;
        kw.gsjn[18] = -6346958507673312550L;
        kw.gsjn[19] = -2650904396426188452L;
        kw.gsjn[20] = -978110801823725453L;
        kw.gsjn[21] = 8257767256770090946L;
        kw.gsjn[22] = 5672674171071997290L;
        kw.gsjn[23] = 7892692087313753981L;
        kw.gsjn[24] = -8721832133821387597L;
        kw.gsjn[25] = 6743317253414387246L;
        kw.gsjn[26] = 1263504168148209046L;
        kw.gsjn[27] = -2504323666450084404L;
        kw.gsjn[28] = 2657865059201609471L;
        kw.gsjn[29] = 7053919093958863477L;
        kw.gsjn[30] = 9201239233320595501L;
        kw.gsjn[31] = -5258748943783014475L;
        kw.gsjn[32] = 3783705621790711856L;
        kw.gsjn[33] = -1024547788195896864L;
        kw.gsjn[34] = 7362632574424740056L;
        kw.gsjn[35] = -908958659944327739L;
        kw.gsjn[36] = -1959953518987904564L;
        kw.gsjn[37] = -2762287695584892932L;
        kw.gsjn[38] = -2835241455094647314L;
        kw.gsjn[39] = 7309839045898414462L;
        kw.gsjn[40] = 4722173736226290096L;
        kw.gsjn[41] = 3151619834391792909L;
        kw.gsjn[42] = 9045926671636765856L;
        kw.gsjn[43] = 7456102696993485197L;
        kw.gsjn[44] = -7155492230566230277L;
        kw.gsjn[45] = 8481007644543552940L;
        kw.gsjn[46] = -3382430805735858249L;
        kw.gsjn[47] = 4316850563730504482L;
        kw.gsjn[48] = 436325856137329833L;
        kw.gsjn[49] = -5405872844681149540L;
        kw.gsjn[50] = 9116283830373393168L;
        kw.gsjn[51] = -8520438345430163508L;
        kw.gsjn[52] = 6900670314863075980L;
        kw.gsjn[53] = 4579916106781538006L;
        kw.gsjn[54] = -660746477682228633L;
        kw.gsjn[55] = 4687375096171365739L;
        kw.gsjn[56] = 3994068966257805756L;
        kw.gsjn[57] = 4030154905947679541L;
        kw.gsjn[58] = -4730393647808714177L;
        kw.gsjn[59] = -6168926645908652493L;
        kw.gsjn[60] = -3369101387166197530L;
        kw.gsjn[61] = 655658853931633334L;
        kw.gsjn[62] = 4531402239370864065L;
        kw.gsjn[63] = 8758073850202181742L;
        kw.gsjn[64] = -7757790011073990875L;
        kw.gsjn[65] = 9128827736988306566L;
        kw.gsjn[66] = -8268134341549767694L;
        kw.gsjn[67] = 8665105445664910180L;
        kw.gsjn[68] = -3950977916483376641L;
        kw.gsjn[69] = -4179758975753803801L;
        kw.gsjn[70] = -2939799260820325642L;
        kw.gsjn[71] = -3456478071206345215L;
        kw.gsjn[72] = -4635665777190839491L;
        kw.gsjn[73] = 5731303366890682964L;
        kw.gsjn[74] = 5058665760752395600L;
        kw.gsjn[75] = 5061328960746953424L;
        kw.gsjn[76] = 214732727453902038L;
        kw.gsjn[77] = -5968267163648922460L;
        kw.gsjn[78] = 7602023895867117468L;
        kw.gsjn[79] = -2321371048584665988L;
        kw.gsjn[80] = -7581933742334253705L;
        kw.gsjn[81] = 12853415374215920L;
        kw.gsjn[82] = -1796823261777118239L;
        kw.gsjn[83] = -4150247049621892036L;
        kw.gsjn[84] = -2305810017026052409L;
        kw.gsjn[85] = -306294648711574880L;
        kw.gsjn[86] = 2038606394353815420L;
        kw.gsjn[87] = 4135650430523507649L;
        kw.gsjn[88] = 1969082933107740399L;
        kw.gsjn[89] = -7996571435765346594L;
        kw.gsjn[90] = -1674571696978449858L;
        kw.gsjn[91] = -8606257249508055101L;
        kw.gsjn[92] = 4675978945372419669L;
        kw.gsjn[93] = -2496452102326271747L;
        kw.gsjn[94] = 4796671408163849651L;
        kw.gsjn[95] = -2274006763006390705L;
        kw.gsjn[96] = -4560719411749321138L;
        kw.gsjn[97] = -2335525098792926489L;
        kw.gsjn[98] = -4576129109388506007L;
        kw.gsjn[99] = 3052611951439868025L;
    }

    private static void guks() {
        kw.gsjt[0] = -1072729458;
        kw.gsjt[1] = -1964753530;
        kw.gsjt[2] = 513934114;
        kw.gsjt[3] = -354805776;
        kw.gsjt[4] = 2030393580;
        kw.gsjt[5] = 1572415631;
        kw.gsjt[6] = -493932581;
        kw.gsjt[7] = 1982145793;
        kw.gsjt[8] = -1987820684;
        kw.gsjt[9] = -1348526589;
        kw.gsjt[10] = 617002633;
        kw.gsjt[11] = -1596326170;
        kw.gsjt[12] = 1898663105;
        kw.gsjt[13] = -1493125105;
        kw.gsjt[14] = 1978116437;
        kw.gsjt[15] = -1086370015;
        kw.gsjt[16] = -655241446;
        kw.gsjt[17] = 1862179432;
        kw.gsjt[18] = 232485024;
        kw.gsjt[19] = -1652841883;
        kw.gsjt[20] = -158391595;
        kw.gsjt[21] = 115358770;
        kw.gsjt[22] = 1208914314;
        kw.gsjt[23] = -1615198235;
        kw.gsjt[24] = -794340018;
        kw.gsjt[25] = 901320159;
        kw.gsjt[26] = -1365202052;
        kw.gsjt[27] = -213915589;
        kw.gsjt[28] = 1866064679;
        kw.gsjt[29] = -1027795646;
        kw.gsjt[30] = -1900874634;
        kw.gsjt[31] = 646124322;
        kw.gsjt[32] = -416127223;
        kw.gsjt[33] = -1887015547;
        kw.gsjt[34] = 1798426047;
        kw.gsjt[35] = -504814886;
        kw.gsjt[36] = -1538290408;
        kw.gsjt[37] = 1269616953;
        kw.gsjt[38] = 986965956;
        kw.gsjt[39] = -626088425;
        kw.gsjt[40] = 1131761905;
        kw.gsjt[41] = 1676261398;
        kw.gsjt[42] = -1520010296;
        kw.gsjt[43] = -1988153750;
        kw.gsjt[44] = -325032429;
        kw.gsjt[45] = -109005604;
        kw.gsjt[46] = 1470344940;
        kw.gsjt[47] = -20890107;
        kw.gsjt[48] = 403912952;
        kw.gsjt[49] = -985447431;
        kw.gsjt[50] = -1532252603;
        kw.gsjt[51] = 77144945;
        kw.gsjt[52] = -374556365;
        kw.gsjt[53] = 1681148806;
        kw.gsjt[54] = -1801388087;
        kw.gsjt[55] = 2136639489;
        kw.gsjt[56] = 516484101;
        kw.gsjt[57] = 279113008;
        kw.gsjt[58] = -806360311;
        kw.gsjt[59] = -825779711;
        kw.gsjt[60] = -863129423;
        kw.gsjt[61] = 452831826;
        kw.gsjt[62] = 135712833;
        kw.gsjt[63] = -1852382672;
        kw.gsjt[64] = -1258812353;
        kw.gsjt[65] = 126413487;
        kw.gsjt[66] = -226176109;
        kw.gsjt[67] = -1005394898;
        kw.gsjt[68] = 1583803387;
        kw.gsjt[69] = -1549481599;
        kw.gsjt[70] = -1483279814;
        kw.gsjt[71] = 1497108703;
        kw.gsjt[72] = -474246763;
        kw.gsjt[73] = -1985459050;
        kw.gsjt[74] = -945236691;
        kw.gsjt[75] = -581317773;
        kw.gsjt[76] = -1074323282;
        kw.gsjt[77] = 1914071366;
        kw.gsjt[78] = 1638921353;
        kw.gsjt[79] = 745506843;
        kw.gsjt[80] = -624951825;
        kw.gsjt[81] = -1370260303;
        kw.gsjt[82] = -1087578017;
        kw.gsjt[83] = 181880195;
        kw.gsjt[84] = -89066031;
        kw.gsjt[85] = 1917327677;
        kw.gsjt[86] = -1985494343;
        kw.gsjt[87] = 982706283;
        kw.gsjt[88] = -637575300;
        kw.gsjt[89] = -2117579059;
        kw.gsjt[90] = 598372040;
        kw.gsjt[91] = 16398677;
        kw.gsjt[92] = 958705006;
        kw.gsjt[93] = 711250282;
        kw.gsjt[94] = 192647745;
        kw.gsjt[95] = -1933729394;
        kw.gsjt[96] = -1092746071;
        kw.gsjt[97] = -1129358732;
        kw.gsjt[98] = -1178326139;
        kw.gsjt[99] = 2004634933;
    }

    public kw() {
    }

    private static long gsjl(int n2) {
        return gsjm[n2] ^ gsjn[n2];
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static int parseInt(String var0, int var1_1) {
        block43: {
            block42: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_1 = kw.np - kw.gsjo("gsug", gsjl(int ), (int)64)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == kw.gsjo("gsuh", gsjs(int ), (int)121)) break;
                    v0 /* !! */  = (long)kw.gsjo("gsui", gsjs(int ), (int)122);
                }
                var5_2 = kw.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_2 = kw.np - kw.gsjo("gsuj", gsjl(int ), (int)65)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  == kw.gsjo("gsuk", gsjs(int ), (int)123)) break;
                    v1 /* !! */  = (long)kw.gsjo("gsun", gsjs(int ), (int)124);
                }
                var4_3 /* !! */  = kw.b;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_3 = kw.np - kw.gsjo("gsuo", gsjl(int ), (int)66)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == kw.gsjo("gsuq", gsjs(int ), (int)125)) {
                        var3_4 = kw.a;
                        if (var5_2) {
                            throw null;
                        }
                        break;
                    }
                    v2 /* !! */  = (long)kw.gsjo("gsur", gsjs(int ), (int)126);
                }
                if (var3_4 || var3_4) return (int)kw.gsjo("gsus", gsjs(int ), (int)127);
                if (var0 == null) break block42;
                if (var3_4) return (int)kw.gsjo("gsus", gsjs(int ), (int)127);
                v3 /* !! */  = kw.np;
                block30: while (true) {
                    switch ((int)v3 /* !! */ ) {
                        case -1220745134: {
                            v3 /* !! */  = (long)(kw.gsjo("gsuu", gsjl(int ), (int)68) - kw.gsjo("gsut", gsjl(int ), (int)67));
                            continue block30;
                        }
                        case -688346950: {
                            break block30;
                        }
                    }
                    break;
                }
                if (!var0.isEmpty()) break block43;
                if (var3_4) return (int)kw.gsjo("gsus", gsjs(int ), (int)127);
            }
            if (var3_4 || var3_4) return (int)kw.gsjo("gsus", gsjs(int ), (int)127);
            return var1_1;
        }
        try {
            if (var3_4 || var3_4) return (int)kw.gsjo("gsus", gsjs(int ), (int)127);
            v4 = var0;
            v5 /* !! */  = kw.np;
lbl43:
            // 2 sources

            while (true) {
                switch ((int)v5 /* !! */ ) {
                    case -688346950: {
                        return Integer.parseInt(v4);
                    }
                    case -599709860: {
                        ** GOTO lbl-1000
                    }
                    default: {
                        return Integer.parseInt(v4);
                    }
                }
                break;
            }
        }
        catch (NumberFormatException var2_5) {
            if (var3_4) return (int)kw.gsjo("gsus", gsjs(int ), (int)127);
            if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block32: do {
                switch (cfr_temp_0 == -2147483648 ? var4_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var3_4) return (int)kw.gsjo("gsus", gsjs(int ), (int)127);
                        return var1_1;
                    }
                    case 0: {
                        var4_3 /* !! */  = (int)kw.gsjo("gsvb", gsjs(int ), (int)128);
                        cfr_temp_0 = 9;
                        if (!var5_2) continue block32;
                        throw null;
                    }
                    case 1: {
                        var4_3 /* !! */  = (int)kw.gsjo("gsvc", gsjs(int ), (int)129);
                        cfr_temp_0 = 8;
                        if (!var5_2) continue block32;
                        throw null;
                    }
                    case 2: {
                        var4_3 /* !! */  = (int)kw.gsjo("gsvd", gsjs(int ), (int)130);
                        cfr_temp_0 = 0;
                        if (!var5_2) continue block32;
                        throw null;
                    }
                    case 3: {
                        var4_3 /* !! */  = (int)kw.gsjo("gsve", gsjs(int ), (int)131);
                        cfr_temp_0 = 11;
                        if (!var5_2) continue block32;
                        throw null;
                    }
                    case 4: {
                        var4_3 /* !! */  = (int)kw.gsjo("gsvf", gsjs(int ), (int)132);
                        cfr_temp_0 = 2;
                        if (!var5_2) continue block32;
                        throw null;
                    }
                    case 5: {
                        var4_3 /* !! */  = (int)kw.gsjo("gsvj", gsjs(int ), (int)133);
                        cfr_temp_0 = 2;
                        if (!var5_2) continue block32;
                        throw null;
                    }
                    case 6: {
                        while (true) {
                            var4_3 /* !! */  = (int)kw.gsjo("gsvk", gsjs(int ), (int)134);
                            cfr_temp_0 = 9;
                            if (!var5_2) continue block32;
                            throw null;
                        }
                    }
                    case 7: {
                        var4_3 /* !! */  = (int)kw.gsjo("gsvm", gsjs(int ), (int)135);
                        cfr_temp_0 = 1;
                        if (!var5_2) continue block32;
                        throw null;
                    }
                    case 8: {
                        var4_3 /* !! */  = (int)kw.gsjo("gsvn", gsjs(int ), (int)136);
                        cfr_temp_0 = 2;
                        if (!var5_2) continue block32;
                        throw null;
                    }
                    case 9: {
                        var4_3 /* !! */  = (int)kw.gsjo("gsvp", gsjs(int ), (int)137);
                        if (!var5_2) break;
                        throw null;
                    }
                    case 10: {
                        var4_3 /* !! */  = (int)kw.gsjo("gsvq", gsjs(int ), (int)138);
                        cfr_temp_0 = 6;
                        if (!var5_2) continue block32;
                        throw null;
                    }
                    case 11: {
                        var4_3 /* !! */  = (int)kw.gsjo("gsvs", gsjs(int ), (int)139);
                        cfr_temp_0 = 6;
                        if (!var5_2) continue block32;
                        throw null;
                    }
                    case 12: 
                }
                break;
            } while (true);
            var4_3 /* !! */  = (int)kw.gsjo("gsvu", gsjs(int ), (int)140);
            if (!var5_2) ** continue;
            throw null;
        }
lbl-1000:
        // 1 sources

        {
            v5 /* !! */  = (long)(kw.gsjo("gsva", gsjl(int ), (int)70) - kw.gsjo("gsuz", gsjl(int ), (int)69));
        }
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void clear(Graphics2D var0, int var1_1, int var2_2) {
        v0 /* !! */  = kw.np;
        if (true) ** GOTO lbl5
        block40: while (true) {
            v0 /* !! */  = (long)(kw.gsjo("gsvw", gsjl(int ), (int)72) - kw.gsjo("gsvv", gsjl(int ), (int)71));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -688346950: {
                    break block40;
                }
                case -384211579: {
                    continue block40;
                }
            }
            break;
        }
        var5_3 = kw.c;
        v1 /* !! */  = kw.np;
        if (true) ** GOTO lbl15
        block41: while (true) {
            v1 /* !! */  = (long)(v2 - kw.gsjo("gsvy", gsjl(int ), (int)73));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1453943890: {
                    v2 = kw.gsjo("gsvz", gsjl(int ), (int)74);
                    continue block41;
                }
                case -688346950: {
                    break block41;
                }
                case 369753184: {
                    v2 = kw.gsjo("gswd", gsjl(int ), (int)75);
                    continue block41;
                }
                case 1802379527: {
                    v2 = kw.gsjo("gswe", gsjl(int ), (int)76);
                    continue block41;
                }
            }
            break;
        }
        var4_4 /* !! */  = kw.b;
        v3 /* !! */  = kw.np;
        if (true) ** GOTO lbl32
        block42: while (true) {
            v3 /* !! */  = (long)(kw.gsjo("gswg", gsjl(int ), (int)78) - kw.gsjo("gswf", gsjl(int ), (int)77));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1574269655: {
                    continue block42;
                }
                case -688346950: {
                    break block42;
                }
            }
            break;
        }
        var3_5 = kw.a;
        if (var5_3) {
            throw null;
lbl40:
            // 4 sources

            return;
        }
        if (var3_5 || var3_5) ** GOTO lbl40
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = kw.np;
                if (true) ** GOTO lbl50
                block44: while (true) {
                    v4 /* !! */  = (long)(kw.gsjo("gswk", gsjl(int ), (int)80) - kw.gsjo("gswi", gsjl(int ), (int)79));
lbl50:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1292532510: {
                            continue block44;
                        }
                        case -688346950: {
                            break block44;
                        }
                    }
                    break;
                }
                v5 /* !! */  = kw.np;
                if (true) ** GOTO lbl59
                block45: while (true) {
                    v5 /* !! */  = (long)(v6 - kw.gsjo("gswm", gsjl(int ), (int)81));
lbl59:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1016226180: {
                            v6 = kw.gsjo("gswn", gsjl(int ), (int)82);
                            continue block45;
                        }
                        case -688346950: {
                            break block45;
                        }
                        case -555982822: {
                            v6 = kw.gsjo("gswo", gsjl(int ), (int)83);
                            continue block45;
                        }
                        case 382638986: {
                            v6 = kw.gsjo("gswp", gsjl(int ), (int)84);
                            continue block45;
                        }
                    }
                    break;
                }
                var0.setComposite(AlphaComposite.Clear);
                if (var3_5 || var3_5) ** GOTO lbl40
                v7 = kw.gsjo("gswq", gsjs(int ), (int)141);
                v8 = kw.gsjo("gswr", gsjs(int ), (int)142);
                v9 /* !! */  = kw.np;
                if (true) ** GOTO lbl79
                block46: while (true) {
                    v9 /* !! */  = (long)(kw.gsjo("gswy", gsjl(int ), (int)86) - kw.gsjo("gsww", gsjl(int ), (int)85));
lbl79:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -688346950: {
                            break block46;
                        }
                        case -662132224: {
                            continue block46;
                        }
                    }
                    break;
                }
                var0.fillRect((int)v7, (int)v8, var1_1, var2_2);
                if (var3_5 || var3_5) ** GOTO lbl40
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_0 = kw.np - kw.gsjo("gsxa", gsjl(int ), (int)87)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == kw.gsjo("gsxc", gsjs(int ), (int)143)) break;
                    v10 /* !! */  = (long)kw.gsjo("gsxd", gsjs(int ), (int)144);
                }
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_1 = kw.np - kw.gsjo("gsxe", gsjl(int ), (int)88)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == kw.gsjo("gsxf", gsjs(int ), (int)145)) break;
                    v11 /* !! */  = (long)kw.gsjo("gsxi", gsjs(int ), (int)146);
                }
                var0.setComposite(AlphaComposite.SrcOver);
                if (var3_5 || var3_5) ** continue;
                return;
            }
lbl99:
            // 3 sources

            case 0: {
                var4_4 /* !! */  = (int)kw.gsjo("gsxk", gsjs(int ), (int)147);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl126
            }
lbl104:
            // 3 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)kw.gsjo("gsxm", gsjs(int ), (int)148);
                    if (var5_3) {
                        throw null;
                    }
                    ** GOTO lbl134
                    break;
                }
            }
lbl110:
            // 2 sources

            case 2: {
                var4_4 /* !! */  = (int)kw.gsjo("gsxo", gsjs(int ), (int)149);
                if (!var5_3) ** GOTO lbl99
                throw null;
            }
            case 3: {
                var4_4 /* !! */  = (int)kw.gsjo("gsxq", gsjs(int ), (int)150);
                if (!var5_3) ** GOTO lbl99
                throw null;
            }
            case 4: {
                var4_4 /* !! */  = (int)kw.gsjo("gsxs", gsjs(int ), (int)151);
                if (!var5_3) ** GOTO lbl110
                throw null;
            }
            case 5: {
                var4_4 /* !! */  = (int)kw.gsjo("gsxt", gsjs(int ), (int)152);
                if (!var5_3) ** GOTO lbl104
                throw null;
            }
lbl126:
            // 3 sources

            case 6: {
                var4_4 /* !! */  = (int)kw.gsjo("gsxv", gsjs(int ), (int)153);
                if (!var5_3) ** GOTO lbl104
                throw null;
            }
lbl130:
            // 2 sources

            case 7: {
                var4_4 /* !! */  = (int)kw.gsjo("gsxx", gsjs(int ), (int)154);
                if (!var5_3) ** GOTO lbl126
                throw null;
            }
lbl134:
            // 2 sources

            case 8: {
                var4_4 /* !! */  = (int)kw.gsjo("gsxz", gsjs(int ), (int)155);
                if (!var5_3) ** GOTO lbl130
                throw null;
            }
            case 9: 
        }
        var4_4 /* !! */  = (int)kw.gsjo("gsyb", gsjs(int ), (int)156);
        ** while (!var5_3)
lbl141:
        // 1 sources

        throw null;
    }

    static {
        gsjt = new int[258];
        gsju = new int[258];
        kw.guks();
        kw.gulf();
        kw.guls();
        kw.gumf();
        kw.gumv();
        kw.gunj();
        gsjm = new long[108];
        gsjn = new long[108];
        kw.guny();
        kw.guor();
        kw.guos();
        kw.gupf();
        CACHE = new HashMap<String, kw$GifAnimation>();
    }

    private static void gulf() {
        kw.gsjt[100] = -1734590260;
        kw.gsjt[101] = -150413094;
        kw.gsjt[102] = -392475630;
        kw.gsjt[103] = -300921817;
        kw.gsjt[104] = -686972036;
        kw.gsjt[105] = 2088865712;
        kw.gsjt[106] = 1532394575;
        kw.gsjt[107] = -1663841488;
        kw.gsjt[108] = -99371274;
        kw.gsjt[109] = -340116224;
        kw.gsjt[110] = -1255634455;
        kw.gsjt[111] = 1277176549;
        kw.gsjt[112] = -1882798873;
        kw.gsjt[113] = 936540723;
        kw.gsjt[114] = -1521601689;
        kw.gsjt[115] = -736904159;
        kw.gsjt[116] = -1968257093;
        kw.gsjt[117] = -129505383;
        kw.gsjt[118] = -81214274;
        kw.gsjt[119] = -1081754429;
        kw.gsjt[120] = 1835739917;
        kw.gsjt[121] = -1146083947;
        kw.gsjt[122] = 298305529;
        kw.gsjt[123] = 1158507273;
        kw.gsjt[124] = 1001478287;
        kw.gsjt[125] = 1495889435;
        kw.gsjt[126] = 1763289155;
        kw.gsjt[127] = -990107886;
        kw.gsjt[128] = -1334557149;
        kw.gsjt[129] = 1743128042;
        kw.gsjt[130] = 1609401321;
        kw.gsjt[131] = -647853618;
        kw.gsjt[132] = -1182676359;
        kw.gsjt[133] = 1952626651;
        kw.gsjt[134] = -496720252;
        kw.gsjt[135] = 1684270556;
        kw.gsjt[136] = 1789862356;
        kw.gsjt[137] = -64705411;
        kw.gsjt[138] = -1802087688;
        kw.gsjt[139] = 24687717;
        kw.gsjt[140] = -671883125;
        kw.gsjt[141] = -2033324901;
        kw.gsjt[142] = 1675988790;
        kw.gsjt[143] = 1728670976;
        kw.gsjt[144] = 508377563;
        kw.gsjt[145] = -840503181;
        kw.gsjt[146] = -1480986785;
        kw.gsjt[147] = -818062676;
        kw.gsjt[148] = -385454288;
        kw.gsjt[149] = 409370993;
        kw.gsjt[150] = -1357595278;
        kw.gsjt[151] = 1663880610;
        kw.gsjt[152] = -954659587;
        kw.gsjt[153] = -1564215997;
        kw.gsjt[154] = 500007458;
        kw.gsjt[155] = 303261041;
        kw.gsjt[156] = -1539806648;
        kw.gsjt[157] = -185266725;
        kw.gsjt[158] = 1633441469;
        kw.gsjt[159] = 648340666;
        kw.gsjt[160] = 1469073504;
        kw.gsjt[161] = -1262240603;
        kw.gsjt[162] = 2135441401;
        kw.gsjt[163] = -1487799072;
        kw.gsjt[164] = -524053768;
        kw.gsjt[165] = 1268577426;
        kw.gsjt[166] = 1989499257;
        kw.gsjt[167] = -937893282;
        kw.gsjt[168] = 73655128;
        kw.gsjt[169] = 9298113;
        kw.gsjt[170] = -1351431466;
        kw.gsjt[171] = -118684073;
        kw.gsjt[172] = 156545651;
        kw.gsjt[173] = 188832774;
        kw.gsjt[174] = 408373776;
        kw.gsjt[175] = -1343930490;
        kw.gsjt[176] = -1574974541;
        kw.gsjt[177] = -1001016922;
        kw.gsjt[178] = 765321941;
        kw.gsjt[179] = -948821854;
        kw.gsjt[180] = 1065735205;
        kw.gsjt[181] = -1235293435;
        kw.gsjt[182] = 2073818281;
        kw.gsjt[183] = 1490309140;
        kw.gsjt[184] = 317651799;
        kw.gsjt[185] = 2104110430;
        kw.gsjt[186] = 2101648202;
        kw.gsjt[187] = 1814367247;
        kw.gsjt[188] = -988992750;
        kw.gsjt[189] = -853873812;
        kw.gsjt[190] = 1241315314;
        kw.gsjt[191] = 398539536;
        kw.gsjt[192] = -935181013;
        kw.gsjt[193] = 1472392902;
        kw.gsjt[194] = 1200098479;
        kw.gsjt[195] = -888557524;
        kw.gsjt[196] = 2087864737;
        kw.gsjt[197] = -1486717134;
        kw.gsjt[198] = -265805938;
        kw.gsjt[199] = 2054259728;
    }
}

