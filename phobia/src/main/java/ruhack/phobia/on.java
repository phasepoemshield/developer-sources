/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.pipeline.BlendFunction
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Snippet
 *  com.mojang.blaze3d.platform.DepthTestFunction
 *  com.mojang.blaze3d.systems.CommandEncoder
 *  com.mojang.blaze3d.systems.GpuDevice
 *  com.mojang.blaze3d.systems.RenderPass
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.FilterMode
 *  com.mojang.blaze3d.textures.GpuTexture
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  com.mojang.blaze3d.textures.TextureFormat
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  net.minecraft.class_10789
 *  net.minecraft.class_10799
 *  net.minecraft.class_12246
 *  net.minecraft.class_276
 *  net.minecraft.class_290
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_6367
 *  org.lwjgl.system.MemoryUtil
 */
package ruhack.phobia;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Supplier;
import net.minecraft.class_10789;
import net.minecraft.class_10799;
import net.minecraft.class_12246;
import net.minecraft.class_276;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_6367;
import org.lwjgl.system.MemoryUtil;
import ruhack.phobia.jn;

public final class on {
    private static final GpuTexture[] trailTextures;
    private static final int DOWNSAMPLE = 2;
    private static float smoothDt;
    private static ByteBuffer uniformData;
    private static final RenderPipeline BLEND_PIPELINE;
    private static int height;
    static final long te = 9042827930294130137L;
    private static int readIndex;
    private static long lastSwingNanos;
    private static final int UNIFORM_SIZE = 80;
    private static class_6367 maskFramebuffer;
    private static GpuBuffer uniformBuffer;
    private static boolean wasSwinging;
    public static final class_12246 OUTPUT_TARGET;
    public static final boolean c;
    private static float smoothTurnWind;
    private static final GpuTextureView[] trailViews;
    private static long[] ksnf;
    private static int[] ksmy;
    public static final int b;
    private static float previousCameraYaw;
    private static final RenderPipeline COMPOSITE_PIPELINE;
    private static int width;
    private static float smoothBurst;
    private static float smoothSway;
    private static GpuBuffer dummyVertexBuffer;
    private static long[] ksne;
    private static float smoothRise;
    public static final boolean a;
    private static final RenderPipeline FADE_PIPELINE;
    private static boolean framePrepared;
    private static long lastFrameNanos;
    private static int[] ksmx;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$beginFrame$1() {
        v0 /* !! */  = on.te;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - on.ksmz("ktun", ksnd(int ), (int)186));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 404171915: {
                    v1 = on.ksmz("ktuo", ksnd(int ), (int)187);
                    continue block17;
                }
                case 1173861286: {
                    v1 = on.ksmz("ktup", ksnd(int ), (int)188);
                    continue block17;
                }
                case 1982436825: {
                    break block17;
                }
            }
            break;
        }
        var2 = on.c;
        v2 /* !! */  = on.te;
        if (true) ** GOTO lbl19
        block18: while (true) {
            v2 /* !! */  = (long)(v3 - on.ksmz("ktuq", ksnd(int ), (int)189));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1381917389: {
                    v3 = on.ksmz("ktur", ksnd(int ), (int)190);
                    continue block18;
                }
                case -1280854404: {
                    v3 = on.ksmz("ktus", ksnd(int ), (int)191);
                    continue block18;
                }
                case 512294018: {
                    v3 = on.ksmz("ktut", ksnd(int ), (int)192);
                    continue block18;
                }
                case 1982436825: {
                    break block18;
                }
            }
            break;
        }
        var1_1 /* !! */  = on.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = on.te - on.ksmz("ktuu", ksnd(int ), (int)193)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == on.ksmz("ktuv", ksmw(int ), (int)681)) break;
            v4 /* !! */  = (long)on.ksmz("ktuw", ksmw(int ), (int)682);
        }
        var0_2 = on.a;
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
                return "phobia:shader_hands_trail_mask_clear";
            }
            case 0: {
                var1_1 /* !! */  = (int)on.ksmz("ktux", ksmw(int ), (int)683);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl57
            }
lbl53:
            // 2 sources

            case 1: {
                var1_1 /* !! */  = (int)on.ksmz("ktuy", ksmw(int ), (int)684);
                if (!var2) break;
                throw null;
            }
lbl57:
            // 2 sources

            case 2: {
                var1_1 /* !! */  = (int)on.ksmz("ktuz", ksmw(int ), (int)685);
                if (!var2) ** GOTO lbl53
                throw null;
            }
            case 3: 
        }
        do {
            var1_1 /* !! */  = (int)on.ksmz("ktva", ksmw(int ), (int)686);
        } while (!var2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$ensureResources$5() {
        v0 /* !! */  = on.te;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - on.ksmz("ktsl", ksnd(int ), (int)156));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1201321781: {
                    v1 = on.ksmz("ktsm", ksnd(int ), (int)157);
                    continue block22;
                }
                case 1982436825: {
                    break block22;
                }
                case 2055807312: {
                    v1 = on.ksmz("ktsn", ksnd(int ), (int)158);
                    continue block22;
                }
            }
            break;
        }
        var2 = on.c;
        v2 /* !! */  = on.te;
        if (true) ** GOTO lbl19
        block23: while (true) {
            v2 /* !! */  = (long)(v3 - on.ksmz("ktso", ksnd(int ), (int)159));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 891748353: {
                    v3 = on.ksmz("ktsp", ksnd(int ), (int)160);
                    continue block23;
                }
                case 1780023266: {
                    v3 = on.ksmz("ktsq", ksnd(int ), (int)161);
                    continue block23;
                }
                case 1982436825: {
                    break block23;
                }
            }
            break;
        }
        var1_1 /* !! */  = on.b;
        v4 /* !! */  = on.te;
        if (true) ** GOTO lbl33
        block24: while (true) {
            v4 /* !! */  = (long)(v5 - on.ksmz("ktsr", ksnd(int ), (int)162));
lbl33:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2063966625: {
                    v5 = on.ksmz("ktss", ksnd(int ), (int)163);
                    continue block24;
                }
                case -163678289: {
                    v5 = on.ksmz("ktst", ksnd(int ), (int)164);
                    continue block24;
                }
                case 45199040: {
                    v5 = on.ksmz("ktsu", ksnd(int ), (int)165);
                    continue block24;
                }
                case 1982436825: {
                    break block24;
                }
            }
            break;
        }
        var0_2 = on.a;
        if (!var2) ** GOTO lbl52
        throw null;
        {
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var1_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl52:
                // 1 sources

                if (var0_2 || var0_2) continue block25;
                return "phobia:shader_hands_trail_vertex";
                case 0: {
                    do {
                        var1_1 /* !! */  = (int)on.ksmz("ktsv", ksmw(int ), (int)657);
                    } while (!var2);
                    throw null;
                }
                case 1: {
                    var1_1 /* !! */  = (int)on.ksmz("ktsw", ksmw(int ), (int)658);
                    if (var2) {
                        throw null;
                    }
                }
                case 2: {
                    do {
                        var1_1 /* !! */  = (int)on.ksmz("ktsx", ksmw(int ), (int)659);
                    } while (!var2);
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var1_1 /* !! */  = (int)on.ksmz("ktsy", ksmw(int ), (int)660);
        } while (!var2);
        throw null;
    }

    public static /* synthetic */ CallSite ksmz(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void ktxj() {
        on.ksnf[200] = -3405079381992785951L;
        on.ksnf[201] = -5163792872776762226L;
        on.ksnf[202] = 8722299893545108466L;
        on.ksnf[203] = 8898689900969461801L;
        on.ksnf[204] = 4329829768524750503L;
        on.ksnf[205] = -8290847277498397712L;
        on.ksnf[206] = -5194984132486167000L;
        on.ksnf[207] = -8568326285516986198L;
        on.ksnf[208] = -5392748511169819911L;
        on.ksnf[209] = -8110036013463439404L;
        on.ksnf[210] = -5979945506251639498L;
        on.ksnf[211] = -4138920172801246080L;
        on.ksnf[212] = 333153409159936544L;
        on.ksnf[213] = 7371668336894230137L;
        on.ksnf[214] = 2293038208396109814L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$ensureResources$7(int var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = on.te - on.ksmz("ktre", ksnd(int ), (int)137)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == on.ksmz("ktrf", ksmw(int ), (int)643)) break;
            v0 /* !! */  = (long)on.ksmz("ktrg", ksmw(int ), (int)644);
        }
        var3_1 = on.c;
        v1 /* !! */  = on.te;
        if (true) ** GOTO lbl12
        block19: while (true) {
            v1 /* !! */  = (long)(v2 - on.ksmz("ktrh", ksnd(int ), (int)138));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2064135971: {
                    v2 = on.ksmz("ktri", ksnd(int ), (int)139);
                    continue block19;
                }
                case -1112452861: {
                    v2 = on.ksmz("ktrj", ksnd(int ), (int)140);
                    continue block19;
                }
                case 1575122407: {
                    v2 = on.ksmz("ktrk", ksnd(int ), (int)141);
                    continue block19;
                }
                case 1982436825: {
                    break block19;
                }
            }
            break;
        }
        var2_2 /* !! */  = on.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = on.te - on.ksmz("ktrl", ksnd(int ), (int)142)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == on.ksmz("ktrm", ksmw(int ), (int)645)) break;
                    v3 /* !! */  = (long)on.ksmz("ktrn", ksmw(int ), (int)646);
                }
                var1_3 = on.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = on.te;
                if (true) ** GOTO lbl44
                block22: while (true) {
                    v4 /* !! */  = (long)(v5 - on.ksmz("ktro", ksnd(int ), (int)143));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -207798499: {
                            v5 = on.ksmz("ktrp", ksnd(int ), (int)144);
                            continue block22;
                        }
                        case 1620314431: {
                            v5 = on.ksmz("ktrq", ksnd(int ), (int)145);
                            continue block22;
                        }
                        case 1982436825: {
                            break block22;
                        }
                        case 2135125947: {
                            v5 = on.ksmz("ktrr", ksnd(int ), (int)146);
                            continue block22;
                        }
                    }
                    break;
                }
                return "phobia:shader_hands_trail_" + var0;
            }
lbl57:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)on.ksmz("ktrs", ksmw(int ), (int)647);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)on.ksmz("ktrt", ksmw(int ), (int)648);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)on.ksmz("ktru", ksmw(int ), (int)649);
                if (!var3_1) ** GOTO lbl57
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)on.ksmz("ktrv", ksmw(int ), (int)650);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void ktwp() {
        on.ksmx[100] = 466103492;
        on.ksmx[101] = -1589624114;
        on.ksmx[102] = 888481920;
        on.ksmx[103] = 946758891;
        on.ksmx[104] = -968859324;
        on.ksmx[105] = 2028772927;
        on.ksmx[106] = 380940587;
        on.ksmx[107] = -1714448759;
        on.ksmx[108] = -100593100;
        on.ksmx[109] = 189330371;
        on.ksmx[110] = 769013228;
        on.ksmx[111] = 623654164;
        on.ksmx[112] = -2064428950;
        on.ksmx[113] = -139061723;
        on.ksmx[114] = 726215119;
        on.ksmx[115] = -753180738;
        on.ksmx[116] = 345254104;
        on.ksmx[117] = -740580755;
        on.ksmx[118] = 892815207;
        on.ksmx[119] = 952360673;
        on.ksmx[120] = 23976104;
        on.ksmx[121] = -511165002;
        on.ksmx[122] = 421437098;
        on.ksmx[123] = -2032629056;
        on.ksmx[124] = 2111112177;
        on.ksmx[125] = -1889983646;
        on.ksmx[126] = 1962664589;
        on.ksmx[127] = 896310837;
        on.ksmx[128] = 347990598;
        on.ksmx[129] = -972637724;
        on.ksmx[130] = -1029532392;
        on.ksmx[131] = 1234630218;
        on.ksmx[132] = -1875249012;
        on.ksmx[133] = 1473977472;
        on.ksmx[134] = 303497975;
        on.ksmx[135] = -101439515;
        on.ksmx[136] = 292429489;
        on.ksmx[137] = -2035101749;
        on.ksmx[138] = -560458026;
        on.ksmx[139] = 797235650;
        on.ksmx[140] = -774456584;
        on.ksmx[141] = 2117538948;
        on.ksmx[142] = -196767031;
        on.ksmx[143] = 711390202;
        on.ksmx[144] = 666248694;
        on.ksmx[145] = -2029742947;
        on.ksmx[146] = -1540281724;
        on.ksmx[147] = 1925017750;
        on.ksmx[148] = -1177088055;
        on.ksmx[149] = 1130908208;
        on.ksmx[150] = 1081046723;
        on.ksmx[151] = 1325654204;
        on.ksmx[152] = -1852029434;
        on.ksmx[153] = 1384641097;
        on.ksmx[154] = -475534590;
        on.ksmx[155] = -1488450710;
        on.ksmx[156] = -236218148;
        on.ksmx[157] = -1838522248;
        on.ksmx[158] = 502341936;
        on.ksmx[159] = -1986716029;
        on.ksmx[160] = -1910905087;
        on.ksmx[161] = -408453891;
        on.ksmx[162] = 632891483;
        on.ksmx[163] = 1149330100;
        on.ksmx[164] = 970629455;
        on.ksmx[165] = -372320377;
        on.ksmx[166] = 1699725028;
        on.ksmx[167] = 713584163;
        on.ksmx[168] = 1117072895;
        on.ksmx[169] = 1091504965;
        on.ksmx[170] = -1767730661;
        on.ksmx[171] = -924238834;
        on.ksmx[172] = -408483299;
        on.ksmx[173] = -2087233301;
        on.ksmx[174] = 1696198130;
        on.ksmx[175] = -2141147056;
        on.ksmx[176] = 1916905332;
        on.ksmx[177] = 1255159347;
        on.ksmx[178] = -1283031894;
        on.ksmx[179] = -1567727003;
        on.ksmx[180] = 452933421;
        on.ksmx[181] = 1360973471;
        on.ksmx[182] = -588726;
        on.ksmx[183] = 895140688;
        on.ksmx[184] = -1690695525;
        on.ksmx[185] = 733122696;
        on.ksmx[186] = -346607194;
        on.ksmx[187] = 1402138046;
        on.ksmx[188] = 518396164;
        on.ksmx[189] = -1877257246;
        on.ksmx[190] = 86437137;
        on.ksmx[191] = 1885320331;
        on.ksmx[192] = 1902443307;
        on.ksmx[193] = -1369850065;
        on.ksmx[194] = -1498690174;
        on.ksmx[195] = -8203345;
        on.ksmx[196] = 549994317;
        on.ksmx[197] = -1794971394;
        on.ksmx[198] = -889942714;
        on.ksmx[199] = -1214367698;
    }

    private static /* synthetic */ void ktwy() {
        on.ksmy[200] = -545852016;
        on.ksmy[201] = -1590994319;
        on.ksmy[202] = 1948299951;
        on.ksmy[203] = -1418275545;
        on.ksmy[204] = 1483668524;
        on.ksmy[205] = -430112628;
        on.ksmy[206] = -1059275539;
        on.ksmy[207] = 1147502381;
        on.ksmy[208] = -1365038237;
        on.ksmy[209] = 924753983;
        on.ksmy[210] = 1764067843;
        on.ksmy[211] = 4043424;
        on.ksmy[212] = -125592846;
        on.ksmy[213] = -339026669;
        on.ksmy[214] = -445919218;
        on.ksmy[215] = 287003084;
        on.ksmy[216] = -1244821302;
        on.ksmy[217] = -824183143;
        on.ksmy[218] = 559599987;
        on.ksmy[219] = 1258663961;
        on.ksmy[220] = -1013668913;
        on.ksmy[221] = 1120974310;
        on.ksmy[222] = -904679612;
        on.ksmy[223] = 1801944737;
        on.ksmy[224] = -112214308;
        on.ksmy[225] = 150093374;
        on.ksmy[226] = 685833703;
        on.ksmy[227] = -834638334;
        on.ksmy[228] = -305188854;
        on.ksmy[229] = 1118418190;
        on.ksmy[230] = 360480761;
        on.ksmy[231] = 1039047028;
        on.ksmy[232] = 1956864050;
        on.ksmy[233] = -1061685985;
        on.ksmy[234] = 138095471;
        on.ksmy[235] = 834342685;
        on.ksmy[236] = 132009647;
        on.ksmy[237] = 1471201545;
        on.ksmy[238] = 1125244158;
        on.ksmy[239] = -1774843485;
        on.ksmy[240] = 1602424168;
        on.ksmy[241] = 1334716645;
        on.ksmy[242] = -1700307524;
        on.ksmy[243] = 103067395;
        on.ksmy[244] = 195197197;
        on.ksmy[245] = -1507322043;
        on.ksmy[246] = -1261527289;
        on.ksmy[247] = 613116065;
        on.ksmy[248] = -1605062241;
        on.ksmy[249] = 2086877544;
        on.ksmy[250] = -770813787;
        on.ksmy[251] = -579000161;
        on.ksmy[252] = 1202919222;
        on.ksmy[253] = -748046678;
        on.ksmy[254] = 176764204;
        on.ksmy[255] = -1794559887;
        on.ksmy[256] = -974205186;
        on.ksmy[257] = -1653380295;
        on.ksmy[258] = -1913857884;
        on.ksmy[259] = 1864772785;
        on.ksmy[260] = -757328766;
        on.ksmy[261] = -339043827;
        on.ksmy[262] = 407014762;
        on.ksmy[263] = -1441613265;
        on.ksmy[264] = 1393220396;
        on.ksmy[265] = -1122678247;
        on.ksmy[266] = -1260858537;
        on.ksmy[267] = -1685018548;
        on.ksmy[268] = 1695122444;
        on.ksmy[269] = 448447166;
        on.ksmy[270] = -1019638496;
        on.ksmy[271] = -236876665;
        on.ksmy[272] = 1576446936;
        on.ksmy[273] = 96459648;
        on.ksmy[274] = 1384359935;
        on.ksmy[275] = -390038696;
        on.ksmy[276] = -279751373;
        on.ksmy[277] = 1374425851;
        on.ksmy[278] = -2084234861;
        on.ksmy[279] = -906102212;
        on.ksmy[280] = -2024344782;
        on.ksmy[281] = 1421123863;
        on.ksmy[282] = 375150596;
        on.ksmy[283] = 1042317073;
        on.ksmy[284] = 0x111B181B;
        on.ksmy[285] = 193591418;
        on.ksmy[286] = 1211543658;
        on.ksmy[287] = 616370339;
        on.ksmy[288] = 319605871;
        on.ksmy[289] = -1778947266;
        on.ksmy[290] = 825433967;
        on.ksmy[291] = 996203654;
        on.ksmy[292] = -1804742102;
        on.ksmy[293] = 181135075;
        on.ksmy[294] = -79196110;
        on.ksmy[295] = 773707301;
        on.ksmy[296] = 2123389000;
        on.ksmy[297] = 2004745095;
        on.ksmy[298] = 981509486;
        on.ksmy[299] = -2091273445;
    }

    private static /* synthetic */ void ktwt() {
        on.ksmx[500] = -1805900715;
        on.ksmx[501] = -1504944867;
        on.ksmx[502] = 669397357;
        on.ksmx[503] = -984287739;
        on.ksmx[504] = -230212687;
        on.ksmx[505] = 1181590995;
        on.ksmx[506] = -1491648292;
        on.ksmx[507] = -583469134;
        on.ksmx[508] = 1502582192;
        on.ksmx[509] = 1947427239;
        on.ksmx[510] = -1946963832;
        on.ksmx[511] = 1135871249;
        on.ksmx[512] = -1251193472;
        on.ksmx[513] = -551906550;
        on.ksmx[514] = -826582616;
        on.ksmx[515] = 2066754216;
        on.ksmx[516] = -201781612;
        on.ksmx[517] = 460653756;
        on.ksmx[518] = 2011627827;
        on.ksmx[519] = -468186334;
        on.ksmx[520] = 1192007435;
        on.ksmx[521] = -1354586997;
        on.ksmx[522] = 285079101;
        on.ksmx[523] = -1208114117;
        on.ksmx[524] = 790665896;
        on.ksmx[525] = 2076541526;
        on.ksmx[526] = 1638918496;
        on.ksmx[527] = 1752410888;
        on.ksmx[528] = 685799433;
        on.ksmx[529] = -623154921;
        on.ksmx[530] = 1667513449;
        on.ksmx[531] = -577248390;
        on.ksmx[532] = 286186304;
        on.ksmx[533] = -1854392120;
        on.ksmx[534] = -387375026;
        on.ksmx[535] = 1256204821;
        on.ksmx[536] = 799964100;
        on.ksmx[537] = 445694045;
        on.ksmx[538] = 1784243804;
        on.ksmx[539] = -1233614217;
        on.ksmx[540] = -896423920;
        on.ksmx[541] = 1618672251;
        on.ksmx[542] = -1680937150;
        on.ksmx[543] = -266353322;
        on.ksmx[544] = 1049764718;
        on.ksmx[545] = -97211067;
        on.ksmx[546] = 2101876627;
        on.ksmx[547] = -1586276907;
        on.ksmx[548] = 1378086851;
        on.ksmx[549] = -1250360037;
        on.ksmx[550] = 286885331;
        on.ksmx[551] = -1684622837;
        on.ksmx[552] = -1630359058;
        on.ksmx[553] = 644792967;
        on.ksmx[554] = 917297652;
        on.ksmx[555] = -1179990824;
        on.ksmx[556] = -1167271462;
        on.ksmx[557] = -1022879608;
        on.ksmx[558] = -13838242;
        on.ksmx[559] = -454758855;
        on.ksmx[560] = 2130419942;
        on.ksmx[561] = -428069818;
        on.ksmx[562] = 299215244;
        on.ksmx[563] = 1084636260;
        on.ksmx[564] = 1553279398;
        on.ksmx[565] = -1449393557;
        on.ksmx[566] = -37966772;
        on.ksmx[567] = -1088126543;
        on.ksmx[568] = 1131236309;
        on.ksmx[569] = -1531424818;
        on.ksmx[570] = -1362150894;
        on.ksmx[571] = -1222146205;
        on.ksmx[572] = 1626302211;
        on.ksmx[573] = -1687534286;
        on.ksmx[574] = 1653752920;
        on.ksmx[575] = 2090183179;
        on.ksmx[576] = -612462353;
        on.ksmx[577] = -1233543820;
        on.ksmx[578] = 0x8A8A888;
        on.ksmx[579] = -1541550550;
        on.ksmx[580] = -44513751;
        on.ksmx[581] = -666881595;
        on.ksmx[582] = -837392651;
        on.ksmx[583] = -709570359;
        on.ksmx[584] = -536454502;
        on.ksmx[585] = -1712155506;
        on.ksmx[586] = -1266155460;
        on.ksmx[587] = 2098219494;
        on.ksmx[588] = -943223095;
        on.ksmx[589] = 682824740;
        on.ksmx[590] = 1555349048;
        on.ksmx[591] = -750922536;
        on.ksmx[592] = 775859018;
        on.ksmx[593] = 1797155892;
        on.ksmx[594] = 1487800735;
        on.ksmx[595] = -1011517587;
        on.ksmx[596] = 1741594849;
        on.ksmx[597] = 2035490065;
        on.ksmx[598] = 1467502323;
        on.ksmx[599] = -396889482;
    }

    private static /* synthetic */ void ktxe() {
        on.ksne[0] = 88458247429666282L;
        on.ksne[1] = 6845591132643615784L;
        on.ksne[2] = 125141653810080260L;
        on.ksne[3] = 6382019806446338092L;
        on.ksne[4] = -6313841493443415204L;
        on.ksne[5] = -7835903139538661762L;
        on.ksne[6] = 5135556800274940588L;
        on.ksne[7] = -2950475525626480674L;
        on.ksne[8] = 890463362422100839L;
        on.ksne[9] = 571719103669145058L;
        on.ksne[10] = -1701519512520086196L;
        on.ksne[11] = -8373440263829132252L;
        on.ksne[12] = -1326028785758125070L;
        on.ksne[13] = 3686927751131339891L;
        on.ksne[14] = 4259037711832285525L;
        on.ksne[15] = 4641482603567207039L;
        on.ksne[16] = 3239248236069682280L;
        on.ksne[17] = -7683960767245024394L;
        on.ksne[18] = 1194992385081546062L;
        on.ksne[19] = -4504941235900450845L;
        on.ksne[20] = 1272206117223006895L;
        on.ksne[21] = 6574357345910322459L;
        on.ksne[22] = 8757781641996908132L;
        on.ksne[23] = 5328499882027572838L;
        on.ksne[24] = 8852742460632654020L;
        on.ksne[25] = -4471861092095607421L;
        on.ksne[26] = 9155748359325771319L;
        on.ksne[27] = 5247491279789276227L;
        on.ksne[28] = -8823560987942060042L;
        on.ksne[29] = 6211296930090937297L;
        on.ksne[30] = -8397616201900398655L;
        on.ksne[31] = -1571662677192365798L;
        on.ksne[32] = 1588588135068199992L;
        on.ksne[33] = 9161319173255274418L;
        on.ksne[34] = 3350247980450258481L;
        on.ksne[35] = -163616877678899716L;
        on.ksne[36] = 8152451359426273615L;
        on.ksne[37] = 4196139812475271957L;
        on.ksne[38] = 2617341221218149907L;
        on.ksne[39] = -8502650259876132257L;
        on.ksne[40] = -3346063589888019773L;
        on.ksne[41] = -8271792555874392247L;
        on.ksne[42] = 6528472284258833875L;
        on.ksne[43] = -2020516465698462830L;
        on.ksne[44] = -6453045794557704550L;
        on.ksne[45] = -1221023835519869518L;
        on.ksne[46] = 9158793040355738933L;
        on.ksne[47] = -328941871624397893L;
        on.ksne[48] = 7299664612740112725L;
        on.ksne[49] = 8949685443791577207L;
        on.ksne[50] = 6733236249886499323L;
        on.ksne[51] = 2957549686592471L;
        on.ksne[52] = 4886402428995581515L;
        on.ksne[53] = 881575660676899614L;
        on.ksne[54] = -2268723423481796837L;
        on.ksne[55] = 8854458350209833364L;
        on.ksne[56] = 1218567029916680201L;
        on.ksne[57] = 6110461438236034748L;
        on.ksne[58] = 6665239096070325913L;
        on.ksne[59] = -8680572139747857929L;
        on.ksne[60] = -3076644731026677138L;
        on.ksne[61] = -1490417142599096981L;
        on.ksne[62] = 3378108772146831824L;
        on.ksne[63] = -4490321921891506015L;
        on.ksne[64] = -5895439678736966452L;
        on.ksne[65] = -5305933371180929219L;
        on.ksne[66] = -1084179729331937973L;
        on.ksne[67] = -4204178444264424817L;
        on.ksne[68] = -3791045630758312919L;
        on.ksne[69] = 8412073730994757776L;
        on.ksne[70] = 2011592354382171716L;
        on.ksne[71] = 2579927378355694330L;
        on.ksne[72] = -9124756127366584266L;
        on.ksne[73] = 5540235068586801841L;
        on.ksne[74] = -7046677511020444823L;
        on.ksne[75] = 8931972158398986408L;
        on.ksne[76] = 7244337194396439305L;
        on.ksne[77] = -2367501450820168572L;
        on.ksne[78] = -4152542419284115371L;
        on.ksne[79] = 1295287831403623275L;
        on.ksne[80] = -8703590121164324325L;
        on.ksne[81] = -2208203068974995755L;
        on.ksne[82] = -5737090120003470520L;
        on.ksne[83] = -401467678169686538L;
        on.ksne[84] = 5793320208483603104L;
        on.ksne[85] = -2380973030290976207L;
        on.ksne[86] = 4904546685308898132L;
        on.ksne[87] = -1267652508683194879L;
        on.ksne[88] = 2320272093713854773L;
        on.ksne[89] = 6488642396335857834L;
        on.ksne[90] = 3539957284381079778L;
        on.ksne[91] = 5876343805982185544L;
        on.ksne[92] = -7014561588830967030L;
        on.ksne[93] = -2532771812366228630L;
        on.ksne[94] = -4349760606125639098L;
        on.ksne[95] = -4659008759646084325L;
        on.ksne[96] = 8549302873737611751L;
        on.ksne[97] = 7578824948840034538L;
        on.ksne[98] = -738364368897212034L;
        on.ksne[99] = 8958385350986122715L;
    }

    private static /* synthetic */ void ktxh() {
        on.ksnf[0] = 88458247429666282L;
        on.ksnf[1] = 6845591132532889256L;
        on.ksnf[2] = 125141653810080260L;
        on.ksnf[3] = 6382019806446338092L;
        on.ksnf[4] = -6313841493443415204L;
        on.ksnf[5] = -7835903213766646146L;
        on.ksnf[6] = -4087815236579835220L;
        on.ksnf[7] = 6272896511228295134L;
        on.ksnf[8] = 890463362422100791L;
        on.ksnf[9] = 571719103669145058L;
        on.ksnf[10] = 7521852524334689612L;
        on.ksnf[11] = 4998402486357096027L;
        on.ksnf[12] = 8288466534491747956L;
        on.ksnf[13] = 3376998409636736634L;
        on.ksnf[14] = 7397696846059367297L;
        on.ksnf[15] = -1433078878884891442L;
        on.ksnf[16] = -6441547946648758743L;
        on.ksnf[17] = 1700481617579457180L;
        on.ksnf[18] = 1292556603440313670L;
        on.ksnf[19] = -331443219180867303L;
        on.ksnf[20] = -1071557526215048980L;
        on.ksnf[21] = 4487312999703158024L;
        on.ksnf[22] = -4413944297211799400L;
        on.ksnf[23] = -7455518176201793123L;
        on.ksnf[24] = -7192140434659636214L;
        on.ksnf[25] = 2324653973542039292L;
        on.ksnf[26] = -9015559780582864953L;
        on.ksnf[27] = 2277530264014433527L;
        on.ksnf[28] = 8586095934822725834L;
        on.ksnf[29] = 8661646476502307603L;
        on.ksnf[30] = 7229220412923365025L;
        on.ksnf[31] = -1953815275085875776L;
        on.ksnf[32] = -2589811143180378808L;
        on.ksnf[33] = 7034850563488999395L;
        on.ksnf[34] = -6460872802953015458L;
        on.ksnf[35] = 8915600193084850245L;
        on.ksnf[36] = -7716944600587979736L;
        on.ksnf[37] = -755309882430156499L;
        on.ksnf[38] = 5283844766153908699L;
        on.ksnf[39] = 8221593655021471770L;
        on.ksnf[40] = -3565750539822342953L;
        on.ksnf[41] = 3243049788656496317L;
        on.ksnf[42] = 6229309018120333817L;
        on.ksnf[43] = 4989015901190284138L;
        on.ksnf[44] = 2427658490575617628L;
        on.ksnf[45] = -788250891033429865L;
        on.ksnf[46] = 4015219500315195661L;
        on.ksnf[47] = -1407434938755686428L;
        on.ksnf[48] = 441140875839287172L;
        on.ksnf[49] = 1336654230017715118L;
        on.ksnf[50] = 4848113951748445206L;
        on.ksnf[51] = 3812935099138040442L;
        on.ksnf[52] = 6334822345151617061L;
        on.ksnf[53] = -9034217958269526600L;
        on.ksnf[54] = 4237001421623619095L;
        on.ksnf[55] = 4868664992749308211L;
        on.ksnf[56] = 1508634163369012714L;
        on.ksnf[57] = -881505131861299206L;
        on.ksnf[58] = -5211413993009530777L;
        on.ksnf[59] = 3243643187940816667L;
        on.ksnf[60] = -5737958557131521747L;
        on.ksnf[61] = 6774701975606485090L;
        on.ksnf[62] = -5970987501796749465L;
        on.ksnf[63] = 7342794155383501295L;
        on.ksnf[64] = -6214436804374290174L;
        on.ksnf[65] = -2891512447929412902L;
        on.ksnf[66] = 5610258325345752388L;
        on.ksnf[67] = -3576969497577888438L;
        on.ksnf[68] = -1127772936320177496L;
        on.ksnf[69] = 1035977434287071036L;
        on.ksnf[70] = 2076965842040624586L;
        on.ksnf[71] = -8252863691918178704L;
        on.ksnf[72] = 4418011208735835039L;
        on.ksnf[73] = -1308725036665703112L;
        on.ksnf[74] = -5221350464658260700L;
        on.ksnf[75] = 2515575286325484058L;
        on.ksnf[76] = -7801036068349850352L;
        on.ksnf[77] = 6298794390028768263L;
        on.ksnf[78] = 3556038692334041365L;
        on.ksnf[79] = -4173191514787763588L;
        on.ksnf[80] = -3755742401726820009L;
        on.ksnf[81] = 6082309682469341199L;
        on.ksnf[82] = 4841221212541512511L;
        on.ksnf[83] = 7102703613875159969L;
        on.ksnf[84] = 665119574011055990L;
        on.ksnf[85] = 981487084872505106L;
        on.ksnf[86] = 645523107322486400L;
        on.ksnf[87] = -7707659379690596756L;
        on.ksnf[88] = -7575527034725414536L;
        on.ksnf[89] = 760870099009417035L;
        on.ksnf[90] = -892856638517576574L;
        on.ksnf[91] = -359788038570583165L;
        on.ksnf[92] = -4349309461048772165L;
        on.ksnf[93] = -717824075828127045L;
        on.ksnf[94] = -630509761755397677L;
        on.ksnf[95] = -3722443816727699734L;
        on.ksnf[96] = -6738115131670043587L;
        on.ksnf[97] = -2998636549827523958L;
        on.ksnf[98] = 4677712469705603796L;
        on.ksnf[99] = -805722518855805197L;
    }

    private static /* synthetic */ void ktxc() {
        on.ksmy[600] = 1606964395;
        on.ksmy[601] = -353582257;
        on.ksmy[602] = -1777452835;
        on.ksmy[603] = -966495602;
        on.ksmy[604] = -1937835979;
        on.ksmy[605] = 741211826;
        on.ksmy[606] = -1665711648;
        on.ksmy[607] = 1194611641;
        on.ksmy[608] = -1963059661;
        on.ksmy[609] = 1277738827;
        on.ksmy[610] = -425270630;
        on.ksmy[611] = -1186796479;
        on.ksmy[612] = 1084371943;
        on.ksmy[613] = 1650330477;
        on.ksmy[614] = -1519787932;
        on.ksmy[615] = 334664449;
        on.ksmy[616] = -1988154017;
        on.ksmy[617] = -263482615;
        on.ksmy[618] = 637239304;
        on.ksmy[619] = -773892909;
        on.ksmy[620] = 1536012246;
        on.ksmy[621] = 1139713087;
        on.ksmy[622] = 984916172;
        on.ksmy[623] = 1034095941;
        on.ksmy[624] = -2108983718;
        on.ksmy[625] = 1890145592;
        on.ksmy[626] = 2145584047;
        on.ksmy[627] = 989189773;
        on.ksmy[628] = 856698031;
        on.ksmy[629] = -1653606606;
        on.ksmy[630] = -386448654;
        on.ksmy[631] = 1431372985;
        on.ksmy[632] = 1645419635;
        on.ksmy[633] = 653403868;
        on.ksmy[634] = 370949593;
        on.ksmy[635] = -1930813398;
        on.ksmy[636] = 20711554;
        on.ksmy[637] = 678374404;
        on.ksmy[638] = -2509202;
        on.ksmy[639] = 1413968565;
        on.ksmy[640] = 263834646;
        on.ksmy[641] = -1160919531;
        on.ksmy[642] = 1725584216;
        on.ksmy[643] = 1787827903;
        on.ksmy[644] = -152165646;
        on.ksmy[645] = -81653665;
        on.ksmy[646] = 1220003646;
        on.ksmy[647] = 754540520;
        on.ksmy[648] = -427851086;
        on.ksmy[649] = 1492875254;
        on.ksmy[650] = -1612262599;
        on.ksmy[651] = -947714458;
        on.ksmy[652] = -108828793;
        on.ksmy[653] = -1974431965;
        on.ksmy[654] = 957719835;
        on.ksmy[655] = -1219732017;
        on.ksmy[656] = 1245248354;
        on.ksmy[657] = -1413950027;
        on.ksmy[658] = -1025588309;
        on.ksmy[659] = 556081766;
        on.ksmy[660] = -1259567988;
        on.ksmy[661] = 1994867548;
        on.ksmy[662] = -753505358;
        on.ksmy[663] = -753121122;
        on.ksmy[664] = 1148581244;
        on.ksmy[665] = -834006542;
        on.ksmy[666] = -339760045;
        on.ksmy[667] = -994029252;
        on.ksmy[668] = 567029818;
        on.ksmy[669] = -1219775881;
        on.ksmy[670] = -1645949868;
        on.ksmy[671] = -705624978;
        on.ksmy[672] = 133678966;
        on.ksmy[673] = -2008663455;
        on.ksmy[674] = -464222291;
        on.ksmy[675] = -2088726440;
        on.ksmy[676] = 1637289708;
        on.ksmy[677] = -278187874;
        on.ksmy[678] = -273959768;
        on.ksmy[679] = 760546023;
        on.ksmy[680] = 315899788;
        on.ksmy[681] = -942362293;
        on.ksmy[682] = 76169858;
        on.ksmy[683] = -1532712046;
        on.ksmy[684] = 283234024;
        on.ksmy[685] = 1714811253;
        on.ksmy[686] = -419955826;
        on.ksmy[687] = 1738583068;
        on.ksmy[688] = 729056727;
        on.ksmy[689] = -722350615;
        on.ksmy[690] = -310922325;
        on.ksmy[691] = -443553170;
        on.ksmy[692] = 996089193;
        on.ksmy[693] = 151795496;
        on.ksmy[694] = -98444351;
        on.ksmy[695] = 334183443;
        on.ksmy[696] = 1811995915;
        on.ksmy[697] = -653343832;
        on.ksmy[698] = -1407208945;
        on.ksmy[699] = 1343573038;
    }

    private static /* synthetic */ void ktxg() {
        on.ksne[200] = -3511601037077395001L;
        on.ksne[201] = -4273287446041096815L;
        on.ksne[202] = 6223375351956519554L;
        on.ksne[203] = 5791382287318321536L;
        on.ksne[204] = 2224410525457825320L;
        on.ksne[205] = 3386812646216187249L;
        on.ksne[206] = 4413016136929334717L;
        on.ksne[207] = 315279743024247679L;
        on.ksne[208] = -4890836189351375167L;
        on.ksne[209] = 2344947617713969609L;
        on.ksne[210] = 6683063247514793657L;
        on.ksne[211] = 7395793062444573807L;
        on.ksne[212] = -1992161876958866471L;
        on.ksne[213] = 1471119411608603015L;
        on.ksne[214] = -6930333828458665994L;
    }

    /*
     * Exception decompiling
     */
    private static void compositeBehindHand(class_310 var0) {
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
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void writeUniforms(float var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, float var8_8, int var9_9, int var10_10, boolean var11_11, boolean var12_12) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = on.te - on.ksmz("ktgd", ksnd(int ), (int)24)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == on.ksmz("ktge", ksmw(int ), (int)469)) break;
            v0 /* !! */  = (long)on.ksmz("ktgf", ksmw(int ), (int)470);
        }
        var15_13 = on.c;
        v1 /* !! */  = on.te;
        if (true) ** GOTO lbl11
        block78: while (true) {
            v1 /* !! */  = (long)(on.ksmz("ktgh", ksnd(int ), (int)26) - on.ksmz("ktgg", ksnd(int ), (int)25));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 903484471: {
                    continue block78;
                }
                case 1982436825: {
                    break block78;
                }
            }
            break;
        }
        var14_14 /* !! */  = on.b;
        v2 /* !! */  = on.te;
        if (true) ** GOTO lbl21
        block79: while (true) {
            v2 /* !! */  = (long)(v3 - on.ksmz("ktgi", ksnd(int ), (int)27));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 963627952: {
                    v3 = on.ksmz("ktgj", ksnd(int ), (int)28);
                    continue block79;
                }
                case 1982436825: {
                    break block79;
                }
                case 2141573121: {
                    v3 = on.ksmz("ktgk", ksnd(int ), (int)29);
                    continue block79;
                }
            }
            break;
        }
        var13_15 = on.a;
        if (!var15_13) ** GOTO lbl37
        throw null;
lbl-1000:
        // 8 sources

        {
            if (var14_14 /* !! */  == 0) ** GOTO lbl-1000
            switch (var14_14 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl37:
                // 1 sources

                if (var13_15 || var13_15) ** GOTO lbl-1000
                v4 /* !! */  = on.te;
                if (true) ** GOTO lbl42
                block81: while (true) {
                    v4 /* !! */  = (long)(v5 - on.ksmz("ktgl", ksnd(int ), (int)30));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2129723966: {
                            v5 = on.ksmz("ktgm", ksnd(int ), (int)31);
                            continue block81;
                        }
                        case 490051120: {
                            v5 = on.ksmz("ktgn", ksnd(int ), (int)32);
                            continue block81;
                        }
                        case 1850454930: {
                            v5 = on.ksmz("ktgo", ksnd(int ), (int)33);
                            continue block81;
                        }
                        case 1982436825: {
                            break block81;
                        }
                    }
                    break;
                }
                v6 /* !! */  = on.te;
                if (true) ** GOTO lbl58
                block82: while (true) {
                    v6 /* !! */  = (long)(on.ksmz("ktgq", ksnd(int ), (int)35) - on.ksmz("ktgp", ksnd(int ), (int)34));
lbl58:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 547683499: {
                            continue block82;
                        }
                        case 1982436825: {
                            break block82;
                        }
                    }
                    break;
                }
                on.uniformData.clear();
                if (var13_15 || var13_15) ** GOTO lbl-1000
                v7 /* !! */  = on.te;
                if (true) ** GOTO lbl70
                block83: while (true) {
                    v7 /* !! */  = (long)(on.ksmz("ktgs", ksnd(int ), (int)37) - on.ksmz("ktgr", ksnd(int ), (int)36));
lbl70:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -308796934: {
                            continue block83;
                        }
                        case 1982436825: {
                            break block83;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_1 = on.te - on.ksmz("ktgt", ksnd(int ), (int)38)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == on.ksmz("ktgu", ksmw(int ), (int)471)) break;
                    v8 /* !! */  = (long)on.ksmz("ktgv", ksmw(int ), (int)472);
                }
                v9 = on.uniformData.putFloat(var0);
                v10 /* !! */  = on.te;
                if (true) ** GOTO lbl85
                block85: while (true) {
                    v10 /* !! */  = (long)(v11 - on.ksmz("ktgw", ksnd(int ), (int)39));
lbl85:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -820442955: {
                            v11 = on.ksmz("ktgx", ksnd(int ), (int)40);
                            continue block85;
                        }
                        case -480327607: {
                            v11 = on.ksmz("ktgy", ksnd(int ), (int)41);
                            continue block85;
                        }
                        case 1982436825: {
                            break block85;
                        }
                    }
                    break;
                }
                v12 = v9.putFloat(var1_1);
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_2 = on.te - on.ksmz("ktgz", ksnd(int ), (int)42)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == on.ksmz("ktha", ksmw(int ), (int)473)) break;
                    v13 /* !! */  = (long)on.ksmz("kthb", ksmw(int ), (int)474);
                }
                v14 = v12.putFloat(var2_2);
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_3 = on.te - on.ksmz("kthc", ksnd(int ), (int)43)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == on.ksmz("kthd", ksmw(int ), (int)475)) break;
                    v15 /* !! */  = (long)on.ksmz("kthe", ksmw(int ), (int)476);
                }
                v14.putFloat(var3_3);
                if (var13_15 || var13_15) ** GOTO lbl-1000
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_4 = on.te - on.ksmz("kthf", ksnd(int ), (int)44)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == on.ksmz("kthg", ksmw(int ), (int)477)) break;
                    v16 /* !! */  = (long)on.ksmz("kthh", ksmw(int ), (int)478);
                }
                v17 /* !! */  = on.te;
                if (true) ** GOTO lbl117
                block89: while (true) {
                    v17 /* !! */  = (long)(v18 - on.ksmz("kthi", ksnd(int ), (int)45));
lbl117:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case 720670609: {
                            v18 = on.ksmz("kthj", ksnd(int ), (int)46);
                            continue block89;
                        }
                        case 940910247: {
                            v18 = on.ksmz("kthk", ksnd(int ), (int)47);
                            continue block89;
                        }
                        case 1982436825: {
                            break block89;
                        }
                    }
                    break;
                }
                v19 = on.uniformData.putFloat(var4_4);
                v20 /* !! */  = on.te;
                if (true) ** GOTO lbl131
                block90: while (true) {
                    v20 /* !! */  = (long)(on.ksmz("kthm", ksnd(int ), (int)49) - on.ksmz("kthl", ksnd(int ), (int)48));
lbl131:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case 1204044564: {
                            continue block90;
                        }
                        case 1982436825: {
                            break block90;
                        }
                    }
                    break;
                }
                v21 = v19.putFloat(var5_5);
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_5 = on.te - on.ksmz("kthn", ksnd(int ), (int)50)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == on.ksmz("ktho", ksmw(int ), (int)479)) break;
                    v22 /* !! */  = (long)on.ksmz("kthp", ksmw(int ), (int)480);
                }
                v23 = v21.putFloat(var6_6);
                v24 /* !! */  = on.te;
                if (true) ** GOTO lbl147
                block92: while (true) {
                    v24 /* !! */  = (long)(on.ksmz("kthr", ksnd(int ), (int)52) - on.ksmz("kthq", ksnd(int ), (int)51));
lbl147:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case -576511217: {
                            continue block92;
                        }
                        case 1982436825: {
                            break block92;
                        }
                    }
                    break;
                }
                v23.putFloat(0.0f);
                if (var13_15 || var13_15) ** GOTO lbl-1000
                v25 /* !! */  = on.te;
                if (true) ** GOTO lbl159
                block93: while (true) {
                    v25 /* !! */  = (long)(on.ksmz("ktht", ksnd(int ), (int)54) - on.ksmz("kths", ksnd(int ), (int)53));
lbl159:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case 1224311028: {
                            continue block93;
                        }
                        case 1982436825: {
                            break block93;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_6 = on.te - on.ksmz("kthu", ksnd(int ), (int)55)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v26 /* !! */  == on.ksmz("kthv", ksmw(int ), (int)481)) break;
                    v26 /* !! */  = (long)on.ksmz("kthw", ksmw(int ), (int)482);
                }
                v27 = on.uniformData.putFloat(var7_7);
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_7 = on.te - on.ksmz("kthx", ksnd(int ), (int)56)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v28 /* !! */  == on.ksmz("kthy", ksmw(int ), (int)483)) break;
                    v28 /* !! */  = (long)on.ksmz("kthz", ksmw(int ), (int)484);
                }
                v29 = v27.putFloat(var8_8);
                if (var12_12) {
                    v30 = 1.0f;
                    if (var15_13) {
                        throw null;
                    }
                } else {
                    v30 = 0.0f;
                }
                while (true) {
                    if ((v31 /* !! */  = (cfr_temp_8 = on.te - on.ksmz("ktia", ksnd(int ), (int)57)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v31 /* !! */  == on.ksmz("ktib", ksmw(int ), (int)485)) break;
                    v31 /* !! */  = (long)on.ksmz("ktic", ksmw(int ), (int)486);
                }
                v32 = v29.putFloat(v30);
                while (true) {
                    if ((v33 /* !! */  = (cfr_temp_9 = on.te - on.ksmz("ktid", ksnd(int ), (int)58)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v33 /* !! */  == on.ksmz("ktie", ksmw(int ), (int)487)) break;
                    v33 /* !! */  = (long)on.ksmz("ktif", ksmw(int ), (int)488);
                }
                v32.putFloat(0.0f);
                if (var13_15 || var13_15) ** GOTO lbl-1000
                while (true) {
                    if ((v34 /* !! */  = (cfr_temp_10 = on.te - on.ksmz("ktig", ksnd(int ), (int)59)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v34 /* !! */  == on.ksmz("ktih", ksmw(int ), (int)489)) break;
                    v34 /* !! */  = (long)on.ksmz("ktii", ksmw(int ), (int)490);
                }
                on.putColor(var9_9);
                if (var13_15 || var13_15) ** GOTO lbl-1000
                if (var11_11) {
                    v35 = 0.0f;
                    if (var15_13) {
                        throw null;
                    }
                } else {
                    v35 = 1.0f;
                }
                v36 /* !! */  = on.te;
                if (true) ** GOTO lbl212
                block99: while (true) {
                    v36 /* !! */  = (long)(on.ksmz("ktik", ksnd(int ), (int)61) - on.ksmz("ktij", ksnd(int ), (int)60));
lbl212:
                    // 2 sources

                    switch ((int)v36 /* !! */ ) {
                        case 1982436825: {
                            break block99;
                        }
                        case 2008078294: {
                            continue block99;
                        }
                    }
                    break;
                }
                on.putColor(var10_10, v35);
                if (var13_15 || var13_15) ** GOTO lbl-1000
                v37 /* !! */  = on.te;
                if (true) ** GOTO lbl223
                block100: while (true) {
                    v37 /* !! */  = (long)(on.ksmz("ktim", ksnd(int ), (int)63) - on.ksmz("ktil", ksnd(int ), (int)62));
lbl223:
                    // 2 sources

                    switch ((int)v37 /* !! */ ) {
                        case 824908587: {
                            continue block100;
                        }
                        case 1982436825: {
                            break block100;
                        }
                    }
                    break;
                }
                v38 /* !! */  = on.te;
                if (true) ** GOTO lbl232
                block101: while (true) {
                    v38 /* !! */  = (long)(on.ksmz("ktio", ksnd(int ), (int)65) - on.ksmz("ktin", ksnd(int ), (int)64));
lbl232:
                    // 2 sources

                    switch ((int)v38 /* !! */ ) {
                        case -622041610: {
                            continue block101;
                        }
                        case 1982436825: {
                            break block101;
                        }
                    }
                    break;
                }
                on.uniformData.flip();
                if (var13_15 || var13_15) continue block80;
                return;
lbl241:
                // 2 sources

                case 0: {
                    var14_14 /* !! */  = (int)on.ksmz("ktip", ksmw(int ), (int)491);
                    if (var15_13) {
                        throw null;
                    }
                    ** GOTO lbl286
                }
                case 1: {
                    var14_14 /* !! */  = (int)on.ksmz("ktiq", ksmw(int ), (int)492);
                    if (var15_13) {
                        throw null;
                    }
                    ** GOTO lbl271
                }
lbl251:
                // 2 sources

                case 2: {
                    var14_14 /* !! */  = (int)on.ksmz("ktir", ksmw(int ), (int)493);
                    if (var15_13) {
                        throw null;
                    }
                    ** GOTO lbl316
                }
lbl256:
                // 2 sources

                case 3: {
                    var14_14 /* !! */  = (int)on.ksmz("ktis", ksmw(int ), (int)494);
                    if (var15_13) {
                        throw null;
                    }
                    ** GOTO lbl303
                }
lbl261:
                // 2 sources

                case 4: {
                    var14_14 /* !! */  = (int)on.ksmz("ktit", ksmw(int ), (int)495);
                    if (var15_13) {
                        throw null;
                    }
                    ** GOTO lbl276
                }
                case 5: {
                    var14_14 /* !! */  = (int)on.ksmz("ktiu", ksmw(int ), (int)496);
                    if (var15_13) {
                        throw null;
                    }
                    ** GOTO lbl290
                }
lbl271:
                // 3 sources

                case 6: {
                    var14_14 /* !! */  = (int)on.ksmz("ktiv", ksmw(int ), (int)497);
                    if (var15_13) {
                        throw null;
                    }
                    ** GOTO lbl294
                }
lbl276:
                // 2 sources

                case 7: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var14_14 /* !! */  = (int)on.ksmz("ktiw", ksmw(int ), (int)498);
                        if (var15_13) {
                            throw null;
                        }
                        ** GOTO lbl290
                        break;
                    }
                }
lbl282:
                // 3 sources

                case 8: {
                    var14_14 /* !! */  = (int)on.ksmz("ktix", ksmw(int ), (int)499);
                    if (!var15_13) ** GOTO lbl271
                    throw null;
                }
lbl286:
                // 2 sources

                case 9: {
                    var14_14 /* !! */  = (int)on.ksmz("ktiy", ksmw(int ), (int)500);
                    if (!var15_13) ** GOTO lbl282
                    throw null;
                }
lbl290:
                // 3 sources

                case 10: {
                    var14_14 /* !! */  = (int)on.ksmz("ktiz", ksmw(int ), (int)501);
                    if (!var15_13) ** GOTO lbl261
                    throw null;
                }
lbl294:
                // 2 sources

                case 11: {
                    var14_14 /* !! */  = (int)on.ksmz("ktja", ksmw(int ), (int)502);
                    if (!var15_13) ** GOTO lbl282
                    throw null;
                }
                case 12: {
                    var14_14 /* !! */  = (int)on.ksmz("ktjb", ksmw(int ), (int)503);
                    if (var15_13) {
                        throw null;
                    }
                    ** GOTO lbl312
                }
lbl303:
                // 2 sources

                case 13: {
                    var14_14 /* !! */  = (int)on.ksmz("ktjc", ksmw(int ), (int)504);
                    if (!var15_13) ** GOTO lbl251
                    throw null;
                }
                case 14: {
                    var14_14 /* !! */  = (int)on.ksmz("ktjd", ksmw(int ), (int)505);
                    if (var15_13) {
                        throw null;
                    }
                    ** GOTO lbl316
                }
lbl312:
                // 2 sources

                case 15: {
                    var14_14 /* !! */  = (int)on.ksmz("ktje", ksmw(int ), (int)506);
                    if (!var15_13) ** GOTO lbl241
                    throw null;
                }
lbl316:
                // 3 sources

                case 16: {
                    var14_14 /* !! */  = (int)on.ksmz("ktjf", ksmw(int ), (int)507);
                    if (!var15_13) ** GOTO lbl256
                    throw null;
                }
                case 17: 
            }
        }
        var14_14 /* !! */  = (int)on.ksmz("ktjg", ksmw(int ), (int)508);
        ** while (!var15_13)
lbl323:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private on() {
        var2_1 /* !! */  = on.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)on.ksmz("ksna", ksmw(int ), (int)0);
                break;
            }
            case 1: {
                var2_1 /* !! */  = (int)on.ksmz("ksnb", ksmw(int ), (int)1);
            }
            case 2: 
        }
        while (true) {
            var2_1 /* !! */  = (int)on.ksmz("ksnc", ksmw(int ), (int)2);
        }
    }

    private static /* synthetic */ void ktxb() {
        on.ksmy[500] = -1805900712;
        on.ksmy[501] = -1504944879;
        on.ksmy[502] = 669397357;
        on.ksmy[503] = -984287744;
        on.ksmy[504] = -230212686;
        on.ksmy[505] = 1181591004;
        on.ksmy[506] = -1491648308;
        on.ksmy[507] = -583469135;
        on.ksmy[508] = 1502582197;
        on.ksmy[509] = 1947427238;
        on.ksmy[510] = 306567273;
        on.ksmy[511] = 1135871248;
        on.ksmy[512] = -1432844063;
        on.ksmy[513] = -551906549;
        on.ksmy[514] = 655041049;
        on.ksmy[515] = 2066754220;
        on.ksmy[516] = -201781615;
        on.ksmy[517] = 460653758;
        on.ksmy[518] = 2011627826;
        on.ksmy[519] = -468186329;
        on.ksmy[520] = 1192007432;
        on.ksmy[521] = -1354586998;
        on.ksmy[522] = 1976959081;
        on.ksmy[523] = -1208114118;
        on.ksmy[524] = -1607437276;
        on.ksmy[525] = 2076541510;
        on.ksmy[526] = 1638918559;
        on.ksmy[527] = 722250504;
        on.ksmy[528] = 685799432;
        on.ksmy[529] = 1783778516;
        on.ksmy[530] = 1667513441;
        on.ksmy[531] = -577248379;
        on.ksmy[532] = 1383193408;
        on.ksmy[533] = -1854392265;
        on.ksmy[534] = -1416224690;
        on.ksmy[535] = 1256204820;
        on.ksmy[536] = -589239103;
        on.ksmy[537] = 445694044;
        on.ksmy[538] = -1948030278;
        on.ksmy[539] = -1233614224;
        on.ksmy[540] = -896423919;
        on.ksmy[541] = 1618672243;
        on.ksmy[542] = -1680937144;
        on.ksmy[543] = -266353324;
        on.ksmy[544] = 1049764709;
        on.ksmy[545] = -97211059;
        on.ksmy[546] = 2101876625;
        on.ksmy[547] = -1586276897;
        on.ksmy[548] = 1378086851;
        on.ksmy[549] = -1250360047;
        on.ksmy[550] = 286885328;
        on.ksmy[551] = -1684622838;
        on.ksmy[552] = -141397615;
        on.ksmy[553] = 644792967;
        on.ksmy[554] = 917297653;
        on.ksmy[555] = -1659241155;
        on.ksmy[556] = -1167271461;
        on.ksmy[557] = -1334169585;
        on.ksmy[558] = -13838241;
        on.ksmy[559] = -891773391;
        on.ksmy[560] = 2130419943;
        on.ksmy[561] = 1644290103;
        on.ksmy[562] = 299215245;
        on.ksmy[563] = -371677096;
        on.ksmy[564] = 592783782;
        on.ksmy[565] = -1449393558;
        on.ksmy[566] = 1336737421;
        on.ksmy[567] = -1088126543;
        on.ksmy[568] = -1131236310;
        on.ksmy[569] = 1103810698;
        on.ksmy[570] = -1362150893;
        on.ksmy[571] = 2140938914;
        on.ksmy[572] = 1626302225;
        on.ksmy[573] = -1687534297;
        on.ksmy[574] = 1653752912;
        on.ksmy[575] = 2090183197;
        on.ksmy[576] = -612462356;
        on.ksmy[577] = -1233543819;
        on.ksmy[578] = 0x8A8A882;
        on.ksmy[579] = -1541550559;
        on.ksmy[580] = -44513739;
        on.ksmy[581] = -666881578;
        on.ksmy[582] = -837392658;
        on.ksmy[583] = -709570338;
        on.ksmy[584] = -536454504;
        on.ksmy[585] = -1712155518;
        on.ksmy[586] = -1266155474;
        on.ksmy[587] = 2098219492;
        on.ksmy[588] = -943223090;
        on.ksmy[589] = 682824766;
        on.ksmy[590] = 1555349044;
        on.ksmy[591] = -750922536;
        on.ksmy[592] = 775859011;
        on.ksmy[593] = 1797155897;
        on.ksmy[594] = 1487800718;
        on.ksmy[595] = -1011517596;
        on.ksmy[596] = 1741594873;
        on.ksmy[597] = 2035490072;
        on.ksmy[598] = 1467502315;
        on.ksmy[599] = -396889489;
    }

    private static /* synthetic */ long ksnd(int n2) {
        return ksne[n2] ^ ksnf[n2];
    }

    private static /* synthetic */ void ktwo() {
        on.ksmx[0] = -1980401834;
        on.ksmx[1] = 899639677;
        on.ksmx[2] = 1477487711;
        on.ksmx[3] = 1673598539;
        on.ksmx[4] = -949254615;
        on.ksmx[5] = -1677687085;
        on.ksmx[6] = -797257071;
        on.ksmx[7] = -775403401;
        on.ksmx[8] = 1268087004;
        on.ksmx[9] = 1168342852;
        on.ksmx[10] = 95216045;
        on.ksmx[11] = 342591848;
        on.ksmx[12] = -1589973426;
        on.ksmx[13] = 1821164156;
        on.ksmx[14] = -858293613;
        on.ksmx[15] = -1406181708;
        on.ksmx[16] = 1143005518;
        on.ksmx[17] = 283451873;
        on.ksmx[18] = -766276990;
        on.ksmx[19] = 1801820765;
        on.ksmx[20] = 1650311459;
        on.ksmx[21] = -2059752819;
        on.ksmx[22] = 1326006331;
        on.ksmx[23] = 1726990005;
        on.ksmx[24] = 1639231588;
        on.ksmx[25] = -742284060;
        on.ksmx[26] = 1556652821;
        on.ksmx[27] = 2070220917;
        on.ksmx[28] = 458759566;
        on.ksmx[29] = 897145559;
        on.ksmx[30] = -1130265750;
        on.ksmx[31] = -965908366;
        on.ksmx[32] = 717569954;
        on.ksmx[33] = 1063377774;
        on.ksmx[34] = -2093883342;
        on.ksmx[35] = -1360776525;
        on.ksmx[36] = 125711080;
        on.ksmx[37] = 1661938365;
        on.ksmx[38] = 1152396779;
        on.ksmx[39] = 2091259614;
        on.ksmx[40] = 830521849;
        on.ksmx[41] = -2084989081;
        on.ksmx[42] = 1726554319;
        on.ksmx[43] = 1930610521;
        on.ksmx[44] = 1236538976;
        on.ksmx[45] = 649209594;
        on.ksmx[46] = 2025773441;
        on.ksmx[47] = 1216663093;
        on.ksmx[48] = -764944550;
        on.ksmx[49] = -652391401;
        on.ksmx[50] = 1060216858;
        on.ksmx[51] = 1854847844;
        on.ksmx[52] = -1666996579;
        on.ksmx[53] = -465216144;
        on.ksmx[54] = 1574472187;
        on.ksmx[55] = 1005470104;
        on.ksmx[56] = -1381146106;
        on.ksmx[57] = 687439811;
        on.ksmx[58] = -1909279657;
        on.ksmx[59] = -820307781;
        on.ksmx[60] = 152731720;
        on.ksmx[61] = -1065027862;
        on.ksmx[62] = -1801456592;
        on.ksmx[63] = -157378371;
        on.ksmx[64] = 1261728962;
        on.ksmx[65] = 746815698;
        on.ksmx[66] = -1570665119;
        on.ksmx[67] = 967026770;
        on.ksmx[68] = 1746243358;
        on.ksmx[69] = -429840039;
        on.ksmx[70] = 309074960;
        on.ksmx[71] = 1669050096;
        on.ksmx[72] = 278951106;
        on.ksmx[73] = 439863728;
        on.ksmx[74] = -634066882;
        on.ksmx[75] = -1650443888;
        on.ksmx[76] = -1780387710;
        on.ksmx[77] = -125255191;
        on.ksmx[78] = -928647525;
        on.ksmx[79] = 740864352;
        on.ksmx[80] = 103406854;
        on.ksmx[81] = 1049663568;
        on.ksmx[82] = 357742011;
        on.ksmx[83] = -1427601299;
        on.ksmx[84] = 1732261012;
        on.ksmx[85] = -707295774;
        on.ksmx[86] = 147945797;
        on.ksmx[87] = 69273637;
        on.ksmx[88] = 630054200;
        on.ksmx[89] = -257112836;
        on.ksmx[90] = 1566051773;
        on.ksmx[91] = -707904225;
        on.ksmx[92] = 1485570944;
        on.ksmx[93] = 1974686769;
        on.ksmx[94] = -324392230;
        on.ksmx[95] = -1145919131;
        on.ksmx[96] = 179465993;
        on.ksmx[97] = -2115605213;
        on.ksmx[98] = 361578141;
        on.ksmx[99] = -85246411;
    }

    private static /* synthetic */ void ktwq() {
        on.ksmx[200] = -545852158;
        on.ksmx[201] = -1590994182;
        on.ksmx[202] = 1948299979;
        on.ksmx[203] = -1418275483;
        on.ksmx[204] = 1483668568;
        on.ksmx[205] = -430112561;
        on.ksmx[206] = -1059275580;
        on.ksmx[207] = 1147502438;
        on.ksmx[208] = -1365038170;
        on.ksmx[209] = 924754108;
        on.ksmx[210] = 1764067896;
        on.ksmx[211] = 4043310;
        on.ksmx[212] = -125592941;
        on.ksmx[213] = -339026651;
        on.ksmx[214] = -445919053;
        on.ksmx[215] = 287003130;
        on.ksmx[216] = -1244821416;
        on.ksmx[217] = -824183128;
        on.ksmx[218] = 559599883;
        on.ksmx[219] = 1258663936;
        on.ksmx[220] = -1013669035;
        on.ksmx[221] = 1120974249;
        on.ksmx[222] = -904679600;
        on.ksmx[223] = 1801944731;
        on.ksmx[224] = -112214399;
        on.ksmx[225] = 150093467;
        on.ksmx[226] = 685833702;
        on.ksmx[227] = -834638284;
        on.ksmx[228] = -305188814;
        on.ksmx[229] = 1118418314;
        on.ksmx[230] = 360480718;
        on.ksmx[231] = 1039047142;
        on.ksmx[232] = 1956864167;
        on.ksmx[233] = -1061685888;
        on.ksmx[234] = 138095558;
        on.ksmx[235] = 834342753;
        on.ksmx[236] = 132009616;
        on.ksmx[237] = 1471201668;
        on.ksmx[238] = 1125243971;
        on.ksmx[239] = -1774843466;
        on.ksmx[240] = 1602424161;
        on.ksmx[241] = 1334716588;
        on.ksmx[242] = -1700307561;
        on.ksmx[243] = 103067443;
        on.ksmx[244] = 195197253;
        on.ksmx[245] = -1507321872;
        on.ksmx[246] = -1261527253;
        on.ksmx[247] = 613116115;
        on.ksmx[248] = -1605062391;
        on.ksmx[249] = 2086877457;
        on.ksmx[250] = -770813942;
        on.ksmx[251] = -579000153;
        on.ksmx[252] = 1202919183;
        on.ksmx[253] = -748046796;
        on.ksmx[254] = 176764303;
        on.ksmx[255] = -1794559887;
        on.ksmx[256] = -974205252;
        on.ksmx[257] = -1653380100;
        on.ksmx[258] = -1913858010;
        on.ksmx[259] = 1864772670;
        on.ksmx[260] = -757328740;
        on.ksmx[261] = -339043740;
        on.ksmx[262] = 407014673;
        on.ksmx[263] = -1441613237;
        on.ksmx[264] = 1393220449;
        on.ksmx[265] = -1122678127;
        on.ksmx[266] = -1260858411;
        on.ksmx[267] = -1685018581;
        on.ksmx[268] = 1695122616;
        on.ksmx[269] = 448447124;
        on.ksmx[270] = -1019638437;
        on.ksmx[271] = -236876770;
        on.ksmx[272] = 1576446894;
        on.ksmx[273] = 96459682;
        on.ksmx[274] = 1384359776;
        on.ksmx[275] = -390038731;
        on.ksmx[276] = -279751260;
        on.ksmx[277] = 1374425793;
        on.ksmx[278] = -2084234782;
        on.ksmx[279] = -906102234;
        on.ksmx[280] = -2024344718;
        on.ksmx[281] = 1421123955;
        on.ksmx[282] = 375150748;
        on.ksmx[283] = 1042317215;
        on.ksmx[284] = 286988346;
        on.ksmx[285] = 193591486;
        on.ksmx[286] = 1211543664;
        on.ksmx[287] = 616370333;
        on.ksmx[288] = 319605987;
        on.ksmx[289] = -1778947139;
        on.ksmx[290] = 825434025;
        on.ksmx[291] = 996203743;
        on.ksmx[292] = -1804742121;
        on.ksmx[293] = 181135075;
        on.ksmx[294] = -79196110;
        on.ksmx[295] = 773707299;
        on.ksmx[296] = 2123388993;
        on.ksmx[297] = 2004745115;
        on.ksmx[298] = 981509483;
        on.ksmx[299] = -2091273414;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void releaseTextures() {
        block64: {
            var3 = on.c;
            var2_1 /* !! */  = on.b;
            var1_2 = on.a;
            if (var3) {
                throw null;
lbl6:
                // 19 sources

                return;
            }
            if (var1_2 || var1_2) ** GOTO lbl6
            if (on.maskFramebuffer == null) break block64;
            if (var1_2 || var1_2) ** GOTO lbl6
            on.maskFramebuffer.method_1238();
            if (var1_2 || var1_2) ** GOTO lbl6
            on.maskFramebuffer = null;
            if (var1_2) ** GOTO lbl6
        }
        if (var1_2 || var1_2) ** GOTO lbl6
        var0_3 = on.ksmz("ktpg", ksmw(int ), (int)601);
        if (var1_2) ** GOTO lbl6
        block37: while (true) {
            block65: {
                if (var1_2 || var1_2) ** GOTO lbl6
                if (var0_3 >= on.ksmz("ktph", ksmw(int ), (int)602)) ** GOTO lbl46
                if (var1_2 || var1_2) ** GOTO lbl6
                if (on.trailViews[var0_3] == null) break block65;
                if (var1_2 || var1_2) ** GOTO lbl6
                on.trailViews[var0_3].close();
                if (var1_2 || var1_2) ** GOTO lbl6
                on.trailViews[var0_3] = null;
                if (var1_2) ** GOTO lbl6
            }
            if (var1_2 || var1_2) ** GOTO lbl6
            if (on.trailTextures[var0_3] == null) ** GOTO lbl41
            if (var1_2 || var1_2) ** GOTO lbl6
            on.trailTextures[var0_3].close();
            if (var1_2) ** GOTO lbl6
            if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var1_2) ** GOTO lbl6
                    on.trailTextures[var0_3] = null;
                    if (var1_2) ** GOTO lbl6
lbl41:
                    // 2 sources

                    if (var1_2 || var1_2) ** GOTO lbl6
                    ++var0_3;
                    if (var1_2) ** GOTO lbl6
                    if (!var3) continue block37;
                    throw null;
                }
lbl46:
                // 1 sources

                if (!var1_2 && !var1_2) ** break;
                ** continue;
                return;
                case 0: {
                    var2_1 /* !! */  = (int)on.ksmz("ktpi", ksmw(int ), (int)603);
                    if (var3) {
                        throw null;
                    }
                    ** GOTO lbl116
                }
lbl54:
                // 3 sources

                case 1: {
                    var2_1 /* !! */  = (int)on.ksmz("ktpj", ksmw(int ), (int)604);
                    if (var3) {
                        throw null;
                    }
                    ** GOTO lbl154
                }
lbl59:
                // 5 sources

                case 2: {
                    var2_1 /* !! */  = (int)on.ksmz("ktpk", ksmw(int ), (int)605);
                    if (var3) {
                        throw null;
                    }
                    ** GOTO lbl171
                }
                case 3: {
                    var2_1 /* !! */  = (int)on.ksmz("ktpl", ksmw(int ), (int)606);
                    if (var3) {
                        throw null;
                    }
                    ** GOTO lbl97
                }
                case 4: {
                    var2_1 /* !! */  = (int)on.ksmz("ktpm", ksmw(int ), (int)607);
                    if (!var3) ** GOTO lbl59
                    throw null;
                }
                case 5: {
                    var2_1 /* !! */  = (int)on.ksmz("ktpn", ksmw(int ), (int)608);
                    if (var3) {
                        throw null;
                    }
                    ** GOTO lbl120
                }
lbl78:
                // 4 sources

                case 6: {
                    var2_1 /* !! */  = (int)on.ksmz("ktpo", ksmw(int ), (int)609);
                    if (var3) {
                        throw null;
                    }
                    ** GOTO lbl120
                }
                case 7: {
                    var2_1 /* !! */  = (int)on.ksmz("ktpp", ksmw(int ), (int)610);
                    if (var3) {
                        throw null;
                    }
                    ** GOTO lbl154
                }
lbl88:
                // 3 sources

                case 8: {
                    var2_1 /* !! */  = (int)on.ksmz("ktpq", ksmw(int ), (int)611);
                    if (var3) {
                        throw null;
                    }
                    ** GOTO lbl107
                }
                case 9: {
                    var2_1 /* !! */  = (int)on.ksmz("ktpr", ksmw(int ), (int)612);
                    if (!var3) ** GOTO lbl78
                    throw null;
                }
lbl97:
                // 3 sources

                case 10: {
                    var2_1 /* !! */  = (int)on.ksmz("ktps", ksmw(int ), (int)613);
                    if (var3) {
                        throw null;
                    }
                    ** GOTO lbl145
                }
lbl102:
                // 2 sources

                case 11: {
                    var2_1 /* !! */  = (int)on.ksmz("ktpt", ksmw(int ), (int)614);
                    if (var3) {
                        throw null;
                    }
                    ** GOTO lbl145
                }
lbl107:
                // 2 sources

                case 12: {
                    var2_1 /* !! */  = (int)on.ksmz("ktpu", ksmw(int ), (int)615);
                    if (!var3) ** GOTO lbl59
                    throw null;
                }
                case 13: {
                    var2_1 /* !! */  = (int)on.ksmz("ktpv", ksmw(int ), (int)616);
                    if (var3) {
                        throw null;
                    }
                    ** GOTO lbl137
                }
lbl116:
                // 3 sources

                case 14: {
                    var2_1 /* !! */  = (int)on.ksmz("ktpw", ksmw(int ), (int)617);
                    if (!var3) ** GOTO lbl59
                    throw null;
                }
lbl120:
                // 4 sources

                case 15: {
                    var2_1 /* !! */  = (int)on.ksmz("ktpx", ksmw(int ), (int)618);
                    if (!var3) ** GOTO lbl102
                    throw null;
                }
                case 16: {
                    var2_1 /* !! */  = (int)on.ksmz("ktpy", ksmw(int ), (int)619);
                    if (var3) {
                        throw null;
                    }
                    ** GOTO lbl137
                }
                case 17: {
                    var2_1 /* !! */  = (int)on.ksmz("ktpz", ksmw(int ), (int)620);
                    if (!var3) ** GOTO lbl116
                    throw null;
                }
                case 18: {
                    var2_1 /* !! */  = (int)on.ksmz("ktqa", ksmw(int ), (int)621);
                    if (!var3) ** GOTO lbl97
                    throw null;
                }
lbl137:
                // 4 sources

                case 19: {
                    var2_1 /* !! */  = (int)on.ksmz("ktqb", ksmw(int ), (int)622);
                    if (!var3) ** GOTO lbl78
                    throw null;
                }
lbl141:
                // 2 sources

                case 20: {
                    var2_1 /* !! */  = (int)on.ksmz("ktqc", ksmw(int ), (int)623);
                    if (!var3) ** GOTO lbl54
                    throw null;
                }
lbl145:
                // 3 sources

                case 21: {
                    var2_1 /* !! */  = (int)on.ksmz("ktqd", ksmw(int ), (int)624);
                    if (!var3) ** GOTO lbl88
                    throw null;
                }
                case 22: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_1 /* !! */  = (int)on.ksmz("ktqe", ksmw(int ), (int)625);
                        if (!var3) ** GOTO lbl54
                        throw null;
                    }
                }
lbl154:
                // 5 sources

                case 23: {
                    var2_1 /* !! */  = (int)on.ksmz("ktqf", ksmw(int ), (int)626);
                    if (!var3) ** GOTO lbl141
                    throw null;
                }
                case 24: {
                    var2_1 /* !! */  = (int)on.ksmz("ktqg", ksmw(int ), (int)627);
                    if (!var3) ** GOTO lbl137
                    throw null;
                }
                case 25: {
                    do {
                        var2_1 /* !! */  = (int)on.ksmz("ktqh", ksmw(int ), (int)628);
                    } while (!var3);
                    throw null;
                }
                case 26: {
                    var2_1 /* !! */  = (int)on.ksmz("ktqi", ksmw(int ), (int)629);
                    if (!var3) break block37;
                    throw null;
                }
lbl171:
                // 2 sources

                case 27: {
                    var2_1 /* !! */  = (int)on.ksmz("ktqj", ksmw(int ), (int)630);
                    if (!var3) ** GOTO lbl78
                    throw null;
                }
                case 28: {
                    var2_1 /* !! */  = (int)on.ksmz("ktqk", ksmw(int ), (int)631);
                    if (!var3) ** GOTO lbl88
                    throw null;
                }
                case 29: {
                    var2_1 /* !! */  = (int)on.ksmz("ktql", ksmw(int ), (int)632);
                    if (!var3) ** GOTO lbl59
                    throw null;
                }
                case 30: {
                    var2_1 /* !! */  = (int)on.ksmz("ktqm", ksmw(int ), (int)633);
                    if (!var3) ** GOTO lbl120
                    throw null;
                }
                case 31: {
                    var2_1 /* !! */  = (int)on.ksmz("ktqn", ksmw(int ), (int)634);
                    if (!var3) ** GOTO lbl154
                    throw null;
                }
                case 32: {
                    var2_1 /* !! */  = (int)on.ksmz("ktqo", ksmw(int ), (int)635);
                    if (!var3) ** GOTO lbl154
                    throw null;
                }
                case 33: 
            }
            break;
        }
        var2_1 /* !! */  = (int)on.ksmz("ktqp", ksmw(int ), (int)636);
        ** while (!var3)
lbl198:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ktwr() {
        on.ksmx[300] = 1880875668;
        on.ksmx[301] = 1567400541;
        on.ksmx[302] = -19762999;
        on.ksmx[303] = 2124404942;
        on.ksmx[304] = 1213360481;
        on.ksmx[305] = 348223257;
        on.ksmx[306] = 2016591056;
        on.ksmx[307] = -1188294912;
        on.ksmx[308] = 1782118067;
        on.ksmx[309] = -405775920;
        on.ksmx[310] = -2116301765;
        on.ksmx[311] = 65866887;
        on.ksmx[312] = -1141423785;
        on.ksmx[313] = 1998301657;
        on.ksmx[314] = -1642023753;
        on.ksmx[315] = -1155846189;
        on.ksmx[316] = 1509297873;
        on.ksmx[317] = 1961071092;
        on.ksmx[318] = -1221937519;
        on.ksmx[319] = 678492691;
        on.ksmx[320] = 2138856440;
        on.ksmx[321] = 714741614;
        on.ksmx[322] = -594986921;
        on.ksmx[323] = -606593298;
        on.ksmx[324] = 872911444;
        on.ksmx[325] = -1711481053;
        on.ksmx[326] = -1745598777;
        on.ksmx[327] = 204946737;
        on.ksmx[328] = 1302023509;
        on.ksmx[329] = -1305419885;
        on.ksmx[330] = -549732168;
        on.ksmx[331] = 2017039858;
        on.ksmx[332] = -2130086828;
        on.ksmx[333] = -1102352134;
        on.ksmx[334] = -1040470710;
        on.ksmx[335] = 1500999478;
        on.ksmx[336] = 827298883;
        on.ksmx[337] = 1285174651;
        on.ksmx[338] = -1718392633;
        on.ksmx[339] = 1016883597;
        on.ksmx[340] = 164112257;
        on.ksmx[341] = 571717995;
        on.ksmx[342] = 1543902113;
        on.ksmx[343] = -1118239819;
        on.ksmx[344] = 1401575266;
        on.ksmx[345] = 1515653977;
        on.ksmx[346] = 1239271819;
        on.ksmx[347] = -1927128118;
        on.ksmx[348] = -446028195;
        on.ksmx[349] = 52980069;
        on.ksmx[350] = -1146961300;
        on.ksmx[351] = 522173100;
        on.ksmx[352] = 1591432137;
        on.ksmx[353] = -1238084791;
        on.ksmx[354] = 967422994;
        on.ksmx[355] = 177930338;
        on.ksmx[356] = -1367906197;
        on.ksmx[357] = 1028590350;
        on.ksmx[358] = 1329661975;
        on.ksmx[359] = 2134487434;
        on.ksmx[360] = 2002146592;
        on.ksmx[361] = -1407519594;
        on.ksmx[362] = 70967632;
        on.ksmx[363] = 671541907;
        on.ksmx[364] = 2075773550;
        on.ksmx[365] = 1758432854;
        on.ksmx[366] = 2100427503;
        on.ksmx[367] = 53457792;
        on.ksmx[368] = 2074771408;
        on.ksmx[369] = -74961204;
        on.ksmx[370] = 1796433419;
        on.ksmx[371] = -1806658867;
        on.ksmx[372] = 1467831619;
        on.ksmx[373] = 1530279478;
        on.ksmx[374] = 73749152;
        on.ksmx[375] = -116430200;
        on.ksmx[376] = -1425429166;
        on.ksmx[377] = -1091028804;
        on.ksmx[378] = -1011951524;
        on.ksmx[379] = -1255187142;
        on.ksmx[380] = -1514230706;
        on.ksmx[381] = -1398995739;
        on.ksmx[382] = -1440672974;
        on.ksmx[383] = 1140040946;
        on.ksmx[384] = 1182481905;
        on.ksmx[385] = -1036873656;
        on.ksmx[386] = 1625426548;
        on.ksmx[387] = 1350671408;
        on.ksmx[388] = 1374094120;
        on.ksmx[389] = 770580766;
        on.ksmx[390] = -1168232549;
        on.ksmx[391] = -448700693;
        on.ksmx[392] = -2058841906;
        on.ksmx[393] = 515656306;
        on.ksmx[394] = 1074623812;
        on.ksmx[395] = -1639988074;
        on.ksmx[396] = -2135449809;
        on.ksmx[397] = -1248031740;
        on.ksmx[398] = 1684357103;
        on.ksmx[399] = -1685348785;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void reset() {
        block108: {
            v0 /* !! */  = on.te;
            if (true) ** GOTO lbl5
            block65: while (true) {
                v0 /* !! */  = (long)(v1 - on.ksmz("ktmb", ksnd(int ), (int)96));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -429153865: {
                        v1 = on.ksmz("ktmc", ksnd(int ), (int)97);
                        continue block65;
                    }
                    case -100378010: {
                        v1 = on.ksmz("ktmd", ksnd(int ), (int)98);
                        continue block65;
                    }
                    case 17413265: {
                        v1 = on.ksmz("ktme", ksnd(int ), (int)99);
                        continue block65;
                    }
                    case 1982436825: {
                        break block65;
                    }
                }
                break;
            }
            var2 = on.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = on.te - on.ksmz("ktmf", ksnd(int ), (int)100)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == on.ksmz("ktmg", ksmw(int ), (int)551)) break;
                v2 /* !! */  = (long)on.ksmz("ktmh", ksmw(int ), (int)552);
            }
            var1_1 /* !! */  = on.b;
            v3 /* !! */  = on.te;
            if (true) ** GOTO lbl28
            block67: while (true) {
                v3 /* !! */  = (long)(v4 - on.ksmz("ktmi", ksnd(int ), (int)101));
lbl28:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1817030440: {
                        v4 = on.ksmz("ktmj", ksnd(int ), (int)102);
                        continue block67;
                    }
                    case 1355739363: {
                        v4 = on.ksmz("ktmk", ksnd(int ), (int)103);
                        continue block67;
                    }
                    case 1982436825: {
                        break block67;
                    }
                }
                break;
            }
            var0_2 = on.a;
            if (var2) {
                throw null;
lbl40:
                // 15 sources

                return;
            }
            if (var0_2 || var0_2) ** GOTO lbl40
            v5 = on.ksmz("ktml", ksmw(int ), (int)553);
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_1 = on.te - on.ksmz("ktmm", ksnd(int ), (int)104)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == on.ksmz("ktmn", ksmw(int ), (int)554)) break;
                v6 /* !! */  = (long)on.ksmz("ktmo", ksmw(int ), (int)555);
            }
            on.framePrepared = v5;
            if (var0_2 || var0_2) ** GOTO lbl40
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_2 = on.te - on.ksmz("ktmp", ksnd(int ), (int)105)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v7 /* !! */  == on.ksmz("ktmq", ksmw(int ), (int)556)) break;
                v7 /* !! */  = (long)on.ksmz("ktmr", ksmw(int ), (int)557);
            }
            if (on.trailViews[0] != null) break block108;
            if (var0_2) ** GOTO lbl40
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_3 = on.te - on.ksmz("ktms", ksnd(int ), (int)106)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == on.ksmz("ktmt", ksmw(int ), (int)558)) break;
                v8 /* !! */  = (long)on.ksmz("ktmu", ksmw(int ), (int)559);
            }
            if (on.trailViews[1] == null) ** GOTO lbl88
            if (var0_2) ** GOTO lbl40
        }
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2 || var0_2) ** GOTO lbl40
                v9 /* !! */  = on.te;
                if (true) ** GOTO lbl74
                block72: while (true) {
                    v9 /* !! */  = (long)(v10 - on.ksmz("ktmv", ksnd(int ), (int)107));
lbl74:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -2027602092: {
                            v10 = on.ksmz("ktmw", ksnd(int ), (int)108);
                            continue block72;
                        }
                        case -1186139404: {
                            v10 = on.ksmz("ktmx", ksnd(int ), (int)109);
                            continue block72;
                        }
                        case 448033645: {
                            v10 = on.ksmz("ktmy", ksnd(int ), (int)110);
                            continue block72;
                        }
                        case 1982436825: {
                            break block72;
                        }
                    }
                    break;
                }
                on.clearTrailTextures();
                if (var0_2) ** GOTO lbl40
lbl88:
                // 2 sources

                if (var0_2 || var0_2) ** GOTO lbl40
                v11 = on.ksmz("ktmz", ksnd(int ), (int)111);
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_4 = on.te - on.ksmz("ktna", ksnd(int ), (int)112)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == on.ksmz("ktnb", ksmw(int ), (int)560)) break;
                    v12 /* !! */  = (long)on.ksmz("ktnc", ksmw(int ), (int)561);
                }
                on.lastFrameNanos = (long)v11;
                if (var0_2 || var0_2) ** GOTO lbl40
                v13 /* !! */  = on.te;
                if (true) ** GOTO lbl101
                block74: while (true) {
                    v13 /* !! */  = (long)(v14 - on.ksmz("ktnd", ksnd(int ), (int)113));
lbl101:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1797473457: {
                            v14 = on.ksmz("ktne", ksnd(int ), (int)114);
                            continue block74;
                        }
                        case -761707928: {
                            v14 = on.ksmz("ktnf", ksnd(int ), (int)115);
                            continue block74;
                        }
                        case 492788603: {
                            v14 = on.ksmz("ktng", ksnd(int ), (int)116);
                            continue block74;
                        }
                        case 1982436825: {
                            break block74;
                        }
                    }
                    break;
                }
                on.smoothRise = 0.0f;
                if (var0_2 || var0_2) ** GOTO lbl40
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_5 = on.te - on.ksmz("ktnh", ksnd(int ), (int)117)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == on.ksmz("ktni", ksmw(int ), (int)562)) break;
                    v15 /* !! */  = (long)on.ksmz("ktnj", ksmw(int ), (int)563);
                }
                on.smoothSway = 0.0f;
                if (var0_2 || var0_2) ** GOTO lbl40
                v16 /* !! */  = on.te;
                if (true) ** GOTO lbl126
                block76: while (true) {
                    v16 /* !! */  = (long)(v17 - on.ksmz("ktnk", ksnd(int ), (int)118));
lbl126:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case 819176013: {
                            v17 = on.ksmz("ktnl", ksnd(int ), (int)119);
                            continue block76;
                        }
                        case 1115613068: {
                            v17 = on.ksmz("ktnm", ksnd(int ), (int)120);
                            continue block76;
                        }
                        case 1982436825: {
                            break block76;
                        }
                    }
                    break;
                }
                on.smoothTurnWind = 0.0f;
                if (var0_2 || var0_2) ** GOTO lbl40
                v18 = on.ksmz("ktnn", ksnj(int ), (int)564);
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_6 = on.te - on.ksmz("ktno", ksnd(int ), (int)121)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == on.ksmz("ktnp", ksmw(int ), (int)565)) break;
                    v19 /* !! */  = (long)on.ksmz("ktnq", ksmw(int ), (int)566);
                }
                on.previousCameraYaw = (float)v18;
                if (var0_2 || var0_2) ** GOTO lbl40
                v20 /* !! */  = on.te;
                if (true) ** GOTO lbl149
                block78: while (true) {
                    v20 /* !! */  = (long)(v21 - on.ksmz("ktnr", ksnd(int ), (int)122));
lbl149:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -1806603952: {
                            v21 = on.ksmz("ktns", ksnd(int ), (int)123);
                            continue block78;
                        }
                        case -1741984194: {
                            v21 = on.ksmz("ktnt", ksnd(int ), (int)124);
                            continue block78;
                        }
                        case -297864618: {
                            v21 = on.ksmz("ktnu", ksnd(int ), (int)125);
                            continue block78;
                        }
                        case 1982436825: {
                            break block78;
                        }
                    }
                    break;
                }
                on.smoothBurst = 0.0f;
                if (var0_2 || var0_2) ** GOTO lbl40
                v22 = on.ksmz("ktnv", ksmw(int ), (int)567);
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_7 = on.te - on.ksmz("ktnw", ksnd(int ), (int)126)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == on.ksmz("ktnx", ksmw(int ), (int)568)) break;
                    v23 /* !! */  = (long)on.ksmz("ktny", ksmw(int ), (int)569);
                }
                on.wasSwinging = v22;
                if (var0_2 || var0_2) ** GOTO lbl40
                v24 = on.ksmz("ktnz", ksnd(int ), (int)127);
                while (true) {
                    if ((v25 /* !! */  = (cfr_temp_8 = on.te - on.ksmz("ktoa", ksnd(int ), (int)128)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v25 /* !! */  == on.ksmz("ktob", ksmw(int ), (int)570)) break;
                    v25 /* !! */  = (long)on.ksmz("ktoc", ksmw(int ), (int)571);
                }
                on.lastSwingNanos = (long)v24;
                if (!var0_2 && !var0_2) ** break;
                ** continue;
                return;
            }
lbl181:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)on.ksmz("ktod", ksmw(int ), (int)572);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl287
            }
lbl186:
            // 3 sources

            case 1: {
                var1_1 /* !! */  = (int)on.ksmz("ktoe", ksmw(int ), (int)573);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl244
            }
lbl191:
            // 2 sources

            case 2: {
                var1_1 /* !! */  = (int)on.ksmz("ktof", ksmw(int ), (int)574);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl240
            }
lbl196:
            // 2 sources

            case 3: {
                var1_1 /* !! */  = (int)on.ksmz("ktog", ksmw(int ), (int)575);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl287
            }
            case 4: {
                var1_1 /* !! */  = (int)on.ksmz("ktoh", ksmw(int ), (int)576);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl291
            }
            case 5: {
                var1_1 /* !! */  = (int)on.ksmz("ktoi", ksmw(int ), (int)577);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl287
            }
            case 6: {
                var1_1 /* !! */  = (int)on.ksmz("ktoj", ksmw(int ), (int)578);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl253
            }
lbl216:
            // 2 sources

            case 7: {
                var1_1 /* !! */  = (int)on.ksmz("ktok", ksmw(int ), (int)579);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl295
            }
            case 8: {
                var1_1 /* !! */  = (int)on.ksmz("ktol", ksmw(int ), (int)580);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl274
            }
lbl226:
            // 2 sources

            case 9: {
                var1_1 /* !! */  = (int)on.ksmz("ktom", ksmw(int ), (int)581);
                if (!var2) ** GOTO lbl181
                throw null;
            }
            case 10: {
                var1_1 /* !! */  = (int)on.ksmz("kton", ksmw(int ), (int)582);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl274
            }
lbl235:
            // 2 sources

            case 11: {
                var1_1 /* !! */  = (int)on.ksmz("ktoo", ksmw(int ), (int)583);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl303
            }
lbl240:
            // 2 sources

            case 12: {
                var1_1 /* !! */  = (int)on.ksmz("ktop", ksmw(int ), (int)584);
                if (!var2) ** GOTO lbl235
                throw null;
            }
lbl244:
            // 2 sources

            case 13: {
                var1_1 /* !! */  = (int)on.ksmz("ktoq", ksmw(int ), (int)585);
                if (!var2) ** GOTO lbl226
                throw null;
            }
            case 14: {
                var1_1 /* !! */  = (int)on.ksmz("ktor", ksmw(int ), (int)586);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl295
            }
lbl253:
            // 3 sources

            case 15: {
                var1_1 /* !! */  = (int)on.ksmz("ktos", ksmw(int ), (int)587);
                if (!var2) break;
                throw null;
            }
lbl257:
            // 3 sources

            case 16: {
                var1_1 /* !! */  = (int)on.ksmz("ktot", ksmw(int ), (int)588);
                if (!var2) ** GOTO lbl186
                throw null;
            }
            case 17: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)on.ksmz("ktou", ksmw(int ), (int)589);
                    if (!var2) ** GOTO lbl216
                    throw null;
                }
            }
lbl266:
            // 2 sources

            case 18: {
                var1_1 /* !! */  = (int)on.ksmz("ktov", ksmw(int ), (int)590);
                if (!var2) ** GOTO lbl253
                throw null;
            }
            case 19: {
                var1_1 /* !! */  = (int)on.ksmz("ktow", ksmw(int ), (int)591);
                if (!var2) ** GOTO lbl191
                throw null;
            }
lbl274:
            // 3 sources

            case 20: {
                var1_1 /* !! */  = (int)on.ksmz("ktox", ksmw(int ), (int)592);
                if (!var2) ** GOTO lbl186
                throw null;
            }
lbl278:
            // 2 sources

            case 21: {
                var1_1 /* !! */  = (int)on.ksmz("ktoy", ksmw(int ), (int)593);
                if (!var2) ** GOTO lbl196
                throw null;
            }
            case 22: {
                var1_1 /* !! */  = (int)on.ksmz("ktoz", ksmw(int ), (int)594);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl291
            }
lbl287:
            // 4 sources

            case 23: {
                var1_1 /* !! */  = (int)on.ksmz("ktpa", ksmw(int ), (int)595);
                if (!var2) ** GOTO lbl257
                throw null;
            }
lbl291:
            // 3 sources

            case 24: {
                var1_1 /* !! */  = (int)on.ksmz("ktpb", ksmw(int ), (int)596);
                if (var2) {
                    throw null;
                }
            }
lbl295:
            // 5 sources

            case 25: {
                var1_1 /* !! */  = (int)on.ksmz("ktpc", ksmw(int ), (int)597);
                if (!var2) ** GOTO lbl257
                throw null;
            }
            case 26: {
                var1_1 /* !! */  = (int)on.ksmz("ktpd", ksmw(int ), (int)598);
                if (!var2) ** GOTO lbl266
                throw null;
            }
lbl303:
            // 2 sources

            case 27: {
                var1_1 /* !! */  = (int)on.ksmz("ktpe", ksmw(int ), (int)599);
                if (!var2) ** GOTO lbl278
                throw null;
            }
            case 28: 
        }
        var1_1 /* !! */  = (int)on.ksmz("ktpf", ksmw(int ), (int)600);
        ** while (!var2)
lbl310:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String lambda$compositeBehindHand$4() {
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = te - on.ksmz("ktsz", ksnd(int ), (int)166)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == on.ksmz("ktta", ksmw(int ), (int)661)) break;
            object = on.ksmz("kttb", ksmw(int ), (int)662);
        }
        boolean bl2 = c;
        Object object = te;
        block11: while (true) {
            switch ((int)object) {
                case 476560588: {
                    object = on.ksmz("kttd", ksnd(int ), (int)168) - on.ksmz("kttc", ksnd(int ), (int)167);
                    continue block11;
                }
                case 1982436825: {
                    break block11;
                }
            }
            break;
        }
        int n2 = b;
        Object object2 = te;
        boolean bl3 = true;
        block12: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object2 = callSite - on.ksmz("ktte", ksnd(int ), (int)169);
            }
            switch ((int)object2) {
                case -1210723934: {
                    callSite = on.ksmz("kttf", ksnd(int ), (int)170);
                    continue block12;
                }
                case 771524351: {
                    callSite = on.ksmz("kttg", ksnd(int ), (int)171);
                    continue block12;
                }
                case 1859421582: {
                    callSite = on.ksmz("ktth", ksnd(int ), (int)172);
                    continue block12;
                }
                case 1982436825: {
                    break block12;
                }
            }
            break;
        }
        boolean bl4 = a;
        if (bl2) {
            throw null;
        }
        if (bl4 || bl4) {
            return null;
        }
        return "phobia:shader_hands_trail_behind_hand";
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void endFrame() {
        block408: {
            block407: {
                block406: {
                    block405: {
                        block404: {
                            block403: {
                                block402: {
                                    block401: {
                                        block400: {
                                            block399: {
                                                block398: {
                                                    block397: {
                                                        var21 = on.c;
                                                        var20_1 /* !! */  = on.b;
                                                        var19_2 = on.a;
                                                        if (var21) {
                                                            throw null;
lbl6:
                                                            // 115 sources

                                                            return;
                                                        }
                                                        if (var19_2 || var19_2) ** GOTO lbl6
                                                        if (!on.framePrepared) break block397;
                                                        if (var19_2) ** GOTO lbl6
                                                        if (on.maskFramebuffer != null) break block398;
                                                        if (var19_2) ** GOTO lbl6
                                                    }
                                                    if (var19_2 || var19_2) ** GOTO lbl6
                                                    return;
                                                }
                                                if (var19_2 || var19_2) ** GOTO lbl6
                                                on.framePrepared = on.ksmz("ksps", ksmw(int ), (int)62);
                                                if (var19_2 || var19_2) ** GOTO lbl6
                                                var0_3 = class_310.method_1551();
                                                if (var19_2 || var19_2) ** GOTO lbl6
                                                if (var0_3.method_1522() != null) break block399;
                                                if (var19_2 || var19_2) ** GOTO lbl6
                                                return;
                                            }
                                            if (var19_2 || var19_2) ** GOTO lbl6
                                            var1_4 = jn.getInstance();
                                            if (var19_2 || var19_2) ** GOTO lbl6
                                            if (var1_4 == null) break block400;
                                            if (var19_2) ** GOTO lbl6
                                            if (var1_4.isTrailEnabled()) break block401;
                                            if (var19_2) ** GOTO lbl6
                                        }
                                        if (var19_2 || var19_2) ** GOTO lbl6
                                        on.reset();
                                        if (var19_2 || var19_2) ** GOTO lbl6
                                        return;
                                    }
                                    if (var19_2 || var19_2) ** GOTO lbl6
                                    var2_5 = System.nanoTime();
                                    if (var19_2 || var19_2) ** GOTO lbl6
                                    if (on.lastFrameNanos != on.ksmz("kspt", ksnd(int ), (int)4)) break block402;
                                    if (var19_2) ** GOTO lbl6
                                    v0 /* !! */  = on.ksmz("kspu", ksnj(int ), (int)63);
                                    if (var21) {
                                        throw null;
                                    }
                                    break block403;
                                }
                                if (var19_2 || var19_2) ** GOTO lbl6
                                v0 /* !! */  = var4_6 /* !! */  = (CallSite)((float)(var2_5 - on.lastFrameNanos) / on.ksmz("kspv", ksnj(int ), (int)64));
                            }
                            if (var19_2 || var19_2) ** GOTO lbl6
                            on.lastFrameNanos = var2_5;
                            if (var19_2 || var19_2) ** GOTO lbl6
                            if (var4_6 /* !! */  <= 0.0f) break block404;
                            if (var19_2) ** GOTO lbl6
                            if (!(var4_6 /* !! */  > on.ksmz("kspw", ksnj(int ), (int)65))) break block405;
                            if (var19_2) ** GOTO lbl6
                        }
                        if (var19_2 || var19_2) ** GOTO lbl6
                        var4_6 /* !! */  = (CallSite)on.smoothDt;
                        if (var19_2) ** GOTO lbl6
                    }
                    if (var19_2 || var19_2) ** GOTO lbl6
                    var4_6 /* !! */  = (CallSite)Math.max((float)on.ksmz("kspx", ksnj(int ), (int)66), Math.min((float)on.ksmz("kspy", ksnj(int ), (int)67), (float)var4_6 /* !! */ ));
                    if (var19_2 || var19_2) ** GOTO lbl6
                    on.smoothDt += (var4_6 /* !! */  - on.smoothDt) * on.ksmz("kspz", ksnj(int ), (int)68);
                    if (var19_2 || var19_2) ** GOTO lbl6
                    var5_7 = var1_4.isBeautifulMode();
                    if (var19_2 || var19_2) ** GOTO lbl6
                    var6_8 = (float)(var2_5 % on.ksmz("ksqa", ksnd(int ), (int)5)) / on.ksmz("ksqb", ksnj(int ), (int)69);
                    if (var19_2 || var19_2) ** GOTO lbl6
                    if (!var5_7) break block406;
                    if (var19_2) ** GOTO lbl6
                    v1 = 0.0f;
                    if (var21) {
                        throw null;
                    }
                    break block407;
                }
                if (var19_2 || var19_2) ** GOTO lbl6
                v1 = var1_4.trailRise.getValue();
            }
            var7_9 = v1 * on.smoothDt;
            if (var19_2 || var19_2) ** GOTO lbl6
            if (!var5_7) ** GOTO lbl117
            if (var19_2) ** GOTO lbl6
            if (var0_3.field_1724 == null) ** GOTO lbl117
            if (var19_2 || var19_2) ** GOTO lbl6
            var9_10 = var0_3.field_1773.method_19418().method_19330();
            if (var19_2 || var19_2) ** GOTO lbl6
            if (!Float.isNaN(on.previousCameraYaw)) break block408;
            if (var19_2 || var19_2) ** GOTO lbl6
            v2 = 0.0f;
            if (var21) {
                throw null;
            }
            ** GOTO lbl103
        }
        if (var19_2 || var19_2) ** GOTO lbl6
        if (var20_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var20_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 = var10_11 = class_3532.method_15393((float)(var9_10 - on.previousCameraYaw));
lbl103:
                // 2 sources

                if (var19_2 || var19_2) ** GOTO lbl6
                on.previousCameraYaw = var9_10;
                if (var19_2 || var19_2) ** GOTO lbl6
                var11_13 = class_3532.method_15363((float)(-var10_11 * on.ksmz("ksqc", ksnj(int ), (int)70)), (float)on.ksmz("ksqd", ksnj(int ), (int)71), (float)on.ksmz("ksqe", ksnj(int ), (int)72));
                if (var19_2 || var19_2) ** GOTO lbl6
                var12_14 /* !! */  = 1.0f - (float)Math.exp(-on.smoothDt * on.ksmz("ksqf", ksnj(int ), (int)73));
                if (var19_2 || var19_2) ** GOTO lbl6
                on.smoothTurnWind += (var11_13 - on.smoothTurnWind) * var12_14 /* !! */ ;
                if (var19_2 || var19_2) ** GOTO lbl6
                var8_15 = on.smoothTurnWind;
                if (var19_2 || var19_2) ** GOTO lbl6
                if (var21) {
                    throw null;
                }
                ** GOTO lbl124
            }
lbl117:
            // 2 sources

            if (var19_2 || var19_2) ** GOTO lbl6
            on.previousCameraYaw = (float)on.ksmz("ksqg", ksnj(int ), (int)74);
            if (var19_2 || var19_2) ** GOTO lbl6
            on.smoothTurnWind *= (float)Math.exp(-on.smoothDt * on.ksmz("ksqh", ksnj(int ), (int)75));
            if (var19_2 || var19_2) ** GOTO lbl6
            var8_15 = ((float)Math.sin(var6_8 * on.ksmz("ksqi", ksnj(int ), (int)76)) - (float)Math.sin((var6_8 - on.smoothDt) * on.ksmz("ksqj", ksnj(int ), (int)77))) * var1_4.trailSway.getValue();
            if (var19_2) ** GOTO lbl6
lbl124:
            // 2 sources

            if (var19_2 || var19_2) ** GOTO lbl6
            var9_10 = 1.0f - (float)Math.exp(-on.smoothDt * on.ksmz("ksqk", ksnj(int ), (int)78));
            if (var19_2 || var19_2) ** GOTO lbl6
            on.smoothRise += (var7_9 - on.smoothRise) * var9_10;
            if (var19_2 || var19_2) ** GOTO lbl6
            on.smoothSway += (var8_15 - on.smoothSway) * var9_10;
            if (var19_2 || var19_2) ** GOTO lbl6
            if (var0_3.field_1724 == null) ** GOTO lbl139
            if (var19_2) ** GOTO lbl6
            if (!var0_3.field_1724.field_6252) ** GOTO lbl139
            if (var19_2) ** GOTO lbl6
            v3 = on.ksmz("ksql", ksmw(int ), (int)79);
            if (var21) {
                throw null;
            }
            ** GOTO lbl141
lbl139:
            // 2 sources

            if (var19_2 || var19_2) ** GOTO lbl6
            v3 = var10_12 = on.ksmz("ksqm", ksmw(int ), (int)80);
lbl141:
            // 2 sources

            if (var19_2 || var19_2) ** GOTO lbl6
            if (var5_7) ** GOTO lbl152
            if (var19_2) ** GOTO lbl6
            if (!var1_4.trailBurst.isValue()) ** GOTO lbl152
            if (var19_2) ** GOTO lbl6
            if (var10_12 == false) ** GOTO lbl152
            if (var19_2) ** GOTO lbl6
            if (on.wasSwinging) ** GOTO lbl152
            if (var19_2 || var19_2) ** GOTO lbl6
            on.lastSwingNanos = var2_5;
            if (var19_2) ** GOTO lbl6
lbl152:
            // 5 sources

            if (var19_2 || var19_2) ** GOTO lbl6
            on.wasSwinging = var10_12;
            if (var19_2 || var19_2) ** GOTO lbl6
            var11_13 = 0.0f;
            if (var19_2 || var19_2) ** GOTO lbl6
            if (var5_7) ** GOTO lbl170
            if (var19_2) ** GOTO lbl6
            if (!var1_4.trailBurst.isValue()) ** GOTO lbl170
            if (var19_2) ** GOTO lbl6
            if (on.lastSwingNanos == on.ksmz("ksqn", ksnd(int ), (int)6)) ** GOTO lbl170
            if (var19_2 || var19_2) ** GOTO lbl6
            var12_14 /* !! */  = (float)(var2_5 - on.lastSwingNanos) / on.ksmz("ksqo", ksnj(int ), (int)81);
            if (var19_2 || var19_2) ** GOTO lbl6
            var11_13 = Math.max(0.0f, 1.0f - var12_14 /* !! */  / on.ksmz("ksqp", ksnj(int ), (int)82));
            if (var19_2 || var19_2) ** GOTO lbl6
            if (var21) {
                throw null;
            }
            ** GOTO lbl175
lbl170:
            // 3 sources

            if (var19_2 || var19_2) ** GOTO lbl6
            if (var1_4.trailBurst.isValue()) ** GOTO lbl175
            if (var19_2 || var19_2) ** GOTO lbl6
            on.lastSwingNanos = (long)on.ksmz("ksqq", ksnd(int ), (int)7);
            if (var19_2) ** GOTO lbl6
lbl175:
            // 3 sources

            if (var19_2 || var19_2) ** GOTO lbl6
            on.smoothBurst += (var11_13 - on.smoothBurst) * (1.0f - (float)Math.exp(-on.smoothDt * on.ksmz("ksqr", ksnj(int ), (int)83)));
            if (var19_2 || var19_2) ** GOTO lbl6
            if (!var5_7) ** GOTO lbl184
            if (var19_2) ** GOTO lbl6
            v4 /* !! */  = on.ksmz("ksqs", ksnj(int ), (int)84);
            if (var21) {
                throw null;
            }
            ** GOTO lbl186
lbl184:
            // 1 sources

            if (var19_2 || var19_2) ** GOTO lbl6
            v4 /* !! */  = (CallSite)(var1_4.trailFade.getValue() + on.smoothBurst * var1_4.trailBurstPower.getValue() * on.ksmz("ksqt", ksnj(int ), (int)85));
lbl186:
            // 2 sources

            var12_14 /* !! */  = (float)v4 /* !! */ ;
            if (var19_2 || var19_2) ** GOTO lbl6
            if (var5_7) {
                v5 = 0.0f;
                if (var21) {
                    throw null;
                }
            } else {
                v5 = var1_4.trailTurbulence.getValue();
            }
            if (var5_7) {
                v6 = 0.0f;
                if (var21) {
                    throw null;
                }
            } else {
                v6 = var1_4.trailFlicker.getValue();
            }
            on.writeUniforms(on.smoothSway, on.smoothRise, var12_14 /* !! */ , var6_8, on.smoothDt, v5, v6, (float)on.width / 2.0f, (float)on.height / 2.0f, var1_4.getPrimaryColor(), var1_4.getSecondaryColor(), var1_4.isItemColorMode(), var5_7);
            if (var19_2 || var19_2) ** GOTO lbl6
            var13_16 = on.ksmz("ksqu", ksmw(int ), (int)86) - on.readIndex;
            if (var19_2 || var19_2) ** GOTO lbl6
            var14_17 = RenderSystem.getSamplerCache().method_75294(FilterMode.LINEAR);
            if (var19_2 || var19_2) ** GOTO lbl6
            var15_18 = RenderSystem.getDevice().createCommandEncoder();
            if (var19_2 || var19_2) ** GOTO lbl6
            var15_18.writeToBuffer(on.uniformBuffer.slice(), on.uniformData);
            if (var19_2 || var19_2) ** GOTO lbl6
            var16_19 = var15_18.createRenderPass((Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$endFrame$2(), ()Ljava/lang/String;)(), on.trailViews[var13_16], OptionalInt.of((int)on.ksmz("ksqv", ksmw(int ), (int)87)));
            if (var19_2) ** GOTO lbl6
            try {
                if (var19_2) ** GOTO lbl6
                var16_19.setPipeline(on.FADE_PIPELINE);
                if (var19_2 || var19_2) ** GOTO lbl6
                var16_19.setVertexBuffer((int)on.ksmz("ksqw", ksmw(int ), (int)88), on.dummyVertexBuffer);
                if (var19_2 || var19_2) ** GOTO lbl6
                var16_19.bindTexture("Sampler0", on.trailViews[on.readIndex], var14_17);
                if (var19_2 || var19_2) ** GOTO lbl6
                var16_19.setUniform("TrailData", on.uniformBuffer.slice());
                if (var19_2 || var19_2) ** GOTO lbl6
                var16_19.draw((int)on.ksmz("ksqx", ksmw(int ), (int)89), (int)on.ksmz("ksqy", ksmw(int ), (int)90));
                if (var19_2 || var19_2) ** GOTO lbl6
                if (var16_19 == null) ** GOTO lbl248
                if (var19_2) ** GOTO lbl6
            }
            catch (Throwable var17_20) {
                if (var19_2) ** GOTO lbl6
                if (var16_19 == null) ** GOTO lbl241
                if (var19_2) ** GOTO lbl6
                try {
                    if (var19_2) ** GOTO lbl6
                    var16_19.close();
                    if (var19_2 || var19_2) ** GOTO lbl6
                    ** if (!var21) goto lbl-1000
                }
                catch (Throwable var18_22) {
                    if (var19_2) ** GOTO lbl6
                    var17_20.addSuppressed(var18_22);
                    if (var19_2) ** GOTO lbl6
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
lbl241:
                // 3 sources

                if (var19_2 || var19_2) ** GOTO lbl6
                throw var17_20;
            }
            var16_19.close();
            if (var19_2) ** GOTO lbl6
            if (var21) {
                throw null;
            }
lbl248:
            // 3 sources

            if (var19_2 || var19_2) ** GOTO lbl6
            var16_19 = var15_18.createRenderPass((Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$endFrame$3(), ()Ljava/lang/String;)(), on.trailViews[var13_16], OptionalInt.empty());
            if (var19_2) ** GOTO lbl6
            try {
                if (var19_2) ** GOTO lbl6
                var16_19.setPipeline(on.BLEND_PIPELINE);
                if (var19_2 || var19_2) ** GOTO lbl6
                var16_19.setVertexBuffer((int)on.ksmz("ksqz", ksmw(int ), (int)91), on.dummyVertexBuffer);
                if (var19_2 || var19_2) ** GOTO lbl6
                var16_19.bindTexture("Sampler0", on.maskFramebuffer.method_71639(), var14_17);
                if (var19_2 || var19_2) ** GOTO lbl6
                var16_19.draw((int)on.ksmz("ksra", ksmw(int ), (int)92), (int)on.ksmz("ksrb", ksmw(int ), (int)93));
                if (var19_2 || var19_2) ** GOTO lbl6
                if (var16_19 == null) ** GOTO lbl285
                if (var19_2) ** GOTO lbl6
            }
            catch (Throwable var17_21) {
                if (var19_2) ** GOTO lbl6
                if (var16_19 == null) ** GOTO lbl278
                if (var19_2) ** GOTO lbl6
                try {
                    if (var19_2) ** GOTO lbl6
                    var16_19.close();
                    if (var19_2 || var19_2) ** GOTO lbl6
                    ** if (!var21) goto lbl-1000
                }
                catch (Throwable var18_23) {
                    if (var19_2) ** GOTO lbl6
                    var17_21.addSuppressed(var18_23);
                    if (var19_2) ** GOTO lbl6
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
lbl278:
                // 3 sources

                if (var19_2 || var19_2) ** GOTO lbl6
                throw var17_21;
            }
            var16_19.close();
            if (var19_2) ** GOTO lbl6
            if (var21) {
                throw null;
            }
lbl285:
            // 3 sources

            if (var19_2 || var19_2) ** GOTO lbl6
            on.readIndex = (int)var13_16;
            if (!var19_2 && !var19_2) ** break;
            ** continue;
            return;
lbl290:
            // 2 sources

            case 0: {
                var20_1 /* !! */  = (int)on.ksmz("ksrc", ksmw(int ), (int)94);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl1025
            }
lbl295:
            // 2 sources

            case 1: {
                var20_1 /* !! */  = (int)on.ksmz("ksrd", ksmw(int ), (int)95);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl813
            }
lbl300:
            // 2 sources

            case 2: {
                var20_1 /* !! */  = (int)on.ksmz("ksre", ksmw(int ), (int)96);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl393
            }
            case 3: {
                var20_1 /* !! */  = (int)on.ksmz("ksrf", ksmw(int ), (int)97);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl506
            }
lbl310:
            // 3 sources

            case 4: {
                var20_1 /* !! */  = (int)on.ksmz("ksrg", ksmw(int ), (int)98);
                if (var21) {
                    throw null;
                }
            }
lbl314:
            // 6 sources

            case 5: {
                var20_1 /* !! */  = (int)on.ksmz("ksrh", ksmw(int ), (int)99);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl954
            }
lbl319:
            // 3 sources

            case 6: {
                var20_1 /* !! */  = (int)on.ksmz("ksri", ksmw(int ), (int)100);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl799
            }
            case 7: {
                var20_1 /* !! */  = (int)on.ksmz("ksrj", ksmw(int ), (int)101);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl808
            }
lbl329:
            // 3 sources

            case 8: {
                var20_1 /* !! */  = (int)on.ksmz("ksrk", ksmw(int ), (int)102);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl549
            }
lbl334:
            // 2 sources

            case 9: {
                var20_1 /* !! */  = (int)on.ksmz("ksrl", ksmw(int ), (int)103);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl596
            }
lbl339:
            // 2 sources

            case 10: {
                var20_1 /* !! */  = (int)on.ksmz("ksrm", ksmw(int ), (int)104);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl554
            }
            case 11: {
                var20_1 /* !! */  = (int)on.ksmz("ksrn", ksmw(int ), (int)105);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl962
            }
lbl349:
            // 2 sources

            case 12: {
                var20_1 /* !! */  = (int)on.ksmz("ksro", ksmw(int ), (int)106);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl549
            }
            case 13: {
                var20_1 /* !! */  = (int)on.ksmz("ksrp", ksmw(int ), (int)107);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl1037
            }
lbl359:
            // 5 sources

            case 14: {
                var20_1 /* !! */  = (int)on.ksmz("ksrq", ksmw(int ), (int)108);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl476
            }
            case 15: {
                var20_1 /* !! */  = (int)on.ksmz("ksrr", ksmw(int ), (int)109);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl924
            }
lbl369:
            // 2 sources

            case 16: {
                var20_1 /* !! */  = (int)on.ksmz("ksrs", ksmw(int ), (int)110);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl1020
            }
lbl374:
            // 4 sources

            case 17: {
                var20_1 /* !! */  = (int)on.ksmz("ksrt", ksmw(int ), (int)111);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl876
            }
            case 18: {
                var20_1 /* !! */  = (int)on.ksmz("ksru", ksmw(int ), (int)112);
                if (!var21) ** GOTO lbl339
                throw null;
            }
lbl383:
            // 3 sources

            case 19: {
                var20_1 /* !! */  = (int)on.ksmz("ksrv", ksmw(int ), (int)113);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl720
            }
lbl388:
            // 2 sources

            case 20: {
                var20_1 /* !! */  = (int)on.ksmz("ksrw", ksmw(int ), (int)114);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl856
            }
lbl393:
            // 2 sources

            case 21: {
                var20_1 /* !! */  = (int)on.ksmz("ksrx", ksmw(int ), (int)115);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl423
            }
            case 22: {
                var20_1 /* !! */  = (int)on.ksmz("ksry", ksmw(int ), (int)116);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl742
            }
            case 23: {
                var20_1 /* !! */  = (int)on.ksmz("ksrz", ksmw(int ), (int)117);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl868
            }
            case 24: {
                var20_1 /* !! */  = (int)on.ksmz("kssa", ksmw(int ), (int)118);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl720
            }
lbl413:
            // 2 sources

            case 25: {
                var20_1 /* !! */  = (int)on.ksmz("kssb", ksmw(int ), (int)119);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl1119
            }
lbl418:
            // 2 sources

            case 26: {
                var20_1 /* !! */  = (int)on.ksmz("kssc", ksmw(int ), (int)120);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl808
            }
lbl423:
            // 3 sources

            case 27: {
                var20_1 /* !! */  = (int)on.ksmz("kssd", ksmw(int ), (int)121);
                if (!var21) ** GOTO lbl329
                throw null;
            }
lbl427:
            // 2 sources

            case 28: {
                var20_1 /* !! */  = (int)on.ksmz("ksse", ksmw(int ), (int)122);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl911
            }
            case 29: {
                var20_1 /* !! */  = (int)on.ksmz("kssf", ksmw(int ), (int)123);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl975
            }
            case 30: {
                var20_1 /* !! */  = (int)on.ksmz("kssg", ksmw(int ), (int)124);
                if (!var21) ** GOTO lbl290
                throw null;
            }
lbl441:
            // 2 sources

            case 31: {
                var20_1 /* !! */  = (int)on.ksmz("kssh", ksmw(int ), (int)125);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl645
            }
lbl446:
            // 2 sources

            case 32: {
                var20_1 /* !! */  = (int)on.ksmz("kssi", ksmw(int ), (int)126);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl776
            }
            case 33: {
                var20_1 /* !! */  = (int)on.ksmz("kssj", ksmw(int ), (int)127);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl828
            }
lbl456:
            // 3 sources

            case 34: {
                var20_1 /* !! */  = (int)on.ksmz("kssk", ksmw(int ), (int)128);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl992
            }
lbl461:
            // 2 sources

            case 35: {
                var20_1 /* !! */  = (int)on.ksmz("kssl", ksmw(int ), (int)129);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl587
            }
lbl466:
            // 4 sources

            case 36: {
                var20_1 /* !! */  = (int)on.ksmz("kssm", ksmw(int ), (int)130);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl677
            }
lbl471:
            // 2 sources

            case 37: {
                var20_1 /* !! */  = (int)on.ksmz("kssn", ksmw(int ), (int)131);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl587
            }
lbl476:
            // 3 sources

            case 38: {
                var20_1 /* !! */  = (int)on.ksmz("ksso", ksmw(int ), (int)132);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl577
            }
lbl481:
            // 3 sources

            case 39: {
                var20_1 /* !! */  = (int)on.ksmz("kssp", ksmw(int ), (int)133);
                if (!var21) ** GOTO lbl466
                throw null;
            }
            case 40: {
                var20_1 /* !! */  = (int)on.ksmz("kssq", ksmw(int ), (int)134);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl1061
            }
            case 41: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var20_1 /* !! */  = (int)on.ksmz("kssr", ksmw(int ), (int)135);
                    if (var21) {
                        throw null;
                    }
                    ** GOTO lbl672
                    break;
                }
            }
lbl496:
            // 3 sources

            case 42: {
                var20_1 /* !! */  = (int)on.ksmz("ksss", ksmw(int ), (int)136);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl898
            }
            case 43: {
                var20_1 /* !! */  = (int)on.ksmz("ksst", ksmw(int ), (int)137);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl996
            }
lbl506:
            // 3 sources

            case 44: {
                var20_1 /* !! */  = (int)on.ksmz("kssu", ksmw(int ), (int)138);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl933
            }
lbl511:
            // 3 sources

            case 45: {
                var20_1 /* !! */  = (int)on.ksmz("kssv", ksmw(int ), (int)139);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl682
            }
            case 46: {
                var20_1 /* !! */  = (int)on.ksmz("kssw", ksmw(int ), (int)140);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl808
            }
lbl521:
            // 2 sources

            case 47: {
                var20_1 /* !! */  = (int)on.ksmz("kssx", ksmw(int ), (int)141);
                if (!var21) ** GOTO lbl496
                throw null;
            }
            case 48: {
                var20_1 /* !! */  = (int)on.ksmz("kssy", ksmw(int ), (int)142);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl1119
            }
lbl530:
            // 2 sources

            case 49: {
                var20_1 /* !! */  = (int)on.ksmz("kssz", ksmw(int ), (int)143);
                if (!var21) ** GOTO lbl314
                throw null;
            }
            case 50: {
                var20_1 /* !! */  = (int)on.ksmz("ksta", ksmw(int ), (int)144);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl677
            }
lbl539:
            // 2 sources

            case 51: {
                var20_1 /* !! */  = (int)on.ksmz("kstb", ksmw(int ), (int)145);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl1107
            }
            case 52: {
                var20_1 /* !! */  = (int)on.ksmz("kstc", ksmw(int ), (int)146);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl856
            }
lbl549:
            // 3 sources

            case 53: {
                var20_1 /* !! */  = (int)on.ksmz("kstd", ksmw(int ), (int)147);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl992
            }
lbl554:
            // 2 sources

            case 54: {
                var20_1 /* !! */  = (int)on.ksmz("kste", ksmw(int ), (int)148);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl677
            }
            case 55: {
                var20_1 /* !! */  = (int)on.ksmz("kstf", ksmw(int ), (int)149);
                if (!var21) ** GOTO lbl423
                throw null;
            }
            case 56: {
                var20_1 /* !! */  = (int)on.ksmz("kstg", ksmw(int ), (int)150);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl596
            }
lbl568:
            // 2 sources

            case 57: {
                var20_1 /* !! */  = (int)on.ksmz("ksth", ksmw(int ), (int)151);
                if (!var21) ** GOTO lbl481
                throw null;
            }
lbl572:
            // 3 sources

            case 58: {
                var20_1 /* !! */  = (int)on.ksmz("ksti", ksmw(int ), (int)152);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl979
            }
lbl577:
            // 3 sources

            case 59: {
                var20_1 /* !! */  = (int)on.ksmz("kstj", ksmw(int ), (int)153);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl1057
            }
            case 60: {
                var20_1 /* !! */  = (int)on.ksmz("kstk", ksmw(int ), (int)154);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl1085
            }
lbl587:
            // 3 sources

            case 61: {
                var20_1 /* !! */  = (int)on.ksmz("kstl", ksmw(int ), (int)155);
                if (!var21) ** GOTO lbl310
                throw null;
            }
lbl591:
            // 2 sources

            case 62: {
                var20_1 /* !! */  = (int)on.ksmz("kstm", ksmw(int ), (int)156);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl958
            }
lbl596:
            // 4 sources

            case 63: {
                var20_1 /* !! */  = (int)on.ksmz("kstn", ksmw(int ), (int)157);
                if (!var21) ** GOTO lbl446
                throw null;
            }
            case 64: {
                var20_1 /* !! */  = (int)on.ksmz("ksto", ksmw(int ), (int)158);
                if (!var21) ** GOTO lbl572
                throw null;
            }
lbl604:
            // 2 sources

            case 65: {
                var20_1 /* !! */  = (int)on.ksmz("kstp", ksmw(int ), (int)159);
                if (!var21) ** GOTO lbl383
                throw null;
            }
            case 66: {
                var20_1 /* !! */  = (int)on.ksmz("kstq", ksmw(int ), (int)160);
                if (!var21) ** GOTO lbl374
                throw null;
            }
            case 67: {
                var20_1 /* !! */  = (int)on.ksmz("kstr", ksmw(int ), (int)161);
                if (!var21) ** GOTO lbl577
                throw null;
            }
lbl616:
            // 3 sources

            case 68: {
                var20_1 /* !! */  = (int)on.ksmz("ksts", ksmw(int ), (int)162);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl848
            }
lbl621:
            // 2 sources

            case 69: {
                var20_1 /* !! */  = (int)on.ksmz("kstt", ksmw(int ), (int)163);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl1119
            }
lbl626:
            // 2 sources

            case 70: {
                var20_1 /* !! */  = (int)on.ksmz("kstu", ksmw(int ), (int)164);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl742
            }
            case 71: {
                var20_1 /* !! */  = (int)on.ksmz("kstv", ksmw(int ), (int)165);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl844
            }
lbl636:
            // 2 sources

            case 72: {
                var20_1 /* !! */  = (int)on.ksmz("kstw", ksmw(int ), (int)166);
                if (!var21) ** GOTO lbl319
                throw null;
            }
            case 73: {
                var20_1 /* !! */  = (int)on.ksmz("kstx", ksmw(int ), (int)167);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl696
            }
lbl645:
            // 3 sources

            case 74: {
                var20_1 /* !! */  = (int)on.ksmz("ksty", ksmw(int ), (int)168);
                if (!var21) ** GOTO lbl511
                throw null;
            }
lbl649:
            // 2 sources

            case 75: {
                var20_1 /* !! */  = (int)on.ksmz("kstz", ksmw(int ), (int)169);
                if (!var21) ** GOTO lbl626
                throw null;
            }
            case 76: {
                var20_1 /* !! */  = (int)on.ksmz("ksua", ksmw(int ), (int)170);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl933
            }
lbl658:
            // 2 sources

            case 77: {
                var20_1 /* !! */  = (int)on.ksmz("ksub", ksmw(int ), (int)171);
                if (!var21) ** GOTO lbl383
                throw null;
            }
lbl662:
            // 2 sources

            case 78: {
                var20_1 /* !! */  = (int)on.ksmz("ksuc", ksmw(int ), (int)172);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl799
            }
            case 79: {
                var20_1 /* !! */  = (int)on.ksmz("ksud", ksmw(int ), (int)173);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl771
            }
lbl672:
            // 3 sources

            case 80: {
                var20_1 /* !! */  = (int)on.ksmz("ksue", ksmw(int ), (int)174);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl844
            }
lbl677:
            // 4 sources

            case 81: {
                var20_1 /* !! */  = (int)on.ksmz("ksuf", ksmw(int ), (int)175);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl1119
            }
lbl682:
            // 3 sources

            case 82: {
                var20_1 /* !! */  = (int)on.ksmz("ksug", ksmw(int ), (int)176);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl737
            }
lbl687:
            // 2 sources

            case 83: {
                var20_1 /* !! */  = (int)on.ksmz("ksuh", ksmw(int ), (int)177);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl1004
            }
            case 84: {
                var20_1 /* !! */  = (int)on.ksmz("ksui", ksmw(int ), (int)178);
                if (!var21) ** GOTO lbl466
                throw null;
            }
lbl696:
            // 3 sources

            case 85: {
                var20_1 /* !! */  = (int)on.ksmz("ksuj", ksmw(int ), (int)179);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl823
            }
lbl701:
            // 3 sources

            case 86: {
                var20_1 /* !! */  = (int)on.ksmz("ksuk", ksmw(int ), (int)180);
                if (!var21) ** GOTO lbl334
                throw null;
            }
            case 87: {
                var20_1 /* !! */  = (int)on.ksmz("ksul", ksmw(int ), (int)181);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl966
            }
            case 88: {
                var20_1 /* !! */  = (int)on.ksmz("ksum", ksmw(int ), (int)182);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl898
            }
lbl715:
            // 2 sources

            case 89: {
                var20_1 /* !! */  = (int)on.ksmz("ksun", ksmw(int ), (int)183);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl971
            }
lbl720:
            // 4 sources

            case 90: {
                var20_1 /* !! */  = (int)on.ksmz("ksuo", ksmw(int ), (int)184);
                if (!var21) ** GOTO lbl349
                throw null;
            }
lbl724:
            // 2 sources

            case 91: {
                var20_1 /* !! */  = (int)on.ksmz("ksup", ksmw(int ), (int)185);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl1073
            }
            case 92: {
                var20_1 /* !! */  = (int)on.ksmz("ksuq", ksmw(int ), (int)186);
                if (!var21) ** GOTO lbl658
                throw null;
            }
lbl733:
            // 2 sources

            case 93: {
                var20_1 /* !! */  = (int)on.ksmz("ksur", ksmw(int ), (int)187);
                if (!var21) ** GOTO lbl481
                throw null;
            }
lbl737:
            // 3 sources

            case 94: {
                var20_1 /* !! */  = (int)on.ksmz("ksus", ksmw(int ), (int)188);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl767
            }
lbl742:
            // 6 sources

            case 95: {
                var20_1 /* !! */  = (int)on.ksmz("ksut", ksmw(int ), (int)189);
                if (!var21) ** GOTO lbl329
                throw null;
            }
            case 96: {
                var20_1 /* !! */  = (int)on.ksmz("ksuu", ksmw(int ), (int)190);
                if (!var21) ** GOTO lbl701
                throw null;
            }
            case 97: {
                var20_1 /* !! */  = (int)on.ksmz("ksuv", ksmw(int ), (int)191);
                if (!var21) ** GOTO lbl696
                throw null;
            }
            case 98: {
                var20_1 /* !! */  = (int)on.ksmz("ksuw", ksmw(int ), (int)192);
                if (!var21) ** GOTO lbl476
                throw null;
            }
            case 99: {
                var20_1 /* !! */  = (int)on.ksmz("ksux", ksmw(int ), (int)193);
                if (!var21) ** GOTO lbl471
                throw null;
            }
lbl762:
            // 2 sources

            case 100: {
                var20_1 /* !! */  = (int)on.ksmz("ksuy", ksmw(int ), (int)194);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl1081
            }
lbl767:
            // 3 sources

            case 101: {
                var20_1 /* !! */  = (int)on.ksmz("ksuz", ksmw(int ), (int)195);
                if (!var21) ** GOTO lbl715
                throw null;
            }
lbl771:
            // 2 sources

            case 102: {
                var20_1 /* !! */  = (int)on.ksmz("ksva", ksmw(int ), (int)196);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl848
            }
lbl776:
            // 2 sources

            case 103: {
                var20_1 /* !! */  = (int)on.ksmz("ksvb", ksmw(int ), (int)197);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl1111
            }
lbl781:
            // 2 sources

            case 104: {
                var20_1 /* !! */  = (int)on.ksmz("ksvc", ksmw(int ), (int)198);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl1085
            }
lbl786:
            // 3 sources

            case 105: {
                var20_1 /* !! */  = (int)on.ksmz("ksvd", ksmw(int ), (int)199);
                if (!var21) ** GOTO lbl724
                throw null;
            }
            case 106: {
                var20_1 /* !! */  = (int)on.ksmz("ksve", ksmw(int ), (int)200);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl1045
            }
            case 107: {
                var20_1 /* !! */  = (int)on.ksmz("ksvf", ksmw(int ), (int)201);
                if (!var21) ** GOTO lbl359
                throw null;
            }
lbl799:
            // 3 sources

            case 108: {
                var20_1 /* !! */  = (int)on.ksmz("ksvg", ksmw(int ), (int)202);
                if (!var21) ** GOTO lbl310
                throw null;
            }
            case 109: {
                var20_1 /* !! */  = (int)on.ksmz("ksvh", ksmw(int ), (int)203);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl898
            }
lbl808:
            // 4 sources

            case 110: {
                var20_1 /* !! */  = (int)on.ksmz("ksvi", ksmw(int ), (int)204);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl1089
            }
lbl813:
            // 2 sources

            case 111: {
                var20_1 /* !! */  = (int)on.ksmz("ksvj", ksmw(int ), (int)205);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl880
            }
            case 112: {
                var20_1 /* !! */  = (int)on.ksmz("ksvk", ksmw(int ), (int)206);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl860
            }
lbl823:
            // 3 sources

            case 113: {
                var20_1 /* !! */  = (int)on.ksmz("ksvl", ksmw(int ), (int)207);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl924
            }
lbl828:
            // 2 sources

            case 114: {
                var20_1 /* !! */  = (int)on.ksmz("ksvm", ksmw(int ), (int)208);
                if (!var21) ** GOTO lbl359
                throw null;
            }
            case 115: {
                var20_1 /* !! */  = (int)on.ksmz("ksvn", ksmw(int ), (int)209);
                if (!var21) ** GOTO lbl496
                throw null;
            }
lbl836:
            // 3 sources

            case 116: {
                var20_1 /* !! */  = (int)on.ksmz("ksvo", ksmw(int ), (int)210);
                if (!var21) ** GOTO lbl786
                throw null;
            }
            case 117: {
                var20_1 /* !! */  = (int)on.ksmz("ksvp", ksmw(int ), (int)211);
                if (!var21) ** GOTO lbl539
                throw null;
            }
lbl844:
            // 3 sources

            case 118: {
                var20_1 /* !! */  = (int)on.ksmz("ksvq", ksmw(int ), (int)212);
                if (!var21) ** GOTO lbl300
                throw null;
            }
lbl848:
            // 3 sources

            case 119: {
                var20_1 /* !! */  = (int)on.ksmz("ksvr", ksmw(int ), (int)213);
                if (!var21) ** GOTO lbl388
                throw null;
            }
            case 120: {
                var20_1 /* !! */  = (int)on.ksmz("ksvs", ksmw(int ), (int)214);
                if (!var21) ** GOTO lbl418
                throw null;
            }
lbl856:
            // 3 sources

            case 121: {
                var20_1 /* !! */  = (int)on.ksmz("ksvt", ksmw(int ), (int)215);
                if (!var21) ** GOTO lbl511
                throw null;
            }
lbl860:
            // 3 sources

            case 122: {
                var20_1 /* !! */  = (int)on.ksmz("ksvu", ksmw(int ), (int)216);
                if (!var21) ** GOTO lbl823
                throw null;
            }
lbl864:
            // 2 sources

            case 123: {
                var20_1 /* !! */  = (int)on.ksmz("ksvv", ksmw(int ), (int)217);
                if (!var21) ** GOTO lbl466
                throw null;
            }
lbl868:
            // 2 sources

            case 124: {
                var20_1 /* !! */  = (int)on.ksmz("ksvw", ksmw(int ), (int)218);
                if (!var21) ** GOTO lbl767
                throw null;
            }
            case 125: {
                var20_1 /* !! */  = (int)on.ksmz("ksvx", ksmw(int ), (int)219);
                if (!var21) ** GOTO lbl621
                throw null;
            }
lbl876:
            // 2 sources

            case 126: {
                var20_1 /* !! */  = (int)on.ksmz("ksvy", ksmw(int ), (int)220);
                if (!var21) ** GOTO lbl701
                throw null;
            }
lbl880:
            // 2 sources

            case 127: {
                var20_1 /* !! */  = (int)on.ksmz("ksvz", ksmw(int ), (int)221);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl1037
            }
            case 128: {
                var20_1 /* !! */  = (int)on.ksmz("kswa", ksmw(int ), (int)222);
                if (!var21) ** GOTO lbl786
                throw null;
            }
lbl889:
            // 3 sources

            case 129: {
                var20_1 /* !! */  = (int)on.ksmz("kswb", ksmw(int ), (int)223);
                if (!var21) ** GOTO lbl733
                throw null;
            }
lbl893:
            // 2 sources

            case 130: {
                var20_1 /* !! */  = (int)on.ksmz("kswc", ksmw(int ), (int)224);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl1008
            }
lbl898:
            // 4 sources

            case 131: {
                var20_1 /* !! */  = (int)on.ksmz("kswd", ksmw(int ), (int)225);
                if (!var21) ** GOTO lbl720
                throw null;
            }
lbl902:
            // 2 sources

            case 132: {
                var20_1 /* !! */  = (int)on.ksmz("kswe", ksmw(int ), (int)226);
                if (!var21) ** GOTO lbl314
                throw null;
            }
            case 133: {
                var20_1 /* !! */  = (int)on.ksmz("kswf", ksmw(int ), (int)227);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl938
            }
lbl911:
            // 4 sources

            case 134: {
                var20_1 /* !! */  = (int)on.ksmz("kswg", ksmw(int ), (int)228);
                if (!var21) ** GOTO lbl682
                throw null;
            }
            case 135: {
                var20_1 /* !! */  = (int)on.ksmz("kswh", ksmw(int ), (int)229);
                if (!var21) ** GOTO lbl742
                throw null;
            }
            case 136: {
                var20_1 /* !! */  = (int)on.ksmz("kswi", ksmw(int ), (int)230);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl1139
            }
lbl924:
            // 3 sources

            case 137: {
                var20_1 /* !! */  = (int)on.ksmz("kswj", ksmw(int ), (int)231);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl1151
            }
lbl929:
            // 3 sources

            case 138: {
                var20_1 /* !! */  = (int)on.ksmz("kswk", ksmw(int ), (int)232);
                if (!var21) ** GOTO lbl572
                throw null;
            }
lbl933:
            // 3 sources

            case 139: {
                var20_1 /* !! */  = (int)on.ksmz("kswl", ksmw(int ), (int)233);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl1073
            }
lbl938:
            // 3 sources

            case 140: {
                var20_1 /* !! */  = (int)on.ksmz("kswm", ksmw(int ), (int)234);
                if (!var21) ** GOTO lbl781
                throw null;
            }
            case 141: {
                var20_1 /* !! */  = (int)on.ksmz("kswn", ksmw(int ), (int)235);
                if (!var21) ** GOTO lbl836
                throw null;
            }
            case 142: {
                var20_1 /* !! */  = (int)on.ksmz("kswo", ksmw(int ), (int)236);
                if (!var21) ** GOTO lbl616
                throw null;
            }
            case 143: {
                var20_1 /* !! */  = (int)on.ksmz("kswp", ksmw(int ), (int)237);
                if (!var21) ** GOTO lbl616
                throw null;
            }
lbl954:
            // 5 sources

            case 144: {
                var20_1 /* !! */  = (int)on.ksmz("kswq", ksmw(int ), (int)238);
                if (!var21) ** GOTO lbl359
                throw null;
            }
lbl958:
            // 2 sources

            case 145: {
                var20_1 /* !! */  = (int)on.ksmz("kswr", ksmw(int ), (int)239);
                if (!var21) ** GOTO lbl427
                throw null;
            }
lbl962:
            // 2 sources

            case 146: {
                var20_1 /* !! */  = (int)on.ksmz("ksws", ksmw(int ), (int)240);
                if (!var21) ** GOTO lbl374
                throw null;
            }
lbl966:
            // 2 sources

            case 147: {
                var20_1 /* !! */  = (int)on.ksmz("kswt", ksmw(int ), (int)241);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl992
            }
lbl971:
            // 2 sources

            case 148: {
                var20_1 /* !! */  = (int)on.ksmz("kswu", ksmw(int ), (int)242);
                if (!var21) ** GOTO lbl645
                throw null;
            }
lbl975:
            // 2 sources

            case 149: {
                var20_1 /* !! */  = (int)on.ksmz("kswv", ksmw(int ), (int)243);
                if (!var21) ** GOTO lbl742
                throw null;
            }
lbl979:
            // 2 sources

            case 150: {
                var20_1 /* !! */  = (int)on.ksmz("ksww", ksmw(int ), (int)244);
                if (!var21) ** GOTO lbl929
                throw null;
            }
            case 151: {
                var20_1 /* !! */  = (int)on.ksmz("kswx", ksmw(int ), (int)245);
                if (!var21) ** GOTO lbl369
                throw null;
            }
            case 152: {
                var20_1 /* !! */  = (int)on.ksmz("kswy", ksmw(int ), (int)246);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl1033
            }
lbl992:
            // 4 sources

            case 153: {
                var20_1 /* !! */  = (int)on.ksmz("kswz", ksmw(int ), (int)247);
                if (!var21) ** GOTO lbl929
                throw null;
            }
lbl996:
            // 2 sources

            case 154: {
                var20_1 /* !! */  = (int)on.ksmz("ksxa", ksmw(int ), (int)248);
                if (!var21) ** GOTO lbl902
                throw null;
            }
            case 155: {
                var20_1 /* !! */  = (int)on.ksmz("ksxb", ksmw(int ), (int)249);
                if (!var21) ** GOTO lbl938
                throw null;
            }
lbl1004:
            // 2 sources

            case 156: {
                var20_1 /* !! */  = (int)on.ksmz("ksxc", ksmw(int ), (int)250);
                if (!var21) ** GOTO lbl860
                throw null;
            }
lbl1008:
            // 2 sources

            case 157: {
                var20_1 /* !! */  = (int)on.ksmz("ksxd", ksmw(int ), (int)251);
                if (!var21) ** GOTO lbl636
                throw null;
            }
            case 158: {
                var20_1 /* !! */  = (int)on.ksmz("ksxe", ksmw(int ), (int)252);
                if (!var21) ** GOTO lbl319
                throw null;
            }
            case 159: {
                var20_1 /* !! */  = (int)on.ksmz("ksxf", ksmw(int ), (int)253);
                if (!var21) ** GOTO lbl687
                throw null;
            }
lbl1020:
            // 2 sources

            case 160: {
                var20_1 /* !! */  = (int)on.ksmz("ksxg", ksmw(int ), (int)254);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl1147
            }
lbl1025:
            // 2 sources

            case 161: {
                var20_1 /* !! */  = (int)on.ksmz("ksxh", ksmw(int ), (int)255);
                if (!var21) ** GOTO lbl742
                throw null;
            }
            case 162: {
                var20_1 /* !! */  = (int)on.ksmz("ksxi", ksmw(int ), (int)256);
                if (!var21) ** GOTO lbl864
                throw null;
            }
lbl1033:
            // 2 sources

            case 163: {
                var20_1 /* !! */  = (int)on.ksmz("ksxj", ksmw(int ), (int)257);
                if (!var21) ** GOTO lbl596
                throw null;
            }
lbl1037:
            // 5 sources

            case 164: {
                var20_1 /* !! */  = (int)on.ksmz("ksxk", ksmw(int ), (int)258);
                if (!var21) ** GOTO lbl374
                throw null;
            }
lbl1041:
            // 2 sources

            case 165: {
                var20_1 /* !! */  = (int)on.ksmz("ksxl", ksmw(int ), (int)259);
                if (!var21) ** GOTO lbl954
                throw null;
            }
lbl1045:
            // 2 sources

            case 166: {
                var20_1 /* !! */  = (int)on.ksmz("ksxm", ksmw(int ), (int)260);
                if (!var21) ** GOTO lbl441
                throw null;
            }
            case 167: {
                var20_1 /* !! */  = (int)on.ksmz("ksxn", ksmw(int ), (int)261);
                if (!var21) ** GOTO lbl649
                throw null;
            }
            case 168: {
                var20_1 /* !! */  = (int)on.ksmz("ksxo", ksmw(int ), (int)262);
                if (!var21) ** GOTO lbl604
                throw null;
            }
lbl1057:
            // 2 sources

            case 169: {
                var20_1 /* !! */  = (int)on.ksmz("ksxp", ksmw(int ), (int)263);
                if (!var21) ** GOTO lbl456
                throw null;
            }
lbl1061:
            // 2 sources

            case 170: {
                var20_1 /* !! */  = (int)on.ksmz("ksxq", ksmw(int ), (int)264);
                if (!var21) ** GOTO lbl911
                throw null;
            }
            case 171: {
                var20_1 /* !! */  = (int)on.ksmz("ksxr", ksmw(int ), (int)265);
                if (!var21) ** GOTO lbl359
                throw null;
            }
            case 172: {
                var20_1 /* !! */  = (int)on.ksmz("ksxs", ksmw(int ), (int)266);
                if (!var21) ** GOTO lbl413
                throw null;
            }
lbl1073:
            // 3 sources

            case 173: {
                var20_1 /* !! */  = (int)on.ksmz("ksxt", ksmw(int ), (int)267);
                if (!var21) ** GOTO lbl1037
                throw null;
            }
            case 174: {
                var20_1 /* !! */  = (int)on.ksmz("ksxu", ksmw(int ), (int)268);
                if (!var21) ** GOTO lbl530
                throw null;
            }
lbl1081:
            // 2 sources

            case 175: {
                var20_1 /* !! */  = (int)on.ksmz("ksxv", ksmw(int ), (int)269);
                if (!var21) ** GOTO lbl1037
                throw null;
            }
lbl1085:
            // 3 sources

            case 176: {
                var20_1 /* !! */  = (int)on.ksmz("ksxw", ksmw(int ), (int)270);
                if (!var21) ** GOTO lbl954
                throw null;
            }
lbl1089:
            // 2 sources

            case 177: {
                var20_1 /* !! */  = (int)on.ksmz("ksxx", ksmw(int ), (int)271);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl1107
            }
            case 178: {
                var20_1 /* !! */  = (int)on.ksmz("ksxy", ksmw(int ), (int)272);
                if (!var21) ** GOTO lbl836
                throw null;
            }
            case 179: {
                var20_1 /* !! */  = (int)on.ksmz("ksxz", ksmw(int ), (int)273);
                if (var21) {
                    throw null;
                }
                ** GOTO lbl1151
            }
            case 180: {
                var20_1 /* !! */  = (int)on.ksmz("ksya", ksmw(int ), (int)274);
                if (!var21) ** GOTO lbl568
                throw null;
            }
lbl1107:
            // 3 sources

            case 181: {
                var20_1 /* !! */  = (int)on.ksmz("ksyb", ksmw(int ), (int)275);
                if (!var21) ** GOTO lbl662
                throw null;
            }
lbl1111:
            // 2 sources

            case 182: {
                var20_1 /* !! */  = (int)on.ksmz("ksyc", ksmw(int ), (int)276);
                if (!var21) ** GOTO lbl954
                throw null;
            }
            case 183: {
                var20_1 /* !! */  = (int)on.ksmz("ksyd", ksmw(int ), (int)277);
                if (!var21) ** GOTO lbl521
                throw null;
            }
lbl1119:
            // 5 sources

            case 184: {
                var20_1 /* !! */  = (int)on.ksmz("ksye", ksmw(int ), (int)278);
                if (!var21) ** GOTO lbl889
                throw null;
            }
            case 185: {
                var20_1 /* !! */  = (int)on.ksmz("ksyf", ksmw(int ), (int)279);
                if (!var21) ** GOTO lbl893
                throw null;
            }
            case 186: {
                var20_1 /* !! */  = (int)on.ksmz("ksyg", ksmw(int ), (int)280);
                if (!var21) ** GOTO lbl672
                throw null;
            }
            case 187: {
                var20_1 /* !! */  = (int)on.ksmz("ksyh", ksmw(int ), (int)281);
                if (!var21) ** GOTO lbl762
                throw null;
            }
            case 188: {
                var20_1 /* !! */  = (int)on.ksmz("ksyi", ksmw(int ), (int)282);
                if (!var21) ** GOTO lbl591
                throw null;
            }
lbl1139:
            // 2 sources

            case 189: {
                var20_1 /* !! */  = (int)on.ksmz("ksyj", ksmw(int ), (int)283);
                if (!var21) ** GOTO lbl889
                throw null;
            }
            case 190: {
                var20_1 /* !! */  = (int)on.ksmz("ksyk", ksmw(int ), (int)284);
                if (!var21) ** GOTO lbl506
                throw null;
            }
lbl1147:
            // 2 sources

            case 191: {
                var20_1 /* !! */  = (int)on.ksmz("ksyl", ksmw(int ), (int)285);
                if (!var21) ** GOTO lbl314
                throw null;
            }
lbl1151:
            // 3 sources

            case 192: {
                var20_1 /* !! */  = (int)on.ksmz("ksym", ksmw(int ), (int)286);
                if (!var21) ** GOTO lbl461
                throw null;
            }
            case 193: {
                var20_1 /* !! */  = (int)on.ksmz("ksyn", ksmw(int ), (int)287);
                if (!var21) ** GOTO lbl737
                throw null;
            }
            case 194: {
                var20_1 /* !! */  = (int)on.ksmz("ksyo", ksmw(int ), (int)288);
                if (!var21) ** GOTO lbl456
                throw null;
            }
            case 195: {
                var20_1 /* !! */  = (int)on.ksmz("ksyp", ksmw(int ), (int)289);
                if (!var21) ** GOTO lbl1041
                throw null;
            }
            case 196: {
                var20_1 /* !! */  = (int)on.ksmz("ksyq", ksmw(int ), (int)290);
                if (!var21) ** GOTO lbl295
                throw null;
            }
            case 197: {
                var20_1 /* !! */  = (int)on.ksmz("ksyr", ksmw(int ), (int)291);
                if (!var21) ** GOTO lbl911
                throw null;
            }
            case 198: 
        }
        var20_1 /* !! */  = (int)on.ksmz("ksys", ksmw(int ), (int)292);
        ** while (!var21)
lbl1178:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void ensureResources(int var0, int var1_1) {
        block143: {
            block142: {
                var8_2 = on.c;
                var7_3 /* !! */  = on.b;
                var6_4 = on.a;
                if (var8_2) {
                    throw null;
lbl6:
                    // 38 sources

                    return;
                }
                if (var6_4 || var6_4) ** GOTO lbl6
                if (on.dummyVertexBuffer != null) break block142;
                if (var6_4 || var6_4) ** GOTO lbl6
                var2_5 = MemoryUtil.memAlloc((int)on.ksmz("ktae", ksmw(int ), (int)330));
                if (var6_4 || var6_4) ** GOTO lbl6
                var2_5.putInt((int)on.ksmz("ktaf", ksmw(int ), (int)331)).flip();
                if (var6_4 || var6_4) ** GOTO lbl6
                on.dummyVertexBuffer = RenderSystem.getDevice().createBuffer((Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$ensureResources$5(), ()Ljava/lang/String;)(), (int)on.ksmz("ktag", ksmw(int ), (int)332), var2_5);
                if (var6_4 || var6_4) ** GOTO lbl6
                MemoryUtil.memFree((Buffer)var2_5);
                if (var6_4 || var6_4) ** GOTO lbl6
                on.uniformBuffer = RenderSystem.getDevice().createBuffer((Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$ensureResources$6(), ()Ljava/lang/String;)(), (int)on.ksmz("ktah", ksmw(int ), (int)333), (long)on.ksmz("ktai", ksnd(int ), (int)8));
                if (var6_4 || var6_4) ** GOTO lbl6
                on.uniformData = MemoryUtil.memAlloc((int)on.ksmz("ktaj", ksmw(int ), (int)334));
                if (var6_4) ** GOTO lbl6
            }
            if (var6_4 || var6_4) ** GOTO lbl6
            if (on.maskFramebuffer == null) break block143;
            if (var6_4) ** GOTO lbl6
            if (on.width != var0) break block143;
            if (var6_4) ** GOTO lbl6
            if (on.height != var1_1) break block143;
            if (var6_4 || var6_4) ** GOTO lbl6
            return;
        }
        if (var6_4 || var6_4) ** GOTO lbl6
        on.releaseTextures();
        if (var6_4 || var6_4) ** GOTO lbl6
        on.width = var0;
        if (var6_4 || var6_4) ** GOTO lbl6
        on.height = var1_1;
        if (var6_4 || var6_4) ** GOTO lbl6
        on.maskFramebuffer = new class_6367("phobia_shader_hands_mask", on.width, on.height, (boolean)on.ksmz("ktak", ksmw(int ), (int)335));
        if (var6_4 || var6_4) ** GOTO lbl6
        var2_6 = Math.max((int)on.ksmz("ktal", ksmw(int ), (int)336), on.width / on.ksmz("ktam", ksmw(int ), (int)337));
        if (var6_4 || var6_4) ** GOTO lbl6
        var3_7 = Math.max((int)on.ksmz("ktan", ksmw(int ), (int)338), on.height / on.ksmz("ktao", ksmw(int ), (int)339));
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_4 || var6_4) ** GOTO lbl6
                var4_8 = on.ksmz("ktap", ksmw(int ), (int)340);
                if (var6_4) ** GOTO lbl6
                do {
                    if (var6_4 || var6_4) ** GOTO lbl6
                    if (var4_8 >= on.ksmz("ktaq", ksmw(int ), (int)341)) ** GOTO lbl66
                    if (var6_4 || var6_4) ** GOTO lbl6
                    var5_9 = var4_8;
                    if (var6_4 || var6_4) ** GOTO lbl6
                    on.trailTextures[var4_8] = RenderSystem.getDevice().createTexture((Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$ensureResources$7(int ), ()Ljava/lang/String;)((int)var5_9), (int)on.ksmz("ktar", ksmw(int ), (int)342), TextureFormat.RGBA8, var2_6, var3_7, (int)on.ksmz("ktas", ksmw(int ), (int)343), (int)on.ksmz("ktat", ksmw(int ), (int)344));
                    if (var6_4 || var6_4) ** GOTO lbl6
                    on.trailViews[var4_8] = RenderSystem.getDevice().createTextureView(on.trailTextures[var4_8]);
                    if (var6_4 || var6_4) ** GOTO lbl6
                    ++var4_8;
                    if (var6_4) ** GOTO lbl6
                } while (!var8_2);
                throw null;
lbl66:
                // 1 sources

                if (var6_4 || var6_4) ** GOTO lbl6
                on.clearTrailTextures();
                if (var6_4 || var6_4) ** GOTO lbl6
                on.readIndex = (int)on.ksmz("ktau", ksmw(int ), (int)345);
                if (var6_4 || var6_4) ** GOTO lbl6
                on.lastFrameNanos = (long)on.ksmz("ktav", ksnd(int ), (int)9);
                if (var6_4 || var6_4) ** GOTO lbl6
                on.smoothDt = (float)on.ksmz("ktaw", ksnj(int ), (int)346);
                if (var6_4 || var6_4) ** GOTO lbl6
                on.smoothRise = 0.0f;
                if (var6_4 || var6_4) ** GOTO lbl6
                on.smoothSway = 0.0f;
                if (var6_4 || var6_4) ** GOTO lbl6
                on.smoothTurnWind = 0.0f;
                if (var6_4 || var6_4) ** GOTO lbl6
                on.previousCameraYaw = (float)on.ksmz("ktax", ksnj(int ), (int)347);
                if (var6_4 || var6_4) ** GOTO lbl6
                on.smoothBurst = 0.0f;
                if (var6_4 || var6_4) ** GOTO lbl6
                on.wasSwinging = on.ksmz("ktay", ksmw(int ), (int)348);
                if (var6_4 || var6_4) ** GOTO lbl6
                on.lastSwingNanos = (long)on.ksmz("ktaz", ksnd(int ), (int)10);
                if (!var6_4 && !var6_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var7_3 /* !! */  = (int)on.ksmz("ktba", ksmw(int ), (int)349);
                if (!var8_2) break;
                throw null;
            }
lbl95:
            // 3 sources

            case 1: {
                var7_3 /* !! */  = (int)on.ksmz("ktbb", ksmw(int ), (int)350);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl108
            }
lbl100:
            // 2 sources

            case 2: {
                var7_3 /* !! */  = (int)on.ksmz("ktbc", ksmw(int ), (int)351);
                if (!var8_2) ** GOTO lbl95
                throw null;
            }
lbl104:
            // 2 sources

            case 3: {
                var7_3 /* !! */  = (int)on.ksmz("ktbd", ksmw(int ), (int)352);
                if (!var8_2) ** GOTO lbl95
                throw null;
            }
lbl108:
            // 3 sources

            case 4: {
                var7_3 /* !! */  = (int)on.ksmz("ktbe", ksmw(int ), (int)353);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl262
            }
lbl113:
            // 2 sources

            case 5: {
                var7_3 /* !! */  = (int)on.ksmz("ktbf", ksmw(int ), (int)354);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl373
            }
lbl118:
            // 5 sources

            case 6: {
                var7_3 /* !! */  = (int)on.ksmz("ktbg", ksmw(int ), (int)355);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl123:
            // 2 sources

            case 7: {
                var7_3 /* !! */  = (int)on.ksmz("ktbh", ksmw(int ), (int)356);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl231
            }
            case 8: {
                var7_3 /* !! */  = (int)on.ksmz("ktbi", ksmw(int ), (int)357);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl401
            }
lbl133:
            // 2 sources

            case 9: {
                var7_3 /* !! */  = (int)on.ksmz("ktbj", ksmw(int ), (int)358);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl138:
            // 2 sources

            case 10: {
                var7_3 /* !! */  = (int)on.ksmz("ktbk", ksmw(int ), (int)359);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl143:
            // 2 sources

            case 11: {
                var7_3 /* !! */  = (int)on.ksmz("ktbl", ksmw(int ), (int)360);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl262
            }
lbl148:
            // 4 sources

            case 12: {
                var7_3 /* !! */  = (int)on.ksmz("ktbm", ksmw(int ), (int)361);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl305
            }
lbl153:
            // 2 sources

            case 13: {
                var7_3 /* !! */  = (int)on.ksmz("ktbn", ksmw(int ), (int)362);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl158:
            // 2 sources

            case 14: {
                var7_3 /* !! */  = (int)on.ksmz("ktbo", ksmw(int ), (int)363);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl296
            }
lbl163:
            // 2 sources

            case 15: {
                var7_3 /* !! */  = (int)on.ksmz("ktbp", ksmw(int ), (int)364);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl326
            }
lbl168:
            // 2 sources

            case 16: {
                var7_3 /* !! */  = (int)on.ksmz("ktbq", ksmw(int ), (int)365);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl186
            }
            case 17: {
                var7_3 /* !! */  = (int)on.ksmz("ktbr", ksmw(int ), (int)366);
                if (!var8_2) ** GOTO lbl123
                throw null;
            }
            case 18: {
                var7_3 /* !! */  = (int)on.ksmz("ktbs", ksmw(int ), (int)367);
                if (!var8_2) ** GOTO lbl118
                throw null;
            }
lbl181:
            // 3 sources

            case 19: {
                var7_3 /* !! */  = (int)on.ksmz("ktbt", ksmw(int ), (int)368);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl262
            }
lbl186:
            // 2 sources

            case 20: {
                var7_3 /* !! */  = (int)on.ksmz("ktbu", ksmw(int ), (int)369);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl409
            }
lbl191:
            // 3 sources

            case 21: {
                var7_3 /* !! */  = (int)on.ksmz("ktbv", ksmw(int ), (int)370);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl397
            }
            case 22: {
                var7_3 /* !! */  = (int)on.ksmz("ktbw", ksmw(int ), (int)371);
                if (!var8_2) ** GOTO lbl163
                throw null;
            }
            case 23: {
                var7_3 /* !! */  = (int)on.ksmz("ktbx", ksmw(int ), (int)372);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl301
            }
            case 24: {
                var7_3 /* !! */  = (int)on.ksmz("ktby", ksmw(int ), (int)373);
                if (!var8_2) ** GOTO lbl118
                throw null;
            }
            case 25: {
                var7_3 /* !! */  = (int)on.ksmz("ktbz", ksmw(int ), (int)374);
                if (!var8_2) ** GOTO lbl133
                throw null;
            }
            case 26: {
                var7_3 /* !! */  = (int)on.ksmz("ktca", ksmw(int ), (int)375);
                if (!var8_2) ** GOTO lbl143
                throw null;
            }
lbl217:
            // 4 sources

            case 27: {
                var7_3 /* !! */  = (int)on.ksmz("ktcb", ksmw(int ), (int)376);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl365
            }
            case 28: {
                var7_3 /* !! */  = (int)on.ksmz("ktcc", ksmw(int ), (int)377);
                if (!var8_2) ** GOTO lbl217
                throw null;
            }
lbl226:
            // 5 sources

            case 29: {
                var7_3 /* !! */  = (int)on.ksmz("ktcd", ksmw(int ), (int)378);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl272
            }
lbl231:
            // 2 sources

            case 30: {
                var7_3 /* !! */  = (int)on.ksmz("ktce", ksmw(int ), (int)379);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl360
            }
            case 31: {
                var7_3 /* !! */  = (int)on.ksmz("ktcf", ksmw(int ), (int)380);
                if (!var8_2) ** GOTO lbl118
                throw null;
            }
            case 32: {
                var7_3 /* !! */  = (int)on.ksmz("ktcg", ksmw(int ), (int)381);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl377
            }
lbl245:
            // 2 sources

            case 33: {
                var7_3 /* !! */  = (int)on.ksmz("ktch", ksmw(int ), (int)382);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl322
            }
            case 34: {
                var7_3 /* !! */  = (int)on.ksmz("ktci", ksmw(int ), (int)383);
                if (!var8_2) ** GOTO lbl191
                throw null;
            }
            case 35: {
                var7_3 /* !! */  = (int)on.ksmz("ktcj", ksmw(int ), (int)384);
                if (!var8_2) ** GOTO lbl100
                throw null;
            }
lbl258:
            // 2 sources

            case 36: {
                var7_3 /* !! */  = (int)on.ksmz("ktck", ksmw(int ), (int)385);
                if (!var8_2) ** GOTO lbl113
                throw null;
            }
lbl262:
            // 4 sources

            case 37: {
                var7_3 /* !! */  = (int)on.ksmz("ktcl", ksmw(int ), (int)386);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl342
            }
            case 38: {
                var7_3 /* !! */  = (int)on.ksmz("ktcm", ksmw(int ), (int)387);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl369
            }
lbl272:
            // 2 sources

            case 39: {
                var7_3 /* !! */  = (int)on.ksmz("ktcn", ksmw(int ), (int)388);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl365
            }
            case 40: {
                var7_3 /* !! */  = (int)on.ksmz("ktco", ksmw(int ), (int)389);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl351
            }
            case 41: {
                var7_3 /* !! */  = (int)on.ksmz("ktcp", ksmw(int ), (int)390);
                if (!var8_2) ** GOTO lbl148
                throw null;
            }
lbl286:
            // 2 sources

            case 42: {
                var7_3 /* !! */  = (int)on.ksmz("ktcq", ksmw(int ), (int)391);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl309
            }
            case 43: {
                do {
                    var7_3 /* !! */  = (int)on.ksmz("ktcr", ksmw(int ), (int)392);
                } while (!var8_2);
                throw null;
            }
lbl296:
            // 3 sources

            case 44: {
                var7_3 /* !! */  = (int)on.ksmz("ktcs", ksmw(int ), (int)393);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl330
            }
lbl301:
            // 3 sources

            case 45: {
                var7_3 /* !! */  = (int)on.ksmz("ktct", ksmw(int ), (int)394);
                if (!var8_2) ** GOTO lbl217
                throw null;
            }
lbl305:
            // 2 sources

            case 46: {
                var7_3 /* !! */  = (int)on.ksmz("ktcu", ksmw(int ), (int)395);
                if (!var8_2) ** GOTO lbl148
                throw null;
            }
lbl309:
            // 2 sources

            case 47: {
                var7_3 /* !! */  = (int)on.ksmz("ktcv", ksmw(int ), (int)396);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl381
            }
            case 48: {
                var7_3 /* !! */  = (int)on.ksmz("ktcw", ksmw(int ), (int)397);
                if (!var8_2) ** GOTO lbl258
                throw null;
            }
            case 49: {
                var7_3 /* !! */  = (int)on.ksmz("ktcx", ksmw(int ), (int)398);
                if (!var8_2) ** GOTO lbl153
                throw null;
            }
lbl322:
            // 3 sources

            case 50: {
                var7_3 /* !! */  = (int)on.ksmz("ktcy", ksmw(int ), (int)399);
                if (!var8_2) ** GOTO lbl138
                throw null;
            }
lbl326:
            // 2 sources

            case 51: {
                var7_3 /* !! */  = (int)on.ksmz("ktcz", ksmw(int ), (int)400);
                if (!var8_2) ** GOTO lbl191
                throw null;
            }
lbl330:
            // 3 sources

            case 52: {
                var7_3 /* !! */  = (int)on.ksmz("ktda", ksmw(int ), (int)401);
                if (!var8_2) ** GOTO lbl217
                throw null;
            }
lbl334:
            // 2 sources

            case 53: {
                var7_3 /* !! */  = (int)on.ksmz("ktdb", ksmw(int ), (int)402);
                if (!var8_2) ** GOTO lbl181
                throw null;
            }
            case 54: {
                var7_3 /* !! */  = (int)on.ksmz("ktdc", ksmw(int ), (int)403);
                if (!var8_2) ** GOTO lbl226
                throw null;
            }
lbl342:
            // 3 sources

            case 55: {
                var7_3 /* !! */  = (int)on.ksmz("ktdd", ksmw(int ), (int)404);
                if (!var8_2) ** GOTO lbl296
                throw null;
            }
            case 56: {
                var7_3 /* !! */  = (int)on.ksmz("ktde", ksmw(int ), (int)405);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl381
            }
lbl351:
            // 2 sources

            case 57: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_3 /* !! */  = (int)on.ksmz("ktdf", ksmw(int ), (int)406);
                    if (!var8_2) ** GOTO lbl330
                    throw null;
                }
            }
            case 58: {
                var7_3 /* !! */  = (int)on.ksmz("ktdg", ksmw(int ), (int)407);
                if (!var8_2) ** GOTO lbl104
                throw null;
            }
lbl360:
            // 2 sources

            case 59: {
                var7_3 /* !! */  = (int)on.ksmz("ktdh", ksmw(int ), (int)408);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl377
            }
lbl365:
            // 3 sources

            case 60: {
                var7_3 /* !! */  = (int)on.ksmz("ktdi", ksmw(int ), (int)409);
                if (!var8_2) ** GOTO lbl118
                throw null;
            }
lbl369:
            // 3 sources

            case 61: {
                var7_3 /* !! */  = (int)on.ksmz("ktdj", ksmw(int ), (int)410);
                if (var8_2) {
                    throw null;
                }
            }
lbl373:
            // 4 sources

            case 62: {
                var7_3 /* !! */  = (int)on.ksmz("ktdk", ksmw(int ), (int)411);
                if (!var8_2) ** GOTO lbl148
                throw null;
            }
lbl377:
            // 3 sources

            case 63: {
                var7_3 /* !! */  = (int)on.ksmz("ktdl", ksmw(int ), (int)412);
                if (!var8_2) ** GOTO lbl342
                throw null;
            }
lbl381:
            // 3 sources

            case 64: {
                var7_3 /* !! */  = (int)on.ksmz("ktdm", ksmw(int ), (int)413);
                if (!var8_2) ** GOTO lbl245
                throw null;
            }
            case 65: {
                var7_3 /* !! */  = (int)on.ksmz("ktdn", ksmw(int ), (int)414);
                if (!var8_2) ** GOTO lbl301
                throw null;
            }
            case 66: {
                var7_3 /* !! */  = (int)on.ksmz("ktdo", ksmw(int ), (int)415);
                if (!var8_2) ** GOTO lbl181
                throw null;
            }
            case 67: {
                var7_3 /* !! */  = (int)on.ksmz("ktdp", ksmw(int ), (int)416);
                if (!var8_2) ** GOTO lbl322
                throw null;
            }
lbl397:
            // 2 sources

            case 68: {
                var7_3 /* !! */  = (int)on.ksmz("ktdq", ksmw(int ), (int)417);
                if (!var8_2) ** GOTO lbl108
                throw null;
            }
lbl401:
            // 2 sources

            case 69: {
                var7_3 /* !! */  = (int)on.ksmz("ktdr", ksmw(int ), (int)418);
                if (!var8_2) ** GOTO lbl369
                throw null;
            }
            case 70: {
                var7_3 /* !! */  = (int)on.ksmz("ktds", ksmw(int ), (int)419);
                if (!var8_2) ** GOTO lbl334
                throw null;
            }
lbl409:
            // 2 sources

            case 71: {
                var7_3 /* !! */  = (int)on.ksmz("ktdt", ksmw(int ), (int)420);
                if (!var8_2) ** GOTO lbl158
                throw null;
            }
            case 72: {
                var7_3 /* !! */  = (int)on.ksmz("ktdu", ksmw(int ), (int)421);
                if (!var8_2) ** GOTO lbl286
                throw null;
            }
            case 73: 
        }
        var7_3 /* !! */  = (int)on.ksmz("ktdv", ksmw(int ), (int)422);
        ** while (!var8_2)
lbl420:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ktws() {
        on.ksmx[400] = 1615859225;
        on.ksmx[401] = 1037414046;
        on.ksmx[402] = -595544002;
        on.ksmx[403] = 1907584900;
        on.ksmx[404] = -688593005;
        on.ksmx[405] = 491595811;
        on.ksmx[406] = -1784855514;
        on.ksmx[407] = -148366572;
        on.ksmx[408] = 343981402;
        on.ksmx[409] = 136128369;
        on.ksmx[410] = -1205787936;
        on.ksmx[411] = -1868813069;
        on.ksmx[412] = -1221392440;
        on.ksmx[413] = 1613369158;
        on.ksmx[414] = -2135000469;
        on.ksmx[415] = 2076098020;
        on.ksmx[416] = 1124102009;
        on.ksmx[417] = 875659365;
        on.ksmx[418] = 950358407;
        on.ksmx[419] = -1171512154;
        on.ksmx[420] = 57023572;
        on.ksmx[421] = 1188706945;
        on.ksmx[422] = -740605587;
        on.ksmx[423] = -1225951974;
        on.ksmx[424] = -1120614420;
        on.ksmx[425] = -212371606;
        on.ksmx[426] = 720552651;
        on.ksmx[427] = 1360432810;
        on.ksmx[428] = 1152005456;
        on.ksmx[429] = 903354529;
        on.ksmx[430] = -1542002158;
        on.ksmx[431] = -1666399450;
        on.ksmx[432] = 400188098;
        on.ksmx[433] = 1306877115;
        on.ksmx[434] = -1446815779;
        on.ksmx[435] = 293022103;
        on.ksmx[436] = -1409956801;
        on.ksmx[437] = -162108681;
        on.ksmx[438] = 2006517105;
        on.ksmx[439] = 1359886586;
        on.ksmx[440] = -512875699;
        on.ksmx[441] = 1333622362;
        on.ksmx[442] = 673079704;
        on.ksmx[443] = 801892566;
        on.ksmx[444] = 2114855044;
        on.ksmx[445] = -1917286850;
        on.ksmx[446] = 1864417689;
        on.ksmx[447] = 1189902980;
        on.ksmx[448] = 1254840407;
        on.ksmx[449] = -1559923713;
        on.ksmx[450] = 589352713;
        on.ksmx[451] = 2139490920;
        on.ksmx[452] = 783660237;
        on.ksmx[453] = 489798976;
        on.ksmx[454] = -849492317;
        on.ksmx[455] = -1942614885;
        on.ksmx[456] = 165760883;
        on.ksmx[457] = 376556107;
        on.ksmx[458] = -1558861413;
        on.ksmx[459] = -969956134;
        on.ksmx[460] = 1382306054;
        on.ksmx[461] = -1623822310;
        on.ksmx[462] = 1133641832;
        on.ksmx[463] = 1751560385;
        on.ksmx[464] = 481623600;
        on.ksmx[465] = 1488168395;
        on.ksmx[466] = 615706984;
        on.ksmx[467] = -412527014;
        on.ksmx[468] = 2098069285;
        on.ksmx[469] = -1690096792;
        on.ksmx[470] = -538183954;
        on.ksmx[471] = -389950004;
        on.ksmx[472] = 900320433;
        on.ksmx[473] = 1028168862;
        on.ksmx[474] = -227519234;
        on.ksmx[475] = -265693872;
        on.ksmx[476] = 1272202837;
        on.ksmx[477] = 1271129839;
        on.ksmx[478] = -523791018;
        on.ksmx[479] = 1753100709;
        on.ksmx[480] = 145334230;
        on.ksmx[481] = -1355840787;
        on.ksmx[482] = -2109685550;
        on.ksmx[483] = -1332019595;
        on.ksmx[484] = 447842318;
        on.ksmx[485] = 1292273799;
        on.ksmx[486] = 944327126;
        on.ksmx[487] = -50936985;
        on.ksmx[488] = 339859586;
        on.ksmx[489] = -1571935297;
        on.ksmx[490] = 1277322344;
        on.ksmx[491] = 1608717534;
        on.ksmx[492] = 591464119;
        on.ksmx[493] = -77959965;
        on.ksmx[494] = -1358109402;
        on.ksmx[495] = 1376791414;
        on.ksmx[496] = -893462044;
        on.ksmx[497] = 711141062;
        on.ksmx[498] = 1261697648;
        on.ksmx[499] = 217988834;
    }

    private static /* synthetic */ void ktxa() {
        on.ksmy[400] = 1615859226;
        on.ksmy[401] = 1037414035;
        on.ksmy[402] = -595543939;
        on.ksmy[403] = 1907584944;
        on.ksmy[404] = -688592943;
        on.ksmy[405] = 491595827;
        on.ksmy[406] = -1784855493;
        on.ksmy[407] = -148366500;
        on.ksmy[408] = 343981389;
        on.ksmy[409] = 136128342;
        on.ksmy[410] = -1205787928;
        on.ksmy[411] = -1868813100;
        on.ksmy[412] = -1221392448;
        on.ksmy[413] = 1613369209;
        on.ksmy[414] = -2135000503;
        on.ksmy[415] = 2076097984;
        on.ksmy[416] = 1124101970;
        on.ksmy[417] = 875659375;
        on.ksmy[418] = 950358434;
        on.ksmy[419] = -1171512092;
        on.ksmy[420] = 57023558;
        on.ksmy[421] = 1188707001;
        on.ksmy[422] = -740605572;
        on.ksmy[423] = -1225951973;
        on.ksmy[424] = 1358420903;
        on.ksmy[425] = -212371605;
        on.ksmy[426] = -1141829758;
        on.ksmy[427] = 1360432811;
        on.ksmy[428] = 244518521;
        on.ksmy[429] = 903354528;
        on.ksmy[430] = -955828541;
        on.ksmy[431] = -1666399450;
        on.ksmy[432] = 400188099;
        on.ksmy[433] = 1417678274;
        on.ksmy[434] = -1446815779;
        on.ksmy[435] = 293022102;
        on.ksmy[436] = 1087867650;
        on.ksmy[437] = -162108682;
        on.ksmy[438] = -1124170535;
        on.ksmy[439] = 1359886587;
        on.ksmy[440] = 914681825;
        on.ksmy[441] = 1333622348;
        on.ksmy[442] = 673079692;
        on.ksmy[443] = 801892573;
        on.ksmy[444] = 2114855056;
        on.ksmy[445] = -1917286869;
        on.ksmy[446] = 1864417674;
        on.ksmy[447] = 1189902984;
        on.ksmy[448] = 1254840400;
        on.ksmy[449] = -1559923734;
        on.ksmy[450] = 589352714;
        on.ksmy[451] = 2139490920;
        on.ksmy[452] = 783660233;
        on.ksmy[453] = 489798983;
        on.ksmy[454] = -849492294;
        on.ksmy[455] = -1942614904;
        on.ksmy[456] = 165760869;
        on.ksmy[457] = 376556121;
        on.ksmy[458] = -1558861409;
        on.ksmy[459] = -969956134;
        on.ksmy[460] = 1382306064;
        on.ksmy[461] = -1623822327;
        on.ksmy[462] = 1133641854;
        on.ksmy[463] = 1751560408;
        on.ksmy[464] = 481623615;
        on.ksmy[465] = 1488168384;
        on.ksmy[466] = 615707006;
        on.ksmy[467] = -412527029;
        on.ksmy[468] = 2098069300;
        on.ksmy[469] = -1690096791;
        on.ksmy[470] = 1033398399;
        on.ksmy[471] = -389950003;
        on.ksmy[472] = 1487009354;
        on.ksmy[473] = 1028168863;
        on.ksmy[474] = 1327668435;
        on.ksmy[475] = -265693871;
        on.ksmy[476] = 476146666;
        on.ksmy[477] = 1271129838;
        on.ksmy[478] = -1180431475;
        on.ksmy[479] = 1753100708;
        on.ksmy[480] = -1597174555;
        on.ksmy[481] = -1355840788;
        on.ksmy[482] = 1026082327;
        on.ksmy[483] = -1332019596;
        on.ksmy[484] = 2116321047;
        on.ksmy[485] = 1292273798;
        on.ksmy[486] = 822336194;
        on.ksmy[487] = -50936986;
        on.ksmy[488] = -425113885;
        on.ksmy[489] = -1571935298;
        on.ksmy[490] = 69294344;
        on.ksmy[491] = 1608717531;
        on.ksmy[492] = 591464115;
        on.ksmy[493] = -77959957;
        on.ksmy[494] = -1358109407;
        on.ksmy[495] = 1376791411;
        on.ksmy[496] = -893462038;
        on.ksmy[497] = 711141062;
        on.ksmy[498] = 1261697656;
        on.ksmy[499] = 217988833;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$endFrame$3() {
        v0 /* !! */  = on.te;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - on.ksmz("kttm", ksnd(int ), (int)173));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -318106975: {
                    v1 = on.ksmz("kttn", ksnd(int ), (int)174);
                    continue block18;
                }
                case -7499124: {
                    v1 = on.ksmz("ktto", ksnd(int ), (int)175);
                    continue block18;
                }
                case 521258708: {
                    v1 = on.ksmz("kttp", ksnd(int ), (int)176);
                    continue block18;
                }
                case 1982436825: {
                    break block18;
                }
            }
            break;
        }
        var2 = on.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = on.te - on.ksmz("kttq", ksnd(int ), (int)177)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == on.ksmz("kttr", ksmw(int ), (int)667)) break;
            v2 /* !! */  = (long)on.ksmz("ktts", ksmw(int ), (int)668);
        }
        var1_1 /* !! */  = on.b;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = on.te;
                if (true) ** GOTO lbl32
                block20: while (true) {
                    v3 /* !! */  = (long)(v4 - on.ksmz("kttt", ksnd(int ), (int)178));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -814786565: {
                            v4 = on.ksmz("kttu", ksnd(int ), (int)179);
                            continue block20;
                        }
                        case 568490904: {
                            v4 = on.ksmz("kttv", ksnd(int ), (int)180);
                            continue block20;
                        }
                        case 1982436825: {
                            break block20;
                        }
                        case 2089427488: {
                            v4 = on.ksmz("kttw", ksnd(int ), (int)181);
                            continue block20;
                        }
                    }
                    break;
                }
                var0_2 = on.a;
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                return "phobia:shader_hands_trail_inject";
            }
lbl51:
            // 2 sources

            case 0: {
                do {
                    var1_1 /* !! */  = (int)on.ksmz("kttx", ksmw(int ), (int)669);
                } while (!var2);
                throw null;
            }
            case 1: {
                var1_1 /* !! */  = (int)on.ksmz("ktty", ksmw(int ), (int)670);
                if (!var2) ** GOTO lbl51
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)on.ksmz("kttz", ksmw(int ), (int)671);
                if (!var2) break;
                throw null;
            }
            case 3: 
        }
        do {
            var1_1 /* !! */  = (int)on.ksmz("ktua", ksmw(int ), (int)672);
        } while (!var2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void beginFrame() {
        block108: {
            block107: {
                block106: {
                    var8 = on.c;
                    var7_1 /* !! */  = on.b;
                    var6_2 = on.a;
                    if (var8) {
                        throw null;
lbl6:
                        // 31 sources

                        return;
                    }
                    if (var6_2 || var6_2) ** GOTO lbl6
                    var0_3 = class_310.method_1551();
                    if (var6_2 || var6_2) ** GOTO lbl6
                    if (var0_3.method_1522() != null) break block106;
                    if (var6_2 || var6_2) ** GOTO lbl6
                    return;
                }
                if (var6_2 || var6_2) ** GOTO lbl6
                var1_4 = jn.getInstance();
                if (var6_2 || var6_2) ** GOTO lbl6
                if (var1_4 == null) break block107;
                if (var6_2) ** GOTO lbl6
                if (var1_4.isTrailEnabled()) break block108;
                if (var6_2) ** GOTO lbl6
            }
            if (var6_2 || var6_2) ** GOTO lbl6
            return;
        }
        if (var6_2 || var6_2) ** GOTO lbl6
        on.ensureResources(var0_3.method_1522().field_1482, var0_3.method_1522().field_1481);
        if (var6_2 || var6_2) ** GOTO lbl6
        var2_5 = System.nanoTime();
        if (var6_2 || var6_2) ** GOTO lbl6
        if (on.lastFrameNanos == on.ksmz("ksng", ksnd(int ), (int)0)) ** GOTO lbl53
        if (var6_2) ** GOTO lbl6
        if (var2_5 - on.lastFrameNanos <= on.ksmz("ksnh", ksnd(int ), (int)1)) ** GOTO lbl53
        if (var6_2 || var6_2) ** GOTO lbl6
        on.clearTrailTextures();
        if (var6_2 || var6_2) ** GOTO lbl6
        on.lastFrameNanos = (long)on.ksmz("ksni", ksnd(int ), (int)2);
        if (var6_2 || var6_2) ** GOTO lbl6
        on.smoothRise = 0.0f;
        if (var6_2 || var6_2) ** GOTO lbl6
        on.smoothSway = 0.0f;
        if (var6_2) ** GOTO lbl6
        if (var7_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_2) ** GOTO lbl6
                on.smoothTurnWind = 0.0f;
                if (var6_2 || var6_2) ** GOTO lbl6
                on.previousCameraYaw = (float)on.ksmz("ksnk", ksnj(int ), (int)3);
                if (var6_2 || var6_2) ** GOTO lbl6
                on.smoothBurst = 0.0f;
                if (var6_2) ** GOTO lbl6
lbl53:
                // 3 sources

                if (var6_2 || var6_2) ** GOTO lbl6
                if (on.lastFrameNanos == on.ksmz("ksnl", ksnd(int ), (int)3)) ** GOTO lbl58
                if (var6_2 || var6_2) ** GOTO lbl6
                on.compositeBehindHand(var0_3);
                if (var6_2) ** GOTO lbl6
lbl58:
                // 2 sources

                if (var6_2 || var6_2) ** GOTO lbl6
                var4_6 = RenderSystem.getDevice().createCommandEncoder();
                if (var6_2 || var6_2) ** GOTO lbl6
                var5_7 = var4_6.createRenderPass((Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$beginFrame$1(), ()Ljava/lang/String;)(), on.maskFramebuffer.method_71639(), OptionalInt.of((int)on.ksmz("ksnm", ksmw(int ), (int)4)), on.maskFramebuffer.method_71640(), OptionalDouble.of(1.0));
                if (var6_2 || var6_2) ** GOTO lbl6
                if (var5_7 == null) ** GOTO lbl67
                if (var6_2) ** GOTO lbl6
                var5_7.close();
                if (var6_2) ** GOTO lbl6
lbl67:
                // 2 sources

                if (var6_2 || var6_2) ** GOTO lbl6
                on.framePrepared = on.ksmz("ksnn", ksmw(int ), (int)5);
                if (!var6_2 && !var6_2) ** break;
                ** continue;
                return;
            }
lbl72:
            // 2 sources

            case 0: {
                var7_1 /* !! */  = (int)on.ksmz("ksno", ksmw(int ), (int)6);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl314
            }
lbl77:
            // 3 sources

            case 1: {
                var7_1 /* !! */  = (int)on.ksmz("ksnp", ksmw(int ), (int)7);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl310
            }
lbl82:
            // 4 sources

            case 2: {
                var7_1 /* !! */  = (int)on.ksmz("ksnq", ksmw(int ), (int)8);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl170
            }
lbl87:
            // 2 sources

            case 3: {
                var7_1 /* !! */  = (int)on.ksmz("ksnr", ksmw(int ), (int)9);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl92:
            // 2 sources

            case 4: {
                var7_1 /* !! */  = (int)on.ksmz("ksns", ksmw(int ), (int)10);
                if (!var8) ** GOTO lbl72
                throw null;
            }
            case 5: {
                var7_1 /* !! */  = (int)on.ksmz("ksnt", ksmw(int ), (int)11);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl294
            }
lbl101:
            // 4 sources

            case 6: {
                var7_1 /* !! */  = (int)on.ksmz("ksnu", ksmw(int ), (int)12);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl286
            }
lbl106:
            // 3 sources

            case 7: {
                var7_1 /* !! */  = (int)on.ksmz("ksnv", ksmw(int ), (int)13);
                if (!var8) ** GOTO lbl82
                throw null;
            }
lbl110:
            // 2 sources

            case 8: {
                var7_1 /* !! */  = (int)on.ksmz("ksnw", ksmw(int ), (int)14);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl232
            }
lbl115:
            // 3 sources

            case 9: {
                var7_1 /* !! */  = (int)on.ksmz("ksnx", ksmw(int ), (int)15);
                if (!var8) ** GOTO lbl77
                throw null;
            }
            case 10: {
                var7_1 /* !! */  = (int)on.ksmz("ksny", ksmw(int ), (int)16);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl273
            }
            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_1 /* !! */  = (int)on.ksmz("ksnz", ksmw(int ), (int)17);
                    if (!var8) ** GOTO lbl115
                    throw null;
                }
            }
            case 12: {
                var7_1 /* !! */  = (int)on.ksmz("ksoa", ksmw(int ), (int)18);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl210
            }
            case 13: {
                var7_1 /* !! */  = (int)on.ksmz("ksob", ksmw(int ), (int)19);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl302
            }
lbl139:
            // 4 sources

            case 14: {
                var7_1 /* !! */  = (int)on.ksmz("ksoc", ksmw(int ), (int)20);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl261
            }
            case 15: {
                var7_1 /* !! */  = (int)on.ksmz("ksod", ksmw(int ), (int)21);
                if (!var8) ** GOTO lbl139
                throw null;
            }
            case 16: {
                var7_1 /* !! */  = (int)on.ksmz("ksoe", ksmw(int ), (int)22);
                if (!var8) ** GOTO lbl139
                throw null;
            }
            case 17: {
                var7_1 /* !! */  = (int)on.ksmz("ksof", ksmw(int ), (int)23);
                if (!var8) ** GOTO lbl82
                throw null;
            }
            case 18: {
                var7_1 /* !! */  = (int)on.ksmz("ksog", ksmw(int ), (int)24);
                if (!var8) ** GOTO lbl92
                throw null;
            }
            case 19: {
                var7_1 /* !! */  = (int)on.ksmz("ksoh", ksmw(int ), (int)25);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl170
            }
            case 20: {
                var7_1 /* !! */  = (int)on.ksmz("ksoi", ksmw(int ), (int)26);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl232
            }
lbl170:
            // 5 sources

            case 21: {
                var7_1 /* !! */  = (int)on.ksmz("ksoj", ksmw(int ), (int)27);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl286
            }
lbl175:
            // 2 sources

            case 22: {
                var7_1 /* !! */  = (int)on.ksmz("ksok", ksmw(int ), (int)28);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl294
            }
            case 23: {
                var7_1 /* !! */  = (int)on.ksmz("ksol", ksmw(int ), (int)29);
                if (!var8) ** GOTO lbl101
                throw null;
            }
lbl184:
            // 2 sources

            case 24: {
                var7_1 /* !! */  = (int)on.ksmz("ksom", ksmw(int ), (int)30);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl206
            }
            case 25: {
                var7_1 /* !! */  = (int)on.ksmz("kson", ksmw(int ), (int)31);
                if (!var8) ** GOTO lbl184
                throw null;
            }
lbl193:
            // 2 sources

            case 26: {
                var7_1 /* !! */  = (int)on.ksmz("ksoo", ksmw(int ), (int)32);
                if (!var8) ** GOTO lbl115
                throw null;
            }
            case 27: {
                var7_1 /* !! */  = (int)on.ksmz("ksop", ksmw(int ), (int)33);
                if (!var8) ** GOTO lbl106
                throw null;
            }
lbl201:
            // 3 sources

            case 28: {
                var7_1 /* !! */  = (int)on.ksmz("ksoq", ksmw(int ), (int)34);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl261
            }
lbl206:
            // 3 sources

            case 29: {
                var7_1 /* !! */  = (int)on.ksmz("ksor", ksmw(int ), (int)35);
                if (!var8) ** GOTO lbl101
                throw null;
            }
lbl210:
            // 3 sources

            case 30: {
                var7_1 /* !! */  = (int)on.ksmz("ksos", ksmw(int ), (int)36);
                if (!var8) ** GOTO lbl106
                throw null;
            }
            case 31: {
                var7_1 /* !! */  = (int)on.ksmz("ksot", ksmw(int ), (int)37);
                if (!var8) ** GOTO lbl77
                throw null;
            }
            case 32: {
                var7_1 /* !! */  = (int)on.ksmz("ksou", ksmw(int ), (int)38);
                if (!var8) ** GOTO lbl170
                throw null;
            }
            case 33: {
                var7_1 /* !! */  = (int)on.ksmz("ksov", ksmw(int ), (int)39);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl277
            }
            case 34: {
                do {
                    var7_1 /* !! */  = (int)on.ksmz("ksow", ksmw(int ), (int)40);
                } while (!var8);
                throw null;
            }
lbl232:
            // 3 sources

            case 35: {
                var7_1 /* !! */  = (int)on.ksmz("ksox", ksmw(int ), (int)41);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl306
            }
lbl237:
            // 2 sources

            case 36: {
                var7_1 /* !! */  = (int)on.ksmz("ksoy", ksmw(int ), (int)42);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl269
            }
            case 37: {
                var7_1 /* !! */  = (int)on.ksmz("ksoz", ksmw(int ), (int)43);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl277
            }
            case 38: {
                var7_1 /* !! */  = (int)on.ksmz("kspa", ksmw(int ), (int)44);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl286
            }
            case 39: {
                do {
                    var7_1 /* !! */  = (int)on.ksmz("kspb", ksmw(int ), (int)45);
                } while (!var8);
                throw null;
            }
            case 40: {
                var7_1 /* !! */  = (int)on.ksmz("kspc", ksmw(int ), (int)46);
                if (!var8) ** GOTO lbl82
                throw null;
            }
lbl261:
            // 3 sources

            case 41: {
                var7_1 /* !! */  = (int)on.ksmz("kspd", ksmw(int ), (int)47);
                if (!var8) ** GOTO lbl101
                throw null;
            }
            case 42: {
                var7_1 /* !! */  = (int)on.ksmz("kspe", ksmw(int ), (int)48);
                if (!var8) ** GOTO lbl110
                throw null;
            }
lbl269:
            // 3 sources

            case 43: {
                var7_1 /* !! */  = (int)on.ksmz("kspf", ksmw(int ), (int)49);
                if (!var8) ** GOTO lbl170
                throw null;
            }
lbl273:
            // 2 sources

            case 44: {
                var7_1 /* !! */  = (int)on.ksmz("kspg", ksmw(int ), (int)50);
                if (!var8) ** GOTO lbl139
                throw null;
            }
lbl277:
            // 3 sources

            case 45: {
                var7_1 /* !! */  = (int)on.ksmz("ksph", ksmw(int ), (int)51);
                if (!var8) ** GOTO lbl206
                throw null;
            }
            case 46: {
                var7_1 /* !! */  = (int)on.ksmz("kspi", ksmw(int ), (int)52);
                if (var8) {
                    throw null;
                }
                ** GOTO lbl302
            }
lbl286:
            // 4 sources

            case 47: {
                var7_1 /* !! */  = (int)on.ksmz("kspj", ksmw(int ), (int)53);
                if (!var8) ** GOTO lbl87
                throw null;
            }
            case 48: {
                var7_1 /* !! */  = (int)on.ksmz("kspk", ksmw(int ), (int)54);
                if (!var8) ** GOTO lbl237
                throw null;
            }
lbl294:
            // 3 sources

            case 49: {
                var7_1 /* !! */  = (int)on.ksmz("kspl", ksmw(int ), (int)55);
                if (!var8) ** GOTO lbl193
                throw null;
            }
            case 50: {
                var7_1 /* !! */  = (int)on.ksmz("kspm", ksmw(int ), (int)56);
                if (!var8) ** GOTO lbl210
                throw null;
            }
lbl302:
            // 3 sources

            case 51: {
                var7_1 /* !! */  = (int)on.ksmz("kspn", ksmw(int ), (int)57);
                if (!var8) ** GOTO lbl175
                throw null;
            }
lbl306:
            // 2 sources

            case 52: {
                var7_1 /* !! */  = (int)on.ksmz("kspo", ksmw(int ), (int)58);
                if (!var8) ** GOTO lbl201
                throw null;
            }
lbl310:
            // 2 sources

            case 53: {
                var7_1 /* !! */  = (int)on.ksmz("kspp", ksmw(int ), (int)59);
                if (!var8) ** GOTO lbl269
                throw null;
            }
lbl314:
            // 2 sources

            case 54: {
                do {
                    var7_1 /* !! */  = (int)on.ksmz("kspq", ksmw(int ), (int)60);
                } while (!var8);
                throw null;
            }
            case 55: 
        }
        var7_1 /* !! */  = (int)on.ksmz("kspr", ksmw(int ), (int)61);
        ** while (!var8)
lbl322:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ktwv() {
        on.ksmx[700] = -1177774427;
        on.ksmx[701] = -1000832107;
        on.ksmx[702] = 173922738;
        on.ksmx[703] = 1140352246;
        on.ksmx[704] = 497931411;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static void clearTrailTextures() {
        GpuTextureView[] gpuTextureViewArray;
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = te - on.ksmz("ktdw", ksnd(int ), (int)11)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == on.ksmz("ktdx", ksmw(int ), (int)423)) break;
            object = on.ksmz("ktdy", ksmw(int ), (int)424);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = te - on.ksmz("ktdz", ksnd(int ), (int)12)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == on.ksmz("ktea", ksmw(int ), (int)425)) break;
            object = on.ksmz("kteb", ksmw(int ), (int)426);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = te - on.ksmz("ktec", ksnd(int ), (int)13)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == on.ksmz("kted", ksmw(int ), (int)427)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = on.ksmz("ktee", ksmw(int ), (int)428);
        }
        if (bl2 || bl2) return;
        Object object = te;
        boolean bl4 = true;
        block12: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object = callSite - on.ksmz("ktef", ksnd(int ), (int)14);
            }
            switch ((int)object) {
                case -1571552707: {
                    callSite = on.ksmz("kteg", ksnd(int ), (int)15);
                    continue block12;
                }
                case 684465127: {
                    callSite = on.ksmz("kteh", ksnd(int ), (int)16);
                    continue block12;
                }
                case 1982436825: {
                    break block12;
                }
            }
            break;
        }
        GpuDevice gpuDevice = RenderSystem.getDevice();
        Object object2 = te;
        block13: while (true) {
            switch ((int)object2) {
                case -2125281396: {
                    object2 = on.ksmz("ktej", ksnd(int ), (int)18) - on.ksmz("ktei", ksnd(int ), (int)17);
                    continue block13;
                }
                case 1982436825: {
                    break block13;
                }
            }
            break;
        }
        CommandEncoder commandEncoder = gpuDevice.createCommandEncoder();
        if (bl2 || bl2) return;
        while (true) {
            long l5;
            Object object3;
            if ((object3 = (l5 = te - on.ksmz("ktek", ksnd(int ), (int)19)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object3 == on.ksmz("ktel", ksmw(int ), (int)429)) {
                gpuTextureViewArray = trailViews;
                if (bl2) return;
                break;
            }
            object3 = on.ksmz("ktem", ksmw(int ), (int)430);
        }
        int n3 = gpuTextureViewArray.length;
        if (bl2) return;
        CallSite callSite = on.ksmz("kten", ksmw(int ), (int)431);
        if (bl2) return;
        while (!bl2 && !bl2) {
            void var3_7;
            block31: {
                RenderPass renderPass;
                GpuTextureView gpuTextureView;
                block32: {
                    block29: {
                        block30: {
                            if (var3_7 >= n3) break block29;
                            if (bl2) return;
                            gpuTextureView = gpuTextureViewArray[var3_7];
                            if (bl2 || bl2) return;
                            if (gpuTextureView != null) break block30;
                            if (bl2 || bl2) return;
                            if (bl3) {
                                throw null;
                            }
                            break block31;
                        }
                        if (bl2 || bl2) return;
                        break block32;
                    }
                    if (bl2 || bl2) return;
                    return;
                }
                while (true) {
                    long l6;
                    Object object4;
                    if ((object4 = (l6 = te - on.ksmz("kteo", ksnd(int ), (int)20)) == 0L ? 0 : (l6 < 0L ? -1 : 1)) == false) continue;
                    if (object4 == on.ksmz("ktep", ksmw(int ), (int)432)) break;
                    object4 = on.ksmz("kteq", ksmw(int ), (int)433);
                }
                Supplier<String> supplier = on::lambda$clearTrailTextures$8;
                CallSite callSite2 = on.ksmz("kter", ksmw(int ), (int)434);
                while (true) {
                    long l7;
                    Object object5;
                    if ((object5 = (l7 = te - on.ksmz("ktes", ksnd(int ), (int)21)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) == false) continue;
                    if (object5 == on.ksmz("ktet", ksmw(int ), (int)435)) break;
                    object5 = on.ksmz("kteu", ksmw(int ), (int)436);
                }
                OptionalInt optionalInt = OptionalInt.of((int)callSite2);
                while (true) {
                    long l8;
                    Object object6;
                    if ((object6 = (l8 = te - on.ksmz("ktev", ksnd(int ), (int)22)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) == false) continue;
                    if (object6 == on.ksmz("ktew", ksmw(int ), (int)437)) {
                        renderPass = commandEncoder.createRenderPass(supplier, gpuTextureView, optionalInt);
                        if (bl2) return;
                        break;
                    }
                    object6 = on.ksmz("ktex", ksmw(int ), (int)438);
                }
                if (bl2) return;
                if (renderPass != null) {
                    if (bl2) return;
                    while (true) {
                        long l9;
                        Object object7;
                        if ((object7 = (l9 = te - on.ksmz("ktey", ksnd(int ), (int)23)) == 0L ? 0 : (l9 < 0L ? -1 : 1)) == false) continue;
                        if (object7 == on.ksmz("ktez", ksmw(int ), (int)439)) {
                            renderPass.close();
                            if (bl2) return;
                            break;
                        }
                        object7 = on.ksmz("ktfa", ksmw(int ), (int)440);
                    }
                }
            }
            if (bl2 || bl2) return;
            ++var3_7;
            if (bl2) return;
            if (!bl3) continue;
            throw null;
        }
    }

    private static /* synthetic */ void ktxd() {
        on.ksmy[700] = -1177774427;
        on.ksmy[701] = -1000832107;
        on.ksmy[702] = 173922738;
        on.ksmy[703] = 2138107007;
        on.ksmy[704] = 1651365011;
    }

    private static /* synthetic */ float ksnj(int n2) {
        return Float.intBitsToFloat(ksmx[n2] ^ ksmy[n2]);
    }

    private static /* synthetic */ void ktwu() {
        on.ksmx[600] = 1606964401;
        on.ksmx[601] = -353582257;
        on.ksmx[602] = -1777452833;
        on.ksmx[603] = -966495606;
        on.ksmx[604] = -1937836000;
        on.ksmx[605] = 741211818;
        on.ksmx[606] = -1665711618;
        on.ksmx[607] = 1194611629;
        on.ksmx[608] = -1963059693;
        on.ksmx[609] = 1277738816;
        on.ksmx[610] = -425270652;
        on.ksmx[611] = -1186796453;
        on.ksmx[612] = 1084371911;
        on.ksmx[613] = 1650330495;
        on.ksmx[614] = -1519787919;
        on.ksmx[615] = 334664464;
        on.ksmx[616] = -1988154043;
        on.ksmx[617] = -263482619;
        on.ksmx[618] = 637239310;
        on.ksmx[619] = -773892910;
        on.ksmx[620] = 1536012249;
        on.ksmx[621] = 1139713072;
        on.ksmx[622] = 984916204;
        on.ksmx[623] = 1034095940;
        on.ksmx[624] = -2108983744;
        on.ksmx[625] = 1890145597;
        on.ksmx[626] = 2145584038;
        on.ksmx[627] = 989189787;
        on.ksmx[628] = 856698016;
        on.ksmx[629] = -1653606614;
        on.ksmx[630] = -386448646;
        on.ksmx[631] = 1431372980;
        on.ksmx[632] = 1645419623;
        on.ksmx[633] = 653403851;
        on.ksmx[634] = 370949596;
        on.ksmx[635] = -1930813397;
        on.ksmx[636] = 20711576;
        on.ksmx[637] = 678374405;
        on.ksmx[638] = -1224234762;
        on.ksmx[639] = 1413968564;
        on.ksmx[640] = 263834647;
        on.ksmx[641] = -1160919531;
        on.ksmx[642] = 1725584219;
        on.ksmx[643] = 1787827902;
        on.ksmx[644] = -1426792133;
        on.ksmx[645] = -81653666;
        on.ksmx[646] = 197026199;
        on.ksmx[647] = 754540522;
        on.ksmx[648] = -427851085;
        on.ksmx[649] = 1492875253;
        on.ksmx[650] = -1612262597;
        on.ksmx[651] = -947714457;
        on.ksmx[652] = 1367406620;
        on.ksmx[653] = -1974431965;
        on.ksmx[654] = 957719833;
        on.ksmx[655] = -1219732020;
        on.ksmx[656] = 1245248352;
        on.ksmx[657] = -1413950026;
        on.ksmx[658] = -1025588309;
        on.ksmx[659] = 556081767;
        on.ksmx[660] = -1259567988;
        on.ksmx[661] = 1994867549;
        on.ksmx[662] = -1699742237;
        on.ksmx[663] = -753121124;
        on.ksmx[664] = 1148581246;
        on.ksmx[665] = -834006544;
        on.ksmx[666] = -339760045;
        on.ksmx[667] = -994029251;
        on.ksmx[668] = 91919939;
        on.ksmx[669] = -1219775884;
        on.ksmx[670] = -1645949865;
        on.ksmx[671] = -705624980;
        on.ksmx[672] = 133678966;
        on.ksmx[673] = -2008663456;
        on.ksmx[674] = 193003929;
        on.ksmx[675] = -2088726439;
        on.ksmx[676] = -805710851;
        on.ksmx[677] = -278187873;
        on.ksmx[678] = -273959765;
        on.ksmx[679] = 760546022;
        on.ksmx[680] = 315899788;
        on.ksmx[681] = -942362294;
        on.ksmx[682] = 1031483746;
        on.ksmx[683] = -1532712048;
        on.ksmx[684] = 283234025;
        on.ksmx[685] = 1714811254;
        on.ksmx[686] = -419955825;
        on.ksmx[687] = 1738583069;
        on.ksmx[688] = 1808399961;
        on.ksmx[689] = -722350610;
        on.ksmx[690] = -310922325;
        on.ksmx[691] = -443553176;
        on.ksmx[692] = 996089198;
        on.ksmx[693] = 151795498;
        on.ksmx[694] = -98444347;
        on.ksmx[695] = 334183447;
        on.ksmx[696] = 1811995919;
        on.ksmx[697] = -653343832;
        on.ksmx[698] = -1407208945;
        on.ksmx[699] = 1343573038;
    }

    private static /* synthetic */ void ktwz() {
        on.ksmy[300] = 1880875659;
        on.ksmy[301] = 1567400532;
        on.ksmy[302] = -19762981;
        on.ksmy[303] = 2124404929;
        on.ksmy[304] = 1213360507;
        on.ksmy[305] = 348223289;
        on.ksmy[306] = 2016591059;
        on.ksmy[307] = -1188294905;
        on.ksmy[308] = 1782118062;
        on.ksmy[309] = -405775909;
        on.ksmy[310] = -2116301767;
        on.ksmy[311] = 65866887;
        on.ksmy[312] = -1141423799;
        on.ksmy[313] = 1998301646;
        on.ksmy[314] = -1642023786;
        on.ksmy[315] = -1155846185;
        on.ksmy[316] = 1509297862;
        on.ksmy[317] = 1961071103;
        on.ksmy[318] = -1221937532;
        on.ksmy[319] = 678492702;
        on.ksmy[320] = 2138856439;
        on.ksmy[321] = 714741621;
        on.ksmy[322] = -594986929;
        on.ksmy[323] = -606593303;
        on.ksmy[324] = 872911433;
        on.ksmy[325] = -1711481032;
        on.ksmy[326] = -1745598760;
        on.ksmy[327] = 204946751;
        on.ksmy[328] = 1302023501;
        on.ksmy[329] = -1305419888;
        on.ksmy[330] = -549732164;
        on.ksmy[331] = 2017039858;
        on.ksmy[332] = -2130086796;
        on.ksmy[333] = -1102352270;
        on.ksmy[334] = -1040470758;
        on.ksmy[335] = 1500999479;
        on.ksmy[336] = 827298881;
        on.ksmy[337] = 1285174649;
        on.ksmy[338] = -1718392635;
        on.ksmy[339] = 1016883599;
        on.ksmy[340] = 164112257;
        on.ksmy[341] = 571717993;
        on.ksmy[342] = 1543902125;
        on.ksmy[343] = -1118239820;
        on.ksmy[344] = 1401575267;
        on.ksmy[345] = 1515653977;
        on.ksmy[346] = 1968521474;
        on.ksmy[347] = -220046390;
        on.ksmy[348] = -446028195;
        on.ksmy[349] = 52980035;
        on.ksmy[350] = -1146961367;
        on.ksmy[351] = 522173108;
        on.ksmy[352] = 1591432165;
        on.ksmy[353] = -1238084765;
        on.ksmy[354] = 967422979;
        on.ksmy[355] = 177930334;
        on.ksmy[356] = -1367906229;
        on.ksmy[357] = 1028590393;
        on.ksmy[358] = 1329661967;
        on.ksmy[359] = 2134487490;
        on.ksmy[360] = 2002146618;
        on.ksmy[361] = -1407519533;
        on.ksmy[362] = 70967675;
        on.ksmy[363] = 671541924;
        on.ksmy[364] = 2075773521;
        on.ksmy[365] = 1758432788;
        on.ksmy[366] = 2100427456;
        on.ksmy[367] = 53457853;
        on.ksmy[368] = 2074771444;
        on.ksmy[369] = -74961206;
        on.ksmy[370] = 1796433447;
        on.ksmy[371] = -1806658830;
        on.ksmy[372] = 1467831668;
        on.ksmy[373] = 1530279424;
        on.ksmy[374] = 73749134;
        on.ksmy[375] = -116430135;
        on.ksmy[376] = -1425429139;
        on.ksmy[377] = -1091028849;
        on.ksmy[378] = -1011951509;
        on.ksmy[379] = -1255187176;
        on.ksmy[380] = -1514230673;
        on.ksmy[381] = -1398995717;
        on.ksmy[382] = -1440673007;
        on.ksmy[383] = 1140040958;
        on.ksmy[384] = 1182481888;
        on.ksmy[385] = -1036873605;
        on.ksmy[386] = 1625426482;
        on.ksmy[387] = 1350671383;
        on.ksmy[388] = 1374094112;
        on.ksmy[389] = 770580825;
        on.ksmy[390] = -1168232540;
        on.ksmy[391] = -448700694;
        on.ksmy[392] = -2058841874;
        on.ksmy[393] = 515656316;
        on.ksmy[394] = 1074623847;
        on.ksmy[395] = -1639988058;
        on.ksmy[396] = -2135449847;
        on.ksmy[397] = -1248031677;
        on.ksmy[398] = 1684357095;
        on.ksmy[399] = -1685348850;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$clearTrailTextures$8() {
        v0 /* !! */  = on.te;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - on.ksmz("ktqq", ksnd(int ), (int)129));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1864822188: {
                    v1 = on.ksmz("ktqr", ksnd(int ), (int)130);
                    continue block17;
                }
                case 336176596: {
                    v1 = on.ksmz("ktqs", ksnd(int ), (int)131);
                    continue block17;
                }
                case 1982436825: {
                    break block17;
                }
            }
            break;
        }
        var2 = on.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = on.te - on.ksmz("ktqt", ksnd(int ), (int)132)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == on.ksmz("ktqu", ksmw(int ), (int)637)) break;
            v2 /* !! */  = (long)on.ksmz("ktqv", ksmw(int ), (int)638);
        }
        var1_1 /* !! */  = on.b;
        v3 /* !! */  = on.te;
        if (true) ** GOTO lbl26
        block19: while (true) {
            v3 /* !! */  = (long)(v4 - on.ksmz("ktqw", ksnd(int ), (int)133));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1260091716: {
                    v4 = on.ksmz("ktqx", ksnd(int ), (int)134);
                    continue block19;
                }
                case -225007065: {
                    v4 = on.ksmz("ktqy", ksnd(int ), (int)135);
                    continue block19;
                }
                case 1200641986: {
                    v4 = on.ksmz("ktqz", ksnd(int ), (int)136);
                    continue block19;
                }
                case 1982436825: {
                    break block19;
                }
            }
            break;
        }
        var0_2 = on.a;
        if (!var2) ** GOTO lbl45
        throw null;
        {
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var1_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl45:
                // 1 sources

                if (var0_2 || var0_2) continue block20;
                return "phobia:shader_hands_trail_clear";
                case 0: {
                    var1_1 /* !! */  = (int)on.ksmz("ktra", ksmw(int ), (int)639);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl56
                }
lbl52:
                // 2 sources

                case 1: {
                    var1_1 /* !! */  = (int)on.ksmz("ktrb", ksmw(int ), (int)640);
                    if (!var2) break block20;
                    throw null;
                }
lbl56:
                // 2 sources

                case 2: {
                    var1_1 /* !! */  = (int)on.ksmz("ktrc", ksmw(int ), (int)641);
                    if (!var2) ** GOTO lbl52
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var1_1 /* !! */  = (int)on.ksmz("ktrd", ksmw(int ), (int)642);
        } while (!var2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void putColor(int var0, float var1_1) {
        v0 /* !! */  = on.te;
        if (true) ** GOTO lbl5
        block46: while (true) {
            v0 /* !! */  = (long)(v1 - on.ksmz("ktjy", ksnd(int ), (int)71));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -674019665: {
                    v1 = on.ksmz("ktjz", ksnd(int ), (int)72);
                    continue block46;
                }
                case 1646676765: {
                    v1 = on.ksmz("ktka", ksnd(int ), (int)73);
                    continue block46;
                }
                case 1879636520: {
                    v1 = on.ksmz("ktkb", ksnd(int ), (int)74);
                    continue block46;
                }
                case 1982436825: {
                    break block46;
                }
            }
            break;
        }
        var4_2 = on.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = on.te - on.ksmz("ktkc", ksnd(int ), (int)75)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == on.ksmz("ktkd", ksmw(int ), (int)521)) break;
            v2 /* !! */  = (long)on.ksmz("ktke", ksmw(int ), (int)522);
        }
        var3_3 /* !! */  = on.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = on.te - on.ksmz("ktkf", ksnd(int ), (int)76)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == on.ksmz("ktkg", ksmw(int ), (int)523)) break;
            v3 /* !! */  = (long)on.ksmz("ktkh", ksmw(int ), (int)524);
        }
        var2_4 = on.a;
        if (var4_2) {
            throw null;
lbl32:
            // 5 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl32
        v4 /* !! */  = on.te;
        if (true) ** GOTO lbl39
        block50: while (true) {
            v4 /* !! */  = (long)(on.ksmz("ktkj", ksnd(int ), (int)78) - on.ksmz("ktki", ksnd(int ), (int)77));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1662842546: {
                    continue block50;
                }
                case 1982436825: {
                    break block50;
                }
            }
            break;
        }
        v5 = (float)(var0 >> on.ksmz("ktkk", ksmw(int ), (int)525) & on.ksmz("ktkl", ksmw(int ), (int)526)) / on.ksmz("ktkm", ksnj(int ), (int)527);
        v6 /* !! */  = on.te;
        if (true) ** GOTO lbl49
        block51: while (true) {
            v6 /* !! */  = (long)(v7 - on.ksmz("ktkn", ksnd(int ), (int)79));
lbl49:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -779067299: {
                    v7 = on.ksmz("ktko", ksnd(int ), (int)80);
                    continue block51;
                }
                case -57221445: {
                    v7 = on.ksmz("ktkp", ksnd(int ), (int)81);
                    continue block51;
                }
                case 875375282: {
                    v7 = on.ksmz("ktkq", ksnd(int ), (int)82);
                    continue block51;
                }
                case 1982436825: {
                    break block51;
                }
            }
            break;
        }
        on.uniformData.putFloat(v5);
        if (var2_4 || var2_4) ** GOTO lbl32
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_2 = on.te - on.ksmz("ktkr", ksnd(int ), (int)83)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == on.ksmz("ktks", ksmw(int ), (int)528)) break;
            v8 /* !! */  = (long)on.ksmz("ktkt", ksmw(int ), (int)529);
        }
        v9 = (float)(var0 >> on.ksmz("ktku", ksmw(int ), (int)530) & on.ksmz("ktkv", ksmw(int ), (int)531)) / on.ksmz("ktkw", ksnj(int ), (int)532);
        v10 /* !! */  = on.te;
        if (true) ** GOTO lbl74
        block53: while (true) {
            v10 /* !! */  = (long)(v11 - on.ksmz("ktkx", ksnd(int ), (int)84));
lbl74:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1143477271: {
                    v11 = on.ksmz("ktky", ksnd(int ), (int)85);
                    continue block53;
                }
                case -1056944141: {
                    v11 = on.ksmz("ktkz", ksnd(int ), (int)86);
                    continue block53;
                }
                case -251487708: {
                    v11 = on.ksmz("ktla", ksnd(int ), (int)87);
                    continue block53;
                }
                case 1982436825: {
                    break block53;
                }
            }
            break;
        }
        on.uniformData.putFloat(v9);
        if (var2_4 || var2_4) ** GOTO lbl32
        v12 /* !! */  = on.te;
        if (true) ** GOTO lbl93
        block54: while (true) {
            v12 /* !! */  = (long)(v13 - on.ksmz("ktlb", ksnd(int ), (int)88));
lbl93:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -1817638400: {
                    v13 = on.ksmz("ktlc", ksnd(int ), (int)89);
                    continue block54;
                }
                case -43158045: {
                    v13 = on.ksmz("ktld", ksnd(int ), (int)90);
                    continue block54;
                }
                case 259171397: {
                    v13 = on.ksmz("ktle", ksnd(int ), (int)91);
                    continue block54;
                }
                case 1982436825: {
                    break block54;
                }
            }
            break;
        }
        v14 = (float)(var0 & on.ksmz("ktlf", ksmw(int ), (int)533)) / on.ksmz("ktlg", ksnj(int ), (int)534);
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_3 = on.te - on.ksmz("ktlh", ksnd(int ), (int)92)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v15 /* !! */  == on.ksmz("ktli", ksmw(int ), (int)535)) break;
            v15 /* !! */  = (long)on.ksmz("ktlj", ksmw(int ), (int)536);
        }
        on.uniformData.putFloat(v14);
        if (var2_4 || var2_4) ** GOTO lbl32
        v16 /* !! */  = on.te;
        if (true) ** GOTO lbl117
        block56: while (true) {
            v16 /* !! */  = (long)(on.ksmz("ktll", ksnd(int ), (int)94) - on.ksmz("ktlk", ksnd(int ), (int)93));
lbl117:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case -257333700: {
                    continue block56;
                }
                case 1982436825: {
                    break block56;
                }
            }
            break;
        }
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_4 = on.te - on.ksmz("ktlm", ksnd(int ), (int)95)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == on.ksmz("ktln", ksmw(int ), (int)537)) break;
            v17 /* !! */  = (long)on.ksmz("ktlo", ksmw(int ), (int)538);
        }
        on.uniformData.putFloat(var1_1);
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)on.ksmz("ktlp", ksmw(int ), (int)539);
                if (var4_2) {
                    throw null;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)on.ksmz("ktlq", ksmw(int ), (int)540);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl177
            }
lbl142:
            // 4 sources

            case 2: {
                var3_3 /* !! */  = (int)on.ksmz("ktlr", ksmw(int ), (int)541);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl155
            }
            case 3: {
                var3_3 /* !! */  = (int)on.ksmz("ktls", ksmw(int ), (int)542);
                if (var4_2) {
                    throw null;
                }
            }
            case 4: {
                var3_3 /* !! */  = (int)on.ksmz("ktlt", ksmw(int ), (int)543);
                if (!var4_2) break;
                throw null;
            }
lbl155:
            // 3 sources

            case 5: {
                var3_3 /* !! */  = (int)on.ksmz("ktlu", ksmw(int ), (int)544);
                if (!var4_2) ** GOTO lbl142
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)on.ksmz("ktlv", ksmw(int ), (int)545);
                if (!var4_2) break;
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)on.ksmz("ktlw", ksmw(int ), (int)546);
                if (!var4_2) ** GOTO lbl155
                throw null;
            }
            case 8: {
                var3_3 /* !! */  = (int)on.ksmz("ktlx", ksmw(int ), (int)547);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl177
            }
            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)on.ksmz("ktly", ksmw(int ), (int)548);
                    if (!var4_2) ** GOTO lbl142
                    throw null;
                }
            }
lbl177:
            // 3 sources

            case 10: {
                var3_3 /* !! */  = (int)on.ksmz("ktlz", ksmw(int ), (int)549);
                if (!var4_2) ** GOTO lbl142
                throw null;
            }
            case 11: 
        }
        var3_3 /* !! */  = (int)on.ksmz("ktma", ksmw(int ), (int)550);
        ** while (!var4_2)
lbl184:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int ksmw(int n2) {
        return ksmx[n2] ^ ksmy[n2];
    }

    private static /* synthetic */ void ktww() {
        on.ksmy[0] = -1980401836;
        on.ksmy[1] = 899639677;
        on.ksmy[2] = 1477487711;
        on.ksmy[3] = 469833291;
        on.ksmy[4] = -949254615;
        on.ksmy[5] = -1677687086;
        on.ksmy[6] = -797257082;
        on.ksmy[7] = -775403404;
        on.ksmy[8] = 1268087030;
        on.ksmy[9] = 1168342866;
        on.ksmy[10] = 95216025;
        on.ksmy[11] = 342591819;
        on.ksmy[12] = -1589973401;
        on.ksmy[13] = 1821164147;
        on.ksmy[14] = -858293575;
        on.ksmy[15] = -1406181707;
        on.ksmy[16] = 1143005525;
        on.ksmy[17] = 283451861;
        on.ksmy[18] = -766276946;
        on.ksmy[19] = 1801820736;
        on.ksmy[20] = 1650311487;
        on.ksmy[21] = -2059752821;
        on.ksmy[22] = 1326006303;
        on.ksmy[23] = 1726989981;
        on.ksmy[24] = 1639231564;
        on.ksmy[25] = -742284086;
        on.ksmy[26] = 1556652853;
        on.ksmy[27] = 2070220913;
        on.ksmy[28] = 458759568;
        on.ksmy[29] = 897145565;
        on.ksmy[30] = -1130265729;
        on.ksmy[31] = -965908371;
        on.ksmy[32] = 717569934;
        on.ksmy[33] = 1063377756;
        on.ksmy[34] = -2093883371;
        on.ksmy[35] = -1360776548;
        on.ksmy[36] = 125711101;
        on.ksmy[37] = 1661938332;
        on.ksmy[38] = 1152396799;
        on.ksmy[39] = 2091259643;
        on.ksmy[40] = 830521806;
        on.ksmy[41] = -2084989079;
        on.ksmy[42] = 1726554327;
        on.ksmy[43] = 1930610510;
        on.ksmy[44] = 1236538990;
        on.ksmy[45] = 649209586;
        on.ksmy[46] = 2025773484;
        on.ksmy[47] = 1216663089;
        on.ksmy[48] = -764944568;
        on.ksmy[49] = -652391420;
        on.ksmy[50] = 1060216873;
        on.ksmy[51] = 1854847852;
        on.ksmy[52] = -1666996595;
        on.ksmy[53] = -465216133;
        on.ksmy[54] = 1574472182;
        on.ksmy[55] = 1005470092;
        on.ksmy[56] = -1381146057;
        on.ksmy[57] = 687439860;
        on.ksmy[58] = -1909279651;
        on.ksmy[59] = -820307794;
        on.ksmy[60] = 152731722;
        on.ksmy[61] = -1065027897;
        on.ksmy[62] = -1801456592;
        on.ksmy[63] = -904523724;
        on.ksmy[64] = 89792490;
        on.ksmy[65] = 298798111;
        on.ksmy[66] = -1719532712;
        on.ksmy[67] = 86712539;
        on.ksmy[68] = 1438013460;
        on.ksmy[69] = -1475394959;
        on.ksmy[70] = 679997930;
        on.ksmy[71] = -562512737;
        on.ksmy[72] = 765683373;
        on.ksmy[73] = 1540868528;
        on.ksmy[74] = -1510676418;
        on.ksmy[75] = -600819312;
        on.ksmy[76] = -712567068;
        on.ksmy[77] = -1192319089;
        on.ksmy[78] = -1985612133;
        on.ksmy[79] = 740864353;
        on.ksmy[80] = 103406854;
        on.ksmy[81] = 1895756664;
        on.ksmy[82] = 733271005;
        on.ksmy[83] = -366442387;
        on.ksmy[84] = 1536477536;
        on.ksmy[85] = -376234428;
        on.ksmy[86] = 147945796;
        on.ksmy[87] = 69273637;
        on.ksmy[88] = 630054200;
        on.ksmy[89] = -257112836;
        on.ksmy[90] = 1566051771;
        on.ksmy[91] = -707904225;
        on.ksmy[92] = 1485570944;
        on.ksmy[93] = 1974686775;
        on.ksmy[94] = -324392370;
        on.ksmy[95] = -1145919219;
        on.ksmy[96] = 179466188;
        on.ksmy[97] = -2115605101;
        on.ksmy[98] = 361578203;
        on.ksmy[99] = -85246298;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String lambda$endFrame$2() {
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = te - on.ksmz("ktub", ksnd(int ), (int)182)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == on.ksmz("ktuc", ksmw(int ), (int)673)) break;
            object = on.ksmz("ktud", ksmw(int ), (int)674);
        }
        boolean bl2 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = te - on.ksmz("ktue", ksnd(int ), (int)183)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == on.ksmz("ktuf", ksmw(int ), (int)675)) break;
            object = on.ksmz("ktug", ksmw(int ), (int)676);
        }
        int n2 = b;
        Object object = te;
        block6: while (true) {
            switch ((int)object) {
                case 830109442: {
                    object = on.ksmz("ktui", ksnd(int ), (int)185) - on.ksmz("ktuh", ksnd(int ), (int)184);
                    continue block6;
                }
                case 1982436825: {
                    break block6;
                }
            }
            break;
        }
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3 || bl3) {
            return null;
        }
        return "phobia:shader_hands_trail_fade";
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ class_276 lambda$static$0() {
        block44: {
            block43: {
                v0 /* !! */  = on.te;
                if (true) ** GOTO lbl5
                block31: while (true) {
                    v0 /* !! */  = (long)(v1 - on.ksmz("ktvb", ksnd(int ), (int)194));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -715009657: {
                            v1 = on.ksmz("ktvc", ksnd(int ), (int)195);
                            continue block31;
                        }
                        case 1065119213: {
                            v1 = on.ksmz("ktvd", ksnd(int ), (int)196);
                            continue block31;
                        }
                        case 1982436825: {
                            break block31;
                        }
                        case 2093994480: {
                            v1 = on.ksmz("ktve", ksnd(int ), (int)197);
                            continue block31;
                        }
                    }
                    break;
                }
                var2 = on.c;
                v2 /* !! */  = on.te;
                if (true) ** GOTO lbl22
                block32: while (true) {
                    v2 /* !! */  = (long)(on.ksmz("ktvg", ksnd(int ), (int)199) - on.ksmz("ktvf", ksnd(int ), (int)198));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1029284685: {
                            continue block32;
                        }
                        case 1982436825: {
                            break block32;
                        }
                    }
                    break;
                }
                var1_1 = on.b;
                v3 /* !! */  = on.te;
                if (true) ** GOTO lbl32
                block33: while (true) {
                    v3 /* !! */  = (long)(v4 - on.ksmz("ktvh", ksnd(int ), (int)200));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1691843997: {
                            v4 = on.ksmz("ktvi", ksnd(int ), (int)201);
                            continue block33;
                        }
                        case -991781895: {
                            v4 = on.ksmz("ktvj", ksnd(int ), (int)202);
                            continue block33;
                        }
                        case 1982436825: {
                            break block33;
                        }
                    }
                    break;
                }
                var0_2 = on.a;
                if (var2) {
                    throw null;
lbl44:
                    // 3 sources

                    return null;
                }
                if (var0_2 || var0_2) ** GOTO lbl44
                v5 /* !! */  = on.te;
                if (true) ** GOTO lbl51
                block35: while (true) {
                    v5 /* !! */  = (long)(v6 - on.ksmz("ktvk", ksnd(int ), (int)203));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1493108922: {
                            v6 = on.ksmz("ktvl", ksnd(int ), (int)204);
                            continue block35;
                        }
                        case -645441572: {
                            v6 = on.ksmz("ktvm", ksnd(int ), (int)205);
                            continue block35;
                        }
                        case 1982436825: {
                            break block35;
                        }
                    }
                    break;
                }
                if (on.maskFramebuffer == null) break block43;
                if (var0_2) ** GOTO lbl44
                v7 /* !! */  = on.te;
                if (true) ** GOTO lbl66
                block36: while (true) {
                    v7 /* !! */  = (long)(v8 - on.ksmz("ktvn", ksnd(int ), (int)206));
lbl66:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 226965161: {
                            v8 = on.ksmz("ktvo", ksnd(int ), (int)207);
                            continue block36;
                        }
                        case 843878394: {
                            v8 = on.ksmz("ktvp", ksnd(int ), (int)208);
                            continue block36;
                        }
                        case 1982436825: {
                            break block36;
                        }
                    }
                    break;
                }
                v9 = on.maskFramebuffer;
                if (var2) {
                    throw null;
                }
                break block44;
            }
            if (!var0_2 && !var0_2) ** break;
            ** while (true)
            v10 /* !! */  = on.te;
            if (true) ** GOTO lbl86
            block37: while (true) {
                v10 /* !! */  = (long)(v11 - on.ksmz("ktvq", ksnd(int ), (int)209));
lbl86:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -1373024271: {
                        v11 = on.ksmz("ktvr", ksnd(int ), (int)210);
                        continue block37;
                    }
                    case 786024470: {
                        v11 = on.ksmz("ktvs", ksnd(int ), (int)211);
                        continue block37;
                    }
                    case 1543808322: {
                        v11 = on.ksmz("ktvt", ksnd(int ), (int)212);
                        continue block37;
                    }
                    case 1982436825: {
                        break block37;
                    }
                }
                break;
            }
            v12 = class_310.method_1551();
            while (true) {
                if ((v13 /* !! */  = (cfr_temp_0 = on.te - on.ksmz("ktvu", ksnd(int ), (int)213)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v13 /* !! */  == on.ksmz("ktvv", ksmw(int ), (int)687)) {
                    v9 = v12.method_1522();
                    break;
                }
                v13 /* !! */  = (long)on.ksmz("ktvw", ksmw(int ), (int)688);
            }
        }
        return v9;
    }

    private static /* synthetic */ void ktxi() {
        on.ksnf[100] = -6793850723401669753L;
        on.ksnf[101] = -7326892175869279348L;
        on.ksnf[102] = 7145912105297907999L;
        on.ksnf[103] = 5740792575949808861L;
        on.ksnf[104] = -5846444504016807764L;
        on.ksnf[105] = 3430749101783090016L;
        on.ksnf[106] = -2713568708793267673L;
        on.ksnf[107] = -3872060273007546362L;
        on.ksnf[108] = -6682463736994449538L;
        on.ksnf[109] = -3674400502848554304L;
        on.ksnf[110] = -9102716185015816204L;
        on.ksnf[111] = 1738048491024177512L;
        on.ksnf[112] = 2146183312904067682L;
        on.ksnf[113] = -6504441662708106657L;
        on.ksnf[114] = -8134763472122516065L;
        on.ksnf[115] = -5282801905622318722L;
        on.ksnf[116] = 156174992366603423L;
        on.ksnf[117] = 7688826757252082623L;
        on.ksnf[118] = 8105170068983394119L;
        on.ksnf[119] = -4907957406907865887L;
        on.ksnf[120] = 4470970002318685011L;
        on.ksnf[121] = 8033913028980706886L;
        on.ksnf[122] = 2770953157519705826L;
        on.ksnf[123] = -6986371845833053524L;
        on.ksnf[124] = -4525401922690104581L;
        on.ksnf[125] = -7093371432103936822L;
        on.ksnf[126] = 6288559642892834274L;
        on.ksnf[127] = -3156309664030630040L;
        on.ksnf[128] = 4640231144362424499L;
        on.ksnf[129] = -300600007223739214L;
        on.ksnf[130] = 1026419676203965083L;
        on.ksnf[131] = 955231287627108630L;
        on.ksnf[132] = -4701758714157201597L;
        on.ksnf[133] = -8233586190824125463L;
        on.ksnf[134] = -2650712301443008840L;
        on.ksnf[135] = 8258699321743027018L;
        on.ksnf[136] = -8631854735204788341L;
        on.ksnf[137] = 1737156920720235987L;
        on.ksnf[138] = 6113096010058917890L;
        on.ksnf[139] = -3677556601604990129L;
        on.ksnf[140] = -7062097077102008449L;
        on.ksnf[141] = -4223462065322122352L;
        on.ksnf[142] = -4431678503500882387L;
        on.ksnf[143] = 6054435599359523025L;
        on.ksnf[144] = 3828083332821788886L;
        on.ksnf[145] = 4028108089023508286L;
        on.ksnf[146] = 4629112646601808007L;
        on.ksnf[147] = 2239197544352202368L;
        on.ksnf[148] = -6278831278489588271L;
        on.ksnf[149] = -4022787101557448978L;
        on.ksnf[150] = -3700754204899004237L;
        on.ksnf[151] = -6079345231017344416L;
        on.ksnf[152] = -8573750785562294091L;
        on.ksnf[153] = 1302372439888259392L;
        on.ksnf[154] = 5509860295760987376L;
        on.ksnf[155] = 4561436606187658330L;
        on.ksnf[156] = 3845226471335097447L;
        on.ksnf[157] = 6086340126749416891L;
        on.ksnf[158] = 7673070942153644952L;
        on.ksnf[159] = -1931484062571624290L;
        on.ksnf[160] = -8919294153224420449L;
        on.ksnf[161] = 2840514666059074658L;
        on.ksnf[162] = -4261005029848269176L;
        on.ksnf[163] = 5600623968157774333L;
        on.ksnf[164] = -8017769909689394538L;
        on.ksnf[165] = 6658883428164467914L;
        on.ksnf[166] = 2937306837426165485L;
        on.ksnf[167] = -7083261585880052569L;
        on.ksnf[168] = 5411267173921879516L;
        on.ksnf[169] = -2968998549462524820L;
        on.ksnf[170] = 2107259804001370781L;
        on.ksnf[171] = 4669373338991443841L;
        on.ksnf[172] = -5070475587120664446L;
        on.ksnf[173] = -6619745189857956056L;
        on.ksnf[174] = -2769026394639863656L;
        on.ksnf[175] = -1468404755334954069L;
        on.ksnf[176] = 5764108968563603806L;
        on.ksnf[177] = -1657121644626029590L;
        on.ksnf[178] = -9111881752515117012L;
        on.ksnf[179] = 4840413673948812430L;
        on.ksnf[180] = -351251411645492227L;
        on.ksnf[181] = -2878707849421626358L;
        on.ksnf[182] = 7997717180163824632L;
        on.ksnf[183] = 883406624215699998L;
        on.ksnf[184] = -5427221186985883817L;
        on.ksnf[185] = 6215642124717242956L;
        on.ksnf[186] = -8309532133280999174L;
        on.ksnf[187] = -5491684275959813356L;
        on.ksnf[188] = 4966041404122878132L;
        on.ksnf[189] = -6994508571707786698L;
        on.ksnf[190] = 1401670129115972518L;
        on.ksnf[191] = -8922344849349503562L;
        on.ksnf[192] = 8505397545513471272L;
        on.ksnf[193] = -4997409094259429236L;
        on.ksnf[194] = 2542195833127860597L;
        on.ksnf[195] = -6374523182533623396L;
        on.ksnf[196] = -7942552068969242399L;
        on.ksnf[197] = -7852391233627404139L;
        on.ksnf[198] = 3708545640615867805L;
        on.ksnf[199] = -2571838960607652254L;
    }

    static {
        ksmx = new int[705];
        ksmy = new int[705];
        on.ktwo();
        on.ktwp();
        on.ktwq();
        on.ktwr();
        on.ktws();
        on.ktwt();
        on.ktwu();
        on.ktwv();
        on.ktww();
        on.ktwx();
        on.ktwy();
        on.ktwz();
        on.ktxa();
        on.ktxb();
        on.ktxc();
        on.ktxd();
        ksne = new long[215];
        ksnf = new long[215];
        on.ktxe();
        on.ktxf();
        on.ktxg();
        on.ktxh();
        on.ktxi();
        on.ktxj();
        FADE_PIPELINE = class_10799.method_67887((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[0]).withLocation(class_2960.method_60655((String)"phobia", (String)"pipeline/shader_hands_trail_fade")).withVertexShader(class_2960.method_60655((String)"phobia", (String)"post/shaderhands_trail_vertex")).withFragmentShader(class_2960.method_60655((String)"phobia", (String)"post/shaderhands_trail_fade_fragment")).withVertexFormat(class_290.field_60033, VertexFormat.class_5596.field_27379).withUniform("TrailData", class_10789.field_60031).withSampler("Sampler0").withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite((boolean)on.ksmz("ktwf", ksmw(int ), (int)697)).withCull((boolean)on.ksmz("ktwg", ksmw(int ), (int)698)).build());
        BLEND_PIPELINE = class_10799.method_67887((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[0]).withLocation(class_2960.method_60655((String)"phobia", (String)"pipeline/shader_hands_trail_blend")).withVertexShader(class_2960.method_60655((String)"phobia", (String)"post/shaderhands_trail_vertex")).withFragmentShader(class_2960.method_60655((String)"phobia", (String)"post/shaderhands_trail_blend_fragment")).withVertexFormat(class_290.field_60033, VertexFormat.class_5596.field_27379).withSampler("Sampler0").withBlend(BlendFunction.TRANSLUCENT_PREMULTIPLIED_ALPHA).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite((boolean)on.ksmz("ktwh", ksmw(int ), (int)699)).withCull((boolean)on.ksmz("ktwi", ksmw(int ), (int)700)).build());
        COMPOSITE_PIPELINE = class_10799.method_67887((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[0]).withLocation(class_2960.method_60655((String)"phobia", (String)"pipeline/shader_hands_trail_composite")).withVertexShader(class_2960.method_60655((String)"phobia", (String)"post/shaderhands_trail_vertex")).withFragmentShader(class_2960.method_60655((String)"phobia", (String)"post/shaderhands_trail_composite_fragment")).withVertexFormat(class_290.field_60033, VertexFormat.class_5596.field_27379).withUniform("TrailData", class_10789.field_60031).withSampler("Sampler0").withBlend(BlendFunction.TRANSLUCENT_PREMULTIPLIED_ALPHA).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite((boolean)on.ksmz("ktwj", ksmw(int ), (int)701)).withCull((boolean)on.ksmz("ktwk", ksmw(int ), (int)702)).build());
        OUTPUT_TARGET = new class_12246("phobia_shader_hands_trail", on::lambda$static$0);
        trailTextures = new GpuTexture[2];
        trailViews = new GpuTextureView[2];
        smoothDt = (float)on.ksmz("ktwl", ksnj(int ), (int)703);
        previousCameraYaw = (float)on.ksmz("ktwm", ksnj(int ), (int)704);
        lastSwingNanos = (long)on.ksmz("ktwn", ksnd(int ), (int)214);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void putColor(int var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = on.te - on.ksmz("ktjh", ksnd(int ), (int)66)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == on.ksmz("ktji", ksmw(int ), (int)509)) break;
            v0 /* !! */  = (long)on.ksmz("ktjj", ksmw(int ), (int)510);
        }
        var3_1 = on.c;
        v1 /* !! */  = on.te;
        if (true) ** GOTO lbl11
        block13: while (true) {
            v1 /* !! */  = (long)(on.ksmz("ktjl", ksnd(int ), (int)68) - on.ksmz("ktjk", ksnd(int ), (int)67));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1177591775: {
                    continue block13;
                }
                case 1982436825: {
                    break block13;
                }
            }
            break;
        }
        var2_2 /* !! */  = on.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = on.te - on.ksmz("ktjm", ksnd(int ), (int)69)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == on.ksmz("ktjn", ksmw(int ), (int)511)) break;
                    v2 /* !! */  = (long)on.ksmz("ktjo", ksmw(int ), (int)512);
                }
                var1_3 = on.a;
                if (var3_1) {
                    throw null;
lbl28:
                    // 2 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl28
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = on.te - on.ksmz("ktjp", ksnd(int ), (int)70)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == on.ksmz("ktjq", ksmw(int ), (int)513)) break;
                    v3 /* !! */  = (long)on.ksmz("ktjr", ksmw(int ), (int)514);
                }
                on.putColor(var0, 1.0f);
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)on.ksmz("ktjs", ksmw(int ), (int)515);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)on.ksmz("ktjt", ksmw(int ), (int)516);
                if (!var3_1) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)on.ksmz("ktju", ksmw(int ), (int)517);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl58
                    break;
                }
            }
            case 3: {
                do {
                    var2_2 /* !! */  = (int)on.ksmz("ktjv", ksmw(int ), (int)518);
                } while (!var3_1);
                throw null;
            }
lbl58:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)on.ksmz("ktjw", ksmw(int ), (int)519);
                if (!var3_1) break;
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)on.ksmz("ktjx", ksmw(int ), (int)520);
        ** while (!var3_1)
lbl65:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ktxf() {
        on.ksne[100] = -1779405498632051858L;
        on.ksne[101] = -5700910992749486823L;
        on.ksne[102] = 9076291724334236254L;
        on.ksne[103] = 6701664024670630159L;
        on.ksne[104] = 1048107292141032591L;
        on.ksne[105] = 1936610829073026641L;
        on.ksne[106] = 780074004211784595L;
        on.ksne[107] = -4108339949519293283L;
        on.ksne[108] = -5756311674181268135L;
        on.ksne[109] = 7402684253090172430L;
        on.ksne[110] = -4947870443919020562L;
        on.ksne[111] = 1738048491024177512L;
        on.ksne[112] = -1303681028129126605L;
        on.ksne[113] = -5814269430893888714L;
        on.ksne[114] = 3425680924521227589L;
        on.ksne[115] = 4329267884379291400L;
        on.ksne[116] = -1265928783159494976L;
        on.ksne[117] = 3515381030327858979L;
        on.ksne[118] = -990729419523237469L;
        on.ksne[119] = -5715606045630959315L;
        on.ksne[120] = 6319491965585186649L;
        on.ksne[121] = 5100182356504722052L;
        on.ksne[122] = -3832530252840196028L;
        on.ksne[123] = 8695699662115403335L;
        on.ksne[124] = -7543346367767784265L;
        on.ksne[125] = 7070732760569422905L;
        on.ksne[126] = 2949686797495730264L;
        on.ksne[127] = 6067062372824145768L;
        on.ksne[128] = -5186388431022285947L;
        on.ksne[129] = -3256248131868346355L;
        on.ksne[130] = -2242858714917581320L;
        on.ksne[131] = 6832180204983435410L;
        on.ksne[132] = 6132908361520241635L;
        on.ksne[133] = 2719402146249787876L;
        on.ksne[134] = -2938082929406806494L;
        on.ksne[135] = -8902775415292424723L;
        on.ksne[136] = 4233935527085111813L;
        on.ksne[137] = -2879708130194778568L;
        on.ksne[138] = 913579837646859581L;
        on.ksne[139] = -4066989358344613234L;
        on.ksne[140] = -5833197429576548596L;
        on.ksne[141] = -6474791759773204331L;
        on.ksne[142] = 4418438234771149895L;
        on.ksne[143] = -4041838702623118670L;
        on.ksne[144] = 5454373881348235112L;
        on.ksne[145] = -7623715639101798159L;
        on.ksne[146] = 2170951764994060241L;
        on.ksne[147] = -4546365361612415261L;
        on.ksne[148] = 59557568221867745L;
        on.ksne[149] = -5107207692722276584L;
        on.ksne[150] = 7234504721910790674L;
        on.ksne[151] = 5782261164063595245L;
        on.ksne[152] = 3014483176127471197L;
        on.ksne[153] = 2281944881776314986L;
        on.ksne[154] = -7956197235220035995L;
        on.ksne[155] = 3587713572914821109L;
        on.ksne[156] = -252009906915500400L;
        on.ksne[157] = 6786959262146034258L;
        on.ksne[158] = 4107935228054650L;
        on.ksne[159] = 4126489349334009042L;
        on.ksne[160] = 3603125674360255231L;
        on.ksne[161] = -8530924412622054180L;
        on.ksne[162] = 9050285680203911099L;
        on.ksne[163] = 7030143536129560633L;
        on.ksne[164] = 5267489249261422196L;
        on.ksne[165] = -4282510308937797994L;
        on.ksne[166] = 8439026335984983452L;
        on.ksne[167] = 7144114910435475085L;
        on.ksne[168] = -2422998021524638589L;
        on.ksne[169] = -694049715082603016L;
        on.ksne[170] = 2381978123352867214L;
        on.ksne[171] = -3365280237072855954L;
        on.ksne[172] = 2205579216561554398L;
        on.ksne[173] = 2982808359083733155L;
        on.ksne[174] = -2124125891883584017L;
        on.ksne[175] = 2190014701140863725L;
        on.ksne[176] = -7035571154831282519L;
        on.ksne[177] = -2777707846685624481L;
        on.ksne[178] = 5855590333322236698L;
        on.ksne[179] = 1400278957321393721L;
        on.ksne[180] = 5629240530839723533L;
        on.ksne[181] = -3805698201809005438L;
        on.ksne[182] = 8948806172875813339L;
        on.ksne[183] = 9105485143403070888L;
        on.ksne[184] = -2133516792550737386L;
        on.ksne[185] = 8450630905174663183L;
        on.ksne[186] = 6296276607515474056L;
        on.ksne[187] = -6058458695635119568L;
        on.ksne[188] = -5970656757827483694L;
        on.ksne[189] = 4791687293901724282L;
        on.ksne[190] = -1251984199310994325L;
        on.ksne[191] = 1197127451944618312L;
        on.ksne[192] = -6585831907540574721L;
        on.ksne[193] = 125897683840307205L;
        on.ksne[194] = 96264411635861134L;
        on.ksne[195] = 4850783199820576626L;
        on.ksne[196] = 418670241755408365L;
        on.ksne[197] = -5270052720576595769L;
        on.ksne[198] = 7224510362418342076L;
        on.ksne[199] = 267625934051988514L;
    }

    private static /* synthetic */ void ktwx() {
        on.ksmy[100] = 466103404;
        on.ksmy[101] = -1589624234;
        on.ksmy[102] = 888482038;
        on.ksmy[103] = 946758842;
        on.ksmy[104] = -968859150;
        on.ksmy[105] = 2028773022;
        on.ksmy[106] = 380940557;
        on.ksmy[107] = -1714448762;
        on.ksmy[108] = -100592912;
        on.ksmy[109] = 189330396;
        on.ksmy[110] = 769013195;
        on.ksmy[111] = 623654217;
        on.ksmy[112] = -2064429051;
        on.ksmy[113] = -139061630;
        on.ksmy[114] = 726215105;
        on.ksmy[115] = -753180906;
        on.ksmy[116] = 345253915;
        on.ksmy[117] = -740580613;
        on.ksmy[118] = 892815171;
        on.ksmy[119] = 952360684;
        on.ksmy[120] = 23976169;
        on.ksmy[121] = -511164965;
        on.ksmy[122] = 421437072;
        on.ksmy[123] = -2032629245;
        on.ksmy[124] = 2111112127;
        on.ksmy[125] = -1889983657;
        on.ksmy[126] = 1962664501;
        on.ksmy[127] = 896310888;
        on.ksmy[128] = 347990658;
        on.ksmy[129] = -972637705;
        on.ksmy[130] = -1029532238;
        on.ksmy[131] = 1234630348;
        on.ksmy[132] = -1875248908;
        on.ksmy[133] = 1473977481;
        on.ksmy[134] = 303497821;
        on.ksmy[135] = -101439593;
        on.ksmy[136] = 292429368;
        on.ksmy[137] = -2035101863;
        on.ksmy[138] = -560458106;
        on.ksmy[139] = 797235523;
        on.ksmy[140] = -774456683;
        on.ksmy[141] = 2117538974;
        on.ksmy[142] = -196767013;
        on.ksmy[143] = 711390184;
        on.ksmy[144] = 666248569;
        on.ksmy[145] = -2029743050;
        on.ksmy[146] = -1540281842;
        on.ksmy[147] = 1925017618;
        on.ksmy[148] = -1177088063;
        on.ksmy[149] = 1130908310;
        on.ksmy[150] = 1081046708;
        on.ksmy[151] = 1325654234;
        on.ksmy[152] = -1852029385;
        on.ksmy[153] = 1384641275;
        on.ksmy[154] = -475534480;
        on.ksmy[155] = -1488450764;
        on.ksmy[156] = -236218277;
        on.ksmy[157] = -1838522139;
        on.ksmy[158] = 502341968;
        on.ksmy[159] = -1986716028;
        on.ksmy[160] = -1910904986;
        on.ksmy[161] = -408453947;
        on.ksmy[162] = 632891510;
        on.ksmy[163] = 1149330039;
        on.ksmy[164] = 970629515;
        on.ksmy[165] = -372320268;
        on.ksmy[166] = 1699725050;
        on.ksmy[167] = 713584144;
        on.ksmy[168] = 1117072767;
        on.ksmy[169] = 1091505127;
        on.ksmy[170] = -1767730673;
        on.ksmy[171] = -924238847;
        on.ksmy[172] = -408483268;
        on.ksmy[173] = -2087233375;
        on.ksmy[174] = 1696197988;
        on.ksmy[175] = -2141147076;
        on.ksmy[176] = 1916905216;
        on.ksmy[177] = 1255159400;
        on.ksmy[178] = -1283031860;
        on.ksmy[179] = -1567726904;
        on.ksmy[180] = 452933531;
        on.ksmy[181] = 1360973499;
        on.ksmy[182] = -588768;
        on.ksmy[183] = 895140824;
        on.ksmy[184] = -1690695446;
        on.ksmy[185] = 733122690;
        on.ksmy[186] = -346607261;
        on.ksmy[187] = 1402137880;
        on.ksmy[188] = 518396318;
        on.ksmy[189] = -1877257337;
        on.ksmy[190] = 86437159;
        on.ksmy[191] = 1885320266;
        on.ksmy[192] = 1902443330;
        on.ksmy[193] = -1369850076;
        on.ksmy[194] = -1498690256;
        on.ksmy[195] = -8203503;
        on.ksmy[196] = 549994363;
        on.ksmy[197] = -1794971586;
        on.ksmy[198] = -889942698;
        on.ksmy[199] = -1214367731;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$ensureResources$6() {
        v0 /* !! */  = on.te;
        if (true) ** GOTO lbl5
        block12: while (true) {
            v0 /* !! */  = (long)(v1 - on.ksmz("ktrw", ksnd(int ), (int)147));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1903304757: {
                    v1 = on.ksmz("ktrx", ksnd(int ), (int)148);
                    continue block12;
                }
                case -1821862332: {
                    v1 = on.ksmz("ktry", ksnd(int ), (int)149);
                    continue block12;
                }
                case 1602461423: {
                    v1 = on.ksmz("ktrz", ksnd(int ), (int)150);
                    continue block12;
                }
                case 1982436825: {
                    break block12;
                }
            }
            break;
        }
        var2 = on.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = on.te - on.ksmz("ktsa", ksnd(int ), (int)151)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == on.ksmz("ktsb", ksmw(int ), (int)651)) break;
            v2 /* !! */  = (long)on.ksmz("ktsc", ksmw(int ), (int)652);
        }
        var1_1 = on.b;
        v3 /* !! */  = on.te;
        if (true) ** GOTO lbl29
        block14: while (true) {
            v3 /* !! */  = (long)(v4 - on.ksmz("ktsd", ksnd(int ), (int)152));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1784867412: {
                    v4 = on.ksmz("ktse", ksnd(int ), (int)153);
                    continue block14;
                }
                case 258814997: {
                    v4 = on.ksmz("ktsf", ksnd(int ), (int)154);
                    continue block14;
                }
                case 1529212550: {
                    v4 = on.ksmz("ktsg", ksnd(int ), (int)155);
                    continue block14;
                }
                case 1982436825: {
                    break block14;
                }
            }
            break;
        }
        var0_2 = on.a;
        if (var2) {
            throw null;
lbl44:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl47:
        // 1 sources

        return "phobia:shader_hands_trail_uniform";
    }
}

