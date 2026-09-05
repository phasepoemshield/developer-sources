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
 *  com.mojang.blaze3d.vertex.VertexFormatElement
 *  net.minecraft.class_10789
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package ruhack.phobia;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.ByteBuffer;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Supplier;
import net.minecraft.class_10789;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import ruhack.phobia.om;

public final class lz {
    private static final float[] souls;
    private static final int UNIFORM_SIZE = 128;
    private static double cameraZ;
    private static GpuBuffer vertexBuffer;
    private static double cameraX;
    private static int soulCount;
    private static boolean batchIgnoreDepth;
    private static GpuBuffer uniformBuffer;
    private static final int VERTEX_SIZE = 24;
    private static long[] htff;
    public static final int b;
    private static double cameraY;
    public static final boolean a;
    private static final int MAX_SOULS = 1024;
    private static RenderPipeline pipeline;
    public static final boolean c;
    private static final Matrix4f inverseView;
    private static Matrix4f projection;
    private static final class_310 mc;
    private static int[] htex;
    private static final float[] QUAD_U;
    protected static final long oy = 7321411256598478026L;
    private static final float[] QUAD_V;
    private static final Matrix4f combined;
    private static int[] htey;
    private static long[] htfe;
    private static Matrix4f view;

    public static /* synthetic */ CallSite htez(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$init$1() {
        v0 /* !! */  = lz.oy;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(lz.htez("hudp", htfd(int ), (int)215) - lz.htez("hudo", htfd(int ), (int)214));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2050796070: {
                    continue block21;
                }
                case 1410940106: {
                    break block21;
                }
            }
            break;
        }
        var2 = lz.c;
        v1 /* !! */  = lz.oy;
        if (true) ** GOTO lbl15
        block22: while (true) {
            v1 /* !! */  = (long)(v2 - lz.htez("hudq", htfd(int ), (int)216));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -998479914: {
                    v2 = lz.htez("hudr", htfd(int ), (int)217);
                    continue block22;
                }
                case 143921323: {
                    v2 = lz.htez("huds", htfd(int ), (int)218);
                    continue block22;
                }
                case 350975266: {
                    v2 = lz.htez("hudt", htfd(int ), (int)219);
                    continue block22;
                }
                case 1410940106: {
                    break block22;
                }
            }
            break;
        }
        var1_1 /* !! */  = lz.b;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = lz.oy;
                if (true) ** GOTO lbl35
                block23: while (true) {
                    v3 /* !! */  = (long)(v4 - lz.htez("hudu", htfd(int ), (int)220));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -337330937: {
                            v4 = lz.htez("hudv", htfd(int ), (int)221);
                            continue block23;
                        }
                        case 1089926278: {
                            v4 = lz.htez("hudw", htfd(int ), (int)222);
                            continue block23;
                        }
                        case 1410940106: {
                            break block23;
                        }
                    }
                    break;
                }
                var0_2 = lz.a;
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                return "Soul3D Uniforms";
            }
            case 0: {
                var1_1 /* !! */  = (int)lz.htez("hudx", htew(int ), (int)351);
                if (!var2) break;
                throw null;
            }
            case 1: {
                var1_1 /* !! */  = (int)lz.htez("hudy", htew(int ), (int)352);
                if (var2) {
                    throw null;
                }
            }
            case 2: {
                var1_1 /* !! */  = (int)lz.htez("hudz", htew(int ), (int)353);
                if (!var2) break;
                throw null;
            }
            case 3: 
        }
        do {
            var1_1 /* !! */  = (int)lz.htez("huea", htew(int ), (int)354);
        } while (!var2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$end$0() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lz.oy - lz.htez("hueb", htfd(int ), (int)223)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == lz.htez("huec", htew(int ), (int)355)) break;
            v0 /* !! */  = (long)lz.htez("hued", htew(int ), (int)356);
        }
        var2 = lz.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = lz.oy - lz.htez("huee", htfd(int ), (int)224)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == lz.htez("huef", htew(int ), (int)357)) break;
            v1 /* !! */  = (long)lz.htez("hueg", htew(int ), (int)358);
        }
        var1_1 /* !! */  = lz.b;
        v2 /* !! */  = lz.oy;
        if (true) ** GOTO lbl19
        block13: while (true) {
            v2 /* !! */  = (long)(v3 - lz.htez("hueh", htfd(int ), (int)225));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1620421467: {
                    v3 = lz.htez("huei", htfd(int ), (int)226);
                    continue block13;
                }
                case 293271142: {
                    v3 = lz.htez("huej", htfd(int ), (int)227);
                    continue block13;
                }
                case 1410940106: {
                    break block13;
                }
            }
            break;
        }
        var0_2 = lz.a;
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
                return "TargetESP Souls";
lbl37:
                // 2 sources

                case 0: {
                    var1_1 /* !! */  = (int)lz.htez("huek", htew(int ), (int)359);
                    if (var2) {
                        throw null;
                    }
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var1_1 /* !! */  = (int)lz.htez("huel", htew(int ), (int)360);
                        if (!var2) ** GOTO lbl-1000
                        throw null;
                    }
                }
                case 2: {
                    var1_1 /* !! */  = (int)lz.htez("huem", htew(int ), (int)361);
                    if (!var2) ** GOTO lbl37
                    throw null;
                }
                case 3: 
            }
        }
        var1_1 /* !! */  = (int)lz.htez("huen", htew(int ), (int)362);
        ** while (!var2)
lbl53:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void huer() {
        lz.htex[300] = -2130394819;
        lz.htex[301] = 2018414456;
        lz.htex[302] = 1543928141;
        lz.htex[303] = 1105721808;
        lz.htex[304] = 796454856;
        lz.htex[305] = -279561119;
        lz.htex[306] = 1928310776;
        lz.htex[307] = 953559947;
        lz.htex[308] = -744602370;
        lz.htex[309] = 928126009;
        lz.htex[310] = -314492255;
        lz.htex[311] = 1143306489;
        lz.htex[312] = 1160983069;
        lz.htex[313] = 391495815;
        lz.htex[314] = -619760284;
        lz.htex[315] = -2099460830;
        lz.htex[316] = -407303388;
        lz.htex[317] = -1614861828;
        lz.htex[318] = 19075850;
        lz.htex[319] = 875624383;
        lz.htex[320] = -1018086655;
        lz.htex[321] = 168796266;
        lz.htex[322] = -2002622347;
        lz.htex[323] = -11148587;
        lz.htex[324] = 2136136358;
        lz.htex[325] = -1222147472;
        lz.htex[326] = 1102267493;
        lz.htex[327] = 1952858709;
        lz.htex[328] = -304622196;
        lz.htex[329] = 269737806;
        lz.htex[330] = -2087488107;
        lz.htex[331] = 801455962;
        lz.htex[332] = 466021330;
        lz.htex[333] = 898246878;
        lz.htex[334] = 1063147856;
        lz.htex[335] = -350365136;
        lz.htex[336] = -1941341703;
        lz.htex[337] = -1758253873;
        lz.htex[338] = 1201091889;
        lz.htex[339] = 593088008;
        lz.htex[340] = 737471368;
        lz.htex[341] = -1649429449;
        lz.htex[342] = 307929124;
        lz.htex[343] = -448465139;
        lz.htex[344] = 1661611095;
        lz.htex[345] = 1398198677;
        lz.htex[346] = -208167828;
        lz.htex[347] = 1109093738;
        lz.htex[348] = -627569925;
        lz.htex[349] = 1901180262;
        lz.htex[350] = 496791322;
        lz.htex[351] = -428410386;
        lz.htex[352] = 592490981;
        lz.htex[353] = 767538338;
        lz.htex[354] = 1788045738;
        lz.htex[355] = -1365697713;
        lz.htex[356] = 2041580530;
        lz.htex[357] = -316452024;
        lz.htex[358] = 365822815;
        lz.htex[359] = 1426753181;
        lz.htex[360] = -1638711883;
        lz.htex[361] = 1696915490;
        lz.htex[362] = -1087637825;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static void putMatrix(ByteBuffer var0, Matrix4f var1_1) {
        v0 /* !! */  = lz.oy;
        block123: while (true) {
            switch ((int)v0 /* !! */ ) {
                case -991175487: {
                    v0 /* !! */  = (long)(lz.htez("htyl", htfd(int ), (int)129) - lz.htez("htyk", htfd(int ), (int)128));
                    continue block123;
                }
                case 1410940106: {
                    break block123;
                }
            }
            break;
        }
        var4_2 = lz.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = lz.oy - lz.htez("htym", htfd(int ), (int)130)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == lz.htez("htyn", htew(int ), (int)303)) break;
            v1 /* !! */  = (long)lz.htez("htyo", htew(int ), (int)304);
        }
        var3_3 /* !! */  = lz.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = lz.oy - lz.htez("htyp", htfd(int ), (int)131)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == lz.htez("htyq", htew(int ), (int)305)) {
                var2_4 = lz.a;
                if (var4_2) {
                    throw null;
                }
                break;
            }
            v2 /* !! */  = (long)lz.htez("htyr", htew(int ), (int)306);
        }
        if (var2_4 || var2_4) return;
        v3 /* !! */  = lz.oy;
        block126: while (true) {
            switch ((int)v3 /* !! */ ) {
                case -860687733: {
                    v3 /* !! */  = (long)(lz.htez("htyt", htfd(int ), (int)133) - lz.htez("htys", htfd(int ), (int)132));
                    continue block126;
                }
                case 1410940106: {
                    break block126;
                }
            }
            break;
        }
        v4 = var1_1.m00();
        v5 /* !! */  = lz.oy;
        if (true) ** GOTO lbl39
        block127: while (true) {
            v5 /* !! */  = (long)(v6 - lz.htez("htyu", htfd(int ), (int)134));
lbl39:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1711994106: {
                    v6 = lz.htez("htyv", htfd(int ), (int)135);
                    continue block127;
                }
                case 706360850: {
                    v6 = lz.htez("htyw", htfd(int ), (int)136);
                    continue block127;
                }
                case 1410940106: {
                    break block127;
                }
            }
            break;
        }
        v7 = var0.putFloat(v4);
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_3 = lz.oy - lz.htez("htyx", htfd(int ), (int)137)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == lz.htez("htyy", htew(int ), (int)307)) break;
            v8 /* !! */  = (long)lz.htez("htyz", htew(int ), (int)308);
        }
        v9 = var1_1.m01();
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_4 = lz.oy - lz.htez("htza", htfd(int ), (int)138)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == lz.htez("htzb", htew(int ), (int)309)) break;
            v10 /* !! */  = (long)lz.htez("htzc", htew(int ), (int)310);
        }
        v11 = v7.putFloat(v9);
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_5 = lz.oy - lz.htez("htzd", htfd(int ), (int)139)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == lz.htez("htze", htew(int ), (int)311)) break;
            v12 /* !! */  = (long)lz.htez("htzf", htew(int ), (int)312);
        }
        v13 = var1_1.m02();
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_6 = lz.oy - lz.htez("htzg", htfd(int ), (int)140)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == lz.htez("htzh", htew(int ), (int)313)) break;
            v14 /* !! */  = (long)lz.htez("htzi", htew(int ), (int)314);
        }
        v15 = v11.putFloat(v13);
        v16 /* !! */  = lz.oy;
        block132: while (true) {
            switch ((int)v16 /* !! */ ) {
                case -485984743: {
                    v16 /* !! */  = (long)(lz.htez("htzk", htfd(int ), (int)142) - lz.htez("htzj", htfd(int ), (int)141));
                    continue block132;
                }
                case 1410940106: {
                    break block132;
                }
            }
            break;
        }
        v17 = var1_1.m03();
        v18 /* !! */  = lz.oy;
        if (true) ** GOTO lbl86
        block133: while (true) {
            v18 /* !! */  = (long)(v19 - lz.htez("htzl", htfd(int ), (int)143));
lbl86:
            // 2 sources

            switch ((int)v18 /* !! */ ) {
                case -2081221643: {
                    v19 = lz.htez("htzm", htfd(int ), (int)144);
                    continue block133;
                }
                case 85752786: {
                    v19 = lz.htez("htzn", htfd(int ), (int)145);
                    continue block133;
                }
                case 1159239391: {
                    v19 = lz.htez("htzo", htfd(int ), (int)146);
                    continue block133;
                }
                case 1410940106: {
                    break block133;
                }
            }
            break;
        }
        v15.putFloat(v17);
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block134: while (true) {
            block178: {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var2_4 || var2_4) return;
                        while (true) {
                            if ((v20 /* !! */  = (cfr_temp_7 = lz.oy - lz.htez("htzp", htfd(int ), (int)147)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                            if (v20 /* !! */  != lz.htez("htzq", htew(int ), (int)315)) ** GOTO lbl112
                            v21 = var1_1.m10();
                            v22 /* !! */  = lz.oy;
                            if (true) ** GOTO lbl168
lbl112:
                            // 1 sources

                            v20 /* !! */  = (long)lz.htez("htzr", htew(int ), (int)316);
                        }
                    }
                    case 0: {
                        var3_3 /* !! */  = (int)lz.htez("hucp", htew(int ), (int)331);
                        cfr_temp_0 = 8;
                        if (var4_2) {
                            throw null;
                        }
                        break block178;
                    }
                    case 1: {
                        var3_3 /* !! */  = (int)lz.htez("hucq", htew(int ), (int)332);
                        cfr_temp_0 = 6;
                        if (var4_2) {
                            throw null;
                        }
                        break block178;
                    }
                    case 2: {
                        ** GOTO lbl161
                    }
                    case 4: {
                        var3_3 /* !! */  = (int)lz.htez("huct", htew(int ), (int)335);
                        cfr_temp_0 = 10;
                        if (var4_2) {
                            throw null;
                        }
                        break block178;
                    }
                    case 5: {
                        var3_3 /* !! */  = (int)lz.htez("hucu", htew(int ), (int)336);
                        if (var4_2) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 7: {
                        var3_3 /* !! */  = (int)lz.htez("hucw", htew(int ), (int)338);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 6: {
                        var3_3 /* !! */  = (int)lz.htez("hucv", htew(int ), (int)337);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 8: {
                        var3_3 /* !! */  = (int)lz.htez("hucx", htew(int ), (int)339);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 9: {
                        var3_3 /* !! */  = (int)lz.htez("hucy", htew(int ), (int)340);
                        cfr_temp_0 = 3;
                        if (var4_2) {
                            throw null;
                        }
                        break block178;
                    }
                    case 11: lbl-1000:
                    // 2 sources

                    {
                        var3_3 /* !! */  = (int)lz.htez("huda", htew(int ), (int)342);
                        if (var4_2) {
                            throw null;
                        }
lbl161:
                        // 3 sources

                        var3_3 /* !! */  = (int)lz.htez("hucr", htew(int ), (int)333);
                        cfr_temp_0 = 10;
                        if (var4_2) {
                            throw null;
                        }
                        break block178;
                    }
                    block136: while (true) {
                        v22 /* !! */  = (long)(v23 - lz.htez("htzs", htfd(int ), (int)148));
lbl168:
                        // 2 sources

                        switch ((int)v22 /* !! */ ) {
                            case -1050243643: {
                                v23 = lz.htez("htzt", htfd(int ), (int)149);
                                continue block136;
                            }
                            case -281636376: {
                                v23 = lz.htez("htzu", htfd(int ), (int)150);
                                continue block136;
                            }
                            case 1410940106: {
                                break block136;
                            }
                            case 1655980774: {
                                v23 = lz.htez("htzv", htfd(int ), (int)151);
                                continue block136;
                            }
                        }
                        break;
                    }
                    v24 = var0.putFloat(v21);
                    while (true) {
                        if ((v25 /* !! */  = (cfr_temp_8 = lz.oy - lz.htez("htzw", htfd(int ), (int)152)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                        if (v25 /* !! */  != lz.htez("htzx", htew(int ), (int)317)) ** GOTO lbl187
                        v26 = var1_1.m11();
                        v27 /* !! */  = lz.oy;
                        if (true) ** GOTO lbl191
lbl187:
                        // 1 sources

                        v25 /* !! */  = (long)lz.htez("htzy", htew(int ), (int)318);
                    }
                    block138: while (true) {
                        v27 /* !! */  = (long)(v28 - lz.htez("htzz", htfd(int ), (int)153));
lbl191:
                        // 2 sources

                        switch ((int)v27 /* !! */ ) {
                            case -996274416: {
                                v28 = lz.htez("huaa", htfd(int ), (int)154);
                                continue block138;
                            }
                            case 737060376: {
                                v28 = lz.htez("huab", htfd(int ), (int)155);
                                continue block138;
                            }
                            case 1410940106: {
                                break block138;
                            }
                            case 1435084726: {
                                v28 = lz.htez("huac", htfd(int ), (int)156);
                                continue block138;
                            }
                        }
                        break;
                    }
                    v29 = v24.putFloat(v26);
                    while (true) {
                        if ((v30 /* !! */  = (cfr_temp_9 = lz.oy - lz.htez("huad", htfd(int ), (int)157)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                        if (v30 /* !! */  == lz.htez("huae", htew(int ), (int)319)) break;
                        v30 /* !! */  = (long)lz.htez("huaf", htew(int ), (int)320);
                    }
                    v31 = var1_1.m12();
                    while (true) {
                        if ((v32 /* !! */  = (cfr_temp_10 = lz.oy - lz.htez("huag", htfd(int ), (int)158)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                        if (v32 /* !! */  == lz.htez("huah", htew(int ), (int)321)) break;
                        v32 /* !! */  = (long)lz.htez("huai", htew(int ), (int)322);
                    }
                    v33 = v29.putFloat(v31);
                    while (true) {
                        if ((v34 /* !! */  = (cfr_temp_11 = lz.oy - lz.htez("huaj", htfd(int ), (int)159)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                        if (v34 /* !! */  != lz.htez("huak", htew(int ), (int)323)) ** GOTO lbl222
                        v35 = var1_1.m13();
                        v36 /* !! */  = lz.oy;
                        if (true) ** GOTO lbl226
lbl222:
                        // 1 sources

                        v34 /* !! */  = (long)lz.htez("hual", htew(int ), (int)324);
                    }
                    block142: while (true) {
                        v36 /* !! */  = (long)(v37 - lz.htez("huam", htfd(int ), (int)160));
lbl226:
                        // 2 sources

                        switch ((int)v36 /* !! */ ) {
                            case -822988189: {
                                v37 = lz.htez("huan", htfd(int ), (int)161);
                                continue block142;
                            }
                            case 1410940106: {
                                break block142;
                            }
                            case 1622029811: {
                                v37 = lz.htez("huao", htfd(int ), (int)162);
                                continue block142;
                            }
                        }
                        break;
                    }
                    v33.putFloat(v35);
                    if (var2_4 || var2_4) return;
                    v38 /* !! */  = lz.oy;
                    block143: while (true) {
                        switch ((int)v38 /* !! */ ) {
                            case 819262003: {
                                v38 /* !! */  = (long)(lz.htez("huaq", htfd(int ), (int)164) - lz.htez("huap", htfd(int ), (int)163));
                                continue block143;
                            }
                            case 1410940106: {
                                break block143;
                            }
                        }
                        break;
                    }
                    v39 = var1_1.m20();
                    v40 /* !! */  = lz.oy;
                    if (true) ** GOTO lbl251
                    block144: while (true) {
                        v40 /* !! */  = (long)(v41 - lz.htez("huar", htfd(int ), (int)165));
lbl251:
                        // 2 sources

                        switch ((int)v40 /* !! */ ) {
                            case -1738084414: {
                                v41 = lz.htez("huas", htfd(int ), (int)166);
                                continue block144;
                            }
                            case -800760611: {
                                v41 = lz.htez("huat", htfd(int ), (int)167);
                                continue block144;
                            }
                            case 1410940106: {
                                break block144;
                            }
                            case 1676939456: {
                                v41 = lz.htez("huau", htfd(int ), (int)168);
                                continue block144;
                            }
                        }
                        break;
                    }
                    v42 = var0.putFloat(v39);
                    v43 /* !! */  = lz.oy;
                    if (true) ** GOTO lbl268
                    block145: while (true) {
                        v43 /* !! */  = (long)(v44 - lz.htez("huav", htfd(int ), (int)169));
lbl268:
                        // 2 sources

                        switch ((int)v43 /* !! */ ) {
                            case -1481360167: {
                                v44 = lz.htez("huaw", htfd(int ), (int)170);
                                continue block145;
                            }
                            case -383306333: {
                                v44 = lz.htez("huax", htfd(int ), (int)171);
                                continue block145;
                            }
                            case 1023800984: {
                                v44 = lz.htez("huay", htfd(int ), (int)172);
                                continue block145;
                            }
                            case 1410940106: {
                                break block145;
                            }
                        }
                        break;
                    }
                    v45 = var1_1.m21();
                    v46 /* !! */  = lz.oy;
                    block146: while (true) {
                        switch ((int)v46 /* !! */ ) {
                            case 1017431957: {
                                v46 /* !! */  = (long)(lz.htez("huba", htfd(int ), (int)174) - lz.htez("huaz", htfd(int ), (int)173));
                                continue block146;
                            }
                            case 1410940106: {
                                break block146;
                            }
                        }
                        break;
                    }
                    v47 = v42.putFloat(v45);
                    v48 /* !! */  = lz.oy;
                    block147: while (true) {
                        switch ((int)v48 /* !! */ ) {
                            case 685776302: {
                                v48 /* !! */  = (long)(lz.htez("hubc", htfd(int ), (int)176) - lz.htez("hubb", htfd(int ), (int)175));
                                continue block147;
                            }
                            case 1410940106: {
                                break block147;
                            }
                        }
                        break;
                    }
                    v49 = var1_1.m22();
                    while (true) {
                        if ((v50 /* !! */  = (cfr_temp_12 = lz.oy - lz.htez("hubd", htfd(int ), (int)177)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                        if (v50 /* !! */  != lz.htez("hube", htew(int ), (int)325)) ** GOTO lbl305
                        v51 = v47.putFloat(v49);
                        v52 /* !! */  = lz.oy;
                        if (true) ** GOTO lbl309
lbl305:
                        // 1 sources

                        v50 /* !! */  = (long)lz.htez("hubf", htew(int ), (int)326);
                    }
                    block149: while (true) {
                        v52 /* !! */  = (long)(v53 - lz.htez("hubg", htfd(int ), (int)178));
lbl309:
                        // 2 sources

                        switch ((int)v52 /* !! */ ) {
                            case -1666687477: {
                                v53 = lz.htez("hubh", htfd(int ), (int)179);
                                continue block149;
                            }
                            case -516435459: {
                                v53 = lz.htez("hubi", htfd(int ), (int)180);
                                continue block149;
                            }
                            case -225940120: {
                                v53 = lz.htez("hubj", htfd(int ), (int)181);
                                continue block149;
                            }
                            case 1410940106: {
                                break block149;
                            }
                        }
                        break;
                    }
                    v54 = var1_1.m23();
                    while (true) {
                        if ((v55 /* !! */  = (cfr_temp_13 = lz.oy - lz.htez("hubk", htfd(int ), (int)182)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                        if (v55 /* !! */  == lz.htez("hubl", htew(int ), (int)327)) {
                            v51.putFloat(v54);
                            if (var2_4) return;
                            break;
                        }
                        v55 /* !! */  = (long)lz.htez("hubm", htew(int ), (int)328);
                    }
                    if (var2_4) return;
                    v56 /* !! */  = lz.oy;
                    if (true) ** GOTO lbl335
                    block151: while (true) {
                        v56 /* !! */  = (long)(v57 - lz.htez("hubn", htfd(int ), (int)183));
lbl335:
                        // 2 sources

                        switch ((int)v56 /* !! */ ) {
                            case -1263124561: {
                                v57 = lz.htez("hubo", htfd(int ), (int)184);
                                continue block151;
                            }
                            case 1002486110: {
                                v57 = lz.htez("hubp", htfd(int ), (int)185);
                                continue block151;
                            }
                            case 1410940106: {
                                break block151;
                            }
                        }
                        break;
                    }
                    v58 = var1_1.m30();
                    v59 /* !! */  = lz.oy;
                    if (true) ** GOTO lbl349
                    block152: while (true) {
                        v59 /* !! */  = (long)(v60 - lz.htez("hubq", htfd(int ), (int)186));
lbl349:
                        // 2 sources

                        switch ((int)v59 /* !! */ ) {
                            case -361051547: {
                                v60 = lz.htez("hubr", htfd(int ), (int)187);
                                continue block152;
                            }
                            case 1410940106: {
                                break block152;
                            }
                            case 1726504861: {
                                v60 = lz.htez("hubs", htfd(int ), (int)188);
                                continue block152;
                            }
                            case 2030579059: {
                                v60 = lz.htez("hubt", htfd(int ), (int)189);
                                continue block152;
                            }
                        }
                        break;
                    }
                    v61 = var0.putFloat(v58);
                    v62 /* !! */  = lz.oy;
                    if (true) ** GOTO lbl366
                    block153: while (true) {
                        v62 /* !! */  = (long)(v63 - lz.htez("hubu", htfd(int ), (int)190));
lbl366:
                        // 2 sources

                        switch ((int)v62 /* !! */ ) {
                            case -1310095094: {
                                v63 = lz.htez("hubv", htfd(int ), (int)191);
                                continue block153;
                            }
                            case 14592045: {
                                v63 = lz.htez("hubw", htfd(int ), (int)192);
                                continue block153;
                            }
                            case 1410940106: {
                                break block153;
                            }
                        }
                        break;
                    }
                    v64 = var1_1.m31();
                    while (true) {
                        if ((v65 /* !! */  = (cfr_temp_14 = lz.oy - lz.htez("hubx", htfd(int ), (int)193)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                        if (v65 /* !! */  != lz.htez("huby", htew(int ), (int)329)) ** GOTO lbl382
                        v66 = v61.putFloat(v64);
                        v67 /* !! */  = lz.oy;
                        if (true) ** GOTO lbl386
lbl382:
                        // 1 sources

                        v65 /* !! */  = (long)lz.htez("hubz", htew(int ), (int)330);
                    }
                    block155: while (true) {
                        v67 /* !! */  = (long)(v68 - lz.htez("huca", htfd(int ), (int)194));
lbl386:
                        // 2 sources

                        switch ((int)v67 /* !! */ ) {
                            case -1479190246: {
                                v68 = lz.htez("hucb", htfd(int ), (int)195);
                                continue block155;
                            }
                            case 1410940106: {
                                break block155;
                            }
                            case 1883420698: {
                                v68 = lz.htez("hucc", htfd(int ), (int)196);
                                continue block155;
                            }
                        }
                        break;
                    }
                    v69 = var1_1.m32();
                    v70 /* !! */  = lz.oy;
                    if (true) ** GOTO lbl400
                    block156: while (true) {
                        v70 /* !! */  = (long)(v71 - lz.htez("hucd", htfd(int ), (int)197));
lbl400:
                        // 2 sources

                        switch ((int)v70 /* !! */ ) {
                            case -1848117846: {
                                v71 = lz.htez("huce", htfd(int ), (int)198);
                                continue block156;
                            }
                            case 200359713: {
                                v71 = lz.htez("hucf", htfd(int ), (int)199);
                                continue block156;
                            }
                            case 1410940106: {
                                break block156;
                            }
                            case 1796659968: {
                                v71 = lz.htez("hucg", htfd(int ), (int)200);
                                continue block156;
                            }
                        }
                        break;
                    }
                    v72 = v66.putFloat(v69);
                    v73 /* !! */  = lz.oy;
                    if (true) ** GOTO lbl417
                    block157: while (true) {
                        v73 /* !! */  = (long)(v74 - lz.htez("huch", htfd(int ), (int)201));
lbl417:
                        // 2 sources

                        switch ((int)v73 /* !! */ ) {
                            case -1033509082: {
                                v74 = lz.htez("huci", htfd(int ), (int)202);
                                continue block157;
                            }
                            case 579552077: {
                                v74 = lz.htez("hucj", htfd(int ), (int)203);
                                continue block157;
                            }
                            case 1410940106: {
                                break block157;
                            }
                            case 2023140293: {
                                v74 = lz.htez("huck", htfd(int ), (int)204);
                                continue block157;
                            }
                        }
                        break;
                    }
                    v75 = var1_1.m33();
                    v76 /* !! */  = lz.oy;
                    if (true) ** GOTO lbl434
                    block158: while (true) {
                        v76 /* !! */  = (long)(v77 - lz.htez("hucl", htfd(int ), (int)205));
lbl434:
                        // 2 sources

                        switch ((int)v76 /* !! */ ) {
                            case -1979919222: {
                                v77 = lz.htez("hucm", htfd(int ), (int)206);
                                continue block158;
                            }
                            case 1410940106: {
                                break block158;
                            }
                            case 1981154175: {
                                v77 = lz.htez("hucn", htfd(int ), (int)207);
                                continue block158;
                            }
                            case 1984415707: {
                                v77 = lz.htez("huco", htfd(int ), (int)208);
                                continue block158;
                            }
                        }
                        break;
                    }
                    v72.putFloat(v75);
                    if (!var2_4 && !var2_4) return;
                    return;
                    case 3: {
                        var3_3 /* !! */  = (int)lz.htez("hucs", htew(int ), (int)334);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 10: 
                }
                ** GOTO lbl459
            }
            do {
                if (true) continue block134;
lbl459:
                // 2 sources

                var3_3 /* !! */  = (int)lz.htez("hucz", htew(int ), (int)341);
                cfr_temp_0 = 3;
            } while (!var4_2);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void hues() {
        lz.htey[0] = -1947698179;
        lz.htey[1] = 1467698529;
        lz.htey[2] = -288919309;
        lz.htey[3] = -1888106413;
        lz.htey[4] = 365294197;
        lz.htey[5] = 545317668;
        lz.htey[6] = 642411917;
        lz.htey[7] = 1446270728;
        lz.htey[8] = 933671346;
        lz.htey[9] = 100459631;
        lz.htey[10] = 140223884;
        lz.htey[11] = 1399024847;
        lz.htey[12] = 514320645;
        lz.htey[13] = -217797176;
        lz.htey[14] = 1825112046;
        lz.htey[15] = -1386118850;
        lz.htey[16] = -1564465918;
        lz.htey[17] = 1864258705;
        lz.htey[18] = -1597818745;
        lz.htey[19] = -822300790;
        lz.htey[20] = 287061753;
        lz.htey[21] = -1799390861;
        lz.htey[22] = -1698824328;
        lz.htey[23] = 1143721828;
        lz.htey[24] = 2058754077;
        lz.htey[25] = -1025772950;
        lz.htey[26] = -422385752;
        lz.htey[27] = 151293775;
        lz.htey[28] = -1806983224;
        lz.htey[29] = 1758116012;
        lz.htey[30] = 1738864849;
        lz.htey[31] = -768189222;
        lz.htey[32] = 386482722;
        lz.htey[33] = -567320944;
        lz.htey[34] = 345936469;
        lz.htey[35] = -1933941594;
        lz.htey[36] = -2140058499;
        lz.htey[37] = -1828335358;
        lz.htey[38] = 479064939;
        lz.htey[39] = 163858723;
        lz.htey[40] = -1939398955;
        lz.htey[41] = -1673426146;
        lz.htey[42] = 526793810;
        lz.htey[43] = -117714655;
        lz.htey[44] = -706682031;
        lz.htey[45] = 1938600413;
        lz.htey[46] = 65777211;
        lz.htey[47] = -1502783871;
        lz.htey[48] = -1826830246;
        lz.htey[49] = -1586990286;
        lz.htey[50] = 2089746239;
        lz.htey[51] = -1773552357;
        lz.htey[52] = -1336019018;
        lz.htey[53] = 68039058;
        lz.htey[54] = 404060563;
        lz.htey[55] = -2072742943;
        lz.htey[56] = 2040097493;
        lz.htey[57] = -365337674;
        lz.htey[58] = 1229412857;
        lz.htey[59] = -41032636;
        lz.htey[60] = -1943326613;
        lz.htey[61] = 1447636126;
        lz.htey[62] = -964615815;
        lz.htey[63] = 153809878;
        lz.htey[64] = -366872770;
        lz.htey[65] = -409669671;
        lz.htey[66] = -2036609456;
        lz.htey[67] = -1798276048;
        lz.htey[68] = -1288179136;
        lz.htey[69] = -742431229;
        lz.htey[70] = -278187991;
        lz.htey[71] = 2001984789;
        lz.htey[72] = 1231907296;
        lz.htey[73] = 747107727;
        lz.htey[74] = 1917897610;
        lz.htey[75] = 1521487063;
        lz.htey[76] = 564825756;
        lz.htey[77] = -1873652794;
        lz.htey[78] = 2018836624;
        lz.htey[79] = -1586443527;
        lz.htey[80] = -1458347814;
        lz.htey[81] = -1063734769;
        lz.htey[82] = -1205901089;
        lz.htey[83] = 1523308821;
        lz.htey[84] = 118604280;
        lz.htey[85] = 1643969392;
        lz.htey[86] = -1472028461;
        lz.htey[87] = -1751491072;
        lz.htey[88] = -137952607;
        lz.htey[89] = 301065812;
        lz.htey[90] = -153161733;
        lz.htey[91] = 1625478955;
        lz.htey[92] = -203980190;
        lz.htey[93] = -1103307122;
        lz.htey[94] = -1209891642;
        lz.htey[95] = 1086733387;
        lz.htey[96] = -1634192260;
        lz.htey[97] = -1088549986;
        lz.htey[98] = 1013266302;
        lz.htey[99] = -1230423748;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void setMatrices(Matrix4f var0, Matrix4f var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lz.oy - lz.htez("htfg", htfd(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == lz.htez("htfh", htew(int ), (int)3)) break;
            v0 /* !! */  = (long)lz.htez("htfi", htew(int ), (int)4);
        }
        var4_2 = lz.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = lz.oy - lz.htez("htfj", htfd(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == lz.htez("htfk", htew(int ), (int)5)) break;
            v1 /* !! */  = (long)lz.htez("htfl", htew(int ), (int)6);
        }
        var3_3 = lz.b;
        v2 /* !! */  = lz.oy;
        if (true) ** GOTO lbl19
        block24: while (true) {
            v2 /* !! */  = (long)(v3 - lz.htez("htfm", htfd(int ), (int)2));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1625797265: {
                    v3 = lz.htez("htfn", htfd(int ), (int)3);
                    continue block24;
                }
                case -1156659454: {
                    v3 = lz.htez("htfo", htfd(int ), (int)4);
                    continue block24;
                }
                case 445441664: {
                    v3 = lz.htez("htfp", htfd(int ), (int)5);
                    continue block24;
                }
                case 1410940106: {
                    break block24;
                }
            }
            break;
        }
        var2_4 = lz.a;
        if (var4_2) {
            throw null;
lbl34:
            // 3 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl34
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = lz.oy - lz.htez("htfq", htfd(int ), (int)6)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == lz.htez("htfr", htew(int ), (int)7)) break;
            v4 /* !! */  = (long)lz.htez("htfs", htew(int ), (int)8);
        }
        v5 /* !! */  = lz.oy;
        if (true) ** GOTO lbl47
        block27: while (true) {
            v5 /* !! */  = (long)(v6 - lz.htez("htft", htfd(int ), (int)7));
lbl47:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1566680724: {
                    v6 = lz.htez("htfu", htfd(int ), (int)8);
                    continue block27;
                }
                case -460287684: {
                    v6 = lz.htez("htfv", htfd(int ), (int)9);
                    continue block27;
                }
                case 83169479: {
                    v6 = lz.htez("htfw", htfd(int ), (int)10);
                    continue block27;
                }
                case 1410940106: {
                    break block27;
                }
            }
            break;
        }
        lz.projection.set((Matrix4fc)var0);
        if (var2_4 || var2_4) ** GOTO lbl34
        v7 /* !! */  = lz.oy;
        if (true) ** GOTO lbl66
        block28: while (true) {
            v7 /* !! */  = (long)(lz.htez("htfy", htfd(int ), (int)12) - lz.htez("htfx", htfd(int ), (int)11));
lbl66:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -429948841: {
                    continue block28;
                }
                case 1410940106: {
                    break block28;
                }
            }
            break;
        }
        v8 /* !! */  = lz.oy;
        if (true) ** GOTO lbl75
        block29: while (true) {
            v8 /* !! */  = (long)(v9 - lz.htez("htfz", htfd(int ), (int)13));
lbl75:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1979541363: {
                    v9 = lz.htez("htga", htfd(int ), (int)14);
                    continue block29;
                }
                case -1466944649: {
                    v9 = lz.htez("htgb", htfd(int ), (int)15);
                    continue block29;
                }
                case -182179781: {
                    v9 = lz.htez("htgc", htfd(int ), (int)16);
                    continue block29;
                }
                case 1410940106: {
                    break block29;
                }
            }
            break;
        }
        lz.view.set((Matrix4fc)var1_1);
        ** while (var2_4 || var2_4)
lbl90:
        // 1 sources

    }

    private static /* synthetic */ void hueq() {
        lz.htex[200] = -1690920370;
        lz.htex[201] = -31892606;
        lz.htex[202] = -226527027;
        lz.htex[203] = 88351367;
        lz.htex[204] = 708613834;
        lz.htex[205] = 1144232746;
        lz.htex[206] = 543914568;
        lz.htex[207] = -1327489370;
        lz.htex[208] = 1715970865;
        lz.htex[209] = 639586105;
        lz.htex[210] = -1354377652;
        lz.htex[211] = 1926647865;
        lz.htex[212] = -1686616447;
        lz.htex[213] = 634746988;
        lz.htex[214] = -1668305804;
        lz.htex[215] = -1071057055;
        lz.htex[216] = -1118849504;
        lz.htex[217] = 1016298879;
        lz.htex[218] = -1376636756;
        lz.htex[219] = -1790456773;
        lz.htex[220] = -837961745;
        lz.htex[221] = 978901470;
        lz.htex[222] = 1965431532;
        lz.htex[223] = 919589171;
        lz.htex[224] = 1650232699;
        lz.htex[225] = 2082560806;
        lz.htex[226] = -1272673552;
        lz.htex[227] = 998456670;
        lz.htex[228] = -103015298;
        lz.htex[229] = -211344813;
        lz.htex[230] = 20429460;
        lz.htex[231] = -1846324655;
        lz.htex[232] = 1081917926;
        lz.htex[233] = -192562857;
        lz.htex[234] = -1122822427;
        lz.htex[235] = 1001264683;
        lz.htex[236] = -1230140665;
        lz.htex[237] = -1219890451;
        lz.htex[238] = 778089631;
        lz.htex[239] = 1999334413;
        lz.htex[240] = 1078938961;
        lz.htex[241] = 1974472238;
        lz.htex[242] = -1375897021;
        lz.htex[243] = 406288216;
        lz.htex[244] = -673386256;
        lz.htex[245] = -1035349849;
        lz.htex[246] = 1172666492;
        lz.htex[247] = 1313787218;
        lz.htex[248] = 523928110;
        lz.htex[249] = 1184531925;
        lz.htex[250] = 491073403;
        lz.htex[251] = -719431049;
        lz.htex[252] = 2098724782;
        lz.htex[253] = -1794664015;
        lz.htex[254] = 868276854;
        lz.htex[255] = 1496117644;
        lz.htex[256] = -1738845409;
        lz.htex[257] = -108534036;
        lz.htex[258] = -1980753088;
        lz.htex[259] = -385138632;
        lz.htex[260] = -111100819;
        lz.htex[261] = 1673561370;
        lz.htex[262] = -1276213510;
        lz.htex[263] = -1707632847;
        lz.htex[264] = -467110511;
        lz.htex[265] = 542642515;
        lz.htex[266] = -849487895;
        lz.htex[267] = 1505490271;
        lz.htex[268] = 1105527513;
        lz.htex[269] = -1464249258;
        lz.htex[270] = -187994558;
        lz.htex[271] = -1855677899;
        lz.htex[272] = -316456600;
        lz.htex[273] = -603247166;
        lz.htex[274] = 1128714064;
        lz.htex[275] = -409429393;
        lz.htex[276] = 567964526;
        lz.htex[277] = -945940915;
        lz.htex[278] = -2011796783;
        lz.htex[279] = -352492767;
        lz.htex[280] = 244283491;
        lz.htex[281] = 40676492;
        lz.htex[282] = 958625261;
        lz.htex[283] = -791883686;
        lz.htex[284] = -1030710862;
        lz.htex[285] = 533406291;
        lz.htex[286] = 788702164;
        lz.htex[287] = -123195915;
        lz.htex[288] = -1418106405;
        lz.htex[289] = -1211047095;
        lz.htex[290] = 61869631;
        lz.htex[291] = 115964508;
        lz.htex[292] = -836083351;
        lz.htex[293] = -361695069;
        lz.htex[294] = 1176975818;
        lz.htex[295] = -1269445338;
        lz.htex[296] = 50633165;
        lz.htex[297] = 1732335041;
        lz.htex[298] = -104332672;
        lz.htex[299] = -1018521693;
    }

    private static /* synthetic */ void huep() {
        lz.htex[100] = 414195195;
        lz.htex[101] = 1568405297;
        lz.htex[102] = 1527318646;
        lz.htex[103] = 698130980;
        lz.htex[104] = -1481301753;
        lz.htex[105] = -196831378;
        lz.htex[106] = -746411655;
        lz.htex[107] = 822985839;
        lz.htex[108] = -1943420256;
        lz.htex[109] = 893354600;
        lz.htex[110] = -530182479;
        lz.htex[111] = -467971386;
        lz.htex[112] = -337120719;
        lz.htex[113] = 1143881777;
        lz.htex[114] = -86786430;
        lz.htex[115] = 2056349318;
        lz.htex[116] = -1917278342;
        lz.htex[117] = 1185232676;
        lz.htex[118] = 624789032;
        lz.htex[119] = -117589771;
        lz.htex[120] = 1223909832;
        lz.htex[121] = 142942696;
        lz.htex[122] = -606369113;
        lz.htex[123] = 130731293;
        lz.htex[124] = -392365630;
        lz.htex[125] = 1802027639;
        lz.htex[126] = 750176527;
        lz.htex[127] = -1227067077;
        lz.htex[128] = -540807188;
        lz.htex[129] = -1476075472;
        lz.htex[130] = -1207554667;
        lz.htex[131] = -750456810;
        lz.htex[132] = 706744348;
        lz.htex[133] = -1959682771;
        lz.htex[134] = -1313040249;
        lz.htex[135] = -352922923;
        lz.htex[136] = -1962413850;
        lz.htex[137] = -2068805204;
        lz.htex[138] = -1503566196;
        lz.htex[139] = 240066705;
        lz.htex[140] = 1191306719;
        lz.htex[141] = 555031200;
        lz.htex[142] = -724415625;
        lz.htex[143] = -1299155459;
        lz.htex[144] = 106788443;
        lz.htex[145] = 107702571;
        lz.htex[146] = 1764136364;
        lz.htex[147] = -81305092;
        lz.htex[148] = -727876951;
        lz.htex[149] = 244537053;
        lz.htex[150] = -405195700;
        lz.htex[151] = 370466036;
        lz.htex[152] = -1471522982;
        lz.htex[153] = 1359250271;
        lz.htex[154] = 1423967909;
        lz.htex[155] = 979621716;
        lz.htex[156] = -1136194654;
        lz.htex[157] = 705803694;
        lz.htex[158] = -1649649371;
        lz.htex[159] = 1918575496;
        lz.htex[160] = 1849363525;
        lz.htex[161] = -972514867;
        lz.htex[162] = 544838383;
        lz.htex[163] = 1852653826;
        lz.htex[164] = -1471279018;
        lz.htex[165] = -990578728;
        lz.htex[166] = -1005815446;
        lz.htex[167] = -1376007731;
        lz.htex[168] = -426616773;
        lz.htex[169] = -291714663;
        lz.htex[170] = 1918274947;
        lz.htex[171] = -535000757;
        lz.htex[172] = 760024720;
        lz.htex[173] = 129816097;
        lz.htex[174] = 1133929553;
        lz.htex[175] = 1156219313;
        lz.htex[176] = 1007928794;
        lz.htex[177] = -270291315;
        lz.htex[178] = -1480129820;
        lz.htex[179] = 1607294341;
        lz.htex[180] = -1649328547;
        lz.htex[181] = -1396492449;
        lz.htex[182] = 515743483;
        lz.htex[183] = -2000283486;
        lz.htex[184] = 87223854;
        lz.htex[185] = -1162928358;
        lz.htex[186] = -445233380;
        lz.htex[187] = -159916197;
        lz.htex[188] = -2002519492;
        lz.htex[189] = 1417734853;
        lz.htex[190] = -1912251648;
        lz.htex[191] = 277899923;
        lz.htex[192] = -2129553736;
        lz.htex[193] = -1115655485;
        lz.htex[194] = -122891137;
        lz.htex[195] = 446913962;
        lz.htex[196] = 549454901;
        lz.htex[197] = 1752825388;
        lz.htex[198] = 619822865;
        lz.htex[199] = 918578482;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private lz() {
        var2_1 /* !! */  = lz.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
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
                    var2_1 /* !! */  = (int)lz.htez("htfa", htew(int ), (int)0);
                    continue;
                    break;
                }
            }
            case 1: {
                while (true) {
                    var2_1 /* !! */  = (int)lz.htez("htfb", htew(int ), (int)1);
                }
            }
            case 2: 
        }
        var2_1 /* !! */  = (int)lz.htez("htfc", htew(int ), (int)2);
        ** while (true)
    }

    private static /* synthetic */ void hueu() {
        lz.htey[200] = -1690920357;
        lz.htey[201] = -31892565;
        lz.htey[202] = -226527096;
        lz.htey[203] = 88351411;
        lz.htey[204] = 708613817;
        lz.htey[205] = 1144232720;
        lz.htey[206] = 543914570;
        lz.htey[207] = -1327489386;
        lz.htey[208] = 1715970865;
        lz.htey[209] = 639586063;
        lz.htey[210] = -1354377662;
        lz.htey[211] = 1926647909;
        lz.htey[212] = -1686616374;
        lz.htey[213] = 634746885;
        lz.htey[214] = -1668305916;
        lz.htey[215] = -1071057068;
        lz.htey[216] = -1118849479;
        lz.htey[217] = 1016298860;
        lz.htey[218] = -1376636796;
        lz.htey[219] = -1790456707;
        lz.htey[220] = -837961834;
        lz.htey[221] = 978901377;
        lz.htey[222] = 1965431532;
        lz.htey[223] = 919589160;
        lz.htey[224] = 1650232659;
        lz.htey[225] = 2082560807;
        lz.htey[226] = -1272673616;
        lz.htey[227] = 998456653;
        lz.htey[228] = -103015319;
        lz.htey[229] = -211344885;
        lz.htey[230] = 20429534;
        lz.htey[231] = -1846324650;
        lz.htey[232] = 1081917907;
        lz.htey[233] = -192562937;
        lz.htey[234] = -1122822470;
        lz.htey[235] = 1001264680;
        lz.htey[236] = -1230140609;
        lz.htey[237] = -1219890485;
        lz.htey[238] = 778089630;
        lz.htey[239] = 1082296654;
        lz.htey[240] = 1078938960;
        lz.htey[241] = 191151953;
        lz.htey[242] = 1375897020;
        lz.htey[243] = 2008697445;
        lz.htey[244] = -673386255;
        lz.htey[245] = 1678112710;
        lz.htey[246] = 1172666493;
        lz.htey[247] = -255160068;
        lz.htey[248] = -523928111;
        lz.htey[249] = 1438595444;
        lz.htey[250] = 491073402;
        lz.htey[251] = -572608498;
        lz.htey[252] = -2098724783;
        lz.htey[253] = 1424569903;
        lz.htey[254] = -868276855;
        lz.htey[255] = 1053548433;
        lz.htey[256] = -1738845410;
        lz.htey[257] = 1054131998;
        lz.htey[258] = -1980753087;
        lz.htey[259] = 211877995;
        lz.htey[260] = -111100820;
        lz.htey[261] = -1524735115;
        lz.htey[262] = -1276213509;
        lz.htey[263] = 1033990687;
        lz.htey[264] = -467110512;
        lz.htey[265] = 2123309650;
        lz.htey[266] = -849487895;
        lz.htey[267] = 1505490270;
        lz.htey[268] = 504034603;
        lz.htey[269] = -1464249258;
        lz.htey[270] = -187994557;
        lz.htey[271] = -792953239;
        lz.htey[272] = -316456599;
        lz.htey[273] = -1428039548;
        lz.htey[274] = 1128714065;
        lz.htey[275] = -254163238;
        lz.htey[276] = 567964527;
        lz.htey[277] = 288045954;
        lz.htey[278] = -2011796903;
        lz.htey[279] = -352492768;
        lz.htey[280] = 1707875170;
        lz.htey[281] = 40676493;
        lz.htey[282] = 1548993983;
        lz.htey[283] = -791883662;
        lz.htey[284] = -1030710861;
        lz.htey[285] = 1693060594;
        lz.htey[286] = 788702172;
        lz.htey[287] = -123195931;
        lz.htey[288] = -1418106405;
        lz.htey[289] = -1211047097;
        lz.htey[290] = 61869617;
        lz.htey[291] = 115964497;
        lz.htey[292] = -836083335;
        lz.htey[293] = -361695057;
        lz.htey[294] = 1176975809;
        lz.htey[295] = -1269445332;
        lz.htey[296] = 50633153;
        lz.htey[297] = 1732335050;
        lz.htey[298] = -104332662;
        lz.htey[299] = -1018521696;
    }

    private static /* synthetic */ float htky(int n2) {
        return Float.intBitsToFloat(htex[n2] ^ htey[n2]);
    }

    private static /* synthetic */ void huew() {
        lz.htfe[0] = 1847918995702157211L;
        lz.htfe[1] = 698289413919234785L;
        lz.htfe[2] = 286137254535325588L;
        lz.htfe[3] = 1184448973461859544L;
        lz.htfe[4] = -7902976729091625026L;
        lz.htfe[5] = -484815374832498842L;
        lz.htfe[6] = 244461768080241865L;
        lz.htfe[7] = 7927902455757394494L;
        lz.htfe[8] = 4798778208450409923L;
        lz.htfe[9] = 3124085584566436530L;
        lz.htfe[10] = -3238564989024242454L;
        lz.htfe[11] = 4148014271710668945L;
        lz.htfe[12] = 7746861775866368966L;
        lz.htfe[13] = 8668715757262890121L;
        lz.htfe[14] = 3261883162233240431L;
        lz.htfe[15] = -2697987219405029267L;
        lz.htfe[16] = 7949431297448408210L;
        lz.htfe[17] = -4944445819620028646L;
        lz.htfe[18] = 7146432850089783493L;
        lz.htfe[19] = 6097892442183571531L;
        lz.htfe[20] = 8735823116625790278L;
        lz.htfe[21] = 4520191463067299981L;
        lz.htfe[22] = -6655105808895122158L;
        lz.htfe[23] = -744127089684915987L;
        lz.htfe[24] = 4647366402732681910L;
        lz.htfe[25] = 6626122419579478799L;
        lz.htfe[26] = -80253590469466330L;
        lz.htfe[27] = -256032435757447073L;
        lz.htfe[28] = -970648625865679444L;
        lz.htfe[29] = 5169255825684147720L;
        lz.htfe[30] = -2310951047150958619L;
        lz.htfe[31] = -8180521293378608438L;
        lz.htfe[32] = -5708630237306043758L;
        lz.htfe[33] = 5508023924652386604L;
        lz.htfe[34] = -5212480180117452818L;
        lz.htfe[35] = -9022566184908583248L;
        lz.htfe[36] = -4187206354763607516L;
        lz.htfe[37] = 596377076496983995L;
        lz.htfe[38] = 7125394826617402595L;
        lz.htfe[39] = 609481515580892535L;
        lz.htfe[40] = 6008722372316132209L;
        lz.htfe[41] = 4706977546274497443L;
        lz.htfe[42] = 1491119326070654695L;
        lz.htfe[43] = -8900567956841530396L;
        lz.htfe[44] = -1748729770615949098L;
        lz.htfe[45] = 7680325071750245332L;
        lz.htfe[46] = -447563497418055076L;
        lz.htfe[47] = 662290159702652620L;
        lz.htfe[48] = 7283811478764336993L;
        lz.htfe[49] = -2989830686343817111L;
        lz.htfe[50] = -5240869900786740648L;
        lz.htfe[51] = -6203947389181785880L;
        lz.htfe[52] = -3023290651583472221L;
        lz.htfe[53] = 6168374390942917855L;
        lz.htfe[54] = -1574063597407933615L;
        lz.htfe[55] = 2265640209855578621L;
        lz.htfe[56] = -8763304236907455216L;
        lz.htfe[57] = 7110934422530713069L;
        lz.htfe[58] = -4686189411883337516L;
        lz.htfe[59] = -4582963505346546753L;
        lz.htfe[60] = -1186322543938241875L;
        lz.htfe[61] = 8526098367906510451L;
        lz.htfe[62] = -7169548653130720345L;
        lz.htfe[63] = 8654724657989479457L;
        lz.htfe[64] = -8610893849960908792L;
        lz.htfe[65] = 3084542858198523061L;
        lz.htfe[66] = 1651936289702468884L;
        lz.htfe[67] = 2006900766701291267L;
        lz.htfe[68] = -3188510979812285273L;
        lz.htfe[69] = 5509624338258127862L;
        lz.htfe[70] = -8529584346488059387L;
        lz.htfe[71] = -8126601588294027321L;
        lz.htfe[72] = -3917955664193421993L;
        lz.htfe[73] = 5623629562764177060L;
        lz.htfe[74] = -9011251287360808061L;
        lz.htfe[75] = -4040505197354441518L;
        lz.htfe[76] = -2767951445346893431L;
        lz.htfe[77] = -3103364169713970683L;
        lz.htfe[78] = 2707859944050123827L;
        lz.htfe[79] = -8073297427398850993L;
        lz.htfe[80] = -2692155751993296811L;
        lz.htfe[81] = 8560415578151098848L;
        lz.htfe[82] = -4493482970522859281L;
        lz.htfe[83] = 510840550412358695L;
        lz.htfe[84] = -7055066865570824407L;
        lz.htfe[85] = -2194168246550581545L;
        lz.htfe[86] = 7407296405715170404L;
        lz.htfe[87] = 8279846379855329897L;
        lz.htfe[88] = -6717524426493150613L;
        lz.htfe[89] = 3098519101003679752L;
        lz.htfe[90] = 7015661323305832729L;
        lz.htfe[91] = -5378906098871578447L;
        lz.htfe[92] = -2946031687699311920L;
        lz.htfe[93] = -6415240269412738767L;
        lz.htfe[94] = -2530084959030676140L;
        lz.htfe[95] = -465929120028277792L;
        lz.htfe[96] = -3608693243315534227L;
        lz.htfe[97] = -3201897999477554201L;
        lz.htfe[98] = -7094109391861797398L;
        lz.htfe[99] = 7727136050405232130L;
    }

    private static /* synthetic */ int htew(int n2) {
        return htex[n2] ^ htey[n2];
    }

    private static /* synthetic */ void huev() {
        lz.htey[300] = -2130394830;
        lz.htey[301] = 2018414460;
        lz.htey[302] = 1543928130;
        lz.htey[303] = 1105721809;
        lz.htey[304] = -10775709;
        lz.htey[305] = -279561120;
        lz.htey[306] = -2053501472;
        lz.htey[307] = 953559946;
        lz.htey[308] = 1488149960;
        lz.htey[309] = 928126008;
        lz.htey[310] = 418212284;
        lz.htey[311] = 1143306488;
        lz.htey[312] = -646007304;
        lz.htey[313] = 391495814;
        lz.htey[314] = 1050091356;
        lz.htey[315] = -2099460829;
        lz.htey[316] = -1666729239;
        lz.htey[317] = -1614861827;
        lz.htey[318] = 564494522;
        lz.htey[319] = 875624382;
        lz.htey[320] = 1319085083;
        lz.htey[321] = 168796267;
        lz.htey[322] = -31682317;
        lz.htey[323] = -11148588;
        lz.htey[324] = 508679953;
        lz.htey[325] = 1222147471;
        lz.htey[326] = -703084982;
        lz.htey[327] = 1952858708;
        lz.htey[328] = 518328731;
        lz.htey[329] = 269737807;
        lz.htey[330] = 1542956253;
        lz.htey[331] = 801455960;
        lz.htey[332] = 466021331;
        lz.htey[333] = 898246878;
        lz.htey[334] = 1063147867;
        lz.htey[335] = -350365128;
        lz.htey[336] = -1941341711;
        lz.htey[337] = -1758253884;
        lz.htey[338] = 1201091891;
        lz.htey[339] = 593088009;
        lz.htey[340] = 737471363;
        lz.htey[341] = -1649429455;
        lz.htey[342] = 307929126;
        lz.htey[343] = -448465140;
        lz.htey[344] = -148982484;
        lz.htey[345] = 1398198676;
        lz.htey[346] = -2113010314;
        lz.htey[347] = 1109093736;
        lz.htey[348] = -627569926;
        lz.htey[349] = 1901180260;
        lz.htey[350] = 496791322;
        lz.htey[351] = -428410388;
        lz.htey[352] = 592490981;
        lz.htey[353] = 767538339;
        lz.htey[354] = 1788045736;
        lz.htey[355] = -1365697714;
        lz.htey[356] = 832501375;
        lz.htey[357] = -316452023;
        lz.htey[358] = 1669155790;
        lz.htey[359] = 1426753181;
        lz.htey[360] = -1638711881;
        lz.htey[361] = 1696915488;
        lz.htey[362] = -1087637828;
    }

    static {
        htex = new int[363];
        htey = new int[363];
        lz.hueo();
        lz.huep();
        lz.hueq();
        lz.huer();
        lz.hues();
        lz.huet();
        lz.hueu();
        lz.huev();
        htfe = new long[228];
        htff = new long[228];
        lz.huew();
        lz.huex();
        lz.huey();
        lz.huez();
        lz.hufa();
        lz.hufb();
        mc = class_310.method_1551();
        projection = new Matrix4f();
        view = new Matrix4f();
        souls = new float[9216];
        QUAD_U = new float[]{-1.0f, 1.0f, 1.0f, -1.0f, 1.0f, -1.0f};
        QUAD_V = new float[]{-1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f};
        inverseView = new Matrix4f();
        combined = new Matrix4f();
    }

    private static /* synthetic */ void huet() {
        lz.htey[100] = 1540300283;
        lz.htey[101] = 503052081;
        lz.htey[102] = 1527318646;
        lz.htey[103] = 698130978;
        lz.htey[104] = -1481301753;
        lz.htey[105] = -196831250;
        lz.htey[106] = -1745311367;
        lz.htey[107] = 822985839;
        lz.htey[108] = -1943420256;
        lz.htey[109] = 893354606;
        lz.htey[110] = -530182479;
        lz.htey[111] = -467971443;
        lz.htey[112] = -337120763;
        lz.htey[113] = 1143881814;
        lz.htey[114] = -86786394;
        lz.htey[115] = 2056349408;
        lz.htey[116] = -1917278409;
        lz.htey[117] = 1185232702;
        lz.htey[118] = 624789054;
        lz.htey[119] = -117589883;
        lz.htey[120] = 1223909773;
        lz.htey[121] = 142942618;
        lz.htey[122] = -606369057;
        lz.htey[123] = 130731297;
        lz.htey[124] = -392365598;
        lz.htey[125] = 1802027587;
        lz.htey[126] = 750176581;
        lz.htey[127] = -1227067098;
        lz.htey[128] = -540807289;
        lz.htey[129] = -1476075437;
        lz.htey[130] = -1207554667;
        lz.htey[131] = -750456747;
        lz.htey[132] = 706744443;
        lz.htey[133] = -1959682733;
        lz.htey[134] = -1313040206;
        lz.htey[135] = -352923005;
        lz.htey[136] = -1962413863;
        lz.htey[137] = -2068805224;
        lz.htey[138] = -1503566129;
        lz.htey[139] = 240066719;
        lz.htey[140] = 1191306641;
        lz.htey[141] = 555031273;
        lz.htey[142] = -724415674;
        lz.htey[143] = -1299155470;
        lz.htey[144] = 106788442;
        lz.htey[145] = 107702629;
        lz.htey[146] = 1764136359;
        lz.htey[147] = -81305175;
        lz.htey[148] = -727876889;
        lz.htey[149] = 244536995;
        lz.htey[150] = -405195758;
        lz.htey[151] = 370465936;
        lz.htey[152] = -1471522984;
        lz.htey[153] = 1359250202;
        lz.htey[154] = 1423967945;
        lz.htey[155] = 979621664;
        lz.htey[156] = -1136194573;
        lz.htey[157] = 705803715;
        lz.htey[158] = -1649649408;
        lz.htey[159] = 1918575547;
        lz.htey[160] = 1849363475;
        lz.htey[161] = -972514820;
        lz.htey[162] = 544838391;
        lz.htey[163] = 1852653877;
        lz.htey[164] = -1471279008;
        lz.htey[165] = -990578769;
        lz.htey[166] = -1005815478;
        lz.htey[167] = -1376007786;
        lz.htey[168] = -426616769;
        lz.htey[169] = -291714637;
        lz.htey[170] = 1918274951;
        lz.htey[171] = -535000803;
        lz.htey[172] = 760024716;
        lz.htey[173] = 129816178;
        lz.htey[174] = 1133929473;
        lz.htey[175] = 1156219272;
        lz.htey[176] = 1007928710;
        lz.htey[177] = -270291253;
        lz.htey[178] = -1480129821;
        lz.htey[179] = 1607294354;
        lz.htey[180] = -1649328630;
        lz.htey[181] = -1396492488;
        lz.htey[182] = 515743367;
        lz.htey[183] = -2000283459;
        lz.htey[184] = 87223812;
        lz.htey[185] = -1162928333;
        lz.htey[186] = -445233400;
        lz.htey[187] = -159916207;
        lz.htey[188] = -2002519518;
        lz.htey[189] = 1417734869;
        lz.htey[190] = -1912251627;
        lz.htey[191] = 277899940;
        lz.htey[192] = -2129553719;
        lz.htey[193] = -1115655488;
        lz.htey[194] = -122891256;
        lz.htey[195] = 446913946;
        lz.htey[196] = 549454924;
        lz.htey[197] = 1752825407;
        lz.htey[198] = 619822902;
        lz.htey[199] = 918578543;
    }

    private static /* synthetic */ void hufb() {
        lz.htff[200] = 3391942758007917938L;
        lz.htff[201] = -6829677021758882934L;
        lz.htff[202] = -3841619563097844223L;
        lz.htff[203] = 5845021865971304446L;
        lz.htff[204] = 3514370537540420140L;
        lz.htff[205] = 4112690991952512801L;
        lz.htff[206] = 7252513521215749371L;
        lz.htff[207] = -4968637566326087572L;
        lz.htff[208] = 2552195226239337161L;
        lz.htff[209] = -1706212411834790886L;
        lz.htff[210] = 6685555253765841932L;
        lz.htff[211] = 1787844408614466987L;
        lz.htff[212] = 2153014742950951622L;
        lz.htff[213] = -803489461618746951L;
        lz.htff[214] = 8250392633243422952L;
        lz.htff[215] = -4921518576343871029L;
        lz.htff[216] = 9127481360356433521L;
        lz.htff[217] = -5249005662675464941L;
        lz.htff[218] = -1725716376156709936L;
        lz.htff[219] = -1085768570512098057L;
        lz.htff[220] = 8864431882601220147L;
        lz.htff[221] = -8082087169797483790L;
        lz.htff[222] = -4635127958178795636L;
        lz.htff[223] = -6219766584741407412L;
        lz.htff[224] = -243683505718593614L;
        lz.htff[225] = -6851423065008083866L;
        lz.htff[226] = -5760672584368347165L;
        lz.htff[227] = 150988615031578735L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String lambda$init$2() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = lz.oy - lz.htez("hudb", htfd(int ), (int)209)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == lz.htez("hudc", htew(int ), (int)343)) break;
            v0 /* !! */  = (long)lz.htez("hudd", htew(int ), (int)344);
        }
        var2 = lz.c;
        while (true) {
            block21: {
                if ((v1 /* !! */  = (cfr_temp_2 = lz.oy - lz.htez("hude", htfd(int ), (int)210)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  != lz.htez("hudf", htew(int ), (int)345)) break block21;
                var1_1 /* !! */  = lz.b;
                v2 /* !! */  = lz.oy;
                if (true) ** GOTO lbl18
            }
            v1 /* !! */  = (long)lz.htez("hudg", htew(int ), (int)346);
        }
        block13: while (true) {
            v2 /* !! */  = (long)(v3 - lz.htez("hudh", htfd(int ), (int)211));
lbl18:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -373650815: {
                    v3 = lz.htez("hudi", htfd(int ), (int)212);
                    continue block13;
                }
                case 959891113: {
                    v3 = lz.htez("hudj", htfd(int ), (int)213);
                    continue block13;
                }
                case 1410940106: {
                    break block13;
                }
            }
            break;
        }
        var0_2 = lz.a;
        if (var2) {
            throw null;
        }
        if (var0_2 || var0_2) {
            return null;
        }
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var1_1 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    return "Soul3D Vertices";
                }
                case 3: {
                    var1_1 /* !! */  = (int)lz.htez("hudn", htew(int ), (int)350);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                case 0: lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)lz.htez("hudk", htew(int ), (int)347);
                    if (var2) {
                        throw null;
                    }
                }
                case 1: {
                    var1_1 /* !! */  = (int)lz.htez("hudl", htew(int ), (int)348);
                    if (var2) {
                        throw null;
                    }
                }
                case 2: 
            }
            if (true) ** GOTO lbl55
            break;
        }
        do {
            if (true) ** continue;
lbl55:
            // 2 sources

            var1_1 /* !! */  = (int)lz.htez("hudm", htew(int ), (int)349);
            cfr_temp_0 = 0;
        } while (!var2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void begin(boolean var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lz.oy - lz.htez("htgl", htfd(int ), (int)17)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == lz.htez("htgm", htew(int ), (int)17)) break;
            v0 /* !! */  = (long)lz.htez("htgn", htew(int ), (int)18);
        }
        var4_1 = lz.c;
        v1 /* !! */  = lz.oy;
        if (true) ** GOTO lbl11
        block72: while (true) {
            v1 /* !! */  = (long)(lz.htez("htgp", htfd(int ), (int)19) - lz.htez("htgo", htfd(int ), (int)18));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -66845081: {
                    continue block72;
                }
                case 1410940106: {
                    break block72;
                }
            }
            break;
        }
        var3_2 /* !! */  = lz.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = lz.oy - lz.htez("htgq", htfd(int ), (int)20)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == lz.htez("htgr", htew(int ), (int)19)) break;
            v2 /* !! */  = (long)lz.htez("htgs", htew(int ), (int)20);
        }
        var2_3 = lz.a;
        if (var4_1) {
            throw null;
lbl25:
            // 9 sources

            return;
        }
        if (var2_3 || var2_3) ** GOTO lbl25
        v3 /* !! */  = lz.oy;
        if (true) ** GOTO lbl32
        block75: while (true) {
            v3 /* !! */  = (long)(v4 - lz.htez("htgt", htfd(int ), (int)21));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1998996059: {
                    v4 = lz.htez("htgu", htfd(int ), (int)22);
                    continue block75;
                }
                case 1287005430: {
                    v4 = lz.htez("htgv", htfd(int ), (int)23);
                    continue block75;
                }
                case 1410940106: {
                    break block75;
                }
                case 1588510025: {
                    v4 = lz.htez("htgw", htfd(int ), (int)24);
                    continue block75;
                }
            }
            break;
        }
        lz.init();
        if (var2_3 || var2_3) ** GOTO lbl25
        v5 = lz.htez("htgx", htew(int ), (int)21);
        v6 /* !! */  = lz.oy;
        if (true) ** GOTO lbl51
        block76: while (true) {
            v6 /* !! */  = (long)(v7 - lz.htez("htgy", htfd(int ), (int)25));
lbl51:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1742355634: {
                    v7 = lz.htez("htgz", htfd(int ), (int)26);
                    continue block76;
                }
                case 1410940106: {
                    break block76;
                }
                case 1861345175: {
                    v7 = lz.htez("htha", htfd(int ), (int)27);
                    continue block76;
                }
            }
            break;
        }
        lz.soulCount = (int)v5;
        if (var2_3) ** GOTO lbl25
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3) ** GOTO lbl25
                v8 /* !! */  = lz.oy;
                if (true) ** GOTO lbl70
                block77: while (true) {
                    v8 /* !! */  = (long)(v9 - lz.htez("hthb", htfd(int ), (int)28));
lbl70:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -748452643: {
                            v9 = lz.htez("hthc", htfd(int ), (int)29);
                            continue block77;
                        }
                        case 1410940106: {
                            break block77;
                        }
                        case 1829088481: {
                            v9 = lz.htez("hthd", htfd(int ), (int)30);
                            continue block77;
                        }
                    }
                    break;
                }
                lz.batchIgnoreDepth = var0;
                if (var2_3 || var2_3) ** GOTO lbl25
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_2 = lz.oy - lz.htez("hthe", htfd(int ), (int)31)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == lz.htez("hthf", htew(int ), (int)22)) break;
                    v10 /* !! */  = (long)lz.htez("hthg", htew(int ), (int)23);
                }
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = lz.oy - lz.htez("hthh", htfd(int ), (int)32)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == lz.htez("hthi", htew(int ), (int)24)) break;
                    v11 /* !! */  = (long)lz.htez("hthj", htew(int ), (int)25);
                }
                v12 = lz.mc.field_1773;
                v13 /* !! */  = lz.oy;
                if (true) ** GOTO lbl96
                block80: while (true) {
                    v13 /* !! */  = (long)(v14 - lz.htez("hthk", htfd(int ), (int)33));
lbl96:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1650367021: {
                            v14 = lz.htez("hthl", htfd(int ), (int)34);
                            continue block80;
                        }
                        case -574468489: {
                            v14 = lz.htez("hthm", htfd(int ), (int)35);
                            continue block80;
                        }
                        case 1410940106: {
                            break block80;
                        }
                        case 1737456512: {
                            v14 = lz.htez("hthn", htfd(int ), (int)36);
                            continue block80;
                        }
                    }
                    break;
                }
                v15 = v12.method_19418();
                v16 /* !! */  = lz.oy;
                if (true) ** GOTO lbl113
                block81: while (true) {
                    v16 /* !! */  = (long)(lz.htez("hthp", htfd(int ), (int)38) - lz.htez("htho", htfd(int ), (int)37));
lbl113:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case 1294362627: {
                            continue block81;
                        }
                        case 1410940106: {
                            break block81;
                        }
                    }
                    break;
                }
                var1_4 = v15.method_71156();
                if (var2_3 || var2_3) ** GOTO lbl25
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_4 = lz.oy - lz.htez("hthq", htfd(int ), (int)39)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == lz.htez("hthr", htew(int ), (int)26)) break;
                    v17 /* !! */  = (long)lz.htez("hths", htew(int ), (int)27);
                }
                v18 = var1_4.field_1352;
                v19 /* !! */  = lz.oy;
                if (true) ** GOTO lbl130
                block83: while (true) {
                    v19 /* !! */  = (long)(v20 - lz.htez("htht", htfd(int ), (int)40));
lbl130:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case 777848109: {
                            v20 = lz.htez("hthu", htfd(int ), (int)41);
                            continue block83;
                        }
                        case 1410940106: {
                            break block83;
                        }
                        case 1895069784: {
                            v20 = lz.htez("hthv", htfd(int ), (int)42);
                            continue block83;
                        }
                        case 1979216187: {
                            v20 = lz.htez("hthw", htfd(int ), (int)43);
                            continue block83;
                        }
                    }
                    break;
                }
                lz.cameraX = v18;
                if (var2_3 || var2_3) ** GOTO lbl25
                v21 /* !! */  = lz.oy;
                if (true) ** GOTO lbl148
                block84: while (true) {
                    v21 /* !! */  = (long)(v22 - lz.htez("hthx", htfd(int ), (int)44));
lbl148:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -341809477: {
                            v22 = lz.htez("hthy", htfd(int ), (int)45);
                            continue block84;
                        }
                        case 1410940106: {
                            break block84;
                        }
                        case 1726454824: {
                            v22 = lz.htez("hthz", htfd(int ), (int)46);
                            continue block84;
                        }
                    }
                    break;
                }
                v23 = var1_4.field_1351;
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_5 = lz.oy - lz.htez("htia", htfd(int ), (int)47)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == lz.htez("htib", htew(int ), (int)28)) break;
                    v24 /* !! */  = (long)lz.htez("htic", htew(int ), (int)29);
                }
                lz.cameraY = v23;
                if (var2_3 || var2_3) ** GOTO lbl25
                v25 /* !! */  = lz.oy;
                if (true) ** GOTO lbl169
                block86: while (true) {
                    v25 /* !! */  = (long)(lz.htez("htie", htfd(int ), (int)49) - lz.htez("htid", htfd(int ), (int)48));
lbl169:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case 15116003: {
                            continue block86;
                        }
                        case 1410940106: {
                            break block86;
                        }
                    }
                    break;
                }
                v26 = var1_4.field_1350;
                v27 /* !! */  = lz.oy;
                if (true) ** GOTO lbl179
                block87: while (true) {
                    v27 /* !! */  = (long)(v28 - lz.htez("htif", htfd(int ), (int)50));
lbl179:
                    // 2 sources

                    switch ((int)v27 /* !! */ ) {
                        case -1729435579: {
                            v28 = lz.htez("htig", htfd(int ), (int)51);
                            continue block87;
                        }
                        case -1345225493: {
                            v28 = lz.htez("htih", htfd(int ), (int)52);
                            continue block87;
                        }
                        case 1258209509: {
                            v28 = lz.htez("htii", htfd(int ), (int)53);
                            continue block87;
                        }
                        case 1410940106: {
                            break block87;
                        }
                    }
                    break;
                }
                lz.cameraZ = v26;
                if (!var2_3 && !var2_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_2 /* !! */  = (int)lz.htez("htij", htew(int ), (int)30);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl266
            }
lbl200:
            // 4 sources

            case 1: {
                var3_2 /* !! */  = (int)lz.htez("htik", htew(int ), (int)31);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl262
            }
            case 2: {
                var3_2 /* !! */  = (int)lz.htez("htil", htew(int ), (int)32);
                if (!var4_1) break;
                throw null;
            }
lbl209:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)lz.htez("htim", htew(int ), (int)33);
                if (!var4_1) break;
                throw null;
            }
            case 4: {
                var3_2 /* !! */  = (int)lz.htez("htin", htew(int ), (int)34);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl253
            }
            case 5: {
                var3_2 /* !! */  = (int)lz.htez("htio", htew(int ), (int)35);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl245
            }
            case 6: {
                var3_2 /* !! */  = (int)lz.htez("htip", htew(int ), (int)36);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl262
            }
            case 7: {
                var3_2 /* !! */  = (int)lz.htez("htiq", htew(int ), (int)37);
                if (!var4_1) ** GOTO lbl200
                throw null;
            }
            case 8: {
                var3_2 /* !! */  = (int)lz.htez("htir", htew(int ), (int)38);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl253
            }
lbl237:
            // 4 sources

            case 9: {
                var3_2 /* !! */  = (int)lz.htez("htis", htew(int ), (int)39);
                if (!var4_1) ** GOTO lbl200
                throw null;
            }
            case 10: {
                var3_2 /* !! */  = (int)lz.htez("htit", htew(int ), (int)40);
                if (var4_1) {
                    throw null;
                }
            }
lbl245:
            // 4 sources

            case 11: {
                var3_2 /* !! */  = (int)lz.htez("htiu", htew(int ), (int)41);
                if (!var4_1) ** GOTO lbl209
                throw null;
            }
lbl249:
            // 2 sources

            case 12: {
                var3_2 /* !! */  = (int)lz.htez("htiv", htew(int ), (int)42);
                if (!var4_1) ** GOTO lbl237
                throw null;
            }
lbl253:
            // 3 sources

            case 13: {
                var3_2 /* !! */  = (int)lz.htez("htiw", htew(int ), (int)43);
                if (!var4_1) ** GOTO lbl200
                throw null;
            }
            case 14: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)lz.htez("htix", htew(int ), (int)44);
                    if (!var4_1) ** GOTO lbl237
                    throw null;
                }
            }
lbl262:
            // 3 sources

            case 15: {
                var3_2 /* !! */  = (int)lz.htez("htiy", htew(int ), (int)45);
                if (!var4_1) ** GOTO lbl249
                throw null;
            }
lbl266:
            // 2 sources

            case 16: {
                var3_2 /* !! */  = (int)lz.htez("htiz", htew(int ), (int)46);
                if (!var4_1) ** GOTO lbl237
                throw null;
            }
            case 17: 
        }
        var3_2 /* !! */  = (int)lz.htez("htja", htew(int ), (int)47);
        ** while (!var4_1)
lbl273:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hufa() {
        lz.htff[100] = -3742268276673507397L;
        lz.htff[101] = -4980489325453196103L;
        lz.htff[102] = 7993825395952293420L;
        lz.htff[103] = -7705370390514939129L;
        lz.htff[104] = -2707160371654212223L;
        lz.htff[105] = -8609389046461271364L;
        lz.htff[106] = 8652480229152958471L;
        lz.htff[107] = 1567033329822631457L;
        lz.htff[108] = 7162418016628478986L;
        lz.htff[109] = -4572272455684545548L;
        lz.htff[110] = 6936739408039988925L;
        lz.htff[111] = -2323552487583970746L;
        lz.htff[112] = -7586732974033992284L;
        lz.htff[113] = -4996320218497427559L;
        lz.htff[114] = 2237484806451194962L;
        lz.htff[115] = 5895123521636466505L;
        lz.htff[116] = -2309384904726249947L;
        lz.htff[117] = -233907678249508401L;
        lz.htff[118] = 485044410241725551L;
        lz.htff[119] = 8539244009949197879L;
        lz.htff[120] = -1919773829882252851L;
        lz.htff[121] = 7317967730069471658L;
        lz.htff[122] = 7315745555512607125L;
        lz.htff[123] = 8606919451661695690L;
        lz.htff[124] = -7671468534425342552L;
        lz.htff[125] = -1437514689901402574L;
        lz.htff[126] = 6207827827319372894L;
        lz.htff[127] = -4267248625575876936L;
        lz.htff[128] = -7310643618745135627L;
        lz.htff[129] = 5310673301456891786L;
        lz.htff[130] = 5220496322397259570L;
        lz.htff[131] = -1005870421657923682L;
        lz.htff[132] = 4089341890091337048L;
        lz.htff[133] = 3583877554572155165L;
        lz.htff[134] = -2238763741225809163L;
        lz.htff[135] = 7777150866960269679L;
        lz.htff[136] = -7207454870889214503L;
        lz.htff[137] = 2900384915365578204L;
        lz.htff[138] = -1747749673889248307L;
        lz.htff[139] = 5641436937649052162L;
        lz.htff[140] = -8909809503688618299L;
        lz.htff[141] = 4496150749820798306L;
        lz.htff[142] = -8458571748962074629L;
        lz.htff[143] = 3053047939418857173L;
        lz.htff[144] = 2607439666224187626L;
        lz.htff[145] = -7407350922096123451L;
        lz.htff[146] = 5318491935335376218L;
        lz.htff[147] = -6521803044428126799L;
        lz.htff[148] = 3267770202609810792L;
        lz.htff[149] = -6039709936929154252L;
        lz.htff[150] = 889423635440964798L;
        lz.htff[151] = 8663050679901141680L;
        lz.htff[152] = -5215384241159899780L;
        lz.htff[153] = -3314544844224862312L;
        lz.htff[154] = 9007759807281808620L;
        lz.htff[155] = 7223470705191854245L;
        lz.htff[156] = -8384732060878484047L;
        lz.htff[157] = 522266246809826956L;
        lz.htff[158] = -6445803581989353092L;
        lz.htff[159] = 4746438402947012895L;
        lz.htff[160] = -5734824071697041139L;
        lz.htff[161] = 4206262574339112686L;
        lz.htff[162] = 6383221392054769797L;
        lz.htff[163] = -86906409225468041L;
        lz.htff[164] = -3511898686151732902L;
        lz.htff[165] = 3842779903226417187L;
        lz.htff[166] = -6744268315737427414L;
        lz.htff[167] = 7344102883398012999L;
        lz.htff[168] = 4067444539825829846L;
        lz.htff[169] = -6072877465811849304L;
        lz.htff[170] = -5727699642857002451L;
        lz.htff[171] = 3289780953021224017L;
        lz.htff[172] = 6579303382881898474L;
        lz.htff[173] = -4759461142205056601L;
        lz.htff[174] = -8504730159357415968L;
        lz.htff[175] = 6494610759679681722L;
        lz.htff[176] = -6679603947960973965L;
        lz.htff[177] = -6250991654924760611L;
        lz.htff[178] = 4191533393758091128L;
        lz.htff[179] = -5697091423796893886L;
        lz.htff[180] = -171247390973961700L;
        lz.htff[181] = -7456789707797390683L;
        lz.htff[182] = 4742079385545256407L;
        lz.htff[183] = -5931251850988506935L;
        lz.htff[184] = -192551834812185888L;
        lz.htff[185] = 7151749647493343991L;
        lz.htff[186] = 4693054484242933942L;
        lz.htff[187] = 8069359206749249374L;
        lz.htff[188] = -156999633835415011L;
        lz.htff[189] = 1429301255170980427L;
        lz.htff[190] = -1891347906870418622L;
        lz.htff[191] = -7530309510043053847L;
        lz.htff[192] = 4479154666637967668L;
        lz.htff[193] = 9004865787878671899L;
        lz.htff[194] = -4657644652755195765L;
        lz.htff[195] = 6814051258244202799L;
        lz.htff[196] = -5542414801038008829L;
        lz.htff[197] = -3955803335997773667L;
        lz.htff[198] = 7211691687226961915L;
        lz.htff[199] = -734594738516296244L;
    }

    private static /* synthetic */ long htfd(int n2) {
        return htfe[n2] ^ htff[n2];
    }

    private static /* synthetic */ void hueo() {
        lz.htex[0] = -1947698177;
        lz.htex[1] = 1467698528;
        lz.htex[2] = -288919310;
        lz.htex[3] = -1888106414;
        lz.htex[4] = 1607834918;
        lz.htex[5] = 545317669;
        lz.htex[6] = 936577677;
        lz.htex[7] = 1446270729;
        lz.htex[8] = 951809697;
        lz.htex[9] = 100459624;
        lz.htex[10] = 140223880;
        lz.htex[11] = 1399024840;
        lz.htex[12] = 514320645;
        lz.htex[13] = -217797172;
        lz.htex[14] = 1825112045;
        lz.htex[15] = -1386118849;
        lz.htex[16] = -1564465920;
        lz.htex[17] = 1864258704;
        lz.htex[18] = 295304508;
        lz.htex[19] = -822300789;
        lz.htex[20] = 1187236821;
        lz.htex[21] = -1799390861;
        lz.htex[22] = -1698824327;
        lz.htex[23] = 1757239169;
        lz.htex[24] = 2058754076;
        lz.htex[25] = 1865084570;
        lz.htex[26] = -422385751;
        lz.htex[27] = -1987598579;
        lz.htex[28] = 1806983223;
        lz.htex[29] = -1511870036;
        lz.htex[30] = 1738864848;
        lz.htex[31] = -768189238;
        lz.htex[32] = 386482733;
        lz.htex[33] = -567320932;
        lz.htex[34] = 345936473;
        lz.htex[35] = -1933941600;
        lz.htex[36] = -2140058515;
        lz.htex[37] = -1828335347;
        lz.htex[38] = 479064935;
        lz.htex[39] = 163858723;
        lz.htex[40] = -1939398957;
        lz.htex[41] = -1673426146;
        lz.htex[42] = 526793820;
        lz.htex[43] = -117714654;
        lz.htex[44] = -706682024;
        lz.htex[45] = 1938600404;
        lz.htex[46] = 65777207;
        lz.htex[47] = -1502783860;
        lz.htex[48] = -1826829222;
        lz.htex[49] = -1586990285;
        lz.htex[50] = 2089746230;
        lz.htex[51] = -1773552358;
        lz.htex[52] = -1336019020;
        lz.htex[53] = 68039062;
        lz.htex[54] = 404060547;
        lz.htex[55] = -2072743138;
        lz.htex[56] = 2040097488;
        lz.htex[57] = -365337666;
        lz.htex[58] = 1229412614;
        lz.htex[59] = -41032638;
        lz.htex[60] = -1943326572;
        lz.htex[61] = 1447636121;
        lz.htex[62] = -964615823;
        lz.htex[63] = 153809884;
        lz.htex[64] = -366872788;
        lz.htex[65] = -409669687;
        lz.htex[66] = -2036609445;
        lz.htex[67] = -1798276055;
        lz.htex[68] = -1288179116;
        lz.htex[69] = -742431219;
        lz.htex[70] = -278187976;
        lz.htex[71] = 2001984772;
        lz.htex[72] = 1231907316;
        lz.htex[73] = 747107718;
        lz.htex[74] = 1917897626;
        lz.htex[75] = 1521487052;
        lz.htex[76] = 564825750;
        lz.htex[77] = -1873652798;
        lz.htex[78] = 2018836615;
        lz.htex[79] = -1586443524;
        lz.htex[80] = -1458347823;
        lz.htex[81] = -1063734776;
        lz.htex[82] = -1205901099;
        lz.htex[83] = 1523308814;
        lz.htex[84] = 118604264;
        lz.htex[85] = 1643969387;
        lz.htex[86] = -1472028477;
        lz.htex[87] = -1751491055;
        lz.htex[88] = -137952583;
        lz.htex[89] = 301065814;
        lz.htex[90] = -153161734;
        lz.htex[91] = 1625478955;
        lz.htex[92] = -203980189;
        lz.htex[93] = -1103307128;
        lz.htex[94] = -1209891618;
        lz.htex[95] = 1086733387;
        lz.htex[96] = -1634192267;
        lz.htex[97] = -60748898;
        lz.htex[98] = 2132424574;
        lz.htex[99] = -170510020;
    }

    private static /* synthetic */ void huey() {
        lz.htfe[200] = 6143144462244836918L;
        lz.htfe[201] = 2203733908733051735L;
        lz.htfe[202] = -5545966097267857156L;
        lz.htfe[203] = 8233094378559369568L;
        lz.htfe[204] = -5633998534052188233L;
        lz.htfe[205] = -7671060962700245424L;
        lz.htfe[206] = 8637890990475193432L;
        lz.htfe[207] = -7458332207875548470L;
        lz.htfe[208] = -5607034948165690151L;
        lz.htfe[209] = 554999724045501947L;
        lz.htfe[210] = -6673584465247643288L;
        lz.htfe[211] = -3825202350341608118L;
        lz.htfe[212] = -5792078394269469156L;
        lz.htfe[213] = 1467848420998811794L;
        lz.htfe[214] = 2352250947665992034L;
        lz.htfe[215] = 5265513405160909545L;
        lz.htfe[216] = 3134783401393839748L;
        lz.htfe[217] = -5394841161779931319L;
        lz.htfe[218] = 915779760704180704L;
        lz.htfe[219] = 6364758851776884112L;
        lz.htfe[220] = -4070722209406509466L;
        lz.htfe[221] = 5652710657190609306L;
        lz.htfe[222] = -894382277063174368L;
        lz.htfe[223] = -6238734268983611683L;
        lz.htfe[224] = 4400593648193280191L;
        lz.htfe[225] = -5049162379465486834L;
        lz.htfe[226] = 8478469767188006874L;
        lz.htfe[227] = -2675401983145593278L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void end() {
        block256: {
            block255: {
                var23 = lz.c;
                var22_1 /* !! */  = lz.b;
                var21_2 = lz.a;
                if (var23) {
                    throw null;
lbl6:
                    // 71 sources

                    return;
                }
                if (var21_2 || var21_2) ** GOTO lbl6
                if (lz.pipeline == null) break block255;
                if (var21_2) ** GOTO lbl6
                if (lz.uniformBuffer == null) break block255;
                if (var21_2) ** GOTO lbl6
                if (lz.vertexBuffer == null) break block255;
                if (var21_2) ** GOTO lbl6
                if (lz.soulCount != 0) break block256;
                if (var21_2) ** GOTO lbl6
            }
            if (var21_2 || var21_2) ** GOTO lbl6
            lz.soulCount = (int)lz.htez("htks", htew(int ), (int)91);
            if (var21_2 || var21_2) ** GOTO lbl6
            return;
        }
        if (var21_2 || var21_2) ** GOTO lbl6
        lz.inverseView.set((Matrix4fc)lz.view).invert();
        if (var21_2 || var21_2) ** GOTO lbl6
        var0_3 = lz.inverseView.m00();
        if (var21_2 || var21_2) ** GOTO lbl6
        var1_4 = lz.inverseView.m01();
        if (var21_2 || var21_2) ** GOTO lbl6
        var2_5 = lz.inverseView.m02();
        if (var21_2 || var21_2) ** GOTO lbl6
        var3_6 = lz.inverseView.m10();
        if (var21_2 || var21_2) ** GOTO lbl6
        var4_7 = lz.inverseView.m11();
        if (var21_2 || var21_2) ** GOTO lbl6
        var5_8 = lz.inverseView.m12();
        if (var21_2 || var21_2) ** GOTO lbl6
        var6_9 = om.acquire((int)lz.htez("htkt", htew(int ), (int)92), lz.soulCount * lz.htez("htku", htew(int ), (int)93) * lz.htez("htkv", htew(int ), (int)94));
        if (var21_2 || var21_2) ** GOTO lbl6
        var7_10 = lz.htez("htkw", htew(int ), (int)95);
        if (var21_2) ** GOTO lbl6
        block134: while (true) {
            if (var21_2 || var21_2) ** GOTO lbl6
            if (var7_10 >= lz.soulCount) ** GOTO lbl105
            if (var21_2 || var21_2) ** GOTO lbl6
            var8_12 = var7_10 * lz.htez("htkx", htew(int ), (int)96);
            if (var21_2 || var21_2) ** GOTO lbl6
            var9_14 = lz.souls[var8_12];
            if (var21_2 || var21_2) ** GOTO lbl6
            var10_16 = lz.souls[var8_12 + true];
            if (var21_2 || var21_2) ** GOTO lbl6
            var11_18 = lz.souls[var8_12 + 2];
            if (var21_2 || var21_2) ** GOTO lbl6
            var12_20 = lz.souls[var8_12 + 3];
            if (var21_2 || var21_2) ** GOTO lbl6
            var13_22 = (byte)(lz.souls[var8_12 + 4] * lz.htez("htkz", htky(int ), (int)97));
            if (var21_2 || var21_2) ** GOTO lbl6
            var14_24 = (byte)(lz.souls[var8_12 + 5] * lz.htez("htla", htky(int ), (int)98));
            if (var21_2) ** GOTO lbl6
            if (var22_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var22_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var21_2) ** GOTO lbl6
                    var15_25 = (byte)(lz.souls[var8_12 + 6] * lz.htez("htlb", htky(int ), (int)99));
                    if (var21_2 || var21_2) ** GOTO lbl6
                    var16_26 = (byte)(lz.souls[var8_12 + 7] * lz.htez("htlc", htky(int ), (int)100));
                    if (var21_2 || var21_2) ** GOTO lbl6
                    var17_27 = lz.souls[var8_12 + 8] * lz.htez("htld", htky(int ), (int)101);
                    if (var21_2 || var21_2) ** GOTO lbl6
                    var18_28 = lz.htez("htle", htew(int ), (int)102);
                    if (var21_2) ** GOTO lbl6
                    do {
                        if (var21_2 || var21_2) ** GOTO lbl6
                        if (var18_28 >= lz.htez("htlf", htew(int ), (int)103)) ** GOTO lbl100
                        if (var21_2 || var21_2) ** GOTO lbl6
                        var19_29 = lz.QUAD_U[var18_28];
                        if (var21_2 || var21_2) ** GOTO lbl6
                        var20_30 = lz.QUAD_V[var18_28];
                        if (var21_2 || var21_2) ** GOTO lbl6
                        var6_9.putFloat(var9_14 + (var0_3 * var19_29 + var3_6 * var20_30) * var12_20);
                        if (var21_2 || var21_2) ** GOTO lbl6
                        var6_9.putFloat(var10_16 + (var1_4 * var19_29 + var4_7 * var20_30) * var12_20);
                        if (var21_2 || var21_2) ** GOTO lbl6
                        var6_9.putFloat(var11_18 + (var2_5 * var19_29 + var5_8 * var20_30) * var12_20);
                        if (var21_2 || var21_2) ** GOTO lbl6
                        var6_9.put(var13_22).put(var14_24).put(var15_25).put(var16_26);
                        if (var21_2 || var21_2) ** GOTO lbl6
                        var6_9.putFloat(var17_27 + var19_29).putFloat(var20_30);
                        if (var21_2 || var21_2) ** GOTO lbl6
                        ++var18_28;
                        if (var21_2) ** GOTO lbl6
                    } while (!var23);
                    throw null;
lbl100:
                    // 1 sources

                    if (var21_2 || var21_2) ** GOTO lbl6
                    ++var7_10;
                    if (var21_2) ** GOTO lbl6
                    if (!var23) continue block134;
                    throw null;
                }
lbl105:
                // 1 sources

                if (var21_2 || var21_2) ** GOTO lbl6
                var6_9.flip();
                if (var21_2 || var21_2) ** GOTO lbl6
                var7_11 = om.acquire((int)lz.htez("htlg", htew(int ), (int)104), (int)lz.htez("htlh", htew(int ), (int)105));
                if (var21_2 || var21_2) ** GOTO lbl6
                lz.putMatrix(var7_11, lz.combined.set((Matrix4fc)lz.projection).mul((Matrix4fc)lz.view));
                if (var21_2 || var21_2) ** GOTO lbl6
                var8_13 = (float)(System.currentTimeMillis() % lz.htez("htli", htfd(int ), (int)54)) / lz.htez("htlj", htky(int ), (int)106);
                if (var21_2 || var21_2) ** GOTO lbl6
                var7_11.putFloat(var8_13).putFloat(0.0f).putFloat(0.0f).putFloat(0.0f);
                if (var21_2 || var21_2) ** GOTO lbl6
                var7_11.flip();
                if (var21_2 || var21_2) ** GOTO lbl6
                var9_15 = RenderSystem.getDevice().createCommandEncoder();
                if (var21_2 || var21_2) ** GOTO lbl6
                var9_15.writeToBuffer(lz.uniformBuffer.slice(), var7_11);
                if (var21_2 || var21_2) ** GOTO lbl6
                var9_15.writeToBuffer(lz.vertexBuffer.slice(), var6_9);
                if (var21_2 || var21_2) ** GOTO lbl6
                var10_17 = lz.mc.method_1522();
                if (var21_2 || var21_2) ** GOTO lbl6
                v0 = (Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$end$0(), ()Ljava/lang/String;)();
                v1 = var10_17.method_71639();
                v2 = OptionalInt.empty();
                v3 = var10_17.method_71640();
                if (lz.batchIgnoreDepth) {
                    v4 = OptionalDouble.of(1.0);
                    if (var23) {
                        throw null;
                    }
                } else {
                    v4 = OptionalDouble.empty();
                }
                var11_19 = var9_15.createRenderPass(v0, v1, v2, v3, v4);
                if (var21_2) ** GOTO lbl6
                try {
                    if (var21_2) ** GOTO lbl6
                    var11_19.setPipeline(lz.pipeline);
                    if (var21_2 || var21_2) ** GOTO lbl6
                    var11_19.setUniform("Uniforms", lz.uniformBuffer);
                    if (var21_2 || var21_2) ** GOTO lbl6
                    var11_19.setVertexBuffer((int)lz.htez("htlk", htew(int ), (int)107), lz.vertexBuffer);
                    if (var21_2 || var21_2) ** GOTO lbl6
                    var11_19.draw((int)lz.htez("htll", htew(int ), (int)108), lz.soulCount * lz.htez("htlm", htew(int ), (int)109));
                    if (var21_2 || var21_2) ** GOTO lbl6
                    if (var11_19 == null) ** GOTO lbl175
                    if (var21_2) ** GOTO lbl6
                }
                catch (Throwable var12_21) {
                    if (var21_2) ** GOTO lbl6
                    if (var11_19 == null) ** GOTO lbl168
                    if (var21_2) ** GOTO lbl6
                    try {
                        if (var21_2) ** GOTO lbl6
                        var11_19.close();
                        if (var21_2 || var21_2) ** GOTO lbl6
                        ** if (!var23) goto lbl-1000
                    }
                    catch (Throwable var13_23) {
                        if (var21_2) ** GOTO lbl6
                        var12_21.addSuppressed(var13_23);
                        if (var21_2) ** GOTO lbl6
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
lbl168:
                    // 3 sources

                    if (var21_2 || var21_2) ** GOTO lbl6
                    throw var12_21;
                }
                var11_19.close();
                if (var21_2) ** GOTO lbl6
                if (var23) {
                    throw null;
                }
lbl175:
                // 3 sources

                if (var21_2 || var21_2) ** GOTO lbl6
                lz.soulCount = (int)lz.htez("htln", htew(int ), (int)110);
                if (!var21_2 && !var21_2) ** break;
                ** continue;
                return;
lbl180:
                // 6 sources

                case 0: {
                    var22_1 /* !! */  = (int)lz.htez("htlo", htew(int ), (int)111);
                    if (var23) {
                        throw null;
                    }
                }
lbl184:
                // 4 sources

                case 1: {
                    var22_1 /* !! */  = (int)lz.htez("htlp", htew(int ), (int)112);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl228
                }
lbl189:
                // 2 sources

                case 2: {
                    var22_1 /* !! */  = (int)lz.htez("htlq", htew(int ), (int)113);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl413
                }
lbl194:
                // 2 sources

                case 3: {
                    var22_1 /* !! */  = (int)lz.htez("htlr", htew(int ), (int)114);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl549
                }
                case 4: {
                    var22_1 /* !! */  = (int)lz.htez("htls", htew(int ), (int)115);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl612
                }
                case 5: {
                    var22_1 /* !! */  = (int)lz.htez("htlt", htew(int ), (int)116);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl277
                }
lbl209:
                // 2 sources

                case 6: {
                    var22_1 /* !! */  = (int)lz.htez("htlu", htew(int ), (int)117);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl698
                }
                case 7: {
                    var22_1 /* !! */  = (int)lz.htez("htlv", htew(int ), (int)118);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl616
                }
                case 8: {
                    var22_1 /* !! */  = (int)lz.htez("htlw", htew(int ), (int)119);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl588
                }
lbl224:
                // 2 sources

                case 9: {
                    var22_1 /* !! */  = (int)lz.htez("htlx", htew(int ), (int)120);
                    if (!var23) ** GOTO lbl189
                    throw null;
                }
lbl228:
                // 3 sources

                case 10: {
                    var22_1 /* !! */  = (int)lz.htez("htly", htew(int ), (int)121);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl621
                }
                case 11: {
                    var22_1 /* !! */  = (int)lz.htez("htlz", htew(int ), (int)122);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl292
                }
lbl238:
                // 2 sources

                case 12: {
                    var22_1 /* !! */  = (int)lz.htez("htma", htew(int ), (int)123);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl584
                }
lbl243:
                // 2 sources

                case 13: {
                    var22_1 /* !! */  = (int)lz.htez("htmd", htew(int ), (int)124);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl513
                }
lbl248:
                // 2 sources

                case 14: {
                    var22_1 /* !! */  = (int)lz.htez("htmg", htew(int ), (int)125);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl326
                }
                case 15: {
                    var22_1 /* !! */  = (int)lz.htez("htmj", htew(int ), (int)126);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl527
                }
lbl258:
                // 2 sources

                case 16: {
                    var22_1 /* !! */  = (int)lz.htez("htmn", htew(int ), (int)127);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl674
                }
lbl263:
                // 2 sources

                case 17: {
                    var22_1 /* !! */  = (int)lz.htez("htmr", htew(int ), (int)128);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl596
                }
lbl268:
                // 2 sources

                case 18: {
                    var22_1 /* !! */  = (int)lz.htez("htmu", htew(int ), (int)129);
                    if (!var23) ** GOTO lbl209
                    throw null;
                }
lbl272:
                // 3 sources

                case 19: {
                    var22_1 /* !! */  = (int)lz.htez("htmw", htew(int ), (int)130);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl567
                }
lbl277:
                // 2 sources

                case 20: {
                    var22_1 /* !! */  = (int)lz.htez("htmz", htew(int ), (int)131);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl297
                }
                case 21: {
                    var22_1 /* !! */  = (int)lz.htez("htnc", htew(int ), (int)132);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl331
                }
                case 22: {
                    var22_1 /* !! */  = (int)lz.htez("htnf", htew(int ), (int)133);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl563
                }
lbl292:
                // 3 sources

                case 23: {
                    var22_1 /* !! */  = (int)lz.htez("htnj", htew(int ), (int)134);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl739
                }
lbl297:
                // 2 sources

                case 24: {
                    var22_1 /* !! */  = (int)lz.htez("htnm", htew(int ), (int)135);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl670
                }
lbl302:
                // 3 sources

                case 25: {
                    var22_1 /* !! */  = (int)lz.htez("htnq", htew(int ), (int)136);
                    if (!var23) ** GOTO lbl184
                    throw null;
                }
                case 26: {
                    var22_1 /* !! */  = (int)lz.htez("htnt", htew(int ), (int)137);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl456
                }
lbl311:
                // 2 sources

                case 27: {
                    var22_1 /* !! */  = (int)lz.htez("htnv", htew(int ), (int)138);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl540
                }
                case 28: {
                    var22_1 /* !! */  = (int)lz.htez("htnz", htew(int ), (int)139);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl549
                }
lbl321:
                // 2 sources

                case 29: {
                    var22_1 /* !! */  = (int)lz.htez("htob", htew(int ), (int)140);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl596
                }
lbl326:
                // 3 sources

                case 30: {
                    var22_1 /* !! */  = (int)lz.htez("htof", htew(int ), (int)141);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl666
                }
lbl331:
                // 4 sources

                case 31: {
                    var22_1 /* !! */  = (int)lz.htez("htoi", htew(int ), (int)142);
                    if (!var23) ** GOTO lbl302
                    throw null;
                }
                case 32: {
                    var22_1 /* !! */  = (int)lz.htez("htok", htew(int ), (int)143);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl513
                }
                case 33: {
                    var22_1 /* !! */  = (int)lz.htez("htoo", htew(int ), (int)144);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl654
                }
                case 34: {
                    var22_1 /* !! */  = (int)lz.htez("htor", htew(int ), (int)145);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl536
                }
                case 35: {
                    var22_1 /* !! */  = (int)lz.htez("htou", htew(int ), (int)146);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl739
                }
                case 36: {
                    var22_1 /* !! */  = (int)lz.htez("htox", htew(int ), (int)147);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl722
                }
                case 37: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var22_1 /* !! */  = (int)lz.htez("htoz", htew(int ), (int)148);
                        if (var23) {
                            throw null;
                        }
                        ** GOTO lbl518
                        break;
                    }
                }
                case 38: {
                    var22_1 /* !! */  = (int)lz.htez("htpc", htew(int ), (int)149);
                    if (!var23) ** GOTO lbl331
                    throw null;
                }
lbl370:
                // 2 sources

                case 39: {
                    var22_1 /* !! */  = (int)lz.htez("htpf", htew(int ), (int)150);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl464
                }
                case 40: {
                    var22_1 /* !! */  = (int)lz.htez("htpi", htew(int ), (int)151);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl645
                }
                case 41: {
                    var22_1 /* !! */  = (int)lz.htez("htpl", htew(int ), (int)152);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl554
                }
lbl385:
                // 2 sources

                case 42: {
                    var22_1 /* !! */  = (int)lz.htez("htpn", htew(int ), (int)153);
                    if (!var23) ** GOTO lbl180
                    throw null;
                }
                case 43: {
                    var22_1 /* !! */  = (int)lz.htez("htpq", htew(int ), (int)154);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl496
                }
                case 44: {
                    var22_1 /* !! */  = (int)lz.htez("htps", htew(int ), (int)155);
                    if (!var23) ** GOTO lbl321
                    throw null;
                }
lbl398:
                // 2 sources

                case 45: {
                    var22_1 /* !! */  = (int)lz.htez("htpv", htew(int ), (int)156);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl604
                }
lbl403:
                // 3 sources

                case 46: {
                    var22_1 /* !! */  = (int)lz.htez("htpy", htew(int ), (int)157);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl468
                }
                case 47: {
                    var22_1 /* !! */  = (int)lz.htez("htqa", htew(int ), (int)158);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl702
                }
lbl413:
                // 3 sources

                case 48: {
                    var22_1 /* !! */  = (int)lz.htez("htqb", htew(int ), (int)159);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl730
                }
lbl418:
                // 2 sources

                case 49: {
                    var22_1 /* !! */  = (int)lz.htez("htqc", htew(int ), (int)160);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl690
                }
                case 50: {
                    var22_1 /* !! */  = (int)lz.htez("htqd", htew(int ), (int)161);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl575
                }
lbl428:
                // 3 sources

                case 51: {
                    var22_1 /* !! */  = (int)lz.htez("htqe", htew(int ), (int)162);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl674
                }
                case 52: {
                    var22_1 /* !! */  = (int)lz.htez("htqf", htew(int ), (int)163);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl637
                }
                case 53: {
                    var22_1 /* !! */  = (int)lz.htez("htqg", htew(int ), (int)164);
                    if (!var23) ** GOTO lbl180
                    throw null;
                }
                case 54: {
                    var22_1 /* !! */  = (int)lz.htez("htqh", htew(int ), (int)165);
                    if (!var23) ** GOTO lbl272
                    throw null;
                }
lbl446:
                // 2 sources

                case 55: {
                    var22_1 /* !! */  = (int)lz.htez("htqi", htew(int ), (int)166);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl554
                }
                case 56: {
                    var22_1 /* !! */  = (int)lz.htez("htqj", htew(int ), (int)167);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl718
                }
lbl456:
                // 3 sources

                case 57: {
                    var22_1 /* !! */  = (int)lz.htez("htqk", htew(int ), (int)168);
                    if (!var23) ** GOTO lbl194
                    throw null;
                }
                case 58: {
                    var22_1 /* !! */  = (int)lz.htez("htql", htew(int ), (int)169);
                    if (!var23) ** GOTO lbl263
                    throw null;
                }
lbl464:
                // 2 sources

                case 59: {
                    var22_1 /* !! */  = (int)lz.htez("htqm", htew(int ), (int)170);
                    if (!var23) ** GOTO lbl413
                    throw null;
                }
lbl468:
                // 3 sources

                case 60: {
                    var22_1 /* !! */  = (int)lz.htez("htqn", htew(int ), (int)171);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl588
                }
lbl473:
                // 2 sources

                case 61: {
                    var22_1 /* !! */  = (int)lz.htez("htqo", htew(int ), (int)172);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl678
                }
lbl478:
                // 2 sources

                case 62: {
                    var22_1 /* !! */  = (int)lz.htez("htqp", htew(int ), (int)173);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl670
                }
                case 63: {
                    var22_1 /* !! */  = (int)lz.htez("htqq", htew(int ), (int)174);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl678
                }
                case 64: {
                    var22_1 /* !! */  = (int)lz.htez("htqr", htew(int ), (int)175);
                    if (!var23) ** GOTO lbl428
                    throw null;
                }
                case 65: {
                    var22_1 /* !! */  = (int)lz.htez("htqs", htew(int ), (int)176);
                    if (!var23) ** GOTO lbl248
                    throw null;
                }
lbl496:
                // 3 sources

                case 66: {
                    var22_1 /* !! */  = (int)lz.htez("htqt", htew(int ), (int)177);
                    if (!var23) ** GOTO lbl428
                    throw null;
                }
lbl500:
                // 2 sources

                case 67: {
                    var22_1 /* !! */  = (int)lz.htez("htqu", htew(int ), (int)178);
                    if (!var23) ** GOTO lbl272
                    throw null;
                }
                case 68: {
                    var22_1 /* !! */  = (int)lz.htez("htqv", htew(int ), (int)179);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl558
                }
lbl509:
                // 2 sources

                case 69: {
                    var22_1 /* !! */  = (int)lz.htez("htqw", htew(int ), (int)180);
                    if (!var23) ** GOTO lbl403
                    throw null;
                }
lbl513:
                // 4 sources

                case 70: {
                    var22_1 /* !! */  = (int)lz.htez("htqx", htew(int ), (int)181);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl596
                }
lbl518:
                // 2 sources

                case 71: {
                    var22_1 /* !! */  = (int)lz.htez("htqy", htew(int ), (int)182);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl633
                }
                case 72: {
                    var22_1 /* !! */  = (int)lz.htez("htqz", htew(int ), (int)183);
                    if (!var23) ** GOTO lbl180
                    throw null;
                }
lbl527:
                // 2 sources

                case 73: {
                    var22_1 /* !! */  = (int)lz.htez("htra", htew(int ), (int)184);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl558
                }
lbl532:
                // 3 sources

                case 74: {
                    var22_1 /* !! */  = (int)lz.htez("htrb", htew(int ), (int)185);
                    if (!var23) ** GOTO lbl478
                    throw null;
                }
lbl536:
                // 3 sources

                case 75: {
                    var22_1 /* !! */  = (int)lz.htez("htrc", htew(int ), (int)186);
                    if (!var23) ** GOTO lbl500
                    throw null;
                }
lbl540:
                // 3 sources

                case 76: {
                    var22_1 /* !! */  = (int)lz.htez("htrd", htew(int ), (int)187);
                    if (!var23) ** GOTO lbl180
                    throw null;
                }
lbl544:
                // 3 sources

                case 77: {
                    var22_1 /* !! */  = (int)lz.htez("htre", htew(int ), (int)188);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl739
                }
lbl549:
                // 6 sources

                case 78: {
                    var22_1 /* !! */  = (int)lz.htez("htrf", htew(int ), (int)189);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl558
                }
lbl554:
                // 5 sources

                case 79: {
                    var22_1 /* !! */  = (int)lz.htez("htrg", htew(int ), (int)190);
                    if (!var23) ** GOTO lbl292
                    throw null;
                }
lbl558:
                // 4 sources

                case 80: {
                    var22_1 /* !! */  = (int)lz.htez("htrh", htew(int ), (int)191);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl674
                }
lbl563:
                // 3 sources

                case 81: {
                    var22_1 /* !! */  = (int)lz.htez("htri", htew(int ), (int)192);
                    if (!var23) ** GOTO lbl468
                    throw null;
                }
lbl567:
                // 2 sources

                case 82: {
                    var22_1 /* !! */  = (int)lz.htez("htrj", htew(int ), (int)193);
                    if (!var23) ** GOTO lbl509
                    throw null;
                }
lbl571:
                // 2 sources

                case 83: {
                    var22_1 /* !! */  = (int)lz.htez("htrk", htew(int ), (int)194);
                    if (!var23) ** GOTO lbl228
                    throw null;
                }
lbl575:
                // 2 sources

                case 84: {
                    var22_1 /* !! */  = (int)lz.htez("htrl", htew(int ), (int)195);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl621
                }
                case 85: {
                    var22_1 /* !! */  = (int)lz.htez("htrm", htew(int ), (int)196);
                    if (!var23) ** GOTO lbl496
                    throw null;
                }
lbl584:
                // 2 sources

                case 86: {
                    var22_1 /* !! */  = (int)lz.htez("htrn", htew(int ), (int)197);
                    if (!var23) ** GOTO lbl563
                    throw null;
                }
lbl588:
                // 4 sources

                case 87: {
                    var22_1 /* !! */  = (int)lz.htez("htro", htew(int ), (int)198);
                    if (!var23) ** GOTO lbl385
                    throw null;
                }
lbl592:
                // 2 sources

                case 88: {
                    var22_1 /* !! */  = (int)lz.htez("htrp", htew(int ), (int)199);
                    if (!var23) ** GOTO lbl243
                    throw null;
                }
lbl596:
                // 4 sources

                case 89: {
                    var22_1 /* !! */  = (int)lz.htez("htrq", htew(int ), (int)200);
                    if (!var23) ** GOTO lbl456
                    throw null;
                }
                case 90: {
                    var22_1 /* !! */  = (int)lz.htez("htrr", htew(int ), (int)201);
                    if (!var23) ** GOTO lbl238
                    throw null;
                }
lbl604:
                // 2 sources

                case 91: {
                    var22_1 /* !! */  = (int)lz.htez("htrs", htew(int ), (int)202);
                    if (!var23) ** GOTO lbl549
                    throw null;
                }
lbl608:
                // 2 sources

                case 92: {
                    var22_1 /* !! */  = (int)lz.htez("htrt", htew(int ), (int)203);
                    if (!var23) ** GOTO lbl326
                    throw null;
                }
lbl612:
                // 2 sources

                case 93: {
                    var22_1 /* !! */  = (int)lz.htez("htru", htew(int ), (int)204);
                    if (!var23) ** GOTO lbl331
                    throw null;
                }
lbl616:
                // 3 sources

                case 94: {
                    var22_1 /* !! */  = (int)lz.htez("htrv", htew(int ), (int)205);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl658
                }
lbl621:
                // 3 sources

                case 95: {
                    var22_1 /* !! */  = (int)lz.htez("htrw", htew(int ), (int)206);
                    if (!var23) ** GOTO lbl540
                    throw null;
                }
                case 96: {
                    var22_1 /* !! */  = (int)lz.htez("htrx", htew(int ), (int)207);
                    if (!var23) ** GOTO lbl544
                    throw null;
                }
                case 97: {
                    var22_1 /* !! */  = (int)lz.htez("htry", htew(int ), (int)208);
                    if (!var23) ** GOTO lbl513
                    throw null;
                }
lbl633:
                // 2 sources

                case 98: {
                    var22_1 /* !! */  = (int)lz.htez("htrz", htew(int ), (int)209);
                    if (!var23) ** GOTO lbl608
                    throw null;
                }
lbl637:
                // 2 sources

                case 99: {
                    var22_1 /* !! */  = (int)lz.htez("htsa", htew(int ), (int)210);
                    if (!var23) ** GOTO lbl180
                    throw null;
                }
                case 100: {
                    var22_1 /* !! */  = (int)lz.htez("htsb", htew(int ), (int)211);
                    if (!var23) ** GOTO lbl311
                    throw null;
                }
lbl645:
                // 2 sources

                case 101: {
                    var22_1 /* !! */  = (int)lz.htez("htsc", htew(int ), (int)212);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl722
                }
                case 102: {
                    var22_1 /* !! */  = (int)lz.htez("htsd", htew(int ), (int)213);
                    if (!var23) ** GOTO lbl258
                    throw null;
                }
lbl654:
                // 2 sources

                case 103: {
                    var22_1 /* !! */  = (int)lz.htez("htse", htew(int ), (int)214);
                    if (!var23) ** GOTO lbl549
                    throw null;
                }
lbl658:
                // 2 sources

                case 104: {
                    var22_1 /* !! */  = (int)lz.htez("htsf", htew(int ), (int)215);
                    if (!var23) ** GOTO lbl536
                    throw null;
                }
                case 105: {
                    var22_1 /* !! */  = (int)lz.htez("htsg", htew(int ), (int)216);
                    if (!var23) ** GOTO lbl370
                    throw null;
                }
lbl666:
                // 2 sources

                case 106: {
                    var22_1 /* !! */  = (int)lz.htez("htsh", htew(int ), (int)217);
                    if (!var23) ** GOTO lbl592
                    throw null;
                }
lbl670:
                // 3 sources

                case 107: {
                    var22_1 /* !! */  = (int)lz.htez("htsi", htew(int ), (int)218);
                    if (!var23) ** GOTO lbl554
                    throw null;
                }
lbl674:
                // 4 sources

                case 108: {
                    var22_1 /* !! */  = (int)lz.htez("htsj", htew(int ), (int)219);
                    if (!var23) ** GOTO lbl473
                    throw null;
                }
lbl678:
                // 3 sources

                case 109: {
                    var22_1 /* !! */  = (int)lz.htez("htsk", htew(int ), (int)220);
                    if (!var23) ** GOTO lbl571
                    throw null;
                }
                case 110: {
                    var22_1 /* !! */  = (int)lz.htez("htsl", htew(int ), (int)221);
                    if (!var23) ** GOTO lbl554
                    throw null;
                }
lbl686:
                // 2 sources

                case 111: {
                    var22_1 /* !! */  = (int)lz.htez("htsm", htew(int ), (int)222);
                    if (!var23) ** GOTO lbl616
                    throw null;
                }
lbl690:
                // 2 sources

                case 112: {
                    var22_1 /* !! */  = (int)lz.htez("htsn", htew(int ), (int)223);
                    if (!var23) ** GOTO lbl532
                    throw null;
                }
                case 113: {
                    var22_1 /* !! */  = (int)lz.htez("htso", htew(int ), (int)224);
                    if (!var23) ** GOTO lbl686
                    throw null;
                }
lbl698:
                // 2 sources

                case 114: {
                    var22_1 /* !! */  = (int)lz.htez("htsp", htew(int ), (int)225);
                    if (!var23) ** GOTO lbl224
                    throw null;
                }
lbl702:
                // 2 sources

                case 115: {
                    var22_1 /* !! */  = (int)lz.htez("htsq", htew(int ), (int)226);
                    if (!var23) ** GOTO lbl302
                    throw null;
                }
                case 116: {
                    var22_1 /* !! */  = (int)lz.htez("htsr", htew(int ), (int)227);
                    if (!var23) ** GOTO lbl268
                    throw null;
                }
                case 117: {
                    var22_1 /* !! */  = (int)lz.htez("htss", htew(int ), (int)228);
                    if (!var23) ** GOTO lbl532
                    throw null;
                }
                case 118: {
                    var22_1 /* !! */  = (int)lz.htez("htst", htew(int ), (int)229);
                    if (!var23) ** GOTO lbl418
                    throw null;
                }
lbl718:
                // 2 sources

                case 119: {
                    var22_1 /* !! */  = (int)lz.htez("htsu", htew(int ), (int)230);
                    if (!var23) ** GOTO lbl398
                    throw null;
                }
lbl722:
                // 3 sources

                case 120: {
                    var22_1 /* !! */  = (int)lz.htez("htsv", htew(int ), (int)231);
                    if (!var23) ** GOTO lbl588
                    throw null;
                }
                case 121: {
                    var22_1 /* !! */  = (int)lz.htez("htsw", htew(int ), (int)232);
                    if (!var23) ** GOTO lbl549
                    throw null;
                }
lbl730:
                // 2 sources

                case 122: {
                    var22_1 /* !! */  = (int)lz.htez("htsx", htew(int ), (int)233);
                    if (!var23) ** GOTO lbl544
                    throw null;
                }
                case 123: {
                    var22_1 /* !! */  = (int)lz.htez("htsy", htew(int ), (int)234);
                    if (var23) {
                        throw null;
                    }
                    ** GOTO lbl743
                }
lbl739:
                // 4 sources

                case 124: {
                    var22_1 /* !! */  = (int)lz.htez("htsz", htew(int ), (int)235);
                    if (!var23) ** GOTO lbl403
                    throw null;
                }
lbl743:
                // 2 sources

                case 125: {
                    var22_1 /* !! */  = (int)lz.htez("htta", htew(int ), (int)236);
                    if (!var23) ** GOTO lbl446
                    throw null;
                }
                case 126: 
            }
            break;
        }
        var22_1 /* !! */  = (int)lz.htez("httb", htew(int ), (int)237);
        ** while (!var23)
lbl750:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void huez() {
        lz.htff[0] = -1627815921658383146L;
        lz.htff[1] = -947604018959749970L;
        lz.htff[2] = -2766218382114322711L;
        lz.htff[3] = 2827658749318603077L;
        lz.htff[4] = 4851026577898755832L;
        lz.htff[5] = -3630474001868284684L;
        lz.htff[6] = -6726288976321769563L;
        lz.htff[7] = 7501840669774697391L;
        lz.htff[8] = -6629146864142285049L;
        lz.htff[9] = 1070508615568898969L;
        lz.htff[10] = 8623261183692556005L;
        lz.htff[11] = -6129074371107986242L;
        lz.htff[12] = -5038171038892419880L;
        lz.htff[13] = 766810416685243817L;
        lz.htff[14] = 8116915132756608123L;
        lz.htff[15] = 1052779490110112675L;
        lz.htff[16] = 8835191228269069101L;
        lz.htff[17] = 2037770684583011919L;
        lz.htff[18] = 1481229406666763718L;
        lz.htff[19] = 1841339796005746181L;
        lz.htff[20] = -1012471285977633584L;
        lz.htff[21] = 3047502650049455203L;
        lz.htff[22] = -8788757578669687527L;
        lz.htff[23] = 110626208166159939L;
        lz.htff[24] = -6931287809224281399L;
        lz.htff[25] = 8384520073017690832L;
        lz.htff[26] = -4143735162900035793L;
        lz.htff[27] = -2568082370637188524L;
        lz.htff[28] = -2140934581920888838L;
        lz.htff[29] = -180848513494974361L;
        lz.htff[30] = -1319273215930641293L;
        lz.htff[31] = -7278626838555741977L;
        lz.htff[32] = -454876973735052505L;
        lz.htff[33] = -6271801530757813961L;
        lz.htff[34] = -5286698248450473765L;
        lz.htff[35] = 1197041419349548904L;
        lz.htff[36] = 5333691177985295587L;
        lz.htff[37] = 8624579164695435278L;
        lz.htff[38] = 3921335686807485168L;
        lz.htff[39] = 2640693140133779335L;
        lz.htff[40] = 30709084238044284L;
        lz.htff[41] = -7686424223307689449L;
        lz.htff[42] = 4998681984738611302L;
        lz.htff[43] = 3959774673210180933L;
        lz.htff[44] = 393008881050958932L;
        lz.htff[45] = -1691694097035433688L;
        lz.htff[46] = 1911506110449239530L;
        lz.htff[47] = 8593869155921767167L;
        lz.htff[48] = -4659310824872912416L;
        lz.htff[49] = 4311576478711652220L;
        lz.htff[50] = -4216645447555267110L;
        lz.htff[51] = -1664690901986774431L;
        lz.htff[52] = -6474369901917967010L;
        lz.htff[53] = 6574248376637578377L;
        lz.htff[54] = -1574063597408582191L;
        lz.htff[55] = -5800773167570077084L;
        lz.htff[56] = 7955827559253437626L;
        lz.htff[57] = -7304289196306615319L;
        lz.htff[58] = 7810683543873313809L;
        lz.htff[59] = -4129916365495613795L;
        lz.htff[60] = -9132108012210124435L;
        lz.htff[61] = -1378405530514448945L;
        lz.htff[62] = 3586193438216562321L;
        lz.htff[63] = 8000892501446305720L;
        lz.htff[64] = 8106590205561560084L;
        lz.htff[65] = -1302740011231741926L;
        lz.htff[66] = 5612066412680380563L;
        lz.htff[67] = 806684218903924804L;
        lz.htff[68] = -4822601725971657812L;
        lz.htff[69] = 2625397543960970810L;
        lz.htff[70] = 5090154596200156755L;
        lz.htff[71] = -296583318053354010L;
        lz.htff[72] = 6445475386791401696L;
        lz.htff[73] = 8506562872050029152L;
        lz.htff[74] = 8274087597377062119L;
        lz.htff[75] = 6585148319234358822L;
        lz.htff[76] = -6587318858191750728L;
        lz.htff[77] = 1073748986475816046L;
        lz.htff[78] = 8160536073141207503L;
        lz.htff[79] = -5017447616246073413L;
        lz.htff[80] = 5062160930299901792L;
        lz.htff[81] = -1194434967883932061L;
        lz.htff[82] = -8813544178396018652L;
        lz.htff[83] = -4243116254563742200L;
        lz.htff[84] = -3360086928119282586L;
        lz.htff[85] = -2400793963366953941L;
        lz.htff[86] = 6437756551374647733L;
        lz.htff[87] = 4873412834408483694L;
        lz.htff[88] = -2825679940519776465L;
        lz.htff[89] = 4876602827840631674L;
        lz.htff[90] = 7243652165382298114L;
        lz.htff[91] = -3281106055269399774L;
        lz.htff[92] = -6490866874530451256L;
        lz.htff[93] = -7211104687857046273L;
        lz.htff[94] = 722634159947279218L;
        lz.htff[95] = 7417139407859062275L;
        lz.htff[96] = 8725987629793201719L;
        lz.htff[97] = -4129078497623406947L;
        lz.htff[98] = -3240795942732062512L;
        lz.htff[99] = 4286973853485880564L;
    }

    private static /* synthetic */ void huex() {
        lz.htfe[100] = -1122977525483665547L;
        lz.htfe[101] = -5102522853801794995L;
        lz.htfe[102] = -8953013919888027701L;
        lz.htfe[103] = -3660184391800974551L;
        lz.htfe[104] = -1008703408954004877L;
        lz.htfe[105] = -520428832627555609L;
        lz.htfe[106] = -2425351785566094901L;
        lz.htfe[107] = -5222980470453224314L;
        lz.htfe[108] = 5139421490536118442L;
        lz.htfe[109] = 3472912224898476484L;
        lz.htfe[110] = 8768269313228597210L;
        lz.htfe[111] = 1742854196851865480L;
        lz.htfe[112] = -1039394597889426059L;
        lz.htfe[113] = 7219558547793317935L;
        lz.htfe[114] = -8309263890553634120L;
        lz.htfe[115] = -6510523049497080078L;
        lz.htfe[116] = -2309384904726249819L;
        lz.htfe[117] = -1390046024144329145L;
        lz.htfe[118] = -1608559655027293282L;
        lz.htfe[119] = 2412106326928465019L;
        lz.htfe[120] = -7506721881430408789L;
        lz.htfe[121] = 4571110045129324278L;
        lz.htfe[122] = 1938270183562623385L;
        lz.htfe[123] = 7800412393717995904L;
        lz.htfe[124] = -7671468534425195096L;
        lz.htfe[125] = 8503349068305203063L;
        lz.htfe[126] = 6337230471368126877L;
        lz.htfe[127] = -2016906353466172569L;
        lz.htfe[128] = -3020532486358234661L;
        lz.htfe[129] = 9127703196972348667L;
        lz.htfe[130] = 8362402796948127232L;
        lz.htfe[131] = -921729891030276733L;
        lz.htfe[132] = 8508472883718618556L;
        lz.htfe[133] = -6757464511738695495L;
        lz.htfe[134] = -2579698627756862963L;
        lz.htfe[135] = -3103310397652248734L;
        lz.htfe[136] = -1282950968720635677L;
        lz.htfe[137] = 437054647065055378L;
        lz.htfe[138] = -2371674108826947386L;
        lz.htfe[139] = 1935455072563239150L;
        lz.htfe[140] = 3234530673148976229L;
        lz.htfe[141] = 8890144051603741538L;
        lz.htfe[142] = -7975972371758743350L;
        lz.htfe[143] = 9206221442524560532L;
        lz.htfe[144] = -1149572390444389918L;
        lz.htfe[145] = 5991200611813839734L;
        lz.htfe[146] = 72594269086967651L;
        lz.htfe[147] = -6902471357147091542L;
        lz.htfe[148] = 74436247379059036L;
        lz.htfe[149] = 1065962227658333014L;
        lz.htfe[150] = 7736792222020597331L;
        lz.htfe[151] = 2330073570579942208L;
        lz.htfe[152] = 662004446286567060L;
        lz.htfe[153] = 4051193143296203821L;
        lz.htfe[154] = 1072847809764535327L;
        lz.htfe[155] = 7531164220628251523L;
        lz.htfe[156] = 905977856348609745L;
        lz.htfe[157] = 4723342903790171279L;
        lz.htfe[158] = 1637343521768391753L;
        lz.htfe[159] = -2861535024532354951L;
        lz.htfe[160] = 4979995856468204268L;
        lz.htfe[161] = -5120745946848230076L;
        lz.htfe[162] = 8868832387172125627L;
        lz.htfe[163] = 4301759344983031056L;
        lz.htfe[164] = 7051913895195065739L;
        lz.htfe[165] = -9090925892227921022L;
        lz.htfe[166] = 6133710770010776710L;
        lz.htfe[167] = 5143666553155668754L;
        lz.htfe[168] = 4995282462172642025L;
        lz.htfe[169] = -5154087158901505229L;
        lz.htfe[170] = 6625257068243539692L;
        lz.htfe[171] = 7108321528473727173L;
        lz.htfe[172] = 3386968446595835869L;
        lz.htfe[173] = 2142863486649064301L;
        lz.htfe[174] = 703337900169257111L;
        lz.htfe[175] = 8082658839711734434L;
        lz.htfe[176] = -2014452993757069495L;
        lz.htfe[177] = -2336007022554160909L;
        lz.htfe[178] = 5685850679177423001L;
        lz.htfe[179] = 3490903184231212606L;
        lz.htfe[180] = 1367505832433347404L;
        lz.htfe[181] = -7623451502883215380L;
        lz.htfe[182] = 6352220992268474902L;
        lz.htfe[183] = 8662290161058369970L;
        lz.htfe[184] = -2563836151158142616L;
        lz.htfe[185] = -708559199932629655L;
        lz.htfe[186] = 413763168108994837L;
        lz.htfe[187] = -1270484343821702604L;
        lz.htfe[188] = -657963762294698676L;
        lz.htfe[189] = -99719038217564705L;
        lz.htfe[190] = 1675055033850805966L;
        lz.htfe[191] = -394619390705445929L;
        lz.htfe[192] = -9093632961355065430L;
        lz.htfe[193] = -1869739925083530939L;
        lz.htfe[194] = -4022483678365944281L;
        lz.htfe[195] = -7699564603376561029L;
        lz.htfe[196] = -2914759651908809639L;
        lz.htfe[197] = -2543593684980400233L;
        lz.htfe[198] = -3427432737220890317L;
        lz.htfe[199] = -6432916096656907314L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void soul(double var0, double var2_1, double var4_2, float var6_3, int var7_4, float var8_5, int var9_6) {
        block57: {
            var13_7 = lz.c;
            var12_8 /* !! */  = lz.b;
            var11_9 = lz.a;
            if (var13_7) {
                throw null;
lbl6:
                // 13 sources

                return;
            }
            if (var11_9 || var11_9) ** GOTO lbl6
            if (lz.soulCount < lz.htez("htjb", htew(int ), (int)48)) break block57;
            if (var11_9) ** GOTO lbl6
            return;
        }
        if (var11_9 || var11_9) ** GOTO lbl6
        v0 = lz.soulCount;
        lz.soulCount = v0 + lz.htez("htjc", htew(int ), (int)49);
        var10_10 = v0 * lz.htez("htjd", htew(int ), (int)50);
        if (var11_9 || var11_9) ** GOTO lbl6
        lz.souls[var10_10] = (float)(var0 - lz.cameraX);
        if (var11_9 || var11_9) ** GOTO lbl6
        lz.souls[var10_10 + lz.htez("htje", htew(int ), (int)51)] = (float)(var2_1 - lz.cameraY);
        if (var11_9 || var11_9) ** GOTO lbl6
        lz.souls[var10_10 + lz.htez("htjf", htew(int ), (int)52)] = (float)(var4_2 - lz.cameraZ);
        if (var11_9 || var11_9) ** GOTO lbl6
        lz.souls[var10_10 + 3] = var6_3;
        if (var11_9 || var11_9) ** GOTO lbl6
        lz.souls[var10_10 + lz.htez("htjg", htew(int ), (int)53)] = (float)(var7_4 >> lz.htez("htjh", htew(int ), (int)54) & lz.htez("htji", htew(int ), (int)55)) / 255.0f;
        if (var11_9 || var11_9) ** GOTO lbl6
        lz.souls[var10_10 + lz.htez("htjj", htew(int ), (int)56)] = (float)(var7_4 >> lz.htez("htjk", htew(int ), (int)57) & lz.htez("htjl", htew(int ), (int)58)) / 255.0f;
        if (var12_8 /* !! */  == 0) ** GOTO lbl-1000
        switch (var12_8 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var11_9 || var11_9) ** GOTO lbl6
                lz.souls[var10_10 + lz.htez("htjm", htew(int ), (int)59)] = (float)(var7_4 & lz.htez("htjn", htew(int ), (int)60)) / 255.0f;
                if (var11_9 || var11_9) ** GOTO lbl6
                lz.souls[var10_10 + lz.htez("htjo", htew(int ), (int)61)] = Math.max(0.0f, Math.min(1.0f, var8_5));
                if (var11_9 || var11_9) ** GOTO lbl6
                lz.souls[var10_10 + lz.htez("htjp", htew(int ), (int)62)] = var9_6;
                if (!var11_9 && !var11_9) ** break;
                ** continue;
                return;
            }
lbl41:
            // 2 sources

            case 0: {
                var12_8 /* !! */  = (int)lz.htez("htjq", htew(int ), (int)63);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl131
            }
lbl46:
            // 2 sources

            case 1: {
                var12_8 /* !! */  = (int)lz.htez("htjr", htew(int ), (int)64);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl95
            }
lbl51:
            // 2 sources

            case 2: {
                var12_8 /* !! */  = (int)lz.htez("htjs", htew(int ), (int)65);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl115
            }
lbl56:
            // 2 sources

            case 3: {
                var12_8 /* !! */  = (int)lz.htez("htjt", htew(int ), (int)66);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl66
            }
            case 4: {
                var12_8 /* !! */  = (int)lz.htez("htju", htew(int ), (int)67);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl105
            }
lbl66:
            // 3 sources

            case 5: {
                var12_8 /* !! */  = (int)lz.htez("htjv", htew(int ), (int)68);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl131
            }
            case 6: {
                var12_8 /* !! */  = (int)lz.htez("htjw", htew(int ), (int)69);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl156
            }
            case 7: {
                var12_8 /* !! */  = (int)lz.htez("htjx", htew(int ), (int)70);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl160
            }
            case 8: {
                var12_8 /* !! */  = (int)lz.htez("htjy", htew(int ), (int)71);
                if (!var13_7) ** GOTO lbl56
                throw null;
            }
            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var12_8 /* !! */  = (int)lz.htez("htjz", htew(int ), (int)72);
                    if (var13_7) {
                        throw null;
                    }
                    ** GOTO lbl115
                    break;
                }
            }
            case 10: {
                var12_8 /* !! */  = (int)lz.htez("htka", htew(int ), (int)73);
                if (!var13_7) ** GOTO lbl41
                throw null;
            }
lbl95:
            // 2 sources

            case 11: {
                var12_8 /* !! */  = (int)lz.htez("htkb", htew(int ), (int)74);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl160
            }
            case 12: {
                var12_8 /* !! */  = (int)lz.htez("htkc", htew(int ), (int)75);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl105:
            // 4 sources

            case 13: {
                var12_8 /* !! */  = (int)lz.htez("htkd", htew(int ), (int)76);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl160
            }
lbl110:
            // 2 sources

            case 14: {
                var12_8 /* !! */  = (int)lz.htez("htke", htew(int ), (int)77);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl148
            }
lbl115:
            // 3 sources

            case 15: {
                var12_8 /* !! */  = (int)lz.htez("htkf", htew(int ), (int)78);
                if (!var13_7) ** GOTO lbl46
                throw null;
            }
            case 16: {
                var12_8 /* !! */  = (int)lz.htez("htkg", htew(int ), (int)79);
                if (!var13_7) ** GOTO lbl51
                throw null;
            }
lbl123:
            // 2 sources

            case 17: {
                var12_8 /* !! */  = (int)lz.htez("htkh", htew(int ), (int)80);
                if (!var13_7) break;
                throw null;
            }
lbl127:
            // 2 sources

            case 18: {
                var12_8 /* !! */  = (int)lz.htez("htki", htew(int ), (int)81);
                if (!var13_7) break;
                throw null;
            }
lbl131:
            // 3 sources

            case 19: {
                var12_8 /* !! */  = (int)lz.htez("htkj", htew(int ), (int)82);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl140
            }
lbl136:
            // 2 sources

            case 20: {
                var12_8 /* !! */  = (int)lz.htez("htkk", htew(int ), (int)83);
                if (!var13_7) ** GOTO lbl105
                throw null;
            }
lbl140:
            // 2 sources

            case 21: {
                var12_8 /* !! */  = (int)lz.htez("htkl", htew(int ), (int)84);
                if (!var13_7) ** GOTO lbl127
                throw null;
            }
            case 22: {
                var12_8 /* !! */  = (int)lz.htez("htkm", htew(int ), (int)85);
                if (!var13_7) ** GOTO lbl105
                throw null;
            }
lbl148:
            // 2 sources

            case 23: {
                var12_8 /* !! */  = (int)lz.htez("htkn", htew(int ), (int)86);
                if (!var13_7) ** GOTO lbl110
                throw null;
            }
lbl152:
            // 2 sources

            case 24: {
                var12_8 /* !! */  = (int)lz.htez("htko", htew(int ), (int)87);
                if (!var13_7) ** GOTO lbl123
                throw null;
            }
lbl156:
            // 2 sources

            case 25: {
                var12_8 /* !! */  = (int)lz.htez("htkp", htew(int ), (int)88);
                if (!var13_7) ** GOTO lbl136
                throw null;
            }
lbl160:
            // 4 sources

            case 26: {
                var12_8 /* !! */  = (int)lz.htez("htkq", htew(int ), (int)89);
                if (!var13_7) ** GOTO lbl66
                throw null;
            }
            case 27: 
        }
        var12_8 /* !! */  = (int)lz.htez("htkr", htew(int ), (int)90);
        ** while (!var13_7)
lbl167:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void init() {
        block159: {
            v0 /* !! */  = lz.oy;
            if (true) ** GOTO lbl5
            block102: while (true) {
                v0 /* !! */  = (long)(v1 - lz.htez("httc", htfd(int ), (int)55));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1488544984: {
                        v1 = lz.htez("httd", htfd(int ), (int)56);
                        continue block102;
                    }
                    case -161495625: {
                        v1 = lz.htez("htte", htfd(int ), (int)57);
                        continue block102;
                    }
                    case 780632958: {
                        v1 = lz.htez("httf", htfd(int ), (int)58);
                        continue block102;
                    }
                    case 1410940106: {
                        break block102;
                    }
                }
                break;
            }
            var3 = lz.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = lz.oy - lz.htez("httg", htfd(int ), (int)59)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == lz.htez("htth", htew(int ), (int)238)) break;
                v2 /* !! */  = (long)lz.htez("htti", htew(int ), (int)239);
            }
            var2_1 /* !! */  = lz.b;
            v3 /* !! */  = lz.oy;
            if (true) ** GOTO lbl28
            block104: while (true) {
                v3 /* !! */  = (long)(lz.htez("httk", htfd(int ), (int)61) - lz.htez("httj", htfd(int ), (int)60));
lbl28:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case 1410940106: {
                        break block104;
                    }
                    case 2136579397: {
                        continue block104;
                    }
                }
                break;
            }
            var1_2 = lz.a;
            if (var3) {
                throw null;
lbl36:
                // 7 sources

                return;
            }
            if (var1_2 || var1_2) ** GOTO lbl36
            v4 /* !! */  = lz.oy;
            if (true) ** GOTO lbl43
            block106: while (true) {
                v4 /* !! */  = (long)(v5 - lz.htez("httl", htfd(int ), (int)62));
lbl43:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -1942344906: {
                        v5 = lz.htez("httm", htfd(int ), (int)63);
                        continue block106;
                    }
                    case -1405021777: {
                        v5 = lz.htez("httn", htfd(int ), (int)64);
                        continue block106;
                    }
                    case -616392745: {
                        v5 = lz.htez("htto", htfd(int ), (int)65);
                        continue block106;
                    }
                    case 1410940106: {
                        break block106;
                    }
                }
                break;
            }
            if (lz.pipeline == null) break block159;
            if (var1_2 || var1_2) ** GOTO lbl36
            return;
        }
        if (var1_2 || var1_2) ** GOTO lbl36
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_1 = lz.oy - lz.htez("http", htfd(int ), (int)66)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == lz.htez("httq", htew(int ), (int)240)) break;
            v6 /* !! */  = (long)lz.htez("httr", htew(int ), (int)241);
        }
        v7 = VertexFormat.builder();
        v8 /* !! */  = lz.oy;
        if (true) ** GOTO lbl70
        block108: while (true) {
            v8 /* !! */  = (long)(v9 - lz.htez("htts", htfd(int ), (int)67));
lbl70:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1702052685: {
                    v9 = lz.htez("httt", htfd(int ), (int)68);
                    continue block108;
                }
                case -446687730: {
                    v9 = lz.htez("httu", htfd(int ), (int)69);
                    continue block108;
                }
                case 1410940106: {
                    break block108;
                }
                case 1886568039: {
                    v9 = lz.htez("httv", htfd(int ), (int)70);
                    continue block108;
                }
            }
            break;
        }
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_2 = lz.oy - lz.htez("httw", htfd(int ), (int)71)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == lz.htez("httx", htew(int ), (int)242)) break;
            v10 /* !! */  = (long)lz.htez("htty", htew(int ), (int)243);
        }
        v11 = v7.add("inPosition", VertexFormatElement.POSITION);
        v12 /* !! */  = lz.oy;
        if (true) ** GOTO lbl92
        block110: while (true) {
            v12 /* !! */  = (long)(lz.htez("htua", htfd(int ), (int)73) - lz.htez("httz", htfd(int ), (int)72));
lbl92:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case 1410940106: {
                    break block110;
                }
                case 1841399590: {
                    continue block110;
                }
            }
            break;
        }
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_3 = lz.oy - lz.htez("htub", htfd(int ), (int)74)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == lz.htez("htuc", htew(int ), (int)244)) break;
            v13 /* !! */  = (long)lz.htez("htud", htew(int ), (int)245);
        }
        v14 = v11.add("inColor", VertexFormatElement.COLOR);
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_4 = lz.oy - lz.htez("htue", htfd(int ), (int)75)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v15 /* !! */  == lz.htez("htuf", htew(int ), (int)246)) break;
            v15 /* !! */  = (long)lz.htez("htug", htew(int ), (int)247);
        }
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_5 = lz.oy - lz.htez("htuh", htfd(int ), (int)76)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v16 /* !! */  == lz.htez("htui", htew(int ), (int)248)) break;
            v16 /* !! */  = (long)lz.htez("htuj", htew(int ), (int)249);
        }
        v17 = v14.add("inUV", VertexFormatElement.UV);
        while (true) {
            if ((v18 /* !! */  = (cfr_temp_6 = lz.oy - lz.htez("htuk", htfd(int ), (int)77)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v18 /* !! */  == lz.htez("htul", htew(int ), (int)250)) break;
            v18 /* !! */  = (long)lz.htez("htum", htew(int ), (int)251);
        }
        var0_3 = v17.build();
        if (var1_2 || var1_2) ** GOTO lbl36
        v19 = new RenderPipeline.Snippet[]{};
        v20 /* !! */  = lz.oy;
        if (true) ** GOTO lbl126
        block115: while (true) {
            v20 /* !! */  = (long)(v21 - lz.htez("htun", htfd(int ), (int)78));
lbl126:
            // 2 sources

            switch ((int)v20 /* !! */ ) {
                case -1043013565: {
                    v21 = lz.htez("htuo", htfd(int ), (int)79);
                    continue block115;
                }
                case 549111765: {
                    v21 = lz.htez("htup", htfd(int ), (int)80);
                    continue block115;
                }
                case 1410940106: {
                    break block115;
                }
            }
            break;
        }
        v22 = RenderPipeline.builder((RenderPipeline.Snippet[])v19);
        v23 /* !! */  = lz.oy;
        if (true) ** GOTO lbl140
        block116: while (true) {
            v23 /* !! */  = (long)(lz.htez("htur", htfd(int ), (int)82) - lz.htez("htuq", htfd(int ), (int)81));
lbl140:
            // 2 sources

            switch ((int)v23 /* !! */ ) {
                case -567511004: {
                    continue block116;
                }
                case 1410940106: {
                    break block116;
                }
            }
            break;
        }
        v24 = class_2960.method_60655((String)"phobia", (String)"3d/soul3d");
        v25 /* !! */  = lz.oy;
        if (true) ** GOTO lbl150
        block117: while (true) {
            v25 /* !! */  = (long)(v26 - lz.htez("htus", htfd(int ), (int)83));
lbl150:
            // 2 sources

            switch ((int)v25 /* !! */ ) {
                case 400539159: {
                    v26 = lz.htez("htut", htfd(int ), (int)84);
                    continue block117;
                }
                case 1410940106: {
                    break block117;
                }
                case 1666226260: {
                    v26 = lz.htez("htuu", htfd(int ), (int)85);
                    continue block117;
                }
            }
            break;
        }
        v27 = v22.withLocation(v24);
        v28 /* !! */  = lz.oy;
        if (true) ** GOTO lbl164
        block118: while (true) {
            v28 /* !! */  = (long)(lz.htez("htuw", htfd(int ), (int)87) - lz.htez("htuv", htfd(int ), (int)86));
lbl164:
            // 2 sources

            switch ((int)v28 /* !! */ ) {
                case -1024097819: {
                    continue block118;
                }
                case 1410940106: {
                    break block118;
                }
            }
            break;
        }
        v29 = class_2960.method_60655((String)"phobia", (String)"3d/soul3d_vertex");
        v30 /* !! */  = lz.oy;
        if (true) ** GOTO lbl174
        block119: while (true) {
            v30 /* !! */  = (long)(v31 - lz.htez("htux", htfd(int ), (int)88));
lbl174:
            // 2 sources

            switch ((int)v30 /* !! */ ) {
                case 995791007: {
                    v31 = lz.htez("htuy", htfd(int ), (int)89);
                    continue block119;
                }
                case 1026222030: {
                    v31 = lz.htez("htuz", htfd(int ), (int)90);
                    continue block119;
                }
                case 1410940106: {
                    break block119;
                }
            }
            break;
        }
        v32 = v27.withVertexShader(v29);
        while (true) {
            if ((v33 /* !! */  = (cfr_temp_7 = lz.oy - lz.htez("htva", htfd(int ), (int)91)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v33 /* !! */  == lz.htez("htvb", htew(int ), (int)252)) break;
            v33 /* !! */  = (long)lz.htez("htvc", htew(int ), (int)253);
        }
        v34 = class_2960.method_60655((String)"phobia", (String)"3d/soul3d_fragment");
        while (true) {
            if ((v35 /* !! */  = (cfr_temp_8 = lz.oy - lz.htez("htvd", htfd(int ), (int)92)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v35 /* !! */  == lz.htez("htve", htew(int ), (int)254)) break;
            v35 /* !! */  = (long)lz.htez("htvf", htew(int ), (int)255);
        }
        v36 = v32.withFragmentShader(v34);
        while (true) {
            if ((v37 /* !! */  = (cfr_temp_9 = lz.oy - lz.htez("htvg", htfd(int ), (int)93)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v37 /* !! */  == lz.htez("htvh", htew(int ), (int)256)) break;
            v37 /* !! */  = (long)lz.htez("htvi", htew(int ), (int)257);
        }
        while (true) {
            if ((v38 /* !! */  = (cfr_temp_10 = lz.oy - lz.htez("htvj", htfd(int ), (int)94)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
            if (v38 /* !! */  == lz.htez("htvk", htew(int ), (int)258)) break;
            v38 /* !! */  = (long)lz.htez("htvl", htew(int ), (int)259);
        }
        v39 = v36.withVertexFormat(var0_3, VertexFormat.class_5596.field_27379);
        while (true) {
            if ((v40 /* !! */  = (cfr_temp_11 = lz.oy - lz.htez("htvm", htfd(int ), (int)95)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
            if (v40 /* !! */  == lz.htez("htvn", htew(int ), (int)260)) break;
            v40 /* !! */  = (long)lz.htez("htvo", htew(int ), (int)261);
        }
        v41 /* !! */  = lz.oy;
        if (true) ** GOTO lbl216
        block125: while (true) {
            v41 /* !! */  = (long)(v42 - lz.htez("htvp", htfd(int ), (int)96));
lbl216:
            // 2 sources

            switch ((int)v41 /* !! */ ) {
                case -1653162787: {
                    v42 = lz.htez("htvq", htfd(int ), (int)97);
                    continue block125;
                }
                case 1298797790: {
                    v42 = lz.htez("htvr", htfd(int ), (int)98);
                    continue block125;
                }
                case 1410940106: {
                    break block125;
                }
            }
            break;
        }
        v43 = v39.withUniform("Uniforms", class_10789.field_60031);
        v44 /* !! */  = lz.oy;
        if (true) ** GOTO lbl230
        block126: while (true) {
            v44 /* !! */  = (long)(v45 - lz.htez("htvs", htfd(int ), (int)99));
lbl230:
            // 2 sources

            switch ((int)v44 /* !! */ ) {
                case -1421810741: {
                    v45 = lz.htez("htvt", htfd(int ), (int)100);
                    continue block126;
                }
                case 220519149: {
                    v45 = lz.htez("htvu", htfd(int ), (int)101);
                    continue block126;
                }
                case 1410940106: {
                    break block126;
                }
            }
            break;
        }
        while (true) {
            if ((v46 /* !! */  = (cfr_temp_12 = lz.oy - lz.htez("htvv", htfd(int ), (int)102)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
            if (v46 /* !! */  == lz.htez("htvw", htew(int ), (int)262)) break;
            v46 /* !! */  = (long)lz.htez("htvx", htew(int ), (int)263);
        }
        v47 = v43.withBlend(BlendFunction.ADDITIVE);
        while (true) {
            if ((v48 /* !! */  = (cfr_temp_13 = lz.oy - lz.htez("htvy", htfd(int ), (int)103)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
            if (v48 /* !! */  == lz.htez("htvz", htew(int ), (int)264)) break;
            v48 /* !! */  = (long)lz.htez("htwa", htew(int ), (int)265);
        }
        v49 /* !! */  = lz.oy;
        if (true) ** GOTO lbl254
        block129: while (true) {
            v49 /* !! */  = (long)(v50 - lz.htez("htwb", htfd(int ), (int)104));
lbl254:
            // 2 sources

            switch ((int)v49 /* !! */ ) {
                case -153430028: {
                    v50 = lz.htez("htwc", htfd(int ), (int)105);
                    continue block129;
                }
                case 1390510782: {
                    v50 = lz.htez("htwd", htfd(int ), (int)106);
                    continue block129;
                }
                case 1410940106: {
                    break block129;
                }
            }
            break;
        }
        v51 = v47.withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST);
        v52 = lz.htez("htwe", htew(int ), (int)266);
        while (true) {
            if ((v53 /* !! */  = (cfr_temp_14 = lz.oy - lz.htez("htwf", htfd(int ), (int)107)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
            if (v53 /* !! */  == lz.htez("htwg", htew(int ), (int)267)) break;
            v53 /* !! */  = (long)lz.htez("htwh", htew(int ), (int)268);
        }
        v54 = v51.withCull((boolean)v52);
        v55 = lz.htez("htwi", htew(int ), (int)269);
        while (true) {
            if ((v56 /* !! */  = (cfr_temp_15 = lz.oy - lz.htez("htwj", htfd(int ), (int)108)) == 0L ? 0 : (cfr_temp_15 < 0L ? -1 : 1)) == false) continue;
            if (v56 /* !! */  == lz.htez("htwk", htew(int ), (int)270)) break;
            v56 /* !! */  = (long)lz.htez("htwl", htew(int ), (int)271);
        }
        v57 = v54.withDepthWrite((boolean)v55);
        v58 /* !! */  = lz.oy;
        if (true) ** GOTO lbl282
        block132: while (true) {
            v58 /* !! */  = (long)(v59 - lz.htez("htwm", htfd(int ), (int)109));
lbl282:
            // 2 sources

            switch ((int)v58 /* !! */ ) {
                case -957016510: {
                    v59 = lz.htez("htwn", htfd(int ), (int)110);
                    continue block132;
                }
                case -40358450: {
                    v59 = lz.htez("htwo", htfd(int ), (int)111);
                    continue block132;
                }
                case 270538238: {
                    v59 = lz.htez("htwp", htfd(int ), (int)112);
                    continue block132;
                }
                case 1410940106: {
                    break block132;
                }
            }
            break;
        }
        v60 = v57.build();
        while (true) {
            if ((v61 /* !! */  = (cfr_temp_16 = lz.oy - lz.htez("htwq", htfd(int ), (int)113)) == 0L ? 0 : (cfr_temp_16 < 0L ? -1 : 1)) == false) continue;
            if (v61 /* !! */  == lz.htez("htwr", htew(int ), (int)272)) break;
            v61 /* !! */  = (long)lz.htez("htws", htew(int ), (int)273);
        }
        lz.pipeline = v60;
        if (var1_2 || var1_2) ** GOTO lbl36
        while (true) {
            if ((v62 /* !! */  = (cfr_temp_17 = lz.oy - lz.htez("htwt", htfd(int ), (int)114)) == 0L ? 0 : (cfr_temp_17 < 0L ? -1 : 1)) == false) continue;
            if (v62 /* !! */  == lz.htez("htwu", htew(int ), (int)274)) break;
            v62 /* !! */  = (long)lz.htez("htwv", htew(int ), (int)275);
        }
        v63 = RenderSystem.getDevice();
        while (true) {
            if ((v64 /* !! */  = (cfr_temp_18 = lz.oy - lz.htez("htww", htfd(int ), (int)115)) == 0L ? 0 : (cfr_temp_18 < 0L ? -1 : 1)) == false) continue;
            if (v64 /* !! */  == lz.htez("htwx", htew(int ), (int)276)) break;
            v64 /* !! */  = (long)lz.htez("htwy", htew(int ), (int)277);
        }
        v65 = (Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$init$1(), ()Ljava/lang/String;)();
        v66 = lz.htez("htwz", htew(int ), (int)278);
        v67 = lz.htez("htxa", htfd(int ), (int)116);
        while (true) {
            if ((v68 /* !! */  = (cfr_temp_19 = lz.oy - lz.htez("htxb", htfd(int ), (int)117)) == 0L ? 0 : (cfr_temp_19 < 0L ? -1 : 1)) == false) continue;
            if (v68 /* !! */  == lz.htez("htxc", htew(int ), (int)279)) break;
            v68 /* !! */  = (long)lz.htez("htxd", htew(int ), (int)280);
        }
        v69 = v63.createBuffer(v65, (int)v66, (long)v67);
        v70 /* !! */  = lz.oy;
        if (true) ** GOTO lbl326
        block137: while (true) {
            v70 /* !! */  = (long)(v71 - lz.htez("htxe", htfd(int ), (int)118));
lbl326:
            // 2 sources

            switch ((int)v70 /* !! */ ) {
                case -863631332: {
                    v71 = lz.htez("htxf", htfd(int ), (int)119);
                    continue block137;
                }
                case -251355377: {
                    v71 = lz.htez("htxg", htfd(int ), (int)120);
                    continue block137;
                }
                case 1410940106: {
                    break block137;
                }
            }
            break;
        }
        lz.uniformBuffer = v69;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_2 || var1_2) ** GOTO lbl36
                v72 /* !! */  = lz.oy;
                if (true) ** GOTO lbl344
                block138: while (true) {
                    v72 /* !! */  = (long)(lz.htez("htxi", htfd(int ), (int)122) - lz.htez("htxh", htfd(int ), (int)121));
lbl344:
                    // 2 sources

                    switch ((int)v72 /* !! */ ) {
                        case 1039679350: {
                            continue block138;
                        }
                        case 1410940106: {
                            break block138;
                        }
                    }
                    break;
                }
                v73 = RenderSystem.getDevice();
                while (true) {
                    if ((v74 /* !! */  = (cfr_temp_20 = lz.oy - lz.htez("htxj", htfd(int ), (int)123)) == 0L ? 0 : (cfr_temp_20 < 0L ? -1 : 1)) == false) continue;
                    if (v74 /* !! */  == lz.htez("htxk", htew(int ), (int)281)) break;
                    v74 /* !! */  = (long)lz.htez("htxl", htew(int ), (int)282);
                }
                v75 = (Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$init$2(), ()Ljava/lang/String;)();
                v76 = lz.htez("htxm", htew(int ), (int)283);
                v77 = lz.htez("htxn", htfd(int ), (int)124);
                while (true) {
                    if ((v78 /* !! */  = (cfr_temp_21 = lz.oy - lz.htez("htxo", htfd(int ), (int)125)) == 0L ? 0 : (cfr_temp_21 < 0L ? -1 : 1)) == false) continue;
                    if (v78 /* !! */  == lz.htez("htxp", htew(int ), (int)284)) break;
                    v78 /* !! */  = (long)lz.htez("htxq", htew(int ), (int)285);
                }
                v79 = v73.createBuffer(v75, (int)v76, (long)v77);
                v80 /* !! */  = lz.oy;
                if (true) ** GOTO lbl368
                block141: while (true) {
                    v80 /* !! */  = (long)(lz.htez("htxs", htfd(int ), (int)127) - lz.htez("htxr", htfd(int ), (int)126));
lbl368:
                    // 2 sources

                    switch ((int)v80 /* !! */ ) {
                        case 847895279: {
                            continue block141;
                        }
                        case 1410940106: {
                            break block141;
                        }
                    }
                    break;
                }
                lz.vertexBuffer = v79;
                if (var1_2 || var1_2) ** continue;
                return;
            }
lbl376:
            // 2 sources

            case 0: {
                do {
                    var2_1 /* !! */  = (int)lz.htez("htxt", htew(int ), (int)286);
                } while (!var3);
                throw null;
            }
lbl381:
            // 2 sources

            case 1: {
                do {
                    var2_1 /* !! */  = (int)lz.htez("htxu", htew(int ), (int)287);
                } while (!var3);
                throw null;
            }
            case 2: {
                var2_1 /* !! */  = (int)lz.htez("htxv", htew(int ), (int)288);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl414
            }
            case 3: {
                var2_1 /* !! */  = (int)lz.htez("htxw", htew(int ), (int)289);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl414
            }
            case 4: {
                var2_1 /* !! */  = (int)lz.htez("htxx", htew(int ), (int)290);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl406
            }
lbl401:
            // 2 sources

            case 5: {
                var2_1 /* !! */  = (int)lz.htez("htxy", htew(int ), (int)291);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl442
            }
lbl406:
            // 4 sources

            case 6: {
                var2_1 /* !! */  = (int)lz.htez("htxz", htew(int ), (int)292);
                if (!var3) ** GOTO lbl376
                throw null;
            }
            case 7: {
                var2_1 /* !! */  = (int)lz.htez("htya", htew(int ), (int)293);
                if (!var3) ** GOTO lbl406
                throw null;
            }
lbl414:
            // 3 sources

            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)lz.htez("htyb", htew(int ), (int)294);
                    if (var3) {
                        throw null;
                    }
                    ** GOTO lbl434
                    break;
                }
            }
            case 9: {
                var2_1 /* !! */  = (int)lz.htez("htyc", htew(int ), (int)295);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl429
            }
lbl425:
            // 2 sources

            case 10: {
                var2_1 /* !! */  = (int)lz.htez("htyd", htew(int ), (int)296);
                if (!var3) ** GOTO lbl401
                throw null;
            }
lbl429:
            // 2 sources

            case 11: {
                var2_1 /* !! */  = (int)lz.htez("htye", htew(int ), (int)297);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl442
            }
lbl434:
            // 2 sources

            case 12: {
                var2_1 /* !! */  = (int)lz.htez("htyf", htew(int ), (int)298);
                if (!var3) ** GOTO lbl425
                throw null;
            }
            case 13: {
                var2_1 /* !! */  = (int)lz.htez("htyg", htew(int ), (int)299);
                if (var3) {
                    throw null;
                }
            }
lbl442:
            // 5 sources

            case 14: {
                var2_1 /* !! */  = (int)lz.htez("htyh", htew(int ), (int)300);
                if (!var3) ** GOTO lbl381
                throw null;
            }
            case 15: {
                var2_1 /* !! */  = (int)lz.htez("htyi", htew(int ), (int)301);
                if (!var3) ** GOTO lbl406
                throw null;
            }
            case 16: 
        }
        var2_1 /* !! */  = (int)lz.htez("htyj", htew(int ), (int)302);
        ** while (!var3)
lbl453:
        // 1 sources

        throw null;
    }
}

