/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Snippet
 *  com.mojang.blaze3d.platform.DepthTestFunction
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.FilterMode
 *  com.mojang.blaze3d.textures.GpuTexture
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  com.mojang.blaze3d.textures.TextureFormat
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  net.minecraft.class_10789
 *  net.minecraft.class_12137
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package ruhack.phobia;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.DepthTestFunction;
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
import java.nio.ByteBuffer;
import java.util.OptionalInt;
import java.util.function.Supplier;
import net.minecraft.class_10789;
import net.minecraft.class_12137;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import ruhack.phobia.jo;
import ruhack.phobia.om;

public class ly {
    private static RenderPipeline auroraPipeline;
    public static final boolean c;
    private static RenderPipeline compositePipeline;
    private static final Matrix4f rotationViewMatrix;
    private static GpuTextureView skyTextureView;
    private static GpuTexture skyTexture;
    private static final int UNIFORM_SIZE = 112;
    private static final Matrix4f viewMatrix;
    private static long[] huwu;
    public static final int b;
    private static long[] huwv;
    private static RenderPipeline blackHolePipeline;
    private static final class_310 mc;
    static final long pa = -5395056640461937173L;
    private static final int DOWNSAMPLE = 2;
    private static final Matrix4f inverseViewProjection;
    private static int skyWidth;
    private static int skyHeight;
    public static final boolean a;
    private static int[] huwz;
    private static GpuBuffer vertexBuffer;
    private static GpuBuffer uniformBuffer;
    private static int[] huxa;
    private static RenderPipeline galaxyPipeline;
    private static final Matrix4f projectionMatrix;
    private static final long START_NANOS;

    private static /* synthetic */ void hvsc() {
        ly.huwz[200] = 887099022;
        ly.huwz[201] = -1441742350;
        ly.huwz[202] = 597017326;
        ly.huwz[203] = 2129557921;
        ly.huwz[204] = -1837066903;
        ly.huwz[205] = 1845291646;
        ly.huwz[206] = 357590567;
        ly.huwz[207] = 76664425;
        ly.huwz[208] = 276135054;
        ly.huwz[209] = -537479999;
        ly.huwz[210] = -767546613;
        ly.huwz[211] = 0x29C29222;
        ly.huwz[212] = -614878525;
        ly.huwz[213] = 1685189721;
        ly.huwz[214] = 361808306;
        ly.huwz[215] = -1961473209;
        ly.huwz[216] = 1817517030;
        ly.huwz[217] = 773211908;
        ly.huwz[218] = 1513867697;
        ly.huwz[219] = -1950502190;
        ly.huwz[220] = 528185700;
        ly.huwz[221] = 1265962395;
        ly.huwz[222] = 1786920204;
        ly.huwz[223] = 1885343290;
        ly.huwz[224] = 1950329398;
        ly.huwz[225] = 1743101557;
        ly.huwz[226] = -719603000;
        ly.huwz[227] = -354386144;
        ly.huwz[228] = -1203608885;
        ly.huwz[229] = 942277146;
        ly.huwz[230] = 1823568874;
        ly.huwz[231] = -387332284;
        ly.huwz[232] = 2006040787;
        ly.huwz[233] = -1026565933;
        ly.huwz[234] = -2091727904;
        ly.huwz[235] = 1408248194;
        ly.huwz[236] = -555653534;
        ly.huwz[237] = -2023347178;
        ly.huwz[238] = -236080172;
        ly.huwz[239] = -2145359099;
        ly.huwz[240] = -1969686633;
        ly.huwz[241] = 1608142728;
        ly.huwz[242] = 2075520649;
        ly.huwz[243] = -206694847;
        ly.huwz[244] = 1930503363;
        ly.huwz[245] = -1847911104;
        ly.huwz[246] = -754391179;
        ly.huwz[247] = 409108841;
        ly.huwz[248] = -1858756432;
        ly.huwz[249] = 876815036;
        ly.huwz[250] = -1996080807;
        ly.huwz[251] = 561072925;
        ly.huwz[252] = -381375860;
        ly.huwz[253] = -209742777;
        ly.huwz[254] = -553679501;
        ly.huwz[255] = -1095878262;
        ly.huwz[256] = 969609140;
        ly.huwz[257] = -1728899017;
        ly.huwz[258] = -1454158215;
        ly.huwz[259] = 395032265;
        ly.huwz[260] = 361087402;
        ly.huwz[261] = 296796664;
        ly.huwz[262] = -629499791;
        ly.huwz[263] = 1795709834;
        ly.huwz[264] = -1916767553;
        ly.huwz[265] = 702335526;
        ly.huwz[266] = -1958128724;
        ly.huwz[267] = -1280483968;
        ly.huwz[268] = -1310375341;
        ly.huwz[269] = -629712728;
        ly.huwz[270] = 2012312659;
        ly.huwz[271] = 49591848;
        ly.huwz[272] = 1119526439;
        ly.huwz[273] = -365853630;
        ly.huwz[274] = -1592288402;
        ly.huwz[275] = -2084372451;
        ly.huwz[276] = 1410817294;
        ly.huwz[277] = -1912784304;
        ly.huwz[278] = -698914160;
        ly.huwz[279] = 2065053020;
        ly.huwz[280] = -925774520;
        ly.huwz[281] = 1925461221;
        ly.huwz[282] = 1847222909;
        ly.huwz[283] = -1939998539;
        ly.huwz[284] = -187544544;
        ly.huwz[285] = -1146206343;
        ly.huwz[286] = 347242831;
        ly.huwz[287] = -773727479;
        ly.huwz[288] = 1056603533;
        ly.huwz[289] = -1080264646;
        ly.huwz[290] = 1953474440;
        ly.huwz[291] = -828957567;
        ly.huwz[292] = 19849920;
        ly.huwz[293] = 2006963693;
        ly.huwz[294] = 254728593;
        ly.huwz[295] = 1223013701;
        ly.huwz[296] = 369214674;
        ly.huwz[297] = 1245261476;
        ly.huwz[298] = -113084722;
        ly.huwz[299] = 775523911;
    }

    private static /* synthetic */ void hvsa() {
        ly.huwz[0] = 1017106946;
        ly.huwz[1] = 1458066330;
        ly.huwz[2] = -1364414530;
        ly.huwz[3] = -956535514;
        ly.huwz[4] = 5298226;
        ly.huwz[5] = -312923692;
        ly.huwz[6] = -1127320835;
        ly.huwz[7] = 1868502709;
        ly.huwz[8] = -49312706;
        ly.huwz[9] = 1013965702;
        ly.huwz[10] = -1644588787;
        ly.huwz[11] = -268585846;
        ly.huwz[12] = -1525605323;
        ly.huwz[13] = -1864879223;
        ly.huwz[14] = -386927355;
        ly.huwz[15] = -725963759;
        ly.huwz[16] = 2062036655;
        ly.huwz[17] = 663598920;
        ly.huwz[18] = -1702074027;
        ly.huwz[19] = -1215592607;
        ly.huwz[20] = 708306417;
        ly.huwz[21] = 1951751044;
        ly.huwz[22] = 1416336325;
        ly.huwz[23] = -1049380713;
        ly.huwz[24] = -1072849594;
        ly.huwz[25] = -1133689665;
        ly.huwz[26] = -358215686;
        ly.huwz[27] = -2132387100;
        ly.huwz[28] = 1737072760;
        ly.huwz[29] = 362682614;
        ly.huwz[30] = -74049372;
        ly.huwz[31] = 1951548132;
        ly.huwz[32] = -1245104198;
        ly.huwz[33] = -1327076648;
        ly.huwz[34] = -997928199;
        ly.huwz[35] = -614032589;
        ly.huwz[36] = 687095913;
        ly.huwz[37] = -321211497;
        ly.huwz[38] = -1698716346;
        ly.huwz[39] = -708742110;
        ly.huwz[40] = 1083339636;
        ly.huwz[41] = -410995718;
        ly.huwz[42] = 97448436;
        ly.huwz[43] = -520108459;
        ly.huwz[44] = -1987637997;
        ly.huwz[45] = 1765172268;
        ly.huwz[46] = 2113893458;
        ly.huwz[47] = 521069828;
        ly.huwz[48] = -1923329091;
        ly.huwz[49] = -477625153;
        ly.huwz[50] = -522434126;
        ly.huwz[51] = -2145447712;
        ly.huwz[52] = -837378068;
        ly.huwz[53] = 1929257816;
        ly.huwz[54] = -2037128199;
        ly.huwz[55] = -874633889;
        ly.huwz[56] = -2019767207;
        ly.huwz[57] = -26891434;
        ly.huwz[58] = -1885180750;
        ly.huwz[59] = -31682706;
        ly.huwz[60] = 1409166758;
        ly.huwz[61] = -341749697;
        ly.huwz[62] = -1094689474;
        ly.huwz[63] = 1315832916;
        ly.huwz[64] = -1715700998;
        ly.huwz[65] = -2093683402;
        ly.huwz[66] = -1380168007;
        ly.huwz[67] = -1652905231;
        ly.huwz[68] = -1933425013;
        ly.huwz[69] = 632333876;
        ly.huwz[70] = -1059895632;
        ly.huwz[71] = -1395872626;
        ly.huwz[72] = 880082206;
        ly.huwz[73] = 316235405;
        ly.huwz[74] = -2008675734;
        ly.huwz[75] = -1118123767;
        ly.huwz[76] = -1881745724;
        ly.huwz[77] = -367800461;
        ly.huwz[78] = -1282252766;
        ly.huwz[79] = -1645353253;
        ly.huwz[80] = 1763517612;
        ly.huwz[81] = 1256559163;
        ly.huwz[82] = -261367527;
        ly.huwz[83] = 1639531913;
        ly.huwz[84] = 1737786017;
        ly.huwz[85] = -271133781;
        ly.huwz[86] = -1367702226;
        ly.huwz[87] = -1693616741;
        ly.huwz[88] = 230029476;
        ly.huwz[89] = 1224449167;
        ly.huwz[90] = -1786977639;
        ly.huwz[91] = -529467054;
        ly.huwz[92] = -1965421418;
        ly.huwz[93] = -1551278845;
        ly.huwz[94] = 1726292550;
        ly.huwz[95] = 1390168111;
        ly.huwz[96] = 629530569;
        ly.huwz[97] = -1182652449;
        ly.huwz[98] = -1519481067;
        ly.huwz[99] = 1800130710;
    }

    private static /* synthetic */ void hvsj() {
        ly.huwu[100] = -6615572278830394388L;
        ly.huwu[101] = -8495888764299178803L;
        ly.huwu[102] = 2204107828453810866L;
        ly.huwu[103] = 348206906514457110L;
        ly.huwu[104] = -130694248088306226L;
        ly.huwu[105] = 6861062777478403088L;
        ly.huwu[106] = -6727220045521374667L;
        ly.huwu[107] = -5635068265073242785L;
        ly.huwu[108] = -1110606915797284630L;
        ly.huwu[109] = 2691004127643937511L;
        ly.huwu[110] = -7724617411438160966L;
        ly.huwu[111] = -7100852792796214169L;
        ly.huwu[112] = 420606889254369937L;
        ly.huwu[113] = -7703537947873078189L;
        ly.huwu[114] = 3580146690196581160L;
        ly.huwu[115] = 1390754878902822359L;
        ly.huwu[116] = -6189037093220536307L;
        ly.huwu[117] = -5409372857050715855L;
        ly.huwu[118] = 2232515173460665543L;
        ly.huwu[119] = -3576656985067060192L;
        ly.huwu[120] = -3529917335381933625L;
        ly.huwu[121] = -868570563345160768L;
        ly.huwu[122] = -6497993133909028814L;
        ly.huwu[123] = 4640731618942765667L;
        ly.huwu[124] = -2324588148443724453L;
        ly.huwu[125] = 4824854783283327357L;
        ly.huwu[126] = -1830470101704610206L;
        ly.huwu[127] = -4437137134955453057L;
        ly.huwu[128] = -4448727748474983442L;
        ly.huwu[129] = -8511404711418425107L;
        ly.huwu[130] = -8312702882624545085L;
        ly.huwu[131] = 5628797267986241410L;
        ly.huwu[132] = 8695883943442632366L;
        ly.huwu[133] = 5356056933613340879L;
        ly.huwu[134] = -5665175614039714500L;
        ly.huwu[135] = -872195664658232699L;
        ly.huwu[136] = -217217260561402007L;
        ly.huwu[137] = -4112549703233147883L;
        ly.huwu[138] = 1125974185909008828L;
        ly.huwu[139] = -2434418686028815219L;
        ly.huwu[140] = 1993562094760393925L;
        ly.huwu[141] = 8190494947584977231L;
        ly.huwu[142] = -2969657450853041727L;
        ly.huwu[143] = 7735039177472570448L;
        ly.huwu[144] = -1327699208320587649L;
        ly.huwu[145] = 894782702809030826L;
        ly.huwu[146] = -2467329115103544112L;
        ly.huwu[147] = -3689515504143615720L;
        ly.huwu[148] = -312229373094900665L;
        ly.huwu[149] = -6198236438488436093L;
        ly.huwu[150] = -6853666154641512986L;
        ly.huwu[151] = -3553081056196128788L;
        ly.huwu[152] = -7341574173533966538L;
        ly.huwu[153] = 5816153738853635495L;
        ly.huwu[154] = 8584357048221756454L;
        ly.huwu[155] = 2886962400051329221L;
        ly.huwu[156] = -8321768230526964231L;
        ly.huwu[157] = -8281072593980230518L;
        ly.huwu[158] = 6285030516999264190L;
        ly.huwu[159] = 302642042534975792L;
        ly.huwu[160] = 4807876792647080567L;
        ly.huwu[161] = -2637194357501374169L;
        ly.huwu[162] = -5921330443117300315L;
        ly.huwu[163] = 7750733798150964155L;
        ly.huwu[164] = -9197385184718063778L;
        ly.huwu[165] = -5564148198741475471L;
        ly.huwu[166] = -2359063675268776995L;
        ly.huwu[167] = 1139047083537021653L;
        ly.huwu[168] = -2963088212451590301L;
        ly.huwu[169] = 4769236474976949497L;
        ly.huwu[170] = 6438677443195493664L;
        ly.huwu[171] = 410844112423592773L;
        ly.huwu[172] = -425145365317537771L;
        ly.huwu[173] = -5555335560652274124L;
        ly.huwu[174] = -2303461448568809282L;
        ly.huwu[175] = -548876336964694720L;
    }

    static {
        huwz = new int[368];
        huxa = new int[368];
        ly.hvsa();
        ly.hvsb();
        ly.hvsc();
        ly.hvsd();
        ly.hvse();
        ly.hvsf();
        ly.hvsg();
        ly.hvsh();
        huwu = new long[176];
        huwv = new long[176];
        ly.hvsi();
        ly.hvsj();
        ly.hvsk();
        ly.hvsl();
        mc = class_310.method_1551();
        START_NANOS = System.nanoTime();
        projectionMatrix = new Matrix4f();
        viewMatrix = new Matrix4f();
        rotationViewMatrix = new Matrix4f();
        inverseViewProjection = new Matrix4f();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$init$0() {
        v0 /* !! */  = ly.pa;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - ly.huww("hvro", huwt(int ), (int)168));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -949379398: {
                    v1 = ly.huww("hvrp", huwt(int ), (int)169);
                    continue block20;
                }
                case -634952213: {
                    break block20;
                }
                case 173737456: {
                    v1 = ly.huww("hvrq", huwt(int ), (int)170);
                    continue block20;
                }
                case 731657231: {
                    v1 = ly.huww("hvrr", huwt(int ), (int)171);
                    continue block20;
                }
            }
            break;
        }
        var2 = ly.c;
        v2 /* !! */  = ly.pa;
        if (true) ** GOTO lbl22
        block21: while (true) {
            v2 /* !! */  = (long)(ly.huww("hvrt", huwt(int ), (int)173) - ly.huww("hvrs", huwt(int ), (int)172));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -634952213: {
                    break block21;
                }
                case 508141373: {
                    continue block21;
                }
            }
            break;
        }
        var1_1 /* !! */  = ly.b;
        v3 /* !! */  = ly.pa;
        if (true) ** GOTO lbl32
        block22: while (true) {
            v3 /* !! */  = (long)(ly.huww("hvrv", huwt(int ), (int)175) - ly.huww("hvru", huwt(int ), (int)174));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -634952213: {
                    break block22;
                }
                case 229198962: {
                    continue block22;
                }
            }
            break;
        }
        var0_2 = ly.a;
        if (!var2) ** GOTO lbl44
        throw null;
        {
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var1_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl44:
                // 1 sources

                if (var0_2 || var0_2) continue block23;
                return "ShaderSky3D Uniforms";
lbl46:
                // 2 sources

                case 0: {
                    var1_1 /* !! */  = (int)ly.huww("hvrw", huwy(int ), (int)364);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl55
                }
lbl51:
                // 2 sources

                case 1: {
                    var1_1 /* !! */  = (int)ly.huww("hvrx", huwy(int ), (int)365);
                    if (!var2) ** GOTO lbl46
                    throw null;
                }
lbl55:
                // 2 sources

                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var1_1 /* !! */  = (int)ly.huww("hvry", huwy(int ), (int)366);
                        if (!var2) ** GOTO lbl51
                        throw null;
                    }
                }
                case 3: 
            }
        }
        var1_1 /* !! */  = (int)ly.huww("hvrz", huwy(int ), (int)367);
        ** while (!var2)
lbl63:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hvsd() {
        ly.huwz[300] = -1421375323;
        ly.huwz[301] = 427629103;
        ly.huwz[302] = 1599852099;
        ly.huwz[303] = -467494854;
        ly.huwz[304] = -327478202;
        ly.huwz[305] = -1921642248;
        ly.huwz[306] = 47599130;
        ly.huwz[307] = -843249433;
        ly.huwz[308] = -640328969;
        ly.huwz[309] = 1745479130;
        ly.huwz[310] = 1648397652;
        ly.huwz[311] = 246510292;
        ly.huwz[312] = 38634866;
        ly.huwz[313] = 853060200;
        ly.huwz[314] = -1194897240;
        ly.huwz[315] = -1632048979;
        ly.huwz[316] = -500904430;
        ly.huwz[317] = -1652386304;
        ly.huwz[318] = -810562953;
        ly.huwz[319] = 1612740523;
        ly.huwz[320] = -655087898;
        ly.huwz[321] = 2116189176;
        ly.huwz[322] = -1928254310;
        ly.huwz[323] = -1552623749;
        ly.huwz[324] = -265655549;
        ly.huwz[325] = 2064985608;
        ly.huwz[326] = -1621874323;
        ly.huwz[327] = 665272318;
        ly.huwz[328] = -208470735;
        ly.huwz[329] = 1402104765;
        ly.huwz[330] = 1837389868;
        ly.huwz[331] = 1198782382;
        ly.huwz[332] = 886869063;
        ly.huwz[333] = 1507900675;
        ly.huwz[334] = -1221054585;
        ly.huwz[335] = -469848001;
        ly.huwz[336] = 1842364121;
        ly.huwz[337] = 323173190;
        ly.huwz[338] = -1189139236;
        ly.huwz[339] = -925989588;
        ly.huwz[340] = -1652231231;
        ly.huwz[341] = -226585766;
        ly.huwz[342] = 1825772840;
        ly.huwz[343] = 388819655;
        ly.huwz[344] = 1125693596;
        ly.huwz[345] = 1926745700;
        ly.huwz[346] = -1966268153;
        ly.huwz[347] = -97434284;
        ly.huwz[348] = -76620054;
        ly.huwz[349] = -990911721;
        ly.huwz[350] = 3012626;
        ly.huwz[351] = 113477665;
        ly.huwz[352] = 151545267;
        ly.huwz[353] = -639561;
        ly.huwz[354] = -128719326;
        ly.huwz[355] = -1530967837;
        ly.huwz[356] = 419984786;
        ly.huwz[357] = 1270325468;
        ly.huwz[358] = 369284191;
        ly.huwz[359] = 1740735135;
        ly.huwz[360] = 1561265610;
        ly.huwz[361] = 1196880640;
        ly.huwz[362] = 1612433658;
        ly.huwz[363] = 1085179266;
        ly.huwz[364] = 1401192214;
        ly.huwz[365] = -1625375454;
        ly.huwz[366] = 314544468;
        ly.huwz[367] = -630525745;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$init$1() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ly.pa - ly.huww("hvra", huwt(int ), (int)160)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ly.huww("hvrb", huwy(int ), (int)358)) break;
            v0 /* !! */  = (long)ly.huww("hvrc", huwy(int ), (int)359);
        }
        var2 = ly.c;
        v1 /* !! */  = ly.pa;
        if (true) ** GOTO lbl12
        block12: while (true) {
            v1 /* !! */  = (long)(v2 - ly.huww("hvrd", huwt(int ), (int)161));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1955440370: {
                    v2 = ly.huww("hvre", huwt(int ), (int)162);
                    continue block12;
                }
                case -1043021061: {
                    v2 = ly.huww("hvrf", huwt(int ), (int)163);
                    continue block12;
                }
                case -634952213: {
                    break block12;
                }
                case 940493990: {
                    v2 = ly.huww("hvrg", huwt(int ), (int)164);
                    continue block12;
                }
            }
            break;
        }
        var1_1 = ly.b;
        v3 /* !! */  = ly.pa;
        if (true) ** GOTO lbl29
        block13: while (true) {
            v3 /* !! */  = (long)(v4 - ly.huww("hvrh", huwt(int ), (int)165));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -634952213: {
                    break block13;
                }
                case 775720017: {
                    v4 = ly.huww("hvri", huwt(int ), (int)166);
                    continue block13;
                }
                case 1752709187: {
                    v4 = ly.huww("hvrj", huwt(int ), (int)167);
                    continue block13;
                }
            }
            break;
        }
        var0_2 = ly.a;
        if (var2) {
            throw null;
lbl41:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl44:
        // 1 sources

        return "ShaderSky3D Vertices";
    }

    private static /* synthetic */ float huyj(int n2) {
        return Float.intBitsToFloat(huwz[n2] ^ huxa[n2]);
    }

    private static /* synthetic */ void hvsg() {
        ly.huxa[200] = 887099083;
        ly.huxa[201] = -1441742354;
        ly.huxa[202] = 597017297;
        ly.huxa[203] = 2129557928;
        ly.huxa[204] = -1837066984;
        ly.huxa[205] = 1845291642;
        ly.huxa[206] = 357590604;
        ly.huxa[207] = 76664386;
        ly.huxa[208] = 276135111;
        ly.huxa[209] = -537479992;
        ly.huxa[210] = -767546590;
        ly.huxa[211] = 700617272;
        ly.huxa[212] = -614878479;
        ly.huxa[213] = 1685189753;
        ly.huxa[214] = 361808289;
        ly.huxa[215] = -1961473237;
        ly.huxa[216] = 1817516940;
        ly.huxa[217] = 773211981;
        ly.huxa[218] = 1513867712;
        ly.huxa[219] = -1950502177;
        ly.huxa[220] = 528185616;
        ly.huxa[221] = 1265962490;
        ly.huxa[222] = 1786920290;
        ly.huxa[223] = 1885343281;
        ly.huxa[224] = 1950329437;
        ly.huxa[225] = 1743101503;
        ly.huxa[226] = -719602980;
        ly.huxa[227] = -354386105;
        ly.huxa[228] = -1203608869;
        ly.huxa[229] = 942277175;
        ly.huxa[230] = 1823568820;
        ly.huxa[231] = -387332344;
        ly.huxa[232] = 2006040802;
        ly.huxa[233] = -1026565902;
        ly.huxa[234] = -2091727957;
        ly.huxa[235] = 1408248271;
        ly.huxa[236] = -555653540;
        ly.huxa[237] = -2023347135;
        ly.huxa[238] = -236080130;
        ly.huxa[239] = -2145359014;
        ly.huxa[240] = -1969686615;
        ly.huxa[241] = 1608142801;
        ly.huxa[242] = 2075520743;
        ly.huxa[243] = -206694904;
        ly.huxa[244] = 1930503362;
        ly.huxa[245] = -1847911046;
        ly.huxa[246] = -754391191;
        ly.huxa[247] = 409108803;
        ly.huxa[248] = -1858756448;
        ly.huxa[249] = 876815065;
        ly.huxa[250] = -1996080819;
        ly.huxa[251] = 561072954;
        ly.huxa[252] = -381375778;
        ly.huxa[253] = -209742821;
        ly.huxa[254] = -553679513;
        ly.huxa[255] = -1095878189;
        ly.huxa[256] = 969609117;
        ly.huxa[257] = -1728899045;
        ly.huxa[258] = -1454158307;
        ly.huxa[259] = 395032288;
        ly.huxa[260] = 361087399;
        ly.huxa[261] = 296796591;
        ly.huxa[262] = -629499863;
        ly.huxa[263] = 1795709840;
        ly.huxa[264] = -1916767530;
        ly.huxa[265] = 702335551;
        ly.huxa[266] = -1958128739;
        ly.huxa[267] = -1280483952;
        ly.huxa[268] = -1310375252;
        ly.huxa[269] = -1727506264;
        ly.huxa[270] = -2012312660;
        ly.huxa[271] = -1352762508;
        ly.huxa[272] = 1119526447;
        ly.huxa[273] = -365853507;
        ly.huxa[274] = -496460946;
        ly.huxa[275] = 2084372450;
        ly.huxa[276] = 344238865;
        ly.huxa[277] = -1912784209;
        ly.huxa[278] = -1792513392;
        ly.huxa[279] = -2065053021;
        ly.huxa[280] = -1397565933;
        ly.huxa[281] = 1925461245;
        ly.huxa[282] = 1847222914;
        ly.huxa[283] = -819791691;
        ly.huxa[284] = -187544543;
        ly.huxa[285] = 690627305;
        ly.huxa[286] = 347242831;
        ly.huxa[287] = -773727475;
        ly.huxa[288] = 1056603533;
        ly.huxa[289] = -1080264647;
        ly.huxa[290] = 1953474444;
        ly.huxa[291] = -828957565;
        ly.huxa[292] = 19849921;
        ly.huxa[293] = -1699370870;
        ly.huxa[294] = 254728592;
        ly.huxa[295] = -2006684639;
        ly.huxa[296] = -369214675;
        ly.huxa[297] = 1560540397;
        ly.huxa[298] = 113084721;
        ly.huxa[299] = 569532514;
    }

    public static /* synthetic */ CallSite huww(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void putMatrix(ByteBuffer var0, Matrix4f var1_1) {
        v0 /* !! */  = ly.pa;
        if (true) ** GOTO lbl5
        block106: while (true) {
            v0 /* !! */  = (long)(v1 - ly.huww("hvkt", huwt(int ), (int)63));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1293385664: {
                    v1 = ly.huww("hvku", huwt(int ), (int)64);
                    continue block106;
                }
                case -1026333455: {
                    v1 = ly.huww("hvkv", huwt(int ), (int)65);
                    continue block106;
                }
                case -634952213: {
                    break block106;
                }
                case 103266131: {
                    v1 = ly.huww("hvkw", huwt(int ), (int)66);
                    continue block106;
                }
            }
            break;
        }
        var4_2 = ly.c;
        v2 /* !! */  = ly.pa;
        if (true) ** GOTO lbl22
        block107: while (true) {
            v2 /* !! */  = (long)(v3 - ly.huww("hvkx", huwt(int ), (int)67));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -860451646: {
                    v3 = ly.huww("hvky", huwt(int ), (int)68);
                    continue block107;
                }
                case -634952213: {
                    break block107;
                }
                case 1592733960: {
                    v3 = ly.huww("hvkz", huwt(int ), (int)69);
                    continue block107;
                }
                case 1993544655: {
                    v3 = ly.huww("hvla", huwt(int ), (int)70);
                    continue block107;
                }
            }
            break;
        }
        var3_3 = ly.b;
        v4 /* !! */  = ly.pa;
        if (true) ** GOTO lbl39
        block108: while (true) {
            v4 /* !! */  = (long)(ly.huww("hvlc", huwt(int ), (int)72) - ly.huww("hvlb", huwt(int ), (int)71));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -634952213: {
                    break block108;
                }
                case 2026148221: {
                    continue block108;
                }
            }
            break;
        }
        var2_4 = ly.a;
        if (var4_2) {
            throw null;
lbl47:
            // 5 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl47
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_0 = ly.pa - ly.huww("hvld", huwt(int ), (int)73)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == ly.huww("hvle", huwy(int ), (int)292)) break;
            v5 /* !! */  = (long)ly.huww("hvlf", huwy(int ), (int)293);
        }
        v6 = var1_1.m00();
        v7 /* !! */  = ly.pa;
        if (true) ** GOTO lbl60
        block111: while (true) {
            v7 /* !! */  = (long)(v8 - ly.huww("hvlg", huwt(int ), (int)74));
lbl60:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1916068381: {
                    v8 = ly.huww("hvlh", huwt(int ), (int)75);
                    continue block111;
                }
                case -1126459667: {
                    v8 = ly.huww("hvli", huwt(int ), (int)76);
                    continue block111;
                }
                case -634952213: {
                    break block111;
                }
                case 1246229476: {
                    v8 = ly.huww("hvlj", huwt(int ), (int)77);
                    continue block111;
                }
            }
            break;
        }
        v9 = var0.putFloat(v6);
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_1 = ly.pa - ly.huww("hvlk", huwt(int ), (int)78)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == ly.huww("hvll", huwy(int ), (int)294)) break;
            v10 /* !! */  = (long)ly.huww("hvlm", huwy(int ), (int)295);
        }
        v11 = var1_1.m01();
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_2 = ly.pa - ly.huww("hvln", huwt(int ), (int)79)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == ly.huww("hvlo", huwy(int ), (int)296)) break;
            v12 /* !! */  = (long)ly.huww("hvlp", huwy(int ), (int)297);
        }
        v13 = v9.putFloat(v11);
        v14 /* !! */  = ly.pa;
        if (true) ** GOTO lbl89
        block114: while (true) {
            v14 /* !! */  = (long)(ly.huww("hvlr", huwt(int ), (int)81) - ly.huww("hvlq", huwt(int ), (int)80));
lbl89:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -673613668: {
                    continue block114;
                }
                case -634952213: {
                    break block114;
                }
            }
            break;
        }
        v15 = var1_1.m02();
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_3 = ly.pa - ly.huww("hvls", huwt(int ), (int)82)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v16 /* !! */  == ly.huww("hvlt", huwy(int ), (int)298)) break;
            v16 /* !! */  = (long)ly.huww("hvlu", huwy(int ), (int)299);
        }
        v17 = v13.putFloat(v15);
        v18 /* !! */  = ly.pa;
        if (true) ** GOTO lbl105
        block116: while (true) {
            v18 /* !! */  = (long)(v19 - ly.huww("hvlv", huwt(int ), (int)83));
lbl105:
            // 2 sources

            switch ((int)v18 /* !! */ ) {
                case -1293642773: {
                    v19 = ly.huww("hvlw", huwt(int ), (int)84);
                    continue block116;
                }
                case -1286519936: {
                    v19 = ly.huww("hvlx", huwt(int ), (int)85);
                    continue block116;
                }
                case -634952213: {
                    break block116;
                }
                case -246282131: {
                    v19 = ly.huww("hvly", huwt(int ), (int)86);
                    continue block116;
                }
            }
            break;
        }
        v20 = var1_1.m03();
        v21 /* !! */  = ly.pa;
        if (true) ** GOTO lbl122
        block117: while (true) {
            v21 /* !! */  = (long)(v22 - ly.huww("hvlz", huwt(int ), (int)87));
lbl122:
            // 2 sources

            switch ((int)v21 /* !! */ ) {
                case -634952213: {
                    break block117;
                }
                case 1344170673: {
                    v22 = ly.huww("hvma", huwt(int ), (int)88);
                    continue block117;
                }
                case 2112273587: {
                    v22 = ly.huww("hvmb", huwt(int ), (int)89);
                    continue block117;
                }
            }
            break;
        }
        v17.putFloat(v20);
        if (var2_4 || var2_4) ** GOTO lbl47
        v23 /* !! */  = ly.pa;
        if (true) ** GOTO lbl138
        block118: while (true) {
            v23 /* !! */  = (long)(ly.huww("hvmd", huwt(int ), (int)91) - ly.huww("hvmc", huwt(int ), (int)90));
lbl138:
            // 2 sources

            switch ((int)v23 /* !! */ ) {
                case -1508687201: {
                    continue block118;
                }
                case -634952213: {
                    break block118;
                }
            }
            break;
        }
        v24 = var1_1.m10();
        while (true) {
            if ((v25 /* !! */  = (cfr_temp_4 = ly.pa - ly.huww("hvme", huwt(int ), (int)92)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v25 /* !! */  == ly.huww("hvmf", huwy(int ), (int)300)) break;
            v25 /* !! */  = (long)ly.huww("hvmg", huwy(int ), (int)301);
        }
        v26 = var0.putFloat(v24);
        v27 /* !! */  = ly.pa;
        if (true) ** GOTO lbl154
        block120: while (true) {
            v27 /* !! */  = (long)(v28 - ly.huww("hvmh", huwt(int ), (int)93));
lbl154:
            // 2 sources

            switch ((int)v27 /* !! */ ) {
                case -2018251328: {
                    v28 = ly.huww("hvmi", huwt(int ), (int)94);
                    continue block120;
                }
                case -1952707866: {
                    v28 = ly.huww("hvmj", huwt(int ), (int)95);
                    continue block120;
                }
                case -634952213: {
                    break block120;
                }
            }
            break;
        }
        v29 = var1_1.m11();
        while (true) {
            if ((v30 /* !! */  = (cfr_temp_5 = ly.pa - ly.huww("hvmk", huwt(int ), (int)96)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v30 /* !! */  == ly.huww("hvml", huwy(int ), (int)302)) break;
            v30 /* !! */  = (long)ly.huww("hvmm", huwy(int ), (int)303);
        }
        v31 = v26.putFloat(v29);
        while (true) {
            if ((v32 /* !! */  = (cfr_temp_6 = ly.pa - ly.huww("hvmn", huwt(int ), (int)97)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v32 /* !! */  == ly.huww("hvmo", huwy(int ), (int)304)) break;
            v32 /* !! */  = (long)ly.huww("hvmp", huwy(int ), (int)305);
        }
        v33 = var1_1.m12();
        v34 /* !! */  = ly.pa;
        if (true) ** GOTO lbl180
        block123: while (true) {
            v34 /* !! */  = (long)(v35 - ly.huww("hvmq", huwt(int ), (int)98));
lbl180:
            // 2 sources

            switch ((int)v34 /* !! */ ) {
                case -634952213: {
                    break block123;
                }
                case -617959225: {
                    v35 = ly.huww("hvmr", huwt(int ), (int)99);
                    continue block123;
                }
                case 2142906023: {
                    v35 = ly.huww("hvms", huwt(int ), (int)100);
                    continue block123;
                }
            }
            break;
        }
        v36 = v31.putFloat(v33);
        v37 /* !! */  = ly.pa;
        if (true) ** GOTO lbl194
        block124: while (true) {
            v37 /* !! */  = (long)(v38 - ly.huww("hvmt", huwt(int ), (int)101));
lbl194:
            // 2 sources

            switch ((int)v37 /* !! */ ) {
                case -1917977613: {
                    v38 = ly.huww("hvmu", huwt(int ), (int)102);
                    continue block124;
                }
                case -634952213: {
                    break block124;
                }
                case 393264650: {
                    v38 = ly.huww("hvmv", huwt(int ), (int)103);
                    continue block124;
                }
                case 457671338: {
                    v38 = ly.huww("hvmw", huwt(int ), (int)104);
                    continue block124;
                }
            }
            break;
        }
        v39 = var1_1.m13();
        while (true) {
            if ((v40 /* !! */  = (cfr_temp_7 = ly.pa - ly.huww("hvmx", huwt(int ), (int)105)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v40 /* !! */  == ly.huww("hvmy", huwy(int ), (int)306)) break;
            v40 /* !! */  = (long)ly.huww("hvmz", huwy(int ), (int)307);
        }
        v36.putFloat(v39);
        if (var2_4 || var2_4) ** GOTO lbl47
        while (true) {
            if ((v41 /* !! */  = (cfr_temp_8 = ly.pa - ly.huww("hvna", huwt(int ), (int)106)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v41 /* !! */  == ly.huww("hvnb", huwy(int ), (int)308)) break;
            v41 /* !! */  = (long)ly.huww("hvnc", huwy(int ), (int)309);
        }
        v42 = var1_1.m20();
        v43 /* !! */  = ly.pa;
        if (true) ** GOTO lbl224
        block127: while (true) {
            v43 /* !! */  = (long)(v44 - ly.huww("hvnd", huwt(int ), (int)107));
lbl224:
            // 2 sources

            switch ((int)v43 /* !! */ ) {
                case -1103946291: {
                    v44 = ly.huww("hvne", huwt(int ), (int)108);
                    continue block127;
                }
                case -634952213: {
                    break block127;
                }
                case 489496949: {
                    v44 = ly.huww("hvnf", huwt(int ), (int)109);
                    continue block127;
                }
                case 1563655358: {
                    v44 = ly.huww("hvng", huwt(int ), (int)110);
                    continue block127;
                }
            }
            break;
        }
        v45 = var0.putFloat(v42);
        while (true) {
            if ((v46 /* !! */  = (cfr_temp_9 = ly.pa - ly.huww("hvnh", huwt(int ), (int)111)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v46 /* !! */  == ly.huww("hvni", huwy(int ), (int)310)) break;
            v46 /* !! */  = (long)ly.huww("hvnj", huwy(int ), (int)311);
        }
        v47 = var1_1.m21();
        while (true) {
            if ((v48 /* !! */  = (cfr_temp_10 = ly.pa - ly.huww("hvnk", huwt(int ), (int)112)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
            if (v48 /* !! */  == ly.huww("hvnl", huwy(int ), (int)312)) break;
            v48 /* !! */  = (long)ly.huww("hvnm", huwy(int ), (int)313);
        }
        v49 = v45.putFloat(v47);
        v50 /* !! */  = ly.pa;
        if (true) ** GOTO lbl253
        block130: while (true) {
            v50 /* !! */  = (long)(v51 - ly.huww("hvnn", huwt(int ), (int)113));
lbl253:
            // 2 sources

            switch ((int)v50 /* !! */ ) {
                case -634952213: {
                    break block130;
                }
                case 282387944: {
                    v51 = ly.huww("hvno", huwt(int ), (int)114);
                    continue block130;
                }
                case 290211975: {
                    v51 = ly.huww("hvnp", huwt(int ), (int)115);
                    continue block130;
                }
            }
            break;
        }
        v52 = var1_1.m22();
        v53 /* !! */  = ly.pa;
        if (true) ** GOTO lbl267
        block131: while (true) {
            v53 /* !! */  = (long)(v54 - ly.huww("hvnq", huwt(int ), (int)116));
lbl267:
            // 2 sources

            switch ((int)v53 /* !! */ ) {
                case -666227385: {
                    v54 = ly.huww("hvnr", huwt(int ), (int)117);
                    continue block131;
                }
                case -634952213: {
                    break block131;
                }
                case -53036123: {
                    v54 = ly.huww("hvns", huwt(int ), (int)118);
                    continue block131;
                }
                case 755896554: {
                    v54 = ly.huww("hvnt", huwt(int ), (int)119);
                    continue block131;
                }
            }
            break;
        }
        v55 = v49.putFloat(v52);
        while (true) {
            if ((v56 /* !! */  = (cfr_temp_11 = ly.pa - ly.huww("hvnu", huwt(int ), (int)120)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
            if (v56 /* !! */  == ly.huww("hvnv", huwy(int ), (int)314)) break;
            v56 /* !! */  = (long)ly.huww("hvnw", huwy(int ), (int)315);
        }
        v57 = var1_1.m23();
        while (true) {
            if ((v58 /* !! */  = (cfr_temp_12 = ly.pa - ly.huww("hvnx", huwt(int ), (int)121)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
            if (v58 /* !! */  == ly.huww("hvny", huwy(int ), (int)316)) break;
            v58 /* !! */  = (long)ly.huww("hvnz", huwy(int ), (int)317);
        }
        v55.putFloat(v57);
        if (var2_4 || var2_4) ** GOTO lbl47
        v59 /* !! */  = ly.pa;
        if (true) ** GOTO lbl297
        block134: while (true) {
            v59 /* !! */  = (long)(v60 - ly.huww("hvoa", huwt(int ), (int)122));
lbl297:
            // 2 sources

            switch ((int)v59 /* !! */ ) {
                case -799438371: {
                    v60 = ly.huww("hvob", huwt(int ), (int)123);
                    continue block134;
                }
                case -634952213: {
                    break block134;
                }
                case 78206297: {
                    v60 = ly.huww("hvoc", huwt(int ), (int)124);
                    continue block134;
                }
                case 1838228016: {
                    v60 = ly.huww("hvod", huwt(int ), (int)125);
                    continue block134;
                }
            }
            break;
        }
        v61 = var1_1.m30();
        v62 /* !! */  = ly.pa;
        if (true) ** GOTO lbl314
        block135: while (true) {
            v62 /* !! */  = (long)(v63 - ly.huww("hvoe", huwt(int ), (int)126));
lbl314:
            // 2 sources

            switch ((int)v62 /* !! */ ) {
                case -634952213: {
                    break block135;
                }
                case 640007713: {
                    v63 = ly.huww("hvof", huwt(int ), (int)127);
                    continue block135;
                }
                case 716025596: {
                    v63 = ly.huww("hvog", huwt(int ), (int)128);
                    continue block135;
                }
            }
            break;
        }
        v64 = var0.putFloat(v61);
        v65 /* !! */  = ly.pa;
        if (true) ** GOTO lbl328
        block136: while (true) {
            v65 /* !! */  = (long)(v66 - ly.huww("hvoh", huwt(int ), (int)129));
lbl328:
            // 2 sources

            switch ((int)v65 /* !! */ ) {
                case -841700798: {
                    v66 = ly.huww("hvoi", huwt(int ), (int)130);
                    continue block136;
                }
                case -634952213: {
                    break block136;
                }
                case 1109462741: {
                    v66 = ly.huww("hvoj", huwt(int ), (int)131);
                    continue block136;
                }
                case 1704688601: {
                    v66 = ly.huww("hvok", huwt(int ), (int)132);
                    continue block136;
                }
            }
            break;
        }
        v67 = var1_1.m31();
        v68 /* !! */  = ly.pa;
        if (true) ** GOTO lbl345
        block137: while (true) {
            v68 /* !! */  = (long)(v69 - ly.huww("hvol", huwt(int ), (int)133));
lbl345:
            // 2 sources

            switch ((int)v68 /* !! */ ) {
                case -2011705194: {
                    v69 = ly.huww("hvom", huwt(int ), (int)134);
                    continue block137;
                }
                case -634952213: {
                    break block137;
                }
                case -593335127: {
                    v69 = ly.huww("hvon", huwt(int ), (int)135);
                    continue block137;
                }
            }
            break;
        }
        v70 = v64.putFloat(v67);
        v71 /* !! */  = ly.pa;
        if (true) ** GOTO lbl359
        block138: while (true) {
            v71 /* !! */  = (long)(v72 - ly.huww("hvoo", huwt(int ), (int)136));
lbl359:
            // 2 sources

            switch ((int)v71 /* !! */ ) {
                case -634952213: {
                    break block138;
                }
                case 1104318809: {
                    v72 = ly.huww("hvop", huwt(int ), (int)137);
                    continue block138;
                }
                case 1279503244: {
                    v72 = ly.huww("hvoq", huwt(int ), (int)138);
                    continue block138;
                }
                case 1290571240: {
                    v72 = ly.huww("hvor", huwt(int ), (int)139);
                    continue block138;
                }
            }
            break;
        }
        v73 = var1_1.m32();
        v74 /* !! */  = ly.pa;
        if (true) ** GOTO lbl376
        block139: while (true) {
            v74 /* !! */  = (long)(ly.huww("hvot", huwt(int ), (int)141) - ly.huww("hvos", huwt(int ), (int)140));
lbl376:
            // 2 sources

            switch ((int)v74 /* !! */ ) {
                case -634952213: {
                    break block139;
                }
                case 182933753: {
                    continue block139;
                }
            }
            break;
        }
        v75 = v70.putFloat(v73);
        while (true) {
            if ((v76 /* !! */  = (cfr_temp_13 = ly.pa - ly.huww("hvou", huwt(int ), (int)142)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
            if (v76 /* !! */  == ly.huww("hvov", huwy(int ), (int)318)) break;
            v76 /* !! */  = (long)ly.huww("hvow", huwy(int ), (int)319);
        }
        v77 = var1_1.m33();
        while (true) {
            if ((v78 /* !! */  = (cfr_temp_14 = ly.pa - ly.huww("hvox", huwt(int ), (int)143)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
            if (v78 /* !! */  == ly.huww("hvoy", huwy(int ), (int)320)) break;
            v78 /* !! */  = (long)ly.huww("hvoz", huwy(int ), (int)321);
        }
        v75.putFloat(v77);
        ** while (var2_4 || var2_4)
lbl395:
        // 1 sources

    }

    private static /* synthetic */ int huwy(int n2) {
        return huwz[n2] ^ huxa[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void setMatrices(Matrix4f var0, Matrix4f var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ly.pa - ly.huww("huwx", huwt(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ly.huww("huxb", huwy(int ), (int)0)) break;
            v0 /* !! */  = (long)ly.huww("huxc", huwy(int ), (int)1);
        }
        var4_2 = ly.c;
        v1 /* !! */  = ly.pa;
        if (true) ** GOTO lbl11
        block21: while (true) {
            v1 /* !! */  = (long)(v2 - ly.huww("huxd", huwt(int ), (int)1));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -917693336: {
                    v2 = ly.huww("huxe", huwt(int ), (int)2);
                    continue block21;
                }
                case -634952213: {
                    break block21;
                }
                case -532264920: {
                    v2 = ly.huww("huxf", huwt(int ), (int)3);
                    continue block21;
                }
                case 426688937: {
                    v2 = ly.huww("huxg", huwt(int ), (int)4);
                    continue block21;
                }
            }
            break;
        }
        var3_3 /* !! */  = ly.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = ly.pa - ly.huww("huxh", huwt(int ), (int)5)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == ly.huww("huxi", huwy(int ), (int)2)) break;
                    v3 /* !! */  = (long)ly.huww("huxj", huwy(int ), (int)3);
                }
                var2_4 = ly.a;
                if (var4_2) {
                    throw null;
lbl35:
                    // 3 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl35
                v4 /* !! */  = ly.pa;
                if (true) ** GOTO lbl42
                block24: while (true) {
                    v4 /* !! */  = (long)(ly.huww("huxl", huwt(int ), (int)7) - ly.huww("huxk", huwt(int ), (int)6));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1740552265: {
                            continue block24;
                        }
                        case -634952213: {
                            break block24;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = ly.pa - ly.huww("huxm", huwt(int ), (int)8)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ly.huww("huxn", huwy(int ), (int)4)) break;
                    v5 /* !! */  = (long)ly.huww("huxo", huwy(int ), (int)5);
                }
                ly.projectionMatrix.set((Matrix4fc)var0);
                if (var2_4 || var2_4) ** GOTO lbl35
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = ly.pa - ly.huww("huxp", huwt(int ), (int)9)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ly.huww("huxq", huwy(int ), (int)6)) break;
                    v6 /* !! */  = (long)ly.huww("huxr", huwy(int ), (int)7);
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_4 = ly.pa - ly.huww("huxs", huwt(int ), (int)10)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == ly.huww("huxt", huwy(int ), (int)8)) break;
                    v7 /* !! */  = (long)ly.huww("huxu", huwy(int ), (int)9);
                }
                ly.viewMatrix.set((Matrix4fc)var1_1);
                if (var2_4 || var2_4) ** continue;
                return;
            }
lbl67:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)ly.huww("huxv", huwy(int ), (int)10);
                if (var4_2) {
                    throw null;
                }
            }
lbl71:
            // 5 sources

            case 1: {
                var3_3 /* !! */  = (int)ly.huww("huxw", huwy(int ), (int)11);
                if (!var4_2) ** GOTO lbl67
                throw null;
            }
lbl75:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)ly.huww("huxx", huwy(int ), (int)12);
                if (!var4_2) ** GOTO lbl71
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)ly.huww("huxy", huwy(int ), (int)13);
                if (var4_2) {
                    throw null;
                }
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ly.huww("huxz", huwy(int ), (int)14);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl93
                    break;
                }
            }
            case 5: {
                var3_3 /* !! */  = (int)ly.huww("huya", huwy(int ), (int)15);
                if (!var4_2) ** GOTO lbl71
                throw null;
            }
lbl93:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)ly.huww("huyb", huwy(int ), (int)16);
                if (!var4_2) ** GOTO lbl75
                throw null;
            }
            case 7: 
        }
        var3_3 /* !! */  = (int)ly.huww("huyc", huwy(int ), (int)17);
        ** while (!var4_2)
lbl100:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hvsk() {
        ly.huwv[0] = -8363647496599371327L;
        ly.huwv[1] = -6641488044269699172L;
        ly.huwv[2] = 5585151043691482703L;
        ly.huwv[3] = -619863878471220695L;
        ly.huwv[4] = 8793090556385862466L;
        ly.huwv[5] = 491434769114180215L;
        ly.huwv[6] = 8230632123167578924L;
        ly.huwv[7] = 7019621148983982727L;
        ly.huwv[8] = 2192472583181922528L;
        ly.huwv[9] = -7656065615113753689L;
        ly.huwv[10] = 7944870524377341423L;
        ly.huwv[11] = -2098940549907349956L;
        ly.huwv[12] = -2732296547752811102L;
        ly.huwv[13] = 5610120830086644840L;
        ly.huwv[14] = -4521753015372499684L;
        ly.huwv[15] = 8719398596949007636L;
        ly.huwv[16] = -1997178749434756164L;
        ly.huwv[17] = 7869688499008896701L;
        ly.huwv[18] = 7318737354362346851L;
        ly.huwv[19] = -7616044514687170540L;
        ly.huwv[20] = -6697870810426263726L;
        ly.huwv[21] = -2175300981190023496L;
        ly.huwv[22] = -8498217647586008733L;
        ly.huwv[23] = 8590004349410952123L;
        ly.huwv[24] = 3940812639937740058L;
        ly.huwv[25] = -4417665461625559184L;
        ly.huwv[26] = -7656500292076019112L;
        ly.huwv[27] = -4720808231543254603L;
        ly.huwv[28] = -1417172614939890624L;
        ly.huwv[29] = 6691227084749341139L;
        ly.huwv[30] = -3558445117354419526L;
        ly.huwv[31] = 2056824595809727167L;
        ly.huwv[32] = 386667955941778037L;
        ly.huwv[33] = -1605756537458547585L;
        ly.huwv[34] = 1929249932717436263L;
        ly.huwv[35] = -196797140518052844L;
        ly.huwv[36] = 5740041963110148257L;
        ly.huwv[37] = 5886426011992920752L;
        ly.huwv[38] = 3584991108772888221L;
        ly.huwv[39] = 2559929888011207134L;
        ly.huwv[40] = 4711286643676165837L;
        ly.huwv[41] = 3354031314776810322L;
        ly.huwv[42] = -1035388209475193467L;
        ly.huwv[43] = -3294585504641291976L;
        ly.huwv[44] = -423981954654855935L;
        ly.huwv[45] = 7172455053248174950L;
        ly.huwv[46] = 8657810978842706668L;
        ly.huwv[47] = -8842039758405758985L;
        ly.huwv[48] = -5105605164570849610L;
        ly.huwv[49] = -4555987412196667097L;
        ly.huwv[50] = 2154406110446238569L;
        ly.huwv[51] = -1755516565606119530L;
        ly.huwv[52] = 5798003488144770251L;
        ly.huwv[53] = -8714430628770894435L;
        ly.huwv[54] = -3881242080763963947L;
        ly.huwv[55] = -4674387174420943915L;
        ly.huwv[56] = -2049638265190898618L;
        ly.huwv[57] = 36255291021044488L;
        ly.huwv[58] = 2472396245651124863L;
        ly.huwv[59] = 2291782103730220260L;
        ly.huwv[60] = -6240363070932363218L;
        ly.huwv[61] = -4867513568731189514L;
        ly.huwv[62] = -9187230321703907185L;
        ly.huwv[63] = 7968015970742225096L;
        ly.huwv[64] = -2182603180200810436L;
        ly.huwv[65] = 6604175383260669277L;
        ly.huwv[66] = -184048950851826860L;
        ly.huwv[67] = -1762095037813915122L;
        ly.huwv[68] = -7977228666505834356L;
        ly.huwv[69] = 8605942395659210811L;
        ly.huwv[70] = 1964285930016877917L;
        ly.huwv[71] = -6079258275576200258L;
        ly.huwv[72] = -4671710956640801713L;
        ly.huwv[73] = 320626805370566496L;
        ly.huwv[74] = 296895587918636174L;
        ly.huwv[75] = 8757814632272866989L;
        ly.huwv[76] = 4390183070470136396L;
        ly.huwv[77] = 4779277203653793502L;
        ly.huwv[78] = -2723619154726445208L;
        ly.huwv[79] = -7520337391447192589L;
        ly.huwv[80] = -3761620811903932947L;
        ly.huwv[81] = 6459334588729225468L;
        ly.huwv[82] = 8485237192372149567L;
        ly.huwv[83] = -1013550805922807059L;
        ly.huwv[84] = -5750520019566254111L;
        ly.huwv[85] = -6011560573180037237L;
        ly.huwv[86] = -4838487195783223685L;
        ly.huwv[87] = 8091795494389746928L;
        ly.huwv[88] = -2126954224597266361L;
        ly.huwv[89] = -6219547625649385687L;
        ly.huwv[90] = 811015470536139400L;
        ly.huwv[91] = -8810217397127567184L;
        ly.huwv[92] = -3178429208446106373L;
        ly.huwv[93] = 873016508059315311L;
        ly.huwv[94] = 4454787818805140381L;
        ly.huwv[95] = -7845908723572485477L;
        ly.huwv[96] = 9056991870471009633L;
        ly.huwv[97] = 1425735680087109208L;
        ly.huwv[98] = -7242170638317069857L;
        ly.huwv[99] = 2726241896993800008L;
    }

    private static /* synthetic */ void hvsi() {
        ly.huwu[0] = -1567705686960812147L;
        ly.huwu[1] = -401776101497886503L;
        ly.huwu[2] = -8502983177544450591L;
        ly.huwu[3] = -4188748553593477924L;
        ly.huwu[4] = -4510859358274821248L;
        ly.huwu[5] = -5972604771963526942L;
        ly.huwu[6] = -8538344456308292994L;
        ly.huwu[7] = -5242471004024471383L;
        ly.huwu[8] = 2264512915949642457L;
        ly.huwu[9] = -3145267700581195962L;
        ly.huwu[10] = -500947449891925766L;
        ly.huwu[11] = -2098940549907349940L;
        ly.huwu[12] = -7770994828278926541L;
        ly.huwu[13] = -1275410774672383290L;
        ly.huwu[14] = 8496163369822300299L;
        ly.huwu[15] = -394110385911265691L;
        ly.huwu[16] = -1124420620846598430L;
        ly.huwu[17] = 7333886006609769090L;
        ly.huwu[18] = -158017960263717437L;
        ly.huwu[19] = 4863968781567222739L;
        ly.huwu[20] = -8845772107667487497L;
        ly.huwu[21] = 3062916920877851438L;
        ly.huwu[22] = -2286312505794081822L;
        ly.huwu[23] = 6566541830349618039L;
        ly.huwu[24] = 7575122441616923840L;
        ly.huwu[25] = -2398403450843258727L;
        ly.huwu[26] = 5338644770859142747L;
        ly.huwu[27] = 4830247531023258987L;
        ly.huwu[28] = -3765846252747331579L;
        ly.huwu[29] = 238331501815246472L;
        ly.huwu[30] = -7960017594703294307L;
        ly.huwu[31] = 1375556661073879096L;
        ly.huwu[32] = -1129945062775873376L;
        ly.huwu[33] = 6205430731248629617L;
        ly.huwu[34] = 6389078459243256672L;
        ly.huwu[35] = 2469965025060385935L;
        ly.huwu[36] = 4101552799714349739L;
        ly.huwu[37] = -6136828277500048424L;
        ly.huwu[38] = 4245680526600025691L;
        ly.huwu[39] = 7092480518476375092L;
        ly.huwu[40] = 352134413189796499L;
        ly.huwu[41] = -1855718370377757343L;
        ly.huwu[42] = 9059284719459020963L;
        ly.huwu[43] = 7957866778121191386L;
        ly.huwu[44] = 4530867400348288707L;
        ly.huwu[45] = 4010224696081681775L;
        ly.huwu[46] = -3033037968612776007L;
        ly.huwu[47] = -4285440256077459465L;
        ly.huwu[48] = 3228903601200910517L;
        ly.huwu[49] = 4332798972931670801L;
        ly.huwu[50] = 4913804696481962765L;
        ly.huwu[51] = -1849589449385471572L;
        ly.huwu[52] = -7967676269431871325L;
        ly.huwu[53] = 8891417565995756057L;
        ly.huwu[54] = 7070866345223366011L;
        ly.huwu[55] = -1259933310908054517L;
        ly.huwu[56] = -3586281650929062470L;
        ly.huwu[57] = -1196154331094654773L;
        ly.huwu[58] = 5521800045087164087L;
        ly.huwu[59] = -2645925343338417120L;
        ly.huwu[60] = -7139531304450328819L;
        ly.huwu[61] = 4951848759058980470L;
        ly.huwu[62] = 2201901659183737121L;
        ly.huwu[63] = -5386626628483483259L;
        ly.huwu[64] = 453854778125388238L;
        ly.huwu[65] = -5924443524384674180L;
        ly.huwu[66] = -5481108708790684814L;
        ly.huwu[67] = 4134235756332587725L;
        ly.huwu[68] = -2663404574614790151L;
        ly.huwu[69] = -2245369792942097725L;
        ly.huwu[70] = 4305906277006835621L;
        ly.huwu[71] = 608321706835441362L;
        ly.huwu[72] = -6426309729315501187L;
        ly.huwu[73] = -7203213078242177441L;
        ly.huwu[74] = -7160390248496333609L;
        ly.huwu[75] = 3385832169224203445L;
        ly.huwu[76] = -145580736222238761L;
        ly.huwu[77] = 3554411113795346719L;
        ly.huwu[78] = 7665438076592250544L;
        ly.huwu[79] = -8791769616287687064L;
        ly.huwu[80] = -5493229525591904394L;
        ly.huwu[81] = -2213366154889878455L;
        ly.huwu[82] = 2603114963409162514L;
        ly.huwu[83] = -6299043748720576666L;
        ly.huwu[84] = 6818029271255230268L;
        ly.huwu[85] = -6355096206928635781L;
        ly.huwu[86] = 623738200226123233L;
        ly.huwu[87] = -5111915803445174200L;
        ly.huwu[88] = 9160603439718491312L;
        ly.huwu[89] = 664705963110507646L;
        ly.huwu[90] = 2623850367607796587L;
        ly.huwu[91] = -55072717675098130L;
        ly.huwu[92] = -6242833715835637024L;
        ly.huwu[93] = -303969833084804652L;
        ly.huwu[94] = -1682343267680641743L;
        ly.huwu[95] = -8909313340894722366L;
        ly.huwu[96] = -8773059831041207707L;
        ly.huwu[97] = -3838832615704143531L;
        ly.huwu[98] = -4018997909632403066L;
        ly.huwu[99] = -9184465587486541149L;
    }

    private static /* synthetic */ void hvsl() {
        ly.huwv[100] = -3505657150333722824L;
        ly.huwv[101] = 11015479735655236L;
        ly.huwv[102] = -2722963341911847814L;
        ly.huwv[103] = 447225268302784873L;
        ly.huwv[104] = -6604166531611695928L;
        ly.huwv[105] = 8834695498929836848L;
        ly.huwv[106] = -4992182883945140029L;
        ly.huwv[107] = -429533203322127664L;
        ly.huwv[108] = 7272547971903299657L;
        ly.huwv[109] = 1401525261909673375L;
        ly.huwv[110] = -1130703671287341018L;
        ly.huwv[111] = -1654034583414875802L;
        ly.huwv[112] = 7979905061117246428L;
        ly.huwv[113] = 1385268532911718155L;
        ly.huwv[114] = 3966270668828662757L;
        ly.huwv[115] = -2604074500950447766L;
        ly.huwv[116] = -8610683136168785961L;
        ly.huwv[117] = 7896941450925312810L;
        ly.huwv[118] = 5256427434353652305L;
        ly.huwv[119] = 315684516377662672L;
        ly.huwv[120] = -823186850721225454L;
        ly.huwv[121] = -497642558898546271L;
        ly.huwv[122] = -5273910267421366655L;
        ly.huwv[123] = 8772116302752954409L;
        ly.huwv[124] = -8930018752409089118L;
        ly.huwv[125] = 1404671733834643740L;
        ly.huwv[126] = 7205492636645954073L;
        ly.huwv[127] = -4355589909697806588L;
        ly.huwv[128] = -3656172645992107245L;
        ly.huwv[129] = -8224866063582415758L;
        ly.huwv[130] = 1297077462590814727L;
        ly.huwv[131] = 1151660906396169552L;
        ly.huwv[132] = 4250664288844060202L;
        ly.huwv[133] = 8996614537520119678L;
        ly.huwv[134] = -120960161497559256L;
        ly.huwv[135] = 1412215103570401437L;
        ly.huwv[136] = -5677735053002534640L;
        ly.huwv[137] = 5657254105779289385L;
        ly.huwv[138] = -190299641942195313L;
        ly.huwv[139] = 5584157577772100813L;
        ly.huwv[140] = -3379164015571427232L;
        ly.huwv[141] = 814604496916408306L;
        ly.huwv[142] = -8217342376538440445L;
        ly.huwv[143] = 4642203096680004524L;
        ly.huwv[144] = 7574639960861245L;
        ly.huwv[145] = -8621337110791836295L;
        ly.huwv[146] = -5041013834668769864L;
        ly.huwv[147] = 2888469680176177639L;
        ly.huwv[148] = 2573230848098504005L;
        ly.huwv[149] = -5422091853859121352L;
        ly.huwv[150] = -9049170136269066139L;
        ly.huwv[151] = -3230536641276385854L;
        ly.huwv[152] = -8479522187345028509L;
        ly.huwv[153] = 4715544867077508048L;
        ly.huwv[154] = 1375682367955207587L;
        ly.huwv[155] = -4041726531438379823L;
        ly.huwv[156] = -7889437989050517952L;
        ly.huwv[157] = -249118047273683745L;
        ly.huwv[158] = -3821599323752016497L;
        ly.huwv[159] = -8149206876792173634L;
        ly.huwv[160] = 6402015482366215186L;
        ly.huwv[161] = -2316124664166536013L;
        ly.huwv[162] = 8603021792015326175L;
        ly.huwv[163] = 7959247524532704372L;
        ly.huwv[164] = 7694560068274618789L;
        ly.huwv[165] = -1631815593027369856L;
        ly.huwv[166] = 4740366197449650697L;
        ly.huwv[167] = 215649708165083632L;
        ly.huwv[168] = -6528399551383758591L;
        ly.huwv[169] = 8161469989152336520L;
        ly.huwv[170] = -4184602552568712965L;
        ly.huwv[171] = -6578541164400338654L;
        ly.huwv[172] = -417101225461516348L;
        ly.huwv[173] = -5657923353008681041L;
        ly.huwv[174] = 6597246917985219235L;
        ly.huwv[175] = -5236241182898540672L;
    }

    /*
     * Exception decompiling
     */
    private static void init() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[CASE]
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
    private static void putColor(ByteBuffer var0, int var1_1) {
        v0 /* !! */  = ly.pa;
        if (true) ** GOTO lbl5
        block25: while (true) {
            v0 /* !! */  = (long)(v1 - ly.huww("hvjf", huwt(int ), (int)48));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -634952213: {
                    break block25;
                }
                case -600426187: {
                    v1 = ly.huww("hvjg", huwt(int ), (int)49);
                    continue block25;
                }
                case 1978587138: {
                    v1 = ly.huww("hvjh", huwt(int ), (int)50);
                    continue block25;
                }
            }
            break;
        }
        var4_2 = ly.c;
        v2 /* !! */  = ly.pa;
        if (true) ** GOTO lbl19
        block26: while (true) {
            v2 /* !! */  = (long)(v3 - ly.huww("hvji", huwt(int ), (int)51));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2052138762: {
                    v3 = ly.huww("hvjj", huwt(int ), (int)52);
                    continue block26;
                }
                case -634952213: {
                    break block26;
                }
                case 1521349378: {
                    v3 = ly.huww("hvjk", huwt(int ), (int)53);
                    continue block26;
                }
                case 1832764614: {
                    v3 = ly.huww("hvjl", huwt(int ), (int)54);
                    continue block26;
                }
            }
            break;
        }
        var3_3 /* !! */  = ly.b;
        v4 /* !! */  = ly.pa;
        if (true) ** GOTO lbl36
        block27: while (true) {
            v4 /* !! */  = (long)(v5 - ly.huww("hvjm", huwt(int ), (int)55));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1700879630: {
                    v5 = ly.huww("hvjn", huwt(int ), (int)56);
                    continue block27;
                }
                case -634952213: {
                    break block27;
                }
                case 596572972: {
                    v5 = ly.huww("hvjo", huwt(int ), (int)57);
                    continue block27;
                }
                case 1595471857: {
                    v5 = ly.huww("hvjp", huwt(int ), (int)58);
                    continue block27;
                }
            }
            break;
        }
        var2_4 = ly.a;
        if (var4_2) {
            throw null;
lbl51:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl51
        v6 = (float)(var1_1 >> ly.huww("hvjq", huwy(int ), (int)267) & ly.huww("hvjr", huwy(int ), (int)268)) / ly.huww("hvjs", huyj(int ), (int)269);
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_0 = ly.pa - ly.huww("hvjt", huwt(int ), (int)59)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == ly.huww("hvju", huwy(int ), (int)270)) break;
            v7 /* !! */  = (long)ly.huww("hvjv", huwy(int ), (int)271);
        }
        v8 = var0.putFloat(v6);
        v9 = (float)(var1_1 >> ly.huww("hvjw", huwy(int ), (int)272) & ly.huww("hvjx", huwy(int ), (int)273)) / ly.huww("hvjy", huyj(int ), (int)274);
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_1 = ly.pa - ly.huww("hvjz", huwt(int ), (int)60)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == ly.huww("hvka", huwy(int ), (int)275)) break;
            v10 /* !! */  = (long)ly.huww("hvkb", huwy(int ), (int)276);
        }
        v11 = v8.putFloat(v9);
        v12 = (float)(var1_1 & ly.huww("hvkc", huwy(int ), (int)277)) / ly.huww("hvkd", huyj(int ), (int)278);
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_2 = ly.pa - ly.huww("hvke", huwt(int ), (int)61)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == ly.huww("hvkf", huwy(int ), (int)279)) break;
            v13 /* !! */  = (long)ly.huww("hvkg", huwy(int ), (int)280);
        }
        v14 = v11.putFloat(v12);
        v15 = (float)(var1_1 >>> ly.huww("hvkh", huwy(int ), (int)281) & ly.huww("hvki", huwy(int ), (int)282)) / ly.huww("hvkj", huyj(int ), (int)283);
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_3 = ly.pa - ly.huww("hvkk", huwt(int ), (int)62)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v16 /* !! */  == ly.huww("hvkl", huwy(int ), (int)284)) break;
            v16 /* !! */  = (long)ly.huww("hvkm", huwy(int ), (int)285);
        }
        v14.putFloat(v15);
        ** while (var2_4 || var2_4)
lbl83:
        // 1 sources

        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)ly.huww("hvkn", huwy(int ), (int)286);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl106
            }
lbl92:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ly.huww("hvko", huwy(int ), (int)287);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl106
                    break;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)ly.huww("hvkp", huwy(int ), (int)288);
                if (!var4_2) ** GOTO lbl92
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)ly.huww("hvkq", huwy(int ), (int)289);
                if (var4_2) {
                    throw null;
                }
            }
lbl106:
            // 5 sources

            case 4: {
                var3_3 /* !! */  = (int)ly.huww("hvkr", huwy(int ), (int)290);
                if (!var4_2) break;
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)ly.huww("hvks", huwy(int ), (int)291);
        ** while (!var4_2)
lbl113:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void render(jo var0) {
        block240: {
            block239: {
                block238: {
                    block237: {
                        block236: {
                            block235: {
                                var14_1 = ly.c;
                                var13_2 /* !! */  = ly.b;
                                var12_3 = ly.a;
                                if (var14_1) {
                                    throw null;
lbl6:
                                    // 68 sources

                                    return;
                                }
                                if (var12_3 || var12_3) ** GOTO lbl6
                                ly.init();
                                if (var12_3 || var12_3) ** GOTO lbl6
                                if (ly.auroraPipeline == null) break block235;
                                if (var12_3) ** GOTO lbl6
                                if (ly.compositePipeline == null) break block235;
                                if (var12_3) ** GOTO lbl6
                                if (ly.uniformBuffer == null) break block235;
                                if (var12_3) ** GOTO lbl6
                                if (ly.vertexBuffer != null) break block236;
                                if (var12_3) ** GOTO lbl6
                            }
                            if (var12_3 || var12_3) ** GOTO lbl6
                            return;
                        }
                        if (var12_3 || var12_3) ** GOTO lbl6
                        var1_4 = ly.mc.method_1522();
                        if (var12_3 || var12_3) ** GOTO lbl6
                        if (var1_4 == null) break block237;
                        if (var12_3) ** GOTO lbl6
                        if (var1_4.method_71639() != null) break block238;
                        if (var12_3) ** GOTO lbl6
                    }
                    if (var12_3 || var12_3) ** GOTO lbl6
                    return;
                }
                if (var12_3 || var12_3) ** GOTO lbl6
                ly.ensureTarget(var1_4.field_1482, var1_4.field_1481);
                if (var12_3 || var12_3) ** GOTO lbl6
                if (ly.skyTextureView != null) break block239;
                if (var12_3 || var12_3) ** GOTO lbl6
                return;
            }
            if (var12_3 || var12_3) ** GOTO lbl6
            if (!var0.mode.isSelected("\u0427\u0451\u0440\u043d\u0430\u044f \u0434\u044b\u0440\u0430")) break block240;
            if (var12_3 || var12_3) ** GOTO lbl6
            var2_5 = ly.blackHolePipeline;
            if (var12_3 || var12_3) ** GOTO lbl6
            if (var14_1) {
                throw null;
            }
            ** GOTO lbl64
        }
        if (var12_3 || var12_3) ** GOTO lbl6
        if (var13_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var13_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var0.mode.isSelected("\u0413\u0430\u043b\u0430\u043a\u0442\u0438\u043a\u0430")) ** GOTO lbl61
                if (var12_3 || var12_3) ** GOTO lbl6
                var2_5 = ly.galaxyPipeline;
                if (var12_3 || var12_3) ** GOTO lbl6
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl64
lbl61:
                // 1 sources

                if (var12_3 || var12_3) ** GOTO lbl6
                var2_5 = ly.auroraPipeline;
                if (var12_3) ** GOTO lbl6
lbl64:
                // 3 sources

                if (var12_3 || var12_3) ** GOTO lbl6
                var3_6 = ly.rotationViewMatrix.set((Matrix4fc)ly.viewMatrix).setTranslation(0.0f, 0.0f, 0.0f);
                if (var12_3 || var12_3) ** GOTO lbl6
                var4_7 = ly.inverseViewProjection.set((Matrix4fc)ly.projectionMatrix).mul((Matrix4fc)var3_6).invert();
                if (var12_3 || var12_3) ** GOTO lbl6
                var5_8 = (float)((double)(System.nanoTime() - ly.START_NANOS) / ly.huww("hvej", hvei(int ), (int)47)) * var0.speed.getValue();
                if (var12_3 || var12_3) ** GOTO lbl6
                var6_9 = om.acquire((int)ly.huww("hvek", huwy(int ), (int)142), (int)ly.huww("hvel", huwy(int ), (int)143));
                if (var12_3 || var12_3) ** GOTO lbl6
                ly.putMatrix(var6_9, var4_7);
                if (var12_3 || var12_3) ** GOTO lbl6
                ly.putColor(var6_9, var0.getPrimaryColor());
                if (var12_3 || var12_3) ** GOTO lbl6
                ly.putColor(var6_9, var0.getSecondaryColor());
                if (var12_3 || var12_3) ** GOTO lbl6
                var6_9.putFloat(var5_8).putFloat(var0.brightness.getValue()).putFloat(0.0f).putFloat(0.0f);
                if (var12_3 || var12_3) ** GOTO lbl6
                var6_9.flip();
                if (var12_3 || var12_3) ** GOTO lbl6
                var7_10 = RenderSystem.getDevice().createCommandEncoder();
                if (var12_3 || var12_3) ** GOTO lbl6
                var7_10.writeToBuffer(ly.uniformBuffer.slice(), var6_9);
                if (var12_3 || var12_3) ** GOTO lbl6
                var8_11 = var7_10.createRenderPass((Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$render$3(), ()Ljava/lang/String;)(), ly.skyTextureView, OptionalInt.empty());
                if (var12_3) ** GOTO lbl6
                try {
                    if (var12_3) ** GOTO lbl6
                    var8_11.setPipeline(var2_5);
                    if (var12_3 || var12_3) ** GOTO lbl6
                    var8_11.setUniform("SkyData", ly.uniformBuffer);
                    if (var12_3 || var12_3) ** GOTO lbl6
                    var8_11.setVertexBuffer((int)ly.huww("hvem", huwy(int ), (int)144), ly.vertexBuffer);
                    if (var12_3 || var12_3) ** GOTO lbl6
                    var8_11.draw((int)ly.huww("hven", huwy(int ), (int)145), (int)ly.huww("hveo", huwy(int ), (int)146));
                    if (var12_3 || var12_3) ** GOTO lbl6
                    if (var8_11 == null) ** GOTO lbl125
                    if (var12_3) ** GOTO lbl6
                }
                catch (Throwable var9_12) {
                    if (var12_3) ** GOTO lbl6
                    if (var8_11 == null) ** GOTO lbl118
                    if (var12_3) ** GOTO lbl6
                    try {
                        if (var12_3) ** GOTO lbl6
                        var8_11.close();
                        if (var12_3 || var12_3) ** GOTO lbl6
                        ** if (!var14_1) goto lbl-1000
                    }
                    catch (Throwable var10_14) {
                        if (var12_3) ** GOTO lbl6
                        var9_12.addSuppressed(var10_14);
                        if (var12_3) ** GOTO lbl6
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
lbl118:
                    // 3 sources

                    if (var12_3 || var12_3) ** GOTO lbl6
                    throw var9_12;
                }
                var8_11.close();
                if (var12_3) ** GOTO lbl6
                if (var14_1) {
                    throw null;
                }
lbl125:
                // 3 sources

                if (var12_3 || var12_3) ** GOTO lbl6
                var8_11 = RenderSystem.getSamplerCache().method_75294(FilterMode.LINEAR);
                if (var12_3 || var12_3) ** GOTO lbl6
                var9_13 = var7_10.createRenderPass((Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$render$4(), ()Ljava/lang/String;)(), var1_4.method_71639(), OptionalInt.empty());
                if (var12_3) ** GOTO lbl6
                try {
                    if (var12_3) ** GOTO lbl6
                    var9_13.setPipeline(ly.compositePipeline);
                    if (var12_3 || var12_3) ** GOTO lbl6
                    var9_13.bindTexture("Sampler0", ly.skyTextureView, (class_12137)var8_11);
                    if (var12_3 || var12_3) ** GOTO lbl6
                    var9_13.setVertexBuffer((int)ly.huww("hvep", huwy(int ), (int)147), ly.vertexBuffer);
                    if (var12_3 || var12_3) ** GOTO lbl6
                    var9_13.draw((int)ly.huww("hveq", huwy(int ), (int)148), (int)ly.huww("hver", huwy(int ), (int)149));
                    if (var12_3 || var12_3) ** GOTO lbl6
                    if (var9_13 == null) ** GOTO lbl164
                    if (var12_3) ** GOTO lbl6
                }
                catch (Throwable var10_15) {
                    if (var12_3) ** GOTO lbl6
                    if (var9_13 == null) ** GOTO lbl157
                    if (var12_3) ** GOTO lbl6
                    try {
                        if (var12_3) ** GOTO lbl6
                        var9_13.close();
                        if (var12_3 || var12_3) ** GOTO lbl6
                        ** if (!var14_1) goto lbl-1000
                    }
                    catch (Throwable var11_16) {
                        if (var12_3) ** GOTO lbl6
                        var10_15.addSuppressed(var11_16);
                        if (var12_3) ** GOTO lbl6
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
lbl157:
                    // 3 sources

                    if (var12_3 || var12_3) ** GOTO lbl6
                    throw var10_15;
                }
                var9_13.close();
                if (var12_3) ** GOTO lbl6
                if (var14_1) {
                    throw null;
                }
lbl164:
                // 3 sources

                if (!var12_3 && !var12_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var13_2 /* !! */  = (int)ly.huww("hves", huwy(int ), (int)150);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl260
            }
lbl172:
            // 2 sources

            case 1: {
                var13_2 /* !! */  = (int)ly.huww("hvet", huwy(int ), (int)151);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl386
            }
            case 2: {
                var13_2 /* !! */  = (int)ly.huww("hveu", huwy(int ), (int)152);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl600
            }
            case 3: {
                var13_2 /* !! */  = (int)ly.huww("hvev", huwy(int ), (int)153);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl690
            }
lbl187:
            // 2 sources

            case 4: {
                var13_2 /* !! */  = (int)ly.huww("hvew", huwy(int ), (int)154);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl553
            }
lbl192:
            // 3 sources

            case 5: {
                var13_2 /* !! */  = (int)ly.huww("hvex", huwy(int ), (int)155);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl650
            }
            case 6: {
                var13_2 /* !! */  = (int)ly.huww("hvey", huwy(int ), (int)156);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl437
            }
lbl202:
            // 3 sources

            case 7: {
                var13_2 /* !! */  = (int)ly.huww("hvez", huwy(int ), (int)157);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl335
            }
            case 8: {
                var13_2 /* !! */  = (int)ly.huww("hvfa", huwy(int ), (int)158);
                if (!var14_1) ** GOTO lbl192
                throw null;
            }
            case 9: {
                var13_2 /* !! */  = (int)ly.huww("hvfb", huwy(int ), (int)159);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl637
            }
            case 10: {
                var13_2 /* !! */  = (int)ly.huww("hvfc", huwy(int ), (int)160);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl305
            }
lbl221:
            // 3 sources

            case 11: {
                var13_2 /* !! */  = (int)ly.huww("hvfd", huwy(int ), (int)161);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl276
            }
            case 12: {
                var13_2 /* !! */  = (int)ly.huww("hvfe", huwy(int ), (int)162);
                if (!var14_1) ** GOTO lbl202
                throw null;
            }
            case 13: {
                var13_2 /* !! */  = (int)ly.huww("hvff", huwy(int ), (int)163);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl488
            }
            case 14: {
                var13_2 /* !! */  = (int)ly.huww("hvfg", huwy(int ), (int)164);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl645
            }
            case 15: {
                var13_2 /* !! */  = (int)ly.huww("hvfh", huwy(int ), (int)165);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl583
            }
lbl245:
            // 2 sources

            case 16: {
                var13_2 /* !! */  = (int)ly.huww("hvfi", huwy(int ), (int)166);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl285
            }
lbl250:
            // 2 sources

            case 17: {
                var13_2 /* !! */  = (int)ly.huww("hvfj", huwy(int ), (int)167);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl531
            }
            case 18: {
                var13_2 /* !! */  = (int)ly.huww("hvfk", huwy(int ), (int)168);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl271
            }
lbl260:
            // 2 sources

            case 19: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var13_2 /* !! */  = (int)ly.huww("hvfl", huwy(int ), (int)169);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl428
                    break;
                }
            }
lbl266:
            // 6 sources

            case 20: {
                var13_2 /* !! */  = (int)ly.huww("hvfm", huwy(int ), (int)170);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl666
            }
lbl271:
            // 2 sources

            case 21: {
                var13_2 /* !! */  = (int)ly.huww("hvfn", huwy(int ), (int)171);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl437
            }
lbl276:
            // 2 sources

            case 22: {
                var13_2 /* !! */  = (int)ly.huww("hvfo", huwy(int ), (int)172);
                if (!var14_1) ** GOTO lbl266
                throw null;
            }
lbl280:
            // 2 sources

            case 23: {
                var13_2 /* !! */  = (int)ly.huww("hvfp", huwy(int ), (int)173);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl658
            }
lbl285:
            // 2 sources

            case 24: {
                var13_2 /* !! */  = (int)ly.huww("hvfq", huwy(int ), (int)174);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl363
            }
lbl290:
            // 4 sources

            case 25: {
                var13_2 /* !! */  = (int)ly.huww("hvfr", huwy(int ), (int)175);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl415
            }
            case 26: {
                var13_2 /* !! */  = (int)ly.huww("hvfs", huwy(int ), (int)176);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl609
            }
            case 27: {
                var13_2 /* !! */  = (int)ly.huww("hvft", huwy(int ), (int)177);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl446
            }
lbl305:
            // 3 sources

            case 28: {
                var13_2 /* !! */  = (int)ly.huww("hvfu", huwy(int ), (int)178);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl625
            }
            case 29: {
                var13_2 /* !! */  = (int)ly.huww("hvfv", huwy(int ), (int)179);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl410
            }
            case 30: {
                var13_2 /* !! */  = (int)ly.huww("hvfw", huwy(int ), (int)180);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl415
            }
lbl320:
            // 2 sources

            case 31: {
                var13_2 /* !! */  = (int)ly.huww("hvfx", huwy(int ), (int)181);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl690
            }
lbl325:
            // 2 sources

            case 32: {
                var13_2 /* !! */  = (int)ly.huww("hvfy", huwy(int ), (int)182);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl609
            }
lbl330:
            // 2 sources

            case 33: {
                var13_2 /* !! */  = (int)ly.huww("hvfz", huwy(int ), (int)183);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl470
            }
lbl335:
            // 2 sources

            case 34: {
                var13_2 /* !! */  = (int)ly.huww("hvga", huwy(int ), (int)184);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl625
            }
            case 35: {
                var13_2 /* !! */  = (int)ly.huww("hvgb", huwy(int ), (int)185);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl381
            }
lbl345:
            // 3 sources

            case 36: {
                var13_2 /* !! */  = (int)ly.huww("hvgc", huwy(int ), (int)186);
                if (!var14_1) ** GOTO lbl266
                throw null;
            }
            case 37: {
                var13_2 /* !! */  = (int)ly.huww("hvgd", huwy(int ), (int)187);
                if (!var14_1) ** GOTO lbl325
                throw null;
            }
            case 38: {
                var13_2 /* !! */  = (int)ly.huww("hvge", huwy(int ), (int)188);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl578
            }
            case 39: {
                var13_2 /* !! */  = (int)ly.huww("hvgf", huwy(int ), (int)189);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl470
            }
lbl363:
            // 5 sources

            case 40: {
                var13_2 /* !! */  = (int)ly.huww("hvgg", huwy(int ), (int)190);
                if (!var14_1) break;
                throw null;
            }
lbl367:
            // 3 sources

            case 41: {
                var13_2 /* !! */  = (int)ly.huww("hvgh", huwy(int ), (int)191);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl531
            }
lbl372:
            // 2 sources

            case 42: {
                var13_2 /* !! */  = (int)ly.huww("hvgi", huwy(int ), (int)192);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl424
            }
lbl377:
            // 2 sources

            case 43: {
                var13_2 /* !! */  = (int)ly.huww("hvgj", huwy(int ), (int)193);
                if (!var14_1) ** GOTO lbl363
                throw null;
            }
lbl381:
            // 2 sources

            case 44: {
                var13_2 /* !! */  = (int)ly.huww("hvgk", huwy(int ), (int)194);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl488
            }
lbl386:
            // 3 sources

            case 45: {
                var13_2 /* !! */  = (int)ly.huww("hvgl", huwy(int ), (int)195);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl578
            }
            case 46: {
                var13_2 /* !! */  = (int)ly.huww("hvgm", huwy(int ), (int)196);
                if (!var14_1) ** GOTO lbl187
                throw null;
            }
lbl395:
            // 2 sources

            case 47: {
                var13_2 /* !! */  = (int)ly.huww("hvgn", huwy(int ), (int)197);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl645
            }
lbl400:
            // 2 sources

            case 48: {
                var13_2 /* !! */  = (int)ly.huww("hvgo", huwy(int ), (int)198);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl474
            }
lbl405:
            // 2 sources

            case 49: {
                var13_2 /* !! */  = (int)ly.huww("hvgp", huwy(int ), (int)199);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl686
            }
lbl410:
            // 2 sources

            case 50: {
                var13_2 /* !! */  = (int)ly.huww("hvgq", huwy(int ), (int)200);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl540
            }
lbl415:
            // 3 sources

            case 51: {
                var13_2 /* !! */  = (int)ly.huww("hvgr", huwy(int ), (int)201);
                if (!var14_1) ** GOTO lbl377
                throw null;
            }
lbl419:
            // 2 sources

            case 52: {
                var13_2 /* !! */  = (int)ly.huww("hvgs", huwy(int ), (int)202);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl569
            }
lbl424:
            // 2 sources

            case 53: {
                var13_2 /* !! */  = (int)ly.huww("hvgt", huwy(int ), (int)203);
                if (!var14_1) ** GOTO lbl290
                throw null;
            }
lbl428:
            // 3 sources

            case 54: {
                var13_2 /* !! */  = (int)ly.huww("hvgu", huwy(int ), (int)204);
                if (!var14_1) ** GOTO lbl363
                throw null;
            }
            case 55: {
                var13_2 /* !! */  = (int)ly.huww("hvgv", huwy(int ), (int)205);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl522
            }
lbl437:
            // 4 sources

            case 56: {
                var13_2 /* !! */  = (int)ly.huww("hvgw", huwy(int ), (int)206);
                if (!var14_1) ** GOTO lbl395
                throw null;
            }
lbl441:
            // 2 sources

            case 57: {
                var13_2 /* !! */  = (int)ly.huww("hvgx", huwy(int ), (int)207);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl690
            }
lbl446:
            // 2 sources

            case 58: {
                var13_2 /* !! */  = (int)ly.huww("hvgy", huwy(int ), (int)208);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl514
            }
lbl451:
            // 3 sources

            case 59: {
                var13_2 /* !! */  = (int)ly.huww("hvgz", huwy(int ), (int)209);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl492
            }
lbl456:
            // 2 sources

            case 60: {
                var13_2 /* !! */  = (int)ly.huww("hvha", huwy(int ), (int)210);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl592
            }
lbl461:
            // 2 sources

            case 61: {
                var13_2 /* !! */  = (int)ly.huww("hvhb", huwy(int ), (int)211);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl662
            }
lbl466:
            // 2 sources

            case 62: {
                var13_2 /* !! */  = (int)ly.huww("hvhc", huwy(int ), (int)212);
                if (!var14_1) ** GOTO lbl367
                throw null;
            }
lbl470:
            // 3 sources

            case 63: {
                var13_2 /* !! */  = (int)ly.huww("hvhd", huwy(int ), (int)213);
                if (!var14_1) ** GOTO lbl172
                throw null;
            }
lbl474:
            // 4 sources

            case 64: {
                var13_2 /* !! */  = (int)ly.huww("hvhe", huwy(int ), (int)214);
                if (!var14_1) ** GOTO lbl345
                throw null;
            }
            case 65: {
                var13_2 /* !! */  = (int)ly.huww("hvhf", huwy(int ), (int)215);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl662
            }
            case 66: {
                var13_2 /* !! */  = (int)ly.huww("hvhg", huwy(int ), (int)216);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl561
            }
lbl488:
            // 3 sources

            case 67: {
                var13_2 /* !! */  = (int)ly.huww("hvhh", huwy(int ), (int)217);
                if (!var14_1) ** GOTO lbl386
                throw null;
            }
lbl492:
            // 2 sources

            case 68: {
                var13_2 /* !! */  = (int)ly.huww("hvhi", huwy(int ), (int)218);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl625
            }
            case 69: {
                var13_2 /* !! */  = (int)ly.huww("hvhj", huwy(int ), (int)219);
                if (!var14_1) ** GOTO lbl345
                throw null;
            }
lbl501:
            // 2 sources

            case 70: {
                var13_2 /* !! */  = (int)ly.huww("hvhk", huwy(int ), (int)220);
                if (!var14_1) ** GOTO lbl372
                throw null;
            }
            case 71: {
                var13_2 /* !! */  = (int)ly.huww("hvhl", huwy(int ), (int)221);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl690
            }
lbl510:
            // 2 sources

            case 72: {
                var13_2 /* !! */  = (int)ly.huww("hvhm", huwy(int ), (int)222);
                if (var14_1) {
                    throw null;
                }
            }
lbl514:
            // 4 sources

            case 73: {
                var13_2 /* !! */  = (int)ly.huww("hvhn", huwy(int ), (int)223);
                if (!var14_1) ** GOTO lbl474
                throw null;
            }
            case 74: {
                var13_2 /* !! */  = (int)ly.huww("hvho", huwy(int ), (int)224);
                if (!var14_1) ** GOTO lbl290
                throw null;
            }
lbl522:
            // 2 sources

            case 75: {
                var13_2 /* !! */  = (int)ly.huww("hvhp", huwy(int ), (int)225);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl592
            }
            case 76: {
                var13_2 /* !! */  = (int)ly.huww("hvhq", huwy(int ), (int)226);
                if (!var14_1) ** GOTO lbl419
                throw null;
            }
lbl531:
            // 3 sources

            case 77: {
                var13_2 /* !! */  = (int)ly.huww("hvhr", huwy(int ), (int)227);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl629
            }
            case 78: {
                var13_2 /* !! */  = (int)ly.huww("hvhs", huwy(int ), (int)228);
                if (!var14_1) ** GOTO lbl405
                throw null;
            }
lbl540:
            // 2 sources

            case 79: {
                var13_2 /* !! */  = (int)ly.huww("hvht", huwy(int ), (int)229);
                if (!var14_1) ** GOTO lbl400
                throw null;
            }
            case 80: {
                var13_2 /* !! */  = (int)ly.huww("hvhu", huwy(int ), (int)230);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl600
            }
            case 81: {
                var13_2 /* !! */  = (int)ly.huww("hvhv", huwy(int ), (int)231);
                if (!var14_1) ** GOTO lbl451
                throw null;
            }
lbl553:
            // 2 sources

            case 82: {
                var13_2 /* !! */  = (int)ly.huww("hvhw", huwy(int ), (int)232);
                if (!var14_1) ** GOTO lbl266
                throw null;
            }
            case 83: {
                var13_2 /* !! */  = (int)ly.huww("hvhx", huwy(int ), (int)233);
                if (!var14_1) break;
                throw null;
            }
lbl561:
            // 2 sources

            case 84: {
                var13_2 /* !! */  = (int)ly.huww("hvhy", huwy(int ), (int)234);
                if (!var14_1) ** GOTO lbl510
                throw null;
            }
            case 85: {
                var13_2 /* !! */  = (int)ly.huww("hvhz", huwy(int ), (int)235);
                if (!var14_1) ** GOTO lbl245
                throw null;
            }
lbl569:
            // 2 sources

            case 86: {
                var13_2 /* !! */  = (int)ly.huww("hvia", huwy(int ), (int)236);
                if (!var14_1) ** GOTO lbl266
                throw null;
            }
            case 87: {
                var13_2 /* !! */  = (int)ly.huww("hvib", huwy(int ), (int)237);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl600
            }
lbl578:
            // 3 sources

            case 88: {
                var13_2 /* !! */  = (int)ly.huww("hvic", huwy(int ), (int)238);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl674
            }
lbl583:
            // 2 sources

            case 89: {
                var13_2 /* !! */  = (int)ly.huww("hvid", huwy(int ), (int)239);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl682
            }
            case 90: {
                var13_2 /* !! */  = (int)ly.huww("hvie", huwy(int ), (int)240);
                if (!var14_1) ** GOTO lbl221
                throw null;
            }
lbl592:
            // 3 sources

            case 91: {
                var13_2 /* !! */  = (int)ly.huww("hvif", huwy(int ), (int)241);
                if (!var14_1) ** GOTO lbl367
                throw null;
            }
            case 92: {
                var13_2 /* !! */  = (int)ly.huww("hvig", huwy(int ), (int)242);
                if (!var14_1) ** GOTO lbl437
                throw null;
            }
lbl600:
            // 4 sources

            case 93: {
                var13_2 /* !! */  = (int)ly.huww("hvih", huwy(int ), (int)243);
                if (!var14_1) ** GOTO lbl266
                throw null;
            }
            case 94: {
                var13_2 /* !! */  = (int)ly.huww("hvii", huwy(int ), (int)244);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl650
            }
lbl609:
            // 3 sources

            case 95: {
                var13_2 /* !! */  = (int)ly.huww("hvij", huwy(int ), (int)245);
                if (!var14_1) ** GOTO lbl192
                throw null;
            }
            case 96: {
                var13_2 /* !! */  = (int)ly.huww("hvik", huwy(int ), (int)246);
                if (!var14_1) ** GOTO lbl330
                throw null;
            }
            case 97: {
                var13_2 /* !! */  = (int)ly.huww("hvil", huwy(int ), (int)247);
                if (!var14_1) ** GOTO lbl250
                throw null;
            }
            case 98: {
                var13_2 /* !! */  = (int)ly.huww("hvim", huwy(int ), (int)248);
                if (!var14_1) ** GOTO lbl363
                throw null;
            }
lbl625:
            // 4 sources

            case 99: {
                var13_2 /* !! */  = (int)ly.huww("hvin", huwy(int ), (int)249);
                if (!var14_1) ** GOTO lbl305
                throw null;
            }
lbl629:
            // 2 sources

            case 100: {
                var13_2 /* !! */  = (int)ly.huww("hvio", huwy(int ), (int)250);
                if (!var14_1) ** GOTO lbl320
                throw null;
            }
            case 101: {
                var13_2 /* !! */  = (int)ly.huww("hvip", huwy(int ), (int)251);
                if (!var14_1) ** GOTO lbl290
                throw null;
            }
lbl637:
            // 2 sources

            case 102: {
                var13_2 /* !! */  = (int)ly.huww("hviq", huwy(int ), (int)252);
                if (!var14_1) ** GOTO lbl474
                throw null;
            }
lbl641:
            // 2 sources

            case 103: {
                var13_2 /* !! */  = (int)ly.huww("hvir", huwy(int ), (int)253);
                if (!var14_1) ** GOTO lbl501
                throw null;
            }
lbl645:
            // 3 sources

            case 104: {
                var13_2 /* !! */  = (int)ly.huww("hvis", huwy(int ), (int)254);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl662
            }
lbl650:
            // 3 sources

            case 105: {
                var13_2 /* !! */  = (int)ly.huww("hvit", huwy(int ), (int)255);
                if (!var14_1) ** GOTO lbl641
                throw null;
            }
            case 106: {
                var13_2 /* !! */  = (int)ly.huww("hviu", huwy(int ), (int)256);
                if (!var14_1) ** GOTO lbl428
                throw null;
            }
lbl658:
            // 2 sources

            case 107: {
                var13_2 /* !! */  = (int)ly.huww("hviv", huwy(int ), (int)257);
                if (var14_1) {
                    throw null;
                }
            }
lbl662:
            // 6 sources

            case 108: {
                var13_2 /* !! */  = (int)ly.huww("hviw", huwy(int ), (int)258);
                if (!var14_1) ** GOTO lbl451
                throw null;
            }
lbl666:
            // 2 sources

            case 109: {
                var13_2 /* !! */  = (int)ly.huww("hvix", huwy(int ), (int)259);
                if (!var14_1) ** GOTO lbl456
                throw null;
            }
            case 110: {
                var13_2 /* !! */  = (int)ly.huww("hviy", huwy(int ), (int)260);
                if (!var14_1) ** GOTO lbl221
                throw null;
            }
lbl674:
            // 2 sources

            case 111: {
                var13_2 /* !! */  = (int)ly.huww("hviz", huwy(int ), (int)261);
                if (!var14_1) ** GOTO lbl202
                throw null;
            }
            case 112: {
                var13_2 /* !! */  = (int)ly.huww("hvja", huwy(int ), (int)262);
                if (!var14_1) ** GOTO lbl441
                throw null;
            }
lbl682:
            // 2 sources

            case 113: {
                var13_2 /* !! */  = (int)ly.huww("hvjb", huwy(int ), (int)263);
                if (!var14_1) ** GOTO lbl280
                throw null;
            }
lbl686:
            // 2 sources

            case 114: {
                var13_2 /* !! */  = (int)ly.huww("hvjc", huwy(int ), (int)264);
                if (!var14_1) ** GOTO lbl466
                throw null;
            }
lbl690:
            // 5 sources

            case 115: {
                var13_2 /* !! */  = (int)ly.huww("hvjd", huwy(int ), (int)265);
                if (!var14_1) ** GOTO lbl461
                throw null;
            }
            case 116: 
        }
        var13_2 /* !! */  = (int)ly.huww("hvje", huwy(int ), (int)266);
        ** while (!var14_1)
lbl697:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hvsh() {
        ly.huxa[300] = 1421375322;
        ly.huxa[301] = 82662878;
        ly.huxa[302] = -1599852100;
        ly.huxa[303] = 250992427;
        ly.huxa[304] = 327478201;
        ly.huxa[305] = 924261915;
        ly.huxa[306] = -47599131;
        ly.huxa[307] = -899211835;
        ly.huxa[308] = 640328968;
        ly.huxa[309] = 333774918;
        ly.huxa[310] = -1648397653;
        ly.huxa[311] = -1003523324;
        ly.huxa[312] = -38634867;
        ly.huxa[313] = 1611223694;
        ly.huxa[314] = 1194897239;
        ly.huxa[315] = 862929667;
        ly.huxa[316] = 500904429;
        ly.huxa[317] = -25857114;
        ly.huxa[318] = 810562952;
        ly.huxa[319] = -228478312;
        ly.huxa[320] = 655087897;
        ly.huxa[321] = -1770491799;
        ly.huxa[322] = -1928254306;
        ly.huxa[323] = -1552623746;
        ly.huxa[324] = -265655546;
        ly.huxa[325] = 2064985611;
        ly.huxa[326] = -1621874325;
        ly.huxa[327] = 665272312;
        ly.huxa[328] = -208470726;
        ly.huxa[329] = 1402104757;
        ly.huxa[330] = 1837389866;
        ly.huxa[331] = 1198782383;
        ly.huxa[332] = 886869071;
        ly.huxa[333] = 1507900676;
        ly.huxa[334] = 1221054584;
        ly.huxa[335] = -1891528177;
        ly.huxa[336] = -1842364122;
        ly.huxa[337] = 38512242;
        ly.huxa[338] = -1189139235;
        ly.huxa[339] = -925989586;
        ly.huxa[340] = -1652231232;
        ly.huxa[341] = -226585768;
        ly.huxa[342] = -1825772841;
        ly.huxa[343] = -2137233314;
        ly.huxa[344] = 1125693596;
        ly.huxa[345] = 1926745703;
        ly.huxa[346] = -1966268155;
        ly.huxa[347] = -97434284;
        ly.huxa[348] = 76620053;
        ly.huxa[349] = -1614020099;
        ly.huxa[350] = 3012627;
        ly.huxa[351] = -1214908882;
        ly.huxa[352] = 151545266;
        ly.huxa[353] = 741045958;
        ly.huxa[354] = -128719327;
        ly.huxa[355] = -1530967837;
        ly.huxa[356] = 419984786;
        ly.huxa[357] = 1270325469;
        ly.huxa[358] = -369284192;
        ly.huxa[359] = -1602840480;
        ly.huxa[360] = 1561265608;
        ly.huxa[361] = 1196880643;
        ly.huxa[362] = 1612433657;
        ly.huxa[363] = 1085179266;
        ly.huxa[364] = 1401192212;
        ly.huxa[365] = -1625375454;
        ly.huxa[366] = 314544471;
        ly.huxa[367] = -630525746;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$ensureTarget$2() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ly.pa - ly.huww("hvqn", huwt(int ), (int)157)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ly.huww("hvqo", huwy(int ), (int)348)) break;
            v0 /* !! */  = (long)ly.huww("hvqp", huwy(int ), (int)349);
        }
        var2 = ly.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ly.pa - ly.huww("hvqq", huwt(int ), (int)158)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ly.huww("hvqr", huwy(int ), (int)350)) break;
            v1 /* !! */  = (long)ly.huww("hvqs", huwy(int ), (int)351);
        }
        var1_1 /* !! */  = ly.b;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = ly.pa - ly.huww("hvqt", huwt(int ), (int)159)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == ly.huww("hvqu", huwy(int ), (int)352)) break;
                    v2 /* !! */  = (long)ly.huww("hvqv", huwy(int ), (int)353);
                }
                var0_2 = ly.a;
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                return "phobia:shader_sky_target";
            }
            case 0: {
                do {
                    var1_1 /* !! */  = (int)ly.huww("hvqw", huwy(int ), (int)354);
                } while (!var2);
                throw null;
            }
lbl36:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)ly.huww("hvqx", huwy(int ), (int)355);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var1_1 /* !! */  = (int)ly.huww("hvqy", huwy(int ), (int)356);
                if (!var2) ** GOTO lbl36
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)ly.huww("hvqz", huwy(int ), (int)357);
        ** while (!var2)
lbl48:
        // 1 sources

        throw null;
    }

    public ly() {
    }

    private static /* synthetic */ void hvsf() {
        ly.huxa[100] = -1878484167;
        ly.huxa[101] = 1177030563;
        ly.huxa[102] = 1724669791;
        ly.huxa[103] = 1299176850;
        ly.huxa[104] = 1765146317;
        ly.huxa[105] = 1280367979;
        ly.huxa[106] = -1550773152;
        ly.huxa[107] = 2058416523;
        ly.huxa[108] = -361054469;
        ly.huxa[109] = 1942016206;
        ly.huxa[110] = -1204755588;
        ly.huxa[111] = -826625941;
        ly.huxa[112] = -1249636041;
        ly.huxa[113] = -1620782749;
        ly.huxa[114] = 70697993;
        ly.huxa[115] = -2102423180;
        ly.huxa[116] = 1967150967;
        ly.huxa[117] = -1365249312;
        ly.huxa[118] = 465432699;
        ly.huxa[119] = -1390726247;
        ly.huxa[120] = -1522499598;
        ly.huxa[121] = 511398792;
        ly.huxa[122] = 362796481;
        ly.huxa[123] = 952443660;
        ly.huxa[124] = -2090263254;
        ly.huxa[125] = -1454314014;
        ly.huxa[126] = 1770460399;
        ly.huxa[127] = 1097982996;
        ly.huxa[128] = -783386068;
        ly.huxa[129] = -68857429;
        ly.huxa[130] = 1090419484;
        ly.huxa[131] = 1210668836;
        ly.huxa[132] = -293130474;
        ly.huxa[133] = 2108651532;
        ly.huxa[134] = -23260275;
        ly.huxa[135] = 1249298985;
        ly.huxa[136] = 536148442;
        ly.huxa[137] = -364042481;
        ly.huxa[138] = 1826535442;
        ly.huxa[139] = 445139747;
        ly.huxa[140] = -1313087680;
        ly.huxa[141] = -1223321521;
        ly.huxa[142] = 1989924913;
        ly.huxa[143] = -1868343569;
        ly.huxa[144] = -159331457;
        ly.huxa[145] = -1822161022;
        ly.huxa[146] = -404648143;
        ly.huxa[147] = 1816758476;
        ly.huxa[148] = -2032303659;
        ly.huxa[149] = 539289585;
        ly.huxa[150] = -1989742035;
        ly.huxa[151] = -134736138;
        ly.huxa[152] = -1746393180;
        ly.huxa[153] = -1917366705;
        ly.huxa[154] = -312173450;
        ly.huxa[155] = -1823119013;
        ly.huxa[156] = 1994076192;
        ly.huxa[157] = 1346290527;
        ly.huxa[158] = -1067361011;
        ly.huxa[159] = 1443604933;
        ly.huxa[160] = -962528604;
        ly.huxa[161] = -2068596309;
        ly.huxa[162] = 647847200;
        ly.huxa[163] = 347259397;
        ly.huxa[164] = 1103611606;
        ly.huxa[165] = -62203684;
        ly.huxa[166] = -1372935468;
        ly.huxa[167] = 1721731440;
        ly.huxa[168] = -713144568;
        ly.huxa[169] = 1370827340;
        ly.huxa[170] = 1941777477;
        ly.huxa[171] = -1502358134;
        ly.huxa[172] = -874744607;
        ly.huxa[173] = -1738671399;
        ly.huxa[174] = 1616395978;
        ly.huxa[175] = -53321215;
        ly.huxa[176] = 1775406140;
        ly.huxa[177] = 1388611068;
        ly.huxa[178] = -1415543171;
        ly.huxa[179] = 592757724;
        ly.huxa[180] = 911364175;
        ly.huxa[181] = -933446119;
        ly.huxa[182] = -436424198;
        ly.huxa[183] = -1794057228;
        ly.huxa[184] = -1562050800;
        ly.huxa[185] = -1639725545;
        ly.huxa[186] = -1894238619;
        ly.huxa[187] = -455181150;
        ly.huxa[188] = 874682067;
        ly.huxa[189] = -1513492429;
        ly.huxa[190] = -989378638;
        ly.huxa[191] = 2003121849;
        ly.huxa[192] = -1465560521;
        ly.huxa[193] = 563959313;
        ly.huxa[194] = -2038722272;
        ly.huxa[195] = -1559920202;
        ly.huxa[196] = 828276291;
        ly.huxa[197] = -1686282732;
        ly.huxa[198] = -1150455291;
        ly.huxa[199] = 1764733750;
    }

    private static /* synthetic */ long huwt(int n2) {
        return huwu[n2] ^ huwv[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static RenderPipeline buildPipeline(String var0, VertexFormat var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ly.pa - ly.huww("hvah", huwt(int ), (int)12)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ly.huww("hvai", huwy(int ), (int)72)) break;
            v0 /* !! */  = (long)ly.huww("hvaj", huwy(int ), (int)73);
        }
        var4_2 = ly.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ly.pa - ly.huww("hvak", huwt(int ), (int)13)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ly.huww("hval", huwy(int ), (int)74)) break;
            v1 /* !! */  = (long)ly.huww("hvam", huwy(int ), (int)75);
        }
        var3_3 /* !! */  = ly.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = ly.pa;
                if (true) ** GOTO lbl20
                block49: while (true) {
                    v2 /* !! */  = (long)(ly.huww("hvao", huwt(int ), (int)15) - ly.huww("hvan", huwt(int ), (int)14));
lbl20:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1910852492: {
                            continue block49;
                        }
                        case -634952213: {
                            break block49;
                        }
                    }
                    break;
                }
                var2_4 = ly.a;
                if (var4_2) {
                    throw null;
                    return null;
                }
                if (var2_4 || var2_4) ** continue;
                v3 = new RenderPipeline.Snippet[]{};
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ly.pa - ly.huww("hvap", huwt(int ), (int)16)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ly.huww("hvaq", huwy(int ), (int)76)) break;
                    v4 /* !! */  = (long)ly.huww("hvar", huwy(int ), (int)77);
                }
                v5 = RenderPipeline.builder((RenderPipeline.Snippet[])v3);
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = ly.pa - ly.huww("hvas", huwt(int ), (int)17)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ly.huww("hvat", huwy(int ), (int)78)) break;
                    v6 /* !! */  = (long)ly.huww("hvau", huwy(int ), (int)79);
                }
                v7 = "3d/" + var0;
                v8 /* !! */  = ly.pa;
                if (true) ** GOTO lbl48
                block53: while (true) {
                    v8 /* !! */  = (long)(ly.huww("hvaw", huwt(int ), (int)19) - ly.huww("hvav", huwt(int ), (int)18));
lbl48:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -634952213: {
                            break block53;
                        }
                        case 2042465382: {
                            continue block53;
                        }
                    }
                    break;
                }
                v9 = class_2960.method_60655((String)"phobia", (String)v7);
                v10 /* !! */  = ly.pa;
                if (true) ** GOTO lbl58
                block54: while (true) {
                    v10 /* !! */  = (long)(ly.huww("hvay", huwt(int ), (int)21) - ly.huww("hvax", huwt(int ), (int)20));
lbl58:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -634952213: {
                            break block54;
                        }
                        case 987362099: {
                            continue block54;
                        }
                    }
                    break;
                }
                v11 = v5.withLocation(v9);
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_4 = ly.pa - ly.huww("hvaz", huwt(int ), (int)22)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == ly.huww("hvba", huwy(int ), (int)80)) break;
                    v12 /* !! */  = (long)ly.huww("hvbb", huwy(int ), (int)81);
                }
                v13 = class_2960.method_60655((String)"phobia", (String)"3d/sky_vertex");
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_5 = ly.pa - ly.huww("hvbc", huwt(int ), (int)23)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == ly.huww("hvbd", huwy(int ), (int)82)) break;
                    v14 /* !! */  = (long)ly.huww("hvbe", huwy(int ), (int)83);
                }
                v15 = v11.withVertexShader(v13);
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_6 = ly.pa - ly.huww("hvbf", huwt(int ), (int)24)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == ly.huww("hvbg", huwy(int ), (int)84)) break;
                    v16 /* !! */  = (long)ly.huww("hvbh", huwy(int ), (int)85);
                }
                v17 = "3d/" + var0 + "_fragment";
                v18 /* !! */  = ly.pa;
                if (true) ** GOTO lbl86
                block58: while (true) {
                    v18 /* !! */  = (long)(v19 - ly.huww("hvbi", huwt(int ), (int)25));
lbl86:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -634952213: {
                            break block58;
                        }
                        case 935860492: {
                            v19 = ly.huww("hvbj", huwt(int ), (int)26);
                            continue block58;
                        }
                        case 1834567840: {
                            v19 = ly.huww("hvbk", huwt(int ), (int)27);
                            continue block58;
                        }
                    }
                    break;
                }
                v20 = class_2960.method_60655((String)"phobia", (String)v17);
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_7 = ly.pa - ly.huww("hvbl", huwt(int ), (int)28)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == ly.huww("hvbm", huwy(int ), (int)86)) break;
                    v21 /* !! */  = (long)ly.huww("hvbn", huwy(int ), (int)87);
                }
                v22 = v15.withFragmentShader(v20);
                v23 /* !! */  = ly.pa;
                if (true) ** GOTO lbl106
                block60: while (true) {
                    v23 /* !! */  = (long)(v24 - ly.huww("hvbo", huwt(int ), (int)29));
lbl106:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -746069548: {
                            v24 = ly.huww("hvbp", huwt(int ), (int)30);
                            continue block60;
                        }
                        case -634952213: {
                            break block60;
                        }
                        case 1137858696: {
                            v24 = ly.huww("hvbq", huwt(int ), (int)31);
                            continue block60;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v25 /* !! */  = (cfr_temp_8 = ly.pa - ly.huww("hvbr", huwt(int ), (int)32)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v25 /* !! */  == ly.huww("hvbs", huwy(int ), (int)88)) break;
                    v25 /* !! */  = (long)ly.huww("hvbt", huwy(int ), (int)89);
                }
                v26 = v22.withVertexFormat(var1_1, VertexFormat.class_5596.field_27379);
                v27 /* !! */  = ly.pa;
                if (true) ** GOTO lbl125
                block62: while (true) {
                    v27 /* !! */  = (long)(ly.huww("hvbv", huwt(int ), (int)34) - ly.huww("hvbu", huwt(int ), (int)33));
lbl125:
                    // 2 sources

                    switch ((int)v27 /* !! */ ) {
                        case -1822957843: {
                            continue block62;
                        }
                        case -634952213: {
                            break block62;
                        }
                    }
                    break;
                }
                v28 /* !! */  = ly.pa;
                if (true) ** GOTO lbl134
                block63: while (true) {
                    v28 /* !! */  = (long)(ly.huww("hvbx", huwt(int ), (int)36) - ly.huww("hvbw", huwt(int ), (int)35));
lbl134:
                    // 2 sources

                    switch ((int)v28 /* !! */ ) {
                        case -634952213: {
                            break block63;
                        }
                        case -323862211: {
                            continue block63;
                        }
                    }
                    break;
                }
                v29 = v26.withUniform("SkyData", class_10789.field_60031);
                while (true) {
                    if ((v30 /* !! */  = (cfr_temp_9 = ly.pa - ly.huww("hvby", huwt(int ), (int)37)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v30 /* !! */  == ly.huww("hvbz", huwy(int ), (int)90)) break;
                    v30 /* !! */  = (long)ly.huww("hvca", huwy(int ), (int)91);
                }
                v31 /* !! */  = ly.pa;
                if (true) ** GOTO lbl149
                block65: while (true) {
                    v31 /* !! */  = (long)(v32 - ly.huww("hvcb", huwt(int ), (int)38));
lbl149:
                    // 2 sources

                    switch ((int)v31 /* !! */ ) {
                        case -634952213: {
                            break block65;
                        }
                        case 116548806: {
                            v32 = ly.huww("hvcc", huwt(int ), (int)39);
                            continue block65;
                        }
                        case 278594646: {
                            v32 = ly.huww("hvcd", huwt(int ), (int)40);
                            continue block65;
                        }
                    }
                    break;
                }
                v33 = v29.withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST);
                v34 = ly.huww("hvce", huwy(int ), (int)92);
                v35 /* !! */  = ly.pa;
                if (true) ** GOTO lbl164
                block66: while (true) {
                    v35 /* !! */  = (long)(v36 - ly.huww("hvcf", huwt(int ), (int)41));
lbl164:
                    // 2 sources

                    switch ((int)v35 /* !! */ ) {
                        case -634952213: {
                            break block66;
                        }
                        case 218342965: {
                            v36 = ly.huww("hvcg", huwt(int ), (int)42);
                            continue block66;
                        }
                        case 565912005: {
                            v36 = ly.huww("hvch", huwt(int ), (int)43);
                            continue block66;
                        }
                        case 1583830865: {
                            v36 = ly.huww("hvci", huwt(int ), (int)44);
                            continue block66;
                        }
                    }
                    break;
                }
                v37 = v33.withDepthWrite((boolean)v34);
                v38 = ly.huww("hvcj", huwy(int ), (int)93);
                while (true) {
                    if ((v39 /* !! */  = (cfr_temp_10 = ly.pa - ly.huww("hvck", huwt(int ), (int)45)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v39 /* !! */  == ly.huww("hvcl", huwy(int ), (int)94)) break;
                    v39 /* !! */  = (long)ly.huww("hvcm", huwy(int ), (int)95);
                }
                v40 = v37.withCull((boolean)v38);
                while (true) {
                    if ((v41 /* !! */  = (cfr_temp_11 = ly.pa - ly.huww("hvcn", huwt(int ), (int)46)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v41 /* !! */  == ly.huww("hvco", huwy(int ), (int)96)) break;
                    v41 /* !! */  = (long)ly.huww("hvcp", huwy(int ), (int)97);
                }
                return v40.build();
            }
lbl190:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)ly.huww("hvcq", huwy(int ), (int)98);
                if (var4_2) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ly.huww("hvcr", huwy(int ), (int)99);
                    if (!var4_2) break block0;
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)ly.huww("hvcs", huwy(int ), (int)100);
                if (!var4_2) ** GOTO lbl190
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)ly.huww("hvct", huwy(int ), (int)101);
        ** while (!var4_2)
lbl206:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String lambda$render$4() {
        while (true) {
            block25: {
                if ((v0 /* !! */  = (cfr_temp_0 = ly.pa - ly.huww("hvpm", huwt(int ), (int)144)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  != ly.huww("hvpn", huwy(int ), (int)334)) break block25;
                var2 = ly.c;
                v1 /* !! */  = ly.pa;
                if (true) ** GOTO lbl13
            }
            v0 /* !! */  = (long)ly.huww("hvpo", huwy(int ), (int)335);
        }
        block12: while (true) {
            v1 /* !! */  = (long)(v2 - ly.huww("hvpp", huwt(int ), (int)145));
lbl13:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -947129705: {
                    v2 = ly.huww("hvpq", huwt(int ), (int)146);
                    continue block12;
                }
                case -634952213: {
                    break block12;
                }
                case 664579355: {
                    v2 = ly.huww("hvpr", huwt(int ), (int)147);
                    continue block12;
                }
            }
            break;
        }
        var1_1 /* !! */  = ly.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ly.pa - ly.huww("hvps", huwt(int ), (int)148)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ly.huww("hvpt", huwy(int ), (int)336)) {
                var0_2 = ly.a;
                if (var2) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)ly.huww("hvpu", huwy(int ), (int)337);
        }
        if (var0_2) return null;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var0_2) return "ShaderSky3D composite";
                return null;
            }
            case 1: {
                ** GOTO lbl45
            }
            case 3: {
                var1_1 /* !! */  = (int)ly.huww("hvpy", huwy(int ), (int)341);
                if (var2) {
                    throw null;
                }
lbl45:
                // 3 sources

                var1_1 /* !! */  = (int)ly.huww("hvpw", huwy(int ), (int)339);
                if (var2) {
                    throw null;
                }
            }
            case 2: {
                var1_1 /* !! */  = (int)ly.huww("hvpx", huwy(int ), (int)340);
                if (var2) {
                    throw null;
                }
            }
            case 0: 
        }
        do {
            var1_1 /* !! */  = (int)ly.huww("hvpv", huwy(int ), (int)338);
        } while (!var2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void ensureTarget(int var0, int var1_1) {
        var6_2 = ly.c;
        var5_3 /* !! */  = ly.b;
        var4_4 = ly.a;
        if (var6_2) {
            throw null;
lbl6:
            // 18 sources

            return;
        }
        if (var4_4 || var4_4) ** GOTO lbl6
        var2_5 = Math.max((int)ly.huww("hvcu", huwy(int ), (int)102), var0 / ly.huww("hvcv", huwy(int ), (int)103));
        if (var4_4 || var4_4) ** GOTO lbl6
        var3_6 = Math.max((int)ly.huww("hvcw", huwy(int ), (int)104), var1_1 / ly.huww("hvcx", huwy(int ), (int)105));
        if (var4_4) ** GOTO lbl6
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4) ** GOTO lbl6
                if (ly.skyTexture == null) ** GOTO lbl24
                if (var4_4) ** GOTO lbl6
                if (ly.skyWidth != var2_5) ** GOTO lbl24
                if (var4_4) ** GOTO lbl6
                if (ly.skyHeight != var3_6) ** GOTO lbl24
                if (var4_4 || var4_4) ** GOTO lbl6
                return;
lbl24:
                // 3 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                if (ly.skyTextureView == null) ** GOTO lbl29
                if (var4_4 || var4_4) ** GOTO lbl6
                ly.skyTextureView.close();
                if (var4_4) ** GOTO lbl6
lbl29:
                // 2 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                if (ly.skyTexture == null) ** GOTO lbl34
                if (var4_4 || var4_4) ** GOTO lbl6
                ly.skyTexture.close();
                if (var4_4) ** GOTO lbl6
lbl34:
                // 2 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                ly.skyTexture = RenderSystem.getDevice().createTexture((Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$ensureTarget$2(), ()Ljava/lang/String;)(), (int)ly.huww("hvcy", huwy(int ), (int)106), TextureFormat.RGBA8, var2_5, var3_6, (int)ly.huww("hvcz", huwy(int ), (int)107), (int)ly.huww("hvda", huwy(int ), (int)108));
                if (var4_4 || var4_4) ** GOTO lbl6
                ly.skyTextureView = RenderSystem.getDevice().createTextureView(ly.skyTexture);
                if (var4_4 || var4_4) ** GOTO lbl6
                ly.skyWidth = var2_5;
                if (var4_4 || var4_4) ** GOTO lbl6
                ly.skyHeight = var3_6;
                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                do {
                    var5_3 /* !! */  = (int)ly.huww("hvdb", huwy(int ), (int)109);
                } while (!var6_2);
                throw null;
            }
lbl50:
            // 2 sources

            case 1: {
                var5_3 /* !! */  = (int)ly.huww("hvdc", huwy(int ), (int)110);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl173
            }
lbl55:
            // 2 sources

            case 2: {
                var5_3 /* !! */  = (int)ly.huww("hvdd", huwy(int ), (int)111);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl101
            }
lbl60:
            // 2 sources

            case 3: {
                var5_3 /* !! */  = (int)ly.huww("hvde", huwy(int ), (int)112);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl151
            }
lbl65:
            // 2 sources

            case 4: {
                var5_3 /* !! */  = (int)ly.huww("hvdf", huwy(int ), (int)113);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl105
            }
lbl70:
            // 2 sources

            case 5: {
                var5_3 /* !! */  = (int)ly.huww("hvdg", huwy(int ), (int)114);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl128
            }
            case 6: {
                var5_3 /* !! */  = (int)ly.huww("hvdh", huwy(int ), (int)115);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl151
            }
lbl80:
            // 2 sources

            case 7: {
                var5_3 /* !! */  = (int)ly.huww("hvdi", huwy(int ), (int)116);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl119
            }
            case 8: {
                var5_3 /* !! */  = (int)ly.huww("hvdj", huwy(int ), (int)117);
                if (!var6_2) ** GOTO lbl70
                throw null;
            }
lbl89:
            // 3 sources

            case 9: {
                var5_3 /* !! */  = (int)ly.huww("hvdk", huwy(int ), (int)118);
                if (!var6_2) ** GOTO lbl65
                throw null;
            }
lbl93:
            // 2 sources

            case 10: {
                var5_3 /* !! */  = (int)ly.huww("hvdl", huwy(int ), (int)119);
                if (var6_2) {
                    throw null;
                }
            }
lbl97:
            // 5 sources

            case 11: {
                var5_3 /* !! */  = (int)ly.huww("hvdm", huwy(int ), (int)120);
                if (!var6_2) ** GOTO lbl60
                throw null;
            }
lbl101:
            // 2 sources

            case 12: {
                var5_3 /* !! */  = (int)ly.huww("hvdn", huwy(int ), (int)121);
                if (!var6_2) ** GOTO lbl55
                throw null;
            }
lbl105:
            // 3 sources

            case 13: {
                var5_3 /* !! */  = (int)ly.huww("hvdo", huwy(int ), (int)122);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl151
            }
            case 14: {
                var5_3 /* !! */  = (int)ly.huww("hvdp", huwy(int ), (int)123);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl147
            }
lbl115:
            // 2 sources

            case 15: {
                var5_3 /* !! */  = (int)ly.huww("hvdq", huwy(int ), (int)124);
                if (!var6_2) ** GOTO lbl89
                throw null;
            }
lbl119:
            // 3 sources

            case 16: {
                var5_3 /* !! */  = (int)ly.huww("hvdr", huwy(int ), (int)125);
                if (!var6_2) ** GOTO lbl89
                throw null;
            }
lbl123:
            // 2 sources

            case 17: {
                var5_3 /* !! */  = (int)ly.huww("hvds", huwy(int ), (int)126);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl128:
            // 2 sources

            case 18: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)ly.huww("hvdt", huwy(int ), (int)127);
                    if (!var6_2) ** GOTO lbl50
                    throw null;
                }
            }
            case 19: {
                var5_3 /* !! */  = (int)ly.huww("hvdu", huwy(int ), (int)128);
                if (!var6_2) ** GOTO lbl119
                throw null;
            }
            case 20: {
                do {
                    var5_3 /* !! */  = (int)ly.huww("hvdv", huwy(int ), (int)129);
                } while (!var6_2);
                throw null;
            }
            case 21: {
                var5_3 /* !! */  = (int)ly.huww("hvdw", huwy(int ), (int)130);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl159
            }
lbl147:
            // 3 sources

            case 22: {
                var5_3 /* !! */  = (int)ly.huww("hvdx", huwy(int ), (int)131);
                if (!var6_2) ** GOTO lbl115
                throw null;
            }
lbl151:
            // 4 sources

            case 23: {
                var5_3 /* !! */  = (int)ly.huww("hvdy", huwy(int ), (int)132);
                if (!var6_2) ** GOTO lbl147
                throw null;
            }
            case 24: {
                var5_3 /* !! */  = (int)ly.huww("hvdz", huwy(int ), (int)133);
                if (!var6_2) ** GOTO lbl97
                throw null;
            }
lbl159:
            // 2 sources

            case 25: {
                var5_3 /* !! */  = (int)ly.huww("hvea", huwy(int ), (int)134);
                if (!var6_2) ** GOTO lbl80
                throw null;
            }
            case 26: {
                var5_3 /* !! */  = (int)ly.huww("hveb", huwy(int ), (int)135);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl177
            }
lbl168:
            // 2 sources

            case 27: {
                var5_3 /* !! */  = (int)ly.huww("hvec", huwy(int ), (int)136);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl185
            }
lbl173:
            // 2 sources

            case 28: {
                var5_3 /* !! */  = (int)ly.huww("hved", huwy(int ), (int)137);
                if (!var6_2) ** GOTO lbl123
                throw null;
            }
lbl177:
            // 2 sources

            case 29: {
                var5_3 /* !! */  = (int)ly.huww("hvee", huwy(int ), (int)138);
                if (!var6_2) ** GOTO lbl105
                throw null;
            }
            case 30: {
                var5_3 /* !! */  = (int)ly.huww("hvef", huwy(int ), (int)139);
                if (!var6_2) ** GOTO lbl93
                throw null;
            }
lbl185:
            // 2 sources

            case 31: {
                var5_3 /* !! */  = (int)ly.huww("hveg", huwy(int ), (int)140);
                if (!var6_2) ** GOTO lbl97
                throw null;
            }
            case 32: 
        }
        var5_3 /* !! */  = (int)ly.huww("hveh", huwy(int ), (int)141);
        ** while (!var6_2)
lbl192:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hvse() {
        ly.huxa[0] = -1017106947;
        ly.huxa[1] = 475286839;
        ly.huxa[2] = -1364414529;
        ly.huxa[3] = -1324044435;
        ly.huxa[4] = -5298227;
        ly.huxa[5] = -1652223208;
        ly.huxa[6] = 1127320834;
        ly.huxa[7] = 837329963;
        ly.huxa[8] = -49312705;
        ly.huxa[9] = -1514671550;
        ly.huxa[10] = -1644588792;
        ly.huxa[11] = -268585844;
        ly.huxa[12] = -1525605324;
        ly.huxa[13] = -1864879223;
        ly.huxa[14] = -386927360;
        ly.huxa[15] = -725963759;
        ly.huxa[16] = 2062036648;
        ly.huxa[17] = 663598927;
        ly.huxa[18] = -1702074027;
        ly.huxa[19] = -1215592607;
        ly.huxa[20] = 708306297;
        ly.huxa[21] = 1951751045;
        ly.huxa[22] = 1416336353;
        ly.huxa[23] = 2129901719;
        ly.huxa[24] = 2139987270;
        ly.huxa[25] = -64142145;
        ly.huxa[26] = 1428557818;
        ly.huxa[27] = 1063672548;
        ly.huxa[28] = 667525240;
        ly.huxa[29] = 362682590;
        ly.huxa[30] = -74049405;
        ly.huxa[31] = 1951548137;
        ly.huxa[32] = -1245104197;
        ly.huxa[33] = -1327076653;
        ly.huxa[34] = -997928220;
        ly.huxa[35] = -614032614;
        ly.huxa[36] = 687095926;
        ly.huxa[37] = -321211516;
        ly.huxa[38] = -1698716305;
        ly.huxa[39] = -708742141;
        ly.huxa[40] = 1083339641;
        ly.huxa[41] = -410995745;
        ly.huxa[42] = 97448424;
        ly.huxa[43] = -520108420;
        ly.huxa[44] = -1987637988;
        ly.huxa[45] = 1765172274;
        ly.huxa[46] = 2113893447;
        ly.huxa[47] = 521069851;
        ly.huxa[48] = -1923329113;
        ly.huxa[49] = -477625158;
        ly.huxa[50] = -522434117;
        ly.huxa[51] = -2145447703;
        ly.huxa[52] = -837378060;
        ly.huxa[53] = 1929257849;
        ly.huxa[54] = -2037128206;
        ly.huxa[55] = -874633895;
        ly.huxa[56] = -2019767213;
        ly.huxa[57] = -26891444;
        ly.huxa[58] = -1885180777;
        ly.huxa[59] = -31682699;
        ly.huxa[60] = 1409166765;
        ly.huxa[61] = -341749700;
        ly.huxa[62] = -1094689508;
        ly.huxa[63] = 1315832922;
        ly.huxa[64] = -1715701013;
        ly.huxa[65] = -2093683436;
        ly.huxa[66] = -1380168008;
        ly.huxa[67] = -1652905242;
        ly.huxa[68] = -1933425000;
        ly.huxa[69] = 632333874;
        ly.huxa[70] = -1059895629;
        ly.huxa[71] = -1395872593;
        ly.huxa[72] = -880082207;
        ly.huxa[73] = 1915839030;
        ly.huxa[74] = -2008675733;
        ly.huxa[75] = 1971621468;
        ly.huxa[76] = 1881745723;
        ly.huxa[77] = 336337241;
        ly.huxa[78] = 1282252765;
        ly.huxa[79] = -587542942;
        ly.huxa[80] = -1763517613;
        ly.huxa[81] = 1300363757;
        ly.huxa[82] = 261367526;
        ly.huxa[83] = 1027380960;
        ly.huxa[84] = -1737786018;
        ly.huxa[85] = 370548153;
        ly.huxa[86] = 1367702225;
        ly.huxa[87] = -524647687;
        ly.huxa[88] = -230029477;
        ly.huxa[89] = 1198724536;
        ly.huxa[90] = 1786977638;
        ly.huxa[91] = -511872548;
        ly.huxa[92] = -1965421418;
        ly.huxa[93] = -1551278845;
        ly.huxa[94] = -1726292551;
        ly.huxa[95] = -381537522;
        ly.huxa[96] = 629530568;
        ly.huxa[97] = -1111618365;
        ly.huxa[98] = -1519481066;
        ly.huxa[99] = 1800130709;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String lambda$render$3() {
        v0 /* !! */  = ly.pa;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - ly.huww("hvpz", huwt(int ), (int)149));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -634952213: {
                    break block17;
                }
                case -463888980: {
                    v1 = ly.huww("hvqa", huwt(int ), (int)150);
                    continue block17;
                }
                case 2143740848: {
                    v1 = ly.huww("hvqb", huwt(int ), (int)151);
                    continue block17;
                }
            }
            break;
        }
        var2 = ly.c;
        while (true) {
            block31: {
                if ((v2 /* !! */  = (cfr_temp_1 = ly.pa - ly.huww("hvqc", huwt(int ), (int)152)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  != ly.huww("hvqd", huwy(int ), (int)342)) break block31;
                var1_1 /* !! */  = ly.b;
                v3 /* !! */  = ly.pa;
                if (true) ** GOTO lbl27
            }
            v2 /* !! */  = (long)ly.huww("hvqe", huwy(int ), (int)343);
        }
        block19: while (true) {
            v3 /* !! */  = (long)(v4 - ly.huww("hvqf", huwt(int ), (int)153));
lbl27:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1614786554: {
                    v4 = ly.huww("hvqg", huwt(int ), (int)154);
                    continue block19;
                }
                case -634952213: {
                    break block19;
                }
                case 606160654: {
                    v4 = ly.huww("hvqh", huwt(int ), (int)155);
                    continue block19;
                }
                case 1254970695: {
                    v4 = ly.huww("hvqi", huwt(int ), (int)156);
                    continue block19;
                }
            }
            break;
        }
        var0_2 = ly.a;
        if (var2) {
            throw null;
        }
        if (var0_2) ** GOTO lbl49
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var1_1 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (!var0_2) ** GOTO lbl50
lbl49:
                    // 2 sources

                    return null;
lbl50:
                    // 1 sources

                    return "ShaderSky3D low resolution";
                }
                case 3: {
                    var1_1 /* !! */  = (int)ly.huww("hvqm", huwy(int ), (int)347);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                case 0: lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)ly.huww("hvqj", huwy(int ), (int)344);
                    if (var2) {
                        throw null;
                    }
                }
                case 1: {
                    var1_1 /* !! */  = (int)ly.huww("hvqk", huwy(int ), (int)345);
                    if (var2) {
                        throw null;
                    }
                }
                case 2: 
            }
            if (true) ** GOTO lbl68
            break;
        }
        do {
            if (true) ** continue;
lbl68:
            // 2 sources

            var1_1 /* !! */  = (int)ly.huww("hvql", huwy(int ), (int)346);
            cfr_temp_0 = 0;
        } while (!var2);
        throw null;
    }

    private static /* synthetic */ double hvei(int n2) {
        return Double.longBitsToDouble(huwu[n2] ^ huwv[n2]);
    }

    private static /* synthetic */ void hvsb() {
        ly.huwz[100] = -1878484168;
        ly.huwz[101] = 1177030560;
        ly.huwz[102] = 1724669789;
        ly.huwz[103] = 1299176848;
        ly.huwz[104] = 1765146319;
        ly.huwz[105] = 1280367977;
        ly.huwz[106] = -1550773140;
        ly.huwz[107] = 2058416522;
        ly.huwz[108] = -361054470;
        ly.huwz[109] = 1942016238;
        ly.huwz[110] = -1204755593;
        ly.huwz[111] = -826625922;
        ly.huwz[112] = -1249636039;
        ly.huwz[113] = -1620782736;
        ly.huwz[114] = 70697992;
        ly.huwz[115] = -2102423199;
        ly.huwz[116] = 1967150966;
        ly.huwz[117] = -1365249295;
        ly.huwz[118] = 465432698;
        ly.huwz[119] = -1390726255;
        ly.huwz[120] = -1522499601;
        ly.huwz[121] = 511398792;
        ly.huwz[122] = 362796509;
        ly.huwz[123] = 952443675;
        ly.huwz[124] = -2090263246;
        ly.huwz[125] = -1454314009;
        ly.huwz[126] = 1770460412;
        ly.huwz[127] = 1097983002;
        ly.huwz[128] = -783386060;
        ly.huwz[129] = -68857409;
        ly.huwz[130] = 1090419484;
        ly.huwz[131] = 1210668836;
        ly.huwz[132] = -293130488;
        ly.huwz[133] = 2108651526;
        ly.huwz[134] = -23260277;
        ly.huwz[135] = 1249298991;
        ly.huwz[136] = 536148445;
        ly.huwz[137] = -364042494;
        ly.huwz[138] = 1826535446;
        ly.huwz[139] = 445139749;
        ly.huwz[140] = -1313087680;
        ly.huwz[141] = -1223321509;
        ly.huwz[142] = 1989924913;
        ly.huwz[143] = -1868343649;
        ly.huwz[144] = -159331457;
        ly.huwz[145] = -1822161022;
        ly.huwz[146] = -404648142;
        ly.huwz[147] = 1816758476;
        ly.huwz[148] = -2032303659;
        ly.huwz[149] = 539289586;
        ly.huwz[150] = -1989742071;
        ly.huwz[151] = -134736229;
        ly.huwz[152] = -1746393171;
        ly.huwz[153] = -1917366672;
        ly.huwz[154] = -312173494;
        ly.huwz[155] = -1823118980;
        ly.huwz[156] = 1994076194;
        ly.huwz[157] = 1346290455;
        ly.huwz[158] = -1067360978;
        ly.huwz[159] = 1443604983;
        ly.huwz[160] = -962528513;
        ly.huwz[161] = -2068596310;
        ly.huwz[162] = 647847202;
        ly.huwz[163] = 347259464;
        ly.huwz[164] = 1103611538;
        ly.huwz[165] = -62203715;
        ly.huwz[166] = -1372935533;
        ly.huwz[167] = 1721731398;
        ly.huwz[168] = -713144526;
        ly.huwz[169] = 1370827305;
        ly.huwz[170] = 1941777441;
        ly.huwz[171] = -1502358081;
        ly.huwz[172] = -874744691;
        ly.huwz[173] = -1738671457;
        ly.huwz[174] = 1616395927;
        ly.huwz[175] = -53321205;
        ly.huwz[176] = 1775406101;
        ly.huwz[177] = 1388611059;
        ly.huwz[178] = -1415543195;
        ly.huwz[179] = 592757734;
        ly.huwz[180] = 911364126;
        ly.huwz[181] = -933446143;
        ly.huwz[182] = -436424206;
        ly.huwz[183] = -1794057228;
        ly.huwz[184] = -1562050773;
        ly.huwz[185] = -1639725528;
        ly.huwz[186] = -1894238642;
        ly.huwz[187] = -455181151;
        ly.huwz[188] = 874682041;
        ly.huwz[189] = -1513492357;
        ly.huwz[190] = -989378575;
        ly.huwz[191] = 2003121804;
        ly.huwz[192] = -1465560545;
        ly.huwz[193] = 563959325;
        ly.huwz[194] = -2038722196;
        ly.huwz[195] = -1559920136;
        ly.huwz[196] = 828276259;
        ly.huwz[197] = -1686282738;
        ly.huwz[198] = -1150455210;
        ly.huwz[199] = 1764733731;
    }
}

