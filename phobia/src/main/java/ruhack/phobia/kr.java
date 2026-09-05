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
import java.nio.ByteBuffer;
import java.util.OptionalInt;
import java.util.function.Supplier;
import net.minecraft.class_10789;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import org.joml.Matrix4f;
import org.lwjgl.system.MemoryUtil;
import ruhack.phobia.kq;
import ruhack.phobia.ks;
import ruhack.phobia.ku;
import ruhack.phobia.oq;

public class kr {
    static private int[] hcyt;
    static private long[] hcyy;
    static private ByteBuffer glyphData;
    static private long[] hcyz;
    static private boolean initialized;
    static private ks batchFont;
    static private boolean batching;
    static public final int b;
    static private float batchRotation;
    static private GpuBuffer msdfBuffer;
    static private final int MAX_GLYPHS = 256;
    static private int[] hcys;
    static private final int GLYPH_VECTORS = 3;
    static private RenderPipeline pipeline;
    static public final boolean c;
    static private int batchGlyphCount;
    static public final boolean a;
    static private final int MSDF_DATA_SIZE = 128;
    static private float batchZ;
    static private GpuBuffer glyphBuffer;
    static private ByteBuffer msdfData;
    static final long oc = -4036855888221805582L;
    static private Matrix4f batchMatrix;
    static private final int GLYPH_DATA_SIZE = 12288;

    private static void hexz() {
        kr.hcyt[0] = -2032727686;
        kr.hcyt[1] = -868247944;
        kr.hcyt[2] = 1056526651;
        kr.hcyt[3] = -1289221201;
        kr.hcyt[4] = 657797773;
        kr.hcyt[5] = 2067045208;
        kr.hcyt[6] = -600415478;
        kr.hcyt[7] = -1111498242;
        kr.hcyt[8] = 1963269774;
        kr.hcyt[9] = -261410639;
        kr.hcyt[10] = -1298718379;
        kr.hcyt[11] = -2105210157;
        kr.hcyt[12] = -1954487667;
        kr.hcyt[13] = 95181115;
        kr.hcyt[14] = 1956151968;
        kr.hcyt[15] = 1678489719;
        kr.hcyt[16] = 1081365200;
        kr.hcyt[17] = 703006698;
        kr.hcyt[18] = -2007450531;
        kr.hcyt[19] = 1280215267;
        kr.hcyt[20] = 1374641552;
        kr.hcyt[21] = 1488537570;
        kr.hcyt[22] = -1962910381;
        kr.hcyt[23] = -868022377;
        kr.hcyt[24] = -862598584;
        kr.hcyt[25] = -1695824784;
        kr.hcyt[26] = -294623107;
        kr.hcyt[27] = 760477866;
        kr.hcyt[28] = -359323346;
        kr.hcyt[29] = 805919805;
        kr.hcyt[30] = -1459832270;
        kr.hcyt[31] = 801947938;
        kr.hcyt[32] = -1400129791;
        kr.hcyt[33] = 167785408;
        kr.hcyt[34] = 713366405;
        kr.hcyt[35] = -2044559227;
        kr.hcyt[36] = -250398459;
        kr.hcyt[37] = -526583052;
        kr.hcyt[38] = -1031690258;
        kr.hcyt[39] = 1455206319;
        kr.hcyt[40] = 961484107;
        kr.hcyt[41] = -494380469;
        kr.hcyt[42] = -1262655191;
        kr.hcyt[43] = 631789798;
        kr.hcyt[44] = 957164342;
        kr.hcyt[45] = -1485194527;
        kr.hcyt[46] = -1597747874;
        kr.hcyt[47] = -893502165;
        kr.hcyt[48] = 738013241;
        kr.hcyt[49] = -1294869004;
        kr.hcyt[50] = 951573377;
        kr.hcyt[51] = 1752529618;
        kr.hcyt[52] = 393909477;
        kr.hcyt[53] = 1912797076;
        kr.hcyt[54] = -779073029;
        kr.hcyt[55] = 1763805525;
        kr.hcyt[56] = 1302410786;
        kr.hcyt[57] = 106119318;
        kr.hcyt[58] = 1057348489;
        kr.hcyt[59] = 619945572;
        kr.hcyt[60] = -484090180;
        kr.hcyt[61] = 1625437134;
        kr.hcyt[62] = -88562076;
        kr.hcyt[63] = 402968639;
        kr.hcyt[64] = 1240194337;
        kr.hcyt[65] = -1045960068;
        kr.hcyt[66] = 1995123106;
        kr.hcyt[67] = 774867272;
        kr.hcyt[68] = -555273880;
        kr.hcyt[69] = -1180087290;
        kr.hcyt[70] = 59135195;
        kr.hcyt[71] = 668213459;
        kr.hcyt[72] = 780867477;
        kr.hcyt[73] = -1928133401;
        kr.hcyt[74] = 241427983;
        kr.hcyt[75] = 269331776;
        kr.hcyt[76] = -1065881061;
        kr.hcyt[77] = -1768392473;
        kr.hcyt[78] = 541475271;
        kr.hcyt[79] = 395928396;
        kr.hcyt[80] = -451684191;
        kr.hcyt[81] = -376232820;
        kr.hcyt[82] = -2068633223;
        kr.hcyt[83] = 1761875619;
        kr.hcyt[84] = -824226039;
        kr.hcyt[85] = 1731338704;
        kr.hcyt[86] = 1851323440;
        kr.hcyt[87] = 131510201;
        kr.hcyt[88] = 28305581;
        kr.hcyt[89] = 1137755155;
        kr.hcyt[90] = -369349268;
        kr.hcyt[91] = -290215207;
        kr.hcyt[92] = 601578475;
        kr.hcyt[93] = 1065779026;
        kr.hcyt[94] = 2036710982;
        kr.hcyt[95] = 618984573;
        kr.hcyt[96] = -1795044893;
        kr.hcyt[97] = -1217294695;
        kr.hcyt[98] = -1935145768;
        kr.hcyt[99] = -1141197088;
    }

    private static void hexx() {
        kr.hcys[600] = 369933186;
        kr.hcys[601] = -1482059880;
        kr.hcys[602] = 258262197;
        kr.hcys[603] = 635578730;
        kr.hcys[604] = -1682413431;
        kr.hcys[605] = -969707957;
        kr.hcys[606] = 1627448004;
        kr.hcys[607] = 707160400;
        kr.hcys[608] = -749633066;
        kr.hcys[609] = 1666073003;
        kr.hcys[610] = -1261949866;
        kr.hcys[611] = 202609956;
        kr.hcys[612] = 1997288312;
        kr.hcys[613] = 432902241;
        kr.hcys[614] = -1748093994;
        kr.hcys[615] = -2078974139;
        kr.hcys[616] = 534969836;
        kr.hcys[617] = -334316615;
        kr.hcys[618] = -117559889;
        kr.hcys[619] = -790568344;
        kr.hcys[620] = 1327280308;
        kr.hcys[621] = -1160457401;
        kr.hcys[622] = 584760571;
        kr.hcys[623] = -319297795;
        kr.hcys[624] = -66656498;
        kr.hcys[625] = -1354997272;
        kr.hcys[626] = -989933205;
        kr.hcys[627] = -2052128221;
        kr.hcys[628] = -1812119651;
        kr.hcys[629] = 1025734214;
        kr.hcys[630] = 1824514533;
        kr.hcys[631] = -951485149;
        kr.hcys[632] = 1958341311;
        kr.hcys[633] = 487384462;
        kr.hcys[634] = 1531119182;
        kr.hcys[635] = 1668823034;
        kr.hcys[636] = 1334227449;
        kr.hcys[637] = 1317345669;
        kr.hcys[638] = 2087368523;
        kr.hcys[639] = 581433892;
        kr.hcys[640] = 330555153;
        kr.hcys[641] = -605027748;
        kr.hcys[642] = -333761467;
        kr.hcys[643] = -2040600799;
        kr.hcys[644] = -1255365557;
        kr.hcys[645] = 1827470379;
        kr.hcys[646] = -1028663476;
        kr.hcys[647] = -89125915;
        kr.hcys[648] = -1487475878;
        kr.hcys[649] = 498253203;
        kr.hcys[650] = 509335656;
        kr.hcys[651] = 2043098024;
        kr.hcys[652] = -1629049258;
        kr.hcys[653] = 1297261684;
        kr.hcys[654] = -1579858649;
        kr.hcys[655] = 1979613454;
        kr.hcys[656] = -315932733;
        kr.hcys[657] = 1945367422;
        kr.hcys[658] = 22098361;
        kr.hcys[659] = 806516084;
        kr.hcys[660] = -18930792;
        kr.hcys[661] = -1173564238;
        kr.hcys[662] = 298083111;
        kr.hcys[663] = 387998564;
        kr.hcys[664] = -1914085588;
        kr.hcys[665] = 866661998;
        kr.hcys[666] = 63700523;
        kr.hcys[667] = 1785100836;
        kr.hcys[668] = 1661559662;
        kr.hcys[669] = -601566393;
        kr.hcys[670] = -1479150086;
        kr.hcys[671] = -2139364939;
        kr.hcys[672] = -128649886;
        kr.hcys[673] = -657785385;
        kr.hcys[674] = 1952007808;
        kr.hcys[675] = -131426129;
        kr.hcys[676] = 1778497934;
        kr.hcys[677] = 408682465;
        kr.hcys[678] = 1969895757;
        kr.hcys[679] = -1015280870;
        kr.hcys[680] = 1315586757;
        kr.hcys[681] = 613884881;
        kr.hcys[682] = -1091093729;
        kr.hcys[683] = -1054567715;
        kr.hcys[684] = -757543001;
        kr.hcys[685] = 1172159172;
        kr.hcys[686] = -1530985175;
        kr.hcys[687] = 847861953;
        kr.hcys[688] = -962588104;
        kr.hcys[689] = -505367460;
        kr.hcys[690] = 349773861;
        kr.hcys[691] = 1079986249;
        kr.hcys[692] = -1548964779;
        kr.hcys[693] = 165124871;
        kr.hcys[694] = 2008416607;
        kr.hcys[695] = 1419315603;
        kr.hcys[696] = -1723841971;
        kr.hcys[697] = 1416235788;
        kr.hcys[698] = 1795967611;
        kr.hcys[699] = -247121736;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void drawStringColored(Matrix4f var0, ks var1_1, String var2_2, float var3_3, float var4_4, float var5_5, int[] var6_6, float var7_7) {
        block180: {
            block179: {
                block178: {
                    var22_8 = kr.c;
                    var21_9 /* !! */  = kr.b;
                    var20_10 = kr.a;
                    if (var22_8) {
                        throw null;
lbl6:
                        // 49 sources

                        return;
                    }
                    if (var20_10 || var20_10) ** GOTO lbl6
                    if (!kr.initialized) break block178;
                    if (var20_10) ** GOTO lbl6
                    if (var1_1 == null) break block178;
                    if (var20_10) ** GOTO lbl6
                    if (!var1_1.isLoaded()) break block178;
                    if (var20_10) ** GOTO lbl6
                    if (var2_2.isEmpty()) break block178;
                    if (var20_10) ** GOTO lbl6
                    if (var6_6.length != 0) break block179;
                    if (var20_10) ** GOTO lbl6
                }
                if (var20_10 || var20_10) ** GOTO lbl6
                return;
            }
            if (var20_10 || var20_10) ** GOTO lbl6
            if (!kr.batching) break block180;
            if (var20_10 || var20_10) ** GOTO lbl6
            kr.appendString(var0, var1_1, var2_2, var3_3, var4_4, var5_5, (int)kr.hcyu("hdfh", hcyr(int ), (int)162), var6_6, 0.0f, var7_7);
            if (var20_10 || var20_10) ** GOTO lbl6
            return;
        }
        if (var20_10 || var20_10) ** GOTO lbl6
        var8_11 = var5_5 / var1_1.getEmSize();
        if (var20_10 || var20_10) ** GOTO lbl6
        var9_12 = var3_3;
        if (var20_10 || var20_10) ** GOTO lbl6
        var10_13 = var4_4 + var1_1.getAscender() * var8_11;
        if (var20_10 || var20_10) ** GOTO lbl6
        kr.prepareMsdfData(var0, var1_1, (int)kr.hcyu("hdfi", hcyr(int ), (int)163), 0.0f, var7_7);
        if (var20_10 || var20_10) ** GOTO lbl6
        kr.glyphData.clear();
        if (var20_10 || var20_10) ** GOTO lbl6
        var11_14 = kr.hcyu("hdfj", hcyr(int ), (int)164);
        if (var20_10) ** GOTO lbl6
        if (var21_9 /* !! */  == 0) ** GOTO lbl-1000
        switch (var21_9 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var20_10) ** GOTO lbl6
                var12_15 = kr.hcyu("hdfk", hcyr(int ), (int)165);
                if (var20_10) ** GOTO lbl6
                do {
                    if (var20_10 || var20_10) ** GOTO lbl6
                    if (var12_15 >= var2_2.length()) ** GOTO lbl105
                    if (var20_10) ** GOTO lbl6
                    if (var11_14 >= kr.hcyu("hdfl", hcyr(int ), (int)166)) ** GOTO lbl105
                    if (var20_10 || var20_10) ** GOTO lbl6
                    var13_16 = var2_2.charAt((int)var12_15);
                    if (var20_10 || var20_10) ** GOTO lbl6
                    var14_17 = var1_1.getGlyph(var13_16);
                    if (var20_10 || var20_10) ** GOTO lbl6
                    if (var14_17 != null) ** GOTO lbl69
                    if (var20_10 || var20_10) ** GOTO lbl6
                    var14_17 = var1_1.getGlyph((int)kr.hcyu("hdfm", hcyr(int ), (int)167));
                    if (var20_10 || var20_10) ** GOTO lbl6
                    if (var14_17 != null) ** GOTO lbl69
                    if (var20_10 || var20_10) ** GOTO lbl6
                    if (var22_8) {
                        throw null;
                    }
                    ** GOTO lbl100
lbl69:
                    // 2 sources

                    if (var20_10 || var20_10) ** GOTO lbl6
                    if (!(var14_17.width > 0.0f)) ** GOTO lbl97
                    if (var20_10) ** GOTO lbl6
                    if (!(var14_17.height > 0.0f)) ** GOTO lbl97
                    if (var20_10 || var20_10) ** GOTO lbl6
                    var15_18 = var6_6[var12_15 % var6_6.length];
                    if (var20_10 || var20_10) ** GOTO lbl6
                    var16_19 = var9_12 + var14_17.bearingX * var8_11;
                    if (var20_10 || var20_10) ** GOTO lbl6
                    var17_20 = var10_13 - var14_17.bearingY * var8_11;
                    if (var20_10 || var20_10) ** GOTO lbl6
                    var18_21 = var14_17.width * var8_11;
                    if (var20_10 || var20_10) ** GOTO lbl6
                    var19_22 = var14_17.height * var8_11;
                    if (var20_10 || var20_10) ** GOTO lbl6
                    kr.glyphData.putFloat(var16_19).putFloat(var17_20).putFloat(var18_21).putFloat(var19_22);
                    if (var20_10 || var20_10) ** GOTO lbl6
                    kr.glyphData.putFloat(var14_17.u0).putFloat(var14_17.v0);
                    if (var20_10 || var20_10) ** GOTO lbl6
                    kr.glyphData.putFloat(var14_17.u1 - var14_17.u0).putFloat(var14_17.v1 - var14_17.v0);
                    if (var20_10 || var20_10) ** GOTO lbl6
                    kr.putColor(kr.glyphData, var15_18);
                    if (var20_10 || var20_10) ** GOTO lbl6
                    ++var11_14;
                    if (var20_10) ** GOTO lbl6
lbl97:
                    // 3 sources

                    if (var20_10 || var20_10) ** GOTO lbl6
                    var9_12 += var14_17.advance * var8_11;
                    if (var20_10) ** GOTO lbl6
lbl100:
                    // 2 sources

                    if (var20_10 || var20_10) ** GOTO lbl6
                    ++var12_15;
                    if (var20_10) ** GOTO lbl6
                } while (!var22_8);
                throw null;
lbl105:
                // 2 sources

                if (var20_10 || var20_10) ** GOTO lbl6
                if (var11_14 != false) ** GOTO lbl109
                if (var20_10 || var20_10) ** GOTO lbl6
                return;
lbl109:
                // 1 sources

                if (var20_10 || var20_10) ** GOTO lbl6
                kr.glyphData.flip();
                if (var20_10 || var20_10) ** GOTO lbl6
                kr.render(var1_1, (int)var11_14);
                if (!var20_10 && !var20_10) ** break;
                ** continue;
                return;
            }
lbl117:
            // 2 sources

            case 0: {
                var21_9 /* !! */  = (int)kr.hcyu("hdfn", hcyr(int ), (int)168);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl337
            }
lbl122:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var21_9 /* !! */  = (int)kr.hcyu("hdfo", hcyr(int ), (int)169);
                    if (var22_8) {
                        throw null;
                    }
                    ** GOTO lbl345
                    break;
                }
            }
            case 2: {
                var21_9 /* !! */  = (int)kr.hcyu("hdfp", hcyr(int ), (int)170);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl481
            }
lbl133:
            // 2 sources

            case 3: {
                var21_9 /* !! */  = (int)kr.hcyu("hdfq", hcyr(int ), (int)171);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl231
            }
lbl138:
            // 2 sources

            case 4: {
                var21_9 /* !! */  = (int)kr.hcyu("hdfr", hcyr(int ), (int)172);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl345
            }
            case 5: {
                var21_9 /* !! */  = (int)kr.hcyu("hdfs", hcyr(int ), (int)173);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 6: {
                var21_9 /* !! */  = (int)kr.hcyu("hdft", hcyr(int ), (int)174);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl510
            }
            case 7: {
                var21_9 /* !! */  = (int)kr.hcyu("hdfu", hcyr(int ), (int)175);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl255
            }
lbl158:
            // 3 sources

            case 8: {
                var21_9 /* !! */  = (int)kr.hcyu("hdfv", hcyr(int ), (int)176);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl385
            }
            case 9: {
                var21_9 /* !! */  = (int)kr.hcyu("hdfw", hcyr(int ), (int)177);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl168:
            // 2 sources

            case 10: {
                var21_9 /* !! */  = (int)kr.hcyu("hdfx", hcyr(int ), (int)178);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl404
            }
            case 11: {
                var21_9 /* !! */  = (int)kr.hcyu("hdfy", hcyr(int ), (int)179);
                if (!var22_8) ** GOTO lbl122
                throw null;
            }
lbl177:
            // 2 sources

            case 12: {
                var21_9 /* !! */  = (int)kr.hcyu("hdfz", hcyr(int ), (int)180);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl260
            }
            case 13: {
                var21_9 /* !! */  = (int)kr.hcyu("hdga", hcyr(int ), (int)181);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl192
            }
lbl187:
            // 2 sources

            case 14: {
                var21_9 /* !! */  = (int)kr.hcyu("hdgb", hcyr(int ), (int)182);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl430
            }
lbl192:
            // 3 sources

            case 15: {
                var21_9 /* !! */  = (int)kr.hcyu("hdgc", hcyr(int ), (int)183);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl341
            }
lbl197:
            // 3 sources

            case 16: {
                var21_9 /* !! */  = (int)kr.hcyu("hdgd", hcyr(int ), (int)184);
                if (!var22_8) ** GOTO lbl192
                throw null;
            }
lbl201:
            // 2 sources

            case 17: {
                var21_9 /* !! */  = (int)kr.hcyu("hdge", hcyr(int ), (int)185);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl327
            }
lbl206:
            // 2 sources

            case 18: {
                var21_9 /* !! */  = (int)kr.hcyu("hdgf", hcyr(int ), (int)186);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl322
            }
            case 19: {
                var21_9 /* !! */  = (int)kr.hcyu("hdgg", hcyr(int ), (int)187);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl246
            }
            case 20: {
                var21_9 /* !! */  = (int)kr.hcyu("hdgh", hcyr(int ), (int)188);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl274
            }
lbl221:
            // 4 sources

            case 21: {
                var21_9 /* !! */  = (int)kr.hcyu("hdgi", hcyr(int ), (int)189);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl236
            }
lbl226:
            // 2 sources

            case 22: {
                var21_9 /* !! */  = (int)kr.hcyu("hdgj", hcyr(int ), (int)190);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl413
            }
lbl231:
            // 2 sources

            case 23: {
                var21_9 /* !! */  = (int)kr.hcyu("hdgk", hcyr(int ), (int)191);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl409
            }
lbl236:
            // 2 sources

            case 24: {
                var21_9 /* !! */  = (int)kr.hcyu("hdgl", hcyr(int ), (int)192);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl291
            }
lbl241:
            // 2 sources

            case 25: {
                var21_9 /* !! */  = (int)kr.hcyu("hdgm", hcyr(int ), (int)193);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl337
            }
lbl246:
            // 3 sources

            case 26: {
                var21_9 /* !! */  = (int)kr.hcyu("hdgn", hcyr(int ), (int)194);
                if (!var22_8) ** GOTO lbl168
                throw null;
            }
            case 27: {
                var21_9 /* !! */  = (int)kr.hcyu("hdgo", hcyr(int ), (int)195);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl349
            }
lbl255:
            // 3 sources

            case 28: {
                var21_9 /* !! */  = (int)kr.hcyu("hdgp", hcyr(int ), (int)196);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl296
            }
lbl260:
            // 2 sources

            case 29: {
                var21_9 /* !! */  = (int)kr.hcyu("hdgq", hcyr(int ), (int)197);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl269
            }
            case 30: {
                var21_9 /* !! */  = (int)kr.hcyu("hdgr", hcyr(int ), (int)198);
                if (!var22_8) ** GOTO lbl133
                throw null;
            }
lbl269:
            // 3 sources

            case 31: {
                var21_9 /* !! */  = (int)kr.hcyu("hdgs", hcyr(int ), (int)199);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl468
            }
lbl274:
            // 2 sources

            case 32: {
                var21_9 /* !! */  = (int)kr.hcyu("hdgt", hcyr(int ), (int)200);
                if (!var22_8) ** GOTO lbl226
                throw null;
            }
            case 33: {
                var21_9 /* !! */  = (int)kr.hcyu("hdgu", hcyr(int ), (int)201);
                if (!var22_8) ** GOTO lbl158
                throw null;
            }
lbl282:
            // 2 sources

            case 34: {
                var21_9 /* !! */  = (int)kr.hcyu("hdgv", hcyr(int ), (int)202);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl434
            }
lbl287:
            // 2 sources

            case 35: {
                var21_9 /* !! */  = (int)kr.hcyu("hdgw", hcyr(int ), (int)203);
                if (!var22_8) ** GOTO lbl158
                throw null;
            }
lbl291:
            // 2 sources

            case 36: {
                var21_9 /* !! */  = (int)kr.hcyu("hdgx", hcyr(int ), (int)204);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl473
            }
lbl296:
            // 2 sources

            case 37: {
                var21_9 /* !! */  = (int)kr.hcyu("hdgy", hcyr(int ), (int)205);
                if (!var22_8) ** GOTO lbl246
                throw null;
            }
            case 38: {
                var21_9 /* !! */  = (int)kr.hcyu("hdgz", hcyr(int ), (int)206);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl443
            }
lbl305:
            // 3 sources

            case 39: {
                var21_9 /* !! */  = (int)kr.hcyu("hdha", hcyr(int ), (int)207);
                if (!var22_8) ** GOTO lbl206
                throw null;
            }
            case 40: {
                var21_9 /* !! */  = (int)kr.hcyu("hdhb", hcyr(int ), (int)208);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl481
            }
            case 41: {
                var21_9 /* !! */  = (int)kr.hcyu("hdhc", hcyr(int ), (int)209);
                if (!var22_8) ** GOTO lbl221
                throw null;
            }
            case 42: {
                var21_9 /* !! */  = (int)kr.hcyu("hdhd", hcyr(int ), (int)210);
                if (!var22_8) ** GOTO lbl117
                throw null;
            }
lbl322:
            // 2 sources

            case 43: {
                var21_9 /* !! */  = (int)kr.hcyu("hdhe", hcyr(int ), (int)211);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl443
            }
lbl327:
            // 3 sources

            case 44: {
                var21_9 /* !! */  = (int)kr.hcyu("hdhf", hcyr(int ), (int)212);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl422
            }
            case 45: {
                var21_9 /* !! */  = (int)kr.hcyu("hdhg", hcyr(int ), (int)213);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl498
            }
lbl337:
            // 4 sources

            case 46: {
                var21_9 /* !! */  = (int)kr.hcyu("hdhh", hcyr(int ), (int)214);
                if (!var22_8) ** GOTO lbl287
                throw null;
            }
lbl341:
            // 4 sources

            case 47: {
                var21_9 /* !! */  = (int)kr.hcyu("hdhi", hcyr(int ), (int)215);
                if (!var22_8) ** GOTO lbl177
                throw null;
            }
lbl345:
            // 4 sources

            case 48: {
                var21_9 /* !! */  = (int)kr.hcyu("hdhj", hcyr(int ), (int)216);
                if (!var22_8) ** GOTO lbl305
                throw null;
            }
lbl349:
            // 2 sources

            case 49: {
                var21_9 /* !! */  = (int)kr.hcyu("hdhk", hcyr(int ), (int)217);
                if (!var22_8) ** GOTO lbl221
                throw null;
            }
            case 50: {
                var21_9 /* !! */  = (int)kr.hcyu("hdhl", hcyr(int ), (int)218);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl443
            }
            case 51: {
                var21_9 /* !! */  = (int)kr.hcyu("hdhm", hcyr(int ), (int)219);
                if (!var22_8) ** GOTO lbl282
                throw null;
            }
            case 52: {
                var21_9 /* !! */  = (int)kr.hcyu("hdhn", hcyr(int ), (int)220);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl481
            }
lbl367:
            // 2 sources

            case 53: {
                var21_9 /* !! */  = (int)kr.hcyu("hdho", hcyr(int ), (int)221);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl385
            }
            case 54: {
                var21_9 /* !! */  = (int)kr.hcyu("hdhp", hcyr(int ), (int)222);
                if (!var22_8) ** GOTO lbl341
                throw null;
            }
lbl376:
            // 3 sources

            case 55: {
                var21_9 /* !! */  = (int)kr.hcyu("hdhq", hcyr(int ), (int)223);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl426
            }
lbl381:
            // 2 sources

            case 56: {
                var21_9 /* !! */  = (int)kr.hcyu("hdhr", hcyr(int ), (int)224);
                if (!var22_8) ** GOTO lbl187
                throw null;
            }
lbl385:
            // 3 sources

            case 57: {
                var21_9 /* !! */  = (int)kr.hcyu("hdhs", hcyr(int ), (int)225);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl493
            }
            case 58: {
                var21_9 /* !! */  = (int)kr.hcyu("hdht", hcyr(int ), (int)226);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl447
            }
            case 59: {
                var21_9 /* !! */  = (int)kr.hcyu("hdhu", hcyr(int ), (int)227);
                if (!var22_8) ** GOTO lbl201
                throw null;
            }
lbl399:
            // 3 sources

            case 60: {
                var21_9 /* !! */  = (int)kr.hcyu("hdhv", hcyr(int ), (int)228);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl460
            }
lbl404:
            // 2 sources

            case 61: {
                var21_9 /* !! */  = (int)kr.hcyu("hdhw", hcyr(int ), (int)229);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl518
            }
lbl409:
            // 2 sources

            case 62: {
                var21_9 /* !! */  = (int)kr.hcyu("hdhx", hcyr(int ), (int)230);
                if (!var22_8) ** GOTO lbl376
                throw null;
            }
lbl413:
            // 2 sources

            case 63: {
                var21_9 /* !! */  = (int)kr.hcyu("hdhy", hcyr(int ), (int)231);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl514
            }
lbl418:
            // 3 sources

            case 64: {
                var21_9 /* !! */  = (int)kr.hcyu("hdhz", hcyr(int ), (int)232);
                if (!var22_8) ** GOTO lbl376
                throw null;
            }
lbl422:
            // 2 sources

            case 65: {
                var21_9 /* !! */  = (int)kr.hcyu("hdia", hcyr(int ), (int)233);
                if (!var22_8) ** GOTO lbl241
                throw null;
            }
lbl426:
            // 2 sources

            case 66: {
                var21_9 /* !! */  = (int)kr.hcyu("hdib", hcyr(int ), (int)234);
                if (!var22_8) ** GOTO lbl345
                throw null;
            }
lbl430:
            // 2 sources

            case 67: {
                var21_9 /* !! */  = (int)kr.hcyu("hdic", hcyr(int ), (int)235);
                if (!var22_8) ** GOTO lbl367
                throw null;
            }
lbl434:
            // 2 sources

            case 68: {
                var21_9 /* !! */  = (int)kr.hcyu("hdid", hcyr(int ), (int)236);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl518
            }
            case 69: {
                var21_9 /* !! */  = (int)kr.hcyu("hdie", hcyr(int ), (int)237);
                if (!var22_8) ** GOTO lbl399
                throw null;
            }
lbl443:
            // 4 sources

            case 70: {
                var21_9 /* !! */  = (int)kr.hcyu("hdif", hcyr(int ), (int)238);
                if (!var22_8) ** GOTO lbl221
                throw null;
            }
lbl447:
            // 3 sources

            case 71: {
                var21_9 /* !! */  = (int)kr.hcyu("hdig", hcyr(int ), (int)239);
                if (!var22_8) ** GOTO lbl418
                throw null;
            }
            case 72: {
                var21_9 /* !! */  = (int)kr.hcyu("hdih", hcyr(int ), (int)240);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl493
            }
lbl456:
            // 2 sources

            case 73: {
                var21_9 /* !! */  = (int)kr.hcyu("hdii", hcyr(int ), (int)241);
                if (!var22_8) ** GOTO lbl447
                throw null;
            }
lbl460:
            // 3 sources

            case 74: {
                var21_9 /* !! */  = (int)kr.hcyu("hdij", hcyr(int ), (int)242);
                if (!var22_8) ** GOTO lbl255
                throw null;
            }
            case 75: {
                var21_9 /* !! */  = (int)kr.hcyu("hdik", hcyr(int ), (int)243);
                if (!var22_8) ** GOTO lbl399
                throw null;
            }
lbl468:
            // 2 sources

            case 76: {
                var21_9 /* !! */  = (int)kr.hcyu("hdil", hcyr(int ), (int)244);
                if (var22_8) {
                    throw null;
                }
                ** GOTO lbl502
            }
lbl473:
            // 2 sources

            case 77: {
                var21_9 /* !! */  = (int)kr.hcyu("hdim", hcyr(int ), (int)245);
                if (!var22_8) ** GOTO lbl138
                throw null;
            }
lbl477:
            // 2 sources

            case 78: {
                var21_9 /* !! */  = (int)kr.hcyu("hdin", hcyr(int ), (int)246);
                if (!var22_8) ** GOTO lbl269
                throw null;
            }
lbl481:
            // 4 sources

            case 79: {
                var21_9 /* !! */  = (int)kr.hcyu("hdio", hcyr(int ), (int)247);
                if (!var22_8) ** GOTO lbl305
                throw null;
            }
            case 80: {
                var21_9 /* !! */  = (int)kr.hcyu("hdip", hcyr(int ), (int)248);
                if (!var22_8) ** GOTO lbl460
                throw null;
            }
            case 81: {
                var21_9 /* !! */  = (int)kr.hcyu("hdiq", hcyr(int ), (int)249);
                if (!var22_8) ** GOTO lbl337
                throw null;
            }
lbl493:
            // 3 sources

            case 82: {
                do {
                    var21_9 /* !! */  = (int)kr.hcyu("hdir", hcyr(int ), (int)250);
                } while (!var22_8);
                throw null;
            }
lbl498:
            // 2 sources

            case 83: {
                var21_9 /* !! */  = (int)kr.hcyu("hdis", hcyr(int ), (int)251);
                if (!var22_8) ** GOTO lbl456
                throw null;
            }
lbl502:
            // 2 sources

            case 84: {
                var21_9 /* !! */  = (int)kr.hcyu("hdit", hcyr(int ), (int)252);
                if (!var22_8) ** GOTO lbl327
                throw null;
            }
            case 85: {
                var21_9 /* !! */  = (int)kr.hcyu("hdiu", hcyr(int ), (int)253);
                if (!var22_8) ** GOTO lbl341
                throw null;
            }
lbl510:
            // 2 sources

            case 86: {
                var21_9 /* !! */  = (int)kr.hcyu("hdiv", hcyr(int ), (int)254);
                if (!var22_8) ** GOTO lbl477
                throw null;
            }
lbl514:
            // 2 sources

            case 87: {
                var21_9 /* !! */  = (int)kr.hcyu("hdiw", hcyr(int ), (int)255);
                if (!var22_8) ** GOTO lbl418
                throw null;
            }
lbl518:
            // 3 sources

            case 88: {
                var21_9 /* !! */  = (int)kr.hcyu("hdix", hcyr(int ), (int)256);
                if (!var22_8) ** GOTO lbl381
                throw null;
            }
            case 89: 
        }
        var21_9 /* !! */  = (int)kr.hcyu("hdiy", hcyr(int ), (int)257);
        ** while (!var22_8)
lbl525:
        // 1 sources

        throw null;
    }

    private static void hexr() {
        kr.hcys[0] = -2032727686;
        kr.hcys[1] = -868247824;
        kr.hcys[2] = 1056526771;
        kr.hcys[3] = -1289221329;
        kr.hcys[4] = 657785485;
        kr.hcys[5] = 2067045209;
        kr.hcys[6] = -600415479;
        kr.hcys[7] = -1111498269;
        kr.hcys[8] = 1963269779;
        kr.hcys[9] = -261410639;
        kr.hcys[10] = -1298718382;
        kr.hcys[11] = -2105210156;
        kr.hcys[12] = -1954487660;
        kr.hcys[13] = 95181106;
        kr.hcys[14] = 1956151988;
        kr.hcys[15] = 1678489700;
        kr.hcys[16] = 1081365214;
        kr.hcys[17] = 703006707;
        kr.hcys[18] = -2007450537;
        kr.hcys[19] = 1280215264;
        kr.hcys[20] = 1374641536;
        kr.hcys[21] = 1488537572;
        kr.hcys[22] = -1962910393;
        kr.hcys[23] = -868022395;
        kr.hcys[24] = -862598574;
        kr.hcys[25] = -1695824787;
        kr.hcys[26] = -294623130;
        kr.hcys[27] = 760477874;
        kr.hcys[28] = -359323347;
        kr.hcys[29] = 805919801;
        kr.hcys[30] = -1459832258;
        kr.hcys[31] = 801947958;
        kr.hcys[32] = -1400129791;
        kr.hcys[33] = 167785431;
        kr.hcys[34] = 713366413;
        kr.hcys[35] = -2044559207;
        kr.hcys[36] = -250398443;
        kr.hcys[37] = -526583285;
        kr.hcys[38] = -2114017298;
        kr.hcys[39] = 1455206311;
        kr.hcys[40] = 961484212;
        kr.hcys[41] = -1577625013;
        kr.hcys[42] = -1262655018;
        kr.hcys[43] = 1725389030;
        kr.hcys[44] = 957164334;
        kr.hcys[45] = -1485194722;
        kr.hcys[46] = -474264226;
        kr.hcys[47] = -893502165;
        kr.hcys[48] = 738013241;
        kr.hcys[49] = -1294869260;
        kr.hcys[50] = 951573438;
        kr.hcys[51] = 1752529562;
        kr.hcys[52] = 393909376;
        kr.hcys[53] = 1912797084;
        kr.hcys[54] = -779073034;
        kr.hcys[55] = 1763805447;
        kr.hcys[56] = 1302410785;
        kr.hcys[57] = 106119369;
        kr.hcys[58] = 1057348489;
        kr.hcys[59] = 619945552;
        kr.hcys[60] = -484090236;
        kr.hcys[61] = 1625437079;
        kr.hcys[62] = -88562171;
        kr.hcys[63] = 402968633;
        kr.hcys[64] = 1240194368;
        kr.hcys[65] = -1045960079;
        kr.hcys[66] = 1995123169;
        kr.hcys[67] = 774867284;
        kr.hcys[68] = -555273908;
        kr.hcys[69] = -1180087293;
        kr.hcys[70] = 59135104;
        kr.hcys[71] = 668213427;
        kr.hcys[72] = 780867510;
        kr.hcys[73] = -1928133441;
        kr.hcys[74] = 241427973;
        kr.hcys[75] = 269331721;
        kr.hcys[76] = -1065880996;
        kr.hcys[77] = -1768392505;
        kr.hcys[78] = 541475280;
        kr.hcys[79] = 395928391;
        kr.hcys[80] = -451684200;
        kr.hcys[81] = -376232763;
        kr.hcys[82] = -2068633317;
        kr.hcys[83] = 1761875625;
        kr.hcys[84] = -824226018;
        kr.hcys[85] = 1731338725;
        kr.hcys[86] = 1851323415;
        kr.hcys[87] = 131510149;
        kr.hcys[88] = 28305554;
        kr.hcys[89] = 1137755144;
        kr.hcys[90] = -369349366;
        kr.hcys[91] = -290215170;
        kr.hcys[92] = 601578420;
        kr.hcys[93] = 1065778950;
        kr.hcys[94] = 2036711019;
        kr.hcys[95] = 618984573;
        kr.hcys[96] = -1795044934;
        kr.hcys[97] = -1217294716;
        kr.hcys[98] = -1935145785;
        kr.hcys[99] = -1141197106;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static String lambda$init$0() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kr.oc - kr.hcyu("hexd", hcyx(int ), (int)120)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == kr.hcyu("hexe", hcyr(int ), (int)727)) break;
            v0 /* !! */  = (long)kr.hcyu("hexf", hcyr(int ), (int)728);
        }
        var2 = kr.c;
        v1 /* !! */  = kr.oc;
        if (true) ** GOTO lbl12
        block12: while (true) {
            v1 /* !! */  = (long)(v2 - kr.hcyu("hexg", hcyx(int ), (int)121));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1186822412: {
                    v2 = kr.hcyu("hexh", hcyx(int ), (int)122);
                    continue block12;
                }
                case 819601061: {
                    v2 = kr.hcyu("hexi", hcyx(int ), (int)123);
                    continue block12;
                }
                case 890790898: {
                    break block12;
                }
            }
            break;
        }
        var1_1 = kr.b;
        v3 /* !! */  = kr.oc;
        if (true) ** GOTO lbl26
        block13: while (true) {
            v3 /* !! */  = (long)(v4 - kr.hcyu("hexj", hcyx(int ), (int)124));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1076251022: {
                    v4 = kr.hcyu("hexk", hcyx(int ), (int)125);
                    continue block13;
                }
                case 313008967: {
                    v4 = kr.hcyu("hexl", hcyx(int ), (int)126);
                    continue block13;
                }
                case 358287917: {
                    v4 = kr.hcyu("hexm", hcyx(int ), (int)127);
                    continue block13;
                }
                case 890790898: {
                    break block13;
                }
            }
            break;
        }
        var0_2 = kr.a;
        if (var2) {
            throw null;
lbl41:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl44:
        // 1 sources

        return "Msdf2D MsdfData";
    }

    private static void heyf() {
        kr.hcyt[600] = -44156569;
        kr.hcyt[601] = 1482059879;
        kr.hcyt[602] = -504369178;
        kr.hcyt[603] = 635578730;
        kr.hcyt[604] = 1682413430;
        kr.hcyt[605] = 1334919422;
        kr.hcyt[606] = 1627448001;
        kr.hcyt[607] = 707160410;
        kr.hcyt[608] = -749633068;
        kr.hcyt[609] = 1666073002;
        kr.hcyt[610] = -1261949860;
        kr.hcyt[611] = 202609959;
        kr.hcyt[612] = 1997288317;
        kr.hcyt[613] = 432902244;
        kr.hcyt[614] = -1748093996;
        kr.hcyt[615] = -2078974137;
        kr.hcyt[616] = 534969854;
        kr.hcyt[617] = -334316622;
        kr.hcyt[618] = -117559900;
        kr.hcyt[619] = -790568326;
        kr.hcyt[620] = 1327280318;
        kr.hcyt[621] = -1160457405;
        kr.hcyt[622] = 584760554;
        kr.hcyt[623] = -319297804;
        kr.hcyt[624] = -66656508;
        kr.hcyt[625] = -1354997272;
        kr.hcyt[626] = -989933203;
        kr.hcyt[627] = -2052128249;
        kr.hcyt[628] = -1812119655;
        kr.hcyt[629] = 1025734246;
        kr.hcyt[630] = 1824514528;
        kr.hcyt[631] = -951485150;
        kr.hcyt[632] = 1958341291;
        kr.hcyt[633] = 487384462;
        kr.hcyt[634] = 1531119207;
        kr.hcyt[635] = 1668823033;
        kr.hcyt[636] = 1334227443;
        kr.hcyt[637] = 1317345675;
        kr.hcyt[638] = 2087368539;
        kr.hcyt[639] = 581433861;
        kr.hcyt[640] = 330555162;
        kr.hcyt[641] = -605027718;
        kr.hcyt[642] = -333761462;
        kr.hcyt[643] = -2040600785;
        kr.hcyt[644] = -1255365544;
        kr.hcyt[645] = 1827470399;
        kr.hcyt[646] = -1028663487;
        kr.hcyt[647] = -89125945;
        kr.hcyt[648] = -1487475874;
        kr.hcyt[649] = 498253206;
        kr.hcyt[650] = 509335628;
        kr.hcyt[651] = 2043098042;
        kr.hcyt[652] = -1629049226;
        kr.hcyt[653] = 1297261672;
        kr.hcyt[654] = -1579858627;
        kr.hcyt[655] = 1979613444;
        kr.hcyt[656] = -315932697;
        kr.hcyt[657] = 1945367391;
        kr.hcyt[658] = 22098348;
        kr.hcyt[659] = 806516067;
        kr.hcyt[660] = -18930787;
        kr.hcyt[661] = -1173564228;
        kr.hcyt[662] = 298083135;
        kr.hcyt[663] = 387998541;
        kr.hcyt[664] = -1914085623;
        kr.hcyt[665] = 866661991;
        kr.hcyt[666] = 63700523;
        kr.hcyt[667] = 1785100835;
        kr.hcyt[668] = 1661559622;
        kr.hcyt[669] = -601566393;
        kr.hcyt[670] = -1479150086;
        kr.hcyt[671] = -2139364955;
        kr.hcyt[672] = -128649860;
        kr.hcyt[673] = -657785388;
        kr.hcyt[674] = 1952007822;
        kr.hcyt[675] = -131426136;
        kr.hcyt[676] = 1778497929;
        kr.hcyt[677] = 408682473;
        kr.hcyt[678] = 1969895781;
        kr.hcyt[679] = -1015280889;
        kr.hcyt[680] = 1315586781;
        kr.hcyt[681] = 613884894;
        kr.hcyt[682] = -1091093731;
        kr.hcyt[683] = -1054567722;
        kr.hcyt[684] = -757543003;
        kr.hcyt[685] = 1172159190;
        kr.hcyt[686] = -1530985157;
        kr.hcyt[687] = 847861981;
        kr.hcyt[688] = -962588117;
        kr.hcyt[689] = -505367468;
        kr.hcyt[690] = 349773863;
        kr.hcyt[691] = 1079986244;
        kr.hcyt[692] = -1548964740;
        kr.hcyt[693] = 165124884;
        kr.hcyt[694] = 2008416634;
        kr.hcyt[695] = 1419315594;
        kr.hcyt[696] = -1723841974;
        kr.hcyt[697] = 1416235800;
        kr.hcyt[698] = 1795967612;
        kr.hcyt[699] = -247121733;
    }

    private static int hcyr(int n2) {
        return hcys[n2] ^ hcyt[n2];
    }

    private static void hexs() {
        kr.hcys[100] = -204587410;
        kr.hcys[101] = 123801075;
        kr.hcys[102] = -1265402410;
        kr.hcys[103] = -1223627563;
        kr.hcys[104] = 1274064115;
        kr.hcys[105] = 1016756791;
        kr.hcys[106] = -1415977824;
        kr.hcys[107] = 5950884;
        kr.hcys[108] = -536548536;
        kr.hcys[109] = -708718768;
        kr.hcys[110] = -1394021174;
        kr.hcys[111] = 1408263976;
        kr.hcys[112] = 206468108;
        kr.hcys[113] = -1465208269;
        kr.hcys[114] = -495715424;
        kr.hcys[115] = -1983121602;
        kr.hcys[116] = 1063842016;
        kr.hcys[117] = 676093916;
        kr.hcys[118] = 2083946964;
        kr.hcys[119] = -508961733;
        kr.hcys[120] = 1770638124;
        kr.hcys[121] = 1115247305;
        kr.hcys[122] = -1418797913;
        kr.hcys[123] = -346608230;
        kr.hcys[124] = -101755254;
        kr.hcys[125] = 831968477;
        kr.hcys[126] = -835985238;
        kr.hcys[127] = -1171762093;
        kr.hcys[128] = -1059174522;
        kr.hcys[129] = -1449135951;
        kr.hcys[130] = -2138737474;
        kr.hcys[131] = 873606702;
        kr.hcys[132] = 190220050;
        kr.hcys[133] = 746746680;
        kr.hcys[134] = -1686447398;
        kr.hcys[135] = 1098227523;
        kr.hcys[136] = -2001428565;
        kr.hcys[137] = 2006710165;
        kr.hcys[138] = -604531343;
        kr.hcys[139] = 1129747553;
        kr.hcys[140] = 33901965;
        kr.hcys[141] = 2114465532;
        kr.hcys[142] = -1725300802;
        kr.hcys[143] = -1347102373;
        kr.hcys[144] = 1663365076;
        kr.hcys[145] = 1355862596;
        kr.hcys[146] = -1771762623;
        kr.hcys[147] = -934392951;
        kr.hcys[148] = -685972845;
        kr.hcys[149] = 1914896015;
        kr.hcys[150] = 1014545709;
        kr.hcys[151] = -1535687564;
        kr.hcys[152] = -808645949;
        kr.hcys[153] = 313844649;
        kr.hcys[154] = -419214352;
        kr.hcys[155] = -466662490;
        kr.hcys[156] = 1292896372;
        kr.hcys[157] = -1950220581;
        kr.hcys[158] = 502731022;
        kr.hcys[159] = 1449486837;
        kr.hcys[160] = -311630791;
        kr.hcys[161] = 1806914978;
        kr.hcys[162] = 1733319506;
        kr.hcys[163] = -935372850;
        kr.hcys[164] = -1705953820;
        kr.hcys[165] = -1293130865;
        kr.hcys[166] = 2024982830;
        kr.hcys[167] = -680094014;
        kr.hcys[168] = -1745157975;
        kr.hcys[169] = 1888268040;
        kr.hcys[170] = -589296443;
        kr.hcys[171] = -570233011;
        kr.hcys[172] = -2048272830;
        kr.hcys[173] = 125909722;
        kr.hcys[174] = 2090618738;
        kr.hcys[175] = -214917558;
        kr.hcys[176] = 1411578550;
        kr.hcys[177] = -1304411596;
        kr.hcys[178] = -2085324883;
        kr.hcys[179] = 1997919804;
        kr.hcys[180] = 1141674499;
        kr.hcys[181] = -1036189950;
        kr.hcys[182] = 763696234;
        kr.hcys[183] = -1582698282;
        kr.hcys[184] = -446686963;
        kr.hcys[185] = -288857243;
        kr.hcys[186] = 1185595722;
        kr.hcys[187] = -273335363;
        kr.hcys[188] = 1358212931;
        kr.hcys[189] = 1492056887;
        kr.hcys[190] = -1839630782;
        kr.hcys[191] = -414710769;
        kr.hcys[192] = 539357844;
        kr.hcys[193] = -1238141497;
        kr.hcys[194] = 1102521367;
        kr.hcys[195] = 585593331;
        kr.hcys[196] = 1084520922;
        kr.hcys[197] = 235436589;
        kr.hcys[198] = 175654342;
        kr.hcys[199] = 1047791579;
    }

    private static void heyh() {
        kr.hcyy[0] = 7416371573153788989L;
        kr.hcyy[1] = 4948063720863188729L;
        kr.hcyy[2] = 3295010631484593115L;
        kr.hcyy[3] = -641522213182627550L;
        kr.hcyy[4] = 801815406771596799L;
        kr.hcyy[5] = 5352488868809755589L;
        kr.hcyy[6] = 1509585969735769570L;
        kr.hcyy[7] = 4638489298785124954L;
        kr.hcyy[8] = 4549484489871631059L;
        kr.hcyy[9] = 9145010498735528314L;
        kr.hcyy[10] = -6841508291174558013L;
        kr.hcyy[11] = -1217065097186976811L;
        kr.hcyy[12] = 2883141021548292763L;
        kr.hcyy[13] = -1731437523560636374L;
        kr.hcyy[14] = -2344297885202690687L;
        kr.hcyy[15] = 8018366847259539946L;
        kr.hcyy[16] = 4850144762360919255L;
        kr.hcyy[17] = 892049776926178160L;
        kr.hcyy[18] = 6962614651126832226L;
        kr.hcyy[19] = -2576278883341812562L;
        kr.hcyy[20] = -619386503980488376L;
        kr.hcyy[21] = -646444181133347480L;
        kr.hcyy[22] = 5881675884112693856L;
        kr.hcyy[23] = 3320090202894353317L;
        kr.hcyy[24] = 7182665901802052852L;
        kr.hcyy[25] = -5367536853699606473L;
        kr.hcyy[26] = 2530261204787663547L;
        kr.hcyy[27] = 4727797522078083536L;
        kr.hcyy[28] = -154323287792872766L;
        kr.hcyy[29] = -1106405553117942028L;
        kr.hcyy[30] = -8916744771876185412L;
        kr.hcyy[31] = -8205152196562046501L;
        kr.hcyy[32] = -3123430962343374928L;
        kr.hcyy[33] = -8778487481562497829L;
        kr.hcyy[34] = -633716720524826316L;
        kr.hcyy[35] = -6890495448639266500L;
        kr.hcyy[36] = 2856972275387654013L;
        kr.hcyy[37] = -1533812941515048859L;
        kr.hcyy[38] = 5521261268565878373L;
        kr.hcyy[39] = 7303253134213950732L;
        kr.hcyy[40] = 6272325090909688514L;
        kr.hcyy[41] = 2223794668601457020L;
        kr.hcyy[42] = 4541402359042668206L;
        kr.hcyy[43] = -7644092250569880375L;
        kr.hcyy[44] = 6367862199246873646L;
        kr.hcyy[45] = 6287603312350365326L;
        kr.hcyy[46] = -738068664475650820L;
        kr.hcyy[47] = -3171878654696470929L;
        kr.hcyy[48] = -1339042148754463560L;
        kr.hcyy[49] = 6458343984516367193L;
        kr.hcyy[50] = 7412513425730359332L;
        kr.hcyy[51] = -1615071408888478794L;
        kr.hcyy[52] = 9214197479741078418L;
        kr.hcyy[53] = -43940923278276519L;
        kr.hcyy[54] = 4290526487960328214L;
        kr.hcyy[55] = 7223903749529321991L;
        kr.hcyy[56] = -1226490722218015488L;
        kr.hcyy[57] = -4965738758386269924L;
        kr.hcyy[58] = 7559951257118673066L;
        kr.hcyy[59] = 1646866296035371884L;
        kr.hcyy[60] = -5592507196403705982L;
        kr.hcyy[61] = -4366939071864378029L;
        kr.hcyy[62] = -2549164650347217933L;
        kr.hcyy[63] = -3696043072131562065L;
        kr.hcyy[64] = 31922792496394760L;
        kr.hcyy[65] = -815611818329307163L;
        kr.hcyy[66] = -8414460416866164646L;
        kr.hcyy[67] = 5853183239471054843L;
        kr.hcyy[68] = -7178811883726683045L;
        kr.hcyy[69] = -8464349578930405913L;
        kr.hcyy[70] = -204750633438006755L;
        kr.hcyy[71] = -4959451412955826712L;
        kr.hcyy[72] = -2877384798409789942L;
        kr.hcyy[73] = -1322917308172117738L;
        kr.hcyy[74] = -3156564559959886043L;
        kr.hcyy[75] = 1173657425976469670L;
        kr.hcyy[76] = -659070382183386622L;
        kr.hcyy[77] = 5307501246412863537L;
        kr.hcyy[78] = 592874501295427956L;
        kr.hcyy[79] = -5658811022207339987L;
        kr.hcyy[80] = -5252378157777063762L;
        kr.hcyy[81] = 3004771569860240804L;
        kr.hcyy[82] = -5538469107211673920L;
        kr.hcyy[83] = -1675807317569548235L;
        kr.hcyy[84] = 8533834858063790242L;
        kr.hcyy[85] = -1112435190199030311L;
        kr.hcyy[86] = 2371162947536793815L;
        kr.hcyy[87] = 8943347710343592942L;
        kr.hcyy[88] = 11521289802725260L;
        kr.hcyy[89] = 1932070477430442956L;
        kr.hcyy[90] = 8988841926909210878L;
        kr.hcyy[91] = -8713540207425050334L;
        kr.hcyy[92] = 5077261701931924817L;
        kr.hcyy[93] = 7174344686042361201L;
        kr.hcyy[94] = 9198795661053768413L;
        kr.hcyy[95] = -4168387098289013655L;
        kr.hcyy[96] = 7888064216692589831L;
        kr.hcyy[97] = -599132243227172230L;
        kr.hcyy[98] = -394242245342857971L;
        kr.hcyy[99] = -6299903492659684749L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void render(ks var0, int var1_1) {
        var10_2 = kr.c;
        var9_3 /* !! */  = kr.b;
        if (var9_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var8_4 = kr.a;
                if (var10_2) {
                    throw null;
lbl9:
                    // 24 sources

                    return;
                }
                if (var8_4 || var8_4) ** GOTO lbl9
                var2_5 = RenderSystem.getSamplerCache().method_75294(FilterMode.LINEAR);
                if (var8_4 || var8_4) ** GOTO lbl9
                var3_6 = class_310.method_1551().method_1522();
                if (var8_4 || var8_4) ** GOTO lbl9
                var4_7 = RenderSystem.getDevice().createCommandEncoder();
                if (var8_4 || var8_4) ** GOTO lbl9
                var4_7.writeToBuffer(kr.msdfBuffer.slice(), kr.msdfData);
                if (var8_4 || var8_4) ** GOTO lbl9
                var4_7.writeToBuffer(kr.glyphBuffer.slice(), kr.glyphData);
                if (var8_4 || var8_4) ** GOTO lbl9
                var5_8 = var4_7.createRenderPass((Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$render$2(), ()Ljava/lang/String;)(), var3_6.method_71639(), OptionalInt.empty());
                if (var8_4) ** GOTO lbl9
                try {
                    if (var8_4) ** GOTO lbl9
                    oq.applyToPass(var5_8);
                    if (var8_4 || var8_4) ** GOTO lbl9
                    var5_8.setPipeline(kr.pipeline);
                    if (var8_4 || var8_4) ** GOTO lbl9
                    var5_8.setUniform("MsdfData", kr.msdfBuffer);
                    if (var8_4 || var8_4) ** GOTO lbl9
                    var5_8.setUniform("GlyphData", kr.glyphBuffer);
                    if (var8_4 || var8_4) ** GOTO lbl9
                    var5_8.bindTexture("Sampler0", var0.getTextureView(), var2_5);
                    if (var8_4 || var8_4) ** GOTO lbl9
                    var5_8.draw((int)kr.hcyu("hess", hcyr(int ), (int)625), var1_1 * kr.hcyu("hest", hcyr(int ), (int)626));
                    if (var8_4 || var8_4) ** GOTO lbl9
                    if (var5_8 == null) ** GOTO lbl62
                    if (var8_4) ** GOTO lbl9
                }
                catch (Throwable var6_9) {
                    if (var8_4) ** GOTO lbl9
                    if (var5_8 == null) ** GOTO lbl55
                    if (var8_4) ** GOTO lbl9
                    try {
                        if (var8_4) ** GOTO lbl9
                        var5_8.close();
                        if (var8_4 || var8_4) ** GOTO lbl9
                        ** if (!var10_2) goto lbl-1000
                    }
                    catch (Throwable var7_10) {
                        if (var8_4) ** GOTO lbl9
                        var6_9.addSuppressed(var7_10);
                        if (var8_4) ** GOTO lbl9
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
lbl55:
                    // 3 sources

                    if (var8_4 || var8_4) ** GOTO lbl9
                    throw var6_9;
                }
                var5_8.close();
                if (var8_4) ** GOTO lbl9
                if (var10_2) {
                    throw null;
                }
lbl62:
                // 3 sources

                if (!var8_4 && !var8_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var9_3 /* !! */  = (int)kr.hcyu("hesu", hcyr(int ), (int)627);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl200
            }
lbl70:
            // 2 sources

            case 1: {
                var9_3 /* !! */  = (int)kr.hcyu("hesv", hcyr(int ), (int)628);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl124
            }
lbl75:
            // 2 sources

            case 2: {
                var9_3 /* !! */  = (int)kr.hcyu("hesw", hcyr(int ), (int)629);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl212
            }
            case 3: {
                var9_3 /* !! */  = (int)kr.hcyu("hesx", hcyr(int ), (int)630);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl200
            }
lbl85:
            // 3 sources

            case 4: {
                var9_3 /* !! */  = (int)kr.hcyu("hesy", hcyr(int ), (int)631);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl232
            }
            case 5: {
                var9_3 /* !! */  = (int)kr.hcyu("hesz", hcyr(int ), (int)632);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 6: {
                var9_3 /* !! */  = (int)kr.hcyu("heta", hcyr(int ), (int)633);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl100:
            // 2 sources

            case 7: {
                var9_3 /* !! */  = (int)kr.hcyu("hetb", hcyr(int ), (int)634);
                if (!var10_2) break;
                throw null;
            }
lbl104:
            // 2 sources

            case 8: {
                var9_3 /* !! */  = (int)kr.hcyu("hetc", hcyr(int ), (int)635);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl109:
            // 2 sources

            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_3 /* !! */  = (int)kr.hcyu("hetd", hcyr(int ), (int)636);
                    if (var10_2) {
                        throw null;
                    }
                    ** GOTO lbl244
                    break;
                }
            }
            case 10: {
                var9_3 /* !! */  = (int)kr.hcyu("hete", hcyr(int ), (int)637);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl129
            }
lbl120:
            // 2 sources

            case 11: {
                var9_3 /* !! */  = (int)kr.hcyu("hetf", hcyr(int ), (int)638);
                if (var10_2) {
                    throw null;
                }
            }
lbl124:
            // 5 sources

            case 12: {
                var9_3 /* !! */  = (int)kr.hcyu("hetg", hcyr(int ), (int)639);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl220
            }
lbl129:
            // 2 sources

            case 13: {
                var9_3 /* !! */  = (int)kr.hcyu("heth", hcyr(int ), (int)640);
                if (!var10_2) break;
                throw null;
            }
            case 14: {
                var9_3 /* !! */  = (int)kr.hcyu("heti", hcyr(int ), (int)641);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl138:
            // 2 sources

            case 15: {
                var9_3 /* !! */  = (int)kr.hcyu("hetj", hcyr(int ), (int)642);
                if (!var10_2) ** GOTO lbl100
                throw null;
            }
            case 16: {
                var9_3 /* !! */  = (int)kr.hcyu("hetk", hcyr(int ), (int)643);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl156
            }
lbl147:
            // 2 sources

            case 17: {
                var9_3 /* !! */  = (int)kr.hcyu("hetl", hcyr(int ), (int)644);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl228
            }
lbl152:
            // 2 sources

            case 18: {
                var9_3 /* !! */  = (int)kr.hcyu("hetm", hcyr(int ), (int)645);
                if (var10_2) {
                    throw null;
                }
            }
lbl156:
            // 4 sources

            case 19: {
                var9_3 /* !! */  = (int)kr.hcyu("hetn", hcyr(int ), (int)646);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl191
            }
lbl161:
            // 4 sources

            case 20: {
                var9_3 /* !! */  = (int)kr.hcyu("heto", hcyr(int ), (int)647);
                if (!var10_2) break;
                throw null;
            }
            case 21: {
                var9_3 /* !! */  = (int)kr.hcyu("hetp", hcyr(int ), (int)648);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl186
            }
            case 22: {
                var9_3 /* !! */  = (int)kr.hcyu("hetq", hcyr(int ), (int)649);
                if (!var10_2) ** GOTO lbl75
                throw null;
            }
            case 23: {
                var9_3 /* !! */  = (int)kr.hcyu("hetr", hcyr(int ), (int)650);
                if (!var10_2) ** GOTO lbl85
                throw null;
            }
lbl178:
            // 2 sources

            case 24: {
                var9_3 /* !! */  = (int)kr.hcyu("hets", hcyr(int ), (int)651);
                if (!var10_2) ** GOTO lbl147
                throw null;
            }
lbl182:
            // 2 sources

            case 25: {
                var9_3 /* !! */  = (int)kr.hcyu("hett", hcyr(int ), (int)652);
                if (!var10_2) ** GOTO lbl120
                throw null;
            }
lbl186:
            // 4 sources

            case 26: {
                var9_3 /* !! */  = (int)kr.hcyu("hetu", hcyr(int ), (int)653);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl191:
            // 2 sources

            case 27: {
                var9_3 /* !! */  = (int)kr.hcyu("hetv", hcyr(int ), (int)654);
                if (!var10_2) ** GOTO lbl85
                throw null;
            }
lbl195:
            // 2 sources

            case 28: {
                var9_3 /* !! */  = (int)kr.hcyu("hetw", hcyr(int ), (int)655);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl208
            }
lbl200:
            // 3 sources

            case 29: {
                var9_3 /* !! */  = (int)kr.hcyu("hetx", hcyr(int ), (int)656);
                if (!var10_2) ** GOTO lbl70
                throw null;
            }
            case 30: {
                var9_3 /* !! */  = (int)kr.hcyu("hety", hcyr(int ), (int)657);
                if (!var10_2) ** GOTO lbl124
                throw null;
            }
lbl208:
            // 2 sources

            case 31: {
                var9_3 /* !! */  = (int)kr.hcyu("hetz", hcyr(int ), (int)658);
                if (!var10_2) ** GOTO lbl109
                throw null;
            }
lbl212:
            // 2 sources

            case 32: {
                var9_3 /* !! */  = (int)kr.hcyu("heua", hcyr(int ), (int)659);
                if (!var10_2) ** GOTO lbl161
                throw null;
            }
            case 33: {
                var9_3 /* !! */  = (int)kr.hcyu("heub", hcyr(int ), (int)660);
                if (!var10_2) ** GOTO lbl186
                throw null;
            }
lbl220:
            // 2 sources

            case 34: {
                var9_3 /* !! */  = (int)kr.hcyu("heuc", hcyr(int ), (int)661);
                if (!var10_2) ** GOTO lbl195
                throw null;
            }
lbl224:
            // 3 sources

            case 35: {
                var9_3 /* !! */  = (int)kr.hcyu("heud", hcyr(int ), (int)662);
                if (!var10_2) ** GOTO lbl161
                throw null;
            }
lbl228:
            // 3 sources

            case 36: {
                var9_3 /* !! */  = (int)kr.hcyu("heue", hcyr(int ), (int)663);
                if (!var10_2) ** GOTO lbl186
                throw null;
            }
lbl232:
            // 2 sources

            case 37: {
                var9_3 /* !! */  = (int)kr.hcyu("heuf", hcyr(int ), (int)664);
                if (!var10_2) ** GOTO lbl182
                throw null;
            }
            case 38: {
                var9_3 /* !! */  = (int)kr.hcyu("heug", hcyr(int ), (int)665);
                if (!var10_2) ** GOTO lbl104
                throw null;
            }
            case 39: {
                var9_3 /* !! */  = (int)kr.hcyu("heuh", hcyr(int ), (int)666);
                if (!var10_2) ** GOTO lbl228
                throw null;
            }
lbl244:
            // 2 sources

            case 40: {
                var9_3 /* !! */  = (int)kr.hcyu("heui", hcyr(int ), (int)667);
                if (!var10_2) ** GOTO lbl138
                throw null;
            }
            case 41: 
        }
        var9_3 /* !! */  = (int)kr.hcyu("heuj", hcyr(int ), (int)668);
        ** while (!var10_2)
lbl251:
        // 1 sources

        throw null;
    }

    private static void hexy() {
        kr.hcys[700] = -1120844521;
        kr.hcys[701] = -1871579890;
        kr.hcys[702] = 1350363890;
        kr.hcys[703] = -396539194;
        kr.hcys[704] = -803676528;
        kr.hcys[705] = 1498301067;
        kr.hcys[706] = -988795947;
        kr.hcys[707] = 865654461;
        kr.hcys[708] = 327851267;
        kr.hcys[709] = -1327320877;
        kr.hcys[710] = -1203116160;
        kr.hcys[711] = -597674840;
        kr.hcys[712] = 352831265;
        kr.hcys[713] = -1446291959;
        kr.hcys[714] = 1568977164;
        kr.hcys[715] = 1064070360;
        kr.hcys[716] = 1308248928;
        kr.hcys[717] = 2099216771;
        kr.hcys[718] = -1937831692;
        kr.hcys[719] = 1750479243;
        kr.hcys[720] = 880871203;
        kr.hcys[721] = -1303906231;
        kr.hcys[722] = -1136682589;
        kr.hcys[723] = -1508215511;
        kr.hcys[724] = -1665881771;
        kr.hcys[725] = -636499830;
        kr.hcys[726] = -469388041;
        kr.hcys[727] = 2033263303;
        kr.hcys[728] = 1703056313;
        kr.hcys[729] = -1106497204;
        kr.hcys[730] = 1840425836;
        kr.hcys[731] = 726373327;
        kr.hcys[732] = -1778994960;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void putColor(ByteBuffer var0, int var1_1) {
        v0 /* !! */  = kr.oc;
        if (true) ** GOTO lbl5
        block32: while (true) {
            v0 /* !! */  = (long)(v1 - kr.hcyu("hdnj", hcyx(int ), (int)2));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1351866897: {
                    v1 = kr.hcyu("hdnk", hcyx(int ), (int)3);
                    continue block32;
                }
                case 93701128: {
                    v1 = kr.hcyu("hdnl", hcyx(int ), (int)4);
                    continue block32;
                }
                case 890790898: {
                    break block32;
                }
                case 1856858421: {
                    v1 = kr.hcyu("hdnm", hcyx(int ), (int)5);
                    continue block32;
                }
            }
            break;
        }
        var4_2 = kr.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = kr.oc - kr.hcyu("hdnn", hcyx(int ), (int)6)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == kr.hcyu("hdno", hcyr(int ), (int)372)) break;
            v2 /* !! */  = (long)kr.hcyu("hdnp", hcyr(int ), (int)373);
        }
        var3_3 /* !! */  = kr.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = kr.oc - kr.hcyu("hdnq", hcyx(int ), (int)7)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == kr.hcyu("hdnr", hcyr(int ), (int)374)) break;
            v3 /* !! */  = (long)kr.hcyu("hdns", hcyr(int ), (int)375);
        }
        var2_4 = kr.a;
        if (var4_2) {
            throw null;
lbl32:
            // 5 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl32
        v4 = (float)(var1_1 >> kr.hcyu("hdnt", hcyr(int ), (int)376) & kr.hcyu("hdnu", hcyr(int ), (int)377)) / kr.hcyu("hdnv", hdam(int ), (int)378);
        v5 /* !! */  = kr.oc;
        if (true) ** GOTO lbl40
        block36: while (true) {
            v5 /* !! */  = (long)(kr.hcyu("hdnx", hcyx(int ), (int)9) - kr.hcyu("hdnw", hcyx(int ), (int)8));
lbl40:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case 890790898: {
                    break block36;
                }
                case 1110696278: {
                    continue block36;
                }
            }
            break;
        }
        var0.putFloat(v4);
        if (var2_4 || var2_4) ** GOTO lbl32
        v6 = (float)(var1_1 >> kr.hcyu("hdny", hcyr(int ), (int)379) & kr.hcyu("hdnz", hcyr(int ), (int)380)) / kr.hcyu("hdoa", hdam(int ), (int)381);
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = kr.oc - kr.hcyu("hdob", hcyx(int ), (int)10)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == kr.hcyu("hdoc", hcyr(int ), (int)382)) break;
            v7 /* !! */  = (long)kr.hcyu("hdod", hcyr(int ), (int)383);
        }
        var0.putFloat(v6);
        if (var2_4 || var2_4) ** GOTO lbl32
        v8 = (float)(var1_1 & kr.hcyu("hdoe", hcyr(int ), (int)384)) / kr.hcyu("hdof", hdam(int ), (int)385);
        v9 /* !! */  = kr.oc;
        if (true) ** GOTO lbl61
        block38: while (true) {
            v9 /* !! */  = (long)(kr.hcyu("hdoh", hcyx(int ), (int)12) - kr.hcyu("hdog", hcyx(int ), (int)11));
lbl61:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -1473586494: {
                    continue block38;
                }
                case 890790898: {
                    break block38;
                }
            }
            break;
        }
        var0.putFloat(v8);
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl32
                v10 = (float)(var1_1 >> kr.hcyu("hdoi", hcyr(int ), (int)386) & kr.hcyu("hdoj", hcyr(int ), (int)387)) / kr.hcyu("hdok", hdam(int ), (int)388);
                v11 /* !! */  = kr.oc;
                if (true) ** GOTO lbl77
                block39: while (true) {
                    v11 /* !! */  = (long)(kr.hcyu("hdom", hcyx(int ), (int)14) - kr.hcyu("hdol", hcyx(int ), (int)13));
lbl77:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1515385828: {
                            continue block39;
                        }
                        case 890790898: {
                            break block39;
                        }
                    }
                    break;
                }
                var0.putFloat(v10);
                if (var2_4 || var2_4) ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)kr.hcyu("hdon", hcyr(int ), (int)389);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl106
            }
            case 1: {
                var3_3 /* !! */  = (int)kr.hcyu("hdoo", hcyr(int ), (int)390);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl111
            }
            case 2: {
                var3_3 /* !! */  = (int)kr.hcyu("hdop", hcyr(int ), (int)391);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl120
            }
lbl101:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)kr.hcyu("hdoq", hcyr(int ), (int)392);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl128
            }
lbl106:
            // 3 sources

            case 4: {
                var3_3 /* !! */  = (int)kr.hcyu("hdor", hcyr(int ), (int)393);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl116
            }
lbl111:
            // 2 sources

            case 5: {
                do {
                    var3_3 /* !! */  = (int)kr.hcyu("hdos", hcyr(int ), (int)394);
                } while (!var4_2);
                throw null;
            }
lbl116:
            // 3 sources

            case 6: {
                var3_3 /* !! */  = (int)kr.hcyu("hdot", hcyr(int ), (int)395);
                if (var4_2) {
                    throw null;
                }
            }
lbl120:
            // 4 sources

            case 7: {
                var3_3 /* !! */  = (int)kr.hcyu("hdou", hcyr(int ), (int)396);
                if (var4_2) {
                    throw null;
                }
            }
            case 8: {
                var3_3 /* !! */  = (int)kr.hcyu("hdov", hcyr(int ), (int)397);
                if (!var4_2) ** GOTO lbl106
                throw null;
            }
lbl128:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)kr.hcyu("hdow", hcyr(int ), (int)398);
                if (!var4_2) ** GOTO lbl101
                throw null;
            }
            case 10: {
                var3_3 /* !! */  = (int)kr.hcyu("hdox", hcyr(int ), (int)399);
                if (!var4_2) ** GOTO lbl116
                throw null;
            }
            case 11: 
        }
        do {
            var3_3 /* !! */  = (int)kr.hcyu("hdoy", hcyr(int ), (int)400);
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static String lambda$render$2() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kr.oc - kr.hcyu("hewc", hcyx(int ), (int)107)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == kr.hcyu("hewd", hcyr(int ), (int)713)) break;
            v0 /* !! */  = (long)kr.hcyu("hewe", hcyr(int ), (int)714);
        }
        var2 = kr.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = kr.oc - kr.hcyu("hewf", hcyx(int ), (int)108)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == kr.hcyu("hewg", hcyr(int ), (int)715)) break;
            v1 /* !! */  = (long)kr.hcyu("hewh", hcyr(int ), (int)716);
        }
        var1_1 /* !! */  = kr.b;
        v2 /* !! */  = kr.oc;
        if (true) ** GOTO lbl19
        block13: while (true) {
            v2 /* !! */  = (long)(v3 - kr.hcyu("hewi", hcyx(int ), (int)109));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 13127472: {
                    v3 = kr.hcyu("hewj", hcyx(int ), (int)110);
                    continue block13;
                }
                case 890790898: {
                    break block13;
                }
                case 1748459131: {
                    v3 = kr.hcyu("hewk", hcyx(int ), (int)111);
                    continue block13;
                }
            }
            break;
        }
        var0_2 = kr.a;
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
                return "Msdf2D";
            }
lbl38:
            // 2 sources

            case 0: {
                do {
                    var1_1 /* !! */  = (int)kr.hcyu("hewl", hcyr(int ), (int)717);
                } while (!var2);
                throw null;
            }
lbl43:
            // 2 sources

            case 1: {
                var1_1 /* !! */  = (int)kr.hcyu("hewm", hcyr(int ), (int)718);
                if (!var2) ** GOTO lbl38
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)kr.hcyu("hewn", hcyr(int ), (int)719);
                    if (!var2) ** GOTO lbl43
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)kr.hcyu("hewo", hcyr(int ), (int)720);
        ** while (!var2)
lbl55:
        // 1 sources

        throw null;
    }

    private static void heyc() {
        kr.hcyt[300] = 1886594733;
        kr.hcyt[301] = -1045357910;
        kr.hcyt[302] = -450986484;
        kr.hcyt[303] = -1932378070;
        kr.hcyt[304] = -1389078813;
        kr.hcyt[305] = -998774472;
        kr.hcyt[306] = -77417693;
        kr.hcyt[307] = 1203673628;
        kr.hcyt[308] = -988692919;
        kr.hcyt[309] = -941979226;
        kr.hcyt[310] = -1158837822;
        kr.hcyt[311] = -2114122554;
        kr.hcyt[312] = -274953894;
        kr.hcyt[313] = 1045263645;
        kr.hcyt[314] = -1078950217;
        kr.hcyt[315] = 205147818;
        kr.hcyt[316] = -1550206096;
        kr.hcyt[317] = -459269186;
        kr.hcyt[318] = -648211639;
        kr.hcyt[319] = 189805527;
        kr.hcyt[320] = -1287138165;
        kr.hcyt[321] = 658673947;
        kr.hcyt[322] = 1441735327;
        kr.hcyt[323] = 1981149566;
        kr.hcyt[324] = -1624076464;
        kr.hcyt[325] = 1188367336;
        kr.hcyt[326] = 1366444385;
        kr.hcyt[327] = 582518470;
        kr.hcyt[328] = 779483989;
        kr.hcyt[329] = -1526518543;
        kr.hcyt[330] = 1913531295;
        kr.hcyt[331] = 149970652;
        kr.hcyt[332] = -1851623525;
        kr.hcyt[333] = -598195889;
        kr.hcyt[334] = -523148046;
        kr.hcyt[335] = -1238990771;
        kr.hcyt[336] = -1199091365;
        kr.hcyt[337] = -1495731242;
        kr.hcyt[338] = -1115664672;
        kr.hcyt[339] = -18031209;
        kr.hcyt[340] = -1690170619;
        kr.hcyt[341] = -1560141359;
        kr.hcyt[342] = 538921348;
        kr.hcyt[343] = 324180732;
        kr.hcyt[344] = -800288891;
        kr.hcyt[345] = 882099952;
        kr.hcyt[346] = 1011247726;
        kr.hcyt[347] = -1428791911;
        kr.hcyt[348] = 874829255;
        kr.hcyt[349] = -1182124927;
        kr.hcyt[350] = -758729273;
        kr.hcyt[351] = -1102710857;
        kr.hcyt[352] = -1211320195;
        kr.hcyt[353] = 857147358;
        kr.hcyt[354] = -1677244999;
        kr.hcyt[355] = -1963194783;
        kr.hcyt[356] = -1173813729;
        kr.hcyt[357] = 697209894;
        kr.hcyt[358] = 721617933;
        kr.hcyt[359] = -1998498762;
        kr.hcyt[360] = -130872013;
        kr.hcyt[361] = -1068125393;
        kr.hcyt[362] = 1278597653;
        kr.hcyt[363] = -861858432;
        kr.hcyt[364] = 115353806;
        kr.hcyt[365] = -1624821317;
        kr.hcyt[366] = -1890420021;
        kr.hcyt[367] = -1898163836;
        kr.hcyt[368] = 81203546;
        kr.hcyt[369] = -137934103;
        kr.hcyt[370] = 1552427834;
        kr.hcyt[371] = 1629097243;
        kr.hcyt[372] = -1958384834;
        kr.hcyt[373] = -1218971040;
        kr.hcyt[374] = -351516237;
        kr.hcyt[375] = 447503425;
        kr.hcyt[376] = -129597783;
        kr.hcyt[377] = -888886934;
        kr.hcyt[378] = -1119173870;
        kr.hcyt[379] = 1007554940;
        kr.hcyt[380] = -177106418;
        kr.hcyt[381] = -1847460842;
        kr.hcyt[382] = -709778650;
        kr.hcyt[383] = -601433832;
        kr.hcyt[384] = 1429742008;
        kr.hcyt[385] = -1779697775;
        kr.hcyt[386] = 230754251;
        kr.hcyt[387] = 165178108;
        kr.hcyt[388] = 1104927040;
        kr.hcyt[389] = 1210013241;
        kr.hcyt[390] = -1240889304;
        kr.hcyt[391] = -2100653081;
        kr.hcyt[392] = -58361321;
        kr.hcyt[393] = 1123961863;
        kr.hcyt[394] = -1369685066;
        kr.hcyt[395] = 1224987356;
        kr.hcyt[396] = -1028849031;
        kr.hcyt[397] = 238035719;
        kr.hcyt[398] = -1869989556;
        kr.hcyt[399] = 892756492;
    }

    public kr() {
    }

    private static void heya() {
        kr.hcyt[100] = -204587393;
        kr.hcyt[101] = 123801014;
        kr.hcyt[102] = -1265402405;
        kr.hcyt[103] = -1223627567;
        kr.hcyt[104] = 1274064051;
        kr.hcyt[105] = 1016756783;
        kr.hcyt[106] = -1415977840;
        kr.hcyt[107] = 5950922;
        kr.hcyt[108] = -536548603;
        kr.hcyt[109] = -708718731;
        kr.hcyt[110] = -1394021148;
        kr.hcyt[111] = 1408264001;
        kr.hcyt[112] = 206468175;
        kr.hcyt[113] = -1465208232;
        kr.hcyt[114] = -495715378;
        kr.hcyt[115] = -1983121603;
        kr.hcyt[116] = 1063841987;
        kr.hcyt[117] = 676093885;
        kr.hcyt[118] = 2083947003;
        kr.hcyt[119] = -508961749;
        kr.hcyt[120] = 1770638128;
        kr.hcyt[121] = 1115247247;
        kr.hcyt[122] = -1418797907;
        kr.hcyt[123] = -346608143;
        kr.hcyt[124] = -101755261;
        kr.hcyt[125] = 831968499;
        kr.hcyt[126] = -835985184;
        kr.hcyt[127] = -1171762109;
        kr.hcyt[128] = -1059174513;
        kr.hcyt[129] = -1449135937;
        kr.hcyt[130] = -2138737490;
        kr.hcyt[131] = 873606710;
        kr.hcyt[132] = 190220048;
        kr.hcyt[133] = 746746668;
        kr.hcyt[134] = -1686447372;
        kr.hcyt[135] = 1098227474;
        kr.hcyt[136] = -2001428499;
        kr.hcyt[137] = 2006710217;
        kr.hcyt[138] = -604531404;
        kr.hcyt[139] = 1129747563;
        kr.hcyt[140] = 33902013;
        kr.hcyt[141] = 2114465458;
        kr.hcyt[142] = -1725300804;
        kr.hcyt[143] = -1347102350;
        kr.hcyt[144] = 1663365003;
        kr.hcyt[145] = 1355862530;
        kr.hcyt[146] = -1771762680;
        kr.hcyt[147] = -934392952;
        kr.hcyt[148] = -685972771;
        kr.hcyt[149] = 1914896005;
        kr.hcyt[150] = 1014545764;
        kr.hcyt[151] = -1535687660;
        kr.hcyt[152] = -808645901;
        kr.hcyt[153] = 313844658;
        kr.hcyt[154] = -419214379;
        kr.hcyt[155] = -466662507;
        kr.hcyt[156] = 1292896332;
        kr.hcyt[157] = -1950220585;
        kr.hcyt[158] = 502731065;
        kr.hcyt[159] = 1449486842;
        kr.hcyt[160] = -311630739;
        kr.hcyt[161] = 1806914965;
        kr.hcyt[162] = -1733319507;
        kr.hcyt[163] = 935372849;
        kr.hcyt[164] = -1705953820;
        kr.hcyt[165] = -1293130865;
        kr.hcyt[166] = 2024982574;
        kr.hcyt[167] = -680093955;
        kr.hcyt[168] = -1745158005;
        kr.hcyt[169] = 1888268126;
        kr.hcyt[170] = -589296510;
        kr.hcyt[171] = -570233076;
        kr.hcyt[172] = -2048272887;
        kr.hcyt[173] = 125909703;
        kr.hcyt[174] = 2090618712;
        kr.hcyt[175] = -214917560;
        kr.hcyt[176] = 1411578526;
        kr.hcyt[177] = -1304411600;
        kr.hcyt[178] = -2085324882;
        kr.hcyt[179] = 1997919852;
        kr.hcyt[180] = 1141674526;
        kr.hcyt[181] = -1036189874;
        kr.hcyt[182] = 763696242;
        kr.hcyt[183] = -1582698277;
        kr.hcyt[184] = -446686915;
        kr.hcyt[185] = -288857309;
        kr.hcyt[186] = 1185595756;
        kr.hcyt[187] = -273335380;
        kr.hcyt[188] = 1358212878;
        kr.hcyt[189] = 1492056871;
        kr.hcyt[190] = -1839630758;
        kr.hcyt[191] = -414710775;
        kr.hcyt[192] = 539357893;
        kr.hcyt[193] = -1238141499;
        kr.hcyt[194] = 1102521436;
        kr.hcyt[195] = 585593273;
        kr.hcyt[196] = 1084520900;
        kr.hcyt[197] = 235436552;
        kr.hcyt[198] = 175654290;
        kr.hcyt[199] = 1047791610;
    }

    private static float hdam(int n2) {
        return Float.intBitsToFloat(hcys[n2] ^ hcyt[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void endBatch() {
        v0 /* !! */  = kr.oc;
        if (true) ** GOTO lbl5
        block44: while (true) {
            v0 /* !! */  = (long)(v1 - kr.hcyu("heeo", hcyx(int ), (int)30));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1284866008: {
                    v1 = kr.hcyu("heep", hcyx(int ), (int)31);
                    continue block44;
                }
                case -908493617: {
                    v1 = kr.hcyu("heeq", hcyx(int ), (int)32);
                    continue block44;
                }
                case 890790898: {
                    break block44;
                }
                case 2120749429: {
                    v1 = kr.hcyu("heer", hcyx(int ), (int)33);
                    continue block44;
                }
            }
            break;
        }
        var2 = kr.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = kr.oc - kr.hcyu("hees", hcyx(int ), (int)34)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == kr.hcyu("heet", hcyr(int ), (int)421)) break;
            v2 /* !! */  = (long)kr.hcyu("heeu", hcyr(int ), (int)422);
        }
        var1_1 /* !! */  = kr.b;
        v3 /* !! */  = kr.oc;
        if (true) ** GOTO lbl28
        block46: while (true) {
            v3 /* !! */  = (long)(v4 - kr.hcyu("heev", hcyx(int ), (int)35));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -664246311: {
                    v4 = kr.hcyu("heew", hcyx(int ), (int)36);
                    continue block46;
                }
                case 12491046: {
                    v4 = kr.hcyu("heex", hcyx(int ), (int)37);
                    continue block46;
                }
                case 890790898: {
                    break block46;
                }
                case 1190906368: {
                    v4 = kr.hcyu("heey", hcyx(int ), (int)38);
                    continue block46;
                }
            }
            break;
        }
        var0_2 = kr.a;
        if (var2) {
            throw null;
lbl43:
            // 7 sources

            return;
        }
        if (var0_2 || var0_2) ** GOTO lbl43
        v5 /* !! */  = kr.oc;
        if (true) ** GOTO lbl50
        block48: while (true) {
            v5 /* !! */  = (long)(v6 - kr.hcyu("heez", hcyx(int ), (int)39));
lbl50:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -887106678: {
                    v6 = kr.hcyu("hefa", hcyx(int ), (int)40);
                    continue block48;
                }
                case -200392192: {
                    v6 = kr.hcyu("hefb", hcyx(int ), (int)41);
                    continue block48;
                }
                case 890790898: {
                    break block48;
                }
            }
            break;
        }
        if (kr.batching) ** GOTO lbl66
        if (var0_2) ** GOTO lbl43
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** GOTO lbl43
                return;
            }
lbl66:
            // 1 sources

            if (var0_2 || var0_2) ** GOTO lbl43
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_1 = kr.oc - kr.hcyu("hefc", hcyx(int ), (int)42)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v7 /* !! */  == kr.hcyu("hefd", hcyr(int ), (int)423)) break;
                v7 /* !! */  = (long)kr.hcyu("hefe", hcyr(int ), (int)424);
            }
            kr.flushBatch();
            if (var0_2 || var0_2) ** GOTO lbl43
            v8 = kr.hcyu("heff", hcyr(int ), (int)425);
            v9 /* !! */  = kr.oc;
            if (true) ** GOTO lbl79
            block50: while (true) {
                v9 /* !! */  = (long)(v10 - kr.hcyu("hefg", hcyx(int ), (int)43));
lbl79:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -1697776935: {
                        v10 = kr.hcyu("hefh", hcyx(int ), (int)44);
                        continue block50;
                    }
                    case -1160335643: {
                        v10 = kr.hcyu("hefi", hcyx(int ), (int)45);
                        continue block50;
                    }
                    case 140164663: {
                        v10 = kr.hcyu("hefj", hcyx(int ), (int)46);
                        continue block50;
                    }
                    case 890790898: {
                        break block50;
                    }
                }
                break;
            }
            kr.batching = v8;
            if (var0_2 || var0_2) ** GOTO lbl43
            v11 /* !! */  = kr.oc;
            if (true) ** GOTO lbl97
            block51: while (true) {
                v11 /* !! */  = (long)(kr.hcyu("hefl", hcyx(int ), (int)48) - kr.hcyu("hefk", hcyx(int ), (int)47));
lbl97:
                // 2 sources

                switch ((int)v11 /* !! */ ) {
                    case -797423321: {
                        continue block51;
                    }
                    case 890790898: {
                        break block51;
                    }
                }
                break;
            }
            kr.resetBatch();
            if (!var0_2 && !var0_2) ** break;
            ** continue;
            return;
lbl106:
            // 4 sources

            case 0: {
                var1_1 /* !! */  = (int)kr.hcyu("hefm", hcyr(int ), (int)426);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl160
            }
            case 1: {
                var1_1 /* !! */  = (int)kr.hcyu("hefn", hcyr(int ), (int)427);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl126
            }
            case 2: {
                var1_1 /* !! */  = (int)kr.hcyu("hefo", hcyr(int ), (int)428);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl130
            }
lbl121:
            // 2 sources

            case 3: {
                do {
                    var1_1 /* !! */  = (int)kr.hcyu("hefp", hcyr(int ), (int)429);
                } while (!var2);
                throw null;
            }
lbl126:
            // 2 sources

            case 4: {
                var1_1 /* !! */  = (int)kr.hcyu("hefq", hcyr(int ), (int)430);
                if (var2) {
                    throw null;
                }
            }
lbl130:
            // 4 sources

            case 5: {
                var1_1 /* !! */  = (int)kr.hcyu("hefr", hcyr(int ), (int)431);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl156
            }
            case 6: {
                var1_1 /* !! */  = (int)kr.hcyu("hefs", hcyr(int ), (int)432);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl160
            }
lbl140:
            // 2 sources

            case 7: {
                var1_1 /* !! */  = (int)kr.hcyu("heft", hcyr(int ), (int)433);
                if (!var2) ** GOTO lbl106
                throw null;
            }
            case 8: {
                var1_1 /* !! */  = (int)kr.hcyu("hefu", hcyr(int ), (int)434);
                if (!var2) ** GOTO lbl121
                throw null;
            }
lbl148:
            // 2 sources

            case 9: {
                var1_1 /* !! */  = (int)kr.hcyu("hefv", hcyr(int ), (int)435);
                if (!var2) ** GOTO lbl140
                throw null;
            }
            case 10: {
                var1_1 /* !! */  = (int)kr.hcyu("hefw", hcyr(int ), (int)436);
                if (!var2) ** GOTO lbl148
                throw null;
            }
lbl156:
            // 2 sources

            case 11: {
                var1_1 /* !! */  = (int)kr.hcyu("hefx", hcyr(int ), (int)437);
                if (!var2) ** GOTO lbl106
                throw null;
            }
lbl160:
            // 3 sources

            case 12: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)kr.hcyu("hefy", hcyr(int ), (int)438);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 13: {
                var1_1 /* !! */  = (int)kr.hcyu("hefz", hcyr(int ), (int)439);
                if (!var2) ** GOTO lbl106
                throw null;
            }
            case 14: 
        }
        var1_1 /* !! */  = (int)kr.hcyu("hega", hcyr(int ), (int)440);
        ** while (!var2)
lbl172:
        // 1 sources

        throw null;
    }

    public static CallSite hcyu(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static String lambda$init$1() {
        v0 /* !! */  = kr.oc;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - kr.hcyu("hewp", hcyx(int ), (int)112));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -368959683: {
                    v1 = kr.hcyu("hewq", hcyx(int ), (int)113);
                    continue block17;
                }
                case 74093711: {
                    v1 = kr.hcyu("hewr", hcyx(int ), (int)114);
                    continue block17;
                }
                case 844270687: {
                    v1 = kr.hcyu("hews", hcyx(int ), (int)115);
                    continue block17;
                }
                case 890790898: {
                    break block17;
                }
            }
            break;
        }
        var2 = kr.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = kr.oc - kr.hcyu("hewt", hcyx(int ), (int)116)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == kr.hcyu("hewu", hcyr(int ), (int)721)) break;
            v2 /* !! */  = (long)kr.hcyu("hewv", hcyr(int ), (int)722);
        }
        var1_1 /* !! */  = kr.b;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = kr.oc;
                if (true) ** GOTO lbl32
                block19: while (true) {
                    v3 /* !! */  = (long)(v4 - kr.hcyu("heww", hcyx(int ), (int)117));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1092022337: {
                            v4 = kr.hcyu("hewx", hcyx(int ), (int)118);
                            continue block19;
                        }
                        case 890790898: {
                            break block19;
                        }
                        case 934476008: {
                            v4 = kr.hcyu("hewy", hcyx(int ), (int)119);
                            continue block19;
                        }
                    }
                    break;
                }
                var0_2 = kr.a;
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                return "Msdf2D GlyphData";
            }
            case 0: {
                var1_1 /* !! */  = (int)kr.hcyu("hewz", hcyr(int ), (int)723);
                if (!var2) break;
                throw null;
            }
            case 1: {
                do {
                    var1_1 /* !! */  = (int)kr.hcyu("hexa", hcyr(int ), (int)724);
                } while (!var2);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)kr.hcyu("hexb", hcyr(int ), (int)725);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)kr.hcyu("hexc", hcyr(int ), (int)726);
        ** while (!var2)
lbl65:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void resetBatch() {
        v0 /* !! */  = kr.oc;
        if (true) ** GOTO lbl5
        block57: while (true) {
            v0 /* !! */  = (long)(v1 - kr.hcyu("heqq", hcyx(int ), (int)81));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1080200724: {
                    v1 = kr.hcyu("heqr", hcyx(int ), (int)82);
                    continue block57;
                }
                case -95506928: {
                    v1 = kr.hcyu("heqs", hcyx(int ), (int)83);
                    continue block57;
                }
                case 890790898: {
                    break block57;
                }
            }
            break;
        }
        var2 = kr.c;
        v2 /* !! */  = kr.oc;
        if (true) ** GOTO lbl19
        block58: while (true) {
            v2 /* !! */  = (long)(v3 - kr.hcyu("heqt", hcyx(int ), (int)84));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1823389198: {
                    v3 = kr.hcyu("hequ", hcyx(int ), (int)85);
                    continue block58;
                }
                case -1532907977: {
                    v3 = kr.hcyu("heqv", hcyx(int ), (int)86);
                    continue block58;
                }
                case 890790898: {
                    break block58;
                }
                case 1333663126: {
                    v3 = kr.hcyu("heqw", hcyx(int ), (int)87);
                    continue block58;
                }
            }
            break;
        }
        var1_1 /* !! */  = kr.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = kr.oc - kr.hcyu("heqx", hcyx(int ), (int)88)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == kr.hcyu("heqy", hcyr(int ), (int)597)) break;
            v4 /* !! */  = (long)kr.hcyu("heqz", hcyr(int ), (int)598);
        }
        var0_2 = kr.a;
        if (!var2) ** GOTO lbl44
        throw null;
        {
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var1_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl44:
                // 1 sources

                if (var0_2 || var0_2) continue block60;
                v5 /* !! */  = kr.oc;
                if (true) ** GOTO lbl49
                block61: while (true) {
                    v5 /* !! */  = (long)(kr.hcyu("herb", hcyx(int ), (int)90) - kr.hcyu("hera", hcyx(int ), (int)89));
lbl49:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 651212246: {
                            continue block61;
                        }
                        case 890790898: {
                            break block61;
                        }
                    }
                    break;
                }
                kr.batchFont = null;
                if (var0_2 || var0_2) continue block60;
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = kr.oc - kr.hcyu("herc", hcyx(int ), (int)91)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == kr.hcyu("herd", hcyr(int ), (int)599)) break;
                    v6 /* !! */  = (long)kr.hcyu("here", hcyr(int ), (int)600);
                }
                kr.batchMatrix = null;
                if (var0_2 || var0_2) continue block60;
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = kr.oc - kr.hcyu("herf", hcyx(int ), (int)92)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == kr.hcyu("herg", hcyr(int ), (int)601)) break;
                    v7 /* !! */  = (long)kr.hcyu("herh", hcyr(int ), (int)602);
                }
                kr.batchRotation = 0.0f;
                if (var0_2 || var0_2) continue block60;
                v8 /* !! */  = kr.oc;
                if (true) ** GOTO lbl74
                block64: while (true) {
                    v8 /* !! */  = (long)(kr.hcyu("herj", hcyx(int ), (int)94) - kr.hcyu("heri", hcyx(int ), (int)93));
lbl74:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1202129692: {
                            continue block64;
                        }
                        case 890790898: {
                            break block64;
                        }
                    }
                    break;
                }
                kr.batchZ = 0.0f;
                if (var0_2 || var0_2) continue block60;
                v9 = kr.hcyu("herk", hcyr(int ), (int)603);
                v10 /* !! */  = kr.oc;
                if (true) ** GOTO lbl86
                block65: while (true) {
                    v10 /* !! */  = (long)(v11 - kr.hcyu("herl", hcyx(int ), (int)95));
lbl86:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case 734134508: {
                            v11 = kr.hcyu("herm", hcyx(int ), (int)96);
                            continue block65;
                        }
                        case 890790898: {
                            break block65;
                        }
                        case 1856790670: {
                            v11 = kr.hcyu("hern", hcyx(int ), (int)97);
                            continue block65;
                        }
                    }
                    break;
                }
                kr.batchGlyphCount = (int)v9;
                if (var0_2 || var0_2) continue block60;
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_3 = kr.oc - kr.hcyu("hero", hcyx(int ), (int)98)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == kr.hcyu("herp", hcyr(int ), (int)604)) break;
                    v12 /* !! */  = (long)kr.hcyu("herq", hcyr(int ), (int)605);
                }
                if (kr.glyphData == null) ** GOTO lbl139
                if (var0_2 || var0_2) continue block60;
                v13 /* !! */  = kr.oc;
                if (true) ** GOTO lbl108
                block67: while (true) {
                    v13 /* !! */  = (long)(v14 - kr.hcyu("herr", hcyx(int ), (int)99));
lbl108:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1758955360: {
                            v14 = kr.hcyu("hers", hcyx(int ), (int)100);
                            continue block67;
                        }
                        case -1151889968: {
                            v14 = kr.hcyu("hert", hcyx(int ), (int)101);
                            continue block67;
                        }
                        case 890790898: {
                            break block67;
                        }
                        case 1849055486: {
                            v14 = kr.hcyu("heru", hcyx(int ), (int)102);
                            continue block67;
                        }
                    }
                    break;
                }
                v15 /* !! */  = kr.oc;
                if (true) ** GOTO lbl124
                block68: while (true) {
                    v15 /* !! */  = (long)(v16 - kr.hcyu("herv", hcyx(int ), (int)103));
lbl124:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1608502075: {
                            v16 = kr.hcyu("herw", hcyx(int ), (int)104);
                            continue block68;
                        }
                        case 430502374: {
                            v16 = kr.hcyu("herx", hcyx(int ), (int)105);
                            continue block68;
                        }
                        case 890790898: {
                            break block68;
                        }
                        case 2059417085: {
                            v16 = kr.hcyu("hery", hcyx(int ), (int)106);
                            continue block68;
                        }
                    }
                    break;
                }
                kr.glyphData.clear();
                if (var0_2) continue block60;
lbl139:
                // 2 sources

                if (!var0_2 && !var0_2) ** break;
                continue block60;
                return;
lbl142:
                // 2 sources

                case 0: {
                    var1_1 /* !! */  = (int)kr.hcyu("herz", hcyr(int ), (int)606);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl214
                }
lbl147:
                // 2 sources

                case 1: {
                    var1_1 /* !! */  = (int)kr.hcyu("hesa", hcyr(int ), (int)607);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl200
                }
lbl152:
                // 2 sources

                case 2: {
                    var1_1 /* !! */  = (int)kr.hcyu("hesb", hcyr(int ), (int)608);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl195
                }
                case 3: {
                    var1_1 /* !! */  = (int)kr.hcyu("hesc", hcyr(int ), (int)609);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl214
                }
                case 4: {
                    var1_1 /* !! */  = (int)kr.hcyu("hesd", hcyr(int ), (int)610);
                    if (!var2) ** GOTO lbl147
                    throw null;
                }
lbl166:
                // 2 sources

                case 5: {
                    var1_1 /* !! */  = (int)kr.hcyu("hese", hcyr(int ), (int)611);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl190
                }
                case 6: {
                    var1_1 /* !! */  = (int)kr.hcyu("hesf", hcyr(int ), (int)612);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl185
                }
                case 7: {
                    var1_1 /* !! */  = (int)kr.hcyu("hesg", hcyr(int ), (int)613);
                    if (!var2) break block60;
                    throw null;
                }
lbl180:
                // 2 sources

                case 8: {
                    var1_1 /* !! */  = (int)kr.hcyu("hesh", hcyr(int ), (int)614);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl205
                }
lbl185:
                // 2 sources

                case 9: {
                    var1_1 /* !! */  = (int)kr.hcyu("hesi", hcyr(int ), (int)615);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl205
                }
lbl190:
                // 2 sources

                case 10: {
                    var1_1 /* !! */  = (int)kr.hcyu("hesj", hcyr(int ), (int)616);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl200
                }
lbl195:
                // 2 sources

                case 11: {
                    do {
                        var1_1 /* !! */  = (int)kr.hcyu("hesk", hcyr(int ), (int)617);
                    } while (!var2);
                    throw null;
                }
lbl200:
                // 3 sources

                case 12: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var1_1 /* !! */  = (int)kr.hcyu("hesl", hcyr(int ), (int)618);
                        if (!var2) ** GOTO lbl142
                        throw null;
                    }
                }
lbl205:
                // 3 sources

                case 13: {
                    var1_1 /* !! */  = (int)kr.hcyu("hesm", hcyr(int ), (int)619);
                    if (!var2) ** GOTO lbl166
                    throw null;
                }
                case 14: {
                    var1_1 /* !! */  = (int)kr.hcyu("hesn", hcyr(int ), (int)620);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl218
                }
lbl214:
                // 3 sources

                case 15: {
                    var1_1 /* !! */  = (int)kr.hcyu("heso", hcyr(int ), (int)621);
                    if (!var2) ** GOTO lbl152
                    throw null;
                }
lbl218:
                // 3 sources

                case 16: {
                    var1_1 /* !! */  = (int)kr.hcyu("hesp", hcyr(int ), (int)622);
                    if (!var2) ** GOTO lbl180
                    throw null;
                }
                case 17: {
                    var1_1 /* !! */  = (int)kr.hcyu("hesq", hcyr(int ), (int)623);
                    if (!var2) ** GOTO lbl218
                    throw null;
                }
                case 18: 
            }
        }
        var1_1 /* !! */  = (int)kr.hcyu("hesr", hcyr(int ), (int)624);
        ** while (!var2)
lbl229:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void flushBatch() {
        block68: {
            block67: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = kr.oc - kr.hcyu("heos", hcyx(int ), (int)62)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == kr.hcyu("heot", hcyr(int ), (int)566)) break;
                    v0 /* !! */  = (long)kr.hcyu("heou", hcyr(int ), (int)567);
                }
                var2 = kr.c;
                v1 /* !! */  = kr.oc;
                if (true) ** GOTO lbl11
                block40: while (true) {
                    v1 /* !! */  = (long)(kr.hcyu("heow", hcyx(int ), (int)64) - kr.hcyu("heov", hcyx(int ), (int)63));
lbl11:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case 890790898: {
                            break block40;
                        }
                        case 1795524406: {
                            continue block40;
                        }
                    }
                    break;
                }
                var1_1 /* !! */  = kr.b;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = kr.oc - kr.hcyu("heox", hcyx(int ), (int)65)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == kr.hcyu("heoy", hcyr(int ), (int)568)) break;
                    v2 /* !! */  = (long)kr.hcyu("heoz", hcyr(int ), (int)569);
                }
                var0_2 = kr.a;
                if (var2) {
                    throw null;
lbl25:
                    // 9 sources

                    return;
                }
                if (var0_2 || var0_2) ** GOTO lbl25
                v3 /* !! */  = kr.oc;
                if (true) ** GOTO lbl32
                block43: while (true) {
                    v3 /* !! */  = (long)(v4 - kr.hcyu("hepa", hcyx(int ), (int)66));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1456985126: {
                            v4 = kr.hcyu("hepb", hcyx(int ), (int)67);
                            continue block43;
                        }
                        case -593126660: {
                            v4 = kr.hcyu("hepc", hcyx(int ), (int)68);
                            continue block43;
                        }
                        case 890790898: {
                            break block43;
                        }
                    }
                    break;
                }
                if (kr.batchGlyphCount == 0) break block67;
                if (var0_2) ** GOTO lbl25
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = kr.oc - kr.hcyu("hepd", hcyx(int ), (int)69)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == kr.hcyu("hepe", hcyr(int ), (int)570)) break;
                    v5 /* !! */  = (long)kr.hcyu("hepf", hcyr(int ), (int)571);
                }
                if (kr.batchFont != null) break block68;
                if (var0_2) ** GOTO lbl25
            }
            if (var0_2 || var0_2) ** GOTO lbl25
            return;
        }
        if (var0_2 || var0_2) ** GOTO lbl25
        v6 /* !! */  = kr.oc;
        if (true) ** GOTO lbl59
        block45: while (true) {
            v6 /* !! */  = (long)(v7 - kr.hcyu("hepg", hcyx(int ), (int)70));
lbl59:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -168430063: {
                    v7 = kr.hcyu("heph", hcyx(int ), (int)71);
                    continue block45;
                }
                case 890790898: {
                    break block45;
                }
                case 933706372: {
                    v7 = kr.hcyu("hepi", hcyx(int ), (int)72);
                    continue block45;
                }
            }
            break;
        }
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_3 = kr.oc - kr.hcyu("hepj", hcyx(int ), (int)73)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == kr.hcyu("hepk", hcyr(int ), (int)572)) break;
            v8 /* !! */  = (long)kr.hcyu("hepl", hcyr(int ), (int)573);
        }
        kr.glyphData.flip();
        if (var0_2 || var0_2) ** GOTO lbl25
        v9 /* !! */  = kr.oc;
        if (true) ** GOTO lbl79
        block47: while (true) {
            v9 /* !! */  = (long)(v10 - kr.hcyu("hepm", hcyx(int ), (int)74));
lbl79:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -1388967944: {
                    v10 = kr.hcyu("hepn", hcyx(int ), (int)75);
                    continue block47;
                }
                case 627188691: {
                    v10 = kr.hcyu("hepo", hcyx(int ), (int)76);
                    continue block47;
                }
                case 890790898: {
                    break block47;
                }
                case 1297249378: {
                    v10 = kr.hcyu("hepp", hcyx(int ), (int)77);
                    continue block47;
                }
            }
            break;
        }
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_4 = kr.oc - kr.hcyu("hepq", hcyx(int ), (int)78)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == kr.hcyu("hepr", hcyr(int ), (int)574)) break;
            v11 /* !! */  = (long)kr.hcyu("heps", hcyr(int ), (int)575);
        }
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_5 = kr.oc - kr.hcyu("hept", hcyx(int ), (int)79)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == kr.hcyu("hepu", hcyr(int ), (int)576)) break;
            v12 /* !! */  = (long)kr.hcyu("hepv", hcyr(int ), (int)577);
        }
        kr.render(kr.batchFont, kr.batchGlyphCount);
        if (var0_2) ** GOTO lbl25
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** GOTO lbl25
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_6 = kr.oc - kr.hcyu("hepw", hcyx(int ), (int)80)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == kr.hcyu("hepx", hcyr(int ), (int)578)) break;
                    v13 /* !! */  = (long)kr.hcyu("hepy", hcyr(int ), (int)579);
                }
                kr.resetBatch();
                if (!var0_2 && !var0_2) ** break;
                ** continue;
                return;
            }
            case 0: {
                var1_1 /* !! */  = (int)kr.hcyu("hepz", hcyr(int ), (int)580);
                if (var2) {
                    throw null;
                }
            }
lbl120:
            // 5 sources

            case 1: {
                var1_1 /* !! */  = (int)kr.hcyu("heqa", hcyr(int ), (int)581);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl185
            }
            case 2: {
                do {
                    var1_1 /* !! */  = (int)kr.hcyu("heqb", hcyr(int ), (int)582);
                } while (!var2);
                throw null;
            }
lbl130:
            // 2 sources

            case 3: {
                var1_1 /* !! */  = (int)kr.hcyu("heqc", hcyr(int ), (int)583);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl135:
            // 3 sources

            case 4: {
                var1_1 /* !! */  = (int)kr.hcyu("heqd", hcyr(int ), (int)584);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl157
            }
            case 5: {
                var1_1 /* !! */  = (int)kr.hcyu("heqe", hcyr(int ), (int)585);
                if (!var2) ** GOTO lbl130
                throw null;
            }
            case 6: {
                var1_1 /* !! */  = (int)kr.hcyu("heqf", hcyr(int ), (int)586);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl149:
            // 3 sources

            case 7: {
                var1_1 /* !! */  = (int)kr.hcyu("heqg", hcyr(int ), (int)587);
                if (!var2) ** GOTO lbl120
                throw null;
            }
            case 8: {
                var1_1 /* !! */  = (int)kr.hcyu("heqh", hcyr(int ), (int)588);
                if (!var2) ** GOTO lbl135
                throw null;
            }
lbl157:
            // 2 sources

            case 9: {
                var1_1 /* !! */  = (int)kr.hcyu("heqi", hcyr(int ), (int)589);
                if (!var2) ** GOTO lbl135
                throw null;
            }
            case 10: {
                var1_1 /* !! */  = (int)kr.hcyu("heqj", hcyr(int ), (int)590);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl175
            }
lbl166:
            // 2 sources

            case 11: {
                var1_1 /* !! */  = (int)kr.hcyu("heqk", hcyr(int ), (int)591);
                if (!var2) ** GOTO lbl149
                throw null;
            }
            case 12: {
                do {
                    var1_1 /* !! */  = (int)kr.hcyu("heql", hcyr(int ), (int)592);
                } while (!var2);
                throw null;
            }
lbl175:
            // 2 sources

            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)kr.hcyu("heqm", hcyr(int ), (int)593);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl185
                    break;
                }
            }
            case 14: {
                var1_1 /* !! */  = (int)kr.hcyu("heqn", hcyr(int ), (int)594);
                if (var2) {
                    throw null;
                }
            }
lbl185:
            // 5 sources

            case 15: {
                var1_1 /* !! */  = (int)kr.hcyu("heqo", hcyr(int ), (int)595);
                if (!var2) ** GOTO lbl120
                throw null;
            }
            case 16: 
        }
        var1_1 /* !! */  = (int)kr.hcyu("heqp", hcyr(int ), (int)596);
        ** while (!var2)
lbl192:
        // 1 sources

        throw null;
    }

    private static void hexw() {
        kr.hcys[500] = 1493608900;
        kr.hcys[501] = 1891061758;
        kr.hcys[502] = 767248316;
        kr.hcys[503] = -634987811;
        kr.hcys[504] = -150642262;
        kr.hcys[505] = 1734994588;
        kr.hcys[506] = -703192115;
        kr.hcys[507] = 254353268;
        kr.hcys[508] = 283894304;
        kr.hcys[509] = 1905538189;
        kr.hcys[510] = 1545113568;
        kr.hcys[511] = 1193813587;
        kr.hcys[512] = 1585878172;
        kr.hcys[513] = 319424777;
        kr.hcys[514] = -538522537;
        kr.hcys[515] = 1648880025;
        kr.hcys[516] = 1380425047;
        kr.hcys[517] = -89948821;
        kr.hcys[518] = 33273159;
        kr.hcys[519] = 786181331;
        kr.hcys[520] = -16813003;
        kr.hcys[521] = 1689022223;
        kr.hcys[522] = -882804514;
        kr.hcys[523] = -531676278;
        kr.hcys[524] = 1675548440;
        kr.hcys[525] = -891802878;
        kr.hcys[526] = 2138178458;
        kr.hcys[527] = -1309326892;
        kr.hcys[528] = -1508419598;
        kr.hcys[529] = 870378260;
        kr.hcys[530] = -1379925160;
        kr.hcys[531] = 1428463231;
        kr.hcys[532] = -1996485721;
        kr.hcys[533] = -1562931335;
        kr.hcys[534] = 695444069;
        kr.hcys[535] = 1038788657;
        kr.hcys[536] = 1610095717;
        kr.hcys[537] = -155545222;
        kr.hcys[538] = -227253632;
        kr.hcys[539] = -1874634292;
        kr.hcys[540] = -2003221391;
        kr.hcys[541] = 513252920;
        kr.hcys[542] = 1047247150;
        kr.hcys[543] = -299801345;
        kr.hcys[544] = 1147696831;
        kr.hcys[545] = -1316809248;
        kr.hcys[546] = 843207257;
        kr.hcys[547] = 1577878354;
        kr.hcys[548] = 391328893;
        kr.hcys[549] = -2071654220;
        kr.hcys[550] = 712252941;
        kr.hcys[551] = -269916004;
        kr.hcys[552] = -131310992;
        kr.hcys[553] = 1065236590;
        kr.hcys[554] = -1212838988;
        kr.hcys[555] = 987751205;
        kr.hcys[556] = -96246698;
        kr.hcys[557] = -1520740477;
        kr.hcys[558] = 1747359526;
        kr.hcys[559] = -1316420676;
        kr.hcys[560] = 1063087375;
        kr.hcys[561] = -2012770968;
        kr.hcys[562] = -1443459706;
        kr.hcys[563] = -1848091625;
        kr.hcys[564] = 403140495;
        kr.hcys[565] = 1662541409;
        kr.hcys[566] = 565021433;
        kr.hcys[567] = 1710117292;
        kr.hcys[568] = 1916445771;
        kr.hcys[569] = -1633491585;
        kr.hcys[570] = 497354396;
        kr.hcys[571] = 1641424978;
        kr.hcys[572] = 1855498948;
        kr.hcys[573] = -335550156;
        kr.hcys[574] = 527579409;
        kr.hcys[575] = -1189228203;
        kr.hcys[576] = -491665618;
        kr.hcys[577] = 1419286056;
        kr.hcys[578] = -1564516125;
        kr.hcys[579] = 612671995;
        kr.hcys[580] = 362618178;
        kr.hcys[581] = 91192677;
        kr.hcys[582] = -508897718;
        kr.hcys[583] = -823285364;
        kr.hcys[584] = -1323453346;
        kr.hcys[585] = 1880931695;
        kr.hcys[586] = -1807634926;
        kr.hcys[587] = -911087995;
        kr.hcys[588] = 1203434887;
        kr.hcys[589] = -395957520;
        kr.hcys[590] = 332251284;
        kr.hcys[591] = 1334525570;
        kr.hcys[592] = 161532546;
        kr.hcys[593] = 95788065;
        kr.hcys[594] = 1710168720;
        kr.hcys[595] = 799925836;
        kr.hcys[596] = 208502908;
        kr.hcys[597] = 1487883729;
        kr.hcys[598] = -488206999;
        kr.hcys[599] = 1451754558;
    }

    private static void heyi() {
        kr.hcyy[100] = 4166126914520514738L;
        kr.hcyy[101] = -1718604809648977489L;
        kr.hcyy[102] = 8014126924479156096L;
        kr.hcyy[103] = -5529993076149254447L;
        kr.hcyy[104] = -2621404835207763168L;
        kr.hcyy[105] = -6695191942064779323L;
        kr.hcyy[106] = -9151080799766189014L;
        kr.hcyy[107] = 3839880408683755967L;
        kr.hcyy[108] = -2698890112880998018L;
        kr.hcyy[109] = -9133730291631653764L;
        kr.hcyy[110] = 5766189452011811586L;
        kr.hcyy[111] = -8723903282525992993L;
        kr.hcyy[112] = -2144477851898144401L;
        kr.hcyy[113] = 5516035930786883236L;
        kr.hcyy[114] = -5912717045319583336L;
        kr.hcyy[115] = 6857027985567987470L;
        kr.hcyy[116] = -7047624542176927044L;
        kr.hcyy[117] = -3593039916530476103L;
        kr.hcyy[118] = 7153340389842983225L;
        kr.hcyy[119] = -1632925611799044175L;
        kr.hcyy[120] = 5614489030041687429L;
        kr.hcyy[121] = 337672660568592410L;
        kr.hcyy[122] = -8699486532414378086L;
        kr.hcyy[123] = -5791003798078207033L;
        kr.hcyy[124] = 2825161591310548632L;
        kr.hcyy[125] = 4405313474079485778L;
        kr.hcyy[126] = 5987626971192647128L;
        kr.hcyy[127] = 4072471616185495283L;
    }

    private static void heyb() {
        kr.hcyt[200] = -2050416172;
        kr.hcyt[201] = 1155778198;
        kr.hcyt[202] = -1396489469;
        kr.hcyt[203] = -860430444;
        kr.hcyt[204] = -95108174;
        kr.hcyt[205] = 787467228;
        kr.hcyt[206] = -1186343744;
        kr.hcyt[207] = 1438641706;
        kr.hcyt[208] = 2082081230;
        kr.hcyt[209] = 1660958090;
        kr.hcyt[210] = 1708507208;
        kr.hcyt[211] = -2045710638;
        kr.hcyt[212] = 514289486;
        kr.hcyt[213] = -2017388734;
        kr.hcyt[214] = 444111150;
        kr.hcyt[215] = 37076968;
        kr.hcyt[216] = 2128849752;
        kr.hcyt[217] = 1348448395;
        kr.hcyt[218] = -496736263;
        kr.hcyt[219] = -1423685089;
        kr.hcyt[220] = 1743719569;
        kr.hcyt[221] = -26805237;
        kr.hcyt[222] = -76719286;
        kr.hcyt[223] = -1026865960;
        kr.hcyt[224] = 2109769952;
        kr.hcyt[225] = -1552318987;
        kr.hcyt[226] = -1399658684;
        kr.hcyt[227] = 517499830;
        kr.hcyt[228] = -1407351434;
        kr.hcyt[229] = -634059329;
        kr.hcyt[230] = 1223751463;
        kr.hcyt[231] = 389282161;
        kr.hcyt[232] = -1258841326;
        kr.hcyt[233] = -1994107112;
        kr.hcyt[234] = -1486875330;
        kr.hcyt[235] = -684164117;
        kr.hcyt[236] = -936650111;
        kr.hcyt[237] = -127013351;
        kr.hcyt[238] = 1511369979;
        kr.hcyt[239] = 965432704;
        kr.hcyt[240] = -1269607068;
        kr.hcyt[241] = 36590266;
        kr.hcyt[242] = -217855137;
        kr.hcyt[243] = -1343583;
        kr.hcyt[244] = 621604661;
        kr.hcyt[245] = 291483527;
        kr.hcyt[246] = -1547042401;
        kr.hcyt[247] = 2140234403;
        kr.hcyt[248] = -215696757;
        kr.hcyt[249] = -1827168366;
        kr.hcyt[250] = 1895779844;
        kr.hcyt[251] = 1226036948;
        kr.hcyt[252] = -1233295715;
        kr.hcyt[253] = 1023371179;
        kr.hcyt[254] = 179777298;
        kr.hcyt[255] = -982277425;
        kr.hcyt[256] = 1155825924;
        kr.hcyt[257] = 1501171406;
        kr.hcyt[258] = -1784527636;
        kr.hcyt[259] = -1439692015;
        kr.hcyt[260] = 1279430596;
        kr.hcyt[261] = 422513116;
        kr.hcyt[262] = 1531782390;
        kr.hcyt[263] = -916699445;
        kr.hcyt[264] = -1104918644;
        kr.hcyt[265] = -1578668402;
        kr.hcyt[266] = 1795572668;
        kr.hcyt[267] = 2044128761;
        kr.hcyt[268] = -827694531;
        kr.hcyt[269] = 1326899622;
        kr.hcyt[270] = -903997166;
        kr.hcyt[271] = 1279374515;
        kr.hcyt[272] = 499243432;
        kr.hcyt[273] = -397888410;
        kr.hcyt[274] = 1740825211;
        kr.hcyt[275] = 1013516226;
        kr.hcyt[276] = -2023847268;
        kr.hcyt[277] = -1203968698;
        kr.hcyt[278] = -1058297906;
        kr.hcyt[279] = 565206645;
        kr.hcyt[280] = -1701936097;
        kr.hcyt[281] = -1542981664;
        kr.hcyt[282] = 31221270;
        kr.hcyt[283] = -183413323;
        kr.hcyt[284] = -404977926;
        kr.hcyt[285] = 256104495;
        kr.hcyt[286] = -1492679494;
        kr.hcyt[287] = 361293911;
        kr.hcyt[288] = 165443962;
        kr.hcyt[289] = 1619999992;
        kr.hcyt[290] = -1263601443;
        kr.hcyt[291] = 363813041;
        kr.hcyt[292] = 1462031221;
        kr.hcyt[293] = -344179321;
        kr.hcyt[294] = -974537977;
        kr.hcyt[295] = -1276338321;
        kr.hcyt[296] = -1348188533;
        kr.hcyt[297] = 1776684702;
        kr.hcyt[298] = -2032635132;
        kr.hcyt[299] = 1669624743;
    }

    private static long hcyx(int n2) {
        return hcyy[n2] ^ hcyz[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void flush() {
        v0 /* !! */  = kr.oc;
        if (true) ** GOTO lbl5
        block31: while (true) {
            v0 /* !! */  = (long)(kr.hcyu("hegc", hcyx(int ), (int)50) - kr.hcyu("hegb", hcyx(int ), (int)49));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 281567043: {
                    continue block31;
                }
                case 890790898: {
                    break block31;
                }
            }
            break;
        }
        var2 = kr.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = kr.oc - kr.hcyu("hegd", hcyx(int ), (int)51)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == kr.hcyu("hege", hcyr(int ), (int)441)) break;
            v1 /* !! */  = (long)kr.hcyu("hegf", hcyr(int ), (int)442);
        }
        var1_1 /* !! */  = kr.b;
        v2 /* !! */  = kr.oc;
        if (true) ** GOTO lbl22
        block33: while (true) {
            v2 /* !! */  = (long)(kr.hcyu("hegh", hcyx(int ), (int)53) - kr.hcyu("hegg", hcyx(int ), (int)52));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2137416668: {
                    continue block33;
                }
                case 890790898: {
                    break block33;
                }
            }
            break;
        }
        var0_2 = kr.a;
        if (var2) {
            throw null;
lbl30:
            // 5 sources

            return;
        }
        if (var0_2) ** GOTO lbl30
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** GOTO lbl30
                v3 /* !! */  = kr.oc;
                if (true) ** GOTO lbl41
                block35: while (true) {
                    v3 /* !! */  = (long)(v4 - kr.hcyu("hegi", hcyx(int ), (int)54));
lbl41:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1564911007: {
                            v4 = kr.hcyu("hegj", hcyx(int ), (int)55);
                            continue block35;
                        }
                        case -1064915881: {
                            v4 = kr.hcyu("hegk", hcyx(int ), (int)56);
                            continue block35;
                        }
                        case 890790898: {
                            break block35;
                        }
                        case 1919562832: {
                            v4 = kr.hcyu("hegl", hcyx(int ), (int)57);
                            continue block35;
                        }
                    }
                    break;
                }
                if (!kr.batching) ** GOTO lbl73
                if (var0_2 || var0_2) ** GOTO lbl30
                v5 /* !! */  = kr.oc;
                if (true) ** GOTO lbl59
                block36: while (true) {
                    v5 /* !! */  = (long)(v6 - kr.hcyu("hegm", hcyx(int ), (int)58));
lbl59:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1896369680: {
                            v6 = kr.hcyu("hegn", hcyx(int ), (int)59);
                            continue block36;
                        }
                        case -1566323319: {
                            v6 = kr.hcyu("hego", hcyx(int ), (int)60);
                            continue block36;
                        }
                        case 257306773: {
                            v6 = kr.hcyu("hegq", hcyx(int ), (int)61);
                            continue block36;
                        }
                        case 890790898: {
                            break block36;
                        }
                    }
                    break;
                }
                kr.flushBatch();
                if (var0_2) ** GOTO lbl30
lbl73:
                // 2 sources

                if (!var0_2 && !var0_2) ** break;
                ** continue;
                return;
            }
lbl76:
            // 3 sources

            case 0: {
                var1_1 /* !! */  = (int)kr.hcyu("hegs", hcyr(int ), (int)443);
                if (!var2) break;
                throw null;
            }
lbl80:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)kr.hcyu("hegt", hcyr(int ), (int)444);
                    if (!var2) ** GOTO lbl76
                    throw null;
                }
            }
            case 2: {
                var1_1 /* !! */  = (int)kr.hcyu("hegu", hcyr(int ), (int)445);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl103
            }
            case 3: {
                var1_1 /* !! */  = (int)kr.hcyu("hegv", hcyr(int ), (int)446);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl103
            }
            case 4: {
                var1_1 /* !! */  = (int)kr.hcyu("hegw", hcyr(int ), (int)447);
                if (!var2) ** GOTO lbl80
                throw null;
            }
lbl99:
            // 2 sources

            case 5: {
                var1_1 /* !! */  = (int)kr.hcyu("hegx", hcyr(int ), (int)448);
                if (!var2) ** GOTO lbl76
                throw null;
            }
lbl103:
            // 3 sources

            case 6: {
                do {
                    var1_1 /* !! */  = (int)kr.hcyu("heha", hcyr(int ), (int)449);
                } while (!var2);
                throw null;
            }
            case 7: {
                var1_1 /* !! */  = (int)kr.hcyu("hehc", hcyr(int ), (int)450);
                if (!var2) ** GOTO lbl99
                throw null;
            }
            case 8: 
        }
        var1_1 /* !! */  = (int)kr.hcyu("hehe", hcyr(int ), (int)451);
        ** while (!var2)
lbl115:
        // 1 sources

        throw null;
    }

    private static void hexv() {
        kr.hcys[400] = -1781317971;
        kr.hcys[401] = -190847861;
        kr.hcys[402] = 1906666690;
        kr.hcys[403] = -2035417844;
        kr.hcys[404] = 1908324178;
        kr.hcys[405] = 436641636;
        kr.hcys[406] = -1802375723;
        kr.hcys[407] = 1379093413;
        kr.hcys[408] = -308002491;
        kr.hcys[409] = -164656794;
        kr.hcys[410] = 1244313416;
        kr.hcys[411] = -105964293;
        kr.hcys[412] = -760294363;
        kr.hcys[413] = 12585853;
        kr.hcys[414] = 2048984880;
        kr.hcys[415] = 1497242354;
        kr.hcys[416] = -554473666;
        kr.hcys[417] = -1378193085;
        kr.hcys[418] = -1535879482;
        kr.hcys[419] = -1513201842;
        kr.hcys[420] = 1610656137;
        kr.hcys[421] = -1743497439;
        kr.hcys[422] = -1321349163;
        kr.hcys[423] = 2105831199;
        kr.hcys[424] = -305866554;
        kr.hcys[425] = 1119402681;
        kr.hcys[426] = 2051101067;
        kr.hcys[427] = 1230377751;
        kr.hcys[428] = 1776343246;
        kr.hcys[429] = -585631496;
        kr.hcys[430] = 1944080181;
        kr.hcys[431] = 883361799;
        kr.hcys[432] = -1669257105;
        kr.hcys[433] = -2087648766;
        kr.hcys[434] = 2115952137;
        kr.hcys[435] = -1934136815;
        kr.hcys[436] = -2064733251;
        kr.hcys[437] = 230184176;
        kr.hcys[438] = 521734508;
        kr.hcys[439] = -168269029;
        kr.hcys[440] = -1301470299;
        kr.hcys[441] = 237545707;
        kr.hcys[442] = -1309208395;
        kr.hcys[443] = 243679679;
        kr.hcys[444] = 930376561;
        kr.hcys[445] = 829115948;
        kr.hcys[446] = -2006352657;
        kr.hcys[447] = 1766246856;
        kr.hcys[448] = -357476202;
        kr.hcys[449] = 389877592;
        kr.hcys[450] = 472332171;
        kr.hcys[451] = 1101053383;
        kr.hcys[452] = -260779928;
        kr.hcys[453] = 1347915933;
        kr.hcys[454] = 987086097;
        kr.hcys[455] = 1324871554;
        kr.hcys[456] = -712555410;
        kr.hcys[457] = 900603895;
        kr.hcys[458] = -294342217;
        kr.hcys[459] = -935485657;
        kr.hcys[460] = 587327957;
        kr.hcys[461] = -1527020782;
        kr.hcys[462] = -1847553447;
        kr.hcys[463] = -82005169;
        kr.hcys[464] = -1298045912;
        kr.hcys[465] = 463310724;
        kr.hcys[466] = 1256269817;
        kr.hcys[467] = 259009617;
        kr.hcys[468] = -719172015;
        kr.hcys[469] = 1511963520;
        kr.hcys[470] = 621249834;
        kr.hcys[471] = -572120538;
        kr.hcys[472] = 1618832301;
        kr.hcys[473] = -1702223798;
        kr.hcys[474] = -1682908344;
        kr.hcys[475] = -1677531496;
        kr.hcys[476] = 485588097;
        kr.hcys[477] = -2072404358;
        kr.hcys[478] = 653644846;
        kr.hcys[479] = -690153011;
        kr.hcys[480] = 2049246289;
        kr.hcys[481] = -1667950155;
        kr.hcys[482] = -509325565;
        kr.hcys[483] = 841271558;
        kr.hcys[484] = 1233811880;
        kr.hcys[485] = -1657470815;
        kr.hcys[486] = 131836735;
        kr.hcys[487] = 1603595580;
        kr.hcys[488] = -2066370083;
        kr.hcys[489] = 306811770;
        kr.hcys[490] = -1396572527;
        kr.hcys[491] = 353359106;
        kr.hcys[492] = -17204049;
        kr.hcys[493] = -1899258857;
        kr.hcys[494] = 206233774;
        kr.hcys[495] = -1835246540;
        kr.hcys[496] = -1609513844;
        kr.hcys[497] = -1525509912;
        kr.hcys[498] = -1569806286;
        kr.hcys[499] = -964496564;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void prepareMsdfData(Matrix4f var0, ks var1_1, int var2_2, float var3_3, float var4_4) {
        var11_5 = kr.c;
        var10_6 /* !! */  = kr.b;
        var9_7 = kr.a;
        if (var11_5) {
            throw null;
lbl6:
            // 14 sources

            return;
        }
        if (var9_7 || var9_7) ** GOTO lbl6
        var5_8 = (float)(var2_2 >> kr.hcyu("hdlu", hcyr(int ), (int)331) & kr.hcyu("hdlv", hcyr(int ), (int)332)) / kr.hcyu("hdlw", hdam(int ), (int)333);
        if (var9_7 || var9_7) ** GOTO lbl6
        var6_9 = (float)(var2_2 >> kr.hcyu("hdlx", hcyr(int ), (int)334) & kr.hcyu("hdly", hcyr(int ), (int)335)) / kr.hcyu("hdlz", hdam(int ), (int)336);
        if (var9_7 || var9_7) ** GOTO lbl6
        var7_10 = (float)(var2_2 & kr.hcyu("hdma", hcyr(int ), (int)337)) / kr.hcyu("hdmb", hdam(int ), (int)338);
        if (var9_7 || var9_7) ** GOTO lbl6
        var8_11 = (float)(var2_2 >> kr.hcyu("hdmc", hcyr(int ), (int)339) & kr.hcyu("hdmd", hcyr(int ), (int)340)) / kr.hcyu("hdme", hdam(int ), (int)341);
        if (var9_7 || var9_7) ** GOTO lbl6
        kr.msdfData.clear();
        if (var9_7 || var9_7) ** GOTO lbl6
        kr.msdfData.putFloat(var0.m00()).putFloat(var0.m01()).putFloat(var0.m02()).putFloat(var0.m03());
        if (var9_7 || var9_7) ** GOTO lbl6
        kr.msdfData.putFloat(var0.m10()).putFloat(var0.m11()).putFloat(var0.m12()).putFloat(var0.m13());
        if (var9_7 || var9_7) ** GOTO lbl6
        kr.msdfData.putFloat(var0.m20()).putFloat(var0.m21()).putFloat(var0.m22()).putFloat(var0.m23());
        if (var10_6 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var10_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var9_7 || var9_7) ** GOTO lbl6
                kr.msdfData.putFloat(var0.m30()).putFloat(var0.m31()).putFloat(var0.m32()).putFloat(var0.m33());
                if (var9_7 || var9_7) ** GOTO lbl6
                kr.msdfData.putFloat(var5_8).putFloat(var6_9).putFloat(var7_10).putFloat(var8_11);
                if (var9_7 || var9_7) ** GOTO lbl6
                kr.msdfData.putFloat(var1_1.getPxRange()).putFloat((float)Math.toRadians(var3_3)).putFloat(0.0f).putFloat(0.0f);
                if (var9_7 || var9_7) ** GOTO lbl6
                kr.msdfData.putFloat(var4_4).putFloat(0.0f).putFloat(0.0f).putFloat(0.0f);
                if (var9_7 || var9_7) ** GOTO lbl6
                kr.msdfData.flip();
                if (var9_7 || var9_7) ** continue;
                return;
            }
lbl48:
            // 2 sources

            case 0: {
                var10_6 /* !! */  = (int)kr.hcyu("hdmf", hcyr(int ), (int)342);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl119
            }
lbl53:
            // 3 sources

            case 1: {
                var10_6 /* !! */  = (int)kr.hcyu("hdmg", hcyr(int ), (int)343);
                if (!var11_5) break;
                throw null;
            }
            case 2: {
                var10_6 /* !! */  = (int)kr.hcyu("hdmh", hcyr(int ), (int)344);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl100
            }
lbl62:
            // 2 sources

            case 3: {
                var10_6 /* !! */  = (int)kr.hcyu("hdmi", hcyr(int ), (int)345);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl133
            }
lbl67:
            // 4 sources

            case 4: {
                var10_6 /* !! */  = (int)kr.hcyu("hdmj", hcyr(int ), (int)346);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl77
            }
            case 5: {
                do {
                    var10_6 /* !! */  = (int)kr.hcyu("hdmk", hcyr(int ), (int)347);
                } while (!var11_5);
                throw null;
            }
lbl77:
            // 2 sources

            case 6: {
                var10_6 /* !! */  = (int)kr.hcyu("hdml", hcyr(int ), (int)348);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl145
            }
lbl82:
            // 3 sources

            case 7: {
                var10_6 /* !! */  = (int)kr.hcyu("hdmm", hcyr(int ), (int)349);
                if (!var11_5) ** GOTO lbl67
                throw null;
            }
            case 8: {
                var10_6 /* !! */  = (int)kr.hcyu("hdmn", hcyr(int ), (int)350);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl137
            }
            case 9: {
                var10_6 /* !! */  = (int)kr.hcyu("hdmo", hcyr(int ), (int)351);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl157
            }
lbl96:
            // 2 sources

            case 10: {
                var10_6 /* !! */  = (int)kr.hcyu("hdmp", hcyr(int ), (int)352);
                if (!var11_5) ** GOTO lbl82
                throw null;
            }
lbl100:
            // 2 sources

            case 11: {
                var10_6 /* !! */  = (int)kr.hcyu("hdmq", hcyr(int ), (int)353);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl161
            }
            case 12: {
                var10_6 /* !! */  = (int)kr.hcyu("hdmr", hcyr(int ), (int)354);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl124
            }
lbl110:
            // 2 sources

            case 13: {
                var10_6 /* !! */  = (int)kr.hcyu("hdms", hcyr(int ), (int)355);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl153
            }
            case 14: {
                var10_6 /* !! */  = (int)kr.hcyu("hdmt", hcyr(int ), (int)356);
                if (!var11_5) ** GOTO lbl82
                throw null;
            }
lbl119:
            // 2 sources

            case 15: {
                var10_6 /* !! */  = (int)kr.hcyu("hdmu", hcyr(int ), (int)357);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl124:
            // 3 sources

            case 16: {
                do {
                    var10_6 /* !! */  = (int)kr.hcyu("hdmv", hcyr(int ), (int)358);
                } while (!var11_5);
                throw null;
            }
            case 17: {
                var10_6 /* !! */  = (int)kr.hcyu("hdmw", hcyr(int ), (int)359);
                if (!var11_5) ** GOTO lbl110
                throw null;
            }
lbl133:
            // 3 sources

            case 18: {
                var10_6 /* !! */  = (int)kr.hcyu("hdmx", hcyr(int ), (int)360);
                if (!var11_5) ** GOTO lbl62
                throw null;
            }
lbl137:
            // 3 sources

            case 19: {
                var10_6 /* !! */  = (int)kr.hcyu("hdmy", hcyr(int ), (int)361);
                if (!var11_5) ** GOTO lbl53
                throw null;
            }
            case 20: {
                var10_6 /* !! */  = (int)kr.hcyu("hdmz", hcyr(int ), (int)362);
                if (!var11_5) ** GOTO lbl133
                throw null;
            }
lbl145:
            // 2 sources

            case 21: {
                var10_6 /* !! */  = (int)kr.hcyu("hdna", hcyr(int ), (int)363);
                if (!var11_5) ** GOTO lbl53
                throw null;
            }
            case 22: {
                var10_6 /* !! */  = (int)kr.hcyu("hdnb", hcyr(int ), (int)364);
                if (!var11_5) ** GOTO lbl137
                throw null;
            }
lbl153:
            // 2 sources

            case 23: {
                var10_6 /* !! */  = (int)kr.hcyu("hdnc", hcyr(int ), (int)365);
                if (!var11_5) ** GOTO lbl67
                throw null;
            }
lbl157:
            // 2 sources

            case 24: {
                var10_6 /* !! */  = (int)kr.hcyu("hdnd", hcyr(int ), (int)366);
                if (!var11_5) ** GOTO lbl67
                throw null;
            }
lbl161:
            // 2 sources

            case 25: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var10_6 /* !! */  = (int)kr.hcyu("hdne", hcyr(int ), (int)367);
                    if (!var11_5) break block0;
                    throw null;
                }
            }
lbl166:
            // 2 sources

            case 26: {
                var10_6 /* !! */  = (int)kr.hcyu("hdnf", hcyr(int ), (int)368);
                if (!var11_5) ** GOTO lbl48
                throw null;
            }
            case 27: {
                var10_6 /* !! */  = (int)kr.hcyu("hdng", hcyr(int ), (int)369);
                if (!var11_5) ** GOTO lbl124
                throw null;
            }
            case 28: {
                var10_6 /* !! */  = (int)kr.hcyu("hdnh", hcyr(int ), (int)370);
                if (!var11_5) ** GOTO lbl96
                throw null;
            }
            case 29: 
        }
        var10_6 /* !! */  = (int)kr.hcyu("hdni", hcyr(int ), (int)371);
        ** while (!var11_5)
lbl181:
        // 1 sources

        throw null;
    }

    private static void heyg() {
        kr.hcyt[700] = -1120844524;
        kr.hcyt[701] = -1871579904;
        kr.hcyt[702] = 1350363880;
        kr.hcyt[703] = -396539166;
        kr.hcyt[704] = -803676541;
        kr.hcyt[705] = 1498301086;
        kr.hcyt[706] = -988795919;
        kr.hcyt[707] = 865654459;
        kr.hcyt[708] = 327851287;
        kr.hcyt[709] = -1327320887;
        kr.hcyt[710] = -1203116151;
        kr.hcyt[711] = -597674835;
        kr.hcyt[712] = 352831234;
        kr.hcyt[713] = 1446291958;
        kr.hcyt[714] = -1357220013;
        kr.hcyt[715] = -1064070361;
        kr.hcyt[716] = -366810793;
        kr.hcyt[717] = 2099216771;
        kr.hcyt[718] = -1937831690;
        kr.hcyt[719] = 1750479240;
        kr.hcyt[720] = 880871202;
        kr.hcyt[721] = -1303906232;
        kr.hcyt[722] = 1351856886;
        kr.hcyt[723] = -1508215510;
        kr.hcyt[724] = -1665881772;
        kr.hcyt[725] = -636499830;
        kr.hcyt[726] = -469388044;
        kr.hcyt[727] = -2033263304;
        kr.hcyt[728] = -822591259;
        kr.hcyt[729] = -1106497201;
        kr.hcyt[730] = 1840425836;
        kr.hcyt[731] = 726373325;
        kr.hcyt[732] = -1778994958;
    }

    private static void heyj() {
        kr.hcyz[0] = 7416371573153789117L;
        kr.hcyz[1] = 4948063720863201017L;
        kr.hcyz[2] = -8934308679081072915L;
        kr.hcyz[3] = 3508916657671572097L;
        kr.hcyz[4] = 6958237244270285059L;
        kr.hcyz[5] = -4233190393129127316L;
        kr.hcyz[6] = -2422325513513314144L;
        kr.hcyz[7] = 2074487734576288234L;
        kr.hcyz[8] = -9200797786356684947L;
        kr.hcyz[9] = 6859684819986992877L;
        kr.hcyz[10] = 8827214284871164984L;
        kr.hcyz[11] = 5094141598597891619L;
        kr.hcyz[12] = 4925564224078688444L;
        kr.hcyz[13] = 5761389301526730553L;
        kr.hcyz[14] = -5688342907704158541L;
        kr.hcyz[15] = -2181465473734176989L;
        kr.hcyz[16] = -4267797468222531831L;
        kr.hcyz[17] = 2945916969238973284L;
        kr.hcyz[18] = -7262416043114604425L;
        kr.hcyz[19] = 5751906532076834155L;
        kr.hcyz[20] = -1494542669207603741L;
        kr.hcyz[21] = 9025952047862431537L;
        kr.hcyz[22] = 511855279356351601L;
        kr.hcyz[23] = 8190049347395552875L;
        kr.hcyz[24] = 4553071711995601934L;
        kr.hcyz[25] = 1181036333354186550L;
        kr.hcyz[26] = 3810597332694606330L;
        kr.hcyz[27] = 5650401130741245209L;
        kr.hcyz[28] = 4477844480396190526L;
        kr.hcyz[29] = 6375606535049229237L;
        kr.hcyz[30] = -2915462058818138179L;
        kr.hcyz[31] = -1087857783208449348L;
        kr.hcyz[32] = 1745943462080512567L;
        kr.hcyz[33] = 2503791252196094585L;
        kr.hcyz[34] = 5584185265307657868L;
        kr.hcyz[35] = -2465025412733217516L;
        kr.hcyz[36] = -1536971527314585620L;
        kr.hcyz[37] = -7845793537063511980L;
        kr.hcyz[38] = 9092755887148448304L;
        kr.hcyz[39] = -6853136250743685795L;
        kr.hcyz[40] = 7031202766048179692L;
        kr.hcyz[41] = -1427130977436825998L;
        kr.hcyz[42] = 8746181534645964102L;
        kr.hcyz[43] = 7206489497213907410L;
        kr.hcyz[44] = 7832278041513194742L;
        kr.hcyz[45] = 8003183853730046996L;
        kr.hcyz[46] = 2364641609867713479L;
        kr.hcyz[47] = -381814485888689195L;
        kr.hcyz[48] = 3581829856272432685L;
        kr.hcyz[49] = -8745826751989454855L;
        kr.hcyz[50] = 1012649132214830931L;
        kr.hcyz[51] = -8149413519306642679L;
        kr.hcyz[52] = -9194998451351903625L;
        kr.hcyz[53] = -1868989018409432487L;
        kr.hcyz[54] = 4274263701794175144L;
        kr.hcyz[55] = -6418071955992797052L;
        kr.hcyz[56] = -3015586821314696498L;
        kr.hcyz[57] = -1363583921997934205L;
        kr.hcyz[58] = -2646937651686833815L;
        kr.hcyz[59] = 4474364056468744606L;
        kr.hcyz[60] = -251728532336800496L;
        kr.hcyz[61] = 6092147292850327530L;
        kr.hcyz[62] = 4982576015291231853L;
        kr.hcyz[63] = 3837055036903758247L;
        kr.hcyz[64] = -3000716292921090980L;
        kr.hcyz[65] = -3188831345900970267L;
        kr.hcyz[66] = -1263709329425625632L;
        kr.hcyz[67] = 1332147384197839088L;
        kr.hcyz[68] = 6721987392331165536L;
        kr.hcyz[69] = 2103452195168839530L;
        kr.hcyz[70] = -4977160265197290316L;
        kr.hcyz[71] = -4963007035919231737L;
        kr.hcyz[72] = -7598532051705110510L;
        kr.hcyz[73] = -7971231245523325326L;
        kr.hcyz[74] = 1611612318253868628L;
        kr.hcyz[75] = 1144866796187345542L;
        kr.hcyz[76] = 1968809016098780514L;
        kr.hcyz[77] = -2012626556850953172L;
        kr.hcyz[78] = -5712338259126226537L;
        kr.hcyz[79] = -2562419248022022841L;
        kr.hcyz[80] = -8995999538526723212L;
        kr.hcyz[81] = 4124760724887841895L;
        kr.hcyz[82] = -1137758354203161944L;
        kr.hcyz[83] = 5150796875318708228L;
        kr.hcyz[84] = -7089400415173883015L;
        kr.hcyz[85] = -3778456925228880465L;
        kr.hcyz[86] = -3001714102884743275L;
        kr.hcyz[87] = 704315473178619425L;
        kr.hcyz[88] = -8672774488907880641L;
        kr.hcyz[89] = 5327372715341556220L;
        kr.hcyz[90] = -4214498292819637098L;
        kr.hcyz[91] = 5570511165138923637L;
        kr.hcyz[92] = 7861345783093641377L;
        kr.hcyz[93] = -2637850456013199325L;
        kr.hcyz[94] = 2708423121613646334L;
        kr.hcyz[95] = -1493821855885526289L;
        kr.hcyz[96] = -792908582713024035L;
        kr.hcyz[97] = -730255817888354744L;
        kr.hcyz[98] = -5971309812230379282L;
        kr.hcyz[99] = -5164430339050317308L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void shutdown() {
        block86: {
            block85: {
                block84: {
                    block83: {
                        var2 = kr.c;
                        var1_1 /* !! */  = kr.b;
                        var0_2 = kr.a;
                        if (var2) {
                            throw null;
lbl6:
                            // 23 sources

                            return;
                        }
                        if (var0_2 || var0_2) ** GOTO lbl6
                        kq.invalidateFontCache();
                        if (var0_2 || var0_2) ** GOTO lbl6
                        if (kr.msdfBuffer == null) break block83;
                        if (var0_2 || var0_2) ** GOTO lbl6
                        kr.msdfBuffer.close();
                        if (var0_2 || var0_2) ** GOTO lbl6
                        kr.msdfBuffer = null;
                        if (var0_2) ** GOTO lbl6
                    }
                    if (var0_2 || var0_2) ** GOTO lbl6
                    if (kr.glyphBuffer == null) break block84;
                    if (var0_2 || var0_2) ** GOTO lbl6
                    kr.glyphBuffer.close();
                    if (var0_2 || var0_2) ** GOTO lbl6
                    kr.glyphBuffer = null;
                    if (var0_2) ** GOTO lbl6
                }
                if (var0_2 || var0_2) ** GOTO lbl6
                if (kr.msdfData == null) break block85;
                if (var0_2 || var0_2) ** GOTO lbl6
                MemoryUtil.memFree((Buffer)kr.msdfData);
                if (var0_2 || var0_2) ** GOTO lbl6
                kr.msdfData = null;
                if (var0_2) ** GOTO lbl6
            }
            if (var0_2 || var0_2) ** GOTO lbl6
            if (kr.glyphData == null) break block86;
            if (var0_2 || var0_2) ** GOTO lbl6
            MemoryUtil.memFree((Buffer)kr.glyphData);
            if (var0_2 || var0_2) ** GOTO lbl6
            kr.glyphData = null;
            if (var0_2) ** GOTO lbl6
        }
        if (var0_2) ** GOTO lbl6
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** GOTO lbl6
                kr.pipeline = null;
                if (var0_2 || var0_2) ** GOTO lbl6
                kr.initialized = kr.hcyu("heuk", hcyr(int ), (int)669);
                if (var0_2 || var0_2) ** GOTO lbl6
                kr.batching = kr.hcyu("heul", hcyr(int ), (int)670);
                if (var0_2 || var0_2) ** GOTO lbl6
                kr.resetBatch();
                if (!var0_2 && !var0_2) ** break;
                ** continue;
                return;
            }
lbl57:
            // 3 sources

            case 0: {
                var1_1 /* !! */  = (int)kr.hcyu("heum", hcyr(int ), (int)671);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl188
            }
lbl62:
            // 2 sources

            case 1: {
                var1_1 /* !! */  = (int)kr.hcyu("heun", hcyr(int ), (int)672);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl241
            }
lbl67:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)kr.hcyu("heuo", hcyr(int ), (int)673);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl233
                    break;
                }
            }
            case 3: {
                var1_1 /* !! */  = (int)kr.hcyu("heup", hcyr(int ), (int)674);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 4: {
                var1_1 /* !! */  = (int)kr.hcyu("heuq", hcyr(int ), (int)675);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl233
            }
            case 5: {
                var1_1 /* !! */  = (int)kr.hcyu("heur", hcyr(int ), (int)676);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl88:
            // 2 sources

            case 6: {
                var1_1 /* !! */  = (int)kr.hcyu("heus", hcyr(int ), (int)677);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl170
            }
            case 7: {
                var1_1 /* !! */  = (int)kr.hcyu("heut", hcyr(int ), (int)678);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl200
            }
lbl98:
            // 2 sources

            case 8: {
                var1_1 /* !! */  = (int)kr.hcyu("heuu", hcyr(int ), (int)679);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl225
            }
            case 9: {
                var1_1 /* !! */  = (int)kr.hcyu("heuv", hcyr(int ), (int)680);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl165
            }
            case 10: {
                var1_1 /* !! */  = (int)kr.hcyu("heuw", hcyr(int ), (int)681);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl212
            }
            case 11: {
                var1_1 /* !! */  = (int)kr.hcyu("heux", hcyr(int ), (int)682);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl118:
            // 4 sources

            case 12: {
                var1_1 /* !! */  = (int)kr.hcyu("heuy", hcyr(int ), (int)683);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl241
            }
lbl123:
            // 2 sources

            case 13: {
                var1_1 /* !! */  = (int)kr.hcyu("heuz", hcyr(int ), (int)684);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl128:
            // 2 sources

            case 14: {
                var1_1 /* !! */  = (int)kr.hcyu("heva", hcyr(int ), (int)685);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl179
            }
lbl133:
            // 2 sources

            case 15: {
                var1_1 /* !! */  = (int)kr.hcyu("hevb", hcyr(int ), (int)686);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl165
            }
lbl138:
            // 2 sources

            case 16: {
                var1_1 /* !! */  = (int)kr.hcyu("hevc", hcyr(int ), (int)687);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl237
            }
lbl143:
            // 3 sources

            case 17: {
                var1_1 /* !! */  = (int)kr.hcyu("hevd", hcyr(int ), (int)688);
                if (!var2) ** GOTO lbl138
                throw null;
            }
            case 18: {
                var1_1 /* !! */  = (int)kr.hcyu("heve", hcyr(int ), (int)689);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl179
            }
lbl152:
            // 2 sources

            case 19: {
                var1_1 /* !! */  = (int)kr.hcyu("hevf", hcyr(int ), (int)690);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl192
            }
            case 20: {
                var1_1 /* !! */  = (int)kr.hcyu("hevg", hcyr(int ), (int)691);
                if (!var2) ** GOTO lbl118
                throw null;
            }
            case 21: {
                var1_1 /* !! */  = (int)kr.hcyu("hevh", hcyr(int ), (int)692);
                if (!var2) ** GOTO lbl67
                throw null;
            }
lbl165:
            // 3 sources

            case 22: {
                var1_1 /* !! */  = (int)kr.hcyu("hevi", hcyr(int ), (int)693);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl208
            }
lbl170:
            // 2 sources

            case 23: {
                var1_1 /* !! */  = (int)kr.hcyu("hevj", hcyr(int ), (int)694);
                if (!var2) ** GOTO lbl62
                throw null;
            }
lbl174:
            // 2 sources

            case 24: {
                var1_1 /* !! */  = (int)kr.hcyu("hevk", hcyr(int ), (int)695);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl233
            }
lbl179:
            // 4 sources

            case 25: {
                var1_1 /* !! */  = (int)kr.hcyu("hevl", hcyr(int ), (int)696);
                if (!var2) break;
                throw null;
            }
            case 26: {
                do {
                    var1_1 /* !! */  = (int)kr.hcyu("hevm", hcyr(int ), (int)697);
                } while (!var2);
                throw null;
            }
lbl188:
            // 2 sources

            case 27: {
                var1_1 /* !! */  = (int)kr.hcyu("hevn", hcyr(int ), (int)698);
                if (!var2) ** GOTO lbl128
                throw null;
            }
lbl192:
            // 2 sources

            case 28: {
                var1_1 /* !! */  = (int)kr.hcyu("hevo", hcyr(int ), (int)699);
                if (!var2) ** GOTO lbl179
                throw null;
            }
            case 29: {
                var1_1 /* !! */  = (int)kr.hcyu("hevp", hcyr(int ), (int)700);
                if (!var2) ** GOTO lbl143
                throw null;
            }
lbl200:
            // 2 sources

            case 30: {
                var1_1 /* !! */  = (int)kr.hcyu("hevq", hcyr(int ), (int)701);
                if (!var2) ** GOTO lbl174
                throw null;
            }
lbl204:
            // 2 sources

            case 31: {
                var1_1 /* !! */  = (int)kr.hcyu("hevr", hcyr(int ), (int)702);
                if (!var2) ** GOTO lbl98
                throw null;
            }
lbl208:
            // 2 sources

            case 32: {
                var1_1 /* !! */  = (int)kr.hcyu("hevs", hcyr(int ), (int)703);
                if (!var2) ** GOTO lbl133
                throw null;
            }
lbl212:
            // 2 sources

            case 33: {
                var1_1 /* !! */  = (int)kr.hcyu("hevt", hcyr(int ), (int)704);
                if (!var2) ** GOTO lbl57
                throw null;
            }
lbl216:
            // 2 sources

            case 34: {
                var1_1 /* !! */  = (int)kr.hcyu("hevu", hcyr(int ), (int)705);
                if (!var2) ** GOTO lbl118
                throw null;
            }
            case 35: {
                do {
                    var1_1 /* !! */  = (int)kr.hcyu("hevv", hcyr(int ), (int)706);
                } while (!var2);
                throw null;
            }
lbl225:
            // 2 sources

            case 36: {
                var1_1 /* !! */  = (int)kr.hcyu("hevw", hcyr(int ), (int)707);
                if (!var2) ** GOTO lbl57
                throw null;
            }
            case 37: {
                var1_1 /* !! */  = (int)kr.hcyu("hevx", hcyr(int ), (int)708);
                if (!var2) ** GOTO lbl118
                throw null;
            }
lbl233:
            // 4 sources

            case 38: {
                var1_1 /* !! */  = (int)kr.hcyu("hevy", hcyr(int ), (int)709);
                if (!var2) break;
                throw null;
            }
lbl237:
            // 2 sources

            case 39: {
                var1_1 /* !! */  = (int)kr.hcyu("hevz", hcyr(int ), (int)710);
                if (!var2) ** GOTO lbl123
                throw null;
            }
lbl241:
            // 3 sources

            case 40: {
                var1_1 /* !! */  = (int)kr.hcyu("hewa", hcyr(int ), (int)711);
                if (!var2) ** GOTO lbl88
                throw null;
            }
            case 41: 
        }
        var1_1 /* !! */  = (int)kr.hcyu("hewb", hcyr(int ), (int)712);
        ** while (!var2)
lbl248:
        // 1 sources

        throw null;
    }

    static {
        hcys = new int[733];
        hcyt = new int[733];
        kr.hexr();
        kr.hexs();
        kr.hext();
        kr.hexu();
        kr.hexv();
        kr.hexw();
        kr.hexx();
        kr.hexy();
        kr.hexz();
        kr.heya();
        kr.heyb();
        kr.heyc();
        kr.heyd();
        kr.heye();
        kr.heyf();
        kr.heyg();
        hcyy = new long[128];
        hcyz = new long[128];
        kr.heyh();
        kr.heyi();
        kr.heyj();
        kr.heyk();
        initialized = false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void appendString(Matrix4f var0, ks var1_1, String var2_2, float var3_3, float var4_4, float var5_5, int var6_6, int[] var7_7, float var8_8, float var9_9) {
        var23_10 = kr.c;
        var22_11 /* !! */  = kr.b;
        var21_12 = kr.a;
        if (var23_10) {
            throw null;
lbl6:
            // 38 sources

            return;
        }
        if (var21_12 || var21_12) ** GOTO lbl6
        kr.prepareBatch(var0, var1_1, var8_8, var9_9);
        if (var21_12 || var21_12) ** GOTO lbl6
        var10_13 = var5_5 / var1_1.getEmSize();
        if (var21_12 || var21_12) ** GOTO lbl6
        var11_14 = var3_3;
        if (var21_12 || var21_12) ** GOTO lbl6
        var12_15 = var4_4 + var1_1.getAscender() * var10_13;
        if (var21_12 || var21_12) ** GOTO lbl6
        var13_16 = kr.hcyu("hehl", hcyr(int ), (int)452);
        if (var21_12) ** GOTO lbl6
        block74: while (true) {
            block139: {
                block138: {
                    if (var21_12 || var21_12) ** GOTO lbl6
                    if (var13_16 >= var2_2.length()) ** GOTO lbl92
                    if (var21_12 || var21_12) ** GOTO lbl6
                    var14_17 = var2_2.charAt((int)var13_16);
                    if (var21_12 || var21_12) ** GOTO lbl6
                    var15_18 = var1_1.getGlyph(var14_17);
                    if (var21_12 || var21_12) ** GOTO lbl6
                    if (var15_18 != null) break block138;
                    if (var21_12 || var21_12) ** GOTO lbl6
                    var15_18 = var1_1.getGlyph((int)kr.hcyu("heho", hcyr(int ), (int)453));
                    if (var21_12 || var21_12) ** GOTO lbl6
                    if (var15_18 != null) break block138;
                    if (var21_12 || var21_12) ** GOTO lbl6
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl87
                }
                if (var21_12 || var21_12) ** GOTO lbl6
                if (!(var15_18.width > 0.0f)) ** GOTO lbl84
                if (var21_12) ** GOTO lbl6
                if (!(var15_18.height > 0.0f)) ** GOTO lbl84
                if (var21_12 || var21_12) ** GOTO lbl6
                if (kr.batchGlyphCount != kr.hcyu("hehq", hcyr(int ), (int)454)) break block139;
                if (var21_12 || var21_12) ** GOTO lbl6
                kr.flushBatch();
                if (var21_12 || var21_12) ** GOTO lbl6
                kr.prepareBatch(var0, var1_1, var8_8, var9_9);
                if (var21_12) ** GOTO lbl6
            }
            if (var21_12 || var21_12) ** GOTO lbl6
            var16_19 = var11_14 + var15_18.bearingX * var10_13;
            if (var21_12) ** GOTO lbl6
            if (var22_11 /* !! */  == 0) ** GOTO lbl-1000
            switch (var22_11 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var21_12) ** GOTO lbl6
                    var17_20 = var12_15 - var15_18.bearingY * var10_13;
                    if (var21_12 || var21_12) ** GOTO lbl6
                    var18_21 = var15_18.width * var10_13;
                    if (var21_12 || var21_12) ** GOTO lbl6
                    var19_22 = var15_18.height * var10_13;
                    if (var21_12 || var21_12) ** GOTO lbl6
                    if (var7_7 != null) ** GOTO lbl68
                    if (var21_12) ** GOTO lbl6
                    v0 = var6_6;
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl70
lbl68:
                    // 1 sources

                    if (var21_12 || var21_12) ** GOTO lbl6
                    v0 = var20_23 = var7_7[var13_16 % var7_7.length];
lbl70:
                    // 2 sources

                    if (var21_12 || var21_12) ** GOTO lbl6
                    kr.glyphData.putFloat(var16_19).putFloat(var17_20).putFloat(var18_21).putFloat(var19_22);
                    if (var21_12 || var21_12) ** GOTO lbl6
                    kr.glyphData.putFloat(var15_18.u0).putFloat(var15_18.v0);
                    if (var21_12 || var21_12) ** GOTO lbl6
                    kr.glyphData.putFloat(var15_18.u1 - var15_18.u0).putFloat(var15_18.v1 - var15_18.v0);
                    if (var21_12 || var21_12) ** GOTO lbl6
                    kr.putColor(kr.glyphData, var20_23);
                    if (var21_12 || var21_12) ** GOTO lbl6
                    kr.batchGlyphCount += kr.hcyu("heir", hcyr(int ), (int)455);
                    if (var21_12) ** GOTO lbl6
lbl84:
                    // 3 sources

                    if (var21_12 || var21_12) ** GOTO lbl6
                    var11_14 += var15_18.advance * var10_13;
                    if (var21_12) ** GOTO lbl6
lbl87:
                    // 2 sources

                    if (var21_12 || var21_12) ** GOTO lbl6
                    ++var13_16;
                    if (var21_12) ** GOTO lbl6
                    if (!var23_10) continue block74;
                    throw null;
                }
lbl92:
                // 1 sources

                if (!var21_12 && !var21_12) ** break;
                ** continue;
                return;
lbl95:
                // 4 sources

                case 0: {
                    var22_11 /* !! */  = (int)kr.hcyu("heiu", hcyr(int ), (int)456);
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl229
                }
                case 1: {
                    var22_11 /* !! */  = (int)kr.hcyu("heiz", hcyr(int ), (int)457);
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl331
                }
lbl105:
                // 5 sources

                case 2: {
                    var22_11 /* !! */  = (int)kr.hcyu("heja", hcyr(int ), (int)458);
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl198
                }
                case 3: {
                    var22_11 /* !! */  = (int)kr.hcyu("hejc", hcyr(int ), (int)459);
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl120
                }
lbl115:
                // 2 sources

                case 4: {
                    var22_11 /* !! */  = (int)kr.hcyu("hejd", hcyr(int ), (int)460);
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl243
                }
lbl120:
                // 3 sources

                case 5: {
                    var22_11 /* !! */  = (int)kr.hcyu("hejf", hcyr(int ), (int)461);
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl361
                }
lbl125:
                // 2 sources

                case 6: {
                    var22_11 /* !! */  = (int)kr.hcyu("hejg", hcyr(int ), (int)462);
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl150
                }
lbl130:
                // 3 sources

                case 7: {
                    var22_11 /* !! */  = (int)kr.hcyu("heji", hcyr(int ), (int)463);
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl349
                }
lbl135:
                // 3 sources

                case 8: {
                    var22_11 /* !! */  = (int)kr.hcyu("hejl", hcyr(int ), (int)464);
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl243
                }
                case 9: {
                    var22_11 /* !! */  = (int)kr.hcyu("hejn", hcyr(int ), (int)465);
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl302
                }
lbl145:
                // 2 sources

                case 10: {
                    var22_11 /* !! */  = (int)kr.hcyu("hejp", hcyr(int ), (int)466);
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl398
                }
lbl150:
                // 2 sources

                case 11: {
                    var22_11 /* !! */  = (int)kr.hcyu("hejr", hcyr(int ), (int)467);
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl243
                }
                case 12: {
                    var22_11 /* !! */  = (int)kr.hcyu("hejt", hcyr(int ), (int)468);
                    if (!var23_10) ** GOTO lbl105
                    throw null;
                }
                case 13: {
                    var22_11 /* !! */  = (int)kr.hcyu("hejv", hcyr(int ), (int)469);
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl224
                }
lbl164:
                // 2 sources

                case 14: {
                    var22_11 /* !! */  = (int)kr.hcyu("hejw", hcyr(int ), (int)470);
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl306
                }
                case 15: {
                    var22_11 /* !! */  = (int)kr.hcyu("heka", hcyr(int ), (int)471);
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl184
                }
                case 16: {
                    var22_11 /* !! */  = (int)kr.hcyu("hekc", hcyr(int ), (int)472);
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl377
                }
lbl179:
                // 3 sources

                case 17: {
                    var22_11 /* !! */  = (int)kr.hcyu("heke", hcyr(int ), (int)473);
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl297
                }
lbl184:
                // 2 sources

                case 18: {
                    var22_11 /* !! */  = (int)kr.hcyu("hekg", hcyr(int ), (int)474);
                    if (!var23_10) ** GOTO lbl179
                    throw null;
                }
lbl188:
                // 3 sources

                case 19: {
                    var22_11 /* !! */  = (int)kr.hcyu("heki", hcyr(int ), (int)475);
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl207
                }
lbl193:
                // 2 sources

                case 20: {
                    var22_11 /* !! */  = (int)kr.hcyu("hekj", hcyr(int ), (int)476);
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl361
                }
lbl198:
                // 2 sources

                case 21: {
                    var22_11 /* !! */  = (int)kr.hcyu("hekk", hcyr(int ), (int)477);
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl357
                }
                case 22: {
                    var22_11 /* !! */  = (int)kr.hcyu("hekp", hcyr(int ), (int)478);
                    if (!var23_10) ** GOTO lbl135
                    throw null;
                }
lbl207:
                // 3 sources

                case 23: {
                    var22_11 /* !! */  = (int)kr.hcyu("hekr", hcyr(int ), (int)479);
                    if (!var23_10) ** GOTO lbl120
                    throw null;
                }
                case 24: {
                    var22_11 /* !! */  = (int)kr.hcyu("hekt", hcyr(int ), (int)480);
                    if (!var23_10) ** GOTO lbl179
                    throw null;
                }
                case 25: {
                    var22_11 /* !! */  = (int)kr.hcyu("heku", hcyr(int ), (int)481);
                    if (!var23_10) ** GOTO lbl115
                    throw null;
                }
                case 26: {
                    var22_11 /* !! */  = (int)kr.hcyu("hekw", hcyr(int ), (int)482);
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl331
                }
lbl224:
                // 3 sources

                case 27: {
                    var22_11 /* !! */  = (int)kr.hcyu("hekx", hcyr(int ), (int)483);
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl385
                }
lbl229:
                // 2 sources

                case 28: {
                    var22_11 /* !! */  = (int)kr.hcyu("heky", hcyr(int ), (int)484);
                    if (!var23_10) ** GOTO lbl188
                    throw null;
                }
                case 29: {
                    var22_11 /* !! */  = (int)kr.hcyu("helb", hcyr(int ), (int)485);
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl310
                }
                case 30: {
                    var22_11 /* !! */  = (int)kr.hcyu("helc", hcyr(int ), (int)486);
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl377
                }
lbl243:
                // 5 sources

                case 31: {
                    var22_11 /* !! */  = (int)kr.hcyu("held", hcyr(int ), (int)487);
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl394
                }
                case 32: {
                    var22_11 /* !! */  = (int)kr.hcyu("hele", hcyr(int ), (int)488);
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl288
                }
                case 33: {
                    var22_11 /* !! */  = (int)kr.hcyu("helf", hcyr(int ), (int)489);
                    if (!var23_10) ** GOTO lbl164
                    throw null;
                }
lbl257:
                // 2 sources

                case 34: {
                    var22_11 /* !! */  = (int)kr.hcyu("helg", hcyr(int ), (int)490);
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl310
                }
                case 35: {
                    var22_11 /* !! */  = (int)kr.hcyu("helh", hcyr(int ), (int)491);
                    if (!var23_10) ** GOTO lbl188
                    throw null;
                }
                case 36: {
                    var22_11 /* !! */  = (int)kr.hcyu("heli", hcyr(int ), (int)492);
                    if (!var23_10) break block74;
                    throw null;
                }
                case 37: {
                    var22_11 /* !! */  = (int)kr.hcyu("helj", hcyr(int ), (int)493);
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl297
                }
                case 38: {
                    var22_11 /* !! */  = (int)kr.hcyu("helk", hcyr(int ), (int)494);
                    if (!var23_10) ** GOTO lbl95
                    throw null;
                }
                case 39: {
                    var22_11 /* !! */  = (int)kr.hcyu("hell", hcyr(int ), (int)495);
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl323
                }
lbl284:
                // 2 sources

                case 40: {
                    var22_11 /* !! */  = (int)kr.hcyu("helm", hcyr(int ), (int)496);
                    if (!var23_10) ** GOTO lbl135
                    throw null;
                }
lbl288:
                // 2 sources

                case 41: {
                    var22_11 /* !! */  = (int)kr.hcyu("heln", hcyr(int ), (int)497);
                    if (!var23_10) ** GOTO lbl193
                    throw null;
                }
lbl292:
                // 2 sources

                case 42: {
                    var22_11 /* !! */  = (int)kr.hcyu("helz", hcyr(int ), (int)498);
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl394
                }
lbl297:
                // 4 sources

                case 43: {
                    var22_11 /* !! */  = (int)kr.hcyu("hema", hcyr(int ), (int)499);
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl327
                }
lbl302:
                // 2 sources

                case 44: {
                    var22_11 /* !! */  = (int)kr.hcyu("hemc", hcyr(int ), (int)500);
                    if (!var23_10) ** GOTO lbl130
                    throw null;
                }
lbl306:
                // 2 sources

                case 45: {
                    var22_11 /* !! */  = (int)kr.hcyu("hemd", hcyr(int ), (int)501);
                    if (!var23_10) ** GOTO lbl284
                    throw null;
                }
lbl310:
                // 3 sources

                case 46: {
                    var22_11 /* !! */  = (int)kr.hcyu("heme", hcyr(int ), (int)502);
                    if (!var23_10) ** GOTO lbl145
                    throw null;
                }
lbl314:
                // 2 sources

                case 47: {
                    var22_11 /* !! */  = (int)kr.hcyu("hemf", hcyr(int ), (int)503);
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl331
                }
                case 48: {
                    var22_11 /* !! */  = (int)kr.hcyu("hemg", hcyr(int ), (int)504);
                    if (!var23_10) ** GOTO lbl297
                    throw null;
                }
lbl323:
                // 4 sources

                case 49: {
                    var22_11 /* !! */  = (int)kr.hcyu("hemh", hcyr(int ), (int)505);
                    if (!var23_10) ** GOTO lbl224
                    throw null;
                }
lbl327:
                // 3 sources

                case 50: {
                    var22_11 /* !! */  = (int)kr.hcyu("hemi", hcyr(int ), (int)506);
                    if (!var23_10) ** GOTO lbl323
                    throw null;
                }
lbl331:
                // 4 sources

                case 51: {
                    var22_11 /* !! */  = (int)kr.hcyu("hemj", hcyr(int ), (int)507);
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl407
                }
lbl336:
                // 2 sources

                case 52: {
                    var22_11 /* !! */  = (int)kr.hcyu("hemk", hcyr(int ), (int)508);
                    if (!var23_10) ** GOTO lbl130
                    throw null;
                }
                case 53: {
                    var22_11 /* !! */  = (int)kr.hcyu("heml", hcyr(int ), (int)509);
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl365
                }
                case 54: {
                    var22_11 /* !! */  = (int)kr.hcyu("hemn", hcyr(int ), (int)510);
                    if (!var23_10) ** GOTO lbl105
                    throw null;
                }
lbl349:
                // 2 sources

                case 55: {
                    var22_11 /* !! */  = (int)kr.hcyu("hemo", hcyr(int ), (int)511);
                    if (var23_10) {
                        throw null;
                    }
                }
                case 56: {
                    var22_11 /* !! */  = (int)kr.hcyu("hemp", hcyr(int ), (int)512);
                    if (!var23_10) ** GOTO lbl314
                    throw null;
                }
lbl357:
                // 2 sources

                case 57: {
                    var22_11 /* !! */  = (int)kr.hcyu("hemq", hcyr(int ), (int)513);
                    if (!var23_10) ** GOTO lbl207
                    throw null;
                }
lbl361:
                // 3 sources

                case 58: {
                    var22_11 /* !! */  = (int)kr.hcyu("hemr", hcyr(int ), (int)514);
                    if (!var23_10) ** GOTO lbl105
                    throw null;
                }
lbl365:
                // 2 sources

                case 59: {
                    var22_11 /* !! */  = (int)kr.hcyu("hems", hcyr(int ), (int)515);
                    if (!var23_10) ** GOTO lbl95
                    throw null;
                }
                case 60: {
                    var22_11 /* !! */  = (int)kr.hcyu("hemt", hcyr(int ), (int)516);
                    if (!var23_10) ** GOTO lbl336
                    throw null;
                }
                case 61: {
                    var22_11 /* !! */  = (int)kr.hcyu("hemu", hcyr(int ), (int)517);
                    if (!var23_10) ** GOTO lbl327
                    throw null;
                }
lbl377:
                // 3 sources

                case 62: {
                    var22_11 /* !! */  = (int)kr.hcyu("hemv", hcyr(int ), (int)518);
                    if (!var23_10) ** GOTO lbl323
                    throw null;
                }
                case 63: {
                    var22_11 /* !! */  = (int)kr.hcyu("hemx", hcyr(int ), (int)519);
                    if (!var23_10) ** GOTO lbl243
                    throw null;
                }
lbl385:
                // 2 sources

                case 64: {
                    var22_11 /* !! */  = (int)kr.hcyu("hemy", hcyr(int ), (int)520);
                    if (!var23_10) ** GOTO lbl95
                    throw null;
                }
                case 65: {
                    var22_11 /* !! */  = (int)kr.hcyu("hemz", hcyr(int ), (int)521);
                    if (var23_10) {
                        throw null;
                    }
                    ** GOTO lbl398
                }
lbl394:
                // 3 sources

                case 66: {
                    var22_11 /* !! */  = (int)kr.hcyu("hena", hcyr(int ), (int)522);
                    if (!var23_10) ** GOTO lbl125
                    throw null;
                }
lbl398:
                // 3 sources

                case 67: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var22_11 /* !! */  = (int)kr.hcyu("henb", hcyr(int ), (int)523);
                        if (!var23_10) ** GOTO lbl257
                        throw null;
                    }
                }
                case 68: {
                    var22_11 /* !! */  = (int)kr.hcyu("henc", hcyr(int ), (int)524);
                    if (!var23_10) ** GOTO lbl292
                    throw null;
                }
lbl407:
                // 2 sources

                case 69: {
                    var22_11 /* !! */  = (int)kr.hcyu("hend", hcyr(int ), (int)525);
                    if (!var23_10) ** GOTO lbl105
                    throw null;
                }
                case 70: 
            }
            break;
        }
        var22_11 /* !! */  = (int)kr.hcyu("hene", hcyr(int ), (int)526);
        ** while (!var23_10)
lbl414:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void beginBatch() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kr.oc - kr.hcyu("hedf", hcyx(int ), (int)15)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == kr.hcyu("hedg", hcyr(int ), (int)401)) break;
            v0 /* !! */  = (long)kr.hcyu("hedh", hcyr(int ), (int)402);
        }
        var2 = kr.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = kr.oc - kr.hcyu("hedi", hcyx(int ), (int)16)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == kr.hcyu("hedj", hcyr(int ), (int)403)) break;
            v1 /* !! */  = (long)kr.hcyu("hedk", hcyr(int ), (int)404);
        }
        var1_1 /* !! */  = kr.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = kr.oc - kr.hcyu("hedl", hcyx(int ), (int)17)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == kr.hcyu("hedm", hcyr(int ), (int)405)) break;
            v2 /* !! */  = (long)kr.hcyu("hedn", hcyr(int ), (int)406);
        }
        var0_2 = kr.a;
        if (!var2) ** GOTO lbl28
        throw null;
        {
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var1_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl28:
                // 1 sources

                if (var0_2 || var0_2) continue block38;
                v3 /* !! */  = kr.oc;
                if (true) ** GOTO lbl33
                block39: while (true) {
                    v3 /* !! */  = (long)(v4 - kr.hcyu("hedo", hcyx(int ), (int)18));
lbl33:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -933956053: {
                            v4 = kr.hcyu("hedp", hcyx(int ), (int)19);
                            continue block39;
                        }
                        case -654994899: {
                            v4 = kr.hcyu("hedq", hcyx(int ), (int)20);
                            continue block39;
                        }
                        case 890790898: {
                            break block39;
                        }
                        case 1721830483: {
                            v4 = kr.hcyu("hedr", hcyx(int ), (int)21);
                            continue block39;
                        }
                    }
                    break;
                }
                if (!kr.batching) ** GOTO lbl62
                if (var0_2 || var0_2) continue block38;
                v5 /* !! */  = kr.oc;
                if (true) ** GOTO lbl51
                block40: while (true) {
                    v5 /* !! */  = (long)(v6 - kr.hcyu("heds", hcyx(int ), (int)22));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1752541307: {
                            v6 = kr.hcyu("hedt", hcyx(int ), (int)23);
                            continue block40;
                        }
                        case -562462810: {
                            v6 = kr.hcyu("hedu", hcyx(int ), (int)24);
                            continue block40;
                        }
                        case 890790898: {
                            break block40;
                        }
                    }
                    break;
                }
                kr.flushBatch();
                if (var0_2) continue block38;
lbl62:
                // 2 sources

                if (var0_2 || var0_2) continue block38;
                v7 = kr.hcyu("hedv", hcyr(int ), (int)407);
                v8 /* !! */  = kr.oc;
                if (true) ** GOTO lbl68
                block41: while (true) {
                    v8 /* !! */  = (long)(v9 - kr.hcyu("hedw", hcyx(int ), (int)25));
lbl68:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -308806818: {
                            v9 = kr.hcyu("hedx", hcyx(int ), (int)26);
                            continue block41;
                        }
                        case 563835781: {
                            v9 = kr.hcyu("hedy", hcyx(int ), (int)27);
                            continue block41;
                        }
                        case 890790898: {
                            break block41;
                        }
                    }
                    break;
                }
                kr.batching = v7;
                if (var0_2 || var0_2) continue block38;
                v10 /* !! */  = kr.oc;
                if (true) ** GOTO lbl83
                block42: while (true) {
                    v10 /* !! */  = (long)(kr.hcyu("heea", hcyx(int ), (int)29) - kr.hcyu("hedz", hcyx(int ), (int)28));
lbl83:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case 890790898: {
                            break block42;
                        }
                        case 1270848805: {
                            continue block42;
                        }
                    }
                    break;
                }
                kr.resetBatch();
                if (!var0_2 && !var0_2) ** break;
                continue block38;
                return;
lbl92:
                // 2 sources

                case 0: {
                    var1_1 /* !! */  = (int)kr.hcyu("heeb", hcyr(int ), (int)408);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl117
                }
                case 1: {
                    var1_1 /* !! */  = (int)kr.hcyu("heec", hcyr(int ), (int)409);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl122
                }
lbl102:
                // 2 sources

                case 2: {
                    do {
                        var1_1 /* !! */  = (int)kr.hcyu("heed", hcyr(int ), (int)410);
                    } while (!var2);
                    throw null;
                }
                case 3: {
                    var1_1 /* !! */  = (int)kr.hcyu("heee", hcyr(int ), (int)411);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl132
                }
                case 4: {
                    do {
                        var1_1 /* !! */  = (int)kr.hcyu("heef", hcyr(int ), (int)412);
                    } while (!var2);
                    throw null;
                }
lbl117:
                // 2 sources

                case 5: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var1_1 /* !! */  = (int)kr.hcyu("heeg", hcyr(int ), (int)413);
                        if (!var2) ** GOTO lbl92
                        throw null;
                    }
                }
lbl122:
                // 3 sources

                case 6: {
                    var1_1 /* !! */  = (int)kr.hcyu("heeh", hcyr(int ), (int)414);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl145
                }
lbl127:
                // 2 sources

                case 7: {
                    do {
                        var1_1 /* !! */  = (int)kr.hcyu("heei", hcyr(int ), (int)415);
                    } while (!var2);
                    throw null;
                }
lbl132:
                // 2 sources

                case 8: {
                    var1_1 /* !! */  = (int)kr.hcyu("heej", hcyr(int ), (int)416);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl141
                }
                case 9: {
                    var1_1 /* !! */  = (int)kr.hcyu("heek", hcyr(int ), (int)417);
                    if (!var2) ** GOTO lbl122
                    throw null;
                }
lbl141:
                // 2 sources

                case 10: {
                    var1_1 /* !! */  = (int)kr.hcyu("heel", hcyr(int ), (int)418);
                    if (!var2) ** GOTO lbl102
                    throw null;
                }
lbl145:
                // 2 sources

                case 11: {
                    var1_1 /* !! */  = (int)kr.hcyu("heem", hcyr(int ), (int)419);
                    if (!var2) ** GOTO lbl127
                    throw null;
                }
                case 12: 
            }
        }
        var1_1 /* !! */  = (int)kr.hcyu("heen", hcyr(int ), (int)420);
        ** while (!var2)
lbl152:
        // 1 sources

        throw null;
    }

    private static void hexu() {
        kr.hcys[300] = 1886594736;
        kr.hcys[301] = -1045357904;
        kr.hcys[302] = -450986458;
        kr.hcys[303] = -1932378102;
        kr.hcys[304] = -1389078829;
        kr.hcys[305] = -998774498;
        kr.hcys[306] = -77417672;
        kr.hcys[307] = 1203673618;
        kr.hcys[308] = -988692868;
        kr.hcys[309] = -941979231;
        kr.hcys[310] = -1158837781;
        kr.hcys[311] = -2114122559;
        kr.hcys[312] = -274953908;
        kr.hcys[313] = 1045263626;
        kr.hcys[314] = -1078950214;
        kr.hcys[315] = 205147831;
        kr.hcys[316] = -1550206126;
        kr.hcys[317] = -459269213;
        kr.hcys[318] = -648211621;
        kr.hcys[319] = 189805533;
        kr.hcys[320] = -1287138129;
        kr.hcys[321] = 658673925;
        kr.hcys[322] = 1441735343;
        kr.hcys[323] = 1981149510;
        kr.hcys[324] = -1624076425;
        kr.hcys[325] = 1188367338;
        kr.hcys[326] = 1366444356;
        kr.hcys[327] = 582518473;
        kr.hcys[328] = 779484002;
        kr.hcys[329] = -1526518574;
        kr.hcys[330] = 1913531305;
        kr.hcys[331] = 149970636;
        kr.hcys[332] = -1851623580;
        kr.hcys[333] = -1624817329;
        kr.hcys[334] = -523148038;
        kr.hcys[335] = -1238990670;
        kr.hcys[336] = -67612325;
        kr.hcys[337] = -1495731415;
        kr.hcys[338] = -16822560;
        kr.hcys[339] = -18031217;
        kr.hcys[340] = -1690170374;
        kr.hcys[341] = -528670255;
        kr.hcys[342] = 538921365;
        kr.hcys[343] = 324180709;
        kr.hcys[344] = -800288879;
        kr.hcys[345] = 882099949;
        kr.hcys[346] = 1011247737;
        kr.hcys[347] = -1428791935;
        kr.hcys[348] = 874829250;
        kr.hcys[349] = -1182124920;
        kr.hcys[350] = -758729262;
        kr.hcys[351] = -1102710863;
        kr.hcys[352] = -1211320198;
        kr.hcys[353] = 857147354;
        kr.hcys[354] = -1677245001;
        kr.hcys[355] = -1963194776;
        kr.hcys[356] = -1173813736;
        kr.hcys[357] = 697209902;
        kr.hcys[358] = 721617924;
        kr.hcys[359] = -1998498763;
        kr.hcys[360] = -130872023;
        kr.hcys[361] = -1068125389;
        kr.hcys[362] = 1278597639;
        kr.hcys[363] = -861858431;
        kr.hcys[364] = 115353802;
        kr.hcys[365] = -1624821327;
        kr.hcys[366] = -1890420005;
        kr.hcys[367] = -1898163810;
        kr.hcys[368] = 81203537;
        kr.hcys[369] = -137934105;
        kr.hcys[370] = 1552427818;
        kr.hcys[371] = 1629097245;
        kr.hcys[372] = 1958384833;
        kr.hcys[373] = 1018262709;
        kr.hcys[374] = 351516236;
        kr.hcys[375] = 1078779410;
        kr.hcys[376] = -129597767;
        kr.hcys[377] = -888886891;
        kr.hcys[378] = -30031086;
        kr.hcys[379] = 1007554932;
        kr.hcys[380] = -177106191;
        kr.hcys[381] = -761332714;
        kr.hcys[382] = 709778649;
        kr.hcys[383] = -2004385167;
        kr.hcys[384] = 1429741895;
        kr.hcys[385] = -694880367;
        kr.hcys[386] = 230754259;
        kr.hcys[387] = 165177859;
        kr.hcys[388] = 44357952;
        kr.hcys[389] = 1210013234;
        kr.hcys[390] = -1240889301;
        kr.hcys[391] = -2100653081;
        kr.hcys[392] = -58361324;
        kr.hcys[393] = 1123961863;
        kr.hcys[394] = -1369685071;
        kr.hcys[395] = 1224987349;
        kr.hcys[396] = -1028849039;
        kr.hcys[397] = 238035727;
        kr.hcys[398] = -1869989558;
        kr.hcys[399] = 892756490;
    }

    private static void heyk() {
        kr.hcyz[100] = -1222762514770167035L;
        kr.hcyz[101] = -8672955827434431734L;
        kr.hcyz[102] = 1521627769138910379L;
        kr.hcyz[103] = -3018165925111121566L;
        kr.hcyz[104] = -4040761687572259164L;
        kr.hcyz[105] = 631572024456847896L;
        kr.hcyz[106] = 4650001887256467299L;
        kr.hcyz[107] = 2871874277680050144L;
        kr.hcyz[108] = -4065500370659579094L;
        kr.hcyz[109] = 8319060760404174757L;
        kr.hcyz[110] = -3765781340895340997L;
        kr.hcyz[111] = 3935029891103140826L;
        kr.hcyz[112] = 553652398714031205L;
        kr.hcyz[113] = -8505537052306200981L;
        kr.hcyz[114] = 682810340741158839L;
        kr.hcyz[115] = -7033932391449513668L;
        kr.hcyz[116] = 2698081208235728139L;
        kr.hcyz[117] = 8507392474637278806L;
        kr.hcyz[118] = -6471319482271001509L;
        kr.hcyz[119] = 5069741747012709514L;
        kr.hcyz[120] = 5053808810642429678L;
        kr.hcyz[121] = -86077006594468443L;
        kr.hcyz[122] = -7056629487187588204L;
        kr.hcyz[123] = -3011347260533845019L;
        kr.hcyz[124] = -8801318052614335934L;
        kr.hcyz[125] = -3189157633669202739L;
        kr.hcyz[126] = 3151271594699817631L;
        kr.hcyz[127] = 7693212660910630709L;
    }

    private static void hext() {
        kr.hcys[200] = -2050416158;
        kr.hcys[201] = 1155778247;
        kr.hcys[202] = -1396489452;
        kr.hcys[203] = -860430427;
        kr.hcys[204] = -95108210;
        kr.hcys[205] = 787467200;
        kr.hcys[206] = -1186343711;
        kr.hcys[207] = 1438641772;
        kr.hcys[208] = 2082081238;
        kr.hcys[209] = 1660958093;
        kr.hcys[210] = 1708507254;
        kr.hcys[211] = -2045710696;
        kr.hcys[212] = 514289519;
        kr.hcys[213] = -2017388696;
        kr.hcys[214] = 444111109;
        kr.hcys[215] = 37076949;
        kr.hcys[216] = 2128849781;
        kr.hcys[217] = 1348448417;
        kr.hcys[218] = -496736296;
        kr.hcys[219] = -1423685037;
        kr.hcys[220] = 1743719638;
        kr.hcys[221] = -26805235;
        kr.hcys[222] = -76719332;
        kr.hcys[223] = -1026865928;
        kr.hcys[224] = 2109769898;
        kr.hcys[225] = -1552319069;
        kr.hcys[226] = -1399658740;
        kr.hcys[227] = 517499898;
        kr.hcys[228] = -1407351461;
        kr.hcys[229] = -634059356;
        kr.hcys[230] = 1223751484;
        kr.hcys[231] = 389282137;
        kr.hcys[232] = -1258841335;
        kr.hcys[233] = -1994107116;
        kr.hcys[234] = -1486875344;
        kr.hcys[235] = -684164141;
        kr.hcys[236] = -936650078;
        kr.hcys[237] = -127013316;
        kr.hcys[238] = 1511369954;
        kr.hcys[239] = 965432787;
        kr.hcys[240] = -1269607135;
        kr.hcys[241] = 36590332;
        kr.hcys[242] = -217855114;
        kr.hcys[243] = -1343500;
        kr.hcys[244] = 621604615;
        kr.hcys[245] = 291483559;
        kr.hcys[246] = -1547042410;
        kr.hcys[247] = 2140234484;
        kr.hcys[248] = -215696744;
        kr.hcys[249] = -1827168304;
        kr.hcys[250] = 1895779915;
        kr.hcys[251] = 1226036884;
        kr.hcys[252] = -1233295716;
        kr.hcys[253] = 1023371188;
        kr.hcys[254] = 179777311;
        kr.hcys[255] = -982277490;
        kr.hcys[256] = 1155825938;
        kr.hcys[257] = 1501171447;
        kr.hcys[258] = -1434206161;
        kr.hcys[259] = -1439692031;
        kr.hcys[260] = 1279430459;
        kr.hcys[261] = 1515194844;
        kr.hcys[262] = 1531782398;
        kr.hcys[263] = -916699596;
        kr.hcys[264] = -44349556;
        kr.hcys[265] = -1578668431;
        kr.hcys[266] = 679035836;
        kr.hcys[267] = 2044128737;
        kr.hcys[268] = -827694398;
        kr.hcys[269] = 208265638;
        kr.hcys[270] = -903997165;
        kr.hcys[271] = 1279374527;
        kr.hcys[272] = 499243433;
        kr.hcys[273] = -397888430;
        kr.hcys[274] = 1740825178;
        kr.hcys[275] = 1013516230;
        kr.hcys[276] = -2023847255;
        kr.hcys[277] = -1203968700;
        kr.hcys[278] = -1058297875;
        kr.hcys[279] = 565206596;
        kr.hcys[280] = -1701936086;
        kr.hcys[281] = -1542981653;
        kr.hcys[282] = 31221311;
        kr.hcys[283] = -183413361;
        kr.hcys[284] = -404977965;
        kr.hcys[285] = 256104511;
        kr.hcys[286] = -1492679539;
        kr.hcys[287] = 361293920;
        kr.hcys[288] = 165443929;
        kr.hcys[289] = 1619999987;
        kr.hcys[290] = -1263601419;
        kr.hcys[291] = 363813031;
        kr.hcys[292] = 1462031173;
        kr.hcys[293] = -344179324;
        kr.hcys[294] = -974537963;
        kr.hcys[295] = -1276338345;
        kr.hcys[296] = -1348188514;
        kr.hcys[297] = 1776684694;
        kr.hcys[298] = -2032635130;
        kr.hcys[299] = 1669624767;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static float drawGlyph(Matrix4f var0, ks var1_1, ku var2_2, float var3_3, float var4_4, float var5_5, int var6_6, float var7_7, float var8_8) {
        block114: {
            block113: {
                var19_9 = kr.c;
                var18_10 /* !! */  = kr.b;
                var17_11 = kr.a;
                if (var19_9) {
                    throw null;
lbl6:
                    // 30 sources

                    return (float)kr.hcyu("hdiz", hdam(int ), (int)258);
                }
                if (var17_11 || var17_11) ** GOTO lbl6
                if (!kr.initialized) break block113;
                if (var17_11) ** GOTO lbl6
                if (var1_1 == null) break block113;
                if (var17_11) ** GOTO lbl6
                if (var2_2 != null) break block114;
                if (var17_11) ** GOTO lbl6
            }
            if (var17_11 || var17_11) ** GOTO lbl6
            return 0.0f;
        }
        if (var17_11 || var17_11) ** GOTO lbl6
        var9_12 = (float)(var6_6 >> kr.hcyu("hdja", hcyr(int ), (int)259) & kr.hcyu("hdjb", hcyr(int ), (int)260)) / kr.hcyu("hdjc", hdam(int ), (int)261);
        if (var17_11 || var17_11) ** GOTO lbl6
        var10_13 = (float)(var6_6 >> kr.hcyu("hdjd", hcyr(int ), (int)262) & kr.hcyu("hdje", hcyr(int ), (int)263)) / kr.hcyu("hdjf", hdam(int ), (int)264);
        if (var17_11 || var17_11) ** GOTO lbl6
        var11_14 = (float)(var6_6 & kr.hcyu("hdjg", hcyr(int ), (int)265)) / kr.hcyu("hdjh", hdam(int ), (int)266);
        if (var17_11 || var17_11) ** GOTO lbl6
        var12_15 = (float)(var6_6 >> kr.hcyu("hdji", hcyr(int ), (int)267) & kr.hcyu("hdjj", hcyr(int ), (int)268)) / kr.hcyu("hdjk", hdam(int ), (int)269);
        if (var17_11 || var17_11) ** GOTO lbl6
        kr.msdfData.clear();
        if (var17_11 || var17_11) ** GOTO lbl6
        kr.msdfData.putFloat(var0.m00()).putFloat(var0.m01()).putFloat(var0.m02()).putFloat(var0.m03());
        if (var17_11 || var17_11) ** GOTO lbl6
        kr.msdfData.putFloat(var0.m10()).putFloat(var0.m11()).putFloat(var0.m12()).putFloat(var0.m13());
        if (var17_11 || var17_11) ** GOTO lbl6
        kr.msdfData.putFloat(var0.m20()).putFloat(var0.m21()).putFloat(var0.m22()).putFloat(var0.m23());
        if (var17_11 || var17_11) ** GOTO lbl6
        if (var18_10 /* !! */  == 0) ** GOTO lbl-1000
        switch (var18_10 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                kr.msdfData.putFloat(var0.m30()).putFloat(var0.m31()).putFloat(var0.m32()).putFloat(var0.m33());
                if (var17_11 || var17_11) ** GOTO lbl6
                kr.msdfData.putFloat(var9_12).putFloat(var10_13).putFloat(var11_14).putFloat(var12_15);
                if (var17_11 || var17_11) ** GOTO lbl6
                kr.msdfData.putFloat(var1_1.getPxRange()).putFloat((float)Math.toRadians(var7_7)).putFloat(0.0f).putFloat(0.0f);
                if (var17_11 || var17_11) ** GOTO lbl6
                kr.msdfData.putFloat(var8_8).putFloat(0.0f).putFloat(0.0f).putFloat(0.0f);
                if (var17_11 || var17_11) ** GOTO lbl6
                kr.msdfData.flip();
                if (var17_11 || var17_11) ** GOTO lbl6
                var13_16 = var3_3 + var2_2.bearingX * var5_5;
                if (var17_11 || var17_11) ** GOTO lbl6
                var14_17 = var4_4 - var2_2.bearingY * var5_5;
                if (var17_11 || var17_11) ** GOTO lbl6
                var15_18 = var2_2.width * var5_5;
                if (var17_11 || var17_11) ** GOTO lbl6
                var16_19 = var2_2.height * var5_5;
                if (var17_11 || var17_11) ** GOTO lbl6
                kr.glyphData.clear();
                if (var17_11 || var17_11) ** GOTO lbl6
                kr.glyphData.putFloat(var13_16).putFloat(var14_17).putFloat(var15_18).putFloat(var16_19);
                if (var17_11 || var17_11) ** GOTO lbl6
                kr.glyphData.putFloat(var2_2.u0).putFloat(var2_2.v0);
                if (var17_11 || var17_11) ** GOTO lbl6
                kr.glyphData.putFloat(var2_2.u1 - var2_2.u0).putFloat(var2_2.v1 - var2_2.v0);
                if (var17_11 || var17_11) ** GOTO lbl6
                kr.putColor(kr.glyphData, var6_6);
                if (var17_11 || var17_11) ** GOTO lbl6
                kr.glyphData.flip();
                if (var17_11 || var17_11) ** GOTO lbl6
                kr.render(var1_1, (int)kr.hcyu("hdjl", hcyr(int ), (int)270));
                if (!var17_11 && !var17_11) ** break;
                ** continue;
                return var2_2.advance * var5_5;
            }
lbl87:
            // 2 sources

            case 0: {
                var18_10 /* !! */  = (int)kr.hcyu("hdjm", hcyr(int ), (int)271);
                if (var19_9) {
                    throw null;
                }
                ** GOTO lbl238
            }
            case 1: {
                var18_10 /* !! */  = (int)kr.hcyu("hdjn", hcyr(int ), (int)272);
                if (var19_9) {
                    throw null;
                }
                ** GOTO lbl217
            }
            case 2: {
                var18_10 /* !! */  = (int)kr.hcyu("hdjo", hcyr(int ), (int)273);
                if (var19_9) {
                    throw null;
                }
                ** GOTO lbl112
            }
lbl102:
            // 2 sources

            case 3: {
                var18_10 /* !! */  = (int)kr.hcyu("hdjp", hcyr(int ), (int)274);
                if (var19_9) {
                    throw null;
                }
                ** GOTO lbl156
            }
            case 4: {
                var18_10 /* !! */  = (int)kr.hcyu("hdjq", hcyr(int ), (int)275);
                if (var19_9) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl112:
            // 4 sources

            case 5: {
                var18_10 /* !! */  = (int)kr.hcyu("hdjr", hcyr(int ), (int)276);
                if (var19_9) {
                    throw null;
                }
                ** GOTO lbl247
            }
lbl117:
            // 4 sources

            case 6: {
                var18_10 /* !! */  = (int)kr.hcyu("hdjs", hcyr(int ), (int)277);
                if (var19_9) {
                    throw null;
                }
                ** GOTO lbl238
            }
            case 7: {
                var18_10 /* !! */  = (int)kr.hcyu("hdjt", hcyr(int ), (int)278);
                if (var19_9) {
                    throw null;
                }
                ** GOTO lbl180
            }
            case 8: {
                var18_10 /* !! */  = (int)kr.hcyu("hdju", hcyr(int ), (int)279);
                if (var19_9) {
                    throw null;
                }
                ** GOTO lbl267
            }
            case 9: {
                var18_10 /* !! */  = (int)kr.hcyu("hdjv", hcyr(int ), (int)280);
                if (!var19_9) ** GOTO lbl117
                throw null;
            }
lbl136:
            // 2 sources

            case 10: {
                var18_10 /* !! */  = (int)kr.hcyu("hdjw", hcyr(int ), (int)281);
                if (var19_9) {
                    throw null;
                }
                ** GOTO lbl193
            }
lbl141:
            // 2 sources

            case 11: {
                var18_10 /* !! */  = (int)kr.hcyu("hdjx", hcyr(int ), (int)282);
                if (var19_9) {
                    throw null;
                }
                ** GOTO lbl271
            }
            case 12: {
                var18_10 /* !! */  = (int)kr.hcyu("hdjy", hcyr(int ), (int)283);
                if (var19_9) {
                    throw null;
                }
                ** GOTO lbl275
            }
lbl151:
            // 4 sources

            case 13: {
                var18_10 /* !! */  = (int)kr.hcyu("hdjz", hcyr(int ), (int)284);
                if (var19_9) {
                    throw null;
                }
                ** GOTO lbl171
            }
lbl156:
            // 3 sources

            case 14: {
                var18_10 /* !! */  = (int)kr.hcyu("hdka", hcyr(int ), (int)285);
                if (var19_9) {
                    throw null;
                }
                ** GOTO lbl208
            }
            case 15: {
                var18_10 /* !! */  = (int)kr.hcyu("hdkb", hcyr(int ), (int)286);
                if (var19_9) {
                    throw null;
                }
                ** GOTO lbl238
            }
lbl166:
            // 2 sources

            case 16: {
                var18_10 /* !! */  = (int)kr.hcyu("hdkc", hcyr(int ), (int)287);
                if (var19_9) {
                    throw null;
                }
                ** GOTO lbl221
            }
lbl171:
            // 2 sources

            case 17: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var18_10 /* !! */  = (int)kr.hcyu("hdkd", hcyr(int ), (int)288);
                    if (!var19_9) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl176:
            // 2 sources

            case 18: {
                var18_10 /* !! */  = (int)kr.hcyu("hdke", hcyr(int ), (int)289);
                if (!var19_9) ** GOTO lbl102
                throw null;
            }
lbl180:
            // 2 sources

            case 19: {
                var18_10 /* !! */  = (int)kr.hcyu("hdkf", hcyr(int ), (int)290);
                if (!var19_9) ** GOTO lbl117
                throw null;
            }
lbl184:
            // 3 sources

            case 20: {
                var18_10 /* !! */  = (int)kr.hcyu("hdkg", hcyr(int ), (int)291);
                if (var19_9) {
                    throw null;
                }
                ** GOTO lbl243
            }
lbl189:
            // 2 sources

            case 21: {
                var18_10 /* !! */  = (int)kr.hcyu("hdkh", hcyr(int ), (int)292);
                if (!var19_9) ** GOTO lbl112
                throw null;
            }
lbl193:
            // 3 sources

            case 22: {
                var18_10 /* !! */  = (int)kr.hcyu("hdki", hcyr(int ), (int)293);
                if (var19_9) {
                    throw null;
                }
                ** GOTO lbl208
            }
lbl198:
            // 2 sources

            case 23: {
                var18_10 /* !! */  = (int)kr.hcyu("hdkj", hcyr(int ), (int)294);
                if (var19_9) {
                    throw null;
                }
                ** GOTO lbl328
            }
lbl203:
            // 2 sources

            case 24: {
                var18_10 /* !! */  = (int)kr.hcyu("hdkk", hcyr(int ), (int)295);
                if (var19_9) {
                    throw null;
                }
                ** GOTO lbl336
            }
lbl208:
            // 5 sources

            case 25: {
                var18_10 /* !! */  = (int)kr.hcyu("hdkl", hcyr(int ), (int)296);
                if (!var19_9) ** GOTO lbl136
                throw null;
            }
            case 26: {
                var18_10 /* !! */  = (int)kr.hcyu("hdkm", hcyr(int ), (int)297);
                if (var19_9) {
                    throw null;
                }
                ** GOTO lbl251
            }
lbl217:
            // 2 sources

            case 27: {
                var18_10 /* !! */  = (int)kr.hcyu("hdkn", hcyr(int ), (int)298);
                if (var19_9) {
                    throw null;
                }
            }
lbl221:
            // 5 sources

            case 28: {
                var18_10 /* !! */  = (int)kr.hcyu("hdko", hcyr(int ), (int)299);
                if (!var19_9) ** GOTO lbl198
                throw null;
            }
            case 29: {
                var18_10 /* !! */  = (int)kr.hcyu("hdkp", hcyr(int ), (int)300);
                if (var19_9) {
                    throw null;
                }
                ** GOTO lbl304
            }
lbl230:
            // 2 sources

            case 30: {
                var18_10 /* !! */  = (int)kr.hcyu("hdkq", hcyr(int ), (int)301);
                if (!var19_9) ** GOTO lbl203
                throw null;
            }
            case 31: {
                var18_10 /* !! */  = (int)kr.hcyu("hdkr", hcyr(int ), (int)302);
                if (!var19_9) ** GOTO lbl156
                throw null;
            }
lbl238:
            // 4 sources

            case 32: {
                var18_10 /* !! */  = (int)kr.hcyu("hdks", hcyr(int ), (int)303);
                if (var19_9) {
                    throw null;
                }
                ** GOTO lbl316
            }
lbl243:
            // 3 sources

            case 33: {
                var18_10 /* !! */  = (int)kr.hcyu("hdkt", hcyr(int ), (int)304);
                if (!var19_9) ** GOTO lbl189
                throw null;
            }
lbl247:
            // 2 sources

            case 34: {
                var18_10 /* !! */  = (int)kr.hcyu("hdku", hcyr(int ), (int)305);
                if (!var19_9) ** GOTO lbl184
                throw null;
            }
lbl251:
            // 2 sources

            case 35: {
                var18_10 /* !! */  = (int)kr.hcyu("hdkv", hcyr(int ), (int)306);
                if (!var19_9) ** GOTO lbl87
                throw null;
            }
            case 36: {
                var18_10 /* !! */  = (int)kr.hcyu("hdkw", hcyr(int ), (int)307);
                if (!var19_9) ** GOTO lbl151
                throw null;
            }
lbl259:
            // 3 sources

            case 37: {
                var18_10 /* !! */  = (int)kr.hcyu("hdkx", hcyr(int ), (int)308);
                if (!var19_9) ** GOTO lbl141
                throw null;
            }
            case 38: {
                var18_10 /* !! */  = (int)kr.hcyu("hdky", hcyr(int ), (int)309);
                if (!var19_9) ** GOTO lbl151
                throw null;
            }
lbl267:
            // 3 sources

            case 39: {
                var18_10 /* !! */  = (int)kr.hcyu("hdkz", hcyr(int ), (int)310);
                if (!var19_9) ** GOTO lbl230
                throw null;
            }
lbl271:
            // 2 sources

            case 40: {
                var18_10 /* !! */  = (int)kr.hcyu("hdla", hcyr(int ), (int)311);
                if (!var19_9) ** GOTO lbl267
                throw null;
            }
lbl275:
            // 3 sources

            case 41: {
                var18_10 /* !! */  = (int)kr.hcyu("hdlb", hcyr(int ), (int)312);
                if (!var19_9) ** GOTO lbl151
                throw null;
            }
            case 42: {
                var18_10 /* !! */  = (int)kr.hcyu("hdlc", hcyr(int ), (int)313);
                if (var19_9) {
                    throw null;
                }
                ** GOTO lbl344
            }
            case 43: {
                var18_10 /* !! */  = (int)kr.hcyu("hdld", hcyr(int ), (int)314);
                if (!var19_9) ** GOTO lbl184
                throw null;
            }
            case 44: {
                var18_10 /* !! */  = (int)kr.hcyu("hdle", hcyr(int ), (int)315);
                if (!var19_9) ** GOTO lbl275
                throw null;
            }
lbl292:
            // 3 sources

            case 45: {
                var18_10 /* !! */  = (int)kr.hcyu("hdlf", hcyr(int ), (int)316);
                if (!var19_9) ** GOTO lbl117
                throw null;
            }
            case 46: {
                var18_10 /* !! */  = (int)kr.hcyu("hdlg", hcyr(int ), (int)317);
                if (!var19_9) ** GOTO lbl112
                throw null;
            }
            case 47: {
                var18_10 /* !! */  = (int)kr.hcyu("hdlh", hcyr(int ), (int)318);
                if (!var19_9) ** GOTO lbl208
                throw null;
            }
lbl304:
            // 2 sources

            case 48: {
                var18_10 /* !! */  = (int)kr.hcyu("hdli", hcyr(int ), (int)319);
                if (!var19_9) ** GOTO lbl292
                throw null;
            }
            case 49: {
                var18_10 /* !! */  = (int)kr.hcyu("hdlj", hcyr(int ), (int)320);
                if (!var19_9) break;
                throw null;
            }
            case 50: {
                var18_10 /* !! */  = (int)kr.hcyu("hdlk", hcyr(int ), (int)321);
                if (!var19_9) ** GOTO lbl259
                throw null;
            }
lbl316:
            // 2 sources

            case 51: {
                var18_10 /* !! */  = (int)kr.hcyu("hdll", hcyr(int ), (int)322);
                if (!var19_9) ** GOTO lbl193
                throw null;
            }
            case 52: {
                var18_10 /* !! */  = (int)kr.hcyu("hdlm", hcyr(int ), (int)323);
                if (!var19_9) ** GOTO lbl259
                throw null;
            }
            case 53: {
                var18_10 /* !! */  = (int)kr.hcyu("hdln", hcyr(int ), (int)324);
                if (!var19_9) ** GOTO lbl221
                throw null;
            }
lbl328:
            // 3 sources

            case 54: {
                var18_10 /* !! */  = (int)kr.hcyu("hdlo", hcyr(int ), (int)325);
                if (!var19_9) ** GOTO lbl292
                throw null;
            }
            case 55: {
                var18_10 /* !! */  = (int)kr.hcyu("hdlp", hcyr(int ), (int)326);
                if (!var19_9) ** GOTO lbl243
                throw null;
            }
lbl336:
            // 2 sources

            case 56: {
                var18_10 /* !! */  = (int)kr.hcyu("hdlq", hcyr(int ), (int)327);
                if (!var19_9) ** GOTO lbl176
                throw null;
            }
            case 57: {
                var18_10 /* !! */  = (int)kr.hcyu("hdlr", hcyr(int ), (int)328);
                if (!var19_9) ** GOTO lbl328
                throw null;
            }
lbl344:
            // 2 sources

            case 58: {
                var18_10 /* !! */  = (int)kr.hcyu("hdls", hcyr(int ), (int)329);
                if (!var19_9) ** GOTO lbl208
                throw null;
            }
            case 59: 
        }
        var18_10 /* !! */  = (int)kr.hcyu("hdlt", hcyr(int ), (int)330);
        ** while (!var19_9)
lbl351:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void drawString(Matrix4f var0, ks var1_1, String var2_2, float var3_3, float var4_4, float var5_5, int var6_6, float var7_7, float var8_8) {
        block216: {
            block215: {
                block214: {
                    var26_9 = kr.c;
                    var25_10 /* !! */  = kr.b;
                    var24_11 = kr.a;
                    if (var26_9) {
                        throw null;
lbl6:
                        // 59 sources

                        return;
                    }
                    if (var24_11 || var24_11) ** GOTO lbl6
                    if (!kr.initialized) break block214;
                    if (var24_11) ** GOTO lbl6
                    if (var1_1 == null) break block214;
                    if (var24_11) ** GOTO lbl6
                    if (!var1_1.isLoaded()) break block214;
                    if (var24_11) ** GOTO lbl6
                    if (!var2_2.isEmpty()) break block215;
                    if (var24_11) ** GOTO lbl6
                }
                if (var24_11 || var24_11) ** GOTO lbl6
                return;
            }
            if (var24_11 || var24_11) ** GOTO lbl6
            if (!kr.batching) break block216;
            if (var24_11 || var24_11) ** GOTO lbl6
            kr.appendString(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, null, var7_7, var8_8);
            if (var24_11 || var24_11) ** GOTO lbl6
            return;
        }
        if (var24_11 || var24_11) ** GOTO lbl6
        var9_12 = var5_5 / var1_1.getEmSize();
        if (var24_11 || var24_11) ** GOTO lbl6
        var10_13 = var3_3;
        if (var24_11 || var24_11) ** GOTO lbl6
        var11_14 = var4_4 + var1_1.getAscender() * var9_12;
        if (var24_11 || var24_11) ** GOTO lbl6
        var12_15 = (float)(var6_6 >> kr.hcyu("hdak", hcyr(int ), (int)36) & kr.hcyu("hdal", hcyr(int ), (int)37)) / kr.hcyu("hdan", hdam(int ), (int)38);
        if (var24_11 || var24_11) ** GOTO lbl6
        var13_16 = (float)(var6_6 >> kr.hcyu("hdao", hcyr(int ), (int)39) & kr.hcyu("hdap", hcyr(int ), (int)40)) / kr.hcyu("hdaq", hdam(int ), (int)41);
        if (var24_11 || var24_11) ** GOTO lbl6
        var14_17 = (float)(var6_6 & kr.hcyu("hdar", hcyr(int ), (int)42)) / kr.hcyu("hdas", hdam(int ), (int)43);
        if (var24_11 || var24_11) ** GOTO lbl6
        var15_18 = (float)(var6_6 >> kr.hcyu("hdat", hcyr(int ), (int)44) & kr.hcyu("hdau", hcyr(int ), (int)45)) / kr.hcyu("hdav", hdam(int ), (int)46);
        if (var24_11 || var24_11) ** GOTO lbl6
        kr.msdfData.clear();
        if (var24_11 || var24_11) ** GOTO lbl6
        kr.msdfData.putFloat(var0.m00()).putFloat(var0.m01()).putFloat(var0.m02()).putFloat(var0.m03());
        if (var24_11 || var24_11) ** GOTO lbl6
        kr.msdfData.putFloat(var0.m10()).putFloat(var0.m11()).putFloat(var0.m12()).putFloat(var0.m13());
        if (var24_11 || var24_11) ** GOTO lbl6
        kr.msdfData.putFloat(var0.m20()).putFloat(var0.m21()).putFloat(var0.m22()).putFloat(var0.m23());
        if (var24_11 || var24_11) ** GOTO lbl6
        kr.msdfData.putFloat(var0.m30()).putFloat(var0.m31()).putFloat(var0.m32()).putFloat(var0.m33());
        if (var24_11 || var24_11) ** GOTO lbl6
        kr.msdfData.putFloat(var12_15).putFloat(var13_16).putFloat(var14_17).putFloat(var15_18);
        if (var24_11 || var24_11) ** GOTO lbl6
        kr.msdfData.putFloat(var1_1.getPxRange()).putFloat((float)Math.toRadians(var7_7)).putFloat(0.0f).putFloat(0.0f);
        if (var24_11 || var24_11) ** GOTO lbl6
        kr.msdfData.putFloat(var8_8).putFloat(0.0f).putFloat(0.0f).putFloat(0.0f);
        if (var24_11 || var24_11) ** GOTO lbl6
        kr.msdfData.flip();
        if (var24_11 || var24_11) ** GOTO lbl6
        kr.glyphData.clear();
        if (var24_11 || var24_11) ** GOTO lbl6
        var16_19 = kr.hcyu("hdaw", hcyr(int ), (int)47);
        if (var24_11 || var24_11) ** GOTO lbl6
        var17_20 = kr.hcyu("hdax", hcyr(int ), (int)48);
        if (var24_11) ** GOTO lbl6
        block114: while (true) {
            block217: {
                if (var24_11 || var24_11) ** GOTO lbl6
                if (var17_20 >= var2_2.length()) ** GOTO lbl135
                if (var24_11) ** GOTO lbl6
                if (var16_19 >= kr.hcyu("hday", hcyr(int ), (int)49)) ** GOTO lbl135
                if (var24_11 || var24_11) ** GOTO lbl6
                var18_21 = var2_2.charAt((int)var17_20);
                if (var24_11 || var24_11) ** GOTO lbl6
                var19_22 = var1_1.getGlyph(var18_21);
                if (var24_11 || var24_11) ** GOTO lbl6
                if (var19_22 != null) break block217;
                if (var24_11 || var24_11) ** GOTO lbl6
                var19_22 = var1_1.getGlyph((int)kr.hcyu("hdaz", hcyr(int ), (int)50));
                if (var24_11 || var24_11) ** GOTO lbl6
                if (var19_22 != null) break block217;
                if (var24_11 || var24_11) ** GOTO lbl6
                if (var26_9) {
                    throw null;
                }
                ** GOTO lbl130
            }
            if (var24_11 || var24_11) ** GOTO lbl6
            if (!(var19_22.width > 0.0f)) ** GOTO lbl127
            if (var24_11) ** GOTO lbl6
            if (!(var19_22.height > 0.0f)) ** GOTO lbl127
            if (var24_11 || var24_11) ** GOTO lbl6
            var20_23 = var10_13 + var19_22.bearingX * var9_12;
            if (var24_11 || var24_11) ** GOTO lbl6
            var21_24 = var11_14 - var19_22.bearingY * var9_12;
            if (var24_11 || var24_11) ** GOTO lbl6
            var22_25 = var19_22.width * var9_12;
            if (var24_11) ** GOTO lbl6
            if (var25_10 /* !! */  == 0) ** GOTO lbl-1000
            switch (var25_10 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var24_11) ** GOTO lbl6
                    var23_26 = var19_22.height * var9_12;
                    if (var24_11 || var24_11) ** GOTO lbl6
                    kr.glyphData.putFloat(var20_23).putFloat(var21_24).putFloat(var22_25).putFloat(var23_26);
                    if (var24_11 || var24_11) ** GOTO lbl6
                    kr.glyphData.putFloat(var19_22.u0).putFloat(var19_22.v0);
                    if (var24_11 || var24_11) ** GOTO lbl6
                    kr.glyphData.putFloat(var19_22.u1 - var19_22.u0).putFloat(var19_22.v1 - var19_22.v0);
                    if (var24_11 || var24_11) ** GOTO lbl6
                    kr.putColor(kr.glyphData, var6_6);
                    if (var24_11 || var24_11) ** GOTO lbl6
                    ++var16_19;
                    if (var24_11) ** GOTO lbl6
lbl127:
                    // 3 sources

                    if (var24_11 || var24_11) ** GOTO lbl6
                    var10_13 += var19_22.advance * var9_12;
                    if (var24_11) ** GOTO lbl6
lbl130:
                    // 2 sources

                    if (var24_11 || var24_11) ** GOTO lbl6
                    ++var17_20;
                    if (var24_11) ** GOTO lbl6
                    if (!var26_9) continue block114;
                    throw null;
                }
lbl135:
                // 2 sources

                if (var24_11 || var24_11) ** GOTO lbl6
                if (var16_19 != false) ** GOTO lbl139
                if (var24_11 || var24_11) ** GOTO lbl6
                return;
lbl139:
                // 1 sources

                if (var24_11 || var24_11) ** GOTO lbl6
                kr.glyphData.flip();
                if (var24_11 || var24_11) ** GOTO lbl6
                kr.render(var1_1, (int)var16_19);
                if (!var24_11 && !var24_11) ** break;
                ** continue;
                return;
                case 0: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdba", hcyr(int ), (int)51);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl399
                }
lbl152:
                // 3 sources

                case 1: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdbb", hcyr(int ), (int)52);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl461
                }
                case 2: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdbc", hcyr(int ), (int)53);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl182
                }
                case 3: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdbd", hcyr(int ), (int)54);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl461
                }
lbl167:
                // 2 sources

                case 4: {
                    do {
                        var25_10 /* !! */  = (int)kr.hcyu("hdbe", hcyr(int ), (int)55);
                    } while (!var26_9);
                    throw null;
                }
lbl172:
                // 2 sources

                case 5: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdbf", hcyr(int ), (int)56);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl413
                }
lbl177:
                // 2 sources

                case 6: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdbg", hcyr(int ), (int)57);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl544
                }
lbl182:
                // 4 sources

                case 7: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdbh", hcyr(int ), (int)58);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl202
                }
lbl187:
                // 3 sources

                case 8: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdbi", hcyr(int ), (int)59);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl483
                }
lbl192:
                // 2 sources

                case 9: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdbj", hcyr(int ), (int)60);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl586
                }
                case 10: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdbk", hcyr(int ), (int)61);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl544
                }
lbl202:
                // 2 sources

                case 11: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdbl", hcyr(int ), (int)62);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl440
                }
lbl207:
                // 2 sources

                case 12: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdbm", hcyr(int ), (int)63);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl298
                }
lbl212:
                // 2 sources

                case 13: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdbn", hcyr(int ), (int)64);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl527
                }
lbl217:
                // 2 sources

                case 14: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdbo", hcyr(int ), (int)65);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl495
                }
lbl222:
                // 2 sources

                case 15: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdbp", hcyr(int ), (int)66);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl527
                }
lbl227:
                // 2 sources

                case 16: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdbq", hcyr(int ), (int)67);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl495
                }
                case 17: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdbr", hcyr(int ), (int)68);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl586
                }
                case 18: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdbs", hcyr(int ), (int)69);
                    if (var26_9) {
                        throw null;
                    }
                }
lbl241:
                // 4 sources

                case 19: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdbt", hcyr(int ), (int)70);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl553
                }
                case 20: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdbu", hcyr(int ), (int)71);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl483
                }
                case 21: {
                    do {
                        var25_10 /* !! */  = (int)kr.hcyu("hdbv", hcyr(int ), (int)72);
                    } while (!var26_9);
                    throw null;
                }
lbl256:
                // 2 sources

                case 22: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdbw", hcyr(int ), (int)73);
                    if (!var26_9) ** GOTO lbl241
                    throw null;
                }
                case 23: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdbx", hcyr(int ), (int)74);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl370
                }
lbl265:
                // 3 sources

                case 24: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdby", hcyr(int ), (int)75);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl380
                }
lbl270:
                // 2 sources

                case 25: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdbz", hcyr(int ), (int)76);
                    if (!var26_9) ** GOTO lbl172
                    throw null;
                }
lbl274:
                // 2 sources

                case 26: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdca", hcyr(int ), (int)77);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl389
                }
                case 27: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdcb", hcyr(int ), (int)78);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl561
                }
                case 28: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdcc", hcyr(int ), (int)79);
                    if (!var26_9) break block114;
                    throw null;
                }
lbl288:
                // 2 sources

                case 29: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdcd", hcyr(int ), (int)80);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl346
                }
lbl293:
                // 3 sources

                case 30: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdce", hcyr(int ), (int)81);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl487
                }
lbl298:
                // 2 sources

                case 31: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdcf", hcyr(int ), (int)82);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl394
                }
lbl303:
                // 3 sources

                case 32: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdcg", hcyr(int ), (int)83);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl622
                }
                case 33: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdch", hcyr(int ), (int)84);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl549
                }
                case 34: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var25_10 /* !! */  = (int)kr.hcyu("hdci", hcyr(int ), (int)85);
                        if (var26_9) {
                            throw null;
                        }
                        ** GOTO lbl523
                        break;
                    }
                }
lbl319:
                // 3 sources

                case 35: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdcj", hcyr(int ), (int)86);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl622
                }
                case 36: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdck", hcyr(int ), (int)87);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl470
                }
lbl329:
                // 3 sources

                case 37: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdcl", hcyr(int ), (int)88);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl440
                }
                case 38: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdcm", hcyr(int ), (int)89);
                    if (!var26_9) ** GOTO lbl303
                    throw null;
                }
                case 39: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdcn", hcyr(int ), (int)90);
                    if (!var26_9) ** GOTO lbl270
                    throw null;
                }
                case 40: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdco", hcyr(int ), (int)91);
                    if (!var26_9) ** GOTO lbl182
                    throw null;
                }
lbl346:
                // 3 sources

                case 41: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdcp", hcyr(int ), (int)92);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl634
                }
lbl351:
                // 3 sources

                case 42: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdcq", hcyr(int ), (int)93);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl586
                }
                case 43: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdcr", hcyr(int ), (int)94);
                    if (!var26_9) break block114;
                    throw null;
                }
                case 44: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdcs", hcyr(int ), (int)95);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl614
                }
                case 45: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdct", hcyr(int ), (int)96);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl602
                }
lbl370:
                // 4 sources

                case 46: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdcu", hcyr(int ), (int)97);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl578
                }
lbl375:
                // 3 sources

                case 47: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdcv", hcyr(int ), (int)98);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl557
                }
lbl380:
                // 3 sources

                case 48: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdcw", hcyr(int ), (int)99);
                    if (!var26_9) ** GOTO lbl207
                    throw null;
                }
lbl384:
                // 2 sources

                case 49: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdcx", hcyr(int ), (int)100);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl574
                }
lbl389:
                // 3 sources

                case 50: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdcy", hcyr(int ), (int)101);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl404
                }
lbl394:
                // 2 sources

                case 51: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdcz", hcyr(int ), (int)102);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl553
                }
lbl399:
                // 2 sources

                case 52: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdda", hcyr(int ), (int)103);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl466
                }
lbl404:
                // 2 sources

                case 53: {
                    var25_10 /* !! */  = (int)kr.hcyu("hddb", hcyr(int ), (int)104);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl610
                }
lbl409:
                // 2 sources

                case 54: {
                    var25_10 /* !! */  = (int)kr.hcyu("hddc", hcyr(int ), (int)105);
                    if (!var26_9) ** GOTO lbl319
                    throw null;
                }
lbl413:
                // 3 sources

                case 55: {
                    var25_10 /* !! */  = (int)kr.hcyu("hddd", hcyr(int ), (int)106);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl544
                }
                case 56: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdde", hcyr(int ), (int)107);
                    if (!var26_9) ** GOTO lbl351
                    throw null;
                }
lbl422:
                // 2 sources

                case 57: {
                    var25_10 /* !! */  = (int)kr.hcyu("hddf", hcyr(int ), (int)108);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl448
                }
                case 58: {
                    var25_10 /* !! */  = (int)kr.hcyu("hddg", hcyr(int ), (int)109);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl638
                }
                case 59: {
                    var25_10 /* !! */  = (int)kr.hcyu("hddh", hcyr(int ), (int)110);
                    if (!var26_9) ** GOTO lbl265
                    throw null;
                }
                case 60: {
                    var25_10 /* !! */  = (int)kr.hcyu("hddi", hcyr(int ), (int)111);
                    if (!var26_9) ** GOTO lbl187
                    throw null;
                }
lbl440:
                // 3 sources

                case 61: {
                    var25_10 /* !! */  = (int)kr.hcyu("hddj", hcyr(int ), (int)112);
                    if (!var26_9) ** GOTO lbl409
                    throw null;
                }
                case 62: {
                    var25_10 /* !! */  = (int)kr.hcyu("hddk", hcyr(int ), (int)113);
                    if (!var26_9) ** GOTO lbl293
                    throw null;
                }
lbl448:
                // 2 sources

                case 63: {
                    var25_10 /* !! */  = (int)kr.hcyu("hddl", hcyr(int ), (int)114);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl495
                }
                case 64: {
                    var25_10 /* !! */  = (int)kr.hcyu("hddm", hcyr(int ), (int)115);
                    if (!var26_9) ** GOTO lbl380
                    throw null;
                }
                case 65: {
                    var25_10 /* !! */  = (int)kr.hcyu("hddn", hcyr(int ), (int)116);
                    if (!var26_9) ** GOTO lbl351
                    throw null;
                }
lbl461:
                // 3 sources

                case 66: {
                    var25_10 /* !! */  = (int)kr.hcyu("hddo", hcyr(int ), (int)117);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl610
                }
lbl466:
                // 3 sources

                case 67: {
                    var25_10 /* !! */  = (int)kr.hcyu("hddp", hcyr(int ), (int)118);
                    if (!var26_9) ** GOTO lbl182
                    throw null;
                }
lbl470:
                // 2 sources

                case 68: {
                    var25_10 /* !! */  = (int)kr.hcyu("hddq", hcyr(int ), (int)119);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl578
                }
                case 69: {
                    var25_10 /* !! */  = (int)kr.hcyu("hddr", hcyr(int ), (int)120);
                    if (!var26_9) ** GOTO lbl152
                    throw null;
                }
                case 70: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdds", hcyr(int ), (int)121);
                    if (!var26_9) ** GOTO lbl227
                    throw null;
                }
lbl483:
                // 3 sources

                case 71: {
                    var25_10 /* !! */  = (int)kr.hcyu("hddt", hcyr(int ), (int)122);
                    if (var26_9) {
                        throw null;
                    }
                }
lbl487:
                // 5 sources

                case 72: {
                    var25_10 /* !! */  = (int)kr.hcyu("hddu", hcyr(int ), (int)123);
                    if (!var26_9) ** GOTO lbl167
                    throw null;
                }
                case 73: {
                    var25_10 /* !! */  = (int)kr.hcyu("hddv", hcyr(int ), (int)124);
                    if (!var26_9) ** GOTO lbl466
                    throw null;
                }
lbl495:
                // 4 sources

                case 74: {
                    var25_10 /* !! */  = (int)kr.hcyu("hddw", hcyr(int ), (int)125);
                    if (!var26_9) ** GOTO lbl389
                    throw null;
                }
lbl499:
                // 2 sources

                case 75: {
                    var25_10 /* !! */  = (int)kr.hcyu("hddx", hcyr(int ), (int)126);
                    if (!var26_9) ** GOTO lbl177
                    throw null;
                }
lbl503:
                // 2 sources

                case 76: {
                    var25_10 /* !! */  = (int)kr.hcyu("hddy", hcyr(int ), (int)127);
                    if (!var26_9) ** GOTO lbl293
                    throw null;
                }
                case 77: {
                    var25_10 /* !! */  = (int)kr.hcyu("hddz", hcyr(int ), (int)128);
                    if (!var26_9) ** GOTO lbl303
                    throw null;
                }
                case 78: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdea", hcyr(int ), (int)129);
                    if (!var26_9) ** GOTO lbl192
                    throw null;
                }
lbl515:
                // 2 sources

                case 79: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdeb", hcyr(int ), (int)130);
                    if (!var26_9) ** GOTO lbl503
                    throw null;
                }
                case 80: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdec", hcyr(int ), (int)131);
                    if (!var26_9) ** GOTO lbl274
                    throw null;
                }
lbl523:
                // 2 sources

                case 81: {
                    var25_10 /* !! */  = (int)kr.hcyu("hded", hcyr(int ), (int)132);
                    if (!var26_9) ** GOTO lbl515
                    throw null;
                }
lbl527:
                // 4 sources

                case 82: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdee", hcyr(int ), (int)133);
                    if (!var26_9) ** GOTO lbl265
                    throw null;
                }
                case 83: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdef", hcyr(int ), (int)134);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl570
                }
                case 84: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdeg", hcyr(int ), (int)135);
                    if (!var26_9) ** GOTO lbl319
                    throw null;
                }
                case 85: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdeh", hcyr(int ), (int)136);
                    if (!var26_9) break block114;
                    throw null;
                }
lbl544:
                // 4 sources

                case 86: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdei", hcyr(int ), (int)137);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl557
                }
lbl549:
                // 2 sources

                case 87: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdej", hcyr(int ), (int)138);
                    if (!var26_9) ** GOTO lbl329
                    throw null;
                }
lbl553:
                // 3 sources

                case 88: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdek", hcyr(int ), (int)139);
                    if (!var26_9) ** GOTO lbl375
                    throw null;
                }
lbl557:
                // 3 sources

                case 89: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdel", hcyr(int ), (int)140);
                    if (!var26_9) ** GOTO lbl256
                    throw null;
                }
lbl561:
                // 2 sources

                case 90: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdem", hcyr(int ), (int)141);
                    if (var26_9) {
                        throw null;
                    }
                    ** GOTO lbl630
                }
                case 91: {
                    var25_10 /* !! */  = (int)kr.hcyu("hden", hcyr(int ), (int)142);
                    if (!var26_9) ** GOTO lbl187
                    throw null;
                }
lbl570:
                // 2 sources

                case 92: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdeo", hcyr(int ), (int)143);
                    if (!var26_9) ** GOTO lbl499
                    throw null;
                }
lbl574:
                // 2 sources

                case 93: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdep", hcyr(int ), (int)144);
                    if (!var26_9) ** GOTO lbl370
                    throw null;
                }
lbl578:
                // 3 sources

                case 94: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdeq", hcyr(int ), (int)145);
                    if (!var26_9) ** GOTO lbl413
                    throw null;
                }
                case 95: {
                    var25_10 /* !! */  = (int)kr.hcyu("hder", hcyr(int ), (int)146);
                    if (!var26_9) ** GOTO lbl370
                    throw null;
                }
lbl586:
                // 4 sources

                case 96: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdes", hcyr(int ), (int)147);
                    if (!var26_9) ** GOTO lbl217
                    throw null;
                }
lbl590:
                // 2 sources

                case 97: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdet", hcyr(int ), (int)148);
                    if (!var26_9) ** GOTO lbl384
                    throw null;
                }
lbl594:
                // 2 sources

                case 98: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdeu", hcyr(int ), (int)149);
                    if (!var26_9) ** GOTO lbl288
                    throw null;
                }
                case 99: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdev", hcyr(int ), (int)150);
                    if (!var26_9) ** GOTO lbl329
                    throw null;
                }
lbl602:
                // 2 sources

                case 100: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdew", hcyr(int ), (int)151);
                    if (!var26_9) ** GOTO lbl152
                    throw null;
                }
                case 101: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdex", hcyr(int ), (int)152);
                    if (!var26_9) ** GOTO lbl346
                    throw null;
                }
lbl610:
                // 3 sources

                case 102: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdey", hcyr(int ), (int)153);
                    if (!var26_9) ** GOTO lbl375
                    throw null;
                }
lbl614:
                // 2 sources

                case 103: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdez", hcyr(int ), (int)154);
                    if (!var26_9) ** GOTO lbl222
                    throw null;
                }
                case 104: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdfa", hcyr(int ), (int)155);
                    if (!var26_9) ** GOTO lbl590
                    throw null;
                }
lbl622:
                // 3 sources

                case 105: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdfb", hcyr(int ), (int)156);
                    if (!var26_9) ** GOTO lbl594
                    throw null;
                }
                case 106: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdfc", hcyr(int ), (int)157);
                    if (!var26_9) ** GOTO lbl212
                    throw null;
                }
lbl630:
                // 2 sources

                case 107: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdfd", hcyr(int ), (int)158);
                    if (!var26_9) ** GOTO lbl527
                    throw null;
                }
lbl634:
                // 2 sources

                case 108: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdfe", hcyr(int ), (int)159);
                    if (!var26_9) ** GOTO lbl487
                    throw null;
                }
lbl638:
                // 2 sources

                case 109: {
                    var25_10 /* !! */  = (int)kr.hcyu("hdff", hcyr(int ), (int)160);
                    if (!var26_9) ** GOTO lbl422
                    throw null;
                }
                case 110: 
            }
            break;
        }
        var25_10 /* !! */  = (int)kr.hcyu("hdfg", hcyr(int ), (int)161);
        ** while (!var26_9)
lbl645:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void init() {
        block66: {
            var3 = kr.c;
            var2_1 /* !! */  = kr.b;
            var1_2 = kr.a;
            if (var3) {
                throw null;
lbl6:
                // 14 sources

                return;
            }
            if (var1_2 || var1_2) ** GOTO lbl6
            if (!kr.initialized) break block66;
            if (var1_2 || var1_2) ** GOTO lbl6
            return;
        }
        if (var1_2 || var1_2) ** GOTO lbl6
        System.out.println("[MSDF] Initializing Msdf2D shaders and buffers...");
        if (var1_2 || var1_2) ** GOTO lbl6
        kr.pipeline = RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[0]).withLocation(class_2960.method_60655((String)"phobia", (String)"msdf")).withVertexShader(class_2960.method_60655((String)"phobia", (String)"msdf_vertex")).withFragmentShader(class_2960.method_60655((String)"phobia", (String)"msdf_fragment")).withVertexFormat(VertexFormat.builder().build(), VertexFormat.class_5596.field_27379).withUniform("MsdfData", class_10789.field_60031).withUniform("GlyphData", class_10789.field_60031).withSampler("Sampler0").withBlend(BlendFunction.TRANSLUCENT).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withCull((boolean)kr.hcyu("hcyv", hcyr(int ), (int)0)).build();
        if (var1_2 || var1_2) ** GOTO lbl6
        kr.msdfBuffer = RenderSystem.getDevice().createBuffer((Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$init$0(), ()Ljava/lang/String;)(), (int)kr.hcyu("hcyw", hcyr(int ), (int)1), (long)kr.hcyu("hcza", hcyx(int ), (int)0));
        if (var1_2 || var1_2) ** GOTO lbl6
        kr.glyphBuffer = RenderSystem.getDevice().createBuffer((Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$init$1(), ()Ljava/lang/String;)(), (int)kr.hcyu("hczb", hcyr(int ), (int)2), (long)kr.hcyu("hczc", hcyx(int ), (int)1));
        if (var1_2 || var1_2) ** GOTO lbl6
        kr.msdfData = MemoryUtil.memAlloc((int)kr.hcyu("hczd", hcyr(int ), (int)3));
        if (var1_2 || var1_2) ** GOTO lbl6
        kr.glyphData = MemoryUtil.memAlloc((int)kr.hcyu("hcze", hcyr(int ), (int)4));
        if (var1_2 || var1_2) ** GOTO lbl6
        kr.initialized = kr.hcyu("hczf", hcyr(int ), (int)5);
        if (var1_2 || var1_2) ** GOTO lbl6
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3) {
                    throw null;
                }
                ** GOTO lbl41
            }
            catch (Exception var0_3) {
                if (var1_2 || var1_2) ** GOTO lbl6
                System.err.println("[MSDF] Failed to initialize Msdf2D: " + var0_3.getMessage());
                if (var1_2 || var1_2) ** GOTO lbl6
                var0_3.printStackTrace();
                if (var1_2) ** GOTO lbl6
            }
lbl41:
            // 2 sources

            if (!var1_2 && !var1_2) ** break;
            ** continue;
            return;
lbl44:
            // 2 sources

            case 0: {
                var2_1 /* !! */  = (int)kr.hcyu("hczg", hcyr(int ), (int)6);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl59
            }
            case 1: {
                var2_1 /* !! */  = (int)kr.hcyu("hczh", hcyr(int ), (int)7);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl59
            }
            case 2: {
                var2_1 /* !! */  = (int)kr.hcyu("hczi", hcyr(int ), (int)8);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl92
            }
lbl59:
            // 4 sources

            case 3: {
                var2_1 /* !! */  = (int)kr.hcyu("hczj", hcyr(int ), (int)9);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl156
            }
lbl64:
            // 2 sources

            case 4: {
                var2_1 /* !! */  = (int)kr.hcyu("hczk", hcyr(int ), (int)10);
                if (!var3) ** GOTO lbl44
                throw null;
            }
            case 5: {
                var2_1 /* !! */  = (int)kr.hcyu("hczl", hcyr(int ), (int)11);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl132
            }
            case 6: {
                var2_1 /* !! */  = (int)kr.hcyu("hczm", hcyr(int ), (int)12);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl102
            }
lbl78:
            // 2 sources

            case 7: {
                var2_1 /* !! */  = (int)kr.hcyu("hczn", hcyr(int ), (int)13);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl127
            }
            case 8: {
                var2_1 /* !! */  = (int)kr.hcyu("hczo", hcyr(int ), (int)14);
                if (!var3) ** GOTO lbl78
                throw null;
            }
            case 9: {
                var2_1 /* !! */  = (int)kr.hcyu("hczp", hcyr(int ), (int)15);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl156
            }
lbl92:
            // 2 sources

            case 10: {
                var2_1 /* !! */  = (int)kr.hcyu("hczq", hcyr(int ), (int)16);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl174
            }
            case 11: {
                var2_1 /* !! */  = (int)kr.hcyu("hczr", hcyr(int ), (int)17);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl102:
            // 3 sources

            case 12: {
                var2_1 /* !! */  = (int)kr.hcyu("hczs", hcyr(int ), (int)18);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl107:
            // 2 sources

            case 13: {
                var2_1 /* !! */  = (int)kr.hcyu("hczt", hcyr(int ), (int)19);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl136
            }
            case 14: {
                var2_1 /* !! */  = (int)kr.hcyu("hczu", hcyr(int ), (int)20);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl117:
            // 3 sources

            case 15: {
                var2_1 /* !! */  = (int)kr.hcyu("hczv", hcyr(int ), (int)21);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl148
            }
            case 16: {
                var2_1 /* !! */  = (int)kr.hcyu("hczw", hcyr(int ), (int)22);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl127:
            // 2 sources

            case 17: {
                var2_1 /* !! */  = (int)kr.hcyu("hczx", hcyr(int ), (int)23);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl132:
            // 3 sources

            case 18: {
                var2_1 /* !! */  = (int)kr.hcyu("hczy", hcyr(int ), (int)24);
                if (!var3) ** GOTO lbl117
                throw null;
            }
lbl136:
            // 3 sources

            case 19: {
                var2_1 /* !! */  = (int)kr.hcyu("hczz", hcyr(int ), (int)25);
                if (!var3) ** GOTO lbl132
                throw null;
            }
            case 20: {
                var2_1 /* !! */  = (int)kr.hcyu("hdaa", hcyr(int ), (int)26);
                if (!var3) ** GOTO lbl107
                throw null;
            }
            case 21: {
                var2_1 /* !! */  = (int)kr.hcyu("hdab", hcyr(int ), (int)27);
                if (!var3) ** GOTO lbl59
                throw null;
            }
lbl148:
            // 2 sources

            case 22: {
                var2_1 /* !! */  = (int)kr.hcyu("hdac", hcyr(int ), (int)28);
                if (!var3) ** GOTO lbl117
                throw null;
            }
lbl152:
            // 2 sources

            case 23: {
                var2_1 /* !! */  = (int)kr.hcyu("hdad", hcyr(int ), (int)29);
                if (!var3) ** GOTO lbl136
                throw null;
            }
lbl156:
            // 3 sources

            case 24: {
                do {
                    var2_1 /* !! */  = (int)kr.hcyu("hdae", hcyr(int ), (int)30);
                } while (!var3);
                throw null;
            }
lbl161:
            // 3 sources

            case 25: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)kr.hcyu("hdaf", hcyr(int ), (int)31);
                    if (!var3) ** GOTO lbl102
                    throw null;
                }
            }
lbl166:
            // 4 sources

            case 26: {
                var2_1 /* !! */  = (int)kr.hcyu("hdag", hcyr(int ), (int)32);
                if (var3) {
                    throw null;
                }
            }
            case 27: {
                var2_1 /* !! */  = (int)kr.hcyu("hdah", hcyr(int ), (int)33);
                if (!var3) ** GOTO lbl166
                throw null;
            }
lbl174:
            // 2 sources

            case 28: {
                var2_1 /* !! */  = (int)kr.hcyu("hdai", hcyr(int ), (int)34);
                if (!var3) ** GOTO lbl64
                throw null;
            }
            case 29: 
        }
        var2_1 /* !! */  = (int)kr.hcyu("hdaj", hcyr(int ), (int)35);
        ** while (!var3)
lbl181:
        // 1 sources

        throw null;
    }

    private static void heyd() {
        kr.hcyt[400] = -1781317969;
        kr.hcyt[401] = -190847862;
        kr.hcyt[402] = 1482660728;
        kr.hcyt[403] = -2035417843;
        kr.hcyt[404] = 186740706;
        kr.hcyt[405] = -436641637;
        kr.hcyt[406] = -1460360212;
        kr.hcyt[407] = 1379093412;
        kr.hcyt[408] = -308002487;
        kr.hcyt[409] = -164656786;
        kr.hcyt[410] = 1244313409;
        kr.hcyt[411] = -105964304;
        kr.hcyt[412] = -760294355;
        kr.hcyt[413] = 12585853;
        kr.hcyt[414] = 2048984884;
        kr.hcyt[415] = 1497242357;
        kr.hcyt[416] = -554473678;
        kr.hcyt[417] = -1378193085;
        kr.hcyt[418] = -1535879475;
        kr.hcyt[419] = -1513201847;
        kr.hcyt[420] = 1610656143;
        kr.hcyt[421] = -1743497440;
        kr.hcyt[422] = 2055492885;
        kr.hcyt[423] = -2105831200;
        kr.hcyt[424] = -1564597267;
        kr.hcyt[425] = 1119402681;
        kr.hcyt[426] = 2051101071;
        kr.hcyt[427] = 1230377759;
        kr.hcyt[428] = 1776343239;
        kr.hcyt[429] = -585631501;
        kr.hcyt[430] = 1944080176;
        kr.hcyt[431] = 883361796;
        kr.hcyt[432] = -1669257113;
        kr.hcyt[433] = -2087648765;
        kr.hcyt[434] = 2115952133;
        kr.hcyt[435] = -1934136809;
        kr.hcyt[436] = -2064733251;
        kr.hcyt[437] = 230184181;
        kr.hcyt[438] = 521734507;
        kr.hcyt[439] = -168269026;
        kr.hcyt[440] = -1301470291;
        kr.hcyt[441] = -237545708;
        kr.hcyt[442] = 1536149798;
        kr.hcyt[443] = 243679673;
        kr.hcyt[444] = 930376560;
        kr.hcyt[445] = 829115949;
        kr.hcyt[446] = -2006352658;
        kr.hcyt[447] = 1766246859;
        kr.hcyt[448] = -357476203;
        kr.hcyt[449] = 389877592;
        kr.hcyt[450] = 472332168;
        kr.hcyt[451] = 1101053380;
        kr.hcyt[452] = -260779928;
        kr.hcyt[453] = 1347915938;
        kr.hcyt[454] = 987085841;
        kr.hcyt[455] = 1324871555;
        kr.hcyt[456] = -712555400;
        kr.hcyt[457] = 900603885;
        kr.hcyt[458] = -294342209;
        kr.hcyt[459] = -935485687;
        kr.hcyt[460] = 587327996;
        kr.hcyt[461] = -1527020738;
        kr.hcyt[462] = -1847553461;
        kr.hcyt[463] = -82005172;
        kr.hcyt[464] = -1298045928;
        kr.hcyt[465] = 463310767;
        kr.hcyt[466] = 1256269779;
        kr.hcyt[467] = 259009611;
        kr.hcyt[468] = -719172001;
        kr.hcyt[469] = 1511963562;
        kr.hcyt[470] = 621249792;
        kr.hcyt[471] = -572120478;
        kr.hcyt[472] = 1618832281;
        kr.hcyt[473] = -1702223788;
        kr.hcyt[474] = -1682908309;
        kr.hcyt[475] = -1677531426;
        kr.hcyt[476] = 485588165;
        kr.hcyt[477] = -2072404410;
        kr.hcyt[478] = 653644860;
        kr.hcyt[479] = -690153004;
        kr.hcyt[480] = 2049246305;
        kr.hcyt[481] = -1667950206;
        kr.hcyt[482] = -509325548;
        kr.hcyt[483] = 841271598;
        kr.hcyt[484] = 1233811944;
        kr.hcyt[485] = -1657470812;
        kr.hcyt[486] = 131836716;
        kr.hcyt[487] = 1603595526;
        kr.hcyt[488] = -2066370149;
        kr.hcyt[489] = 306811735;
        kr.hcyt[490] = -1396572482;
        kr.hcyt[491] = 353359158;
        kr.hcyt[492] = -17204092;
        kr.hcyt[493] = -1899258870;
        kr.hcyt[494] = 206233763;
        kr.hcyt[495] = -1835246545;
        kr.hcyt[496] = -1609513801;
        kr.hcyt[497] = -1525509916;
        kr.hcyt[498] = -1569806275;
        kr.hcyt[499] = -964496630;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void prepareBatch(Matrix4f var0, ks var1_1, float var2_2, float var3_3) {
        block74: {
            block73: {
                block71: {
                    block72: {
                        var7_4 = kr.c;
                        var6_5 /* !! */  = kr.b;
                        var5_6 = kr.a;
                        if (var7_4) {
                            throw null;
lbl6:
                            // 20 sources

                            return;
                        }
                        if (var5_6 || var5_6) ** GOTO lbl6
                        if (kr.batchGlyphCount <= 0) break block71;
                        if (var5_6) ** GOTO lbl6
                        if (kr.batchFont != var1_1) break block72;
                        if (var5_6) ** GOTO lbl6
                        if (kr.batchMatrix != var0) break block72;
                        if (var5_6) ** GOTO lbl6
                        if (Float.compare(kr.batchRotation, var2_2) != 0) break block72;
                        if (var5_6) ** GOTO lbl6
                        if (Float.compare(kr.batchZ, var3_3) == 0) break block71;
                        if (var5_6) ** GOTO lbl6
                    }
                    if (var5_6 || var5_6) ** GOTO lbl6
                    v0 = kr.hcyu("henf", hcyr(int ), (int)527);
                    if (var7_4) {
                        throw null;
                    }
                    break block73;
                }
                if (var5_6 || var5_6) ** GOTO lbl6
                v0 = var4_7 = kr.hcyu("heng", hcyr(int ), (int)528);
            }
            if (var5_6 || var5_6) ** GOTO lbl6
            if (var4_7 == false) break block74;
            if (var5_6 || var5_6) ** GOTO lbl6
            kr.flushBatch();
            if (var5_6) ** GOTO lbl6
        }
        if (var5_6 || var5_6) ** GOTO lbl6
        if (kr.batchGlyphCount != 0) ** GOTO lbl54
        if (var5_6 || var5_6) ** GOTO lbl6
        kr.batchFont = var1_1;
        if (var5_6 || var5_6) ** GOTO lbl6
        kr.batchMatrix = var0;
        if (var5_6 || var5_6) ** GOTO lbl6
        if (var6_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                kr.batchRotation = var2_2;
                if (var5_6 || var5_6) ** GOTO lbl6
                kr.batchZ = var3_3;
                if (var5_6 || var5_6) ** GOTO lbl6
                kr.glyphData.clear();
                if (var5_6 || var5_6) ** GOTO lbl6
                kr.prepareMsdfData(var0, var1_1, (int)kr.hcyu("henh", hcyr(int ), (int)529), var2_2, var3_3);
                if (var5_6) ** GOTO lbl6
lbl54:
                // 2 sources

                if (!var5_6 && !var5_6) ** break;
                ** continue;
                return;
            }
            case 0: {
                var6_5 /* !! */  = (int)kr.hcyu("heni", hcyr(int ), (int)530);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl111
            }
            case 1: {
                var6_5 /* !! */  = (int)kr.hcyu("henj", hcyr(int ), (int)531);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl131
            }
lbl67:
            // 2 sources

            case 2: {
                var6_5 /* !! */  = (int)kr.hcyu("henk", hcyr(int ), (int)532);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl208
            }
            case 3: {
                var6_5 /* !! */  = (int)kr.hcyu("henl", hcyr(int ), (int)533);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl77:
            // 2 sources

            case 4: {
                var6_5 /* !! */  = (int)kr.hcyu("henm", hcyr(int ), (int)534);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl126
            }
lbl82:
            // 4 sources

            case 5: {
                var6_5 /* !! */  = (int)kr.hcyu("henn", hcyr(int ), (int)535);
                if (!var7_4) ** GOTO lbl77
                throw null;
            }
            case 6: {
                var6_5 /* !! */  = (int)kr.hcyu("heno", hcyr(int ), (int)536);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl101
            }
lbl91:
            // 2 sources

            case 7: {
                var6_5 /* !! */  = (int)kr.hcyu("henp", hcyr(int ), (int)537);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl106
            }
            case 8: {
                var6_5 /* !! */  = (int)kr.hcyu("henq", hcyr(int ), (int)538);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl101:
            // 4 sources

            case 9: {
                var6_5 /* !! */  = (int)kr.hcyu("henr", hcyr(int ), (int)539);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl106:
            // 3 sources

            case 10: {
                var6_5 /* !! */  = (int)kr.hcyu("hens", hcyr(int ), (int)540);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl140
            }
lbl111:
            // 4 sources

            case 11: {
                do {
                    var6_5 /* !! */  = (int)kr.hcyu("hent", hcyr(int ), (int)541);
                } while (!var7_4);
                throw null;
            }
lbl116:
            // 2 sources

            case 12: {
                var6_5 /* !! */  = (int)kr.hcyu("henu", hcyr(int ), (int)542);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl170
            }
lbl121:
            // 2 sources

            case 13: {
                var6_5 /* !! */  = (int)kr.hcyu("henv", hcyr(int ), (int)543);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl140
            }
lbl126:
            // 2 sources

            case 14: {
                var6_5 /* !! */  = (int)kr.hcyu("henw", hcyr(int ), (int)544);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl131:
            // 2 sources

            case 15: {
                var6_5 /* !! */  = (int)kr.hcyu("henx", hcyr(int ), (int)545);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl212
            }
            case 16: {
                var6_5 /* !! */  = (int)kr.hcyu("heny", hcyr(int ), (int)546);
                if (!var7_4) ** GOTO lbl116
                throw null;
            }
lbl140:
            // 3 sources

            case 17: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_5 /* !! */  = (int)kr.hcyu("henz", hcyr(int ), (int)547);
                    if (!var7_4) ** GOTO lbl111
                    throw null;
                }
            }
            case 18: {
                do {
                    var6_5 /* !! */  = (int)kr.hcyu("heoa", hcyr(int ), (int)548);
                } while (!var7_4);
                throw null;
            }
            case 19: {
                var6_5 /* !! */  = (int)kr.hcyu("heob", hcyr(int ), (int)549);
                if (!var7_4) ** GOTO lbl82
                throw null;
            }
            case 20: {
                var6_5 /* !! */  = (int)kr.hcyu("heoc", hcyr(int ), (int)550);
                if (!var7_4) ** GOTO lbl91
                throw null;
            }
            case 21: {
                var6_5 /* !! */  = (int)kr.hcyu("heod", hcyr(int ), (int)551);
                if (!var7_4) ** GOTO lbl101
                throw null;
            }
            case 22: {
                var6_5 /* !! */  = (int)kr.hcyu("heoe", hcyr(int ), (int)552);
                if (!var7_4) ** GOTO lbl67
                throw null;
            }
            case 23: {
                var6_5 /* !! */  = (int)kr.hcyu("heof", hcyr(int ), (int)553);
                if (!var7_4) ** GOTO lbl111
                throw null;
            }
lbl170:
            // 2 sources

            case 24: {
                var6_5 /* !! */  = (int)kr.hcyu("heog", hcyr(int ), (int)554);
                if (!var7_4) break;
                throw null;
            }
lbl174:
            // 2 sources

            case 25: {
                var6_5 /* !! */  = (int)kr.hcyu("heoh", hcyr(int ), (int)555);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl187
            }
            case 26: {
                var6_5 /* !! */  = (int)kr.hcyu("heoi", hcyr(int ), (int)556);
                if (!var7_4) ** GOTO lbl121
                throw null;
            }
lbl183:
            // 3 sources

            case 27: {
                var6_5 /* !! */  = (int)kr.hcyu("heoj", hcyr(int ), (int)557);
                if (!var7_4) ** GOTO lbl82
                throw null;
            }
lbl187:
            // 2 sources

            case 28: {
                var6_5 /* !! */  = (int)kr.hcyu("heok", hcyr(int ), (int)558);
                if (var7_4) {
                    throw null;
                }
            }
            case 29: {
                var6_5 /* !! */  = (int)kr.hcyu("heol", hcyr(int ), (int)559);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl204
            }
            case 30: {
                var6_5 /* !! */  = (int)kr.hcyu("heom", hcyr(int ), (int)560);
                if (!var7_4) ** GOTO lbl183
                throw null;
            }
            case 31: {
                var6_5 /* !! */  = (int)kr.hcyu("heon", hcyr(int ), (int)561);
                if (!var7_4) ** GOTO lbl101
                throw null;
            }
lbl204:
            // 3 sources

            case 32: {
                var6_5 /* !! */  = (int)kr.hcyu("heoo", hcyr(int ), (int)562);
                if (!var7_4) ** GOTO lbl106
                throw null;
            }
lbl208:
            // 2 sources

            case 33: {
                var6_5 /* !! */  = (int)kr.hcyu("heop", hcyr(int ), (int)563);
                if (!var7_4) ** GOTO lbl82
                throw null;
            }
lbl212:
            // 3 sources

            case 34: {
                var6_5 /* !! */  = (int)kr.hcyu("heoq", hcyr(int ), (int)564);
                if (!var7_4) break;
                throw null;
            }
            case 35: 
        }
        var6_5 /* !! */  = (int)kr.hcyu("heor", hcyr(int ), (int)565);
        ** while (!var7_4)
lbl219:
        // 1 sources

        throw null;
    }

    private static void heye() {
        kr.hcyt[500] = 1493608923;
        kr.hcyt[501] = 1891061749;
        kr.hcyt[502] = 767248278;
        kr.hcyt[503] = -634987812;
        kr.hcyt[504] = -150642200;
        kr.hcyt[505] = 1734994605;
        kr.hcyt[506] = -703192119;
        kr.hcyt[507] = 254353229;
        kr.hcyt[508] = 283894321;
        kr.hcyt[509] = 1905538193;
        kr.hcyt[510] = 1545113504;
        kr.hcyt[511] = 1193813611;
        kr.hcyt[512] = 1585878180;
        kr.hcyt[513] = 319424811;
        kr.hcyt[514] = -538522498;
        kr.hcyt[515] = 1648880059;
        kr.hcyt[516] = 1380425041;
        kr.hcyt[517] = -89948863;
        kr.hcyt[518] = 33273215;
        kr.hcyt[519] = 786181265;
        kr.hcyt[520] = -16813016;
        kr.hcyt[521] = 1689022282;
        kr.hcyt[522] = -882804515;
        kr.hcyt[523] = -531676255;
        kr.hcyt[524] = 1675548422;
        kr.hcyt[525] = -891802851;
        kr.hcyt[526] = 2138178453;
        kr.hcyt[527] = -1309326891;
        kr.hcyt[528] = -1508419598;
        kr.hcyt[529] = -870378261;
        kr.hcyt[530] = -1379925175;
        kr.hcyt[531] = 1428463200;
        kr.hcyt[532] = -1996485725;
        kr.hcyt[533] = -1562931345;
        kr.hcyt[534] = 695444072;
        kr.hcyt[535] = 1038788626;
        kr.hcyt[536] = 1610095685;
        kr.hcyt[537] = -155545245;
        kr.hcyt[538] = -227253621;
        kr.hcyt[539] = -1874634258;
        kr.hcyt[540] = -2003221380;
        kr.hcyt[541] = 513252917;
        kr.hcyt[542] = 1047247138;
        kr.hcyt[543] = -299801351;
        kr.hcyt[544] = 1147696808;
        kr.hcyt[545] = -1316809222;
        kr.hcyt[546] = 843207247;
        kr.hcyt[547] = 1577878356;
        kr.hcyt[548] = 391328874;
        kr.hcyt[549] = -2071654237;
        kr.hcyt[550] = 712252945;
        kr.hcyt[551] = -269916020;
        kr.hcyt[552] = -131311001;
        kr.hcyt[553] = 1065236589;
        kr.hcyt[554] = -1212839003;
        kr.hcyt[555] = 987751217;
        kr.hcyt[556] = -96246708;
        kr.hcyt[557] = -1520740450;
        kr.hcyt[558] = 1747359528;
        kr.hcyt[559] = -1316420699;
        kr.hcyt[560] = 1063087377;
        kr.hcyt[561] = -2012770963;
        kr.hcyt[562] = -1443459711;
        kr.hcyt[563] = -1848091595;
        kr.hcyt[564] = 403140480;
        kr.hcyt[565] = 1662541377;
        kr.hcyt[566] = 565021432;
        kr.hcyt[567] = 1882067742;
        kr.hcyt[568] = -1916445772;
        kr.hcyt[569] = 1231317913;
        kr.hcyt[570] = 497354397;
        kr.hcyt[571] = -170114866;
        kr.hcyt[572] = -1855498949;
        kr.hcyt[573] = 727700627;
        kr.hcyt[574] = 527579408;
        kr.hcyt[575] = 739846574;
        kr.hcyt[576] = 491665617;
        kr.hcyt[577] = -712202159;
        kr.hcyt[578] = 1564516124;
        kr.hcyt[579] = 370927847;
        kr.hcyt[580] = 362618190;
        kr.hcyt[581] = 91192672;
        kr.hcyt[582] = -508897728;
        kr.hcyt[583] = -823285368;
        kr.hcyt[584] = -1323453356;
        kr.hcyt[585] = 1880931683;
        kr.hcyt[586] = -1807634917;
        kr.hcyt[587] = -911087998;
        kr.hcyt[588] = 1203434895;
        kr.hcyt[589] = -395957506;
        kr.hcyt[590] = 332251290;
        kr.hcyt[591] = 1334525581;
        kr.hcyt[592] = 161532562;
        kr.hcyt[593] = 95788079;
        kr.hcyt[594] = 1710168704;
        kr.hcyt[595] = 799925827;
        kr.hcyt[596] = 208502910;
        kr.hcyt[597] = 1487883728;
        kr.hcyt[598] = -1323195266;
        kr.hcyt[599] = -1451754559;
    }
}

