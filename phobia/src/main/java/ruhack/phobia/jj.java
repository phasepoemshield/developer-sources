/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1667
 *  net.minecraft.class_1684
 *  net.minecraft.class_1685
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1935
 *  net.minecraft.class_2338
 *  net.minecraft.class_2338$class_2339
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_3486
 *  net.minecraft.class_3532
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  org.joml.Vector2f
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import net.minecraft.class_1297;
import net.minecraft.class_1667;
import net.minecraft.class_1684;
import net.minecraft.class_1685;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1935;
import net.minecraft.class_2338;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_3486;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import org.joml.Vector2f;
import ruhack.phobia.aw;
import ruhack.phobia.bu;
import ruhack.phobia.dj;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jj$Trajectory;
import ruhack.phobia.jx;
import ruhack.phobia.ke;
import ruhack.phobia.ki;
import ruhack.phobia.kq;
import ruhack.phobia.kv;
import ruhack.phobia.lv;
import ruhack.phobia.nd;
import ruhack.phobia.op;

public class jj
extends ds {
    private boolean trajectoryColorsPrepared;
    private final class_2338.class_2339 predictedBlockPos;
    public static final boolean c;
    private final ke projectiles;
    private static final int MAX_STEPS = 300;
    private final Map<Integer, jj$Trajectory> trajectories;
    private boolean showArrows;
    public static final long td = 141122920156561458L;
    private static int[] krna;
    private static int[] krnb;
    private static long[] krnt;
    private final int[] trajectoryColors;
    private static jj instance;
    private static final class_1799 PEARL_ICON;
    private int lastSelectionMask;
    private static final DecimalFormat TIME_FORMAT;
    private static final class_1799 TRIDENT_ICON;
    private final Vector2f projectedImpact;
    private static long[] krnu;
    private static final float TICK_SECONDS = 0.05f;
    private int lastSimulationAge;
    public static final int b;
    private boolean showPearls;
    private boolean showTridents;
    public static final boolean a;
    private final Set<Integer> visibleTrajectoryIds;
    private static final class_1799 ARROW_ICON;
    private boolean itemModelsQueued;

    private static /* synthetic */ void ksms() {
        jj.krnt[0] = 1105135111502756161L;
        jj.krnt[1] = -5401054393184504795L;
        jj.krnt[2] = 2012779388177446408L;
        jj.krnt[3] = -5251961388854143668L;
        jj.krnt[4] = 4668676824472587953L;
        jj.krnt[5] = 7406840846814542223L;
        jj.krnt[6] = -7564686909156818634L;
        jj.krnt[7] = 8335741935544399673L;
        jj.krnt[8] = 3137796869084111763L;
        jj.krnt[9] = -7511402377038064765L;
        jj.krnt[10] = 4996516661226434121L;
        jj.krnt[11] = -6868074827757148822L;
        jj.krnt[12] = 8334444281677142650L;
        jj.krnt[13] = 6869922134282542345L;
        jj.krnt[14] = -178267699511613257L;
        jj.krnt[15] = -7849298686611995290L;
        jj.krnt[16] = 7272522804678565987L;
        jj.krnt[17] = 1283850656082136062L;
        jj.krnt[18] = -5350731436327946348L;
        jj.krnt[19] = 3142936919395245061L;
        jj.krnt[20] = 4135590640887848729L;
        jj.krnt[21] = -7565524469401791134L;
        jj.krnt[22] = -8842470215621509456L;
        jj.krnt[23] = 5258888675416155379L;
        jj.krnt[24] = -1415712809820105886L;
        jj.krnt[25] = -6945824029085412992L;
        jj.krnt[26] = 4282693272030941359L;
        jj.krnt[27] = 7992426516616938735L;
        jj.krnt[28] = -3117124652275081703L;
        jj.krnt[29] = -1956352115310109177L;
        jj.krnt[30] = 2100466027349147753L;
        jj.krnt[31] = 5801375340383869429L;
        jj.krnt[32] = -8586082464190775658L;
        jj.krnt[33] = 675926643970565942L;
        jj.krnt[34] = 3988916987299063768L;
        jj.krnt[35] = -3151793882024208854L;
        jj.krnt[36] = 6148605270872249267L;
        jj.krnt[37] = 2258783407167712333L;
        jj.krnt[38] = 2142623084748064983L;
        jj.krnt[39] = -5112897314764121313L;
        jj.krnt[40] = -4116776743710254672L;
        jj.krnt[41] = -1441343631241716827L;
        jj.krnt[42] = -7083453950562415484L;
        jj.krnt[43] = 7196289426253117858L;
        jj.krnt[44] = -5348702825183917041L;
        jj.krnt[45] = 5422105133798834910L;
        jj.krnt[46] = 1005092470148960749L;
        jj.krnt[47] = 855426261848630611L;
        jj.krnt[48] = 4011746720624282164L;
        jj.krnt[49] = -2424909433791303370L;
        jj.krnt[50] = 6601630176124718363L;
        jj.krnt[51] = -6408575075087824055L;
        jj.krnt[52] = 5659653024508047677L;
        jj.krnt[53] = 3791293347398419811L;
        jj.krnt[54] = -6546630097422295751L;
        jj.krnt[55] = 7695582096984475755L;
        jj.krnt[56] = 4399757088525204800L;
        jj.krnt[57] = -5730610439501866059L;
        jj.krnt[58] = 2234504094714274809L;
        jj.krnt[59] = 3064012116990700616L;
        jj.krnt[60] = -1030140173932437679L;
        jj.krnt[61] = 8348574665703956482L;
        jj.krnt[62] = -1445886820038634452L;
        jj.krnt[63] = 7698407469241885308L;
        jj.krnt[64] = 3475433146010066256L;
        jj.krnt[65] = -7743206518825454020L;
        jj.krnt[66] = -5711660076488999002L;
        jj.krnt[67] = -899962549906405542L;
        jj.krnt[68] = 7790279510826538455L;
        jj.krnt[69] = 5169015159871280174L;
        jj.krnt[70] = 692756971760233184L;
        jj.krnt[71] = 1775713298650705146L;
        jj.krnt[72] = -7216965157718804597L;
        jj.krnt[73] = 8150264406609553495L;
        jj.krnt[74] = -7993865659461037702L;
        jj.krnt[75] = 6133451151117473900L;
        jj.krnt[76] = -2078356192876237083L;
        jj.krnt[77] = 5850112747341831559L;
        jj.krnt[78] = -7341709948746250629L;
        jj.krnt[79] = -2344680769670176299L;
        jj.krnt[80] = -4468178542038727699L;
        jj.krnt[81] = 2700828767404658743L;
        jj.krnt[82] = -2123999011097116713L;
        jj.krnt[83] = -5438696310831669515L;
        jj.krnt[84] = 753630255609515842L;
        jj.krnt[85] = 8184537862399857255L;
        jj.krnt[86] = 721285334574800829L;
        jj.krnt[87] = 71195278504850071L;
        jj.krnt[88] = 2856558344509208406L;
        jj.krnt[89] = -4689812063668723317L;
        jj.krnt[90] = -8123527021064168754L;
        jj.krnt[91] = 7208007831061768749L;
        jj.krnt[92] = -3411738401693198572L;
        jj.krnt[93] = 5502661617938689995L;
        jj.krnt[94] = -8971126838467698881L;
        jj.krnt[95] = -6084574166731185008L;
        jj.krnt[96] = 6720607410919657601L;
        jj.krnt[97] = -638425618518763657L;
        jj.krnt[98] = -8107374625095742378L;
        jj.krnt[99] = 3202115989132548342L;
    }

    private static /* synthetic */ void ksmi() {
        jj.krna[200] = 864207191;
        jj.krna[201] = 1425639627;
        jj.krna[202] = -1572567276;
        jj.krna[203] = 1197247883;
        jj.krna[204] = 1289349425;
        jj.krna[205] = 1026192924;
        jj.krna[206] = 1116732142;
        jj.krna[207] = -2077215450;
        jj.krna[208] = 743889307;
        jj.krna[209] = 473142910;
        jj.krna[210] = -1283653880;
        jj.krna[211] = -1882060547;
        jj.krna[212] = -258715774;
        jj.krna[213] = 2050925897;
        jj.krna[214] = -53223767;
        jj.krna[215] = -413313551;
        jj.krna[216] = -1568696361;
        jj.krna[217] = -1733989625;
        jj.krna[218] = -946375835;
        jj.krna[219] = 1786619256;
        jj.krna[220] = -199046846;
        jj.krna[221] = 828428317;
        jj.krna[222] = -2001558069;
        jj.krna[223] = -1271071037;
        jj.krna[224] = -130229047;
        jj.krna[225] = 1806925430;
        jj.krna[226] = 317598100;
        jj.krna[227] = -2080754544;
        jj.krna[228] = -1495352848;
        jj.krna[229] = -774852878;
        jj.krna[230] = 554353998;
        jj.krna[231] = -913616336;
        jj.krna[232] = 1244437720;
        jj.krna[233] = 1717419633;
        jj.krna[234] = -530673902;
        jj.krna[235] = 1204208501;
        jj.krna[236] = 1623150001;
        jj.krna[237] = 714957155;
        jj.krna[238] = 1584012539;
        jj.krna[239] = -1519548338;
        jj.krna[240] = 476712942;
        jj.krna[241] = 925459566;
        jj.krna[242] = 268753887;
        jj.krna[243] = -782015835;
        jj.krna[244] = -274438014;
        jj.krna[245] = -18822372;
        jj.krna[246] = 1997174868;
        jj.krna[247] = -1165708327;
        jj.krna[248] = -1625379124;
        jj.krna[249] = -1035528553;
        jj.krna[250] = 1419613148;
        jj.krna[251] = -2220752;
        jj.krna[252] = 181293018;
        jj.krna[253] = 1745268074;
        jj.krna[254] = -888383096;
        jj.krna[255] = -889328289;
        jj.krna[256] = 1688077367;
        jj.krna[257] = 1545039067;
        jj.krna[258] = -1515648137;
        jj.krna[259] = 972355547;
        jj.krna[260] = -1589394647;
        jj.krna[261] = 0xFFE4EEF;
        jj.krna[262] = -343822522;
        jj.krna[263] = -1530145112;
        jj.krna[264] = 1029640595;
        jj.krna[265] = 1704727306;
        jj.krna[266] = -1459587562;
        jj.krna[267] = -1057641491;
        jj.krna[268] = 279343933;
        jj.krna[269] = -1557600768;
        jj.krna[270] = 282724566;
        jj.krna[271] = 1972330151;
        jj.krna[272] = -326824650;
        jj.krna[273] = -2118709019;
        jj.krna[274] = 732024275;
        jj.krna[275] = 1062278073;
        jj.krna[276] = -1655337635;
        jj.krna[277] = -760712768;
        jj.krna[278] = 1664969711;
        jj.krna[279] = 1415617671;
        jj.krna[280] = 1936201483;
        jj.krna[281] = 1797945398;
        jj.krna[282] = 454022999;
        jj.krna[283] = 1540050195;
        jj.krna[284] = -1167246781;
        jj.krna[285] = -518174826;
        jj.krna[286] = -738660400;
        jj.krna[287] = 90115707;
        jj.krna[288] = -1594533145;
        jj.krna[289] = 523990133;
        jj.krna[290] = 1295573411;
        jj.krna[291] = 1219881088;
        jj.krna[292] = -1223653891;
        jj.krna[293] = 500248823;
        jj.krna[294] = -1650040186;
        jj.krna[295] = -1783131841;
        jj.krna[296] = -77211369;
        jj.krna[297] = 1490819896;
        jj.krna[298] = -1610343098;
        jj.krna[299] = -1559709181;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onWorldRender(dj var1_1) {
        block160: {
            block159: {
                block158: {
                    var10_2 = jj.c;
                    var9_3 /* !! */  = jj.b;
                    var8_4 = jj.a;
                    if (var10_2) {
                        throw null;
lbl6:
                        // 42 sources

                        return;
                    }
                    if (var8_4 || var8_4) ** GOTO lbl6
                    if (jj.mc.field_1724 == null) break block158;
                    if (var8_4) ** GOTO lbl6
                    if (jj.mc.field_1687 != null) break block159;
                    if (var8_4) ** GOTO lbl6
                }
                if (var8_4 || var8_4) ** GOTO lbl6
                return;
            }
            if (var8_4 || var8_4) ** GOTO lbl6
            this.showPearls = this.projectiles.getSelected().contains(this.projectiles.getList().get((int)jj.krnc("krpa", krmz(int ), (int)28)));
            if (var8_4 || var8_4) ** GOTO lbl6
            this.showArrows = this.projectiles.getSelected().contains(this.projectiles.getList().get((int)jj.krnc("krpb", krmz(int ), (int)29)));
            if (var8_4 || var8_4) ** GOTO lbl6
            this.showTridents = this.projectiles.getSelected().contains(this.projectiles.getList().get((int)jj.krnc("krpc", krmz(int ), (int)30)));
            if (var8_4 || var8_4) ** GOTO lbl6
            if (this.showPearls) break block160;
            if (var8_4) ** GOTO lbl6
            if (this.showArrows) break block160;
            if (var8_4) ** GOTO lbl6
            if (this.showTridents) break block160;
            if (var8_4 || var8_4) ** GOTO lbl6
            this.trajectories.clear();
            if (var8_4 || var8_4) ** GOTO lbl6
            return;
        }
        if (var9_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var8_4 || var8_4) ** GOTO lbl6
                this.trajectoryColorsPrepared = jj.krnc("krpd", krmz(int ), (int)31);
                if (var8_4 || var8_4) ** GOTO lbl6
                if (!this.showPearls) ** GOTO lbl46
                if (var8_4) ** GOTO lbl6
                v0 = jj.krnc("krpe", krmz(int ), (int)32);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl48
lbl46:
                // 1 sources

                if (var8_4 || var8_4) ** GOTO lbl6
                v0 = jj.krnc("krpf", krmz(int ), (int)33);
lbl48:
                // 2 sources

                if (this.showArrows) {
                    v1 = jj.krnc("krpg", krmz(int ), (int)34);
                    if (var10_2) {
                        throw null;
                    }
                } else {
                    v1 = jj.krnc("krph", krmz(int ), (int)35);
                }
                v2 = v0 | v1;
                if (this.showTridents) {
                    v3 = jj.krnc("krpi", krmz(int ), (int)36);
                    if (var10_2) {
                        throw null;
                    }
                } else {
                    v3 = jj.krnc("krpj", krmz(int ), (int)37);
                }
                var2_5 = v2 | v3;
                if (var8_4 || var8_4) ** GOTO lbl6
                if (this.lastSimulationAge != jj.mc.field_1724.field_6012) ** GOTO lbl67
                if (var8_4) ** GOTO lbl6
                if (this.lastSelectionMask == var2_5) ** GOTO lbl72
                if (var8_4) ** GOTO lbl6
lbl67:
                // 2 sources

                if (var8_4 || var8_4) ** GOTO lbl6
                v4 = jj.krnc("krpk", krmz(int ), (int)38);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl74
lbl72:
                // 1 sources

                if (var8_4 || var8_4) ** GOTO lbl6
                v4 = var3_6 = jj.krnc("krpl", krmz(int ), (int)39);
lbl74:
                // 2 sources

                if (var8_4 || var8_4) ** GOTO lbl6
                if (var3_6 == false) ** GOTO lbl81
                if (var8_4 || var8_4) ** GOTO lbl6
                this.lastSimulationAge = jj.mc.field_1724.field_6012;
                if (var8_4 || var8_4) ** GOTO lbl6
                this.lastSelectionMask = var2_5;
                if (var8_4) ** GOTO lbl6
lbl81:
                // 2 sources

                if (var8_4 || var8_4) ** GOTO lbl6
                this.refreshTrajectories((boolean)var3_6);
                if (var8_4 || var8_4) ** GOTO lbl6
                var4_7 = lv.getCameraPos();
                if (var8_4 || var8_4) ** GOTO lbl6
                this.prepareTrajectoryColors();
                if (var8_4 || var8_4) ** GOTO lbl6
                lv.begin((boolean)jj.krnc("krpm", krmz(int ), (int)40));
                if (var8_4 || var8_4) ** GOTO lbl6
                var5_8 = this.trajectories.values().iterator();
                if (var8_4) ** GOTO lbl6
                do {
                    if (var8_4 || var8_4) ** GOTO lbl6
                    if (!var5_8.hasNext()) ** GOTO lbl113
                    if (var8_4) ** GOTO lbl6
                    var6_9 = var5_8.next();
                    if (var8_4 || var8_4) ** GOTO lbl6
                    var7_10 = jj.krnc("krpn", krmz(int ), (int)41);
                    if (var8_4) ** GOTO lbl6
                    do {
                        if (var8_4 || var8_4) ** GOTO lbl6
                        if (var7_10 + jj.krnc("krpo", krmz(int ), (int)42) >= var6_9.pointCount) ** GOTO lbl110
                        if (var8_4 || var8_4) ** GOTO lbl6
                        lv.line((float)(var6_9.x[var7_10] - var4_7.field_1352), (float)(var6_9.y[var7_10] - var4_7.field_1351), (float)(var6_9.z[var7_10] - var4_7.field_1350), (float)(var6_9.x[var7_10 + true] - var4_7.field_1352), (float)(var6_9.y[var7_10 + true] - var4_7.field_1351), (float)(var6_9.z[var7_10 + true] - var4_7.field_1350), this.trajectoryColors[var7_10], 1.0f);
                        if (var8_4 || var8_4) ** GOTO lbl6
                        ++var7_10;
                        if (var8_4) ** GOTO lbl6
                    } while (!var10_2);
                    throw null;
lbl110:
                    // 1 sources

                    if (var8_4 || var8_4) ** GOTO lbl6
                } while (!var10_2);
                throw null;
lbl113:
                // 1 sources

                if (var8_4 || var8_4) ** GOTO lbl6
                lv.end();
                if (!var8_4 && !var8_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var9_3 /* !! */  = (int)jj.krnc("krpp", krmz(int ), (int)43);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl268
            }
lbl123:
            // 2 sources

            case 1: {
                var9_3 /* !! */  = (int)jj.krnc("krpq", krmz(int ), (int)44);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl239
            }
            case 2: {
                do {
                    var9_3 /* !! */  = (int)jj.krnc("krpr", krmz(int ), (int)45);
                } while (!var10_2);
                throw null;
            }
lbl133:
            // 2 sources

            case 3: {
                var9_3 /* !! */  = (int)jj.krnc("krps", krmz(int ), (int)46);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl138:
            // 3 sources

            case 4: {
                var9_3 /* !! */  = (int)jj.krnc("krpt", krmz(int ), (int)47);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 5: {
                var9_3 /* !! */  = (int)jj.krnc("krpu", krmz(int ), (int)48);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl173
            }
            case 6: {
                var9_3 /* !! */  = (int)jj.krnc("krpv", krmz(int ), (int)49);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl416
            }
            case 7: {
                var9_3 /* !! */  = (int)jj.krnc("krpw", krmz(int ), (int)50);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl299
            }
lbl158:
            // 2 sources

            case 8: {
                var9_3 /* !! */  = (int)jj.krnc("krpx", krmz(int ), (int)51);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 9: {
                var9_3 /* !! */  = (int)jj.krnc("krpy", krmz(int ), (int)52);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl340
            }
lbl168:
            // 2 sources

            case 10: {
                var9_3 /* !! */  = (int)jj.krnc("krpz", krmz(int ), (int)53);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl345
            }
lbl173:
            // 2 sources

            case 11: {
                var9_3 /* !! */  = (int)jj.krnc("krqa", krmz(int ), (int)54);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl268
            }
lbl178:
            // 2 sources

            case 12: {
                var9_3 /* !! */  = (int)jj.krnc("krqb", krmz(int ), (int)55);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl290
            }
            case 13: {
                var9_3 /* !! */  = (int)jj.krnc("krqc", krmz(int ), (int)56);
                if (!var10_2) ** GOTO lbl123
                throw null;
            }
            case 14: {
                var9_3 /* !! */  = (int)jj.krnc("krqd", krmz(int ), (int)57);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl231
            }
lbl192:
            // 2 sources

            case 15: {
                var9_3 /* !! */  = (int)jj.krnc("krqe", krmz(int ), (int)58);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl408
            }
lbl197:
            // 4 sources

            case 16: {
                var9_3 /* !! */  = (int)jj.krnc("krqf", krmz(int ), (int)59);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl286
            }
            case 17: {
                var9_3 /* !! */  = (int)jj.krnc("krqg", krmz(int ), (int)60);
                if (!var10_2) break;
                throw null;
            }
lbl206:
            // 2 sources

            case 18: {
                var9_3 /* !! */  = (int)jj.krnc("krqh", krmz(int ), (int)61);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl272
            }
lbl211:
            // 4 sources

            case 19: {
                var9_3 /* !! */  = (int)jj.krnc("krqi", krmz(int ), (int)62);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl462
            }
lbl216:
            // 3 sources

            case 20: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_3 /* !! */  = (int)jj.krnc("krqj", krmz(int ), (int)63);
                    if (var10_2) {
                        throw null;
                    }
                    ** GOTO lbl258
                    break;
                }
            }
            case 21: {
                var9_3 /* !! */  = (int)jj.krnc("krqk", krmz(int ), (int)64);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl281
            }
lbl227:
            // 5 sources

            case 22: {
                var9_3 /* !! */  = (int)jj.krnc("krql", krmz(int ), (int)65);
                if (!var10_2) ** GOTO lbl206
                throw null;
            }
lbl231:
            // 2 sources

            case 23: {
                var9_3 /* !! */  = (int)jj.krnc("krqm", krmz(int ), (int)66);
                if (!var10_2) break;
                throw null;
            }
            case 24: {
                var9_3 /* !! */  = (int)jj.krnc("krqn", krmz(int ), (int)67);
                if (!var10_2) ** GOTO lbl227
                throw null;
            }
lbl239:
            // 2 sources

            case 25: {
                var9_3 /* !! */  = (int)jj.krnc("krqo", krmz(int ), (int)68);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl404
            }
            case 26: {
                var9_3 /* !! */  = (int)jj.krnc("krqp", krmz(int ), (int)69);
                if (!var10_2) ** GOTO lbl227
                throw null;
            }
            case 27: {
                var9_3 /* !! */  = (int)jj.krnc("krqq", krmz(int ), (int)70);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl309
            }
            case 28: {
                var9_3 /* !! */  = (int)jj.krnc("krqr", krmz(int ), (int)71);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl377
            }
lbl258:
            // 2 sources

            case 29: {
                var9_3 /* !! */  = (int)jj.krnc("krqs", krmz(int ), (int)72);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl349
            }
            case 30: {
                var9_3 /* !! */  = (int)jj.krnc("krqt", krmz(int ), (int)73);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl420
            }
lbl268:
            // 5 sources

            case 31: {
                var9_3 /* !! */  = (int)jj.krnc("krqu", krmz(int ), (int)74);
                if (!var10_2) ** GOTO lbl138
                throw null;
            }
lbl272:
            // 2 sources

            case 32: {
                var9_3 /* !! */  = (int)jj.krnc("krqv", krmz(int ), (int)75);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl408
            }
lbl277:
            // 2 sources

            case 33: {
                var9_3 /* !! */  = (int)jj.krnc("krqw", krmz(int ), (int)76);
                if (!var10_2) ** GOTO lbl192
                throw null;
            }
lbl281:
            // 2 sources

            case 34: {
                var9_3 /* !! */  = (int)jj.krnc("krqx", krmz(int ), (int)77);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl437
            }
lbl286:
            // 4 sources

            case 35: {
                var9_3 /* !! */  = (int)jj.krnc("krqy", krmz(int ), (int)78);
                if (!var10_2) ** GOTO lbl227
                throw null;
            }
lbl290:
            // 2 sources

            case 36: {
                var9_3 /* !! */  = (int)jj.krnc("krqz", krmz(int ), (int)79);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl327
            }
            case 37: {
                var9_3 /* !! */  = (int)jj.krnc("krra", krmz(int ), (int)80);
                if (!var10_2) ** GOTO lbl158
                throw null;
            }
lbl299:
            // 3 sources

            case 38: {
                var9_3 /* !! */  = (int)jj.krnc("krrb", krmz(int ), (int)81);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl404
            }
            case 39: {
                var9_3 /* !! */  = (int)jj.krnc("krrc", krmz(int ), (int)82);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl340
            }
lbl309:
            // 2 sources

            case 40: {
                var9_3 /* !! */  = (int)jj.krnc("krrd", krmz(int ), (int)83);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl433
            }
            case 41: {
                var9_3 /* !! */  = (int)jj.krnc("krre", krmz(int ), (int)84);
                if (!var10_2) ** GOTO lbl277
                throw null;
            }
            case 42: {
                var9_3 /* !! */  = (int)jj.krnc("krrf", krmz(int ), (int)85);
                if (!var10_2) ** GOTO lbl133
                throw null;
            }
lbl322:
            // 2 sources

            case 43: {
                var9_3 /* !! */  = (int)jj.krnc("krrg", krmz(int ), (int)86);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl395
            }
lbl327:
            // 2 sources

            case 44: {
                var9_3 /* !! */  = (int)jj.krnc("krrh", krmz(int ), (int)87);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl399
            }
            case 45: {
                var9_3 /* !! */  = (int)jj.krnc("krri", krmz(int ), (int)88);
                if (!var10_2) ** GOTO lbl299
                throw null;
            }
            case 46: {
                var9_3 /* !! */  = (int)jj.krnc("krrj", krmz(int ), (int)89);
                if (!var10_2) ** GOTO lbl168
                throw null;
            }
lbl340:
            // 3 sources

            case 47: {
                var9_3 /* !! */  = (int)jj.krnc("krrk", krmz(int ), (int)90);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl428
            }
lbl345:
            // 2 sources

            case 48: {
                var9_3 /* !! */  = (int)jj.krnc("krrl", krmz(int ), (int)91);
                if (!var10_2) ** GOTO lbl197
                throw null;
            }
lbl349:
            // 2 sources

            case 49: {
                var9_3 /* !! */  = (int)jj.krnc("krrm", krmz(int ), (int)92);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl449
            }
lbl354:
            // 2 sources

            case 50: {
                var9_3 /* !! */  = (int)jj.krnc("krrn", krmz(int ), (int)93);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl428
            }
            case 51: {
                var9_3 /* !! */  = (int)jj.krnc("krro", krmz(int ), (int)94);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl424
            }
lbl364:
            // 2 sources

            case 52: {
                var9_3 /* !! */  = (int)jj.krnc("krrp", krmz(int ), (int)95);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl377
            }
            case 53: {
                var9_3 /* !! */  = (int)jj.krnc("krrq", krmz(int ), (int)96);
                if (!var10_2) ** GOTO lbl322
                throw null;
            }
            case 54: {
                var9_3 /* !! */  = (int)jj.krnc("krrr", krmz(int ), (int)97);
                if (!var10_2) ** GOTO lbl227
                throw null;
            }
lbl377:
            // 3 sources

            case 55: {
                var9_3 /* !! */  = (int)jj.krnc("krrs", krmz(int ), (int)98);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl395
            }
            case 56: {
                var9_3 /* !! */  = (int)jj.krnc("krrt", krmz(int ), (int)99);
                if (!var10_2) ** GOTO lbl268
                throw null;
            }
            case 57: {
                var9_3 /* !! */  = (int)jj.krnc("krru", krmz(int ), (int)100);
                if (!var10_2) ** GOTO lbl197
                throw null;
            }
lbl390:
            // 2 sources

            case 58: {
                var9_3 /* !! */  = (int)jj.krnc("krrv", krmz(int ), (int)101);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl399
            }
lbl395:
            // 4 sources

            case 59: {
                var9_3 /* !! */  = (int)jj.krnc("krrw", krmz(int ), (int)102);
                if (!var10_2) ** GOTO lbl390
                throw null;
            }
lbl399:
            // 3 sources

            case 60: {
                var9_3 /* !! */  = (int)jj.krnc("krrx", krmz(int ), (int)103);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl420
            }
lbl404:
            // 3 sources

            case 61: {
                var9_3 /* !! */  = (int)jj.krnc("krry", krmz(int ), (int)104);
                if (!var10_2) ** GOTO lbl364
                throw null;
            }
lbl408:
            // 3 sources

            case 62: {
                var9_3 /* !! */  = (int)jj.krnc("krrz", krmz(int ), (int)105);
                if (!var10_2) ** GOTO lbl178
                throw null;
            }
lbl412:
            // 2 sources

            case 63: {
                var9_3 /* !! */  = (int)jj.krnc("krsa", krmz(int ), (int)106);
                if (!var10_2) ** GOTO lbl286
                throw null;
            }
lbl416:
            // 2 sources

            case 64: {
                var9_3 /* !! */  = (int)jj.krnc("krsb", krmz(int ), (int)107);
                if (!var10_2) ** GOTO lbl216
                throw null;
            }
lbl420:
            // 3 sources

            case 65: {
                var9_3 /* !! */  = (int)jj.krnc("krsc", krmz(int ), (int)108);
                if (!var10_2) ** GOTO lbl211
                throw null;
            }
lbl424:
            // 2 sources

            case 66: {
                var9_3 /* !! */  = (int)jj.krnc("krsd", krmz(int ), (int)109);
                if (!var10_2) ** GOTO lbl216
                throw null;
            }
lbl428:
            // 4 sources

            case 67: {
                do {
                    var9_3 /* !! */  = (int)jj.krnc("krse", krmz(int ), (int)110);
                } while (!var10_2);
                throw null;
            }
lbl433:
            // 2 sources

            case 68: {
                var9_3 /* !! */  = (int)jj.krnc("krsf", krmz(int ), (int)111);
                if (!var10_2) ** GOTO lbl354
                throw null;
            }
lbl437:
            // 2 sources

            case 69: {
                var9_3 /* !! */  = (int)jj.krnc("krsg", krmz(int ), (int)112);
                if (!var10_2) ** GOTO lbl138
                throw null;
            }
            case 70: {
                var9_3 /* !! */  = (int)jj.krnc("krsh", krmz(int ), (int)113);
                if (!var10_2) ** GOTO lbl286
                throw null;
            }
            case 71: {
                var9_3 /* !! */  = (int)jj.krnc("krsi", krmz(int ), (int)114);
                if (!var10_2) ** GOTO lbl428
                throw null;
            }
lbl449:
            // 2 sources

            case 72: {
                var9_3 /* !! */  = (int)jj.krnc("krsj", krmz(int ), (int)115);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl462
            }
            case 73: {
                var9_3 /* !! */  = (int)jj.krnc("krsk", krmz(int ), (int)116);
                if (!var10_2) ** GOTO lbl395
                throw null;
            }
            case 74: {
                var9_3 /* !! */  = (int)jj.krnc("krsl", krmz(int ), (int)117);
                if (!var10_2) ** GOTO lbl412
                throw null;
            }
lbl462:
            // 3 sources

            case 75: {
                var9_3 /* !! */  = (int)jj.krnc("krsm", krmz(int ), (int)118);
                if (!var10_2) ** GOTO lbl268
                throw null;
            }
            case 76: 
        }
        var9_3 /* !! */  = (int)jj.krnc("krsn", krmz(int ), (int)119);
        ** while (!var10_2)
lbl469:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ksmh() {
        jj.krna[100] = -836452718;
        jj.krna[101] = 417602654;
        jj.krna[102] = -1587270732;
        jj.krna[103] = -999656079;
        jj.krna[104] = 188483527;
        jj.krna[105] = 289243735;
        jj.krna[106] = -1194737189;
        jj.krna[107] = -1179419419;
        jj.krna[108] = -602383144;
        jj.krna[109] = 1418677056;
        jj.krna[110] = 1695446530;
        jj.krna[111] = 1193344011;
        jj.krna[112] = 2038163600;
        jj.krna[113] = 1579217545;
        jj.krna[114] = 655026035;
        jj.krna[115] = 1483533027;
        jj.krna[116] = 320953211;
        jj.krna[117] = 1161143691;
        jj.krna[118] = -1931980473;
        jj.krna[119] = 743925080;
        jj.krna[120] = 22255049;
        jj.krna[121] = -274241938;
        jj.krna[122] = 23543376;
        jj.krna[123] = -1234687000;
        jj.krna[124] = 1150019392;
        jj.krna[125] = -1160578884;
        jj.krna[126] = -718940072;
        jj.krna[127] = 1668936513;
        jj.krna[128] = 1626754431;
        jj.krna[129] = 1170931129;
        jj.krna[130] = -1760925103;
        jj.krna[131] = -1338033582;
        jj.krna[132] = -1790032900;
        jj.krna[133] = 1779838376;
        jj.krna[134] = 1534335232;
        jj.krna[135] = 1235581490;
        jj.krna[136] = -491350679;
        jj.krna[137] = -538411389;
        jj.krna[138] = -2107930317;
        jj.krna[139] = 1234214548;
        jj.krna[140] = -1914138697;
        jj.krna[141] = -1795842841;
        jj.krna[142] = -2117083030;
        jj.krna[143] = -834280003;
        jj.krna[144] = 116646194;
        jj.krna[145] = 68201768;
        jj.krna[146] = -2136809271;
        jj.krna[147] = -1875833544;
        jj.krna[148] = 1292522837;
        jj.krna[149] = 837183626;
        jj.krna[150] = 732546482;
        jj.krna[151] = -1836004308;
        jj.krna[152] = 1901236047;
        jj.krna[153] = 1090270460;
        jj.krna[154] = -247013657;
        jj.krna[155] = 43719470;
        jj.krna[156] = 1897393842;
        jj.krna[157] = -1007586388;
        jj.krna[158] = -511534103;
        jj.krna[159] = 2128483299;
        jj.krna[160] = 167187381;
        jj.krna[161] = -966516677;
        jj.krna[162] = -1392875968;
        jj.krna[163] = 11167121;
        jj.krna[164] = 99202990;
        jj.krna[165] = -1011392865;
        jj.krna[166] = -1079434361;
        jj.krna[167] = 44083175;
        jj.krna[168] = 1812712129;
        jj.krna[169] = -1514085932;
        jj.krna[170] = 544632372;
        jj.krna[171] = 1095437717;
        jj.krna[172] = -1575022645;
        jj.krna[173] = -2041820171;
        jj.krna[174] = -1212752444;
        jj.krna[175] = -1723778253;
        jj.krna[176] = 695313523;
        jj.krna[177] = -1951273814;
        jj.krna[178] = -426184737;
        jj.krna[179] = 434914728;
        jj.krna[180] = 1126116951;
        jj.krna[181] = -1263501043;
        jj.krna[182] = -987798455;
        jj.krna[183] = -1327686064;
        jj.krna[184] = 1659608781;
        jj.krna[185] = -2003837908;
        jj.krna[186] = -721214000;
        jj.krna[187] = -1475875293;
        jj.krna[188] = 410108597;
        jj.krna[189] = 1351390833;
        jj.krna[190] = -1159459239;
        jj.krna[191] = 626730107;
        jj.krna[192] = -1689317422;
        jj.krna[193] = 216739298;
        jj.krna[194] = 1842420478;
        jj.krna[195] = -2075049821;
        jj.krna[196] = -1013356467;
        jj.krna[197] = -1257031716;
        jj.krna[198] = -324671351;
        jj.krna[199] = -1635216063;
    }

    private static /* synthetic */ void ksml() {
        jj.krna[500] = 1348354545;
        jj.krna[501] = 2124745168;
        jj.krna[502] = -687322848;
        jj.krna[503] = 1005107997;
        jj.krna[504] = -417273736;
        jj.krna[505] = -807080628;
        jj.krna[506] = 1080891198;
        jj.krna[507] = -534425372;
        jj.krna[508] = -361173859;
        jj.krna[509] = -432730695;
        jj.krna[510] = -1464162137;
        jj.krna[511] = -852767780;
        jj.krna[512] = -189857318;
        jj.krna[513] = -916818012;
        jj.krna[514] = 127720404;
        jj.krna[515] = -1732335575;
    }

    private static /* synthetic */ void ksmu() {
        jj.krnu[0] = 4260893975654152924L;
        jj.krnu[1] = 7291704901790535373L;
        jj.krnu[2] = 4749879492362948221L;
        jj.krnu[3] = -5098083840536954245L;
        jj.krnu[4] = 8022221646846595207L;
        jj.krnu[5] = 8435565778086348433L;
        jj.krnu[6] = 2544203414563937863L;
        jj.krnu[7] = -1221126588161558234L;
        jj.krnu[8] = 7386988005258221888L;
        jj.krnu[9] = -6794088416499251877L;
        jj.krnu[10] = 2951918121996591473L;
        jj.krnu[11] = -202259892124477398L;
        jj.krnu[12] = -1773371613047394134L;
        jj.krnu[13] = 8580200027501175698L;
        jj.krnu[14] = -6303768959107000047L;
        jj.krnu[15] = 2624773901472435352L;
        jj.krnu[16] = -3533327583464333606L;
        jj.krnu[17] = 1225102102108239794L;
        jj.krnu[18] = 8849288360939618850L;
        jj.krnu[19] = -1991055606230633059L;
        jj.krnu[20] = 5641903660621307428L;
        jj.krnu[21] = -4073357577393130452L;
        jj.krnu[22] = 5582490656834873006L;
        jj.krnu[23] = -344424460828124180L;
        jj.krnu[24] = 5453322074575196052L;
        jj.krnu[25] = -8762426552008969120L;
        jj.krnu[26] = 5834006333004173217L;
        jj.krnu[27] = 4605566374642832367L;
        jj.krnu[28] = -7641848272036156171L;
        jj.krnu[29] = 4213905983637361937L;
        jj.krnu[30] = -6105221783755800012L;
        jj.krnu[31] = 8028574236271640687L;
        jj.krnu[32] = -5243553024218919515L;
        jj.krnu[33] = 3931345228312027288L;
        jj.krnu[34] = 632125230508046688L;
        jj.krnu[35] = -1447047804342300752L;
        jj.krnu[36] = 8195881478065586426L;
        jj.krnu[37] = -8608093712287240762L;
        jj.krnu[38] = -9139214131633313964L;
        jj.krnu[39] = -2688480579546321779L;
        jj.krnu[40] = 8311405804445436675L;
        jj.krnu[41] = 8360789877710448660L;
        jj.krnu[42] = -4842941575994043999L;
        jj.krnu[43] = 7093308560597268137L;
        jj.krnu[44] = 1814796880549265343L;
        jj.krnu[45] = -6872464343982526485L;
        jj.krnu[46] = 6444727024806107361L;
        jj.krnu[47] = -2377015419790406910L;
        jj.krnu[48] = 9181006554935496698L;
        jj.krnu[49] = -6580368696975838787L;
        jj.krnu[50] = 7840899643558209743L;
        jj.krnu[51] = -6847784774386012681L;
        jj.krnu[52] = -5768189862102302014L;
        jj.krnu[53] = 936627622562378546L;
        jj.krnu[54] = -7497678037883029526L;
        jj.krnu[55] = 4690234988960638740L;
        jj.krnu[56] = -238642076869972889L;
        jj.krnu[57] = -215505444484125262L;
        jj.krnu[58] = -6881422352229440380L;
        jj.krnu[59] = 2491393926936359583L;
        jj.krnu[60] = 9004196490382017047L;
        jj.krnu[61] = -3368320210221108238L;
        jj.krnu[62] = 7168295116093097311L;
        jj.krnu[63] = 8370409017483639790L;
        jj.krnu[64] = 217386331005865255L;
        jj.krnu[65] = 8128291582359149221L;
        jj.krnu[66] = 2070206406644232537L;
        jj.krnu[67] = -7556706417564956432L;
        jj.krnu[68] = 4087875250697844281L;
        jj.krnu[69] = 8722558857505241507L;
        jj.krnu[70] = -5970253008077191115L;
        jj.krnu[71] = -5652772902446421589L;
        jj.krnu[72] = -8711330426884516916L;
        jj.krnu[73] = -3397518063815317730L;
        jj.krnu[74] = -6519546635322196410L;
        jj.krnu[75] = 4890925466435479893L;
        jj.krnu[76] = -158746729123801136L;
        jj.krnu[77] = 7839795335305492699L;
        jj.krnu[78] = 7225162641031752241L;
        jj.krnu[79] = 7754619512506400408L;
        jj.krnu[80] = 4782399887707234937L;
        jj.krnu[81] = -1501003273758044805L;
        jj.krnu[82] = -3066059369198120839L;
        jj.krnu[83] = 3644253281645345738L;
        jj.krnu[84] = -2596453686624478227L;
        jj.krnu[85] = 6250918008047175186L;
        jj.krnu[86] = -1593439553775029450L;
        jj.krnu[87] = -1986193740746937512L;
        jj.krnu[88] = 7545551628664874513L;
        jj.krnu[89] = 2633166242920510435L;
        jj.krnu[90] = 6705091964012086510L;
        jj.krnu[91] = 790096670363799494L;
        jj.krnu[92] = 5018723442639663842L;
        jj.krnu[93] = 3071051006168661397L;
        jj.krnu[94] = -8354742369178401766L;
        jj.krnu[95] = -929562890491690500L;
        jj.krnu[96] = 4872408786044517754L;
        jj.krnu[97] = 6369871994564153300L;
        jj.krnu[98] = -6718303011555091032L;
        jj.krnu[99] = 8848436580171816646L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ boolean lambda$refreshTrajectories$0(Integer var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jj.td - jj.krnc("kslf", krns(int ), (int)122)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jj.krnc("kslg", krmz(int ), (int)499)) break;
            v0 /* !! */  = (long)jj.krnc("kslh", krmz(int ), (int)500);
        }
        var4_2 = jj.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = jj.td - jj.krnc("ksli", krns(int ), (int)123)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == jj.krnc("kslj", krmz(int ), (int)501)) break;
            v1 /* !! */  = (long)jj.krnc("kslk", krmz(int ), (int)502);
        }
        var3_3 /* !! */  = jj.b;
        v2 /* !! */  = jj.td;
        if (true) ** GOTO lbl19
        block23: while (true) {
            v2 /* !! */  = (long)(v3 - jj.krnc("ksll", krns(int ), (int)124));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1972570040: {
                    v3 = jj.krnc("kslm", krns(int ), (int)125);
                    continue block23;
                }
                case -1270313617: {
                    v3 = jj.krnc("ksln", krns(int ), (int)126);
                    continue block23;
                }
                case 1143253282: {
                    v3 = jj.krnc("kslo", krns(int ), (int)127);
                    continue block23;
                }
                case 1436090418: {
                    break block23;
                }
            }
            break;
        }
        var2_4 = jj.a;
        if (var4_2) {
            throw null;
lbl34:
            // 4 sources

            return (boolean)jj.krnc("kslp", krmz(int ), (int)503);
        }
        if (var2_4) ** GOTO lbl34
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl34
                v4 /* !! */  = jj.td;
                if (true) ** GOTO lbl45
                block25: while (true) {
                    v4 /* !! */  = (long)(v5 - jj.krnc("kslq", krns(int ), (int)128));
lbl45:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 96128780: {
                            v5 = jj.krnc("kslr", krns(int ), (int)129);
                            continue block25;
                        }
                        case 1396531712: {
                            v5 = jj.krnc("ksls", krns(int ), (int)130);
                            continue block25;
                        }
                        case 1436090418: {
                            break block25;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = jj.td - jj.krnc("kslt", krns(int ), (int)131)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == jj.krnc("kslu", krmz(int ), (int)504)) break;
                    v6 /* !! */  = (long)jj.krnc("kslv", krmz(int ), (int)505);
                }
                if (this.visibleTrajectoryIds.contains(var1_1)) ** GOTO lbl66
                if (var2_4) ** GOTO lbl34
                v7 = jj.krnc("kslw", krmz(int ), (int)506);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl69
lbl66:
                // 1 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v7 = jj.krnc("kslx", krmz(int ), (int)507);
lbl69:
                // 2 sources

                return (boolean)v7;
            }
lbl70:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)jj.krnc("ksly", krmz(int ), (int)508);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl88
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)jj.krnc("kslz", krmz(int ), (int)509);
                } while (!var4_2);
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)jj.krnc("ksma", krmz(int ), (int)510);
                if (var4_2) {
                    throw null;
                }
            }
            case 3: {
                var3_3 /* !! */  = (int)jj.krnc("ksmb", krmz(int ), (int)511);
                if (!var4_2) break;
                throw null;
            }
lbl88:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)jj.krnc("ksmc", krmz(int ), (int)512);
                if (var4_2) {
                    throw null;
                }
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)jj.krnc("ksmd", krmz(int ), (int)513);
                    if (!var4_2) ** GOTO lbl70
                    throw null;
                }
            }
            case 6: {
                var3_3 /* !! */  = (int)jj.krnc("ksme", krmz(int ), (int)514);
                if (!var4_2) break;
                throw null;
            }
            case 7: 
        }
        var3_3 /* !! */  = (int)jj.krnc("ksmf", krmz(int ), (int)515);
        ** while (!var4_2)
lbl104:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private class_1799 projectileStack(class_1297 var1_1) {
        block48: {
            block51: {
                block50: {
                    v0 /* !! */  = jj.td;
                    block28: while (true) {
                        switch ((int)v0 /* !! */ ) {
                            case -1648667017: {
                                v0 /* !! */  = (long)(jj.krnc("kshk", krns(int ), (int)83) - jj.krnc("kshj", krns(int ), (int)82));
                                continue block28;
                            }
                            case 1436090418: {
                                break block28;
                            }
                        }
                        break;
                    }
                    var4_2 = jj.c;
                    while (true) {
                        block49: {
                            if ((v1 /* !! */  = (cfr_temp_1 = jj.td - jj.krnc("kshl", krns(int ), (int)84)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v1 /* !! */  != jj.krnc("kshm", krmz(int ), (int)439)) break block49;
                            var3_3 /* !! */  = jj.b;
                            v2 /* !! */  = jj.td;
                            if (true) ** GOTO lbl22
                        }
                        v1 /* !! */  = (long)jj.krnc("kshn", krmz(int ), (int)440);
                    }
                    block30: while (true) {
                        v2 /* !! */  = (long)(v3 - jj.krnc("ksho", krns(int ), (int)85));
lbl22:
                        // 2 sources

                        switch ((int)v2 /* !! */ ) {
                            case -1536417662: {
                                v3 = jj.krnc("kshp", krns(int ), (int)86);
                                continue block30;
                            }
                            case 668360046: {
                                v3 = jj.krnc("kshq", krns(int ), (int)87);
                                continue block30;
                            }
                            case 1436090418: {
                                break block30;
                            }
                        }
                        break;
                    }
                    var2_4 = jj.a;
                    if (var4_2) {
                        throw null;
                    }
                    if (var2_4 != false) return null;
                    if (var2_4 != false) return null;
                    if (!(var1_1 instanceof class_1684)) break block50;
                    if (var2_4 != false) return null;
                    v4 /* !! */  = jj.td;
                    if (true) ** GOTO lbl99
                }
                if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
                cfr_temp_0 = -2147483648;
lbl43:
                // 2 sources

                block31: while (true) {
                    switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                        default: lbl-1000:
                        // 2 sources

                        {
                            if (var2_4 != false) return null;
                            if (var2_4 != false) return null;
                            if (var1_1 instanceof class_1667) {
                                if (var2_4 != false) return null;
                                ** break;
                            }
                            if (var2_4 != false) return null;
                            if (var2_4 != false) return null;
                            while (true) {
                                if ((v5 /* !! */  = (cfr_temp_2 = jj.td - jj.krnc("kshy", krns(int ), (int)93)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                                    continue;
                                }
                                if (v5 /* !! */  == jj.krnc("kshz", krmz(int ), (int)443)) {
                                    return jj.TRIDENT_ICON;
                                }
                                v5 /* !! */  = (long)jj.krnc("ksia", krmz(int ), (int)444);
                            }
                        }
                        case 0: {
                            var3_3 /* !! */  = (int)jj.krnc("ksib", krmz(int ), (int)445);
                            cfr_temp_0 = 9;
                            if (!var4_2) continue block31;
                            throw null;
                        }
                        case 3: {
                            var3_3 /* !! */  = (int)jj.krnc("ksie", krmz(int ), (int)448);
                            if (var4_2) {
                                throw null;
                            }
                        }
                        case 1: {
                            var3_3 /* !! */  = (int)jj.krnc("ksic", krmz(int ), (int)446);
                            if (var4_2) {
                                throw null;
                            }
                        }
                        case 2: {
                            var3_3 /* !! */  = (int)jj.krnc("ksid", krmz(int ), (int)447);
                            cfr_temp_0 = 6;
                            if (!var4_2) continue block31;
                            throw null;
                        }
                        case 4: {
                            do {
                                var3_3 /* !! */  = (int)jj.krnc("ksif", krmz(int ), (int)449);
                            } while (!var4_2);
                            throw null;
                        }
                        case 5: {
                            var3_3 /* !! */  = (int)jj.krnc("ksig", krmz(int ), (int)450);
                            cfr_temp_0 = 9;
                            if (!var4_2) continue block31;
                            throw null;
                        }
                        case 6: {
                            ** GOTO lbl119
                        }
                        case 9: {
                            do {
                                var3_3 /* !! */  = (int)jj.krnc("ksik", krmz(int ), (int)454);
                            } while (!var4_2);
                            throw null;
                        }
                        case 10: {
                            break block48;
                        }
                        block35: while (true) {
                            v4 /* !! */  = (long)(v6 - jj.krnc("kshr", krns(int ), (int)88));
lbl99:
                            // 2 sources

                            switch ((int)v4 /* !! */ ) {
                                case -1786030673: {
                                    v6 = jj.krnc("kshs", krns(int ), (int)89);
                                    continue block35;
                                }
                                case 1436090418: {
                                    return jj.PEARL_ICON;
                                }
                                case 1885454682: {
                                    v6 = jj.krnc("ksht", krns(int ), (int)90);
                                    continue block35;
                                }
                                case 2004992254: {
                                    v6 = jj.krnc("kshu", krns(int ), (int)91);
                                    continue block35;
                                }
                            }
                            break;
                        }
                        return jj.PEARL_ICON;
lbl112:
                        // 1 sources

                        while (true) {
                            if ((v7 /* !! */  = (cfr_temp_3 = jj.td - jj.krnc("kshv", krns(int ), (int)92)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v7 /* !! */  == jj.krnc("kshw", krmz(int ), (int)441)) {
                                return jj.ARROW_ICON;
                            }
                            v7 /* !! */  = (long)jj.krnc("kshx", krmz(int ), (int)442);
                        }
lbl119:
                        // 2 sources

                        while (true) {
                            var3_3 /* !! */  = (int)jj.krnc("ksih", krmz(int ), (int)451);
                            cfr_temp_0 = 8;
                            if (!var4_2) continue block31;
                            throw null;
                        }
                        case 8: {
                            var3_3 /* !! */  = (int)jj.krnc("ksij", krmz(int ), (int)453);
                            if (var4_2) {
                                throw null;
                            }
                        }
                        case 7: 
                    }
                    break;
                }
                break block51;
                ** while (true)
            }
            var3_3 /* !! */  = (int)jj.krnc("ksii", krmz(int ), (int)452);
            if (!var4_2) ** break;
            throw null;
        }
        var3_3 /* !! */  = (int)jj.krnc("ksil", krmz(int ), (int)455);
        ** while (!var4_2)
lbl138:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ double kryp(int n2) {
        return Double.longBitsToDouble(krnt[n2] ^ krnu[n2]);
    }

    private static /* synthetic */ void ksmq() {
        jj.krnb[400] = 1510999235;
        jj.krnb[401] = -92444228;
        jj.krnb[402] = -1793572;
        jj.krnb[403] = -910337108;
        jj.krnb[404] = 1158501437;
        jj.krnb[405] = -156694936;
        jj.krnb[406] = -1755758914;
        jj.krnb[407] = -1742611189;
        jj.krnb[408] = 1988728575;
        jj.krnb[409] = -422193882;
        jj.krnb[410] = 1234464017;
        jj.krnb[411] = 1353475286;
        jj.krnb[412] = 183646908;
        jj.krnb[413] = 1601537915;
        jj.krnb[414] = -1743162747;
        jj.krnb[415] = 1863249220;
        jj.krnb[416] = 761936920;
        jj.krnb[417] = -945029943;
        jj.krnb[418] = -1032896286;
        jj.krnb[419] = -1409163483;
        jj.krnb[420] = 2022892607;
        jj.krnb[421] = -318777070;
        jj.krnb[422] = 2128595358;
        jj.krnb[423] = 2117414352;
        jj.krnb[424] = -489886561;
        jj.krnb[425] = 1371279459;
        jj.krnb[426] = -1750425185;
        jj.krnb[427] = 415062001;
        jj.krnb[428] = -1464195989;
        jj.krnb[429] = -384163333;
        jj.krnb[430] = 1084728536;
        jj.krnb[431] = -1665296220;
        jj.krnb[432] = -1513275385;
        jj.krnb[433] = -459159184;
        jj.krnb[434] = -1351358825;
        jj.krnb[435] = -213169429;
        jj.krnb[436] = 1130082827;
        jj.krnb[437] = 1450498539;
        jj.krnb[438] = -87496466;
        jj.krnb[439] = 1398799375;
        jj.krnb[440] = -1623033532;
        jj.krnb[441] = -152822461;
        jj.krnb[442] = -1026850192;
        jj.krnb[443] = 1633473447;
        jj.krnb[444] = -473288346;
        jj.krnb[445] = 74854687;
        jj.krnb[446] = -442946283;
        jj.krnb[447] = -1388788780;
        jj.krnb[448] = -1745589710;
        jj.krnb[449] = 1261437767;
        jj.krnb[450] = 1935670503;
        jj.krnb[451] = -886117414;
        jj.krnb[452] = 625939354;
        jj.krnb[453] = -636990414;
        jj.krnb[454] = 1862816351;
        jj.krnb[455] = 898121132;
        jj.krnb[456] = 898810929;
        jj.krnb[457] = 2008781092;
        jj.krnb[458] = -540293305;
        jj.krnb[459] = -2092420535;
        jj.krnb[460] = -1678250416;
        jj.krnb[461] = 904580593;
        jj.krnb[462] = -643307210;
        jj.krnb[463] = 976233108;
        jj.krnb[464] = 506474475;
        jj.krnb[465] = 1307790907;
        jj.krnb[466] = -1560805575;
        jj.krnb[467] = 1250102530;
        jj.krnb[468] = -1301677524;
        jj.krnb[469] = 366427687;
        jj.krnb[470] = -263725719;
        jj.krnb[471] = -91232706;
        jj.krnb[472] = -948271531;
        jj.krnb[473] = -1859293318;
        jj.krnb[474] = -46970063;
        jj.krnb[475] = 2053386604;
        jj.krnb[476] = 1619208601;
        jj.krnb[477] = -1141904104;
        jj.krnb[478] = -185569526;
        jj.krnb[479] = 2125346965;
        jj.krnb[480] = -1187016071;
        jj.krnb[481] = 29324963;
        jj.krnb[482] = 1219960666;
        jj.krnb[483] = 1634697781;
        jj.krnb[484] = -1115812815;
        jj.krnb[485] = -2134894708;
        jj.krnb[486] = -938782991;
        jj.krnb[487] = 1409216816;
        jj.krnb[488] = 1129806053;
        jj.krnb[489] = 833959549;
        jj.krnb[490] = -1697072604;
        jj.krnb[491] = 197766987;
        jj.krnb[492] = 493805530;
        jj.krnb[493] = 411574839;
        jj.krnb[494] = -1301707278;
        jj.krnb[495] = -894296177;
        jj.krnb[496] = 2016345058;
        jj.krnb[497] = -536129285;
        jj.krnb[498] = -1364453984;
        jj.krnb[499] = 128430634;
    }

    private static /* synthetic */ void ksmj() {
        jj.krna[300] = 802751037;
        jj.krna[301] = -296025617;
        jj.krna[302] = -46999857;
        jj.krna[303] = 1880632533;
        jj.krna[304] = 88570701;
        jj.krna[305] = 707219539;
        jj.krna[306] = -1799146348;
        jj.krna[307] = 1828056240;
        jj.krna[308] = -1337032307;
        jj.krna[309] = 237502467;
        jj.krna[310] = 155394361;
        jj.krna[311] = -98504802;
        jj.krna[312] = -224004549;
        jj.krna[313] = -1471663265;
        jj.krna[314] = 651178891;
        jj.krna[315] = -902027556;
        jj.krna[316] = 1420533797;
        jj.krna[317] = -1315316102;
        jj.krna[318] = -1455839127;
        jj.krna[319] = 1466162693;
        jj.krna[320] = -1535279766;
        jj.krna[321] = -1783684438;
        jj.krna[322] = 1485945930;
        jj.krna[323] = 300466033;
        jj.krna[324] = 985210808;
        jj.krna[325] = 347816587;
        jj.krna[326] = 1622639482;
        jj.krna[327] = 784722830;
        jj.krna[328] = -1679736264;
        jj.krna[329] = -793359722;
        jj.krna[330] = 1600097632;
        jj.krna[331] = -847510938;
        jj.krna[332] = -540405689;
        jj.krna[333] = 1003282048;
        jj.krna[334] = -1515001949;
        jj.krna[335] = 1465059643;
        jj.krna[336] = -1719678029;
        jj.krna[337] = 790087035;
        jj.krna[338] = 738286197;
        jj.krna[339] = -1985903373;
        jj.krna[340] = -2128425581;
        jj.krna[341] = 1915558503;
        jj.krna[342] = 1618798691;
        jj.krna[343] = 567754926;
        jj.krna[344] = -915467513;
        jj.krna[345] = 1490504953;
        jj.krna[346] = 1254224171;
        jj.krna[347] = -252802725;
        jj.krna[348] = 861193851;
        jj.krna[349] = 1650215313;
        jj.krna[350] = 105939638;
        jj.krna[351] = -1932598655;
        jj.krna[352] = -1368753185;
        jj.krna[353] = 662796851;
        jj.krna[354] = -1152340078;
        jj.krna[355] = -2057800350;
        jj.krna[356] = -1403447133;
        jj.krna[357] = 2015328037;
        jj.krna[358] = 2017787702;
        jj.krna[359] = 276808302;
        jj.krna[360] = 2062324215;
        jj.krna[361] = 149067643;
        jj.krna[362] = 1844136815;
        jj.krna[363] = 1901417602;
        jj.krna[364] = -1418462115;
        jj.krna[365] = -1677476882;
        jj.krna[366] = -701406993;
        jj.krna[367] = -1934653804;
        jj.krna[368] = 2027422953;
        jj.krna[369] = -899651950;
        jj.krna[370] = -1017156663;
        jj.krna[371] = -656447953;
        jj.krna[372] = 1264348215;
        jj.krna[373] = -661592268;
        jj.krna[374] = 1798586354;
        jj.krna[375] = -299514375;
        jj.krna[376] = -1374085060;
        jj.krna[377] = -1636094557;
        jj.krna[378] = -713940980;
        jj.krna[379] = -1779921286;
        jj.krna[380] = -177773194;
        jj.krna[381] = -1021237601;
        jj.krna[382] = 476820254;
        jj.krna[383] = -1592246117;
        jj.krna[384] = -1806896962;
        jj.krna[385] = 1811837130;
        jj.krna[386] = -1973441045;
        jj.krna[387] = 1336904227;
        jj.krna[388] = 835377285;
        jj.krna[389] = -318494537;
        jj.krna[390] = 300353069;
        jj.krna[391] = 132107063;
        jj.krna[392] = 391510438;
        jj.krna[393] = 590423924;
        jj.krna[394] = 630291366;
        jj.krna[395] = -183606963;
        jj.krna[396] = 8457196;
        jj.krna[397] = -1858984336;
        jj.krna[398] = -1426132236;
        jj.krna[399] = -309881822;
    }

    private static /* synthetic */ void ksmm() {
        jj.krnb[0] = -2017722479;
        jj.krnb[1] = 1312493849;
        jj.krnb[2] = -902755509;
        jj.krnb[3] = -1241375617;
        jj.krnb[4] = 18864968;
        jj.krnb[5] = -395019787;
        jj.krnb[6] = 1975765248;
        jj.krnb[7] = -1858581909;
        jj.krnb[8] = -1224318347;
        jj.krnb[9] = 1040569648;
        jj.krnb[10] = -1644318672;
        jj.krnb[11] = -1534299482;
        jj.krnb[12] = -450971520;
        jj.krnb[13] = -1614967994;
        jj.krnb[14] = 1939985927;
        jj.krnb[15] = 1637671624;
        jj.krnb[16] = 1098049638;
        jj.krnb[17] = 1229617490;
        jj.krnb[18] = -36386715;
        jj.krnb[19] = 1391243315;
        jj.krnb[20] = 2048341793;
        jj.krnb[21] = 273204662;
        jj.krnb[22] = 249035514;
        jj.krnb[23] = -11750725;
        jj.krnb[24] = 671954045;
        jj.krnb[25] = -1826235470;
        jj.krnb[26] = 921415536;
        jj.krnb[27] = 1141048742;
        jj.krnb[28] = 1532472071;
        jj.krnb[29] = 977484919;
        jj.krnb[30] = 1220997613;
        jj.krnb[31] = 589047045;
        jj.krnb[32] = 1717864487;
        jj.krnb[33] = 1885571647;
        jj.krnb[34] = -1872698440;
        jj.krnb[35] = 1078521830;
        jj.krnb[36] = -1376008893;
        jj.krnb[37] = -1985323358;
        jj.krnb[38] = 131087909;
        jj.krnb[39] = -290399155;
        jj.krnb[40] = 32260310;
        jj.krnb[41] = 955040160;
        jj.krnb[42] = 363501973;
        jj.krnb[43] = -1846958419;
        jj.krnb[44] = -885215064;
        jj.krnb[45] = -1810693695;
        jj.krnb[46] = -871510846;
        jj.krnb[47] = -1710595923;
        jj.krnb[48] = 339542847;
        jj.krnb[49] = -1879217538;
        jj.krnb[50] = 17788251;
        jj.krnb[51] = -115726290;
        jj.krnb[52] = 818406549;
        jj.krnb[53] = -275546913;
        jj.krnb[54] = 877348307;
        jj.krnb[55] = 1443154573;
        jj.krnb[56] = -1244964342;
        jj.krnb[57] = -1040478619;
        jj.krnb[58] = 2005062773;
        jj.krnb[59] = -484452315;
        jj.krnb[60] = -718624357;
        jj.krnb[61] = -1284312535;
        jj.krnb[62] = 885860283;
        jj.krnb[63] = -1242633193;
        jj.krnb[64] = 897253460;
        jj.krnb[65] = 1897730116;
        jj.krnb[66] = 83340256;
        jj.krnb[67] = -478270388;
        jj.krnb[68] = -817918973;
        jj.krnb[69] = -1532883087;
        jj.krnb[70] = -106054220;
        jj.krnb[71] = -728349253;
        jj.krnb[72] = 39910446;
        jj.krnb[73] = -287574799;
        jj.krnb[74] = 33953454;
        jj.krnb[75] = 528312551;
        jj.krnb[76] = -236478906;
        jj.krnb[77] = 1130061486;
        jj.krnb[78] = -227383737;
        jj.krnb[79] = 1580010155;
        jj.krnb[80] = -1329690341;
        jj.krnb[81] = -142918749;
        jj.krnb[82] = 1543416965;
        jj.krnb[83] = -1742967495;
        jj.krnb[84] = 196709267;
        jj.krnb[85] = 1095575162;
        jj.krnb[86] = -1215092267;
        jj.krnb[87] = -633588385;
        jj.krnb[88] = -629222762;
        jj.krnb[89] = 723404406;
        jj.krnb[90] = -2117797859;
        jj.krnb[91] = -289435636;
        jj.krnb[92] = 93354572;
        jj.krnb[93] = -1309746541;
        jj.krnb[94] = 401514770;
        jj.krnb[95] = 85175315;
        jj.krnb[96] = -1698595190;
        jj.krnb[97] = -835398934;
        jj.krnb[98] = 1762346438;
        jj.krnb[99] = -1188131794;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean validEntity(class_1297 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jj.td - jj.krnc("ksfy", krns(int ), (int)70)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jj.krnc("ksfz", krmz(int ), (int)414)) break;
            v0 /* !! */  = (long)jj.krnc("ksga", krmz(int ), (int)415);
        }
        var4_2 = jj.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = jj.td - jj.krnc("ksgb", krns(int ), (int)71)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == jj.krnc("ksgc", krmz(int ), (int)416)) break;
            v1 /* !! */  = (long)jj.krnc("ksgd", krmz(int ), (int)417);
        }
        var3_3 /* !! */  = jj.b;
        v2 /* !! */  = jj.td;
        if (true) ** GOTO lbl19
        block35: while (true) {
            v2 /* !! */  = (long)(v3 - jj.krnc("ksge", krns(int ), (int)72));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1945980536: {
                    v3 = jj.krnc("ksgf", krns(int ), (int)73);
                    continue block35;
                }
                case 745976192: {
                    v3 = jj.krnc("ksgg", krns(int ), (int)74);
                    continue block35;
                }
                case 1436090418: {
                    break block35;
                }
            }
            break;
        }
        var2_4 = jj.a;
        if (var4_2) {
            throw null;
lbl31:
            // 9 sources

            return (boolean)jj.krnc("ksgh", krmz(int ), (int)418);
        }
        if (var2_4) ** GOTO lbl31
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl31
                if (!(var1_1 instanceof class_1684)) ** GOTO lbl47
                if (var2_4) ** GOTO lbl31
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = jj.td - jj.krnc("ksgi", krns(int ), (int)75)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == jj.krnc("ksgj", krmz(int ), (int)419)) break;
                    v4 /* !! */  = (long)jj.krnc("ksgk", krmz(int ), (int)420);
                }
                return this.showPearls;
lbl47:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl31
                if (!(var1_1 instanceof class_1667)) ** GOTO lbl60
                if (var2_4) ** GOTO lbl31
                v5 /* !! */  = jj.td;
                if (true) ** GOTO lbl54
                block38: while (true) {
                    v5 /* !! */  = (long)(jj.krnc("ksgm", krns(int ), (int)77) - jj.krnc("ksgl", krns(int ), (int)76));
lbl54:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1304196612: {
                            continue block38;
                        }
                        case 1436090418: {
                            break block38;
                        }
                    }
                    break;
                }
                return this.showArrows;
lbl60:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl31
                if (!(var1_1 instanceof class_1685)) ** GOTO lbl85
                if (var2_4) ** GOTO lbl31
                v6 /* !! */  = jj.td;
                if (true) ** GOTO lbl67
                block39: while (true) {
                    v6 /* !! */  = (long)(v7 - jj.krnc("ksgn", krns(int ), (int)78));
lbl67:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 1310941099: {
                            v7 = jj.krnc("ksgo", krns(int ), (int)79);
                            continue block39;
                        }
                        case 1355606851: {
                            v7 = jj.krnc("ksgp", krns(int ), (int)80);
                            continue block39;
                        }
                        case 1379019007: {
                            v7 = jj.krnc("ksgq", krns(int ), (int)81);
                            continue block39;
                        }
                        case 1436090418: {
                            break block39;
                        }
                    }
                    break;
                }
                if (!this.showTridents) ** GOTO lbl85
                if (var2_4) ** GOTO lbl31
                v8 = jj.krnc("ksgr", krmz(int ), (int)421);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl88
lbl85:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v8 = jj.krnc("ksgs", krmz(int ), (int)422);
lbl88:
                // 2 sources

                return (boolean)v8;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)jj.krnc("ksgt", krmz(int ), (int)423);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl140
                    break;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)jj.krnc("ksgu", krmz(int ), (int)424);
                if (var4_2) {
                    throw null;
                }
            }
lbl99:
            // 4 sources

            case 2: {
                var3_3 /* !! */  = (int)jj.krnc("ksgv", krmz(int ), (int)425);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl114
            }
lbl104:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)jj.krnc("ksgw", krmz(int ), (int)426);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl148
            }
            case 4: {
                var3_3 /* !! */  = (int)jj.krnc("ksgx", krmz(int ), (int)427);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl118
            }
lbl114:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)jj.krnc("ksgy", krmz(int ), (int)428);
                if (!var4_2) break;
                throw null;
            }
lbl118:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)jj.krnc("ksgz", krmz(int ), (int)429);
                if (!var4_2) ** GOTO lbl99
                throw null;
            }
lbl122:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)jj.krnc("ksha", krmz(int ), (int)430);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl148
            }
lbl127:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)jj.krnc("kshb", krmz(int ), (int)431);
                if (!var4_2) ** GOTO lbl122
                throw null;
            }
lbl131:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)jj.krnc("kshc", krmz(int ), (int)432);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl140
            }
            case 10: {
                var3_3 /* !! */  = (int)jj.krnc("kshd", krmz(int ), (int)433);
                if (var4_2) {
                    throw null;
                }
            }
lbl140:
            // 5 sources

            case 11: {
                var3_3 /* !! */  = (int)jj.krnc("kshe", krmz(int ), (int)434);
                if (!var4_2) ** GOTO lbl104
                throw null;
            }
            case 12: {
                var3_3 /* !! */  = (int)jj.krnc("kshf", krmz(int ), (int)435);
                if (!var4_2) ** GOTO lbl131
                throw null;
            }
lbl148:
            // 3 sources

            case 13: {
                var3_3 /* !! */  = (int)jj.krnc("kshg", krmz(int ), (int)436);
                if (!var4_2) ** GOTO lbl127
                throw null;
            }
            case 14: {
                var3_3 /* !! */  = (int)jj.krnc("kshh", krmz(int ), (int)437);
                if (!var4_2) break;
                throw null;
            }
            case 15: 
        }
        var3_3 /* !! */  = (int)jj.krnc("kshi", krmz(int ), (int)438);
        ** while (!var4_2)
lbl159:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ksmk() {
        jj.krna[400] = -1510999236;
        jj.krna[401] = -2052786205;
        jj.krna[402] = 1793571;
        jj.krna[403] = -48483395;
        jj.krna[404] = 1158501436;
        jj.krna[405] = -156694936;
        jj.krna[406] = -1755758918;
        jj.krna[407] = -1742611188;
        jj.krna[408] = 1988728572;
        jj.krna[409] = -422193882;
        jj.krna[410] = 1234464016;
        jj.krna[411] = 1353475283;
        jj.krna[412] = 183646906;
        jj.krna[413] = 1601537917;
        jj.krna[414] = -1743162748;
        jj.krna[415] = 455759570;
        jj.krna[416] = 761936921;
        jj.krna[417] = -1525644285;
        jj.krna[418] = -1032896286;
        jj.krna[419] = 1409163482;
        jj.krna[420] = 580541401;
        jj.krna[421] = -318777069;
        jj.krna[422] = 2128595358;
        jj.krna[423] = 2117414353;
        jj.krna[424] = -489886567;
        jj.krna[425] = 1371279456;
        jj.krna[426] = -1750425197;
        jj.krna[427] = 415062008;
        jj.krna[428] = -1464195987;
        jj.krna[429] = -384163343;
        jj.krna[430] = 1084728539;
        jj.krna[431] = -1665296221;
        jj.krna[432] = -1513275392;
        jj.krna[433] = -459159172;
        jj.krna[434] = -1351358826;
        jj.krna[435] = -213169436;
        jj.krna[436] = 1130082824;
        jj.krna[437] = 1450498541;
        jj.krna[438] = -87496465;
        jj.krna[439] = 1398799374;
        jj.krna[440] = 1367192942;
        jj.krna[441] = -152822462;
        jj.krna[442] = -1967434383;
        jj.krna[443] = -1633473448;
        jj.krna[444] = -2107459037;
        jj.krna[445] = 74854679;
        jj.krna[446] = -442946282;
        jj.krna[447] = -1388788782;
        jj.krna[448] = -1745589706;
        jj.krna[449] = 1261437762;
        jj.krna[450] = 1935670510;
        jj.krna[451] = -886117412;
        jj.krna[452] = 625939347;
        jj.krna[453] = -636990410;
        jj.krna[454] = 1862816343;
        jj.krna[455] = 898121133;
        jj.krna[456] = -898810930;
        jj.krna[457] = -842505393;
        jj.krna[458] = 540293304;
        jj.krna[459] = 1816562319;
        jj.krna[460] = -1678250415;
        jj.krna[461] = -904580594;
        jj.krna[462] = 253300563;
        jj.krna[463] = -976233109;
        jj.krna[464] = -1125755947;
        jj.krna[465] = 208883259;
        jj.krna[466] = -1560805576;
        jj.krna[467] = -2063350175;
        jj.krna[468] = 1301677523;
        jj.krna[469] = -911750819;
        jj.krna[470] = -263725719;
        jj.krna[471] = -91232706;
        jj.krna[472] = 948271530;
        jj.krna[473] = 2106645825;
        jj.krna[474] = -46970064;
        jj.krna[475] = 2030424811;
        jj.krna[476] = 1619208600;
        jj.krna[477] = -1141904097;
        jj.krna[478] = -185569526;
        jj.krna[479] = 2125346970;
        jj.krna[480] = -1187016085;
        jj.krna[481] = 29324966;
        jj.krna[482] = 1219960650;
        jj.krna[483] = 1634697781;
        jj.krna[484] = -1115812804;
        jj.krna[485] = -2134894691;
        jj.krna[486] = -938782981;
        jj.krna[487] = 1409216816;
        jj.krna[488] = 1129806064;
        jj.krna[489] = 833959548;
        jj.krna[490] = -1697072592;
        jj.krna[491] = 197767002;
        jj.krna[492] = 493805531;
        jj.krna[493] = 411574838;
        jj.krna[494] = -1301707269;
        jj.krna[495] = -894296190;
        jj.krna[496] = 2016345060;
        jj.krna[497] = -536129296;
        jj.krna[498] = -1364453966;
        jj.krna[499] = -128430635;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onDraw(bu var1_1) {
        block94: {
            block93: {
                var13_2 = jj.c;
                var12_3 /* !! */  = jj.b;
                var11_4 = jj.a;
                if (var13_2) {
                    throw null;
lbl6:
                    // 23 sources

                    return;
                }
                if (var11_4 || var11_4) ** GOTO lbl6
                this.itemModelsQueued = jj.krnc("krso", krmz(int ), (int)120);
                if (var11_4 || var11_4) ** GOTO lbl6
                if (jj.mc.field_1724 == null) break block93;
                if (var11_4) ** GOTO lbl6
                if (jj.mc.field_1687 != null) break block94;
                if (var11_4) ** GOTO lbl6
            }
            if (var11_4 || var11_4) ** GOTO lbl6
            return;
        }
        if (var11_4 || var11_4) ** GOTO lbl6
        var2_5 = this.trajectories.values().iterator();
        if (var11_4) ** GOTO lbl6
        block49: while (true) lbl-1000:
        // 3 sources

        {
            block95: {
                if (var11_4 || var11_4) ** GOTO lbl6
                if (!var2_5.hasNext()) ** GOTO lbl59
                if (var11_4) ** GOTO lbl6
                var3_6 = var2_5.next();
                if (var11_4 || var11_4) ** GOTO lbl6
                var4_7 = Math.max((int)jj.krnc("krsp", krmz(int ), (int)121), var3_6.pointCount - jj.krnc("krsq", krmz(int ), (int)122));
                if (var11_4 || var11_4) ** GOTO lbl6
                if (op.project(var3_6.x[var4_7], var3_6.y[var4_7], var3_6.z[var4_7], this.projectedImpact)) break block95;
                if (var11_4 || var11_4) ** GOTO lbl6
                if (!var13_2) ** GOTO lbl-1000
                throw null;
            }
            if (var11_4 || var11_4) ** GOTO lbl6
            var5_8 = jj.TIME_FORMAT.format((float)var3_6.steps * jj.krnc("krss", krsr(int ), (int)123)) + " \u0441\u0435\u043a.";
            if (var11_4 || var11_4) ** GOTO lbl6
            var6_9 = jj.krnc("krst", krsr(int ), (int)124);
            if (var11_4 || var11_4) ** GOTO lbl6
            var7_10 = kq.width(kv.BOLD, var5_8, (float)var6_9);
            if (var11_4 || var11_4) ** GOTO lbl6
            var8_11 = var7_10 + jj.krnc("krsu", krsr(int ), (int)125);
            if (var11_4 || var11_4) ** GOTO lbl6
            if (var12_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var12_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    var9_12 = this.projectedImpact.x - var8_11 / 2.0f;
                    if (var11_4 || var11_4) ** GOTO lbl6
                    var10_13 = this.projectedImpact.y + jj.krnc("krsv", krsr(int ), (int)126);
                    if (var11_4 || var11_4) ** GOTO lbl6
                    ki.rect(var1_1.getDrawContext(), var9_12, var10_13, var8_11, (float)jj.krnc("krsw", krsr(int ), (int)127), 2.0f, (int)jj.krnc("krsx", krmz(int ), (int)128), (boolean)jj.krnc("krsy", krmz(int ), (int)129));
                    if (var11_4 || var11_4) ** GOTO lbl6
                    this.drawItem(var1_1, var3_6.stack, var9_12 + 2.0f, var10_13 + jj.krnc("krsz", krsr(int ), (int)130), (float)jj.krnc("krta", krsr(int ), (int)131));
                    if (var11_4 || var11_4) ** GOTO lbl6
                    kq.text(var1_1.getDrawContext(), kv.BOLD, var5_8, var9_12 + jj.krnc("krtb", krsr(int ), (int)132), var10_13 + jj.krnc("krtc", krsr(int ), (int)133), (float)var6_9, (int)jj.krnc("krtd", krmz(int ), (int)134), (boolean)jj.krnc("krte", krmz(int ), (int)135));
                    if (var11_4 || var11_4) ** GOTO lbl6
                    if (!var13_2) continue block49;
                    throw null;
                }
lbl59:
                // 1 sources

                if (!var11_4 && !var11_4) ** break;
                ** continue;
                return;
lbl62:
                // 2 sources

                case 0: {
                    var12_3 /* !! */  = (int)jj.krnc("krtf", krmz(int ), (int)136);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl82
                }
                case 1: {
                    var12_3 /* !! */  = (int)jj.krnc("krtg", krmz(int ), (int)137);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl126
                }
lbl72:
                // 2 sources

                case 2: {
                    var12_3 /* !! */  = (int)jj.krnc("krth", krmz(int ), (int)138);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl153
                }
                case 3: {
                    var12_3 /* !! */  = (int)jj.krnc("krti", krmz(int ), (int)139);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl116
                }
lbl82:
                // 2 sources

                case 4: {
                    var12_3 /* !! */  = (int)jj.krnc("krtj", krmz(int ), (int)140);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl111
                }
lbl87:
                // 2 sources

                case 5: {
                    var12_3 /* !! */  = (int)jj.krnc("krtk", krmz(int ), (int)141);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl166
                }
lbl92:
                // 3 sources

                case 6: {
                    var12_3 /* !! */  = (int)jj.krnc("krtl", krmz(int ), (int)142);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl243
                }
lbl97:
                // 2 sources

                case 7: {
                    var12_3 /* !! */  = (int)jj.krnc("krtm", krmz(int ), (int)143);
                    if (!var13_2) ** GOTO lbl92
                    throw null;
                }
lbl101:
                // 2 sources

                case 8: {
                    var12_3 /* !! */  = (int)jj.krnc("krtn", krmz(int ), (int)144);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl111
                }
                case 9: {
                    var12_3 /* !! */  = (int)jj.krnc("krto", krmz(int ), (int)145);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl121
                }
lbl111:
                // 5 sources

                case 10: {
                    var12_3 /* !! */  = (int)jj.krnc("krtp", krmz(int ), (int)146);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl259
                }
lbl116:
                // 3 sources

                case 11: {
                    var12_3 /* !! */  = (int)jj.krnc("krtq", krmz(int ), (int)147);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl157
                }
lbl121:
                // 3 sources

                case 12: {
                    do {
                        var12_3 /* !! */  = (int)jj.krnc("krtr", krmz(int ), (int)148);
                    } while (!var13_2);
                    throw null;
                }
lbl126:
                // 3 sources

                case 13: {
                    var12_3 /* !! */  = (int)jj.krnc("krts", krmz(int ), (int)149);
                    if (!var13_2) ** GOTO lbl111
                    throw null;
                }
lbl130:
                // 4 sources

                case 14: {
                    var12_3 /* !! */  = (int)jj.krnc("krtt", krmz(int ), (int)150);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl239
                }
                case 15: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var12_3 /* !! */  = (int)jj.krnc("krtu", krmz(int ), (int)151);
                        if (!var13_2) ** GOTO lbl121
                        throw null;
                    }
                }
                case 16: {
                    var12_3 /* !! */  = (int)jj.krnc("krtv", krmz(int ), (int)152);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl251
                }
lbl145:
                // 2 sources

                case 17: {
                    var12_3 /* !! */  = (int)jj.krnc("krtw", krmz(int ), (int)153);
                    if (!var13_2) ** GOTO lbl130
                    throw null;
                }
lbl149:
                // 2 sources

                case 18: {
                    var12_3 /* !! */  = (int)jj.krnc("krtx", krmz(int ), (int)154);
                    if (!var13_2) ** GOTO lbl126
                    throw null;
                }
lbl153:
                // 2 sources

                case 19: {
                    var12_3 /* !! */  = (int)jj.krnc("krty", krmz(int ), (int)155);
                    if (!var13_2) ** GOTO lbl87
                    throw null;
                }
lbl157:
                // 2 sources

                case 20: {
                    var12_3 /* !! */  = (int)jj.krnc("krtz", krmz(int ), (int)156);
                    if (!var13_2) ** GOTO lbl97
                    throw null;
                }
                case 21: {
                    var12_3 /* !! */  = (int)jj.krnc("krua", krmz(int ), (int)157);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl209
                }
lbl166:
                // 2 sources

                case 22: {
                    var12_3 /* !! */  = (int)jj.krnc("krub", krmz(int ), (int)158);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl259
                }
lbl171:
                // 2 sources

                case 23: {
                    var12_3 /* !! */  = (int)jj.krnc("kruc", krmz(int ), (int)159);
                    if (!var13_2) ** GOTO lbl111
                    throw null;
                }
lbl175:
                // 2 sources

                case 24: {
                    var12_3 /* !! */  = (int)jj.krnc("krud", krmz(int ), (int)160);
                    if (!var13_2) ** GOTO lbl92
                    throw null;
                }
lbl179:
                // 2 sources

                case 25: {
                    var12_3 /* !! */  = (int)jj.krnc("krue", krmz(int ), (int)161);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl197
                }
                case 26: {
                    var12_3 /* !! */  = (int)jj.krnc("kruf", krmz(int ), (int)162);
                    if (!var13_2) ** GOTO lbl179
                    throw null;
                }
                case 27: {
                    var12_3 /* !! */  = (int)jj.krnc("krug", krmz(int ), (int)163);
                    if (!var13_2) ** GOTO lbl171
                    throw null;
                }
                case 28: {
                    var12_3 /* !! */  = (int)jj.krnc("kruh", krmz(int ), (int)164);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl231
                }
lbl197:
                // 2 sources

                case 29: {
                    var12_3 /* !! */  = (int)jj.krnc("krui", krmz(int ), (int)165);
                    if (!var13_2) ** GOTO lbl175
                    throw null;
                }
lbl201:
                // 2 sources

                case 30: {
                    var12_3 /* !! */  = (int)jj.krnc("kruj", krmz(int ), (int)166);
                    if (!var13_2) ** GOTO lbl149
                    throw null;
                }
                case 31: {
                    var12_3 /* !! */  = (int)jj.krnc("kruk", krmz(int ), (int)167);
                    if (!var13_2) ** GOTO lbl145
                    throw null;
                }
lbl209:
                // 2 sources

                case 32: {
                    var12_3 /* !! */  = (int)jj.krnc("krul", krmz(int ), (int)168);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl251
                }
                case 33: {
                    var12_3 /* !! */  = (int)jj.krnc("krum", krmz(int ), (int)169);
                    if (!var13_2) ** GOTO lbl101
                    throw null;
                }
lbl218:
                // 2 sources

                case 34: {
                    var12_3 /* !! */  = (int)jj.krnc("krun", krmz(int ), (int)170);
                    if (!var13_2) ** GOTO lbl72
                    throw null;
                }
                case 35: {
                    var12_3 /* !! */  = (int)jj.krnc("kruo", krmz(int ), (int)171);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl243
                }
lbl227:
                // 2 sources

                case 36: {
                    var12_3 /* !! */  = (int)jj.krnc("krup", krmz(int ), (int)172);
                    if (!var13_2) ** GOTO lbl116
                    throw null;
                }
lbl231:
                // 2 sources

                case 37: {
                    var12_3 /* !! */  = (int)jj.krnc("kruq", krmz(int ), (int)173);
                    if (var13_2) {
                        throw null;
                    }
                }
lbl235:
                // 4 sources

                case 38: {
                    var12_3 /* !! */  = (int)jj.krnc("krur", krmz(int ), (int)174);
                    if (!var13_2) ** GOTO lbl130
                    throw null;
                }
lbl239:
                // 2 sources

                case 39: {
                    var12_3 /* !! */  = (int)jj.krnc("krus", krmz(int ), (int)175);
                    if (!var13_2) ** GOTO lbl227
                    throw null;
                }
lbl243:
                // 3 sources

                case 40: {
                    var12_3 /* !! */  = (int)jj.krnc("krut", krmz(int ), (int)176);
                    if (!var13_2) ** GOTO lbl218
                    throw null;
                }
                case 41: {
                    var12_3 /* !! */  = (int)jj.krnc("kruu", krmz(int ), (int)177);
                    if (!var13_2) ** GOTO lbl235
                    throw null;
                }
lbl251:
                // 3 sources

                case 42: {
                    var12_3 /* !! */  = (int)jj.krnc("kruv", krmz(int ), (int)178);
                    if (!var13_2) ** GOTO lbl130
                    throw null;
                }
                case 43: {
                    var12_3 /* !! */  = (int)jj.krnc("kruw", krmz(int ), (int)179);
                    if (!var13_2) ** GOTO lbl201
                    throw null;
                }
lbl259:
                // 3 sources

                case 44: {
                    var12_3 /* !! */  = (int)jj.krnc("krux", krmz(int ), (int)180);
                    if (!var13_2) ** GOTO lbl62
                    throw null;
                }
                case 45: 
            }
            break;
        }
        var12_3 /* !! */  = (int)jj.krnc("kruy", krmz(int ), (int)181);
        ** while (!var13_2)
lbl266:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ksmv() {
        jj.krnu[100] = -106607264984773606L;
        jj.krnu[101] = -7876199328671683789L;
        jj.krnu[102] = -2650062543903839983L;
        jj.krnu[103] = -4581645264044474608L;
        jj.krnu[104] = 2570895970975705612L;
        jj.krnu[105] = -1145133350622473807L;
        jj.krnu[106] = -676509366933480007L;
        jj.krnu[107] = -4109313610919875233L;
        jj.krnu[108] = -1948144773082027080L;
        jj.krnu[109] = -3948226908936696703L;
        jj.krnu[110] = -5945767242072566553L;
        jj.krnu[111] = -2162139508534043916L;
        jj.krnu[112] = -407449317766178897L;
        jj.krnu[113] = -787622993806606204L;
        jj.krnu[114] = 7927816735823777768L;
        jj.krnu[115] = 5069272723046454148L;
        jj.krnu[116] = 6277024745862375287L;
        jj.krnu[117] = -6832206588830712636L;
        jj.krnu[118] = -3221588319876598822L;
        jj.krnu[119] = -6923120785665915583L;
        jj.krnu[120] = 6798794121647851014L;
        jj.krnu[121] = -8988916523926533740L;
        jj.krnu[122] = -567798469972550379L;
        jj.krnu[123] = -8088133556882312767L;
        jj.krnu[124] = 2535606563214518942L;
        jj.krnu[125] = -2055910150001534347L;
        jj.krnu[126] = -2078939971750318522L;
        jj.krnu[127] = -5401935180478824306L;
        jj.krnu[128] = -5285730751814145177L;
        jj.krnu[129] = 5190261554416887924L;
        jj.krnu[130] = -4072312717326174846L;
        jj.krnu[131] = 2999431291951087992L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void prepareTrajectoryColors() {
        block68: {
            block69: {
                v0 /* !! */  = jj.td;
                if (true) ** GOTO lbl5
                block40: while (true) {
                    v0 /* !! */  = (long)(jj.krnc("krws", krns(int ), (int)19) - jj.krnc("krwr", krns(int ), (int)18));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -986220792: {
                            continue block40;
                        }
                        case 1436090418: {
                            break block40;
                        }
                    }
                    break;
                }
                var4_1 = jj.c;
                v1 /* !! */  = jj.td;
                if (true) ** GOTO lbl15
                block41: while (true) {
                    v1 /* !! */  = (long)(v2 - jj.krnc("krwt", krns(int ), (int)20));
lbl15:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case -1192920649: {
                            v2 = jj.krnc("krwu", krns(int ), (int)21);
                            continue block41;
                        }
                        case 1436090418: {
                            break block41;
                        }
                        case 2136373334: {
                            v2 = jj.krnc("krwv", krns(int ), (int)22);
                            continue block41;
                        }
                    }
                    break;
                }
                var3_2 /* !! */  = jj.b;
                v3 /* !! */  = jj.td;
                if (true) ** GOTO lbl29
                block42: while (true) {
                    v3 /* !! */  = (long)(v4 - jj.krnc("krww", krns(int ), (int)23));
lbl29:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 977582281: {
                            v4 = jj.krnc("krwx", krns(int ), (int)24);
                            continue block42;
                        }
                        case 1135845184: {
                            v4 = jj.krnc("krwy", krns(int ), (int)25);
                            continue block42;
                        }
                        case 1436090418: {
                            break block42;
                        }
                    }
                    break;
                }
                var2_3 = jj.a;
                if (var4_1) {
                    throw null;
lbl41:
                    // 11 sources

                    return;
                }
                if (var2_3 || var2_3) ** GOTO lbl41
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = jj.td - jj.krnc("krwz", krns(int ), (int)26)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == jj.krnc("krxa", krmz(int ), (int)226)) break;
                    v5 /* !! */  = (long)jj.krnc("krxb", krmz(int ), (int)227);
                }
                if (!this.trajectoryColorsPrepared) break block69;
                if (var2_3) ** GOTO lbl41
                return;
            }
            if (var2_3 || var2_3) ** GOTO lbl41
            var1_4 = jj.krnc("krxc", krmz(int ), (int)228);
            if (var2_3) ** GOTO lbl41
            do {
                if (var2_3 || var2_3) ** GOTO lbl41
                if (var1_4 > jj.krnc("krxd", krmz(int ), (int)229)) break block68;
                if (var2_3 || var2_3) ** GOTO lbl41
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = jj.td - jj.krnc("krxe", krns(int ), (int)27)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == jj.krnc("krxf", krmz(int ), (int)230)) break;
                    v6 /* !! */  = (long)jj.krnc("krxg", krmz(int ), (int)231);
                }
                v7 = (float)var1_4 / jj.krnc("krxh", krsr(int ), (int)232);
                while (true) {
                    if ((v8 = (cfr_temp_2 = jj.td - jj.krnc("krxi", krns(int ), (int)28)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 == jj.krnc("krxj", krmz(int ), (int)233)) break;
                    v8 = -1413348098;
                }
                this.trajectoryColors[var1_4] = nd.getClientColorAt(v7);
                if (var2_3 || var2_3) ** GOTO lbl41
                ++var1_4;
                if (var2_3) ** GOTO lbl41
            } while (!var4_1);
            throw null;
        }
        if (var2_3 || var2_3) ** GOTO lbl41
        v9 = jj.krnc("krxk", krmz(int ), (int)234);
        v10 /* !! */  = jj.td;
        if (true) ** GOTO lbl87
        block48: while (true) {
            v10 /* !! */  = (long)(jj.krnc("krxm", krns(int ), (int)30) - jj.krnc("krxl", krns(int ), (int)29));
lbl87:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case 1205144034: {
                    continue block48;
                }
                case 1436090418: {
                    break block48;
                }
            }
            break;
        }
        this.trajectoryColorsPrepared = v9;
        if (var2_3) ** GOTO lbl41
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_2 /* !! */  = (int)jj.krnc("krxn", krmz(int ), (int)235);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl110
            }
            case 1: {
                var3_2 /* !! */  = (int)jj.krnc("krxo", krmz(int ), (int)236);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl140
            }
lbl110:
            // 3 sources

            case 2: {
                var3_2 /* !! */  = (int)jj.krnc("krxp", krmz(int ), (int)237);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl144
            }
lbl115:
            // 3 sources

            case 3: {
                var3_2 /* !! */  = (int)jj.krnc("krxq", krmz(int ), (int)238);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl130
            }
lbl120:
            // 4 sources

            case 4: {
                var3_2 /* !! */  = (int)jj.krnc("krxr", krmz(int ), (int)239);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl161
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_2 /* !! */  = (int)jj.krnc("krxs", krmz(int ), (int)240);
                    if (!var4_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl130:
            // 3 sources

            case 6: {
                var3_2 /* !! */  = (int)jj.krnc("krxt", krmz(int ), (int)241);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl165
            }
lbl135:
            // 2 sources

            case 7: {
                var3_2 /* !! */  = (int)jj.krnc("krxu", krmz(int ), (int)242);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl144
            }
lbl140:
            // 2 sources

            case 8: {
                var3_2 /* !! */  = (int)jj.krnc("krxv", krmz(int ), (int)243);
                if (!var4_1) ** GOTO lbl135
                throw null;
            }
lbl144:
            // 3 sources

            case 9: {
                var3_2 /* !! */  = (int)jj.krnc("krxw", krmz(int ), (int)244);
                if (!var4_1) ** GOTO lbl130
                throw null;
            }
            case 10: {
                var3_2 /* !! */  = (int)jj.krnc("krxx", krmz(int ), (int)245);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl173
            }
            case 11: {
                var3_2 /* !! */  = (int)jj.krnc("krxy", krmz(int ), (int)246);
                if (!var4_1) ** GOTO lbl120
                throw null;
            }
            case 12: {
                var3_2 /* !! */  = (int)jj.krnc("krxz", krmz(int ), (int)247);
                if (!var4_1) ** GOTO lbl120
                throw null;
            }
lbl161:
            // 2 sources

            case 13: {
                var3_2 /* !! */  = (int)jj.krnc("krya", krmz(int ), (int)248);
                if (!var4_1) ** GOTO lbl115
                throw null;
            }
lbl165:
            // 2 sources

            case 14: {
                var3_2 /* !! */  = (int)jj.krnc("kryb", krmz(int ), (int)249);
                if (!var4_1) ** GOTO lbl110
                throw null;
            }
lbl169:
            // 3 sources

            case 15: {
                var3_2 /* !! */  = (int)jj.krnc("kryc", krmz(int ), (int)250);
                if (!var4_1) ** GOTO lbl120
                throw null;
            }
lbl173:
            // 2 sources

            case 16: {
                var3_2 /* !! */  = (int)jj.krnc("kryd", krmz(int ), (int)251);
                if (!var4_1) ** GOTO lbl169
                throw null;
            }
            case 17: {
                var3_2 /* !! */  = (int)jj.krnc("krye", krmz(int ), (int)252);
                if (!var4_1) ** GOTO lbl115
                throw null;
            }
            case 18: {
                var3_2 /* !! */  = (int)jj.krnc("kryf", krmz(int ), (int)253);
                if (!var4_1) ** GOTO lbl169
                throw null;
            }
            case 19: 
        }
        var3_2 /* !! */  = (int)jj.krnc("kryg", krmz(int ), (int)254);
        ** while (!var4_1)
lbl188:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite krnc(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void ksmn() {
        jj.krnb[100] = -836452727;
        jj.krnb[101] = 417602650;
        jj.krnb[102] = -1587270780;
        jj.krnb[103] = -999656124;
        jj.krnb[104] = 188483544;
        jj.krnb[105] = 289243749;
        jj.krnb[106] = -1194737185;
        jj.krnb[107] = -1179419410;
        jj.krnb[108] = -602383213;
        jj.krnb[109] = 1418677079;
        jj.krnb[110] = 1695446536;
        jj.krnb[111] = 1193344055;
        jj.krnb[112] = 2038163669;
        jj.krnb[113] = 1579217580;
        jj.krnb[114] = 655026016;
        jj.krnb[115] = 1483532963;
        jj.krnb[116] = 320953194;
        jj.krnb[117] = 1161143731;
        jj.krnb[118] = -1931980466;
        jj.krnb[119] = 743925106;
        jj.krnb[120] = 22255049;
        jj.krnb[121] = -274241938;
        jj.krnb[122] = 23543377;
        jj.krnb[123] = -1960515803;
        jj.krnb[124] = 71034688;
        jj.krnb[125] = -78186308;
        jj.krnb[126] = -1788487592;
        jj.krnb[127] = 575271745;
        jj.krnb[128] = -654555279;
        jj.krnb[129] = 1170931129;
        jj.krnb[130] = -1463129519;
        jj.krnb[131] = -247514542;
        jj.krnb[132] = -737262596;
        jj.krnb[133] = 706404709;
        jj.krnb[134] = -1534335233;
        jj.krnb[135] = 1235581490;
        jj.krnb[136] = -491350659;
        jj.krnb[137] = -538411389;
        jj.krnb[138] = -2107930352;
        jj.krnb[139] = 1234214539;
        jj.krnb[140] = -1914138696;
        jj.krnb[141] = -1795842877;
        jj.krnb[142] = -2117083026;
        jj.krnb[143] = -834280039;
        jj.krnb[144] = 116646163;
        jj.krnb[145] = 68201762;
        jj.krnb[146] = -2136809259;
        jj.krnb[147] = -1875833548;
        jj.krnb[148] = 1292522820;
        jj.krnb[149] = 837183633;
        jj.krnb[150] = 732546469;
        jj.krnb[151] = -1836004339;
        jj.krnb[152] = 1901236042;
        jj.krnb[153] = 1090270420;
        jj.krnb[154] = -247013640;
        jj.krnb[155] = 43719479;
        jj.krnb[156] = 1897393824;
        jj.krnb[157] = -1007586387;
        jj.krnb[158] = -511534089;
        jj.krnb[159] = 2128483305;
        jj.krnb[160] = 167187376;
        jj.krnb[161] = -966516679;
        jj.krnb[162] = -1392875927;
        jj.krnb[163] = 11167106;
        jj.krnb[164] = 99202949;
        jj.krnb[165] = -1011392872;
        jj.krnb[166] = -1079434356;
        jj.krnb[167] = 44083148;
        jj.krnb[168] = 1812712133;
        jj.krnb[169] = -1514085933;
        jj.krnb[170] = 544632360;
        jj.krnb[171] = 1095437700;
        jj.krnb[172] = -1575022627;
        jj.krnb[173] = -2041820166;
        jj.krnb[174] = -1212752416;
        jj.krnb[175] = -1723778279;
        jj.krnb[176] = 695313533;
        jj.krnb[177] = -1951273843;
        jj.krnb[178] = -426184758;
        jj.krnb[179] = 434914740;
        jj.krnb[180] = 1126116935;
        jj.krnb[181] = -1263501027;
        jj.krnb[182] = -987798462;
        jj.krnb[183] = -1327686024;
        jj.krnb[184] = 1659608770;
        jj.krnb[185] = -2003837903;
        jj.krnb[186] = -721213957;
        jj.krnb[187] = -1475875318;
        jj.krnb[188] = 410108564;
        jj.krnb[189] = 1351390829;
        jj.krnb[190] = -1159459242;
        jj.krnb[191] = 626730067;
        jj.krnb[192] = -1689317392;
        jj.krnb[193] = 216739312;
        jj.krnb[194] = 1842420470;
        jj.krnb[195] = -2075049852;
        jj.krnb[196] = -1013356467;
        jj.krnb[197] = -1257031682;
        jj.krnb[198] = -324671340;
        jj.krnb[199] = -1635216038;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean hasQueuedItemModels() {
        v0 /* !! */  = jj.td;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(v1 - jj.krnc("krol", krns(int ), (int)10));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2011718680: {
                    v1 = jj.krnc("krom", krns(int ), (int)11);
                    continue block19;
                }
                case -910855991: {
                    v1 = jj.krnc("kron", krns(int ), (int)12);
                    continue block19;
                }
                case 1436090418: {
                    break block19;
                }
            }
            break;
        }
        var3_1 = jj.c;
        v2 /* !! */  = jj.td;
        if (true) ** GOTO lbl19
        block20: while (true) {
            v2 /* !! */  = (long)(jj.krnc("krop", krns(int ), (int)14) - jj.krnc("kroo", krns(int ), (int)13));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 1367255138: {
                    continue block20;
                }
                case 1436090418: {
                    break block20;
                }
            }
            break;
        }
        var2_2 /* !! */  = jj.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = jj.td - jj.krnc("kroq", krns(int ), (int)15)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == jj.krnc("kror", krmz(int ), (int)21)) break;
            v3 /* !! */  = (long)jj.krnc("kros", krmz(int ), (int)22);
        }
        var1_3 = jj.a;
        if (var3_1) {
            throw null;
lbl34:
            // 1 sources

            return (boolean)jj.krnc("krot", krmz(int ), (int)23);
        }
        ** while (var1_3 || var1_3)
lbl37:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = jj.td;
                if (true) ** GOTO lbl44
                block23: while (true) {
                    v4 /* !! */  = (long)(jj.krnc("krov", krns(int ), (int)17) - jj.krnc("krou", krns(int ), (int)16));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -634865321: {
                            continue block23;
                        }
                        case 1436090418: {
                            break block23;
                        }
                    }
                    break;
                }
                return this.itemModelsQueued;
            }
lbl50:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)jj.krnc("krow", krmz(int ), (int)24);
                } while (!var3_1);
                throw null;
            }
lbl55:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)jj.krnc("krox", krmz(int ), (int)25);
                if (!var3_1) ** GOTO lbl50
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)jj.krnc("kroy", krmz(int ), (int)26);
                if (!var3_1) ** GOTO lbl55
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)jj.krnc("kroz", krmz(int ), (int)27);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ float krsr(int n2) {
        return Float.intBitsToFloat(krna[n2] ^ krnb[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void drawItem(bu var1_1, class_1799 var2_2, float var3_3, float var4_4, float var5_5) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jj.td - jj.krnc("ksim", krns(int ), (int)94)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == jj.krnc("ksin", krmz(int ), (int)456)) break;
            v0 /* !! */  = (long)jj.krnc("ksio", krmz(int ), (int)457);
        }
        var11_6 = jj.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = jj.td - jj.krnc("ksip", krns(int ), (int)95)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == jj.krnc("ksiq", krmz(int ), (int)458)) break;
            v1 /* !! */  = (long)jj.krnc("ksir", krmz(int ), (int)459);
        }
        var10_7 = jj.b;
        v2 /* !! */  = jj.td;
        if (true) ** GOTO lbl17
        block38: while (true) {
            v2 /* !! */  = (long)(jj.krnc("ksit", krns(int ), (int)97) - jj.krnc("ksis", krns(int ), (int)96));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1324972288: {
                    continue block38;
                }
                case 1436090418: {
                    break block38;
                }
            }
            break;
        }
        var9_8 = jj.a;
        if (var11_6) {
            throw null;
lbl25:
            // 10 sources

            return;
        }
        if (var9_8 || var9_8) ** GOTO lbl25
        v3 = jj.krnc("ksiu", krmz(int ), (int)460);
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = jj.td - jj.krnc("ksiv", krns(int ), (int)98)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == jj.krnc("ksiw", krmz(int ), (int)461)) break;
            v4 /* !! */  = (long)jj.krnc("ksix", krmz(int ), (int)462);
        }
        v5 /* !! */  = jj.td;
        if (true) ** GOTO lbl38
        block41: while (true) {
            v5 /* !! */  = (long)(v6 - jj.krnc("ksiy", krns(int ), (int)99));
lbl38:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -64128555: {
                    v6 = jj.krnc("ksiz", krns(int ), (int)100);
                    continue block41;
                }
                case 158830629: {
                    v6 = jj.krnc("ksja", krns(int ), (int)101);
                    continue block41;
                }
                case 1436090418: {
                    break block41;
                }
            }
            break;
        }
        v7 = jj.mc.method_22683();
        v8 /* !! */  = jj.td;
        if (true) ** GOTO lbl52
        block42: while (true) {
            v8 /* !! */  = (long)(jj.krnc("ksjc", krns(int ), (int)103) - jj.krnc("ksjb", krns(int ), (int)102));
lbl52:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1625433350: {
                    continue block42;
                }
                case 1436090418: {
                    break block42;
                }
            }
            break;
        }
        v9 = v7.method_4495();
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_3 = jj.td - jj.krnc("ksjd", krns(int ), (int)104)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == jj.krnc("ksje", krmz(int ), (int)463)) break;
            v10 /* !! */  = (long)jj.krnc("ksjf", krmz(int ), (int)464);
        }
        var6_9 = 2.0f / (float)Math.max((int)v3, v9);
        if (var9_8 || var9_8) ** GOTO lbl25
        var7_10 = var5_5 * var6_9 / jj.krnc("ksjg", krsr(int ), (int)465);
        if (var9_8 || var9_8) ** GOTO lbl25
        v11 /* !! */  = jj.td;
        if (true) ** GOTO lbl71
        block44: while (true) {
            v11 /* !! */  = (long)(v12 - jj.krnc("ksjh", krns(int ), (int)105));
lbl71:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -1042184819: {
                    v12 = jj.krnc("ksji", krns(int ), (int)106);
                    continue block44;
                }
                case 146683228: {
                    v12 = jj.krnc("ksjj", krns(int ), (int)107);
                    continue block44;
                }
                case 1436090418: {
                    break block44;
                }
                case 1863113144: {
                    v12 = jj.krnc("ksjk", krns(int ), (int)108);
                    continue block44;
                }
            }
            break;
        }
        v13 = var1_1.getDrawContext();
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_4 = jj.td - jj.krnc("ksjl", krns(int ), (int)109)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == jj.krnc("ksjm", krmz(int ), (int)466)) break;
            v14 /* !! */  = (long)jj.krnc("ksjn", krmz(int ), (int)467);
        }
        var8_11 = v13.method_51448();
        if (var9_8 || var9_8) ** GOTO lbl25
        v15 /* !! */  = jj.td;
        if (true) ** GOTO lbl95
        block46: while (true) {
            v15 /* !! */  = (long)(jj.krnc("ksjp", krns(int ), (int)111) - jj.krnc("ksjo", krns(int ), (int)110));
lbl95:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -504301483: {
                    continue block46;
                }
                case 1436090418: {
                    break block46;
                }
            }
            break;
        }
        var8_11.pushMatrix();
        if (var9_8 || var9_8) ** GOTO lbl25
        v16 /* !! */  = jj.td;
        if (true) ** GOTO lbl107
        block47: while (true) {
            v16 /* !! */  = (long)(jj.krnc("ksjr", krns(int ), (int)113) - jj.krnc("ksjq", krns(int ), (int)112));
lbl107:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case -1688221331: {
                    continue block47;
                }
                case 1436090418: {
                    break block47;
                }
            }
            break;
        }
        var8_11.translate(var3_3 * var6_9, var4_4 * var6_9);
        if (var9_8 || var9_8) ** GOTO lbl25
        v17 /* !! */  = jj.td;
        if (true) ** GOTO lbl119
        block48: while (true) {
            v17 /* !! */  = (long)(jj.krnc("ksjt", krns(int ), (int)115) - jj.krnc("ksjs", krns(int ), (int)114));
lbl119:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case 666590722: {
                    continue block48;
                }
                case 1436090418: {
                    break block48;
                }
            }
            break;
        }
        var8_11.scale(var7_10, var7_10);
        if (var9_8 || var9_8) ** GOTO lbl25
        while (true) {
            if ((v18 /* !! */  = (cfr_temp_5 = jj.td - jj.krnc("ksju", krns(int ), (int)116)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v18 /* !! */  == jj.krnc("ksjv", krmz(int ), (int)468)) break;
            v18 /* !! */  = (long)jj.krnc("ksjw", krmz(int ), (int)469);
        }
        v19 = var1_1.getDrawContext();
        v20 = jj.krnc("ksjx", krmz(int ), (int)470);
        v21 = jj.krnc("ksjy", krmz(int ), (int)471);
        while (true) {
            if ((v22 /* !! */  = (cfr_temp_6 = jj.td - jj.krnc("ksjz", krns(int ), (int)117)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v22 /* !! */  == jj.krnc("kska", krmz(int ), (int)472)) break;
            v22 /* !! */  = (long)jj.krnc("kskb", krmz(int ), (int)473);
        }
        v19.method_51427(var2_2, (int)v20, (int)v21);
        if (var9_8 || var9_8) ** GOTO lbl25
        while (true) {
            if ((v23 /* !! */  = (cfr_temp_7 = jj.td - jj.krnc("kskc", krns(int ), (int)118)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v23 /* !! */  == jj.krnc("kskd", krmz(int ), (int)474)) break;
            v23 /* !! */  = (long)jj.krnc("kske", krmz(int ), (int)475);
        }
        var8_11.popMatrix();
        if (var9_8 || var9_8) ** GOTO lbl25
        v24 = jj.krnc("kskf", krmz(int ), (int)476);
        v25 /* !! */  = jj.td;
        if (true) ** GOTO lbl154
        block52: while (true) {
            v25 /* !! */  = (long)(v26 - jj.krnc("kskg", krns(int ), (int)119));
lbl154:
            // 2 sources

            switch ((int)v25 /* !! */ ) {
                case -2052671910: {
                    v26 = jj.krnc("kskh", krns(int ), (int)120);
                    continue block52;
                }
                case 484941395: {
                    v26 = jj.krnc("kski", krns(int ), (int)121);
                    continue block52;
                }
                case 1436090418: {
                    break block52;
                }
            }
            break;
        }
        this.itemModelsQueued = v24;
        ** while (var9_8 || var9_8)
lbl165:
        // 1 sources

    }

    private static /* synthetic */ void ksmp() {
        jj.krnb[300] = 802751020;
        jj.krnb[301] = -296025714;
        jj.krnb[302] = -46999837;
        jj.krnb[303] = 1880632462;
        jj.krnb[304] = 88570690;
        jj.krnb[305] = 707219483;
        jj.krnb[306] = -1799146325;
        jj.krnb[307] = 1828056216;
        jj.krnb[308] = -1337032310;
        jj.krnb[309] = 237502476;
        jj.krnb[310] = 155394328;
        jj.krnb[311] = -98504751;
        jj.krnb[312] = -224004487;
        jj.krnb[313] = -1471663248;
        jj.krnb[314] = 651178926;
        jj.krnb[315] = -902027619;
        jj.krnb[316] = 1420533813;
        jj.krnb[317] = -1315316112;
        jj.krnb[318] = -1455839151;
        jj.krnb[319] = 1466162759;
        jj.krnb[320] = -1535279801;
        jj.krnb[321] = -1783684359;
        jj.krnb[322] = 1485945883;
        jj.krnb[323] = 300465989;
        jj.krnb[324] = 985210767;
        jj.krnb[325] = 347816605;
        jj.krnb[326] = 1622639472;
        jj.krnb[327] = 784722879;
        jj.krnb[328] = -1679736200;
        jj.krnb[329] = -793359685;
        jj.krnb[330] = 1600097614;
        jj.krnb[331] = -847510958;
        jj.krnb[332] = -540405653;
        jj.krnb[333] = 1003282140;
        jj.krnb[334] = -1515001879;
        jj.krnb[335] = 1465059600;
        jj.krnb[336] = -1719678072;
        jj.krnb[337] = 790087008;
        jj.krnb[338] = 738286198;
        jj.krnb[339] = -1985903413;
        jj.krnb[340] = -2128425581;
        jj.krnb[341] = 1915558489;
        jj.krnb[342] = 1618798663;
        jj.krnb[343] = 567754899;
        jj.krnb[344] = -915467476;
        jj.krnb[345] = 1490504886;
        jj.krnb[346] = 1254224151;
        jj.krnb[347] = -252802692;
        jj.krnb[348] = 861193795;
        jj.krnb[349] = 1650215331;
        jj.krnb[350] = 105939623;
        jj.krnb[351] = -1932598620;
        jj.krnb[352] = -1368753207;
        jj.krnb[353] = 662796848;
        jj.krnb[354] = -1152340087;
        jj.krnb[355] = -2057800333;
        jj.krnb[356] = -1403447125;
        jj.krnb[357] = 2015328048;
        jj.krnb[358] = 2017787707;
        jj.krnb[359] = 276808228;
        jj.krnb[360] = 2062324219;
        jj.krnb[361] = 149067619;
        jj.krnb[362] = 1844136822;
        jj.krnb[363] = 1901417604;
        jj.krnb[364] = -1418462096;
        jj.krnb[365] = -1677476905;
        jj.krnb[366] = 701406992;
        jj.krnb[367] = -426312054;
        jj.krnb[368] = 2027422952;
        jj.krnb[369] = 290732231;
        jj.krnb[370] = -1017156663;
        jj.krnb[371] = 656447952;
        jj.krnb[372] = -159346872;
        jj.krnb[373] = -661592267;
        jj.krnb[374] = 677017645;
        jj.krnb[375] = 299514374;
        jj.krnb[376] = -555093400;
        jj.krnb[377] = -1636094558;
        jj.krnb[378] = 1323523024;
        jj.krnb[379] = 1779921285;
        jj.krnb[380] = 859185061;
        jj.krnb[381] = 1021237600;
        jj.krnb[382] = 400727322;
        jj.krnb[383] = 1592246116;
        jj.krnb[384] = -758586207;
        jj.krnb[385] = -1811837131;
        jj.krnb[386] = -1757240274;
        jj.krnb[387] = 1336904226;
        jj.krnb[388] = 835377285;
        jj.krnb[389] = -318494544;
        jj.krnb[390] = 300353070;
        jj.krnb[391] = 132107061;
        jj.krnb[392] = 391510439;
        jj.krnb[393] = 590423925;
        jj.krnb[394] = 630291365;
        jj.krnb[395] = -183606963;
        jj.krnb[396] = 8457195;
        jj.krnb[397] = -1858984335;
        jj.krnb[398] = 922055082;
        jj.krnb[399] = -309881822;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void refreshTrajectories(boolean var1_1) {
        var8_2 = jj.c;
        var7_3 /* !! */  = jj.b;
        var6_4 = jj.a;
        if (var8_2) {
            throw null;
lbl6:
            // 24 sources

            return;
        }
        if (var6_4 || var6_4) ** GOTO lbl6
        this.visibleTrajectoryIds.clear();
        if (var6_4 || var6_4) ** GOTO lbl6
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var2_5 = jj.mc.field_1687.method_18112().iterator();
                if (var6_4) ** GOTO lbl6
                while (true) {
                    if (var6_4 || var6_4) ** GOTO lbl6
                    if (!var2_5.hasNext()) ** GOTO lbl60
                    if (var6_4) ** GOTO lbl6
                    var3_6 = (class_1297)var2_5.next();
                    if (var6_4 || var6_4) ** GOTO lbl6
                    if (!this.validEntity(var3_6)) continue;
                    if (var6_4) ** GOTO lbl6
                    if (this.isMoving(var3_6)) ** GOTO lbl28
                    if (var6_4) ** GOTO lbl6
                    if (!var8_2) continue;
                    throw null;
lbl28:
                    // 1 sources

                    if (var6_4 || var6_4) ** GOTO lbl6
                    var4_7 = var3_6.method_5628();
                    if (var6_4 || var6_4) ** GOTO lbl6
                    this.visibleTrajectoryIds.add(var4_7);
                    if (var6_4 || var6_4) ** GOTO lbl6
                    var5_8 = this.trajectories.get(var4_7);
                    if (var6_4 || var6_4) ** GOTO lbl6
                    if (var5_8 != null) ** GOTO lbl48
                    if (var6_4 || var6_4) ** GOTO lbl6
                    var5_8 = new jj$Trajectory();
                    if (var6_4 || var6_4) ** GOTO lbl6
                    this.trajectories.put(var4_7, var5_8);
                    if (var6_4 || var6_4) ** GOTO lbl6
                    this.simulate(var3_6, var5_8);
                    if (var6_4) ** GOTO lbl6
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl56
lbl48:
                    // 1 sources

                    if (var6_4 || var6_4) ** GOTO lbl6
                    if (var1_1) ** GOTO lbl53
                    if (var6_4) ** GOTO lbl6
                    if (!var5_8.sourceChanged(var3_6)) ** GOTO lbl56
                    if (var6_4) ** GOTO lbl6
lbl53:
                    // 2 sources

                    if (var6_4 || var6_4) ** GOTO lbl6
                    this.simulate(var3_6, var5_8);
                    if (var6_4) ** GOTO lbl6
lbl56:
                    // 3 sources

                    if (var6_4 || var6_4) ** GOTO lbl6
                    if (var8_2) break;
                }
                throw null;
lbl60:
                // 1 sources

                if (var6_4 || var6_4) ** GOTO lbl6
                this.trajectories.keySet().removeIf((Predicate<Integer>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$refreshTrajectories$0(java.lang.Integer ), (Ljava/lang/Integer;)Z)((jj)this));
                if (!var6_4 && !var6_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var7_3 /* !! */  = (int)jj.krnc("kruz", krmz(int ), (int)182);
                if (var8_2) {
                    throw null;
                }
            }
lbl70:
            // 5 sources

            case 1: {
                var7_3 /* !! */  = (int)jj.krnc("krva", krmz(int ), (int)183);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl123
            }
            case 2: {
                var7_3 /* !! */  = (int)jj.krnc("krvb", krmz(int ), (int)184);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl128
            }
lbl80:
            // 2 sources

            case 3: {
                var7_3 /* !! */  = (int)jj.krnc("krvc", krmz(int ), (int)185);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl213
            }
lbl85:
            // 2 sources

            case 4: {
                var7_3 /* !! */  = (int)jj.krnc("krvd", krmz(int ), (int)186);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl173
            }
lbl90:
            // 2 sources

            case 5: {
                var7_3 /* !! */  = (int)jj.krnc("krve", krmz(int ), (int)187);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl205
            }
            case 6: {
                var7_3 /* !! */  = (int)jj.krnc("krvf", krmz(int ), (int)188);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl100:
            // 2 sources

            case 7: {
                var7_3 /* !! */  = (int)jj.krnc("krvg", krmz(int ), (int)189);
                if (!var8_2) ** GOTO lbl80
                throw null;
            }
lbl104:
            // 2 sources

            case 8: {
                var7_3 /* !! */  = (int)jj.krnc("krvh", krmz(int ), (int)190);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl251
            }
            case 9: {
                do {
                    var7_3 /* !! */  = (int)jj.krnc("krvi", krmz(int ), (int)191);
                } while (!var8_2);
                throw null;
            }
            case 10: {
                var7_3 /* !! */  = (int)jj.krnc("krvj", krmz(int ), (int)192);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl133
            }
lbl119:
            // 2 sources

            case 11: {
                var7_3 /* !! */  = (int)jj.krnc("krvk", krmz(int ), (int)193);
                if (!var8_2) break;
                throw null;
            }
lbl123:
            // 2 sources

            case 12: {
                var7_3 /* !! */  = (int)jj.krnc("krvl", krmz(int ), (int)194);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl128:
            // 3 sources

            case 13: {
                var7_3 /* !! */  = (int)jj.krnc("krvm", krmz(int ), (int)195);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl133:
            // 2 sources

            case 14: {
                var7_3 /* !! */  = (int)jj.krnc("krvn", krmz(int ), (int)196);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl188
            }
            case 15: {
                var7_3 /* !! */  = (int)jj.krnc("krvo", krmz(int ), (int)197);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl160
            }
lbl143:
            // 2 sources

            case 16: {
                var7_3 /* !! */  = (int)jj.krnc("krvp", krmz(int ), (int)198);
                if (!var8_2) break;
                throw null;
            }
            case 17: {
                var7_3 /* !! */  = (int)jj.krnc("krvq", krmz(int ), (int)199);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl173
            }
lbl152:
            // 2 sources

            case 18: {
                var7_3 /* !! */  = (int)jj.krnc("krvr", krmz(int ), (int)200);
                if (var8_2) {
                    throw null;
                }
            }
            case 19: {
                var7_3 /* !! */  = (int)jj.krnc("krvs", krmz(int ), (int)201);
                if (!var8_2) ** GOTO lbl119
                throw null;
            }
lbl160:
            // 2 sources

            case 20: {
                var7_3 /* !! */  = (int)jj.krnc("krvt", krmz(int ), (int)202);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 21: {
                var7_3 /* !! */  = (int)jj.krnc("krvu", krmz(int ), (int)203);
                if (!var8_2) ** GOTO lbl90
                throw null;
            }
lbl169:
            // 2 sources

            case 22: {
                var7_3 /* !! */  = (int)jj.krnc("krvv", krmz(int ), (int)204);
                if (!var8_2) ** GOTO lbl70
                throw null;
            }
lbl173:
            // 3 sources

            case 23: {
                var7_3 /* !! */  = (int)jj.krnc("krvw", krmz(int ), (int)205);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl205
            }
            case 24: {
                var7_3 /* !! */  = (int)jj.krnc("krvx", krmz(int ), (int)206);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl230
            }
lbl183:
            // 2 sources

            case 25: {
                var7_3 /* !! */  = (int)jj.krnc("krvy", krmz(int ), (int)207);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl205
            }
lbl188:
            // 2 sources

            case 26: {
                var7_3 /* !! */  = (int)jj.krnc("krvz", krmz(int ), (int)208);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl255
            }
lbl193:
            // 2 sources

            case 27: {
                var7_3 /* !! */  = (int)jj.krnc("krwa", krmz(int ), (int)209);
                if (!var8_2) ** GOTO lbl183
                throw null;
            }
lbl197:
            // 2 sources

            case 28: {
                var7_3 /* !! */  = (int)jj.krnc("krwb", krmz(int ), (int)210);
                if (!var8_2) ** GOTO lbl104
                throw null;
            }
lbl201:
            // 4 sources

            case 29: {
                var7_3 /* !! */  = (int)jj.krnc("krwc", krmz(int ), (int)211);
                if (!var8_2) break;
                throw null;
            }
lbl205:
            // 5 sources

            case 30: {
                var7_3 /* !! */  = (int)jj.krnc("krwd", krmz(int ), (int)212);
                if (!var8_2) ** GOTO lbl152
                throw null;
            }
            case 31: {
                var7_3 /* !! */  = (int)jj.krnc("krwe", krmz(int ), (int)213);
                if (!var8_2) ** GOTO lbl193
                throw null;
            }
lbl213:
            // 2 sources

            case 32: {
                var7_3 /* !! */  = (int)jj.krnc("krwf", krmz(int ), (int)214);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl222
            }
            case 33: {
                var7_3 /* !! */  = (int)jj.krnc("krwg", krmz(int ), (int)215);
                if (!var8_2) ** GOTO lbl100
                throw null;
            }
lbl222:
            // 3 sources

            case 34: {
                var7_3 /* !! */  = (int)jj.krnc("krwh", krmz(int ), (int)216);
                if (!var8_2) ** GOTO lbl70
                throw null;
            }
            case 35: {
                var7_3 /* !! */  = (int)jj.krnc("krwi", krmz(int ), (int)217);
                if (!var8_2) ** GOTO lbl169
                throw null;
            }
lbl230:
            // 2 sources

            case 36: {
                var7_3 /* !! */  = (int)jj.krnc("krwj", krmz(int ), (int)218);
                if (var8_2) {
                    throw null;
                }
            }
            case 37: {
                var7_3 /* !! */  = (int)jj.krnc("krwk", krmz(int ), (int)219);
                if (!var8_2) ** GOTO lbl205
                throw null;
            }
            case 38: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_3 /* !! */  = (int)jj.krnc("krwl", krmz(int ), (int)220);
                    if (!var8_2) ** GOTO lbl201
                    throw null;
                }
            }
            case 39: {
                var7_3 /* !! */  = (int)jj.krnc("krwm", krmz(int ), (int)221);
                if (!var8_2) ** GOTO lbl85
                throw null;
            }
lbl247:
            // 2 sources

            case 40: {
                var7_3 /* !! */  = (int)jj.krnc("krwn", krmz(int ), (int)222);
                if (!var8_2) ** GOTO lbl222
                throw null;
            }
lbl251:
            // 2 sources

            case 41: {
                var7_3 /* !! */  = (int)jj.krnc("krwo", krmz(int ), (int)223);
                if (!var8_2) ** GOTO lbl247
                throw null;
            }
lbl255:
            // 2 sources

            case 42: {
                var7_3 /* !! */  = (int)jj.krnc("krwp", krmz(int ), (int)224);
                if (!var8_2) ** GOTO lbl128
                throw null;
            }
            case 43: 
        }
        var7_3 /* !! */  = (int)jj.krnc("krwq", krmz(int ), (int)225);
        ** while (!var8_2)
lbl262:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private boolean isMoving(class_1297 class_12972) {
        CallSite callSite;
        boolean bl2;
        block28: {
            Object object = td;
            boolean bl3 = true;
            block12: while (true) {
                CallSite callSite2;
                if (!bl3 || (bl3 = false) || !true) {
                    object = callSite2 - jj.krnc("ksev", krns(int ), (int)58);
                }
                switch ((int)object) {
                    case -1090162148: {
                        callSite2 = jj.krnc("ksew", krns(int ), (int)59);
                        continue block12;
                    }
                    case -1057727529: {
                        callSite2 = jj.krnc("ksex", krns(int ), (int)60);
                        continue block12;
                    }
                    case 154568350: {
                        callSite2 = jj.krnc("ksey", krns(int ), (int)61);
                        continue block12;
                    }
                    case 1436090418: {
                        break block12;
                    }
                }
                break;
            }
            boolean bl4 = c;
            Object object2 = td;
            boolean bl5 = true;
            block13: while (true) {
                CallSite callSite3;
                if (!bl5 || (bl5 = false) || !true) {
                    object2 = callSite3 - jj.krnc("ksez", krns(int ), (int)62);
                }
                switch ((int)object2) {
                    case -1940757184: {
                        callSite3 = jj.krnc("ksfa", krns(int ), (int)63);
                        continue block13;
                    }
                    case -1936718200: {
                        callSite3 = jj.krnc("ksfb", krns(int ), (int)64);
                        continue block13;
                    }
                    case -1071330735: {
                        callSite3 = jj.krnc("ksfc", krns(int ), (int)65);
                        continue block13;
                    }
                    case 1436090418: {
                        break block13;
                    }
                }
                break;
            }
            int n2 = b;
            while (true) {
                long l2;
                Object object3;
                if ((object3 = (l2 = td - jj.krnc("ksfd", krns(int ), (int)66)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
                if (object3 == jj.krnc("ksfe", krmz(int ), (int)397)) {
                    bl2 = a;
                    if (bl4) {
                        throw null;
                    }
                    break;
                }
                object3 = jj.krnc("ksff", krmz(int ), (int)398);
            }
            if (bl2 || bl2) return (boolean)jj.krnc("ksfg", krmz(int ), (int)399);
            while (true) {
                long l3;
                Object object4;
                if ((object4 = (l3 = td - jj.krnc("ksfh", krns(int ), (int)67)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
                if (object4 == jj.krnc("ksfi", krmz(int ), (int)400)) break;
                object4 = jj.krnc("ksfj", krmz(int ), (int)401);
            }
            class_243 class_2432 = class_12972.method_18798();
            while (true) {
                long l4;
                Object object5;
                if ((object5 = (l4 = td - jj.krnc("ksfk", krns(int ), (int)68)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
                if (object5 == jj.krnc("ksfl", krmz(int ), (int)402)) {
                    if (class_2432.method_1027() > jj.krnc("ksfn", kryp(int ), (int)69)) {
                        break;
                    }
                    break block28;
                }
                object5 = jj.krnc("ksfm", krmz(int ), (int)403);
            }
            if (bl2) return (boolean)jj.krnc("ksfg", krmz(int ), (int)399);
            callSite = jj.krnc("ksfo", krmz(int ), (int)404);
            if (!bl4) return (boolean)callSite;
            throw null;
        }
        if (bl2 || bl2) {
            return (boolean)jj.krnc("ksfg", krmz(int ), (int)399);
        }
        callSite = jj.krnc("ksfp", krmz(int ), (int)405);
        return (boolean)callSite;
    }

    private static /* synthetic */ void ksmr() {
        jj.krnb[500] = -2088229499;
        jj.krnb[501] = -2124745169;
        jj.krnb[502] = 820657954;
        jj.krnb[503] = 1005107997;
        jj.krnb[504] = 417273735;
        jj.krnb[505] = -754743928;
        jj.krnb[506] = 1080891199;
        jj.krnb[507] = -534425372;
        jj.krnb[508] = -361173864;
        jj.krnb[509] = -432730692;
        jj.krnb[510] = -1464162144;
        jj.krnb[511] = -852767780;
        jj.krnb[512] = -189857313;
        jj.krnb[513] = -916818014;
        jj.krnb[514] = 127720404;
        jj.krnb[515] = -1732335571;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public jj() {
        var2_1 /* !! */  = jj.b;
        super("Prediction", "\u041f\u0440\u0435\u0434\u0443\u0433\u0430\u0434\u044b\u0432\u0430\u0435\u0442 \u043a\u0443\u0434\u0430 \u0438 \u0437\u0430 \u0441\u043a\u043e\u043b\u044c\u043a\u043e \u0432\u0440\u0435\u043c\u0435\u043d\u0438 \u0443\u043f\u0430\u0434\u0435\u0442 \u0441\u043d\u0430\u0440\u044f\u0434", du.RENDER);
        this.projectiles = new ke("\u0421\u043d\u0430\u0440\u044f\u0434\u044b", "\u0412\u044b\u0431\u0435\u0440\u0438\u0442\u0435 \u0441\u043d\u0430\u0440\u044f\u0434\u044b \u0434\u043b\u044f \u0440\u0430\u0441\u0447\u0435\u0442\u0430 \u0442\u0440\u0430\u0435\u043a\u0442\u043e\u0440\u0438\u0438").value(new String[]{"\u042d\u043d\u0434\u0435\u0440 \u041f\u0451\u0440\u043b", "\u0421\u0442\u0440\u0435\u043b\u0430", "\u0422\u0440\u0435\u0437\u0443\u0431\u0435\u0446"}).selected(new String[]{"\u042d\u043d\u0434\u0435\u0440 \u041f\u0451\u0440\u043b", "\u0421\u0442\u0440\u0435\u043b\u0430", "\u0422\u0440\u0435\u0437\u0443\u0431\u0435\u0446"});
        this.trajectories = new LinkedHashMap<Integer, jj$Trajectory>();
        this.visibleTrajectoryIds = new HashSet<Integer>();
        this.projectedImpact = new Vector2f();
        this.predictedBlockPos = new class_2338.class_2339();
        this.trajectoryColors = new int[301];
        this.lastSimulationAge = (int)jj.krnc("krnd", krmz(int ), (int)0);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block15: while (true) {
            block17: {
                switch (cfr_temp_0 == -2147483648 ? var2_1 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        this.lastSelectionMask = (int)jj.krnc("krne", krmz(int ), (int)1);
                        jj.instance = this;
                        this.settings(new jx[]{this.projectiles});
                        return;
                    }
                    case 0: {
                        var2_1 /* !! */  = (int)jj.krnc("krnf", krmz(int ), (int)2);
                        cfr_temp_0 = 3;
                        break block17;
                    }
                    case 4: {
                        ** GOTO lbl51
                    }
                    case 7: {
                        var2_1 /* !! */  = (int)jj.krnc("krnm", krmz(int ), (int)9);
                    }
                    case 8: {
                        var2_1 /* !! */  = (int)jj.krnc("krnn", krmz(int ), (int)10);
                    }
                    case 1: {
                        var2_1 /* !! */  = (int)jj.krnc("krng", krmz(int ), (int)3);
                    }
                    case 2: {
                        var2_1 /* !! */  = (int)jj.krnc("krnh", krmz(int ), (int)4);
                        cfr_temp_0 = 5;
                        break block17;
                    }
                    case 9: {
                        var2_1 /* !! */  = (int)jj.krnc("krno", krmz(int ), (int)11);
                    }
                    case 6: {
                        var2_1 /* !! */  = (int)jj.krnc("krnl", krmz(int ), (int)8);
                        cfr_temp_0 = 11;
                        break block17;
                    }
                    case 10: {
                        var2_1 /* !! */  = (int)jj.krnc("krnp", krmz(int ), (int)12);
                        cfr_temp_0 = 3;
                        break block17;
                    }
                    case 11: {
                        var2_1 /* !! */  = (int)jj.krnc("krnq", krmz(int ), (int)13);
                        cfr_temp_0 = 3;
                        break block17;
                    }
                    case 12: {
                        var2_1 /* !! */  = (int)jj.krnc("krnr", krmz(int ), (int)14);
lbl51:
                        // 2 sources

                        var2_1 /* !! */  = (int)jj.krnc("krnj", krmz(int ), (int)6);
                        cfr_temp_0 = 5;
                        break block17;
                    }
                    case 3: {
                        var2_1 /* !! */  = (int)jj.krnc("krni", krmz(int ), (int)5);
                    }
                    case 5: 
                }
                ** GOTO lbl61
            }
            while (true) {
                if (true) continue block15;
lbl61:
                // 2 sources

                var2_1 /* !! */  = (int)jj.krnc("krnk", krmz(int ), (int)7);
                cfr_temp_0 = 3;
            }
            break;
        }
    }

    static {
        krna = new int[516];
        krnb = new int[516];
        jj.ksmg();
        jj.ksmh();
        jj.ksmi();
        jj.ksmj();
        jj.ksmk();
        jj.ksml();
        jj.ksmm();
        jj.ksmn();
        jj.ksmo();
        jj.ksmp();
        jj.ksmq();
        jj.ksmr();
        krnt = new long[132];
        krnu = new long[132];
        jj.ksms();
        jj.ksmt();
        jj.ksmu();
        jj.ksmv();
        TIME_FORMAT = new DecimalFormat("0.0", DecimalFormatSymbols.getInstance(Locale.ROOT));
        PEARL_ICON = new class_1799((class_1935)class_1802.field_8634);
        ARROW_ICON = new class_1799((class_1935)class_1802.field_8107);
        TRIDENT_ICON = new class_1799((class_1935)class_1802.field_8547);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean hitsBlock(class_243 var1_1, class_243 var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jj.td - jj.krnc("kscu", krns(int ), (int)36)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == jj.krnc("kscv", krmz(int ), (int)366)) break;
            v0 /* !! */  = (long)jj.krnc("kscw", krmz(int ), (int)367);
        }
        var5_3 = jj.c;
        v1 /* !! */  = jj.td;
        if (true) ** GOTO lbl11
        block31: while (true) {
            v1 /* !! */  = (long)(v2 - jj.krnc("kscx", krns(int ), (int)37));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -645670869: {
                    v2 = jj.krnc("kscy", krns(int ), (int)38);
                    continue block31;
                }
                case -133639604: {
                    v2 = jj.krnc("kscz", krns(int ), (int)39);
                    continue block31;
                }
                case 323464898: {
                    v2 = jj.krnc("ksda", krns(int ), (int)40);
                    continue block31;
                }
                case 1436090418: {
                    break block31;
                }
            }
            break;
        }
        var4_4 /* !! */  = jj.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = jj.td - jj.krnc("ksdb", krns(int ), (int)41)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == jj.krnc("ksdc", krmz(int ), (int)368)) break;
            v3 /* !! */  = (long)jj.krnc("ksdd", krmz(int ), (int)369);
        }
        var3_5 = jj.a;
        if (var5_3) {
            throw null;
lbl32:
            // 3 sources

            return (boolean)jj.krnc("ksde", krmz(int ), (int)370);
        }
        if (var3_5 || var3_5) ** GOTO lbl32
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = jj.td - jj.krnc("ksdf", krns(int ), (int)42)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == jj.krnc("ksdg", krmz(int ), (int)371)) break;
            v4 /* !! */  = (long)jj.krnc("ksdh", krmz(int ), (int)372);
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = jj.td - jj.krnc("ksdi", krns(int ), (int)43)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == jj.krnc("ksdj", krmz(int ), (int)373)) break;
            v5 /* !! */  = (long)jj.krnc("ksdk", krmz(int ), (int)374);
        }
        v6 = jj.mc.field_1687;
        v7 /* !! */  = jj.td;
        if (true) ** GOTO lbl50
        block36: while (true) {
            v7 /* !! */  = (long)(jj.krnc("ksdm", krns(int ), (int)45) - jj.krnc("ksdl", krns(int ), (int)44));
lbl50:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case 885129300: {
                    continue block36;
                }
                case 1436090418: {
                    break block36;
                }
            }
            break;
        }
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_4 = jj.td - jj.krnc("ksdn", krns(int ), (int)46)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == jj.krnc("ksdo", krmz(int ), (int)375)) break;
            v8 /* !! */  = (long)jj.krnc("ksdp", krmz(int ), (int)376);
        }
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_5 = jj.td - jj.krnc("ksdq", krns(int ), (int)47)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == jj.krnc("ksdr", krmz(int ), (int)377)) break;
            v9 /* !! */  = (long)jj.krnc("ksds", krmz(int ), (int)378);
        }
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_6 = jj.td - jj.krnc("ksdt", krns(int ), (int)48)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == jj.krnc("ksdu", krmz(int ), (int)379)) break;
            v10 /* !! */  = (long)jj.krnc("ksdv", krmz(int ), (int)380);
        }
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_7 = jj.td - jj.krnc("ksdw", krns(int ), (int)49)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == jj.krnc("ksdx", krmz(int ), (int)381)) break;
            v11 /* !! */  = (long)jj.krnc("ksdy", krmz(int ), (int)382);
        }
        v12 = jj.mc.field_1724;
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_8 = jj.td - jj.krnc("ksdz", krns(int ), (int)50)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == jj.krnc("ksea", krmz(int ), (int)383)) break;
            v13 /* !! */  = (long)jj.krnc("kseb", krmz(int ), (int)384);
        }
        v14 = new class_3959(var1_1, var2_2, class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)v12);
        v15 /* !! */  = jj.td;
        if (true) ** GOTO lbl86
        block42: while (true) {
            v15 /* !! */  = (long)(jj.krnc("ksed", krns(int ), (int)52) - jj.krnc("ksec", krns(int ), (int)51));
lbl86:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -2130163388: {
                    continue block42;
                }
                case 1436090418: {
                    break block42;
                }
            }
            break;
        }
        v16 = v6.method_17742(v14);
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_9 = jj.td - jj.krnc("ksee", krns(int ), (int)53)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == jj.krnc("ksef", krmz(int ), (int)385)) break;
            v17 /* !! */  = (long)jj.krnc("kseg", krmz(int ), (int)386);
        }
        v18 = v16.method_17783();
        v19 /* !! */  = jj.td;
        if (true) ** GOTO lbl102
        block44: while (true) {
            v19 /* !! */  = (long)(v20 - jj.krnc("kseh", krns(int ), (int)54));
lbl102:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case -1043954518: {
                    v20 = jj.krnc("ksei", krns(int ), (int)55);
                    continue block44;
                }
                case 209503037: {
                    v20 = jj.krnc("ksej", krns(int ), (int)56);
                    continue block44;
                }
                case 544753340: {
                    v20 = jj.krnc("ksek", krns(int ), (int)57);
                    continue block44;
                }
                case 1436090418: {
                    break block44;
                }
            }
            break;
        }
        if (v18 != class_239.class_240.field_1332) ** GOTO lbl123
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_5) ** GOTO lbl32
                v21 = jj.krnc("ksel", krmz(int ), (int)387);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl126
            }
lbl123:
            // 1 sources

            if (!var3_5 && !var3_5) ** break;
            ** continue;
            v21 = jj.krnc("ksem", krmz(int ), (int)388);
lbl126:
            // 2 sources

            return (boolean)v21;
lbl127:
            // 3 sources

            case 0: {
                var4_4 /* !! */  = (int)jj.krnc("ksen", krmz(int ), (int)389);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl137
            }
lbl132:
            // 2 sources

            case 1: {
                var4_4 /* !! */  = (int)jj.krnc("kseo", krmz(int ), (int)390);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl137:
            // 3 sources

            case 2: {
                var4_4 /* !! */  = (int)jj.krnc("ksep", krmz(int ), (int)391);
                if (!var5_3) ** GOTO lbl127
                throw null;
            }
            case 3: {
                var4_4 /* !! */  = (int)jj.krnc("kseq", krmz(int ), (int)392);
                if (!var5_3) ** GOTO lbl132
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var4_4 /* !! */  = (int)jj.krnc("kser", krmz(int ), (int)393);
                    if (!var5_3) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl150:
            // 2 sources

            case 5: {
                var4_4 /* !! */  = (int)jj.krnc("kses", krmz(int ), (int)394);
                if (!var5_3) ** GOTO lbl127
                throw null;
            }
            case 6: {
                var4_4 /* !! */  = (int)jj.krnc("kset", krmz(int ), (int)395);
                if (!var5_3) ** GOTO lbl137
                throw null;
            }
            case 7: 
        }
        var4_4 /* !! */  = (int)jj.krnc("kseu", krmz(int ), (int)396);
        ** while (!var5_3)
lbl161:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static jj getInstance() {
        v0 /* !! */  = jj.td;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - jj.krnc("krnv", krns(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1799989801: {
                    v1 = jj.krnc("krnw", krns(int ), (int)1);
                    continue block21;
                }
                case -1524367321: {
                    v1 = jj.krnc("krnx", krns(int ), (int)2);
                    continue block21;
                }
                case 1436090418: {
                    break block21;
                }
                case 1584767885: {
                    v1 = jj.krnc("krny", krns(int ), (int)3);
                    continue block21;
                }
            }
            break;
        }
        var2 = jj.c;
        v2 /* !! */  = jj.td;
        if (true) ** GOTO lbl22
        block22: while (true) {
            v2 /* !! */  = (long)(v3 - jj.krnc("krnz", krns(int ), (int)4));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -938780011: {
                    v3 = jj.krnc("kroa", krns(int ), (int)5);
                    continue block22;
                }
                case 493025653: {
                    v3 = jj.krnc("krob", krns(int ), (int)6);
                    continue block22;
                }
                case 1436090418: {
                    break block22;
                }
            }
            break;
        }
        var1_1 /* !! */  = jj.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = jj.td - jj.krnc("kroc", krns(int ), (int)7)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == jj.krnc("krod", krmz(int ), (int)15)) break;
            v4 /* !! */  = (long)jj.krnc("kroe", krmz(int ), (int)16);
        }
        var0_2 = jj.a;
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
        block11 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v5 /* !! */  = jj.td;
                if (true) ** GOTO lbl51
                block25: while (true) {
                    v5 /* !! */  = (long)(jj.krnc("krog", krns(int ), (int)9) - jj.krnc("krof", krns(int ), (int)8));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1745748960: {
                            continue block25;
                        }
                        case 1436090418: {
                            break block25;
                        }
                    }
                    break;
                }
                return jj.instance;
            }
lbl57:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)jj.krnc("kroh", krmz(int ), (int)17);
                    if (!var2) break block11;
                    throw null;
                }
            }
            case 1: {
                do {
                    var1_1 /* !! */  = (int)jj.krnc("kroi", krmz(int ), (int)18);
                } while (!var2);
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)jj.krnc("kroj", krmz(int ), (int)19);
                if (!var2) ** GOTO lbl57
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)jj.krnc("krok", krmz(int ), (int)20);
        ** while (!var2)
lbl74:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ksmg() {
        jj.krna[0] = 129761169;
        jj.krna[1] = -1312493850;
        jj.krna[2] = -902755518;
        jj.krna[3] = -1241375619;
        jj.krna[4] = 18864972;
        jj.krna[5] = -395019787;
        jj.krna[6] = 1975765254;
        jj.krna[7] = -1858581919;
        jj.krna[8] = -1224318340;
        jj.krna[9] = 1040569652;
        jj.krna[10] = -1644318667;
        jj.krna[11] = -1534299476;
        jj.krna[12] = -450971517;
        jj.krna[13] = -1614967998;
        jj.krna[14] = 1939985922;
        jj.krna[15] = 1637671625;
        jj.krna[16] = 1347201923;
        jj.krna[17] = 1229617488;
        jj.krna[18] = -36386715;
        jj.krna[19] = 1391243314;
        jj.krna[20] = 2048341795;
        jj.krna[21] = 273204663;
        jj.krna[22] = -909355691;
        jj.krna[23] = -11750726;
        jj.krna[24] = 671954047;
        jj.krna[25] = -1826235470;
        jj.krna[26] = 921415537;
        jj.krna[27] = 1141048741;
        jj.krna[28] = 1532472071;
        jj.krna[29] = 977484918;
        jj.krna[30] = 1220997615;
        jj.krna[31] = 589047045;
        jj.krna[32] = 1717864486;
        jj.krna[33] = 1885571647;
        jj.krna[34] = -1872698438;
        jj.krna[35] = 1078521830;
        jj.krna[36] = -1376008889;
        jj.krna[37] = -1985323358;
        jj.krna[38] = 131087908;
        jj.krna[39] = -290399155;
        jj.krna[40] = 32260311;
        jj.krna[41] = 955040160;
        jj.krna[42] = 363501972;
        jj.krna[43] = -1846958426;
        jj.krna[44] = -885215092;
        jj.krna[45] = -1810693696;
        jj.krna[46] = -871510838;
        jj.krna[47] = -1710595935;
        jj.krna[48] = 339542827;
        jj.krna[49] = -1879217573;
        jj.krna[50] = 17788264;
        jj.krna[51] = -115726332;
        jj.krna[52] = 818406584;
        jj.krna[53] = -275546889;
        jj.krna[54] = 877348240;
        jj.krna[55] = 1443154608;
        jj.krna[56] = -1244964274;
        jj.krna[57] = -1040478631;
        jj.krna[58] = 2005062720;
        jj.krna[59] = -484452334;
        jj.krna[60] = -718624368;
        jj.krna[61] = -1284312553;
        jj.krna[62] = 885860256;
        jj.krna[63] = -1242633192;
        jj.krna[64] = 897253446;
        jj.krna[65] = 1897730163;
        jj.krna[66] = 83340235;
        jj.krna[67] = -478270349;
        jj.krna[68] = -817918912;
        jj.krna[69] = -1532883106;
        jj.krna[70] = -106054155;
        jj.krna[71] = -728349309;
        jj.krna[72] = 39910403;
        jj.krna[73] = -287574822;
        jj.krna[74] = 33953430;
        jj.krna[75] = 528312491;
        jj.krna[76] = -236478903;
        jj.krna[77] = 1130061546;
        jj.krna[78] = -227383687;
        jj.krna[79] = 1580010216;
        jj.krna[80] = -1329690317;
        jj.krna[81] = -142918782;
        jj.krna[82] = 1543417019;
        jj.krna[83] = -1742967517;
        jj.krna[84] = 0xBB98BB8;
        jj.krna[85] = 1095575148;
        jj.krna[86] = -1215092329;
        jj.krna[87] = -633588389;
        jj.krna[88] = -629222780;
        jj.krna[89] = 723404337;
        jj.krna[90] = -2117797831;
        jj.krna[91] = -289435625;
        jj.krna[92] = 93354623;
        jj.krna[93] = -1309746526;
        jj.krna[94] = 401514752;
        jj.krna[95] = 85175341;
        jj.krna[96] = -1698595143;
        jj.krna[97] = -835398949;
        jj.krna[98] = 1762346445;
        jj.krna[99] = -1188131832;
    }

    private static /* synthetic */ int krmz(int n2) {
        return krna[n2] ^ krnb[n2];
    }

    private static /* synthetic */ void ksmt() {
        jj.krnt[100] = -8539345951827698057L;
        jj.krnt[101] = 4647669235522399342L;
        jj.krnt[102] = -2025032132534030557L;
        jj.krnt[103] = -2418193679988587459L;
        jj.krnt[104] = 7031893670933338003L;
        jj.krnt[105] = 2738437698633744745L;
        jj.krnt[106] = 7068557602057650128L;
        jj.krnt[107] = 6427409312799275315L;
        jj.krnt[108] = -4614706009853834678L;
        jj.krnt[109] = 4304123119812310568L;
        jj.krnt[110] = -7672880531647412760L;
        jj.krnt[111] = 5487544809285129223L;
        jj.krnt[112] = -1598375589286173003L;
        jj.krnt[113] = -8963080772399524432L;
        jj.krnt[114] = 3683108561813808982L;
        jj.krnt[115] = 4109748834873259460L;
        jj.krnt[116] = 7097815186258840927L;
        jj.krnt[117] = -1616490507357297627L;
        jj.krnt[118] = 7778799872354447439L;
        jj.krnt[119] = -1913192584915977803L;
        jj.krnt[120] = 1165860780094912438L;
        jj.krnt[121] = 2904607877660221651L;
        jj.krnt[122] = -4813231887973033942L;
        jj.krnt[123] = -1695992276593592847L;
        jj.krnt[124] = -1238431860890471588L;
        jj.krnt[125] = -5654976591570454693L;
        jj.krnt[126] = 8696724660215376478L;
        jj.krnt[127] = 6815729745311553955L;
        jj.krnt[128] = 8311040158217453164L;
        jj.krnt[129] = -600687610225645919L;
        jj.krnt[130] = -2371569575650946112L;
        jj.krnt[131] = 7660865216528512004L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void simulate(class_1297 var1_1, jj$Trajectory var2_2) {
        var24_3 = jj.c;
        var23_4 /* !! */  = jj.b;
        var22_5 = jj.a;
        if (var24_3) {
            throw null;
lbl6:
            // 55 sources

            return;
        }
        if (var22_5 || var22_5) ** GOTO lbl6
        var3_6 = var1_1.method_73189();
        if (var22_5 || var22_5) ** GOTO lbl6
        var4_7 = var1_1.method_18798();
        if (var22_5 || var22_5) ** GOTO lbl6
        var5_8 = var4_7.field_1352;
        if (var22_5 || var22_5) ** GOTO lbl6
        var7_9 = var4_7.field_1351;
        if (var22_5 || var22_5) ** GOTO lbl6
        var9_10 = var4_7.field_1350;
        if (var22_5 || var22_5) ** GOTO lbl6
        var11_11 = jj.krnc("kryh", krmz(int ), (int)255);
        if (var22_5 || var22_5) ** GOTO lbl6
        var12_12 = jj.krnc("kryi", krmz(int ), (int)256);
        if (var22_5) ** GOTO lbl6
        if (var23_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var23_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var22_5) ** GOTO lbl6
                var2_2.x[0] = var3_6.field_1352;
                if (var22_5 || var22_5) ** GOTO lbl6
                var2_2.y[0] = var3_6.field_1351;
                if (var22_5 || var22_5) ** GOTO lbl6
                var2_2.z[0] = var3_6.field_1350;
                if (var22_5 || var22_5) ** GOTO lbl6
                var13_13 = var1_1.method_5799();
                if (var22_5 || var22_5) ** GOTO lbl6
                var14_14 = var1_1 instanceof class_1684;
                if (var22_5 || var22_5) ** GOTO lbl6
                var15_15 = var1_1 instanceof class_1685;
                if (var22_5 || var22_5) ** GOTO lbl6
                if (var1_1.method_5740()) ** GOTO lbl45
                if (var22_5) ** GOTO lbl6
                v0 = jj.krnc("kryj", krmz(int ), (int)257);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl47
lbl45:
                // 1 sources

                if (var22_5 || var22_5) ** GOTO lbl6
                v0 = var16_16 = jj.krnc("kryk", krmz(int ), (int)258);
lbl47:
                // 2 sources

                if (var22_5 || var22_5) ** GOTO lbl6
                var17_17 = jj.krnc("kryl", krmz(int ), (int)259);
                if (var22_5) ** GOTO lbl6
                do {
                    if (var22_5 || var22_5) ** GOTO lbl6
                    if (var17_17 > jj.krnc("krym", krmz(int ), (int)260)) ** GOTO lbl130
                    if (var22_5 || var22_5) ** GOTO lbl6
                    ++var11_11;
                    if (var22_5 || var22_5) ** GOTO lbl6
                    var18_18 = new class_243(var3_6.field_1352 + var5_8, var3_6.field_1351 + var7_9, var3_6.field_1350 + var9_10);
                    if (var22_5 || var22_5) ** GOTO lbl6
                    this.predictedBlockPos.method_10103(class_3532.method_15357((double)var18_18.field_1352), class_3532.method_15357((double)var18_18.field_1351), class_3532.method_15357((double)var18_18.field_1350));
                    if (var22_5 || var22_5) ** GOTO lbl6
                    if (var13_13) ** GOTO lbl65
                    if (var22_5) ** GOTO lbl6
                    if (!jj.mc.field_1687.method_8316((class_2338)this.predictedBlockPos).method_15767(class_3486.field_15517)) ** GOTO lbl70
                    if (var22_5) ** GOTO lbl6
lbl65:
                    // 2 sources

                    if (var22_5 || var22_5) ** GOTO lbl6
                    v1 = jj.krnc("kryn", krmz(int ), (int)261);
                    if (var24_3) {
                        throw null;
                    }
                    ** GOTO lbl72
lbl70:
                    // 1 sources

                    if (var22_5 || var22_5) ** GOTO lbl6
                    v1 = var19_19 = jj.krnc("kryo", krmz(int ), (int)262);
lbl72:
                    // 2 sources

                    if (var22_5 || var22_5) ** GOTO lbl6
                    if (var19_19 == false) ** GOTO lbl88
                    if (var22_5) ** GOTO lbl6
                    if (var15_15) ** GOTO lbl88
                    if (var22_5 || var22_5) ** GOTO lbl6
                    if (!var14_14) ** GOTO lbl83
                    if (var22_5) ** GOTO lbl6
                    v2 = jj.krnc("kryq", kryp(int ), (int)31);
                    if (var24_3) {
                        throw null;
                    }
                    ** GOTO lbl90
lbl83:
                    // 1 sources

                    if (var22_5 || var22_5) ** GOTO lbl6
                    v2 = jj.krnc("kryr", kryp(int ), (int)32);
                    if (var24_3) {
                        throw null;
                    }
                    ** GOTO lbl90
lbl88:
                    // 2 sources

                    if (var22_5 || var22_5) ** GOTO lbl6
                    v2 = var20_20 = jj.krnc("krys", kryp(int ), (int)33);
lbl90:
                    // 3 sources

                    if (var22_5 || var22_5) ** GOTO lbl6
                    var5_8 *= var20_20;
                    if (var22_5 || var22_5) ** GOTO lbl6
                    var7_9 *= var20_20;
                    if (var22_5 || var22_5) ** GOTO lbl6
                    var9_10 *= var20_20;
                    if (var22_5 || var22_5) ** GOTO lbl6
                    if (var16_16 == false) ** GOTO lbl107
                    if (var22_5 || var22_5) ** GOTO lbl6
                    if (var14_14) {
                        v3 = jj.krnc("kryt", kryp(int ), (int)34);
                        if (var24_3) {
                            throw null;
                        }
                    } else {
                        v3 = jj.krnc("kryu", kryp(int ), (int)35);
                    }
                    var7_9 -= v3;
                    if (var22_5) ** GOTO lbl6
lbl107:
                    // 2 sources

                    if (var22_5 || var22_5) ** GOTO lbl6
                    if (this.hitsBlock(var3_6, var18_18)) ** GOTO lbl130
                    if (var22_5) ** GOTO lbl6
                    if (!(var18_18.field_1351 <= 0.0)) ** GOTO lbl115
                    if (var22_5) ** GOTO lbl6
                    if (var24_3) {
                        throw null;
                    }
                    ** GOTO lbl130
lbl115:
                    // 1 sources

                    if (var22_5 || var22_5) ** GOTO lbl6
                    var2_2.x[var12_12] = var18_18.field_1352;
                    if (var22_5 || var22_5) ** GOTO lbl6
                    var2_2.y[var12_12] = var18_18.field_1351;
                    if (var22_5 || var22_5) ** GOTO lbl6
                    var2_2.z[var12_12] = var18_18.field_1350;
                    if (var22_5 || var22_5) ** GOTO lbl6
                    ++var12_12;
                    if (var22_5 || var22_5) ** GOTO lbl6
                    var3_6 = var18_18;
                    if (var22_5 || var22_5) ** GOTO lbl6
                    ++var17_17;
                    if (var22_5) ** GOTO lbl6
                } while (!var24_3);
                throw null;
lbl130:
                // 3 sources

                if (var22_5 || var22_5) ** GOTO lbl6
                var2_2.pointCount = (int)var12_12;
                if (var22_5 || var22_5) ** GOTO lbl6
                var2_2.steps = (int)var11_11;
                if (var22_5 || var22_5) ** GOTO lbl6
                var2_2.stack = this.projectileStack(var1_1);
                if (var22_5 || var22_5) ** GOTO lbl6
                var2_2.captureSource(var1_1);
                if (!var22_5 && !var22_5) ** break;
                ** continue;
                return;
            }
            case 0: {
                var23_4 /* !! */  = (int)jj.krnc("kryv", krmz(int ), (int)263);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl440
            }
lbl146:
            // 2 sources

            case 1: {
                var23_4 /* !! */  = (int)jj.krnc("kryw", krmz(int ), (int)264);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl378
            }
            case 2: {
                var23_4 /* !! */  = (int)jj.krnc("kryx", krmz(int ), (int)265);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl531
            }
lbl156:
            // 2 sources

            case 3: {
                var23_4 /* !! */  = (int)jj.krnc("kryy", krmz(int ), (int)266);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl373
            }
lbl161:
            // 2 sources

            case 4: {
                var23_4 /* !! */  = (int)jj.krnc("kryz", krmz(int ), (int)267);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl171
            }
            case 5: {
                var23_4 /* !! */  = (int)jj.krnc("krza", krmz(int ), (int)268);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl582
            }
lbl171:
            // 2 sources

            case 6: {
                var23_4 /* !! */  = (int)jj.krnc("krzb", krmz(int ), (int)269);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl540
            }
lbl176:
            // 2 sources

            case 7: {
                var23_4 /* !! */  = (int)jj.krnc("krzc", krmz(int ), (int)270);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl309
            }
lbl181:
            // 3 sources

            case 8: {
                var23_4 /* !! */  = (int)jj.krnc("krzd", krmz(int ), (int)271);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl527
            }
            case 9: {
                var23_4 /* !! */  = (int)jj.krnc("krze", krmz(int ), (int)272);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl323
            }
            case 10: {
                var23_4 /* !! */  = (int)jj.krnc("krzf", krmz(int ), (int)273);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl466
            }
            case 11: {
                var23_4 /* !! */  = (int)jj.krnc("krzg", krmz(int ), (int)274);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl270
            }
            case 12: {
                var23_4 /* !! */  = (int)jj.krnc("krzh", krmz(int ), (int)275);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl347
            }
            case 13: {
                var23_4 /* !! */  = (int)jj.krnc("krzi", krmz(int ), (int)276);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl294
            }
lbl211:
            // 2 sources

            case 14: {
                var23_4 /* !! */  = (int)jj.krnc("krzj", krmz(int ), (int)277);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl440
            }
            case 15: {
                var23_4 /* !! */  = (int)jj.krnc("krzk", krmz(int ), (int)278);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl373
            }
lbl221:
            // 2 sources

            case 16: {
                var23_4 /* !! */  = (int)jj.krnc("krzl", krmz(int ), (int)279);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl457
            }
            case 17: {
                var23_4 /* !! */  = (int)jj.krnc("krzm", krmz(int ), (int)280);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl304
            }
            case 18: {
                var23_4 /* !! */  = (int)jj.krnc("krzn", krmz(int ), (int)281);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl328
            }
lbl236:
            // 2 sources

            case 19: {
                var23_4 /* !! */  = (int)jj.krnc("krzo", krmz(int ), (int)282);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl275
            }
lbl241:
            // 4 sources

            case 20: {
                var23_4 /* !! */  = (int)jj.krnc("krzp", krmz(int ), (int)283);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl554
            }
lbl246:
            // 3 sources

            case 21: {
                var23_4 /* !! */  = (int)jj.krnc("krzq", krmz(int ), (int)284);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl265
            }
lbl251:
            // 2 sources

            case 22: {
                var23_4 /* !! */  = (int)jj.krnc("krzr", krmz(int ), (int)285);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl453
            }
lbl256:
            // 2 sources

            case 23: {
                var23_4 /* !! */  = (int)jj.krnc("krzs", krmz(int ), (int)286);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl602
            }
lbl261:
            // 2 sources

            case 24: {
                var23_4 /* !! */  = (int)jj.krnc("krzt", krmz(int ), (int)287);
                if (!var24_3) ** GOTO lbl181
                throw null;
            }
lbl265:
            // 5 sources

            case 25: {
                var23_4 /* !! */  = (int)jj.krnc("krzu", krmz(int ), (int)288);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl527
            }
lbl270:
            // 3 sources

            case 26: {
                var23_4 /* !! */  = (int)jj.krnc("krzv", krmz(int ), (int)289);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl558
            }
lbl275:
            // 2 sources

            case 27: {
                var23_4 /* !! */  = (int)jj.krnc("krzw", krmz(int ), (int)290);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl423
            }
            case 28: {
                var23_4 /* !! */  = (int)jj.krnc("krzx", krmz(int ), (int)291);
                if (!var24_3) ** GOTO lbl241
                throw null;
            }
lbl284:
            // 3 sources

            case 29: {
                var23_4 /* !! */  = (int)jj.krnc("krzy", krmz(int ), (int)292);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl314
            }
            case 30: {
                var23_4 /* !! */  = (int)jj.krnc("krzz", krmz(int ), (int)293);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl574
            }
lbl294:
            // 4 sources

            case 31: {
                var23_4 /* !! */  = (int)jj.krnc("ksaa", krmz(int ), (int)294);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl519
            }
lbl299:
            // 3 sources

            case 32: {
                var23_4 /* !! */  = (int)jj.krnc("ksab", krmz(int ), (int)295);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl388
            }
lbl304:
            // 2 sources

            case 33: {
                var23_4 /* !! */  = (int)jj.krnc("ksac", krmz(int ), (int)296);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl392
            }
lbl309:
            // 2 sources

            case 34: {
                var23_4 /* !! */  = (int)jj.krnc("ksad", krmz(int ), (int)297);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl400
            }
lbl314:
            // 2 sources

            case 35: {
                var23_4 /* !! */  = (int)jj.krnc("ksae", krmz(int ), (int)298);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl570
            }
            case 36: {
                var23_4 /* !! */  = (int)jj.krnc("ksaf", krmz(int ), (int)299);
                if (!var24_3) ** GOTO lbl146
                throw null;
            }
lbl323:
            // 3 sources

            case 37: {
                var23_4 /* !! */  = (int)jj.krnc("ksag", krmz(int ), (int)300);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl483
            }
lbl328:
            // 3 sources

            case 38: {
                var23_4 /* !! */  = (int)jj.krnc("ksah", krmz(int ), (int)301);
                if (!var24_3) ** GOTO lbl161
                throw null;
            }
lbl332:
            // 2 sources

            case 39: {
                var23_4 /* !! */  = (int)jj.krnc("ksai", krmz(int ), (int)302);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl535
            }
            case 40: {
                var23_4 /* !! */  = (int)jj.krnc("ksaj", krmz(int ), (int)303);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl570
            }
            case 41: {
                var23_4 /* !! */  = (int)jj.krnc("ksak", krmz(int ), (int)304);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl495
            }
lbl347:
            // 2 sources

            case 42: {
                var23_4 /* !! */  = (int)jj.krnc("ksal", krmz(int ), (int)305);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl383
            }
lbl352:
            // 2 sources

            case 43: {
                var23_4 /* !! */  = (int)jj.krnc("ksam", krmz(int ), (int)306);
                if (!var24_3) ** GOTO lbl241
                throw null;
            }
lbl356:
            // 2 sources

            case 44: {
                var23_4 /* !! */  = (int)jj.krnc("ksan", krmz(int ), (int)307);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl474
            }
lbl361:
            // 2 sources

            case 45: {
                var23_4 /* !! */  = (int)jj.krnc("ksao", krmz(int ), (int)308);
                if (!var24_3) ** GOTO lbl176
                throw null;
            }
            case 46: {
                var23_4 /* !! */  = (int)jj.krnc("ksap", krmz(int ), (int)309);
                if (!var24_3) ** GOTO lbl265
                throw null;
            }
            case 47: {
                var23_4 /* !! */  = (int)jj.krnc("ksaq", krmz(int ), (int)310);
                if (!var24_3) ** GOTO lbl221
                throw null;
            }
lbl373:
            // 3 sources

            case 48: {
                var23_4 /* !! */  = (int)jj.krnc("ksar", krmz(int ), (int)311);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl594
            }
lbl378:
            // 2 sources

            case 49: {
                do {
                    var23_4 /* !! */  = (int)jj.krnc("ksas", krmz(int ), (int)312);
                } while (!var24_3);
                throw null;
            }
lbl383:
            // 2 sources

            case 50: {
                var23_4 /* !! */  = (int)jj.krnc("ksat", krmz(int ), (int)313);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl527
            }
lbl388:
            // 2 sources

            case 51: {
                var23_4 /* !! */  = (int)jj.krnc("ksau", krmz(int ), (int)314);
                if (!var24_3) ** GOTO lbl246
                throw null;
            }
lbl392:
            // 2 sources

            case 52: {
                var23_4 /* !! */  = (int)jj.krnc("ksav", krmz(int ), (int)315);
                if (!var24_3) break;
                throw null;
            }
lbl396:
            // 2 sources

            case 53: {
                var23_4 /* !! */  = (int)jj.krnc("ksaw", krmz(int ), (int)316);
                if (!var24_3) ** GOTO lbl332
                throw null;
            }
lbl400:
            // 5 sources

            case 54: {
                var23_4 /* !! */  = (int)jj.krnc("ksax", krmz(int ), (int)317);
                if (!var24_3) ** GOTO lbl236
                throw null;
            }
            case 55: {
                var23_4 /* !! */  = (int)jj.krnc("ksay", krmz(int ), (int)318);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl491
            }
            case 56: {
                var23_4 /* !! */  = (int)jj.krnc("ksaz", krmz(int ), (int)319);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl418
            }
lbl414:
            // 2 sources

            case 57: {
                var23_4 /* !! */  = (int)jj.krnc("ksba", krmz(int ), (int)320);
                if (!var24_3) ** GOTO lbl400
                throw null;
            }
lbl418:
            // 3 sources

            case 58: {
                var23_4 /* !! */  = (int)jj.krnc("ksbb", krmz(int ), (int)321);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl545
            }
lbl423:
            // 2 sources

            case 59: {
                var23_4 /* !! */  = (int)jj.krnc("ksbc", krmz(int ), (int)322);
                if (!var24_3) ** GOTO lbl270
                throw null;
            }
lbl427:
            // 2 sources

            case 60: {
                var23_4 /* !! */  = (int)jj.krnc("ksbd", krmz(int ), (int)323);
                if (!var24_3) ** GOTO lbl328
                throw null;
            }
            case 61: {
                var23_4 /* !! */  = (int)jj.krnc("ksbe", krmz(int ), (int)324);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl453
            }
            case 62: {
                var23_4 /* !! */  = (int)jj.krnc("ksbf", krmz(int ), (int)325);
                if (!var24_3) ** GOTO lbl400
                throw null;
            }
lbl440:
            // 3 sources

            case 63: {
                var23_4 /* !! */  = (int)jj.krnc("ksbg", krmz(int ), (int)326);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl598
            }
            case 64: {
                var23_4 /* !! */  = (int)jj.krnc("ksbh", krmz(int ), (int)327);
                if (!var24_3) ** GOTO lbl294
                throw null;
            }
            case 65: {
                var23_4 /* !! */  = (int)jj.krnc("ksbi", krmz(int ), (int)328);
                if (!var24_3) ** GOTO lbl246
                throw null;
            }
lbl453:
            // 4 sources

            case 66: {
                var23_4 /* !! */  = (int)jj.krnc("ksbj", krmz(int ), (int)329);
                if (!var24_3) ** GOTO lbl427
                throw null;
            }
lbl457:
            // 2 sources

            case 67: {
                var23_4 /* !! */  = (int)jj.krnc("ksbk", krmz(int ), (int)330);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl505
            }
lbl462:
            // 2 sources

            case 68: {
                var23_4 /* !! */  = (int)jj.krnc("ksbl", krmz(int ), (int)331);
                if (!var24_3) ** GOTO lbl241
                throw null;
            }
lbl466:
            // 2 sources

            case 69: {
                var23_4 /* !! */  = (int)jj.krnc("ksbm", krmz(int ), (int)332);
                if (!var24_3) ** GOTO lbl251
                throw null;
            }
lbl470:
            // 2 sources

            case 70: {
                var23_4 /* !! */  = (int)jj.krnc("ksbn", krmz(int ), (int)333);
                if (!var24_3) ** GOTO lbl323
                throw null;
            }
lbl474:
            // 2 sources

            case 71: {
                var23_4 /* !! */  = (int)jj.krnc("ksbo", krmz(int ), (int)334);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl509
            }
            case 72: {
                var23_4 /* !! */  = (int)jj.krnc("ksbp", krmz(int ), (int)335);
                if (!var24_3) ** GOTO lbl256
                throw null;
            }
lbl483:
            // 2 sources

            case 73: {
                var23_4 /* !! */  = (int)jj.krnc("ksbq", krmz(int ), (int)336);
                if (!var24_3) ** GOTO lbl156
                throw null;
            }
            case 74: {
                var23_4 /* !! */  = (int)jj.krnc("ksbr", krmz(int ), (int)337);
                if (!var24_3) ** GOTO lbl356
                throw null;
            }
lbl491:
            // 2 sources

            case 75: {
                var23_4 /* !! */  = (int)jj.krnc("ksbs", krmz(int ), (int)338);
                if (!var24_3) ** GOTO lbl181
                throw null;
            }
lbl495:
            // 3 sources

            case 76: {
                var23_4 /* !! */  = (int)jj.krnc("ksbt", krmz(int ), (int)339);
                if (!var24_3) ** GOTO lbl294
                throw null;
            }
            case 77: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var23_4 /* !! */  = (int)jj.krnc("ksbu", krmz(int ), (int)340);
                    if (var24_3) {
                        throw null;
                    }
                    ** GOTO lbl535
                    break;
                }
            }
lbl505:
            // 2 sources

            case 78: {
                var23_4 /* !! */  = (int)jj.krnc("ksbv", krmz(int ), (int)341);
                if (!var24_3) ** GOTO lbl299
                throw null;
            }
lbl509:
            // 2 sources

            case 79: {
                var23_4 /* !! */  = (int)jj.krnc("ksbw", krmz(int ), (int)342);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl566
            }
            case 80: {
                var23_4 /* !! */  = (int)jj.krnc("ksbx", krmz(int ), (int)343);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl558
            }
lbl519:
            // 2 sources

            case 81: {
                var23_4 /* !! */  = (int)jj.krnc("ksby", krmz(int ), (int)344);
                if (!var24_3) ** GOTO lbl284
                throw null;
            }
            case 82: {
                var23_4 /* !! */  = (int)jj.krnc("ksbz", krmz(int ), (int)345);
                if (!var24_3) ** GOTO lbl396
                throw null;
            }
lbl527:
            // 4 sources

            case 83: {
                var23_4 /* !! */  = (int)jj.krnc("ksca", krmz(int ), (int)346);
                if (!var24_3) ** GOTO lbl265
                throw null;
            }
lbl531:
            // 2 sources

            case 84: {
                var23_4 /* !! */  = (int)jj.krnc("kscb", krmz(int ), (int)347);
                if (!var24_3) ** GOTO lbl211
                throw null;
            }
lbl535:
            // 3 sources

            case 85: {
                var23_4 /* !! */  = (int)jj.krnc("kscc", krmz(int ), (int)348);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl562
            }
lbl540:
            // 2 sources

            case 86: {
                do {
                    var23_4 /* !! */  = (int)jj.krnc("kscd", krmz(int ), (int)349);
                } while (!var24_3);
                throw null;
            }
lbl545:
            // 2 sources

            case 87: {
                var23_4 /* !! */  = (int)jj.krnc("ksce", krmz(int ), (int)350);
                if (var24_3) {
                    throw null;
                }
                ** GOTO lbl590
            }
            case 88: {
                var23_4 /* !! */  = (int)jj.krnc("kscf", krmz(int ), (int)351);
                if (!var24_3) ** GOTO lbl400
                throw null;
            }
lbl554:
            // 2 sources

            case 89: {
                var23_4 /* !! */  = (int)jj.krnc("kscg", krmz(int ), (int)352);
                if (!var24_3) ** GOTO lbl352
                throw null;
            }
lbl558:
            // 3 sources

            case 90: {
                var23_4 /* !! */  = (int)jj.krnc("ksch", krmz(int ), (int)353);
                if (!var24_3) ** GOTO lbl414
                throw null;
            }
lbl562:
            // 2 sources

            case 91: {
                var23_4 /* !! */  = (int)jj.krnc("ksci", krmz(int ), (int)354);
                if (!var24_3) ** GOTO lbl265
                throw null;
            }
lbl566:
            // 2 sources

            case 92: {
                var23_4 /* !! */  = (int)jj.krnc("kscj", krmz(int ), (int)355);
                if (!var24_3) ** GOTO lbl462
                throw null;
            }
lbl570:
            // 3 sources

            case 93: {
                var23_4 /* !! */  = (int)jj.krnc("ksck", krmz(int ), (int)356);
                if (var24_3) {
                    throw null;
                }
            }
lbl574:
            // 4 sources

            case 94: {
                var23_4 /* !! */  = (int)jj.krnc("kscl", krmz(int ), (int)357);
                if (!var24_3) ** GOTO lbl361
                throw null;
            }
            case 95: {
                var23_4 /* !! */  = (int)jj.krnc("kscm", krmz(int ), (int)358);
                if (!var24_3) ** GOTO lbl418
                throw null;
            }
lbl582:
            // 2 sources

            case 96: {
                var23_4 /* !! */  = (int)jj.krnc("kscn", krmz(int ), (int)359);
                if (!var24_3) ** GOTO lbl261
                throw null;
            }
            case 97: {
                var23_4 /* !! */  = (int)jj.krnc("ksco", krmz(int ), (int)360);
                if (!var24_3) ** GOTO lbl470
                throw null;
            }
lbl590:
            // 2 sources

            case 98: {
                var23_4 /* !! */  = (int)jj.krnc("kscp", krmz(int ), (int)361);
                if (!var24_3) ** GOTO lbl495
                throw null;
            }
lbl594:
            // 2 sources

            case 99: {
                var23_4 /* !! */  = (int)jj.krnc("kscq", krmz(int ), (int)362);
                if (!var24_3) ** GOTO lbl284
                throw null;
            }
lbl598:
            // 2 sources

            case 100: {
                var23_4 /* !! */  = (int)jj.krnc("kscr", krmz(int ), (int)363);
                if (!var24_3) ** GOTO lbl453
                throw null;
            }
lbl602:
            // 2 sources

            case 101: {
                var23_4 /* !! */  = (int)jj.krnc("kscs", krmz(int ), (int)364);
                if (!var24_3) ** GOTO lbl299
                throw null;
            }
            case 102: 
        }
        var23_4 /* !! */  = (int)jj.krnc("ksct", krmz(int ), (int)365);
        ** while (!var24_3)
lbl609:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long krns(int n2) {
        return krnt[n2] ^ krnu[n2];
    }

    private static /* synthetic */ void ksmo() {
        jj.krnb[200] = 864207192;
        jj.krnb[201] = 1425639647;
        jj.krnb[202] = -1572567281;
        jj.krnb[203] = 1197247907;
        jj.krnb[204] = 1289349418;
        jj.krnb[205] = 1026192902;
        jj.krnb[206] = 1116732102;
        jj.krnb[207] = -2077215488;
        jj.krnb[208] = 743889341;
        jj.krnb[209] = 473142900;
        jj.krnb[210] = -1283653846;
        jj.krnb[211] = -1882060565;
        jj.krnb[212] = -258715748;
        jj.krnb[213] = 2050925918;
        jj.krnb[214] = -53223794;
        jj.krnb[215] = -413313541;
        jj.krnb[216] = -1568696359;
        jj.krnb[217] = -1733989619;
        jj.krnb[218] = -946375872;
        jj.krnb[219] = 1786619238;
        jj.krnb[220] = -199046844;
        jj.krnb[221] = 828428293;
        jj.krnb[222] = -2001558051;
        jj.krnb[223] = -1271071032;
        jj.krnb[224] = -130229031;
        jj.krnb[225] = 1806925417;
        jj.krnb[226] = -317598101;
        jj.krnb[227] = -1338560675;
        jj.krnb[228] = -1495352848;
        jj.krnb[229] = -774852642;
        jj.krnb[230] = -554353999;
        jj.krnb[231] = -1714615533;
        jj.krnb[232] = 163224792;
        jj.krnb[233] = -1717419634;
        jj.krnb[234] = -530673901;
        jj.krnb[235] = 1204208510;
        jj.krnb[236] = 1623150001;
        jj.krnb[237] = 714957170;
        jj.krnb[238] = 1584012541;
        jj.krnb[239] = -1519548347;
        jj.krnb[240] = 476712939;
        jj.krnb[241] = 925459567;
        jj.krnb[242] = 268753883;
        jj.krnb[243] = -782015818;
        jj.krnb[244] = -274438000;
        jj.krnb[245] = -18822370;
        jj.krnb[246] = 1997174875;
        jj.krnb[247] = -1165708328;
        jj.krnb[248] = -1625379132;
        jj.krnb[249] = -1035528546;
        jj.krnb[250] = 1419613147;
        jj.krnb[251] = -2220767;
        jj.krnb[252] = 181293008;
        jj.krnb[253] = 1745268073;
        jj.krnb[254] = -888383100;
        jj.krnb[255] = -889328289;
        jj.krnb[256] = 1688077366;
        jj.krnb[257] = 1545039066;
        jj.krnb[258] = -1515648137;
        jj.krnb[259] = 972355547;
        jj.krnb[260] = -1589394939;
        jj.krnb[261] = 0xFFE4EEE;
        jj.krnb[262] = -343822522;
        jj.krnb[263] = -1530145107;
        jj.krnb[264] = 1029640592;
        jj.krnb[265] = 1704727404;
        jj.krnb[266] = -1459587517;
        jj.krnb[267] = -1057641497;
        jj.krnb[268] = 279343881;
        jj.krnb[269] = -1557600667;
        jj.krnb[270] = 282724559;
        jj.krnb[271] = 1972330155;
        jj.krnb[272] = -326824682;
        jj.krnb[273] = -2118709069;
        jj.krnb[274] = 732024214;
        jj.krnb[275] = 1062278116;
        jj.krnb[276] = -1655337624;
        jj.krnb[277] = -760712729;
        jj.krnb[278] = 1664969653;
        jj.krnb[279] = 1415617665;
        jj.krnb[280] = 1936201546;
        jj.krnb[281] = 1797945386;
        jj.krnb[282] = 454023030;
        jj.krnb[283] = 1540050225;
        jj.krnb[284] = -1167246823;
        jj.krnb[285] = -518174811;
        jj.krnb[286] = -738660383;
        jj.krnb[287] = 90115693;
        jj.krnb[288] = -1594533133;
        jj.krnb[289] = 523990052;
        jj.krnb[290] = 1295573400;
        jj.krnb[291] = 1219881147;
        jj.krnb[292] = -1223653970;
        jj.krnb[293] = 500248821;
        jj.krnb[294] = -1650040092;
        jj.krnb[295] = -1783131857;
        jj.krnb[296] = -77211380;
        jj.krnb[297] = 1490819862;
        jj.krnb[298] = -1610343158;
        jj.krnb[299] = -1559709131;
    }
}

