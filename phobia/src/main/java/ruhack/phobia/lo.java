/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_310
 *  org.joml.Matrix4f
 *  org.lwjgl.system.MemoryUtil
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
import java.nio.Buffer;
import java.util.OptionalInt;
import java.util.function.Supplier;
import net.minecraft.class_310;
import org.joml.Matrix4f;
import org.lwjgl.system.MemoryUtil;

public class lo {
    private static GpuBuffer uniformBuffer;
    public static final int b;
    private static long[] itun;
    private static long[] ituo;
    protected static final long qj = 6034957363747681037L;
    private static int[] ituv;
    public static final boolean c;
    public static final boolean a;
    private static int[] ituw;
    private static RenderPipeline pipeline;
    private static final int UNIFORM_SIZE = 256;

    private static /* synthetic */ void iufy() {
        lo.ituw[100] = 437001269;
        lo.ituw[101] = -1516221478;
        lo.ituw[102] = 1371864441;
        lo.ituw[103] = 744918329;
        lo.ituw[104] = -1942148212;
        lo.ituw[105] = 332030541;
        lo.ituw[106] = -156981153;
        lo.ituw[107] = -555405566;
        lo.ituw[108] = 311177596;
        lo.ituw[109] = -860629164;
        lo.ituw[110] = -739062476;
        lo.ituw[111] = 0x222D999;
        lo.ituw[112] = 131378852;
        lo.ituw[113] = 232269266;
        lo.ituw[114] = 126541681;
        lo.ituw[115] = 1729190583;
        lo.ituw[116] = 1323646056;
        lo.ituw[117] = 1639543445;
        lo.ituw[118] = -1605551519;
        lo.ituw[119] = 1903775042;
        lo.ituw[120] = 833989401;
        lo.ituw[121] = 1244641703;
        lo.ituw[122] = -436279838;
        lo.ituw[123] = 431552701;
        lo.ituw[124] = 0x335E5E53;
        lo.ituw[125] = -940770076;
        lo.ituw[126] = 383411048;
        lo.ituw[127] = 860697601;
        lo.ituw[128] = 704547750;
        lo.ituw[129] = 889014220;
        lo.ituw[130] = -755906745;
        lo.ituw[131] = -1963376851;
        lo.ituw[132] = 1752514424;
        lo.ituw[133] = 2099420314;
        lo.ituw[134] = -1732074960;
        lo.ituw[135] = -1824667430;
        lo.ituw[136] = -5551063;
        lo.ituw[137] = 73014933;
        lo.ituw[138] = 1835040508;
        lo.ituw[139] = 337547923;
        lo.ituw[140] = 1516930936;
        lo.ituw[141] = -1294398043;
        lo.ituw[142] = -2052917080;
        lo.ituw[143] = 1597597827;
        lo.ituw[144] = 2141256229;
        lo.ituw[145] = -1415223512;
        lo.ituw[146] = -743119402;
        lo.ituw[147] = 1087848454;
        lo.ituw[148] = 477676862;
        lo.ituw[149] = 869084162;
        lo.ituw[150] = -1065226702;
        lo.ituw[151] = -1866427338;
        lo.ituw[152] = 218590999;
        lo.ituw[153] = 1166873117;
        lo.ituw[154] = -1081128147;
        lo.ituw[155] = 1502842091;
        lo.ituw[156] = -680802365;
        lo.ituw[157] = -351893451;
        lo.ituw[158] = -88320842;
        lo.ituw[159] = -1536268718;
        lo.ituw[160] = -1378144718;
        lo.ituw[161] = -1401083639;
        lo.ituw[162] = -80116833;
        lo.ituw[163] = 1754480811;
        lo.ituw[164] = -1591493463;
        lo.ituw[165] = 197721627;
        lo.ituw[166] = 13404685;
        lo.ituw[167] = -542764642;
        lo.ituw[168] = -985630997;
        lo.ituw[169] = -1635260032;
        lo.ituw[170] = -1899412644;
        lo.ituw[171] = -654055380;
        lo.ituw[172] = 1196879266;
        lo.ituw[173] = 587408106;
        lo.ituw[174] = 2050423785;
        lo.ituw[175] = -353195437;
        lo.ituw[176] = -2082350455;
        lo.ituw[177] = -219184974;
        lo.ituw[178] = 827269911;
        lo.ituw[179] = -738188371;
        lo.ituw[180] = -1024390102;
        lo.ituw[181] = -310637666;
        lo.ituw[182] = 1497705212;
    }

    private static /* synthetic */ void iufr() {
        lo.ituw[0] = -1094643831;
        lo.ituw[1] = -1621214133;
        lo.ituw[2] = -1908911162;
        lo.ituw[3] = 1406565714;
        lo.ituw[4] = 163677275;
        lo.ituw[5] = -1769049231;
        lo.ituw[6] = 65834485;
        lo.ituw[7] = -1042713759;
        lo.ituw[8] = 1222679234;
        lo.ituw[9] = 863175435;
        lo.ituw[10] = 453017870;
        lo.ituw[11] = 758923422;
        lo.ituw[12] = 1625017216;
        lo.ituw[13] = 623068668;
        lo.ituw[14] = 1250866781;
        lo.ituw[15] = -1609643167;
        lo.ituw[16] = 2054344187;
        lo.ituw[17] = 810847698;
        lo.ituw[18] = 1059288625;
        lo.ituw[19] = 564266655;
        lo.ituw[20] = 593460760;
        lo.ituw[21] = 1050402869;
        lo.ituw[22] = -1442544896;
        lo.ituw[23] = -572978118;
        lo.ituw[24] = 1510450590;
        lo.ituw[25] = 240621728;
        lo.ituw[26] = -1830416791;
        lo.ituw[27] = -22474202;
        lo.ituw[28] = 1390025691;
        lo.ituw[29] = -661688515;
        lo.ituw[30] = -1859773120;
        lo.ituw[31] = 2111902918;
        lo.ituw[32] = -850939254;
        lo.ituw[33] = 978985917;
        lo.ituw[34] = -1459535878;
        lo.ituw[35] = -1239907938;
        lo.ituw[36] = 1286348244;
        lo.ituw[37] = -184379986;
        lo.ituw[38] = -1437027854;
        lo.ituw[39] = 397050700;
        lo.ituw[40] = -1423003473;
        lo.ituw[41] = -104692590;
        lo.ituw[42] = -90380001;
        lo.ituw[43] = -145860130;
        lo.ituw[44] = 939430091;
        lo.ituw[45] = -1292456252;
        lo.ituw[46] = -558865267;
        lo.ituw[47] = -1692838415;
        lo.ituw[48] = 1541820964;
        lo.ituw[49] = -972572578;
        lo.ituw[50] = 191479702;
        lo.ituw[51] = -674874251;
        lo.ituw[52] = 575321936;
        lo.ituw[53] = -1170127354;
        lo.ituw[54] = -2004869603;
        lo.ituw[55] = 227905794;
        lo.ituw[56] = -246038412;
        lo.ituw[57] = 179620941;
        lo.ituw[58] = -804223317;
        lo.ituw[59] = -1270788306;
        lo.ituw[60] = -894563319;
        lo.ituw[61] = -1578247388;
        lo.ituw[62] = -1659094310;
        lo.ituw[63] = -27106013;
        lo.ituw[64] = 1648164835;
        lo.ituw[65] = -589615986;
        lo.ituw[66] = 837399030;
        lo.ituw[67] = 958055275;
        lo.ituw[68] = 1369971168;
        lo.ituw[69] = -2035280371;
        lo.ituw[70] = 1289825340;
        lo.ituw[71] = 1577574532;
        lo.ituw[72] = -1538293195;
        lo.ituw[73] = -923764002;
        lo.ituw[74] = -933721668;
        lo.ituw[75] = -1527870645;
        lo.ituw[76] = -1363798608;
        lo.ituw[77] = -201602800;
        lo.ituw[78] = -211917494;
        lo.ituw[79] = -878691003;
        lo.ituw[80] = -2055928372;
        lo.ituw[81] = 1486962190;
        lo.ituw[82] = -289117842;
        lo.ituw[83] = 4376865;
        lo.ituw[84] = 1572736173;
        lo.ituw[85] = -1742036084;
        lo.ituw[86] = 1385876320;
        lo.ituw[87] = 1496475675;
        lo.ituw[88] = -1242781376;
        lo.ituw[89] = 258687705;
        lo.ituw[90] = 1536908746;
        lo.ituw[91] = -1557868690;
        lo.ituw[92] = -22251104;
        lo.ituw[93] = 1568291191;
        lo.ituw[94] = 15502290;
        lo.ituw[95] = -1302091513;
        lo.ituw[96] = 390092731;
        lo.ituw[97] = -790297876;
        lo.ituw[98] = -1041596329;
        lo.ituw[99] = -446078086;
    }

    private static /* synthetic */ void iuez() {
        lo.ituv[0] = -1094643832;
        lo.ituv[1] = 782304471;
        lo.ituv[2] = -1908911161;
        lo.ituv[3] = -1762200667;
        lo.ituv[4] = 163677274;
        lo.ituv[5] = -836707960;
        lo.ituv[6] = 65834484;
        lo.ituv[7] = 1149974940;
        lo.ituv[8] = 1222679235;
        lo.ituv[9] = 1216304779;
        lo.ituv[10] = 453017871;
        lo.ituv[11] = -1514568962;
        lo.ituv[12] = 1625017217;
        lo.ituv[13] = 171665027;
        lo.ituv[14] = 1250866780;
        lo.ituv[15] = -1149204961;
        lo.ituv[16] = 2054344186;
        lo.ituv[17] = 776296502;
        lo.ituv[18] = 1059288624;
        lo.ituv[19] = -2025756590;
        lo.ituv[20] = 593460761;
        lo.ituv[21] = 1006324958;
        lo.ituv[22] = -1442544895;
        lo.ituv[23] = -850947087;
        lo.ituv[24] = 1510450591;
        lo.ituv[25] = -353365458;
        lo.ituv[26] = -1830416791;
        lo.ituv[27] = 22474201;
        lo.ituv[28] = 2024139056;
        lo.ituv[29] = 661688514;
        lo.ituv[30] = -838447889;
        lo.ituv[31] = 2111902919;
        lo.ituv[32] = 807853134;
        lo.ituv[33] = 978985916;
        lo.ituv[34] = 190872615;
        lo.ituv[35] = -1239908074;
        lo.ituv[36] = 1286348245;
        lo.ituv[37] = -1471621826;
        lo.ituv[38] = -1437027850;
        lo.ituv[39] = 397050689;
        lo.ituv[40] = -1423003483;
        lo.ituv[41] = -104692590;
        lo.ituv[42] = -90380017;
        lo.ituv[43] = -145860143;
        lo.ituv[44] = 939430080;
        lo.ituv[45] = -1292456253;
        lo.ituv[46] = -558865251;
        lo.ituv[47] = -1692838402;
        lo.ituv[48] = 1541820965;
        lo.ituv[49] = -972572577;
        lo.ituv[50] = 191479706;
        lo.ituv[51] = -674874244;
        lo.ituv[52] = 575321950;
        lo.ituv[53] = -1170127349;
        lo.ituv[54] = -2004869613;
        lo.ituv[55] = 227905804;
        lo.ituv[56] = -246038156;
        lo.ituv[57] = 179620957;
        lo.ituv[58] = -804223404;
        lo.ituv[59] = -146911442;
        lo.ituv[60] = -894563327;
        lo.ituv[61] = -1578247205;
        lo.ituv[62] = -563922214;
        lo.ituv[63] = -27105828;
        lo.ituv[64] = 558104547;
        lo.ituv[65] = -589615978;
        lo.ituv[66] = 837398793;
        lo.ituv[67] = 2053489515;
        lo.ituv[68] = 366090720;
        lo.ituv[69] = -2035280371;
        lo.ituv[70] = 1289825338;
        lo.ituv[71] = 1577574583;
        lo.ituv[72] = -1538293186;
        lo.ituv[73] = -923763991;
        lo.ituv[74] = -933721721;
        lo.ituv[75] = -1527870651;
        lo.ituv[76] = -1363798615;
        lo.ituv[77] = -201602769;
        lo.ituv[78] = -211917472;
        lo.ituv[79] = -878690973;
        lo.ituv[80] = -2055928328;
        lo.ituv[81] = 1486962230;
        lo.ituv[82] = -289117828;
        lo.ituv[83] = 4376873;
        lo.ituv[84] = 1572736163;
        lo.ituv[85] = -1742036095;
        lo.ituv[86] = 1385876320;
        lo.ituv[87] = 1496475670;
        lo.ituv[88] = -1242781337;
        lo.ituv[89] = 258687693;
        lo.ituv[90] = 1536908784;
        lo.ituv[91] = -1557868688;
        lo.ituv[92] = -22251121;
        lo.ituv[93] = 1568291193;
        lo.ituv[94] = 15502300;
        lo.ituv[95] = -1302091457;
        lo.ituv[96] = 390092794;
        lo.ituv[97] = -790297894;
        lo.ituv[98] = -1041596294;
        lo.ituv[99] = -446078157;
    }

    public static /* synthetic */ CallSite itup(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void draw(Matrix4f var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, float var8_8, float var9_9, int var10_10) {
        block155: {
            block154: {
                block153: {
                    var19_11 = lo.c;
                    var18_12 /* !! */  = lo.b;
                    var17_13 = lo.a;
                    if (var19_11) {
                        throw null;
lbl6:
                        // 42 sources

                        return;
                    }
                    if (var17_13 || var17_13) ** GOTO lbl6
                    if (lo.pipeline != null) break block153;
                    if (var17_13 || var17_13) ** GOTO lbl6
                    lo.init();
                    if (var17_13) ** GOTO lbl6
                }
                if (var17_13 || var17_13) ** GOTO lbl6
                if (lo.pipeline == null) break block154;
                if (var17_13) ** GOTO lbl6
                if (lo.uniformBuffer != null) break block155;
                if (var17_13) ** GOTO lbl6
            }
            if (var17_13 || var17_13) ** GOTO lbl6
            return;
        }
        if (var17_13 || var17_13) ** GOTO lbl6
        var11_14 = MemoryUtil.memAlloc((int)lo.itup("ityv", ituu(int ), (int)56));
        if (var17_13 || var17_13) ** GOTO lbl6
        var11_14.putFloat(var0.m00()).putFloat(var0.m01()).putFloat(var0.m02()).putFloat(var0.m03());
        if (var17_13 || var17_13) ** GOTO lbl6
        var11_14.putFloat(var0.m10()).putFloat(var0.m11()).putFloat(var0.m12()).putFloat(var0.m13());
        if (var17_13 || var17_13) ** GOTO lbl6
        var11_14.putFloat(var0.m20()).putFloat(var0.m21()).putFloat(var0.m22()).putFloat(var0.m23());
        if (var17_13 || var17_13) ** GOTO lbl6
        var11_14.putFloat(var0.m30()).putFloat(var0.m31()).putFloat(var0.m32()).putFloat(var0.m33());
        if (var17_13 || var17_13) ** GOTO lbl6
        var11_14.putFloat(var1_1).putFloat(var2_2).putFloat(var3_3).putFloat(var4_4);
        if (var17_13 || var17_13) ** GOTO lbl6
        var11_14.putFloat(var7_7).putFloat(var6_6).putFloat(var8_8).putFloat(var5_5);
        if (var17_13 || var17_13) ** GOTO lbl6
        var11_14.putFloat((float)(var10_10 >> lo.itup("ityw", ituu(int ), (int)57) & lo.itup("ityx", ituu(int ), (int)58)) / lo.itup("ityz", ityy(int ), (int)59));
        if (var17_13 || var17_13) ** GOTO lbl6
        var11_14.putFloat((float)(var10_10 >> lo.itup("itza", ituu(int ), (int)60) & lo.itup("itzb", ituu(int ), (int)61)) / lo.itup("itzc", ityy(int ), (int)62));
        if (var17_13 || var17_13) ** GOTO lbl6
        var11_14.putFloat((float)(var10_10 & lo.itup("itzd", ituu(int ), (int)63)) / lo.itup("itze", ityy(int ), (int)64));
        if (var17_13 || var17_13) ** GOTO lbl6
        var11_14.putFloat((float)(var10_10 >> lo.itup("itzf", ituu(int ), (int)65) & lo.itup("itzg", ituu(int ), (int)66)) / lo.itup("itzh", ityy(int ), (int)67));
        if (var17_13 || var17_13) ** GOTO lbl6
        var11_14.putFloat((float)(System.currentTimeMillis() % lo.itup("itzi", itum(int ), (int)50)) / lo.itup("itzj", ityy(int ), (int)68));
        if (var18_12 /* !! */  == 0) ** GOTO lbl-1000
        switch (var18_12 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var17_13 || var17_13) ** GOTO lbl6
                var11_14.putFloat(var9_9);
                if (var17_13 || var17_13) ** GOTO lbl6
                var11_14.putFloat(0.0f).putFloat(0.0f);
                if (var17_13 || var17_13) ** GOTO lbl6
                var11_14.flip();
                if (var17_13 || var17_13) ** GOTO lbl6
                var12_15 = RenderSystem.getDevice().createCommandEncoder();
                if (var17_13 || var17_13) ** GOTO lbl6
                var12_15.writeToBuffer(lo.uniformBuffer.slice(), var11_14);
                if (var17_13 || var17_13) ** GOTO lbl6
                MemoryUtil.memFree((Buffer)var11_14);
                if (var17_13 || var17_13) ** GOTO lbl6
                var13_16 = class_310.method_1551().method_1522();
                if (var17_13 || var17_13) ** GOTO lbl6
                var14_17 = var12_15.createRenderPass((Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$draw$1(), ()Ljava/lang/String;)(), var13_16.method_71639(), OptionalInt.empty());
                if (var17_13) ** GOTO lbl6
                try {
                    if (var17_13) ** GOTO lbl6
                    var14_17.setPipeline(lo.pipeline);
                    if (var17_13 || var17_13) ** GOTO lbl6
                    var14_17.setUniform("Uniforms", lo.uniformBuffer);
                    if (var17_13 || var17_13) ** GOTO lbl6
                    var14_17.draw((int)lo.itup("itzk", ituu(int ), (int)69), (int)lo.itup("itzl", ituu(int ), (int)70));
                    if (var17_13 || var17_13) ** GOTO lbl6
                    if (var14_17 == null) ** GOTO lbl113
                    if (var17_13) ** GOTO lbl6
                }
                catch (Throwable var15_18) {
                    if (var17_13) ** GOTO lbl6
                    if (var14_17 == null) ** GOTO lbl106
                    if (var17_13) ** GOTO lbl6
                    try {
                        if (var17_13) ** GOTO lbl6
                        var14_17.close();
                        if (var17_13 || var17_13) ** GOTO lbl6
                        ** if (!var19_11) goto lbl-1000
                    }
                    catch (Throwable var16_19) {
                        if (var17_13) ** GOTO lbl6
                        var15_18.addSuppressed(var16_19);
                        if (var17_13) ** GOTO lbl6
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
lbl106:
                    // 3 sources

                    if (var17_13 || var17_13) ** GOTO lbl6
                    throw var15_18;
                }
                var14_17.close();
                if (var17_13) ** GOTO lbl6
                if (var19_11) {
                    throw null;
                }
lbl113:
                // 3 sources

                if (!var17_13 && !var17_13) ** break;
                ** continue;
                return;
            }
lbl116:
            // 4 sources

            case 0: {
                var18_12 /* !! */  = (int)lo.itup("itzm", ituu(int ), (int)71);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl411
            }
lbl121:
            // 3 sources

            case 1: {
                var18_12 /* !! */  = (int)lo.itup("itzn", ituu(int ), (int)72);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl126:
            // 2 sources

            case 2: {
                var18_12 /* !! */  = (int)lo.itup("itzo", ituu(int ), (int)73);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl433
            }
            case 3: {
                var18_12 /* !! */  = (int)lo.itup("itzp", ituu(int ), (int)74);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl154
            }
            case 4: {
                var18_12 /* !! */  = (int)lo.itup("itzq", ituu(int ), (int)75);
                if (!var19_11) ** GOTO lbl116
                throw null;
            }
            case 5: {
                var18_12 /* !! */  = (int)lo.itup("itzr", ituu(int ), (int)76);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl209
            }
            case 6: {
                var18_12 /* !! */  = (int)lo.itup("itzs", ituu(int ), (int)77);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl336
            }
lbl150:
            // 2 sources

            case 7: {
                var18_12 /* !! */  = (int)lo.itup("itzt", ituu(int ), (int)78);
                if (!var19_11) ** GOTO lbl126
                throw null;
            }
lbl154:
            // 4 sources

            case 8: {
                var18_12 /* !! */  = (int)lo.itup("itzu", ituu(int ), (int)79);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl344
            }
lbl159:
            // 2 sources

            case 9: {
                var18_12 /* !! */  = (int)lo.itup("itzv", ituu(int ), (int)80);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl407
            }
lbl164:
            // 2 sources

            case 10: {
                var18_12 /* !! */  = (int)lo.itup("itzw", ituu(int ), (int)81);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl251
            }
lbl169:
            // 3 sources

            case 11: {
                var18_12 /* !! */  = (int)lo.itup("itzx", ituu(int ), (int)82);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl340
            }
            case 12: {
                var18_12 /* !! */  = (int)lo.itup("itzy", ituu(int ), (int)83);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl354
            }
            case 13: {
                var18_12 /* !! */  = (int)lo.itup("itzz", ituu(int ), (int)84);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl368
            }
lbl184:
            // 2 sources

            case 14: {
                var18_12 /* !! */  = (int)lo.itup("iuaa", ituu(int ), (int)85);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl275
            }
lbl189:
            // 2 sources

            case 15: {
                var18_12 /* !! */  = (int)lo.itup("iuab", ituu(int ), (int)86);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl377
            }
lbl194:
            // 2 sources

            case 16: {
                var18_12 /* !! */  = (int)lo.itup("iuac", ituu(int ), (int)87);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl402
            }
lbl199:
            // 2 sources

            case 17: {
                var18_12 /* !! */  = (int)lo.itup("iuad", ituu(int ), (int)88);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl393
            }
lbl204:
            // 2 sources

            case 18: {
                var18_12 /* !! */  = (int)lo.itup("iuae", ituu(int ), (int)89);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl385
            }
lbl209:
            // 2 sources

            case 19: {
                var18_12 /* !! */  = (int)lo.itup("iuaf", ituu(int ), (int)90);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl344
            }
            case 20: {
                var18_12 /* !! */  = (int)lo.itup("iuag", ituu(int ), (int)91);
                if (!var19_11) ** GOTO lbl184
                throw null;
            }
            case 21: {
                var18_12 /* !! */  = (int)lo.itup("iuah", ituu(int ), (int)92);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl251
            }
            case 22: {
                var18_12 /* !! */  = (int)lo.itup("iuai", ituu(int ), (int)93);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl354
            }
lbl228:
            // 3 sources

            case 23: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var18_12 /* !! */  = (int)lo.itup("iuaj", ituu(int ), (int)94);
                    if (var19_11) {
                        throw null;
                    }
                    ** GOTO lbl284
                    break;
                }
            }
            case 24: {
                var18_12 /* !! */  = (int)lo.itup("iuak", ituu(int ), (int)95);
                if (!var19_11) ** GOTO lbl169
                throw null;
            }
lbl238:
            // 2 sources

            case 25: {
                var18_12 /* !! */  = (int)lo.itup("iual", ituu(int ), (int)96);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl407
            }
            case 26: {
                var18_12 /* !! */  = (int)lo.itup("iuam", ituu(int ), (int)97);
                if (!var19_11) ** GOTO lbl121
                throw null;
            }
lbl247:
            // 2 sources

            case 27: {
                var18_12 /* !! */  = (int)lo.itup("iuan", ituu(int ), (int)98);
                if (!var19_11) ** GOTO lbl116
                throw null;
            }
lbl251:
            // 3 sources

            case 28: {
                var18_12 /* !! */  = (int)lo.itup("iuao", ituu(int ), (int)99);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl327
            }
            case 29: {
                var18_12 /* !! */  = (int)lo.itup("iuap", ituu(int ), (int)100);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl327
            }
lbl261:
            // 2 sources

            case 30: {
                var18_12 /* !! */  = (int)lo.itup("iuaq", ituu(int ), (int)101);
                if (!var19_11) ** GOTO lbl194
                throw null;
            }
lbl265:
            // 2 sources

            case 31: {
                var18_12 /* !! */  = (int)lo.itup("iuar", ituu(int ), (int)102);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl306
            }
            case 32: {
                var18_12 /* !! */  = (int)lo.itup("iuas", ituu(int ), (int)103);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl425
            }
lbl275:
            // 2 sources

            case 33: {
                var18_12 /* !! */  = (int)lo.itup("iuat", ituu(int ), (int)104);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl389
            }
            case 34: {
                var18_12 /* !! */  = (int)lo.itup("iuau", ituu(int ), (int)105);
                if (!var19_11) ** GOTO lbl189
                throw null;
            }
lbl284:
            // 2 sources

            case 35: {
                var18_12 /* !! */  = (int)lo.itup("iuav", ituu(int ), (int)106);
                if (!var19_11) ** GOTO lbl228
                throw null;
            }
            case 36: {
                var18_12 /* !! */  = (int)lo.itup("iuaw", ituu(int ), (int)107);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl407
            }
lbl293:
            // 2 sources

            case 37: {
                var18_12 /* !! */  = (int)lo.itup("iuax", ituu(int ), (int)108);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl445
            }
            case 38: {
                var18_12 /* !! */  = (int)lo.itup("iuay", ituu(int ), (int)109);
                if (!var19_11) ** GOTO lbl204
                throw null;
            }
lbl302:
            // 2 sources

            case 39: {
                var18_12 /* !! */  = (int)lo.itup("iuaz", ituu(int ), (int)110);
                if (!var19_11) ** GOTO lbl228
                throw null;
            }
lbl306:
            // 2 sources

            case 40: {
                var18_12 /* !! */  = (int)lo.itup("iuba", ituu(int ), (int)111);
                if (!var19_11) ** GOTO lbl247
                throw null;
            }
            case 41: {
                var18_12 /* !! */  = (int)lo.itup("iubb", ituu(int ), (int)112);
                if (!var19_11) ** GOTO lbl293
                throw null;
            }
            case 42: {
                var18_12 /* !! */  = (int)lo.itup("iubc", ituu(int ), (int)113);
                if (!var19_11) ** GOTO lbl261
                throw null;
            }
            case 43: {
                var18_12 /* !! */  = (int)lo.itup("iubd", ituu(int ), (int)114);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl420
            }
            case 44: {
                var18_12 /* !! */  = (int)lo.itup("iube", ituu(int ), (int)115);
                if (!var19_11) ** GOTO lbl154
                throw null;
            }
lbl327:
            // 3 sources

            case 45: {
                var18_12 /* !! */  = (int)lo.itup("iubf", ituu(int ), (int)116);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl437
            }
            case 46: {
                var18_12 /* !! */  = (int)lo.itup("iubg", ituu(int ), (int)117);
                if (!var19_11) ** GOTO lbl302
                throw null;
            }
lbl336:
            // 2 sources

            case 47: {
                var18_12 /* !! */  = (int)lo.itup("iubh", ituu(int ), (int)118);
                if (!var19_11) ** GOTO lbl199
                throw null;
            }
lbl340:
            // 2 sources

            case 48: {
                var18_12 /* !! */  = (int)lo.itup("iubi", ituu(int ), (int)119);
                if (!var19_11) ** GOTO lbl121
                throw null;
            }
lbl344:
            // 3 sources

            case 49: {
                var18_12 /* !! */  = (int)lo.itup("iubj", ituu(int ), (int)120);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl377
            }
lbl349:
            // 2 sources

            case 50: {
                var18_12 /* !! */  = (int)lo.itup("iubk", ituu(int ), (int)121);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl449
            }
lbl354:
            // 5 sources

            case 51: {
                var18_12 /* !! */  = (int)lo.itup("iubl", ituu(int ), (int)122);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl407
            }
            case 52: {
                var18_12 /* !! */  = (int)lo.itup("iubm", ituu(int ), (int)123);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl429
            }
lbl364:
            // 3 sources

            case 53: {
                var18_12 /* !! */  = (int)lo.itup("iubn", ituu(int ), (int)124);
                if (!var19_11) ** GOTO lbl238
                throw null;
            }
lbl368:
            // 3 sources

            case 54: {
                var18_12 /* !! */  = (int)lo.itup("iubo", ituu(int ), (int)125);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl407
            }
            case 55: {
                var18_12 /* !! */  = (int)lo.itup("iubp", ituu(int ), (int)126);
                if (!var19_11) ** GOTO lbl169
                throw null;
            }
lbl377:
            // 3 sources

            case 56: {
                var18_12 /* !! */  = (int)lo.itup("iubq", ituu(int ), (int)127);
                if (!var19_11) ** GOTO lbl159
                throw null;
            }
            case 57: {
                var18_12 /* !! */  = (int)lo.itup("iubr", ituu(int ), (int)128);
                if (!var19_11) ** GOTO lbl364
                throw null;
            }
lbl385:
            // 2 sources

            case 58: {
                var18_12 /* !! */  = (int)lo.itup("iubs", ituu(int ), (int)129);
                if (!var19_11) ** GOTO lbl116
                throw null;
            }
lbl389:
            // 2 sources

            case 59: {
                var18_12 /* !! */  = (int)lo.itup("iubt", ituu(int ), (int)130);
                if (!var19_11) ** GOTO lbl164
                throw null;
            }
lbl393:
            // 3 sources

            case 60: {
                var18_12 /* !! */  = (int)lo.itup("iubu", ituu(int ), (int)131);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl415
            }
            case 61: {
                var18_12 /* !! */  = (int)lo.itup("iubv", ituu(int ), (int)132);
                if (!var19_11) ** GOTO lbl364
                throw null;
            }
lbl402:
            // 3 sources

            case 62: {
                do {
                    var18_12 /* !! */  = (int)lo.itup("iubw", ituu(int ), (int)133);
                } while (!var19_11);
                throw null;
            }
lbl407:
            // 6 sources

            case 63: {
                var18_12 /* !! */  = (int)lo.itup("iubx", ituu(int ), (int)134);
                if (var19_11) {
                    throw null;
                }
            }
lbl411:
            // 4 sources

            case 64: {
                var18_12 /* !! */  = (int)lo.itup("iuby", ituu(int ), (int)135);
                if (!var19_11) ** GOTO lbl265
                throw null;
            }
lbl415:
            // 2 sources

            case 65: {
                var18_12 /* !! */  = (int)lo.itup("iubz", ituu(int ), (int)136);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl449
            }
lbl420:
            // 2 sources

            case 66: {
                var18_12 /* !! */  = (int)lo.itup("iuca", ituu(int ), (int)137);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl433
            }
lbl425:
            // 2 sources

            case 67: {
                var18_12 /* !! */  = (int)lo.itup("iucb", ituu(int ), (int)138);
                if (!var19_11) ** GOTO lbl402
                throw null;
            }
lbl429:
            // 2 sources

            case 68: {
                var18_12 /* !! */  = (int)lo.itup("iucc", ituu(int ), (int)139);
                if (!var19_11) ** GOTO lbl354
                throw null;
            }
lbl433:
            // 3 sources

            case 69: {
                var18_12 /* !! */  = (int)lo.itup("iucd", ituu(int ), (int)140);
                if (!var19_11) ** GOTO lbl393
                throw null;
            }
lbl437:
            // 2 sources

            case 70: {
                var18_12 /* !! */  = (int)lo.itup("iuce", ituu(int ), (int)141);
                if (!var19_11) ** GOTO lbl354
                throw null;
            }
            case 71: {
                var18_12 /* !! */  = (int)lo.itup("iucf", ituu(int ), (int)142);
                if (!var19_11) ** GOTO lbl150
                throw null;
            }
lbl445:
            // 2 sources

            case 72: {
                var18_12 /* !! */  = (int)lo.itup("iucg", ituu(int ), (int)143);
                if (!var19_11) ** GOTO lbl368
                throw null;
            }
lbl449:
            // 3 sources

            case 73: {
                var18_12 /* !! */  = (int)lo.itup("iuch", ituu(int ), (int)144);
                if (!var19_11) ** GOTO lbl349
                throw null;
            }
            case 74: 
        }
        var18_12 /* !! */  = (int)lo.itup("iuci", ituu(int ), (int)145);
        ** while (!var19_11)
lbl456:
        // 1 sources

        throw null;
    }

    static {
        ituv = new int[183];
        ituw = new int[183];
        lo.iuez();
        lo.iufi();
        lo.iufr();
        lo.iufy();
        itun = new long[75];
        ituo = new long[75];
        lo.iugk();
        lo.iugr();
    }

    private static /* synthetic */ int ituu(int n2) {
        return ituv[n2] ^ ituw[n2];
    }

    private static /* synthetic */ long itum(int n2) {
        return itun[n2] ^ ituo[n2];
    }

    private static /* synthetic */ void iugr() {
        lo.ituo[0] = -8353732593004299263L;
        lo.ituo[1] = -4686949520777865151L;
        lo.ituo[2] = 4024704775816235862L;
        lo.ituo[3] = -7210990651816163023L;
        lo.ituo[4] = 8103316693807395991L;
        lo.ituo[5] = -882135291611909595L;
        lo.ituo[6] = 7480830783798956748L;
        lo.ituo[7] = 7111810022701140973L;
        lo.ituo[8] = -5773073286397416554L;
        lo.ituo[9] = -5529751714813692603L;
        lo.ituo[10] = 6696202714339686834L;
        lo.ituo[11] = 2808043122093765584L;
        lo.ituo[12] = 8396759597579230383L;
        lo.ituo[13] = 5523009319386655475L;
        lo.ituo[14] = 4739813474483051067L;
        lo.ituo[15] = 4079718512648582085L;
        lo.ituo[16] = -7565602038377219725L;
        lo.ituo[17] = -1141296008111334971L;
        lo.ituo[18] = -8968476898743104922L;
        lo.ituo[19] = 7844423321278788269L;
        lo.ituo[20] = 2055708983094249110L;
        lo.ituo[21] = 943349624393590533L;
        lo.ituo[22] = 674132682302315855L;
        lo.ituo[23] = -3128809664888127751L;
        lo.ituo[24] = -1554112672649688658L;
        lo.ituo[25] = 5104404900111674124L;
        lo.ituo[26] = 9155548838869584715L;
        lo.ituo[27] = 8679658623537105499L;
        lo.ituo[28] = 6940046544532526481L;
        lo.ituo[29] = -4298515562781299543L;
        lo.ituo[30] = 6578343022355673476L;
        lo.ituo[31] = -7579963967616105951L;
        lo.ituo[32] = -2314403417026265653L;
        lo.ituo[33] = -2050426760083729384L;
        lo.ituo[34] = -145329969461677145L;
        lo.ituo[35] = 909176260086635763L;
        lo.ituo[36] = -799935930367083333L;
        lo.ituo[37] = -8121675806497126248L;
        lo.ituo[38] = -2753556877393968670L;
        lo.ituo[39] = 85620818287890699L;
        lo.ituo[40] = 7465636572067917636L;
        lo.ituo[41] = -5247954638509954823L;
        lo.ituo[42] = -3013900127435530307L;
        lo.ituo[43] = 6996654482387504399L;
        lo.ituo[44] = -6617144301415187904L;
        lo.ituo[45] = -2632916560927449802L;
        lo.ituo[46] = -3735660607165924096L;
        lo.ituo[47] = 680345718295919983L;
        lo.ituo[48] = 5046824675928784863L;
        lo.ituo[49] = 3417827803633821914L;
        lo.ituo[50] = 1387106964754754199L;
        lo.ituo[51] = 4688437013310365808L;
        lo.ituo[52] = 4832517706225062888L;
        lo.ituo[53] = -612673619843233351L;
        lo.ituo[54] = 1341134235270858323L;
        lo.ituo[55] = 6728157311242519205L;
        lo.ituo[56] = -3356131980008640653L;
        lo.ituo[57] = -2795670462097711786L;
        lo.ituo[58] = -2234598879893977713L;
        lo.ituo[59] = 2443312588701835940L;
        lo.ituo[60] = -2020609419001038548L;
        lo.ituo[61] = -2127163197868127879L;
        lo.ituo[62] = -4162548424535755788L;
        lo.ituo[63] = -2748561924153646650L;
        lo.ituo[64] = -9208969228808700577L;
        lo.ituo[65] = 9043178108494278954L;
        lo.ituo[66] = -5838367931495780028L;
        lo.ituo[67] = 9217390547491165218L;
        lo.ituo[68] = -5659324821636814510L;
        lo.ituo[69] = 8546511278429809987L;
        lo.ituo[70] = 4105666290740064692L;
        lo.ituo[71] = 3306918646908625659L;
        lo.ituo[72] = 2756609066191057736L;
        lo.ituo[73] = -8565095707915932700L;
        lo.ituo[74] = 590045813468292249L;
    }

    private static /* synthetic */ float ityy(int n2) {
        return Float.intBitsToFloat(ituv[n2] ^ ituw[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$draw$1() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lo.qj - lo.itup("iudr", itum(int ), (int)64)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == lo.itup("iuds", ituu(int ), (int)167)) break;
            v0 /* !! */  = (long)lo.itup("iudt", ituu(int ), (int)168);
        }
        var2 = lo.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = lo.qj - lo.itup("iudu", itum(int ), (int)65)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == lo.itup("iudv", ituu(int ), (int)169)) break;
            v1 /* !! */  = (long)lo.itup("iudw", ituu(int ), (int)170);
        }
        var1_1 /* !! */  = lo.b;
        v2 /* !! */  = lo.qj;
        if (true) ** GOTO lbl19
        block14: while (true) {
            v2 /* !! */  = (long)(v3 - lo.itup("iudx", itum(int ), (int)66));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -875212349: {
                    v3 = lo.itup("iudy", itum(int ), (int)67);
                    continue block14;
                }
                case -292320057: {
                    v3 = lo.itup("iudz", itum(int ), (int)68);
                    continue block14;
                }
                case -121694036: {
                    v3 = lo.itup("iuea", itum(int ), (int)69);
                    continue block14;
                }
                case 1825501965: {
                    break block14;
                }
            }
            break;
        }
        var0_2 = lo.a;
        if (var2) {
            throw null;
lbl34:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl34
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                return "Zippy2D";
            }
lbl42:
            // 2 sources

            case 0: {
                do {
                    var1_1 /* !! */  = (int)lo.itup("iueb", ituu(int ), (int)171);
                } while (!var2);
                throw null;
            }
lbl47:
            // 2 sources

            case 1: {
                var1_1 /* !! */  = (int)lo.itup("iuec", ituu(int ), (int)172);
                if (!var2) ** GOTO lbl42
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)lo.itup("iued", ituu(int ), (int)173);
                    if (!var2) ** GOTO lbl47
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)lo.itup("iuee", ituu(int ), (int)174);
        ** while (!var2)
lbl59:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void shutdown() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lo.qj - lo.itup("iucj", itum(int ), (int)51)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == lo.itup("iuck", ituu(int ), (int)146)) break;
            v0 /* !! */  = (long)lo.itup("iucl", ituu(int ), (int)147);
        }
        var2 = lo.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = lo.qj - lo.itup("iucm", itum(int ), (int)52)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == lo.itup("iucn", ituu(int ), (int)148)) break;
            v1 /* !! */  = (long)lo.itup("iuco", ituu(int ), (int)149);
        }
        var1_1 /* !! */  = lo.b;
        v2 /* !! */  = lo.qj;
        if (true) ** GOTO lbl17
        block27: while (true) {
            v2 /* !! */  = (long)(v3 - lo.itup("iucp", itum(int ), (int)53));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1452036623: {
                    v3 = lo.itup("iucq", itum(int ), (int)54);
                    continue block27;
                }
                case -1235646881: {
                    v3 = lo.itup("iucr", itum(int ), (int)55);
                    continue block27;
                }
                case 1825501965: {
                    break block27;
                }
                case 2129336181: {
                    v3 = lo.itup("iucs", itum(int ), (int)56);
                    continue block27;
                }
            }
            break;
        }
        var0_2 = lo.a;
        if (var2) {
            throw null;
lbl32:
            // 5 sources

            return;
        }
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2 || var0_2) ** GOTO lbl32
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = lo.qj - lo.itup("iuct", itum(int ), (int)57)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == lo.itup("iucu", ituu(int ), (int)150)) break;
                    v4 /* !! */  = (long)lo.itup("iucv", ituu(int ), (int)151);
                }
                if (lo.uniformBuffer == null) ** GOTO lbl75
                if (var0_2 || var0_2) ** GOTO lbl32
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = lo.qj - lo.itup("iucw", itum(int ), (int)58)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == lo.itup("iucx", ituu(int ), (int)152)) break;
                    v5 /* !! */  = (long)lo.itup("iucy", ituu(int ), (int)153);
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_4 = lo.qj - lo.itup("iucz", itum(int ), (int)59)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == lo.itup("iuda", ituu(int ), (int)154)) break;
                    v6 /* !! */  = (long)lo.itup("iudb", ituu(int ), (int)155);
                }
                lo.uniformBuffer.close();
                if (var0_2 || var0_2) ** GOTO lbl32
                v7 /* !! */  = lo.qj;
                if (true) ** GOTO lbl61
                block32: while (true) {
                    v7 /* !! */  = (long)(v8 - lo.itup("iudc", itum(int ), (int)60));
lbl61:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1210983447: {
                            v8 = lo.itup("iudd", itum(int ), (int)61);
                            continue block32;
                        }
                        case 1825501965: {
                            break block32;
                        }
                        case 1934810744: {
                            v8 = lo.itup("iude", itum(int ), (int)62);
                            continue block32;
                        }
                        case 1947349824: {
                            v8 = lo.itup("iudf", itum(int ), (int)63);
                            continue block32;
                        }
                    }
                    break;
                }
                lo.uniformBuffer = null;
                if (var0_2) ** GOTO lbl32
lbl75:
                // 2 sources

                if (!var0_2 && !var0_2) ** break;
                ** continue;
                return;
            }
lbl78:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)lo.itup("iudg", ituu(int ), (int)156);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl88
            }
            case 1: {
                var1_1 /* !! */  = (int)lo.itup("iudh", ituu(int ), (int)157);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl121
            }
lbl88:
            // 2 sources

            case 2: {
                do {
                    var1_1 /* !! */  = (int)lo.itup("iudi", ituu(int ), (int)158);
                } while (!var2);
                throw null;
            }
            case 3: {
                var1_1 /* !! */  = (int)lo.itup("iudj", ituu(int ), (int)159);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl117
            }
            case 4: {
                var1_1 /* !! */  = (int)lo.itup("iudk", ituu(int ), (int)160);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl121
            }
            case 5: {
                var1_1 /* !! */  = (int)lo.itup("iudl", ituu(int ), (int)161);
                if (!var2) ** GOTO lbl78
                throw null;
            }
lbl107:
            // 2 sources

            case 6: {
                var1_1 /* !! */  = (int)lo.itup("iudm", ituu(int ), (int)162);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl121
            }
            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)lo.itup("iudn", ituu(int ), (int)163);
                    if (!var2) ** GOTO lbl107
                    throw null;
                }
            }
lbl117:
            // 3 sources

            case 8: {
                var1_1 /* !! */  = (int)lo.itup("iudo", ituu(int ), (int)164);
                if (var2) {
                    throw null;
                }
            }
lbl121:
            // 6 sources

            case 9: {
                var1_1 /* !! */  = (int)lo.itup("iudp", ituu(int ), (int)165);
                if (!var2) ** GOTO lbl117
                throw null;
            }
            case 10: 
        }
        var1_1 /* !! */  = (int)lo.itup("iudq", ituu(int ), (int)166);
        ** while (!var2)
lbl128:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void iugk() {
        lo.itun[0] = -62206696298409074L;
        lo.itun[1] = 6411144035876071035L;
        lo.itun[2] = -8588771573546919256L;
        lo.itun[3] = 351801310618350249L;
        lo.itun[4] = -2819242966625982756L;
        lo.itun[5] = 8238750880961532598L;
        lo.itun[6] = 6077811406844276585L;
        lo.itun[7] = -4123222144573511519L;
        lo.itun[8] = -293253281502052753L;
        lo.itun[9] = -9027859743930726678L;
        lo.itun[10] = -2096052563919562501L;
        lo.itun[11] = -7351325834974071719L;
        lo.itun[12] = -1632934110262859667L;
        lo.itun[13] = 6354472370601614777L;
        lo.itun[14] = -9136113700253367185L;
        lo.itun[15] = -7531438256480008385L;
        lo.itun[16] = -7059337493093436355L;
        lo.itun[17] = 1171312328977822300L;
        lo.itun[18] = 72381618891411986L;
        lo.itun[19] = -5391916340201026894L;
        lo.itun[20] = 8378023859541574184L;
        lo.itun[21] = 7141332346267924670L;
        lo.itun[22] = 1526198284040471258L;
        lo.itun[23] = 1205213638629030979L;
        lo.itun[24] = 405694144310074289L;
        lo.itun[25] = -7655873968749746010L;
        lo.itun[26] = 2963560220205720283L;
        lo.itun[27] = 1269724165279513087L;
        lo.itun[28] = -5548240848918331504L;
        lo.itun[29] = 8383611290988219286L;
        lo.itun[30] = -6156923424774370939L;
        lo.itun[31] = -9156755046098164284L;
        lo.itun[32] = 1759383364618169849L;
        lo.itun[33] = -2275905032560410199L;
        lo.itun[34] = -8619381028732426289L;
        lo.itun[35] = 8023367633428903902L;
        lo.itun[36] = 8382793502770168574L;
        lo.itun[37] = 5425484311424207650L;
        lo.itun[38] = -737719046706491473L;
        lo.itun[39] = 6688064483075997358L;
        lo.itun[40] = -4654848094654775788L;
        lo.itun[41] = -7454385610564603914L;
        lo.itun[42] = -3013900127435530563L;
        lo.itun[43] = -6996646473879910862L;
        lo.itun[44] = 6482354210042988648L;
        lo.itun[45] = -2096021672309199927L;
        lo.itun[46] = -1055489345616796019L;
        lo.itun[47] = -3461040922601045288L;
        lo.itun[48] = -4921159197524712219L;
        lo.itun[49] = -5824016323325623461L;
        lo.itun[50] = 1387106964746927127L;
        lo.itun[51] = 6998910609201261094L;
        lo.itun[52] = -918023321178504360L;
        lo.itun[53] = -5676557958927177533L;
        lo.itun[54] = 241477420995463980L;
        lo.itun[55] = 6036487029122913393L;
        lo.itun[56] = 7453979105606916776L;
        lo.itun[57] = 8797238675522744520L;
        lo.itun[58] = -2598971116846007583L;
        lo.itun[59] = 7942227661135607228L;
        lo.itun[60] = -8345060798788189292L;
        lo.itun[61] = -409727032525693495L;
        lo.itun[62] = 9025040104467219674L;
        lo.itun[63] = 4819757244307736235L;
        lo.itun[64] = -8530516038509530788L;
        lo.itun[65] = -1534193643520483937L;
        lo.itun[66] = 8003254466420566261L;
        lo.itun[67] = -5471810748944316261L;
        lo.itun[68] = -3722202161154545136L;
        lo.itun[69] = 4711600231995222667L;
        lo.itun[70] = 3271206495236462184L;
        lo.itun[71] = 5832233300462540374L;
        lo.itun[72] = 7107227749803926909L;
        lo.itun[73] = -1674865442801825927L;
        lo.itun[74] = -175721699254064026L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$init$0() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lo.qj - lo.itup("iuef", itum(int ), (int)70)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == lo.itup("iueg", ituu(int ), (int)175)) break;
            v0 /* !! */  = (long)lo.itup("iueh", ituu(int ), (int)176);
        }
        var2 = lo.c;
        v1 /* !! */  = lo.qj;
        if (true) ** GOTO lbl12
        block12: while (true) {
            v1 /* !! */  = (long)(v2 - lo.itup("iuei", itum(int ), (int)71));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1027154786: {
                    v2 = lo.itup("iuej", itum(int ), (int)72);
                    continue block12;
                }
                case 1411768114: {
                    v2 = lo.itup("iuek", itum(int ), (int)73);
                    continue block12;
                }
                case 1825501965: {
                    break block12;
                }
            }
            break;
        }
        var1_1 /* !! */  = lo.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = lo.qj - lo.itup("iuel", itum(int ), (int)74)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == lo.itup("iuem", ituu(int ), (int)177)) break;
            v3 /* !! */  = (long)lo.itup("iuen", ituu(int ), (int)178);
        }
        var0_2 = lo.a;
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
                return "Zippy2D Uniforms";
                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var1_1 /* !! */  = (int)lo.itup("iueq", ituu(int ), (int)179);
                        if (!var2) break block14;
                        throw null;
                    }
                }
                case 1: {
                    var1_1 /* !! */  = (int)lo.itup("iuet", ituu(int ), (int)180);
                    if (var2) {
                        throw null;
                    }
                }
                case 2: {
                    do {
                        var1_1 /* !! */  = (int)lo.itup("iuev", ituu(int ), (int)181);
                    } while (!var2);
                    throw null;
                }
                case 3: 
            }
        }
        var1_1 /* !! */  = (int)lo.itup("iuex", ituu(int ), (int)182);
        ** while (!var2)
lbl54:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void iufi() {
        lo.ituv[100] = 437001248;
        lo.ituv[101] = -1516221451;
        lo.ituv[102] = 1371864435;
        lo.ituv[103] = 744918283;
        lo.ituv[104] = -1942148198;
        lo.ituv[105] = 332030582;
        lo.ituv[106] = -156981138;
        lo.ituv[107] = -555405494;
        lo.ituv[108] = 311177524;
        lo.ituv[109] = -860629227;
        lo.ituv[110] = -739062412;
        lo.ituv[111] = 35838392;
        lo.ituv[112] = 131378827;
        lo.ituv[113] = 232269251;
        lo.ituv[114] = 126541622;
        lo.ituv[115] = 1729190537;
        lo.ituv[116] = 1323646071;
        lo.ituv[117] = 1639543467;
        lo.ituv[118] = -1605551544;
        lo.ituv[119] = 1903775079;
        lo.ituv[120] = 833989392;
        lo.ituv[121] = 1244641676;
        lo.ituv[122] = -436279832;
        lo.ituv[123] = 431552762;
        lo.ituv[124] = 861822562;
        lo.ituv[125] = -940770059;
        lo.ituv[126] = 383411040;
        lo.ituv[127] = 860697675;
        lo.ituv[128] = 704547713;
        lo.ituv[129] = 889014157;
        lo.ituv[130] = -755906713;
        lo.ituv[131] = -1963376890;
        lo.ituv[132] = 1752514377;
        lo.ituv[133] = 2099420289;
        lo.ituv[134] = -1732075005;
        lo.ituv[135] = -1824667441;
        lo.ituv[136] = -5551074;
        lo.ituv[137] = 73014924;
        lo.ituv[138] = 1835040447;
        lo.ituv[139] = 337547927;
        lo.ituv[140] = 1516930887;
        lo.ituv[141] = -1294398030;
        lo.ituv[142] = -2052917011;
        lo.ituv[143] = 1597597870;
        lo.ituv[144] = 2141256222;
        lo.ituv[145] = -1415223448;
        lo.ituv[146] = -743119401;
        lo.ituv[147] = 309480665;
        lo.ituv[148] = 477676863;
        lo.ituv[149] = -386437507;
        lo.ituv[150] = -1065226701;
        lo.ituv[151] = -1227356352;
        lo.ituv[152] = 218590998;
        lo.ituv[153] = -1625424971;
        lo.ituv[154] = -1081128148;
        lo.ituv[155] = -2109069252;
        lo.ituv[156] = -680802366;
        lo.ituv[157] = -351893452;
        lo.ituv[158] = -88320844;
        lo.ituv[159] = -1536268720;
        lo.ituv[160] = -1378144716;
        lo.ituv[161] = -1401083647;
        lo.ituv[162] = -80116841;
        lo.ituv[163] = 1754480810;
        lo.ituv[164] = -1591493462;
        lo.ituv[165] = 197721624;
        lo.ituv[166] = 13404685;
        lo.ituv[167] = -542764641;
        lo.ituv[168] = 681995085;
        lo.ituv[169] = -1635260031;
        lo.ituv[170] = -1721696684;
        lo.ituv[171] = -654055380;
        lo.ituv[172] = 1196879264;
        lo.ituv[173] = 587408107;
        lo.ituv[174] = 2050423786;
        lo.ituv[175] = -353195438;
        lo.ituv[176] = -1935016068;
        lo.ituv[177] = -219184973;
        lo.ituv[178] = -1244156760;
        lo.ituv[179] = -738188369;
        lo.ituv[180] = -1024390102;
        lo.ituv[181] = -310637667;
        lo.ituv[182] = 1497705213;
    }

    public lo() {
    }

    /*
     * Exception decompiling
     */
    public static void init() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 51[SWITCH]
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
}

