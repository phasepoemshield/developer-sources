/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_310
 *  org.joml.Matrix4f
 *  org.lwjgl.system.MemoryUtil
 */
package ruhack.phobia;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.OptionalInt;
import java.util.function.Supplier;
import net.minecraft.class_310;
import org.joml.Matrix4f;
import org.lwjgl.system.MemoryUtil;
import ruhack.phobia.oq;

public final class lj {
    public static final boolean a;
    private static long[] ibiv;
    private static int[] ibjc;
    private static GpuBuffer uniformBuffer;
    private static ByteBuffer uniformData;
    private static int[] ibjb;
    private static RenderPipeline pipeline;
    public static final int b;
    private static long[] ibiu;
    public static final boolean c;
    private static final int UNIFORM_SIZE = 128;
    protected static final long pi = 989267853936323999L;

    /*
     * Exception decompiling
     */
    public static void init() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 47[SWITCH]
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

    private static /* synthetic */ void ibyt() {
        lj.ibjb[100] = -2003217958;
        lj.ibjb[101] = -9426062;
        lj.ibjb[102] = -132473198;
        lj.ibjb[103] = 1864249234;
        lj.ibjb[104] = -437632621;
        lj.ibjb[105] = -1907323060;
        lj.ibjb[106] = -2019904037;
        lj.ibjb[107] = -962632839;
        lj.ibjb[108] = -1750621435;
        lj.ibjb[109] = -1778339157;
        lj.ibjb[110] = 155636007;
        lj.ibjb[111] = -841716780;
        lj.ibjb[112] = 2139266273;
        lj.ibjb[113] = -285550565;
        lj.ibjb[114] = 880497233;
        lj.ibjb[115] = 577464202;
        lj.ibjb[116] = 1347872253;
        lj.ibjb[117] = -1488682532;
        lj.ibjb[118] = -194650292;
        lj.ibjb[119] = -1174267043;
        lj.ibjb[120] = -51831763;
        lj.ibjb[121] = -1480439063;
        lj.ibjb[122] = -2030097399;
        lj.ibjb[123] = -1249548022;
        lj.ibjb[124] = -573121403;
        lj.ibjb[125] = -628249273;
        lj.ibjb[126] = 1759820322;
        lj.ibjb[127] = -1985347247;
        lj.ibjb[128] = 382552835;
        lj.ibjb[129] = 1289051746;
        lj.ibjb[130] = 764959130;
        lj.ibjb[131] = -1796108741;
        lj.ibjb[132] = -483261172;
        lj.ibjb[133] = 1412897670;
        lj.ibjb[134] = 1974765409;
        lj.ibjb[135] = 958390213;
        lj.ibjb[136] = 884321301;
        lj.ibjb[137] = 353113820;
        lj.ibjb[138] = -704514865;
        lj.ibjb[139] = 422349153;
        lj.ibjb[140] = -854980334;
        lj.ibjb[141] = -1407042143;
        lj.ibjb[142] = 1592171704;
        lj.ibjb[143] = 171949957;
        lj.ibjb[144] = 893585224;
        lj.ibjb[145] = -603996755;
        lj.ibjb[146] = -1856406732;
        lj.ibjb[147] = -779877531;
        lj.ibjb[148] = -1332313073;
        lj.ibjb[149] = -215978549;
        lj.ibjb[150] = -1612792340;
        lj.ibjb[151] = 1062215331;
        lj.ibjb[152] = 1038467575;
        lj.ibjb[153] = 913813092;
        lj.ibjb[154] = -598940653;
        lj.ibjb[155] = -1765954082;
        lj.ibjb[156] = -2047613323;
        lj.ibjb[157] = 1869060798;
        lj.ibjb[158] = -1929850861;
        lj.ibjb[159] = -1129984712;
        lj.ibjb[160] = -1133698494;
        lj.ibjb[161] = 1021587832;
        lj.ibjb[162] = 1972109387;
        lj.ibjb[163] = -1262210546;
        lj.ibjb[164] = 2028017010;
        lj.ibjb[165] = -1178541024;
        lj.ibjb[166] = -2137935387;
        lj.ibjb[167] = -1516354379;
        lj.ibjb[168] = 782120847;
        lj.ibjb[169] = -786233185;
        lj.ibjb[170] = 1627589541;
        lj.ibjb[171] = 1209865268;
        lj.ibjb[172] = 752482768;
        lj.ibjb[173] = 2071125713;
        lj.ibjb[174] = 912936423;
        lj.ibjb[175] = 1937606074;
        lj.ibjb[176] = 936523101;
        lj.ibjb[177] = -1694361958;
        lj.ibjb[178] = -1504507630;
        lj.ibjb[179] = 353689834;
        lj.ibjb[180] = 74973156;
        lj.ibjb[181] = 2088875175;
        lj.ibjb[182] = -55059891;
        lj.ibjb[183] = -1012836899;
        lj.ibjb[184] = 2066038899;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void draw(Matrix4f var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, int var8_8, float var9_9) {
        block146: {
            block149: {
                block148: {
                    block147: {
                        var18_10 = lj.c;
                        var17_11 /* !! */  = lj.b;
                        var16_12 = lj.a;
                        if (var18_10) {
                            throw null;
lbl6:
                            // 42 sources

                            return;
                        }
                        if (var16_12 || var16_12) ** GOTO lbl6
                        if (lj.pipeline != null) break block147;
                        if (var16_12) ** GOTO lbl6
                        lj.init();
                        if (var16_12) ** GOTO lbl6
                    }
                    if (var16_12 || var16_12) ** GOTO lbl6
                    if (lj.pipeline == null) break block148;
                    if (var16_12) ** GOTO lbl6
                    if (lj.uniformBuffer == null) break block148;
                    if (var16_12) ** GOTO lbl6
                    if (lj.uniformData != null) break block149;
                    if (var16_12) ** GOTO lbl6
                }
                if (var16_12 || var16_12) ** GOTO lbl6
                return;
            }
            if (var16_12 || var16_12) ** GOTO lbl6
            var10_13 = lj.uniformData;
            if (var16_12 || var16_12) ** GOTO lbl6
            var10_13.clear();
            if (var16_12 || var16_12) ** GOTO lbl6
            var10_13.putFloat(var0.m00()).putFloat(var0.m01()).putFloat(var0.m02()).putFloat(var0.m03());
            if (var16_12 || var16_12) ** GOTO lbl6
            var10_13.putFloat(var0.m10()).putFloat(var0.m11()).putFloat(var0.m12()).putFloat(var0.m13());
            if (var16_12 || var16_12) ** GOTO lbl6
            var10_13.putFloat(var0.m20()).putFloat(var0.m21()).putFloat(var0.m22()).putFloat(var0.m23());
            if (var16_12 || var16_12) ** GOTO lbl6
            var10_13.putFloat(var0.m30()).putFloat(var0.m31()).putFloat(var0.m32()).putFloat(var0.m33());
            if (var16_12 || var16_12) ** GOTO lbl6
            var10_13.position((int)lj.ibiw("ibsd", ibja(int ), (int)52));
            if (var16_12 || var16_12) ** GOTO lbl6
            var10_13.putFloat(var1_1).putFloat(var2_2).putFloat(var3_3).putFloat(var4_4);
            if (var16_12 || var16_12) ** GOTO lbl6
            var10_13.putFloat(var5_5).putFloat(var6_6).putFloat(var7_7).putFloat(var9_9);
            if (var16_12 || var16_12) ** GOTO lbl6
            var10_13.putFloat((float)(var8_8 >> lj.ibiw("ibse", ibja(int ), (int)53) & lj.ibiw("ibsf", ibja(int ), (int)54)) / lj.ibiw("ibsh", ibsg(int ), (int)55));
            if (var16_12 || var16_12) ** GOTO lbl6
            var10_13.putFloat((float)(var8_8 >> lj.ibiw("ibsi", ibja(int ), (int)56) & lj.ibiw("ibsj", ibja(int ), (int)57)) / lj.ibiw("ibsk", ibsg(int ), (int)58));
            if (var16_12 || var16_12) ** GOTO lbl6
            var10_13.putFloat((float)(var8_8 & lj.ibiw("ibsl", ibja(int ), (int)59)) / lj.ibiw("ibsm", ibsg(int ), (int)60));
            if (var16_12 || var16_12) ** GOTO lbl6
            var10_13.putFloat((float)(var8_8 >> lj.ibiw("ibsn", ibja(int ), (int)61) & lj.ibiw("ibso", ibja(int ), (int)62)) / lj.ibiw("ibsp", ibsg(int ), (int)63));
            if (var16_12 || var16_12) ** GOTO lbl6
            var10_13.flip();
            if (var16_12 || var16_12) ** GOTO lbl6
            var11_14 = RenderSystem.getDevice().createCommandEncoder();
            if (var16_12 || var16_12) ** GOTO lbl6
            var11_14.writeToBuffer(lj.uniformBuffer.slice(), var10_13);
            if (var16_12 || var16_12) ** GOTO lbl6
            var12_15 = class_310.method_1551().method_1522();
            if (var16_12 || var16_12) ** GOTO lbl6
            var13_16 = var11_14.createRenderPass((Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$draw$1(), ()Ljava/lang/String;)(), var12_15.method_71639(), OptionalInt.empty());
            if (var16_12) ** GOTO lbl6
            try {
                if (var16_12) ** GOTO lbl6
                oq.applyToPass(var13_16);
                if (var16_12 || var16_12) ** GOTO lbl6
                var13_16.setPipeline(lj.pipeline);
                if (var16_12 || var16_12) ** GOTO lbl6
                var13_16.setUniform("Uniforms", lj.uniformBuffer);
                if (var16_12 || var16_12) ** GOTO lbl6
                var13_16.draw((int)lj.ibiw("ibsq", ibja(int ), (int)64), (int)lj.ibiw("ibsr", ibja(int ), (int)65));
                if (var16_12 || var16_12) ** GOTO lbl6
                if (var13_16 == null) break block146;
                if (var16_12) ** GOTO lbl6
            }
            catch (Throwable var14_17) {
                block150: {
                    if (var16_12) ** GOTO lbl6
                    if (var13_16 == null) break block150;
                    if (var16_12) ** GOTO lbl6
                    try {
                        if (var16_12) ** GOTO lbl6
                        var13_16.close();
                        if (var16_12 || var16_12) ** GOTO lbl6
                        ** if (!var18_10) goto lbl-1000
                    }
                    catch (Throwable var15_18) {
                        if (var16_12) ** GOTO lbl6
                        var14_17.addSuppressed(var15_18);
                        if (var16_12) ** GOTO lbl6
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
                }
                if (var16_12 || var16_12) ** GOTO lbl6
                throw var14_17;
            }
            var13_16.close();
            if (var16_12) ** GOTO lbl6
            if (var18_10) {
                throw null;
            }
        }
        if (var17_11 /* !! */  == 0) ** GOTO lbl-1000
        switch (var17_11 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var16_12 && !var16_12) ** break;
                ** continue;
                return;
            }
lbl117:
            // 2 sources

            case 0: {
                var17_11 /* !! */  = (int)lj.ibiw("ibss", ibja(int ), (int)66);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl330
            }
            case 1: {
                var17_11 /* !! */  = (int)lj.ibiw("ibst", ibja(int ), (int)67);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl440
            }
lbl127:
            // 2 sources

            case 2: {
                var17_11 /* !! */  = (int)lj.ibiw("ibsu", ibja(int ), (int)68);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl391
            }
lbl132:
            // 2 sources

            case 3: {
                var17_11 /* !! */  = (int)lj.ibiw("ibsv", ibja(int ), (int)69);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl391
            }
            case 4: {
                var17_11 /* !! */  = (int)lj.ibiw("ibsw", ibja(int ), (int)70);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl257
            }
lbl142:
            // 2 sources

            case 5: {
                var17_11 /* !! */  = (int)lj.ibiw("ibsx", ibja(int ), (int)71);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl147:
            // 2 sources

            case 6: {
                var17_11 /* !! */  = (int)lj.ibiw("ibsy", ibja(int ), (int)72);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl152:
            // 3 sources

            case 7: {
                var17_11 /* !! */  = (int)lj.ibiw("ibsz", ibja(int ), (int)73);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl424
            }
            case 8: {
                var17_11 /* !! */  = (int)lj.ibiw("ibta", ibja(int ), (int)74);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl412
            }
lbl162:
            // 2 sources

            case 9: {
                var17_11 /* !! */  = (int)lj.ibiw("ibtb", ibja(int ), (int)75);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl308
            }
lbl167:
            // 2 sources

            case 10: {
                var17_11 /* !! */  = (int)lj.ibiw("ibtc", ibja(int ), (int)76);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl313
            }
lbl172:
            // 2 sources

            case 11: {
                var17_11 /* !! */  = (int)lj.ibiw("ibtd", ibja(int ), (int)77);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl235
            }
lbl177:
            // 3 sources

            case 12: {
                var17_11 /* !! */  = (int)lj.ibiw("ibte", ibja(int ), (int)78);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl440
            }
            case 13: {
                var17_11 /* !! */  = (int)lj.ibiw("ibtf", ibja(int ), (int)79);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl257
            }
            case 14: {
                var17_11 /* !! */  = (int)lj.ibiw("ibtg", ibja(int ), (int)80);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl269
            }
lbl192:
            // 3 sources

            case 15: {
                var17_11 /* !! */  = (int)lj.ibiw("ibth", ibja(int ), (int)81);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl225
            }
            case 16: {
                var17_11 /* !! */  = (int)lj.ibiw("ibti", ibja(int ), (int)82);
                if (!var18_10) ** GOTO lbl177
                throw null;
            }
lbl201:
            // 2 sources

            case 17: {
                var17_11 /* !! */  = (int)lj.ibiw("ibtj", ibja(int ), (int)83);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl399
            }
            case 18: {
                var17_11 /* !! */  = (int)lj.ibiw("ibtk", ibja(int ), (int)84);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl330
            }
            case 19: {
                var17_11 /* !! */  = (int)lj.ibiw("ibtl", ibja(int ), (int)85);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl289
            }
lbl216:
            // 2 sources

            case 20: {
                var17_11 /* !! */  = (int)lj.ibiw("ibtm", ibja(int ), (int)86);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl343
            }
            case 21: {
                var17_11 /* !! */  = (int)lj.ibiw("ibtn", ibja(int ), (int)87);
                if (!var18_10) ** GOTO lbl177
                throw null;
            }
lbl225:
            // 2 sources

            case 22: {
                var17_11 /* !! */  = (int)lj.ibiw("ibto", ibja(int ), (int)88);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl432
            }
lbl230:
            // 2 sources

            case 23: {
                var17_11 /* !! */  = (int)lj.ibiw("ibtp", ibja(int ), (int)89);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl361
            }
lbl235:
            // 3 sources

            case 24: {
                var17_11 /* !! */  = (int)lj.ibiw("ibtq", ibja(int ), (int)90);
                if (!var18_10) ** GOTO lbl192
                throw null;
            }
lbl239:
            // 2 sources

            case 25: {
                var17_11 /* !! */  = (int)lj.ibiw("ibtr", ibja(int ), (int)91);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl269
            }
            case 26: {
                var17_11 /* !! */  = (int)lj.ibiw("ibts", ibja(int ), (int)92);
                if (!var18_10) ** GOTO lbl147
                throw null;
            }
            case 27: {
                do {
                    var17_11 /* !! */  = (int)lj.ibiw("ibtt", ibja(int ), (int)93);
                } while (!var18_10);
                throw null;
            }
            case 28: {
                var17_11 /* !! */  = (int)lj.ibiw("ibtu", ibja(int ), (int)94);
                if (!var18_10) ** GOTO lbl132
                throw null;
            }
lbl257:
            // 4 sources

            case 29: {
                var17_11 /* !! */  = (int)lj.ibiw("ibtv", ibja(int ), (int)95);
                if (!var18_10) ** GOTO lbl235
                throw null;
            }
            case 30: {
                var17_11 /* !! */  = (int)lj.ibiw("ibtw", ibja(int ), (int)96);
                if (!var18_10) ** GOTO lbl162
                throw null;
            }
            case 31: {
                var17_11 /* !! */  = (int)lj.ibiw("ibtx", ibja(int ), (int)97);
                if (!var18_10) ** GOTO lbl127
                throw null;
            }
lbl269:
            // 5 sources

            case 32: {
                var17_11 /* !! */  = (int)lj.ibiw("ibty", ibja(int ), (int)98);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl387
            }
lbl274:
            // 5 sources

            case 33: {
                var17_11 /* !! */  = (int)lj.ibiw("ibtz", ibja(int ), (int)99);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl289
            }
            case 34: {
                var17_11 /* !! */  = (int)lj.ibiw("ibua", ibja(int ), (int)100);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl424
            }
            case 35: {
                var17_11 /* !! */  = (int)lj.ibiw("ibub", ibja(int ), (int)101);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl378
            }
lbl289:
            // 4 sources

            case 36: {
                var17_11 /* !! */  = (int)lj.ibiw("ibuc", ibja(int ), (int)102);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl366
            }
            case 37: {
                var17_11 /* !! */  = (int)lj.ibiw("ibud", ibja(int ), (int)103);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl424
            }
lbl299:
            // 2 sources

            case 38: {
                var17_11 /* !! */  = (int)lj.ibiw("ibue", ibja(int ), (int)104);
                if (!var18_10) ** GOTO lbl274
                throw null;
            }
            case 39: {
                var17_11 /* !! */  = (int)lj.ibiw("ibuf", ibja(int ), (int)105);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl440
            }
lbl308:
            // 2 sources

            case 40: {
                var17_11 /* !! */  = (int)lj.ibiw("ibug", ibja(int ), (int)106);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl325
            }
lbl313:
            // 2 sources

            case 41: {
                var17_11 /* !! */  = (int)lj.ibiw("ibuh", ibja(int ), (int)107);
                if (!var18_10) ** GOTO lbl274
                throw null;
            }
            case 42: {
                var17_11 /* !! */  = (int)lj.ibiw("ibui", ibja(int ), (int)108);
                if (!var18_10) ** GOTO lbl117
                throw null;
            }
            case 43: {
                var17_11 /* !! */  = (int)lj.ibiw("ibuj", ibja(int ), (int)109);
                if (!var18_10) ** GOTO lbl239
                throw null;
            }
lbl325:
            // 2 sources

            case 44: {
                var17_11 /* !! */  = (int)lj.ibiw("ibuk", ibja(int ), (int)110);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl432
            }
lbl330:
            // 3 sources

            case 45: {
                var17_11 /* !! */  = (int)lj.ibiw("ibul", ibja(int ), (int)111);
                if (!var18_10) ** GOTO lbl269
                throw null;
            }
            case 46: {
                var17_11 /* !! */  = (int)lj.ibiw("ibum", ibja(int ), (int)112);
                if (!var18_10) ** GOTO lbl274
                throw null;
            }
lbl338:
            // 2 sources

            case 47: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var17_11 /* !! */  = (int)lj.ibiw("ibun", ibja(int ), (int)113);
                    if (!var18_10) ** GOTO lbl289
                    throw null;
                }
            }
lbl343:
            // 2 sources

            case 48: {
                var17_11 /* !! */  = (int)lj.ibiw("ibuo", ibja(int ), (int)114);
                if (!var18_10) ** GOTO lbl230
                throw null;
            }
lbl347:
            // 2 sources

            case 49: {
                var17_11 /* !! */  = (int)lj.ibiw("ibup", ibja(int ), (int)115);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl374
            }
            case 50: {
                var17_11 /* !! */  = (int)lj.ibiw("ibuq", ibja(int ), (int)116);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl391
            }
            case 51: {
                var17_11 /* !! */  = (int)lj.ibiw("ibur", ibja(int ), (int)117);
                if (!var18_10) ** GOTO lbl269
                throw null;
            }
lbl361:
            // 2 sources

            case 52: {
                var17_11 /* !! */  = (int)lj.ibiw("ibus", ibja(int ), (int)118);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl408
            }
lbl366:
            // 2 sources

            case 53: {
                var17_11 /* !! */  = (int)lj.ibiw("ibut", ibja(int ), (int)119);
                if (!var18_10) ** GOTO lbl172
                throw null;
            }
lbl370:
            // 3 sources

            case 54: {
                var17_11 /* !! */  = (int)lj.ibiw("ibuu", ibja(int ), (int)120);
                if (!var18_10) ** GOTO lbl192
                throw null;
            }
lbl374:
            // 2 sources

            case 55: {
                var17_11 /* !! */  = (int)lj.ibiw("ibuv", ibja(int ), (int)121);
                if (!var18_10) ** GOTO lbl299
                throw null;
            }
lbl378:
            // 5 sources

            case 56: {
                var17_11 /* !! */  = (int)lj.ibiw("ibuw", ibja(int ), (int)122);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl391
            }
            case 57: {
                var17_11 /* !! */  = (int)lj.ibiw("ibux", ibja(int ), (int)123);
                if (!var18_10) ** GOTO lbl370
                throw null;
            }
lbl387:
            // 2 sources

            case 58: {
                var17_11 /* !! */  = (int)lj.ibiw("ibuy", ibja(int ), (int)124);
                if (!var18_10) ** GOTO lbl347
                throw null;
            }
lbl391:
            // 5 sources

            case 59: {
                var17_11 /* !! */  = (int)lj.ibiw("ibuz", ibja(int ), (int)125);
                if (!var18_10) ** GOTO lbl338
                throw null;
            }
            case 60: {
                var17_11 /* !! */  = (int)lj.ibiw("ibva", ibja(int ), (int)126);
                if (!var18_10) ** GOTO lbl274
                throw null;
            }
lbl399:
            // 2 sources

            case 61: {
                var17_11 /* !! */  = (int)lj.ibiw("ibvb", ibja(int ), (int)127);
                if (!var18_10) ** GOTO lbl378
                throw null;
            }
            case 62: {
                var17_11 /* !! */  = (int)lj.ibiw("ibvc", ibja(int ), (int)128);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl436
            }
lbl408:
            // 2 sources

            case 63: {
                var17_11 /* !! */  = (int)lj.ibiw("ibvd", ibja(int ), (int)129);
                if (!var18_10) ** GOTO lbl142
                throw null;
            }
lbl412:
            // 2 sources

            case 64: {
                var17_11 /* !! */  = (int)lj.ibiw("ibve", ibja(int ), (int)130);
                if (!var18_10) ** GOTO lbl378
                throw null;
            }
            case 65: {
                var17_11 /* !! */  = (int)lj.ibiw("ibvf", ibja(int ), (int)131);
                if (!var18_10) ** GOTO lbl152
                throw null;
            }
lbl420:
            // 2 sources

            case 66: {
                var17_11 /* !! */  = (int)lj.ibiw("ibvg", ibja(int ), (int)132);
                if (!var18_10) ** GOTO lbl370
                throw null;
            }
lbl424:
            // 4 sources

            case 67: {
                var17_11 /* !! */  = (int)lj.ibiw("ibvh", ibja(int ), (int)133);
                if (!var18_10) ** GOTO lbl257
                throw null;
            }
            case 68: {
                var17_11 /* !! */  = (int)lj.ibiw("ibvi", ibja(int ), (int)134);
                if (!var18_10) ** GOTO lbl152
                throw null;
            }
lbl432:
            // 3 sources

            case 69: {
                var17_11 /* !! */  = (int)lj.ibiw("ibvj", ibja(int ), (int)135);
                if (!var18_10) ** GOTO lbl378
                throw null;
            }
lbl436:
            // 2 sources

            case 70: {
                var17_11 /* !! */  = (int)lj.ibiw("ibvk", ibja(int ), (int)136);
                if (!var18_10) ** GOTO lbl420
                throw null;
            }
lbl440:
            // 4 sources

            case 71: {
                var17_11 /* !! */  = (int)lj.ibiw("ibvl", ibja(int ), (int)137);
                if (!var18_10) ** GOTO lbl216
                throw null;
            }
            case 72: 
        }
        var17_11 /* !! */  = (int)lj.ibiw("ibvm", ibja(int ), (int)138);
        ** while (!var18_10)
lbl447:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long ibit(int n2) {
        return ibiu[n2] ^ ibiv[n2];
    }

    private static /* synthetic */ float ibsg(int n2) {
        return Float.intBitsToFloat(ibjb[n2] ^ ibjc[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$init$0() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lj.pi - lj.ibiw("ibyg", ibit(int ), (int)94)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == lj.ibiw("ibyh", ibja(int ), (int)177)) break;
            v0 /* !! */  = (long)lj.ibiw("ibyi", ibja(int ), (int)178);
        }
        var2 = lj.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = lj.pi - lj.ibiw("ibyj", ibit(int ), (int)95)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == lj.ibiw("ibyk", ibja(int ), (int)179)) break;
            v1 /* !! */  = (long)lj.ibiw("ibyl", ibja(int ), (int)180);
        }
        var1_1 /* !! */  = lj.b;
        v2 /* !! */  = lj.pi;
        if (true) ** GOTO lbl19
        block12: while (true) {
            v2 /* !! */  = (long)(lj.ibiw("ibyn", ibit(int ), (int)97) - lj.ibiw("ibym", ibit(int ), (int)96));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 764833183: {
                    break block12;
                }
                case 883243567: {
                    continue block12;
                }
            }
            break;
        }
        var0_2 = lj.a;
        if (var2) {
            throw null;
            return null;
        }
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2 || var0_2) ** continue;
                return "InnerShadow2D Uniforms";
            }
            case 0: {
                do {
                    var1_1 /* !! */  = (int)lj.ibiw("ibyo", ibja(int ), (int)181);
                } while (!var2);
                throw null;
            }
            case 1: {
                var1_1 /* !! */  = (int)lj.ibiw("ibyp", ibja(int ), (int)182);
                if (!var2) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)lj.ibiw("ibyq", ibja(int ), (int)183);
                    if (!var2) break block4;
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)lj.ibiw("ibyr", ibja(int ), (int)184);
        ** while (!var2)
lbl51:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ibys() {
        lj.ibjb[0] = -862001241;
        lj.ibjb[1] = -215151393;
        lj.ibjb[2] = -483272557;
        lj.ibjb[3] = 716040843;
        lj.ibjb[4] = -1212505489;
        lj.ibjb[5] = 2033697336;
        lj.ibjb[6] = -1120054035;
        lj.ibjb[7] = -1623481072;
        lj.ibjb[8] = 602696127;
        lj.ibjb[9] = -1147487473;
        lj.ibjb[10] = -755574955;
        lj.ibjb[11] = -1347232875;
        lj.ibjb[12] = -602803549;
        lj.ibjb[13] = 69832168;
        lj.ibjb[14] = -1962987521;
        lj.ibjb[15] = -1698950369;
        lj.ibjb[16] = 552702754;
        lj.ibjb[17] = -818140664;
        lj.ibjb[18] = -932667407;
        lj.ibjb[19] = -366012131;
        lj.ibjb[20] = -436525371;
        lj.ibjb[21] = -33856955;
        lj.ibjb[22] = 535936458;
        lj.ibjb[23] = 1313592279;
        lj.ibjb[24] = 246631422;
        lj.ibjb[25] = 1618754594;
        lj.ibjb[26] = 1432900484;
        lj.ibjb[27] = 186360406;
        lj.ibjb[28] = 160197946;
        lj.ibjb[29] = 1966198947;
        lj.ibjb[30] = -1609848827;
        lj.ibjb[31] = -835030879;
        lj.ibjb[32] = -585051818;
        lj.ibjb[33] = -1430314214;
        lj.ibjb[34] = 500366345;
        lj.ibjb[35] = -1313839976;
        lj.ibjb[36] = -271628462;
        lj.ibjb[37] = 467042163;
        lj.ibjb[38] = 885609110;
        lj.ibjb[39] = -1326209153;
        lj.ibjb[40] = -261008489;
        lj.ibjb[41] = -273573960;
        lj.ibjb[42] = -425938913;
        lj.ibjb[43] = 163264584;
        lj.ibjb[44] = 1220055354;
        lj.ibjb[45] = -890578714;
        lj.ibjb[46] = 48599013;
        lj.ibjb[47] = -626618995;
        lj.ibjb[48] = 838543303;
        lj.ibjb[49] = 1390120290;
        lj.ibjb[50] = 104433542;
        lj.ibjb[51] = -1783936580;
        lj.ibjb[52] = 336148039;
        lj.ibjb[53] = -1400406287;
        lj.ibjb[54] = -2003561711;
        lj.ibjb[55] = -930981008;
        lj.ibjb[56] = 688051458;
        lj.ibjb[57] = -1853027428;
        lj.ibjb[58] = -859639270;
        lj.ibjb[59] = 584781951;
        lj.ibjb[60] = -1043227973;
        lj.ibjb[61] = 706668727;
        lj.ibjb[62] = -1671354241;
        lj.ibjb[63] = -782294427;
        lj.ibjb[64] = -678342781;
        lj.ibjb[65] = 1196177901;
        lj.ibjb[66] = 1767609769;
        lj.ibjb[67] = 170851917;
        lj.ibjb[68] = -723596457;
        lj.ibjb[69] = -167650425;
        lj.ibjb[70] = 1537939860;
        lj.ibjb[71] = -772813381;
        lj.ibjb[72] = 1466379675;
        lj.ibjb[73] = -998635150;
        lj.ibjb[74] = -1016354719;
        lj.ibjb[75] = -1147599894;
        lj.ibjb[76] = 270722342;
        lj.ibjb[77] = 394117812;
        lj.ibjb[78] = 756081641;
        lj.ibjb[79] = -1611828999;
        lj.ibjb[80] = -1674364354;
        lj.ibjb[81] = -718433613;
        lj.ibjb[82] = -762706714;
        lj.ibjb[83] = 265823539;
        lj.ibjb[84] = -749448888;
        lj.ibjb[85] = -1640130117;
        lj.ibjb[86] = -2020068782;
        lj.ibjb[87] = 1276027168;
        lj.ibjb[88] = 236509151;
        lj.ibjb[89] = 384501758;
        lj.ibjb[90] = 1619825334;
        lj.ibjb[91] = -974775002;
        lj.ibjb[92] = -434712481;
        lj.ibjb[93] = 212820251;
        lj.ibjb[94] = -2145079614;
        lj.ibjb[95] = -334437065;
        lj.ibjb[96] = -1464847859;
        lj.ibjb[97] = -417844026;
        lj.ibjb[98] = 1972436076;
        lj.ibjb[99] = 231019629;
    }

    private static /* synthetic */ void ibyx() {
        lj.ibiv[0] = -8709016643505176744L;
        lj.ibiv[1] = 3651812584444133885L;
        lj.ibiv[2] = -3096741609566839686L;
        lj.ibiv[3] = 6279592219721576096L;
        lj.ibiv[4] = -1173097685423053768L;
        lj.ibiv[5] = -6257610955566830128L;
        lj.ibiv[6] = -9045847804229224520L;
        lj.ibiv[7] = -6218208805890598948L;
        lj.ibiv[8] = -5708669057177884513L;
        lj.ibiv[9] = 7436596611788127415L;
        lj.ibiv[10] = 7364037339791168231L;
        lj.ibiv[11] = 8352046502103500468L;
        lj.ibiv[12] = -5605740273668924507L;
        lj.ibiv[13] = -4624605413190400781L;
        lj.ibiv[14] = 1802819141562332571L;
        lj.ibiv[15] = 8139411694484317631L;
        lj.ibiv[16] = -3933363150384326673L;
        lj.ibiv[17] = -6901724907110338810L;
        lj.ibiv[18] = 8047112660301112684L;
        lj.ibiv[19] = -5768763751825286802L;
        lj.ibiv[20] = -4492582137948613153L;
        lj.ibiv[21] = -3067730538041711926L;
        lj.ibiv[22] = 6099024380321569280L;
        lj.ibiv[23] = 4326553272614694430L;
        lj.ibiv[24] = -1457699987992775606L;
        lj.ibiv[25] = 4346667985662427343L;
        lj.ibiv[26] = 807871482792414214L;
        lj.ibiv[27] = -4654447230620756180L;
        lj.ibiv[28] = -138461349030759150L;
        lj.ibiv[29] = 9180514169696813266L;
        lj.ibiv[30] = 6505909940845567825L;
        lj.ibiv[31] = 7360607912273750799L;
        lj.ibiv[32] = -4319272782566873467L;
        lj.ibiv[33] = 6451623552160653932L;
        lj.ibiv[34] = 5341710618261011421L;
        lj.ibiv[35] = 6400154677003994919L;
        lj.ibiv[36] = -1188339468882941227L;
        lj.ibiv[37] = 408061823999675903L;
        lj.ibiv[38] = -7850227373655696167L;
        lj.ibiv[39] = 7961912351794554013L;
        lj.ibiv[40] = 6842598573210947653L;
        lj.ibiv[41] = 951070328163070384L;
        lj.ibiv[42] = 8442614729645494055L;
        lj.ibiv[43] = -5421610629673700518L;
        lj.ibiv[44] = -1756775853673673142L;
        lj.ibiv[45] = -2443734382505428881L;
        lj.ibiv[46] = 5737491215941025797L;
        lj.ibiv[47] = 7897871306163631798L;
        lj.ibiv[48] = -2024709722146440781L;
        lj.ibiv[49] = -2644560777916881767L;
        lj.ibiv[50] = -8513311199079292163L;
        lj.ibiv[51] = -8068862993728040835L;
        lj.ibiv[52] = 4742095403184273350L;
        lj.ibiv[53] = -3233178225523161971L;
        lj.ibiv[54] = 5496061578205921510L;
        lj.ibiv[55] = -952334880670095752L;
        lj.ibiv[56] = -3441414118326651070L;
        lj.ibiv[57] = -2148715797882824711L;
        lj.ibiv[58] = -551549593012947529L;
        lj.ibiv[59] = 7145301929474868231L;
        lj.ibiv[60] = -3332107516499423601L;
        lj.ibiv[61] = 736301893911216702L;
        lj.ibiv[62] = -4391188393958321407L;
        lj.ibiv[63] = 5210738559296522531L;
        lj.ibiv[64] = 1898236358205747709L;
        lj.ibiv[65] = -8066972675123063028L;
        lj.ibiv[66] = 4762018070869772992L;
        lj.ibiv[67] = -1763898413871654769L;
        lj.ibiv[68] = 1666071268934141166L;
        lj.ibiv[69] = 4554580749053423856L;
        lj.ibiv[70] = -5742664517962543477L;
        lj.ibiv[71] = 6934133816680033753L;
        lj.ibiv[72] = 6657955144957499601L;
        lj.ibiv[73] = -8115320983466147254L;
        lj.ibiv[74] = -2979908693125591484L;
        lj.ibiv[75] = -7573171389058263549L;
        lj.ibiv[76] = -993363850210052001L;
        lj.ibiv[77] = -2630981676093261647L;
        lj.ibiv[78] = 2911731640714198182L;
        lj.ibiv[79] = -43319389555804057L;
        lj.ibiv[80] = -4112762809326995742L;
        lj.ibiv[81] = 6737881815383258976L;
        lj.ibiv[82] = 1620219178520064430L;
        lj.ibiv[83] = 8112886857645884794L;
        lj.ibiv[84] = -2700359351182089956L;
        lj.ibiv[85] = 1719703474937682742L;
        lj.ibiv[86] = 6225962360568936498L;
        lj.ibiv[87] = 4797396585252134965L;
        lj.ibiv[88] = 8597961708697259728L;
        lj.ibiv[89] = 7585562893424137606L;
        lj.ibiv[90] = -2064399157992668941L;
        lj.ibiv[91] = -6959667746705566121L;
        lj.ibiv[92] = 1712431959522137030L;
        lj.ibiv[93] = -5492223607560483567L;
        lj.ibiv[94] = 3806723046249990063L;
        lj.ibiv[95] = 3630885927706101302L;
        lj.ibiv[96] = -6967669917944312035L;
        lj.ibiv[97] = 1208116537424028198L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void shutdown() {
        block82: {
            block81: {
                v0 /* !! */  = lj.pi;
                if (true) ** GOTO lbl5
                block54: while (true) {
                    v0 /* !! */  = (long)(v1 - lj.ibiw("ibvn", ibit(int ), (int)61));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1979024901: {
                            v1 = lj.ibiw("ibvo", ibit(int ), (int)62);
                            continue block54;
                        }
                        case -613308904: {
                            v1 = lj.ibiw("ibvp", ibit(int ), (int)63);
                            continue block54;
                        }
                        case 764833183: {
                            break block54;
                        }
                        case 2037527436: {
                            v1 = lj.ibiw("ibvq", ibit(int ), (int)64);
                            continue block54;
                        }
                    }
                    break;
                }
                var2 = lj.c;
                v2 /* !! */  = lj.pi;
                if (true) ** GOTO lbl22
                block55: while (true) {
                    v2 /* !! */  = (long)(v3 - lj.ibiw("ibvr", ibit(int ), (int)65));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case 77352102: {
                            v3 = lj.ibiw("ibvs", ibit(int ), (int)66);
                            continue block55;
                        }
                        case 523414658: {
                            v3 = lj.ibiw("ibvt", ibit(int ), (int)67);
                            continue block55;
                        }
                        case 764833183: {
                            break block55;
                        }
                    }
                    break;
                }
                var1_1 /* !! */  = lj.b;
                v4 /* !! */  = lj.pi;
                if (true) ** GOTO lbl36
                block56: while (true) {
                    v4 /* !! */  = (long)(v5 - lj.ibiw("ibvu", ibit(int ), (int)68));
lbl36:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1106283871: {
                            v5 = lj.ibiw("ibvv", ibit(int ), (int)69);
                            continue block56;
                        }
                        case -985719396: {
                            v5 = lj.ibiw("ibvw", ibit(int ), (int)70);
                            continue block56;
                        }
                        case 764833183: {
                            break block56;
                        }
                    }
                    break;
                }
                var0_2 = lj.a;
                if (var2) {
                    throw null;
lbl48:
                    // 11 sources

                    return;
                }
                if (var0_2 || var0_2) ** GOTO lbl48
                v6 /* !! */  = lj.pi;
                if (true) ** GOTO lbl55
                block58: while (true) {
                    v6 /* !! */  = (long)(v7 - lj.ibiw("ibvx", ibit(int ), (int)71));
lbl55:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1188542786: {
                            v7 = lj.ibiw("ibvy", ibit(int ), (int)72);
                            continue block58;
                        }
                        case 255820720: {
                            v7 = lj.ibiw("ibvz", ibit(int ), (int)73);
                            continue block58;
                        }
                        case 764833183: {
                            break block58;
                        }
                    }
                    break;
                }
                if (lj.uniformBuffer == null) break block81;
                if (var0_2 || var0_2) ** GOTO lbl48
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_0 = lj.pi - lj.ibiw("ibwa", ibit(int ), (int)74)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == lj.ibiw("ibwb", ibja(int ), (int)139)) break;
                    v8 /* !! */  = (long)lj.ibiw("ibwc", ibja(int ), (int)140);
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_1 = lj.pi - lj.ibiw("ibwd", ibit(int ), (int)75)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == lj.ibiw("ibwe", ibja(int ), (int)141)) break;
                    v9 /* !! */  = (long)lj.ibiw("ibwf", ibja(int ), (int)142);
                }
                lj.uniformBuffer.close();
                if (var0_2 || var0_2) ** GOTO lbl48
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_2 = lj.pi - lj.ibiw("ibwg", ibit(int ), (int)76)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == lj.ibiw("ibwh", ibja(int ), (int)143)) break;
                    v10 /* !! */  = (long)lj.ibiw("ibwi", ibja(int ), (int)144);
                }
                lj.uniformBuffer = null;
                if (var0_2) ** GOTO lbl48
            }
            if (var0_2 || var0_2) ** GOTO lbl48
            v11 /* !! */  = lj.pi;
            if (true) ** GOTO lbl91
            block62: while (true) {
                v11 /* !! */  = (long)(v12 - lj.ibiw("ibwj", ibit(int ), (int)77));
lbl91:
                // 2 sources

                switch ((int)v11 /* !! */ ) {
                    case 589046965: {
                        v12 = lj.ibiw("ibwk", ibit(int ), (int)78);
                        continue block62;
                    }
                    case 734349507: {
                        v12 = lj.ibiw("ibwl", ibit(int ), (int)79);
                        continue block62;
                    }
                    case 764833183: {
                        break block62;
                    }
                }
                break;
            }
            if (lj.uniformData == null) break block82;
            if (var0_2 || var0_2) ** GOTO lbl48
            v13 /* !! */  = lj.pi;
            if (true) ** GOTO lbl106
            block63: while (true) {
                v13 /* !! */  = (long)(v14 - lj.ibiw("ibwm", ibit(int ), (int)80));
lbl106:
                // 2 sources

                switch ((int)v13 /* !! */ ) {
                    case -1996127799: {
                        v14 = lj.ibiw("ibwn", ibit(int ), (int)81);
                        continue block63;
                    }
                    case -1100097082: {
                        v14 = lj.ibiw("ibwo", ibit(int ), (int)82);
                        continue block63;
                    }
                    case 764833183: {
                        break block63;
                    }
                    case 1755992484: {
                        v14 = lj.ibiw("ibwp", ibit(int ), (int)83);
                        continue block63;
                    }
                }
                break;
            }
            while (true) {
                if ((v15 /* !! */  = (cfr_temp_3 = lj.pi - lj.ibiw("ibwq", ibit(int ), (int)84)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v15 /* !! */  == lj.ibiw("ibwr", ibja(int ), (int)145)) break;
                v15 /* !! */  = (long)lj.ibiw("ibws", ibja(int ), (int)146);
            }
            MemoryUtil.memFree((Buffer)lj.uniformData);
            if (var0_2 || var0_2) ** GOTO lbl48
            while (true) {
                if ((v16 /* !! */  = (cfr_temp_4 = lj.pi - lj.ibiw("ibwt", ibit(int ), (int)85)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v16 /* !! */  == lj.ibiw("ibwu", ibja(int ), (int)147)) break;
                v16 /* !! */  = (long)lj.ibiw("ibwv", ibja(int ), (int)148);
            }
            lj.uniformData = null;
            if (var0_2) ** GOTO lbl48
        }
        if (var0_2) ** GOTO lbl48
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block32 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** GOTO lbl48
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_5 = lj.pi - lj.ibiw("ibww", ibit(int ), (int)86)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == lj.ibiw("ibwx", ibja(int ), (int)149)) break;
                    v17 /* !! */  = (long)lj.ibiw("ibwy", ibja(int ), (int)150);
                }
                lj.pipeline = null;
                if (!var0_2 && !var0_2) ** break;
                ** continue;
                return;
            }
lbl147:
            // 5 sources

            case 0: {
                var1_1 /* !! */  = (int)lj.ibiw("ibwz", ibja(int ), (int)151);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl152:
            // 2 sources

            case 1: {
                var1_1 /* !! */  = (int)lj.ibiw("ibxa", ibja(int ), (int)152);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl194
            }
            case 2: {
                var1_1 /* !! */  = (int)lj.ibiw("ibxb", ibja(int ), (int)153);
                if (!var2) break;
                throw null;
            }
            case 3: {
                var1_1 /* !! */  = (int)lj.ibiw("ibxc", ibja(int ), (int)154);
                if (!var2) ** GOTO lbl147
                throw null;
            }
            case 4: {
                var1_1 /* !! */  = (int)lj.ibiw("ibxd", ibja(int ), (int)155);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl216
            }
            case 5: {
                var1_1 /* !! */  = (int)lj.ibiw("ibxe", ibja(int ), (int)156);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl208
            }
            case 6: {
                var1_1 /* !! */  = (int)lj.ibiw("ibxf", ibja(int ), (int)157);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl203
            }
            case 7: {
                var1_1 /* !! */  = (int)lj.ibiw("ibxg", ibja(int ), (int)158);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl185:
            // 2 sources

            case 8: {
                var1_1 /* !! */  = (int)lj.ibiw("ibxh", ibja(int ), (int)159);
                if (!var2) break;
                throw null;
            }
lbl189:
            // 2 sources

            case 9: {
                var1_1 /* !! */  = (int)lj.ibiw("ibxi", ibja(int ), (int)160);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl220
            }
lbl194:
            // 2 sources

            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)lj.ibiw("ibxj", ibja(int ), (int)161);
                    if (!var2) break block32;
                    throw null;
                }
            }
            case 11: {
                var1_1 /* !! */  = (int)lj.ibiw("ibxk", ibja(int ), (int)162);
                if (!var2) ** GOTO lbl185
                throw null;
            }
lbl203:
            // 2 sources

            case 12: {
                var1_1 /* !! */  = (int)lj.ibiw("ibxl", ibja(int ), (int)163);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl208:
            // 2 sources

            case 13: {
                var1_1 /* !! */  = (int)lj.ibiw("ibxm", ibja(int ), (int)164);
                if (!var2) ** GOTO lbl147
                throw null;
            }
lbl212:
            // 2 sources

            case 14: {
                var1_1 /* !! */  = (int)lj.ibiw("ibxn", ibja(int ), (int)165);
                if (!var2) ** GOTO lbl147
                throw null;
            }
lbl216:
            // 2 sources

            case 15: {
                var1_1 /* !! */  = (int)lj.ibiw("ibxo", ibja(int ), (int)166);
                if (!var2) ** GOTO lbl152
                throw null;
            }
lbl220:
            // 2 sources

            case 16: {
                var1_1 /* !! */  = (int)lj.ibiw("ibxp", ibja(int ), (int)167);
                if (!var2) break;
                throw null;
            }
lbl224:
            // 3 sources

            case 17: {
                var1_1 /* !! */  = (int)lj.ibiw("ibxq", ibja(int ), (int)168);
                if (!var2) ** GOTO lbl189
                throw null;
            }
            case 18: {
                var1_1 /* !! */  = (int)lj.ibiw("ibxr", ibja(int ), (int)169);
                if (!var2) ** GOTO lbl147
                throw null;
            }
            case 19: 
        }
        var1_1 /* !! */  = (int)lj.ibiw("ibxs", ibja(int ), (int)170);
        ** while (!var2)
lbl235:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int ibja(int n2) {
        return ibjb[n2] ^ ibjc[n2];
    }

    private static /* synthetic */ void ibyv() {
        lj.ibjc[100] = -2003217927;
        lj.ibjc[101] = -9426067;
        lj.ibjc[102] = -132473198;
        lj.ibjc[103] = 1864249217;
        lj.ibjc[104] = -437632604;
        lj.ibjc[105] = -1907323050;
        lj.ibjc[106] = -2019904027;
        lj.ibjc[107] = -962632887;
        lj.ibjc[108] = -1750621398;
        lj.ibjc[109] = -1778339163;
        lj.ibjc[110] = 155635987;
        lj.ibjc[111] = -841716780;
        lj.ibjc[112] = 2139266294;
        lj.ibjc[113] = -285550572;
        lj.ibjc[114] = 880497279;
        lj.ibjc[115] = 577464240;
        lj.ibjc[116] = 1347872217;
        lj.ibjc[117] = -1488682541;
        lj.ibjc[118] = -194650268;
        lj.ibjc[119] = -1174267032;
        lj.ibjc[120] = -51831745;
        lj.ibjc[121] = -1480439125;
        lj.ibjc[122] = -2030097364;
        lj.ibjc[123] = -1249547955;
        lj.ibjc[124] = -573121373;
        lj.ibjc[125] = -628249243;
        lj.ibjc[126] = 1759820290;
        lj.ibjc[127] = -1985347207;
        lj.ibjc[128] = 382552900;
        lj.ibjc[129] = 1289051755;
        lj.ibjc[130] = 764959141;
        lj.ibjc[131] = -1796108784;
        lj.ibjc[132] = -483261160;
        lj.ibjc[133] = 1412897712;
        lj.ibjc[134] = 1974765439;
        lj.ibjc[135] = 958390217;
        lj.ibjc[136] = 884321281;
        lj.ibjc[137] = 353113805;
        lj.ibjc[138] = -704514826;
        lj.ibjc[139] = -422349154;
        lj.ibjc[140] = 2035137742;
        lj.ibjc[141] = 1407042142;
        lj.ibjc[142] = -173560593;
        lj.ibjc[143] = 171949956;
        lj.ibjc[144] = -1540297750;
        lj.ibjc[145] = 603996754;
        lj.ibjc[146] = -479430296;
        lj.ibjc[147] = -779877532;
        lj.ibjc[148] = -1538686776;
        lj.ibjc[149] = 215978548;
        lj.ibjc[150] = 458956148;
        lj.ibjc[151] = 1062215334;
        lj.ibjc[152] = 1038467556;
        lj.ibjc[153] = 913813102;
        lj.ibjc[154] = -598940649;
        lj.ibjc[155] = -1765954094;
        lj.ibjc[156] = -2047613325;
        lj.ibjc[157] = 1869060787;
        lj.ibjc[158] = -1929850877;
        lj.ibjc[159] = -1129984719;
        lj.ibjc[160] = -1133698481;
        lj.ibjc[161] = 1021587831;
        lj.ibjc[162] = 1972109378;
        lj.ibjc[163] = -1262210557;
        lj.ibjc[164] = 2028016994;
        lj.ibjc[165] = -1178541013;
        lj.ibjc[166] = -2137935382;
        lj.ibjc[167] = -1516354384;
        lj.ibjc[168] = 782120837;
        lj.ibjc[169] = -786233187;
        lj.ibjc[170] = 1627589557;
        lj.ibjc[171] = 1209865269;
        lj.ibjc[172] = -1196629071;
        lj.ibjc[173] = 2071125712;
        lj.ibjc[174] = 912936422;
        lj.ibjc[175] = 1937606072;
        lj.ibjc[176] = 936523100;
        lj.ibjc[177] = 1694361957;
        lj.ibjc[178] = 1482821176;
        lj.ibjc[179] = -353689835;
        lj.ibjc[180] = -1109936395;
        lj.ibjc[181] = 2088875175;
        lj.ibjc[182] = -55059892;
        lj.ibjc[183] = -1012836898;
        lj.ibjc[184] = 2066038899;
    }

    public static /* synthetic */ CallSite ibiw(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void ibyw() {
        lj.ibiu[0] = -2018008437581338194L;
        lj.ibiu[1] = 8866152101900207997L;
        lj.ibiu[2] = 2064404347901645760L;
        lj.ibiu[3] = 7459656478811813436L;
        lj.ibiu[4] = -879988126158481522L;
        lj.ibiu[5] = -1926639408884957797L;
        lj.ibiu[6] = 3821502660168267908L;
        lj.ibiu[7] = 999483953607043236L;
        lj.ibiu[8] = 5359403222747036186L;
        lj.ibiu[9] = 2913112923314508880L;
        lj.ibiu[10] = 1122729298814655664L;
        lj.ibiu[11] = -6346110226465815005L;
        lj.ibiu[12] = 1124695713308830042L;
        lj.ibiu[13] = -702930939594288571L;
        lj.ibiu[14] = -5346078617461106433L;
        lj.ibiu[15] = 2252709255215213123L;
        lj.ibiu[16] = -1696613367199390553L;
        lj.ibiu[17] = -2094699728462337710L;
        lj.ibiu[18] = 4929112991498336887L;
        lj.ibiu[19] = 4857468403317690859L;
        lj.ibiu[20] = 8653349634918106555L;
        lj.ibiu[21] = -3196590901679395387L;
        lj.ibiu[22] = 7519083525532727520L;
        lj.ibiu[23] = -6988182584627931111L;
        lj.ibiu[24] = 5088973321113774193L;
        lj.ibiu[25] = -5096772337383976588L;
        lj.ibiu[26] = 7653741171085072488L;
        lj.ibiu[27] = -217545907564099084L;
        lj.ibiu[28] = 2981548523612538832L;
        lj.ibiu[29] = 4485287571906998029L;
        lj.ibiu[30] = 1664880301167406015L;
        lj.ibiu[31] = 8856630898706133367L;
        lj.ibiu[32] = -2339041253772215072L;
        lj.ibiu[33] = 6670679854102322727L;
        lj.ibiu[34] = -2373389007178982586L;
        lj.ibiu[35] = -5562465222922095495L;
        lj.ibiu[36] = -8003353125221574580L;
        lj.ibiu[37] = 4361338068664825278L;
        lj.ibiu[38] = 2203845465465164070L;
        lj.ibiu[39] = 1047343631414190377L;
        lj.ibiu[40] = 8157740830709611328L;
        lj.ibiu[41] = -4448805450729102726L;
        lj.ibiu[42] = 968189320906251880L;
        lj.ibiu[43] = 4562255416328877378L;
        lj.ibiu[44] = 1169766202691624424L;
        lj.ibiu[45] = 4715452950150990587L;
        lj.ibiu[46] = 2297520416703799617L;
        lj.ibiu[47] = 7453641675017588063L;
        lj.ibiu[48] = -6692295340879112213L;
        lj.ibiu[49] = -5583351259909601310L;
        lj.ibiu[50] = -7787257006612349531L;
        lj.ibiu[51] = -4230848376296522446L;
        lj.ibiu[52] = 1218138121515619117L;
        lj.ibiu[53] = 3242203040372893449L;
        lj.ibiu[54] = 5496061578205921382L;
        lj.ibiu[55] = 379135689428684181L;
        lj.ibiu[56] = 4829133522576848681L;
        lj.ibiu[57] = -4588738925128241347L;
        lj.ibiu[58] = -619167823145160309L;
        lj.ibiu[59] = -4610356427458915453L;
        lj.ibiu[60] = 7931306672903733210L;
        lj.ibiu[61] = -7676113505787977266L;
        lj.ibiu[62] = 3137134224382434201L;
        lj.ibiu[63] = 4364916878537850046L;
        lj.ibiu[64] = -7281640741437242940L;
        lj.ibiu[65] = -5734535106878048510L;
        lj.ibiu[66] = 7358251347266745656L;
        lj.ibiu[67] = -7463993984807874536L;
        lj.ibiu[68] = 5051572576277615849L;
        lj.ibiu[69] = -2834108009822441475L;
        lj.ibiu[70] = 7131107259199470914L;
        lj.ibiu[71] = -5083566491276776029L;
        lj.ibiu[72] = -1054570682614537963L;
        lj.ibiu[73] = 2837792154297653513L;
        lj.ibiu[74] = -7433503961628200551L;
        lj.ibiu[75] = -5138190627612139222L;
        lj.ibiu[76] = -957316433991671574L;
        lj.ibiu[77] = 7879726529754491059L;
        lj.ibiu[78] = 4058102998856121377L;
        lj.ibiu[79] = 4271103716688910953L;
        lj.ibiu[80] = -4589846808236628182L;
        lj.ibiu[81] = 2091717797645339806L;
        lj.ibiu[82] = -6285789768039037205L;
        lj.ibiu[83] = 4369969847754564756L;
        lj.ibiu[84] = -739517433060221760L;
        lj.ibiu[85] = -8373276284274045614L;
        lj.ibiu[86] = 3633117637546221373L;
        lj.ibiu[87] = -2496261530148754939L;
        lj.ibiu[88] = 9216345350130941345L;
        lj.ibiu[89] = 8012215511134082865L;
        lj.ibiu[90] = -2481887528317200554L;
        lj.ibiu[91] = 3117991886121473747L;
        lj.ibiu[92] = -6323392003817405149L;
        lj.ibiu[93] = 1991523774227351533L;
        lj.ibiu[94] = 7375058428822322684L;
        lj.ibiu[95] = 5201075765244195418L;
        lj.ibiu[96] = 5412413318744039808L;
        lj.ibiu[97] = 2810597677863011682L;
    }

    private static /* synthetic */ void ibyu() {
        lj.ibjc[0] = -862001242;
        lj.ibjc[1] = -1479008104;
        lj.ibjc[2] = 483272556;
        lj.ibjc[3] = 179223776;
        lj.ibjc[4] = 1212505488;
        lj.ibjc[5] = 358871223;
        lj.ibjc[6] = 1120054034;
        lj.ibjc[7] = -1812881177;
        lj.ibjc[8] = -602696128;
        lj.ibjc[9] = -1898874496;
        lj.ibjc[10] = 755574954;
        lj.ibjc[11] = -1479366546;
        lj.ibjc[12] = 602803548;
        lj.ibjc[13] = -16843547;
        lj.ibjc[14] = 1962987520;
        lj.ibjc[15] = 1896235983;
        lj.ibjc[16] = 552702755;
        lj.ibjc[17] = 373120970;
        lj.ibjc[18] = -932667408;
        lj.ibjc[19] = 180071465;
        lj.ibjc[20] = -436525371;
        lj.ibjc[21] = 33856954;
        lj.ibjc[22] = -305584663;
        lj.ibjc[23] = -1313592280;
        lj.ibjc[24] = -1855140965;
        lj.ibjc[25] = 1618754595;
        lj.ibjc[26] = -838376181;
        lj.ibjc[27] = 186360542;
        lj.ibjc[28] = 160197947;
        lj.ibjc[29] = -1429090137;
        lj.ibjc[30] = -1609848828;
        lj.ibjc[31] = 1882535998;
        lj.ibjc[32] = -585051690;
        lj.ibjc[33] = 1430314213;
        lj.ibjc[34] = 1900478416;
        lj.ibjc[35] = -1313839973;
        lj.ibjc[36] = -271628460;
        lj.ibjc[37] = 467042160;
        lj.ibjc[38] = 885609117;
        lj.ibjc[39] = -1326209159;
        lj.ibjc[40] = -261008487;
        lj.ibjc[41] = -273573956;
        lj.ibjc[42] = -425938919;
        lj.ibjc[43] = 163264588;
        lj.ibjc[44] = 1220055353;
        lj.ibjc[45] = -890578714;
        lj.ibjc[46] = 48599020;
        lj.ibjc[47] = -626619007;
        lj.ibjc[48] = 838543305;
        lj.ibjc[49] = 1390120292;
        lj.ibjc[50] = 104433542;
        lj.ibjc[51] = -1783936577;
        lj.ibjc[52] = 336147975;
        lj.ibjc[53] = -1400406303;
        lj.ibjc[54] = -2003561490;
        lj.ibjc[55] = -1946330256;
        lj.ibjc[56] = 688051466;
        lj.ibjc[57] = -1853027485;
        lj.ibjc[58] = -1883377126;
        lj.ibjc[59] = 584781952;
        lj.ibjc[60] = -2102486341;
        lj.ibjc[61] = 706668719;
        lj.ibjc[62] = -1671354240;
        lj.ibjc[63] = -1843387803;
        lj.ibjc[64] = -678342781;
        lj.ibjc[65] = 1196177899;
        lj.ibjc[66] = 1767609836;
        lj.ibjc[67] = 170851934;
        lj.ibjc[68] = -723596475;
        lj.ibjc[69] = -167650427;
        lj.ibjc[70] = 1537939860;
        lj.ibjc[71] = -772813314;
        lj.ibjc[72] = 1466379662;
        lj.ibjc[73] = -998635180;
        lj.ibjc[74] = -1016354711;
        lj.ibjc[75] = -1147599893;
        lj.ibjc[76] = 270722315;
        lj.ibjc[77] = 394117884;
        lj.ibjc[78] = 756081583;
        lj.ibjc[79] = -1611829021;
        lj.ibjc[80] = -1674364357;
        lj.ibjc[81] = -718433643;
        lj.ibjc[82] = -762706737;
        lj.ibjc[83] = 265823488;
        lj.ibjc[84] = -749448860;
        lj.ibjc[85] = -1640130162;
        lj.ibjc[86] = -2020068757;
        lj.ibjc[87] = 1276027196;
        lj.ibjc[88] = 236509130;
        lj.ibjc[89] = 384501711;
        lj.ibjc[90] = 1619825331;
        lj.ibjc[91] = -974774986;
        lj.ibjc[92] = -434712546;
        lj.ibjc[93] = 212820253;
        lj.ibjc[94] = -2145079562;
        lj.ibjc[95] = -334437067;
        lj.ibjc[96] = -1464847819;
        lj.ibjc[97] = -417844029;
        lj.ibjc[98] = 1972436092;
        lj.ibjc[99] = 231019629;
    }

    private lj() {
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$draw$1() {
        v0 /* !! */  = lj.pi;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - lj.ibiw("ibxt", ibit(int ), (int)87));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -336024851: {
                    v1 = lj.ibiw("ibxu", ibit(int ), (int)88);
                    continue block16;
                }
                case -181795423: {
                    v1 = lj.ibiw("ibxv", ibit(int ), (int)89);
                    continue block16;
                }
                case 712654972: {
                    v1 = lj.ibiw("ibxw", ibit(int ), (int)90);
                    continue block16;
                }
                case 764833183: {
                    break block16;
                }
            }
            break;
        }
        var2 = lj.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = lj.pi - lj.ibiw("ibxx", ibit(int ), (int)91)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == lj.ibiw("ibxy", ibja(int ), (int)171)) break;
            v2 /* !! */  = (long)lj.ibiw("ibxz", ibja(int ), (int)172);
        }
        var1_1 /* !! */  = lj.b;
        v3 /* !! */  = lj.pi;
        if (true) ** GOTO lbl29
        block18: while (true) {
            v3 /* !! */  = (long)(lj.ibiw("ibyb", ibit(int ), (int)93) - lj.ibiw("ibya", ibit(int ), (int)92));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 480283158: {
                    continue block18;
                }
                case 764833183: {
                    break block18;
                }
            }
            break;
        }
        var0_2 = lj.a;
        if (var2) {
            throw null;
lbl37:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl37
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                return "InnerShadow2D";
            }
            case 0: {
                var1_1 /* !! */  = (int)lj.ibiw("ibyc", ibja(int ), (int)173);
                if (var2) {
                    throw null;
                }
            }
lbl49:
            // 4 sources

            case 1: {
                do {
                    var1_1 /* !! */  = (int)lj.ibiw("ibyd", ibja(int ), (int)174);
                } while (!var2);
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)lj.ibiw("ibye", ibja(int ), (int)175);
                if (!var2) ** GOTO lbl49
                throw null;
            }
            case 3: 
        }
        do {
            var1_1 /* !! */  = (int)lj.ibiw("ibyf", ibja(int ), (int)176);
        } while (!var2);
        throw null;
    }

    static {
        ibjb = new int[185];
        ibjc = new int[185];
        lj.ibys();
        lj.ibyt();
        lj.ibyu();
        lj.ibyv();
        ibiu = new long[98];
        ibiv = new long[98];
        lj.ibyw();
        lj.ibyx();
    }
}

