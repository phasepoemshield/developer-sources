/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.BlendFunction
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Snippet
 *  com.mojang.blaze3d.platform.DepthTestFunction
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  net.minecraft.class_10789
 *  net.minecraft.class_10799
 *  net.minecraft.class_12246
 *  net.minecraft.class_12247
 *  net.minecraft.class_12247$class_12338
 *  net.minecraft.class_12247$class_4750
 *  net.minecraft.class_156
 *  net.minecraft.class_1921
 *  net.minecraft.class_290
 *  net.minecraft.class_2960
 */
package ruhack.phobia;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import net.minecraft.class_10789;
import net.minecraft.class_10799;
import net.minecraft.class_12246;
import net.minecraft.class_12247;
import net.minecraft.class_156;
import net.minecraft.class_1921;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import ruhack.phobia.on;

public class oj {
    public static final RenderPipeline CHINA_HAT_PIPELINE;
    public static final class_1921 CHINA_HAT_OUTLINE;
    private static long[] lyrm;
    public static final Function<class_2960, class_1921> SHADER_HANDS_ITEM_COLOR_HALO;
    public static final RenderPipeline WORLD_PARTICLES_LINES_PIPELINE;
    public static final RenderPipeline CHAIN_ESP_PIPELINE;
    public static final RenderPipeline CRYSTAL_FILLED_PIPELINE;
    public static final RenderPipeline CRYSTAL_GLOW_PIPELINE;
    private static long[] lyrl;
    public static final RenderPipeline CHAMS_WALL_PIPELINE;
    private static final Set<class_1921> CUSTOM_MODEL_OUTLINE_LAYERS;
    public static final Function<class_2960, class_1921> ROMB_ESP;
    public static final RenderPipeline CHAMS_PIPELINE;
    public static final Function<class_2960, class_1921> SHADER_HANDS_TRAIL_HALO;
    public static final class_1921 WORLD_PARTICLES_QUADS;
    public static final int b;
    public static final RenderPipeline WORLD_PARTICLES_COLOR_PIPELINE;
    public static final Function<class_2960, class_1921> GHOSTS_ESP;
    public static final class_1921 CRYSTAL_FILLED;
    public static final RenderPipeline SHADER_HANDS_HALO_PIPELINE;
    public static final Function<class_2960, class_1921> CHAIN_ESP;
    public static final RenderPipeline GHOSTS_ESP_PIPELINE;
    public static final RenderPipeline SHADER_HANDS_ITEMGLOW_PIPELINE;
    public static final Function<class_2960, class_1921> SHADER_HANDS_GRADIENT;
    private static int[] lyru;
    public static final Function<class_2960, class_1921> CHAMS_NORMAL_WALL;
    public static final class_1921 CRYSTAL_GLOW;
    protected static final long uv = -6303809664174720213L;
    public static final Function<class_2960, class_1921> SHADER_HANDS_TRAIL_ITEMGLOW;
    public static final Function<class_2960, class_1921> CUSTOM_MODEL_OUTLINE;
    public static final RenderPipeline CHAMS_NORMAL_WALL_PIPELINE;
    public static final Function<class_2960, class_1921> SHADER_HANDS_TRAIL_BAKED_ITEM_FILL;
    public static final RenderPipeline BLOOM_ESP_PIPELINE;
    public static final RenderPipeline SHADER_HANDS_GRADIENT_PIPELINE;
    public static final Function<class_2960, class_1921> WORLD_PARTICLES_GLOW;
    public static final RenderPipeline ROMB_ESP_PIPELINE;
    public static final class_1921 CHINA_HAT;
    public static final Function<class_2960, class_1921> CHAMS;
    public static final boolean c;
    public static final Function<class_2960, class_1921> SHADER_HANDS_ITEMGLOW;
    public static final RenderPipeline CHINA_HAT_OUTLINE_PIPELINE;
    public static final Function<class_2960, class_1921> CHAMS_WALL;
    public static final Function<class_2960, class_1921> SHADER_HANDS_BAKED_ITEM_FILL;
    public static final RenderPipeline WORLD_PARTICLES_GLOW_PIPELINE;
    private static final Map<class_1921, Optional<class_2960>> LAYER_TEXTURE_CACHE;
    public static final Function<class_2960, class_1921> SHADER_HANDS_HALO;
    public static final RenderPipeline SHADER_HANDS_BAKED_ITEM_FILL_PIPELINE;
    private static int[] lyrv;
    public static final RenderPipeline GUI_ARROW_BLEND_PIPELINE;
    public static final RenderPipeline SHADER_HANDS_ITEM_COLOR_HALO_PIPELINE;
    public static final boolean a;
    public static final Function<class_2960, class_1921> BLOOM_ESP;
    public static final class_1921 WORLD_PARTICLES_LINES;
    public static final Function<class_2960, class_1921> GUI_ARROW_BLEND;
    public static final Function<class_2960, class_1921> SHADER_HANDS_TRAIL_ITEM_COLOR_HALO;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ class_1921 lambda$static$10(class_2960 var0) {
        v0 /* !! */  = oj.uv;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - oj.lyrn("lzgv", lyrk(int ), (int)233));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1590650542: {
                    v1 = oj.lyrn("lzgw", lyrk(int ), (int)234);
                    continue block23;
                }
                case 930565523: {
                    v1 = oj.lyrn("lzgx", lyrk(int ), (int)235);
                    continue block23;
                }
                case 1798372139: {
                    break block23;
                }
            }
            break;
        }
        var4_1 = oj.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = oj.uv - oj.lyrn("lzgy", lyrk(int ), (int)236)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == oj.lyrn("lzgz", lyrt(int ), (int)161)) break;
            v2 /* !! */  = (long)oj.lyrn("lzha", lyrt(int ), (int)162);
        }
        var3_2 /* !! */  = oj.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = oj.uv - oj.lyrn("lzhb", lyrk(int ), (int)237)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == oj.lyrn("lzhc", lyrt(int ), (int)163)) break;
            v3 /* !! */  = (long)oj.lyrn("lzhd", lyrt(int ), (int)164);
        }
        var2_3 = oj.a;
        if (var4_1) {
            throw null;
lbl29:
            // 2 sources

            return null;
        }
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3 || var2_3) ** GOTO lbl29
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = oj.uv - oj.lyrn("lzhe", lyrk(int ), (int)238)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == oj.lyrn("lzhf", lyrt(int ), (int)165)) break;
                    v4 /* !! */  = (long)oj.lyrn("lzhg", lyrt(int ), (int)166);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = oj.uv - oj.lyrn("lzhh", lyrk(int ), (int)239)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == oj.lyrn("lzhi", lyrt(int ), (int)167)) break;
                    v5 /* !! */  = (long)oj.lyrn("lzhj", lyrt(int ), (int)168);
                }
                v6 = class_12247.method_75927((RenderPipeline)oj.SHADER_HANDS_ITEMGLOW_PIPELINE);
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_4 = oj.uv - oj.lyrn("lzhk", lyrk(int ), (int)240)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == oj.lyrn("lzhl", lyrt(int ), (int)169)) break;
                    v7 /* !! */  = (long)oj.lyrn("lzhm", lyrt(int ), (int)170);
                }
                v8 = v6.method_75934("Sampler0", var0);
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_5 = oj.uv - oj.lyrn("lzhn", lyrk(int ), (int)241)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == oj.lyrn("lzho", lyrt(int ), (int)171)) break;
                    v9 /* !! */  = (long)oj.lyrn("lzhp", lyrt(int ), (int)172);
                }
                v10 = v8.method_75937();
                v11 = oj.lyrn("lzhq", lyrt(int ), (int)173);
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_6 = oj.uv - oj.lyrn("lzhr", lyrk(int ), (int)242)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == oj.lyrn("lzhs", lyrt(int ), (int)174)) break;
                    v12 /* !! */  = (long)oj.lyrn("lzht", lyrt(int ), (int)175);
                }
                v13 = v10.method_75929((int)v11);
                v14 /* !! */  = oj.uv;
                if (true) ** GOTO lbl69
                block32: while (true) {
                    v14 /* !! */  = (long)(v15 - oj.lyrn("lzhu", lyrk(int ), (int)243));
lbl69:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1692963546: {
                            v15 = oj.lyrn("lzhv", lyrk(int ), (int)244);
                            continue block32;
                        }
                        case -1546984390: {
                            v15 = oj.lyrn("lzhw", lyrk(int ), (int)245);
                            continue block32;
                        }
                        case 1331498734: {
                            v15 = oj.lyrn("lzhx", lyrk(int ), (int)246);
                            continue block32;
                        }
                        case 1798372139: {
                            break block32;
                        }
                    }
                    break;
                }
                var1_4 = v13.method_75938();
                if (var2_3 || var2_3) ** continue;
                v16 /* !! */  = oj.uv;
                if (true) ** GOTO lbl87
                block33: while (true) {
                    v16 /* !! */  = (long)(oj.lyrn("lzhz", lyrk(int ), (int)248) - oj.lyrn("lzhy", lyrk(int ), (int)247));
lbl87:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1928888246: {
                            continue block33;
                        }
                        case 1798372139: {
                            break block33;
                        }
                    }
                    break;
                }
                return class_1921.method_75940((String)"shader_hands_itemglow", (class_12247)var1_4);
            }
            case 0: {
                do {
                    var3_2 /* !! */  = (int)oj.lyrn("lzia", lyrt(int ), (int)176);
                } while (!var4_1);
                throw null;
            }
            case 1: {
                do {
                    var3_2 /* !! */  = (int)oj.lyrn("lzib", lyrt(int ), (int)177);
                } while (!var4_1);
                throw null;
            }
            case 2: {
                var3_2 /* !! */  = (int)oj.lyrn("lzic", lyrt(int ), (int)178);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl113
            }
            case 3: {
                do {
                    var3_2 /* !! */  = (int)oj.lyrn("lzid", lyrt(int ), (int)179);
                } while (!var4_1);
                throw null;
            }
lbl113:
            // 2 sources

            case 4: {
                do {
                    var3_2 /* !! */  = (int)oj.lyrn("lzie", lyrt(int ), (int)180);
                } while (!var4_1);
                throw null;
            }
            case 5: 
        }
        do {
            var3_2 /* !! */  = (int)oj.lyrn("lzif", lyrt(int ), (int)181);
        } while (!var4_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ class_1921 lambda$static$18(class_2960 var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = oj.uv - oj.lyrn("lyuw", lyrk(int ), (int)51)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == oj.lyrn("lyux", lyrt(int ), (int)32)) break;
            v0 /* !! */  = (long)oj.lyrn("lyuy", lyrt(int ), (int)33);
        }
        var4_1 = oj.c;
        v1 /* !! */  = oj.uv;
        if (true) ** GOTO lbl12
        block35: while (true) {
            v1 /* !! */  = (long)(v2 - oj.lyrn("lyuz", lyrk(int ), (int)52));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2046599720: {
                    v2 = oj.lyrn("lyva", lyrk(int ), (int)53);
                    continue block35;
                }
                case 180863694: {
                    v2 = oj.lyrn("lyvb", lyrk(int ), (int)54);
                    continue block35;
                }
                case 1798372139: {
                    break block35;
                }
            }
            break;
        }
        var3_2 /* !! */  = oj.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = oj.uv - oj.lyrn("lyvc", lyrk(int ), (int)55)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == oj.lyrn("lyvd", lyrt(int ), (int)34)) break;
            v3 /* !! */  = (long)oj.lyrn("lyve", lyrt(int ), (int)35);
        }
        var2_3 = oj.a;
        if (var4_1) {
            throw null;
lbl31:
            // 3 sources

            return null;
        }
        if (var2_3) ** GOTO lbl31
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3) ** GOTO lbl31
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = oj.uv - oj.lyrn("lyvf", lyrk(int ), (int)56)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == oj.lyrn("lyvg", lyrt(int ), (int)36)) break;
                    v4 /* !! */  = (long)oj.lyrn("lyvh", lyrt(int ), (int)37);
                }
                v5 /* !! */  = oj.uv;
                if (true) ** GOTO lbl48
                block39: while (true) {
                    v5 /* !! */  = (long)(v6 - oj.lyrn("lyvi", lyrk(int ), (int)57));
lbl48:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -2040042195: {
                            v6 = oj.lyrn("lyvj", lyrk(int ), (int)58);
                            continue block39;
                        }
                        case 729022600: {
                            v6 = oj.lyrn("lyvk", lyrk(int ), (int)59);
                            continue block39;
                        }
                        case 1798372139: {
                            break block39;
                        }
                    }
                    break;
                }
                v7 = class_12247.method_75927((RenderPipeline)oj.WORLD_PARTICLES_GLOW_PIPELINE);
                v8 /* !! */  = oj.uv;
                if (true) ** GOTO lbl62
                block40: while (true) {
                    v8 /* !! */  = (long)(oj.lyrn("lyvm", lyrk(int ), (int)61) - oj.lyrn("lyvl", lyrk(int ), (int)60));
lbl62:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case 1332596209: {
                            continue block40;
                        }
                        case 1798372139: {
                            break block40;
                        }
                    }
                    break;
                }
                v9 = v7.method_75934("Sampler0", var0);
                v10 /* !! */  = oj.uv;
                if (true) ** GOTO lbl72
                block41: while (true) {
                    v10 /* !! */  = (long)(v11 - oj.lyrn("lyvn", lyrk(int ), (int)62));
lbl72:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -483575758: {
                            v11 = oj.lyrn("lyvo", lyrk(int ), (int)63);
                            continue block41;
                        }
                        case -482109772: {
                            v11 = oj.lyrn("lyvp", lyrk(int ), (int)64);
                            continue block41;
                        }
                        case 1590113627: {
                            v11 = oj.lyrn("lyvq", lyrk(int ), (int)65);
                            continue block41;
                        }
                        case 1798372139: {
                            break block41;
                        }
                    }
                    break;
                }
                v12 = v9.method_75937();
                v13 = oj.lyrn("lyvr", lyrt(int ), (int)38);
                v14 /* !! */  = oj.uv;
                if (true) ** GOTO lbl90
                block42: while (true) {
                    v14 /* !! */  = (long)(v15 - oj.lyrn("lyvs", lyrk(int ), (int)66));
lbl90:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -2038444621: {
                            v15 = oj.lyrn("lyvt", lyrk(int ), (int)67);
                            continue block42;
                        }
                        case -1920309676: {
                            v15 = oj.lyrn("lyvu", lyrk(int ), (int)68);
                            continue block42;
                        }
                        case 1181257452: {
                            v15 = oj.lyrn("lyvv", lyrk(int ), (int)69);
                            continue block42;
                        }
                        case 1798372139: {
                            break block42;
                        }
                    }
                    break;
                }
                v16 = v12.method_75929((int)v13);
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_3 = oj.uv - oj.lyrn("lyvw", lyrk(int ), (int)70)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v17 /* !! */  == oj.lyrn("lyvx", lyrt(int ), (int)39)) break;
                    v17 /* !! */  = (long)oj.lyrn("lyvy", lyrt(int ), (int)40);
                }
                var1_4 = v16.method_75938();
                if (!var2_3 && !var2_3) ** break;
                ** continue;
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_4 = oj.uv - oj.lyrn("lyvz", lyrk(int ), (int)71)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v18 /* !! */  == oj.lyrn("lywa", lyrt(int ), (int)41)) break;
                    v18 /* !! */  = (long)oj.lyrn("lywb", lyrt(int ), (int)42);
                }
                return class_1921.method_75940((String)"world_particles_glow", (class_12247)var1_4);
            }
            case 0: {
                var3_2 /* !! */  = (int)oj.lyrn("lywc", lyrt(int ), (int)43);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl124:
            // 2 sources

            case 1: {
                var3_2 /* !! */  = (int)oj.lyrn("lywd", lyrt(int ), (int)44);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl138
            }
            case 2: {
                do {
                    var3_2 /* !! */  = (int)oj.lyrn("lywe", lyrt(int ), (int)45);
                } while (!var4_1);
                throw null;
            }
lbl134:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)oj.lyrn("lywf", lyrt(int ), (int)46);
                if (!var4_1) break;
                throw null;
            }
lbl138:
            // 2 sources

            case 4: {
                var3_2 /* !! */  = (int)oj.lyrn("lywg", lyrt(int ), (int)47);
                if (!var4_1) ** GOTO lbl124
                throw null;
            }
            case 5: 
        }
        do {
            var3_2 /* !! */  = (int)oj.lyrn("lywh", lyrt(int ), (int)48);
        } while (!var4_1);
        throw null;
    }

    private static /* synthetic */ void lzzp() {
        oj.lyrm[200] = -4539428281529794862L;
        oj.lyrm[201] = 7531059598303852181L;
        oj.lyrm[202] = -7511985026588089429L;
        oj.lyrm[203] = -515857114990803788L;
        oj.lyrm[204] = -7992715048771636588L;
        oj.lyrm[205] = 5452389139417377344L;
        oj.lyrm[206] = 8505799531412714150L;
        oj.lyrm[207] = -8866787393539437840L;
        oj.lyrm[208] = -7465004774234584287L;
        oj.lyrm[209] = -1501634537501090710L;
        oj.lyrm[210] = 1929953612879690399L;
        oj.lyrm[211] = 1778865177524577623L;
        oj.lyrm[212] = -1472886908487960156L;
        oj.lyrm[213] = -1197765233445177432L;
        oj.lyrm[214] = 3194361961707415366L;
        oj.lyrm[215] = 2510019303531823828L;
        oj.lyrm[216] = 7870866682974626690L;
        oj.lyrm[217] = 2165119783295945785L;
        oj.lyrm[218] = 6621293930926201954L;
        oj.lyrm[219] = 8340650281388748835L;
        oj.lyrm[220] = -6526331816514409487L;
        oj.lyrm[221] = 7221912584317238532L;
        oj.lyrm[222] = 4728064604874514460L;
        oj.lyrm[223] = -7443503376205454333L;
        oj.lyrm[224] = 1789449313864122020L;
        oj.lyrm[225] = -8688859965635782773L;
        oj.lyrm[226] = -3907356530026332700L;
        oj.lyrm[227] = -8824370287589240232L;
        oj.lyrm[228] = 5026371023426291021L;
        oj.lyrm[229] = 5506433743911882961L;
        oj.lyrm[230] = 727542602750515242L;
        oj.lyrm[231] = 7647889195887635737L;
        oj.lyrm[232] = -3602732095656846510L;
        oj.lyrm[233] = -2108002492555124908L;
        oj.lyrm[234] = 8943472181683814039L;
        oj.lyrm[235] = -7785908625966399194L;
        oj.lyrm[236] = 7563114938633006868L;
        oj.lyrm[237] = 1714683774157075048L;
        oj.lyrm[238] = -3653436079261953439L;
        oj.lyrm[239] = -5358966451500085944L;
        oj.lyrm[240] = -5814169253748458685L;
        oj.lyrm[241] = -724123705593387526L;
        oj.lyrm[242] = -4056909297900045468L;
        oj.lyrm[243] = 6733195236980122438L;
        oj.lyrm[244] = 5961773901860030109L;
        oj.lyrm[245] = 544963289230810385L;
        oj.lyrm[246] = -7853859533303910527L;
        oj.lyrm[247] = 3143581887780216327L;
        oj.lyrm[248] = 218085500674028826L;
        oj.lyrm[249] = -6307551327604614230L;
        oj.lyrm[250] = 7693765869858942747L;
        oj.lyrm[251] = -381478248755318747L;
        oj.lyrm[252] = 6185336045249609437L;
        oj.lyrm[253] = 8001069542302328656L;
        oj.lyrm[254] = 2225038547972399281L;
        oj.lyrm[255] = 8509691299193157189L;
        oj.lyrm[256] = 4519480890958506168L;
        oj.lyrm[257] = -3661963084477603107L;
        oj.lyrm[258] = 3724076227470141478L;
        oj.lyrm[259] = -4264904926655774636L;
        oj.lyrm[260] = 3705384037063271220L;
        oj.lyrm[261] = -9067093785707538336L;
        oj.lyrm[262] = -1012717203234344357L;
        oj.lyrm[263] = -8721927609286553211L;
        oj.lyrm[264] = -6147001442942352706L;
        oj.lyrm[265] = -3014272474882709849L;
        oj.lyrm[266] = 8103064785957906919L;
        oj.lyrm[267] = -4854809247332161381L;
        oj.lyrm[268] = 2664332814719265197L;
        oj.lyrm[269] = 7075992383741555939L;
        oj.lyrm[270] = 5031874011874419682L;
        oj.lyrm[271] = 6217894316409193696L;
        oj.lyrm[272] = 3068322317917514222L;
        oj.lyrm[273] = 968798760653854257L;
        oj.lyrm[274] = 6566025219418304376L;
        oj.lyrm[275] = -5988429928375599565L;
        oj.lyrm[276] = 7049378639666244805L;
        oj.lyrm[277] = -3949752430422987159L;
        oj.lyrm[278] = 3245077252561466276L;
        oj.lyrm[279] = -6852665394573790739L;
        oj.lyrm[280] = 5068465145918332597L;
        oj.lyrm[281] = -7136176930427633615L;
        oj.lyrm[282] = 3752517158269263365L;
        oj.lyrm[283] = -8267991127597026178L;
        oj.lyrm[284] = -378057881522259760L;
        oj.lyrm[285] = 7461378677532569577L;
        oj.lyrm[286] = -3505298924138134735L;
        oj.lyrm[287] = 3307043694868052927L;
        oj.lyrm[288] = -2769825083755451956L;
        oj.lyrm[289] = 5351424728450053582L;
        oj.lyrm[290] = -7891597010444197802L;
        oj.lyrm[291] = 1818601446723567905L;
        oj.lyrm[292] = -8662414953825983723L;
        oj.lyrm[293] = -6222326222022237799L;
        oj.lyrm[294] = 5910181052303570496L;
        oj.lyrm[295] = -6705581793463038945L;
        oj.lyrm[296] = -4842778873857848322L;
        oj.lyrm[297] = 672125815451759681L;
        oj.lyrm[298] = -950239172089305744L;
        oj.lyrm[299] = -2557088682140272940L;
    }

    public static /* synthetic */ CallSite lyrn(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ int lyrt(int n2) {
        return lyru[n2] ^ lyrv[n2];
    }

    private static /* synthetic */ void lzza() {
        oj.lyru[200] = 1204621908;
        oj.lyru[201] = 1261888275;
        oj.lyru[202] = 730500740;
        oj.lyru[203] = -266184390;
        oj.lyru[204] = -1386350237;
        oj.lyru[205] = 1004995230;
        oj.lyru[206] = 591789858;
        oj.lyru[207] = 111415183;
        oj.lyru[208] = -190517892;
        oj.lyru[209] = -1534528972;
        oj.lyru[210] = 298023522;
        oj.lyru[211] = -583158595;
        oj.lyru[212] = 0xB3033B;
        oj.lyru[213] = 339889547;
        oj.lyru[214] = 418099237;
        oj.lyru[215] = 873135951;
        oj.lyru[216] = -2045569047;
        oj.lyru[217] = 1929977380;
        oj.lyru[218] = -245276115;
        oj.lyru[219] = 27489544;
        oj.lyru[220] = -522517934;
        oj.lyru[221] = -2053030781;
        oj.lyru[222] = 936822020;
        oj.lyru[223] = -1485079015;
        oj.lyru[224] = -1799492689;
        oj.lyru[225] = 1376861698;
        oj.lyru[226] = -1974582206;
        oj.lyru[227] = 2137780088;
        oj.lyru[228] = -1386313587;
        oj.lyru[229] = -1924588974;
        oj.lyru[230] = -735360340;
        oj.lyru[231] = -1263150479;
        oj.lyru[232] = -2090251951;
        oj.lyru[233] = -1160279547;
        oj.lyru[234] = 1435440257;
        oj.lyru[235] = 1723870125;
        oj.lyru[236] = -634683092;
        oj.lyru[237] = -332305952;
        oj.lyru[238] = 183323320;
        oj.lyru[239] = -1187124295;
        oj.lyru[240] = -1672755345;
        oj.lyru[241] = 946881715;
        oj.lyru[242] = -945468866;
        oj.lyru[243] = -1424540761;
        oj.lyru[244] = -1756375513;
        oj.lyru[245] = -769157965;
        oj.lyru[246] = -2086095527;
        oj.lyru[247] = -1178072682;
        oj.lyru[248] = 251399666;
        oj.lyru[249] = -1225448687;
        oj.lyru[250] = -983289013;
        oj.lyru[251] = 637605192;
        oj.lyru[252] = -533175741;
        oj.lyru[253] = -287394950;
        oj.lyru[254] = -2117798455;
        oj.lyru[255] = 100211182;
        oj.lyru[256] = -1235051891;
        oj.lyru[257] = -463722530;
        oj.lyru[258] = 1147849021;
        oj.lyru[259] = -1393735475;
        oj.lyru[260] = 1402406791;
        oj.lyru[261] = -1073375517;
        oj.lyru[262] = 820557880;
        oj.lyru[263] = 739262682;
        oj.lyru[264] = -1689895926;
        oj.lyru[265] = 71892342;
        oj.lyru[266] = 1142757524;
        oj.lyru[267] = -1230318786;
        oj.lyru[268] = 732391168;
        oj.lyru[269] = -242647289;
        oj.lyru[270] = 588819075;
        oj.lyru[271] = -599005262;
        oj.lyru[272] = -758185125;
        oj.lyru[273] = 43660942;
        oj.lyru[274] = -886739934;
        oj.lyru[275] = 336992772;
        oj.lyru[276] = 40657284;
        oj.lyru[277] = 41300097;
        oj.lyru[278] = 457085703;
        oj.lyru[279] = -1286919602;
        oj.lyru[280] = -1429350997;
        oj.lyru[281] = -834170629;
        oj.lyru[282] = 349244420;
        oj.lyru[283] = -519307468;
        oj.lyru[284] = -1344620365;
        oj.lyru[285] = -1296066551;
        oj.lyru[286] = 1388662491;
        oj.lyru[287] = 1360561185;
        oj.lyru[288] = 1240043701;
        oj.lyru[289] = 1575412421;
        oj.lyru[290] = 93745558;
        oj.lyru[291] = 173814674;
        oj.lyru[292] = -1834603465;
        oj.lyru[293] = 1482202140;
        oj.lyru[294] = -20880571;
        oj.lyru[295] = -1723846091;
        oj.lyru[296] = -443668238;
        oj.lyru[297] = -615634059;
        oj.lyru[298] = 1080412879;
        oj.lyru[299] = 586051519;
    }

    private static /* synthetic */ void lzzc() {
        oj.lyru[400] = -2140262117;
        oj.lyru[401] = -1436738380;
        oj.lyru[402] = 584328279;
        oj.lyru[403] = -1571624738;
        oj.lyru[404] = 999332895;
        oj.lyru[405] = 273110554;
        oj.lyru[406] = 252537269;
    }

    private static /* synthetic */ void lzzo() {
        oj.lyrm[100] = 3157013361957558007L;
        oj.lyrm[101] = 5289848405515951289L;
        oj.lyrm[102] = -5063990832457747261L;
        oj.lyrm[103] = -5431654468931399357L;
        oj.lyrm[104] = -6814794522263344230L;
        oj.lyrm[105] = 1325548455775621730L;
        oj.lyrm[106] = 8834335421571427820L;
        oj.lyrm[107] = -5454977200795113043L;
        oj.lyrm[108] = -5033244501616370887L;
        oj.lyrm[109] = 6942425892901816L;
        oj.lyrm[110] = 5115751974766597883L;
        oj.lyrm[111] = -8497460082560021607L;
        oj.lyrm[112] = -886695477964199485L;
        oj.lyrm[113] = 6058127257480137383L;
        oj.lyrm[114] = -7623328399857250143L;
        oj.lyrm[115] = -5589177671783550306L;
        oj.lyrm[116] = 2381241779160477414L;
        oj.lyrm[117] = 7729451699708865983L;
        oj.lyrm[118] = 4254802623577982052L;
        oj.lyrm[119] = 3455692482655781928L;
        oj.lyrm[120] = -6873824745217121997L;
        oj.lyrm[121] = -7561508839364052598L;
        oj.lyrm[122] = -327569585603057206L;
        oj.lyrm[123] = -7841031545149647785L;
        oj.lyrm[124] = 5718072775507567058L;
        oj.lyrm[125] = 3141948580178126466L;
        oj.lyrm[126] = 1614415684161071664L;
        oj.lyrm[127] = 2005904540743924405L;
        oj.lyrm[128] = 4056804838771024244L;
        oj.lyrm[129] = -1759739142795738795L;
        oj.lyrm[130] = -6351290433752485370L;
        oj.lyrm[131] = 2245838411524107915L;
        oj.lyrm[132] = 3934587291482550362L;
        oj.lyrm[133] = 2483367591048292449L;
        oj.lyrm[134] = 8337353296515827085L;
        oj.lyrm[135] = -6862645424604574142L;
        oj.lyrm[136] = -2193721618740794670L;
        oj.lyrm[137] = 2577073617993041481L;
        oj.lyrm[138] = -2504080423480711415L;
        oj.lyrm[139] = 2082152518703236209L;
        oj.lyrm[140] = 186372970166418561L;
        oj.lyrm[141] = 5079422471754111906L;
        oj.lyrm[142] = 2497342535688803045L;
        oj.lyrm[143] = 1061549287210628145L;
        oj.lyrm[144] = 5345149868575251296L;
        oj.lyrm[145] = -6631200291350094860L;
        oj.lyrm[146] = 2221264417341071652L;
        oj.lyrm[147] = 8558683172250930950L;
        oj.lyrm[148] = 2066964067996693165L;
        oj.lyrm[149] = 7317691004871297589L;
        oj.lyrm[150] = -2731409287130335657L;
        oj.lyrm[151] = 5663680635677780266L;
        oj.lyrm[152] = 4163570251876166394L;
        oj.lyrm[153] = -5779024300070748211L;
        oj.lyrm[154] = -8488809683165039651L;
        oj.lyrm[155] = -5386390376926614396L;
        oj.lyrm[156] = -3242315191349829123L;
        oj.lyrm[157] = 6153959150743965509L;
        oj.lyrm[158] = -5716558531089422267L;
        oj.lyrm[159] = -922434256400664166L;
        oj.lyrm[160] = 6606404741825770113L;
        oj.lyrm[161] = 7678180640584361372L;
        oj.lyrm[162] = 4701144030523434330L;
        oj.lyrm[163] = -422949431802832341L;
        oj.lyrm[164] = -8212663570850615870L;
        oj.lyrm[165] = -6171077581538039832L;
        oj.lyrm[166] = -6168236803983865153L;
        oj.lyrm[167] = 9109613834121147574L;
        oj.lyrm[168] = 5480178367322139582L;
        oj.lyrm[169] = 6252218838362147237L;
        oj.lyrm[170] = -3680240729525405075L;
        oj.lyrm[171] = -6860825637072257752L;
        oj.lyrm[172] = 375766307530303826L;
        oj.lyrm[173] = 8521762281704191848L;
        oj.lyrm[174] = 3877631155028752702L;
        oj.lyrm[175] = 6633401626177160515L;
        oj.lyrm[176] = 7710716829910804465L;
        oj.lyrm[177] = 1531668894262887867L;
        oj.lyrm[178] = 3099580385603361106L;
        oj.lyrm[179] = -5911350067346526184L;
        oj.lyrm[180] = 7545678445670451198L;
        oj.lyrm[181] = -8467476864593413507L;
        oj.lyrm[182] = 7709857837007433816L;
        oj.lyrm[183] = -6519456153188849648L;
        oj.lyrm[184] = -3121128071003654077L;
        oj.lyrm[185] = -1019655915458775999L;
        oj.lyrm[186] = 252968829044621822L;
        oj.lyrm[187] = -4798612517896695433L;
        oj.lyrm[188] = 6613942864428815755L;
        oj.lyrm[189] = -7699544417543223434L;
        oj.lyrm[190] = 3111866329295704168L;
        oj.lyrm[191] = -5025729445355507527L;
        oj.lyrm[192] = 7461831804835798269L;
        oj.lyrm[193] = 506415739812887977L;
        oj.lyrm[194] = -8549705657782809290L;
        oj.lyrm[195] = -1443438748824969151L;
        oj.lyrm[196] = -7377827057664602581L;
        oj.lyrm[197] = -1666009074430840317L;
        oj.lyrm[198] = -3616265596465888206L;
        oj.lyrm[199] = 4927581210840300844L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean isCustomModelOutline(class_1921 var0) {
        v0 /* !! */  = oj.uv;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - oj.lyrn("lyro", lyrk(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -804131716: {
                    v1 = oj.lyrn("lyrp", lyrk(int ), (int)1);
                    continue block22;
                }
                case -537971363: {
                    v1 = oj.lyrn("lyrq", lyrk(int ), (int)2);
                    continue block22;
                }
                case 550199004: {
                    v1 = oj.lyrn("lyrr", lyrk(int ), (int)3);
                    continue block22;
                }
                case 1798372139: {
                    break block22;
                }
            }
            break;
        }
        var3_1 = oj.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = oj.uv - oj.lyrn("lyrs", lyrk(int ), (int)4)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == oj.lyrn("lyrw", lyrt(int ), (int)0)) break;
            v2 /* !! */  = (long)oj.lyrn("lyrx", lyrt(int ), (int)1);
        }
        var2_2 /* !! */  = oj.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = oj.uv - oj.lyrn("lyry", lyrk(int ), (int)5)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == oj.lyrn("lyrz", lyrt(int ), (int)2)) break;
            v3 /* !! */  = (long)oj.lyrn("lysa", lyrt(int ), (int)3);
        }
        var1_3 = oj.a;
        if (var3_1) {
            throw null;
lbl34:
            // 2 sources

            return (boolean)oj.lyrn("lysb", lyrt(int ), (int)4);
        }
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = oj.uv;
                if (true) ** GOTO lbl45
                block26: while (true) {
                    v4 /* !! */  = (long)(oj.lyrn("lysd", lyrk(int ), (int)7) - oj.lyrn("lysc", lyrk(int ), (int)6));
lbl45:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 1082345691: {
                            continue block26;
                        }
                        case 1798372139: {
                            break block26;
                        }
                    }
                    break;
                }
                v5 /* !! */  = oj.uv;
                if (true) ** GOTO lbl54
                block27: while (true) {
                    v5 /* !! */  = (long)(v6 - oj.lyrn("lyse", lyrk(int ), (int)8));
lbl54:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -596402646: {
                            v6 = oj.lyrn("lysf", lyrk(int ), (int)9);
                            continue block27;
                        }
                        case -565680039: {
                            v6 = oj.lyrn("lysg", lyrk(int ), (int)10);
                            continue block27;
                        }
                        case 1513190300: {
                            v6 = oj.lyrn("lysh", lyrk(int ), (int)11);
                            continue block27;
                        }
                        case 1798372139: {
                            break block27;
                        }
                    }
                    break;
                }
                return oj.CUSTOM_MODEL_OUTLINE_LAYERS.contains(var0);
            }
            case 0: {
                var2_2 /* !! */  = (int)oj.lyrn("lysi", lyrt(int ), (int)5);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)oj.lyrn("lysj", lyrt(int ), (int)6);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)oj.lyrn("lysk", lyrt(int ), (int)7);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)oj.lyrn("lysl", lyrt(int ), (int)8);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void lzzl() {
        oj.lyrl[300] = -8366972948139690923L;
        oj.lyrl[301] = -4634382648601113615L;
        oj.lyrl[302] = 2952187929647511736L;
        oj.lyrl[303] = -1456402586968413264L;
        oj.lyrl[304] = -6014587943699490119L;
        oj.lyrl[305] = 3600187008133794864L;
        oj.lyrl[306] = -3987323416815056374L;
        oj.lyrl[307] = -6070174811503732869L;
        oj.lyrl[308] = 4408325937762169993L;
        oj.lyrl[309] = -1155270113440477583L;
        oj.lyrl[310] = 4334523884957261278L;
        oj.lyrl[311] = -5290865576231990023L;
        oj.lyrl[312] = -4677732447785191077L;
        oj.lyrl[313] = 6712160986611286760L;
        oj.lyrl[314] = -247162134642401558L;
        oj.lyrl[315] = 6798004573678697571L;
        oj.lyrl[316] = 3025307007588666779L;
        oj.lyrl[317] = 1184402733544282025L;
        oj.lyrl[318] = 6084317728453867556L;
        oj.lyrl[319] = -8762388885977795343L;
        oj.lyrl[320] = 4430410089374136664L;
        oj.lyrl[321] = 2870934917749753643L;
        oj.lyrl[322] = -3055872896406592657L;
        oj.lyrl[323] = 5759781289762274835L;
        oj.lyrl[324] = 6038153417589611731L;
        oj.lyrl[325] = -1225102101290732155L;
        oj.lyrl[326] = -4819194167083228686L;
        oj.lyrl[327] = 3004130053882440301L;
        oj.lyrl[328] = 4460212248399753751L;
        oj.lyrl[329] = 8731383479298975645L;
        oj.lyrl[330] = 4014518251936319906L;
        oj.lyrl[331] = 4369605452789821371L;
        oj.lyrl[332] = 1817731924943324135L;
        oj.lyrl[333] = 6836219871782568064L;
        oj.lyrl[334] = -902703028908928252L;
        oj.lyrl[335] = 7928639743535258094L;
        oj.lyrl[336] = 6683986592890023191L;
        oj.lyrl[337] = -592795955162615012L;
        oj.lyrl[338] = 8416534044461769557L;
        oj.lyrl[339] = -8245437316201065641L;
        oj.lyrl[340] = 6358732572845463090L;
        oj.lyrl[341] = -5143116576007876576L;
        oj.lyrl[342] = 6294420211626728669L;
        oj.lyrl[343] = -7923129227518563237L;
        oj.lyrl[344] = 2180158610405553523L;
        oj.lyrl[345] = 8289065155082378400L;
        oj.lyrl[346] = -624571972422755665L;
        oj.lyrl[347] = 6311614602629172532L;
        oj.lyrl[348] = -2648174835162169818L;
        oj.lyrl[349] = 2767942452381804700L;
        oj.lyrl[350] = 5194225906131350678L;
        oj.lyrl[351] = -4375691117200969436L;
        oj.lyrl[352] = -729680134621621350L;
        oj.lyrl[353] = -7305504630467782175L;
        oj.lyrl[354] = -2126566659160244231L;
        oj.lyrl[355] = 6998238668758119458L;
        oj.lyrl[356] = -5309718720230439656L;
        oj.lyrl[357] = 6884310440038569161L;
        oj.lyrl[358] = 793503365972630084L;
        oj.lyrl[359] = -4744954785040458984L;
        oj.lyrl[360] = 6001717672559304181L;
        oj.lyrl[361] = -542577184127876712L;
        oj.lyrl[362] = -2140072919618527210L;
        oj.lyrl[363] = 6265691426410016544L;
        oj.lyrl[364] = -2188505851327330237L;
        oj.lyrl[365] = 5481623678656106647L;
        oj.lyrl[366] = 8813248238804251471L;
        oj.lyrl[367] = -705680579392715323L;
        oj.lyrl[368] = 8634460318546924959L;
        oj.lyrl[369] = -3808979824675665949L;
        oj.lyrl[370] = 1549857457541893331L;
        oj.lyrl[371] = 8640868166436600368L;
        oj.lyrl[372] = -2205326693138663355L;
        oj.lyrl[373] = 474899108034144971L;
        oj.lyrl[374] = 4239834792504695144L;
        oj.lyrl[375] = 6093447800366076394L;
        oj.lyrl[376] = 9015987472652755756L;
        oj.lyrl[377] = -3848235541369262812L;
        oj.lyrl[378] = -3839299106102488487L;
        oj.lyrl[379] = 3299275253705881375L;
        oj.lyrl[380] = -7623892114017767779L;
        oj.lyrl[381] = 3094664874650254563L;
        oj.lyrl[382] = -2809261292900806752L;
        oj.lyrl[383] = -2495645831932369874L;
        oj.lyrl[384] = -2906277170282688092L;
        oj.lyrl[385] = 3958446145379260224L;
        oj.lyrl[386] = -3221904132049099821L;
        oj.lyrl[387] = -4032462753868745940L;
        oj.lyrl[388] = -7948240826635140811L;
        oj.lyrl[389] = -8349632768356797425L;
        oj.lyrl[390] = -244037814019831827L;
        oj.lyrl[391] = -576759372627766755L;
        oj.lyrl[392] = 4697792369436692980L;
        oj.lyrl[393] = 2455716333093633021L;
        oj.lyrl[394] = -516163800357049888L;
        oj.lyrl[395] = 258333409883202728L;
        oj.lyrl[396] = -8952753561762529456L;
        oj.lyrl[397] = 5798536001764664847L;
        oj.lyrl[398] = 8319834569994684387L;
        oj.lyrl[399] = 2169524110081566218L;
    }

    static {
        lyru = new int[407];
        lyrv = new int[407];
        oj.lzyy();
        oj.lzyz();
        oj.lzza();
        oj.lzzb();
        oj.lzzc();
        oj.lzzd();
        oj.lzze();
        oj.lzzf();
        oj.lzzg();
        oj.lzzh();
        lyrl = new long[458];
        lyrm = new long[458];
        oj.lzzi();
        oj.lzzj();
        oj.lzzk();
        oj.lzzl();
        oj.lzzm();
        oj.lzzn();
        oj.lzzo();
        oj.lzzp();
        oj.lzzq();
        oj.lzzr();
        CUSTOM_MODEL_OUTLINE_LAYERS = Collections.newSetFromMap(new IdentityHashMap());
        CUSTOM_MODEL_OUTLINE = class_156.method_34866(oj::lambda$static$0);
        ROMB_ESP_PIPELINE = class_10799.method_67887((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{class_10799.field_60125}).withLocation("pipeline/wtex").withVertexShader("core/position_tex_color").withFragmentShader("core/position_tex_color").withSampler("Sampler0").withBlend(BlendFunction.LIGHTNING).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withCull((boolean)oj.lyrn("lzxg", lyrt(int ), (int)363)).withVertexFormat(class_290.field_1575, VertexFormat.class_5596.field_27382).build());
        ROMB_ESP = class_156.method_34866(oj::lambda$static$1);
        GHOSTS_ESP_PIPELINE = class_10799.method_67887((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{class_10799.field_60125}).withLocation("pipeline/wtex").withVertexShader("core/position_tex_color").withFragmentShader("core/position_tex_color").withSampler("Sampler0").withBlend(BlendFunction.LIGHTNING).withDepthTestFunction(DepthTestFunction.LESS_DEPTH_TEST).withDepthWrite((boolean)oj.lyrn("lzxh", lyrt(int ), (int)364)).withCull((boolean)oj.lyrn("lzxi", lyrt(int ), (int)365)).withVertexFormat(class_290.field_1575, VertexFormat.class_5596.field_27382).build());
        GHOSTS_ESP = class_156.method_34866(oj::lambda$static$2);
        CHAIN_ESP_PIPELINE = class_10799.method_67887((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{class_10799.field_60125}).withLocation("pipeline/wtex").withVertexShader("core/position_tex_color").withFragmentShader("core/position_tex_color").withSampler("Sampler0").withBlend(BlendFunction.LIGHTNING).withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST).withDepthWrite((boolean)oj.lyrn("lzxj", lyrt(int ), (int)366)).withCull((boolean)oj.lyrn("lzxk", lyrt(int ), (int)367)).withVertexFormat(class_290.field_1575, VertexFormat.class_5596.field_27382).build());
        CHAIN_ESP = class_156.method_34866(oj::lambda$static$3);
        CRYSTAL_FILLED_PIPELINE = class_10799.method_67887((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{class_10799.field_60125}).withLocation("pipeline/crystal_filled").withVertexShader("core/position_color").withFragmentShader("core/position_color").withBlend(BlendFunction.TRANSLUCENT).withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST).withDepthWrite((boolean)oj.lyrn("lzxl", lyrt(int ), (int)368)).withCull((boolean)oj.lyrn("lzxm", lyrt(int ), (int)369)).withVertexFormat(class_290.field_1576, VertexFormat.class_5596.field_27382).build());
        CRYSTAL_FILLED = class_1921.method_75940((String)"crystal_filled", (class_12247)class_12247.method_75927((RenderPipeline)CRYSTAL_FILLED_PIPELINE).method_75937().method_75929((int)oj.lyrn("lzxn", lyrt(int ), (int)370)).method_75938());
        CRYSTAL_GLOW_PIPELINE = class_10799.method_67887((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{class_10799.field_60125}).withLocation("pipeline/crystal_glow").withVertexShader("core/position_color").withFragmentShader("core/position_color").withBlend(BlendFunction.LIGHTNING).withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST).withDepthWrite((boolean)oj.lyrn("lzxo", lyrt(int ), (int)371)).withCull((boolean)oj.lyrn("lzxp", lyrt(int ), (int)372)).withVertexFormat(class_290.field_1576, VertexFormat.class_5596.field_27382).build());
        CRYSTAL_GLOW = class_1921.method_75940((String)"crystal_glow", (class_12247)class_12247.method_75927((RenderPipeline)CRYSTAL_GLOW_PIPELINE).method_75937().method_75929((int)oj.lyrn("lzxq", lyrt(int ), (int)373)).method_75938());
        BLOOM_ESP_PIPELINE = class_10799.method_67887((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{class_10799.field_60125}).withLocation("pipeline/bloom_esp").withVertexShader("core/position_tex_color").withFragmentShader("core/position_tex_color").withSampler("Sampler0").withBlend(BlendFunction.LIGHTNING).withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST).withDepthWrite((boolean)oj.lyrn("lzxr", lyrt(int ), (int)374)).withCull((boolean)oj.lyrn("lzxs", lyrt(int ), (int)375)).withVertexFormat(class_290.field_1575, VertexFormat.class_5596.field_27382).build());
        BLOOM_ESP = class_156.method_34866(oj::lambda$static$4);
        CHINA_HAT_PIPELINE = class_10799.method_67887((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{class_10799.field_60125}).withLocation("pipeline/china_hat").withVertexShader("core/position_color").withFragmentShader("core/position_color").withBlend(BlendFunction.TRANSLUCENT).withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST).withDepthWrite((boolean)oj.lyrn("lzxt", lyrt(int ), (int)376)).withCull((boolean)oj.lyrn("lzxu", lyrt(int ), (int)377)).withVertexFormat(class_290.field_1576, VertexFormat.class_5596.field_27381).build());
        CHINA_HAT = class_1921.method_75940((String)"china_hat", (class_12247)class_12247.method_75927((RenderPipeline)CHINA_HAT_PIPELINE).method_75937().method_75929((int)oj.lyrn("lzxv", lyrt(int ), (int)378)).method_75938());
        CHINA_HAT_OUTLINE_PIPELINE = class_10799.method_67887((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{class_10799.field_60125}).withLocation("pipeline/china_hat_outline").withVertexShader("core/position_color").withFragmentShader("core/position_color").withBlend(BlendFunction.TRANSLUCENT).withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST).withDepthWrite((boolean)oj.lyrn("lzxw", lyrt(int ), (int)379)).withCull((boolean)oj.lyrn("lzxx", lyrt(int ), (int)380)).withVertexFormat(class_290.field_1576, VertexFormat.class_5596.field_29345).build());
        CHINA_HAT_OUTLINE = class_1921.method_75940((String)"china_hat_outline", (class_12247)class_12247.method_75927((RenderPipeline)CHINA_HAT_OUTLINE_PIPELINE).method_75937().method_75929((int)oj.lyrn("lzxy", lyrt(int ), (int)381)).method_75938());
        SHADER_HANDS_HALO_PIPELINE = class_10799.method_67887((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{class_10799.field_60125}).withLocation("pipeline/shader_hands_halo").withVertexShader(class_2960.method_60655((String)"phobia", (String)"3d/shaderhands_halo_vertex")).withFragmentShader(class_2960.method_60655((String)"phobia", (String)"3d/shaderhands_halo_fragment")).withSampler("Sampler0").withUniform("Globals", class_10789.field_60031).withBlend(BlendFunction.LIGHTNING).withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST).withDepthWrite((boolean)oj.lyrn("lzxz", lyrt(int ), (int)382)).withCull((boolean)oj.lyrn("lzya", lyrt(int ), (int)383)).withVertexFormat(class_290.field_1580, VertexFormat.class_5596.field_27382).build());
        SHADER_HANDS_HALO = class_156.method_34866(oj::lambda$static$5);
        SHADER_HANDS_TRAIL_HALO = class_156.method_34866(oj::lambda$static$6);
        SHADER_HANDS_ITEM_COLOR_HALO_PIPELINE = class_10799.method_67887((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{class_10799.field_60125}).withLocation("pipeline/shader_hands_item_color_halo").withVertexShader(class_2960.method_60655((String)"phobia", (String)"3d/shaderhands_halo_vertex")).withFragmentShader(class_2960.method_60655((String)"phobia", (String)"3d/shaderhands_item_color_fragment")).withSampler("Sampler0").withUniform("Globals", class_10789.field_60031).withBlend(BlendFunction.LIGHTNING).withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST).withDepthWrite((boolean)oj.lyrn("lzyb", lyrt(int ), (int)384)).withCull((boolean)oj.lyrn("lzyc", lyrt(int ), (int)385)).withVertexFormat(class_290.field_1580, VertexFormat.class_5596.field_27382).build());
        SHADER_HANDS_ITEM_COLOR_HALO = class_156.method_34866(oj::lambda$static$7);
        SHADER_HANDS_TRAIL_ITEM_COLOR_HALO = class_156.method_34866(oj::lambda$static$8);
        SHADER_HANDS_GRADIENT_PIPELINE = class_10799.method_67887((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{class_10799.field_60125}).withLocation("pipeline/shader_hands_gradient").withVertexShader(class_2960.method_60655((String)"phobia", (String)"3d/shaderhands_vertex")).withFragmentShader(class_2960.method_60655((String)"phobia", (String)"3d/shaderhands_gradient_fragment")).withSampler("Sampler0").withUniform("Globals", class_10789.field_60031).withBlend(BlendFunction.TRANSLUCENT).withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST).withDepthWrite((boolean)oj.lyrn("lzyd", lyrt(int ), (int)386)).withCull((boolean)oj.lyrn("lzye", lyrt(int ), (int)387)).withVertexFormat(class_290.field_1580, VertexFormat.class_5596.field_27382).build());
        SHADER_HANDS_GRADIENT = class_156.method_34866(oj::lambda$static$9);
        SHADER_HANDS_ITEMGLOW_PIPELINE = class_10799.method_67887((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{class_10799.field_60125}).withLocation("pipeline/shader_hands_itemglow").withVertexShader(class_2960.method_60655((String)"phobia", (String)"3d/shaderhands_vertex")).withFragmentShader(class_2960.method_60655((String)"phobia", (String)"3d/shaderhands_itemglow_fragment")).withSampler("Sampler0").withUniform("Globals", class_10789.field_60031).withBlend(BlendFunction.TRANSLUCENT).withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST).withDepthWrite((boolean)oj.lyrn("lzyf", lyrt(int ), (int)388)).withCull((boolean)oj.lyrn("lzyg", lyrt(int ), (int)389)).withVertexFormat(class_290.field_1580, VertexFormat.class_5596.field_27382).build());
        SHADER_HANDS_ITEMGLOW = class_156.method_34866(oj::lambda$static$10);
        SHADER_HANDS_TRAIL_ITEMGLOW = class_156.method_34866(oj::lambda$static$11);
        SHADER_HANDS_BAKED_ITEM_FILL_PIPELINE = class_10799.method_67887((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{class_10799.field_60125}).withLocation("pipeline/shader_hands_baked_item_fill").withVertexShader(class_2960.method_60655((String)"phobia", (String)"3d/shaderhands_baked_item_fill_vertex")).withFragmentShader(class_2960.method_60655((String)"phobia", (String)"3d/shaderhands_itemglow_fragment")).withSampler("Sampler0").withUniform("Globals", class_10789.field_60031).withBlend(BlendFunction.TRANSLUCENT).withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST).withDepthWrite((boolean)oj.lyrn("lzyh", lyrt(int ), (int)390)).withCull((boolean)oj.lyrn("lzyi", lyrt(int ), (int)391)).withVertexFormat(class_290.field_1580, VertexFormat.class_5596.field_27382).build());
        SHADER_HANDS_BAKED_ITEM_FILL = class_156.method_34866(oj::lambda$static$12);
        SHADER_HANDS_TRAIL_BAKED_ITEM_FILL = class_156.method_34866(oj::lambda$static$13);
        CHAMS_PIPELINE = class_10799.method_67887((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{class_10799.field_60125}).withLocation("pipeline/chams").withVertexShader(class_2960.method_60655((String)"phobia", (String)"3d/shaderhands_vertex")).withFragmentShader(class_2960.method_60655((String)"phobia", (String)"3d/chams_fragment")).withSampler("Sampler0").withUniform("Globals", class_10789.field_60031).withBlend(BlendFunction.TRANSLUCENT).withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST).withDepthWrite((boolean)oj.lyrn("lzyj", lyrt(int ), (int)392)).withCull((boolean)oj.lyrn("lzyk", lyrt(int ), (int)393)).withVertexFormat(class_290.field_1580, VertexFormat.class_5596.field_27382).build());
        CHAMS = class_156.method_34866(oj::lambda$static$14);
        CHAMS_WALL_PIPELINE = class_10799.method_67887((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{class_10799.field_60125}).withLocation("pipeline/chams_wall").withVertexShader(class_2960.method_60655((String)"phobia", (String)"3d/shaderhands_vertex")).withFragmentShader(class_2960.method_60655((String)"phobia", (String)"3d/chams_fragment")).withSampler("Sampler0").withUniform("Globals", class_10789.field_60031).withBlend(BlendFunction.TRANSLUCENT).withDepthTestFunction(DepthTestFunction.GREATER_DEPTH_TEST).withDepthWrite((boolean)oj.lyrn("lzyl", lyrt(int ), (int)394)).withCull((boolean)oj.lyrn("lzym", lyrt(int ), (int)395)).withVertexFormat(class_290.field_1580, VertexFormat.class_5596.field_27382).build());
        CHAMS_WALL = class_156.method_34866(oj::lambda$static$15);
        CHAMS_NORMAL_WALL_PIPELINE = class_10799.method_67887((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{class_10799.field_60125}).withLocation("pipeline/chams_normal_wall").withVertexShader(class_2960.method_60655((String)"phobia", (String)"3d/chams_normal_vertex")).withFragmentShader(class_2960.method_60655((String)"phobia", (String)"3d/chams_normal_fragment")).withSampler("Sampler0").withBlend(BlendFunction.TRANSLUCENT).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite((boolean)oj.lyrn("lzyn", lyrt(int ), (int)396)).withCull((boolean)oj.lyrn("lzyo", lyrt(int ), (int)397)).withVertexFormat(class_290.field_1580, VertexFormat.class_5596.field_27382).build());
        CHAMS_NORMAL_WALL = class_156.method_34866(oj::lambda$static$16);
        LAYER_TEXTURE_CACHE = new HashMap<class_1921, Optional<class_2960>>();
        WORLD_PARTICLES_COLOR_PIPELINE = class_10799.method_67887((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{class_10799.field_56860}).withLocation(class_2960.method_60655((String)"rich", (String)"world_particles_color")).withVertexFormat(class_290.field_1576, VertexFormat.class_5596.field_27382).withCull((boolean)oj.lyrn("lzyp", lyrt(int ), (int)398)).withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST).withDepthWrite((boolean)oj.lyrn("lzyq", lyrt(int ), (int)399)).withBlend(BlendFunction.LIGHTNING).build());
        WORLD_PARTICLES_QUADS = class_1921.method_75940((String)"world_particles_cube", (class_12247)class_12247.method_75927((RenderPipeline)WORLD_PARTICLES_COLOR_PIPELINE).method_75937().method_75929((int)oj.lyrn("lzyr", lyrt(int ), (int)400)).method_75938());
        WORLD_PARTICLES_LINES_PIPELINE = class_10799.method_67887((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{class_10799.field_56860}).withLocation(class_2960.method_60655((String)"rich", (String)"world_particles_lines")).withVertexFormat(class_290.field_1576, VertexFormat.class_5596.field_29344).withCull((boolean)oj.lyrn("lzys", lyrt(int ), (int)401)).withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST).withDepthWrite((boolean)oj.lyrn("lzyt", lyrt(int ), (int)402)).withBlend(BlendFunction.LIGHTNING).build());
        WORLD_PARTICLES_LINES = class_1921.method_75940((String)"world_particles_lines", (class_12247)class_12247.method_75927((RenderPipeline)WORLD_PARTICLES_LINES_PIPELINE).method_75937().method_75929((int)oj.lyrn("lzyu", lyrt(int ), (int)403)).method_75938());
        WORLD_PARTICLES_GLOW_PIPELINE = class_10799.method_67887((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{class_10799.field_56864}).withLocation(class_2960.method_60655((String)"rich", (String)"world_particles_glow")).withVertexFormat(class_290.field_1575, VertexFormat.class_5596.field_27382).withCull((boolean)oj.lyrn("lzyv", lyrt(int ), (int)404)).withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST).withDepthWrite((boolean)oj.lyrn("lzyw", lyrt(int ), (int)405)).withBlend(BlendFunction.LIGHTNING).withSampler("Sampler0").build());
        WORLD_PARTICLES_GLOW = class_156.method_34866(oj::lambda$static$18);
        GUI_ARROW_BLEND_PIPELINE = class_10799.method_67887((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{class_10799.field_60125}).withLocation("pipeline/gui_arrow_blend").withVertexShader("core/position_tex_color").withFragmentShader("core/position_tex_color").withSampler("Sampler0").withBlend(BlendFunction.LIGHTNING).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withCull((boolean)oj.lyrn("lzyx", lyrt(int ), (int)406)).withVertexFormat(class_290.field_1575, VertexFormat.class_5596.field_27382).build());
        GUI_ARROW_BLEND = class_156.method_34866(oj::lambda$static$19);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ class_1921 lambda$static$6(class_2960 var0) {
        v0 /* !! */  = oj.uv;
        if (true) ** GOTO lbl5
        block46: while (true) {
            v0 /* !! */  = (long)(oj.lyrn("lzmo", lyrk(int ), (int)308) - oj.lyrn("lzmn", lyrk(int ), (int)307));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1345642201: {
                    continue block46;
                }
                case 1798372139: {
                    break block46;
                }
            }
            break;
        }
        var4_1 = oj.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = oj.uv - oj.lyrn("lzmp", lyrk(int ), (int)309)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == oj.lyrn("lzmq", lyrt(int ), (int)235)) break;
            v1 /* !! */  = (long)oj.lyrn("lzmr", lyrt(int ), (int)236);
        }
        var3_2 /* !! */  = oj.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = oj.uv - oj.lyrn("lzms", lyrk(int ), (int)310)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == oj.lyrn("lzmt", lyrt(int ), (int)237)) break;
            v2 /* !! */  = (long)oj.lyrn("lzmu", lyrt(int ), (int)238);
        }
        var2_3 = oj.a;
        if (var4_1) {
            throw null;
lbl27:
            // 2 sources

            return null;
        }
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3 || var2_3) ** GOTO lbl27
                v3 /* !! */  = oj.uv;
                if (true) ** GOTO lbl37
                block50: while (true) {
                    v3 /* !! */  = (long)(oj.lyrn("lzmw", lyrk(int ), (int)312) - oj.lyrn("lzmv", lyrk(int ), (int)311));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 1523187950: {
                            continue block50;
                        }
                        case 1798372139: {
                            break block50;
                        }
                    }
                    break;
                }
                v4 /* !! */  = oj.uv;
                if (true) ** GOTO lbl46
                block51: while (true) {
                    v4 /* !! */  = (long)(v5 - oj.lyrn("lzmx", lyrk(int ), (int)313));
lbl46:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2135457515: {
                            v5 = oj.lyrn("lzmy", lyrk(int ), (int)314);
                            continue block51;
                        }
                        case -1137975635: {
                            v5 = oj.lyrn("lzmz", lyrk(int ), (int)315);
                            continue block51;
                        }
                        case 1798372139: {
                            break block51;
                        }
                    }
                    break;
                }
                v6 = class_12247.method_75927((RenderPipeline)oj.SHADER_HANDS_HALO_PIPELINE);
                v7 /* !! */  = oj.uv;
                if (true) ** GOTO lbl60
                block52: while (true) {
                    v7 /* !! */  = (long)(v8 - oj.lyrn("lzna", lyrk(int ), (int)316));
lbl60:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1599809195: {
                            v8 = oj.lyrn("lznb", lyrk(int ), (int)317);
                            continue block52;
                        }
                        case -1343935771: {
                            v8 = oj.lyrn("lznc", lyrk(int ), (int)318);
                            continue block52;
                        }
                        case 703137317: {
                            v8 = oj.lyrn("lznd", lyrk(int ), (int)319);
                            continue block52;
                        }
                        case 1798372139: {
                            break block52;
                        }
                    }
                    break;
                }
                v9 = v6.method_75934("Sampler0", var0);
                v10 /* !! */  = oj.uv;
                if (true) ** GOTO lbl77
                block53: while (true) {
                    v10 /* !! */  = (long)(v11 - oj.lyrn("lzne", lyrk(int ), (int)320));
lbl77:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case 1585084914: {
                            v11 = oj.lyrn("lznf", lyrk(int ), (int)321);
                            continue block53;
                        }
                        case 1798372139: {
                            break block53;
                        }
                        case 1905281599: {
                            v11 = oj.lyrn("lzng", lyrk(int ), (int)322);
                            continue block53;
                        }
                    }
                    break;
                }
                v12 /* !! */  = oj.uv;
                if (true) ** GOTO lbl90
                block54: while (true) {
                    v12 /* !! */  = (long)(v13 - oj.lyrn("lznh", lyrk(int ), (int)323));
lbl90:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1827514377: {
                            v13 = oj.lyrn("lzni", lyrk(int ), (int)324);
                            continue block54;
                        }
                        case 118644100: {
                            v13 = oj.lyrn("lznj", lyrk(int ), (int)325);
                            continue block54;
                        }
                        case 1415683845: {
                            v13 = oj.lyrn("lznk", lyrk(int ), (int)326);
                            continue block54;
                        }
                        case 1798372139: {
                            break block54;
                        }
                    }
                    break;
                }
                v14 = v9.method_75931(on.OUTPUT_TARGET);
                v15 /* !! */  = oj.uv;
                if (true) ** GOTO lbl107
                block55: while (true) {
                    v15 /* !! */  = (long)(oj.lyrn("lznm", lyrk(int ), (int)328) - oj.lyrn("lznl", lyrk(int ), (int)327));
lbl107:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case 199557659: {
                            continue block55;
                        }
                        case 1798372139: {
                            break block55;
                        }
                    }
                    break;
                }
                v16 = v14.method_75937();
                v17 = oj.lyrn("lznn", lyrt(int ), (int)239);
                v18 /* !! */  = oj.uv;
                if (true) ** GOTO lbl118
                block56: while (true) {
                    v18 /* !! */  = (long)(oj.lyrn("lznp", lyrk(int ), (int)330) - oj.lyrn("lzno", lyrk(int ), (int)329));
lbl118:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case 1798372139: {
                            break block56;
                        }
                        case 1822484733: {
                            continue block56;
                        }
                    }
                    break;
                }
                v19 = v16.method_75929((int)v17);
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_2 = oj.uv - oj.lyrn("lznq", lyrk(int ), (int)331)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v20 /* !! */  == oj.lyrn("lznr", lyrt(int ), (int)240)) break;
                    v20 /* !! */  = (long)oj.lyrn("lzns", lyrt(int ), (int)241);
                }
                var1_4 = v19.method_75938();
                if (var2_3 || var2_3) ** continue;
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_3 = oj.uv - oj.lyrn("lznt", lyrk(int ), (int)332)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v21 /* !! */  == oj.lyrn("lznu", lyrt(int ), (int)242)) break;
                    v21 /* !! */  = (long)oj.lyrn("lznv", lyrt(int ), (int)243);
                }
                return class_1921.method_75940((String)"shader_hands_trail_halo", (class_12247)var1_4);
            }
lbl139:
            // 3 sources

            case 0: {
                var3_2 /* !! */  = (int)oj.lyrn("lznw", lyrt(int ), (int)244);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl144:
            // 2 sources

            case 1: {
                var3_2 /* !! */  = (int)oj.lyrn("lznx", lyrt(int ), (int)245);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl149:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)oj.lyrn("lzny", lyrt(int ), (int)246);
                    if (!var4_1) ** GOTO lbl144
                    throw null;
                }
            }
            case 3: {
                var3_2 /* !! */  = (int)oj.lyrn("lznz", lyrt(int ), (int)247);
                if (!var4_1) ** GOTO lbl139
                throw null;
            }
lbl158:
            // 2 sources

            case 4: {
                var3_2 /* !! */  = (int)oj.lyrn("lzoa", lyrt(int ), (int)248);
                if (!var4_1) ** GOTO lbl139
                throw null;
            }
            case 5: 
        }
        var3_2 /* !! */  = (int)oj.lyrn("lzob", lyrt(int ), (int)249);
        ** while (!var4_1)
lbl165:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lzzd() {
        oj.lyrv[0] = 522326831;
        oj.lyrv[1] = -222975958;
        oj.lyrv[2] = 1861934024;
        oj.lyrv[3] = 1092475076;
        oj.lyrv[4] = -657974977;
        oj.lyrv[5] = 1886235448;
        oj.lyrv[6] = 1249706171;
        oj.lyrv[7] = -1427877900;
        oj.lyrv[8] = 1662970535;
        oj.lyrv[9] = -1095603238;
        oj.lyrv[10] = -1232426038;
        oj.lyrv[11] = 709073951;
        oj.lyrv[12] = -718872028;
        oj.lyrv[13] = 1486488402;
        oj.lyrv[14] = 149913921;
        oj.lyrv[15] = 462151235;
        oj.lyrv[16] = -1421741569;
        oj.lyrv[17] = -326290157;
        oj.lyrv[18] = -1165318019;
        oj.lyrv[19] = 1756957219;
        oj.lyrv[20] = 1881079242;
        oj.lyrv[21] = 1300212792;
        oj.lyrv[22] = 1464473367;
        oj.lyrv[23] = -361061694;
        oj.lyrv[24] = 249609170;
        oj.lyrv[25] = 1070804155;
        oj.lyrv[26] = -562799267;
        oj.lyrv[27] = -1785647259;
        oj.lyrv[28] = -1765680342;
        oj.lyrv[29] = -1905605674;
        oj.lyrv[30] = 85401543;
        oj.lyrv[31] = -174054148;
        oj.lyrv[32] = -1914868076;
        oj.lyrv[33] = -1475754411;
        oj.lyrv[34] = -845358206;
        oj.lyrv[35] = 275836801;
        oj.lyrv[36] = -1420974733;
        oj.lyrv[37] = -512564776;
        oj.lyrv[38] = -126855513;
        oj.lyrv[39] = -757203047;
        oj.lyrv[40] = -330091588;
        oj.lyrv[41] = -2134958516;
        oj.lyrv[42] = 846572487;
        oj.lyrv[43] = -497295627;
        oj.lyrv[44] = 106919732;
        oj.lyrv[45] = -1805338694;
        oj.lyrv[46] = -947739084;
        oj.lyrv[47] = 1785722044;
        oj.lyrv[48] = -1219592391;
        oj.lyrv[49] = 2127548260;
        oj.lyrv[50] = -1201752688;
        oj.lyrv[51] = -1825518528;
        oj.lyrv[52] = 443393408;
        oj.lyrv[53] = -1225480074;
        oj.lyrv[54] = 956919332;
        oj.lyrv[55] = 109672348;
        oj.lyrv[56] = 55042680;
        oj.lyrv[57] = 1904586451;
        oj.lyrv[58] = 1773343427;
        oj.lyrv[59] = 1973259029;
        oj.lyrv[60] = -428869382;
        oj.lyrv[61] = -1121666945;
        oj.lyrv[62] = -623333433;
        oj.lyrv[63] = 1946057380;
        oj.lyrv[64] = 1805024794;
        oj.lyrv[65] = -1419877914;
        oj.lyrv[66] = 1847387054;
        oj.lyrv[67] = 1120278303;
        oj.lyrv[68] = -786530963;
        oj.lyrv[69] = 898143389;
        oj.lyrv[70] = 658019698;
        oj.lyrv[71] = 1771416463;
        oj.lyrv[72] = -94121370;
        oj.lyrv[73] = -1832580017;
        oj.lyrv[74] = 1314633315;
        oj.lyrv[75] = 442387562;
        oj.lyrv[76] = 866750467;
        oj.lyrv[77] = 390292896;
        oj.lyrv[78] = -1026676353;
        oj.lyrv[79] = 1411971718;
        oj.lyrv[80] = -1347327423;
        oj.lyrv[81] = 1994349208;
        oj.lyrv[82] = 256309855;
        oj.lyrv[83] = -1649965656;
        oj.lyrv[84] = 1327083359;
        oj.lyrv[85] = 695781862;
        oj.lyrv[86] = -1472063844;
        oj.lyrv[87] = -945286008;
        oj.lyrv[88] = -545726807;
        oj.lyrv[89] = -1997044708;
        oj.lyrv[90] = 1647819069;
        oj.lyrv[91] = 997549508;
        oj.lyrv[92] = -1399990186;
        oj.lyrv[93] = -77940904;
        oj.lyrv[94] = 1375948240;
        oj.lyrv[95] = 399085448;
        oj.lyrv[96] = 1644310903;
        oj.lyrv[97] = -2108099180;
        oj.lyrv[98] = -1483411783;
        oj.lyrv[99] = -1603699123;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ class_1921 lambda$static$1(class_2960 var0) {
        v0 /* !! */  = oj.uv;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(oj.lyrn("lzuc", lyrk(int ), (int)425) - oj.lyrn("lzub", lyrk(int ), (int)424));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -700101195: {
                    continue block22;
                }
                case 1798372139: {
                    break block22;
                }
            }
            break;
        }
        var4_1 = oj.c;
        v1 /* !! */  = oj.uv;
        if (true) ** GOTO lbl15
        block23: while (true) {
            v1 /* !! */  = (long)(v2 - oj.lyrn("lzud", lyrk(int ), (int)426));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -818453898: {
                    v2 = oj.lyrn("lzue", lyrk(int ), (int)427);
                    continue block23;
                }
                case 110521738: {
                    v2 = oj.lyrn("lzuf", lyrk(int ), (int)428);
                    continue block23;
                }
                case 1675513449: {
                    v2 = oj.lyrn("lzug", lyrk(int ), (int)429);
                    continue block23;
                }
                case 1798372139: {
                    break block23;
                }
            }
            break;
        }
        var3_2 /* !! */  = oj.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = oj.uv - oj.lyrn("lzuh", lyrk(int ), (int)430)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == oj.lyrn("lzui", lyrt(int ), (int)314)) break;
            v3 /* !! */  = (long)oj.lyrn("lzuj", lyrt(int ), (int)315);
        }
        var2_3 = oj.a;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_1) {
                    throw null;
lbl39:
                    // 2 sources

                    return null;
                }
                if (var2_3 || var2_3) ** GOTO lbl39
                v4 /* !! */  = oj.uv;
                if (true) ** GOTO lbl46
                block26: while (true) {
                    v4 /* !! */  = (long)(oj.lyrn("lzul", lyrk(int ), (int)432) - oj.lyrn("lzuk", lyrk(int ), (int)431));
lbl46:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 1749326931: {
                            continue block26;
                        }
                        case 1798372139: {
                            break block26;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = oj.uv - oj.lyrn("lzum", lyrk(int ), (int)433)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == oj.lyrn("lzun", lyrt(int ), (int)316)) break;
                    v5 /* !! */  = (long)oj.lyrn("lzuo", lyrt(int ), (int)317);
                }
                v6 = class_12247.method_75927((RenderPipeline)oj.ROMB_ESP_PIPELINE);
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = oj.uv - oj.lyrn("lzup", lyrk(int ), (int)434)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == oj.lyrn("lzuq", lyrt(int ), (int)318)) break;
                    v7 /* !! */  = (long)oj.lyrn("lzur", lyrt(int ), (int)319);
                }
                v8 = v6.method_75934("Sampler0", var0);
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = oj.uv - oj.lyrn("lzus", lyrk(int ), (int)435)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == oj.lyrn("lzut", lyrt(int ), (int)320)) break;
                    v9 /* !! */  = (long)oj.lyrn("lzuu", lyrt(int ), (int)321);
                }
                v10 = v8.method_75937();
                v11 = oj.lyrn("lzuv", lyrt(int ), (int)322);
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_4 = oj.uv - oj.lyrn("lzuw", lyrk(int ), (int)436)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == oj.lyrn("lzux", lyrt(int ), (int)323)) break;
                    v12 /* !! */  = (long)oj.lyrn("lzuy", lyrt(int ), (int)324);
                }
                v13 = v10.method_75929((int)v11);
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_5 = oj.uv - oj.lyrn("lzuz", lyrk(int ), (int)437)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == oj.lyrn("lzva", lyrt(int ), (int)325)) break;
                    v14 /* !! */  = (long)oj.lyrn("lzvb", lyrt(int ), (int)326);
                }
                var1_4 = v13.method_75938();
                if (var2_3 || var2_3) ** continue;
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_6 = oj.uv - oj.lyrn("lzvc", lyrk(int ), (int)438)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == oj.lyrn("lzvd", lyrt(int ), (int)327)) break;
                    v15 /* !! */  = (long)oj.lyrn("lzve", lyrt(int ), (int)328);
                }
                return class_1921.method_75940((String)"wtex", (class_12247)var1_4);
            }
lbl89:
            // 3 sources

            case 0: {
                var3_2 /* !! */  = (int)oj.lyrn("lzvf", lyrt(int ), (int)329);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl107
            }
            case 1: {
                var3_2 /* !! */  = (int)oj.lyrn("lzvg", lyrt(int ), (int)330);
                if (!var4_1) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)oj.lyrn("lzvh", lyrt(int ), (int)331);
                    if (!var4_1) ** GOTO lbl89
                    throw null;
                }
            }
            case 3: {
                var3_2 /* !! */  = (int)oj.lyrn("lzvi", lyrt(int ), (int)332);
                if (!var4_1) ** GOTO lbl89
                throw null;
            }
lbl107:
            // 2 sources

            case 4: {
                do {
                    var3_2 /* !! */  = (int)oj.lyrn("lzvj", lyrt(int ), (int)333);
                } while (!var4_1);
                throw null;
            }
            case 5: 
        }
        var3_2 /* !! */  = (int)oj.lyrn("lzvk", lyrt(int ), (int)334);
        ** while (!var4_1)
lbl115:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lzzn() {
        oj.lyrm[0] = -8446271696088283393L;
        oj.lyrm[1] = 4434710702000113292L;
        oj.lyrm[2] = 2856206892513112889L;
        oj.lyrm[3] = 7688115397562923254L;
        oj.lyrm[4] = 8797773839010591507L;
        oj.lyrm[5] = -877660001532807175L;
        oj.lyrm[6] = 5695524035674515434L;
        oj.lyrm[7] = -2217570997818037655L;
        oj.lyrm[8] = -3928153982299007355L;
        oj.lyrm[9] = 3385002302915869870L;
        oj.lyrm[10] = 3102658563701236219L;
        oj.lyrm[11] = 6433703697177246487L;
        oj.lyrm[12] = 7530436126059637807L;
        oj.lyrm[13] = 6535575534216898019L;
        oj.lyrm[14] = 5224973983498269144L;
        oj.lyrm[15] = 5216046087216925843L;
        oj.lyrm[16] = -3391119263962123594L;
        oj.lyrm[17] = 366124293139215596L;
        oj.lyrm[18] = -7466663009767773276L;
        oj.lyrm[19] = 7162241106827560015L;
        oj.lyrm[20] = -8022668178219443920L;
        oj.lyrm[21] = -4607072184735808053L;
        oj.lyrm[22] = 2419898858750783345L;
        oj.lyrm[23] = 4814709394807876085L;
        oj.lyrm[24] = 1692769240065774204L;
        oj.lyrm[25] = -2454290668610051719L;
        oj.lyrm[26] = 4309430114292397766L;
        oj.lyrm[27] = 1372125997996583374L;
        oj.lyrm[28] = 320787360376967375L;
        oj.lyrm[29] = -9131214431584272955L;
        oj.lyrm[30] = 4847362611810613025L;
        oj.lyrm[31] = 6260294823396861601L;
        oj.lyrm[32] = 659268970369127221L;
        oj.lyrm[33] = -306617682134457236L;
        oj.lyrm[34] = 47214205097293177L;
        oj.lyrm[35] = 7372143303671386555L;
        oj.lyrm[36] = -3044241700229589942L;
        oj.lyrm[37] = 3816422518660433274L;
        oj.lyrm[38] = -7712877387069708507L;
        oj.lyrm[39] = -7007104804712249540L;
        oj.lyrm[40] = 2260505707762053133L;
        oj.lyrm[41] = 7163492758931036473L;
        oj.lyrm[42] = -5577740669905162653L;
        oj.lyrm[43] = -6553428595459296824L;
        oj.lyrm[44] = 1921259027909543609L;
        oj.lyrm[45] = -6926293057449564045L;
        oj.lyrm[46] = -6546428875877663246L;
        oj.lyrm[47] = -504138346006671067L;
        oj.lyrm[48] = 1327627801247022223L;
        oj.lyrm[49] = -8527515911420924514L;
        oj.lyrm[50] = 9045523545282754362L;
        oj.lyrm[51] = 5110988417407560657L;
        oj.lyrm[52] = -7729609701863108677L;
        oj.lyrm[53] = 721486650028938373L;
        oj.lyrm[54] = -3843203451753418724L;
        oj.lyrm[55] = 8904863699054870711L;
        oj.lyrm[56] = -2311270548785181086L;
        oj.lyrm[57] = -4684843852012673858L;
        oj.lyrm[58] = 7195801190671826173L;
        oj.lyrm[59] = -32088522075536525L;
        oj.lyrm[60] = 3748203587260694164L;
        oj.lyrm[61] = -563678454182015341L;
        oj.lyrm[62] = 8423473617583659801L;
        oj.lyrm[63] = 2098773587582051786L;
        oj.lyrm[64] = -1380650079358825932L;
        oj.lyrm[65] = -2694966441705506092L;
        oj.lyrm[66] = -7311870723152706481L;
        oj.lyrm[67] = -6165327637973441778L;
        oj.lyrm[68] = 2877946878498164193L;
        oj.lyrm[69] = 1978594331377723766L;
        oj.lyrm[70] = 1061839304140425719L;
        oj.lyrm[71] = 7572719560679592669L;
        oj.lyrm[72] = -7357140708901407947L;
        oj.lyrm[73] = 3349373821588095565L;
        oj.lyrm[74] = -5848606414306207306L;
        oj.lyrm[75] = 5824180026464178352L;
        oj.lyrm[76] = -6051364437493849919L;
        oj.lyrm[77] = -4457859543996724446L;
        oj.lyrm[78] = 3080771958828717378L;
        oj.lyrm[79] = -2910609059131233971L;
        oj.lyrm[80] = -5478015662108087346L;
        oj.lyrm[81] = 6037961268675555249L;
        oj.lyrm[82] = -150323732398482211L;
        oj.lyrm[83] = 1883611962183887876L;
        oj.lyrm[84] = 2340862269978617200L;
        oj.lyrm[85] = -4778653801752856043L;
        oj.lyrm[86] = 6976454201390217946L;
        oj.lyrm[87] = -3369793973785730042L;
        oj.lyrm[88] = -1201394723606766892L;
        oj.lyrm[89] = -5750239955478616296L;
        oj.lyrm[90] = 2427489152159052743L;
        oj.lyrm[91] = 959689628210089871L;
        oj.lyrm[92] = -8920605848890356190L;
        oj.lyrm[93] = -3981438160088776426L;
        oj.lyrm[94] = -6392145846906704422L;
        oj.lyrm[95] = -2121256087931904874L;
        oj.lyrm[96] = 414210200251817095L;
        oj.lyrm[97] = 3339503441261476502L;
        oj.lyrm[98] = -4336144403230172106L;
        oj.lyrm[99] = 6577965347431187171L;
    }

    private static /* synthetic */ void lzzr() {
        oj.lyrm[400] = 2944965428029637331L;
        oj.lyrm[401] = -4219610317823170343L;
        oj.lyrm[402] = 3845349536764753989L;
        oj.lyrm[403] = -945976141268828375L;
        oj.lyrm[404] = -378977222852368185L;
        oj.lyrm[405] = 7730622798835626756L;
        oj.lyrm[406] = -5978548052635478810L;
        oj.lyrm[407] = -2674504632314971195L;
        oj.lyrm[408] = 3166831324889502338L;
        oj.lyrm[409] = 2307923173156358279L;
        oj.lyrm[410] = 8902755452667662878L;
        oj.lyrm[411] = 926708493109288694L;
        oj.lyrm[412] = -1192628289702289873L;
        oj.lyrm[413] = 4568692437847368205L;
        oj.lyrm[414] = -2399656317389454552L;
        oj.lyrm[415] = 1262711119513553661L;
        oj.lyrm[416] = 5369486516830190447L;
        oj.lyrm[417] = 4209605057463651485L;
        oj.lyrm[418] = 1045044450852527759L;
        oj.lyrm[419] = 3721917772706381600L;
        oj.lyrm[420] = -3894400346454792806L;
        oj.lyrm[421] = -6222057629949318192L;
        oj.lyrm[422] = 2110792543831617831L;
        oj.lyrm[423] = 2754486916136119784L;
        oj.lyrm[424] = -2988729717892094914L;
        oj.lyrm[425] = -8148451602906459148L;
        oj.lyrm[426] = 7100042127263092237L;
        oj.lyrm[427] = -8556403463490406585L;
        oj.lyrm[428] = 7890284593610749590L;
        oj.lyrm[429] = -854200455830272792L;
        oj.lyrm[430] = -3272840502361851644L;
        oj.lyrm[431] = 7378356281160730228L;
        oj.lyrm[432] = 3268434799490354527L;
        oj.lyrm[433] = -2138919115204244534L;
        oj.lyrm[434] = -406378468610449214L;
        oj.lyrm[435] = 4996859086438241349L;
        oj.lyrm[436] = 7644765794968974681L;
        oj.lyrm[437] = -2320658744910085399L;
        oj.lyrm[438] = 3276154010348575906L;
        oj.lyrm[439] = 5113189081674432126L;
        oj.lyrm[440] = -4310791776142237737L;
        oj.lyrm[441] = -1771791448845525004L;
        oj.lyrm[442] = 877843697124005407L;
        oj.lyrm[443] = -3042883855081367195L;
        oj.lyrm[444] = -7934977780834282887L;
        oj.lyrm[445] = 5388625921272596439L;
        oj.lyrm[446] = -6764023973371400669L;
        oj.lyrm[447] = 430912045125879852L;
        oj.lyrm[448] = -7534372662000888076L;
        oj.lyrm[449] = -1243862233573406609L;
        oj.lyrm[450] = 3639664299777556324L;
        oj.lyrm[451] = 6025966028941027155L;
        oj.lyrm[452] = -2736239820905171718L;
        oj.lyrm[453] = -4464851887959184222L;
        oj.lyrm[454] = -4199044984725909036L;
        oj.lyrm[455] = -942556617389646196L;
        oj.lyrm[456] = -8078351175592017687L;
        oj.lyrm[457] = 2988191623823180560L;
    }

    private static /* synthetic */ void lzze() {
        oj.lyrv[100] = -943221330;
        oj.lyrv[101] = 1027387156;
        oj.lyrv[102] = -1033262303;
        oj.lyrv[103] = -484875456;
        oj.lyrv[104] = -264301661;
        oj.lyrv[105] = 67111461;
        oj.lyrv[106] = -472202588;
        oj.lyrv[107] = 685037246;
        oj.lyrv[108] = -2014965140;
        oj.lyrv[109] = 1218235498;
        oj.lyrv[110] = 1055821102;
        oj.lyrv[111] = -1526352768;
        oj.lyrv[112] = 892411618;
        oj.lyrv[113] = 833513052;
        oj.lyrv[114] = 1362645533;
        oj.lyrv[115] = 430324105;
        oj.lyrv[116] = 1780559623;
        oj.lyrv[117] = -540748135;
        oj.lyrv[118] = 1348717638;
        oj.lyrv[119] = -335000826;
        oj.lyrv[120] = -113602175;
        oj.lyrv[121] = 1532718507;
        oj.lyrv[122] = -489487753;
        oj.lyrv[123] = 349799642;
        oj.lyrv[124] = 849227185;
        oj.lyrv[125] = -1436618959;
        oj.lyrv[126] = -972386487;
        oj.lyrv[127] = -1682391905;
        oj.lyrv[128] = -1532785887;
        oj.lyrv[129] = 1895764308;
        oj.lyrv[130] = -1529209281;
        oj.lyrv[131] = -421557700;
        oj.lyrv[132] = -1338508604;
        oj.lyrv[133] = 1897603711;
        oj.lyrv[134] = -1792217041;
        oj.lyrv[135] = 122705000;
        oj.lyrv[136] = -1598971040;
        oj.lyrv[137] = -1549879979;
        oj.lyrv[138] = -1809117557;
        oj.lyrv[139] = -1739944196;
        oj.lyrv[140] = -1519922405;
        oj.lyrv[141] = -633184301;
        oj.lyrv[142] = 1245971347;
        oj.lyrv[143] = -377983202;
        oj.lyrv[144] = -1120221294;
        oj.lyrv[145] = 262680853;
        oj.lyrv[146] = -1069892801;
        oj.lyrv[147] = 1366738337;
        oj.lyrv[148] = -1329250332;
        oj.lyrv[149] = -699477861;
        oj.lyrv[150] = -196794752;
        oj.lyrv[151] = -674753469;
        oj.lyrv[152] = 1922361536;
        oj.lyrv[153] = 1909083223;
        oj.lyrv[154] = -1407501884;
        oj.lyrv[155] = -1458210452;
        oj.lyrv[156] = 1737249976;
        oj.lyrv[157] = -1626137138;
        oj.lyrv[158] = -1542177436;
        oj.lyrv[159] = -1736074692;
        oj.lyrv[160] = -531155846;
        oj.lyrv[161] = -1055553714;
        oj.lyrv[162] = -331974918;
        oj.lyrv[163] = -1932320503;
        oj.lyrv[164] = 145369671;
        oj.lyrv[165] = -1913828850;
        oj.lyrv[166] = -2134283413;
        oj.lyrv[167] = 2082457452;
        oj.lyrv[168] = -611559582;
        oj.lyrv[169] = 1404161877;
        oj.lyrv[170] = 1997870549;
        oj.lyrv[171] = 60781037;
        oj.lyrv[172] = 1609560919;
        oj.lyrv[173] = -1899026793;
        oj.lyrv[174] = -2050728982;
        oj.lyrv[175] = 585958845;
        oj.lyrv[176] = 795863424;
        oj.lyrv[177] = 300788805;
        oj.lyrv[178] = 373205866;
        oj.lyrv[179] = 1727148468;
        oj.lyrv[180] = 688239023;
        oj.lyrv[181] = 1845938965;
        oj.lyrv[182] = -140339515;
        oj.lyrv[183] = 195582079;
        oj.lyrv[184] = 1605591420;
        oj.lyrv[185] = -1851522080;
        oj.lyrv[186] = 1826192831;
        oj.lyrv[187] = 1947674523;
        oj.lyrv[188] = -10140301;
        oj.lyrv[189] = -1702935243;
        oj.lyrv[190] = -1461241054;
        oj.lyrv[191] = 2009092679;
        oj.lyrv[192] = -187132884;
        oj.lyrv[193] = -1426879355;
        oj.lyrv[194] = 14193259;
        oj.lyrv[195] = -1801959997;
        oj.lyrv[196] = -1943128077;
        oj.lyrv[197] = -1638277919;
        oj.lyrv[198] = 1717837770;
        oj.lyrv[199] = -715293239;
    }

    private static /* synthetic */ void lzzi() {
        oj.lyrl[0] = 8986604975986180117L;
        oj.lyrl[1] = -1471656663946108816L;
        oj.lyrl[2] = -6347215497802795305L;
        oj.lyrl[3] = -174772744064074708L;
        oj.lyrl[4] = 70288312299214641L;
        oj.lyrl[5] = -4487294772025833805L;
        oj.lyrl[6] = -2572174385627636635L;
        oj.lyrl[7] = -5250688186498171620L;
        oj.lyrl[8] = -2673512585017956713L;
        oj.lyrl[9] = 7525486184603235212L;
        oj.lyrl[10] = 3454762112667860152L;
        oj.lyrl[11] = -3293809411953220599L;
        oj.lyrl[12] = -8236556885878283842L;
        oj.lyrl[13] = -969323304955080224L;
        oj.lyrl[14] = -3863731375163110823L;
        oj.lyrl[15] = 239042932015224615L;
        oj.lyrl[16] = 1037413411975958641L;
        oj.lyrl[17] = -2657530210458321952L;
        oj.lyrl[18] = 6759853717814659402L;
        oj.lyrl[19] = 8824929446557428681L;
        oj.lyrl[20] = 3285006656287540383L;
        oj.lyrl[21] = 4971858595432152505L;
        oj.lyrl[22] = 8157480856513103200L;
        oj.lyrl[23] = -413428205278039999L;
        oj.lyrl[24] = -1287770273489694507L;
        oj.lyrl[25] = -8876736695996759208L;
        oj.lyrl[26] = -8605662086197670227L;
        oj.lyrl[27] = 791179942261635624L;
        oj.lyrl[28] = 8797197129029643054L;
        oj.lyrl[29] = 8225287969136704193L;
        oj.lyrl[30] = 1695122188163761033L;
        oj.lyrl[31] = 4673954160370830051L;
        oj.lyrl[32] = -1637890628537736121L;
        oj.lyrl[33] = 7717682910148878662L;
        oj.lyrl[34] = 1851326422815610815L;
        oj.lyrl[35] = -3586070240032418338L;
        oj.lyrl[36] = 6623075393598876307L;
        oj.lyrl[37] = 1569756174203917141L;
        oj.lyrl[38] = -4741370702365085251L;
        oj.lyrl[39] = 8230496563170521749L;
        oj.lyrl[40] = -6691771178886787989L;
        oj.lyrl[41] = -358785850096544229L;
        oj.lyrl[42] = -397536155893904910L;
        oj.lyrl[43] = -4410234271219553152L;
        oj.lyrl[44] = -5006214656738941729L;
        oj.lyrl[45] = 5654340813919952212L;
        oj.lyrl[46] = -7843394504036406071L;
        oj.lyrl[47] = 5248932904917830551L;
        oj.lyrl[48] = -8712457982743828595L;
        oj.lyrl[49] = -617460576107883974L;
        oj.lyrl[50] = -3154911284174616775L;
        oj.lyrl[51] = -2730902905437425563L;
        oj.lyrl[52] = 6537391449962343918L;
        oj.lyrl[53] = -7556272297315989728L;
        oj.lyrl[54] = 5460566575193682504L;
        oj.lyrl[55] = 1002571867395980537L;
        oj.lyrl[56] = -7807202073345499885L;
        oj.lyrl[57] = -7957337669035031724L;
        oj.lyrl[58] = 4005653200500292611L;
        oj.lyrl[59] = -4311757934490925516L;
        oj.lyrl[60] = -4947264298965813982L;
        oj.lyrl[61] = -275726067391633151L;
        oj.lyrl[62] = -4808413774414178629L;
        oj.lyrl[63] = -716087652191351177L;
        oj.lyrl[64] = 6253575860902556122L;
        oj.lyrl[65] = -9075995269373525933L;
        oj.lyrl[66] = 7978220455752335982L;
        oj.lyrl[67] = -6299379069307954010L;
        oj.lyrl[68] = 671574121009551947L;
        oj.lyrl[69] = 7290655432529082852L;
        oj.lyrl[70] = -1281322836328687011L;
        oj.lyrl[71] = 1696222458796343083L;
        oj.lyrl[72] = -787924789403959761L;
        oj.lyrl[73] = -2491546046187664542L;
        oj.lyrl[74] = 3920161302143982959L;
        oj.lyrl[75] = -5209968442593115291L;
        oj.lyrl[76] = -499012736806874511L;
        oj.lyrl[77] = 3337474928187265934L;
        oj.lyrl[78] = -5998385288142603099L;
        oj.lyrl[79] = -6733305628188022254L;
        oj.lyrl[80] = -3869447855750065049L;
        oj.lyrl[81] = 891569715311288376L;
        oj.lyrl[82] = 9022544085970903320L;
        oj.lyrl[83] = 2865245244480117094L;
        oj.lyrl[84] = -1076797780339479032L;
        oj.lyrl[85] = 419013196247498824L;
        oj.lyrl[86] = -6736199883297682263L;
        oj.lyrl[87] = -4208731405340002571L;
        oj.lyrl[88] = -787322915184811382L;
        oj.lyrl[89] = -7799472433476887414L;
        oj.lyrl[90] = 185439259990248485L;
        oj.lyrl[91] = -5409660589751560812L;
        oj.lyrl[92] = 7216108122682010532L;
        oj.lyrl[93] = -2886151436729752732L;
        oj.lyrl[94] = 2455043009826810369L;
        oj.lyrl[95] = -5509925830288759386L;
        oj.lyrl[96] = -7539239594823661408L;
        oj.lyrl[97] = -6031761876375899527L;
        oj.lyrl[98] = 7523396308113967211L;
        oj.lyrl[99] = -4728715240986228572L;
    }

    private static /* synthetic */ void lzyz() {
        oj.lyru[100] = 520470644;
        oj.lyru[101] = 1027391252;
        oj.lyru[102] = 1033262302;
        oj.lyru[103] = 1429660294;
        oj.lyru[104] = -264301658;
        oj.lyru[105] = 67111463;
        oj.lyru[106] = -472202588;
        oj.lyru[107] = 685037242;
        oj.lyru[108] = -2014965138;
        oj.lyru[109] = 1218235499;
        oj.lyru[110] = 1055821103;
        oj.lyru[111] = 365737205;
        oj.lyru[112] = -892411619;
        oj.lyru[113] = 1424074135;
        oj.lyru[114] = 1362645532;
        oj.lyru[115] = -2005336526;
        oj.lyru[116] = -1780559624;
        oj.lyru[117] = -1488613461;
        oj.lyru[118] = -1348717639;
        oj.lyru[119] = -1165271227;
        oj.lyru[120] = -113600639;
        oj.lyru[121] = -1532718508;
        oj.lyru[122] = -1828469621;
        oj.lyru[123] = -349799643;
        oj.lyru[124] = 983743180;
        oj.lyru[125] = 1436618958;
        oj.lyru[126] = -1445108138;
        oj.lyru[127] = -1682391910;
        oj.lyru[128] = -1532785887;
        oj.lyru[129] = 1895764310;
        oj.lyru[130] = -1529209284;
        oj.lyru[131] = -421557698;
        oj.lyru[132] = -1338508608;
        oj.lyru[133] = -1897603712;
        oj.lyru[134] = -919597329;
        oj.lyru[135] = -122705001;
        oj.lyru[136] = 1209791935;
        oj.lyru[137] = 1549879978;
        oj.lyru[138] = -1964312387;
        oj.lyru[139] = -1739945732;
        oj.lyru[140] = -1519922406;
        oj.lyru[141] = -155932075;
        oj.lyru[142] = 1245971347;
        oj.lyru[143] = -377983206;
        oj.lyru[144] = -1120221295;
        oj.lyru[145] = 262680853;
        oj.lyru[146] = -1069892806;
        oj.lyru[147] = 1366738337;
        oj.lyru[148] = 1329250331;
        oj.lyru[149] = -423733332;
        oj.lyru[150] = 196794751;
        oj.lyru[151] = -1023560689;
        oj.lyru[152] = 1922361537;
        oj.lyru[153] = 1097321545;
        oj.lyru[154] = -1407500348;
        oj.lyru[155] = -1458210451;
        oj.lyru[156] = 1737249978;
        oj.lyru[157] = -1626137137;
        oj.lyru[158] = -1542177433;
        oj.lyru[159] = -1736074692;
        oj.lyru[160] = -531155847;
        oj.lyru[161] = 1055553713;
        oj.lyru[162] = -1465862978;
        oj.lyru[163] = 1932320502;
        oj.lyru[164] = -742717844;
        oj.lyru[165] = 1913828849;
        oj.lyru[166] = -329347829;
        oj.lyru[167] = -2082457453;
        oj.lyru[168] = -702112979;
        oj.lyru[169] = -1404161878;
        oj.lyru[170] = 212595140;
        oj.lyru[171] = -60781038;
        oj.lyru[172] = -1054443428;
        oj.lyru[173] = -1899028329;
        oj.lyru[174] = 2050728981;
        oj.lyru[175] = 327201398;
        oj.lyru[176] = 795863429;
        oj.lyru[177] = 300788807;
        oj.lyru[178] = 373205866;
        oj.lyru[179] = 1727148464;
        oj.lyru[180] = 688239023;
        oj.lyru[181] = 1845938967;
        oj.lyru[182] = 140339514;
        oj.lyru[183] = -971638676;
        oj.lyru[184] = -1605591421;
        oj.lyru[185] = 149674851;
        oj.lyru[186] = 1826192319;
        oj.lyru[187] = 1947674522;
        oj.lyru[188] = 1391728565;
        oj.lyru[189] = -1702935242;
        oj.lyru[190] = -1461241054;
        oj.lyru[191] = 2009092675;
        oj.lyru[192] = -187132881;
        oj.lyru[193] = -1426879359;
        oj.lyru[194] = 14193259;
        oj.lyru[195] = 1801959996;
        oj.lyru[196] = 489314651;
        oj.lyru[197] = -1638277920;
        oj.lyru[198] = -1325335552;
        oj.lyru[199] = 715293238;
    }

    private static /* synthetic */ void lzzq() {
        oj.lyrm[300] = 5312074140246288519L;
        oj.lyrm[301] = 2064643928751021348L;
        oj.lyrm[302] = 8997096057279025159L;
        oj.lyrm[303] = -1040712162065353234L;
        oj.lyrm[304] = 1715945378418566424L;
        oj.lyrm[305] = 6074495011100113944L;
        oj.lyrm[306] = 6895274141537798196L;
        oj.lyrm[307] = -8139733849784299L;
        oj.lyrm[308] = 1753607980091293039L;
        oj.lyrm[309] = 7950867247641384011L;
        oj.lyrm[310] = 1249215698729119877L;
        oj.lyrm[311] = 6245025926657215146L;
        oj.lyrm[312] = -6848773666547299585L;
        oj.lyrm[313] = -8312508711149314347L;
        oj.lyrm[314] = 3837997004938929820L;
        oj.lyrm[315] = -2186537789346712451L;
        oj.lyrm[316] = -843031106661264793L;
        oj.lyrm[317] = -726730593379741226L;
        oj.lyrm[318] = 6956192252089148869L;
        oj.lyrm[319] = -1389494957767917194L;
        oj.lyrm[320] = 1407604003475806951L;
        oj.lyrm[321] = -8891091365057311174L;
        oj.lyrm[322] = -7495795473937758384L;
        oj.lyrm[323] = -3045624610862147223L;
        oj.lyrm[324] = 9127302949643802772L;
        oj.lyrm[325] = 1956387079530229530L;
        oj.lyrm[326] = -4511145392556500639L;
        oj.lyrm[327] = 4772681547883003091L;
        oj.lyrm[328] = -2163200832062389565L;
        oj.lyrm[329] = 5413975956715062120L;
        oj.lyrm[330] = 6662052704113740173L;
        oj.lyrm[331] = -3280602601327693480L;
        oj.lyrm[332] = 5159926311604883231L;
        oj.lyrm[333] = -1385455095045307303L;
        oj.lyrm[334] = -244930212077814949L;
        oj.lyrm[335] = 3325601574864504985L;
        oj.lyrm[336] = -197310256691480522L;
        oj.lyrm[337] = 4843059593608586015L;
        oj.lyrm[338] = -4938925183582398485L;
        oj.lyrm[339] = 2738533157551489562L;
        oj.lyrm[340] = -5482062951247195626L;
        oj.lyrm[341] = 455292733922627235L;
        oj.lyrm[342] = 5816994696429354851L;
        oj.lyrm[343] = -5775053940202710636L;
        oj.lyrm[344] = -9081479028078374081L;
        oj.lyrm[345] = -6631520334325625250L;
        oj.lyrm[346] = -8131412812596101935L;
        oj.lyrm[347] = 7144692267194892058L;
        oj.lyrm[348] = 6568705740013806379L;
        oj.lyrm[349] = 7002669925640642013L;
        oj.lyrm[350] = -3665447073783925390L;
        oj.lyrm[351] = -8754819516218589866L;
        oj.lyrm[352] = -1522847252718687966L;
        oj.lyrm[353] = 4541259671597178425L;
        oj.lyrm[354] = -5118258254479931762L;
        oj.lyrm[355] = -367481018094809968L;
        oj.lyrm[356] = -8016732393827694191L;
        oj.lyrm[357] = -3130810677956330469L;
        oj.lyrm[358] = -4244216346090303358L;
        oj.lyrm[359] = 830088596834866667L;
        oj.lyrm[360] = -7431976381464158655L;
        oj.lyrm[361] = 6851846929449830644L;
        oj.lyrm[362] = 8138264249942530149L;
        oj.lyrm[363] = -250649936803562561L;
        oj.lyrm[364] = -8855106198513029554L;
        oj.lyrm[365] = -8839650777527066767L;
        oj.lyrm[366] = -4112720150747812195L;
        oj.lyrm[367] = -1463083046749121801L;
        oj.lyrm[368] = -3340021521722964984L;
        oj.lyrm[369] = -806779981751223366L;
        oj.lyrm[370] = 5650226857917405643L;
        oj.lyrm[371] = -1924011846606755881L;
        oj.lyrm[372] = 5571408853409684487L;
        oj.lyrm[373] = -8379806340986113560L;
        oj.lyrm[374] = -5797750110134073572L;
        oj.lyrm[375] = 10773062179547705L;
        oj.lyrm[376] = -1295512434663199608L;
        oj.lyrm[377] = -5610425647482308444L;
        oj.lyrm[378] = 1032196056503774202L;
        oj.lyrm[379] = 6060020776714389589L;
        oj.lyrm[380] = 5350402659393360270L;
        oj.lyrm[381] = -6155447362098333160L;
        oj.lyrm[382] = 561352537781064282L;
        oj.lyrm[383] = 8985417285968551778L;
        oj.lyrm[384] = -8872645208218769747L;
        oj.lyrm[385] = -5014673982792760915L;
        oj.lyrm[386] = 7470254168881055804L;
        oj.lyrm[387] = -247935438931385284L;
        oj.lyrm[388] = 731653565479722498L;
        oj.lyrm[389] = -5678206562942057644L;
        oj.lyrm[390] = -2133874049061262287L;
        oj.lyrm[391] = -3612824535910647074L;
        oj.lyrm[392] = 3516909663688628914L;
        oj.lyrm[393] = 1421717111496464497L;
        oj.lyrm[394] = -6740864015745124915L;
        oj.lyrm[395] = -526201730866174220L;
        oj.lyrm[396] = -4140918630776790498L;
        oj.lyrm[397] = -1872598971513095608L;
        oj.lyrm[398] = -2301758985994615811L;
        oj.lyrm[399] = -4886302607628148446L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ class_1921 lambda$static$9(class_2960 var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = oj.uv - oj.lyrn("lzig", lyrk(int ), (int)249)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == oj.lyrn("lzih", lyrt(int ), (int)182)) break;
            v0 /* !! */  = (long)oj.lyrn("lzii", lyrt(int ), (int)183);
        }
        var4_1 = oj.c;
        v1 /* !! */  = oj.uv;
        if (true) ** GOTO lbl11
        block45: while (true) {
            v1 /* !! */  = (long)(v2 - oj.lyrn("lzij", lyrk(int ), (int)250));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1059281897: {
                    v2 = oj.lyrn("lzik", lyrk(int ), (int)251);
                    continue block45;
                }
                case 355157973: {
                    v2 = oj.lyrn("lzil", lyrk(int ), (int)252);
                    continue block45;
                }
                case 1125949873: {
                    v2 = oj.lyrn("lzim", lyrk(int ), (int)253);
                    continue block45;
                }
                case 1798372139: {
                    break block45;
                }
            }
            break;
        }
        var3_2 /* !! */  = oj.b;
        v3 /* !! */  = oj.uv;
        if (true) ** GOTO lbl28
        block46: while (true) {
            v3 /* !! */  = (long)(v4 - oj.lyrn("lzin", lyrk(int ), (int)254));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2045475036: {
                    v4 = oj.lyrn("lzio", lyrk(int ), (int)255);
                    continue block46;
                }
                case -338941417: {
                    v4 = oj.lyrn("lzip", lyrk(int ), (int)256);
                    continue block46;
                }
                case 1798372139: {
                    break block46;
                }
            }
            break;
        }
        var2_3 = oj.a;
        if (var4_1) {
            throw null;
lbl40:
            // 2 sources

            return null;
        }
        if (var2_3 || var2_3) ** GOTO lbl40
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v5 /* !! */  = oj.uv;
                if (true) ** GOTO lbl50
                block48: while (true) {
                    v5 /* !! */  = (long)(v6 - oj.lyrn("lziq", lyrk(int ), (int)257));
lbl50:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -699873980: {
                            v6 = oj.lyrn("lzir", lyrk(int ), (int)258);
                            continue block48;
                        }
                        case 1770779197: {
                            v6 = oj.lyrn("lzis", lyrk(int ), (int)259);
                            continue block48;
                        }
                        case 1798372139: {
                            break block48;
                        }
                    }
                    break;
                }
                v7 /* !! */  = oj.uv;
                if (true) ** GOTO lbl63
                block49: while (true) {
                    v7 /* !! */  = (long)(v8 - oj.lyrn("lzit", lyrk(int ), (int)260));
lbl63:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1836587828: {
                            v8 = oj.lyrn("lziu", lyrk(int ), (int)261);
                            continue block49;
                        }
                        case 730637861: {
                            v8 = oj.lyrn("lziv", lyrk(int ), (int)262);
                            continue block49;
                        }
                        case 1798372139: {
                            break block49;
                        }
                        case 2127496016: {
                            v8 = oj.lyrn("lziw", lyrk(int ), (int)263);
                            continue block49;
                        }
                    }
                    break;
                }
                v9 = class_12247.method_75927((RenderPipeline)oj.SHADER_HANDS_GRADIENT_PIPELINE);
                v10 /* !! */  = oj.uv;
                if (true) ** GOTO lbl80
                block50: while (true) {
                    v10 /* !! */  = (long)(oj.lyrn("lziy", lyrk(int ), (int)265) - oj.lyrn("lzix", lyrk(int ), (int)264));
lbl80:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case 1511455827: {
                            continue block50;
                        }
                        case 1798372139: {
                            break block50;
                        }
                    }
                    break;
                }
                v11 = v9.method_75934("Sampler0", var0);
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_1 = oj.uv - oj.lyrn("lziz", lyrk(int ), (int)266)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == oj.lyrn("lzja", lyrt(int ), (int)184)) break;
                    v12 /* !! */  = (long)oj.lyrn("lzjb", lyrt(int ), (int)185);
                }
                v13 = v11.method_75937();
                v14 = oj.lyrn("lzjc", lyrt(int ), (int)186);
                v15 /* !! */  = oj.uv;
                if (true) ** GOTO lbl97
                block52: while (true) {
                    v15 /* !! */  = (long)(v16 - oj.lyrn("lzjd", lyrk(int ), (int)267));
lbl97:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1181482877: {
                            v16 = oj.lyrn("lzje", lyrk(int ), (int)268);
                            continue block52;
                        }
                        case 947045363: {
                            v16 = oj.lyrn("lzjf", lyrk(int ), (int)269);
                            continue block52;
                        }
                        case 1560764253: {
                            v16 = oj.lyrn("lzjg", lyrk(int ), (int)270);
                            continue block52;
                        }
                        case 1798372139: {
                            break block52;
                        }
                    }
                    break;
                }
                v17 = v13.method_75929((int)v14);
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_2 = oj.uv - oj.lyrn("lzjh", lyrk(int ), (int)271)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == oj.lyrn("lzji", lyrt(int ), (int)187)) break;
                    v18 /* !! */  = (long)oj.lyrn("lzjj", lyrt(int ), (int)188);
                }
                var1_4 = v17.method_75938();
                if (var2_3 || var2_3) ** continue;
                v19 /* !! */  = oj.uv;
                if (true) ** GOTO lbl121
                block54: while (true) {
                    v19 /* !! */  = (long)(oj.lyrn("lzjl", lyrk(int ), (int)273) - oj.lyrn("lzjk", lyrk(int ), (int)272));
lbl121:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -169014836: {
                            continue block54;
                        }
                        case 1798372139: {
                            break block54;
                        }
                    }
                    break;
                }
                return class_1921.method_75940((String)"shader_hands_gradient", (class_12247)var1_4);
            }
lbl127:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)oj.lyrn("lzjm", lyrt(int ), (int)189);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl146
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)oj.lyrn("lzjn", lyrt(int ), (int)190);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl142
                    break;
                }
            }
            case 2: {
                var3_2 /* !! */  = (int)oj.lyrn("lzjo", lyrt(int ), (int)191);
                if (!var4_1) break;
                throw null;
            }
lbl142:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)oj.lyrn("lzjp", lyrt(int ), (int)192);
                if (!var4_1) ** GOTO lbl127
                throw null;
            }
lbl146:
            // 2 sources

            case 4: {
                var3_2 /* !! */  = (int)oj.lyrn("lzjq", lyrt(int ), (int)193);
                if (!var4_1) break;
                throw null;
            }
            case 5: 
        }
        var3_2 /* !! */  = (int)oj.lyrn("lzjr", lyrt(int ), (int)194);
        ** while (!var4_1)
lbl153:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ class_1921 lambda$static$13(class_2960 var0) {
        v0 /* !! */  = oj.uv;
        if (true) ** GOTO lbl5
        block30: while (true) {
            v0 /* !! */  = (long)(v1 - oj.lyrn("lzcb", lyrk(int ), (int)160));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2137145621: {
                    v1 = oj.lyrn("lzcc", lyrk(int ), (int)161);
                    continue block30;
                }
                case -1179947845: {
                    v1 = oj.lyrn("lzcd", lyrk(int ), (int)162);
                    continue block30;
                }
                case -410431758: {
                    v1 = oj.lyrn("lzce", lyrk(int ), (int)163);
                    continue block30;
                }
                case 1798372139: {
                    break block30;
                }
            }
            break;
        }
        var4_1 = oj.c;
        v2 /* !! */  = oj.uv;
        if (true) ** GOTO lbl22
        block31: while (true) {
            v2 /* !! */  = (long)(v3 - oj.lyrn("lzcf", lyrk(int ), (int)164));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 454651840: {
                    v3 = oj.lyrn("lzcg", lyrk(int ), (int)165);
                    continue block31;
                }
                case 459596058: {
                    v3 = oj.lyrn("lzch", lyrk(int ), (int)166);
                    continue block31;
                }
                case 1016488951: {
                    v3 = oj.lyrn("lzci", lyrk(int ), (int)167);
                    continue block31;
                }
                case 1798372139: {
                    break block31;
                }
            }
            break;
        }
        var3_2 /* !! */  = oj.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = oj.uv - oj.lyrn("lzcj", lyrk(int ), (int)168)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == oj.lyrn("lzck", lyrt(int ), (int)110)) break;
            v4 /* !! */  = (long)oj.lyrn("lzcl", lyrt(int ), (int)111);
        }
        var2_3 = oj.a;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_1) {
                    throw null;
lbl46:
                    // 2 sources

                    return null;
                }
                if (var2_3 || var2_3) ** GOTO lbl46
                v5 /* !! */  = oj.uv;
                if (true) ** GOTO lbl53
                block34: while (true) {
                    v5 /* !! */  = (long)(v6 - oj.lyrn("lzcm", lyrk(int ), (int)169));
lbl53:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1168418048: {
                            v6 = oj.lyrn("lzcn", lyrk(int ), (int)170);
                            continue block34;
                        }
                        case -309377833: {
                            v6 = oj.lyrn("lzco", lyrk(int ), (int)171);
                            continue block34;
                        }
                        case 1798372139: {
                            break block34;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = oj.uv - oj.lyrn("lzcp", lyrk(int ), (int)172)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == oj.lyrn("lzcq", lyrt(int ), (int)112)) break;
                    v7 /* !! */  = (long)oj.lyrn("lzcr", lyrt(int ), (int)113);
                }
                v8 = class_12247.method_75927((RenderPipeline)oj.SHADER_HANDS_BAKED_ITEM_FILL_PIPELINE);
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = oj.uv - oj.lyrn("lzcs", lyrk(int ), (int)173)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == oj.lyrn("lzct", lyrt(int ), (int)114)) break;
                    v9 /* !! */  = (long)oj.lyrn("lzcu", lyrt(int ), (int)115);
                }
                v10 = v8.method_75934("Sampler0", var0);
                v11 /* !! */  = oj.uv;
                if (true) ** GOTO lbl78
                block37: while (true) {
                    v11 /* !! */  = (long)(v12 - oj.lyrn("lzcv", lyrk(int ), (int)174));
lbl78:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1064898707: {
                            v12 = oj.lyrn("lzcw", lyrk(int ), (int)175);
                            continue block37;
                        }
                        case 28324298: {
                            v12 = oj.lyrn("lzcx", lyrk(int ), (int)176);
                            continue block37;
                        }
                        case 1798372139: {
                            break block37;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_3 = oj.uv - oj.lyrn("lzcy", lyrk(int ), (int)177)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == oj.lyrn("lzcz", lyrt(int ), (int)116)) break;
                    v13 /* !! */  = (long)oj.lyrn("lzda", lyrt(int ), (int)117);
                }
                v14 = v10.method_75931(on.OUTPUT_TARGET);
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_4 = oj.uv - oj.lyrn("lzdb", lyrk(int ), (int)178)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == oj.lyrn("lzdc", lyrt(int ), (int)118)) break;
                    v15 /* !! */  = (long)oj.lyrn("lzdd", lyrt(int ), (int)119);
                }
                v16 = v14.method_75937();
                v17 = oj.lyrn("lzde", lyrt(int ), (int)120);
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_5 = oj.uv - oj.lyrn("lzdf", lyrk(int ), (int)179)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == oj.lyrn("lzdg", lyrt(int ), (int)121)) break;
                    v18 /* !! */  = (long)oj.lyrn("lzdh", lyrt(int ), (int)122);
                }
                v19 = v16.method_75929((int)v17);
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_6 = oj.uv - oj.lyrn("lzdi", lyrk(int ), (int)180)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == oj.lyrn("lzdj", lyrt(int ), (int)123)) break;
                    v20 /* !! */  = (long)oj.lyrn("lzdk", lyrt(int ), (int)124);
                }
                var1_4 = v19.method_75938();
                if (var2_3 || var2_3) ** continue;
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_7 = oj.uv - oj.lyrn("lzdl", lyrk(int ), (int)181)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == oj.lyrn("lzdm", lyrt(int ), (int)125)) break;
                    v21 /* !! */  = (long)oj.lyrn("lzdn", lyrt(int ), (int)126);
                }
                return class_1921.method_75940((String)"shader_hands_trail_baked_item_fill", (class_12247)var1_4);
            }
            case 0: {
                var3_2 /* !! */  = (int)oj.lyrn("lzdo", lyrt(int ), (int)127);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl129
            }
            case 1: {
                var3_2 /* !! */  = (int)oj.lyrn("lzdp", lyrt(int ), (int)128);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl138
            }
lbl129:
            // 2 sources

            case 2: {
                do {
                    var3_2 /* !! */  = (int)oj.lyrn("lzdq", lyrt(int ), (int)129);
                } while (!var4_1);
                throw null;
            }
lbl134:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)oj.lyrn("lzdr", lyrt(int ), (int)130);
                if (!var4_1) break;
                throw null;
            }
lbl138:
            // 2 sources

            case 4: {
                var3_2 /* !! */  = (int)oj.lyrn("lzds", lyrt(int ), (int)131);
                if (!var4_1) ** GOTO lbl134
                throw null;
            }
            case 5: 
        }
        do {
            var3_2 /* !! */  = (int)oj.lyrn("lzdt", lyrt(int ), (int)132);
        } while (!var4_1);
        throw null;
    }

    private static /* synthetic */ void lzzg() {
        oj.lyrv[300] = -1366508874;
        oj.lyrv[301] = -2081435794;
        oj.lyrv[302] = -1414917993;
        oj.lyrv[303] = -1172063980;
        oj.lyrv[304] = -652819388;
        oj.lyrv[305] = 1189491548;
        oj.lyrv[306] = 1048567848;
        oj.lyrv[307] = -1468871786;
        oj.lyrv[308] = 944412703;
        oj.lyrv[309] = 632049573;
        oj.lyrv[310] = -1981077187;
        oj.lyrv[311] = 1371423576;
        oj.lyrv[312] = 104669761;
        oj.lyrv[313] = -935480777;
        oj.lyrv[314] = 1996186182;
        oj.lyrv[315] = -342598323;
        oj.lyrv[316] = -1815910954;
        oj.lyrv[317] = -23455119;
        oj.lyrv[318] = 1476503663;
        oj.lyrv[319] = 517462381;
        oj.lyrv[320] = -490683715;
        oj.lyrv[321] = 1161266512;
        oj.lyrv[322] = -1361660045;
        oj.lyrv[323] = 677415127;
        oj.lyrv[324] = -1309874785;
        oj.lyrv[325] = 1149284218;
        oj.lyrv[326] = -247759409;
        oj.lyrv[327] = -1613418087;
        oj.lyrv[328] = 1580123681;
        oj.lyrv[329] = 1131328648;
        oj.lyrv[330] = 1720062734;
        oj.lyrv[331] = -130297867;
        oj.lyrv[332] = -446584643;
        oj.lyrv[333] = -991373290;
        oj.lyrv[334] = -1645392113;
        oj.lyrv[335] = -1021263300;
        oj.lyrv[336] = 1849317155;
        oj.lyrv[337] = 846962258;
        oj.lyrv[338] = -937270040;
        oj.lyrv[339] = -1428312453;
        oj.lyrv[340] = -1431646494;
        oj.lyrv[341] = -585571526;
        oj.lyrv[342] = -1814132100;
        oj.lyrv[343] = 1123342411;
        oj.lyrv[344] = -1932834228;
        oj.lyrv[345] = -956740944;
        oj.lyrv[346] = -1287930725;
        oj.lyrv[347] = 959395624;
        oj.lyrv[348] = -1397549798;
        oj.lyrv[349] = 1675521209;
        oj.lyrv[350] = 429519243;
        oj.lyrv[351] = -1031768701;
        oj.lyrv[352] = 1923501491;
        oj.lyrv[353] = 2082800728;
        oj.lyrv[354] = -165068275;
        oj.lyrv[355] = 292140014;
        oj.lyrv[356] = 2105230287;
        oj.lyrv[357] = 1742816451;
        oj.lyrv[358] = -1999598649;
        oj.lyrv[359] = -1236711788;
        oj.lyrv[360] = 1136717580;
        oj.lyrv[361] = -1184878759;
        oj.lyrv[362] = -911433776;
        oj.lyrv[363] = -2107462613;
        oj.lyrv[364] = -154989821;
        oj.lyrv[365] = -126813405;
        oj.lyrv[366] = 1843381792;
        oj.lyrv[367] = -2010171844;
        oj.lyrv[368] = -1072837258;
        oj.lyrv[369] = -1612906868;
        oj.lyrv[370] = 1741104297;
        oj.lyrv[371] = -1777927073;
        oj.lyrv[372] = 1051633484;
        oj.lyrv[373] = -2105454610;
        oj.lyrv[374] = -1834447432;
        oj.lyrv[375] = -1835849780;
        oj.lyrv[376] = -1741329773;
        oj.lyrv[377] = -1801220796;
        oj.lyrv[378] = -920174690;
        oj.lyrv[379] = -740236238;
        oj.lyrv[380] = 1804815559;
        oj.lyrv[381] = -1080104156;
        oj.lyrv[382] = -497911150;
        oj.lyrv[383] = -546174521;
        oj.lyrv[384] = -1284421292;
        oj.lyrv[385] = 652132075;
        oj.lyrv[386] = -1469247274;
        oj.lyrv[387] = -505031520;
        oj.lyrv[388] = 657172569;
        oj.lyrv[389] = -1564805063;
        oj.lyrv[390] = -858041065;
        oj.lyrv[391] = -878363326;
        oj.lyrv[392] = 1211674030;
        oj.lyrv[393] = -2044838496;
        oj.lyrv[394] = -610858215;
        oj.lyrv[395] = 849593976;
        oj.lyrv[396] = 1369224232;
        oj.lyrv[397] = -31154025;
        oj.lyrv[398] = 73350803;
        oj.lyrv[399] = -922823578;
    }

    private static /* synthetic */ void lzzb() {
        oj.lyru[300] = -500867789;
        oj.lyru[301] = -2081435793;
        oj.lyru[302] = 990156693;
        oj.lyru[303] = -1172062444;
        oj.lyru[304] = 652819387;
        oj.lyru[305] = 1350556497;
        oj.lyru[306] = -1048567849;
        oj.lyru[307] = 1994364579;
        oj.lyru[308] = 944412703;
        oj.lyru[309] = 632049568;
        oj.lyru[310] = -1981077187;
        oj.lyru[311] = 1371423577;
        oj.lyru[312] = 104669760;
        oj.lyru[313] = -935480779;
        oj.lyru[314] = -1996186183;
        oj.lyru[315] = 1225424571;
        oj.lyru[316] = 1815910953;
        oj.lyru[317] = 767972606;
        oj.lyru[318] = -1476503664;
        oj.lyru[319] = -230249390;
        oj.lyru[320] = 490683714;
        oj.lyru[321] = -1177298673;
        oj.lyru[322] = -1361661581;
        oj.lyru[323] = -677415128;
        oj.lyru[324] = -1495825661;
        oj.lyru[325] = -1149284219;
        oj.lyru[326] = 701040685;
        oj.lyru[327] = -1613418088;
        oj.lyru[328] = -1649933428;
        oj.lyru[329] = 1131328649;
        oj.lyru[330] = 1720062735;
        oj.lyru[331] = -130297871;
        oj.lyru[332] = -446584644;
        oj.lyru[333] = -991373292;
        oj.lyru[334] = -1645392113;
        oj.lyru[335] = 1021263299;
        oj.lyru[336] = -473374178;
        oj.lyru[337] = -846962259;
        oj.lyru[338] = 1096131350;
        oj.lyru[339] = 1428312452;
        oj.lyru[340] = -407768325;
        oj.lyru[341] = 585571525;
        oj.lyru[342] = 642762166;
        oj.lyru[343] = -1123342412;
        oj.lyru[344] = 2107381711;
        oj.lyru[345] = 956740943;
        oj.lyru[346] = -1449564913;
        oj.lyru[347] = 959395625;
        oj.lyru[348] = -1835472465;
        oj.lyru[349] = -1675521210;
        oj.lyru[350] = -274218314;
        oj.lyru[351] = 1031768700;
        oj.lyru[352] = 472674448;
        oj.lyru[353] = -2082800729;
        oj.lyru[354] = -1847583251;
        oj.lyru[355] = 292140013;
        oj.lyru[356] = 2105230285;
        oj.lyru[357] = 1742816454;
        oj.lyru[358] = -1999598655;
        oj.lyru[359] = -1236711788;
        oj.lyru[360] = 1136717577;
        oj.lyru[361] = -1184878753;
        oj.lyru[362] = -911433771;
        oj.lyru[363] = -2107462613;
        oj.lyru[364] = -154989821;
        oj.lyru[365] = -126813405;
        oj.lyru[366] = 1843381792;
        oj.lyru[367] = -2010171844;
        oj.lyru[368] = -1072837258;
        oj.lyru[369] = -1612906868;
        oj.lyru[370] = 1741096105;
        oj.lyru[371] = -1777927073;
        oj.lyru[372] = 1051633484;
        oj.lyru[373] = -2105450514;
        oj.lyru[374] = -1834447432;
        oj.lyru[375] = -1835849780;
        oj.lyru[376] = -1741329774;
        oj.lyru[377] = -1801220796;
        oj.lyru[378] = -920182882;
        oj.lyru[379] = -740236237;
        oj.lyru[380] = 1804815559;
        oj.lyru[381] = -1080100060;
        oj.lyru[382] = -497911150;
        oj.lyru[383] = -546174521;
        oj.lyru[384] = -1284421292;
        oj.lyru[385] = 652132075;
        oj.lyru[386] = -1469247273;
        oj.lyru[387] = -505031520;
        oj.lyru[388] = 657172569;
        oj.lyru[389] = -1564805063;
        oj.lyru[390] = -858041065;
        oj.lyru[391] = -878363326;
        oj.lyru[392] = 1211674031;
        oj.lyru[393] = -2044838496;
        oj.lyru[394] = -610858215;
        oj.lyru[395] = 849593976;
        oj.lyru[396] = 1369224232;
        oj.lyru[397] = -31154026;
        oj.lyru[398] = 73350803;
        oj.lyru[399] = -922823578;
    }

    private static /* synthetic */ void lzzm() {
        oj.lyrl[400] = -799801814547263913L;
        oj.lyrl[401] = -1917213268351529547L;
        oj.lyrl[402] = -5002021817233282642L;
        oj.lyrl[403] = -4635743942120641738L;
        oj.lyrl[404] = -5185404438994927839L;
        oj.lyrl[405] = 3561396728782184994L;
        oj.lyrl[406] = -3992593163677892100L;
        oj.lyrl[407] = 6873946022424783337L;
        oj.lyrl[408] = -6497978406458964060L;
        oj.lyrl[409] = 8727223549367257757L;
        oj.lyrl[410] = 7020722166332963073L;
        oj.lyrl[411] = -419308466173617155L;
        oj.lyrl[412] = -5727022986806539167L;
        oj.lyrl[413] = 2961566055118202577L;
        oj.lyrl[414] = -3268811497987642943L;
        oj.lyrl[415] = -8784538145319792406L;
        oj.lyrl[416] = -1491615808130868326L;
        oj.lyrl[417] = -5716706448709067494L;
        oj.lyrl[418] = 85556907386575236L;
        oj.lyrl[419] = -1210310585398618938L;
        oj.lyrl[420] = -3903486565491135818L;
        oj.lyrl[421] = -7913249838875169608L;
        oj.lyrl[422] = 3537094232588519397L;
        oj.lyrl[423] = -4406869401862307416L;
        oj.lyrl[424] = -7195587643221532282L;
        oj.lyrl[425] = 3002929769343028923L;
        oj.lyrl[426] = 62901855024167684L;
        oj.lyrl[427] = -8178348420569458934L;
        oj.lyrl[428] = 4843870413784470222L;
        oj.lyrl[429] = 5493771763567124776L;
        oj.lyrl[430] = -7069376615843101177L;
        oj.lyrl[431] = -3078943766417751693L;
        oj.lyrl[432] = -1360389566514963031L;
        oj.lyrl[433] = -5911480399492474810L;
        oj.lyrl[434] = -6493772216484795803L;
        oj.lyrl[435] = 5327005662879106977L;
        oj.lyrl[436] = 6306000139141902236L;
        oj.lyrl[437] = -1306432613106065762L;
        oj.lyrl[438] = -6520100817367639639L;
        oj.lyrl[439] = -7945067712254866835L;
        oj.lyrl[440] = -2861262459059816725L;
        oj.lyrl[441] = -794021090050501138L;
        oj.lyrl[442] = 5547703765927050559L;
        oj.lyrl[443] = -7750966650467461853L;
        oj.lyrl[444] = 7190423954672853411L;
        oj.lyrl[445] = 2269776631819006441L;
        oj.lyrl[446] = 6558008903222179186L;
        oj.lyrl[447] = -6556855541851472485L;
        oj.lyrl[448] = 3175915817783055420L;
        oj.lyrl[449] = -3235572147037025495L;
        oj.lyrl[450] = -1851902019182258743L;
        oj.lyrl[451] = 3234447254433104418L;
        oj.lyrl[452] = 488994023129512398L;
        oj.lyrl[453] = 3006150756042615387L;
        oj.lyrl[454] = 1016136539891300985L;
        oj.lyrl[455] = 168247317660700929L;
        oj.lyrl[456] = -6719490405301347099L;
        oj.lyrl[457] = 6836601570160273640L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ class_1921 lambda$static$16(class_2960 var0) {
        v0 /* !! */  = oj.uv;
        if (true) ** GOTO lbl5
        block52: while (true) {
            v0 /* !! */  = (long)(v1 - oj.lyrn("lyxw", lyrk(int ), (int)92));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1354525872: {
                    v1 = oj.lyrn("lyxx", lyrk(int ), (int)93);
                    continue block52;
                }
                case 482045697: {
                    v1 = oj.lyrn("lyxy", lyrk(int ), (int)94);
                    continue block52;
                }
                case 1798372139: {
                    break block52;
                }
            }
            break;
        }
        var3_1 = oj.c;
        v2 /* !! */  = oj.uv;
        if (true) ** GOTO lbl19
        block53: while (true) {
            v2 /* !! */  = (long)(oj.lyrn("lyya", lyrk(int ), (int)96) - oj.lyrn("lyxz", lyrk(int ), (int)95));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 1385666039: {
                    continue block53;
                }
                case 1798372139: {
                    break block53;
                }
            }
            break;
        }
        var2_2 /* !! */  = oj.b;
        v3 /* !! */  = oj.uv;
        if (true) ** GOTO lbl29
        block54: while (true) {
            v3 /* !! */  = (long)(v4 - oj.lyrn("lyyb", lyrk(int ), (int)97));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -886221128: {
                    v4 = oj.lyrn("lyyc", lyrk(int ), (int)98);
                    continue block54;
                }
                case -89902059: {
                    v4 = oj.lyrn("lyyd", lyrk(int ), (int)99);
                    continue block54;
                }
                case 59379787: {
                    v4 = oj.lyrn("lyye", lyrk(int ), (int)100);
                    continue block54;
                }
                case 1798372139: {
                    break block54;
                }
            }
            break;
        }
        var1_3 = oj.a;
        if (var3_1) {
            throw null;
lbl44:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl44
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block15 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v5 /* !! */  = oj.uv;
                if (true) ** GOTO lbl55
                block56: while (true) {
                    v5 /* !! */  = (long)(oj.lyrn("lyyg", lyrk(int ), (int)102) - oj.lyrn("lyyf", lyrk(int ), (int)101));
lbl55:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1103362425: {
                            continue block56;
                        }
                        case 1798372139: {
                            break block56;
                        }
                    }
                    break;
                }
                v6 /* !! */  = oj.uv;
                if (true) ** GOTO lbl64
                block57: while (true) {
                    v6 /* !! */  = (long)(v7 - oj.lyrn("lyyh", lyrk(int ), (int)103));
lbl64:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -688720144: {
                            v7 = oj.lyrn("lyyi", lyrk(int ), (int)104);
                            continue block57;
                        }
                        case 43347380: {
                            v7 = oj.lyrn("lyyj", lyrk(int ), (int)105);
                            continue block57;
                        }
                        case 918031580: {
                            v7 = oj.lyrn("lyyk", lyrk(int ), (int)106);
                            continue block57;
                        }
                        case 1798372139: {
                            break block57;
                        }
                    }
                    break;
                }
                v8 = class_12247.method_75927((RenderPipeline)oj.CHAMS_NORMAL_WALL_PIPELINE);
                v9 /* !! */  = oj.uv;
                if (true) ** GOTO lbl81
                block58: while (true) {
                    v9 /* !! */  = (long)(v10 - oj.lyrn("lyyl", lyrk(int ), (int)107));
lbl81:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -347419949: {
                            v10 = oj.lyrn("lyym", lyrk(int ), (int)108);
                            continue block58;
                        }
                        case 144106085: {
                            v10 = oj.lyrn("lyyn", lyrk(int ), (int)109);
                            continue block58;
                        }
                        case 1737817592: {
                            v10 = oj.lyrn("lyyo", lyrk(int ), (int)110);
                            continue block58;
                        }
                        case 1798372139: {
                            break block58;
                        }
                    }
                    break;
                }
                v11 = v8.method_75934("Sampler0", var0);
                v12 /* !! */  = oj.uv;
                if (true) ** GOTO lbl98
                block59: while (true) {
                    v12 /* !! */  = (long)(v13 - oj.lyrn("lyyp", lyrk(int ), (int)111));
lbl98:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -2119434977: {
                            v13 = oj.lyrn("lyyq", lyrk(int ), (int)112);
                            continue block59;
                        }
                        case -692821063: {
                            v13 = oj.lyrn("lyyr", lyrk(int ), (int)113);
                            continue block59;
                        }
                        case 1687482563: {
                            v13 = oj.lyrn("lyys", lyrk(int ), (int)114);
                            continue block59;
                        }
                        case 1798372139: {
                            break block59;
                        }
                    }
                    break;
                }
                v14 = v11.method_75937();
                v15 = oj.lyrn("lyyt", lyrt(int ), (int)69);
                v16 /* !! */  = oj.uv;
                if (true) ** GOTO lbl116
                block60: while (true) {
                    v16 /* !! */  = (long)(oj.lyrn("lyyv", lyrk(int ), (int)116) - oj.lyrn("lyyu", lyrk(int ), (int)115));
lbl116:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case 434620443: {
                            continue block60;
                        }
                        case 1798372139: {
                            break block60;
                        }
                    }
                    break;
                }
                v17 = v14.method_75929((int)v15);
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_0 = oj.uv - oj.lyrn("lyyw", lyrk(int ), (int)117)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == oj.lyrn("lyyx", lyrt(int ), (int)70)) break;
                    v18 /* !! */  = (long)oj.lyrn("lyyy", lyrt(int ), (int)71);
                }
                v19 = v17.method_75938();
                v20 /* !! */  = oj.uv;
                if (true) ** GOTO lbl132
                block62: while (true) {
                    v20 /* !! */  = (long)(v21 - oj.lyrn("lyyz", lyrk(int ), (int)118));
lbl132:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -1975023544: {
                            v21 = oj.lyrn("lyza", lyrk(int ), (int)119);
                            continue block62;
                        }
                        case 1257200175: {
                            v21 = oj.lyrn("lyzb", lyrk(int ), (int)120);
                            continue block62;
                        }
                        case 1798372139: {
                            break block62;
                        }
                    }
                    break;
                }
                return class_1921.method_75940((String)"chams_normal_wall", (class_12247)v19);
            }
            case 0: {
                var2_2 /* !! */  = (int)oj.lyrn("lyzc", lyrt(int ), (int)72);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl151
            }
            case 1: {
                var2_2 /* !! */  = (int)oj.lyrn("lyzd", lyrt(int ), (int)73);
                if (!var3_1) break;
                throw null;
            }
lbl151:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)oj.lyrn("lyze", lyrt(int ), (int)74);
                    if (!var3_1) break block15;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)oj.lyrn("lyzf", lyrt(int ), (int)75);
        ** while (!var3_1)
lbl159:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ class_1921 lambda$static$19(class_2960 var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = oj.uv - oj.lyrn("lytm", lyrk(int ), (int)28)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == oj.lyrn("lytn", lyrt(int ), (int)19)) break;
            v0 /* !! */  = (long)oj.lyrn("lyto", lyrt(int ), (int)20);
        }
        var4_1 = oj.c;
        v1 /* !! */  = oj.uv;
        if (true) ** GOTO lbl12
        block43: while (true) {
            v1 /* !! */  = (long)(v2 - oj.lyrn("lytp", lyrk(int ), (int)29));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -166300414: {
                    v2 = oj.lyrn("lytq", lyrk(int ), (int)30);
                    continue block43;
                }
                case 148348115: {
                    v2 = oj.lyrn("lytr", lyrk(int ), (int)31);
                    continue block43;
                }
                case 1798372139: {
                    break block43;
                }
            }
            break;
        }
        var3_2 /* !! */  = oj.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = oj.uv - oj.lyrn("lyts", lyrk(int ), (int)32)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == oj.lyrn("lytt", lyrt(int ), (int)21)) break;
            v3 /* !! */  = (long)oj.lyrn("lytu", lyrt(int ), (int)22);
        }
        var2_3 = oj.a;
        if (var4_1) {
            throw null;
lbl31:
            // 2 sources

            return null;
        }
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3 || var2_3) ** GOTO lbl31
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = oj.uv - oj.lyrn("lytv", lyrk(int ), (int)33)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == oj.lyrn("lytw", lyrt(int ), (int)23)) break;
                    v4 /* !! */  = (long)oj.lyrn("lytx", lyrt(int ), (int)24);
                }
                v5 /* !! */  = oj.uv;
                if (true) ** GOTO lbl47
                block47: while (true) {
                    v5 /* !! */  = (long)(oj.lyrn("lytz", lyrk(int ), (int)35) - oj.lyrn("lyty", lyrk(int ), (int)34));
lbl47:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -341566352: {
                            continue block47;
                        }
                        case 1798372139: {
                            break block47;
                        }
                    }
                    break;
                }
                v6 = class_12247.method_75927((RenderPipeline)oj.GUI_ARROW_BLEND_PIPELINE);
                v7 /* !! */  = oj.uv;
                if (true) ** GOTO lbl57
                block48: while (true) {
                    v7 /* !! */  = (long)(oj.lyrn("lyub", lyrk(int ), (int)37) - oj.lyrn("lyua", lyrk(int ), (int)36));
lbl57:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 1663893704: {
                            continue block48;
                        }
                        case 1798372139: {
                            break block48;
                        }
                    }
                    break;
                }
                v8 = v6.method_75934("Sampler0", var0);
                v9 /* !! */  = oj.uv;
                if (true) ** GOTO lbl67
                block49: while (true) {
                    v9 /* !! */  = (long)(v10 - oj.lyrn("lyuc", lyrk(int ), (int)38));
lbl67:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -47776211: {
                            v10 = oj.lyrn("lyud", lyrk(int ), (int)39);
                            continue block49;
                        }
                        case 1798372139: {
                            break block49;
                        }
                        case 1959672707: {
                            v10 = oj.lyrn("lyue", lyrk(int ), (int)40);
                            continue block49;
                        }
                    }
                    break;
                }
                v11 = v8.method_75937();
                v12 = oj.lyrn("lyuf", lyrt(int ), (int)25);
                v13 /* !! */  = oj.uv;
                if (true) ** GOTO lbl82
                block50: while (true) {
                    v13 /* !! */  = (long)(oj.lyrn("lyuh", lyrk(int ), (int)42) - oj.lyrn("lyug", lyrk(int ), (int)41));
lbl82:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -981121891: {
                            continue block50;
                        }
                        case 1798372139: {
                            break block50;
                        }
                    }
                    break;
                }
                v14 = v11.method_75929((int)v12);
                v15 /* !! */  = oj.uv;
                if (true) ** GOTO lbl92
                block51: while (true) {
                    v15 /* !! */  = (long)(v16 - oj.lyrn("lyui", lyrk(int ), (int)43));
lbl92:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -574467512: {
                            v16 = oj.lyrn("lyuj", lyrk(int ), (int)44);
                            continue block51;
                        }
                        case 459472181: {
                            v16 = oj.lyrn("lyuk", lyrk(int ), (int)45);
                            continue block51;
                        }
                        case 778362230: {
                            v16 = oj.lyrn("lyul", lyrk(int ), (int)46);
                            continue block51;
                        }
                        case 1798372139: {
                            break block51;
                        }
                    }
                    break;
                }
                var1_4 = v14.method_75938();
                if (var2_3 || var2_3) ** continue;
                v17 /* !! */  = oj.uv;
                if (true) ** GOTO lbl110
                block52: while (true) {
                    v17 /* !! */  = (long)(v18 - oj.lyrn("lyum", lyrk(int ), (int)47));
lbl110:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -1607912464: {
                            v18 = oj.lyrn("lyun", lyrk(int ), (int)48);
                            continue block52;
                        }
                        case -190145352: {
                            v18 = oj.lyrn("lyuo", lyrk(int ), (int)49);
                            continue block52;
                        }
                        case 998865123: {
                            v18 = oj.lyrn("lyup", lyrk(int ), (int)50);
                            continue block52;
                        }
                        case 1798372139: {
                            break block52;
                        }
                    }
                    break;
                }
                return class_1921.method_75940((String)"gui_arrow_blend", (class_12247)var1_4);
            }
lbl123:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)oj.lyrn("lyuq", lyrt(int ), (int)26);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl141
            }
            case 1: {
                var3_2 /* !! */  = (int)oj.lyrn("lyur", lyrt(int ), (int)27);
                if (!var4_1) ** GOTO lbl123
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_2 /* !! */  = (int)oj.lyrn("lyus", lyrt(int ), (int)28);
                    if (!var4_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: {
                var3_2 /* !! */  = (int)oj.lyrn("lyut", lyrt(int ), (int)29);
                if (!var4_1) break;
                throw null;
            }
lbl141:
            // 2 sources

            case 4: {
                do {
                    var3_2 /* !! */  = (int)oj.lyrn("lyuu", lyrt(int ), (int)30);
                } while (!var4_1);
                throw null;
            }
            case 5: 
        }
        var3_2 /* !! */  = (int)oj.lyrn("lyuv", lyrt(int ), (int)31);
        ** while (!var4_1)
lbl149:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ class_1921 lambda$static$14(class_2960 var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = oj.uv - oj.lyrn("lzar", lyrk(int ), (int)143)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == oj.lyrn("lzas", lyrt(int ), (int)91)) break;
            v0 /* !! */  = (long)oj.lyrn("lzat", lyrt(int ), (int)92);
        }
        var4_1 = oj.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = oj.uv - oj.lyrn("lzau", lyrk(int ), (int)144)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == oj.lyrn("lzav", lyrt(int ), (int)93)) break;
            v1 /* !! */  = (long)oj.lyrn("lzaw", lyrt(int ), (int)94);
        }
        var3_2 /* !! */  = oj.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = oj.uv - oj.lyrn("lzax", lyrk(int ), (int)145)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == oj.lyrn("lzay", lyrt(int ), (int)95)) break;
            v2 /* !! */  = (long)oj.lyrn("lzaz", lyrt(int ), (int)96);
        }
        var2_3 = oj.a;
        if (var4_1) {
            throw null;
lbl21:
            // 3 sources

            return null;
        }
        if (var2_3 || var2_3) ** GOTO lbl21
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = oj.uv - oj.lyrn("lzba", lyrk(int ), (int)146)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == oj.lyrn("lzbb", lyrt(int ), (int)97)) break;
            v3 /* !! */  = (long)oj.lyrn("lzbc", lyrt(int ), (int)98);
        }
        v4 /* !! */  = oj.uv;
        if (true) ** GOTO lbl33
        block32: while (true) {
            v4 /* !! */  = (long)(v5 - oj.lyrn("lzbd", lyrk(int ), (int)147));
lbl33:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -442889956: {
                    v5 = oj.lyrn("lzbe", lyrk(int ), (int)148);
                    continue block32;
                }
                case 920344395: {
                    v5 = oj.lyrn("lzbf", lyrk(int ), (int)149);
                    continue block32;
                }
                case 1798372139: {
                    break block32;
                }
            }
            break;
        }
        v6 = class_12247.method_75927((RenderPipeline)oj.CHAMS_PIPELINE);
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_4 = oj.uv - oj.lyrn("lzbg", lyrk(int ), (int)150)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == oj.lyrn("lzbh", lyrt(int ), (int)99)) break;
            v7 /* !! */  = (long)oj.lyrn("lzbi", lyrt(int ), (int)100);
        }
        v8 = v6.method_75934("Sampler0", var0);
        v9 /* !! */  = oj.uv;
        if (true) ** GOTO lbl53
        block34: while (true) {
            v9 /* !! */  = (long)(v10 - oj.lyrn("lzbj", lyrk(int ), (int)151));
lbl53:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -743475198: {
                    v10 = oj.lyrn("lzbk", lyrk(int ), (int)152);
                    continue block34;
                }
                case -647696852: {
                    v10 = oj.lyrn("lzbl", lyrk(int ), (int)153);
                    continue block34;
                }
                case 1798372139: {
                    break block34;
                }
            }
            break;
        }
        v11 = v8.method_75937();
        v12 = oj.lyrn("lzbm", lyrt(int ), (int)101);
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_5 = oj.uv - oj.lyrn("lzbn", lyrk(int ), (int)154)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == oj.lyrn("lzbo", lyrt(int ), (int)102)) break;
            v13 /* !! */  = (long)oj.lyrn("lzbp", lyrt(int ), (int)103);
        }
        v14 = v11.method_75929((int)v12);
        v15 /* !! */  = oj.uv;
        if (true) ** GOTO lbl74
        block36: while (true) {
            v15 /* !! */  = (long)(oj.lyrn("lzbr", lyrk(int ), (int)156) - oj.lyrn("lzbq", lyrk(int ), (int)155));
lbl74:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -115904205: {
                    continue block36;
                }
                case 1798372139: {
                    break block36;
                }
            }
            break;
        }
        var1_4 = v14.method_75938();
        if (var2_3) ** GOTO lbl21
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_3) ** break;
                ** continue;
                v16 /* !! */  = oj.uv;
                if (true) ** GOTO lbl90
                block37: while (true) {
                    v16 /* !! */  = (long)(v17 - oj.lyrn("lzbs", lyrk(int ), (int)157));
lbl90:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case 961088980: {
                            v17 = oj.lyrn("lzbt", lyrk(int ), (int)158);
                            continue block37;
                        }
                        case 1440235776: {
                            v17 = oj.lyrn("lzbu", lyrk(int ), (int)159);
                            continue block37;
                        }
                        case 1798372139: {
                            break block37;
                        }
                    }
                    break;
                }
                return class_1921.method_75940((String)"chams", (class_12247)var1_4);
            }
lbl100:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_2 /* !! */  = (int)oj.lyrn("lzbv", lyrt(int ), (int)104);
                    if (!var4_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl105:
            // 2 sources

            case 1: {
                var3_2 /* !! */  = (int)oj.lyrn("lzbw", lyrt(int ), (int)105);
                if (!var4_1) ** GOTO lbl100
                throw null;
            }
lbl109:
            // 2 sources

            case 2: {
                var3_2 /* !! */  = (int)oj.lyrn("lzbx", lyrt(int ), (int)106);
                if (!var4_1) ** GOTO lbl105
                throw null;
            }
            case 3: {
                var3_2 /* !! */  = (int)oj.lyrn("lzby", lyrt(int ), (int)107);
                if (!var4_1) ** GOTO lbl109
                throw null;
            }
            case 4: {
                var3_2 /* !! */  = (int)oj.lyrn("lzbz", lyrt(int ), (int)108);
                if (!var4_1) ** GOTO lbl100
                throw null;
            }
            case 5: 
        }
        var3_2 /* !! */  = (int)oj.lyrn("lzca", lyrt(int ), (int)109);
        ** while (!var4_1)
lbl124:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lzzj() {
        oj.lyrl[100] = 2427490957619285951L;
        oj.lyrl[101] = 2025061528926395500L;
        oj.lyrl[102] = 8805087703608119001L;
        oj.lyrl[103] = -3544417520655751690L;
        oj.lyrl[104] = 5914761993712392439L;
        oj.lyrl[105] = 6769725739609515339L;
        oj.lyrl[106] = 5656394601121117475L;
        oj.lyrl[107] = 8987083881466442989L;
        oj.lyrl[108] = -899090682604641785L;
        oj.lyrl[109] = 4133774614535452442L;
        oj.lyrl[110] = -1173791848680532506L;
        oj.lyrl[111] = -619273130368185696L;
        oj.lyrl[112] = -4955937841538055869L;
        oj.lyrl[113] = -7483929290659257948L;
        oj.lyrl[114] = -6849483564232345541L;
        oj.lyrl[115] = 6636622602150238775L;
        oj.lyrl[116] = -4165318277680667419L;
        oj.lyrl[117] = 7520343042985737498L;
        oj.lyrl[118] = -4397260326234148765L;
        oj.lyrl[119] = 6403202454597008429L;
        oj.lyrl[120] = -7439539945883954238L;
        oj.lyrl[121] = -7482192755876691726L;
        oj.lyrl[122] = 8982951838719327190L;
        oj.lyrl[123] = -5202073975535726045L;
        oj.lyrl[124] = 7431838335794231947L;
        oj.lyrl[125] = -8102212953107392762L;
        oj.lyrl[126] = 2626980602095658408L;
        oj.lyrl[127] = 3828926901078012558L;
        oj.lyrl[128] = -8409530868380427355L;
        oj.lyrl[129] = 8835576152181256824L;
        oj.lyrl[130] = 7101481095425480840L;
        oj.lyrl[131] = -4610271960135870743L;
        oj.lyrl[132] = -7972095934338727068L;
        oj.lyrl[133] = -1329138151839464311L;
        oj.lyrl[134] = 8975238774599849312L;
        oj.lyrl[135] = 9199043144892977414L;
        oj.lyrl[136] = -1693922163622457796L;
        oj.lyrl[137] = -2073572113209221255L;
        oj.lyrl[138] = -4688215350802207623L;
        oj.lyrl[139] = 6936847507197834180L;
        oj.lyrl[140] = 356175913045098126L;
        oj.lyrl[141] = -1770085864189917630L;
        oj.lyrl[142] = 6808285893028805248L;
        oj.lyrl[143] = 5755592060186042374L;
        oj.lyrl[144] = 5415643371048814471L;
        oj.lyrl[145] = -4312958699993929070L;
        oj.lyrl[146] = 5496385371120228701L;
        oj.lyrl[147] = 5043302229138054619L;
        oj.lyrl[148] = 4157989249565136659L;
        oj.lyrl[149] = -763959494365164683L;
        oj.lyrl[150] = 4585132983025667198L;
        oj.lyrl[151] = -7859079502001250057L;
        oj.lyrl[152] = -3122825026828814643L;
        oj.lyrl[153] = -4703086152382745715L;
        oj.lyrl[154] = 5631302286523035931L;
        oj.lyrl[155] = 1529985247969591731L;
        oj.lyrl[156] = -5912680405581258614L;
        oj.lyrl[157] = -7339996113459675454L;
        oj.lyrl[158] = -8159914239019733604L;
        oj.lyrl[159] = 5078371170280282245L;
        oj.lyrl[160] = -3989964840669815075L;
        oj.lyrl[161] = -1043089769741191174L;
        oj.lyrl[162] = 6749314654921188809L;
        oj.lyrl[163] = 3124262782285835921L;
        oj.lyrl[164] = 4234967216442072209L;
        oj.lyrl[165] = -9026301945865703277L;
        oj.lyrl[166] = 6196803927704826514L;
        oj.lyrl[167] = 7493578627287555643L;
        oj.lyrl[168] = -3172726286151000225L;
        oj.lyrl[169] = 6517161700523371496L;
        oj.lyrl[170] = 1414389856478099248L;
        oj.lyrl[171] = 4171510154291642216L;
        oj.lyrl[172] = -5294189725484375176L;
        oj.lyrl[173] = -265482917423422360L;
        oj.lyrl[174] = 105023191015492021L;
        oj.lyrl[175] = -4460838027902969718L;
        oj.lyrl[176] = -6528430351280666172L;
        oj.lyrl[177] = -3151232584711693908L;
        oj.lyrl[178] = 8377616941639542083L;
        oj.lyrl[179] = -4880788083989483944L;
        oj.lyrl[180] = 986934440509906033L;
        oj.lyrl[181] = -1890952801845732351L;
        oj.lyrl[182] = 4030789002679106978L;
        oj.lyrl[183] = 4714404406871837935L;
        oj.lyrl[184] = -3775214204732216263L;
        oj.lyrl[185] = 7450430193876666911L;
        oj.lyrl[186] = 4803143109749555289L;
        oj.lyrl[187] = -5287810327104811167L;
        oj.lyrl[188] = 4616274759903571267L;
        oj.lyrl[189] = 5916695451955381556L;
        oj.lyrl[190] = 6926824558179227978L;
        oj.lyrl[191] = -1792630122579546368L;
        oj.lyrl[192] = -6252931233961649591L;
        oj.lyrl[193] = -1385237407563734131L;
        oj.lyrl[194] = 2057802512865422108L;
        oj.lyrl[195] = -9182804031182890121L;
        oj.lyrl[196] = -6477426014892393883L;
        oj.lyrl[197] = -5918191537108601958L;
        oj.lyrl[198] = -852862255039049362L;
        oj.lyrl[199] = 4601441956546554924L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ class_1921 lambda$static$3(class_2960 var0) {
        v0 /* !! */  = oj.uv;
        if (true) ** GOTO lbl5
        block37: while (true) {
            v0 /* !! */  = (long)(v1 - oj.lyrn("lzqz", lyrk(int ), (int)380));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1737414127: {
                    v1 = oj.lyrn("lzra", lyrk(int ), (int)381);
                    continue block37;
                }
                case -1679298998: {
                    v1 = oj.lyrn("lzrb", lyrk(int ), (int)382);
                    continue block37;
                }
                case 1111743323: {
                    v1 = oj.lyrn("lzrc", lyrk(int ), (int)383);
                    continue block37;
                }
                case 1798372139: {
                    break block37;
                }
            }
            break;
        }
        var4_1 = oj.c;
        v2 /* !! */  = oj.uv;
        if (true) ** GOTO lbl22
        block38: while (true) {
            v2 /* !! */  = (long)(v3 - oj.lyrn("lzrd", lyrk(int ), (int)384));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -352112617: {
                    v3 = oj.lyrn("lzre", lyrk(int ), (int)385);
                    continue block38;
                }
                case -89921064: {
                    v3 = oj.lyrn("lzrf", lyrk(int ), (int)386);
                    continue block38;
                }
                case 873429617: {
                    v3 = oj.lyrn("lzrg", lyrk(int ), (int)387);
                    continue block38;
                }
                case 1798372139: {
                    break block38;
                }
            }
            break;
        }
        var3_2 /* !! */  = oj.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = oj.uv - oj.lyrn("lzrh", lyrk(int ), (int)388)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == oj.lyrn("lzri", lyrt(int ), (int)278)) {
                var2_3 = oj.a;
                if (var4_1) {
                    throw null;
                }
                break;
            }
            v4 /* !! */  = (long)oj.lyrn("lzrj", lyrt(int ), (int)279);
        }
        if (var2_3 != false) return null;
        if (var2_3 != false) return null;
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_2 = oj.uv - oj.lyrn("lzrk", lyrk(int ), (int)389)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == oj.lyrn("lzrl", lyrt(int ), (int)280)) break;
            v5 /* !! */  = (long)oj.lyrn("lzrm", lyrt(int ), (int)281);
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_3 = oj.uv - oj.lyrn("lzrn", lyrk(int ), (int)390)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == oj.lyrn("lzro", lyrt(int ), (int)282)) break;
            v6 /* !! */  = (long)oj.lyrn("lzrp", lyrt(int ), (int)283);
        }
        v7 = class_12247.method_75927((RenderPipeline)oj.CHAIN_ESP_PIPELINE);
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_4 = oj.uv - oj.lyrn("lzrq", lyrk(int ), (int)391)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == oj.lyrn("lzrr", lyrt(int ), (int)284)) break;
            v8 /* !! */  = (long)oj.lyrn("lzrs", lyrt(int ), (int)285);
        }
        v9 = v7.method_75934("Sampler0", var0);
        while (true) {
            block56: {
                if ((v10 /* !! */  = (cfr_temp_5 = oj.uv - oj.lyrn("lzrt", lyrk(int ), (int)392)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  != oj.lyrn("lzru", lyrt(int ), (int)286)) break block56;
                v11 = v9.method_75937();
                v12 = oj.lyrn("lzrw", lyrt(int ), (int)288);
                v13 /* !! */  = oj.uv;
                if (true) ** GOTO lbl75
            }
            v10 /* !! */  = (long)oj.lyrn("lzrv", lyrt(int ), (int)287);
        }
        block44: while (true) {
            v13 /* !! */  = (long)(v14 - oj.lyrn("lzrx", lyrk(int ), (int)393));
lbl75:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -1648140134: {
                    v14 = oj.lyrn("lzry", lyrk(int ), (int)394);
                    continue block44;
                }
                case 747651457: {
                    v14 = oj.lyrn("lzrz", lyrk(int ), (int)395);
                    continue block44;
                }
                case 1595562169: {
                    v14 = oj.lyrn("lzsa", lyrk(int ), (int)396);
                    continue block44;
                }
                case 1798372139: {
                    break block44;
                }
            }
            break;
        }
        v15 = v11.method_75929((int)v12);
        v16 /* !! */  = oj.uv;
        if (true) ** GOTO lbl92
        block45: while (true) {
            v16 /* !! */  = (long)(v17 - oj.lyrn("lzsb", lyrk(int ), (int)397));
lbl92:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case -1566154155: {
                    v17 = oj.lyrn("lzsc", lyrk(int ), (int)398);
                    continue block45;
                }
                case 1397275613: {
                    v17 = oj.lyrn("lzsd", lyrk(int ), (int)399);
                    continue block45;
                }
                case 1798372139: {
                    break block45;
                }
            }
            break;
        }
        var1_4 = v15.method_75938();
        if (var2_3 != false) return null;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block46: while (true) {
            block57: {
                switch (cfr_temp_0 == -2147483648 ? var3_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var2_3 != false) return null;
                        v18 /* !! */  = oj.uv;
                        block47: while (true) {
                            switch ((int)v18 /* !! */ ) {
                                case -1232086328: {
                                    v19 = oj.lyrn("lzsf", lyrk(int ), (int)401);
                                    ** GOTO lbl120
                                }
                                case -1208110116: {
                                    v19 = oj.lyrn("lzsg", lyrk(int ), (int)402);
                                    ** GOTO lbl120
                                }
                                case 222569096: {
                                    v19 = oj.lyrn("lzsh", lyrk(int ), (int)403);
lbl120:
                                    // 3 sources

                                    v18 /* !! */  = (long)(v19 - oj.lyrn("lzse", lyrk(int ), (int)400));
                                    continue block47;
                                }
                                case 1798372139: {
                                    return class_1921.method_75940((String)"wtex", (class_12247)var1_4);
                                }
                            }
                            break;
                        }
                        return class_1921.method_75940((String)"wtex", (class_12247)var1_4);
                    }
                    case 2: {
                        var3_2 /* !! */  = (int)oj.lyrn("lzsk", lyrt(int ), (int)291);
                        cfr_temp_0 = 1;
                        if (var4_1) {
                            throw null;
                        }
                        break block57;
                    }
                    case 3: {
                        var3_2 /* !! */  = (int)oj.lyrn("lzsl", lyrt(int ), (int)292);
                        if (var4_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 4: {
                        var3_2 /* !! */  = (int)oj.lyrn("lzsm", lyrt(int ), (int)293);
                        cfr_temp_0 = 1;
                        if (var4_1) {
                            throw null;
                        }
                        break block57;
                    }
                    case 5: lbl-1000:
                    // 2 sources

                    {
                        var3_2 /* !! */  = (int)oj.lyrn("lzsn", lyrt(int ), (int)294);
                        if (var4_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 0: lbl-1000:
                    // 2 sources

                    {
                        var3_2 /* !! */  = (int)oj.lyrn("lzsi", lyrt(int ), (int)289);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 1: 
                }
                ** GOTO lbl156
            }
            do {
                if (true) continue block46;
lbl156:
                // 2 sources

                var3_2 /* !! */  = (int)oj.lyrn("lzsj", lyrt(int ), (int)290);
                cfr_temp_0 = 0;
            } while (!var4_1);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void lzzf() {
        oj.lyrv[200] = -1358488122;
        oj.lyrv[201] = -1261888276;
        oj.lyrv[202] = 474586482;
        oj.lyrv[203] = 266184389;
        oj.lyrv[204] = -71934283;
        oj.lyrv[205] = -1004995231;
        oj.lyrv[206] = 727808175;
        oj.lyrv[207] = 111413647;
        oj.lyrv[208] = 190517891;
        oj.lyrv[209] = 1429257597;
        oj.lyrv[210] = 298023523;
        oj.lyrv[211] = -1344508223;
        oj.lyrv[212] = 11731769;
        oj.lyrv[213] = 339889546;
        oj.lyrv[214] = 418099237;
        oj.lyrv[215] = 873135949;
        oj.lyrv[216] = -2045569048;
        oj.lyrv[217] = -250099828;
        oj.lyrv[218] = 245276114;
        oj.lyrv[219] = 1211562502;
        oj.lyrv[220] = 522517933;
        oj.lyrv[221] = 1462214191;
        oj.lyrv[222] = -936822021;
        oj.lyrv[223] = -1453808774;
        oj.lyrv[224] = 1799492688;
        oj.lyrv[225] = 954976559;
        oj.lyrv[226] = 1974582205;
        oj.lyrv[227] = 885797004;
        oj.lyrv[228] = -1386312051;
        oj.lyrv[229] = 1924588973;
        oj.lyrv[230] = 1350895825;
        oj.lyrv[231] = -1263150478;
        oj.lyrv[232] = -2090251952;
        oj.lyrv[233] = -1160279548;
        oj.lyrv[234] = 1435440257;
        oj.lyrv[235] = 1723870124;
        oj.lyrv[236] = -329498783;
        oj.lyrv[237] = 332305951;
        oj.lyrv[238] = -1849339212;
        oj.lyrv[239] = -1187123783;
        oj.lyrv[240] = 1672755344;
        oj.lyrv[241] = -562875663;
        oj.lyrv[242] = 945468865;
        oj.lyrv[243] = 413980906;
        oj.lyrv[244] = -1756375516;
        oj.lyrv[245] = -769157965;
        oj.lyrv[246] = -2086095526;
        oj.lyrv[247] = -1178072683;
        oj.lyrv[248] = 251399665;
        oj.lyrv[249] = -1225448685;
        oj.lyrv[250] = 983289012;
        oj.lyrv[251] = 1864467355;
        oj.lyrv[252] = 533175740;
        oj.lyrv[253] = 696348860;
        oj.lyrv[254] = -2117798967;
        oj.lyrv[255] = 100211183;
        oj.lyrv[256] = 468101595;
        oj.lyrv[257] = -463722534;
        oj.lyrv[258] = 1147849022;
        oj.lyrv[259] = -1393735476;
        oj.lyrv[260] = 1402406788;
        oj.lyrv[261] = -1073375519;
        oj.lyrv[262] = 820557880;
        oj.lyrv[263] = -739262683;
        oj.lyrv[264] = -1125746423;
        oj.lyrv[265] = -71892343;
        oj.lyrv[266] = -373220159;
        oj.lyrv[267] = -1230316738;
        oj.lyrv[268] = -732391169;
        oj.lyrv[269] = 1453317348;
        oj.lyrv[270] = 588819074;
        oj.lyrv[271] = -423255526;
        oj.lyrv[272] = -758185128;
        oj.lyrv[273] = 43660941;
        oj.lyrv[274] = -886739935;
        oj.lyrv[275] = 336992772;
        oj.lyrv[276] = 40657281;
        oj.lyrv[277] = 41300097;
        oj.lyrv[278] = 457085702;
        oj.lyrv[279] = 602542136;
        oj.lyrv[280] = 1429350996;
        oj.lyrv[281] = -1852980253;
        oj.lyrv[282] = -349244421;
        oj.lyrv[283] = 160096531;
        oj.lyrv[284] = 1344620364;
        oj.lyrv[285] = 1053888221;
        oj.lyrv[286] = -1388662492;
        oj.lyrv[287] = -2082553201;
        oj.lyrv[288] = 1240045237;
        oj.lyrv[289] = 1575412417;
        oj.lyrv[290] = 93745556;
        oj.lyrv[291] = 173814678;
        oj.lyrv[292] = -1834603469;
        oj.lyrv[293] = 1482202143;
        oj.lyrv[294] = -20880571;
        oj.lyrv[295] = -1723846092;
        oj.lyrv[296] = 1942597675;
        oj.lyrv[297] = 615634058;
        oj.lyrv[298] = -866861267;
        oj.lyrv[299] = -586051520;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ class_1921 lambda$static$7(class_2960 var0) {
        block37: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_1 = oj.uv - oj.lyrn("lzle", lyrk(int ), (int)291)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == oj.lyrn("lzlf", lyrt(int ), (int)216)) break;
                v0 /* !! */  = (long)oj.lyrn("lzlg", lyrt(int ), (int)217);
            }
            var3_1 = oj.c;
            while (true) {
                block38: {
                    if ((v1 /* !! */  = (cfr_temp_2 = oj.uv - oj.lyrn("lzlh", lyrk(int ), (int)292)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  != oj.lyrn("lzli", lyrt(int ), (int)218)) break block38;
                    var2_2 /* !! */  = oj.b;
                    v2 /* !! */  = oj.uv;
                    if (true) ** GOTO lbl18
                }
                v1 /* !! */  = (long)oj.lyrn("lzlj", lyrt(int ), (int)219);
            }
            block23: while (true) {
                v2 /* !! */  = (long)(v3 - oj.lyrn("lzlk", lyrk(int ), (int)293));
lbl18:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case 282002850: {
                        v3 = oj.lyrn("lzll", lyrk(int ), (int)294);
                        continue block23;
                    }
                    case 1426173612: {
                        v3 = oj.lyrn("lzlm", lyrk(int ), (int)295);
                        continue block23;
                    }
                    case 1798372139: {
                        break block23;
                    }
                }
                break;
            }
            var1_3 = oj.a;
            if (var3_1) {
                throw null;
            }
            if (var1_3 != false) return null;
            if (var1_3 != false) return null;
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block24: do {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_3 = oj.uv - oj.lyrn("lzln", lyrk(int ), (int)296)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v4 /* !! */  != oj.lyrn("lzlo", lyrt(int ), (int)220)) {
                                v4 /* !! */  = (long)oj.lyrn("lzlp", lyrt(int ), (int)221);
                                continue;
                            }
                            break block37;
                            break;
                        }
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)oj.lyrn("lzmj", lyrt(int ), (int)231);
                        cfr_temp_0 = 2;
                        if (!var3_1) continue block24;
                        throw null;
                    }
                    case 1: {
                        ** GOTO lbl54
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)oj.lyrn("lzmm", lyrt(int ), (int)234);
                        if (var3_1) {
                            throw null;
                        }
lbl54:
                        // 3 sources

                        var2_2 /* !! */  = (int)oj.lyrn("lzmk", lyrt(int ), (int)232);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 2: 
                }
                break;
            } while (true);
            do {
                var2_2 /* !! */  = (int)oj.lyrn("lzml", lyrt(int ), (int)233);
            } while (!var3_1);
            throw null;
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_4 = oj.uv - oj.lyrn("lzlq", lyrk(int ), (int)297)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == oj.lyrn("lzlr", lyrt(int ), (int)222)) break;
            v5 /* !! */  = (long)oj.lyrn("lzls", lyrt(int ), (int)223);
        }
        v6 = class_12247.method_75927((RenderPipeline)oj.SHADER_HANDS_ITEM_COLOR_HALO_PIPELINE);
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_5 = oj.uv - oj.lyrn("lzlt", lyrk(int ), (int)298)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == oj.lyrn("lzlu", lyrt(int ), (int)224)) break;
            v7 /* !! */  = (long)oj.lyrn("lzlv", lyrt(int ), (int)225);
        }
        v8 = v6.method_75934("Sampler0", var0);
        while (true) {
            block39: {
                if ((v9 /* !! */  = (cfr_temp_6 = oj.uv - oj.lyrn("lzlw", lyrk(int ), (int)299)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  != oj.lyrn("lzlx", lyrt(int ), (int)226)) break block39;
                v10 = v8.method_75937();
                v11 = oj.lyrn("lzlz", lyrt(int ), (int)228);
                v12 /* !! */  = oj.uv;
                if (true) ** GOTO lbl89
            }
            v9 /* !! */  = (long)oj.lyrn("lzly", lyrt(int ), (int)227);
        }
        block30: while (true) {
            v12 /* !! */  = (long)(v13 - oj.lyrn("lzma", lyrk(int ), (int)300));
lbl89:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -1092014587: {
                    v13 = oj.lyrn("lzmb", lyrk(int ), (int)301);
                    continue block30;
                }
                case 1753816877: {
                    v13 = oj.lyrn("lzmc", lyrk(int ), (int)302);
                    continue block30;
                }
                case 1798372139: {
                    break block30;
                }
            }
            break;
        }
        v14 = v10.method_75929((int)v11);
        while (true) {
            block40: {
                if ((v15 /* !! */  = (cfr_temp_7 = oj.uv - oj.lyrn("lzmd", lyrk(int ), (int)303)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v15 /* !! */  != oj.lyrn("lzme", lyrt(int ), (int)229)) break block40;
                v16 = v14.method_75938();
                v17 /* !! */  = oj.uv;
                if (true) ** GOTO lbl110
            }
            v15 /* !! */  = (long)oj.lyrn("lzmf", lyrt(int ), (int)230);
        }
        block32: while (true) {
            v17 /* !! */  = (long)(v18 - oj.lyrn("lzmg", lyrk(int ), (int)304));
lbl110:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case -1512196634: {
                    v18 = oj.lyrn("lzmh", lyrk(int ), (int)305);
                    continue block32;
                }
                case -400610504: {
                    v18 = oj.lyrn("lzmi", lyrk(int ), (int)306);
                    continue block32;
                }
                case 1798372139: {
                    return class_1921.method_75940((String)"shader_hands_item_color_halo", (class_12247)v16);
                }
            }
            break;
        }
        return class_1921.method_75940((String)"shader_hands_item_color_halo", (class_12247)v16);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ class_1921 lambda$static$12(class_2960 var0) {
        v0 /* !! */  = oj.uv;
        if (true) ** GOTO lbl5
        block37: while (true) {
            v0 /* !! */  = (long)(v1 - oj.lyrn("lzdu", lyrk(int ), (int)182));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -707492427: {
                    v1 = oj.lyrn("lzdv", lyrk(int ), (int)183);
                    continue block37;
                }
                case -190737323: {
                    v1 = oj.lyrn("lzdw", lyrk(int ), (int)184);
                    continue block37;
                }
                case 965784518: {
                    v1 = oj.lyrn("lzdx", lyrk(int ), (int)185);
                    continue block37;
                }
                case 1798372139: {
                    break block37;
                }
            }
            break;
        }
        var4_1 = oj.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = oj.uv - oj.lyrn("lzdy", lyrk(int ), (int)186)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == oj.lyrn("lzdz", lyrt(int ), (int)133)) break;
            v2 /* !! */  = (long)oj.lyrn("lzea", lyrt(int ), (int)134);
        }
        var3_2 /* !! */  = oj.b;
        v3 /* !! */  = oj.uv;
        if (true) ** GOTO lbl28
        block39: while (true) {
            v3 /* !! */  = (long)(oj.lyrn("lzec", lyrk(int ), (int)188) - oj.lyrn("lzeb", lyrk(int ), (int)187));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 1063027065: {
                    continue block39;
                }
                case 1798372139: {
                    break block39;
                }
            }
            break;
        }
        var2_3 = oj.a;
        if (!var4_1) ** GOTO lbl40
        throw null;
lbl-1000:
        // 2 sources

        {
            if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl40:
                // 1 sources

                if (var2_3 || var2_3) ** GOTO lbl-1000
                v4 /* !! */  = oj.uv;
                if (true) ** GOTO lbl45
                block41: while (true) {
                    v4 /* !! */  = (long)(v5 - oj.lyrn("lzed", lyrk(int ), (int)189));
lbl45:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 1767350741: {
                            v5 = oj.lyrn("lzee", lyrk(int ), (int)190);
                            continue block41;
                        }
                        case 1798372139: {
                            break block41;
                        }
                        case 1906335441: {
                            v5 = oj.lyrn("lzef", lyrk(int ), (int)191);
                            continue block41;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = oj.uv - oj.lyrn("lzeg", lyrk(int ), (int)192)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == oj.lyrn("lzeh", lyrt(int ), (int)135)) break;
                    v6 /* !! */  = (long)oj.lyrn("lzei", lyrt(int ), (int)136);
                }
                v7 = class_12247.method_75927((RenderPipeline)oj.SHADER_HANDS_BAKED_ITEM_FILL_PIPELINE);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = oj.uv - oj.lyrn("lzej", lyrk(int ), (int)193)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == oj.lyrn("lzek", lyrt(int ), (int)137)) break;
                    v8 /* !! */  = (long)oj.lyrn("lzel", lyrt(int ), (int)138);
                }
                v9 = v7.method_75934("Sampler0", var0);
                v10 /* !! */  = oj.uv;
                if (true) ** GOTO lbl70
                block44: while (true) {
                    v10 /* !! */  = (long)(oj.lyrn("lzen", lyrk(int ), (int)195) - oj.lyrn("lzem", lyrk(int ), (int)194));
lbl70:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case 450285234: {
                            continue block44;
                        }
                        case 1798372139: {
                            break block44;
                        }
                    }
                    break;
                }
                v11 = v9.method_75937();
                v12 = oj.lyrn("lzeo", lyrt(int ), (int)139);
                v13 /* !! */  = oj.uv;
                if (true) ** GOTO lbl81
                block45: while (true) {
                    v13 /* !! */  = (long)(v14 - oj.lyrn("lzep", lyrk(int ), (int)196));
lbl81:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -2073208417: {
                            v14 = oj.lyrn("lzeq", lyrk(int ), (int)197);
                            continue block45;
                        }
                        case -1992618902: {
                            v14 = oj.lyrn("lzer", lyrk(int ), (int)198);
                            continue block45;
                        }
                        case -67488429: {
                            v14 = oj.lyrn("lzes", lyrk(int ), (int)199);
                            continue block45;
                        }
                        case 1798372139: {
                            break block45;
                        }
                    }
                    break;
                }
                v15 = v11.method_75929((int)v12);
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_3 = oj.uv - oj.lyrn("lzet", lyrk(int ), (int)200)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == oj.lyrn("lzeu", lyrt(int ), (int)140)) break;
                    v16 /* !! */  = (long)oj.lyrn("lzev", lyrt(int ), (int)141);
                }
                var1_4 = v15.method_75938();
                if (var2_3 || var2_3) continue block40;
                v17 /* !! */  = oj.uv;
                if (true) ** GOTO lbl105
                block47: while (true) {
                    v17 /* !! */  = (long)(oj.lyrn("lzex", lyrk(int ), (int)202) - oj.lyrn("lzew", lyrk(int ), (int)201));
lbl105:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -1521359389: {
                            continue block47;
                        }
                        case 1798372139: {
                            break block47;
                        }
                    }
                    break;
                }
                return class_1921.method_75940((String)"shader_hands_baked_item_fill", (class_12247)var1_4);
                case 0: {
                    var3_2 /* !! */  = (int)oj.lyrn("lzey", lyrt(int ), (int)142);
                    if (!var4_1) break block40;
                    throw null;
                }
lbl115:
                // 4 sources

                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var3_2 /* !! */  = (int)oj.lyrn("lzez", lyrt(int ), (int)143);
                        if (var4_1) {
                            throw null;
                        }
                        ** GOTO lbl129
                        break;
                    }
                }
                case 2: {
                    var3_2 /* !! */  = (int)oj.lyrn("lzfa", lyrt(int ), (int)144);
                    if (!var4_1) ** GOTO lbl115
                    throw null;
                }
                case 3: {
                    var3_2 /* !! */  = (int)oj.lyrn("lzfb", lyrt(int ), (int)145);
                    if (!var4_1) ** GOTO lbl115
                    throw null;
                }
lbl129:
                // 2 sources

                case 4: {
                    var3_2 /* !! */  = (int)oj.lyrn("lzfc", lyrt(int ), (int)146);
                    if (!var4_1) ** GOTO lbl115
                    throw null;
                }
                case 5: 
            }
        }
        var3_2 /* !! */  = (int)oj.lyrn("lzfd", lyrt(int ), (int)147);
        ** while (!var4_1)
lbl136:
        // 1 sources

        throw null;
    }

    public oj() {
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ class_1921 lambda$static$8(class_2960 var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = oj.uv - oj.lyrn("lzjs", lyrk(int ), (int)274)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == oj.lyrn("lzjt", lyrt(int ), (int)195)) break;
            v0 /* !! */  = (long)oj.lyrn("lzju", lyrt(int ), (int)196);
        }
        var3_1 = oj.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = oj.uv - oj.lyrn("lzjv", lyrk(int ), (int)275)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == oj.lyrn("lzjw", lyrt(int ), (int)197)) break;
            v1 /* !! */  = (long)oj.lyrn("lzjx", lyrt(int ), (int)198);
        }
        var2_2 /* !! */  = oj.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = oj.uv - oj.lyrn("lzjy", lyrk(int ), (int)276)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == oj.lyrn("lzjz", lyrt(int ), (int)199)) break;
            v2 /* !! */  = (long)oj.lyrn("lzka", lyrt(int ), (int)200);
        }
        var1_3 = oj.a;
        if (!var3_1) ** GOTO lbl25
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl25:
                // 1 sources

                if (var1_3 || var1_3) continue block26;
                v3 /* !! */  = oj.uv;
                if (true) ** GOTO lbl30
                block27: while (true) {
                    v3 /* !! */  = (long)(oj.lyrn("lzkc", lyrk(int ), (int)278) - oj.lyrn("lzkb", lyrk(int ), (int)277));
lbl30:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 564674342: {
                            continue block27;
                        }
                        case 1798372139: {
                            break block27;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = oj.uv - oj.lyrn("lzkd", lyrk(int ), (int)279)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == oj.lyrn("lzke", lyrt(int ), (int)201)) break;
                    v4 /* !! */  = (long)oj.lyrn("lzkf", lyrt(int ), (int)202);
                }
                v5 = class_12247.method_75927((RenderPipeline)oj.SHADER_HANDS_ITEM_COLOR_HALO_PIPELINE);
                v6 /* !! */  = oj.uv;
                if (true) ** GOTO lbl45
                block29: while (true) {
                    v6 /* !! */  = (long)(oj.lyrn("lzkh", lyrk(int ), (int)281) - oj.lyrn("lzkg", lyrk(int ), (int)280));
lbl45:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 566186338: {
                            continue block29;
                        }
                        case 1798372139: {
                            break block29;
                        }
                    }
                    break;
                }
                v7 = v5.method_75934("Sampler0", var0);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = oj.uv - oj.lyrn("lzki", lyrk(int ), (int)282)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == oj.lyrn("lzkj", lyrt(int ), (int)203)) break;
                    v8 /* !! */  = (long)oj.lyrn("lzkk", lyrt(int ), (int)204);
                }
                v9 /* !! */  = oj.uv;
                if (true) ** GOTO lbl60
                block31: while (true) {
                    v9 /* !! */  = (long)(oj.lyrn("lzkm", lyrk(int ), (int)284) - oj.lyrn("lzkl", lyrk(int ), (int)283));
lbl60:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case 1182691227: {
                            continue block31;
                        }
                        case 1798372139: {
                            break block31;
                        }
                    }
                    break;
                }
                v10 = v7.method_75931(on.OUTPUT_TARGET);
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_5 = oj.uv - oj.lyrn("lzkn", lyrk(int ), (int)285)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == oj.lyrn("lzko", lyrt(int ), (int)205)) break;
                    v11 /* !! */  = (long)oj.lyrn("lzkp", lyrt(int ), (int)206);
                }
                v12 = v10.method_75937();
                v13 = oj.lyrn("lzkq", lyrt(int ), (int)207);
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_6 = oj.uv - oj.lyrn("lzkr", lyrk(int ), (int)286)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == oj.lyrn("lzks", lyrt(int ), (int)208)) break;
                    v14 /* !! */  = (long)oj.lyrn("lzkt", lyrt(int ), (int)209);
                }
                v15 = v12.method_75929((int)v13);
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_7 = oj.uv - oj.lyrn("lzku", lyrk(int ), (int)287)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == oj.lyrn("lzkv", lyrt(int ), (int)210)) break;
                    v16 /* !! */  = (long)oj.lyrn("lzkw", lyrt(int ), (int)211);
                }
                v17 = v15.method_75938();
                v18 /* !! */  = oj.uv;
                if (true) ** GOTO lbl89
                block35: while (true) {
                    v18 /* !! */  = (long)(v19 - oj.lyrn("lzkx", lyrk(int ), (int)288));
lbl89:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1291661433: {
                            v19 = oj.lyrn("lzky", lyrk(int ), (int)289);
                            continue block35;
                        }
                        case 1681412969: {
                            v19 = oj.lyrn("lzkz", lyrk(int ), (int)290);
                            continue block35;
                        }
                        case 1798372139: {
                            break block35;
                        }
                    }
                    break;
                }
                return class_1921.method_75940((String)"shader_hands_trail_item_color_halo", (class_12247)v17);
lbl99:
                // 3 sources

                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)oj.lyrn("lzla", lyrt(int ), (int)212);
                        if (!var3_1) ** GOTO lbl-1000
                        throw null;
                    }
                }
                case 1: {
                    var2_2 /* !! */  = (int)oj.lyrn("lzlb", lyrt(int ), (int)213);
                    if (!var3_1) ** GOTO lbl99
                    throw null;
                }
                case 2: {
                    var2_2 /* !! */  = (int)oj.lyrn("lzlc", lyrt(int ), (int)214);
                    if (!var3_1) ** GOTO lbl99
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)oj.lyrn("lzld", lyrt(int ), (int)215);
        ** while (!var3_1)
lbl115:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static class_2960 layerTextureOf(class_1921 var0) {
        v0 /* !! */  = oj.uv;
        if (true) ** GOTO lbl5
        block27: while (true) {
            v0 /* !! */  = (long)(v1 - oj.lyrn("lysm", lyrk(int ), (int)12));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1114753774: {
                    v1 = oj.lyrn("lysn", lyrk(int ), (int)13);
                    continue block27;
                }
                case 40741864: {
                    v1 = oj.lyrn("lyso", lyrk(int ), (int)14);
                    continue block27;
                }
                case 1179801156: {
                    v1 = oj.lyrn("lysp", lyrk(int ), (int)15);
                    continue block27;
                }
                case 1798372139: {
                    break block27;
                }
            }
            break;
        }
        var3_1 = oj.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = oj.uv - oj.lyrn("lysq", lyrk(int ), (int)16)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == oj.lyrn("lysr", lyrt(int ), (int)9)) break;
            v2 /* !! */  = (long)oj.lyrn("lyss", lyrt(int ), (int)10);
        }
        var2_2 /* !! */  = oj.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = oj.uv - oj.lyrn("lyst", lyrk(int ), (int)17)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == oj.lyrn("lysu", lyrt(int ), (int)11)) break;
            v3 /* !! */  = (long)oj.lyrn("lysv", lyrt(int ), (int)12);
        }
        var1_3 = oj.a;
        if (!var3_1) ** GOTO lbl38
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl38:
                // 1 sources

                if (var1_3 || var1_3) continue block30;
                v4 /* !! */  = oj.uv;
                if (true) ** GOTO lbl43
                block31: while (true) {
                    v4 /* !! */  = (long)(v5 - oj.lyrn("lysw", lyrk(int ), (int)18));
lbl43:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2129739257: {
                            v5 = oj.lyrn("lysx", lyrk(int ), (int)19);
                            continue block31;
                        }
                        case -68797342: {
                            v5 = oj.lyrn("lysy", lyrk(int ), (int)20);
                            continue block31;
                        }
                        case 1798372139: {
                            break block31;
                        }
                        case 2143716068: {
                            v5 = oj.lyrn("lysz", lyrk(int ), (int)21);
                            continue block31;
                        }
                    }
                    break;
                }
                v6 /* !! */  = oj.uv;
                if (true) ** GOTO lbl59
                block32: while (true) {
                    v6 /* !! */  = (long)(oj.lyrn("lytb", lyrk(int ), (int)23) - oj.lyrn("lyta", lyrk(int ), (int)22));
lbl59:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 1614850379: {
                            continue block32;
                        }
                        case 1798372139: {
                            break block32;
                        }
                    }
                    break;
                }
                v7 = (Function<class_1921, Optional>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$layerTextureOf$17(net.minecraft.class_1921 ), (Lnet/minecraft/class_1921;)Ljava/util/Optional;)();
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = oj.uv - oj.lyrn("lytc", lyrk(int ), (int)24)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == oj.lyrn("lytd", lyrt(int ), (int)13)) break;
                    v8 /* !! */  = (long)oj.lyrn("lyte", lyrt(int ), (int)14);
                }
                v9 /* !! */  = oj.uv;
                if (true) ** GOTO lbl75
                block34: while (true) {
                    v9 /* !! */  = (long)(v10 - oj.lyrn("lytf", lyrk(int ), (int)25));
lbl75:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1834288189: {
                            v10 = oj.lyrn("lytg", lyrk(int ), (int)26);
                            continue block34;
                        }
                        case 819809172: {
                            v10 = oj.lyrn("lyth", lyrk(int ), (int)27);
                            continue block34;
                        }
                        case 1798372139: {
                            break block34;
                        }
                    }
                    break;
                }
                return oj.LAYER_TEXTURE_CACHE.computeIfAbsent(var0, v7).orElse(null);
lbl85:
                // 2 sources

                case 0: {
                    do {
                        var2_2 /* !! */  = (int)oj.lyrn("lyti", lyrt(int ), (int)15);
                    } while (!var3_1);
                    throw null;
                }
lbl90:
                // 2 sources

                case 1: {
                    var2_2 /* !! */  = (int)oj.lyrn("lytj", lyrt(int ), (int)16);
                    if (!var3_1) ** GOTO lbl85
                    throw null;
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)oj.lyrn("lytk", lyrt(int ), (int)17);
                        if (!var3_1) ** GOTO lbl90
                        throw null;
                    }
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)oj.lyrn("lytl", lyrt(int ), (int)18);
        ** while (!var3_1)
lbl102:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lzzk() {
        oj.lyrl[200] = 5030031630060181326L;
        oj.lyrl[201] = -8219953270699220464L;
        oj.lyrl[202] = 333754107818511939L;
        oj.lyrl[203] = 3387051240306683613L;
        oj.lyrl[204] = 6582094374183638544L;
        oj.lyrl[205] = 221412505155503813L;
        oj.lyrl[206] = -6530906992723818856L;
        oj.lyrl[207] = -5041441530527274249L;
        oj.lyrl[208] = 9117792127221072582L;
        oj.lyrl[209] = 5810003140591672347L;
        oj.lyrl[210] = -6684857120847209838L;
        oj.lyrl[211] = -8571073838311763651L;
        oj.lyrl[212] = -1538247513121266230L;
        oj.lyrl[213] = -8208378301843680019L;
        oj.lyrl[214] = 7339402637044543002L;
        oj.lyrl[215] = 869018247382881494L;
        oj.lyrl[216] = -1942201347199482965L;
        oj.lyrl[217] = 8796264434882178027L;
        oj.lyrl[218] = -1787085726355729359L;
        oj.lyrl[219] = 2377839291234012852L;
        oj.lyrl[220] = -3563805965422869135L;
        oj.lyrl[221] = 982326492463049028L;
        oj.lyrl[222] = -1593611272467884962L;
        oj.lyrl[223] = -1026914188026383920L;
        oj.lyrl[224] = -6181061912358626369L;
        oj.lyrl[225] = -3411819451284923712L;
        oj.lyrl[226] = 1127123412737038026L;
        oj.lyrl[227] = 5685175849840536376L;
        oj.lyrl[228] = -5036403823241027538L;
        oj.lyrl[229] = -4999954747653051762L;
        oj.lyrl[230] = 2138114306361877948L;
        oj.lyrl[231] = 7072533669973028721L;
        oj.lyrl[232] = -2894002875001034027L;
        oj.lyrl[233] = 8001476995334805702L;
        oj.lyrl[234] = -6150958293784712225L;
        oj.lyrl[235] = 7631555179622516340L;
        oj.lyrl[236] = 1234166754896980104L;
        oj.lyrl[237] = 7182327855611927950L;
        oj.lyrl[238] = 8730947684498995435L;
        oj.lyrl[239] = -7924290007920102686L;
        oj.lyrl[240] = -1969167434045707544L;
        oj.lyrl[241] = -1935461108991823465L;
        oj.lyrl[242] = -6528102672799402113L;
        oj.lyrl[243] = 6008868221707207314L;
        oj.lyrl[244] = -3093969713847307631L;
        oj.lyrl[245] = 7875621126967678644L;
        oj.lyrl[246] = 3936565742908541872L;
        oj.lyrl[247] = 1959599351240488273L;
        oj.lyrl[248] = 7309107962650500484L;
        oj.lyrl[249] = -2711532832405085482L;
        oj.lyrl[250] = -1576623487935299312L;
        oj.lyrl[251] = -2652799936142543410L;
        oj.lyrl[252] = -147666359207104266L;
        oj.lyrl[253] = -1984830681158551977L;
        oj.lyrl[254] = -9125155022486076133L;
        oj.lyrl[255] = 7241592718152569865L;
        oj.lyrl[256] = 6374682946139719611L;
        oj.lyrl[257] = 1772793717779089973L;
        oj.lyrl[258] = -8958926593321906090L;
        oj.lyrl[259] = -4334585426604670537L;
        oj.lyrl[260] = 5242042639036645774L;
        oj.lyrl[261] = -1436346000585545250L;
        oj.lyrl[262] = 6922198663107687831L;
        oj.lyrl[263] = 1022081300772612071L;
        oj.lyrl[264] = 3443540528017835163L;
        oj.lyrl[265] = 1360970096995028782L;
        oj.lyrl[266] = 4554849989334716434L;
        oj.lyrl[267] = 8401910963494768576L;
        oj.lyrl[268] = -2616963670064100720L;
        oj.lyrl[269] = 264938521957584949L;
        oj.lyrl[270] = -1935817499768751018L;
        oj.lyrl[271] = -4521391720437575572L;
        oj.lyrl[272] = -6003128199679815294L;
        oj.lyrl[273] = -3524560124936774790L;
        oj.lyrl[274] = -6789955188402258384L;
        oj.lyrl[275] = 4275609751740043227L;
        oj.lyrl[276] = 539377047397670897L;
        oj.lyrl[277] = 1892189234549289324L;
        oj.lyrl[278] = -50135046444529240L;
        oj.lyrl[279] = -8187762991685718313L;
        oj.lyrl[280] = 3171778423636465308L;
        oj.lyrl[281] = -2357429064407320542L;
        oj.lyrl[282] = 2504743413699676662L;
        oj.lyrl[283] = -3394601264522222806L;
        oj.lyrl[284] = -7850635035625032631L;
        oj.lyrl[285] = 4566513957096418186L;
        oj.lyrl[286] = -2013508651810994446L;
        oj.lyrl[287] = -5595493720311842808L;
        oj.lyrl[288] = -888408944948790703L;
        oj.lyrl[289] = 6098602056162301939L;
        oj.lyrl[290] = -293976786196720665L;
        oj.lyrl[291] = -7548057694389679335L;
        oj.lyrl[292] = -6527389064701057063L;
        oj.lyrl[293] = 1631698264573443948L;
        oj.lyrl[294] = -6745173123384868241L;
        oj.lyrl[295] = 5560071546707219988L;
        oj.lyrl[296] = -356095965030113458L;
        oj.lyrl[297] = 6485786525923347767L;
        oj.lyrl[298] = -6171846228580950714L;
        oj.lyrl[299] = -7865456650637190774L;
    }

    private static /* synthetic */ void lzzh() {
        oj.lyrv[400] = -2140260069;
        oj.lyrv[401] = -1436738380;
        oj.lyrv[402] = 584328279;
        oj.lyrv[403] = -1571626786;
        oj.lyrv[404] = 999332895;
        oj.lyrv[405] = 273110554;
        oj.lyrv[406] = 252537269;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ class_1921 lambda$static$2(class_2960 var0) {
        v0 /* !! */  = oj.uv;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - oj.lyrn("lzso", lyrk(int ), (int)404));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -276091188: {
                    v1 = oj.lyrn("lzsp", lyrk(int ), (int)405);
                    continue block22;
                }
                case 26600520: {
                    v1 = oj.lyrn("lzsq", lyrk(int ), (int)406);
                    continue block22;
                }
                case 1582247745: {
                    v1 = oj.lyrn("lzsr", lyrk(int ), (int)407);
                    continue block22;
                }
                case 1798372139: {
                    break block22;
                }
            }
            break;
        }
        var4_1 = oj.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = oj.uv - oj.lyrn("lzss", lyrk(int ), (int)408)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == oj.lyrn("lzst", lyrt(int ), (int)295)) break;
            v2 /* !! */  = (long)oj.lyrn("lzsu", lyrt(int ), (int)296);
        }
        var3_2 = oj.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = oj.uv - oj.lyrn("lzsv", lyrk(int ), (int)409)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == oj.lyrn("lzsw", lyrt(int ), (int)297)) break;
            v3 /* !! */  = (long)oj.lyrn("lzsx", lyrt(int ), (int)298);
        }
        var2_3 = oj.a;
        if (var4_1) {
            throw null;
lbl32:
            // 2 sources

            return null;
        }
        if (var2_3 || var2_3) ** GOTO lbl32
        v4 /* !! */  = oj.uv;
        if (true) ** GOTO lbl39
        block26: while (true) {
            v4 /* !! */  = (long)(v5 - oj.lyrn("lzsy", lyrk(int ), (int)410));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -917471900: {
                    v5 = oj.lyrn("lzsz", lyrk(int ), (int)411);
                    continue block26;
                }
                case -517549484: {
                    v5 = oj.lyrn("lzta", lyrk(int ), (int)412);
                    continue block26;
                }
                case 863693419: {
                    v5 = oj.lyrn("lztb", lyrk(int ), (int)413);
                    continue block26;
                }
                case 1798372139: {
                    break block26;
                }
            }
            break;
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = oj.uv - oj.lyrn("lztc", lyrk(int ), (int)414)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == oj.lyrn("lztd", lyrt(int ), (int)299)) break;
            v6 /* !! */  = (long)oj.lyrn("lzte", lyrt(int ), (int)300);
        }
        v7 = class_12247.method_75927((RenderPipeline)oj.GHOSTS_ESP_PIPELINE);
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_3 = oj.uv - oj.lyrn("lztf", lyrk(int ), (int)415)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == oj.lyrn("lztg", lyrt(int ), (int)301)) break;
            v8 /* !! */  = (long)oj.lyrn("lzth", lyrt(int ), (int)302);
        }
        v9 = v7.method_75934("Sampler0", var0);
        v10 /* !! */  = oj.uv;
        if (true) ** GOTO lbl67
        block29: while (true) {
            v10 /* !! */  = (long)(v11 - oj.lyrn("lzti", lyrk(int ), (int)416));
lbl67:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1627388555: {
                    v11 = oj.lyrn("lztj", lyrk(int ), (int)417);
                    continue block29;
                }
                case -625844421: {
                    v11 = oj.lyrn("lztk", lyrk(int ), (int)418);
                    continue block29;
                }
                case 662706405: {
                    v11 = oj.lyrn("lztl", lyrk(int ), (int)419);
                    continue block29;
                }
                case 1798372139: {
                    break block29;
                }
            }
            break;
        }
        v12 = v9.method_75937();
        v13 = oj.lyrn("lztm", lyrt(int ), (int)303);
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_4 = oj.uv - oj.lyrn("lztn", lyrk(int ), (int)420)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == oj.lyrn("lzto", lyrt(int ), (int)304)) break;
            v14 /* !! */  = (long)oj.lyrn("lztp", lyrt(int ), (int)305);
        }
        v15 = v12.method_75929((int)v13);
        v16 /* !! */  = oj.uv;
        if (true) ** GOTO lbl91
        block31: while (true) {
            v16 /* !! */  = (long)(oj.lyrn("lztr", lyrk(int ), (int)422) - oj.lyrn("lztq", lyrk(int ), (int)421));
lbl91:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case -1271561398: {
                    continue block31;
                }
                case 1798372139: {
                    break block31;
                }
            }
            break;
        }
        var1_4 = v15.method_75938();
        ** while (var2_3 || var2_3)
lbl98:
        // 1 sources

        while (true) {
            if ((v17 /* !! */  = (cfr_temp_5 = oj.uv - oj.lyrn("lzts", lyrk(int ), (int)423)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == oj.lyrn("lztt", lyrt(int ), (int)306)) break;
            v17 /* !! */  = (long)oj.lyrn("lztu", lyrt(int ), (int)307);
        }
        return class_1921.method_75940((String)"wtex", (class_12247)var1_4);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ class_1921 lambda$static$0(class_2960 var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = oj.uv - oj.lyrn("lzvl", lyrk(int ), (int)439)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == oj.lyrn("lzvm", lyrt(int ), (int)335)) break;
            v0 /* !! */  = (long)oj.lyrn("lzvn", lyrt(int ), (int)336);
        }
        var4_1 = oj.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = oj.uv - oj.lyrn("lzvo", lyrk(int ), (int)440)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == oj.lyrn("lzvp", lyrt(int ), (int)337)) break;
            v1 /* !! */  = (long)oj.lyrn("lzvq", lyrt(int ), (int)338);
        }
        var3_2 /* !! */  = oj.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = oj.uv - oj.lyrn("lzvr", lyrk(int ), (int)441)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == oj.lyrn("lzvs", lyrt(int ), (int)339)) break;
            v2 /* !! */  = (long)oj.lyrn("lzvt", lyrt(int ), (int)340);
        }
        var2_3 = oj.a;
        if (var4_1) {
            throw null;
lbl21:
            // 3 sources

            return null;
        }
        if (var2_3 || var2_3) ** GOTO lbl21
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = oj.uv - oj.lyrn("lzvu", lyrk(int ), (int)442)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == oj.lyrn("lzvv", lyrt(int ), (int)341)) break;
            v3 /* !! */  = (long)oj.lyrn("lzvw", lyrt(int ), (int)342);
        }
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_4 = oj.uv - oj.lyrn("lzvx", lyrk(int ), (int)443)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == oj.lyrn("lzvy", lyrt(int ), (int)343)) break;
            v4 /* !! */  = (long)oj.lyrn("lzvz", lyrt(int ), (int)344);
        }
        v5 = class_12247.method_75927((RenderPipeline)class_10799.field_56842);
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_5 = oj.uv - oj.lyrn("lzwa", lyrk(int ), (int)444)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == oj.lyrn("lzwb", lyrt(int ), (int)345)) break;
            v6 /* !! */  = (long)oj.lyrn("lzwc", lyrt(int ), (int)346);
        }
        v7 = v5.method_75934("Sampler0", var0);
        v8 /* !! */  = oj.uv;
        if (true) ** GOTO lbl45
        block34: while (true) {
            v8 /* !! */  = (long)(oj.lyrn("lzwe", lyrk(int ), (int)446) - oj.lyrn("lzwd", lyrk(int ), (int)445));
lbl45:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case 1798372139: {
                    break block34;
                }
                case 2030086585: {
                    continue block34;
                }
            }
            break;
        }
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_6 = oj.uv - oj.lyrn("lzwf", lyrk(int ), (int)447)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == oj.lyrn("lzwg", lyrt(int ), (int)347)) break;
            v9 /* !! */  = (long)oj.lyrn("lzwh", lyrt(int ), (int)348);
        }
        v10 = v7.method_75931(class_12246.field_63981);
        v11 /* !! */  = oj.uv;
        if (true) ** GOTO lbl60
        block36: while (true) {
            v11 /* !! */  = (long)(v12 - oj.lyrn("lzwi", lyrk(int ), (int)448));
lbl60:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -1800980567: {
                    v12 = oj.lyrn("lzwj", lyrk(int ), (int)449);
                    continue block36;
                }
                case 1622430295: {
                    v12 = oj.lyrn("lzwk", lyrk(int ), (int)450);
                    continue block36;
                }
                case 1798372139: {
                    break block36;
                }
            }
            break;
        }
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_7 = oj.uv - oj.lyrn("lzwl", lyrk(int ), (int)451)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == oj.lyrn("lzwm", lyrt(int ), (int)349)) break;
            v13 /* !! */  = (long)oj.lyrn("lzwn", lyrt(int ), (int)350);
        }
        v14 = v10.method_75932(class_12247.class_4750.field_21854);
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_8 = oj.uv - oj.lyrn("lzwo", lyrk(int ), (int)452)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v15 /* !! */  == oj.lyrn("lzwp", lyrt(int ), (int)351)) break;
            v15 /* !! */  = (long)oj.lyrn("lzwq", lyrt(int ), (int)352);
        }
        v16 = v14.method_75938();
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_9 = oj.uv - oj.lyrn("lzwr", lyrk(int ), (int)453)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == oj.lyrn("lzws", lyrt(int ), (int)353)) break;
            v17 /* !! */  = (long)oj.lyrn("lzwt", lyrt(int ), (int)354);
        }
        var1_4 = class_1921.method_75940((String)"phobia_custom_model_outline", (class_12247)v16);
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3 || var2_3) ** GOTO lbl21
                v18 /* !! */  = oj.uv;
                if (true) ** GOTO lbl95
                block40: while (true) {
                    v18 /* !! */  = (long)(oj.lyrn("lzwv", lyrk(int ), (int)455) - oj.lyrn("lzwu", lyrk(int ), (int)454));
lbl95:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case 1079155771: {
                            continue block40;
                        }
                        case 1798372139: {
                            break block40;
                        }
                    }
                    break;
                }
                v19 /* !! */  = oj.uv;
                if (true) ** GOTO lbl104
                block41: while (true) {
                    v19 /* !! */  = (long)(oj.lyrn("lzwx", lyrk(int ), (int)457) - oj.lyrn("lzww", lyrk(int ), (int)456));
lbl104:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case 1587767141: {
                            continue block41;
                        }
                        case 1798372139: {
                            break block41;
                        }
                    }
                    break;
                }
                oj.CUSTOM_MODEL_OUTLINE_LAYERS.add(var1_4);
                if (var2_3 || var2_3) ** continue;
                return var1_4;
            }
            case 0: {
                var3_2 /* !! */  = (int)oj.lyrn("lzwy", lyrt(int ), (int)355);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl118:
            // 2 sources

            case 1: {
                var3_2 /* !! */  = (int)oj.lyrn("lzwz", lyrt(int ), (int)356);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl134
            }
            case 2: {
                var3_2 /* !! */  = (int)oj.lyrn("lzxa", lyrt(int ), (int)357);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl142
            }
lbl128:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)oj.lyrn("lzxb", lyrt(int ), (int)358);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl142
                    break;
                }
            }
lbl134:
            // 3 sources

            case 4: {
                var3_2 /* !! */  = (int)oj.lyrn("lzxc", lyrt(int ), (int)359);
                if (!var4_1) ** GOTO lbl118
                throw null;
            }
            case 5: {
                var3_2 /* !! */  = (int)oj.lyrn("lzxd", lyrt(int ), (int)360);
                if (var4_1) {
                    throw null;
                }
            }
lbl142:
            // 5 sources

            case 6: {
                var3_2 /* !! */  = (int)oj.lyrn("lzxe", lyrt(int ), (int)361);
                if (!var4_1) ** GOTO lbl128
                throw null;
            }
            case 7: 
        }
        var3_2 /* !! */  = (int)oj.lyrn("lzxf", lyrt(int ), (int)362);
        ** while (!var4_1)
lbl149:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ Optional lambda$layerTextureOf$17(class_1921 var0) {
        v0 /* !! */  = oj.uv;
        if (true) ** GOTO lbl5
        block35: while (true) {
            v0 /* !! */  = (long)(v1 - oj.lyrn("lywi", lyrk(int ), (int)72));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -531872929: {
                    v1 = oj.lyrn("lywj", lyrk(int ), (int)73);
                    continue block35;
                }
                case -14118902: {
                    v1 = oj.lyrn("lywk", lyrk(int ), (int)74);
                    continue block35;
                }
                case 1798372139: {
                    break block35;
                }
                case 1947058397: {
                    v1 = oj.lyrn("lywl", lyrk(int ), (int)75);
                    continue block35;
                }
            }
            break;
        }
        var4_1 = oj.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = oj.uv - oj.lyrn("lywm", lyrk(int ), (int)76)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == oj.lyrn("lywn", lyrt(int ), (int)49)) break;
            v2 /* !! */  = (long)oj.lyrn("lywo", lyrt(int ), (int)50);
        }
        var3_2 /* !! */  = oj.b;
        v3 /* !! */  = oj.uv;
        if (true) ** GOTO lbl28
        block37: while (true) {
            v3 /* !! */  = (long)(v4 - oj.lyrn("lywp", lyrk(int ), (int)77));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1036606481: {
                    v4 = oj.lyrn("lywq", lyrk(int ), (int)78);
                    continue block37;
                }
                case 1016306916: {
                    v4 = oj.lyrn("lywr", lyrk(int ), (int)79);
                    continue block37;
                }
                case 1798372139: {
                    break block37;
                }
            }
            break;
        }
        var2_3 = oj.a;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_1) {
                    throw null;
lbl43:
                    // 4 sources

                    return null;
                }
                if (var2_3 || var2_3) ** GOTO lbl43
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = oj.uv - oj.lyrn("lyws", lyrk(int ), (int)80)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == oj.lyrn("lywt", lyrt(int ), (int)51)) break;
                    v5 /* !! */  = (long)oj.lyrn("lywu", lyrt(int ), (int)52);
                }
                v6 = var0.field_64013;
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = oj.uv - oj.lyrn("lywv", lyrk(int ), (int)81)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == oj.lyrn("lyww", lyrt(int ), (int)53)) break;
                    v7 /* !! */  = (long)oj.lyrn("lywx", lyrt(int ), (int)54);
                }
                v8 = v6.field_63987;
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = oj.uv - oj.lyrn("lywy", lyrk(int ), (int)82)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == oj.lyrn("lywz", lyrt(int ), (int)55)) break;
                    v9 /* !! */  = (long)oj.lyrn("lyxa", lyrt(int ), (int)56);
                }
                var1_4 = (class_12247.class_12338)v8.get("Sampler0");
                if (var2_3 || var2_3) ** GOTO lbl43
                if (var1_4 == null) ** GOTO lbl93
                if (var2_3) ** GOTO lbl43
                v10 /* !! */  = oj.uv;
                if (true) ** GOTO lbl71
                block42: while (true) {
                    v10 /* !! */  = (long)(v11 - oj.lyrn("lyxb", lyrk(int ), (int)83));
lbl71:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -790702782: {
                            v11 = oj.lyrn("lyxc", lyrk(int ), (int)84);
                            continue block42;
                        }
                        case 261516785: {
                            v11 = oj.lyrn("lyxd", lyrk(int ), (int)85);
                            continue block42;
                        }
                        case 1108439393: {
                            v11 = oj.lyrn("lyxe", lyrk(int ), (int)86);
                            continue block42;
                        }
                        case 1798372139: {
                            break block42;
                        }
                    }
                    break;
                }
                v12 = var1_4.comp_5228;
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_4 = oj.uv - oj.lyrn("lyxf", lyrk(int ), (int)87)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == oj.lyrn("lyxg", lyrt(int ), (int)57)) break;
                    v13 /* !! */  = (long)oj.lyrn("lyxh", lyrt(int ), (int)58);
                }
                v14 /* !! */  = Optional.of(v12);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl112
lbl93:
                // 1 sources

                if (!var2_3 && !var2_3) ** break;
                ** continue;
                v15 /* !! */  = oj.uv;
                if (true) ** GOTO lbl99
                block44: while (true) {
                    v15 /* !! */  = (long)(v16 - oj.lyrn("lyxi", lyrk(int ), (int)88));
lbl99:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1827806660: {
                            v16 = oj.lyrn("lyxj", lyrk(int ), (int)89);
                            continue block44;
                        }
                        case 730139538: {
                            v16 = oj.lyrn("lyxk", lyrk(int ), (int)90);
                            continue block44;
                        }
                        case 1798372139: {
                            break block44;
                        }
                        case 1908609876: {
                            v16 = oj.lyrn("lyxl", lyrk(int ), (int)91);
                            continue block44;
                        }
                    }
                    break;
                }
                v14 /* !! */  = Optional.empty();
lbl112:
                // 2 sources

                return v14 /* !! */ ;
            }
lbl113:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)oj.lyrn("lyxm", lyrt(int ), (int)59);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl118:
            // 2 sources

            case 1: {
                var3_2 /* !! */  = (int)oj.lyrn("lyxn", lyrt(int ), (int)60);
                if (var4_1) {
                    throw null;
                }
            }
            case 2: {
                var3_2 /* !! */  = (int)oj.lyrn("lyxo", lyrt(int ), (int)61);
                if (!var4_1) ** GOTO lbl118
                throw null;
            }
            case 3: {
                var3_2 /* !! */  = (int)oj.lyrn("lyxp", lyrt(int ), (int)62);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl131:
            // 2 sources

            case 4: {
                var3_2 /* !! */  = (int)oj.lyrn("lyxq", lyrt(int ), (int)63);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl146
            }
            case 5: {
                var3_2 /* !! */  = (int)oj.lyrn("lyxr", lyrt(int ), (int)64);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl146
            }
            case 6: {
                var3_2 /* !! */  = (int)oj.lyrn("lyxs", lyrt(int ), (int)65);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl146:
            // 4 sources

            case 7: {
                var3_2 /* !! */  = (int)oj.lyrn("lyxt", lyrt(int ), (int)66);
                if (!var4_1) ** GOTO lbl131
                throw null;
            }
lbl150:
            // 3 sources

            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)oj.lyrn("lyxu", lyrt(int ), (int)67);
                    if (!var4_1) ** GOTO lbl113
                    throw null;
                }
            }
            case 9: 
        }
        var3_2 /* !! */  = (int)oj.lyrn("lyxv", lyrt(int ), (int)68);
        ** while (!var4_1)
lbl158:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ class_1921 lambda$static$5(class_2960 var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = oj.uv - oj.lyrn("lzoc", lyrk(int ), (int)333)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == oj.lyrn("lzod", lyrt(int ), (int)250)) break;
            v0 /* !! */  = (long)oj.lyrn("lzoe", lyrt(int ), (int)251);
        }
        var4_1 = oj.c;
        v1 /* !! */  = oj.uv;
        if (true) ** GOTO lbl11
        block45: while (true) {
            v1 /* !! */  = (long)(oj.lyrn("lzog", lyrk(int ), (int)335) - oj.lyrn("lzof", lyrk(int ), (int)334));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -683979973: {
                    continue block45;
                }
                case 1798372139: {
                    break block45;
                }
            }
            break;
        }
        var3_2 /* !! */  = oj.b;
        v2 /* !! */  = oj.uv;
        if (true) ** GOTO lbl21
        block46: while (true) {
            v2 /* !! */  = (long)(v3 - oj.lyrn("lzoh", lyrk(int ), (int)336));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -644944525: {
                    v3 = oj.lyrn("lzoi", lyrk(int ), (int)337);
                    continue block46;
                }
                case 330784433: {
                    v3 = oj.lyrn("lzoj", lyrk(int ), (int)338);
                    continue block46;
                }
                case 1798372139: {
                    break block46;
                }
            }
            break;
        }
        var2_3 = oj.a;
        if (var4_1) {
            throw null;
lbl33:
            // 3 sources

            return null;
        }
        if (var2_3) ** GOTO lbl33
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3) ** GOTO lbl33
                v4 /* !! */  = oj.uv;
                if (true) ** GOTO lbl44
                block48: while (true) {
                    v4 /* !! */  = (long)(v5 - oj.lyrn("lzok", lyrk(int ), (int)339));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -393986703: {
                            v5 = oj.lyrn("lzol", lyrk(int ), (int)340);
                            continue block48;
                        }
                        case -196071837: {
                            v5 = oj.lyrn("lzom", lyrk(int ), (int)341);
                            continue block48;
                        }
                        case 1233758922: {
                            v5 = oj.lyrn("lzon", lyrk(int ), (int)342);
                            continue block48;
                        }
                        case 1798372139: {
                            break block48;
                        }
                    }
                    break;
                }
                v6 /* !! */  = oj.uv;
                if (true) ** GOTO lbl60
                block49: while (true) {
                    v6 /* !! */  = (long)(v7 - oj.lyrn("lzoo", lyrk(int ), (int)343));
lbl60:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -428490151: {
                            v7 = oj.lyrn("lzop", lyrk(int ), (int)344);
                            continue block49;
                        }
                        case -145221334: {
                            v7 = oj.lyrn("lzoq", lyrk(int ), (int)345);
                            continue block49;
                        }
                        case 1798372139: {
                            break block49;
                        }
                        case 2142639508: {
                            v7 = oj.lyrn("lzor", lyrk(int ), (int)346);
                            continue block49;
                        }
                    }
                    break;
                }
                v8 = class_12247.method_75927((RenderPipeline)oj.SHADER_HANDS_HALO_PIPELINE);
                v9 /* !! */  = oj.uv;
                if (true) ** GOTO lbl77
                block50: while (true) {
                    v9 /* !! */  = (long)(oj.lyrn("lzot", lyrk(int ), (int)348) - oj.lyrn("lzos", lyrk(int ), (int)347));
lbl77:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1001231723: {
                            continue block50;
                        }
                        case 1798372139: {
                            break block50;
                        }
                    }
                    break;
                }
                v10 = v8.method_75934("Sampler0", var0);
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_1 = oj.uv - oj.lyrn("lzou", lyrk(int ), (int)349)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == oj.lyrn("lzov", lyrt(int ), (int)252)) break;
                    v11 /* !! */  = (long)oj.lyrn("lzow", lyrt(int ), (int)253);
                }
                v12 = v10.method_75937();
                v13 = oj.lyrn("lzox", lyrt(int ), (int)254);
                v14 /* !! */  = oj.uv;
                if (true) ** GOTO lbl94
                block52: while (true) {
                    v14 /* !! */  = (long)(v15 - oj.lyrn("lzoy", lyrk(int ), (int)350));
lbl94:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1448120310: {
                            v15 = oj.lyrn("lzoz", lyrk(int ), (int)351);
                            continue block52;
                        }
                        case -88480242: {
                            v15 = oj.lyrn("lzpa", lyrk(int ), (int)352);
                            continue block52;
                        }
                        case 1798372139: {
                            break block52;
                        }
                    }
                    break;
                }
                v16 = v12.method_75929((int)v13);
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_2 = oj.uv - oj.lyrn("lzpb", lyrk(int ), (int)353)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == oj.lyrn("lzpc", lyrt(int ), (int)255)) break;
                    v17 /* !! */  = (long)oj.lyrn("lzpd", lyrt(int ), (int)256);
                }
                var1_4 = v16.method_75938();
                if (!var2_3 && !var2_3) ** break;
                ** continue;
                v18 /* !! */  = oj.uv;
                if (true) ** GOTO lbl116
                block54: while (true) {
                    v18 /* !! */  = (long)(v19 - oj.lyrn("lzpe", lyrk(int ), (int)354));
lbl116:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1992426574: {
                            v19 = oj.lyrn("lzpf", lyrk(int ), (int)355);
                            continue block54;
                        }
                        case -827050705: {
                            v19 = oj.lyrn("lzpg", lyrk(int ), (int)356);
                            continue block54;
                        }
                        case 51476547: {
                            v19 = oj.lyrn("lzph", lyrk(int ), (int)357);
                            continue block54;
                        }
                        case 1798372139: {
                            break block54;
                        }
                    }
                    break;
                }
                return class_1921.method_75940((String)"shader_hands_halo", (class_12247)var1_4);
            }
            case 0: {
                var3_2 /* !! */  = (int)oj.lyrn("lzpi", lyrt(int ), (int)257);
                if (var4_1) {
                    throw null;
                }
            }
            case 1: {
                var3_2 /* !! */  = (int)oj.lyrn("lzpj", lyrt(int ), (int)258);
                if (!var4_1) break;
                throw null;
            }
lbl137:
            // 2 sources

            case 2: {
                var3_2 /* !! */  = (int)oj.lyrn("lzpk", lyrt(int ), (int)259);
                if (!var4_1) break;
                throw null;
            }
            case 3: {
                var3_2 /* !! */  = (int)oj.lyrn("lzpl", lyrt(int ), (int)260);
                if (var4_1) {
                    throw null;
                }
            }
            case 4: {
                var3_2 /* !! */  = (int)oj.lyrn("lzpm", lyrt(int ), (int)261);
                if (!var4_1) ** GOTO lbl137
                throw null;
            }
            case 5: 
        }
        do {
            var3_2 /* !! */  = (int)oj.lyrn("lzpn", lyrt(int ), (int)262);
        } while (!var4_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ class_1921 lambda$static$4(class_2960 var0) {
        v0 /* !! */  = oj.uv;
        if (true) ** GOTO lbl5
        block38: while (true) {
            v0 /* !! */  = (long)(v1 - oj.lyrn("lzpo", lyrk(int ), (int)358));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 311370133: {
                    v1 = oj.lyrn("lzpp", lyrk(int ), (int)359);
                    continue block38;
                }
                case 1798372139: {
                    break block38;
                }
                case 1952068887: {
                    v1 = oj.lyrn("lzpq", lyrk(int ), (int)360);
                    continue block38;
                }
                case 1953021730: {
                    v1 = oj.lyrn("lzpr", lyrk(int ), (int)361);
                    continue block38;
                }
            }
            break;
        }
        var4_1 = oj.c;
        v2 /* !! */  = oj.uv;
        if (true) ** GOTO lbl22
        block39: while (true) {
            v2 /* !! */  = (long)(oj.lyrn("lzpt", lyrk(int ), (int)363) - oj.lyrn("lzps", lyrk(int ), (int)362));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1760864430: {
                    continue block39;
                }
                case 1798372139: {
                    break block39;
                }
            }
            break;
        }
        var3_2 /* !! */  = oj.b;
        v3 /* !! */  = oj.uv;
        if (true) ** GOTO lbl32
        block40: while (true) {
            v3 /* !! */  = (long)(oj.lyrn("lzpv", lyrk(int ), (int)365) - oj.lyrn("lzpu", lyrk(int ), (int)364));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1123661913: {
                    continue block40;
                }
                case 1798372139: {
                    break block40;
                }
            }
            break;
        }
        var2_3 = oj.a;
        if (!var4_1) ** GOTO lbl44
        throw null;
lbl-1000:
        // 2 sources

        {
            if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl44:
                // 1 sources

                if (var2_3 || var2_3) ** GOTO lbl-1000
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = oj.uv - oj.lyrn("lzpw", lyrk(int ), (int)366)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == oj.lyrn("lzpx", lyrt(int ), (int)263)) break;
                    v4 /* !! */  = (long)oj.lyrn("lzpy", lyrt(int ), (int)264);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = oj.uv - oj.lyrn("lzpz", lyrk(int ), (int)367)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == oj.lyrn("lzqa", lyrt(int ), (int)265)) break;
                    v5 /* !! */  = (long)oj.lyrn("lzqb", lyrt(int ), (int)266);
                }
                v6 = class_12247.method_75927((RenderPipeline)oj.BLOOM_ESP_PIPELINE);
                v7 /* !! */  = oj.uv;
                if (true) ** GOTO lbl60
                block44: while (true) {
                    v7 /* !! */  = (long)(v8 - oj.lyrn("lzqc", lyrk(int ), (int)368));
lbl60:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -617036683: {
                            v8 = oj.lyrn("lzqd", lyrk(int ), (int)369);
                            continue block44;
                        }
                        case 988122219: {
                            v8 = oj.lyrn("lzqe", lyrk(int ), (int)370);
                            continue block44;
                        }
                        case 1798372139: {
                            break block44;
                        }
                    }
                    break;
                }
                v9 = v6.method_75934("Sampler0", var0);
                v10 /* !! */  = oj.uv;
                if (true) ** GOTO lbl74
                block45: while (true) {
                    v10 /* !! */  = (long)(v11 - oj.lyrn("lzqf", lyrk(int ), (int)371));
lbl74:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -581052968: {
                            v11 = oj.lyrn("lzqg", lyrk(int ), (int)372);
                            continue block45;
                        }
                        case -167457275: {
                            v11 = oj.lyrn("lzqh", lyrk(int ), (int)373);
                            continue block45;
                        }
                        case 1594123378: {
                            v11 = oj.lyrn("lzqi", lyrk(int ), (int)374);
                            continue block45;
                        }
                        case 1798372139: {
                            break block45;
                        }
                    }
                    break;
                }
                v12 = v9.method_75937();
                v13 = oj.lyrn("lzqj", lyrt(int ), (int)267);
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_2 = oj.uv - oj.lyrn("lzqk", lyrk(int ), (int)375)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == oj.lyrn("lzql", lyrt(int ), (int)268)) break;
                    v14 /* !! */  = (long)oj.lyrn("lzqm", lyrt(int ), (int)269);
                }
                v15 = v12.method_75929((int)v13);
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_3 = oj.uv - oj.lyrn("lzqn", lyrk(int ), (int)376)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == oj.lyrn("lzqo", lyrt(int ), (int)270)) break;
                    v16 /* !! */  = (long)oj.lyrn("lzqp", lyrt(int ), (int)271);
                }
                var1_4 = v15.method_75938();
                if (var2_3 || var2_3) continue block41;
                v17 /* !! */  = oj.uv;
                if (true) ** GOTO lbl105
                block48: while (true) {
                    v17 /* !! */  = (long)(v18 - oj.lyrn("lzqq", lyrk(int ), (int)377));
lbl105:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -55989297: {
                            v18 = oj.lyrn("lzqr", lyrk(int ), (int)378);
                            continue block48;
                        }
                        case 404911353: {
                            v18 = oj.lyrn("lzqs", lyrk(int ), (int)379);
                            continue block48;
                        }
                        case 1798372139: {
                            break block48;
                        }
                    }
                    break;
                }
                return class_1921.method_75940((String)"bloom_esp", (class_12247)var1_4);
lbl115:
                // 3 sources

                case 0: {
                    do {
                        var3_2 /* !! */  = (int)oj.lyrn("lzqt", lyrt(int ), (int)272);
                    } while (!var4_1);
                    throw null;
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var3_2 /* !! */  = (int)oj.lyrn("lzqu", lyrt(int ), (int)273);
                        if (var4_1) {
                            throw null;
                        }
                        ** GOTO lbl134
                        break;
                    }
                }
                case 2: {
                    var3_2 /* !! */  = (int)oj.lyrn("lzqv", lyrt(int ), (int)274);
                    if (!var4_1) ** GOTO lbl115
                    throw null;
                }
                case 3: {
                    var3_2 /* !! */  = (int)oj.lyrn("lzqw", lyrt(int ), (int)275);
                    if (!var4_1) ** GOTO lbl115
                    throw null;
                }
lbl134:
                // 2 sources

                case 4: {
                    do {
                        var3_2 /* !! */  = (int)oj.lyrn("lzqx", lyrt(int ), (int)276);
                    } while (!var4_1);
                    throw null;
                }
                case 5: 
            }
        }
        var3_2 /* !! */  = (int)oj.lyrn("lzqy", lyrt(int ), (int)277);
        ** while (!var4_1)
lbl142:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lzyy() {
        oj.lyru[0] = -522326832;
        oj.lyru[1] = 1447674959;
        oj.lyru[2] = -1861934025;
        oj.lyru[3] = 1196294110;
        oj.lyru[4] = -657974977;
        oj.lyru[5] = 1886235449;
        oj.lyru[6] = 1249706169;
        oj.lyru[7] = -1427877897;
        oj.lyru[8] = 1662970534;
        oj.lyru[9] = 1095603237;
        oj.lyru[10] = 1887495969;
        oj.lyru[11] = -709073952;
        oj.lyru[12] = -951962657;
        oj.lyru[13] = -1486488403;
        oj.lyru[14] = -648303780;
        oj.lyru[15] = 462151233;
        oj.lyru[16] = -1421741571;
        oj.lyru[17] = -326290158;
        oj.lyru[18] = -1165318018;
        oj.lyru[19] = -1756957220;
        oj.lyru[20] = 520331235;
        oj.lyru[21] = -1300212793;
        oj.lyru[22] = -1811690046;
        oj.lyru[23] = -361061693;
        oj.lyru[24] = 375146589;
        oj.lyru[25] = 1070804411;
        oj.lyru[26] = -562799265;
        oj.lyru[27] = -1785647259;
        oj.lyru[28] = -1765680337;
        oj.lyru[29] = -1905605675;
        oj.lyru[30] = 85401539;
        oj.lyru[31] = -174054145;
        oj.lyru[32] = -1914868075;
        oj.lyru[33] = -1219393767;
        oj.lyru[34] = 845358205;
        oj.lyru[35] = -1462802183;
        oj.lyru[36] = 1420974732;
        oj.lyru[37] = 157018414;
        oj.lyru[38] = -126853465;
        oj.lyru[39] = 757203046;
        oj.lyru[40] = -1813379876;
        oj.lyru[41] = 2134958515;
        oj.lyru[42] = -1888936001;
        oj.lyru[43] = -497295627;
        oj.lyru[44] = 106919733;
        oj.lyru[45] = -1805338690;
        oj.lyru[46] = -947739087;
        oj.lyru[47] = 1785722045;
        oj.lyru[48] = -1219592387;
        oj.lyru[49] = -2127548261;
        oj.lyru[50] = 1799129152;
        oj.lyru[51] = 1825518527;
        oj.lyru[52] = 676705121;
        oj.lyru[53] = 1225480073;
        oj.lyru[54] = -1793095502;
        oj.lyru[55] = 109672349;
        oj.lyru[56] = -1189658652;
        oj.lyru[57] = -1904586452;
        oj.lyru[58] = -815670638;
        oj.lyru[59] = 1973259031;
        oj.lyru[60] = -428869381;
        oj.lyru[61] = -1121666949;
        oj.lyru[62] = -623333439;
        oj.lyru[63] = 1946057376;
        oj.lyru[64] = 1805024797;
        oj.lyru[65] = -1419877913;
        oj.lyru[66] = 1847387051;
        oj.lyru[67] = 1120278294;
        oj.lyru[68] = -786530965;
        oj.lyru[69] = 898139293;
        oj.lyru[70] = -658019699;
        oj.lyru[71] = 2090657134;
        oj.lyru[72] = -94121372;
        oj.lyru[73] = -1832580020;
        oj.lyru[74] = 1314633312;
        oj.lyru[75] = 442387561;
        oj.lyru[76] = 866750466;
        oj.lyru[77] = -873376473;
        oj.lyru[78] = 1026676352;
        oj.lyru[79] = -1500480123;
        oj.lyru[80] = -1347323327;
        oj.lyru[81] = 1994349209;
        oj.lyru[82] = -788496137;
        oj.lyru[83] = 1649965655;
        oj.lyru[84] = 2136063758;
        oj.lyru[85] = 695781863;
        oj.lyru[86] = -1472063843;
        oj.lyru[87] = -945286005;
        oj.lyru[88] = -545726808;
        oj.lyru[89] = -1997044712;
        oj.lyru[90] = 1647819068;
        oj.lyru[91] = -997549509;
        oj.lyru[92] = -2138253566;
        oj.lyru[93] = 77940903;
        oj.lyru[94] = -356721476;
        oj.lyru[95] = -399085449;
        oj.lyru[96] = -215962974;
        oj.lyru[97] = 2108099179;
        oj.lyru[98] = -75537719;
        oj.lyru[99] = 1603699122;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ class_1921 lambda$static$15(class_2960 var0) {
        v0 /* !! */  = oj.uv;
        if (true) ** GOTO lbl5
        block38: while (true) {
            v0 /* !! */  = (long)(v1 - oj.lyrn("lyzg", lyrk(int ), (int)121));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 41975688: {
                    v1 = oj.lyrn("lyzh", lyrk(int ), (int)122);
                    continue block38;
                }
                case 1196732919: {
                    v1 = oj.lyrn("lyzi", lyrk(int ), (int)123);
                    continue block38;
                }
                case 1798372139: {
                    break block38;
                }
            }
            break;
        }
        var4_1 = oj.c;
        v2 /* !! */  = oj.uv;
        if (true) ** GOTO lbl19
        block39: while (true) {
            v2 /* !! */  = (long)(oj.lyrn("lyzk", lyrk(int ), (int)125) - oj.lyrn("lyzj", lyrk(int ), (int)124));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 1742231681: {
                    continue block39;
                }
                case 1798372139: {
                    break block39;
                }
            }
            break;
        }
        var3_2 /* !! */  = oj.b;
        v3 /* !! */  = oj.uv;
        if (true) ** GOTO lbl29
        block40: while (true) {
            v3 /* !! */  = (long)(v4 - oj.lyrn("lyzl", lyrk(int ), (int)126));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2092119513: {
                    v4 = oj.lyrn("lyzm", lyrk(int ), (int)127);
                    continue block40;
                }
                case -1261777410: {
                    v4 = oj.lyrn("lyzn", lyrk(int ), (int)128);
                    continue block40;
                }
                case 1229618770: {
                    v4 = oj.lyrn("lyzo", lyrk(int ), (int)129);
                    continue block40;
                }
                case 1798372139: {
                    break block40;
                }
            }
            break;
        }
        var2_3 = oj.a;
        if (var4_1) {
            throw null;
lbl44:
            // 3 sources

            return null;
        }
        if (var2_3 || var2_3) ** GOTO lbl44
        v5 /* !! */  = oj.uv;
        if (true) ** GOTO lbl51
        block42: while (true) {
            v5 /* !! */  = (long)(oj.lyrn("lyzq", lyrk(int ), (int)131) - oj.lyrn("lyzp", lyrk(int ), (int)130));
lbl51:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -111619914: {
                    continue block42;
                }
                case 1798372139: {
                    break block42;
                }
            }
            break;
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_0 = oj.uv - oj.lyrn("lyzr", lyrk(int ), (int)132)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == oj.lyrn("lyzs", lyrt(int ), (int)76)) break;
            v6 /* !! */  = (long)oj.lyrn("lyzt", lyrt(int ), (int)77);
        }
        v7 = class_12247.method_75927((RenderPipeline)oj.CHAMS_WALL_PIPELINE);
        v8 /* !! */  = oj.uv;
        if (true) ** GOTO lbl66
        block44: while (true) {
            v8 /* !! */  = (long)(v9 - oj.lyrn("lyzu", lyrk(int ), (int)133));
lbl66:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1682725309: {
                    v9 = oj.lyrn("lyzv", lyrk(int ), (int)134);
                    continue block44;
                }
                case -1248524461: {
                    v9 = oj.lyrn("lyzw", lyrk(int ), (int)135);
                    continue block44;
                }
                case 1626861865: {
                    v9 = oj.lyrn("lyzx", lyrk(int ), (int)136);
                    continue block44;
                }
                case 1798372139: {
                    break block44;
                }
            }
            break;
        }
        v10 = v7.method_75934("Sampler0", var0);
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_1 = oj.uv - oj.lyrn("lyzy", lyrk(int ), (int)137)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == oj.lyrn("lyzz", lyrt(int ), (int)78)) break;
            v11 /* !! */  = (long)oj.lyrn("lzaa", lyrt(int ), (int)79);
        }
        v12 = v10.method_75937();
        v13 = oj.lyrn("lzab", lyrt(int ), (int)80);
        v14 /* !! */  = oj.uv;
        if (true) ** GOTO lbl90
        block46: while (true) {
            v14 /* !! */  = (long)(v15 - oj.lyrn("lzac", lyrk(int ), (int)138));
lbl90:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case 210858280: {
                    v15 = oj.lyrn("lzad", lyrk(int ), (int)139);
                    continue block46;
                }
                case 1798372139: {
                    break block46;
                }
                case 1960047447: {
                    v15 = oj.lyrn("lzae", lyrk(int ), (int)140);
                    continue block46;
                }
            }
            break;
        }
        v16 = v12.method_75929((int)v13);
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_2 = oj.uv - oj.lyrn("lzaf", lyrk(int ), (int)141)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == oj.lyrn("lzag", lyrt(int ), (int)81)) break;
            v17 /* !! */  = (long)oj.lyrn("lzah", lyrt(int ), (int)82);
        }
        var1_4 = v16.method_75938();
        if (var2_3) ** GOTO lbl44
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        block30 : switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_3) ** break;
                ** continue;
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_3 = oj.uv - oj.lyrn("lzai", lyrk(int ), (int)142)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == oj.lyrn("lzaj", lyrt(int ), (int)83)) break;
                    v18 /* !! */  = (long)oj.lyrn("lzak", lyrt(int ), (int)84);
                }
                return class_1921.method_75940((String)"chams_wall", (class_12247)var1_4);
            }
            case 0: {
                var3_2 /* !! */  = (int)oj.lyrn("lzal", lyrt(int ), (int)85);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl137
            }
            case 1: {
                var3_2 /* !! */  = (int)oj.lyrn("lzam", lyrt(int ), (int)86);
                if (var4_1) {
                    throw null;
                }
            }
lbl127:
            // 4 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)oj.lyrn("lzan", lyrt(int ), (int)87);
                    if (!var4_1) break block30;
                    throw null;
                }
            }
            case 3: {
                do {
                    var3_2 /* !! */  = (int)oj.lyrn("lzao", lyrt(int ), (int)88);
                } while (!var4_1);
                throw null;
            }
lbl137:
            // 2 sources

            case 4: {
                var3_2 /* !! */  = (int)oj.lyrn("lzap", lyrt(int ), (int)89);
                if (!var4_1) ** GOTO lbl127
                throw null;
            }
            case 5: 
        }
        var3_2 /* !! */  = (int)oj.lyrn("lzaq", lyrt(int ), (int)90);
        ** while (!var4_1)
lbl144:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long lyrk(int n2) {
        return lyrl[n2] ^ lyrm[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ class_1921 lambda$static$11(class_2960 var0) {
        v0 /* !! */  = oj.uv;
        if (true) ** GOTO lbl5
        block53: while (true) {
            v0 /* !! */  = (long)(v1 - oj.lyrn("lzfe", lyrk(int ), (int)203));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1650682153: {
                    v1 = oj.lyrn("lzff", lyrk(int ), (int)204);
                    continue block53;
                }
                case 1798372139: {
                    break block53;
                }
                case 2105385207: {
                    v1 = oj.lyrn("lzfg", lyrk(int ), (int)205);
                    continue block53;
                }
            }
            break;
        }
        var4_1 = oj.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = oj.uv - oj.lyrn("lzfh", lyrk(int ), (int)206)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == oj.lyrn("lzfi", lyrt(int ), (int)148)) break;
            v2 /* !! */  = (long)oj.lyrn("lzfj", lyrt(int ), (int)149);
        }
        var3_2 /* !! */  = oj.b;
        v3 /* !! */  = oj.uv;
        if (true) ** GOTO lbl26
        block55: while (true) {
            v3 /* !! */  = (long)(oj.lyrn("lzfl", lyrk(int ), (int)208) - oj.lyrn("lzfk", lyrk(int ), (int)207));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1289833185: {
                    continue block55;
                }
                case 1798372139: {
                    break block55;
                }
            }
            break;
        }
        var2_3 = oj.a;
        if (var4_1) {
            throw null;
lbl34:
            // 2 sources

            return null;
        }
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3 || var2_3) ** GOTO lbl34
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = oj.uv - oj.lyrn("lzfm", lyrk(int ), (int)209)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == oj.lyrn("lzfn", lyrt(int ), (int)150)) break;
                    v4 /* !! */  = (long)oj.lyrn("lzfo", lyrt(int ), (int)151);
                }
                v5 /* !! */  = oj.uv;
                if (true) ** GOTO lbl50
                block58: while (true) {
                    v5 /* !! */  = (long)(v6 - oj.lyrn("lzfp", lyrk(int ), (int)210));
lbl50:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1611737364: {
                            v6 = oj.lyrn("lzfq", lyrk(int ), (int)211);
                            continue block58;
                        }
                        case 811605865: {
                            v6 = oj.lyrn("lzfr", lyrk(int ), (int)212);
                            continue block58;
                        }
                        case 1798372139: {
                            break block58;
                        }
                    }
                    break;
                }
                v7 = class_12247.method_75927((RenderPipeline)oj.SHADER_HANDS_ITEMGLOW_PIPELINE);
                v8 /* !! */  = oj.uv;
                if (true) ** GOTO lbl64
                block59: while (true) {
                    v8 /* !! */  = (long)(v9 - oj.lyrn("lzfs", lyrk(int ), (int)213));
lbl64:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1938299452: {
                            v9 = oj.lyrn("lzft", lyrk(int ), (int)214);
                            continue block59;
                        }
                        case 87657731: {
                            v9 = oj.lyrn("lzfu", lyrk(int ), (int)215);
                            continue block59;
                        }
                        case 1798372139: {
                            break block59;
                        }
                    }
                    break;
                }
                v10 = v7.method_75934("Sampler0", var0);
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_2 = oj.uv - oj.lyrn("lzfv", lyrk(int ), (int)216)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v11 /* !! */  == oj.lyrn("lzfw", lyrt(int ), (int)152)) break;
                    v11 /* !! */  = (long)oj.lyrn("lzfx", lyrt(int ), (int)153);
                }
                v12 /* !! */  = oj.uv;
                if (true) ** GOTO lbl84
                block61: while (true) {
                    v12 /* !! */  = (long)(v13 - oj.lyrn("lzfy", lyrk(int ), (int)217));
lbl84:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case 294691640: {
                            v13 = oj.lyrn("lzfz", lyrk(int ), (int)218);
                            continue block61;
                        }
                        case 445033809: {
                            v13 = oj.lyrn("lzga", lyrk(int ), (int)219);
                            continue block61;
                        }
                        case 1798372139: {
                            break block61;
                        }
                    }
                    break;
                }
                v14 = v10.method_75931(on.OUTPUT_TARGET);
                v15 /* !! */  = oj.uv;
                if (true) ** GOTO lbl98
                block62: while (true) {
                    v15 /* !! */  = (long)(v16 - oj.lyrn("lzgb", lyrk(int ), (int)220));
lbl98:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -759833662: {
                            v16 = oj.lyrn("lzgc", lyrk(int ), (int)221);
                            continue block62;
                        }
                        case 1798372139: {
                            break block62;
                        }
                        case 2144632439: {
                            v16 = oj.lyrn("lzgd", lyrk(int ), (int)222);
                            continue block62;
                        }
                    }
                    break;
                }
                v17 = v14.method_75937();
                v18 = oj.lyrn("lzge", lyrt(int ), (int)154);
                v19 /* !! */  = oj.uv;
                if (true) ** GOTO lbl113
                block63: while (true) {
                    v19 /* !! */  = (long)(v20 - oj.lyrn("lzgf", lyrk(int ), (int)223));
lbl113:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -583878873: {
                            v20 = oj.lyrn("lzgg", lyrk(int ), (int)224);
                            continue block63;
                        }
                        case 301102523: {
                            v20 = oj.lyrn("lzgh", lyrk(int ), (int)225);
                            continue block63;
                        }
                        case 1798372139: {
                            break block63;
                        }
                    }
                    break;
                }
                v21 = v17.method_75929((int)v18);
                v22 /* !! */  = oj.uv;
                if (true) ** GOTO lbl127
                block64: while (true) {
                    v22 /* !! */  = (long)(v23 - oj.lyrn("lzgi", lyrk(int ), (int)226));
lbl127:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -1695135833: {
                            v23 = oj.lyrn("lzgj", lyrk(int ), (int)227);
                            continue block64;
                        }
                        case -422675923: {
                            v23 = oj.lyrn("lzgk", lyrk(int ), (int)228);
                            continue block64;
                        }
                        case 1798372139: {
                            break block64;
                        }
                    }
                    break;
                }
                var1_4 = v21.method_75938();
                if (var2_3 || var2_3) ** continue;
                v24 /* !! */  = oj.uv;
                if (true) ** GOTO lbl142
                block65: while (true) {
                    v24 /* !! */  = (long)(v25 - oj.lyrn("lzgl", lyrk(int ), (int)229));
lbl142:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case -1823074373: {
                            v25 = oj.lyrn("lzgm", lyrk(int ), (int)230);
                            continue block65;
                        }
                        case 841152768: {
                            v25 = oj.lyrn("lzgn", lyrk(int ), (int)231);
                            continue block65;
                        }
                        case 1798372139: {
                            break block65;
                        }
                        case 2009803663: {
                            v25 = oj.lyrn("lzgo", lyrk(int ), (int)232);
                            continue block65;
                        }
                    }
                    break;
                }
                return class_1921.method_75940((String)"shader_hands_trail_itemglow", (class_12247)var1_4);
            }
lbl155:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)oj.lyrn("lzgp", lyrt(int ), (int)155);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl170
            }
lbl160:
            // 2 sources

            case 1: {
                var3_2 /* !! */  = (int)oj.lyrn("lzgq", lyrt(int ), (int)156);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl170
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)oj.lyrn("lzgr", lyrt(int ), (int)157);
                    if (!var4_1) ** GOTO lbl160
                    throw null;
                }
            }
lbl170:
            // 4 sources

            case 3: {
                var3_2 /* !! */  = (int)oj.lyrn("lzgs", lyrt(int ), (int)158);
                if (!var4_1) ** GOTO lbl155
                throw null;
            }
            case 4: {
                var3_2 /* !! */  = (int)oj.lyrn("lzgt", lyrt(int ), (int)159);
                if (!var4_1) ** GOTO lbl170
                throw null;
            }
            case 5: 
        }
        var3_2 /* !! */  = (int)oj.lyrn("lzgu", lyrt(int ), (int)160);
        ** while (!var4_1)
lbl181:
        // 1 sources

        throw null;
    }
}

