/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Snippet
 *  com.mojang.blaze3d.platform.DepthTestFunction
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  net.minecraft.class_10789
 *  net.minecraft.class_290
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  org.lwjgl.system.MemoryUtil
 */
package ruhack.phobia;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.VertexFormat;
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
import net.minecraft.class_10789;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import org.lwjgl.system.MemoryUtil;

public final class ld {
    private static RenderPipeline pipeline;
    public static final int b;
    private static GpuBuffer uniformBuffer;
    public static final long qe = -7055653149171140488L;
    private static final long START_NANOS;
    public static final boolean a;
    private static long[] isdh;
    private static long[] isdg;
    private static GpuBuffer dummyVertexBuffer;
    private static int[] ipxg;
    private static int[] ipxh;
    private static final int UNIFORM_SIZE = 32;
    public static final boolean c;
    private static ByteBuffer uniformData;

    private static /* synthetic */ void istq() {
        ld.ipxh[0] = -2026956453;
        ld.ipxh[1] = -1020647400;
        ld.ipxh[2] = -606121400;
        ld.ipxh[3] = -269553578;
        ld.ipxh[4] = -1324866594;
        ld.ipxh[5] = 1548176141;
        ld.ipxh[6] = 1008198986;
        ld.ipxh[7] = -1838588188;
        ld.ipxh[8] = -1718003541;
        ld.ipxh[9] = -1961956181;
        ld.ipxh[10] = -1001916707;
        ld.ipxh[11] = 1038560594;
        ld.ipxh[12] = -947577168;
        ld.ipxh[13] = -1112391722;
        ld.ipxh[14] = 1598847622;
        ld.ipxh[15] = -253185633;
        ld.ipxh[16] = -2041185620;
        ld.ipxh[17] = -1270745625;
        ld.ipxh[18] = -2070355988;
        ld.ipxh[19] = -1184787163;
        ld.ipxh[20] = 1797312806;
        ld.ipxh[21] = 636849036;
        ld.ipxh[22] = 1087875059;
        ld.ipxh[23] = 1836598814;
        ld.ipxh[24] = 464835488;
        ld.ipxh[25] = 1671430123;
        ld.ipxh[26] = 1263974152;
        ld.ipxh[27] = -636715671;
        ld.ipxh[28] = 1119915276;
        ld.ipxh[29] = -1483318771;
        ld.ipxh[30] = -684328770;
        ld.ipxh[31] = -554050418;
        ld.ipxh[32] = -1781087873;
        ld.ipxh[33] = 1487839354;
        ld.ipxh[34] = -1348196198;
        ld.ipxh[35] = 215476223;
        ld.ipxh[36] = 699733284;
        ld.ipxh[37] = -414963937;
        ld.ipxh[38] = -1226910678;
        ld.ipxh[39] = -62332512;
        ld.ipxh[40] = 1624878706;
        ld.ipxh[41] = 1922586488;
        ld.ipxh[42] = -43521444;
        ld.ipxh[43] = 1207781257;
        ld.ipxh[44] = 1469335457;
        ld.ipxh[45] = -793422102;
        ld.ipxh[46] = -617321460;
        ld.ipxh[47] = 1487534858;
        ld.ipxh[48] = 1385325401;
        ld.ipxh[49] = 1164586864;
        ld.ipxh[50] = 347935198;
        ld.ipxh[51] = -645180433;
        ld.ipxh[52] = -659711828;
        ld.ipxh[53] = 1951293050;
        ld.ipxh[54] = -1961690291;
        ld.ipxh[55] = 82813956;
        ld.ipxh[56] = 1908288070;
        ld.ipxh[57] = 1345646097;
        ld.ipxh[58] = -39339260;
        ld.ipxh[59] = 384298715;
        ld.ipxh[60] = -1583129373;
        ld.ipxh[61] = -967476162;
        ld.ipxh[62] = 1335448684;
        ld.ipxh[63] = 820369868;
        ld.ipxh[64] = 1943421184;
        ld.ipxh[65] = 385078444;
        ld.ipxh[66] = -1236795771;
        ld.ipxh[67] = 804919357;
        ld.ipxh[68] = -1879907371;
        ld.ipxh[69] = -1900740468;
        ld.ipxh[70] = 1829027833;
        ld.ipxh[71] = 1222039586;
        ld.ipxh[72] = 1441733505;
        ld.ipxh[73] = 492499128;
        ld.ipxh[74] = -1895483282;
        ld.ipxh[75] = 1290662599;
        ld.ipxh[76] = 1484087943;
        ld.ipxh[77] = -158456293;
        ld.ipxh[78] = -1363530981;
        ld.ipxh[79] = -954303865;
        ld.ipxh[80] = -1596545525;
        ld.ipxh[81] = -1467201808;
        ld.ipxh[82] = 2115126940;
        ld.ipxh[83] = 634156362;
        ld.ipxh[84] = 1285794855;
        ld.ipxh[85] = -1643678554;
        ld.ipxh[86] = 631122636;
        ld.ipxh[87] = -1213083243;
        ld.ipxh[88] = -1299084794;
        ld.ipxh[89] = -1296910607;
        ld.ipxh[90] = 2141905270;
        ld.ipxh[91] = 610689032;
        ld.ipxh[92] = -828960953;
        ld.ipxh[93] = -1741515199;
        ld.ipxh[94] = 1309676526;
        ld.ipxh[95] = -524078721;
        ld.ipxh[96] = -335132112;
        ld.ipxh[97] = 624547751;
        ld.ipxh[98] = 478524049;
        ld.ipxh[99] = -943608004;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void render() {
        block140: {
            block139: {
                block138: {
                    var8 = ld.c;
                    var7_1 /* !! */  = ld.b;
                    var6_2 = ld.a;
                    if (var8) {
                        throw null;
lbl6:
                        // 40 sources

                        return;
                    }
                    if (var6_2 || var6_2) ** GOTO lbl6
                    var0_3 = class_310.method_1551();
                    if (var6_2 || var6_2) ** GOTO lbl6
                    var1_4 = var0_3.method_1522();
                    if (var6_2 || var6_2) ** GOTO lbl6
                    if (var1_4 == null) break block138;
                    if (var6_2) ** GOTO lbl6
                    if (var1_4.field_1482 <= 0) break block138;
                    if (var6_2) ** GOTO lbl6
                    if (var1_4.field_1481 > 0) break block139;
                    if (var6_2) ** GOTO lbl6
                }
                if (var6_2 || var6_2) ** GOTO lbl6
                return;
            }
            if (var6_2 || var6_2) ** GOTO lbl6
            if (ld.pipeline != null) break block140;
            if (var6_2 || var6_2) ** GOTO lbl6
            ld.init();
            if (var6_2) ** GOTO lbl6
        }
        if (var6_2 || var6_2) ** GOTO lbl6
        ld.uniformData.clear();
        if (var6_2 || var6_2) ** GOTO lbl6
        ld.uniformData.putFloat(var1_4.field_1482);
        if (var6_2 || var6_2) ** GOTO lbl6
        ld.uniformData.putFloat(var1_4.field_1481);
        if (var6_2 || var6_2) ** GOTO lbl6
        ld.uniformData.putFloat((float)ld.ipxi("irwd", ipxm(int ), (int)3));
        if (var6_2 || var6_2) ** GOTO lbl6
        ld.uniformData.putFloat((float)var1_4.field_1482 / (float)var1_4.field_1481);
        if (var6_2 || var6_2) ** GOTO lbl6
        ld.uniformData.putFloat((float)(System.nanoTime() - ld.START_NANOS) * ld.ipxi("irwh", ipxm(int ), (int)4));
        if (var6_2 || var6_2) ** GOTO lbl6
        ld.uniformData.putFloat(0.0f);
        if (var6_2 || var6_2) ** GOTO lbl6
        ld.uniformData.putFloat(0.0f);
        if (var6_2 || var6_2) ** GOTO lbl6
        ld.uniformData.putFloat(0.0f);
        if (var6_2 || var6_2) ** GOTO lbl6
        ld.uniformData.flip();
        if (var7_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_2 || var6_2) ** GOTO lbl6
                var2_5 = RenderSystem.getDevice().createCommandEncoder();
                if (var6_2 || var6_2) ** GOTO lbl6
                var2_5.clearColorTexture(var1_4.method_30277(), (int)ld.ipxi("irwo", ipxf(int ), (int)5));
                if (var6_2 || var6_2) ** GOTO lbl6
                var2_5.writeToBuffer(ld.uniformBuffer.slice(), ld.uniformData);
                if (var6_2 || var6_2) ** GOTO lbl6
                var3_6 = var2_5.createRenderPass((Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$render$0(), ()Ljava/lang/String;)(), var1_4.method_71639(), OptionalInt.empty());
                if (var6_2) ** GOTO lbl6
                try {
                    if (var6_2) ** GOTO lbl6
                    var3_6.setPipeline(ld.pipeline);
                    if (var6_2 || var6_2) ** GOTO lbl6
                    var3_6.setUniform("MenuData", ld.uniformBuffer);
                    if (var6_2 || var6_2) ** GOTO lbl6
                    var3_6.setVertexBuffer((int)ld.ipxi("irwu", ipxf(int ), (int)6), ld.dummyVertexBuffer);
                    if (var6_2 || var6_2) ** GOTO lbl6
                    var3_6.draw((int)ld.ipxi("irwx", ipxf(int ), (int)7), (int)ld.ipxi("irwy", ipxf(int ), (int)8));
                    if (var6_2 || var6_2) ** GOTO lbl6
                    if (var3_6 == null) ** GOTO lbl105
                    if (var6_2) ** GOTO lbl6
                }
                catch (Throwable var4_7) {
                    if (var6_2) ** GOTO lbl6
                    if (var3_6 == null) ** GOTO lbl98
                    if (var6_2) ** GOTO lbl6
                    try {
                        if (var6_2) ** GOTO lbl6
                        var3_6.close();
                        if (var6_2 || var6_2) ** GOTO lbl6
                        ** if (!var8) goto lbl-1000
                    }
                    catch (Throwable var5_8) {
                        if (var6_2) ** GOTO lbl6
                        var4_7.addSuppressed(var5_8);
                        if (var6_2) ** GOTO lbl6
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
lbl98:
                    // 3 sources

                    if (var6_2 || var6_2) ** GOTO lbl6
                    throw var4_7;
                }
                var3_6.close();
                if (var6_2) ** GOTO lbl6
                if (var8) {
                    throw null;
                }
lbl105:
                // 3 sources

                if (!var6_2 && !var6_2) ** break;
                ** continue;
                return;
            }
            case 0: {
                var7_1 /* !! */  = (int)ld.ipxi("irxf", ipxf(int ), (int)9);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl378
            }
            case 1: {
                var7_1 /* !! */  = (int)ld.ipxi("irxg", ipxf(int ), (int)10);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl390
            }
lbl118:
            // 2 sources

            case 2: {
                var7_1 /* !! */  = (int)ld.ipxi("irxj", ipxf(int ), (int)11);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl221
            }
            case 3: {
                var7_1 /* !! */  = (int)ld.ipxi("irxl", ipxf(int ), (int)12);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl258
            }
lbl128:
            // 2 sources

            case 4: {
                var7_1 /* !! */  = (int)ld.ipxi("irxn", ipxf(int ), (int)13);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl344
            }
lbl133:
            // 2 sources

            case 5: {
                var7_1 /* !! */  = (int)ld.ipxi("irxq", ipxf(int ), (int)14);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl287
            }
lbl138:
            // 2 sources

            case 6: {
                var7_1 /* !! */  = (int)ld.ipxi("irxs", ipxf(int ), (int)15);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl318
            }
lbl143:
            // 2 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_1 /* !! */  = (int)ld.ipxi("irxu", ipxf(int ), (int)16);
                    if (var8) {
                        throw null;
                    }
                    ** GOTO lbl236
                    break;
                }
            }
lbl149:
            // 2 sources

            case 8: {
                var7_1 /* !! */  = (int)ld.ipxi("irxw", ipxf(int ), (int)17);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl313
            }
            case 9: {
                var7_1 /* !! */  = (int)ld.ipxi("irxy", ipxf(int ), (int)18);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl410
            }
lbl159:
            // 2 sources

            case 10: {
                var7_1 /* !! */  = (int)ld.ipxi("iryb", ipxf(int ), (int)19);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl174
            }
            case 11: {
                var7_1 /* !! */  = (int)ld.ipxi("iryd", ipxf(int ), (int)20);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl169:
            // 2 sources

            case 12: {
                var7_1 /* !! */  = (int)ld.ipxi("iryf", ipxf(int ), (int)21);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl331
            }
lbl174:
            // 5 sources

            case 13: {
                var7_1 /* !! */  = (int)ld.ipxi("iryh", ipxf(int ), (int)22);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl390
            }
lbl179:
            // 3 sources

            case 14: {
                var7_1 /* !! */  = (int)ld.ipxi("iryj", ipxf(int ), (int)23);
                if (!var8) ** GOTO lbl138
                throw null;
            }
lbl183:
            // 2 sources

            case 15: {
                do {
                    var7_1 /* !! */  = (int)ld.ipxi("irym", ipxf(int ), (int)24);
                } while (!var8);
                throw null;
            }
lbl188:
            // 3 sources

            case 16: {
                var7_1 /* !! */  = (int)ld.ipxi("iryo", ipxf(int ), (int)25);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl370
            }
lbl193:
            // 3 sources

            case 17: {
                var7_1 /* !! */  = (int)ld.ipxi("iryp", ipxf(int ), (int)26);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl357
            }
            case 18: {
                var7_1 /* !! */  = (int)ld.ipxi("iryr", ipxf(int ), (int)27);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl304
            }
lbl203:
            // 3 sources

            case 19: {
                var7_1 /* !! */  = (int)ld.ipxi("iryu", ipxf(int ), (int)28);
                if (!var8) ** GOTO lbl193
                throw null;
            }
            case 20: {
                var7_1 /* !! */  = (int)ld.ipxi("iryv", ipxf(int ), (int)29);
                if (!var8) ** GOTO lbl179
                throw null;
            }
            case 21: {
                var7_1 /* !! */  = (int)ld.ipxi("iryx", ipxf(int ), (int)30);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl348
            }
            case 22: {
                var7_1 /* !! */  = (int)ld.ipxi("irza", ipxf(int ), (int)31);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl378
            }
lbl221:
            // 2 sources

            case 23: {
                var7_1 /* !! */  = (int)ld.ipxi("irzc", ipxf(int ), (int)32);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl382
            }
lbl226:
            // 2 sources

            case 24: {
                var7_1 /* !! */  = (int)ld.ipxi("irze", ipxf(int ), (int)33);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl267
            }
            case 25: {
                var7_1 /* !! */  = (int)ld.ipxi("irzg", ipxf(int ), (int)34);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl362
            }
lbl236:
            // 2 sources

            case 26: {
                var7_1 /* !! */  = (int)ld.ipxi("irzi", ipxf(int ), (int)35);
                if (!var8) ** GOTO lbl188
                throw null;
            }
            case 27: {
                var7_1 /* !! */  = (int)ld.ipxi("irzl", ipxf(int ), (int)36);
                if (!var8) ** GOTO lbl169
                throw null;
            }
            case 28: {
                var7_1 /* !! */  = (int)ld.ipxi("irzn", ipxf(int ), (int)37);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl386
            }
lbl249:
            // 4 sources

            case 29: {
                var7_1 /* !! */  = (int)ld.ipxi("irzp", ipxf(int ), (int)38);
                if (!var8) ** GOTO lbl203
                throw null;
            }
            case 30: {
                var7_1 /* !! */  = (int)ld.ipxi("irzr", ipxf(int ), (int)39);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl287
            }
lbl258:
            // 3 sources

            case 31: {
                var7_1 /* !! */  = (int)ld.ipxi("irzt", ipxf(int ), (int)40);
                if (!var8) break;
                throw null;
            }
            case 32: {
                var7_1 /* !! */  = (int)ld.ipxi("irzw", ipxf(int ), (int)41);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl339
            }
lbl267:
            // 5 sources

            case 33: {
                var7_1 /* !! */  = (int)ld.ipxi("irzy", ipxf(int ), (int)42);
                if (!var8) ** GOTO lbl159
                throw null;
            }
lbl271:
            // 2 sources

            case 34: {
                var7_1 /* !! */  = (int)ld.ipxi("isaa", ipxf(int ), (int)43);
                if (!var8) ** GOTO lbl179
                throw null;
            }
            case 35: {
                var7_1 /* !! */  = (int)ld.ipxi("isac", ipxf(int ), (int)44);
                if (!var8) ** GOTO lbl174
                throw null;
            }
            case 36: {
                var7_1 /* !! */  = (int)ld.ipxi("isaf", ipxf(int ), (int)45);
                if (!var8) ** GOTO lbl267
                throw null;
            }
            case 37: {
                var7_1 /* !! */  = (int)ld.ipxi("isah", ipxf(int ), (int)46);
                if (!var8) ** GOTO lbl174
                throw null;
            }
lbl287:
            // 3 sources

            case 38: {
                var7_1 /* !! */  = (int)ld.ipxi("isaj", ipxf(int ), (int)47);
                if (!var8) ** GOTO lbl193
                throw null;
            }
lbl291:
            // 2 sources

            case 39: {
                var7_1 /* !! */  = (int)ld.ipxi("isam", ipxf(int ), (int)48);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl339
            }
            case 40: {
                var7_1 /* !! */  = (int)ld.ipxi("isao", ipxf(int ), (int)49);
                if (!var8) ** GOTO lbl143
                throw null;
            }
            case 41: {
                var7_1 /* !! */  = (int)ld.ipxi("isaq", ipxf(int ), (int)50);
                if (!var8) ** GOTO lbl203
                throw null;
            }
lbl304:
            // 4 sources

            case 42: {
                var7_1 /* !! */  = (int)ld.ipxi("isas", ipxf(int ), (int)51);
                if (!var8) ** GOTO lbl249
                throw null;
            }
            case 43: {
                var7_1 /* !! */  = (int)ld.ipxi("isau", ipxf(int ), (int)52);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl357
            }
lbl313:
            // 2 sources

            case 44: {
                do {
                    var7_1 /* !! */  = (int)ld.ipxi("isax", ipxf(int ), (int)53);
                } while (!var8);
                throw null;
            }
lbl318:
            // 2 sources

            case 45: {
                var7_1 /* !! */  = (int)ld.ipxi("isba", ipxf(int ), (int)54);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl402
            }
            case 46: {
                var7_1 /* !! */  = (int)ld.ipxi("isbc", ipxf(int ), (int)55);
                if (!var8) ** GOTO lbl291
                throw null;
            }
            case 47: {
                var7_1 /* !! */  = (int)ld.ipxi("isbe", ipxf(int ), (int)56);
                if (!var8) ** GOTO lbl304
                throw null;
            }
lbl331:
            // 2 sources

            case 48: {
                var7_1 /* !! */  = (int)ld.ipxi("isbg", ipxf(int ), (int)57);
                if (!var8) ** GOTO lbl226
                throw null;
            }
            case 49: {
                var7_1 /* !! */  = (int)ld.ipxi("isbi", ipxf(int ), (int)58);
                if (!var8) ** GOTO lbl183
                throw null;
            }
lbl339:
            // 4 sources

            case 50: {
                var7_1 /* !! */  = (int)ld.ipxi("isbk", ipxf(int ), (int)59);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl374
            }
lbl344:
            // 2 sources

            case 51: {
                var7_1 /* !! */  = (int)ld.ipxi("isbm", ipxf(int ), (int)60);
                if (!var8) ** GOTO lbl188
                throw null;
            }
lbl348:
            // 2 sources

            case 52: {
                var7_1 /* !! */  = (int)ld.ipxi("isbo", ipxf(int ), (int)61);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl390
            }
            case 53: {
                var7_1 /* !! */  = (int)ld.ipxi("isbq", ipxf(int ), (int)62);
                if (!var8) ** GOTO lbl267
                throw null;
            }
lbl357:
            // 3 sources

            case 54: {
                var7_1 /* !! */  = (int)ld.ipxi("isbs", ipxf(int ), (int)63);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl370
            }
lbl362:
            // 2 sources

            case 55: {
                var7_1 /* !! */  = (int)ld.ipxi("isbv", ipxf(int ), (int)64);
                if (!var8) ** GOTO lbl128
                throw null;
            }
            case 56: {
                var7_1 /* !! */  = (int)ld.ipxi("isbx", ipxf(int ), (int)65);
                if (!var8) ** GOTO lbl271
                throw null;
            }
lbl370:
            // 5 sources

            case 57: {
                var7_1 /* !! */  = (int)ld.ipxi("isca", ipxf(int ), (int)66);
                if (!var8) ** GOTO lbl118
                throw null;
            }
lbl374:
            // 2 sources

            case 58: {
                var7_1 /* !! */  = (int)ld.ipxi("iscc", ipxf(int ), (int)67);
                if (!var8) ** GOTO lbl339
                throw null;
            }
lbl378:
            // 3 sources

            case 59: {
                var7_1 /* !! */  = (int)ld.ipxi("isce", ipxf(int ), (int)68);
                if (!var8) ** GOTO lbl370
                throw null;
            }
lbl382:
            // 2 sources

            case 60: {
                var7_1 /* !! */  = (int)ld.ipxi("isch", ipxf(int ), (int)69);
                if (!var8) ** GOTO lbl258
                throw null;
            }
lbl386:
            // 2 sources

            case 61: {
                var7_1 /* !! */  = (int)ld.ipxi("isci", ipxf(int ), (int)70);
                if (!var8) ** GOTO lbl249
                throw null;
            }
lbl390:
            // 4 sources

            case 62: {
                var7_1 /* !! */  = (int)ld.ipxi("iscj", ipxf(int ), (int)71);
                if (!var8) ** GOTO lbl267
                throw null;
            }
lbl394:
            // 2 sources

            case 63: {
                var7_1 /* !! */  = (int)ld.ipxi("iscl", ipxf(int ), (int)72);
                if (!var8) ** GOTO lbl304
                throw null;
            }
            case 64: {
                var7_1 /* !! */  = (int)ld.ipxi("iscn", ipxf(int ), (int)73);
                if (!var8) ** GOTO lbl149
                throw null;
            }
lbl402:
            // 2 sources

            case 65: {
                var7_1 /* !! */  = (int)ld.ipxi("isco", ipxf(int ), (int)74);
                if (!var8) ** GOTO lbl370
                throw null;
            }
            case 66: {
                var7_1 /* !! */  = (int)ld.ipxi("iscq", ipxf(int ), (int)75);
                if (!var8) ** GOTO lbl249
                throw null;
            }
lbl410:
            // 2 sources

            case 67: {
                var7_1 /* !! */  = (int)ld.ipxi("iscs", ipxf(int ), (int)76);
                if (!var8) ** GOTO lbl394
                throw null;
            }
            case 68: {
                var7_1 /* !! */  = (int)ld.ipxi("iscu", ipxf(int ), (int)77);
                if (!var8) ** GOTO lbl133
                throw null;
            }
            case 69: 
        }
        var7_1 /* !! */  = (int)ld.ipxi("iscw", ipxf(int ), (int)78);
        ** while (!var8)
lbl421:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long isdf(int n2) {
        return isdg[n2] ^ isdh[n2];
    }

    private static /* synthetic */ void isto() {
        ld.ipxg[100] = 1371176488;
        ld.ipxg[101] = -1143895768;
        ld.ipxg[102] = -421333461;
        ld.ipxg[103] = 881665691;
        ld.ipxg[104] = -1937504476;
        ld.ipxg[105] = -360043969;
        ld.ipxg[106] = 202712526;
        ld.ipxg[107] = 552708431;
        ld.ipxg[108] = -2016212745;
        ld.ipxg[109] = -1860062744;
        ld.ipxg[110] = 2053387449;
        ld.ipxg[111] = 60485387;
        ld.ipxg[112] = 1654099485;
        ld.ipxg[113] = -1502657936;
        ld.ipxg[114] = 839165723;
        ld.ipxg[115] = 2041281490;
        ld.ipxg[116] = -1991582482;
        ld.ipxg[117] = 1633854841;
        ld.ipxg[118] = -1901796153;
        ld.ipxg[119] = 1120362860;
        ld.ipxg[120] = 1463407225;
        ld.ipxg[121] = -210264988;
        ld.ipxg[122] = 816402800;
        ld.ipxg[123] = 1278775234;
        ld.ipxg[124] = -659197836;
        ld.ipxg[125] = 558558609;
        ld.ipxg[126] = -1981867402;
        ld.ipxg[127] = -693905589;
        ld.ipxg[128] = -305714883;
        ld.ipxg[129] = -297440742;
        ld.ipxg[130] = -712486005;
        ld.ipxg[131] = 1995630960;
        ld.ipxg[132] = 456722880;
        ld.ipxg[133] = 320611185;
        ld.ipxg[134] = 1928718778;
        ld.ipxg[135] = -602797734;
        ld.ipxg[136] = -1698939788;
        ld.ipxg[137] = -1347836368;
        ld.ipxg[138] = 186438418;
        ld.ipxg[139] = 1709297875;
        ld.ipxg[140] = -558470523;
        ld.ipxg[141] = -1826881863;
        ld.ipxg[142] = 27818009;
        ld.ipxg[143] = 1730893674;
        ld.ipxg[144] = -1871447252;
        ld.ipxg[145] = 98678017;
        ld.ipxg[146] = -1617913572;
        ld.ipxg[147] = -325819936;
        ld.ipxg[148] = -578083381;
        ld.ipxg[149] = -396388396;
        ld.ipxg[150] = -155721603;
        ld.ipxg[151] = -182065441;
        ld.ipxg[152] = 1933516333;
        ld.ipxg[153] = -1421424514;
        ld.ipxg[154] = 1761501929;
        ld.ipxg[155] = -1125668754;
        ld.ipxg[156] = -508565670;
        ld.ipxg[157] = -885812284;
        ld.ipxg[158] = 1032436552;
        ld.ipxg[159] = 895030598;
        ld.ipxg[160] = -461169730;
        ld.ipxg[161] = 875067854;
        ld.ipxg[162] = 1019485988;
        ld.ipxg[163] = 2113936151;
        ld.ipxg[164] = -53882950;
        ld.ipxg[165] = -1908361554;
        ld.ipxg[166] = 1066629072;
        ld.ipxg[167] = 661065572;
        ld.ipxg[168] = 2123454305;
        ld.ipxg[169] = 1848750133;
        ld.ipxg[170] = 482735804;
        ld.ipxg[171] = 830817683;
        ld.ipxg[172] = -877148243;
        ld.ipxg[173] = 446765252;
        ld.ipxg[174] = -1093991521;
        ld.ipxg[175] = -1426326655;
        ld.ipxg[176] = -1432117115;
        ld.ipxg[177] = -369849076;
        ld.ipxg[178] = -236105350;
        ld.ipxg[179] = 472326763;
        ld.ipxg[180] = 1219424719;
        ld.ipxg[181] = 1635673585;
        ld.ipxg[182] = 346511111;
        ld.ipxg[183] = -314617484;
        ld.ipxg[184] = -729240183;
        ld.ipxg[185] = -1067542800;
        ld.ipxg[186] = -644905793;
        ld.ipxg[187] = 1464654576;
        ld.ipxg[188] = -1423542101;
        ld.ipxg[189] = 1324281215;
        ld.ipxg[190] = 1326359750;
        ld.ipxg[191] = 609125878;
        ld.ipxg[192] = -300161598;
        ld.ipxg[193] = -1846588446;
        ld.ipxg[194] = 1794196224;
        ld.ipxg[195] = -555656549;
        ld.ipxg[196] = 861200825;
        ld.ipxg[197] = 1219241779;
        ld.ipxg[198] = -1008775929;
        ld.ipxg[199] = 174143599;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$render$0() {
        v0 /* !! */  = ld.qe;
        if (true) ** GOTO lbl5
        block12: while (true) {
            v0 /* !! */  = (long)(v1 - ld.ipxi("issz", isdf(int ), (int)116));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1890983085: {
                    v1 = ld.ipxi("ista", isdf(int ), (int)117);
                    continue block12;
                }
                case -550415691: {
                    v1 = ld.ipxi("istb", isdf(int ), (int)118);
                    continue block12;
                }
                case -515262344: {
                    break block12;
                }
                case -502967749: {
                    v1 = ld.ipxi("istc", isdf(int ), (int)119);
                    continue block12;
                }
            }
            break;
        }
        var2 = ld.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ld.qe - ld.ipxi("istd", isdf(int ), (int)120)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ld.ipxi("iste", ipxf(int ), (int)192)) break;
            v2 /* !! */  = (long)ld.ipxi("istf", ipxf(int ), (int)193);
        }
        var1_1 /* !! */  = ld.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ld.qe - ld.ipxi("istg", isdf(int ), (int)121)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ld.ipxi("isth", ipxf(int ), (int)194)) break;
            v3 /* !! */  = (long)ld.ipxi("isti", ipxf(int ), (int)195);
        }
        var0_2 = ld.a;
        if (var2) {
            throw null;
lbl34:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl37:
        // 1 sources

        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return "Phobia Main Menu Background";
            }
lbl41:
            // 2 sources

            case 0: {
                do {
                    var1_1 /* !! */  = (int)ld.ipxi("istj", ipxf(int ), (int)196);
                } while (!var2);
                throw null;
            }
            case 1: {
                var1_1 /* !! */  = (int)ld.ipxi("istk", ipxf(int ), (int)197);
                if (!var2) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)ld.ipxi("istl", ipxf(int ), (int)198);
                    if (!var2) ** GOTO lbl41
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)ld.ipxi("istm", ipxf(int ), (int)199);
        ** while (!var2)
lbl58:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void isug() {
        ld.isdh[0] = -920170510173768071L;
        ld.isdh[1] = -9084045983780987234L;
        ld.isdh[2] = 5315611438908419570L;
        ld.isdh[3] = 208626920510405064L;
        ld.isdh[4] = -4393034187973187769L;
        ld.isdh[5] = -2944370134822238846L;
        ld.isdh[6] = -7225507940396879209L;
        ld.isdh[7] = -1567327140999451897L;
        ld.isdh[8] = 695345142386573171L;
        ld.isdh[9] = -8930589312634901096L;
        ld.isdh[10] = -82498713884826976L;
        ld.isdh[11] = 8964514225331531776L;
        ld.isdh[12] = 3470948701546926461L;
        ld.isdh[13] = 4076596940816325130L;
        ld.isdh[14] = -3368487263885663950L;
        ld.isdh[15] = -7101324993647469676L;
        ld.isdh[16] = -762744467537827682L;
        ld.isdh[17] = -2689737244655014892L;
        ld.isdh[18] = -1025827769080533938L;
        ld.isdh[19] = -660194289117178309L;
        ld.isdh[20] = 4703055451071146898L;
        ld.isdh[21] = -8489128336057973060L;
        ld.isdh[22] = -8632253062343326697L;
        ld.isdh[23] = 4603245708067188759L;
        ld.isdh[24] = -1593404879483962896L;
        ld.isdh[25] = -3005605794290692911L;
        ld.isdh[26] = 8132593238343419053L;
        ld.isdh[27] = 837278295102648872L;
        ld.isdh[28] = -4427131075003018151L;
        ld.isdh[29] = -902553788805470895L;
        ld.isdh[30] = 1399990342797582336L;
        ld.isdh[31] = -7210518712015653304L;
        ld.isdh[32] = 1426928924270094267L;
        ld.isdh[33] = 1795466432649981445L;
        ld.isdh[34] = -2445739927915736074L;
        ld.isdh[35] = -6570469021617263368L;
        ld.isdh[36] = -8417201235504270314L;
        ld.isdh[37] = 5919464337155116421L;
        ld.isdh[38] = -2306307081105181167L;
        ld.isdh[39] = 5148706291141308619L;
        ld.isdh[40] = -4753951055634809431L;
        ld.isdh[41] = 2314682003357413795L;
        ld.isdh[42] = 541072580623769624L;
        ld.isdh[43] = -5788329384466824478L;
        ld.isdh[44] = -7465644576799360953L;
        ld.isdh[45] = 2806624767582760090L;
        ld.isdh[46] = -6812149749327269273L;
        ld.isdh[47] = -805859903681212548L;
        ld.isdh[48] = 1789502302904888995L;
        ld.isdh[49] = 4261174467641434830L;
        ld.isdh[50] = 3391613601110426838L;
        ld.isdh[51] = 8049280380083601032L;
        ld.isdh[52] = 5232674359773189259L;
        ld.isdh[53] = 6649623142660111500L;
        ld.isdh[54] = 8895461965313319534L;
        ld.isdh[55] = -7552845225153328215L;
        ld.isdh[56] = -4003076111664258488L;
        ld.isdh[57] = 742548617919156579L;
        ld.isdh[58] = 7607009204102681540L;
        ld.isdh[59] = -914398021624502349L;
        ld.isdh[60] = 9081147100267376394L;
        ld.isdh[61] = 8677338810338648477L;
        ld.isdh[62] = 3549116276777522217L;
        ld.isdh[63] = -2696284764727621600L;
        ld.isdh[64] = 5472502105123740889L;
        ld.isdh[65] = 7175000631257987919L;
        ld.isdh[66] = 8190397745275480297L;
        ld.isdh[67] = 1936826332699945291L;
        ld.isdh[68] = -291884290254394536L;
        ld.isdh[69] = -3469615622194264043L;
        ld.isdh[70] = 6844948499813243278L;
        ld.isdh[71] = 6897035899830892524L;
        ld.isdh[72] = 8922472589891803983L;
        ld.isdh[73] = -5564902713619155994L;
        ld.isdh[74] = 585756714652421298L;
        ld.isdh[75] = 5395984118744565179L;
        ld.isdh[76] = 7069724463574025437L;
        ld.isdh[77] = -2732421320609890881L;
        ld.isdh[78] = -946691920157897683L;
        ld.isdh[79] = 3928998886043603010L;
        ld.isdh[80] = -3083547485049506208L;
        ld.isdh[81] = 5449571658452102083L;
        ld.isdh[82] = 6722641512651246296L;
        ld.isdh[83] = 2786321041596654237L;
        ld.isdh[84] = -1687077992239812946L;
        ld.isdh[85] = -8439315613547728399L;
        ld.isdh[86] = -2194248126799840261L;
        ld.isdh[87] = -63173980755492440L;
        ld.isdh[88] = 3331864367498374010L;
        ld.isdh[89] = 4175083512781971641L;
        ld.isdh[90] = 5962918881282634860L;
        ld.isdh[91] = -7158123223326637657L;
        ld.isdh[92] = -1117457179526939827L;
        ld.isdh[93] = -2625757297822772771L;
        ld.isdh[94] = 8977004877566626854L;
        ld.isdh[95] = 7225046700240263929L;
        ld.isdh[96] = 6032152452342257940L;
        ld.isdh[97] = 8309559471783332221L;
        ld.isdh[98] = 3664203287487842482L;
        ld.isdh[99] = -3090715857541307878L;
    }

    private static /* synthetic */ float ipxm(int n2) {
        return Float.intBitsToFloat(ipxg[n2] ^ ipxh[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$init$1() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ld.qe - ld.ipxi("issm", isdf(int ), (int)111)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ld.ipxi("issn", ipxf(int ), (int)184)) break;
            v0 /* !! */  = (long)ld.ipxi("isso", ipxf(int ), (int)185);
        }
        var2 = ld.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ld.qe - ld.ipxi("issp", isdf(int ), (int)112)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ld.ipxi("issq", ipxf(int ), (int)186)) break;
            v1 /* !! */  = (long)ld.ipxi("issr", ipxf(int ), (int)187);
        }
        var1_1 /* !! */  = ld.b;
        v2 /* !! */  = ld.qe;
        if (true) ** GOTO lbl19
        block13: while (true) {
            v2 /* !! */  = (long)(v3 - ld.ipxi("isss", isdf(int ), (int)113));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1704360455: {
                    v3 = ld.ipxi("isst", isdf(int ), (int)114);
                    continue block13;
                }
                case -515262344: {
                    break block13;
                }
                case 0x3CA3A33A: {
                    v3 = ld.ipxi("issu", isdf(int ), (int)115);
                    continue block13;
                }
            }
            break;
        }
        var0_2 = ld.a;
        if (var2) {
            throw null;
lbl31:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl34:
        // 1 sources

        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return "Phobia Main Menu Uniforms";
            }
lbl38:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)ld.ipxi("issv", ipxf(int ), (int)188);
                if (!var2) break;
                throw null;
            }
            case 1: {
                var1_1 /* !! */  = (int)ld.ipxi("issw", ipxf(int ), (int)189);
                if (!var2) break;
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)ld.ipxi("issx", ipxf(int ), (int)190);
                if (!var2) ** GOTO lbl38
                throw null;
            }
            case 3: 
        }
        do {
            var1_1 /* !! */  = (int)ld.ipxi("issy", ipxf(int ), (int)191);
        } while (!var2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ld() {
        var2_1 /* !! */  = ld.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)ld.ipxi("ipxj", ipxf(int ), (int)0);
                    break block0;
                    break;
                }
            }
            case 1: {
                var2_1 /* !! */  = (int)ld.ipxi("ipxk", ipxf(int ), (int)1);
            }
            case 2: 
        }
        var2_1 /* !! */  = (int)ld.ipxi("ipxl", ipxf(int ), (int)2);
        ** while (true)
    }

    private static /* synthetic */ void istn() {
        ld.ipxg[0] = -2026956454;
        ld.ipxg[1] = -1020647400;
        ld.ipxg[2] = -606121400;
        ld.ipxg[3] = -804422033;
        ld.ipxg[4] = -2122230911;
        ld.ipxg[5] = -1555283965;
        ld.ipxg[6] = 1008198986;
        ld.ipxg[7] = -1838588188;
        ld.ipxg[8] = -1718003544;
        ld.ipxg[9] = -1961956177;
        ld.ipxg[10] = -1001916704;
        ld.ipxg[11] = 1038560592;
        ld.ipxg[12] = -947577100;
        ld.ipxg[13] = -1112391790;
        ld.ipxg[14] = 1598847627;
        ld.ipxg[15] = -253185623;
        ld.ipxg[16] = -2041185624;
        ld.ipxg[17] = -1270745629;
        ld.ipxg[18] = -2070356030;
        ld.ipxg[19] = -1184787143;
        ld.ipxg[20] = 1797312779;
        ld.ipxg[21] = 636849034;
        ld.ipxg[22] = 1087875023;
        ld.ipxg[23] = 1836598809;
        ld.ipxg[24] = 464835491;
        ld.ipxg[25] = 1671430104;
        ld.ipxg[26] = 1263974218;
        ld.ipxg[27] = -636715664;
        ld.ipxg[28] = 1119915282;
        ld.ipxg[29] = -1483318725;
        ld.ipxg[30] = -684328781;
        ld.ipxg[31] = -554050375;
        ld.ipxg[32] = -1781087930;
        ld.ipxg[33] = 1487839345;
        ld.ipxg[34] = -1348196169;
        ld.ipxg[35] = 215476185;
        ld.ipxg[36] = 699733308;
        ld.ipxg[37] = -414963877;
        ld.ipxg[38] = -1226910665;
        ld.ipxg[39] = -62332485;
        ld.ipxg[40] = 1624878674;
        ld.ipxg[41] = 1922586495;
        ld.ipxg[42] = -43521440;
        ld.ipxg[43] = 1207781307;
        ld.ipxg[44] = 1469335428;
        ld.ipxg[45] = -793422165;
        ld.ipxg[46] = -617321460;
        ld.ipxg[47] = 1487534851;
        ld.ipxg[48] = 1385325427;
        ld.ipxg[49] = 1164586838;
        ld.ipxg[50] = 347935224;
        ld.ipxg[51] = -645180459;
        ld.ipxg[52] = -659711830;
        ld.ipxg[53] = 1951293002;
        ld.ipxg[54] = -1961690254;
        ld.ipxg[55] = 82814000;
        ld.ipxg[56] = 1908288120;
        ld.ipxg[57] = 1345646110;
        ld.ipxg[58] = -39339254;
        ld.ipxg[59] = 384298696;
        ld.ipxg[60] = -1583129376;
        ld.ipxg[61] = -967476167;
        ld.ipxg[62] = 1335448640;
        ld.ipxg[63] = 820369800;
        ld.ipxg[64] = 1943421233;
        ld.ipxg[65] = 385078405;
        ld.ipxg[66] = -1236795716;
        ld.ipxg[67] = 804919358;
        ld.ipxg[68] = -1879907368;
        ld.ipxg[69] = -1900740465;
        ld.ipxg[70] = 1829027791;
        ld.ipxg[71] = 1222039613;
        ld.ipxg[72] = 1441733526;
        ld.ipxg[73] = 492499093;
        ld.ipxg[74] = -1895483299;
        ld.ipxg[75] = 1290662633;
        ld.ipxg[76] = 1484087980;
        ld.ipxg[77] = -158456225;
        ld.ipxg[78] = -1363530948;
        ld.ipxg[79] = 954303864;
        ld.ipxg[80] = -2016458102;
        ld.ipxg[81] = 1467201807;
        ld.ipxg[82] = -2077481899;
        ld.ipxg[83] = -634156363;
        ld.ipxg[84] = -1818067164;
        ld.ipxg[85] = -1643678553;
        ld.ipxg[86] = 1409785483;
        ld.ipxg[87] = 1213083242;
        ld.ipxg[88] = -1779240422;
        ld.ipxg[89] = 1296910606;
        ld.ipxg[90] = 707778252;
        ld.ipxg[91] = -610689033;
        ld.ipxg[92] = -805624496;
        ld.ipxg[93] = -1741515199;
        ld.ipxg[94] = -1309676527;
        ld.ipxg[95] = -1702491986;
        ld.ipxg[96] = -335132112;
        ld.ipxg[97] = -624547752;
        ld.ipxg[98] = -387884652;
        ld.ipxg[99] = 943608003;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void shutdown() {
        block116: {
            block115: {
                v0 /* !! */  = ld.qe;
                if (true) ** GOTO lbl5
                block75: while (true) {
                    v0 /* !! */  = (long)(v1 - ld.ipxi("ismp", isdf(int ), (int)67));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -515262344: {
                            break block75;
                        }
                        case -495535459: {
                            v1 = ld.ipxi("ismq", isdf(int ), (int)68);
                            continue block75;
                        }
                        case 638891711: {
                            v1 = ld.ipxi("ismr", isdf(int ), (int)69);
                            continue block75;
                        }
                    }
                    break;
                }
                var2 = ld.c;
                v2 /* !! */  = ld.qe;
                if (true) ** GOTO lbl19
                block76: while (true) {
                    v2 /* !! */  = (long)(v3 - ld.ipxi("isms", isdf(int ), (int)70));
lbl19:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -515262344: {
                            break block76;
                        }
                        case 633095907: {
                            v3 = ld.ipxi("ismt", isdf(int ), (int)71);
                            continue block76;
                        }
                        case 1294250184: {
                            v3 = ld.ipxi("ismv", isdf(int ), (int)72);
                            continue block76;
                        }
                        case 1527868354: {
                            v3 = ld.ipxi("ismw", isdf(int ), (int)73);
                            continue block76;
                        }
                    }
                    break;
                }
                var1_1 /* !! */  = ld.b;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = ld.qe - ld.ipxi("ismy", isdf(int ), (int)74)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ld.ipxi("ismz", ipxf(int ), (int)138)) break;
                    v4 /* !! */  = (long)ld.ipxi("isnb", ipxf(int ), (int)139);
                }
                var0_2 = ld.a;
                if (var2) {
                    throw null;
lbl40:
                    // 14 sources

                    return;
                }
                if (var0_2 || var0_2) ** GOTO lbl40
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = ld.qe - ld.ipxi("isnc", isdf(int ), (int)75)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ld.ipxi("isnd", ipxf(int ), (int)140)) break;
                    v5 /* !! */  = (long)ld.ipxi("isne", ipxf(int ), (int)141);
                }
                if (ld.uniformBuffer == null) break block115;
                if (var0_2) ** GOTO lbl40
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = ld.qe - ld.ipxi("isng", isdf(int ), (int)76)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ld.ipxi("isni", ipxf(int ), (int)142)) break;
                    v6 /* !! */  = (long)ld.ipxi("isnj", ipxf(int ), (int)143);
                }
                v7 /* !! */  = ld.qe;
                if (true) ** GOTO lbl59
                block81: while (true) {
                    v7 /* !! */  = (long)(v8 - ld.ipxi("isnl", isdf(int ), (int)77));
lbl59:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -524771430: {
                            v8 = ld.ipxi("isnn", isdf(int ), (int)78);
                            continue block81;
                        }
                        case -515262344: {
                            break block81;
                        }
                        case -182086093: {
                            v8 = ld.ipxi("isnp", isdf(int ), (int)79);
                            continue block81;
                        }
                        case 1260497431: {
                            v8 = ld.ipxi("isnq", isdf(int ), (int)80);
                            continue block81;
                        }
                    }
                    break;
                }
                ld.uniformBuffer.close();
                if (var0_2) ** GOTO lbl40
            }
            if (var0_2 || var0_2) ** GOTO lbl40
            v9 /* !! */  = ld.qe;
            if (true) ** GOTO lbl79
            block82: while (true) {
                v9 /* !! */  = (long)(v10 - ld.ipxi("isnt", isdf(int ), (int)81));
lbl79:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -1569496705: {
                        v10 = ld.ipxi("isnv", isdf(int ), (int)82);
                        continue block82;
                    }
                    case -1337717130: {
                        v10 = ld.ipxi("isnw", isdf(int ), (int)83);
                        continue block82;
                    }
                    case -515262344: {
                        break block82;
                    }
                }
                break;
            }
            if (ld.dummyVertexBuffer == null) break block116;
            if (var0_2) ** GOTO lbl40
            v11 /* !! */  = ld.qe;
            if (true) ** GOTO lbl94
            block83: while (true) {
                v11 /* !! */  = (long)(v12 - ld.ipxi("isnz", isdf(int ), (int)84));
lbl94:
                // 2 sources

                switch ((int)v11 /* !! */ ) {
                    case -844572048: {
                        v12 = ld.ipxi("isoa", isdf(int ), (int)85);
                        continue block83;
                    }
                    case -515262344: {
                        break block83;
                    }
                    case 510417128: {
                        v12 = ld.ipxi("isoc", isdf(int ), (int)86);
                        continue block83;
                    }
                    case 1366576034: {
                        v12 = ld.ipxi("isod", isdf(int ), (int)87);
                        continue block83;
                    }
                }
                break;
            }
            v13 /* !! */  = ld.qe;
            if (true) ** GOTO lbl110
            block84: while (true) {
                v13 /* !! */  = (long)(v14 - ld.ipxi("isof", isdf(int ), (int)88));
lbl110:
                // 2 sources

                switch ((int)v13 /* !! */ ) {
                    case -1640410907: {
                        v14 = ld.ipxi("isoh", isdf(int ), (int)89);
                        continue block84;
                    }
                    case -541355457: {
                        v14 = ld.ipxi("isoi", isdf(int ), (int)90);
                        continue block84;
                    }
                    case -515262344: {
                        break block84;
                    }
                }
                break;
            }
            ld.dummyVertexBuffer.close();
            if (var0_2) ** GOTO lbl40
        }
        if (var0_2 || var0_2) ** GOTO lbl40
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_3 = ld.qe - ld.ipxi("isok", isdf(int ), (int)91)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v15 /* !! */  == ld.ipxi("isol", ipxf(int ), (int)144)) break;
            v15 /* !! */  = (long)ld.ipxi("isom", ipxf(int ), (int)145);
        }
        if (ld.uniformData == null) ** GOTO lbl145
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** GOTO lbl40
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_4 = ld.qe - ld.ipxi("isoo", isdf(int ), (int)92)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == ld.ipxi("isop", ipxf(int ), (int)146)) break;
                    v16 /* !! */  = (long)ld.ipxi("isor", ipxf(int ), (int)147);
                }
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_5 = ld.qe - ld.ipxi("isos", isdf(int ), (int)93)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == ld.ipxi("isot", ipxf(int ), (int)148)) break;
                    v17 /* !! */  = (long)ld.ipxi("isou", ipxf(int ), (int)149);
                }
                MemoryUtil.memFree((Buffer)ld.uniformData);
                if (var0_2) ** GOTO lbl40
lbl145:
                // 2 sources

                if (var0_2 || var0_2) ** GOTO lbl40
                v18 /* !! */  = ld.qe;
                if (true) ** GOTO lbl150
                block88: while (true) {
                    v18 /* !! */  = (long)(ld.ipxi("isow", isdf(int ), (int)95) - ld.ipxi("isov", isdf(int ), (int)94));
lbl150:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -515262344: {
                            break block88;
                        }
                        case 1528954852: {
                            continue block88;
                        }
                    }
                    break;
                }
                ld.uniformBuffer = null;
                if (var0_2 || var0_2) ** GOTO lbl40
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_6 = ld.qe - ld.ipxi("ispb", isdf(int ), (int)96)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == ld.ipxi("ispd", ipxf(int ), (int)150)) break;
                    v19 /* !! */  = (long)ld.ipxi("ispf", ipxf(int ), (int)151);
                }
                ld.dummyVertexBuffer = null;
                if (var0_2 || var0_2) ** GOTO lbl40
                v20 /* !! */  = ld.qe;
                if (true) ** GOTO lbl168
                block90: while (true) {
                    v20 /* !! */  = (long)(v21 - ld.ipxi("ispi", isdf(int ), (int)97));
lbl168:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -1544254480: {
                            v21 = ld.ipxi("ispk", isdf(int ), (int)98);
                            continue block90;
                        }
                        case -515262344: {
                            break block90;
                        }
                        case 576677347: {
                            v21 = ld.ipxi("ispm", isdf(int ), (int)99);
                            continue block90;
                        }
                        case 2074677649: {
                            v21 = ld.ipxi("ispo", isdf(int ), (int)100);
                            continue block90;
                        }
                    }
                    break;
                }
                ld.uniformData = null;
                if (var0_2 || var0_2) ** GOTO lbl40
                v22 /* !! */  = ld.qe;
                if (true) ** GOTO lbl186
                block91: while (true) {
                    v22 /* !! */  = (long)(v23 - ld.ipxi("isps", isdf(int ), (int)101));
lbl186:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -1253279892: {
                            v23 = ld.ipxi("ispt", isdf(int ), (int)102);
                            continue block91;
                        }
                        case -515262344: {
                            break block91;
                        }
                        case -29089265: {
                            v23 = ld.ipxi("ispv", isdf(int ), (int)103);
                            continue block91;
                        }
                        case 9695258: {
                            v23 = ld.ipxi("ispx", isdf(int ), (int)104);
                            continue block91;
                        }
                    }
                    break;
                }
                ld.pipeline = null;
                if (!var0_2 && !var0_2) ** break;
                ** continue;
                return;
            }
lbl202:
            // 3 sources

            case 0: {
                var1_1 /* !! */  = (int)ld.ipxi("isqa", ipxf(int ), (int)152);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl300
            }
            case 1: {
                var1_1 /* !! */  = (int)ld.ipxi("isqc", ipxf(int ), (int)153);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl238
            }
lbl212:
            // 2 sources

            case 2: {
                var1_1 /* !! */  = (int)ld.ipxi("isqe", ipxf(int ), (int)154);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl274
            }
lbl217:
            // 2 sources

            case 3: {
                var1_1 /* !! */  = (int)ld.ipxi("isqg", ipxf(int ), (int)155);
                if (!var2) ** GOTO lbl212
                throw null;
            }
            case 4: {
                var1_1 /* !! */  = (int)ld.ipxi("isqj", ipxf(int ), (int)156);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl287
            }
lbl226:
            // 2 sources

            case 5: {
                var1_1 /* !! */  = (int)ld.ipxi("isqm", ipxf(int ), (int)157);
                if (!var2) ** GOTO lbl202
                throw null;
            }
lbl230:
            // 2 sources

            case 6: {
                var1_1 /* !! */  = (int)ld.ipxi("isqp", ipxf(int ), (int)158);
                if (!var2) ** GOTO lbl226
                throw null;
            }
lbl234:
            // 2 sources

            case 7: {
                var1_1 /* !! */  = (int)ld.ipxi("isqr", ipxf(int ), (int)159);
                if (!var2) ** GOTO lbl217
                throw null;
            }
lbl238:
            // 4 sources

            case 8: {
                var1_1 /* !! */  = (int)ld.ipxi("isqt", ipxf(int ), (int)160);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl300
            }
lbl243:
            // 2 sources

            case 9: {
                var1_1 /* !! */  = (int)ld.ipxi("isqw", ipxf(int ), (int)161);
                if (var2) {
                    throw null;
                }
            }
            case 10: {
                var1_1 /* !! */  = (int)ld.ipxi("isqy", ipxf(int ), (int)162);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl256
            }
            case 11: {
                var1_1 /* !! */  = (int)ld.ipxi("isrb", ipxf(int ), (int)163);
                if (!var2) ** GOTO lbl230
                throw null;
            }
lbl256:
            // 3 sources

            case 12: {
                var1_1 /* !! */  = (int)ld.ipxi("isrd", ipxf(int ), (int)164);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl287
            }
            case 13: {
                var1_1 /* !! */  = (int)ld.ipxi("isrg", ipxf(int ), (int)165);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl270
            }
            case 14: {
                var1_1 /* !! */  = (int)ld.ipxi("isrh", ipxf(int ), (int)166);
                if (!var2) ** GOTO lbl238
                throw null;
            }
lbl270:
            // 2 sources

            case 15: {
                var1_1 /* !! */  = (int)ld.ipxi("isri", ipxf(int ), (int)167);
                if (!var2) ** GOTO lbl243
                throw null;
            }
lbl274:
            // 2 sources

            case 16: {
                var1_1 /* !! */  = (int)ld.ipxi("isrj", ipxf(int ), (int)168);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl296
            }
            case 17: {
                var1_1 /* !! */  = (int)ld.ipxi("isrk", ipxf(int ), (int)169);
                if (!var2) ** GOTO lbl256
                throw null;
            }
            case 18: {
                var1_1 /* !! */  = (int)ld.ipxi("isrl", ipxf(int ), (int)170);
                if (!var2) ** GOTO lbl202
                throw null;
            }
lbl287:
            // 3 sources

            case 19: {
                var1_1 /* !! */  = (int)ld.ipxi("isrm", ipxf(int ), (int)171);
                if (!var2) ** GOTO lbl234
                throw null;
            }
lbl291:
            // 2 sources

            case 20: {
                var1_1 /* !! */  = (int)ld.ipxi("isro", ipxf(int ), (int)172);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl300
            }
lbl296:
            // 2 sources

            case 21: {
                var1_1 /* !! */  = (int)ld.ipxi("isrr", ipxf(int ), (int)173);
                if (!var2) ** GOTO lbl238
                throw null;
            }
lbl300:
            // 4 sources

            case 22: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)ld.ipxi("isrs", ipxf(int ), (int)174);
                    if (!var2) ** GOTO lbl291
                    throw null;
                }
            }
            case 23: 
        }
        var1_1 /* !! */  = (int)ld.ipxi("isrt", ipxf(int ), (int)175);
        ** while (!var2)
lbl308:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int ipxf(int n2) {
        return ipxg[n2] ^ ipxh[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void init() {
        v0 /* !! */  = ld.qe;
        if (true) ** GOTO lbl5
        block105: while (true) {
            v0 /* !! */  = (long)(ld.ipxi("isdj", isdf(int ), (int)1) - ld.ipxi("isdi", isdf(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -515262344: {
                    break block105;
                }
                case 651455363: {
                    continue block105;
                }
            }
            break;
        }
        var3 = ld.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ld.qe - ld.ipxi("isdk", isdf(int ), (int)2)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ld.ipxi("isdm", ipxf(int ), (int)79)) break;
            v1 /* !! */  = (long)ld.ipxi("isdn", ipxf(int ), (int)80);
        }
        var2_1 /* !! */  = ld.b;
        v2 /* !! */  = ld.qe;
        if (true) ** GOTO lbl21
        block107: while (true) {
            v2 /* !! */  = (long)(v3 - ld.ipxi("isdo", isdf(int ), (int)3));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1675755197: {
                    v3 = ld.ipxi("isdp", isdf(int ), (int)4);
                    continue block107;
                }
                case -515262344: {
                    break block107;
                }
                case 845862765: {
                    v3 = ld.ipxi("isdq", isdf(int ), (int)5);
                    continue block107;
                }
            }
            break;
        }
        var1_2 = ld.a;
        if (var3) {
            throw null;
lbl33:
            // 8 sources

            return;
        }
        if (var1_2 || var1_2) ** GOTO lbl33
        v4 = new RenderPipeline.Snippet[]{};
        v5 /* !! */  = ld.qe;
        if (true) ** GOTO lbl41
        block109: while (true) {
            v5 /* !! */  = (long)(v6 - ld.ipxi("isdr", isdf(int ), (int)6));
lbl41:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1070642576: {
                    v6 = ld.ipxi("isdt", isdf(int ), (int)7);
                    continue block109;
                }
                case -515262344: {
                    break block109;
                }
                case 371057713: {
                    v6 = ld.ipxi("isdu", isdf(int ), (int)8);
                    continue block109;
                }
            }
            break;
        }
        v7 = RenderPipeline.builder((RenderPipeline.Snippet[])v4);
        v8 /* !! */  = ld.qe;
        if (true) ** GOTO lbl55
        block110: while (true) {
            v8 /* !! */  = (long)(v9 - ld.ipxi("isdv", isdf(int ), (int)9));
lbl55:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -722207896: {
                    v9 = ld.ipxi("isdw", isdf(int ), (int)10);
                    continue block110;
                }
                case -584435206: {
                    v9 = ld.ipxi("isdx", isdf(int ), (int)11);
                    continue block110;
                }
                case -515262344: {
                    break block110;
                }
                case 402135210: {
                    v9 = ld.ipxi("isdy", isdf(int ), (int)12);
                    continue block110;
                }
            }
            break;
        }
        v10 = class_2960.method_60655((String)"phobia", (String)"pipeline/main_menu");
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_1 = ld.qe - ld.ipxi("isdz", isdf(int ), (int)13)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == ld.ipxi("isea", ipxf(int ), (int)81)) break;
            v11 /* !! */  = (long)ld.ipxi("iseb", ipxf(int ), (int)82);
        }
        v12 = v7.withLocation(v10);
        v13 /* !! */  = ld.qe;
        if (true) ** GOTO lbl78
        block112: while (true) {
            v13 /* !! */  = (long)(v14 - ld.ipxi("isec", isdf(int ), (int)14));
lbl78:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -1817994615: {
                    v14 = ld.ipxi("ised", isdf(int ), (int)15);
                    continue block112;
                }
                case -515262344: {
                    break block112;
                }
                case 1483529707: {
                    v14 = ld.ipxi("isee", isdf(int ), (int)16);
                    continue block112;
                }
                case 1514708302: {
                    v14 = ld.ipxi("isef", isdf(int ), (int)17);
                    continue block112;
                }
            }
            break;
        }
        v15 = class_2960.method_60655((String)"phobia", (String)"menu/main_menu_vertex");
        v16 /* !! */  = ld.qe;
        if (true) ** GOTO lbl95
        block113: while (true) {
            v16 /* !! */  = (long)(ld.ipxi("iseh", isdf(int ), (int)19) - ld.ipxi("iseg", isdf(int ), (int)18));
lbl95:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case -515262344: {
                    break block113;
                }
                case 790173365: {
                    continue block113;
                }
            }
            break;
        }
        v17 = v12.withVertexShader(v15);
        while (true) {
            if ((v18 /* !! */  = (cfr_temp_2 = ld.qe - ld.ipxi("isej", isdf(int ), (int)20)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v18 /* !! */  == ld.ipxi("isek", ipxf(int ), (int)83)) break;
            v18 /* !! */  = (long)ld.ipxi("isel", ipxf(int ), (int)84);
        }
        v19 = class_2960.method_60655((String)"phobia", (String)"menu/main_menu_fragment");
        while (true) {
            if ((v20 /* !! */  = (cfr_temp_3 = ld.qe - ld.ipxi("isen", isdf(int ), (int)21)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v20 /* !! */  == ld.ipxi("iseo", ipxf(int ), (int)85)) break;
            v20 /* !! */  = (long)ld.ipxi("iseq", ipxf(int ), (int)86);
        }
        v21 = v17.withFragmentShader(v19);
        while (true) {
            if ((v22 /* !! */  = (cfr_temp_4 = ld.qe - ld.ipxi("iser", isdf(int ), (int)22)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v22 /* !! */  == ld.ipxi("iset", ipxf(int ), (int)87)) break;
            v22 /* !! */  = (long)ld.ipxi("iseu", ipxf(int ), (int)88);
        }
        v23 /* !! */  = ld.qe;
        if (true) ** GOTO lbl122
        block117: while (true) {
            v23 /* !! */  = (long)(ld.ipxi("isex", isdf(int ), (int)24) - ld.ipxi("isev", isdf(int ), (int)23));
lbl122:
            // 2 sources

            switch ((int)v23 /* !! */ ) {
                case -1675902553: {
                    continue block117;
                }
                case -515262344: {
                    break block117;
                }
            }
            break;
        }
        while (true) {
            if ((v24 /* !! */  = (cfr_temp_5 = ld.qe - ld.ipxi("isez", isdf(int ), (int)25)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v24 /* !! */  == ld.ipxi("isfa", ipxf(int ), (int)89)) break;
            v24 /* !! */  = (long)ld.ipxi("isfc", ipxf(int ), (int)90);
        }
        v25 = v21.withVertexFormat(class_290.field_60033, VertexFormat.class_5596.field_27379);
        v26 /* !! */  = ld.qe;
        if (true) ** GOTO lbl137
        block119: while (true) {
            v26 /* !! */  = (long)(v27 - ld.ipxi("isfd", isdf(int ), (int)26));
lbl137:
            // 2 sources

            switch ((int)v26 /* !! */ ) {
                case -1007470915: {
                    v27 = ld.ipxi("isff", isdf(int ), (int)27);
                    continue block119;
                }
                case -515262344: {
                    break block119;
                }
                case 977907328: {
                    v27 = ld.ipxi("isfg", isdf(int ), (int)28);
                    continue block119;
                }
            }
            break;
        }
        v28 /* !! */  = ld.qe;
        if (true) ** GOTO lbl150
        block120: while (true) {
            v28 /* !! */  = (long)(v29 - ld.ipxi("isfh", isdf(int ), (int)29));
lbl150:
            // 2 sources

            switch ((int)v28 /* !! */ ) {
                case -515262344: {
                    break block120;
                }
                case 421356582: {
                    v29 = ld.ipxi("isfi", isdf(int ), (int)30);
                    continue block120;
                }
                case 1149739247: {
                    v29 = ld.ipxi("isfj", isdf(int ), (int)31);
                    continue block120;
                }
                case 1276636166: {
                    v29 = ld.ipxi("isfk", isdf(int ), (int)32);
                    continue block120;
                }
            }
            break;
        }
        v30 = v25.withUniform("MenuData", class_10789.field_60031);
        while (true) {
            if ((v31 /* !! */  = (cfr_temp_6 = ld.qe - ld.ipxi("isfn", isdf(int ), (int)33)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v31 /* !! */  == ld.ipxi("isfp", ipxf(int ), (int)91)) break;
            v31 /* !! */  = (long)ld.ipxi("isfs", ipxf(int ), (int)92);
        }
        v32 /* !! */  = ld.qe;
        if (true) ** GOTO lbl172
        block122: while (true) {
            v32 /* !! */  = (long)(ld.ipxi("isfx", isdf(int ), (int)35) - ld.ipxi("isfu", isdf(int ), (int)34));
lbl172:
            // 2 sources

            switch ((int)v32 /* !! */ ) {
                case -515262344: {
                    break block122;
                }
                case 1092020266: {
                    continue block122;
                }
            }
            break;
        }
        v33 = v30.withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST);
        v34 = ld.ipxi("isfz", ipxf(int ), (int)93);
        while (true) {
            if ((v35 /* !! */  = (cfr_temp_7 = ld.qe - ld.ipxi("isga", isdf(int ), (int)36)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v35 /* !! */  == ld.ipxi("isgc", ipxf(int ), (int)94)) break;
            v35 /* !! */  = (long)ld.ipxi("isge", ipxf(int ), (int)95);
        }
        v36 = v33.withDepthWrite((boolean)v34);
        v37 = ld.ipxi("isgk", ipxf(int ), (int)96);
        while (true) {
            if ((v38 /* !! */  = (cfr_temp_8 = ld.qe - ld.ipxi("isgm", isdf(int ), (int)37)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v38 /* !! */  == ld.ipxi("isgo", ipxf(int ), (int)97)) break;
            v38 /* !! */  = (long)ld.ipxi("isgq", ipxf(int ), (int)98);
        }
        v39 = v36.withCull((boolean)v37);
        while (true) {
            if ((v40 /* !! */  = (cfr_temp_9 = ld.qe - ld.ipxi("isgs", isdf(int ), (int)38)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v40 /* !! */  == ld.ipxi("isgt", ipxf(int ), (int)99)) break;
            v40 /* !! */  = (long)ld.ipxi("isgv", ipxf(int ), (int)100);
        }
        v41 = v39.build();
        v42 /* !! */  = ld.qe;
        if (true) ** GOTO lbl202
        block126: while (true) {
            v42 /* !! */  = (long)(ld.ipxi("isgy", isdf(int ), (int)40) - ld.ipxi("isgw", isdf(int ), (int)39));
lbl202:
            // 2 sources

            switch ((int)v42 /* !! */ ) {
                case -1684808931: {
                    continue block126;
                }
                case -515262344: {
                    break block126;
                }
            }
            break;
        }
        ld.pipeline = v41;
        if (var1_2 || var1_2) ** GOTO lbl33
        v43 = ld.ipxi("isgz", ipxf(int ), (int)101);
        while (true) {
            if ((v44 /* !! */  = (cfr_temp_10 = ld.qe - ld.ipxi("isha", isdf(int ), (int)41)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
            if (v44 /* !! */  == ld.ipxi("ishc", ipxf(int ), (int)102)) break;
            v44 /* !! */  = (long)ld.ipxi("ishd", ipxf(int ), (int)103);
        }
        v45 = MemoryUtil.memAlloc((int)v43);
        v46 /* !! */  = ld.qe;
        if (true) ** GOTO lbl220
        block128: while (true) {
            v46 /* !! */  = (long)(ld.ipxi("ishg", isdf(int ), (int)43) - ld.ipxi("ishf", isdf(int ), (int)42));
lbl220:
            // 2 sources

            switch ((int)v46 /* !! */ ) {
                case -515262344: {
                    break block128;
                }
                case 1766311057: {
                    continue block128;
                }
            }
            break;
        }
        ld.uniformData = v45;
        if (var1_2 || var1_2) ** GOTO lbl33
        v47 /* !! */  = ld.qe;
        if (true) ** GOTO lbl231
        block129: while (true) {
            v47 /* !! */  = (long)(ld.ipxi("ishl", isdf(int ), (int)45) - ld.ipxi("ishj", isdf(int ), (int)44));
lbl231:
            // 2 sources

            switch ((int)v47 /* !! */ ) {
                case -515262344: {
                    break block129;
                }
                case 417078905: {
                    continue block129;
                }
            }
            break;
        }
        v48 = RenderSystem.getDevice();
        v49 /* !! */  = ld.qe;
        if (true) ** GOTO lbl241
        block130: while (true) {
            v49 /* !! */  = (long)(ld.ipxi("ishq", isdf(int ), (int)47) - ld.ipxi("isho", isdf(int ), (int)46));
lbl241:
            // 2 sources

            switch ((int)v49 /* !! */ ) {
                case -1226041141: {
                    continue block130;
                }
                case -515262344: {
                    break block130;
                }
            }
            break;
        }
        v50 = (Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$init$1(), ()Ljava/lang/String;)();
        v51 = ld.ipxi("ishr", ipxf(int ), (int)104);
        v52 = ld.ipxi("ishs", isdf(int ), (int)48);
        v53 /* !! */  = ld.qe;
        if (true) ** GOTO lbl253
        block131: while (true) {
            v53 /* !! */  = (long)(ld.ipxi("ishu", isdf(int ), (int)50) - ld.ipxi("isht", isdf(int ), (int)49));
lbl253:
            // 2 sources

            switch ((int)v53 /* !! */ ) {
                case -515262344: {
                    break block131;
                }
                case 2064604906: {
                    continue block131;
                }
            }
            break;
        }
        v54 = v48.createBuffer(v50, (int)v51, (long)v52);
        while (true) {
            if ((v55 /* !! */  = (cfr_temp_11 = ld.qe - ld.ipxi("ishx", isdf(int ), (int)51)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
            if (v55 /* !! */  == ld.ipxi("ishz", ipxf(int ), (int)105)) break;
            v55 /* !! */  = (long)ld.ipxi("isib", ipxf(int ), (int)106);
        }
        ld.uniformBuffer = v54;
        if (var1_2 || var1_2) ** GOTO lbl33
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v56 = ld.ipxi("isif", ipxf(int ), (int)107);
                v57 /* !! */  = ld.qe;
                if (true) ** GOTO lbl274
                block133: while (true) {
                    v57 /* !! */  = (long)(v58 - ld.ipxi("isih", isdf(int ), (int)52));
lbl274:
                    // 2 sources

                    switch ((int)v57 /* !! */ ) {
                        case -1591153713: {
                            v58 = ld.ipxi("isij", isdf(int ), (int)53);
                            continue block133;
                        }
                        case -1128768310: {
                            v58 = ld.ipxi("isil", isdf(int ), (int)54);
                            continue block133;
                        }
                        case -515262344: {
                            break block133;
                        }
                        case 1662043914: {
                            v58 = ld.ipxi("isio", isdf(int ), (int)55);
                            continue block133;
                        }
                    }
                    break;
                }
                var0_3 = MemoryUtil.memAlloc((int)v56);
                if (var1_2 || var1_2) ** GOTO lbl33
                v59 = ld.ipxi("isis", ipxf(int ), (int)108);
                while (true) {
                    if ((v60 /* !! */  = (cfr_temp_12 = ld.qe - ld.ipxi("isiv", isdf(int ), (int)56)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v60 /* !! */  == ld.ipxi("isix", ipxf(int ), (int)109)) break;
                    v60 /* !! */  = (long)ld.ipxi("isiz", ipxf(int ), (int)110);
                }
                v61 = var0_3.putInt((int)v59);
                while (true) {
                    if ((v62 /* !! */  = (cfr_temp_13 = ld.qe - ld.ipxi("isjc", isdf(int ), (int)57)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v62 /* !! */  == ld.ipxi("isje", ipxf(int ), (int)111)) break;
                    v62 /* !! */  = (long)ld.ipxi("isjf", ipxf(int ), (int)112);
                }
                v61.flip();
                if (var1_2 || var1_2) ** GOTO lbl33
                while (true) {
                    if ((v63 /* !! */  = (cfr_temp_14 = ld.qe - ld.ipxi("isji", isdf(int ), (int)58)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                    if (v63 /* !! */  == ld.ipxi("isjj", ipxf(int ), (int)113)) break;
                    v63 /* !! */  = (long)ld.ipxi("isjl", ipxf(int ), (int)114);
                }
                v64 = RenderSystem.getDevice();
                while (true) {
                    if ((v65 /* !! */  = (cfr_temp_15 = ld.qe - ld.ipxi("isjm", isdf(int ), (int)59)) == 0L ? 0 : (cfr_temp_15 < 0L ? -1 : 1)) == false) continue;
                    if (v65 /* !! */  == ld.ipxi("isjn", ipxf(int ), (int)115)) break;
                    v65 /* !! */  = (long)ld.ipxi("isjp", ipxf(int ), (int)116);
                }
                v66 = (Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$init$2(), ()Ljava/lang/String;)();
                v67 = ld.ipxi("isjs", ipxf(int ), (int)117);
                while (true) {
                    if ((v68 /* !! */  = (cfr_temp_16 = ld.qe - ld.ipxi("isjv", isdf(int ), (int)60)) == 0L ? 0 : (cfr_temp_16 < 0L ? -1 : 1)) == false) continue;
                    if (v68 /* !! */  == ld.ipxi("isjy", ipxf(int ), (int)118)) break;
                    v68 /* !! */  = (long)ld.ipxi("iska", ipxf(int ), (int)119);
                }
                v69 = v64.createBuffer(v66, (int)v67, var0_3);
                v70 /* !! */  = ld.qe;
                if (true) ** GOTO lbl325
                block139: while (true) {
                    v70 /* !! */  = (long)(v71 - ld.ipxi("iskb", isdf(int ), (int)61));
lbl325:
                    // 2 sources

                    switch ((int)v70 /* !! */ ) {
                        case -515262344: {
                            break block139;
                        }
                        case 841941823: {
                            v71 = ld.ipxi("iskc", isdf(int ), (int)62);
                            continue block139;
                        }
                        case 1268451615: {
                            v71 = ld.ipxi("iske", isdf(int ), (int)63);
                            continue block139;
                        }
                    }
                    break;
                }
                ld.dummyVertexBuffer = v69;
                if (var1_2 || var1_2) ** GOTO lbl33
                v72 /* !! */  = ld.qe;
                if (true) ** GOTO lbl340
                block140: while (true) {
                    v72 /* !! */  = (long)(v73 - ld.ipxi("iski", isdf(int ), (int)64));
lbl340:
                    // 2 sources

                    switch ((int)v72 /* !! */ ) {
                        case -515262344: {
                            break block140;
                        }
                        case -62006237: {
                            v73 = ld.ipxi("iskl", isdf(int ), (int)65);
                            continue block140;
                        }
                        case 1878533919: {
                            v73 = ld.ipxi("iskm", isdf(int ), (int)66);
                            continue block140;
                        }
                    }
                    break;
                }
                MemoryUtil.memFree((Buffer)var0_3);
                if (var1_2 || var1_2) ** continue;
                return;
            }
lbl352:
            // 2 sources

            case 0: {
                var2_1 /* !! */  = (int)ld.ipxi("iskp", ipxf(int ), (int)120);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl409
            }
lbl357:
            // 2 sources

            case 1: {
                var2_1 /* !! */  = (int)ld.ipxi("iskr", ipxf(int ), (int)121);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl418
            }
lbl362:
            // 3 sources

            case 2: {
                var2_1 /* !! */  = (int)ld.ipxi("iskt", ipxf(int ), (int)122);
                if (!var3) ** GOTO lbl352
                throw null;
            }
            case 3: {
                var2_1 /* !! */  = (int)ld.ipxi("isku", ipxf(int ), (int)123);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl399
            }
lbl371:
            // 3 sources

            case 4: {
                var2_1 /* !! */  = (int)ld.ipxi("iskv", ipxf(int ), (int)124);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl422
            }
            case 5: {
                var2_1 /* !! */  = (int)ld.ipxi("iskw", ipxf(int ), (int)125);
                if (!var3) ** GOTO lbl371
                throw null;
            }
            case 6: {
                var2_1 /* !! */  = (int)ld.ipxi("isky", ipxf(int ), (int)126);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl426
            }
lbl385:
            // 2 sources

            case 7: {
                var2_1 /* !! */  = (int)ld.ipxi("isla", ipxf(int ), (int)127);
                if (var3) {
                    throw null;
                }
            }
            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)ld.ipxi("islc", ipxf(int ), (int)128);
                    if (!var3) ** GOTO lbl362
                    throw null;
                }
            }
            case 9: {
                do {
                    var2_1 /* !! */  = (int)ld.ipxi("islf", ipxf(int ), (int)129);
                } while (!var3);
                throw null;
            }
lbl399:
            // 2 sources

            case 10: {
                var2_1 /* !! */  = (int)ld.ipxi("islh", ipxf(int ), (int)130);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl422
            }
            case 11: {
                var2_1 /* !! */  = (int)ld.ipxi("islk", ipxf(int ), (int)131);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl413
            }
lbl409:
            // 2 sources

            case 12: {
                var2_1 /* !! */  = (int)ld.ipxi("isln", ipxf(int ), (int)132);
                if (!var3) ** GOTO lbl362
                throw null;
            }
lbl413:
            // 2 sources

            case 13: {
                var2_1 /* !! */  = (int)ld.ipxi("islp", ipxf(int ), (int)133);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl422
            }
lbl418:
            // 2 sources

            case 14: {
                var2_1 /* !! */  = (int)ld.ipxi("isls", ipxf(int ), (int)134);
                if (!var3) ** GOTO lbl385
                throw null;
            }
lbl422:
            // 4 sources

            case 15: {
                var2_1 /* !! */  = (int)ld.ipxi("islv", ipxf(int ), (int)135);
                if (!var3) ** GOTO lbl357
                throw null;
            }
lbl426:
            // 2 sources

            case 16: {
                var2_1 /* !! */  = (int)ld.ipxi("isly", ipxf(int ), (int)136);
                if (!var3) ** GOTO lbl371
                throw null;
            }
            case 17: 
        }
        var2_1 /* !! */  = (int)ld.ipxi("ismb", ipxf(int ), (int)137);
        ** while (!var3)
lbl433:
        // 1 sources

        throw null;
    }

    static {
        ipxg = new int[200];
        ipxh = new int[200];
        ld.istn();
        ld.isto();
        ld.istq();
        ld.ists();
        isdg = new long[122];
        isdh = new long[122];
        ld.istw();
        ld.isue();
        ld.isug();
        ld.isum();
        START_NANOS = System.nanoTime();
    }

    private static /* synthetic */ void isue() {
        ld.isdg[100] = -4404543147657645564L;
        ld.isdg[101] = -8961220553178717597L;
        ld.isdg[102] = 2770285705872808810L;
        ld.isdg[103] = 2956677260757748010L;
        ld.isdg[104] = -5863501554045804362L;
        ld.isdg[105] = -4253153420768151739L;
        ld.isdg[106] = -2024219886372311100L;
        ld.isdg[107] = -1643031552629619603L;
        ld.isdg[108] = -7792591284383390227L;
        ld.isdg[109] = -2118387391373534787L;
        ld.isdg[110] = 4830500667167408727L;
        ld.isdg[111] = 7846859378685624985L;
        ld.isdg[112] = 5356101383145272005L;
        ld.isdg[113] = -8431894306429157678L;
        ld.isdg[114] = -3809429975070521602L;
        ld.isdg[115] = 2716181396816902378L;
        ld.isdg[116] = 7946759085657775743L;
        ld.isdg[117] = -3595214125921263826L;
        ld.isdg[118] = 2617937104811960155L;
        ld.isdg[119] = 6505341736511158051L;
        ld.isdg[120] = -1164698083139588866L;
        ld.isdg[121] = -1445868197481902863L;
    }

    private static /* synthetic */ void istw() {
        ld.isdg[0] = 4546996452456478744L;
        ld.isdg[1] = -3629206288101180875L;
        ld.isdg[2] = -8198452582710368836L;
        ld.isdg[3] = -1162435669525406635L;
        ld.isdg[4] = -7662540364179638215L;
        ld.isdg[5] = -4136455419410838604L;
        ld.isdg[6] = 4310508569488493548L;
        ld.isdg[7] = -2342270727211370008L;
        ld.isdg[8] = 645125563466550814L;
        ld.isdg[9] = -3487302663700200488L;
        ld.isdg[10] = 7711082352900971832L;
        ld.isdg[11] = -6242632912468398009L;
        ld.isdg[12] = -5811607103697507236L;
        ld.isdg[13] = 5629703762538679792L;
        ld.isdg[14] = -6208633642966264705L;
        ld.isdg[15] = 507011710372001528L;
        ld.isdg[16] = -4902336937836920549L;
        ld.isdg[17] = -4714077370058886171L;
        ld.isdg[18] = 2000959057676869646L;
        ld.isdg[19] = 3125450769990190959L;
        ld.isdg[20] = 4154481066923287390L;
        ld.isdg[21] = 806523463317569954L;
        ld.isdg[22] = -7691543399546377102L;
        ld.isdg[23] = -4353734910672388965L;
        ld.isdg[24] = -3053146042565089734L;
        ld.isdg[25] = -309004515285832319L;
        ld.isdg[26] = -6297369593134621671L;
        ld.isdg[27] = -6749198327850713192L;
        ld.isdg[28] = -379099603678967144L;
        ld.isdg[29] = -586189299042953437L;
        ld.isdg[30] = -7467355812118060242L;
        ld.isdg[31] = -4055688562299950446L;
        ld.isdg[32] = -5771155302967405606L;
        ld.isdg[33] = 5212888165916432883L;
        ld.isdg[34] = 5160972474476892023L;
        ld.isdg[35] = 1199813442238711526L;
        ld.isdg[36] = -560745917541122120L;
        ld.isdg[37] = -1438290491302431976L;
        ld.isdg[38] = -1162194887860841679L;
        ld.isdg[39] = -4903484045373731427L;
        ld.isdg[40] = -7686792828549772830L;
        ld.isdg[41] = -602037380936402575L;
        ld.isdg[42] = -4134587395992585078L;
        ld.isdg[43] = 4430780149762301435L;
        ld.isdg[44] = 1367667682900047279L;
        ld.isdg[45] = 1975533746673180990L;
        ld.isdg[46] = 330527472949113329L;
        ld.isdg[47] = -2537312410846993247L;
        ld.isdg[48] = 1789502302904888963L;
        ld.isdg[49] = 4902410165490104698L;
        ld.isdg[50] = 6609991097205492139L;
        ld.isdg[51] = 4123263350141597225L;
        ld.isdg[52] = 61129954421968539L;
        ld.isdg[53] = 6503726177849322609L;
        ld.isdg[54] = -2880195037186039513L;
        ld.isdg[55] = 5292987957003692001L;
        ld.isdg[56] = 7165278336426706760L;
        ld.isdg[57] = 5440921759482258336L;
        ld.isdg[58] = 3940895325446435202L;
        ld.isdg[59] = 316552777887976586L;
        ld.isdg[60] = -5746703980011186804L;
        ld.isdg[61] = -5576766929523041113L;
        ld.isdg[62] = -3125930694109933629L;
        ld.isdg[63] = 8737680710603803193L;
        ld.isdg[64] = -7531255239172872428L;
        ld.isdg[65] = -7533985346002091705L;
        ld.isdg[66] = -4106956210151455361L;
        ld.isdg[67] = -8839463573640905070L;
        ld.isdg[68] = -6582212668263039118L;
        ld.isdg[69] = 9127086498040089212L;
        ld.isdg[70] = -1500334592471198733L;
        ld.isdg[71] = 6578801276523227151L;
        ld.isdg[72] = 8069916725739550415L;
        ld.isdg[73] = -6729362512396234310L;
        ld.isdg[74] = -5364433070394487056L;
        ld.isdg[75] = -1331543115210135792L;
        ld.isdg[76] = -5179210612186722748L;
        ld.isdg[77] = -2320855134217940450L;
        ld.isdg[78] = 8281938149921437460L;
        ld.isdg[79] = 6574438207437866243L;
        ld.isdg[80] = -4862919986999182557L;
        ld.isdg[81] = -1783880358895742519L;
        ld.isdg[82] = 8189569001864775939L;
        ld.isdg[83] = -3456923565984344958L;
        ld.isdg[84] = 7445499578127120020L;
        ld.isdg[85] = -923204188263266856L;
        ld.isdg[86] = -1828277261466560950L;
        ld.isdg[87] = -8118122954836623573L;
        ld.isdg[88] = -3524761574291959825L;
        ld.isdg[89] = -5065480308373589107L;
        ld.isdg[90] = 5936157069433267989L;
        ld.isdg[91] = -2728007646279842629L;
        ld.isdg[92] = -3812404347871621186L;
        ld.isdg[93] = -3963531970236905154L;
        ld.isdg[94] = -6343305172596513715L;
        ld.isdg[95] = 9112219408515799395L;
        ld.isdg[96] = -6297239481157177548L;
        ld.isdg[97] = -7116906374574990787L;
        ld.isdg[98] = -8725852490993196814L;
        ld.isdg[99] = -1593931582731259636L;
    }

    public static /* synthetic */ CallSite ipxi(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void isum() {
        ld.isdh[100] = -8679148064231320717L;
        ld.isdh[101] = 7258522727724009938L;
        ld.isdh[102] = 6222067154591006192L;
        ld.isdh[103] = -5653254637401974722L;
        ld.isdh[104] = 8453320755898048628L;
        ld.isdh[105] = 2994468523241820240L;
        ld.isdh[106] = -4890679324572516834L;
        ld.isdh[107] = -496032728040471445L;
        ld.isdh[108] = 2797242133198350064L;
        ld.isdh[109] = 6591511067794167131L;
        ld.isdh[110] = 129132784987276024L;
        ld.isdh[111] = 1276241821347625311L;
        ld.isdh[112] = -5682163027697764237L;
        ld.isdh[113] = -1500406137918925682L;
        ld.isdh[114] = 7455538134806389714L;
        ld.isdh[115] = 7467583490745108346L;
        ld.isdh[116] = 5470629289961001784L;
        ld.isdh[117] = 6728973397018236524L;
        ld.isdh[118] = 6928945484178151036L;
        ld.isdh[119] = -7050841124990021624L;
        ld.isdh[120] = 6435196194421130974L;
        ld.isdh[121] = 374375796030220516L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String lambda$init$2() {
        block21: {
            v0 /* !! */  = ld.qe;
            if (true) ** GOTO lbl5
            block12: while (true) {
                v0 /* !! */  = (long)(v1 - ld.ipxi("isrw", isdf(int ), (int)105));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -2075933494: {
                        v1 = ld.ipxi("isrx", isdf(int ), (int)106);
                        continue block12;
                    }
                    case -515262344: {
                        break block12;
                    }
                    case 440709646: {
                        v1 = ld.ipxi("isrz", isdf(int ), (int)107);
                        continue block12;
                    }
                    case 1403203458: {
                        v1 = ld.ipxi("issa", isdf(int ), (int)108);
                        continue block12;
                    }
                }
                break;
            }
            var2 = ld.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_1 = ld.qe - ld.ipxi("issc", isdf(int ), (int)109)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == ld.ipxi("issd", ipxf(int ), (int)176)) break;
                v2 /* !! */  = (long)ld.ipxi("isse", ipxf(int ), (int)177);
            }
            var1_1 /* !! */  = ld.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_2 = ld.qe - ld.ipxi("issf", isdf(int ), (int)110)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == ld.ipxi("issg", ipxf(int ), (int)178)) {
                    var0_2 = ld.a;
                    if (var2) {
                        throw null;
                    }
                    break;
                }
                v3 /* !! */  = (long)ld.ipxi("issh", ipxf(int ), (int)179);
            }
            if (var0_2 || var0_2) {
                return null;
            }
            if (var1_1 /* !! */  == 0) return "Phobia Main Menu Dummy Vertex";
            cfr_temp_0 = -2147483648;
            block15: do {
                switch (cfr_temp_0 == -2147483648 ? var1_1 /* !! */  : cfr_temp_0) {
                    default: {
                        return "Phobia Main Menu Dummy Vertex";
                    }
                    case 0: {
                        var1_1 /* !! */  = (int)ld.ipxi("issi", ipxf(int ), (int)180);
                        cfr_temp_0 = 2;
                        if (!var2) continue block15;
                        throw null;
                    }
                    case 1: {
                        ** break;
                    }
                    case 3: {
                        break block21;
                    }
lbl50:
                    // 2 sources

                    while (true) {
                        var1_1 /* !! */  = (int)ld.ipxi("issj", ipxf(int ), (int)181);
                        cfr_temp_0 = 2;
                        if (!var2) continue block15;
                        throw null;
                    }
                    case 2: 
                }
                break;
            } while (true);
            var1_1 /* !! */  = (int)ld.ipxi("issk", ipxf(int ), (int)182);
            if (var2) {
                throw null;
            }
        }
        var1_1 /* !! */  = (int)ld.ipxi("issl", ipxf(int ), (int)183);
        ** while (!var2)
lbl64:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ists() {
        ld.ipxh[100] = -849256509;
        ld.ipxh[101] = -1143895800;
        ld.ipxh[102] = 421333460;
        ld.ipxh[103] = -688977387;
        ld.ipxh[104] = -1937504340;
        ld.ipxh[105] = 360043968;
        ld.ipxh[106] = 1116173772;
        ld.ipxh[107] = 552708427;
        ld.ipxh[108] = -2016212745;
        ld.ipxh[109] = 1860062743;
        ld.ipxh[110] = -2073028738;
        ld.ipxh[111] = -60485388;
        ld.ipxh[112] = 978964612;
        ld.ipxh[113] = 1502657935;
        ld.ipxh[114] = 726477690;
        ld.ipxh[115] = -2041281491;
        ld.ipxh[116] = -442284204;
        ld.ipxh[117] = 1633854801;
        ld.ipxh[118] = 1901796152;
        ld.ipxh[119] = 977291715;
        ld.ipxh[120] = 1463407230;
        ld.ipxh[121] = -210264977;
        ld.ipxh[122] = 816402811;
        ld.ipxh[123] = 1278775246;
        ld.ipxh[124] = -659197836;
        ld.ipxh[125] = 558558609;
        ld.ipxh[126] = -1981867395;
        ld.ipxh[127] = -693905595;
        ld.ipxh[128] = -305714889;
        ld.ipxh[129] = -297440745;
        ld.ipxh[130] = -712486016;
        ld.ipxh[131] = 1995630965;
        ld.ipxh[132] = 456722888;
        ld.ipxh[133] = 320611191;
        ld.ipxh[134] = 1928718783;
        ld.ipxh[135] = -602797739;
        ld.ipxh[136] = -1698939781;
        ld.ipxh[137] = -1347836353;
        ld.ipxh[138] = -186438419;
        ld.ipxh[139] = 1785948059;
        ld.ipxh[140] = 558470522;
        ld.ipxh[141] = 2035043595;
        ld.ipxh[142] = -27818010;
        ld.ipxh[143] = 1903264959;
        ld.ipxh[144] = 1871447251;
        ld.ipxh[145] = -238172485;
        ld.ipxh[146] = 1617913571;
        ld.ipxh[147] = 1574077282;
        ld.ipxh[148] = 578083380;
        ld.ipxh[149] = -42838261;
        ld.ipxh[150] = 155721602;
        ld.ipxh[151] = 868081704;
        ld.ipxh[152] = 1933516335;
        ld.ipxh[153] = -1421424535;
        ld.ipxh[154] = 1761501932;
        ld.ipxh[155] = -1125668741;
        ld.ipxh[156] = -508565679;
        ld.ipxh[157] = -885812265;
        ld.ipxh[158] = 1032436572;
        ld.ipxh[159] = 895030612;
        ld.ipxh[160] = -461169752;
        ld.ipxh[161] = 875067848;
        ld.ipxh[162] = 1019486004;
        ld.ipxh[163] = 2113936129;
        ld.ipxh[164] = -53882954;
        ld.ipxh[165] = -1908361539;
        ld.ipxh[166] = 1066629062;
        ld.ipxh[167] = 661065569;
        ld.ipxh[168] = 2123454311;
        ld.ipxh[169] = 1848750139;
        ld.ipxh[170] = 482735792;
        ld.ipxh[171] = 830817680;
        ld.ipxh[172] = -877148247;
        ld.ipxh[173] = 446765262;
        ld.ipxh[174] = -1093991530;
        ld.ipxh[175] = -1426326642;
        ld.ipxh[176] = 1432117114;
        ld.ipxh[177] = -865658623;
        ld.ipxh[178] = 236105349;
        ld.ipxh[179] = 870637378;
        ld.ipxh[180] = 1219424719;
        ld.ipxh[181] = 1635673587;
        ld.ipxh[182] = 346511110;
        ld.ipxh[183] = -314617481;
        ld.ipxh[184] = 729240182;
        ld.ipxh[185] = 1005609826;
        ld.ipxh[186] = 644905792;
        ld.ipxh[187] = 508019232;
        ld.ipxh[188] = -1423542103;
        ld.ipxh[189] = 1324281214;
        ld.ipxh[190] = 1326359748;
        ld.ipxh[191] = 609125876;
        ld.ipxh[192] = 300161597;
        ld.ipxh[193] = 1441351150;
        ld.ipxh[194] = -1794196225;
        ld.ipxh[195] = 833151682;
        ld.ipxh[196] = 861200826;
        ld.ipxh[197] = 1219241778;
        ld.ipxh[198] = -1008775931;
        ld.ipxh[199] = 174143597;
    }
}

