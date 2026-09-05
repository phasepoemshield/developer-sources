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

public final class lx {
    private static GpuBuffer vertexBuffer;
    private static long[] hwps;
    private static final Matrix4f inverseView;
    private static Matrix4f projection;
    private static final int MAX_RINGS = 8;
    private static final Matrix4f combined;
    private static int ringCount;
    private static final class_310 mc;
    protected static final long pd = -4190350407979257087L;
    private static RenderPipeline pipeline;
    private static final int UNIFORM_SIZE = 128;
    private static int[] hwpk;
    private static int[] hwpl;
    private static boolean batchIgnoreDepth;
    public static final boolean c;
    public static final int b;
    public static final boolean a;
    private static final float[] rings;
    private static Matrix4f view;
    private static final float[] QUAD_U;
    private static long[] hwpr;
    private static final float[] QUAD_V;
    private static GpuBuffer[] uniformBuffers;
    private static final int VERTEX_SIZE = 12;

    private static /* synthetic */ float hwtt(int n2) {
        return Float.intBitsToFloat(hwpk[n2] ^ hwpl[n2]);
    }

    private static /* synthetic */ void hxhf() {
        lx.hwpl[300] = -150026623;
        lx.hwpl[301] = 1717908300;
        lx.hwpl[302] = -1539584170;
        lx.hwpl[303] = -1509130818;
        lx.hwpl[304] = 589966249;
        lx.hwpl[305] = -1437495963;
        lx.hwpl[306] = 349955587;
        lx.hwpl[307] = -1289004606;
        lx.hwpl[308] = 1368845103;
        lx.hwpl[309] = 938435707;
        lx.hwpl[310] = 1650191992;
        lx.hwpl[311] = -1464430919;
        lx.hwpl[312] = -1302792052;
        lx.hwpl[313] = -864292083;
        lx.hwpl[314] = -2134826749;
        lx.hwpl[315] = -1071378332;
        lx.hwpl[316] = -970513663;
        lx.hwpl[317] = 1985651292;
        lx.hwpl[318] = 141168027;
        lx.hwpl[319] = -1162794467;
        lx.hwpl[320] = 640296290;
        lx.hwpl[321] = 1273008440;
        lx.hwpl[322] = 2116636883;
        lx.hwpl[323] = -1906780673;
        lx.hwpl[324] = 1455177736;
        lx.hwpl[325] = 1585004394;
        lx.hwpl[326] = -472444796;
        lx.hwpl[327] = -1241766132;
        lx.hwpl[328] = 12974697;
        lx.hwpl[329] = -423729638;
        lx.hwpl[330] = 878539581;
        lx.hwpl[331] = -1794756342;
        lx.hwpl[332] = -293271702;
        lx.hwpl[333] = 1900566058;
        lx.hwpl[334] = 4897400;
        lx.hwpl[335] = -298592323;
        lx.hwpl[336] = 70328261;
        lx.hwpl[337] = -471499589;
        lx.hwpl[338] = -191044377;
        lx.hwpl[339] = 34416749;
    }

    private static /* synthetic */ void hxgz() {
        lx.hwpk[100] = 133800538;
        lx.hwpk[101] = -32969733;
        lx.hwpk[102] = 622597813;
        lx.hwpk[103] = -572093011;
        lx.hwpk[104] = 1994864962;
        lx.hwpk[105] = 986108154;
        lx.hwpk[106] = 657390527;
        lx.hwpk[107] = 1684133950;
        lx.hwpk[108] = -437784737;
        lx.hwpk[109] = 976097506;
        lx.hwpk[110] = 1075894434;
        lx.hwpk[111] = -1917199134;
        lx.hwpk[112] = 378551095;
        lx.hwpk[113] = -688726912;
        lx.hwpk[114] = -1460733601;
        lx.hwpk[115] = -816510409;
        lx.hwpk[116] = -915755567;
        lx.hwpk[117] = 1539442172;
        lx.hwpk[118] = 114283351;
        lx.hwpk[119] = 900647180;
        lx.hwpk[120] = 1090563186;
        lx.hwpk[121] = 1345095827;
        lx.hwpk[122] = 209059640;
        lx.hwpk[123] = 165697429;
        lx.hwpk[124] = 1000485194;
        lx.hwpk[125] = 1476813280;
        lx.hwpk[126] = 2115981765;
        lx.hwpk[127] = 1633263927;
        lx.hwpk[128] = 1678381090;
        lx.hwpk[129] = -1745153428;
        lx.hwpk[130] = 1259119981;
        lx.hwpk[131] = -1049819280;
        lx.hwpk[132] = 417295173;
        lx.hwpk[133] = -1856212144;
        lx.hwpk[134] = 599009453;
        lx.hwpk[135] = -922915715;
        lx.hwpk[136] = -1645457374;
        lx.hwpk[137] = 1884734706;
        lx.hwpk[138] = 919160424;
        lx.hwpk[139] = 298711780;
        lx.hwpk[140] = 183283803;
        lx.hwpk[141] = -1795223507;
        lx.hwpk[142] = -581797001;
        lx.hwpk[143] = -1796771407;
        lx.hwpk[144] = -900192296;
        lx.hwpk[145] = 1331646779;
        lx.hwpk[146] = -659116948;
        lx.hwpk[147] = 981400233;
        lx.hwpk[148] = 431769943;
        lx.hwpk[149] = -1695156322;
        lx.hwpk[150] = 305189405;
        lx.hwpk[151] = -1979266416;
        lx.hwpk[152] = -1805361653;
        lx.hwpk[153] = 1163180053;
        lx.hwpk[154] = 1387401333;
        lx.hwpk[155] = -623832311;
        lx.hwpk[156] = 1801901694;
        lx.hwpk[157] = -1612398071;
        lx.hwpk[158] = 1244103762;
        lx.hwpk[159] = -449705808;
        lx.hwpk[160] = 184537598;
        lx.hwpk[161] = 1419035290;
        lx.hwpk[162] = 647653992;
        lx.hwpk[163] = 529924239;
        lx.hwpk[164] = -1079803386;
        lx.hwpk[165] = -2104008486;
        lx.hwpk[166] = 1945528498;
        lx.hwpk[167] = 650963569;
        lx.hwpk[168] = -1666559837;
        lx.hwpk[169] = 564070229;
        lx.hwpk[170] = -1649734216;
        lx.hwpk[171] = 1293724624;
        lx.hwpk[172] = -836500934;
        lx.hwpk[173] = 695086966;
        lx.hwpk[174] = 555409842;
        lx.hwpk[175] = -725607038;
        lx.hwpk[176] = 1853769200;
        lx.hwpk[177] = -547256790;
        lx.hwpk[178] = -870607011;
        lx.hwpk[179] = -661604883;
        lx.hwpk[180] = 1920887768;
        lx.hwpk[181] = 1443599741;
        lx.hwpk[182] = -1695534934;
        lx.hwpk[183] = 1156912805;
        lx.hwpk[184] = -1177210839;
        lx.hwpk[185] = -498085632;
        lx.hwpk[186] = 1449078574;
        lx.hwpk[187] = -737208768;
        lx.hwpk[188] = 2072958017;
        lx.hwpk[189] = 2011509510;
        lx.hwpk[190] = -1307304340;
        lx.hwpk[191] = -691539081;
        lx.hwpk[192] = 990966218;
        lx.hwpk[193] = 1392951673;
        lx.hwpk[194] = -1365437639;
        lx.hwpk[195] = -922630570;
        lx.hwpk[196] = 125486623;
        lx.hwpk[197] = -2137348141;
        lx.hwpk[198] = -1907757470;
        lx.hwpk[199] = -1641976127;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void setMatrices(Matrix4f var0, Matrix4f var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lx.pd - lx.hwpm("hwpt", hwpq(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == lx.hwpm("hwpu", hwpj(int ), (int)3)) break;
            v0 /* !! */  = (long)lx.hwpm("hwpv", hwpj(int ), (int)4);
        }
        var4_2 = lx.c;
        v1 /* !! */  = lx.pd;
        if (true) ** GOTO lbl11
        block21: while (true) {
            v1 /* !! */  = (long)(lx.hwpm("hwpx", hwpq(int ), (int)2) - lx.hwpm("hwpw", hwpq(int ), (int)1));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1316701064: {
                    continue block21;
                }
                case 1610330881: {
                    break block21;
                }
            }
            break;
        }
        var3_3 /* !! */  = lx.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = lx.pd - lx.hwpm("hwpy", hwpq(int ), (int)3)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == lx.hwpm("hwpz", hwpj(int ), (int)5)) break;
            v2 /* !! */  = (long)lx.hwpm("hwqa", hwpj(int ), (int)6);
        }
        var2_4 = lx.a;
        if (var4_2) {
            throw null;
lbl25:
            // 3 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl25
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = lx.pd - lx.hwpm("hwqb", hwpq(int ), (int)4)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == lx.hwpm("hwqc", hwpj(int ), (int)7)) break;
                    v3 /* !! */  = (long)lx.hwpm("hwqd", hwpj(int ), (int)8);
                }
                v4 /* !! */  = lx.pd;
                if (true) ** GOTO lbl40
                block25: while (true) {
                    v4 /* !! */  = (long)(v5 - lx.hwpm("hwqe", hwpq(int ), (int)5));
lbl40:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1261709621: {
                            v5 = lx.hwpm("hwqf", hwpq(int ), (int)6);
                            continue block25;
                        }
                        case -1148110603: {
                            v5 = lx.hwpm("hwqg", hwpq(int ), (int)7);
                            continue block25;
                        }
                        case 490984181: {
                            v5 = lx.hwpm("hwqh", hwpq(int ), (int)8);
                            continue block25;
                        }
                        case 1610330881: {
                            break block25;
                        }
                    }
                    break;
                }
                lx.projection.set((Matrix4fc)var0);
                if (var2_4 || var2_4) ** GOTO lbl25
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = lx.pd - lx.hwpm("hwqi", hwpq(int ), (int)9)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == lx.hwpm("hwqj", hwpj(int ), (int)9)) break;
                    v6 /* !! */  = (long)lx.hwpm("hwqk", hwpj(int ), (int)10);
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_4 = lx.pd - lx.hwpm("hwql", hwpq(int ), (int)10)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == lx.hwpm("hwqm", hwpj(int ), (int)11)) break;
                    v7 /* !! */  = (long)lx.hwpm("hwqn", hwpj(int ), (int)12);
                }
                lx.view.set((Matrix4fc)var1_1);
                if (var2_4 || var2_4) ** continue;
                return;
            }
lbl68:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)lx.hwpm("hwqo", hwpj(int ), (int)13);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl82
            }
            case 1: {
                var3_3 /* !! */  = (int)lx.hwpm("hwqp", hwpj(int ), (int)14);
                if (var4_2) {
                    throw null;
                }
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)lx.hwpm("hwqq", hwpj(int ), (int)15);
                } while (!var4_2);
                throw null;
            }
lbl82:
            // 3 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)lx.hwpm("hwqr", hwpj(int ), (int)16);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl87:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)lx.hwpm("hwqs", hwpj(int ), (int)17);
                if (!var4_2) ** GOTO lbl82
                throw null;
            }
            case 5: {
                var3_3 /* !! */  = (int)lx.hwpm("hwqt", hwpj(int ), (int)18);
                if (!var4_2) ** GOTO lbl68
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)lx.hwpm("hwqu", hwpj(int ), (int)19);
                if (!var4_2) ** GOTO lbl87
                throw null;
            }
            case 7: 
        }
        var3_3 /* !! */  = (int)lx.hwpm("hwqv", hwpj(int ), (int)20);
        ** while (!var4_2)
lbl102:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hxhh() {
        lx.hwpr[100] = 1121249213184258786L;
        lx.hwpr[101] = 3384723857349057356L;
        lx.hwpr[102] = 7145205800401664551L;
        lx.hwpr[103] = -8724573587929389708L;
        lx.hwpr[104] = -2213601105348398487L;
        lx.hwpr[105] = 214208365451068567L;
        lx.hwpr[106] = 239301603488078635L;
        lx.hwpr[107] = 6028260306010808093L;
        lx.hwpr[108] = -1019303921907733089L;
    }

    private static /* synthetic */ void hxhi() {
        lx.hwps[0] = -8966130629920834845L;
        lx.hwps[1] = 596780685293267933L;
        lx.hwps[2] = -269752973745152485L;
        lx.hwps[3] = -6457041910998582760L;
        lx.hwps[4] = 7479790758295559241L;
        lx.hwps[5] = 4751665275341552264L;
        lx.hwps[6] = -8507823782380583556L;
        lx.hwps[7] = -195476842130499257L;
        lx.hwps[8] = -584967842507293935L;
        lx.hwps[9] = -3981083771084701825L;
        lx.hwps[10] = -5376293575761458133L;
        lx.hwps[11] = 5492293589375054891L;
        lx.hwps[12] = -2655267622936918722L;
        lx.hwps[13] = -3023565566506962437L;
        lx.hwps[14] = 2458626703662872717L;
        lx.hwps[15] = 6126761441935628763L;
        lx.hwps[16] = -1523223027266241464L;
        lx.hwps[17] = -156119596647199096L;
        lx.hwps[18] = 2567691942864799462L;
        lx.hwps[19] = 1404863028882277603L;
        lx.hwps[20] = -5856693193600363780L;
        lx.hwps[21] = 1843080342716588578L;
        lx.hwps[22] = 4781343339263694589L;
        lx.hwps[23] = -4091987561670895586L;
        lx.hwps[24] = 3039016255653715693L;
        lx.hwps[25] = -2581287625078040608L;
        lx.hwps[26] = 2689262558861833395L;
        lx.hwps[27] = 7289707485137920397L;
        lx.hwps[28] = 6812885490487192116L;
        lx.hwps[29] = 1923898818461938580L;
        lx.hwps[30] = 7170750318029453543L;
        lx.hwps[31] = -6796068123093820681L;
        lx.hwps[32] = 521204507465816132L;
        lx.hwps[33] = 2127079008152828941L;
        lx.hwps[34] = 1499138948436589767L;
        lx.hwps[35] = 4320417555116951285L;
        lx.hwps[36] = 6651741667120180101L;
        lx.hwps[37] = 2955277828633776249L;
        lx.hwps[38] = -3013772878295931702L;
        lx.hwps[39] = 7515327755033839561L;
        lx.hwps[40] = 42936332601307271L;
        lx.hwps[41] = -6962844624061366970L;
        lx.hwps[42] = -8405766723395729852L;
        lx.hwps[43] = -7040349517100966554L;
        lx.hwps[44] = -3533733149835738446L;
        lx.hwps[45] = -3454941072750725750L;
        lx.hwps[46] = -9021111465478949201L;
        lx.hwps[47] = 8615408228051965587L;
        lx.hwps[48] = -7909152321590907425L;
        lx.hwps[49] = -3693882112205852455L;
        lx.hwps[50] = -3241140226000878276L;
        lx.hwps[51] = -4411948775430006371L;
        lx.hwps[52] = -941041030345360722L;
        lx.hwps[53] = -6294040695373742698L;
        lx.hwps[54] = -4364383784039550780L;
        lx.hwps[55] = 687955105276368663L;
        lx.hwps[56] = -3220497157065637040L;
        lx.hwps[57] = 8906652670104051391L;
        lx.hwps[58] = 5962580711117366351L;
        lx.hwps[59] = -6243054487093301243L;
        lx.hwps[60] = -6327362087214604442L;
        lx.hwps[61] = -5715054432546161480L;
        lx.hwps[62] = -1963988587207616057L;
        lx.hwps[63] = 1234623490707979893L;
        lx.hwps[64] = -302315490561302995L;
        lx.hwps[65] = -2582076307796526600L;
        lx.hwps[66] = 2315198376754266603L;
        lx.hwps[67] = 748303072395774449L;
        lx.hwps[68] = -1667110143443065959L;
        lx.hwps[69] = 7088572451746499999L;
        lx.hwps[70] = -3780361169993826845L;
        lx.hwps[71] = -3026993620213368833L;
        lx.hwps[72] = 1813124550399021958L;
        lx.hwps[73] = -9194831622978960583L;
        lx.hwps[74] = -3619625109929438692L;
        lx.hwps[75] = 4325149520559919806L;
        lx.hwps[76] = -9215705587334764034L;
        lx.hwps[77] = -2199146195798387049L;
        lx.hwps[78] = -57747617000809244L;
        lx.hwps[79] = 8696208924064347316L;
        lx.hwps[80] = 7561833730287910058L;
        lx.hwps[81] = -4942845809370724710L;
        lx.hwps[82] = 7353754048524808703L;
        lx.hwps[83] = 3658301267078027778L;
        lx.hwps[84] = -5858328030032578908L;
        lx.hwps[85] = -3127514607889795163L;
        lx.hwps[86] = -4179648930954365790L;
        lx.hwps[87] = -391452484744100094L;
        lx.hwps[88] = -6637897129984379886L;
        lx.hwps[89] = -9017574031025085801L;
        lx.hwps[90] = -6890528562953630379L;
        lx.hwps[91] = 7296136243357187069L;
        lx.hwps[92] = -8934085687985395765L;
        lx.hwps[93] = -2420594234060808241L;
        lx.hwps[94] = 4336413000585479572L;
        lx.hwps[95] = -4906045618680087549L;
        lx.hwps[96] = 4755672928864038422L;
        lx.hwps[97] = -8530933330934969896L;
        lx.hwps[98] = -5435927158650011046L;
        lx.hwps[99] = 4985344893427415657L;
    }

    private static /* synthetic */ void hxhe() {
        lx.hwpl[200] = -1017912026;
        lx.hwpl[201] = 259966270;
        lx.hwpl[202] = -96700474;
        lx.hwpl[203] = 1016364549;
        lx.hwpl[204] = -1866432112;
        lx.hwpl[205] = 1999887130;
        lx.hwpl[206] = -1839879947;
        lx.hwpl[207] = 1730865318;
        lx.hwpl[208] = -1372468309;
        lx.hwpl[209] = -401690204;
        lx.hwpl[210] = 815642227;
        lx.hwpl[211] = 39092191;
        lx.hwpl[212] = 872156810;
        lx.hwpl[213] = 1235805176;
        lx.hwpl[214] = -1668698017;
        lx.hwpl[215] = 634287727;
        lx.hwpl[216] = 1403225673;
        lx.hwpl[217] = 197210311;
        lx.hwpl[218] = 1297795918;
        lx.hwpl[219] = 827160117;
        lx.hwpl[220] = 1095508285;
        lx.hwpl[221] = 643134846;
        lx.hwpl[222] = -1979668828;
        lx.hwpl[223] = 1484065267;
        lx.hwpl[224] = -1916297108;
        lx.hwpl[225] = -1514227801;
        lx.hwpl[226] = -1582750683;
        lx.hwpl[227] = 137715541;
        lx.hwpl[228] = -545207489;
        lx.hwpl[229] = 2033836176;
        lx.hwpl[230] = -407001909;
        lx.hwpl[231] = -1581996750;
        lx.hwpl[232] = 288991862;
        lx.hwpl[233] = 1674448681;
        lx.hwpl[234] = 1773584089;
        lx.hwpl[235] = 1299810832;
        lx.hwpl[236] = 1652424283;
        lx.hwpl[237] = -2094291918;
        lx.hwpl[238] = -1509268422;
        lx.hwpl[239] = -1069637060;
        lx.hwpl[240] = -109322480;
        lx.hwpl[241] = 1666682384;
        lx.hwpl[242] = -1732385279;
        lx.hwpl[243] = 1571682093;
        lx.hwpl[244] = 1185068929;
        lx.hwpl[245] = -1891231210;
        lx.hwpl[246] = 1388341444;
        lx.hwpl[247] = -5911247;
        lx.hwpl[248] = -2062620913;
        lx.hwpl[249] = 1438083831;
        lx.hwpl[250] = 1486092228;
        lx.hwpl[251] = 794672061;
        lx.hwpl[252] = -920943991;
        lx.hwpl[253] = -1879265474;
        lx.hwpl[254] = -1111509343;
        lx.hwpl[255] = -437725619;
        lx.hwpl[256] = -1205741632;
        lx.hwpl[257] = -614643879;
        lx.hwpl[258] = -1501410353;
        lx.hwpl[259] = -467698517;
        lx.hwpl[260] = -19647872;
        lx.hwpl[261] = -1281369729;
        lx.hwpl[262] = -901893973;
        lx.hwpl[263] = -1256232080;
        lx.hwpl[264] = 575372478;
        lx.hwpl[265] = 2075541454;
        lx.hwpl[266] = 1574072015;
        lx.hwpl[267] = -1851928373;
        lx.hwpl[268] = 674324134;
        lx.hwpl[269] = -1681954432;
        lx.hwpl[270] = 1127890940;
        lx.hwpl[271] = 1948465856;
        lx.hwpl[272] = -165120149;
        lx.hwpl[273] = -220644848;
        lx.hwpl[274] = 459568806;
        lx.hwpl[275] = -1395906416;
        lx.hwpl[276] = 301739812;
        lx.hwpl[277] = -486850067;
        lx.hwpl[278] = -1925494214;
        lx.hwpl[279] = -984296826;
        lx.hwpl[280] = -225918547;
        lx.hwpl[281] = -2120931724;
        lx.hwpl[282] = -1341514960;
        lx.hwpl[283] = -445162723;
        lx.hwpl[284] = -2142860105;
        lx.hwpl[285] = -1914167254;
        lx.hwpl[286] = 993603629;
        lx.hwpl[287] = 1672851791;
        lx.hwpl[288] = 1457012698;
        lx.hwpl[289] = -2040546200;
        lx.hwpl[290] = 1376456254;
        lx.hwpl[291] = -109592519;
        lx.hwpl[292] = 1165409709;
        lx.hwpl[293] = -1254301346;
        lx.hwpl[294] = 1347457046;
        lx.hwpl[295] = 1622305464;
        lx.hwpl[296] = 1915755552;
        lx.hwpl[297] = -727000952;
        lx.hwpl[298] = 1740971932;
        lx.hwpl[299] = 258403445;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void putMatrix(ByteBuffer var0, Matrix4f var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lx.pd - lx.hwpm("hxaz", hwpq(int ), (int)26)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == lx.hwpm("hxba", hwpj(int ), (int)268)) break;
            v0 /* !! */  = (long)lx.hwpm("hxbb", hwpj(int ), (int)269);
        }
        var4_2 = lx.c;
        v1 /* !! */  = lx.pd;
        if (true) ** GOTO lbl11
        block88: while (true) {
            v1 /* !! */  = (long)(v2 - lx.hwpm("hxbc", hwpq(int ), (int)27));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1074462736: {
                    v2 = lx.hwpm("hxbd", hwpq(int ), (int)28);
                    continue block88;
                }
                case -524049663: {
                    v2 = lx.hwpm("hxbe", hwpq(int ), (int)29);
                    continue block88;
                }
                case 1610330881: {
                    break block88;
                }
                case 1774280403: {
                    v2 = lx.hwpm("hxbf", hwpq(int ), (int)30);
                    continue block88;
                }
            }
            break;
        }
        var3_3 /* !! */  = lx.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = lx.pd - lx.hwpm("hxbg", hwpq(int ), (int)31)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == lx.hwpm("hxbh", hwpj(int ), (int)270)) break;
            v3 /* !! */  = (long)lx.hwpm("hxbi", hwpj(int ), (int)271);
        }
        var2_4 = lx.a;
        if (var4_2) {
            throw null;
lbl32:
            // 6 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl32
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = lx.pd - lx.hwpm("hxbj", hwpq(int ), (int)32)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == lx.hwpm("hxbk", hwpj(int ), (int)272)) break;
            v4 /* !! */  = (long)lx.hwpm("hxbl", hwpj(int ), (int)273);
        }
        v5 = var1_1.m00();
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_3 = lx.pd - lx.hwpm("hxbm", hwpq(int ), (int)33)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == lx.hwpm("hxbn", hwpj(int ), (int)274)) break;
            v6 /* !! */  = (long)lx.hwpm("hxbo", hwpj(int ), (int)275);
        }
        v7 = var0.putFloat(v5);
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_4 = lx.pd - lx.hwpm("hxbp", hwpq(int ), (int)34)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == lx.hwpm("hxbq", hwpj(int ), (int)276)) break;
            v8 /* !! */  = (long)lx.hwpm("hxbr", hwpj(int ), (int)277);
        }
        v9 = var1_1.m01();
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_5 = lx.pd - lx.hwpm("hxbs", hwpq(int ), (int)35)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == lx.hwpm("hxbt", hwpj(int ), (int)278)) break;
            v10 /* !! */  = (long)lx.hwpm("hxbu", hwpj(int ), (int)279);
        }
        v11 = v7.putFloat(v9);
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_6 = lx.pd - lx.hwpm("hxbv", hwpq(int ), (int)36)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == lx.hwpm("hxbw", hwpj(int ), (int)280)) break;
            v12 /* !! */  = (long)lx.hwpm("hxbx", hwpj(int ), (int)281);
        }
        v13 = var1_1.m02();
        v14 /* !! */  = lx.pd;
        if (true) ** GOTO lbl69
        block96: while (true) {
            v14 /* !! */  = (long)(lx.hwpm("hxbz", hwpq(int ), (int)38) - lx.hwpm("hxby", hwpq(int ), (int)37));
lbl69:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1383050400: {
                    continue block96;
                }
                case 1610330881: {
                    break block96;
                }
            }
            break;
        }
        v15 = v11.putFloat(v13);
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_7 = lx.pd - lx.hwpm("hxca", hwpq(int ), (int)39)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v16 /* !! */  == lx.hwpm("hxcb", hwpj(int ), (int)282)) break;
            v16 /* !! */  = (long)lx.hwpm("hxcc", hwpj(int ), (int)283);
        }
        v17 = var1_1.m03();
        v18 /* !! */  = lx.pd;
        if (true) ** GOTO lbl85
        block98: while (true) {
            v18 /* !! */  = (long)(v19 - lx.hwpm("hxcd", hwpq(int ), (int)40));
lbl85:
            // 2 sources

            switch ((int)v18 /* !! */ ) {
                case -1121732621: {
                    v19 = lx.hwpm("hxce", hwpq(int ), (int)41);
                    continue block98;
                }
                case 163512884: {
                    v19 = lx.hwpm("hxcf", hwpq(int ), (int)42);
                    continue block98;
                }
                case 1610330881: {
                    break block98;
                }
                case 1629698082: {
                    v19 = lx.hwpm("hxcg", hwpq(int ), (int)43);
                    continue block98;
                }
            }
            break;
        }
        v15.putFloat(v17);
        if (var2_4 || var2_4) ** GOTO lbl32
        while (true) {
            if ((v20 /* !! */  = (cfr_temp_8 = lx.pd - lx.hwpm("hxch", hwpq(int ), (int)44)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v20 /* !! */  == lx.hwpm("hxci", hwpj(int ), (int)284)) break;
            v20 /* !! */  = (long)lx.hwpm("hxcj", hwpj(int ), (int)285);
        }
        v21 = var1_1.m10();
        while (true) {
            if ((v22 /* !! */  = (cfr_temp_9 = lx.pd - lx.hwpm("hxck", hwpq(int ), (int)45)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v22 /* !! */  == lx.hwpm("hxcl", hwpj(int ), (int)286)) break;
            v22 /* !! */  = (long)lx.hwpm("hxcm", hwpj(int ), (int)287);
        }
        v23 = var0.putFloat(v21);
        while (true) {
            if ((v24 /* !! */  = (cfr_temp_10 = lx.pd - lx.hwpm("hxcn", hwpq(int ), (int)46)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
            if (v24 /* !! */  == lx.hwpm("hxco", hwpj(int ), (int)288)) break;
            v24 /* !! */  = (long)lx.hwpm("hxcp", hwpj(int ), (int)289);
        }
        v25 = var1_1.m11();
        v26 /* !! */  = lx.pd;
        if (true) ** GOTO lbl122
        block102: while (true) {
            v26 /* !! */  = (long)(lx.hwpm("hxcr", hwpq(int ), (int)48) - lx.hwpm("hxcq", hwpq(int ), (int)47));
lbl122:
            // 2 sources

            switch ((int)v26 /* !! */ ) {
                case 1153581313: {
                    continue block102;
                }
                case 1610330881: {
                    break block102;
                }
            }
            break;
        }
        v27 = v23.putFloat(v25);
        while (true) {
            if ((v28 /* !! */  = (cfr_temp_11 = lx.pd - lx.hwpm("hxcs", hwpq(int ), (int)49)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
            if (v28 /* !! */  == lx.hwpm("hxct", hwpj(int ), (int)290)) break;
            v28 /* !! */  = (long)lx.hwpm("hxcu", hwpj(int ), (int)291);
        }
        v29 = var1_1.m12();
        v30 /* !! */  = lx.pd;
        if (true) ** GOTO lbl138
        block104: while (true) {
            v30 /* !! */  = (long)(lx.hwpm("hxcw", hwpq(int ), (int)51) - lx.hwpm("hxcv", hwpq(int ), (int)50));
lbl138:
            // 2 sources

            switch ((int)v30 /* !! */ ) {
                case -1680799671: {
                    continue block104;
                }
                case 1610330881: {
                    break block104;
                }
            }
            break;
        }
        v31 = v27.putFloat(v29);
        v32 /* !! */  = lx.pd;
        if (true) ** GOTO lbl148
        block105: while (true) {
            v32 /* !! */  = (long)(lx.hwpm("hxcy", hwpq(int ), (int)53) - lx.hwpm("hxcx", hwpq(int ), (int)52));
lbl148:
            // 2 sources

            switch ((int)v32 /* !! */ ) {
                case 1203695052: {
                    continue block105;
                }
                case 1610330881: {
                    break block105;
                }
            }
            break;
        }
        v33 = var1_1.m13();
        v34 /* !! */  = lx.pd;
        if (true) ** GOTO lbl158
        block106: while (true) {
            v34 /* !! */  = (long)(lx.hwpm("hxda", hwpq(int ), (int)55) - lx.hwpm("hxcz", hwpq(int ), (int)54));
lbl158:
            // 2 sources

            switch ((int)v34 /* !! */ ) {
                case 1610330881: {
                    break block106;
                }
                case 2043959863: {
                    continue block106;
                }
            }
            break;
        }
        v31.putFloat(v33);
        if (var2_4 || var2_4) ** GOTO lbl32
        v35 /* !! */  = lx.pd;
        if (true) ** GOTO lbl170
        block107: while (true) {
            v35 /* !! */  = (long)(lx.hwpm("hxdc", hwpq(int ), (int)57) - lx.hwpm("hxdb", hwpq(int ), (int)56));
lbl170:
            // 2 sources

            switch ((int)v35 /* !! */ ) {
                case -1834787880: {
                    continue block107;
                }
                case 1610330881: {
                    break block107;
                }
            }
            break;
        }
        v36 = var1_1.m20();
        while (true) {
            if ((v37 /* !! */  = (cfr_temp_12 = lx.pd - lx.hwpm("hxdd", hwpq(int ), (int)58)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
            if (v37 /* !! */  == lx.hwpm("hxde", hwpj(int ), (int)292)) break;
            v37 /* !! */  = (long)lx.hwpm("hxdf", hwpj(int ), (int)293);
        }
        v38 = var0.putFloat(v36);
        while (true) {
            if ((v39 /* !! */  = (cfr_temp_13 = lx.pd - lx.hwpm("hxdg", hwpq(int ), (int)59)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
            if (v39 /* !! */  == lx.hwpm("hxdh", hwpj(int ), (int)294)) break;
            v39 /* !! */  = (long)lx.hwpm("hxdi", hwpj(int ), (int)295);
        }
        v40 = var1_1.m21();
        while (true) {
            if ((v41 /* !! */  = (cfr_temp_14 = lx.pd - lx.hwpm("hxdj", hwpq(int ), (int)60)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
            if (v41 /* !! */  == lx.hwpm("hxdk", hwpj(int ), (int)296)) break;
            v41 /* !! */  = (long)lx.hwpm("hxdl", hwpj(int ), (int)297);
        }
        v42 = v38.putFloat(v40);
        v43 /* !! */  = lx.pd;
        if (true) ** GOTO lbl198
        block111: while (true) {
            v43 /* !! */  = (long)(v44 - lx.hwpm("hxdm", hwpq(int ), (int)61));
lbl198:
            // 2 sources

            switch ((int)v43 /* !! */ ) {
                case 416302525: {
                    v44 = lx.hwpm("hxdn", hwpq(int ), (int)62);
                    continue block111;
                }
                case 1610330881: {
                    break block111;
                }
                case 1976937845: {
                    v44 = lx.hwpm("hxdo", hwpq(int ), (int)63);
                    continue block111;
                }
            }
            break;
        }
        v45 = var1_1.m22();
        while (true) {
            if ((v46 /* !! */  = (cfr_temp_15 = lx.pd - lx.hwpm("hxdp", hwpq(int ), (int)64)) == 0L ? 0 : (cfr_temp_15 < 0L ? -1 : 1)) == false) continue;
            if (v46 /* !! */  == lx.hwpm("hxdq", hwpj(int ), (int)298)) break;
            v46 /* !! */  = (long)lx.hwpm("hxdr", hwpj(int ), (int)299);
        }
        v47 = v42.putFloat(v45);
        while (true) {
            if ((v48 /* !! */  = (cfr_temp_16 = lx.pd - lx.hwpm("hxds", hwpq(int ), (int)65)) == 0L ? 0 : (cfr_temp_16 < 0L ? -1 : 1)) == false) continue;
            if (v48 /* !! */  == lx.hwpm("hxdt", hwpj(int ), (int)300)) break;
            v48 /* !! */  = (long)lx.hwpm("hxdu", hwpj(int ), (int)301);
        }
        v49 = var1_1.m23();
        v50 /* !! */  = lx.pd;
        if (true) ** GOTO lbl224
        block114: while (true) {
            v50 /* !! */  = (long)(lx.hwpm("hxdw", hwpq(int ), (int)67) - lx.hwpm("hxdv", hwpq(int ), (int)66));
lbl224:
            // 2 sources

            switch ((int)v50 /* !! */ ) {
                case -13534078: {
                    continue block114;
                }
                case 1610330881: {
                    break block114;
                }
            }
            break;
        }
        v47.putFloat(v49);
        if (var2_4 || var2_4) ** GOTO lbl32
        v51 /* !! */  = lx.pd;
        if (true) ** GOTO lbl236
        block115: while (true) {
            v51 /* !! */  = (long)(v52 - lx.hwpm("hxdx", hwpq(int ), (int)68));
lbl236:
            // 2 sources

            switch ((int)v51 /* !! */ ) {
                case -1328100484: {
                    v52 = lx.hwpm("hxdy", hwpq(int ), (int)69);
                    continue block115;
                }
                case 1610330881: {
                    break block115;
                }
                case 1631329401: {
                    v52 = lx.hwpm("hxdz", hwpq(int ), (int)70);
                    continue block115;
                }
            }
            break;
        }
        v53 = var1_1.m30();
        while (true) {
            if ((v54 /* !! */  = (cfr_temp_17 = lx.pd - lx.hwpm("hxea", hwpq(int ), (int)71)) == 0L ? 0 : (cfr_temp_17 < 0L ? -1 : 1)) == false) continue;
            if (v54 /* !! */  == lx.hwpm("hxeb", hwpj(int ), (int)302)) break;
            v54 /* !! */  = (long)lx.hwpm("hxec", hwpj(int ), (int)303);
        }
        v55 = var0.putFloat(v53);
        v56 /* !! */  = lx.pd;
        if (true) ** GOTO lbl256
        block117: while (true) {
            v56 /* !! */  = (long)(lx.hwpm("hxee", hwpq(int ), (int)73) - lx.hwpm("hxed", hwpq(int ), (int)72));
lbl256:
            // 2 sources

            switch ((int)v56 /* !! */ ) {
                case -1341448978: {
                    continue block117;
                }
                case 1610330881: {
                    break block117;
                }
            }
            break;
        }
        v57 = var1_1.m31();
        v58 /* !! */  = lx.pd;
        if (true) ** GOTO lbl266
        block118: while (true) {
            v58 /* !! */  = (long)(v59 - lx.hwpm("hxef", hwpq(int ), (int)74));
lbl266:
            // 2 sources

            switch ((int)v58 /* !! */ ) {
                case -1485738339: {
                    v59 = lx.hwpm("hxeg", hwpq(int ), (int)75);
                    continue block118;
                }
                case -1109903193: {
                    v59 = lx.hwpm("hxeh", hwpq(int ), (int)76);
                    continue block118;
                }
                case 1610330881: {
                    break block118;
                }
            }
            break;
        }
        v60 = v55.putFloat(v57);
        v61 /* !! */  = lx.pd;
        if (true) ** GOTO lbl280
        block119: while (true) {
            v61 /* !! */  = (long)(lx.hwpm("hxej", hwpq(int ), (int)78) - lx.hwpm("hxei", hwpq(int ), (int)77));
lbl280:
            // 2 sources

            switch ((int)v61 /* !! */ ) {
                case 875244648: {
                    continue block119;
                }
                case 1610330881: {
                    break block119;
                }
            }
            break;
        }
        v62 = var1_1.m32();
        while (true) {
            if ((v63 /* !! */  = (cfr_temp_18 = lx.pd - lx.hwpm("hxek", hwpq(int ), (int)79)) == 0L ? 0 : (cfr_temp_18 < 0L ? -1 : 1)) == false) continue;
            if (v63 /* !! */  == lx.hwpm("hxel", hwpj(int ), (int)304)) break;
            v63 /* !! */  = (long)lx.hwpm("hxem", hwpj(int ), (int)305);
        }
        v64 = v60.putFloat(v62);
        v65 /* !! */  = lx.pd;
        if (true) ** GOTO lbl296
        block121: while (true) {
            v65 /* !! */  = (long)(v66 - lx.hwpm("hxen", hwpq(int ), (int)80));
lbl296:
            // 2 sources

            switch ((int)v65 /* !! */ ) {
                case -1930699501: {
                    v66 = lx.hwpm("hxeo", hwpq(int ), (int)81);
                    continue block121;
                }
                case -1509248305: {
                    v66 = lx.hwpm("hxep", hwpq(int ), (int)82);
                    continue block121;
                }
                case -115181381: {
                    v66 = lx.hwpm("hxeq", hwpq(int ), (int)83);
                    continue block121;
                }
                case 1610330881: {
                    break block121;
                }
            }
            break;
        }
        v67 = var1_1.m33();
        v68 /* !! */  = lx.pd;
        if (true) ** GOTO lbl313
        block122: while (true) {
            v68 /* !! */  = (long)(lx.hwpm("hxes", hwpq(int ), (int)85) - lx.hwpm("hxer", hwpq(int ), (int)84));
lbl313:
            // 2 sources

            switch ((int)v68 /* !! */ ) {
                case -1041658872: {
                    continue block122;
                }
                case 1610330881: {
                    break block122;
                }
            }
            break;
        }
        v64.putFloat(v67);
        if (var2_4) ** GOTO lbl32
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
lbl327:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)lx.hwpm("hxet", hwpj(int ), (int)306);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl352
            }
            case 1: {
                var3_3 /* !! */  = (int)lx.hwpm("hxeu", hwpj(int ), (int)307);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl347
            }
lbl337:
            // 3 sources

            case 2: {
                var3_3 /* !! */  = (int)lx.hwpm("hxev", hwpj(int ), (int)308);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl373
            }
lbl342:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)lx.hwpm("hxew", hwpj(int ), (int)309);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl352
            }
lbl347:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)lx.hwpm("hxex", hwpj(int ), (int)310);
                    if (!var4_2) ** GOTO lbl342
                    throw null;
                }
            }
lbl352:
            // 4 sources

            case 5: {
                var3_3 /* !! */  = (int)lx.hwpm("hxey", hwpj(int ), (int)311);
                if (!var4_2) ** GOTO lbl327
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)lx.hwpm("hxez", hwpj(int ), (int)312);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl365
            }
            case 7: {
                var3_3 /* !! */  = (int)lx.hwpm("hxfa", hwpj(int ), (int)313);
                if (!var4_2) ** GOTO lbl337
                throw null;
            }
lbl365:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)lx.hwpm("hxfb", hwpj(int ), (int)314);
                if (!var4_2) ** GOTO lbl337
                throw null;
            }
            case 9: {
                var3_3 /* !! */  = (int)lx.hwpm("hxfc", hwpj(int ), (int)315);
                if (!var4_2) ** GOTO lbl352
                throw null;
            }
lbl373:
            // 2 sources

            case 10: {
                var3_3 /* !! */  = (int)lx.hwpm("hxfd", hwpj(int ), (int)316);
                if (!var4_2) break;
                throw null;
            }
            case 11: 
        }
        var3_3 /* !! */  = (int)lx.hwpm("hxfe", hwpj(int ), (int)317);
        ** while (!var4_2)
lbl380:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hxhj() {
        lx.hwps[100] = -8599660124825367410L;
        lx.hwps[101] = 7653069702792851998L;
        lx.hwps[102] = 508610394116673534L;
        lx.hwps[103] = 2874461135453451794L;
        lx.hwps[104] = 2229808762750620132L;
        lx.hwps[105] = 5382731176807913217L;
        lx.hwps[106] = -428193856130949307L;
        lx.hwps[107] = -8119990566598028359L;
        lx.hwps[108] = 4652362959588721378L;
    }

    private static /* synthetic */ void hxha() {
        lx.hwpk[200] = -1017911959;
        lx.hwpk[201] = 259966254;
        lx.hwpk[202] = -96700480;
        lx.hwpk[203] = 1016364553;
        lx.hwpk[204] = -1866432057;
        lx.hwpk[205] = 1999887168;
        lx.hwpk[206] = -1839879947;
        lx.hwpk[207] = 1730865292;
        lx.hwpk[208] = -1372468259;
        lx.hwpk[209] = -401690214;
        lx.hwpk[210] = 815642222;
        lx.hwpk[211] = 39092213;
        lx.hwpk[212] = 872156833;
        lx.hwpk[213] = 1235805087;
        lx.hwpk[214] = -1668697891;
        lx.hwpk[215] = 634287628;
        lx.hwpk[216] = 1403225659;
        lx.hwpk[217] = 197210306;
        lx.hwpk[218] = 1297795879;
        lx.hwpk[219] = 827160170;
        lx.hwpk[220] = 1095508409;
        lx.hwpk[221] = 643134844;
        lx.hwpk[222] = -1979668859;
        lx.hwpk[223] = 1484065210;
        lx.hwpk[224] = -1916297130;
        lx.hwpk[225] = -1514227838;
        lx.hwpk[226] = -1582750599;
        lx.hwpk[227] = 137715531;
        lx.hwpk[228] = -545207364;
        lx.hwpk[229] = 2033836220;
        lx.hwpk[230] = -407001965;
        lx.hwpk[231] = -1581996778;
        lx.hwpk[232] = 288991839;
        lx.hwpk[233] = 1674448681;
        lx.hwpk[234] = 1773584089;
        lx.hwpk[235] = 1299810832;
        lx.hwpk[236] = 1652424275;
        lx.hwpk[237] = -2094291782;
        lx.hwpk[238] = -1509268462;
        lx.hwpk[239] = -1069637077;
        lx.hwpk[240] = -109322489;
        lx.hwpk[241] = 1666682391;
        lx.hwpk[242] = -1732385259;
        lx.hwpk[243] = 1571682102;
        lx.hwpk[244] = 1185068939;
        lx.hwpk[245] = -1891231230;
        lx.hwpk[246] = 1388341442;
        lx.hwpk[247] = -5911258;
        lx.hwpk[248] = -2062620919;
        lx.hwpk[249] = 1438083834;
        lx.hwpk[250] = 1486092235;
        lx.hwpk[251] = 794672057;
        lx.hwpk[252] = -920943976;
        lx.hwpk[253] = -1879265483;
        lx.hwpk[254] = -1111509328;
        lx.hwpk[255] = -437725627;
        lx.hwpk[256] = -1205741624;
        lx.hwpk[257] = -614643879;
        lx.hwpk[258] = -1501410365;
        lx.hwpk[259] = -467698523;
        lx.hwpk[260] = -19647849;
        lx.hwpk[261] = -1281369738;
        lx.hwpk[262] = -901893957;
        lx.hwpk[263] = -1256232093;
        lx.hwpk[264] = 575372477;
        lx.hwpk[265] = 2075541463;
        lx.hwpk[266] = 1574072027;
        lx.hwpk[267] = -1851928380;
        lx.hwpk[268] = 674324135;
        lx.hwpk[269] = -2090661252;
        lx.hwpk[270] = -1127890941;
        lx.hwpk[271] = -1431940111;
        lx.hwpk[272] = 165120148;
        lx.hwpk[273] = -1876454813;
        lx.hwpk[274] = -459568807;
        lx.hwpk[275] = -970196629;
        lx.hwpk[276] = -301739813;
        lx.hwpk[277] = 1335864463;
        lx.hwpk[278] = 1925494213;
        lx.hwpk[279] = 1571416831;
        lx.hwpk[280] = 225918546;
        lx.hwpk[281] = -22570748;
        lx.hwpk[282] = -1341514959;
        lx.hwpk[283] = -186327813;
        lx.hwpk[284] = -2142860106;
        lx.hwpk[285] = 980185802;
        lx.hwpk[286] = -993603630;
        lx.hwpk[287] = -954806096;
        lx.hwpk[288] = -1457012699;
        lx.hwpk[289] = 2031953423;
        lx.hwpk[290] = 1376456255;
        lx.hwpk[291] = 1425836706;
        lx.hwpk[292] = -1165409710;
        lx.hwpk[293] = -1873703250;
        lx.hwpk[294] = 1347457047;
        lx.hwpk[295] = -444074462;
        lx.hwpk[296] = -1915755553;
        lx.hwpk[297] = -235146289;
        lx.hwpk[298] = -1740971933;
        lx.hwpk[299] = 1036230143;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void begin(boolean var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lx.pd - lx.hwpm("hwqw", hwpq(int ), (int)11)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == lx.hwpm("hwqx", hwpj(int ), (int)21)) break;
            v0 /* !! */  = (long)lx.hwpm("hwqy", hwpj(int ), (int)22);
        }
        var3_1 = lx.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = lx.pd - lx.hwpm("hwqz", hwpq(int ), (int)12)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == lx.hwpm("hwra", hwpj(int ), (int)23)) break;
            v1 /* !! */  = (long)lx.hwpm("hwrb", hwpj(int ), (int)24);
        }
        var2_2 /* !! */  = lx.b;
        v2 /* !! */  = lx.pd;
        if (true) ** GOTO lbl17
        block29: while (true) {
            v2 /* !! */  = (long)(v3 - lx.hwpm("hwrc", hwpq(int ), (int)13));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -767603158: {
                    v3 = lx.hwpm("hwrd", hwpq(int ), (int)14);
                    continue block29;
                }
                case -716753285: {
                    v3 = lx.hwpm("hwre", hwpq(int ), (int)15);
                    continue block29;
                }
                case 1610330881: {
                    break block29;
                }
            }
            break;
        }
        var1_3 = lx.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
lbl32:
                    // 4 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl32
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = lx.pd - lx.hwpm("hwrf", hwpq(int ), (int)16)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == lx.hwpm("hwrg", hwpj(int ), (int)25)) break;
                    v4 /* !! */  = (long)lx.hwpm("hwrh", hwpj(int ), (int)26);
                }
                lx.init();
                if (var1_3 || var1_3) ** GOTO lbl32
                v5 = lx.hwpm("hwri", hwpj(int ), (int)27);
                v6 /* !! */  = lx.pd;
                if (true) ** GOTO lbl47
                block32: while (true) {
                    v6 /* !! */  = (long)(v7 - lx.hwpm("hwrj", hwpq(int ), (int)17));
lbl47:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -41428316: {
                            v7 = lx.hwpm("hwrk", hwpq(int ), (int)18);
                            continue block32;
                        }
                        case 93795239: {
                            v7 = lx.hwpm("hwrl", hwpq(int ), (int)19);
                            continue block32;
                        }
                        case 509794415: {
                            v7 = lx.hwpm("hwrm", hwpq(int ), (int)20);
                            continue block32;
                        }
                        case 1610330881: {
                            break block32;
                        }
                    }
                    break;
                }
                lx.ringCount = (int)v5;
                if (var1_3 || var1_3) ** GOTO lbl32
                v8 /* !! */  = lx.pd;
                if (true) ** GOTO lbl65
                block33: while (true) {
                    v8 /* !! */  = (long)(lx.hwpm("hwro", hwpq(int ), (int)22) - lx.hwpm("hwrn", hwpq(int ), (int)21));
lbl65:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case 1610330881: {
                            break block33;
                        }
                        case 2014832919: {
                            continue block33;
                        }
                    }
                    break;
                }
                lx.batchIgnoreDepth = var0;
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)lx.hwpm("hwrp", hwpj(int ), (int)28);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl91
            }
lbl78:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)lx.hwpm("hwrq", hwpj(int ), (int)29);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl101
            }
lbl83:
            // 3 sources

            case 2: {
                var2_2 /* !! */  = (int)lx.hwpm("hwrr", hwpj(int ), (int)30);
                if (!var3_1) ** GOTO lbl78
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)lx.hwpm("hwrs", hwpj(int ), (int)31);
                if (!var3_1) ** GOTO lbl83
                throw null;
            }
lbl91:
            // 3 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)lx.hwpm("hwrt", hwpj(int ), (int)32);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl105
                    break;
                }
            }
            case 5: {
                var2_2 /* !! */  = (int)lx.hwpm("hwru", hwpj(int ), (int)33);
                if (!var3_1) ** GOTO lbl83
                throw null;
            }
lbl101:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)lx.hwpm("hwrv", hwpj(int ), (int)34);
                if (!var3_1) ** GOTO lbl91
                throw null;
            }
lbl105:
            // 2 sources

            case 7: {
                do {
                    var2_2 /* !! */  = (int)lx.hwpm("hwrw", hwpj(int ), (int)35);
                } while (!var3_1);
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)lx.hwpm("hwrx", hwpj(int ), (int)36);
                if (!var3_1) ** GOTO lbl78
                throw null;
            }
            case 9: 
        }
        var2_2 /* !! */  = (int)lx.hwpm("hwry", hwpj(int ), (int)37);
        ** while (!var3_1)
lbl117:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hxhg() {
        lx.hwpr[0] = -4726545835876271629L;
        lx.hwpr[1] = 7010386117015961679L;
        lx.hwpr[2] = 5265514315807861748L;
        lx.hwpr[3] = 2166956965790187953L;
        lx.hwpr[4] = 191840991562803593L;
        lx.hwpr[5] = -3565462125886001277L;
        lx.hwpr[6] = -8914607354042217349L;
        lx.hwpr[7] = 2289661481141403863L;
        lx.hwpr[8] = 6556592467663048626L;
        lx.hwpr[9] = -3197506945485542917L;
        lx.hwpr[10] = 1957373915388349039L;
        lx.hwpr[11] = -4476063978590338965L;
        lx.hwpr[12] = 4150350949382440703L;
        lx.hwpr[13] = 2968239716222672400L;
        lx.hwpr[14] = 1904005082226144400L;
        lx.hwpr[15] = -234308494255704898L;
        lx.hwpr[16] = -6462232046490442722L;
        lx.hwpr[17] = 7614554000625567445L;
        lx.hwpr[18] = 7230640986908963816L;
        lx.hwpr[19] = 4180303967253024772L;
        lx.hwpr[20] = -4662183208952751056L;
        lx.hwpr[21] = -8200557749662114126L;
        lx.hwpr[22] = 2733936866593314575L;
        lx.hwpr[23] = -4091987561667561826L;
        lx.hwpr[24] = 3039016255653715565L;
        lx.hwpr[25] = -2581287625078041184L;
        lx.hwpr[26] = -1913667440762345598L;
        lx.hwpr[27] = 4788062559486160708L;
        lx.hwpr[28] = 3959041042339073253L;
        lx.hwpr[29] = -7559808415276570762L;
        lx.hwpr[30] = -6100519788393523853L;
        lx.hwpr[31] = -801274487684492337L;
        lx.hwpr[32] = 3733933183087704123L;
        lx.hwpr[33] = -2728492769972614967L;
        lx.hwpr[34] = 3649054288436469018L;
        lx.hwpr[35] = 1937492033547693310L;
        lx.hwpr[36] = 641700558951818665L;
        lx.hwpr[37] = -9045532218692259748L;
        lx.hwpr[38] = 1655174894773443839L;
        lx.hwpr[39] = -1538716245690362057L;
        lx.hwpr[40] = -5495743149929469908L;
        lx.hwpr[41] = 1439516115576895276L;
        lx.hwpr[42] = 5524170497183620440L;
        lx.hwpr[43] = -3792372812622821622L;
        lx.hwpr[44] = 8863523178009670299L;
        lx.hwpr[45] = 4311609777713256000L;
        lx.hwpr[46] = -720334409261771643L;
        lx.hwpr[47] = -1460718637952564331L;
        lx.hwpr[48] = 2086278801069173658L;
        lx.hwpr[49] = 8110837362023100302L;
        lx.hwpr[50] = 4150867126637217257L;
        lx.hwpr[51] = 113450149457649443L;
        lx.hwpr[52] = 3715651896657155014L;
        lx.hwpr[53] = 4462966174942475900L;
        lx.hwpr[54] = 8393587284399084734L;
        lx.hwpr[55] = -7263605544656910583L;
        lx.hwpr[56] = -4587581395358591430L;
        lx.hwpr[57] = 5693425226894840715L;
        lx.hwpr[58] = 3766681943650899743L;
        lx.hwpr[59] = 193210736705504200L;
        lx.hwpr[60] = 5086714442569109959L;
        lx.hwpr[61] = -6567897330065255867L;
        lx.hwpr[62] = -6614043956165475896L;
        lx.hwpr[63] = -3417842462250716715L;
        lx.hwpr[64] = 3144040005507090051L;
        lx.hwpr[65] = 8282699410401745995L;
        lx.hwpr[66] = -5445373262499504805L;
        lx.hwpr[67] = 5601129668689744710L;
        lx.hwpr[68] = 7809333020891309170L;
        lx.hwpr[69] = 1929374524039490862L;
        lx.hwpr[70] = 3766006947806331113L;
        lx.hwpr[71] = 3922804863770115215L;
        lx.hwpr[72] = -2351941039691235420L;
        lx.hwpr[73] = 5038565303178015873L;
        lx.hwpr[74] = -3330114093190072960L;
        lx.hwpr[75] = 8960226348075157439L;
        lx.hwpr[76] = 7004157922296800239L;
        lx.hwpr[77] = -6178125980900550265L;
        lx.hwpr[78] = 3526805571607047419L;
        lx.hwpr[79] = -6811887320563788947L;
        lx.hwpr[80] = 190854724694476157L;
        lx.hwpr[81] = 5444727916710827038L;
        lx.hwpr[82] = 6284465331727328733L;
        lx.hwpr[83] = 6182167810740992394L;
        lx.hwpr[84] = 3464166792949389521L;
        lx.hwpr[85] = 2334391462139181273L;
        lx.hwpr[86] = -8362856947919297019L;
        lx.hwpr[87] = -3466709494201028588L;
        lx.hwpr[88] = 7510203239009238462L;
        lx.hwpr[89] = 6532471064591596017L;
        lx.hwpr[90] = 4706599595227270535L;
        lx.hwpr[91] = -1190169080677469896L;
        lx.hwpr[92] = -316818527165556916L;
        lx.hwpr[93] = -5695467936257733701L;
        lx.hwpr[94] = 2400645741996778667L;
        lx.hwpr[95] = 1684507595769471554L;
        lx.hwpr[96] = 1950183439018189451L;
        lx.hwpr[97] = 1568757311268119466L;
        lx.hwpr[98] = 1552280925206123195L;
        lx.hwpr[99] = 1842238776925514409L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$init$1(int var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lx.pd - lx.hwpm("hxfs", hwpq(int ), (int)91)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == lx.hwpm("hxft", hwpj(int ), (int)326)) break;
            v0 /* !! */  = (long)lx.hwpm("hxfu", hwpj(int ), (int)327);
        }
        var3_1 = lx.c;
        v1 /* !! */  = lx.pd;
        if (true) ** GOTO lbl12
        block12: while (true) {
            v1 /* !! */  = (long)(v2 - lx.hwpm("hxfv", hwpq(int ), (int)92));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2091457658: {
                    v2 = lx.hwpm("hxfw", hwpq(int ), (int)93);
                    continue block12;
                }
                case 575569505: {
                    v2 = lx.hwpm("hxfx", hwpq(int ), (int)94);
                    continue block12;
                }
                case 1610330881: {
                    break block12;
                }
            }
            break;
        }
        var2_2 = lx.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = lx.pd - lx.hwpm("hxfy", hwpq(int ), (int)95)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == lx.hwpm("hxfz", hwpj(int ), (int)328)) break;
            v3 /* !! */  = (long)lx.hwpm("hxga", hwpj(int ), (int)329);
        }
        var1_3 = lx.a;
        if (var3_1) {
            throw null;
lbl31:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl34:
        // 1 sources

        v4 /* !! */  = lx.pd;
        if (true) ** GOTO lbl38
        block15: while (true) {
            v4 /* !! */  = (long)(v5 - lx.hwpm("hxgb", hwpq(int ), (int)96));
lbl38:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1950754660: {
                    v5 = lx.hwpm("hxgc", hwpq(int ), (int)97);
                    continue block15;
                }
                case 1008574520: {
                    v5 = lx.hwpm("hxgd", hwpq(int ), (int)98);
                    continue block15;
                }
                case 1601543165: {
                    v5 = lx.hwpm("hxge", hwpq(int ), (int)99);
                    continue block15;
                }
                case 1610330881: {
                    break block15;
                }
            }
            break;
        }
        return "Ring3D Uniforms " + var0;
    }

    private static /* synthetic */ void hxhb() {
        lx.hwpk[300] = -150026624;
        lx.hwpk[301] = 1127893025;
        lx.hwpk[302] = 1539584169;
        lx.hwpk[303] = 255901220;
        lx.hwpk[304] = -589966250;
        lx.hwpk[305] = -12191069;
        lx.hwpk[306] = 349955585;
        lx.hwpk[307] = -1289004605;
        lx.hwpk[308] = 1368845101;
        lx.hwpk[309] = 938435707;
        lx.hwpk[310] = 1650191993;
        lx.hwpk[311] = -1464430920;
        lx.hwpk[312] = -1302792057;
        lx.hwpk[313] = -864292092;
        lx.hwpk[314] = -2134826749;
        lx.hwpk[315] = -1071378330;
        lx.hwpk[316] = -970513659;
        lx.hwpk[317] = 1985651285;
        lx.hwpk[318] = -141168028;
        lx.hwpk[319] = 669744834;
        lx.hwpk[320] = -640296291;
        lx.hwpk[321] = -452142368;
        lx.hwpk[322] = 2116636882;
        lx.hwpk[323] = -1906780675;
        lx.hwpk[324] = 1455177736;
        lx.hwpk[325] = 1585004395;
        lx.hwpk[326] = -472444795;
        lx.hwpk[327] = 169793707;
        lx.hwpk[328] = 12974696;
        lx.hwpk[329] = 1795432465;
        lx.hwpk[330] = 878539580;
        lx.hwpk[331] = -1794756342;
        lx.hwpk[332] = -293271702;
        lx.hwpk[333] = 1900566057;
        lx.hwpk[334] = 4897401;
        lx.hwpk[335] = -2077927370;
        lx.hwpk[336] = 70328263;
        lx.hwpk[337] = -471499589;
        lx.hwpk[338] = -191044379;
        lx.hwpk[339] = 34416751;
    }

    private static /* synthetic */ int hwpj(int n2) {
        return hwpk[n2] ^ hwpl[n2];
    }

    static {
        hwpk = new int[340];
        hwpl = new int[340];
        lx.hxgy();
        lx.hxgz();
        lx.hxha();
        lx.hxhb();
        lx.hxhc();
        lx.hxhd();
        lx.hxhe();
        lx.hxhf();
        hwpr = new long[109];
        hwps = new long[109];
        lx.hxhg();
        lx.hxhh();
        lx.hxhi();
        lx.hxhj();
        mc = class_310.method_1551();
        projection = new Matrix4f();
        view = new Matrix4f();
        rings = new float[72];
        QUAD_U = new float[]{-1.0f, 1.0f, 1.0f, -1.0f, 1.0f, -1.0f};
        QUAD_V = new float[]{-1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f};
        inverseView = new Matrix4f();
        combined = new Matrix4f();
    }

    private static /* synthetic */ void hxhc() {
        lx.hwpl[0] = -1948467677;
        lx.hwpl[1] = -516299615;
        lx.hwpl[2] = 1167455965;
        lx.hwpl[3] = 63396287;
        lx.hwpl[4] = -1504906031;
        lx.hwpl[5] = 1058160905;
        lx.hwpl[6] = -1943927729;
        lx.hwpl[7] = -1808486646;
        lx.hwpl[8] = 1580691041;
        lx.hwpl[9] = -2029210826;
        lx.hwpl[10] = 1746615346;
        lx.hwpl[11] = 1313017165;
        lx.hwpl[12] = 1029047839;
        lx.hwpl[13] = -29597961;
        lx.hwpl[14] = -806899975;
        lx.hwpl[15] = -1468407349;
        lx.hwpl[16] = -1844875231;
        lx.hwpl[17] = -591839876;
        lx.hwpl[18] = -1218136001;
        lx.hwpl[19] = 12560403;
        lx.hwpl[20] = 510672534;
        lx.hwpl[21] = 293572453;
        lx.hwpl[22] = -1289710771;
        lx.hwpl[23] = 264895036;
        lx.hwpl[24] = 1039421203;
        lx.hwpl[25] = 520862207;
        lx.hwpl[26] = 405210499;
        lx.hwpl[27] = -1824479339;
        lx.hwpl[28] = -1849497340;
        lx.hwpl[29] = -1410944071;
        lx.hwpl[30] = -119028694;
        lx.hwpl[31] = 716328969;
        lx.hwpl[32] = -1716136413;
        lx.hwpl[33] = 940068157;
        lx.hwpl[34] = -381754099;
        lx.hwpl[35] = -1675548002;
        lx.hwpl[36] = -1446107438;
        lx.hwpl[37] = -200024466;
        lx.hwpl[38] = 687538947;
        lx.hwpl[39] = -226135491;
        lx.hwpl[40] = 1387873330;
        lx.hwpl[41] = 799499639;
        lx.hwpl[42] = -1181293166;
        lx.hwpl[43] = 1034131277;
        lx.hwpl[44] = 346663655;
        lx.hwpl[45] = 228491635;
        lx.hwpl[46] = -513952761;
        lx.hwpl[47] = -521638080;
        lx.hwpl[48] = -1572924809;
        lx.hwpl[49] = -1380931277;
        lx.hwpl[50] = 2108448498;
        lx.hwpl[51] = 754012916;
        lx.hwpl[52] = 1190737368;
        lx.hwpl[53] = 737511998;
        lx.hwpl[54] = -883184428;
        lx.hwpl[55] = -905101477;
        lx.hwpl[56] = -1833561789;
        lx.hwpl[57] = -392047592;
        lx.hwpl[58] = -344859113;
        lx.hwpl[59] = -1910711203;
        lx.hwpl[60] = -1032476338;
        lx.hwpl[61] = -424741945;
        lx.hwpl[62] = 951458877;
        lx.hwpl[63] = -30306820;
        lx.hwpl[64] = -542462151;
        lx.hwpl[65] = -364608622;
        lx.hwpl[66] = -173070244;
        lx.hwpl[67] = -1616251975;
        lx.hwpl[68] = 201365127;
        lx.hwpl[69] = -270372085;
        lx.hwpl[70] = 1161428169;
        lx.hwpl[71] = 1334606390;
        lx.hwpl[72] = -1930104880;
        lx.hwpl[73] = 2008492880;
        lx.hwpl[74] = 159143443;
        lx.hwpl[75] = -272178404;
        lx.hwpl[76] = -1574232875;
        lx.hwpl[77] = 1434268557;
        lx.hwpl[78] = -1463658701;
        lx.hwpl[79] = -754718914;
        lx.hwpl[80] = 272544212;
        lx.hwpl[81] = 1626347972;
        lx.hwpl[82] = -988431103;
        lx.hwpl[83] = -1381981232;
        lx.hwpl[84] = 1297110248;
        lx.hwpl[85] = 1997233391;
        lx.hwpl[86] = -1046723098;
        lx.hwpl[87] = 1189907622;
        lx.hwpl[88] = -1940739363;
        lx.hwpl[89] = -110377285;
        lx.hwpl[90] = 191995738;
        lx.hwpl[91] = -1101114914;
        lx.hwpl[92] = -937221492;
        lx.hwpl[93] = -699500473;
        lx.hwpl[94] = 1697731831;
        lx.hwpl[95] = -604121743;
        lx.hwpl[96] = -565645356;
        lx.hwpl[97] = -140743404;
        lx.hwpl[98] = -1678650599;
        lx.hwpl[99] = 694343620;
    }

    private static /* synthetic */ long hwpq(int n2) {
        return hwpr[n2] ^ hwps[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void init() {
        block61: {
            var5 = lx.c;
            var4_1 /* !! */  = lx.b;
            var3_2 = lx.a;
            if (var5) {
                throw null;
lbl6:
                // 14 sources

                return;
            }
            if (var3_2 || var3_2) ** GOTO lbl6
            if (lx.pipeline == null) break block61;
            if (var3_2 || var3_2) ** GOTO lbl6
            return;
        }
        if (var3_2 || var3_2) ** GOTO lbl6
        var0_3 = VertexFormat.builder().add("inPosition", VertexFormatElement.POSITION).build();
        if (var3_2 || var3_2) ** GOTO lbl6
        lx.pipeline = RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[0]).withLocation(class_2960.method_60655((String)"phobia", (String)"3d/ring3d")).withVertexShader(class_2960.method_60655((String)"phobia", (String)"3d/ring3d_vertex")).withFragmentShader(class_2960.method_60655((String)"phobia", (String)"3d/ring3d_fragment")).withVertexFormat(var0_3, VertexFormat.class_5596.field_27379).withUniform("Uniforms", class_10789.field_60031).withBlend(BlendFunction.ADDITIVE).withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST).withCull((boolean)lx.hwpm("hwzo", hwpj(int ), (int)233)).withDepthWrite((boolean)lx.hwpm("hwzp", hwpj(int ), (int)234)).build();
        if (var3_2 || var3_2) ** GOTO lbl6
        lx.uniformBuffers = new GpuBuffer[8];
        if (var3_2 || var3_2) ** GOTO lbl6
        var1_4 = lx.hwpm("hwzq", hwpj(int ), (int)235);
        if (var4_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_2) ** GOTO lbl6
                do {
                    if (var3_2 || var3_2) ** GOTO lbl6
                    if (var1_4 >= lx.hwpm("hwzr", hwpj(int ), (int)236)) ** GOTO lbl37
                    if (var3_2 || var3_2) ** GOTO lbl6
                    var2_5 = var1_4;
                    if (var3_2 || var3_2) ** GOTO lbl6
                    lx.uniformBuffers[var1_4] = RenderSystem.getDevice().createBuffer((Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$init$1(int ), ()Ljava/lang/String;)((int)var2_5), (int)lx.hwpm("hwzs", hwpj(int ), (int)237), (long)lx.hwpm("hwzt", hwpq(int ), (int)24));
                    if (var3_2 || var3_2) ** GOTO lbl6
                    ++var1_4;
                    if (var3_2) ** GOTO lbl6
                } while (!var5);
                throw null;
lbl37:
                // 1 sources

                if (var3_2 || var3_2) ** GOTO lbl6
                lx.vertexBuffer = RenderSystem.getDevice().createBuffer((Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$init$2(), ()Ljava/lang/String;)(), (int)lx.hwpm("hwzu", hwpj(int ), (int)238), (long)lx.hwpm("hwzv", hwpq(int ), (int)25));
                if (!var3_2 && !var3_2) ** break;
                ** continue;
                return;
            }
lbl42:
            // 2 sources

            case 0: {
                var4_1 /* !! */  = (int)lx.hwpm("hwzw", hwpj(int ), (int)239);
                if (var5) {
                    throw null;
                }
            }
            case 1: {
                var4_1 /* !! */  = (int)lx.hwpm("hwzx", hwpj(int ), (int)240);
                if (var5) {
                    throw null;
                }
                ** GOTO lbl89
            }
lbl51:
            // 2 sources

            case 2: {
                var4_1 /* !! */  = (int)lx.hwpm("hwzy", hwpj(int ), (int)241);
                if (var5) {
                    throw null;
                }
                ** GOTO lbl134
            }
            case 3: {
                var4_1 /* !! */  = (int)lx.hwpm("hwzz", hwpj(int ), (int)242);
                if (var5) {
                    throw null;
                }
                ** GOTO lbl107
            }
lbl61:
            // 2 sources

            case 4: {
                var4_1 /* !! */  = (int)lx.hwpm("hxaa", hwpj(int ), (int)243);
                if (var5) {
                    throw null;
                }
            }
lbl65:
            // 5 sources

            case 5: {
                var4_1 /* !! */  = (int)lx.hwpm("hxab", hwpj(int ), (int)244);
                if (var5) {
                    throw null;
                }
                ** GOTO lbl102
            }
lbl70:
            // 2 sources

            case 6: {
                var4_1 /* !! */  = (int)lx.hwpm("hxac", hwpj(int ), (int)245);
                if (var5) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl75:
            // 2 sources

            case 7: {
                var4_1 /* !! */  = (int)lx.hwpm("hxad", hwpj(int ), (int)246);
                if (var5) {
                    throw null;
                }
                ** GOTO lbl89
            }
            case 8: {
                var4_1 /* !! */  = (int)lx.hwpm("hxae", hwpj(int ), (int)247);
                if (!var5) ** GOTO lbl65
                throw null;
            }
            case 9: {
                var4_1 /* !! */  = (int)lx.hwpm("hxaf", hwpj(int ), (int)248);
                if (var5) {
                    throw null;
                }
                ** GOTO lbl159
            }
lbl89:
            // 4 sources

            case 10: {
                var4_1 /* !! */  = (int)lx.hwpm("hxag", hwpj(int ), (int)249);
                if (!var5) ** GOTO lbl75
                throw null;
            }
            case 11: {
                var4_1 /* !! */  = (int)lx.hwpm("hxah", hwpj(int ), (int)250);
                if (var5) {
                    throw null;
                }
            }
            case 12: {
                var4_1 /* !! */  = (int)lx.hwpm("hxai", hwpj(int ), (int)251);
                if (var5) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl102:
            // 2 sources

            case 13: {
                var4_1 /* !! */  = (int)lx.hwpm("hxaj", hwpj(int ), (int)252);
                if (var5) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl107:
            // 2 sources

            case 14: {
                var4_1 /* !! */  = (int)lx.hwpm("hxak", hwpj(int ), (int)253);
                if (var5) {
                    throw null;
                }
                ** GOTO lbl116
            }
lbl112:
            // 2 sources

            case 15: {
                var4_1 /* !! */  = (int)lx.hwpm("hxal", hwpj(int ), (int)254);
                if (!var5) ** GOTO lbl61
                throw null;
            }
lbl116:
            // 2 sources

            case 16: {
                var4_1 /* !! */  = (int)lx.hwpm("hxam", hwpj(int ), (int)255);
                if (var5) {
                    throw null;
                }
                ** GOTO lbl163
            }
            case 17: {
                var4_1 /* !! */  = (int)lx.hwpm("hxan", hwpj(int ), (int)256);
                if (!var5) ** GOTO lbl65
                throw null;
            }
            case 18: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_1 /* !! */  = (int)lx.hwpm("hxao", hwpj(int ), (int)257);
                    if (!var5) ** GOTO lbl70
                    throw null;
                }
            }
lbl130:
            // 3 sources

            case 19: {
                var4_1 /* !! */  = (int)lx.hwpm("hxap", hwpj(int ), (int)258);
                if (!var5) ** GOTO lbl89
                throw null;
            }
lbl134:
            // 2 sources

            case 20: {
                var4_1 /* !! */  = (int)lx.hwpm("hxaq", hwpj(int ), (int)259);
                if (!var5) ** GOTO lbl130
                throw null;
            }
lbl138:
            // 2 sources

            case 21: {
                var4_1 /* !! */  = (int)lx.hwpm("hxar", hwpj(int ), (int)260);
                if (!var5) ** GOTO lbl51
                throw null;
            }
            case 22: {
                var4_1 /* !! */  = (int)lx.hwpm("hxas", hwpj(int ), (int)261);
                if (!var5) ** GOTO lbl130
                throw null;
            }
lbl146:
            // 2 sources

            case 23: {
                var4_1 /* !! */  = (int)lx.hwpm("hxat", hwpj(int ), (int)262);
                if (!var5) ** GOTO lbl42
                throw null;
            }
lbl150:
            // 4 sources

            case 24: {
                var4_1 /* !! */  = (int)lx.hwpm("hxau", hwpj(int ), (int)263);
                if (var5) {
                    throw null;
                }
                ** GOTO lbl163
            }
            case 25: {
                var4_1 /* !! */  = (int)lx.hwpm("hxav", hwpj(int ), (int)264);
                if (!var5) ** GOTO lbl150
                throw null;
            }
lbl159:
            // 2 sources

            case 26: {
                var4_1 /* !! */  = (int)lx.hwpm("hxaw", hwpj(int ), (int)265);
                if (!var5) ** GOTO lbl112
                throw null;
            }
lbl163:
            // 3 sources

            case 27: {
                var4_1 /* !! */  = (int)lx.hwpm("hxax", hwpj(int ), (int)266);
                if (!var5) ** GOTO lbl138
                throw null;
            }
            case 28: 
        }
        var4_1 /* !! */  = (int)lx.hwpm("hxay", hwpj(int ), (int)267);
        ** while (!var5)
lbl170:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite hwpm(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void hxgy() {
        lx.hwpk[0] = -1948467679;
        lx.hwpk[1] = -516299616;
        lx.hwpk[2] = 1167455965;
        lx.hwpk[3] = -63396288;
        lx.hwpk[4] = -187805553;
        lx.hwpk[5] = 1058160904;
        lx.hwpk[6] = 423413317;
        lx.hwpk[7] = 1808486645;
        lx.hwpk[8] = 660437469;
        lx.hwpk[9] = 2029210825;
        lx.hwpk[10] = 954694235;
        lx.hwpk[11] = 1313017164;
        lx.hwpk[12] = 436164227;
        lx.hwpk[13] = -29597961;
        lx.hwpk[14] = -806899969;
        lx.hwpk[15] = -1468407350;
        lx.hwpk[16] = -1844875231;
        lx.hwpk[17] = -591839874;
        lx.hwpk[18] = -1218136004;
        lx.hwpk[19] = 12560401;
        lx.hwpk[20] = 510672529;
        lx.hwpk[21] = 293572452;
        lx.hwpk[22] = -503662172;
        lx.hwpk[23] = -264895037;
        lx.hwpk[24] = -405452939;
        lx.hwpk[25] = -520862208;
        lx.hwpk[26] = -296003569;
        lx.hwpk[27] = -1824479339;
        lx.hwpk[28] = -1849497339;
        lx.hwpk[29] = -1410944066;
        lx.hwpk[30] = -119028691;
        lx.hwpk[31] = 716328971;
        lx.hwpk[32] = -1716136411;
        lx.hwpk[33] = 940068153;
        lx.hwpk[34] = -381754107;
        lx.hwpk[35] = -1675548002;
        lx.hwpk[36] = -1446107429;
        lx.hwpk[37] = -200024473;
        lx.hwpk[38] = 687538955;
        lx.hwpk[39] = -226135492;
        lx.hwpk[40] = 1387873339;
        lx.hwpk[41] = 799499638;
        lx.hwpk[42] = -1181293168;
        lx.hwpk[43] = 1034131272;
        lx.hwpk[44] = 346663671;
        lx.hwpk[45] = 228491660;
        lx.hwpk[46] = -513952767;
        lx.hwpk[47] = -521638072;
        lx.hwpk[48] = -1572924792;
        lx.hwpk[49] = -1380931276;
        lx.hwpk[50] = 2108448269;
        lx.hwpk[51] = 754012924;
        lx.hwpk[52] = 1190737354;
        lx.hwpk[53] = 737511971;
        lx.hwpk[54] = -883184427;
        lx.hwpk[55] = -905101496;
        lx.hwpk[56] = -1833561778;
        lx.hwpk[57] = -392047612;
        lx.hwpk[58] = -344859135;
        lx.hwpk[59] = -1910711231;
        lx.hwpk[60] = -1032476329;
        lx.hwpk[61] = -424741939;
        lx.hwpk[62] = 951458856;
        lx.hwpk[63] = -30306836;
        lx.hwpk[64] = -542462159;
        lx.hwpk[65] = -364608612;
        lx.hwpk[66] = -173070265;
        lx.hwpk[67] = -1616251996;
        lx.hwpk[68] = 201365135;
        lx.hwpk[69] = -270372088;
        lx.hwpk[70] = 1161428172;
        lx.hwpk[71] = 1334606392;
        lx.hwpk[72] = -1930104870;
        lx.hwpk[73] = 2008492871;
        lx.hwpk[74] = 159143427;
        lx.hwpk[75] = -272178409;
        lx.hwpk[76] = -1574232891;
        lx.hwpk[77] = 1434268564;
        lx.hwpk[78] = -1463658702;
        lx.hwpk[79] = -754718933;
        lx.hwpk[80] = 272544223;
        lx.hwpk[81] = 1626347975;
        lx.hwpk[82] = -988431103;
        lx.hwpk[83] = -371547184;
        lx.hwpk[84] = 1297110249;
        lx.hwpk[85] = 1997233385;
        lx.hwpk[86] = -1046723094;
        lx.hwpk[87] = 1189907622;
        lx.hwpk[88] = -1940739372;
        lx.hwpk[89] = -1200896325;
        lx.hwpk[90] = 191995738;
        lx.hwpk[91] = -1101114920;
        lx.hwpk[92] = -937221492;
        lx.hwpk[93] = -699500345;
        lx.hwpk[94] = 1697731831;
        lx.hwpk[95] = -604121743;
        lx.hwpk[96] = -565645358;
        lx.hwpk[97] = -140743406;
        lx.hwpk[98] = -1678650599;
        lx.hwpk[99] = 694343563;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static void end() {
        block290: {
            block292: {
                block291: {
                    var23 = lx.c;
                    var22_1 /* !! */  = lx.b;
                    var21_2 = lx.a;
                    if (var23) {
                        throw null;
                    }
                    if (var21_2 != false) return;
                    if (var21_2 != false) return;
                    if (lx.pipeline == null) break block291;
                    if (var21_2 != false) return;
                    if (lx.uniformBuffers == null) break block291;
                    if (var21_2 != false) return;
                    if (lx.vertexBuffer == null) break block291;
                    if (var21_2 != false) return;
                    if (lx.ringCount != 0) break block292;
                    if (var21_2 != false) return;
                }
                if (var21_2 != false) return;
                if (var21_2 != false) return;
                lx.ringCount = (int)lx.hwpm("hwtr", hwpj(int ), (int)82);
                if (var21_2 != false) return;
                if (var21_2 != false) return;
                return;
            }
            if (var21_2 != false) return;
            if (var21_2 != false) return;
            lx.inverseView.set((Matrix4fc)lx.view).invert();
            if (var21_2 != false) return;
            if (var21_2 != false) return;
            var0_3 = lx.inverseView.m00();
            if (var21_2 != false) return;
            if (var21_2 != false) return;
            var1_4 = lx.inverseView.m01();
            if (var21_2 != false) return;
            if (var21_2 != false) return;
            var2_5 = lx.inverseView.m02();
            if (var21_2 != false) return;
            if (var21_2 != false) return;
            var3_6 = lx.inverseView.m10();
            if (var21_2 != false) return;
            if (var21_2 != false) return;
            var4_7 = lx.inverseView.m11();
            if (var21_2 != false) return;
            if (var21_2 != false) return;
            var5_8 = lx.inverseView.m12();
            if (var21_2 != false) return;
            if (var21_2 != false) return;
            lx.combined.set((Matrix4fc)lx.projection).mul((Matrix4fc)lx.view);
            if (var21_2 != false) return;
            if (var21_2 != false) return;
            var6_9 = (float)(System.currentTimeMillis() % lx.hwpm("hwts", hwpq(int ), (int)23)) / lx.hwpm("hwtu", hwtt(int ), (int)83);
            if (var21_2 != false) return;
            if (var21_2 != false) return;
            var7_10 = lx.ringCount;
            if (var21_2 != false) return;
            if (var21_2 != false) return;
            var8_11 = om.acquire((int)lx.hwpm("hwtv", hwpj(int ), (int)84), var7_10 * lx.hwpm("hwtw", hwpj(int ), (int)85) * lx.hwpm("hwtx", hwpj(int ), (int)86));
            if (var21_2 != false) return;
            if (var21_2 != false) return;
            var9_12 = RenderSystem.getDevice().createCommandEncoder();
            if (var21_2 != false) return;
            if (var21_2 != false) return;
            var10_13 = lx.hwpm("hwty", hwpj(int ), (int)87);
            if (var21_2 != false) return;
            block140: while (true) {
                if (var21_2 != false) return;
                if (var21_2 != false) return;
                if (var10_13 >= var7_10) ** GOTO lbl770
                if (var22_1 /* !! */  == 0) ** GOTO lbl-1000
                cfr_temp_0 = -2147483648;
                while (true) {
                    switch (cfr_temp_0 == -2147483648 ? var22_1 /* !! */  : cfr_temp_0) {
                        default: lbl-1000:
                        // 2 sources

                        {
                            if (var21_2 != false) return;
                            if (var21_2 != false) return;
                            var11_15 = var10_13 * lx.hwpm("hwtz", hwpj(int ), (int)88);
                            if (var21_2 != false) return;
                            if (var21_2 != false) return;
                            var12_16 = lx.rings[var11_15];
                            if (var21_2 != false) return;
                            if (var21_2 != false) return;
                            var13_18 = lx.rings[var11_15 + true];
                            if (var21_2 != false) return;
                            if (var21_2 != false) return;
                            var14_20 = lx.rings[var11_15 + 2];
                            if (var21_2 != false) return;
                            if (var21_2 != false) return;
                            var15_22 = lx.rings[var11_15 + 3];
                            if (var21_2 != false) return;
                            if (var21_2 != false) return;
                            var16_23 = lx.rings[var11_15 + 4];
                            if (var21_2 != false) return;
                            if (var21_2 != false) return;
                            var17_24 = var15_22 + var16_23 * lx.hwpm("hwua", hwtt(int ), (int)89);
                            if (var21_2 != false) return;
                            if (var21_2 != false) return;
                            var18_26 = lx.hwpm("hwub", hwpj(int ), (int)90);
                            if (var21_2 != false) return;
                            do {
                                if (var21_2 != false) return;
                                if (var21_2 != false) return;
                                if (var18_26 >= lx.hwpm("hwuc", hwpj(int ), (int)91)) ** GOTO lbl128
                                if (var21_2 != false) return;
                                if (var21_2 != false) return;
                                var19_27 = lx.QUAD_U[var18_26];
                                if (var21_2 != false) return;
                                if (var21_2 != false) return;
                                var20_28 = lx.QUAD_V[var18_26];
                                if (var21_2 != false) return;
                                if (var21_2 != false) return;
                                var8_11.putFloat(var12_16 + (var0_3 * var19_27 + var3_6 * var20_28) * var17_24);
                                if (var21_2 != false) return;
                                if (var21_2 != false) return;
                                var8_11.putFloat(var13_18 + (var1_4 * var19_27 + var4_7 * var20_28) * var17_24);
                                if (var21_2 != false) return;
                                if (var21_2 != false) return;
                                var8_11.putFloat(var14_20 + (var2_5 * var19_27 + var5_8 * var20_28) * var17_24);
                                if (var21_2 != false) return;
                                if (var21_2 != false) return;
                                ++var18_26;
                                if (var21_2 != false) return;
                            } while (!var23);
                            throw null;
lbl128:
                            // 1 sources

                            if (var21_2 != false) return;
                            if (var21_2 != false) return;
                            var18_25 = om.acquire((int)lx.hwpm("hwud", hwpj(int ), (int)92), (int)lx.hwpm("hwue", hwpj(int ), (int)93));
                            if (var21_2 != false) return;
                            if (var21_2 != false) return;
                            lx.putMatrix(var18_25, lx.combined);
                            if (var21_2 != false) return;
                            if (var21_2 != false) return;
                            var18_25.putFloat(var6_9).putFloat(var15_22).putFloat(var16_23).putFloat(lx.rings[var11_15 + 8]);
                            if (var21_2 != false) return;
                            if (var21_2 != false) return;
                            var18_25.putFloat(var12_16).putFloat(var13_18).putFloat(var14_20).putFloat(0.0f);
                            if (var21_2 != false) return;
                            if (var21_2 != false) return;
                            var18_25.putFloat(lx.rings[var11_15 + 5]).putFloat(lx.rings[var11_15 + 6]).putFloat(lx.rings[var11_15 + 7]).putFloat(1.0f);
                            if (var21_2 != false) return;
                            if (var21_2 != false) return;
                            var18_25.flip();
                            if (var21_2 != false) return;
                            if (var21_2 != false) return;
                            var9_12.writeToBuffer(lx.uniformBuffers[var10_13].slice(), var18_25);
                            if (var21_2 != false) return;
                            if (var21_2 != false) return;
                            ++var10_13;
                            if (var21_2 != false) return;
                            if (!var23) continue block140;
                            throw null;
                        }
                        case 0: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwuk", hwpj(int ), (int)99);
                            cfr_temp_0 = 113;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 1: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwul", hwpj(int ), (int)100);
                            cfr_temp_0 = 57;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 3: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwun", hwpj(int ), (int)102);
                            cfr_temp_0 = 72;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 4: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwuo", hwpj(int ), (int)103);
                            cfr_temp_0 = 66;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 5: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwup", hwpj(int ), (int)104);
                            cfr_temp_0 = 47;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 11: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwuv", hwpj(int ), (int)110);
                            cfr_temp_0 = 90;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 12: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwuw", hwpj(int ), (int)111);
                            cfr_temp_0 = 131;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 16: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwva", hwpj(int ), (int)115);
                            cfr_temp_0 = 96;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 17: {
                            ** GOTO lbl698
                        }
                        case 19: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwvd", hwpj(int ), (int)118);
                            cfr_temp_0 = 65;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 23: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwvh", hwpj(int ), (int)122);
                            cfr_temp_0 = 9;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 25: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwvj", hwpj(int ), (int)124);
                            cfr_temp_0 = 54;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 26: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwvk", hwpj(int ), (int)125);
                            cfr_temp_0 = 50;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 30: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwvo", hwpj(int ), (int)129);
                            cfr_temp_0 = 66;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 32: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwvq", hwpj(int ), (int)131);
                            cfr_temp_0 = 74;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 39: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwvx", hwpj(int ), (int)138);
                            cfr_temp_0 = 131;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 45: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwwd", hwpj(int ), (int)144);
                            cfr_temp_0 = 38;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 55: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwwn", hwpj(int ), (int)154);
                            cfr_temp_0 = 62;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 56: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwwo", hwpj(int ), (int)155);
                            cfr_temp_0 = 35;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 59: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwwr", hwpj(int ), (int)158);
                            cfr_temp_0 = 46;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 60: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwws", hwpj(int ), (int)159);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 6: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwuq", hwpj(int ), (int)105);
                            cfr_temp_0 = 100;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 61: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwwt", hwpj(int ), (int)160);
                            cfr_temp_0 = 22;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 66: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwwy", hwpj(int ), (int)165);
                            cfr_temp_0 = 51;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 71: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwxd", hwpj(int ), (int)170);
                            cfr_temp_0 = 114;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 72: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwxe", hwpj(int ), (int)171);
                            cfr_temp_0 = 127;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 75: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwxh", hwpj(int ), (int)174);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 42: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwwa", hwpj(int ), (int)141);
                            cfr_temp_0 = 90;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 76: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwxi", hwpj(int ), (int)175);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 14: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwuy", hwpj(int ), (int)113);
                            cfr_temp_0 = 93;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 77: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwxj", hwpj(int ), (int)176);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 40: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwvy", hwpj(int ), (int)139);
                            cfr_temp_0 = 9;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 78: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwxk", hwpj(int ), (int)177);
                            cfr_temp_0 = 29;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 83: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwxp", hwpj(int ), (int)182);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 44: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwwc", hwpj(int ), (int)143);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 54: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwwm", hwpj(int ), (int)153);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 70: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwxc", hwpj(int ), (int)169);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 53: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwwl", hwpj(int ), (int)152);
                            cfr_temp_0 = 106;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 84: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwxq", hwpj(int ), (int)183);
                            cfr_temp_0 = 103;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 85: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwxr", hwpj(int ), (int)184);
                            cfr_temp_0 = 34;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 87: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwxt", hwpj(int ), (int)186);
                            cfr_temp_0 = 64;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 90: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwxw", hwpj(int ), (int)189);
                            cfr_temp_0 = 38;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 91: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwxx", hwpj(int ), (int)190);
                            cfr_temp_0 = 49;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 93: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwxz", hwpj(int ), (int)192);
                            cfr_temp_0 = 110;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 95: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwyb", hwpj(int ), (int)194);
                            cfr_temp_0 = 58;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 96: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwyc", hwpj(int ), (int)195);
                            cfr_temp_0 = 109;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 97: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwyd", hwpj(int ), (int)196);
                            cfr_temp_0 = 27;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 99: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwyf", hwpj(int ), (int)198);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 62: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwwu", hwpj(int ), (int)161);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 37: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwvv", hwpj(int ), (int)136);
                            cfr_temp_0 = 69;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 100: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwyg", hwpj(int ), (int)199);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 28: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwvm", hwpj(int ), (int)127);
                            cfr_temp_0 = 48;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 102: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwyi", hwpj(int ), (int)201);
                            cfr_temp_0 = 67;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 105: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwyl", hwpj(int ), (int)204);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 69: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwxb", hwpj(int ), (int)168);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 21: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwvf", hwpj(int ), (int)120);
                            cfr_temp_0 = 52;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 108: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwyo", hwpj(int ), (int)207);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 74: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwxg", hwpj(int ), (int)173);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 94: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwya", hwpj(int ), (int)193);
                            cfr_temp_0 = 7;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 109: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwyp", hwpj(int ), (int)208);
                            cfr_temp_0 = 41;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 110: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwyq", hwpj(int ), (int)209);
                            cfr_temp_0 = 57;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 111: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwyr", hwpj(int ), (int)210);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 9: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwut", hwpj(int ), (int)108);
                            cfr_temp_0 = 129;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 113: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwyt", hwpj(int ), (int)212);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 67: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwwz", hwpj(int ), (int)166);
                            cfr_temp_0 = 132;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 114: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwyu", hwpj(int ), (int)213);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 73: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwxf", hwpj(int ), (int)172);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 43: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwwb", hwpj(int ), (int)142);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 36: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwvu", hwpj(int ), (int)135);
                            cfr_temp_0 = 63;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 115: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwyv", hwpj(int ), (int)214);
                            cfr_temp_0 = 58;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 116: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwyw", hwpj(int ), (int)215);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 98: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwye", hwpj(int ), (int)197);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 38: {
                            do {
                                var22_1 /* !! */  = (int)lx.hwpm("hwvw", hwpj(int ), (int)137);
                            } while (!var23);
                            throw null;
                        }
                        case 120: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwza", hwpj(int ), (int)219);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 103: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwyj", hwpj(int ), (int)202);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 123: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwzd", hwpj(int ), (int)222);
                            cfr_temp_0 = 18;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 124: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwze", hwpj(int ), (int)223);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 35: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwvt", hwpj(int ), (int)134);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 79: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwxl", hwpj(int ), (int)178);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 10: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwuu", hwpj(int ), (int)109);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 33: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwvr", hwpj(int ), (int)132);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 65: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwwx", hwpj(int ), (int)164);
                            cfr_temp_0 = 8;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 125: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwzf", hwpj(int ), (int)224);
                            cfr_temp_0 = 49;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 127: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwzh", hwpj(int ), (int)226);
                            cfr_temp_0 = 112;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 128: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwzi", hwpj(int ), (int)227);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 81: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwxn", hwpj(int ), (int)180);
                            cfr_temp_0 = 41;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 129: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwzj", hwpj(int ), (int)228);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 121: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwzb", hwpj(int ), (int)220);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 57: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwwp", hwpj(int ), (int)156);
                            cfr_temp_0 = 7;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 130: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwzk", hwpj(int ), (int)229);
                            cfr_temp_0 = 15;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 131: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwzl", hwpj(int ), (int)230);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 68: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwxa", hwpj(int ), (int)167);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 119: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwyz", hwpj(int ), (int)218);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 118: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwyy", hwpj(int ), (int)217);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 82: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwxo", hwpj(int ), (int)181);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 122: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwzc", hwpj(int ), (int)221);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 50: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwwi", hwpj(int ), (int)149);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 15: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwuz", hwpj(int ), (int)114);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 24: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwvi", hwpj(int ), (int)123);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 2: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwum", hwpj(int ), (int)101);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 86: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwxs", hwpj(int ), (int)185);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 51: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwwj", hwpj(int ), (int)150);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 112: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwys", hwpj(int ), (int)211);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 27: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwvl", hwpj(int ), (int)126);
                            cfr_temp_0 = 104;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 132: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwzm", hwpj(int ), (int)231);
                            cfr_temp_0 = 107;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 133: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwzn", hwpj(int ), (int)232);
                            if (var23) {
                                throw null;
                            }
lbl698:
                            // 3 sources

                            var22_1 /* !! */  = (int)lx.hwpm("hwvb", hwpj(int ), (int)116);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 47: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwwf", hwpj(int ), (int)146);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 117: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwyx", hwpj(int ), (int)216);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 20: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwve", hwpj(int ), (int)119);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 89: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwxv", hwpj(int ), (int)188);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 41: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwvz", hwpj(int ), (int)140);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 22: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwvg", hwpj(int ), (int)121);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 31: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwvp", hwpj(int ), (int)130);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 80: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwxm", hwpj(int ), (int)179);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 101: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwyh", hwpj(int ), (int)200);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 18: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwvc", hwpj(int ), (int)117);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 48: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwwg", hwpj(int ), (int)147);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 52: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwwk", hwpj(int ), (int)151);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 64: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwww", hwpj(int ), (int)163);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 34: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwvs", hwpj(int ), (int)133);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 63: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwwv", hwpj(int ), (int)162);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 49: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwwh", hwpj(int ), (int)148);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 58: {
                            do {
                                var22_1 /* !! */  = (int)lx.hwpm("hwwq", hwpj(int ), (int)157);
                            } while (!var23);
                            throw null;
                        }
lbl770:
                        // 1 sources

                        if (var21_2 != false) return;
                        if (var21_2 != false) return;
                        var8_11.flip();
                        if (var21_2 != false) return;
                        if (var21_2 != false) return;
                        var9_12.writeToBuffer(lx.vertexBuffer.slice(), var8_11);
                        if (var21_2 != false) return;
                        if (var21_2 != false) return;
                        var10_14 = lx.mc.method_1522();
                        if (var21_2 != false) return;
                        if (var21_2 != false) return;
                        var11_15 = lx.hwpm("hwuf", hwpj(int ), (int)94);
                        if (var21_2 != false) return;
                        do {
                            if (var21_2 != false) return;
                            if (var21_2 != false) return;
                            if (var11_15 >= var7_10) {
                                if (var21_2 != false) return;
                                if (var21_2 != false) return;
                                lx.ringCount = (int)lx.hwpm("hwuj", hwpj(int ), (int)98);
                                if (var21_2 != false) return;
                                if (var21_2 != false) return;
                                return;
                            }
                            if (var21_2 != false) return;
                            if (var21_2 != false) return;
                            v0 = (Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$end$0(), ()Ljava/lang/String;)();
                            v1 = var10_14.method_71639();
                            v2 = OptionalInt.empty();
                            v3 = var10_14.method_71640();
                            if (lx.batchIgnoreDepth && var11_15 == false) {
                                v4 = OptionalDouble.of(1.0);
                                if (var23) {
                                    throw null;
                                }
                            } else {
                                v4 = OptionalDouble.empty();
                            }
                            var12_17 = var9_12.createRenderPass(v0, v1, v2, v3, v4);
                            if (var21_2 != false) return;
                            try {
                                if (var21_2 != false) return;
                                var12_17.setPipeline(lx.pipeline);
                                if (var21_2 != false) return;
                                if (var21_2 != false) return;
                                var12_17.setUniform("Uniforms", lx.uniformBuffers[var11_15]);
                                if (var21_2 != false) return;
                                if (var21_2 != false) return;
                                var12_17.setVertexBuffer((int)lx.hwpm("hwug", hwpj(int ), (int)95), lx.vertexBuffer);
                                if (var21_2 != false) return;
                                if (var21_2 != false) return;
                                var12_17.draw((int)(var11_15 * lx.hwpm("hwuh", hwpj(int ), (int)96)), (int)lx.hwpm("hwui", hwpj(int ), (int)97));
                                if (var21_2 != false) return;
                                if (var21_2 != false) return;
                                if (var12_17 == null) ** GOTO lbl848
                                if (var21_2 != false) return;
                            }
                            catch (Throwable var13_19) {
                                if (var21_2 != false) return;
                                if (var12_17 != null) {
                                    if (var21_2 != false) return;
                                    try {
                                        if (var21_2 != false) return;
                                        var12_17.close();
                                        if (var21_2 != false) return;
                                        if (var21_2 != false) return;
                                        ** if (!var23) goto lbl-1000
                                    }
                                    catch (Throwable var14_21) {
                                        if (var21_2 != false) return;
                                        var13_19.addSuppressed(var14_21);
                                        if (var21_2 != false) return;
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
                                }
                                if (var21_2 != false) return;
                                if (var21_2 != false) return;
                                throw var13_19;
                            }
                            var12_17.close();
                            if (var21_2 != false) return;
                            if (var23) {
                                throw null;
                            }
lbl848:
                            // 3 sources

                            if (var21_2 != false) return;
                            if (var21_2 != false) return;
                            ++var11_15;
                            if (var21_2 != false) return;
                        } while (!var23);
                        throw null;
                        case 7: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwur", hwpj(int ), (int)106);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 8: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwus", hwpj(int ), (int)107);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 106: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwym", hwpj(int ), (int)205);
                            cfr_temp_0 = 7;
                            if (var23) {
                                throw null;
                            }
                            break block290;
                        }
                        case 13: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwux", hwpj(int ), (int)112);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 29: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwvn", hwpj(int ), (int)128);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 107: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwyn", hwpj(int ), (int)206);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 88: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwxu", hwpj(int ), (int)187);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 104: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwyk", hwpj(int ), (int)203);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 46: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwwe", hwpj(int ), (int)145);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 126: {
                            var22_1 /* !! */  = (int)lx.hwpm("hwzg", hwpj(int ), (int)225);
                            if (var23) {
                                throw null;
                            }
                        }
                        case 92: 
                    }
                    break;
                }
                break;
            }
            ** GOTO lbl901
        }
        do {
            if (true) ** continue;
lbl901:
            // 2 sources

            var22_1 /* !! */  = (int)lx.hwpm("hwxy", hwpj(int ), (int)191);
            cfr_temp_0 = 13;
        } while (!var23);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void ring(double var0, double var2_1, double var4_2, float var6_3, float var7_4, int var8_5, float var9_6) {
        block61: {
            var14_7 = lx.c;
            var13_8 /* !! */  = lx.b;
            var12_9 = lx.a;
            if (var14_7) {
                throw null;
lbl6:
                // 14 sources

                return;
            }
            if (var12_9 || var12_9) ** GOTO lbl6
            if (lx.ringCount < lx.hwpm("hwrz", hwpj(int ), (int)38)) break block61;
            if (var12_9) ** GOTO lbl6
            return;
        }
        if (var12_9 || var12_9) ** GOTO lbl6
        if (var13_8 /* !! */  == 0) ** GOTO lbl-1000
        switch (var13_8 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var10_10 = lx.mc.field_1773.method_19418().method_71156();
                if (var12_9 || var12_9) ** GOTO lbl6
                v0 = lx.ringCount;
                lx.ringCount = v0 + lx.hwpm("hwsa", hwpj(int ), (int)39);
                var11_11 = v0 * lx.hwpm("hwsb", hwpj(int ), (int)40);
                if (var12_9 || var12_9) ** GOTO lbl6
                lx.rings[var11_11] = (float)(var0 - var10_10.field_1352);
                if (var12_9 || var12_9) ** GOTO lbl6
                lx.rings[var11_11 + lx.hwpm("hwsc", hwpj(int ), (int)41)] = (float)(var2_1 - var10_10.field_1351);
                if (var12_9 || var12_9) ** GOTO lbl6
                lx.rings[var11_11 + lx.hwpm("hwsd", hwpj(int ), (int)42)] = (float)(var4_2 - var10_10.field_1350);
                if (var12_9 || var12_9) ** GOTO lbl6
                lx.rings[var11_11 + 3] = var6_3;
                if (var12_9 || var12_9) ** GOTO lbl6
                lx.rings[var11_11 + 4] = var7_4;
                if (var12_9 || var12_9) ** GOTO lbl6
                lx.rings[var11_11 + lx.hwpm("hwse", hwpj(int ), (int)43)] = (float)(var8_5 >> lx.hwpm("hwsf", hwpj(int ), (int)44) & lx.hwpm("hwsg", hwpj(int ), (int)45)) / 255.0f;
                if (var12_9 || var12_9) ** GOTO lbl6
                lx.rings[var11_11 + lx.hwpm("hwsh", hwpj(int ), (int)46)] = (float)(var8_5 >> lx.hwpm("hwsi", hwpj(int ), (int)47) & lx.hwpm("hwsj", hwpj(int ), (int)48)) / 255.0f;
                if (var12_9 || var12_9) ** GOTO lbl6
                lx.rings[var11_11 + lx.hwpm("hwsk", hwpj(int ), (int)49)] = (float)(var8_5 & lx.hwpm("hwsl", hwpj(int ), (int)50)) / 255.0f;
                if (var12_9 || var12_9) ** GOTO lbl6
                lx.rings[var11_11 + lx.hwpm("hwsm", hwpj(int ), (int)51)] = Math.max(0.0f, Math.min(1.0f, var9_6));
                if (!var12_9 && !var12_9) ** break;
                ** continue;
                return;
            }
            case 0: {
                var13_8 /* !! */  = (int)lx.hwpm("hwsn", hwpj(int ), (int)52);
                if (var14_7) {
                    throw null;
                }
                ** GOTO lbl151
            }
lbl48:
            // 3 sources

            case 1: {
                var13_8 /* !! */  = (int)lx.hwpm("hwso", hwpj(int ), (int)53);
                if (var14_7) {
                    throw null;
                }
                ** GOTO lbl88
            }
            case 2: {
                var13_8 /* !! */  = (int)lx.hwpm("hwsp", hwpj(int ), (int)54);
                if (var14_7) {
                    throw null;
                }
                ** GOTO lbl163
            }
lbl58:
            // 2 sources

            case 3: {
                var13_8 /* !! */  = (int)lx.hwpm("hwsq", hwpj(int ), (int)55);
                if (var14_7) {
                    throw null;
                }
                ** GOTO lbl143
            }
            case 4: {
                var13_8 /* !! */  = (int)lx.hwpm("hwsr", hwpj(int ), (int)56);
                if (var14_7) {
                    throw null;
                }
                ** GOTO lbl127
            }
lbl68:
            // 2 sources

            case 5: {
                var13_8 /* !! */  = (int)lx.hwpm("hwss", hwpj(int ), (int)57);
                if (var14_7) {
                    throw null;
                }
                ** GOTO lbl78
            }
lbl73:
            // 2 sources

            case 6: {
                var13_8 /* !! */  = (int)lx.hwpm("hwst", hwpj(int ), (int)58);
                if (var14_7) {
                    throw null;
                }
                ** GOTO lbl131
            }
lbl78:
            // 2 sources

            case 7: {
                var13_8 /* !! */  = (int)lx.hwpm("hwsu", hwpj(int ), (int)59);
                if (var14_7) {
                    throw null;
                }
                ** GOTO lbl147
            }
            case 8: {
                var13_8 /* !! */  = (int)lx.hwpm("hwsv", hwpj(int ), (int)60);
                if (var14_7) {
                    throw null;
                }
                ** GOTO lbl118
            }
lbl88:
            // 2 sources

            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var13_8 /* !! */  = (int)lx.hwpm("hwsw", hwpj(int ), (int)61);
                    if (var14_7) {
                        throw null;
                    }
                    ** GOTO lbl104
                    break;
                }
            }
            case 10: {
                var13_8 /* !! */  = (int)lx.hwpm("hwsx", hwpj(int ), (int)62);
                if (var14_7) {
                    throw null;
                }
                ** GOTO lbl139
            }
lbl99:
            // 2 sources

            case 11: {
                var13_8 /* !! */  = (int)lx.hwpm("hwsy", hwpj(int ), (int)63);
                if (var14_7) {
                    throw null;
                }
                ** GOTO lbl163
            }
lbl104:
            // 3 sources

            case 12: {
                var13_8 /* !! */  = (int)lx.hwpm("hwsz", hwpj(int ), (int)64);
                if (var14_7) {
                    throw null;
                }
                ** GOTO lbl159
            }
lbl109:
            // 2 sources

            case 13: {
                var13_8 /* !! */  = (int)lx.hwpm("hwta", hwpj(int ), (int)65);
                if (!var14_7) break;
                throw null;
            }
            case 14: {
                var13_8 /* !! */  = (int)lx.hwpm("hwtb", hwpj(int ), (int)66);
                if (var14_7) {
                    throw null;
                }
                ** GOTO lbl155
            }
lbl118:
            // 3 sources

            case 15: {
                var13_8 /* !! */  = (int)lx.hwpm("hwtc", hwpj(int ), (int)67);
                if (!var14_7) ** GOTO lbl99
                throw null;
            }
            case 16: {
                do {
                    var13_8 /* !! */  = (int)lx.hwpm("hwtd", hwpj(int ), (int)68);
                } while (!var14_7);
                throw null;
            }
lbl127:
            // 2 sources

            case 17: {
                var13_8 /* !! */  = (int)lx.hwpm("hwte", hwpj(int ), (int)69);
                if (!var14_7) ** GOTO lbl109
                throw null;
            }
lbl131:
            // 3 sources

            case 18: {
                var13_8 /* !! */  = (int)lx.hwpm("hwtf", hwpj(int ), (int)70);
                if (var14_7) {
                    throw null;
                }
            }
            case 19: {
                var13_8 /* !! */  = (int)lx.hwpm("hwtg", hwpj(int ), (int)71);
                if (!var14_7) ** GOTO lbl131
                throw null;
            }
lbl139:
            // 2 sources

            case 20: {
                var13_8 /* !! */  = (int)lx.hwpm("hwth", hwpj(int ), (int)72);
                if (!var14_7) ** GOTO lbl118
                throw null;
            }
lbl143:
            // 2 sources

            case 21: {
                var13_8 /* !! */  = (int)lx.hwpm("hwti", hwpj(int ), (int)73);
                if (!var14_7) ** GOTO lbl58
                throw null;
            }
lbl147:
            // 2 sources

            case 22: {
                var13_8 /* !! */  = (int)lx.hwpm("hwtj", hwpj(int ), (int)74);
                if (!var14_7) ** GOTO lbl73
                throw null;
            }
lbl151:
            // 2 sources

            case 23: {
                var13_8 /* !! */  = (int)lx.hwpm("hwtk", hwpj(int ), (int)75);
                if (!var14_7) ** GOTO lbl48
                throw null;
            }
lbl155:
            // 2 sources

            case 24: {
                var13_8 /* !! */  = (int)lx.hwpm("hwtl", hwpj(int ), (int)76);
                if (!var14_7) ** GOTO lbl68
                throw null;
            }
lbl159:
            // 2 sources

            case 25: {
                var13_8 /* !! */  = (int)lx.hwpm("hwtm", hwpj(int ), (int)77);
                if (!var14_7) ** GOTO lbl104
                throw null;
            }
lbl163:
            // 3 sources

            case 26: {
                var13_8 /* !! */  = (int)lx.hwpm("hwtn", hwpj(int ), (int)78);
                if (var14_7) {
                    throw null;
                }
            }
            case 27: {
                var13_8 /* !! */  = (int)lx.hwpm("hwto", hwpj(int ), (int)79);
                if (!var14_7) ** GOTO lbl48
                throw null;
            }
            case 28: {
                var13_8 /* !! */  = (int)lx.hwpm("hwtp", hwpj(int ), (int)80);
                if (!var14_7) break;
                throw null;
            }
            case 29: 
        }
        var13_8 /* !! */  = (int)lx.hwpm("hwtq", hwpj(int ), (int)81);
        ** while (!var14_7)
lbl178:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String lambda$init$2() {
        boolean bl2;
        Object object = pd;
        boolean bl3 = true;
        block5: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - lx.hwpm("hxff", hwpq(int ), (int)86);
            }
            switch ((int)object) {
                case -1749119006: {
                    callSite = lx.hwpm("hxfg", hwpq(int ), (int)87);
                    continue block5;
                }
                case -759011237: {
                    callSite = lx.hwpm("hxfh", hwpq(int ), (int)88);
                    continue block5;
                }
                case 1610330881: {
                    break block5;
                }
            }
            break;
        }
        boolean bl4 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = pd - lx.hwpm("hxfi", hwpq(int ), (int)89)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == lx.hwpm("hxfj", hwpj(int ), (int)318)) break;
            object2 = lx.hwpm("hxfk", hwpj(int ), (int)319);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = pd - lx.hwpm("hxfl", hwpq(int ), (int)90)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == lx.hwpm("hxfm", hwpj(int ), (int)320)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = lx.hwpm("hxfn", hwpj(int ), (int)321);
        }
        if (!bl2 && !bl2) return "Ring3D Vertices";
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$end$0() {
        v0 /* !! */  = lx.pd;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - lx.hwpm("hxgj", hwpq(int ), (int)100));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2117934429: {
                    v1 = lx.hwpm("hxgk", hwpq(int ), (int)101);
                    continue block18;
                }
                case -1615632271: {
                    v1 = lx.hwpm("hxgl", hwpq(int ), (int)102);
                    continue block18;
                }
                case 1610330881: {
                    break block18;
                }
                case 1751698616: {
                    v1 = lx.hwpm("hxgm", hwpq(int ), (int)103);
                    continue block18;
                }
            }
            break;
        }
        var2 = lx.c;
        v2 /* !! */  = lx.pd;
        if (true) ** GOTO lbl22
        block19: while (true) {
            v2 /* !! */  = (long)(v3 - lx.hwpm("hxgn", hwpq(int ), (int)104));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -216575094: {
                    v3 = lx.hwpm("hxgo", hwpq(int ), (int)105);
                    continue block19;
                }
                case 991906648: {
                    v3 = lx.hwpm("hxgp", hwpq(int ), (int)106);
                    continue block19;
                }
                case 1237226230: {
                    v3 = lx.hwpm("hxgq", hwpq(int ), (int)107);
                    continue block19;
                }
                case 1610330881: {
                    break block19;
                }
            }
            break;
        }
        var1_1 /* !! */  = lx.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = lx.pd - lx.hwpm("hxgr", hwpq(int ), (int)108)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == lx.hwpm("hxgs", hwpj(int ), (int)334)) break;
            v4 /* !! */  = (long)lx.hwpm("hxgt", hwpj(int ), (int)335);
        }
        var0_2 = lx.a;
        if (var2) {
            throw null;
lbl44:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl44
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                return "TargetESP Ring";
            }
            case 0: {
                do {
                    var1_1 /* !! */  = (int)lx.hwpm("hxgu", hwpj(int ), (int)336);
                } while (!var2);
                throw null;
            }
lbl57:
            // 2 sources

            case 1: {
                var1_1 /* !! */  = (int)lx.hwpm("hxgv", hwpj(int ), (int)337);
                if (!var2) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)lx.hwpm("hxgw", hwpj(int ), (int)338);
                    if (!var2) ** GOTO lbl57
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)lx.hwpm("hxgx", hwpj(int ), (int)339);
        ** while (!var2)
lbl69:
        // 1 sources

        throw null;
    }

    private lx() {
        int n2 = b;
    }

    private static /* synthetic */ void hxhd() {
        lx.hwpl[100] = 133800565;
        lx.hwpl[101] = -32969752;
        lx.hwpl[102] = 622597841;
        lx.hwpl[103] = -572092955;
        lx.hwpl[104] = 1994864904;
        lx.hwpl[105] = 986108077;
        lx.hwpl[106] = 657390586;
        lx.hwpl[107] = 1684133907;
        lx.hwpl[108] = -437784786;
        lx.hwpl[109] = 976097432;
        lx.hwpl[110] = 1075894414;
        lx.hwpl[111] = -1917199229;
        lx.hwpl[112] = 378551052;
        lx.hwpl[113] = -688726899;
        lx.hwpl[114] = -1460733643;
        lx.hwpl[115] = -816510367;
        lx.hwpl[116] = -915755530;
        lx.hwpl[117] = 1539442113;
        lx.hwpl[118] = 114283295;
        lx.hwpl[119] = 900647188;
        lx.hwpl[120] = 1090563178;
        lx.hwpl[121] = 1345095840;
        lx.hwpl[122] = 209059602;
        lx.hwpl[123] = 165697478;
        lx.hwpl[124] = 1000485183;
        lx.hwpl[125] = 1476813297;
        lx.hwpl[126] = 2115981766;
        lx.hwpl[127] = 1633263907;
        lx.hwpl[128] = 1678381085;
        lx.hwpl[129] = -1745153480;
        lx.hwpl[130] = 1259119984;
        lx.hwpl[131] = -1049819296;
        lx.hwpl[132] = 417295151;
        lx.hwpl[133] = -1856212133;
        lx.hwpl[134] = 599009436;
        lx.hwpl[135] = -922915714;
        lx.hwpl[136] = -1645457385;
        lx.hwpl[137] = 1884734600;
        lx.hwpl[138] = 919160383;
        lx.hwpl[139] = 298711759;
        lx.hwpl[140] = 183283746;
        lx.hwpl[141] = -1795223467;
        lx.hwpl[142] = -581797108;
        lx.hwpl[143] = -1796771399;
        lx.hwpl[144] = -900192324;
        lx.hwpl[145] = 1331646760;
        lx.hwpl[146] = -659117050;
        lx.hwpl[147] = 981400249;
        lx.hwpl[148] = 431769894;
        lx.hwpl[149] = -1695156264;
        lx.hwpl[150] = 305189462;
        lx.hwpl[151] = -1979266390;
        lx.hwpl[152] = -1805361563;
        lx.hwpl[153] = 1163180180;
        lx.hwpl[154] = 1387401310;
        lx.hwpl[155] = -623832249;
        lx.hwpl[156] = 1801901693;
        lx.hwpl[157] = -1612398077;
        lx.hwpl[158] = 1244103693;
        lx.hwpl[159] = -449705746;
        lx.hwpl[160] = 184537567;
        lx.hwpl[161] = 1419035309;
        lx.hwpl[162] = 647654004;
        lx.hwpl[163] = 529924262;
        lx.hwpl[164] = -1079803361;
        lx.hwpl[165] = -2104008551;
        lx.hwpl[166] = 1945528473;
        lx.hwpl[167] = 650963555;
        lx.hwpl[168] = -1666559767;
        lx.hwpl[169] = 564070198;
        lx.hwpl[170] = -1649734261;
        lx.hwpl[171] = 1293724552;
        lx.hwpl[172] = -836500939;
        lx.hwpl[173] = 695086974;
        lx.hwpl[174] = 555409846;
        lx.hwpl[175] = -725606996;
        lx.hwpl[176] = 1853769145;
        lx.hwpl[177] = -547256744;
        lx.hwpl[178] = -870606984;
        lx.hwpl[179] = -661604960;
        lx.hwpl[180] = 1920887711;
        lx.hwpl[181] = 1443599677;
        lx.hwpl[182] = -1695534861;
        lx.hwpl[183] = 1156912817;
        lx.hwpl[184] = -1177210760;
        lx.hwpl[185] = -498085602;
        lx.hwpl[186] = 1449078564;
        lx.hwpl[187] = -737208791;
        lx.hwpl[188] = 2072958063;
        lx.hwpl[189] = 2011509637;
        lx.hwpl[190] = -1307304396;
        lx.hwpl[191] = -691539172;
        lx.hwpl[192] = 990966209;
        lx.hwpl[193] = 1392951802;
        lx.hwpl[194] = -1365437682;
        lx.hwpl[195] = -922630560;
        lx.hwpl[196] = 125486700;
        lx.hwpl[197] = -2137348185;
        lx.hwpl[198] = -1907757519;
        lx.hwpl[199] = -1641976100;
    }
}

