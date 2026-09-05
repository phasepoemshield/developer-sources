/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1743
 *  net.minecraft.class_1802
 *  net.minecraft.class_1821
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1743;
import net.minecraft.class_1802;
import net.minecraft.class_1821;
import ruhack.phobia.c;
import ruhack.phobia.hk;
import ruhack.phobia.hn;
import ruhack.phobia.mq;

public class hw
implements c {
    public static final boolean a;
    private float legitCooldown;
    private double legacyClickBudget;
    private final int[] spookyTicks;
    private final int[] funTimeTicks;
    private long lastClickTime;
    private final int[] defaultTicks;
    private boolean legacyActive;
    private long legacyUpdateNanos;
    private static int[] gein;
    protected static final long nk = -7667999081472462704L;
    private static long[] gejc;
    private static int[] geim;
    public static final boolean c;
    private long legitAttackDelay;
    public static final int b;
    private static long[] gejb;

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static long randomLegitDelay() {
        Object object = nk;
        boolean bl2 = true;
        block21: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - hw.geio("geyk", gekk(int ), (int)97);
            }
            switch ((int)object) {
                case -1711510148: {
                    callSite = hw.geio("geyl", gekk(int ), (int)98);
                    continue block21;
                }
                case -1040008725: {
                    callSite = hw.geio("geym", gekk(int ), (int)99);
                    continue block21;
                }
                case 1389359248: {
                    break block21;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = nk;
        boolean bl4 = true;
        block22: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - hw.geio("geyn", gekk(int ), (int)100);
            }
            switch ((int)object2) {
                case -1238256931: {
                    callSite = hw.geio("geyo", gekk(int ), (int)101);
                    continue block22;
                }
                case -873289409: {
                    callSite = hw.geio("geyp", gekk(int ), (int)102);
                    continue block22;
                }
                case 508452250: {
                    callSite = hw.geio("geyq", gekk(int ), (int)103);
                    continue block22;
                }
                case 1389359248: {
                    break block22;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = nk;
        boolean bl5 = true;
        block23: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object3 = callSite - hw.geio("geyr", gekk(int ), (int)104);
            }
            switch ((int)object3) {
                case 918743454: {
                    callSite = hw.geio("geys", gekk(int ), (int)105);
                    continue block23;
                }
                case 1389359248: {
                    break block23;
                }
                case 1560990759: {
                    callSite = hw.geio("geyt", gekk(int ), (int)106);
                    continue block23;
                }
                case 2036419975: {
                    callSite = hw.geio("geyu", gekk(int ), (int)107);
                    continue block23;
                }
            }
            break;
        }
        boolean bl6 = a;
        if (bl3) {
            throw null;
        }
        if (bl6) return (long)hw.geio("geyv", gekk(int ), (int)108);
        if (bl6) return (long)hw.geio("geyv", gekk(int ), (int)108);
        while (true) {
            long l2;
            Object object4;
            if ((object4 = (l2 = nk - hw.geio("geyw", gekk(int ), (int)109)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object4 == hw.geio("geyx", geil(int ), (int)309)) break;
            object4 = hw.geio("geyy", geil(int ), (int)310);
        }
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        CallSite callSite2 = hw.geio("geyz", gekk(int ), (int)110);
        callSite2 = hw.geio("geza", gekk(int ), (int)111);
        Object object5 = nk;
        block25: while (true) {
            switch ((int)object5) {
                case -1023289349: {
                    object5 = hw.geio("gezc", gekk(int ), (int)113) - hw.geio("gezb", gekk(int ), (int)112);
                    continue block25;
                }
                case 1389359248: {
                    return threadLocalRandom.nextLong((long)callSite, (long)callSite2);
                }
            }
            break;
        }
        return threadLocalRandom.nextLong((long)callSite, (long)callSite2);
    }

    private static /* synthetic */ void gfbr() {
        hw.gein[0] = -1986557818;
        hw.gein[1] = -2087443587;
        hw.gein[2] = 243588019;
        hw.gein[3] = -763178615;
        hw.gein[4] = -814750130;
        hw.gein[5] = 26015811;
        hw.gein[6] = 409463172;
        hw.gein[7] = -1389189806;
        hw.gein[8] = -1168743555;
        hw.gein[9] = -100194830;
        hw.gein[10] = 1646896000;
        hw.gein[11] = 2052669083;
        hw.gein[12] = -191140605;
        hw.gein[13] = 247111143;
        hw.gein[14] = -1780988542;
        hw.gein[15] = 173745401;
        hw.gein[16] = 1280317704;
        hw.gein[17] = 1436316346;
        hw.gein[18] = -1608839664;
        hw.gein[19] = -1343289295;
        hw.gein[20] = -1917637890;
        hw.gein[21] = 982431276;
        hw.gein[22] = 2112610413;
        hw.gein[23] = 4223323;
        hw.gein[24] = 882698885;
        hw.gein[25] = -1165813812;
        hw.gein[26] = 1151462322;
        hw.gein[27] = 1966308899;
        hw.gein[28] = -566743695;
        hw.gein[29] = 405141518;
        hw.gein[30] = -1781094378;
        hw.gein[31] = -199242053;
        hw.gein[32] = -1923948371;
        hw.gein[33] = 928352609;
        hw.gein[34] = 1866916974;
        hw.gein[35] = 1886904083;
        hw.gein[36] = -1716274340;
        hw.gein[37] = -524194176;
        hw.gein[38] = 729327607;
        hw.gein[39] = 1408253767;
        hw.gein[40] = 843829825;
        hw.gein[41] = -682314360;
        hw.gein[42] = -307074010;
        hw.gein[43] = -2071627355;
        hw.gein[44] = 1756131549;
        hw.gein[45] = 705731322;
        hw.gein[46] = 666360924;
        hw.gein[47] = -684297832;
        hw.gein[48] = 1602056560;
        hw.gein[49] = 1352839281;
        hw.gein[50] = 2111663907;
        hw.gein[51] = -655618430;
        hw.gein[52] = 286658158;
        hw.gein[53] = 695693729;
        hw.gein[54] = 2133071113;
        hw.gein[55] = -246639579;
        hw.gein[56] = 158410877;
        hw.gein[57] = -1460335497;
        hw.gein[58] = -1651342556;
        hw.gein[59] = -705833887;
        hw.gein[60] = -725703417;
        hw.gein[61] = 1172801732;
        hw.gein[62] = 1497533673;
        hw.gein[63] = -2109920856;
        hw.gein[64] = -1323018557;
        hw.gein[65] = -887867848;
        hw.gein[66] = -1808673585;
        hw.gein[67] = -1870304636;
        hw.gein[68] = 808306606;
        hw.gein[69] = -222537560;
        hw.gein[70] = -349768935;
        hw.gein[71] = -1083715224;
        hw.gein[72] = 1542441612;
        hw.gein[73] = 1303571368;
        hw.gein[74] = 980294380;
        hw.gein[75] = -1021222694;
        hw.gein[76] = 450107240;
        hw.gein[77] = -1675042762;
        hw.gein[78] = 1063056621;
        hw.gein[79] = -2020985625;
        hw.gein[80] = -1925931927;
        hw.gein[81] = 323717158;
        hw.gein[82] = -1108188572;
        hw.gein[83] = 1606331606;
        hw.gein[84] = 435558083;
        hw.gein[85] = 951464293;
        hw.gein[86] = 1483570688;
        hw.gein[87] = -913803786;
        hw.gein[88] = 1038798105;
        hw.gein[89] = -1667397591;
        hw.gein[90] = 1844519931;
        hw.gein[91] = -562046220;
        hw.gein[92] = -1648964029;
        hw.gein[93] = 1561487466;
        hw.gein[94] = -1256892291;
        hw.gein[95] = -501074836;
        hw.gein[96] = -822945712;
        hw.gein[97] = -1793338736;
        hw.gein[98] = -1984024515;
        hw.gein[99] = 713445057;
    }

    private static /* synthetic */ void gfbq() {
        hw.geim[300] = -1876708156;
        hw.geim[301] = -2766614;
        hw.geim[302] = -1410308744;
        hw.geim[303] = -2096604292;
        hw.geim[304] = -1859833331;
        hw.geim[305] = 1378918027;
        hw.geim[306] = -929361980;
        hw.geim[307] = 1507681233;
        hw.geim[308] = 105237806;
        hw.geim[309] = -1630718069;
        hw.geim[310] = 1165844317;
        hw.geim[311] = 1212218217;
        hw.geim[312] = -773560104;
        hw.geim[313] = 343477745;
        hw.geim[314] = 62118772;
        hw.geim[315] = 215046768;
        hw.geim[316] = -1968219901;
        hw.geim[317] = -836290930;
        hw.geim[318] = -375283922;
        hw.geim[319] = -1702124690;
        hw.geim[320] = -83123550;
        hw.geim[321] = -1002330352;
        hw.geim[322] = 2070975826;
        hw.geim[323] = -1725874803;
        hw.geim[324] = -943636318;
        hw.geim[325] = -735840307;
        hw.geim[326] = -1292816970;
        hw.geim[327] = -1253854339;
        hw.geim[328] = -1935862410;
        hw.geim[329] = 1295707664;
        hw.geim[330] = 1979211920;
        hw.geim[331] = -1587982090;
        hw.geim[332] = -195792547;
        hw.geim[333] = 1151857955;
        hw.geim[334] = -995010099;
        hw.geim[335] = 894871561;
        hw.geim[336] = -180674477;
        hw.geim[337] = -2105828828;
        hw.geim[338] = 357395191;
        hw.geim[339] = 869123694;
        hw.geim[340] = -515858690;
        hw.geim[341] = 408179622;
        hw.geim[342] = 858216189;
        hw.geim[343] = 1935532182;
        hw.geim[344] = 1255599436;
        hw.geim[345] = -1243121765;
        hw.geim[346] = -1359642979;
        hw.geim[347] = -1018452033;
        hw.geim[348] = 725809846;
        hw.geim[349] = 2011139650;
        hw.geim[350] = 1562658803;
        hw.geim[351] = 140297761;
        hw.geim[352] = 658772326;
        hw.geim[353] = -1136387409;
        hw.geim[354] = -835172332;
        hw.geim[355] = -2135312289;
        hw.geim[356] = -966025772;
        hw.geim[357] = 1879920491;
        hw.geim[358] = 218885769;
        hw.geim[359] = 1779987252;
        hw.geim[360] = 2091430226;
        hw.geim[361] = 1017988430;
        hw.geim[362] = -239813856;
        hw.geim[363] = -1834643451;
    }

    /*
     * Exception decompiling
     */
    int tickCount() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[CASE]], but top level block is 5[SWITCH]
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
    public boolean hasTicksElapsedSinceLastClick(int var1_1) {
        block23: {
            block22: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = hw.nk - hw.geio("geri", gekk(int ), (int)44)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v0 /* !! */  == hw.geio("gerj", geil(int ), (int)178)) break;
                    v0 /* !! */  = (long)hw.geio("gerk", geil(int ), (int)179);
                }
                var4_2 = hw.c;
                v1 /* !! */  = hw.nk;
                if (true) ** GOTO lbl12
                block12: while (true) {
                    v1 /* !! */  = (long)(v2 - hw.geio("gerl", gekk(int ), (int)45));
lbl12:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case -1867516496: {
                            v2 = hw.geio("germ", gekk(int ), (int)46);
                            continue block12;
                        }
                        case -1642024679: {
                            v2 = hw.geio("gern", gekk(int ), (int)47);
                            continue block12;
                        }
                        case 1166007748: {
                            v2 = hw.geio("gero", gekk(int ), (int)48);
                            continue block12;
                        }
                        case 1389359248: {
                            break block12;
                        }
                    }
                    break;
                }
                var3_3 = hw.b;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = hw.nk - hw.geio("gerp", gekk(int ), (int)49)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == hw.geio("gerq", geil(int ), (int)180)) break;
                    v3 /* !! */  = (long)hw.geio("gerr", geil(int ), (int)181);
                }
                var2_4 = hw.a;
                if (var4_2) {
                    throw null;
lbl34:
                    // 3 sources

                    return (boolean)hw.geio("gers", geil(int ), (int)182);
                }
                if (var2_4 || var2_4) ** GOTO lbl34
                v4 /* !! */  = hw.nk;
                if (true) ** GOTO lbl41
                block15: while (true) {
                    v4 /* !! */  = (long)(v5 - hw.geio("gert", gekk(int ), (int)50));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 321084317: {
                            v5 = hw.geio("geru", gekk(int ), (int)51);
                            continue block15;
                        }
                        case 1389359248: {
                            break block15;
                        }
                        case 1720445890: {
                            v5 = hw.geio("gerv", gekk(int ), (int)52);
                            continue block15;
                        }
                    }
                    break;
                }
                v6 = this.lastClickPassed();
                v7 = (long)var1_1 * hw.geio("gerw", gekk(int ), (int)53);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = hw.nk - hw.geio("gerx", gekk(int ), (int)54)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == hw.geio("gery", geil(int ), (int)183)) break;
                    v8 /* !! */  = (long)hw.geio("gerz", geil(int ), (int)184);
                }
                if (v6 < this.serverSyncedDelay(v7)) break block22;
                if (var2_4) ** GOTO lbl34
                v9 = hw.geio("gesa", geil(int ), (int)185);
                if (var4_2) {
                    throw null;
                }
                break block23;
            }
            if (!var2_4 && !var2_4) ** break;
            ** while (true)
            v9 = hw.geio("gesb", geil(int ), (int)186);
        }
        return (boolean)v9;
    }

    private static /* synthetic */ void gfbo() {
        hw.geim[100] = 937962471;
        hw.geim[101] = 439285578;
        hw.geim[102] = 283516797;
        hw.geim[103] = -1836000973;
        hw.geim[104] = -1977626808;
        hw.geim[105] = 394760056;
        hw.geim[106] = 931386057;
        hw.geim[107] = -401067485;
        hw.geim[108] = 111412996;
        hw.geim[109] = 1347547413;
        hw.geim[110] = -107874479;
        hw.geim[111] = -1350032146;
        hw.geim[112] = 58393864;
        hw.geim[113] = -356803928;
        hw.geim[114] = -1111387391;
        hw.geim[115] = 1183542225;
        hw.geim[116] = 1825445361;
        hw.geim[117] = 1712726728;
        hw.geim[118] = 1069930082;
        hw.geim[119] = 558501274;
        hw.geim[120] = 429968341;
        hw.geim[121] = -1065105971;
        hw.geim[122] = -122518340;
        hw.geim[123] = 522773908;
        hw.geim[124] = 1747972367;
        hw.geim[125] = 1147404228;
        hw.geim[126] = 282352993;
        hw.geim[127] = -437784802;
        hw.geim[128] = 1497907239;
        hw.geim[129] = 506063914;
        hw.geim[130] = 721233725;
        hw.geim[131] = -910023660;
        hw.geim[132] = 945891545;
        hw.geim[133] = -810722610;
        hw.geim[134] = 749944800;
        hw.geim[135] = 269158242;
        hw.geim[136] = 944252460;
        hw.geim[137] = 564319035;
        hw.geim[138] = 323934225;
        hw.geim[139] = -1393350007;
        hw.geim[140] = 2112710771;
        hw.geim[141] = 1661768887;
        hw.geim[142] = 1846345840;
        hw.geim[143] = -1272101554;
        hw.geim[144] = -492888961;
        hw.geim[145] = 431168650;
        hw.geim[146] = -532985800;
        hw.geim[147] = -97222392;
        hw.geim[148] = 638517313;
        hw.geim[149] = -632647849;
        hw.geim[150] = -1744440413;
        hw.geim[151] = -284420117;
        hw.geim[152] = 2039941153;
        hw.geim[153] = 1875357870;
        hw.geim[154] = -1180920068;
        hw.geim[155] = 511699737;
        hw.geim[156] = -1669196673;
        hw.geim[157] = 1128155540;
        hw.geim[158] = -891647079;
        hw.geim[159] = -158712729;
        hw.geim[160] = -1559684649;
        hw.geim[161] = -179951313;
        hw.geim[162] = -1654544031;
        hw.geim[163] = 230041601;
        hw.geim[164] = -414187257;
        hw.geim[165] = 2093738575;
        hw.geim[166] = -1563201064;
        hw.geim[167] = -1674443868;
        hw.geim[168] = -2015576699;
        hw.geim[169] = -1228363580;
        hw.geim[170] = 2057910824;
        hw.geim[171] = -1540491045;
        hw.geim[172] = 1824083140;
        hw.geim[173] = 1120424589;
        hw.geim[174] = 1456039747;
        hw.geim[175] = -891616447;
        hw.geim[176] = -1771000412;
        hw.geim[177] = 122554018;
        hw.geim[178] = 1689344291;
        hw.geim[179] = -1710357880;
        hw.geim[180] = -1243857572;
        hw.geim[181] = -707683720;
        hw.geim[182] = -1742318145;
        hw.geim[183] = -645381522;
        hw.geim[184] = -1586860276;
        hw.geim[185] = -504055281;
        hw.geim[186] = -1866828035;
        hw.geim[187] = 455505731;
        hw.geim[188] = 1732234518;
        hw.geim[189] = -1756917266;
        hw.geim[190] = -915965973;
        hw.geim[191] = 885127953;
        hw.geim[192] = 71940165;
        hw.geim[193] = -1280878462;
        hw.geim[194] = -1769848715;
        hw.geim[195] = 1086453851;
        hw.geim[196] = 422621720;
        hw.geim[197] = 1582226981;
        hw.geim[198] = -516544500;
        hw.geim[199] = -1409568283;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public hw() {
        var2_1 /* !! */  = hw.b;
        super();
        this.funTimeTicks = new int[]{10, 11, 10, 13};
        this.spookyTicks = new int[]{11, 10, 13, 10, 12, 11, 12};
        this.defaultTicks = new int[]{10, 11};
        this.lastClickTime = System.currentTimeMillis();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.legitAttackDelay = hw.randomLegitDelay();
                this.legitCooldown = hw.randomLegitCooldown();
                return;
            }
            case 0: {
                while (true) {
                    var2_1 /* !! */  = (int)hw.geio("geip", geil(int ), (int)0);
                }
            }
lbl17:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)hw.geio("geiq", geil(int ), (int)1);
                    ** GOTO lbl30
                    break;
                }
            }
lbl21:
            // 2 sources

            case 2: {
                var2_1 /* !! */  = (int)hw.geio("geir", geil(int ), (int)2);
                ** GOTO lbl17
            }
lbl24:
            // 2 sources

            case 3: {
                var2_1 /* !! */  = (int)hw.geio("geis", geil(int ), (int)3);
                ** GOTO lbl30
            }
            case 4: {
                var2_1 /* !! */  = (int)hw.geio("geit", geil(int ), (int)4);
                ** GOTO lbl21
            }
lbl30:
            // 3 sources

            case 5: {
                var2_1 /* !! */  = (int)hw.geio("geiu", geil(int ), (int)5);
                ** GOTO lbl24
            }
            case 6: 
        }
        var2_1 /* !! */  = (int)hw.geio("geiv", geil(int ), (int)6);
        ** while (true)
    }

    private static /* synthetic */ long gekk(int n2) {
        return gejb[n2] ^ gejc[n2];
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void leaveLegacyMode() {
        v0 /* !! */  = hw.nk;
        block21: while (true) {
            switch ((int)v0 /* !! */ ) {
                case 1389359248: {
                    break block21;
                }
                case 1780691596: {
                    v0 /* !! */  = (long)(hw.geio("gekm", gekk(int ), (int)4) - hw.geio("gekl", gekk(int ), (int)3));
                    continue block21;
                }
            }
            break;
        }
        var3_1 = hw.c;
        v1 /* !! */  = hw.nk;
        if (true) ** GOTO lbl14
        block22: while (true) {
            v1 /* !! */  = (long)(v2 - hw.geio("gekn", gekk(int ), (int)5));
lbl14:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1418744257: {
                    v2 = hw.geio("geko", gekk(int ), (int)6);
                    continue block22;
                }
                case 385120329: {
                    v2 = hw.geio("gekp", gekk(int ), (int)7);
                    continue block22;
                }
                case 1389359248: {
                    break block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = hw.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = hw.nk - hw.geio("gekq", gekk(int ), (int)8)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == hw.geio("gekr", geil(int ), (int)40)) {
                var1_3 = hw.a;
                if (var3_1) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)hw.geio("geks", geil(int ), (int)41);
        }
        if (var1_3 || var1_3) return;
        v4 = hw.geio("gekt", geil(int ), (int)42);
        while (true) {
            block52: {
                if ((v5 /* !! */  = (cfr_temp_2 = hw.nk - hw.geio("geku", gekk(int ), (int)9)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v5 /* !! */  != hw.geio("gekv", geil(int ), (int)43)) break block52;
                this.legacyActive = v4;
                if (var2_2 /* !! */  != 0) {
                    break;
                }
                ** GOTO lbl-1000
            }
            v5 /* !! */  = (long)hw.geio("gekw", geil(int ), (int)44);
        }
        cfr_temp_0 = -2147483648;
        block25: while (true) {
            block53: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_3 || var1_3) return;
                        v6 = hw.geio("gekx", gekk(int ), (int)10);
                        while (true) {
                            if ((v7 /* !! */  = (cfr_temp_3 = hw.nk - hw.geio("geky", gekk(int ), (int)11)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v7 /* !! */  == hw.geio("gekz", geil(int ), (int)45)) {
                                this.legacyUpdateNanos = (long)v6;
                                if (var1_3) return;
                                break;
                            }
                            v7 /* !! */  = (long)hw.geio("gela", geil(int ), (int)46);
                        }
                        if (var1_3) return;
                        while (true) {
                            if ((v8 /* !! */  = (cfr_temp_4 = hw.nk - hw.geio("gelb", gekk(int ), (int)12)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v8 /* !! */  == hw.geio("gelc", geil(int ), (int)47)) {
                                this.legacyClickBudget = 0.0;
                                if (var1_3) return;
                                break;
                            }
                            v8 /* !! */  = (long)hw.geio("geld", geil(int ), (int)48);
                        }
                        if (!var1_3) return;
                        return;
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)hw.geio("gele", geil(int ), (int)49);
                        cfr_temp_0 = 2;
                        if (var3_1) {
                            throw null;
                        }
                        break block53;
                    }
                    case 1: {
                        var2_2 /* !! */  = (int)hw.geio("gelf", geil(int ), (int)50);
                        cfr_temp_0 = 3;
                        if (var3_1) {
                            throw null;
                        }
                        break block53;
                    }
                    case 4: {
                        var2_2 /* !! */  = (int)hw.geio("geli", geil(int ), (int)53);
                        cfr_temp_0 = 8;
                        if (var3_1) {
                            throw null;
                        }
                        break block53;
                    }
                    case 5: {
                        var2_2 /* !! */  = (int)hw.geio("gelj", geil(int ), (int)54);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 7: {
                        var2_2 /* !! */  = (int)hw.geio("gell", geil(int ), (int)56);
                        cfr_temp_0 = 2;
                        if (var3_1) {
                            throw null;
                        }
                        break block53;
                    }
                    case 9: {
                        var2_2 /* !! */  = (int)hw.geio("geln", geil(int ), (int)58);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 2: lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)hw.geio("gelg", geil(int ), (int)51);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 8: {
                        var2_2 /* !! */  = (int)hw.geio("gelm", geil(int ), (int)57);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)hw.geio("gelh", geil(int ), (int)52);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 6: 
                }
                ** GOTO lbl124
            }
            do {
                if (true) continue block25;
lbl124:
                // 2 sources

                var2_2 /* !! */  = (int)hw.geio("gelk", geil(int ), (int)55);
                cfr_temp_0 = 2;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void gfbv() {
        hw.gejb[0] = 2527365631565249695L;
        hw.gejb[1] = 5244673743072242141L;
        hw.gejb[2] = 6361874174782357812L;
        hw.gejb[3] = 3473446719628208098L;
        hw.gejb[4] = -8276684419998218257L;
        hw.gejb[5] = -1892102437198853333L;
        hw.gejb[6] = -5095622047179859453L;
        hw.gejb[7] = 2707638871309636243L;
        hw.gejb[8] = 8797259091151851263L;
        hw.gejb[9] = -8368633382813914113L;
        hw.gejb[10] = 1256287429568194413L;
        hw.gejb[11] = 802193508668936515L;
        hw.gejb[12] = -6951167362534805577L;
        hw.gejb[13] = 7336097746472725482L;
        hw.gejb[14] = -3934229256135419863L;
        hw.gejb[15] = 2179376365624419916L;
        hw.gejb[16] = -6324120385358136733L;
        hw.gejb[17] = -8369636954106922977L;
        hw.gejb[18] = 6283590978721516182L;
        hw.gejb[19] = -3338376538138618753L;
        hw.gejb[20] = -4729615530539267622L;
        hw.gejb[21] = 8146578538927391482L;
        hw.gejb[22] = 4442686153286517303L;
        hw.gejb[23] = 6102781682078194338L;
        hw.gejb[24] = 5380638798425016356L;
        hw.gejb[25] = 5832641704181869141L;
        hw.gejb[26] = 5634438669569916666L;
        hw.gejb[27] = 2154378109886582087L;
        hw.gejb[28] = -2788840823749859188L;
        hw.gejb[29] = -5161770559745511318L;
        hw.gejb[30] = 5300730630870314624L;
        hw.gejb[31] = -6371754226435398736L;
        hw.gejb[32] = -8740528220996307788L;
        hw.gejb[33] = 5709054159685161480L;
        hw.gejb[34] = 993696758388379173L;
        hw.gejb[35] = 1021736655564202956L;
        hw.gejb[36] = -4374724717583071751L;
        hw.gejb[37] = -8597549185065404728L;
        hw.gejb[38] = -1130433671977761499L;
        hw.gejb[39] = -3228206199392850104L;
        hw.gejb[40] = 5034605509602985953L;
        hw.gejb[41] = -5188914447380893125L;
        hw.gejb[42] = 5362361545241291346L;
        hw.gejb[43] = 88965937406591860L;
        hw.gejb[44] = -2612429707021505144L;
        hw.gejb[45] = 8599332809620296650L;
        hw.gejb[46] = 8944521374960387708L;
        hw.gejb[47] = -264160319830244656L;
        hw.gejb[48] = 7185451436390626861L;
        hw.gejb[49] = 7456524401132904994L;
        hw.gejb[50] = 5192060897467969384L;
        hw.gejb[51] = 5406118724156798478L;
        hw.gejb[52] = -120481244463848092L;
        hw.gejb[53] = -1675247167236835682L;
        hw.gejb[54] = 8640416768582312732L;
        hw.gejb[55] = 2798878261695649726L;
        hw.gejb[56] = 3437080191747562468L;
        hw.gejb[57] = -4796728452016057716L;
        hw.gejb[58] = -6736672061796396659L;
        hw.gejb[59] = -2510080964057882654L;
        hw.gejb[60] = 5375595037286127032L;
        hw.gejb[61] = 5281275335043742883L;
        hw.gejb[62] = -8258443903472616L;
        hw.gejb[63] = 8598663396713383921L;
        hw.gejb[64] = 2767736399028907887L;
        hw.gejb[65] = -1097161041343907976L;
        hw.gejb[66] = 3809990133655374960L;
        hw.gejb[67] = 8410506481274117807L;
        hw.gejb[68] = -4868793232696056908L;
        hw.gejb[69] = 918318647100767192L;
        hw.gejb[70] = -5788315630156718128L;
        hw.gejb[71] = -5968405331770029387L;
        hw.gejb[72] = -8141820939436129636L;
        hw.gejb[73] = 4603434702049014070L;
        hw.gejb[74] = -2251332684921394599L;
        hw.gejb[75] = -5549564650058519611L;
        hw.gejb[76] = 9067586617843391560L;
        hw.gejb[77] = -8574905615957790669L;
        hw.gejb[78] = 2928509637463459580L;
        hw.gejb[79] = 1474169369998937015L;
        hw.gejb[80] = 1538487764502166551L;
        hw.gejb[81] = 176434150401475325L;
        hw.gejb[82] = 8851800347293899709L;
        hw.gejb[83] = 2956436901993754231L;
        hw.gejb[84] = -6358256593949275657L;
        hw.gejb[85] = -3969489453597888554L;
        hw.gejb[86] = 6960305322341539634L;
        hw.gejb[87] = -4101837206735609808L;
        hw.gejb[88] = 1832236760633726140L;
        hw.gejb[89] = 1349986410600512725L;
        hw.gejb[90] = 4055052870584470144L;
        hw.gejb[91] = -2121913388894794918L;
        hw.gejb[92] = -7040330190781450946L;
        hw.gejb[93] = 44112424097116504L;
        hw.gejb[94] = -3729131325721463311L;
        hw.gejb[95] = -5577330644721863781L;
        hw.gejb[96] = -4854739215306787391L;
        hw.gejb[97] = -6066834762489569764L;
        hw.gejb[98] = -7696548761891966429L;
        hw.gejb[99] = 2264554176538401288L;
    }

    private static /* synthetic */ void gfby() {
        hw.gejc[100] = -1792305219450228266L;
        hw.gejc[101] = 1777958554925207638L;
        hw.gejc[102] = -1693086865460529677L;
        hw.gejc[103] = 4256248853828561237L;
        hw.gejc[104] = 43563158886659232L;
        hw.gejc[105] = 6694919751846365710L;
        hw.gejc[106] = 3123605090946071361L;
        hw.gejc[107] = -7098634209045019350L;
        hw.gejc[108] = -6049537307139127115L;
        hw.gejc[109] = 1854540136578345114L;
        hw.gejc[110] = -8782478419818888742L;
        hw.gejc[111] = -8126768128502936791L;
        hw.gejc[112] = 7597105681929806458L;
        hw.gejc[113] = -2558624352090560668L;
        hw.gejc[114] = 8508715590396203315L;
        hw.gejc[115] = 5724136121858662218L;
        hw.gejc[116] = 325143669744472798L;
        hw.gejc[117] = -1697665627794422798L;
        hw.gejc[118] = 439092605788374703L;
        hw.gejc[119] = 7213203521275496535L;
        hw.gejc[120] = 8944371140087046406L;
        hw.gejc[121] = -6679259996617306182L;
        hw.gejc[122] = 3592374329305974335L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isAuraCooldownReadyWithin(int var1_1) {
        block118: {
            block117: {
                block116: {
                    block115: {
                        block114: {
                            block113: {
                                block112: {
                                    block111: {
                                        block110: {
                                            block109: {
                                                block108: {
                                                    block107: {
                                                        block106: {
                                                            var13_2 = hw.c;
                                                            var12_3 /* !! */  = hw.b;
                                                            var11_4 = hw.a;
                                                            if (var13_2) {
                                                                throw null;
lbl6:
                                                                // 30 sources

                                                                return (boolean)hw.geio("gesk", geil(int ), (int)195);
                                                            }
                                                            if (var11_4 || var11_4) ** GOTO lbl6
                                                            var2_5 = hn.getInstance();
                                                            if (var11_4 || var11_4) ** GOTO lbl6
                                                            if (var2_5 == null) break block106;
                                                            if (var11_4) ** GOTO lbl6
                                                            if (!var2_5.isState()) break block106;
                                                            if (var11_4) ** GOTO lbl6
                                                            if (var1_1 >= 0) break block107;
                                                            if (var11_4) ** GOTO lbl6
                                                        }
                                                        if (var11_4 || var11_4) ** GOTO lbl6
                                                        return (boolean)hw.geio("gesl", geil(int ), (int)196);
                                                    }
                                                    if (var11_4 || var11_4) ** GOTO lbl6
                                                    if (!var2_5.aimType.isSelected("Legit")) break block108;
                                                    if (var11_4) ** GOTO lbl6
                                                    v0 /* !! */  = this.legitAttackDelay;
                                                    if (var13_2) {
                                                        throw null;
                                                    }
                                                    break block109;
                                                }
                                                if (var11_4 || var11_4) ** GOTO lbl6
                                                v0 /* !! */  = var3_6 /* !! */  = (long)hw.geio("gesm", gekk(int ), (int)55);
                                            }
                                            if (var11_4 || var11_4) ** GOTO lbl6
                                            if (!var2_5.tpsSync.isValue()) break block110;
                                            if (var11_4) ** GOTO lbl6
                                            v1 /* !! */  = this.serverSyncedDelay(var3_6 /* !! */ );
                                            if (var13_2) {
                                                throw null;
                                            }
                                            break block111;
                                        }
                                        if (var11_4 || var11_4) ** GOTO lbl6
                                        v1 /* !! */  = var5_7 /* !! */  = var3_6 /* !! */ ;
                                    }
                                    if (var11_4 || var11_4) ** GOTO lbl6
                                    if (this.lastClickPassed() + (long)var1_1 * hw.geio("gesn", gekk(int ), (int)56) < var5_7 /* !! */ ) break block112;
                                    if (var11_4) ** GOTO lbl6
                                    v2 = hw.geio("geso", geil(int ), (int)197);
                                    if (var13_2) {
                                        throw null;
                                    }
                                    break block113;
                                }
                                if (var11_4 || var11_4) ** GOTO lbl6
                                v2 = var7_8 = hw.geio("gesp", geil(int ), (int)198);
                            }
                            if (var11_4 || var11_4) ** GOTO lbl6
                            var8_9 /* !! */  = hw.mc.field_1724.method_7279();
                            if (var11_4 || var11_4) ** GOTO lbl6
                            if (!Float.isFinite(var8_9 /* !! */ )) break block114;
                            if (var11_4) ** GOTO lbl6
                            if (!(var8_9 /* !! */  <= 0.0f)) break block115;
                            if (var11_4) ** GOTO lbl6
                        }
                        if (var11_4 || var11_4) ** GOTO lbl6
                        var8_9 /* !! */  = (float)hw.geio("gesq", geix(int ), (int)199);
                        if (var11_4) ** GOTO lbl6
                    }
                    if (var11_4 || var11_4) ** GOTO lbl6
                    var9_10 = hw.mc.field_1724.method_7261((float)hw.geio("gesr", geix(int ), (int)200)) + (float)var1_1 / var8_9 /* !! */ ;
                    if (var11_4 || var11_4) ** GOTO lbl6
                    if (!var2_5.aimType.isSelected("Legit")) break block116;
                    if (var11_4) ** GOTO lbl6
                    v3 = this.legitCooldown;
                    if (var13_2) {
                        throw null;
                    }
                    break block117;
                }
                if (var11_4 || var11_4) ** GOTO lbl6
                v3 = var10_11 = this.criticalCooldown();
            }
            if (var11_4 || var11_4) ** GOTO lbl6
            if (var7_8 == false) break block118;
            if (var11_4) ** GOTO lbl6
            if (!(var9_10 >= var10_11)) break block118;
            if (var11_4) ** GOTO lbl6
            v4 = hw.geio("gess", geil(int ), (int)201);
            if (var13_2) {
                throw null;
            }
            ** GOTO lbl96
        }
        if (var11_4) ** GOTO lbl6
        if (var12_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var12_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var11_4) ** break;
                ** continue;
                v4 = hw.geio("gest", geil(int ), (int)202);
lbl96:
                // 2 sources

                return (boolean)v4;
            }
            case 0: {
                var12_3 /* !! */  = (int)hw.geio("gesu", geil(int ), (int)203);
                if (var13_2) {
                    throw null;
                }
            }
            case 1: {
                var12_3 /* !! */  = (int)hw.geio("gesv", geil(int ), (int)204);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl301
            }
lbl106:
            // 2 sources

            case 2: {
                var12_3 /* !! */  = (int)hw.geio("gesw", geil(int ), (int)205);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl254
            }
            case 3: {
                var12_3 /* !! */  = (int)hw.geio("gesx", geil(int ), (int)206);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl121
            }
lbl116:
            // 3 sources

            case 4: {
                var12_3 /* !! */  = (int)hw.geio("gesy", geil(int ), (int)207);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl244
            }
lbl121:
            // 2 sources

            case 5: {
                var12_3 /* !! */  = (int)hw.geio("gesz", geil(int ), (int)208);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl321
            }
lbl126:
            // 2 sources

            case 6: {
                var12_3 /* !! */  = (int)hw.geio("geta", geil(int ), (int)209);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl254
            }
            case 7: {
                var12_3 /* !! */  = (int)hw.geio("getb", geil(int ), (int)210);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl305
            }
            case 8: {
                var12_3 /* !! */  = (int)hw.geio("getc", geil(int ), (int)211);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl141:
            // 3 sources

            case 9: {
                var12_3 /* !! */  = (int)hw.geio("getd", geil(int ), (int)212);
                if (!var13_2) break;
                throw null;
            }
            case 10: {
                var12_3 /* !! */  = (int)hw.geio("gete", geil(int ), (int)213);
                if (!var13_2) ** GOTO lbl116
                throw null;
            }
lbl149:
            // 2 sources

            case 11: {
                var12_3 /* !! */  = (int)hw.geio("getf", geil(int ), (int)214);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl268
            }
lbl154:
            // 3 sources

            case 12: {
                var12_3 /* !! */  = (int)hw.geio("getg", geil(int ), (int)215);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl301
            }
lbl159:
            // 2 sources

            case 13: {
                var12_3 /* !! */  = (int)hw.geio("geth", geil(int ), (int)216);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl277
            }
            case 14: {
                var12_3 /* !! */  = (int)hw.geio("geti", geil(int ), (int)217);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl249
            }
            case 15: {
                var12_3 /* !! */  = (int)hw.geio("getj", geil(int ), (int)218);
                if (!var13_2) ** GOTO lbl116
                throw null;
            }
lbl173:
            // 3 sources

            case 16: {
                var12_3 /* !! */  = (int)hw.geio("getk", geil(int ), (int)219);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl205
            }
lbl178:
            // 2 sources

            case 17: {
                var12_3 /* !! */  = (int)hw.geio("getl", geil(int ), (int)220);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl277
            }
            case 18: {
                var12_3 /* !! */  = (int)hw.geio("getm", geil(int ), (int)221);
                if (!var13_2) ** GOTO lbl149
                throw null;
            }
            case 19: {
                var12_3 /* !! */  = (int)hw.geio("getn", geil(int ), (int)222);
                if (!var13_2) ** GOTO lbl126
                throw null;
            }
            case 20: {
                var12_3 /* !! */  = (int)hw.geio("geto", geil(int ), (int)223);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl268
            }
lbl196:
            // 2 sources

            case 21: {
                var12_3 /* !! */  = (int)hw.geio("getp", geil(int ), (int)224);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl281
            }
            case 22: {
                var12_3 /* !! */  = (int)hw.geio("getq", geil(int ), (int)225);
                if (!var13_2) ** GOTO lbl141
                throw null;
            }
lbl205:
            // 2 sources

            case 23: {
                var12_3 /* !! */  = (int)hw.geio("getr", geil(int ), (int)226);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl215
            }
            case 24: {
                var12_3 /* !! */  = (int)hw.geio("gets", geil(int ), (int)227);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl263
            }
lbl215:
            // 2 sources

            case 25: {
                var12_3 /* !! */  = (int)hw.geio("gett", geil(int ), (int)228);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl259
            }
lbl220:
            // 2 sources

            case 26: {
                var12_3 /* !! */  = (int)hw.geio("getu", geil(int ), (int)229);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl259
            }
            case 27: {
                var12_3 /* !! */  = (int)hw.geio("getv", geil(int ), (int)230);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl277
            }
            case 28: {
                var12_3 /* !! */  = (int)hw.geio("getw", geil(int ), (int)231);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl317
            }
lbl235:
            // 2 sources

            case 29: {
                var12_3 /* !! */  = (int)hw.geio("getx", geil(int ), (int)232);
                if (!var13_2) ** GOTO lbl178
                throw null;
            }
            case 30: {
                var12_3 /* !! */  = (int)hw.geio("gety", geil(int ), (int)233);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl317
            }
lbl244:
            // 2 sources

            case 31: {
                var12_3 /* !! */  = (int)hw.geio("getz", geil(int ), (int)234);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl254
            }
lbl249:
            // 2 sources

            case 32: {
                var12_3 /* !! */  = (int)hw.geio("geua", geil(int ), (int)235);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl297
            }
lbl254:
            // 5 sources

            case 33: {
                var12_3 /* !! */  = (int)hw.geio("geub", geil(int ), (int)236);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl317
            }
lbl259:
            // 3 sources

            case 34: {
                var12_3 /* !! */  = (int)hw.geio("geuc", geil(int ), (int)237);
                if (!var13_2) ** GOTO lbl173
                throw null;
            }
lbl263:
            // 2 sources

            case 35: {
                var12_3 /* !! */  = (int)hw.geio("geud", geil(int ), (int)238);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl281
            }
lbl268:
            // 4 sources

            case 36: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var12_3 /* !! */  = (int)hw.geio("geue", geil(int ), (int)239);
                    if (!var13_2) ** GOTO lbl106
                    throw null;
                }
            }
            case 37: {
                var12_3 /* !! */  = (int)hw.geio("geuf", geil(int ), (int)240);
                if (!var13_2) ** GOTO lbl159
                throw null;
            }
lbl277:
            // 4 sources

            case 38: {
                var12_3 /* !! */  = (int)hw.geio("geug", geil(int ), (int)241);
                if (!var13_2) ** GOTO lbl196
                throw null;
            }
lbl281:
            // 3 sources

            case 39: {
                var12_3 /* !! */  = (int)hw.geio("geuh", geil(int ), (int)242);
                if (!var13_2) ** GOTO lbl235
                throw null;
            }
            case 40: {
                var12_3 /* !! */  = (int)hw.geio("geui", geil(int ), (int)243);
                if (!var13_2) ** GOTO lbl254
                throw null;
            }
            case 41: {
                var12_3 /* !! */  = (int)hw.geio("geuj", geil(int ), (int)244);
                if (!var13_2) ** GOTO lbl220
                throw null;
            }
lbl293:
            // 2 sources

            case 42: {
                var12_3 /* !! */  = (int)hw.geio("geuk", geil(int ), (int)245);
                if (!var13_2) ** GOTO lbl173
                throw null;
            }
lbl297:
            // 2 sources

            case 43: {
                var12_3 /* !! */  = (int)hw.geio("geul", geil(int ), (int)246);
                if (!var13_2) ** GOTO lbl293
                throw null;
            }
lbl301:
            // 4 sources

            case 44: {
                var12_3 /* !! */  = (int)hw.geio("geum", geil(int ), (int)247);
                if (!var13_2) ** GOTO lbl268
                throw null;
            }
lbl305:
            // 3 sources

            case 45: {
                var12_3 /* !! */  = (int)hw.geio("geun", geil(int ), (int)248);
                if (!var13_2) ** GOTO lbl141
                throw null;
            }
            case 46: {
                var12_3 /* !! */  = (int)hw.geio("geuo", geil(int ), (int)249);
                if (!var13_2) ** GOTO lbl301
                throw null;
            }
            case 47: {
                var12_3 /* !! */  = (int)hw.geio("geup", geil(int ), (int)250);
                if (!var13_2) break;
                throw null;
            }
lbl317:
            // 4 sources

            case 48: {
                var12_3 /* !! */  = (int)hw.geio("geuq", geil(int ), (int)251);
                if (!var13_2) ** GOTO lbl305
                throw null;
            }
lbl321:
            // 2 sources

            case 49: {
                var12_3 /* !! */  = (int)hw.geio("geur", geil(int ), (int)252);
                if (!var13_2) ** GOTO lbl154
                throw null;
            }
            case 50: 
        }
        var12_3 /* !! */  = (int)hw.geio("geus", geil(int ), (int)253);
        ** while (!var13_2)
lbl328:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gfbn() {
        hw.geim[0] = -1986557820;
        hw.geim[1] = -2087443592;
        hw.geim[2] = 243588019;
        hw.geim[3] = -763178613;
        hw.geim[4] = -814750134;
        hw.geim[5] = 26015808;
        hw.geim[6] = 409463169;
        hw.geim[7] = 2035832605;
        hw.geim[8] = -131701891;
        hw.geim[9] = -100194829;
        hw.geim[10] = 1646896003;
        hw.geim[11] = 2052669087;
        hw.geim[12] = -191140607;
        hw.geim[13] = 247111137;
        hw.geim[14] = -1780988532;
        hw.geim[15] = 173745395;
        hw.geim[16] = 1280317710;
        hw.geim[17] = 1436316351;
        hw.geim[18] = -1608839670;
        hw.geim[19] = -1343289310;
        hw.geim[20] = -1917637892;
        hw.geim[21] = 982431272;
        hw.geim[22] = 2112610423;
        hw.geim[23] = 4223314;
        hw.geim[24] = 882698885;
        hw.geim[25] = -1165813798;
        hw.geim[26] = 1151462321;
        hw.geim[27] = 1966308923;
        hw.geim[28] = -566743694;
        hw.geim[29] = 405141509;
        hw.geim[30] = -1781094399;
        hw.geim[31] = -199242078;
        hw.geim[32] = -1923948376;
        hw.geim[33] = 928352634;
        hw.geim[34] = 1866916973;
        hw.geim[35] = 1886904075;
        hw.geim[36] = -1716274361;
        hw.geim[37] = -524194176;
        hw.geim[38] = 729327601;
        hw.geim[39] = 1408253774;
        hw.geim[40] = 843829824;
        hw.geim[41] = -89406957;
        hw.geim[42] = -307074010;
        hw.geim[43] = -2071627356;
        hw.geim[44] = -1585063636;
        hw.geim[45] = -705731323;
        hw.geim[46] = 1474827611;
        hw.geim[47] = 684297831;
        hw.geim[48] = -1786606565;
        hw.geim[49] = 1352839282;
        hw.geim[50] = 2111663907;
        hw.geim[51] = -655618421;
        hw.geim[52] = 286658155;
        hw.geim[53] = 695693733;
        hw.geim[54] = 2133071116;
        hw.geim[55] = -246639582;
        hw.geim[56] = 158410874;
        hw.geim[57] = -1460335504;
        hw.geim[58] = -1651342557;
        hw.geim[59] = -705833888;
        hw.geim[60] = -339827449;
        hw.geim[61] = 2056567799;
        hw.geim[62] = 1497533672;
        hw.geim[63] = -2109920856;
        hw.geim[64] = -1897638205;
        hw.geim[65] = -887867847;
        hw.geim[66] = -1808673585;
        hw.geim[67] = -1870304635;
        hw.geim[68] = 808306606;
        hw.geim[69] = -843294552;
        hw.geim[70] = -349768936;
        hw.geim[71] = -1083715224;
        hw.geim[72] = 1688405569;
        hw.geim[73] = 1303571369;
        hw.geim[74] = 980294380;
        hw.geim[75] = -1021222758;
        hw.geim[76] = 450107240;
        hw.geim[77] = -1675042755;
        hw.geim[78] = 1063056604;
        hw.geim[79] = -2020985656;
        hw.geim[80] = -1925931926;
        hw.geim[81] = 323717134;
        hw.geim[82] = -1108188584;
        hw.geim[83] = 1606331646;
        hw.geim[84] = 435558115;
        hw.geim[85] = 951464316;
        hw.geim[86] = 1483570734;
        hw.geim[87] = -913803840;
        hw.geim[88] = 1038798109;
        hw.geim[89] = -1667397609;
        hw.geim[90] = 1844519911;
        hw.geim[91] = -562046256;
        hw.geim[92] = -1648964002;
        hw.geim[93] = 1561487466;
        hw.geim[94] = -1256892320;
        hw.geim[95] = -501074838;
        hw.geim[96] = -822945713;
        hw.geim[97] = -1793338704;
        hw.geim[98] = -1984024568;
        hw.geim[99] = 713445080;
    }

    private static /* synthetic */ void gfbx() {
        hw.gejc[0] = 2072502069200829599L;
        hw.gejc[1] = 649960486210873821L;
        hw.gejc[2] = 1747936356541284660L;
        hw.gejc[3] = -1696308673381045752L;
        hw.gejc[4] = 375747458396675929L;
        hw.gejc[5] = 4650654219142361930L;
        hw.gejc[6] = -7962236800801054177L;
        hw.gejc[7] = -3778280517103336350L;
        hw.gejc[8] = -1614751635398808706L;
        hw.gejc[9] = 460807349412668062L;
        hw.gejc[10] = 1256287429568194413L;
        hw.gejc[11] = -2905085464301792578L;
        hw.gejc[12] = 246009243850146353L;
        hw.gejc[13] = 7336097746472725032L;
        hw.gejc[14] = -3934229256135419398L;
        hw.gejc[15] = 2179376365624420238L;
        hw.gejc[16] = 1582436547310730491L;
        hw.gejc[17] = -1306529755471096244L;
        hw.gejc[18] = 685917594456478383L;
        hw.gejc[19] = -7689134626766672890L;
        hw.gejc[20] = 1185227724359903112L;
        hw.gejc[21] = 4697977832188723076L;
        hw.gejc[22] = -8164323749877942952L;
        hw.gejc[23] = -8325795478928956380L;
        hw.gejc[24] = 3974099445006682259L;
        hw.gejc[25] = 3074106687016098522L;
        hw.gejc[26] = -2700445661442449452L;
        hw.gejc[27] = -6944294420331011920L;
        hw.gejc[28] = -4480080944200833801L;
        hw.gejc[29] = -8837424056911198538L;
        hw.gejc[30] = 8302757118032097754L;
        hw.gejc[31] = -1519232194103469314L;
        hw.gejc[32] = 231615571895895858L;
        hw.gejc[33] = 4130184158444269840L;
        hw.gejc[34] = 7665159490036996176L;
        hw.gejc[35] = -3966428959738469377L;
        hw.gejc[36] = 6746282279300828172L;
        hw.gejc[37] = -8099260252093233665L;
        hw.gejc[38] = -3154275850534106302L;
        hw.gejc[39] = -821068560190491245L;
        hw.gejc[40] = -6699079708590703736L;
        hw.gejc[41] = 5410732855398835372L;
        hw.gejc[42] = 504626802795811456L;
        hw.gejc[43] = -1168580537958503750L;
        hw.gejc[44] = 6533680181517429804L;
        hw.gejc[45] = -1678143133182021593L;
        hw.gejc[46] = 3485569144198209229L;
        hw.gejc[47] = 6396649475186190814L;
        hw.gejc[48] = -5873076353989127716L;
        hw.gejc[49] = 2422076533445334562L;
        hw.gejc[50] = -3929877473515907359L;
        hw.gejc[51] = 919816300132395626L;
        hw.gejc[52] = 8775560313917519505L;
        hw.gejc[53] = -1675247167236835668L;
        hw.gejc[54] = -8891280536538621576L;
        hw.gejc[55] = 2798878261695649404L;
        hw.gejc[56] = 3437080191747562454L;
        hw.gejc[57] = -4887323424559051132L;
        hw.gejc[58] = -4305581778693928021L;
        hw.gejc[59] = 6955535866268756621L;
        hw.gejc[60] = 4772502962457884015L;
        hw.gejc[61] = -506251508506925700L;
        hw.gejc[62] = 9047163604715874785L;
        hw.gejc[63] = 1385021359826054565L;
        hw.gejc[64] = 376407604161816533L;
        hw.gejc[65] = -3974621238523427791L;
        hw.gejc[66] = -1444641615876197871L;
        hw.gejc[67] = -8458639428738282453L;
        hw.gejc[68] = -2022854419173945469L;
        hw.gejc[69] = 5584493721272371422L;
        hw.gejc[70] = 3507694656418077668L;
        hw.gejc[71] = -2357143829242648425L;
        hw.gejc[72] = -1196262539945815027L;
        hw.gejc[73] = 6769855009470438609L;
        hw.gejc[74] = 3672394289360638361L;
        hw.gejc[75] = 5612054402422703410L;
        hw.gejc[76] = -4011761922691311411L;
        hw.gejc[77] = 8005455053775797779L;
        hw.gejc[78] = 3859030163262216953L;
        hw.gejc[79] = -3560898982470526627L;
        hw.gejc[80] = 3595808847292218691L;
        hw.gejc[81] = -397170673600063759L;
        hw.gejc[82] = -3626803873717755164L;
        hw.gejc[83] = -2044276048382828782L;
        hw.gejc[84] = -2464459880339399396L;
        hw.gejc[85] = 4509891886532478010L;
        hw.gejc[86] = 7822662496628168870L;
        hw.gejc[87] = 1170017245295625697L;
        hw.gejc[88] = 969961011928944758L;
        hw.gejc[89] = 703571817136100839L;
        hw.gejc[90] = -1077404104402303562L;
        hw.gejc[91] = 345852960424600880L;
        hw.gejc[92] = 7938497924356284388L;
        hw.gejc[93] = -5287890685261840435L;
        hw.gejc[94] = -2147623518955465259L;
        hw.gejc[95] = 8966268724620650922L;
        hw.gejc[96] = -12263612043861254L;
        hw.gejc[97] = -5449580154953835659L;
        hw.gejc[98] = 174025725974293763L;
        hw.gejc[99] = 608449838066524077L;
    }

    private static /* synthetic */ void gfbu() {
        hw.gein[300] = -1876708153;
        hw.gein[301] = -2766622;
        hw.gein[302] = -1410308751;
        hw.gein[303] = -2096604290;
        hw.gein[304] = -1859833340;
        hw.gein[305] = 1378918019;
        hw.gein[306] = -929361978;
        hw.gein[307] = 1507681234;
        hw.gein[308] = 105237799;
        hw.gein[309] = 1630718068;
        hw.gein[310] = -96698625;
        hw.gein[311] = 1212218219;
        hw.gein[312] = -773560103;
        hw.gein[313] = 343477747;
        hw.gein[314] = 62118772;
        hw.gein[315] = -215046769;
        hw.gein[316] = 2035944912;
        hw.gein[317] = 836290929;
        hw.gein[318] = 1317522532;
        hw.gein[319] = -1536705770;
        hw.gein[320] = 83123549;
        hw.gein[321] = -115727153;
        hw.gein[322] = 1142354740;
        hw.gein[323] = -1504556751;
        hw.gein[324] = -943636319;
        hw.gein[325] = -735840308;
        hw.gein[326] = -1292816972;
        hw.gein[327] = -1253854338;
        hw.gein[328] = 1730235413;
        hw.gein[329] = -1295707665;
        hw.gein[330] = 1979211920;
        hw.gein[331] = -1587982089;
        hw.gein[332] = -195792545;
        hw.gein[333] = 1151857970;
        hw.gein[334] = -995010105;
        hw.gein[335] = 894871559;
        hw.gein[336] = -180674486;
        hw.gein[337] = -2105828802;
        hw.gein[338] = 357395171;
        hw.gein[339] = 869123687;
        hw.gein[340] = -515858692;
        hw.gein[341] = 408179623;
        hw.gein[342] = 858216177;
        hw.gein[343] = 1935532190;
        hw.gein[344] = 1255599450;
        hw.gein[345] = -1243121787;
        hw.gein[346] = -1359643004;
        hw.gein[347] = -1018452041;
        hw.gein[348] = 725809835;
        hw.gein[349] = 2011139651;
        hw.gein[350] = 1562658814;
        hw.gein[351] = 140297780;
        hw.gein[352] = 658772347;
        hw.gein[353] = -1136387402;
        hw.gein[354] = -835172334;
        hw.gein[355] = -2135312318;
        hw.gein[356] = -966025791;
        hw.gein[357] = 1879920497;
        hw.gein[358] = 218885764;
        hw.gein[359] = 1779987245;
        hw.gein[360] = 2091430212;
        hw.gein[361] = 1017988438;
        hw.gein[362] = -239813837;
        hw.gein[363] = -1834643435;
    }

    private static /* synthetic */ void gfbt() {
        hw.gein[200] = 982349055;
        hw.gein[201] = 179844640;
        hw.gein[202] = 2132538923;
        hw.gein[203] = -1273123823;
        hw.gein[204] = -1154953785;
        hw.gein[205] = -627841376;
        hw.gein[206] = -122345516;
        hw.gein[207] = -1010001501;
        hw.gein[208] = -570721356;
        hw.gein[209] = 1752931043;
        hw.gein[210] = -1358067392;
        hw.gein[211] = 1740614567;
        hw.gein[212] = -1950354303;
        hw.gein[213] = 1049129666;
        hw.gein[214] = 570309480;
        hw.gein[215] = -1634016635;
        hw.gein[216] = 1238364996;
        hw.gein[217] = 564538114;
        hw.gein[218] = -1103013944;
        hw.gein[219] = 1803411574;
        hw.gein[220] = -1105703982;
        hw.gein[221] = -394266903;
        hw.gein[222] = 406162532;
        hw.gein[223] = -450302156;
        hw.gein[224] = -1091825566;
        hw.gein[225] = -680993005;
        hw.gein[226] = 376501263;
        hw.gein[227] = -1686098704;
        hw.gein[228] = 1865543024;
        hw.gein[229] = -831866491;
        hw.gein[230] = 192065258;
        hw.gein[231] = 685773961;
        hw.gein[232] = -1179590685;
        hw.gein[233] = -708571390;
        hw.gein[234] = -457769173;
        hw.gein[235] = -868887302;
        hw.gein[236] = 49260913;
        hw.gein[237] = -1597079139;
        hw.gein[238] = -815141345;
        hw.gein[239] = -1593758701;
        hw.gein[240] = 1651287874;
        hw.gein[241] = 751601807;
        hw.gein[242] = -1406091919;
        hw.gein[243] = 1250736235;
        hw.gein[244] = 1210707667;
        hw.gein[245] = 2042008906;
        hw.gein[246] = -1807570772;
        hw.gein[247] = -1157302636;
        hw.gein[248] = 1826870557;
        hw.gein[249] = -1676872243;
        hw.gein[250] = 2123217661;
        hw.gein[251] = -1528472176;
        hw.gein[252] = -133807115;
        hw.gein[253] = -1053489094;
        hw.gein[254] = 953647541;
        hw.gein[255] = -1187146843;
        hw.gein[256] = 1586843420;
        hw.gein[257] = -900769234;
        hw.gein[258] = -1616150670;
        hw.gein[259] = -389269423;
        hw.gein[260] = -509023687;
        hw.gein[261] = 2133422093;
        hw.gein[262] = 394271570;
        hw.gein[263] = 801796998;
        hw.gein[264] = 1536680700;
        hw.gein[265] = -2034655859;
        hw.gein[266] = 1822486672;
        hw.gein[267] = -338846368;
        hw.gein[268] = -1166379574;
        hw.gein[269] = -1577511566;
        hw.gein[270] = -849395165;
        hw.gein[271] = 1693096976;
        hw.gein[272] = 958926179;
        hw.gein[273] = -1376909819;
        hw.gein[274] = 1826382886;
        hw.gein[275] = 62697496;
        hw.gein[276] = -1431740235;
        hw.gein[277] = -1012437388;
        hw.gein[278] = -751000723;
        hw.gein[279] = -1387060198;
        hw.gein[280] = -1939278902;
        hw.gein[281] = 612805923;
        hw.gein[282] = 1410531562;
        hw.gein[283] = -592281927;
        hw.gein[284] = -380822002;
        hw.gein[285] = -74476204;
        hw.gein[286] = -2142653260;
        hw.gein[287] = 344637907;
        hw.gein[288] = -1057991873;
        hw.gein[289] = -584094815;
        hw.gein[290] = -178097782;
        hw.gein[291] = -1706642715;
        hw.gein[292] = -640128163;
        hw.gein[293] = 1056464018;
        hw.gein[294] = 1452739468;
        hw.gein[295] = -1482818845;
        hw.gein[296] = 1711575190;
        hw.gein[297] = -734010170;
        hw.gein[298] = -755000495;
        hw.gein[299] = -748664751;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isCooldownComplete(boolean var1_1, int var2_2) {
        block138: {
            block140: {
                block139: {
                    block135: {
                        block137: {
                            block136: {
                                var11_3 = hw.c;
                                var10_4 /* !! */  = hw.b;
                                var9_5 = hw.a;
                                if (var11_3) {
                                    throw null;
lbl6:
                                    // 37 sources

                                    return (boolean)hw.geio("gelo", geil(int ), (int)59);
                                }
                                if (var9_5 || var9_5) ** GOTO lbl6
                                var3_6 = hk.getInstance();
                                if (var9_5 || var9_5) ** GOTO lbl6
                                if (var3_6 == null) break block135;
                                if (var9_5) ** GOTO lbl6
                                if (!var3_6.isActiveForCurrentState()) break block135;
                                if (var9_5) ** GOTO lbl6
                                if (!var3_6.isWebModeActive()) break block135;
                                if (var9_5 || var9_5) ** GOTO lbl6
                                if (this.lastClickPassed() < this.serverSyncedDelay((long)hw.geio("gelp", gekk(int ), (int)13))) break block136;
                                if (var9_5) ** GOTO lbl6
                                if (!(hw.mc.field_1724.method_7261((float)hw.geio("gelq", geix(int ), (int)60)) >= hw.geio("gelr", geix(int ), (int)61))) break block136;
                                if (var9_5) ** GOTO lbl6
                                v0 = hw.geio("gels", geil(int ), (int)62);
                                if (var11_3) {
                                    throw null;
                                }
                                break block137;
                            }
                            if (var9_5 || var9_5) ** GOTO lbl6
                            v0 = hw.geio("gelt", geil(int ), (int)63);
                        }
                        return (boolean)v0;
                    }
                    if (var9_5 || var9_5) ** GOTO lbl6
                    if (var3_6 == null) break block138;
                    if (var9_5) ** GOTO lbl6
                    if (!var3_6.isActiveForCurrentState()) break block138;
                    if (var9_5) ** GOTO lbl6
                    if (!var3_6.isSlowFallingModeActive()) break block138;
                    if (var9_5 || var9_5) ** GOTO lbl6
                    if (this.lastClickPassed() < this.serverSyncedDelay((long)hw.geio("gelu", gekk(int ), (int)14))) break block139;
                    if (var9_5) ** GOTO lbl6
                    if (!(hw.mc.field_1724.method_7261((float)hw.geio("gelv", geix(int ), (int)64)) >= this.criticalCooldown())) break block139;
                    if (var9_5) ** GOTO lbl6
                    v1 = hw.geio("gelw", geil(int ), (int)65);
                    if (var11_3) {
                        throw null;
                    }
                    break block140;
                }
                if (var9_5 || var9_5) ** GOTO lbl6
                v1 = hw.geio("gelx", geil(int ), (int)66);
            }
            return (boolean)v1;
        }
        if (var9_5 || var9_5) ** GOTO lbl6
        var4_7 = hn.getInstance();
        if (var9_5 || var9_5) ** GOTO lbl6
        if (var4_7 == null) ** GOTO lbl110
        if (var9_5) ** GOTO lbl6
        if (var10_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var10_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var4_7.isState()) ** GOTO lbl110
                if (var9_5 || var9_5) ** GOTO lbl6
                if (!var4_7.clickType.isSelected("1.8")) ** GOTO lbl73
                if (var9_5 || var9_5) ** GOTO lbl6
                if (!(this.legacyClickBudget >= 1.0)) ** GOTO lbl70
                if (var9_5) ** GOTO lbl6
                v2 = hw.geio("gely", geil(int ), (int)67);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl72
lbl70:
                // 1 sources

                if (var9_5 || var9_5) ** GOTO lbl6
                v2 = hw.geio("gelz", geil(int ), (int)68);
lbl72:
                // 2 sources

                return (boolean)v2;
lbl73:
                // 1 sources

                if (var9_5 || var9_5) ** GOTO lbl6
                if (!var4_7.aimType.isSelected("Legit")) ** GOTO lbl80
                if (var9_5) ** GOTO lbl6
                v3 /* !! */  = this.legitAttackDelay;
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl82
lbl80:
                // 1 sources

                if (var9_5 || var9_5) ** GOTO lbl6
                v3 /* !! */  = var5_8 /* !! */  = (long)hw.geio("gema", gekk(int ), (int)15);
lbl82:
                // 2 sources

                if (var9_5 || var9_5) ** GOTO lbl6
                if (!var4_7.tpsSync.isValue()) ** GOTO lbl89
                if (var9_5) ** GOTO lbl6
                v4 /* !! */  = this.serverSyncedDelay(var5_8 /* !! */ );
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl91
lbl89:
                // 1 sources

                if (var9_5 || var9_5) ** GOTO lbl6
                v4 /* !! */  = var7_10 /* !! */  = var5_8 /* !! */ ;
lbl91:
                // 2 sources

                if (var9_5 || var9_5) ** GOTO lbl6
                if (this.lastClickPassed() < var7_10 /* !! */ ) ** GOTO lbl107
                if (var9_5) ** GOTO lbl6
                v5 = hw.mc.field_1724.method_7261((float)hw.geio("gemb", geix(int ), (int)69));
                if (var4_7.aimType.isSelected("Legit")) {
                    v6 = this.legitCooldown;
                    if (var11_3) {
                        throw null;
                    }
                } else {
                    v6 = this.criticalCooldown();
                }
                if (!(v5 >= v6)) ** GOTO lbl107
                if (var9_5) ** GOTO lbl6
                v7 = hw.geio("gemc", geil(int ), (int)70);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl109
lbl107:
                // 2 sources

                if (var9_5 || var9_5) ** GOTO lbl6
                v7 = hw.geio("gemd", geil(int ), (int)71);
lbl109:
                // 2 sources

                return (boolean)v7;
lbl110:
                // 2 sources

                if (var9_5 || var9_5) ** GOTO lbl6
                var5_9 = this.hasTicksElapsedSinceLastClick(this.tickCount() - var2_2);
                if (var9_5 || var9_5) ** GOTO lbl6
                if (!var5_9) ** GOTO lbl121
                if (var9_5) ** GOTO lbl6
                if (!(hw.mc.field_1724.method_7261((float)var2_2) > hw.geio("geme", geix(int ), (int)72))) ** GOTO lbl121
                if (var9_5) ** GOTO lbl6
                v8 = hw.geio("gemf", geil(int ), (int)73);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl124
lbl121:
                // 2 sources

                if (!var9_5 && !var9_5) ** break;
                ** continue;
                v8 = hw.geio("gemg", geil(int ), (int)74);
lbl124:
                // 2 sources

                return (boolean)v8;
            }
lbl125:
            // 2 sources

            case 0: {
                var10_4 /* !! */  = (int)hw.geio("gemh", geil(int ), (int)75);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl164
            }
lbl130:
            // 2 sources

            case 1: {
                var10_4 /* !! */  = (int)hw.geio("gemi", geil(int ), (int)76);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl326
            }
            case 2: {
                var10_4 /* !! */  = (int)hw.geio("gemj", geil(int ), (int)77);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl394
            }
lbl140:
            // 3 sources

            case 3: {
                var10_4 /* !! */  = (int)hw.geio("gemk", geil(int ), (int)78);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl169
            }
lbl145:
            // 2 sources

            case 4: {
                var10_4 /* !! */  = (int)hw.geio("geml", geil(int ), (int)79);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl250
            }
            case 5: {
                var10_4 /* !! */  = (int)hw.geio("gemm", geil(int ), (int)80);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl240
            }
lbl155:
            // 2 sources

            case 6: {
                var10_4 /* !! */  = (int)hw.geio("gemn", geil(int ), (int)81);
                if (!var11_3) ** GOTO lbl145
                throw null;
            }
lbl159:
            // 2 sources

            case 7: {
                var10_4 /* !! */  = (int)hw.geio("gemo", geil(int ), (int)82);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl394
            }
lbl164:
            // 3 sources

            case 8: {
                var10_4 /* !! */  = (int)hw.geio("gemp", geil(int ), (int)83);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl264
            }
lbl169:
            // 2 sources

            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var10_4 /* !! */  = (int)hw.geio("gemq", geil(int ), (int)84);
                    if (var11_3) {
                        throw null;
                    }
                    ** GOTO lbl322
                    break;
                }
            }
            case 10: {
                var10_4 /* !! */  = (int)hw.geio("gemr", geil(int ), (int)85);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl322
            }
lbl180:
            // 2 sources

            case 11: {
                var10_4 /* !! */  = (int)hw.geio("gems", geil(int ), (int)86);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl268
            }
lbl185:
            // 3 sources

            case 12: {
                var10_4 /* !! */  = (int)hw.geio("gemt", geil(int ), (int)87);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl213
            }
            case 13: {
                var10_4 /* !! */  = (int)hw.geio("gemu", geil(int ), (int)88);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl273
            }
lbl195:
            // 2 sources

            case 14: {
                var10_4 /* !! */  = (int)hw.geio("gemv", geil(int ), (int)89);
                if (!var11_3) ** GOTO lbl180
                throw null;
            }
            case 15: {
                var10_4 /* !! */  = (int)hw.geio("gemw", geil(int ), (int)90);
                if (!var11_3) ** GOTO lbl195
                throw null;
            }
lbl203:
            // 3 sources

            case 16: {
                var10_4 /* !! */  = (int)hw.geio("gemx", geil(int ), (int)91);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl227
            }
            case 17: {
                var10_4 /* !! */  = (int)hw.geio("gemy", geil(int ), (int)92);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl331
            }
lbl213:
            // 2 sources

            case 18: {
                var10_4 /* !! */  = (int)hw.geio("gemz", geil(int ), (int)93);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl283
            }
            case 19: {
                var10_4 /* !! */  = (int)hw.geio("gena", geil(int ), (int)94);
                if (!var11_3) break;
                throw null;
            }
            case 20: {
                var10_4 /* !! */  = (int)hw.geio("genb", geil(int ), (int)95);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl305
            }
lbl227:
            // 4 sources

            case 21: {
                var10_4 /* !! */  = (int)hw.geio("genc", geil(int ), (int)96);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl370
            }
            case 22: {
                var10_4 /* !! */  = (int)hw.geio("gend", geil(int ), (int)97);
                if (!var11_3) ** GOTO lbl140
                throw null;
            }
lbl236:
            // 3 sources

            case 23: {
                var10_4 /* !! */  = (int)hw.geio("gene", geil(int ), (int)98);
                if (!var11_3) ** GOTO lbl185
                throw null;
            }
lbl240:
            // 2 sources

            case 24: {
                var10_4 /* !! */  = (int)hw.geio("genf", geil(int ), (int)99);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl296
            }
lbl245:
            // 3 sources

            case 25: {
                var10_4 /* !! */  = (int)hw.geio("geng", geil(int ), (int)100);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl288
            }
lbl250:
            // 2 sources

            case 26: {
                var10_4 /* !! */  = (int)hw.geio("genh", geil(int ), (int)101);
                if (!var11_3) ** GOTO lbl140
                throw null;
            }
            case 27: {
                var10_4 /* !! */  = (int)hw.geio("geni", geil(int ), (int)102);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl340
            }
lbl259:
            // 2 sources

            case 28: {
                var10_4 /* !! */  = (int)hw.geio("genj", geil(int ), (int)103);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl336
            }
lbl264:
            // 3 sources

            case 29: {
                var10_4 /* !! */  = (int)hw.geio("genk", geil(int ), (int)104);
                if (!var11_3) ** GOTO lbl227
                throw null;
            }
lbl268:
            // 5 sources

            case 30: {
                var10_4 /* !! */  = (int)hw.geio("genl", geil(int ), (int)105);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl331
            }
lbl273:
            // 2 sources

            case 31: {
                var10_4 /* !! */  = (int)hw.geio("genm", geil(int ), (int)106);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl370
            }
            case 32: {
                var10_4 /* !! */  = (int)hw.geio("genn", geil(int ), (int)107);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl313
            }
lbl283:
            // 2 sources

            case 33: {
                var10_4 /* !! */  = (int)hw.geio("geno", geil(int ), (int)108);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl345
            }
lbl288:
            // 2 sources

            case 34: {
                var10_4 /* !! */  = (int)hw.geio("genp", geil(int ), (int)109);
                if (!var11_3) ** GOTO lbl203
                throw null;
            }
            case 35: {
                var10_4 /* !! */  = (int)hw.geio("genq", geil(int ), (int)110);
                if (!var11_3) ** GOTO lbl268
                throw null;
            }
lbl296:
            // 2 sources

            case 36: {
                var10_4 /* !! */  = (int)hw.geio("genr", geil(int ), (int)111);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl366
            }
            case 37: {
                var10_4 /* !! */  = (int)hw.geio("gens", geil(int ), (int)112);
                if (!var11_3) ** GOTO lbl236
                throw null;
            }
lbl305:
            // 2 sources

            case 38: {
                var10_4 /* !! */  = (int)hw.geio("gent", geil(int ), (int)113);
                if (!var11_3) ** GOTO lbl227
                throw null;
            }
            case 39: {
                var10_4 /* !! */  = (int)hw.geio("genu", geil(int ), (int)114);
                if (!var11_3) ** GOTO lbl155
                throw null;
            }
lbl313:
            // 3 sources

            case 40: {
                var10_4 /* !! */  = (int)hw.geio("genv", geil(int ), (int)115);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl362
            }
            case 41: {
                var10_4 /* !! */  = (int)hw.geio("genw", geil(int ), (int)116);
                if (!var11_3) ** GOTO lbl313
                throw null;
            }
lbl322:
            // 4 sources

            case 42: {
                var10_4 /* !! */  = (int)hw.geio("genx", geil(int ), (int)117);
                if (!var11_3) ** GOTO lbl185
                throw null;
            }
lbl326:
            // 2 sources

            case 43: {
                var10_4 /* !! */  = (int)hw.geio("geny", geil(int ), (int)118);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl340
            }
lbl331:
            // 5 sources

            case 44: {
                var10_4 /* !! */  = (int)hw.geio("genz", geil(int ), (int)119);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl358
            }
lbl336:
            // 2 sources

            case 45: {
                var10_4 /* !! */  = (int)hw.geio("geoa", geil(int ), (int)120);
                if (!var11_3) ** GOTO lbl164
                throw null;
            }
lbl340:
            // 3 sources

            case 46: {
                var10_4 /* !! */  = (int)hw.geio("geob", geil(int ), (int)121);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl394
            }
lbl345:
            // 2 sources

            case 47: {
                var10_4 /* !! */  = (int)hw.geio("geoc", geil(int ), (int)122);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl378
            }
            case 48: {
                var10_4 /* !! */  = (int)hw.geio("geod", geil(int ), (int)123);
                if (!var11_3) ** GOTO lbl245
                throw null;
            }
            case 49: {
                var10_4 /* !! */  = (int)hw.geio("geoe", geil(int ), (int)124);
                if (!var11_3) ** GOTO lbl264
                throw null;
            }
lbl358:
            // 4 sources

            case 50: {
                var10_4 /* !! */  = (int)hw.geio("geof", geil(int ), (int)125);
                if (!var11_3) ** GOTO lbl125
                throw null;
            }
lbl362:
            // 2 sources

            case 51: {
                var10_4 /* !! */  = (int)hw.geio("geog", geil(int ), (int)126);
                if (!var11_3) ** GOTO lbl331
                throw null;
            }
lbl366:
            // 3 sources

            case 52: {
                var10_4 /* !! */  = (int)hw.geio("geoh", geil(int ), (int)127);
                if (!var11_3) ** GOTO lbl245
                throw null;
            }
lbl370:
            // 3 sources

            case 53: {
                var10_4 /* !! */  = (int)hw.geio("geoi", geil(int ), (int)128);
                if (!var11_3) ** GOTO lbl331
                throw null;
            }
            case 54: {
                var10_4 /* !! */  = (int)hw.geio("geoj", geil(int ), (int)129);
                if (!var11_3) ** GOTO lbl366
                throw null;
            }
lbl378:
            // 2 sources

            case 55: {
                var10_4 /* !! */  = (int)hw.geio("geok", geil(int ), (int)130);
                if (!var11_3) ** GOTO lbl130
                throw null;
            }
            case 56: {
                var10_4 /* !! */  = (int)hw.geio("geol", geil(int ), (int)131);
                if (!var11_3) ** GOTO lbl236
                throw null;
            }
            case 57: {
                var10_4 /* !! */  = (int)hw.geio("geom", geil(int ), (int)132);
                if (!var11_3) ** GOTO lbl259
                throw null;
            }
            case 58: {
                var10_4 /* !! */  = (int)hw.geio("geon", geil(int ), (int)133);
                if (!var11_3) ** GOTO lbl268
                throw null;
            }
lbl394:
            // 4 sources

            case 59: {
                var10_4 /* !! */  = (int)hw.geio("geoo", geil(int ), (int)134);
                if (!var11_3) ** GOTO lbl322
                throw null;
            }
            case 60: {
                var10_4 /* !! */  = (int)hw.geio("geop", geil(int ), (int)135);
                if (!var11_3) ** GOTO lbl159
                throw null;
            }
            case 61: {
                var10_4 /* !! */  = (int)hw.geio("geoq", geil(int ), (int)136);
                if (!var11_3) ** GOTO lbl203
                throw null;
            }
            case 62: {
                var10_4 /* !! */  = (int)hw.geio("geor", geil(int ), (int)137);
                if (!var11_3) ** GOTO lbl358
                throw null;
            }
            case 63: {
                var10_4 /* !! */  = (int)hw.geio("geos", geil(int ), (int)138);
                if (!var11_3) ** GOTO lbl268
                throw null;
            }
            case 64: {
                var10_4 /* !! */  = (int)hw.geio("geot", geil(int ), (int)139);
                if (!var11_3) ** GOTO lbl358
                throw null;
            }
            case 65: 
        }
        var10_4 /* !! */  = (int)hw.geio("geou", geil(int ), (int)140);
        ** while (!var11_3)
lbl421:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float geix(int n2) {
        return Float.intBitsToFloat(geim[n2] ^ gein[n2]);
    }

    private static /* synthetic */ void gfbs() {
        hw.gein[100] = 937962446;
        hw.gein[101] = 439285613;
        hw.gein[102] = 283516782;
        hw.gein[103] = -1836000975;
        hw.gein[104] = -1977626808;
        hw.gein[105] = 394760044;
        hw.gein[106] = 931386072;
        hw.gein[107] = -401067485;
        hw.gein[108] = 111413007;
        hw.gein[109] = 1347547402;
        hw.gein[110] = -107874492;
        hw.gein[111] = -1350032189;
        hw.gein[112] = 58393917;
        hw.gein[113] = -356803962;
        hw.gein[114] = -1111387364;
        hw.gein[115] = 1183542224;
        hw.gein[116] = 1825445367;
        hw.gein[117] = 1712726740;
        hw.gein[118] = 1069930067;
        hw.gein[119] = 558501300;
        hw.gein[120] = 429968369;
        hw.gein[121] = -1065105962;
        hw.gein[122] = -122518398;
        hw.gein[123] = 522773972;
        hw.gein[124] = 1747972406;
        hw.gein[125] = 1147404237;
        hw.gein[126] = 282352979;
        hw.gein[127] = -437784791;
        hw.gein[128] = 1497907241;
        hw.gein[129] = 506063885;
        hw.gein[130] = 721233698;
        hw.gein[131] = -910023665;
        hw.gein[132] = 945891526;
        hw.gein[133] = -810722576;
        hw.gein[134] = 749944800;
        hw.gein[135] = 269158237;
        hw.gein[136] = 944252461;
        hw.gein[137] = 564318988;
        hw.gein[138] = 323934267;
        hw.gein[139] = -1393349963;
        hw.gein[140] = 2112710753;
        hw.gein[141] = -1661768888;
        hw.gein[142] = 614676822;
        hw.gein[143] = 1272101553;
        hw.gein[144] = -160332680;
        hw.gein[145] = 650791630;
        hw.gein[146] = -532985799;
        hw.gein[147] = 127479186;
        hw.gein[148] = 426337831;
        hw.gein[149] = 632647848;
        hw.gein[150] = 2820617;
        hw.gein[151] = 284420116;
        hw.gein[152] = 1786002037;
        hw.gein[153] = -1875357871;
        hw.gein[154] = 978648354;
        hw.gein[155] = -511699738;
        hw.gein[156] = 296083515;
        hw.gein[157] = -1128155541;
        hw.gein[158] = -1681875495;
        hw.gein[159] = 158712728;
        hw.gein[160] = 1547129575;
        hw.gein[161] = -902489572;
        hw.gein[162] = -1576026854;
        hw.gein[163] = 230041600;
        hw.gein[164] = -414187259;
        hw.gein[165] = 2093738566;
        hw.gein[166] = -1563201070;
        hw.gein[167] = -1674443863;
        hw.gein[168] = -2015576692;
        hw.gein[169] = -1228363584;
        hw.gein[170] = 2057910817;
        hw.gein[171] = -1540491041;
        hw.gein[172] = 1824083151;
        hw.gein[173] = 1120424579;
        hw.gein[174] = 1456039744;
        hw.gein[175] = -891616444;
        hw.gein[176] = -1771000412;
        hw.gein[177] = 122554019;
        hw.gein[178] = 1689344290;
        hw.gein[179] = 1933329604;
        hw.gein[180] = 1243857571;
        hw.gein[181] = -626951559;
        hw.gein[182] = -1742318145;
        hw.gein[183] = 645381521;
        hw.gein[184] = 538761597;
        hw.gein[185] = -504055282;
        hw.gein[186] = -1866828035;
        hw.gein[187] = 455505730;
        hw.gein[188] = 1732234515;
        hw.gein[189] = -1756917265;
        hw.gein[190] = -915965972;
        hw.gein[191] = 885127957;
        hw.gein[192] = 71940160;
        hw.gein[193] = -1280878459;
        hw.gein[194] = -1769848714;
        hw.gein[195] = 1086453850;
        hw.gein[196] = 422621720;
        hw.gein[197] = 1582226980;
        hw.gein[198] = -516544500;
        hw.gein[199] = -363089435;
    }

    private static /* synthetic */ double geja(int n2) {
        return Double.longBitsToDouble(gejb[n2] ^ gejc[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private long serverSyncedDelay(long var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hw.nk - hw.geio("geut", gekk(int ), (int)57)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hw.geio("geuu", geil(int ), (int)254)) break;
            v0 /* !! */  = (long)hw.geio("geuv", geil(int ), (int)255);
        }
        var7_2 = hw.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hw.nk - hw.geio("geuw", gekk(int ), (int)58)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hw.geio("geux", geil(int ), (int)256)) break;
            v1 /* !! */  = (long)hw.geio("geuy", geil(int ), (int)257);
        }
        var6_3 /* !! */  = hw.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = hw.nk - hw.geio("geuz", gekk(int ), (int)59)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hw.geio("geva", geil(int ), (int)258)) break;
            v2 /* !! */  = (long)hw.geio("gevb", geil(int ), (int)259);
        }
        var5_4 = hw.a;
        if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var7_2) {
                    throw null;
lbl27:
                    // 6 sources

                    return (long)hw.geio("gevc", gekk(int ), (int)60);
                }
                if (var5_4 || var5_4) ** GOTO lbl27
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = hw.nk - hw.geio("gevd", gekk(int ), (int)61)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == hw.geio("geve", geil(int ), (int)260)) break;
                    v3 /* !! */  = (long)hw.geio("gevf", geil(int ), (int)261);
                }
                var3_5 /* !! */  = mq.TPS;
                if (var5_4 || var5_4) ** GOTO lbl27
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_4 = hw.nk - hw.geio("gevg", gekk(int ), (int)62)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hw.geio("gevh", geil(int ), (int)262)) break;
                    v4 /* !! */  = (long)hw.geio("gevi", geil(int ), (int)263);
                }
                if (Float.isFinite(var3_5 /* !! */ )) ** GOTO lbl48
                if (var5_4 || var5_4) ** GOTO lbl27
                var3_5 /* !! */  = (float)hw.geio("gevj", geix(int ), (int)264);
                if (var5_4) ** GOTO lbl27
lbl48:
                // 2 sources

                if (var5_4 || var5_4) ** GOTO lbl27
                v5 = hw.geio("gevk", geix(int ), (int)265);
                v6 = hw.geio("gevl", geix(int ), (int)266);
                v7 /* !! */  = hw.nk;
                if (true) ** GOTO lbl55
                block25: while (true) {
                    v7 /* !! */  = (long)(hw.geio("gevn", gekk(int ), (int)64) - hw.geio("gevm", gekk(int ), (int)63));
lbl55:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -405613887: {
                            continue block25;
                        }
                        case 1389359248: {
                            break block25;
                        }
                    }
                    break;
                }
                v8 = Math.min((float)v6, var3_5 /* !! */ );
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_5 = hw.nk - hw.geio("gevo", gekk(int ), (int)65)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v9 /* !! */  == hw.geio("gevp", geil(int ), (int)267)) break;
                    v9 /* !! */  = (long)hw.geio("gevq", geil(int ), (int)268);
                }
                var4_6 = Math.max((float)v5, v8);
                if (!var5_4 && !var5_4) ** break;
                ** continue;
                v10 = (float)var1_1 * (hw.geio("gevr", geix(int ), (int)269) / var4_6);
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_6 = hw.nk - hw.geio("gevs", gekk(int ), (int)66)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v11 /* !! */  == hw.geio("gevt", geil(int ), (int)270)) break;
                    v11 /* !! */  = (long)hw.geio("gevu", geil(int ), (int)271);
                }
                return Math.round(v10);
            }
lbl78:
            // 2 sources

            case 0: {
                var6_3 /* !! */  = (int)hw.geio("gevv", geil(int ), (int)272);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl124
            }
lbl83:
            // 5 sources

            case 1: {
                var6_3 /* !! */  = (int)hw.geio("gevw", geil(int ), (int)273);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl102
            }
lbl88:
            // 2 sources

            case 2: {
                do {
                    var6_3 /* !! */  = (int)hw.geio("gevx", geil(int ), (int)274);
                } while (!var7_2);
                throw null;
            }
            case 3: {
                var6_3 /* !! */  = (int)hw.geio("gevy", geil(int ), (int)275);
                if (!var7_2) ** GOTO lbl83
                throw null;
            }
            case 4: {
                var6_3 /* !! */  = (int)hw.geio("gevz", geil(int ), (int)276);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl114
            }
lbl102:
            // 2 sources

            case 5: {
                var6_3 /* !! */  = (int)hw.geio("gewa", geil(int ), (int)277);
                if (!var7_2) ** GOTO lbl78
                throw null;
            }
            case 6: {
                var6_3 /* !! */  = (int)hw.geio("gewb", geil(int ), (int)278);
                if (!var7_2) ** GOTO lbl83
                throw null;
            }
            case 7: {
                var6_3 /* !! */  = (int)hw.geio("gewc", geil(int ), (int)279);
                if (!var7_2) ** GOTO lbl83
                throw null;
            }
lbl114:
            // 3 sources

            case 8: {
                var6_3 /* !! */  = (int)hw.geio("gewd", geil(int ), (int)280);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl128
            }
            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_3 /* !! */  = (int)hw.geio("gewe", geil(int ), (int)281);
                    if (!var7_2) ** GOTO lbl83
                    throw null;
                }
            }
lbl124:
            // 2 sources

            case 10: {
                var6_3 /* !! */  = (int)hw.geio("gewf", geil(int ), (int)282);
                if (!var7_2) ** GOTO lbl114
                throw null;
            }
lbl128:
            // 2 sources

            case 11: {
                var6_3 /* !! */  = (int)hw.geio("gewg", geil(int ), (int)283);
                if (!var7_2) ** GOTO lbl88
                throw null;
            }
            case 12: 
        }
        var6_3 /* !! */  = (int)hw.geio("gewh", geil(int ), (int)284);
        ** while (!var7_2)
lbl135:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void recalculate() {
        v0 /* !! */  = hw.nk;
        if (true) ** GOTO lbl5
        block37: while (true) {
            v0 /* !! */  = (long)(v1 - hw.geio("gewz", gekk(int ), (int)78));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1348424312: {
                    v1 = hw.geio("gexa", gekk(int ), (int)79);
                    continue block37;
                }
                case -1326067590: {
                    v1 = hw.geio("gexb", gekk(int ), (int)80);
                    continue block37;
                }
                case 1389359248: {
                    break block37;
                }
            }
            break;
        }
        var3_1 = hw.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hw.nk - hw.geio("gexc", gekk(int ), (int)81)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == hw.geio("gexd", geil(int ), (int)291)) break;
            v2 /* !! */  = (long)hw.geio("gexe", geil(int ), (int)292);
        }
        var2_2 /* !! */  = hw.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = hw.nk - hw.geio("gexf", gekk(int ), (int)82)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == hw.geio("gexg", geil(int ), (int)293)) break;
            v3 /* !! */  = (long)hw.geio("gexh", geil(int ), (int)294);
        }
        var1_3 = hw.a;
        if (var3_1) {
            throw null;
lbl29:
            // 4 sources

            return;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl29
                v4 /* !! */  = hw.nk;
                if (true) ** GOTO lbl39
                block41: while (true) {
                    v4 /* !! */  = (long)(v5 - hw.geio("gexi", gekk(int ), (int)83));
lbl39:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1419570376: {
                            v5 = hw.geio("gexj", gekk(int ), (int)84);
                            continue block41;
                        }
                        case -1215452639: {
                            v5 = hw.geio("gexk", gekk(int ), (int)85);
                            continue block41;
                        }
                        case 96194097: {
                            v5 = hw.geio("gexl", gekk(int ), (int)86);
                            continue block41;
                        }
                        case 1389359248: {
                            break block41;
                        }
                    }
                    break;
                }
                v6 = System.currentTimeMillis();
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = hw.nk - hw.geio("gexm", gekk(int ), (int)87)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == hw.geio("gexn", geil(int ), (int)295)) break;
                    v7 /* !! */  = (long)hw.geio("gexo", geil(int ), (int)296);
                }
                this.lastClickTime = v6;
                if (var1_3 || var1_3) ** GOTO lbl29
                v8 /* !! */  = hw.nk;
                if (true) ** GOTO lbl63
                block43: while (true) {
                    v8 /* !! */  = (long)(v9 - hw.geio("gexp", gekk(int ), (int)88));
lbl63:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case 770876391: {
                            v9 = hw.geio("gexq", gekk(int ), (int)89);
                            continue block43;
                        }
                        case 1166915153: {
                            v9 = hw.geio("gexr", gekk(int ), (int)90);
                            continue block43;
                        }
                        case 1389359248: {
                            break block43;
                        }
                    }
                    break;
                }
                v10 = hw.randomLegitDelay();
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = hw.nk - hw.geio("gexs", gekk(int ), (int)91)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == hw.geio("gext", geil(int ), (int)297)) break;
                    v11 /* !! */  = (long)hw.geio("gexu", geil(int ), (int)298);
                }
                this.legitAttackDelay = v10;
                if (var1_3 || var1_3) ** GOTO lbl29
                v12 /* !! */  = hw.nk;
                if (true) ** GOTO lbl84
                block45: while (true) {
                    v12 /* !! */  = (long)(v13 - hw.geio("gexv", gekk(int ), (int)92));
lbl84:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1640971643: {
                            v13 = hw.geio("gexw", gekk(int ), (int)93);
                            continue block45;
                        }
                        case -310015664: {
                            v13 = hw.geio("gexx", gekk(int ), (int)94);
                            continue block45;
                        }
                        case 1389359248: {
                            break block45;
                        }
                    }
                    break;
                }
                v14 = hw.randomLegitCooldown();
                v15 /* !! */  = hw.nk;
                if (true) ** GOTO lbl98
                block46: while (true) {
                    v15 /* !! */  = (long)(hw.geio("gexz", gekk(int ), (int)96) - hw.geio("gexy", gekk(int ), (int)95));
lbl98:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case 1389359248: {
                            break block46;
                        }
                        case 1648392572: {
                            continue block46;
                        }
                    }
                    break;
                }
                this.legitCooldown = v14;
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hw.geio("geya", geil(int ), (int)299);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl132
                    break;
                }
            }
lbl112:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)hw.geio("geyb", geil(int ), (int)300);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl141
            }
lbl117:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)hw.geio("geyc", geil(int ), (int)301);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl145
            }
            case 3: {
                var2_2 /* !! */  = (int)hw.geio("geyd", geil(int ), (int)302);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl132
            }
            case 4: {
                var2_2 /* !! */  = (int)hw.geio("geye", geil(int ), (int)303);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl136
            }
lbl132:
            // 3 sources

            case 5: {
                var2_2 /* !! */  = (int)hw.geio("geyf", geil(int ), (int)304);
                if (!var3_1) ** GOTO lbl117
                throw null;
            }
lbl136:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)hw.geio("geyg", geil(int ), (int)305);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl145
            }
lbl141:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)hw.geio("geyh", geil(int ), (int)306);
                if (!var3_1) ** GOTO lbl112
                throw null;
            }
lbl145:
            // 3 sources

            case 8: {
                do {
                    var2_2 /* !! */  = (int)hw.geio("geyi", geil(int ), (int)307);
                } while (!var3_1);
                throw null;
            }
            case 9: 
        }
        var2_2 /* !! */  = (int)hw.geio("geyj", geil(int ), (int)308);
        ** while (!var3_1)
lbl153:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gfbw() {
        hw.gejb[100] = -7242100360279457589L;
        hw.gejb[101] = -8637819135895606900L;
        hw.gejb[102] = 3882546845310009641L;
        hw.gejb[103] = -1765052037349409157L;
        hw.gejb[104] = -8994063897003366719L;
        hw.gejb[105] = 8819466080067508633L;
        hw.gejb[106] = 7763398567244988037L;
        hw.gejb[107] = 4405205758648404554L;
        hw.gejb[108] = -1756898383260192048L;
        hw.gejb[109] = -2824435272086298176L;
        hw.gejb[110] = -8782478419818889137L;
        hw.gejb[111] = -8126768128502936863L;
        hw.gejb[112] = 2472624266914182388L;
        hw.gejb[113] = -7010889120428457812L;
        hw.gejb[114] = -4490548477582638617L;
        hw.gejb[115] = -999731030980757535L;
        hw.gejb[116] = 7401443320295254492L;
        hw.gejb[117] = -3672022751209628134L;
        hw.gejb[118] = 4334640202657032138L;
        hw.gejb[119] = -6347318990219481792L;
        hw.gejb[120] = 2973436485924628525L;
        hw.gejb[121] = 3977558091290907648L;
        hw.gejb[122] = -8371661223642288723L;
    }

    static {
        geim = new int[364];
        gein = new int[364];
        hw.gfbn();
        hw.gfbo();
        hw.gfbp();
        hw.gfbq();
        hw.gfbr();
        hw.gfbs();
        hw.gfbt();
        hw.gfbu();
        gejb = new long[123];
        gejc = new long[123];
        hw.gfbv();
        hw.gfbw();
        hw.gfbx();
        hw.gfby();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int pollLegacyClicks(float var1_1) {
        var8_2 = hw.c;
        var7_3 /* !! */  = hw.b;
        var6_4 = hw.a;
        if (var8_2) {
            throw null;
lbl6:
            // 14 sources

            return (int)hw.geio("geiw", geil(int ), (int)7);
        }
        if (var6_4 || var6_4) ** GOTO lbl6
        var2_5 = System.nanoTime();
        if (var6_4 || var6_4) ** GOTO lbl6
        var1_1 = Math.max(1.0f, Math.min((float)hw.geio("geiy", geix(int ), (int)8), var1_1));
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_4 || var6_4) ** GOTO lbl6
                if (this.legacyActive) ** GOTO lbl27
                if (var6_4 || var6_4) ** GOTO lbl6
                this.legacyActive = hw.geio("geiz", geil(int ), (int)9);
                if (var6_4 || var6_4) ** GOTO lbl6
                this.legacyUpdateNanos = var2_5;
                if (var6_4 || var6_4) ** GOTO lbl6
                this.legacyClickBudget = 1.0;
                if (var6_4) ** GOTO lbl6
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl34
lbl27:
                // 1 sources

                if (var6_4 || var6_4) ** GOTO lbl6
                var4_6 = Math.min((double)hw.geio("gejd", geja(int ), (int)0), (double)(var2_5 - this.legacyUpdateNanos) / hw.geio("geje", geja(int ), (int)1));
                if (var6_4 || var6_4) ** GOTO lbl6
                this.legacyUpdateNanos = var2_5;
                if (var6_4 || var6_4) ** GOTO lbl6
                this.legacyClickBudget = Math.min((double)hw.geio("gejf", geja(int ), (int)2), this.legacyClickBudget + var4_6 * (double)var1_1);
                if (var6_4) ** GOTO lbl6
lbl34:
                // 2 sources

                if (var6_4 || var6_4) ** GOTO lbl6
                var4_7 = Math.min((int)hw.geio("gejg", geil(int ), (int)10), (int)this.legacyClickBudget);
                if (var6_4 || var6_4) ** GOTO lbl6
                this.legacyClickBudget -= (double)var4_7;
                if (!var6_4 && !var6_4) ** break;
                ** continue;
                return var4_7;
            }
            case 0: {
                var7_3 /* !! */  = (int)hw.geio("gejh", geil(int ), (int)11);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl122
            }
lbl46:
            // 3 sources

            case 1: {
                var7_3 /* !! */  = (int)hw.geio("geji", geil(int ), (int)12);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl130
            }
lbl51:
            // 3 sources

            case 2: {
                var7_3 /* !! */  = (int)hw.geio("gejj", geil(int ), (int)13);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl147
            }
lbl56:
            // 2 sources

            case 3: {
                var7_3 /* !! */  = (int)hw.geio("gejk", geil(int ), (int)14);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl99
            }
            case 4: {
                var7_3 /* !! */  = (int)hw.geio("gejl", geil(int ), (int)15);
                if (!var8_2) ** GOTO lbl51
                throw null;
            }
            case 5: {
                var7_3 /* !! */  = (int)hw.geio("gejm", geil(int ), (int)16);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl89
            }
lbl70:
            // 2 sources

            case 6: {
                var7_3 /* !! */  = (int)hw.geio("gejn", geil(int ), (int)17);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl155
            }
lbl75:
            // 3 sources

            case 7: {
                do {
                    var7_3 /* !! */  = (int)hw.geio("gejo", geil(int ), (int)18);
                } while (!var8_2);
                throw null;
            }
lbl80:
            // 2 sources

            case 8: {
                var7_3 /* !! */  = (int)hw.geio("gejp", geil(int ), (int)19);
                if (!var8_2) ** GOTO lbl70
                throw null;
            }
            case 9: {
                var7_3 /* !! */  = (int)hw.geio("gejq", geil(int ), (int)20);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl130
            }
lbl89:
            // 2 sources

            case 10: {
                var7_3 /* !! */  = (int)hw.geio("gejr", geil(int ), (int)21);
                if (!var8_2) ** GOTO lbl46
                throw null;
            }
            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_3 /* !! */  = (int)hw.geio("gejs", geil(int ), (int)22);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl108
                    break;
                }
            }
lbl99:
            // 2 sources

            case 12: {
                var7_3 /* !! */  = (int)hw.geio("gejt", geil(int ), (int)23);
                if (!var8_2) ** GOTO lbl51
                throw null;
            }
            case 13: {
                var7_3 /* !! */  = (int)hw.geio("geju", geil(int ), (int)24);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl130
            }
lbl108:
            // 3 sources

            case 14: {
                var7_3 /* !! */  = (int)hw.geio("gejv", geil(int ), (int)25);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl118
            }
            case 15: {
                var7_3 /* !! */  = (int)hw.geio("gejw", geil(int ), (int)26);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl151
            }
lbl118:
            // 3 sources

            case 16: {
                var7_3 /* !! */  = (int)hw.geio("gejx", geil(int ), (int)27);
                if (!var8_2) ** GOTO lbl46
                throw null;
            }
lbl122:
            // 4 sources

            case 17: {
                var7_3 /* !! */  = (int)hw.geio("gejy", geil(int ), (int)28);
                if (!var8_2) ** GOTO lbl56
                throw null;
            }
lbl126:
            // 2 sources

            case 18: {
                var7_3 /* !! */  = (int)hw.geio("gejz", geil(int ), (int)29);
                if (!var8_2) ** GOTO lbl122
                throw null;
            }
lbl130:
            // 4 sources

            case 19: {
                var7_3 /* !! */  = (int)hw.geio("geka", geil(int ), (int)30);
                if (!var8_2) ** GOTO lbl118
                throw null;
            }
            case 20: {
                var7_3 /* !! */  = (int)hw.geio("gekb", geil(int ), (int)31);
                if (!var8_2) ** GOTO lbl122
                throw null;
            }
            case 21: {
                var7_3 /* !! */  = (int)hw.geio("gekc", geil(int ), (int)32);
                if (!var8_2) ** GOTO lbl75
                throw null;
            }
            case 22: {
                var7_3 /* !! */  = (int)hw.geio("gekd", geil(int ), (int)33);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl155
            }
lbl147:
            // 2 sources

            case 23: {
                var7_3 /* !! */  = (int)hw.geio("geke", geil(int ), (int)34);
                if (!var8_2) ** GOTO lbl75
                throw null;
            }
lbl151:
            // 2 sources

            case 24: {
                var7_3 /* !! */  = (int)hw.geio("gekf", geil(int ), (int)35);
                if (!var8_2) ** GOTO lbl126
                throw null;
            }
lbl155:
            // 3 sources

            case 25: {
                do {
                    var7_3 /* !! */  = (int)hw.geio("gekg", geil(int ), (int)36);
                } while (!var8_2);
                throw null;
            }
            case 26: {
                var7_3 /* !! */  = (int)hw.geio("gekh", geil(int ), (int)37);
                if (!var8_2) ** GOTO lbl108
                throw null;
            }
            case 27: {
                var7_3 /* !! */  = (int)hw.geio("geki", geil(int ), (int)38);
                if (!var8_2) ** GOTO lbl80
                throw null;
            }
            case 28: 
        }
        var7_3 /* !! */  = (int)hw.geio("gekj", geil(int ), (int)39);
        ** while (!var8_2)
lbl171:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float criticalCooldown() {
        block82: {
            block81: {
                v0 /* !! */  = hw.nk;
                if (true) ** GOTO lbl5
                block50: while (true) {
                    v0 /* !! */  = (long)(v1 - hw.geio("geov", gekk(int ), (int)16));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -868330698: {
                            v1 = hw.geio("geow", gekk(int ), (int)17);
                            continue block50;
                        }
                        case -401174132: {
                            v1 = hw.geio("geox", gekk(int ), (int)18);
                            continue block50;
                        }
                        case 162733632: {
                            v1 = hw.geio("geoy", gekk(int ), (int)19);
                            continue block50;
                        }
                        case 1389359248: {
                            break block50;
                        }
                    }
                    break;
                }
                var3_1 = hw.c;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_0 = hw.nk - hw.geio("geoz", gekk(int ), (int)20)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == hw.geio("gepa", geil(int ), (int)141)) break;
                    v2 /* !! */  = (long)hw.geio("gepb", geil(int ), (int)142);
                }
                var2_2 /* !! */  = hw.b;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = hw.nk - hw.geio("gepc", gekk(int ), (int)21)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == hw.geio("gepd", geil(int ), (int)143)) break;
                    v3 /* !! */  = (long)hw.geio("gepe", geil(int ), (int)144);
                }
                var1_3 = hw.a;
                if (var3_1) {
                    throw null;
lbl32:
                    // 7 sources

                    return (float)hw.geio("gepf", geix(int ), (int)145);
                }
                if (var1_3 || var1_3) ** GOTO lbl32
                v4 /* !! */  = hw.nk;
                if (true) ** GOTO lbl39
                block54: while (true) {
                    v4 /* !! */  = (long)(v5 - hw.geio("gepg", gekk(int ), (int)22));
lbl39:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -927704381: {
                            v5 = hw.geio("geph", gekk(int ), (int)23);
                            continue block54;
                        }
                        case 1389359248: {
                            break block54;
                        }
                        case 1412090729: {
                            v5 = hw.geio("gepi", gekk(int ), (int)24);
                            continue block54;
                        }
                    }
                    break;
                }
                v6 /* !! */  = hw.nk;
                if (true) ** GOTO lbl52
                block55: while (true) {
                    v6 /* !! */  = (long)(v7 - hw.geio("gepj", gekk(int ), (int)25));
lbl52:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 6153658: {
                            v7 = hw.geio("gepk", gekk(int ), (int)26);
                            continue block55;
                        }
                        case 674117532: {
                            v7 = hw.geio("gepl", gekk(int ), (int)27);
                            continue block55;
                        }
                        case 1389359248: {
                            break block55;
                        }
                    }
                    break;
                }
                v8 = hw.mc.field_1724;
                v9 /* !! */  = hw.nk;
                if (true) ** GOTO lbl66
                block56: while (true) {
                    v9 /* !! */  = (long)(hw.geio("gepn", gekk(int ), (int)29) - hw.geio("gepm", gekk(int ), (int)28));
lbl66:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case 234746458: {
                            continue block56;
                        }
                        case 1389359248: {
                            break block56;
                        }
                    }
                    break;
                }
                v10 = v8.method_6047();
                v11 /* !! */  = hw.nk;
                if (true) ** GOTO lbl76
                block57: while (true) {
                    v11 /* !! */  = (long)(hw.geio("gepp", gekk(int ), (int)31) - hw.geio("gepo", gekk(int ), (int)30));
lbl76:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case 113170120: {
                            continue block57;
                        }
                        case 1389359248: {
                            break block57;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_2 = hw.nk - hw.geio("gepq", gekk(int ), (int)32)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == hw.geio("gepr", geil(int ), (int)146)) break;
                    v12 /* !! */  = (long)hw.geio("geps", geil(int ), (int)147);
                }
                if (!v10.method_31574(class_1802.field_8162)) break block81;
                if (var1_3 || var1_3) ** GOTO lbl32
                return (float)hw.geio("gept", geix(int ), (int)148);
            }
            if (var1_3 || var1_3) ** GOTO lbl32
            while (true) {
                if ((v13 /* !! */  = (cfr_temp_3 = hw.nk - hw.geio("gepu", gekk(int ), (int)33)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v13 /* !! */  == hw.geio("gepv", geil(int ), (int)149)) break;
                v13 /* !! */  = (long)hw.geio("gepw", geil(int ), (int)150);
            }
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_4 = hw.nk - hw.geio("gepx", gekk(int ), (int)34)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  == hw.geio("gepy", geil(int ), (int)151)) break;
                v14 /* !! */  = (long)hw.geio("gepz", geil(int ), (int)152);
            }
            v15 = hw.mc.field_1724;
            v16 /* !! */  = hw.nk;
            if (true) ** GOTO lbl106
            block61: while (true) {
                v16 /* !! */  = (long)(v17 - hw.geio("geqa", gekk(int ), (int)35));
lbl106:
                // 2 sources

                switch ((int)v16 /* !! */ ) {
                    case -1930962818: {
                        v17 = hw.geio("geqb", gekk(int ), (int)36);
                        continue block61;
                    }
                    case -1035202379: {
                        v17 = hw.geio("geqc", gekk(int ), (int)37);
                        continue block61;
                    }
                    case 1389359248: {
                        break block61;
                    }
                }
                break;
            }
            v18 = v15.method_6047();
            v19 /* !! */  = hw.nk;
            if (true) ** GOTO lbl120
            block62: while (true) {
                v19 /* !! */  = (long)(hw.geio("geqe", gekk(int ), (int)39) - hw.geio("geqd", gekk(int ), (int)38));
lbl120:
                // 2 sources

                switch ((int)v19 /* !! */ ) {
                    case -1901577712: {
                        continue block62;
                    }
                    case 1389359248: {
                        break block62;
                    }
                }
                break;
            }
            if (v18.method_7909() instanceof class_1743) break block82;
            if (var1_3) ** GOTO lbl32
            while (true) {
                if ((v20 /* !! */  = (cfr_temp_5 = hw.nk - hw.geio("geqf", gekk(int ), (int)40)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v20 /* !! */  == hw.geio("geqg", geil(int ), (int)153)) break;
                v20 /* !! */  = (long)hw.geio("geqh", geil(int ), (int)154);
            }
            while (true) {
                if ((v21 /* !! */  = (cfr_temp_6 = hw.nk - hw.geio("geqi", gekk(int ), (int)41)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v21 /* !! */  == hw.geio("geqj", geil(int ), (int)155)) break;
                v21 /* !! */  = (long)hw.geio("geqk", geil(int ), (int)156);
            }
            v22 = hw.mc.field_1724;
            while (true) {
                if ((v23 /* !! */  = (cfr_temp_7 = hw.nk - hw.geio("geql", gekk(int ), (int)42)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v23 /* !! */  == hw.geio("geqm", geil(int ), (int)157)) break;
                v23 /* !! */  = (long)hw.geio("geqn", geil(int ), (int)158);
            }
            v24 = v22.method_6047();
            while (true) {
                if ((v25 /* !! */  = (cfr_temp_8 = hw.nk - hw.geio("geqo", gekk(int ), (int)43)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v25 /* !! */  == hw.geio("geqp", geil(int ), (int)159)) break;
                v25 /* !! */  = (long)hw.geio("geqq", geil(int ), (int)160);
            }
            if (!(v24.method_7909() instanceof class_1821)) ** GOTO lbl157
            if (var1_3) ** GOTO lbl32
        }
        if (var1_3 || var1_3) ** GOTO lbl32
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return (float)hw.geio("geqr", geix(int ), (int)161);
            }
lbl157:
            // 1 sources

            if (!var1_3 && !var1_3) ** break;
            ** continue;
            return (float)hw.geio("geqs", geix(int ), (int)162);
lbl160:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)hw.geio("geqt", geil(int ), (int)163);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)hw.geio("gequ", geil(int ), (int)164);
                } while (!var3_1);
                throw null;
            }
lbl169:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)hw.geio("geqv", geil(int ), (int)165);
                if (!var3_1) ** GOTO lbl160
                throw null;
            }
lbl173:
            // 3 sources

            case 3: {
                var2_2 /* !! */  = (int)hw.geio("geqw", geil(int ), (int)166);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl192
            }
            case 4: {
                var2_2 /* !! */  = (int)hw.geio("geqx", geil(int ), (int)167);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl188
            }
            case 5: {
                var2_2 /* !! */  = (int)hw.geio("geqy", geil(int ), (int)168);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl214
            }
lbl188:
            // 3 sources

            case 6: {
                var2_2 /* !! */  = (int)hw.geio("geqz", geil(int ), (int)169);
                if (!var3_1) ** GOTO lbl169
                throw null;
            }
lbl192:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)hw.geio("gera", geil(int ), (int)170);
                if (!var3_1) ** GOTO lbl173
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)hw.geio("gerb", geil(int ), (int)171);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl214
            }
lbl201:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)hw.geio("gerc", geil(int ), (int)172);
                if (!var3_1) ** GOTO lbl160
                throw null;
            }
lbl205:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)hw.geio("gerd", geil(int ), (int)173);
                if (!var3_1) ** GOTO lbl188
                throw null;
            }
            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hw.geio("gere", geil(int ), (int)174);
                    if (!var3_1) ** GOTO lbl173
                    throw null;
                }
            }
lbl214:
            // 3 sources

            case 12: {
                var2_2 /* !! */  = (int)hw.geio("gerf", geil(int ), (int)175);
                if (!var3_1) ** GOTO lbl201
                throw null;
            }
            case 13: {
                var2_2 /* !! */  = (int)hw.geio("gerg", geil(int ), (int)176);
                if (!var3_1) ** GOTO lbl205
                throw null;
            }
            case 14: 
        }
        var2_2 /* !! */  = (int)hw.geio("gerh", geil(int ), (int)177);
        ** while (!var3_1)
lbl225:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite geio(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ int geil(int n2) {
        return geim[n2] ^ gein[n2];
    }

    private static /* synthetic */ void gfbp() {
        hw.geim[200] = 93156607;
        hw.geim[201] = 179844641;
        hw.geim[202] = 2132538923;
        hw.geim[203] = -1273123819;
        hw.geim[204] = -1154953784;
        hw.geim[205] = -627841360;
        hw.geim[206] = -122345508;
        hw.geim[207] = -1010001478;
        hw.geim[208] = -570721368;
        hw.geim[209] = 1752931045;
        hw.geim[210] = -1358067379;
        hw.geim[211] = 1740614581;
        hw.geim[212] = -1950354275;
        hw.geim[213] = 1049129701;
        hw.geim[214] = 570309450;
        hw.geim[215] = -1634016614;
        hw.geim[216] = 1238365023;
        hw.geim[217] = 564538146;
        hw.geim[218] = -1103013919;
        hw.geim[219] = 1803411543;
        hw.geim[220] = -1105703982;
        hw.geim[221] = -394266937;
        hw.geim[222] = 406162532;
        hw.geim[223] = -450302155;
        hw.geim[224] = -1091825537;
        hw.geim[225] = -680992975;
        hw.geim[226] = 376501257;
        hw.geim[227] = -1686098696;
        hw.geim[228] = 1865543018;
        hw.geim[229] = -831866450;
        hw.geim[230] = 192065261;
        hw.geim[231] = 685773981;
        hw.geim[232] = -1179590678;
        hw.geim[233] = -708571358;
        hw.geim[234] = -457769164;
        hw.geim[235] = -868887328;
        hw.geim[236] = 49260917;
        hw.geim[237] = -1597079160;
        hw.geim[238] = -815141363;
        hw.geim[239] = -1593758689;
        hw.geim[240] = 1651287923;
        hw.geim[241] = 751601798;
        hw.geim[242] = -1406091928;
        hw.geim[243] = 1250736217;
        hw.geim[244] = 1210707656;
        hw.geim[245] = 2042008905;
        hw.geim[246] = -1807570780;
        hw.geim[247] = -1157302656;
        hw.geim[248] = 1826870586;
        hw.geim[249] = -1676872237;
        hw.geim[250] = 2123217631;
        hw.geim[251] = -1528472133;
        hw.geim[252] = -133807105;
        hw.geim[253] = -1053489120;
        hw.geim[254] = -953647542;
        hw.geim[255] = -1527226341;
        hw.geim[256] = -1586843421;
        hw.geim[257] = -829329068;
        hw.geim[258] = 1616150669;
        hw.geim[259] = -1537315340;
        hw.geim[260] = 509023686;
        hw.geim[261] = 131211742;
        hw.geim[262] = 394271571;
        hw.geim[263] = 1864932056;
        hw.geim[264] = 439870204;
        hw.geim[265] = -946233971;
        hw.geim[266] = 755036304;
        hw.geim[267] = 338846367;
        hw.geim[268] = -296225813;
        hw.geim[269] = -531032718;
        hw.geim[270] = 849395164;
        hw.geim[271] = -926516519;
        hw.geim[272] = 958926176;
        hw.geim[273] = -1376909821;
        hw.geim[274] = 1826382880;
        hw.geim[275] = 62697503;
        hw.geim[276] = -1431740236;
        hw.geim[277] = -1012437384;
        hw.geim[278] = -751000732;
        hw.geim[279] = -1387060193;
        hw.geim[280] = -1939278902;
        hw.geim[281] = 612805921;
        hw.geim[282] = 1410531565;
        hw.geim[283] = -592281925;
        hw.geim[284] = -380822001;
        hw.geim[285] = 74476203;
        hw.geim[286] = 1158805176;
        hw.geim[287] = 344637905;
        hw.geim[288] = -1057991874;
        hw.geim[289] = -584094814;
        hw.geim[290] = -178097781;
        hw.geim[291] = 1706642714;
        hw.geim[292] = 817209685;
        hw.geim[293] = -1056464019;
        hw.geim[294] = 2138668496;
        hw.geim[295] = 1482818844;
        hw.geim[296] = 460743417;
        hw.geim[297] = 734010169;
        hw.geim[298] = 1617925541;
        hw.geim[299] = -748664747;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public long lastClickPassed() {
        block35: {
            v0 /* !! */  = hw.nk;
            block23: while (true) {
                switch ((int)v0 /* !! */ ) {
                    case -629406796: {
                        v0 /* !! */  = (long)(hw.geio("gewj", gekk(int ), (int)68) - hw.geio("gewi", gekk(int ), (int)67));
                        continue block23;
                    }
                    case 1389359248: {
                        break block23;
                    }
                }
                break;
            }
            var3_1 = hw.c;
            v1 /* !! */  = hw.nk;
            block24: while (true) {
                switch ((int)v1 /* !! */ ) {
                    case -219214159: {
                        v1 /* !! */  = (long)(hw.geio("gewl", gekk(int ), (int)70) - hw.geio("gewk", gekk(int ), (int)69));
                        continue block24;
                    }
                    case 1389359248: {
                        break block24;
                    }
                }
                break;
            }
            var2_2 /* !! */  = hw.b;
            v2 /* !! */  = hw.nk;
            if (true) ** GOTO lbl23
            block25: while (true) {
                v2 /* !! */  = (long)(v3 - hw.geio("gewm", gekk(int ), (int)71));
lbl23:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case 1091472611: {
                        v3 = hw.geio("gewn", gekk(int ), (int)72);
                        continue block25;
                    }
                    case 1389359248: {
                        break block25;
                    }
                    case 2038632614: {
                        v3 = hw.geio("gewo", gekk(int ), (int)73);
                        continue block25;
                    }
                }
                break;
            }
            var1_3 = hw.a;
            if (var3_1) {
                throw null;
            }
            if (var1_3 != false) return (long)hw.geio("gewp", gekk(int ), (int)74);
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block26: do {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_3 != false) return (long)hw.geio("gewp", gekk(int ), (int)74);
                        v4 /* !! */  = hw.nk;
                        block27: while (true) {
                            switch ((int)v4 /* !! */ ) {
                                case -1205123874: {
                                    v4 /* !! */  = (long)(hw.geio("gewr", gekk(int ), (int)76) - hw.geio("gewq", gekk(int ), (int)75));
                                    continue block27;
                                }
                                case 1389359248: {
                                    break block27;
                                }
                            }
                            break;
                        }
                        v5 = System.currentTimeMillis();
                        while (true) {
                            if ((v6 /* !! */  = (cfr_temp_1 = hw.nk - hw.geio("gews", gekk(int ), (int)77)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v6 /* !! */  == hw.geio("gewt", geil(int ), (int)285)) {
                                return v5 - this.lastClickTime;
                            }
                            v6 /* !! */  = (long)hw.geio("gewu", geil(int ), (int)286);
                        }
                    }
                    case 0: {
                        ** break;
                    }
                    case 3: {
                        break block35;
                    }
lbl62:
                    // 2 sources

                    while (true) {
                        var2_2 /* !! */  = (int)hw.geio("gewv", geil(int ), (int)287);
                        cfr_temp_0 = 1;
                        if (!var3_1) continue block26;
                        throw null;
                    }
                    case 1: {
                        var2_2 /* !! */  = (int)hw.geio("geww", geil(int ), (int)288);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 2: 
                }
                break;
            } while (true);
            var2_2 /* !! */  = (int)hw.geio("gewx", geil(int ), (int)289);
            if (var3_1) {
                throw null;
            }
        }
        var2_2 /* !! */  = (int)hw.geio("gewy", geil(int ), (int)290);
        ** while (!var3_1)
lbl80:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static float randomLegitCooldown() {
        v0 /* !! */  = hw.nk;
        if (true) ** GOTO lbl5
        block10: while (true) {
            v0 /* !! */  = (long)(v1 - hw.geio("gezh", gekk(int ), (int)114));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1774270667: {
                    v1 = hw.geio("gezi", gekk(int ), (int)115);
                    continue block10;
                }
                case -1549485674: {
                    v1 = hw.geio("gezj", gekk(int ), (int)116);
                    continue block10;
                }
                case 1389359248: {
                    break block10;
                }
            }
            break;
        }
        var2 = hw.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hw.nk - hw.geio("gezk", gekk(int ), (int)117)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == hw.geio("gezl", geil(int ), (int)315)) break;
            v2 /* !! */  = (long)hw.geio("gezm", geil(int ), (int)316);
        }
        var1_1 = hw.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = hw.nk - hw.geio("gezn", gekk(int ), (int)118)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == hw.geio("gezo", geil(int ), (int)317)) break;
            v3 /* !! */  = (long)hw.geio("gezp", geil(int ), (int)318);
        }
        var0_2 = hw.a;
        if (var2) {
            throw null;
lbl29:
            // 1 sources

            return (float)hw.geio("gezq", geix(int ), (int)319);
        }
        ** while (var0_2 || var0_2)
lbl32:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = hw.nk - hw.geio("gezr", gekk(int ), (int)119)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == hw.geio("gezs", geil(int ), (int)320)) break;
            v4 /* !! */  = (long)hw.geio("gezt", geil(int ), (int)321);
        }
        v5 = ThreadLocalRandom.current();
        v6 = hw.geio("gezu", geix(int ), (int)322);
        v7 = hw.geio("gezv", geix(int ), (int)323);
        v8 /* !! */  = hw.nk;
        if (true) ** GOTO lbl44
        block15: while (true) {
            v8 /* !! */  = (long)(v9 - hw.geio("gezw", gekk(int ), (int)120));
lbl44:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -996266891: {
                    v9 = hw.geio("gezx", gekk(int ), (int)121);
                    continue block15;
                }
                case -521268921: {
                    v9 = hw.geio("gezy", gekk(int ), (int)122);
                    continue block15;
                }
                case 1389359248: {
                    break block15;
                }
            }
            break;
        }
        return v5.nextFloat((float)v6, (float)v7);
    }
}

