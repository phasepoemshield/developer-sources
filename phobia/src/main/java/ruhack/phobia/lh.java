/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.pipeline.BlendFunction
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Snippet
 *  com.mojang.blaze3d.platform.DepthTestFunction
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  net.minecraft.class_10789
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  org.joml.Matrix4f
 *  org.lwjgl.system.MemoryUtil
 */
package ruhack.phobia;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.BlendFunction;
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
import net.minecraft.class_2960;
import net.minecraft.class_310;
import org.joml.Matrix4f;
import org.lwjgl.system.MemoryUtil;

public final class lh {
    public static final int b;
    private static long[] ifay;
    private static RenderPipeline pipeline;
    public static final boolean c;
    private static long[] ifaz;
    private static int[] ifaq;
    private static final int UNIFORM_SIZE = 160;
    static final long po = -5892369591933726022L;
    public static final boolean a;
    private static GpuBuffer uniformBuffer;
    private static int[] ifar;
    private static ByteBuffer uniformData;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$init$0() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lh.po - lh.ifas("ifyq", ifax(int ), (int)82)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == lh.ifas("ifyr", ifap(int ), (int)200)) break;
            v0 /* !! */  = (long)lh.ifas("ifyt", ifap(int ), (int)201);
        }
        var2 = lh.c;
        v1 /* !! */  = lh.po;
        if (true) ** GOTO lbl12
        block16: while (true) {
            v1 /* !! */  = (long)(v2 - lh.ifas("ifyu", ifax(int ), (int)83));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -404197052: {
                    v2 = lh.ifas("ifyv", ifax(int ), (int)84);
                    continue block16;
                }
                case 698311190: {
                    v2 = lh.ifas("ifyx", ifax(int ), (int)85);
                    continue block16;
                }
                case 1132073658: {
                    break block16;
                }
            }
            break;
        }
        var1_1 /* !! */  = lh.b;
        v3 /* !! */  = lh.po;
        if (true) ** GOTO lbl26
        block17: while (true) {
            v3 /* !! */  = (long)(lh.ifas("ifza", ifax(int ), (int)87) - lh.ifas("ifyz", ifax(int ), (int)86));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -13962001: {
                    continue block17;
                }
                case 1132073658: {
                    break block17;
                }
            }
            break;
        }
        var0_2 = lh.a;
        if (!var2) ** GOTO lbl38
        throw null;
        {
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var1_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl38:
                // 1 sources

                if (var0_2 || var0_2) continue block18;
                return "SegmentedRing2D Uniforms";
                case 0: {
                    do {
                        var1_1 /* !! */  = (int)lh.ifas("ifzd", ifap(int ), (int)202);
                    } while (!var2);
                    throw null;
                }
lbl45:
                // 2 sources

                case 1: {
                    do {
                        var1_1 /* !! */  = (int)lh.ifas("ifzf", ifap(int ), (int)203);
                    } while (!var2);
                    throw null;
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var1_1 /* !! */  = (int)lh.ifas("ifzg", ifap(int ), (int)204);
                        if (!var2) ** GOTO lbl45
                        throw null;
                    }
                }
                case 3: 
            }
        }
        var1_1 /* !! */  = (int)lh.ifas("ifzi", ifap(int ), (int)205);
        ** while (!var2)
lbl58:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long ifax(int n2) {
        return ifay[n2] ^ ifaz[n2];
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static void init() {
        block134: {
            v0 /* !! */  = lh.po;
            if (true) ** GOTO lbl5
            block78: while (true) {
                v0 /* !! */  = (long)(v1 - lh.ifas("ifba", ifax(int ), (int)0));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1784424189: {
                        v1 = lh.ifas("ifbb", ifax(int ), (int)1);
                        continue block78;
                    }
                    case 1132073658: {
                        break block78;
                    }
                    case 2020806981: {
                        v1 = lh.ifas("ifbc", ifax(int ), (int)2);
                        continue block78;
                    }
                }
                break;
            }
            var2 = lh.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_1 = lh.po - lh.ifas("ifbd", ifax(int ), (int)3)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == lh.ifas("ifbe", ifap(int ), (int)3)) break;
                v2 /* !! */  = (long)lh.ifas("ifbf", ifap(int ), (int)4);
            }
            var1_1 /* !! */  = lh.b;
            v3 /* !! */  = lh.po;
            block80: while (true) {
                switch ((int)v3 /* !! */ ) {
                    case -709709331: {
                        v3 /* !! */  = (long)(lh.ifas("ifbh", ifax(int ), (int)5) - lh.ifas("ifbg", ifax(int ), (int)4));
                        continue block80;
                    }
                    case 1132073658: {
                        break block80;
                    }
                }
                break;
            }
            var0_2 = lh.a;
            if (var2) {
                throw null;
            }
            if (var0_2 || var0_2) return;
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = lh.po - lh.ifas("ifbi", ifax(int ), (int)6)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == lh.ifas("ifbj", ifap(int ), (int)5)) {
                    if (lh.pipeline != null) {
                        break;
                    }
                    break block134;
                }
                v4 /* !! */  = (long)lh.ifas("ifbk", ifap(int ), (int)6);
            }
            if (var0_2) return;
            return;
        }
        if (var0_2 || var0_2) return;
        v5 = new RenderPipeline.Snippet[]{};
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_3 = lh.po - lh.ifas("ifbl", ifax(int ), (int)7)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == lh.ifas("ifbm", ifap(int ), (int)7)) break;
            v6 /* !! */  = (long)lh.ifas("ifbo", ifap(int ), (int)8);
        }
        v7 = RenderPipeline.builder((RenderPipeline.Snippet[])v5);
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_4 = lh.po - lh.ifas("ifbp", ifax(int ), (int)8)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == lh.ifas("ifbq", ifap(int ), (int)9)) break;
            v8 /* !! */  = (long)lh.ifas("ifbr", ifap(int ), (int)10);
        }
        v9 = class_2960.method_60655((String)"phobia", (String)"segmented_ring");
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_5 = lh.po - lh.ifas("ifbs", ifax(int ), (int)9)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == lh.ifas("ifbt", ifap(int ), (int)11)) break;
            v10 /* !! */  = (long)lh.ifas("ifbu", ifap(int ), (int)12);
        }
        v11 = v7.withLocation(v9);
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_6 = lh.po - lh.ifas("ifch", ifax(int ), (int)10)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == lh.ifas("ifcj", ifap(int ), (int)13)) break;
            v12 /* !! */  = (long)lh.ifas("ifck", ifap(int ), (int)14);
        }
        v13 = class_2960.method_60655((String)"phobia", (String)"segmented_ring_vertex");
        while (true) {
            block135: {
                if ((v14 /* !! */  = (cfr_temp_7 = lh.po - lh.ifas("ifcl", ifax(int ), (int)11)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  != lh.ifas("ifcm", ifap(int ), (int)15)) break block135;
                v15 = v11.withVertexShader(v13);
                v16 /* !! */  = lh.po;
                if (true) ** GOTO lbl81
            }
            v14 /* !! */  = (long)lh.ifas("ifcn", ifap(int ), (int)16);
        }
        block87: while (true) {
            v16 /* !! */  = (long)(v17 - lh.ifas("ifco", ifax(int ), (int)12));
lbl81:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case -1555779832: {
                    v17 = lh.ifas("ifcp", ifax(int ), (int)13);
                    continue block87;
                }
                case -904000290: {
                    v17 = lh.ifas("ifcq", ifax(int ), (int)14);
                    continue block87;
                }
                case 1132073658: {
                    break block87;
                }
            }
            break;
        }
        v18 = class_2960.method_60655((String)"phobia", (String)"segmented_ring_fragment");
        v19 /* !! */  = lh.po;
        block88: while (true) {
            switch ((int)v19 /* !! */ ) {
                case -915789628: {
                    v19 /* !! */  = (long)(lh.ifas("ifct", ifax(int ), (int)16) - lh.ifas("ifcr", ifax(int ), (int)15));
                    continue block88;
                }
                case 1132073658: {
                    break block88;
                }
            }
            break;
        }
        v20 = v15.withFragmentShader(v18);
        while (true) {
            if ((v21 /* !! */  = (cfr_temp_8 = lh.po - lh.ifas("ifcu", ifax(int ), (int)17)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v21 /* !! */  == lh.ifas("ifcv", ifap(int ), (int)17)) break;
            v21 /* !! */  = (long)lh.ifas("ifcw", ifap(int ), (int)18);
        }
        v22 = VertexFormat.builder();
        v23 /* !! */  = lh.po;
        block90: while (true) {
            switch ((int)v23 /* !! */ ) {
                case 1132073658: {
                    break block90;
                }
                case 1994703679: {
                    v23 /* !! */  = (long)(lh.ifas("ifcy", ifax(int ), (int)19) - lh.ifas("ifcx", ifax(int ), (int)18));
                    continue block90;
                }
            }
            break;
        }
        v24 = v22.build();
        v25 /* !! */  = lh.po;
        block91: while (true) {
            switch ((int)v25 /* !! */ ) {
                case 1132073658: {
                    break block91;
                }
                case 1474424001: {
                    v25 /* !! */  = (long)(lh.ifas("ifda", ifax(int ), (int)21) - lh.ifas("ifcz", ifax(int ), (int)20));
                    continue block91;
                }
            }
            break;
        }
        while (true) {
            if ((v26 /* !! */  = (cfr_temp_9 = lh.po - lh.ifas("ifdb", ifax(int ), (int)22)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v26 /* !! */  == lh.ifas("ifdd", ifap(int ), (int)19)) break;
            v26 /* !! */  = (long)lh.ifas("ifde", ifap(int ), (int)20);
        }
        v27 = v20.withVertexFormat(v24, VertexFormat.class_5596.field_27379);
        v28 /* !! */  = lh.po;
        block93: while (true) {
            switch ((int)v28 /* !! */ ) {
                case -657638135: {
                    v28 /* !! */  = (long)(lh.ifas("ifdh", ifax(int ), (int)24) - lh.ifas("ifdf", ifax(int ), (int)23));
                    continue block93;
                }
                case 1132073658: {
                    break block93;
                }
            }
            break;
        }
        v29 /* !! */  = lh.po;
        if (true) ** GOTO lbl141
        block94: while (true) {
            v29 /* !! */  = (long)(v30 - lh.ifas("ifdi", ifax(int ), (int)25));
lbl141:
            // 2 sources

            switch ((int)v29 /* !! */ ) {
                case -313243733: {
                    v30 = lh.ifas("ifdj", ifax(int ), (int)26);
                    continue block94;
                }
                case -131619775: {
                    v30 = lh.ifas("ifdk", ifax(int ), (int)27);
                    continue block94;
                }
                case -102368452: {
                    v30 = lh.ifas("ifdl", ifax(int ), (int)28);
                    continue block94;
                }
                case 1132073658: {
                    break block94;
                }
            }
            break;
        }
        v31 = v27.withUniform("Uniforms", class_10789.field_60031);
        v32 /* !! */  = lh.po;
        if (true) ** GOTO lbl158
        block95: while (true) {
            v32 /* !! */  = (long)(v33 - lh.ifas("ifdn", ifax(int ), (int)29));
lbl158:
            // 2 sources

            switch ((int)v32 /* !! */ ) {
                case -1230798147: {
                    v33 = lh.ifas("ifdo", ifax(int ), (int)30);
                    continue block95;
                }
                case 282891082: {
                    v33 = lh.ifas("ifea", ifax(int ), (int)31);
                    continue block95;
                }
                case 1132073658: {
                    break block95;
                }
                case 1485848922: {
                    v33 = lh.ifas("ifeb", ifax(int ), (int)32);
                    continue block95;
                }
            }
            break;
        }
        while (true) {
            if ((v34 /* !! */  = (cfr_temp_10 = lh.po - lh.ifas("ifec", ifax(int ), (int)33)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
            if (v34 /* !! */  == lh.ifas("ifee", ifap(int ), (int)21)) break;
            v34 /* !! */  = (long)lh.ifas("ifef", ifap(int ), (int)22);
        }
        v35 = v31.withBlend(BlendFunction.TRANSLUCENT);
        while (true) {
            if ((v36 /* !! */  = (cfr_temp_11 = lh.po - lh.ifas("ifeg", ifax(int ), (int)34)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
            if (v36 /* !! */  == lh.ifas("ifeh", ifap(int ), (int)23)) break;
            v36 /* !! */  = (long)lh.ifas("ifei", ifap(int ), (int)24);
        }
        while (true) {
            if ((v37 /* !! */  = (cfr_temp_12 = lh.po - lh.ifas("ifej", ifax(int ), (int)35)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
            if (v37 /* !! */  == lh.ifas("ifel", ifap(int ), (int)25)) break;
            v37 /* !! */  = (long)lh.ifas("ifem", ifap(int ), (int)26);
        }
        v38 = v35.withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST);
        v39 = lh.ifas("ifen", ifap(int ), (int)27);
        while (true) {
            block136: {
                if ((v40 /* !! */  = (cfr_temp_13 = lh.po - lh.ifas("ifeo", ifax(int ), (int)36)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                if (v40 /* !! */  != lh.ifas("ifep", ifap(int ), (int)28)) break block136;
                v41 = v38.withCull((boolean)v39);
                v42 /* !! */  = lh.po;
                if (true) ** GOTO lbl199
            }
            v40 /* !! */  = (long)lh.ifas("ifeq", ifap(int ), (int)29);
        }
        block100: while (true) {
            v42 /* !! */  = (long)(v43 - lh.ifas("ifer", ifax(int ), (int)37));
lbl199:
            // 2 sources

            switch ((int)v42 /* !! */ ) {
                case -910433028: {
                    v43 = lh.ifas("ifes", ifax(int ), (int)38);
                    continue block100;
                }
                case -877728808: {
                    v43 = lh.ifas("ifet", ifax(int ), (int)39);
                    continue block100;
                }
                case -683341103: {
                    v43 = lh.ifas("ifeu", ifax(int ), (int)40);
                    continue block100;
                }
                case 1132073658: {
                    break block100;
                }
            }
            break;
        }
        v44 = v41.build();
        while (true) {
            if ((v45 /* !! */  = (cfr_temp_14 = lh.po - lh.ifas("ifff", ifax(int ), (int)41)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
            if (v45 /* !! */  == lh.ifas("iffg", ifap(int ), (int)30)) {
                lh.pipeline = v44;
                if (var0_2) return;
                break;
            }
            v45 /* !! */  = (long)lh.ifas("iffh", ifap(int ), (int)31);
        }
        if (var0_2) return;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block102: while (true) {
            block137: {
                switch (cfr_temp_0 == -2147483648 ? var1_1 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            if ((v46 /* !! */  = (cfr_temp_15 = lh.po - lh.ifas("iffj", ifax(int ), (int)42)) == 0L ? 0 : (cfr_temp_15 < 0L ? -1 : 1)) == false) continue;
                            if (v46 /* !! */  != lh.ifas("iffk", ifap(int ), (int)32)) ** GOTO lbl231
                            v47 = RenderSystem.getDevice();
                            ** GOTO lbl280
lbl231:
                            // 1 sources

                            v46 /* !! */  = (long)lh.ifas("iffl", ifap(int ), (int)33);
                        }
                    }
                    case 0: {
                        do {
                            var1_1 /* !! */  = (int)lh.ifas("ifid", ifap(int ), (int)40);
                        } while (!var2);
                        throw null;
                    }
                    case 2: {
                        ** GOTO lbl275
                    }
                    case 7: {
                        var1_1 /* !! */  = (int)lh.ifas("ifju", ifap(int ), (int)47);
                        if (var2) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 9: {
                        var1_1 /* !! */  = (int)lh.ifas("ifka", ifap(int ), (int)49);
                        cfr_temp_0 = 8;
                        if (var2) {
                            throw null;
                        }
                        break block137;
                    }
                    case 11: {
                        var1_1 /* !! */  = (int)lh.ifas("ifkq", ifap(int ), (int)51);
                        cfr_temp_0 = 6;
                        if (var2) {
                            throw null;
                        }
                        break block137;
                    }
                    case 12: {
                        var1_1 /* !! */  = (int)lh.ifas("ifkt", ifap(int ), (int)52);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 8: {
                        var1_1 /* !! */  = (int)lh.ifas("ifjx", ifap(int ), (int)48);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 1: {
                        var1_1 /* !! */  = (int)lh.ifas("ifig", ifap(int ), (int)41);
                        cfr_temp_0 = 6;
                        if (var2) {
                            throw null;
                        }
                        break block137;
                    }
                    case 13: lbl-1000:
                    // 2 sources

                    {
                        var1_1 /* !! */  = (int)lh.ifas("ifkz", ifap(int ), (int)53);
                        if (var2) {
                            throw null;
                        }
lbl275:
                        // 3 sources

                        var1_1 /* !! */  = (int)lh.ifas("ifih", ifap(int ), (int)42);
                        cfr_temp_0 = 6;
                        if (var2) {
                            throw null;
                        }
                        break block137;
                    }
lbl280:
                    // 1 sources

                    while (true) {
                        if ((v48 /* !! */  = (cfr_temp_16 = lh.po - lh.ifas("iffn", ifax(int ), (int)43)) == 0L ? 0 : (cfr_temp_16 < 0L ? -1 : 1)) == false) continue;
                        if (v48 /* !! */  != lh.ifas("ifga", ifap(int ), (int)34)) ** GOTO lbl288
                        v49 = (Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$init$0(), ()Ljava/lang/String;)();
                        v50 = lh.ifas("ifgc", ifap(int ), (int)36);
                        v51 = lh.ifas("ifgd", ifax(int ), (int)44);
                        v52 /* !! */  = lh.po;
                        if (true) ** GOTO lbl292
lbl288:
                        // 1 sources

                        v48 /* !! */  = (long)lh.ifas("ifgb", ifap(int ), (int)35);
                    }
                    block106: while (true) {
                        v52 /* !! */  = (long)(v53 - lh.ifas("ifge", ifax(int ), (int)45));
lbl292:
                        // 2 sources

                        switch ((int)v52 /* !! */ ) {
                            case -770510168: {
                                v53 = lh.ifas("ifgl", ifax(int ), (int)46);
                                continue block106;
                            }
                            case 1132073658: {
                                break block106;
                            }
                            case 1299494359: {
                                v53 = lh.ifas("ifgq", ifax(int ), (int)47);
                                continue block106;
                            }
                        }
                        break;
                    }
                    v54 = v47.createBuffer(v49, (int)v50, (long)v51);
                    v55 /* !! */  = lh.po;
                    block107: while (true) {
                        switch ((int)v55 /* !! */ ) {
                            case -966674542: {
                                v55 /* !! */  = (long)(lh.ifas("ifhf", ifax(int ), (int)49) - lh.ifas("ifhb", ifax(int ), (int)48));
                                continue block107;
                            }
                            case 1132073658: {
                                break block107;
                            }
                        }
                        break;
                    }
                    lh.uniformBuffer = v54;
                    if (var0_2 || var0_2) return;
                    v56 = lh.ifas("ifhj", ifap(int ), (int)37);
                    v57 /* !! */  = lh.po;
                    if (true) ** GOTO lbl317
                    block108: while (true) {
                        v57 /* !! */  = (long)(v58 - lh.ifas("ifhl", ifax(int ), (int)50));
lbl317:
                        // 2 sources

                        switch ((int)v57 /* !! */ ) {
                            case -296029697: {
                                v58 = lh.ifas("ifhm", ifax(int ), (int)51);
                                continue block108;
                            }
                            case 1132073658: {
                                break block108;
                            }
                            case 1725882826: {
                                v58 = lh.ifas("ifhp", ifax(int ), (int)52);
                                continue block108;
                            }
                        }
                        break;
                    }
                    v59 = MemoryUtil.memAlloc((int)v56);
                    while (true) {
                        if ((v60 /* !! */  = (cfr_temp_17 = lh.po - lh.ifas("ifht", ifax(int ), (int)53)) == 0L ? 0 : (cfr_temp_17 < 0L ? -1 : 1)) == false) continue;
                        if (v60 /* !! */  == lh.ifas("ifhy", ifap(int ), (int)38)) {
                            lh.uniformData = v59;
                            if (var0_2) return;
                            break;
                        }
                        v60 /* !! */  = (long)lh.ifas("ifhz", ifap(int ), (int)39);
                    }
                    if (!var0_2) return;
                    return;
                    case 3: {
                        var1_1 /* !! */  = (int)lh.ifas("ifjj", ifap(int ), (int)43);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 10: {
                        var1_1 /* !! */  = (int)lh.ifas("ifkn", ifap(int ), (int)50);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 6: {
                        var1_1 /* !! */  = (int)lh.ifas("ifjq", ifap(int ), (int)46);
                        cfr_temp_0 = 3;
                        if (var2) {
                            throw null;
                        }
                        break block137;
                    }
                    case 4: {
                        var1_1 /* !! */  = (int)lh.ifas("ifjm", ifap(int ), (int)44);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 5: 
                }
                ** GOTO lbl360
            }
            do {
                if (true) continue block102;
lbl360:
                // 2 sources

                var1_1 /* !! */  = (int)lh.ifas("ifjo", ifap(int ), (int)45);
                cfr_temp_0 = 4;
            } while (!var2);
            break;
        }
        throw null;
    }

    static {
        ifaq = new int[206];
        ifar = new int[206];
        lh.ifzl();
        lh.ifzs();
        lh.ifzx();
        lh.ifzy();
        lh.igad();
        lh.igai();
        ifay = new long[88];
        ifaz = new long[88];
        lh.igak();
        lh.igat();
    }

    public static /* synthetic */ CallSite ifas(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void ifzs() {
        lh.ifaq[100] = 919135864;
        lh.ifaq[101] = -2102956873;
        lh.ifaq[102] = -643155576;
        lh.ifaq[103] = 216294917;
        lh.ifaq[104] = 2021323775;
        lh.ifaq[105] = 1413014984;
        lh.ifaq[106] = 1877306229;
        lh.ifaq[107] = -1125792330;
        lh.ifaq[108] = -2066328011;
        lh.ifaq[109] = -593352718;
        lh.ifaq[110] = -1171161743;
        lh.ifaq[111] = -17474079;
        lh.ifaq[112] = 1666117716;
        lh.ifaq[113] = 1394078023;
        lh.ifaq[114] = -1110687347;
        lh.ifaq[115] = -1878914843;
        lh.ifaq[116] = 1808082334;
        lh.ifaq[117] = -739356989;
        lh.ifaq[118] = 609038768;
        lh.ifaq[119] = 540806581;
        lh.ifaq[120] = -723805350;
        lh.ifaq[121] = 598556747;
        lh.ifaq[122] = -375098728;
        lh.ifaq[123] = -764369010;
        lh.ifaq[124] = -415205663;
        lh.ifaq[125] = -1470533696;
        lh.ifaq[126] = -314256884;
        lh.ifaq[127] = 1470180291;
        lh.ifaq[128] = -2091688479;
        lh.ifaq[129] = -478926245;
        lh.ifaq[130] = 581375110;
        lh.ifaq[131] = -704146280;
        lh.ifaq[132] = 2003870608;
        lh.ifaq[133] = 969141554;
        lh.ifaq[134] = -2124013933;
        lh.ifaq[135] = -443386895;
        lh.ifaq[136] = -591570467;
        lh.ifaq[137] = 1260994105;
        lh.ifaq[138] = -518465047;
        lh.ifaq[139] = -201420040;
        lh.ifaq[140] = -2049492926;
        lh.ifaq[141] = -1965447634;
        lh.ifaq[142] = -905454233;
        lh.ifaq[143] = 1750385033;
        lh.ifaq[144] = -377057326;
        lh.ifaq[145] = 1502933876;
        lh.ifaq[146] = 1865037738;
        lh.ifaq[147] = -1258906894;
        lh.ifaq[148] = -1161839162;
        lh.ifaq[149] = 638005224;
        lh.ifaq[150] = -1867126840;
        lh.ifaq[151] = 147668996;
        lh.ifaq[152] = 572837667;
        lh.ifaq[153] = 1036772864;
        lh.ifaq[154] = -700064936;
        lh.ifaq[155] = -1747365752;
        lh.ifaq[156] = -753970548;
        lh.ifaq[157] = 430808261;
        lh.ifaq[158] = 1029736493;
        lh.ifaq[159] = 563323934;
        lh.ifaq[160] = -113383140;
        lh.ifaq[161] = -2002874759;
        lh.ifaq[162] = 1481042268;
        lh.ifaq[163] = 1346175809;
        lh.ifaq[164] = 443851358;
        lh.ifaq[165] = 697299678;
        lh.ifaq[166] = 2053101255;
        lh.ifaq[167] = 263534980;
        lh.ifaq[168] = 298506539;
        lh.ifaq[169] = -802830447;
        lh.ifaq[170] = -1399001103;
        lh.ifaq[171] = -1283295311;
        lh.ifaq[172] = -470437949;
        lh.ifaq[173] = 1330514136;
        lh.ifaq[174] = -551401753;
        lh.ifaq[175] = -573891777;
        lh.ifaq[176] = 1225638747;
        lh.ifaq[177] = 1001231609;
        lh.ifaq[178] = 459918939;
        lh.ifaq[179] = 1010366985;
        lh.ifaq[180] = -1182648021;
        lh.ifaq[181] = 460920579;
        lh.ifaq[182] = -1656040214;
        lh.ifaq[183] = 887492887;
        lh.ifaq[184] = -928831916;
        lh.ifaq[185] = 1813384432;
        lh.ifaq[186] = 1965912161;
        lh.ifaq[187] = -1187840966;
        lh.ifaq[188] = -1663115737;
        lh.ifaq[189] = -1513181598;
        lh.ifaq[190] = 159771720;
        lh.ifaq[191] = -1989576649;
        lh.ifaq[192] = 703513627;
        lh.ifaq[193] = 1081938737;
        lh.ifaq[194] = -19139762;
        lh.ifaq[195] = 525711875;
        lh.ifaq[196] = 1130323890;
        lh.ifaq[197] = 1529371951;
        lh.ifaq[198] = -107643492;
        lh.ifaq[199] = 1001669381;
    }

    private static /* synthetic */ void ifzx() {
        lh.ifaq[200] = 1113335820;
        lh.ifaq[201] = 532965779;
        lh.ifaq[202] = 2061393202;
        lh.ifaq[203] = 420543363;
        lh.ifaq[204] = -645625292;
        lh.ifaq[205] = 929703549;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void draw(Matrix4f var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, int ... var7_7) {
        block177: {
            block176: {
                block175: {
                    var16_8 = lh.c;
                    var15_9 /* !! */  = lh.b;
                    var14_10 = lh.a;
                    if (var16_8) {
                        throw null;
lbl6:
                        // 50 sources

                        return;
                    }
                    if (var14_10 || var14_10) ** GOTO lbl6
                    if (lh.pipeline != null) break block175;
                    if (var14_10) ** GOTO lbl6
                    lh.init();
                    if (var14_10) ** GOTO lbl6
                }
                if (var14_10 || var14_10) ** GOTO lbl6
                if (lh.pipeline == null) break block176;
                if (var14_10) ** GOTO lbl6
                if (lh.uniformBuffer == null) break block176;
                if (var14_10) ** GOTO lbl6
                if (lh.uniformData != null) break block177;
                if (var14_10) ** GOTO lbl6
            }
            if (var14_10 || var14_10) ** GOTO lbl6
            return;
        }
        if (var14_10 || var14_10) ** GOTO lbl6
        var8_11 = lh.uniformData;
        if (var14_10 || var14_10) ** GOTO lbl6
        var8_11.clear();
        if (var14_10 || var14_10) ** GOTO lbl6
        var8_11.putFloat(var0.m00()).putFloat(var0.m01()).putFloat(var0.m02()).putFloat(var0.m03());
        if (var14_10 || var14_10) ** GOTO lbl6
        var8_11.putFloat(var0.m10()).putFloat(var0.m11()).putFloat(var0.m12()).putFloat(var0.m13());
        if (var14_10 || var14_10) ** GOTO lbl6
        var8_11.putFloat(var0.m20()).putFloat(var0.m21()).putFloat(var0.m22()).putFloat(var0.m23());
        if (var14_10 || var14_10) ** GOTO lbl6
        var8_11.putFloat(var0.m30()).putFloat(var0.m31()).putFloat(var0.m32()).putFloat(var0.m33());
        if (var14_10 || var14_10) ** GOTO lbl6
        var8_11.position((int)lh.ifas("iflh", ifap(int ), (int)54));
        if (var14_10 || var14_10) ** GOTO lbl6
        if (var15_9 /* !! */  == 0) ** GOTO lbl-1000
        switch (var15_9 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var8_11.putFloat(var1_1).putFloat(var2_2).putFloat(var3_3).putFloat(var3_3);
                if (var14_10 || var14_10) ** GOTO lbl6
                var8_11.putFloat(var4_4).putFloat(var5_5).putFloat(var6_6).putFloat(0.0f);
                if (var14_10 || var14_10) ** GOTO lbl6
                var8_11.position((int)lh.ifas("iflj", ifap(int ), (int)55));
                if (var14_10 || var14_10) ** GOTO lbl6
                var9_12 = lh.ifas("iflk", ifap(int ), (int)56);
                if (var14_10) ** GOTO lbl6
                do {
                    if (var14_10 || var14_10) ** GOTO lbl6
                    if (var9_12 >= lh.ifas("iflm", ifap(int ), (int)57)) ** GOTO lbl89
                    if (var14_10 || var14_10) ** GOTO lbl6
                    if (var7_7.length != 0) ** GOTO lbl70
                    if (var14_10) ** GOTO lbl6
                    v0 /* !! */  = lh.ifas("iflo", ifap(int ), (int)58);
                    if (var16_8) {
                        throw null;
                    }
                    ** GOTO lbl72
lbl70:
                    // 1 sources

                    if (var14_10 || var14_10) ** GOTO lbl6
                    v0 /* !! */  = var10_14 = (CallSite)var7_7[Math.min((int)var9_12, var7_7.length - lh.ifas("iflq", ifap(int ), (int)59))];
lbl72:
                    // 2 sources

                    if (var14_10 || var14_10) ** GOTO lbl6
                    var8_11.putFloat((float)(var10_14 >> lh.ifas("ifls", ifap(int ), (int)60) & lh.ifas("iflt", ifap(int ), (int)61)) / lh.ifas("iflw", iflu(int ), (int)62));
                    if (var14_10 || var14_10) ** GOTO lbl6
                    var8_11.putFloat((float)(var10_14 >> lh.ifas("iflx", ifap(int ), (int)63) & lh.ifas("ifly", ifap(int ), (int)64)) / lh.ifas("iflz", iflu(int ), (int)65));
                    if (var14_10 || var14_10) ** GOTO lbl6
                    var8_11.putFloat((float)(var10_14 & lh.ifas("ifma", ifap(int ), (int)66)) / lh.ifas("ifmb", iflu(int ), (int)67));
                    if (var14_10 || var14_10) ** GOTO lbl6
                    var8_11.putFloat((float)(var10_14 >> lh.ifas("ifmc", ifap(int ), (int)68) & lh.ifas("ifmd", ifap(int ), (int)69)) / lh.ifas("ifme", iflu(int ), (int)70));
                    if (var14_10 || var14_10) ** GOTO lbl6
                    ++var9_12;
                    if (var14_10) ** GOTO lbl6
                } while (!var16_8);
                throw null;
lbl89:
                // 1 sources

                if (var14_10 || var14_10) ** GOTO lbl6
                var8_11.flip();
                if (var14_10 || var14_10) ** GOTO lbl6
                var9_13 = RenderSystem.getDevice().createCommandEncoder();
                if (var14_10 || var14_10) ** GOTO lbl6
                var9_13.writeToBuffer(lh.uniformBuffer.slice(), var8_11);
                if (var14_10 || var14_10) ** GOTO lbl6
                var10_15 = class_310.method_1551().method_1522();
                if (var14_10 || var14_10) ** GOTO lbl6
                var11_16 = var9_13.createRenderPass((Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$draw$1(), ()Ljava/lang/String;)(), var10_15.method_71639(), OptionalInt.empty());
                if (var14_10) ** GOTO lbl6
                try {
                    if (var14_10) ** GOTO lbl6
                    var11_16.setPipeline(lh.pipeline);
                    if (var14_10 || var14_10) ** GOTO lbl6
                    var11_16.setUniform("Uniforms", lh.uniformBuffer);
                    if (var14_10 || var14_10) ** GOTO lbl6
                    var11_16.draw((int)lh.ifas("ifmg", ifap(int ), (int)71), (int)lh.ifas("ifmh", ifap(int ), (int)72));
                    if (var14_10 || var14_10) ** GOTO lbl6
                    if (var11_16 == null) ** GOTO lbl133
                    if (var14_10) ** GOTO lbl6
                }
                catch (Throwable var12_17) {
                    if (var14_10) ** GOTO lbl6
                    if (var11_16 == null) ** GOTO lbl126
                    if (var14_10) ** GOTO lbl6
                    try {
                        if (var14_10) ** GOTO lbl6
                        var11_16.close();
                        if (var14_10 || var14_10) ** GOTO lbl6
                        ** if (!var16_8) goto lbl-1000
                    }
                    catch (Throwable var13_18) {
                        if (var14_10) ** GOTO lbl6
                        var12_17.addSuppressed(var13_18);
                        if (var14_10) ** GOTO lbl6
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
lbl126:
                    // 3 sources

                    if (var14_10 || var14_10) ** GOTO lbl6
                    throw var12_17;
                }
                var11_16.close();
                if (var14_10) ** GOTO lbl6
                if (var16_8) {
                    throw null;
                }
lbl133:
                // 3 sources

                if (!var14_10 && !var14_10) ** break;
                ** continue;
                return;
            }
lbl136:
            // 3 sources

            case 0: {
                var15_9 /* !! */  = (int)lh.ifas("ifmi", ifap(int ), (int)73);
                if (var16_8) {
                    throw null;
                }
                ** GOTO lbl176
            }
lbl141:
            // 2 sources

            case 1: {
                var15_9 /* !! */  = (int)lh.ifas("ifmk", ifap(int ), (int)74);
                if (var16_8) {
                    throw null;
                }
                ** GOTO lbl327
            }
lbl146:
            // 2 sources

            case 2: {
                var15_9 /* !! */  = (int)lh.ifas("ifmm", ifap(int ), (int)75);
                if (var16_8) {
                    throw null;
                }
                ** GOTO lbl222
            }
lbl151:
            // 2 sources

            case 3: {
                var15_9 /* !! */  = (int)lh.ifas("ifmn", ifap(int ), (int)76);
                if (var16_8) {
                    throw null;
                }
                ** GOTO lbl393
            }
            case 4: {
                var15_9 /* !! */  = (int)lh.ifas("ifmp", ifap(int ), (int)77);
                if (var16_8) {
                    throw null;
                }
                ** GOTO lbl447
            }
            case 5: {
                var15_9 /* !! */  = (int)lh.ifas("ifms", ifap(int ), (int)78);
                if (var16_8) {
                    throw null;
                }
                ** GOTO lbl322
            }
lbl166:
            // 2 sources

            case 6: {
                var15_9 /* !! */  = (int)lh.ifas("ifmu", ifap(int ), (int)79);
                if (var16_8) {
                    throw null;
                }
                ** GOTO lbl398
            }
            case 7: {
                var15_9 /* !! */  = (int)lh.ifas("ifmw", ifap(int ), (int)80);
                if (var16_8) {
                    throw null;
                }
                ** GOTO lbl372
            }
lbl176:
            // 2 sources

            case 8: {
                var15_9 /* !! */  = (int)lh.ifas("ifmy", ifap(int ), (int)81);
                if (var16_8) {
                    throw null;
                }
                ** GOTO lbl463
            }
lbl181:
            // 2 sources

            case 9: {
                var15_9 /* !! */  = (int)lh.ifas("ifmz", ifap(int ), (int)82);
                if (var16_8) {
                    throw null;
                }
                ** GOTO lbl266
            }
lbl186:
            // 2 sources

            case 10: {
                var15_9 /* !! */  = (int)lh.ifas("ifna", ifap(int ), (int)83);
                if (var16_8) {
                    throw null;
                }
                ** GOTO lbl261
            }
            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var15_9 /* !! */  = (int)lh.ifas("ifnc", ifap(int ), (int)84);
                    if (var16_8) {
                        throw null;
                    }
                    ** GOTO lbl485
                    break;
                }
            }
lbl197:
            // 2 sources

            case 12: {
                var15_9 /* !! */  = (int)lh.ifas("ifnd", ifap(int ), (int)85);
                if (var16_8) {
                    throw null;
                }
                ** GOTO lbl501
            }
            case 13: {
                var15_9 /* !! */  = (int)lh.ifas("ifne", ifap(int ), (int)86);
                if (var16_8) {
                    throw null;
                }
                ** GOTO lbl451
            }
            case 14: {
                var15_9 /* !! */  = (int)lh.ifas("ifng", ifap(int ), (int)87);
                if (var16_8) {
                    throw null;
                }
                ** GOTO lbl407
            }
            case 15: {
                var15_9 /* !! */  = (int)lh.ifas("ifnh", ifap(int ), (int)88);
                if (var16_8) {
                    throw null;
                }
                ** GOTO lbl380
            }
lbl217:
            // 2 sources

            case 16: {
                var15_9 /* !! */  = (int)lh.ifas("ifnj", ifap(int ), (int)89);
                if (var16_8) {
                    throw null;
                }
                ** GOTO lbl493
            }
lbl222:
            // 3 sources

            case 17: {
                var15_9 /* !! */  = (int)lh.ifas("ifnl", ifap(int ), (int)90);
                if (!var16_8) ** GOTO lbl136
                throw null;
            }
lbl226:
            // 2 sources

            case 18: {
                var15_9 /* !! */  = (int)lh.ifas("ifnn", ifap(int ), (int)91);
                if (!var16_8) ** GOTO lbl217
                throw null;
            }
lbl230:
            // 6 sources

            case 19: {
                var15_9 /* !! */  = (int)lh.ifas("ifnp", ifap(int ), (int)92);
                if (var16_8) {
                    throw null;
                }
                ** GOTO lbl419
            }
lbl235:
            // 2 sources

            case 20: {
                var15_9 /* !! */  = (int)lh.ifas("ifns", ifap(int ), (int)93);
                if (!var16_8) ** GOTO lbl222
                throw null;
            }
lbl239:
            // 2 sources

            case 21: {
                var15_9 /* !! */  = (int)lh.ifas("ifnv", ifap(int ), (int)94);
                if (!var16_8) ** GOTO lbl230
                throw null;
            }
            case 22: {
                var15_9 /* !! */  = (int)lh.ifas("ifnx", ifap(int ), (int)95);
                if (var16_8) {
                    throw null;
                }
                ** GOTO lbl372
            }
            case 23: {
                var15_9 /* !! */  = (int)lh.ifas("ifob", ifap(int ), (int)96);
                if (!var16_8) ** GOTO lbl146
                throw null;
            }
lbl252:
            // 2 sources

            case 24: {
                var15_9 /* !! */  = (int)lh.ifas("ifod", ifap(int ), (int)97);
                if (!var16_8) ** GOTO lbl136
                throw null;
            }
            case 25: {
                var15_9 /* !! */  = (int)lh.ifas("ifof", ifap(int ), (int)98);
                if (var16_8) {
                    throw null;
                }
                ** GOTO lbl485
            }
lbl261:
            // 2 sources

            case 26: {
                var15_9 /* !! */  = (int)lh.ifas("ifoh", ifap(int ), (int)99);
                if (var16_8) {
                    throw null;
                }
                ** GOTO lbl501
            }
lbl266:
            // 3 sources

            case 27: {
                var15_9 /* !! */  = (int)lh.ifas("ifoj", ifap(int ), (int)100);
                if (!var16_8) ** GOTO lbl181
                throw null;
            }
            case 28: {
                var15_9 /* !! */  = (int)lh.ifas("ifol", ifap(int ), (int)101);
                if (var16_8) {
                    throw null;
                }
                ** GOTO lbl415
            }
lbl275:
            // 2 sources

            case 29: {
                var15_9 /* !! */  = (int)lh.ifas("ifon", ifap(int ), (int)102);
                if (!var16_8) ** GOTO lbl166
                throw null;
            }
lbl279:
            // 2 sources

            case 30: {
                var15_9 /* !! */  = (int)lh.ifas("ifop", ifap(int ), (int)103);
                if (!var16_8) ** GOTO lbl239
                throw null;
            }
lbl283:
            // 2 sources

            case 31: {
                var15_9 /* !! */  = (int)lh.ifas("ifor", ifap(int ), (int)104);
                if (var16_8) {
                    throw null;
                }
                ** GOTO lbl389
            }
lbl288:
            // 2 sources

            case 32: {
                var15_9 /* !! */  = (int)lh.ifas("ifot", ifap(int ), (int)105);
                if (!var16_8) ** GOTO lbl283
                throw null;
            }
lbl292:
            // 3 sources

            case 33: {
                var15_9 /* !! */  = (int)lh.ifas("ifov", ifap(int ), (int)106);
                if (!var16_8) ** GOTO lbl230
                throw null;
            }
            case 34: {
                var15_9 /* !! */  = (int)lh.ifas("ifox", ifap(int ), (int)107);
                if (!var16_8) ** GOTO lbl230
                throw null;
            }
lbl300:
            // 3 sources

            case 35: {
                var15_9 /* !! */  = (int)lh.ifas("ifoz", ifap(int ), (int)108);
                if (var16_8) {
                    throw null;
                }
                ** GOTO lbl327
            }
            case 36: {
                var15_9 /* !! */  = (int)lh.ifas("ifpb", ifap(int ), (int)109);
                if (!var16_8) ** GOTO lbl275
                throw null;
            }
            case 37: {
                var15_9 /* !! */  = (int)lh.ifas("ifpd", ifap(int ), (int)110);
                if (!var16_8) ** GOTO lbl292
                throw null;
            }
lbl313:
            // 2 sources

            case 38: {
                var15_9 /* !! */  = (int)lh.ifas("ifpf", ifap(int ), (int)111);
                if (var16_8) {
                    throw null;
                }
                ** GOTO lbl476
            }
lbl318:
            // 2 sources

            case 39: {
                var15_9 /* !! */  = (int)lh.ifas("ifph", ifap(int ), (int)112);
                if (!var16_8) ** GOTO lbl279
                throw null;
            }
lbl322:
            // 3 sources

            case 40: {
                var15_9 /* !! */  = (int)lh.ifas("ifpj", ifap(int ), (int)113);
                if (var16_8) {
                    throw null;
                }
                ** GOTO lbl485
            }
lbl327:
            // 5 sources

            case 41: {
                var15_9 /* !! */  = (int)lh.ifas("ifpl", ifap(int ), (int)114);
                if (var16_8) {
                    throw null;
                }
                ** GOTO lbl463
            }
lbl332:
            // 3 sources

            case 42: {
                var15_9 /* !! */  = (int)lh.ifas("ifpm", ifap(int ), (int)115);
                if (!var16_8) ** GOTO lbl230
                throw null;
            }
            case 43: {
                var15_9 /* !! */  = (int)lh.ifas("ifpn", ifap(int ), (int)116);
                if (var16_8) {
                    throw null;
                }
                ** GOTO lbl419
            }
lbl341:
            // 2 sources

            case 44: {
                var15_9 /* !! */  = (int)lh.ifas("ifpo", ifap(int ), (int)117);
                if (!var16_8) ** GOTO lbl186
                throw null;
            }
lbl345:
            // 3 sources

            case 45: {
                var15_9 /* !! */  = (int)lh.ifas("ifpp", ifap(int ), (int)118);
                if (!var16_8) ** GOTO lbl230
                throw null;
            }
lbl349:
            // 3 sources

            case 46: {
                var15_9 /* !! */  = (int)lh.ifas("ifpq", ifap(int ), (int)119);
                if (var16_8) {
                    throw null;
                }
                ** GOTO lbl393
            }
lbl354:
            // 2 sources

            case 47: {
                var15_9 /* !! */  = (int)lh.ifas("ifpt", ifap(int ), (int)120);
                if (var16_8) {
                    throw null;
                }
                ** GOTO lbl393
            }
            case 48: {
                var15_9 /* !! */  = (int)lh.ifas("ifpw", ifap(int ), (int)121);
                if (var16_8) {
                    throw null;
                }
                ** GOTO lbl471
            }
            case 49: {
                var15_9 /* !! */  = (int)lh.ifas("ifqa", ifap(int ), (int)122);
                if (!var16_8) ** GOTO lbl327
                throw null;
            }
lbl368:
            // 2 sources

            case 50: {
                var15_9 /* !! */  = (int)lh.ifas("ifqc", ifap(int ), (int)123);
                if (!var16_8) ** GOTO lbl300
                throw null;
            }
lbl372:
            // 3 sources

            case 51: {
                var15_9 /* !! */  = (int)lh.ifas("ifqg", ifap(int ), (int)124);
                if (!var16_8) ** GOTO lbl266
                throw null;
            }
            case 52: {
                var15_9 /* !! */  = (int)lh.ifas("ifqk", ifap(int ), (int)125);
                if (!var16_8) ** GOTO lbl345
                throw null;
            }
lbl380:
            // 2 sources

            case 53: {
                var15_9 /* !! */  = (int)lh.ifas("ifqo", ifap(int ), (int)126);
                if (var16_8) {
                    throw null;
                }
                ** GOTO lbl459
            }
            case 54: {
                var15_9 /* !! */  = (int)lh.ifas("ifqr", ifap(int ), (int)127);
                if (!var16_8) ** GOTO lbl288
                throw null;
            }
lbl389:
            // 2 sources

            case 55: {
                var15_9 /* !! */  = (int)lh.ifas("ifqu", ifap(int ), (int)128);
                if (!var16_8) ** GOTO lbl252
                throw null;
            }
lbl393:
            // 4 sources

            case 56: {
                var15_9 /* !! */  = (int)lh.ifas("ifqx", ifap(int ), (int)129);
                if (var16_8) {
                    throw null;
                }
                ** GOTO lbl443
            }
lbl398:
            // 3 sources

            case 57: {
                var15_9 /* !! */  = (int)lh.ifas("ifra", ifap(int ), (int)130);
                if (var16_8) {
                    throw null;
                }
                ** GOTO lbl435
            }
            case 58: {
                var15_9 /* !! */  = (int)lh.ifas("ifrd", ifap(int ), (int)131);
                if (!var16_8) ** GOTO lbl341
                throw null;
            }
lbl407:
            // 3 sources

            case 59: {
                var15_9 /* !! */  = (int)lh.ifas("ifrh", ifap(int ), (int)132);
                if (!var16_8) ** GOTO lbl197
                throw null;
            }
            case 60: {
                var15_9 /* !! */  = (int)lh.ifas("ifrj", ifap(int ), (int)133);
                if (!var16_8) ** GOTO lbl349
                throw null;
            }
lbl415:
            // 2 sources

            case 61: {
                var15_9 /* !! */  = (int)lh.ifas("ifrm", ifap(int ), (int)134);
                if (!var16_8) ** GOTO lbl313
                throw null;
            }
lbl419:
            // 3 sources

            case 62: {
                var15_9 /* !! */  = (int)lh.ifas("ifrn", ifap(int ), (int)135);
                if (!var16_8) ** GOTO lbl354
                throw null;
            }
lbl423:
            // 2 sources

            case 63: {
                var15_9 /* !! */  = (int)lh.ifas("ifro", ifap(int ), (int)136);
                if (!var16_8) ** GOTO lbl318
                throw null;
            }
            case 64: {
                var15_9 /* !! */  = (int)lh.ifas("ifrp", ifap(int ), (int)137);
                if (var16_8) {
                    throw null;
                }
            }
            case 65: {
                var15_9 /* !! */  = (int)lh.ifas("ifrr", ifap(int ), (int)138);
                if (!var16_8) ** GOTO lbl332
                throw null;
            }
lbl435:
            // 2 sources

            case 66: {
                var15_9 /* !! */  = (int)lh.ifas("ifrt", ifap(int ), (int)139);
                if (!var16_8) ** GOTO lbl423
                throw null;
            }
            case 67: {
                var15_9 /* !! */  = (int)lh.ifas("ifrw", ifap(int ), (int)140);
                if (!var16_8) ** GOTO lbl345
                throw null;
            }
lbl443:
            // 2 sources

            case 68: {
                var15_9 /* !! */  = (int)lh.ifas("ifry", ifap(int ), (int)141);
                if (!var16_8) ** GOTO lbl235
                throw null;
            }
lbl447:
            // 2 sources

            case 69: {
                var15_9 /* !! */  = (int)lh.ifas("ifsa", ifap(int ), (int)142);
                if (!var16_8) ** GOTO lbl407
                throw null;
            }
lbl451:
            // 2 sources

            case 70: {
                var15_9 /* !! */  = (int)lh.ifas("ifsc", ifap(int ), (int)143);
                if (!var16_8) ** GOTO lbl327
                throw null;
            }
lbl455:
            // 2 sources

            case 71: {
                var15_9 /* !! */  = (int)lh.ifas("ifse", ifap(int ), (int)144);
                if (!var16_8) ** GOTO lbl332
                throw null;
            }
lbl459:
            // 2 sources

            case 72: {
                var15_9 /* !! */  = (int)lh.ifas("ifsf", ifap(int ), (int)145);
                if (!var16_8) ** GOTO lbl151
                throw null;
            }
lbl463:
            // 3 sources

            case 73: {
                var15_9 /* !! */  = (int)lh.ifas("ifsi", ifap(int ), (int)146);
                if (var16_8) {
                    throw null;
                }
            }
            case 74: {
                var15_9 /* !! */  = (int)lh.ifas("ifsk", ifap(int ), (int)147);
                if (!var16_8) ** GOTO lbl455
                throw null;
            }
lbl471:
            // 2 sources

            case 75: {
                var15_9 /* !! */  = (int)lh.ifas("ifsn", ifap(int ), (int)148);
                if (var16_8) {
                    throw null;
                }
                ** GOTO lbl513
            }
lbl476:
            // 2 sources

            case 76: {
                do {
                    var15_9 /* !! */  = (int)lh.ifas("ifsp", ifap(int ), (int)149);
                } while (!var16_8);
                throw null;
            }
            case 77: {
                var15_9 /* !! */  = (int)lh.ifas("ifss", ifap(int ), (int)150);
                if (!var16_8) ** GOTO lbl226
                throw null;
            }
lbl485:
            // 4 sources

            case 78: {
                var15_9 /* !! */  = (int)lh.ifas("ifsv", ifap(int ), (int)151);
                if (!var16_8) ** GOTO lbl141
                throw null;
            }
            case 79: {
                var15_9 /* !! */  = (int)lh.ifas("ifsy", ifap(int ), (int)152);
                if (!var16_8) ** GOTO lbl292
                throw null;
            }
lbl493:
            // 2 sources

            case 80: {
                var15_9 /* !! */  = (int)lh.ifas("ifta", ifap(int ), (int)153);
                if (!var16_8) ** GOTO lbl322
                throw null;
            }
            case 81: {
                var15_9 /* !! */  = (int)lh.ifas("iftd", ifap(int ), (int)154);
                if (!var16_8) ** GOTO lbl300
                throw null;
            }
lbl501:
            // 4 sources

            case 82: {
                var15_9 /* !! */  = (int)lh.ifas("iftf", ifap(int ), (int)155);
                if (!var16_8) ** GOTO lbl368
                throw null;
            }
            case 83: {
                var15_9 /* !! */  = (int)lh.ifas("iftg", ifap(int ), (int)156);
                if (!var16_8) ** GOTO lbl349
                throw null;
            }
            case 84: {
                var15_9 /* !! */  = (int)lh.ifas("ifth", ifap(int ), (int)157);
                if (!var16_8) ** GOTO lbl398
                throw null;
            }
lbl513:
            // 2 sources

            case 85: {
                var15_9 /* !! */  = (int)lh.ifas("ifti", ifap(int ), (int)158);
                if (!var16_8) ** GOTO lbl501
                throw null;
            }
            case 86: 
        }
        var15_9 /* !! */  = (int)lh.ifas("iftj", ifap(int ), (int)159);
        ** while (!var16_8)
lbl520:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void igat() {
        lh.ifaz[0] = 2612390858124963831L;
        lh.ifaz[1] = 4965902379597031937L;
        lh.ifaz[2] = -4807906731483867383L;
        lh.ifaz[3] = 4796457390370478074L;
        lh.ifaz[4] = -1343470609790779237L;
        lh.ifaz[5] = 4170104345200362830L;
        lh.ifaz[6] = 4715099177981608647L;
        lh.ifaz[7] = -8257028665566179450L;
        lh.ifaz[8] = 820351682363694876L;
        lh.ifaz[9] = -4154628101158280361L;
        lh.ifaz[10] = -9148193136269325527L;
        lh.ifaz[11] = 6263878260527672181L;
        lh.ifaz[12] = 9141700752354861357L;
        lh.ifaz[13] = -3137717553660238625L;
        lh.ifaz[14] = 5543258330440777884L;
        lh.ifaz[15] = 2949241810498612730L;
        lh.ifaz[16] = 737219713006134784L;
        lh.ifaz[17] = 5553042715410739205L;
        lh.ifaz[18] = -8799996764296183183L;
        lh.ifaz[19] = -949619672273238134L;
        lh.ifaz[20] = 8149665269282180681L;
        lh.ifaz[21] = 5682817422123047574L;
        lh.ifaz[22] = -9003918511179430742L;
        lh.ifaz[23] = -5611742303644989326L;
        lh.ifaz[24] = 7572778139937061380L;
        lh.ifaz[25] = 2276896724698857270L;
        lh.ifaz[26] = -2259952618760696624L;
        lh.ifaz[27] = -2548250299533083270L;
        lh.ifaz[28] = -1477636407671252814L;
        lh.ifaz[29] = -2825885270030663141L;
        lh.ifaz[30] = 6070378116489276482L;
        lh.ifaz[31] = 4351581591426790672L;
        lh.ifaz[32] = 2712289796374212478L;
        lh.ifaz[33] = -2748219170265424559L;
        lh.ifaz[34] = 7829680608987447830L;
        lh.ifaz[35] = 4667150834373847876L;
        lh.ifaz[36] = -3975212666256542092L;
        lh.ifaz[37] = -5878627612075699425L;
        lh.ifaz[38] = -246478857536289727L;
        lh.ifaz[39] = 1612041289135139311L;
        lh.ifaz[40] = 1350791005560282532L;
        lh.ifaz[41] = -7616875215229006544L;
        lh.ifaz[42] = 3282810990886493694L;
        lh.ifaz[43] = 2099740756100169518L;
        lh.ifaz[44] = -414662746077694764L;
        lh.ifaz[45] = -473424931283031857L;
        lh.ifaz[46] = -4224126131236017045L;
        lh.ifaz[47] = 2165896611297002756L;
        lh.ifaz[48] = 668404873472851985L;
        lh.ifaz[49] = -3002420843493184081L;
        lh.ifaz[50] = -7596087123940615300L;
        lh.ifaz[51] = -4997221367017313698L;
        lh.ifaz[52] = 2364502753677649933L;
        lh.ifaz[53] = -152195104616229808L;
        lh.ifaz[54] = -5028979018221310757L;
        lh.ifaz[55] = -3294539684004067796L;
        lh.ifaz[56] = -757422541603678672L;
        lh.ifaz[57] = -1249418680813520221L;
        lh.ifaz[58] = 7013438861663916171L;
        lh.ifaz[59] = -7098399266406890492L;
        lh.ifaz[60] = -817862766594194804L;
        lh.ifaz[61] = -1111066207338776262L;
        lh.ifaz[62] = -1994252465798501129L;
        lh.ifaz[63] = -1051045587351009888L;
        lh.ifaz[64] = -2970662117168957519L;
        lh.ifaz[65] = -8560598609950296879L;
        lh.ifaz[66] = -4562031142868485559L;
        lh.ifaz[67] = 7948108472684495479L;
        lh.ifaz[68] = -2238354249223271212L;
        lh.ifaz[69] = 8507975793685944743L;
        lh.ifaz[70] = -8958838430950158675L;
        lh.ifaz[71] = 4414199588204635292L;
        lh.ifaz[72] = 90001011919428678L;
        lh.ifaz[73] = -3826728116350610766L;
        lh.ifaz[74] = -1924026756462559637L;
        lh.ifaz[75] = 1897660945695011861L;
        lh.ifaz[76] = -5134675418667176602L;
        lh.ifaz[77] = 5459840659152347603L;
        lh.ifaz[78] = 1351247826752777651L;
        lh.ifaz[79] = 786169593207685802L;
        lh.ifaz[80] = 8143274171890359960L;
        lh.ifaz[81] = 1945711473435201959L;
        lh.ifaz[82] = 479078981719604327L;
        lh.ifaz[83] = 8303055602333903283L;
        lh.ifaz[84] = 4990816055806772321L;
        lh.ifaz[85] = 4533803992406007615L;
        lh.ifaz[86] = 8987019383436441712L;
        lh.ifaz[87] = -3942113644395079187L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String lambda$draw$1() {
        block24: {
            while (true) {
                block25: {
                    if ((v0 /* !! */  = (cfr_temp_1 = lh.po - lh.ifas("ifxq", ifax(int ), (int)76)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v0 /* !! */  != lh.ifas("ifxx", ifap(int ), (int)192)) break block25;
                    var2 = lh.c;
                    v1 /* !! */  = lh.po;
                    if (true) ** GOTO lbl13
                }
                v0 /* !! */  = (long)lh.ifas("ifxz", ifap(int ), (int)193);
            }
            block13: while (true) {
                v1 /* !! */  = (long)(v2 - lh.ifas("ifya", ifax(int ), (int)77));
lbl13:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1611196510: {
                        v2 = lh.ifas("ifyb", ifax(int ), (int)78);
                        continue block13;
                    }
                    case -230555105: {
                        v2 = lh.ifas("ifyd", ifax(int ), (int)79);
                        continue block13;
                    }
                    case 1132073658: {
                        break block13;
                    }
                    case 1835327017: {
                        v2 = lh.ifas("ifye", ifax(int ), (int)80);
                        continue block13;
                    }
                }
                break;
            }
            var1_1 /* !! */  = lh.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_2 = lh.po - lh.ifas("ifyg", ifax(int ), (int)81)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == lh.ifas("ifyh", ifap(int ), (int)194)) {
                    var0_2 = lh.a;
                    if (var2) {
                        throw null;
                    }
                    break;
                }
                v3 /* !! */  = (long)lh.ifas("ifyj", ifap(int ), (int)195);
            }
            if (var0_2 || var0_2) {
                return null;
            }
            if (var1_1 /* !! */  == 0) return "SegmentedRing2D";
            cfr_temp_0 = -2147483648;
            block15: do {
                switch (cfr_temp_0 == -2147483648 ? var1_1 /* !! */  : cfr_temp_0) {
                    default: {
                        return "SegmentedRing2D";
                    }
                    case 0: {
                        ** break;
                    }
                    case 2: {
                        do {
                            var1_1 /* !! */  = (int)lh.ifas("ifyo", ifap(int ), (int)198);
                        } while (!var2);
                        throw null;
                    }
                    case 3: {
                        break block24;
                    }
lbl53:
                    // 2 sources

                    while (true) {
                        var1_1 /* !! */  = (int)lh.ifas("ifym", ifap(int ), (int)196);
                        cfr_temp_0 = 1;
                        if (!var2) continue block15;
                        throw null;
                    }
                    case 1: 
                }
                break;
            } while (true);
            var1_1 /* !! */  = (int)lh.ifas("ifyn", ifap(int ), (int)197);
            if (var2) {
                throw null;
            }
        }
        var1_1 /* !! */  = (int)lh.ifas("ifyp", ifap(int ), (int)199);
        ** while (!var2)
lbl67:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void igak() {
        lh.ifay[0] = 8693578073076406677L;
        lh.ifay[1] = -6170883199528798172L;
        lh.ifay[2] = 418211061885272664L;
        lh.ifay[3] = -5765942952462085040L;
        lh.ifay[4] = 2104211255540046245L;
        lh.ifay[5] = -3928128982179581538L;
        lh.ifay[6] = 1511185402728674253L;
        lh.ifay[7] = -2327284878570212650L;
        lh.ifay[8] = 2960110916791836871L;
        lh.ifay[9] = 3549978425340749035L;
        lh.ifay[10] = 6501041858198470892L;
        lh.ifay[11] = -313044153850815289L;
        lh.ifay[12] = -7414202028068161239L;
        lh.ifay[13] = -6597566456591630887L;
        lh.ifay[14] = 4806107660463618068L;
        lh.ifay[15] = 7283485475286736888L;
        lh.ifay[16] = -3908363133760918506L;
        lh.ifay[17] = -157808872118864311L;
        lh.ifay[18] = 7717641322483507502L;
        lh.ifay[19] = -6524691087833549264L;
        lh.ifay[20] = 2715079753942736795L;
        lh.ifay[21] = 2737406058116070332L;
        lh.ifay[22] = 1303542719301198493L;
        lh.ifay[23] = -6166560052406711829L;
        lh.ifay[24] = 9152752575141310560L;
        lh.ifay[25] = 6316927726421179880L;
        lh.ifay[26] = -1867858025824937499L;
        lh.ifay[27] = 1313728378381466544L;
        lh.ifay[28] = 4321603054112811455L;
        lh.ifay[29] = 2823269536767195566L;
        lh.ifay[30] = 880271571529868179L;
        lh.ifay[31] = -6869611634689011204L;
        lh.ifay[32] = 8242971868376587590L;
        lh.ifay[33] = -4702372226354822744L;
        lh.ifay[34] = -8928711313917680106L;
        lh.ifay[35] = -3476279575248554354L;
        lh.ifay[36] = 4909221366808311627L;
        lh.ifay[37] = 8243951894302996078L;
        lh.ifay[38] = -4154226607049762533L;
        lh.ifay[39] = -18633407454703957L;
        lh.ifay[40] = 6293375047136432303L;
        lh.ifay[41] = -1640394880167417463L;
        lh.ifay[42] = -7662288969186059422L;
        lh.ifay[43] = -8353228825151685810L;
        lh.ifay[44] = -414662746077694860L;
        lh.ifay[45] = 2646992898750243800L;
        lh.ifay[46] = 1233343625238269925L;
        lh.ifay[47] = -7504282160272087435L;
        lh.ifay[48] = -7517514376315405542L;
        lh.ifay[49] = 2988518114388893498L;
        lh.ifay[50] = 7249370974449116532L;
        lh.ifay[51] = -7003519445090955828L;
        lh.ifay[52] = 6285737499486333428L;
        lh.ifay[53] = 4256203987682221959L;
        lh.ifay[54] = -2492905278880085063L;
        lh.ifay[55] = -5210314698928822512L;
        lh.ifay[56] = 939550998820265391L;
        lh.ifay[57] = 1781680559612035209L;
        lh.ifay[58] = -4412432186572116510L;
        lh.ifay[59] = -2575003740957281584L;
        lh.ifay[60] = 7143056018652688723L;
        lh.ifay[61] = 6273259596068980176L;
        lh.ifay[62] = -1545312807947679416L;
        lh.ifay[63] = -1471621239822278663L;
        lh.ifay[64] = 9032307753295609858L;
        lh.ifay[65] = -2021333707753440566L;
        lh.ifay[66] = 727641671169781473L;
        lh.ifay[67] = -6559695990792952152L;
        lh.ifay[68] = 6184601730744046140L;
        lh.ifay[69] = -6072234797140387043L;
        lh.ifay[70] = 544046997854752835L;
        lh.ifay[71] = -1212804728894101716L;
        lh.ifay[72] = -3919473350024766896L;
        lh.ifay[73] = -5763116763570785117L;
        lh.ifay[74] = 1216384347451951173L;
        lh.ifay[75] = 3083433049831517416L;
        lh.ifay[76] = 1830617807471407088L;
        lh.ifay[77] = 7228983498910211899L;
        lh.ifay[78] = -3761070969561366186L;
        lh.ifay[79] = 7963697617171501852L;
        lh.ifay[80] = -3971397691751173654L;
        lh.ifay[81] = -4272025395233901067L;
        lh.ifay[82] = -6045642977766748313L;
        lh.ifay[83] = -2302453594521885281L;
        lh.ifay[84] = 1662666132936208510L;
        lh.ifay[85] = -3463737189759751386L;
        lh.ifay[86] = -1445975035863209541L;
        lh.ifay[87] = -3729008282995733445L;
    }

    private static /* synthetic */ int ifap(int n2) {
        return ifaq[n2] ^ ifar[n2];
    }

    private lh() {
        int n2 = b;
    }

    private static /* synthetic */ void igai() {
        lh.ifar[200] = 1113335821;
        lh.ifar[201] = -20431117;
        lh.ifar[202] = 2061393201;
        lh.ifar[203] = 420543361;
        lh.ifar[204] = -645625289;
        lh.ifar[205] = 929703548;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void shutdown() {
        v0 /* !! */  = lh.po;
        if (true) ** GOTO lbl5
        block50: while (true) {
            v0 /* !! */  = (long)(v1 - lh.ifas("iftl", ifax(int ), (int)54));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -7977777: {
                    v1 = lh.ifas("iftm", ifax(int ), (int)55);
                    continue block50;
                }
                case 1132073658: {
                    break block50;
                }
                case 1973097143: {
                    v1 = lh.ifas("ifto", ifax(int ), (int)56);
                    continue block50;
                }
            }
            break;
        }
        var2 = lh.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = lh.po - lh.ifas("iftq", ifax(int ), (int)57)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == lh.ifas("iftr", ifap(int ), (int)160)) break;
            v2 /* !! */  = (long)lh.ifas("iftt", ifap(int ), (int)161);
        }
        var1_1 /* !! */  = lh.b;
        v3 /* !! */  = lh.po;
        if (true) ** GOTO lbl25
        block52: while (true) {
            v3 /* !! */  = (long)(v4 - lh.ifas("iftu", ifax(int ), (int)58));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 244693526: {
                    v4 = lh.ifas("iftw", ifax(int ), (int)59);
                    continue block52;
                }
                case 1132073658: {
                    break block52;
                }
                case 1532381047: {
                    v4 = lh.ifas("iftx", ifax(int ), (int)60);
                    continue block52;
                }
            }
            break;
        }
        var0_2 = lh.a;
        if (var2) {
            throw null;
lbl37:
            // 10 sources

            return;
        }
        if (var0_2 || var0_2) ** GOTO lbl37
        v5 /* !! */  = lh.po;
        if (true) ** GOTO lbl44
        block54: while (true) {
            v5 /* !! */  = (long)(lh.ifas("ifub", ifax(int ), (int)62) - lh.ifas("iftz", ifax(int ), (int)61));
lbl44:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -282362007: {
                    continue block54;
                }
                case 1132073658: {
                    break block54;
                }
            }
            break;
        }
        if (lh.uniformBuffer == null) ** GOTO lbl81
        if (var0_2 || var0_2) ** GOTO lbl37
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = lh.po - lh.ifas("ifue", ifax(int ), (int)63)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == lh.ifas("ifuf", ifap(int ), (int)162)) break;
                    v6 /* !! */  = (long)lh.ifas("ifuh", ifap(int ), (int)163);
                }
                v7 /* !! */  = lh.po;
                if (true) ** GOTO lbl63
                block56: while (true) {
                    v7 /* !! */  = (long)(lh.ifas("iful", ifax(int ), (int)65) - lh.ifas("ifuj", ifax(int ), (int)64));
lbl63:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -200723480: {
                            continue block56;
                        }
                        case 1132073658: {
                            break block56;
                        }
                    }
                    break;
                }
                lh.uniformBuffer.close();
                if (var0_2 || var0_2) ** GOTO lbl37
                v8 /* !! */  = lh.po;
                if (true) ** GOTO lbl74
                block57: while (true) {
                    v8 /* !! */  = (long)(lh.ifas("ifup", ifax(int ), (int)67) - lh.ifas("ifuo", ifax(int ), (int)66));
lbl74:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -498588327: {
                            continue block57;
                        }
                        case 1132073658: {
                            break block57;
                        }
                    }
                    break;
                }
                lh.uniformBuffer = null;
                if (var0_2) ** GOTO lbl37
lbl81:
                // 2 sources

                if (var0_2 || var0_2) ** GOTO lbl37
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = lh.po - lh.ifas("ifut", ifax(int ), (int)68)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == lh.ifas("ifuv", ifap(int ), (int)164)) break;
                    v9 /* !! */  = (long)lh.ifas("ifux", ifap(int ), (int)165);
                }
                if (lh.uniformData == null) ** GOTO lbl119
                if (var0_2 || var0_2) ** GOTO lbl37
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_3 = lh.po - lh.ifas("ifva", ifax(int ), (int)69)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == lh.ifas("ifvb", ifap(int ), (int)166)) break;
                    v10 /* !! */  = (long)lh.ifas("ifvd", ifap(int ), (int)167);
                }
                v11 /* !! */  = lh.po;
                if (true) ** GOTO lbl98
                block60: while (true) {
                    v11 /* !! */  = (long)(v12 - lh.ifas("ifvf", ifax(int ), (int)70));
lbl98:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -389303575: {
                            v12 = lh.ifas("ifvg", ifax(int ), (int)71);
                            continue block60;
                        }
                        case 43937240: {
                            v12 = lh.ifas("ifvi", ifax(int ), (int)72);
                            continue block60;
                        }
                        case 1132073658: {
                            break block60;
                        }
                        case 1597727145: {
                            v12 = lh.ifas("ifvk", ifax(int ), (int)73);
                            continue block60;
                        }
                    }
                    break;
                }
                MemoryUtil.memFree((Buffer)lh.uniformData);
                if (var0_2 || var0_2) ** GOTO lbl37
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_4 = lh.po - lh.ifas("ifvn", ifax(int ), (int)74)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == lh.ifas("ifvo", ifap(int ), (int)168)) break;
                    v13 /* !! */  = (long)lh.ifas("ifvq", ifap(int ), (int)169);
                }
                lh.uniformData = null;
                if (var0_2) ** GOTO lbl37
lbl119:
                // 2 sources

                if (var0_2 || var0_2) ** GOTO lbl37
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_5 = lh.po - lh.ifas("ifvt", ifax(int ), (int)75)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == lh.ifas("ifvw", ifap(int ), (int)170)) break;
                    v14 /* !! */  = (long)lh.ifas("ifvx", ifap(int ), (int)171);
                }
                lh.pipeline = null;
                if (!var0_2 && !var0_2) ** break;
                ** continue;
                return;
            }
lbl129:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)lh.ifas("ifvz", ifap(int ), (int)172);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl156
            }
            case 1: {
                var1_1 /* !! */  = (int)lh.ifas("ifwb", ifap(int ), (int)173);
                if (var2) {
                    throw null;
                }
            }
lbl138:
            // 4 sources

            case 2: {
                var1_1 /* !! */  = (int)lh.ifas("ifwe", ifap(int ), (int)174);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl148
            }
            case 3: {
                var1_1 /* !! */  = (int)lh.ifas("ifwg", ifap(int ), (int)175);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl209
            }
lbl148:
            // 4 sources

            case 4: {
                var1_1 /* !! */  = (int)lh.ifas("ifwi", ifap(int ), (int)176);
                if (!var2) break;
                throw null;
            }
lbl152:
            // 2 sources

            case 5: {
                var1_1 /* !! */  = (int)lh.ifas("ifwk", ifap(int ), (int)177);
                if (!var2) ** GOTO lbl148
                throw null;
            }
lbl156:
            // 2 sources

            case 6: {
                var1_1 /* !! */  = (int)lh.ifas("ifwm", ifap(int ), (int)178);
                if (!var2) ** GOTO lbl152
                throw null;
            }
            case 7: {
                var1_1 /* !! */  = (int)lh.ifas("ifwp", ifap(int ), (int)179);
                if (!var2) break;
                throw null;
            }
            case 8: {
                var1_1 /* !! */  = (int)lh.ifas("ifwr", ifap(int ), (int)180);
                if (var2) {
                    throw null;
                }
            }
            case 9: {
                var1_1 /* !! */  = (int)lh.ifas("ifwt", ifap(int ), (int)181);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl192
            }
            case 10: {
                var1_1 /* !! */  = (int)lh.ifas("ifwv", ifap(int ), (int)182);
                if (!var2) ** GOTO lbl148
                throw null;
            }
lbl177:
            // 2 sources

            case 11: {
                var1_1 /* !! */  = (int)lh.ifas("ifwx", ifap(int ), (int)183);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl209
            }
lbl182:
            // 2 sources

            case 12: {
                var1_1 /* !! */  = (int)lh.ifas("ifxa", ifap(int ), (int)184);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 13: {
                var1_1 /* !! */  = (int)lh.ifas("ifxc", ifap(int ), (int)185);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl205
            }
lbl192:
            // 2 sources

            case 14: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)lh.ifas("ifxe", ifap(int ), (int)186);
                    if (!var2) ** GOTO lbl182
                    throw null;
                }
            }
lbl197:
            // 2 sources

            case 15: {
                var1_1 /* !! */  = (int)lh.ifas("ifxg", ifap(int ), (int)187);
                if (!var2) ** GOTO lbl129
                throw null;
            }
lbl201:
            // 2 sources

            case 16: {
                var1_1 /* !! */  = (int)lh.ifas("ifxi", ifap(int ), (int)188);
                if (!var2) ** GOTO lbl138
                throw null;
            }
lbl205:
            // 2 sources

            case 17: {
                var1_1 /* !! */  = (int)lh.ifas("ifxk", ifap(int ), (int)189);
                if (!var2) ** GOTO lbl177
                throw null;
            }
lbl209:
            // 3 sources

            case 18: {
                var1_1 /* !! */  = (int)lh.ifas("ifxm", ifap(int ), (int)190);
                if (!var2) ** GOTO lbl201
                throw null;
            }
            case 19: 
        }
        var1_1 /* !! */  = (int)lh.ifas("ifxo", ifap(int ), (int)191);
        ** while (!var2)
lbl216:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ifzy() {
        lh.ifar[0] = -2028495448;
        lh.ifar[1] = -693676392;
        lh.ifar[2] = -1988338147;
        lh.ifar[3] = -680113041;
        lh.ifar[4] = 401310989;
        lh.ifar[5] = -134915508;
        lh.ifar[6] = -397924627;
        lh.ifar[7] = -1747743969;
        lh.ifar[8] = -1296867633;
        lh.ifar[9] = 1305920612;
        lh.ifar[10] = -1985735464;
        lh.ifar[11] = -203509542;
        lh.ifar[12] = -829288360;
        lh.ifar[13] = -200793626;
        lh.ifar[14] = 139769797;
        lh.ifar[15] = -1736250915;
        lh.ifar[16] = 838473643;
        lh.ifar[17] = -632337083;
        lh.ifar[18] = 533166939;
        lh.ifar[19] = -1861139616;
        lh.ifar[20] = -930600119;
        lh.ifar[21] = 1715930875;
        lh.ifar[22] = -1617081125;
        lh.ifar[23] = -357637406;
        lh.ifar[24] = 1511757725;
        lh.ifar[25] = 402932689;
        lh.ifar[26] = 170328935;
        lh.ifar[27] = -787106037;
        lh.ifar[28] = 286081301;
        lh.ifar[29] = 1798966402;
        lh.ifar[30] = -1725733770;
        lh.ifar[31] = 245304192;
        lh.ifar[32] = 1511080279;
        lh.ifar[33] = -703984797;
        lh.ifar[34] = 272429815;
        lh.ifar[35] = -764367585;
        lh.ifar[36] = -117646745;
        lh.ifar[37] = -1218254056;
        lh.ifar[38] = 1552200067;
        lh.ifar[39] = 30198015;
        lh.ifar[40] = 998185882;
        lh.ifar[41] = -1224196690;
        lh.ifar[42] = 1996282447;
        lh.ifar[43] = -582795947;
        lh.ifar[44] = -512095378;
        lh.ifar[45] = 711152911;
        lh.ifar[46] = 2055639495;
        lh.ifar[47] = -1883866256;
        lh.ifar[48] = -2005944989;
        lh.ifar[49] = 1249247745;
        lh.ifar[50] = -1285480285;
        lh.ifar[51] = 323395288;
        lh.ifar[52] = -1694788109;
        lh.ifar[53] = -2082975116;
        lh.ifar[54] = -2125802693;
        lh.ifar[55] = 982658620;
        lh.ifar[56] = 913175354;
        lh.ifar[57] = 2068044375;
        lh.ifar[58] = 104925790;
        lh.ifar[59] = 51101111;
        lh.ifar[60] = -1212478485;
        lh.ifar[61] = -729159293;
        lh.ifar[62] = 2012218722;
        lh.ifar[63] = 1402007892;
        lh.ifar[64] = 1471791495;
        lh.ifar[65] = 102546392;
        lh.ifar[66] = 193771900;
        lh.ifar[67] = 2031133652;
        lh.ifar[68] = 962998731;
        lh.ifar[69] = 1345914789;
        lh.ifar[70] = -2069607855;
        lh.ifar[71] = -609864274;
        lh.ifar[72] = 1596978025;
        lh.ifar[73] = -2018537907;
        lh.ifar[74] = 873592780;
        lh.ifar[75] = -1737734058;
        lh.ifar[76] = 413329915;
        lh.ifar[77] = 1914999590;
        lh.ifar[78] = -1778019022;
        lh.ifar[79] = -1213634111;
        lh.ifar[80] = -885725900;
        lh.ifar[81] = -560636764;
        lh.ifar[82] = -99492494;
        lh.ifar[83] = 807236649;
        lh.ifar[84] = 519143256;
        lh.ifar[85] = -1085135946;
        lh.ifar[86] = -2015676223;
        lh.ifar[87] = 1734256141;
        lh.ifar[88] = -446632211;
        lh.ifar[89] = 1151145327;
        lh.ifar[90] = 729073510;
        lh.ifar[91] = 1084339835;
        lh.ifar[92] = -845299790;
        lh.ifar[93] = 654658281;
        lh.ifar[94] = 922928594;
        lh.ifar[95] = 1865968017;
        lh.ifar[96] = -1621580080;
        lh.ifar[97] = -258024603;
        lh.ifar[98] = -518611469;
        lh.ifar[99] = -859412160;
    }

    private static /* synthetic */ void ifzl() {
        lh.ifaq[0] = -2028495447;
        lh.ifaq[1] = -693676391;
        lh.ifaq[2] = -1988338145;
        lh.ifaq[3] = 680113040;
        lh.ifaq[4] = -293573716;
        lh.ifaq[5] = 134915507;
        lh.ifaq[6] = 980209775;
        lh.ifaq[7] = 1747743968;
        lh.ifaq[8] = 1473046840;
        lh.ifaq[9] = -1305920613;
        lh.ifaq[10] = 337847214;
        lh.ifaq[11] = 203509541;
        lh.ifaq[12] = -868053141;
        lh.ifaq[13] = 200793625;
        lh.ifaq[14] = 1615635767;
        lh.ifaq[15] = -1736250916;
        lh.ifaq[16] = -1578708574;
        lh.ifaq[17] = 632337082;
        lh.ifaq[18] = -1521793452;
        lh.ifaq[19] = -1861139615;
        lh.ifaq[20] = 650635156;
        lh.ifaq[21] = -1715930876;
        lh.ifaq[22] = -1611647263;
        lh.ifaq[23] = 0x15511D1D;
        lh.ifaq[24] = 1766121882;
        lh.ifaq[25] = 402932688;
        lh.ifaq[26] = 1207389141;
        lh.ifaq[27] = -787106037;
        lh.ifaq[28] = 286081300;
        lh.ifaq[29] = -1666344456;
        lh.ifaq[30] = 1725733769;
        lh.ifaq[31] = 1627449735;
        lh.ifaq[32] = -1511080280;
        lh.ifaq[33] = -1975932144;
        lh.ifaq[34] = 272429814;
        lh.ifaq[35] = -1499464653;
        lh.ifaq[36] = -117646609;
        lh.ifaq[37] = -1218253896;
        lh.ifaq[38] = -1552200068;
        lh.ifaq[39] = -1249602375;
        lh.ifaq[40] = 998185881;
        lh.ifaq[41] = -1224196701;
        lh.ifaq[42] = 1996282436;
        lh.ifaq[43] = -582795946;
        lh.ifaq[44] = -512095383;
        lh.ifaq[45] = 711152901;
        lh.ifaq[46] = 2055639491;
        lh.ifaq[47] = -1883866254;
        lh.ifaq[48] = -2005944988;
        lh.ifaq[49] = 1249247752;
        lh.ifaq[50] = -1285480282;
        lh.ifaq[51] = 323395294;
        lh.ifaq[52] = -1694788098;
        lh.ifaq[53] = -2082975108;
        lh.ifaq[54] = -2125802629;
        lh.ifaq[55] = 982658652;
        lh.ifaq[56] = 913175354;
        lh.ifaq[57] = 2068044372;
        lh.ifaq[58] = -104925791;
        lh.ifaq[59] = 51101110;
        lh.ifaq[60] = -1212478469;
        lh.ifaq[61] = -729159300;
        lh.ifaq[62] = 881788258;
        lh.ifaq[63] = 1402007900;
        lh.ifaq[64] = 1471791480;
        lh.ifaq[65] = 1164164056;
        lh.ifaq[66] = 193771907;
        lh.ifaq[67] = 980394964;
        lh.ifaq[68] = 962998739;
        lh.ifaq[69] = 1345914714;
        lh.ifaq[70] = -941929903;
        lh.ifaq[71] = -609864274;
        lh.ifaq[72] = 1596978031;
        lh.ifaq[73] = -2018537902;
        lh.ifaq[74] = 873592775;
        lh.ifaq[75] = -1737734020;
        lh.ifaq[76] = 413329884;
        lh.ifaq[77] = 1914999583;
        lh.ifaq[78] = -1778018959;
        lh.ifaq[79] = -1213634158;
        lh.ifaq[80] = -885725856;
        lh.ifaq[81] = -560636697;
        lh.ifaq[82] = -99492533;
        lh.ifaq[83] = 807236641;
        lh.ifaq[84] = 519143263;
        lh.ifaq[85] = -1085135961;
        lh.ifaq[86] = -2015676189;
        lh.ifaq[87] = 1734256165;
        lh.ifaq[88] = -446632232;
        lh.ifaq[89] = 1151145275;
        lh.ifaq[90] = 729073518;
        lh.ifaq[91] = 1084339795;
        lh.ifaq[92] = -845299802;
        lh.ifaq[93] = 654658246;
        lh.ifaq[94] = 922928538;
        lh.ifaq[95] = 1865968020;
        lh.ifaq[96] = -1621580057;
        lh.ifaq[97] = -258024638;
        lh.ifaq[98] = -518611459;
        lh.ifaq[99] = -859412142;
    }

    private static /* synthetic */ float iflu(int n2) {
        return Float.intBitsToFloat(ifaq[n2] ^ ifar[n2]);
    }

    private static /* synthetic */ void igad() {
        lh.ifar[100] = 919135823;
        lh.ifar[101] = -2102956873;
        lh.ifar[102] = -643155511;
        lh.ifar[103] = 216294995;
        lh.ifar[104] = 2021323723;
        lh.ifar[105] = 1413015008;
        lh.ifar[106] = 1877306168;
        lh.ifar[107] = -1125792337;
        lh.ifar[108] = -2066327962;
        lh.ifar[109] = -593352708;
        lh.ifar[110] = -1171161824;
        lh.ifar[111] = -17474084;
        lh.ifar[112] = 1666117632;
        lh.ifar[113] = 1394078046;
        lh.ifar[114] = -1110687318;
        lh.ifar[115] = -1878914876;
        lh.ifar[116] = 1808082341;
        lh.ifar[117] = -739356935;
        lh.ifar[118] = 609038821;
        lh.ifar[119] = 540806585;
        lh.ifar[120] = -723805369;
        lh.ifar[121] = 598556673;
        lh.ifar[122] = -375098736;
        lh.ifar[123] = -764368964;
        lh.ifar[124] = -415205716;
        lh.ifar[125] = -1470533679;
        lh.ifar[126] = -314256839;
        lh.ifar[127] = 1470180347;
        lh.ifar[128] = -2091688535;
        lh.ifar[129] = -478926321;
        lh.ifar[130] = 581375110;
        lh.ifar[131] = -704146277;
        lh.ifar[132] = 2003870608;
        lh.ifar[133] = 969141517;
        lh.ifar[134] = -2124013870;
        lh.ifar[135] = -443386952;
        lh.ifar[136] = -591570458;
        lh.ifar[137] = 1260994162;
        lh.ifar[138] = -518465029;
        lh.ifar[139] = -201420119;
        lh.ifar[140] = -2049492903;
        lh.ifar[141] = -1965447655;
        lh.ifar[142] = -905454215;
        lh.ifar[143] = 1750385032;
        lh.ifar[144] = -377057296;
        lh.ifar[145] = 1502933816;
        lh.ifar[146] = 1865037747;
        lh.ifar[147] = -1258906896;
        lh.ifar[148] = -1161839228;
        lh.ifar[149] = 638005188;
        lh.ifar[150] = -1867126899;
        lh.ifar[151] = 147669000;
        lh.ifar[152] = 572837742;
        lh.ifar[153] = 1036772884;
        lh.ifar[154] = -700064955;
        lh.ifar[155] = -1747365696;
        lh.ifar[156] = -753970559;
        lh.ifar[157] = 430808260;
        lh.ifar[158] = 1029736575;
        lh.ifar[159] = 563323994;
        lh.ifar[160] = 113383139;
        lh.ifar[161] = 175322633;
        lh.ifar[162] = -1481042269;
        lh.ifar[163] = -1436410942;
        lh.ifar[164] = -443851359;
        lh.ifar[165] = 1900241467;
        lh.ifar[166] = -2053101256;
        lh.ifar[167] = -621765666;
        lh.ifar[168] = -298506540;
        lh.ifar[169] = 1023575328;
        lh.ifar[170] = 1399001102;
        lh.ifar[171] = -2100722768;
        lh.ifar[172] = -470437946;
        lh.ifar[173] = 1330514143;
        lh.ifar[174] = -551401747;
        lh.ifar[175] = -573891786;
        lh.ifar[176] = 1225638747;
        lh.ifar[177] = 1001231593;
        lh.ifar[178] = 459918921;
        lh.ifar[179] = 1010367000;
        lh.ifar[180] = -1182648028;
        lh.ifar[181] = 460920576;
        lh.ifar[182] = -1656040199;
        lh.ifar[183] = 887492880;
        lh.ifar[184] = -928831920;
        lh.ifar[185] = 1813384443;
        lh.ifar[186] = 1965912164;
        lh.ifar[187] = -1187840976;
        lh.ifar[188] = -1663115741;
        lh.ifar[189] = -1513181593;
        lh.ifar[190] = 159771736;
        lh.ifar[191] = -1989576666;
        lh.ifar[192] = 703513626;
        lh.ifar[193] = -1560057919;
        lh.ifar[194] = 19139761;
        lh.ifar[195] = 1589382967;
        lh.ifar[196] = 1130323888;
        lh.ifar[197] = 1529371948;
        lh.ifar[198] = -107643491;
        lh.ifar[199] = 1001669382;
    }
}

