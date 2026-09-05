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
import java.util.OptionalInt;
import java.util.function.Supplier;
import net.minecraft.class_310;
import org.joml.Matrix4f;
import org.lwjgl.system.MemoryUtil;

public class kl {
    private static final int UNIFORM_SIZE = 160;
    private static int[] hyoh = new int[196];
    public static final int b;
    public static final boolean c;
    private static long[] hyob;
    private static long[] hyoa;
    static final long pe = -4000626587332058330L;
    private static RenderPipeline pipeline;
    private static GpuBuffer uniformBuffer;
    public static final boolean a;
    private static int[] hyoi;

    public static /* synthetic */ CallSite hyoc(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ float hysv(int n2) {
        return Float.intBitsToFloat(hyoh[n2] ^ hyoi[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void shutdown() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kl.pe - kl.hyoc("hyxb", hynz(int ), (int)65)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == kl.hyoc("hyxc", hyog(int ), (int)163)) break;
            v0 /* !! */  = (long)kl.hyoc("hyxd", hyog(int ), (int)164);
        }
        var2 = kl.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = kl.pe - kl.hyoc("hyxe", hynz(int ), (int)66)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == kl.hyoc("hyxf", hyog(int ), (int)165)) break;
            v1 /* !! */  = (long)kl.hyoc("hyxg", hyog(int ), (int)166);
        }
        var1_1 /* !! */  = kl.b;
        v2 /* !! */  = kl.pe;
        if (true) ** GOTO lbl17
        block35: while (true) {
            v2 /* !! */  = (long)(v3 - kl.hyoc("hyxh", hynz(int ), (int)67));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1491672282: {
                    break block35;
                }
                case -1486817344: {
                    v3 = kl.hyoc("hyxi", hynz(int ), (int)68);
                    continue block35;
                }
                case -1290882436: {
                    v3 = kl.hyoc("hyxj", hynz(int ), (int)69);
                    continue block35;
                }
                case 472025473: {
                    v3 = kl.hyoc("hyxk", hynz(int ), (int)70);
                    continue block35;
                }
            }
            break;
        }
        var0_2 = kl.a;
        if (var2) {
            throw null;
lbl32:
            // 6 sources

            return;
        }
        if (var0_2 || var0_2) ** GOTO lbl32
        v4 /* !! */  = kl.pe;
        if (true) ** GOTO lbl39
        block37: while (true) {
            v4 /* !! */  = (long)(kl.hyoc("hyxm", hynz(int ), (int)72) - kl.hyoc("hyxl", hynz(int ), (int)71));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2121701893: {
                    continue block37;
                }
                case -1491672282: {
                    break block37;
                }
            }
            break;
        }
        if (kl.uniformBuffer == null) ** GOTO lbl-1000
        if (var0_2 || var0_2) ** GOTO lbl32
        v5 /* !! */  = kl.pe;
        if (true) ** GOTO lbl50
        block38: while (true) {
            v5 /* !! */  = (long)(kl.hyoc("hyxo", hynz(int ), (int)74) - kl.hyoc("hyxn", hynz(int ), (int)73));
lbl50:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1491672282: {
                    break block38;
                }
                case -588393933: {
                    continue block38;
                }
            }
            break;
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = kl.pe - kl.hyoc("hyxp", hynz(int ), (int)75)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == kl.hyoc("hyxq", hyog(int ), (int)167)) break;
            v6 /* !! */  = (long)kl.hyoc("hyxr", hyog(int ), (int)168);
        }
        kl.uniformBuffer.close();
        if (var0_2 || var0_2) ** GOTO lbl32
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_3 = kl.pe - kl.hyoc("hyxs", hynz(int ), (int)76)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == kl.hyoc("hyxt", hyog(int ), (int)169)) break;
            v7 /* !! */  = (long)kl.hyoc("hyxu", hyog(int ), (int)170);
        }
        kl.uniformBuffer = null;
        if (var0_2) ** GOTO lbl32
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 3 sources

            {
                if (var0_2 || var0_2) ** GOTO lbl32
                v8 /* !! */  = kl.pe;
                if (true) ** GOTO lbl77
                block41: while (true) {
                    v8 /* !! */  = (long)(kl.hyoc("hyxw", hynz(int ), (int)78) - kl.hyoc("hyxv", hynz(int ), (int)77));
lbl77:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1491672282: {
                            break block41;
                        }
                        case 22609275: {
                            continue block41;
                        }
                    }
                    break;
                }
                kl.pipeline = null;
                if (!var0_2 && !var0_2) ** break;
                ** continue;
                return;
            }
            case 0: {
                var1_1 /* !! */  = (int)kl.hyoc("hyxx", hyog(int ), (int)171);
                if (var2) {
                    throw null;
                }
            }
lbl90:
            // 4 sources

            case 1: {
                var1_1 /* !! */  = (int)kl.hyoc("hyxy", hyog(int ), (int)172);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl127
            }
            case 2: {
                do {
                    var1_1 /* !! */  = (int)kl.hyoc("hyxz", hyog(int ), (int)173);
                } while (!var2);
                throw null;
            }
            case 3: {
                var1_1 /* !! */  = (int)kl.hyoc("hyya", hyog(int ), (int)174);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl123
            }
            case 4: {
                var1_1 /* !! */  = (int)kl.hyoc("hyyb", hyog(int ), (int)175);
                if (!var2) ** GOTO lbl90
                throw null;
            }
lbl109:
            // 2 sources

            case 5: {
                var1_1 /* !! */  = (int)kl.hyoc("hyyc", hyog(int ), (int)176);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl127
            }
            case 6: {
                var1_1 /* !! */  = (int)kl.hyoc("hyyd", hyog(int ), (int)177);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl127
            }
            case 7: {
                var1_1 /* !! */  = (int)kl.hyoc("hyye", hyog(int ), (int)178);
                if (var2) {
                    throw null;
                }
            }
lbl123:
            // 4 sources

            case 8: {
                var1_1 /* !! */  = (int)kl.hyoc("hyyf", hyog(int ), (int)179);
                if (!var2) break;
                throw null;
            }
lbl127:
            // 4 sources

            case 9: {
                var1_1 /* !! */  = (int)kl.hyoc("hyyg", hyog(int ), (int)180);
                if (!var2) break;
                throw null;
            }
            case 10: {
                var1_1 /* !! */  = (int)kl.hyoc("hyyh", hyog(int ), (int)181);
                if (!var2) break;
                throw null;
            }
            case 11: {
                var1_1 /* !! */  = (int)kl.hyoc("hyyi", hyog(int ), (int)182);
                if (!var2) ** GOTO lbl109
                throw null;
            }
            case 12: 
        }
        do {
            var1_1 /* !! */  = (int)kl.hyoc("hyyj", hyog(int ), (int)183);
        } while (!var2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void draw(Matrix4f var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, int var8_8, int var9_9, float var10_10) {
        block170: {
            block169: {
                block168: {
                    var27_11 = kl.c;
                    var26_12 /* !! */  = kl.b;
                    var25_13 = kl.a;
                    if (var27_11) {
                        throw null;
lbl6:
                        // 47 sources

                        return;
                    }
                    if (var25_13 || var25_13) ** GOTO lbl6
                    if (kl.pipeline != null) break block168;
                    if (var25_13 || var25_13) ** GOTO lbl6
                    kl.init();
                    if (var25_13) ** GOTO lbl6
                }
                if (var25_13 || var25_13) ** GOTO lbl6
                if (kl.pipeline == null) break block169;
                if (var25_13) ** GOTO lbl6
                if (kl.uniformBuffer != null) break block170;
                if (var25_13) ** GOTO lbl6
            }
            if (var25_13 || var25_13) ** GOTO lbl6
            return;
        }
        if (var25_13 || var25_13) ** GOTO lbl6
        var11_14 = (float)(var8_8 >> kl.hyoc("hyst", hyog(int ), (int)52) & kl.hyoc("hysu", hyog(int ), (int)53)) / kl.hyoc("hysw", hysv(int ), (int)54);
        if (var25_13 || var25_13) ** GOTO lbl6
        var12_15 = (float)(var8_8 >> kl.hyoc("hysx", hyog(int ), (int)55) & kl.hyoc("hysy", hyog(int ), (int)56)) / kl.hyoc("hysz", hysv(int ), (int)57);
        if (var25_13 || var25_13) ** GOTO lbl6
        var13_16 = (float)(var8_8 & kl.hyoc("hyta", hyog(int ), (int)58)) / kl.hyoc("hytb", hysv(int ), (int)59);
        if (var25_13 || var25_13) ** GOTO lbl6
        var14_17 = (float)(var8_8 >> kl.hyoc("hytc", hyog(int ), (int)60) & kl.hyoc("hytd", hyog(int ), (int)61)) / kl.hyoc("hyte", hysv(int ), (int)62);
        if (var25_13 || var25_13) ** GOTO lbl6
        var15_18 = (float)(var9_9 >> kl.hyoc("hytf", hyog(int ), (int)63) & kl.hyoc("hytg", hyog(int ), (int)64)) / kl.hyoc("hyth", hysv(int ), (int)65);
        if (var25_13 || var25_13) ** GOTO lbl6
        var16_19 = (float)(var9_9 >> kl.hyoc("hyti", hyog(int ), (int)66) & kl.hyoc("hytj", hyog(int ), (int)67)) / kl.hyoc("hytk", hysv(int ), (int)68);
        if (var25_13 || var25_13) ** GOTO lbl6
        var17_20 = (float)(var9_9 & kl.hyoc("hytl", hyog(int ), (int)69)) / kl.hyoc("hytm", hysv(int ), (int)70);
        if (var25_13 || var25_13) ** GOTO lbl6
        var18_21 = (float)(var9_9 >> kl.hyoc("hytn", hyog(int ), (int)71) & kl.hyoc("hyto", hyog(int ), (int)72)) / kl.hyoc("hytp", hysv(int ), (int)73);
        if (var25_13 || var25_13) ** GOTO lbl6
        if (var26_12 /* !! */  == 0) ** GOTO lbl-1000
        switch (var26_12 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var19_22 = MemoryUtil.memAlloc((int)kl.hyoc("hytq", hyog(int ), (int)74));
                if (var25_13 || var25_13) ** GOTO lbl6
                var19_22.putFloat(var0.m00()).putFloat(var0.m01()).putFloat(var0.m02()).putFloat(var0.m03());
                if (var25_13 || var25_13) ** GOTO lbl6
                var19_22.putFloat(var0.m10()).putFloat(var0.m11()).putFloat(var0.m12()).putFloat(var0.m13());
                if (var25_13 || var25_13) ** GOTO lbl6
                var19_22.putFloat(var0.m20()).putFloat(var0.m21()).putFloat(var0.m22()).putFloat(var0.m23());
                if (var25_13 || var25_13) ** GOTO lbl6
                var19_22.putFloat(var0.m30()).putFloat(var0.m31()).putFloat(var0.m32()).putFloat(var0.m33());
                if (var25_13 || var25_13) ** GOTO lbl6
                var19_22.position((int)kl.hyoc("hytr", hyog(int ), (int)75));
                if (var25_13 || var25_13) ** GOTO lbl6
                var19_22.putFloat(var1_1).putFloat(var2_2).putFloat(var3_3).putFloat(var3_3);
                if (var25_13 || var25_13) ** GOTO lbl6
                var19_22.putFloat(var3_3).putFloat(var4_4).putFloat(var5_5).putFloat(var6_6);
                if (var25_13 || var25_13) ** GOTO lbl6
                var19_22.putFloat(var10_10).putFloat(var7_7).putFloat(0.0f).putFloat(0.0f);
                if (var25_13 || var25_13) ** GOTO lbl6
                var19_22.putFloat(var11_14).putFloat(var12_15).putFloat(var13_16).putFloat(var14_17);
                if (var25_13 || var25_13) ** GOTO lbl6
                var19_22.putFloat(var15_18).putFloat(var16_19).putFloat(var17_20).putFloat(var18_21);
                if (var25_13 || var25_13) ** GOTO lbl6
                var19_22.flip();
                if (var25_13 || var25_13) ** GOTO lbl6
                var20_23 = RenderSystem.getDevice().createCommandEncoder();
                if (var25_13 || var25_13) ** GOTO lbl6
                var20_23.writeToBuffer(kl.uniformBuffer.slice(), var19_22);
                if (var25_13 || var25_13) ** GOTO lbl6
                MemoryUtil.memFree((Buffer)var19_22);
                if (var25_13 || var25_13) ** GOTO lbl6
                var21_24 = class_310.method_1551().method_1522();
                if (var25_13 || var25_13) ** GOTO lbl6
                var22_25 = var20_23.createRenderPass((Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$draw$1(), ()Ljava/lang/String;)(), var21_24.method_71639(), OptionalInt.empty());
                if (var25_13) ** GOTO lbl6
                try {
                    if (var25_13) ** GOTO lbl6
                    var22_25.setPipeline(kl.pipeline);
                    if (var25_13 || var25_13) ** GOTO lbl6
                    var22_25.setUniform("Uniforms", kl.uniformBuffer);
                    if (var25_13 || var25_13) ** GOTO lbl6
                    var22_25.draw((int)kl.hyoc("hyts", hyog(int ), (int)76), (int)kl.hyoc("hytt", hyog(int ), (int)77));
                    if (var25_13 || var25_13) ** GOTO lbl6
                    if (var22_25 == null) ** GOTO lbl120
                    if (var25_13) ** GOTO lbl6
                }
                catch (Throwable var23_26) {
                    if (var25_13) ** GOTO lbl6
                    if (var22_25 == null) ** GOTO lbl113
                    if (var25_13) ** GOTO lbl6
                    try {
                        if (var25_13) ** GOTO lbl6
                        var22_25.close();
                        if (var25_13 || var25_13) ** GOTO lbl6
                        ** if (!var27_11) goto lbl-1000
                    }
                    catch (Throwable var24_27) {
                        if (var25_13) ** GOTO lbl6
                        var23_26.addSuppressed(var24_27);
                        if (var25_13) ** GOTO lbl6
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
lbl113:
                    // 3 sources

                    if (var25_13 || var25_13) ** GOTO lbl6
                    throw var23_26;
                }
                var22_25.close();
                if (var25_13) ** GOTO lbl6
                if (var27_11) {
                    throw null;
                }
lbl120:
                // 3 sources

                if (!var25_13 && !var25_13) ** break;
                ** continue;
                return;
            }
lbl123:
            // 2 sources

            case 0: {
                var26_12 /* !! */  = (int)kl.hyoc("hytu", hyog(int ), (int)78);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl339
            }
lbl128:
            // 2 sources

            case 1: {
                var26_12 /* !! */  = (int)kl.hyoc("hytv", hyog(int ), (int)79);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl133:
            // 3 sources

            case 2: {
                var26_12 /* !! */  = (int)kl.hyoc("hytw", hyog(int ), (int)80);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl418
            }
lbl138:
            // 3 sources

            case 3: {
                var26_12 /* !! */  = (int)kl.hyoc("hytx", hyog(int ), (int)81);
                if (var27_11) {
                    throw null;
                }
            }
lbl142:
            // 5 sources

            case 4: {
                var26_12 /* !! */  = (int)kl.hyoc("hyty", hyog(int ), (int)82);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl147:
            // 2 sources

            case 5: {
                var26_12 /* !! */  = (int)kl.hyoc("hytz", hyog(int ), (int)83);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl414
            }
lbl152:
            // 2 sources

            case 6: {
                var26_12 /* !! */  = (int)kl.hyoc("hyua", hyog(int ), (int)84);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl331
            }
lbl157:
            // 3 sources

            case 7: {
                var26_12 /* !! */  = (int)kl.hyoc("hyub", hyog(int ), (int)85);
                if (var27_11) {
                    throw null;
                }
            }
lbl161:
            // 5 sources

            case 8: {
                var26_12 /* !! */  = (int)kl.hyoc("hyuc", hyog(int ), (int)86);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl427
            }
            case 9: {
                var26_12 /* !! */  = (int)kl.hyoc("hyud", hyog(int ), (int)87);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl312
            }
lbl171:
            // 3 sources

            case 10: {
                var26_12 /* !! */  = (int)kl.hyoc("hyue", hyog(int ), (int)88);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl303
            }
lbl176:
            // 3 sources

            case 11: {
                var26_12 /* !! */  = (int)kl.hyoc("hyuf", hyog(int ), (int)89);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl455
            }
            case 12: {
                var26_12 /* !! */  = (int)kl.hyoc("hyug", hyog(int ), (int)90);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl409
            }
lbl186:
            // 2 sources

            case 13: {
                var26_12 /* !! */  = (int)kl.hyoc("hyuh", hyog(int ), (int)91);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl249
            }
            case 14: {
                var26_12 /* !! */  = (int)kl.hyoc("hyui", hyog(int ), (int)92);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl201
            }
            case 15: {
                var26_12 /* !! */  = (int)kl.hyoc("hyuj", hyog(int ), (int)93);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl244
            }
lbl201:
            // 2 sources

            case 16: {
                var26_12 /* !! */  = (int)kl.hyoc("hyuk", hyog(int ), (int)94);
                if (!var27_11) ** GOTO lbl133
                throw null;
            }
            case 17: {
                var26_12 /* !! */  = (int)kl.hyoc("hyul", hyog(int ), (int)95);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl344
            }
            case 18: {
                var26_12 /* !! */  = (int)kl.hyoc("hyum", hyog(int ), (int)96);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl483
            }
            case 19: {
                var26_12 /* !! */  = (int)kl.hyoc("hyun", hyog(int ), (int)97);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl439
            }
            case 20: {
                var26_12 /* !! */  = (int)kl.hyoc("hyuo", hyog(int ), (int)98);
                if (!var27_11) ** GOTO lbl138
                throw null;
            }
lbl224:
            // 2 sources

            case 21: {
                var26_12 /* !! */  = (int)kl.hyoc("hyup", hyog(int ), (int)99);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl431
            }
            case 22: {
                var26_12 /* !! */  = (int)kl.hyoc("hyuq", hyog(int ), (int)100);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl377
            }
lbl234:
            // 2 sources

            case 23: {
                var26_12 /* !! */  = (int)kl.hyoc("hyur", hyog(int ), (int)101);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl487
            }
            case 24: {
                var26_12 /* !! */  = (int)kl.hyoc("hyus", hyog(int ), (int)102);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl253
            }
lbl244:
            // 5 sources

            case 25: {
                var26_12 /* !! */  = (int)kl.hyoc("hyut", hyog(int ), (int)103);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl284
            }
lbl249:
            // 3 sources

            case 26: {
                var26_12 /* !! */  = (int)kl.hyoc("hyuu", hyog(int ), (int)104);
                if (!var27_11) ** GOTO lbl234
                throw null;
            }
lbl253:
            // 2 sources

            case 27: {
                var26_12 /* !! */  = (int)kl.hyoc("hyuv", hyog(int ), (int)105);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl451
            }
            case 28: {
                var26_12 /* !! */  = (int)kl.hyoc("hyuw", hyog(int ), (int)106);
                if (!var27_11) ** GOTO lbl171
                throw null;
            }
            case 29: {
                var26_12 /* !! */  = (int)kl.hyoc("hyux", hyog(int ), (int)107);
                if (!var27_11) ** GOTO lbl176
                throw null;
            }
lbl266:
            // 2 sources

            case 30: {
                var26_12 /* !! */  = (int)kl.hyoc("hyuy", hyog(int ), (int)108);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl404
            }
lbl271:
            // 2 sources

            case 31: {
                var26_12 /* !! */  = (int)kl.hyoc("hyuz", hyog(int ), (int)109);
                if (!var27_11) ** GOTO lbl133
                throw null;
            }
lbl275:
            // 2 sources

            case 32: {
                var26_12 /* !! */  = (int)kl.hyoc("hyva", hyog(int ), (int)110);
                if (!var27_11) ** GOTO lbl176
                throw null;
            }
lbl279:
            // 2 sources

            case 33: {
                var26_12 /* !! */  = (int)kl.hyoc("hyvb", hyog(int ), (int)111);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl356
            }
lbl284:
            // 3 sources

            case 34: {
                var26_12 /* !! */  = (int)kl.hyoc("hyvc", hyog(int ), (int)112);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl414
            }
lbl289:
            // 3 sources

            case 35: {
                var26_12 /* !! */  = (int)kl.hyoc("hyvd", hyog(int ), (int)113);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl447
            }
            case 36: {
                var26_12 /* !! */  = (int)kl.hyoc("hyve", hyog(int ), (int)114);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl471
            }
lbl299:
            // 3 sources

            case 37: {
                var26_12 /* !! */  = (int)kl.hyoc("hyvf", hyog(int ), (int)115);
                if (!var27_11) ** GOTO lbl289
                throw null;
            }
lbl303:
            // 2 sources

            case 38: {
                var26_12 /* !! */  = (int)kl.hyoc("hyvg", hyog(int ), (int)116);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl391
            }
            case 39: {
                var26_12 /* !! */  = (int)kl.hyoc("hyvh", hyog(int ), (int)117);
                if (!var27_11) ** GOTO lbl275
                throw null;
            }
lbl312:
            // 4 sources

            case 40: {
                var26_12 /* !! */  = (int)kl.hyoc("hyvi", hyog(int ), (int)118);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl360
            }
            case 41: {
                var26_12 /* !! */  = (int)kl.hyoc("hyvj", hyog(int ), (int)119);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl373
            }
            case 42: {
                var26_12 /* !! */  = (int)kl.hyoc("hyvk", hyog(int ), (int)120);
                if (!var27_11) ** GOTO lbl266
                throw null;
            }
            case 43: {
                var26_12 /* !! */  = (int)kl.hyoc("hyvl", hyog(int ), (int)121);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl409
            }
lbl331:
            // 2 sources

            case 44: {
                var26_12 /* !! */  = (int)kl.hyoc("hyvm", hyog(int ), (int)122);
                if (!var27_11) ** GOTO lbl161
                throw null;
            }
lbl335:
            // 2 sources

            case 45: {
                var26_12 /* !! */  = (int)kl.hyoc("hyvn", hyog(int ), (int)123);
                if (!var27_11) ** GOTO lbl249
                throw null;
            }
lbl339:
            // 2 sources

            case 46: {
                var26_12 /* !! */  = (int)kl.hyoc("hyvo", hyog(int ), (int)124);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl418
            }
lbl344:
            // 2 sources

            case 47: {
                var26_12 /* !! */  = (int)kl.hyoc("hyvp", hyog(int ), (int)125);
                if (!var27_11) ** GOTO lbl152
                throw null;
            }
            case 48: {
                var26_12 /* !! */  = (int)kl.hyoc("hyvq", hyog(int ), (int)126);
                if (!var27_11) ** GOTO lbl147
                throw null;
            }
            case 49: {
                var26_12 /* !! */  = (int)kl.hyoc("hyvr", hyog(int ), (int)127);
                if (!var27_11) ** GOTO lbl299
                throw null;
            }
lbl356:
            // 2 sources

            case 50: {
                var26_12 /* !! */  = (int)kl.hyoc("hyvs", hyog(int ), (int)128);
                if (!var27_11) ** GOTO lbl186
                throw null;
            }
lbl360:
            // 3 sources

            case 51: {
                var26_12 /* !! */  = (int)kl.hyoc("hyvt", hyog(int ), (int)129);
                if (!var27_11) ** GOTO lbl244
                throw null;
            }
lbl364:
            // 3 sources

            case 52: {
                var26_12 /* !! */  = (int)kl.hyoc("hyvu", hyog(int ), (int)130);
                if (!var27_11) ** GOTO lbl335
                throw null;
            }
            case 53: {
                var26_12 /* !! */  = (int)kl.hyoc("hyvv", hyog(int ), (int)131);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl423
            }
lbl373:
            // 2 sources

            case 54: {
                var26_12 /* !! */  = (int)kl.hyoc("hyvw", hyog(int ), (int)132);
                if (!var27_11) ** GOTO lbl299
                throw null;
            }
lbl377:
            // 2 sources

            case 55: {
                var26_12 /* !! */  = (int)kl.hyoc("hyvx", hyog(int ), (int)133);
                if (!var27_11) ** GOTO lbl138
                throw null;
            }
            case 56: {
                var26_12 /* !! */  = (int)kl.hyoc("hyvy", hyog(int ), (int)134);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl439
            }
            case 57: {
                var26_12 /* !! */  = (int)kl.hyoc("hyvz", hyog(int ), (int)135);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl409
            }
lbl391:
            // 2 sources

            case 58: {
                var26_12 /* !! */  = (int)kl.hyoc("hywa", hyog(int ), (int)136);
                if (!var27_11) ** GOTO lbl364
                throw null;
            }
lbl395:
            // 2 sources

            case 59: {
                do {
                    var26_12 /* !! */  = (int)kl.hyoc("hywb", hyog(int ), (int)137);
                } while (!var27_11);
                throw null;
            }
            case 60: {
                var26_12 /* !! */  = (int)kl.hyoc("hywc", hyog(int ), (int)138);
                if (!var27_11) ** GOTO lbl157
                throw null;
            }
lbl404:
            // 2 sources

            case 61: {
                var26_12 /* !! */  = (int)kl.hyoc("hywd", hyog(int ), (int)139);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl455
            }
lbl409:
            // 4 sources

            case 62: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var26_12 /* !! */  = (int)kl.hyoc("hywe", hyog(int ), (int)140);
                    if (!var27_11) ** GOTO lbl312
                    throw null;
                }
            }
lbl414:
            // 4 sources

            case 63: {
                var26_12 /* !! */  = (int)kl.hyoc("hywf", hyog(int ), (int)141);
                if (!var27_11) ** GOTO lbl244
                throw null;
            }
lbl418:
            // 3 sources

            case 64: {
                var26_12 /* !! */  = (int)kl.hyoc("hywg", hyog(int ), (int)142);
                if (var27_11) {
                    throw null;
                }
                ** GOTO lbl491
            }
lbl423:
            // 3 sources

            case 65: {
                var26_12 /* !! */  = (int)kl.hyoc("hywh", hyog(int ), (int)143);
                if (!var27_11) ** GOTO lbl279
                throw null;
            }
lbl427:
            // 2 sources

            case 66: {
                var26_12 /* !! */  = (int)kl.hyoc("hywi", hyog(int ), (int)144);
                if (!var27_11) ** GOTO lbl157
                throw null;
            }
lbl431:
            // 2 sources

            case 67: {
                var26_12 /* !! */  = (int)kl.hyoc("hywj", hyog(int ), (int)145);
                if (!var27_11) ** GOTO lbl423
                throw null;
            }
lbl435:
            // 2 sources

            case 68: {
                var26_12 /* !! */  = (int)kl.hyoc("hywk", hyog(int ), (int)146);
                if (!var27_11) ** GOTO lbl171
                throw null;
            }
lbl439:
            // 3 sources

            case 69: {
                var26_12 /* !! */  = (int)kl.hyoc("hywl", hyog(int ), (int)147);
                if (!var27_11) ** GOTO lbl142
                throw null;
            }
            case 70: {
                var26_12 /* !! */  = (int)kl.hyoc("hywm", hyog(int ), (int)148);
                if (!var27_11) ** GOTO lbl142
                throw null;
            }
lbl447:
            // 3 sources

            case 71: {
                var26_12 /* !! */  = (int)kl.hyoc("hywn", hyog(int ), (int)149);
                if (!var27_11) ** GOTO lbl435
                throw null;
            }
lbl451:
            // 2 sources

            case 72: {
                var26_12 /* !! */  = (int)kl.hyoc("hywo", hyog(int ), (int)150);
                if (!var27_11) ** GOTO lbl271
                throw null;
            }
lbl455:
            // 3 sources

            case 73: {
                var26_12 /* !! */  = (int)kl.hyoc("hywp", hyog(int ), (int)151);
                if (!var27_11) ** GOTO lbl128
                throw null;
            }
            case 74: {
                var26_12 /* !! */  = (int)kl.hyoc("hywq", hyog(int ), (int)152);
                if (!var27_11) ** GOTO lbl395
                throw null;
            }
            case 75: {
                var26_12 /* !! */  = (int)kl.hyoc("hywr", hyog(int ), (int)153);
                if (!var27_11) ** GOTO lbl364
                throw null;
            }
            case 76: {
                var26_12 /* !! */  = (int)kl.hyoc("hyws", hyog(int ), (int)154);
                if (!var27_11) ** GOTO lbl123
                throw null;
            }
lbl471:
            // 2 sources

            case 77: {
                var26_12 /* !! */  = (int)kl.hyoc("hywt", hyog(int ), (int)155);
                if (!var27_11) ** GOTO lbl414
                throw null;
            }
            case 78: {
                var26_12 /* !! */  = (int)kl.hyoc("hywu", hyog(int ), (int)156);
                if (!var27_11) ** GOTO lbl360
                throw null;
            }
            case 79: {
                var26_12 /* !! */  = (int)kl.hyoc("hywv", hyog(int ), (int)157);
                if (!var27_11) ** GOTO lbl312
                throw null;
            }
lbl483:
            // 2 sources

            case 80: {
                var26_12 /* !! */  = (int)kl.hyoc("hyww", hyog(int ), (int)158);
                if (!var27_11) ** GOTO lbl289
                throw null;
            }
lbl487:
            // 2 sources

            case 81: {
                var26_12 /* !! */  = (int)kl.hyoc("hywx", hyog(int ), (int)159);
                if (!var27_11) ** GOTO lbl284
                throw null;
            }
lbl491:
            // 2 sources

            case 82: {
                var26_12 /* !! */  = (int)kl.hyoc("hywy", hyog(int ), (int)160);
                if (!var27_11) ** GOTO lbl244
                throw null;
            }
            case 83: {
                var26_12 /* !! */  = (int)kl.hyoc("hywz", hyog(int ), (int)161);
                if (!var27_11) ** GOTO lbl447
                throw null;
            }
            case 84: 
        }
        var26_12 /* !! */  = (int)kl.hyoc("hyxa", hyog(int ), (int)162);
        ** while (!var27_11)
lbl502:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long hynz(int n2) {
        return hyoa[n2] ^ hyob[n2];
    }

    private static /* synthetic */ int hyog(int n2) {
        return hyoh[n2] ^ hyoi[n2];
    }

    public kl() {
    }

    private static /* synthetic */ void hyzl() {
        kl.hyoi[0] = 627665711;
        kl.hyoi[1] = 1207845672;
        kl.hyoi[2] = 2135124861;
        kl.hyoi[3] = 1201294229;
        kl.hyoi[4] = 1487755627;
        kl.hyoi[5] = 1651137632;
        kl.hyoi[6] = -1243309791;
        kl.hyoi[7] = 717837859;
        kl.hyoi[8] = -2011807416;
        kl.hyoi[9] = 2140236781;
        kl.hyoi[10] = -1804566814;
        kl.hyoi[11] = -141399487;
        kl.hyoi[12] = -832432704;
        kl.hyoi[13] = -1661025026;
        kl.hyoi[14] = -1732281592;
        kl.hyoi[15] = 703701422;
        kl.hyoi[16] = -990602402;
        kl.hyoi[17] = 639385844;
        kl.hyoi[18] = -1613630410;
        kl.hyoi[19] = 683307103;
        kl.hyoi[20] = 632354052;
        kl.hyoi[21] = -1999493673;
        kl.hyoi[22] = 522086103;
        kl.hyoi[23] = 2101698014;
        kl.hyoi[24] = 298912298;
        kl.hyoi[25] = -520874398;
        kl.hyoi[26] = 1853067043;
        kl.hyoi[27] = -818462869;
        kl.hyoi[28] = 322125274;
        kl.hyoi[29] = -1627359431;
        kl.hyoi[30] = 751770887;
        kl.hyoi[31] = -2028527015;
        kl.hyoi[32] = -112698006;
        kl.hyoi[33] = 1743515155;
        kl.hyoi[34] = 1582732490;
        kl.hyoi[35] = 872950621;
        kl.hyoi[36] = -452638991;
        kl.hyoi[37] = 521941023;
        kl.hyoi[38] = 304466411;
        kl.hyoi[39] = -780429436;
        kl.hyoi[40] = 451572783;
        kl.hyoi[41] = -739531956;
        kl.hyoi[42] = 7986823;
        kl.hyoi[43] = 1045787876;
        kl.hyoi[44] = 122583863;
        kl.hyoi[45] = -548063667;
        kl.hyoi[46] = 298795193;
        kl.hyoi[47] = 844553664;
        kl.hyoi[48] = -1300953867;
        kl.hyoi[49] = -2135766317;
        kl.hyoi[50] = 1189671953;
        kl.hyoi[51] = -1172714189;
        kl.hyoi[52] = 214148693;
        kl.hyoi[53] = 1335031849;
        kl.hyoi[54] = -691811656;
        kl.hyoi[55] = 1646709639;
        kl.hyoi[56] = 1967110153;
        kl.hyoi[57] = 1876427180;
        kl.hyoi[58] = -64910120;
        kl.hyoi[59] = -926381113;
        kl.hyoi[60] = -1934924151;
        kl.hyoi[61] = -852803461;
        kl.hyoi[62] = -2137738694;
        kl.hyoi[63] = -1241297262;
        kl.hyoi[64] = -1609220517;
        kl.hyoi[65] = -1194265494;
        kl.hyoi[66] = 1985712687;
        kl.hyoi[67] = 153034289;
        kl.hyoi[68] = -1189234540;
        kl.hyoi[69] = 1429450811;
        kl.hyoi[70] = 501493172;
        kl.hyoi[71] = 1787901932;
        kl.hyoi[72] = 74091421;
        kl.hyoi[73] = 1010685199;
        kl.hyoi[74] = -2051016752;
        kl.hyoi[75] = -519948648;
        kl.hyoi[76] = 1744290874;
        kl.hyoi[77] = -469053159;
        kl.hyoi[78] = -1906229183;
        kl.hyoi[79] = 502518388;
        kl.hyoi[80] = -1082987832;
        kl.hyoi[81] = -2015292011;
        kl.hyoi[82] = 74589271;
        kl.hyoi[83] = -1688057290;
        kl.hyoi[84] = -1261651770;
        kl.hyoi[85] = 352385016;
        kl.hyoi[86] = 120531486;
        kl.hyoi[87] = -722810528;
        kl.hyoi[88] = -1024318826;
        kl.hyoi[89] = -1964772759;
        kl.hyoi[90] = -634525246;
        kl.hyoi[91] = -171876393;
        kl.hyoi[92] = -664422013;
        kl.hyoi[93] = -666175633;
        kl.hyoi[94] = 630876463;
        kl.hyoi[95] = 106323637;
        kl.hyoi[96] = -1015109115;
        kl.hyoi[97] = -382612246;
        kl.hyoi[98] = -75756040;
        kl.hyoi[99] = -768332195;
    }

    static {
        hyoi = new int[196];
        kl.hyzj();
        kl.hyzk();
        kl.hyzl();
        kl.hyzm();
        hyoa = new long[92];
        hyob = new long[92];
        kl.hyzn();
        kl.hyzo();
    }

    private static /* synthetic */ void hyzm() {
        kl.hyoi[100] = 312662596;
        kl.hyoi[101] = -257383865;
        kl.hyoi[102] = 1446857081;
        kl.hyoi[103] = -1784942128;
        kl.hyoi[104] = 606465242;
        kl.hyoi[105] = 200562159;
        kl.hyoi[106] = 717185854;
        kl.hyoi[107] = -1007121602;
        kl.hyoi[108] = -1949357091;
        kl.hyoi[109] = -311878144;
        kl.hyoi[110] = 955647398;
        kl.hyoi[111] = 2040845792;
        kl.hyoi[112] = -1012621285;
        kl.hyoi[113] = 75139134;
        kl.hyoi[114] = 127692995;
        kl.hyoi[115] = 368781572;
        kl.hyoi[116] = -491136857;
        kl.hyoi[117] = -2135489205;
        kl.hyoi[118] = -1806665852;
        kl.hyoi[119] = 191985769;
        kl.hyoi[120] = 598025876;
        kl.hyoi[121] = -166431978;
        kl.hyoi[122] = 1199418134;
        kl.hyoi[123] = -1142512180;
        kl.hyoi[124] = -1255780096;
        kl.hyoi[125] = 1700158097;
        kl.hyoi[126] = 1564825734;
        kl.hyoi[127] = -1669670974;
        kl.hyoi[128] = 1052116308;
        kl.hyoi[129] = 44946598;
        kl.hyoi[130] = -935969622;
        kl.hyoi[131] = 1469442504;
        kl.hyoi[132] = -798652471;
        kl.hyoi[133] = -2109846933;
        kl.hyoi[134] = 1383141953;
        kl.hyoi[135] = 39602584;
        kl.hyoi[136] = -2048235475;
        kl.hyoi[137] = -1523481453;
        kl.hyoi[138] = -1945805223;
        kl.hyoi[139] = 503567805;
        kl.hyoi[140] = -534102298;
        kl.hyoi[141] = -1648837081;
        kl.hyoi[142] = -1406918928;
        kl.hyoi[143] = 981438825;
        kl.hyoi[144] = -346638793;
        kl.hyoi[145] = -67129738;
        kl.hyoi[146] = -1803796514;
        kl.hyoi[147] = -267239034;
        kl.hyoi[148] = 1642750913;
        kl.hyoi[149] = -1125007798;
        kl.hyoi[150] = 1827600881;
        kl.hyoi[151] = 633685770;
        kl.hyoi[152] = -1831127475;
        kl.hyoi[153] = -989799332;
        kl.hyoi[154] = 557145;
        kl.hyoi[155] = 1824672399;
        kl.hyoi[156] = 1532984264;
        kl.hyoi[157] = 1075881225;
        kl.hyoi[158] = -259284922;
        kl.hyoi[159] = -1587311326;
        kl.hyoi[160] = -1091648626;
        kl.hyoi[161] = -1272983228;
        kl.hyoi[162] = -1004194097;
        kl.hyoi[163] = -424337202;
        kl.hyoi[164] = 1900454165;
        kl.hyoi[165] = 1546924965;
        kl.hyoi[166] = -596342104;
        kl.hyoi[167] = -222181890;
        kl.hyoi[168] = 1432093816;
        kl.hyoi[169] = -1111589779;
        kl.hyoi[170] = -935134993;
        kl.hyoi[171] = 237340789;
        kl.hyoi[172] = 1713685044;
        kl.hyoi[173] = 581020107;
        kl.hyoi[174] = 1338437044;
        kl.hyoi[175] = -891110425;
        kl.hyoi[176] = 230272590;
        kl.hyoi[177] = 820445405;
        kl.hyoi[178] = -231818922;
        kl.hyoi[179] = 1203698295;
        kl.hyoi[180] = -212623898;
        kl.hyoi[181] = -1192490957;
        kl.hyoi[182] = 721777727;
        kl.hyoi[183] = -1511595197;
        kl.hyoi[184] = -459575805;
        kl.hyoi[185] = 1490329781;
        kl.hyoi[186] = 1807740196;
        kl.hyoi[187] = -858513800;
        kl.hyoi[188] = 873761255;
        kl.hyoi[189] = -1306098743;
        kl.hyoi[190] = -869637231;
        kl.hyoi[191] = 174118548;
        kl.hyoi[192] = -1413963337;
        kl.hyoi[193] = -64377712;
        kl.hyoi[194] = -1175347549;
        kl.hyoi[195] = 1137233490;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String lambda$init$0() {
        block29: {
            v0 /* !! */  = kl.pe;
            if (true) ** GOTO lbl5
            block21: while (true) {
                v0 /* !! */  = (long)(v1 - kl.hyoc("hyyw", hynz(int ), (int)83));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1491672282: {
                        break block21;
                    }
                    case -1219138951: {
                        v1 = kl.hyoc("hyyx", hynz(int ), (int)84);
                        continue block21;
                    }
                    case 1654203859: {
                        v1 = kl.hyoc("hyyy", hynz(int ), (int)85);
                        continue block21;
                    }
                }
                break;
            }
            var2 = kl.c;
            v2 /* !! */  = kl.pe;
            if (true) ** GOTO lbl19
            block22: while (true) {
                v2 /* !! */  = (long)(v3 - kl.hyoc("hyyz", hynz(int ), (int)86));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1491672282: {
                        break block22;
                    }
                    case -1129072909: {
                        v3 = kl.hyoc("hyza", hynz(int ), (int)87);
                        continue block22;
                    }
                    case 1676812308: {
                        v3 = kl.hyoc("hyzb", hynz(int ), (int)88);
                        continue block22;
                    }
                }
                break;
            }
            var1_1 /* !! */  = kl.b;
            v4 /* !! */  = kl.pe;
            if (true) ** GOTO lbl33
            block23: while (true) {
                v4 /* !! */  = (long)(v5 - kl.hyoc("hyzc", hynz(int ), (int)89));
lbl33:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -1491672282: {
                        break block23;
                    }
                    case -571513150: {
                        v5 = kl.hyoc("hyzd", hynz(int ), (int)90);
                        continue block23;
                    }
                    case -259638632: {
                        v5 = kl.hyoc("hyze", hynz(int ), (int)91);
                        continue block23;
                    }
                }
                break;
            }
            var0_2 = kl.a;
            if (var2) {
                throw null;
            }
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block24: do {
                switch (cfr_temp_0 == -2147483648 ? var1_1 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var0_2 || var0_2) {
                            return null;
                        }
                        return "ArcOutline2D Uniforms";
                    }
                    case 0: {
                        var1_1 /* !! */  = (int)kl.hyoc("hyzf", hyog(int ), (int)192);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 1: {
                        ** break;
                    }
                    case 3: {
                        break block29;
                    }
lbl61:
                    // 2 sources

                    while (true) {
                        var1_1 /* !! */  = (int)kl.hyoc("hyzg", hyog(int ), (int)193);
                        cfr_temp_0 = 2;
                        if (!var2) continue block24;
                        throw null;
                    }
                    case 2: 
                }
                break;
            } while (true);
            var1_1 /* !! */  = (int)kl.hyoc("hyzh", hyog(int ), (int)194);
            if (!var2) ** break;
            throw null;
        }
        var1_1 /* !! */  = (int)kl.hyoc("hyzi", hyog(int ), (int)195);
        ** while (!var2)
lbl75:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$draw$1() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kl.pe - kl.hyoc("hyyk", hynz(int ), (int)79)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == kl.hyoc("hyyl", hyog(int ), (int)184)) break;
            v0 /* !! */  = (long)kl.hyoc("hyym", hyog(int ), (int)185);
        }
        var2 = kl.c;
        v1 /* !! */  = kl.pe;
        if (true) ** GOTO lbl12
        block11: while (true) {
            v1 /* !! */  = (long)(kl.hyoc("hyyo", hynz(int ), (int)81) - kl.hyoc("hyyn", hynz(int ), (int)80));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1491672282: {
                    break block11;
                }
                case 1505132161: {
                    continue block11;
                }
            }
            break;
        }
        var1_1 /* !! */  = kl.b;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = kl.pe - kl.hyoc("hyyp", hynz(int ), (int)82)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == kl.hyoc("hyyq", hyog(int ), (int)186)) break;
                    v2 /* !! */  = (long)kl.hyoc("hyyr", hyog(int ), (int)187);
                }
                var0_2 = kl.a;
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                return "ArcOutline2D";
            }
            case 0: {
                do {
                    var1_1 /* !! */  = (int)kl.hyoc("hyys", hyog(int ), (int)188);
                } while (!var2);
                throw null;
            }
lbl39:
            // 2 sources

            case 1: {
                var1_1 /* !! */  = (int)kl.hyoc("hyyt", hyog(int ), (int)189);
                if (var2) {
                    throw null;
                }
            }
            case 2: {
                var1_1 /* !! */  = (int)kl.hyoc("hyyu", hyog(int ), (int)190);
                if (!var2) ** GOTO lbl39
                throw null;
            }
            case 3: 
        }
        do {
            var1_1 /* !! */  = (int)kl.hyoc("hyyv", hyog(int ), (int)191);
        } while (!var2);
        throw null;
    }

    private static /* synthetic */ void hyzk() {
        kl.hyoh[100] = 312662595;
        kl.hyoh[101] = -257383821;
        kl.hyoh[102] = 1446857052;
        kl.hyoh[103] = -1784942131;
        kl.hyoh[104] = 606465263;
        kl.hyoh[105] = 200562149;
        kl.hyoh[106] = 717185818;
        kl.hyoh[107] = -1007121542;
        kl.hyoh[108] = -1949357095;
        kl.hyoh[109] = -311878105;
        kl.hyoh[110] = 955647422;
        kl.hyoh[111] = 2040845804;
        kl.hyoh[112] = -1012621253;
        kl.hyoh[113] = 75139109;
        kl.hyoh[114] = 127692946;
        kl.hyoh[115] = 368781617;
        kl.hyoh[116] = -491136845;
        kl.hyoh[117] = -2135489215;
        kl.hyoh[118] = -1806665822;
        kl.hyoh[119] = 191985701;
        kl.hyoh[120] = 598025862;
        kl.hyoh[121] = -166431955;
        kl.hyoh[122] = 1199418175;
        kl.hyoh[123] = -1142512158;
        kl.hyoh[124] = -1255780081;
        kl.hyoh[125] = 1700158093;
        kl.hyoh[126] = 1564825748;
        kl.hyoh[127] = -1669671025;
        kl.hyoh[128] = 1052116333;
        kl.hyoh[129] = 44946670;
        kl.hyoh[130] = -935969544;
        kl.hyoh[131] = 1469442535;
        kl.hyoh[132] = -798652464;
        kl.hyoh[133] = -2109846996;
        kl.hyoh[134] = 1383142003;
        kl.hyoh[135] = 39602596;
        kl.hyoh[136] = -2048235395;
        kl.hyoh[137] = -1523481418;
        kl.hyoh[138] = -1945805206;
        kl.hyoh[139] = 503567855;
        kl.hyoh[140] = -534102353;
        kl.hyoh[141] = -1648837021;
        kl.hyoh[142] = -1406918945;
        kl.hyoh[143] = 981438812;
        kl.hyoh[144] = -346638809;
        kl.hyoh[145] = -67129768;
        kl.hyoh[146] = -1803796489;
        kl.hyoh[147] = -267239021;
        kl.hyoh[148] = 1642750869;
        kl.hyoh[149] = -1125007771;
        kl.hyoh[150] = 1827600834;
        kl.hyoh[151] = 633685777;
        kl.hyoh[152] = -1831127444;
        kl.hyoh[153] = -989799335;
        kl.hyoh[154] = 557074;
        kl.hyoh[155] = 1824672458;
        kl.hyoh[156] = 1532984218;
        kl.hyoh[157] = 1075881275;
        kl.hyoh[158] = -259284919;
        kl.hyoh[159] = -1587311299;
        kl.hyoh[160] = -1091648610;
        kl.hyoh[161] = -1272983195;
        kl.hyoh[162] = -1004194111;
        kl.hyoh[163] = 424337201;
        kl.hyoh[164] = 1210936609;
        kl.hyoh[165] = -1546924966;
        kl.hyoh[166] = -1319248644;
        kl.hyoh[167] = 222181889;
        kl.hyoh[168] = -1710840852;
        kl.hyoh[169] = 1111589778;
        kl.hyoh[170] = 269626197;
        kl.hyoh[171] = 237340798;
        kl.hyoh[172] = 1713685046;
        kl.hyoh[173] = 581020107;
        kl.hyoh[174] = 1338437046;
        kl.hyoh[175] = -891110431;
        kl.hyoh[176] = 230272591;
        kl.hyoh[177] = 820445403;
        kl.hyoh[178] = -231818926;
        kl.hyoh[179] = 1203698292;
        kl.hyoh[180] = -212623891;
        kl.hyoh[181] = -1192490952;
        kl.hyoh[182] = 721777724;
        kl.hyoh[183] = -1511595190;
        kl.hyoh[184] = 459575804;
        kl.hyoh[185] = -1045024791;
        kl.hyoh[186] = -1807740197;
        kl.hyoh[187] = 148874303;
        kl.hyoh[188] = 873761254;
        kl.hyoh[189] = -1306098742;
        kl.hyoh[190] = -869637229;
        kl.hyoh[191] = 174118551;
        kl.hyoh[192] = -1413963337;
        kl.hyoh[193] = -64377712;
        kl.hyoh[194] = -1175347551;
        kl.hyoh[195] = 1137233491;
    }

    private static /* synthetic */ void hyzj() {
        kl.hyoh[0] = -627665712;
        kl.hyoh[1] = -236460199;
        kl.hyoh[2] = -2135124862;
        kl.hyoh[3] = 1358622034;
        kl.hyoh[4] = -1487755628;
        kl.hyoh[5] = 1176983975;
        kl.hyoh[6] = -1243309792;
        kl.hyoh[7] = -548288590;
        kl.hyoh[8] = 2011807415;
        kl.hyoh[9] = 0xEE5EE4E;
        kl.hyoh[10] = -1804566813;
        kl.hyoh[11] = -2106414454;
        kl.hyoh[12] = 832432703;
        kl.hyoh[13] = -222391369;
        kl.hyoh[14] = 1732281591;
        kl.hyoh[15] = -1618712047;
        kl.hyoh[16] = 990602401;
        kl.hyoh[17] = 12215869;
        kl.hyoh[18] = -1613630409;
        kl.hyoh[19] = -1439579685;
        kl.hyoh[20] = -632354053;
        kl.hyoh[21] = 338295566;
        kl.hyoh[22] = 522086102;
        kl.hyoh[23] = -1034221215;
        kl.hyoh[24] = 298912298;
        kl.hyoh[25] = 520874397;
        kl.hyoh[26] = -881392891;
        kl.hyoh[27] = -818462749;
        kl.hyoh[28] = 322125275;
        kl.hyoh[29] = -1239740714;
        kl.hyoh[30] = -751770888;
        kl.hyoh[31] = -658779111;
        kl.hyoh[32] = -112698005;
        kl.hyoh[33] = -1720527499;
        kl.hyoh[34] = 1582732480;
        kl.hyoh[35] = 872950611;
        kl.hyoh[36] = -452638990;
        kl.hyoh[37] = 521941011;
        kl.hyoh[38] = 304466405;
        kl.hyoh[39] = -780429430;
        kl.hyoh[40] = 451572782;
        kl.hyoh[41] = -739531940;
        kl.hyoh[42] = 7986838;
        kl.hyoh[43] = 1045787880;
        kl.hyoh[44] = 122583862;
        kl.hyoh[45] = -548063677;
        kl.hyoh[46] = 298795193;
        kl.hyoh[47] = 844553670;
        kl.hyoh[48] = -1300953858;
        kl.hyoh[49] = -2135766313;
        kl.hyoh[50] = 1189671936;
        kl.hyoh[51] = -1172714179;
        kl.hyoh[52] = 214148677;
        kl.hyoh[53] = 1335032022;
        kl.hyoh[54] = -1782789448;
        kl.hyoh[55] = 1646709647;
        kl.hyoh[56] = 1967110390;
        kl.hyoh[57] = 749142444;
        kl.hyoh[58] = -64910297;
        kl.hyoh[59] = -1950905401;
        kl.hyoh[60] = -1934924143;
        kl.hyoh[61] = -852803452;
        kl.hyoh[62] = -1007963590;
        kl.hyoh[63] = -1241297278;
        kl.hyoh[64] = -1609220444;
        kl.hyoh[65] = -72354710;
        kl.hyoh[66] = 1985712679;
        kl.hyoh[67] = 153034446;
        kl.hyoh[68] = -94193516;
        kl.hyoh[69] = 1429450948;
        kl.hyoh[70] = 1587228084;
        kl.hyoh[71] = 1787901940;
        kl.hyoh[72] = 74091362;
        kl.hyoh[73] = 2135086351;
        kl.hyoh[74] = -2051016848;
        kl.hyoh[75] = -519948584;
        kl.hyoh[76] = 1744290874;
        kl.hyoh[77] = -469053153;
        kl.hyoh[78] = -1906229182;
        kl.hyoh[79] = 502518322;
        kl.hyoh[80] = -1082987894;
        kl.hyoh[81] = -2015291952;
        kl.hyoh[82] = 74589202;
        kl.hyoh[83] = -1688057323;
        kl.hyoh[84] = -1261651838;
        kl.hyoh[85] = 352384964;
        kl.hyoh[86] = 120531507;
        kl.hyoh[87] = -722810556;
        kl.hyoh[88] = -1024318820;
        kl.hyoh[89] = -1964772825;
        kl.hyoh[90] = -634525192;
        kl.hyoh[91] = -171876396;
        kl.hyoh[92] = -664421967;
        kl.hyoh[93] = -666175641;
        kl.hyoh[94] = 630876478;
        kl.hyoh[95] = 106323632;
        kl.hyoh[96] = -1015109081;
        kl.hyoh[97] = -382612278;
        kl.hyoh[98] = -75756101;
        kl.hyoh[99] = -768332181;
    }

    private static /* synthetic */ void hyzn() {
        kl.hyoa[0] = 3710517056128578498L;
        kl.hyoa[1] = -2351034595522795392L;
        kl.hyoa[2] = -918950745635829112L;
        kl.hyoa[3] = 7046017622861384289L;
        kl.hyoa[4] = -4607069104283871795L;
        kl.hyoa[5] = -8798482034189875521L;
        kl.hyoa[6] = 4349338376887173230L;
        kl.hyoa[7] = 2924003761014538433L;
        kl.hyoa[8] = -3833311871498231487L;
        kl.hyoa[9] = 7679017713104147257L;
        kl.hyoa[10] = -4220359748340134375L;
        kl.hyoa[11] = 1848611064872295285L;
        kl.hyoa[12] = 6169056415333307443L;
        kl.hyoa[13] = -5670825682197218991L;
        kl.hyoa[14] = -557208165769187096L;
        kl.hyoa[15] = 5371264721212056318L;
        kl.hyoa[16] = -5277658469732400709L;
        kl.hyoa[17] = -6609483142608657877L;
        kl.hyoa[18] = 7098751473900875626L;
        kl.hyoa[19] = -3202078370819469420L;
        kl.hyoa[20] = -3443160656348536108L;
        kl.hyoa[21] = -6851006025150292994L;
        kl.hyoa[22] = 1484740908251382435L;
        kl.hyoa[23] = -3257958874128127066L;
        kl.hyoa[24] = 46297293663457098L;
        kl.hyoa[25] = 6446516199796830341L;
        kl.hyoa[26] = -1230018294909948973L;
        kl.hyoa[27] = -3717866103199350691L;
        kl.hyoa[28] = -7888753534262037503L;
        kl.hyoa[29] = -6617920021507712745L;
        kl.hyoa[30] = -4166361187382057574L;
        kl.hyoa[31] = -1405077567328838017L;
        kl.hyoa[32] = 1141244402147596502L;
        kl.hyoa[33] = -7834779470100922410L;
        kl.hyoa[34] = 4558995832504966229L;
        kl.hyoa[35] = -5106548306223360481L;
        kl.hyoa[36] = 315136995298997648L;
        kl.hyoa[37] = -6769653867585928671L;
        kl.hyoa[38] = -5242680563110798474L;
        kl.hyoa[39] = 2655898802245902885L;
        kl.hyoa[40] = 5942171174818268867L;
        kl.hyoa[41] = -7899388765323641481L;
        kl.hyoa[42] = -3813199825887815484L;
        kl.hyoa[43] = 1494084917006331477L;
        kl.hyoa[44] = 7651946673894047041L;
        kl.hyoa[45] = -3533256510012038170L;
        kl.hyoa[46] = -1568649815746547672L;
        kl.hyoa[47] = 8617018043602865363L;
        kl.hyoa[48] = -8639464977950625466L;
        kl.hyoa[49] = -5139666868891298815L;
        kl.hyoa[50] = 3086058536349694109L;
        kl.hyoa[51] = -5538656980450312487L;
        kl.hyoa[52] = 4886813282445679754L;
        kl.hyoa[53] = -222974234046794661L;
        kl.hyoa[54] = -5823926810884637148L;
        kl.hyoa[55] = -3471029416497130178L;
        kl.hyoa[56] = 8838790937070098372L;
        kl.hyoa[57] = -4765388924832783151L;
        kl.hyoa[58] = -5748273789632977260L;
        kl.hyoa[59] = -753441504292668793L;
        kl.hyoa[60] = -8572751829429065381L;
        kl.hyoa[61] = -8875154295537154271L;
        kl.hyoa[62] = -6069894510428142275L;
        kl.hyoa[63] = 7785652722011505693L;
        kl.hyoa[64] = -4085911899618876076L;
        kl.hyoa[65] = 1398311029034636564L;
        kl.hyoa[66] = 3892237841898939937L;
        kl.hyoa[67] = 4962034091709254298L;
        kl.hyoa[68] = 1014883750995908980L;
        kl.hyoa[69] = 2081737279787379771L;
        kl.hyoa[70] = -1651242883436888070L;
        kl.hyoa[71] = -8777333827289099747L;
        kl.hyoa[72] = 2610550206879681893L;
        kl.hyoa[73] = -1296378065981545934L;
        kl.hyoa[74] = 5974097993154385774L;
        kl.hyoa[75] = 4481205921518647861L;
        kl.hyoa[76] = -8881091791542746642L;
        kl.hyoa[77] = -1919604869402790391L;
        kl.hyoa[78] = -4402585545364494233L;
        kl.hyoa[79] = 8841472294477108092L;
        kl.hyoa[80] = -1028850998178471861L;
        kl.hyoa[81] = 2650413448999299998L;
        kl.hyoa[82] = 5417017132906434372L;
        kl.hyoa[83] = -5208438831874302707L;
        kl.hyoa[84] = 4600438148015561137L;
        kl.hyoa[85] = 3058339425054268389L;
        kl.hyoa[86] = -7707779757004194240L;
        kl.hyoa[87] = -6689228704245982640L;
        kl.hyoa[88] = -6608774166845570377L;
        kl.hyoa[89] = 617058727315142447L;
        kl.hyoa[90] = -6401836357563131760L;
        kl.hyoa[91] = -1036825890821585557L;
    }

    private static /* synthetic */ void hyzo() {
        kl.hyob[0] = -8713974093155229128L;
        kl.hyob[1] = -5412305228733768584L;
        kl.hyob[2] = -8429838015314839907L;
        kl.hyob[3] = 8320390008753148303L;
        kl.hyob[4] = 2420526748100334646L;
        kl.hyob[5] = -6051396828249376054L;
        kl.hyob[6] = 2718681174709686107L;
        kl.hyob[7] = -2493789166857698898L;
        kl.hyob[8] = 545494511204567638L;
        kl.hyob[9] = -2849932375216678936L;
        kl.hyob[10] = 1971722089929386030L;
        kl.hyob[11] = -2381245326329125395L;
        kl.hyob[12] = 6683592601353991269L;
        kl.hyob[13] = 6347546376352837728L;
        kl.hyob[14] = -949505820710059L;
        kl.hyob[15] = -1854865149900408671L;
        kl.hyob[16] = -6714149960226722464L;
        kl.hyob[17] = -811966647950680597L;
        kl.hyob[18] = -6981294263026874120L;
        kl.hyob[19] = -6269863372507210777L;
        kl.hyob[20] = -7376919646468453117L;
        kl.hyob[21] = -2668388675385071524L;
        kl.hyob[22] = -6960264708828619948L;
        kl.hyob[23] = -1277344902487171315L;
        kl.hyob[24] = -3668121999640078957L;
        kl.hyob[25] = 2541685610350945244L;
        kl.hyob[26] = 1944491289798622681L;
        kl.hyob[27] = -2815743569632620761L;
        kl.hyob[28] = 806216799070716448L;
        kl.hyob[29] = 8739257167307854579L;
        kl.hyob[30] = 8337429183542833509L;
        kl.hyob[31] = -1384063197746943933L;
        kl.hyob[32] = 1106924755540677903L;
        kl.hyob[33] = 7824747339868398732L;
        kl.hyob[34] = -1753640526429805082L;
        kl.hyob[35] = 5758468801815798049L;
        kl.hyob[36] = 183868387923574167L;
        kl.hyob[37] = -8601571391888221768L;
        kl.hyob[38] = -960754331647751654L;
        kl.hyob[39] = -4669501969483794154L;
        kl.hyob[40] = -3657708453748165220L;
        kl.hyob[41] = 7114832528917372994L;
        kl.hyob[42] = -8894324837499394579L;
        kl.hyob[43] = 6548971460909184686L;
        kl.hyob[44] = 1507652967383286233L;
        kl.hyob[45] = -3890831976025241944L;
        kl.hyob[46] = -3523032658187751989L;
        kl.hyob[47] = -5621110511116436954L;
        kl.hyob[48] = 8555626968819185180L;
        kl.hyob[49] = 3412437373452510975L;
        kl.hyob[50] = 6142186946928025940L;
        kl.hyob[51] = -5538656980450312583L;
        kl.hyob[52] = -3834316731784111112L;
        kl.hyob[53] = -632705637256392245L;
        kl.hyob[54] = 1578314945576230961L;
        kl.hyob[55] = 7528780830281160190L;
        kl.hyob[56] = 5267461187532316787L;
        kl.hyob[57] = 2032989690018926671L;
        kl.hyob[58] = 8779705412618853302L;
        kl.hyob[59] = -5621277070345608074L;
        kl.hyob[60] = -8347359619710927815L;
        kl.hyob[61] = 3590856327881609396L;
        kl.hyob[62] = 1525046035548647052L;
        kl.hyob[63] = 5626323725558917105L;
        kl.hyob[64] = 5311875969013938556L;
        kl.hyob[65] = 1997331427367592171L;
        kl.hyob[66] = -1192020499616788003L;
        kl.hyob[67] = 1162787410921950750L;
        kl.hyob[68] = 3040500091649113641L;
        kl.hyob[69] = 8571056496306029154L;
        kl.hyob[70] = 1848736326313303087L;
        kl.hyob[71] = -8257491059024053283L;
        kl.hyob[72] = -3918143652204241810L;
        kl.hyob[73] = 6922023464406976519L;
        kl.hyob[74] = 5576013661798694166L;
        kl.hyob[75] = 5196818648634395811L;
        kl.hyob[76] = 8590939803757812732L;
        kl.hyob[77] = -2932689997750302350L;
        kl.hyob[78] = 3563703662355034877L;
        kl.hyob[79] = 8573101899611156459L;
        kl.hyob[80] = 6311256169555693394L;
        kl.hyob[81] = 1297063985788569628L;
        kl.hyob[82] = -6761633290102218598L;
        kl.hyob[83] = 6127755487052446965L;
        kl.hyob[84] = 3955049976849177690L;
        kl.hyob[85] = 6569368089271443886L;
        kl.hyob[86] = -1292549566793055902L;
        kl.hyob[87] = 6523244419035785658L;
        kl.hyob[88] = -9176494901147001141L;
        kl.hyob[89] = 2122011300724676359L;
        kl.hyob[90] = 9184276248002723918L;
        kl.hyob[91] = 2068258573154592989L;
    }

    /*
     * Exception decompiling
     */
    public static void init() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 46[SWITCH]
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
}

