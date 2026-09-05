/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Random;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import ruhack.phobia.d;
import ruhack.phobia.hn;
import ruhack.phobia.hx;
import ruhack.phobia.ms;
import ruhack.phobia.mt;
import ruhack.phobia.nm;
import ruhack.phobia.ov;
import ruhack.phobia.ow;
import ruhack.phobia.oy;

public class ii
extends hx {
    private final mt model;
    private int lockSkewTicks;
    private float noisePitch;
    private static long[] zld;
    private static final float WANDER_THETA = 0.048f;
    private static int[] zlh;
    private float lastRemYaw;
    private float wanderPitch;
    public static final int b;
    protected static final long bk = -6636212267826673119L;
    private static final int POST_HIT_WINDOW = 1;
    private final Random random;
    public static final boolean a;
    private static final float TREMOR_SIGMA = 0.39f;
    public static final boolean c;
    private boolean lockSkewYaw;
    private static final float WANDER_SIGMA = 0.12f;
    private float wanderYaw;
    private int postHitTicks;
    private float noiseYaw;
    private int rotationTicks;
    private float lastStepPitch;
    private float lastRemPitch;
    private static final int COMBAT_SEQUENCE = 40;
    private int spikeGuardTicks;
    private int lastAttackCount;
    private float speedDrift;
    private int recoverTicks;
    private static final float TREMOR_THETA = 0.24f;
    private int lastEntityId;
    private static long[] zlc;
    private int pursueStreak;
    private int combatTicks;
    private float lastStepYaw;
    private static int[] zli;
    private float lastCloseRatio;

    private static /* synthetic */ void absi() {
        ii.zli[900] = -984052887;
        ii.zli[901] = -2024692601;
        ii.zli[902] = -1654987766;
        ii.zli[903] = 996199143;
        ii.zli[904] = -259655137;
        ii.zli[905] = 1408856173;
        ii.zli[906] = 1600589778;
        ii.zli[907] = -1392902034;
        ii.zli[908] = 822831674;
        ii.zli[909] = 926106451;
        ii.zli[910] = 1004491559;
        ii.zli[911] = 2081888255;
        ii.zli[912] = 1846371063;
        ii.zli[913] = -148891351;
        ii.zli[914] = 2030025186;
        ii.zli[915] = -798839576;
        ii.zli[916] = -2130952113;
        ii.zli[917] = -1606135270;
        ii.zli[918] = -540306356;
        ii.zli[919] = 2034250226;
        ii.zli[920] = -1790429725;
        ii.zli[921] = -1544360098;
        ii.zli[922] = -265408870;
        ii.zli[923] = 374443327;
        ii.zli[924] = 144073157;
        ii.zli[925] = -1664431840;
        ii.zli[926] = -335697482;
        ii.zli[927] = 2095975421;
        ii.zli[928] = -261291407;
        ii.zli[929] = -1791506228;
        ii.zli[930] = 126591099;
        ii.zli[931] = -20015555;
        ii.zli[932] = 517634019;
        ii.zli[933] = -342840033;
        ii.zli[934] = -600777982;
        ii.zli[935] = 258494511;
        ii.zli[936] = -2034681918;
        ii.zli[937] = -1273931183;
        ii.zli[938] = 2095678613;
        ii.zli[939] = 1063945063;
        ii.zli[940] = 594504016;
        ii.zli[941] = 1164302115;
        ii.zli[942] = -297877524;
        ii.zli[943] = -1344223428;
        ii.zli[944] = 728152048;
        ii.zli[945] = -217353556;
        ii.zli[946] = -1901568358;
        ii.zli[947] = 648884632;
        ii.zli[948] = -503028903;
        ii.zli[949] = 1534522972;
        ii.zli[950] = 1419986007;
        ii.zli[951] = -1272319663;
        ii.zli[952] = -217121867;
        ii.zli[953] = -158828096;
        ii.zli[954] = -1667508692;
        ii.zli[955] = -1002004471;
        ii.zli[956] = -1034955116;
        ii.zli[957] = 1843516758;
        ii.zli[958] = -877798578;
        ii.zli[959] = 624136404;
        ii.zli[960] = -744361786;
        ii.zli[961] = 1165808764;
        ii.zli[962] = -227197866;
        ii.zli[963] = 1221795133;
        ii.zli[964] = -608979554;
        ii.zli[965] = -1954909532;
        ii.zli[966] = 1147916558;
        ii.zli[967] = 1142247342;
        ii.zli[968] = 2137061135;
        ii.zli[969] = 1734313235;
        ii.zli[970] = 833730108;
        ii.zli[971] = -1811426072;
        ii.zli[972] = 589616780;
        ii.zli[973] = -1681846851;
        ii.zli[974] = 1150393435;
        ii.zli[975] = 930184105;
        ii.zli[976] = -1808927302;
        ii.zli[977] = -1517375513;
        ii.zli[978] = 405784937;
        ii.zli[979] = 2053796841;
        ii.zli[980] = -877101465;
        ii.zli[981] = -1182971122;
        ii.zli[982] = -2008620033;
        ii.zli[983] = 1990377056;
        ii.zli[984] = 451687866;
        ii.zli[985] = -1027219449;
        ii.zli[986] = 528341921;
        ii.zli[987] = 1109495884;
        ii.zli[988] = -156496212;
        ii.zli[989] = 1124803687;
        ii.zli[990] = 1187218007;
        ii.zli[991] = 1370533744;
        ii.zli[992] = -1616384074;
        ii.zli[993] = 863660068;
        ii.zli[994] = -1714312324;
        ii.zli[995] = -2049766817;
        ii.zli[996] = -1965514805;
        ii.zli[997] = -513625732;
        ii.zli[998] = 79881173;
        ii.zli[999] = 1364594938;
    }

    private static /* synthetic */ void absf() {
        ii.zli[600] = -107619949;
        ii.zli[601] = -2026570204;
        ii.zli[602] = -1600060700;
        ii.zli[603] = -833375184;
        ii.zli[604] = 136801664;
        ii.zli[605] = 1931204684;
        ii.zli[606] = 1384385704;
        ii.zli[607] = 1052209766;
        ii.zli[608] = -1684250697;
        ii.zli[609] = 565342896;
        ii.zli[610] = 200138805;
        ii.zli[611] = 284769925;
        ii.zli[612] = -385292561;
        ii.zli[613] = 838690927;
        ii.zli[614] = 74945565;
        ii.zli[615] = 1536254646;
        ii.zli[616] = 1710258651;
        ii.zli[617] = -1023783392;
        ii.zli[618] = -518828672;
        ii.zli[619] = -290635063;
        ii.zli[620] = -1578693733;
        ii.zli[621] = 1283893051;
        ii.zli[622] = 2131399581;
        ii.zli[623] = -1509955021;
        ii.zli[624] = -542827659;
        ii.zli[625] = 1693863350;
        ii.zli[626] = -111818581;
        ii.zli[627] = -2130774439;
        ii.zli[628] = 270568388;
        ii.zli[629] = -1128910861;
        ii.zli[630] = -911090711;
        ii.zli[631] = -1181916913;
        ii.zli[632] = 350712880;
        ii.zli[633] = -675116840;
        ii.zli[634] = -275347213;
        ii.zli[635] = -785780902;
        ii.zli[636] = 689529630;
        ii.zli[637] = -1618610625;
        ii.zli[638] = -696207273;
        ii.zli[639] = -774944643;
        ii.zli[640] = -2060533142;
        ii.zli[641] = 824775057;
        ii.zli[642] = -1607871128;
        ii.zli[643] = -1777338061;
        ii.zli[644] = 0x38855353;
        ii.zli[645] = -1833931091;
        ii.zli[646] = -411161263;
        ii.zli[647] = 601417528;
        ii.zli[648] = 2007233974;
        ii.zli[649] = -1497291507;
        ii.zli[650] = -1011766420;
        ii.zli[651] = 317257998;
        ii.zli[652] = 1586966143;
        ii.zli[653] = -1715321045;
        ii.zli[654] = 418612948;
        ii.zli[655] = -1279986179;
        ii.zli[656] = 921379164;
        ii.zli[657] = -1919685599;
        ii.zli[658] = 1127658808;
        ii.zli[659] = -1856314790;
        ii.zli[660] = 2011099570;
        ii.zli[661] = -780488817;
        ii.zli[662] = 411973362;
        ii.zli[663] = -642229236;
        ii.zli[664] = -256327980;
        ii.zli[665] = -194458688;
        ii.zli[666] = -1325821865;
        ii.zli[667] = -705971381;
        ii.zli[668] = 1205907314;
        ii.zli[669] = 1455174159;
        ii.zli[670] = 1919878224;
        ii.zli[671] = -1816134741;
        ii.zli[672] = 1490862159;
        ii.zli[673] = 270222727;
        ii.zli[674] = -2034867159;
        ii.zli[675] = 436187481;
        ii.zli[676] = 380521014;
        ii.zli[677] = 1821383625;
        ii.zli[678] = 645957801;
        ii.zli[679] = 1856736931;
        ii.zli[680] = -1163037906;
        ii.zli[681] = 2073847858;
        ii.zli[682] = 1733609570;
        ii.zli[683] = -1965736515;
        ii.zli[684] = -250741012;
        ii.zli[685] = 452883772;
        ii.zli[686] = 1773076297;
        ii.zli[687] = 1286050497;
        ii.zli[688] = -688115064;
        ii.zli[689] = 528601124;
        ii.zli[690] = -1489110136;
        ii.zli[691] = 154229239;
        ii.zli[692] = 1643626355;
        ii.zli[693] = 918325965;
        ii.zli[694] = -1881447534;
        ii.zli[695] = -1927788970;
        ii.zli[696] = -939660887;
        ii.zli[697] = 1866741732;
        ii.zli[698] = -875337352;
        ii.zli[699] = -374487989;
    }

    private static /* synthetic */ float zlg(int n2) {
        return Float.intBitsToFloat(zlh[n2] ^ zli[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ov cruise(ov var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, float var8_8, float var9_9, float var10_10, float var11_11, boolean var12_12, boolean var13_13) {
        block56: {
            var22_14 = ii.c;
            var21_15 /* !! */  = ii.b;
            var20_16 = ii.a;
            if (var22_14) {
                throw null;
lbl6:
                // 15 sources

                return null;
            }
            if (var20_16 || var20_16) ** GOTO lbl6
            if (!(var4_4 < ii.zle("aasq", zlg(int ), (int)625))) break block56;
            if (var20_16 || var20_16) ** GOTO lbl6
            return this.finishStep(var1_1, var2_2, var3_3, var5_5, var6_6, (float)ii.zle("aasr", zlg(int ), (int)626));
        }
        if (var20_16 || var20_16) ** GOTO lbl6
        var14_17 = var2_2 * var9_9 - var7_7 * ii.zle("aass", zlg(int ), (int)627);
        if (var20_16) ** GOTO lbl6
        if (var21_15 /* !! */  == 0) ** GOTO lbl-1000
        switch (var21_15 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var20_16) ** GOTO lbl6
                var15_18 = var3_3 * var9_9 * this.lerp((float)ii.zle("aast", zlg(int ), (int)628), (float)ii.zle("aasu", zlg(int ), (int)629)) - var8_8 * ii.zle("aasv", zlg(int ), (int)630);
                if (var20_16 || var20_16) ** GOTO lbl6
                var16_19 = Math.min((float)Math.hypot(var14_17, var15_18), var10_10);
                if (var20_16 || var20_16) ** GOTO lbl6
                if (!(var16_19 > ii.zle("aasw", zlg(int ), (int)631))) ** GOTO lbl32
                if (var20_16 || var20_16) ** GOTO lbl6
                var17_20 = var16_19 / (float)Math.hypot(var14_17, var15_18);
                if (var20_16 || var20_16) ** GOTO lbl6
                var14_17 *= var17_20;
                if (var20_16 || var20_16) ** GOTO lbl6
                var15_18 *= var17_20;
                if (var20_16) ** GOTO lbl6
lbl32:
                // 2 sources

                if (var20_16 || var20_16) ** GOTO lbl6
                var17_20 = this.lerp((float)ii.zle("aasx", zlg(int ), (int)632), (float)ii.zle("aasy", zlg(int ), (int)633));
                if (var20_16 || var20_16) ** GOTO lbl6
                var18_21 = this.lastStepYaw * var17_20 + var14_17 * (1.0f - var17_20) + var5_5;
                if (var20_16 || var20_16) ** GOTO lbl6
                var19_22 = this.lastStepPitch * var17_20 + var15_18 * (1.0f - var17_20) + var6_6;
                if (!var20_16 && !var20_16) ** break;
                ** continue;
                return this.commitSyntheticStep(var1_1, var2_2, var3_3, var4_4, var18_21, var19_22, var5_5, var6_6, var11_11, var12_12, var13_13);
            }
lbl41:
            // 5 sources

            case 0: {
                var21_15 /* !! */  = (int)ii.zle("aasz", zlk(int ), (int)634);
                if (var22_14) {
                    throw null;
                }
                ** GOTO lbl127
            }
lbl46:
            // 3 sources

            case 1: {
                var21_15 /* !! */  = (int)ii.zle("aata", zlk(int ), (int)635);
                if (var22_14) {
                    throw null;
                }
                ** GOTO lbl165
            }
            case 2: {
                var21_15 /* !! */  = (int)ii.zle("aatb", zlk(int ), (int)636);
                if (!var22_14) ** GOTO lbl41
                throw null;
            }
            case 3: {
                var21_15 /* !! */  = (int)ii.zle("aatc", zlk(int ), (int)637);
                if (!var22_14) ** GOTO lbl46
                throw null;
            }
lbl59:
            // 3 sources

            case 4: {
                var21_15 /* !! */  = (int)ii.zle("aatd", zlk(int ), (int)638);
                if (var22_14) {
                    throw null;
                }
                ** GOTO lbl106
            }
lbl64:
            // 3 sources

            case 5: {
                var21_15 /* !! */  = (int)ii.zle("aate", zlk(int ), (int)639);
                if (var22_14) {
                    throw null;
                }
                ** GOTO lbl106
            }
lbl69:
            // 2 sources

            case 6: {
                var21_15 /* !! */  = (int)ii.zle("aatf", zlk(int ), (int)640);
                if (var22_14) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 7: {
                do {
                    var21_15 /* !! */  = (int)ii.zle("aatg", zlk(int ), (int)641);
                } while (!var22_14);
                throw null;
            }
            case 8: {
                var21_15 /* !! */  = (int)ii.zle("aath", zlk(int ), (int)642);
                if (var22_14) {
                    throw null;
                }
                ** GOTO lbl135
            }
lbl84:
            // 2 sources

            case 9: {
                var21_15 /* !! */  = (int)ii.zle("aati", zlk(int ), (int)643);
                if (var22_14) {
                    throw null;
                }
            }
lbl88:
            // 4 sources

            case 10: {
                var21_15 /* !! */  = (int)ii.zle("aatj", zlk(int ), (int)644);
                if (!var22_14) ** GOTO lbl41
                throw null;
            }
            case 11: {
                var21_15 /* !! */  = (int)ii.zle("aatk", zlk(int ), (int)645);
                if (var22_14) {
                    throw null;
                }
                ** GOTO lbl156
            }
            case 12: {
                var21_15 /* !! */  = (int)ii.zle("aatl", zlk(int ), (int)646);
                if (var22_14) {
                    throw null;
                }
                ** GOTO lbl161
            }
            case 13: {
                var21_15 /* !! */  = (int)ii.zle("aatm", zlk(int ), (int)647);
                if (!var22_14) ** GOTO lbl46
                throw null;
            }
lbl106:
            // 3 sources

            case 14: {
                var21_15 /* !! */  = (int)ii.zle("aatn", zlk(int ), (int)648);
                if (!var22_14) ** GOTO lbl59
                throw null;
            }
            case 15: {
                var21_15 /* !! */  = (int)ii.zle("aato", zlk(int ), (int)649);
                if (!var22_14) ** GOTO lbl64
                throw null;
            }
            case 16: {
                var21_15 /* !! */  = (int)ii.zle("aatp", zlk(int ), (int)650);
                if (!var22_14) ** GOTO lbl64
                throw null;
            }
lbl118:
            // 2 sources

            case 17: {
                var21_15 /* !! */  = (int)ii.zle("aatq", zlk(int ), (int)651);
                if (var22_14) {
                    throw null;
                }
                ** GOTO lbl148
            }
            case 18: {
                var21_15 /* !! */  = (int)ii.zle("aatr", zlk(int ), (int)652);
                if (!var22_14) ** GOTO lbl69
                throw null;
            }
lbl127:
            // 2 sources

            case 19: {
                var21_15 /* !! */  = (int)ii.zle("aats", zlk(int ), (int)653);
                if (!var22_14) break;
                throw null;
            }
lbl131:
            // 3 sources

            case 20: {
                var21_15 /* !! */  = (int)ii.zle("aatt", zlk(int ), (int)654);
                if (!var22_14) ** GOTO lbl59
                throw null;
            }
lbl135:
            // 2 sources

            case 21: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var21_15 /* !! */  = (int)ii.zle("aatu", zlk(int ), (int)655);
                    if (!var22_14) ** GOTO lbl118
                    throw null;
                }
            }
            case 22: {
                var21_15 /* !! */  = (int)ii.zle("aatv", zlk(int ), (int)656);
                if (!var22_14) ** GOTO lbl131
                throw null;
            }
            case 23: {
                var21_15 /* !! */  = (int)ii.zle("aatw", zlk(int ), (int)657);
                if (!var22_14) ** GOTO lbl41
                throw null;
            }
lbl148:
            // 2 sources

            case 24: {
                var21_15 /* !! */  = (int)ii.zle("aatx", zlk(int ), (int)658);
                if (!var22_14) ** GOTO lbl131
                throw null;
            }
lbl152:
            // 2 sources

            case 25: {
                var21_15 /* !! */  = (int)ii.zle("aaty", zlk(int ), (int)659);
                if (!var22_14) ** GOTO lbl88
                throw null;
            }
lbl156:
            // 2 sources

            case 26: {
                var21_15 /* !! */  = (int)ii.zle("aatz", zlk(int ), (int)660);
                if (var22_14) {
                    throw null;
                }
                ** GOTO lbl165
            }
lbl161:
            // 2 sources

            case 27: {
                var21_15 /* !! */  = (int)ii.zle("aaua", zlk(int ), (int)661);
                if (!var22_14) ** GOTO lbl84
                throw null;
            }
lbl165:
            // 3 sources

            case 28: {
                var21_15 /* !! */  = (int)ii.zle("aaub", zlk(int ), (int)662);
                if (!var22_14) ** GOTO lbl41
                throw null;
            }
            case 29: 
        }
        var21_15 /* !! */  = (int)ii.zle("aauc", zlk(int ), (int)663);
        ** while (!var22_14)
lbl172:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void resetState() {
        var3_1 = ii.c;
        var2_2 /* !! */  = ii.b;
        var1_3 = ii.a;
        if (var3_1) {
            throw null;
lbl6:
            // 17 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl6
        this.recoverTicks = (int)ii.zle("znp", zlk(int ), (int)36);
        if (var1_3 || var1_3) ** GOTO lbl6
        this.pursueStreak = (int)ii.zle("znq", zlk(int ), (int)37);
        if (var1_3) ** GOTO lbl6
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl6
                this.postHitTicks = (int)ii.zle("znr", zlk(int ), (int)38);
                if (var1_3 || var1_3) ** GOTO lbl6
                this.spikeGuardTicks = (int)ii.zle("zns", zlk(int ), (int)39);
                if (var1_3 || var1_3) ** GOTO lbl6
                this.lockSkewTicks = (int)ii.zle("znt", zlk(int ), (int)40);
                if (var1_3 || var1_3) ** GOTO lbl6
                this.lastStepPitch = 0.0f;
                this.lastStepYaw = 0.0f;
                if (var1_3 || var1_3) ** GOTO lbl6
                this.lastRemYaw = (float)ii.zle("znu", zlg(int ), (int)41);
                if (var1_3 || var1_3) ** GOTO lbl6
                this.lastRemPitch = 0.0f;
                if (var1_3 || var1_3) ** GOTO lbl6
                this.lastCloseRatio = 0.0f;
                if (var1_3 || var1_3) ** GOTO lbl6
                this.combatTicks = (int)ii.zle("znv", zlk(int ), (int)42);
                if (var1_3 || var1_3) ** GOTO lbl6
                this.rotationTicks = (int)ii.zle("znw", zlk(int ), (int)43);
                if (var1_3 || var1_3) ** GOTO lbl6
                this.speedDrift = 0.0f;
                if (var1_3 || var1_3) ** GOTO lbl6
                this.lockSkewYaw = this.random.nextBoolean();
                if (var1_3 || var1_3) ** GOTO lbl6
                this.resetNoise();
                if (var1_3 || var1_3) ** GOTO lbl6
                this.model.resetPlayback();
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl46:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ii.zle("znx", zlk(int ), (int)44);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl140
            }
            case 1: {
                var2_2 /* !! */  = (int)ii.zle("zny", zlk(int ), (int)45);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl176
            }
lbl56:
            // 3 sources

            case 2: {
                var2_2 /* !! */  = (int)ii.zle("znz", zlk(int ), (int)46);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl104
            }
            case 3: {
                var2_2 /* !! */  = (int)ii.zle("zoa", zlk(int ), (int)47);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl71
            }
lbl66:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)ii.zle("zob", zlk(int ), (int)48);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl121
            }
lbl71:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)ii.zle("zoc", zlk(int ), (int)49);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl104
            }
            case 6: {
                var2_2 /* !! */  = (int)ii.zle("zod", zlk(int ), (int)50);
                if (!var3_1) ** GOTO lbl66
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)ii.zle("zoe", zlk(int ), (int)51);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl176
            }
            case 8: {
                var2_2 /* !! */  = (int)ii.zle("zof", zlk(int ), (int)52);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl168
            }
            case 9: {
                var2_2 /* !! */  = (int)ii.zle("zog", zlk(int ), (int)53);
                if (!var3_1) ** GOTO lbl56
                throw null;
            }
lbl94:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)ii.zle("zoh", zlk(int ), (int)54);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl188
            }
            case 11: {
                var2_2 /* !! */  = (int)ii.zle("zoi", zlk(int ), (int)55);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl108
            }
lbl104:
            // 4 sources

            case 12: {
                var2_2 /* !! */  = (int)ii.zle("zoj", zlk(int ), (int)56);
                if (!var3_1) ** GOTO lbl94
                throw null;
            }
lbl108:
            // 4 sources

            case 13: {
                var2_2 /* !! */  = (int)ii.zle("zok", zlk(int ), (int)57);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl176
            }
lbl113:
            // 3 sources

            case 14: {
                var2_2 /* !! */  = (int)ii.zle("zol", zlk(int ), (int)58);
                if (var3_1) {
                    throw null;
                }
            }
lbl117:
            // 4 sources

            case 15: {
                var2_2 /* !! */  = (int)ii.zle("zom", zlk(int ), (int)59);
                if (!var3_1) ** GOTO lbl46
                throw null;
            }
lbl121:
            // 2 sources

            case 16: {
                var2_2 /* !! */  = (int)ii.zle("zon", zlk(int ), (int)60);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl172
            }
            case 17: {
                var2_2 /* !! */  = (int)ii.zle("zoo", zlk(int ), (int)61);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl188
            }
lbl131:
            // 3 sources

            case 18: {
                var2_2 /* !! */  = (int)ii.zle("zop", zlk(int ), (int)62);
                if (!var3_1) ** GOTO lbl108
                throw null;
            }
            case 19: {
                var2_2 /* !! */  = (int)ii.zle("zoq", zlk(int ), (int)63);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl188
            }
lbl140:
            // 2 sources

            case 20: {
                var2_2 /* !! */  = (int)ii.zle("zor", zlk(int ), (int)64);
                if (!var3_1) ** GOTO lbl131
                throw null;
            }
            case 21: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ii.zle("zos", zlk(int ), (int)65);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl184
                    break;
                }
            }
lbl150:
            // 2 sources

            case 22: {
                var2_2 /* !! */  = (int)ii.zle("zot", zlk(int ), (int)66);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl172
            }
            case 23: {
                var2_2 /* !! */  = (int)ii.zle("zou", zlk(int ), (int)67);
                if (!var3_1) ** GOTO lbl56
                throw null;
            }
            case 24: {
                var2_2 /* !! */  = (int)ii.zle("zov", zlk(int ), (int)68);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl168
            }
            case 25: {
                var2_2 /* !! */  = (int)ii.zle("zow", zlk(int ), (int)69);
                if (!var3_1) ** GOTO lbl113
                throw null;
            }
lbl168:
            // 4 sources

            case 26: {
                var2_2 /* !! */  = (int)ii.zle("zox", zlk(int ), (int)70);
                if (!var3_1) ** GOTO lbl113
                throw null;
            }
lbl172:
            // 3 sources

            case 27: {
                var2_2 /* !! */  = (int)ii.zle("zoy", zlk(int ), (int)71);
                if (!var3_1) ** GOTO lbl168
                throw null;
            }
lbl176:
            // 4 sources

            case 28: {
                var2_2 /* !! */  = (int)ii.zle("zoz", zlk(int ), (int)72);
                if (!var3_1) ** GOTO lbl108
                throw null;
            }
            case 29: {
                var2_2 /* !! */  = (int)ii.zle("zpa", zlk(int ), (int)73);
                if (!var3_1) ** GOTO lbl131
                throw null;
            }
lbl184:
            // 2 sources

            case 30: {
                var2_2 /* !! */  = (int)ii.zle("zpb", zlk(int ), (int)74);
                if (!var3_1) ** GOTO lbl117
                throw null;
            }
lbl188:
            // 4 sources

            case 31: {
                var2_2 /* !! */  = (int)ii.zle("zpc", zlk(int ), (int)75);
                if (!var3_1) ** GOTO lbl150
                throw null;
            }
            case 32: {
                var2_2 /* !! */  = (int)ii.zle("zpd", zlk(int ), (int)76);
                if (!var3_1) ** GOTO lbl104
                throw null;
            }
            case 33: 
        }
        var2_2 /* !! */  = (int)ii.zle("zpe", zlk(int ), (int)77);
        ** while (!var3_1)
lbl199:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void abrs() {
        ii.zlh[500] = -783778448;
        ii.zlh[501] = -490186901;
        ii.zlh[502] = 2087241163;
        ii.zlh[503] = -62247355;
        ii.zlh[504] = 2104710259;
        ii.zlh[505] = 2144821475;
        ii.zlh[506] = 1325351096;
        ii.zlh[507] = 708192495;
        ii.zlh[508] = 795342403;
        ii.zlh[509] = -1845997998;
        ii.zlh[510] = 2016682579;
        ii.zlh[511] = 307348175;
        ii.zlh[512] = -2123373761;
        ii.zlh[513] = -1572765555;
        ii.zlh[514] = -1708219601;
        ii.zlh[515] = -1725144714;
        ii.zlh[516] = 1712707366;
        ii.zlh[517] = 700924341;
        ii.zlh[518] = 1065392708;
        ii.zlh[519] = -1538744105;
        ii.zlh[520] = 1137555095;
        ii.zlh[521] = 59049820;
        ii.zlh[522] = -876326493;
        ii.zlh[523] = 1854682284;
        ii.zlh[524] = 567350842;
        ii.zlh[525] = 1205430027;
        ii.zlh[526] = -940441446;
        ii.zlh[527] = 421568317;
        ii.zlh[528] = -173849176;
        ii.zlh[529] = -1260021823;
        ii.zlh[530] = 688344961;
        ii.zlh[531] = -571088030;
        ii.zlh[532] = -2131924844;
        ii.zlh[533] = 1068885406;
        ii.zlh[534] = 1121129803;
        ii.zlh[535] = -634452010;
        ii.zlh[536] = 1598611239;
        ii.zlh[537] = 1725158972;
        ii.zlh[538] = 1432804641;
        ii.zlh[539] = 1478365964;
        ii.zlh[540] = -1626348256;
        ii.zlh[541] = 888403480;
        ii.zlh[542] = 192921221;
        ii.zlh[543] = -1802908065;
        ii.zlh[544] = 1542372166;
        ii.zlh[545] = 412368225;
        ii.zlh[546] = 1514258126;
        ii.zlh[547] = -55125984;
        ii.zlh[548] = -621275621;
        ii.zlh[549] = 1055010324;
        ii.zlh[550] = 1633814174;
        ii.zlh[551] = -270194464;
        ii.zlh[552] = -685394595;
        ii.zlh[553] = -1272324831;
        ii.zlh[554] = -1036351201;
        ii.zlh[555] = 1911692381;
        ii.zlh[556] = -253640004;
        ii.zlh[557] = -2051475057;
        ii.zlh[558] = -1129628345;
        ii.zlh[559] = 235138675;
        ii.zlh[560] = 275847382;
        ii.zlh[561] = -852712037;
        ii.zlh[562] = -1504337122;
        ii.zlh[563] = 204331035;
        ii.zlh[564] = 544535735;
        ii.zlh[565] = 1835165087;
        ii.zlh[566] = 616711905;
        ii.zlh[567] = 1069276612;
        ii.zlh[568] = 1577644767;
        ii.zlh[569] = 1337384602;
        ii.zlh[570] = 982385128;
        ii.zlh[571] = 2123768193;
        ii.zlh[572] = 1177368562;
        ii.zlh[573] = -2065055090;
        ii.zlh[574] = 1991485021;
        ii.zlh[575] = -169585481;
        ii.zlh[576] = -676970711;
        ii.zlh[577] = -326860081;
        ii.zlh[578] = -1454677193;
        ii.zlh[579] = 417257505;
        ii.zlh[580] = -288472719;
        ii.zlh[581] = -581383503;
        ii.zlh[582] = 1174269235;
        ii.zlh[583] = 318507844;
        ii.zlh[584] = 1577101681;
        ii.zlh[585] = 1622230098;
        ii.zlh[586] = 1578551313;
        ii.zlh[587] = 874811573;
        ii.zlh[588] = 1701643708;
        ii.zlh[589] = -672723485;
        ii.zlh[590] = 2130854041;
        ii.zlh[591] = 1191282829;
        ii.zlh[592] = -2013123161;
        ii.zlh[593] = -1034912515;
        ii.zlh[594] = -373757327;
        ii.zlh[595] = -2128344432;
        ii.zlh[596] = 419008561;
        ii.zlh[597] = -1314645147;
        ii.zlh[598] = 2103687324;
        ii.zlh[599] = 1660247449;
    }

    private static /* synthetic */ void absm() {
        ii.zlc[100] = -5178158210604106286L;
        ii.zlc[101] = 3660146476717683447L;
        ii.zlc[102] = 4203749929891345059L;
        ii.zlc[103] = 6426014701598040669L;
        ii.zlc[104] = -6275996355290654196L;
        ii.zlc[105] = 4636854114871710105L;
        ii.zlc[106] = -7661872841137045837L;
        ii.zlc[107] = 3986743707941555358L;
        ii.zlc[108] = -4174205068130209230L;
        ii.zlc[109] = 3415559847439471880L;
        ii.zlc[110] = -8816861638726988836L;
        ii.zlc[111] = 7618358159096326686L;
        ii.zlc[112] = 3676500560869298065L;
        ii.zlc[113] = 5137192345341764415L;
        ii.zlc[114] = -677870830367636545L;
        ii.zlc[115] = 8522462842245190976L;
        ii.zlc[116] = 4705597939096381006L;
        ii.zlc[117] = 5403935739085006855L;
        ii.zlc[118] = 6029075804201053506L;
        ii.zlc[119] = -8176961128514267930L;
        ii.zlc[120] = 3299549237737723391L;
        ii.zlc[121] = 5289775771372159307L;
        ii.zlc[122] = 8720967544983529731L;
        ii.zlc[123] = -3720506672500398160L;
        ii.zlc[124] = -5398966174326754510L;
        ii.zlc[125] = 3280727115797600288L;
        ii.zlc[126] = -4516549440640737305L;
        ii.zlc[127] = 4652098845042824784L;
        ii.zlc[128] = 456770386892623830L;
        ii.zlc[129] = 8216632174618655365L;
        ii.zlc[130] = 6061839291147557253L;
        ii.zlc[131] = -2328952779198421881L;
        ii.zlc[132] = -4340941663762021810L;
        ii.zlc[133] = 3927735687823501147L;
        ii.zlc[134] = 4640486779186309844L;
        ii.zlc[135] = -5857871650606742113L;
        ii.zlc[136] = -807752560542428585L;
        ii.zlc[137] = -6656464671770476844L;
        ii.zlc[138] = 5584091684848437687L;
        ii.zlc[139] = -3823020174476951890L;
        ii.zlc[140] = -8237249393023587742L;
        ii.zlc[141] = 8585215697244479291L;
        ii.zlc[142] = -1083826999055898366L;
        ii.zlc[143] = -8055746171881706514L;
        ii.zlc[144] = -336285241813848500L;
        ii.zlc[145] = -3003837844681566452L;
        ii.zlc[146] = 5057427076681865788L;
        ii.zlc[147] = 5458124944379376478L;
        ii.zlc[148] = -1949379004465377881L;
        ii.zlc[149] = 5367780303009454221L;
        ii.zlc[150] = -6192787624069259253L;
        ii.zlc[151] = -7317497294522607399L;
        ii.zlc[152] = -8758364192475817305L;
        ii.zlc[153] = -7912170574719057821L;
        ii.zlc[154] = -2307940976293643433L;
        ii.zlc[155] = 5137970232396375022L;
        ii.zlc[156] = -6834059774305060924L;
        ii.zlc[157] = 94243908724366080L;
        ii.zlc[158] = 5840732842381244847L;
        ii.zlc[159] = 821139592345525434L;
        ii.zlc[160] = -2994115704495797692L;
        ii.zlc[161] = -6192209033850837018L;
        ii.zlc[162] = -2564223755132670537L;
        ii.zlc[163] = -8193092826076642544L;
        ii.zlc[164] = -5679789988623992196L;
        ii.zlc[165] = 6814901182951992746L;
        ii.zlc[166] = -342249516831028334L;
        ii.zlc[167] = 6128387831004203932L;
        ii.zlc[168] = -572915855720145460L;
        ii.zlc[169] = -7862652201321212893L;
        ii.zlc[170] = -3024808507761465415L;
        ii.zlc[171] = -386138448791113345L;
        ii.zlc[172] = 8054373304168934916L;
        ii.zlc[173] = 6100563544813380887L;
        ii.zlc[174] = 3101078718261647940L;
        ii.zlc[175] = 4334988713107889758L;
        ii.zlc[176] = 541471032386996808L;
        ii.zlc[177] = -6111286821966635547L;
        ii.zlc[178] = -7673463138520900999L;
        ii.zlc[179] = 3374263656508604708L;
        ii.zlc[180] = 6106199079354059797L;
        ii.zlc[181] = 1591659543160445930L;
        ii.zlc[182] = -8846699268131925889L;
        ii.zlc[183] = 3961401379577069992L;
        ii.zlc[184] = -1021067206729746882L;
        ii.zlc[185] = 3588990322773170440L;
        ii.zlc[186] = 1863078276395246942L;
        ii.zlc[187] = -2839549527917087533L;
        ii.zlc[188] = 6485724519976709971L;
        ii.zlc[189] = 4674130286575448074L;
        ii.zlc[190] = -6912998928003468682L;
        ii.zlc[191] = 7231047524086408293L;
        ii.zlc[192] = 1720604054126420492L;
        ii.zlc[193] = 8496608836509636798L;
        ii.zlc[194] = -2204093934456935045L;
        ii.zlc[195] = -3692370738133906302L;
        ii.zlc[196] = 129529350752261926L;
        ii.zlc[197] = 6330018212207087296L;
        ii.zlc[198] = 1972290528657131981L;
        ii.zlc[199] = -5875487054671753272L;
    }

    private static /* synthetic */ void abso() {
        ii.zld[0] = -8613172573987824357L;
        ii.zld[1] = -2012082785569879297L;
        ii.zld[2] = -4587487999586153212L;
        ii.zld[3] = 194074643277709323L;
        ii.zld[4] = -2753609158673737302L;
        ii.zld[5] = 4289685179946802095L;
        ii.zld[6] = 7083915828642587191L;
        ii.zld[7] = -5498573697948696469L;
        ii.zld[8] = 8905993169961756611L;
        ii.zld[9] = -1540859132470051492L;
        ii.zld[10] = -217808516986072683L;
        ii.zld[11] = 6661402232549568075L;
        ii.zld[12] = -1075254894693496203L;
        ii.zld[13] = 3360084322759931371L;
        ii.zld[14] = -2763048303617536365L;
        ii.zld[15] = 7896163132379034536L;
        ii.zld[16] = 1947938778224310781L;
        ii.zld[17] = 6729030750802366299L;
        ii.zld[18] = -6874648111007260699L;
        ii.zld[19] = -8795625406319928585L;
        ii.zld[20] = -1920347934326012198L;
        ii.zld[21] = -5276657671213926896L;
        ii.zld[22] = 655911425228385412L;
        ii.zld[23] = -7848828641247273637L;
        ii.zld[24] = 8306523080920109511L;
        ii.zld[25] = 8183438230312673912L;
        ii.zld[26] = 6060005766911109640L;
        ii.zld[27] = 7249039428489520389L;
        ii.zld[28] = -459928778101233921L;
        ii.zld[29] = -5792306687230840775L;
        ii.zld[30] = 7985017599596958254L;
        ii.zld[31] = 6387077710061980752L;
        ii.zld[32] = -4014491354114363230L;
        ii.zld[33] = -6838801925772916466L;
        ii.zld[34] = -8661022208673412281L;
        ii.zld[35] = -2600805256216388347L;
        ii.zld[36] = 8012164650025518096L;
        ii.zld[37] = 4489872429961901426L;
        ii.zld[38] = -9151790138349145620L;
        ii.zld[39] = 5853229769901509628L;
        ii.zld[40] = 3220989558301903901L;
        ii.zld[41] = -5275737850943565895L;
        ii.zld[42] = -6099260639317967465L;
        ii.zld[43] = -8305254893971727663L;
        ii.zld[44] = -390035838742447068L;
        ii.zld[45] = 6981020323310309985L;
        ii.zld[46] = -1311646780487505722L;
        ii.zld[47] = 5806345336253492074L;
        ii.zld[48] = 7956503233065383762L;
        ii.zld[49] = 5924975954298432024L;
        ii.zld[50] = 7058046676470180536L;
        ii.zld[51] = -7397871065003612865L;
        ii.zld[52] = 2071537390549253626L;
        ii.zld[53] = -6447639658394337752L;
        ii.zld[54] = -6080892287652809330L;
        ii.zld[55] = 3677906941667731068L;
        ii.zld[56] = 3702536281215216361L;
        ii.zld[57] = -6995751979086950052L;
        ii.zld[58] = 255191090392795717L;
        ii.zld[59] = 478294325998959062L;
        ii.zld[60] = 4327223051457668239L;
        ii.zld[61] = -4804796407179440453L;
        ii.zld[62] = 1451099073435274929L;
        ii.zld[63] = 4930705956368653373L;
        ii.zld[64] = -5010430976954672731L;
        ii.zld[65] = 1018122724295877322L;
        ii.zld[66] = 4132553801334885606L;
        ii.zld[67] = 7420200810981668935L;
        ii.zld[68] = 3566310744869546341L;
        ii.zld[69] = 3056292504834725849L;
        ii.zld[70] = 6421679851051524227L;
        ii.zld[71] = -4847806013499504337L;
        ii.zld[72] = 6810683127803209307L;
        ii.zld[73] = -5958805446576972496L;
        ii.zld[74] = -1991072864642469298L;
        ii.zld[75] = -3522426049010813545L;
        ii.zld[76] = -1441914884136914258L;
        ii.zld[77] = 762938379991149224L;
        ii.zld[78] = -3297175998548991241L;
        ii.zld[79] = 7400626166303996375L;
        ii.zld[80] = -8496465795283674643L;
        ii.zld[81] = -1834064935824989439L;
        ii.zld[82] = -8005725889910418445L;
        ii.zld[83] = -209654595885989273L;
        ii.zld[84] = 6201745507756536454L;
        ii.zld[85] = 7849359607055363678L;
        ii.zld[86] = 626575291136654771L;
        ii.zld[87] = 2747275864263744935L;
        ii.zld[88] = 6294629398593762925L;
        ii.zld[89] = 1518617348701814630L;
        ii.zld[90] = -7828065687510247179L;
        ii.zld[91] = 3782071903785619670L;
        ii.zld[92] = 6955494805520186269L;
        ii.zld[93] = 3907112093294873596L;
        ii.zld[94] = -5035653423299665587L;
        ii.zld[95] = -7153201419637467260L;
        ii.zld[96] = 8077368294926671637L;
        ii.zld[97] = -4137295190328992277L;
        ii.zld[98] = 1872798063474995360L;
        ii.zld[99] = 6843586872638346259L;
    }

    private static /* synthetic */ void absq() {
        ii.zld[200] = 1403566205430465194L;
        ii.zld[201] = -257599458675238709L;
        ii.zld[202] = 1275268177855357758L;
        ii.zld[203] = -7052350439199533888L;
        ii.zld[204] = 7166421571663494994L;
        ii.zld[205] = -7633036247133808479L;
        ii.zld[206] = -4815186190213277285L;
        ii.zld[207] = -8113752660409165383L;
        ii.zld[208] = 5515668771562518346L;
        ii.zld[209] = 2425018707390964879L;
        ii.zld[210] = -2242929357137874455L;
        ii.zld[211] = -645111418924160335L;
        ii.zld[212] = -5012976134323022341L;
        ii.zld[213] = 5158560604673818694L;
        ii.zld[214] = 3654934336448758863L;
        ii.zld[215] = -215496398679854613L;
        ii.zld[216] = 2164626670279624217L;
        ii.zld[217] = 6469292087135916968L;
        ii.zld[218] = 3851327364996713918L;
        ii.zld[219] = -4654557618798040088L;
        ii.zld[220] = -2738152428194564489L;
        ii.zld[221] = -8259418463109439156L;
        ii.zld[222] = 6702658393598002351L;
        ii.zld[223] = 4148697575753419237L;
        ii.zld[224] = -7132205905249116705L;
        ii.zld[225] = 3636608472177890048L;
        ii.zld[226] = -8965821612313347209L;
        ii.zld[227] = -8825009140258667037L;
        ii.zld[228] = 5564023080890726143L;
        ii.zld[229] = 3242336154023132199L;
        ii.zld[230] = -4565983225665377733L;
        ii.zld[231] = -2302939560644539009L;
        ii.zld[232] = 5983957151132503910L;
        ii.zld[233] = 698206029899063170L;
        ii.zld[234] = -4980841641683561255L;
        ii.zld[235] = -4188593140325952476L;
        ii.zld[236] = -1956026110716077957L;
        ii.zld[237] = -5610726858120563732L;
        ii.zld[238] = -460644660420111069L;
        ii.zld[239] = 2181949601419895388L;
        ii.zld[240] = 84947445372095848L;
        ii.zld[241] = -7279405694278271354L;
        ii.zld[242] = 6314219236714132417L;
        ii.zld[243] = 5650152036233805070L;
        ii.zld[244] = -5425471206804998361L;
        ii.zld[245] = 2730285239122462049L;
        ii.zld[246] = -7153901735482277819L;
        ii.zld[247] = 8042265373632457392L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ov lockOn(ov var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, float var8_8, float var9_9, float var10_10, float var11_11) {
        block110: {
            var23_12 = ii.c;
            var22_13 /* !! */  = ii.b;
            var21_14 = ii.a;
            if (var23_12) {
                throw null;
lbl6:
                // 30 sources

                return null;
            }
            if (var21_14 || var21_14) ** GOTO lbl6
            if (!(var4_4 < ii.zle("aaud", zlg(int ), (int)664))) break block110;
            if (var21_14 || var21_14) ** GOTO lbl6
            this.pursueStreak = (int)ii.zle("aaue", zlk(int ), (int)665);
            if (var21_14 || var21_14) ** GOTO lbl6
            return this.finishStep(var1_1, var2_2, var3_3, var5_5, var6_6, (float)ii.zle("aauf", zlg(int ), (int)666));
        }
        if (var21_14 || var21_14) ** GOTO lbl6
        var12_15 = class_3532.method_15363((float)(this.lerp((float)ii.zle("aaug", zlg(int ), (int)667), (float)ii.zle("aauh", zlg(int ), (int)668)) * (ii.zle("aaui", zlg(int ), (int)669) + var9_9)), (float)ii.zle("aauj", zlg(int ), (int)670), (float)var10_10);
        if (var21_14 || var21_14) ** GOTO lbl6
        var13_16 = class_3532.method_15363((float)(this.lerp((float)ii.zle("aauk", zlg(int ), (int)671), (float)ii.zle("aaul", zlg(int ), (int)672)) * (ii.zle("aaum", zlg(int ), (int)673) + var9_9)), (float)ii.zle("aaun", zlg(int ), (int)674), (float)(var10_10 * ii.zle("aauo", zlg(int ), (int)675)));
        if (var21_14 || var21_14) ** GOTO lbl6
        if (this.lockSkewTicks <= 0) ** GOTO lbl37
        if (var22_13 /* !! */  == 0) ** GOTO lbl-1000
        switch (var22_13 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var21_14 || var21_14) ** GOTO lbl6
                this.lockSkewTicks -= ii.zle("aaup", zlk(int ), (int)676);
                if (var21_14 || var21_14) ** GOTO lbl6
                if (!this.lockSkewYaw) ** GOTO lbl34
                if (var21_14) ** GOTO lbl6
                var13_16 *= this.lerp((float)ii.zle("aauq", zlg(int ), (int)677), (float)ii.zle("aaur", zlg(int ), (int)678));
                if (var21_14) ** GOTO lbl6
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl37
lbl34:
                // 1 sources

                if (var21_14 || var21_14) ** GOTO lbl6
                var12_15 *= this.lerp((float)ii.zle("aaus", zlg(int ), (int)679), (float)ii.zle("aaut", zlg(int ), (int)680));
                if (var21_14) ** GOTO lbl6
lbl37:
                // 3 sources

                if (var21_14 || var21_14) ** GOTO lbl6
                var12_15 *= ii.zle("aauu", zlg(int ), (int)681) + this.random.nextFloat() * ii.zle("aauv", zlg(int ), (int)682);
                if (var21_14 || var21_14) ** GOTO lbl6
                var13_16 *= ii.zle("aauw", zlg(int ), (int)683) + this.random.nextFloat() * ii.zle("aaux", zlg(int ), (int)684);
                if (var21_14 || var21_14) ** GOTO lbl6
                var14_17 = var2_2 * var12_15 - var7_7 * ii.zle("aauy", zlg(int ), (int)685) + var5_5 + this.wanderYaw * this.lerp((float)ii.zle("aauz", zlg(int ), (int)686), (float)ii.zle("aava", zlg(int ), (int)687));
                if (var21_14 || var21_14) ** GOTO lbl6
                var15_18 = var3_3 * var13_16 - var8_8 * ii.zle("aavb", zlg(int ), (int)688) + var6_6 + this.wanderPitch * this.lerp((float)ii.zle("aavc", zlg(int ), (int)689), (float)ii.zle("aavd", zlg(int ), (int)690));
                if (var21_14 || var21_14) ** GOTO lbl6
                var16_19 = this.lerp((float)ii.zle("aave", zlg(int ), (int)691), (float)ii.zle("aavf", zlg(int ), (int)692));
                if (var21_14 || var21_14) ** GOTO lbl6
                var14_17 = this.lastStepYaw * var16_19 + var14_17 * (1.0f - var16_19);
                if (var21_14 || var21_14) ** GOTO lbl6
                var15_18 = this.lastStepPitch * var16_19 + var15_18 * (1.0f - var16_19);
                if (var21_14 || var21_14) ** GOTO lbl6
                var17_20 = this.lerp((float)ii.zle("aavg", zlg(int ), (int)693), (float)ii.zle("aavh", zlg(int ), (int)694)) * (ii.zle("aavi", zlg(int ), (int)695) + var9_9);
                if (var21_14 || var21_14) ** GOTO lbl6
                var18_21 = this.lerp((float)ii.zle("aavj", zlg(int ), (int)696), (float)ii.zle("aavk", zlg(int ), (int)697)) * (ii.zle("aavl", zlg(int ), (int)698) + var9_9);
                if (var21_14 || var21_14) ** GOTO lbl6
                var19_22 = Math.abs(var14_17);
                if (var21_14 || var21_14) ** GOTO lbl6
                var20_23 = Math.abs(var15_18);
                if (var21_14 || var21_14) ** GOTO lbl6
                if (!(var19_22 > var17_20)) ** GOTO lbl64
                if (var21_14) ** GOTO lbl6
                var14_17 *= var17_20 / var19_22;
                if (var21_14) ** GOTO lbl6
lbl64:
                // 2 sources

                if (var21_14 || var21_14) ** GOTO lbl6
                if (!(var20_23 > var18_21)) ** GOTO lbl69
                if (var21_14) ** GOTO lbl6
                var15_18 *= var18_21 / var20_23;
                if (var21_14) ** GOTO lbl6
lbl69:
                // 2 sources

                if (!var21_14 && !var21_14) ** break;
                ** continue;
                return this.commitSyntheticStep(var1_1, var2_2, var3_3, var4_4, var14_17, var15_18, var5_5, var6_6, (float)ii.zle("aavm", zlg(int ), (int)699), (boolean)ii.zle("aavn", zlk(int ), (int)700), (boolean)ii.zle("aavo", zlk(int ), (int)701));
            }
lbl72:
            // 2 sources

            case 0: {
                var22_13 /* !! */  = (int)ii.zle("aavp", zlk(int ), (int)702);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl313
            }
lbl77:
            // 2 sources

            case 1: {
                var22_13 /* !! */  = (int)ii.zle("aavq", zlk(int ), (int)703);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl179
            }
lbl82:
            // 3 sources

            case 2: {
                var22_13 /* !! */  = (int)ii.zle("aavr", zlk(int ), (int)704);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl257
            }
            case 3: {
                var22_13 /* !! */  = (int)ii.zle("aavs", zlk(int ), (int)705);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl309
            }
lbl92:
            // 2 sources

            case 4: {
                var22_13 /* !! */  = (int)ii.zle("aavt", zlk(int ), (int)706);
                if (!var23_12) ** GOTO lbl72
                throw null;
            }
            case 5: {
                var22_13 /* !! */  = (int)ii.zle("aavu", zlk(int ), (int)707);
                if (!var23_12) ** GOTO lbl77
                throw null;
            }
lbl100:
            // 3 sources

            case 6: {
                var22_13 /* !! */  = (int)ii.zle("aavv", zlk(int ), (int)708);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl120
            }
lbl105:
            // 2 sources

            case 7: {
                var22_13 /* !! */  = (int)ii.zle("aavw", zlk(int ), (int)709);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl228
            }
lbl110:
            // 2 sources

            case 8: {
                var22_13 /* !! */  = (int)ii.zle("aavx", zlk(int ), (int)710);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl232
            }
            case 9: {
                var22_13 /* !! */  = (int)ii.zle("aavy", zlk(int ), (int)711);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl279
            }
lbl120:
            // 2 sources

            case 10: {
                var22_13 /* !! */  = (int)ii.zle("aavz", zlk(int ), (int)712);
                if (!var23_12) ** GOTO lbl105
                throw null;
            }
lbl124:
            // 3 sources

            case 11: {
                var22_13 /* !! */  = (int)ii.zle("aawa", zlk(int ), (int)713);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl245
            }
            case 12: {
                var22_13 /* !! */  = (int)ii.zle("aawb", zlk(int ), (int)714);
                if (!var23_12) break;
                throw null;
            }
            case 13: {
                var22_13 /* !! */  = (int)ii.zle("aawc", zlk(int ), (int)715);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl287
            }
            case 14: {
                var22_13 /* !! */  = (int)ii.zle("aawd", zlk(int ), (int)716);
                if (!var23_12) ** GOTO lbl124
                throw null;
            }
lbl142:
            // 2 sources

            case 15: {
                var22_13 /* !! */  = (int)ii.zle("aawe", zlk(int ), (int)717);
                if (!var23_12) ** GOTO lbl124
                throw null;
            }
lbl146:
            // 2 sources

            case 16: {
                var22_13 /* !! */  = (int)ii.zle("aawf", zlk(int ), (int)718);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl196
            }
lbl151:
            // 3 sources

            case 17: {
                var22_13 /* !! */  = (int)ii.zle("aawg", zlk(int ), (int)719);
                if (!var23_12) ** GOTO lbl82
                throw null;
            }
            case 18: {
                var22_13 /* !! */  = (int)ii.zle("aawh", zlk(int ), (int)720);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl296
            }
lbl160:
            // 2 sources

            case 19: {
                var22_13 /* !! */  = (int)ii.zle("aawi", zlk(int ), (int)721);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl300
            }
lbl165:
            // 2 sources

            case 20: {
                var22_13 /* !! */  = (int)ii.zle("aawj", zlk(int ), (int)722);
                if (!var23_12) ** GOTO lbl142
                throw null;
            }
            case 21: {
                var22_13 /* !! */  = (int)ii.zle("aawk", zlk(int ), (int)723);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl292
            }
lbl174:
            // 3 sources

            case 22: {
                var22_13 /* !! */  = (int)ii.zle("aawl", zlk(int ), (int)724);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl179:
            // 3 sources

            case 23: {
                var22_13 /* !! */  = (int)ii.zle("aawm", zlk(int ), (int)725);
                if (!var23_12) ** GOTO lbl174
                throw null;
            }
            case 24: {
                var22_13 /* !! */  = (int)ii.zle("aawn", zlk(int ), (int)726);
                if (!var23_12) ** GOTO lbl146
                throw null;
            }
lbl187:
            // 2 sources

            case 25: {
                var22_13 /* !! */  = (int)ii.zle("aawo", zlk(int ), (int)727);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl236
            }
lbl192:
            // 3 sources

            case 26: {
                var22_13 /* !! */  = (int)ii.zle("aawp", zlk(int ), (int)728);
                if (var23_12) {
                    throw null;
                }
            }
lbl196:
            // 5 sources

            case 27: {
                var22_13 /* !! */  = (int)ii.zle("aawq", zlk(int ), (int)729);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl309
            }
lbl201:
            // 2 sources

            case 28: {
                var22_13 /* !! */  = (int)ii.zle("aawr", zlk(int ), (int)730);
                if (!var23_12) ** GOTO lbl165
                throw null;
            }
lbl205:
            // 2 sources

            case 29: {
                var22_13 /* !! */  = (int)ii.zle("aaws", zlk(int ), (int)731);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl283
            }
            case 30: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var22_13 /* !! */  = (int)ii.zle("aawt", zlk(int ), (int)732);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl232
                    break;
                }
            }
lbl216:
            // 2 sources

            case 31: {
                var22_13 /* !! */  = (int)ii.zle("aawu", zlk(int ), (int)733);
                if (!var23_12) ** GOTO lbl92
                throw null;
            }
            case 32: {
                var22_13 /* !! */  = (int)ii.zle("aawv", zlk(int ), (int)734);
                if (!var23_12) ** GOTO lbl216
                throw null;
            }
            case 33: {
                var22_13 /* !! */  = (int)ii.zle("aaww", zlk(int ), (int)735);
                if (!var23_12) ** GOTO lbl151
                throw null;
            }
lbl228:
            // 2 sources

            case 34: {
                var22_13 /* !! */  = (int)ii.zle("aawx", zlk(int ), (int)736);
                if (!var23_12) ** GOTO lbl160
                throw null;
            }
lbl232:
            // 4 sources

            case 35: {
                var22_13 /* !! */  = (int)ii.zle("aawy", zlk(int ), (int)737);
                if (!var23_12) ** GOTO lbl151
                throw null;
            }
lbl236:
            // 2 sources

            case 36: {
                var22_13 /* !! */  = (int)ii.zle("aawz", zlk(int ), (int)738);
                if (!var23_12) ** GOTO lbl192
                throw null;
            }
            case 37: {
                var22_13 /* !! */  = (int)ii.zle("aaxa", zlk(int ), (int)739);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl257
            }
lbl245:
            // 2 sources

            case 38: {
                var22_13 /* !! */  = (int)ii.zle("aaxb", zlk(int ), (int)740);
                if (!var23_12) ** GOTO lbl196
                throw null;
            }
            case 39: {
                var22_13 /* !! */  = (int)ii.zle("aaxc", zlk(int ), (int)741);
                if (!var23_12) ** GOTO lbl100
                throw null;
            }
            case 40: {
                var22_13 /* !! */  = (int)ii.zle("aaxd", zlk(int ), (int)742);
                if (!var23_12) ** GOTO lbl100
                throw null;
            }
lbl257:
            // 4 sources

            case 41: {
                var22_13 /* !! */  = (int)ii.zle("aaxe", zlk(int ), (int)743);
                if (!var23_12) ** GOTO lbl110
                throw null;
            }
lbl261:
            // 2 sources

            case 42: {
                var22_13 /* !! */  = (int)ii.zle("aaxf", zlk(int ), (int)744);
                if (!var23_12) ** GOTO lbl201
                throw null;
            }
            case 43: {
                var22_13 /* !! */  = (int)ii.zle("aaxg", zlk(int ), (int)745);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl287
            }
            case 44: {
                var22_13 /* !! */  = (int)ii.zle("aaxh", zlk(int ), (int)746);
                if (!var23_12) ** GOTO lbl261
                throw null;
            }
            case 45: {
                var22_13 /* !! */  = (int)ii.zle("aaxi", zlk(int ), (int)747);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl287
            }
lbl279:
            // 2 sources

            case 46: {
                var22_13 /* !! */  = (int)ii.zle("aaxj", zlk(int ), (int)748);
                if (!var23_12) ** GOTO lbl179
                throw null;
            }
lbl283:
            // 2 sources

            case 47: {
                var22_13 /* !! */  = (int)ii.zle("aaxk", zlk(int ), (int)749);
                if (!var23_12) ** GOTO lbl82
                throw null;
            }
lbl287:
            // 4 sources

            case 48: {
                var22_13 /* !! */  = (int)ii.zle("aaxl", zlk(int ), (int)750);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl309
            }
lbl292:
            // 2 sources

            case 49: {
                var22_13 /* !! */  = (int)ii.zle("aaxm", zlk(int ), (int)751);
                if (!var23_12) ** GOTO lbl205
                throw null;
            }
lbl296:
            // 2 sources

            case 50: {
                var22_13 /* !! */  = (int)ii.zle("aaxn", zlk(int ), (int)752);
                if (!var23_12) ** GOTO lbl232
                throw null;
            }
lbl300:
            // 2 sources

            case 51: {
                var22_13 /* !! */  = (int)ii.zle("aaxo", zlk(int ), (int)753);
                if (!var23_12) ** GOTO lbl257
                throw null;
            }
            case 52: {
                do {
                    var22_13 /* !! */  = (int)ii.zle("aaxp", zlk(int ), (int)754);
                } while (!var23_12);
                throw null;
            }
lbl309:
            // 4 sources

            case 53: {
                var22_13 /* !! */  = (int)ii.zle("aaxq", zlk(int ), (int)755);
                if (!var23_12) ** GOTO lbl192
                throw null;
            }
lbl313:
            // 2 sources

            case 54: {
                var22_13 /* !! */  = (int)ii.zle("aaxr", zlk(int ), (int)756);
                if (!var23_12) ** GOTO lbl174
                throw null;
            }
            case 55: 
        }
        var22_13 /* !! */  = (int)ii.zle("aaxs", zlk(int ), (int)757);
        ** while (!var23_12)
lbl320:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     */
    private ov commitSyntheticStep(ov var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, float var8_8, float var9_9, boolean var10_10, boolean var11_11) {
        block26: {
            block25: {
                block22: {
                    block24: {
                        block23: {
                            block21: {
                                block20: {
                                    block19: {
                                        block17: {
                                            block18: {
                                                var20_12 = ii.c;
                                                var19_13 = ii.b;
                                                var18_14 = ii.a;
                                                if (var20_12) {
                                                    throw null;
lbl6:
                                                    // 60 sources

                                                    return null;
                                                }
                                                if (var18_14 || var18_14) ** GOTO lbl6
                                                var12_15 = this.quantizeDelta(var5_5);
                                                if (var18_14 || var18_14) ** GOTO lbl6
                                                var13_16 = this.quantizeDelta(var6_6);
                                                if (var18_14 || var18_14) ** GOTO lbl6
                                                if (var11_11) {
                                                    v0 = ii.zle("aaxt", zlg(int ), (int)758);
                                                    if (var20_12) {
                                                        throw null;
                                                    }
                                                } else {
                                                    v0 = ii.zle("aaxu", zlg(int ), (int)759);
                                                }
                                                if (var11_11) {
                                                    v1 = ii.zle("aaxv", zlg(int ), (int)760);
                                                    if (var20_12) {
                                                        throw null;
                                                    }
                                                } else {
                                                    v1 = ii.zle("aaxw", zlg(int ), (int)761);
                                                }
                                                var12_15 = class_3532.method_15363((float)var12_15, (float)v0, (float)v1);
                                                if (var18_14 || var18_14) ** GOTO lbl6
                                                if (var11_11) {
                                                    v2 = ii.zle("aaxx", zlg(int ), (int)762);
                                                    if (var20_12) {
                                                        throw null;
                                                    }
                                                } else {
                                                    v2 = ii.zle("aaxy", zlg(int ), (int)763);
                                                }
                                                if (var11_11) {
                                                    v3 = ii.zle("aaxz", zlg(int ), (int)764);
                                                    if (var20_12) {
                                                        throw null;
                                                    }
                                                } else {
                                                    v3 = ii.zle("aaya", zlg(int ), (int)765);
                                                }
                                                var13_16 = class_3532.method_15363((float)var13_16, (float)v2, (float)v3);
                                                if (var18_14 || var18_14) ** GOTO lbl6
                                                if (!var11_11) break block17;
                                                if (var18_14 || var18_14) ** GOTO lbl6
                                                var14_17 = Math.abs(var12_15) / (Math.abs(var2_2) + ii.zle("aayb", zlg(int ), (int)766));
                                                if (var18_14 || var18_14) ** GOTO lbl6
                                                var15_18 = Math.abs(var13_16) / (Math.abs(var3_3) + ii.zle("aayc", zlg(int ), (int)767));
                                                if (var18_14 || var18_14) ** GOTO lbl6
                                                if (!(var14_17 > ii.zle("aayd", zlg(int ), (int)768))) break block18;
                                                if (var18_14) ** GOTO lbl6
                                                var12_15 = this.quantizeDelta(var12_15 * this.lerp((float)ii.zle("aaye", zlg(int ), (int)769), (float)ii.zle("aayf", zlg(int ), (int)770)));
                                                if (var18_14) ** GOTO lbl6
                                            }
                                            if (var18_14 || var18_14) ** GOTO lbl6
                                            if (!(var15_18 > ii.zle("aayg", zlg(int ), (int)771))) break block17;
                                            if (var18_14) ** GOTO lbl6
                                            var13_16 = this.quantizeDelta(var13_16 * this.lerp((float)ii.zle("aayh", zlg(int ), (int)772), (float)ii.zle("aayi", zlg(int ), (int)773)));
                                            if (var18_14) ** GOTO lbl6
                                        }
                                        if (var18_14 || var18_14) ** GOTO lbl6
                                        var14_17 = var4_4 * var4_4 + ii.zle("aayj", zlg(int ), (int)774);
                                        if (var18_14 || var18_14) ** GOTO lbl6
                                        var15_18 = (var12_15 * var2_2 + var13_16 * var3_3) / var14_17;
                                        if (var18_14 || var18_14) ** GOTO lbl6
                                        var16_19 = (float)Math.hypot(var12_15, var13_16);
                                        if (var18_14 || var18_14) ** GOTO lbl6
                                        if (!var11_11) break block19;
                                        if (var18_14) ** GOTO lbl6
                                        if (!(var4_4 < ii.zle("aayk", zlg(int ), (int)775))) break block19;
                                        if (var18_14) ** GOTO lbl6
                                        if (!(var15_18 > ii.zle("aayl", zlg(int ), (int)776))) break block19;
                                        if (var18_14 || var18_14) ** GOTO lbl6
                                        var17_20 = this.deflectStep(var2_2, var3_3, var4_4, var15_18, var12_15, var13_16);
                                        if (var18_14 || var18_14) ** GOTO lbl6
                                        var12_15 = this.quantizeDelta(var17_20[0]);
                                        if (var18_14 || var18_14) ** GOTO lbl6
                                        var13_16 = this.quantizeDelta(var17_20[1]);
                                        if (var18_14 || var18_14) ** GOTO lbl6
                                        var16_19 = (float)Math.hypot(var12_15, var13_16);
                                        if (var18_14 || var18_14) ** GOTO lbl6
                                        var15_18 = (var12_15 * var2_2 + var13_16 * var3_3) / var14_17;
                                        if (var18_14) ** GOTO lbl6
                                    }
                                    if (var18_14 || var18_14) ** GOTO lbl6
                                    if (!var11_11) break block20;
                                    if (var18_14) ** GOTO lbl6
                                    if (!(var4_4 < ii.zle("aaym", zlg(int ), (int)777))) break block20;
                                    if (var18_14) ** GOTO lbl6
                                    if (!(var15_18 > ii.zle("aayn", zlg(int ), (int)778))) break block20;
                                    if (var18_14 || var18_14) ** GOTO lbl6
                                    var17_20 = this.deflectStep(var2_2, var3_3, var4_4, var15_18, var12_15, var13_16);
                                    if (var18_14 || var18_14) ** GOTO lbl6
                                    var12_15 = this.quantizeDelta(var17_20[0] * this.lerp((float)ii.zle("aayo", zlg(int ), (int)779), (float)ii.zle("aayp", zlg(int ), (int)780)));
                                    if (var18_14 || var18_14) ** GOTO lbl6
                                    var13_16 = this.quantizeDelta(var17_20[1] * this.lerp((float)ii.zle("aayq", zlg(int ), (int)781), (float)ii.zle("aayr", zlg(int ), (int)782)));
                                    if (var18_14 || var18_14) ** GOTO lbl6
                                    var16_19 = (float)Math.hypot(var12_15, var13_16);
                                    if (var18_14 || var18_14) ** GOTO lbl6
                                    var15_18 = (var12_15 * var2_2 + var13_16 * var3_3) / var14_17;
                                    if (var18_14) ** GOTO lbl6
                                }
                                if (var18_14 || var18_14) ** GOTO lbl6
                                if (var11_11) break block21;
                                if (var18_14) ** GOTO lbl6
                                if (!(var4_4 < ii.zle("aays", zlg(int ), (int)783))) break block21;
                                if (var18_14) ** GOTO lbl6
                                if (!(var15_18 > ii.zle("aayt", zlg(int ), (int)784))) break block21;
                                if (var18_14 || var18_14) ** GOTO lbl6
                                this.spikeGuardTicks = (int)ii.zle("aayu", zlk(int ), (int)785);
                                if (var18_14 || var18_14) ** GOTO lbl6
                                this.lastCloseRatio = 0.0f;
                                if (var18_14 || var18_14) ** GOTO lbl6
                                return this.finishStep(var1_1, var2_2, var3_3, var7_7, var8_8, (float)ii.zle("aayv", zlg(int ), (int)786));
                            }
                            if (var18_14 || var18_14) ** GOTO lbl6
                            this.lastStepYaw = var12_15;
                            if (var18_14 || var18_14) ** GOTO lbl6
                            this.lastStepPitch = var13_16;
                            if (var18_14 || var18_14) ** GOTO lbl6
                            this.lastCloseRatio = var15_18;
                            if (var18_14 || var18_14) ** GOTO lbl6
                            if (!var10_10) break block22;
                            if (var18_14 || var18_14) ** GOTO lbl6
                            this.pursueStreak += ii.zle("aayw", zlk(int ), (int)787);
                            if (var18_14 || var18_14) ** GOTO lbl6
                            if (!var11_11) break block23;
                            if (var18_14) ** GOTO lbl6
                            if (!(var15_18 > ii.zle("aayx", zlg(int ), (int)788))) break block23;
                            if (var18_14) ** GOTO lbl6
                            if (!(var4_4 < ii.zle("aayy", zlg(int ), (int)789))) break block23;
                            if (var18_14 || var18_14) ** GOTO lbl6
                            this.recoverTicks = (int)ii.zle("aayz", zlk(int ), (int)790);
                            if (var18_14) ** GOTO lbl6
                            if (var20_12) {
                                throw null;
                            }
                            break block22;
                        }
                        if (var18_14 || var18_14) ** GOTO lbl6
                        if (!(var16_19 > ii.zle("aaza", zlg(int ), (int)791))) break block24;
                        if (var18_14 || var18_14) ** GOTO lbl6
                        this.recoverTicks = (int)ii.zle("aazb", zlk(int ), (int)792);
                        if (var18_14) ** GOTO lbl6
                        if (var20_12) {
                            throw null;
                        }
                        break block22;
                    }
                    if (var18_14 || var18_14) ** GOTO lbl6
                    if (this.pursueStreak < ii.zle("aazc", zlk(int ), (int)793) + this.random.nextInt((int)ii.zle("aazd", zlk(int ), (int)794))) break block22;
                    if (var18_14 || var18_14) ** GOTO lbl6
                    this.recoverTicks = (int)ii.zle("aaze", zlk(int ), (int)795);
                    if (var18_14) ** GOTO lbl6
                }
                if (var18_14 || var18_14) ** GOTO lbl6
                if (!var11_11) break block25;
                if (var18_14) ** GOTO lbl6
                v4 = Math.min(var9_9, (float)ii.zle("aazf", zlg(int ), (int)796));
                if (var20_12) {
                    throw null;
                }
                break block26;
            }
            if (var18_14 || var18_14) ** GOTO lbl6
            v4 = var17_21 = var9_9;
        }
        if (!var18_14 && !var18_14) ** break;
        ** while (true)
        return this.finishStep(var1_1, var2_2, var3_3, var12_15, var13_16, var17_21);
    }

    private static /* synthetic */ void abrz() {
        ii.zli[0] = 1565043875;
        ii.zli[1] = 326173195;
        ii.zli[2] = -1052804480;
        ii.zli[3] = -1554291926;
        ii.zli[4] = 1834197831;
        ii.zli[5] = 978071327;
        ii.zli[6] = -566071422;
        ii.zli[7] = -2114341406;
        ii.zli[8] = 362456905;
        ii.zli[9] = -669812288;
        ii.zli[10] = 1642825109;
        ii.zli[11] = 578241839;
        ii.zli[12] = -1219533368;
        ii.zli[13] = -70920087;
        ii.zli[14] = -1829101498;
        ii.zli[15] = 2107847349;
        ii.zli[16] = -1644049368;
        ii.zli[17] = -185313186;
        ii.zli[18] = 1765014156;
        ii.zli[19] = -137836968;
        ii.zli[20] = 718015405;
        ii.zli[21] = 674431867;
        ii.zli[22] = 1801027104;
        ii.zli[23] = -1294690957;
        ii.zli[24] = -2075040960;
        ii.zli[25] = -1655946792;
        ii.zli[26] = 1781601121;
        ii.zli[27] = -1976146709;
        ii.zli[28] = -838031461;
        ii.zli[29] = 1869192154;
        ii.zli[30] = 1401527066;
        ii.zli[31] = 1896485802;
        ii.zli[32] = 959801664;
        ii.zli[33] = -1855265198;
        ii.zli[34] = -1628754719;
        ii.zli[35] = 1702711938;
        ii.zli[36] = 254170002;
        ii.zli[37] = 26762842;
        ii.zli[38] = 171663261;
        ii.zli[39] = 85049597;
        ii.zli[40] = 878627409;
        ii.zli[41] = -1680780003;
        ii.zli[42] = -2124734011;
        ii.zli[43] = 1096861437;
        ii.zli[44] = 844679248;
        ii.zli[45] = -710821258;
        ii.zli[46] = -1793976009;
        ii.zli[47] = -1445209600;
        ii.zli[48] = 793867626;
        ii.zli[49] = 1246965206;
        ii.zli[50] = -1112560568;
        ii.zli[51] = 787829412;
        ii.zli[52] = 70297526;
        ii.zli[53] = 1082374505;
        ii.zli[54] = 1703610395;
        ii.zli[55] = 1304598125;
        ii.zli[56] = -87374855;
        ii.zli[57] = 1590336379;
        ii.zli[58] = 1078769718;
        ii.zli[59] = 1827707334;
        ii.zli[60] = 1652273500;
        ii.zli[61] = -359284200;
        ii.zli[62] = 1065460562;
        ii.zli[63] = -101712315;
        ii.zli[64] = 2110837854;
        ii.zli[65] = -1578050317;
        ii.zli[66] = 1554022770;
        ii.zli[67] = -2016521933;
        ii.zli[68] = -320649973;
        ii.zli[69] = 546384264;
        ii.zli[70] = -1582817482;
        ii.zli[71] = -1803145654;
        ii.zli[72] = -1268599698;
        ii.zli[73] = -930128508;
        ii.zli[74] = 353239664;
        ii.zli[75] = 1978157760;
        ii.zli[76] = 476362051;
        ii.zli[77] = -102018204;
        ii.zli[78] = 1527026713;
        ii.zli[79] = 1446890685;
        ii.zli[80] = -1314024080;
        ii.zli[81] = 93624228;
        ii.zli[82] = -1128214069;
        ii.zli[83] = -1394247368;
        ii.zli[84] = -23189732;
        ii.zli[85] = 187009594;
        ii.zli[86] = -1068257585;
        ii.zli[87] = 1101719064;
        ii.zli[88] = -877838476;
        ii.zli[89] = 163651178;
        ii.zli[90] = 45875192;
        ii.zli[91] = -778848073;
        ii.zli[92] = -727635835;
        ii.zli[93] = 1666027535;
        ii.zli[94] = -800925704;
        ii.zli[95] = -1947918014;
        ii.zli[96] = 1161694569;
        ii.zli[97] = -657367811;
        ii.zli[98] = 170086841;
        ii.zli[99] = 832527480;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void advanceNoise() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ii.bk - ii.zle("abkj", zlb(int ), (int)158)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ii.zle("abkk", zlk(int ), (int)1020)) break;
            v0 /* !! */  = (long)ii.zle("abkl", zlk(int ), (int)1021);
        }
        var3_1 = ii.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ii.bk - ii.zle("abkm", zlb(int ), (int)159)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ii.zle("abkn", zlk(int ), (int)1022)) break;
            v1 /* !! */  = (long)ii.zle("abko", zlk(int ), (int)1023);
        }
        var2_2 /* !! */  = ii.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ii.bk - ii.zle("abkp", zlb(int ), (int)160)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ii.zle("abkq", zlk(int ), (int)1024)) break;
            v2 /* !! */  = (long)ii.zle("abkr", zlk(int ), (int)1025);
        }
        var1_3 = ii.a;
        if (var3_1) {
            throw null;
lbl21:
            // 7 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl21
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = ii.bk - ii.zle("abks", zlb(int ), (int)161)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ii.zle("abkt", zlk(int ), (int)1026)) break;
            v3 /* !! */  = (long)ii.zle("abku", zlk(int ), (int)1027);
        }
        v4 = ii.zle("abkv", zlg(int ), (int)1028);
        v5 /* !! */  = ii.bk;
        if (true) ** GOTO lbl34
        block82: while (true) {
            v5 /* !! */  = (long)(v6 - ii.zle("abkw", zlb(int ), (int)162));
lbl34:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case 270471926: {
                    v6 = ii.zle("abkx", zlb(int ), (int)163);
                    continue block82;
                }
                case 1109002785: {
                    break block82;
                }
                case 1318413684: {
                    v6 = ii.zle("abky", zlb(int ), (int)164);
                    continue block82;
                }
                case 2072736739: {
                    v6 = ii.zle("abkz", zlb(int ), (int)165);
                    continue block82;
                }
            }
            break;
        }
        v7 = v4 * this.noiseYaw;
        v8 = ii.zle("abla", zlg(int ), (int)1029);
        v9 /* !! */  = ii.bk;
        if (true) ** GOTO lbl52
        block83: while (true) {
            v9 /* !! */  = (long)(v10 - ii.zle("ablb", zlb(int ), (int)166));
lbl52:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -886562275: {
                    v10 = ii.zle("ablc", zlb(int ), (int)167);
                    continue block83;
                }
                case -180947612: {
                    v10 = ii.zle("abld", zlb(int ), (int)168);
                    continue block83;
                }
                case 865283705: {
                    v10 = ii.zle("able", zlb(int ), (int)169);
                    continue block83;
                }
                case 1109002785: {
                    break block83;
                }
            }
            break;
        }
        v11 = this.noiseYaw + (v7 + v8 * this.randGauss());
        v12 /* !! */  = ii.bk;
        if (true) ** GOTO lbl69
        block84: while (true) {
            v12 /* !! */  = (long)(ii.zle("ablg", zlb(int ), (int)171) - ii.zle("ablf", zlb(int ), (int)170));
lbl69:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case 104736272: {
                    continue block84;
                }
                case 1109002785: {
                    break block84;
                }
            }
            break;
        }
        this.noiseYaw = v11;
        if (var1_3 || var1_3) ** GOTO lbl21
        v13 /* !! */  = ii.bk;
        if (true) ** GOTO lbl80
        block85: while (true) {
            v13 /* !! */  = (long)(ii.zle("abli", zlb(int ), (int)173) - ii.zle("ablh", zlb(int ), (int)172));
lbl80:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -837106914: {
                    continue block85;
                }
                case 1109002785: {
                    break block85;
                }
            }
            break;
        }
        v14 = ii.zle("ablj", zlg(int ), (int)1030);
        v15 /* !! */  = ii.bk;
        if (true) ** GOTO lbl90
        block86: while (true) {
            v15 /* !! */  = (long)(v16 - ii.zle("ablk", zlb(int ), (int)174));
lbl90:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -1400746732: {
                    v16 = ii.zle("abll", zlb(int ), (int)175);
                    continue block86;
                }
                case 1086964443: {
                    v16 = ii.zle("ablm", zlb(int ), (int)176);
                    continue block86;
                }
                case 1109002785: {
                    break block86;
                }
            }
            break;
        }
        v17 = v14 * this.noisePitch;
        v18 = ii.zle("abln", zlg(int ), (int)1031);
        v19 /* !! */  = ii.bk;
        if (true) ** GOTO lbl105
        block87: while (true) {
            v19 /* !! */  = (long)(v20 - ii.zle("ablo", zlb(int ), (int)177));
lbl105:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case -1860082130: {
                    v20 = ii.zle("ablp", zlb(int ), (int)178);
                    continue block87;
                }
                case 1109002785: {
                    break block87;
                }
                case 1400996936: {
                    v20 = ii.zle("ablq", zlb(int ), (int)179);
                    continue block87;
                }
            }
            break;
        }
        v21 = this.noisePitch + (v17 + v18 * this.randGauss());
        v22 /* !! */  = ii.bk;
        if (true) ** GOTO lbl119
        block88: while (true) {
            v22 /* !! */  = (long)(v23 - ii.zle("ablr", zlb(int ), (int)180));
lbl119:
            // 2 sources

            switch ((int)v22 /* !! */ ) {
                case -1814889324: {
                    v23 = ii.zle("abls", zlb(int ), (int)181);
                    continue block88;
                }
                case 1109002785: {
                    break block88;
                }
                case 1435087641: {
                    v23 = ii.zle("ablt", zlb(int ), (int)182);
                    continue block88;
                }
                case 1701017628: {
                    v23 = ii.zle("ablu", zlb(int ), (int)183);
                    continue block88;
                }
            }
            break;
        }
        this.noisePitch = v21;
        if (var1_3 || var1_3) ** GOTO lbl21
        while (true) {
            if ((v24 /* !! */  = (cfr_temp_4 = ii.bk - ii.zle("ablv", zlb(int ), (int)184)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v24 /* !! */  == ii.zle("ablw", zlk(int ), (int)1032)) break;
            v24 /* !! */  = (long)ii.zle("ablx", zlk(int ), (int)1033);
        }
        v25 = ii.zle("ably", zlg(int ), (int)1034);
        v26 /* !! */  = ii.bk;
        if (true) ** GOTO lbl143
        block90: while (true) {
            v26 /* !! */  = (long)(ii.zle("abma", zlb(int ), (int)186) - ii.zle("ablz", zlb(int ), (int)185));
lbl143:
            // 2 sources

            switch ((int)v26 /* !! */ ) {
                case 16507674: {
                    continue block90;
                }
                case 1109002785: {
                    break block90;
                }
            }
            break;
        }
        v27 = v25 * this.wanderYaw;
        v28 = ii.zle("abmb", zlg(int ), (int)1035);
        while (true) {
            if ((v29 /* !! */  = (cfr_temp_5 = ii.bk - ii.zle("abmc", zlb(int ), (int)187)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v29 /* !! */  == ii.zle("abmd", zlk(int ), (int)1036)) break;
            v29 /* !! */  = (long)ii.zle("abme", zlk(int ), (int)1037);
        }
        v30 = this.wanderYaw + (v27 + v28 * this.randGauss());
        v31 /* !! */  = ii.bk;
        if (true) ** GOTO lbl160
        block92: while (true) {
            v31 /* !! */  = (long)(ii.zle("abmg", zlb(int ), (int)189) - ii.zle("abmf", zlb(int ), (int)188));
lbl160:
            // 2 sources

            switch ((int)v31 /* !! */ ) {
                case 68258510: {
                    continue block92;
                }
                case 1109002785: {
                    break block92;
                }
            }
            break;
        }
        this.wanderYaw = v30;
        if (var1_3 || var1_3) ** GOTO lbl21
        while (true) {
            if ((v32 /* !! */  = (cfr_temp_6 = ii.bk - ii.zle("abmh", zlb(int ), (int)190)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v32 /* !! */  == ii.zle("abmi", zlk(int ), (int)1038)) break;
            v32 /* !! */  = (long)ii.zle("abmj", zlk(int ), (int)1039);
        }
        v33 = ii.zle("abmk", zlg(int ), (int)1040);
        while (true) {
            if ((v34 /* !! */  = (cfr_temp_7 = ii.bk - ii.zle("abml", zlb(int ), (int)191)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v34 /* !! */  == ii.zle("abmm", zlk(int ), (int)1041)) break;
            v34 /* !! */  = (long)ii.zle("abmn", zlk(int ), (int)1042);
        }
        v35 = v33 * this.wanderPitch;
        v36 = ii.zle("abmo", zlg(int ), (int)1043);
        while (true) {
            if ((v37 /* !! */  = (cfr_temp_8 = ii.bk - ii.zle("abmp", zlb(int ), (int)192)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v37 /* !! */  == ii.zle("abmq", zlk(int ), (int)1044)) break;
            v37 /* !! */  = (long)ii.zle("abmr", zlk(int ), (int)1045);
        }
        v38 = this.wanderPitch + (v35 + v36 * this.randGauss());
        v39 /* !! */  = ii.bk;
        if (true) ** GOTO lbl190
        block96: while (true) {
            v39 /* !! */  = (long)(v40 - ii.zle("abms", zlb(int ), (int)193));
lbl190:
            // 2 sources

            switch ((int)v39 /* !! */ ) {
                case -924925230: {
                    v40 = ii.zle("abmt", zlb(int ), (int)194);
                    continue block96;
                }
                case -94251699: {
                    v40 = ii.zle("abmu", zlb(int ), (int)195);
                    continue block96;
                }
                case 1109002785: {
                    break block96;
                }
            }
            break;
        }
        this.wanderPitch = v38;
        if (var1_3 || var1_3) ** GOTO lbl21
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v41 /* !! */  = (cfr_temp_9 = ii.bk - ii.zle("abmv", zlb(int ), (int)196)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v41 /* !! */  == ii.zle("abmw", zlk(int ), (int)1046)) break;
                    v41 /* !! */  = (long)ii.zle("abmx", zlk(int ), (int)1047);
                }
                v42 = ii.zle("abmy", zlg(int ), (int)1048);
                while (true) {
                    if ((v43 /* !! */  = (cfr_temp_10 = ii.bk - ii.zle("abmz", zlb(int ), (int)197)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v43 /* !! */  == ii.zle("abna", zlk(int ), (int)1049)) break;
                    v43 /* !! */  = (long)ii.zle("abnb", zlk(int ), (int)1050);
                }
                v44 = v42 * this.speedDrift;
                v45 = ii.zle("abnc", zlg(int ), (int)1051);
                while (true) {
                    if ((v46 /* !! */  = (cfr_temp_11 = ii.bk - ii.zle("abnd", zlb(int ), (int)198)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v46 /* !! */  == ii.zle("abne", zlk(int ), (int)1052)) break;
                    v46 /* !! */  = (long)ii.zle("abnf", zlk(int ), (int)1053);
                }
                v47 = this.speedDrift + (v44 + v45 * this.randGauss());
                v48 /* !! */  = ii.bk;
                if (true) ** GOTO lbl227
                block100: while (true) {
                    v48 /* !! */  = (long)(v49 - ii.zle("abng", zlb(int ), (int)199));
lbl227:
                    // 2 sources

                    switch ((int)v48 /* !! */ ) {
                        case -1092660911: {
                            v49 = ii.zle("abnh", zlb(int ), (int)200);
                            continue block100;
                        }
                        case -962689887: {
                            v49 = ii.zle("abni", zlb(int ), (int)201);
                            continue block100;
                        }
                        case 441062165: {
                            v49 = ii.zle("abnj", zlb(int ), (int)202);
                            continue block100;
                        }
                        case 1109002785: {
                            break block100;
                        }
                    }
                    break;
                }
                this.speedDrift = v47;
                if (var1_3 || var1_3) ** GOTO lbl21
                while (true) {
                    if ((v50 /* !! */  = (cfr_temp_12 = ii.bk - ii.zle("abnk", zlb(int ), (int)203)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v50 /* !! */  == ii.zle("abnl", zlk(int ), (int)1054)) break;
                    v50 /* !! */  = (long)ii.zle("abnm", zlk(int ), (int)1055);
                }
                v51 = ii.zle("abnn", zlg(int ), (int)1056);
                v52 = ii.zle("abno", zlg(int ), (int)1057);
                v53 /* !! */  = ii.bk;
                if (true) ** GOTO lbl252
                block102: while (true) {
                    v53 /* !! */  = (long)(ii.zle("abnq", zlb(int ), (int)205) - ii.zle("abnp", zlb(int ), (int)204));
lbl252:
                    // 2 sources

                    switch ((int)v53 /* !! */ ) {
                        case 1109002785: {
                            break block102;
                        }
                        case 1216137844: {
                            continue block102;
                        }
                    }
                    break;
                }
                v54 = class_3532.method_15363((float)this.speedDrift, (float)v51, (float)v52);
                while (true) {
                    if ((v55 /* !! */  = (cfr_temp_13 = ii.bk - ii.zle("abnr", zlb(int ), (int)206)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v55 /* !! */  == ii.zle("abns", zlk(int ), (int)1058)) break;
                    v55 /* !! */  = (long)ii.zle("abnt", zlk(int ), (int)1059);
                }
                this.speedDrift = v54;
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)ii.zle("abnu", zlk(int ), (int)1060);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl322
            }
lbl271:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ii.zle("abnv", zlk(int ), (int)1061);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl300
            }
lbl276:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)ii.zle("abnw", zlk(int ), (int)1062);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl313
            }
            case 3: {
                var2_2 /* !! */  = (int)ii.zle("abnx", zlk(int ), (int)1063);
                if (!var3_1) ** GOTO lbl271
                throw null;
            }
            case 4: {
                do {
                    var2_2 /* !! */  = (int)ii.zle("abny", zlk(int ), (int)1064);
                } while (!var3_1);
                throw null;
            }
lbl290:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)ii.zle("abnz", zlk(int ), (int)1065);
                if (var3_1) {
                    throw null;
                }
            }
lbl294:
            // 4 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ii.zle("aboa", zlk(int ), (int)1066);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl309
                    break;
                }
            }
lbl300:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)ii.zle("abob", zlk(int ), (int)1067);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl313
            }
lbl305:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)ii.zle("aboc", zlk(int ), (int)1068);
                if (!var3_1) ** GOTO lbl294
                throw null;
            }
lbl309:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)ii.zle("abod", zlk(int ), (int)1069);
                if (!var3_1) ** GOTO lbl276
                throw null;
            }
lbl313:
            // 3 sources

            case 10: {
                do {
                    var2_2 /* !! */  = (int)ii.zle("aboe", zlk(int ), (int)1070);
                } while (!var3_1);
                throw null;
            }
            case 11: {
                var2_2 /* !! */  = (int)ii.zle("abof", zlk(int ), (int)1071);
                if (var3_1) {
                    throw null;
                }
            }
lbl322:
            // 4 sources

            case 12: {
                var2_2 /* !! */  = (int)ii.zle("abog", zlk(int ), (int)1072);
                if (!var3_1) ** GOTO lbl290
                throw null;
            }
            case 13: {
                var2_2 /* !! */  = (int)ii.zle("aboh", zlk(int ), (int)1073);
                if (!var3_1) ** GOTO lbl305
                throw null;
            }
            case 14: {
                var2_2 /* !! */  = (int)ii.zle("aboi", zlk(int ), (int)1074);
                if (!var3_1) break;
                throw null;
            }
            case 15: 
        }
        var2_2 /* !! */  = (int)ii.zle("aboj", zlk(int ), (int)1075);
        ** while (!var3_1)
lbl337:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void abro() {
        ii.zlh[100] = 1491190691;
        ii.zlh[101] = -908265467;
        ii.zlh[102] = 887027661;
        ii.zlh[103] = 1488851557;
        ii.zlh[104] = 1530891833;
        ii.zlh[105] = -967529176;
        ii.zlh[106] = -2008010288;
        ii.zlh[107] = 377879701;
        ii.zlh[108] = 1850506417;
        ii.zlh[109] = 864544393;
        ii.zlh[110] = 1369609321;
        ii.zlh[111] = 1529569558;
        ii.zlh[112] = 472753764;
        ii.zlh[113] = 1091394483;
        ii.zlh[114] = -88092265;
        ii.zlh[115] = -1490181073;
        ii.zlh[116] = -797704665;
        ii.zlh[117] = -1040825297;
        ii.zlh[118] = 2136811947;
        ii.zlh[119] = -121391963;
        ii.zlh[120] = 560753208;
        ii.zlh[121] = 1732533090;
        ii.zlh[122] = -919946446;
        ii.zlh[123] = 795288630;
        ii.zlh[124] = -476302557;
        ii.zlh[125] = 1315903643;
        ii.zlh[126] = 135547289;
        ii.zlh[127] = 1585819991;
        ii.zlh[128] = 594503931;
        ii.zlh[129] = 1659621454;
        ii.zlh[130] = -928060139;
        ii.zlh[131] = 2016045840;
        ii.zlh[132] = 175831003;
        ii.zlh[133] = -1882140444;
        ii.zlh[134] = 192592741;
        ii.zlh[135] = -1473327894;
        ii.zlh[136] = -131702416;
        ii.zlh[137] = -1866654938;
        ii.zlh[138] = 1114629178;
        ii.zlh[139] = 1217599242;
        ii.zlh[140] = -1921252603;
        ii.zlh[141] = 1843468279;
        ii.zlh[142] = -1860217701;
        ii.zlh[143] = -1412602045;
        ii.zlh[144] = 1741128813;
        ii.zlh[145] = -1555368763;
        ii.zlh[146] = -1241720013;
        ii.zlh[147] = 964908345;
        ii.zlh[148] = -1901036507;
        ii.zlh[149] = 959218882;
        ii.zlh[150] = 1044497697;
        ii.zlh[151] = 667555771;
        ii.zlh[152] = -18872449;
        ii.zlh[153] = 1964953245;
        ii.zlh[154] = -532433634;
        ii.zlh[155] = 1980069363;
        ii.zlh[156] = 1366334604;
        ii.zlh[157] = -2113951407;
        ii.zlh[158] = -43679716;
        ii.zlh[159] = -1220126457;
        ii.zlh[160] = 629442407;
        ii.zlh[161] = -806239406;
        ii.zlh[162] = 925142940;
        ii.zlh[163] = 1584304106;
        ii.zlh[164] = 0xBF0BBFB;
        ii.zlh[165] = -1855752200;
        ii.zlh[166] = 1055495436;
        ii.zlh[167] = 2069390666;
        ii.zlh[168] = 1568357069;
        ii.zlh[169] = -1159522491;
        ii.zlh[170] = -1091017961;
        ii.zlh[171] = 2018458406;
        ii.zlh[172] = -305046168;
        ii.zlh[173] = 1392345942;
        ii.zlh[174] = -1539047322;
        ii.zlh[175] = 424989887;
        ii.zlh[176] = 152695694;
        ii.zlh[177] = 2077116514;
        ii.zlh[178] = 531186614;
        ii.zlh[179] = 670255650;
        ii.zlh[180] = 1141436403;
        ii.zlh[181] = 1891013975;
        ii.zlh[182] = -362571955;
        ii.zlh[183] = 1642399487;
        ii.zlh[184] = -1890454456;
        ii.zlh[185] = 438480910;
        ii.zlh[186] = 179613917;
        ii.zlh[187] = 1497999227;
        ii.zlh[188] = -1391709483;
        ii.zlh[189] = 496753073;
        ii.zlh[190] = -336508365;
        ii.zlh[191] = -1540402936;
        ii.zlh[192] = 1155763869;
        ii.zlh[193] = -606162142;
        ii.zlh[194] = -709737467;
        ii.zlh[195] = -1319159885;
        ii.zlh[196] = 1641581079;
        ii.zlh[197] = 1871484477;
        ii.zlh[198] = -99963001;
        ii.zlh[199] = 1107581846;
    }

    private static /* synthetic */ long zlb(int n2) {
        return zlc[n2] ^ zld[n2];
    }

    private static /* synthetic */ void abrn() {
        ii.zlh[0] = 574051164;
        ii.zlh[1] = -326173196;
        ii.zlh[2] = 1094679168;
        ii.zlh[3] = -1554291934;
        ii.zlh[4] = 1834197830;
        ii.zlh[5] = 978071321;
        ii.zlh[6] = -566071422;
        ii.zlh[7] = -2114341405;
        ii.zlh[8] = 362456906;
        ii.zlh[9] = -669812285;
        ii.zlh[10] = 1642825107;
        ii.zlh[11] = 578241836;
        ii.zlh[12] = 1219533367;
        ii.zlh[13] = -599962902;
        ii.zlh[14] = 1829101497;
        ii.zlh[15] = -1140220315;
        ii.zlh[16] = 1644049367;
        ii.zlh[17] = 1225844518;
        ii.zlh[18] = -1765014157;
        ii.zlh[19] = 237826576;
        ii.zlh[20] = -718015406;
        ii.zlh[21] = -685331088;
        ii.zlh[22] = -1801027105;
        ii.zlh[23] = 1094954357;
        ii.zlh[24] = -2075040957;
        ii.zlh[25] = -1655946787;
        ii.zlh[26] = 1781601123;
        ii.zlh[27] = -1976146718;
        ii.zlh[28] = -838031464;
        ii.zlh[29] = 1869192147;
        ii.zlh[30] = 1401527057;
        ii.zlh[31] = 1896485804;
        ii.zlh[32] = 959801674;
        ii.zlh[33] = -1855265193;
        ii.zlh[34] = -1628754715;
        ii.zlh[35] = 1702711938;
        ii.zlh[36] = 254170002;
        ii.zlh[37] = 26762842;
        ii.zlh[38] = 171663261;
        ii.zlh[39] = 85049597;
        ii.zlh[40] = 878627409;
        ii.zlh[41] = -458315038;
        ii.zlh[42] = -2124734011;
        ii.zlh[43] = 1096861437;
        ii.zlh[44] = 844679261;
        ii.zlh[45] = -710821269;
        ii.zlh[46] = -1793976022;
        ii.zlh[47] = -1445209596;
        ii.zlh[48] = 793867625;
        ii.zlh[49] = 1246965191;
        ii.zlh[50] = -1112560573;
        ii.zlh[51] = 787829424;
        ii.zlh[52] = 70297505;
        ii.zlh[53] = 1082374497;
        ii.zlh[54] = 1703610397;
        ii.zlh[55] = 1304598137;
        ii.zlh[56] = -87374868;
        ii.zlh[57] = 1590336346;
        ii.zlh[58] = 1078769714;
        ii.zlh[59] = 1827707340;
        ii.zlh[60] = 1652273488;
        ii.zlh[61] = -359284219;
        ii.zlh[62] = 1065460570;
        ii.zlh[63] = -101712310;
        ii.zlh[64] = 2110837851;
        ii.zlh[65] = -1578050313;
        ii.zlh[66] = 1554022767;
        ii.zlh[67] = -2016521946;
        ii.zlh[68] = -320649983;
        ii.zlh[69] = 546384266;
        ii.zlh[70] = -1582817494;
        ii.zlh[71] = -1803145662;
        ii.zlh[72] = -1268599730;
        ii.zlh[73] = -930128483;
        ii.zlh[74] = 353239662;
        ii.zlh[75] = 1978157761;
        ii.zlh[76] = 476362069;
        ii.zlh[77] = -102018196;
        ii.zlh[78] = -1527026714;
        ii.zlh[79] = -215737854;
        ii.zlh[80] = 1314024079;
        ii.zlh[81] = -569934175;
        ii.zlh[82] = -2126041301;
        ii.zlh[83] = -1815384765;
        ii.zlh[84] = -1048068474;
        ii.zlh[85] = 878847022;
        ii.zlh[86] = 1068257584;
        ii.zlh[87] = 309139568;
        ii.zlh[88] = -877838474;
        ii.zlh[89] = 163651178;
        ii.zlh[90] = 0x2BBFFFB;
        ii.zlh[91] = -778848075;
        ii.zlh[92] = -727635836;
        ii.zlh[93] = 1130123465;
        ii.zlh[94] = -277583256;
        ii.zlh[95] = 1947918013;
        ii.zlh[96] = -1999193506;
        ii.zlh[97] = 657367810;
        ii.zlh[98] = 651657190;
        ii.zlh[99] = -832527481;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private float strength() {
        v0 /* !! */  = ii.bk;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - ii.zle("zpf", zlb(int ), (int)22));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 492826535: {
                    v1 = ii.zle("zpg", zlb(int ), (int)23);
                    continue block16;
                }
                case 706071265: {
                    v1 = ii.zle("zph", zlb(int ), (int)24);
                    continue block16;
                }
                case 1109002785: {
                    break block16;
                }
            }
            break;
        }
        var3_1 = ii.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ii.bk - ii.zle("zpi", zlb(int ), (int)25)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ii.zle("zpj", zlk(int ), (int)78)) break;
            v2 /* !! */  = (long)ii.zle("zpk", zlk(int ), (int)79);
        }
        var2_2 /* !! */  = ii.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = ii.bk - ii.zle("zpl", zlb(int ), (int)26)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ii.zle("zpm", zlk(int ), (int)80)) {
                var1_3 = ii.a;
                if (var3_1) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)ii.zle("zpn", zlk(int ), (int)81);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block19: do {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var1_3 != false) return (float)ii.zle("zpo", zlg(int ), (int)82);
                    if (var1_3 != false) return (float)ii.zle("zpo", zlg(int ), (int)82);
                    v4 = ii.zle("zpp", zlg(int ), (int)83);
                    v5 /* !! */  = ii.bk;
                    block20: while (true) {
                        switch ((int)v5 /* !! */ ) {
                            case -1854361439: {
                                v6 = ii.zle("zpr", zlb(int ), (int)28);
                                ** GOTO lbl46
                            }
                            case 486203204: {
                                v6 = ii.zle("zps", zlb(int ), (int)29);
lbl46:
                                // 2 sources

                                v5 /* !! */  = (long)(v6 - ii.zle("zpq", zlb(int ), (int)27));
                                continue block20;
                            }
                            case 1109002785: {
                                break block20;
                            }
                        }
                        break;
                    }
                    v7 = v4 + this.speedDrift;
                    v8 = ii.zle("zpt", zlg(int ), (int)84);
                    v9 = ii.zle("zpu", zlg(int ), (int)85);
                    while (true) {
                        if ((v10 /* !! */  = (cfr_temp_3 = ii.bk - ii.zle("zpv", zlb(int ), (int)30)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v10 /* !! */  == ii.zle("zpw", zlk(int ), (int)86)) {
                            return class_3532.method_15363((float)v7, (float)v8, (float)v9);
                        }
                        v10 /* !! */  = (long)ii.zle("zpx", zlk(int ), (int)87);
                    }
                }
                case 0: {
                    ** GOTO lbl70
                }
                case 2: {
                    var2_2 /* !! */  = (int)ii.zle("zqa", zlk(int ), (int)90);
                    cfr_temp_0 = 1;
                    if (!var3_1) continue block19;
                    throw null;
                }
                case 3: {
                    var2_2 /* !! */  = (int)ii.zle("zqb", zlk(int ), (int)91);
                    if (var3_1) {
                        throw null;
                    }
lbl70:
                    // 3 sources

                    var2_2 /* !! */  = (int)ii.zle("zpy", zlk(int ), (int)88);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: 
            }
            break;
        } while (true);
        do {
            var2_2 /* !! */  = (int)ii.zle("zpz", zlk(int ), (int)89);
        } while (!var3_1);
        throw null;
    }

    static {
        zlh = new int[1116];
        zli = new int[1116];
        ii.abrn();
        ii.abro();
        ii.abrp();
        ii.abrq();
        ii.abrr();
        ii.abrs();
        ii.abrt();
        ii.abru();
        ii.abrv();
        ii.abrw();
        ii.abrx();
        ii.abry();
        ii.abrz();
        ii.absa();
        ii.absb();
        ii.absc();
        ii.absd();
        ii.abse();
        ii.absf();
        ii.absg();
        ii.absh();
        ii.absi();
        ii.absj();
        ii.absk();
        zlc = new long[248];
        zld = new long[248];
        ii.absl();
        ii.absm();
        ii.absn();
        ii.abso();
        ii.absp();
        ii.absq();
    }

    private static /* synthetic */ void abrt() {
        ii.zlh[600] = -107619949;
        ii.zlh[601] = -2026570185;
        ii.zlh[602] = -1600060677;
        ii.zlh[603] = -833375200;
        ii.zlh[604] = 136801716;
        ii.zlh[605] = 1931204674;
        ii.zlh[606] = 1384385686;
        ii.zlh[607] = 1052209775;
        ii.zlh[608] = -1684250724;
        ii.zlh[609] = 565342848;
        ii.zlh[610] = 200138786;
        ii.zlh[611] = 284769926;
        ii.zlh[612] = -385292582;
        ii.zlh[613] = 838690929;
        ii.zlh[614] = 74945584;
        ii.zlh[615] = 1536254652;
        ii.zlh[616] = 1710258630;
        ii.zlh[617] = -1023783385;
        ii.zlh[618] = -518828669;
        ii.zlh[619] = -290635013;
        ii.zlh[620] = -1578693756;
        ii.zlh[621] = 1283893054;
        ii.zlh[622] = 2131399587;
        ii.zlh[623] = -1509955067;
        ii.zlh[624] = -542827677;
        ii.zlh[625] = 1584750553;
        ii.zlh[626] = -958969865;
        ii.zlh[627] = -1111054411;
        ii.zlh[628] = 795959361;
        ii.zlh[629] = -2084311684;
        ii.zlh[630] = -192312827;
        ii.zlh[631] = -2096204960;
        ii.zlh[632] = 692364090;
        ii.zlh[633] = -372386575;
        ii.zlh[634] = -275347221;
        ii.zlh[635] = -785780908;
        ii.zlh[636] = 689529616;
        ii.zlh[637] = -1618610653;
        ii.zlh[638] = -696207265;
        ii.zlh[639] = -774944651;
        ii.zlh[640] = -2060533146;
        ii.zlh[641] = 824775066;
        ii.zlh[642] = -1607871111;
        ii.zlh[643] = -1777338053;
        ii.zlh[644] = 0x38855358;
        ii.zlh[645] = -1833931090;
        ii.zlh[646] = -411161256;
        ii.zlh[647] = 601417525;
        ii.zlh[648] = 2007233965;
        ii.zlh[649] = -1497291520;
        ii.zlh[650] = -1011766409;
        ii.zlh[651] = 317258006;
        ii.zlh[652] = 1586966140;
        ii.zlh[653] = -1715321047;
        ii.zlh[654] = 418612950;
        ii.zlh[655] = -1279986177;
        ii.zlh[656] = 921379164;
        ii.zlh[657] = -1919685596;
        ii.zlh[658] = 1127658806;
        ii.zlh[659] = -1856314786;
        ii.zlh[660] = 2011099552;
        ii.zlh[661] = -780488813;
        ii.zlh[662] = 411973370;
        ii.zlh[663] = -642229231;
        ii.zlh[664] = -902058821;
        ii.zlh[665] = -194458688;
        ii.zlh[666] = -1887756533;
        ii.zlh[667] = -350324284;
        ii.zlh[668] = 2026814217;
        ii.zlh[669] = 1772259933;
        ii.zlh[670] = 1286441740;
        ii.zlh[671] = -1391333424;
        ii.zlh[672] = 1742331639;
        ii.zlh[673] = 789528422;
        ii.zlh[674] = -1204209664;
        ii.zlh[675] = 648255919;
        ii.zlh[676] = 380521015;
        ii.zlh[677] = 1401856923;
        ii.zlh[678] = 432481981;
        ii.zlh[679] = 1370830577;
        ii.zlh[680] = -2048205510;
        ii.zlh[681] = 1157443484;
        ii.zlh[682] = 1499173963;
        ii.zlh[683] = -1246463469;
        ii.zlh[684] = -856146845;
        ii.zlh[685] = 666024433;
        ii.zlh[686] = 1423654342;
        ii.zlh[687] = 1901219918;
        ii.zlh[688] = -340722107;
        ii.zlh[689] = 583867625;
        ii.zlh[690] = -1695467707;
        ii.zlh[691] = 889034042;
        ii.zlh[692] = 1607755897;
        ii.zlh[693] = 2004650701;
        ii.zlh[694] = -842308718;
        ii.zlh[695] = -1307108737;
        ii.zlh[696] = -2038568535;
        ii.zlh[697] = 781465572;
        ii.zlh[698] = -187271232;
        ii.zlh[699] = -701783507;
    }

    private static /* synthetic */ void absg() {
        ii.zli[700] = -881631966;
        ii.zli[701] = -785084;
        ii.zli[702] = 480501627;
        ii.zli[703] = 590853304;
        ii.zli[704] = 668034701;
        ii.zli[705] = -1936746342;
        ii.zli[706] = -2017492511;
        ii.zli[707] = -1042590658;
        ii.zli[708] = 2082571072;
        ii.zli[709] = 1285853772;
        ii.zli[710] = -497317365;
        ii.zli[711] = -122105153;
        ii.zli[712] = -510821271;
        ii.zli[713] = -884548970;
        ii.zli[714] = -149233977;
        ii.zli[715] = -492151010;
        ii.zli[716] = 1039761801;
        ii.zli[717] = -2124276490;
        ii.zli[718] = -406096413;
        ii.zli[719] = -1845384376;
        ii.zli[720] = 1744893475;
        ii.zli[721] = 52237770;
        ii.zli[722] = -2086683902;
        ii.zli[723] = -53793672;
        ii.zli[724] = 1644553904;
        ii.zli[725] = 1903269430;
        ii.zli[726] = -2036920398;
        ii.zli[727] = 1238277046;
        ii.zli[728] = -2003937067;
        ii.zli[729] = 367419979;
        ii.zli[730] = -429541188;
        ii.zli[731] = -1879541088;
        ii.zli[732] = 1009380055;
        ii.zli[733] = -1652142747;
        ii.zli[734] = -715273026;
        ii.zli[735] = -1571774356;
        ii.zli[736] = -1278380466;
        ii.zli[737] = 335689940;
        ii.zli[738] = 836761591;
        ii.zli[739] = 845026092;
        ii.zli[740] = -1724274152;
        ii.zli[741] = 782358717;
        ii.zli[742] = -101439134;
        ii.zli[743] = 437825876;
        ii.zli[744] = 1625083792;
        ii.zli[745] = 1921082178;
        ii.zli[746] = -1407746811;
        ii.zli[747] = 1905094521;
        ii.zli[748] = -118542592;
        ii.zli[749] = 2027458016;
        ii.zli[750] = 1900935050;
        ii.zli[751] = -1419628965;
        ii.zli[752] = 596428627;
        ii.zli[753] = -655786727;
        ii.zli[754] = -2040797426;
        ii.zli[755] = 179465509;
        ii.zli[756] = 1015434510;
        ii.zli[757] = -939750830;
        ii.zli[758] = -1275855560;
        ii.zli[759] = -1668391950;
        ii.zli[760] = 684631169;
        ii.zli[761] = 649593853;
        ii.zli[762] = 753170061;
        ii.zli[763] = 2079986323;
        ii.zli[764] = 168381241;
        ii.zli[765] = -1234088966;
        ii.zli[766] = -551623933;
        ii.zli[767] = -1864175729;
        ii.zli[768] = 269575352;
        ii.zli[769] = 1929836602;
        ii.zli[770] = -31759405;
        ii.zli[771] = 2103272298;
        ii.zli[772] = 1536712295;
        ii.zli[773] = 1420417445;
        ii.zli[774] = 869364371;
        ii.zli[775] = -656561110;
        ii.zli[776] = -2089394485;
        ii.zli[777] = -218821314;
        ii.zli[778] = -1232239229;
        ii.zli[779] = -1019067114;
        ii.zli[780] = -1858735113;
        ii.zli[781] = -166495357;
        ii.zli[782] = 1317807398;
        ii.zli[783] = -642838848;
        ii.zli[784] = -2079869631;
        ii.zli[785] = -441226727;
        ii.zli[786] = -1011333356;
        ii.zli[787] = -1985711290;
        ii.zli[788] = -488518600;
        ii.zli[789] = -1905327192;
        ii.zli[790] = -210501106;
        ii.zli[791] = 61737684;
        ii.zli[792] = 442144981;
        ii.zli[793] = -547685884;
        ii.zli[794] = -47190189;
        ii.zli[795] = -893877140;
        ii.zli[796] = 1074586863;
        ii.zli[797] = 685418124;
        ii.zli[798] = 738643249;
        ii.zli[799] = 936826601;
    }

    private static /* synthetic */ void absd() {
        ii.zli[400] = 701824167;
        ii.zli[401] = 892857082;
        ii.zli[402] = -665928720;
        ii.zli[403] = 1389136838;
        ii.zli[404] = 944110126;
        ii.zli[405] = -526777386;
        ii.zli[406] = 1399038744;
        ii.zli[407] = 873487087;
        ii.zli[408] = 1228323274;
        ii.zli[409] = -1058940827;
        ii.zli[410] = 1685273520;
        ii.zli[411] = -690095699;
        ii.zli[412] = -2100917283;
        ii.zli[413] = 891173360;
        ii.zli[414] = 1563738574;
        ii.zli[415] = 1649122562;
        ii.zli[416] = 777880027;
        ii.zli[417] = -284263822;
        ii.zli[418] = -805739793;
        ii.zli[419] = 1689467276;
        ii.zli[420] = -823286722;
        ii.zli[421] = 1481612671;
        ii.zli[422] = 134670090;
        ii.zli[423] = -1130071798;
        ii.zli[424] = -2143480899;
        ii.zli[425] = 1924215649;
        ii.zli[426] = 130766561;
        ii.zli[427] = 1774322718;
        ii.zli[428] = -1374385732;
        ii.zli[429] = -1587920253;
        ii.zli[430] = 930362265;
        ii.zli[431] = 1401103444;
        ii.zli[432] = 2146495493;
        ii.zli[433] = 1342759698;
        ii.zli[434] = 1946751885;
        ii.zli[435] = 199164514;
        ii.zli[436] = -192026696;
        ii.zli[437] = -1522700064;
        ii.zli[438] = 1892857950;
        ii.zli[439] = -1737030479;
        ii.zli[440] = 864733056;
        ii.zli[441] = -305367156;
        ii.zli[442] = -2016087474;
        ii.zli[443] = 573182492;
        ii.zli[444] = 566884615;
        ii.zli[445] = 979418336;
        ii.zli[446] = -340597554;
        ii.zli[447] = -648889097;
        ii.zli[448] = -1975585365;
        ii.zli[449] = 1546194297;
        ii.zli[450] = 1119518804;
        ii.zli[451] = 1888393810;
        ii.zli[452] = -404389263;
        ii.zli[453] = -1820086355;
        ii.zli[454] = -1320336014;
        ii.zli[455] = -653440643;
        ii.zli[456] = -103253191;
        ii.zli[457] = -2076991320;
        ii.zli[458] = 1051305252;
        ii.zli[459] = -1102450737;
        ii.zli[460] = 657300787;
        ii.zli[461] = 1825177560;
        ii.zli[462] = -612789655;
        ii.zli[463] = -201708381;
        ii.zli[464] = 1755251857;
        ii.zli[465] = -458208117;
        ii.zli[466] = -1967122156;
        ii.zli[467] = 1009371555;
        ii.zli[468] = -110997122;
        ii.zli[469] = 468081109;
        ii.zli[470] = -1123480093;
        ii.zli[471] = -1658148024;
        ii.zli[472] = -1307006898;
        ii.zli[473] = 2068913335;
        ii.zli[474] = -1604637744;
        ii.zli[475] = -747321952;
        ii.zli[476] = 1472332022;
        ii.zli[477] = -1297762180;
        ii.zli[478] = 1587425959;
        ii.zli[479] = 722082130;
        ii.zli[480] = -1202619971;
        ii.zli[481] = 2077125990;
        ii.zli[482] = 892066520;
        ii.zli[483] = 1655635167;
        ii.zli[484] = 2116526387;
        ii.zli[485] = 1230851466;
        ii.zli[486] = 1146860174;
        ii.zli[487] = -645450198;
        ii.zli[488] = -1097667742;
        ii.zli[489] = -2139431944;
        ii.zli[490] = -1975044097;
        ii.zli[491] = -1582520262;
        ii.zli[492] = 1824900675;
        ii.zli[493] = -184747490;
        ii.zli[494] = -503003899;
        ii.zli[495] = -1604544195;
        ii.zli[496] = -1112211085;
        ii.zli[497] = -231422099;
        ii.zli[498] = 493690861;
        ii.zli[499] = 1654969551;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float hitRadius(class_1297 var1_1) {
        block96: {
            block95: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = ii.bk - ii.zle("zqc", zlb(int ), (int)31)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == ii.zle("zqd", zlk(int ), (int)92)) break;
                    v0 /* !! */  = (long)ii.zle("zqe", zlk(int ), (int)93);
                }
                var8_2 = ii.c;
                v1 /* !! */  = ii.bk;
                if (true) ** GOTO lbl11
                block60: while (true) {
                    v1 /* !! */  = (long)(ii.zle("zqg", zlb(int ), (int)33) - ii.zle("zqf", zlb(int ), (int)32));
lbl11:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case -140200123: {
                            continue block60;
                        }
                        case 1109002785: {
                            break block60;
                        }
                    }
                    break;
                }
                var7_3 /* !! */  = ii.b;
                v2 /* !! */  = ii.bk;
                if (true) ** GOTO lbl21
                block61: while (true) {
                    v2 /* !! */  = (long)(ii.zle("zqi", zlb(int ), (int)35) - ii.zle("zqh", zlb(int ), (int)34));
lbl21:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case 839117658: {
                            continue block61;
                        }
                        case 1109002785: {
                            break block61;
                        }
                    }
                    break;
                }
                var6_4 = ii.a;
                if (var8_2) {
                    throw null;
lbl29:
                    // 8 sources

                    return (float)ii.zle("zqj", zlg(int ), (int)94);
                }
                if (var6_4 || var6_4) ** GOTO lbl29
                if (var1_1 == null) break block95;
                if (var6_4) ** GOTO lbl29
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = ii.bk - ii.zle("zqk", zlb(int ), (int)36)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == ii.zle("zql", zlk(int ), (int)95)) break;
                    v3 /* !! */  = (long)ii.zle("zqm", zlk(int ), (int)96);
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ii.bk - ii.zle("zqn", zlb(int ), (int)37)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ii.zle("zqo", zlk(int ), (int)97)) break;
                    v4 /* !! */  = (long)ii.zle("zqp", zlk(int ), (int)98);
                }
                if (ii.mc.field_1724 != null) break block96;
                if (var6_4) ** GOTO lbl29
            }
            if (var6_4 || var6_4) ** GOTO lbl29
            return 2.0f;
        }
        if (var6_4 || var6_4) ** GOTO lbl29
        v5 = ii.zle("zqr", zqq(int ), (int)38);
        v6 /* !! */  = ii.bk;
        if (true) ** GOTO lbl56
        block65: while (true) {
            v6 /* !! */  = (long)(v7 - ii.zle("zqs", zlb(int ), (int)39));
lbl56:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case 144431438: {
                    v7 = ii.zle("zqt", zlb(int ), (int)40);
                    continue block65;
                }
                case 200988079: {
                    v7 = ii.zle("zqu", zlb(int ), (int)41);
                    continue block65;
                }
                case 1109002785: {
                    break block65;
                }
            }
            break;
        }
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_3 = ii.bk - ii.zle("zqv", zlb(int ), (int)42)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == ii.zle("zqw", zlk(int ), (int)99)) break;
            v8 /* !! */  = (long)ii.zle("zqx", zlk(int ), (int)100);
        }
        v9 = ii.mc.field_1724;
        v10 /* !! */  = ii.bk;
        if (true) ** GOTO lbl75
        block67: while (true) {
            v10 /* !! */  = (long)(v11 - ii.zle("zqy", zlb(int ), (int)43));
lbl75:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -310092970: {
                    v11 = ii.zle("zqz", zlb(int ), (int)44);
                    continue block67;
                }
                case -161783392: {
                    v11 = ii.zle("zra", zlb(int ), (int)45);
                    continue block67;
                }
                case 1109002785: {
                    break block67;
                }
                case 1674513735: {
                    v11 = ii.zle("zrb", zlb(int ), (int)46);
                    continue block67;
                }
            }
            break;
        }
        v12 = v9.method_5739(var1_1);
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_4 = ii.bk - ii.zle("zrc", zlb(int ), (int)47)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == ii.zle("zrd", zlk(int ), (int)101)) break;
            v13 /* !! */  = (long)ii.zle("zre", zlk(int ), (int)102);
        }
        var2_5 = Math.max((double)v5, v12);
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_4 || var6_4) ** GOTO lbl29
                v14 /* !! */  = ii.bk;
                if (true) ** GOTO lbl102
                block69: while (true) {
                    v14 /* !! */  = (long)(ii.zle("zrg", zlb(int ), (int)49) - ii.zle("zrf", zlb(int ), (int)48));
lbl102:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case 335769681: {
                            continue block69;
                        }
                        case 1109002785: {
                            break block69;
                        }
                    }
                    break;
                }
                v15 = (double)var1_1.method_17681() * ii.zle("zrh", zqq(int ), (int)50) / var2_5;
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_5 = ii.bk - ii.zle("zri", zlb(int ), (int)51)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == ii.zle("zrj", zlk(int ), (int)103)) break;
                    v16 /* !! */  = (long)ii.zle("zrk", zlk(int ), (int)104);
                }
                v17 = Math.atan(v15);
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_6 = ii.bk - ii.zle("zrl", zlb(int ), (int)52)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == ii.zle("zrm", zlk(int ), (int)105)) break;
                    v18 /* !! */  = (long)ii.zle("zrn", zlk(int ), (int)106);
                }
                var4_6 = (float)Math.toDegrees(v17);
                if (var6_4 || var6_4) ** GOTO lbl29
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_7 = ii.bk - ii.zle("zro", zlb(int ), (int)53)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == ii.zle("zrp", zlk(int ), (int)107)) break;
                    v19 /* !! */  = (long)ii.zle("zrq", zlk(int ), (int)108);
                }
                v20 = (double)var1_1.method_17682() * ii.zle("zrr", zqq(int ), (int)54) / var2_5;
                v21 /* !! */  = ii.bk;
                if (true) ** GOTO lbl131
                block73: while (true) {
                    v21 /* !! */  = (long)(v22 - ii.zle("zrs", zlb(int ), (int)55));
lbl131:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1854968374: {
                            v22 = ii.zle("zrt", zlb(int ), (int)56);
                            continue block73;
                        }
                        case 1109002785: {
                            break block73;
                        }
                        case 1673951659: {
                            v22 = ii.zle("zru", zlb(int ), (int)57);
                            continue block73;
                        }
                    }
                    break;
                }
                v23 = Math.atan(v20);
                v24 /* !! */  = ii.bk;
                if (true) ** GOTO lbl145
                block74: while (true) {
                    v24 /* !! */  = (long)(ii.zle("zrw", zlb(int ), (int)59) - ii.zle("zrv", zlb(int ), (int)58));
lbl145:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case 346504707: {
                            continue block74;
                        }
                        case 1109002785: {
                            break block74;
                        }
                    }
                    break;
                }
                var5_7 = (float)Math.toDegrees(v23);
                if (!var6_4 && !var6_4) ** break;
                ** continue;
                v25 /* !! */  = ii.bk;
                if (true) ** GOTO lbl157
                block75: while (true) {
                    v25 /* !! */  = (long)(ii.zle("zry", zlb(int ), (int)61) - ii.zle("zrx", zlb(int ), (int)60));
lbl157:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case 105142506: {
                            continue block75;
                        }
                        case 1109002785: {
                            break block75;
                        }
                    }
                    break;
                }
                v26 = Math.min(var4_6, var5_7) * ii.zle("zrz", zlg(int ), (int)109);
                v27 = ii.zle("zsa", zlg(int ), (int)110);
                v28 /* !! */  = ii.bk;
                if (true) ** GOTO lbl168
                block76: while (true) {
                    v28 /* !! */  = (long)(ii.zle("zsc", zlb(int ), (int)63) - ii.zle("zsb", zlb(int ), (int)62));
lbl168:
                    // 2 sources

                    switch ((int)v28 /* !! */ ) {
                        case -325139445: {
                            continue block76;
                        }
                        case 1109002785: {
                            break block76;
                        }
                    }
                    break;
                }
                return class_3532.method_15363((float)v26, (float)1.0f, (float)v27);
            }
lbl174:
            // 2 sources

            case 0: {
                var7_3 /* !! */  = (int)ii.zle("zsd", zlk(int ), (int)111);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl229
            }
            case 1: {
                var7_3 /* !! */  = (int)ii.zle("zse", zlk(int ), (int)112);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl221
            }
lbl184:
            // 2 sources

            case 2: {
                var7_3 /* !! */  = (int)ii.zle("zsf", zlk(int ), (int)113);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl189:
            // 2 sources

            case 3: {
                var7_3 /* !! */  = (int)ii.zle("zsg", zlk(int ), (int)114);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl194:
            // 2 sources

            case 4: {
                var7_3 /* !! */  = (int)ii.zle("zsh", zlk(int ), (int)115);
                if (!var8_2) ** GOTO lbl184
                throw null;
            }
            case 5: {
                var7_3 /* !! */  = (int)ii.zle("zsi", zlk(int ), (int)116);
                if (var8_2) {
                    throw null;
                }
            }
lbl202:
            // 4 sources

            case 6: {
                var7_3 /* !! */  = (int)ii.zle("zsj", zlk(int ), (int)117);
                if (!var8_2) ** GOTO lbl194
                throw null;
            }
lbl206:
            // 2 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_3 /* !! */  = (int)ii.zle("zsk", zlk(int ), (int)118);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl241
                    break;
                }
            }
            case 8: {
                var7_3 /* !! */  = (int)ii.zle("zsl", zlk(int ), (int)119);
                if (!var8_2) ** GOTO lbl189
                throw null;
            }
lbl216:
            // 3 sources

            case 9: {
                var7_3 /* !! */  = (int)ii.zle("zsm", zlk(int ), (int)120);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl225
            }
lbl221:
            // 2 sources

            case 10: {
                var7_3 /* !! */  = (int)ii.zle("zsn", zlk(int ), (int)121);
                if (!var8_2) ** GOTO lbl202
                throw null;
            }
lbl225:
            // 3 sources

            case 11: {
                var7_3 /* !! */  = (int)ii.zle("zso", zlk(int ), (int)122);
                if (!var8_2) ** GOTO lbl174
                throw null;
            }
lbl229:
            // 3 sources

            case 12: {
                var7_3 /* !! */  = (int)ii.zle("zsp", zlk(int ), (int)123);
                if (!var8_2) ** GOTO lbl206
                throw null;
            }
            case 13: {
                var7_3 /* !! */  = (int)ii.zle("zsq", zlk(int ), (int)124);
                if (!var8_2) ** GOTO lbl225
                throw null;
            }
            case 14: {
                var7_3 /* !! */  = (int)ii.zle("zsr", zlk(int ), (int)125);
                if (!var8_2) ** GOTO lbl216
                throw null;
            }
lbl241:
            // 2 sources

            case 15: {
                do {
                    var7_3 /* !! */  = (int)ii.zle("zss", zlk(int ), (int)126);
                } while (!var8_2);
                throw null;
            }
            case 16: 
        }
        var7_3 /* !! */  = (int)ii.zle("zst", zlk(int ), (int)127);
        ** while (!var8_2)
lbl249:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void absb() {
        ii.zli[200] = -1972135577;
        ii.zli[201] = -409960392;
        ii.zli[202] = -1751604421;
        ii.zli[203] = 1001376822;
        ii.zli[204] = -2123896995;
        ii.zli[205] = -21598014;
        ii.zli[206] = 1129309459;
        ii.zli[207] = 615374103;
        ii.zli[208] = 200061108;
        ii.zli[209] = -260152338;
        ii.zli[210] = -465910243;
        ii.zli[211] = -908842093;
        ii.zli[212] = 1272164221;
        ii.zli[213] = -1608365324;
        ii.zli[214] = 1650375584;
        ii.zli[215] = -249010659;
        ii.zli[216] = 1893091804;
        ii.zli[217] = -1806129470;
        ii.zli[218] = 1991741257;
        ii.zli[219] = -2076433980;
        ii.zli[220] = -705005574;
        ii.zli[221] = -1227642664;
        ii.zli[222] = 1981102143;
        ii.zli[223] = -1206239307;
        ii.zli[224] = 1485542719;
        ii.zli[225] = -602472845;
        ii.zli[226] = -1193954956;
        ii.zli[227] = -1687771388;
        ii.zli[228] = -1791848255;
        ii.zli[229] = -985880083;
        ii.zli[230] = 1463116094;
        ii.zli[231] = 1444501163;
        ii.zli[232] = 813445367;
        ii.zli[233] = 602115683;
        ii.zli[234] = 444982821;
        ii.zli[235] = -985001006;
        ii.zli[236] = -908894543;
        ii.zli[237] = -1626828392;
        ii.zli[238] = -1740350210;
        ii.zli[239] = -116246448;
        ii.zli[240] = 1306569548;
        ii.zli[241] = -2009761768;
        ii.zli[242] = -1710918600;
        ii.zli[243] = 920544625;
        ii.zli[244] = 513771040;
        ii.zli[245] = -645996640;
        ii.zli[246] = -37822347;
        ii.zli[247] = 1206001401;
        ii.zli[248] = -1215507139;
        ii.zli[249] = -662897731;
        ii.zli[250] = -1302657444;
        ii.zli[251] = 368808553;
        ii.zli[252] = -900078249;
        ii.zli[253] = -553584462;
        ii.zli[254] = 100461997;
        ii.zli[255] = 2037780096;
        ii.zli[256] = 935978238;
        ii.zli[257] = -100456290;
        ii.zli[258] = 589812117;
        ii.zli[259] = -201462012;
        ii.zli[260] = 537878289;
        ii.zli[261] = 1482972894;
        ii.zli[262] = -379657662;
        ii.zli[263] = 1090584769;
        ii.zli[264] = -1587386252;
        ii.zli[265] = -1746985553;
        ii.zli[266] = -1442378822;
        ii.zli[267] = -1109220910;
        ii.zli[268] = -1042320128;
        ii.zli[269] = 1965783576;
        ii.zli[270] = 882759144;
        ii.zli[271] = -719642082;
        ii.zli[272] = -1370880069;
        ii.zli[273] = -148710906;
        ii.zli[274] = -755650056;
        ii.zli[275] = -1295112155;
        ii.zli[276] = -1722961336;
        ii.zli[277] = -102829896;
        ii.zli[278] = -1067890461;
        ii.zli[279] = 2145132028;
        ii.zli[280] = -2121590879;
        ii.zli[281] = -928932515;
        ii.zli[282] = 2054987597;
        ii.zli[283] = 1580133014;
        ii.zli[284] = 1332078082;
        ii.zli[285] = -502689798;
        ii.zli[286] = 1379672718;
        ii.zli[287] = 373455684;
        ii.zli[288] = -1587282904;
        ii.zli[289] = -604907375;
        ii.zli[290] = 2039935757;
        ii.zli[291] = 1189994878;
        ii.zli[292] = 1044196795;
        ii.zli[293] = -778517377;
        ii.zli[294] = -1521287211;
        ii.zli[295] = 1836714211;
        ii.zli[296] = 834558727;
        ii.zli[297] = -1450398171;
        ii.zli[298] = 948881249;
        ii.zli[299] = 23021950;
    }

    private static /* synthetic */ void absh() {
        ii.zli[800] = -12100876;
        ii.zli[801] = 233524439;
        ii.zli[802] = -120047906;
        ii.zli[803] = -1338311104;
        ii.zli[804] = -2135936043;
        ii.zli[805] = 672031628;
        ii.zli[806] = 1018594696;
        ii.zli[807] = -1398355703;
        ii.zli[808] = -610185150;
        ii.zli[809] = 1578436496;
        ii.zli[810] = 1277767337;
        ii.zli[811] = -1025672643;
        ii.zli[812] = 1267740951;
        ii.zli[813] = -1383269017;
        ii.zli[814] = -1442434144;
        ii.zli[815] = 1525105473;
        ii.zli[816] = -250051819;
        ii.zli[817] = -1213078317;
        ii.zli[818] = -1850050947;
        ii.zli[819] = -1752966621;
        ii.zli[820] = 1014444501;
        ii.zli[821] = -1144290623;
        ii.zli[822] = 503449628;
        ii.zli[823] = -1153847262;
        ii.zli[824] = 1504654840;
        ii.zli[825] = -468957851;
        ii.zli[826] = -141638796;
        ii.zli[827] = 1044614259;
        ii.zli[828] = -1536126301;
        ii.zli[829] = 1704027811;
        ii.zli[830] = -2144548304;
        ii.zli[831] = 628526914;
        ii.zli[832] = -1905445334;
        ii.zli[833] = 307777712;
        ii.zli[834] = 1876539007;
        ii.zli[835] = -2091458314;
        ii.zli[836] = -1253133814;
        ii.zli[837] = -1559025415;
        ii.zli[838] = -79915480;
        ii.zli[839] = 1932628409;
        ii.zli[840] = -1858404835;
        ii.zli[841] = 1493214531;
        ii.zli[842] = 1530528480;
        ii.zli[843] = 645295415;
        ii.zli[844] = 151370504;
        ii.zli[845] = 864653075;
        ii.zli[846] = -46076961;
        ii.zli[847] = -1628125531;
        ii.zli[848] = -384915465;
        ii.zli[849] = 78158159;
        ii.zli[850] = -1465785168;
        ii.zli[851] = -1991606012;
        ii.zli[852] = 1017462668;
        ii.zli[853] = 1212640292;
        ii.zli[854] = 2014055752;
        ii.zli[855] = -100345946;
        ii.zli[856] = -1697337324;
        ii.zli[857] = 396074;
        ii.zli[858] = -194517158;
        ii.zli[859] = -102323471;
        ii.zli[860] = -973430021;
        ii.zli[861] = -1802503738;
        ii.zli[862] = -923161367;
        ii.zli[863] = 985683298;
        ii.zli[864] = 1824425857;
        ii.zli[865] = 569688528;
        ii.zli[866] = 624557086;
        ii.zli[867] = -1434366764;
        ii.zli[868] = 1109808302;
        ii.zli[869] = -1011892107;
        ii.zli[870] = -1200821157;
        ii.zli[871] = 367793154;
        ii.zli[872] = 216069763;
        ii.zli[873] = -1184539299;
        ii.zli[874] = 1659691151;
        ii.zli[875] = -1680261046;
        ii.zli[876] = 984472177;
        ii.zli[877] = 1159335951;
        ii.zli[878] = -224417076;
        ii.zli[879] = 1300142003;
        ii.zli[880] = 659312399;
        ii.zli[881] = 1091164052;
        ii.zli[882] = 140629270;
        ii.zli[883] = 1006340913;
        ii.zli[884] = -975918330;
        ii.zli[885] = -728954790;
        ii.zli[886] = 882713468;
        ii.zli[887] = 532451623;
        ii.zli[888] = 319319887;
        ii.zli[889] = -1092512677;
        ii.zli[890] = 1593615212;
        ii.zli[891] = 1062937644;
        ii.zli[892] = 1984288928;
        ii.zli[893] = 578695550;
        ii.zli[894] = 696376387;
        ii.zli[895] = -910661103;
        ii.zli[896] = -2137091037;
        ii.zli[897] = -167312835;
        ii.zli[898] = -2023492316;
        ii.zli[899] = 1181533987;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ov modelStep(ov var1_1, float var2_2, float var3_3, float var4_4, boolean var5_5, boolean var6_6) {
        block104: {
            block103: {
                v0 /* !! */  = ii.bk;
                if (true) ** GOTO lbl5
                block58: while (true) {
                    v0 /* !! */  = (long)(v1 - ii.zle("zzz", zlb(int ), (int)64));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -924515803: {
                            v1 = ii.zle("aaaa", zlb(int ), (int)65);
                            continue block58;
                        }
                        case 216095854: {
                            v1 = ii.zle("aaab", zlb(int ), (int)66);
                            continue block58;
                        }
                        case 1109002785: {
                            break block58;
                        }
                        case 1727691500: {
                            v1 = ii.zle("aaac", zlb(int ), (int)67);
                            continue block58;
                        }
                    }
                    break;
                }
                var10_7 = ii.c;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_0 = ii.bk - ii.zle("aaad", zlb(int ), (int)68)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == ii.zle("aaae", zlk(int ), (int)315)) break;
                    v2 /* !! */  = (long)ii.zle("aaaf", zlk(int ), (int)316);
                }
                var9_8 /* !! */  = ii.b;
                v3 /* !! */  = ii.bk;
                if (true) ** GOTO lbl29
                block60: while (true) {
                    v3 /* !! */  = (long)(v4 - ii.zle("aaag", zlb(int ), (int)69));
lbl29:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -712345817: {
                            v4 = ii.zle("aaah", zlb(int ), (int)70);
                            continue block60;
                        }
                        case -703444350: {
                            v4 = ii.zle("aaai", zlb(int ), (int)71);
                            continue block60;
                        }
                        case 1109002785: {
                            break block60;
                        }
                    }
                    break;
                }
                var8_9 = ii.a;
                if (var10_7) {
                    throw null;
lbl41:
                    // 11 sources

                    return null;
                }
                if (var8_9 || var8_9) ** GOTO lbl41
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = ii.bk - ii.zle("aaaj", zlb(int ), (int)72)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == ii.zle("aaak", zlk(int ), (int)317)) break;
                    v5 /* !! */  = (long)ii.zle("aaal", zlk(int ), (int)318);
                }
                if (ms.isReady()) break block103;
                if (var8_9 || var8_9) ** GOTO lbl41
                v6 = ii.zle("aaam", zlg(int ), (int)319);
                v7 /* !! */  = ii.bk;
                if (true) ** GOTO lbl57
                block63: while (true) {
                    v7 /* !! */  = (long)(v8 - ii.zle("aaan", zlb(int ), (int)73));
lbl57:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -819568616: {
                            v8 = ii.zle("aaao", zlb(int ), (int)74);
                            continue block63;
                        }
                        case 1109002785: {
                            break block63;
                        }
                        case 1822751400: {
                            v8 = ii.zle("aaap", zlb(int ), (int)75);
                            continue block63;
                        }
                    }
                    break;
                }
                return this.finishStep(var1_1, var2_2, var3_3, 0.0f, 0.0f, (float)v6);
            }
            if (var8_9 || var8_9) ** GOTO lbl41
            v9 /* !! */  = ii.bk;
            if (true) ** GOTO lbl73
            block64: while (true) {
                v9 /* !! */  = (long)(v10 - ii.zle("aaaq", zlb(int ), (int)76));
lbl73:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -1962518675: {
                        v10 = ii.zle("aaar", zlb(int ), (int)77);
                        continue block64;
                    }
                    case -334275529: {
                        v10 = ii.zle("aaas", zlb(int ), (int)78);
                        continue block64;
                    }
                    case 691259627: {
                        v10 = ii.zle("aaat", zlb(int ), (int)79);
                        continue block64;
                    }
                    case 1109002785: {
                        break block64;
                    }
                }
                break;
            }
            v11 /* !! */  = ii.bk;
            if (true) ** GOTO lbl89
            block65: while (true) {
                v11 /* !! */  = (long)(v12 - ii.zle("aaau", zlb(int ), (int)80));
lbl89:
                // 2 sources

                switch ((int)v11 /* !! */ ) {
                    case -803166389: {
                        v12 = ii.zle("aaav", zlb(int ), (int)81);
                        continue block65;
                    }
                    case 1109002785: {
                        break block65;
                    }
                    case 1836608265: {
                        v12 = ii.zle("aaaw", zlb(int ), (int)82);
                        continue block65;
                    }
                    case 2018073487: {
                        v12 = ii.zle("aaax", zlb(int ), (int)83);
                        continue block65;
                    }
                }
                break;
            }
            var7_10 = this.model.next(var2_2, var3_3, var4_4);
            if (var8_9 || var8_9) ** GOTO lbl41
            if (var7_10 != null) break block104;
            if (var8_9 || var8_9) ** GOTO lbl41
            v13 = ii.zle("aaay", zlg(int ), (int)320);
            v14 /* !! */  = ii.bk;
            if (true) ** GOTO lbl110
            block66: while (true) {
                v14 /* !! */  = (long)(v15 - ii.zle("aaaz", zlb(int ), (int)84));
lbl110:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case -2121851924: {
                        v15 = ii.zle("aaba", zlb(int ), (int)85);
                        continue block66;
                    }
                    case 1109002785: {
                        break block66;
                    }
                    case 1309743848: {
                        v15 = ii.zle("aabb", zlb(int ), (int)86);
                        continue block66;
                    }
                    case 1809254189: {
                        v15 = ii.zle("aabc", zlb(int ), (int)87);
                        continue block66;
                    }
                }
                break;
            }
            return this.finishStep(var1_1, var2_2, var3_3, 0.0f, 0.0f, (float)v13);
        }
        if (var8_9 || var8_9) ** GOTO lbl41
        if (!var6_6) ** GOTO lbl153
        if (var8_9) ** GOTO lbl41
        if (var9_8 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_8 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var8_9) ** GOTO lbl41
                v16 = var7_10[0];
                v17 = ii.zle("aabd", zlg(int ), (int)321);
                v18 = ii.zle("aabe", zlg(int ), (int)322);
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_2 = ii.bk - ii.zle("aabf", zlb(int ), (int)88)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v19 /* !! */  == ii.zle("aabg", zlk(int ), (int)323)) break;
                    v19 /* !! */  = (long)ii.zle("aabh", zlk(int ), (int)324);
                }
                var7_10[0] = v16 * this.lerp((float)v17, (float)v18);
                if (var8_9 || var8_9) ** GOTO lbl41
                v20 = var7_10[1];
                v21 = ii.zle("aabi", zlg(int ), (int)325);
                v22 = ii.zle("aabj", zlg(int ), (int)326);
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_3 = ii.bk - ii.zle("aabk", zlb(int ), (int)89)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v23 /* !! */  == ii.zle("aabl", zlk(int ), (int)327)) break;
                    v23 /* !! */  = (long)ii.zle("aabm", zlk(int ), (int)328);
                }
                var7_10[1] = v20 * this.lerp((float)v21, (float)v22);
                if (var8_9) ** GOTO lbl41
lbl153:
                // 2 sources

                if (!var8_9 && !var8_9) ** break;
                ** continue;
                v24 = var2_2;
                v25 = var3_3;
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_4 = ii.bk - ii.zle("aabn", zlb(int ), (int)90)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v26 /* !! */  == ii.zle("aabo", zlk(int ), (int)329)) break;
                    v26 /* !! */  = (long)ii.zle("aabp", zlk(int ), (int)330);
                }
                v27 = (float)Math.hypot(v24, v25);
                v28 = var7_10[0];
                v29 = var7_10[1];
                if (var5_5) {
                    v30 = ii.zle("aabq", zlg(int ), (int)331);
                    if (var10_7) {
                        throw null;
                    }
                } else {
                    v30 = ii.zle("aabr", zlg(int ), (int)332);
                }
                v31 = ii.zle("aabs", zlk(int ), (int)333);
                while (true) {
                    if ((v32 /* !! */  = (cfr_temp_5 = ii.bk - ii.zle("aabt", zlb(int ), (int)91)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v32 /* !! */  == ii.zle("aabu", zlk(int ), (int)334)) break;
                    v32 /* !! */  = (long)ii.zle("aabv", zlk(int ), (int)335);
                }
                return this.commitModelStep(var1_1, var2_2, var3_3, v27, v28, v29, (float)v30, (boolean)v31, var5_5);
            }
            case 0: {
                var9_8 /* !! */  = (int)ii.zle("aabw", zlk(int ), (int)336);
                if (var10_7) {
                    throw null;
                }
                ** GOTO lbl190
            }
            case 1: {
                var9_8 /* !! */  = (int)ii.zle("aabx", zlk(int ), (int)337);
                if (var10_7) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl190:
            // 3 sources

            case 2: {
                var9_8 /* !! */  = (int)ii.zle("aaby", zlk(int ), (int)338);
                if (var10_7) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl195:
            // 2 sources

            case 3: {
                do {
                    var9_8 /* !! */  = (int)ii.zle("aabz", zlk(int ), (int)339);
                } while (!var10_7);
                throw null;
            }
            case 4: {
                var9_8 /* !! */  = (int)ii.zle("aaca", zlk(int ), (int)340);
                if (var10_7) {
                    throw null;
                }
                ** GOTO lbl244
            }
lbl205:
            // 2 sources

            case 5: {
                var9_8 /* !! */  = (int)ii.zle("aacb", zlk(int ), (int)341);
                if (var10_7) {
                    throw null;
                }
                ** GOTO lbl215
            }
            case 6: {
                var9_8 /* !! */  = (int)ii.zle("aacc", zlk(int ), (int)342);
                if (var10_7) {
                    throw null;
                }
                ** GOTO lbl257
            }
lbl215:
            // 3 sources

            case 7: {
                var9_8 /* !! */  = (int)ii.zle("aacd", zlk(int ), (int)343);
                if (var10_7) {
                    throw null;
                }
                ** GOTO lbl262
            }
            case 8: {
                var9_8 /* !! */  = (int)ii.zle("aace", zlk(int ), (int)344);
                if (var10_7) {
                    throw null;
                }
                ** GOTO lbl276
            }
            case 9: {
                var9_8 /* !! */  = (int)ii.zle("aacf", zlk(int ), (int)345);
                if (!var10_7) ** GOTO lbl195
                throw null;
            }
lbl229:
            // 3 sources

            case 10: {
                var9_8 /* !! */  = (int)ii.zle("aacg", zlk(int ), (int)346);
                if (var10_7) {
                    throw null;
                }
                ** GOTO lbl257
            }
            case 11: {
                var9_8 /* !! */  = (int)ii.zle("aach", zlk(int ), (int)347);
                if (var10_7) {
                    throw null;
                }
                ** GOTO lbl244
            }
            case 12: {
                var9_8 /* !! */  = (int)ii.zle("aaci", zlk(int ), (int)348);
                if (var10_7) {
                    throw null;
                }
                ** GOTO lbl272
            }
lbl244:
            // 4 sources

            case 13: {
                var9_8 /* !! */  = (int)ii.zle("aacj", zlk(int ), (int)349);
                if (!var10_7) ** GOTO lbl215
                throw null;
            }
            case 14: {
                var9_8 /* !! */  = (int)ii.zle("aack", zlk(int ), (int)350);
                if (var10_7) {
                    throw null;
                }
                ** GOTO lbl267
            }
lbl253:
            // 2 sources

            case 15: {
                var9_8 /* !! */  = (int)ii.zle("aacl", zlk(int ), (int)351);
                if (!var10_7) ** GOTO lbl244
                throw null;
            }
lbl257:
            // 3 sources

            case 16: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_8 /* !! */  = (int)ii.zle("aacm", zlk(int ), (int)352);
                    if (!var10_7) ** GOTO lbl190
                    throw null;
                }
            }
lbl262:
            // 2 sources

            case 17: {
                do {
                    var9_8 /* !! */  = (int)ii.zle("aacn", zlk(int ), (int)353);
                } while (!var10_7);
                throw null;
            }
lbl267:
            // 2 sources

            case 18: {
                var9_8 /* !! */  = (int)ii.zle("aaco", zlk(int ), (int)354);
                if (var10_7) {
                    throw null;
                }
                ** GOTO lbl276
            }
lbl272:
            // 2 sources

            case 19: {
                var9_8 /* !! */  = (int)ii.zle("aacp", zlk(int ), (int)355);
                if (!var10_7) ** GOTO lbl205
                throw null;
            }
lbl276:
            // 3 sources

            case 20: {
                var9_8 /* !! */  = (int)ii.zle("aacq", zlk(int ), (int)356);
                if (!var10_7) ** GOTO lbl253
                throw null;
            }
            case 21: 
        }
        var9_8 /* !! */  = (int)ii.zle("aacr", zlk(int ), (int)357);
        ** while (!var10_7)
lbl283:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void abse() {
        ii.zli[500] = -783778522;
        ii.zli[501] = -490186948;
        ii.zli[502] = 2087241103;
        ii.zli[503] = -62247300;
        ii.zli[504] = 2104710235;
        ii.zli[505] = 2144821485;
        ii.zli[506] = 1325351070;
        ii.zli[507] = 708192387;
        ii.zli[508] = 795342417;
        ii.zli[509] = -1845998003;
        ii.zli[510] = 2016682561;
        ii.zli[511] = 307348188;
        ii.zli[512] = -2123373767;
        ii.zli[513] = -1618129856;
        ii.zli[514] = -1537052702;
        ii.zli[515] = -1534085508;
        ii.zli[516] = 1479933996;
        ii.zli[517] = 700924317;
        ii.zli[518] = 1065392709;
        ii.zli[519] = -1538744105;
        ii.zli[520] = 1137555039;
        ii.zli[521] = 1051119702;
        ii.zli[522] = -876326437;
        ii.zli[523] = 1378870182;
        ii.zli[524] = 514871700;
        ii.zli[525] = 2024391900;
        ii.zli[526] = -121713577;
        ii.zli[527] = 642792682;
        ii.zli[528] = -896708141;
        ii.zli[529] = -153774143;
        ii.zli[530] = 1803505537;
        ii.zli[531] = -487892176;
        ii.zli[532] = -1084119975;
        ii.zli[533] = 1068885406;
        ii.zli[534] = 1121129803;
        ii.zli[535] = -452464107;
        ii.zli[536] = 1611986897;
        ii.zli[537] = 1508901174;
        ii.zli[538] = 345431329;
        ii.zli[539] = 439227148;
        ii.zli[540] = -1608802367;
        ii.zli[541] = 192611291;
        ii.zli[542] = 192921221;
        ii.zli[543] = -1802908066;
        ii.zli[544] = 445561670;
        ii.zli[545] = 664666128;
        ii.zli[546] = 1694896346;
        ii.zli[547] = -1012375438;
        ii.zli[548] = -468479228;
        ii.zli[549] = 30161519;
        ii.zli[550] = 1584823423;
        ii.zli[551] = -796627122;
        ii.zli[552] = -385457577;
        ii.zli[553] = -1970172723;
        ii.zli[554] = -2082830049;
        ii.zli[555] = 869932125;
        ii.zli[556] = -806617139;
        ii.zli[557] = -1170253925;
        ii.zli[558] = -1129628346;
        ii.zli[559] = 235138674;
        ii.zli[560] = 275847384;
        ii.zli[561] = -852712049;
        ii.zli[562] = -1504337096;
        ii.zli[563] = 204331020;
        ii.zli[564] = 544535743;
        ii.zli[565] = 1835165058;
        ii.zli[566] = 616711934;
        ii.zli[567] = 1069276635;
        ii.zli[568] = 1577644758;
        ii.zli[569] = 1337384603;
        ii.zli[570] = 982385088;
        ii.zli[571] = 2123768195;
        ii.zli[572] = 1177368558;
        ii.zli[573] = -2065055059;
        ii.zli[574] = 1991485018;
        ii.zli[575] = -169585505;
        ii.zli[576] = -676970738;
        ii.zli[577] = -326860067;
        ii.zli[578] = -1454677208;
        ii.zli[579] = 417257480;
        ii.zli[580] = -288472734;
        ii.zli[581] = -581383544;
        ii.zli[582] = 1174269220;
        ii.zli[583] = 318507862;
        ii.zli[584] = 1577101683;
        ii.zli[585] = 1622230115;
        ii.zli[586] = 1578551347;
        ii.zli[587] = 874811558;
        ii.zli[588] = 1701643672;
        ii.zli[589] = -672723485;
        ii.zli[590] = 2130854075;
        ii.zli[591] = 1191282845;
        ii.zli[592] = -2013123156;
        ii.zli[593] = -1034912546;
        ii.zli[594] = -373757320;
        ii.zli[595] = -2128344403;
        ii.zli[596] = 419008512;
        ii.zli[597] = -1314645135;
        ii.zli[598] = 2103687312;
        ii.zli[599] = 1660247446;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ov commitModelStep(ov var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, boolean var8_8, boolean var9_9) {
        block226: {
            block225: {
                block222: {
                    block224: {
                        block223: {
                            block221: {
                                block220: {
                                    block219: {
                                        block218: {
                                            var18_10 = ii.c;
                                            var17_11 /* !! */  = ii.b;
                                            var16_12 = ii.a;
                                            if (var18_10) {
                                                throw null;
lbl6:
                                                // 62 sources

                                                return null;
                                            }
                                            if (var16_12 || var16_12) ** GOTO lbl6
                                            var10_13 = this.quantizeDelta(var5_5);
                                            if (var16_12 || var16_12) ** GOTO lbl6
                                            var11_14 = this.quantizeDelta(var6_6);
                                            if (var16_12 || var16_12) ** GOTO lbl6
                                            if (var9_9) {
                                                v0 = ii.zle("aacs", zlg(int ), (int)358);
                                                if (var18_10) {
                                                    throw null;
                                                }
                                            } else {
                                                v0 = ii.zle("aact", zlg(int ), (int)359);
                                            }
                                            if (var9_9) {
                                                v1 = ii.zle("aacu", zlg(int ), (int)360);
                                                if (var18_10) {
                                                    throw null;
                                                }
                                            } else {
                                                v1 = ii.zle("aacv", zlg(int ), (int)361);
                                            }
                                            var10_13 = class_3532.method_15363((float)var10_13, (float)v0, (float)v1);
                                            if (var16_12 || var16_12) ** GOTO lbl6
                                            if (var9_9) {
                                                v2 = ii.zle("aacw", zlg(int ), (int)362);
                                                if (var18_10) {
                                                    throw null;
                                                }
                                            } else {
                                                v2 = ii.zle("aacx", zlg(int ), (int)363);
                                            }
                                            if (var9_9) {
                                                v3 = ii.zle("aacy", zlg(int ), (int)364);
                                                if (var18_10) {
                                                    throw null;
                                                }
                                            } else {
                                                v3 = ii.zle("aacz", zlg(int ), (int)365);
                                            }
                                            var11_14 = class_3532.method_15363((float)var11_14, (float)v2, (float)v3);
                                            if (var16_12 || var16_12) ** GOTO lbl6
                                            var12_15 = var4_4 * var4_4 + ii.zle("aada", zlg(int ), (int)366);
                                            if (var16_12 || var16_12) ** GOTO lbl6
                                            var13_16 = (var10_13 * var2_2 + var11_14 * var3_3) / var12_15;
                                            if (var16_12 || var16_12) ** GOTO lbl6
                                            if (!var9_9) break block218;
                                            if (var16_12) ** GOTO lbl6
                                            if (!(var4_4 < ii.zle("aadb", zlg(int ), (int)367))) break block218;
                                            if (var16_12) ** GOTO lbl6
                                            if (!(var13_16 > ii.zle("aadc", zlg(int ), (int)368))) break block218;
                                            if (var16_12 || var16_12) ** GOTO lbl6
                                            var14_17 = this.deflectStep(var2_2, var3_3, var4_4, var13_16, var10_13, var11_14);
                                            if (var16_12 || var16_12) ** GOTO lbl6
                                            var10_13 = this.quantizeDelta(var14_17[0]);
                                            if (var16_12 || var16_12) ** GOTO lbl6
                                            var11_14 = this.quantizeDelta(var14_17[1]);
                                            if (var16_12 || var16_12) ** GOTO lbl6
                                            var13_16 = (var10_13 * var2_2 + var11_14 * var3_3) / var12_15;
                                            if (var16_12) ** GOTO lbl6
                                        }
                                        if (var16_12 || var16_12) ** GOTO lbl6
                                        if (!var9_9) break block219;
                                        if (var16_12) ** GOTO lbl6
                                        if (!(var4_4 < ii.zle("aadd", zlg(int ), (int)369))) break block219;
                                        if (var16_12) ** GOTO lbl6
                                        if (!(var13_16 > ii.zle("aade", zlg(int ), (int)370))) break block219;
                                        if (var16_12 || var16_12) ** GOTO lbl6
                                        var14_17 = this.deflectStep(var2_2, var3_3, var4_4, var13_16, var10_13, var11_14);
                                        if (var16_12 || var16_12) ** GOTO lbl6
                                        var10_13 = this.quantizeDelta(var14_17[0] * this.lerp((float)ii.zle("aadf", zlg(int ), (int)371), (float)ii.zle("aadg", zlg(int ), (int)372)));
                                        if (var16_12 || var16_12) ** GOTO lbl6
                                        var11_14 = this.quantizeDelta(var14_17[1] * this.lerp((float)ii.zle("aadh", zlg(int ), (int)373), (float)ii.zle("aadi", zlg(int ), (int)374)));
                                        if (var16_12 || var16_12) ** GOTO lbl6
                                        var13_16 = (var10_13 * var2_2 + var11_14 * var3_3) / var12_15;
                                        if (var16_12) ** GOTO lbl6
                                    }
                                    if (var16_12 || var16_12) ** GOTO lbl6
                                    if (!var9_9) break block220;
                                    if (var16_12) ** GOTO lbl6
                                    if (!(var4_4 < ii.zle("aadj", zlg(int ), (int)375))) break block220;
                                    if (var16_12) ** GOTO lbl6
                                    if (!(var13_16 > ii.zle("aadk", zlg(int ), (int)376))) break block220;
                                    if (var16_12 || var16_12) ** GOTO lbl6
                                    var10_13 = this.quantizeDelta(var10_13 * this.lerp((float)ii.zle("aadl", zlg(int ), (int)377), (float)ii.zle("aadm", zlg(int ), (int)378)));
                                    if (var16_12 || var16_12) ** GOTO lbl6
                                    var11_14 = this.quantizeDelta(var11_14 * this.lerp((float)ii.zle("aadn", zlg(int ), (int)379), (float)ii.zle("aado", zlg(int ), (int)380)));
                                    if (var16_12 || var16_12) ** GOTO lbl6
                                    var13_16 = (var10_13 * var2_2 + var11_14 * var3_3) / var12_15;
                                    if (var16_12 || var16_12) ** GOTO lbl6
                                    if (!(var13_16 > ii.zle("aadp", zlg(int ), (int)381))) break block220;
                                    if (var16_12 || var16_12) ** GOTO lbl6
                                    this.spikeGuardTicks = (int)ii.zle("aadq", zlk(int ), (int)382);
                                    if (var16_12 || var16_12) ** GOTO lbl6
                                    this.lastCloseRatio = 0.0f;
                                    if (var16_12 || var16_12) ** GOTO lbl6
                                    this.lastStepPitch = 0.0f;
                                    this.lastStepYaw = 0.0f;
                                    if (var16_12 || var16_12) ** GOTO lbl6
                                    return this.finishStep(var1_1, var2_2, var3_3, var10_13 * ii.zle("aadr", zlg(int ), (int)383), var11_14 * ii.zle("aads", zlg(int ), (int)384), (float)ii.zle("aadt", zlg(int ), (int)385));
                                }
                                if (var16_12 || var16_12) ** GOTO lbl6
                                if (var9_9) break block221;
                                if (var16_12) ** GOTO lbl6
                                if (!(var4_4 < ii.zle("aadu", zlg(int ), (int)386))) break block221;
                                if (var16_12) ** GOTO lbl6
                                if (!(var13_16 > ii.zle("aadv", zlg(int ), (int)387))) break block221;
                                if (var16_12 || var16_12) ** GOTO lbl6
                                this.spikeGuardTicks = (int)ii.zle("aadw", zlk(int ), (int)388);
                                if (var16_12 || var16_12) ** GOTO lbl6
                                this.lastCloseRatio = 0.0f;
                                if (var16_12 || var16_12) ** GOTO lbl6
                                this.lastStepPitch = 0.0f;
                                this.lastStepYaw = 0.0f;
                                if (var16_12 || var16_12) ** GOTO lbl6
                                return this.finishStep(var1_1, var2_2, var3_3, this.quantizeDelta(var10_13 * ii.zle("aadx", zlg(int ), (int)389)), this.quantizeDelta(var11_14 * ii.zle("aady", zlg(int ), (int)390)), (float)ii.zle("aadz", zlg(int ), (int)391));
                            }
                            if (var16_12 || var16_12) ** GOTO lbl6
                            var14_18 = (float)Math.hypot(var10_13, var11_14);
                            if (var16_12 || var16_12) ** GOTO lbl6
                            this.lastStepYaw = var10_13;
                            if (var16_12 || var16_12) ** GOTO lbl6
                            this.lastStepPitch = var11_14;
                            if (var16_12 || var16_12) ** GOTO lbl6
                            this.lastCloseRatio = var13_16;
                            if (var16_12 || var16_12) ** GOTO lbl6
                            if (!var8_8) break block222;
                            if (var16_12 || var16_12) ** GOTO lbl6
                            this.pursueStreak += ii.zle("aaea", zlk(int ), (int)392);
                            if (var16_12 || var16_12) ** GOTO lbl6
                            if (!var9_9) break block223;
                            if (var16_12) ** GOTO lbl6
                            if (!(var13_16 > ii.zle("aajs", zlg(int ), (int)393))) break block223;
                            if (var16_12) ** GOTO lbl6
                            if (!(var4_4 < ii.zle("aajt", zlg(int ), (int)394))) break block223;
                            if (var16_12 || var16_12) ** GOTO lbl6
                            this.recoverTicks = (int)ii.zle("aaju", zlk(int ), (int)395);
                            if (var16_12) ** GOTO lbl6
                            if (var18_10) {
                                throw null;
                            }
                            break block222;
                        }
                        if (var16_12 || var16_12) ** GOTO lbl6
                        if (!(var14_18 > ii.zle("aajv", zlg(int ), (int)396))) break block224;
                        if (var16_12 || var16_12) ** GOTO lbl6
                        this.recoverTicks = (int)ii.zle("aajw", zlk(int ), (int)397);
                        if (var16_12) ** GOTO lbl6
                        if (var18_10) {
                            throw null;
                        }
                        break block222;
                    }
                    if (var16_12 || var16_12) ** GOTO lbl6
                    if (this.pursueStreak < ii.zle("aajx", zlk(int ), (int)398) + this.random.nextInt((int)ii.zle("aajy", zlk(int ), (int)399))) break block222;
                    if (var16_12 || var16_12) ** GOTO lbl6
                    this.recoverTicks = (int)ii.zle("aajz", zlk(int ), (int)400);
                    if (var16_12) ** GOTO lbl6
                }
                if (var16_12 || var16_12) ** GOTO lbl6
                if (!var9_9) break block225;
                if (var16_12) ** GOTO lbl6
                v4 = Math.min(var7_7, (float)ii.zle("aaka", zlg(int ), (int)401));
                if (var18_10) {
                    throw null;
                }
                break block226;
            }
            if (var16_12 || var16_12) ** GOTO lbl6
            v4 = var15_19 = var7_7;
        }
        if (var16_12) ** GOTO lbl6
        if (var17_11 /* !! */  == 0) ** GOTO lbl-1000
        switch (var17_11 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var16_12) ** break;
                ** continue;
                return this.finishStep(var1_1, var2_2, var3_3, var10_13, var11_14, var15_19);
            }
            case 0: {
                var17_11 /* !! */  = (int)ii.zle("aakb", zlk(int ), (int)402);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl529
            }
            case 1: {
                var17_11 /* !! */  = (int)ii.zle("aakc", zlk(int ), (int)403);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl367
            }
lbl184:
            // 2 sources

            case 2: {
                var17_11 /* !! */  = (int)ii.zle("aakd", zlk(int ), (int)404);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl517
            }
            case 3: {
                var17_11 /* !! */  = (int)ii.zle("aake", zlk(int ), (int)405);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl659
            }
            case 4: {
                var17_11 /* !! */  = (int)ii.zle("aakf", zlk(int ), (int)406);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl199:
            // 5 sources

            case 5: {
                var17_11 /* !! */  = (int)ii.zle("aakg", zlk(int ), (int)407);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl590
            }
lbl204:
            // 2 sources

            case 6: {
                var17_11 /* !! */  = (int)ii.zle("aakh", zlk(int ), (int)408);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl495
            }
lbl209:
            // 2 sources

            case 7: {
                var17_11 /* !! */  = (int)ii.zle("aaki", zlk(int ), (int)409);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl499
            }
            case 8: {
                var17_11 /* !! */  = (int)ii.zle("aakj", zlk(int ), (int)410);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl407
            }
            case 9: {
                var17_11 /* !! */  = (int)ii.zle("aakk", zlk(int ), (int)411);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl239
            }
lbl224:
            // 3 sources

            case 10: {
                var17_11 /* !! */  = (int)ii.zle("aakl", zlk(int ), (int)412);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl577
            }
lbl229:
            // 3 sources

            case 11: {
                var17_11 /* !! */  = (int)ii.zle("aakm", zlk(int ), (int)413);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl479
            }
            case 12: {
                var17_11 /* !! */  = (int)ii.zle("aakn", zlk(int ), (int)414);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl586
            }
lbl239:
            // 3 sources

            case 13: {
                var17_11 /* !! */  = (int)ii.zle("aako", zlk(int ), (int)415);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl290
            }
lbl244:
            // 2 sources

            case 14: {
                var17_11 /* !! */  = (int)ii.zle("aakp", zlk(int ), (int)416);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl470
            }
lbl249:
            // 3 sources

            case 15: {
                var17_11 /* !! */  = (int)ii.zle("aakq", zlk(int ), (int)417);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl258
            }
lbl254:
            // 4 sources

            case 16: {
                var17_11 /* !! */  = (int)ii.zle("aakr", zlk(int ), (int)418);
                if (!var18_10) ** GOTO lbl244
                throw null;
            }
lbl258:
            // 2 sources

            case 17: {
                var17_11 /* !! */  = (int)ii.zle("aaks", zlk(int ), (int)419);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl339
            }
lbl263:
            // 2 sources

            case 18: {
                var17_11 /* !! */  = (int)ii.zle("aakt", zlk(int ), (int)420);
                if (var18_10) {
                    throw null;
                }
            }
lbl267:
            // 5 sources

            case 19: {
                var17_11 /* !! */  = (int)ii.zle("aaku", zlk(int ), (int)421);
                if (!var18_10) ** GOTO lbl229
                throw null;
            }
            case 20: {
                var17_11 /* !! */  = (int)ii.zle("aakv", zlk(int ), (int)422);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl425
            }
            case 21: {
                var17_11 /* !! */  = (int)ii.zle("aakw", zlk(int ), (int)423);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl548
            }
            case 22: {
                var17_11 /* !! */  = (int)ii.zle("aakx", zlk(int ), (int)424);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl310
            }
            case 23: {
                var17_11 /* !! */  = (int)ii.zle("aaky", zlk(int ), (int)425);
                if (!var18_10) break;
                throw null;
            }
lbl290:
            // 4 sources

            case 24: {
                var17_11 /* !! */  = (int)ii.zle("aakz", zlk(int ), (int)426);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl367
            }
            case 25: {
                var17_11 /* !! */  = (int)ii.zle("aala", zlk(int ), (int)427);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl325
            }
            case 26: {
                var17_11 /* !! */  = (int)ii.zle("aalb", zlk(int ), (int)428);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl385
            }
lbl305:
            // 3 sources

            case 27: {
                var17_11 /* !! */  = (int)ii.zle("aalc", zlk(int ), (int)429);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl415
            }
lbl310:
            // 2 sources

            case 28: {
                var17_11 /* !! */  = (int)ii.zle("aald", zlk(int ), (int)430);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl339
            }
lbl315:
            // 2 sources

            case 29: {
                var17_11 /* !! */  = (int)ii.zle("aale", zlk(int ), (int)431);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl475
            }
lbl320:
            // 3 sources

            case 30: {
                var17_11 /* !! */  = (int)ii.zle("aalf", zlk(int ), (int)432);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl449
            }
lbl325:
            // 2 sources

            case 31: {
                var17_11 /* !! */  = (int)ii.zle("aalg", zlk(int ), (int)433);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl449
            }
            case 32: {
                var17_11 /* !! */  = (int)ii.zle("aalh", zlk(int ), (int)434);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl590
            }
            case 33: {
                var17_11 /* !! */  = (int)ii.zle("aali", zlk(int ), (int)435);
                if (!var18_10) ** GOTO lbl267
                throw null;
            }
lbl339:
            // 6 sources

            case 34: {
                var17_11 /* !! */  = (int)ii.zle("aalj", zlk(int ), (int)436);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl504
            }
lbl344:
            // 3 sources

            case 35: {
                var17_11 /* !! */  = (int)ii.zle("aalk", zlk(int ), (int)437);
                if (!var18_10) ** GOTO lbl199
                throw null;
            }
lbl348:
            // 2 sources

            case 36: {
                var17_11 /* !! */  = (int)ii.zle("aall", zlk(int ), (int)438);
                if (!var18_10) ** GOTO lbl315
                throw null;
            }
            case 37: {
                var17_11 /* !! */  = (int)ii.zle("aalm", zlk(int ), (int)439);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl466
            }
            case 38: {
                var17_11 /* !! */  = (int)ii.zle("aaln", zlk(int ), (int)440);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl425
            }
lbl362:
            // 4 sources

            case 39: {
                var17_11 /* !! */  = (int)ii.zle("aalo", zlk(int ), (int)441);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl521
            }
lbl367:
            // 4 sources

            case 40: {
                var17_11 /* !! */  = (int)ii.zle("aalp", zlk(int ), (int)442);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl458
            }
lbl372:
            // 3 sources

            case 41: {
                var17_11 /* !! */  = (int)ii.zle("aalq", zlk(int ), (int)443);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl466
            }
            case 42: {
                var17_11 /* !! */  = (int)ii.zle("aalr", zlk(int ), (int)444);
                if (!var18_10) ** GOTO lbl290
                throw null;
            }
            case 43: {
                var17_11 /* !! */  = (int)ii.zle("aals", zlk(int ), (int)445);
                if (!var18_10) ** GOTO lbl249
                throw null;
            }
lbl385:
            // 3 sources

            case 44: {
                var17_11 /* !! */  = (int)ii.zle("aalt", zlk(int ), (int)446);
                if (!var18_10) ** GOTO lbl372
                throw null;
            }
lbl389:
            // 2 sources

            case 45: {
                var17_11 /* !! */  = (int)ii.zle("aalu", zlk(int ), (int)447);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl504
            }
lbl394:
            // 2 sources

            case 46: {
                var17_11 /* !! */  = (int)ii.zle("aalv", zlk(int ), (int)448);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl573
            }
lbl399:
            // 2 sources

            case 47: {
                var17_11 /* !! */  = (int)ii.zle("aalw", zlk(int ), (int)449);
                if (!var18_10) ** GOTO lbl254
                throw null;
            }
lbl403:
            // 2 sources

            case 48: {
                var17_11 /* !! */  = (int)ii.zle("aalx", zlk(int ), (int)450);
                if (!var18_10) ** GOTO lbl249
                throw null;
            }
lbl407:
            // 2 sources

            case 49: {
                var17_11 /* !! */  = (int)ii.zle("aaly", zlk(int ), (int)451);
                if (!var18_10) break;
                throw null;
            }
            case 50: {
                var17_11 /* !! */  = (int)ii.zle("aalz", zlk(int ), (int)452);
                if (!var18_10) ** GOTO lbl199
                throw null;
            }
lbl415:
            // 2 sources

            case 51: {
                var17_11 /* !! */  = (int)ii.zle("aama", zlk(int ), (int)453);
                if (!var18_10) ** GOTO lbl254
                throw null;
            }
lbl419:
            // 2 sources

            case 52: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var17_11 /* !! */  = (int)ii.zle("aamb", zlk(int ), (int)454);
                    if (var18_10) {
                        throw null;
                    }
                    ** GOTO lbl659
                    break;
                }
            }
lbl425:
            // 3 sources

            case 53: {
                var17_11 /* !! */  = (int)ii.zle("aamc", zlk(int ), (int)455);
                if (!var18_10) ** GOTO lbl362
                throw null;
            }
            case 54: {
                var17_11 /* !! */  = (int)ii.zle("aamd", zlk(int ), (int)456);
                if (!var18_10) ** GOTO lbl290
                throw null;
            }
            case 55: {
                var17_11 /* !! */  = (int)ii.zle("aame", zlk(int ), (int)457);
                if (!var18_10) ** GOTO lbl339
                throw null;
            }
            case 56: {
                var17_11 /* !! */  = (int)ii.zle("aamf", zlk(int ), (int)458);
                if (!var18_10) ** GOTO lbl348
                throw null;
            }
            case 57: {
                var17_11 /* !! */  = (int)ii.zle("aamg", zlk(int ), (int)459);
                if (!var18_10) ** GOTO lbl389
                throw null;
            }
            case 58: {
                var17_11 /* !! */  = (int)ii.zle("aamh", zlk(int ), (int)460);
                if (!var18_10) ** GOTO lbl394
                throw null;
            }
lbl449:
            // 3 sources

            case 59: {
                var17_11 /* !! */  = (int)ii.zle("aami", zlk(int ), (int)461);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl647
            }
lbl454:
            // 2 sources

            case 60: {
                var17_11 /* !! */  = (int)ii.zle("aamj", zlk(int ), (int)462);
                if (!var18_10) ** GOTO lbl320
                throw null;
            }
lbl458:
            // 4 sources

            case 61: {
                var17_11 /* !! */  = (int)ii.zle("aamk", zlk(int ), (int)463);
                if (!var18_10) ** GOTO lbl454
                throw null;
            }
            case 62: {
                var17_11 /* !! */  = (int)ii.zle("aaml", zlk(int ), (int)464);
                if (!var18_10) ** GOTO lbl305
                throw null;
            }
lbl466:
            // 3 sources

            case 63: {
                var17_11 /* !! */  = (int)ii.zle("aamm", zlk(int ), (int)465);
                if (!var18_10) ** GOTO lbl458
                throw null;
            }
lbl470:
            // 3 sources

            case 64: {
                var17_11 /* !! */  = (int)ii.zle("aamn", zlk(int ), (int)466);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl651
            }
lbl475:
            // 4 sources

            case 65: {
                var17_11 /* !! */  = (int)ii.zle("aamo", zlk(int ), (int)467);
                if (!var18_10) ** GOTO lbl229
                throw null;
            }
lbl479:
            // 2 sources

            case 66: {
                var17_11 /* !! */  = (int)ii.zle("aamp", zlk(int ), (int)468);
                if (!var18_10) ** GOTO lbl367
                throw null;
            }
lbl483:
            // 2 sources

            case 67: {
                var17_11 /* !! */  = (int)ii.zle("aamq", zlk(int ), (int)469);
                if (!var18_10) ** GOTO lbl305
                throw null;
            }
lbl487:
            // 2 sources

            case 68: {
                var17_11 /* !! */  = (int)ii.zle("aamr", zlk(int ), (int)470);
                if (!var18_10) break;
                throw null;
            }
            case 69: {
                var17_11 /* !! */  = (int)ii.zle("aams", zlk(int ), (int)471);
                if (!var18_10) ** GOTO lbl344
                throw null;
            }
lbl495:
            // 2 sources

            case 70: {
                var17_11 /* !! */  = (int)ii.zle("aamt", zlk(int ), (int)472);
                if (!var18_10) ** GOTO lbl419
                throw null;
            }
lbl499:
            // 2 sources

            case 71: {
                var17_11 /* !! */  = (int)ii.zle("aamu", zlk(int ), (int)473);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl543
            }
lbl504:
            // 3 sources

            case 72: {
                var17_11 /* !! */  = (int)ii.zle("aamv", zlk(int ), (int)474);
                if (!var18_10) ** GOTO lbl399
                throw null;
            }
            case 73: {
                var17_11 /* !! */  = (int)ii.zle("aamw", zlk(int ), (int)475);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl548
            }
            case 74: {
                var17_11 /* !! */  = (int)ii.zle("aamx", zlk(int ), (int)476);
                if (!var18_10) ** GOTO lbl475
                throw null;
            }
lbl517:
            // 3 sources

            case 75: {
                var17_11 /* !! */  = (int)ii.zle("aamy", zlk(int ), (int)477);
                if (!var18_10) ** GOTO lbl254
                throw null;
            }
lbl521:
            // 2 sources

            case 76: {
                var17_11 /* !! */  = (int)ii.zle("aamz", zlk(int ), (int)478);
                if (!var18_10) ** GOTO lbl372
                throw null;
            }
            case 77: {
                var17_11 /* !! */  = (int)ii.zle("aana", zlk(int ), (int)479);
                if (!var18_10) ** GOTO lbl239
                throw null;
            }
lbl529:
            // 2 sources

            case 78: {
                var17_11 /* !! */  = (int)ii.zle("aanb", zlk(int ), (int)480);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl655
            }
            case 79: {
                var17_11 /* !! */  = (int)ii.zle("aanc", zlk(int ), (int)481);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl635
            }
            case 80: {
                var17_11 /* !! */  = (int)ii.zle("aand", zlk(int ), (int)482);
                if (!var18_10) break;
                throw null;
            }
lbl543:
            // 2 sources

            case 81: {
                var17_11 /* !! */  = (int)ii.zle("aane", zlk(int ), (int)483);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl627
            }
lbl548:
            // 3 sources

            case 82: {
                var17_11 /* !! */  = (int)ii.zle("aanf", zlk(int ), (int)484);
                if (!var18_10) ** GOTO lbl344
                throw null;
            }
lbl552:
            // 2 sources

            case 83: {
                var17_11 /* !! */  = (int)ii.zle("aang", zlk(int ), (int)485);
                if (!var18_10) ** GOTO lbl470
                throw null;
            }
            case 84: {
                var17_11 /* !! */  = (int)ii.zle("aanh", zlk(int ), (int)486);
                if (!var18_10) ** GOTO lbl403
                throw null;
            }
            case 85: {
                var17_11 /* !! */  = (int)ii.zle("aani", zlk(int ), (int)487);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl577
            }
            case 86: {
                var17_11 /* !! */  = (int)ii.zle("aanj", zlk(int ), (int)488);
                if (!var18_10) ** GOTO lbl204
                throw null;
            }
            case 87: {
                var17_11 /* !! */  = (int)ii.zle("aank", zlk(int ), (int)489);
                if (!var18_10) ** GOTO lbl199
                throw null;
            }
lbl573:
            // 3 sources

            case 88: {
                var17_11 /* !! */  = (int)ii.zle("aanl", zlk(int ), (int)490);
                if (!var18_10) ** GOTO lbl385
                throw null;
            }
lbl577:
            // 3 sources

            case 89: {
                var17_11 /* !! */  = (int)ii.zle("aanm", zlk(int ), (int)491);
                if (!var18_10) ** GOTO lbl552
                throw null;
            }
            case 90: {
                var17_11 /* !! */  = (int)ii.zle("aann", zlk(int ), (int)492);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl623
            }
lbl586:
            // 2 sources

            case 91: {
                var17_11 /* !! */  = (int)ii.zle("aano", zlk(int ), (int)493);
                if (!var18_10) ** GOTO lbl362
                throw null;
            }
lbl590:
            // 3 sources

            case 92: {
                var17_11 /* !! */  = (int)ii.zle("aanp", zlk(int ), (int)494);
                if (var18_10) {
                    throw null;
                }
                ** GOTO lbl611
            }
            case 93: {
                var17_11 /* !! */  = (int)ii.zle("aanq", zlk(int ), (int)495);
                if (!var18_10) ** GOTO lbl184
                throw null;
            }
            case 94: {
                var17_11 /* !! */  = (int)ii.zle("aanr", zlk(int ), (int)496);
                if (!var18_10) ** GOTO lbl263
                throw null;
            }
            case 95: {
                var17_11 /* !! */  = (int)ii.zle("aans", zlk(int ), (int)497);
                if (!var18_10) ** GOTO lbl573
                throw null;
            }
lbl607:
            // 2 sources

            case 96: {
                var17_11 /* !! */  = (int)ii.zle("aant", zlk(int ), (int)498);
                if (!var18_10) ** GOTO lbl487
                throw null;
            }
lbl611:
            // 2 sources

            case 97: {
                var17_11 /* !! */  = (int)ii.zle("aanu", zlk(int ), (int)499);
                if (!var18_10) ** GOTO lbl339
                throw null;
            }
            case 98: {
                var17_11 /* !! */  = (int)ii.zle("aanv", zlk(int ), (int)500);
                if (!var18_10) ** GOTO lbl267
                throw null;
            }
            case 99: {
                var17_11 /* !! */  = (int)ii.zle("aanw", zlk(int ), (int)501);
                if (!var18_10) ** GOTO lbl483
                throw null;
            }
lbl623:
            // 2 sources

            case 100: {
                var17_11 /* !! */  = (int)ii.zle("aanx", zlk(int ), (int)502);
                if (!var18_10) ** GOTO lbl517
                throw null;
            }
lbl627:
            // 2 sources

            case 101: {
                var17_11 /* !! */  = (int)ii.zle("aany", zlk(int ), (int)503);
                if (!var18_10) ** GOTO lbl199
                throw null;
            }
            case 102: {
                var17_11 /* !! */  = (int)ii.zle("aanz", zlk(int ), (int)504);
                if (!var18_10) ** GOTO lbl458
                throw null;
            }
lbl635:
            // 2 sources

            case 103: {
                var17_11 /* !! */  = (int)ii.zle("aaoa", zlk(int ), (int)505);
                if (!var18_10) ** GOTO lbl339
                throw null;
            }
            case 104: {
                var17_11 /* !! */  = (int)ii.zle("aaob", zlk(int ), (int)506);
                if (!var18_10) ** GOTO lbl209
                throw null;
            }
            case 105: {
                var17_11 /* !! */  = (int)ii.zle("aaoc", zlk(int ), (int)507);
                if (!var18_10) ** GOTO lbl320
                throw null;
            }
lbl647:
            // 2 sources

            case 106: {
                var17_11 /* !! */  = (int)ii.zle("aaod", zlk(int ), (int)508);
                if (!var18_10) ** GOTO lbl224
                throw null;
            }
lbl651:
            // 2 sources

            case 107: {
                var17_11 /* !! */  = (int)ii.zle("aaoe", zlk(int ), (int)509);
                if (!var18_10) ** GOTO lbl607
                throw null;
            }
lbl655:
            // 2 sources

            case 108: {
                var17_11 /* !! */  = (int)ii.zle("aaof", zlk(int ), (int)510);
                if (!var18_10) ** GOTO lbl362
                throw null;
            }
lbl659:
            // 3 sources

            case 109: {
                var17_11 /* !! */  = (int)ii.zle("aaog", zlk(int ), (int)511);
                if (!var18_10) ** GOTO lbl475
                throw null;
            }
            case 110: 
        }
        var17_11 /* !! */  = (int)ii.zle("aaoh", zlk(int ), (int)512);
        ** while (!var18_10)
lbl666:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void abrr() {
        ii.zlh[400] = 701824166;
        ii.zlh[401] = 179408028;
        ii.zlh[402] = -665928785;
        ii.zlh[403] = 1389136863;
        ii.zlh[404] = 944110138;
        ii.zlh[405] = -526777395;
        ii.zlh[406] = 1399038812;
        ii.zlh[407] = 873487018;
        ii.zlh[408] = 1228323220;
        ii.zlh[409] = -1058940869;
        ii.zlh[410] = 1685273531;
        ii.zlh[411] = -690095723;
        ii.zlh[412] = -2100917291;
        ii.zlh[413] = 891173285;
        ii.zlh[414] = 1563738510;
        ii.zlh[415] = 1649122659;
        ii.zlh[416] = 777880040;
        ii.zlh[417] = -284263889;
        ii.zlh[418] = -805739811;
        ii.zlh[419] = 1689467369;
        ii.zlh[420] = -823286773;
        ii.zlh[421] = 1481612637;
        ii.zlh[422] = 134670126;
        ii.zlh[423] = -1130071748;
        ii.zlh[424] = -2143480870;
        ii.zlh[425] = 1924215630;
        ii.zlh[426] = 130766514;
        ii.zlh[427] = 1774322699;
        ii.zlh[428] = -1374385666;
        ii.zlh[429] = -1587920150;
        ii.zlh[430] = 930362289;
        ii.zlh[431] = 1401103363;
        ii.zlh[432] = 2146495534;
        ii.zlh[433] = 1342759795;
        ii.zlh[434] = 1946751957;
        ii.zlh[435] = 199164514;
        ii.zlh[436] = -192026660;
        ii.zlh[437] = -1522700154;
        ii.zlh[438] = 1892857972;
        ii.zlh[439] = -1737030447;
        ii.zlh[440] = 864733118;
        ii.zlh[441] = -305367086;
        ii.zlh[442] = -2016087452;
        ii.zlh[443] = 573182540;
        ii.zlh[444] = 566884671;
        ii.zlh[445] = 979418302;
        ii.zlh[446] = -340597546;
        ii.zlh[447] = -648889163;
        ii.zlh[448] = -1975585282;
        ii.zlh[449] = 1546194229;
        ii.zlh[450] = 1119518723;
        ii.zlh[451] = 1888393746;
        ii.zlh[452] = -404389324;
        ii.zlh[453] = -1820086329;
        ii.zlh[454] = -1320336004;
        ii.zlh[455] = -653440664;
        ii.zlh[456] = -103253192;
        ii.zlh[457] = -2076991292;
        ii.zlh[458] = 1051305259;
        ii.zlh[459] = -1102450703;
        ii.zlh[460] = 657300769;
        ii.zlh[461] = 1825177572;
        ii.zlh[462] = -612789707;
        ii.zlh[463] = -201708351;
        ii.zlh[464] = 1755251843;
        ii.zlh[465] = -458208026;
        ii.zlh[466] = -1967122102;
        ii.zlh[467] = 1009371591;
        ii.zlh[468] = -110997207;
        ii.zlh[469] = 468081076;
        ii.zlh[470] = -1123480187;
        ii.zlh[471] = -1658147995;
        ii.zlh[472] = -1307006905;
        ii.zlh[473] = 2068913314;
        ii.zlh[474] = -1604637795;
        ii.zlh[475] = -747321964;
        ii.zlh[476] = 1472331934;
        ii.zlh[477] = -1297762263;
        ii.zlh[478] = 1587425938;
        ii.zlh[479] = 722082161;
        ii.zlh[480] = -1202620030;
        ii.zlh[481] = 2077126013;
        ii.zlh[482] = 892066542;
        ii.zlh[483] = 1655635159;
        ii.zlh[484] = 2116526450;
        ii.zlh[485] = 1230851553;
        ii.zlh[486] = 1146860223;
        ii.zlh[487] = -645450216;
        ii.zlh[488] = -1097667716;
        ii.zlh[489] = -2139431957;
        ii.zlh[490] = -1975044118;
        ii.zlh[491] = -1582520309;
        ii.zlh[492] = 1824900608;
        ii.zlh[493] = -184747512;
        ii.zlh[494] = -503003834;
        ii.zlh[495] = -1604544204;
        ii.zlh[496] = -1112211174;
        ii.zlh[497] = -231422104;
        ii.zlh[498] = 493690860;
        ii.zlh[499] = 1654969538;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ov syntheticStep(ov var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, boolean var7_7, boolean var8_8, boolean var9_9, boolean var10_10, boolean var11_11, float var12_12) {
        block18: {
            block17: {
                block16: {
                    block15: {
                        block14: {
                            block13: {
                                block12: {
                                    block10: {
                                        block11: {
                                            block9: {
                                                block8: {
                                                    block7: {
                                                        var23_13 = ii.c;
                                                        var22_14 = ii.b;
                                                        var21_15 = ii.a;
                                                        if (var23_13) {
                                                            throw null;
lbl6:
                                                            // 32 sources

                                                            return null;
                                                        }
                                                        if (var21_15 || var21_15) ** GOTO lbl6
                                                        this.advanceNoise();
                                                        if (var21_15 || var21_15) ** GOTO lbl6
                                                        var13_16 = this.strength();
                                                        if (var21_15 || var21_15) ** GOTO lbl6
                                                        var14_17 = this.noiseYaw * this.lerp((float)ii.zle("aaoi", zlg(int ), (int)513), (float)ii.zle("aaoj", zlg(int ), (int)514));
                                                        if (var21_15 || var21_15) ** GOTO lbl6
                                                        var15_18 = this.noisePitch * this.lerp((float)ii.zle("aaok", zlg(int ), (int)515), (float)ii.zle("aaol", zlg(int ), (int)516));
                                                        if (var21_15 || var21_15) ** GOTO lbl6
                                                        if (this.combatTicks > ii.zle("aaom", zlk(int ), (int)517)) break block7;
                                                        if (var21_15) ** GOTO lbl6
                                                        v0 = ii.zle("aaon", zlk(int ), (int)518);
                                                        if (var23_13) {
                                                            throw null;
                                                        }
                                                        break block8;
                                                    }
                                                    if (var21_15 || var21_15) ** GOTO lbl6
                                                    v0 = var16_19 = ii.zle("aaoo", zlk(int ), (int)519);
                                                }
                                                if (var21_15 || var21_15) ** GOTO lbl6
                                                if (this.rotationTicks <= ii.zle("aaop", zlk(int ), (int)520)) break block9;
                                                if (var21_15) ** GOTO lbl6
                                                v1 /* !! */  = ii.zle("aaoq", zlg(int ), (int)521);
                                                if (var23_13) {
                                                    throw null;
                                                }
                                                break block10;
                                            }
                                            if (var21_15 || var21_15) ** GOTO lbl6
                                            if (this.rotationTicks <= ii.zle("aaor", zlk(int ), (int)522)) break block11;
                                            if (var21_15) ** GOTO lbl6
                                            v1 /* !! */  = ii.zle("aaos", zlg(int ), (int)523);
                                            if (var23_13) {
                                                throw null;
                                            }
                                            break block10;
                                        }
                                        if (var21_15 || var21_15) ** GOTO lbl6
                                        v1 /* !! */  = var17_20 = (CallSite)0.0f;
                                    }
                                    if (var21_15 || var21_15) ** GOTO lbl6
                                    if (var16_19 == false) break block12;
                                    if (var21_15) ** GOTO lbl6
                                    if (this.postHitTicks > 0) break block12;
                                    if (var21_15) ** GOTO lbl6
                                    v2 = ii.zle("aaot", zlg(int ), (int)524);
                                    if (var23_13) {
                                        throw null;
                                    }
                                    break block13;
                                }
                                if (var21_15 || var21_15) ** GOTO lbl6
                                v2 = ii.zle("aaou", zlg(int ), (int)525);
                            }
                            var18_21 = v2 - var17_20;
                            if (var21_15 || var21_15) ** GOTO lbl6
                            if (!var9_9) break block14;
                            if (var21_15 || var21_15) ** GOTO lbl6
                            var19_22 = this.lerp((float)ii.zle("aaov", zlg(int ), (int)526), (float)ii.zle("aaow", zlg(int ), (int)527)) * (ii.zle("aaox", zlg(int ), (int)528) + var13_16);
                            if (var21_15 || var21_15) ** GOTO lbl6
                            var20_25 = this.lerp((float)ii.zle("aaoy", zlg(int ), (int)529), (float)ii.zle("aaoz", zlg(int ), (int)530)) * (ii.zle("aapa", zlg(int ), (int)531) + var13_16);
                            if (var21_15 || var21_15) ** GOTO lbl6
                            return this.cruise(var1_1, var2_2, var3_3, var4_4, var14_17, var15_18, var5_5, var6_6, var19_22, var20_25, (float)ii.zle("aapb", zlg(int ), (int)532), (boolean)ii.zle("aapc", zlk(int ), (int)533), (boolean)ii.zle("aapd", zlk(int ), (int)534));
                        }
                        if (var21_15 || var21_15) ** GOTO lbl6
                        if (!var10_10) break block15;
                        if (var21_15 || var21_15) ** GOTO lbl6
                        var19_23 = this.lerp((float)ii.zle("aape", zlg(int ), (int)535), (float)ii.zle("aapf", zlg(int ), (int)536)) * (ii.zle("aapg", zlg(int ), (int)537) + var13_16);
                        if (var21_15 || var21_15) ** GOTO lbl6
                        var20_26 = this.lerp((float)ii.zle("aaph", zlg(int ), (int)538), (float)ii.zle("aapi", zlg(int ), (int)539)) * (ii.zle("aapj", zlg(int ), (int)540) + var13_16);
                        if (var21_15 || var21_15) ** GOTO lbl6
                        return this.cruise(var1_1, var2_2, var3_3, var4_4, var14_17, var15_18, var5_5, var6_6, var19_23, var20_26, (float)ii.zle("aapk", zlg(int ), (int)541), (boolean)ii.zle("aapl", zlk(int ), (int)542), (boolean)ii.zle("aapm", zlk(int ), (int)543));
                    }
                    if (var21_15 || var21_15) ** GOTO lbl6
                    if (!var7_7) break block16;
                    if (var21_15 || var21_15) ** GOTO lbl6
                    return this.lockOn(var1_1, var2_2, var3_3, var4_4, var14_17, var15_18, var5_5, var6_6, var13_16, (float)var18_21, var12_12);
                }
                if (var21_15 || var21_15) ** GOTO lbl6
                if (!(var4_4 > ii.zle("aapn", zlg(int ), (int)544))) break block17;
                if (var21_15 || var21_15) ** GOTO lbl6
                v3 = this.lerp((float)ii.zle("aapo", zlg(int ), (int)545), (float)ii.zle("aapp", zlg(int ), (int)546)) * (ii.zle("aapq", zlg(int ), (int)547) + var13_16);
                if (var23_13) {
                    throw null;
                }
                break block18;
            }
            if (var21_15 || var21_15) ** GOTO lbl6
            v3 = var19_24 = this.lerp((float)ii.zle("aapr", zlg(int ), (int)548), (float)ii.zle("aaps", zlg(int ), (int)549)) * (ii.zle("aapt", zlg(int ), (int)550) + var13_16);
        }
        if (var21_15 || var21_15) ** GOTO lbl6
        var19_24 = class_3532.method_15363((float)(var19_24 * (ii.zle("aapu", zlg(int ), (int)551) + this.random.nextFloat() * ii.zle("aapv", zlg(int ), (int)552))), (float)ii.zle("aapw", zlg(int ), (int)553), (float)var18_21);
        if (var21_15 || var21_15) ** GOTO lbl6
        var20_27 = this.lerp((float)ii.zle("aapx", zlg(int ), (int)554), (float)ii.zle("aapy", zlg(int ), (int)555)) * (ii.zle("aapz", zlg(int ), (int)556) + var13_16);
        if (!var21_15 && !var21_15) ** break;
        ** while (true)
        return this.cruise(var1_1, var2_2, var3_3, var4_4, var14_17, var15_18, var5_5, var6_6, var19_24, var20_27, (float)ii.zle("aaqa", zlg(int ), (int)557), (boolean)ii.zle("aaqb", zlk(int ), (int)558), (boolean)ii.zle("aaqc", zlk(int ), (int)559));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float quantizeDelta(float var1_1) {
        block102: {
            block104: {
                block103: {
                    block101: {
                        var8_2 = ii.c;
                        var7_3 /* !! */  = ii.b;
                        var6_4 = ii.a;
                        if (var8_2) {
                            throw null;
lbl6:
                            // 29 sources

                            return (float)ii.zle("abgv", zlg(int ), (int)955);
                        }
                        if (var6_4 || var6_4) ** GOTO lbl6
                        var2_5 = nm.computeGcd();
                        if (var6_4 || var6_4) ** GOTO lbl6
                        if (!(var2_5 <= ii.zle("abgw", zqq(int ), (int)131))) break block101;
                        if (var6_4 || var6_4) ** GOTO lbl6
                        return var1_1;
                    }
                    if (var6_4 || var6_4) ** GOTO lbl6
                    var4_6 /* !! */  = Math.round((double)var1_1 / var2_5);
                    if (var6_4 || var6_4) ** GOTO lbl6
                    if (var4_6 /* !! */  != ii.zle("abgx", zlb(int ), (int)132)) break block102;
                    if (var6_4) ** GOTO lbl6
                    if (!((double)Math.abs(var1_1) > var2_5 * ii.zle("abgy", zqq(int ), (int)133))) break block102;
                    if (var6_4 || var6_4) ** GOTO lbl6
                    if (!(var1_1 > 0.0f)) break block103;
                    if (var6_4) ** GOTO lbl6
                    v0 = ii.zle("abgz", zlb(int ), (int)134);
                    if (var8_2) {
                        throw null;
                    }
                    break block104;
                }
                if (var6_4 || var6_4) ** GOTO lbl6
                v0 = ii.zle("abha", zlb(int ), (int)135);
            }
            var4_6 /* !! */  = (long)v0;
            if (var6_4) ** GOTO lbl6
        }
        if (var6_4 || var6_4) ** GOTO lbl6
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!((double)Math.abs(var1_1) > var2_5 * ii.zle("abhb", zqq(int ), (int)136))) ** GOTO lbl53
                if (var6_4) ** GOTO lbl6
                if (Math.abs(var4_6 /* !! */ ) >= ii.zle("abhc", zlb(int ), (int)137)) ** GOTO lbl53
                if (var6_4 || var6_4) ** GOTO lbl6
                if (!(var1_1 > 0.0f)) ** GOTO lbl49
                if (var6_4) ** GOTO lbl6
                v1 = ii.zle("abhd", zlb(int ), (int)138);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl51
lbl49:
                // 1 sources

                if (var6_4 || var6_4) ** GOTO lbl6
                v1 = ii.zle("abhe", zlb(int ), (int)139);
lbl51:
                // 2 sources

                var4_6 /* !! */  = (long)v1;
                if (var6_4) ** GOTO lbl6
lbl53:
                // 3 sources

                if (var6_4 || var6_4) ** GOTO lbl6
                if (!((double)Math.abs(var1_1) > var2_5 * ii.zle("abhf", zqq(int ), (int)140))) ** GOTO lbl68
                if (var6_4) ** GOTO lbl6
                if (Math.abs(var4_6 /* !! */ ) >= ii.zle("abhg", zlb(int ), (int)141)) ** GOTO lbl68
                if (var6_4 || var6_4) ** GOTO lbl6
                if (!(var1_1 > 0.0f)) ** GOTO lbl64
                if (var6_4) ** GOTO lbl6
                v2 = ii.zle("abhh", zlb(int ), (int)142);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl66
lbl64:
                // 1 sources

                if (var6_4 || var6_4) ** GOTO lbl6
                v2 = ii.zle("abhi", zlb(int ), (int)143);
lbl66:
                // 2 sources

                var4_6 /* !! */  = (long)v2;
                if (var6_4) ** GOTO lbl6
lbl68:
                // 3 sources

                if (var6_4 || var6_4) ** GOTO lbl6
                if (!((double)Math.abs(var1_1) > var2_5 * ii.zle("abhj", zqq(int ), (int)144))) ** GOTO lbl83
                if (var6_4) ** GOTO lbl6
                if (Math.abs(var4_6 /* !! */ ) >= ii.zle("abhk", zlb(int ), (int)145)) ** GOTO lbl83
                if (var6_4 || var6_4) ** GOTO lbl6
                if (!(var1_1 > 0.0f)) ** GOTO lbl79
                if (var6_4) ** GOTO lbl6
                v3 = ii.zle("abhl", zlb(int ), (int)146);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl81
lbl79:
                // 1 sources

                if (var6_4 || var6_4) ** GOTO lbl6
                v3 = ii.zle("abhm", zlb(int ), (int)147);
lbl81:
                // 2 sources

                var4_6 /* !! */  = (long)v3;
                if (var6_4) ** GOTO lbl6
lbl83:
                // 3 sources

                if (!var6_4 && !var6_4) ** break;
                ** continue;
                return (float)((double)var4_6 /* !! */  * var2_5);
            }
lbl86:
            // 2 sources

            case 0: {
                var7_3 /* !! */  = (int)ii.zle("abhn", zlk(int ), (int)956);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl253
            }
            case 1: {
                var7_3 /* !! */  = (int)ii.zle("abho", zlk(int ), (int)957);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl189
            }
lbl96:
            // 4 sources

            case 2: {
                var7_3 /* !! */  = (int)ii.zle("abhp", zlk(int ), (int)958);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl249
            }
            case 3: {
                var7_3 /* !! */  = (int)ii.zle("abhq", zlk(int ), (int)959);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl106:
            // 2 sources

            case 4: {
                var7_3 /* !! */  = (int)ii.zle("abhr", zlk(int ), (int)960);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl241
            }
lbl111:
            // 2 sources

            case 5: {
                var7_3 /* !! */  = (int)ii.zle("abhs", zlk(int ), (int)961);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl281
            }
lbl116:
            // 2 sources

            case 6: {
                var7_3 /* !! */  = (int)ii.zle("abht", zlk(int ), (int)962);
                if (!var8_2) ** GOTO lbl96
                throw null;
            }
lbl120:
            // 2 sources

            case 7: {
                var7_3 /* !! */  = (int)ii.zle("abhu", zlk(int ), (int)963);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl257
            }
            case 8: {
                var7_3 /* !! */  = (int)ii.zle("abhv", zlk(int ), (int)964);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl189
            }
lbl130:
            // 2 sources

            case 9: {
                var7_3 /* !! */  = (int)ii.zle("abhw", zlk(int ), (int)965);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl257
            }
lbl135:
            // 3 sources

            case 10: {
                var7_3 /* !! */  = (int)ii.zle("abhx", zlk(int ), (int)966);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl228
            }
            case 11: {
                var7_3 /* !! */  = (int)ii.zle("abhy", zlk(int ), (int)967);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl224
            }
            case 12: {
                var7_3 /* !! */  = (int)ii.zle("abhz", zlk(int ), (int)968);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl198
            }
lbl150:
            // 2 sources

            case 13: {
                var7_3 /* !! */  = (int)ii.zle("abia", zlk(int ), (int)969);
                if (var8_2) {
                    throw null;
                }
            }
lbl154:
            // 5 sources

            case 14: {
                var7_3 /* !! */  = (int)ii.zle("abib", zlk(int ), (int)970);
                if (!var8_2) ** GOTO lbl135
                throw null;
            }
lbl158:
            // 2 sources

            case 15: {
                var7_3 /* !! */  = (int)ii.zle("abic", zlk(int ), (int)971);
                if (!var8_2) ** GOTO lbl96
                throw null;
            }
lbl162:
            // 3 sources

            case 16: {
                var7_3 /* !! */  = (int)ii.zle("abid", zlk(int ), (int)972);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl253
            }
            case 17: {
                var7_3 /* !! */  = (int)ii.zle("abie", zlk(int ), (int)973);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl172:
            // 3 sources

            case 18: {
                var7_3 /* !! */  = (int)ii.zle("abif", zlk(int ), (int)974);
                if (!var8_2) ** GOTO lbl162
                throw null;
            }
lbl176:
            // 2 sources

            case 19: {
                var7_3 /* !! */  = (int)ii.zle("abig", zlk(int ), (int)975);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl233
            }
lbl181:
            // 4 sources

            case 20: {
                var7_3 /* !! */  = (int)ii.zle("abih", zlk(int ), (int)976);
                if (!var8_2) ** GOTO lbl154
                throw null;
            }
            case 21: {
                var7_3 /* !! */  = (int)ii.zle("abii", zlk(int ), (int)977);
                if (!var8_2) ** GOTO lbl111
                throw null;
            }
lbl189:
            // 3 sources

            case 22: {
                var7_3 /* !! */  = (int)ii.zle("abij", zlk(int ), (int)978);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl212
            }
            case 23: {
                var7_3 /* !! */  = (int)ii.zle("abik", zlk(int ), (int)979);
                if (!var8_2) ** GOTO lbl106
                throw null;
            }
lbl198:
            // 2 sources

            case 24: {
                var7_3 /* !! */  = (int)ii.zle("abil", zlk(int ), (int)980);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl245
            }
            case 25: {
                var7_3 /* !! */  = (int)ii.zle("abim", zlk(int ), (int)981);
                if (!var8_2) ** GOTO lbl154
                throw null;
            }
lbl207:
            // 4 sources

            case 26: {
                var7_3 /* !! */  = (int)ii.zle("abin", zlk(int ), (int)982);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl265
            }
lbl212:
            // 2 sources

            case 27: {
                var7_3 /* !! */  = (int)ii.zle("abio", zlk(int ), (int)983);
                if (!var8_2) ** GOTO lbl207
                throw null;
            }
lbl216:
            // 3 sources

            case 28: {
                var7_3 /* !! */  = (int)ii.zle("abip", zlk(int ), (int)984);
                if (!var8_2) ** GOTO lbl86
                throw null;
            }
            case 29: {
                var7_3 /* !! */  = (int)ii.zle("abiq", zlk(int ), (int)985);
                if (!var8_2) ** GOTO lbl150
                throw null;
            }
lbl224:
            // 2 sources

            case 30: {
                var7_3 /* !! */  = (int)ii.zle("abir", zlk(int ), (int)986);
                if (!var8_2) ** GOTO lbl116
                throw null;
            }
lbl228:
            // 2 sources

            case 31: {
                var7_3 /* !! */  = (int)ii.zle("abis", zlk(int ), (int)987);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl277
            }
lbl233:
            // 3 sources

            case 32: {
                var7_3 /* !! */  = (int)ii.zle("abit", zlk(int ), (int)988);
                if (!var8_2) ** GOTO lbl172
                throw null;
            }
            case 33: {
                var7_3 /* !! */  = (int)ii.zle("abiu", zlk(int ), (int)989);
                if (!var8_2) ** GOTO lbl162
                throw null;
            }
lbl241:
            // 2 sources

            case 34: {
                var7_3 /* !! */  = (int)ii.zle("abiv", zlk(int ), (int)990);
                if (!var8_2) ** GOTO lbl181
                throw null;
            }
lbl245:
            // 2 sources

            case 35: {
                var7_3 /* !! */  = (int)ii.zle("abiw", zlk(int ), (int)991);
                if (!var8_2) ** GOTO lbl176
                throw null;
            }
lbl249:
            // 3 sources

            case 36: {
                var7_3 /* !! */  = (int)ii.zle("abix", zlk(int ), (int)992);
                if (!var8_2) ** GOTO lbl158
                throw null;
            }
lbl253:
            // 3 sources

            case 37: {
                var7_3 /* !! */  = (int)ii.zle("abiy", zlk(int ), (int)993);
                if (!var8_2) ** GOTO lbl130
                throw null;
            }
lbl257:
            // 4 sources

            case 38: {
                var7_3 /* !! */  = (int)ii.zle("abiz", zlk(int ), (int)994);
                if (!var8_2) ** GOTO lbl135
                throw null;
            }
lbl261:
            // 2 sources

            case 39: {
                var7_3 /* !! */  = (int)ii.zle("abja", zlk(int ), (int)995);
                if (!var8_2) ** GOTO lbl120
                throw null;
            }
lbl265:
            // 2 sources

            case 40: {
                var7_3 /* !! */  = (int)ii.zle("abjb", zlk(int ), (int)996);
                if (!var8_2) ** GOTO lbl96
                throw null;
            }
            case 41: {
                var7_3 /* !! */  = (int)ii.zle("abjc", zlk(int ), (int)997);
                if (!var8_2) ** GOTO lbl257
                throw null;
            }
            case 42: {
                var7_3 /* !! */  = (int)ii.zle("abjd", zlk(int ), (int)998);
                if (!var8_2) ** GOTO lbl172
                throw null;
            }
lbl277:
            // 2 sources

            case 43: {
                var7_3 /* !! */  = (int)ii.zle("abje", zlk(int ), (int)999);
                if (!var8_2) ** GOTO lbl207
                throw null;
            }
lbl281:
            // 2 sources

            case 44: {
                var7_3 /* !! */  = (int)ii.zle("abjf", zlk(int ), (int)1000);
                if (!var8_2) ** GOTO lbl261
                throw null;
            }
            case 45: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_3 /* !! */  = (int)ii.zle("abjg", zlk(int ), (int)1001);
                    if (!var8_2) ** GOTO lbl216
                    throw null;
                }
            }
            case 46: {
                var7_3 /* !! */  = (int)ii.zle("abjh", zlk(int ), (int)1002);
                if (!var8_2) ** GOTO lbl216
                throw null;
            }
            case 47: {
                var7_3 /* !! */  = (int)ii.zle("abji", zlk(int ), (int)1003);
                if (!var8_2) ** GOTO lbl181
                throw null;
            }
            case 48: {
                var7_3 /* !! */  = (int)ii.zle("abjj", zlk(int ), (int)1004);
                if (!var8_2) ** GOTO lbl249
                throw null;
            }
            case 49: {
                var7_3 /* !! */  = (int)ii.zle("abjk", zlk(int ), (int)1005);
                if (!var8_2) ** GOTO lbl233
                throw null;
            }
            case 50: 
        }
        var7_3 /* !! */  = (int)ii.zle("abjl", zlk(int ), (int)1006);
        ** while (!var8_2)
lbl309:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void absl() {
        ii.zlc[0] = -8613172225293495728L;
        ii.zlc[1] = -3916284871098371586L;
        ii.zlc[2] = -4954646692376251681L;
        ii.zlc[3] = 5161191670625477224L;
        ii.zlc[4] = -4572192051714057671L;
        ii.zlc[5] = -4717803724289632528L;
        ii.zlc[6] = 61226627198570059L;
        ii.zlc[7] = -1547748590206320693L;
        ii.zlc[8] = 6892196245186547948L;
        ii.zlc[9] = 1079197844155285131L;
        ii.zlc[10] = -4011457958957534314L;
        ii.zlc[11] = 1857623037568062081L;
        ii.zlc[12] = -8741976578116187783L;
        ii.zlc[13] = -8884730330256201266L;
        ii.zlc[14] = 7400805788254234743L;
        ii.zlc[15] = 1952686747403806432L;
        ii.zlc[16] = 4690917303426537501L;
        ii.zlc[17] = 2338198137797847119L;
        ii.zlc[18] = 6745043671698098938L;
        ii.zlc[19] = 6541927284681795440L;
        ii.zlc[20] = -1990081536298357429L;
        ii.zlc[21] = 1966763847847891414L;
        ii.zlc[22] = -7161377701159003263L;
        ii.zlc[23] = -7753502231411014773L;
        ii.zlc[24] = 4846894062541529705L;
        ii.zlc[25] = 6155229091864683003L;
        ii.zlc[26] = 5962049555960474544L;
        ii.zlc[27] = 302753215734300851L;
        ii.zlc[28] = 6437916646058602910L;
        ii.zlc[29] = -4814959846578578844L;
        ii.zlc[30] = 6675798264242495225L;
        ii.zlc[31] = -2718057834140602993L;
        ii.zlc[32] = 6855506993647655168L;
        ii.zlc[33] = 2911857947833335443L;
        ii.zlc[34] = -3716607489463857986L;
        ii.zlc[35] = 2860861693342439912L;
        ii.zlc[36] = 941327405746543205L;
        ii.zlc[37] = -1477473506072452186L;
        ii.zlc[38] = -4675212108742872596L;
        ii.zlc[39] = -3322785386231952386L;
        ii.zlc[40] = 8925078416616535591L;
        ii.zlc[41] = -382056202211285265L;
        ii.zlc[42] = 5253289008268451515L;
        ii.zlc[43] = 8268838096867681577L;
        ii.zlc[44] = -8400078178911664633L;
        ii.zlc[45] = -7783443308484756437L;
        ii.zlc[46] = 8481642061309953442L;
        ii.zlc[47] = 3907430090908782799L;
        ii.zlc[48] = 4119910248902344652L;
        ii.zlc[49] = -7130247803587115669L;
        ii.zlc[50] = 6778823499573209784L;
        ii.zlc[51] = 1546243152793064728L;
        ii.zlc[52] = -3378906419079624611L;
        ii.zlc[53] = 4270952674049538748L;
        ii.zlc[54] = -7747224149779892850L;
        ii.zlc[55] = 806810908206079418L;
        ii.zlc[56] = 614500735058526403L;
        ii.zlc[57] = 6348570607568192667L;
        ii.zlc[58] = 2720867234097545993L;
        ii.zlc[59] = 2396120866100454960L;
        ii.zlc[60] = 578371952601673859L;
        ii.zlc[61] = -7892331492706833818L;
        ii.zlc[62] = 6598778285273307090L;
        ii.zlc[63] = 5243543824753027564L;
        ii.zlc[64] = 2986794525156914738L;
        ii.zlc[65] = -3480162530373265591L;
        ii.zlc[66] = 7756892013778613407L;
        ii.zlc[67] = -6975613097116608064L;
        ii.zlc[68] = 1651558378928499476L;
        ii.zlc[69] = -2909820027807015305L;
        ii.zlc[70] = 4158174540368456517L;
        ii.zlc[71] = 5096969618000278436L;
        ii.zlc[72] = 4188595695464832453L;
        ii.zlc[73] = 7352982085490378640L;
        ii.zlc[74] = 452131062197116384L;
        ii.zlc[75] = -9219014697364906658L;
        ii.zlc[76] = 303040901865248480L;
        ii.zlc[77] = -489112501712899225L;
        ii.zlc[78] = 6911742829441298830L;
        ii.zlc[79] = 5784478127736281039L;
        ii.zlc[80] = 2451863979266949147L;
        ii.zlc[81] = 2175180884409670368L;
        ii.zlc[82] = 1897418896501502818L;
        ii.zlc[83] = -5139751850303136342L;
        ii.zlc[84] = -4522935624495573947L;
        ii.zlc[85] = 5505888924355728781L;
        ii.zlc[86] = -4467920376863959457L;
        ii.zlc[87] = -3061948061308299565L;
        ii.zlc[88] = 1780261929738990620L;
        ii.zlc[89] = -1914112684370386147L;
        ii.zlc[90] = -7480796139584958757L;
        ii.zlc[91] = -6625357312251231155L;
        ii.zlc[92] = -4954598990488167616L;
        ii.zlc[93] = -1902519929507526067L;
        ii.zlc[94] = 6383447111882967175L;
        ii.zlc[95] = 5406451747008287483L;
        ii.zlc[96] = -6205849299154952632L;
        ii.zlc[97] = 2966313928330558407L;
        ii.zlc[98] = 3389153041114211764L;
        ii.zlc[99] = -7916871499302710313L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float[] deflectStep(float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ii.bk - ii.zle("abdi", zlb(int ), (int)92)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ii.zle("abdj", zlk(int ), (int)903)) break;
            v0 /* !! */  = (long)ii.zle("abdk", zlk(int ), (int)904);
        }
        var15_7 = ii.c;
        v1 /* !! */  = ii.bk;
        if (true) ** GOTO lbl11
        block37: while (true) {
            v1 /* !! */  = (long)(ii.zle("abdm", zlb(int ), (int)94) - ii.zle("abdl", zlb(int ), (int)93));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 1109002785: {
                    break block37;
                }
                case 2136203914: {
                    continue block37;
                }
            }
            break;
        }
        var14_8 /* !! */  = ii.b;
        if (var14_8 /* !! */  == 0) ** GOTO lbl-1000
        switch (var14_8 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = ii.bk;
                if (true) ** GOTO lbl24
                block38: while (true) {
                    v2 /* !! */  = (long)(v3 - ii.zle("abdn", zlb(int ), (int)95));
lbl24:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case 310006577: {
                            v3 = ii.zle("abdo", zlb(int ), (int)96);
                            continue block38;
                        }
                        case 344872542: {
                            v3 = ii.zle("abdp", zlb(int ), (int)97);
                            continue block38;
                        }
                        case 1109002785: {
                            break block38;
                        }
                        case 1674485369: {
                            v3 = ii.zle("abdq", zlb(int ), (int)98);
                            continue block38;
                        }
                    }
                    break;
                }
                var13_9 = ii.a;
                if (var15_7) {
                    throw null;
lbl39:
                    // 7 sources

                    return null;
                }
                if (var13_9 || var13_9) ** GOTO lbl39
                var7_10 = var1_1 / (var3_3 + ii.zle("abdr", zlg(int ), (int)905));
                if (var13_9 || var13_9) ** GOTO lbl39
                var8_11 = var2_2 / (var3_3 + ii.zle("abds", zlg(int ), (int)906));
                if (var13_9 || var13_9) ** GOTO lbl39
                v4 = var5_5;
                v5 = var6_6;
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = ii.bk - ii.zle("abdt", zlb(int ), (int)99)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ii.zle("abdu", zlk(int ), (int)907)) break;
                    v6 /* !! */  = (long)ii.zle("abdv", zlk(int ), (int)908);
                }
                var9_12 = (float)Math.hypot(v4, v5);
                if (var13_9 || var13_9) ** GOTO lbl39
                v7 = ii.zle("abdw", zlg(int ), (int)909);
                v8 = ii.zle("abdx", zlg(int ), (int)910);
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = ii.bk - ii.zle("abdy", zlb(int ), (int)100)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == ii.zle("abdz", zlk(int ), (int)911)) break;
                    v9 /* !! */  = (long)ii.zle("abea", zlk(int ), (int)912);
                }
                v10 = this.lerp((float)v7, (float)v8);
                v11 = (var4_4 - ii.zle("abeb", zlg(int ), (int)913)) / ii.zle("abec", zlg(int ), (int)914);
                v12 /* !! */  = ii.bk;
                if (true) ** GOTO lbl68
                block42: while (true) {
                    v12 /* !! */  = (long)(ii.zle("abee", zlb(int ), (int)102) - ii.zle("abed", zlb(int ), (int)101));
lbl68:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -527447640: {
                            continue block42;
                        }
                        case 1109002785: {
                            break block42;
                        }
                    }
                    break;
                }
                var10_13 = v10 * class_3532.method_15363((float)v11, (float)0.0f, (float)1.0f);
                if (var13_9 || var13_9) ** GOTO lbl39
                v13 = ii.zle("abef", zlg(int ), (int)915);
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_3 = ii.bk - ii.zle("abeg", zlb(int ), (int)103)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == ii.zle("abeh", zlk(int ), (int)916)) break;
                    v14 /* !! */  = (long)ii.zle("abei", zlk(int ), (int)917);
                }
                var11_14 = var5_5 - var7_10 * var9_12 * var10_13 - var8_11 * this.lerp((float)v13, 1.0f);
                if (var13_9 || var13_9) ** GOTO lbl39
                v15 = ii.zle("abej", zlg(int ), (int)918);
                v16 = ii.zle("abek", zlg(int ), (int)919);
                v17 /* !! */  = ii.bk;
                if (true) ** GOTO lbl89
                block44: while (true) {
                    v17 /* !! */  = (long)(ii.zle("abem", zlb(int ), (int)105) - ii.zle("abel", zlb(int ), (int)104));
lbl89:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -1638350532: {
                            continue block44;
                        }
                        case 1109002785: {
                            break block44;
                        }
                    }
                    break;
                }
                var12_15 = var6_6 - var8_11 * var9_12 * var10_13 + var7_10 * this.lerp((float)v15, (float)v16) * ii.zle("aben", zlg(int ), (int)920);
                if (var13_9 || var13_9) ** continue;
                return new float[]{var11_14, var12_15};
            }
            case 0: {
                var14_8 /* !! */  = (int)ii.zle("abeo", zlk(int ), (int)921);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl102:
            // 2 sources

            case 1: {
                var14_8 /* !! */  = (int)ii.zle("abep", zlk(int ), (int)922);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl144
            }
            case 2: {
                var14_8 /* !! */  = (int)ii.zle("abeq", zlk(int ), (int)923);
                if (var15_7) {
                    throw null;
                }
            }
lbl111:
            // 5 sources

            case 3: {
                var14_8 /* !! */  = (int)ii.zle("aber", zlk(int ), (int)924);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl154
            }
            case 4: {
                var14_8 /* !! */  = (int)ii.zle("abes", zlk(int ), (int)925);
                if (!var15_7) ** GOTO lbl102
                throw null;
            }
lbl120:
            // 2 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var14_8 /* !! */  = (int)ii.zle("abet", zlk(int ), (int)926);
                    if (!var15_7) ** GOTO lbl111
                    throw null;
                }
            }
            case 6: {
                var14_8 /* !! */  = (int)ii.zle("abeu", zlk(int ), (int)927);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl154
            }
            case 7: {
                var14_8 /* !! */  = (int)ii.zle("abev", zlk(int ), (int)928);
                if (!var15_7) ** GOTO lbl111
                throw null;
            }
lbl134:
            // 2 sources

            case 8: {
                var14_8 /* !! */  = (int)ii.zle("abew", zlk(int ), (int)929);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl144
            }
            case 9: {
                var14_8 /* !! */  = (int)ii.zle("abex", zlk(int ), (int)930);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl144:
            // 3 sources

            case 10: {
                var14_8 /* !! */  = (int)ii.zle("abey", zlk(int ), (int)931);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl162
            }
lbl149:
            // 2 sources

            case 11: {
                do {
                    var14_8 /* !! */  = (int)ii.zle("abez", zlk(int ), (int)932);
                } while (!var15_7);
                throw null;
            }
lbl154:
            // 4 sources

            case 12: {
                var14_8 /* !! */  = (int)ii.zle("abfa", zlk(int ), (int)933);
                if (var15_7) {
                    throw null;
                }
            }
            case 13: {
                var14_8 /* !! */  = (int)ii.zle("abfb", zlk(int ), (int)934);
                if (!var15_7) ** GOTO lbl120
                throw null;
            }
lbl162:
            // 2 sources

            case 14: {
                var14_8 /* !! */  = (int)ii.zle("abfc", zlk(int ), (int)935);
                if (!var15_7) ** GOTO lbl134
                throw null;
            }
            case 15: 
        }
        var14_8 /* !! */  = (int)ii.zle("abfd", zlk(int ), (int)936);
        ** while (!var15_7)
lbl169:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void absc() {
        ii.zli[300] = -1130770446;
        ii.zli[301] = -2019319093;
        ii.zli[302] = -261238342;
        ii.zli[303] = 1691572810;
        ii.zli[304] = 1382686250;
        ii.zli[305] = -1003683136;
        ii.zli[306] = -1823852605;
        ii.zli[307] = -1780127753;
        ii.zli[308] = 869000861;
        ii.zli[309] = 47873989;
        ii.zli[310] = 1118227411;
        ii.zli[311] = 1669223406;
        ii.zli[312] = -943307218;
        ii.zli[313] = 1674583466;
        ii.zli[314] = -1899841660;
        ii.zli[315] = 2048216665;
        ii.zli[316] = -1802626340;
        ii.zli[317] = -1932974950;
        ii.zli[318] = 1209629377;
        ii.zli[319] = 1196658509;
        ii.zli[320] = 1252614672;
        ii.zli[321] = -2129575754;
        ii.zli[322] = -2112708320;
        ii.zli[323] = -2085940773;
        ii.zli[324] = 881615063;
        ii.zli[325] = -10667073;
        ii.zli[326] = -2086485914;
        ii.zli[327] = -2091136739;
        ii.zli[328] = -521413522;
        ii.zli[329] = -1803379914;
        ii.zli[330] = -1030953027;
        ii.zli[331] = -2132431513;
        ii.zli[332] = 245586842;
        ii.zli[333] = 2068015769;
        ii.zli[334] = 2119807211;
        ii.zli[335] = 1307927898;
        ii.zli[336] = -703057708;
        ii.zli[337] = 1296958161;
        ii.zli[338] = -195302188;
        ii.zli[339] = 1056249690;
        ii.zli[340] = -552189655;
        ii.zli[341] = -366760094;
        ii.zli[342] = 221386155;
        ii.zli[343] = 732173003;
        ii.zli[344] = -2055718138;
        ii.zli[345] = 1253964802;
        ii.zli[346] = -1490445951;
        ii.zli[347] = 1302076658;
        ii.zli[348] = -1489208519;
        ii.zli[349] = -1730343946;
        ii.zli[350] = -848165701;
        ii.zli[351] = -899554513;
        ii.zli[352] = -540607904;
        ii.zli[353] = 79898357;
        ii.zli[354] = 708185568;
        ii.zli[355] = -2011202502;
        ii.zli[356] = -836931868;
        ii.zli[357] = -1740610034;
        ii.zli[358] = 2048461491;
        ii.zli[359] = 1471101358;
        ii.zli[360] = 1366235686;
        ii.zli[361] = 1121045192;
        ii.zli[362] = 829301380;
        ii.zli[363] = 566463947;
        ii.zli[364] = 1680848120;
        ii.zli[365] = -411556726;
        ii.zli[366] = -1560292926;
        ii.zli[367] = 1317079415;
        ii.zli[368] = 915418959;
        ii.zli[369] = -263362499;
        ii.zli[370] = 110334677;
        ii.zli[371] = 1353430662;
        ii.zli[372] = 1586968374;
        ii.zli[373] = -752525777;
        ii.zli[374] = 1405009962;
        ii.zli[375] = -673623494;
        ii.zli[376] = -1043940604;
        ii.zli[377] = 1609615930;
        ii.zli[378] = -245431410;
        ii.zli[379] = 875441165;
        ii.zli[380] = 291166929;
        ii.zli[381] = 1667789348;
        ii.zli[382] = 1012524736;
        ii.zli[383] = 1916972205;
        ii.zli[384] = -771621595;
        ii.zli[385] = -2131253687;
        ii.zli[386] = 913070400;
        ii.zli[387] = 1932249415;
        ii.zli[388] = 1773468402;
        ii.zli[389] = 1815359607;
        ii.zli[390] = -1324597395;
        ii.zli[391] = 327214856;
        ii.zli[392] = 1028757188;
        ii.zli[393] = 1185664280;
        ii.zli[394] = -1108648242;
        ii.zli[395] = 1759376096;
        ii.zli[396] = -1559710922;
        ii.zli[397] = -1465019754;
        ii.zli[398] = 1741437871;
        ii.zli[399] = 1342747016;
    }

    private static /* synthetic */ void abrv() {
        ii.zlh[800] = -12100878;
        ii.zlh[801] = 233524475;
        ii.zlh[802] = -120047995;
        ii.zlh[803] = -1338311073;
        ii.zlh[804] = -2135936002;
        ii.zlh[805] = 672031665;
        ii.zlh[806] = 1018594715;
        ii.zlh[807] = -1398355637;
        ii.zlh[808] = -610185186;
        ii.zlh[809] = 1578436575;
        ii.zlh[810] = 1277767305;
        ii.zlh[811] = -1025672702;
        ii.zlh[812] = 1267741009;
        ii.zlh[813] = -1383269081;
        ii.zlh[814] = -1442434134;
        ii.zlh[815] = 1525105503;
        ii.zlh[816] = -250051761;
        ii.zlh[817] = -1213078391;
        ii.zlh[818] = -1850050959;
        ii.zlh[819] = -1752966635;
        ii.zlh[820] = 1014444535;
        ii.zlh[821] = -1144290602;
        ii.zlh[822] = 503449605;
        ii.zlh[823] = -1153847295;
        ii.zlh[824] = 1504654819;
        ii.zlh[825] = -468957869;
        ii.zlh[826] = -141638788;
        ii.zlh[827] = 1044614171;
        ii.zlh[828] = -1536126223;
        ii.zlh[829] = 1704027889;
        ii.zlh[830] = -2144548299;
        ii.zlh[831] = 628526891;
        ii.zlh[832] = -1905445320;
        ii.zlh[833] = 307777686;
        ii.zlh[834] = 1876538970;
        ii.zlh[835] = -2091458375;
        ii.zlh[836] = -1253133720;
        ii.zlh[837] = -1559025459;
        ii.zlh[838] = -79915398;
        ii.zlh[839] = 1932628396;
        ii.zlh[840] = -1858404797;
        ii.zlh[841] = 1493214568;
        ii.zlh[842] = 1530528502;
        ii.zlh[843] = 645295398;
        ii.zlh[844] = 151370533;
        ii.zlh[845] = 864653095;
        ii.zlh[846] = -46076961;
        ii.zlh[847] = -1628125444;
        ii.zlh[848] = -384915513;
        ii.zlh[849] = 78158096;
        ii.zlh[850] = -1465785206;
        ii.zlh[851] = -1991606006;
        ii.zlh[852] = 1017462757;
        ii.zlh[853] = 1212640272;
        ii.zlh[854] = 2014055752;
        ii.zlh[855] = -100345926;
        ii.zlh[856] = -1697337255;
        ii.zlh[857] = 396047;
        ii.zlh[858] = -194517156;
        ii.zlh[859] = -102323509;
        ii.zlh[860] = -973430055;
        ii.zlh[861] = -1802503728;
        ii.zlh[862] = -923161457;
        ii.zlh[863] = 985683304;
        ii.zlh[864] = 1824425860;
        ii.zlh[865] = 569688452;
        ii.zlh[866] = 624557109;
        ii.zlh[867] = -1434366726;
        ii.zlh[868] = 1109808289;
        ii.zlh[869] = -1011892160;
        ii.zlh[870] = -1200821147;
        ii.zlh[871] = 367793211;
        ii.zlh[872] = 216069829;
        ii.zlh[873] = -1184539328;
        ii.zlh[874] = 1659691247;
        ii.zlh[875] = -1680261016;
        ii.zlh[876] = 984472132;
        ii.zlh[877] = 1159335950;
        ii.zlh[878] = -224417033;
        ii.zlh[879] = 1300141990;
        ii.zlh[880] = 659312414;
        ii.zlh[881] = 1091164078;
        ii.zlh[882] = 140629374;
        ii.zlh[883] = 1006340988;
        ii.zlh[884] = -975918240;
        ii.zlh[885] = -728954822;
        ii.zlh[886] = 882713414;
        ii.zlh[887] = 532451682;
        ii.zlh[888] = 319319810;
        ii.zlh[889] = -1092512684;
        ii.zlh[890] = 1593615198;
        ii.zlh[891] = 1062937658;
        ii.zlh[892] = 1984288965;
        ii.zlh[893] = 578695485;
        ii.zlh[894] = 696376342;
        ii.zlh[895] = -910661064;
        ii.zlh[896] = -2137091022;
        ii.zlh[897] = -167312863;
        ii.zlh[898] = -2023492301;
        ii.zlh[899] = 1181534050;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ii() {
        var2_1 /* !! */  = ii.b;
        super("SpookyTime");
        this.random = new Random((long)(ii.zle("zlf", zlb(int ), (int)0) ^ System.nanoTime()));
        this.model = ms.get();
        this.lastRemYaw = (float)ii.zle("zlj", zlg(int ), (int)0);
        this.lastAttackCount = (int)ii.zle("zll", zlk(int ), (int)1);
        this.lastEntityId = (int)ii.zle("zlm", zlk(int ), (int)2);
        this.resetNoise();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl13:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)ii.zle("zln", zlk(int ), (int)3);
                    ** GOTO lbl23
                    break;
                }
            }
            case 1: {
                var2_1 /* !! */  = (int)ii.zle("zlo", zlk(int ), (int)4);
                ** GOTO lbl13
            }
            case 2: {
                var2_1 /* !! */  = (int)ii.zle("zlp", zlk(int ), (int)5);
                break;
            }
lbl23:
            // 2 sources

            case 3: {
                var2_1 /* !! */  = (int)ii.zle("zlq", zlk(int ), (int)6);
            }
            case 4: {
                var2_1 /* !! */  = (int)ii.zle("zlr", zlk(int ), (int)7);
                ** GOTO lbl31
            }
            case 5: {
                var2_1 /* !! */  = (int)ii.zle("zls", zlk(int ), (int)8);
                break;
            }
lbl31:
            // 3 sources

            case 6: {
                var2_1 /* !! */  = (int)ii.zle("zlt", zlk(int ), (int)9);
                break;
            }
            case 7: {
                var2_1 /* !! */  = (int)ii.zle("zlu", zlk(int ), (int)10);
                ** GOTO lbl31
            }
            case 8: 
        }
        var2_1 /* !! */  = (int)ii.zle("zlv", zlk(int ), (int)11);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void resetNoise() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ii.bk - ii.zle("zlw", zlb(int ), (int)1)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ii.zle("zlx", zlk(int ), (int)12)) break;
            v0 /* !! */  = (long)ii.zle("zly", zlk(int ), (int)13);
        }
        var3_1 = ii.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ii.bk - ii.zle("zlz", zlb(int ), (int)2)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ii.zle("zma", zlk(int ), (int)14)) break;
            v1 /* !! */  = (long)ii.zle("zmb", zlk(int ), (int)15);
        }
        var2_2 /* !! */  = ii.b;
        v2 /* !! */  = ii.bk;
        if (true) ** GOTO lbl17
        block41: while (true) {
            v2 /* !! */  = (long)(v3 - ii.zle("zmc", zlb(int ), (int)3));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -112541078: {
                    v3 = ii.zle("zmd", zlb(int ), (int)4);
                    continue block41;
                }
                case 1109002785: {
                    break block41;
                }
                case 1459373671: {
                    v3 = ii.zle("zme", zlb(int ), (int)5);
                    continue block41;
                }
            }
            break;
        }
        var1_3 = ii.a;
        if (var3_1) {
            throw null;
lbl29:
            // 6 sources

            return;
        }
        if (var1_3) ** GOTO lbl29
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl29
                v4 /* !! */  = ii.bk;
                if (true) ** GOTO lbl40
                block43: while (true) {
                    v4 /* !! */  = (long)(v5 - ii.zle("zmf", zlb(int ), (int)6));
lbl40:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1915365648: {
                            v5 = ii.zle("zmg", zlb(int ), (int)7);
                            continue block43;
                        }
                        case -1018196572: {
                            v5 = ii.zle("zmh", zlb(int ), (int)8);
                            continue block43;
                        }
                        case 823068051: {
                            v5 = ii.zle("zmi", zlb(int ), (int)9);
                            continue block43;
                        }
                        case 1109002785: {
                            break block43;
                        }
                    }
                    break;
                }
                v6 = this.randGauss();
                v7 /* !! */  = ii.bk;
                if (true) ** GOTO lbl57
                block44: while (true) {
                    v7 /* !! */  = (long)(v8 - ii.zle("zmj", zlb(int ), (int)10));
lbl57:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1675555957: {
                            v8 = ii.zle("zmk", zlb(int ), (int)11);
                            continue block44;
                        }
                        case -822448066: {
                            v8 = ii.zle("zml", zlb(int ), (int)12);
                            continue block44;
                        }
                        case 832560727: {
                            v8 = ii.zle("zmm", zlb(int ), (int)13);
                            continue block44;
                        }
                        case 1109002785: {
                            break block44;
                        }
                    }
                    break;
                }
                this.noiseYaw = v6;
                if (var1_3 || var1_3) ** GOTO lbl29
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = ii.bk - ii.zle("zmn", zlb(int ), (int)14)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == ii.zle("zmo", zlk(int ), (int)16)) break;
                    v9 /* !! */  = (long)ii.zle("zmp", zlk(int ), (int)17);
                }
                v10 = this.randGauss();
                v11 /* !! */  = ii.bk;
                if (true) ** GOTO lbl81
                block46: while (true) {
                    v11 /* !! */  = (long)(ii.zle("zmr", zlb(int ), (int)16) - ii.zle("zmq", zlb(int ), (int)15));
lbl81:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case 908201110: {
                            continue block46;
                        }
                        case 1109002785: {
                            break block46;
                        }
                    }
                    break;
                }
                this.noisePitch = v10;
                if (var1_3 || var1_3) ** GOTO lbl29
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_3 = ii.bk - ii.zle("zms", zlb(int ), (int)17)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == ii.zle("zmt", zlk(int ), (int)18)) break;
                    v12 /* !! */  = (long)ii.zle("zmu", zlk(int ), (int)19);
                }
                v13 = this.randGauss();
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_4 = ii.bk - ii.zle("zmv", zlb(int ), (int)18)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == ii.zle("zmw", zlk(int ), (int)20)) break;
                    v14 /* !! */  = (long)ii.zle("zmx", zlk(int ), (int)21);
                }
                this.wanderYaw = v13;
                if (var1_3 || var1_3) ** GOTO lbl29
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_5 = ii.bk - ii.zle("zmy", zlb(int ), (int)19)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == ii.zle("zmz", zlk(int ), (int)22)) break;
                    v15 /* !! */  = (long)ii.zle("zna", zlk(int ), (int)23);
                }
                v16 = this.randGauss();
                v17 /* !! */  = ii.bk;
                if (true) ** GOTO lbl111
                block50: while (true) {
                    v17 /* !! */  = (long)(ii.zle("znc", zlb(int ), (int)21) - ii.zle("znb", zlb(int ), (int)20));
lbl111:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -2146209649: {
                            continue block50;
                        }
                        case 1109002785: {
                            break block50;
                        }
                    }
                    break;
                }
                this.wanderPitch = v16;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl120:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)ii.zle("znd", zlk(int ), (int)24);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)ii.zle("zne", zlk(int ), (int)25);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl139
            }
            case 2: {
                var2_2 /* !! */  = (int)ii.zle("znf", zlk(int ), (int)26);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl135:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)ii.zle("zng", zlk(int ), (int)27);
                if (var3_1) {
                    throw null;
                }
            }
lbl139:
            // 4 sources

            case 4: {
                var2_2 /* !! */  = (int)ii.zle("znh", zlk(int ), (int)28);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl168
            }
            case 5: {
                var2_2 /* !! */  = (int)ii.zle("zni", zlk(int ), (int)29);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl149:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)ii.zle("znj", zlk(int ), (int)30);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl154:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)ii.zle("znk", zlk(int ), (int)31);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl164
            }
            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ii.zle("znl", zlk(int ), (int)32);
                    if (!var3_1) ** GOTO lbl135
                    throw null;
                }
            }
lbl164:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)ii.zle("znm", zlk(int ), (int)33);
                if (!var3_1) ** GOTO lbl149
                throw null;
            }
lbl168:
            // 4 sources

            case 10: {
                var2_2 /* !! */  = (int)ii.zle("znn", zlk(int ), (int)34);
                if (!var3_1) ** GOTO lbl120
                throw null;
            }
            case 11: 
        }
        var2_2 /* !! */  = (int)ii.zle("zno", zlk(int ), (int)35);
        ** while (!var3_1)
lbl175:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float lerp(float var1_1, float var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ii.bk - ii.zle("abpe", zlb(int ), (int)216)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ii.zle("abpf", zlk(int ), (int)1087)) break;
            v0 /* !! */  = (long)ii.zle("abpg", zlk(int ), (int)1088);
        }
        var5_3 = ii.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ii.bk - ii.zle("abph", zlb(int ), (int)217)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ii.zle("abpi", zlk(int ), (int)1089)) break;
            v1 /* !! */  = (long)ii.zle("abpj", zlk(int ), (int)1090);
        }
        var4_4 /* !! */  = ii.b;
        v2 /* !! */  = ii.bk;
        if (true) ** GOTO lbl19
        block22: while (true) {
            v2 /* !! */  = (long)(v3 - ii.zle("abpk", zlb(int ), (int)218));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1404583739: {
                    v3 = ii.zle("abpl", zlb(int ), (int)219);
                    continue block22;
                }
                case 340946107: {
                    v3 = ii.zle("abpm", zlb(int ), (int)220);
                    continue block22;
                }
                case 1109002785: {
                    break block22;
                }
            }
            break;
        }
        var3_5 = ii.a;
        if (!var5_3) ** GOTO lbl35
        throw null;
        {
            if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
            switch (var4_4 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (float)ii.zle("abpn", zlg(int ), (int)1091);
                }
lbl35:
                // 1 sources

                if (var3_5 || var3_5) continue block23;
                v4 /* !! */  = ii.bk;
                if (true) ** GOTO lbl40
                block24: while (true) {
                    v4 /* !! */  = (long)(ii.zle("abpp", zlb(int ), (int)222) - ii.zle("abpo", zlb(int ), (int)221));
lbl40:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1932626815: {
                            continue block24;
                        }
                        case 1109002785: {
                            break block24;
                        }
                    }
                    break;
                }
                v5 /* !! */  = ii.bk;
                if (true) ** GOTO lbl49
                block25: while (true) {
                    v5 /* !! */  = (long)(v6 - ii.zle("abpq", zlb(int ), (int)223));
lbl49:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -188413218: {
                            v6 = ii.zle("abpr", zlb(int ), (int)224);
                            continue block25;
                        }
                        case 1109002785: {
                            break block25;
                        }
                        case 1660446404: {
                            v6 = ii.zle("abps", zlb(int ), (int)225);
                            continue block25;
                        }
                    }
                    break;
                }
                return var1_1 + this.random.nextFloat() * (var2_2 - var1_1);
                case 0: {
                    var4_4 /* !! */  = (int)ii.zle("abpt", zlk(int ), (int)1092);
                    if (var5_3) {
                        throw null;
                    }
                    ** GOTO lbl69
                }
lbl64:
                // 2 sources

                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var4_4 /* !! */  = (int)ii.zle("abpu", zlk(int ), (int)1093);
                        if (!var5_3) ** GOTO lbl-1000
                        throw null;
                    }
                }
lbl69:
                // 2 sources

                case 2: {
                    var4_4 /* !! */  = (int)ii.zle("abpv", zlk(int ), (int)1094);
                    if (!var5_3) ** GOTO lbl64
                    throw null;
                }
                case 3: 
            }
        }
        var4_4 /* !! */  = (int)ii.zle("abpw", zlk(int ), (int)1095);
        ** while (!var5_3)
lbl76:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void abrx() {
        ii.zlh[1000] = 1956187792;
        ii.zlh[1001] = 1858548531;
        ii.zlh[1002] = 969086717;
        ii.zlh[1003] = -880701165;
        ii.zlh[1004] = -1676711016;
        ii.zlh[1005] = -1071611805;
        ii.zlh[1006] = -2053851826;
        ii.zlh[1007] = -1976706132;
        ii.zlh[1008] = 1982962484;
        ii.zlh[1009] = -1074822687;
        ii.zlh[1010] = -251531094;
        ii.zlh[1011] = 509390453;
        ii.zlh[1012] = -1609956451;
        ii.zlh[1013] = 568482567;
        ii.zlh[1014] = 1769874171;
        ii.zlh[1015] = -613000575;
        ii.zlh[1016] = 1797360470;
        ii.zlh[1017] = 13283;
        ii.zlh[1018] = -1622728058;
        ii.zlh[1019] = 1131127150;
        ii.zlh[1020] = -2026997876;
        ii.zlh[1021] = 391409569;
        ii.zlh[1022] = 1040829545;
        ii.zlh[1023] = 1682684577;
        ii.zlh[1024] = -53025510;
        ii.zlh[1025] = -2044307054;
        ii.zlh[1026] = 911566053;
        ii.zlh[1027] = 1194580503;
        ii.zlh[1028] = 1126903215;
        ii.zlh[1029] = 410960183;
        ii.zlh[1030] = -395080432;
        ii.zlh[1031] = 1129913698;
        ii.zlh[1032] = -672488375;
        ii.zlh[1033] = 903589087;
        ii.zlh[1034] = -875334562;
        ii.zlh[1035] = -865593712;
        ii.zlh[1036] = -1626307794;
        ii.zlh[1037] = -1762905561;
        ii.zlh[1038] = 1972602064;
        ii.zlh[1039] = 274602718;
        ii.zlh[1040] = 931015533;
        ii.zlh[1041] = -1650341408;
        ii.zlh[1042] = -1341297481;
        ii.zlh[1043] = -251876955;
        ii.zlh[1044] = -1175736810;
        ii.zlh[1045] = -334984024;
        ii.zlh[1046] = 1511868726;
        ii.zlh[1047] = 1353202557;
        ii.zlh[1048] = 1800308163;
        ii.zlh[1049] = 958263341;
        ii.zlh[1050] = -396612384;
        ii.zlh[1051] = -1781963668;
        ii.zlh[1052] = -548798732;
        ii.zlh[1053] = -286563551;
        ii.zlh[1054] = 277617789;
        ii.zlh[1055] = -942804419;
        ii.zlh[1056] = -2135522792;
        ii.zlh[1057] = -2137792688;
        ii.zlh[1058] = -1348365442;
        ii.zlh[1059] = -164406461;
        ii.zlh[1060] = -992740584;
        ii.zlh[1061] = -1238696061;
        ii.zlh[1062] = 1193895764;
        ii.zlh[1063] = -1116542665;
        ii.zlh[1064] = -441185086;
        ii.zlh[1065] = -1235413324;
        ii.zlh[1066] = -2038204290;
        ii.zlh[1067] = -1821169163;
        ii.zlh[1068] = -354201602;
        ii.zlh[1069] = 1918206076;
        ii.zlh[1070] = -313589218;
        ii.zlh[1071] = -1580441171;
        ii.zlh[1072] = -1210231529;
        ii.zlh[1073] = 1983798810;
        ii.zlh[1074] = -2091546950;
        ii.zlh[1075] = -1997225917;
        ii.zlh[1076] = 101679895;
        ii.zlh[1077] = 879216629;
        ii.zlh[1078] = -23029782;
        ii.zlh[1079] = 1254076802;
        ii.zlh[1080] = 794844173;
        ii.zlh[1081] = 1867938678;
        ii.zlh[1082] = 1557306512;
        ii.zlh[1083] = -297914017;
        ii.zlh[1084] = -1874735078;
        ii.zlh[1085] = -1036237527;
        ii.zlh[1086] = 1823437270;
        ii.zlh[1087] = 180441690;
        ii.zlh[1088] = 1821751127;
        ii.zlh[1089] = -1943521276;
        ii.zlh[1090] = -516455286;
        ii.zlh[1091] = 1834762207;
        ii.zlh[1092] = 494425323;
        ii.zlh[1093] = 2016016732;
        ii.zlh[1094] = 54726365;
        ii.zlh[1095] = 1500001982;
        ii.zlh[1096] = 1671427017;
        ii.zlh[1097] = 1530457159;
        ii.zlh[1098] = -911668841;
        ii.zlh[1099] = 1607250893;
    }

    private static /* synthetic */ void abrw() {
        ii.zlh[900] = -984052927;
        ii.zlh[901] = -2024692599;
        ii.zlh[902] = -1654987753;
        ii.zlh[903] = -996199144;
        ii.zlh[904] = -2018374503;
        ii.zlh[905] = 1769628162;
        ii.zlh[906] = 1709448637;
        ii.zlh[907] = 1392902033;
        ii.zlh[908] = -963595266;
        ii.zlh[909] = 184520606;
        ii.zlh[910] = 96343177;
        ii.zlh[911] = -2081888256;
        ii.zlh[912] = -1796363745;
        ii.zlh[913] = -918462841;
        ii.zlh[914] = 1190192587;
        ii.zlh[915] = -288251941;
        ii.zlh[916] = 2130952112;
        ii.zlh[917] = -177825365;
        ii.zlh[918] = -515140532;
        ii.zlh[919] = 1176917908;
        ii.zlh[920] = -1441682311;
        ii.zlh[921] = -1544360106;
        ii.zlh[922] = -265408869;
        ii.zlh[923] = 374443323;
        ii.zlh[924] = 144073165;
        ii.zlh[925] = -1664431832;
        ii.zlh[926] = -335697485;
        ii.zlh[927] = 2095975420;
        ii.zlh[928] = -261291393;
        ii.zlh[929] = -1791506238;
        ii.zlh[930] = 126591092;
        ii.zlh[931] = -20015564;
        ii.zlh[932] = 517634018;
        ii.zlh[933] = -342840036;
        ii.zlh[934] = -600777983;
        ii.zlh[935] = 258494511;
        ii.zlh[936] = -2034681917;
        ii.zlh[937] = 1273931182;
        ii.zlh[938] = 1132772491;
        ii.zlh[939] = -1063945064;
        ii.zlh[940] = -238066834;
        ii.zlh[941] = -1164302116;
        ii.zlh[942] = 1778898876;
        ii.zlh[943] = 1834272572;
        ii.zlh[944] = 1775417328;
        ii.zlh[945] = 217353555;
        ii.zlh[946] = -386100588;
        ii.zlh[947] = 648884636;
        ii.zlh[948] = -503028897;
        ii.zlh[949] = 1534522975;
        ii.zlh[950] = 1419986000;
        ii.zlh[951] = -1272319659;
        ii.zlh[952] = -217121870;
        ii.zlh[953] = -158828093;
        ii.zlh[954] = -1667508689;
        ii.zlh[955] = -84369701;
        ii.zlh[956] = -1034955073;
        ii.zlh[957] = 1843516761;
        ii.zlh[958] = -877798558;
        ii.zlh[959] = 624136410;
        ii.zlh[960] = -744361773;
        ii.zlh[961] = 1165808718;
        ii.zlh[962] = -227197861;
        ii.zlh[963] = 1221795112;
        ii.zlh[964] = -608979537;
        ii.zlh[965] = -1954909547;
        ii.zlh[966] = 1147916552;
        ii.zlh[967] = 1142247327;
        ii.zlh[968] = 2137061181;
        ii.zlh[969] = 1734313250;
        ii.zlh[970] = 833730104;
        ii.zlh[971] = -1811426050;
        ii.zlh[972] = 589616792;
        ii.zlh[973] = -1681846895;
        ii.zlh[974] = 1150393425;
        ii.zlh[975] = 930184112;
        ii.zlh[976] = -1808927299;
        ii.zlh[977] = -1517375504;
        ii.zlh[978] = 405784936;
        ii.zlh[979] = 2053796800;
        ii.zlh[980] = -877101448;
        ii.zlh[981] = -1182971091;
        ii.zlh[982] = -2008620072;
        ii.zlh[983] = 1990377058;
        ii.zlh[984] = 451687833;
        ii.zlh[985] = -1027219456;
        ii.zlh[986] = 528341900;
        ii.zlh[987] = 1109495897;
        ii.zlh[988] = -156496253;
        ii.zlh[989] = 1124803655;
        ii.zlh[990] = 1187218002;
        ii.zlh[991] = 1370533751;
        ii.zlh[992] = -1616384065;
        ii.zlh[993] = 863660041;
        ii.zlh[994] = -1714312328;
        ii.zlh[995] = -2049766801;
        ii.zlh[996] = -1965514790;
        ii.zlh[997] = -513625774;
        ii.zlh[998] = 79881209;
        ii.zlh[999] = 1364594901;
    }

    private static /* synthetic */ void absn() {
        ii.zlc[200] = -1183119517944714607L;
        ii.zlc[201] = 2279575165708693787L;
        ii.zlc[202] = -7595800398285288780L;
        ii.zlc[203] = -1253707990012465734L;
        ii.zlc[204] = -8115481752141539580L;
        ii.zlc[205] = -7722627427483600255L;
        ii.zlc[206] = -8415879243373163559L;
        ii.zlc[207] = -6485438555871443260L;
        ii.zlc[208] = -7488140835367551196L;
        ii.zlc[209] = -4191673431094296658L;
        ii.zlc[210] = 6355276748049202883L;
        ii.zlc[211] = 4950474555322359300L;
        ii.zlc[212] = -1477078599353829325L;
        ii.zlc[213] = -5304703123197720267L;
        ii.zlc[214] = -2248347225926452811L;
        ii.zlc[215] = 4506408013645895591L;
        ii.zlc[216] = 1347516543389321708L;
        ii.zlc[217] = -1573084315030327631L;
        ii.zlc[218] = -8001201929941807374L;
        ii.zlc[219] = 6310349869505636490L;
        ii.zlc[220] = -2362665282316593779L;
        ii.zlc[221] = -7107322187365580980L;
        ii.zlc[222] = 7176817391878077155L;
        ii.zlc[223] = 1011559895039679352L;
        ii.zlc[224] = -5213405750615046380L;
        ii.zlc[225] = -1258674677859860166L;
        ii.zlc[226] = -2817465924671530837L;
        ii.zlc[227] = 3222399668357430586L;
        ii.zlc[228] = -5237737628250220026L;
        ii.zlc[229] = 3555895969591448067L;
        ii.zlc[230] = -1825035788702364L;
        ii.zlc[231] = -7411725177186993710L;
        ii.zlc[232] = -7579707956495079230L;
        ii.zlc[233] = -9189213506523385816L;
        ii.zlc[234] = 8993837531533762269L;
        ii.zlc[235] = 6522912891829584951L;
        ii.zlc[236] = -6567712129143465861L;
        ii.zlc[237] = 2956393994313912959L;
        ii.zlc[238] = -5826605568801204689L;
        ii.zlc[239] = 6793635619847283292L;
        ii.zlc[240] = 8718802917700742952L;
        ii.zlc[241] = 4808441098797081039L;
        ii.zlc[242] = 964846225811912935L;
        ii.zlc[243] = -2278068100760925520L;
        ii.zlc[244] = 1025045358753594218L;
        ii.zlc[245] = -5062119086429925513L;
        ii.zlc[246] = -2542215717054889915L;
        ii.zlc[247] = 7228477879450719840L;
    }

    private static /* synthetic */ void absj() {
        ii.zli[1000] = 1956187785;
        ii.zli[1001] = 1858548501;
        ii.zli[1002] = 969086693;
        ii.zli[1003] = -880701130;
        ii.zli[1004] = -1676710998;
        ii.zli[1005] = -1071611803;
        ii.zli[1006] = -2053851778;
        ii.zli[1007] = 1976706131;
        ii.zli[1008] = -1020710501;
        ii.zli[1009] = 1074822686;
        ii.zli[1010] = -215686291;
        ii.zli[1011] = 551985655;
        ii.zli[1012] = 1609956450;
        ii.zli[1013] = 590085314;
        ii.zli[1014] = 1769874169;
        ii.zli[1015] = -613000574;
        ii.zli[1016] = 1797360470;
        ii.zli[1017] = 13281;
        ii.zli[1018] = -1622728061;
        ii.zli[1019] = 1131127146;
        ii.zli[1020] = 2026997875;
        ii.zli[1021] = 1828242199;
        ii.zli[1022] = -1040829546;
        ii.zli[1023] = -1122343323;
        ii.zli[1024] = 53025509;
        ii.zli[1025] = 96871670;
        ii.zli[1026] = -911566054;
        ii.zli[1027] = 1795918642;
        ii.zli[1028] = -44110048;
        ii.zli[1029] = 649686819;
        ii.zli[1030] = 1443254175;
        ii.zli[1031] = 2107552630;
        ii.zli[1032] = 672488374;
        ii.zli[1033] = 50077220;
        ii.zli[1034] = 1989668856;
        ii.zli[1035] = -241314785;
        ii.zli[1036] = 1626307793;
        ii.zli[1037] = -1258943586;
        ii.zli[1038] = -1972602065;
        ii.zli[1039] = -2012388123;
        ii.zli[1040] = -1975865141;
        ii.zli[1041] = 1650341407;
        ii.zli[1042] = -197309487;
        ii.zli[1043] = -855020758;
        ii.zli[1044] = 1175736809;
        ii.zli[1045] = 1383961067;
        ii.zli[1046] = -1511868727;
        ii.zli[1047] = 1236221315;
        ii.zli[1048] = -700758196;
        ii.zli[1049] = -958263342;
        ii.zli[1050] = -2118261617;
        ii.zli[1051] = -1455642909;
        ii.zli[1052] = 548798731;
        ii.zli[1053] = 1991247068;
        ii.zli[1054] = -277617790;
        ii.zli[1055] = 45400639;
        ii.zli[1056] = 1024808210;
        ii.zli[1057] = -1120925606;
        ii.zli[1058] = 1348365441;
        ii.zli[1059] = -1254254408;
        ii.zli[1060] = -992740592;
        ii.zli[1061] = -1238696062;
        ii.zli[1062] = 1193895769;
        ii.zli[1063] = -1116542658;
        ii.zli[1064] = -441185088;
        ii.zli[1065] = -1235413319;
        ii.zli[1066] = -2038204294;
        ii.zli[1067] = -1821169162;
        ii.zli[1068] = -354201610;
        ii.zli[1069] = 1918206078;
        ii.zli[1070] = -313589231;
        ii.zli[1071] = -1580441175;
        ii.zli[1072] = -1210231534;
        ii.zli[1073] = 1983798813;
        ii.zli[1074] = -2091546951;
        ii.zli[1075] = -1997225910;
        ii.zli[1076] = -101679896;
        ii.zli[1077] = 471261019;
        ii.zli[1078] = 23029781;
        ii.zli[1079] = 1139517771;
        ii.zli[1080] = 272205556;
        ii.zli[1081] = -1867938679;
        ii.zli[1082] = -589773628;
        ii.zli[1083] = -297914020;
        ii.zli[1084] = -1874735077;
        ii.zli[1085] = -1036237525;
        ii.zli[1086] = 1823437268;
        ii.zli[1087] = -180441691;
        ii.zli[1088] = 114534936;
        ii.zli[1089] = 1943521275;
        ii.zli[1090] = 1891364058;
        ii.zli[1091] = 1405632711;
        ii.zli[1092] = 494425322;
        ii.zli[1093] = 2016016733;
        ii.zli[1094] = 54726364;
        ii.zli[1095] = 1500001982;
        ii.zli[1096] = -1671427018;
        ii.zli[1097] = -2119394927;
        ii.zli[1098] = 911668840;
        ii.zli[1099] = 667047590;
    }

    public static /* synthetic */ CallSite zle(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void abry() {
        ii.zlh[1100] = 83603127;
        ii.zlh[1101] = -125739496;
        ii.zlh[1102] = -318760668;
        ii.zlh[1103] = -566397908;
        ii.zlh[1104] = -1483044441;
        ii.zlh[1105] = -921379264;
        ii.zlh[1106] = -851209067;
        ii.zlh[1107] = -2070764952;
        ii.zlh[1108] = 280121965;
        ii.zlh[1109] = -1841360760;
        ii.zlh[1110] = -2106194882;
        ii.zlh[1111] = -1361511437;
        ii.zlh[1112] = 74528818;
        ii.zlh[1113] = 1152128489;
        ii.zlh[1114] = -12188535;
        ii.zlh[1115] = 389615661;
    }

    private static /* synthetic */ double zqq(int n2) {
        return Double.longBitsToDouble(zlc[n2] ^ zld[n2]);
    }

    private static /* synthetic */ void absk() {
        ii.zli[1100] = -83603128;
        ii.zli[1101] = 404271468;
        ii.zli[1102] = -318760667;
        ii.zli[1103] = 207722751;
        ii.zli[1104] = -1483044442;
        ii.zli[1105] = 1774259478;
        ii.zli[1106] = 851209066;
        ii.zli[1107] = 1153421837;
        ii.zli[1108] = -280121966;
        ii.zli[1109] = 624252355;
        ii.zli[1110] = -2106194885;
        ii.zli[1111] = -1361511438;
        ii.zli[1112] = 74528817;
        ii.zli[1113] = 1152128491;
        ii.zli[1114] = -12188533;
        ii.zli[1115] = 389615663;
    }

    private static /* synthetic */ void abrq() {
        ii.zlh[300] = -1130770457;
        ii.zlh[301] = -2019319087;
        ii.zlh[302] = -261238468;
        ii.zlh[303] = 1691572820;
        ii.zlh[304] = 1382686326;
        ii.zlh[305] = -1003683150;
        ii.zlh[306] = -1823852654;
        ii.zlh[307] = -1780127785;
        ii.zlh[308] = 869000890;
        ii.zlh[309] = 47874042;
        ii.zlh[310] = 1118227447;
        ii.zlh[311] = 1669223307;
        ii.zlh[312] = -943307147;
        ii.zlh[313] = 1674583458;
        ii.zlh[314] = -1899841788;
        ii.zlh[315] = -2048216666;
        ii.zlh[316] = 2047268499;
        ii.zlh[317] = 1932974949;
        ii.zlh[318] = -423189303;
        ii.zlh[319] = 2027079907;
        ii.zlh[320] = 1965565374;
        ii.zlh[321] = -1077523829;
        ii.zlh[322] = -1123280526;
        ii.zlh[323] = 2085940772;
        ii.zlh[324] = 79356945;
        ii.zlh[325] = -1047907966;
        ii.zlh[326] = -1128499148;
        ii.zlh[327] = 2091136738;
        ii.zlh[328] = 2010614947;
        ii.zlh[329] = 1803379913;
        ii.zlh[330] = -304766258;
        ii.zlh[331] = -1083803027;
        ii.zlh[332] = 824505742;
        ii.zlh[333] = 2068015769;
        ii.zlh[334] = 2119807210;
        ii.zlh[335] = -152732269;
        ii.zlh[336] = -703057707;
        ii.zlh[337] = 1296958170;
        ii.zlh[338] = -195302188;
        ii.zlh[339] = 1056249694;
        ii.zlh[340] = -552189635;
        ii.zlh[341] = -366760087;
        ii.zlh[342] = 221386171;
        ii.zlh[343] = 732172995;
        ii.zlh[344] = -2055718123;
        ii.zlh[345] = 1253964823;
        ii.zlh[346] = -1490445936;
        ii.zlh[347] = 1302076659;
        ii.zlh[348] = -1489208531;
        ii.zlh[349] = -1730343947;
        ii.zlh[350] = -848165713;
        ii.zlh[351] = -899554517;
        ii.zlh[352] = -540607903;
        ii.zlh[353] = 79898363;
        ii.zlh[354] = 708185570;
        ii.zlh[355] = -2011202504;
        ii.zlh[356] = -836931855;
        ii.zlh[357] = -1740610047;
        ii.zlh[358] = -1206842701;
        ii.zlh[359] = -1785775698;
        ii.zlh[360] = 325524006;
        ii.zlh[361] = 15846088;
        ii.zlh[362] = -257023356;
        ii.zlh[363] = -534540853;
        ii.zlh[364] = 636466424;
        ii.zlh[365] = -1499978614;
        ii.zlh[366] = -1736653907;
        ii.zlh[367] = 252774775;
        ii.zlh[368] = 150038753;
        ii.zlh[369] = -1321375683;
        ii.zlh[370] = 943556270;
        ii.zlh[371] = 1878678787;
        ii.zlh[372] = 1643950633;
        ii.zlh[373] = -327895638;
        ii.zlh[374] = 1825916213;
        ii.zlh[375] = -1766239686;
        ii.zlh[376] = -16091191;
        ii.zlh[377] = 1627129591;
        ii.zlh[378] = -832089502;
        ii.zlh[379] = 186835136;
        ii.zlh[380] = 778210109;
        ii.zlh[381] = 1571487096;
        ii.zlh[382] = 1012524737;
        ii.zlh[383] = 1290903454;
        ii.zlh[384] = -323826154;
        ii.zlh[385] = -1082840811;
        ii.zlh[386] = 2011978048;
        ii.zlh[387] = 1306985866;
        ii.zlh[388] = 1773468403;
        ii.zlh[389] = 1391902507;
        ii.zlh[390] = -1882279887;
        ii.zlh[391] = 738355284;
        ii.zlh[392] = 1028757189;
        ii.zlh[393] = 2017478663;
        ii.zlh[394] = -51683634;
        ii.zlh[395] = 1759376097;
        ii.zlh[396] = -496454858;
        ii.zlh[397] = -1465019753;
        ii.zlh[398] = 1741437867;
        ii.zlh[399] = 1342747018;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static float clampOvershoot(float var0, float var1_1, float var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ii.bk - ii.zle("abjm", zlb(int ), (int)148)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ii.zle("abjn", zlk(int ), (int)1007)) break;
            v0 /* !! */  = (long)ii.zle("abjo", zlk(int ), (int)1008);
        }
        var6_3 = ii.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ii.bk - ii.zle("abjp", zlb(int ), (int)149)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ii.zle("abjq", zlk(int ), (int)1009)) break;
            v1 /* !! */  = (long)ii.zle("abjr", zlk(int ), (int)1010);
        }
        var5_4 /* !! */  = ii.b;
        v2 /* !! */  = ii.bk;
        if (true) ** GOTO lbl19
        block21: while (true) {
            v2 /* !! */  = (long)(v3 - ii.zle("abjs", zlb(int ), (int)150));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2013063984: {
                    v3 = ii.zle("abjt", zlb(int ), (int)151);
                    continue block21;
                }
                case 606617925: {
                    v3 = ii.zle("abju", zlb(int ), (int)152);
                    continue block21;
                }
                case 1109002785: {
                    break block21;
                }
                case 1263674666: {
                    v3 = ii.zle("abjv", zlb(int ), (int)153);
                    continue block21;
                }
            }
            break;
        }
        var4_5 = ii.a;
        if (var6_3) {
            throw null;
lbl34:
            // 3 sources

            return (float)ii.zle("abjw", zlg(int ), (int)1011);
        }
        if (var4_5 || var4_5) ** GOTO lbl34
        v4 /* !! */  = ii.bk;
        if (true) ** GOTO lbl41
        block23: while (true) {
            v4 /* !! */  = (long)(v5 - ii.zle("abjx", zlb(int ), (int)154));
lbl41:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1425953699: {
                    v5 = ii.zle("abjy", zlb(int ), (int)155);
                    continue block23;
                }
                case 936112617: {
                    v5 = ii.zle("abjz", zlb(int ), (int)156);
                    continue block23;
                }
                case 1109002785: {
                    break block23;
                }
            }
            break;
        }
        var3_6 = Math.abs(var1_1);
        if (var4_5) ** GOTO lbl34
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var4_5) ** break;
                ** continue;
                v6 = -var3_6 * var2_2;
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = ii.bk - ii.zle("abka", zlb(int ), (int)157)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == ii.zle("abkb", zlk(int ), (int)1012)) break;
                    v7 /* !! */  = (long)ii.zle("abkc", zlk(int ), (int)1013);
                }
                return class_3532.method_15363((float)var0, (float)v6, (float)(var3_6 * var2_2));
            }
lbl65:
            // 2 sources

            case 0: {
                var5_4 /* !! */  = (int)ii.zle("abkd", zlk(int ), (int)1014);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl75
            }
            case 1: {
                do {
                    var5_4 /* !! */  = (int)ii.zle("abke", zlk(int ), (int)1015);
                } while (!var6_3);
                throw null;
            }
lbl75:
            // 2 sources

            case 2: {
                var5_4 /* !! */  = (int)ii.zle("abkf", zlk(int ), (int)1016);
                if (!var6_3) break;
                throw null;
            }
            case 3: {
                var5_4 /* !! */  = (int)ii.zle("abkg", zlk(int ), (int)1017);
                if (!var6_3) break;
                throw null;
            }
            case 4: {
                var5_4 /* !! */  = (int)ii.zle("abkh", zlk(int ), (int)1018);
                if (!var6_3) ** GOTO lbl65
                throw null;
            }
            case 5: 
        }
        do {
            var5_4 /* !! */  = (int)ii.zle("abki", zlk(int ), (int)1019);
        } while (!var6_3);
        throw null;
    }

    private static /* synthetic */ void absa() {
        ii.zli[100] = 1147497146;
        ii.zli[101] = 908265466;
        ii.zli[102] = -136560459;
        ii.zli[103] = 1488851556;
        ii.zli[104] = -1357655643;
        ii.zli[105] = 967529175;
        ii.zli[106] = -1433693439;
        ii.zli[107] = 377879700;
        ii.zli[108] = -133908665;
        ii.zli[109] = 214104113;
        ii.zli[110] = 276993129;
        ii.zli[111] = 1529569561;
        ii.zli[112] = 472753773;
        ii.zli[113] = 1091394484;
        ii.zli[114] = -88092268;
        ii.zli[115] = -1490181075;
        ii.zli[116] = -797704672;
        ii.zli[117] = -1040825299;
        ii.zli[118] = 2136811944;
        ii.zli[119] = -121391964;
        ii.zli[120] = 560753202;
        ii.zli[121] = 1732533092;
        ii.zli[122] = -919946441;
        ii.zli[123] = 795288630;
        ii.zli[124] = -476302547;
        ii.zli[125] = 1315903634;
        ii.zli[126] = 135547289;
        ii.zli[127] = 1585819995;
        ii.zli[128] = -1552979717;
        ii.zli[129] = 1659621455;
        ii.zli[130] = -928060139;
        ii.zli[131] = 2016045840;
        ii.zli[132] = 906966356;
        ii.zli[133] = 846399470;
        ii.zli[134] = 920218735;
        ii.zli[135] = -1473327910;
        ii.zli[136] = -131702415;
        ii.zli[137] = -1866654937;
        ii.zli[138] = 1024465861;
        ii.zli[139] = 1217599243;
        ii.zli[140] = -1921252603;
        ii.zli[141] = 749803511;
        ii.zli[142] = -1860217702;
        ii.zli[143] = -1412602045;
        ii.zli[144] = 643269741;
        ii.zli[145] = -1555368764;
        ii.zli[146] = -1241720013;
        ii.zli[147] = 2027115833;
        ii.zli[148] = -819954651;
        ii.zli[149] = 959218883;
        ii.zli[150] = 1044497697;
        ii.zli[151] = 1721374651;
        ii.zli[152] = -18872450;
        ii.zli[153] = 1964953245;
        ii.zli[154] = -532433633;
        ii.zli[155] = 1980069362;
        ii.zli[156] = 1366334605;
        ii.zli[157] = -2113951408;
        ii.zli[158] = -43679715;
        ii.zli[159] = -1979840277;
        ii.zli[160] = 629442406;
        ii.zli[161] = -806239405;
        ii.zli[162] = 925142940;
        ii.zli[163] = 1642828114;
        ii.zli[164] = 880445066;
        ii.zli[165] = -1855752195;
        ii.zli[166] = 1055495484;
        ii.zli[167] = 2069390719;
        ii.zli[168] = 1568357021;
        ii.zli[169] = -1159522521;
        ii.zli[170] = -1091017838;
        ii.zli[171] = 2018458550;
        ii.zli[172] = -305046180;
        ii.zli[173] = 1392345871;
        ii.zli[174] = -1539047361;
        ii.zli[175] = 424989866;
        ii.zli[176] = 152695757;
        ii.zli[177] = 2077116543;
        ii.zli[178] = 531186493;
        ii.zli[179] = 670255683;
        ii.zli[180] = 1141436343;
        ii.zli[181] = 1891013934;
        ii.zli[182] = -362571908;
        ii.zli[183] = 1642399393;
        ii.zli[184] = -1890454444;
        ii.zli[185] = 438480997;
        ii.zli[186] = 179613869;
        ii.zli[187] = 1497999199;
        ii.zli[188] = -1391709628;
        ii.zli[189] = 496753125;
        ii.zli[190] = -336508324;
        ii.zli[191] = -1540402917;
        ii.zli[192] = 1155763909;
        ii.zli[193] = -606162169;
        ii.zli[194] = -709737404;
        ii.zli[195] = -1319160010;
        ii.zli[196] = 1641581089;
        ii.zli[197] = 1871484453;
        ii.zli[198] = -99962914;
        ii.zli[199] = 1107581912;
    }

    private static /* synthetic */ void abru() {
        ii.zlh[700] = -881631965;
        ii.zlh[701] = -785083;
        ii.zlh[702] = 480501603;
        ii.zlh[703] = 590853298;
        ii.zlh[704] = 668034726;
        ii.zlh[705] = -1936746365;
        ii.zlh[706] = -2017492523;
        ii.zlh[707] = -1042590665;
        ii.zlh[708] = 2082571084;
        ii.zlh[709] = 1285853788;
        ii.zlh[710] = -497317364;
        ii.zlh[711] = -122105167;
        ii.zlh[712] = -510821280;
        ii.zlh[713] = -884548977;
        ii.zlh[714] = -149233968;
        ii.zlh[715] = -492151022;
        ii.zlh[716] = 1039761825;
        ii.zlh[717] = -2124276538;
        ii.zlh[718] = -406096409;
        ii.zlh[719] = -1845384339;
        ii.zlh[720] = 1744893486;
        ii.zlh[721] = 52237801;
        ii.zlh[722] = -2086683876;
        ii.zlh[723] = -53793673;
        ii.zlh[724] = 1644553876;
        ii.zlh[725] = 1903269383;
        ii.zlh[726] = -2036920401;
        ii.zlh[727] = 1238277019;
        ii.zlh[728] = -2003937079;
        ii.zlh[729] = 367420008;
        ii.zlh[730] = -429541238;
        ii.zlh[731] = -1879541083;
        ii.zlh[732] = 1009380033;
        ii.zlh[733] = -1652142743;
        ii.zlh[734] = -715273050;
        ii.zlh[735] = -1571774357;
        ii.zlh[736] = -1278380445;
        ii.zlh[737] = 335689954;
        ii.zlh[738] = 836761595;
        ii.zlh[739] = 845026055;
        ii.zlh[740] = -1724274148;
        ii.zlh[741] = 782358686;
        ii.zlh[742] = -101439114;
        ii.zlh[743] = 437825914;
        ii.zlh[744] = 1625083788;
        ii.zlh[745] = 1921082210;
        ii.zlh[746] = -1407746773;
        ii.zlh[747] = 1905094517;
        ii.zlh[748] = -118542562;
        ii.zlh[749] = 2027458045;
        ii.zlh[750] = 1900935040;
        ii.zlh[751] = -1419628948;
        ii.zlh[752] = 596428624;
        ii.zlh[753] = -655786705;
        ii.zlh[754] = -2040797428;
        ii.zlh[755] = 179465486;
        ii.zlh[756] = 1015434536;
        ii.zlh[757] = -939750822;
        ii.zlh[758] = 1912339768;
        ii.zlh[759] = 1588485106;
        ii.zlh[760] = 1791403137;
        ii.zlh[761] = 1687684093;
        ii.zlh[762] = -316377459;
        ii.zlh[763] = -1172696429;
        ii.zlh[764] = 1271483193;
        ii.zlh[765] = -141472774;
        ii.zlh[766] = -442633876;
        ii.zlh[767] = -1436418592;
        ii.zlh[768] = 794029028;
        ii.zlh[769] = 1279175126;
        ii.zlh[770] = -1051956754;
        ii.zlh[771] = 1109388342;
        ii.zlh[772] = 1688211339;
        ii.zlh[773] = 1811862424;
        ii.zlh[774] = 156393724;
        ii.zlh[775] = -1722962902;
        ii.zlh[776] = -1123836860;
        ii.zlh[777] = -1283125954;
        ii.zlh[778] = -2009738129;
        ii.zlh[779] = -65818989;
        ii.zlh[780] = -1369540888;
        ii.zlh[781] = -918384634;
        ii.zlh[782] = 1911005241;
        ii.zlh[783] = -1741746496;
        ii.zlh[784] = -1161070196;
        ii.zlh[785] = -441226728;
        ii.zlh[786] = -63373126;
        ii.zlh[787] = -1985711289;
        ii.zlh[788] = -603305689;
        ii.zlh[789] = -814808152;
        ii.zlh[790] = -210501105;
        ii.zlh[791] = 1120799444;
        ii.zlh[792] = 442144980;
        ii.zlh[793] = -547685888;
        ii.zlh[794] = -47190191;
        ii.zlh[795] = -893877139;
        ii.zlh[796] = 2139783817;
        ii.zlh[797] = 685418134;
        ii.zlh[798] = 738643212;
        ii.zlh[799] = 936826535;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private float randGauss() {
        while (true) {
            block31: {
                if ((v0 /* !! */  = (cfr_temp_0 = ii.bk - ii.zle("abok", zlb(int ), (int)207)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  != ii.zle("abol", zlk(int ), (int)1076)) break block31;
                var3_1 = ii.c;
                v1 /* !! */  = ii.bk;
                if (true) ** GOTO lbl13
            }
            v0 /* !! */  = (long)ii.zle("abom", zlk(int ), (int)1077);
        }
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - ii.zle("abon", zlb(int ), (int)208));
lbl13:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -458981367: {
                    v2 = ii.zle("aboo", zlb(int ), (int)209);
                    continue block17;
                }
                case 675538351: {
                    v2 = ii.zle("abop", zlb(int ), (int)210);
                    continue block17;
                }
                case 1109002785: {
                    break block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = ii.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ii.bk - ii.zle("aboq", zlb(int ), (int)211)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ii.zle("abor", zlk(int ), (int)1078)) {
                var1_3 = ii.a;
                if (var3_1) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)ii.zle("abos", zlk(int ), (int)1079);
        }
        if (var1_3 != false) return (float)ii.zle("abot", zlg(int ), (int)1080);
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 != false) return (float)ii.zle("abot", zlg(int ), (int)1080);
                v4 /* !! */  = ii.bk;
                block19: while (true) {
                    switch ((int)v4 /* !! */ ) {
                        case -1597107850: {
                            v5 = ii.zle("abov", zlb(int ), (int)213);
                            ** GOTO lbl46
                        }
                        case -1232467729: {
                            v5 = ii.zle("abow", zlb(int ), (int)214);
lbl46:
                            // 2 sources

                            v4 /* !! */  = (long)(v5 - ii.zle("abou", zlb(int ), (int)212));
                            continue block19;
                        }
                        case 1109002785: {
                            break block19;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = ii.bk - ii.zle("abox", zlb(int ), (int)215)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == ii.zle("aboy", zlk(int ), (int)1081)) {
                        return (float)this.random.nextGaussian();
                    }
                    v6 /* !! */  = (long)ii.zle("aboz", zlk(int ), (int)1082);
                }
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)ii.zle("abpa", zlk(int ), (int)1083);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                ** GOTO lbl68
            }
            case 3: {
                var2_2 /* !! */  = (int)ii.zle("abpd", zlk(int ), (int)1086);
                if (var3_1) {
                    throw null;
                }
lbl68:
                // 3 sources

                var2_2 /* !! */  = (int)ii.zle("abpb", zlk(int ), (int)1084);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: 
        }
        do {
            var2_2 /* !! */  = (int)ii.zle("abpc", zlk(int ), (int)1085);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void abrp() {
        ii.zlh[200] = -1972135589;
        ii.zlh[201] = -409960445;
        ii.zlh[202] = -1751604296;
        ii.zlh[203] = 1001376829;
        ii.zlh[204] = -2123897057;
        ii.zlh[205] = -21598062;
        ii.zlh[206] = 1129309464;
        ii.zlh[207] = 615374091;
        ii.zlh[208] = 200061172;
        ii.zlh[209] = -260152343;
        ii.zlh[210] = -465910241;
        ii.zlh[211] = -908842028;
        ii.zlh[212] = 1272164118;
        ii.zlh[213] = -1608365373;
        ii.zlh[214] = 1650375651;
        ii.zlh[215] = -249010565;
        ii.zlh[216] = 1893091668;
        ii.zlh[217] = -1806129466;
        ii.zlh[218] = 1991741204;
        ii.zlh[219] = -2076433939;
        ii.zlh[220] = -705005628;
        ii.zlh[221] = -1227642791;
        ii.zlh[222] = 1981102130;
        ii.zlh[223] = -1206239355;
        ii.zlh[224] = 1485542839;
        ii.zlh[225] = -602472922;
        ii.zlh[226] = -1193955018;
        ii.zlh[227] = -1687771284;
        ii.zlh[228] = -1791848221;
        ii.zlh[229] = -985880146;
        ii.zlh[230] = 1463116036;
        ii.zlh[231] = 1444501177;
        ii.zlh[232] = 813445300;
        ii.zlh[233] = 602115680;
        ii.zlh[234] = 444982810;
        ii.zlh[235] = -985001055;
        ii.zlh[236] = -908894508;
        ii.zlh[237] = -1626828305;
        ii.zlh[238] = -1740350299;
        ii.zlh[239] = -116246311;
        ii.zlh[240] = 1306569540;
        ii.zlh[241] = -2009761671;
        ii.zlh[242] = -1710918564;
        ii.zlh[243] = 920544544;
        ii.zlh[244] = 513771080;
        ii.zlh[245] = -645996610;
        ii.zlh[246] = -37822446;
        ii.zlh[247] = 1206001363;
        ii.zlh[248] = -1215507144;
        ii.zlh[249] = -662897857;
        ii.zlh[250] = -1302657330;
        ii.zlh[251] = 368808525;
        ii.zlh[252] = -900078118;
        ii.zlh[253] = -553584427;
        ii.zlh[254] = 100461955;
        ii.zlh[255] = 2037780189;
        ii.zlh[256] = 935978226;
        ii.zlh[257] = -100456229;
        ii.zlh[258] = 589812202;
        ii.zlh[259] = -201461946;
        ii.zlh[260] = 537878388;
        ii.zlh[261] = 1482972906;
        ii.zlh[262] = -379657692;
        ii.zlh[263] = 1090584811;
        ii.zlh[264] = -1587386253;
        ii.zlh[265] = -1746985584;
        ii.zlh[266] = -1442378839;
        ii.zlh[267] = -1109220985;
        ii.zlh[268] = -1042320099;
        ii.zlh[269] = 1965783603;
        ii.zlh[270] = 882759126;
        ii.zlh[271] = -719641972;
        ii.zlh[272] = -1370880206;
        ii.zlh[273] = -148710773;
        ii.zlh[274] = -755650053;
        ii.zlh[275] = -1295112102;
        ii.zlh[276] = -1722961406;
        ii.zlh[277] = -102829859;
        ii.zlh[278] = -1067890580;
        ii.zlh[279] = 2145131894;
        ii.zlh[280] = -2121590820;
        ii.zlh[281] = -928932387;
        ii.zlh[282] = 2054987741;
        ii.zlh[283] = 1580133104;
        ii.zlh[284] = 1332078206;
        ii.zlh[285] = -502689848;
        ii.zlh[286] = 1379672707;
        ii.zlh[287] = 373455619;
        ii.zlh[288] = -1587282874;
        ii.zlh[289] = -604907366;
        ii.zlh[290] = 2039935761;
        ii.zlh[291] = 1189994781;
        ii.zlh[292] = 1044196754;
        ii.zlh[293] = -778517409;
        ii.zlh[294] = -1521287280;
        ii.zlh[295] = 1836714118;
        ii.zlh[296] = 834558811;
        ii.zlh[297] = -1450398119;
        ii.zlh[298] = 948881182;
        ii.zlh[299] = 23021831;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public ov limitAngleChange(ov var1_1, ov var2_2, class_243 var3_3, class_1297 var4_4) {
        var25_5 = ii.c;
        var24_6 /* !! */  = ii.b;
        var23_7 = ii.a;
        if (var25_5) {
            throw null;
        }
        if (var23_7 || var23_7) return null;
        if (var4_4 == null) {
            if (var23_7) return null;
            v0 /* !! */  = ii.zle("zsu", zlk(int ), (int)128);
            if (var25_5) {
                throw null;
            }
        } else {
            if (var23_7 || var23_7) return null;
            v0 /* !! */  = var5_8 /* !! */  = (CallSite)var4_4.method_5628();
        }
        if (var23_7 || var23_7) return null;
        if (var5_8 /* !! */  != this.lastEntityId) {
            if (var23_7 || var23_7) return null;
            this.resetState();
            if (var23_7 || var23_7) return null;
            this.lastEntityId = (int)var5_8 /* !! */ ;
            if (var23_7) return null;
        }
        if (var23_7 || var23_7) return null;
        var6_9 = d.getInstance().getManager().getAttackPerpetrator().getAttackHandler();
        if (var23_7 || var23_7) return null;
        var7_10 = var6_9.getCount();
        if (var23_7 || var23_7) return null;
        if (var7_10 != this.lastAttackCount) {
            if (var23_7 || var23_7) return null;
            this.lastAttackCount = var7_10;
            if (var23_7 || var23_7) return null;
            this.postHitTicks = (int)ii.zle("zsv", zlk(int ), (int)129);
            if (var23_7 || var23_7) return null;
            this.combatTicks = (int)ii.zle("zsw", zlk(int ), (int)130);
            if (var23_7 || var23_7) return null;
            this.pursueStreak = (int)ii.zle("zsx", zlk(int ), (int)131);
            if (var23_7 || var23_7) return null;
            this.lastStepPitch = 0.0f;
            this.lastStepYaw = 0.0f;
            if (var23_7 || var23_7) return null;
            this.speedDrift += this.randGauss() * ii.zle("zsy", zlg(int ), (int)132);
            if (var23_7 || var23_7) return null;
            this.speedDrift = class_3532.method_15363((float)this.speedDrift, (float)ii.zle("zsz", zlg(int ), (int)133), (float)ii.zle("zta", zlg(int ), (int)134));
            if (var23_7) return null;
        }
        if (var23_7 || var23_7) return null;
        if (this.combatTicks < ii.zle("ztb", zlk(int ), (int)135)) {
            if (var23_7 || var23_7) return null;
            this.combatTicks += ii.zle("ztc", zlk(int ), (int)136);
            if (var23_7) return null;
        }
        if (var23_7 || var23_7) return null;
        this.rotationTicks += ii.zle("ztd", zlk(int ), (int)137);
        if (var23_7 || var23_7) return null;
        var8_11 = hn.getInstance();
        if (var23_7 || var23_7) return null;
        var9_12 = ow.calculateDelta(var1_1, var2_2);
        if (var23_7 || var23_7) return null;
        var10_13 = var9_12.getYaw();
        if (var23_7 || var23_7) return null;
        var11_14 = var9_12.getPitch();
        if (var23_7 || var23_7) return null;
        var12_15 = (float)Math.hypot(var10_13, var11_14);
        if (var23_7 || var23_7) return null;
        var13_16 = 0.0f;
        if (var23_7 != false) return null;
        if (var23_7) return null;
        var14_17 = 0.0f;
        if (var24_6 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block152: while (true) {
            block346: {
                switch (cfr_temp_0 == -2147483648 ? var24_6 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var23_7 || var23_7) return null;
                        if (this.lastRemYaw != ii.zle("zte", zlg(int ), (int)138)) {
                            if (var23_7 || var23_7) return null;
                            var13_16 = var10_13 - this.lastRemYaw;
                            if (var23_7 || var23_7) return null;
                            var14_17 = var11_14 - this.lastRemPitch;
                            if (var23_7) return null;
                        }
                        if (var23_7 || var23_7) return null;
                        this.lastRemYaw = var10_13;
                        if (var23_7 || var23_7) return null;
                        this.lastRemPitch = var11_14;
                        if (var23_7 || var23_7) return null;
                        var15_18 = this.hitRadius(var4_4);
                        if (var23_7 || var23_7) return null;
                        if (var4_4 == null) ** GOTO lbl-1000
                        if (var23_7) return null;
                        if (var8_11 == null) ** GOTO lbl-1000
                        if (var23_7) return null;
                        if (oy.rayTrace(var8_11.attackDistance(), var4_4.method_5829())) {
                            if (var23_7) return null;
                            v1 = ii.zle("ztf", zlk(int ), (int)139);
                            if (var25_5) {
                                throw null;
                            }
                        } else lbl-1000:
                        // 3 sources

                        {
                            if (var23_7 || var23_7) return null;
                            v1 = var16_19 = ii.zle("ztg", zlk(int ), (int)140);
                        }
                        if (var23_7 || var23_7) return null;
                        if (var16_19 != false) ** GOTO lbl102
                        if (var23_7) return null;
                        if (var12_15 < ii.zle("zth", zlg(int ), (int)141)) {
                            if (var23_7) return null;
lbl102:
                            // 2 sources

                            if (var23_7 || var23_7) return null;
                            v2 = ii.zle("zti", zlk(int ), (int)142);
                            if (var25_5) {
                                throw null;
                            }
                        } else {
                            if (var23_7 || var23_7) return null;
                            v2 = var17_20 = ii.zle("ztj", zlk(int ), (int)143);
                        }
                        if (var23_7 || var23_7) return null;
                        if (var16_19 != false) ** GOTO lbl-1000
                        if (var23_7) return null;
                        if (var12_15 > ii.zle("ztk", zlg(int ), (int)144)) {
                            if (var23_7) return null;
                            v3 = ii.zle("ztl", zlk(int ), (int)145);
                            if (var25_5) {
                                throw null;
                            }
                        } else lbl-1000:
                        // 2 sources

                        {
                            if (var23_7 || var23_7) return null;
                            v3 = var18_21 = ii.zle("ztm", zlk(int ), (int)146);
                        }
                        if (var23_7 || var23_7) return null;
                        if (var16_19 != false) ** GOTO lbl-1000
                        if (var23_7) return null;
                        if (!(var12_15 >= ii.zle("ztn", zlg(int ), (int)147))) ** GOTO lbl-1000
                        if (var23_7) return null;
                        if (var12_15 <= ii.zle("zto", zlg(int ), (int)148)) {
                            if (var23_7) return null;
                            v4 = ii.zle("ztp", zlk(int ), (int)149);
                            if (var25_5) {
                                throw null;
                            }
                        } else lbl-1000:
                        // 3 sources

                        {
                            if (var23_7 || var23_7) return null;
                            v4 = var19_22 = ii.zle("ztq", zlk(int ), (int)150);
                        }
                        if (var23_7 || var23_7) return null;
                        if (var16_19 != false) ** GOTO lbl138
                        if (var23_7) return null;
                        if (var12_15 < ii.zle("ztr", zlg(int ), (int)151)) {
                            if (var23_7) return null;
lbl138:
                            // 2 sources

                            if (var23_7 || var23_7) return null;
                            v5 = ii.zle("zts", zlk(int ), (int)152);
                            if (var25_5) {
                                throw null;
                            }
                        } else {
                            if (var23_7 || var23_7) return null;
                            v5 = var20_23 = ii.zle("ztt", zlk(int ), (int)153);
                        }
                        if (var23_7 || var23_7) return null;
                        if (this.recoverTicks > 0) {
                            if (var23_7 || var23_7) return null;
                            this.recoverTicks -= ii.zle("ztu", zlk(int ), (int)154);
                            if (var23_7 || var23_7) return null;
                            return this.modelStep(var1_1, var10_13, var11_14, var15_18, (boolean)var20_23, (boolean)ii.zle("ztv", zlk(int ), (int)155));
                        }
                        if (var23_7 || var23_7) return null;
                        if (this.spikeGuardTicks > 0) {
                            if (var23_7 || var23_7) return null;
                            this.spikeGuardTicks -= ii.zle("ztw", zlk(int ), (int)156);
                            if (var23_7 || var23_7) return null;
                            return this.modelStep(var1_1, var10_13, var11_14, var15_18, (boolean)var20_23, (boolean)ii.zle("ztx", zlk(int ), (int)157));
                        }
                        if (var23_7 || var23_7) return null;
                        if (this.postHitTicks > 0) {
                            if (var23_7) return null;
                            if (var17_20 != false) {
                                if (var23_7 || var23_7) return null;
                                this.postHitTicks -= ii.zle("zty", zlk(int ), (int)158);
                                if (var23_7) return null;
                            }
                        }
                        if (var23_7 || var23_7) return null;
                        if (this.lastCloseRatio > ii.zle("ztz", zlg(int ), (int)159)) {
                            if (var23_7 || var23_7) return null;
                            this.lockSkewTicks = (int)ii.zle("zua", zlk(int ), (int)160);
                            if (var23_7 || var23_7) return null;
                            if (!this.lockSkewYaw) {
                                v6 /* !! */  = ii.zle("zub", zlk(int ), (int)161);
                                if (var25_5) {
                                    throw null;
                                }
                            } else {
                                this.lockSkewYaw = ii.zle("zuc", zlk(int ), (int)162);
                                v6 /* !! */  = (CallSite)this.lockSkewYaw;
                            }
                            if (var23_7) return null;
                        }
                        if (var23_7 || var23_7) return null;
                        if (ms.isReady()) {
                            if (var23_7 || var23_7) return null;
                            var21_24 = this.model.next(var10_13, var11_14, var15_18);
                            if (var23_7 || var23_7) return null;
                            if (var21_24 != null) {
                                if (var23_7 || var23_7) return null;
                                if (var20_23 != false) {
                                    if (var23_7) return null;
                                    v7 = ii.zle("zud", zlg(int ), (int)163);
                                    if (var25_5) {
                                        throw null;
                                    }
                                } else {
                                    if (var23_7 || var23_7) return null;
                                    v7 = var22_25 = ii.zle("zue", zlg(int ), (int)164);
                                }
                                if (var23_7 || var23_7) return null;
                                return this.commitModelStep(var1_1, var10_13, var11_14, var12_15, var21_24[0], var21_24[1], (float)var22_25, (boolean)var16_19, (boolean)var20_23);
                            }
                        }
                        if (!var23_7 && !var23_7) return this.syntheticStep(var1_1, var10_13, var11_14, var12_15, var13_16, var14_17, (boolean)var16_19, (boolean)var17_20, (boolean)var18_21, (boolean)var19_22, (boolean)var20_23, var15_18);
                        return null;
                    }
                    case 4: {
                        var24_6 /* !! */  = (int)ii.zle("zuj", zlk(int ), (int)169);
                        cfr_temp_0 = 116;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 9: {
                        var24_6 /* !! */  = (int)ii.zle("zuo", zlk(int ), (int)174);
                        cfr_temp_0 = 42;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 11: {
                        var24_6 /* !! */  = (int)ii.zle("zuq", zlk(int ), (int)176);
                        cfr_temp_0 = 1;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 12: {
                        var24_6 /* !! */  = (int)ii.zle("zur", zlk(int ), (int)177);
                        cfr_temp_0 = 34;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 14: {
                        var24_6 /* !! */  = (int)ii.zle("zut", zlk(int ), (int)179);
                        cfr_temp_0 = 69;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 15: {
                        var24_6 /* !! */  = (int)ii.zle("zuu", zlk(int ), (int)180);
                        cfr_temp_0 = 42;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 20: {
                        var24_6 /* !! */  = (int)ii.zle("zuz", zlk(int ), (int)185);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 8: {
                        var24_6 /* !! */  = (int)ii.zle("zun", zlk(int ), (int)173);
                        cfr_temp_0 = 71;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 22: {
                        var24_6 /* !! */  = (int)ii.zle("zvb", zlk(int ), (int)187);
                        cfr_temp_0 = 120;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 23: {
                        var24_6 /* !! */  = (int)ii.zle("zvc", zlk(int ), (int)188);
                        cfr_temp_0 = 50;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 25: {
                        var24_6 /* !! */  = (int)ii.zle("zve", zlk(int ), (int)190);
                        cfr_temp_0 = 28;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 26: {
                        var24_6 /* !! */  = (int)ii.zle("zvf", zlk(int ), (int)191);
                        cfr_temp_0 = 132;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 28: {
                        var24_6 /* !! */  = (int)ii.zle("zvh", zlk(int ), (int)193);
                        cfr_temp_0 = 69;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 32: {
                        var24_6 /* !! */  = (int)ii.zle("zvl", zlk(int ), (int)197);
                        cfr_temp_0 = 57;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 34: {
                        var24_6 /* !! */  = (int)ii.zle("zvn", zlk(int ), (int)199);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 16: {
                        var24_6 /* !! */  = (int)ii.zle("zuv", zlk(int ), (int)181);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 10: {
                        var24_6 /* !! */  = (int)ii.zle("zup", zlk(int ), (int)175);
                        cfr_temp_0 = 92;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 35: {
                        var24_6 /* !! */  = (int)ii.zle("zvo", zlk(int ), (int)200);
                        cfr_temp_0 = 112;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 36: {
                        var24_6 /* !! */  = (int)ii.zle("zvp", zlk(int ), (int)201);
                        cfr_temp_0 = 112;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 37: {
                        do {
                            var24_6 /* !! */  = (int)ii.zle("zvq", zlk(int ), (int)202);
                        } while (!var25_5);
                        throw null;
                    }
                    case 39: {
                        var24_6 /* !! */  = (int)ii.zle("zvs", zlk(int ), (int)204);
                        cfr_temp_0 = 24;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 42: {
                        var24_6 /* !! */  = (int)ii.zle("zvv", zlk(int ), (int)207);
                        if (!var25_5) ** break;
                        throw null;
                    }
                    case 43: {
                        var24_6 /* !! */  = (int)ii.zle("zvw", zlk(int ), (int)208);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 2: {
                        var24_6 /* !! */  = (int)ii.zle("zuh", zlk(int ), (int)167);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 44: {
                        var24_6 /* !! */  = (int)ii.zle("zvx", zlk(int ), (int)209);
                        cfr_temp_0 = 33;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 46: {
                        var24_6 /* !! */  = (int)ii.zle("zvz", zlk(int ), (int)211);
                        cfr_temp_0 = 136;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 48: {
                        var24_6 /* !! */  = (int)ii.zle("zwb", zlk(int ), (int)213);
                        cfr_temp_0 = 53;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 50: {
                        var24_6 /* !! */  = (int)ii.zle("zwd", zlk(int ), (int)215);
                        cfr_temp_0 = 30;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 53: {
                        var24_6 /* !! */  = (int)ii.zle("zwg", zlk(int ), (int)218);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 29: {
                        var24_6 /* !! */  = (int)ii.zle("zvi", zlk(int ), (int)194);
                        cfr_temp_0 = 19;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 56: {
                        var24_6 /* !! */  = (int)ii.zle("zwj", zlk(int ), (int)221);
                        cfr_temp_0 = 140;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 57: {
                        var24_6 /* !! */  = (int)ii.zle("zwk", zlk(int ), (int)222);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 33: {
                        var24_6 /* !! */  = (int)ii.zle("zvm", zlk(int ), (int)198);
                        cfr_temp_0 = 76;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 59: {
                        var24_6 /* !! */  = (int)ii.zle("zwm", zlk(int ), (int)224);
                        cfr_temp_0 = 135;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 61: {
                        var24_6 /* !! */  = (int)ii.zle("zwo", zlk(int ), (int)226);
                        cfr_temp_0 = 124;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 62: {
                        var24_6 /* !! */  = (int)ii.zle("zwp", zlk(int ), (int)227);
                        cfr_temp_0 = 138;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 63: {
                        var24_6 /* !! */  = (int)ii.zle("zwq", zlk(int ), (int)228);
                        cfr_temp_0 = 6;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 64: {
                        var24_6 /* !! */  = (int)ii.zle("zwr", zlk(int ), (int)229);
                        cfr_temp_0 = 109;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 68: {
                        var24_6 /* !! */  = (int)ii.zle("zwv", zlk(int ), (int)233);
                        cfr_temp_0 = 142;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 72: {
                        var24_6 /* !! */  = (int)ii.zle("zwz", zlk(int ), (int)237);
                        cfr_temp_0 = 58;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 74: {
                        var24_6 /* !! */  = (int)ii.zle("zxb", zlk(int ), (int)239);
                        cfr_temp_0 = 1;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 77: {
                        var24_6 /* !! */  = (int)ii.zle("zxe", zlk(int ), (int)242);
                        cfr_temp_0 = 0;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 79: {
                        var24_6 /* !! */  = (int)ii.zle("zxg", zlk(int ), (int)244);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 6: {
                        ** GOTO lbl862
                    }
                    case 80: {
                        var24_6 /* !! */  = (int)ii.zle("zxh", zlk(int ), (int)245);
                        cfr_temp_0 = 125;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 81: {
                        var24_6 /* !! */  = (int)ii.zle("zxi", zlk(int ), (int)246);
                        cfr_temp_0 = 114;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 82: {
                        var24_6 /* !! */  = (int)ii.zle("zxj", zlk(int ), (int)247);
                        cfr_temp_0 = 1;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 86: {
                        var24_6 /* !! */  = (int)ii.zle("zxn", zlk(int ), (int)251);
                        cfr_temp_0 = 102;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 87: {
                        var24_6 /* !! */  = (int)ii.zle("zxo", zlk(int ), (int)252);
                        cfr_temp_0 = 49;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 89: {
                        var24_6 /* !! */  = (int)ii.zle("zxq", zlk(int ), (int)254);
                        cfr_temp_0 = 83;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 92: {
                        var24_6 /* !! */  = (int)ii.zle("zxt", zlk(int ), (int)257);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 27: {
                        var24_6 /* !! */  = (int)ii.zle("zvg", zlk(int ), (int)192);
                        cfr_temp_0 = 69;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 93: {
                        var24_6 /* !! */  = (int)ii.zle("zxu", zlk(int ), (int)258);
                        cfr_temp_0 = 133;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 96: {
                        var24_6 /* !! */  = (int)ii.zle("zxx", zlk(int ), (int)261);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 83: {
                        var24_6 /* !! */  = (int)ii.zle("zxk", zlk(int ), (int)248);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 1: {
                        var24_6 /* !! */  = (int)ii.zle("zug", zlk(int ), (int)166);
                        cfr_temp_0 = 75;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 97: {
                        var24_6 /* !! */  = (int)ii.zle("zxy", zlk(int ), (int)262);
                        cfr_temp_0 = 146;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 98: {
                        var24_6 /* !! */  = (int)ii.zle("zxz", zlk(int ), (int)263);
                        cfr_temp_0 = 18;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 99: {
                        var24_6 /* !! */  = (int)ii.zle("zya", zlk(int ), (int)264);
                        cfr_temp_0 = 49;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 101: {
                        var24_6 /* !! */  = (int)ii.zle("zyc", zlk(int ), (int)266);
                        cfr_temp_0 = 143;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 104: {
                        var24_6 /* !! */  = (int)ii.zle("zyf", zlk(int ), (int)269);
                        cfr_temp_0 = 24;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 105: {
                        var24_6 /* !! */  = (int)ii.zle("zyg", zlk(int ), (int)270);
                        cfr_temp_0 = 112;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 109: {
                        var24_6 /* !! */  = (int)ii.zle("zyk", zlk(int ), (int)274);
                        cfr_temp_0 = 108;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 114: {
                        var24_6 /* !! */  = (int)ii.zle("zyp", zlk(int ), (int)279);
                        cfr_temp_0 = 136;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 115: {
                        var24_6 /* !! */  = (int)ii.zle("zyq", zlk(int ), (int)280);
                        cfr_temp_0 = 130;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 118: {
                        var24_6 /* !! */  = (int)ii.zle("zyt", zlk(int ), (int)283);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 112: {
                        var24_6 /* !! */  = (int)ii.zle("zyn", zlk(int ), (int)277);
                        if (!var25_5) ** break;
                        throw null;
                    }
                    case 120: {
                        var24_6 /* !! */  = (int)ii.zle("zyv", zlk(int ), (int)285);
                        cfr_temp_0 = 91;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 124: {
                        var24_6 /* !! */  = (int)ii.zle("zyz", zlk(int ), (int)289);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 52: {
                        var24_6 /* !! */  = (int)ii.zle("zwf", zlk(int ), (int)217);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 85: {
                        var24_6 /* !! */  = (int)ii.zle("zxm", zlk(int ), (int)250);
                        cfr_temp_0 = 106;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 125: {
                        var24_6 /* !! */  = (int)ii.zle("zza", zlk(int ), (int)290);
                        cfr_temp_0 = 54;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 126: {
                        var24_6 /* !! */  = (int)ii.zle("zzb", zlk(int ), (int)291);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 106: {
                        var24_6 /* !! */  = (int)ii.zle("zyh", zlk(int ), (int)271);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 94: {
                        var24_6 /* !! */  = (int)ii.zle("zxv", zlk(int ), (int)259);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 95: {
                        var24_6 /* !! */  = (int)ii.zle("zxw", zlk(int ), (int)260);
                        cfr_temp_0 = 131;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 128: {
                        var24_6 /* !! */  = (int)ii.zle("zzd", zlk(int ), (int)293);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 116: {
                        var24_6 /* !! */  = (int)ii.zle("zyr", zlk(int ), (int)281);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 88: {
                        var24_6 /* !! */  = (int)ii.zle("zxp", zlk(int ), (int)253);
                        cfr_temp_0 = 113;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 132: {
                        var24_6 /* !! */  = (int)ii.zle("zzh", zlk(int ), (int)297);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 117: {
                        var24_6 /* !! */  = (int)ii.zle("zys", zlk(int ), (int)282);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 17: {
                        var24_6 /* !! */  = (int)ii.zle("zuw", zlk(int ), (int)182);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 67: {
                        do {
                            var24_6 /* !! */  = (int)ii.zle("zwu", zlk(int ), (int)232);
                        } while (!var25_5);
                        throw null;
                    }
                    case 134: {
                        var24_6 /* !! */  = (int)ii.zle("zzj", zlk(int ), (int)299);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 69: {
                        var24_6 /* !! */  = (int)ii.zle("zww", zlk(int ), (int)234);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 5: {
                        var24_6 /* !! */  = (int)ii.zle("zuk", zlk(int ), (int)170);
                        cfr_temp_0 = 65;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 135: {
                        var24_6 /* !! */  = (int)ii.zle("zzk", zlk(int ), (int)300);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 76: {
                        var24_6 /* !! */  = (int)ii.zle("zxd", zlk(int ), (int)241);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 18: {
                        var24_6 /* !! */  = (int)ii.zle("zux", zlk(int ), (int)183);
                        cfr_temp_0 = 24;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 136: {
                        var24_6 /* !! */  = (int)ii.zle("zzl", zlk(int ), (int)301);
                        cfr_temp_0 = 0;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 137: {
                        var24_6 /* !! */  = (int)ii.zle("zzm", zlk(int ), (int)302);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 139: {
                        var24_6 /* !! */  = (int)ii.zle("zzo", zlk(int ), (int)304);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 73: {
                        var24_6 /* !! */  = (int)ii.zle("zxa", zlk(int ), (int)238);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 21: {
                        var24_6 /* !! */  = (int)ii.zle("zva", zlk(int ), (int)186);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 91: {
                        var24_6 /* !! */  = (int)ii.zle("zxs", zlk(int ), (int)256);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 49: {
                        var24_6 /* !! */  = (int)ii.zle("zwc", zlk(int ), (int)214);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 113: {
                        var24_6 /* !! */  = (int)ii.zle("zyo", zlk(int ), (int)278);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 108: {
                        var24_6 /* !! */  = (int)ii.zle("zyj", zlk(int ), (int)273);
                        cfr_temp_0 = 41;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 140: {
                        var24_6 /* !! */  = (int)ii.zle("zzp", zlk(int ), (int)305);
                        cfr_temp_0 = 65;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 141: {
                        var24_6 /* !! */  = (int)ii.zle("zzq", zlk(int ), (int)306);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 38: {
                        var24_6 /* !! */  = (int)ii.zle("zvr", zlk(int ), (int)203);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 130: {
                        var24_6 /* !! */  = (int)ii.zle("zzf", zlk(int ), (int)295);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 75: {
                        var24_6 /* !! */  = (int)ii.zle("zxc", zlk(int ), (int)240);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 30: {
                        var24_6 /* !! */  = (int)ii.zle("zvj", zlk(int ), (int)195);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 103: {
                        var24_6 /* !! */  = (int)ii.zle("zye", zlk(int ), (int)268);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 110: {
                        var24_6 /* !! */  = (int)ii.zle("zyl", zlk(int ), (int)275);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 123: {
                        var24_6 /* !! */  = (int)ii.zle("zyy", zlk(int ), (int)288);
                        cfr_temp_0 = 90;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 142: {
                        var24_6 /* !! */  = (int)ii.zle("zzr", zlk(int ), (int)307);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 70: {
                        var24_6 /* !! */  = (int)ii.zle("zwx", zlk(int ), (int)235);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 0: {
                        var24_6 /* !! */  = (int)ii.zle("zuf", zlk(int ), (int)165);
                        cfr_temp_0 = 84;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 143: {
                        var24_6 /* !! */  = (int)ii.zle("zzs", zlk(int ), (int)308);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 60: {
                        var24_6 /* !! */  = (int)ii.zle("zwn", zlk(int ), (int)225);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 84: {
                        var24_6 /* !! */  = (int)ii.zle("zxl", zlk(int ), (int)249);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 24: {
                        var24_6 /* !! */  = (int)ii.zle("zvd", zlk(int ), (int)189);
                        cfr_temp_0 = 55;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 144: {
                        var24_6 /* !! */  = (int)ii.zle("zzt", zlk(int ), (int)309);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 13: {
                        var24_6 /* !! */  = (int)ii.zle("zus", zlk(int ), (int)178);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 100: {
                        var24_6 /* !! */  = (int)ii.zle("zyb", zlk(int ), (int)265);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 45: {
                        var24_6 /* !! */  = (int)ii.zle("zvy", zlk(int ), (int)210);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 66: {
                        var24_6 /* !! */  = (int)ii.zle("zwt", zlk(int ), (int)231);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 131: {
                        var24_6 /* !! */  = (int)ii.zle("zzg", zlk(int ), (int)296);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 119: {
                        var24_6 /* !! */  = (int)ii.zle("zyu", zlk(int ), (int)284);
                        cfr_temp_0 = 121;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 145: {
                        var24_6 /* !! */  = (int)ii.zle("zzu", zlk(int ), (int)310);
                        cfr_temp_0 = 41;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 146: {
                        var24_6 /* !! */  = (int)ii.zle("zzv", zlk(int ), (int)311);
                        cfr_temp_0 = 47;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 147: {
                        var24_6 /* !! */  = (int)ii.zle("zzw", zlk(int ), (int)312);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 111: {
                        var24_6 /* !! */  = (int)ii.zle("zym", zlk(int ), (int)276);
                        cfr_temp_0 = 47;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 148: {
                        var24_6 /* !! */  = (int)ii.zle("zzx", zlk(int ), (int)313);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 3: {
                        var24_6 /* !! */  = (int)ii.zle("zui", zlk(int ), (int)168);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 19: {
                        var24_6 /* !! */  = (int)ii.zle("zuy", zlk(int ), (int)184);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 71: {
                        var24_6 /* !! */  = (int)ii.zle("zwy", zlk(int ), (int)236);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 54: {
                        var24_6 /* !! */  = (int)ii.zle("zwh", zlk(int ), (int)219);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 41: {
                        var24_6 /* !! */  = (int)ii.zle("zvu", zlk(int ), (int)206);
                        cfr_temp_0 = 7;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 149: {
                        var24_6 /* !! */  = (int)ii.zle("zzy", zlk(int ), (int)314);
                        if (var25_5) {
                            throw null;
                        }
lbl862:
                        // 3 sources

                        var24_6 /* !! */  = (int)ii.zle("zul", zlk(int ), (int)171);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 40: {
                        var24_6 /* !! */  = (int)ii.zle("zvt", zlk(int ), (int)205);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 31: {
                        var24_6 /* !! */  = (int)ii.zle("zvk", zlk(int ), (int)196);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 58: {
                        var24_6 /* !! */  = (int)ii.zle("zwl", zlk(int ), (int)223);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 121: {
                        var24_6 /* !! */  = (int)ii.zle("zyw", zlk(int ), (int)286);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 122: {
                        var24_6 /* !! */  = (int)ii.zle("zyx", zlk(int ), (int)287);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 51: {
                        var24_6 /* !! */  = (int)ii.zle("zwe", zlk(int ), (int)216);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 90: {
                        var24_6 /* !! */  = (int)ii.zle("zxr", zlk(int ), (int)255);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 65: {
                        var24_6 /* !! */  = (int)ii.zle("zws", zlk(int ), (int)230);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 55: {
                        var24_6 /* !! */  = (int)ii.zle("zwi", zlk(int ), (int)220);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 107: {
                        var24_6 /* !! */  = (int)ii.zle("zyi", zlk(int ), (int)272);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 47: {
                        var24_6 /* !! */  = (int)ii.zle("zwa", zlk(int ), (int)212);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 133: {
                        var24_6 /* !! */  = (int)ii.zle("zzi", zlk(int ), (int)298);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 78: {
                        var24_6 /* !! */  = (int)ii.zle("zxf", zlk(int ), (int)243);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 129: {
                        var24_6 /* !! */  = (int)ii.zle("zze", zlk(int ), (int)294);
                        cfr_temp_0 = 127;
                        if (var25_5) {
                            throw null;
                        }
                        break block346;
                    }
                    case 7: {
                        var24_6 /* !! */  = (int)ii.zle("zum", zlk(int ), (int)172);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 127: {
                        var24_6 /* !! */  = (int)ii.zle("zzc", zlk(int ), (int)292);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 102: {
                        var24_6 /* !! */  = (int)ii.zle("zyd", zlk(int ), (int)267);
                        if (var25_5) {
                            throw null;
                        }
                    }
                    case 138: 
                }
                ** GOTO lbl940
            }
            do {
                if (true) continue block152;
lbl940:
                // 2 sources

                var24_6 /* !! */  = (int)ii.zle("zzn", zlk(int ), (int)303);
                cfr_temp_0 = 7;
            } while (!var25_5);
            break;
        }
        throw null;
    }

    private static /* synthetic */ int zlk(int n2) {
        return zlh[n2] ^ zli[n2];
    }

    private static /* synthetic */ void absp() {
        ii.zld[100] = 4952572110477350198L;
        ii.zld[101] = -1180449186861159140L;
        ii.zld[102] = -8608894021650807917L;
        ii.zld[103] = 4727326009754444767L;
        ii.zld[104] = 7422025088952329627L;
        ii.zld[105] = -3704371123207296368L;
        ii.zld[106] = -8055619704568706183L;
        ii.zld[107] = -1884692379316176755L;
        ii.zld[108] = 508597140332498558L;
        ii.zld[109] = 8856272529052425235L;
        ii.zld[110] = -67617523563864911L;
        ii.zld[111] = -83021158406779608L;
        ii.zld[112] = -1357402709572927100L;
        ii.zld[113] = 5909355186924530516L;
        ii.zld[114] = -2929386208880875331L;
        ii.zld[115] = 7081839431865984809L;
        ii.zld[116] = 9004177015573405010L;
        ii.zld[117] = 6081284074369435306L;
        ii.zld[118] = 7587084870722998449L;
        ii.zld[119] = 2697728283114559241L;
        ii.zld[120] = 6655894470686013618L;
        ii.zld[121] = 873555878249271839L;
        ii.zld[122] = -4263061912811182238L;
        ii.zld[123] = -4443829912092541785L;
        ii.zld[124] = 8860514679842008258L;
        ii.zld[125] = -695064532282077269L;
        ii.zld[126] = 2539269380104997045L;
        ii.zld[127] = 976432235031210384L;
        ii.zld[128] = -5060438328427334316L;
        ii.zld[129] = 6400891374865014297L;
        ii.zld[130] = -2846439869615367509L;
        ii.zld[131] = -2225583888408917750L;
        ii.zld[132] = -4340941663762021810L;
        ii.zld[133] = 672150465107470171L;
        ii.zld[134] = 4640486779186309845L;
        ii.zld[135] = 5857871650606742112L;
        ii.zld[136] = -5419008157211635113L;
        ii.zld[137] = -6656464671770476842L;
        ii.zld[138] = 5584091684848437685L;
        ii.zld[139] = 3823020174476951888L;
        ii.zld[140] = -3622185674875671966L;
        ii.zld[141] = 8585215697244479288L;
        ii.zld[142] = -1083826999055898367L;
        ii.zld[143] = 8055746171881706515L;
        ii.zld[144] = -4938401111033074100L;
        ii.zld[145] = -3003837844681566456L;
        ii.zld[146] = 5057427076681865784L;
        ii.zld[147] = -5458124944379376478L;
        ii.zld[148] = -5340675277216562752L;
        ii.zld[149] = 3667679591623362593L;
        ii.zld[150] = 5712496797362479135L;
        ii.zld[151] = -5670867018915271757L;
        ii.zld[152] = -8595095357278293636L;
        ii.zld[153] = 6628576307893823310L;
        ii.zld[154] = 5140887681516180950L;
        ii.zld[155] = 2457426164161185037L;
        ii.zld[156] = 2475542718018156390L;
        ii.zld[157] = -3152406608580808061L;
        ii.zld[158] = 6293712652407507021L;
        ii.zld[159] = -1492394405983100411L;
        ii.zld[160] = -4163867613223661916L;
        ii.zld[161] = -3178314639916984127L;
        ii.zld[162] = -6450859352335611514L;
        ii.zld[163] = -5334913368992067880L;
        ii.zld[164] = -5690420263590092767L;
        ii.zld[165] = -2781210190769947452L;
        ii.zld[166] = -2196887031189776108L;
        ii.zld[167] = -328749345673675334L;
        ii.zld[168] = -1398510273107431351L;
        ii.zld[169] = 8411757161060368860L;
        ii.zld[170] = 5070260818333073661L;
        ii.zld[171] = -8005918813516008118L;
        ii.zld[172] = 6573817721242160801L;
        ii.zld[173] = -744196835973918335L;
        ii.zld[174] = 749152822976355815L;
        ii.zld[175] = -1907581085862083932L;
        ii.zld[176] = 7009450291584016874L;
        ii.zld[177] = -5059729054692244436L;
        ii.zld[178] = 3528177808357306003L;
        ii.zld[179] = -2460397555339597459L;
        ii.zld[180] = -4183703498995647681L;
        ii.zld[181] = -7813601282439022284L;
        ii.zld[182] = 3226891748188559223L;
        ii.zld[183] = 6675451546048983430L;
        ii.zld[184] = -490758573479142648L;
        ii.zld[185] = -4448119962036266566L;
        ii.zld[186] = 6200066966358327205L;
        ii.zld[187] = 3408877788143995208L;
        ii.zld[188] = -248798785822400289L;
        ii.zld[189] = -2477514565070768268L;
        ii.zld[190] = -8971737147341610194L;
        ii.zld[191] = 1919081397075585471L;
        ii.zld[192] = 9005457856474980001L;
        ii.zld[193] = 3755860022888694234L;
        ii.zld[194] = 8670017458725424083L;
        ii.zld[195] = -4477733625996929008L;
        ii.zld[196] = -2089939036536821644L;
        ii.zld[197] = 7077195175673049365L;
        ii.zld[198] = -510893100275008100L;
        ii.zld[199] = -4464029325162206102L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ov finishStep(ov var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6) {
        v0 /* !! */  = ii.bk;
        if (true) ** GOTO lbl5
        block43: while (true) {
            v0 /* !! */  = (long)(v1 - ii.zle("abfe", zlb(int ), (int)106));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1330048102: {
                    v1 = ii.zle("abff", zlb(int ), (int)107);
                    continue block43;
                }
                case -721137248: {
                    v1 = ii.zle("abfg", zlb(int ), (int)108);
                    continue block43;
                }
                case 1109002785: {
                    break block43;
                }
                case 1555673178: {
                    v1 = ii.zle("abfh", zlb(int ), (int)109);
                    continue block43;
                }
            }
            break;
        }
        var11_7 = ii.c;
        v2 /* !! */  = ii.bk;
        if (true) ** GOTO lbl22
        block44: while (true) {
            v2 /* !! */  = (long)(ii.zle("abfj", zlb(int ), (int)111) - ii.zle("abfi", zlb(int ), (int)110));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 1109002785: {
                    break block44;
                }
                case 1712820603: {
                    continue block44;
                }
            }
            break;
        }
        var10_8 /* !! */  = ii.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = ii.bk - ii.zle("abfk", zlb(int ), (int)112)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ii.zle("abfl", zlk(int ), (int)937)) break;
            v3 /* !! */  = (long)ii.zle("abfm", zlk(int ), (int)938);
        }
        var9_9 = ii.a;
        if (var11_7) {
            throw null;
lbl36:
            // 3 sources

            return null;
        }
        if (var9_9 || var9_9) ** GOTO lbl36
        if (var10_8 /* !! */  == 0) ** GOTO lbl-1000
        switch (var10_8 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = ii.bk - ii.zle("abfn", zlb(int ), (int)113)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ii.zle("abfo", zlk(int ), (int)939)) break;
                    v4 /* !! */  = (long)ii.zle("abfp", zlk(int ), (int)940);
                }
                v5 = var1_1.getYaw();
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = ii.bk - ii.zle("abfq", zlb(int ), (int)114)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ii.zle("abfr", zlk(int ), (int)941)) break;
                    v6 /* !! */  = (long)ii.zle("abfs", zlk(int ), (int)942);
                }
                var7_10 = v5 + ii.clampOvershoot(var4_4, var2_2, var6_6);
                if (var9_9 || var9_9) ** GOTO lbl36
                v7 /* !! */  = ii.bk;
                if (true) ** GOTO lbl59
                block49: while (true) {
                    v7 /* !! */  = (long)(v8 - ii.zle("abft", zlb(int ), (int)115));
lbl59:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -2001740392: {
                            v8 = ii.zle("abfu", zlb(int ), (int)116);
                            continue block49;
                        }
                        case -942322495: {
                            v8 = ii.zle("abfv", zlb(int ), (int)117);
                            continue block49;
                        }
                        case -855749254: {
                            v8 = ii.zle("abfw", zlb(int ), (int)118);
                            continue block49;
                        }
                        case 1109002785: {
                            break block49;
                        }
                    }
                    break;
                }
                v9 = var1_1.getPitch();
                v10 /* !! */  = ii.bk;
                if (true) ** GOTO lbl76
                block50: while (true) {
                    v10 /* !! */  = (long)(v11 - ii.zle("abfx", zlb(int ), (int)119));
lbl76:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case 1109002785: {
                            break block50;
                        }
                        case 1416760191: {
                            v11 = ii.zle("abfy", zlb(int ), (int)120);
                            continue block50;
                        }
                        case 1480682928: {
                            v11 = ii.zle("abfz", zlb(int ), (int)121);
                            continue block50;
                        }
                    }
                    break;
                }
                v12 = v9 + ii.clampOvershoot(var5_5, var3_3, var6_6);
                v13 = ii.zle("abga", zlg(int ), (int)943);
                v14 = ii.zle("abgb", zlg(int ), (int)944);
                v15 /* !! */  = ii.bk;
                if (true) ** GOTO lbl92
                block51: while (true) {
                    v15 /* !! */  = (long)(v16 - ii.zle("abgc", zlb(int ), (int)122));
lbl92:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1437038952: {
                            v16 = ii.zle("abgd", zlb(int ), (int)123);
                            continue block51;
                        }
                        case 445142318: {
                            v16 = ii.zle("abge", zlb(int ), (int)124);
                            continue block51;
                        }
                        case 1109002785: {
                            break block51;
                        }
                        case 2084181544: {
                            v16 = ii.zle("abgf", zlb(int ), (int)125);
                            continue block51;
                        }
                    }
                    break;
                }
                var8_11 = class_3532.method_15363((float)v12, (float)v13, (float)v14);
                if (var9_9 || var9_9) ** continue;
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_3 = ii.bk - ii.zle("abgg", zlb(int ), (int)126)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == ii.zle("abgh", zlk(int ), (int)945)) break;
                    v17 /* !! */  = (long)ii.zle("abgi", zlk(int ), (int)946);
                }
                v18 /* !! */  = ii.bk;
                if (true) ** GOTO lbl115
                block53: while (true) {
                    v18 /* !! */  = (long)(v19 - ii.zle("abgj", zlb(int ), (int)127));
lbl115:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1159472927: {
                            v19 = ii.zle("abgk", zlb(int ), (int)128);
                            continue block53;
                        }
                        case -1031879334: {
                            v19 = ii.zle("abgl", zlb(int ), (int)129);
                            continue block53;
                        }
                        case 484840477: {
                            v19 = ii.zle("abgm", zlb(int ), (int)130);
                            continue block53;
                        }
                        case 1109002785: {
                            break block53;
                        }
                    }
                    break;
                }
                return new ov(var7_10, var8_11);
            }
lbl128:
            // 2 sources

            case 0: {
                var10_8 /* !! */  = (int)ii.zle("abgn", zlk(int ), (int)947);
                if (var11_7) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl133:
            // 4 sources

            case 1: {
                var10_8 /* !! */  = (int)ii.zle("abgo", zlk(int ), (int)948);
                if (var11_7) {
                    throw null;
                }
                ** GOTO lbl150
            }
            case 2: {
                var10_8 /* !! */  = (int)ii.zle("abgp", zlk(int ), (int)949);
                if (!var11_7) ** GOTO lbl133
                throw null;
            }
lbl142:
            // 2 sources

            case 3: {
                var10_8 /* !! */  = (int)ii.zle("abgq", zlk(int ), (int)950);
                if (!var11_7) ** GOTO lbl133
                throw null;
            }
            case 4: {
                var10_8 /* !! */  = (int)ii.zle("abgr", zlk(int ), (int)951);
                if (!var11_7) ** GOTO lbl133
                throw null;
            }
lbl150:
            // 3 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var10_8 /* !! */  = (int)ii.zle("abgs", zlk(int ), (int)952);
                    if (!var11_7) ** GOTO lbl128
                    throw null;
                }
            }
            case 6: {
                var10_8 /* !! */  = (int)ii.zle("abgt", zlk(int ), (int)953);
                if (!var11_7) ** GOTO lbl142
                throw null;
            }
            case 7: 
        }
        var10_8 /* !! */  = (int)ii.zle("abgu", zlk(int ), (int)954);
        ** while (!var11_7)
lbl162:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public class_243 randomValue() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ii.bk - ii.zle("abpx", zlb(int ), (int)226)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ii.zle("abpy", zlk(int ), (int)1096)) break;
            v0 /* !! */  = (long)ii.zle("abpz", zlk(int ), (int)1097);
        }
        var5_1 = ii.c;
        v1 /* !! */  = ii.bk;
        if (true) ** GOTO lbl12
        block20: while (true) {
            v1 /* !! */  = (long)(ii.zle("abqb", zlb(int ), (int)228) - ii.zle("abqa", zlb(int ), (int)227));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 785603019: {
                    continue block20;
                }
                case 1109002785: {
                    break block20;
                }
            }
            break;
        }
        var4_2 = ii.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ii.bk - ii.zle("abqc", zlb(int ), (int)229)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ii.zle("abqd", zlk(int ), (int)1098)) break;
            v2 /* !! */  = (long)ii.zle("abqe", zlk(int ), (int)1099);
        }
        var3_3 = ii.a;
        if (var5_1) {
            throw null;
lbl27:
            // 2 sources

            return null;
        }
        if (var3_3 || var3_3) ** GOTO lbl27
        var1_4 = ii.zle("abqf", zqq(int ), (int)230);
        ** while (var3_3 || var3_3)
lbl32:
        // 1 sources

        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = ii.bk - ii.zle("abqg", zlb(int ), (int)231)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ii.zle("abqh", zlk(int ), (int)1100)) break;
            v3 /* !! */  = (long)ii.zle("abqi", zlk(int ), (int)1101);
        }
        v4 /* !! */  = ii.bk;
        if (true) ** GOTO lbl42
        block24: while (true) {
            v4 /* !! */  = (long)(v5 - ii.zle("abqj", zlb(int ), (int)232));
lbl42:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1663993646: {
                    v5 = ii.zle("abqk", zlb(int ), (int)233);
                    continue block24;
                }
                case 768623553: {
                    v5 = ii.zle("abql", zlb(int ), (int)234);
                    continue block24;
                }
                case 1109002785: {
                    break block24;
                }
            }
            break;
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_3 = ii.bk - ii.zle("abqm", zlb(int ), (int)235)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v6 /* !! */  == ii.zle("abqn", zlk(int ), (int)1102)) break;
            v6 /* !! */  = (long)ii.zle("abqo", zlk(int ), (int)1103);
        }
        v7 = (this.random.nextDouble() * ii.zle("abqp", zqq(int ), (int)236) - 1.0) * var1_4;
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_4 = ii.bk - ii.zle("abqq", zlb(int ), (int)237)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v8 /* !! */  == ii.zle("abqr", zlk(int ), (int)1104)) break;
            v8 /* !! */  = (long)ii.zle("abqs", zlk(int ), (int)1105);
        }
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_5 = ii.bk - ii.zle("abqt", zlb(int ), (int)238)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v9 /* !! */  == ii.zle("abqu", zlk(int ), (int)1106)) break;
            v9 /* !! */  = (long)ii.zle("abqv", zlk(int ), (int)1107);
        }
        v10 = (this.random.nextDouble() * ii.zle("abqw", zqq(int ), (int)239) - 1.0) * var1_4;
        v11 /* !! */  = ii.bk;
        if (true) ** GOTO lbl75
        block28: while (true) {
            v11 /* !! */  = (long)(v12 - ii.zle("abqx", zlb(int ), (int)240));
lbl75:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -1079088930: {
                    v12 = ii.zle("abqy", zlb(int ), (int)241);
                    continue block28;
                }
                case 1109002785: {
                    break block28;
                }
                case 1289509389: {
                    v12 = ii.zle("abqz", zlb(int ), (int)242);
                    continue block28;
                }
                case 1519012957: {
                    v12 = ii.zle("abra", zlb(int ), (int)243);
                    continue block28;
                }
            }
            break;
        }
        v13 /* !! */  = ii.bk;
        if (true) ** GOTO lbl91
        block29: while (true) {
            v13 /* !! */  = (long)(ii.zle("abrc", zlb(int ), (int)245) - ii.zle("abrb", zlb(int ), (int)244));
lbl91:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -635009954: {
                    continue block29;
                }
                case 1109002785: {
                    break block29;
                }
            }
            break;
        }
        v14 = (this.random.nextDouble() * ii.zle("abrd", zqq(int ), (int)246) - 1.0) * var1_4;
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_6 = ii.bk - ii.zle("abre", zlb(int ), (int)247)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v15 /* !! */  == ii.zle("abrf", zlk(int ), (int)1108)) break;
            v15 /* !! */  = (long)ii.zle("abrg", zlk(int ), (int)1109);
        }
        return new class_243(v7, v10, v14);
    }
}

