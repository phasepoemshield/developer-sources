/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_4587
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
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
import java.nio.ByteBuffer;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Supplier;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import ruhack.phobia.om;

public class lp {
    private static final int UNIFORM_SIZE = 256;
    private static boolean ignoreDepth;
    private static RenderPipeline pipeline;
    private static final float[] vertices;
    private static int vertexCount;
    private static GpuBuffer uniformBuffer;
    private static int[] irvd;
    private static final Matrix4f combinedMatrix;
    private static long[] iruv;
    private static Matrix4f viewMatrix;
    private static long[] iruu;
    private static final int MAX_VERTICES = 4096;
    private static final int VERTEX_SIZE = 16;
    private static final long qg = 5565136761591311213L;
    private static final Matrix4f identityMatrix;
    private static GpuBuffer vertexBuffer;
    public static final boolean a;
    public static final boolean c;
    private static Matrix4f projectionMatrix;
    private static final class_310 mc;
    private static int[] irve;
    public static final int b;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void addLine(float var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, float var8_8, float var9_9) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lp.qg - lp.iruw("iszj", irus(int ), (int)149)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == lp.iruw("iszk", irvc(int ), (int)312)) break;
            v0 /* !! */  = (long)lp.iruw("iszl", irvc(int ), (int)313);
        }
        var12_10 = lp.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = lp.qg - lp.iruw("iszm", irus(int ), (int)150)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == lp.iruw("iszn", irvc(int ), (int)314)) break;
            v1 /* !! */  = (long)lp.iruw("iszo", irvc(int ), (int)315);
        }
        var11_11 /* !! */  = lp.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = lp.qg - lp.iruw("iszp", irus(int ), (int)151)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == lp.iruw("iszq", irvc(int ), (int)316)) break;
            v2 /* !! */  = (long)lp.iruw("iszr", irvc(int ), (int)317);
        }
        var10_12 = lp.a;
        if (var12_10) {
            throw null;
lbl21:
            // 3 sources

            return;
        }
        if (var11_11 /* !! */  == 0) ** GOTO lbl-1000
        switch (var11_11 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var10_12 || var10_12) ** GOTO lbl21
                v3 /* !! */  = lp.qg;
                if (true) ** GOTO lbl31
                block19: while (true) {
                    v3 /* !! */  = (long)(v4 - lp.iruw("iszs", irus(int ), (int)152));
lbl31:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -908398693: {
                            v4 = lp.iruw("iszt", irus(int ), (int)153);
                            continue block19;
                        }
                        case -783834250: {
                            v4 = lp.iruw("iszu", irus(int ), (int)154);
                            continue block19;
                        }
                        case 958278509: {
                            break block19;
                        }
                    }
                    break;
                }
                lp.addVertex(var0, var1_1, var2_2, var6_6, var7_7, var8_8, var9_9);
                if (var10_12 || var10_12) ** GOTO lbl21
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = lp.qg - lp.iruw("iszv", irus(int ), (int)155)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == lp.iruw("iszw", irvc(int ), (int)318)) break;
                    v5 /* !! */  = (long)lp.iruw("iszx", irvc(int ), (int)319);
                }
                lp.addVertex(var3_3, var4_4, var5_5, var6_6, var7_7, var8_8, var9_9);
                if (var10_12 || var10_12) ** continue;
                return;
            }
            case 0: {
                var11_11 /* !! */  = (int)lp.iruw("iszy", irvc(int ), (int)320);
                if (var12_10) {
                    throw null;
                }
                ** GOTO lbl64
            }
lbl55:
            // 3 sources

            case 1: {
                var11_11 /* !! */  = (int)lp.iruw("iszz", irvc(int ), (int)321);
                if (var12_10) {
                    throw null;
                }
                ** GOTO lbl77
            }
            case 2: {
                var11_11 /* !! */  = (int)lp.iruw("itaa", irvc(int ), (int)322);
                if (!var12_10) ** GOTO lbl55
                throw null;
            }
lbl64:
            // 2 sources

            case 3: {
                var11_11 /* !! */  = (int)lp.iruw("itab", irvc(int ), (int)323);
                if (var12_10) {
                    throw null;
                }
                ** GOTO lbl73
            }
lbl69:
            // 2 sources

            case 4: {
                var11_11 /* !! */  = (int)lp.iruw("itac", irvc(int ), (int)324);
                if (!var12_10) ** GOTO lbl55
                throw null;
            }
lbl73:
            // 2 sources

            case 5: {
                var11_11 /* !! */  = (int)lp.iruw("itad", irvc(int ), (int)325);
                if (!var12_10) ** GOTO lbl69
                throw null;
            }
lbl77:
            // 2 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var11_11 /* !! */  = (int)lp.iruw("itae", irvc(int ), (int)326);
                    if (!var12_10) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 7: 
        }
        var11_11 /* !! */  = (int)lp.iruw("itaf", irvc(int ), (int)327);
        ** while (!var12_10)
lbl85:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$init$1() {
        v0 /* !! */  = lp.qg;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(lp.iruw("itrw", irus(int ), (int)288) - lp.iruw("itrv", irus(int ), (int)287));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1691963520: {
                    continue block21;
                }
                case 958278509: {
                    break block21;
                }
            }
            break;
        }
        var2 = lp.c;
        v1 /* !! */  = lp.qg;
        if (true) ** GOTO lbl15
        block22: while (true) {
            v1 /* !! */  = (long)(v2 - lp.iruw("itrx", irus(int ), (int)289));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1949542919: {
                    v2 = lp.iruw("itry", irus(int ), (int)290);
                    continue block22;
                }
                case -1183658317: {
                    v2 = lp.iruw("itrz", irus(int ), (int)291);
                    continue block22;
                }
                case 469300856: {
                    v2 = lp.iruw("itsa", irus(int ), (int)292);
                    continue block22;
                }
                case 958278509: {
                    break block22;
                }
            }
            break;
        }
        var1_1 /* !! */  = lp.b;
        v3 /* !! */  = lp.qg;
        if (true) ** GOTO lbl32
        block23: while (true) {
            v3 /* !! */  = (long)(v4 - lp.iruw("itsb", irus(int ), (int)293));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1724005790: {
                    v4 = lp.iruw("itsc", irus(int ), (int)294);
                    continue block23;
                }
                case 818559207: {
                    v4 = lp.iruw("itsd", irus(int ), (int)295);
                    continue block23;
                }
                case 958278509: {
                    break block23;
                }
            }
            break;
        }
        var0_2 = lp.a;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                return "Render3D Vertices";
            }
lbl51:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)lp.iruw("itse", irvc(int ), (int)524);
                if (var2) {
                    throw null;
                }
            }
            case 1: {
                var1_1 /* !! */  = (int)lp.iruw("itsf", irvc(int ), (int)525);
                if (!var2) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)lp.iruw("itsg", irvc(int ), (int)526);
                    if (!var2) ** GOTO lbl51
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)lp.iruw("itsh", irvc(int ), (int)527);
        ** while (!var2)
lbl67:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void begin(class_4587 var0, boolean var1_1) {
        block75: {
            v0 /* !! */  = lp.qg;
            if (true) ** GOTO lbl5
            block48: while (true) {
                v0 /* !! */  = (long)(v1 - lp.iruw("iskx", irus(int ), (int)113));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case 208917734: {
                        v1 = lp.iruw("isky", irus(int ), (int)114);
                        continue block48;
                    }
                    case 360660162: {
                        v1 = lp.iruw("iskz", irus(int ), (int)115);
                        continue block48;
                    }
                    case 958278509: {
                        break block48;
                    }
                }
                break;
            }
            var4_2 = lp.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = lp.qg - lp.iruw("islb", irus(int ), (int)116)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == lp.iruw("isld", irvc(int ), (int)105)) break;
                v2 /* !! */  = (long)lp.iruw("isle", irvc(int ), (int)106);
            }
            var3_3 /* !! */  = lp.b;
            v3 /* !! */  = lp.qg;
            if (true) ** GOTO lbl25
            block50: while (true) {
                v3 /* !! */  = (long)(v4 - lp.iruw("islg", irus(int ), (int)117));
lbl25:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case 958278509: {
                        break block50;
                    }
                    case 1558074521: {
                        v4 = lp.iruw("isli", irus(int ), (int)118);
                        continue block50;
                    }
                    case 1630795761: {
                        v4 = lp.iruw("islj", irus(int ), (int)119);
                        continue block50;
                    }
                }
                break;
            }
            var2_4 = lp.a;
            if (var4_2) {
                throw null;
lbl37:
                // 7 sources

                return;
            }
            if (var2_4 || var2_4) ** GOTO lbl37
            v5 /* !! */  = lp.qg;
            if (true) ** GOTO lbl44
            block52: while (true) {
                v5 /* !! */  = (long)(v6 - lp.iruw("isll", irus(int ), (int)120));
lbl44:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -894476013: {
                        v6 = lp.iruw("islm", irus(int ), (int)121);
                        continue block52;
                    }
                    case 281872316: {
                        v6 = lp.iruw("islo", irus(int ), (int)122);
                        continue block52;
                    }
                    case 958278509: {
                        break block52;
                    }
                }
                break;
            }
            if (lp.pipeline != null) break block75;
            if (var2_4 || var2_4) ** GOTO lbl37
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_1 = lp.qg - lp.iruw("islq", irus(int ), (int)123)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v7 /* !! */  == lp.iruw("islr", irvc(int ), (int)107)) break;
                v7 /* !! */  = (long)lp.iruw("islt", irvc(int ), (int)108);
            }
            lp.init();
            if (var2_4) ** GOTO lbl37
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl37
                v8 = lp.iruw("islu", irvc(int ), (int)109);
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = lp.qg - lp.iruw("islw", irus(int ), (int)124)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == lp.iruw("islx", irvc(int ), (int)110)) break;
                    v9 /* !! */  = (long)lp.iruw("islz", irvc(int ), (int)111);
                }
                lp.vertexCount = (int)v8;
                if (var2_4 || var2_4) ** GOTO lbl37
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_3 = lp.qg - lp.iruw("isma", irus(int ), (int)125)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == lp.iruw("ismc", irvc(int ), (int)112)) break;
                    v10 /* !! */  = (long)lp.iruw("ismd", irvc(int ), (int)113);
                }
                v11 /* !! */  = lp.qg;
                if (true) ** GOTO lbl84
                block56: while (true) {
                    v11 /* !! */  = (long)(v12 - lp.iruw("isme", irus(int ), (int)126));
lbl84:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1396722474: {
                            v12 = lp.iruw("ismf", irus(int ), (int)127);
                            continue block56;
                        }
                        case -988769202: {
                            v12 = lp.iruw("ismg", irus(int ), (int)128);
                            continue block56;
                        }
                        case -324759740: {
                            v12 = lp.iruw("ismh", irus(int ), (int)129);
                            continue block56;
                        }
                        case 958278509: {
                            break block56;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_4 = lp.qg - lp.iruw("ismi", irus(int ), (int)130)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == lp.iruw("ismj", irvc(int ), (int)114)) break;
                    v13 /* !! */  = (long)lp.iruw("ismk", irvc(int ), (int)115);
                }
                v14 = lp.combinedMatrix.set((Matrix4fc)lp.projectionMatrix);
                v15 /* !! */  = lp.qg;
                if (true) ** GOTO lbl106
                block58: while (true) {
                    v15 /* !! */  = (long)(v16 - lp.iruw("isml", irus(int ), (int)131));
lbl106:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case 217020988: {
                            v16 = lp.iruw("ismm", irus(int ), (int)132);
                            continue block58;
                        }
                        case 898270393: {
                            v16 = lp.iruw("ismn", irus(int ), (int)133);
                            continue block58;
                        }
                        case 958278509: {
                            break block58;
                        }
                        case 1623510087: {
                            v16 = lp.iruw("ismo", irus(int ), (int)134);
                            continue block58;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_5 = lp.qg - lp.iruw("ismu", irus(int ), (int)135)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == lp.iruw("ismx", irvc(int ), (int)116)) break;
                    v17 /* !! */  = (long)lp.iruw("isna", irvc(int ), (int)117);
                }
                v14.mul((Matrix4fc)lp.viewMatrix);
                if (var2_4 || var2_4) ** GOTO lbl37
                v18 /* !! */  = lp.qg;
                if (true) ** GOTO lbl129
                block60: while (true) {
                    v18 /* !! */  = (long)(lp.iruw("isnh", irus(int ), (int)137) - lp.iruw("isnf", irus(int ), (int)136));
lbl129:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1419530187: {
                            continue block60;
                        }
                        case 958278509: {
                            break block60;
                        }
                    }
                    break;
                }
                lp.ignoreDepth = var1_1;
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl138:
            // 3 sources

            case 0: {
                var3_3 /* !! */  = (int)lp.iruw("isnk", irvc(int ), (int)118);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl162
            }
lbl143:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)lp.iruw("isnm", irvc(int ), (int)119);
                if (!var4_2) ** GOTO lbl138
                throw null;
            }
lbl147:
            // 2 sources

            case 2: {
                do {
                    var3_3 /* !! */  = (int)lp.iruw("isno", irvc(int ), (int)120);
                } while (!var4_2);
                throw null;
            }
            case 3: {
                do {
                    var3_3 /* !! */  = (int)lp.iruw("isnr", irvc(int ), (int)121);
                } while (!var4_2);
                throw null;
            }
lbl157:
            // 3 sources

            case 4: {
                var3_3 /* !! */  = (int)lp.iruw("isns", irvc(int ), (int)122);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl189
            }
lbl162:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)lp.iruw("isnu", irvc(int ), (int)123);
                if (!var4_2) ** GOTO lbl138
                throw null;
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)lp.iruw("isnx", irvc(int ), (int)124);
                    if (!var4_2) ** GOTO lbl157
                    throw null;
                }
            }
            case 7: {
                var3_3 /* !! */  = (int)lp.iruw("isny", irvc(int ), (int)125);
                if (var4_2) {
                    throw null;
                }
            }
lbl175:
            // 4 sources

            case 8: {
                do {
                    var3_3 /* !! */  = (int)lp.iruw("isob", irvc(int ), (int)126);
                } while (!var4_2);
                throw null;
            }
            case 9: {
                var3_3 /* !! */  = (int)lp.iruw("isoe", irvc(int ), (int)127);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 10: {
                var3_3 /* !! */  = (int)lp.iruw("isog", irvc(int ), (int)128);
                if (!var4_2) ** GOTO lbl143
                throw null;
            }
lbl189:
            // 2 sources

            case 11: {
                var3_3 /* !! */  = (int)lp.iruw("isoj", irvc(int ), (int)129);
                if (!var4_2) ** GOTO lbl147
                throw null;
            }
            case 12: {
                var3_3 /* !! */  = (int)lp.iruw("ison", irvc(int ), (int)130);
                if (!var4_2) ** GOTO lbl157
                throw null;
            }
lbl197:
            // 2 sources

            case 13: {
                var3_3 /* !! */  = (int)lp.iruw("isoq", irvc(int ), (int)131);
                if (!var4_2) ** GOTO lbl175
                throw null;
            }
            case 14: 
        }
        var3_3 /* !! */  = (int)lp.iruw("isou", irvc(int ), (int)132);
        ** while (!var4_2)
lbl204:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ittd() {
        lp.irve[100] = -644208866;
        lp.irve[101] = 1184446230;
        lp.irve[102] = 1739559609;
        lp.irve[103] = -1502079176;
        lp.irve[104] = 229376021;
        lp.irve[105] = -183444997;
        lp.irve[106] = -1404029388;
        lp.irve[107] = 293338345;
        lp.irve[108] = -1615554767;
        lp.irve[109] = 2102765835;
        lp.irve[110] = -869432249;
        lp.irve[111] = -90763687;
        lp.irve[112] = -985055073;
        lp.irve[113] = 351701168;
        lp.irve[114] = -1130435611;
        lp.irve[115] = -362897294;
        lp.irve[116] = -6971007;
        lp.irve[117] = 629117173;
        lp.irve[118] = 388165599;
        lp.irve[119] = 71619136;
        lp.irve[120] = -1799727736;
        lp.irve[121] = 1263437965;
        lp.irve[122] = 497068020;
        lp.irve[123] = -1610970322;
        lp.irve[124] = 1208535394;
        lp.irve[125] = -227273577;
        lp.irve[126] = 1718723761;
        lp.irve[127] = 1891541132;
        lp.irve[128] = -1045469347;
        lp.irve[129] = 2021066695;
        lp.irve[130] = 38035881;
        lp.irve[131] = -2055707654;
        lp.irve[132] = -859690345;
        lp.irve[133] = -362792239;
        lp.irve[134] = 485293345;
        lp.irve[135] = 1573730660;
        lp.irve[136] = 506326004;
        lp.irve[137] = -366301559;
        lp.irve[138] = 862594596;
        lp.irve[139] = 1340054383;
        lp.irve[140] = 2050282471;
        lp.irve[141] = 535486465;
        lp.irve[142] = -1393677939;
        lp.irve[143] = 355978787;
        lp.irve[144] = -377948229;
        lp.irve[145] = 1210304200;
        lp.irve[146] = -585660565;
        lp.irve[147] = 623663190;
        lp.irve[148] = 219654485;
        lp.irve[149] = -1526842794;
        lp.irve[150] = 996790719;
        lp.irve[151] = 1723610253;
        lp.irve[152] = 445363175;
        lp.irve[153] = -813183390;
        lp.irve[154] = 2083875651;
        lp.irve[155] = -121464960;
        lp.irve[156] = 810659928;
        lp.irve[157] = 550813857;
        lp.irve[158] = -1703375322;
        lp.irve[159] = -1395417987;
        lp.irve[160] = -1482140546;
        lp.irve[161] = -1797570693;
        lp.irve[162] = -262075525;
        lp.irve[163] = 193428773;
        lp.irve[164] = -969556100;
        lp.irve[165] = 1079402705;
        lp.irve[166] = -2113373590;
        lp.irve[167] = -1812043085;
        lp.irve[168] = -2132017091;
        lp.irve[169] = -406052175;
        lp.irve[170] = -1652316122;
        lp.irve[171] = -876890964;
        lp.irve[172] = 572178633;
        lp.irve[173] = 1584453152;
        lp.irve[174] = -128768670;
        lp.irve[175] = -443008188;
        lp.irve[176] = 1570755289;
        lp.irve[177] = -1383075303;
        lp.irve[178] = -1538607356;
        lp.irve[179] = -176217087;
        lp.irve[180] = -1581551188;
        lp.irve[181] = -1182756139;
        lp.irve[182] = 1085447704;
        lp.irve[183] = -1355893602;
        lp.irve[184] = 369511707;
        lp.irve[185] = 1825319245;
        lp.irve[186] = 1629547270;
        lp.irve[187] = 1030846513;
        lp.irve[188] = 190099947;
        lp.irve[189] = 2006064893;
        lp.irve[190] = -2135404537;
        lp.irve[191] = -538832241;
        lp.irve[192] = -1338809502;
        lp.irve[193] = 1083929065;
        lp.irve[194] = -1856166187;
        lp.irve[195] = -510761489;
        lp.irve[196] = -1822426596;
        lp.irve[197] = -616723228;
        lp.irve[198] = -766992991;
        lp.irve[199] = 955576013;
    }

    private static /* synthetic */ int irvc(int n2) {
        return irvd[n2] ^ irve[n2];
    }

    /*
     * Exception decompiling
     */
    public static void init() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 59[SWITCH]
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
    public static void end() {
        block152: {
            block155: {
                block154: {
                    block153: {
                        var9 = lp.c;
                        var8_1 /* !! */  = lp.b;
                        var7_2 = lp.a;
                        if (var9) {
                            throw null;
lbl6:
                            // 43 sources

                            return;
                        }
                        if (var7_2 || var7_2) ** GOTO lbl6
                        if (lp.pipeline == null) break block153;
                        if (var7_2) ** GOTO lbl6
                        if (lp.uniformBuffer == null) break block153;
                        if (var7_2) ** GOTO lbl6
                        if (lp.vertexBuffer != null) break block154;
                        if (var7_2) ** GOTO lbl6
                    }
                    if (var7_2 || var7_2) ** GOTO lbl6
                    return;
                }
                if (var7_2 || var7_2) ** GOTO lbl6
                if (lp.vertexCount != 0) break block155;
                if (var7_2 || var7_2) ** GOTO lbl6
                return;
            }
            if (var7_2 || var7_2) ** GOTO lbl6
            var0_3 = om.acquire((int)lp.iruw("itcu", irvc(int ), (int)363), (int)lp.iruw("itcv", irvc(int ), (int)364));
            if (var7_2 || var7_2) ** GOTO lbl6
            lp.putMatrix(var0_3, lp.combinedMatrix);
            if (var7_2 || var7_2) ** GOTO lbl6
            lp.putMatrix(var0_3, lp.identityMatrix.identity());
            if (var7_2 || var7_2) ** GOTO lbl6
            var0_3.flip();
            if (var7_2 || var7_2) ** GOTO lbl6
            var1_4 = om.acquire((int)lp.iruw("itcw", irvc(int ), (int)365), lp.vertexCount * lp.iruw("itcx", irvc(int ), (int)366));
            if (var7_2 || var7_2) ** GOTO lbl6
            var2_5 = lp.iruw("itcy", irvc(int ), (int)367);
            if (var7_2) ** GOTO lbl6
            do {
                if (var7_2 || var7_2) ** GOTO lbl6
                if (var2_5 >= lp.vertexCount) break block152;
                if (var7_2 || var7_2) ** GOTO lbl6
                var3_7 = var2_5 * lp.iruw("itcz", irvc(int ), (int)368);
                if (var7_2 || var7_2) ** GOTO lbl6
                var1_4.putFloat(lp.vertices[var3_7]).putFloat(lp.vertices[var3_7 + true]).putFloat(lp.vertices[var3_7 + 2]);
                if (var7_2 || var7_2) ** GOTO lbl6
                var1_4.put((byte)(lp.vertices[var3_7 + 3] * lp.iruw("itda", isrq(int ), (int)369))).put((byte)(lp.vertices[var3_7 + 4] * lp.iruw("itdb", isrq(int ), (int)370))).put((byte)(lp.vertices[var3_7 + 5] * lp.iruw("itdc", isrq(int ), (int)371))).put((byte)(lp.vertices[var3_7 + 6] * lp.iruw("itdd", isrq(int ), (int)372)));
                if (var7_2 || var7_2) ** GOTO lbl6
                ++var2_5;
                if (var7_2) ** GOTO lbl6
            } while (!var9);
            throw null;
        }
        if (var7_2 || var7_2) ** GOTO lbl6
        var1_4.flip();
        if (var7_2 || var7_2) ** GOTO lbl6
        var2_6 = RenderSystem.getDevice().createCommandEncoder();
        if (var7_2 || var7_2) ** GOTO lbl6
        var2_6.writeToBuffer(lp.uniformBuffer.slice(), var0_3);
        if (var8_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var7_2 || var7_2) ** GOTO lbl6
                var2_6.writeToBuffer(lp.vertexBuffer.slice(), var1_4);
                if (var7_2 || var7_2) ** GOTO lbl6
                var3_8 = lp.mc.method_1522();
                if (var7_2 || var7_2) ** GOTO lbl6
                v0 = (Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$end$2(), ()Ljava/lang/String;)();
                v1 = var3_8.method_71639();
                v2 = OptionalInt.empty();
                v3 = var3_8.method_71640();
                if (lp.ignoreDepth) {
                    v4 = OptionalDouble.of(1.0);
                    if (var9) {
                        throw null;
                    }
                } else {
                    v4 = OptionalDouble.empty();
                }
                var4_9 = var2_6.createRenderPass(v0, v1, v2, v3, v4);
                if (var7_2) ** GOTO lbl6
                try {
                    if (var7_2) ** GOTO lbl6
                    var4_9.setPipeline(lp.pipeline);
                    if (var7_2 || var7_2) ** GOTO lbl6
                    var4_9.setUniform("Uniforms", lp.uniformBuffer);
                    if (var7_2 || var7_2) ** GOTO lbl6
                    var4_9.setVertexBuffer((int)lp.iruw("itde", irvc(int ), (int)373), lp.vertexBuffer);
                    if (var7_2 || var7_2) ** GOTO lbl6
                    var4_9.draw((int)lp.iruw("itdf", irvc(int ), (int)374), lp.vertexCount);
                    if (var7_2 || var7_2) ** GOTO lbl6
                    if (var4_9 == null) ** GOTO lbl116
                    if (var7_2) ** GOTO lbl6
                }
                catch (Throwable var5_10) {
                    if (var7_2) ** GOTO lbl6
                    if (var4_9 == null) ** GOTO lbl109
                    if (var7_2) ** GOTO lbl6
                    try {
                        if (var7_2) ** GOTO lbl6
                        var4_9.close();
                        if (var7_2 || var7_2) ** GOTO lbl6
                        ** if (!var9) goto lbl-1000
                    }
                    catch (Throwable var6_11) {
                        if (var7_2) ** GOTO lbl6
                        var5_10.addSuppressed(var6_11);
                        if (var7_2) ** GOTO lbl6
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
lbl109:
                    // 3 sources

                    if (var7_2 || var7_2) ** GOTO lbl6
                    throw var5_10;
                }
                var4_9.close();
                if (var7_2) ** GOTO lbl6
                if (var9) {
                    throw null;
                }
lbl116:
                // 3 sources

                if (var7_2 || var7_2) ** GOTO lbl6
                lp.vertexCount = (int)lp.iruw("itdg", irvc(int ), (int)375);
                if (!var7_2 && !var7_2) ** break;
                ** continue;
                return;
            }
            case 0: {
                var8_1 /* !! */  = (int)lp.iruw("itdh", irvc(int ), (int)376);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl416
            }
            case 1: {
                var8_1 /* !! */  = (int)lp.iruw("itdi", irvc(int ), (int)377);
                if (!var9) break;
                throw null;
            }
            case 2: {
                var8_1 /* !! */  = (int)lp.iruw("itdj", irvc(int ), (int)378);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl315
            }
lbl135:
            // 2 sources

            case 3: {
                var8_1 /* !! */  = (int)lp.iruw("itdk", irvc(int ), (int)379);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl140:
            // 4 sources

            case 4: {
                var8_1 /* !! */  = (int)lp.iruw("itdl", irvc(int ), (int)380);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl179
            }
            case 5: {
                var8_1 /* !! */  = (int)lp.iruw("itdm", irvc(int ), (int)381);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl227
            }
lbl150:
            // 4 sources

            case 6: {
                var8_1 /* !! */  = (int)lp.iruw("itdn", irvc(int ), (int)382);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl174
            }
            case 7: {
                var8_1 /* !! */  = (int)lp.iruw("itdo", irvc(int ), (int)383);
                if (!var9) ** GOTO lbl150
                throw null;
            }
lbl159:
            // 2 sources

            case 8: {
                var8_1 /* !! */  = (int)lp.iruw("itdp", irvc(int ), (int)384);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl164:
            // 2 sources

            case 9: {
                var8_1 /* !! */  = (int)lp.iruw("itdq", irvc(int ), (int)385);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl329
            }
            case 10: {
                var8_1 /* !! */  = (int)lp.iruw("itdr", irvc(int ), (int)386);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl436
            }
lbl174:
            // 4 sources

            case 11: {
                var8_1 /* !! */  = (int)lp.iruw("itds", irvc(int ), (int)387);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl319
            }
lbl179:
            // 3 sources

            case 12: {
                var8_1 /* !! */  = (int)lp.iruw("itdt", irvc(int ), (int)388);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl334
            }
lbl184:
            // 2 sources

            case 13: {
                var8_1 /* !! */  = (int)lp.iruw("itdu", irvc(int ), (int)389);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl436
            }
lbl189:
            // 3 sources

            case 14: {
                var8_1 /* !! */  = (int)lp.iruw("itdv", irvc(int ), (int)390);
                if (!var9) ** GOTO lbl140
                throw null;
            }
lbl193:
            // 2 sources

            case 15: {
                var8_1 /* !! */  = (int)lp.iruw("itdw", irvc(int ), (int)391);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl440
            }
            case 16: {
                var8_1 /* !! */  = (int)lp.iruw("itdx", irvc(int ), (int)392);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl277
            }
lbl203:
            // 2 sources

            case 17: {
                var8_1 /* !! */  = (int)lp.iruw("itdy", irvc(int ), (int)393);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl324
            }
lbl208:
            // 3 sources

            case 18: {
                var8_1 /* !! */  = (int)lp.iruw("itea", irvc(int ), (int)394);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl398
            }
            case 19: {
                var8_1 /* !! */  = (int)lp.iruw("ited", irvc(int ), (int)395);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl351
            }
lbl218:
            // 3 sources

            case 20: {
                var8_1 /* !! */  = (int)lp.iruw("iteg", irvc(int ), (int)396);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl420
            }
            case 21: {
                var8_1 /* !! */  = (int)lp.iruw("itej", irvc(int ), (int)397);
                if (!var9) ** GOTO lbl189
                throw null;
            }
lbl227:
            // 2 sources

            case 22: {
                var8_1 /* !! */  = (int)lp.iruw("itek", irvc(int ), (int)398);
                if (!var9) break;
                throw null;
            }
            case 23: {
                var8_1 /* !! */  = (int)lp.iruw("itel", irvc(int ), (int)399);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl258
            }
lbl236:
            // 2 sources

            case 24: {
                var8_1 /* !! */  = (int)lp.iruw("item", irvc(int ), (int)400);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl359
            }
            case 25: {
                var8_1 /* !! */  = (int)lp.iruw("iter", irvc(int ), (int)401);
                if (!var9) ** GOTO lbl159
                throw null;
            }
lbl245:
            // 3 sources

            case 26: {
                var8_1 /* !! */  = (int)lp.iruw("iteu", irvc(int ), (int)402);
                if (var9) {
                    throw null;
                }
            }
lbl249:
            // 4 sources

            case 27: {
                var8_1 /* !! */  = (int)lp.iruw("itex", irvc(int ), (int)403);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl306
            }
lbl254:
            // 4 sources

            case 28: {
                var8_1 /* !! */  = (int)lp.iruw("itfa", irvc(int ), (int)404);
                if (!var9) ** GOTO lbl140
                throw null;
            }
lbl258:
            // 2 sources

            case 29: {
                var8_1 /* !! */  = (int)lp.iruw("itfd", irvc(int ), (int)405);
                if (!var9) ** GOTO lbl150
                throw null;
            }
lbl262:
            // 2 sources

            case 30: {
                var8_1 /* !! */  = (int)lp.iruw("itff", irvc(int ), (int)406);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl281
            }
            case 31: {
                var8_1 /* !! */  = (int)lp.iruw("itfi", irvc(int ), (int)407);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl436
            }
            case 32: {
                var8_1 /* !! */  = (int)lp.iruw("itfj", irvc(int ), (int)408);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl306
            }
lbl277:
            // 2 sources

            case 33: {
                var8_1 /* !! */  = (int)lp.iruw("itfn", irvc(int ), (int)409);
                if (!var9) ** GOTO lbl193
                throw null;
            }
lbl281:
            // 2 sources

            case 34: {
                var8_1 /* !! */  = (int)lp.iruw("itfp", irvc(int ), (int)410);
                if (!var9) ** GOTO lbl245
                throw null;
            }
            case 35: {
                var8_1 /* !! */  = (int)lp.iruw("itfs", irvc(int ), (int)411);
                if (!var9) ** GOTO lbl150
                throw null;
            }
lbl289:
            // 2 sources

            case 36: {
                var8_1 /* !! */  = (int)lp.iruw("itft", irvc(int ), (int)412);
                if (!var9) ** GOTO lbl249
                throw null;
            }
            case 37: {
                var8_1 /* !! */  = (int)lp.iruw("itfv", irvc(int ), (int)413);
                if (!var9) ** GOTO lbl208
                throw null;
            }
            case 38: {
                var8_1 /* !! */  = (int)lp.iruw("itfy", irvc(int ), (int)414);
                if (!var9) ** GOTO lbl218
                throw null;
            }
            case 39: {
                var8_1 /* !! */  = (int)lp.iruw("itgb", irvc(int ), (int)415);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl452
            }
lbl306:
            // 3 sources

            case 40: {
                var8_1 /* !! */  = (int)lp.iruw("itgd", irvc(int ), (int)416);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl398
            }
            case 41: {
                var8_1 /* !! */  = (int)lp.iruw("itgg", irvc(int ), (int)417);
                if (!var9) ** GOTO lbl218
                throw null;
            }
lbl315:
            // 4 sources

            case 42: {
                var8_1 /* !! */  = (int)lp.iruw("itgh", irvc(int ), (int)418);
                if (!var9) ** GOTO lbl189
                throw null;
            }
lbl319:
            // 2 sources

            case 43: {
                do {
                    var8_1 /* !! */  = (int)lp.iruw("itgj", irvc(int ), (int)419);
                } while (!var9);
                throw null;
            }
lbl324:
            // 2 sources

            case 44: {
                var8_1 /* !! */  = (int)lp.iruw("itgl", irvc(int ), (int)420);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl402
            }
lbl329:
            // 3 sources

            case 45: {
                var8_1 /* !! */  = (int)lp.iruw("itgo", irvc(int ), (int)421);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl351
            }
lbl334:
            // 2 sources

            case 46: {
                var8_1 /* !! */  = (int)lp.iruw("itgq", irvc(int ), (int)422);
                if (!var9) ** GOTO lbl329
                throw null;
            }
            case 47: {
                var8_1 /* !! */  = (int)lp.iruw("itgs", irvc(int ), (int)423);
                if (!var9) ** GOTO lbl179
                throw null;
            }
lbl342:
            // 2 sources

            case 48: {
                var8_1 /* !! */  = (int)lp.iruw("itgu", irvc(int ), (int)424);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl428
            }
lbl347:
            // 2 sources

            case 49: {
                var8_1 /* !! */  = (int)lp.iruw("itgw", irvc(int ), (int)425);
                if (!var9) ** GOTO lbl262
                throw null;
            }
lbl351:
            // 3 sources

            case 50: {
                var8_1 /* !! */  = (int)lp.iruw("itgy", irvc(int ), (int)426);
                if (!var9) ** GOTO lbl315
                throw null;
            }
            case 51: {
                var8_1 /* !! */  = (int)lp.iruw("itha", irvc(int ), (int)427);
                if (!var9) ** GOTO lbl203
                throw null;
            }
lbl359:
            // 2 sources

            case 52: {
                var8_1 /* !! */  = (int)lp.iruw("ithb", irvc(int ), (int)428);
                if (!var9) ** GOTO lbl135
                throw null;
            }
lbl363:
            // 3 sources

            case 53: {
                var8_1 /* !! */  = (int)lp.iruw("ithc", irvc(int ), (int)429);
                if (!var9) ** GOTO lbl342
                throw null;
            }
            case 54: {
                var8_1 /* !! */  = (int)lp.iruw("ithd", irvc(int ), (int)430);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl406
            }
lbl372:
            // 2 sources

            case 55: {
                var8_1 /* !! */  = (int)lp.iruw("ithe", irvc(int ), (int)431);
                if (!var9) ** GOTO lbl245
                throw null;
            }
            case 56: {
                var8_1 /* !! */  = (int)lp.iruw("ithf", irvc(int ), (int)432);
                if (!var9) ** GOTO lbl254
                throw null;
            }
            case 57: {
                var8_1 /* !! */  = (int)lp.iruw("ithi", irvc(int ), (int)433);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl436
            }
            case 58: {
                var8_1 /* !! */  = (int)lp.iruw("ithk", irvc(int ), (int)434);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl406
            }
            case 59: {
                var8_1 /* !! */  = (int)lp.iruw("ithm", irvc(int ), (int)435);
                if (!var9) ** GOTO lbl363
                throw null;
            }
            case 60: {
                var8_1 /* !! */  = (int)lp.iruw("ithp", irvc(int ), (int)436);
                if (!var9) ** GOTO lbl140
                throw null;
            }
lbl398:
            // 3 sources

            case 61: {
                var8_1 /* !! */  = (int)lp.iruw("ithr", irvc(int ), (int)437);
                if (!var9) ** GOTO lbl208
                throw null;
            }
lbl402:
            // 2 sources

            case 62: {
                var8_1 /* !! */  = (int)lp.iruw("ithu", irvc(int ), (int)438);
                if (!var9) ** GOTO lbl164
                throw null;
            }
lbl406:
            // 3 sources

            case 63: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_1 /* !! */  = (int)lp.iruw("ithx", irvc(int ), (int)439);
                    if (!var9) ** GOTO lbl236
                    throw null;
                }
            }
lbl411:
            // 2 sources

            case 64: {
                var8_1 /* !! */  = (int)lp.iruw("itia", irvc(int ), (int)440);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl436
            }
lbl416:
            // 2 sources

            case 65: {
                var8_1 /* !! */  = (int)lp.iruw("itid", irvc(int ), (int)441);
                if (!var9) ** GOTO lbl372
                throw null;
            }
lbl420:
            // 2 sources

            case 66: {
                var8_1 /* !! */  = (int)lp.iruw("itif", irvc(int ), (int)442);
                if (!var9) ** GOTO lbl411
                throw null;
            }
            case 67: {
                var8_1 /* !! */  = (int)lp.iruw("itii", irvc(int ), (int)443);
                if (!var9) ** GOTO lbl254
                throw null;
            }
lbl428:
            // 3 sources

            case 68: {
                var8_1 /* !! */  = (int)lp.iruw("itil", irvc(int ), (int)444);
                if (!var9) ** GOTO lbl347
                throw null;
            }
            case 69: {
                var8_1 /* !! */  = (int)lp.iruw("itin", irvc(int ), (int)445);
                if (!var9) ** GOTO lbl428
                throw null;
            }
lbl436:
            // 6 sources

            case 70: {
                var8_1 /* !! */  = (int)lp.iruw("itir", irvc(int ), (int)446);
                if (!var9) ** GOTO lbl254
                throw null;
            }
lbl440:
            // 2 sources

            case 71: {
                var8_1 /* !! */  = (int)lp.iruw("itit", irvc(int ), (int)447);
                if (!var9) ** GOTO lbl315
                throw null;
            }
            case 72: {
                var8_1 /* !! */  = (int)lp.iruw("itiw", irvc(int ), (int)448);
                if (!var9) ** GOTO lbl184
                throw null;
            }
            case 73: {
                var8_1 /* !! */  = (int)lp.iruw("itiz", irvc(int ), (int)449);
                if (!var9) ** GOTO lbl289
                throw null;
            }
lbl452:
            // 2 sources

            case 74: {
                var8_1 /* !! */  = (int)lp.iruw("itjc", irvc(int ), (int)450);
                if (!var9) ** GOTO lbl363
                throw null;
            }
            case 75: 
        }
        var8_1 /* !! */  = (int)lp.iruw("itjf", irvc(int ), (int)451);
        ** while (!var9)
lbl459:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void shutdown() {
        block80: {
            v0 /* !! */  = lp.qg;
            if (true) ** GOTO lbl5
            block49: while (true) {
                v0 /* !! */  = (long)(v1 - lp.iruw("itpl", irus(int ), (int)261));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case 169899982: {
                        v1 = lp.iruw("itpm", irus(int ), (int)262);
                        continue block49;
                    }
                    case 958278509: {
                        break block49;
                    }
                    case 970693952: {
                        v1 = lp.iruw("itpn", irus(int ), (int)263);
                        continue block49;
                    }
                    case 1106155321: {
                        v1 = lp.iruw("itpo", irus(int ), (int)264);
                        continue block49;
                    }
                }
                break;
            }
            var2 = lp.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = lp.qg - lp.iruw("itpp", irus(int ), (int)265)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  == lp.iruw("itpq", irvc(int ), (int)488)) break;
                v2 /* !! */  = (long)lp.iruw("itpr", irvc(int ), (int)489);
            }
            var1_1 /* !! */  = lp.b;
            v3 /* !! */  = lp.qg;
            if (true) ** GOTO lbl29
            block51: while (true) {
                v3 /* !! */  = (long)(v4 - lp.iruw("itps", irus(int ), (int)266));
lbl29:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -2145314329: {
                        v4 = lp.iruw("itpt", irus(int ), (int)267);
                        continue block51;
                    }
                    case -571782288: {
                        v4 = lp.iruw("itpu", irus(int ), (int)268);
                        continue block51;
                    }
                    case 958278509: {
                        break block51;
                    }
                }
                break;
            }
            var0_2 = lp.a;
            if (var2) {
                throw null;
lbl41:
                // 9 sources

                return;
            }
            if (var0_2 || var0_2) ** GOTO lbl41
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_1 = lp.qg - lp.iruw("itpv", irus(int ), (int)269)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v5 /* !! */  == lp.iruw("itpw", irvc(int ), (int)490)) break;
                v5 /* !! */  = (long)lp.iruw("itpx", irvc(int ), (int)491);
            }
            if (lp.uniformBuffer == null) break block80;
            if (var0_2 || var0_2) ** GOTO lbl41
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_2 = lp.qg - lp.iruw("itpy", irus(int ), (int)270)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v6 /* !! */  == lp.iruw("itpz", irvc(int ), (int)492)) break;
                v6 /* !! */  = (long)lp.iruw("itqa", irvc(int ), (int)493);
            }
            v7 /* !! */  = lp.qg;
            if (true) ** GOTO lbl62
            block55: while (true) {
                v7 /* !! */  = (long)(v8 - lp.iruw("itqb", irus(int ), (int)271));
lbl62:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -1278872401: {
                        v8 = lp.iruw("itqc", irus(int ), (int)272);
                        continue block55;
                    }
                    case 958278509: {
                        break block55;
                    }
                    case 1215414996: {
                        v8 = lp.iruw("itqd", irus(int ), (int)273);
                        continue block55;
                    }
                }
                break;
            }
            lp.uniformBuffer.close();
            if (var0_2 || var0_2) ** GOTO lbl41
            v9 /* !! */  = lp.qg;
            if (true) ** GOTO lbl77
            block56: while (true) {
                v9 /* !! */  = (long)(v10 - lp.iruw("itqe", irus(int ), (int)274));
lbl77:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -1211619550: {
                        v10 = lp.iruw("itqf", irus(int ), (int)275);
                        continue block56;
                    }
                    case -806927751: {
                        v10 = lp.iruw("itqg", irus(int ), (int)276);
                        continue block56;
                    }
                    case 958278509: {
                        break block56;
                    }
                }
                break;
            }
            lp.uniformBuffer = null;
            if (var0_2) ** GOTO lbl41
        }
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2 || var0_2) ** GOTO lbl41
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = lp.qg - lp.iruw("itqh", irus(int ), (int)277)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v11 /* !! */  == lp.iruw("itqi", irvc(int ), (int)494)) break;
                    v11 /* !! */  = (long)lp.iruw("itqj", irvc(int ), (int)495);
                }
                if (lp.vertexBuffer == null) ** GOTO lbl129
                if (var0_2 || var0_2) ** GOTO lbl41
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_4 = lp.qg - lp.iruw("itqk", irus(int ), (int)278)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v12 /* !! */  == lp.iruw("itql", irvc(int ), (int)496)) break;
                    v12 /* !! */  = (long)lp.iruw("itqm", irvc(int ), (int)497);
                }
                v13 /* !! */  = lp.qg;
                if (true) ** GOTO lbl111
                block59: while (true) {
                    v13 /* !! */  = (long)(lp.iruw("itqo", irus(int ), (int)280) - lp.iruw("itqn", irus(int ), (int)279));
lbl111:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -2055461252: {
                            continue block59;
                        }
                        case 958278509: {
                            break block59;
                        }
                    }
                    break;
                }
                lp.vertexBuffer.close();
                if (var0_2 || var0_2) ** GOTO lbl41
                v14 /* !! */  = lp.qg;
                if (true) ** GOTO lbl122
                block60: while (true) {
                    v14 /* !! */  = (long)(lp.iruw("itqq", irus(int ), (int)282) - lp.iruw("itqp", irus(int ), (int)281));
lbl122:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1991679790: {
                            continue block60;
                        }
                        case 958278509: {
                            break block60;
                        }
                    }
                    break;
                }
                lp.vertexBuffer = null;
                if (var0_2) ** GOTO lbl41
lbl129:
                // 2 sources

                if (!var0_2 && !var0_2) ** break;
                ** continue;
                return;
            }
            case 0: {
                var1_1 /* !! */  = (int)lp.iruw("itqr", irvc(int ), (int)498);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl190
            }
            case 1: {
                var1_1 /* !! */  = (int)lp.iruw("itqs", irvc(int ), (int)499);
                if (var2) {
                    throw null;
                }
            }
lbl141:
            // 5 sources

            case 2: {
                var1_1 /* !! */  = (int)lp.iruw("itqt", irvc(int ), (int)500);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl146:
            // 4 sources

            case 3: {
                var1_1 /* !! */  = (int)lp.iruw("itqu", irvc(int ), (int)501);
                if (!var2) break;
                throw null;
            }
lbl150:
            // 2 sources

            case 4: {
                var1_1 /* !! */  = (int)lp.iruw("itqv", irvc(int ), (int)502);
                if (!var2) ** GOTO lbl146
                throw null;
            }
            case 5: {
                var1_1 /* !! */  = (int)lp.iruw("itqw", irvc(int ), (int)503);
                if (!var2) ** GOTO lbl150
                throw null;
            }
            case 6: {
                var1_1 /* !! */  = (int)lp.iruw("itqx", irvc(int ), (int)504);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl168
            }
            case 7: {
                var1_1 /* !! */  = (int)lp.iruw("itqy", irvc(int ), (int)505);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl172
            }
lbl168:
            // 3 sources

            case 8: {
                var1_1 /* !! */  = (int)lp.iruw("itqz", irvc(int ), (int)506);
                if (!var2) ** GOTO lbl141
                throw null;
            }
lbl172:
            // 2 sources

            case 9: {
                var1_1 /* !! */  = (int)lp.iruw("itra", irvc(int ), (int)507);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl202
            }
            case 10: {
                var1_1 /* !! */  = (int)lp.iruw("itrb", irvc(int ), (int)508);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl182:
            // 3 sources

            case 11: {
                var1_1 /* !! */  = (int)lp.iruw("itrc", irvc(int ), (int)509);
                if (!var2) ** GOTO lbl146
                throw null;
            }
lbl186:
            // 2 sources

            case 12: {
                var1_1 /* !! */  = (int)lp.iruw("itrd", irvc(int ), (int)510);
                if (!var2) ** GOTO lbl182
                throw null;
            }
lbl190:
            // 3 sources

            case 13: {
                var1_1 /* !! */  = (int)lp.iruw("itre", irvc(int ), (int)511);
                if (!var2) ** GOTO lbl182
                throw null;
            }
            case 14: {
                var1_1 /* !! */  = (int)lp.iruw("itrf", irvc(int ), (int)512);
                if (!var2) ** GOTO lbl186
                throw null;
            }
            case 15: {
                var1_1 /* !! */  = (int)lp.iruw("itrg", irvc(int ), (int)513);
                if (!var2) ** GOTO lbl141
                throw null;
            }
lbl202:
            // 2 sources

            case 16: {
                var1_1 /* !! */  = (int)lp.iruw("itrh", irvc(int ), (int)514);
                if (!var2) ** GOTO lbl146
                throw null;
            }
            case 17: 
        }
        do {
            var1_1 /* !! */  = (int)lp.iruw("itri", irvc(int ), (int)515);
        } while (!var2);
        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Handled impossible loop by duplicating code
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static void begin() {
        CallSite callSite;
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = qg - lp.iruw("isox", irus(int ), (int)138)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == lp.iruw("isoy", irvc(int ), (int)133)) break;
            object = lp.iruw("isoz", irvc(int ), (int)134);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = qg - lp.iruw("ispa", irus(int ), (int)139)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == lp.iruw("ispc", irvc(int ), (int)135)) break;
            object = lp.iruw("ispe", irvc(int ), (int)136);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = qg - lp.iruw("ispg", irus(int ), (int)140)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == lp.iruw("isph", irvc(int ), (int)137)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = lp.iruw("ispj", irvc(int ), (int)138);
        }
        if (bl2 || bl2) return;
        CallSite callSite2 = lp.iruw("ispl", irvc(int ), (int)139);
        Object object = qg;
        boolean bl4 = true;
        block17: while (true) {
            CallSite callSite3;
            if (!bl4 || (bl4 = false) || !true) {
                object = callSite3 - lp.iruw("ispn", irus(int ), (int)141);
            }
            switch ((int)object) {
                case -1431606938: {
                    callSite3 = lp.iruw("ispp", irus(int ), (int)142);
                    continue block17;
                }
                case 38161470: {
                    callSite3 = lp.iruw("ispq", irus(int ), (int)143);
                    continue block17;
                }
                case 958278509: {
                    break block17;
                }
                case 1448010928: {
                    callSite3 = lp.iruw("ispr", irus(int ), (int)144);
                    continue block17;
                }
            }
            break;
        }
        lp.begin(null, (boolean)callSite2);
        if (bl2 || bl2) {
            return;
        }
        boolean bl5 = true;
        block18: do {
            int n3;
            if (bl5 && !(bl5 = false)) {
                if (n2 == 0) return;
                n3 = Integer.MIN_VALUE;
            }
            switch (n3 == Integer.MIN_VALUE ? n2 : n3) {
                default: {
                    return;
                }
                case 0: {
                    do {
                        CallSite callSite4 = lp.iruw("ispu", irvc(int ), (int)140);
                    } while (!bl3);
                    throw null;
                }
                case 3: {
                    break;
                }
                case 4: {
                    do {
                        CallSite callSite5 = lp.iruw("isqb", irvc(int ), (int)144);
                    } while (!bl3);
                    throw null;
                }
                case 5: {
                    callSite = lp.iruw("isqd", irvc(int ), (int)145);
                    if (!bl3) break block18;
                    throw null;
                }
                case 1: {
                    CallSite callSite6 = lp.iruw("ispw", irvc(int ), (int)141);
                    if (bl3) {
                        throw null;
                    }
                }
                case 2: {
                    CallSite callSite6 = lp.iruw("ispy", irvc(int ), (int)142);
                    n3 = 1;
                    if (!bl3) continue block18;
                    throw null;
                }
            }
            break;
        } while (true);
        do {
            callSite = lp.iruw("ispz", irvc(int ), (int)143);
            if (bl3) {
                throw null;
            }
            callSite = lp.iruw("isqd", irvc(int ), (int)145);
        } while (!bl3);
        throw null;
    }

    private static /* synthetic */ void ittk() {
        lp.iruu[200] = -4806483690719185299L;
        lp.iruu[201] = -6685397046523999352L;
        lp.iruu[202] = -2502767057682304885L;
        lp.iruu[203] = 3250380908392458322L;
        lp.iruu[204] = 4001922101249198905L;
        lp.iruu[205] = 1551890145844965577L;
        lp.iruu[206] = -7411772207977481210L;
        lp.iruu[207] = 7761272580342800125L;
        lp.iruu[208] = -1233383202576793721L;
        lp.iruu[209] = -5574736901564169712L;
        lp.iruu[210] = -5746790636240030310L;
        lp.iruu[211] = -6549620538350360806L;
        lp.iruu[212] = 497201851537268466L;
        lp.iruu[213] = 8111604645648492783L;
        lp.iruu[214] = 8553642869353615736L;
        lp.iruu[215] = 933475526720330507L;
        lp.iruu[216] = -3771453928863369803L;
        lp.iruu[217] = 7077064451013932491L;
        lp.iruu[218] = 8737292807813066800L;
        lp.iruu[219] = 855540139816605567L;
        lp.iruu[220] = -3088006314265526691L;
        lp.iruu[221] = 5437897554804240640L;
        lp.iruu[222] = 1014371391150736349L;
        lp.iruu[223] = -2138046762177467692L;
        lp.iruu[224] = 2262051134101052245L;
        lp.iruu[225] = 6746343278564096239L;
        lp.iruu[226] = -8668328547639679861L;
        lp.iruu[227] = 4586892293333862218L;
        lp.iruu[228] = 1581129240709480553L;
        lp.iruu[229] = 343587384940217506L;
        lp.iruu[230] = -1502208792092770128L;
        lp.iruu[231] = -4334558736455500751L;
        lp.iruu[232] = 8232317910188382564L;
        lp.iruu[233] = 5947620230236710676L;
        lp.iruu[234] = -4202371980437640825L;
        lp.iruu[235] = 761850797101750028L;
        lp.iruu[236] = 2392985179460425944L;
        lp.iruu[237] = -7048450595671689337L;
        lp.iruu[238] = -3025160388822464970L;
        lp.iruu[239] = 2690590428743162610L;
        lp.iruu[240] = -7807188741812496381L;
        lp.iruu[241] = 9022248632038944963L;
        lp.iruu[242] = 1319753799613285126L;
        lp.iruu[243] = -4440858648902782731L;
        lp.iruu[244] = -5075390580563037037L;
        lp.iruu[245] = 6931825375952600239L;
        lp.iruu[246] = -4023225974757343053L;
        lp.iruu[247] = -666209409681578013L;
        lp.iruu[248] = 6583344206193512614L;
        lp.iruu[249] = 4376199432300159672L;
        lp.iruu[250] = -6525580524215915749L;
        lp.iruu[251] = -2193465246712720495L;
        lp.iruu[252] = 7915156510911661242L;
        lp.iruu[253] = -1913554636995473142L;
        lp.iruu[254] = -4925329154823817171L;
        lp.iruu[255] = -7112830393220194930L;
        lp.iruu[256] = -1366627944594868665L;
        lp.iruu[257] = -1468800301264722472L;
        lp.iruu[258] = -6345128169070930116L;
        lp.iruu[259] = 5258855890549079575L;
        lp.iruu[260] = 55708125069203483L;
        lp.iruu[261] = -8188501625488092304L;
        lp.iruu[262] = 7451171343417187635L;
        lp.iruu[263] = 4510762229887240252L;
        lp.iruu[264] = 8396196475211714866L;
        lp.iruu[265] = -1776880860532657575L;
        lp.iruu[266] = -7668712939605974182L;
        lp.iruu[267] = -8106507810502866227L;
        lp.iruu[268] = -4214599784736390891L;
        lp.iruu[269] = 7980545591411168666L;
        lp.iruu[270] = 1206985392455690998L;
        lp.iruu[271] = -2038331885138760876L;
        lp.iruu[272] = 6712467966693954260L;
        lp.iruu[273] = -3962631743841969616L;
        lp.iruu[274] = -1347487119219865992L;
        lp.iruu[275] = 1031388929653560139L;
        lp.iruu[276] = -7970041020500147621L;
        lp.iruu[277] = 7984168991334682574L;
        lp.iruu[278] = -922341555986125868L;
        lp.iruu[279] = 1303119442253346070L;
        lp.iruu[280] = 7500607260280112219L;
        lp.iruu[281] = 1461408021119601318L;
        lp.iruu[282] = -7214978954638083486L;
        lp.iruu[283] = 1168825254474062502L;
        lp.iruu[284] = -1683493849497340954L;
        lp.iruu[285] = 9144479226540327959L;
        lp.iruu[286] = 98159819421627366L;
        lp.iruu[287] = -7944000517911517942L;
        lp.iruu[288] = -2798059770539186834L;
        lp.iruu[289] = -7059736280654396073L;
        lp.iruu[290] = 2782845322493505902L;
        lp.iruu[291] = 3205749769793380877L;
        lp.iruu[292] = -6385190530142749083L;
        lp.iruu[293] = -1542193953529843460L;
        lp.iruu[294] = -4402793801628577780L;
        lp.iruu[295] = 8840895258698373703L;
        lp.iruu[296] = 4307734277390130309L;
        lp.iruu[297] = -4120265319620879476L;
        lp.iruu[298] = 6115387489098774852L;
        lp.iruu[299] = 7396908949602383248L;
    }

    private static /* synthetic */ float isrq(int n2) {
        return Float.intBitsToFloat(irvd[n2] ^ irve[n2]);
    }

    private static /* synthetic */ void itsy() {
        lp.irvd[200] = -781722595;
        lp.irvd[201] = 1364975630;
        lp.irvd[202] = -747815075;
        lp.irvd[203] = -199132665;
        lp.irvd[204] = 162931253;
        lp.irvd[205] = -1211368012;
        lp.irvd[206] = -1835054387;
        lp.irvd[207] = 408721780;
        lp.irvd[208] = 1124728413;
        lp.irvd[209] = -1118290188;
        lp.irvd[210] = 1470533117;
        lp.irvd[211] = 372472357;
        lp.irvd[212] = 1960081352;
        lp.irvd[213] = 1574516089;
        lp.irvd[214] = 2012854108;
        lp.irvd[215] = -2032926344;
        lp.irvd[216] = 1133875420;
        lp.irvd[217] = 148991249;
        lp.irvd[218] = -492416150;
        lp.irvd[219] = -1569958774;
        lp.irvd[220] = -1086446282;
        lp.irvd[221] = 1843609778;
        lp.irvd[222] = -1689523808;
        lp.irvd[223] = -516739792;
        lp.irvd[224] = 1293755699;
        lp.irvd[225] = 2073348434;
        lp.irvd[226] = -1251218769;
        lp.irvd[227] = -790847029;
        lp.irvd[228] = -533469329;
        lp.irvd[229] = 2054825862;
        lp.irvd[230] = 1798924446;
        lp.irvd[231] = -351452444;
        lp.irvd[232] = -734610096;
        lp.irvd[233] = -2078232849;
        lp.irvd[234] = -1969829430;
        lp.irvd[235] = 471708710;
        lp.irvd[236] = 373036004;
        lp.irvd[237] = 671200011;
        lp.irvd[238] = -878516259;
        lp.irvd[239] = 383197519;
        lp.irvd[240] = 1131262708;
        lp.irvd[241] = -1653604050;
        lp.irvd[242] = -1687005600;
        lp.irvd[243] = -2030094087;
        lp.irvd[244] = 1597305261;
        lp.irvd[245] = -2076753458;
        lp.irvd[246] = -842285341;
        lp.irvd[247] = 1444448318;
        lp.irvd[248] = 546568386;
        lp.irvd[249] = -2135438473;
        lp.irvd[250] = -1967552726;
        lp.irvd[251] = -359700551;
        lp.irvd[252] = 1458265224;
        lp.irvd[253] = -1544705009;
        lp.irvd[254] = 187840442;
        lp.irvd[255] = -764817432;
        lp.irvd[256] = -628315454;
        lp.irvd[257] = 1635379288;
        lp.irvd[258] = 641488451;
        lp.irvd[259] = -619527005;
        lp.irvd[260] = 175095342;
        lp.irvd[261] = 833697750;
        lp.irvd[262] = 352953797;
        lp.irvd[263] = -2042612863;
        lp.irvd[264] = 929687979;
        lp.irvd[265] = -1004289449;
        lp.irvd[266] = 735118301;
        lp.irvd[267] = -1837338684;
        lp.irvd[268] = 463688350;
        lp.irvd[269] = 2084937433;
        lp.irvd[270] = -34778389;
        lp.irvd[271] = -892688129;
        lp.irvd[272] = -1141372199;
        lp.irvd[273] = 2115509993;
        lp.irvd[274] = -1589958191;
        lp.irvd[275] = 108004808;
        lp.irvd[276] = -977813373;
        lp.irvd[277] = -1070587572;
        lp.irvd[278] = -1642710876;
        lp.irvd[279] = -1772009613;
        lp.irvd[280] = -1357899953;
        lp.irvd[281] = -613025201;
        lp.irvd[282] = -638411783;
        lp.irvd[283] = -613478376;
        lp.irvd[284] = -258277744;
        lp.irvd[285] = -608195731;
        lp.irvd[286] = 832408292;
        lp.irvd[287] = 1430864477;
        lp.irvd[288] = -1941202655;
        lp.irvd[289] = 1596880355;
        lp.irvd[290] = -118219755;
        lp.irvd[291] = -1189869846;
        lp.irvd[292] = -2037806495;
        lp.irvd[293] = 1497696673;
        lp.irvd[294] = -1751772732;
        lp.irvd[295] = -53513755;
        lp.irvd[296] = -755778789;
        lp.irvd[297] = -767831375;
        lp.irvd[298] = -1744446037;
        lp.irvd[299] = 1568464421;
    }

    private static /* synthetic */ void ittj() {
        lp.iruu[100] = 7846158292127502259L;
        lp.iruu[101] = 6130542374132205484L;
        lp.iruu[102] = 8284479771528537654L;
        lp.iruu[103] = 9016027075914507149L;
        lp.iruu[104] = 1643536017905421309L;
        lp.iruu[105] = 3200591223683217061L;
        lp.iruu[106] = -5910146291168924455L;
        lp.iruu[107] = -478785019584995411L;
        lp.iruu[108] = 354759984216191131L;
        lp.iruu[109] = -1546796257560328672L;
        lp.iruu[110] = 3969920582208815744L;
        lp.iruu[111] = 1592343722214874035L;
        lp.iruu[112] = 8363320205105896941L;
        lp.iruu[113] = -8848470314904121100L;
        lp.iruu[114] = -466496922515930897L;
        lp.iruu[115] = 209727598502955157L;
        lp.iruu[116] = -2847717333416563656L;
        lp.iruu[117] = -3179770496810189517L;
        lp.iruu[118] = -1182843966444110938L;
        lp.iruu[119] = 734718487080454889L;
        lp.iruu[120] = 6187051503288561628L;
        lp.iruu[121] = -5221465193730227389L;
        lp.iruu[122] = 9107314258143744337L;
        lp.iruu[123] = 3193183549805012608L;
        lp.iruu[124] = -8164668522881486730L;
        lp.iruu[125] = -3809039517698530264L;
        lp.iruu[126] = 8596817482971955223L;
        lp.iruu[127] = 6473814879986420231L;
        lp.iruu[128] = 6079832163837705049L;
        lp.iruu[129] = 8822224556102503606L;
        lp.iruu[130] = 306009544504260203L;
        lp.iruu[131] = 2383144937784002392L;
        lp.iruu[132] = -2508226637773108463L;
        lp.iruu[133] = -2256190759352898911L;
        lp.iruu[134] = 3762561893737914388L;
        lp.iruu[135] = -8843605084406070512L;
        lp.iruu[136] = 662082888141689461L;
        lp.iruu[137] = 3611844975496343972L;
        lp.iruu[138] = 4367068683151824143L;
        lp.iruu[139] = 6337938049963442567L;
        lp.iruu[140] = 2889523365619069334L;
        lp.iruu[141] = -8899037948917313519L;
        lp.iruu[142] = 255043569864800269L;
        lp.iruu[143] = 3890658933240728267L;
        lp.iruu[144] = 331830287419952582L;
        lp.iruu[145] = 5418610909478901055L;
        lp.iruu[146] = -3398478138352864664L;
        lp.iruu[147] = 1284486548695200176L;
        lp.iruu[148] = 3070618691570762106L;
        lp.iruu[149] = -8000322288858269418L;
        lp.iruu[150] = 5777010792523899187L;
        lp.iruu[151] = -2739762422256459051L;
        lp.iruu[152] = -6961355343136757764L;
        lp.iruu[153] = 1311693959957377104L;
        lp.iruu[154] = -1508409806074131012L;
        lp.iruu[155] = 3505635078291787314L;
        lp.iruu[156] = -3702109764964173761L;
        lp.iruu[157] = -1083342703516389651L;
        lp.iruu[158] = -3449382711545000548L;
        lp.iruu[159] = 5059567213186756574L;
        lp.iruu[160] = -6916992847381339425L;
        lp.iruu[161] = 3087747690997468949L;
        lp.iruu[162] = 1037653330740911138L;
        lp.iruu[163] = -2695851738354484239L;
        lp.iruu[164] = -7051666717167953773L;
        lp.iruu[165] = -7230655979130821764L;
        lp.iruu[166] = 2399276016510771548L;
        lp.iruu[167] = 5870561758414647606L;
        lp.iruu[168] = 7308698509579881668L;
        lp.iruu[169] = 1484065497715348080L;
        lp.iruu[170] = 3720878760441969170L;
        lp.iruu[171] = -7402597190233395180L;
        lp.iruu[172] = -5594452098111885179L;
        lp.iruu[173] = -3256342874683863145L;
        lp.iruu[174] = 5815815803474759733L;
        lp.iruu[175] = -7352695504328971240L;
        lp.iruu[176] = 6947535499254818899L;
        lp.iruu[177] = 4222995594294333093L;
        lp.iruu[178] = -4140616859693930382L;
        lp.iruu[179] = 7647490786951376183L;
        lp.iruu[180] = -3343175942269944323L;
        lp.iruu[181] = 6571062000620665012L;
        lp.iruu[182] = 6673520161103237935L;
        lp.iruu[183] = 503050412486095539L;
        lp.iruu[184] = 4101894719953873770L;
        lp.iruu[185] = 4715638712589926573L;
        lp.iruu[186] = -383322353109856939L;
        lp.iruu[187] = -6346504149953945611L;
        lp.iruu[188] = 8002598254972040764L;
        lp.iruu[189] = -2545401025691867396L;
        lp.iruu[190] = 8720672855260587832L;
        lp.iruu[191] = 7032818455899882342L;
        lp.iruu[192] = 4713631492204147386L;
        lp.iruu[193] = -4099603250059874330L;
        lp.iruu[194] = 2150584394994562426L;
        lp.iruu[195] = 2697164235170392775L;
        lp.iruu[196] = -9055487050288376298L;
        lp.iruu[197] = 7159516397777336291L;
        lp.iruu[198] = -7902248113378441809L;
        lp.iruu[199] = 5820560958829976928L;
    }

    private static /* synthetic */ void ittc() {
        lp.irve[0] = 481811426;
        lp.irve[1] = 1933950046;
        lp.irve[2] = -398559195;
        lp.irve[3] = -706702927;
        lp.irve[4] = -654179607;
        lp.irve[5] = -1470311509;
        lp.irve[6] = -1784320024;
        lp.irve[7] = 1233768398;
        lp.irve[8] = 354674126;
        lp.irve[9] = -399202760;
        lp.irve[10] = 1633272649;
        lp.irve[11] = 1444736608;
        lp.irve[12] = 2123000198;
        lp.irve[13] = -1516126979;
        lp.irve[14] = -274750794;
        lp.irve[15] = -2110732442;
        lp.irve[16] = 1395174896;
        lp.irve[17] = -1846905645;
        lp.irve[18] = 1469190729;
        lp.irve[19] = 1794557948;
        lp.irve[20] = 1176700830;
        lp.irve[21] = 64062126;
        lp.irve[22] = -1609172773;
        lp.irve[23] = 2021882103;
        lp.irve[24] = -939937875;
        lp.irve[25] = 230587854;
        lp.irve[26] = 62628068;
        lp.irve[27] = -170782355;
        lp.irve[28] = 1726636662;
        lp.irve[29] = 1698823373;
        lp.irve[30] = 430937076;
        lp.irve[31] = 1995139267;
        lp.irve[32] = -221388245;
        lp.irve[33] = 501110126;
        lp.irve[34] = 1703475883;
        lp.irve[35] = -1546473374;
        lp.irve[36] = -1977245325;
        lp.irve[37] = -1774151280;
        lp.irve[38] = -1609481232;
        lp.irve[39] = -32867285;
        lp.irve[40] = 1579594837;
        lp.irve[41] = 264760802;
        lp.irve[42] = -2088275196;
        lp.irve[43] = 1130731326;
        lp.irve[44] = 305196632;
        lp.irve[45] = 687165565;
        lp.irve[46] = -411835903;
        lp.irve[47] = 1923463000;
        lp.irve[48] = 942427770;
        lp.irve[49] = 482994284;
        lp.irve[50] = 320754131;
        lp.irve[51] = 722389542;
        lp.irve[52] = 1312621136;
        lp.irve[53] = 2050069696;
        lp.irve[54] = -128654725;
        lp.irve[55] = 1202751126;
        lp.irve[56] = 1609170367;
        lp.irve[57] = 1229733358;
        lp.irve[58] = 1287388209;
        lp.irve[59] = 1710446619;
        lp.irve[60] = -1981566167;
        lp.irve[61] = 1599732763;
        lp.irve[62] = 1470489054;
        lp.irve[63] = -307755230;
        lp.irve[64] = 388772900;
        lp.irve[65] = 337820602;
        lp.irve[66] = -1613485717;
        lp.irve[67] = 1277233273;
        lp.irve[68] = 1031460377;
        lp.irve[69] = -506191267;
        lp.irve[70] = -879997885;
        lp.irve[71] = -760829667;
        lp.irve[72] = 1486194759;
        lp.irve[73] = -968111574;
        lp.irve[74] = 151768544;
        lp.irve[75] = 341734510;
        lp.irve[76] = -1295187897;
        lp.irve[77] = 1449930353;
        lp.irve[78] = -661689706;
        lp.irve[79] = -931602979;
        lp.irve[80] = -1783810373;
        lp.irve[81] = 1426585338;
        lp.irve[82] = -1392714018;
        lp.irve[83] = -357748597;
        lp.irve[84] = -1904026387;
        lp.irve[85] = -116279099;
        lp.irve[86] = -91589671;
        lp.irve[87] = 1743296460;
        lp.irve[88] = -2023700347;
        lp.irve[89] = -1164482384;
        lp.irve[90] = 1237380429;
        lp.irve[91] = -265456106;
        lp.irve[92] = 2035516925;
        lp.irve[93] = 1275525291;
        lp.irve[94] = 1245169890;
        lp.irve[95] = -244307474;
        lp.irve[96] = 1293995745;
        lp.irve[97] = -1005083758;
        lp.irve[98] = 1119876365;
        lp.irve[99] = -1875953496;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void drawRotatedLineBox(double var0, double var2_1, double var4_2, float var6_3, float var7_4, float var8_5, int var9_6, float var10_7) {
        var36_8 = lp.c;
        var35_9 /* !! */  = lp.b;
        var34_10 = lp.a;
        if (var36_8) {
            throw null;
lbl6:
            // 48 sources

            return;
        }
        if (var34_10 || var34_10) ** GOTO lbl6
        var11_11 = lp.getCameraPos();
        if (var34_10 || var34_10) ** GOTO lbl6
        var12_12 = (float)(var0 - var11_11.field_1352);
        if (var34_10 || var34_10) ** GOTO lbl6
        var13_13 = (float)(var2_1 - var11_11.field_1351);
        if (var34_10 || var34_10) ** GOTO lbl6
        var14_14 = (float)(var4_2 - var11_11.field_1350);
        if (var34_10 || var34_10) ** GOTO lbl6
        var15_15 = var6_3 / 2.0f;
        if (var34_10) ** GOTO lbl6
        if (var35_9 /* !! */  == 0) ** GOTO lbl-1000
        switch (var35_9 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var34_10) ** GOTO lbl6
                var16_16 = (float)(var9_6 >> lp.iruw("isvn", irvc(int ), (int)212) & lp.iruw("isvo", irvc(int ), (int)213)) / lp.iruw("isvp", isrq(int ), (int)214);
                if (var34_10 || var34_10) ** GOTO lbl6
                var17_17 = (float)(var9_6 >> lp.iruw("isvq", irvc(int ), (int)215) & lp.iruw("isvr", irvc(int ), (int)216)) / lp.iruw("isvs", isrq(int ), (int)217);
                if (var34_10 || var34_10) ** GOTO lbl6
                var18_18 = (float)(var9_6 & lp.iruw("isvt", irvc(int ), (int)218)) / lp.iruw("isvu", isrq(int ), (int)219);
                if (var34_10 || var34_10) ** GOTO lbl6
                var19_19 = new float[][]{{-var15_15, -var15_15, -var15_15}, {var15_15, -var15_15, -var15_15}, {var15_15, -var15_15, var15_15}, {-var15_15, -var15_15, var15_15}, {-var15_15, var15_15, -var15_15}, {var15_15, var15_15, -var15_15}, {var15_15, var15_15, var15_15}, {-var15_15, var15_15, var15_15}};
                if (var34_10 || var34_10) ** GOTO lbl6
                var20_20 = (float)Math.cos(Math.toRadians(var7_4));
                if (var34_10 || var34_10) ** GOTO lbl6
                var21_21 = (float)Math.sin(Math.toRadians(var7_4));
                if (var34_10 || var34_10) ** GOTO lbl6
                var22_22 = (float)Math.cos(Math.toRadians(var8_5));
                if (var34_10 || var34_10) ** GOTO lbl6
                var23_23 = (float)Math.sin(Math.toRadians(var8_5));
                if (var34_10 || var34_10) ** GOTO lbl6
                var24_24 /* !! */  = var19_19;
                if (var34_10) ** GOTO lbl6
                var25_25 = var24_24 /* !! */ .length;
                if (var34_10) ** GOTO lbl6
                var26_27 /* !! */  = lp.iruw("isvv", irvc(int ), (int)220);
                if (var34_10) ** GOTO lbl6
                do {
                    if (var34_10 || var34_10) ** GOTO lbl6
                    if (var26_27 /* !! */  >= var25_25) ** GOTO lbl81
                    if (var34_10) ** GOTO lbl6
                    var27_28 = var24_24 /* !! */ [var26_27 /* !! */ ];
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var28_30 = var27_28[0];
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var29_33 = var27_28[1];
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var30_36 = var27_28[2];
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var31_39 = var28_30 * var20_20 - var30_36 * var21_21;
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var32_40 = var28_30 * var21_21 + var30_36 * var20_20;
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var28_30 = var31_39;
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var30_36 = var32_40;
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var33_41 = var29_33 * var22_22 - var30_36 * var23_23;
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var32_40 = var29_33 * var23_23 + var30_36 * var22_22;
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var29_33 = var33_41;
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var27_28[lp.iruw("isvw", irvc(int ), (int)221)] = var28_30 + var12_12;
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var27_28[lp.iruw("isvx", irvc(int ), (int)222)] = var29_33 + var13_13;
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var27_28[lp.iruw("isvy", irvc(int ), (int)223)] = var32_40 + var14_14;
                    if (var34_10 || var34_10) ** GOTO lbl6
                    ++var26_27 /* !! */ ;
                    if (var34_10) ** GOTO lbl6
                } while (!var36_8);
                throw null;
lbl81:
                // 1 sources

                if (var34_10 || var34_10) ** GOTO lbl6
                var24_24 /* !! */  = new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 0}, {4, 5}, {5, 6}, {6, 7}, {7, 4}, {0, 4}, {1, 5}, {2, 6}, {3, 7}};
                if (var34_10 || var34_10) ** GOTO lbl6
                var25_26 /* !! */  = var24_24 /* !! */ ;
                if (var34_10) ** GOTO lbl6
                var26_27 /* !! */  = (reference)var25_26 /* !! */ .length;
                if (var34_10) ** GOTO lbl6
                var27_29 = lp.iruw("isvz", irvc(int ), (int)224);
                if (var34_10) ** GOTO lbl6
                do {
                    if (var34_10 || var34_10) ** GOTO lbl6
                    if (var27_29 >= var26_27 /* !! */ ) ** GOTO lbl106
                    if (var34_10) ** GOTO lbl6
                    var28_32 = var25_26 /* !! */ [var27_29];
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var29_35 = var19_19[var28_32[0]];
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var30_38 = var19_19[var28_32[1]];
                    if (var34_10 || var34_10) ** GOTO lbl6
                    lp.addLine(var29_35[0], var29_35[1], var29_35[2], var30_38[0], var30_38[1], var30_38[2], var16_16, var17_17, var18_18, var10_7);
                    if (var34_10 || var34_10) ** GOTO lbl6
                    ++var27_29;
                    if (var34_10) ** GOTO lbl6
                } while (!var36_8);
                throw null;
lbl106:
                // 1 sources

                if (!var34_10 && !var34_10) ** break;
                ** continue;
                return;
            }
lbl109:
            // 2 sources

            case 0: {
                var35_9 /* !! */  = (int)lp.iruw("iswa", irvc(int ), (int)225);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl164
            }
            case 1: {
                var35_9 /* !! */  = (int)lp.iruw("iswb", irvc(int ), (int)226);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl423
            }
lbl119:
            // 3 sources

            case 2: {
                do {
                    var35_9 /* !! */  = (int)lp.iruw("iswc", irvc(int ), (int)227);
                } while (!var36_8);
                throw null;
            }
lbl124:
            // 2 sources

            case 3: {
                var35_9 /* !! */  = (int)lp.iruw("iswd", irvc(int ), (int)228);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl397
            }
lbl129:
            // 5 sources

            case 4: {
                var35_9 /* !! */  = (int)lp.iruw("iswe", irvc(int ), (int)229);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl397
            }
lbl134:
            // 2 sources

            case 5: {
                var35_9 /* !! */  = (int)lp.iruw("iswf", irvc(int ), (int)230);
                if (!var36_8) break;
                throw null;
            }
lbl138:
            // 2 sources

            case 6: {
                var35_9 /* !! */  = (int)lp.iruw("iswg", irvc(int ), (int)231);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl234
            }
lbl143:
            // 2 sources

            case 7: {
                var35_9 /* !! */  = (int)lp.iruw("iswh", irvc(int ), (int)232);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl388
            }
            case 8: {
                var35_9 /* !! */  = (int)lp.iruw("iswi", irvc(int ), (int)233);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl464
            }
lbl153:
            // 2 sources

            case 9: {
                var35_9 /* !! */  = (int)lp.iruw("iswj", irvc(int ), (int)234);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl158:
            // 3 sources

            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var35_9 /* !! */  = (int)lp.iruw("iswk", irvc(int ), (int)235);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl253
                    break;
                }
            }
lbl164:
            // 2 sources

            case 11: {
                var35_9 /* !! */  = (int)lp.iruw("iswl", irvc(int ), (int)236);
                if (!var36_8) ** GOTO lbl129
                throw null;
            }
lbl168:
            // 2 sources

            case 12: {
                var35_9 /* !! */  = (int)lp.iruw("iswm", irvc(int ), (int)237);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl323
            }
lbl173:
            // 3 sources

            case 13: {
                var35_9 /* !! */  = (int)lp.iruw("iswn", irvc(int ), (int)238);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl206
            }
            case 14: {
                var35_9 /* !! */  = (int)lp.iruw("iswo", irvc(int ), (int)239);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl243
            }
lbl183:
            // 2 sources

            case 15: {
                var35_9 /* !! */  = (int)lp.iruw("iswp", irvc(int ), (int)240);
                if (var36_8) {
                    throw null;
                }
            }
lbl187:
            // 4 sources

            case 16: {
                var35_9 /* !! */  = (int)lp.iruw("iswq", irvc(int ), (int)241);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl393
            }
lbl192:
            // 2 sources

            case 17: {
                var35_9 /* !! */  = (int)lp.iruw("iswr", irvc(int ), (int)242);
                if (!var36_8) ** GOTO lbl158
                throw null;
            }
lbl196:
            // 3 sources

            case 18: {
                var35_9 /* !! */  = (int)lp.iruw("isws", irvc(int ), (int)243);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl318
            }
lbl201:
            // 2 sources

            case 19: {
                var35_9 /* !! */  = (int)lp.iruw("iswt", irvc(int ), (int)244);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl308
            }
lbl206:
            // 2 sources

            case 20: {
                var35_9 /* !! */  = (int)lp.iruw("iswu", irvc(int ), (int)245);
                if (!var36_8) ** GOTO lbl129
                throw null;
            }
lbl210:
            // 2 sources

            case 21: {
                var35_9 /* !! */  = (int)lp.iruw("iswv", irvc(int ), (int)246);
                if (!var36_8) ** GOTO lbl192
                throw null;
            }
            case 22: {
                var35_9 /* !! */  = (int)lp.iruw("isww", irvc(int ), (int)247);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl281
            }
            case 23: {
                var35_9 /* !! */  = (int)lp.iruw("iswx", irvc(int ), (int)248);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl277
            }
            case 24: {
                var35_9 /* !! */  = (int)lp.iruw("iswy", irvc(int ), (int)249);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl353
            }
            case 25: {
                var35_9 /* !! */  = (int)lp.iruw("iswz", irvc(int ), (int)250);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl313
            }
lbl234:
            // 3 sources

            case 26: {
                var35_9 /* !! */  = (int)lp.iruw("isxa", irvc(int ), (int)251);
                if (!var36_8) ** GOTO lbl196
                throw null;
            }
lbl238:
            // 2 sources

            case 27: {
                var35_9 /* !! */  = (int)lp.iruw("isxb", irvc(int ), (int)252);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl358
            }
lbl243:
            // 2 sources

            case 28: {
                var35_9 /* !! */  = (int)lp.iruw("isxc", irvc(int ), (int)253);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl371
            }
lbl248:
            // 2 sources

            case 29: {
                var35_9 /* !! */  = (int)lp.iruw("isxd", irvc(int ), (int)254);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl298
            }
lbl253:
            // 2 sources

            case 30: {
                var35_9 /* !! */  = (int)lp.iruw("isxe", irvc(int ), (int)255);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl375
            }
            case 31: {
                var35_9 /* !! */  = (int)lp.iruw("isxf", irvc(int ), (int)256);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl402
            }
            case 32: {
                var35_9 /* !! */  = (int)lp.iruw("isxg", irvc(int ), (int)257);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl423
            }
lbl268:
            // 2 sources

            case 33: {
                var35_9 /* !! */  = (int)lp.iruw("isxh", irvc(int ), (int)258);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl331
            }
lbl273:
            // 2 sources

            case 34: {
                var35_9 /* !! */  = (int)lp.iruw("isxi", irvc(int ), (int)259);
                if (!var36_8) ** GOTO lbl210
                throw null;
            }
lbl277:
            // 4 sources

            case 35: {
                var35_9 /* !! */  = (int)lp.iruw("isxj", irvc(int ), (int)260);
                if (!var36_8) ** GOTO lbl168
                throw null;
            }
lbl281:
            // 3 sources

            case 36: {
                var35_9 /* !! */  = (int)lp.iruw("isxk", irvc(int ), (int)261);
                if (!var36_8) ** GOTO lbl124
                throw null;
            }
            case 37: {
                var35_9 /* !! */  = (int)lp.iruw("isxl", irvc(int ), (int)262);
                if (!var36_8) ** GOTO lbl129
                throw null;
            }
            case 38: {
                var35_9 /* !! */  = (int)lp.iruw("isxm", irvc(int ), (int)263);
                if (!var36_8) ** GOTO lbl138
                throw null;
            }
            case 39: {
                var35_9 /* !! */  = (int)lp.iruw("isxn", irvc(int ), (int)264);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl415
            }
lbl298:
            // 2 sources

            case 40: {
                do {
                    var35_9 /* !! */  = (int)lp.iruw("isxo", irvc(int ), (int)265);
                } while (!var36_8);
                throw null;
            }
lbl303:
            // 2 sources

            case 41: {
                var35_9 /* !! */  = (int)lp.iruw("isxp", irvc(int ), (int)266);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl410
            }
lbl308:
            // 2 sources

            case 42: {
                var35_9 /* !! */  = (int)lp.iruw("isxq", irvc(int ), (int)267);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl444
            }
lbl313:
            // 2 sources

            case 43: {
                var35_9 /* !! */  = (int)lp.iruw("isxr", irvc(int ), (int)268);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl397
            }
lbl318:
            // 2 sources

            case 44: {
                var35_9 /* !! */  = (int)lp.iruw("isxs", irvc(int ), (int)269);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl363
            }
lbl323:
            // 3 sources

            case 45: {
                var35_9 /* !! */  = (int)lp.iruw("isxt", irvc(int ), (int)270);
                if (!var36_8) ** GOTO lbl273
                throw null;
            }
lbl327:
            // 2 sources

            case 46: {
                var35_9 /* !! */  = (int)lp.iruw("isxu", irvc(int ), (int)271);
                if (!var36_8) ** GOTO lbl134
                throw null;
            }
lbl331:
            // 3 sources

            case 47: {
                var35_9 /* !! */  = (int)lp.iruw("isxv", irvc(int ), (int)272);
                if (!var36_8) ** GOTO lbl109
                throw null;
            }
            case 48: {
                var35_9 /* !! */  = (int)lp.iruw("isxw", irvc(int ), (int)273);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl367
            }
            case 49: {
                var35_9 /* !! */  = (int)lp.iruw("isxx", irvc(int ), (int)274);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl456
            }
            case 50: {
                var35_9 /* !! */  = (int)lp.iruw("isxy", irvc(int ), (int)275);
                if (!var36_8) ** GOTO lbl277
                throw null;
            }
            case 51: {
                var35_9 /* !! */  = (int)lp.iruw("isxz", irvc(int ), (int)276);
                if (var36_8) {
                    throw null;
                }
            }
lbl353:
            // 4 sources

            case 52: {
                var35_9 /* !! */  = (int)lp.iruw("isya", irvc(int ), (int)277);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl481
            }
lbl358:
            // 2 sources

            case 53: {
                var35_9 /* !! */  = (int)lp.iruw("isyb", irvc(int ), (int)278);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl464
            }
lbl363:
            // 2 sources

            case 54: {
                var35_9 /* !! */  = (int)lp.iruw("isyc", irvc(int ), (int)279);
                if (!var36_8) ** GOTO lbl119
                throw null;
            }
lbl367:
            // 2 sources

            case 55: {
                var35_9 /* !! */  = (int)lp.iruw("isyd", irvc(int ), (int)280);
                if (!var36_8) ** GOTO lbl143
                throw null;
            }
lbl371:
            // 2 sources

            case 56: {
                var35_9 /* !! */  = (int)lp.iruw("isye", irvc(int ), (int)281);
                if (!var36_8) ** GOTO lbl281
                throw null;
            }
lbl375:
            // 4 sources

            case 57: {
                var35_9 /* !! */  = (int)lp.iruw("isyf", irvc(int ), (int)282);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl493
            }
            case 58: {
                var35_9 /* !! */  = (int)lp.iruw("isyg", irvc(int ), (int)283);
                if (!var36_8) ** GOTO lbl331
                throw null;
            }
            case 59: {
                var35_9 /* !! */  = (int)lp.iruw("isyh", irvc(int ), (int)284);
                if (!var36_8) ** GOTO lbl277
                throw null;
            }
lbl388:
            // 2 sources

            case 60: {
                var35_9 /* !! */  = (int)lp.iruw("isyi", irvc(int ), (int)285);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl473
            }
lbl393:
            // 2 sources

            case 61: {
                var35_9 /* !! */  = (int)lp.iruw("isyj", irvc(int ), (int)286);
                if (!var36_8) ** GOTO lbl375
                throw null;
            }
lbl397:
            // 4 sources

            case 62: {
                var35_9 /* !! */  = (int)lp.iruw("isyk", irvc(int ), (int)287);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl419
            }
lbl402:
            // 2 sources

            case 63: {
                var35_9 /* !! */  = (int)lp.iruw("isyl", irvc(int ), (int)288);
                if (!var36_8) ** GOTO lbl173
                throw null;
            }
            case 64: {
                var35_9 /* !! */  = (int)lp.iruw("isym", irvc(int ), (int)289);
                if (!var36_8) ** GOTO lbl119
                throw null;
            }
lbl410:
            // 2 sources

            case 65: {
                var35_9 /* !! */  = (int)lp.iruw("isyn", irvc(int ), (int)290);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl444
            }
lbl415:
            // 2 sources

            case 66: {
                var35_9 /* !! */  = (int)lp.iruw("isyo", irvc(int ), (int)291);
                if (!var36_8) ** GOTO lbl248
                throw null;
            }
lbl419:
            // 2 sources

            case 67: {
                var35_9 /* !! */  = (int)lp.iruw("isyp", irvc(int ), (int)292);
                if (!var36_8) ** GOTO lbl303
                throw null;
            }
lbl423:
            // 3 sources

            case 68: {
                var35_9 /* !! */  = (int)lp.iruw("isyq", irvc(int ), (int)293);
                if (var36_8) {
                    throw null;
                }
            }
            case 69: {
                var35_9 /* !! */  = (int)lp.iruw("isyr", irvc(int ), (int)294);
                if (!var36_8) ** GOTO lbl129
                throw null;
            }
            case 70: {
                var35_9 /* !! */  = (int)lp.iruw("isys", irvc(int ), (int)295);
                if (!var36_8) ** GOTO lbl196
                throw null;
            }
            case 71: {
                var35_9 /* !! */  = (int)lp.iruw("isyt", irvc(int ), (int)296);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl473
            }
            case 72: {
                var35_9 /* !! */  = (int)lp.iruw("isyu", irvc(int ), (int)297);
                if (!var36_8) ** GOTO lbl234
                throw null;
            }
lbl444:
            // 3 sources

            case 73: {
                var35_9 /* !! */  = (int)lp.iruw("isyv", irvc(int ), (int)298);
                if (!var36_8) ** GOTO lbl327
                throw null;
            }
            case 74: {
                var35_9 /* !! */  = (int)lp.iruw("isyw", irvc(int ), (int)299);
                if (!var36_8) ** GOTO lbl173
                throw null;
            }
            case 75: {
                var35_9 /* !! */  = (int)lp.iruw("isyx", irvc(int ), (int)300);
                if (!var36_8) ** GOTO lbl153
                throw null;
            }
lbl456:
            // 2 sources

            case 76: {
                var35_9 /* !! */  = (int)lp.iruw("isyy", irvc(int ), (int)301);
                if (!var36_8) ** GOTO lbl375
                throw null;
            }
            case 77: {
                var35_9 /* !! */  = (int)lp.iruw("isyz", irvc(int ), (int)302);
                if (!var36_8) ** GOTO lbl268
                throw null;
            }
lbl464:
            // 3 sources

            case 78: {
                var35_9 /* !! */  = (int)lp.iruw("isza", irvc(int ), (int)303);
                if (!var36_8) ** GOTO lbl201
                throw null;
            }
            case 79: {
                var35_9 /* !! */  = (int)lp.iruw("iszb", irvc(int ), (int)304);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl493
            }
lbl473:
            // 3 sources

            case 80: {
                var35_9 /* !! */  = (int)lp.iruw("iszc", irvc(int ), (int)305);
                if (!var36_8) ** GOTO lbl323
                throw null;
            }
            case 81: {
                var35_9 /* !! */  = (int)lp.iruw("iszd", irvc(int ), (int)306);
                if (!var36_8) ** GOTO lbl187
                throw null;
            }
lbl481:
            // 2 sources

            case 82: {
                var35_9 /* !! */  = (int)lp.iruw("isze", irvc(int ), (int)307);
                if (!var36_8) ** GOTO lbl238
                throw null;
            }
            case 83: {
                var35_9 /* !! */  = (int)lp.iruw("iszf", irvc(int ), (int)308);
                if (!var36_8) ** GOTO lbl158
                throw null;
            }
            case 84: {
                var35_9 /* !! */  = (int)lp.iruw("iszg", irvc(int ), (int)309);
                if (var36_8) {
                    throw null;
                }
            }
lbl493:
            // 5 sources

            case 85: {
                do {
                    var35_9 /* !! */  = (int)lp.iruw("iszh", irvc(int ), (int)310);
                } while (!var36_8);
                throw null;
            }
            case 86: 
        }
        var35_9 /* !! */  = (int)lp.iruw("iszi", irvc(int ), (int)311);
        ** while (!var36_8)
lbl501:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ittm() {
        lp.iruv[0] = -8355385080515950687L;
        lp.iruv[1] = -1559407435365637867L;
        lp.iruv[2] = -3901908720199592947L;
        lp.iruv[3] = 7219529011809823244L;
        lp.iruv[4] = 2127721161516031301L;
        lp.iruv[5] = 2473018653549834115L;
        lp.iruv[6] = 1957595810084015974L;
        lp.iruv[7] = 7403962505603171350L;
        lp.iruv[8] = -9080366278643355114L;
        lp.iruv[9] = -1740229679319417642L;
        lp.iruv[10] = -2836235423126402191L;
        lp.iruv[11] = -769720817853798173L;
        lp.iruv[12] = -2950017769270533983L;
        lp.iruv[13] = -243685856477713623L;
        lp.iruv[14] = 1344440722549811164L;
        lp.iruv[15] = -6219258288487977726L;
        lp.iruv[16] = -7840959420760986118L;
        lp.iruv[17] = 8853436599876125967L;
        lp.iruv[18] = 7007014070941314723L;
        lp.iruv[19] = -2493674798833985980L;
        lp.iruv[20] = -3376671887894508251L;
        lp.iruv[21] = -4488830496164960775L;
        lp.iruv[22] = 2921889738139417841L;
        lp.iruv[23] = 5400042152754557563L;
        lp.iruv[24] = -4169560415059318401L;
        lp.iruv[25] = -1225337594224473819L;
        lp.iruv[26] = -705922369478541086L;
        lp.iruv[27] = -3456517417757573276L;
        lp.iruv[28] = 747306187685226059L;
        lp.iruv[29] = 7255651120649666960L;
        lp.iruv[30] = -8738656436355999435L;
        lp.iruv[31] = -4898233083399161806L;
        lp.iruv[32] = 4195470044823716292L;
        lp.iruv[33] = -5090884482989967742L;
        lp.iruv[34] = -1079891082399290139L;
        lp.iruv[35] = 8272040815941455146L;
        lp.iruv[36] = -5045405422582290765L;
        lp.iruv[37] = -5991089601541552816L;
        lp.iruv[38] = -18231142910109924L;
        lp.iruv[39] = -879811148492961837L;
        lp.iruv[40] = -3932242288080223036L;
        lp.iruv[41] = 8984573217867342377L;
        lp.iruv[42] = 2417118362132705143L;
        lp.iruv[43] = -3440495658369693433L;
        lp.iruv[44] = 6046824349850493417L;
        lp.iruv[45] = -5309381216249004635L;
        lp.iruv[46] = 3777976983765870191L;
        lp.iruv[47] = -5202215285117371405L;
        lp.iruv[48] = -344308446936816975L;
        lp.iruv[49] = 5595476793439972950L;
        lp.iruv[50] = -680919449915289258L;
        lp.iruv[51] = 6262107436906130679L;
        lp.iruv[52] = -3702204653833479629L;
        lp.iruv[53] = -9074871036449969158L;
        lp.iruv[54] = -4925157823628594506L;
        lp.iruv[55] = 6036188888396337028L;
        lp.iruv[56] = 6803846068648740150L;
        lp.iruv[57] = 2514779285201359428L;
        lp.iruv[58] = -7033966885248393918L;
        lp.iruv[59] = 1028136651315714775L;
        lp.iruv[60] = -7340369329205030453L;
        lp.iruv[61] = -7297146558962230528L;
        lp.iruv[62] = 3592028972486581987L;
        lp.iruv[63] = 9063263024267145377L;
        lp.iruv[64] = -7665269965872828792L;
        lp.iruv[65] = 6137058099416710254L;
        lp.iruv[66] = 7538771342164920493L;
        lp.iruv[67] = 507437831659014460L;
        lp.iruv[68] = 3401639759263668394L;
        lp.iruv[69] = -8715484093044305837L;
        lp.iruv[70] = -7419576804985838094L;
        lp.iruv[71] = -5988298576944103038L;
        lp.iruv[72] = 4393313686125099895L;
        lp.iruv[73] = 5225919765452230443L;
        lp.iruv[74] = -4810248285290366390L;
        lp.iruv[75] = 1650146199202465747L;
        lp.iruv[76] = -7933320453649223223L;
        lp.iruv[77] = -6563634816796394324L;
        lp.iruv[78] = 5498652090982508627L;
        lp.iruv[79] = -3274162612234699754L;
        lp.iruv[80] = 5979921974509781592L;
        lp.iruv[81] = 4750904065334690091L;
        lp.iruv[82] = -6965280705136441714L;
        lp.iruv[83] = 4624818338143545866L;
        lp.iruv[84] = 7553490401902700537L;
        lp.iruv[85] = 3379354564246338405L;
        lp.iruv[86] = -7158180508482854356L;
        lp.iruv[87] = -5727998711451397354L;
        lp.iruv[88] = -9132744991853127221L;
        lp.iruv[89] = 5731371258096923328L;
        lp.iruv[90] = 3265724291590058388L;
        lp.iruv[91] = -6843315955332397445L;
        lp.iruv[92] = 7094540001130376099L;
        lp.iruv[93] = -7348480852626411082L;
        lp.iruv[94] = -4567555739701224719L;
        lp.iruv[95] = 247879027331221081L;
        lp.iruv[96] = 1939428968503659032L;
        lp.iruv[97] = -4882793635655728962L;
        lp.iruv[98] = 8191910739779355816L;
        lp.iruv[99] = -2085040609552943304L;
    }

    private static /* synthetic */ void ittn() {
        lp.iruv[100] = 8651412295228242837L;
        lp.iruv[101] = -1810564764348769910L;
        lp.iruv[102] = 8199034612260593251L;
        lp.iruv[103] = 1328333786279114285L;
        lp.iruv[104] = 5373363953238972228L;
        lp.iruv[105] = -4471804383171105023L;
        lp.iruv[106] = 3048565571891381186L;
        lp.iruv[107] = -6275564701516863063L;
        lp.iruv[108] = 7737594927423012783L;
        lp.iruv[109] = -3638544981570814384L;
        lp.iruv[110] = 1930763233134492399L;
        lp.iruv[111] = 9198391510153021915L;
        lp.iruv[112] = 3544934876292382518L;
        lp.iruv[113] = -3178209480726159476L;
        lp.iruv[114] = 1897690805708223829L;
        lp.iruv[115] = -7774413233856767865L;
        lp.iruv[116] = 1553086996387662689L;
        lp.iruv[117] = -7970785091640777894L;
        lp.iruv[118] = -3768832923015163361L;
        lp.iruv[119] = 1093356882275442577L;
        lp.iruv[120] = 3762200470234230661L;
        lp.iruv[121] = 3397496088384585052L;
        lp.iruv[122] = 6792337896404196171L;
        lp.iruv[123] = -6730615251307710419L;
        lp.iruv[124] = 3962052630924326618L;
        lp.iruv[125] = -6675077562137549341L;
        lp.iruv[126] = -2448128356044232946L;
        lp.iruv[127] = 2303428771304775044L;
        lp.iruv[128] = -2536655563038652363L;
        lp.iruv[129] = -3844023042895398346L;
        lp.iruv[130] = -9193659820256092987L;
        lp.iruv[131] = 4800595967583132356L;
        lp.iruv[132] = 671436420566660313L;
        lp.iruv[133] = 1587152727622091796L;
        lp.iruv[134] = -8585813878364793889L;
        lp.iruv[135] = -7975044429770743816L;
        lp.iruv[136] = -2155996366799697705L;
        lp.iruv[137] = 5926282932976681961L;
        lp.iruv[138] = 8440196841182957282L;
        lp.iruv[139] = -8981218422901678424L;
        lp.iruv[140] = 8868505057312988317L;
        lp.iruv[141] = -3711210096139934889L;
        lp.iruv[142] = 3600411663960066931L;
        lp.iruv[143] = 1953853739903259440L;
        lp.iruv[144] = 3158515846688012124L;
        lp.iruv[145] = -1407238293523694868L;
        lp.iruv[146] = 710887999113958759L;
        lp.iruv[147] = -2345411732137692039L;
        lp.iruv[148] = -2574964414804687078L;
        lp.iruv[149] = 7306684943087514434L;
        lp.iruv[150] = -3663953747865613119L;
        lp.iruv[151] = -675494566373548895L;
        lp.iruv[152] = -2582485492024530053L;
        lp.iruv[153] = 897165398754431294L;
        lp.iruv[154] = -5565992311321584709L;
        lp.iruv[155] = 5828356280694297763L;
        lp.iruv[156] = 5041309608506219626L;
        lp.iruv[157] = 6586449477928047383L;
        lp.iruv[158] = -8917479413781929297L;
        lp.iruv[159] = -6518460860212598780L;
        lp.iruv[160] = 875712471975168886L;
        lp.iruv[161] = 8033869364285275153L;
        lp.iruv[162] = 7467623543646875931L;
        lp.iruv[163] = -146310897847891196L;
        lp.iruv[164] = 3879315417964305690L;
        lp.iruv[165] = 4503939079085968304L;
        lp.iruv[166] = -2012626751181973449L;
        lp.iruv[167] = 5492261049495692060L;
        lp.iruv[168] = 1661196709649345240L;
        lp.iruv[169] = 3634235097488280042L;
        lp.iruv[170] = 1861181760692488649L;
        lp.iruv[171] = -7652918491189555275L;
        lp.iruv[172] = 6318413246009873520L;
        lp.iruv[173] = 6236674534232946151L;
        lp.iruv[174] = -3303824500748510443L;
        lp.iruv[175] = -4365022076450468750L;
        lp.iruv[176] = -2381012569800890589L;
        lp.iruv[177] = -6971428739826441L;
        lp.iruv[178] = -6995820171552909706L;
        lp.iruv[179] = -4745564418776518972L;
        lp.iruv[180] = -5087349654575831175L;
        lp.iruv[181] = -7793891504278047653L;
        lp.iruv[182] = 4760358782315194043L;
        lp.iruv[183] = 4229269220224546828L;
        lp.iruv[184] = -8460428001356831896L;
        lp.iruv[185] = -964024080752275353L;
        lp.iruv[186] = -4528398992692401190L;
        lp.iruv[187] = -8710180296234489037L;
        lp.iruv[188] = -2900003353264797528L;
        lp.iruv[189] = 8666698047082882151L;
        lp.iruv[190] = 3459840078459968824L;
        lp.iruv[191] = 3023132870534518751L;
        lp.iruv[192] = -2975944616574981113L;
        lp.iruv[193] = 2447103556932845855L;
        lp.iruv[194] = 8060058452686807541L;
        lp.iruv[195] = -1131800092434780232L;
        lp.iruv[196] = 2816309016516682130L;
        lp.iruv[197] = -2477144110047022919L;
        lp.iruv[198] = 4395718744315844724L;
        lp.iruv[199] = 2718734578900395390L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void begin(boolean var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lp.qg - lp.iruw("isqf", irus(int ), (int)145)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == lp.iruw("isqh", irvc(int ), (int)146)) break;
            v0 /* !! */  = (long)lp.iruw("isqi", irvc(int ), (int)147);
        }
        var3_1 = lp.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = lp.qg - lp.iruw("isqj", irus(int ), (int)146)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == lp.iruw("isqk", irvc(int ), (int)148)) break;
            v1 /* !! */  = (long)lp.iruw("isql", irvc(int ), (int)149);
        }
        var2_2 /* !! */  = lp.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = lp.qg - lp.iruw("isqn", irus(int ), (int)147)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == lp.iruw("isqo", irvc(int ), (int)150)) break;
            v2 /* !! */  = (long)lp.iruw("isqq", irvc(int ), (int)151);
        }
        var1_3 = lp.a;
        if (!var3_1) ** GOTO lbl25
        throw null;
lbl-1000:
        // 2 sources

        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl25:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl-1000
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = lp.qg - lp.iruw("isqs", irus(int ), (int)148)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == lp.iruw("isqu", irvc(int ), (int)152)) break;
                    v3 /* !! */  = (long)lp.iruw("isqv", irvc(int ), (int)153);
                }
                lp.begin(null, var0);
                if (var1_3 || var1_3) continue block11;
                return;
                case 0: {
                    var2_2 /* !! */  = (int)lp.iruw("isqx", irvc(int ), (int)154);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl53
                }
                case 1: {
                    var2_2 /* !! */  = (int)lp.iruw("isqz", irvc(int ), (int)155);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: {
                    var2_2 /* !! */  = (int)lp.iruw("isra", irvc(int ), (int)156);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl53
                }
                case 3: {
                    do {
                        var2_2 /* !! */  = (int)lp.iruw("isrc", irvc(int ), (int)157);
                    } while (!var3_1);
                    throw null;
                }
lbl53:
                // 3 sources

                case 4: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)lp.iruw("isre", irvc(int ), (int)158);
                        if (!var3_1) break block11;
                        throw null;
                    }
                }
                case 5: 
            }
        }
        var2_2 /* !! */  = (int)lp.iruw("isrf", irvc(int ), (int)159);
        ** while (!var3_1)
lbl61:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void itth() {
        lp.irve[500] = 1218167311;
        lp.irve[501] = -1624416844;
        lp.irve[502] = -538527672;
        lp.irve[503] = -2100126256;
        lp.irve[504] = -193997736;
        lp.irve[505] = -1846960804;
        lp.irve[506] = 232713815;
        lp.irve[507] = -367889459;
        lp.irve[508] = 197018558;
        lp.irve[509] = -67550080;
        lp.irve[510] = -1527188423;
        lp.irve[511] = 1640738037;
        lp.irve[512] = 820537624;
        lp.irve[513] = -586340902;
        lp.irve[514] = -1878386401;
        lp.irve[515] = -717653726;
        lp.irve[516] = 769624653;
        lp.irve[517] = -320544288;
        lp.irve[518] = 1781815565;
        lp.irve[519] = -844199087;
        lp.irve[520] = -1563692604;
        lp.irve[521] = -1261795003;
        lp.irve[522] = -1677275381;
        lp.irve[523] = 1324140249;
        lp.irve[524] = 1484681263;
        lp.irve[525] = 1228121544;
        lp.irve[526] = -881079898;
        lp.irve[527] = 1741652462;
        lp.irve[528] = 481501573;
        lp.irve[529] = 1785911442;
        lp.irve[530] = -892408190;
        lp.irve[531] = -2108493273;
        lp.irve[532] = 1665064709;
    }

    private static /* synthetic */ void itti() {
        lp.iruu[0] = -5630382663928314658L;
        lp.iruu[1] = -4968262758856915846L;
        lp.iruu[2] = -5602108362467201990L;
        lp.iruu[3] = -4113086948279428823L;
        lp.iruu[4] = 9139889805525487023L;
        lp.iruu[5] = 5681009067305579591L;
        lp.iruu[6] = 7571177414936262380L;
        lp.iruu[7] = 5291959549970429453L;
        lp.iruu[8] = -455494931280926111L;
        lp.iruu[9] = -809733121622787170L;
        lp.iruu[10] = 3984109336253569935L;
        lp.iruu[11] = -4483454912068712143L;
        lp.iruu[12] = 5609099086185741269L;
        lp.iruu[13] = 6583796459756171851L;
        lp.iruu[14] = -1875784715346463064L;
        lp.iruu[15] = -6378786884880083716L;
        lp.iruu[16] = -1324872167174677354L;
        lp.iruu[17] = -4306814248194637163L;
        lp.iruu[18] = -8225779144961410682L;
        lp.iruu[19] = 692811561464510965L;
        lp.iruu[20] = 3917652013868578969L;
        lp.iruu[21] = -1986118333568642599L;
        lp.iruu[22] = -8130303200674686253L;
        lp.iruu[23] = 4537281863500510275L;
        lp.iruu[24] = 1533415091163874810L;
        lp.iruu[25] = 90057171048111247L;
        lp.iruu[26] = -3313271235610208539L;
        lp.iruu[27] = -2050970990903623093L;
        lp.iruu[28] = 4294404469793863726L;
        lp.iruu[29] = -244813224119966402L;
        lp.iruu[30] = 2632791706540955409L;
        lp.iruu[31] = -2333374249974882041L;
        lp.iruu[32] = -4388182531585316899L;
        lp.iruu[33] = -8789503793651352399L;
        lp.iruu[34] = 5443614194136056105L;
        lp.iruu[35] = 438933464928255362L;
        lp.iruu[36] = 8445516519393885375L;
        lp.iruu[37] = 2982465066498886389L;
        lp.iruu[38] = -87086831981826003L;
        lp.iruu[39] = -1022488873839640703L;
        lp.iruu[40] = -7550800384977144938L;
        lp.iruu[41] = 3474781400688445415L;
        lp.iruu[42] = 2100527443680365764L;
        lp.iruu[43] = -4615649916672919714L;
        lp.iruu[44] = 3680960732542489425L;
        lp.iruu[45] = 2460694386278442110L;
        lp.iruu[46] = 5681289621379333016L;
        lp.iruu[47] = -6215729080122287412L;
        lp.iruu[48] = 6385253442916485289L;
        lp.iruu[49] = 6669341308109601204L;
        lp.iruu[50] = 1398145798760543323L;
        lp.iruu[51] = 6681910491734714198L;
        lp.iruu[52] = -5342795646738238170L;
        lp.iruu[53] = 8050799373882870895L;
        lp.iruu[54] = 35634700522072311L;
        lp.iruu[55] = 9047911843478382736L;
        lp.iruu[56] = -2007064853212506275L;
        lp.iruu[57] = 1303660631754428406L;
        lp.iruu[58] = 2350553818855271357L;
        lp.iruu[59] = -3911395152834362556L;
        lp.iruu[60] = 315429128349368120L;
        lp.iruu[61] = 1747532347533992941L;
        lp.iruu[62] = 2476162106836251309L;
        lp.iruu[63] = 8158437595739578143L;
        lp.iruu[64] = -7665269965872828536L;
        lp.iruu[65] = 8581701713689340234L;
        lp.iruu[66] = -8856835246520560193L;
        lp.iruu[67] = -6438815817801912601L;
        lp.iruu[68] = 8942751766026055542L;
        lp.iruu[69] = -2464188953527200315L;
        lp.iruu[70] = 7954882594107098926L;
        lp.iruu[71] = -5988298576944168574L;
        lp.iruu[72] = 6309393858198989130L;
        lp.iruu[73] = -5725743993597971937L;
        lp.iruu[74] = 4803852964801754663L;
        lp.iruu[75] = 6233399890835766289L;
        lp.iruu[76] = 2924744418972223493L;
        lp.iruu[77] = -4955771139305349768L;
        lp.iruu[78] = -9199183403618926489L;
        lp.iruu[79] = -5366795769318962938L;
        lp.iruu[80] = 1983554595043086118L;
        lp.iruu[81] = 3897084462555563556L;
        lp.iruu[82] = 3641574915818510113L;
        lp.iruu[83] = 5173166047665859124L;
        lp.iruu[84] = 5225454865837636774L;
        lp.iruu[85] = 8172285966179011076L;
        lp.iruu[86] = -4104646871362790044L;
        lp.iruu[87] = 6156097123769136013L;
        lp.iruu[88] = -5170104792586324924L;
        lp.iruu[89] = -7771329473325300018L;
        lp.iruu[90] = 1336558278848634866L;
        lp.iruu[91] = -4913156272867203435L;
        lp.iruu[92] = 1838667317167303024L;
        lp.iruu[93] = 8177542544360562886L;
        lp.iruu[94] = 5264699790481030365L;
        lp.iruu[95] = 1731014475331869921L;
        lp.iruu[96] = 7325996438462082215L;
        lp.iruu[97] = -707837916957928441L;
        lp.iruu[98] = 7021692158768187782L;
        lp.iruu[99] = 1340148639678875408L;
    }

    private static /* synthetic */ long irus(int n2) {
        return iruu[n2] ^ iruv[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static class_243 getCameraPos() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lp.qg - lp.iruw("ishu", irus(int ), (int)96)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == lp.iruw("ishv", irvc(int ), (int)78)) break;
            v0 /* !! */  = (long)lp.iruw("ishw", irvc(int ), (int)79);
        }
        var3 = lp.c;
        v1 /* !! */  = lp.qg;
        if (true) ** GOTO lbl11
        block15: while (true) {
            v1 /* !! */  = (long)(lp.iruw("isia", irus(int ), (int)98) - lp.iruw("ishy", irus(int ), (int)97));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 958278509: {
                    break block15;
                }
                case 1380452659: {
                    continue block15;
                }
            }
            break;
        }
        var2_1 = lp.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = lp.qg - lp.iruw("isic", irus(int ), (int)99)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == lp.iruw("isid", irvc(int ), (int)80)) break;
            v2 /* !! */  = (long)lp.iruw("isie", irvc(int ), (int)81);
        }
        var1_2 = lp.a;
        if (var3) {
            throw null;
lbl25:
            // 2 sources

            return null;
        }
        if (var1_2 || var1_2) ** GOTO lbl25
        v3 /* !! */  = lp.qg;
        if (true) ** GOTO lbl32
        block18: while (true) {
            v3 /* !! */  = (long)(lp.iruw("isii", irus(int ), (int)101) - lp.iruw("isig", irus(int ), (int)100));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1879335902: {
                    continue block18;
                }
                case 958278509: {
                    break block18;
                }
            }
            break;
        }
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = lp.qg - lp.iruw("isik", irus(int ), (int)102)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == lp.iruw("isim", irvc(int ), (int)82)) break;
            v4 /* !! */  = (long)lp.iruw("isin", irvc(int ), (int)83);
        }
        v5 = lp.mc.field_1773;
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_3 = lp.qg - lp.iruw("isip", irus(int ), (int)103)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == lp.iruw("isiq", irvc(int ), (int)84)) break;
            v6 /* !! */  = (long)lp.iruw("isir", irvc(int ), (int)85);
        }
        var0_3 = v5.method_19418();
        ** while (var1_2 || var1_2)
lbl50:
        // 1 sources

        v7 /* !! */  = lp.qg;
        if (true) ** GOTO lbl54
        block21: while (true) {
            v7 /* !! */  = (long)(v8 - lp.iruw("isit", irus(int ), (int)104));
lbl54:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -162543877: {
                    v8 = lp.iruw("isiu", irus(int ), (int)105);
                    continue block21;
                }
                case 958278509: {
                    break block21;
                }
                case 1242655619: {
                    v8 = lp.iruw("isiw", irus(int ), (int)106);
                    continue block21;
                }
                case 1589923000: {
                    v8 = lp.iruw("isiy", irus(int ), (int)107);
                    continue block21;
                }
            }
            break;
        }
        return var0_3.method_71156();
    }

    public lp() {
    }

    public static /* synthetic */ CallSite iruw(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void putMatrix(ByteBuffer var0, Matrix4f var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lp.qg - lp.iruw("itjw", irus(int ), (int)187)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == lp.iruw("itjx", irvc(int ), (int)452)) break;
            v0 /* !! */  = (long)lp.iruw("itjz", irvc(int ), (int)453);
        }
        var4_2 = lp.c;
        v1 /* !! */  = lp.qg;
        if (true) ** GOTO lbl11
        block123: while (true) {
            v1 /* !! */  = (long)(lp.iruw("itkc", irus(int ), (int)189) - lp.iruw("itka", irus(int ), (int)188));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2114460182: {
                    continue block123;
                }
                case 958278509: {
                    break block123;
                }
            }
            break;
        }
        var3_3 /* !! */  = lp.b;
        v2 /* !! */  = lp.qg;
        if (true) ** GOTO lbl21
        block124: while (true) {
            v2 /* !! */  = (long)(lp.iruw("itkf", irus(int ), (int)191) - lp.iruw("itkd", irus(int ), (int)190));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 958278509: {
                    break block124;
                }
                case 1205852141: {
                    continue block124;
                }
            }
            break;
        }
        var2_4 = lp.a;
        if (var4_2) {
            throw null;
lbl29:
            // 5 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl29
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = lp.qg - lp.iruw("itkm", irus(int ), (int)192)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == lp.iruw("itkn", irvc(int ), (int)454)) break;
            v3 /* !! */  = (long)lp.iruw("itkp", irvc(int ), (int)455);
        }
        v4 = var1_1.m00();
        v5 /* !! */  = lp.qg;
        if (true) ** GOTO lbl42
        block127: while (true) {
            v5 /* !! */  = (long)(v6 - lp.iruw("itkq", irus(int ), (int)193));
lbl42:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1267366789: {
                    v6 = lp.iruw("itks", irus(int ), (int)194);
                    continue block127;
                }
                case 958278509: {
                    break block127;
                }
                case 1960768597: {
                    v6 = lp.iruw("itkt", irus(int ), (int)195);
                    continue block127;
                }
            }
            break;
        }
        v7 = var0.putFloat(v4);
        v8 /* !! */  = lp.qg;
        if (true) ** GOTO lbl56
        block128: while (true) {
            v8 /* !! */  = (long)(lp.iruw("itkx", irus(int ), (int)197) - lp.iruw("itkv", irus(int ), (int)196));
lbl56:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1781042155: {
                    continue block128;
                }
                case 958278509: {
                    break block128;
                }
            }
            break;
        }
        v9 = var1_1.m01();
        v10 /* !! */  = lp.qg;
        if (true) ** GOTO lbl66
        block129: while (true) {
            v10 /* !! */  = (long)(v11 - lp.iruw("itkz", irus(int ), (int)198));
lbl66:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -115546728: {
                    v11 = lp.iruw("itla", irus(int ), (int)199);
                    continue block129;
                }
                case 958278509: {
                    break block129;
                }
                case 1178063233: {
                    v11 = lp.iruw("itlc", irus(int ), (int)200);
                    continue block129;
                }
                case 1642388832: {
                    v11 = lp.iruw("itld", irus(int ), (int)201);
                    continue block129;
                }
            }
            break;
        }
        v12 = v7.putFloat(v9);
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_2 = lp.qg - lp.iruw("itlf", irus(int ), (int)202)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == lp.iruw("itlg", irvc(int ), (int)456)) break;
            v13 /* !! */  = (long)lp.iruw("itli", irvc(int ), (int)457);
        }
        v14 = var1_1.m02();
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_3 = lp.qg - lp.iruw("itlj", irus(int ), (int)203)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v15 /* !! */  == lp.iruw("itll", irvc(int ), (int)458)) break;
            v15 /* !! */  = (long)lp.iruw("itlm", irvc(int ), (int)459);
        }
        v16 = v12.putFloat(v14);
        v17 /* !! */  = lp.qg;
        if (true) ** GOTO lbl95
        block132: while (true) {
            v17 /* !! */  = (long)(v18 - lp.iruw("itlo", irus(int ), (int)204));
lbl95:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case -574958091: {
                    v18 = lp.iruw("itlp", irus(int ), (int)205);
                    continue block132;
                }
                case -410437917: {
                    v18 = lp.iruw("itlr", irus(int ), (int)206);
                    continue block132;
                }
                case 958278509: {
                    break block132;
                }
                case 1455530668: {
                    v18 = lp.iruw("itls", irus(int ), (int)207);
                    continue block132;
                }
            }
            break;
        }
        v19 = var1_1.m03();
        v20 /* !! */  = lp.qg;
        if (true) ** GOTO lbl112
        block133: while (true) {
            v20 /* !! */  = (long)(v21 - lp.iruw("itlu", irus(int ), (int)208));
lbl112:
            // 2 sources

            switch ((int)v20 /* !! */ ) {
                case -1707818255: {
                    v21 = lp.iruw("itlw", irus(int ), (int)209);
                    continue block133;
                }
                case -831364083: {
                    v21 = lp.iruw("itlx", irus(int ), (int)210);
                    continue block133;
                }
                case 356038991: {
                    v21 = lp.iruw("itlz", irus(int ), (int)211);
                    continue block133;
                }
                case 958278509: {
                    break block133;
                }
            }
            break;
        }
        v16.putFloat(v19);
        if (var2_4 || var2_4) ** GOTO lbl29
        while (true) {
            if ((v22 /* !! */  = (cfr_temp_4 = lp.qg - lp.iruw("itmb", irus(int ), (int)212)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v22 /* !! */  == lp.iruw("itmd", irvc(int ), (int)460)) break;
            v22 /* !! */  = (long)lp.iruw("itme", irvc(int ), (int)461);
        }
        v23 = var1_1.m10();
        while (true) {
            if ((v24 /* !! */  = (cfr_temp_5 = lp.qg - lp.iruw("itmf", irus(int ), (int)213)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v24 /* !! */  == lp.iruw("itmh", irvc(int ), (int)462)) break;
            v24 /* !! */  = (long)lp.iruw("itmj", irvc(int ), (int)463);
        }
        v25 = var0.putFloat(v23);
        while (true) {
            if ((v26 /* !! */  = (cfr_temp_6 = lp.qg - lp.iruw("itmk", irus(int ), (int)214)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v26 /* !! */  == lp.iruw("itmm", irvc(int ), (int)464)) break;
            v26 /* !! */  = (long)lp.iruw("itmn", irvc(int ), (int)465);
        }
        v27 = var1_1.m11();
        v28 /* !! */  = lp.qg;
        if (true) ** GOTO lbl149
        block137: while (true) {
            v28 /* !! */  = (long)(lp.iruw("itmq", irus(int ), (int)216) - lp.iruw("itmo", irus(int ), (int)215));
lbl149:
            // 2 sources

            switch ((int)v28 /* !! */ ) {
                case -1406442628: {
                    continue block137;
                }
                case 958278509: {
                    break block137;
                }
            }
            break;
        }
        v29 = v25.putFloat(v27);
        v30 /* !! */  = lp.qg;
        if (true) ** GOTO lbl159
        block138: while (true) {
            v30 /* !! */  = (long)(lp.iruw("itmu", irus(int ), (int)218) - lp.iruw("itms", irus(int ), (int)217));
lbl159:
            // 2 sources

            switch ((int)v30 /* !! */ ) {
                case 958278509: {
                    break block138;
                }
                case 1642758705: {
                    continue block138;
                }
            }
            break;
        }
        v31 = var1_1.m12();
        v32 /* !! */  = lp.qg;
        if (true) ** GOTO lbl169
        block139: while (true) {
            v32 /* !! */  = (long)(lp.iruw("itmx", irus(int ), (int)220) - lp.iruw("itmv", irus(int ), (int)219));
lbl169:
            // 2 sources

            switch ((int)v32 /* !! */ ) {
                case 958278509: {
                    break block139;
                }
                case 968318429: {
                    continue block139;
                }
            }
            break;
        }
        v33 = v29.putFloat(v31);
        while (true) {
            if ((v34 /* !! */  = (cfr_temp_7 = lp.qg - lp.iruw("itmy", irus(int ), (int)221)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v34 /* !! */  == lp.iruw("itmz", irvc(int ), (int)466)) break;
            v34 /* !! */  = (long)lp.iruw("itna", irvc(int ), (int)467);
        }
        v35 = var1_1.m13();
        v36 /* !! */  = lp.qg;
        if (true) ** GOTO lbl185
        block141: while (true) {
            v36 /* !! */  = (long)(v37 - lp.iruw("itnb", irus(int ), (int)222));
lbl185:
            // 2 sources

            switch ((int)v36 /* !! */ ) {
                case -570131943: {
                    v37 = lp.iruw("itnd", irus(int ), (int)223);
                    continue block141;
                }
                case -464864811: {
                    v37 = lp.iruw("itne", irus(int ), (int)224);
                    continue block141;
                }
                case 958278509: {
                    break block141;
                }
            }
            break;
        }
        v33.putFloat(v35);
        if (var2_4 || var2_4) ** GOTO lbl29
        v38 /* !! */  = lp.qg;
        if (true) ** GOTO lbl201
        block142: while (true) {
            v38 /* !! */  = (long)(lp.iruw("itnh", irus(int ), (int)226) - lp.iruw("itnf", irus(int ), (int)225));
lbl201:
            // 2 sources

            switch ((int)v38 /* !! */ ) {
                case -410627336: {
                    continue block142;
                }
                case 958278509: {
                    break block142;
                }
            }
            break;
        }
        v39 = var1_1.m20();
        v40 /* !! */  = lp.qg;
        if (true) ** GOTO lbl211
        block143: while (true) {
            v40 /* !! */  = (long)(v41 - lp.iruw("itni", irus(int ), (int)227));
lbl211:
            // 2 sources

            switch ((int)v40 /* !! */ ) {
                case -1573854951: {
                    v41 = lp.iruw("itnj", irus(int ), (int)228);
                    continue block143;
                }
                case -1524776714: {
                    v41 = lp.iruw("itnk", irus(int ), (int)229);
                    continue block143;
                }
                case 958278509: {
                    break block143;
                }
                case 2071197521: {
                    v41 = lp.iruw("itnl", irus(int ), (int)230);
                    continue block143;
                }
            }
            break;
        }
        v42 = var0.putFloat(v39);
        v43 /* !! */  = lp.qg;
        if (true) ** GOTO lbl228
        block144: while (true) {
            v43 /* !! */  = (long)(lp.iruw("itno", irus(int ), (int)232) - lp.iruw("itnn", irus(int ), (int)231));
lbl228:
            // 2 sources

            switch ((int)v43 /* !! */ ) {
                case 52728000: {
                    continue block144;
                }
                case 958278509: {
                    break block144;
                }
            }
            break;
        }
        v44 = var1_1.m21();
        v45 /* !! */  = lp.qg;
        if (true) ** GOTO lbl238
        block145: while (true) {
            v45 /* !! */  = (long)(v46 - lp.iruw("itnp", irus(int ), (int)233));
lbl238:
            // 2 sources

            switch ((int)v45 /* !! */ ) {
                case -1612193292: {
                    v46 = lp.iruw("itnq", irus(int ), (int)234);
                    continue block145;
                }
                case -273406279: {
                    v46 = lp.iruw("itnr", irus(int ), (int)235);
                    continue block145;
                }
                case 958278509: {
                    break block145;
                }
            }
            break;
        }
        v47 = v42.putFloat(v44);
        while (true) {
            if ((v48 /* !! */  = (cfr_temp_8 = lp.qg - lp.iruw("itns", irus(int ), (int)236)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v48 /* !! */  == lp.iruw("itnt", irvc(int ), (int)468)) break;
            v48 /* !! */  = (long)lp.iruw("itnu", irvc(int ), (int)469);
        }
        v49 = var1_1.m22();
        v50 /* !! */  = lp.qg;
        if (true) ** GOTO lbl258
        block147: while (true) {
            v50 /* !! */  = (long)(v51 - lp.iruw("itnv", irus(int ), (int)237));
lbl258:
            // 2 sources

            switch ((int)v50 /* !! */ ) {
                case -1193019674: {
                    v51 = lp.iruw("itnw", irus(int ), (int)238);
                    continue block147;
                }
                case -693168948: {
                    v51 = lp.iruw("itnx", irus(int ), (int)239);
                    continue block147;
                }
                case 958278509: {
                    break block147;
                }
                case 1081862747: {
                    v51 = lp.iruw("itny", irus(int ), (int)240);
                    continue block147;
                }
            }
            break;
        }
        v52 = v47.putFloat(v49);
        v53 /* !! */  = lp.qg;
        if (true) ** GOTO lbl275
        block148: while (true) {
            v53 /* !! */  = (long)(lp.iruw("itoa", irus(int ), (int)242) - lp.iruw("itnz", irus(int ), (int)241));
lbl275:
            // 2 sources

            switch ((int)v53 /* !! */ ) {
                case -1774194986: {
                    continue block148;
                }
                case 958278509: {
                    break block148;
                }
            }
            break;
        }
        v54 = var1_1.m23();
        v55 /* !! */  = lp.qg;
        if (true) ** GOTO lbl285
        block149: while (true) {
            v55 /* !! */  = (long)(v56 - lp.iruw("itob", irus(int ), (int)243));
lbl285:
            // 2 sources

            switch ((int)v55 /* !! */ ) {
                case -1811418023: {
                    v56 = lp.iruw("itoc", irus(int ), (int)244);
                    continue block149;
                }
                case 656451910: {
                    v56 = lp.iruw("itod", irus(int ), (int)245);
                    continue block149;
                }
                case 958278509: {
                    break block149;
                }
                case 2064135318: {
                    v56 = lp.iruw("itoe", irus(int ), (int)246);
                    continue block149;
                }
            }
            break;
        }
        v52.putFloat(v54);
        if (var2_4 || var2_4) ** GOTO lbl29
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v57 /* !! */  = lp.qg;
                if (true) ** GOTO lbl307
                block150: while (true) {
                    v57 /* !! */  = (long)(lp.iruw("itog", irus(int ), (int)248) - lp.iruw("itof", irus(int ), (int)247));
lbl307:
                    // 2 sources

                    switch ((int)v57 /* !! */ ) {
                        case 33820368: {
                            continue block150;
                        }
                        case 958278509: {
                            break block150;
                        }
                    }
                    break;
                }
                v58 = var1_1.m30();
                v59 /* !! */  = lp.qg;
                if (true) ** GOTO lbl317
                block151: while (true) {
                    v59 /* !! */  = (long)(lp.iruw("itoi", irus(int ), (int)250) - lp.iruw("itoh", irus(int ), (int)249));
lbl317:
                    // 2 sources

                    switch ((int)v59 /* !! */ ) {
                        case 958278509: {
                            break block151;
                        }
                        case 1874971155: {
                            continue block151;
                        }
                    }
                    break;
                }
                v60 = var0.putFloat(v58);
                v61 /* !! */  = lp.qg;
                if (true) ** GOTO lbl327
                block152: while (true) {
                    v61 /* !! */  = (long)(lp.iruw("itok", irus(int ), (int)252) - lp.iruw("itoj", irus(int ), (int)251));
lbl327:
                    // 2 sources

                    switch ((int)v61 /* !! */ ) {
                        case 602007655: {
                            continue block152;
                        }
                        case 958278509: {
                            break block152;
                        }
                    }
                    break;
                }
                v62 = var1_1.m31();
                while (true) {
                    if ((v63 /* !! */  = (cfr_temp_9 = lp.qg - lp.iruw("itol", irus(int ), (int)253)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v63 /* !! */  == lp.iruw("itom", irvc(int ), (int)470)) break;
                    v63 /* !! */  = (long)lp.iruw("iton", irvc(int ), (int)471);
                }
                v64 = v60.putFloat(v62);
                v65 /* !! */  = lp.qg;
                if (true) ** GOTO lbl343
                block154: while (true) {
                    v65 /* !! */  = (long)(lp.iruw("itop", irus(int ), (int)255) - lp.iruw("itoo", irus(int ), (int)254));
lbl343:
                    // 2 sources

                    switch ((int)v65 /* !! */ ) {
                        case -452776262: {
                            continue block154;
                        }
                        case 958278509: {
                            break block154;
                        }
                    }
                    break;
                }
                v66 = var1_1.m32();
                while (true) {
                    if ((v67 /* !! */  = (cfr_temp_10 = lp.qg - lp.iruw("itoq", irus(int ), (int)256)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v67 /* !! */  == lp.iruw("itor", irvc(int ), (int)472)) break;
                    v67 /* !! */  = (long)lp.iruw("itos", irvc(int ), (int)473);
                }
                v68 = v64.putFloat(v66);
                v69 /* !! */  = lp.qg;
                if (true) ** GOTO lbl359
                block156: while (true) {
                    v69 /* !! */  = (long)(v70 - lp.iruw("itot", irus(int ), (int)257));
lbl359:
                    // 2 sources

                    switch ((int)v69 /* !! */ ) {
                        case -1517961887: {
                            v70 = lp.iruw("itou", irus(int ), (int)258);
                            continue block156;
                        }
                        case 958278509: {
                            break block156;
                        }
                        case 1952694032: {
                            v70 = lp.iruw("itov", irus(int ), (int)259);
                            continue block156;
                        }
                    }
                    break;
                }
                v71 = var1_1.m33();
                while (true) {
                    if ((v72 /* !! */  = (cfr_temp_11 = lp.qg - lp.iruw("itow", irus(int ), (int)260)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v72 /* !! */  == lp.iruw("itox", irvc(int ), (int)474)) break;
                    v72 /* !! */  = (long)lp.iruw("itoy", irvc(int ), (int)475);
                }
                v68.putFloat(v71);
                if (var2_4 || var2_4) ** continue;
                return;
            }
lbl377:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)lp.iruw("itoz", irvc(int ), (int)476);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl420
            }
            case 1: {
                var3_3 /* !! */  = (int)lp.iruw("itpa", irvc(int ), (int)477);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl403
            }
            case 2: {
                var3_3 /* !! */  = (int)lp.iruw("itpb", irvc(int ), (int)478);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl398
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)lp.iruw("itpc", irvc(int ), (int)479);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl407
                    break;
                }
            }
lbl398:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)lp.iruw("itpd", irvc(int ), (int)480);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl412
            }
lbl403:
            // 3 sources

            case 5: {
                var3_3 /* !! */  = (int)lp.iruw("itpe", irvc(int ), (int)481);
                if (!var4_2) ** GOTO lbl377
                throw null;
            }
lbl407:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)lp.iruw("itpf", irvc(int ), (int)482);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl420
            }
lbl412:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)lp.iruw("itpg", irvc(int ), (int)483);
                if (!var4_2) ** GOTO lbl403
                throw null;
            }
            case 8: {
                var3_3 /* !! */  = (int)lp.iruw("itph", irvc(int ), (int)484);
                if (var4_2) {
                    throw null;
                }
            }
lbl420:
            // 5 sources

            case 9: {
                var3_3 /* !! */  = (int)lp.iruw("itpi", irvc(int ), (int)485);
                if (var4_2) {
                    throw null;
                }
            }
            case 10: {
                do {
                    var3_3 /* !! */  = (int)lp.iruw("itpj", irvc(int ), (int)486);
                } while (!var4_2);
                throw null;
            }
            case 11: 
        }
        var3_3 /* !! */  = (int)lp.iruw("itpk", irvc(int ), (int)487);
        ** while (!var4_2)
lbl432:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void drawLineBox(double var0, double var2_1, double var4_2, float var6_3, int var7_4, float var8_5) {
        var19_6 = lp.c;
        var18_7 /* !! */  = lp.b;
        var17_8 = lp.a;
        if (var19_6) {
            throw null;
lbl6:
            // 21 sources

            return;
        }
        if (var17_8 || var17_8) ** GOTO lbl6
        var9_9 = lp.getCameraPos();
        if (var17_8 || var17_8) ** GOTO lbl6
        var10_10 = (float)(var0 - var9_9.field_1352);
        if (var17_8 || var17_8) ** GOTO lbl6
        var11_11 = (float)(var2_1 - var9_9.field_1351);
        if (var17_8 || var17_8) ** GOTO lbl6
        var12_12 = (float)(var4_2 - var9_9.field_1350);
        if (var17_8 || var17_8) ** GOTO lbl6
        var13_13 = var6_3 / 2.0f;
        if (var17_8 || var17_8) ** GOTO lbl6
        var14_14 = (float)(var7_4 >> lp.iruw("isrn", irvc(int ), (int)160) & lp.iruw("isrp", irvc(int ), (int)161)) / lp.iruw("isru", isrq(int ), (int)162);
        if (var17_8 || var17_8) ** GOTO lbl6
        var15_15 = (float)(var7_4 >> lp.iruw("isrv", irvc(int ), (int)163) & lp.iruw("isry", irvc(int ), (int)164)) / lp.iruw("issb", isrq(int ), (int)165);
        if (var17_8 || var17_8) ** GOTO lbl6
        var16_16 = (float)(var7_4 & lp.iruw("isse", irvc(int ), (int)166)) / lp.iruw("issg", isrq(int ), (int)167);
        if (var17_8 || var17_8) ** GOTO lbl6
        lp.addLine(var10_10 - var13_13, var11_11 - var13_13, var12_12 - var13_13, var10_10 + var13_13, var11_11 - var13_13, var12_12 - var13_13, var14_14, var15_15, var16_16, var8_5);
        if (var17_8 || var17_8) ** GOTO lbl6
        lp.addLine(var10_10 + var13_13, var11_11 - var13_13, var12_12 - var13_13, var10_10 + var13_13, var11_11 - var13_13, var12_12 + var13_13, var14_14, var15_15, var16_16, var8_5);
        if (var17_8 || var17_8) ** GOTO lbl6
        lp.addLine(var10_10 + var13_13, var11_11 - var13_13, var12_12 + var13_13, var10_10 - var13_13, var11_11 - var13_13, var12_12 + var13_13, var14_14, var15_15, var16_16, var8_5);
        if (var17_8 || var17_8) ** GOTO lbl6
        lp.addLine(var10_10 - var13_13, var11_11 - var13_13, var12_12 + var13_13, var10_10 - var13_13, var11_11 - var13_13, var12_12 - var13_13, var14_14, var15_15, var16_16, var8_5);
        if (var17_8 || var17_8) ** GOTO lbl6
        if (var18_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var18_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                lp.addLine(var10_10 - var13_13, var11_11 + var13_13, var12_12 - var13_13, var10_10 + var13_13, var11_11 + var13_13, var12_12 - var13_13, var14_14, var15_15, var16_16, var8_5);
                if (var17_8 || var17_8) ** GOTO lbl6
                lp.addLine(var10_10 + var13_13, var11_11 + var13_13, var12_12 - var13_13, var10_10 + var13_13, var11_11 + var13_13, var12_12 + var13_13, var14_14, var15_15, var16_16, var8_5);
                if (var17_8 || var17_8) ** GOTO lbl6
                lp.addLine(var10_10 + var13_13, var11_11 + var13_13, var12_12 + var13_13, var10_10 - var13_13, var11_11 + var13_13, var12_12 + var13_13, var14_14, var15_15, var16_16, var8_5);
                if (var17_8 || var17_8) ** GOTO lbl6
                lp.addLine(var10_10 - var13_13, var11_11 + var13_13, var12_12 + var13_13, var10_10 - var13_13, var11_11 + var13_13, var12_12 - var13_13, var14_14, var15_15, var16_16, var8_5);
                if (var17_8 || var17_8) ** GOTO lbl6
                lp.addLine(var10_10 - var13_13, var11_11 - var13_13, var12_12 - var13_13, var10_10 - var13_13, var11_11 + var13_13, var12_12 - var13_13, var14_14, var15_15, var16_16, var8_5);
                if (var17_8 || var17_8) ** GOTO lbl6
                lp.addLine(var10_10 + var13_13, var11_11 - var13_13, var12_12 - var13_13, var10_10 + var13_13, var11_11 + var13_13, var12_12 - var13_13, var14_14, var15_15, var16_16, var8_5);
                if (var17_8 || var17_8) ** GOTO lbl6
                lp.addLine(var10_10 + var13_13, var11_11 - var13_13, var12_12 + var13_13, var10_10 + var13_13, var11_11 + var13_13, var12_12 + var13_13, var14_14, var15_15, var16_16, var8_5);
                if (var17_8 || var17_8) ** GOTO lbl6
                lp.addLine(var10_10 - var13_13, var11_11 - var13_13, var12_12 + var13_13, var10_10 - var13_13, var11_11 + var13_13, var12_12 + var13_13, var14_14, var15_15, var16_16, var8_5);
                if (var17_8 || var17_8) ** continue;
                return;
            }
lbl53:
            // 2 sources

            case 0: {
                var18_7 /* !! */  = (int)lp.iruw("istp", irvc(int ), (int)168);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl130
            }
            case 1: {
                var18_7 /* !! */  = (int)lp.iruw("istr", irvc(int ), (int)169);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl78
            }
            case 2: {
                var18_7 /* !! */  = (int)lp.iruw("istt", irvc(int ), (int)170);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl107
            }
lbl68:
            // 2 sources

            case 3: {
                var18_7 /* !! */  = (int)lp.iruw("istu", irvc(int ), (int)171);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl83
            }
lbl73:
            // 2 sources

            case 4: {
                var18_7 /* !! */  = (int)lp.iruw("istv", irvc(int ), (int)172);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl157
            }
lbl78:
            // 3 sources

            case 5: {
                var18_7 /* !! */  = (int)lp.iruw("istx", irvc(int ), (int)173);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl241
            }
lbl83:
            // 3 sources

            case 6: {
                var18_7 /* !! */  = (int)lp.iruw("isty", irvc(int ), (int)174);
                if (!var19_6) ** GOTO lbl53
                throw null;
            }
            case 7: {
                var18_7 /* !! */  = (int)lp.iruw("istz", irvc(int ), (int)175);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl170
            }
            case 8: {
                var18_7 /* !! */  = (int)lp.iruw("isua", irvc(int ), (int)176);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl223
            }
            case 9: {
                var18_7 /* !! */  = (int)lp.iruw("isub", irvc(int ), (int)177);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl117
            }
            case 10: {
                var18_7 /* !! */  = (int)lp.iruw("isuc", irvc(int ), (int)178);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl107:
            // 4 sources

            case 11: {
                var18_7 /* !! */  = (int)lp.iruw("isud", irvc(int ), (int)179);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl143
            }
            case 12: {
                var18_7 /* !! */  = (int)lp.iruw("isuf", irvc(int ), (int)180);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl199
            }
lbl117:
            // 2 sources

            case 13: {
                var18_7 /* !! */  = (int)lp.iruw("isuh", irvc(int ), (int)181);
                if (!var19_6) ** GOTO lbl78
                throw null;
            }
            case 14: {
                var18_7 /* !! */  = (int)lp.iruw("isui", irvc(int ), (int)182);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl130
            }
lbl126:
            // 4 sources

            case 15: {
                var18_7 /* !! */  = (int)lp.iruw("isuj", irvc(int ), (int)183);
                if (!var19_6) ** GOTO lbl107
                throw null;
            }
lbl130:
            // 6 sources

            case 16: {
                var18_7 /* !! */  = (int)lp.iruw("isuk", irvc(int ), (int)184);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl191
            }
            case 17: {
                var18_7 /* !! */  = (int)lp.iruw("isul", irvc(int ), (int)185);
                if (!var19_6) break;
                throw null;
            }
            case 18: {
                var18_7 /* !! */  = (int)lp.iruw("isun", irvc(int ), (int)186);
                if (!var19_6) ** GOTO lbl68
                throw null;
            }
lbl143:
            // 2 sources

            case 19: {
                var18_7 /* !! */  = (int)lp.iruw("isuo", irvc(int ), (int)187);
                if (!var19_6) ** GOTO lbl130
                throw null;
            }
            case 20: {
                var18_7 /* !! */  = (int)lp.iruw("isup", irvc(int ), (int)188);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl152:
            // 2 sources

            case 21: {
                var18_7 /* !! */  = (int)lp.iruw("isuq", irvc(int ), (int)189);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl157:
            // 2 sources

            case 22: {
                var18_7 /* !! */  = (int)lp.iruw("isur", irvc(int ), (int)190);
                if (!var19_6) ** GOTO lbl130
                throw null;
            }
lbl161:
            // 3 sources

            case 23: {
                var18_7 /* !! */  = (int)lp.iruw("isus", irvc(int ), (int)191);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl219
            }
            case 24: {
                var18_7 /* !! */  = (int)lp.iruw("isut", irvc(int ), (int)192);
                if (!var19_6) ** GOTO lbl126
                throw null;
            }
lbl170:
            // 3 sources

            case 25: {
                var18_7 /* !! */  = (int)lp.iruw("isuu", irvc(int ), (int)193);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl223
            }
            case 26: {
                var18_7 /* !! */  = (int)lp.iruw("isuv", irvc(int ), (int)194);
                if (!var19_6) ** GOTO lbl73
                throw null;
            }
            case 27: {
                var18_7 /* !! */  = (int)lp.iruw("isuw", irvc(int ), (int)195);
                if (!var19_6) ** GOTO lbl126
                throw null;
            }
            case 28: {
                var18_7 /* !! */  = (int)lp.iruw("isux", irvc(int ), (int)196);
                if (!var19_6) ** GOTO lbl130
                throw null;
            }
lbl187:
            // 3 sources

            case 29: {
                var18_7 /* !! */  = (int)lp.iruw("isuy", irvc(int ), (int)197);
                if (!var19_6) ** GOTO lbl126
                throw null;
            }
lbl191:
            // 5 sources

            case 30: {
                var18_7 /* !! */  = (int)lp.iruw("isuz", irvc(int ), (int)198);
                if (!var19_6) break;
                throw null;
            }
            case 31: {
                var18_7 /* !! */  = (int)lp.iruw("isva", irvc(int ), (int)199);
                if (var19_6) {
                    throw null;
                }
            }
lbl199:
            // 4 sources

            case 32: {
                var18_7 /* !! */  = (int)lp.iruw("isvb", irvc(int ), (int)200);
                if (!var19_6) ** GOTO lbl107
                throw null;
            }
lbl203:
            // 2 sources

            case 33: {
                var18_7 /* !! */  = (int)lp.iruw("isvc", irvc(int ), (int)201);
                if (!var19_6) ** GOTO lbl191
                throw null;
            }
            case 34: {
                var18_7 /* !! */  = (int)lp.iruw("isvd", irvc(int ), (int)202);
                if (!var19_6) ** GOTO lbl203
                throw null;
            }
lbl211:
            // 2 sources

            case 35: {
                var18_7 /* !! */  = (int)lp.iruw("isve", irvc(int ), (int)203);
                if (!var19_6) ** GOTO lbl170
                throw null;
            }
            case 36: {
                var18_7 /* !! */  = (int)lp.iruw("isvf", irvc(int ), (int)204);
                if (!var19_6) ** GOTO lbl187
                throw null;
            }
lbl219:
            // 2 sources

            case 37: {
                var18_7 /* !! */  = (int)lp.iruw("isvg", irvc(int ), (int)205);
                if (!var19_6) ** GOTO lbl83
                throw null;
            }
lbl223:
            // 3 sources

            case 38: {
                var18_7 /* !! */  = (int)lp.iruw("isvh", irvc(int ), (int)206);
                if (!var19_6) ** GOTO lbl191
                throw null;
            }
            case 39: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var18_7 /* !! */  = (int)lp.iruw("isvi", irvc(int ), (int)207);
                    if (!var19_6) ** GOTO lbl191
                    throw null;
                }
            }
            case 40: {
                var18_7 /* !! */  = (int)lp.iruw("isvj", irvc(int ), (int)208);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl241
            }
            case 41: {
                var18_7 /* !! */  = (int)lp.iruw("isvk", irvc(int ), (int)209);
                if (!var19_6) ** GOTO lbl161
                throw null;
            }
lbl241:
            // 3 sources

            case 42: {
                var18_7 /* !! */  = (int)lp.iruw("isvl", irvc(int ), (int)210);
                if (!var19_6) ** GOTO lbl152
                throw null;
            }
            case 43: 
        }
        var18_7 /* !! */  = (int)lp.iruw("isvm", irvc(int ), (int)211);
        ** while (!var19_6)
lbl248:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void itta() {
        lp.irvd[400] = 866076197;
        lp.irvd[401] = 418611451;
        lp.irvd[402] = -1774738631;
        lp.irvd[403] = -1073752474;
        lp.irvd[404] = -670977575;
        lp.irvd[405] = -837661966;
        lp.irvd[406] = 339803206;
        lp.irvd[407] = 750655845;
        lp.irvd[408] = -255964976;
        lp.irvd[409] = -1120421391;
        lp.irvd[410] = -368045588;
        lp.irvd[411] = 871632546;
        lp.irvd[412] = 481145158;
        lp.irvd[413] = -899932707;
        lp.irvd[414] = -390188497;
        lp.irvd[415] = -340160424;
        lp.irvd[416] = 2106141289;
        lp.irvd[417] = 42795182;
        lp.irvd[418] = -1453038118;
        lp.irvd[419] = -1464245483;
        lp.irvd[420] = 1525062184;
        lp.irvd[421] = 412429672;
        lp.irvd[422] = -2036071303;
        lp.irvd[423] = 551697664;
        lp.irvd[424] = 613192816;
        lp.irvd[425] = 393192284;
        lp.irvd[426] = 416767725;
        lp.irvd[427] = 596457227;
        lp.irvd[428] = 1419799069;
        lp.irvd[429] = 1340078890;
        lp.irvd[430] = 2131540011;
        lp.irvd[431] = 576832621;
        lp.irvd[432] = 1874695522;
        lp.irvd[433] = 590281590;
        lp.irvd[434] = 39648154;
        lp.irvd[435] = 1880987902;
        lp.irvd[436] = 1646728918;
        lp.irvd[437] = -1481479280;
        lp.irvd[438] = 1683154542;
        lp.irvd[439] = -605477331;
        lp.irvd[440] = -482830083;
        lp.irvd[441] = -1733075158;
        lp.irvd[442] = 858691503;
        lp.irvd[443] = 2135394133;
        lp.irvd[444] = -1807324179;
        lp.irvd[445] = 1924563412;
        lp.irvd[446] = -887308730;
        lp.irvd[447] = -1405415692;
        lp.irvd[448] = -881283480;
        lp.irvd[449] = -1419892546;
        lp.irvd[450] = -1455959457;
        lp.irvd[451] = -953824214;
        lp.irvd[452] = -2019748168;
        lp.irvd[453] = -1950500608;
        lp.irvd[454] = 1854287549;
        lp.irvd[455] = 635988841;
        lp.irvd[456] = 1260179973;
        lp.irvd[457] = 1943832617;
        lp.irvd[458] = 592544549;
        lp.irvd[459] = 1500691896;
        lp.irvd[460] = -2052600839;
        lp.irvd[461] = 890029813;
        lp.irvd[462] = 1619535882;
        lp.irvd[463] = -644808782;
        lp.irvd[464] = -972034880;
        lp.irvd[465] = -949983507;
        lp.irvd[466] = -668066120;
        lp.irvd[467] = 788487739;
        lp.irvd[468] = -1817625200;
        lp.irvd[469] = -119918180;
        lp.irvd[470] = 450407618;
        lp.irvd[471] = 1110417168;
        lp.irvd[472] = -1463435317;
        lp.irvd[473] = 538201714;
        lp.irvd[474] = -147276353;
        lp.irvd[475] = -548757742;
        lp.irvd[476] = -995817139;
        lp.irvd[477] = 1747626969;
        lp.irvd[478] = 390829707;
        lp.irvd[479] = 39252425;
        lp.irvd[480] = -1142409234;
        lp.irvd[481] = -1522284314;
        lp.irvd[482] = -442004136;
        lp.irvd[483] = -942738193;
        lp.irvd[484] = -76772080;
        lp.irvd[485] = -358969401;
        lp.irvd[486] = -1218696994;
        lp.irvd[487] = -2009943167;
        lp.irvd[488] = -1767075732;
        lp.irvd[489] = -508265814;
        lp.irvd[490] = 843611995;
        lp.irvd[491] = -1065378766;
        lp.irvd[492] = -1039186987;
        lp.irvd[493] = 1497569288;
        lp.irvd[494] = -672889903;
        lp.irvd[495] = -1724521496;
        lp.irvd[496] = 1980140196;
        lp.irvd[497] = 917311053;
        lp.irvd[498] = -1876520405;
        lp.irvd[499] = -1069835715;
    }

    private static /* synthetic */ void ittp() {
        lp.iruv[300] = -7773846219298945241L;
        lp.iruv[301] = -7778493754322066840L;
        lp.iruv[302] = 5651819993926592801L;
        lp.iruv[303] = 4567246682948781410L;
        lp.iruv[304] = -432258581830635876L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$end$2() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lp.qg - lp.iruw("itrj", irus(int ), (int)283)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == lp.iruw("itrk", irvc(int ), (int)516)) break;
            v0 /* !! */  = (long)lp.iruw("itrl", irvc(int ), (int)517);
        }
        var2 = lp.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = lp.qg - lp.iruw("itrm", irus(int ), (int)284)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == lp.iruw("itrn", irvc(int ), (int)518)) break;
            v1 /* !! */  = (long)lp.iruw("itro", irvc(int ), (int)519);
        }
        var1_1 /* !! */  = lp.b;
        v2 /* !! */  = lp.qg;
        if (true) ** GOTO lbl19
        block12: while (true) {
            v2 /* !! */  = (long)(lp.iruw("itrq", irus(int ), (int)286) - lp.iruw("itrp", irus(int ), (int)285));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 123807481: {
                    continue block12;
                }
                case 958278509: {
                    break block12;
                }
            }
            break;
        }
        var0_2 = lp.a;
        if (var2) {
            throw null;
            return null;
        }
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2 || var0_2) ** continue;
                return "Render3D Lines";
            }
            case 0: {
                var1_1 /* !! */  = (int)lp.iruw("itrr", irvc(int ), (int)520);
                if (!var2) break;
                throw null;
            }
            case 1: {
                var1_1 /* !! */  = (int)lp.iruw("itrs", irvc(int ), (int)521);
                if (var2) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)lp.iruw("itrt", irvc(int ), (int)522);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)lp.iruw("itru", irvc(int ), (int)523);
        ** while (!var2)
lbl50:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void begin(class_4587 var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lp.qg - lp.iruw("isjo", irus(int ), (int)108)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == lp.iruw("isjq", irvc(int ), (int)92)) break;
            v0 /* !! */  = (long)lp.iruw("isjr", irvc(int ), (int)93);
        }
        var3_1 = lp.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = lp.qg - lp.iruw("isjt", irus(int ), (int)109)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == lp.iruw("isju", irvc(int ), (int)94)) break;
            v1 /* !! */  = (long)lp.iruw("isjw", irvc(int ), (int)95);
        }
        var2_2 /* !! */  = lp.b;
        v2 /* !! */  = lp.qg;
        if (true) ** GOTO lbl17
        block14: while (true) {
            v2 /* !! */  = (long)(lp.iruw("isjz", irus(int ), (int)111) - lp.iruw("isjx", irus(int ), (int)110));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -72341717: {
                    continue block14;
                }
                case 958278509: {
                    break block14;
                }
            }
            break;
        }
        var1_3 = lp.a;
        if (var3_1) {
            throw null;
lbl25:
            // 3 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl25
        v3 = lp.iruw("iskd", irvc(int ), (int)96);
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = lp.qg - lp.iruw("iskf", irus(int ), (int)112)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == lp.iruw("iskg", irvc(int ), (int)97)) break;
            v4 /* !! */  = (long)lp.iruw("iskh", irvc(int ), (int)98);
        }
        lp.begin(var0, (boolean)v3);
        if (var1_3) ** GOTO lbl25
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                return;
            }
lbl42:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)lp.iruw("iskj", irvc(int ), (int)99);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)lp.iruw("iskk", irvc(int ), (int)100);
                if (!var3_1) ** GOTO lbl42
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)lp.iruw("iskn", irvc(int ), (int)101);
                    if (!var3_1) break block4;
                    throw null;
                }
            }
            case 3: {
                var2_2 /* !! */  = (int)lp.iruw("isko", irvc(int ), (int)102);
                if (var3_1) {
                    throw null;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)lp.iruw("iskq", irvc(int ), (int)103);
                if (!var3_1) ** GOTO lbl42
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)lp.iruw("isks", irvc(int ), (int)104);
        ** while (!var3_1)
lbl66:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void itte() {
        lp.irve[200] = -781722594;
        lp.irve[201] = 1364975631;
        lp.irve[202] = -747815094;
        lp.irve[203] = -199132656;
        lp.irve[204] = 162931243;
        lp.irve[205] = -1211368032;
        lp.irve[206] = -1835054389;
        lp.irve[207] = 408721774;
        lp.irve[208] = 1124728406;
        lp.irve[209] = -1118290204;
        lp.irve[210] = 1470533108;
        lp.irve[211] = 372472335;
        lp.irve[212] = 1960081368;
        lp.irve[213] = 1574516102;
        lp.irve[214] = 881243996;
        lp.irve[215] = -2032926352;
        lp.irve[216] = 1133875235;
        lp.irve[217] = 1268673809;
        lp.irve[218] = -492416107;
        lp.irve[219] = -518826870;
        lp.irve[220] = -1086446282;
        lp.irve[221] = 1843609778;
        lp.irve[222] = -1689523807;
        lp.irve[223] = -516739790;
        lp.irve[224] = 1293755699;
        lp.irve[225] = 2073348418;
        lp.irve[226] = -1251218779;
        lp.irve[227] = -790847038;
        lp.irve[228] = -533469394;
        lp.irve[229] = 2054825860;
        lp.irve[230] = 1798924508;
        lp.irve[231] = -351452423;
        lp.irve[232] = -734610105;
        lp.irve[233] = -2078232918;
        lp.irve[234] = -1969829426;
        lp.irve[235] = 471708703;
        lp.irve[236] = 373036026;
        lp.irve[237] = 671200030;
        lp.irve[238] = -878516288;
        lp.irve[239] = 383197548;
        lp.irve[240] = 1131262645;
        lp.irve[241] = -1653603970;
        lp.irve[242] = -1687005586;
        lp.irve[243] = -2030094166;
        lp.irve[244] = 1597305258;
        lp.irve[245] = -2076753433;
        lp.irve[246] = -842285321;
        lp.irve[247] = 1444448281;
        lp.irve[248] = 546568422;
        lp.irve[249] = -2135438475;
        lp.irve[250] = -1967552744;
        lp.irve[251] = -359700590;
        lp.irve[252] = 1458265250;
        lp.irve[253] = -1544705014;
        lp.irve[254] = 187840412;
        lp.irve[255] = -764817426;
        lp.irve[256] = -628315431;
        lp.irve[257] = 1635379279;
        lp.irve[258] = 641488403;
        lp.irve[259] = -619527000;
        lp.irve[260] = 175095322;
        lp.irve[261] = 833697784;
        lp.irve[262] = 352953793;
        lp.irve[263] = -2042612800;
        lp.irve[264] = 929687966;
        lp.irve[265] = -1004289461;
        lp.irve[266] = 735118297;
        lp.irve[267] = -1837338654;
        lp.irve[268] = 463688349;
        lp.irve[269] = 2084937442;
        lp.irve[270] = -34778389;
        lp.irve[271] = -892688185;
        lp.irve[272] = -1141372196;
        lp.irve[273] = 2115509935;
        lp.irve[274] = -1589958246;
        lp.irve[275] = 108004827;
        lp.irve[276] = -977813366;
        lp.irve[277] = -1070587584;
        lp.irve[278] = -1642710895;
        lp.irve[279] = -1772009696;
        lp.irve[280] = -1357899955;
        lp.irve[281] = -613025213;
        lp.irve[282] = -638411850;
        lp.irve[283] = -613478319;
        lp.irve[284] = -258277738;
        lp.irve[285] = -608195764;
        lp.irve[286] = 832408224;
        lp.irve[287] = 1430864458;
        lp.irve[288] = -1941202628;
        lp.irve[289] = 1596880342;
        lp.irve[290] = -118219705;
        lp.irve[291] = -1189869914;
        lp.irve[292] = -2037806520;
        lp.irve[293] = 1497696647;
        lp.irve[294] = -1751772678;
        lp.irve[295] = -53513814;
        lp.irve[296] = -755778802;
        lp.irve[297] = -767831368;
        lp.irve[298] = -1744446059;
        lp.irve[299] = 1568464481;
    }

    private static /* synthetic */ void ittg() {
        lp.irve[400] = 866076222;
        lp.irve[401] = 418611404;
        lp.irve[402] = -1774738640;
        lp.irve[403] = -1073752481;
        lp.irve[404] = -670977575;
        lp.irve[405] = -837661990;
        lp.irve[406] = 339803255;
        lp.irve[407] = 750655864;
        lp.irve[408] = -255965040;
        lp.irve[409] = -1120421388;
        lp.irve[410] = -368045610;
        lp.irve[411] = 871632569;
        lp.irve[412] = 481145170;
        lp.irve[413] = -899932709;
        lp.irve[414] = -390188507;
        lp.irve[415] = -340160390;
        lp.irve[416] = 2106141291;
        lp.irve[417] = 42795143;
        lp.irve[418] = -1453038086;
        lp.irve[419] = -1464245501;
        lp.irve[420] = 1525062168;
        lp.irve[421] = 412429610;
        lp.irve[422] = -2036071329;
        lp.irve[423] = 551697710;
        lp.irve[424] = 613192798;
        lp.irve[425] = 393192303;
        lp.irve[426] = 416767684;
        lp.irve[427] = 596457291;
        lp.irve[428] = 1419799063;
        lp.irve[429] = 1340078850;
        lp.irve[430] = 2131540023;
        lp.irve[431] = 576832579;
        lp.irve[432] = 1874695500;
        lp.irve[433] = 590281556;
        lp.irve[434] = 39648209;
        lp.irve[435] = 1880987903;
        lp.irve[436] = 1646728906;
        lp.irve[437] = -1481479265;
        lp.irve[438] = 1683154547;
        lp.irve[439] = -605477366;
        lp.irve[440] = -482830097;
        lp.irve[441] = -1733075160;
        lp.irve[442] = 858691506;
        lp.irve[443] = 2135394164;
        lp.irve[444] = -1807324220;
        lp.irve[445] = 1924563395;
        lp.irve[446] = -887308785;
        lp.irve[447] = -1405415687;
        lp.irve[448] = -881283504;
        lp.irve[449] = -1419892580;
        lp.irve[450] = -1455959445;
        lp.irve[451] = -953824157;
        lp.irve[452] = -2019748167;
        lp.irve[453] = -25184212;
        lp.irve[454] = 1854287548;
        lp.irve[455] = 125597568;
        lp.irve[456] = -1260179974;
        lp.irve[457] = 1756457057;
        lp.irve[458] = 592544548;
        lp.irve[459] = 664643552;
        lp.irve[460] = -2052600840;
        lp.irve[461] = 1217103735;
        lp.irve[462] = 1619535883;
        lp.irve[463] = -1267171093;
        lp.irve[464] = -972034879;
        lp.irve[465] = 861967331;
        lp.irve[466] = -668066119;
        lp.irve[467] = -544058355;
        lp.irve[468] = -1817625199;
        lp.irve[469] = -953298335;
        lp.irve[470] = -450407619;
        lp.irve[471] = 1979695795;
        lp.irve[472] = -1463435318;
        lp.irve[473] = -1277371052;
        lp.irve[474] = -147276354;
        lp.irve[475] = -303517307;
        lp.irve[476] = -995817143;
        lp.irve[477] = 1747626963;
        lp.irve[478] = 390829707;
        lp.irve[479] = 39252419;
        lp.irve[480] = -1142409234;
        lp.irve[481] = -1522284308;
        lp.irve[482] = -442004144;
        lp.irve[483] = -942738203;
        lp.irve[484] = -76772080;
        lp.irve[485] = -358969402;
        lp.irve[486] = -1218696995;
        lp.irve[487] = -2009943161;
        lp.irve[488] = -1767075731;
        lp.irve[489] = 2115640162;
        lp.irve[490] = 843611994;
        lp.irve[491] = -188221079;
        lp.irve[492] = -1039186988;
        lp.irve[493] = 1094748471;
        lp.irve[494] = -672889904;
        lp.irve[495] = 1256443546;
        lp.irve[496] = 1980140197;
        lp.irve[497] = -1865641221;
        lp.irve[498] = -1876520390;
        lp.irve[499] = -1069835724;
    }

    private static /* synthetic */ void ittb() {
        lp.irvd[500] = 1218167301;
        lp.irvd[501] = -1624416834;
        lp.irvd[502] = -538527668;
        lp.irvd[503] = -2100126256;
        lp.irvd[504] = -193997729;
        lp.irvd[505] = -1846960805;
        lp.irvd[506] = 0xDDEEE55;
        lp.irvd[507] = -367889465;
        lp.irvd[508] = 197018554;
        lp.irvd[509] = -67550075;
        lp.irvd[510] = -1527188428;
        lp.irvd[511] = 1640738032;
        lp.irvd[512] = 820537617;
        lp.irvd[513] = -586340918;
        lp.irvd[514] = -1878386411;
        lp.irvd[515] = -717653724;
        lp.irvd[516] = -769624654;
        lp.irvd[517] = -1734035036;
        lp.irvd[518] = 1781815564;
        lp.irvd[519] = 1675107024;
        lp.irvd[520] = -1563692601;
        lp.irvd[521] = -1261795001;
        lp.irvd[522] = -1677275383;
        lp.irvd[523] = 1324140251;
        lp.irvd[524] = 1484681262;
        lp.irvd[525] = 1228121546;
        lp.irvd[526] = -881079897;
        lp.irvd[527] = 1741652461;
        lp.irvd[528] = 481501575;
        lp.irvd[529] = 1785911441;
        lp.irvd[530] = -892408190;
        lp.irvd[531] = -2108493276;
        lp.irvd[532] = 1665064709;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void setMatrices(Matrix4f var0, Matrix4f var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lp.qg - lp.iruw("isfl", irus(int ), (int)78)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == lp.iruw("isfm", irvc(int ), (int)66)) break;
            v0 /* !! */  = (long)lp.iruw("isfo", irvc(int ), (int)67);
        }
        var4_2 = lp.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = lp.qg - lp.iruw("isfq", irus(int ), (int)79)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == lp.iruw("isfr", irvc(int ), (int)68)) break;
            v1 /* !! */  = (long)lp.iruw("isft", irvc(int ), (int)69);
        }
        var3_3 /* !! */  = lp.b;
        v2 /* !! */  = lp.qg;
        if (true) ** GOTO lbl19
        block38: while (true) {
            v2 /* !! */  = (long)(v3 - lp.iruw("isfv", irus(int ), (int)80));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -936698575: {
                    v3 = lp.iruw("isfw", irus(int ), (int)81);
                    continue block38;
                }
                case 681579603: {
                    v3 = lp.iruw("isfy", irus(int ), (int)82);
                    continue block38;
                }
                case 958278509: {
                    break block38;
                }
            }
            break;
        }
        var2_4 = lp.a;
        if (var4_2) {
            throw null;
lbl31:
            // 4 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl31
        v4 /* !! */  = lp.qg;
        if (true) ** GOTO lbl38
        block40: while (true) {
            v4 /* !! */  = (long)(v5 - lp.iruw("isgb", irus(int ), (int)83));
lbl38:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1314476608: {
                    v5 = lp.iruw("isgd", irus(int ), (int)84);
                    continue block40;
                }
                case 958278509: {
                    break block40;
                }
                case 1948942850: {
                    v5 = lp.iruw("isgf", irus(int ), (int)85);
                    continue block40;
                }
                case 1995993979: {
                    v5 = lp.iruw("isgg", irus(int ), (int)86);
                    continue block40;
                }
            }
            break;
        }
        v6 /* !! */  = lp.qg;
        if (true) ** GOTO lbl54
        block41: while (true) {
            v6 /* !! */  = (long)(v7 - lp.iruw("isgh", irus(int ), (int)87));
lbl54:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -607402930: {
                    v7 = lp.iruw("isgi", irus(int ), (int)88);
                    continue block41;
                }
                case 958278509: {
                    break block41;
                }
                case 1471712064: {
                    v7 = lp.iruw("isgj", irus(int ), (int)89);
                    continue block41;
                }
            }
            break;
        }
        lp.projectionMatrix.set((Matrix4fc)var0);
        if (var2_4 || var2_4) ** GOTO lbl31
        v8 /* !! */  = lp.qg;
        if (true) ** GOTO lbl70
        block42: while (true) {
            v8 /* !! */  = (long)(v9 - lp.iruw("isgl", irus(int ), (int)90));
lbl70:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -240749074: {
                    v9 = lp.iruw("isgn", irus(int ), (int)91);
                    continue block42;
                }
                case 32055903: {
                    v9 = lp.iruw("isgp", irus(int ), (int)92);
                    continue block42;
                }
                case 958278509: {
                    break block42;
                }
                case 1990970168: {
                    v9 = lp.iruw("isgr", irus(int ), (int)93);
                    continue block42;
                }
            }
            break;
        }
        v10 /* !! */  = lp.qg;
        if (true) ** GOTO lbl86
        block43: while (true) {
            v10 /* !! */  = (long)(lp.iruw("isgx", irus(int ), (int)95) - lp.iruw("isgu", irus(int ), (int)94));
lbl86:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1904411101: {
                    continue block43;
                }
                case 958278509: {
                    break block43;
                }
            }
            break;
        }
        lp.viewMatrix.set((Matrix4fc)var1_1);
        if (var2_4) ** GOTO lbl31
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
lbl100:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)lp.iruw("ishb", irvc(int ), (int)70);
                if (!var4_2) break;
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)lp.iruw("ishe", irvc(int ), (int)71);
                if (!var4_2) ** GOTO lbl100
                throw null;
            }
lbl108:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)lp.iruw("ishh", irvc(int ), (int)72);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl127
            }
lbl113:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)lp.iruw("ishi", irvc(int ), (int)73);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 4: {
                var3_3 /* !! */  = (int)lp.iruw("ishk", irvc(int ), (int)74);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl127
            }
            case 5: {
                var3_3 /* !! */  = (int)lp.iruw("ishm", irvc(int ), (int)75);
                if (!var4_2) ** GOTO lbl108
                throw null;
            }
lbl127:
            // 3 sources

            case 6: {
                var3_3 /* !! */  = (int)lp.iruw("ishn", irvc(int ), (int)76);
                if (!var4_2) ** GOTO lbl113
                throw null;
            }
            case 7: 
        }
        var3_3 /* !! */  = (int)lp.iruw("ishp", irvc(int ), (int)77);
        ** while (!var4_2)
lbl134:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void itsw() {
        lp.irvd[0] = -481811427;
        lp.irvd[1] = -936092949;
        lp.irvd[2] = 398559194;
        lp.irvd[3] = -10651605;
        lp.irvd[4] = -654179608;
        lp.irvd[5] = 1214755939;
        lp.irvd[6] = -1784320023;
        lp.irvd[7] = -1452504344;
        lp.irvd[8] = 354674127;
        lp.irvd[9] = 7191477;
        lp.irvd[10] = 1633272648;
        lp.irvd[11] = -389165949;
        lp.irvd[12] = 2123000199;
        lp.irvd[13] = 2041652994;
        lp.irvd[14] = -274750793;
        lp.irvd[15] = -568530820;
        lp.irvd[16] = -1395174897;
        lp.irvd[17] = -1538794684;
        lp.irvd[18] = -1469190730;
        lp.irvd[19] = -1922423316;
        lp.irvd[20] = 1176700831;
        lp.irvd[21] = -1736097997;
        lp.irvd[22] = 1609172772;
        lp.irvd[23] = -1016072380;
        lp.irvd[24] = -939937875;
        lp.irvd[25] = 230587855;
        lp.irvd[26] = 423589833;
        lp.irvd[27] = -170782355;
        lp.irvd[28] = 1726636663;
        lp.irvd[29] = 701486858;
        lp.irvd[30] = 430937077;
        lp.irvd[31] = 1052250757;
        lp.irvd[32] = -221388246;
        lp.irvd[33] = 1765215576;
        lp.irvd[34] = 1703475882;
        lp.irvd[35] = 1566567038;
        lp.irvd[36] = -1977245189;
        lp.irvd[37] = -1774151279;
        lp.irvd[38] = 1745318241;
        lp.irvd[39] = -32867286;
        lp.irvd[40] = 1746246777;
        lp.irvd[41] = 264760778;
        lp.irvd[42] = 2088275195;
        lp.irvd[43] = -1545321303;
        lp.irvd[44] = 305196620;
        lp.irvd[45] = 687165553;
        lp.irvd[46] = -411835894;
        lp.irvd[47] = 1923463004;
        lp.irvd[48] = 942427762;
        lp.irvd[49] = 482994296;
        lp.irvd[50] = 320754136;
        lp.irvd[51] = 722389547;
        lp.irvd[52] = 1312621145;
        lp.irvd[53] = 2050069699;
        lp.irvd[54] = -128654733;
        lp.irvd[55] = 1202751121;
        lp.irvd[56] = 1609170364;
        lp.irvd[57] = 1229733353;
        lp.irvd[58] = 1287388219;
        lp.irvd[59] = 1710446618;
        lp.irvd[60] = -1981566149;
        lp.irvd[61] = 1599732754;
        lp.irvd[62] = 1470489054;
        lp.irvd[63] = -307755224;
        lp.irvd[64] = 388772900;
        lp.irvd[65] = 337820603;
        lp.irvd[66] = -1613485718;
        lp.irvd[67] = -749630880;
        lp.irvd[68] = -1031460378;
        lp.irvd[69] = 1087818396;
        lp.irvd[70] = -879997888;
        lp.irvd[71] = -760829671;
        lp.irvd[72] = 1486194759;
        lp.irvd[73] = -968111572;
        lp.irvd[74] = 151768545;
        lp.irvd[75] = 341734504;
        lp.irvd[76] = -1295187898;
        lp.irvd[77] = 1449930353;
        lp.irvd[78] = 661689705;
        lp.irvd[79] = 60495950;
        lp.irvd[80] = -1783810374;
        lp.irvd[81] = -581150999;
        lp.irvd[82] = -1392714017;
        lp.irvd[83] = 1866113960;
        lp.irvd[84] = 1904026386;
        lp.irvd[85] = -1724454279;
        lp.irvd[86] = -91589671;
        lp.irvd[87] = 1743296456;
        lp.irvd[88] = -2023700351;
        lp.irvd[89] = -1164482382;
        lp.irvd[90] = 1237380429;
        lp.irvd[91] = -265456105;
        lp.irvd[92] = -2035516926;
        lp.irvd[93] = 693825440;
        lp.irvd[94] = 1245169891;
        lp.irvd[95] = -1921690903;
        lp.irvd[96] = 1293995745;
        lp.irvd[97] = -1005083757;
        lp.irvd[98] = -1849251847;
        lp.irvd[99] = -1875953493;
    }

    private static /* synthetic */ void itsx() {
        lp.irvd[100] = -644208867;
        lp.irvd[101] = 1184446228;
        lp.irvd[102] = 1739559609;
        lp.irvd[103] = -1502079176;
        lp.irvd[104] = 229376016;
        lp.irvd[105] = -183444998;
        lp.irvd[106] = 189982255;
        lp.irvd[107] = 293338344;
        lp.irvd[108] = -2145564686;
        lp.irvd[109] = 2102765835;
        lp.irvd[110] = -869432250;
        lp.irvd[111] = -93595710;
        lp.irvd[112] = 985055072;
        lp.irvd[113] = -99761272;
        lp.irvd[114] = -1130435612;
        lp.irvd[115] = -474279620;
        lp.irvd[116] = -6971008;
        lp.irvd[117] = -1494020726;
        lp.irvd[118] = 388165586;
        lp.irvd[119] = 71619141;
        lp.irvd[120] = -1799727742;
        lp.irvd[121] = 1263437967;
        lp.irvd[122] = 497068021;
        lp.irvd[123] = -1610970327;
        lp.irvd[124] = 1208535406;
        lp.irvd[125] = -227273579;
        lp.irvd[126] = 1718723766;
        lp.irvd[127] = 1891541134;
        lp.irvd[128] = -1045469347;
        lp.irvd[129] = 2021066692;
        lp.irvd[130] = 38035872;
        lp.irvd[131] = -2055707661;
        lp.irvd[132] = -859690348;
        lp.irvd[133] = -362792240;
        lp.irvd[134] = 137070522;
        lp.irvd[135] = 1573730661;
        lp.irvd[136] = 305819023;
        lp.irvd[137] = 366301558;
        lp.irvd[138] = 1960619213;
        lp.irvd[139] = 1340054383;
        lp.irvd[140] = 2050282468;
        lp.irvd[141] = 535486469;
        lp.irvd[142] = -1393677943;
        lp.irvd[143] = 355978787;
        lp.irvd[144] = -377948225;
        lp.irvd[145] = 1210304203;
        lp.irvd[146] = -585660566;
        lp.irvd[147] = 1914107974;
        lp.irvd[148] = 219654484;
        lp.irvd[149] = -1128814552;
        lp.irvd[150] = 996790718;
        lp.irvd[151] = -834601575;
        lp.irvd[152] = 445363174;
        lp.irvd[153] = 1642014539;
        lp.irvd[154] = 2083875651;
        lp.irvd[155] = -121464956;
        lp.irvd[156] = 810659931;
        lp.irvd[157] = 550813858;
        lp.irvd[158] = -1703375325;
        lp.irvd[159] = -1395417986;
        lp.irvd[160] = -1482140562;
        lp.irvd[161] = -1797570684;
        lp.irvd[162] = -1289876613;
        lp.irvd[163] = 193428781;
        lp.irvd[164] = -969556093;
        lp.irvd[165] = 53043409;
        lp.irvd[166] = -2113373547;
        lp.irvd[167] = -796824909;
        lp.irvd[168] = -2132017127;
        lp.irvd[169] = -406052191;
        lp.irvd[170] = -1652316097;
        lp.irvd[171] = -876890951;
        lp.irvd[172] = 572178641;
        lp.irvd[173] = 1584453163;
        lp.irvd[174] = -128768699;
        lp.irvd[175] = -443008191;
        lp.irvd[176] = 1570755276;
        lp.irvd[177] = -1383075324;
        lp.irvd[178] = -1538607329;
        lp.irvd[179] = -176217049;
        lp.irvd[180] = -1581551224;
        lp.irvd[181] = -1182756153;
        lp.irvd[182] = 1085447706;
        lp.irvd[183] = -1355893625;
        lp.irvd[184] = 369511690;
        lp.irvd[185] = 1825319268;
        lp.irvd[186] = 1629547283;
        lp.irvd[187] = 1030846527;
        lp.irvd[188] = 190099944;
        lp.irvd[189] = 2006064866;
        lp.irvd[190] = -2135404538;
        lp.irvd[191] = -538832240;
        lp.irvd[192] = -1338809497;
        lp.irvd[193] = 1083929038;
        lp.irvd[194] = -1856166207;
        lp.irvd[195] = -510761501;
        lp.irvd[196] = -1822426624;
        lp.irvd[197] = -616723216;
        lp.irvd[198] = -766993019;
        lp.irvd[199] = 955576008;
    }

    private static /* synthetic */ void itto() {
        lp.iruv[200] = -8594982479560750361L;
        lp.iruv[201] = -4404113416720858404L;
        lp.iruv[202] = -5852504488882934777L;
        lp.iruv[203] = -6487382435165777751L;
        lp.iruv[204] = 813386763946503291L;
        lp.iruv[205] = 4205543096632312108L;
        lp.iruv[206] = -7838901532646097559L;
        lp.iruv[207] = -4161086866373929438L;
        lp.iruv[208] = -7003786107107145406L;
        lp.iruv[209] = 1320709844028906220L;
        lp.iruv[210] = 1045181227652862363L;
        lp.iruv[211] = -1718479952392124796L;
        lp.iruv[212] = 1592282893415637491L;
        lp.iruv[213] = -4310995653394392041L;
        lp.iruv[214] = -8698685213914306872L;
        lp.iruv[215] = -7890000118322470246L;
        lp.iruv[216] = 2501420579116382400L;
        lp.iruv[217] = 2744114121981888798L;
        lp.iruv[218] = -7404811925798015734L;
        lp.iruv[219] = 7928914844457441859L;
        lp.iruv[220] = -4683324509244475024L;
        lp.iruv[221] = -7802190400016581640L;
        lp.iruv[222] = 8016389020704108566L;
        lp.iruv[223] = -2076299310303517972L;
        lp.iruv[224] = -3039564660945304451L;
        lp.iruv[225] = -7693904587369209138L;
        lp.iruv[226] = 2428982858144145788L;
        lp.iruv[227] = 1901031044281660970L;
        lp.iruv[228] = 4823897274002594422L;
        lp.iruv[229] = -3423483318961987468L;
        lp.iruv[230] = 7200129419774321857L;
        lp.iruv[231] = 3869492570199355810L;
        lp.iruv[232] = 2220446560700127441L;
        lp.iruv[233] = 2284388691342075371L;
        lp.iruv[234] = 466711618507481493L;
        lp.iruv[235] = -2868292125881139759L;
        lp.iruv[236] = 3688731971229433376L;
        lp.iruv[237] = -2288988122683295348L;
        lp.iruv[238] = -7346514460689946183L;
        lp.iruv[239] = 7925496032309820699L;
        lp.iruv[240] = 8270705487499792331L;
        lp.iruv[241] = 4367620681802358942L;
        lp.iruv[242] = 1732331080888334175L;
        lp.iruv[243] = 8084764746086849818L;
        lp.iruv[244] = 1545932363261224798L;
        lp.iruv[245] = 6936913737133589927L;
        lp.iruv[246] = 986883962178238540L;
        lp.iruv[247] = 329587946615188123L;
        lp.iruv[248] = 5637534152417175062L;
        lp.iruv[249] = 6895339085308676840L;
        lp.iruv[250] = 5307014375977269773L;
        lp.iruv[251] = -6325428995377678398L;
        lp.iruv[252] = 5549968055964291378L;
        lp.iruv[253] = -6159447954427703676L;
        lp.iruv[254] = -6160793658717164332L;
        lp.iruv[255] = -2756804177936815435L;
        lp.iruv[256] = 9051044960445907716L;
        lp.iruv[257] = -1370195859113072453L;
        lp.iruv[258] = 1750297018344277479L;
        lp.iruv[259] = -1935814962580269100L;
        lp.iruv[260] = -1034375569175415160L;
        lp.iruv[261] = -5755591165219333725L;
        lp.iruv[262] = -5333609204219832143L;
        lp.iruv[263] = 3484191941851288534L;
        lp.iruv[264] = 10628311075362359L;
        lp.iruv[265] = 3663913716185334992L;
        lp.iruv[266] = -1631438662988505767L;
        lp.iruv[267] = -1427342024472833585L;
        lp.iruv[268] = 9123725924055833117L;
        lp.iruv[269] = 3066661392449356951L;
        lp.iruv[270] = 3541523595660154288L;
        lp.iruv[271] = 2638693480393385362L;
        lp.iruv[272] = -9048804197877771929L;
        lp.iruv[273] = 5420844677950230813L;
        lp.iruv[274] = 1504625798256107087L;
        lp.iruv[275] = 4283499873685416377L;
        lp.iruv[276] = -404050801201533067L;
        lp.iruv[277] = -1967227066648769602L;
        lp.iruv[278] = 3961741349734070038L;
        lp.iruv[279] = -7153107890058015199L;
        lp.iruv[280] = -4798492927001553710L;
        lp.iruv[281] = -4144226135585399080L;
        lp.iruv[282] = -1492521016697613022L;
        lp.iruv[283] = 5638264623143575420L;
        lp.iruv[284] = 6747001006295568404L;
        lp.iruv[285] = 946881778010397809L;
        lp.iruv[286] = 2606858388633100113L;
        lp.iruv[287] = 8741653486402153772L;
        lp.iruv[288] = -3719665326117464664L;
        lp.iruv[289] = -7333333629825564947L;
        lp.iruv[290] = -2354026922630247393L;
        lp.iruv[291] = 3497583741110289406L;
        lp.iruv[292] = -622307975301426324L;
        lp.iruv[293] = -76473248766155955L;
        lp.iruv[294] = 6307876435989305323L;
        lp.iruv[295] = 8020529386141245501L;
        lp.iruv[296] = 4594700735078411240L;
        lp.iruv[297] = 7124382200286210753L;
        lp.iruv[298] = -1712910179617224439L;
        lp.iruv[299] = -3877864343555038182L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$init$0() {
        v0 /* !! */  = lp.qg;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(lp.iruw("itsj", irus(int ), (int)297) - lp.iruw("itsi", irus(int ), (int)296));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -776383202: {
                    continue block21;
                }
                case 958278509: {
                    break block21;
                }
            }
            break;
        }
        var2 = lp.c;
        v1 /* !! */  = lp.qg;
        if (true) ** GOTO lbl15
        block22: while (true) {
            v1 /* !! */  = (long)(v2 - lp.iruw("itsk", irus(int ), (int)298));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1135547839: {
                    v2 = lp.iruw("itsl", irus(int ), (int)299);
                    continue block22;
                }
                case 958278509: {
                    break block22;
                }
                case 1268911440: {
                    v2 = lp.iruw("itsm", irus(int ), (int)300);
                    continue block22;
                }
            }
            break;
        }
        var1_1 /* !! */  = lp.b;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = lp.qg;
                if (true) ** GOTO lbl32
                block23: while (true) {
                    v3 /* !! */  = (long)(v4 - lp.iruw("itsn", irus(int ), (int)301));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -2038323527: {
                            v4 = lp.iruw("itso", irus(int ), (int)302);
                            continue block23;
                        }
                        case 749759148: {
                            v4 = lp.iruw("itsp", irus(int ), (int)303);
                            continue block23;
                        }
                        case 860311053: {
                            v4 = lp.iruw("itsq", irus(int ), (int)304);
                            continue block23;
                        }
                        case 958278509: {
                            break block23;
                        }
                    }
                    break;
                }
                var0_2 = lp.a;
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                return "Render3D Uniforms";
            }
            case 0: {
                var1_1 /* !! */  = (int)lp.iruw("itsr", irvc(int ), (int)528);
                if (!var2) break;
                throw null;
            }
            case 1: {
                var1_1 /* !! */  = (int)lp.iruw("itss", irvc(int ), (int)529);
                if (var2) {
                    throw null;
                }
            }
            case 2: {
                do {
                    var1_1 /* !! */  = (int)lp.iruw("itst", irvc(int ), (int)530);
                } while (!var2);
                throw null;
            }
            case 3: 
        }
        do {
            var1_1 /* !! */  = (int)lp.iruw("itsu", irvc(int ), (int)531);
        } while (!var2);
        throw null;
    }

    private static /* synthetic */ void ittf() {
        lp.irve[300] = -1405030788;
        lp.irve[301] = -1083364044;
        lp.irve[302] = -939108622;
        lp.irve[303] = 922446087;
        lp.irve[304] = 524662198;
        lp.irve[305] = 1594588990;
        lp.irve[306] = 1092211871;
        lp.irve[307] = -1337513046;
        lp.irve[308] = 1368168929;
        lp.irve[309] = 1676640472;
        lp.irve[310] = 235772881;
        lp.irve[311] = 1264394510;
        lp.irve[312] = -1850221671;
        lp.irve[313] = -4206127;
        lp.irve[314] = 851289941;
        lp.irve[315] = -1212731441;
        lp.irve[316] = 865707112;
        lp.irve[317] = -2060958777;
        lp.irve[318] = 1786924032;
        lp.irve[319] = 572624476;
        lp.irve[320] = -709348738;
        lp.irve[321] = -1481572429;
        lp.irve[322] = 1757214248;
        lp.irve[323] = 147918837;
        lp.irve[324] = -845358937;
        lp.irve[325] = 1947965470;
        lp.irve[326] = -13498602;
        lp.irve[327] = 2091471353;
        lp.irve[328] = -220456797;
        lp.irve[329] = -654691270;
        lp.irve[330] = -1079565424;
        lp.irve[331] = -2063868608;
        lp.irve[332] = 591118823;
        lp.irve[333] = 1462182845;
        lp.irve[334] = 1496809316;
        lp.irve[335] = 730423441;
        lp.irve[336] = 2004582804;
        lp.irve[337] = -474740455;
        lp.irve[338] = -744213977;
        lp.irve[339] = 1434348192;
        lp.irve[340] = 17598544;
        lp.irve[341] = -376991646;
        lp.irve[342] = -365339664;
        lp.irve[343] = 1783960129;
        lp.irve[344] = -1532547142;
        lp.irve[345] = 1639057535;
        lp.irve[346] = 156813623;
        lp.irve[347] = -1674550455;
        lp.irve[348] = -1897777709;
        lp.irve[349] = -1875026928;
        lp.irve[350] = 1166827648;
        lp.irve[351] = -621980594;
        lp.irve[352] = -1055799691;
        lp.irve[353] = 1302987177;
        lp.irve[354] = -2143285041;
        lp.irve[355] = -719860334;
        lp.irve[356] = -1035173336;
        lp.irve[357] = -1543348523;
        lp.irve[358] = 1940427352;
        lp.irve[359] = 406613420;
        lp.irve[360] = 1477939195;
        lp.irve[361] = 1335023452;
        lp.irve[362] = -376897928;
        lp.irve[363] = -1770032025;
        lp.irve[364] = 1088518295;
        lp.irve[365] = -730002232;
        lp.irve[366] = 1000698600;
        lp.irve[367] = -503515159;
        lp.irve[368] = 552017552;
        lp.irve[369] = -658435546;
        lp.irve[370] = -1629473745;
        lp.irve[371] = -1340815337;
        lp.irve[372] = -268474370;
        lp.irve[373] = -1967155191;
        lp.irve[374] = -941489320;
        lp.irve[375] = 1275503672;
        lp.irve[376] = -914395828;
        lp.irve[377] = 719606995;
        lp.irve[378] = -1190815003;
        lp.irve[379] = -1620465960;
        lp.irve[380] = 3293519;
        lp.irve[381] = -195547849;
        lp.irve[382] = -1203140861;
        lp.irve[383] = -1705767954;
        lp.irve[384] = 343713434;
        lp.irve[385] = 9363705;
        lp.irve[386] = -1198863106;
        lp.irve[387] = -1430866623;
        lp.irve[388] = -2089400817;
        lp.irve[389] = -998490120;
        lp.irve[390] = -830597642;
        lp.irve[391] = -591261434;
        lp.irve[392] = 273103545;
        lp.irve[393] = 410594157;
        lp.irve[394] = 1862553811;
        lp.irve[395] = 1398818510;
        lp.irve[396] = -290322727;
        lp.irve[397] = -1918834827;
        lp.irve[398] = 1020460918;
        lp.irve[399] = 1378537118;
    }

    static {
        irvd = new int[533];
        irve = new int[533];
        lp.itsw();
        lp.itsx();
        lp.itsy();
        lp.itsz();
        lp.itta();
        lp.ittb();
        lp.ittc();
        lp.ittd();
        lp.itte();
        lp.ittf();
        lp.ittg();
        lp.itth();
        iruu = new long[305];
        iruv = new long[305];
        lp.itti();
        lp.ittj();
        lp.ittk();
        lp.ittl();
        lp.ittm();
        lp.ittn();
        lp.itto();
        lp.ittp();
        mc = class_310.method_1551();
        vertices = new float[28672];
        combinedMatrix = new Matrix4f();
        identityMatrix = new Matrix4f();
        ignoreDepth = lp.iruw("itsv", irvc(int ), (int)532);
        projectionMatrix = new Matrix4f();
        viewMatrix = new Matrix4f();
    }

    private static /* synthetic */ void ittl() {
        lp.iruu[300] = -3909289205090811785L;
        lp.iruu[301] = 910438860826548931L;
        lp.iruu[302] = 3046211648736771706L;
        lp.iruu[303] = -1638838854254635431L;
        lp.iruu[304] = 5955698013591060178L;
    }

    private static /* synthetic */ void itsz() {
        lp.irvd[300] = -1405030830;
        lp.irvd[301] = -1083364072;
        lp.irvd[302] = -939108686;
        lp.irvd[303] = 922446095;
        lp.irvd[304] = 524662162;
        lp.irvd[305] = 1594588948;
        lp.irvd[306] = 1092211849;
        lp.irvd[307] = -1337512990;
        lp.irvd[308] = 1368168917;
        lp.irvd[309] = 1676640490;
        lp.irvd[310] = 235772876;
        lp.irvd[311] = 1264394567;
        lp.irvd[312] = -1850221672;
        lp.irvd[313] = 84036923;
        lp.irvd[314] = 851289940;
        lp.irvd[315] = -1790963284;
        lp.irvd[316] = 865707113;
        lp.irvd[317] = 291002754;
        lp.irvd[318] = -1786924033;
        lp.irvd[319] = -1583763756;
        lp.irvd[320] = -709348737;
        lp.irvd[321] = -1481572430;
        lp.irvd[322] = 1757214250;
        lp.irvd[323] = 147918837;
        lp.irvd[324] = -845358943;
        lp.irvd[325] = 1947965464;
        lp.irvd[326] = -13498603;
        lp.irvd[327] = 2091471353;
        lp.irvd[328] = -220456798;
        lp.irvd[329] = -751704716;
        lp.irvd[330] = -1079561328;
        lp.irvd[331] = -2063868607;
        lp.irvd[332] = 591118822;
        lp.irvd[333] = -1109677694;
        lp.irvd[334] = 1496809315;
        lp.irvd[335] = -730423442;
        lp.irvd[336] = -1466329700;
        lp.irvd[337] = -474740456;
        lp.irvd[338] = -118121700;
        lp.irvd[339] = 1434348212;
        lp.irvd[340] = 17598549;
        lp.irvd[341] = -376991634;
        lp.irvd[342] = -365339678;
        lp.irvd[343] = 1783960149;
        lp.irvd[344] = -1532547143;
        lp.irvd[345] = 1639057523;
        lp.irvd[346] = 156813605;
        lp.irvd[347] = -1674550455;
        lp.irvd[348] = -1897777724;
        lp.irvd[349] = -1875026943;
        lp.irvd[350] = 1166827651;
        lp.irvd[351] = -621980599;
        lp.irvd[352] = -1055799708;
        lp.irvd[353] = 1302987192;
        lp.irvd[354] = -2143285029;
        lp.irvd[355] = -719860333;
        lp.irvd[356] = -1035173337;
        lp.irvd[357] = -1543348519;
        lp.irvd[358] = 1940427337;
        lp.irvd[359] = 406613415;
        lp.irvd[360] = 1477939186;
        lp.irvd[361] = 1335023455;
        lp.irvd[362] = -376897923;
        lp.irvd[363] = -1770032025;
        lp.irvd[364] = 1088518551;
        lp.irvd[365] = -730002231;
        lp.irvd[366] = 1000698616;
        lp.irvd[367] = -503515159;
        lp.irvd[368] = 552017559;
        lp.irvd[369] = -1682042330;
        lp.irvd[370] = -576768977;
        lp.irvd[371] = -211040233;
        lp.irvd[372] = -1400870914;
        lp.irvd[373] = -1967155191;
        lp.irvd[374] = -941489320;
        lp.irvd[375] = 1275503672;
        lp.irvd[376] = -914395895;
        lp.irvd[377] = 719607027;
        lp.irvd[378] = -1190815022;
        lp.irvd[379] = -1620465975;
        lp.irvd[380] = 3293451;
        lp.irvd[381] = -195547859;
        lp.irvd[382] = -1203140837;
        lp.irvd[383] = -1705767958;
        lp.irvd[384] = 343713457;
        lp.irvd[385] = 9363703;
        lp.irvd[386] = -1198863159;
        lp.irvd[387] = -1430866684;
        lp.irvd[388] = -2089400761;
        lp.irvd[389] = -998490161;
        lp.irvd[390] = -830597666;
        lp.irvd[391] = -591261406;
        lp.irvd[392] = 273103490;
        lp.irvd[393] = 410594117;
        lp.irvd[394] = 1862553825;
        lp.irvd[395] = 1398818541;
        lp.irvd[396] = -290322703;
        lp.irvd[397] = -1918834870;
        lp.irvd[398] = 1020460849;
        lp.irvd[399] = 1378537115;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void addVertex(float var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6) {
        block106: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = lp.qg - lp.iruw("itag", irus(int ), (int)156)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == lp.iruw("itah", irvc(int ), (int)328)) break;
                v0 /* !! */  = (long)lp.iruw("itai", irvc(int ), (int)329);
            }
            var10_7 = lp.c;
            v1 /* !! */  = lp.qg;
            if (true) ** GOTO lbl11
            block72: while (true) {
                v1 /* !! */  = (long)(v2 - lp.iruw("itaj", irus(int ), (int)157));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1361980308: {
                        v2 = lp.iruw("itak", irus(int ), (int)158);
                        continue block72;
                    }
                    case -129182663: {
                        v2 = lp.iruw("ital", irus(int ), (int)159);
                        continue block72;
                    }
                    case 428381888: {
                        v2 = lp.iruw("itam", irus(int ), (int)160);
                        continue block72;
                    }
                    case 958278509: {
                        break block72;
                    }
                }
                break;
            }
            var9_8 /* !! */  = lp.b;
            v3 /* !! */  = lp.qg;
            if (true) ** GOTO lbl28
            block73: while (true) {
                v3 /* !! */  = (long)(v4 - lp.iruw("itan", irus(int ), (int)161));
lbl28:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -2139138324: {
                        v4 = lp.iruw("itao", irus(int ), (int)162);
                        continue block73;
                    }
                    case -106142018: {
                        v4 = lp.iruw("itap", irus(int ), (int)163);
                        continue block73;
                    }
                    case 958278509: {
                        break block73;
                    }
                }
                break;
            }
            var8_9 = lp.a;
            if (var10_7) {
                throw null;
lbl40:
                // 12 sources

                return;
            }
            if (var8_9 || var8_9) ** GOTO lbl40
            v5 /* !! */  = lp.qg;
            if (true) ** GOTO lbl47
            block75: while (true) {
                v5 /* !! */  = (long)(lp.iruw("itar", irus(int ), (int)165) - lp.iruw("itaq", irus(int ), (int)164));
lbl47:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case 958278509: {
                        break block75;
                    }
                    case 1162749655: {
                        continue block75;
                    }
                }
                break;
            }
            if (lp.vertexCount < lp.iruw("itas", irvc(int ), (int)330)) break block106;
            if (var8_9) ** GOTO lbl40
            return;
        }
        if (var8_9 || var8_9) ** GOTO lbl40
        v6 /* !! */  = lp.qg;
        if (true) ** GOTO lbl61
        block76: while (true) {
            v6 /* !! */  = (long)(v7 - lp.iruw("itat", irus(int ), (int)166));
lbl61:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -69054380: {
                    v7 = lp.iruw("itau", irus(int ), (int)167);
                    continue block76;
                }
                case 929360648: {
                    v7 = lp.iruw("itav", irus(int ), (int)168);
                    continue block76;
                }
                case 958278509: {
                    break block76;
                }
            }
            break;
        }
        v8 = lp.vertexCount;
        v9 = v8 + lp.iruw("itaw", irvc(int ), (int)331);
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_1 = lp.qg - lp.iruw("itax", irus(int ), (int)169)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == lp.iruw("itay", irvc(int ), (int)332)) break;
            v10 /* !! */  = (long)lp.iruw("itaz", irvc(int ), (int)333);
        }
        lp.vertexCount = v9;
        var7_10 = v8 * lp.iruw("itba", irvc(int ), (int)334);
        if (var8_9 || var8_9) ** GOTO lbl40
        v11 /* !! */  = lp.qg;
        if (true) ** GOTO lbl84
        block78: while (true) {
            v11 /* !! */  = (long)(v12 - lp.iruw("itbb", irus(int ), (int)170));
lbl84:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -372637929: {
                    v12 = lp.iruw("itbc", irus(int ), (int)171);
                    continue block78;
                }
                case -229261338: {
                    v12 = lp.iruw("itbd", irus(int ), (int)172);
                    continue block78;
                }
                case 958278509: {
                    break block78;
                }
                case 1465253366: {
                    v12 = lp.iruw("itbe", irus(int ), (int)173);
                    continue block78;
                }
            }
            break;
        }
        lp.vertices[var7_10] = var0;
        if (var8_9 || var8_9) ** GOTO lbl40
        v13 /* !! */  = lp.qg;
        if (true) ** GOTO lbl102
        block79: while (true) {
            v13 /* !! */  = (long)(v14 - lp.iruw("itbf", irus(int ), (int)174));
lbl102:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -1980019109: {
                    v14 = lp.iruw("itbg", irus(int ), (int)175);
                    continue block79;
                }
                case -409393322: {
                    v14 = lp.iruw("itbh", irus(int ), (int)176);
                    continue block79;
                }
                case 958278509: {
                    break block79;
                }
                case 2032948622: {
                    v14 = lp.iruw("itbi", irus(int ), (int)177);
                    continue block79;
                }
            }
            break;
        }
        lp.vertices[var7_10 + 1] = var1_1;
        if (var8_9 || var8_9) ** GOTO lbl40
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_2 = lp.qg - lp.iruw("itbj", irus(int ), (int)178)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v15 /* !! */  == lp.iruw("itbk", irvc(int ), (int)335)) break;
            v15 /* !! */  = (long)lp.iruw("itbl", irvc(int ), (int)336);
        }
        lp.vertices[var7_10 + 2] = var2_2;
        if (var8_9) ** GOTO lbl40
        if (var9_8 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_8 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var8_9) ** GOTO lbl40
                v16 /* !! */  = lp.qg;
                if (true) ** GOTO lbl131
                block81: while (true) {
                    v16 /* !! */  = (long)(lp.iruw("itbn", irus(int ), (int)180) - lp.iruw("itbm", irus(int ), (int)179));
lbl131:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case 771914761: {
                            continue block81;
                        }
                        case 958278509: {
                            break block81;
                        }
                    }
                    break;
                }
                lp.vertices[var7_10 + 3] = var3_3;
                if (var8_9 || var8_9) ** GOTO lbl40
                v17 /* !! */  = lp.qg;
                if (true) ** GOTO lbl142
                block82: while (true) {
                    v17 /* !! */  = (long)(v18 - lp.iruw("itbo", irus(int ), (int)181));
lbl142:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case 223526363: {
                            v18 = lp.iruw("itbp", irus(int ), (int)182);
                            continue block82;
                        }
                        case 958278509: {
                            break block82;
                        }
                        case 1703786651: {
                            v18 = lp.iruw("itbq", irus(int ), (int)183);
                            continue block82;
                        }
                    }
                    break;
                }
                lp.vertices[var7_10 + 4] = var4_4;
                if (var8_9 || var8_9) ** GOTO lbl40
                v19 /* !! */  = lp.qg;
                if (true) ** GOTO lbl157
                block83: while (true) {
                    v19 /* !! */  = (long)(lp.iruw("itbs", irus(int ), (int)185) - lp.iruw("itbr", irus(int ), (int)184));
lbl157:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case 958278509: {
                            break block83;
                        }
                        case 1470750429: {
                            continue block83;
                        }
                    }
                    break;
                }
                lp.vertices[var7_10 + 5] = var5_5;
                if (var8_9 || var8_9) ** GOTO lbl40
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_3 = lp.qg - lp.iruw("itbt", irus(int ), (int)186)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == lp.iruw("itbu", irvc(int ), (int)337)) break;
                    v20 /* !! */  = (long)lp.iruw("itbv", irvc(int ), (int)338);
                }
                lp.vertices[var7_10 + 6] = var6_6;
                if (!var8_9 && !var8_9) ** break;
                ** continue;
                return;
            }
lbl173:
            // 3 sources

            case 0: {
                var9_8 /* !! */  = (int)lp.iruw("itbw", irvc(int ), (int)339);
                if (var10_7) {
                    throw null;
                }
                ** GOTO lbl255
            }
            case 1: {
                var9_8 /* !! */  = (int)lp.iruw("itbx", irvc(int ), (int)340);
                if (var10_7) {
                    throw null;
                }
                ** GOTO lbl217
            }
lbl183:
            // 3 sources

            case 2: {
                var9_8 /* !! */  = (int)lp.iruw("itby", irvc(int ), (int)341);
                if (var10_7) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl188:
            // 2 sources

            case 3: {
                var9_8 /* !! */  = (int)lp.iruw("itbz", irvc(int ), (int)342);
                if (!var10_7) ** GOTO lbl183
                throw null;
            }
lbl192:
            // 3 sources

            case 4: {
                var9_8 /* !! */  = (int)lp.iruw("itca", irvc(int ), (int)343);
                if (!var10_7) ** GOTO lbl188
                throw null;
            }
lbl196:
            // 2 sources

            case 5: {
                var9_8 /* !! */  = (int)lp.iruw("itcb", irvc(int ), (int)344);
                if (!var10_7) ** GOTO lbl192
                throw null;
            }
            case 6: {
                var9_8 /* !! */  = (int)lp.iruw("itcc", irvc(int ), (int)345);
                if (!var10_7) ** GOTO lbl183
                throw null;
            }
            case 7: {
                var9_8 /* !! */  = (int)lp.iruw("itcd", irvc(int ), (int)346);
                if (!var10_7) ** GOTO lbl192
                throw null;
            }
            case 8: {
                var9_8 /* !! */  = (int)lp.iruw("itce", irvc(int ), (int)347);
                if (!var10_7) ** GOTO lbl196
                throw null;
            }
lbl212:
            // 2 sources

            case 9: {
                var9_8 /* !! */  = (int)lp.iruw("itcf", irvc(int ), (int)348);
                if (var10_7) {
                    throw null;
                }
                ** GOTO lbl238
            }
lbl217:
            // 3 sources

            case 10: {
                var9_8 /* !! */  = (int)lp.iruw("itcg", irvc(int ), (int)349);
                if (var10_7) {
                    throw null;
                }
                ** GOTO lbl230
            }
lbl222:
            // 2 sources

            case 11: {
                var9_8 /* !! */  = (int)lp.iruw("itch", irvc(int ), (int)350);
                if (var10_7) {
                    throw null;
                }
            }
lbl226:
            // 4 sources

            case 12: {
                var9_8 /* !! */  = (int)lp.iruw("itci", irvc(int ), (int)351);
                if (!var10_7) ** GOTO lbl173
                throw null;
            }
lbl230:
            // 3 sources

            case 13: {
                var9_8 /* !! */  = (int)lp.iruw("itcj", irvc(int ), (int)352);
                if (!var10_7) ** GOTO lbl217
                throw null;
            }
lbl234:
            // 2 sources

            case 14: {
                var9_8 /* !! */  = (int)lp.iruw("itck", irvc(int ), (int)353);
                if (!var10_7) ** GOTO lbl173
                throw null;
            }
lbl238:
            // 2 sources

            case 15: {
                var9_8 /* !! */  = (int)lp.iruw("itcl", irvc(int ), (int)354);
                if (var10_7) {
                    throw null;
                }
                ** GOTO lbl251
            }
lbl243:
            // 2 sources

            case 16: {
                var9_8 /* !! */  = (int)lp.iruw("itcm", irvc(int ), (int)355);
                if (!var10_7) ** GOTO lbl226
                throw null;
            }
            case 17: {
                var9_8 /* !! */  = (int)lp.iruw("itcn", irvc(int ), (int)356);
                if (!var10_7) ** GOTO lbl243
                throw null;
            }
lbl251:
            // 3 sources

            case 18: {
                var9_8 /* !! */  = (int)lp.iruw("itco", irvc(int ), (int)357);
                if (!var10_7) ** GOTO lbl222
                throw null;
            }
lbl255:
            // 2 sources

            case 19: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_8 /* !! */  = (int)lp.iruw("itcp", irvc(int ), (int)358);
                    if (!var10_7) ** GOTO lbl230
                    throw null;
                }
            }
            case 20: {
                var9_8 /* !! */  = (int)lp.iruw("itcq", irvc(int ), (int)359);
                if (!var10_7) break;
                throw null;
            }
            case 21: {
                var9_8 /* !! */  = (int)lp.iruw("itcr", irvc(int ), (int)360);
                if (!var10_7) ** GOTO lbl234
                throw null;
            }
            case 22: {
                var9_8 /* !! */  = (int)lp.iruw("itcs", irvc(int ), (int)361);
                if (!var10_7) ** GOTO lbl251
                throw null;
            }
            case 23: 
        }
        var9_8 /* !! */  = (int)lp.iruw("itct", irvc(int ), (int)362);
        ** while (!var10_7)
lbl275:
        // 1 sources

        throw null;
    }
}

