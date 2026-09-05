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
 *  com.mojang.blaze3d.textures.FilterMode
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
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.Buffer;
import java.util.OptionalInt;
import java.util.function.Supplier;
import net.minecraft.class_10789;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import org.joml.Matrix4f;
import org.lwjgl.system.MemoryUtil;
import ruhack.phobia.km;

public class kx {
    static private GpuBuffer uniformBuffer;
    static private long[] gmhn;
    static private long[] gmho;
    static private final int UNIFORM_SIZE = 256;
    static private int[] gmhw;
    static final long no = -5520766832895961051L;
    static public final int b;
    static public final boolean a;
    static private RenderPipeline pipeline;
    static private int[] gmht;
    static public final boolean c;

    public static CallSite gmhp(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static void gpcg() {
        kx.gmhw[0] = -1111833455;
        kx.gmhw[1] = -1907620252;
        kx.gmhw[2] = -2003601068;
        kx.gmhw[3] = -929641116;
        kx.gmhw[4] = 884773784;
        kx.gmhw[5] = -1970835060;
        kx.gmhw[6] = -1685060512;
        kx.gmhw[7] = -1493153301;
        kx.gmhw[8] = 1920357389;
        kx.gmhw[9] = 55941898;
        kx.gmhw[10] = -129511385;
        kx.gmhw[11] = -511956124;
        kx.gmhw[12] = -1960649270;
        kx.gmhw[13] = 935748304;
        kx.gmhw[14] = 1006139247;
        kx.gmhw[15] = -2071936341;
        kx.gmhw[16] = 2055553169;
        kx.gmhw[17] = -1645155545;
        kx.gmhw[18] = -1207103632;
        kx.gmhw[19] = 785997571;
        kx.gmhw[20] = 974620407;
        kx.gmhw[21] = 1800096284;
        kx.gmhw[22] = -1863648247;
        kx.gmhw[23] = 1186296542;
        kx.gmhw[24] = -386747374;
        kx.gmhw[25] = 318886539;
        kx.gmhw[26] = -1875492991;
        kx.gmhw[27] = 708830393;
        kx.gmhw[28] = 2113962650;
        kx.gmhw[29] = -1560941098;
        kx.gmhw[30] = -2094053492;
        kx.gmhw[31] = 1162054773;
        kx.gmhw[32] = -1678028877;
        kx.gmhw[33] = -11809410;
        kx.gmhw[34] = 969834583;
        kx.gmhw[35] = 1874530687;
        kx.gmhw[36] = 747263958;
        kx.gmhw[37] = -1835399881;
        kx.gmhw[38] = 1608315156;
        kx.gmhw[39] = -492909884;
        kx.gmhw[40] = 411950954;
        kx.gmhw[41] = -816617453;
        kx.gmhw[42] = -558402772;
        kx.gmhw[43] = -1298648373;
        kx.gmhw[44] = -1675958650;
        kx.gmhw[45] = -1388771253;
        kx.gmhw[46] = 2015574165;
        kx.gmhw[47] = 962403669;
        kx.gmhw[48] = 1606159140;
        kx.gmhw[49] = 1651230118;
        kx.gmhw[50] = 580399559;
        kx.gmhw[51] = -1418034921;
        kx.gmhw[52] = -1433066204;
        kx.gmhw[53] = -610309379;
        kx.gmhw[54] = -1287500894;
        kx.gmhw[55] = 1587980754;
        kx.gmhw[56] = -1362063140;
        kx.gmhw[57] = -1589247878;
        kx.gmhw[58] = 1027483534;
        kx.gmhw[59] = -583272543;
        kx.gmhw[60] = 1446518226;
        kx.gmhw[61] = 1877052673;
        kx.gmhw[62] = 1327935971;
        kx.gmhw[63] = -1395671151;
        kx.gmhw[64] = -1096309305;
        kx.gmhw[65] = -668206355;
        kx.gmhw[66] = -377800053;
        kx.gmhw[67] = -520216202;
        kx.gmhw[68] = -731672584;
        kx.gmhw[69] = -1433660417;
        kx.gmhw[70] = 918287334;
        kx.gmhw[71] = -876812548;
        kx.gmhw[72] = -667040609;
        kx.gmhw[73] = 1028245650;
        kx.gmhw[74] = 596966381;
        kx.gmhw[75] = 387235836;
        kx.gmhw[76] = 890754239;
        kx.gmhw[77] = -446482925;
        kx.gmhw[78] = -1068608615;
        kx.gmhw[79] = -1572769776;
        kx.gmhw[80] = -335979999;
        kx.gmhw[81] = 302457009;
        kx.gmhw[82] = 1194944645;
        kx.gmhw[83] = -1020346007;
        kx.gmhw[84] = 1809699737;
        kx.gmhw[85] = 701551696;
        kx.gmhw[86] = 339416274;
        kx.gmhw[87] = 1179734239;
        kx.gmhw[88] = -1026719347;
        kx.gmhw[89] = -1976786750;
        kx.gmhw[90] = 1109080394;
        kx.gmhw[91] = 1060603721;
        kx.gmhw[92] = 1560872631;
        kx.gmhw[93] = 1275815224;
        kx.gmhw[94] = -516860473;
        kx.gmhw[95] = -1793043442;
        kx.gmhw[96] = -1522020055;
        kx.gmhw[97] = -662774026;
        kx.gmhw[98] = 1385677781;
        kx.gmhw[99] = 631930108;
    }

    private static void gpdm() {
        kx.gmhn[0] = -854870830661391416L;
        kx.gmhn[1] = 3938566518732656239L;
        kx.gmhn[2] = -7117075677506222676L;
        kx.gmhn[3] = -8513037021013696604L;
        kx.gmhn[4] = 2506641613657239114L;
        kx.gmhn[5] = -7701511895453739306L;
        kx.gmhn[6] = 2990554339811664940L;
        kx.gmhn[7] = 3962570815929888953L;
        kx.gmhn[8] = -9181798174356113886L;
        kx.gmhn[9] = 5607163866045011042L;
        kx.gmhn[10] = -3046937810502682004L;
        kx.gmhn[11] = 3847830770649915113L;
        kx.gmhn[12] = -6472939159862033236L;
        kx.gmhn[13] = -5995160971648809344L;
        kx.gmhn[14] = -7918009018196721344L;
        kx.gmhn[15] = -44761806525060227L;
        kx.gmhn[16] = -6772076796277944337L;
        kx.gmhn[17] = 2411327046524551116L;
        kx.gmhn[18] = -9218605238386069129L;
        kx.gmhn[19] = 4470328362686425812L;
        kx.gmhn[20] = -3240355822145416562L;
        kx.gmhn[21] = 216120979708364577L;
        kx.gmhn[22] = -3127754563306356340L;
        kx.gmhn[23] = 4075905787941146058L;
        kx.gmhn[24] = -5297808064186764637L;
        kx.gmhn[25] = 2028769950209408816L;
        kx.gmhn[26] = -2268989351306925588L;
        kx.gmhn[27] = -2678101368125633796L;
        kx.gmhn[28] = -7236602568773213213L;
        kx.gmhn[29] = 4600318074942603037L;
        kx.gmhn[30] = -4093148304100692117L;
        kx.gmhn[31] = 2919951871095127785L;
        kx.gmhn[32] = 5234564113349489829L;
        kx.gmhn[33] = -2432718159715090960L;
        kx.gmhn[34] = 8723039701997010401L;
        kx.gmhn[35] = 966792663927606341L;
        kx.gmhn[36] = -388986053252143569L;
        kx.gmhn[37] = 2730227297259739564L;
        kx.gmhn[38] = -5182947760783900344L;
        kx.gmhn[39] = 1299814660725385860L;
        kx.gmhn[40] = -3840768195279714032L;
        kx.gmhn[41] = -7495660390888120802L;
        kx.gmhn[42] = 500296258561345640L;
        kx.gmhn[43] = -1402160125362149599L;
        kx.gmhn[44] = -4991527747605078641L;
        kx.gmhn[45] = -1565360618134229759L;
        kx.gmhn[46] = 7360895789470965345L;
        kx.gmhn[47] = 8027272854306342865L;
        kx.gmhn[48] = 2528019052253098782L;
        kx.gmhn[49] = 4177794197339091769L;
        kx.gmhn[50] = -8700281307553065639L;
        kx.gmhn[51] = 3877823885559163602L;
        kx.gmhn[52] = -2337333211265917338L;
        kx.gmhn[53] = -8261495975135556258L;
        kx.gmhn[54] = 6092279550164790866L;
        kx.gmhn[55] = 3794684256343618608L;
        kx.gmhn[56] = 1828202048903968045L;
        kx.gmhn[57] = 9114865124589572624L;
        kx.gmhn[58] = -5356935441024085419L;
        kx.gmhn[59] = 8204999315890381935L;
        kx.gmhn[60] = -8431924504784227953L;
        kx.gmhn[61] = -7034824277389396762L;
        kx.gmhn[62] = 3160792032342995254L;
        kx.gmhn[63] = -6289095181342311247L;
        kx.gmhn[64] = 3668696712681420713L;
        kx.gmhn[65] = 3061214347205077069L;
        kx.gmhn[66] = 7098241903870390203L;
        kx.gmhn[67] = 4052012122627381545L;
        kx.gmhn[68] = -4431730309864640937L;
        kx.gmhn[69] = 4942855519435720906L;
        kx.gmhn[70] = -5197488100048641593L;
        kx.gmhn[71] = 7409352549460635249L;
        kx.gmhn[72] = -5913174639724074060L;
        kx.gmhn[73] = -7256807092998741413L;
        kx.gmhn[74] = 253441845024254317L;
        kx.gmhn[75] = 9094358271642527358L;
        kx.gmhn[76] = -7116880470925758262L;
        kx.gmhn[77] = -4825805445386318011L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void shutdown() {
        v0 /* !! */  = kx.no;
        if (true) ** GOTO lbl5
        block31: while (true) {
            v0 /* !! */  = (long)(v1 - kx.gmhp("govm", gmhm(int ), (int)53));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -713402331: {
                    break block31;
                }
                case 679872477: {
                    v1 = kx.gmhp("govn", gmhm(int ), (int)54);
                    continue block31;
                }
                case 1130119037: {
                    v1 = kx.gmhp("govo", gmhm(int ), (int)55);
                    continue block31;
                }
            }
            break;
        }
        var2 = kx.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = kx.no - kx.gmhp("govp", gmhm(int ), (int)56)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == kx.gmhp("govs", gmhs(int ), (int)174)) break;
            v2 /* !! */  = (long)kx.gmhp("gowc", gmhs(int ), (int)175);
        }
        var1_1 /* !! */  = kx.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = kx.no - kx.gmhp("gowe", gmhm(int ), (int)57)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == kx.gmhp("gowf", gmhs(int ), (int)176)) break;
            v3 /* !! */  = (long)kx.gmhp("gowg", gmhs(int ), (int)177);
        }
        var0_2 = kx.a;
        if (var2) {
            throw null;
lbl29:
            // 5 sources

            return;
        }
        if (var0_2 || var0_2) ** GOTO lbl29
        v4 /* !! */  = kx.no;
        if (true) ** GOTO lbl36
        block35: while (true) {
            v4 /* !! */  = (long)(kx.gmhp("gowi", gmhm(int ), (int)59) - kx.gmhp("gowh", gmhm(int ), (int)58));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -713402331: {
                    break block35;
                }
                case 1257054546: {
                    continue block35;
                }
            }
            break;
        }
        if (kx.uniformBuffer == null) ** GOTO lbl77
        if (var0_2 || var0_2) ** GOTO lbl29
        v5 /* !! */  = kx.no;
        if (true) ** GOTO lbl47
        block36: while (true) {
            v5 /* !! */  = (long)(kx.gmhp("gows", gmhm(int ), (int)61) - kx.gmhp("gowm", gmhm(int ), (int)60));
lbl47:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -713402331: {
                    break block36;
                }
                case 1095003272: {
                    continue block36;
                }
            }
            break;
        }
        v6 /* !! */  = kx.no;
        if (true) ** GOTO lbl56
        block37: while (true) {
            v6 /* !! */  = (long)(v7 - kx.gmhp("gowt", gmhm(int ), (int)62));
lbl56:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -713402331: {
                    break block37;
                }
                case -32458564: {
                    v7 = kx.gmhp("gowu", gmhm(int ), (int)63);
                    continue block37;
                }
                case 1056941761: {
                    v7 = kx.gmhp("gowv", gmhm(int ), (int)64);
                    continue block37;
                }
            }
            break;
        }
        kx.uniformBuffer.close();
        if (var0_2 || var0_2) ** GOTO lbl29
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = kx.no - kx.gmhp("goww", gmhm(int ), (int)65)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == kx.gmhp("gowx", gmhs(int ), (int)178)) break;
                    v8 /* !! */  = (long)kx.gmhp("goxb", gmhs(int ), (int)179);
                }
                kx.uniformBuffer = null;
                if (var0_2) ** GOTO lbl29
lbl77:
                // 2 sources

                if (!var0_2 && !var0_2) ** break;
                ** continue;
                return;
            }
lbl80:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)kx.gmhp("goxc", gmhs(int ), (int)180);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl114
            }
lbl85:
            // 2 sources

            case 1: {
                var1_1 /* !! */  = (int)kx.gmhp("goxe", gmhs(int ), (int)181);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl95
            }
            case 2: {
                var1_1 /* !! */  = (int)kx.gmhp("goxg", gmhs(int ), (int)182);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl100
            }
lbl95:
            // 4 sources

            case 3: {
                var1_1 /* !! */  = (int)kx.gmhp("goxj", gmhs(int ), (int)183);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl109
            }
lbl100:
            // 2 sources

            case 4: {
                var1_1 /* !! */  = (int)kx.gmhp("goxm", gmhs(int ), (int)184);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl114
            }
            case 5: {
                var1_1 /* !! */  = (int)kx.gmhp("goxo", gmhs(int ), (int)185);
                if (!var2) ** GOTO lbl95
                throw null;
            }
lbl109:
            // 2 sources

            case 6: {
                var1_1 /* !! */  = (int)kx.gmhp("goxu", gmhs(int ), (int)186);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl122
            }
lbl114:
            // 3 sources

            case 7: {
                var1_1 /* !! */  = (int)kx.gmhp("goxx", gmhs(int ), (int)187);
                if (!var2) ** GOTO lbl85
                throw null;
            }
            case 8: {
                var1_1 /* !! */  = (int)kx.gmhp("goxy", gmhs(int ), (int)188);
                if (!var2) ** GOTO lbl95
                throw null;
            }
lbl122:
            // 2 sources

            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)kx.gmhp("goxz", gmhs(int ), (int)189);
                    if (!var2) ** GOTO lbl80
                    throw null;
                }
            }
            case 10: 
        }
        var1_1 /* !! */  = (int)kx.gmhp("goya", gmhs(int ), (int)190);
        ** while (!var2)
lbl130:
        // 1 sources

        throw null;
    }

    private static void gpcc() {
        kx.gmht[200] = 750248458;
        kx.gmht[201] = -724233798;
        kx.gmht[202] = 1137933984;
        kx.gmht[203] = 904946141;
        kx.gmht[204] = -1592747841;
    }

    static {
        gmht = new int[205];
        gmhw = new int[205];
        kx.gpai();
        kx.gpbc();
        kx.gpcc();
        kx.gpcg();
        kx.gpcy();
        kx.gpdk();
        gmhn = new long[78];
        gmho = new long[78];
        kx.gpdm();
        kx.gpee();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static String lambda$draw$1() {
        v0 /* !! */  = kx.no;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(kx.gmhp("goyi", gmhm(int ), (int)67) - kx.gmhp("goyg", gmhm(int ), (int)66));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -713402331: {
                    break block16;
                }
                case 1521313748: {
                    continue block16;
                }
            }
            break;
        }
        var2 = kx.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = kx.no - kx.gmhp("goym", gmhm(int ), (int)68)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == kx.gmhp("goyo", gmhs(int ), (int)191)) break;
            v1 /* !! */  = (long)kx.gmhp("goyt", gmhs(int ), (int)192);
        }
        var1_1 /* !! */  = kx.b;
        v2 /* !! */  = kx.no;
        if (true) ** GOTO lbl22
        block18: while (true) {
            v2 /* !! */  = (long)(v3 - kx.gmhp("gozb", gmhm(int ), (int)69));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -713402331: {
                    break block18;
                }
                case 287622378: {
                    v3 = kx.gmhp("gozc", gmhm(int ), (int)70);
                    continue block18;
                }
                case 757875241: {
                    v3 = kx.gmhp("gozd", gmhm(int ), (int)71);
                    continue block18;
                }
                case 1927526677: {
                    v3 = kx.gmhp("goze", gmhm(int ), (int)72);
                    continue block18;
                }
            }
            break;
        }
        var0_2 = kx.a;
        if (!var2) ** GOTO lbl41
        throw null;
        {
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var1_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl41:
                // 1 sources

                if (var0_2 || var0_2) continue block19;
                return "LiquidGlass2D";
                case 0: {
                    var1_1 /* !! */  = (int)kx.gmhp("gozi", gmhs(int ), (int)193);
                    if (!var2) break block19;
                    throw null;
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var1_1 /* !! */  = (int)kx.gmhp("gozk", gmhs(int ), (int)194);
                        if (!var2) ** GOTO lbl-1000
                        throw null;
                    }
                }
                case 2: {
                    do {
                        var1_1 /* !! */  = (int)kx.gmhp("gozm", gmhs(int ), (int)195);
                    } while (!var2);
                    throw null;
                }
                case 3: 
            }
        }
        var1_1 /* !! */  = (int)kx.gmhp("gozn", gmhs(int ), (int)196);
        ** while (!var2)
lbl60:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void draw(Matrix4f var0, float var1_1, float var2_2, float var3_3, float var4_4, float[] var5_5, int var6_6, float var7_7, float var8_8, int var9_9, float var10_10, boolean var11_11, float var12_12, float var13_13, float var14_14, float var15_15) {
        block218: {
            block217: {
                block216: {
                    block215: {
                        var29_16 = kx.c;
                        var28_17 /* !! */  = kx.b;
                        var27_18 = kx.a;
                        if (var29_16) {
                            throw null;
lbl6:
                            // 60 sources

                            return;
                        }
                        if (var27_18 || var27_18) ** GOTO lbl6
                        if (kx.pipeline != null) break block215;
                        if (var27_18 || var27_18) ** GOTO lbl6
                        kx.init();
                        if (var27_18) ** GOTO lbl6
                    }
                    if (var27_18 || var27_18) ** GOTO lbl6
                    if (kx.pipeline == null) break block216;
                    if (var27_18) ** GOTO lbl6
                    if (kx.uniformBuffer != null) break block217;
                    if (var27_18) ** GOTO lbl6
                }
                if (var27_18 || var27_18) ** GOTO lbl6
                return;
            }
            if (var27_18 || var27_18) ** GOTO lbl6
            var16_19 = class_310.method_1551();
            if (var27_18 || var27_18) ** GOTO lbl6
            var17_20 = var16_19.method_1522();
            if (var27_18 || var27_18) ** GOTO lbl6
            var18_21 = var17_20.field_1482;
            if (var27_18 || var27_18) ** GOTO lbl6
            var19_22 = var17_20.field_1481;
            if (var27_18 || var27_18) ** GOTO lbl6
            var20_23 = MemoryUtil.memAlloc((int)kx.gmhp("gmoy", gmhs(int ), (int)47));
            if (var27_18 || var27_18) ** GOTO lbl6
            var20_23.putFloat(var0.m00()).putFloat(var0.m01()).putFloat(var0.m02()).putFloat(var0.m03());
            if (var27_18 || var27_18) ** GOTO lbl6
            var20_23.putFloat(var0.m10()).putFloat(var0.m11()).putFloat(var0.m12()).putFloat(var0.m13());
            if (var27_18 || var27_18) ** GOTO lbl6
            var20_23.putFloat(var0.m20()).putFloat(var0.m21()).putFloat(var0.m22()).putFloat(var0.m23());
            if (var27_18 || var27_18) ** GOTO lbl6
            var20_23.putFloat(var0.m30()).putFloat(var0.m31()).putFloat(var0.m32()).putFloat(var0.m33());
            if (var27_18 || var27_18) ** GOTO lbl6
            var20_23.putFloat(var1_1).putFloat(var2_2).putFloat(var3_3).putFloat(var4_4);
            if (var27_18 || var27_18) ** GOTO lbl6
            var20_23.putFloat(var18_21).putFloat(var19_22);
            if (var27_18 || var27_18) ** GOTO lbl6
            var20_23.putFloat(0.0f).putFloat(0.0f);
            if (var27_18 || var27_18) ** GOTO lbl6
            var20_23.putFloat(var5_5[0]).putFloat(var5_5[1]).putFloat(var5_5[2]).putFloat(var5_5[3]);
            if (var27_18 || var27_18) ** GOTO lbl6
            var20_23.putFloat((float)kx.gmhp("gmpl", gmpf(int ), (int)48));
            if (var27_18 || var27_18) ** GOTO lbl6
            var20_23.putFloat(var14_14);
            if (var27_18 || var27_18) ** GOTO lbl6
            var20_23.putFloat(var7_7);
            if (var27_18 || var27_18) ** GOTO lbl6
            var20_23.putFloat(var8_8);
            if (var27_18 || var27_18) ** GOTO lbl6
            var20_23.putFloat((float)(var9_9 >> kx.gmhp("gohj", gmhs(int ), (int)49) & kx.gmhp("gohk", gmhs(int ), (int)50)) / kx.gmhp("gohl", gmpf(int ), (int)51));
            if (var27_18 || var27_18) ** GOTO lbl6
            var20_23.putFloat((float)(var9_9 >> kx.gmhp("goho", gmhs(int ), (int)52) & kx.gmhp("gohq", gmhs(int ), (int)53)) / kx.gmhp("gohs", gmpf(int ), (int)54));
            if (var27_18 || var27_18) ** GOTO lbl6
            var20_23.putFloat((float)(var9_9 & kx.gmhp("gohz", gmhs(int ), (int)55)) / kx.gmhp("goic", gmpf(int ), (int)56));
            if (var27_18 || var27_18) ** GOTO lbl6
            var20_23.putFloat((float)(var9_9 >> kx.gmhp("goie", gmhs(int ), (int)57) & kx.gmhp("goif", gmhs(int ), (int)58)) / kx.gmhp("goig", gmpf(int ), (int)59));
            if (var27_18 || var27_18) ** GOTO lbl6
            var20_23.putFloat(var10_10);
            if (var27_18 || var27_18) ** GOTO lbl6
            if (var11_11) {
                v0 = kx.gmhp("goik", gmhs(int ), (int)60);
                if (var29_16) {
                    throw null;
                }
            } else {
                v0 = kx.gmhp("goin", gmhs(int ), (int)61);
            }
            var20_23.putInt((int)v0);
            if (var27_18 || var27_18) ** GOTO lbl6
            var20_23.putFloat(var12_12);
            if (var27_18 || var27_18) ** GOTO lbl6
            var20_23.putFloat(var13_13);
            if (var27_18 || var27_18) ** GOTO lbl6
            var20_23.putFloat(var15_15);
            if (var27_18 || var27_18) ** GOTO lbl6
            var20_23.putFloat(0.0f);
            if (var27_18 || var27_18) ** GOTO lbl6
            var20_23.flip();
            if (var27_18 || var27_18) ** GOTO lbl6
            var21_24 = RenderSystem.getDevice().createCommandEncoder();
            if (var27_18 || var27_18) ** GOTO lbl6
            var21_24.writeToBuffer(kx.uniformBuffer.slice(), var20_23);
            if (var27_18 || var27_18) ** GOTO lbl6
            MemoryUtil.memFree((Buffer)var20_23);
            if (var27_18 || var27_18) ** GOTO lbl6
            var22_25 = RenderSystem.getSamplerCache().method_75294(FilterMode.LINEAR);
            if (var27_18 || var27_18) ** GOTO lbl6
            var23_26 = km.getBlurTextureView();
            if (var27_18 || var27_18) ** GOTO lbl6
            if (var23_26 != null) break block218;
            if (var27_18 || var27_18) ** GOTO lbl6
            var23_26 = var17_20.method_71639();
            if (var27_18) ** GOTO lbl6
        }
        if (var27_18 || var27_18) ** GOTO lbl6
        var24_27 = var21_24.createRenderPass((Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$draw$1(), ()Ljava/lang/String;)(), var17_20.method_71639(), OptionalInt.empty());
        if (var27_18) ** GOTO lbl6
        if (var27_18) ** GOTO lbl6
        var24_27.setPipeline(kx.pipeline);
        if (var27_18 || var27_18) ** GOTO lbl6
        var24_27.setUniform("Uniforms", kx.uniformBuffer);
        if (var27_18 || var27_18) ** GOTO lbl6
        var24_27.bindTexture("Sampler0", var23_26, var22_25);
        if (var27_18 || var27_18) ** GOTO lbl6
        var24_27.draw((int)kx.gmhp("goje", gmhs(int ), (int)62), (int)kx.gmhp("gojf", gmhs(int ), (int)63));
        if (var27_18 || var27_18) ** GOTO lbl6
        if (var24_27 == null) ** GOTO lbl164
        if (var27_18) ** GOTO lbl6
        if (var28_17 /* !! */  == 0) ** GOTO lbl-1000
        {
            catch (Throwable var25_28) {
                if (var27_18) ** GOTO lbl6
                if (var24_27 == null) ** GOTO lbl155
                if (var27_18) ** GOTO lbl6
                try {
                    if (var27_18) ** GOTO lbl6
                    var24_27.close();
                    if (var27_18 || var27_18) ** GOTO lbl6
                    ** if (!var29_16) goto lbl-1000
                }
                catch (Throwable var26_29) {
                    if (var27_18) ** GOTO lbl6
                    var25_28.addSuppressed(var26_29);
                    if (var27_18) ** GOTO lbl6
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
lbl155:
                // 3 sources

                if (var27_18 || var27_18) ** GOTO lbl6
                throw var25_28;
            }
        }
        switch (var28_17 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var24_27.close();
                if (var27_18) ** GOTO lbl6
                if (var29_16) {
                    throw null;
                }
            }
lbl164:
            // 3 sources

            if (!var27_18 && !var27_18) ** break;
            ** continue;
            return;
lbl167:
            // 2 sources

            case 0: {
                var28_17 /* !! */  = (int)kx.gmhp("gojm", gmhs(int ), (int)64);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl386
            }
            case 1: {
                var28_17 /* !! */  = (int)kx.gmhp("gojo", gmhs(int ), (int)65);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl239
            }
lbl177:
            // 4 sources

            case 2: {
                var28_17 /* !! */  = (int)kx.gmhp("gojp", gmhs(int ), (int)66);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl191
            }
            case 3: {
                var28_17 /* !! */  = (int)kx.gmhp("gojq", gmhs(int ), (int)67);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl617
            }
lbl187:
            // 2 sources

            case 4: {
                var28_17 /* !! */  = (int)kx.gmhp("gojr", gmhs(int ), (int)68);
                if (!var29_16) break;
                throw null;
            }
lbl191:
            // 2 sources

            case 5: {
                var28_17 /* !! */  = (int)kx.gmhp("gojs", gmhs(int ), (int)69);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl521
            }
            case 6: {
                var28_17 /* !! */  = (int)kx.gmhp("goju", gmhs(int ), (int)70);
                if (!var29_16) ** GOTO lbl187
                throw null;
            }
lbl200:
            // 3 sources

            case 7: {
                var28_17 /* !! */  = (int)kx.gmhp("gojv", gmhs(int ), (int)71);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl330
            }
            case 8: {
                var28_17 /* !! */  = (int)kx.gmhp("gojw", gmhs(int ), (int)72);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl493
            }
lbl210:
            // 5 sources

            case 9: {
                var28_17 /* !! */  = (int)kx.gmhp("gojy", gmhs(int ), (int)73);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl555
            }
lbl215:
            // 2 sources

            case 10: {
                var28_17 /* !! */  = (int)kx.gmhp("goka", gmhs(int ), (int)74);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl580
            }
            case 11: {
                var28_17 /* !! */  = (int)kx.gmhp("gokc", gmhs(int ), (int)75);
                if (!var29_16) ** GOTO lbl215
                throw null;
            }
            case 12: {
                var28_17 /* !! */  = (int)kx.gmhp("goki", gmhs(int ), (int)76);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl257
            }
            case 13: {
                var28_17 /* !! */  = (int)kx.gmhp("gokl", gmhs(int ), (int)77);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl293
            }
            case 14: {
                var28_17 /* !! */  = (int)kx.gmhp("goko", gmhs(int ), (int)78);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl353
            }
lbl239:
            // 2 sources

            case 15: {
                var28_17 /* !! */  = (int)kx.gmhp("gokp", gmhs(int ), (int)79);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl641
            }
lbl244:
            // 2 sources

            case 16: {
                var28_17 /* !! */  = (int)kx.gmhp("gokr", gmhs(int ), (int)80);
                if (!var29_16) ** GOTO lbl210
                throw null;
            }
lbl248:
            // 2 sources

            case 17: {
                var28_17 /* !! */  = (int)kx.gmhp("goku", gmhs(int ), (int)81);
                if (!var29_16) ** GOTO lbl177
                throw null;
            }
            case 18: {
                var28_17 /* !! */  = (int)kx.gmhp("goky", gmhs(int ), (int)82);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl390
            }
lbl257:
            // 2 sources

            case 19: {
                var28_17 /* !! */  = (int)kx.gmhp("golf", gmhs(int ), (int)83);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl588
            }
lbl262:
            // 2 sources

            case 20: {
                var28_17 /* !! */  = (int)kx.gmhp("goli", gmhs(int ), (int)84);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl530
            }
lbl267:
            // 2 sources

            case 21: {
                var28_17 /* !! */  = (int)kx.gmhp("golj", gmhs(int ), (int)85);
                if (var29_16) {
                    throw null;
                }
            }
lbl271:
            // 6 sources

            case 22: {
                var28_17 /* !! */  = (int)kx.gmhp("goll", gmhs(int ), (int)86);
                if (!var29_16) ** GOTO lbl210
                throw null;
            }
lbl275:
            // 3 sources

            case 23: {
                var28_17 /* !! */  = (int)kx.gmhp("golo", gmhs(int ), (int)87);
                if (!var29_16) break;
                throw null;
            }
            case 24: {
                var28_17 /* !! */  = (int)kx.gmhp("gols", gmhs(int ), (int)88);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl293
            }
            case 25: {
                var28_17 /* !! */  = (int)kx.gmhp("golu", gmhs(int ), (int)89);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl571
            }
            case 26: {
                var28_17 /* !! */  = (int)kx.gmhp("gomc", gmhs(int ), (int)90);
                if (!var29_16) ** GOTO lbl271
                throw null;
            }
lbl293:
            // 3 sources

            case 27: {
                var28_17 /* !! */  = (int)kx.gmhp("gomd", gmhs(int ), (int)91);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl547
            }
            case 28: {
                var28_17 /* !! */  = (int)kx.gmhp("gomg", gmhs(int ), (int)92);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl448
            }
            case 29: {
                var28_17 /* !! */  = (int)kx.gmhp("gomj", gmhs(int ), (int)93);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl413
            }
            case 30: {
                var28_17 /* !! */  = (int)kx.gmhp("gomn", gmhs(int ), (int)94);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl649
            }
            case 31: {
                var28_17 /* !! */  = (int)kx.gmhp("gomo", gmhs(int ), (int)95);
                if (!var29_16) ** GOTO lbl200
                throw null;
            }
            case 32: {
                var28_17 /* !! */  = (int)kx.gmhp("gomw", gmhs(int ), (int)96);
                if (!var29_16) ** GOTO lbl244
                throw null;
            }
lbl321:
            // 2 sources

            case 33: {
                var28_17 /* !! */  = (int)kx.gmhp("gomx", gmhs(int ), (int)97);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl576
            }
lbl326:
            // 2 sources

            case 34: {
                var28_17 /* !! */  = (int)kx.gmhp("gomz", gmhs(int ), (int)98);
                if (!var29_16) ** GOTO lbl210
                throw null;
            }
lbl330:
            // 5 sources

            case 35: {
                var28_17 /* !! */  = (int)kx.gmhp("gonc", gmhs(int ), (int)99);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl361
            }
            case 36: {
                var28_17 /* !! */  = (int)kx.gmhp("gonf", gmhs(int ), (int)100);
                if (!var29_16) ** GOTO lbl271
                throw null;
            }
lbl339:
            // 2 sources

            case 37: {
                var28_17 /* !! */  = (int)kx.gmhp("goni", gmhs(int ), (int)101);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl592
            }
lbl344:
            // 2 sources

            case 38: {
                var28_17 /* !! */  = (int)kx.gmhp("gonj", gmhs(int ), (int)102);
                if (var29_16) {
                    throw null;
                }
            }
lbl348:
            // 4 sources

            case 39: {
                do {
                    var28_17 /* !! */  = (int)kx.gmhp("gonn", gmhs(int ), (int)103);
                } while (!var29_16);
                throw null;
            }
lbl353:
            // 4 sources

            case 40: {
                var28_17 /* !! */  = (int)kx.gmhp("gonp", gmhs(int ), (int)104);
                if (!var29_16) ** GOTO lbl177
                throw null;
            }
lbl357:
            // 3 sources

            case 41: {
                var28_17 /* !! */  = (int)kx.gmhp("gonr", gmhs(int ), (int)105);
                if (!var29_16) ** GOTO lbl167
                throw null;
            }
lbl361:
            // 3 sources

            case 42: {
                var28_17 /* !! */  = (int)kx.gmhp("gont", gmhs(int ), (int)106);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl508
            }
            case 43: {
                var28_17 /* !! */  = (int)kx.gmhp("gonv", gmhs(int ), (int)107);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl460
            }
            case 44: {
                var28_17 /* !! */  = (int)kx.gmhp("gonx", gmhs(int ), (int)108);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl547
            }
            case 45: {
                var28_17 /* !! */  = (int)kx.gmhp("gonz", gmhs(int ), (int)109);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl498
            }
lbl381:
            // 2 sources

            case 46: {
                var28_17 /* !! */  = (int)kx.gmhp("goob", gmhs(int ), (int)110);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl464
            }
lbl386:
            // 3 sources

            case 47: {
                var28_17 /* !! */  = (int)kx.gmhp("good", gmhs(int ), (int)111);
                if (!var29_16) ** GOTO lbl357
                throw null;
            }
lbl390:
            // 2 sources

            case 48: {
                var28_17 /* !! */  = (int)kx.gmhp("goof", gmhs(int ), (int)112);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl576
            }
            case 49: {
                var28_17 /* !! */  = (int)kx.gmhp("gooh", gmhs(int ), (int)113);
                if (!var29_16) ** GOTO lbl271
                throw null;
            }
            case 50: {
                var28_17 /* !! */  = (int)kx.gmhp("gooj", gmhs(int ), (int)114);
                if (!var29_16) ** GOTO lbl344
                throw null;
            }
lbl403:
            // 2 sources

            case 51: {
                var28_17 /* !! */  = (int)kx.gmhp("goon", gmhs(int ), (int)115);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl576
            }
            case 52: {
                var28_17 /* !! */  = (int)kx.gmhp("goop", gmhs(int ), (int)116);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl516
            }
lbl413:
            // 3 sources

            case 53: {
                var28_17 /* !! */  = (int)kx.gmhp("goor", gmhs(int ), (int)117);
                if (!var29_16) ** GOTO lbl330
                throw null;
            }
lbl417:
            // 3 sources

            case 54: {
                var28_17 /* !! */  = (int)kx.gmhp("goot", gmhs(int ), (int)118);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl567
            }
lbl422:
            // 2 sources

            case 55: {
                var28_17 /* !! */  = (int)kx.gmhp("goov", gmhs(int ), (int)119);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl633
            }
            case 56: {
                var28_17 /* !! */  = (int)kx.gmhp("goow", gmhs(int ), (int)120);
                if (!var29_16) ** GOTO lbl248
                throw null;
            }
lbl431:
            // 2 sources

            case 57: {
                var28_17 /* !! */  = (int)kx.gmhp("goox", gmhs(int ), (int)121);
                if (!var29_16) ** GOTO lbl357
                throw null;
            }
lbl435:
            // 3 sources

            case 58: {
                var28_17 /* !! */  = (int)kx.gmhp("gopb", gmhs(int ), (int)122);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl493
            }
            case 59: {
                var28_17 /* !! */  = (int)kx.gmhp("gopd", gmhs(int ), (int)123);
                if (!var29_16) ** GOTO lbl353
                throw null;
            }
            case 60: {
                var28_17 /* !! */  = (int)kx.gmhp("gopf", gmhs(int ), (int)124);
                if (!var29_16) ** GOTO lbl275
                throw null;
            }
lbl448:
            // 2 sources

            case 61: {
                var28_17 /* !! */  = (int)kx.gmhp("goph", gmhs(int ), (int)125);
                if (!var29_16) ** GOTO lbl210
                throw null;
            }
            case 62: {
                var28_17 /* !! */  = (int)kx.gmhp("gopj", gmhs(int ), (int)126);
                if (!var29_16) ** GOTO lbl326
                throw null;
            }
            case 63: {
                var28_17 /* !! */  = (int)kx.gmhp("gopk", gmhs(int ), (int)127);
                if (!var29_16) ** GOTO lbl321
                throw null;
            }
lbl460:
            // 2 sources

            case 64: {
                var28_17 /* !! */  = (int)kx.gmhp("gopl", gmhs(int ), (int)128);
                if (!var29_16) ** GOTO lbl339
                throw null;
            }
lbl464:
            // 2 sources

            case 65: {
                var28_17 /* !! */  = (int)kx.gmhp("gopr", gmhs(int ), (int)129);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl600
            }
lbl469:
            // 2 sources

            case 66: {
                var28_17 /* !! */  = (int)kx.gmhp("gops", gmhs(int ), (int)130);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl625
            }
            case 67: {
                var28_17 /* !! */  = (int)kx.gmhp("gopt", gmhs(int ), (int)131);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl641
            }
            case 68: {
                var28_17 /* !! */  = (int)kx.gmhp("gopw", gmhs(int ), (int)132);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl604
            }
lbl484:
            // 2 sources

            case 69: {
                var28_17 /* !! */  = (int)kx.gmhp("goqb", gmhs(int ), (int)133);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl512
            }
            case 70: {
                var28_17 /* !! */  = (int)kx.gmhp("goqd", gmhs(int ), (int)134);
                if (!var29_16) ** GOTO lbl417
                throw null;
            }
lbl493:
            // 4 sources

            case 71: {
                var28_17 /* !! */  = (int)kx.gmhp("goqe", gmhs(int ), (int)135);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl530
            }
lbl498:
            // 3 sources

            case 72: {
                var28_17 /* !! */  = (int)kx.gmhp("goqm", gmhs(int ), (int)136);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl580
            }
            case 73: {
                var28_17 /* !! */  = (int)kx.gmhp("goqn", gmhs(int ), (int)137);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl592
            }
lbl508:
            // 2 sources

            case 74: {
                var28_17 /* !! */  = (int)kx.gmhp("goqo", gmhs(int ), (int)138);
                if (!var29_16) ** GOTO lbl330
                throw null;
            }
lbl512:
            // 4 sources

            case 75: {
                var28_17 /* !! */  = (int)kx.gmhp("goqr", gmhs(int ), (int)139);
                if (!var29_16) ** GOTO lbl353
                throw null;
            }
lbl516:
            // 3 sources

            case 76: {
                var28_17 /* !! */  = (int)kx.gmhp("goqw", gmhs(int ), (int)140);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl596
            }
lbl521:
            // 2 sources

            case 77: {
                var28_17 /* !! */  = (int)kx.gmhp("goqy", gmhs(int ), (int)141);
                if (!var29_16) ** GOTO lbl422
                throw null;
            }
            case 78: {
                var28_17 /* !! */  = (int)kx.gmhp("goqz", gmhs(int ), (int)142);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl617
            }
lbl530:
            // 3 sources

            case 79: {
                var28_17 /* !! */  = (int)kx.gmhp("gorf", gmhs(int ), (int)143);
                if (!var29_16) ** GOTO lbl275
                throw null;
            }
            case 80: {
                var28_17 /* !! */  = (int)kx.gmhp("gorg", gmhs(int ), (int)144);
                if (!var29_16) ** GOTO lbl386
                throw null;
            }
            case 81: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var28_17 /* !! */  = (int)kx.gmhp("gorh", gmhs(int ), (int)145);
                    if (!var29_16) ** GOTO lbl262
                    throw null;
                }
            }
lbl543:
            // 2 sources

            case 82: {
                var28_17 /* !! */  = (int)kx.gmhp("goro", gmhs(int ), (int)146);
                if (!var29_16) ** GOTO lbl469
                throw null;
            }
lbl547:
            // 4 sources

            case 83: {
                var28_17 /* !! */  = (int)kx.gmhp("gorp", gmhs(int ), (int)147);
                if (!var29_16) ** GOTO lbl431
                throw null;
            }
            case 84: {
                var28_17 /* !! */  = (int)kx.gmhp("gorq", gmhs(int ), (int)148);
                if (!var29_16) ** GOTO lbl330
                throw null;
            }
lbl555:
            // 2 sources

            case 85: {
                var28_17 /* !! */  = (int)kx.gmhp("goru", gmhs(int ), (int)149);
                if (!var29_16) ** GOTO lbl267
                throw null;
            }
lbl559:
            // 2 sources

            case 86: {
                var28_17 /* !! */  = (int)kx.gmhp("gorz", gmhs(int ), (int)150);
                if (!var29_16) ** GOTO lbl435
                throw null;
            }
lbl563:
            // 2 sources

            case 87: {
                var28_17 /* !! */  = (int)kx.gmhp("gosb", gmhs(int ), (int)151);
                if (!var29_16) ** GOTO lbl516
                throw null;
            }
lbl567:
            // 2 sources

            case 88: {
                var28_17 /* !! */  = (int)kx.gmhp("gosf", gmhs(int ), (int)152);
                if (!var29_16) ** GOTO lbl563
                throw null;
            }
lbl571:
            // 2 sources

            case 89: {
                var28_17 /* !! */  = (int)kx.gmhp("gosi", gmhs(int ), (int)153);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl596
            }
lbl576:
            // 4 sources

            case 90: {
                var28_17 /* !! */  = (int)kx.gmhp("gosj", gmhs(int ), (int)154);
                if (!var29_16) ** GOTO lbl498
                throw null;
            }
lbl580:
            // 3 sources

            case 91: {
                var28_17 /* !! */  = (int)kx.gmhp("gosl", gmhs(int ), (int)155);
                if (!var29_16) ** GOTO lbl493
                throw null;
            }
            case 92: {
                var28_17 /* !! */  = (int)kx.gmhp("gosp", gmhs(int ), (int)156);
                if (!var29_16) ** GOTO lbl484
                throw null;
            }
lbl588:
            // 2 sources

            case 93: {
                var28_17 /* !! */  = (int)kx.gmhp("gost", gmhs(int ), (int)157);
                if (!var29_16) ** GOTO lbl435
                throw null;
            }
lbl592:
            // 3 sources

            case 94: {
                var28_17 /* !! */  = (int)kx.gmhp("gosu", gmhs(int ), (int)158);
                if (!var29_16) ** GOTO lbl177
                throw null;
            }
lbl596:
            // 3 sources

            case 95: {
                var28_17 /* !! */  = (int)kx.gmhp("gosy", gmhs(int ), (int)159);
                if (!var29_16) ** GOTO lbl361
                throw null;
            }
lbl600:
            // 2 sources

            case 96: {
                var28_17 /* !! */  = (int)kx.gmhp("gotc", gmhs(int ), (int)160);
                if (!var29_16) ** GOTO lbl200
                throw null;
            }
lbl604:
            // 2 sources

            case 97: {
                var28_17 /* !! */  = (int)kx.gmhp("gote", gmhs(int ), (int)161);
                if (!var29_16) ** GOTO lbl543
                throw null;
            }
            case 98: {
                var28_17 /* !! */  = (int)kx.gmhp("gotj", gmhs(int ), (int)162);
                if (!var29_16) ** GOTO lbl417
                throw null;
            }
            case 99: {
                var28_17 /* !! */  = (int)kx.gmhp("gotm", gmhs(int ), (int)163);
                if (var29_16) {
                    throw null;
                }
                ** GOTO lbl649
            }
lbl617:
            // 3 sources

            case 100: {
                var28_17 /* !! */  = (int)kx.gmhp("goto", gmhs(int ), (int)164);
                if (!var29_16) ** GOTO lbl559
                throw null;
            }
            case 101: {
                var28_17 /* !! */  = (int)kx.gmhp("gotp", gmhs(int ), (int)165);
                if (!var29_16) ** GOTO lbl413
                throw null;
            }
lbl625:
            // 2 sources

            case 102: {
                var28_17 /* !! */  = (int)kx.gmhp("gotr", gmhs(int ), (int)166);
                if (!var29_16) ** GOTO lbl381
                throw null;
            }
            case 103: {
                var28_17 /* !! */  = (int)kx.gmhp("gott", gmhs(int ), (int)167);
                if (!var29_16) ** GOTO lbl512
                throw null;
            }
lbl633:
            // 3 sources

            case 104: {
                var28_17 /* !! */  = (int)kx.gmhp("goud", gmhs(int ), (int)168);
                if (!var29_16) ** GOTO lbl547
                throw null;
            }
            case 105: {
                var28_17 /* !! */  = (int)kx.gmhp("gouf", gmhs(int ), (int)169);
                if (!var29_16) ** GOTO lbl403
                throw null;
            }
lbl641:
            // 3 sources

            case 106: {
                var28_17 /* !! */  = (int)kx.gmhp("goum", gmhs(int ), (int)170);
                if (!var29_16) ** GOTO lbl348
                throw null;
            }
            case 107: {
                var28_17 /* !! */  = (int)kx.gmhp("gouo", gmhs(int ), (int)171);
                if (!var29_16) ** GOTO lbl633
                throw null;
            }
lbl649:
            // 3 sources

            case 108: {
                var28_17 /* !! */  = (int)kx.gmhp("gouv", gmhs(int ), (int)172);
                if (!var29_16) ** GOTO lbl512
                throw null;
            }
            case 109: 
        }
        var28_17 /* !! */  = (int)kx.gmhp("goux", gmhs(int ), (int)173);
        ** while (!var29_16)
lbl656:
        // 1 sources

        throw null;
    }

    private static long gmhm(int n2) {
        return gmhn[n2] ^ gmho[n2];
    }

    private static float gmpf(int n2) {
        return Float.intBitsToFloat(gmht[n2] ^ gmhw[n2]);
    }

    public kx() {
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static String lambda$init$0() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kx.no - kx.gmhp("gozo", gmhm(int ), (int)73)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == kx.gmhp("gozp", gmhs(int ), (int)197)) break;
            v0 /* !! */  = (long)kx.gmhp("gozr", gmhs(int ), (int)198);
        }
        var2 = kx.c;
        v1 /* !! */  = kx.no;
        if (true) ** GOTO lbl12
        block6: while (true) {
            v1 /* !! */  = (long)(v2 - kx.gmhp("gozu", gmhm(int ), (int)74));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1989303302: {
                    v2 = kx.gmhp("gozw", gmhm(int ), (int)75);
                    continue block6;
                }
                case -713402331: {
                    break block6;
                }
                case -231459457: {
                    v2 = kx.gmhp("gpaa", gmhm(int ), (int)76);
                    continue block6;
                }
            }
            break;
        }
        var1_1 = kx.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = kx.no - kx.gmhp("gpab", gmhm(int ), (int)77)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == kx.gmhp("gpac", gmhs(int ), (int)199)) break;
            v3 /* !! */  = (long)kx.gmhp("gpad", gmhs(int ), (int)200);
        }
        var0_2 = kx.a;
        if (var2) {
            throw null;
lbl31:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl34:
        // 1 sources

        return "LiquidGlass2D Uniforms";
    }

    private static void gpai() {
        kx.gmht[0] = 1111833454;
        kx.gmht[1] = -1409968718;
        kx.gmht[2] = 2003601067;
        kx.gmht[3] = 1608459388;
        kx.gmht[4] = -884773785;
        kx.gmht[5] = -161772229;
        kx.gmht[6] = 1685060511;
        kx.gmht[7] = 2134252033;
        kx.gmht[8] = 1920357388;
        kx.gmht[9] = 1537538883;
        kx.gmht[10] = 129511384;
        kx.gmht[11] = -306146482;
        kx.gmht[12] = 1960649269;
        kx.gmht[13] = -25389089;
        kx.gmht[14] = -1006139248;
        kx.gmht[15] = 1065341834;
        kx.gmht[16] = -2055553170;
        kx.gmht[17] = -789456423;
        kx.gmht[18] = 1207103631;
        kx.gmht[19] = 737942355;
        kx.gmht[20] = -974620408;
        kx.gmht[21] = 600897334;
        kx.gmht[22] = 1863648246;
        kx.gmht[23] = 2079453530;
        kx.gmht[24] = -386747374;
        kx.gmht[25] = 318886538;
        kx.gmht[26] = -923649220;
        kx.gmht[27] = -708830394;
        kx.gmht[28] = 1392109974;
        kx.gmht[29] = -1560941097;
        kx.gmht[30] = -480910509;
        kx.gmht[31] = 1162054909;
        kx.gmht[32] = -1678028878;
        kx.gmht[33] = -413142683;
        kx.gmht[34] = 969834583;
        kx.gmht[35] = 1874530682;
        kx.gmht[36] = 747263965;
        kx.gmht[37] = -1835399885;
        kx.gmht[38] = 1608315153;
        kx.gmht[39] = -492909888;
        kx.gmht[40] = 411950945;
        kx.gmht[41] = -816617447;
        kx.gmht[42] = -558402780;
        kx.gmht[43] = -1298648384;
        kx.gmht[44] = -1675958650;
        kx.gmht[45] = -1388771254;
        kx.gmht[46] = 2015574162;
        kx.gmht[47] = 962403413;
        kx.gmht[48] = 1622936356;
        kx.gmht[49] = 1651230134;
        kx.gmht[50] = 580399416;
        kx.gmht[51] = -402292457;
        kx.gmht[52] = -1433066196;
        kx.gmht[53] = -610309630;
        kx.gmht[54] = -264418398;
        kx.gmht[55] = 1587980589;
        kx.gmht[56] = -307261220;
        kx.gmht[57] = -1589247902;
        kx.gmht[58] = 1027483505;
        kx.gmht[59] = -1639647327;
        kx.gmht[60] = 1446518227;
        kx.gmht[61] = 1877052673;
        kx.gmht[62] = 1327935971;
        kx.gmht[63] = -1395671145;
        kx.gmht[64] = -1096309301;
        kx.gmht[65] = -668206411;
        kx.gmht[66] = -377799995;
        kx.gmht[67] = -520216255;
        kx.gmht[68] = -731672680;
        kx.gmht[69] = -1433660429;
        kx.gmht[70] = 918287280;
        kx.gmht[71] = -876812617;
        kx.gmht[72] = -667040568;
        kx.gmht[73] = 1028245682;
        kx.gmht[74] = 596966346;
        kx.gmht[75] = 387235763;
        kx.gmht[76] = 890754177;
        kx.gmht[77] = -446482850;
        kx.gmht[78] = -1068608629;
        kx.gmht[79] = -1572769764;
        kx.gmht[80] = -335980019;
        kx.gmht[81] = 302457021;
        kx.gmht[82] = 1194944697;
        kx.gmht[83] = -1020346068;
        kx.gmht[84] = 1809699718;
        kx.gmht[85] = 701551643;
        kx.gmht[86] = 339416194;
        kx.gmht[87] = 1179734218;
        kx.gmht[88] = -1026719250;
        kx.gmht[89] = -1976786798;
        kx.gmht[90] = 1109080331;
        kx.gmht[91] = 1060603724;
        kx.gmht[92] = 1560872619;
        kx.gmht[93] = 1275815258;
        kx.gmht[94] = -516860463;
        kx.gmht[95] = -1793043393;
        kx.gmht[96] = -1522020060;
        kx.gmht[97] = -662774020;
        kx.gmht[98] = 1385677775;
        kx.gmht[99] = 631930097;
    }

    private static void gpdk() {
        kx.gmhw[200] = 438330131;
        kx.gmhw[201] = -724233798;
        kx.gmhw[202] = 1137933987;
        kx.gmhw[203] = 904946141;
        kx.gmhw[204] = -1592747841;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void init() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kx.no - kx.gmhp("gmhq", gmhm(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == kx.gmhp("gmhx", gmhs(int ), (int)0)) break;
            v0 /* !! */  = (long)kx.gmhp("gmhy", gmhs(int ), (int)1);
        }
        var2 = kx.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = kx.no - kx.gmhp("gmhz", gmhm(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == kx.gmhp("gmia", gmhs(int ), (int)2)) break;
            v1 /* !! */  = (long)kx.gmhp("gmic", gmhs(int ), (int)3);
        }
        var1_1 /* !! */  = kx.b;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = kx.no - kx.gmhp("gmid", gmhm(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == kx.gmhp("gmie", gmhs(int ), (int)4)) break;
                    v2 /* !! */  = (long)kx.gmhp("gmif", gmhs(int ), (int)5);
                }
                var0_2 = kx.a;
                if (var2) {
                    throw null;
lbl24:
                    // 5 sources

                    return;
                }
                if (var0_2 || var0_2) ** GOTO lbl24
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = kx.no - kx.gmhp("gmig", gmhm(int ), (int)3)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == kx.gmhp("gmih", gmhs(int ), (int)6)) break;
                    v3 /* !! */  = (long)kx.gmhp("gmii", gmhs(int ), (int)7);
                }
                if (kx.pipeline == null) ** GOTO lbl35
                if (var0_2 || var0_2) ** GOTO lbl24
                return;
lbl35:
                // 1 sources

                if (var0_2 || var0_2) ** GOTO lbl24
                v4 = new RenderPipeline.Snippet[]{};
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_4 = kx.no - kx.gmhp("gmij", gmhm(int ), (int)4)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == kx.gmhp("gmik", gmhs(int ), (int)8)) break;
                    v5 /* !! */  = (long)kx.gmhp("gmim", gmhs(int ), (int)9);
                }
                v6 = RenderPipeline.builder((RenderPipeline.Snippet[])v4);
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_5 = kx.no - kx.gmhp("gmin", gmhm(int ), (int)5)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == kx.gmhp("gmio", gmhs(int ), (int)10)) break;
                    v7 /* !! */  = (long)kx.gmhp("gmiq", gmhs(int ), (int)11);
                }
                v8 = class_2960.method_60655((String)"phobia", (String)"liquidglass");
                v9 /* !! */  = kx.no;
                if (true) ** GOTO lbl53
                block84: while (true) {
                    v9 /* !! */  = (long)(kx.gmhp("gmis", gmhm(int ), (int)7) - kx.gmhp("gmir", gmhm(int ), (int)6));
lbl53:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -975350050: {
                            continue block84;
                        }
                        case -713402331: {
                            break block84;
                        }
                    }
                    break;
                }
                v10 = v6.withLocation(v8);
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_6 = kx.no - kx.gmhp("gmiu", gmhm(int ), (int)8)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == kx.gmhp("gmja", gmhs(int ), (int)12)) break;
                    v11 /* !! */  = (long)kx.gmhp("gmjb", gmhs(int ), (int)13);
                }
                v12 = class_2960.method_60655((String)"phobia", (String)"liquidglass_vertex");
                v13 /* !! */  = kx.no;
                if (true) ** GOTO lbl69
                block86: while (true) {
                    v13 /* !! */  = (long)(v14 - kx.gmhp("gmjc", gmhm(int ), (int)9));
lbl69:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1113162543: {
                            v14 = kx.gmhp("gmjd", gmhm(int ), (int)10);
                            continue block86;
                        }
                        case -713402331: {
                            break block86;
                        }
                        case 1534262697: {
                            v14 = kx.gmhp("gmje", gmhm(int ), (int)11);
                            continue block86;
                        }
                        case 2064643973: {
                            v14 = kx.gmhp("gmjf", gmhm(int ), (int)12);
                            continue block86;
                        }
                    }
                    break;
                }
                v15 = v10.withVertexShader(v12);
                v16 /* !! */  = kx.no;
                if (true) ** GOTO lbl86
                block87: while (true) {
                    v16 /* !! */  = (long)(v17 - kx.gmhp("gmjl", gmhm(int ), (int)13));
lbl86:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1351181330: {
                            v17 = kx.gmhp("gmjm", gmhm(int ), (int)14);
                            continue block87;
                        }
                        case -1111942304: {
                            v17 = kx.gmhp("gmjn", gmhm(int ), (int)15);
                            continue block87;
                        }
                        case -713402331: {
                            break block87;
                        }
                        case 1173502508: {
                            v17 = kx.gmhp("gmjq", gmhm(int ), (int)16);
                            continue block87;
                        }
                    }
                    break;
                }
                v18 = class_2960.method_60655((String)"phobia", (String)"liquidglass_fragment");
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_7 = kx.no - kx.gmhp("gmjr", gmhm(int ), (int)17)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == kx.gmhp("gmjs", gmhs(int ), (int)14)) break;
                    v19 /* !! */  = (long)kx.gmhp("gmjt", gmhs(int ), (int)15);
                }
                v20 = v15.withFragmentShader(v18);
                v21 /* !! */  = kx.no;
                if (true) ** GOTO lbl109
                block89: while (true) {
                    v21 /* !! */  = (long)(v22 - kx.gmhp("gmjx", gmhm(int ), (int)18));
lbl109:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -713402331: {
                            break block89;
                        }
                        case -696420163: {
                            v22 = kx.gmhp("gmjz", gmhm(int ), (int)19);
                            continue block89;
                        }
                        case 874486956: {
                            v22 = kx.gmhp("gmka", gmhm(int ), (int)20);
                            continue block89;
                        }
                    }
                    break;
                }
                v23 = VertexFormat.builder();
                v24 /* !! */  = kx.no;
                if (true) ** GOTO lbl123
                block90: while (true) {
                    v24 /* !! */  = (long)(kx.gmhp("gmkf", gmhm(int ), (int)22) - kx.gmhp("gmkd", gmhm(int ), (int)21));
lbl123:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case -713402331: {
                            break block90;
                        }
                        case 1289165787: {
                            continue block90;
                        }
                    }
                    break;
                }
                v25 = v23.build();
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_8 = kx.no - kx.gmhp("gmkg", gmhm(int ), (int)23)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v26 /* !! */  == kx.gmhp("gmkh", gmhs(int ), (int)16)) break;
                    v26 /* !! */  = (long)kx.gmhp("gmkk", gmhs(int ), (int)17);
                }
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_9 = kx.no - kx.gmhp("gmkl", gmhm(int ), (int)24)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == kx.gmhp("gmkm", gmhs(int ), (int)18)) break;
                    v27 /* !! */  = (long)kx.gmhp("gmko", gmhs(int ), (int)19);
                }
                v28 = v20.withVertexFormat(v25, VertexFormat.class_5596.field_27379);
                v29 /* !! */  = kx.no;
                if (true) ** GOTO lbl144
                block93: while (true) {
                    v29 /* !! */  = (long)(kx.gmhp("gmkq", gmhm(int ), (int)26) - kx.gmhp("gmkp", gmhm(int ), (int)25));
lbl144:
                    // 2 sources

                    switch ((int)v29 /* !! */ ) {
                        case -1605185182: {
                            continue block93;
                        }
                        case -713402331: {
                            break block93;
                        }
                    }
                    break;
                }
                v30 /* !! */  = kx.no;
                if (true) ** GOTO lbl153
                block94: while (true) {
                    v30 /* !! */  = (long)(kx.gmhp("gmkw", gmhm(int ), (int)28) - kx.gmhp("gmkv", gmhm(int ), (int)27));
lbl153:
                    // 2 sources

                    switch ((int)v30 /* !! */ ) {
                        case -713402331: {
                            break block94;
                        }
                        case 584599283: {
                            continue block94;
                        }
                    }
                    break;
                }
                v31 = v28.withUniform("Uniforms", class_10789.field_60031);
                v32 /* !! */  = kx.no;
                if (true) ** GOTO lbl163
                block95: while (true) {
                    v32 /* !! */  = (long)(v33 - kx.gmhp("gmkx", gmhm(int ), (int)29));
lbl163:
                    // 2 sources

                    switch ((int)v32 /* !! */ ) {
                        case -713402331: {
                            break block95;
                        }
                        case -419603045: {
                            v33 = kx.gmhp("gmky", gmhm(int ), (int)30);
                            continue block95;
                        }
                        case 453069830: {
                            v33 = kx.gmhp("gmkz", gmhm(int ), (int)31);
                            continue block95;
                        }
                        case 848742071: {
                            v33 = kx.gmhp("gmlb", gmhm(int ), (int)32);
                            continue block95;
                        }
                    }
                    break;
                }
                v34 = v31.withSampler("Sampler0");
                v35 /* !! */  = kx.no;
                if (true) ** GOTO lbl180
                block96: while (true) {
                    v35 /* !! */  = (long)(kx.gmhp("gmlf", gmhm(int ), (int)34) - kx.gmhp("gmlc", gmhm(int ), (int)33));
lbl180:
                    // 2 sources

                    switch ((int)v35 /* !! */ ) {
                        case -1472121263: {
                            continue block96;
                        }
                        case -713402331: {
                            break block96;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v36 /* !! */  = (cfr_temp_10 = kx.no - kx.gmhp("gmlh", gmhm(int ), (int)35)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v36 /* !! */  == kx.gmhp("gmli", gmhs(int ), (int)20)) break;
                    v36 /* !! */  = (long)kx.gmhp("gmlj", gmhs(int ), (int)21);
                }
                v37 = v34.withBlend(BlendFunction.TRANSLUCENT);
                while (true) {
                    if ((v38 /* !! */  = (cfr_temp_11 = kx.no - kx.gmhp("gmll", gmhm(int ), (int)36)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v38 /* !! */  == kx.gmhp("gmln", gmhs(int ), (int)22)) break;
                    v38 /* !! */  = (long)kx.gmhp("gmlp", gmhs(int ), (int)23);
                }
                v39 /* !! */  = kx.no;
                if (true) ** GOTO lbl200
                block99: while (true) {
                    v39 /* !! */  = (long)(kx.gmhp("gmls", gmhm(int ), (int)38) - kx.gmhp("gmlq", gmhm(int ), (int)37));
lbl200:
                    // 2 sources

                    switch ((int)v39 /* !! */ ) {
                        case -1700771667: {
                            continue block99;
                        }
                        case -713402331: {
                            break block99;
                        }
                    }
                    break;
                }
                v40 = v37.withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST);
                v41 = kx.gmhp("gmlv", gmhs(int ), (int)24);
                while (true) {
                    if ((v42 /* !! */  = (cfr_temp_12 = kx.no - kx.gmhp("gmlx", gmhm(int ), (int)39)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v42 /* !! */  == kx.gmhp("gmly", gmhs(int ), (int)25)) break;
                    v42 /* !! */  = (long)kx.gmhp("gmmc", gmhs(int ), (int)26);
                }
                v43 = v40.withCull((boolean)v41);
                v44 /* !! */  = kx.no;
                if (true) ** GOTO lbl217
                block101: while (true) {
                    v44 /* !! */  = (long)(v45 - kx.gmhp("gmmd", gmhm(int ), (int)40));
lbl217:
                    // 2 sources

                    switch ((int)v44 /* !! */ ) {
                        case -1697755839: {
                            v45 = kx.gmhp("gmme", gmhm(int ), (int)41);
                            continue block101;
                        }
                        case -713402331: {
                            break block101;
                        }
                        case 1140440025: {
                            v45 = kx.gmhp("gmmf", gmhm(int ), (int)42);
                            continue block101;
                        }
                    }
                    break;
                }
                v46 = v43.build();
                v47 /* !! */  = kx.no;
                if (true) ** GOTO lbl231
                block102: while (true) {
                    v47 /* !! */  = (long)(v48 - kx.gmhp("gmmg", gmhm(int ), (int)43));
lbl231:
                    // 2 sources

                    switch ((int)v47 /* !! */ ) {
                        case -1005099377: {
                            v48 = kx.gmhp("gmmi", gmhm(int ), (int)44);
                            continue block102;
                        }
                        case -713402331: {
                            break block102;
                        }
                        case 589024167: {
                            v48 = kx.gmhp("gmmk", gmhm(int ), (int)45);
                            continue block102;
                        }
                        case 1039218679: {
                            v48 = kx.gmhp("gmmp", gmhm(int ), (int)46);
                            continue block102;
                        }
                    }
                    break;
                }
                kx.pipeline = v46;
                if (var0_2 || var0_2) ** GOTO lbl24
                while (true) {
                    if ((v49 /* !! */  = (cfr_temp_13 = kx.no - kx.gmhp("gmmq", gmhm(int ), (int)47)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v49 /* !! */  == kx.gmhp("gmmr", gmhs(int ), (int)27)) break;
                    v49 /* !! */  = (long)kx.gmhp("gmmt", gmhs(int ), (int)28);
                }
                v50 = RenderSystem.getDevice();
                while (true) {
                    if ((v51 /* !! */  = (cfr_temp_14 = kx.no - kx.gmhp("gmmv", gmhm(int ), (int)48)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                    if (v51 /* !! */  == kx.gmhp("gmmx", gmhs(int ), (int)29)) break;
                    v51 /* !! */  = (long)kx.gmhp("gmnc", gmhs(int ), (int)30);
                }
                v52 = (Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$init$0(), ()Ljava/lang/String;)();
                v53 = kx.gmhp("gmnd", gmhs(int ), (int)31);
                v54 = kx.gmhp("gmne", gmhm(int ), (int)49);
                while (true) {
                    if ((v55 /* !! */  = (cfr_temp_15 = kx.no - kx.gmhp("gmnf", gmhm(int ), (int)50)) == 0L ? 0 : (cfr_temp_15 < 0L ? -1 : 1)) == false) continue;
                    if (v55 /* !! */  == kx.gmhp("gmng", gmhs(int ), (int)32)) break;
                    v55 /* !! */  = (long)kx.gmhp("gmnh", gmhs(int ), (int)33);
                }
                v56 = v50.createBuffer(v52, (int)v53, (long)v54);
                v57 /* !! */  = kx.no;
                if (true) ** GOTO lbl269
                block106: while (true) {
                    v57 /* !! */  = (long)(kx.gmhp("gmno", gmhm(int ), (int)52) - kx.gmhp("gmnj", gmhm(int ), (int)51));
lbl269:
                    // 2 sources

                    switch ((int)v57 /* !! */ ) {
                        case -713402331: {
                            break block106;
                        }
                        case 182503373: {
                            continue block106;
                        }
                    }
                    break;
                }
                kx.uniformBuffer = v56;
                if (var0_2 || var0_2) ** continue;
                return;
            }
lbl277:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)kx.gmhp("gmnr", gmhs(int ), (int)34);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl322
                    break;
                }
            }
lbl283:
            // 2 sources

            case 1: {
                var1_1 /* !! */  = (int)kx.gmhp("gmns", gmhs(int ), (int)35);
                if (!var2) ** GOTO lbl277
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)kx.gmhp("gmnt", gmhs(int ), (int)36);
                if (!var2) break;
                throw null;
            }
            case 3: {
                var1_1 /* !! */  = (int)kx.gmhp("gmnu", gmhs(int ), (int)37);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl326
            }
lbl296:
            // 2 sources

            case 4: {
                var1_1 /* !! */  = (int)kx.gmhp("gmnw", gmhs(int ), (int)38);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl322
            }
            case 5: {
                var1_1 /* !! */  = (int)kx.gmhp("gmny", gmhs(int ), (int)39);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl318
            }
            case 6: {
                var1_1 /* !! */  = (int)kx.gmhp("gmod", gmhs(int ), (int)40);
                if (!var2) ** GOTO lbl296
                throw null;
            }
            case 7: {
                var1_1 /* !! */  = (int)kx.gmhp("gmof", gmhs(int ), (int)41);
                if (!var2) ** GOTO lbl283
                throw null;
            }
lbl314:
            // 2 sources

            case 8: {
                var1_1 /* !! */  = (int)kx.gmhp("gmog", gmhs(int ), (int)42);
                if (var2) {
                    throw null;
                }
            }
lbl318:
            // 4 sources

            case 9: {
                var1_1 /* !! */  = (int)kx.gmhp("gmoh", gmhs(int ), (int)43);
                if (!var2) ** GOTO lbl277
                throw null;
            }
lbl322:
            // 3 sources

            case 10: {
                var1_1 /* !! */  = (int)kx.gmhp("gmoi", gmhs(int ), (int)44);
                if (var2) {
                    throw null;
                }
            }
lbl326:
            // 4 sources

            case 11: {
                var1_1 /* !! */  = (int)kx.gmhp("gmok", gmhs(int ), (int)45);
                if (!var2) ** GOTO lbl314
                throw null;
            }
            case 12: 
        }
        var1_1 /* !! */  = (int)kx.gmhp("gmom", gmhs(int ), (int)46);
        ** while (!var2)
lbl333:
        // 1 sources

        throw null;
    }

    private static void gpee() {
        kx.gmho[0] = -8733803900345373256L;
        kx.gmho[1] = 7131264500522327849L;
        kx.gmho[2] = -1963162908830114484L;
        kx.gmho[3] = -7117849338730015470L;
        kx.gmho[4] = -5885246081435758300L;
        kx.gmho[5] = 9153563714465616954L;
        kx.gmho[6] = -7102560171521833811L;
        kx.gmho[7] = -9048768093464548588L;
        kx.gmho[8] = -1150794857283027638L;
        kx.gmho[9] = 500691871727064936L;
        kx.gmho[10] = -5104078690897830379L;
        kx.gmho[11] = -7216024091057913284L;
        kx.gmho[12] = -1973905760249215837L;
        kx.gmho[13] = 6459126830560426859L;
        kx.gmho[14] = 7300866432084498220L;
        kx.gmho[15] = -4769765095970145056L;
        kx.gmho[16] = 5275425389794706248L;
        kx.gmho[17] = 1406231967151829983L;
        kx.gmho[18] = 1510601323254535514L;
        kx.gmho[19] = -9002102435691513448L;
        kx.gmho[20] = -405182154103741565L;
        kx.gmho[21] = 1149420924097415320L;
        kx.gmho[22] = -7511143446429091678L;
        kx.gmho[23] = 3152236742925780327L;
        kx.gmho[24] = 277178937167531823L;
        kx.gmho[25] = -8552856138904718856L;
        kx.gmho[26] = -5988059885562144718L;
        kx.gmho[27] = -3545811698614104739L;
        kx.gmho[28] = 5410658301929792156L;
        kx.gmho[29] = -4192889894855216509L;
        kx.gmho[30] = -6036697154393726179L;
        kx.gmho[31] = -2566092356048065209L;
        kx.gmho[32] = 8291615301579433442L;
        kx.gmho[33] = 4372553454963371190L;
        kx.gmho[34] = -8158762424769364490L;
        kx.gmho[35] = 598001260219154113L;
        kx.gmho[36] = -3055305393804258511L;
        kx.gmho[37] = 8528093936150362584L;
        kx.gmho[38] = -1680742433696598554L;
        kx.gmho[39] = -5520410351061271511L;
        kx.gmho[40] = -7729494963553456336L;
        kx.gmho[41] = 7019189520389127652L;
        kx.gmho[42] = 4167447331401445529L;
        kx.gmho[43] = -8651851637222698667L;
        kx.gmho[44] = 6956606801745031578L;
        kx.gmho[45] = 4294587112052950640L;
        kx.gmho[46] = 8930419688536423976L;
        kx.gmho[47] = 919434638384828505L;
        kx.gmho[48] = -6002593374658969341L;
        kx.gmho[49] = 4177794197339091513L;
        kx.gmho[50] = 2686617107204561741L;
        kx.gmho[51] = 4354072488767020382L;
        kx.gmho[52] = 4559755522372113430L;
        kx.gmho[53] = 2756668659080260434L;
        kx.gmho[54] = -192150534370815468L;
        kx.gmho[55] = -5082841624899675510L;
        kx.gmho[56] = -1155910256819288616L;
        kx.gmho[57] = -3066143689836047525L;
        kx.gmho[58] = 5204455662300311723L;
        kx.gmho[59] = -5165272610211465139L;
        kx.gmho[60] = -8068715874966470197L;
        kx.gmho[61] = -6436256825128186126L;
        kx.gmho[62] = 6798979678924291235L;
        kx.gmho[63] = 4675252282655927374L;
        kx.gmho[64] = -9070759406135601097L;
        kx.gmho[65] = 4639956031803542306L;
        kx.gmho[66] = -9134947853676681507L;
        kx.gmho[67] = 3981317671154853800L;
        kx.gmho[68] = 2119328754595753620L;
        kx.gmho[69] = -1186163952950745995L;
        kx.gmho[70] = 276538995526852169L;
        kx.gmho[71] = 68185616138476969L;
        kx.gmho[72] = -7806395917705297932L;
        kx.gmho[73] = -5245764341340506311L;
        kx.gmho[74] = 4540730265445744860L;
        kx.gmho[75] = -5309441039393034843L;
        kx.gmho[76] = 331792365248486888L;
        kx.gmho[77] = -9044516553341904857L;
    }

    private static int gmhs(int n2) {
        return gmht[n2] ^ gmhw[n2];
    }

    private static void gpcy() {
        kx.gmhw[100] = -1165652079;
        kx.gmhw[101] = -79712442;
        kx.gmhw[102] = -1450870890;
        kx.gmhw[103] = 1703450455;
        kx.gmhw[104] = -2066008386;
        kx.gmhw[105] = 1270434990;
        kx.gmhw[106] = -1811387674;
        kx.gmhw[107] = -246219211;
        kx.gmhw[108] = -274441374;
        kx.gmhw[109] = 910644068;
        kx.gmhw[110] = 593041086;
        kx.gmhw[111] = 2018662921;
        kx.gmhw[112] = 737797145;
        kx.gmhw[113] = 437446913;
        kx.gmhw[114] = 1822531293;
        kx.gmhw[115] = -1783460484;
        kx.gmhw[116] = 395794346;
        kx.gmhw[117] = 1001793397;
        kx.gmhw[118] = -610692188;
        kx.gmhw[119] = 1664555907;
        kx.gmhw[120] = 969952139;
        kx.gmhw[121] = 1421263675;
        kx.gmhw[122] = -889098687;
        kx.gmhw[123] = 8870573;
        kx.gmhw[124] = -24136022;
        kx.gmhw[125] = 1531470028;
        kx.gmhw[126] = -1978193136;
        kx.gmhw[127] = -1262876228;
        kx.gmhw[128] = -1229771670;
        kx.gmhw[129] = 2145013080;
        kx.gmhw[130] = 63940157;
        kx.gmhw[131] = 1244469623;
        kx.gmhw[132] = 2041594859;
        kx.gmhw[133] = 100372147;
        kx.gmhw[134] = 1261870765;
        kx.gmhw[135] = 2016395198;
        kx.gmhw[136] = -560812146;
        kx.gmhw[137] = 2002484877;
        kx.gmhw[138] = 168919838;
        kx.gmhw[139] = -1747834914;
        kx.gmhw[140] = -163198793;
        kx.gmhw[141] = 425485542;
        kx.gmhw[142] = 1107258764;
        kx.gmhw[143] = 311383078;
        kx.gmhw[144] = 1459917781;
        kx.gmhw[145] = -1693399616;
        kx.gmhw[146] = -1357713194;
        kx.gmhw[147] = 1471874234;
        kx.gmhw[148] = -50888545;
        kx.gmhw[149] = -1445767659;
        kx.gmhw[150] = -74933087;
        kx.gmhw[151] = 702986150;
        kx.gmhw[152] = 1723296415;
        kx.gmhw[153] = -1187722229;
        kx.gmhw[154] = -1861788804;
        kx.gmhw[155] = -1928456650;
        kx.gmhw[156] = -1981702669;
        kx.gmhw[157] = 2130312805;
        kx.gmhw[158] = 1258688325;
        kx.gmhw[159] = -359898236;
        kx.gmhw[160] = -329194414;
        kx.gmhw[161] = -795343043;
        kx.gmhw[162] = 1640239050;
        kx.gmhw[163] = 1440858193;
        kx.gmhw[164] = -2033459635;
        kx.gmhw[165] = 205741552;
        kx.gmhw[166] = 1006137266;
        kx.gmhw[167] = -2039982056;
        kx.gmhw[168] = -1015468841;
        kx.gmhw[169] = -1887298472;
        kx.gmhw[170] = 959851422;
        kx.gmhw[171] = -1283011744;
        kx.gmhw[172] = 1760440071;
        kx.gmhw[173] = -276765888;
        kx.gmhw[174] = -434116527;
        kx.gmhw[175] = -1952192719;
        kx.gmhw[176] = -459621885;
        kx.gmhw[177] = 991998539;
        kx.gmhw[178] = 112092312;
        kx.gmhw[179] = 767867675;
        kx.gmhw[180] = -781813695;
        kx.gmhw[181] = 1983266930;
        kx.gmhw[182] = 1525621685;
        kx.gmhw[183] = -219620058;
        kx.gmhw[184] = -243495986;
        kx.gmhw[185] = 153327189;
        kx.gmhw[186] = -1220849068;
        kx.gmhw[187] = 2008600678;
        kx.gmhw[188] = 430314299;
        kx.gmhw[189] = -92176373;
        kx.gmhw[190] = 1712728869;
        kx.gmhw[191] = -339414273;
        kx.gmhw[192] = -420990665;
        kx.gmhw[193] = -1248290734;
        kx.gmhw[194] = -724271724;
        kx.gmhw[195] = -1492558451;
        kx.gmhw[196] = -1738013773;
        kx.gmhw[197] = -1311242128;
        kx.gmhw[198] = 2070801769;
        kx.gmhw[199] = 1514947098;
    }

    private static void gpbc() {
        kx.gmht[100] = -1165652053;
        kx.gmht[101] = -79712422;
        kx.gmht[102] = -1450870795;
        kx.gmht[103] = 1703450437;
        kx.gmht[104] = -2066008430;
        kx.gmht[105] = 1270434959;
        kx.gmht[106] = -1811387679;
        kx.gmht[107] = -246219184;
        kx.gmht[108] = -274441472;
        kx.gmht[109] = 910644067;
        kx.gmht[110] = 593041137;
        kx.gmht[111] = 2018662991;
        kx.gmht[112] = 737797206;
        kx.gmht[113] = 437446964;
        kx.gmht[114] = 1822531323;
        kx.gmht[115] = -1783460495;
        kx.gmht[116] = 395794407;
        kx.gmht[117] = 1001793299;
        kx.gmht[118] = -610692118;
        kx.gmht[119] = 1664555904;
        kx.gmht[120] = 969952138;
        kx.gmht[121] = 1421263702;
        kx.gmht[122] = -889098664;
        kx.gmht[123] = 8870562;
        kx.gmht[124] = -24136006;
        kx.gmht[125] = 1531470028;
        kx.gmht[126] = -1978193129;
        kx.gmht[127] = -1262876241;
        kx.gmht[128] = -1229771725;
        kx.gmht[129] = 2145013072;
        kx.gmht[130] = 63940222;
        kx.gmht[131] = 1244469555;
        kx.gmht[132] = 2041594878;
        kx.gmht[133] = 100372158;
        kx.gmht[134] = 1261870720;
        kx.gmht[135] = 2016395188;
        kx.gmht[136] = -560812124;
        kx.gmht[137] = 2002484941;
        kx.gmht[138] = 168919868;
        kx.gmht[139] = -1747834994;
        kx.gmht[140] = -163198807;
        kx.gmht[141] = 425485497;
        kx.gmht[142] = 1107258793;
        kx.gmht[143] = 311383139;
        kx.gmht[144] = 1459917791;
        kx.gmht[145] = -1693399642;
        kx.gmht[146] = -1357713271;
        kx.gmht[147] = 1471874303;
        kx.gmht[148] = -50888570;
        kx.gmht[149] = -1445767600;
        kx.gmht[150] = -74933101;
        kx.gmht[151] = 702986121;
        kx.gmht[152] = 1723296404;
        kx.gmht[153] = -1187722224;
        kx.gmht[154] = -1861788883;
        kx.gmht[155] = -1928456677;
        kx.gmht[156] = -1981702736;
        kx.gmht[157] = 2130312826;
        kx.gmht[158] = 1258688335;
        kx.gmht[159] = -359898178;
        kx.gmht[160] = -329194427;
        kx.gmht[161] = -795342998;
        kx.gmht[162] = 1640239045;
        kx.gmht[163] = 1440858188;
        kx.gmht[164] = -2033459648;
        kx.gmht[165] = 205741541;
        kx.gmht[166] = 1006137341;
        kx.gmht[167] = -2039982000;
        kx.gmht[168] = -1015468921;
        kx.gmht[169] = -1887298481;
        kx.gmht[170] = 959851484;
        kx.gmht[171] = -1283011804;
        kx.gmht[172] = 1760440115;
        kx.gmht[173] = -276765907;
        kx.gmht[174] = 434116526;
        kx.gmht[175] = 754782515;
        kx.gmht[176] = -459621886;
        kx.gmht[177] = 1144009508;
        kx.gmht[178] = -112092313;
        kx.gmht[179] = 1723078258;
        kx.gmht[180] = -781813689;
        kx.gmht[181] = 1983266936;
        kx.gmht[182] = 1525621684;
        kx.gmht[183] = -219620058;
        kx.gmht[184] = -243495990;
        kx.gmht[185] = 153327196;
        kx.gmht[186] = -1220849069;
        kx.gmht[187] = 2008600686;
        kx.gmht[188] = 430314300;
        kx.gmht[189] = -92176371;
        kx.gmht[190] = 1712728879;
        kx.gmht[191] = 339414272;
        kx.gmht[192] = 1688099086;
        kx.gmht[193] = -1248290735;
        kx.gmht[194] = -724271722;
        kx.gmht[195] = -1492558451;
        kx.gmht[196] = -1738013774;
        kx.gmht[197] = 1311242127;
        kx.gmht[198] = -625630200;
        kx.gmht[199] = -1514947099;
    }
}

