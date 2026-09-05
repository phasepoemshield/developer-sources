/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_243
 *  net.minecraft.class_310
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
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import ruhack.phobia.om;

public class lt {
    private static final float[] QUAD_V;
    private static double cameraZ;
    private static final int UNIFORM_SIZE = 128;
    private static final class_310 mc;
    public static final boolean c;
    private static final int MAX_GLOWS = 1024;
    private static Matrix4f projectionMatrix;
    private static long[] ihvu;
    public static final boolean a;
    private static double cameraX;
    private static double cameraY;
    private static final float[] glowData;
    private static final Matrix4f inverseViewMatrix;
    private static final Matrix4f combinedMatrix;
    private static GpuBuffer uniformBuffer;
    private static final float[] QUAD_U;
    private static int[] ihwa;
    public static final int b;
    private static final int GLOW_STRIDE = 9;
    private static int glowCount;
    private static boolean ignoreDepth;
    private static long[] ihvv;
    private static Matrix4f viewMatrix;
    static final long pr = 8599046875113187042L;
    private static GpuBuffer vertexBuffer;
    private static RenderPipeline pipeline;
    private static int[] ihvz;
    private static final int VERTEX_SIZE = 24;

    private static /* synthetic */ void ijiq() {
        lt.ihwa[100] = 949473217;
        lt.ihwa[101] = -2077138347;
        lt.ihwa[102] = -40910490;
        lt.ihwa[103] = -202044923;
        lt.ihwa[104] = -454390106;
        lt.ihwa[105] = -1849497441;
        lt.ihwa[106] = 1704267008;
        lt.ihwa[107] = -1174271215;
        lt.ihwa[108] = 699644866;
        lt.ihwa[109] = 1359008298;
        lt.ihwa[110] = 1032573520;
        lt.ihwa[111] = -183151923;
        lt.ihwa[112] = 5770729;
        lt.ihwa[113] = -1998496137;
        lt.ihwa[114] = -2144038413;
        lt.ihwa[115] = 1044067641;
        lt.ihwa[116] = -319535637;
        lt.ihwa[117] = -289040914;
        lt.ihwa[118] = -484188763;
        lt.ihwa[119] = 724558946;
        lt.ihwa[120] = -1208033253;
        lt.ihwa[121] = -1273734191;
        lt.ihwa[122] = -1883193068;
        lt.ihwa[123] = 569401167;
        lt.ihwa[124] = 793126471;
        lt.ihwa[125] = 1338936856;
        lt.ihwa[126] = -484140525;
        lt.ihwa[127] = -178209094;
        lt.ihwa[128] = -1903659169;
        lt.ihwa[129] = -549465586;
        lt.ihwa[130] = 1664044756;
        lt.ihwa[131] = -1968181022;
        lt.ihwa[132] = 403356767;
        lt.ihwa[133] = -546651256;
        lt.ihwa[134] = -234022603;
        lt.ihwa[135] = -1577579501;
        lt.ihwa[136] = -660680081;
        lt.ihwa[137] = 1487339151;
        lt.ihwa[138] = -1584611474;
        lt.ihwa[139] = 323085556;
        lt.ihwa[140] = -1955219291;
        lt.ihwa[141] = 1316993199;
        lt.ihwa[142] = 1238185605;
        lt.ihwa[143] = 1809487420;
        lt.ihwa[144] = 1876086923;
        lt.ihwa[145] = 19869008;
        lt.ihwa[146] = 1299745953;
        lt.ihwa[147] = -550786866;
        lt.ihwa[148] = 620558004;
        lt.ihwa[149] = 1806333134;
        lt.ihwa[150] = -1238640011;
        lt.ihwa[151] = -215955025;
        lt.ihwa[152] = 222946655;
        lt.ihwa[153] = -1450038519;
        lt.ihwa[154] = 2009723178;
        lt.ihwa[155] = 180444163;
        lt.ihwa[156] = -1984106039;
        lt.ihwa[157] = -2064206433;
        lt.ihwa[158] = 1175120247;
        lt.ihwa[159] = 467343281;
        lt.ihwa[160] = 594524548;
        lt.ihwa[161] = 882742086;
        lt.ihwa[162] = -973654161;
        lt.ihwa[163] = -914890629;
        lt.ihwa[164] = -1433280278;
        lt.ihwa[165] = 1398454198;
        lt.ihwa[166] = 1289953071;
        lt.ihwa[167] = 1747843846;
        lt.ihwa[168] = 743818286;
        lt.ihwa[169] = 166374985;
        lt.ihwa[170] = -599442462;
        lt.ihwa[171] = 717706398;
        lt.ihwa[172] = -1862340288;
        lt.ihwa[173] = 1619551856;
        lt.ihwa[174] = -1888866786;
        lt.ihwa[175] = -97653489;
        lt.ihwa[176] = -1114362020;
        lt.ihwa[177] = 508345947;
        lt.ihwa[178] = 1309209093;
        lt.ihwa[179] = -470234714;
        lt.ihwa[180] = -946972604;
        lt.ihwa[181] = -1036297300;
        lt.ihwa[182] = 528742910;
        lt.ihwa[183] = 871937485;
        lt.ihwa[184] = 1247923741;
        lt.ihwa[185] = 589255919;
        lt.ihwa[186] = 1479832784;
        lt.ihwa[187] = -1521688911;
        lt.ihwa[188] = -2075518910;
        lt.ihwa[189] = 210989018;
        lt.ihwa[190] = 1015933084;
        lt.ihwa[191] = 1186137381;
        lt.ihwa[192] = 1332869460;
        lt.ihwa[193] = 190414806;
        lt.ihwa[194] = 451676429;
        lt.ihwa[195] = -175216187;
        lt.ihwa[196] = -1522642283;
        lt.ihwa[197] = 99264702;
        lt.ihwa[198] = 1638612173;
        lt.ihwa[199] = 1831786334;
    }

    /*
     * Exception decompiling
     */
    public static void init() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 68[SWITCH]
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

    static {
        ihvz = new int[478];
        ihwa = new int[478];
        lt.ijhm();
        lt.ijhu();
        lt.ijhz();
        lt.ijid();
        lt.ijii();
        lt.ijil();
        lt.ijiq();
        lt.ijis();
        lt.ijiz();
        lt.ijjh();
        ihvu = new long[285];
        ihvv = new long[285];
        lt.ijjn();
        lt.ijjx();
        lt.ijkf();
        lt.ijkl();
        lt.ijkm();
        lt.ijkn();
        mc = class_310.method_1551();
        QUAD_U = new float[]{-1.0f, 1.0f, 1.0f, -1.0f, 1.0f, -1.0f};
        QUAD_V = new float[]{-1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f};
        glowData = new float[9216];
        projectionMatrix = new Matrix4f();
        viewMatrix = new Matrix4f();
        combinedMatrix = new Matrix4f();
        inverseViewMatrix = new Matrix4f();
        ignoreDepth = lt.ihvw("ijhk", ihvy(int ), (int)477);
    }

    private static /* synthetic */ void ijhz() {
        lt.ihvz[200] = 1058236525;
        lt.ihvz[201] = 2088929763;
        lt.ihvz[202] = 205489708;
        lt.ihvz[203] = -325881958;
        lt.ihvz[204] = 223435879;
        lt.ihvz[205] = 797152577;
        lt.ihvz[206] = 218415960;
        lt.ihvz[207] = -361030216;
        lt.ihvz[208] = 1270738963;
        lt.ihvz[209] = 70457196;
        lt.ihvz[210] = 96368912;
        lt.ihvz[211] = -531704885;
        lt.ihvz[212] = -278993597;
        lt.ihvz[213] = -1565543803;
        lt.ihvz[214] = 225222004;
        lt.ihvz[215] = -292555109;
        lt.ihvz[216] = -1775661016;
        lt.ihvz[217] = -856861966;
        lt.ihvz[218] = -2105666051;
        lt.ihvz[219] = -1288201703;
        lt.ihvz[220] = 1780575616;
        lt.ihvz[221] = 1907220290;
        lt.ihvz[222] = 62970729;
        lt.ihvz[223] = -1306954239;
        lt.ihvz[224] = 147378976;
        lt.ihvz[225] = 538847507;
        lt.ihvz[226] = -604308614;
        lt.ihvz[227] = -483936808;
        lt.ihvz[228] = 1113853142;
        lt.ihvz[229] = -1707941526;
        lt.ihvz[230] = 479836906;
        lt.ihvz[231] = 2023948387;
        lt.ihvz[232] = -876577903;
        lt.ihvz[233] = 1747359209;
        lt.ihvz[234] = -1258306348;
        lt.ihvz[235] = 963341153;
        lt.ihvz[236] = -1119254343;
        lt.ihvz[237] = 1540225555;
        lt.ihvz[238] = -772162269;
        lt.ihvz[239] = 245706220;
        lt.ihvz[240] = -977894544;
        lt.ihvz[241] = 1864630447;
        lt.ihvz[242] = -1593742125;
        lt.ihvz[243] = 205668370;
        lt.ihvz[244] = -2128758114;
        lt.ihvz[245] = 1151044122;
        lt.ihvz[246] = 239401668;
        lt.ihvz[247] = -952612854;
        lt.ihvz[248] = 252865046;
        lt.ihvz[249] = -170219207;
        lt.ihvz[250] = -1014595837;
        lt.ihvz[251] = 30833286;
        lt.ihvz[252] = -1904588726;
        lt.ihvz[253] = -1426602365;
        lt.ihvz[254] = 1550234661;
        lt.ihvz[255] = -210939886;
        lt.ihvz[256] = -1769417946;
        lt.ihvz[257] = -242408821;
        lt.ihvz[258] = -895083347;
        lt.ihvz[259] = -2081934221;
        lt.ihvz[260] = 1151313427;
        lt.ihvz[261] = -1927054055;
        lt.ihvz[262] = -1710087558;
        lt.ihvz[263] = 1267701640;
        lt.ihvz[264] = 1997304882;
        lt.ihvz[265] = -1478892731;
        lt.ihvz[266] = -1146761998;
        lt.ihvz[267] = -2022507909;
        lt.ihvz[268] = -1202359367;
        lt.ihvz[269] = -1005786627;
        lt.ihvz[270] = 1135418181;
        lt.ihvz[271] = -925833110;
        lt.ihvz[272] = -1468115588;
        lt.ihvz[273] = -1558193044;
        lt.ihvz[274] = 3481404;
        lt.ihvz[275] = -1697842890;
        lt.ihvz[276] = 1438456733;
        lt.ihvz[277] = 380541077;
        lt.ihvz[278] = -1694343773;
        lt.ihvz[279] = -64864677;
        lt.ihvz[280] = -977838897;
        lt.ihvz[281] = -124311029;
        lt.ihvz[282] = 1877614612;
        lt.ihvz[283] = 1283638644;
        lt.ihvz[284] = -1865035825;
        lt.ihvz[285] = 800480600;
        lt.ihvz[286] = -1526551547;
        lt.ihvz[287] = 87756609;
        lt.ihvz[288] = -1681576104;
        lt.ihvz[289] = 321048959;
        lt.ihvz[290] = -521561647;
        lt.ihvz[291] = 1018864750;
        lt.ihvz[292] = -1122448467;
        lt.ihvz[293] = -798599869;
        lt.ihvz[294] = 597603719;
        lt.ihvz[295] = -351198490;
        lt.ihvz[296] = 393502288;
        lt.ihvz[297] = -621967750;
        lt.ihvz[298] = 1801791247;
        lt.ihvz[299] = 746680742;
    }

    private static /* synthetic */ void ijhu() {
        lt.ihvz[100] = 949473217;
        lt.ihvz[101] = -2077138347;
        lt.ihvz[102] = -40910489;
        lt.ihvz[103] = -202044928;
        lt.ihvz[104] = -454390110;
        lt.ihvz[105] = -1849497444;
        lt.ihvz[106] = 1704267010;
        lt.ihvz[107] = -1174271216;
        lt.ihvz[108] = 1153006426;
        lt.ihvz[109] = 1359008298;
        lt.ihvz[110] = 1032573521;
        lt.ihvz[111] = -596137825;
        lt.ihvz[112] = 5770728;
        lt.ihvz[113] = 1156762650;
        lt.ihvz[114] = 2144038412;
        lt.ihvz[115] = -1394534553;
        lt.ihvz[116] = -319535638;
        lt.ihvz[117] = -1578712182;
        lt.ihvz[118] = -484188764;
        lt.ihvz[119] = 1795730832;
        lt.ihvz[120] = -1208033254;
        lt.ihvz[121] = -856391800;
        lt.ihvz[122] = -1883193060;
        lt.ihvz[123] = 569401165;
        lt.ihvz[124] = 793126484;
        lt.ihvz[125] = 1338936842;
        lt.ihvz[126] = -484140517;
        lt.ihvz[127] = -178209098;
        lt.ihvz[128] = -1903659169;
        lt.ihvz[129] = -549465592;
        lt.ihvz[130] = 1664044759;
        lt.ihvz[131] = -1968181009;
        lt.ihvz[132] = 403356747;
        lt.ihvz[133] = -546651260;
        lt.ihvz[134] = -234022595;
        lt.ihvz[135] = -1577579519;
        lt.ihvz[136] = -660680092;
        lt.ihvz[137] = 1487339145;
        lt.ihvz[138] = -1584611459;
        lt.ihvz[139] = 323085564;
        lt.ihvz[140] = -1955219295;
        lt.ihvz[141] = 1316993184;
        lt.ihvz[142] = 1238185606;
        lt.ihvz[143] = 1809487421;
        lt.ihvz[144] = 272938681;
        lt.ihvz[145] = 19869009;
        lt.ihvz[146] = -297777568;
        lt.ihvz[147] = -550786865;
        lt.ihvz[148] = 620558006;
        lt.ihvz[149] = 1806333133;
        lt.ihvz[150] = -1238640011;
        lt.ihvz[151] = -215955027;
        lt.ihvz[152] = 222946651;
        lt.ihvz[153] = -1450038520;
        lt.ihvz[154] = 469113260;
        lt.ihvz[155] = 180444160;
        lt.ihvz[156] = -1984106040;
        lt.ihvz[157] = -2064206437;
        lt.ihvz[158] = 1175120245;
        lt.ihvz[159] = 467343283;
        lt.ihvz[160] = 594524549;
        lt.ihvz[161] = 882742087;
        lt.ihvz[162] = 218503065;
        lt.ihvz[163] = -914890630;
        lt.ihvz[164] = -809236529;
        lt.ihvz[165] = 1825145989;
        lt.ihvz[166] = 1936731164;
        lt.ihvz[167] = 1747843847;
        lt.ihvz[168] = 2052282238;
        lt.ihvz[169] = 166374988;
        lt.ihvz[170] = -599442463;
        lt.ihvz[171] = 717706397;
        lt.ihvz[172] = -1862340285;
        lt.ihvz[173] = 1619551857;
        lt.ihvz[174] = -1888866788;
        lt.ihvz[175] = -97654513;
        lt.ihvz[176] = -2028520141;
        lt.ihvz[177] = 508345946;
        lt.ihvz[178] = 1309209100;
        lt.ihvz[179] = -470234713;
        lt.ihvz[180] = -946972602;
        lt.ihvz[181] = -1036297304;
        lt.ihvz[182] = 528742894;
        lt.ihvz[183] = 871937330;
        lt.ihvz[184] = 1247923736;
        lt.ihvz[185] = 589255911;
        lt.ihvz[186] = 1479832623;
        lt.ihvz[187] = -1521688905;
        lt.ihvz[188] = -2075518787;
        lt.ihvz[189] = 210989021;
        lt.ihvz[190] = 1015933066;
        lt.ihvz[191] = 1186137400;
        lt.ihvz[192] = 1332869443;
        lt.ihvz[193] = 190414794;
        lt.ihvz[194] = 451676425;
        lt.ihvz[195] = -175216181;
        lt.ihvz[196] = -1522642287;
        lt.ihvz[197] = 99264684;
        lt.ihvz[198] = 1638612169;
        lt.ihvz[199] = 1831786307;
    }

    private static /* synthetic */ void ijiz() {
        lt.ihwa[300] = -1729630645;
        lt.ihwa[301] = 1205992950;
        lt.ihwa[302] = -2013015805;
        lt.ihwa[303] = 1027799968;
        lt.ihwa[304] = -276699663;
        lt.ihwa[305] = 1109626687;
        lt.ihwa[306] = -1764157761;
        lt.ihwa[307] = -1465708878;
        lt.ihwa[308] = 919117218;
        lt.ihwa[309] = 710498443;
        lt.ihwa[310] = 1489340463;
        lt.ihwa[311] = -1808347003;
        lt.ihwa[312] = 453901547;
        lt.ihwa[313] = 928755117;
        lt.ihwa[314] = -617342013;
        lt.ihwa[315] = 1072718030;
        lt.ihwa[316] = 1940193037;
        lt.ihwa[317] = 2143559204;
        lt.ihwa[318] = -1363283517;
        lt.ihwa[319] = -1141894297;
        lt.ihwa[320] = -1121308396;
        lt.ihwa[321] = -1098835040;
        lt.ihwa[322] = 995283586;
        lt.ihwa[323] = -1894456203;
        lt.ihwa[324] = 378371367;
        lt.ihwa[325] = 639567044;
        lt.ihwa[326] = 984538068;
        lt.ihwa[327] = 333286092;
        lt.ihwa[328] = -1348675806;
        lt.ihwa[329] = 2035324974;
        lt.ihwa[330] = 1098453436;
        lt.ihwa[331] = -832713583;
        lt.ihwa[332] = 196386401;
        lt.ihwa[333] = -279112781;
        lt.ihwa[334] = -1125267862;
        lt.ihwa[335] = -199099872;
        lt.ihwa[336] = 1077135582;
        lt.ihwa[337] = 951747566;
        lt.ihwa[338] = 1370688867;
        lt.ihwa[339] = -132861136;
        lt.ihwa[340] = -375444610;
        lt.ihwa[341] = 394201084;
        lt.ihwa[342] = -140202495;
        lt.ihwa[343] = -1223075275;
        lt.ihwa[344] = 88109991;
        lt.ihwa[345] = 1220283776;
        lt.ihwa[346] = 424167710;
        lt.ihwa[347] = 273668613;
        lt.ihwa[348] = 348300821;
        lt.ihwa[349] = 193120493;
        lt.ihwa[350] = -344873460;
        lt.ihwa[351] = 1545380286;
        lt.ihwa[352] = -417909010;
        lt.ihwa[353] = 142700035;
        lt.ihwa[354] = -576038201;
        lt.ihwa[355] = -1856374043;
        lt.ihwa[356] = 1661734675;
        lt.ihwa[357] = 505212057;
        lt.ihwa[358] = -1653652627;
        lt.ihwa[359] = -1765401134;
        lt.ihwa[360] = -1649667400;
        lt.ihwa[361] = 149108125;
        lt.ihwa[362] = -1870037779;
        lt.ihwa[363] = -2112640948;
        lt.ihwa[364] = 369687862;
        lt.ihwa[365] = -1284617127;
        lt.ihwa[366] = -1125132545;
        lt.ihwa[367] = -2076681617;
        lt.ihwa[368] = -358177249;
        lt.ihwa[369] = 1536206839;
        lt.ihwa[370] = -637996717;
        lt.ihwa[371] = 1173372374;
        lt.ihwa[372] = 1605174163;
        lt.ihwa[373] = -1591236281;
        lt.ihwa[374] = 1047885837;
        lt.ihwa[375] = -176609090;
        lt.ihwa[376] = -1127402641;
        lt.ihwa[377] = 1443705068;
        lt.ihwa[378] = -544141548;
        lt.ihwa[379] = 906259745;
        lt.ihwa[380] = -1250237257;
        lt.ihwa[381] = 1625959658;
        lt.ihwa[382] = 399680974;
        lt.ihwa[383] = -1861902709;
        lt.ihwa[384] = -759439507;
        lt.ihwa[385] = 863811759;
        lt.ihwa[386] = -486803305;
        lt.ihwa[387] = -41449797;
        lt.ihwa[388] = 1954981749;
        lt.ihwa[389] = -2013645780;
        lt.ihwa[390] = -451960537;
        lt.ihwa[391] = -898116776;
        lt.ihwa[392] = 254396635;
        lt.ihwa[393] = -1403355453;
        lt.ihwa[394] = -1471461335;
        lt.ihwa[395] = -278392919;
        lt.ihwa[396] = 369029348;
        lt.ihwa[397] = 2120739395;
        lt.ihwa[398] = -1065966172;
        lt.ihwa[399] = -269717088;
    }

    private static /* synthetic */ void ijis() {
        lt.ihwa[200] = 1058236534;
        lt.ihwa[201] = 2088929765;
        lt.ihwa[202] = 205489722;
        lt.ihwa[203] = -325881971;
        lt.ihwa[204] = 223435885;
        lt.ihwa[205] = 797152605;
        lt.ihwa[206] = 218415961;
        lt.ihwa[207] = -361030235;
        lt.ihwa[208] = 1270738956;
        lt.ihwa[209] = 70457206;
        lt.ihwa[210] = 96368906;
        lt.ihwa[211] = -531704874;
        lt.ihwa[212] = -278993585;
        lt.ihwa[213] = -1565543803;
        lt.ihwa[214] = 225222013;
        lt.ihwa[215] = -292555126;
        lt.ihwa[216] = -1775661003;
        lt.ihwa[217] = -856861978;
        lt.ihwa[218] = -2105666076;
        lt.ihwa[219] = -1288201710;
        lt.ihwa[220] = 1780575633;
        lt.ihwa[221] = 1907220291;
        lt.ihwa[222] = 62970729;
        lt.ihwa[223] = -1306954111;
        lt.ihwa[224] = 147378977;
        lt.ihwa[225] = 538847509;
        lt.ihwa[226] = -604308638;
        lt.ihwa[227] = -483936808;
        lt.ihwa[228] = 1113853151;
        lt.ihwa[229] = -1523392150;
        lt.ihwa[230] = 588703427;
        lt.ihwa[231] = 2023948387;
        lt.ihwa[232] = -876577897;
        lt.ihwa[233] = 727291369;
        lt.ihwa[234] = -142555948;
        lt.ihwa[235] = 2048158561;
        lt.ihwa[236] = -29980487;
        lt.ihwa[237] = 1540225555;
        lt.ihwa[238] = -772162269;
        lt.ihwa[239] = 245706218;
        lt.ihwa[240] = -977894544;
        lt.ihwa[241] = 1864630475;
        lt.ihwa[242] = -1593742149;
        lt.ihwa[243] = 205668365;
        lt.ihwa[244] = -2128758030;
        lt.ihwa[245] = 1151044119;
        lt.ihwa[246] = 239401621;
        lt.ihwa[247] = -952612808;
        lt.ihwa[248] = 252865049;
        lt.ihwa[249] = -170219224;
        lt.ihwa[250] = -1014595762;
        lt.ihwa[251] = 30833372;
        lt.ihwa[252] = -1904588749;
        lt.ihwa[253] = -1426602345;
        lt.ihwa[254] = 1550234650;
        lt.ihwa[255] = -210939823;
        lt.ihwa[256] = -1769417963;
        lt.ihwa[257] = -242408719;
        lt.ihwa[258] = -895083272;
        lt.ihwa[259] = -2081934090;
        lt.ihwa[260] = 1151313526;
        lt.ihwa[261] = -1927053963;
        lt.ihwa[262] = -1710087641;
        lt.ihwa[263] = 1267701660;
        lt.ihwa[264] = 1997304953;
        lt.ihwa[265] = -1478892773;
        lt.ihwa[266] = -1146762025;
        lt.ihwa[267] = -2022507996;
        lt.ihwa[268] = -1202359413;
        lt.ihwa[269] = -1005786664;
        lt.ihwa[270] = 1135418148;
        lt.ihwa[271] = -925833114;
        lt.ihwa[272] = -1468115601;
        lt.ihwa[273] = -1558193120;
        lt.ihwa[274] = 3481407;
        lt.ihwa[275] = -1697842860;
        lt.ihwa[276] = 1438456726;
        lt.ihwa[277] = 380541100;
        lt.ihwa[278] = -1694343699;
        lt.ihwa[279] = -64864674;
        lt.ihwa[280] = -977838925;
        lt.ihwa[281] = -124310915;
        lt.ihwa[282] = 1877614645;
        lt.ihwa[283] = 1283638552;
        lt.ihwa[284] = -1865035889;
        lt.ihwa[285] = 800480543;
        lt.ihwa[286] = -1526551467;
        lt.ihwa[287] = 87756570;
        lt.ihwa[288] = -1681576167;
        lt.ihwa[289] = 321048882;
        lt.ihwa[290] = -521561611;
        lt.ihwa[291] = 1018864680;
        lt.ihwa[292] = -1122448448;
        lt.ihwa[293] = -798599898;
        lt.ihwa[294] = 597603743;
        lt.ihwa[295] = -351198575;
        lt.ihwa[296] = 393502213;
        lt.ihwa[297] = -621967803;
        lt.ihwa[298] = 1801791341;
        lt.ihwa[299] = 746680795;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$end$2() {
        v0 /* !! */  = lt.pr;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - lt.ihvw("ijem", ihvt(int ), (int)271));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1106385182: {
                    break block16;
                }
                case -677956822: {
                    v1 = lt.ihvw("ijeo", ihvt(int ), (int)272);
                    continue block16;
                }
                case -510365341: {
                    v1 = lt.ihvw("ijeq", ihvt(int ), (int)273);
                    continue block16;
                }
                case 266243784: {
                    v1 = lt.ihvw("ijes", ihvt(int ), (int)274);
                    continue block16;
                }
            }
            break;
        }
        var2 = lt.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = lt.pr - lt.ihvw("ijeu", ihvt(int ), (int)275)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == lt.ihvw("ijew", ihvy(int ), (int)453)) break;
            v2 /* !! */  = (long)lt.ihvw("ijex", ihvy(int ), (int)454);
        }
        var1_1 /* !! */  = lt.b;
        v3 /* !! */  = lt.pr;
        if (true) ** GOTO lbl29
        block18: while (true) {
            v3 /* !! */  = (long)(lt.ihvw("ijfb", ihvt(int ), (int)277) - lt.ihvw("ijez", ihvt(int ), (int)276));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1612409077: {
                    continue block18;
                }
                case -1106385182: {
                    break block18;
                }
            }
            break;
        }
        var0_2 = lt.a;
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
                return "Glow3D";
            }
lbl44:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)lt.ihvw("ijfd", ihvy(int ), (int)455);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var1_1 /* !! */  = (int)lt.ihvw("ijff", ihvy(int ), (int)456);
                if (!var2) ** GOTO lbl44
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)lt.ihvw("ijfh", ihvy(int ), (int)457);
                if (!var2) ** GOTO lbl44
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)lt.ihvw("ijfj", ihvy(int ), (int)458);
        ** while (!var2)
lbl60:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ijkl() {
        lt.ihvv[0] = -8361995013382687199L;
        lt.ihvv[1] = 1285125451746129638L;
        lt.ihvv[2] = -7449044496521617105L;
        lt.ihvv[3] = -3619701138664400005L;
        lt.ihvv[4] = 8266449178921105478L;
        lt.ihvv[5] = -5030452364426407967L;
        lt.ihvv[6] = 7096489418589833533L;
        lt.ihvv[7] = -62095184888165705L;
        lt.ihvv[8] = -4055599320422006312L;
        lt.ihvv[9] = 8070606767322516802L;
        lt.ihvv[10] = -4072499821276687764L;
        lt.ihvv[11] = -2555520438611787390L;
        lt.ihvv[12] = 3365967483180596527L;
        lt.ihvv[13] = 2088020479008580880L;
        lt.ihvv[14] = -1060584139195923245L;
        lt.ihvv[15] = 2151903501142144319L;
        lt.ihvv[16] = -2823818797788349197L;
        lt.ihvv[17] = -8489497790917721241L;
        lt.ihvv[18] = -7903189948839688128L;
        lt.ihvv[19] = 543804094675228708L;
        lt.ihvv[20] = 3696569782344998187L;
        lt.ihvv[21] = 4924195467958359259L;
        lt.ihvv[22] = -8943211951317010562L;
        lt.ihvv[23] = -800934231802292173L;
        lt.ihvv[24] = 89762715181418244L;
        lt.ihvv[25] = -3281307781539452433L;
        lt.ihvv[26] = -806718537520492349L;
        lt.ihvv[27] = -343939730755167580L;
        lt.ihvv[28] = -4624940389680147297L;
        lt.ihvv[29] = 3088880608822870712L;
        lt.ihvv[30] = 1277924336414610993L;
        lt.ihvv[31] = 3572437721051089528L;
        lt.ihvv[32] = -2106916344666506927L;
        lt.ihvv[33] = 4163861566454062848L;
        lt.ihvv[34] = -2251090265893149855L;
        lt.ihvv[35] = 8110551312899466030L;
        lt.ihvv[36] = -3817735881797969789L;
        lt.ihvv[37] = -6661634510560203812L;
        lt.ihvv[38] = 5553204301547962249L;
        lt.ihvv[39] = 2595662491182887106L;
        lt.ihvv[40] = 6762544902830772914L;
        lt.ihvv[41] = 806186119763471064L;
        lt.ihvv[42] = -4025066591697491204L;
        lt.ihvv[43] = 5403752829616562332L;
        lt.ihvv[44] = -7706049060430369516L;
        lt.ihvv[45] = 7054692711670847359L;
        lt.ihvv[46] = -4202278241740849550L;
        lt.ihvv[47] = 4906349141370644225L;
        lt.ihvv[48] = 3139496338112817337L;
        lt.ihvv[49] = 5502272951112770161L;
        lt.ihvv[50] = 9211242628280060443L;
        lt.ihvv[51] = -5578311849304332293L;
        lt.ihvv[52] = 6461775406717855717L;
        lt.ihvv[53] = -8900427900437231661L;
        lt.ihvv[54] = -8453098331148038635L;
        lt.ihvv[55] = 3164889617624748616L;
        lt.ihvv[56] = -4320131048794557477L;
        lt.ihvv[57] = -7121858154334930301L;
        lt.ihvv[58] = 1212764852586162773L;
        lt.ihvv[59] = 1851087006051931230L;
        lt.ihvv[60] = 3808512121760813837L;
        lt.ihvv[61] = -2258449132123794193L;
        lt.ihvv[62] = -5116891890530542157L;
        lt.ihvv[63] = 5344563708039890583L;
        lt.ihvv[64] = -8702087044809892510L;
        lt.ihvv[65] = -4220717877753957268L;
        lt.ihvv[66] = 6657956990432330720L;
        lt.ihvv[67] = 609551540849589565L;
        lt.ihvv[68] = 8584843580686224091L;
        lt.ihvv[69] = -4015144623232658332L;
        lt.ihvv[70] = 1117941429411887842L;
        lt.ihvv[71] = 3259113863055632528L;
        lt.ihvv[72] = -4056767160986538376L;
        lt.ihvv[73] = -1413376912890737375L;
        lt.ihvv[74] = -5742684340389627166L;
        lt.ihvv[75] = 3536340708237119891L;
        lt.ihvv[76] = -1426986006704531791L;
        lt.ihvv[77] = 2355453464622619700L;
        lt.ihvv[78] = 8402210270810641824L;
        lt.ihvv[79] = -3039441442755980080L;
        lt.ihvv[80] = -2626428030200912981L;
        lt.ihvv[81] = 6001792381301884041L;
        lt.ihvv[82] = 2095010755441812816L;
        lt.ihvv[83] = -3329969393049840328L;
        lt.ihvv[84] = 3360506586473720202L;
        lt.ihvv[85] = -8108829568864664674L;
        lt.ihvv[86] = -2459319327789961529L;
        lt.ihvv[87] = 3817761010220211888L;
        lt.ihvv[88] = 6628853320646851934L;
        lt.ihvv[89] = -8543635836466398209L;
        lt.ihvv[90] = -7798172575072929843L;
        lt.ihvv[91] = 1793581619566416075L;
        lt.ihvv[92] = 2601778359365013933L;
        lt.ihvv[93] = -7226490034604419800L;
        lt.ihvv[94] = -5536184526900049214L;
        lt.ihvv[95] = -5840328030509821942L;
        lt.ihvv[96] = -6298240833342819684L;
        lt.ihvv[97] = -1916550247702270411L;
        lt.ihvv[98] = -3210098309697174766L;
        lt.ihvv[99] = 2643271746226577118L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void begin(boolean var0) {
        block87: {
            v0 /* !! */  = lt.pr;
            if (true) ** GOTO lbl5
            block55: while (true) {
                v0 /* !! */  = (long)(lt.ihvw("iies", ihvt(int ), (int)119) - lt.ihvw("iier", ihvt(int ), (int)118));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1228371780: {
                        continue block55;
                    }
                    case -1106385182: {
                        break block55;
                    }
                }
                break;
            }
            var4_1 = lt.c;
            v1 /* !! */  = lt.pr;
            if (true) ** GOTO lbl15
            block56: while (true) {
                v1 /* !! */  = (long)(v2 - lt.ihvw("iiet", ihvt(int ), (int)120));
lbl15:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1106385182: {
                        break block56;
                    }
                    case 596724550: {
                        v2 = lt.ihvw("iieu", ihvt(int ), (int)121);
                        continue block56;
                    }
                    case 719051024: {
                        v2 = lt.ihvw("iiev", ihvt(int ), (int)122);
                        continue block56;
                    }
                }
                break;
            }
            var3_2 /* !! */  = lt.b;
            v3 /* !! */  = lt.pr;
            if (true) ** GOTO lbl29
            block57: while (true) {
                v3 /* !! */  = (long)(v4 - lt.ihvw("iiew", ihvt(int ), (int)123));
lbl29:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1308992965: {
                        v4 = lt.ihvw("iiex", ihvt(int ), (int)124);
                        continue block57;
                    }
                    case -1106385182: {
                        break block57;
                    }
                    case 1689734303: {
                        v4 = lt.ihvw("iiey", ihvt(int ), (int)125);
                        continue block57;
                    }
                }
                break;
            }
            var2_3 = lt.a;
            if (var4_1) {
                throw null;
lbl41:
                // 10 sources

                return;
            }
            if (var2_3 || var2_3) ** GOTO lbl41
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_0 = lt.pr - lt.ihvw("iiez", ihvt(int ), (int)126)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == lt.ihvw("iifa", ihvy(int ), (int)107)) break;
                v5 /* !! */  = (long)lt.ihvw("iifb", ihvy(int ), (int)108);
            }
            if (lt.pipeline != null) break block87;
            if (var2_3 || var2_3) ** GOTO lbl41
            v6 /* !! */  = lt.pr;
            if (true) ** GOTO lbl55
            block60: while (true) {
                v6 /* !! */  = (long)(lt.ihvw("iifd", ihvt(int ), (int)128) - lt.ihvw("iifc", ihvt(int ), (int)127));
lbl55:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -1106385182: {
                        break block60;
                    }
                    case 1547377237: {
                        continue block60;
                    }
                }
                break;
            }
            lt.init();
            if (var2_3) ** GOTO lbl41
        }
        if (var2_3 || var2_3) ** GOTO lbl41
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v7 = lt.ihvw("iife", ihvy(int ), (int)109);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_1 = lt.pr - lt.ihvw("iiff", ihvt(int ), (int)129)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == lt.ihvw("iifg", ihvy(int ), (int)110)) break;
                    v8 /* !! */  = (long)lt.ihvw("iifh", ihvy(int ), (int)111);
                }
                lt.glowCount = (int)v7;
                if (var2_3 || var2_3) ** GOTO lbl41
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = lt.pr - lt.ihvw("iifi", ihvt(int ), (int)130)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == lt.ihvw("iifj", ihvy(int ), (int)112)) break;
                    v9 /* !! */  = (long)lt.ihvw("iifk", ihvy(int ), (int)113);
                }
                lt.ignoreDepth = var0;
                if (var2_3 || var2_3) ** GOTO lbl41
                v10 /* !! */  = lt.pr;
                if (true) ** GOTO lbl86
                block63: while (true) {
                    v10 /* !! */  = (long)(v11 - lt.ihvw("iifl", ihvt(int ), (int)131));
lbl86:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1988266834: {
                            v11 = lt.ihvw("iifm", ihvt(int ), (int)132);
                            continue block63;
                        }
                        case -1106385182: {
                            break block63;
                        }
                        case 74189605: {
                            v11 = lt.ihvw("iifn", ihvt(int ), (int)133);
                            continue block63;
                        }
                    }
                    break;
                }
                var1_4 = lt.getCameraPos();
                if (var2_3 || var2_3) ** GOTO lbl41
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_3 = lt.pr - lt.ihvw("iifo", ihvt(int ), (int)134)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == lt.ihvw("iifp", ihvy(int ), (int)114)) break;
                    v12 /* !! */  = (long)lt.ihvw("iifq", ihvy(int ), (int)115);
                }
                v13 = var1_4.field_1352;
                v14 /* !! */  = lt.pr;
                if (true) ** GOTO lbl107
                block65: while (true) {
                    v14 /* !! */  = (long)(v15 - lt.ihvw("iifr", ihvt(int ), (int)135));
lbl107:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1106385182: {
                            break block65;
                        }
                        case 165063573: {
                            v15 = lt.ihvw("iifs", ihvt(int ), (int)136);
                            continue block65;
                        }
                        case 2072572220: {
                            v15 = lt.ihvw("iift", ihvt(int ), (int)137);
                            continue block65;
                        }
                    }
                    break;
                }
                lt.cameraX = v13;
                if (var2_3 || var2_3) ** GOTO lbl41
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_4 = lt.pr - lt.ihvw("iifu", ihvt(int ), (int)138)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == lt.ihvw("iifv", ihvy(int ), (int)116)) break;
                    v16 /* !! */  = (long)lt.ihvw("iifw", ihvy(int ), (int)117);
                }
                v17 = var1_4.field_1351;
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_5 = lt.pr - lt.ihvw("iifx", ihvt(int ), (int)139)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == lt.ihvw("iify", ihvy(int ), (int)118)) break;
                    v18 /* !! */  = (long)lt.ihvw("iifz", ihvy(int ), (int)119);
                }
                lt.cameraY = v17;
                if (var2_3 || var2_3) ** GOTO lbl41
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_6 = lt.pr - lt.ihvw("iiga", ihvt(int ), (int)140)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == lt.ihvw("iigb", ihvy(int ), (int)120)) break;
                    v19 /* !! */  = (long)lt.ihvw("iigc", ihvy(int ), (int)121);
                }
                v20 = var1_4.field_1350;
                v21 /* !! */  = lt.pr;
                if (true) ** GOTO lbl141
                block69: while (true) {
                    v21 /* !! */  = (long)(lt.ihvw("iige", ihvt(int ), (int)142) - lt.ihvw("iigd", ihvt(int ), (int)141));
lbl141:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1106385182: {
                            break block69;
                        }
                        case 1012370120: {
                            continue block69;
                        }
                    }
                    break;
                }
                lt.cameraZ = v20;
                if (!var2_3 && !var2_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_2 /* !! */  = (int)lt.ihvw("iigf", ihvy(int ), (int)122);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl178
            }
            case 1: {
                var3_2 /* !! */  = (int)lt.ihvw("iigg", ihvy(int ), (int)123);
                if (!var4_1) break;
                throw null;
            }
            case 2: {
                var3_2 /* !! */  = (int)lt.ihvw("iigh", ihvy(int ), (int)124);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl196
            }
            case 3: {
                var3_2 /* !! */  = (int)lt.ihvw("iigi", ihvy(int ), (int)125);
                if (!var4_1) break;
                throw null;
            }
lbl168:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)lt.ihvw("iigj", ihvy(int ), (int)126);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl196
                    break;
                }
            }
            case 5: {
                var3_2 /* !! */  = (int)lt.ihvw("iigk", ihvy(int ), (int)127);
                if (!var4_1) break;
                throw null;
            }
lbl178:
            // 2 sources

            case 6: {
                var3_2 /* !! */  = (int)lt.ihvw("iigl", ihvy(int ), (int)128);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl196
            }
lbl183:
            // 4 sources

            case 7: {
                var3_2 /* !! */  = (int)lt.ihvw("iigm", ihvy(int ), (int)129);
                if (var4_1) {
                    throw null;
                }
            }
lbl187:
            // 4 sources

            case 8: {
                do {
                    var3_2 /* !! */  = (int)lt.ihvw("iign", ihvy(int ), (int)130);
                } while (!var4_1);
                throw null;
            }
lbl192:
            // 2 sources

            case 9: {
                var3_2 /* !! */  = (int)lt.ihvw("iigo", ihvy(int ), (int)131);
                if (!var4_1) ** GOTO lbl183
                throw null;
            }
lbl196:
            // 4 sources

            case 10: {
                var3_2 /* !! */  = (int)lt.ihvw("iigp", ihvy(int ), (int)132);
                if (var4_1) {
                    throw null;
                }
            }
            case 11: {
                var3_2 /* !! */  = (int)lt.ihvw("iigq", ihvy(int ), (int)133);
                if (!var4_1) ** GOTO lbl187
                throw null;
            }
lbl204:
            // 2 sources

            case 12: {
                var3_2 /* !! */  = (int)lt.ihvw("iigr", ihvy(int ), (int)134);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl213
            }
lbl209:
            // 2 sources

            case 13: {
                var3_2 /* !! */  = (int)lt.ihvw("iigs", ihvy(int ), (int)135);
                if (!var4_1) ** GOTO lbl192
                throw null;
            }
lbl213:
            // 2 sources

            case 14: {
                var3_2 /* !! */  = (int)lt.ihvw("iigt", ihvy(int ), (int)136);
                if (!var4_1) ** GOTO lbl204
                throw null;
            }
            case 15: {
                var3_2 /* !! */  = (int)lt.ihvw("iigu", ihvy(int ), (int)137);
                if (!var4_1) ** GOTO lbl183
                throw null;
            }
            case 16: {
                var3_2 /* !! */  = (int)lt.ihvw("iigv", ihvy(int ), (int)138);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl234
            }
            case 17: {
                var3_2 /* !! */  = (int)lt.ihvw("iigw", ihvy(int ), (int)139);
                if (!var4_1) ** GOTO lbl168
                throw null;
            }
            case 18: {
                var3_2 /* !! */  = (int)lt.ihvw("iigx", ihvy(int ), (int)140);
                if (!var4_1) ** GOTO lbl209
                throw null;
            }
lbl234:
            // 2 sources

            case 19: {
                var3_2 /* !! */  = (int)lt.ihvw("iigy", ihvy(int ), (int)141);
                if (!var4_1) ** GOTO lbl183
                throw null;
            }
            case 20: 
        }
        var3_2 /* !! */  = (int)lt.ihvw("iigz", ihvy(int ), (int)142);
        ** while (!var4_1)
lbl241:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void add(double var0, double var2_1, double var4_2, float var6_3, int var7_4, float var8_5, float var9_6) {
        block67: {
            block66: {
                var13_7 = lt.c;
                var12_8 /* !! */  = lt.b;
                var11_9 = lt.a;
                if (var13_7) {
                    throw null;
lbl6:
                    // 16 sources

                    return;
                }
                if (var11_9 || var11_9) ** GOTO lbl6
                if (lt.glowCount >= lt.ihvw("iijj", ihvy(int ), (int)175)) break block66;
                if (var11_9) ** GOTO lbl6
                if (var6_3 <= 0.0f) break block66;
                if (var11_9) ** GOTO lbl6
                if (!(var8_5 <= lt.ihvw("iijk", iiix(int ), (int)176))) break block67;
                if (var11_9) ** GOTO lbl6
            }
            if (var11_9 || var11_9) ** GOTO lbl6
            return;
        }
        if (var11_9 || var11_9) ** GOTO lbl6
        v0 = lt.glowCount;
        lt.glowCount = v0 + lt.ihvw("iijl", ihvy(int ), (int)177);
        var10_10 = v0 * lt.ihvw("iijm", ihvy(int ), (int)178);
        if (var11_9 || var11_9) ** GOTO lbl6
        lt.glowData[var10_10] = (float)(var0 - lt.cameraX);
        if (var11_9 || var11_9) ** GOTO lbl6
        if (var12_8 /* !! */  == 0) ** GOTO lbl-1000
        switch (var12_8 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                lt.glowData[var10_10 + lt.ihvw("iijn", ihvy(int ), (int)179)] = (float)(var2_1 - lt.cameraY);
                if (var11_9 || var11_9) ** GOTO lbl6
                lt.glowData[var10_10 + lt.ihvw("iijo", ihvy(int ), (int)180)] = (float)(var4_2 - lt.cameraZ);
                if (var11_9 || var11_9) ** GOTO lbl6
                lt.glowData[var10_10 + 3] = var6_3;
                if (var11_9 || var11_9) ** GOTO lbl6
                lt.glowData[var10_10 + lt.ihvw("iijp", ihvy(int ), (int)181)] = (float)(var7_4 >> lt.ihvw("iijq", ihvy(int ), (int)182) & lt.ihvw("iijr", ihvy(int ), (int)183)) / 255.0f;
                if (var11_9 || var11_9) ** GOTO lbl6
                lt.glowData[var10_10 + lt.ihvw("iijs", ihvy(int ), (int)184)] = (float)(var7_4 >> lt.ihvw("iijt", ihvy(int ), (int)185) & lt.ihvw("iiju", ihvy(int ), (int)186)) / 255.0f;
                if (var11_9 || var11_9) ** GOTO lbl6
                lt.glowData[var10_10 + lt.ihvw("iijv", ihvy(int ), (int)187)] = (float)(var7_4 & lt.ihvw("iijw", ihvy(int ), (int)188)) / 255.0f;
                if (var11_9 || var11_9) ** GOTO lbl6
                lt.glowData[var10_10 + lt.ihvw("iijx", ihvy(int ), (int)189)] = Math.min(1.0f, var8_5);
                if (var11_9 || var11_9) ** GOTO lbl6
                lt.glowData[var10_10 + 8] = var9_6;
                if (!var11_9 && !var11_9) ** break;
                ** continue;
                return;
            }
lbl47:
            // 2 sources

            case 0: {
                var12_8 /* !! */  = (int)lt.ihvw("iijy", ihvy(int ), (int)190);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl52:
            // 2 sources

            case 1: {
                var12_8 /* !! */  = (int)lt.ihvw("iijz", ihvy(int ), (int)191);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl127
            }
lbl57:
            // 2 sources

            case 2: {
                var12_8 /* !! */  = (int)lt.ihvw("iika", ihvy(int ), (int)192);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl171
            }
            case 3: {
                var12_8 /* !! */  = (int)lt.ihvw("iikb", ihvy(int ), (int)193);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl67:
            // 2 sources

            case 4: {
                var12_8 /* !! */  = (int)lt.ihvw("iikc", ihvy(int ), (int)194);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl72:
            // 3 sources

            case 5: {
                var12_8 /* !! */  = (int)lt.ihvw("iikd", ihvy(int ), (int)195);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl92
            }
            case 6: {
                var12_8 /* !! */  = (int)lt.ihvw("iike", ihvy(int ), (int)196);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl142
            }
lbl82:
            // 2 sources

            case 7: {
                var12_8 /* !! */  = (int)lt.ihvw("iikf", ihvy(int ), (int)197);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl107
            }
            case 8: {
                var12_8 /* !! */  = (int)lt.ihvw("iikg", ihvy(int ), (int)198);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl92:
            // 2 sources

            case 9: {
                var12_8 /* !! */  = (int)lt.ihvw("iikh", ihvy(int ), (int)199);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl166
            }
            case 10: {
                var12_8 /* !! */  = (int)lt.ihvw("iiki", ihvy(int ), (int)200);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl132
            }
            case 11: {
                var12_8 /* !! */  = (int)lt.ihvw("iikj", ihvy(int ), (int)201);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl179
            }
lbl107:
            // 2 sources

            case 12: {
                var12_8 /* !! */  = (int)lt.ihvw("iikk", ihvy(int ), (int)202);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl127
            }
            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var12_8 /* !! */  = (int)lt.ihvw("iikl", ihvy(int ), (int)203);
                    if (var13_7) {
                        throw null;
                    }
                    ** GOTO lbl158
                    break;
                }
            }
            case 14: {
                var12_8 /* !! */  = (int)lt.ihvw("iikm", ihvy(int ), (int)204);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl179
            }
            case 15: {
                var12_8 /* !! */  = (int)lt.ihvw("iikn", ihvy(int ), (int)205);
                if (!var13_7) ** GOTO lbl67
                throw null;
            }
lbl127:
            // 4 sources

            case 16: {
                var12_8 /* !! */  = (int)lt.ihvw("iiko", ihvy(int ), (int)206);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl132:
            // 2 sources

            case 17: {
                var12_8 /* !! */  = (int)lt.ihvw("iikp", ihvy(int ), (int)207);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl137:
            // 2 sources

            case 18: {
                var12_8 /* !! */  = (int)lt.ihvw("iikq", ihvy(int ), (int)208);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl142:
            // 2 sources

            case 19: {
                var12_8 /* !! */  = (int)lt.ihvw("iikr", ihvy(int ), (int)209);
                if (!var13_7) ** GOTO lbl127
                throw null;
            }
lbl146:
            // 2 sources

            case 20: {
                var12_8 /* !! */  = (int)lt.ihvw("iiks", ihvy(int ), (int)210);
                if (!var13_7) ** GOTO lbl47
                throw null;
            }
            case 21: {
                var12_8 /* !! */  = (int)lt.ihvw("iikt", ihvy(int ), (int)211);
                if (!var13_7) ** GOTO lbl72
                throw null;
            }
lbl154:
            // 4 sources

            case 22: {
                var12_8 /* !! */  = (int)lt.ihvw("iiku", ihvy(int ), (int)212);
                if (!var13_7) ** GOTO lbl82
                throw null;
            }
lbl158:
            // 2 sources

            case 23: {
                var12_8 /* !! */  = (int)lt.ihvw("iikv", ihvy(int ), (int)213);
                if (!var13_7) ** GOTO lbl146
                throw null;
            }
            case 24: {
                var12_8 /* !! */  = (int)lt.ihvw("iikw", ihvy(int ), (int)214);
                if (var13_7) {
                    throw null;
                }
            }
lbl166:
            // 4 sources

            case 25: {
                var12_8 /* !! */  = (int)lt.ihvw("iikx", ihvy(int ), (int)215);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl171:
            // 2 sources

            case 26: {
                var12_8 /* !! */  = (int)lt.ihvw("iiky", ihvy(int ), (int)216);
                if (!var13_7) ** GOTO lbl57
                throw null;
            }
            case 27: {
                var12_8 /* !! */  = (int)lt.ihvw("iikz", ihvy(int ), (int)217);
                if (!var13_7) ** GOTO lbl72
                throw null;
            }
lbl179:
            // 3 sources

            case 28: {
                var12_8 /* !! */  = (int)lt.ihvw("iila", ihvy(int ), (int)218);
                if (!var13_7) break;
                throw null;
            }
lbl183:
            // 4 sources

            case 29: {
                var12_8 /* !! */  = (int)lt.ihvw("iilb", ihvy(int ), (int)219);
                if (!var13_7) ** GOTO lbl137
                throw null;
            }
lbl187:
            // 3 sources

            case 30: {
                var12_8 /* !! */  = (int)lt.ihvw("iilc", ihvy(int ), (int)220);
                if (!var13_7) ** GOTO lbl52
                throw null;
            }
            case 31: 
        }
        var12_8 /* !! */  = (int)lt.ihvw("iild", ihvy(int ), (int)221);
        ** while (!var13_7)
lbl194:
        // 1 sources

        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String lambda$init$1() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = pr - lt.ihvw("ijfl", ihvt(int ), (int)278)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == lt.ihvw("ijfm", ihvy(int ), (int)459)) break;
            object = lt.ihvw("ijfo", ihvy(int ), (int)460);
        }
        boolean bl3 = c;
        Object object = pr;
        block11: while (true) {
            switch ((int)object) {
                case -2122818259: {
                    object = lt.ihvw("ijfr", ihvt(int ), (int)280) - lt.ihvw("ijfq", ihvt(int ), (int)279);
                    continue block11;
                }
                case -1106385182: {
                    break block11;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object2;
            if ((object2 = (l3 = pr - lt.ihvw("ijfu", ihvt(int ), (int)281)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object2 == lt.ihvw("ijfw", ihvy(int ), (int)461)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object2 = lt.ihvw("ijfx", ihvy(int ), (int)462);
        }
        if (!bl2 && !bl2) {
            return "Glow3D Vertices";
        }
        if (n2 == 0) return null;
        switch (n2) {
            default: {
                return null;
            }
            case 1: {
                do {
                    CallSite callSite = lt.ihvw("ijgb", ihvy(int ), (int)464);
                } while (!bl3);
                throw null;
            }
            case 2: {
                CallSite callSite = lt.ihvw("ijgd", ihvy(int ), (int)465);
                if (bl3) {
                    throw null;
                }
            }
            case 0: {
                break;
            }
            case 3: {
                CallSite callSite = lt.ihvw("ijgf", ihvy(int ), (int)466);
                if (!bl3) break;
                throw null;
            }
        }
        do {
            CallSite callSite = lt.ihvw("ijfz", ihvy(int ), (int)463);
        } while (!bl3);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void shutdown() {
        v0 /* !! */  = lt.pr;
        if (true) ** GOTO lbl5
        block57: while (true) {
            v0 /* !! */  = (long)(lt.ihvw("ijas", ihvt(int ), (int)245) - lt.ihvw("ijaq", ihvt(int ), (int)244));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1254717566: {
                    continue block57;
                }
                case -1106385182: {
                    break block57;
                }
            }
            break;
        }
        var2 = lt.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = lt.pr - lt.ihvw("ijau", ihvt(int ), (int)246)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == lt.ihvw("ijaw", ihvy(int ), (int)427)) break;
            v1 /* !! */  = (long)lt.ihvw("ijay", ihvy(int ), (int)428);
        }
        var1_1 /* !! */  = lt.b;
        v2 /* !! */  = lt.pr;
        if (true) ** GOTO lbl21
        block59: while (true) {
            v2 /* !! */  = (long)(lt.ihvw("ijbc", ihvt(int ), (int)248) - lt.ihvw("ijba", ihvt(int ), (int)247));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1106385182: {
                    break block59;
                }
                case -354057057: {
                    continue block59;
                }
            }
            break;
        }
        var0_2 = lt.a;
        if (var2) {
            throw null;
lbl29:
            // 10 sources

            return;
        }
        if (var0_2 || var0_2) ** GOTO lbl29
        v3 /* !! */  = lt.pr;
        if (true) ** GOTO lbl36
        block61: while (true) {
            v3 /* !! */  = (long)(v4 - lt.ihvw("ijbd", ihvt(int ), (int)249));
lbl36:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1106385182: {
                    break block61;
                }
                case -590631088: {
                    v4 = lt.ihvw("ijbf", ihvt(int ), (int)250);
                    continue block61;
                }
                case 437192264: {
                    v4 = lt.ihvw("ijbh", ihvt(int ), (int)251);
                    continue block61;
                }
                case 1813030863: {
                    v4 = lt.ihvw("ijbj", ihvt(int ), (int)252);
                    continue block61;
                }
            }
            break;
        }
        if (lt.uniformBuffer == null) ** GOTO lbl84
        if (var0_2) ** GOTO lbl29
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** GOTO lbl29
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = lt.pr - lt.ihvw("ijbl", ihvt(int ), (int)253)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == lt.ihvw("ijbn", ihvy(int ), (int)429)) break;
                    v5 /* !! */  = (long)lt.ihvw("ijbp", ihvy(int ), (int)430);
                }
                v6 /* !! */  = lt.pr;
                if (true) ** GOTO lbl63
                block63: while (true) {
                    v6 /* !! */  = (long)(v7 - lt.ihvw("ijbr", ihvt(int ), (int)254));
lbl63:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1106385182: {
                            break block63;
                        }
                        case 802987905: {
                            v7 = lt.ihvw("ijbt", ihvt(int ), (int)255);
                            continue block63;
                        }
                        case 1360425078: {
                            v7 = lt.ihvw("ijbv", ihvt(int ), (int)256);
                            continue block63;
                        }
                        case 2052535763: {
                            v7 = lt.ihvw("ijbx", ihvt(int ), (int)257);
                            continue block63;
                        }
                    }
                    break;
                }
                lt.uniformBuffer.close();
                if (var0_2 || var0_2) ** GOTO lbl29
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = lt.pr - lt.ihvw("ijca", ihvt(int ), (int)258)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == lt.ihvw("ijcc", ihvy(int ), (int)431)) break;
                    v8 /* !! */  = (long)lt.ihvw("ijcd", ihvy(int ), (int)432);
                }
                lt.uniformBuffer = null;
                if (var0_2) ** GOTO lbl29
lbl84:
                // 2 sources

                if (var0_2 || var0_2) ** GOTO lbl29
                v9 /* !! */  = lt.pr;
                if (true) ** GOTO lbl89
                block65: while (true) {
                    v9 /* !! */  = (long)(v10 - lt.ihvw("ijcf", ihvt(int ), (int)259));
lbl89:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -2144688615: {
                            v10 = lt.ihvw("ijch", ihvt(int ), (int)260);
                            continue block65;
                        }
                        case -1106385182: {
                            break block65;
                        }
                        case -937682532: {
                            v10 = lt.ihvw("ijcj", ihvt(int ), (int)261);
                            continue block65;
                        }
                        case 179641345: {
                            v10 = lt.ihvw("ijcl", ihvt(int ), (int)262);
                            continue block65;
                        }
                    }
                    break;
                }
                if (lt.vertexBuffer == null) ** GOTO lbl141
                if (var0_2 || var0_2) ** GOTO lbl29
                v11 /* !! */  = lt.pr;
                if (true) ** GOTO lbl107
                block66: while (true) {
                    v11 /* !! */  = (long)(v12 - lt.ihvw("ijcn", ihvt(int ), (int)263));
lbl107:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1106385182: {
                            break block66;
                        }
                        case -789756185: {
                            v12 = lt.ihvw("ijcp", ihvt(int ), (int)264);
                            continue block66;
                        }
                        case 438219049: {
                            v12 = lt.ihvw("ijcr", ihvt(int ), (int)265);
                            continue block66;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_3 = lt.pr - lt.ihvw("ijct", ihvt(int ), (int)266)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == lt.ihvw("ijcu", ihvy(int ), (int)433)) break;
                    v13 /* !! */  = (long)lt.ihvw("ijcv", ihvy(int ), (int)434);
                }
                lt.vertexBuffer.close();
                if (var0_2 || var0_2) ** GOTO lbl29
                v14 /* !! */  = lt.pr;
                if (true) ** GOTO lbl127
                block68: while (true) {
                    v14 /* !! */  = (long)(v15 - lt.ihvw("ijcw", ihvt(int ), (int)267));
lbl127:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1106385182: {
                            break block68;
                        }
                        case -379661070: {
                            v15 = lt.ihvw("ijcx", ihvt(int ), (int)268);
                            continue block68;
                        }
                        case 1764768274: {
                            v15 = lt.ihvw("ijcy", ihvt(int ), (int)269);
                            continue block68;
                        }
                        case 1891526218: {
                            v15 = lt.ihvw("ijcz", ihvt(int ), (int)270);
                            continue block68;
                        }
                    }
                    break;
                }
                lt.vertexBuffer = null;
                if (var0_2) ** GOTO lbl29
lbl141:
                // 2 sources

                if (!var0_2 && !var0_2) ** break;
                ** continue;
                return;
            }
lbl144:
            // 3 sources

            case 0: {
                var1_1 /* !! */  = (int)lt.ihvw("ijda", ihvy(int ), (int)435);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl149:
            // 2 sources

            case 1: {
                var1_1 /* !! */  = (int)lt.ihvw("ijdb", ihvy(int ), (int)436);
                if (!var2) ** GOTO lbl144
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)lt.ihvw("ijdc", ihvy(int ), (int)437);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl172
            }
lbl158:
            // 3 sources

            case 3: {
                var1_1 /* !! */  = (int)lt.ihvw("ijdd", ihvy(int ), (int)438);
                if (!var2) ** GOTO lbl144
                throw null;
            }
lbl162:
            // 4 sources

            case 4: {
                var1_1 /* !! */  = (int)lt.ihvw("ijde", ihvy(int ), (int)439);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl203
            }
            case 5: {
                var1_1 /* !! */  = (int)lt.ihvw("ijdh", ihvy(int ), (int)440);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl172:
            // 2 sources

            case 6: {
                var1_1 /* !! */  = (int)lt.ihvw("ijdj", ihvy(int ), (int)441);
                if (!var2) break;
                throw null;
            }
lbl176:
            // 2 sources

            case 7: {
                var1_1 /* !! */  = (int)lt.ihvw("ijdm", ihvy(int ), (int)442);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl199
            }
            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)lt.ihvw("ijdo", ihvy(int ), (int)443);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl211
                    break;
                }
            }
            case 9: {
                var1_1 /* !! */  = (int)lt.ihvw("ijdr", ihvy(int ), (int)444);
                if (!var2) ** GOTO lbl149
                throw null;
            }
            case 10: {
                var1_1 /* !! */  = (int)lt.ihvw("ijdt", ihvy(int ), (int)445);
                if (!var2) ** GOTO lbl162
                throw null;
            }
lbl195:
            // 2 sources

            case 11: {
                var1_1 /* !! */  = (int)lt.ihvw("ijdu", ihvy(int ), (int)446);
                if (!var2) ** GOTO lbl162
                throw null;
            }
lbl199:
            // 2 sources

            case 12: {
                var1_1 /* !! */  = (int)lt.ihvw("ijdw", ihvy(int ), (int)447);
                if (!var2) ** GOTO lbl195
                throw null;
            }
lbl203:
            // 2 sources

            case 13: {
                var1_1 /* !! */  = (int)lt.ihvw("ijdy", ihvy(int ), (int)448);
                if (!var2) ** GOTO lbl176
                throw null;
            }
lbl207:
            // 3 sources

            case 14: {
                var1_1 /* !! */  = (int)lt.ihvw("ijea", ihvy(int ), (int)449);
                if (!var2) ** GOTO lbl158
                throw null;
            }
lbl211:
            // 2 sources

            case 15: {
                var1_1 /* !! */  = (int)lt.ihvw("ijec", ihvy(int ), (int)450);
                if (!var2) ** GOTO lbl162
                throw null;
            }
            case 16: {
                var1_1 /* !! */  = (int)lt.ihvw("ijee", ihvy(int ), (int)451);
                if (!var2) ** GOTO lbl207
                throw null;
            }
            case 17: 
        }
        var1_1 /* !! */  = (int)lt.ihvw("ijeh", ihvy(int ), (int)452);
        ** while (!var2)
lbl222:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ijkn() {
        lt.ihvv[200] = 3897455378471054973L;
        lt.ihvv[201] = 4938076397645608648L;
        lt.ihvv[202] = -1335438936255152129L;
        lt.ihvv[203] = -6585745887212208797L;
        lt.ihvv[204] = 2760617405093034844L;
        lt.ihvv[205] = 9005239847318936634L;
        lt.ihvv[206] = -8140801093131858841L;
        lt.ihvv[207] = 663370018934937318L;
        lt.ihvv[208] = -61020732415375750L;
        lt.ihvv[209] = -1874688197407627982L;
        lt.ihvv[210] = -5961416719976885741L;
        lt.ihvv[211] = -766176091012588049L;
        lt.ihvv[212] = 1604071790628068277L;
        lt.ihvv[213] = 1767032358374612415L;
        lt.ihvv[214] = 9076097004340938544L;
        lt.ihvv[215] = 2248143574618288140L;
        lt.ihvv[216] = -1726338210410278930L;
        lt.ihvv[217] = -198186908145957864L;
        lt.ihvv[218] = 6297470842674855044L;
        lt.ihvv[219] = -8704981762699854551L;
        lt.ihvv[220] = 3625149860740900408L;
        lt.ihvv[221] = 7097280035680621457L;
        lt.ihvv[222] = -2819139865200924962L;
        lt.ihvv[223] = -1599569758303928941L;
        lt.ihvv[224] = 773553322047954174L;
        lt.ihvv[225] = 7045131366037399901L;
        lt.ihvv[226] = -715087970980228443L;
        lt.ihvv[227] = -2085587993274828978L;
        lt.ihvv[228] = 2526080174604226427L;
        lt.ihvv[229] = -2761562685796276804L;
        lt.ihvv[230] = 1936974098652598269L;
        lt.ihvv[231] = 5430828208069875070L;
        lt.ihvv[232] = 6116138276478636176L;
        lt.ihvv[233] = 5962519916382363586L;
        lt.ihvv[234] = -458459434206685212L;
        lt.ihvv[235] = -3183140377314978463L;
        lt.ihvv[236] = 1993265483455270428L;
        lt.ihvv[237] = 7523420618719500089L;
        lt.ihvv[238] = 6779294256249353266L;
        lt.ihvv[239] = -8728680013340452083L;
        lt.ihvv[240] = 3298113234085570289L;
        lt.ihvv[241] = 5958715376462588763L;
        lt.ihvv[242] = -3015250237992504689L;
        lt.ihvv[243] = -8843032256161342955L;
        lt.ihvv[244] = 5104708661543495448L;
        lt.ihvv[245] = 7600145311185503346L;
        lt.ihvv[246] = -5360916165188316699L;
        lt.ihvv[247] = 6975733826834249416L;
        lt.ihvv[248] = -578631182978902728L;
        lt.ihvv[249] = -3879428794137752296L;
        lt.ihvv[250] = 6121282104931151864L;
        lt.ihvv[251] = 5823539018250682194L;
        lt.ihvv[252] = 6476066109056455714L;
        lt.ihvv[253] = -7861279912505053619L;
        lt.ihvv[254] = -4964077514507062351L;
        lt.ihvv[255] = 3615342276524919051L;
        lt.ihvv[256] = 2448771584654940074L;
        lt.ihvv[257] = 5758931525968408205L;
        lt.ihvv[258] = 5996631431970237911L;
        lt.ihvv[259] = -6451462186023760504L;
        lt.ihvv[260] = -2606582341986416183L;
        lt.ihvv[261] = -7703446078653785815L;
        lt.ihvv[262] = 3286495836526734649L;
        lt.ihvv[263] = 3698130225694116088L;
        lt.ihvv[264] = -9128753930588735649L;
        lt.ihvv[265] = 6875936598733466878L;
        lt.ihvv[266] = -4967305784486969187L;
        lt.ihvv[267] = 1311713324722666722L;
        lt.ihvv[268] = 3795531764401272611L;
        lt.ihvv[269] = -7997250501865906368L;
        lt.ihvv[270] = 3642272447187409737L;
        lt.ihvv[271] = -6704632380064623936L;
        lt.ihvv[272] = -3787474306781457772L;
        lt.ihvv[273] = 4170540879104423646L;
        lt.ihvv[274] = -4226268969394156230L;
        lt.ihvv[275] = -7982546063519944522L;
        lt.ihvv[276] = -683312771789331386L;
        lt.ihvv[277] = 7618841395024376962L;
        lt.ihvv[278] = 8358302026491649111L;
        lt.ihvv[279] = -6566749186993328008L;
        lt.ihvv[280] = 8208930625947191815L;
        lt.ihvv[281] = 1893831670484326333L;
        lt.ihvv[282] = 924997492222835292L;
        lt.ihvv[283] = 105075848672022801L;
        lt.ihvv[284] = -3421014923422513718L;
    }

    private static /* synthetic */ float iiix(int n2) {
        return Float.intBitsToFloat(ihvz[n2] ^ ihwa[n2]);
    }

    private static /* synthetic */ void ijhm() {
        lt.ihvz[0] = -1745294583;
        lt.ihvz[1] = -1300602186;
        lt.ihvz[2] = -2059472869;
        lt.ihvz[3] = -501012718;
        lt.ihvz[4] = 1624232359;
        lt.ihvz[5] = 1252502518;
        lt.ihvz[6] = 264944979;
        lt.ihvz[7] = 1893045183;
        lt.ihvz[8] = -431730938;
        lt.ihvz[9] = 1028250947;
        lt.ihvz[10] = -2082711828;
        lt.ihvz[11] = 1822201572;
        lt.ihvz[12] = 1449719937;
        lt.ihvz[13] = 530849114;
        lt.ihvz[14] = -1521274941;
        lt.ihvz[15] = 482481942;
        lt.ihvz[16] = 610472933;
        lt.ihvz[17] = 292282532;
        lt.ihvz[18] = -1503864133;
        lt.ihvz[19] = 1872968503;
        lt.ihvz[20] = 218053607;
        lt.ihvz[21] = -1400065151;
        lt.ihvz[22] = -635391281;
        lt.ihvz[23] = 203400543;
        lt.ihvz[24] = 1852762409;
        lt.ihvz[25] = -1107135757;
        lt.ihvz[26] = 707145029;
        lt.ihvz[27] = -435263529;
        lt.ihvz[28] = -1168793195;
        lt.ihvz[29] = -435141414;
        lt.ihvz[30] = 580495652;
        lt.ihvz[31] = 1479755333;
        lt.ihvz[32] = 1079091591;
        lt.ihvz[33] = 1434785089;
        lt.ihvz[34] = 700983220;
        lt.ihvz[35] = 470948267;
        lt.ihvz[36] = -1950424997;
        lt.ihvz[37] = -189415058;
        lt.ihvz[38] = -1398904295;
        lt.ihvz[39] = -1166752315;
        lt.ihvz[40] = -1882800146;
        lt.ihvz[41] = 419310739;
        lt.ihvz[42] = 1616458349;
        lt.ihvz[43] = -966778577;
        lt.ihvz[44] = -1824062952;
        lt.ihvz[45] = 1081901499;
        lt.ihvz[46] = 2057861043;
        lt.ihvz[47] = 492984665;
        lt.ihvz[48] = -223864029;
        lt.ihvz[49] = -1631029863;
        lt.ihvz[50] = -1229651374;
        lt.ihvz[51] = -1281596690;
        lt.ihvz[52] = -2027341925;
        lt.ihvz[53] = 364988260;
        lt.ihvz[54] = 1331017458;
        lt.ihvz[55] = -1262896943;
        lt.ihvz[56] = -671309612;
        lt.ihvz[57] = -1678779450;
        lt.ihvz[58] = -151612896;
        lt.ihvz[59] = -871027579;
        lt.ihvz[60] = -35527352;
        lt.ihvz[61] = 759548199;
        lt.ihvz[62] = 2061157517;
        lt.ihvz[63] = 46296661;
        lt.ihvz[64] = 225689819;
        lt.ihvz[65] = 929873757;
        lt.ihvz[66] = -1516040727;
        lt.ihvz[67] = -77378142;
        lt.ihvz[68] = -2017070208;
        lt.ihvz[69] = -1428599074;
        lt.ihvz[70] = 2053456833;
        lt.ihvz[71] = -990032329;
        lt.ihvz[72] = 2023571291;
        lt.ihvz[73] = -390008673;
        lt.ihvz[74] = -1274347952;
        lt.ihvz[75] = 1752488246;
        lt.ihvz[76] = 1444710217;
        lt.ihvz[77] = 1762033019;
        lt.ihvz[78] = 724782225;
        lt.ihvz[79] = 584447313;
        lt.ihvz[80] = -99839808;
        lt.ihvz[81] = -1100951049;
        lt.ihvz[82] = 1383428481;
        lt.ihvz[83] = 865872384;
        lt.ihvz[84] = -253534658;
        lt.ihvz[85] = -115318011;
        lt.ihvz[86] = 1906832902;
        lt.ihvz[87] = -26490157;
        lt.ihvz[88] = 675161478;
        lt.ihvz[89] = -666506676;
        lt.ihvz[90] = -1849579859;
        lt.ihvz[91] = 1800791763;
        lt.ihvz[92] = -1880430361;
        lt.ihvz[93] = 403913385;
        lt.ihvz[94] = -433406321;
        lt.ihvz[95] = 1458072553;
        lt.ihvz[96] = -1975845689;
        lt.ihvz[97] = -750269777;
        lt.ihvz[98] = 1093751105;
        lt.ihvz[99] = -748886104;
    }

    private static /* synthetic */ void ijkm() {
        lt.ihvv[100] = 5619025436104638120L;
        lt.ihvv[101] = -6231959837162516848L;
        lt.ihvv[102] = 8018065626164087861L;
        lt.ihvv[103] = 4899738263733183338L;
        lt.ihvv[104] = -8914358080458087284L;
        lt.ihvv[105] = -4717648704228816774L;
        lt.ihvv[106] = -7567227034877203888L;
        lt.ihvv[107] = -6228700595186619964L;
        lt.ihvv[108] = -8953065938265364943L;
        lt.ihvv[109] = 2200984603471773022L;
        lt.ihvv[110] = 7979489664989973843L;
        lt.ihvv[111] = 4123465984960162840L;
        lt.ihvv[112] = 1062619635476301449L;
        lt.ihvv[113] = -3173602111457129189L;
        lt.ihvv[114] = 2023014738056712357L;
        lt.ihvv[115] = 7892411133885985228L;
        lt.ihvv[116] = -2883280847224513879L;
        lt.ihvv[117] = -8926280084981193566L;
        lt.ihvv[118] = 4341269377318398598L;
        lt.ihvv[119] = 3231384999628302171L;
        lt.ihvv[120] = -8387774359144902093L;
        lt.ihvv[121] = 3648177189999231947L;
        lt.ihvv[122] = 1282407608215677836L;
        lt.ihvv[123] = 3781471511148330221L;
        lt.ihvv[124] = 5298645139795471452L;
        lt.ihvv[125] = -4552650208922272844L;
        lt.ihvv[126] = -7670142737106294394L;
        lt.ihvv[127] = 6127675610034660734L;
        lt.ihvv[128] = 346667886916583672L;
        lt.ihvv[129] = 6172203060809298404L;
        lt.ihvv[130] = -3688878098513052044L;
        lt.ihvv[131] = 5068309506263608062L;
        lt.ihvv[132] = 4534045528351467017L;
        lt.ihvv[133] = -4174837524603628092L;
        lt.ihvv[134] = 3922487306674135102L;
        lt.ihvv[135] = 1281273659026466539L;
        lt.ihvv[136] = -1861911183625928473L;
        lt.ihvv[137] = -7345452924804569976L;
        lt.ihvv[138] = 1342571351340418195L;
        lt.ihvv[139] = -4335406400600505954L;
        lt.ihvv[140] = -8810253932343950675L;
        lt.ihvv[141] = 5367995134312236428L;
        lt.ihvv[142] = -4688364272493313699L;
        lt.ihvv[143] = 5861278684164372887L;
        lt.ihvv[144] = 3846193910590109703L;
        lt.ihvv[145] = -4769733429643371983L;
        lt.ihvv[146] = 4868888562913607412L;
        lt.ihvv[147] = -6100510050236079671L;
        lt.ihvv[148] = 3739744676846936058L;
        lt.ihvv[149] = -675696609810411664L;
        lt.ihvv[150] = -7464052155562282778L;
        lt.ihvv[151] = -8762780959596170409L;
        lt.ihvv[152] = 473972235939459671L;
        lt.ihvv[153] = 1930088226663592374L;
        lt.ihvv[154] = -5628608095185186039L;
        lt.ihvv[155] = -6978331967155698694L;
        lt.ihvv[156] = -4317140401074630135L;
        lt.ihvv[157] = -4443683241163733872L;
        lt.ihvv[158] = 7002292640688113025L;
        lt.ihvv[159] = 5445461779115765318L;
        lt.ihvv[160] = 6548467363697772166L;
        lt.ihvv[161] = -2148025901121819688L;
        lt.ihvv[162] = 3915306258573608099L;
        lt.ihvv[163] = -896484004378632759L;
        lt.ihvv[164] = 3107020254628881769L;
        lt.ihvv[165] = 8284466588407609067L;
        lt.ihvv[166] = -5695460669455272739L;
        lt.ihvv[167] = -8789191292259756535L;
        lt.ihvv[168] = -4374011517231684666L;
        lt.ihvv[169] = 132371768376839631L;
        lt.ihvv[170] = -8221110946103045733L;
        lt.ihvv[171] = 3326360175933619665L;
        lt.ihvv[172] = -4003593663418636272L;
        lt.ihvv[173] = -230421622124650793L;
        lt.ihvv[174] = 8770165054797034127L;
        lt.ihvv[175] = 524308867444505324L;
        lt.ihvv[176] = 4628592667808049643L;
        lt.ihvv[177] = 2177927125659801519L;
        lt.ihvv[178] = -649785688378175960L;
        lt.ihvv[179] = 7511519379301029937L;
        lt.ihvv[180] = 7446716479114695275L;
        lt.ihvv[181] = -4127981075300927077L;
        lt.ihvv[182] = -5232011054633600953L;
        lt.ihvv[183] = -7263740277891333384L;
        lt.ihvv[184] = -8176929103723336624L;
        lt.ihvv[185] = -8695639238695839266L;
        lt.ihvv[186] = -3323153944967791515L;
        lt.ihvv[187] = -6892791479993751072L;
        lt.ihvv[188] = 7588404607004094233L;
        lt.ihvv[189] = 2962931303370836503L;
        lt.ihvv[190] = 3435325146038261103L;
        lt.ihvv[191] = -2538360691811974928L;
        lt.ihvv[192] = 4591307885310385813L;
        lt.ihvv[193] = -9103306527095336774L;
        lt.ihvv[194] = 4837146906452065366L;
        lt.ihvv[195] = 1437930967625257787L;
        lt.ihvv[196] = -8522841070633140810L;
        lt.ihvv[197] = -2242487262191407099L;
        lt.ihvv[198] = -8355246278642555891L;
        lt.ihvv[199] = -1667984856089563245L;
    }

    private static /* synthetic */ long ihvt(int n2) {
        return ihvu[n2] ^ ihvv[n2];
    }

    public static /* synthetic */ CallSite ihvw(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    public lt() {
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    public static void setMatrices(Matrix4f matrix4f, Matrix4f matrix4f2) {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = pr - lt.ihvw("iibu", ihvt(int ), (int)86)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == lt.ihvw("iibv", ihvy(int ), (int)64)) break;
            object = lt.ihvw("iibw", ihvy(int ), (int)65);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = pr - lt.ihvw("iibx", ihvt(int ), (int)87)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == lt.ihvw("iiby", ihvy(int ), (int)66)) break;
            object = lt.ihvw("iibz", ihvy(int ), (int)67);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = pr - lt.ihvw("iica", ihvt(int ), (int)88)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == lt.ihvw("iicb", ihvy(int ), (int)68)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = lt.ihvw("iicc", ihvy(int ), (int)69);
        }
        if (bl2 || bl2) return;
        Object object = pr;
        block17: while (true) {
            switch ((int)object) {
                case -1106385182: {
                    break block17;
                }
                case -72796445: {
                    object = lt.ihvw("iice", ihvt(int ), (int)90) - lt.ihvw("iicd", ihvt(int ), (int)89);
                    continue block17;
                }
            }
            break;
        }
        while (true) {
            long l5;
            Object object2;
            if ((object2 = (l5 = pr - lt.ihvw("iicf", ihvt(int ), (int)91)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object2 == lt.ihvw("iicg", ihvy(int ), (int)70)) {
                projectionMatrix.set((Matrix4fc)matrix4f);
                if (bl2) return;
                break;
            }
            object2 = lt.ihvw("iich", ihvy(int ), (int)71);
        }
        if (bl2) return;
        while (true) {
            long l6;
            Object object3;
            if ((object3 = (l6 = pr - lt.ihvw("iici", ihvt(int ), (int)92)) == 0L ? 0 : (l6 < 0L ? -1 : 1)) == false) continue;
            if (object3 == lt.ihvw("iicj", ihvy(int ), (int)72)) break;
            object3 = lt.ihvw("iick", ihvy(int ), (int)73);
        }
        while (true) {
            long l7;
            Object object4;
            if ((object4 = (l7 = pr - lt.ihvw("iicl", ihvt(int ), (int)93)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) == false) continue;
            if (object4 == lt.ihvw("iicm", ihvy(int ), (int)74)) {
                viewMatrix.set((Matrix4fc)matrix4f2);
                if (bl2) return;
                break;
            }
            object4 = lt.ihvw("iicn", ihvy(int ), (int)75);
        }
        if (bl2) {
            return;
        }
        if (n2 == 0) return;
        int n3 = Integer.MIN_VALUE;
        block21: do {
            switch (n3 == Integer.MIN_VALUE ? n2 : n3) {
                default: {
                    return;
                }
                case 1: {
                    CallSite callSite = lt.ihvw("iicp", ihvy(int ), (int)77);
                    if (bl3) {
                        throw null;
                    }
                }
                case 0: {
                    CallSite callSite = lt.ihvw("iico", ihvy(int ), (int)76);
                    n3 = 4;
                    if (!bl3) continue block21;
                    throw null;
                }
                case 2: {
                    CallSite callSite = lt.ihvw("iicq", ihvy(int ), (int)78);
                    if (bl3) {
                        throw null;
                    }
                }
                case 4: {
                    CallSite callSite = lt.ihvw("iics", ihvy(int ), (int)80);
                    n3 = 6;
                    if (!bl3) continue block21;
                    throw null;
                }
                case 5: {
                    CallSite callSite = lt.ihvw("iict", ihvy(int ), (int)81);
                    if (bl3) {
                        throw null;
                    }
                }
                case 3: {
                    CallSite callSite = lt.ihvw("iicr", ihvy(int ), (int)79);
                    if (bl3) {
                        throw null;
                    }
                }
                case 6: {
                    CallSite callSite = lt.ihvw("iicu", ihvy(int ), (int)82);
                    if (!bl3) break;
                    throw null;
                }
                case 7: 
            }
            break;
        } while (true);
        do {
            CallSite callSite = lt.ihvw("iicv", ihvy(int ), (int)83);
        } while (!bl3);
        throw null;
    }

    private static /* synthetic */ void ijjn() {
        lt.ihvu[0] = 331763124008116241L;
        lt.ihvu[1] = 155031049948651225L;
        lt.ihvu[2] = -3643007183511180629L;
        lt.ihvu[3] = 6315498457067664173L;
        lt.ihvu[4] = -8248903070405203092L;
        lt.ihvu[5] = 8074041676265203252L;
        lt.ihvu[6] = -3043846486268105090L;
        lt.ihvu[7] = -3261168901204088221L;
        lt.ihvu[8] = 7765992919340822070L;
        lt.ihvu[9] = 4750141353165318441L;
        lt.ihvu[10] = 3103909023085739498L;
        lt.ihvu[11] = -2545495134558342290L;
        lt.ihvu[12] = 642717353727834772L;
        lt.ihvu[13] = -6230714484126990959L;
        lt.ihvu[14] = -2556364599670666954L;
        lt.ihvu[15] = 585432123518728118L;
        lt.ihvu[16] = 5008047041139610658L;
        lt.ihvu[17] = 2146706882704038698L;
        lt.ihvu[18] = 3365331288461930114L;
        lt.ihvu[19] = -7777928228368517624L;
        lt.ihvu[20] = -2474650860754692308L;
        lt.ihvu[21] = -8168359993499138418L;
        lt.ihvu[22] = 6462660465050903297L;
        lt.ihvu[23] = -2318666006005130927L;
        lt.ihvu[24] = -3330616619962555037L;
        lt.ihvu[25] = -5841229484211863276L;
        lt.ihvu[26] = 5072840830685426651L;
        lt.ihvu[27] = 1070571115035151598L;
        lt.ihvu[28] = 3911639897416013028L;
        lt.ihvu[29] = -1190893807655694598L;
        lt.ihvu[30] = -553266536642810100L;
        lt.ihvu[31] = -2960511958939380146L;
        lt.ihvu[32] = -8925973195878864065L;
        lt.ihvu[33] = 5648852729945222565L;
        lt.ihvu[34] = 3586049736471057978L;
        lt.ihvu[35] = 5959991791663827929L;
        lt.ihvu[36] = -7379824020567233339L;
        lt.ihvu[37] = -399989817299918313L;
        lt.ihvu[38] = 4866218224961831225L;
        lt.ihvu[39] = 8134035128390747315L;
        lt.ihvu[40] = 3441359905514435423L;
        lt.ihvu[41] = -3219027644945420481L;
        lt.ihvu[42] = 2468679477115693955L;
        lt.ihvu[43] = -4162658504203603231L;
        lt.ihvu[44] = -1180692068554131496L;
        lt.ihvu[45] = -2225811214514245802L;
        lt.ihvu[46] = -2797450529001605250L;
        lt.ihvu[47] = -576150400581548467L;
        lt.ihvu[48] = 1119573835354364404L;
        lt.ihvu[49] = 1684227623449144209L;
        lt.ihvu[50] = -19937278936974870L;
        lt.ihvu[51] = -4362005640729034628L;
        lt.ihvu[52] = 4631698920252330700L;
        lt.ihvu[53] = 2704729778067570974L;
        lt.ihvu[54] = 1245400143678222695L;
        lt.ihvu[55] = 7727205588592931226L;
        lt.ihvu[56] = -2960583971235017326L;
        lt.ihvu[57] = -916038988249292644L;
        lt.ihvu[58] = 6940255930897730599L;
        lt.ihvu[59] = 2096398522193015165L;
        lt.ihvu[60] = 1669632949728535303L;
        lt.ihvu[61] = 4702998184536234200L;
        lt.ihvu[62] = -3684662909600818215L;
        lt.ihvu[63] = -5485619176116423553L;
        lt.ihvu[64] = -8170044432567439225L;
        lt.ihvu[65] = -4220717877753957140L;
        lt.ihvu[66] = 3387718607537068606L;
        lt.ihvu[67] = 3522264094542575117L;
        lt.ihvu[68] = -4457794396675028617L;
        lt.ihvu[69] = 7011474890253567139L;
        lt.ihvu[70] = -6962471112897020742L;
        lt.ihvu[71] = -8696262068356362638L;
        lt.ihvu[72] = 8047009059093377096L;
        lt.ihvu[73] = 3322098478855133922L;
        lt.ihvu[74] = 6825760684667682150L;
        lt.ihvu[75] = -2143061330209785837L;
        lt.ihvu[76] = -1274156687915114050L;
        lt.ihvu[77] = -4732583401517784763L;
        lt.ihvu[78] = -3491401715485204807L;
        lt.ihvu[79] = -3039441442755865392L;
        lt.ihvu[80] = 1325379815946667907L;
        lt.ihvu[81] = -1304522424204458673L;
        lt.ihvu[82] = -2549021973014637180L;
        lt.ihvu[83] = -5138331220294252522L;
        lt.ihvu[84] = 6612373017223092224L;
        lt.ihvu[85] = -1234298567515718421L;
        lt.ihvu[86] = -4292144839313841851L;
        lt.ihvu[87] = 7031854812965390490L;
        lt.ihvu[88] = -4948617222845760519L;
        lt.ihvu[89] = -4728382140866578718L;
        lt.ihvu[90] = 6182825610923317954L;
        lt.ihvu[91] = 3089294530730773045L;
        lt.ihvu[92] = -3213112901043133562L;
        lt.ihvu[93] = 8866594144057563567L;
        lt.ihvu[94] = 6620935006744134542L;
        lt.ihvu[95] = 8348447108038939115L;
        lt.ihvu[96] = -4688916085132504588L;
        lt.ihvu[97] = 4766099905032021352L;
        lt.ihvu[98] = 4373719740370695907L;
        lt.ihvu[99] = -488251336739864997L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void glow(double var0, double var2_1, double var4_2, float var6_3, int var7_4, float var8_5, float var9_6) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lt.pr - lt.ihvw("iiht", ihvt(int ), (int)152)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == lt.ihvw("iihu", ihvy(int ), (int)153)) break;
            v0 /* !! */  = (long)lt.ihvw("iihv", ihvy(int ), (int)154);
        }
        var12_7 = lt.c;
        v1 /* !! */  = lt.pr;
        if (true) ** GOTO lbl12
        block26: while (true) {
            v1 /* !! */  = (long)(v2 - lt.ihvw("iihw", ihvt(int ), (int)153));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1378321506: {
                    v2 = lt.ihvw("iihx", ihvt(int ), (int)154);
                    continue block26;
                }
                case -1115982213: {
                    v2 = lt.ihvw("iihy", ihvt(int ), (int)155);
                    continue block26;
                }
                case -1106385182: {
                    break block26;
                }
                case 693268534: {
                    v2 = lt.ihvw("iihz", ihvt(int ), (int)156);
                    continue block26;
                }
            }
            break;
        }
        var11_8 /* !! */  = lt.b;
        v3 /* !! */  = lt.pr;
        if (true) ** GOTO lbl29
        block27: while (true) {
            v3 /* !! */  = (long)(v4 - lt.ihvw("iiia", ihvt(int ), (int)157));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1106385182: {
                    break block27;
                }
                case -903208232: {
                    v4 = lt.ihvw("iiib", ihvt(int ), (int)158);
                    continue block27;
                }
                case 1489353159: {
                    v4 = lt.ihvw("iiic", ihvt(int ), (int)159);
                    continue block27;
                }
            }
            break;
        }
        var10_9 = lt.a;
        if (var12_7) {
            throw null;
lbl41:
            // 3 sources

            return;
        }
        if (var10_9) ** GOTO lbl41
        if (var11_8 /* !! */  == 0) ** GOTO lbl-1000
        switch (var11_8 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var10_9) ** GOTO lbl41
                v5 /* !! */  = lt.pr;
                if (true) ** GOTO lbl52
                block29: while (true) {
                    v5 /* !! */  = (long)(v6 - lt.ihvw("iiid", ihvt(int ), (int)160));
lbl52:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1271220838: {
                            v6 = lt.ihvw("iiie", ihvt(int ), (int)161);
                            continue block29;
                        }
                        case -1106385182: {
                            break block29;
                        }
                        case -837269219: {
                            v6 = lt.ihvw("iiif", ihvt(int ), (int)162);
                            continue block29;
                        }
                        case 1286717595: {
                            v6 = lt.ihvw("iiig", ihvt(int ), (int)163);
                            continue block29;
                        }
                    }
                    break;
                }
                lt.add(var0, var2_1, var4_2, var6_3, var7_4, var8_5 * var9_6, 0.0f);
                if (!var10_9 && !var10_9) ** break;
                ** continue;
                return;
            }
            case 0: {
                var11_8 /* !! */  = (int)lt.ihvw("iiih", ihvy(int ), (int)155);
                if (var12_7) {
                    throw null;
                }
                ** GOTO lbl83
            }
            case 1: {
                do {
                    var11_8 /* !! */  = (int)lt.ihvw("iiii", ihvy(int ), (int)156);
                } while (!var12_7);
                throw null;
            }
            case 2: {
                do {
                    var11_8 /* !! */  = (int)lt.ihvw("iiij", ihvy(int ), (int)157);
                } while (!var12_7);
                throw null;
            }
lbl83:
            // 2 sources

            case 3: {
                var11_8 /* !! */  = (int)lt.ihvw("iiik", ihvy(int ), (int)158);
                if (var12_7) {
                    throw null;
                }
            }
            case 4: {
                var11_8 /* !! */  = (int)lt.ihvw("iiil", ihvy(int ), (int)159);
                if (!var12_7) break;
                throw null;
            }
            case 5: 
        }
        do {
            var11_8 /* !! */  = (int)lt.ihvw("iiim", ihvy(int ), (int)160);
        } while (!var12_7);
        throw null;
    }

    private static /* synthetic */ void ijii() {
        lt.ihvz[400] = -1361629959;
        lt.ihvz[401] = 1597365127;
        lt.ihvz[402] = 2142323438;
        lt.ihvz[403] = 588222508;
        lt.ihvz[404] = 440859804;
        lt.ihvz[405] = 107117839;
        lt.ihvz[406] = -1216586596;
        lt.ihvz[407] = -724330489;
        lt.ihvz[408] = 1253860980;
        lt.ihvz[409] = -306922318;
        lt.ihvz[410] = 2111806784;
        lt.ihvz[411] = -1884600713;
        lt.ihvz[412] = -807489093;
        lt.ihvz[413] = 1010157565;
        lt.ihvz[414] = -1107092849;
        lt.ihvz[415] = 488201777;
        lt.ihvz[416] = -1680576275;
        lt.ihvz[417] = 997597365;
        lt.ihvz[418] = -455202454;
        lt.ihvz[419] = 82460590;
        lt.ihvz[420] = 805087666;
        lt.ihvz[421] = -2081537641;
        lt.ihvz[422] = 1829764483;
        lt.ihvz[423] = 1704189881;
        lt.ihvz[424] = 1657092674;
        lt.ihvz[425] = -555163820;
        lt.ihvz[426] = -1913700202;
        lt.ihvz[427] = -556912002;
        lt.ihvz[428] = -271193373;
        lt.ihvz[429] = 361778001;
        lt.ihvz[430] = -4127241;
        lt.ihvz[431] = 320505264;
        lt.ihvz[432] = -959245886;
        lt.ihvz[433] = -2057957758;
        lt.ihvz[434] = 341044367;
        lt.ihvz[435] = -1083676185;
        lt.ihvz[436] = 110568107;
        lt.ihvz[437] = 1685759708;
        lt.ihvz[438] = 1272968779;
        lt.ihvz[439] = -990777788;
        lt.ihvz[440] = -1597617053;
        lt.ihvz[441] = -1376227971;
        lt.ihvz[442] = 621359689;
        lt.ihvz[443] = -1374141627;
        lt.ihvz[444] = 2095086245;
        lt.ihvz[445] = 593231615;
        lt.ihvz[446] = 185025748;
        lt.ihvz[447] = 1146233760;
        lt.ihvz[448] = -127445546;
        lt.ihvz[449] = 1387957815;
        lt.ihvz[450] = -675060699;
        lt.ihvz[451] = 1931413248;
        lt.ihvz[452] = -1303169501;
        lt.ihvz[453] = -1278288314;
        lt.ihvz[454] = -1395281189;
        lt.ihvz[455] = 21429184;
        lt.ihvz[456] = 1393683014;
        lt.ihvz[457] = -1457878457;
        lt.ihvz[458] = 184800717;
        lt.ihvz[459] = 374389712;
        lt.ihvz[460] = 11509353;
        lt.ihvz[461] = -880684886;
        lt.ihvz[462] = 652706007;
        lt.ihvz[463] = 1771735183;
        lt.ihvz[464] = -2053598142;
        lt.ihvz[465] = -1612854839;
        lt.ihvz[466] = 1041054191;
        lt.ihvz[467] = -313953876;
        lt.ihvz[468] = -202873299;
        lt.ihvz[469] = 683039717;
        lt.ihvz[470] = 1407350590;
        lt.ihvz[471] = 942989243;
        lt.ihvz[472] = 1858650192;
        lt.ihvz[473] = -1707935098;
        lt.ihvz[474] = -484858041;
        lt.ihvz[475] = -1599575519;
        lt.ihvz[476] = -1877371885;
        lt.ihvz[477] = -446000412;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void putMatrix(ByteBuffer var0, Matrix4f var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lt.pr - lt.ihvw("iivd", ihvt(int ), (int)171)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == lt.ihvw("iive", ihvy(int ), (int)375)) break;
            v0 /* !! */  = (long)lt.ihvw("iivf", ihvy(int ), (int)376);
        }
        var4_2 = lt.c;
        v1 /* !! */  = lt.pr;
        if (true) ** GOTO lbl11
        block98: while (true) {
            v1 /* !! */  = (long)(v2 - lt.ihvw("iivg", ihvt(int ), (int)172));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1106385182: {
                    break block98;
                }
                case -883069526: {
                    v2 = lt.ihvw("iivh", ihvt(int ), (int)173);
                    continue block98;
                }
                case -778203878: {
                    v2 = lt.ihvw("iivi", ihvt(int ), (int)174);
                    continue block98;
                }
                case 1082576524: {
                    v2 = lt.ihvw("iivj", ihvt(int ), (int)175);
                    continue block98;
                }
            }
            break;
        }
        var3_3 /* !! */  = lt.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = lt.pr - lt.ihvw("iivk", ihvt(int ), (int)176)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == lt.ihvw("iivl", ihvy(int ), (int)377)) break;
            v3 /* !! */  = (long)lt.ihvw("iivm", ihvy(int ), (int)378);
        }
        var2_4 = lt.a;
        if (var4_2) {
            throw null;
lbl32:
            // 6 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl32
        v4 /* !! */  = lt.pr;
        if (true) ** GOTO lbl39
        block101: while (true) {
            v4 /* !! */  = (long)(v5 - lt.ihvw("iivn", ihvt(int ), (int)177));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1417555046: {
                    v5 = lt.ihvw("iivo", ihvt(int ), (int)178);
                    continue block101;
                }
                case -1106385182: {
                    break block101;
                }
                case -915684799: {
                    v5 = lt.ihvw("iivp", ihvt(int ), (int)179);
                    continue block101;
                }
                case -830237010: {
                    v5 = lt.ihvw("iivq", ihvt(int ), (int)180);
                    continue block101;
                }
            }
            break;
        }
        v6 = var1_1.m00();
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = lt.pr - lt.ihvw("iivr", ihvt(int ), (int)181)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == lt.ihvw("iivs", ihvy(int ), (int)379)) break;
            v7 /* !! */  = (long)lt.ihvw("iivt", ihvy(int ), (int)380);
        }
        v8 = var0.putFloat(v6);
        v9 /* !! */  = lt.pr;
        if (true) ** GOTO lbl62
        block103: while (true) {
            v9 /* !! */  = (long)(v10 - lt.ihvw("iivu", ihvt(int ), (int)182));
lbl62:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -1793817141: {
                    v10 = lt.ihvw("iivv", ihvt(int ), (int)183);
                    continue block103;
                }
                case -1106385182: {
                    break block103;
                }
                case -605736677: {
                    v10 = lt.ihvw("iivw", ihvt(int ), (int)184);
                    continue block103;
                }
                case 1215868683: {
                    v10 = lt.ihvw("iivx", ihvt(int ), (int)185);
                    continue block103;
                }
            }
            break;
        }
        v11 = var1_1.m01();
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_3 = lt.pr - lt.ihvw("iivy", ihvt(int ), (int)186)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == lt.ihvw("iivz", ihvy(int ), (int)381)) break;
            v12 /* !! */  = (long)lt.ihvw("iiwa", ihvy(int ), (int)382);
        }
        v13 = v8.putFloat(v11);
        v14 /* !! */  = lt.pr;
        if (true) ** GOTO lbl85
        block105: while (true) {
            v14 /* !! */  = (long)(lt.ihvw("iiwc", ihvt(int ), (int)188) - lt.ihvw("iiwb", ihvt(int ), (int)187));
lbl85:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1106385182: {
                    break block105;
                }
                case 1482632062: {
                    continue block105;
                }
            }
            break;
        }
        v15 = var1_1.m02();
        v16 /* !! */  = lt.pr;
        if (true) ** GOTO lbl95
        block106: while (true) {
            v16 /* !! */  = (long)(v17 - lt.ihvw("iiwd", ihvt(int ), (int)189));
lbl95:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case -2123986522: {
                    v17 = lt.ihvw("iiwe", ihvt(int ), (int)190);
                    continue block106;
                }
                case -1298449374: {
                    v17 = lt.ihvw("iiwf", ihvt(int ), (int)191);
                    continue block106;
                }
                case -1154974661: {
                    v17 = lt.ihvw("iiwg", ihvt(int ), (int)192);
                    continue block106;
                }
                case -1106385182: {
                    break block106;
                }
            }
            break;
        }
        v18 = v13.putFloat(v15);
        v19 /* !! */  = lt.pr;
        if (true) ** GOTO lbl112
        block107: while (true) {
            v19 /* !! */  = (long)(v20 - lt.ihvw("iiwh", ihvt(int ), (int)193));
lbl112:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case -1447915774: {
                    v20 = lt.ihvw("iiwi", ihvt(int ), (int)194);
                    continue block107;
                }
                case -1106385182: {
                    break block107;
                }
                case -744333848: {
                    v20 = lt.ihvw("iiwj", ihvt(int ), (int)195);
                    continue block107;
                }
                case -561146903: {
                    v20 = lt.ihvw("iiwk", ihvt(int ), (int)196);
                    continue block107;
                }
            }
            break;
        }
        v21 = var1_1.m03();
        while (true) {
            if ((v22 /* !! */  = (cfr_temp_4 = lt.pr - lt.ihvw("iiwl", ihvt(int ), (int)197)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v22 /* !! */  == lt.ihvw("iiwm", ihvy(int ), (int)383)) break;
            v22 /* !! */  = (long)lt.ihvw("iiwn", ihvy(int ), (int)384);
        }
        v18.putFloat(v21);
        if (var2_4 || var2_4) ** GOTO lbl32
        v23 /* !! */  = lt.pr;
        if (true) ** GOTO lbl136
        block109: while (true) {
            v23 /* !! */  = (long)(lt.ihvw("iiwp", ihvt(int ), (int)199) - lt.ihvw("iiwo", ihvt(int ), (int)198));
lbl136:
            // 2 sources

            switch ((int)v23 /* !! */ ) {
                case -1240994488: {
                    continue block109;
                }
                case -1106385182: {
                    break block109;
                }
            }
            break;
        }
        v24 = var1_1.m10();
        while (true) {
            if ((v25 /* !! */  = (cfr_temp_5 = lt.pr - lt.ihvw("iiwq", ihvt(int ), (int)200)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v25 /* !! */  == lt.ihvw("iiwr", ihvy(int ), (int)385)) break;
            v25 /* !! */  = (long)lt.ihvw("iiws", ihvy(int ), (int)386);
        }
        v26 = var0.putFloat(v24);
        while (true) {
            if ((v27 /* !! */  = (cfr_temp_6 = lt.pr - lt.ihvw("iiwt", ihvt(int ), (int)201)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v27 /* !! */  == lt.ihvw("iiwu", ihvy(int ), (int)387)) break;
            v27 /* !! */  = (long)lt.ihvw("iiwv", ihvy(int ), (int)388);
        }
        v28 = var1_1.m11();
        while (true) {
            if ((v29 /* !! */  = (cfr_temp_7 = lt.pr - lt.ihvw("iiww", ihvt(int ), (int)202)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v29 /* !! */  == lt.ihvw("iiwx", ihvy(int ), (int)389)) break;
            v29 /* !! */  = (long)lt.ihvw("iiwy", ihvy(int ), (int)390);
        }
        v30 = v26.putFloat(v28);
        v31 /* !! */  = lt.pr;
        if (true) ** GOTO lbl164
        block113: while (true) {
            v31 /* !! */  = (long)(v32 - lt.ihvw("iiwz", ihvt(int ), (int)203));
lbl164:
            // 2 sources

            switch ((int)v31 /* !! */ ) {
                case -1106385182: {
                    break block113;
                }
                case -378601889: {
                    v32 = lt.ihvw("iixa", ihvt(int ), (int)204);
                    continue block113;
                }
                case 410718776: {
                    v32 = lt.ihvw("iixb", ihvt(int ), (int)205);
                    continue block113;
                }
                case 1768714386: {
                    v32 = lt.ihvw("iixc", ihvt(int ), (int)206);
                    continue block113;
                }
            }
            break;
        }
        v33 = var1_1.m12();
        v34 /* !! */  = lt.pr;
        if (true) ** GOTO lbl181
        block114: while (true) {
            v34 /* !! */  = (long)(lt.ihvw("iixe", ihvt(int ), (int)208) - lt.ihvw("iixd", ihvt(int ), (int)207));
lbl181:
            // 2 sources

            switch ((int)v34 /* !! */ ) {
                case -1829612096: {
                    continue block114;
                }
                case -1106385182: {
                    break block114;
                }
            }
            break;
        }
        v35 = v30.putFloat(v33);
        v36 /* !! */  = lt.pr;
        if (true) ** GOTO lbl191
        block115: while (true) {
            v36 /* !! */  = (long)(v37 - lt.ihvw("iixf", ihvt(int ), (int)209));
lbl191:
            // 2 sources

            switch ((int)v36 /* !! */ ) {
                case -1343585667: {
                    v37 = lt.ihvw("iixg", ihvt(int ), (int)210);
                    continue block115;
                }
                case -1106385182: {
                    break block115;
                }
                case 52319039: {
                    v37 = lt.ihvw("iixh", ihvt(int ), (int)211);
                    continue block115;
                }
                case 402300080: {
                    v37 = lt.ihvw("iixi", ihvt(int ), (int)212);
                    continue block115;
                }
            }
            break;
        }
        v38 = var1_1.m13();
        while (true) {
            if ((v39 /* !! */  = (cfr_temp_8 = lt.pr - lt.ihvw("iixj", ihvt(int ), (int)213)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v39 /* !! */  == lt.ihvw("iixk", ihvy(int ), (int)391)) break;
            v39 /* !! */  = (long)lt.ihvw("iixl", ihvy(int ), (int)392);
        }
        v35.putFloat(v38);
        if (var2_4 || var2_4) ** GOTO lbl32
        while (true) {
            if ((v40 /* !! */  = (cfr_temp_9 = lt.pr - lt.ihvw("iixm", ihvt(int ), (int)214)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v40 /* !! */  == lt.ihvw("iixn", ihvy(int ), (int)393)) break;
            v40 /* !! */  = (long)lt.ihvw("iixo", ihvy(int ), (int)394);
        }
        v41 = var1_1.m20();
        while (true) {
            if ((v42 /* !! */  = (cfr_temp_10 = lt.pr - lt.ihvw("iixp", ihvt(int ), (int)215)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
            if (v42 /* !! */  == lt.ihvw("iixq", ihvy(int ), (int)395)) break;
            v42 /* !! */  = (long)lt.ihvw("iixr", ihvy(int ), (int)396);
        }
        v43 = var0.putFloat(v41);
        while (true) {
            if ((v44 /* !! */  = (cfr_temp_11 = lt.pr - lt.ihvw("iixs", ihvt(int ), (int)216)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
            if (v44 /* !! */  == lt.ihvw("iixt", ihvy(int ), (int)397)) break;
            v44 /* !! */  = (long)lt.ihvw("iixu", ihvy(int ), (int)398);
        }
        v45 = var1_1.m21();
        while (true) {
            if ((v46 /* !! */  = (cfr_temp_12 = lt.pr - lt.ihvw("iixv", ihvt(int ), (int)217)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
            if (v46 /* !! */  == lt.ihvw("iixw", ihvy(int ), (int)399)) break;
            v46 /* !! */  = (long)lt.ihvw("iixx", ihvy(int ), (int)400);
        }
        v47 = v43.putFloat(v45);
        v48 /* !! */  = lt.pr;
        if (true) ** GOTO lbl239
        block121: while (true) {
            v48 /* !! */  = (long)(v49 - lt.ihvw("iixy", ihvt(int ), (int)218));
lbl239:
            // 2 sources

            switch ((int)v48 /* !! */ ) {
                case -1106385182: {
                    break block121;
                }
                case -692842401: {
                    v49 = lt.ihvw("iixz", ihvt(int ), (int)219);
                    continue block121;
                }
                case 313930849: {
                    v49 = lt.ihvw("iiya", ihvt(int ), (int)220);
                    continue block121;
                }
                case 1827608233: {
                    v49 = lt.ihvw("iiyb", ihvt(int ), (int)221);
                    continue block121;
                }
            }
            break;
        }
        v50 = var1_1.m22();
        while (true) {
            if ((v51 /* !! */  = (cfr_temp_13 = lt.pr - lt.ihvw("iiyc", ihvt(int ), (int)222)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
            if (v51 /* !! */  == lt.ihvw("iiyd", ihvy(int ), (int)401)) break;
            v51 /* !! */  = (long)lt.ihvw("iiye", ihvy(int ), (int)402);
        }
        v52 = v47.putFloat(v50);
        while (true) {
            if ((v53 /* !! */  = (cfr_temp_14 = lt.pr - lt.ihvw("iiyf", ihvt(int ), (int)223)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
            if (v53 /* !! */  == lt.ihvw("iiyg", ihvy(int ), (int)403)) break;
            v53 /* !! */  = (long)lt.ihvw("iiyh", ihvy(int ), (int)404);
        }
        v54 = var1_1.m23();
        v55 /* !! */  = lt.pr;
        if (true) ** GOTO lbl268
        block124: while (true) {
            v55 /* !! */  = (long)(v56 - lt.ihvw("iiyi", ihvt(int ), (int)224));
lbl268:
            // 2 sources

            switch ((int)v55 /* !! */ ) {
                case -1432760919: {
                    v56 = lt.ihvw("iiyj", ihvt(int ), (int)225);
                    continue block124;
                }
                case -1106385182: {
                    break block124;
                }
                case -680472445: {
                    v56 = lt.ihvw("iiyk", ihvt(int ), (int)226);
                    continue block124;
                }
                case 1452897732: {
                    v56 = lt.ihvw("iiyl", ihvt(int ), (int)227);
                    continue block124;
                }
            }
            break;
        }
        v52.putFloat(v54);
        if (var2_4 || var2_4) ** GOTO lbl32
        while (true) {
            if ((v57 /* !! */  = (cfr_temp_15 = lt.pr - lt.ihvw("iiym", ihvt(int ), (int)228)) == 0L ? 0 : (cfr_temp_15 < 0L ? -1 : 1)) == false) continue;
            if (v57 /* !! */  == lt.ihvw("iiyn", ihvy(int ), (int)405)) break;
            v57 /* !! */  = (long)lt.ihvw("iiyo", ihvy(int ), (int)406);
        }
        v58 = var1_1.m30();
        while (true) {
            if ((v59 /* !! */  = (cfr_temp_16 = lt.pr - lt.ihvw("iiyp", ihvt(int ), (int)229)) == 0L ? 0 : (cfr_temp_16 < 0L ? -1 : 1)) == false) continue;
            if (v59 /* !! */  == lt.ihvw("iiyq", ihvy(int ), (int)407)) break;
            v59 /* !! */  = (long)lt.ihvw("iiyr", ihvy(int ), (int)408);
        }
        v60 = var0.putFloat(v58);
        while (true) {
            if ((v61 /* !! */  = (cfr_temp_17 = lt.pr - lt.ihvw("iiys", ihvt(int ), (int)230)) == 0L ? 0 : (cfr_temp_17 < 0L ? -1 : 1)) == false) continue;
            if (v61 /* !! */  == lt.ihvw("iiyt", ihvy(int ), (int)409)) break;
            v61 /* !! */  = (long)lt.ihvw("iiyu", ihvy(int ), (int)410);
        }
        v62 = var1_1.m31();
        v63 /* !! */  = lt.pr;
        if (true) ** GOTO lbl305
        block128: while (true) {
            v63 /* !! */  = (long)(v64 - lt.ihvw("iiyv", ihvt(int ), (int)231));
lbl305:
            // 2 sources

            switch ((int)v63 /* !! */ ) {
                case -1106385182: {
                    break block128;
                }
                case -812629919: {
                    v64 = lt.ihvw("iiyw", ihvt(int ), (int)232);
                    continue block128;
                }
                case -218623613: {
                    v64 = lt.ihvw("iiyx", ihvt(int ), (int)233);
                    continue block128;
                }
                case 612624428: {
                    v64 = lt.ihvw("iiyy", ihvt(int ), (int)234);
                    continue block128;
                }
            }
            break;
        }
        v65 = v60.putFloat(v62);
        while (true) {
            if ((v66 /* !! */  = (cfr_temp_18 = lt.pr - lt.ihvw("iiyz", ihvt(int ), (int)235)) == 0L ? 0 : (cfr_temp_18 < 0L ? -1 : 1)) == false) continue;
            if (v66 /* !! */  == lt.ihvw("iiza", ihvy(int ), (int)411)) break;
            v66 /* !! */  = (long)lt.ihvw("iizb", ihvy(int ), (int)412);
        }
        v67 = var1_1.m32();
        v68 /* !! */  = lt.pr;
        if (true) ** GOTO lbl328
        block130: while (true) {
            v68 /* !! */  = (long)(v69 - lt.ihvw("iizc", ihvt(int ), (int)236));
lbl328:
            // 2 sources

            switch ((int)v68 /* !! */ ) {
                case -1106385182: {
                    break block130;
                }
                case 218773394: {
                    v69 = lt.ihvw("iizd", ihvt(int ), (int)237);
                    continue block130;
                }
                case 1718432035: {
                    v69 = lt.ihvw("iize", ihvt(int ), (int)238);
                    continue block130;
                }
                case 1804374451: {
                    v69 = lt.ihvw("iizf", ihvt(int ), (int)239);
                    continue block130;
                }
            }
            break;
        }
        v70 = v65.putFloat(v67);
        v71 /* !! */  = lt.pr;
        if (true) ** GOTO lbl345
        block131: while (true) {
            v71 /* !! */  = (long)(v72 - lt.ihvw("iizg", ihvt(int ), (int)240));
lbl345:
            // 2 sources

            switch ((int)v71 /* !! */ ) {
                case -1106385182: {
                    break block131;
                }
                case 343617380: {
                    v72 = lt.ihvw("iizh", ihvt(int ), (int)241);
                    continue block131;
                }
                case 1780881053: {
                    v72 = lt.ihvw("iizi", ihvt(int ), (int)242);
                    continue block131;
                }
            }
            break;
        }
        v73 = var1_1.m33();
        while (true) {
            if ((v74 /* !! */  = (cfr_temp_19 = lt.pr - lt.ihvw("iizj", ihvt(int ), (int)243)) == 0L ? 0 : (cfr_temp_19 < 0L ? -1 : 1)) == false) continue;
            if (v74 /* !! */  == lt.ihvw("iizk", ihvy(int ), (int)413)) break;
            v74 /* !! */  = (long)lt.ihvw("iizl", ihvy(int ), (int)414);
        }
        v70.putFloat(v73);
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
lbl368:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)lt.ihvw("iizm", ihvy(int ), (int)415);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl405
            }
lbl373:
            // 3 sources

            case 1: {
                var3_3 /* !! */  = (int)lt.ihvw("iizn", ihvy(int ), (int)416);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl388
            }
            case 2: {
                var3_3 /* !! */  = (int)lt.ihvw("iizo", ihvy(int ), (int)417);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl392
            }
lbl383:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)lt.ihvw("iizp", ihvy(int ), (int)418);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl409
            }
lbl388:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)lt.ihvw("iizq", ihvy(int ), (int)419);
                if (!var4_2) ** GOTO lbl373
                throw null;
            }
lbl392:
            // 3 sources

            case 5: {
                var3_3 /* !! */  = (int)lt.ihvw("iizr", ihvy(int ), (int)420);
                if (!var4_2) ** GOTO lbl383
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)lt.ihvw("iizu", ihvy(int ), (int)421);
                if (!var4_2) break;
                throw null;
            }
            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)lt.ihvw("iizy", ihvy(int ), (int)422);
                    if (!var4_2) ** GOTO lbl373
                    throw null;
                }
            }
lbl405:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)lt.ihvw("iizz", ihvy(int ), (int)423);
                if (!var4_2) ** GOTO lbl392
                throw null;
            }
lbl409:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)lt.ihvw("ijad", ihvy(int ), (int)424);
                if (!var4_2) ** GOTO lbl368
                throw null;
            }
            case 10: {
                do {
                    var3_3 /* !! */  = (int)lt.ihvw("ijah", ihvy(int ), (int)425);
                } while (!var4_2);
                throw null;
            }
            case 11: 
        }
        var3_3 /* !! */  = (int)lt.ihvw("ijaj", ihvy(int ), (int)426);
        ** while (!var4_2)
lbl421:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void end() {
        block273: {
            block272: {
                block271: {
                    var30 = lt.c;
                    var29_1 /* !! */  = lt.b;
                    var28_2 = lt.a;
                    if (var30) {
                        throw null;
lbl6:
                        // 74 sources

                        return;
                    }
                    if (var28_2 || var28_2) ** GOTO lbl6
                    if (lt.pipeline == null) break block271;
                    if (var28_2) ** GOTO lbl6
                    if (lt.uniformBuffer == null) break block271;
                    if (var28_2) ** GOTO lbl6
                    if (lt.vertexBuffer != null) break block272;
                    if (var28_2) ** GOTO lbl6
                }
                if (var28_2 || var28_2) ** GOTO lbl6
                return;
            }
            if (var28_2 || var28_2) ** GOTO lbl6
            if (lt.glowCount != 0) break block273;
            if (var28_2 || var28_2) ** GOTO lbl6
            return;
        }
        if (var28_2 || var28_2) ** GOTO lbl6
        var0_3 = lt.combinedMatrix.set((Matrix4fc)lt.projectionMatrix).mul((Matrix4fc)lt.viewMatrix);
        if (var28_2 || var28_2) ** GOTO lbl6
        var1_4 = lt.inverseViewMatrix.set((Matrix4fc)lt.viewMatrix).invert();
        if (var28_2 || var28_2) ** GOTO lbl6
        var2_5 = var1_4.m00();
        if (var28_2 || var28_2) ** GOTO lbl6
        var3_6 = var1_4.m01();
        if (var28_2 || var28_2) ** GOTO lbl6
        var4_7 = var1_4.m02();
        if (var28_2 || var28_2) ** GOTO lbl6
        var5_8 = var1_4.m10();
        if (var28_2 || var28_2) ** GOTO lbl6
        var6_9 = var1_4.m11();
        if (var28_2 || var28_2) ** GOTO lbl6
        var7_10 = var1_4.m12();
        if (var28_2 || var28_2) ** GOTO lbl6
        var8_11 = om.acquire((int)lt.ihvw("iile", ihvy(int ), (int)222), (int)lt.ihvw("iilf", ihvy(int ), (int)223));
        if (var28_2 || var28_2) ** GOTO lbl6
        lt.putMatrix(var8_11, var0_3);
        if (var28_2 || var28_2) ** GOTO lbl6
        var8_11.flip();
        if (var28_2 || var28_2) ** GOTO lbl6
        var9_12 = om.acquire((int)lt.ihvw("iilg", ihvy(int ), (int)224), lt.glowCount * lt.ihvw("iilh", ihvy(int ), (int)225) * lt.ihvw("iili", ihvy(int ), (int)226));
        if (var28_2 || var28_2) ** GOTO lbl6
        var10_13 = lt.ihvw("iilj", ihvy(int ), (int)227);
        if (var28_2) ** GOTO lbl6
        block141: while (true) {
            block275: {
                block274: {
                    if (var28_2 || var28_2) ** GOTO lbl6
                    if (var10_13 >= lt.glowCount) ** GOTO lbl125
                    if (var28_2 || var28_2) ** GOTO lbl6
                    var11_15 = var10_13 * lt.ihvw("iilk", ihvy(int ), (int)228);
                    if (var28_2 || var28_2) ** GOTO lbl6
                    var12_17 = lt.glowData[var11_15];
                    if (var28_2 || var28_2) ** GOTO lbl6
                    var13_19 = lt.glowData[var11_15 + true];
                    if (var28_2 || var28_2) ** GOTO lbl6
                    var14_21 = lt.glowData[var11_15 + 2];
                    if (var28_2 || var28_2) ** GOTO lbl6
                    var15_23 = lt.glowData[var11_15 + 3];
                    if (var28_2 || var28_2) ** GOTO lbl6
                    var16_24 = lt.glowData[var11_15 + 4];
                    if (var28_2 || var28_2) ** GOTO lbl6
                    var17_25 = lt.glowData[var11_15 + 5];
                    if (var28_2 || var28_2) ** GOTO lbl6
                    var18_26 = lt.glowData[var11_15 + 6];
                    if (var28_2 || var28_2) ** GOTO lbl6
                    var19_27 = lt.glowData[var11_15 + 7];
                    if (var28_2 || var28_2) ** GOTO lbl6
                    var20_28 = lt.glowData[var11_15 + 8];
                    if (var28_2 || var28_2) ** GOTO lbl6
                    if (!(var20_28 > lt.ihvw("iilq", iiix(int ), (int)229))) break block274;
                    if (var28_2) ** GOTO lbl6
                    v0 = Math.min(1.0f, var19_27 * lt.ihvw("iils", iiix(int ), (int)230));
                    if (var30) {
                        throw null;
                    }
                    break block275;
                }
                if (var28_2 || var28_2) ** GOTO lbl6
                v0 = var21_29 = var19_27;
            }
            if (var28_2 || var28_2) ** GOTO lbl6
            var22_30 = lt.ihvw("iily", ihvy(int ), (int)231);
            if (var28_2) ** GOTO lbl6
            block142: while (true) {
                if (var28_2 || var28_2) ** GOTO lbl6
                if (var22_30 >= lt.ihvw("iimc", ihvy(int ), (int)232)) ** GOTO lbl120
                if (var28_2 || var28_2) ** GOTO lbl6
                var23_31 = lt.QUAD_U[var22_30];
                if (var28_2 || var28_2) ** GOTO lbl6
                var24_32 = lt.QUAD_V[var22_30];
                if (var28_2 || var28_2) ** GOTO lbl6
                var25_33 = var12_17 + (var2_5 * var23_31 + var5_8 * var24_32) * var15_23;
                if (var28_2 || var28_2) ** GOTO lbl6
                var26_34 = var13_19 + (var3_6 * var23_31 + var6_9 * var24_32) * var15_23;
                if (var28_2 || var28_2) ** GOTO lbl6
                var27_35 = var14_21 + (var4_7 * var23_31 + var7_10 * var24_32) * var15_23;
                if (var28_2 || var28_2) ** GOTO lbl6
                var9_12.putFloat(var25_33).putFloat(var26_34).putFloat(var27_35);
                if (var28_2 || var28_2) ** GOTO lbl6
                var9_12.put((byte)(var16_24 * lt.ihvw("iinn", iiix(int ), (int)233))).put((byte)(var17_25 * lt.ihvw("iins", iiix(int ), (int)234))).put((byte)(var18_26 * lt.ihvw("iiny", iiix(int ), (int)235))).put((byte)(var21_29 * lt.ihvw("iiod", iiix(int ), (int)236)));
                if (var28_2 || var28_2) ** GOTO lbl6
                var9_12.putFloat(var23_31).putFloat(var24_32);
                if (var28_2) ** GOTO lbl6
                if (var29_1 /* !! */  == 0) ** GOTO lbl-1000
                switch (var29_1 /* !! */ ) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var28_2) ** GOTO lbl6
                        ++var22_30;
                        if (var28_2) ** GOTO lbl6
                        if (!var30) continue block142;
                        throw null;
                    }
lbl120:
                    // 1 sources

                    if (var28_2 || var28_2) ** GOTO lbl6
                    ++var10_13;
                    if (var28_2) ** GOTO lbl6
                    if (!var30) continue block141;
                    throw null;
lbl125:
                    // 1 sources

                    if (var28_2 || var28_2) ** GOTO lbl6
                    var9_12.flip();
                    if (var28_2 || var28_2) ** GOTO lbl6
                    var10_14 = RenderSystem.getDevice().createCommandEncoder();
                    if (var28_2 || var28_2) ** GOTO lbl6
                    var10_14.writeToBuffer(lt.uniformBuffer.slice(), var8_11);
                    if (var28_2 || var28_2) ** GOTO lbl6
                    var10_14.writeToBuffer(lt.vertexBuffer.slice(), var9_12);
                    if (var28_2 || var28_2) ** GOTO lbl6
                    var11_16 = lt.mc.method_1522();
                    if (var28_2 || var28_2) ** GOTO lbl6
                    v1 = (Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$end$2(), ()Ljava/lang/String;)();
                    v2 = var11_16.method_71639();
                    v3 = OptionalInt.empty();
                    v4 = var11_16.method_71640();
                    if (lt.ignoreDepth) {
                        v5 = OptionalDouble.of(1.0);
                        if (var30) {
                            throw null;
                        }
                    } else {
                        v5 = OptionalDouble.empty();
                    }
                    var12_18 = var10_14.createRenderPass(v1, v2, v3, v4, v5);
                    if (var28_2) ** GOTO lbl6
                    try {
                        if (var28_2) ** GOTO lbl6
                        var12_18.setPipeline(lt.pipeline);
                        if (var28_2 || var28_2) ** GOTO lbl6
                        var12_18.setUniform("Uniforms", lt.uniformBuffer);
                        if (var28_2 || var28_2) ** GOTO lbl6
                        var12_18.setVertexBuffer((int)lt.ihvw("iipt", ihvy(int ), (int)237), lt.vertexBuffer);
                        if (var28_2 || var28_2) ** GOTO lbl6
                        var12_18.draw((int)lt.ihvw("iipw", ihvy(int ), (int)238), lt.glowCount * lt.ihvw("iipx", ihvy(int ), (int)239));
                        if (var28_2 || var28_2) ** GOTO lbl6
                        if (var12_18 == null) ** GOTO lbl183
                        if (var28_2) ** GOTO lbl6
                    }
                    catch (Throwable var13_20) {
                        if (var28_2) ** GOTO lbl6
                        if (var12_18 == null) ** GOTO lbl176
                        if (var28_2) ** GOTO lbl6
                        try {
                            if (var28_2) ** GOTO lbl6
                            var12_18.close();
                            if (var28_2 || var28_2) ** GOTO lbl6
                            ** if (!var30) goto lbl-1000
                        }
                        catch (Throwable var14_22) {
                            if (var28_2) ** GOTO lbl6
                            var13_20.addSuppressed(var14_22);
                            if (var28_2) ** GOTO lbl6
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
lbl176:
                        // 3 sources

                        if (var28_2 || var28_2) ** GOTO lbl6
                        throw var13_20;
                    }
                    var12_18.close();
                    if (var28_2) ** GOTO lbl6
                    if (var30) {
                        throw null;
                    }
lbl183:
                    // 3 sources

                    if (var28_2 || var28_2) ** GOTO lbl6
                    lt.glowCount = (int)lt.ihvw("iipy", ihvy(int ), (int)240);
                    if (!var28_2 && !var28_2) ** break;
                    ** continue;
                    return;
                    case 0: {
                        var29_1 /* !! */  = (int)lt.ihvw("iipz", ihvy(int ), (int)241);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl258
                    }
lbl193:
                    // 2 sources

                    case 1: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiqa", ihvy(int ), (int)242);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl591
                    }
                    case 2: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiqb", ihvy(int ), (int)243);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl535
                    }
                    case 3: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiqc", ihvy(int ), (int)244);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl553
                    }
                    case 4: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiqd", ihvy(int ), (int)245);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl772
                    }
lbl213:
                    // 2 sources

                    case 5: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiqe", ihvy(int ), (int)246);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl784
                    }
lbl218:
                    // 3 sources

                    case 6: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiqf", ihvy(int ), (int)247);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl398
                    }
                    case 7: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiqg", ihvy(int ), (int)248);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl591
                    }
lbl228:
                    // 3 sources

                    case 8: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiqh", ihvy(int ), (int)249);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl509
                    }
                    case 9: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiqi", ihvy(int ), (int)250);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl509
                    }
lbl238:
                    // 2 sources

                    case 10: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiqj", ihvy(int ), (int)251);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl710
                    }
                    case 11: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiqk", ihvy(int ), (int)252);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl365
                    }
lbl248:
                    // 3 sources

                    case 12: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiql", ihvy(int ), (int)253);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl471
                    }
lbl253:
                    // 2 sources

                    case 13: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiqm", ihvy(int ), (int)254);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl327
                    }
lbl258:
                    // 3 sources

                    case 14: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiqn", ihvy(int ), (int)255);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl702
                    }
lbl263:
                    // 2 sources

                    case 15: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiqo", ihvy(int ), (int)256);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl569
                    }
lbl268:
                    // 3 sources

                    case 16: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiqp", ihvy(int ), (int)257);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl756
                    }
lbl273:
                    // 3 sources

                    case 17: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiqq", ihvy(int ), (int)258);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl748
                    }
lbl278:
                    // 3 sources

                    case 18: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiqr", ihvy(int ), (int)259);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl491
                    }
lbl283:
                    // 2 sources

                    case 19: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiqs", ihvy(int ), (int)260);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl411
                    }
                    case 20: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiqt", ihvy(int ), (int)261);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl303
                    }
lbl293:
                    // 4 sources

                    case 21: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiqu", ihvy(int ), (int)262);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl760
                    }
lbl298:
                    // 2 sources

                    case 22: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiqv", ihvy(int ), (int)263);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl553
                    }
lbl303:
                    // 3 sources

                    case 23: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiqw", ihvy(int ), (int)264);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl356
                    }
                    case 24: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiqx", ihvy(int ), (int)265);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl760
                    }
lbl313:
                    // 2 sources

                    case 25: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiqy", ihvy(int ), (int)266);
                        if (!var30) ** GOTO lbl283
                        throw null;
                    }
lbl317:
                    // 2 sources

                    case 26: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiqz", ihvy(int ), (int)267);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl514
                    }
lbl322:
                    // 2 sources

                    case 27: {
                        var29_1 /* !! */  = (int)lt.ihvw("iira", ihvy(int ), (int)268);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl698
                    }
lbl327:
                    // 2 sources

                    case 28: {
                        var29_1 /* !! */  = (int)lt.ihvw("iirb", ihvy(int ), (int)269);
                        if (!var30) ** GOTO lbl293
                        throw null;
                    }
lbl331:
                    // 3 sources

                    case 29: {
                        var29_1 /* !! */  = (int)lt.ihvw("iirc", ihvy(int ), (int)270);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl629
                    }
lbl336:
                    // 2 sources

                    case 30: {
                        var29_1 /* !! */  = (int)lt.ihvw("iird", ihvy(int ), (int)271);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl612
                    }
lbl341:
                    // 2 sources

                    case 31: {
                        var29_1 /* !! */  = (int)lt.ihvw("iire", ihvy(int ), (int)272);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl677
                    }
lbl346:
                    // 2 sources

                    case 32: {
                        var29_1 /* !! */  = (int)lt.ihvw("iirf", ihvy(int ), (int)273);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl519
                    }
                    case 33: {
                        var29_1 /* !! */  = (int)lt.ihvw("iirg", ihvy(int ), (int)274);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl748
                    }
lbl356:
                    // 3 sources

                    case 34: {
                        var29_1 /* !! */  = (int)lt.ihvw("iirh", ihvy(int ), (int)275);
                        if (!var30) ** GOTO lbl253
                        throw null;
                    }
                    case 35: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiri", ihvy(int ), (int)276);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl735
                    }
lbl365:
                    // 3 sources

                    case 36: {
                        var29_1 /* !! */  = (int)lt.ihvw("iirj", ihvy(int ), (int)277);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl739
                    }
                    case 37: {
                        var29_1 /* !! */  = (int)lt.ihvw("iirk", ihvy(int ), (int)278);
                        if (!var30) ** GOTO lbl278
                        throw null;
                    }
                    case 38: {
                        var29_1 /* !! */  = (int)lt.ihvw("iirl", ihvy(int ), (int)279);
                        if (!var30) ** GOTO lbl293
                        throw null;
                    }
lbl378:
                    // 2 sources

                    case 39: {
                        var29_1 /* !! */  = (int)lt.ihvw("iirm", ihvy(int ), (int)280);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl411
                    }
lbl383:
                    // 2 sources

                    case 40: {
                        var29_1 /* !! */  = (int)lt.ihvw("iirn", ihvy(int ), (int)281);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl393
                    }
                    case 41: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiro", ihvy(int ), (int)282);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl780
                    }
lbl393:
                    // 2 sources

                    case 42: {
                        var29_1 /* !! */  = (int)lt.ihvw("iirp", ihvy(int ), (int)283);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl710
                    }
lbl398:
                    // 3 sources

                    case 43: {
                        var29_1 /* !! */  = (int)lt.ihvw("iirq", ihvy(int ), (int)284);
                        if (!var30) ** GOTO lbl378
                        throw null;
                    }
lbl402:
                    // 2 sources

                    case 44: {
                        var29_1 /* !! */  = (int)lt.ihvw("iirr", ihvy(int ), (int)285);
                        if (!var30) ** GOTO lbl248
                        throw null;
                    }
lbl406:
                    // 2 sources

                    case 45: {
                        var29_1 /* !! */  = (int)lt.ihvw("iirs", ihvy(int ), (int)286);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl784
                    }
lbl411:
                    // 3 sources

                    case 46: {
                        var29_1 /* !! */  = (int)lt.ihvw("iirt", ihvy(int ), (int)287);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl748
                    }
lbl416:
                    // 2 sources

                    case 47: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiru", ihvy(int ), (int)288);
                        if (!var30) ** GOTO lbl398
                        throw null;
                    }
                    case 48: {
                        var29_1 /* !! */  = (int)lt.ihvw("iirv", ihvy(int ), (int)289);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl523
                    }
lbl425:
                    // 2 sources

                    case 49: {
                        var29_1 /* !! */  = (int)lt.ihvw("iirw", ihvy(int ), (int)290);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl655
                    }
lbl430:
                    // 2 sources

                    case 50: {
                        var29_1 /* !! */  = (int)lt.ihvw("iirx", ihvy(int ), (int)291);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl620
                    }
                    case 51: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiry", ihvy(int ), (int)292);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl780
                    }
                    case 52: {
                        var29_1 /* !! */  = (int)lt.ihvw("iirz", ihvy(int ), (int)293);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl629
                    }
lbl445:
                    // 2 sources

                    case 53: {
                        var29_1 /* !! */  = (int)lt.ihvw("iisa", ihvy(int ), (int)294);
                        if (!var30) ** GOTO lbl322
                        throw null;
                    }
                    case 54: {
                        var29_1 /* !! */  = (int)lt.ihvw("iisb", ihvy(int ), (int)295);
                        if (!var30) ** GOTO lbl383
                        throw null;
                    }
                    case 55: {
                        var29_1 /* !! */  = (int)lt.ihvw("iisc", ihvy(int ), (int)296);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl694
                    }
lbl458:
                    // 3 sources

                    case 56: {
                        var29_1 /* !! */  = (int)lt.ihvw("iisd", ihvy(int ), (int)297);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl514
                    }
                    case 57: {
                        var29_1 /* !! */  = (int)lt.ihvw("iise", ihvy(int ), (int)298);
                        if (!var30) ** GOTO lbl303
                        throw null;
                    }
                    case 58: {
                        var29_1 /* !! */  = (int)lt.ihvw("iisf", ihvy(int ), (int)299);
                        if (!var30) ** GOTO lbl313
                        throw null;
                    }
lbl471:
                    // 2 sources

                    case 59: {
                        var29_1 /* !! */  = (int)lt.ihvw("iisg", ihvy(int ), (int)300);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl587
                    }
lbl476:
                    // 2 sources

                    case 60: {
                        var29_1 /* !! */  = (int)lt.ihvw("iish", ihvy(int ), (int)301);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl668
                    }
lbl481:
                    // 2 sources

                    case 61: {
                        var29_1 /* !! */  = (int)lt.ihvw("iisi", ihvy(int ), (int)302);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl681
                    }
                    case 62: {
                        var29_1 /* !! */  = (int)lt.ihvw("iisj", ihvy(int ), (int)303);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl637
                    }
lbl491:
                    // 2 sources

                    case 63: {
                        var29_1 /* !! */  = (int)lt.ihvw("iisk", ihvy(int ), (int)304);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl677
                    }
lbl496:
                    // 2 sources

                    case 64: {
                        var29_1 /* !! */  = (int)lt.ihvw("iisl", ihvy(int ), (int)305);
                        if (!var30) ** GOTO lbl278
                        throw null;
                    }
                    case 65: {
                        var29_1 /* !! */  = (int)lt.ihvw("iism", ihvy(int ), (int)306);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl655
                    }
lbl505:
                    // 2 sources

                    case 66: {
                        var29_1 /* !! */  = (int)lt.ihvw("iisn", ihvy(int ), (int)307);
                        if (!var30) ** GOTO lbl476
                        throw null;
                    }
lbl509:
                    // 3 sources

                    case 67: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiso", ihvy(int ), (int)308);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl561
                    }
lbl514:
                    // 3 sources

                    case 68: {
                        var29_1 /* !! */  = (int)lt.ihvw("iisp", ihvy(int ), (int)309);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl744
                    }
lbl519:
                    // 3 sources

                    case 69: {
                        var29_1 /* !! */  = (int)lt.ihvw("iisq", ihvy(int ), (int)310);
                        if (!var30) ** GOTO lbl356
                        throw null;
                    }
lbl523:
                    // 2 sources

                    case 70: {
                        var29_1 /* !! */  = (int)lt.ihvw("iisr", ihvy(int ), (int)311);
                        if (!var30) ** GOTO lbl298
                        throw null;
                    }
lbl527:
                    // 2 sources

                    case 71: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiss", ihvy(int ), (int)312);
                        if (!var30) ** GOTO lbl406
                        throw null;
                    }
lbl531:
                    // 2 sources

                    case 72: {
                        var29_1 /* !! */  = (int)lt.ihvw("iist", ihvy(int ), (int)313);
                        if (!var30) break block141;
                        throw null;
                    }
lbl535:
                    // 2 sources

                    case 73: {
                        var29_1 /* !! */  = (int)lt.ihvw("iisu", ihvy(int ), (int)314);
                        if (!var30) ** GOTO lbl293
                        throw null;
                    }
lbl539:
                    // 2 sources

                    case 74: {
                        var29_1 /* !! */  = (int)lt.ihvw("iisv", ihvy(int ), (int)315);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl633
                    }
                    case 75: {
                        var29_1 /* !! */  = (int)lt.ihvw("iisw", ihvy(int ), (int)316);
                        if (!var30) ** GOTO lbl416
                        throw null;
                    }
                    case 76: {
                        var29_1 /* !! */  = (int)lt.ihvw("iisx", ihvy(int ), (int)317);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl673
                    }
lbl553:
                    // 3 sources

                    case 77: {
                        var29_1 /* !! */  = (int)lt.ihvw("iisy", ihvy(int ), (int)318);
                        if (!var30) ** GOTO lbl238
                        throw null;
                    }
                    case 78: {
                        var29_1 /* !! */  = (int)lt.ihvw("iisz", ihvy(int ), (int)319);
                        if (!var30) ** GOTO lbl346
                        throw null;
                    }
lbl561:
                    // 3 sources

                    case 79: {
                        var29_1 /* !! */  = (int)lt.ihvw("iita", ihvy(int ), (int)320);
                        if (!var30) ** GOTO lbl248
                        throw null;
                    }
                    case 80: {
                        var29_1 /* !! */  = (int)lt.ihvw("iitb", ihvy(int ), (int)321);
                        if (!var30) ** GOTO lbl228
                        throw null;
                    }
lbl569:
                    // 2 sources

                    case 81: {
                        var29_1 /* !! */  = (int)lt.ihvw("iitc", ihvy(int ), (int)322);
                        if (!var30) ** GOTO lbl458
                        throw null;
                    }
                    case 82: {
                        var29_1 /* !! */  = (int)lt.ihvw("iitd", ihvy(int ), (int)323);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl655
                    }
                    case 83: {
                        var29_1 /* !! */  = (int)lt.ihvw("iite", ihvy(int ), (int)324);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl784
                    }
lbl583:
                    // 2 sources

                    case 84: {
                        var29_1 /* !! */  = (int)lt.ihvw("iitf", ihvy(int ), (int)325);
                        if (!var30) ** GOTO lbl341
                        throw null;
                    }
lbl587:
                    // 4 sources

                    case 85: {
                        var29_1 /* !! */  = (int)lt.ihvw("iitg", ihvy(int ), (int)326);
                        if (!var30) ** GOTO lbl263
                        throw null;
                    }
lbl591:
                    // 3 sources

                    case 86: {
                        var29_1 /* !! */  = (int)lt.ihvw("iith", ihvy(int ), (int)327);
                        if (!var30) ** GOTO lbl317
                        throw null;
                    }
                    case 87: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiti", ihvy(int ), (int)328);
                        if (!var30) ** GOTO lbl425
                        throw null;
                    }
                    case 88: {
                        var29_1 /* !! */  = (int)lt.ihvw("iitj", ihvy(int ), (int)329);
                        if (!var30) ** GOTO lbl402
                        throw null;
                    }
                    case 89: {
                        var29_1 /* !! */  = (int)lt.ihvw("iitk", ihvy(int ), (int)330);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl612
                    }
                    case 90: {
                        var29_1 /* !! */  = (int)lt.ihvw("iitl", ihvy(int ), (int)331);
                        if (!var30) ** GOTO lbl587
                        throw null;
                    }
lbl612:
                    // 3 sources

                    case 91: {
                        var29_1 /* !! */  = (int)lt.ihvw("iitm", ihvy(int ), (int)332);
                        if (!var30) ** GOTO lbl481
                        throw null;
                    }
                    case 92: {
                        var29_1 /* !! */  = (int)lt.ihvw("iitn", ihvy(int ), (int)333);
                        if (!var30) ** GOTO lbl331
                        throw null;
                    }
lbl620:
                    // 2 sources

                    case 93: {
                        var29_1 /* !! */  = (int)lt.ihvw("iito", ihvy(int ), (int)334);
                        if (!var30) ** GOTO lbl505
                        throw null;
                    }
                    case 94: {
                        var29_1 /* !! */  = (int)lt.ihvw("iitp", ihvy(int ), (int)335);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl780
                    }
lbl629:
                    // 4 sources

                    case 95: {
                        var29_1 /* !! */  = (int)lt.ihvw("iitq", ihvy(int ), (int)336);
                        if (!var30) ** GOTO lbl519
                        throw null;
                    }
lbl633:
                    // 2 sources

                    case 96: {
                        var29_1 /* !! */  = (int)lt.ihvw("iitr", ihvy(int ), (int)337);
                        if (!var30) ** GOTO lbl218
                        throw null;
                    }
lbl637:
                    // 3 sources

                    case 97: {
                        var29_1 /* !! */  = (int)lt.ihvw("iits", ihvy(int ), (int)338);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl673
                    }
                    case 98: {
                        var29_1 /* !! */  = (int)lt.ihvw("iitt", ihvy(int ), (int)339);
                        if (!var30) ** GOTO lbl336
                        throw null;
                    }
lbl646:
                    // 2 sources

                    case 99: {
                        var29_1 /* !! */  = (int)lt.ihvw("iitu", ihvy(int ), (int)340);
                        if (!var30) ** GOTO lbl258
                        throw null;
                    }
                    case 100: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var29_1 /* !! */  = (int)lt.ihvw("iitv", ihvy(int ), (int)341);
                            if (!var30) ** GOTO lbl193
                            throw null;
                        }
                    }
lbl655:
                    // 4 sources

                    case 101: {
                        var29_1 /* !! */  = (int)lt.ihvw("iitw", ihvy(int ), (int)342);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl752
                    }
                    case 102: {
                        var29_1 /* !! */  = (int)lt.ihvw("iitx", ihvy(int ), (int)343);
                        if (!var30) ** GOTO lbl445
                        throw null;
                    }
                    case 103: {
                        var29_1 /* !! */  = (int)lt.ihvw("iity", ihvy(int ), (int)344);
                        if (!var30) ** GOTO lbl268
                        throw null;
                    }
lbl668:
                    // 3 sources

                    case 104: {
                        var29_1 /* !! */  = (int)lt.ihvw("iitz", ihvy(int ), (int)345);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl702
                    }
lbl673:
                    // 3 sources

                    case 105: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiua", ihvy(int ), (int)346);
                        if (!var30) ** GOTO lbl527
                        throw null;
                    }
lbl677:
                    // 5 sources

                    case 106: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiub", ihvy(int ), (int)347);
                        if (!var30) ** GOTO lbl496
                        throw null;
                    }
lbl681:
                    // 2 sources

                    case 107: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiuc", ihvy(int ), (int)348);
                        if (!var30) ** GOTO lbl629
                        throw null;
                    }
                    case 108: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiud", ihvy(int ), (int)349);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl739
                    }
                    case 109: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiue", ihvy(int ), (int)350);
                        if (!var30) ** GOTO lbl331
                        throw null;
                    }
lbl694:
                    // 2 sources

                    case 110: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiuf", ihvy(int ), (int)351);
                        if (!var30) ** GOTO lbl677
                        throw null;
                    }
lbl698:
                    // 2 sources

                    case 111: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiug", ihvy(int ), (int)352);
                        if (!var30) ** GOTO lbl531
                        throw null;
                    }
lbl702:
                    // 3 sources

                    case 112: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiuh", ihvy(int ), (int)353);
                        if (!var30) ** GOTO lbl273
                        throw null;
                    }
lbl706:
                    // 2 sources

                    case 113: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiui", ihvy(int ), (int)354);
                        if (!var30) ** GOTO lbl561
                        throw null;
                    }
lbl710:
                    // 3 sources

                    case 114: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiuj", ihvy(int ), (int)355);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl723
                    }
                    case 115: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiuk", ihvy(int ), (int)356);
                        if (!var30) ** GOTO lbl365
                        throw null;
                    }
                    case 116: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiul", ihvy(int ), (int)357);
                        if (!var30) ** GOTO lbl583
                        throw null;
                    }
lbl723:
                    // 2 sources

                    case 117: {
                        var29_1 /* !! */  = (int)lt.ihvw("iium", ihvy(int ), (int)358);
                        if (!var30) ** GOTO lbl268
                        throw null;
                    }
                    case 118: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiun", ihvy(int ), (int)359);
                        if (!var30) ** GOTO lbl677
                        throw null;
                    }
                    case 119: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiuo", ihvy(int ), (int)360);
                        if (!var30) ** GOTO lbl273
                        throw null;
                    }
lbl735:
                    // 2 sources

                    case 120: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiup", ihvy(int ), (int)361);
                        if (!var30) ** GOTO lbl668
                        throw null;
                    }
lbl739:
                    // 3 sources

                    case 121: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiuq", ihvy(int ), (int)362);
                        if (var30) {
                            throw null;
                        }
                        ** GOTO lbl752
                    }
lbl744:
                    // 2 sources

                    case 122: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiur", ihvy(int ), (int)363);
                        if (!var30) ** GOTO lbl458
                        throw null;
                    }
lbl748:
                    // 4 sources

                    case 123: {
                        var29_1 /* !! */  = (int)lt.ihvw("iius", ihvy(int ), (int)364);
                        if (!var30) ** GOTO lbl706
                        throw null;
                    }
lbl752:
                    // 3 sources

                    case 124: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiut", ihvy(int ), (int)365);
                        if (!var30) ** GOTO lbl587
                        throw null;
                    }
lbl756:
                    // 2 sources

                    case 125: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiuu", ihvy(int ), (int)366);
                        if (!var30) ** GOTO lbl539
                        throw null;
                    }
lbl760:
                    // 4 sources

                    case 126: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiuv", ihvy(int ), (int)367);
                        if (!var30) ** GOTO lbl637
                        throw null;
                    }
                    case 127: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiuw", ihvy(int ), (int)368);
                        if (!var30) ** GOTO lbl213
                        throw null;
                    }
                    case 128: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiux", ihvy(int ), (int)369);
                        if (!var30) ** GOTO lbl646
                        throw null;
                    }
lbl772:
                    // 2 sources

                    case 129: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiuy", ihvy(int ), (int)370);
                        if (!var30) ** GOTO lbl218
                        throw null;
                    }
                    case 130: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiuz", ihvy(int ), (int)371);
                        if (!var30) ** GOTO lbl760
                        throw null;
                    }
lbl780:
                    // 4 sources

                    case 131: {
                        var29_1 /* !! */  = (int)lt.ihvw("iiva", ihvy(int ), (int)372);
                        if (!var30) ** GOTO lbl430
                        throw null;
                    }
lbl784:
                    // 4 sources

                    case 132: {
                        var29_1 /* !! */  = (int)lt.ihvw("iivb", ihvy(int ), (int)373);
                        if (!var30) ** GOTO lbl228
                        throw null;
                    }
                    case 133: 
                }
                break;
            }
            break;
        }
        var29_1 /* !! */  = (int)lt.ihvw("iivc", ihvy(int ), (int)374);
        ** while (!var30)
lbl791:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void begin() {
        v0 /* !! */  = lt.pr;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - lt.ihvw("iidz", ihvt(int ), (int)109));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1106385182: {
                    break block22;
                }
                case 43018043: {
                    v1 = lt.ihvw("iiea", ihvt(int ), (int)110);
                    continue block22;
                }
                case 1255981402: {
                    v1 = lt.ihvw("iieb", ihvt(int ), (int)111);
                    continue block22;
                }
            }
            break;
        }
        var2 = lt.c;
        v2 /* !! */  = lt.pr;
        if (true) ** GOTO lbl19
        block23: while (true) {
            v2 /* !! */  = (long)(lt.ihvw("iied", ihvt(int ), (int)113) - lt.ihvw("iiec", ihvt(int ), (int)112));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1106385182: {
                    break block23;
                }
                case 608321885: {
                    continue block23;
                }
            }
            break;
        }
        var1_1 /* !! */  = lt.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = lt.pr - lt.ihvw("iiee", ihvt(int ), (int)114)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == lt.ihvw("iief", ihvy(int ), (int)98)) break;
            v3 /* !! */  = (long)lt.ihvw("iieg", ihvy(int ), (int)99);
        }
        var0_2 = lt.a;
        if (var2) {
            throw null;
lbl34:
            // 3 sources

            return;
        }
        if (var0_2) ** GOTO lbl34
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** GOTO lbl34
                v4 = lt.ihvw("iieh", ihvy(int ), (int)100);
                v5 /* !! */  = lt.pr;
                if (true) ** GOTO lbl46
                block26: while (true) {
                    v5 /* !! */  = (long)(v6 - lt.ihvw("iiei", ihvt(int ), (int)115));
lbl46:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1106385182: {
                            break block26;
                        }
                        case 75930561: {
                            v6 = lt.ihvw("iiej", ihvt(int ), (int)116);
                            continue block26;
                        }
                        case 189086321: {
                            v6 = lt.ihvw("iiek", ihvt(int ), (int)117);
                            continue block26;
                        }
                    }
                    break;
                }
                lt.begin((boolean)v4);
                if (!var0_2 && !var0_2) ** break;
                ** continue;
                return;
            }
lbl59:
            // 2 sources

            case 0: {
                do {
                    var1_1 /* !! */  = (int)lt.ihvw("iiel", ihvy(int ), (int)101);
                } while (!var2);
                throw null;
            }
lbl64:
            // 3 sources

            case 1: {
                do {
                    var1_1 /* !! */  = (int)lt.ihvw("iiem", ihvy(int ), (int)102);
                } while (!var2);
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)lt.ihvw("iien", ihvy(int ), (int)103);
                if (!var2) ** GOTO lbl64
                throw null;
            }
            case 3: {
                var1_1 /* !! */  = (int)lt.ihvw("iieo", ihvy(int ), (int)104);
                if (!var2) ** GOTO lbl59
                throw null;
            }
            case 4: {
                var1_1 /* !! */  = (int)lt.ihvw("iiep", ihvy(int ), (int)105);
                if (!var2) ** GOTO lbl64
                throw null;
            }
            case 5: 
        }
        do {
            var1_1 /* !! */  = (int)lt.ihvw("iieq", ihvy(int ), (int)106);
        } while (!var2);
        throw null;
    }

    private static /* synthetic */ int ihvy(int n2) {
        return ihvz[n2] ^ ihwa[n2];
    }

    private static /* synthetic */ void ijjh() {
        lt.ihwa[400] = -925389240;
        lt.ihwa[401] = 1597365126;
        lt.ihwa[402] = -1239828114;
        lt.ihwa[403] = 588222509;
        lt.ihwa[404] = 1799027778;
        lt.ihwa[405] = 107117838;
        lt.ihwa[406] = 700994198;
        lt.ihwa[407] = -724330490;
        lt.ihwa[408] = 2050261407;
        lt.ihwa[409] = -306922317;
        lt.ihwa[410] = -1906109460;
        lt.ihwa[411] = -1884600714;
        lt.ihwa[412] = -872780684;
        lt.ihwa[413] = 1010157564;
        lt.ihwa[414] = -1029508806;
        lt.ihwa[415] = 488201786;
        lt.ihwa[416] = -1680576277;
        lt.ihwa[417] = 997597366;
        lt.ihwa[418] = -455202451;
        lt.ihwa[419] = 82460587;
        lt.ihwa[420] = 805087673;
        lt.ihwa[421] = -2081537647;
        lt.ihwa[422] = 1829764484;
        lt.ihwa[423] = 1704189884;
        lt.ihwa[424] = 1657092672;
        lt.ihwa[425] = -555163821;
        lt.ihwa[426] = -1913700206;
        lt.ihwa[427] = -556912001;
        lt.ihwa[428] = 232469787;
        lt.ihwa[429] = 361778000;
        lt.ihwa[430] = -482775957;
        lt.ihwa[431] = 320505265;
        lt.ihwa[432] = 1201389030;
        lt.ihwa[433] = -2057957757;
        lt.ihwa[434] = 1731205691;
        lt.ihwa[435] = -1083676189;
        lt.ihwa[436] = 110568123;
        lt.ihwa[437] = 1685759705;
        lt.ihwa[438] = 1272968794;
        lt.ihwa[439] = -990777777;
        lt.ihwa[440] = -1597617054;
        lt.ihwa[441] = -1376227972;
        lt.ihwa[442] = 621359692;
        lt.ihwa[443] = -1374141627;
        lt.ihwa[444] = 2095086244;
        lt.ihwa[445] = 593231614;
        lt.ihwa[446] = 185025750;
        lt.ihwa[447] = 1146233773;
        lt.ihwa[448] = -127445541;
        lt.ihwa[449] = 1387957808;
        lt.ihwa[450] = -675060702;
        lt.ihwa[451] = 1931413248;
        lt.ihwa[452] = -1303169491;
        lt.ihwa[453] = -1278288313;
        lt.ihwa[454] = -832786167;
        lt.ihwa[455] = 21429186;
        lt.ihwa[456] = 1393683014;
        lt.ihwa[457] = -1457878457;
        lt.ihwa[458] = 184800718;
        lt.ihwa[459] = 374389713;
        lt.ihwa[460] = 1650205714;
        lt.ihwa[461] = -880684885;
        lt.ihwa[462] = 2109058505;
        lt.ihwa[463] = 1771735181;
        lt.ihwa[464] = -2053598143;
        lt.ihwa[465] = -1612854840;
        lt.ihwa[466] = 1041054190;
        lt.ihwa[467] = -313953875;
        lt.ihwa[468] = -169106471;
        lt.ihwa[469] = 683039716;
        lt.ihwa[470] = 1963410256;
        lt.ihwa[471] = 942989242;
        lt.ihwa[472] = -2086449332;
        lt.ihwa[473] = -1707935097;
        lt.ihwa[474] = -484858042;
        lt.ihwa[475] = -1599575518;
        lt.ihwa[476] = -1877371888;
        lt.ihwa[477] = -446000412;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static class_243 getCameraPos() {
        v0 /* !! */  = lt.pr;
        if (true) ** GOTO lbl5
        block25: while (true) {
            v0 /* !! */  = (long)(v1 - lt.ihvw("iicw", ihvt(int ), (int)94));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1796615584: {
                    v1 = lt.ihvw("iicx", ihvt(int ), (int)95);
                    continue block25;
                }
                case -1106385182: {
                    break block25;
                }
                case 269591004: {
                    v1 = lt.ihvw("iicy", ihvt(int ), (int)96);
                    continue block25;
                }
                case 1361814367: {
                    v1 = lt.ihvw("iicz", ihvt(int ), (int)97);
                    continue block25;
                }
            }
            break;
        }
        var3 = lt.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = lt.pr - lt.ihvw("iida", ihvt(int ), (int)98)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == lt.ihvw("iidb", ihvy(int ), (int)84)) break;
            v2 /* !! */  = (long)lt.ihvw("iidc", ihvy(int ), (int)85);
        }
        var2_1 /* !! */  = lt.b;
        v3 /* !! */  = lt.pr;
        if (true) ** GOTO lbl29
        block27: while (true) {
            v3 /* !! */  = (long)(v4 - lt.ihvw("iidd", ihvt(int ), (int)99));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1655187466: {
                    v4 = lt.ihvw("iide", ihvt(int ), (int)100);
                    continue block27;
                }
                case -1106385182: {
                    break block27;
                }
                case -886709114: {
                    v4 = lt.ihvw("iidf", ihvt(int ), (int)101);
                    continue block27;
                }
                case 671017813: {
                    v4 = lt.ihvw("iidg", ihvt(int ), (int)102);
                    continue block27;
                }
            }
            break;
        }
        var1_2 = lt.a;
        if (var3) {
            throw null;
lbl44:
            // 3 sources

            return null;
        }
        if (var1_2) ** GOTO lbl44
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_2) ** GOTO lbl44
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = lt.pr - lt.ihvw("iidh", ihvt(int ), (int)103)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == lt.ihvw("iidi", ihvy(int ), (int)86)) break;
                    v5 /* !! */  = (long)lt.ihvw("iidj", ihvy(int ), (int)87);
                }
                v6 /* !! */  = lt.pr;
                if (true) ** GOTO lbl61
                block30: while (true) {
                    v6 /* !! */  = (long)(v7 - lt.ihvw("iidk", ihvt(int ), (int)104));
lbl61:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1106385182: {
                            break block30;
                        }
                        case 668761178: {
                            v7 = lt.ihvw("iidl", ihvt(int ), (int)105);
                            continue block30;
                        }
                        case 1022419037: {
                            v7 = lt.ihvw("iidm", ihvt(int ), (int)106);
                            continue block30;
                        }
                    }
                    break;
                }
                v8 = lt.mc.field_1773;
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = lt.pr - lt.ihvw("iidn", ihvt(int ), (int)107)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v9 /* !! */  == lt.ihvw("iido", ihvy(int ), (int)88)) break;
                    v9 /* !! */  = (long)lt.ihvw("iidp", ihvy(int ), (int)89);
                }
                var0_3 = v8.method_19418();
                if (!var1_2 && !var1_2) ** break;
                ** continue;
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_3 = lt.pr - lt.ihvw("iidq", ihvt(int ), (int)108)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v10 /* !! */  == lt.ihvw("iidr", ihvy(int ), (int)90)) break;
                    v10 /* !! */  = (long)lt.ihvw("iids", ihvy(int ), (int)91);
                }
                return var0_3.method_71156();
            }
lbl87:
            // 4 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)lt.ihvw("iidt", ihvy(int ), (int)92);
                    if (var3) {
                        throw null;
                    }
                    ** GOTO lbl105
                    break;
                }
            }
lbl93:
            // 2 sources

            case 1: {
                var2_1 /* !! */  = (int)lt.ihvw("iidu", ihvy(int ), (int)93);
                if (!var3) ** GOTO lbl87
                throw null;
            }
            case 2: {
                var2_1 /* !! */  = (int)lt.ihvw("iidv", ihvy(int ), (int)94);
                if (!var3) ** GOTO lbl87
                throw null;
            }
            case 3: {
                var2_1 /* !! */  = (int)lt.ihvw("iidw", ihvy(int ), (int)95);
                if (!var3) ** GOTO lbl93
                throw null;
            }
lbl105:
            // 2 sources

            case 4: {
                var2_1 /* !! */  = (int)lt.ihvw("iidx", ihvy(int ), (int)96);
                if (!var3) ** GOTO lbl87
                throw null;
            }
            case 5: 
        }
        var2_1 /* !! */  = (int)lt.ihvw("iidy", ihvy(int ), (int)97);
        ** while (!var3)
lbl112:
        // 1 sources

        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String lambda$init$0() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = pr - lt.ihvw("ijgh", ihvt(int ), (int)282)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == lt.ihvw("ijgj", ihvy(int ), (int)467)) break;
            object = lt.ihvw("ijgl", ihvy(int ), (int)468);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = pr - lt.ihvw("ijgm", ihvt(int ), (int)283)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == lt.ihvw("ijgo", ihvy(int ), (int)469)) break;
            object = lt.ihvw("ijgq", ihvy(int ), (int)470);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = pr - lt.ihvw("ijgs", ihvt(int ), (int)284)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == lt.ihvw("ijgt", ihvy(int ), (int)471)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = lt.ihvw("ijgv", ihvy(int ), (int)472);
        }
        if (!bl2 && !bl2) return "Glow3D Uniforms";
        return null;
    }

    private static /* synthetic */ void ijkf() {
        lt.ihvu[200] = -4171251174934001809L;
        lt.ihvu[201] = -5861577794905234801L;
        lt.ihvu[202] = -7426463874020766384L;
        lt.ihvu[203] = -7089609797083223102L;
        lt.ihvu[204] = 7494602862628328235L;
        lt.ihvu[205] = 3169616891053607669L;
        lt.ihvu[206] = -6235589188972765582L;
        lt.ihvu[207] = 5834096163132233217L;
        lt.ihvu[208] = 305519069374382843L;
        lt.ihvu[209] = -5316917897252956114L;
        lt.ihvu[210] = -816553720910206778L;
        lt.ihvu[211] = -7338740880988280636L;
        lt.ihvu[212] = -3698153519523164490L;
        lt.ihvu[213] = -6780181632724796851L;
        lt.ihvu[214] = 9135595075771880889L;
        lt.ihvu[215] = 2510700198949428858L;
        lt.ihvu[216] = 7017394998157765041L;
        lt.ihvu[217] = -5199821487587193442L;
        lt.ihvu[218] = 7042103294659694903L;
        lt.ihvu[219] = 5506693829263265166L;
        lt.ihvu[220] = -2963369611367804324L;
        lt.ihvu[221] = -7101943520015392938L;
        lt.ihvu[222] = -8809701873684738586L;
        lt.ihvu[223] = 7320850871786929786L;
        lt.ihvu[224] = -6504196871673929310L;
        lt.ihvu[225] = 4638199977236554795L;
        lt.ihvu[226] = 857554050272697569L;
        lt.ihvu[227] = 4751915085072786876L;
        lt.ihvu[228] = -1221270714503291699L;
        lt.ihvu[229] = -4534285053094185750L;
        lt.ihvu[230] = -565105095395370874L;
        lt.ihvu[231] = -6854784615619755981L;
        lt.ihvu[232] = -7600515943836247836L;
        lt.ihvu[233] = -3499191707130969381L;
        lt.ihvu[234] = -5125792440075477479L;
        lt.ihvu[235] = 1408414764867092682L;
        lt.ihvu[236] = -5109475608644173094L;
        lt.ihvu[237] = -5259122967325755766L;
        lt.ihvu[238] = -3900665083229877983L;
        lt.ihvu[239] = -1023195421734802789L;
        lt.ihvu[240] = -7535765691231692550L;
        lt.ihvu[241] = 3972015690626173846L;
        lt.ihvu[242] = -6458727316813393020L;
        lt.ihvu[243] = 5213364623861649581L;
        lt.ihvu[244] = 6634840882395649493L;
        lt.ihvu[245] = -3611377228407316463L;
        lt.ihvu[246] = -7201612525653451211L;
        lt.ihvu[247] = -4995915878185740874L;
        lt.ihvu[248] = -7861338040422671624L;
        lt.ihvu[249] = 8916969600961859761L;
        lt.ihvu[250] = -7363598167389202594L;
        lt.ihvu[251] = -5636763377355637941L;
        lt.ihvu[252] = -5963127088293418527L;
        lt.ihvu[253] = 8268876484970814821L;
        lt.ihvu[254] = 9198079460166391090L;
        lt.ihvu[255] = -8366016041655550204L;
        lt.ihvu[256] = -6320223157579178723L;
        lt.ihvu[257] = -5787509362320698007L;
        lt.ihvu[258] = -5811804846381160838L;
        lt.ihvu[259] = 8342065255898181303L;
        lt.ihvu[260] = 1089873784718013363L;
        lt.ihvu[261] = 7568690381063378085L;
        lt.ihvu[262] = 1097103885812076203L;
        lt.ihvu[263] = 8873487151690619517L;
        lt.ihvu[264] = 8525693770641610597L;
        lt.ihvu[265] = -4280854115985801801L;
        lt.ihvu[266] = -1416796115386219639L;
        lt.ihvu[267] = 1576648904736673981L;
        lt.ihvu[268] = -2451498575791534733L;
        lt.ihvu[269] = -7212750672878855924L;
        lt.ihvu[270] = 3807843085206599685L;
        lt.ihvu[271] = -3921413647790373233L;
        lt.ihvu[272] = -6358212920092757928L;
        lt.ihvu[273] = -7348550552357973808L;
        lt.ihvu[274] = -6816316077080297595L;
        lt.ihvu[275] = -4553961308228452634L;
        lt.ihvu[276] = -4943617956627493838L;
        lt.ihvu[277] = 8575670876023183932L;
        lt.ihvu[278] = 4599257659805685795L;
        lt.ihvu[279] = 3899422190563798324L;
        lt.ihvu[280] = -6832049472874069805L;
        lt.ihvu[281] = -499257887663937710L;
        lt.ihvu[282] = 5073672634454278320L;
        lt.ihvu[283] = 7479699451120215676L;
        lt.ihvu[284] = -2626890392779443228L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void core(double var0, double var2_1, double var4_2, float var6_3, int var7_4, float var8_5) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lt.pr - lt.ihvw("iiin", ihvt(int ), (int)164)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == lt.ihvw("iiio", ihvy(int ), (int)161)) break;
            v0 /* !! */  = (long)lt.ihvw("iiip", ihvy(int ), (int)162);
        }
        var11_6 = lt.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = lt.pr - lt.ihvw("iiiq", ihvt(int ), (int)165)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == lt.ihvw("iiir", ihvy(int ), (int)163)) break;
            v1 /* !! */  = (long)lt.ihvw("iiis", ihvy(int ), (int)164);
        }
        var10_7 = lt.b;
        v2 /* !! */  = lt.pr;
        if (true) ** GOTO lbl17
        block8: while (true) {
            v2 /* !! */  = (long)(v3 - lt.ihvw("iiit", ihvt(int ), (int)166));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1451091579: {
                    v3 = lt.ihvw("iiiu", ihvt(int ), (int)167);
                    continue block8;
                }
                case -1106385182: {
                    break block8;
                }
                case 35531809: {
                    v3 = lt.ihvw("iiiv", ihvt(int ), (int)168);
                    continue block8;
                }
                case 1836317159: {
                    v3 = lt.ihvw("iiiw", ihvt(int ), (int)169);
                    continue block8;
                }
            }
            break;
        }
        var9_8 = lt.a;
        if (var11_6) {
            throw null;
lbl32:
            // 2 sources

            return;
        }
        if (var9_8 || var9_8) ** GOTO lbl32
        v4 = var6_3 * lt.ihvw("iiiy", iiix(int ), (int)165);
        v5 = var8_5 * lt.ihvw("iiiz", iiix(int ), (int)166);
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = lt.pr - lt.ihvw("iija", ihvt(int ), (int)170)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == lt.ihvw("iijb", ihvy(int ), (int)167)) break;
            v6 /* !! */  = (long)lt.ihvw("iijc", ihvy(int ), (int)168);
        }
        lt.add(var0, var2_1, var4_2, v4, var7_4, v5, 1.0f);
        ** while (var9_8 || var9_8)
lbl44:
        // 1 sources

    }

    private static /* synthetic */ void ijil() {
        lt.ihwa[0] = -1745294584;
        lt.ihwa[1] = 1329579107;
        lt.ihwa[2] = -2059472870;
        lt.ihwa[3] = -580211339;
        lt.ihwa[4] = 1624232358;
        lt.ihwa[5] = 117915448;
        lt.ihwa[6] = 264944978;
        lt.ihwa[7] = 635868919;
        lt.ihwa[8] = -431730937;
        lt.ihwa[9] = -193321179;
        lt.ihwa[10] = -2082711827;
        lt.ihwa[11] = -1790490054;
        lt.ihwa[12] = 1449719936;
        lt.ihwa[13] = -736746618;
        lt.ihwa[14] = -1521274942;
        lt.ihwa[15] = -992330888;
        lt.ihwa[16] = 610472932;
        lt.ihwa[17] = -2127036287;
        lt.ihwa[18] = -1503864134;
        lt.ihwa[19] = 1924529828;
        lt.ihwa[20] = 218053606;
        lt.ihwa[21] = -1811943535;
        lt.ihwa[22] = -635391282;
        lt.ihwa[23] = -103800377;
        lt.ihwa[24] = 1852762408;
        lt.ihwa[25] = -239953413;
        lt.ihwa[26] = 707145029;
        lt.ihwa[27] = -435263530;
        lt.ihwa[28] = 1710186936;
        lt.ihwa[29] = -435141414;
        lt.ihwa[30] = 580495653;
        lt.ihwa[31] = 779039985;
        lt.ihwa[32] = 1079091590;
        lt.ihwa[33] = 144889292;
        lt.ihwa[34] = 700983221;
        lt.ihwa[35] = 2024849834;
        lt.ihwa[36] = -1950424877;
        lt.ihwa[37] = -189415098;
        lt.ihwa[38] = -1398904296;
        lt.ihwa[39] = -412931146;
        lt.ihwa[40] = -1882800145;
        lt.ihwa[41] = 1710346051;
        lt.ihwa[42] = 1616458341;
        lt.ihwa[43] = -966778561;
        lt.ihwa[44] = -1824062967;
        lt.ihwa[45] = 1081901480;
        lt.ihwa[46] = 2057861045;
        lt.ihwa[47] = 492984661;
        lt.ihwa[48] = -223864020;
        lt.ihwa[49] = -1631029860;
        lt.ihwa[50] = -1229651372;
        lt.ihwa[51] = -1281596673;
        lt.ihwa[52] = -2027341934;
        lt.ihwa[53] = 364988264;
        lt.ihwa[54] = 1331017462;
        lt.ihwa[55] = -1262896933;
        lt.ihwa[56] = -671309604;
        lt.ihwa[57] = -1678779443;
        lt.ihwa[58] = -151612890;
        lt.ihwa[59] = -871027580;
        lt.ihwa[60] = -35527354;
        lt.ihwa[61] = 759548197;
        lt.ihwa[62] = 2061157535;
        lt.ihwa[63] = 46296668;
        lt.ihwa[64] = 225689818;
        lt.ihwa[65] = 2034355594;
        lt.ihwa[66] = -1516040728;
        lt.ihwa[67] = 1298232390;
        lt.ihwa[68] = -2017070207;
        lt.ihwa[69] = 1799332947;
        lt.ihwa[70] = 2053456832;
        lt.ihwa[71] = -1515460060;
        lt.ihwa[72] = 2023571290;
        lt.ihwa[73] = 449981800;
        lt.ihwa[74] = -1274347951;
        lt.ihwa[75] = 2084212678;
        lt.ihwa[76] = 1444710216;
        lt.ihwa[77] = 1762033016;
        lt.ihwa[78] = 724782231;
        lt.ihwa[79] = 584447314;
        lt.ihwa[80] = -99839806;
        lt.ihwa[81] = -1100951049;
        lt.ihwa[82] = 1383428482;
        lt.ihwa[83] = 865872390;
        lt.ihwa[84] = -253534657;
        lt.ihwa[85] = -1040178477;
        lt.ihwa[86] = 1906832903;
        lt.ihwa[87] = 397428537;
        lt.ihwa[88] = 675161479;
        lt.ihwa[89] = -1521873929;
        lt.ihwa[90] = -1849579860;
        lt.ihwa[91] = -1843166332;
        lt.ihwa[92] = -1880430362;
        lt.ihwa[93] = 403913387;
        lt.ihwa[94] = -433406321;
        lt.ihwa[95] = 1458072552;
        lt.ihwa[96] = -1975845689;
        lt.ihwa[97] = -750269777;
        lt.ihwa[98] = 1093751104;
        lt.ihwa[99] = -262675098;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void glow(double var0, double var2_1, double var4_2, float var6_3, int var7_4, float var8_5) {
        v0 /* !! */  = lt.pr;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(v1 - lt.ihvw("iiha", ihvt(int ), (int)143));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2116619731: {
                    v1 = lt.ihvw("iihb", ihvt(int ), (int)144);
                    continue block19;
                }
                case -1813678624: {
                    v1 = lt.ihvw("iihc", ihvt(int ), (int)145);
                    continue block19;
                }
                case -1106385182: {
                    break block19;
                }
                case 408901428: {
                    v1 = lt.ihvw("iihd", ihvt(int ), (int)146);
                    continue block19;
                }
            }
            break;
        }
        var11_6 = lt.c;
        v2 /* !! */  = lt.pr;
        if (true) ** GOTO lbl22
        block20: while (true) {
            v2 /* !! */  = (long)(v3 - lt.ihvw("iihe", ihvt(int ), (int)147));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1639106124: {
                    v3 = lt.ihvw("iihf", ihvt(int ), (int)148);
                    continue block20;
                }
                case -1106385182: {
                    break block20;
                }
                case 1238938590: {
                    v3 = lt.ihvw("iihg", ihvt(int ), (int)149);
                    continue block20;
                }
            }
            break;
        }
        var10_7 /* !! */  = lt.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = lt.pr - lt.ihvw("iihh", ihvt(int ), (int)150)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == lt.ihvw("iihi", ihvy(int ), (int)143)) break;
            v4 /* !! */  = (long)lt.ihvw("iihj", ihvy(int ), (int)144);
        }
        var9_8 = lt.a;
        if (var11_6) {
            throw null;
lbl40:
            // 2 sources

            return;
        }
        if (var9_8 || var9_8) ** GOTO lbl40
        if (var10_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var10_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = lt.pr - lt.ihvw("iihk", ihvt(int ), (int)151)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == lt.ihvw("iihl", ihvy(int ), (int)145)) break;
                    v5 /* !! */  = (long)lt.ihvw("iihm", ihvy(int ), (int)146);
                }
                lt.glow(var0, var2_1, var4_2, var6_3, var7_4, var8_5, 1.0f);
                if (var9_8 || var9_8) ** continue;
                return;
            }
lbl54:
            // 2 sources

            case 0: {
                do {
                    var10_7 /* !! */  = (int)lt.ihvw("iihn", ihvy(int ), (int)147);
                } while (!var11_6);
                throw null;
            }
lbl59:
            // 2 sources

            case 1: {
                var10_7 /* !! */  = (int)lt.ihvw("iiho", ihvy(int ), (int)148);
                if (!var11_6) break;
                throw null;
            }
lbl63:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var10_7 /* !! */  = (int)lt.ihvw("iihp", ihvy(int ), (int)149);
                    if (!var11_6) ** GOTO lbl59
                    throw null;
                }
            }
            case 3: {
                var10_7 /* !! */  = (int)lt.ihvw("iihq", ihvy(int ), (int)150);
                if (!var11_6) ** GOTO lbl54
                throw null;
            }
            case 4: {
                var10_7 /* !! */  = (int)lt.ihvw("iihr", ihvy(int ), (int)151);
                if (!var11_6) ** GOTO lbl63
                throw null;
            }
            case 5: 
        }
        var10_7 /* !! */  = (int)lt.ihvw("iihs", ihvy(int ), (int)152);
        ** while (!var11_6)
lbl79:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ijjx() {
        lt.ihvu[100] = 7939015644959971071L;
        lt.ihvu[101] = -1297438322350060997L;
        lt.ihvu[102] = -765954735257772972L;
        lt.ihvu[103] = 3060877793963614424L;
        lt.ihvu[104] = -6086177304389452694L;
        lt.ihvu[105] = 2830585440268708609L;
        lt.ihvu[106] = 8901646666786996818L;
        lt.ihvu[107] = 4135918772753986514L;
        lt.ihvu[108] = -6420407667416785737L;
        lt.ihvu[109] = -1270457138886415510L;
        lt.ihvu[110] = 960830665088625995L;
        lt.ihvu[111] = 6491846243142287588L;
        lt.ihvu[112] = -8165114114378033984L;
        lt.ihvu[113] = -7038791444189419342L;
        lt.ihvu[114] = -3400712139644881557L;
        lt.ihvu[115] = -5695224132133824568L;
        lt.ihvu[116] = 715403917018553996L;
        lt.ihvu[117] = -4632977301838719362L;
        lt.ihvu[118] = -1819813603239687564L;
        lt.ihvu[119] = 8302089965645897433L;
        lt.ihvu[120] = -8551002039510878895L;
        lt.ihvu[121] = 5781128708315813408L;
        lt.ihvu[122] = 508385705144472327L;
        lt.ihvu[123] = -5937971485459060865L;
        lt.ihvu[124] = 8505987146154066353L;
        lt.ihvu[125] = 6764984923753543676L;
        lt.ihvu[126] = 2915452199442609879L;
        lt.ihvu[127] = -7934667799091638451L;
        lt.ihvu[128] = 6789281010216788274L;
        lt.ihvu[129] = 7901546479247939770L;
        lt.ihvu[130] = 6987284174818429495L;
        lt.ihvu[131] = 6635478620315475368L;
        lt.ihvu[132] = -464680487977663539L;
        lt.ihvu[133] = -3470404199017498490L;
        lt.ihvu[134] = 5571097355199376498L;
        lt.ihvu[135] = -1679800466262475566L;
        lt.ihvu[136] = 8477277464752313368L;
        lt.ihvu[137] = -3071550457804122947L;
        lt.ihvu[138] = -5279994896684627334L;
        lt.ihvu[139] = 712837043481250618L;
        lt.ihvu[140] = 3371492935584741093L;
        lt.ihvu[141] = 8938393662398889182L;
        lt.ihvu[142] = -4444194746909848948L;
        lt.ihvu[143] = 1359724238111303394L;
        lt.ihvu[144] = 9031928375275272042L;
        lt.ihvu[145] = -5212163192723893650L;
        lt.ihvu[146] = -4559651683695191123L;
        lt.ihvu[147] = 4730967356222816731L;
        lt.ihvu[148] = 4345536497944190254L;
        lt.ihvu[149] = -3183536932518824781L;
        lt.ihvu[150] = 1861642580219362533L;
        lt.ihvu[151] = -9056384292181703990L;
        lt.ihvu[152] = -864676695868874680L;
        lt.ihvu[153] = -4996531172600342039L;
        lt.ihvu[154] = -2820123549446749312L;
        lt.ihvu[155] = 7942491394379227049L;
        lt.ihvu[156] = 7788755408345324694L;
        lt.ihvu[157] = -776256071135987713L;
        lt.ihvu[158] = 898614572325556971L;
        lt.ihvu[159] = 7953725398537747022L;
        lt.ihvu[160] = -1610181437384731145L;
        lt.ihvu[161] = 6998407136663108752L;
        lt.ihvu[162] = -6287512491100764892L;
        lt.ihvu[163] = -2378814106945012510L;
        lt.ihvu[164] = -5749269198525825583L;
        lt.ihvu[165] = -8040727237255347066L;
        lt.ihvu[166] = 2055796271425645450L;
        lt.ihvu[167] = -4250567543143151078L;
        lt.ihvu[168] = -4285097337808504678L;
        lt.ihvu[169] = 4203314813413147479L;
        lt.ihvu[170] = 6453133868439147952L;
        lt.ihvu[171] = 6150058164239949518L;
        lt.ihvu[172] = 6225651912473703365L;
        lt.ihvu[173] = -6812758264233301383L;
        lt.ihvu[174] = 3873986604848285835L;
        lt.ihvu[175] = 2221552821030389893L;
        lt.ihvu[176] = 1237178159670826325L;
        lt.ihvu[177] = -8632262768447637716L;
        lt.ihvu[178] = 1240566330118709353L;
        lt.ihvu[179] = -7126522021780044057L;
        lt.ihvu[180] = 6212293837810486006L;
        lt.ihvu[181] = -6201464551823706704L;
        lt.ihvu[182] = 7474975610154531584L;
        lt.ihvu[183] = -4918257184318135624L;
        lt.ihvu[184] = -938383032199011300L;
        lt.ihvu[185] = 260718359934531274L;
        lt.ihvu[186] = 7078478741589824607L;
        lt.ihvu[187] = 594421640274994706L;
        lt.ihvu[188] = -1239905960591620230L;
        lt.ihvu[189] = -7369338008653908263L;
        lt.ihvu[190] = 2612356479453350473L;
        lt.ihvu[191] = 9031303796230327392L;
        lt.ihvu[192] = -7069057878926666045L;
        lt.ihvu[193] = -7399861303361704995L;
        lt.ihvu[194] = -2258196717187049950L;
        lt.ihvu[195] = 2379518748251731698L;
        lt.ihvu[196] = 9044491199670219322L;
        lt.ihvu[197] = -8274449597328546329L;
        lt.ihvu[198] = -3643794128397881653L;
        lt.ihvu[199] = 2560253977730062043L;
    }

    private static /* synthetic */ void ijid() {
        lt.ihvz[300] = -1729630597;
        lt.ihvz[301] = 1205992872;
        lt.ihvz[302] = -2013015736;
        lt.ihvz[303] = 1027799973;
        lt.ihvz[304] = -276699674;
        lt.ihvz[305] = 1109626679;
        lt.ihvz[306] = -1764157764;
        lt.ihvz[307] = -1465708821;
        lt.ihvz[308] = 919117260;
        lt.ihvz[309] = 710498541;
        lt.ihvz[310] = 1489340474;
        lt.ihvz[311] = -1808346901;
        lt.ihvz[312] = 453901540;
        lt.ihvz[313] = 928755099;
        lt.ihvz[314] = -617342055;
        lt.ihvz[315] = 1072718020;
        lt.ihvz[316] = 1940193118;
        lt.ihvz[317] = 2143559251;
        lt.ihvz[318] = -1363283517;
        lt.ihvz[319] = -1141894387;
        lt.ihvz[320] = -1121308311;
        lt.ihvz[321] = -1098835052;
        lt.ihvz[322] = 995283673;
        lt.ihvz[323] = -1894456320;
        lt.ihvz[324] = 378371438;
        lt.ihvz[325] = 639567067;
        lt.ihvz[326] = 984538003;
        lt.ihvz[327] = 333286062;
        lt.ihvz[328] = -1348675830;
        lt.ihvz[329] = 2035325098;
        lt.ihvz[330] = 1098453457;
        lt.ihvz[331] = -832713556;
        lt.ihvz[332] = 196386387;
        lt.ihvz[333] = -279112757;
        lt.ihvz[334] = -1125267862;
        lt.ihvz[335] = -199099821;
        lt.ihvz[336] = 1077135560;
        lt.ihvz[337] = 951747494;
        lt.ihvz[338] = 1370688877;
        lt.ihvz[339] = -132861176;
        lt.ihvz[340] = -375444675;
        lt.ihvz[341] = 394201016;
        lt.ihvz[342] = -140202474;
        lt.ihvz[343] = -1223075205;
        lt.ihvz[344] = 88110027;
        lt.ihvz[345] = 1220283886;
        lt.ihvz[346] = 424167754;
        lt.ihvz[347] = 273668626;
        lt.ihvz[348] = 348300910;
        lt.ihvz[349] = 193120444;
        lt.ihvz[350] = -344873471;
        lt.ihvz[351] = 1545380156;
        lt.ihvz[352] = -417909052;
        lt.ihvz[353] = 142700145;
        lt.ihvz[354] = -576038222;
        lt.ihvz[355] = -1856374134;
        lt.ihvz[356] = 1661734768;
        lt.ihvz[357] = 505212133;
        lt.ihvz[358] = -1653652636;
        lt.ihvz[359] = -1765401209;
        lt.ihvz[360] = -1649667332;
        lt.ihvz[361] = 149108182;
        lt.ihvz[362] = -1870037823;
        lt.ihvz[363] = -2112640963;
        lt.ihvz[364] = 369687813;
        lt.ihvz[365] = -1284617181;
        lt.ihvz[366] = -1125132555;
        lt.ihvz[367] = -2076681613;
        lt.ihvz[368] = -358177231;
        lt.ihvz[369] = 1536206839;
        lt.ihvz[370] = -637996780;
        lt.ihvz[371] = 1173372314;
        lt.ihvz[372] = 1605174255;
        lt.ihvz[373] = -1591236302;
        lt.ihvz[374] = 1047885867;
        lt.ihvz[375] = 176609089;
        lt.ihvz[376] = -978051733;
        lt.ihvz[377] = 1443705069;
        lt.ihvz[378] = -712638499;
        lt.ihvz[379] = 906259744;
        lt.ihvz[380] = 353903620;
        lt.ihvz[381] = 1625959659;
        lt.ihvz[382] = 1673794773;
        lt.ihvz[383] = -1861902710;
        lt.ihvz[384] = -645193281;
        lt.ihvz[385] = 863811758;
        lt.ihvz[386] = -1365406616;
        lt.ihvz[387] = -41449798;
        lt.ihvz[388] = -1950041160;
        lt.ihvz[389] = -2013645779;
        lt.ihvz[390] = -332114746;
        lt.ihvz[391] = -898116775;
        lt.ihvz[392] = -843440220;
        lt.ihvz[393] = -1403355454;
        lt.ihvz[394] = 567162885;
        lt.ihvz[395] = -278392920;
        lt.ihvz[396] = 1534780573;
        lt.ihvz[397] = 2120739394;
        lt.ihvz[398] = 988158000;
        lt.ihvz[399] = -269717087;
    }
}

