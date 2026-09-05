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

public final class lk {
    private static long[] ixvw;
    private static final int UNIFORM_SIZE = 128;
    private static GpuBuffer uniformBuffer;
    private static ByteBuffer uniformData;
    public static final boolean a;
    private static int[] ixux;
    private static long[] ixvu;
    private static RenderPipeline pipeline;
    private static int[] ixuw;
    public static final boolean c;
    public static final long qt = 1530863573708345930L;
    public static final int b;

    /*
     * Exception decompiling
     */
    public static void init() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 64[SWITCH]
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

    private static /* synthetic */ void iykh() {
        lk.ixvw[100] = 2085818821961751837L;
        lk.ixvw[101] = -689310173443116332L;
        lk.ixvw[102] = -4708114332658545145L;
        lk.ixvw[103] = 1557123161877568860L;
        lk.ixvw[104] = -1025523620194829578L;
        lk.ixvw[105] = 3033826216951328009L;
        lk.ixvw[106] = 2105373651627975684L;
    }

    public static /* synthetic */ CallSite ixuy(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void iykg() {
        lk.ixvw[0] = 1839426822071030674L;
        lk.ixvw[1] = -8091516636103744130L;
        lk.ixvw[2] = -218347855496572630L;
        lk.ixvw[3] = -1739312630404193667L;
        lk.ixvw[4] = 2606938290452971659L;
        lk.ixvw[5] = -383804373133919815L;
        lk.ixvw[6] = 675825402330324251L;
        lk.ixvw[7] = 3931938951548036034L;
        lk.ixvw[8] = -5503145216548023058L;
        lk.ixvw[9] = 6244728716171528400L;
        lk.ixvw[10] = -8039221418140301783L;
        lk.ixvw[11] = -6694598999559421505L;
        lk.ixvw[12] = 8177375311015791592L;
        lk.ixvw[13] = 798980694333941199L;
        lk.ixvw[14] = -3539931801199780243L;
        lk.ixvw[15] = -4786583521244654485L;
        lk.ixvw[16] = 1791804890618969197L;
        lk.ixvw[17] = -8956310273805814496L;
        lk.ixvw[18] = -4771371826904285064L;
        lk.ixvw[19] = -699706452776074573L;
        lk.ixvw[20] = 1162746505583476132L;
        lk.ixvw[21] = -7018368096873617894L;
        lk.ixvw[22] = -7594260977511376799L;
        lk.ixvw[23] = 3600919316809882449L;
        lk.ixvw[24] = -7323680765087812716L;
        lk.ixvw[25] = -438293064376974089L;
        lk.ixvw[26] = 1695283416249005574L;
        lk.ixvw[27] = -8619061809095964079L;
        lk.ixvw[28] = -5316746617751174658L;
        lk.ixvw[29] = -7231853222537653868L;
        lk.ixvw[30] = -8779457774080648605L;
        lk.ixvw[31] = -7432361915921367914L;
        lk.ixvw[32] = 1055406853182722554L;
        lk.ixvw[33] = 1007762931214307132L;
        lk.ixvw[34] = -1108069969074017669L;
        lk.ixvw[35] = 9174828109513885053L;
        lk.ixvw[36] = -5403169485790526954L;
        lk.ixvw[37] = 7717305344664957128L;
        lk.ixvw[38] = 2859187330331979558L;
        lk.ixvw[39] = 6938929948384119333L;
        lk.ixvw[40] = -126061319441458945L;
        lk.ixvw[41] = -5576652707280675258L;
        lk.ixvw[42] = -6883663442989658813L;
        lk.ixvw[43] = -4429328780064735594L;
        lk.ixvw[44] = 5033729978149866513L;
        lk.ixvw[45] = -8146435319886419304L;
        lk.ixvw[46] = -818140069655911396L;
        lk.ixvw[47] = 1839665614523623848L;
        lk.ixvw[48] = -7064272580433891741L;
        lk.ixvw[49] = 1476239467372292792L;
        lk.ixvw[50] = -3327600138330710269L;
        lk.ixvw[51] = -6717359246238154893L;
        lk.ixvw[52] = 2575688451983685771L;
        lk.ixvw[53] = -3965949143249867213L;
        lk.ixvw[54] = 4655615795104557139L;
        lk.ixvw[55] = -3656339401999625098L;
        lk.ixvw[56] = 7115516850567027012L;
        lk.ixvw[57] = 5258779238945018149L;
        lk.ixvw[58] = 6446731185342609480L;
        lk.ixvw[59] = 8957459667610072736L;
        lk.ixvw[60] = 6619227882583575267L;
        lk.ixvw[61] = 178163537019800217L;
        lk.ixvw[62] = 1004517043828820961L;
        lk.ixvw[63] = 3156188149143143070L;
        lk.ixvw[64] = -7949823260617641269L;
        lk.ixvw[65] = -123420876067273426L;
        lk.ixvw[66] = 8892704452111317027L;
        lk.ixvw[67] = -4424089947350636425L;
        lk.ixvw[68] = -5271252623602157110L;
        lk.ixvw[69] = -6227063825357163886L;
        lk.ixvw[70] = -4197813707599426003L;
        lk.ixvw[71] = -6205757725169353645L;
        lk.ixvw[72] = -3447985761349782720L;
        lk.ixvw[73] = 850098257140368612L;
        lk.ixvw[74] = 7963563580040306019L;
        lk.ixvw[75] = -4434772343980266620L;
        lk.ixvw[76] = -5495223860152053772L;
        lk.ixvw[77] = 4727770961097997208L;
        lk.ixvw[78] = 6243699330280495635L;
        lk.ixvw[79] = 4194394225703509100L;
        lk.ixvw[80] = -5906017830078801497L;
        lk.ixvw[81] = 2825461057975277877L;
        lk.ixvw[82] = 1457451972595843430L;
        lk.ixvw[83] = -7694368529549512840L;
        lk.ixvw[84] = -5289378857916745666L;
        lk.ixvw[85] = 3270047515719125594L;
        lk.ixvw[86] = -4158030461883135995L;
        lk.ixvw[87] = 6278757835070991564L;
        lk.ixvw[88] = 6144712968745272142L;
        lk.ixvw[89] = 6262120613796770661L;
        lk.ixvw[90] = -396694191394110577L;
        lk.ixvw[91] = -7111527006126373056L;
        lk.ixvw[92] = -1714623408068437369L;
        lk.ixvw[93] = -6608848682927430513L;
        lk.ixvw[94] = -8493694895016035202L;
        lk.ixvw[95] = 6041944848514308283L;
        lk.ixvw[96] = -5961152688776726867L;
        lk.ixvw[97] = -6334579666730010268L;
        lk.ixvw[98] = 1459889908420875703L;
        lk.ixvw[99] = -3453261873657957753L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void draw(Matrix4f var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, float var8_8, int var9_9, float var10_10) {
        block143: {
            block142: {
                block141: {
                    var19_11 = lk.c;
                    var18_12 /* !! */  = lk.b;
                    var17_13 = lk.a;
                    if (var19_11) {
                        throw null;
lbl6:
                        // 42 sources

                        return;
                    }
                    if (var17_13 || var17_13) ** GOTO lbl6
                    if (lk.pipeline != null) break block141;
                    if (var17_13) ** GOTO lbl6
                    lk.init();
                    if (var17_13) ** GOTO lbl6
                }
                if (var17_13 || var17_13) ** GOTO lbl6
                if (lk.pipeline == null) break block142;
                if (var17_13) ** GOTO lbl6
                if (lk.uniformBuffer != null) break block143;
                if (var17_13) ** GOTO lbl6
            }
            if (var17_13 || var17_13) ** GOTO lbl6
            return;
        }
        if (var17_13 || var17_13) ** GOTO lbl6
        var11_14 = lk.uniformData;
        if (var17_13 || var17_13) ** GOTO lbl6
        var11_14.clear();
        if (var17_13 || var17_13) ** GOTO lbl6
        var11_14.putFloat(var0.m00()).putFloat(var0.m01()).putFloat(var0.m02()).putFloat(var0.m03());
        if (var17_13 || var17_13) ** GOTO lbl6
        var11_14.putFloat(var0.m10()).putFloat(var0.m11()).putFloat(var0.m12()).putFloat(var0.m13());
        if (var17_13 || var17_13) ** GOTO lbl6
        var11_14.putFloat(var0.m20()).putFloat(var0.m21()).putFloat(var0.m22()).putFloat(var0.m23());
        if (var17_13 || var17_13) ** GOTO lbl6
        var11_14.putFloat(var0.m30()).putFloat(var0.m31()).putFloat(var0.m32()).putFloat(var0.m33());
        if (var17_13 || var17_13) ** GOTO lbl6
        var11_14.position((int)lk.ixuy("iydo", ixut(int ), (int)47));
        if (var17_13 || var17_13) ** GOTO lbl6
        var11_14.putFloat(var1_1).putFloat(var2_2).putFloat(var3_3).putFloat(var4_4);
        if (var17_13) ** GOTO lbl6
        if (var18_12 /* !! */  == 0) ** GOTO lbl-1000
        switch (var18_12 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var17_13) ** GOTO lbl6
                var11_14.putFloat(var5_5).putFloat(var6_6).putFloat(var7_7).putFloat(var8_8);
                if (var17_13 || var17_13) ** GOTO lbl6
                var11_14.putFloat((float)(var9_9 >> lk.ixuy("iydp", ixut(int ), (int)48) & lk.ixuy("iydq", ixut(int ), (int)49)) / lk.ixuy("iyds", iydr(int ), (int)50));
                if (var17_13 || var17_13) ** GOTO lbl6
                var11_14.putFloat((float)(var9_9 >> lk.ixuy("iydt", ixut(int ), (int)51) & lk.ixuy("iydu", ixut(int ), (int)52)) / lk.ixuy("iydv", iydr(int ), (int)53));
                if (var17_13 || var17_13) ** GOTO lbl6
                var11_14.putFloat((float)(var9_9 & lk.ixuy("iydw", ixut(int ), (int)54)) / lk.ixuy("iydx", iydr(int ), (int)55));
                if (var17_13 || var17_13) ** GOTO lbl6
                var11_14.putFloat((float)(var9_9 >> lk.ixuy("iydy", ixut(int ), (int)56) & lk.ixuy("iydz", ixut(int ), (int)57)) / lk.ixuy("iyea", iydr(int ), (int)58));
                if (var17_13 || var17_13) ** GOTO lbl6
                var11_14.putFloat(var10_10).putFloat(0.0f).putFloat(0.0f).putFloat(0.0f);
                if (var17_13 || var17_13) ** GOTO lbl6
                var11_14.flip();
                if (var17_13 || var17_13) ** GOTO lbl6
                var12_15 = RenderSystem.getDevice().createCommandEncoder();
                if (var17_13 || var17_13) ** GOTO lbl6
                var12_15.writeToBuffer(lk.uniformBuffer.slice(), var11_14);
                if (var17_13 || var17_13) ** GOTO lbl6
                var13_16 = class_310.method_1551().method_1522();
                if (var17_13 || var17_13) ** GOTO lbl6
                var14_17 = var12_15.createRenderPass((Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$draw$1(), ()Ljava/lang/String;)(), var13_16.method_71639(), OptionalInt.empty());
                if (var17_13) ** GOTO lbl6
                try {
                    if (var17_13) ** GOTO lbl6
                    var14_17.setPipeline(lk.pipeline);
                    if (var17_13 || var17_13) ** GOTO lbl6
                    var14_17.setUniform("Uniforms", lk.uniformBuffer);
                    if (var17_13 || var17_13) ** GOTO lbl6
                    var14_17.draw((int)lk.ixuy("iyeb", ixut(int ), (int)59), (int)lk.ixuy("iyec", ixut(int ), (int)60));
                    if (var17_13 || var17_13) ** GOTO lbl6
                    if (var14_17 == null) ** GOTO lbl112
                    if (var17_13) ** GOTO lbl6
                }
                catch (Throwable var15_18) {
                    if (var17_13) ** GOTO lbl6
                    if (var14_17 == null) ** GOTO lbl105
                    if (var17_13) ** GOTO lbl6
                    try {
                        if (var17_13) ** GOTO lbl6
                        var14_17.close();
                        if (var17_13 || var17_13) ** GOTO lbl6
                        ** if (!var19_11) goto lbl-1000
                    }
                    catch (Throwable var16_19) {
                        if (var17_13) ** GOTO lbl6
                        var15_18.addSuppressed(var16_19);
                        if (var17_13) ** GOTO lbl6
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
lbl105:
                    // 3 sources

                    if (var17_13 || var17_13) ** GOTO lbl6
                    throw var15_18;
                }
                var14_17.close();
                if (var17_13) ** GOTO lbl6
                if (var19_11) {
                    throw null;
                }
lbl112:
                // 3 sources

                if (!var17_13 && !var17_13) ** break;
                ** continue;
                return;
            }
            case 0: {
                var18_12 /* !! */  = (int)lk.ixuy("iyed", ixut(int ), (int)61);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl419
            }
lbl120:
            // 2 sources

            case 1: {
                var18_12 /* !! */  = (int)lk.ixuy("iyee", ixut(int ), (int)62);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl395
            }
            case 2: {
                var18_12 /* !! */  = (int)lk.ixuy("iyef", ixut(int ), (int)63);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl253
            }
lbl130:
            // 3 sources

            case 3: {
                var18_12 /* !! */  = (int)lk.ixuy("iyeg", ixut(int ), (int)64);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl289
            }
            case 4: {
                var18_12 /* !! */  = (int)lk.ixuy("iyeh", ixut(int ), (int)65);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl262
            }
            case 5: {
                var18_12 /* !! */  = (int)lk.ixuy("iyei", ixut(int ), (int)66);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl184
            }
lbl145:
            // 3 sources

            case 6: {
                var18_12 /* !! */  = (int)lk.ixuy("iyej", ixut(int ), (int)67);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl325
            }
            case 7: {
                var18_12 /* !! */  = (int)lk.ixuy("iyek", ixut(int ), (int)68);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl343
            }
lbl155:
            // 3 sources

            case 8: {
                var18_12 /* !! */  = (int)lk.ixuy("iyel", ixut(int ), (int)69);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl329
            }
            case 9: {
                var18_12 /* !! */  = (int)lk.ixuy("iyem", ixut(int ), (int)70);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl198
            }
            case 10: {
                var18_12 /* !! */  = (int)lk.ixuy("iyen", ixut(int ), (int)71);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl343
            }
            case 11: {
                var18_12 /* !! */  = (int)lk.ixuy("iyeo", ixut(int ), (int)72);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl391
            }
            case 12: {
                var18_12 /* !! */  = (int)lk.ixuy("iyep", ixut(int ), (int)73);
                if (!var19_11) ** GOTO lbl120
                throw null;
            }
lbl179:
            // 4 sources

            case 13: {
                var18_12 /* !! */  = (int)lk.ixuy("iyeq", ixut(int ), (int)74);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl359
            }
lbl184:
            // 2 sources

            case 14: {
                var18_12 /* !! */  = (int)lk.ixuy("iyer", ixut(int ), (int)75);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl415
            }
lbl189:
            // 2 sources

            case 15: {
                var18_12 /* !! */  = (int)lk.ixuy("iyes", ixut(int ), (int)76);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl343
            }
lbl194:
            // 2 sources

            case 16: {
                var18_12 /* !! */  = (int)lk.ixuy("iyet", ixut(int ), (int)77);
                if (!var19_11) ** GOTO lbl179
                throw null;
            }
lbl198:
            // 2 sources

            case 17: {
                var18_12 /* !! */  = (int)lk.ixuy("iyeu", ixut(int ), (int)78);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl415
            }
lbl203:
            // 3 sources

            case 18: {
                var18_12 /* !! */  = (int)lk.ixuy("iyev", ixut(int ), (int)79);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl298
            }
            case 19: {
                var18_12 /* !! */  = (int)lk.ixuy("iyew", ixut(int ), (int)80);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl231
            }
lbl213:
            // 2 sources

            case 20: {
                var18_12 /* !! */  = (int)lk.ixuy("iyex", ixut(int ), (int)81);
                if (!var19_11) ** GOTO lbl179
                throw null;
            }
lbl217:
            // 5 sources

            case 21: {
                var18_12 /* !! */  = (int)lk.ixuy("iyey", ixut(int ), (int)82);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl334
            }
            case 22: {
                var18_12 /* !! */  = (int)lk.ixuy("iyez", ixut(int ), (int)83);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl387
            }
            case 23: {
                var18_12 /* !! */  = (int)lk.ixuy("iyfa", ixut(int ), (int)84);
                if (!var19_11) ** GOTO lbl179
                throw null;
            }
lbl231:
            // 4 sources

            case 24: {
                var18_12 /* !! */  = (int)lk.ixuy("iyfb", ixut(int ), (int)85);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl367
            }
lbl236:
            // 2 sources

            case 25: {
                var18_12 /* !! */  = (int)lk.ixuy("iyfc", ixut(int ), (int)86);
                if (!var19_11) ** GOTO lbl203
                throw null;
            }
lbl240:
            // 2 sources

            case 26: {
                var18_12 /* !! */  = (int)lk.ixuy("iyfd", ixut(int ), (int)87);
                if (!var19_11) ** GOTO lbl217
                throw null;
            }
lbl244:
            // 2 sources

            case 27: {
                var18_12 /* !! */  = (int)lk.ixuy("iyfe", ixut(int ), (int)88);
                if (!var19_11) ** GOTO lbl213
                throw null;
            }
            case 28: {
                var18_12 /* !! */  = (int)lk.ixuy("iyff", ixut(int ), (int)89);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl351
            }
lbl253:
            // 3 sources

            case 29: {
                var18_12 /* !! */  = (int)lk.ixuy("iyfg", ixut(int ), (int)90);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl419
            }
lbl258:
            // 2 sources

            case 30: {
                var18_12 /* !! */  = (int)lk.ixuy("iyfh", ixut(int ), (int)91);
                if (!var19_11) ** GOTO lbl244
                throw null;
            }
lbl262:
            // 4 sources

            case 31: {
                var18_12 /* !! */  = (int)lk.ixuy("iyfi", ixut(int ), (int)92);
                if (!var19_11) ** GOTO lbl194
                throw null;
            }
            case 32: {
                var18_12 /* !! */  = (int)lk.ixuy("iyfj", ixut(int ), (int)93);
                if (!var19_11) ** GOTO lbl262
                throw null;
            }
lbl270:
            // 2 sources

            case 33: {
                var18_12 /* !! */  = (int)lk.ixuy("iyfk", ixut(int ), (int)94);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl321
            }
lbl275:
            // 2 sources

            case 34: {
                var18_12 /* !! */  = (int)lk.ixuy("iyfl", ixut(int ), (int)95);
                if (!var19_11) ** GOTO lbl262
                throw null;
            }
lbl279:
            // 3 sources

            case 35: {
                var18_12 /* !! */  = (int)lk.ixuy("iyfm", ixut(int ), (int)96);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl407
            }
            case 36: {
                var18_12 /* !! */  = (int)lk.ixuy("iyfn", ixut(int ), (int)97);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl355
            }
lbl289:
            // 3 sources

            case 37: {
                var18_12 /* !! */  = (int)lk.ixuy("iyfo", ixut(int ), (int)98);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl302
            }
            case 38: {
                var18_12 /* !! */  = (int)lk.ixuy("iyfp", ixut(int ), (int)99);
                if (!var19_11) ** GOTO lbl231
                throw null;
            }
lbl298:
            // 2 sources

            case 39: {
                var18_12 /* !! */  = (int)lk.ixuy("iyfq", ixut(int ), (int)100);
                if (!var19_11) ** GOTO lbl258
                throw null;
            }
lbl302:
            // 2 sources

            case 40: {
                var18_12 /* !! */  = (int)lk.ixuy("iyfr", ixut(int ), (int)101);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl343
            }
            case 41: {
                var18_12 /* !! */  = (int)lk.ixuy("iyfs", ixut(int ), (int)102);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl403
            }
            case 42: {
                var18_12 /* !! */  = (int)lk.ixuy("iyft", ixut(int ), (int)103);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl329
            }
            case 43: {
                var18_12 /* !! */  = (int)lk.ixuy("iyfu", ixut(int ), (int)104);
                if (!var19_11) ** GOTO lbl189
                throw null;
            }
lbl321:
            // 2 sources

            case 44: {
                var18_12 /* !! */  = (int)lk.ixuy("iyfv", ixut(int ), (int)105);
                if (!var19_11) ** GOTO lbl155
                throw null;
            }
lbl325:
            // 3 sources

            case 45: {
                var18_12 /* !! */  = (int)lk.ixuy("iyfw", ixut(int ), (int)106);
                if (!var19_11) ** GOTO lbl236
                throw null;
            }
lbl329:
            // 3 sources

            case 46: {
                var18_12 /* !! */  = (int)lk.ixuy("iyfx", ixut(int ), (int)107);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl407
            }
lbl334:
            // 2 sources

            case 47: {
                var18_12 /* !! */  = (int)lk.ixuy("iyfy", ixut(int ), (int)108);
                if (!var19_11) ** GOTO lbl155
                throw null;
            }
lbl338:
            // 2 sources

            case 48: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var18_12 /* !! */  = (int)lk.ixuy("iyfz", ixut(int ), (int)109);
                    if (!var19_11) ** GOTO lbl279
                    throw null;
                }
            }
lbl343:
            // 5 sources

            case 49: {
                var18_12 /* !! */  = (int)lk.ixuy("iyga", ixut(int ), (int)110);
                if (!var19_11) ** GOTO lbl217
                throw null;
            }
            case 50: {
                var18_12 /* !! */  = (int)lk.ixuy("iygb", ixut(int ), (int)111);
                if (!var19_11) ** GOTO lbl130
                throw null;
            }
lbl351:
            // 3 sources

            case 51: {
                var18_12 /* !! */  = (int)lk.ixuy("iygc", ixut(int ), (int)112);
                if (!var19_11) ** GOTO lbl275
                throw null;
            }
lbl355:
            // 4 sources

            case 52: {
                var18_12 /* !! */  = (int)lk.ixuy("iygd", ixut(int ), (int)113);
                if (!var19_11) ** GOTO lbl289
                throw null;
            }
lbl359:
            // 2 sources

            case 53: {
                var18_12 /* !! */  = (int)lk.ixuy("iyge", ixut(int ), (int)114);
                if (!var19_11) ** GOTO lbl351
                throw null;
            }
            case 54: {
                var18_12 /* !! */  = (int)lk.ixuy("iygf", ixut(int ), (int)115);
                if (!var19_11) ** GOTO lbl217
                throw null;
            }
lbl367:
            // 2 sources

            case 55: {
                var18_12 /* !! */  = (int)lk.ixuy("iygg", ixut(int ), (int)116);
                if (!var19_11) ** GOTO lbl338
                throw null;
            }
            case 56: {
                var18_12 /* !! */  = (int)lk.ixuy("iygh", ixut(int ), (int)117);
                if (!var19_11) ** GOTO lbl270
                throw null;
            }
            case 57: {
                var18_12 /* !! */  = (int)lk.ixuy("iygi", ixut(int ), (int)118);
                if (!var19_11) ** GOTO lbl145
                throw null;
            }
lbl379:
            // 2 sources

            case 58: {
                var18_12 /* !! */  = (int)lk.ixuy("iygj", ixut(int ), (int)119);
                if (!var19_11) ** GOTO lbl145
                throw null;
            }
            case 59: {
                var18_12 /* !! */  = (int)lk.ixuy("iygk", ixut(int ), (int)120);
                if (!var19_11) ** GOTO lbl279
                throw null;
            }
lbl387:
            // 2 sources

            case 60: {
                var18_12 /* !! */  = (int)lk.ixuy("iygl", ixut(int ), (int)121);
                if (!var19_11) ** GOTO lbl231
                throw null;
            }
lbl391:
            // 3 sources

            case 61: {
                var18_12 /* !! */  = (int)lk.ixuy("iygm", ixut(int ), (int)122);
                if (!var19_11) ** GOTO lbl379
                throw null;
            }
lbl395:
            // 2 sources

            case 62: {
                var18_12 /* !! */  = (int)lk.ixuy("iygn", ixut(int ), (int)123);
                if (!var19_11) ** GOTO lbl391
                throw null;
            }
            case 63: {
                var18_12 /* !! */  = (int)lk.ixuy("iygo", ixut(int ), (int)124);
                if (!var19_11) ** GOTO lbl217
                throw null;
            }
lbl403:
            // 2 sources

            case 64: {
                var18_12 /* !! */  = (int)lk.ixuy("iygp", ixut(int ), (int)125);
                if (!var19_11) ** GOTO lbl203
                throw null;
            }
lbl407:
            // 3 sources

            case 65: {
                var18_12 /* !! */  = (int)lk.ixuy("iygq", ixut(int ), (int)126);
                if (!var19_11) ** GOTO lbl253
                throw null;
            }
            case 66: {
                var18_12 /* !! */  = (int)lk.ixuy("iygr", ixut(int ), (int)127);
                if (!var19_11) ** GOTO lbl240
                throw null;
            }
lbl415:
            // 3 sources

            case 67: {
                var18_12 /* !! */  = (int)lk.ixuy("iygs", ixut(int ), (int)128);
                if (!var19_11) ** GOTO lbl355
                throw null;
            }
lbl419:
            // 3 sources

            case 68: {
                var18_12 /* !! */  = (int)lk.ixuy("iygt", ixut(int ), (int)129);
                if (!var19_11) ** GOTO lbl355
                throw null;
            }
            case 69: {
                var18_12 /* !! */  = (int)lk.ixuy("iygu", ixut(int ), (int)130);
                if (!var19_11) ** GOTO lbl325
                throw null;
            }
            case 70: {
                var18_12 /* !! */  = (int)lk.ixuy("iygv", ixut(int ), (int)131);
                if (!var19_11) ** GOTO lbl130
                throw null;
            }
            case 71: 
        }
        var18_12 /* !! */  = (int)lk.ixuy("iygw", ixut(int ), (int)132);
        ** while (!var19_11)
lbl434:
        // 1 sources

        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String lambda$init$0() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = qt - lk.ixuy("iyjo", ixvs(int ), (int)103)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == lk.ixuy("iyjp", ixut(int ), (int)171)) break;
            object = lk.ixuy("iyjq", ixut(int ), (int)172);
        }
        boolean bl3 = c;
        Object object = qt;
        block5: while (true) {
            switch ((int)object) {
                case 913871434: {
                    break block5;
                }
                case 1329690078: {
                    object = lk.ixuy("iyjs", ixvs(int ), (int)105) - lk.ixuy("iyjr", ixvs(int ), (int)104);
                    continue block5;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object2;
            if ((object2 = (l3 = qt - lk.ixuy("iyjt", ixvs(int ), (int)106)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object2 == lk.ixuy("iyju", ixut(int ), (int)173)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object2 = lk.ixuy("iyjv", ixut(int ), (int)174);
        }
        if (!bl2 && !bl2) return "Shadow2D Uniforms";
        return null;
    }

    private static /* synthetic */ void iyke() {
        lk.ixvu[0] = 1007417479837578177L;
        lk.ixvu[1] = -5531791981683237302L;
        lk.ixvu[2] = 5200510913526730288L;
        lk.ixvu[3] = 2862633723481410318L;
        lk.ixvu[4] = -3482439178165941376L;
        lk.ixvu[5] = 2055562941087951288L;
        lk.ixvu[6] = 5234859732734533169L;
        lk.ixvu[7] = -3942831196981722008L;
        lk.ixvu[8] = -6467331632129948466L;
        lk.ixvu[9] = -5303777309985492267L;
        lk.ixvu[10] = -4198774837223959175L;
        lk.ixvu[11] = 3769549045647974154L;
        lk.ixvu[12] = -3727653143892256281L;
        lk.ixvu[13] = 840873540198382829L;
        lk.ixvu[14] = 1772958679375941001L;
        lk.ixvu[15] = -5149566354305302768L;
        lk.ixvu[16] = -4426752542726991813L;
        lk.ixvu[17] = -7192071527540322510L;
        lk.ixvu[18] = 5190262303544429200L;
        lk.ixvu[19] = -8433877249424603530L;
        lk.ixvu[20] = -8354431666919830587L;
        lk.ixvu[21] = -1746370062154490598L;
        lk.ixvu[22] = 4007797416356367239L;
        lk.ixvu[23] = -2258580471086767917L;
        lk.ixvu[24] = -5233358426003340068L;
        lk.ixvu[25] = 4997574919957213350L;
        lk.ixvu[26] = 6392490143475307798L;
        lk.ixvu[27] = 2649052585608046786L;
        lk.ixvu[28] = -1980892589066575445L;
        lk.ixvu[29] = -121747138555209206L;
        lk.ixvu[30] = 1765274944896119871L;
        lk.ixvu[31] = 3084628955945614044L;
        lk.ixvu[32] = -6505251643648440376L;
        lk.ixvu[33] = 7051180357609097103L;
        lk.ixvu[34] = -5810830434123988073L;
        lk.ixvu[35] = 8035654134449677022L;
        lk.ixvu[36] = 8099478393838702622L;
        lk.ixvu[37] = 6817262204077577511L;
        lk.ixvu[38] = -5437167789268701977L;
        lk.ixvu[39] = 4110032912517628483L;
        lk.ixvu[40] = 290360835077194690L;
        lk.ixvu[41] = -8516585115284720548L;
        lk.ixvu[42] = 3912716022616391938L;
        lk.ixvu[43] = -5229765805014620584L;
        lk.ixvu[44] = 8849536683813415451L;
        lk.ixvu[45] = 7888381537791929925L;
        lk.ixvu[46] = 3321602678473868764L;
        lk.ixvu[47] = 1750247610527685085L;
        lk.ixvu[48] = 2975016144922446213L;
        lk.ixvu[49] = -5110690417673503442L;
        lk.ixvu[50] = -9028297513855840188L;
        lk.ixvu[51] = -2987734603050025023L;
        lk.ixvu[52] = 1094134053209123473L;
        lk.ixvu[53] = 710599906226064987L;
        lk.ixvu[54] = -8742784636499080617L;
        lk.ixvu[55] = 2822445938711087881L;
        lk.ixvu[56] = -519913746887446940L;
        lk.ixvu[57] = 5218777456744688246L;
        lk.ixvu[58] = -7329174864560582436L;
        lk.ixvu[59] = -7995610594865621730L;
        lk.ixvu[60] = 6619227882583575139L;
        lk.ixvu[61] = -1336468859298019100L;
        lk.ixvu[62] = 7873349882665683677L;
        lk.ixvu[63] = 8105806311150486820L;
        lk.ixvu[64] = 4539214736525468447L;
        lk.ixvu[65] = -2113139810875459102L;
        lk.ixvu[66] = -546442328910804629L;
        lk.ixvu[67] = -1712741726948948878L;
        lk.ixvu[68] = 497321569210752576L;
        lk.ixvu[69] = 3814933430659082748L;
        lk.ixvu[70] = -3089211331295678558L;
        lk.ixvu[71] = -6969105851028063320L;
        lk.ixvu[72] = -1424848712080375577L;
        lk.ixvu[73] = 237074895014937409L;
        lk.ixvu[74] = -7825503660119535157L;
        lk.ixvu[75] = -3811406184143139790L;
        lk.ixvu[76] = -4215926489296867403L;
        lk.ixvu[77] = -3720698708025576394L;
        lk.ixvu[78] = -7495674830661956106L;
        lk.ixvu[79] = 4610739274638943259L;
        lk.ixvu[80] = 4264055096798388437L;
        lk.ixvu[81] = 5764079461198000980L;
        lk.ixvu[82] = 8066607028207333723L;
        lk.ixvu[83] = -4783582341055886976L;
        lk.ixvu[84] = 8542648579381540559L;
        lk.ixvu[85] = 1526946709607358377L;
        lk.ixvu[86] = 2622727376014391494L;
        lk.ixvu[87] = -5091035362072810056L;
        lk.ixvu[88] = -2163456541497928519L;
        lk.ixvu[89] = 6964677361868979865L;
        lk.ixvu[90] = -5248607883890131676L;
        lk.ixvu[91] = 5894295383497503151L;
        lk.ixvu[92] = 4088170233116435472L;
        lk.ixvu[93] = -3997228389692726230L;
        lk.ixvu[94] = -2194986769891527913L;
        lk.ixvu[95] = 7658815027718615912L;
        lk.ixvu[96] = -7996120106431266729L;
        lk.ixvu[97] = 8854219921626990027L;
        lk.ixvu[98] = -2793605922037206916L;
        lk.ixvu[99] = -2435205227426136194L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void shutdown() {
        block89: {
            block88: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = lk.qt - lk.ixuy("iygx", ixvs(int ), (int)72)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == lk.ixuy("iygy", ixut(int ), (int)133)) break;
                    v0 /* !! */  = (long)lk.ixuy("iygz", ixut(int ), (int)134);
                }
                var2 = lk.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_1 = lk.qt - lk.ixuy("iyha", ixvs(int ), (int)73)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  == lk.ixuy("iyhb", ixut(int ), (int)135)) break;
                    v1 /* !! */  = (long)lk.ixuy("iyhc", ixut(int ), (int)136);
                }
                var1_1 /* !! */  = lk.b;
                v2 /* !! */  = lk.qt;
                if (true) ** GOTO lbl17
                block59: while (true) {
                    v2 /* !! */  = (long)(v3 - lk.ixuy("iyhd", ixvs(int ), (int)74));
lbl17:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1734762592: {
                            v3 = lk.ixuy("iyhe", ixvs(int ), (int)75);
                            continue block59;
                        }
                        case -290667175: {
                            v3 = lk.ixuy("iyhf", ixvs(int ), (int)76);
                            continue block59;
                        }
                        case 913871434: {
                            break block59;
                        }
                    }
                    break;
                }
                var0_2 = lk.a;
                if (var2) {
                    throw null;
lbl29:
                    // 11 sources

                    return;
                }
                if (var0_2 || var0_2) ** GOTO lbl29
                v4 /* !! */  = lk.qt;
                if (true) ** GOTO lbl36
                block61: while (true) {
                    v4 /* !! */  = (long)(lk.ixuy("iyhh", ixvs(int ), (int)78) - lk.ixuy("iyhg", ixvs(int ), (int)77));
lbl36:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -704383067: {
                            continue block61;
                        }
                        case 913871434: {
                            break block61;
                        }
                    }
                    break;
                }
                if (lk.uniformBuffer == null) break block88;
                if (var0_2 || var0_2) ** GOTO lbl29
                v5 /* !! */  = lk.qt;
                if (true) ** GOTO lbl47
                block62: while (true) {
                    v5 /* !! */  = (long)(v6 - lk.ixuy("iyhi", ixvs(int ), (int)79));
lbl47:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -889359567: {
                            v6 = lk.ixuy("iyhj", ixvs(int ), (int)80);
                            continue block62;
                        }
                        case -747749212: {
                            v6 = lk.ixuy("iyhk", ixvs(int ), (int)81);
                            continue block62;
                        }
                        case 913871434: {
                            break block62;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = lk.qt - lk.ixuy("iyhl", ixvs(int ), (int)82)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == lk.ixuy("iyhm", ixut(int ), (int)137)) break;
                    v7 /* !! */  = (long)lk.ixuy("iyhn", ixut(int ), (int)138);
                }
                lk.uniformBuffer.close();
                if (var0_2 || var0_2) ** GOTO lbl29
                v8 /* !! */  = lk.qt;
                if (true) ** GOTO lbl67
                block64: while (true) {
                    v8 /* !! */  = (long)(lk.ixuy("iyhp", ixvs(int ), (int)84) - lk.ixuy("iyho", ixvs(int ), (int)83));
lbl67:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -69587805: {
                            continue block64;
                        }
                        case 913871434: {
                            break block64;
                        }
                    }
                    break;
                }
                lk.uniformBuffer = null;
                if (var0_2) ** GOTO lbl29
            }
            if (var0_2 || var0_2) ** GOTO lbl29
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_3 = lk.qt - lk.ixuy("iyhq", ixvs(int ), (int)85)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == lk.ixuy("iyhr", ixut(int ), (int)139)) break;
                v9 /* !! */  = (long)lk.ixuy("iyhs", ixut(int ), (int)140);
            }
            if (lk.uniformData == null) break block89;
            if (var0_2 || var0_2) ** GOTO lbl29
            v10 /* !! */  = lk.qt;
            if (true) ** GOTO lbl87
            block66: while (true) {
                v10 /* !! */  = (long)(v11 - lk.ixuy("iyht", ixvs(int ), (int)86));
lbl87:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -429491937: {
                        v11 = lk.ixuy("iyhu", ixvs(int ), (int)87);
                        continue block66;
                    }
                    case 913871434: {
                        break block66;
                    }
                    case 1171419964: {
                        v11 = lk.ixuy("iyhv", ixvs(int ), (int)88);
                        continue block66;
                    }
                    case 1743144527: {
                        v11 = lk.ixuy("iyhw", ixvs(int ), (int)89);
                        continue block66;
                    }
                }
                break;
            }
            v12 /* !! */  = lk.qt;
            if (true) ** GOTO lbl103
            block67: while (true) {
                v12 /* !! */  = (long)(v13 - lk.ixuy("iyhx", ixvs(int ), (int)90));
lbl103:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case -442317263: {
                        v13 = lk.ixuy("iyhy", ixvs(int ), (int)91);
                        continue block67;
                    }
                    case 913871434: {
                        break block67;
                    }
                    case 1398753686: {
                        v13 = lk.ixuy("iyhz", ixvs(int ), (int)92);
                        continue block67;
                    }
                    case 1952331848: {
                        v13 = lk.ixuy("iyia", ixvs(int ), (int)93);
                        continue block67;
                    }
                }
                break;
            }
            MemoryUtil.memFree((Buffer)lk.uniformData);
            if (var0_2 || var0_2) ** GOTO lbl29
            v14 /* !! */  = lk.qt;
            if (true) ** GOTO lbl121
            block68: while (true) {
                v14 /* !! */  = (long)(v15 - lk.ixuy("iyib", ixvs(int ), (int)94));
lbl121:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case -2087379365: {
                        v15 = lk.ixuy("iyic", ixvs(int ), (int)95);
                        continue block68;
                    }
                    case -246024322: {
                        v15 = lk.ixuy("iyid", ixvs(int ), (int)96);
                        continue block68;
                    }
                    case 913871434: {
                        break block68;
                    }
                }
                break;
            }
            lk.uniformData = null;
            if (var0_2) ** GOTO lbl29
        }
        if (var0_2 || var0_2) ** GOTO lbl29
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_4 = lk.qt - lk.ixuy("iyie", ixvs(int ), (int)97)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v16 /* !! */  == lk.ixuy("iyif", ixut(int ), (int)141)) break;
            v16 /* !! */  = (long)lk.ixuy("iyig", ixut(int ), (int)142);
        }
        lk.pipeline = null;
        if (var0_2) ** GOTO lbl29
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var0_2) ** break;
                ** continue;
                return;
            }
            case 0: {
                var1_1 /* !! */  = (int)lk.ixuy("iyih", ixut(int ), (int)143);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl165
            }
lbl152:
            // 2 sources

            case 1: {
                var1_1 /* !! */  = (int)lk.ixuy("iyii", ixut(int ), (int)144);
                if (var2) {
                    throw null;
                }
            }
lbl156:
            // 4 sources

            case 2: {
                do {
                    var1_1 /* !! */  = (int)lk.ixuy("iyij", ixut(int ), (int)145);
                } while (!var2);
                throw null;
            }
            case 3: {
                var1_1 /* !! */  = (int)lk.ixuy("iyik", ixut(int ), (int)146);
                if (!var2) ** GOTO lbl156
                throw null;
            }
lbl165:
            // 3 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)lk.ixuy("iyil", ixut(int ), (int)147);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl184
                    break;
                }
            }
            case 5: {
                var1_1 /* !! */  = (int)lk.ixuy("iyim", ixut(int ), (int)148);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl184
            }
lbl176:
            // 3 sources

            case 6: {
                var1_1 /* !! */  = (int)lk.ixuy("iyin", ixut(int ), (int)149);
                if (!var2) break;
                throw null;
            }
lbl180:
            // 2 sources

            case 7: {
                var1_1 /* !! */  = (int)lk.ixuy("iyio", ixut(int ), (int)150);
                if (!var2) ** GOTO lbl176
                throw null;
            }
lbl184:
            // 5 sources

            case 8: {
                var1_1 /* !! */  = (int)lk.ixuy("iyip", ixut(int ), (int)151);
                if (var2) {
                    throw null;
                }
            }
lbl188:
            // 4 sources

            case 9: {
                var1_1 /* !! */  = (int)lk.ixuy("iyiq", ixut(int ), (int)152);
                if (!var2) ** GOTO lbl152
                throw null;
            }
            case 10: {
                var1_1 /* !! */  = (int)lk.ixuy("iyir", ixut(int ), (int)153);
                if (!var2) ** GOTO lbl184
                throw null;
            }
            case 11: {
                var1_1 /* !! */  = (int)lk.ixuy("iyis", ixut(int ), (int)154);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl217
            }
            case 12: {
                var1_1 /* !! */  = (int)lk.ixuy("iyit", ixut(int ), (int)155);
                if (var2) {
                    throw null;
                }
            }
lbl205:
            // 4 sources

            case 13: {
                var1_1 /* !! */  = (int)lk.ixuy("iyiu", ixut(int ), (int)156);
                if (!var2) ** GOTO lbl184
                throw null;
            }
            case 14: {
                var1_1 /* !! */  = (int)lk.ixuy("iyiv", ixut(int ), (int)157);
                if (!var2) ** GOTO lbl180
                throw null;
            }
            case 15: {
                var1_1 /* !! */  = (int)lk.ixuy("iyiw", ixut(int ), (int)158);
                if (!var2) ** GOTO lbl165
                throw null;
            }
lbl217:
            // 2 sources

            case 16: {
                var1_1 /* !! */  = (int)lk.ixuy("iyix", ixut(int ), (int)159);
                if (!var2) ** GOTO lbl176
                throw null;
            }
            case 17: {
                var1_1 /* !! */  = (int)lk.ixuy("iyiy", ixut(int ), (int)160);
                if (!var2) ** GOTO lbl188
                throw null;
            }
            case 18: {
                var1_1 /* !! */  = (int)lk.ixuy("iyiz", ixut(int ), (int)161);
                if (!var2) ** GOTO lbl205
                throw null;
            }
            case 19: 
        }
        var1_1 /* !! */  = (int)lk.ixuy("iyja", ixut(int ), (int)162);
        ** while (!var2)
lbl232:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void iykf() {
        lk.ixvu[100] = 551371698477133583L;
        lk.ixvu[101] = 5524972734900258630L;
        lk.ixvu[102] = -8103749658246777612L;
        lk.ixvu[103] = -7305021483440256621L;
        lk.ixvu[104] = -7835682635991317442L;
        lk.ixvu[105] = 5034907975313661088L;
        lk.ixvu[106] = -3509274047979300870L;
    }

    private static /* synthetic */ void iykb() {
        lk.ixuw[100] = -635003603;
        lk.ixuw[101] = 871480863;
        lk.ixuw[102] = 2031943497;
        lk.ixuw[103] = 2026085533;
        lk.ixuw[104] = 120303588;
        lk.ixuw[105] = -2016864507;
        lk.ixuw[106] = 1832894814;
        lk.ixuw[107] = 165181918;
        lk.ixuw[108] = -885776235;
        lk.ixuw[109] = 2030946693;
        lk.ixuw[110] = 76046373;
        lk.ixuw[111] = 1917726116;
        lk.ixuw[112] = 1835592887;
        lk.ixuw[113] = -466671143;
        lk.ixuw[114] = 1520186217;
        lk.ixuw[115] = 1374483398;
        lk.ixuw[116] = -988183974;
        lk.ixuw[117] = -93932656;
        lk.ixuw[118] = -387060329;
        lk.ixuw[119] = 1051576559;
        lk.ixuw[120] = -609433147;
        lk.ixuw[121] = 987916800;
        lk.ixuw[122] = -1638240388;
        lk.ixuw[123] = -2109140099;
        lk.ixuw[124] = -1715631127;
        lk.ixuw[125] = 343564829;
        lk.ixuw[126] = -713278978;
        lk.ixuw[127] = 548680251;
        lk.ixuw[128] = 1196181708;
        lk.ixuw[129] = 1043150260;
        lk.ixuw[130] = -858184824;
        lk.ixuw[131] = -753746517;
        lk.ixuw[132] = -1391675765;
        lk.ixuw[133] = -362386045;
        lk.ixuw[134] = -707620651;
        lk.ixuw[135] = -2010187128;
        lk.ixuw[136] = 498892863;
        lk.ixuw[137] = 885038762;
        lk.ixuw[138] = 1942678341;
        lk.ixuw[139] = -217556525;
        lk.ixuw[140] = -1459387946;
        lk.ixuw[141] = -884930312;
        lk.ixuw[142] = 271118704;
        lk.ixuw[143] = -160195097;
        lk.ixuw[144] = -443594843;
        lk.ixuw[145] = -1863775005;
        lk.ixuw[146] = -1937612967;
        lk.ixuw[147] = 2130858911;
        lk.ixuw[148] = -628161635;
        lk.ixuw[149] = -367681093;
        lk.ixuw[150] = -1065548323;
        lk.ixuw[151] = 1190838175;
        lk.ixuw[152] = 720909354;
        lk.ixuw[153] = 1791825239;
        lk.ixuw[154] = 1155724634;
        lk.ixuw[155] = -36160314;
        lk.ixuw[156] = 1902520051;
        lk.ixuw[157] = -1405287936;
        lk.ixuw[158] = 178332215;
        lk.ixuw[159] = 191644384;
        lk.ixuw[160] = 702770358;
        lk.ixuw[161] = -386232211;
        lk.ixuw[162] = -1820492899;
        lk.ixuw[163] = -883862926;
        lk.ixuw[164] = -838332339;
        lk.ixuw[165] = 1764175816;
        lk.ixuw[166] = 1897999420;
        lk.ixuw[167] = -527739672;
        lk.ixuw[168] = 1618964633;
        lk.ixuw[169] = 1032989348;
        lk.ixuw[170] = 1350156789;
        lk.ixuw[171] = 945814701;
        lk.ixuw[172] = -1384791131;
        lk.ixuw[173] = -434837687;
        lk.ixuw[174] = 1632491671;
        lk.ixuw[175] = -141609724;
        lk.ixuw[176] = 1008348618;
        lk.ixuw[177] = -1201695176;
        lk.ixuw[178] = 1640114094;
    }

    private static /* synthetic */ int ixut(int n2) {
        return ixuw[n2] ^ ixux[n2];
    }

    private static /* synthetic */ float iydr(int n2) {
        return Float.intBitsToFloat(ixuw[n2] ^ ixux[n2]);
    }

    private static /* synthetic */ void iykd() {
        lk.ixux[100] = -635003596;
        lk.ixux[101] = 871480891;
        lk.ixux[102] = 2031943540;
        lk.ixux[103] = 2026085535;
        lk.ixux[104] = 120303603;
        lk.ixux[105] = -2016864463;
        lk.ixux[106] = 1832894827;
        lk.ixux[107] = 165181901;
        lk.ixux[108] = -885776214;
        lk.ixux[109] = 2030946712;
        lk.ixux[110] = 76046345;
        lk.ixux[111] = 1917726081;
        lk.ixux[112] = 1835592846;
        lk.ixux[113] = -466671166;
        lk.ixux[114] = 1520186210;
        lk.ixux[115] = 1374483420;
        lk.ixux[116] = -988183940;
        lk.ixux[117] = -93932586;
        lk.ixux[118] = -387060303;
        lk.ixux[119] = 1051576522;
        lk.ixux[120] = -609433210;
        lk.ixux[121] = 987916807;
        lk.ixux[122] = -1638240389;
        lk.ixux[123] = -2109140142;
        lk.ixux[124] = -1715631187;
        lk.ixux[125] = 343564808;
        lk.ixux[126] = -713278988;
        lk.ixux[127] = 548680240;
        lk.ixux[128] = 1196181744;
        lk.ixux[129] = 1043150271;
        lk.ixux[130] = -858184798;
        lk.ixux[131] = -753746528;
        lk.ixux[132] = -1391675771;
        lk.ixux[133] = 362386044;
        lk.ixux[134] = -2005569946;
        lk.ixux[135] = -2010187127;
        lk.ixux[136] = -1717791986;
        lk.ixux[137] = -885038763;
        lk.ixux[138] = -28568509;
        lk.ixux[139] = 217556524;
        lk.ixux[140] = 783120817;
        lk.ixux[141] = -884930311;
        lk.ixux[142] = -1908922405;
        lk.ixux[143] = -160195090;
        lk.ixux[144] = -443594842;
        lk.ixux[145] = -1863775001;
        lk.ixux[146] = -1937612981;
        lk.ixux[147] = 2130858903;
        lk.ixux[148] = -628161634;
        lk.ixux[149] = -367681091;
        lk.ixux[150] = -1065548331;
        lk.ixux[151] = 1190838160;
        lk.ixux[152] = 720909356;
        lk.ixux[153] = 1791825223;
        lk.ixux[154] = 1155724626;
        lk.ixux[155] = -36160300;
        lk.ixux[156] = 1902520057;
        lk.ixux[157] = -1405287918;
        lk.ixux[158] = 178332221;
        lk.ixux[159] = 191644402;
        lk.ixux[160] = 702770363;
        lk.ixux[161] = -386232218;
        lk.ixux[162] = -1820492906;
        lk.ixux[163] = -883862925;
        lk.ixux[164] = -1150196471;
        lk.ixux[165] = 1764175817;
        lk.ixux[166] = 1697591119;
        lk.ixux[167] = -527739671;
        lk.ixux[168] = 1618964634;
        lk.ixux[169] = 1032989349;
        lk.ixux[170] = 1350156788;
        lk.ixux[171] = 945814700;
        lk.ixux[172] = -1654443146;
        lk.ixux[173] = -434837688;
        lk.ixux[174] = -547539117;
        lk.ixux[175] = -141609722;
        lk.ixux[176] = 1008348616;
        lk.ixux[177] = -1201695174;
        lk.ixux[178] = 1640114093;
    }

    private static /* synthetic */ void iyka() {
        lk.ixuw[0] = -1943465941;
        lk.ixuw[1] = 1642270080;
        lk.ixuw[2] = 290951272;
        lk.ixuw[3] = -212675205;
        lk.ixuw[4] = 1092265861;
        lk.ixuw[5] = -1179225267;
        lk.ixuw[6] = -544621089;
        lk.ixuw[7] = 553427639;
        lk.ixuw[8] = 2067086150;
        lk.ixuw[9] = -1195318675;
        lk.ixuw[10] = 63493943;
        lk.ixuw[11] = 2069088221;
        lk.ixuw[12] = 1707112166;
        lk.ixuw[13] = -529456527;
        lk.ixuw[14] = 738108503;
        lk.ixuw[15] = -1417634552;
        lk.ixuw[16] = -208125834;
        lk.ixuw[17] = -1314683024;
        lk.ixuw[18] = -1714007011;
        lk.ixuw[19] = -38929421;
        lk.ixuw[20] = -39544229;
        lk.ixuw[21] = 1052690481;
        lk.ixuw[22] = -192216360;
        lk.ixuw[23] = -712106309;
        lk.ixuw[24] = 253638210;
        lk.ixuw[25] = 1774771930;
        lk.ixuw[26] = -538401350;
        lk.ixuw[27] = -651587200;
        lk.ixuw[28] = -1831930676;
        lk.ixuw[29] = -983494434;
        lk.ixuw[30] = -1253541055;
        lk.ixuw[31] = 803090664;
        lk.ixuw[32] = 1723092485;
        lk.ixuw[33] = 477573873;
        lk.ixuw[34] = -143447264;
        lk.ixuw[35] = 1607038070;
        lk.ixuw[36] = 1417306787;
        lk.ixuw[37] = 32981415;
        lk.ixuw[38] = 581847969;
        lk.ixuw[39] = 2080800453;
        lk.ixuw[40] = -163518858;
        lk.ixuw[41] = 1077536665;
        lk.ixuw[42] = -522878635;
        lk.ixuw[43] = -1217379348;
        lk.ixuw[44] = -1897386799;
        lk.ixuw[45] = -1335514218;
        lk.ixuw[46] = 1803977966;
        lk.ixuw[47] = -1691086382;
        lk.ixuw[48] = -720465325;
        lk.ixuw[49] = -933223680;
        lk.ixuw[50] = -558144710;
        lk.ixuw[51] = 397475852;
        lk.ixuw[52] = -1123942858;
        lk.ixuw[53] = -484145665;
        lk.ixuw[54] = -526609414;
        lk.ixuw[55] = 1038228461;
        lk.ixuw[56] = -2133800888;
        lk.ixuw[57] = -684085360;
        lk.ixuw[58] = -1491991290;
        lk.ixuw[59] = 1904909795;
        lk.ixuw[60] = -1205356162;
        lk.ixuw[61] = 1792614521;
        lk.ixuw[62] = 1891144298;
        lk.ixuw[63] = -1229405494;
        lk.ixuw[64] = -1740423019;
        lk.ixuw[65] = 1907595307;
        lk.ixuw[66] = 2070506818;
        lk.ixuw[67] = -524215720;
        lk.ixuw[68] = -1542059198;
        lk.ixuw[69] = -444774332;
        lk.ixuw[70] = -197691321;
        lk.ixuw[71] = -1385472893;
        lk.ixuw[72] = -30961509;
        lk.ixuw[73] = -2047945362;
        lk.ixuw[74] = 736274086;
        lk.ixuw[75] = 838803494;
        lk.ixuw[76] = -992914606;
        lk.ixuw[77] = -422341852;
        lk.ixuw[78] = -951071757;
        lk.ixuw[79] = 688652019;
        lk.ixuw[80] = -22423662;
        lk.ixuw[81] = 1343797716;
        lk.ixuw[82] = -1231520318;
        lk.ixuw[83] = -1542062055;
        lk.ixuw[84] = 2086181043;
        lk.ixuw[85] = 2033285789;
        lk.ixuw[86] = -2046497541;
        lk.ixuw[87] = -1138926168;
        lk.ixuw[88] = 385776648;
        lk.ixuw[89] = -705742988;
        lk.ixuw[90] = -1930373948;
        lk.ixuw[91] = -1412041532;
        lk.ixuw[92] = -82670617;
        lk.ixuw[93] = 288113715;
        lk.ixuw[94] = 1527443174;
        lk.ixuw[95] = -1496057554;
        lk.ixuw[96] = 1732966065;
        lk.ixuw[97] = 345698164;
        lk.ixuw[98] = 1366327890;
        lk.ixuw[99] = 926464901;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$draw$1() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lk.qt - lk.ixuy("iyjb", ixvs(int ), (int)98)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == lk.ixuy("iyjc", ixut(int ), (int)163)) break;
            v0 /* !! */  = (long)lk.ixuy("iyjd", ixut(int ), (int)164);
        }
        var2 = lk.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = lk.qt - lk.ixuy("iyje", ixvs(int ), (int)99)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == lk.ixuy("iyjf", ixut(int ), (int)165)) break;
            v1 /* !! */  = (long)lk.ixuy("iyjg", ixut(int ), (int)166);
        }
        var1_1 /* !! */  = lk.b;
        v2 /* !! */  = lk.qt;
        if (true) ** GOTO lbl19
        block13: while (true) {
            v2 /* !! */  = (long)(v3 - lk.ixuy("iyjh", ixvs(int ), (int)100));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -155215229: {
                    v3 = lk.ixuy("iyji", ixvs(int ), (int)101);
                    continue block13;
                }
                case 913871434: {
                    break block13;
                }
                case 1649659907: {
                    v3 = lk.ixuy("iyjj", ixvs(int ), (int)102);
                    continue block13;
                }
            }
            break;
        }
        var0_2 = lk.a;
        if (!var2) ** GOTO lbl35
        throw null;
        {
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var1_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl35:
                // 1 sources

                if (var0_2 || var0_2) continue block14;
                return "Shadow2D";
                case 0: {
                    var1_1 /* !! */  = (int)lk.ixuy("iyjk", ixut(int ), (int)167);
                    if (!var2) break block14;
                    throw null;
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var1_1 /* !! */  = (int)lk.ixuy("iyjl", ixut(int ), (int)168);
                        if (!var2) break block14;
                        throw null;
                    }
                }
                case 2: {
                    do {
                        var1_1 /* !! */  = (int)lk.ixuy("iyjm", ixut(int ), (int)169);
                    } while (!var2);
                    throw null;
                }
                case 3: 
            }
        }
        var1_1 /* !! */  = (int)lk.ixuy("iyjn", ixut(int ), (int)170);
        ** while (!var2)
lbl54:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long ixvs(int n2) {
        return ixvu[n2] ^ ixvw[n2];
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private lk() {
        var2_1 /* !! */  = lk.b;
        super();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var2_1 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
                case 2: {
                    var2_1 /* !! */  = (int)lk.ixuy("ixvf", ixut(int ), (int)2);
                    ** GOTO lbl-1000
                }
                case 0: lbl-1000:
                // 2 sources

                {
                    var2_1 /* !! */  = (int)lk.ixuy("ixuz", ixut(int ), (int)0);
                }
                case 1: 
            }
            if (true) ** GOTO lbl18
            break;
        }
        while (true) {
            if (true) ** continue;
lbl18:
            // 2 sources

            var2_1 /* !! */  = (int)lk.ixuy("ixvb", ixut(int ), (int)1);
            cfr_temp_0 = 0;
        }
    }

    static {
        ixuw = new int[179];
        ixux = new int[179];
        lk.iyka();
        lk.iykb();
        lk.iykc();
        lk.iykd();
        ixvu = new long[107];
        ixvw = new long[107];
        lk.iyke();
        lk.iykf();
        lk.iykg();
        lk.iykh();
    }

    private static /* synthetic */ void iykc() {
        lk.ixux[0] = -1943465941;
        lk.ixux[1] = 1642270081;
        lk.ixux[2] = 290951273;
        lk.ixux[3] = -212675206;
        lk.ixux[4] = 1037167977;
        lk.ixux[5] = -1179225268;
        lk.ixux[6] = -805059365;
        lk.ixux[7] = 553427638;
        lk.ixux[8] = -1883545016;
        lk.ixux[9] = 1195318674;
        lk.ixux[10] = 571507499;
        lk.ixux[11] = 2069088220;
        lk.ixux[12] = -393857336;
        lk.ixux[13] = 529456526;
        lk.ixux[14] = -1912030237;
        lk.ixux[15] = 1417634551;
        lk.ixux[16] = -1194930643;
        lk.ixux[17] = -1314683023;
        lk.ixux[18] = -1417407409;
        lk.ixux[19] = -38929421;
        lk.ixux[20] = 39544228;
        lk.ixux[21] = -1217906056;
        lk.ixux[22] = -192216359;
        lk.ixux[23] = -963002091;
        lk.ixux[24] = 253638211;
        lk.ixux[25] = 502661454;
        lk.ixux[26] = -538401486;
        lk.ixux[27] = -651587199;
        lk.ixux[28] = 1223480333;
        lk.ixux[29] = -983494562;
        lk.ixux[30] = -1253541045;
        lk.ixux[31] = 803090680;
        lk.ixux[32] = 1723092482;
        lk.ixux[33] = 477573857;
        lk.ixux[34] = -143447262;
        lk.ixux[35] = 1607038075;
        lk.ixux[36] = 1417306795;
        lk.ixux[37] = 32981420;
        lk.ixux[38] = 581847977;
        lk.ixux[39] = 2080800448;
        lk.ixux[40] = -163518855;
        lk.ixux[41] = 1077536670;
        lk.ixux[42] = -522878640;
        lk.ixux[43] = -1217379360;
        lk.ixux[44] = -1897386799;
        lk.ixux[45] = -1335514224;
        lk.ixux[46] = 1803977957;
        lk.ixux[47] = -1691086446;
        lk.ixux[48] = -720465341;
        lk.ixux[49] = -933223425;
        lk.ixux[50] = -1648073926;
        lk.ixux[51] = 397475844;
        lk.ixux[52] = -1123942711;
        lk.ixux[53] = -1604614657;
        lk.ixux[54] = -526609659;
        lk.ixux[55] = 2124225517;
        lk.ixux[56] = -2133800880;
        lk.ixux[57] = -684085393;
        lk.ixux[58] = -462617338;
        lk.ixux[59] = 1904909795;
        lk.ixux[60] = -1205356168;
        lk.ixux[61] = 1792614509;
        lk.ixux[62] = 1891144303;
        lk.ixux[63] = -1229405463;
        lk.ixux[64] = -1740423016;
        lk.ixux[65] = 1907595276;
        lk.ixux[66] = 2070506879;
        lk.ixux[67] = -524215732;
        lk.ixux[68] = -1542059260;
        lk.ixux[69] = -444774332;
        lk.ixux[70] = -197691281;
        lk.ixux[71] = -1385472850;
        lk.ixux[72] = -30961519;
        lk.ixux[73] = -2047945431;
        lk.ixux[74] = 736274066;
        lk.ixux[75] = 838803554;
        lk.ixux[76] = -992914599;
        lk.ixux[77] = -422341792;
        lk.ixux[78] = -951071817;
        lk.ixux[79] = 688652027;
        lk.ixux[80] = -22423621;
        lk.ixux[81] = 1343797710;
        lk.ixux[82] = -1231520303;
        lk.ixux[83] = -1542062049;
        lk.ixux[84] = 2086181029;
        lk.ixux[85] = 2033285777;
        lk.ixux[86] = -2046497575;
        lk.ixux[87] = -1138926176;
        lk.ixux[88] = 385776660;
        lk.ixux[89] = -705743053;
        lk.ixux[90] = -1930373901;
        lk.ixux[91] = -1412041524;
        lk.ixux[92] = -82670628;
        lk.ixux[93] = 288113692;
        lk.ixux[94] = 1527443151;
        lk.ixux[95] = -1496057596;
        lk.ixux[96] = 1732966052;
        lk.ixux[97] = 345698121;
        lk.ixux[98] = 1366327890;
        lk.ixux[99] = 926464907;
    }
}

