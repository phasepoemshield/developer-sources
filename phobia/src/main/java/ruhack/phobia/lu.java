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
 *  net.minecraft.class_243
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
import java.util.function.Supplier;
import net.minecraft.class_10789;
import net.minecraft.class_243;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public final class lu {
    static final long pn = 4061625532398552076L;
    private static final class_310 MC;
    private static boolean ignoreDepth;
    private static int segmentCount;
    private static final Matrix4f projection;
    private static final double[] fromY;
    public static final boolean c;
    private static final double[] toX;
    private static final int VERTEX_SIZE = 24;
    private static final double[] toY;
    private static final int VERTICES_PER_SEGMENT = 6;
    private static final float[] alphas;
    private static long[] ieia;
    private static final double[] fromX;
    private static final double[] toZ;
    private static long[] iehz;
    private static final double[] fromZ;
    private static final int UNIFORM_SIZE = 128;
    private static final int MAX_SEGMENTS = 1024;
    public static final boolean a;
    private static final Matrix4f combined;
    private static RenderPipeline pipeline;
    private static int[] iehr;
    private static int[] iehq;
    private static final int[] colors;
    private static GpuBuffer uniformBuffer;
    public static final int b;
    private static GpuBuffer vertexBuffer;
    private static final float[] widths;
    private static final Matrix4f view;

    private static /* synthetic */ void igdw() {
        lu.ieia[200] = 3450001740439792664L;
        lu.ieia[201] = -8032993083905625721L;
        lu.ieia[202] = 6465961301343117800L;
        lu.ieia[203] = -5085406908858482076L;
        lu.ieia[204] = 787893616735809661L;
        lu.ieia[205] = 4121863356768815817L;
        lu.ieia[206] = -7265617143621278381L;
        lu.ieia[207] = 8075491674488758353L;
        lu.ieia[208] = 3596300756202355728L;
        lu.ieia[209] = 5682472574329504576L;
        lu.ieia[210] = -7158919398816699123L;
        lu.ieia[211] = 144106573703789219L;
        lu.ieia[212] = 1115957179156516534L;
        lu.ieia[213] = 6617196999574161259L;
        lu.ieia[214] = 1927263758057653637L;
        lu.ieia[215] = -8480097206120208623L;
        lu.ieia[216] = 2254155495155926485L;
        lu.ieia[217] = 2072509454940916807L;
        lu.ieia[218] = 2470443329907278915L;
        lu.ieia[219] = 2230083182051768657L;
        lu.ieia[220] = 8863345160293670574L;
        lu.ieia[221] = 4800061620081199485L;
        lu.ieia[222] = -8631106677972610716L;
        lu.ieia[223] = 4525871089080841524L;
        lu.ieia[224] = 4940906241618968431L;
        lu.ieia[225] = -8637812148198749883L;
        lu.ieia[226] = 8393774896893608093L;
        lu.ieia[227] = -6583061371530927166L;
        lu.ieia[228] = -4472900232417317502L;
        lu.ieia[229] = 6893181870704061763L;
        lu.ieia[230] = -7199421737381993037L;
        lu.ieia[231] = -7337197236089889156L;
        lu.ieia[232] = -3632957943599138204L;
        lu.ieia[233] = -6262532927684660901L;
        lu.ieia[234] = 7081448899660839471L;
        lu.ieia[235] = -5181607900907697997L;
        lu.ieia[236] = 2708658144721459267L;
        lu.ieia[237] = 3142736449665544155L;
        lu.ieia[238] = 2101239242371118819L;
        lu.ieia[239] = 8276107933770943812L;
        lu.ieia[240] = 8710663459632892600L;
        lu.ieia[241] = -2413277325277633951L;
        lu.ieia[242] = 9026837431323184816L;
        lu.ieia[243] = 5345265133653142033L;
        lu.ieia[244] = 1310865550875397720L;
        lu.ieia[245] = 589464981751980307L;
        lu.ieia[246] = 4817432267283308367L;
        lu.ieia[247] = -7194068750703834305L;
        lu.ieia[248] = 7947076534004326725L;
        lu.ieia[249] = -3827002465057626094L;
    }

    private static /* synthetic */ void igdm() {
        lu.iehz[200] = -7293383907366959037L;
        lu.iehz[201] = -7597932720958364045L;
        lu.iehz[202] = -2589333267014843668L;
        lu.iehz[203] = -50907098540433323L;
        lu.iehz[204] = 856027584121228949L;
        lu.iehz[205] = 3471456439597737723L;
        lu.iehz[206] = -2722970968583000235L;
        lu.iehz[207] = 3152461931752619033L;
        lu.iehz[208] = 1039518187957843733L;
        lu.iehz[209] = -3526588835833180781L;
        lu.iehz[210] = -1390403635210187280L;
        lu.iehz[211] = -7954797369378891980L;
        lu.iehz[212] = 263212429949329757L;
        lu.iehz[213] = -821687534363212358L;
        lu.iehz[214] = 8294923156167993011L;
        lu.iehz[215] = -3610889533657626842L;
        lu.iehz[216] = 6636044902595632410L;
        lu.iehz[217] = 9212306358660878103L;
        lu.iehz[218] = 8596374027789692999L;
        lu.iehz[219] = -8198229040592656830L;
        lu.iehz[220] = 1981952240203885076L;
        lu.iehz[221] = 3454982979143629796L;
        lu.iehz[222] = 7639067570161781163L;
        lu.iehz[223] = -8705699357683406842L;
        lu.iehz[224] = 7462705995576614691L;
        lu.iehz[225] = 2215286964186394472L;
        lu.iehz[226] = 4502897810362412880L;
        lu.iehz[227] = -4829877048836443542L;
        lu.iehz[228] = 8369003885574173549L;
        lu.iehz[229] = 6667720662391829889L;
        lu.iehz[230] = -8804069105969140764L;
        lu.iehz[231] = -8074702754645489652L;
        lu.iehz[232] = 5106939589496892453L;
        lu.iehz[233] = 8882606412848156897L;
        lu.iehz[234] = -5789114308072604195L;
        lu.iehz[235] = 4810801899696644076L;
        lu.iehz[236] = 5875848279495830471L;
        lu.iehz[237] = 1004028736665046577L;
        lu.iehz[238] = 1604881352276304093L;
        lu.iehz[239] = -7792705977376102332L;
        lu.iehz[240] = 7661955018232903851L;
        lu.iehz[241] = -9002360955864668180L;
        lu.iehz[242] = -1818874747844850240L;
        lu.iehz[243] = -7520077312069599587L;
        lu.iehz[244] = 8929943230119869723L;
        lu.iehz[245] = 8663848143841595424L;
        lu.iehz[246] = 8850543451512407282L;
        lu.iehz[247] = 6957538856398295438L;
        lu.iehz[248] = -3309940565288086206L;
        lu.iehz[249] = -8009976116522337517L;
    }

    private static /* synthetic */ void igdc() {
        lu.iehr[200] = 1015713435;
        lu.iehr[201] = -1427826252;
        lu.iehr[202] = 1855776263;
        lu.iehr[203] = 758149007;
        lu.iehr[204] = -1451093531;
        lu.iehr[205] = -1792882163;
        lu.iehr[206] = -978585402;
        lu.iehr[207] = -1123310905;
        lu.iehr[208] = -671660025;
        lu.iehr[209] = -1359317251;
        lu.iehr[210] = 1368763790;
        lu.iehr[211] = -1745070937;
        lu.iehr[212] = -2070092698;
        lu.iehr[213] = 812210002;
        lu.iehr[214] = 684525992;
        lu.iehr[215] = -671514092;
        lu.iehr[216] = -1892257455;
        lu.iehr[217] = -467560169;
        lu.iehr[218] = -1192599822;
        lu.iehr[219] = -1663830895;
        lu.iehr[220] = -9851803;
        lu.iehr[221] = 786506999;
        lu.iehr[222] = 1696515378;
        lu.iehr[223] = 1499796837;
        lu.iehr[224] = -162307554;
        lu.iehr[225] = -1788127628;
        lu.iehr[226] = -1407283319;
        lu.iehr[227] = 590480194;
        lu.iehr[228] = 1921461720;
        lu.iehr[229] = 681882864;
        lu.iehr[230] = -1536328412;
        lu.iehr[231] = 550976586;
        lu.iehr[232] = 1872240581;
        lu.iehr[233] = -1721562439;
        lu.iehr[234] = -2010711354;
        lu.iehr[235] = -1169331452;
        lu.iehr[236] = -2050059236;
        lu.iehr[237] = -1877169112;
        lu.iehr[238] = -462771315;
        lu.iehr[239] = -188094978;
        lu.iehr[240] = 980864081;
        lu.iehr[241] = -2008348975;
        lu.iehr[242] = 1325495648;
        lu.iehr[243] = 662352841;
        lu.iehr[244] = 1934837684;
        lu.iehr[245] = 382258953;
        lu.iehr[246] = 1247050468;
        lu.iehr[247] = -257194379;
        lu.iehr[248] = 436355022;
        lu.iehr[249] = 1621384490;
        lu.iehr[250] = 1768303207;
        lu.iehr[251] = 1172890129;
        lu.iehr[252] = -177198768;
        lu.iehr[253] = -1762321082;
        lu.iehr[254] = 2017993294;
        lu.iehr[255] = -561608367;
        lu.iehr[256] = -1391749894;
        lu.iehr[257] = 1743533177;
        lu.iehr[258] = -1924881774;
        lu.iehr[259] = -1974562797;
        lu.iehr[260] = -1341092980;
        lu.iehr[261] = 1729896704;
        lu.iehr[262] = -981449076;
        lu.iehr[263] = 1903976181;
        lu.iehr[264] = 2035932894;
        lu.iehr[265] = -357426611;
        lu.iehr[266] = 582273774;
        lu.iehr[267] = -925002825;
        lu.iehr[268] = 1584814205;
        lu.iehr[269] = 1875957307;
        lu.iehr[270] = 1458563178;
        lu.iehr[271] = 1772332741;
        lu.iehr[272] = -88121110;
        lu.iehr[273] = -522738100;
        lu.iehr[274] = 527773715;
        lu.iehr[275] = 1818934767;
        lu.iehr[276] = -347318744;
        lu.iehr[277] = 411057843;
        lu.iehr[278] = -2078815589;
        lu.iehr[279] = 797329801;
        lu.iehr[280] = -1580402243;
        lu.iehr[281] = 1205784413;
        lu.iehr[282] = -952504499;
        lu.iehr[283] = 452623978;
        lu.iehr[284] = 879811489;
        lu.iehr[285] = -74712521;
        lu.iehr[286] = 401892370;
        lu.iehr[287] = -1063731028;
        lu.iehr[288] = 225870631;
        lu.iehr[289] = -662062362;
        lu.iehr[290] = -28814374;
        lu.iehr[291] = 2090669835;
        lu.iehr[292] = 682345021;
        lu.iehr[293] = -2140507792;
        lu.iehr[294] = 580005199;
        lu.iehr[295] = -1106168842;
        lu.iehr[296] = 1104502359;
        lu.iehr[297] = 141217712;
        lu.iehr[298] = -1994517706;
        lu.iehr[299] = -2097612067;
    }

    private static /* synthetic */ void igcw() {
        lu.iehq[0] = -1945774436;
        lu.iehq[1] = -14757056;
        lu.iehq[2] = 365109802;
        lu.iehq[3] = -1806361013;
        lu.iehq[4] = 1029704702;
        lu.iehq[5] = 1562717019;
        lu.iehq[6] = 1702963034;
        lu.iehq[7] = -945734089;
        lu.iehq[8] = -1663573320;
        lu.iehq[9] = -1957449967;
        lu.iehq[10] = -915668965;
        lu.iehq[11] = -1421474185;
        lu.iehq[12] = -459837787;
        lu.iehq[13] = 1449640380;
        lu.iehq[14] = -1122148103;
        lu.iehq[15] = -132311461;
        lu.iehq[16] = 729431888;
        lu.iehq[17] = -239670005;
        lu.iehq[18] = 604396700;
        lu.iehq[19] = 1683145581;
        lu.iehq[20] = 1895887056;
        lu.iehq[21] = -2086951428;
        lu.iehq[22] = -208747227;
        lu.iehq[23] = -207198182;
        lu.iehq[24] = -245469196;
        lu.iehq[25] = 541060200;
        lu.iehq[26] = 1246983515;
        lu.iehq[27] = -261474345;
        lu.iehq[28] = -1795177205;
        lu.iehq[29] = 2114840600;
        lu.iehq[30] = 398194266;
        lu.iehq[31] = -430925100;
        lu.iehq[32] = -1340473163;
        lu.iehq[33] = 739661533;
        lu.iehq[34] = 392698610;
        lu.iehq[35] = 838756624;
        lu.iehq[36] = 939681422;
        lu.iehq[37] = -1927557736;
        lu.iehq[38] = 1321849764;
        lu.iehq[39] = 2004277295;
        lu.iehq[40] = 435066720;
        lu.iehq[41] = -537479983;
        lu.iehq[42] = 2044012839;
        lu.iehq[43] = 133532894;
        lu.iehq[44] = 468912646;
        lu.iehq[45] = -692348353;
        lu.iehq[46] = -375856733;
        lu.iehq[47] = 1447517160;
        lu.iehq[48] = -676203;
        lu.iehq[49] = 332201613;
        lu.iehq[50] = -777863431;
        lu.iehq[51] = 623630220;
        lu.iehq[52] = -1501225039;
        lu.iehq[53] = -1777650222;
        lu.iehq[54] = -810505242;
        lu.iehq[55] = -2035098594;
        lu.iehq[56] = 866584133;
        lu.iehq[57] = -446026906;
        lu.iehq[58] = -1044642935;
        lu.iehq[59] = -556100574;
        lu.iehq[60] = 1941345180;
        lu.iehq[61] = -44162888;
        lu.iehq[62] = -612600183;
        lu.iehq[63] = -1592379787;
        lu.iehq[64] = 211170506;
        lu.iehq[65] = 806205464;
        lu.iehq[66] = -1571531026;
        lu.iehq[67] = -1010437417;
        lu.iehq[68] = -435820989;
        lu.iehq[69] = -850861666;
        lu.iehq[70] = 1299204765;
        lu.iehq[71] = -1472478243;
        lu.iehq[72] = -987642062;
        lu.iehq[73] = -2108042072;
        lu.iehq[74] = 938927544;
        lu.iehq[75] = -467739915;
        lu.iehq[76] = 1843106626;
        lu.iehq[77] = 675735298;
        lu.iehq[78] = 570476371;
        lu.iehq[79] = 2141380567;
        lu.iehq[80] = 603705107;
        lu.iehq[81] = -297004276;
        lu.iehq[82] = -240822149;
        lu.iehq[83] = -1135445936;
        lu.iehq[84] = 1548259609;
        lu.iehq[85] = -236871991;
        lu.iehq[86] = 1261415361;
        lu.iehq[87] = 1183959722;
        lu.iehq[88] = -1781124060;
        lu.iehq[89] = 395135702;
        lu.iehq[90] = 1578386480;
        lu.iehq[91] = -1162353500;
        lu.iehq[92] = -679946841;
        lu.iehq[93] = 667883880;
        lu.iehq[94] = 287283786;
        lu.iehq[95] = -1129252546;
        lu.iehq[96] = -1018098322;
        lu.iehq[97] = -2122619658;
        lu.iehq[98] = -1413256220;
        lu.iehq[99] = -880143648;
    }

    private static /* synthetic */ int ieho(int n2) {
        return iehq[n2] ^ iehr[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$init$2() {
        v0 /* !! */  = lu.pn;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - lu.iehs("igbl", iehy(int ), (int)229));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -45759476: {
                    break block20;
                }
                case 5580413: {
                    v1 = lu.iehs("igbm", iehy(int ), (int)230);
                    continue block20;
                }
                case 1239844622: {
                    v1 = lu.iehs("igbn", iehy(int ), (int)231);
                    continue block20;
                }
            }
            break;
        }
        var2 = lu.c;
        v2 /* !! */  = lu.pn;
        if (true) ** GOTO lbl19
        block21: while (true) {
            v2 /* !! */  = (long)(lu.iehs("igbp", iehy(int ), (int)233) - lu.iehs("igbo", iehy(int ), (int)232));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1271666240: {
                    continue block21;
                }
                case -45759476: {
                    break block21;
                }
            }
            break;
        }
        var1_1 /* !! */  = lu.b;
        v3 /* !! */  = lu.pn;
        if (true) ** GOTO lbl29
        block22: while (true) {
            v3 /* !! */  = (long)(v4 - lu.iehs("igbq", iehy(int ), (int)234));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2088115741: {
                    v4 = lu.iehs("igbr", iehy(int ), (int)235);
                    continue block22;
                }
                case -906598290: {
                    v4 = lu.iehs("igbs", iehy(int ), (int)236);
                    continue block22;
                }
                case -45759476: {
                    break block22;
                }
            }
            break;
        }
        var0_2 = lu.a;
        if (var2) {
            throw null;
lbl41:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl44:
        // 1 sources

        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return "Lightning3D Vertices";
            }
lbl48:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)lu.iehs("igbt", ieho(int ), (int)345);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl58
                    break;
                }
            }
            case 1: {
                var1_1 /* !! */  = (int)lu.iehs("igbu", ieho(int ), (int)346);
                if (!var2) ** GOTO lbl48
                throw null;
            }
lbl58:
            // 2 sources

            case 2: {
                var1_1 /* !! */  = (int)lu.iehs("igbv", ieho(int ), (int)347);
                if (!var2) ** GOTO lbl48
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)lu.iehs("igbw", ieho(int ), (int)348);
        ** while (!var2)
lbl65:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static void setMatrices(Matrix4f var0, Matrix4f var1_1) {
        v0 /* !! */  = lu.pn;
        if (true) ** GOTO lbl5
        block30: while (true) {
            v0 /* !! */  = (long)(v1 - lu.iehs("ieib", iehy(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1917044030: {
                    v1 = lu.iehs("ieic", iehy(int ), (int)1);
                    continue block30;
                }
                case -1374048293: {
                    v1 = lu.iehs("ieid", iehy(int ), (int)2);
                    continue block30;
                }
                case -324016713: {
                    v1 = lu.iehs("ieie", iehy(int ), (int)3);
                    continue block30;
                }
                case -45759476: {
                    break block30;
                }
            }
            break;
        }
        var4_2 = lu.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = lu.pn - lu.iehs("ieig", iehy(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == lu.iehs("ieih", ieho(int ), (int)3)) break;
            v2 /* !! */  = (long)lu.iehs("ieii", ieho(int ), (int)4);
        }
        var3_3 /* !! */  = lu.b;
        while (true) {
            block53: {
                if ((v3 /* !! */  = (cfr_temp_2 = lu.pn - lu.iehs("ieij", iehy(int ), (int)5)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  != lu.iehs("ieik", ieho(int ), (int)5)) break block53;
                var2_4 = lu.a;
                if (var3_3 /* !! */  != 0) {
                    break;
                }
                ** GOTO lbl-1000
            }
            v3 /* !! */  = (long)lu.iehs("ieil", ieho(int ), (int)6);
        }
        cfr_temp_0 = -2147483648;
        block33: while (true) {
            block54: {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var4_2) {
                            throw null;
                        }
                        if (var2_4 || var2_4) return;
                        v4 /* !! */  = lu.pn;
                        block34: while (true) {
                            switch ((int)v4 /* !! */ ) {
                                case -45759476: {
                                    break block34;
                                }
                                case 260345968: {
                                    v4 /* !! */  = (long)(lu.iehs("ieip", iehy(int ), (int)7) - lu.iehs("iein", iehy(int ), (int)6));
                                    continue block34;
                                }
                            }
                            break;
                        }
                        v5 /* !! */  = lu.pn;
                        block35: while (true) {
                            switch ((int)v5 /* !! */ ) {
                                case -810794129: {
                                    v6 = lu.iehs("ieis", iehy(int ), (int)9);
                                    ** GOTO lbl60
                                }
                                case -784829403: {
                                    v6 = lu.iehs("ieit", iehy(int ), (int)10);
                                    ** GOTO lbl60
                                }
                                case -416604579: {
                                    v6 = lu.iehs("ieiu", iehy(int ), (int)11);
lbl60:
                                    // 3 sources

                                    v5 /* !! */  = (long)(v6 - lu.iehs("ieiq", iehy(int ), (int)8));
                                    continue block35;
                                }
                                case -45759476: {
                                    break block35;
                                }
                            }
                            break;
                        }
                        lu.projection.set((Matrix4fc)var0);
                        if (var2_4 || var2_4) return;
                        while (true) {
                            if ((v7 /* !! */  = (cfr_temp_3 = lu.pn - lu.iehs("ieix", iehy(int ), (int)12)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v7 /* !! */  == lu.iehs("ieiy", ieho(int ), (int)7)) {
                                v8 /* !! */  = lu.pn;
                                ** break;
                            }
                            v7 /* !! */  = (long)lu.iehs("ieiz", ieho(int ), (int)8);
                        }
                    }
                    case 3: {
                        ** GOTO lbl100
                    }
                    case 7: {
                        ** GOTO lbl97
                    }
lbl78:
                    // 1 sources

                    block37: while (true) {
                        switch ((int)v8 /* !! */ ) {
                            case -577237611: {
                                v8 /* !! */  = (long)(lu.iehs("iejb", iehy(int ), (int)14) - lu.iehs("ieja", iehy(int ), (int)13));
                                continue block37;
                            }
                            case -45759476: {
                                break block37;
                            }
                        }
                        break;
                    }
                    lu.view.set((Matrix4fc)var1_1);
                    if (!var2_4 && !var2_4) return;
                    return;
                    case 0: {
                        var3_3 /* !! */  = (int)lu.iehs("iejc", ieho(int ), (int)9);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 6: {
                        var3_3 /* !! */  = (int)lu.iehs("iejq", ieho(int ), (int)15);
                        if (var4_2) {
                            throw null;
                        }
lbl97:
                        // 3 sources

                        var3_3 /* !! */  = (int)lu.iehs("iejs", ieho(int ), (int)16);
                        if (var4_2) {
                            throw null;
                        }
lbl100:
                        // 3 sources

                        var3_3 /* !! */  = (int)lu.iehs("iejk", ieho(int ), (int)12);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 4: {
                        var3_3 /* !! */  = (int)lu.iehs("iejm", ieho(int ), (int)13);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 5: {
                        var3_3 /* !! */  = (int)lu.iehs("iejo", ieho(int ), (int)14);
                        cfr_temp_0 = 0;
                        if (var4_2) {
                            throw null;
                        }
                        break block54;
                    }
                    case 1: {
                        var3_3 /* !! */  = (int)lu.iehs("iejd", ieho(int ), (int)10);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 2: 
                }
                ** GOTO lbl122
            }
            do {
                if (true) continue block33;
lbl122:
                // 2 sources

                var3_3 /* !! */  = (int)lu.iehs("ieje", ieho(int ), (int)11);
                cfr_temp_0 = 1;
            } while (!var4_2);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void init() {
        block199: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = lu.pn - lu.iehs("ifgf", iehy(int ), (int)28)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == lu.iehs("ifgg", ieho(int ), (int)221)) break;
                v0 /* !! */  = (long)lu.iehs("ifgh", ieho(int ), (int)222);
            }
            var3 = lu.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = lu.pn - lu.iehs("ifgi", iehy(int ), (int)29)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == lu.iehs("ifgj", ieho(int ), (int)223)) break;
                v1 /* !! */  = (long)lu.iehs("ifgk", ieho(int ), (int)224);
            }
            var2_1 /* !! */  = lu.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = lu.pn - lu.iehs("ifgm", iehy(int ), (int)30)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == lu.iehs("ifgn", ieho(int ), (int)225)) break;
                v2 /* !! */  = (long)lu.iehs("ifgo", ieho(int ), (int)226);
            }
            var1_2 = lu.a;
            if (var3) {
                throw null;
lbl21:
                // 8 sources

                return;
            }
            if (var1_2 || var1_2) ** GOTO lbl21
            v3 /* !! */  = lu.pn;
            if (true) ** GOTO lbl28
            block147: while (true) {
                v3 /* !! */  = (long)(lu.iehs("ifgr", iehy(int ), (int)32) - lu.iehs("ifgp", iehy(int ), (int)31));
lbl28:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -45759476: {
                        break block147;
                    }
                    case -4115168: {
                        continue block147;
                    }
                }
                break;
            }
            if (lu.pipeline == null) break block199;
            if (var1_2) ** GOTO lbl21
            return;
        }
        if (var1_2 || var1_2) ** GOTO lbl21
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_3 = lu.pn - lu.iehs("ifgs", iehy(int ), (int)33)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == lu.iehs("ifgt", ieho(int ), (int)227)) break;
            v4 /* !! */  = (long)lu.iehs("ifgu", ieho(int ), (int)228);
        }
        v5 = VertexFormat.builder();
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_4 = lu.pn - lu.iehs("ifgv", iehy(int ), (int)34)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == lu.iehs("ifgw", ieho(int ), (int)229)) break;
            v6 /* !! */  = (long)lu.iehs("ifgx", ieho(int ), (int)230);
        }
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_5 = lu.pn - lu.iehs("ifgy", iehy(int ), (int)35)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == lu.iehs("ifgz", ieho(int ), (int)231)) break;
            v7 /* !! */  = (long)lu.iehs("ifha", ieho(int ), (int)232);
        }
        v8 = v5.add("inPosition", VertexFormatElement.POSITION);
        v9 /* !! */  = lu.pn;
        if (true) ** GOTO lbl59
        block151: while (true) {
            v9 /* !! */  = (long)(lu.iehs("ifhd", iehy(int ), (int)37) - lu.iehs("ifhc", iehy(int ), (int)36));
lbl59:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -45759476: {
                    break block151;
                }
                case 402460915: {
                    continue block151;
                }
            }
            break;
        }
        v10 /* !! */  = lu.pn;
        if (true) ** GOTO lbl68
        block152: while (true) {
            v10 /* !! */  = (long)(v11 - lu.iehs("ifhe", iehy(int ), (int)38));
lbl68:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1201594085: {
                    v11 = lu.iehs("ifhg", iehy(int ), (int)39);
                    continue block152;
                }
                case -969868899: {
                    v11 = lu.iehs("ifhh", iehy(int ), (int)40);
                    continue block152;
                }
                case -45759476: {
                    break block152;
                }
                case 337918114: {
                    v11 = lu.iehs("ifhi", iehy(int ), (int)41);
                    continue block152;
                }
            }
            break;
        }
        v12 = v8.add("inColor", VertexFormatElement.COLOR);
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_6 = lu.pn - lu.iehs("ifhk", iehy(int ), (int)42)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == lu.iehs("ifhn", ieho(int ), (int)233)) break;
            v13 /* !! */  = (long)lu.iehs("ifho", ieho(int ), (int)234);
        }
        v14 /* !! */  = lu.pn;
        if (true) ** GOTO lbl90
        block154: while (true) {
            v14 /* !! */  = (long)(v15 - lu.iehs("ifhq", iehy(int ), (int)43));
lbl90:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1044615520: {
                    v15 = lu.iehs("ifhr", iehy(int ), (int)44);
                    continue block154;
                }
                case -917064108: {
                    v15 = lu.iehs("ifhs", iehy(int ), (int)45);
                    continue block154;
                }
                case -45759476: {
                    break block154;
                }
                case 2051023675: {
                    v15 = lu.iehs("ifhu", iehy(int ), (int)46);
                    continue block154;
                }
            }
            break;
        }
        v16 = v12.add("inUV", VertexFormatElement.UV);
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_7 = lu.pn - lu.iehs("ifhv", iehy(int ), (int)47)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == lu.iehs("ifhw", ieho(int ), (int)235)) break;
            v17 /* !! */  = (long)lu.iehs("ifhx", ieho(int ), (int)236);
        }
        var0_3 = v16.build();
        if (var1_2) ** GOTO lbl21
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_2) ** GOTO lbl21
                v18 = new RenderPipeline.Snippet[]{};
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_8 = lu.pn - lu.iehs("ifia", iehy(int ), (int)48)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == lu.iehs("ifib", ieho(int ), (int)237)) break;
                    v19 /* !! */  = (long)lu.iehs("ific", ieho(int ), (int)238);
                }
                v20 = RenderPipeline.builder((RenderPipeline.Snippet[])v18);
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_9 = lu.pn - lu.iehs("ifie", iehy(int ), (int)49)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == lu.iehs("ifif", ieho(int ), (int)239)) break;
                    v21 /* !! */  = (long)lu.iehs("ifii", ieho(int ), (int)240);
                }
                v22 = class_2960.method_60655((String)"phobia", (String)"3d/lightning3d");
                v23 /* !! */  = lu.pn;
                if (true) ** GOTO lbl131
                block158: while (true) {
                    v23 /* !! */  = (long)(v24 - lu.iehs("ifij", iehy(int ), (int)50));
lbl131:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -2104624597: {
                            v24 = lu.iehs("ifik", iehy(int ), (int)51);
                            continue block158;
                        }
                        case -387109626: {
                            v24 = lu.iehs("ifil", iehy(int ), (int)52);
                            continue block158;
                        }
                        case -45759476: {
                            break block158;
                        }
                        case 1685654321: {
                            v24 = lu.iehs("ifim", iehy(int ), (int)53);
                            continue block158;
                        }
                    }
                    break;
                }
                v25 = v20.withLocation(v22);
                v26 /* !! */  = lu.pn;
                if (true) ** GOTO lbl148
                block159: while (true) {
                    v26 /* !! */  = (long)(v27 - lu.iehs("ifio", iehy(int ), (int)54));
lbl148:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -684483811: {
                            v27 = lu.iehs("ifip", iehy(int ), (int)55);
                            continue block159;
                        }
                        case -45759476: {
                            break block159;
                        }
                        case 343911771: {
                            v27 = lu.iehs("ifiq", iehy(int ), (int)56);
                            continue block159;
                        }
                    }
                    break;
                }
                v28 = class_2960.method_60655((String)"phobia", (String)"3d/lightning3d_vertex");
                v29 /* !! */  = lu.pn;
                if (true) ** GOTO lbl162
                block160: while (true) {
                    v29 /* !! */  = (long)(lu.iehs("ifit", iehy(int ), (int)58) - lu.iehs("ifis", iehy(int ), (int)57));
lbl162:
                    // 2 sources

                    switch ((int)v29 /* !! */ ) {
                        case -45759476: {
                            break block160;
                        }
                        case 918528086: {
                            continue block160;
                        }
                    }
                    break;
                }
                v30 = v25.withVertexShader(v28);
                v31 /* !! */  = lu.pn;
                if (true) ** GOTO lbl172
                block161: while (true) {
                    v31 /* !! */  = (long)(v32 - lu.iehs("ifiv", iehy(int ), (int)59));
lbl172:
                    // 2 sources

                    switch ((int)v31 /* !! */ ) {
                        case -533248411: {
                            v32 = lu.iehs("ifiw", iehy(int ), (int)60);
                            continue block161;
                        }
                        case -45759476: {
                            break block161;
                        }
                        case 1334421548: {
                            v32 = lu.iehs("ifiy", iehy(int ), (int)61);
                            continue block161;
                        }
                    }
                    break;
                }
                v33 = class_2960.method_60655((String)"phobia", (String)"3d/lightning3d_fragment");
                v34 /* !! */  = lu.pn;
                if (true) ** GOTO lbl186
                block162: while (true) {
                    v34 /* !! */  = (long)(v35 - lu.iehs("ifiz", iehy(int ), (int)62));
lbl186:
                    // 2 sources

                    switch ((int)v34 /* !! */ ) {
                        case -1626720475: {
                            v35 = lu.iehs("ifja", iehy(int ), (int)63);
                            continue block162;
                        }
                        case -45759476: {
                            break block162;
                        }
                        case 844211495: {
                            v35 = lu.iehs("ifjb", iehy(int ), (int)64);
                            continue block162;
                        }
                    }
                    break;
                }
                v36 = v30.withFragmentShader(v33);
                v37 /* !! */  = lu.pn;
                if (true) ** GOTO lbl200
                block163: while (true) {
                    v37 /* !! */  = (long)(v38 - lu.iehs("ifjc", iehy(int ), (int)65));
lbl200:
                    // 2 sources

                    switch ((int)v37 /* !! */ ) {
                        case -45759476: {
                            break block163;
                        }
                        case 216395062: {
                            v38 = lu.iehs("ifjd", iehy(int ), (int)66);
                            continue block163;
                        }
                        case 1048407594: {
                            v38 = lu.iehs("ifje", iehy(int ), (int)67);
                            continue block163;
                        }
                        case 1935332658: {
                            v38 = lu.iehs("ifjf", iehy(int ), (int)68);
                            continue block163;
                        }
                    }
                    break;
                }
                v39 /* !! */  = lu.pn;
                if (true) ** GOTO lbl216
                block164: while (true) {
                    v39 /* !! */  = (long)(v40 - lu.iehs("ifjg", iehy(int ), (int)69));
lbl216:
                    // 2 sources

                    switch ((int)v39 /* !! */ ) {
                        case -2068866682: {
                            v40 = lu.iehs("ifjh", iehy(int ), (int)70);
                            continue block164;
                        }
                        case -2024388603: {
                            v40 = lu.iehs("ifji", iehy(int ), (int)71);
                            continue block164;
                        }
                        case -654722782: {
                            v40 = lu.iehs("ifjk", iehy(int ), (int)72);
                            continue block164;
                        }
                        case -45759476: {
                            break block164;
                        }
                    }
                    break;
                }
                v41 = v36.withVertexFormat(var0_3, VertexFormat.class_5596.field_27379);
                v42 /* !! */  = lu.pn;
                if (true) ** GOTO lbl233
                block165: while (true) {
                    v42 /* !! */  = (long)(lu.iehs("ifjn", iehy(int ), (int)74) - lu.iehs("ifjl", iehy(int ), (int)73));
lbl233:
                    // 2 sources

                    switch ((int)v42 /* !! */ ) {
                        case -1390729233: {
                            continue block165;
                        }
                        case -45759476: {
                            break block165;
                        }
                    }
                    break;
                }
                v43 /* !! */  = lu.pn;
                if (true) ** GOTO lbl242
                block166: while (true) {
                    v43 /* !! */  = (long)(lu.iehs("ifjr", iehy(int ), (int)76) - lu.iehs("ifjp", iehy(int ), (int)75));
lbl242:
                    // 2 sources

                    switch ((int)v43 /* !! */ ) {
                        case -1751794077: {
                            continue block166;
                        }
                        case -45759476: {
                            break block166;
                        }
                    }
                    break;
                }
                v44 = v41.withUniform("Uniforms", class_10789.field_60031);
                while (true) {
                    if ((v45 /* !! */  = (cfr_temp_10 = lu.pn - lu.iehs("ifjs", iehy(int ), (int)77)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v45 /* !! */  == lu.iehs("ifjt", ieho(int ), (int)241)) break;
                    v45 /* !! */  = (long)lu.iehs("ifjv", ieho(int ), (int)242);
                }
                v46 /* !! */  = lu.pn;
                if (true) ** GOTO lbl257
                block168: while (true) {
                    v46 /* !! */  = (long)(v47 - lu.iehs("ifjw", iehy(int ), (int)78));
lbl257:
                    // 2 sources

                    switch ((int)v46 /* !! */ ) {
                        case -413843893: {
                            v47 = lu.iehs("ifjy", iehy(int ), (int)79);
                            continue block168;
                        }
                        case -45759476: {
                            break block168;
                        }
                        case 809688967: {
                            v47 = lu.iehs("ifjz", iehy(int ), (int)80);
                            continue block168;
                        }
                        case 1849621106: {
                            v47 = lu.iehs("ifkb", iehy(int ), (int)81);
                            continue block168;
                        }
                    }
                    break;
                }
                v48 = v44.withBlend(BlendFunction.ADDITIVE);
                v49 /* !! */  = lu.pn;
                if (true) ** GOTO lbl274
                block169: while (true) {
                    v49 /* !! */  = (long)(lu.iehs("ifkh", iehy(int ), (int)83) - lu.iehs("ifkf", iehy(int ), (int)82));
lbl274:
                    // 2 sources

                    switch ((int)v49 /* !! */ ) {
                        case -839834747: {
                            continue block169;
                        }
                        case -45759476: {
                            break block169;
                        }
                    }
                    break;
                }
                v50 /* !! */  = lu.pn;
                if (true) ** GOTO lbl283
                block170: while (true) {
                    v50 /* !! */  = (long)(v51 - lu.iehs("ifkj", iehy(int ), (int)84));
lbl283:
                    // 2 sources

                    switch ((int)v50 /* !! */ ) {
                        case -1887607027: {
                            v51 = lu.iehs("ifkk", iehy(int ), (int)85);
                            continue block170;
                        }
                        case -744498478: {
                            v51 = lu.iehs("ifkl", iehy(int ), (int)86);
                            continue block170;
                        }
                        case -427865800: {
                            v51 = lu.iehs("ifko", iehy(int ), (int)87);
                            continue block170;
                        }
                        case -45759476: {
                            break block170;
                        }
                    }
                    break;
                }
                v52 = v48.withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST);
                v53 = lu.iehs("ifkp", ieho(int ), (int)243);
                v54 /* !! */  = lu.pn;
                if (true) ** GOTO lbl301
                block171: while (true) {
                    v54 /* !! */  = (long)(v55 - lu.iehs("ifkr", iehy(int ), (int)88));
lbl301:
                    // 2 sources

                    switch ((int)v54 /* !! */ ) {
                        case -1629632782: {
                            v55 = lu.iehs("ifks", iehy(int ), (int)89);
                            continue block171;
                        }
                        case -45759476: {
                            break block171;
                        }
                        case -25753660: {
                            v55 = lu.iehs("ifku", iehy(int ), (int)90);
                            continue block171;
                        }
                        case 1903896755: {
                            v55 = lu.iehs("ifkv", iehy(int ), (int)91);
                            continue block171;
                        }
                    }
                    break;
                }
                v56 = v52.withCull((boolean)v53);
                v57 = lu.iehs("ifkw", ieho(int ), (int)244);
                v58 /* !! */  = lu.pn;
                if (true) ** GOTO lbl319
                block172: while (true) {
                    v58 /* !! */  = (long)(v59 - lu.iehs("ifkx", iehy(int ), (int)92));
lbl319:
                    // 2 sources

                    switch ((int)v58 /* !! */ ) {
                        case -403707040: {
                            v59 = lu.iehs("ifky", iehy(int ), (int)93);
                            continue block172;
                        }
                        case -45759476: {
                            break block172;
                        }
                        case 25560574: {
                            v59 = lu.iehs("ifla", iehy(int ), (int)94);
                            continue block172;
                        }
                    }
                    break;
                }
                v60 = v56.withDepthWrite((boolean)v57);
                v61 /* !! */  = lu.pn;
                if (true) ** GOTO lbl333
                block173: while (true) {
                    v61 /* !! */  = (long)(v62 - lu.iehs("iflb", iehy(int ), (int)95));
lbl333:
                    // 2 sources

                    switch ((int)v61 /* !! */ ) {
                        case -191550139: {
                            v62 = lu.iehs("iflc", iehy(int ), (int)96);
                            continue block173;
                        }
                        case -45759476: {
                            break block173;
                        }
                        case 337484978: {
                            v62 = lu.iehs("ifld", iehy(int ), (int)97);
                            continue block173;
                        }
                        case 1927164732: {
                            v62 = lu.iehs("ifle", iehy(int ), (int)98);
                            continue block173;
                        }
                    }
                    break;
                }
                v63 = v60.build();
                v64 /* !! */  = lu.pn;
                if (true) ** GOTO lbl350
                block174: while (true) {
                    v64 /* !! */  = (long)(v65 - lu.iehs("iflf", iehy(int ), (int)99));
lbl350:
                    // 2 sources

                    switch ((int)v64 /* !! */ ) {
                        case -45759476: {
                            break block174;
                        }
                        case 9436748: {
                            v65 = lu.iehs("iflg", iehy(int ), (int)100);
                            continue block174;
                        }
                        case 868939531: {
                            v65 = lu.iehs("ifli", iehy(int ), (int)101);
                            continue block174;
                        }
                    }
                    break;
                }
                lu.pipeline = v63;
                if (var1_2 || var1_2) ** GOTO lbl21
                v66 /* !! */  = lu.pn;
                if (true) ** GOTO lbl365
                block175: while (true) {
                    v66 /* !! */  = (long)(v67 - lu.iehs("ifll", iehy(int ), (int)102));
lbl365:
                    // 2 sources

                    switch ((int)v66 /* !! */ ) {
                        case -935165013: {
                            v67 = lu.iehs("ifln", iehy(int ), (int)103);
                            continue block175;
                        }
                        case -868108421: {
                            v67 = lu.iehs("iflp", iehy(int ), (int)104);
                            continue block175;
                        }
                        case -321883912: {
                            v67 = lu.iehs("iflr", iehy(int ), (int)105);
                            continue block175;
                        }
                        case -45759476: {
                            break block175;
                        }
                    }
                    break;
                }
                v68 = RenderSystem.getDevice();
                v69 /* !! */  = lu.pn;
                if (true) ** GOTO lbl382
                block176: while (true) {
                    v69 /* !! */  = (long)(v70 - lu.iehs("iflv", iehy(int ), (int)106));
lbl382:
                    // 2 sources

                    switch ((int)v69 /* !! */ ) {
                        case -45759476: {
                            break block176;
                        }
                        case 181250200: {
                            v70 = lu.iehs("ifmf", iehy(int ), (int)107);
                            continue block176;
                        }
                        case 1361903334: {
                            v70 = lu.iehs("ifmj", iehy(int ), (int)108);
                            continue block176;
                        }
                        case 1663056507: {
                            v70 = lu.iehs("ifml", iehy(int ), (int)109);
                            continue block176;
                        }
                    }
                    break;
                }
                v71 = (Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$init$1(), ()Ljava/lang/String;)();
                v72 = lu.iehs("ifmo", ieho(int ), (int)245);
                v73 = lu.iehs("ifmq", iehy(int ), (int)110);
                v74 /* !! */  = lu.pn;
                if (true) ** GOTO lbl401
                block177: while (true) {
                    v74 /* !! */  = (long)(v75 - lu.iehs("ifmr", iehy(int ), (int)111));
lbl401:
                    // 2 sources

                    switch ((int)v74 /* !! */ ) {
                        case -1827682952: {
                            v75 = lu.iehs("ifmt", iehy(int ), (int)112);
                            continue block177;
                        }
                        case -45759476: {
                            break block177;
                        }
                        case 1262358532: {
                            v75 = lu.iehs("ifmv", iehy(int ), (int)113);
                            continue block177;
                        }
                    }
                    break;
                }
                v76 = v68.createBuffer(v71, (int)v72, (long)v73);
                while (true) {
                    if ((v77 /* !! */  = (cfr_temp_11 = lu.pn - lu.iehs("ifmx", iehy(int ), (int)114)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v77 /* !! */  == lu.iehs("ifnb", ieho(int ), (int)246)) break;
                    v77 /* !! */  = (long)lu.iehs("ifnf", ieho(int ), (int)247);
                }
                lu.uniformBuffer = v76;
                if (var1_2 || var1_2) ** GOTO lbl21
                v78 /* !! */  = lu.pn;
                if (true) ** GOTO lbl422
                block179: while (true) {
                    v78 /* !! */  = (long)(v79 - lu.iehs("ifni", iehy(int ), (int)115));
lbl422:
                    // 2 sources

                    switch ((int)v78 /* !! */ ) {
                        case -45759476: {
                            break block179;
                        }
                        case 50573964: {
                            v79 = lu.iehs("ifnk", iehy(int ), (int)116);
                            continue block179;
                        }
                        case 1479855032: {
                            v79 = lu.iehs("ifnm", iehy(int ), (int)117);
                            continue block179;
                        }
                    }
                    break;
                }
                v80 = RenderSystem.getDevice();
                while (true) {
                    if ((v81 /* !! */  = (cfr_temp_12 = lu.pn - lu.iehs("ifno", iehy(int ), (int)118)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v81 /* !! */  == lu.iehs("ifnq", ieho(int ), (int)248)) break;
                    v81 /* !! */  = (long)lu.iehs("ifnr", ieho(int ), (int)249);
                }
                v82 = (Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$init$2(), ()Ljava/lang/String;)();
                v83 = lu.iehs("ifnt", ieho(int ), (int)250);
                v84 = lu.iehs("ifnu", iehy(int ), (int)119);
                while (true) {
                    if ((v85 /* !! */  = (cfr_temp_13 = lu.pn - lu.iehs("ifnw", iehy(int ), (int)120)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v85 /* !! */  == lu.iehs("ifny", ieho(int ), (int)251)) break;
                    v85 /* !! */  = (long)lu.iehs("ifnz", ieho(int ), (int)252);
                }
                v86 = v80.createBuffer(v82, (int)v83, (long)v84);
                while (true) {
                    if ((v87 /* !! */  = (cfr_temp_14 = lu.pn - lu.iehs("ifoa", iehy(int ), (int)121)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                    if (v87 /* !! */  == lu.iehs("ifoc", ieho(int ), (int)253)) break;
                    v87 /* !! */  = (long)lu.iehs("ifoe", ieho(int ), (int)254);
                }
                lu.vertexBuffer = v86;
                if (!var1_2 && !var1_2) ** break;
                ** continue;
                return;
            }
lbl455:
            // 2 sources

            case 0: {
                var2_1 /* !! */  = (int)lu.iehs("ifog", ieho(int ), (int)255);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl465
            }
lbl460:
            // 2 sources

            case 1: {
                var2_1 /* !! */  = (int)lu.iehs("ifoi", ieho(int ), (int)256);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl488
            }
lbl465:
            // 3 sources

            case 2: {
                var2_1 /* !! */  = (int)lu.iehs("ifok", ieho(int ), (int)257);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl479
            }
lbl470:
            // 2 sources

            case 3: {
                var2_1 /* !! */  = (int)lu.iehs("ifom", ieho(int ), (int)258);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl514
            }
lbl475:
            // 2 sources

            case 4: {
                var2_1 /* !! */  = (int)lu.iehs("ifoo", ieho(int ), (int)259);
                if (!var3) break;
                throw null;
            }
lbl479:
            // 2 sources

            case 5: {
                var2_1 /* !! */  = (int)lu.iehs("ifoq", ieho(int ), (int)260);
                if (!var3) ** GOTO lbl465
                throw null;
            }
            case 6: {
                var2_1 /* !! */  = (int)lu.iehs("ifos", ieho(int ), (int)261);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl514
            }
lbl488:
            // 2 sources

            case 7: {
                var2_1 /* !! */  = (int)lu.iehs("ifou", ieho(int ), (int)262);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl501
            }
            case 8: {
                var2_1 /* !! */  = (int)lu.iehs("ifow", ieho(int ), (int)263);
                if (!var3) ** GOTO lbl475
                throw null;
            }
            case 9: {
                var2_1 /* !! */  = (int)lu.iehs("ifoy", ieho(int ), (int)264);
                if (!var3) ** GOTO lbl455
                throw null;
            }
lbl501:
            // 2 sources

            case 10: {
                var2_1 /* !! */  = (int)lu.iehs("ifpa", ieho(int ), (int)265);
                if (var3) {
                    throw null;
                }
            }
            case 11: {
                var2_1 /* !! */  = (int)lu.iehs("ifpc", ieho(int ), (int)266);
                if (!var3) ** GOTO lbl470
                throw null;
            }
            case 12: {
                var2_1 /* !! */  = (int)lu.iehs("ifpe", ieho(int ), (int)267);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl518
            }
lbl514:
            // 3 sources

            case 13: {
                var2_1 /* !! */  = (int)lu.iehs("ifpg", ieho(int ), (int)268);
                if (!var3) ** GOTO lbl460
                throw null;
            }
lbl518:
            // 2 sources

            case 14: {
                do {
                    var2_1 /* !! */  = (int)lu.iehs("ifpi", ieho(int ), (int)269);
                } while (!var3);
                throw null;
            }
            case 15: 
        }
        do {
            var2_1 /* !! */  = (int)lu.iehs("ifpk", ieho(int ), (int)270);
        } while (!var3);
        throw null;
    }

    private static /* synthetic */ void igdb() {
        lu.iehr[100] = 1143007048;
        lu.iehr[101] = -1552258637;
        lu.iehr[102] = -1818075142;
        lu.iehr[103] = -1414435177;
        lu.iehr[104] = 820006751;
        lu.iehr[105] = 1959953951;
        lu.iehr[106] = 771078780;
        lu.iehr[107] = 1229126562;
        lu.iehr[108] = -1307688188;
        lu.iehr[109] = 1315163801;
        lu.iehr[110] = -277730533;
        lu.iehr[111] = 1899735099;
        lu.iehr[112] = -938116498;
        lu.iehr[113] = 1703986841;
        lu.iehr[114] = -1751320710;
        lu.iehr[115] = -2023392770;
        lu.iehr[116] = -1637784004;
        lu.iehr[117] = -830909796;
        lu.iehr[118] = -1680669269;
        lu.iehr[119] = -1787191344;
        lu.iehr[120] = 2032838552;
        lu.iehr[121] = 1764374400;
        lu.iehr[122] = 173509367;
        lu.iehr[123] = 1041560411;
        lu.iehr[124] = -1026529639;
        lu.iehr[125] = 812956433;
        lu.iehr[126] = 920150750;
        lu.iehr[127] = -957440587;
        lu.iehr[128] = 1795566313;
        lu.iehr[129] = -532203037;
        lu.iehr[130] = 473059932;
        lu.iehr[131] = 143119202;
        lu.iehr[132] = -1267459417;
        lu.iehr[133] = 764986977;
        lu.iehr[134] = -618677395;
        lu.iehr[135] = 1233574780;
        lu.iehr[136] = 518112142;
        lu.iehr[137] = -1870191322;
        lu.iehr[138] = 790660307;
        lu.iehr[139] = 6215216;
        lu.iehr[140] = 585224790;
        lu.iehr[141] = 996653707;
        lu.iehr[142] = 848443926;
        lu.iehr[143] = -100075924;
        lu.iehr[144] = 1651989594;
        lu.iehr[145] = 1820409216;
        lu.iehr[146] = -1260673076;
        lu.iehr[147] = 1068180182;
        lu.iehr[148] = 512991098;
        lu.iehr[149] = 221070239;
        lu.iehr[150] = -1711310822;
        lu.iehr[151] = 1112748543;
        lu.iehr[152] = -1512743870;
        lu.iehr[153] = 360577662;
        lu.iehr[154] = -568487046;
        lu.iehr[155] = -1028835880;
        lu.iehr[156] = -337564085;
        lu.iehr[157] = -1871338940;
        lu.iehr[158] = -1851569730;
        lu.iehr[159] = -1106343324;
        lu.iehr[160] = 205293281;
        lu.iehr[161] = 1470274942;
        lu.iehr[162] = 1617332052;
        lu.iehr[163] = 2039913391;
        lu.iehr[164] = -1911869978;
        lu.iehr[165] = -1228133837;
        lu.iehr[166] = 1726520010;
        lu.iehr[167] = -624847106;
        lu.iehr[168] = 1504275701;
        lu.iehr[169] = 2122913845;
        lu.iehr[170] = 1908493972;
        lu.iehr[171] = 1507359559;
        lu.iehr[172] = 1679509706;
        lu.iehr[173] = -1873080135;
        lu.iehr[174] = 2080070413;
        lu.iehr[175] = 1902984419;
        lu.iehr[176] = -1326748448;
        lu.iehr[177] = 1702773545;
        lu.iehr[178] = -701008709;
        lu.iehr[179] = -439816063;
        lu.iehr[180] = -409293477;
        lu.iehr[181] = 1413909305;
        lu.iehr[182] = -772048169;
        lu.iehr[183] = 857551197;
        lu.iehr[184] = -261405912;
        lu.iehr[185] = -1814010824;
        lu.iehr[186] = -555251189;
        lu.iehr[187] = -257345870;
        lu.iehr[188] = -614390174;
        lu.iehr[189] = -186827352;
        lu.iehr[190] = -2099054723;
        lu.iehr[191] = -988394387;
        lu.iehr[192] = 1577265911;
        lu.iehr[193] = -1957165808;
        lu.iehr[194] = -2031126517;
        lu.iehr[195] = 1549181730;
        lu.iehr[196] = -16858229;
        lu.iehr[197] = -956827377;
        lu.iehr[198] = -1468991528;
        lu.iehr[199] = -1802720445;
    }

    private static /* synthetic */ void igcx() {
        lu.iehq[100] = 1143006999;
        lu.iehq[101] = -1552258576;
        lu.iehq[102] = -1818075261;
        lu.iehq[103] = -1414435111;
        lu.iehq[104] = 820006781;
        lu.iehq[105] = 1959954044;
        lu.iehq[106] = 771078687;
        lu.iehq[107] = 1229126642;
        lu.iehq[108] = -1307688165;
        lu.iehq[109] = 1315163834;
        lu.iehq[110] = -277730443;
        lu.iehq[111] = 1899735077;
        lu.iehq[112] = -938116507;
        lu.iehq[113] = 1703986929;
        lu.iehq[114] = -1751320794;
        lu.iehq[115] = -2023392809;
        lu.iehq[116] = -1637784043;
        lu.iehq[117] = -830909731;
        lu.iehq[118] = -1680669209;
        lu.iehq[119] = -1787191340;
        lu.iehq[120] = 2032838563;
        lu.iehq[121] = 1764374445;
        lu.iehq[122] = 173509373;
        lu.iehq[123] = 1041560412;
        lu.iehq[124] = -1026529615;
        lu.iehq[125] = 812956454;
        lu.iehq[126] = 920150704;
        lu.iehq[127] = -957440631;
        lu.iehq[128] = 1795566249;
        lu.iehq[129] = -532203066;
        lu.iehq[130] = 473059965;
        lu.iehq[131] = 143119211;
        lu.iehq[132] = -1267459418;
        lu.iehq[133] = 764986901;
        lu.iehq[134] = -618677486;
        lu.iehq[135] = 1233574693;
        lu.iehq[136] = 518112168;
        lu.iehq[137] = -1870191278;
        lu.iehq[138] = 790660271;
        lu.iehq[139] = 6215232;
        lu.iehq[140] = 585224732;
        lu.iehq[141] = 996653756;
        lu.iehq[142] = 848444023;
        lu.iehq[143] = -100076025;
        lu.iehq[144] = 1651989621;
        lu.iehq[145] = 1820409310;
        lu.iehq[146] = -1260673121;
        lu.iehq[147] = 1068180136;
        lu.iehq[148] = 512991036;
        lu.iehq[149] = 221070288;
        lu.iehq[150] = -1711310832;
        lu.iehq[151] = 1112748539;
        lu.iehq[152] = -1512743851;
        lu.iehq[153] = 360577573;
        lu.iehq[154] = -568487091;
        lu.iehq[155] = -1028835911;
        lu.iehq[156] = -337564103;
        lu.iehq[157] = -1871338916;
        lu.iehq[158] = -1851569775;
        lu.iehq[159] = -1106343411;
        lu.iehq[160] = 205293226;
        lu.iehq[161] = 1470274884;
        lu.iehq[162] = 1617332078;
        lu.iehq[163] = 2039913381;
        lu.iehq[164] = -1911869964;
        lu.iehq[165] = -1228133860;
        lu.iehq[166] = 1726520024;
        lu.iehq[167] = -624847187;
        lu.iehq[168] = 1504275646;
        lu.iehq[169] = 2122913823;
        lu.iehq[170] = 1908494039;
        lu.iehq[171] = 1507359601;
        lu.iehq[172] = 1679509635;
        lu.iehq[173] = -1873080114;
        lu.iehq[174] = 2080070500;
        lu.iehq[175] = 1902984440;
        lu.iehq[176] = -1326748471;
        lu.iehq[177] = 1702773623;
        lu.iehq[178] = -701008756;
        lu.iehq[179] = -439815959;
        lu.iehq[180] = -409293468;
        lu.iehq[181] = 1413909374;
        lu.iehq[182] = -772048149;
        lu.iehq[183] = 857551137;
        lu.iehq[184] = -261405868;
        lu.iehq[185] = -1814010788;
        lu.iehq[186] = -555251111;
        lu.iehq[187] = -257345919;
        lu.iehq[188] = -614390201;
        lu.iehq[189] = -186827333;
        lu.iehq[190] = -2099054761;
        lu.iehq[191] = -988394457;
        lu.iehq[192] = 1577265911;
        lu.iehq[193] = -1957165793;
        lu.iehq[194] = -2031126493;
        lu.iehq[195] = 1549181736;
        lu.iehq[196] = -16858189;
        lu.iehq[197] = -956827315;
        lu.iehq[198] = -1468991580;
        lu.iehq[199] = -1802720437;
    }

    private static /* synthetic */ void igda() {
        lu.iehr[0] = -1945774435;
        lu.iehr[1] = -14757055;
        lu.iehr[2] = 365109800;
        lu.iehr[3] = 1806361012;
        lu.iehr[4] = -591730262;
        lu.iehr[5] = 1562717018;
        lu.iehr[6] = 1705972067;
        lu.iehr[7] = -945734090;
        lu.iehr[8] = -2068498011;
        lu.iehr[9] = -1957449966;
        lu.iehr[10] = -915668964;
        lu.iehr[11] = -1421474189;
        lu.iehr[12] = -459837785;
        lu.iehr[13] = 1449640376;
        lu.iehr[14] = -1122148098;
        lu.iehr[15] = -132311462;
        lu.iehr[16] = 729431888;
        lu.iehr[17] = 239670004;
        lu.iehr[18] = 1203652189;
        lu.iehr[19] = 1683145580;
        lu.iehr[20] = -1051893947;
        lu.iehr[21] = -2086951428;
        lu.iehr[22] = -208747228;
        lu.iehr[23] = 1591396509;
        lu.iehr[24] = -245469198;
        lu.iehr[25] = 541060193;
        lu.iehr[26] = 1246983514;
        lu.iehr[27] = -261474347;
        lu.iehr[28] = -1795177214;
        lu.iehr[29] = 2114840592;
        lu.iehr[30] = 398194267;
        lu.iehr[31] = -430925100;
        lu.iehr[32] = -1340473168;
        lu.iehr[33] = 739661535;
        lu.iehr[34] = 392699634;
        lu.iehr[35] = 192772991;
        lu.iehr[36] = 939681423;
        lu.iehr[37] = -1927557744;
        lu.iehr[38] = 1321849769;
        lu.iehr[39] = 2004277300;
        lu.iehr[40] = 435066723;
        lu.iehr[41] = -537479994;
        lu.iehr[42] = 2044012837;
        lu.iehr[43] = 133532884;
        lu.iehr[44] = 468912644;
        lu.iehr[45] = -692348383;
        lu.iehr[46] = -375856723;
        lu.iehr[47] = 1447517183;
        lu.iehr[48] = -676216;
        lu.iehr[49] = 332201610;
        lu.iehr[50] = -777863443;
        lu.iehr[51] = 623630209;
        lu.iehr[52] = -1501225056;
        lu.iehr[53] = -1777650225;
        lu.iehr[54] = -810505226;
        lu.iehr[55] = -2035098613;
        lu.iehr[56] = 866584130;
        lu.iehr[57] = -446026895;
        lu.iehr[58] = -1044642936;
        lu.iehr[59] = -556100571;
        lu.iehr[60] = 1941345160;
        lu.iehr[61] = -44162884;
        lu.iehr[62] = -612600173;
        lu.iehr[63] = -1592379805;
        lu.iehr[64] = 211170519;
        lu.iehr[65] = 806205464;
        lu.iehr[66] = -1571531013;
        lu.iehr[67] = -1010437418;
        lu.iehr[68] = -435820989;
        lu.iehr[69] = -850861665;
        lu.iehr[70] = 1299204763;
        lu.iehr[71] = -1472478267;
        lu.iehr[72] = -987642062;
        lu.iehr[73] = -2108042056;
        lu.iehr[74] = 938927431;
        lu.iehr[75] = -1486759179;
        lu.iehr[76] = 1843106634;
        lu.iehr[77] = 675735549;
        lu.iehr[78] = 1635764051;
        lu.iehr[79] = 2141380392;
        lu.iehr[80] = 1619316499;
        lu.iehr[81] = 1372328716;
        lu.iehr[82] = 1311070331;
        lu.iehr[83] = 64125008;
        lu.iehr[84] = 1548259609;
        lu.iehr[85] = -236872119;
        lu.iehr[86] = 1261415361;
        lu.iehr[87] = 1183959722;
        lu.iehr[88] = -1781124062;
        lu.iehr[89] = 395135702;
        lu.iehr[90] = 1578386490;
        lu.iehr[91] = -1162353518;
        lu.iehr[92] = -679946812;
        lu.iehr[93] = 667883815;
        lu.iehr[94] = 287283733;
        lu.iehr[95] = -1129252552;
        lu.iehr[96] = -1018098425;
        lu.iehr[97] = -2122619690;
        lu.iehr[98] = -1413256228;
        lu.iehr[99] = -880143724;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private lu() {
        block7: {
            var2_1 /* !! */  = lu.b;
            super();
            if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            do {
                switch (cfr_temp_0 == -2147483648 ? var2_1 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        return;
                    }
                    case 0: {
                        ** break;
                    }
                    case 2: {
                        break block7;
                    }
lbl13:
                    // 2 sources

                    while (true) {
                        cfr_temp_0 = 1;
                        var2_1 /* !! */  = (int)lu.iehs("ieht", ieho(int ), (int)0);
                        break;
                    }
                    case 1: 
                }
                break;
            } while (true);
            var2_1 /* !! */  = (int)lu.iehs("iehv", ieho(int ), (int)1);
        }
        var2_1 /* !! */  = (int)lu.iehs("iehw", ieho(int ), (int)2);
        ** while (true)
    }

    private static /* synthetic */ double ieon(int n2) {
        return Double.longBitsToDouble(iehz[n2] ^ ieia[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void segment(class_243 var0, class_243 var1_1, float var2_2, int var3_3, float var4_4) {
        var7_5 = lu.c;
        var6_6 /* !! */  = lu.b;
        var5_7 = lu.a;
        if (!var7_5) ** GOTO lbl10
        throw null;
        {
            if (var6_6 /* !! */  == 0) ** GOTO lbl-1000
            switch (var6_6 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl10:
                // 1 sources

                if (var5_7 || var5_7) continue block34;
                if (lu.segmentCount >= lu.iehs("ielp", ieho(int ), (int)34)) ** GOTO lbl-1000
                if (var5_7) continue block34;
                if (!(var2_2 <= 0.0f)) {
                    if (var5_7) continue block34;
                    if (var4_4 <= lu.iehs("ielu", ielr(int ), (int)35)) {
                        if (var5_7) continue block34;
                    }
                } else lbl-1000:
                // 3 sources

                {
                    if (var5_7 || var5_7) continue block34;
                    return;
                }
                if (var5_7 || var5_7) continue block34;
                lu.fromX[lu.segmentCount] = var0.field_1352;
                if (var5_7 || var5_7) continue block34;
                lu.fromY[lu.segmentCount] = var0.field_1351;
                if (var5_7 || var5_7) continue block34;
                lu.fromZ[lu.segmentCount] = var0.field_1350;
                if (var5_7 || var5_7) continue block34;
                lu.toX[lu.segmentCount] = var1_1.field_1352;
                if (var5_7 || var5_7) continue block34;
                lu.toY[lu.segmentCount] = var1_1.field_1351;
                if (var5_7 || var5_7) continue block34;
                lu.toZ[lu.segmentCount] = var1_1.field_1350;
                if (var5_7 || var5_7) continue block34;
                lu.widths[lu.segmentCount] = var2_2;
                if (var5_7 || var5_7) continue block34;
                lu.colors[lu.segmentCount] = var3_3;
                if (var5_7 || var5_7) continue block34;
                lu.alphas[lu.segmentCount] = Math.min(1.0f, var4_4);
                if (var5_7 || var5_7) continue block34;
                lu.segmentCount += lu.iehs("iema", ieho(int ), (int)36);
                if (!var5_7 && !var5_7) ** break;
                continue block34;
                return;
                case 0: {
                    var6_6 /* !! */  = (int)lu.iehs("iemc", ieho(int ), (int)37);
                    if (var7_5) {
                        throw null;
                    }
                    ** GOTO lbl53
                }
lbl48:
                // 3 sources

                case 1: {
                    var6_6 /* !! */  = (int)lu.iehs("iemd", ieho(int ), (int)38);
                    if (var7_5) {
                        throw null;
                    }
                    ** GOTO lbl105
                }
lbl53:
                // 2 sources

                case 2: {
                    var6_6 /* !! */  = (int)lu.iehs("ieme", ieho(int ), (int)39);
                    if (var7_5) {
                        throw null;
                    }
                    ** GOTO lbl172
                }
                case 3: {
                    var6_6 /* !! */  = (int)lu.iehs("iemg", ieho(int ), (int)40);
                    if (var7_5) {
                        throw null;
                    }
                    ** GOTO lbl146
                }
                case 4: {
                    var6_6 /* !! */  = (int)lu.iehs("iemh", ieho(int ), (int)41);
                    if (var7_5) {
                        throw null;
                    }
                    ** GOTO lbl128
                }
lbl68:
                // 2 sources

                case 5: {
                    var6_6 /* !! */  = (int)lu.iehs("iemj", ieho(int ), (int)42);
                    if (var7_5) {
                        throw null;
                    }
                    ** GOTO lbl172
                }
                case 6: {
                    var6_6 /* !! */  = (int)lu.iehs("iemk", ieho(int ), (int)43);
                    if (!var7_5) ** GOTO lbl68
                    throw null;
                }
lbl77:
                // 2 sources

                case 7: {
                    var6_6 /* !! */  = (int)lu.iehs("iemm", ieho(int ), (int)44);
                    if (var7_5) {
                        throw null;
                    }
                    ** GOTO lbl136
                }
lbl82:
                // 2 sources

                case 8: {
                    var6_6 /* !! */  = (int)lu.iehs("iemo", ieho(int ), (int)45);
                    if (var7_5) {
                        throw null;
                    }
                    ** GOTO lbl150
                }
lbl87:
                // 3 sources

                case 9: {
                    var6_6 /* !! */  = (int)lu.iehs("iemq", ieho(int ), (int)46);
                    if (var7_5) {
                        throw null;
                    }
                }
                case 10: {
                    var6_6 /* !! */  = (int)lu.iehs("iems", ieho(int ), (int)47);
                    if (var7_5) {
                        throw null;
                    }
                    ** GOTO lbl168
                }
                case 11: {
                    var6_6 /* !! */  = (int)lu.iehs("iemu", ieho(int ), (int)48);
                    if (!var7_5) ** GOTO lbl77
                    throw null;
                }
                case 12: {
                    var6_6 /* !! */  = (int)lu.iehs("iemv", ieho(int ), (int)49);
                    if (var7_5) {
                        throw null;
                    }
                    ** GOTO lbl176
                }
lbl105:
                // 2 sources

                case 13: {
                    var6_6 /* !! */  = (int)lu.iehs("iemx", ieho(int ), (int)50);
                    if (var7_5) {
                        throw null;
                    }
                    ** GOTO lbl164
                }
lbl110:
                // 2 sources

                case 14: {
                    var6_6 /* !! */  = (int)lu.iehs("iemz", ieho(int ), (int)51);
                    if (var7_5) {
                        throw null;
                    }
                    ** GOTO lbl119
                }
                case 15: {
                    var6_6 /* !! */  = (int)lu.iehs("iena", ieho(int ), (int)52);
                    if (!var7_5) ** GOTO lbl87
                    throw null;
                }
lbl119:
                // 2 sources

                case 16: {
                    var6_6 /* !! */  = (int)lu.iehs("ienc", ieho(int ), (int)53);
                    if (var7_5) {
                        throw null;
                    }
                    ** GOTO lbl172
                }
                case 17: {
                    var6_6 /* !! */  = (int)lu.iehs("iene", ieho(int ), (int)54);
                    if (var7_5) {
                        throw null;
                    }
                }
lbl128:
                // 5 sources

                case 18: {
                    var6_6 /* !! */  = (int)lu.iehs("ienf", ieho(int ), (int)55);
                    if (!var7_5) ** GOTO lbl48
                    throw null;
                }
                case 19: {
                    var6_6 /* !! */  = (int)lu.iehs("ienh", ieho(int ), (int)56);
                    if (!var7_5) ** GOTO lbl82
                    throw null;
                }
lbl136:
                // 2 sources

                case 20: {
                    var6_6 /* !! */  = (int)lu.iehs("ieni", ieho(int ), (int)57);
                    if (var7_5) {
                        throw null;
                    }
                    ** GOTO lbl172
                }
lbl141:
                // 2 sources

                case 21: {
                    var6_6 /* !! */  = (int)lu.iehs("ienk", ieho(int ), (int)58);
                    if (var7_5) {
                        throw null;
                    }
                    ** GOTO lbl176
                }
lbl146:
                // 2 sources

                case 22: {
                    var6_6 /* !! */  = (int)lu.iehs("ienl", ieho(int ), (int)59);
                    if (!var7_5) ** GOTO lbl110
                    throw null;
                }
lbl150:
                // 2 sources

                case 23: {
                    var6_6 /* !! */  = (int)lu.iehs("ienn", ieho(int ), (int)60);
                    if (var7_5) {
                        throw null;
                    }
                    ** GOTO lbl172
                }
                case 24: {
                    var6_6 /* !! */  = (int)lu.iehs("ienq", ieho(int ), (int)61);
                    if (var7_5) {
                        throw null;
                    }
                    ** GOTO lbl172
                }
                case 25: {
                    var6_6 /* !! */  = (int)lu.iehs("ienr", ieho(int ), (int)62);
                    if (!var7_5) ** GOTO lbl128
                    throw null;
                }
lbl164:
                // 2 sources

                case 26: {
                    var6_6 /* !! */  = (int)lu.iehs("iens", ieho(int ), (int)63);
                    if (!var7_5) ** GOTO lbl48
                    throw null;
                }
lbl168:
                // 2 sources

                case 27: {
                    var6_6 /* !! */  = (int)lu.iehs("ient", ieho(int ), (int)64);
                    if (!var7_5) ** GOTO lbl141
                    throw null;
                }
lbl172:
                // 7 sources

                case 28: {
                    var6_6 /* !! */  = (int)lu.iehs("ienv", ieho(int ), (int)65);
                    if (!var7_5) break block34;
                    throw null;
                }
lbl176:
                // 3 sources

                case 29: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var6_6 /* !! */  = (int)lu.iehs("ienw", ieho(int ), (int)66);
                        if (!var7_5) ** GOTO lbl87
                        throw null;
                    }
                }
                case 30: {
                    do {
                        var6_6 /* !! */  = (int)lu.iehs("ienx", ieho(int ), (int)67);
                    } while (!var7_5);
                    throw null;
                }
                case 31: 
            }
        }
        var6_6 /* !! */  = (int)lu.iehs("ienz", ieho(int ), (int)68);
        ** while (!var7_5)
lbl189:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite iehs(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void igde() {
        lu.iehz[0] = 6472992094996471869L;
        lu.iehz[1] = -5768949428571817766L;
        lu.iehz[2] = -7670619337195024615L;
        lu.iehz[3] = 8589487712333432947L;
        lu.iehz[4] = 1757403210088574587L;
        lu.iehz[5] = -3735515235069579771L;
        lu.iehz[6] = 6112923944457223051L;
        lu.iehz[7] = -2864616667503258280L;
        lu.iehz[8] = -4388902205871980962L;
        lu.iehz[9] = 970413856325685358L;
        lu.iehz[10] = 3577834310968505820L;
        lu.iehz[11] = -8749325807379693332L;
        lu.iehz[12] = -8397948994922214535L;
        lu.iehz[13] = -5931689359767563288L;
        lu.iehz[14] = -6326111127828091663L;
        lu.iehz[15] = -3242139519462204568L;
        lu.iehz[16] = 7171849773410040973L;
        lu.iehz[17] = -588349811052677514L;
        lu.iehz[18] = -745206389256605080L;
        lu.iehz[19] = -5440576903115215397L;
        lu.iehz[20] = 8910858807420455201L;
        lu.iehz[21] = -1335186317231519210L;
        lu.iehz[22] = 3302153843588509607L;
        lu.iehz[23] = 4678514016107529304L;
        lu.iehz[24] = 7949885904367912389L;
        lu.iehz[25] = -1688826094580214465L;
        lu.iehz[26] = 7007904268228214255L;
        lu.iehz[27] = -2288200417466032600L;
        lu.iehz[28] = 2390442771384896453L;
        lu.iehz[29] = -2236574702885697024L;
        lu.iehz[30] = 6155668632932161213L;
        lu.iehz[31] = -1944883468946915150L;
        lu.iehz[32] = 7840090258689557816L;
        lu.iehz[33] = -7017335137792143836L;
        lu.iehz[34] = 3787760483416347603L;
        lu.iehz[35] = 1937476687818092743L;
        lu.iehz[36] = 9214443919732993843L;
        lu.iehz[37] = 1600146890788836543L;
        lu.iehz[38] = 6099612385768145315L;
        lu.iehz[39] = 1590674887916901185L;
        lu.iehz[40] = -5979579269476319034L;
        lu.iehz[41] = 3562440995274868828L;
        lu.iehz[42] = -3249721703406708559L;
        lu.iehz[43] = -4371515713716341940L;
        lu.iehz[44] = 4779446818866744027L;
        lu.iehz[45] = -2488089497634810236L;
        lu.iehz[46] = 8387168224483444231L;
        lu.iehz[47] = -5534743054390552357L;
        lu.iehz[48] = 3580765515203551575L;
        lu.iehz[49] = 9051976123697736692L;
        lu.iehz[50] = 4282314877559725687L;
        lu.iehz[51] = 1914307184514899243L;
        lu.iehz[52] = -8636393413895642447L;
        lu.iehz[53] = -1897361410878460987L;
        lu.iehz[54] = -4363089256940258854L;
        lu.iehz[55] = 347827941553310641L;
        lu.iehz[56] = -1969504032781395003L;
        lu.iehz[57] = 1378242526947357918L;
        lu.iehz[58] = 6877527258369125935L;
        lu.iehz[59] = 4561877729882695221L;
        lu.iehz[60] = -4800216407083900165L;
        lu.iehz[61] = 5289745734418445550L;
        lu.iehz[62] = -3470789305448168995L;
        lu.iehz[63] = -2949422412161911185L;
        lu.iehz[64] = 284680417635947777L;
        lu.iehz[65] = 1482125351113660101L;
        lu.iehz[66] = 2090850975090596874L;
        lu.iehz[67] = 4243879840124251739L;
        lu.iehz[68] = -2964140073456581684L;
        lu.iehz[69] = -6693784419435800068L;
        lu.iehz[70] = -1458331010135569032L;
        lu.iehz[71] = -1846338252089389584L;
        lu.iehz[72] = -3575832483048360212L;
        lu.iehz[73] = -1997962152823374695L;
        lu.iehz[74] = -982760636906807727L;
        lu.iehz[75] = -3750672961874881171L;
        lu.iehz[76] = -4778488358941288739L;
        lu.iehz[77] = -3523905946859605529L;
        lu.iehz[78] = 2143326054283465685L;
        lu.iehz[79] = 2107705311209709988L;
        lu.iehz[80] = -737415795225313041L;
        lu.iehz[81] = -1294052526498979537L;
        lu.iehz[82] = -6380769607695609104L;
        lu.iehz[83] = -7364192564896978562L;
        lu.iehz[84] = -5269386112868910553L;
        lu.iehz[85] = -3776153914190328522L;
        lu.iehz[86] = 612398221308315900L;
        lu.iehz[87] = -2299830640268643697L;
        lu.iehz[88] = 7222737822028762977L;
        lu.iehz[89] = -1772779131355554792L;
        lu.iehz[90] = 7506612822080950537L;
        lu.iehz[91] = 6830678051647285815L;
        lu.iehz[92] = -5615553481248321046L;
        lu.iehz[93] = 8231316073650041449L;
        lu.iehz[94] = 207668943364510613L;
        lu.iehz[95] = -8193073454894152018L;
        lu.iehz[96] = -2723316024577886653L;
        lu.iehz[97] = -8298273242296101387L;
        lu.iehz[98] = -4509311668269259261L;
        lu.iehz[99] = -5794365349377540036L;
    }

    static {
        iehq = new int[361];
        iehr = new int[361];
        lu.igcw();
        lu.igcx();
        lu.igcy();
        lu.igcz();
        lu.igda();
        lu.igdb();
        lu.igdc();
        lu.igdd();
        iehz = new long[250];
        ieia = new long[250];
        lu.igde();
        lu.igdi();
        lu.igdm();
        lu.igdp();
        lu.igds();
        lu.igdw();
        MC = class_310.method_1551();
        fromX = new double[1024];
        fromY = new double[1024];
        fromZ = new double[1024];
        toX = new double[1024];
        toY = new double[1024];
        toZ = new double[1024];
        widths = new float[1024];
        colors = new int[1024];
        alphas = new float[1024];
        projection = new Matrix4f();
        view = new Matrix4f();
        combined = new Matrix4f();
    }

    /*
     * Exception decompiling
     */
    public static void end() {
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

    private static /* synthetic */ void igdd() {
        lu.iehr[300] = -422385758;
        lu.iehr[301] = 171351043;
        lu.iehr[302] = 1755066854;
        lu.iehr[303] = 1461274278;
        lu.iehr[304] = 451711111;
        lu.iehr[305] = 1516410707;
        lu.iehr[306] = 975325265;
        lu.iehr[307] = -1308354698;
        lu.iehr[308] = -1006839432;
        lu.iehr[309] = 1887216176;
        lu.iehr[310] = 241657305;
        lu.iehr[311] = -1144722412;
        lu.iehr[312] = 1709868915;
        lu.iehr[313] = -564011247;
        lu.iehr[314] = 411339868;
        lu.iehr[315] = 985030977;
        lu.iehr[316] = 1662865381;
        lu.iehr[317] = -1146867410;
        lu.iehr[318] = 343752260;
        lu.iehr[319] = -626159646;
        lu.iehr[320] = -543693110;
        lu.iehr[321] = -1259024910;
        lu.iehr[322] = 1171703587;
        lu.iehr[323] = 1669110230;
        lu.iehr[324] = 2019983312;
        lu.iehr[325] = 280732220;
        lu.iehr[326] = 1601984965;
        lu.iehr[327] = -1234689567;
        lu.iehr[328] = -2054576097;
        lu.iehr[329] = 738701160;
        lu.iehr[330] = -1036640236;
        lu.iehr[331] = -182136090;
        lu.iehr[332] = -1583543854;
        lu.iehr[333] = -1052007916;
        lu.iehr[334] = -601033127;
        lu.iehr[335] = 2045308570;
        lu.iehr[336] = 2122269586;
        lu.iehr[337] = 879652587;
        lu.iehr[338] = 507440017;
        lu.iehr[339] = 1104174243;
        lu.iehr[340] = 609742495;
        lu.iehr[341] = -1691900339;
        lu.iehr[342] = -1502169622;
        lu.iehr[343] = 971516915;
        lu.iehr[344] = 966862495;
        lu.iehr[345] = 145151528;
        lu.iehr[346] = 1545601218;
        lu.iehr[347] = -525763388;
        lu.iehr[348] = 1900618888;
        lu.iehr[349] = 681347327;
        lu.iehr[350] = 1296526523;
        lu.iehr[351] = -148349614;
        lu.iehr[352] = -1620704681;
        lu.iehr[353] = 139360125;
        lu.iehr[354] = -848161732;
        lu.iehr[355] = -1777452373;
        lu.iehr[356] = -891906572;
        lu.iehr[357] = 1322473471;
        lu.iehr[358] = -288523700;
        lu.iehr[359] = -786345386;
        lu.iehr[360] = 190314870;
    }

    private static /* synthetic */ float ielr(int n2) {
        return Float.intBitsToFloat(iehq[n2] ^ iehr[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$init$1() {
        v0 /* !! */  = lu.pn;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(lu.iehs("igby", iehy(int ), (int)238) - lu.iehs("igbx", iehy(int ), (int)237));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -113081233: {
                    continue block19;
                }
                case -45759476: {
                    break block19;
                }
            }
            break;
        }
        var2 = lu.c;
        v1 /* !! */  = lu.pn;
        if (true) ** GOTO lbl15
        block20: while (true) {
            v1 /* !! */  = (long)(lu.iehs("igca", iehy(int ), (int)240) - lu.iehs("igbz", iehy(int ), (int)239));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -361390198: {
                    continue block20;
                }
                case -45759476: {
                    break block20;
                }
            }
            break;
        }
        var1_1 /* !! */  = lu.b;
        v2 /* !! */  = lu.pn;
        if (true) ** GOTO lbl25
        block21: while (true) {
            v2 /* !! */  = (long)(v3 - lu.iehs("igcb", iehy(int ), (int)241));
lbl25:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1204370686: {
                    v3 = lu.iehs("igcc", iehy(int ), (int)242);
                    continue block21;
                }
                case -45759476: {
                    break block21;
                }
                case 710280694: {
                    v3 = lu.iehs("igcd", iehy(int ), (int)243);
                    continue block21;
                }
            }
            break;
        }
        var0_2 = lu.a;
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

                if (var0_2 || var0_2) continue block22;
                return "Lightning3D Uniforms";
                case 0: {
                    var1_1 /* !! */  = (int)lu.iehs("igce", ieho(int ), (int)349);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl53
                }
lbl48:
                // 2 sources

                case 1: {
                    do {
                        var1_1 /* !! */  = (int)lu.iehs("igcf", ieho(int ), (int)350);
                    } while (!var2);
                    throw null;
                }
lbl53:
                // 2 sources

                case 2: {
                    var1_1 /* !! */  = (int)lu.iehs("igcg", ieho(int ), (int)351);
                    if (!var2) ** GOTO lbl48
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var1_1 /* !! */  = (int)lu.iehs("igch", ieho(int ), (int)352);
        } while (!var2);
        throw null;
    }

    private static /* synthetic */ void igcy() {
        lu.iehq[200] = 1015713504;
        lu.iehq[201] = -1427826295;
        lu.iehq[202] = 1855776382;
        lu.iehq[203] = 758149021;
        lu.iehq[204] = -1451093511;
        lu.iehq[205] = -1792882059;
        lu.iehq[206] = -978585428;
        lu.iehq[207] = -1123311035;
        lu.iehq[208] = -671659917;
        lu.iehq[209] = -1359317281;
        lu.iehq[210] = 1368763882;
        lu.iehq[211] = -1745070947;
        lu.iehq[212] = -2070092682;
        lu.iehq[213] = 812209925;
        lu.iehq[214] = 684526042;
        lu.iehq[215] = -671513995;
        lu.iehq[216] = -1892257429;
        lu.iehq[217] = -467560159;
        lu.iehq[218] = -1192599845;
        lu.iehq[219] = -1663830818;
        lu.iehq[220] = -9851807;
        lu.iehq[221] = 786506998;
        lu.iehq[222] = -1678998012;
        lu.iehq[223] = -1499796838;
        lu.iehq[224] = -366029405;
        lu.iehq[225] = 1788127627;
        lu.iehq[226] = -1576298619;
        lu.iehq[227] = -590480195;
        lu.iehq[228] = 1620727782;
        lu.iehq[229] = -681882865;
        lu.iehq[230] = -378347735;
        lu.iehq[231] = 550976587;
        lu.iehq[232] = 792932817;
        lu.iehq[233] = 1721562438;
        lu.iehq[234] = -1912817365;
        lu.iehq[235] = -1169331451;
        lu.iehq[236] = -1354679095;
        lu.iehq[237] = -1877169111;
        lu.iehq[238] = -2137764481;
        lu.iehq[239] = -188094977;
        lu.iehq[240] = -1165588356;
        lu.iehq[241] = 2008348974;
        lu.iehq[242] = 1145568620;
        lu.iehq[243] = 662352841;
        lu.iehq[244] = 1934837684;
        lu.iehq[245] = 382259073;
        lu.iehq[246] = -1247050469;
        lu.iehq[247] = -306487070;
        lu.iehq[248] = -436355023;
        lu.iehq[249] = 1277641086;
        lu.iehq[250] = 1768303183;
        lu.iehq[251] = 1172890128;
        lu.iehq[252] = -2000602341;
        lu.iehq[253] = -1762321081;
        lu.iehq[254] = 342126957;
        lu.iehq[255] = -561608354;
        lu.iehq[256] = -1391749901;
        lu.iehq[257] = 1743533180;
        lu.iehq[258] = -1924881768;
        lu.iehq[259] = -1974562789;
        lu.iehq[260] = -1341092981;
        lu.iehq[261] = 1729896719;
        lu.iehq[262] = -981449080;
        lu.iehq[263] = 1903976184;
        lu.iehq[264] = 2035932885;
        lu.iehq[265] = -357426615;
        lu.iehq[266] = 582273761;
        lu.iehq[267] = -925002827;
        lu.iehq[268] = 1584814200;
        lu.iehq[269] = 1875957309;
        lu.iehq[270] = 1458563168;
        lu.iehq[271] = 1772332740;
        lu.iehq[272] = 2011314609;
        lu.iehq[273] = -522738099;
        lu.iehq[274] = -869325441;
        lu.iehq[275] = 1818934766;
        lu.iehq[276] = 1004711337;
        lu.iehq[277] = 1543454387;
        lu.iehq[278] = -2078815590;
        lu.iehq[279] = 1017669609;
        lu.iehq[280] = -491521603;
        lu.iehq[281] = 77713245;
        lu.iehq[282] = 952504498;
        lu.iehq[283] = 1816743878;
        lu.iehq[284] = 1997527969;
        lu.iehq[285] = -74712522;
        lu.iehq[286] = -574547259;
        lu.iehq[287] = -1063731027;
        lu.iehq[288] = 1593051223;
        lu.iehq[289] = -662062361;
        lu.iehq[290] = 2142102080;
        lu.iehq[291] = 2090669827;
        lu.iehq[292] = 682345018;
        lu.iehq[293] = -2140507789;
        lu.iehq[294] = 580005198;
        lu.iehq[295] = -1106168844;
        lu.iehq[296] = 1104502355;
        lu.iehq[297] = 141217718;
        lu.iehq[298] = -1994517709;
        lu.iehq[299] = -2097612066;
    }

    private static /* synthetic */ void igcz() {
        lu.iehq[300] = -422385750;
        lu.iehq[301] = -171351044;
        lu.iehq[302] = -259628151;
        lu.iehq[303] = -1461274279;
        lu.iehq[304] = 716382803;
        lu.iehq[305] = -1516410708;
        lu.iehq[306] = -572321982;
        lu.iehq[307] = -1308354697;
        lu.iehq[308] = -2114374776;
        lu.iehq[309] = 1887216177;
        lu.iehq[310] = 1577740002;
        lu.iehq[311] = -1144722411;
        lu.iehq[312] = 838796864;
        lu.iehq[313] = -564011248;
        lu.iehq[314] = 236347303;
        lu.iehq[315] = 985030976;
        lu.iehq[316] = 279519449;
        lu.iehq[317] = -1146867409;
        lu.iehq[318] = -1335336482;
        lu.iehq[319] = 626159645;
        lu.iehq[320] = 1014615743;
        lu.iehq[321] = -1259024909;
        lu.iehq[322] = 1463199415;
        lu.iehq[323] = 1669110231;
        lu.iehq[324] = 732571633;
        lu.iehq[325] = 280732221;
        lu.iehq[326] = -1793943170;
        lu.iehq[327] = 1234689566;
        lu.iehq[328] = -2024134660;
        lu.iehq[329] = 738701161;
        lu.iehq[330] = -240175631;
        lu.iehq[331] = 182136089;
        lu.iehq[332] = 1860876325;
        lu.iehq[333] = -1052007908;
        lu.iehq[334] = -601033122;
        lu.iehq[335] = 2045308560;
        lu.iehq[336] = 2122269586;
        lu.iehq[337] = 879652577;
        lu.iehq[338] = 507440021;
        lu.iehq[339] = 1104174251;
        lu.iehq[340] = 609742485;
        lu.iehq[341] = -1691900348;
        lu.iehq[342] = -1502169624;
        lu.iehq[343] = 971516920;
        lu.iehq[344] = 966862490;
        lu.iehq[345] = 145151530;
        lu.iehq[346] = 1545601219;
        lu.iehq[347] = -525763388;
        lu.iehq[348] = 1900618890;
        lu.iehq[349] = 681347324;
        lu.iehq[350] = 1296526521;
        lu.iehq[351] = -148349614;
        lu.iehq[352] = -1620704683;
        lu.iehq[353] = -139360126;
        lu.iehq[354] = 2064033604;
        lu.iehq[355] = 1777452372;
        lu.iehq[356] = -865022037;
        lu.iehq[357] = 1322473468;
        lu.iehq[358] = -288523700;
        lu.iehq[359] = -786345386;
        lu.iehq[360] = 190314869;
    }

    private static /* synthetic */ void igdp() {
        lu.ieia[0] = -1728773229006772809L;
        lu.ieia[1] = -1393339878871896943L;
        lu.ieia[2] = 4414806257262481080L;
        lu.ieia[3] = 8871807861579772969L;
        lu.ieia[4] = 6460840437948843765L;
        lu.ieia[5] = 7502488168056490412L;
        lu.ieia[6] = 1472313550528963692L;
        lu.ieia[7] = 6116970480232628281L;
        lu.ieia[8] = 8298390386565555637L;
        lu.ieia[9] = 5930521698777015534L;
        lu.ieia[10] = -4747254495801617958L;
        lu.ieia[11] = -3370332740230930011L;
        lu.ieia[12] = -8011026368064241106L;
        lu.ieia[13] = -6221729885835996577L;
        lu.ieia[14] = 7282618676891342685L;
        lu.ieia[15] = -5859214091408633180L;
        lu.ieia[16] = 3989154367931268056L;
        lu.ieia[17] = -3755632767844054752L;
        lu.ieia[18] = -5792427287204751243L;
        lu.ieia[19] = -909228651093074031L;
        lu.ieia[20] = -9136364853165781232L;
        lu.ieia[21] = 1284282149182326060L;
        lu.ieia[22] = -5961454745216124122L;
        lu.ieia[23] = 6429304342377698235L;
        lu.ieia[24] = 5776285361072286349L;
        lu.ieia[25] = -2922812392479730369L;
        lu.ieia[26] = 6862294236202734247L;
        lu.ieia[27] = -2430683597851201184L;
        lu.ieia[28] = 3594030990754191587L;
        lu.ieia[29] = -7574850063700798005L;
        lu.ieia[30] = 2974533953267257439L;
        lu.ieia[31] = 2944571356259605877L;
        lu.ieia[32] = 8939271080563047730L;
        lu.ieia[33] = -1848037782604774901L;
        lu.ieia[34] = 8679646368045524365L;
        lu.ieia[35] = -2040436486988651434L;
        lu.ieia[36] = -773473987698047369L;
        lu.ieia[37] = 3379074233357926876L;
        lu.ieia[38] = 1961371118635409080L;
        lu.ieia[39] = -4680918781006207077L;
        lu.ieia[40] = -3360008895824620069L;
        lu.ieia[41] = -6204251516132690904L;
        lu.ieia[42] = -5347800757570853337L;
        lu.ieia[43] = 4333260690688674596L;
        lu.ieia[44] = -68508026250904010L;
        lu.ieia[45] = 1742380430679108002L;
        lu.ieia[46] = -7331036136807071141L;
        lu.ieia[47] = 8714477117374919680L;
        lu.ieia[48] = -3909238124878606678L;
        lu.ieia[49] = -1065495072275089181L;
        lu.ieia[50] = -7963971575160930876L;
        lu.ieia[51] = -6352993368506644423L;
        lu.ieia[52] = 1627863909466173827L;
        lu.ieia[53] = -3886979256611682256L;
        lu.ieia[54] = -1151519658934108424L;
        lu.ieia[55] = 803169302708453211L;
        lu.ieia[56] = 509092457733687645L;
        lu.ieia[57] = -2342115784788120452L;
        lu.ieia[58] = -3588051724408838571L;
        lu.ieia[59] = 1522116170737601943L;
        lu.ieia[60] = 7670137620175975471L;
        lu.ieia[61] = 2934029777842153943L;
        lu.ieia[62] = -3392110285158248341L;
        lu.ieia[63] = -1562377619689466447L;
        lu.ieia[64] = -1329034011317898628L;
        lu.ieia[65] = -2093792454918466231L;
        lu.ieia[66] = 4932738217371053775L;
        lu.ieia[67] = -4243431877667667691L;
        lu.ieia[68] = 1507565769686410763L;
        lu.ieia[69] = 4084463135078027456L;
        lu.ieia[70] = -388456278619265894L;
        lu.ieia[71] = -992380582288691120L;
        lu.ieia[72] = -2457632559988722072L;
        lu.ieia[73] = 2179902427182564234L;
        lu.ieia[74] = -4014610587843349782L;
        lu.ieia[75] = 5517507413753150356L;
        lu.ieia[76] = -3857469334174087838L;
        lu.ieia[77] = -4691339947703983396L;
        lu.ieia[78] = 200376628305822520L;
        lu.ieia[79] = -9133106407941016693L;
        lu.ieia[80] = 4725418801726966351L;
        lu.ieia[81] = -6159104359298814303L;
        lu.ieia[82] = -7767553415126593482L;
        lu.ieia[83] = 2329851459226678460L;
        lu.ieia[84] = -4342649115365415843L;
        lu.ieia[85] = 6907793683206268118L;
        lu.ieia[86] = 4479357110465741996L;
        lu.ieia[87] = -4685311524293659506L;
        lu.ieia[88] = 2527331828652947352L;
        lu.ieia[89] = 5730564626647026213L;
        lu.ieia[90] = -8224526903228042797L;
        lu.ieia[91] = 8589361612125658256L;
        lu.ieia[92] = 4813175919150861651L;
        lu.ieia[93] = 2686471119718989099L;
        lu.ieia[94] = -4657431435650662311L;
        lu.ieia[95] = -4107487181684753176L;
        lu.ieia[96] = -5982252768137560574L;
        lu.ieia[97] = 7555581938118809509L;
        lu.ieia[98] = 746696409526690524L;
        lu.ieia[99] = -2172631922792677999L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void putMatrix(ByteBuffer var0, Matrix4f var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lu.pn - lu.iehs("iftk", iehy(int ), (int)149)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == lu.iehs("iftn", ieho(int ), (int)301)) break;
            v0 /* !! */  = (long)lu.iehs("iftp", ieho(int ), (int)302);
        }
        var4_2 = lu.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = lu.pn - lu.iehs("ifts", iehy(int ), (int)150)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == lu.iehs("iftv", ieho(int ), (int)303)) break;
            v1 /* !! */  = (long)lu.iehs("ifty", ieho(int ), (int)304);
        }
        var3_3 /* !! */  = lu.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = lu.pn - lu.iehs("ifua", iehy(int ), (int)151)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == lu.iehs("ifuc", ieho(int ), (int)305)) break;
            v2 /* !! */  = (long)lu.iehs("ifud", ieho(int ), (int)306);
        }
        var2_4 = lu.a;
        if (var4_2) {
            throw null;
lbl21:
            // 5 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl21
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = lu.pn - lu.iehs("ifug", iehy(int ), (int)152)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == lu.iehs("ifui", ieho(int ), (int)307)) break;
            v3 /* !! */  = (long)lu.iehs("ifuk", ieho(int ), (int)308);
        }
        v4 = var1_1.m00();
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_4 = lu.pn - lu.iehs("ifum", iehy(int ), (int)153)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == lu.iehs("ifun", ieho(int ), (int)309)) break;
            v5 /* !! */  = (long)lu.iehs("ifuq", ieho(int ), (int)310);
        }
        v6 = var0.putFloat(v4);
        v7 /* !! */  = lu.pn;
        if (true) ** GOTO lbl40
        block122: while (true) {
            v7 /* !! */  = (long)(v8 - lu.iehs("ifur", iehy(int ), (int)154));
lbl40:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1665049616: {
                    v8 = lu.iehs("ifus", iehy(int ), (int)155);
                    continue block122;
                }
                case -45759476: {
                    break block122;
                }
                case 2005665923: {
                    v8 = lu.iehs("ifuu", iehy(int ), (int)156);
                    continue block122;
                }
            }
            break;
        }
        v9 = var1_1.m01();
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_5 = lu.pn - lu.iehs("ifuw", iehy(int ), (int)157)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == lu.iehs("ifuy", ieho(int ), (int)311)) break;
            v10 /* !! */  = (long)lu.iehs("ifuz", ieho(int ), (int)312);
        }
        v11 = v6.putFloat(v9);
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_6 = lu.pn - lu.iehs("ifvb", iehy(int ), (int)158)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == lu.iehs("ifvc", ieho(int ), (int)313)) break;
            v12 /* !! */  = (long)lu.iehs("ifve", ieho(int ), (int)314);
        }
        v13 = var1_1.m02();
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_7 = lu.pn - lu.iehs("ifvh", iehy(int ), (int)159)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == lu.iehs("ifvj", ieho(int ), (int)315)) break;
            v14 /* !! */  = (long)lu.iehs("ifvl", ieho(int ), (int)316);
        }
        v15 = v11.putFloat(v13);
        v16 /* !! */  = lu.pn;
        if (true) ** GOTO lbl72
        block126: while (true) {
            v16 /* !! */  = (long)(v17 - lu.iehs("ifvm", iehy(int ), (int)160));
lbl72:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case -1199859874: {
                    v17 = lu.iehs("ifvn", iehy(int ), (int)161);
                    continue block126;
                }
                case -45759476: {
                    break block126;
                }
                case 1723857264: {
                    v17 = lu.iehs("ifvp", iehy(int ), (int)162);
                    continue block126;
                }
            }
            break;
        }
        v18 = var1_1.m03();
        v19 /* !! */  = lu.pn;
        if (true) ** GOTO lbl86
        block127: while (true) {
            v19 /* !! */  = (long)(v20 - lu.iehs("ifvr", iehy(int ), (int)163));
lbl86:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case -1736130495: {
                    v20 = lu.iehs("ifvs", iehy(int ), (int)164);
                    continue block127;
                }
                case -45759476: {
                    break block127;
                }
                case 645621066: {
                    v20 = lu.iehs("ifvu", iehy(int ), (int)165);
                    continue block127;
                }
                case 1025910316: {
                    v20 = lu.iehs("ifvv", iehy(int ), (int)166);
                    continue block127;
                }
            }
            break;
        }
        v15.putFloat(v18);
        if (var2_4 || var2_4) ** GOTO lbl21
        while (true) {
            if ((v21 /* !! */  = (cfr_temp_8 = lu.pn - lu.iehs("ifvy", iehy(int ), (int)167)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v21 /* !! */  == lu.iehs("ifwa", ieho(int ), (int)317)) break;
            v21 /* !! */  = (long)lu.iehs("ifwc", ieho(int ), (int)318);
        }
        v22 = var1_1.m10();
        v23 /* !! */  = lu.pn;
        if (true) ** GOTO lbl111
        block129: while (true) {
            v23 /* !! */  = (long)(v24 - lu.iehs("ifwd", iehy(int ), (int)168));
lbl111:
            // 2 sources

            switch ((int)v23 /* !! */ ) {
                case -1850944948: {
                    v24 = lu.iehs("ifwf", iehy(int ), (int)169);
                    continue block129;
                }
                case -1751797058: {
                    v24 = lu.iehs("ifwh", iehy(int ), (int)170);
                    continue block129;
                }
                case -45759476: {
                    break block129;
                }
            }
            break;
        }
        v25 = var0.putFloat(v22);
        while (true) {
            if ((v26 /* !! */  = (cfr_temp_9 = lu.pn - lu.iehs("ifwj", iehy(int ), (int)171)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v26 /* !! */  == lu.iehs("ifwl", ieho(int ), (int)319)) break;
            v26 /* !! */  = (long)lu.iehs("ifwn", ieho(int ), (int)320);
        }
        v27 = var1_1.m11();
        v28 /* !! */  = lu.pn;
        if (true) ** GOTO lbl131
        block131: while (true) {
            v28 /* !! */  = (long)(v29 - lu.iehs("ifwo", iehy(int ), (int)172));
lbl131:
            // 2 sources

            switch ((int)v28 /* !! */ ) {
                case -45759476: {
                    break block131;
                }
                case 327587425: {
                    v29 = lu.iehs("ifwq", iehy(int ), (int)173);
                    continue block131;
                }
                case 770305908: {
                    v29 = lu.iehs("ifws", iehy(int ), (int)174);
                    continue block131;
                }
            }
            break;
        }
        v30 = v25.putFloat(v27);
        while (true) {
            if ((v31 /* !! */  = (cfr_temp_10 = lu.pn - lu.iehs("ifwu", iehy(int ), (int)175)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
            if (v31 /* !! */  == lu.iehs("ifww", ieho(int ), (int)321)) break;
            v31 /* !! */  = (long)lu.iehs("ifwy", ieho(int ), (int)322);
        }
        v32 = var1_1.m12();
        v33 /* !! */  = lu.pn;
        if (true) ** GOTO lbl151
        block133: while (true) {
            v33 /* !! */  = (long)(v34 - lu.iehs("ifwz", iehy(int ), (int)176));
lbl151:
            // 2 sources

            switch ((int)v33 /* !! */ ) {
                case -1584078068: {
                    v34 = lu.iehs("ifxb", iehy(int ), (int)177);
                    continue block133;
                }
                case -45759476: {
                    break block133;
                }
                case 426007094: {
                    v34 = lu.iehs("ifxd", iehy(int ), (int)178);
                    continue block133;
                }
            }
            break;
        }
        v35 = v30.putFloat(v32);
        while (true) {
            if ((v36 /* !! */  = (cfr_temp_11 = lu.pn - lu.iehs("ifxf", iehy(int ), (int)179)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
            if (v36 /* !! */  == lu.iehs("ifxh", ieho(int ), (int)323)) break;
            v36 /* !! */  = (long)lu.iehs("ifxi", ieho(int ), (int)324);
        }
        v37 = var1_1.m13();
        v38 /* !! */  = lu.pn;
        if (true) ** GOTO lbl171
        block135: while (true) {
            v38 /* !! */  = (long)(v39 - lu.iehs("ifxj", iehy(int ), (int)180));
lbl171:
            // 2 sources

            switch ((int)v38 /* !! */ ) {
                case -1146863455: {
                    v39 = lu.iehs("ifxl", iehy(int ), (int)181);
                    continue block135;
                }
                case -45759476: {
                    break block135;
                }
                case 482963730: {
                    v39 = lu.iehs("ifxn", iehy(int ), (int)182);
                    continue block135;
                }
                case 1390053091: {
                    v39 = lu.iehs("ifxp", iehy(int ), (int)183);
                    continue block135;
                }
            }
            break;
        }
        v35.putFloat(v37);
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl21
                while (true) {
                    if ((v40 /* !! */  = (cfr_temp_12 = lu.pn - lu.iehs("ifxr", iehy(int ), (int)184)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v40 /* !! */  == lu.iehs("ifxs", ieho(int ), (int)325)) break;
                    v40 /* !! */  = (long)lu.iehs("ifxt", ieho(int ), (int)326);
                }
                v41 = var1_1.m20();
                while (true) {
                    if ((v42 /* !! */  = (cfr_temp_13 = lu.pn - lu.iehs("ifxu", iehy(int ), (int)185)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v42 /* !! */  == lu.iehs("ifxv", ieho(int ), (int)327)) break;
                    v42 /* !! */  = (long)lu.iehs("ifxw", ieho(int ), (int)328);
                }
                v43 = var0.putFloat(v41);
                v44 /* !! */  = lu.pn;
                if (true) ** GOTO lbl205
                block138: while (true) {
                    v44 /* !! */  = (long)(lu.iehs("ifyc", iehy(int ), (int)187) - lu.iehs("ifxy", iehy(int ), (int)186));
lbl205:
                    // 2 sources

                    switch ((int)v44 /* !! */ ) {
                        case -938036918: {
                            continue block138;
                        }
                        case -45759476: {
                            break block138;
                        }
                    }
                    break;
                }
                v45 = var1_1.m21();
                v46 /* !! */  = lu.pn;
                if (true) ** GOTO lbl215
                block139: while (true) {
                    v46 /* !! */  = (long)(v47 - lu.iehs("ifyf", iehy(int ), (int)188));
lbl215:
                    // 2 sources

                    switch ((int)v46 /* !! */ ) {
                        case -1490033994: {
                            v47 = lu.iehs("ifyi", iehy(int ), (int)189);
                            continue block139;
                        }
                        case -455825448: {
                            v47 = lu.iehs("ifyk", iehy(int ), (int)190);
                            continue block139;
                        }
                        case -45759476: {
                            break block139;
                        }
                        case 155466554: {
                            v47 = lu.iehs("ifyl", iehy(int ), (int)191);
                            continue block139;
                        }
                    }
                    break;
                }
                v48 = v43.putFloat(v45);
                v49 /* !! */  = lu.pn;
                if (true) ** GOTO lbl232
                block140: while (true) {
                    v49 /* !! */  = (long)(v50 - lu.iehs("ifys", iehy(int ), (int)192));
lbl232:
                    // 2 sources

                    switch ((int)v49 /* !! */ ) {
                        case -1959534942: {
                            v50 = lu.iehs("ifyw", iehy(int ), (int)193);
                            continue block140;
                        }
                        case -1090610027: {
                            v50 = lu.iehs("ifyy", iehy(int ), (int)194);
                            continue block140;
                        }
                        case -45759476: {
                            break block140;
                        }
                        case 1588835672: {
                            v50 = lu.iehs("ifzb", iehy(int ), (int)195);
                            continue block140;
                        }
                    }
                    break;
                }
                v51 = var1_1.m22();
                v52 /* !! */  = lu.pn;
                if (true) ** GOTO lbl249
                block141: while (true) {
                    v52 /* !! */  = (long)(v53 - lu.iehs("ifzc", iehy(int ), (int)196));
lbl249:
                    // 2 sources

                    switch ((int)v52 /* !! */ ) {
                        case -1449202199: {
                            v53 = lu.iehs("ifze", iehy(int ), (int)197);
                            continue block141;
                        }
                        case -45759476: {
                            break block141;
                        }
                        case 992736204: {
                            v53 = lu.iehs("ifzh", iehy(int ), (int)198);
                            continue block141;
                        }
                    }
                    break;
                }
                v54 = v48.putFloat(v51);
                v55 /* !! */  = lu.pn;
                if (true) ** GOTO lbl263
                block142: while (true) {
                    v55 /* !! */  = (long)(v56 - lu.iehs("ifzj", iehy(int ), (int)199));
lbl263:
                    // 2 sources

                    switch ((int)v55 /* !! */ ) {
                        case -806763465: {
                            v56 = lu.iehs("ifzk", iehy(int ), (int)200);
                            continue block142;
                        }
                        case -45759476: {
                            break block142;
                        }
                        case 360285518: {
                            v56 = lu.iehs("ifzm", iehy(int ), (int)201);
                            continue block142;
                        }
                        case 1321357408: {
                            v56 = lu.iehs("ifzn", iehy(int ), (int)202);
                            continue block142;
                        }
                    }
                    break;
                }
                v57 = var1_1.m23();
                v58 /* !! */  = lu.pn;
                if (true) ** GOTO lbl280
                block143: while (true) {
                    v58 /* !! */  = (long)(v59 - lu.iehs("ifzo", iehy(int ), (int)203));
lbl280:
                    // 2 sources

                    switch ((int)v58 /* !! */ ) {
                        case -1070078690: {
                            v59 = lu.iehs("ifzp", iehy(int ), (int)204);
                            continue block143;
                        }
                        case -45759476: {
                            break block143;
                        }
                        case 1418273136: {
                            v59 = lu.iehs("ifzq", iehy(int ), (int)205);
                            continue block143;
                        }
                        case 1849969115: {
                            v59 = lu.iehs("ifzr", iehy(int ), (int)206);
                            continue block143;
                        }
                    }
                    break;
                }
                v54.putFloat(v57);
                if (var2_4 || var2_4) ** GOTO lbl21
                v60 /* !! */  = lu.pn;
                if (true) ** GOTO lbl299
                block144: while (true) {
                    v60 /* !! */  = (long)(v61 - lu.iehs("ifzt", iehy(int ), (int)207));
lbl299:
                    // 2 sources

                    switch ((int)v60 /* !! */ ) {
                        case -1237742013: {
                            v61 = lu.iehs("ifzu", iehy(int ), (int)208);
                            continue block144;
                        }
                        case -211921430: {
                            v61 = lu.iehs("ifzv", iehy(int ), (int)209);
                            continue block144;
                        }
                        case -45759476: {
                            break block144;
                        }
                        case 2023582652: {
                            v61 = lu.iehs("ifzw", iehy(int ), (int)210);
                            continue block144;
                        }
                    }
                    break;
                }
                v62 = var1_1.m30();
                while (true) {
                    if ((v63 /* !! */  = (cfr_temp_14 = lu.pn - lu.iehs("ifzz", iehy(int ), (int)211)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                    if (v63 /* !! */  == lu.iehs("igaa", ieho(int ), (int)329)) break;
                    v63 /* !! */  = (long)lu.iehs("igab", ieho(int ), (int)330);
                }
                v64 = var0.putFloat(v62);
                v65 /* !! */  = lu.pn;
                if (true) ** GOTO lbl322
                block146: while (true) {
                    v65 /* !! */  = (long)(v66 - lu.iehs("igac", iehy(int ), (int)212));
lbl322:
                    // 2 sources

                    switch ((int)v65 /* !! */ ) {
                        case -2026119723: {
                            v66 = lu.iehs("igae", iehy(int ), (int)213);
                            continue block146;
                        }
                        case -84742652: {
                            v66 = lu.iehs("igaf", iehy(int ), (int)214);
                            continue block146;
                        }
                        case -45759476: {
                            break block146;
                        }
                        case 129672241: {
                            v66 = lu.iehs("igag", iehy(int ), (int)215);
                            continue block146;
                        }
                    }
                    break;
                }
                v67 = var1_1.m31();
                v68 /* !! */  = lu.pn;
                if (true) ** GOTO lbl339
                block147: while (true) {
                    v68 /* !! */  = (long)(lu.iehs("igaj", iehy(int ), (int)217) - lu.iehs("igah", iehy(int ), (int)216));
lbl339:
                    // 2 sources

                    switch ((int)v68 /* !! */ ) {
                        case -45759476: {
                            break block147;
                        }
                        case 1032576412: {
                            continue block147;
                        }
                    }
                    break;
                }
                v69 = v64.putFloat(v67);
                v70 /* !! */  = lu.pn;
                if (true) ** GOTO lbl349
                block148: while (true) {
                    v70 /* !! */  = (long)(v71 - lu.iehs("igal", iehy(int ), (int)218));
lbl349:
                    // 2 sources

                    switch ((int)v70 /* !! */ ) {
                        case -45759476: {
                            break block148;
                        }
                        case 692166951: {
                            v71 = lu.iehs("igam", iehy(int ), (int)219);
                            continue block148;
                        }
                        case 1115231693: {
                            v71 = lu.iehs("igan", iehy(int ), (int)220);
                            continue block148;
                        }
                    }
                    break;
                }
                v72 = var1_1.m32();
                while (true) {
                    if ((v73 /* !! */  = (cfr_temp_15 = lu.pn - lu.iehs("igao", iehy(int ), (int)221)) == 0L ? 0 : (cfr_temp_15 < 0L ? -1 : 1)) == false) continue;
                    if (v73 /* !! */  == lu.iehs("igap", ieho(int ), (int)331)) break;
                    v73 /* !! */  = (long)lu.iehs("igaq", ieho(int ), (int)332);
                }
                v74 = v69.putFloat(v72);
                v75 /* !! */  = lu.pn;
                if (true) ** GOTO lbl369
                block150: while (true) {
                    v75 /* !! */  = (long)(v76 - lu.iehs("igar", iehy(int ), (int)222));
lbl369:
                    // 2 sources

                    switch ((int)v75 /* !! */ ) {
                        case -45759476: {
                            break block150;
                        }
                        case 1532281869: {
                            v76 = lu.iehs("igas", iehy(int ), (int)223);
                            continue block150;
                        }
                        case 1801346085: {
                            v76 = lu.iehs("igau", iehy(int ), (int)224);
                            continue block150;
                        }
                    }
                    break;
                }
                v77 = var1_1.m33();
                v78 /* !! */  = lu.pn;
                if (true) ** GOTO lbl383
                block151: while (true) {
                    v78 /* !! */  = (long)(v79 - lu.iehs("igav", iehy(int ), (int)225));
lbl383:
                    // 2 sources

                    switch ((int)v78 /* !! */ ) {
                        case -1855899674: {
                            v79 = lu.iehs("igaw", iehy(int ), (int)226);
                            continue block151;
                        }
                        case -1277699177: {
                            v79 = lu.iehs("igax", iehy(int ), (int)227);
                            continue block151;
                        }
                        case -45759476: {
                            break block151;
                        }
                        case 2010093562: {
                            v79 = lu.iehs("igay", iehy(int ), (int)228);
                            continue block151;
                        }
                    }
                    break;
                }
                v74.putFloat(v77);
                if (var2_4 || var2_4) ** continue;
                return;
            }
            case 0: {
                do {
                    var3_3 /* !! */  = (int)lu.iehs("igaz", ieho(int ), (int)333);
                } while (!var4_2);
                throw null;
            }
lbl404:
            // 3 sources

            case 1: {
                var3_3 /* !! */  = (int)lu.iehs("igba", ieho(int ), (int)334);
                if (var4_2) {
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)lu.iehs("igbb", ieho(int ), (int)335);
                if (var4_2) {
                    throw null;
                }
            }
lbl412:
            // 4 sources

            case 3: {
                var3_3 /* !! */  = (int)lu.iehs("igbc", ieho(int ), (int)336);
                if (!var4_2) break;
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)lu.iehs("igbd", ieho(int ), (int)337);
                if (!var4_2) break;
                throw null;
            }
lbl420:
            // 2 sources

            case 5: {
                do {
                    var3_3 /* !! */  = (int)lu.iehs("igbe", ieho(int ), (int)338);
                } while (!var4_2);
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)lu.iehs("igbf", ieho(int ), (int)339);
                if (!var4_2) ** GOTO lbl404
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)lu.iehs("igbg", ieho(int ), (int)340);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl438
            }
            case 8: {
                var3_3 /* !! */  = (int)lu.iehs("igbh", ieho(int ), (int)341);
                if (!var4_2) ** GOTO lbl404
                throw null;
            }
lbl438:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)lu.iehs("igbi", ieho(int ), (int)342);
                if (!var4_2) ** GOTO lbl420
                throw null;
            }
            case 10: {
                var3_3 /* !! */  = (int)lu.iehs("igbj", ieho(int ), (int)343);
                if (!var4_2) ** GOTO lbl412
                throw null;
            }
            case 11: 
        }
        do {
            var3_3 /* !! */  = (int)lu.iehs("igbk", ieho(int ), (int)344);
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void vertex(ByteBuffer var0, class_243 var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7) {
        v0 /* !! */  = lu.pn;
        if (true) ** GOTO lbl5
        block45: while (true) {
            v0 /* !! */  = (long)(lu.iehs("ifps", iehy(int ), (int)123) - lu.iehs("ifpr", iehy(int ), (int)122));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1874201580: {
                    continue block45;
                }
                case -45759476: {
                    break block45;
                }
            }
            break;
        }
        var10_8 = lu.c;
        v1 /* !! */  = lu.pn;
        if (true) ** GOTO lbl15
        block46: while (true) {
            v1 /* !! */  = (long)(lu.iehs("ifpv", iehy(int ), (int)125) - lu.iehs("ifpu", iehy(int ), (int)124));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -45759476: {
                    break block46;
                }
                case 931673424: {
                    continue block46;
                }
            }
            break;
        }
        var9_9 /* !! */  = lu.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = lu.pn - lu.iehs("ifpx", iehy(int ), (int)126)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == lu.iehs("ifpy", ieho(int ), (int)271)) break;
            v2 /* !! */  = (long)lu.iehs("ifpz", ieho(int ), (int)272);
        }
        var8_10 = lu.a;
        if (var10_8) {
            throw null;
lbl29:
            // 4 sources

            return;
        }
        if (var8_10 || var8_10) ** GOTO lbl29
        v3 /* !! */  = lu.pn;
        if (true) ** GOTO lbl36
        block49: while (true) {
            v3 /* !! */  = (long)(v4 - lu.iehs("ifqb", iehy(int ), (int)127));
lbl36:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1297029851: {
                    v4 = lu.iehs("ifqd", iehy(int ), (int)128);
                    continue block49;
                }
                case -120644519: {
                    v4 = lu.iehs("ifqe", iehy(int ), (int)129);
                    continue block49;
                }
                case -45759476: {
                    break block49;
                }
            }
            break;
        }
        v5 = (float)var1_1.field_1352;
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_1 = lu.pn - lu.iehs("ifqf", iehy(int ), (int)130)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == lu.iehs("ifqh", ieho(int ), (int)273)) break;
            v6 /* !! */  = (long)lu.iehs("ifqi", ieho(int ), (int)274);
        }
        v7 = var0.putFloat(v5);
        v8 /* !! */  = lu.pn;
        if (true) ** GOTO lbl56
        block51: while (true) {
            v8 /* !! */  = (long)(v9 - lu.iehs("ifqj", iehy(int ), (int)131));
lbl56:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -2096304218: {
                    v9 = lu.iehs("ifql", iehy(int ), (int)132);
                    continue block51;
                }
                case -1378818962: {
                    v9 = lu.iehs("ifqm", iehy(int ), (int)133);
                    continue block51;
                }
                case -983856276: {
                    v9 = lu.iehs("ifqn", iehy(int ), (int)134);
                    continue block51;
                }
                case -45759476: {
                    break block51;
                }
            }
            break;
        }
        v10 = (float)var1_1.field_1351;
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_2 = lu.pn - lu.iehs("ifqp", iehy(int ), (int)135)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == lu.iehs("ifqq", ieho(int ), (int)275)) break;
            v11 /* !! */  = (long)lu.iehs("ifqs", ieho(int ), (int)276);
        }
        v12 = v7.putFloat(v10);
        v13 /* !! */  = lu.pn;
        if (true) ** GOTO lbl79
        block53: while (true) {
            v13 /* !! */  = (long)(lu.iehs("ifqv", iehy(int ), (int)137) - lu.iehs("ifqt", iehy(int ), (int)136));
lbl79:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -784906195: {
                    continue block53;
                }
                case -45759476: {
                    break block53;
                }
            }
            break;
        }
        v14 = (float)var1_1.field_1350;
        v15 /* !! */  = lu.pn;
        if (true) ** GOTO lbl89
        block54: while (true) {
            v15 /* !! */  = (long)(v16 - lu.iehs("ifqw", iehy(int ), (int)138));
lbl89:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -485799506: {
                    v16 = lu.iehs("ifqy", iehy(int ), (int)139);
                    continue block54;
                }
                case -469393643: {
                    v16 = lu.iehs("ifqz", iehy(int ), (int)140);
                    continue block54;
                }
                case -45759476: {
                    break block54;
                }
            }
            break;
        }
        v12.putFloat(v14);
        if (var8_10 || var8_10) ** GOTO lbl29
        v17 = (byte)(var2_2 * lu.iehs("ifrb", ielr(int ), (int)277));
        while (true) {
            if ((v18 /* !! */  = (cfr_temp_3 = lu.pn - lu.iehs("ifrc", iehy(int ), (int)141)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v18 /* !! */  == lu.iehs("ifre", ieho(int ), (int)278)) break;
            v18 /* !! */  = (long)lu.iehs("ifrf", ieho(int ), (int)279);
        }
        v19 = var0.put(v17);
        v20 = (byte)(var3_3 * lu.iehs("ifrg", ielr(int ), (int)280));
        v21 /* !! */  = lu.pn;
        if (true) ** GOTO lbl113
        block56: while (true) {
            v21 /* !! */  = (long)(v22 - lu.iehs("ifri", iehy(int ), (int)142));
lbl113:
            // 2 sources

            switch ((int)v21 /* !! */ ) {
                case -45759476: {
                    break block56;
                }
                case 1115741903: {
                    v22 = lu.iehs("ifrk", iehy(int ), (int)143);
                    continue block56;
                }
                case 1481123978: {
                    v22 = lu.iehs("ifrl", iehy(int ), (int)144);
                    continue block56;
                }
            }
            break;
        }
        v23 = v19.put(v20);
        v24 = (byte)(var4_4 * lu.iehs("ifrq", ielr(int ), (int)281));
        while (true) {
            if ((v25 /* !! */  = (cfr_temp_4 = lu.pn - lu.iehs("ifrs", iehy(int ), (int)145)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v25 /* !! */  == lu.iehs("ifru", ieho(int ), (int)282)) break;
            v25 /* !! */  = (long)lu.iehs("ifrv", ieho(int ), (int)283);
        }
        v26 = v23.put(v24);
        v27 = (byte)(var5_5 * lu.iehs("ifrx", ielr(int ), (int)284));
        while (true) {
            if ((v28 /* !! */  = (cfr_temp_5 = lu.pn - lu.iehs("ifrz", iehy(int ), (int)146)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v28 /* !! */  == lu.iehs("ifsb", ieho(int ), (int)285)) break;
            v28 /* !! */  = (long)lu.iehs("ifsd", ieho(int ), (int)286);
        }
        v26.put(v27);
        if (var8_10 || var8_10) ** GOTO lbl29
        if (var9_9 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_9 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_6 = lu.pn - lu.iehs("ifsg", iehy(int ), (int)147)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == lu.iehs("ifsh", ieho(int ), (int)287)) break;
                    v29 /* !! */  = (long)lu.iehs("ifsj", ieho(int ), (int)288);
                }
                v30 = var0.putFloat(var6_6);
                while (true) {
                    if ((v31 /* !! */  = (cfr_temp_7 = lu.pn - lu.iehs("ifsl", iehy(int ), (int)148)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v31 /* !! */  == lu.iehs("ifsm", ieho(int ), (int)289)) break;
                    v31 /* !! */  = (long)lu.iehs("ifso", ieho(int ), (int)290);
                }
                v30.putFloat(var7_7);
                if (var8_10 || var8_10) ** continue;
                return;
            }
lbl155:
            // 2 sources

            case 0: {
                do {
                    var9_9 /* !! */  = (int)lu.iehs("ifsq", ieho(int ), (int)291);
                } while (!var10_8);
                throw null;
            }
            case 1: {
                var9_9 /* !! */  = (int)lu.iehs("ifsr", ieho(int ), (int)292);
                if (var10_8) {
                    throw null;
                }
                ** GOTO lbl174
            }
            case 2: {
                var9_9 /* !! */  = (int)lu.iehs("ifst", ieho(int ), (int)293);
                if (var10_8) {
                    throw null;
                }
                ** GOTO lbl184
            }
lbl170:
            // 2 sources

            case 3: {
                var9_9 /* !! */  = (int)lu.iehs("ifsu", ieho(int ), (int)294);
                if (!var10_8) ** GOTO lbl155
                throw null;
            }
lbl174:
            // 2 sources

            case 4: {
                var9_9 /* !! */  = (int)lu.iehs("ifsw", ieho(int ), (int)295);
                if (var10_8) {
                    throw null;
                }
                ** GOTO lbl184
            }
lbl179:
            // 2 sources

            case 5: {
                do {
                    var9_9 /* !! */  = (int)lu.iehs("ifsx", ieho(int ), (int)296);
                } while (!var10_8);
                throw null;
            }
lbl184:
            // 3 sources

            case 6: {
                var9_9 /* !! */  = (int)lu.iehs("ifsz", ieho(int ), (int)297);
                if (!var10_8) ** GOTO lbl179
                throw null;
            }
            case 7: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var9_9 /* !! */  = (int)lu.iehs("iftb", ieho(int ), (int)298);
                    if (!var10_8) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 8: {
                var9_9 /* !! */  = (int)lu.iehs("iftc", ieho(int ), (int)299);
                if (!var10_8) ** GOTO lbl170
                throw null;
            }
            case 9: 
        }
        var9_9 /* !! */  = (int)lu.iehs("ifte", ieho(int ), (int)300);
        ** while (!var10_8)
lbl200:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$end$0() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lu.pn - lu.iehs("igci", iehy(int ), (int)244)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == lu.iehs("igcj", ieho(int ), (int)353)) break;
            v0 /* !! */  = (long)lu.iehs("igck", ieho(int ), (int)354);
        }
        var2 = lu.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = lu.pn - lu.iehs("igcl", iehy(int ), (int)245)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == lu.iehs("igcm", ieho(int ), (int)355)) break;
            v1 /* !! */  = (long)lu.iehs("igcn", ieho(int ), (int)356);
        }
        var1_1 = lu.b;
        v2 /* !! */  = lu.pn;
        if (true) ** GOTO lbl19
        block8: while (true) {
            v2 /* !! */  = (long)(v3 - lu.iehs("igco", iehy(int ), (int)246));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -45759476: {
                    break block8;
                }
                case 119413504: {
                    v3 = lu.iehs("igcp", iehy(int ), (int)247);
                    continue block8;
                }
                case 1316098423: {
                    v3 = lu.iehs("igcq", iehy(int ), (int)248);
                    continue block8;
                }
                case 2010572391: {
                    v3 = lu.iehs("igcr", iehy(int ), (int)249);
                    continue block8;
                }
            }
            break;
        }
        var0_2 = lu.a;
        if (var2) {
            throw null;
lbl34:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl37:
        // 1 sources

        return "Lightning3D";
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void begin(boolean var0) {
        v0 /* !! */  = lu.pn;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(lu.iehs("iejv", iehy(int ), (int)16) - lu.iehs("ieju", iehy(int ), (int)15));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -45759476: {
                    break block24;
                }
                case 326363105: {
                    continue block24;
                }
            }
            break;
        }
        var3_1 = lu.c;
        v1 /* !! */  = lu.pn;
        if (true) ** GOTO lbl15
        block25: while (true) {
            v1 /* !! */  = (long)(lu.iehs("iejy", iehy(int ), (int)18) - lu.iehs("iejw", iehy(int ), (int)17));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -45759476: {
                    break block25;
                }
                case 2012255140: {
                    continue block25;
                }
            }
            break;
        }
        var2_2 /* !! */  = lu.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = lu.pn - lu.iehs("iejz", iehy(int ), (int)19)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == lu.iehs("ieka", ieho(int ), (int)17)) break;
            v2 /* !! */  = (long)lu.iehs("iekb", ieho(int ), (int)18);
        }
        var1_3 = lu.a;
        if (!var3_1) ** GOTO lbl33
        throw null;
lbl-1000:
        // 4 sources

        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl33:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl-1000
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = lu.pn - lu.iehs("iekd", iehy(int ), (int)20)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == lu.iehs("iekf", ieho(int ), (int)19)) break;
                    v3 /* !! */  = (long)lu.iehs("iekg", ieho(int ), (int)20);
                }
                lu.init();
                if (var1_3 || var1_3) ** GOTO lbl-1000
                v4 = lu.iehs("ieki", ieho(int ), (int)21);
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = lu.pn - lu.iehs("iekj", iehy(int ), (int)21)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == lu.iehs("iekl", ieho(int ), (int)22)) break;
                    v5 /* !! */  = (long)lu.iehs("iekm", ieho(int ), (int)23);
                }
                lu.segmentCount = (int)v4;
                if (var1_3 || var1_3) ** GOTO lbl-1000
                v6 /* !! */  = lu.pn;
                if (true) ** GOTO lbl53
                block30: while (true) {
                    v6 /* !! */  = (long)(lu.iehs("iekp", iehy(int ), (int)23) - lu.iehs("ieko", iehy(int ), (int)22));
lbl53:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -45759476: {
                            break block30;
                        }
                        case 190640301: {
                            continue block30;
                        }
                    }
                    break;
                }
                lu.ignoreDepth = var0;
                if (var1_3 || var1_3) continue block27;
                return;
lbl61:
                // 2 sources

                case 0: {
                    var2_2 /* !! */  = (int)lu.iehs("iekt", ieho(int ), (int)24);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl96
                }
                case 1: {
                    var2_2 /* !! */  = (int)lu.iehs("ieku", ieho(int ), (int)25);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)lu.iehs("iekv", ieho(int ), (int)26);
                        if (!var3_1) break block27;
                        throw null;
                    }
                }
                case 3: {
                    var2_2 /* !! */  = (int)lu.iehs("ieky", ieho(int ), (int)27);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl96
                }
                case 4: {
                    var2_2 /* !! */  = (int)lu.iehs("iekz", ieho(int ), (int)28);
                    if (!var3_1) ** GOTO lbl61
                    throw null;
                }
lbl84:
                // 3 sources

                case 5: {
                    var2_2 /* !! */  = (int)lu.iehs("ielh", ieho(int ), (int)29);
                    if (var3_1) {
                        throw null;
                    }
                }
lbl88:
                // 4 sources

                case 6: {
                    var2_2 /* !! */  = (int)lu.iehs("ielj", ieho(int ), (int)30);
                    if (!var3_1) ** GOTO lbl84
                    throw null;
                }
                case 7: {
                    var2_2 /* !! */  = (int)lu.iehs("ielk", ieho(int ), (int)31);
                    if (!var3_1) ** GOTO lbl88
                    throw null;
                }
lbl96:
                // 3 sources

                case 8: {
                    var2_2 /* !! */  = (int)lu.iehs("iell", ieho(int ), (int)32);
                    if (!var3_1) ** GOTO lbl84
                    throw null;
                }
                case 9: 
            }
        }
        var2_2 /* !! */  = (int)lu.iehs("ieln", ieho(int ), (int)33);
        ** while (!var3_1)
lbl103:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long iehy(int n2) {
        return iehz[n2] ^ ieia[n2];
    }

    private static /* synthetic */ void igds() {
        lu.ieia[100] = 3414657506230931826L;
        lu.ieia[101] = -1250244006938372233L;
        lu.ieia[102] = 8071700297523063317L;
        lu.ieia[103] = 1400836076736040479L;
        lu.ieia[104] = 1548269413391153887L;
        lu.ieia[105] = -3069270334521941004L;
        lu.ieia[106] = 235223112489282548L;
        lu.ieia[107] = 1876024529960781031L;
        lu.ieia[108] = -3506086269735867381L;
        lu.ieia[109] = -7153524573270658926L;
        lu.ieia[110] = -149567478889007632L;
        lu.ieia[111] = -6827418970788593942L;
        lu.ieia[112] = 763678700454537628L;
        lu.ieia[113] = 2279205598406293276L;
        lu.ieia[114] = -4052613271153005909L;
        lu.ieia[115] = 8079317228504607667L;
        lu.ieia[116] = 202424191298226841L;
        lu.ieia[117] = 6886286710020863482L;
        lu.ieia[118] = -6104650497823422579L;
        lu.ieia[119] = 3652740944457683940L;
        lu.ieia[120] = 4439417012074294012L;
        lu.ieia[121] = -2968960903810453900L;
        lu.ieia[122] = -8009393101915862473L;
        lu.ieia[123] = 7447259071160494016L;
        lu.ieia[124] = 1872829066604391354L;
        lu.ieia[125] = -2169446054876319241L;
        lu.ieia[126] = -3657365053303034245L;
        lu.ieia[127] = -6583291927536849959L;
        lu.ieia[128] = 1845677495483601925L;
        lu.ieia[129] = -1856223059827715711L;
        lu.ieia[130] = 2793085408291425616L;
        lu.ieia[131] = -3565457262684022099L;
        lu.ieia[132] = -608360546860756987L;
        lu.ieia[133] = 4650846599686950749L;
        lu.ieia[134] = -4446719805165621048L;
        lu.ieia[135] = 4302980492111860168L;
        lu.ieia[136] = -1546329963364351619L;
        lu.ieia[137] = 8934867766508603384L;
        lu.ieia[138] = 1577122882587277686L;
        lu.ieia[139] = 8198621549201745901L;
        lu.ieia[140] = 2301921190511260321L;
        lu.ieia[141] = -5735684002862461611L;
        lu.ieia[142] = -2710127346246176066L;
        lu.ieia[143] = 7294636700543794441L;
        lu.ieia[144] = -3395173112649413795L;
        lu.ieia[145] = 4733873527512155261L;
        lu.ieia[146] = -8120535280783871064L;
        lu.ieia[147] = -1712326940068552755L;
        lu.ieia[148] = -4393400271158369878L;
        lu.ieia[149] = 861641783424993395L;
        lu.ieia[150] = 3067372235172341761L;
        lu.ieia[151] = -5410484061532346349L;
        lu.ieia[152] = 2726121331290876795L;
        lu.ieia[153] = 1551965714126701903L;
        lu.ieia[154] = -8908547073730424119L;
        lu.ieia[155] = -2096774802708842618L;
        lu.ieia[156] = -154482225963790481L;
        lu.ieia[157] = -8915334836340216959L;
        lu.ieia[158] = 8553817013558117574L;
        lu.ieia[159] = 933204791395609486L;
        lu.ieia[160] = 5897739391048260818L;
        lu.ieia[161] = -7765790104193201884L;
        lu.ieia[162] = -8325605645023769075L;
        lu.ieia[163] = 3797702891570907118L;
        lu.ieia[164] = -8031961882383382202L;
        lu.ieia[165] = 5605131962665507449L;
        lu.ieia[166] = 2357354785760314701L;
        lu.ieia[167] = -1464093486523356861L;
        lu.ieia[168] = 4208262281681120563L;
        lu.ieia[169] = 3187880544298455649L;
        lu.ieia[170] = -6446606698075364355L;
        lu.ieia[171] = 84580610555242225L;
        lu.ieia[172] = 6696724947820157343L;
        lu.ieia[173] = -7290744617829300457L;
        lu.ieia[174] = 2933049122539356661L;
        lu.ieia[175] = 1323211094907098588L;
        lu.ieia[176] = -3515494766909474575L;
        lu.ieia[177] = -1341784711562424833L;
        lu.ieia[178] = -8074316954001427795L;
        lu.ieia[179] = -76838678501375155L;
        lu.ieia[180] = 4636338399649924671L;
        lu.ieia[181] = -5087175718232166494L;
        lu.ieia[182] = 4900306882653763390L;
        lu.ieia[183] = -5039503579419043237L;
        lu.ieia[184] = -5211173999192412438L;
        lu.ieia[185] = 8026279363808649568L;
        lu.ieia[186] = 1674684053684892090L;
        lu.ieia[187] = -1279630470394541755L;
        lu.ieia[188] = 5221306110468094427L;
        lu.ieia[189] = -6714051215285755379L;
        lu.ieia[190] = 8208938903368469099L;
        lu.ieia[191] = -9103128546163203598L;
        lu.ieia[192] = 5880257928513234720L;
        lu.ieia[193] = 6300419996166677239L;
        lu.ieia[194] = -2645244184379833537L;
        lu.ieia[195] = 5090141318440936389L;
        lu.ieia[196] = -1783316974350826910L;
        lu.ieia[197] = -1485803888461905898L;
        lu.ieia[198] = 189001530424918395L;
        lu.ieia[199] = 8939978717922822998L;
    }

    private static /* synthetic */ void igdi() {
        lu.iehz[100] = -4605766845156760156L;
        lu.iehz[101] = 2607414882569147286L;
        lu.iehz[102] = 3638645629125133414L;
        lu.iehz[103] = -2171283228825247996L;
        lu.iehz[104] = 844179009112365238L;
        lu.iehz[105] = 3515895351926051570L;
        lu.iehz[106] = -5906617789714445422L;
        lu.iehz[107] = -718995196530698408L;
        lu.iehz[108] = 8342947089578504546L;
        lu.iehz[109] = 2313284409101504518L;
        lu.iehz[110] = -149567478889007760L;
        lu.iehz[111] = -6291774633334439180L;
        lu.iehz[112] = -6959284195898169454L;
        lu.iehz[113] = 2635131227404395683L;
        lu.iehz[114] = -6989253602807294631L;
        lu.iehz[115] = -566228014823292426L;
        lu.iehz[116] = 6740293446319789171L;
        lu.iehz[117] = 3080051500090117260L;
        lu.iehz[118] = -4138967043240585531L;
        lu.iehz[119] = 3652740944457798628L;
        lu.iehz[120] = -8350852509293396204L;
        lu.iehz[121] = 8419069694052842912L;
        lu.iehz[122] = -6116000437698108038L;
        lu.iehz[123] = -2461074041358960059L;
        lu.iehz[124] = -1306735394135892487L;
        lu.iehz[125] = 6536383824273061919L;
        lu.iehz[126] = 6314558278589626332L;
        lu.iehz[127] = -2643512551999633091L;
        lu.iehz[128] = -2827702949375195033L;
        lu.iehz[129] = -2660326102544245834L;
        lu.iehz[130] = 4493680721484533337L;
        lu.iehz[131] = -5081348686222068222L;
        lu.iehz[132] = 5097529767516248021L;
        lu.iehz[133] = -7505565256151402347L;
        lu.iehz[134] = -8125542660306584071L;
        lu.iehz[135] = 1319642775237370480L;
        lu.iehz[136] = 3118826369919460393L;
        lu.iehz[137] = -2894113073106846802L;
        lu.iehz[138] = -6268634448899599653L;
        lu.iehz[139] = -790922126195319960L;
        lu.iehz[140] = -739167516563481085L;
        lu.iehz[141] = 3072646666959582983L;
        lu.iehz[142] = -4515511836592138777L;
        lu.iehz[143] = 5119342771369797176L;
        lu.iehz[144] = -2958601957062659544L;
        lu.iehz[145] = 70551171863653458L;
        lu.iehz[146] = 4842982371424496650L;
        lu.iehz[147] = -3507092802877715774L;
        lu.iehz[148] = -593541993594300923L;
        lu.iehz[149] = 6155805145282152969L;
        lu.iehz[150] = 7240802999225747585L;
        lu.iehz[151] = -2980642747626812120L;
        lu.iehz[152] = -3230453130631949826L;
        lu.iehz[153] = 1930479509474404912L;
        lu.iehz[154] = 7627368136695650261L;
        lu.iehz[155] = -2264209470962792221L;
        lu.iehz[156] = 1746774273135818438L;
        lu.iehz[157] = 667283590881928750L;
        lu.iehz[158] = 9013354840176999103L;
        lu.iehz[159] = -4232654985084520679L;
        lu.iehz[160] = 4402068059720557937L;
        lu.iehz[161] = 449821894592070028L;
        lu.iehz[162] = 458183495285612858L;
        lu.iehz[163] = 7466414439667861450L;
        lu.iehz[164] = -6265912800009796515L;
        lu.iehz[165] = 6209437900163082700L;
        lu.iehz[166] = -4831813629689506187L;
        lu.iehz[167] = 6964595304708872402L;
        lu.iehz[168] = -560547081583385659L;
        lu.iehz[169] = -6882694274917281871L;
        lu.iehz[170] = -698225560881015741L;
        lu.iehz[171] = 6101797835900752332L;
        lu.iehz[172] = 6183585975623477966L;
        lu.iehz[173] = -2894140644700322476L;
        lu.iehz[174] = 2716404900076333183L;
        lu.iehz[175] = 1223151436257325152L;
        lu.iehz[176] = 8395711372711751521L;
        lu.iehz[177] = -2382940424510228134L;
        lu.iehz[178] = 5229361912639787357L;
        lu.iehz[179] = 5209928277915699642L;
        lu.iehz[180] = 4631678233701995670L;
        lu.iehz[181] = 6852129746303432152L;
        lu.iehz[182] = 3089031958471103338L;
        lu.iehz[183] = 9105558878626068256L;
        lu.iehz[184] = 3646939603112282636L;
        lu.iehz[185] = 4364634224146846396L;
        lu.iehz[186] = -192598202982044258L;
        lu.iehz[187] = 2972950675176758244L;
        lu.iehz[188] = -44866355737853851L;
        lu.iehz[189] = -2504813592429686700L;
        lu.iehz[190] = 3565753866258626851L;
        lu.iehz[191] = -2859461224976592438L;
        lu.iehz[192] = -6013252971918164748L;
        lu.iehz[193] = -2133862175299766099L;
        lu.iehz[194] = -1140782101181332304L;
        lu.iehz[195] = -6094161229641604984L;
        lu.iehz[196] = 4192264799386258930L;
        lu.iehz[197] = 2460014537751800291L;
        lu.iehz[198] = -6272037389842256502L;
        lu.iehz[199] = -3544001103721493781L;
    }
}

