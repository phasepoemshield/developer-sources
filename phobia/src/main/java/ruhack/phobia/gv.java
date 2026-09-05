/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.pathing.goals.GoalNear
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_1694
 *  net.minecraft.class_1703
 *  net.minecraft.class_1707
 *  net.minecraft.class_1713
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2382
 *  net.minecraft.class_243
 *  net.minecraft.class_3489
 *  net.minecraft.class_3965
 *  net.minecraft.class_7923
 */
package ruhack.phobia;

import baritone.api.BaritoneAPI;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalNear;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1694;
import net.minecraft.class_1703;
import net.minecraft.class_1707;
import net.minecraft.class_1713;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2382;
import net.minecraft.class_243;
import net.minecraft.class_3489;
import net.minecraft.class_3965;
import net.minecraft.class_7923;
import ruhack.phobia.aw;
import ruhack.phobia.bp;
import ruhack.phobia.df;
import ruhack.phobia.dl;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.kb;
import ruhack.phobia.ke;
import ruhack.phobia.kg;
import ruhack.phobia.pr;

public class gv
extends ds {
    private static final double MINECART_SCAN_DISTANCE = 20.0;
    private final kb autoFix;
    private final Map<String, Set<String>> foundLootByMinecart;
    private final pr clickTimer;
    private String currentPathKey;
    private static final int[] CAVE_SEARCH_LEVELS;
    private int caveLevelIndex;
    private String openedMinecartKey;
    private final Set<String> rememberedMinecarts;
    private int exploreDirectionIndex;
    private final pr leaveTimer;
    private final kb autoHeal;
    private class_1694 targetMinecart;
    private double nextMinecartScanDistance;
    private boolean autoEating;
    private final Path keyfinderFile;
    private final kb autoInvest;
    private final kb autoLeave;
    private static final int MAX_SEARCH_Y = 55;
    private static final int BORDER_MARGIN = 64;
    private final pr interactTimer;
    private class_2338 exploreTarget;
    private static final int EXPLORE_REPATH_MS = 3000;
    private final ke loot;
    private class_2338 lastMinecartScanPos;
    private static final int MIN_MINECART_Y = 10;
    private static final int[][] EXPLORE_DIRECTIONS;
    private final kb rememberLooted;
    private boolean depositingToEnderChest;
    private final pr fixTimer;
    private static final int EXPLORE_DISTANCE = 384;
    public static final boolean a;
    private static final int MAX_MINECART_Y = 55;
    public static final int b;
    private static final String LOOT_KEY = "\u041a\u043b\u044e\u0447-\u041a\u0430\u0440\u0442\u044b";
    protected static final long nl = 1344890686903870649L;
    private boolean needsInvest;
    private static final String LOOT_GAPPLE = "\u0427\u0430\u0440\u043a\u0438";
    private static long[] gfde;
    public static final boolean c;
    private final kb dropTrash;
    private final Set<String> sessionLootedMinecarts;
    private final pr pathTimer;
    private static long[] gfdf;
    private final kg leaveRadius;
    private static int[] gfca;
    private static int[] gfcb;

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private /* synthetic */ boolean lambda$markBlockedMinecart$3(String string, String string2) {
        Object object = nl;
        boolean bl2 = true;
        block10: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - gv.gfcc("gofd", gfdd(int ), (int)773);
            }
            switch ((int)object) {
                case -1281505732: {
                    callSite = gv.gfcc("goff", gfdd(int ), (int)774);
                    continue block10;
                }
                case -1066283632: {
                    callSite = gv.gfcc("gofm", gfdd(int ), (int)775);
                    continue block10;
                }
                case 328368847: {
                    callSite = gv.gfcc("gofn", gfdd(int ), (int)776);
                    continue block10;
                }
                case 1185080505: {
                    break block10;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = nl - gv.gfcc("gofp", gfdd(int ), (int)777)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == gv.gfcc("gofq", gfbz(int ), (int)1698)) break;
            object2 = gv.gfcc("gofr", gfbz(int ), (int)1699);
        }
        int n2 = b;
        Object object3 = nl;
        block12: while (true) {
            switch ((int)object3) {
                case -852411306: {
                    object3 = gv.gfcc("gofw", gfdd(int ), (int)779) - gv.gfcc("gofs", gfdd(int ), (int)778);
                    continue block12;
                }
                case 1185080505: {
                    break block12;
                }
            }
            break;
        }
        boolean bl4 = a;
        if (bl3) {
            throw null;
        }
        if (bl4) return (boolean)gv.gfcc("gofy", gfbz(int ), (int)1700);
        if (bl4) return (boolean)gv.gfcc("gofy", gfbz(int ), (int)1700);
        while (true) {
            long l3;
            Object object4;
            if ((object4 = (l3 = nl - gv.gfcc("gofz", gfdd(int ), (int)780)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object4 == gv.gfcc("gogb", gfbz(int ), (int)1701)) {
                return this.isRememberedEntryForKey(string2, string);
            }
            object4 = gv.gfcc("gogd", gfbz(int ), (int)1702);
        }
    }

    private static /* synthetic */ void gqba() {
        gv.gfca[1600] = 889195010;
        gv.gfca[1601] = -1915791606;
        gv.gfca[1602] = 211203350;
        gv.gfca[1603] = -2075296351;
        gv.gfca[1604] = 133276117;
        gv.gfca[1605] = 1614067750;
        gv.gfca[1606] = -1091066968;
        gv.gfca[1607] = 934021668;
        gv.gfca[1608] = -916097053;
        gv.gfca[1609] = 270126135;
        gv.gfca[1610] = -157643617;
        gv.gfca[1611] = 63742348;
        gv.gfca[1612] = -544777063;
        gv.gfca[1613] = 931573004;
        gv.gfca[1614] = -1477263808;
        gv.gfca[1615] = 727209679;
        gv.gfca[1616] = 1145877403;
        gv.gfca[1617] = 100747050;
        gv.gfca[1618] = -177883498;
        gv.gfca[1619] = -1037100901;
        gv.gfca[1620] = 735239709;
        gv.gfca[1621] = 52679123;
        gv.gfca[1622] = 833930891;
        gv.gfca[1623] = 877782536;
        gv.gfca[1624] = -103935891;
        gv.gfca[1625] = 191108298;
        gv.gfca[1626] = 181751266;
        gv.gfca[1627] = 51914158;
        gv.gfca[1628] = -180846102;
        gv.gfca[1629] = 1644540496;
        gv.gfca[1630] = 584251649;
        gv.gfca[1631] = 613304710;
        gv.gfca[1632] = 1958139416;
        gv.gfca[1633] = -1592563035;
        gv.gfca[1634] = 969342126;
        gv.gfca[1635] = 250593593;
        gv.gfca[1636] = -1983956501;
        gv.gfca[1637] = 1241484957;
        gv.gfca[1638] = 339731856;
        gv.gfca[1639] = 1781116375;
        gv.gfca[1640] = -1554382804;
        gv.gfca[1641] = 974257623;
        gv.gfca[1642] = -2068060556;
        gv.gfca[1643] = -1817177274;
        gv.gfca[1644] = -1228216914;
        gv.gfca[1645] = -359091747;
        gv.gfca[1646] = -1203420010;
        gv.gfca[1647] = -1383412221;
        gv.gfca[1648] = 1538945786;
        gv.gfca[1649] = -633617953;
        gv.gfca[1650] = -1155364584;
        gv.gfca[1651] = 533679759;
        gv.gfca[1652] = 488957254;
        gv.gfca[1653] = 337925182;
        gv.gfca[1654] = 2058136226;
        gv.gfca[1655] = 1899107868;
        gv.gfca[1656] = 28354883;
        gv.gfca[1657] = -106218266;
        gv.gfca[1658] = -579966048;
        gv.gfca[1659] = -797588979;
        gv.gfca[1660] = -221629234;
        gv.gfca[1661] = 998111194;
        gv.gfca[1662] = -794977246;
        gv.gfca[1663] = 433828475;
        gv.gfca[1664] = 1566620925;
        gv.gfca[1665] = 1255969251;
        gv.gfca[1666] = -299518037;
        gv.gfca[1667] = -802729337;
        gv.gfca[1668] = 1810961832;
        gv.gfca[1669] = -465029559;
        gv.gfca[1670] = 693339507;
        gv.gfca[1671] = 590665583;
        gv.gfca[1672] = 447806807;
        gv.gfca[1673] = -431926814;
        gv.gfca[1674] = -821583870;
        gv.gfca[1675] = 2094892492;
        gv.gfca[1676] = 722294572;
        gv.gfca[1677] = -1120959829;
        gv.gfca[1678] = 1951401417;
        gv.gfca[1679] = 2088297822;
        gv.gfca[1680] = 1562363697;
        gv.gfca[1681] = 23820425;
        gv.gfca[1682] = -450394924;
        gv.gfca[1683] = 713844201;
        gv.gfca[1684] = -1070979924;
        gv.gfca[1685] = -976732694;
        gv.gfca[1686] = -1678769270;
        gv.gfca[1687] = -2111733722;
        gv.gfca[1688] = -1741411784;
        gv.gfca[1689] = 779738244;
        gv.gfca[1690] = -1831776781;
        gv.gfca[1691] = 1500373683;
        gv.gfca[1692] = 1492768332;
        gv.gfca[1693] = -609094137;
        gv.gfca[1694] = 1383975860;
        gv.gfca[1695] = 1120706352;
        gv.gfca[1696] = 1638481609;
        gv.gfca[1697] = -1404247817;
        gv.gfca[1698] = -1340616063;
        gv.gfca[1699] = 1024750136;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void handleInvestPathing() {
        block129: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = gv.nl - gv.gfcc("ggik", gfdd(int ), (int)196)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == gv.gfcc("ggil", gfbz(int ), (int)638)) break;
                v0 /* !! */  = (long)gv.gfcc("ggim", gfbz(int ), (int)639);
            }
            var4_1 = gv.c;
            v1 /* !! */  = gv.nl;
            if (true) ** GOTO lbl11
            block82: while (true) {
                v1 /* !! */  = (long)(v2 - gv.gfcc("ggin", gfdd(int ), (int)197));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -999063368: {
                        v2 = gv.gfcc("ggio", gfdd(int ), (int)198);
                        continue block82;
                    }
                    case 1113742640: {
                        v2 = gv.gfcc("ggip", gfdd(int ), (int)199);
                        continue block82;
                    }
                    case 1185080505: {
                        break block82;
                    }
                }
                break;
            }
            var3_2 /* !! */  = gv.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = gv.nl - gv.gfcc("ggiq", gfdd(int ), (int)200)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == gv.gfcc("ggir", gfbz(int ), (int)640)) break;
                v3 /* !! */  = (long)gv.gfcc("ggis", gfbz(int ), (int)641);
            }
            var2_3 = gv.a;
            if (var4_1) {
                throw null;
lbl29:
                // 12 sources

                return;
            }
            if (var2_3 || var2_3) ** GOTO lbl29
            v4 = gv.gfcc("ggit", gfbz(int ), (int)642);
            v5 /* !! */  = gv.nl;
            if (true) ** GOTO lbl37
            block85: while (true) {
                v5 /* !! */  = (long)(gv.gfcc("ggiv", gfdd(int ), (int)202) - gv.gfcc("ggiu", gfdd(int ), (int)201));
lbl37:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1218212321: {
                        continue block85;
                    }
                    case 1185080505: {
                        break block85;
                    }
                }
                break;
            }
            var1_4 = this.findNearestEnderChest((int)v4);
            if (var2_3 || var2_3) ** GOTO lbl29
            if (var1_4 != null) break block129;
            if (var2_3 || var2_3) ** GOTO lbl29
            return;
        }
        if (var2_3 || var2_3) ** GOTO lbl29
        v6 /* !! */  = gv.nl;
        if (true) ** GOTO lbl53
        block86: while (true) {
            v6 /* !! */  = (long)(v7 - gv.gfcc("ggiw", gfdd(int ), (int)203));
lbl53:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -647628222: {
                    v7 = gv.gfcc("ggix", gfdd(int ), (int)204);
                    continue block86;
                }
                case 299690664: {
                    v7 = gv.gfcc("ggiy", gfdd(int ), (int)205);
                    continue block86;
                }
                case 1185080505: {
                    break block86;
                }
                case 1890939254: {
                    v7 = gv.gfcc("ggiz", gfdd(int ), (int)206);
                    continue block86;
                }
            }
            break;
        }
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_2 = gv.nl - gv.gfcc("ggja", gfdd(int ), (int)207)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == gv.gfcc("ggjb", gfbz(int ), (int)643)) break;
            v8 /* !! */  = (long)gv.gfcc("ggjc", gfbz(int ), (int)644);
        }
        v9 = gv.mc.field_1724;
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_3 = gv.nl - gv.gfcc("ggjd", gfdd(int ), (int)208)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == gv.gfcc("ggje", gfbz(int ), (int)645)) break;
            v10 /* !! */  = (long)gv.gfcc("ggjf", gfbz(int ), (int)646);
        }
        v11 = class_243.method_24953((class_2382)var1_4);
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_4 = gv.nl - gv.gfcc("ggjg", gfdd(int ), (int)209)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == gv.gfcc("ggjh", gfbz(int ), (int)647)) break;
            v12 /* !! */  = (long)gv.gfcc("ggji", gfbz(int ), (int)648);
        }
        if (!(v9.method_5707(v11) <= gv.gfcc("ggjj", gfjl(int ), (int)210))) ** GOTO lbl222
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3 || var2_3) ** GOTO lbl29
                v13 /* !! */  = gv.nl;
                if (true) ** GOTO lbl91
                block90: while (true) {
                    v13 /* !! */  = (long)(v14 - gv.gfcc("ggjk", gfdd(int ), (int)211));
lbl91:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case 1068006842: {
                            v14 = gv.gfcc("ggjl", gfdd(int ), (int)212);
                            continue block90;
                        }
                        case 1151299419: {
                            v14 = gv.gfcc("ggjm", gfdd(int ), (int)213);
                            continue block90;
                        }
                        case 1185080505: {
                            break block90;
                        }
                    }
                    break;
                }
                v15 = gv.gfcc("ggjn", gfjl(int ), (int)214);
                v16 /* !! */  = gv.nl;
                if (true) ** GOTO lbl105
                block91: while (true) {
                    v16 /* !! */  = (long)(gv.gfcc("ggjp", gfdd(int ), (int)216) - gv.gfcc("ggjo", gfdd(int ), (int)215));
lbl105:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case 1846793: {
                            continue block91;
                        }
                        case 1185080505: {
                            break block91;
                        }
                    }
                    break;
                }
                if (!this.interactTimer.finished((double)v15)) ** GOTO lbl220
                if (var2_3 || var2_3) ** GOTO lbl29
                v17 = gv.gfcc("ggjq", gfbz(int ), (int)649);
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_5 = gv.nl - gv.gfcc("ggjr", gfdd(int ), (int)217)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == gv.gfcc("ggjs", gfbz(int ), (int)650)) break;
                    v18 /* !! */  = (long)gv.gfcc("ggjt", gfbz(int ), (int)651);
                }
                this.depositingToEnderChest = v17;
                if (var2_3 || var2_3) ** GOTO lbl29
                v19 /* !! */  = gv.nl;
                if (true) ** GOTO lbl124
                block93: while (true) {
                    v19 /* !! */  = (long)(gv.gfcc("ggjv", gfdd(int ), (int)219) - gv.gfcc("ggju", gfdd(int ), (int)218));
lbl124:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -232137902: {
                            continue block93;
                        }
                        case 1185080505: {
                            break block93;
                        }
                    }
                    break;
                }
                v20 /* !! */  = gv.nl;
                if (true) ** GOTO lbl133
                block94: while (true) {
                    v20 /* !! */  = (long)(gv.gfcc("ggjx", gfdd(int ), (int)221) - gv.gfcc("ggjw", gfdd(int ), (int)220));
lbl133:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -1311512422: {
                            continue block94;
                        }
                        case 1185080505: {
                            break block94;
                        }
                    }
                    break;
                }
                v21 = gv.mc.field_1761;
                v22 /* !! */  = gv.nl;
                if (true) ** GOTO lbl143
                block95: while (true) {
                    v22 /* !! */  = (long)(v23 - gv.gfcc("ggjy", gfdd(int ), (int)222));
lbl143:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -1196761076: {
                            v23 = gv.gfcc("ggjz", gfdd(int ), (int)223);
                            continue block95;
                        }
                        case -122200812: {
                            v23 = gv.gfcc("ggka", gfdd(int ), (int)224);
                            continue block95;
                        }
                        case -93147485: {
                            v23 = gv.gfcc("ggkb", gfdd(int ), (int)225);
                            continue block95;
                        }
                        case 1185080505: {
                            break block95;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_6 = gv.nl - gv.gfcc("ggkc", gfdd(int ), (int)226)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == gv.gfcc("ggkd", gfbz(int ), (int)652)) break;
                    v24 /* !! */  = (long)gv.gfcc("ggke", gfbz(int ), (int)653);
                }
                v25 = gv.mc.field_1724;
                v26 /* !! */  = gv.nl;
                if (true) ** GOTO lbl165
                block97: while (true) {
                    v26 /* !! */  = (long)(v27 - gv.gfcc("ggkf", gfdd(int ), (int)227));
lbl165:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -2002022375: {
                            v27 = gv.gfcc("ggkg", gfdd(int ), (int)228);
                            continue block97;
                        }
                        case -753123908: {
                            v27 = gv.gfcc("ggkh", gfdd(int ), (int)229);
                            continue block97;
                        }
                        case 1185080505: {
                            break block97;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_7 = gv.nl - gv.gfcc("ggki", gfdd(int ), (int)230)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v28 /* !! */  == gv.gfcc("ggkj", gfbz(int ), (int)654)) break;
                    v28 /* !! */  = (long)gv.gfcc("ggkk", gfbz(int ), (int)655);
                }
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_8 = gv.nl - gv.gfcc("ggkl", gfdd(int ), (int)231)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == gv.gfcc("ggkm", gfbz(int ), (int)656)) break;
                    v29 /* !! */  = (long)gv.gfcc("ggkn", gfbz(int ), (int)657);
                }
                v30 = class_243.method_24953((class_2382)var1_4);
                while (true) {
                    if ((v31 /* !! */  = (cfr_temp_9 = gv.nl - gv.gfcc("ggko", gfdd(int ), (int)232)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v31 /* !! */  == gv.gfcc("ggkp", gfbz(int ), (int)658)) break;
                    v31 /* !! */  = (long)gv.gfcc("ggkq", gfbz(int ), (int)659);
                }
                v32 = gv.gfcc("ggkr", gfbz(int ), (int)660);
                while (true) {
                    if ((v33 /* !! */  = (cfr_temp_10 = gv.nl - gv.gfcc("ggks", gfdd(int ), (int)233)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v33 /* !! */  == gv.gfcc("ggkt", gfbz(int ), (int)661)) break;
                    v33 /* !! */  = (long)gv.gfcc("ggku", gfbz(int ), (int)662);
                }
                v34 = new class_3965(v30, class_2350.field_11036, var1_4, (boolean)v32);
                while (true) {
                    if ((v35 /* !! */  = (cfr_temp_11 = gv.nl - gv.gfcc("ggkv", gfdd(int ), (int)234)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v35 /* !! */  == gv.gfcc("ggkw", gfbz(int ), (int)663)) break;
                    v35 /* !! */  = (long)gv.gfcc("ggkx", gfbz(int ), (int)664);
                }
                v21.method_2896(v25, class_1268.field_5808, v34);
                if (var2_3 || var2_3) ** GOTO lbl29
                while (true) {
                    if ((v36 /* !! */  = (cfr_temp_12 = gv.nl - gv.gfcc("ggky", gfdd(int ), (int)235)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v36 /* !! */  == gv.gfcc("ggkz", gfbz(int ), (int)665)) break;
                    v36 /* !! */  = (long)gv.gfcc("ggla", gfbz(int ), (int)666);
                }
                v37 /* !! */  = gv.nl;
                if (true) ** GOTO lbl213
                block104: while (true) {
                    v37 /* !! */  = (long)(gv.gfcc("gglc", gfdd(int ), (int)237) - gv.gfcc("gglb", gfdd(int ), (int)236));
lbl213:
                    // 2 sources

                    switch ((int)v37 /* !! */ ) {
                        case 378793853: {
                            continue block104;
                        }
                        case 1185080505: {
                            break block104;
                        }
                    }
                    break;
                }
                this.interactTimer.reset();
                if (var2_3) ** GOTO lbl29
lbl220:
                // 2 sources

                if (var2_3 || var2_3) ** GOTO lbl29
                return;
            }
lbl222:
            // 1 sources

            if (var2_3 || var2_3) ** GOTO lbl29
            v38 = gv.gfcc("ggld", gfbz(int ), (int)667);
            v39 /* !! */  = gv.nl;
            if (true) ** GOTO lbl228
            block105: while (true) {
                v39 /* !! */  = (long)(v40 - gv.gfcc("ggle", gfdd(int ), (int)238));
lbl228:
                // 2 sources

                switch ((int)v39 /* !! */ ) {
                    case -1904654935: {
                        v40 = gv.gfcc("gglf", gfdd(int ), (int)239);
                        continue block105;
                    }
                    case -1066404007: {
                        v40 = gv.gfcc("gglg", gfdd(int ), (int)240);
                        continue block105;
                    }
                    case 111027939: {
                        v40 = gv.gfcc("gglh", gfdd(int ), (int)241);
                        continue block105;
                    }
                    case 1185080505: {
                        break block105;
                    }
                }
                break;
            }
            this.pathTo(var1_4, (int)v38);
            if (!var2_3 && !var2_3) ** break;
            ** continue;
            return;
            case 0: {
                var3_2 /* !! */  = (int)gv.gfcc("ggli", gfbz(int ), (int)668);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl254
            }
            case 1: {
                var3_2 /* !! */  = (int)gv.gfcc("gglj", gfbz(int ), (int)669);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl311
            }
lbl254:
            // 2 sources

            case 2: {
                var3_2 /* !! */  = (int)gv.gfcc("gglk", gfbz(int ), (int)670);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl269
            }
            case 3: {
                var3_2 /* !! */  = (int)gv.gfcc("ggll", gfbz(int ), (int)671);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl298
            }
lbl264:
            // 3 sources

            case 4: {
                var3_2 /* !! */  = (int)gv.gfcc("gglm", gfbz(int ), (int)672);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl350
            }
lbl269:
            // 5 sources

            case 5: {
                var3_2 /* !! */  = (int)gv.gfcc("ggln", gfbz(int ), (int)673);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl350
            }
            case 6: {
                var3_2 /* !! */  = (int)gv.gfcc("gglo", gfbz(int ), (int)674);
                if (var4_1) {
                    throw null;
                }
            }
lbl278:
            // 4 sources

            case 7: {
                var3_2 /* !! */  = (int)gv.gfcc("gglp", gfbz(int ), (int)675);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl327
            }
            case 8: {
                var3_2 /* !! */  = (int)gv.gfcc("gglq", gfbz(int ), (int)676);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl342
            }
            case 9: {
                var3_2 /* !! */  = (int)gv.gfcc("gglr", gfbz(int ), (int)677);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl354
            }
            case 10: {
                var3_2 /* !! */  = (int)gv.gfcc("ggls", gfbz(int ), (int)678);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl354
            }
lbl298:
            // 3 sources

            case 11: {
                do {
                    var3_2 /* !! */  = (int)gv.gfcc("gglt", gfbz(int ), (int)679);
                } while (!var4_1);
                throw null;
            }
            case 12: {
                var3_2 /* !! */  = (int)gv.gfcc("gglu", gfbz(int ), (int)680);
                if (!var4_1) ** GOTO lbl298
                throw null;
            }
lbl307:
            // 2 sources

            case 13: {
                var3_2 /* !! */  = (int)gv.gfcc("gglv", gfbz(int ), (int)681);
                if (!var4_1) ** GOTO lbl278
                throw null;
            }
lbl311:
            // 2 sources

            case 14: {
                var3_2 /* !! */  = (int)gv.gfcc("gglw", gfbz(int ), (int)682);
                if (!var4_1) ** GOTO lbl269
                throw null;
            }
            case 15: {
                var3_2 /* !! */  = (int)gv.gfcc("ggzd", gfbz(int ), (int)683);
                if (!var4_1) ** GOTO lbl264
                throw null;
            }
            case 16: {
                var3_2 /* !! */  = (int)gv.gfcc("ggzf", gfbz(int ), (int)684);
                if (var4_1) {
                    throw null;
                }
            }
            case 17: {
                var3_2 /* !! */  = (int)gv.gfcc("ggzg", gfbz(int ), (int)685);
                if (!var4_1) ** GOTO lbl269
                throw null;
            }
lbl327:
            // 2 sources

            case 18: {
                var3_2 /* !! */  = (int)gv.gfcc("ggzh", gfbz(int ), (int)686);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl350
            }
lbl332:
            // 2 sources

            case 19: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)gv.gfcc("ggzk", gfbz(int ), (int)687);
                    if (!var4_1) ** GOTO lbl264
                    throw null;
                }
            }
            case 20: {
                var3_2 /* !! */  = (int)gv.gfcc("ggzo", gfbz(int ), (int)688);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl350
            }
lbl342:
            // 2 sources

            case 21: {
                var3_2 /* !! */  = (int)gv.gfcc("ggzr", gfbz(int ), (int)689);
                if (!var4_1) ** GOTO lbl332
                throw null;
            }
            case 22: {
                var3_2 /* !! */  = (int)gv.gfcc("ggzs", gfbz(int ), (int)690);
                if (!var4_1) ** GOTO lbl307
                throw null;
            }
lbl350:
            // 5 sources

            case 23: {
                var3_2 /* !! */  = (int)gv.gfcc("ggzu", gfbz(int ), (int)691);
                if (!var4_1) break;
                throw null;
            }
lbl354:
            // 3 sources

            case 24: {
                var3_2 /* !! */  = (int)gv.gfcc("ggzx", gfbz(int ), (int)692);
                if (!var4_1) ** GOTO lbl269
                throw null;
            }
            case 25: 
        }
        var3_2 /* !! */  = (int)gv.gfcc("ghab", gfbz(int ), (int)693);
        ** while (!var4_1)
lbl361:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int gfbz(int n2) {
        return gfca[n2] ^ gfcb[n2];
    }

    private static /* synthetic */ float gfce(int n2) {
        return Float.intBitsToFloat(gfca[n2] ^ gfcb[n2]);
    }

    private static /* synthetic */ void gpwa() {
        gv.gfca[400] = -312258287;
        gv.gfca[401] = 770816870;
        gv.gfca[402] = -2034179635;
        gv.gfca[403] = 796451619;
        gv.gfca[404] = 868539026;
        gv.gfca[405] = -1926839494;
        gv.gfca[406] = -1517642625;
        gv.gfca[407] = -161104576;
        gv.gfca[408] = -394556934;
        gv.gfca[409] = 1044676159;
        gv.gfca[410] = -1838076728;
        gv.gfca[411] = 1168475499;
        gv.gfca[412] = 180998603;
        gv.gfca[413] = -596231488;
        gv.gfca[414] = 1876579936;
        gv.gfca[415] = -1624279575;
        gv.gfca[416] = 1456465563;
        gv.gfca[417] = 1776424682;
        gv.gfca[418] = 1682863565;
        gv.gfca[419] = -674877641;
        gv.gfca[420] = 2098847778;
        gv.gfca[421] = 1706229391;
        gv.gfca[422] = -77955775;
        gv.gfca[423] = -1336179934;
        gv.gfca[424] = -1749983137;
        gv.gfca[425] = 315457778;
        gv.gfca[426] = 300087666;
        gv.gfca[427] = 1714401352;
        gv.gfca[428] = 747775980;
        gv.gfca[429] = -894510331;
        gv.gfca[430] = 1416104217;
        gv.gfca[431] = -1006688839;
        gv.gfca[432] = 982655059;
        gv.gfca[433] = 1679515830;
        gv.gfca[434] = -2003245721;
        gv.gfca[435] = 835127226;
        gv.gfca[436] = -1212493861;
        gv.gfca[437] = -1754028180;
        gv.gfca[438] = -402337501;
        gv.gfca[439] = 988528541;
        gv.gfca[440] = -1833943987;
        gv.gfca[441] = 1033633560;
        gv.gfca[442] = -642674127;
        gv.gfca[443] = -1454315530;
        gv.gfca[444] = 1873019927;
        gv.gfca[445] = 193439537;
        gv.gfca[446] = -1438787723;
        gv.gfca[447] = -585946595;
        gv.gfca[448] = -1678004997;
        gv.gfca[449] = -140740366;
        gv.gfca[450] = -877120403;
        gv.gfca[451] = 2055856444;
        gv.gfca[452] = -1866633165;
        gv.gfca[453] = -935659329;
        gv.gfca[454] = -38170839;
        gv.gfca[455] = 473929026;
        gv.gfca[456] = -1287190423;
        gv.gfca[457] = 1593966956;
        gv.gfca[458] = -35902463;
        gv.gfca[459] = -101865880;
        gv.gfca[460] = 2047230272;
        gv.gfca[461] = -1708883868;
        gv.gfca[462] = -426330629;
        gv.gfca[463] = -1988578028;
        gv.gfca[464] = 1478709463;
        gv.gfca[465] = 122641366;
        gv.gfca[466] = 522707873;
        gv.gfca[467] = -124797065;
        gv.gfca[468] = 2090764146;
        gv.gfca[469] = 1972355219;
        gv.gfca[470] = 813012348;
        gv.gfca[471] = 2041585541;
        gv.gfca[472] = -1004764312;
        gv.gfca[473] = 1822824329;
        gv.gfca[474] = -1664088451;
        gv.gfca[475] = 91311193;
        gv.gfca[476] = -880725070;
        gv.gfca[477] = 1240073779;
        gv.gfca[478] = 1559357540;
        gv.gfca[479] = -1119102371;
        gv.gfca[480] = 660998234;
        gv.gfca[481] = -568060701;
        gv.gfca[482] = 1813353138;
        gv.gfca[483] = 1721889725;
        gv.gfca[484] = 1346706254;
        gv.gfca[485] = -1247717405;
        gv.gfca[486] = -200015479;
        gv.gfca[487] = 1679907118;
        gv.gfca[488] = 780598941;
        gv.gfca[489] = -933151202;
        gv.gfca[490] = 987517396;
        gv.gfca[491] = 741333231;
        gv.gfca[492] = -588285361;
        gv.gfca[493] = 1221418224;
        gv.gfca[494] = 474770329;
        gv.gfca[495] = -1224016057;
        gv.gfca[496] = 266228032;
        gv.gfca[497] = 1889151665;
        gv.gfca[498] = -1319317598;
        gv.gfca[499] = -159631016;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void handleMinecartLoot(class_1707 var1_1) {
        block117: {
            var8_2 = gv.c;
            var7_3 /* !! */  = gv.b;
            var6_4 = gv.a;
            if (var8_2) {
                throw null;
lbl6:
                // 32 sources

                return;
            }
            if (var6_4 || var6_4) ** GOTO lbl6
            if (this.clickTimer.finished((double)gv.gfcc("ggfw", gfjl(int ), (int)195))) break block117;
            if (var6_4 || var6_4) ** GOTO lbl6
            return;
        }
        if (var6_4 || var6_4) ** GOTO lbl6
        var2_5 = var1_1.method_17388() * gv.gfcc("ggfx", gfbz(int ), (int)573);
        if (var6_4 || var6_4) ** GOTO lbl6
        var3_6 = this.countWantedLootSlots((class_1703)var1_1, var2_5);
        if (var6_4) ** GOTO lbl6
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_4) ** GOTO lbl6
                if (var3_6 <= 0) ** GOTO lbl35
                if (var6_4) ** GOTO lbl6
                if (!this.dropTrash.isValue()) ** GOTO lbl35
                if (var6_4 || var6_4) ** GOTO lbl6
                var4_7 = (reference)(var3_6 - this.countEmptyInventorySlots());
                if (var6_4 || var6_4) ** GOTO lbl6
                if (var4_7 <= 0) ** GOTO lbl35
                if (var6_4) ** GOTO lbl6
                if (!this.dropCobblestoneStacks((class_1703)var1_1, var2_5, (int)var4_7)) ** GOTO lbl35
                if (var6_4 || var6_4) ** GOTO lbl6
                this.clickTimer.reset();
                if (var6_4 || var6_4) ** GOTO lbl6
                return;
lbl35:
                // 4 sources

                if (var6_4 || var6_4) ** GOTO lbl6
                var4_7 = gv.gfcc("ggfy", gfbz(int ), (int)574);
                if (var6_4) ** GOTO lbl6
                do {
                    if (var6_4 || var6_4) ** GOTO lbl6
                    if (var4_7 >= var2_5) ** GOTO lbl62
                    if (var6_4 || var6_4) ** GOTO lbl6
                    var5_8 = var1_1.method_7611((int)var4_7);
                    if (var6_4 || var6_4) ** GOTO lbl6
                    if (!var5_8.method_7681()) ** GOTO lbl57
                    if (var6_4) ** GOTO lbl6
                    if (!this.isWantedLoot(var5_8.method_7677())) ** GOTO lbl57
                    if (var6_4 || var6_4) ** GOTO lbl6
                    this.rememberFoundLoot(this.openedMinecartKey, var5_8.method_7677());
                    if (var6_4 || var6_4) ** GOTO lbl6
                    gv.mc.field_1761.method_2906(var1_1.field_7763, var5_8.field_7874, (int)gv.gfcc("ggfz", gfbz(int ), (int)575), class_1713.field_7794, (class_1657)gv.mc.field_1724);
                    if (var6_4 || var6_4) ** GOTO lbl6
                    this.needsInvest = gv.gfcc("ggga", gfbz(int ), (int)576);
                    if (var6_4 || var6_4) ** GOTO lbl6
                    this.clickTimer.reset();
                    if (var6_4 || var6_4) ** GOTO lbl6
                    return;
lbl57:
                    // 2 sources

                    if (var6_4 || var6_4) ** GOTO lbl6
                    ++var4_7;
                    if (var6_4) ** GOTO lbl6
                } while (!var8_2);
                throw null;
lbl62:
                // 1 sources

                if (var6_4 || var6_4) ** GOTO lbl6
                this.markMinecartLooted(this.openedMinecartKey);
                if (var6_4 || var6_4) ** GOTO lbl6
                gv.mc.field_1724.method_7346();
                if (var6_4 || var6_4) ** GOTO lbl6
                this.openedMinecartKey = null;
                if (var6_4 || var6_4) ** GOTO lbl6
                this.targetMinecart = null;
                if (var6_4 || var6_4) ** GOTO lbl6
                this.currentPathKey = null;
                if (var6_4 || var6_4) ** GOTO lbl6
                this.clickTimer.reset();
                if (!var6_4 && !var6_4) ** break;
                ** continue;
                return;
            }
lbl77:
            // 3 sources

            case 0: {
                var7_3 /* !! */  = (int)gv.gfcc("gggb", gfbz(int ), (int)577);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl82:
            // 3 sources

            case 1: {
                var7_3 /* !! */  = (int)gv.gfcc("gggc", gfbz(int ), (int)578);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl120
            }
            case 2: {
                var7_3 /* !! */  = (int)gv.gfcc("gggd", gfbz(int ), (int)579);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl343
            }
            case 3: {
                var7_3 /* !! */  = (int)gv.gfcc("ggge", gfbz(int ), (int)580);
                if (!var8_2) ** GOTO lbl77
                throw null;
            }
lbl96:
            // 3 sources

            case 4: {
                var7_3 /* !! */  = (int)gv.gfcc("gggf", gfbz(int ), (int)581);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl323
            }
            case 5: {
                var7_3 /* !! */  = (int)gv.gfcc("gggg", gfbz(int ), (int)582);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl186
            }
lbl106:
            // 2 sources

            case 6: {
                var7_3 /* !! */  = (int)gv.gfcc("gggh", gfbz(int ), (int)583);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl196
            }
lbl111:
            // 3 sources

            case 7: {
                var7_3 /* !! */  = (int)gv.gfcc("gggi", gfbz(int ), (int)584);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl234
            }
lbl116:
            // 3 sources

            case 8: {
                var7_3 /* !! */  = (int)gv.gfcc("gggj", gfbz(int ), (int)585);
                if (!var8_2) ** GOTO lbl111
                throw null;
            }
lbl120:
            // 2 sources

            case 9: {
                var7_3 /* !! */  = (int)gv.gfcc("gggk", gfbz(int ), (int)586);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl335
            }
lbl125:
            // 2 sources

            case 10: {
                var7_3 /* !! */  = (int)gv.gfcc("gggl", gfbz(int ), (int)587);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl339
            }
lbl130:
            // 2 sources

            case 11: {
                var7_3 /* !! */  = (int)gv.gfcc("gggm", gfbz(int ), (int)588);
                if (!var8_2) break;
                throw null;
            }
            case 12: {
                var7_3 /* !! */  = (int)gv.gfcc("gggn", gfbz(int ), (int)589);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl335
            }
            case 13: {
                var7_3 /* !! */  = (int)gv.gfcc("gggo", gfbz(int ), (int)590);
                if (!var8_2) ** GOTO lbl96
                throw null;
            }
            case 14: {
                var7_3 /* !! */  = (int)gv.gfcc("gggp", gfbz(int ), (int)591);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl314
            }
            case 15: {
                var7_3 /* !! */  = (int)gv.gfcc("gggq", gfbz(int ), (int)592);
                if (!var8_2) ** GOTO lbl82
                throw null;
            }
lbl152:
            // 2 sources

            case 16: {
                var7_3 /* !! */  = (int)gv.gfcc("gggr", gfbz(int ), (int)593);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl175
            }
lbl157:
            // 2 sources

            case 17: {
                var7_3 /* !! */  = (int)gv.gfcc("gggs", gfbz(int ), (int)594);
                if (!var8_2) ** GOTO lbl106
                throw null;
            }
lbl161:
            // 2 sources

            case 18: {
                var7_3 /* !! */  = (int)gv.gfcc("gggt", gfbz(int ), (int)595);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl229
            }
            case 19: {
                var7_3 /* !! */  = (int)gv.gfcc("gggu", gfbz(int ), (int)596);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl327
            }
lbl171:
            // 3 sources

            case 20: {
                var7_3 /* !! */  = (int)gv.gfcc("gggv", gfbz(int ), (int)597);
                if (!var8_2) ** GOTO lbl82
                throw null;
            }
lbl175:
            // 2 sources

            case 21: {
                var7_3 /* !! */  = (int)gv.gfcc("gggw", gfbz(int ), (int)598);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl323
            }
lbl180:
            // 2 sources

            case 22: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_3 /* !! */  = (int)gv.gfcc("gggx", gfbz(int ), (int)599);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl196
                    break;
                }
            }
lbl186:
            // 3 sources

            case 23: {
                var7_3 /* !! */  = (int)gv.gfcc("gggy", gfbz(int ), (int)600);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl306
            }
            case 24: {
                var7_3 /* !! */  = (int)gv.gfcc("gggz", gfbz(int ), (int)601);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl306
            }
lbl196:
            // 5 sources

            case 25: {
                var7_3 /* !! */  = (int)gv.gfcc("ggha", gfbz(int ), (int)602);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl343
            }
lbl201:
            // 2 sources

            case 26: {
                var7_3 /* !! */  = (int)gv.gfcc("gghb", gfbz(int ), (int)603);
                if (!var8_2) ** GOTO lbl161
                throw null;
            }
            case 27: {
                var7_3 /* !! */  = (int)gv.gfcc("gghc", gfbz(int ), (int)604);
                if (!var8_2) ** GOTO lbl152
                throw null;
            }
            case 28: {
                var7_3 /* !! */  = (int)gv.gfcc("gghd", gfbz(int ), (int)605);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl302
            }
            case 29: {
                var7_3 /* !! */  = (int)gv.gfcc("gghe", gfbz(int ), (int)606);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl246
            }
lbl219:
            // 2 sources

            case 30: {
                var7_3 /* !! */  = (int)gv.gfcc("gghf", gfbz(int ), (int)607);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl298
            }
            case 31: {
                var7_3 /* !! */  = (int)gv.gfcc("gghg", gfbz(int ), (int)608);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl256
            }
lbl229:
            // 3 sources

            case 32: {
                var7_3 /* !! */  = (int)gv.gfcc("gghh", gfbz(int ), (int)609);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl327
            }
lbl234:
            // 3 sources

            case 33: {
                var7_3 /* !! */  = (int)gv.gfcc("gghi", gfbz(int ), (int)610);
                if (!var8_2) ** GOTO lbl130
                throw null;
            }
            case 34: {
                var7_3 /* !! */  = (int)gv.gfcc("gghj", gfbz(int ), (int)611);
                if (!var8_2) ** GOTO lbl186
                throw null;
            }
lbl242:
            // 2 sources

            case 35: {
                var7_3 /* !! */  = (int)gv.gfcc("gghk", gfbz(int ), (int)612);
                if (!var8_2) ** GOTO lbl157
                throw null;
            }
lbl246:
            // 3 sources

            case 36: {
                var7_3 /* !! */  = (int)gv.gfcc("gghl", gfbz(int ), (int)613);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl281
            }
            case 37: {
                var7_3 /* !! */  = (int)gv.gfcc("gghm", gfbz(int ), (int)614);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl343
            }
lbl256:
            // 2 sources

            case 38: {
                var7_3 /* !! */  = (int)gv.gfcc("gghn", gfbz(int ), (int)615);
                if (!var8_2) ** GOTO lbl246
                throw null;
            }
            case 39: {
                var7_3 /* !! */  = (int)gv.gfcc("ggho", gfbz(int ), (int)616);
                if (!var8_2) ** GOTO lbl196
                throw null;
            }
            case 40: {
                var7_3 /* !! */  = (int)gv.gfcc("gghp", gfbz(int ), (int)617);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl335
            }
            case 41: {
                var7_3 /* !! */  = (int)gv.gfcc("gghq", gfbz(int ), (int)618);
                if (!var8_2) ** GOTO lbl219
                throw null;
            }
            case 42: {
                var7_3 /* !! */  = (int)gv.gfcc("gghr", gfbz(int ), (int)619);
                if (!var8_2) ** GOTO lbl125
                throw null;
            }
lbl277:
            // 2 sources

            case 43: {
                var7_3 /* !! */  = (int)gv.gfcc("gghs", gfbz(int ), (int)620);
                if (!var8_2) break;
                throw null;
            }
lbl281:
            // 2 sources

            case 44: {
                var7_3 /* !! */  = (int)gv.gfcc("gght", gfbz(int ), (int)621);
                if (!var8_2) ** GOTO lbl229
                throw null;
            }
            case 45: {
                var7_3 /* !! */  = (int)gv.gfcc("gghu", gfbz(int ), (int)622);
                if (!var8_2) ** GOTO lbl277
                throw null;
            }
            case 46: {
                var7_3 /* !! */  = (int)gv.gfcc("gghv", gfbz(int ), (int)623);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl306
            }
            case 47: {
                var7_3 /* !! */  = (int)gv.gfcc("gghw", gfbz(int ), (int)624);
                if (!var8_2) ** GOTO lbl116
                throw null;
            }
lbl298:
            // 2 sources

            case 48: {
                var7_3 /* !! */  = (int)gv.gfcc("gghx", gfbz(int ), (int)625);
                if (!var8_2) ** GOTO lbl171
                throw null;
            }
lbl302:
            // 2 sources

            case 49: {
                var7_3 /* !! */  = (int)gv.gfcc("gghy", gfbz(int ), (int)626);
                if (!var8_2) ** GOTO lbl111
                throw null;
            }
lbl306:
            // 4 sources

            case 50: {
                var7_3 /* !! */  = (int)gv.gfcc("gghz", gfbz(int ), (int)627);
                if (!var8_2) break;
                throw null;
            }
            case 51: {
                var7_3 /* !! */  = (int)gv.gfcc("ggia", gfbz(int ), (int)628);
                if (!var8_2) ** GOTO lbl171
                throw null;
            }
lbl314:
            // 2 sources

            case 52: {
                var7_3 /* !! */  = (int)gv.gfcc("ggib", gfbz(int ), (int)629);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl339
            }
            case 53: {
                var7_3 /* !! */  = (int)gv.gfcc("ggic", gfbz(int ), (int)630);
                if (!var8_2) ** GOTO lbl196
                throw null;
            }
lbl323:
            // 3 sources

            case 54: {
                var7_3 /* !! */  = (int)gv.gfcc("ggid", gfbz(int ), (int)631);
                if (!var8_2) ** GOTO lbl242
                throw null;
            }
lbl327:
            // 3 sources

            case 55: {
                var7_3 /* !! */  = (int)gv.gfcc("ggie", gfbz(int ), (int)632);
                if (!var8_2) ** GOTO lbl234
                throw null;
            }
            case 56: {
                var7_3 /* !! */  = (int)gv.gfcc("ggif", gfbz(int ), (int)633);
                if (!var8_2) ** GOTO lbl77
                throw null;
            }
lbl335:
            // 4 sources

            case 57: {
                var7_3 /* !! */  = (int)gv.gfcc("ggig", gfbz(int ), (int)634);
                if (!var8_2) ** GOTO lbl96
                throw null;
            }
lbl339:
            // 3 sources

            case 58: {
                var7_3 /* !! */  = (int)gv.gfcc("ggih", gfbz(int ), (int)635);
                if (!var8_2) ** GOTO lbl116
                throw null;
            }
lbl343:
            // 4 sources

            case 59: {
                var7_3 /* !! */  = (int)gv.gfcc("ggii", gfbz(int ), (int)636);
                if (!var8_2) ** GOTO lbl180
                throw null;
            }
            case 60: 
        }
        var7_3 /* !! */  = (int)gv.gfcc("ggij", gfbz(int ), (int)637);
        ** while (!var8_2)
lbl350:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gqeg() {
        gv.gfcb[500] = -98854555;
        gv.gfcb[501] = -744478394;
        gv.gfcb[502] = 1830007419;
        gv.gfcb[503] = -616905403;
        gv.gfcb[504] = -1465825411;
        gv.gfcb[505] = 1876014616;
        gv.gfcb[506] = 202620380;
        gv.gfcb[507] = 241805508;
        gv.gfcb[508] = -601704662;
        gv.gfcb[509] = -681932921;
        gv.gfcb[510] = 1231390976;
        gv.gfcb[511] = 52913587;
        gv.gfcb[512] = 1170898649;
        gv.gfcb[513] = -1429349051;
        gv.gfcb[514] = -1797211819;
        gv.gfcb[515] = 1186169757;
        gv.gfcb[516] = -264801514;
        gv.gfcb[517] = -2014085914;
        gv.gfcb[518] = -1620448645;
        gv.gfcb[519] = 1441923538;
        gv.gfcb[520] = 318200470;
        gv.gfcb[521] = -284783649;
        gv.gfcb[522] = -1588921044;
        gv.gfcb[523] = -632010639;
        gv.gfcb[524] = 1424684159;
        gv.gfcb[525] = -1611783931;
        gv.gfcb[526] = -406348201;
        gv.gfcb[527] = -30895339;
        gv.gfcb[528] = -1533433620;
        gv.gfcb[529] = -838102448;
        gv.gfcb[530] = -1898011705;
        gv.gfcb[531] = -920121671;
        gv.gfcb[532] = 1417364750;
        gv.gfcb[533] = 1354059240;
        gv.gfcb[534] = 391815200;
        gv.gfcb[535] = 407043374;
        gv.gfcb[536] = -996551751;
        gv.gfcb[537] = 1367608230;
        gv.gfcb[538] = 2069612029;
        gv.gfcb[539] = 1609746043;
        gv.gfcb[540] = -76173550;
        gv.gfcb[541] = -653840662;
        gv.gfcb[542] = 779749175;
        gv.gfcb[543] = 763912396;
        gv.gfcb[544] = -1833108618;
        gv.gfcb[545] = 1937568171;
        gv.gfcb[546] = -984390554;
        gv.gfcb[547] = 535085994;
        gv.gfcb[548] = -1589285735;
        gv.gfcb[549] = 746171598;
        gv.gfcb[550] = -332320601;
        gv.gfcb[551] = -680994196;
        gv.gfcb[552] = -1829062414;
        gv.gfcb[553] = -750071365;
        gv.gfcb[554] = -573092449;
        gv.gfcb[555] = -2016564756;
        gv.gfcb[556] = 1303797590;
        gv.gfcb[557] = -241735378;
        gv.gfcb[558] = 1530700736;
        gv.gfcb[559] = 74227070;
        gv.gfcb[560] = -367287581;
        gv.gfcb[561] = 327756618;
        gv.gfcb[562] = -618898742;
        gv.gfcb[563] = 193670942;
        gv.gfcb[564] = -472063713;
        gv.gfcb[565] = 1105626355;
        gv.gfcb[566] = -1455188331;
        gv.gfcb[567] = 1857838824;
        gv.gfcb[568] = -1820481952;
        gv.gfcb[569] = -1137238436;
        gv.gfcb[570] = 1635236876;
        gv.gfcb[571] = 1620946380;
        gv.gfcb[572] = 1190601837;
        gv.gfcb[573] = -2107863167;
        gv.gfcb[574] = -1931808923;
        gv.gfcb[575] = -380933621;
        gv.gfcb[576] = -1928768242;
        gv.gfcb[577] = 1355581369;
        gv.gfcb[578] = -1997921057;
        gv.gfcb[579] = -1414680061;
        gv.gfcb[580] = 19253394;
        gv.gfcb[581] = -928684393;
        gv.gfcb[582] = 534077778;
        gv.gfcb[583] = -10896635;
        gv.gfcb[584] = -1096472195;
        gv.gfcb[585] = -1224452003;
        gv.gfcb[586] = -1002690633;
        gv.gfcb[587] = -1856709560;
        gv.gfcb[588] = 1956603445;
        gv.gfcb[589] = 1438760042;
        gv.gfcb[590] = -414670996;
        gv.gfcb[591] = 2032355852;
        gv.gfcb[592] = 785242507;
        gv.gfcb[593] = -438765726;
        gv.gfcb[594] = -575746981;
        gv.gfcb[595] = -15510293;
        gv.gfcb[596] = -1746224760;
        gv.gfcb[597] = -1002523474;
        gv.gfcb[598] = 748987739;
        gv.gfcb[599] = -1574122892;
    }

    private static /* synthetic */ void gptk() {
        gv.gfca[0] = -1678758697;
        gv.gfca[1] = 138923933;
        gv.gfca[2] = 1809030491;
        gv.gfca[3] = -229164006;
        gv.gfca[4] = -1836682548;
        gv.gfca[5] = 1108983393;
        gv.gfca[6] = 1165245053;
        gv.gfca[7] = 807664368;
        gv.gfca[8] = -1892439621;
        gv.gfca[9] = -1663559845;
        gv.gfca[10] = -887676132;
        gv.gfca[11] = -953553371;
        gv.gfca[12] = 956638897;
        gv.gfca[13] = 516346273;
        gv.gfca[14] = 325003864;
        gv.gfca[15] = -183522370;
        gv.gfca[16] = -113683342;
        gv.gfca[17] = 786031209;
        gv.gfca[18] = 1241788998;
        gv.gfca[19] = 726177668;
        gv.gfca[20] = -820166107;
        gv.gfca[21] = 940304053;
        gv.gfca[22] = 1723936123;
        gv.gfca[23] = 1045334437;
        gv.gfca[24] = -1455533708;
        gv.gfca[25] = 2054732681;
        gv.gfca[26] = -725784805;
        gv.gfca[27] = -704584133;
        gv.gfca[28] = 1576578311;
        gv.gfca[29] = 596360172;
        gv.gfca[30] = 1603562350;
        gv.gfca[31] = 146223506;
        gv.gfca[32] = -1138075373;
        gv.gfca[33] = -742370704;
        gv.gfca[34] = -1089947969;
        gv.gfca[35] = 20339742;
        gv.gfca[36] = -1953089939;
        gv.gfca[37] = 234574654;
        gv.gfca[38] = -1634939105;
        gv.gfca[39] = -1872449845;
        gv.gfca[40] = 1649827566;
        gv.gfca[41] = -1621744691;
        gv.gfca[42] = 939230036;
        gv.gfca[43] = 1459389612;
        gv.gfca[44] = 782219412;
        gv.gfca[45] = 717797949;
        gv.gfca[46] = 1547268226;
        gv.gfca[47] = 481129539;
        gv.gfca[48] = 1774643028;
        gv.gfca[49] = -39862803;
        gv.gfca[50] = -315380629;
        gv.gfca[51] = 1190292553;
        gv.gfca[52] = -68885939;
        gv.gfca[53] = -1119122320;
        gv.gfca[54] = -861064781;
        gv.gfca[55] = -1304581145;
        gv.gfca[56] = -1484817475;
        gv.gfca[57] = 1403513856;
        gv.gfca[58] = -1954190754;
        gv.gfca[59] = 854404272;
        gv.gfca[60] = 734504310;
        gv.gfca[61] = 1462296523;
        gv.gfca[62] = -222777082;
        gv.gfca[63] = -236300870;
        gv.gfca[64] = 1035403963;
        gv.gfca[65] = 682553644;
        gv.gfca[66] = -1233836173;
        gv.gfca[67] = 731152996;
        gv.gfca[68] = -1127256048;
        gv.gfca[69] = 578772459;
        gv.gfca[70] = 203392865;
        gv.gfca[71] = 1759798882;
        gv.gfca[72] = 683684867;
        gv.gfca[73] = 422807630;
        gv.gfca[74] = 410083808;
        gv.gfca[75] = -1217338290;
        gv.gfca[76] = 264758699;
        gv.gfca[77] = -1383311535;
        gv.gfca[78] = -634293829;
        gv.gfca[79] = -1368184983;
        gv.gfca[80] = 1962824163;
        gv.gfca[81] = -1548910484;
        gv.gfca[82] = 1793909227;
        gv.gfca[83] = 1920014396;
        gv.gfca[84] = -559816836;
        gv.gfca[85] = -1542460701;
        gv.gfca[86] = 1679995223;
        gv.gfca[87] = 1947368832;
        gv.gfca[88] = -1539819496;
        gv.gfca[89] = 1673110762;
        gv.gfca[90] = 1254134219;
        gv.gfca[91] = -99197040;
        gv.gfca[92] = 1527396782;
        gv.gfca[93] = -683862036;
        gv.gfca[94] = 383970339;
        gv.gfca[95] = 396590964;
        gv.gfca[96] = 1367306944;
        gv.gfca[97] = 1575516510;
        gv.gfca[98] = 683665168;
        gv.gfca[99] = 143128482;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void selectInventorySlot(int var1_1) {
        block97: {
            v0 /* !! */  = gv.nl;
            if (true) ** GOTO lbl5
            block60: while (true) {
                v0 /* !! */  = (long)(v1 - gv.gfcc("gfvb", gfdd(int ), (int)115));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case 918056247: {
                        v1 = gv.gfcc("gfvc", gfdd(int ), (int)116);
                        continue block60;
                    }
                    case 1185080505: {
                        break block60;
                    }
                    case 1325576398: {
                        v1 = gv.gfcc("gfvd", gfdd(int ), (int)117);
                        continue block60;
                    }
                }
                break;
            }
            var6_2 = gv.c;
            v2 /* !! */  = gv.nl;
            if (true) ** GOTO lbl19
            block61: while (true) {
                v2 /* !! */  = (long)(gv.gfcc("gfvf", gfdd(int ), (int)119) - gv.gfcc("gfve", gfdd(int ), (int)118));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case 1185080505: {
                        break block61;
                    }
                    case 1754678311: {
                        continue block61;
                    }
                }
                break;
            }
            var5_3 /* !! */  = gv.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_0 = gv.nl - gv.gfcc("gfvg", gfdd(int ), (int)120)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == gv.gfcc("gfvh", gfbz(int ), (int)372)) break;
                v3 /* !! */  = (long)gv.gfcc("gfvi", gfbz(int ), (int)373);
            }
            var4_4 = gv.a;
            if (var6_2) {
                throw null;
lbl33:
                // 7 sources

                return;
            }
            if (var4_4 || var4_4) ** GOTO lbl33
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_1 = gv.nl - gv.gfcc("gfvj", gfdd(int ), (int)121)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == gv.gfcc("gfvk", gfbz(int ), (int)374)) break;
                v4 /* !! */  = (long)gv.gfcc("gfvl", gfbz(int ), (int)375);
            }
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_2 = gv.nl - gv.gfcc("gfvm", gfdd(int ), (int)122)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == gv.gfcc("gfvn", gfbz(int ), (int)376)) break;
                v5 /* !! */  = (long)gv.gfcc("gfvo", gfbz(int ), (int)377);
            }
            v6 = gv.mc.field_1724;
            v7 /* !! */  = gv.nl;
            if (true) ** GOTO lbl51
            block66: while (true) {
                v7 /* !! */  = (long)(gv.gfcc("gfvq", gfdd(int ), (int)124) - gv.gfcc("gfvp", gfdd(int ), (int)123));
lbl51:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -848005336: {
                        continue block66;
                    }
                    case 1185080505: {
                        break block66;
                    }
                }
                break;
            }
            v8 = v6.method_31548();
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_3 = gv.nl - gv.gfcc("gfvr", gfdd(int ), (int)125)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == gv.gfcc("gfvs", gfbz(int ), (int)378)) break;
                v9 /* !! */  = (long)gv.gfcc("gfvt", gfbz(int ), (int)379);
            }
            var2_5 = v8.method_67532();
            if (var4_4 || var4_4) ** GOTO lbl33
            if (var1_1 >= gv.gfcc("gfvu", gfbz(int ), (int)380)) break block97;
            if (var4_4 || var4_4) ** GOTO lbl33
            v10 /* !! */  = gv.nl;
            if (true) ** GOTO lbl70
            block68: while (true) {
                v10 /* !! */  = (long)(v11 - gv.gfcc("gfvv", gfdd(int ), (int)126));
lbl70:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -1262016990: {
                        v11 = gv.gfcc("gfvw", gfdd(int ), (int)127);
                        continue block68;
                    }
                    case 1185080505: {
                        break block68;
                    }
                    case 1196555062: {
                        v11 = gv.gfcc("gfvx", gfdd(int ), (int)128);
                        continue block68;
                    }
                    case 1731726866: {
                        v11 = gv.gfcc("gfvy", gfdd(int ), (int)129);
                        continue block68;
                    }
                }
                break;
            }
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_4 = gv.nl - gv.gfcc("gfvz", gfdd(int ), (int)130)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v12 /* !! */  == gv.gfcc("gfwa", gfbz(int ), (int)381)) break;
                v12 /* !! */  = (long)gv.gfcc("gfwb", gfbz(int ), (int)382);
            }
            v13 = gv.mc.field_1724;
            v14 /* !! */  = gv.nl;
            if (true) ** GOTO lbl92
            block70: while (true) {
                v14 /* !! */  = (long)(gv.gfcc("gfwd", gfdd(int ), (int)132) - gv.gfcc("gfwc", gfdd(int ), (int)131));
lbl92:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case 610200072: {
                        continue block70;
                    }
                    case 1185080505: {
                        break block70;
                    }
                }
                break;
            }
            v15 = v13.method_31548();
            v16 /* !! */  = gv.nl;
            if (true) ** GOTO lbl102
            block71: while (true) {
                v16 /* !! */  = (long)(gv.gfcc("gfwf", gfdd(int ), (int)134) - gv.gfcc("gfwe", gfdd(int ), (int)133));
lbl102:
                // 2 sources

                switch ((int)v16 /* !! */ ) {
                    case 884919606: {
                        continue block71;
                    }
                    case 1185080505: {
                        break block71;
                    }
                }
                break;
            }
            v15.method_61496(var1_1);
            if (var4_4 || var4_4) ** GOTO lbl33
            return;
        }
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4 || var4_4) ** GOTO lbl33
                var3_6 = var1_1;
                if (var4_4 || var4_4) ** GOTO lbl33
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_5 = gv.nl - gv.gfcc("gfwg", gfdd(int ), (int)135)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == gv.gfcc("gfwh", gfbz(int ), (int)383)) break;
                    v17 /* !! */  = (long)gv.gfcc("gfwi", gfbz(int ), (int)384);
                }
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_6 = gv.nl - gv.gfcc("gfwj", gfdd(int ), (int)136)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == gv.gfcc("gfwk", gfbz(int ), (int)385)) break;
                    v18 /* !! */  = (long)gv.gfcc("gfwl", gfbz(int ), (int)386);
                }
                v19 = gv.mc.field_1761;
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_7 = gv.nl - gv.gfcc("gfwm", gfdd(int ), (int)137)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == gv.gfcc("gfwn", gfbz(int ), (int)387)) break;
                    v20 /* !! */  = (long)gv.gfcc("gfwo", gfbz(int ), (int)388);
                }
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_8 = gv.nl - gv.gfcc("gfwp", gfdd(int ), (int)138)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == gv.gfcc("gfwq", gfbz(int ), (int)389)) break;
                    v21 /* !! */  = (long)gv.gfcc("gfwr", gfbz(int ), (int)390);
                }
                v22 = gv.mc.field_1724;
                v23 /* !! */  = gv.nl;
                if (true) ** GOTO lbl143
                block76: while (true) {
                    v23 /* !! */  = (long)(v24 - gv.gfcc("gfws", gfdd(int ), (int)139));
lbl143:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case 5324475: {
                            v24 = gv.gfcc("gfwt", gfdd(int ), (int)140);
                            continue block76;
                        }
                        case 1185080505: {
                            break block76;
                        }
                        case 1797154344: {
                            v24 = gv.gfcc("gfwu", gfdd(int ), (int)141);
                            continue block76;
                        }
                    }
                    break;
                }
                v25 = v22.field_7498;
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_9 = gv.nl - gv.gfcc("gfwv", gfdd(int ), (int)142)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v26 /* !! */  == gv.gfcc("gfww", gfbz(int ), (int)391)) break;
                    v26 /* !! */  = (long)gv.gfcc("gfwx", gfbz(int ), (int)392);
                }
                v27 = v25.field_7763;
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_10 = gv.nl - gv.gfcc("gfwy", gfdd(int ), (int)143)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v28 /* !! */  == gv.gfcc("gfwz", gfbz(int ), (int)393)) break;
                    v28 /* !! */  = (long)gv.gfcc("gfxa", gfbz(int ), (int)394);
                }
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_11 = gv.nl - gv.gfcc("gfxb", gfdd(int ), (int)144)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == gv.gfcc("gfxc", gfbz(int ), (int)395)) break;
                    v29 /* !! */  = (long)gv.gfcc("gfxd", gfbz(int ), (int)396);
                }
                v30 /* !! */  = gv.nl;
                if (true) ** GOTO lbl173
                block80: while (true) {
                    v30 /* !! */  = (long)(v31 - gv.gfcc("gfxe", gfdd(int ), (int)145));
lbl173:
                    // 2 sources

                    switch ((int)v30 /* !! */ ) {
                        case -1363181132: {
                            v31 = gv.gfcc("gfxf", gfdd(int ), (int)146);
                            continue block80;
                        }
                        case -1265956870: {
                            v31 = gv.gfcc("gfxg", gfdd(int ), (int)147);
                            continue block80;
                        }
                        case 1185080505: {
                            break block80;
                        }
                    }
                    break;
                }
                v32 = gv.mc.field_1724;
                v33 /* !! */  = gv.nl;
                if (true) ** GOTO lbl187
                block81: while (true) {
                    v33 /* !! */  = (long)(gv.gfcc("gfxi", gfdd(int ), (int)149) - gv.gfcc("gfxh", gfdd(int ), (int)148));
lbl187:
                    // 2 sources

                    switch ((int)v33 /* !! */ ) {
                        case 1185080505: {
                            break block81;
                        }
                        case 1413396516: {
                            continue block81;
                        }
                    }
                    break;
                }
                v19.method_2906(v27, var3_6, var2_5, class_1713.field_7791, (class_1657)v32);
                if (var4_4 || var4_4) ** continue;
                return;
            }
lbl195:
            // 2 sources

            case 0: {
                var5_3 /* !! */  = (int)gv.gfcc("gfxj", gfbz(int ), (int)397);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl236
            }
            case 1: {
                do {
                    var5_3 /* !! */  = (int)gv.gfcc("gfxk", gfbz(int ), (int)398);
                } while (!var6_2);
                throw null;
            }
lbl205:
            // 5 sources

            case 2: {
                var5_3 /* !! */  = (int)gv.gfcc("gfxl", gfbz(int ), (int)399);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl210:
            // 2 sources

            case 3: {
                var5_3 /* !! */  = (int)gv.gfcc("gfxm", gfbz(int ), (int)400);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl232
            }
            case 4: {
                var5_3 /* !! */  = (int)gv.gfcc("gfxn", gfbz(int ), (int)401);
                if (!var6_2) ** GOTO lbl205
                throw null;
            }
lbl219:
            // 3 sources

            case 5: {
                var5_3 /* !! */  = (int)gv.gfcc("gfxo", gfbz(int ), (int)402);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl240
            }
            case 6: {
                var5_3 /* !! */  = (int)gv.gfcc("gfxp", gfbz(int ), (int)403);
                if (!var6_2) ** GOTO lbl195
                throw null;
            }
            case 7: {
                var5_3 /* !! */  = (int)gv.gfcc("gfxq", gfbz(int ), (int)404);
                if (!var6_2) ** GOTO lbl219
                throw null;
            }
lbl232:
            // 2 sources

            case 8: {
                var5_3 /* !! */  = (int)gv.gfcc("gfxr", gfbz(int ), (int)405);
                if (var6_2) {
                    throw null;
                }
            }
lbl236:
            // 4 sources

            case 9: {
                var5_3 /* !! */  = (int)gv.gfcc("gfxs", gfbz(int ), (int)406);
                if (!var6_2) ** GOTO lbl205
                throw null;
            }
lbl240:
            // 2 sources

            case 10: {
                var5_3 /* !! */  = (int)gv.gfcc("gfxt", gfbz(int ), (int)407);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl257
            }
            case 11: {
                var5_3 /* !! */  = (int)gv.gfcc("gfxu", gfbz(int ), (int)408);
                if (!var6_2) ** GOTO lbl210
                throw null;
            }
            case 12: {
                var5_3 /* !! */  = (int)gv.gfcc("gfxv", gfbz(int ), (int)409);
                if (!var6_2) ** GOTO lbl205
                throw null;
            }
            case 13: {
                var5_3 /* !! */  = (int)gv.gfcc("gfxw", gfbz(int ), (int)410);
                if (!var6_2) ** GOTO lbl205
                throw null;
            }
lbl257:
            // 2 sources

            case 14: {
                do {
                    var5_3 /* !! */  = (int)gv.gfcc("gfxx", gfbz(int ), (int)411);
                } while (!var6_2);
                throw null;
            }
            case 15: {
                do {
                    var5_3 /* !! */  = (int)gv.gfcc("gfxy", gfbz(int ), (int)412);
                } while (!var6_2);
                throw null;
            }
            case 16: 
        }
        do {
            var5_3 /* !! */  = (int)gv.gfcc("gfxz", gfbz(int ), (int)413);
        } while (!var6_2);
        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void markMinecartLooted(String var1_1) {
        block125: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_1 = gv.nl - gv.gfcc("gmth", gfdd(int ), (int)574)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == gv.gfcc("gmti", gfbz(int ), (int)1414)) break;
                v0 /* !! */  = (long)gv.gfcc("gmtj", gfbz(int ), (int)1415);
            }
            var6_2 = gv.c;
            while (true) {
                block126: {
                    if ((v1 /* !! */  = (cfr_temp_2 = gv.nl - gv.gfcc("gmtk", gfdd(int ), (int)575)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  != gv.gfcc("gmtl", gfbz(int ), (int)1416)) break block126;
                    var5_3 /* !! */  = gv.b;
                    v2 /* !! */  = gv.nl;
                    if (true) ** GOTO lbl18
                }
                v1 /* !! */  = (long)gv.gfcc("gmtm", gfbz(int ), (int)1417);
            }
            block63: while (true) {
                v2 /* !! */  = (long)(v3 - gv.gfcc("gmtn", gfdd(int ), (int)576));
lbl18:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1994001152: {
                        v3 = gv.gfcc("gmto", gfdd(int ), (int)577);
                        continue block63;
                    }
                    case 1185080505: {
                        break block63;
                    }
                    case 1494134408: {
                        v3 = gv.gfcc("gmtp", gfdd(int ), (int)578);
                        continue block63;
                    }
                }
                break;
            }
            var4_4 = gv.a;
            if (var6_2) {
                throw null;
            }
            if (var4_4 || var4_4) return;
            if (var1_1 != null) {
                if (var4_4) return;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = gv.nl - gv.gfcc("gmtq", gfdd(int ), (int)579)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == gv.gfcc("gmtr", gfbz(int ), (int)1418)) {
                        if (var1_1.isBlank()) {
                            break;
                        }
                        break block125;
                    }
                    v4 /* !! */  = (long)gv.gfcc("gmts", gfbz(int ), (int)1419);
                }
                if (var4_4) return;
            }
            if (var4_4 || var4_4) return;
            return;
        }
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block65: while (true) {
            block127: {
                switch (cfr_temp_0 == -2147483648 ? var5_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var4_4 || var4_4) return;
                        while (true) {
                            if ((v5 /* !! */  = (cfr_temp_4 = gv.nl - gv.gfcc("gmtt", gfdd(int ), (int)580)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                            if (v5 /* !! */  != gv.gfcc("gmtu", gfbz(int ), (int)1420)) ** GOTO lbl56
                            v6 /* !! */  = gv.nl;
                            ** GOTO lbl176
lbl56:
                            // 1 sources

                            v5 /* !! */  = (long)gv.gfcc("gmtv", gfbz(int ), (int)1421);
                        }
                    }
                    case 4: {
                        var5_3 /* !! */  = (int)gv.gfcc("gmvl", gfbz(int ), (int)1440);
                        cfr_temp_0 = 20;
                        if (var6_2) {
                            throw null;
                        }
                        break block127;
                    }
                    case 11: {
                        var5_3 /* !! */  = (int)gv.gfcc("gmvs", gfbz(int ), (int)1447);
                        cfr_temp_0 = 22;
                        if (var6_2) {
                            throw null;
                        }
                        break block127;
                    }
                    case 14: {
                        var5_3 /* !! */  = (int)gv.gfcc("gmvv", gfbz(int ), (int)1450);
                        cfr_temp_0 = 19;
                        if (var6_2) {
                            throw null;
                        }
                        break block127;
                    }
                    case 17: {
                        var5_3 /* !! */  = (int)gv.gfcc("gmvy", gfbz(int ), (int)1453);
                        cfr_temp_0 = 24;
                        if (var6_2) {
                            throw null;
                        }
                        break block127;
                    }
                    case 19: {
                        var5_3 /* !! */  = (int)gv.gfcc("gmwa", gfbz(int ), (int)1455);
                        cfr_temp_0 = 25;
                        if (var6_2) {
                            throw null;
                        }
                        break block127;
                    }
                    case 23: {
                        var5_3 /* !! */  = (int)gv.gfcc("gmwe", gfbz(int ), (int)1459);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 5: {
                        ** GOTO lbl123
                    }
                    case 24: {
                        var5_3 /* !! */  = (int)gv.gfcc("gmwf", gfbz(int ), (int)1460);
                        cfr_temp_0 = 16;
                        if (var6_2) {
                            throw null;
                        }
                        break block127;
                    }
                    case 25: {
                        do {
                            var5_3 /* !! */  = (int)gv.gfcc("gmwg", gfbz(int ), (int)1461);
                        } while (!var6_2);
                        throw null;
                    }
                    case 26: {
                        var5_3 /* !! */  = (int)gv.gfcc("gmwh", gfbz(int ), (int)1462);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 12: {
                        var5_3 /* !! */  = (int)gv.gfcc("gmvt", gfbz(int ), (int)1448);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 22: {
                        var5_3 /* !! */  = (int)gv.gfcc("gmwd", gfbz(int ), (int)1458);
                        cfr_temp_0 = 20;
                        if (var6_2) {
                            throw null;
                        }
                        break block127;
                    }
                    case 27: {
                        var5_3 /* !! */  = (int)gv.gfcc("gmwi", gfbz(int ), (int)1463);
                        if (var6_2) {
                            throw null;
                        }
lbl123:
                        // 3 sources

                        var5_3 /* !! */  = (int)gv.gfcc("gmvm", gfbz(int ), (int)1441);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 8: {
                        var5_3 /* !! */  = (int)gv.gfcc("gmvp", gfbz(int ), (int)1444);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 7: {
                        var5_3 /* !! */  = (int)gv.gfcc("gmvo", gfbz(int ), (int)1443);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 20: {
                        var5_3 /* !! */  = (int)gv.gfcc("gmwb", gfbz(int ), (int)1456);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 9: {
                        var5_3 /* !! */  = (int)gv.gfcc("gmvq", gfbz(int ), (int)1445);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 10: {
                        var5_3 /* !! */  = (int)gv.gfcc("gmvr", gfbz(int ), (int)1446);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 21: {
                        var5_3 /* !! */  = (int)gv.gfcc("gmwc", gfbz(int ), (int)1457);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 6: {
                        var5_3 /* !! */  = (int)gv.gfcc("gmvn", gfbz(int ), (int)1442);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 16: {
                        var5_3 /* !! */  = (int)gv.gfcc("gmvx", gfbz(int ), (int)1452);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 15: {
                        var5_3 /* !! */  = (int)gv.gfcc("gmvw", gfbz(int ), (int)1451);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 3: {
                        var5_3 /* !! */  = (int)gv.gfcc("gmvk", gfbz(int ), (int)1439);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 18: {
                        var5_3 /* !! */  = (int)gv.gfcc("gmvz", gfbz(int ), (int)1454);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 2: {
                        var5_3 /* !! */  = (int)gv.gfcc("gmvj", gfbz(int ), (int)1438);
                        cfr_temp_0 = 1;
                        if (var6_2) {
                            throw null;
                        }
                        break block127;
                    }
lbl176:
                    // 1 sources

                    block68: while (true) {
                        switch ((int)v6 /* !! */ ) {
                            case 1185080505: {
                                break block68;
                            }
                            case 2062324072: {
                                v6 /* !! */  = (long)(gv.gfcc("gmtx", gfdd(int ), (int)582) - gv.gfcc("gmtw", gfdd(int ), (int)581));
                                continue block68;
                            }
                        }
                        break;
                    }
                    this.sessionLootedMinecarts.add(var1_1);
                    if (var4_4 || var4_4) return;
                    v7 /* !! */  = gv.nl;
                    if (true) ** GOTO lbl190
                    block69: while (true) {
                        v7 /* !! */  = (long)(v8 - gv.gfcc("gmty", gfdd(int ), (int)583));
lbl190:
                        // 2 sources

                        switch ((int)v7 /* !! */ ) {
                            case -1207617607: {
                                v8 = gv.gfcc("gmtz", gfdd(int ), (int)584);
                                continue block69;
                            }
                            case 502877012: {
                                v8 = gv.gfcc("gmua", gfdd(int ), (int)585);
                                continue block69;
                            }
                            case 1185080505: {
                                break block69;
                            }
                        }
                        break;
                    }
                    v9 /* !! */  = gv.nl;
                    if (true) ** GOTO lbl203
                    block70: while (true) {
                        v9 /* !! */  = (long)(v10 - gv.gfcc("gmub", gfdd(int ), (int)586));
lbl203:
                        // 2 sources

                        switch ((int)v9 /* !! */ ) {
                            case -1826609336: {
                                v10 = gv.gfcc("gmuc", gfdd(int ), (int)587);
                                continue block70;
                            }
                            case -510833103: {
                                v10 = gv.gfcc("gmud", gfdd(int ), (int)588);
                                continue block70;
                            }
                            case 1185080505: {
                                break block70;
                            }
                            case 1564957185: {
                                v10 = gv.gfcc("gmue", gfdd(int ), (int)589);
                                continue block70;
                            }
                        }
                        break;
                    }
                    if (!this.rememberLooted.isValue()) ** GOTO lbl279
                    if (var4_4 || var4_4) return;
                    while (true) {
                        if ((v11 /* !! */  = (cfr_temp_5 = gv.nl - gv.gfcc("gmuf", gfdd(int ), (int)590)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v11 /* !! */  == gv.gfcc("gmug", gfbz(int ), (int)1422)) {
                            var2_5 = this.getRememberedEntry(var1_1);
                            if (var4_4) return;
                            break;
                        }
                        v11 /* !! */  = (long)gv.gfcc("gmuh", gfbz(int ), (int)1423);
                    }
                    if (var4_4) return;
                    v12 /* !! */  = gv.nl;
                    if (true) ** GOTO lbl230
                    block72: while (true) {
                        v12 /* !! */  = (long)(v13 - gv.gfcc("gmui", gfdd(int ), (int)591));
lbl230:
                        // 2 sources

                        switch ((int)v12 /* !! */ ) {
                            case 735992110: {
                                v13 = gv.gfcc("gmuj", gfdd(int ), (int)592);
                                continue block72;
                            }
                            case 1185080505: {
                                break block72;
                            }
                            case 2063102251: {
                                v13 = gv.gfcc("gmuk", gfdd(int ), (int)593);
                                continue block72;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v14 /* !! */  = (cfr_temp_6 = gv.nl - gv.gfcc("gmul", gfdd(int ), (int)594)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v14 /* !! */  == gv.gfcc("gmum", gfbz(int ), (int)1424)) break;
                        v14 /* !! */  = (long)gv.gfcc("gmun", gfbz(int ), (int)1425);
                    }
                    v15 = (Predicate<String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$markMinecartLooted$2(java.lang.String java.lang.String ), (Ljava/lang/String;)Z)((gv)this, (String)var1_1);
                    while (true) {
                        if ((v16 /* !! */  = (cfr_temp_7 = gv.nl - gv.gfcc("gmuo", gfdd(int ), (int)595)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v16 /* !! */  == gv.gfcc("gmup", gfbz(int ), (int)1426)) {
                            var3_6 = this.rememberedMinecarts.removeIf(v15);
                            if (var4_4) return;
                            break;
                        }
                        v16 /* !! */  = (long)gv.gfcc("gmuq", gfbz(int ), (int)1427);
                    }
                    if (var4_4) return;
                    while (true) {
                        if ((v17 /* !! */  = (cfr_temp_8 = gv.nl - gv.gfcc("gmur", gfdd(int ), (int)596)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                        if (v17 /* !! */  == gv.gfcc("gmus", gfbz(int ), (int)1428)) break;
                        v17 /* !! */  = (long)gv.gfcc("gmut", gfbz(int ), (int)1429);
                    }
                    while (true) {
                        if ((v18 /* !! */  = (cfr_temp_9 = gv.nl - gv.gfcc("gmuu", gfdd(int ), (int)597)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                        if (v18 /* !! */  != gv.gfcc("gmuv", gfbz(int ), (int)1430)) ** GOTO lbl265
                        if (!this.rememberedMinecarts.add(var2_5)) {
                            break;
                        }
                        ** GOTO lbl270
lbl265:
                        // 1 sources

                        v18 /* !! */  = (long)gv.gfcc("gmuw", gfbz(int ), (int)1431);
                    }
                    if (var4_4) return;
                    if (!var3_6) ** GOTO lbl279
                    if (var4_4) return;
lbl270:
                    // 2 sources

                    if (var4_4 || var4_4) return;
                    while (true) {
                        if ((v19 /* !! */  = (cfr_temp_10 = gv.nl - gv.gfcc("gmux", gfdd(int ), (int)598)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                        if (v19 /* !! */  == gv.gfcc("gmuy", gfbz(int ), (int)1432)) {
                            this.saveRememberedMinecarts();
                            if (var4_4) return;
                            break;
                        }
                        v19 /* !! */  = (long)gv.gfcc("gmuz", gfbz(int ), (int)1433);
                    }
lbl279:
                    // 3 sources

                    if (var4_4 || var4_4) return;
                    while (true) {
                        if ((v20 /* !! */  = (cfr_temp_11 = gv.nl - gv.gfcc("gmva", gfdd(int ), (int)599)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                        if (v20 /* !! */  != gv.gfcc("gmvb", gfbz(int ), (int)1434)) ** GOTO lbl285
                        v21 /* !! */  = gv.nl;
                        if (true) ** GOTO lbl289
lbl285:
                        // 1 sources

                        v20 /* !! */  = (long)gv.gfcc("gmvc", gfbz(int ), (int)1435);
                    }
                    block79: while (true) {
                        v21 /* !! */  = (long)(v22 - gv.gfcc("gmvd", gfdd(int ), (int)600));
lbl289:
                        // 2 sources

                        switch ((int)v21 /* !! */ ) {
                            case -1846873208: {
                                v22 = gv.gfcc("gmve", gfdd(int ), (int)601);
                                continue block79;
                            }
                            case -1358286998: {
                                v22 = gv.gfcc("gmvf", gfdd(int ), (int)602);
                                continue block79;
                            }
                            case 156877913: {
                                v22 = gv.gfcc("gmvg", gfdd(int ), (int)603);
                                continue block79;
                            }
                            case 1185080505: {
                                break block79;
                            }
                        }
                        break;
                    }
                    this.foundLootByMinecart.remove(var1_1);
                    if (!var4_4 && !var4_4) return;
                    return;
                    case 0: {
                        var5_3 /* !! */  = (int)gv.gfcc("gmvh", gfbz(int ), (int)1436);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 1: {
                        var5_3 /* !! */  = (int)gv.gfcc("gmvi", gfbz(int ), (int)1437);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 13: 
                }
                ** GOTO lbl318
            }
            do {
                if (true) continue block65;
lbl318:
                // 2 sources

                var5_3 /* !! */  = (int)gv.gfcc("gmvu", gfbz(int ), (int)1449);
                cfr_temp_0 = 0;
            } while (!var6_2);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void gqif() {
        gv.gfcb[1400] = -491944592;
        gv.gfcb[1401] = -877772576;
        gv.gfcb[1402] = -1025320874;
        gv.gfcb[1403] = 556185978;
        gv.gfcb[1404] = -181855088;
        gv.gfcb[1405] = 26926191;
        gv.gfcb[1406] = 1659316771;
        gv.gfcb[1407] = -122880440;
        gv.gfcb[1408] = 2002029130;
        gv.gfcb[1409] = -1737266841;
        gv.gfcb[1410] = -504543133;
        gv.gfcb[1411] = 1195515974;
        gv.gfcb[1412] = -1482053014;
        gv.gfcb[1413] = 737023341;
        gv.gfcb[1414] = -1657725058;
        gv.gfcb[1415] = -622684117;
        gv.gfcb[1416] = -1847578572;
        gv.gfcb[1417] = -1013283704;
        gv.gfcb[1418] = -329474727;
        gv.gfcb[1419] = -449806723;
        gv.gfcb[1420] = -619445545;
        gv.gfcb[1421] = -179120222;
        gv.gfcb[1422] = 940085357;
        gv.gfcb[1423] = -1785632059;
        gv.gfcb[1424] = 832060163;
        gv.gfcb[1425] = 1128252616;
        gv.gfcb[1426] = 169424659;
        gv.gfcb[1427] = -665373669;
        gv.gfcb[1428] = -987030913;
        gv.gfcb[1429] = 1882431234;
        gv.gfcb[1430] = -1829030411;
        gv.gfcb[1431] = 717315487;
        gv.gfcb[1432] = -2031533316;
        gv.gfcb[1433] = -543758133;
        gv.gfcb[1434] = -601328876;
        gv.gfcb[1435] = 928162927;
        gv.gfcb[1436] = -1060886283;
        gv.gfcb[1437] = 52281865;
        gv.gfcb[1438] = 160364898;
        gv.gfcb[1439] = -218234154;
        gv.gfcb[1440] = -277558681;
        gv.gfcb[1441] = -381790280;
        gv.gfcb[1442] = -1683610567;
        gv.gfcb[1443] = 2086822883;
        gv.gfcb[1444] = 1680596370;
        gv.gfcb[1445] = 1065629595;
        gv.gfcb[1446] = 1481230519;
        gv.gfcb[1447] = 906424238;
        gv.gfcb[1448] = -1261061793;
        gv.gfcb[1449] = -1761573357;
        gv.gfcb[1450] = 849353774;
        gv.gfcb[1451] = 580051794;
        gv.gfcb[1452] = 2157744;
        gv.gfcb[1453] = -707928214;
        gv.gfcb[1454] = 658515175;
        gv.gfcb[1455] = 334934596;
        gv.gfcb[1456] = 763582956;
        gv.gfcb[1457] = -442128638;
        gv.gfcb[1458] = -757257406;
        gv.gfcb[1459] = 1598130852;
        gv.gfcb[1460] = 695666363;
        gv.gfcb[1461] = 2099156433;
        gv.gfcb[1462] = 1087740194;
        gv.gfcb[1463] = -732280107;
        gv.gfcb[1464] = 125789764;
        gv.gfcb[1465] = 1629402347;
        gv.gfcb[1466] = 144257302;
        gv.gfcb[1467] = 1667336481;
        gv.gfcb[1468] = 1149802630;
        gv.gfcb[1469] = 656209688;
        gv.gfcb[1470] = 741624905;
        gv.gfcb[1471] = 628752931;
        gv.gfcb[1472] = -1430854701;
        gv.gfcb[1473] = 94944235;
        gv.gfcb[1474] = -558674241;
        gv.gfcb[1475] = -938092652;
        gv.gfcb[1476] = -1908445327;
        gv.gfcb[1477] = 757313866;
        gv.gfcb[1478] = -1669081492;
        gv.gfcb[1479] = -1434393143;
        gv.gfcb[1480] = 487362499;
        gv.gfcb[1481] = -560931686;
        gv.gfcb[1482] = -1660765379;
        gv.gfcb[1483] = -876145118;
        gv.gfcb[1484] = -1041817924;
        gv.gfcb[1485] = 1696688189;
        gv.gfcb[1486] = 1410080703;
        gv.gfcb[1487] = -1573598751;
        gv.gfcb[1488] = -721923210;
        gv.gfcb[1489] = -1328722665;
        gv.gfcb[1490] = 1433413371;
        gv.gfcb[1491] = 731605973;
        gv.gfcb[1492] = 1952079280;
        gv.gfcb[1493] = 1601500024;
        gv.gfcb[1494] = -1994171945;
        gv.gfcb[1495] = -785091601;
        gv.gfcb[1496] = 627565522;
        gv.gfcb[1497] = 2057401046;
        gv.gfcb[1498] = -1888035538;
        gv.gfcb[1499] = 131897533;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isRegionDenyMessage(String var1_1) {
        v0 /* !! */  = gv.nl;
        if (true) ** GOTO lbl5
        block41: while (true) {
            v0 /* !! */  = (long)(gv.gfcc("gflh", gfdd(int ), (int)47) - gv.gfcc("gflg", gfdd(int ), (int)46));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -221842761: {
                    continue block41;
                }
                case 1185080505: {
                    break block41;
                }
            }
            break;
        }
        var4_2 = gv.c;
        v1 /* !! */  = gv.nl;
        if (true) ** GOTO lbl15
        block42: while (true) {
            v1 /* !! */  = (long)(gv.gfcc("gflj", gfdd(int ), (int)49) - gv.gfcc("gfli", gfdd(int ), (int)48));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 1185080505: {
                    break block42;
                }
                case 2032074889: {
                    continue block42;
                }
            }
            break;
        }
        var3_3 /* !! */  = gv.b;
        v2 /* !! */  = gv.nl;
        if (true) ** GOTO lbl25
        block43: while (true) {
            v2 /* !! */  = (long)(v3 - gv.gfcc("gflk", gfdd(int ), (int)50));
lbl25:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 565197107: {
                    v3 = gv.gfcc("gfll", gfdd(int ), (int)51);
                    continue block43;
                }
                case 1185080505: {
                    break block43;
                }
                case 1242453207: {
                    v3 = gv.gfcc("gflm", gfdd(int ), (int)52);
                    continue block43;
                }
                case 1641842234: {
                    v3 = gv.gfcc("gfln", gfdd(int ), (int)53);
                    continue block43;
                }
            }
            break;
        }
        var2_4 = gv.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
lbl43:
                    // 8 sources

                    return (boolean)gv.gfcc("gflo", gfbz(int ), (int)186);
                }
                if (var2_4 || var2_4) ** GOTO lbl43
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = gv.nl - gv.gfcc("gflp", gfdd(int ), (int)54)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == gv.gfcc("gflq", gfbz(int ), (int)187)) break;
                    v4 /* !! */  = (long)gv.gfcc("gflr", gfbz(int ), (int)188);
                }
                if (var1_1.contains("\u043d\u0435 \u043c\u043e\u0436\u0435\u0442\u0435 \u0441\u043b\u043e\u043c\u0430\u0442\u044c \u0431\u043b\u043e\u043a \u0437\u0434\u0435\u0441\u044c")) ** GOTO lbl103
                if (var2_4) ** GOTO lbl43
                v5 /* !! */  = gv.nl;
                if (true) ** GOTO lbl58
                block46: while (true) {
                    v5 /* !! */  = (long)(v6 - gv.gfcc("gfls", gfdd(int ), (int)55));
lbl58:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 1185080505: {
                            break block46;
                        }
                        case 1644893746: {
                            v6 = gv.gfcc("gflt", gfdd(int ), (int)56);
                            continue block46;
                        }
                        case 1663447953: {
                            v6 = gv.gfcc("gflu", gfdd(int ), (int)57);
                            continue block46;
                        }
                    }
                    break;
                }
                if (var1_1.contains("\u043d\u0435 \u043c\u043e\u0436\u0435\u0442\u0435 \u0441\u0442\u0440\u043e\u0438\u0442\u044c \u0437\u0434\u0435\u0441\u044c")) ** GOTO lbl103
                if (var2_4) ** GOTO lbl43
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = gv.nl - gv.gfcc("gflv", gfdd(int ), (int)58)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == gv.gfcc("gflw", gfbz(int ), (int)189)) break;
                    v7 /* !! */  = (long)gv.gfcc("gflx", gfbz(int ), (int)190);
                }
                if (!var1_1.contains("\u043d\u0435 \u043c\u043e\u0436\u0435\u0442\u0435")) ** GOTO lbl108
                if (var2_4) ** GOTO lbl43
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = gv.nl - gv.gfcc("gfly", gfdd(int ), (int)59)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == gv.gfcc("gflz", gfbz(int ), (int)191)) break;
                    v8 /* !! */  = (long)gv.gfcc("gfma", gfbz(int ), (int)192);
                }
                if (!var1_1.contains("\u0431\u043b\u043e\u043a")) ** GOTO lbl108
                if (var2_4) ** GOTO lbl43
                v9 /* !! */  = gv.nl;
                if (true) ** GOTO lbl89
                block49: while (true) {
                    v9 /* !! */  = (long)(v10 - gv.gfcc("gfmb", gfdd(int ), (int)60));
lbl89:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -827843210: {
                            v10 = gv.gfcc("gfmc", gfdd(int ), (int)61);
                            continue block49;
                        }
                        case 254371486: {
                            v10 = gv.gfcc("gfmd", gfdd(int ), (int)62);
                            continue block49;
                        }
                        case 1004073026: {
                            v10 = gv.gfcc("gfme", gfdd(int ), (int)63);
                            continue block49;
                        }
                        case 1185080505: {
                            break block49;
                        }
                    }
                    break;
                }
                if (!var1_1.contains("\u0437\u0434\u0435\u0441\u044c")) ** GOTO lbl108
                if (var2_4) ** GOTO lbl43
lbl103:
                // 3 sources

                if (var2_4 || var2_4) ** GOTO lbl43
                v11 = gv.gfcc("gfmf", gfbz(int ), (int)193);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl111
lbl108:
                // 3 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v11 = gv.gfcc("gfmg", gfbz(int ), (int)194);
lbl111:
                // 2 sources

                return (boolean)v11;
            }
lbl112:
            // 4 sources

            case 0: {
                var3_3 /* !! */  = (int)gv.gfcc("gfmh", gfbz(int ), (int)195);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl122
            }
            case 1: {
                var3_3 /* !! */  = (int)gv.gfcc("gfmi", gfbz(int ), (int)196);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl163
            }
lbl122:
            // 2 sources

            case 2: {
                do {
                    var3_3 /* !! */  = (int)gv.gfcc("gfmj", gfbz(int ), (int)197);
                } while (!var4_2);
                throw null;
            }
lbl127:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)gv.gfcc("gfmk", gfbz(int ), (int)198);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl142
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)gv.gfcc("gfml", gfbz(int ), (int)199);
                    if (!var4_2) ** GOTO lbl112
                    throw null;
                }
            }
            case 5: {
                var3_3 /* !! */  = (int)gv.gfcc("gfmm", gfbz(int ), (int)200);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl142:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)gv.gfcc("gfmn", gfbz(int ), (int)201);
                if (!var4_2) ** GOTO lbl112
                throw null;
            }
lbl146:
            // 3 sources

            case 7: {
                var3_3 /* !! */  = (int)gv.gfcc("gfmo", gfbz(int ), (int)202);
                if (!var4_2) ** GOTO lbl127
                throw null;
            }
lbl150:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)gv.gfcc("gfmp", gfbz(int ), (int)203);
                if (!var4_2) ** GOTO lbl112
                throw null;
            }
            case 9: {
                var3_3 /* !! */  = (int)gv.gfcc("gfmq", gfbz(int ), (int)204);
                if (!var4_2) ** GOTO lbl146
                throw null;
            }
            case 10: {
                do {
                    var3_3 /* !! */  = (int)gv.gfcc("gfmr", gfbz(int ), (int)205);
                } while (!var4_2);
                throw null;
            }
lbl163:
            // 2 sources

            case 11: {
                var3_3 /* !! */  = (int)gv.gfcc("gfms", gfbz(int ), (int)206);
                if (var4_2) {
                    throw null;
                }
            }
            case 12: {
                var3_3 /* !! */  = (int)gv.gfcc("gfmt", gfbz(int ), (int)207);
                if (!var4_2) ** GOTO lbl150
                throw null;
            }
            case 13: 
        }
        var3_3 /* !! */  = (int)gv.gfcc("gfmu", gfbz(int ), (int)208);
        ** while (!var4_2)
lbl174:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gqoo() {
        gv.gfdf[600] = -7105167063790142773L;
        gv.gfdf[601] = -6971628178081416431L;
        gv.gfdf[602] = -6707074751048366561L;
        gv.gfdf[603] = 1974965819817402033L;
        gv.gfdf[604] = 5210000724437580812L;
        gv.gfdf[605] = -8591201749793391537L;
        gv.gfdf[606] = -7897604686718014942L;
        gv.gfdf[607] = -7987527037855389773L;
        gv.gfdf[608] = 7783938906730632735L;
        gv.gfdf[609] = -6890964362655607869L;
        gv.gfdf[610] = 4073807214730904078L;
        gv.gfdf[611] = 5807247813930813364L;
        gv.gfdf[612] = -5806877624809883769L;
        gv.gfdf[613] = 8340470042288125184L;
        gv.gfdf[614] = 5555270713553860865L;
        gv.gfdf[615] = -6216974862335075200L;
        gv.gfdf[616] = 7142681418427865846L;
        gv.gfdf[617] = -3296539641367626401L;
        gv.gfdf[618] = 9101543212691079375L;
        gv.gfdf[619] = -6694638190817240019L;
        gv.gfdf[620] = -6422591742679851705L;
        gv.gfdf[621] = -5598235964928387474L;
        gv.gfdf[622] = -3891430006147962056L;
        gv.gfdf[623] = 2345437684189088298L;
        gv.gfdf[624] = 1637908698282274435L;
        gv.gfdf[625] = -4221224378823258068L;
        gv.gfdf[626] = 2798757097900516583L;
        gv.gfdf[627] = 7431498428620324626L;
        gv.gfdf[628] = 5634531096387254767L;
        gv.gfdf[629] = -5690010942256192640L;
        gv.gfdf[630] = -1483951509323549604L;
        gv.gfdf[631] = 1954704795447771456L;
        gv.gfdf[632] = -3001457410485625959L;
        gv.gfdf[633] = -1246886637000304172L;
        gv.gfdf[634] = 7478344822116573563L;
        gv.gfdf[635] = -1962978398798090136L;
        gv.gfdf[636] = -9131753326969843691L;
        gv.gfdf[637] = 489704293851465270L;
        gv.gfdf[638] = 6408706416328960771L;
        gv.gfdf[639] = 8576394531224593310L;
        gv.gfdf[640] = 1065838910890383679L;
        gv.gfdf[641] = -3026291650751181430L;
        gv.gfdf[642] = 5946073449994490234L;
        gv.gfdf[643] = -1565783185203886337L;
        gv.gfdf[644] = -7802386485919186985L;
        gv.gfdf[645] = 2618543409078674256L;
        gv.gfdf[646] = 4893575200154091803L;
        gv.gfdf[647] = -2885081065451173224L;
        gv.gfdf[648] = 2485775810916036939L;
        gv.gfdf[649] = -8815424202759785044L;
        gv.gfdf[650] = 2306717368077664913L;
        gv.gfdf[651] = -5142781680241738104L;
        gv.gfdf[652] = 8839711402143622633L;
        gv.gfdf[653] = 7384487101332870252L;
        gv.gfdf[654] = -1899252226570846053L;
        gv.gfdf[655] = 1355510088098405574L;
        gv.gfdf[656] = -125730657021086473L;
        gv.gfdf[657] = 2481210163981409506L;
        gv.gfdf[658] = -7752656394496481609L;
        gv.gfdf[659] = 4616982972207751253L;
        gv.gfdf[660] = 2725248965434106413L;
        gv.gfdf[661] = -3545671175992016624L;
        gv.gfdf[662] = -3247422232651978695L;
        gv.gfdf[663] = -3022240569447449250L;
        gv.gfdf[664] = -1322963622435488825L;
        gv.gfdf[665] = 385063407346177389L;
        gv.gfdf[666] = -5484249870661167672L;
        gv.gfdf[667] = -1199315743743589991L;
        gv.gfdf[668] = 96669204513003171L;
        gv.gfdf[669] = 3903782855883693391L;
        gv.gfdf[670] = -7995438939264586218L;
        gv.gfdf[671] = 4222573695167257950L;
        gv.gfdf[672] = 2152734959681215121L;
        gv.gfdf[673] = 2034270217319837163L;
        gv.gfdf[674] = -604244677971587551L;
        gv.gfdf[675] = -4255768870690530853L;
        gv.gfdf[676] = -2044050420165944630L;
        gv.gfdf[677] = 8523616989208511023L;
        gv.gfdf[678] = 1969701056153693182L;
        gv.gfdf[679] = 2769381874614239120L;
        gv.gfdf[680] = 6679834380242599121L;
        gv.gfdf[681] = 5417407428863759707L;
        gv.gfdf[682] = 8701294940858131480L;
        gv.gfdf[683] = -3926707836398505760L;
        gv.gfdf[684] = 6179775438619056688L;
        gv.gfdf[685] = 6737172676591945518L;
        gv.gfdf[686] = -1756178170541453182L;
        gv.gfdf[687] = 1172405377271699740L;
        gv.gfdf[688] = -8785553845899523589L;
        gv.gfdf[689] = 7831323633184543739L;
        gv.gfdf[690] = 5140431514910288936L;
        gv.gfdf[691] = 4382708187290692612L;
        gv.gfdf[692] = -9066661135470584443L;
        gv.gfdf[693] = -477044934246083308L;
        gv.gfdf[694] = -7871084485620821777L;
        gv.gfdf[695] = -6561182223036736936L;
        gv.gfdf[696] = 6696142405042392181L;
        gv.gfdf[697] = -177184167987167781L;
        gv.gfdf[698] = -5607708228939012856L;
        gv.gfdf[699] = -6642779121654530720L;
    }

    private static /* synthetic */ void gqmy() {
        gv.gfdf[0] = -6917517749241128081L;
        gv.gfdf[1] = -4285383887755294363L;
        gv.gfdf[2] = -495505019542068552L;
        gv.gfdf[3] = 7475197665707053513L;
        gv.gfdf[4] = -1371615700582453821L;
        gv.gfdf[5] = -5215963007058793035L;
        gv.gfdf[6] = -2726044221821229171L;
        gv.gfdf[7] = 5186517143837699973L;
        gv.gfdf[8] = 6387799287822944620L;
        gv.gfdf[9] = 6643244384032313807L;
        gv.gfdf[10] = -6165218469058941358L;
        gv.gfdf[11] = -8301672405490957347L;
        gv.gfdf[12] = 4294865693059095740L;
        gv.gfdf[13] = 5108045208756913486L;
        gv.gfdf[14] = 817711783564435836L;
        gv.gfdf[15] = 9024549417103159525L;
        gv.gfdf[16] = -3250691317919580699L;
        gv.gfdf[17] = -6678100384425934877L;
        gv.gfdf[18] = -5641862129980239635L;
        gv.gfdf[19] = 6332179181753788494L;
        gv.gfdf[20] = 6025939757882874925L;
        gv.gfdf[21] = -2339328320944049788L;
        gv.gfdf[22] = 775540138219278472L;
        gv.gfdf[23] = 9002926480727399514L;
        gv.gfdf[24] = -6143180463518333922L;
        gv.gfdf[25] = -2943743162204095330L;
        gv.gfdf[26] = -9121964343931426485L;
        gv.gfdf[27] = 537605361551901144L;
        gv.gfdf[28] = -4272622399783500929L;
        gv.gfdf[29] = 2707445456924027796L;
        gv.gfdf[30] = 2058098276163684999L;
        gv.gfdf[31] = -2991072284414271426L;
        gv.gfdf[32] = -4239791735497165224L;
        gv.gfdf[33] = -821943612186559416L;
        gv.gfdf[34] = 7991101009409537488L;
        gv.gfdf[35] = 7959499848107750756L;
        gv.gfdf[36] = -9091264996637251877L;
        gv.gfdf[37] = 1975739817973251260L;
        gv.gfdf[38] = 3068192060122982538L;
        gv.gfdf[39] = -4356911567872411719L;
        gv.gfdf[40] = -2483328643846521972L;
        gv.gfdf[41] = -9043781770220927093L;
        gv.gfdf[42] = -891234523774080078L;
        gv.gfdf[43] = 3373625845605345928L;
        gv.gfdf[44] = 6507203604068960182L;
        gv.gfdf[45] = 3688970917158404961L;
        gv.gfdf[46] = 5617492581312798884L;
        gv.gfdf[47] = 524261983592122318L;
        gv.gfdf[48] = 3675743628038085949L;
        gv.gfdf[49] = 1325511049293442701L;
        gv.gfdf[50] = 3240394838462551964L;
        gv.gfdf[51] = 489096296715050896L;
        gv.gfdf[52] = 4477168433322302872L;
        gv.gfdf[53] = -288085160569574342L;
        gv.gfdf[54] = 3729898724253153591L;
        gv.gfdf[55] = 3289284231544226078L;
        gv.gfdf[56] = 2869207303642558583L;
        gv.gfdf[57] = -3898623792996313338L;
        gv.gfdf[58] = -1931365928278553327L;
        gv.gfdf[59] = -391259478929975856L;
        gv.gfdf[60] = 8867046187820968596L;
        gv.gfdf[61] = -7331122276888731405L;
        gv.gfdf[62] = -4212619274083457141L;
        gv.gfdf[63] = -1951975055115421072L;
        gv.gfdf[64] = -1306693886536003593L;
        gv.gfdf[65] = -1724774468039812322L;
        gv.gfdf[66] = 8804942261173402849L;
        gv.gfdf[67] = -1388433514537285670L;
        gv.gfdf[68] = -440159486222906006L;
        gv.gfdf[69] = 3843842755439407046L;
        gv.gfdf[70] = 5683436679051626179L;
        gv.gfdf[71] = -5804090139097853550L;
        gv.gfdf[72] = 1157519243686943387L;
        gv.gfdf[73] = -546942137294249579L;
        gv.gfdf[74] = 2868430277812805705L;
        gv.gfdf[75] = -8782919747118802776L;
        gv.gfdf[76] = 5945746220412313361L;
        gv.gfdf[77] = 7535854238216114697L;
        gv.gfdf[78] = -8898805135424784218L;
        gv.gfdf[79] = 7075995587186746241L;
        gv.gfdf[80] = 457289939392926665L;
        gv.gfdf[81] = 111625895191222206L;
        gv.gfdf[82] = -6518582650221517442L;
        gv.gfdf[83] = 5729592894649519923L;
        gv.gfdf[84] = -6766609809462105652L;
        gv.gfdf[85] = 6785339345484737095L;
        gv.gfdf[86] = 1790325403694231932L;
        gv.gfdf[87] = 2106704994495083189L;
        gv.gfdf[88] = -4281922038638691420L;
        gv.gfdf[89] = -5848056251574389056L;
        gv.gfdf[90] = -2304551019091695294L;
        gv.gfdf[91] = -6952494195160451459L;
        gv.gfdf[92] = 7268242575146290158L;
        gv.gfdf[93] = 3459140282310341447L;
        gv.gfdf[94] = 2928333567020503436L;
        gv.gfdf[95] = 334213693375064822L;
        gv.gfdf[96] = -8479273123781205841L;
        gv.gfdf[97] = -7342784127892938969L;
        gv.gfdf[98] = 2198491782555527024L;
        gv.gfdf[99] = -2061207324792624306L;
    }

    private static /* synthetic */ void gpwc() {
        gv.gfca[600] = -237883828;
        gv.gfca[601] = 2052410157;
        gv.gfca[602] = 198880465;
        gv.gfca[603] = -1218622738;
        gv.gfca[604] = -1477487161;
        gv.gfca[605] = 32913719;
        gv.gfca[606] = -1076695166;
        gv.gfca[607] = -1145853822;
        gv.gfca[608] = -1470122296;
        gv.gfca[609] = -1996297461;
        gv.gfca[610] = -1385263489;
        gv.gfca[611] = 1980343255;
        gv.gfca[612] = -1378096967;
        gv.gfca[613] = -1864481870;
        gv.gfca[614] = 2053649516;
        gv.gfca[615] = -1701013314;
        gv.gfca[616] = 1880912815;
        gv.gfca[617] = 643011305;
        gv.gfca[618] = -1460395604;
        gv.gfca[619] = -234163791;
        gv.gfca[620] = -1503777540;
        gv.gfca[621] = -444139135;
        gv.gfca[622] = 891595569;
        gv.gfca[623] = 1177908304;
        gv.gfca[624] = -937847855;
        gv.gfca[625] = -2032770161;
        gv.gfca[626] = 1262244834;
        gv.gfca[627] = 400603705;
        gv.gfca[628] = 657781080;
        gv.gfca[629] = 1011979580;
        gv.gfca[630] = 352642565;
        gv.gfca[631] = -2132514065;
        gv.gfca[632] = 87114179;
        gv.gfca[633] = 1457715103;
        gv.gfca[634] = 1540697717;
        gv.gfca[635] = -1652880193;
        gv.gfca[636] = -1907479847;
        gv.gfca[637] = -1784012533;
        gv.gfca[638] = -1566474358;
        gv.gfca[639] = 222076374;
        gv.gfca[640] = -540591414;
        gv.gfca[641] = 1245772836;
        gv.gfca[642] = 88376178;
        gv.gfca[643] = 277810877;
        gv.gfca[644] = 445198739;
        gv.gfca[645] = 1851968563;
        gv.gfca[646] = 1763936326;
        gv.gfca[647] = -1830274301;
        gv.gfca[648] = -608275358;
        gv.gfca[649] = -1188898195;
        gv.gfca[650] = 1443727463;
        gv.gfca[651] = 342450962;
        gv.gfca[652] = -250929864;
        gv.gfca[653] = 905055863;
        gv.gfca[654] = -690117663;
        gv.gfca[655] = 1251614665;
        gv.gfca[656] = -2003177828;
        gv.gfca[657] = -1291146227;
        gv.gfca[658] = -385529016;
        gv.gfca[659] = 1489248481;
        gv.gfca[660] = -696472893;
        gv.gfca[661] = -873888499;
        gv.gfca[662] = -408948732;
        gv.gfca[663] = -2019165766;
        gv.gfca[664] = -967341321;
        gv.gfca[665] = -1727234419;
        gv.gfca[666] = 271928070;
        gv.gfca[667] = -476265157;
        gv.gfca[668] = -274774480;
        gv.gfca[669] = -388180745;
        gv.gfca[670] = -2030021669;
        gv.gfca[671] = -1040616720;
        gv.gfca[672] = 437654247;
        gv.gfca[673] = -1586964665;
        gv.gfca[674] = 1469997752;
        gv.gfca[675] = 1975691250;
        gv.gfca[676] = -435951850;
        gv.gfca[677] = -292481000;
        gv.gfca[678] = 1991813486;
        gv.gfca[679] = -971098468;
        gv.gfca[680] = -1190906180;
        gv.gfca[681] = -220334828;
        gv.gfca[682] = -210565700;
        gv.gfca[683] = -1723808392;
        gv.gfca[684] = 1856599085;
        gv.gfca[685] = 590268409;
        gv.gfca[686] = -1723351029;
        gv.gfca[687] = 1058745241;
        gv.gfca[688] = 1342219947;
        gv.gfca[689] = 1634859375;
        gv.gfca[690] = -1033972104;
        gv.gfca[691] = 1125629625;
        gv.gfca[692] = -943611839;
        gv.gfca[693] = -1076441321;
        gv.gfca[694] = -127035047;
        gv.gfca[695] = -1886295773;
        gv.gfca[696] = -1485352977;
        gv.gfca[697] = -2026650948;
        gv.gfca[698] = -982109453;
        gv.gfca[699] = -1831034145;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void rotateExploreDirection() {
        v0 /* !! */  = gv.nl;
        if (true) ** GOTO lbl5
        block40: while (true) {
            v0 /* !! */  = (long)(v1 - gv.gfcc("gigr", gfdd(int ), (int)376));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1694897122: {
                    v1 = gv.gfcc("gigt", gfdd(int ), (int)377);
                    continue block40;
                }
                case -704177313: {
                    v1 = gv.gfcc("gigu", gfdd(int ), (int)378);
                    continue block40;
                }
                case 1185080505: {
                    break block40;
                }
            }
            break;
        }
        var3_1 = gv.c;
        v2 /* !! */  = gv.nl;
        if (true) ** GOTO lbl19
        block41: while (true) {
            v2 /* !! */  = (long)(gv.gfcc("giha", gfdd(int ), (int)380) - gv.gfcc("gigv", gfdd(int ), (int)379));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 1185080505: {
                    break block41;
                }
                case 2057051904: {
                    continue block41;
                }
            }
            break;
        }
        var2_2 /* !! */  = gv.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = gv.nl - gv.gfcc("gihc", gfdd(int ), (int)381)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == gv.gfcc("gihd", gfbz(int ), (int)938)) break;
            v3 /* !! */  = (long)gv.gfcc("gihf", gfbz(int ), (int)939);
        }
        var1_3 = gv.a;
        if (var3_1) {
            throw null;
lbl34:
            // 4 sources

            return;
        }
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl34
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = gv.nl - gv.gfcc("gihh", gfdd(int ), (int)382)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == gv.gfcc("gihi", gfbz(int ), (int)940)) break;
                    v4 /* !! */  = (long)gv.gfcc("gihj", gfbz(int ), (int)941);
                }
                v5 = this.exploreDirectionIndex + gv.gfcc("gihp", gfbz(int ), (int)942);
                while (true) {
                    if ((v6 = (cfr_temp_2 = gv.nl - gv.gfcc("gihq", gfdd(int ), (int)383)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 == gv.gfcc("gihr", gfbz(int ), (int)943)) break;
                    v6 = -1362936003;
                }
                v7 = v5 % gv.EXPLORE_DIRECTIONS.length;
                v8 /* !! */  = gv.nl;
                if (true) ** GOTO lbl59
                block46: while (true) {
                    v8 /* !! */  = (long)(v9 - gv.gfcc("giib", gfdd(int ), (int)384));
lbl59:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case 1185080505: {
                            break block46;
                        }
                        case 1480254295: {
                            v9 = gv.gfcc("giid", gfdd(int ), (int)385);
                            continue block46;
                        }
                        case 1820665449: {
                            v9 = gv.gfcc("giif", gfdd(int ), (int)386);
                            continue block46;
                        }
                    }
                    break;
                }
                this.exploreDirectionIndex = v7;
                if (var1_3 || var1_3) ** GOTO lbl34
                v10 /* !! */  = gv.nl;
                if (true) ** GOTO lbl74
                block47: while (true) {
                    v10 /* !! */  = (long)(v11 - gv.gfcc("giih", gfdd(int ), (int)387));
lbl74:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1706636718: {
                            v11 = gv.gfcc("giil", gfdd(int ), (int)388);
                            continue block47;
                        }
                        case -775222527: {
                            v11 = gv.gfcc("giim", gfdd(int ), (int)389);
                            continue block47;
                        }
                        case 743494777: {
                            v11 = gv.gfcc("giin", gfdd(int ), (int)390);
                            continue block47;
                        }
                        case 1185080505: {
                            break block47;
                        }
                    }
                    break;
                }
                v12 = this.caveLevelIndex + gv.gfcc("giip", gfbz(int ), (int)944);
                v13 /* !! */  = gv.nl;
                if (true) ** GOTO lbl91
                block48: while (true) {
                    v13 /* !! */  = (long)(gv.gfcc("giis", gfdd(int ), (int)392) - gv.gfcc("giiq", gfdd(int ), (int)391));
lbl91:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case 683713190: {
                            continue block48;
                        }
                        case 1185080505: {
                            break block48;
                        }
                    }
                    break;
                }
                v14 = v12 % gv.CAVE_SEARCH_LEVELS.length;
                v15 /* !! */  = gv.nl;
                if (true) ** GOTO lbl101
                block49: while (true) {
                    v15 /* !! */  = (long)(v16 - gv.gfcc("giiy", gfdd(int ), (int)393));
lbl101:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1422355526: {
                            v16 = gv.gfcc("giiz", gfdd(int ), (int)394);
                            continue block49;
                        }
                        case 801853378: {
                            v16 = gv.gfcc("gija", gfdd(int ), (int)395);
                            continue block49;
                        }
                        case 1185080505: {
                            break block49;
                        }
                        case 1462475735: {
                            v16 = gv.gfcc("gijb", gfdd(int ), (int)396);
                            continue block49;
                        }
                    }
                    break;
                }
                this.caveLevelIndex = v14;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)gv.gfcc("gijd", gfbz(int ), (int)945);
                } while (!var3_1);
                throw null;
            }
lbl122:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)gv.gfcc("gije", gfbz(int ), (int)946);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)gv.gfcc("gijf", gfbz(int ), (int)947);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl140
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)gv.gfcc("gijk", gfbz(int ), (int)948);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)gv.gfcc("gijl", gfbz(int ), (int)949);
                if (!var3_1) ** GOTO lbl122
                throw null;
            }
lbl140:
            // 2 sources

            case 5: {
                do {
                    var2_2 /* !! */  = (int)gv.gfcc("gijm", gfbz(int ), (int)950);
                } while (!var3_1);
                throw null;
            }
            case 6: {
                do {
                    var2_2 /* !! */  = (int)gv.gfcc("gijn", gfbz(int ), (int)951);
                } while (!var3_1);
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)gv.gfcc("gijp", gfbz(int ), (int)952);
        ** while (!var3_1)
lbl153:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isNearExploreTarget() {
        block117: {
            block116: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = gv.nl - gv.gfcc("ghwk", gfdd(int ), (int)327)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == gv.gfcc("ghwl", gfbz(int ), (int)863)) break;
                    v0 /* !! */  = (long)gv.gfcc("ghwq", gfbz(int ), (int)864);
                }
                var9_1 = gv.c;
                v1 /* !! */  = gv.nl;
                if (true) ** GOTO lbl11
                block78: while (true) {
                    v1 /* !! */  = (long)(v2 - gv.gfcc("ghwr", gfdd(int ), (int)328));
lbl11:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case -1746848387: {
                            v2 = gv.gfcc("ghws", gfdd(int ), (int)329);
                            continue block78;
                        }
                        case -1737137960: {
                            v2 = gv.gfcc("ghwt", gfdd(int ), (int)330);
                            continue block78;
                        }
                        case 1185080505: {
                            break block78;
                        }
                    }
                    break;
                }
                var8_2 /* !! */  = gv.b;
                v3 /* !! */  = gv.nl;
                if (true) ** GOTO lbl25
                block79: while (true) {
                    v3 /* !! */  = (long)(v4 - gv.gfcc("ghwu", gfdd(int ), (int)331));
lbl25:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 246359722: {
                            v4 = gv.gfcc("ghww", gfdd(int ), (int)332);
                            continue block79;
                        }
                        case 980710628: {
                            v4 = gv.gfcc("ghwx", gfdd(int ), (int)333);
                            continue block79;
                        }
                        case 1185080505: {
                            break block79;
                        }
                        case 2131555520: {
                            v4 = gv.gfcc("ghxd", gfdd(int ), (int)334);
                            continue block79;
                        }
                    }
                    break;
                }
                var7_3 = gv.a;
                if (var9_1) {
                    throw null;
lbl40:
                    // 10 sources

                    return (boolean)gv.gfcc("ghxe", gfbz(int ), (int)865);
                }
                if (var7_3 || var7_3) ** GOTO lbl40
                v5 /* !! */  = gv.nl;
                if (true) ** GOTO lbl47
                block81: while (true) {
                    v5 /* !! */  = (long)(gv.gfcc("ghxg", gfdd(int ), (int)336) - gv.gfcc("ghxf", gfdd(int ), (int)335));
lbl47:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 1185080505: {
                            break block81;
                        }
                        case 1488979007: {
                            continue block81;
                        }
                    }
                    break;
                }
                if (this.exploreTarget != null) break block116;
                if (var7_3 || var7_3) ** GOTO lbl40
                return (boolean)gv.gfcc("ghxi", gfbz(int ), (int)866);
            }
            if (var7_3 || var7_3) ** GOTO lbl40
            v6 /* !! */  = gv.nl;
            if (true) ** GOTO lbl61
            block82: while (true) {
                v6 /* !! */  = (long)(v7 - gv.gfcc("ghxl", gfdd(int ), (int)337));
lbl61:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -865395393: {
                        v7 = gv.gfcc("ghxn", gfdd(int ), (int)338);
                        continue block82;
                    }
                    case 1185080505: {
                        break block82;
                    }
                    case 1463966806: {
                        v7 = gv.gfcc("ghxr", gfdd(int ), (int)339);
                        continue block82;
                    }
                    case 1970492648: {
                        v7 = gv.gfcc("ghxt", gfdd(int ), (int)340);
                        continue block82;
                    }
                }
                break;
            }
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_1 = gv.nl - gv.gfcc("ghxv", gfdd(int ), (int)341)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == gv.gfcc("ghxx", gfbz(int ), (int)867)) break;
                v8 /* !! */  = (long)gv.gfcc("ghxy", gfbz(int ), (int)868);
            }
            v9 = gv.mc.field_1724;
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_2 = gv.nl - gv.gfcc("ghya", gfdd(int ), (int)342)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == gv.gfcc("ghyc", gfbz(int ), (int)869)) break;
                v10 /* !! */  = (long)gv.gfcc("ghyf", gfbz(int ), (int)870);
            }
            v11 = v9.method_23317();
            v12 /* !! */  = gv.nl;
            if (true) ** GOTO lbl89
            block85: while (true) {
                v12 /* !! */  = (long)(gv.gfcc("ghyi", gfdd(int ), (int)344) - gv.gfcc("ghyg", gfdd(int ), (int)343));
lbl89:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case -1683617842: {
                        continue block85;
                    }
                    case 1185080505: {
                        break block85;
                    }
                }
                break;
            }
            v13 /* !! */  = gv.nl;
            if (true) ** GOTO lbl98
            block86: while (true) {
                v13 /* !! */  = (long)(v14 - gv.gfcc("ghyj", gfdd(int ), (int)345));
lbl98:
                // 2 sources

                switch ((int)v13 /* !! */ ) {
                    case -1000488809: {
                        v14 = gv.gfcc("ghyl", gfdd(int ), (int)346);
                        continue block86;
                    }
                    case 778301959: {
                        v14 = gv.gfcc("ghyn", gfdd(int ), (int)347);
                        continue block86;
                    }
                    case 1185080505: {
                        break block86;
                    }
                    case 1601379281: {
                        v14 = gv.gfcc("ghys", gfdd(int ), (int)348);
                        continue block86;
                    }
                }
                break;
            }
            var1_4 = v11 - (double)this.exploreTarget.method_10263();
            if (var7_3 || var7_3) ** GOTO lbl40
            while (true) {
                if ((v15 /* !! */  = (cfr_temp_3 = gv.nl - gv.gfcc("ghyt", gfdd(int ), (int)349)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v15 /* !! */  == gv.gfcc("ghyu", gfbz(int ), (int)871)) break;
                v15 /* !! */  = (long)gv.gfcc("ghyw", gfbz(int ), (int)872);
            }
            v16 /* !! */  = gv.nl;
            if (true) ** GOTO lbl121
            block88: while (true) {
                v16 /* !! */  = (long)(v17 - gv.gfcc("ghyx", gfdd(int ), (int)350));
lbl121:
                // 2 sources

                switch ((int)v16 /* !! */ ) {
                    case 908024990: {
                        v17 = gv.gfcc("ghyz", gfdd(int ), (int)351);
                        continue block88;
                    }
                    case 1185080505: {
                        break block88;
                    }
                    case 1536316648: {
                        v17 = gv.gfcc("ghzb", gfdd(int ), (int)352);
                        continue block88;
                    }
                }
                break;
            }
            v18 = gv.mc.field_1724;
            while (true) {
                if ((v19 /* !! */  = (cfr_temp_4 = gv.nl - gv.gfcc("ghzg", gfdd(int ), (int)353)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v19 /* !! */  == gv.gfcc("ghzh", gfbz(int ), (int)873)) break;
                v19 /* !! */  = (long)gv.gfcc("ghzi", gfbz(int ), (int)874);
            }
            v20 = v18.method_23318();
            while (true) {
                if ((v21 /* !! */  = (cfr_temp_5 = gv.nl - gv.gfcc("ghzk", gfdd(int ), (int)354)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v21 /* !! */  == gv.gfcc("ghzm", gfbz(int ), (int)875)) break;
                v21 /* !! */  = (long)gv.gfcc("ghzn", gfbz(int ), (int)876);
            }
            v22 /* !! */  = gv.nl;
            if (true) ** GOTO lbl146
            block91: while (true) {
                v22 /* !! */  = (long)(v23 - gv.gfcc("ghzp", gfdd(int ), (int)355));
lbl146:
                // 2 sources

                switch ((int)v22 /* !! */ ) {
                    case -1487200821: {
                        v23 = gv.gfcc("ghzu", gfdd(int ), (int)356);
                        continue block91;
                    }
                    case -453527278: {
                        v23 = gv.gfcc("ghzv", gfdd(int ), (int)357);
                        continue block91;
                    }
                    case 1185080505: {
                        break block91;
                    }
                    case 1246244812: {
                        v23 = gv.gfcc("ghzw", gfdd(int ), (int)358);
                        continue block91;
                    }
                }
                break;
            }
            var3_5 = v20 - (double)this.exploreTarget.method_10264();
            if (var7_3 || var7_3) ** GOTO lbl40
            v24 /* !! */  = gv.nl;
            if (true) ** GOTO lbl164
            block92: while (true) {
                v24 /* !! */  = (long)(v25 - gv.gfcc("ghzx", gfdd(int ), (int)359));
lbl164:
                // 2 sources

                switch ((int)v24 /* !! */ ) {
                    case -1575060241: {
                        v25 = gv.gfcc("ghzz", gfdd(int ), (int)360);
                        continue block92;
                    }
                    case 1185080505: {
                        break block92;
                    }
                    case 1220353897: {
                        v25 = gv.gfcc("giaa", gfdd(int ), (int)361);
                        continue block92;
                    }
                }
                break;
            }
            while (true) {
                if ((v26 /* !! */  = (cfr_temp_6 = gv.nl - gv.gfcc("giab", gfdd(int ), (int)362)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v26 /* !! */  == gv.gfcc("giaf", gfbz(int ), (int)877)) break;
                v26 /* !! */  = (long)gv.gfcc("giai", gfbz(int ), (int)878);
            }
            v27 = gv.mc.field_1724;
            while (true) {
                if ((v28 /* !! */  = (cfr_temp_7 = gv.nl - gv.gfcc("gial", gfdd(int ), (int)363)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v28 /* !! */  == gv.gfcc("giam", gfbz(int ), (int)879)) break;
                v28 /* !! */  = (long)gv.gfcc("gian", gfbz(int ), (int)880);
            }
            v29 = v27.method_23321();
            v30 /* !! */  = gv.nl;
            if (true) ** GOTO lbl189
            block95: while (true) {
                v30 /* !! */  = (long)(gv.gfcc("giav", gfdd(int ), (int)365) - gv.gfcc("giap", gfdd(int ), (int)364));
lbl189:
                // 2 sources

                switch ((int)v30 /* !! */ ) {
                    case -1619257220: {
                        continue block95;
                    }
                    case 1185080505: {
                        break block95;
                    }
                }
                break;
            }
            v31 /* !! */  = gv.nl;
            if (true) ** GOTO lbl198
            block96: while (true) {
                v31 /* !! */  = (long)(v32 - gv.gfcc("giaz", gfdd(int ), (int)366));
lbl198:
                // 2 sources

                switch ((int)v31 /* !! */ ) {
                    case -502244751: {
                        v32 = gv.gfcc("giba", gfdd(int ), (int)367);
                        continue block96;
                    }
                    case 1185080505: {
                        break block96;
                    }
                    case 2042849443: {
                        v32 = gv.gfcc("gibb", gfdd(int ), (int)368);
                        continue block96;
                    }
                }
                break;
            }
            var5_6 = v29 - (double)this.exploreTarget.method_10260();
            if (var7_3 || var7_3) ** GOTO lbl40
            if (!(var1_4 * var1_4 + var5_6 * var5_6 <= gv.gfcc("gibh", gfjl(int ), (int)369))) break block117;
            if (var7_3) ** GOTO lbl40
            while (true) {
                if ((v33 /* !! */  = (cfr_temp_8 = gv.nl - gv.gfcc("gibk", gfdd(int ), (int)370)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v33 /* !! */  == gv.gfcc("gibl", gfbz(int ), (int)881)) break;
                v33 /* !! */  = (long)gv.gfcc("gibq", gfbz(int ), (int)882);
            }
            if (!(Math.abs(var3_5) <= gv.gfcc("gibr", gfjl(int ), (int)371))) break block117;
            if (var7_3) ** GOTO lbl40
            v34 = gv.gfcc("gibs", gfbz(int ), (int)883);
            if (var9_1) {
                throw null;
            }
            ** GOTO lbl230
        }
        if (var7_3) ** GOTO lbl40
        if (var8_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var7_3) ** break;
                ** continue;
                v34 = gv.gfcc("gibu", gfbz(int ), (int)884);
lbl230:
                // 2 sources

                return (boolean)v34;
            }
lbl231:
            // 3 sources

            case 0: {
                var8_2 /* !! */  = (int)gv.gfcc("gibw", gfbz(int ), (int)885);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl277
            }
            case 1: {
                var8_2 /* !! */  = (int)gv.gfcc("giby", gfbz(int ), (int)886);
                if (!var9_1) ** GOTO lbl231
                throw null;
            }
            case 2: {
                var8_2 /* !! */  = (int)gv.gfcc("gibz", gfbz(int ), (int)887);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl259
            }
            case 3: {
                var8_2 /* !! */  = (int)gv.gfcc("gich", gfbz(int ), (int)888);
                if (var9_1) {
                    throw null;
                }
            }
            case 4: {
                var8_2 /* !! */  = (int)gv.gfcc("gick", gfbz(int ), (int)889);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl263
            }
lbl254:
            // 3 sources

            case 5: {
                var8_2 /* !! */  = (int)gv.gfcc("gicn", gfbz(int ), (int)890);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl304
            }
lbl259:
            // 3 sources

            case 6: {
                var8_2 /* !! */  = (int)gv.gfcc("gicp", gfbz(int ), (int)891);
                if (!var9_1) ** GOTO lbl231
                throw null;
            }
lbl263:
            // 2 sources

            case 7: {
                var8_2 /* !! */  = (int)gv.gfcc("gicq", gfbz(int ), (int)892);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl299
            }
lbl268:
            // 3 sources

            case 8: {
                var8_2 /* !! */  = (int)gv.gfcc("gict", gfbz(int ), (int)893);
                if (!var9_1) ** GOTO lbl254
                throw null;
            }
            case 9: {
                var8_2 /* !! */  = (int)gv.gfcc("gicy", gfbz(int ), (int)894);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl285
            }
lbl277:
            // 2 sources

            case 10: {
                var8_2 /* !! */  = (int)gv.gfcc("gidg", gfbz(int ), (int)895);
                if (!var9_1) ** GOTO lbl254
                throw null;
            }
lbl281:
            // 2 sources

            case 11: {
                var8_2 /* !! */  = (int)gv.gfcc("gidj", gfbz(int ), (int)896);
                if (!var9_1) ** GOTO lbl268
                throw null;
            }
lbl285:
            // 2 sources

            case 12: {
                var8_2 /* !! */  = (int)gv.gfcc("gidn", gfbz(int ), (int)897);
                if (!var9_1) ** GOTO lbl259
                throw null;
            }
            case 13: {
                var8_2 /* !! */  = (int)gv.gfcc("gidq", gfbz(int ), (int)898);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl299
            }
            case 14: {
                do {
                    var8_2 /* !! */  = (int)gv.gfcc("gidr", gfbz(int ), (int)899);
                } while (!var9_1);
                throw null;
            }
lbl299:
            // 3 sources

            case 15: {
                var8_2 /* !! */  = (int)gv.gfcc("gids", gfbz(int ), (int)900);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl309
            }
lbl304:
            // 2 sources

            case 16: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_2 /* !! */  = (int)gv.gfcc("gidw", gfbz(int ), (int)901);
                    if (!var9_1) ** GOTO lbl268
                    throw null;
                }
            }
lbl309:
            // 2 sources

            case 17: {
                var8_2 /* !! */  = (int)gv.gfcc("giec", gfbz(int ), (int)902);
                if (!var9_1) ** GOTO lbl281
                throw null;
            }
            case 18: 
        }
        var8_2 /* !! */  = (int)gv.gfcc("gied", gfbz(int ), (int)903);
        ** while (!var9_1)
lbl316:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gqhu() {
        gv.gfcb[1300] = -502934902;
        gv.gfcb[1301] = 484863169;
        gv.gfcb[1302] = 1915388010;
        gv.gfcb[1303] = 1460961582;
        gv.gfcb[1304] = 1871518695;
        gv.gfcb[1305] = 439166326;
        gv.gfcb[1306] = -584280803;
        gv.gfcb[1307] = -997120879;
        gv.gfcb[1308] = -477958530;
        gv.gfcb[1309] = 2056855475;
        gv.gfcb[1310] = 621384303;
        gv.gfcb[1311] = 690121953;
        gv.gfcb[1312] = 1716812271;
        gv.gfcb[1313] = 416563144;
        gv.gfcb[1314] = -1114391230;
        gv.gfcb[1315] = -893278322;
        gv.gfcb[1316] = 479876528;
        gv.gfcb[1317] = -229564993;
        gv.gfcb[1318] = -808366119;
        gv.gfcb[1319] = -1321790078;
        gv.gfcb[1320] = 2140506011;
        gv.gfcb[1321] = 1934811030;
        gv.gfcb[1322] = 454478617;
        gv.gfcb[1323] = 423403163;
        gv.gfcb[1324] = 50069392;
        gv.gfcb[1325] = 1495429180;
        gv.gfcb[1326] = 1882703858;
        gv.gfcb[1327] = 1678658996;
        gv.gfcb[1328] = -373861475;
        gv.gfcb[1329] = -927321431;
        gv.gfcb[1330] = 1648377543;
        gv.gfcb[1331] = 1591871933;
        gv.gfcb[1332] = -294015059;
        gv.gfcb[1333] = 1362284271;
        gv.gfcb[1334] = 643360703;
        gv.gfcb[1335] = 1528555768;
        gv.gfcb[1336] = 1594523499;
        gv.gfcb[1337] = -1890475203;
        gv.gfcb[1338] = 510061084;
        gv.gfcb[1339] = 290889663;
        gv.gfcb[1340] = -1862042892;
        gv.gfcb[1341] = -396323275;
        gv.gfcb[1342] = -177468691;
        gv.gfcb[1343] = 452836286;
        gv.gfcb[1344] = 358176533;
        gv.gfcb[1345] = 987054270;
        gv.gfcb[1346] = 1114102788;
        gv.gfcb[1347] = 881953124;
        gv.gfcb[1348] = -205087998;
        gv.gfcb[1349] = 1527953706;
        gv.gfcb[1350] = -1944760457;
        gv.gfcb[1351] = -160901423;
        gv.gfcb[1352] = -2021990501;
        gv.gfcb[1353] = -1098883680;
        gv.gfcb[1354] = -461614720;
        gv.gfcb[1355] = 2015515121;
        gv.gfcb[1356] = 55956974;
        gv.gfcb[1357] = 1245065811;
        gv.gfcb[1358] = -1259823963;
        gv.gfcb[1359] = -1266338868;
        gv.gfcb[1360] = -1678921216;
        gv.gfcb[1361] = 1616146166;
        gv.gfcb[1362] = 339160088;
        gv.gfcb[1363] = 158387483;
        gv.gfcb[1364] = 692780492;
        gv.gfcb[1365] = 2084695919;
        gv.gfcb[1366] = 1688072288;
        gv.gfcb[1367] = -1855993827;
        gv.gfcb[1368] = -1201661812;
        gv.gfcb[1369] = -913015862;
        gv.gfcb[1370] = 841460280;
        gv.gfcb[1371] = -1493355605;
        gv.gfcb[1372] = 132310582;
        gv.gfcb[1373] = 639703920;
        gv.gfcb[1374] = -1973940298;
        gv.gfcb[1375] = 613854090;
        gv.gfcb[1376] = 563311433;
        gv.gfcb[1377] = -857610344;
        gv.gfcb[1378] = -703946833;
        gv.gfcb[1379] = -233295360;
        gv.gfcb[1380] = 6459592;
        gv.gfcb[1381] = 272765180;
        gv.gfcb[1382] = -757020839;
        gv.gfcb[1383] = 435392169;
        gv.gfcb[1384] = -1718113146;
        gv.gfcb[1385] = -1774711600;
        gv.gfcb[1386] = -1212531150;
        gv.gfcb[1387] = -518109558;
        gv.gfcb[1388] = 1262840228;
        gv.gfcb[1389] = 849419503;
        gv.gfcb[1390] = 301775905;
        gv.gfcb[1391] = -1922137754;
        gv.gfcb[1392] = 156286296;
        gv.gfcb[1393] = -2125434800;
        gv.gfcb[1394] = 205951983;
        gv.gfcb[1395] = -783087231;
        gv.gfcb[1396] = -294108652;
        gv.gfcb[1397] = 1084501355;
        gv.gfcb[1398] = 1016546898;
        gv.gfcb[1399] = -1088343227;
    }

    private static /* synthetic */ void gqff() {
        gv.gfcb[700] = 756848933;
        gv.gfcb[701] = -556136064;
        gv.gfcb[702] = 1235428965;
        gv.gfcb[703] = 1282198196;
        gv.gfcb[704] = 335018535;
        gv.gfcb[705] = -914795026;
        gv.gfcb[706] = 730670345;
        gv.gfcb[707] = -499030637;
        gv.gfcb[708] = 328675769;
        gv.gfcb[709] = 766711484;
        gv.gfcb[710] = -1721193608;
        gv.gfcb[711] = -1108119268;
        gv.gfcb[712] = -419847582;
        gv.gfcb[713] = -1316265953;
        gv.gfcb[714] = -943469081;
        gv.gfcb[715] = -1803495048;
        gv.gfcb[716] = 65087495;
        gv.gfcb[717] = -1829422427;
        gv.gfcb[718] = -1215938473;
        gv.gfcb[719] = 1382880842;
        gv.gfcb[720] = -1163385898;
        gv.gfcb[721] = 852790083;
        gv.gfcb[722] = 1723014938;
        gv.gfcb[723] = 1243226847;
        gv.gfcb[724] = -921574811;
        gv.gfcb[725] = 883812522;
        gv.gfcb[726] = -916440170;
        gv.gfcb[727] = 549209507;
        gv.gfcb[728] = -1170685926;
        gv.gfcb[729] = -1880231459;
        gv.gfcb[730] = 1699672392;
        gv.gfcb[731] = 897473238;
        gv.gfcb[732] = 1645195212;
        gv.gfcb[733] = -600376825;
        gv.gfcb[734] = -691091700;
        gv.gfcb[735] = 1972606592;
        gv.gfcb[736] = 1126906173;
        gv.gfcb[737] = -803872457;
        gv.gfcb[738] = 1032798540;
        gv.gfcb[739] = -802667284;
        gv.gfcb[740] = 288294340;
        gv.gfcb[741] = 228285088;
        gv.gfcb[742] = 246339693;
        gv.gfcb[743] = 30761418;
        gv.gfcb[744] = -1385999619;
        gv.gfcb[745] = -473596646;
        gv.gfcb[746] = 1645900427;
        gv.gfcb[747] = 1931549064;
        gv.gfcb[748] = -2032189446;
        gv.gfcb[749] = -1845476976;
        gv.gfcb[750] = 2095318271;
        gv.gfcb[751] = -1003333126;
        gv.gfcb[752] = 2017016402;
        gv.gfcb[753] = -1518083385;
        gv.gfcb[754] = 1466002856;
        gv.gfcb[755] = 1481482897;
        gv.gfcb[756] = -1544088300;
        gv.gfcb[757] = -1645545143;
        gv.gfcb[758] = -355152314;
        gv.gfcb[759] = 1695310617;
        gv.gfcb[760] = -2039018300;
        gv.gfcb[761] = 175939571;
        gv.gfcb[762] = 1763110669;
        gv.gfcb[763] = -904556817;
        gv.gfcb[764] = -845492229;
        gv.gfcb[765] = 1630259899;
        gv.gfcb[766] = -554963938;
        gv.gfcb[767] = -904246868;
        gv.gfcb[768] = -452248107;
        gv.gfcb[769] = -101251992;
        gv.gfcb[770] = 1451932743;
        gv.gfcb[771] = -363950827;
        gv.gfcb[772] = 1866589691;
        gv.gfcb[773] = -1785886830;
        gv.gfcb[774] = -2133991686;
        gv.gfcb[775] = 1176191773;
        gv.gfcb[776] = 879701426;
        gv.gfcb[777] = -824243152;
        gv.gfcb[778] = 653820007;
        gv.gfcb[779] = 757245555;
        gv.gfcb[780] = 1670567565;
        gv.gfcb[781] = -879882894;
        gv.gfcb[782] = -1138322426;
        gv.gfcb[783] = -1524777397;
        gv.gfcb[784] = -1641689271;
        gv.gfcb[785] = 316942376;
        gv.gfcb[786] = -672509561;
        gv.gfcb[787] = -2107816025;
        gv.gfcb[788] = -2046880612;
        gv.gfcb[789] = -572939349;
        gv.gfcb[790] = -1519857768;
        gv.gfcb[791] = 1168609361;
        gv.gfcb[792] = -1001669508;
        gv.gfcb[793] = -631035;
        gv.gfcb[794] = -2011984911;
        gv.gfcb[795] = -1622021519;
        gv.gfcb[796] = -1286090562;
        gv.gfcb[797] = -1257103683;
        gv.gfcb[798] = 1125805261;
        gv.gfcb[799] = 2040047104;
    }

    /*
     * Exception decompiling
     */
    private void loadRememberedMinecarts() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 34[SWITCH]
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

    private static /* synthetic */ void gpxi() {
        gv.gfca[1000] = -1613441769;
        gv.gfca[1001] = 532912358;
        gv.gfca[1002] = 1357353029;
        gv.gfca[1003] = 724370687;
        gv.gfca[1004] = -2124785497;
        gv.gfca[1005] = 1302089779;
        gv.gfca[1006] = -1275473275;
        gv.gfca[1007] = -739978372;
        gv.gfca[1008] = -1130197543;
        gv.gfca[1009] = -1601196371;
        gv.gfca[1010] = -1199642828;
        gv.gfca[1011] = 812512347;
        gv.gfca[1012] = 1146136895;
        gv.gfca[1013] = -701938470;
        gv.gfca[1014] = 1315496844;
        gv.gfca[1015] = 343560723;
        gv.gfca[1016] = -476892430;
        gv.gfca[1017] = 1481362845;
        gv.gfca[1018] = -173624136;
        gv.gfca[1019] = 82183882;
        gv.gfca[1020] = 403809455;
        gv.gfca[1021] = 494421532;
        gv.gfca[1022] = -1437906046;
        gv.gfca[1023] = 340544950;
        gv.gfca[1024] = 1857611575;
        gv.gfca[1025] = -550371786;
        gv.gfca[1026] = -1940203566;
        gv.gfca[1027] = -369146469;
        gv.gfca[1028] = -833871549;
        gv.gfca[1029] = -839296766;
        gv.gfca[1030] = -1796691191;
        gv.gfca[1031] = -1956781180;
        gv.gfca[1032] = 1821942253;
        gv.gfca[1033] = 705624247;
        gv.gfca[1034] = -1665046239;
        gv.gfca[1035] = -1633867189;
        gv.gfca[1036] = -905733431;
        gv.gfca[1037] = 1050245682;
        gv.gfca[1038] = 469536300;
        gv.gfca[1039] = 247954684;
        gv.gfca[1040] = -458853119;
        gv.gfca[1041] = 35225781;
        gv.gfca[1042] = 1074939060;
        gv.gfca[1043] = -1266171359;
        gv.gfca[1044] = -165262029;
        gv.gfca[1045] = -1858368398;
        gv.gfca[1046] = -1582934497;
        gv.gfca[1047] = -2011248566;
        gv.gfca[1048] = -623695994;
        gv.gfca[1049] = -1376785882;
        gv.gfca[1050] = -1915004494;
        gv.gfca[1051] = -921336314;
        gv.gfca[1052] = 1714159156;
        gv.gfca[1053] = -1584852640;
        gv.gfca[1054] = 1988750054;
        gv.gfca[1055] = -69818010;
        gv.gfca[1056] = 722669034;
        gv.gfca[1057] = -1680735734;
        gv.gfca[1058] = 271574478;
        gv.gfca[1059] = 1359817514;
        gv.gfca[1060] = -858782709;
        gv.gfca[1061] = 1578334450;
        gv.gfca[1062] = 1864888365;
        gv.gfca[1063] = 2118965229;
        gv.gfca[1064] = 1874064394;
        gv.gfca[1065] = -115864571;
        gv.gfca[1066] = -939928949;
        gv.gfca[1067] = -832240128;
        gv.gfca[1068] = 520959495;
        gv.gfca[1069] = 1034716791;
        gv.gfca[1070] = -996644880;
        gv.gfca[1071] = 957147620;
        gv.gfca[1072] = 676828407;
        gv.gfca[1073] = 1763381708;
        gv.gfca[1074] = 577380689;
        gv.gfca[1075] = 1486634222;
        gv.gfca[1076] = 1240165141;
        gv.gfca[1077] = 1508110155;
        gv.gfca[1078] = -1803576277;
        gv.gfca[1079] = -152912355;
        gv.gfca[1080] = 682712588;
        gv.gfca[1081] = 1913082896;
        gv.gfca[1082] = -101826199;
        gv.gfca[1083] = -914688661;
        gv.gfca[1084] = 1193047864;
        gv.gfca[1085] = -562521204;
        gv.gfca[1086] = 0x20662622;
        gv.gfca[1087] = -2078603430;
        gv.gfca[1088] = 339981389;
        gv.gfca[1089] = 187316994;
        gv.gfca[1090] = 623954735;
        gv.gfca[1091] = 1875983420;
        gv.gfca[1092] = 2134662956;
        gv.gfca[1093] = -1013731369;
        gv.gfca[1094] = 1882089624;
        gv.gfca[1095] = 1308054955;
        gv.gfca[1096] = 847166614;
        gv.gfca[1097] = -303218876;
        gv.gfca[1098] = 942913000;
        gv.gfca[1099] = 903490916;
    }

    private static /* synthetic */ void gpuw() {
        gv.gfca[200] = 882991451;
        gv.gfca[201] = -406729050;
        gv.gfca[202] = -1047153368;
        gv.gfca[203] = 444669081;
        gv.gfca[204] = 663557496;
        gv.gfca[205] = 1096453446;
        gv.gfca[206] = 1672553072;
        gv.gfca[207] = 1704105793;
        gv.gfca[208] = 1141511931;
        gv.gfca[209] = 1967311832;
        gv.gfca[210] = -2019697500;
        gv.gfca[211] = -1255975197;
        gv.gfca[212] = -572794044;
        gv.gfca[213] = 1339752156;
        gv.gfca[214] = 1697080279;
        gv.gfca[215] = -530811988;
        gv.gfca[216] = -144597459;
        gv.gfca[217] = -89670689;
        gv.gfca[218] = 248564341;
        gv.gfca[219] = -1866962473;
        gv.gfca[220] = 1825695612;
        gv.gfca[221] = 342766227;
        gv.gfca[222] = -637361459;
        gv.gfca[223] = 1575973282;
        gv.gfca[224] = 803289871;
        gv.gfca[225] = -1474672339;
        gv.gfca[226] = -893456103;
        gv.gfca[227] = 1660440100;
        gv.gfca[228] = 158741450;
        gv.gfca[229] = -1851961017;
        gv.gfca[230] = 420544726;
        gv.gfca[231] = 1541907292;
        gv.gfca[232] = -1737650467;
        gv.gfca[233] = 795838183;
        gv.gfca[234] = 2036942582;
        gv.gfca[235] = -964351169;
        gv.gfca[236] = 1402268771;
        gv.gfca[237] = 1129172348;
        gv.gfca[238] = 1903407230;
        gv.gfca[239] = 1963940455;
        gv.gfca[240] = -903133842;
        gv.gfca[241] = -261069878;
        gv.gfca[242] = -1560738550;
        gv.gfca[243] = 689654875;
        gv.gfca[244] = 362963715;
        gv.gfca[245] = 537820019;
        gv.gfca[246] = 1816280694;
        gv.gfca[247] = -586676546;
        gv.gfca[248] = -917712765;
        gv.gfca[249] = -1177686681;
        gv.gfca[250] = -2088830551;
        gv.gfca[251] = 1784244669;
        gv.gfca[252] = -849865470;
        gv.gfca[253] = -67273287;
        gv.gfca[254] = -1491179145;
        gv.gfca[255] = -608148332;
        gv.gfca[256] = -1574226645;
        gv.gfca[257] = 2053857700;
        gv.gfca[258] = 572286685;
        gv.gfca[259] = 648756199;
        gv.gfca[260] = -197280056;
        gv.gfca[261] = 2039545407;
        gv.gfca[262] = -565539960;
        gv.gfca[263] = 1460796295;
        gv.gfca[264] = 519825388;
        gv.gfca[265] = -1239945580;
        gv.gfca[266] = -1556646880;
        gv.gfca[267] = -794794888;
        gv.gfca[268] = -208633888;
        gv.gfca[269] = 869054979;
        gv.gfca[270] = 1922339296;
        gv.gfca[271] = 706735279;
        gv.gfca[272] = -2034910849;
        gv.gfca[273] = 1653806044;
        gv.gfca[274] = 899493562;
        gv.gfca[275] = 519676854;
        gv.gfca[276] = -348516191;
        gv.gfca[277] = -189900156;
        gv.gfca[278] = -748190258;
        gv.gfca[279] = -1554968271;
        gv.gfca[280] = 368497291;
        gv.gfca[281] = 36882384;
        gv.gfca[282] = 1421023670;
        gv.gfca[283] = -2055839967;
        gv.gfca[284] = -137755056;
        gv.gfca[285] = -1713725243;
        gv.gfca[286] = 672507047;
        gv.gfca[287] = 50292858;
        gv.gfca[288] = 1795015052;
        gv.gfca[289] = -1437980906;
        gv.gfca[290] = 2082098968;
        gv.gfca[291] = -259229573;
        gv.gfca[292] = 1872963271;
        gv.gfca[293] = -1059758078;
        gv.gfca[294] = 403507440;
        gv.gfca[295] = 1043781510;
        gv.gfca[296] = 1845990888;
        gv.gfca[297] = -473569129;
        gv.gfca[298] = -748277760;
        gv.gfca[299] = -67865840;
    }

    private static /* synthetic */ void gpzb() {
        gv.gfca[1300] = -502934888;
        gv.gfca[1301] = 484863177;
        gv.gfca[1302] = 1915388005;
        gv.gfca[1303] = 1460961583;
        gv.gfca[1304] = 1871518709;
        gv.gfca[1305] = 439166324;
        gv.gfca[1306] = -584280801;
        gv.gfca[1307] = -997120874;
        gv.gfca[1308] = -477958538;
        gv.gfca[1309] = 2056855481;
        gv.gfca[1310] = 621384293;
        gv.gfca[1311] = 690121967;
        gv.gfca[1312] = 1716812282;
        gv.gfca[1313] = 416563166;
        gv.gfca[1314] = -1114391214;
        gv.gfca[1315] = -893278330;
        gv.gfca[1316] = 479876518;
        gv.gfca[1317] = -229564994;
        gv.gfca[1318] = -808366136;
        gv.gfca[1319] = -1321790061;
        gv.gfca[1320] = -2140506012;
        gv.gfca[1321] = -217288647;
        gv.gfca[1322] = -454478618;
        gv.gfca[1323] = 1537512410;
        gv.gfca[1324] = 831894501;
        gv.gfca[1325] = 1495429180;
        gv.gfca[1326] = -1882703859;
        gv.gfca[1327] = 1692332533;
        gv.gfca[1328] = 373861474;
        gv.gfca[1329] = 1079483941;
        gv.gfca[1330] = -1648377544;
        gv.gfca[1331] = 1660818987;
        gv.gfca[1332] = 294015058;
        gv.gfca[1333] = 1064509627;
        gv.gfca[1334] = -643360704;
        gv.gfca[1335] = -360515850;
        gv.gfca[1336] = 1594523496;
        gv.gfca[1337] = -1890475205;
        gv.gfca[1338] = 510061077;
        gv.gfca[1339] = 290889655;
        gv.gfca[1340] = -1862042892;
        gv.gfca[1341] = -396323272;
        gv.gfca[1342] = -177468696;
        gv.gfca[1343] = 452836281;
        gv.gfca[1344] = 358176518;
        gv.gfca[1345] = 987054253;
        gv.gfca[1346] = 1114102797;
        gv.gfca[1347] = 881953126;
        gv.gfca[1348] = -205087983;
        gv.gfca[1349] = 1527953706;
        gv.gfca[1350] = -1944760461;
        gv.gfca[1351] = -160901439;
        gv.gfca[1352] = -2021990506;
        gv.gfca[1353] = -1098883670;
        gv.gfca[1354] = -461614719;
        gv.gfca[1355] = 2015515129;
        gv.gfca[1356] = 55956975;
        gv.gfca[1357] = 1245065811;
        gv.gfca[1358] = -1259823964;
        gv.gfca[1359] = -1266338867;
        gv.gfca[1360] = -1678921216;
        gv.gfca[1361] = 1616146155;
        gv.gfca[1362] = 339160078;
        gv.gfca[1363] = 158387469;
        gv.gfca[1364] = 692780501;
        gv.gfca[1365] = 2084695927;
        gv.gfca[1366] = 1688072305;
        gv.gfca[1367] = -1855993827;
        gv.gfca[1368] = -1201661799;
        gv.gfca[1369] = -913015858;
        gv.gfca[1370] = 841460260;
        gv.gfca[1371] = -1493355605;
        gv.gfca[1372] = 132310561;
        gv.gfca[1373] = 639703904;
        gv.gfca[1374] = -1973940293;
        gv.gfca[1375] = 613854102;
        gv.gfca[1376] = 563311450;
        gv.gfca[1377] = -857610346;
        gv.gfca[1378] = -703946832;
        gv.gfca[1379] = -233295331;
        gv.gfca[1380] = 6459590;
        gv.gfca[1381] = 272765158;
        gv.gfca[1382] = -757020856;
        gv.gfca[1383] = 435392163;
        gv.gfca[1384] = -1718113144;
        gv.gfca[1385] = -1774711592;
        gv.gfca[1386] = -1212531150;
        gv.gfca[1387] = -518109542;
        gv.gfca[1388] = 1262840250;
        gv.gfca[1389] = 849419513;
        gv.gfca[1390] = 301775922;
        gv.gfca[1391] = -1922137746;
        gv.gfca[1392] = 156286287;
        gv.gfca[1393] = -2125434799;
        gv.gfca[1394] = -546802239;
        gv.gfca[1395] = 783087230;
        gv.gfca[1396] = 450121115;
        gv.gfca[1397] = 1084501354;
        gv.gfca[1398] = -1632208717;
        gv.gfca[1399] = -1088343228;
    }

    private static /* synthetic */ void gqcj() {
        gv.gfcb[100] = -681725763;
        gv.gfcb[101] = -1951817444;
        gv.gfcb[102] = 1203739849;
        gv.gfcb[103] = -374776854;
        gv.gfcb[104] = 1312121165;
        gv.gfcb[105] = -1615215595;
        gv.gfcb[106] = 339860056;
        gv.gfcb[107] = -702028022;
        gv.gfcb[108] = 1653329047;
        gv.gfcb[109] = -1083720013;
        gv.gfcb[110] = 2142952906;
        gv.gfcb[111] = 1974706505;
        gv.gfcb[112] = -1430886381;
        gv.gfcb[113] = -1369239643;
        gv.gfcb[114] = -866374303;
        gv.gfcb[115] = 1816644610;
        gv.gfcb[116] = -1823956973;
        gv.gfcb[117] = -2073151661;
        gv.gfcb[118] = -35329677;
        gv.gfcb[119] = 977429395;
        gv.gfcb[120] = 317039785;
        gv.gfcb[121] = 1188494830;
        gv.gfcb[122] = -267534410;
        gv.gfcb[123] = 1504319681;
        gv.gfcb[124] = 2076414726;
        gv.gfcb[125] = -1505778917;
        gv.gfcb[126] = -963179187;
        gv.gfcb[127] = -464242550;
        gv.gfcb[128] = -1351708134;
        gv.gfcb[129] = 1119689212;
        gv.gfcb[130] = -1507460501;
        gv.gfcb[131] = 550495800;
        gv.gfcb[132] = 1301420394;
        gv.gfcb[133] = -1082478687;
        gv.gfcb[134] = 1256043958;
        gv.gfcb[135] = -452291864;
        gv.gfcb[136] = -1853598330;
        gv.gfcb[137] = -663850765;
        gv.gfcb[138] = -509237654;
        gv.gfcb[139] = -1885066370;
        gv.gfcb[140] = -1390125702;
        gv.gfcb[141] = 1854989125;
        gv.gfcb[142] = -813173165;
        gv.gfcb[143] = 206911097;
        gv.gfcb[144] = 147032801;
        gv.gfcb[145] = -1385753436;
        gv.gfcb[146] = -1085524425;
        gv.gfcb[147] = -793592975;
        gv.gfcb[148] = 1356028861;
        gv.gfcb[149] = 1747532139;
        gv.gfcb[150] = 1232407715;
        gv.gfcb[151] = 662802911;
        gv.gfcb[152] = -1567020147;
        gv.gfcb[153] = 533419342;
        gv.gfcb[154] = 410030355;
        gv.gfcb[155] = 1225754795;
        gv.gfcb[156] = 559016838;
        gv.gfcb[157] = -272375635;
        gv.gfcb[158] = -1769256539;
        gv.gfcb[159] = 380324796;
        gv.gfcb[160] = 1125854258;
        gv.gfcb[161] = 1031658569;
        gv.gfcb[162] = -284925823;
        gv.gfcb[163] = 1895509642;
        gv.gfcb[164] = -1504160141;
        gv.gfcb[165] = -1923371019;
        gv.gfcb[166] = -1169412478;
        gv.gfcb[167] = -966947856;
        gv.gfcb[168] = 1984164039;
        gv.gfcb[169] = -1417887604;
        gv.gfcb[170] = -1278325733;
        gv.gfcb[171] = 1330564934;
        gv.gfcb[172] = -2064026420;
        gv.gfcb[173] = -445517531;
        gv.gfcb[174] = -1412346760;
        gv.gfcb[175] = -906069329;
        gv.gfcb[176] = -1157072634;
        gv.gfcb[177] = 1008501637;
        gv.gfcb[178] = -2081126685;
        gv.gfcb[179] = 1593687726;
        gv.gfcb[180] = 1718235872;
        gv.gfcb[181] = -390722603;
        gv.gfcb[182] = -1166634391;
        gv.gfcb[183] = 1955034879;
        gv.gfcb[184] = -927034128;
        gv.gfcb[185] = -1263047788;
        gv.gfcb[186] = -1762042456;
        gv.gfcb[187] = 1491772109;
        gv.gfcb[188] = -1697452017;
        gv.gfcb[189] = 698746761;
        gv.gfcb[190] = 851983992;
        gv.gfcb[191] = -189051300;
        gv.gfcb[192] = -1663855667;
        gv.gfcb[193] = -1818238739;
        gv.gfcb[194] = -54119468;
        gv.gfcb[195] = 720521695;
        gv.gfcb[196] = 1032382631;
        gv.gfcb[197] = 1795273207;
        gv.gfcb[198] = -1657792924;
        gv.gfcb[199] = -869369040;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void updateMinecartScanCheckpoint() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gv.nl - gv.gfcc("ggcq", gfdd(int ), (int)183)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == gv.gfcc("ggcr", gfbz(int ), (int)501)) break;
            v0 /* !! */  = (long)gv.gfcc("ggcs", gfbz(int ), (int)502);
        }
        var3_1 = gv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gv.nl - gv.gfcc("ggct", gfdd(int ), (int)184)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == gv.gfcc("ggcu", gfbz(int ), (int)503)) break;
            v1 /* !! */  = (long)gv.gfcc("ggcv", gfbz(int ), (int)504);
        }
        var2_2 /* !! */  = gv.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = gv.nl - gv.gfcc("ggcw", gfdd(int ), (int)185)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == gv.gfcc("ggcx", gfbz(int ), (int)505)) break;
            v2 /* !! */  = (long)gv.gfcc("ggcy", gfbz(int ), (int)506);
        }
        var1_3 = gv.a;
        if (var3_1) {
            throw null;
lbl21:
            // 4 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl21
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = gv.nl - gv.gfcc("ggcz", gfdd(int ), (int)186)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == gv.gfcc("ggda", gfbz(int ), (int)507)) break;
            v3 /* !! */  = (long)gv.gfcc("ggdb", gfbz(int ), (int)508);
        }
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_4 = gv.nl - gv.gfcc("ggdc", gfdd(int ), (int)187)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == gv.gfcc("ggdd", gfbz(int ), (int)509)) break;
            v4 /* !! */  = (long)gv.gfcc("ggde", gfbz(int ), (int)510);
        }
        v5 = gv.mc.field_1724;
        v6 /* !! */  = gv.nl;
        if (true) ** GOTO lbl39
        block24: while (true) {
            v6 /* !! */  = (long)(gv.gfcc("ggdg", gfdd(int ), (int)189) - gv.gfcc("ggdf", gfdd(int ), (int)188));
lbl39:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1602083382: {
                    continue block24;
                }
                case 1185080505: {
                    break block24;
                }
            }
            break;
        }
        v7 = v5.method_24515();
        v8 /* !! */  = gv.nl;
        if (true) ** GOTO lbl49
        block25: while (true) {
            v8 /* !! */  = (long)(gv.gfcc("ggdi", gfdd(int ), (int)191) - gv.gfcc("ggdh", gfdd(int ), (int)190));
lbl49:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1465598953: {
                    continue block25;
                }
                case 1185080505: {
                    break block25;
                }
            }
            break;
        }
        this.lastMinecartScanPos = v7;
        if (var1_3 || var1_3) ** GOTO lbl21
        v9 = gv.gfcc("ggdj", gfjl(int ), (int)192);
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_5 = gv.nl - gv.gfcc("ggdk", gfdd(int ), (int)193)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == gv.gfcc("ggdl", gfbz(int ), (int)511)) break;
            v10 /* !! */  = (long)gv.gfcc("ggdm", gfbz(int ), (int)512);
        }
        this.nextMinecartScanDistance = (double)v9;
        if (var1_3) ** GOTO lbl21
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)gv.gfcc("ggdn", gfbz(int ), (int)513);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl86
            }
lbl75:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)gv.gfcc("ggdo", gfbz(int ), (int)514);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl90
            }
lbl80:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)gv.gfcc("ggdp", gfbz(int ), (int)515);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl98
                    break;
                }
            }
lbl86:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)gv.gfcc("ggdq", gfbz(int ), (int)516);
                if (!var3_1) ** GOTO lbl80
                throw null;
            }
lbl90:
            // 3 sources

            case 4: {
                var2_2 /* !! */  = (int)gv.gfcc("ggdr", gfbz(int ), (int)517);
                if (!var3_1) ** GOTO lbl75
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)gv.gfcc("ggds", gfbz(int ), (int)518);
                if (!var3_1) ** GOTO lbl75
                throw null;
            }
lbl98:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)gv.gfcc("ggdt", gfbz(int ), (int)519);
                if (!var3_1) ** GOTO lbl90
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)gv.gfcc("ggdu", gfbz(int ), (int)520);
        ** while (!var3_1)
lbl105:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean isHealFood(class_1792 var1_1) {
        block116: {
            v0 /* !! */  = gv.nl;
            block73: while (true) {
                switch ((int)v0 /* !! */ ) {
                    case -604451296: {
                        v0 /* !! */  = (long)(gv.gfcc("gkwc", gfdd(int ), (int)482) - gv.gfcc("gkwa", gfdd(int ), (int)481));
                        continue block73;
                    }
                    case 1185080505: {
                        break block73;
                    }
                }
                break;
            }
            var4_2 = gv.c;
            while (true) {
                block117: {
                    if ((v1 /* !! */  = (cfr_temp_1 = gv.nl - gv.gfcc("gkwd", gfdd(int ), (int)483)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v1 /* !! */  != gv.gfcc("gkwe", gfbz(int ), (int)1252)) break block117;
                    var3_3 /* !! */  = gv.b;
                    v2 /* !! */  = gv.nl;
                    if (true) ** GOTO lbl22
                }
                v1 /* !! */  = (long)gv.gfcc("gkwg", gfbz(int ), (int)1253);
            }
            block75: while (true) {
                v2 /* !! */  = (long)(v3 - gv.gfcc("gkwi", gfdd(int ), (int)484));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -627589082: {
                        v3 = gv.gfcc("gkwj", gfdd(int ), (int)485);
                        continue block75;
                    }
                    case -538920263: {
                        v3 = gv.gfcc("gkwl", gfdd(int ), (int)486);
                        continue block75;
                    }
                    case 1185080505: {
                        break block75;
                    }
                    case 1359655790: {
                        v3 = gv.gfcc("gkwo", gfdd(int ), (int)487);
                        continue block75;
                    }
                }
                break;
            }
            var2_4 = gv.a;
            if (var4_2) {
                throw null;
            }
            if (var2_4 || var2_4) return (boolean)gv.gfcc("gkwp", gfbz(int ), (int)1254);
            v4 /* !! */  = gv.nl;
            if (true) ** GOTO lbl42
            block76: while (true) {
                v4 /* !! */  = (long)(v5 - gv.gfcc("gkwq", gfdd(int ), (int)488));
lbl42:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -1710979916: {
                        v5 = gv.gfcc("gkws", gfdd(int ), (int)489);
                        continue block76;
                    }
                    case -1013751600: {
                        v5 = gv.gfcc("gkwt", gfdd(int ), (int)490);
                        continue block76;
                    }
                    case 1185080505: {
                        break block76;
                    }
                    case 1690421195: {
                        v5 = gv.gfcc("gkwv", gfdd(int ), (int)491);
                        continue block76;
                    }
                }
                break;
            }
            if (var1_1 == class_1802.field_8071) ** GOTO lbl194
            if (var2_4) return (boolean)gv.gfcc("gkwp", gfbz(int ), (int)1254);
            v6 /* !! */  = gv.nl;
            block77: while (true) {
                switch ((int)v6 /* !! */ ) {
                    case -2139312143: {
                        v6 /* !! */  = (long)(gv.gfcc("gkxc", gfdd(int ), (int)493) - gv.gfcc("gkwx", gfdd(int ), (int)492));
                        continue block77;
                    }
                    case 1185080505: {
                        break block77;
                    }
                }
                break;
            }
            if (var1_1 == class_1802.field_8176) ** GOTO lbl194
            if (var2_4) return (boolean)gv.gfcc("gkwp", gfbz(int ), (int)1254);
            v7 /* !! */  = gv.nl;
            block78: while (true) {
                switch ((int)v7 /* !! */ ) {
                    case 1185080505: {
                        break block78;
                    }
                    case 1871567512: {
                        v7 /* !! */  = (long)(gv.gfcc("gkxe", gfdd(int ), (int)495) - gv.gfcc("gkxd", gfdd(int ), (int)494));
                        continue block78;
                    }
                }
                break;
            }
            if (var1_1 == class_1802.field_8046) ** GOTO lbl194
            if (var2_4) return (boolean)gv.gfcc("gkwp", gfbz(int ), (int)1254);
            v8 /* !! */  = gv.nl;
            block79: while (true) {
                switch ((int)v8 /* !! */ ) {
                    case -1102516293: {
                        v8 /* !! */  = (long)(gv.gfcc("gkxh", gfdd(int ), (int)497) - gv.gfcc("gkxf", gfdd(int ), (int)496));
                        continue block79;
                    }
                    case 1185080505: {
                        break block79;
                    }
                }
                break;
            }
            if (var1_1 == class_1802.field_8261) ** GOTO lbl194
            if (var2_4) return (boolean)gv.gfcc("gkwp", gfbz(int ), (int)1254);
            while (true) {
                block118: {
                    if ((v9 /* !! */  = (cfr_temp_2 = gv.nl - gv.gfcc("gkxj", gfdd(int ), (int)498)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v9 /* !! */  != gv.gfcc("gkxk", gfbz(int ), (int)1255)) break block118;
                    if (var1_1 != class_1802.field_8389) {
                        break;
                    }
                    ** GOTO lbl194
                }
                v9 /* !! */  = (long)gv.gfcc("gkxo", gfbz(int ), (int)1256);
            }
            if (var2_4) return (boolean)gv.gfcc("gkwp", gfbz(int ), (int)1254);
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block81: do {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        v10 /* !! */  = gv.nl;
                        block82: while (true) {
                            switch ((int)v10 /* !! */ ) {
                                case -784674106: {
                                    v11 = gv.gfcc("gkxq", gfdd(int ), (int)500);
                                    ** GOTO lbl112
                                }
                                case 1185080505: {
                                    break block82;
                                }
                                case 1426898690: {
                                    v11 = gv.gfcc("gkxr", gfdd(int ), (int)501);
lbl112:
                                    // 2 sources

                                    v10 /* !! */  = (long)(v11 - gv.gfcc("gkxp", gfdd(int ), (int)499));
                                    continue block82;
                                }
                            }
                            break;
                        }
                        if (var1_1 == class_1802.field_8544) ** GOTO lbl194
                        if (var2_4) return (boolean)gv.gfcc("gkwp", gfbz(int ), (int)1254);
                        while (true) {
                            if ((v12 /* !! */  = (cfr_temp_3 = gv.nl - gv.gfcc("gkxu", gfdd(int ), (int)502)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v12 /* !! */  != gv.gfcc("gkxw", gfbz(int ), (int)1257)) ** GOTO lbl123
                            if (var1_1 != class_1802.field_8726) {
                                break;
                            }
                            ** GOTO lbl194
lbl123:
                            // 1 sources

                            v12 /* !! */  = (long)gv.gfcc("gkyb", gfbz(int ), (int)1258);
                        }
                        if (var2_4) return (boolean)gv.gfcc("gkwp", gfbz(int ), (int)1254);
                        v13 /* !! */  = gv.nl;
                        block84: while (true) {
                            switch ((int)v13 /* !! */ ) {
                                case 1011722614: {
                                    v14 = gv.gfcc("gkyf", gfdd(int ), (int)504);
                                    ** GOTO lbl139
                                }
                                case 1185080505: {
                                    break block84;
                                }
                                case 1209134711: {
                                    v14 = gv.gfcc("gkyg", gfdd(int ), (int)505);
                                    ** GOTO lbl139
                                }
                                case 1446823400: {
                                    v14 = gv.gfcc("gkyh", gfdd(int ), (int)506);
lbl139:
                                    // 3 sources

                                    v13 /* !! */  = (long)(v14 - gv.gfcc("gkye", gfdd(int ), (int)503));
                                    continue block84;
                                }
                            }
                            break;
                        }
                        if (var1_1 == class_1802.field_8347) ** GOTO lbl194
                        if (var2_4) return (boolean)gv.gfcc("gkwp", gfbz(int ), (int)1254);
                        while (true) {
                            if ((v15 /* !! */  = (cfr_temp_4 = gv.nl - gv.gfcc("gkyj", gfdd(int ), (int)507)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v15 /* !! */  != gv.gfcc("gkyl", gfbz(int ), (int)1259)) ** GOTO lbl150
                            if (var1_1 != class_1802.field_8748) {
                                break;
                            }
                            ** GOTO lbl194
lbl150:
                            // 1 sources

                            v15 /* !! */  = (long)gv.gfcc("gkyp", gfbz(int ), (int)1260);
                        }
                        if (var2_4) return (boolean)gv.gfcc("gkwp", gfbz(int ), (int)1254);
                        v16 /* !! */  = gv.nl;
                        block86: while (true) {
                            switch ((int)v16 /* !! */ ) {
                                case -702896569: {
                                    v17 = gv.gfcc("gkyr", gfdd(int ), (int)509);
                                    ** GOTO lbl166
                                }
                                case -638674828: {
                                    v17 = gv.gfcc("gkyt", gfdd(int ), (int)510);
                                    ** GOTO lbl166
                                }
                                case 1185080505: {
                                    break block86;
                                }
                                case 1436525428: {
                                    v17 = gv.gfcc("gkyv", gfdd(int ), (int)511);
lbl166:
                                    // 3 sources

                                    v16 /* !! */  = (long)(v17 - gv.gfcc("gkyq", gfdd(int ), (int)508));
                                    continue block86;
                                }
                            }
                            break;
                        }
                        if (var1_1 == class_1802.field_8752) ** GOTO lbl194
                        if (var2_4) return (boolean)gv.gfcc("gkwp", gfbz(int ), (int)1254);
                        while (true) {
                            if ((v18 /* !! */  = (cfr_temp_5 = gv.nl - gv.gfcc("gkyy", gfdd(int ), (int)512)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v18 /* !! */  != gv.gfcc("gkyz", gfbz(int ), (int)1261)) ** GOTO lbl177
                            if (var1_1 != class_1802.field_8504) {
                                break;
                            }
                            ** GOTO lbl194
lbl177:
                            // 1 sources

                            v18 /* !! */  = (long)gv.gfcc("gkzc", gfbz(int ), (int)1262);
                        }
                        if (var2_4) return (boolean)gv.gfcc("gkwp", gfbz(int ), (int)1254);
                        v19 /* !! */  = gv.nl;
                        block88: while (true) {
                            switch ((int)v19 /* !! */ ) {
                                case -440496155: {
                                    v20 = gv.gfcc("gkzf", gfdd(int ), (int)514);
                                    ** GOTO lbl188
                                }
                                case -240229016: {
                                    v20 = gv.gfcc("gkzg", gfdd(int ), (int)515);
lbl188:
                                    // 2 sources

                                    v19 /* !! */  = (long)(v20 - gv.gfcc("gkze", gfdd(int ), (int)513));
                                    continue block88;
                                }
                                case 1185080505: {
                                    break block88;
                                }
                            }
                            break;
                        }
                        if (var1_1 != class_1802.field_8511) ** GOTO lbl198
                        if (var2_4) return (boolean)gv.gfcc("gkwp", gfbz(int ), (int)1254);
lbl194:
                        // 12 sources

                        if (var2_4 || var2_4) return (boolean)gv.gfcc("gkwp", gfbz(int ), (int)1254);
                        v21 = gv.gfcc("gkzh", gfbz(int ), (int)1263);
                        if (!var4_2) return (boolean)v21;
                        throw null;
lbl198:
                        // 1 sources

                        if (var2_4 || var2_4) {
                            return (boolean)gv.gfcc("gkwp", gfbz(int ), (int)1254);
                        }
                        v21 = gv.gfcc("gkzj", gfbz(int ), (int)1264);
                        return (boolean)v21;
                    }
                    case 0: {
                        var3_3 /* !! */  = (int)gv.gfcc("gkzl", gfbz(int ), (int)1265);
                        cfr_temp_0 = 13;
                        if (!var4_2) continue block81;
                        throw null;
                    }
                    case 3: {
                        var3_3 /* !! */  = (int)gv.gfcc("gkzt", gfbz(int ), (int)1268);
                        if (!var4_2) ** break;
                        throw null;
                    }
                    case 5: {
                        var3_3 /* !! */  = (int)gv.gfcc("gkzw", gfbz(int ), (int)1270);
                        cfr_temp_0 = 14;
                        if (!var4_2) continue block81;
                        throw null;
                    }
                    case 9: {
                        var3_3 /* !! */  = (int)gv.gfcc("glag", gfbz(int ), (int)1274);
                        cfr_temp_0 = 8;
                        if (!var4_2) continue block81;
                        throw null;
                    }
                    case 11: {
                        var3_3 /* !! */  = (int)gv.gfcc("glaj", gfbz(int ), (int)1276);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 2: {
                        var3_3 /* !! */  = (int)gv.gfcc("gkzs", gfbz(int ), (int)1267);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 10: {
                        var3_3 /* !! */  = (int)gv.gfcc("glah", gfbz(int ), (int)1275);
                        cfr_temp_0 = 1;
                        if (!var4_2) continue block81;
                        throw null;
                    }
                    case 12: {
                        var3_3 /* !! */  = (int)gv.gfcc("glal", gfbz(int ), (int)1277);
                        cfr_temp_0 = 15;
                        if (!var4_2) continue block81;
                        throw null;
                    }
                    case 13: {
                        var3_3 /* !! */  = (int)gv.gfcc("glan", gfbz(int ), (int)1278);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 1: {
                        var3_3 /* !! */  = (int)gv.gfcc("gkzr", gfbz(int ), (int)1266);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 8: {
                        var3_3 /* !! */  = (int)gv.gfcc("glaf", gfbz(int ), (int)1273);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 4: {
                        var3_3 /* !! */  = (int)gv.gfcc("gkzu", gfbz(int ), (int)1269);
                        cfr_temp_0 = 17;
                        if (!var4_2) continue block81;
                        throw null;
                    }
                    case 14: {
                        var3_3 /* !! */  = (int)gv.gfcc("glap", gfbz(int ), (int)1279);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 16: {
                        var3_3 /* !! */  = (int)gv.gfcc("glat", gfbz(int ), (int)1281);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 6: {
                        ** break;
                    }
                    case 18: {
                        var3_3 /* !! */  = (int)gv.gfcc("glbb", gfbz(int ), (int)1283);
                        cfr_temp_0 = 15;
                        if (!var4_2) continue block81;
                        throw null;
                    }
                    case 19: {
                        var3_3 /* !! */  = (int)gv.gfcc("glbc", gfbz(int ), (int)1284);
                        if (!var4_2) ** break;
                        throw null;
                    }
                    case 20: {
                        break block116;
                    }
lbl277:
                    // 2 sources

                    while (true) {
                        var3_3 /* !! */  = (int)gv.gfcc("gkzy", gfbz(int ), (int)1271);
                        cfr_temp_0 = 17;
                        if (!var4_2) continue block81;
                        throw null;
                    }
                    case 17: {
                        var3_3 /* !! */  = (int)gv.gfcc("glaw", gfbz(int ), (int)1282);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 7: {
                        var3_3 /* !! */  = (int)gv.gfcc("glaa", gfbz(int ), (int)1272);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 15: 
                }
                break;
            } while (true);
            var3_3 /* !! */  = (int)gv.gfcc("glas", gfbz(int ), (int)1280);
            if (!var4_2) ** break;
            throw null;
        }
        var3_3 /* !! */  = (int)gv.gfcc("glbd", gfbz(int ), (int)1285);
        ** while (!var4_2)
lbl299:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void pathToExplore(class_2338 var1_1) {
        v0 /* !! */  = gv.nl;
        if (true) ** GOTO lbl5
        block72: while (true) {
            v0 /* !! */  = (long)(gv.gfcc("ghkm", gfdd(int ), (int)287) - gv.gfcc("ghkl", gfdd(int ), (int)286));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1185080505: {
                    break block72;
                }
                case 1372192173: {
                    continue block72;
                }
            }
            break;
        }
        var5_2 = gv.c;
        v1 /* !! */  = gv.nl;
        if (true) ** GOTO lbl15
        block73: while (true) {
            v1 /* !! */  = (long)(v2 - gv.gfcc("ghkn", gfdd(int ), (int)288));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1570830924: {
                    v2 = gv.gfcc("ghko", gfdd(int ), (int)289);
                    continue block73;
                }
                case 75842785: {
                    v2 = gv.gfcc("ghkp", gfdd(int ), (int)290);
                    continue block73;
                }
                case 1185080505: {
                    break block73;
                }
            }
            break;
        }
        var4_3 /* !! */  = gv.b;
        v3 /* !! */  = gv.nl;
        if (true) ** GOTO lbl29
        block74: while (true) {
            v3 /* !! */  = (long)(gv.gfcc("ghks", gfdd(int ), (int)292) - gv.gfcc("ghkq", gfdd(int ), (int)291));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1194430916: {
                    continue block74;
                }
                case 1185080505: {
                    break block74;
                }
            }
            break;
        }
        var3_4 = gv.a;
        if (var5_2) {
            throw null;
lbl37:
            // 8 sources

            return;
        }
        if (var3_4 || var3_4) ** GOTO lbl37
        v4 /* !! */  = gv.nl;
        if (true) ** GOTO lbl44
        block76: while (true) {
            v4 /* !! */  = (long)(v5 - gv.gfcc("ghkt", gfdd(int ), (int)293));
lbl44:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 302070657: {
                    v5 = gv.gfcc("ghku", gfdd(int ), (int)294);
                    continue block76;
                }
                case 1185080505: {
                    break block76;
                }
                case 2036552958: {
                    v5 = gv.gfcc("ghkv", gfdd(int ), (int)295);
                    continue block76;
                }
            }
            break;
        }
        v6 = this.key(var1_1);
        v7 /* !! */  = gv.nl;
        if (true) ** GOTO lbl58
        block77: while (true) {
            v7 /* !! */  = (long)(v8 - gv.gfcc("ghkw", gfdd(int ), (int)296));
lbl58:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1086935139: {
                    v8 = gv.gfcc("ghkx", gfdd(int ), (int)297);
                    continue block77;
                }
                case -754188906: {
                    v8 = gv.gfcc("ghky", gfdd(int ), (int)298);
                    continue block77;
                }
                case 1185080505: {
                    break block77;
                }
                case 2005600684: {
                    v8 = gv.gfcc("ghkz", gfdd(int ), (int)299);
                    continue block77;
                }
            }
            break;
        }
        var2_5 = "explore:" + v6;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4 || var3_4) ** GOTO lbl37
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_0 = gv.nl - gv.gfcc("ghlb", gfdd(int ), (int)300)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == gv.gfcc("ghlw", gfbz(int ), (int)768)) break;
                    v9 /* !! */  = (long)gv.gfcc("ghlx", gfbz(int ), (int)769);
                }
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_1 = gv.nl - gv.gfcc("ghly", gfdd(int ), (int)301)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == gv.gfcc("ghmd", gfbz(int ), (int)770)) break;
                    v10 /* !! */  = (long)gv.gfcc("ghme", gfbz(int ), (int)771);
                }
                if (!var2_5.equals(this.currentPathKey)) ** GOTO lbl112
                if (var3_4) ** GOTO lbl37
                v11 /* !! */  = gv.nl;
                if (true) ** GOTO lbl91
                block80: while (true) {
                    v11 /* !! */  = (long)(v12 - gv.gfcc("ghmg", gfdd(int ), (int)302));
lbl91:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1227176911: {
                            v12 = gv.gfcc("ghmi", gfdd(int ), (int)303);
                            continue block80;
                        }
                        case 208106838: {
                            v12 = gv.gfcc("ghmj", gfdd(int ), (int)304);
                            continue block80;
                        }
                        case 1185080505: {
                            break block80;
                        }
                        case 2073727855: {
                            v12 = gv.gfcc("ghml", gfdd(int ), (int)305);
                            continue block80;
                        }
                    }
                    break;
                }
                v13 = gv.gfcc("ghmm", gfjl(int ), (int)306);
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_2 = gv.nl - gv.gfcc("ghmq", gfdd(int ), (int)307)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == gv.gfcc("ghmr", gfbz(int ), (int)772)) break;
                    v14 /* !! */  = (long)gv.gfcc("ghms", gfbz(int ), (int)773);
                }
                if (this.pathTimer.finished((double)v13)) ** GOTO lbl112
                if (var3_4 || var3_4) ** GOTO lbl37
                return;
lbl112:
                // 2 sources

                if (var3_4 || var3_4) ** GOTO lbl37
                v15 /* !! */  = gv.nl;
                if (true) ** GOTO lbl117
                block82: while (true) {
                    v15 /* !! */  = (long)(v16 - gv.gfcc("ghmt", gfdd(int ), (int)308));
lbl117:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1592972774: {
                            v16 = gv.gfcc("ghmu", gfdd(int ), (int)309);
                            continue block82;
                        }
                        case 157163295: {
                            v16 = gv.gfcc("ghmv", gfdd(int ), (int)310);
                            continue block82;
                        }
                        case 1185080505: {
                            break block82;
                        }
                    }
                    break;
                }
                v17 = BaritoneAPI.getProvider();
                v18 /* !! */  = gv.nl;
                if (true) ** GOTO lbl131
                block83: while (true) {
                    v18 /* !! */  = (long)(v19 - gv.gfcc("ghmw", gfdd(int ), (int)311));
lbl131:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case 313757709: {
                            v19 = gv.gfcc("ghnc", gfdd(int ), (int)312);
                            continue block83;
                        }
                        case 320912119: {
                            v19 = gv.gfcc("ghnd", gfdd(int ), (int)313);
                            continue block83;
                        }
                        case 1185080505: {
                            break block83;
                        }
                    }
                    break;
                }
                v20 = v17.getPrimaryBaritone();
                v21 /* !! */  = gv.nl;
                if (true) ** GOTO lbl145
                block84: while (true) {
                    v21 /* !! */  = (long)(v22 - gv.gfcc("ghnf", gfdd(int ), (int)314));
lbl145:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -210280085: {
                            v22 = gv.gfcc("ghnh", gfdd(int ), (int)315);
                            continue block84;
                        }
                        case 614692324: {
                            v22 = gv.gfcc("ghni", gfdd(int ), (int)316);
                            continue block84;
                        }
                        case 1185080505: {
                            break block84;
                        }
                        case 1894401977: {
                            v22 = gv.gfcc("ghnj", gfdd(int ), (int)317);
                            continue block84;
                        }
                    }
                    break;
                }
                v23 = v20.getCustomGoalProcess();
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_3 = gv.nl - gv.gfcc("ghnm", gfdd(int ), (int)318)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == gv.gfcc("ghno", gfbz(int ), (int)774)) break;
                    v24 /* !! */  = (long)gv.gfcc("ghnp", gfbz(int ), (int)775);
                }
                v25 = gv.gfcc("ghnr", gfbz(int ), (int)776);
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_4 = gv.nl - gv.gfcc("ghnt", gfdd(int ), (int)319)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v26 /* !! */  == gv.gfcc("ghnu", gfbz(int ), (int)777)) break;
                    v26 /* !! */  = (long)gv.gfcc("ghnw", gfbz(int ), (int)778);
                }
                v27 = new GoalNear(var1_1, (int)v25);
                v28 /* !! */  = gv.nl;
                if (true) ** GOTO lbl174
                block87: while (true) {
                    v28 /* !! */  = (long)(v29 - gv.gfcc("ghny", gfdd(int ), (int)320));
lbl174:
                    // 2 sources

                    switch ((int)v28 /* !! */ ) {
                        case -1631063203: {
                            v29 = gv.gfcc("ghnz", gfdd(int ), (int)321);
                            continue block87;
                        }
                        case -901011424: {
                            v29 = gv.gfcc("ghob", gfdd(int ), (int)322);
                            continue block87;
                        }
                        case 1185080505: {
                            break block87;
                        }
                        case 1798140201: {
                            v29 = gv.gfcc("ghoc", gfdd(int ), (int)323);
                            continue block87;
                        }
                    }
                    break;
                }
                v23.setGoalAndPath((Goal)v27);
                if (var3_4 || var3_4) ** GOTO lbl37
                while (true) {
                    if ((v30 /* !! */  = (cfr_temp_5 = gv.nl - gv.gfcc("ghof", gfdd(int ), (int)324)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v30 /* !! */  == gv.gfcc("ghog", gfbz(int ), (int)779)) break;
                    v30 /* !! */  = (long)gv.gfcc("ghoi", gfbz(int ), (int)780);
                }
                this.currentPathKey = var2_5;
                if (var3_4 || var3_4) ** GOTO lbl37
                while (true) {
                    if ((v31 /* !! */  = (cfr_temp_6 = gv.nl - gv.gfcc("ghom", gfdd(int ), (int)325)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v31 /* !! */  == gv.gfcc("ghon", gfbz(int ), (int)781)) break;
                    v31 /* !! */  = (long)gv.gfcc("ghoo", gfbz(int ), (int)782);
                }
                while (true) {
                    if ((v32 /* !! */  = (cfr_temp_7 = gv.nl - gv.gfcc("ghop", gfdd(int ), (int)326)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v32 /* !! */  == gv.gfcc("ghor", gfbz(int ), (int)783)) break;
                    v32 /* !! */  = (long)gv.gfcc("ghos", gfbz(int ), (int)784);
                }
                this.pathTimer.reset();
                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return;
            }
lbl209:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)gv.gfcc("ghou", gfbz(int ), (int)785);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl281
            }
            case 1: {
                var4_3 /* !! */  = (int)gv.gfcc("ghox", gfbz(int ), (int)786);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl251
            }
lbl219:
            // 2 sources

            case 2: {
                var4_3 /* !! */  = (int)gv.gfcc("ghoy", gfbz(int ), (int)787);
                if (!var5_2) break;
                throw null;
            }
lbl223:
            // 2 sources

            case 3: {
                var4_3 /* !! */  = (int)gv.gfcc("ghoz", gfbz(int ), (int)788);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl265
            }
lbl228:
            // 2 sources

            case 4: {
                var4_3 /* !! */  = (int)gv.gfcc("ghpa", gfbz(int ), (int)789);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl277
            }
lbl233:
            // 3 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)gv.gfcc("ghpb", gfbz(int ), (int)790);
                    if (!var5_2) ** GOTO lbl219
                    throw null;
                }
            }
lbl238:
            // 2 sources

            case 6: {
                var4_3 /* !! */  = (int)gv.gfcc("ghpc", gfbz(int ), (int)791);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl273
            }
            case 7: {
                var4_3 /* !! */  = (int)gv.gfcc("ghpd", gfbz(int ), (int)792);
                if (!var5_2) ** GOTO lbl223
                throw null;
            }
            case 8: {
                var4_3 /* !! */  = (int)gv.gfcc("ghph", gfbz(int ), (int)793);
                if (!var5_2) break;
                throw null;
            }
lbl251:
            // 2 sources

            case 9: {
                var4_3 /* !! */  = (int)gv.gfcc("ghpi", gfbz(int ), (int)794);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl269
            }
            case 10: {
                var4_3 /* !! */  = (int)gv.gfcc("ghpj", gfbz(int ), (int)795);
                if (!var5_2) ** GOTO lbl233
                throw null;
            }
            case 11: {
                var4_3 /* !! */  = (int)gv.gfcc("ghpk", gfbz(int ), (int)796);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl273
            }
lbl265:
            // 2 sources

            case 12: {
                var4_3 /* !! */  = (int)gv.gfcc("ghpm", gfbz(int ), (int)797);
                if (!var5_2) ** GOTO lbl238
                throw null;
            }
lbl269:
            // 2 sources

            case 13: {
                var4_3 /* !! */  = (int)gv.gfcc("ghpp", gfbz(int ), (int)798);
                if (!var5_2) ** GOTO lbl233
                throw null;
            }
lbl273:
            // 3 sources

            case 14: {
                var4_3 /* !! */  = (int)gv.gfcc("ghpq", gfbz(int ), (int)799);
                if (!var5_2) break;
                throw null;
            }
lbl277:
            // 2 sources

            case 15: {
                var4_3 /* !! */  = (int)gv.gfcc("ghpv", gfbz(int ), (int)800);
                if (!var5_2) ** GOTO lbl228
                throw null;
            }
lbl281:
            // 2 sources

            case 16: {
                var4_3 /* !! */  = (int)gv.gfcc("ghpw", gfbz(int ), (int)801);
                if (!var5_2) ** GOTO lbl209
                throw null;
            }
            case 17: 
        }
        var4_3 /* !! */  = (int)gv.gfcc("ghpz", gfbz(int ), (int)802);
        ** while (!var5_2)
lbl288:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public gv() {
        var2_1 /* !! */  = gv.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block23: while (true) {
            block25: {
                switch (cfr_temp_0 == -2147483648 ? var2_1 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        super("RwKeyFinder", "\u0418\u0449\u0435\u0442 \u0432\u0430\u0433\u043e\u043d\u0435\u0442\u043a\u0438 \u0441 \u0441\u0443\u043d\u0434\u0443\u043a\u043e\u043c \u0447\u0435\u0440\u0435\u0437 Baritone", du.PLAYER);
                        this.loot = new ke("\u0427\u0442\u043e \u043b\u0443\u0442\u0430\u0442\u044c?", "\u041f\u0440\u0435\u0434\u043c\u0435\u0442\u044b, \u043a\u043e\u0442\u043e\u0440\u044b\u0435 \u043d\u0443\u0436\u043d\u043e \u0437\u0430\u0431\u0438\u0440\u0430\u0442\u044c").value(new String[]{"\u0427\u0430\u0440\u043a\u0438", "\u041a\u043b\u044e\u0447-\u041a\u0430\u0440\u0442\u044b"}).selected(new String[]{"\u0427\u0430\u0440\u043a\u0438", "\u041a\u043b\u044e\u0447-\u041a\u0430\u0440\u0442\u044b"});
                        this.rememberLooted = new kb("\u0417\u0430\u043f\u043e\u043c\u0438\u043d\u0430\u0442\u044c \u043e\u0431\u043b\u0443\u0442\u0430\u043d\u043d\u044b\u0435", "\u041d\u0435 \u0432\u043e\u0437\u0432\u0440\u0430\u0449\u0430\u0442\u044c\u0441\u044f \u043a \u0443\u0436\u0435 \u043f\u0440\u043e\u0432\u0435\u0440\u0435\u043d\u043d\u044b\u043c \u0432\u0430\u0433\u043e\u043d\u0435\u0442\u043a\u0430\u043c").setValue((boolean)gv.gfcc("gfcd", gfbz(int ), (int)0));
                        this.autoLeave = new kb("Auto leave (hub)", "\u0412\u044b\u0445\u043e\u0434\u0438\u0442\u044c \u0432 \u0445\u0430\u0431 \u043f\u0440\u0438 \u043f\u043e\u044f\u0432\u043b\u0435\u043d\u0438\u0438 \u0438\u0433\u0440\u043e\u043a\u0430 \u0440\u044f\u0434\u043e\u043c");
                        this.leaveRadius = new kg("\u0420\u0430\u0434\u0438\u0443\u0441 \u043e\u0431\u043d\u0430\u0440\u0443\u0436\u0435\u043d\u0438\u044f", "\u0414\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f \u0441\u0440\u0430\u0431\u0430\u0442\u044b\u0432\u0430\u043d\u0438\u044f Auto leave", (float)gv.gfcc("gfcf", gfce(int ), (int)1)).range((int)gv.gfcc("gfcg", gfbz(int ), (int)2), (int)gv.gfcc("gfch", gfbz(int ), (int)3)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, isValue(), ()Ljava/lang/Boolean;)((kb)this.autoLeave));
                        this.autoInvest = new kb("Auto invest", "\u0421\u043a\u043b\u0430\u0434\u044b\u0432\u0430\u0442\u044c \u043d\u0430\u0439\u0434\u0435\u043d\u043d\u044b\u0435 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u044b \u0432 \u044d\u043d\u0434\u0435\u0440-\u0441\u0443\u043d\u0434\u0443\u043a");
                        this.autoHeal = new kb("Auto heal", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0435\u0441\u0442\u044c \u043f\u0440\u0438 \u043d\u0438\u0437\u043a\u043e\u043c \u0437\u0434\u043e\u0440\u043e\u0432\u044c\u0435");
                        this.autoFix = new kb("Auto fix", "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c /fix all \u0434\u043b\u044f \u043f\u043e\u0432\u0440\u0435\u0436\u0434\u0451\u043d\u043d\u043e\u0439 \u043a\u0438\u0440\u043a\u0438");
                        this.dropTrash = new kb("\u0412\u044b\u043a\u0438\u0434\u044b\u0432\u0430\u0442\u044c \u043c\u0443\u0441\u043e\u0440", "\u041e\u0441\u0432\u043e\u0431\u043e\u0436\u0434\u0430\u0442\u044c \u043c\u0435\u0441\u0442\u043e, \u0432\u044b\u0431\u0440\u0430\u0441\u044b\u0432\u0430\u044f \u0431\u0443\u043b\u044b\u0436\u043d\u0438\u043a");
                        this.pathTimer = new pr();
                        this.clickTimer = new pr();
                        this.interactTimer = new pr();
                        this.leaveTimer = new pr();
                        this.fixTimer = new pr();
                        this.rememberedMinecarts = new HashSet<String>();
                        this.sessionLootedMinecarts = new HashSet<String>();
                        this.foundLootByMinecart = new HashMap<String, Set<String>>();
                        this.keyfinderFile = Path.of("Phobia", new String[]{"temp", "keyfinder.file"});
                        this.settings(new jx[]{this.loot, this.rememberLooted, this.autoLeave, this.leaveRadius, this.autoInvest, this.autoHeal, this.autoFix, this.dropTrash});
                        return;
                    }
                    case 1: {
                        var2_1 /* !! */  = (int)gv.gfcc("gfcj", gfbz(int ), (int)5);
                        cfr_temp_0 = 11;
                        break block25;
                    }
                    case 2: {
                        var2_1 /* !! */  = (int)gv.gfcc("gfck", gfbz(int ), (int)6);
                        cfr_temp_0 = 9;
                        break block25;
                    }
                    case 4: {
                        var2_1 /* !! */  = (int)gv.gfcc("gfcm", gfbz(int ), (int)8);
                    }
                    case 6: {
                        var2_1 /* !! */  = (int)gv.gfcc("gfco", gfbz(int ), (int)10);
                        ** GOTO lbl-1000
                    }
                    case 11: {
                        var2_1 /* !! */  = (int)gv.gfcc("gfct", gfbz(int ), (int)15);
                        cfr_temp_0 = 13;
                        break block25;
                    }
                    case 12: {
                        var2_1 /* !! */  = (int)gv.gfcc("gfcu", gfbz(int ), (int)16);
                    }
                    case 7: {
                        var2_1 /* !! */  = (int)gv.gfcc("gfcp", gfbz(int ), (int)11);
                        cfr_temp_0 = 5;
                        break block25;
                    }
                    case 13: {
                        ** GOTO lbl76
                    }
                    case 15: {
                        var2_1 /* !! */  = (int)gv.gfcc("gfcx", gfbz(int ), (int)19);
                        cfr_temp_0 = 18;
                        break block25;
                    }
                    case 16: {
                        var2_1 /* !! */  = (int)gv.gfcc("gfcy", gfbz(int ), (int)20);
                        cfr_temp_0 = 19;
                        break block25;
                    }
                    case 17: {
                        var2_1 /* !! */  = (int)gv.gfcc("gfcz", gfbz(int ), (int)21);
                    }
                    case 9: {
                        var2_1 /* !! */  = (int)gv.gfcc("gfcr", gfbz(int ), (int)13);
                        ** GOTO lbl-1000
                    }
                    case 18: {
                        var2_1 /* !! */  = (int)gv.gfcc("gfda", gfbz(int ), (int)22);
                    }
                    case 0: {
                        var2_1 /* !! */  = (int)gv.gfcc("gfci", gfbz(int ), (int)4);
                        cfr_temp_0 = 3;
                        break block25;
                    }
                    case 20: lbl-1000:
                    // 3 sources

                    {
                        var2_1 /* !! */  = (int)gv.gfcc("gfdc", gfbz(int ), (int)24);
lbl76:
                        // 2 sources

                        var2_1 /* !! */  = (int)gv.gfcc("gfcv", gfbz(int ), (int)17);
                    }
                    case 14: {
                        var2_1 /* !! */  = (int)gv.gfcc("gfcw", gfbz(int ), (int)18);
                    }
                    case 8: {
                        var2_1 /* !! */  = (int)gv.gfcc("gfcq", gfbz(int ), (int)12);
                    }
                    case 3: {
                        var2_1 /* !! */  = (int)gv.gfcc("gfcl", gfbz(int ), (int)7);
                    }
                    case 19: {
                        var2_1 /* !! */  = (int)gv.gfcc("gfdb", gfbz(int ), (int)23);
                        cfr_temp_0 = 3;
                        break block25;
                    }
                    case 5: {
                        var2_1 /* !! */  = (int)gv.gfcc("gfcn", gfbz(int ), (int)9);
                    }
                    case 10: 
                }
                ** GOTO lbl94
            }
            while (true) {
                if (true) continue block23;
lbl94:
                // 2 sources

                var2_1 /* !! */  = (int)gv.gfcc("gfcs", gfbz(int ), (int)14);
                cfr_temp_0 = 5;
            }
            break;
        }
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private /* synthetic */ boolean lambda$isRememberedMinecart$4(String var1_1, String var2_2) {
        v0 /* !! */  = gv.nl;
        block19: while (true) {
            switch ((int)v0 /* !! */ ) {
                case -473284302: {
                    v0 /* !! */  = (long)(gv.gfcc("gocl", gfdd(int ), (int)766) - gv.gfcc("gock", gfdd(int ), (int)765));
                    continue block19;
                }
                case 1185080505: {
                    break block19;
                }
            }
            break;
        }
        var5_3 = gv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gv.nl - gv.gfcc("gocm", gfdd(int ), (int)767)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == gv.gfcc("gocn", gfbz(int ), (int)1691)) break;
            v1 /* !! */  = (long)gv.gfcc("gocu", gfbz(int ), (int)1692);
        }
        var4_4 /* !! */  = gv.b;
        v2 /* !! */  = gv.nl;
        block21: while (true) {
            switch ((int)v2 /* !! */ ) {
                case 432365627: {
                    v2 /* !! */  = (long)(gv.gfcc("goec", gfdd(int ), (int)769) - gv.gfcc("goeb", gfdd(int ), (int)768));
                    continue block21;
                }
                case 1185080505: {
                    break block21;
                }
            }
            break;
        }
        var3_5 = gv.a;
        if (var5_3) {
            throw null;
        }
        if (var3_5 != false) return (boolean)gv.gfcc("goeg", gfbz(int ), (int)1693);
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var4_4 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var3_5 != false) return (boolean)gv.gfcc("goeg", gfbz(int ), (int)1693);
                    v3 /* !! */  = gv.nl;
                    block23: while (true) {
                        switch ((int)v3 /* !! */ ) {
                            case -576397605: {
                                v4 = gv.gfcc("goem", gfdd(int ), (int)771);
                                ** GOTO lbl42
                            }
                            case 889141326: {
                                v4 = gv.gfcc("goen", gfdd(int ), (int)772);
lbl42:
                                // 2 sources

                                v3 /* !! */  = (long)(v4 - gv.gfcc("goek", gfdd(int ), (int)770));
                                continue block23;
                            }
                            case 1185080505: {
                                return this.isRememberedEntryForKey(var2_2, var1_1);
                            }
                        }
                        break;
                    }
                    return this.isRememberedEntryForKey(var2_2, var1_1);
                }
                case 2: {
                    do {
                        var4_4 /* !! */  = (int)gv.gfcc("goex", gfbz(int ), (int)1696);
                    } while (!var5_3);
                    throw null;
                }
                case 3: {
                    var4_4 /* !! */  = (int)gv.gfcc("goey", gfbz(int ), (int)1697);
                    if (var5_3) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                case 0: lbl-1000:
                // 2 sources

                {
                    var4_4 /* !! */  = (int)gv.gfcc("goev", gfbz(int ), (int)1694);
                    if (var5_3) {
                        throw null;
                    }
                }
                case 1: 
            }
            if (true) ** GOTO lbl65
            break;
        }
        do {
            if (true) ** continue;
lbl65:
            // 2 sources

            var4_4 /* !! */  = (int)gv.gfcc("goew", gfbz(int ), (int)1695);
            cfr_temp_0 = 0;
        } while (!var5_3);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int countWantedLootSlots(class_1703 var1_1, int var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gv.nl - gv.gfcc("glbl", gfdd(int ), (int)516)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gv.gfcc("glbm", gfbz(int ), (int)1286)) break;
            v0 /* !! */  = (long)gv.gfcc("glbn", gfbz(int ), (int)1287);
        }
        var8_3 = gv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gv.nl - gv.gfcc("glbp", gfdd(int ), (int)517)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == gv.gfcc("glbr", gfbz(int ), (int)1288)) break;
            v1 /* !! */  = (long)gv.gfcc("glbx", gfbz(int ), (int)1289);
        }
        var7_4 /* !! */  = gv.b;
        v2 /* !! */  = gv.nl;
        if (true) ** GOTO lbl19
        block42: while (true) {
            v2 /* !! */  = (long)(gv.gfcc("glbz", gfdd(int ), (int)519) - gv.gfcc("glby", gfdd(int ), (int)518));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1045770710: {
                    continue block42;
                }
                case 1185080505: {
                    break block42;
                }
            }
            break;
        }
        var6_5 = gv.a;
        if (var8_3) {
            throw null;
lbl27:
            // 13 sources

            return (int)gv.gfcc("glca", gfbz(int ), (int)1290);
        }
        if (var6_5 || var6_5) ** GOTO lbl27
        var3_6 = gv.gfcc("glcc", gfbz(int ), (int)1291);
        if (var6_5) ** GOTO lbl27
        if (var7_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_5) ** GOTO lbl27
                var4_7 = gv.gfcc("glcd", gfbz(int ), (int)1292);
                if (var6_5) ** GOTO lbl27
                do {
                    if (var6_5 || var6_5) ** GOTO lbl27
                    if (var4_7 >= var2_2) ** GOTO lbl97
                    if (var6_5 || var6_5) ** GOTO lbl27
                    v3 /* !! */  = gv.nl;
                    if (true) ** GOTO lbl46
                    block45: while (true) {
                        v3 /* !! */  = (long)(v4 - gv.gfcc("glce", gfdd(int ), (int)520));
lbl46:
                        // 2 sources

                        switch ((int)v3 /* !! */ ) {
                            case -2090875622: {
                                v4 = gv.gfcc("glcj", gfdd(int ), (int)521);
                                continue block45;
                            }
                            case -1846297327: {
                                v4 = gv.gfcc("glck", gfdd(int ), (int)522);
                                continue block45;
                            }
                            case 1185080505: {
                                break block45;
                            }
                        }
                        break;
                    }
                    var5_8 = var1_1.method_7611((int)var4_7);
                    if (var6_5 || var6_5) ** GOTO lbl27
                    while (true) {
                        if ((v5 /* !! */  = (cfr_temp_2 = gv.nl - gv.gfcc("glcl", gfdd(int ), (int)523)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v5 /* !! */  == gv.gfcc("glcn", gfbz(int ), (int)1293)) break;
                        v5 /* !! */  = (long)gv.gfcc("glcp", gfbz(int ), (int)1294);
                    }
                    if (!var5_8.method_7681()) ** GOTO lbl92
                    if (var6_5) ** GOTO lbl27
                    v6 /* !! */  = gv.nl;
                    if (true) ** GOTO lbl69
                    block47: while (true) {
                        v6 /* !! */  = (long)(v7 - gv.gfcc("glcs", gfdd(int ), (int)524));
lbl69:
                        // 2 sources

                        switch ((int)v6 /* !! */ ) {
                            case -485813705: {
                                v7 = gv.gfcc("glcv", gfdd(int ), (int)525);
                                continue block47;
                            }
                            case 894543103: {
                                v7 = gv.gfcc("glcw", gfdd(int ), (int)526);
                                continue block47;
                            }
                            case 1185080505: {
                                break block47;
                            }
                            case 1704963779: {
                                v7 = gv.gfcc("glcx", gfdd(int ), (int)527);
                                continue block47;
                            }
                        }
                        break;
                    }
                    v8 = var5_8.method_7677();
                    while (true) {
                        if ((v9 /* !! */  = (cfr_temp_3 = gv.nl - gv.gfcc("glcz", gfdd(int ), (int)528)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v9 /* !! */  == gv.gfcc("gldb", gfbz(int ), (int)1295)) break;
                        v9 /* !! */  = (long)gv.gfcc("gldc", gfbz(int ), (int)1296);
                    }
                    if (!this.isWantedLoot(v8)) ** GOTO lbl92
                    if (var6_5 || var6_5) ** GOTO lbl27
                    ++var3_6;
                    if (var6_5) ** GOTO lbl27
lbl92:
                    // 3 sources

                    if (var6_5 || var6_5) ** GOTO lbl27
                    ++var4_7;
                    if (var6_5) ** GOTO lbl27
                } while (!var8_3);
                throw null;
lbl97:
                // 1 sources

                if (!var6_5 && !var6_5) ** break;
                ** continue;
                return (int)var3_6;
            }
            case 0: {
                var7_4 /* !! */  = (int)gv.gfcc("gldh", gfbz(int ), (int)1297);
                if (!var8_3) break;
                throw null;
            }
lbl104:
            // 4 sources

            case 1: {
                var7_4 /* !! */  = (int)gv.gfcc("gldi", gfbz(int ), (int)1298);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl137
            }
lbl109:
            // 2 sources

            case 2: {
                var7_4 /* !! */  = (int)gv.gfcc("gldj", gfbz(int ), (int)1299);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl133
            }
            case 3: {
                var7_4 /* !! */  = (int)gv.gfcc("gldl", gfbz(int ), (int)1300);
                if (!var8_3) break;
                throw null;
            }
lbl118:
            // 3 sources

            case 4: {
                var7_4 /* !! */  = (int)gv.gfcc("gldn", gfbz(int ), (int)1301);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl128
            }
lbl123:
            // 2 sources

            case 5: {
                var7_4 /* !! */  = (int)gv.gfcc("gldo", gfbz(int ), (int)1302);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl128:
            // 2 sources

            case 6: {
                var7_4 /* !! */  = (int)gv.gfcc("gldq", gfbz(int ), (int)1303);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl137
            }
lbl133:
            // 2 sources

            case 7: {
                var7_4 /* !! */  = (int)gv.gfcc("glds", gfbz(int ), (int)1304);
                if (!var8_3) ** GOTO lbl109
                throw null;
            }
lbl137:
            // 3 sources

            case 8: {
                do {
                    var7_4 /* !! */  = (int)gv.gfcc("gldw", gfbz(int ), (int)1305);
                } while (!var8_3);
                throw null;
            }
lbl142:
            // 2 sources

            case 9: {
                var7_4 /* !! */  = (int)gv.gfcc("gldx", gfbz(int ), (int)1306);
                if (!var8_3) ** GOTO lbl104
                throw null;
            }
lbl146:
            // 2 sources

            case 10: {
                var7_4 /* !! */  = (int)gv.gfcc("gldz", gfbz(int ), (int)1307);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl151:
            // 3 sources

            case 11: {
                do {
                    var7_4 /* !! */  = (int)gv.gfcc("glec", gfbz(int ), (int)1308);
                } while (!var8_3);
                throw null;
            }
            case 12: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_4 /* !! */  = (int)gv.gfcc("glee", gfbz(int ), (int)1309);
                    if (!var8_3) ** GOTO lbl118
                    throw null;
                }
            }
lbl161:
            // 2 sources

            case 13: {
                var7_4 /* !! */  = (int)gv.gfcc("gleg", gfbz(int ), (int)1310);
                if (!var8_3) ** GOTO lbl104
                throw null;
            }
            case 14: {
                var7_4 /* !! */  = (int)gv.gfcc("glei", gfbz(int ), (int)1311);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl174
            }
            case 15: {
                var7_4 /* !! */  = (int)gv.gfcc("glek", gfbz(int ), (int)1312);
                if (!var8_3) ** GOTO lbl123
                throw null;
            }
lbl174:
            // 2 sources

            case 16: {
                var7_4 /* !! */  = (int)gv.gfcc("glen", gfbz(int ), (int)1313);
                if (!var8_3) ** GOTO lbl142
                throw null;
            }
lbl178:
            // 2 sources

            case 17: {
                var7_4 /* !! */  = (int)gv.gfcc("glep", gfbz(int ), (int)1314);
                if (!var8_3) ** GOTO lbl118
                throw null;
            }
            case 18: {
                var7_4 /* !! */  = (int)gv.gfcc("gler", gfbz(int ), (int)1315);
                if (!var8_3) ** GOTO lbl151
                throw null;
            }
            case 19: {
                var7_4 /* !! */  = (int)gv.gfcc("glet", gfbz(int ), (int)1316);
                if (!var8_3) ** GOTO lbl151
                throw null;
            }
            case 20: {
                var7_4 /* !! */  = (int)gv.gfcc("glev", gfbz(int ), (int)1317);
                if (!var8_3) ** GOTO lbl104
                throw null;
            }
            case 21: {
                var7_4 /* !! */  = (int)gv.gfcc("glex", gfbz(int ), (int)1318);
                if (!var8_3) ** GOTO lbl161
                throw null;
            }
            case 22: 
        }
        var7_4 /* !! */  = (int)gv.gfcc("glez", gfbz(int ), (int)1319);
        ** while (!var8_3)
lbl201:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void handleEnderChestDeposit(class_1707 var1_1) {
        block76: {
            block77: {
                var7_2 = gv.c;
                var6_3 /* !! */  = gv.b;
                var5_4 = gv.a;
                if (var7_2) {
                    throw null;
lbl6:
                    // 19 sources

                    return;
                }
                if (var5_4 || var5_4) ** GOTO lbl6
                if (this.clickTimer.finished((double)gv.gfcc("ghaj", gfjl(int ), (int)242))) break block77;
                if (var5_4 || var5_4) ** GOTO lbl6
                return;
            }
            if (var5_4 || var5_4) ** GOTO lbl6
            var2_5 = var1_1.method_17388() * gv.gfcc("ghak", gfbz(int ), (int)694);
            if (var5_4 || var5_4) ** GOTO lbl6
            var3_6 = var2_5;
            if (var5_4) ** GOTO lbl6
            do {
                block78: {
                    if (var5_4 || var5_4) ** GOTO lbl6
                    if (var3_6 >= var1_1.field_7761.size()) break block76;
                    if (var5_4 || var5_4) ** GOTO lbl6
                    var4_7 = var1_1.method_7611(var3_6);
                    if (var5_4 || var5_4) ** GOTO lbl6
                    if (!var4_7.method_7681()) break block78;
                    if (var5_4) ** GOTO lbl6
                    if (!this.isWantedLoot(var4_7.method_7677())) break block78;
                    if (var5_4 || var5_4) ** GOTO lbl6
                    gv.mc.field_1761.method_2906(var1_1.field_7763, var4_7.field_7874, (int)gv.gfcc("gham", gfbz(int ), (int)695), class_1713.field_7794, (class_1657)gv.mc.field_1724);
                    if (var5_4 || var5_4) ** GOTO lbl6
                    this.clickTimer.reset();
                    if (var5_4 || var5_4) ** GOTO lbl6
                    return;
                }
                if (var5_4 || var5_4) ** GOTO lbl6
                ++var3_6;
                if (var5_4) ** GOTO lbl6
            } while (!var7_2);
            throw null;
        }
        if (var5_4 || var5_4) ** GOTO lbl6
        this.needsInvest = this.hasWantedLootInInventory();
        if (var5_4 || var5_4) ** GOTO lbl6
        this.depositingToEnderChest = gv.gfcc("ghas", gfbz(int ), (int)696);
        if (var5_4 || var5_4) ** GOTO lbl6
        gv.mc.field_1724.method_7346();
        if (var5_4 || var5_4) ** GOTO lbl6
        if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.clickTimer.reset();
                if (!var5_4 && !var5_4) ** break;
                ** continue;
                return;
            }
lbl54:
            // 4 sources

            case 0: {
                var6_3 /* !! */  = (int)gv.gfcc("ghat", gfbz(int ), (int)697);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl103
            }
lbl59:
            // 3 sources

            case 1: {
                var6_3 /* !! */  = (int)gv.gfcc("ghau", gfbz(int ), (int)698);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl94
            }
lbl64:
            // 2 sources

            case 2: {
                var6_3 /* !! */  = (int)gv.gfcc("ghaz", gfbz(int ), (int)699);
                if (!var7_2) break;
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_3 /* !! */  = (int)gv.gfcc("ghbb", gfbz(int ), (int)700);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl79
                    break;
                }
            }
lbl74:
            // 2 sources

            case 4: {
                var6_3 /* !! */  = (int)gv.gfcc("ghbd", gfbz(int ), (int)701);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl79:
            // 2 sources

            case 5: {
                var6_3 /* !! */  = (int)gv.gfcc("ghbe", gfbz(int ), (int)702);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl157
            }
            case 6: {
                var6_3 /* !! */  = (int)gv.gfcc("ghbf", gfbz(int ), (int)703);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl188
            }
lbl89:
            // 2 sources

            case 7: {
                var6_3 /* !! */  = (int)gv.gfcc("ghbg", gfbz(int ), (int)704);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl205
            }
lbl94:
            // 2 sources

            case 8: {
                var6_3 /* !! */  = (int)gv.gfcc("ghbh", gfbz(int ), (int)705);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl103
            }
lbl99:
            // 2 sources

            case 9: {
                var6_3 /* !! */  = (int)gv.gfcc("ghbm", gfbz(int ), (int)706);
                if (!var7_2) ** GOTO lbl54
                throw null;
            }
lbl103:
            // 3 sources

            case 10: {
                var6_3 /* !! */  = (int)gv.gfcc("ghbo", gfbz(int ), (int)707);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl145
            }
lbl108:
            // 2 sources

            case 11: {
                var6_3 /* !! */  = (int)gv.gfcc("ghbq", gfbz(int ), (int)708);
                if (!var7_2) ** GOTO lbl74
                throw null;
            }
lbl112:
            // 2 sources

            case 12: {
                var6_3 /* !! */  = (int)gv.gfcc("ghbr", gfbz(int ), (int)709);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl170
            }
lbl117:
            // 2 sources

            case 13: {
                var6_3 /* !! */  = (int)gv.gfcc("ghbs", gfbz(int ), (int)710);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl217
            }
            case 14: {
                var6_3 /* !! */  = (int)gv.gfcc("ghbt", gfbz(int ), (int)711);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl201
            }
            case 15: {
                var6_3 /* !! */  = (int)gv.gfcc("ghbu", gfbz(int ), (int)712);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl149
            }
            case 16: {
                var6_3 /* !! */  = (int)gv.gfcc("ghcb", gfbz(int ), (int)713);
                if (!var7_2) ** GOTO lbl108
                throw null;
            }
lbl136:
            // 3 sources

            case 17: {
                var6_3 /* !! */  = (int)gv.gfcc("ghcc", gfbz(int ), (int)714);
                if (!var7_2) ** GOTO lbl89
                throw null;
            }
            case 18: {
                var6_3 /* !! */  = (int)gv.gfcc("ghcd", gfbz(int ), (int)715);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl221
            }
lbl145:
            // 2 sources

            case 19: {
                var6_3 /* !! */  = (int)gv.gfcc("ghce", gfbz(int ), (int)716);
                if (!var7_2) ** GOTO lbl54
                throw null;
            }
lbl149:
            // 2 sources

            case 20: {
                var6_3 /* !! */  = (int)gv.gfcc("ghcf", gfbz(int ), (int)717);
                if (!var7_2) ** GOTO lbl112
                throw null;
            }
            case 21: {
                var6_3 /* !! */  = (int)gv.gfcc("ghcg", gfbz(int ), (int)718);
                if (!var7_2) ** GOTO lbl136
                throw null;
            }
lbl157:
            // 4 sources

            case 22: {
                var6_3 /* !! */  = (int)gv.gfcc("ghch", gfbz(int ), (int)719);
                if (!var7_2) ** GOTO lbl59
                throw null;
            }
            case 23: {
                var6_3 /* !! */  = (int)gv.gfcc("ghcn", gfbz(int ), (int)720);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl179
            }
lbl166:
            // 3 sources

            case 24: {
                var6_3 /* !! */  = (int)gv.gfcc("ghcp", gfbz(int ), (int)721);
                if (!var7_2) ** GOTO lbl117
                throw null;
            }
lbl170:
            // 2 sources

            case 25: {
                var6_3 /* !! */  = (int)gv.gfcc("ghcr", gfbz(int ), (int)722);
                if (!var7_2) ** GOTO lbl166
                throw null;
            }
            case 26: {
                var6_3 /* !! */  = (int)gv.gfcc("ghcs", gfbz(int ), (int)723);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl179:
            // 3 sources

            case 27: {
                var6_3 /* !! */  = (int)gv.gfcc("ghct", gfbz(int ), (int)724);
                if (!var7_2) ** GOTO lbl59
                throw null;
            }
lbl183:
            // 2 sources

            case 28: {
                var6_3 /* !! */  = (int)gv.gfcc("ghcu", gfbz(int ), (int)725);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl209
            }
lbl188:
            // 2 sources

            case 29: {
                var6_3 /* !! */  = (int)gv.gfcc("ghcv", gfbz(int ), (int)726);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl209
            }
            case 30: {
                var6_3 /* !! */  = (int)gv.gfcc("ghdb", gfbz(int ), (int)727);
                if (!var7_2) ** GOTO lbl157
                throw null;
            }
lbl197:
            // 2 sources

            case 31: {
                var6_3 /* !! */  = (int)gv.gfcc("ghde", gfbz(int ), (int)728);
                if (!var7_2) ** GOTO lbl64
                throw null;
            }
lbl201:
            // 2 sources

            case 32: {
                var6_3 /* !! */  = (int)gv.gfcc("ghdf", gfbz(int ), (int)729);
                if (!var7_2) ** GOTO lbl166
                throw null;
            }
lbl205:
            // 2 sources

            case 33: {
                var6_3 /* !! */  = (int)gv.gfcc("ghdg", gfbz(int ), (int)730);
                if (!var7_2) ** GOTO lbl54
                throw null;
            }
lbl209:
            // 3 sources

            case 34: {
                var6_3 /* !! */  = (int)gv.gfcc("ghdh", gfbz(int ), (int)731);
                if (!var7_2) ** GOTO lbl99
                throw null;
            }
            case 35: {
                var6_3 /* !! */  = (int)gv.gfcc("ghdi", gfbz(int ), (int)732);
                if (!var7_2) ** GOTO lbl179
                throw null;
            }
lbl217:
            // 2 sources

            case 36: {
                var6_3 /* !! */  = (int)gv.gfcc("ghdk", gfbz(int ), (int)733);
                if (!var7_2) ** GOTO lbl136
                throw null;
            }
lbl221:
            // 2 sources

            case 37: {
                var6_3 /* !! */  = (int)gv.gfcc("ghdo", gfbz(int ), (int)734);
                if (!var7_2) ** GOTO lbl157
                throw null;
            }
            case 38: 
        }
        var6_3 /* !! */  = (int)gv.gfcc("ghdq", gfbz(int ), (int)735);
        ** while (!var7_2)
lbl228:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gqhm() {
        gv.gfcb[1200] = 1575182347;
        gv.gfcb[1201] = -1402191795;
        gv.gfcb[1202] = 511393929;
        gv.gfcb[1203] = 998816808;
        gv.gfcb[1204] = -446081317;
        gv.gfcb[1205] = 1438732175;
        gv.gfcb[1206] = -1163811750;
        gv.gfcb[1207] = -1203245849;
        gv.gfcb[1208] = 911717707;
        gv.gfcb[1209] = 723363168;
        gv.gfcb[1210] = -1817074902;
        gv.gfcb[1211] = 2020775176;
        gv.gfcb[1212] = -385405443;
        gv.gfcb[1213] = 1346535502;
        gv.gfcb[1214] = -1814278382;
        gv.gfcb[1215] = -1666942665;
        gv.gfcb[1216] = -1965116987;
        gv.gfcb[1217] = 901103568;
        gv.gfcb[1218] = 1584411465;
        gv.gfcb[1219] = -144682841;
        gv.gfcb[1220] = 78575755;
        gv.gfcb[1221] = 1424491858;
        gv.gfcb[1222] = -2076352091;
        gv.gfcb[1223] = 763240006;
        gv.gfcb[1224] = -507300747;
        gv.gfcb[1225] = -797748592;
        gv.gfcb[1226] = -840018848;
        gv.gfcb[1227] = 1367959857;
        gv.gfcb[1228] = -1062775995;
        gv.gfcb[1229] = -1753958105;
        gv.gfcb[1230] = 291940383;
        gv.gfcb[1231] = -874117015;
        gv.gfcb[1232] = 465990143;
        gv.gfcb[1233] = 1634152;
        gv.gfcb[1234] = 1489302064;
        gv.gfcb[1235] = 466187719;
        gv.gfcb[1236] = -2062915890;
        gv.gfcb[1237] = 1453121135;
        gv.gfcb[1238] = -1749731565;
        gv.gfcb[1239] = -612246483;
        gv.gfcb[1240] = 2127529255;
        gv.gfcb[1241] = 1216380276;
        gv.gfcb[1242] = 177587515;
        gv.gfcb[1243] = 73618686;
        gv.gfcb[1244] = -871497682;
        gv.gfcb[1245] = -1598321056;
        gv.gfcb[1246] = -355960811;
        gv.gfcb[1247] = -146339633;
        gv.gfcb[1248] = -2083745959;
        gv.gfcb[1249] = -1901523037;
        gv.gfcb[1250] = -257513655;
        gv.gfcb[1251] = -2062604450;
        gv.gfcb[1252] = 1239611364;
        gv.gfcb[1253] = 970791396;
        gv.gfcb[1254] = 523654667;
        gv.gfcb[1255] = 1444407567;
        gv.gfcb[1256] = 329929761;
        gv.gfcb[1257] = -1439957389;
        gv.gfcb[1258] = -1418106389;
        gv.gfcb[1259] = 2022535595;
        gv.gfcb[1260] = -1743161591;
        gv.gfcb[1261] = 2062575242;
        gv.gfcb[1262] = 561840785;
        gv.gfcb[1263] = -1419393175;
        gv.gfcb[1264] = -1691046501;
        gv.gfcb[1265] = 1472070253;
        gv.gfcb[1266] = 784120112;
        gv.gfcb[1267] = -342646808;
        gv.gfcb[1268] = -649046700;
        gv.gfcb[1269] = 329849179;
        gv.gfcb[1270] = -877096660;
        gv.gfcb[1271] = -1542918004;
        gv.gfcb[1272] = -1209402647;
        gv.gfcb[1273] = 2040224513;
        gv.gfcb[1274] = 1987068374;
        gv.gfcb[1275] = 872952497;
        gv.gfcb[1276] = 79962457;
        gv.gfcb[1277] = 2088087227;
        gv.gfcb[1278] = -1812794337;
        gv.gfcb[1279] = 948262958;
        gv.gfcb[1280] = -1179285820;
        gv.gfcb[1281] = -1173347809;
        gv.gfcb[1282] = 1090737077;
        gv.gfcb[1283] = 344543653;
        gv.gfcb[1284] = 656985642;
        gv.gfcb[1285] = -1093973647;
        gv.gfcb[1286] = 1883668856;
        gv.gfcb[1287] = -185420965;
        gv.gfcb[1288] = -1792102459;
        gv.gfcb[1289] = -1574542371;
        gv.gfcb[1290] = -2093822775;
        gv.gfcb[1291] = 1140407677;
        gv.gfcb[1292] = 1450946285;
        gv.gfcb[1293] = 175384861;
        gv.gfcb[1294] = 1352515665;
        gv.gfcb[1295] = 353558758;
        gv.gfcb[1296] = 415970746;
        gv.gfcb[1297] = -846854168;
        gv.gfcb[1298] = 1714129744;
        gv.gfcb[1299] = -802368622;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_1694 findNearestMinecart() {
        var11_1 = gv.c;
        var10_2 /* !! */  = gv.b;
        var9_3 = gv.a;
        if (var11_1) {
            throw null;
lbl6:
            // 17 sources

            return null;
        }
        if (var9_3 || var9_3) ** GOTO lbl6
        var1_4 = null;
        if (var9_3 || var9_3) ** GOTO lbl6
        var2_5 /* !! */  = gv.gfcc("gijw", gfjl(int ), (int)397);
        if (var9_3 || var9_3) ** GOTO lbl6
        var4_6 = gv.mc.field_1687.method_18112().iterator();
        if (var9_3) ** GOTO lbl6
        if (var10_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var10_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if (var9_3 || var9_3) ** GOTO lbl6
                    if (!var4_6.hasNext()) ** GOTO lbl45
                    if (var9_3) ** GOTO lbl6
                    var5_7 = (class_1297)var4_6.next();
                    if (var9_3 || var9_3) ** GOTO lbl6
                    if (!(var5_7 instanceof class_1694)) continue;
                    if (var9_3) ** GOTO lbl6
                    var6_8 = (class_1694)var5_7;
                    if (var9_3 || var9_3) ** GOTO lbl6
                    if (this.isValidMinecart(var6_8)) ** GOTO lbl32
                    if (var9_3 || var9_3) ** GOTO lbl6
                    if (!var11_1) continue;
                    throw null;
lbl32:
                    // 1 sources

                    if (var9_3 || var9_3) ** GOTO lbl6
                    var7_9 = gv.mc.field_1724.method_5858((class_1297)var6_8);
                    if (var9_3 || var9_3) ** GOTO lbl6
                    if (!(var7_9 < var2_5 /* !! */ )) ** GOTO lbl41
                    if (var9_3 || var9_3) ** GOTO lbl6
                    var2_5 /* !! */  = (CallSite)var7_9;
                    if (var9_3 || var9_3) ** GOTO lbl6
                    var1_4 = var6_8;
                    if (var9_3) ** GOTO lbl6
lbl41:
                    // 2 sources

                    if (var9_3 || var9_3) ** GOTO lbl6
                    if (var11_1) break;
                }
                throw null;
lbl45:
                // 1 sources

                if (!var9_3 && !var9_3) ** break;
                ** continue;
                return var1_4;
            }
lbl48:
            // 4 sources

            case 0: {
                var10_2 /* !! */  = (int)gv.gfcc("gikd", gfbz(int ), (int)953);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl135
            }
lbl53:
            // 2 sources

            case 1: {
                var10_2 /* !! */  = (int)gv.gfcc("gikf", gfbz(int ), (int)954);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl58:
            // 2 sources

            case 2: {
                var10_2 /* !! */  = (int)gv.gfcc("gikg", gfbz(int ), (int)955);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl63:
            // 3 sources

            case 3: {
                var10_2 /* !! */  = (int)gv.gfcc("gikh", gfbz(int ), (int)956);
                if (!var11_1) ** GOTO lbl48
                throw null;
            }
            case 4: {
                var10_2 /* !! */  = (int)gv.gfcc("giki", gfbz(int ), (int)957);
                if (!var11_1) ** GOTO lbl48
                throw null;
            }
lbl71:
            // 2 sources

            case 5: {
                do {
                    var10_2 /* !! */  = (int)gv.gfcc("gikj", gfbz(int ), (int)958);
                } while (!var11_1);
                throw null;
            }
lbl76:
            // 2 sources

            case 6: {
                var10_2 /* !! */  = (int)gv.gfcc("giko", gfbz(int ), (int)959);
                if (!var11_1) ** GOTO lbl63
                throw null;
            }
            case 7: {
                var10_2 /* !! */  = (int)gv.gfcc("gikp", gfbz(int ), (int)960);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl144
            }
            case 8: {
                var10_2 /* !! */  = (int)gv.gfcc("gikr", gfbz(int ), (int)961);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl109
            }
            case 9: {
                var10_2 /* !! */  = (int)gv.gfcc("gikt", gfbz(int ), (int)962);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl100
            }
lbl95:
            // 2 sources

            case 10: {
                var10_2 /* !! */  = (int)gv.gfcc("giku", gfbz(int ), (int)963);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl100:
            // 2 sources

            case 11: {
                var10_2 /* !! */  = (int)gv.gfcc("gikw", gfbz(int ), (int)964);
                if (var11_1) {
                    throw null;
                }
            }
            case 12: {
                var10_2 /* !! */  = (int)gv.gfcc("gikx", gfbz(int ), (int)965);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl109:
            // 2 sources

            case 13: {
                var10_2 /* !! */  = (int)gv.gfcc("gilb", gfbz(int ), (int)966);
                if (!var11_1) ** GOTO lbl71
                throw null;
            }
            case 14: {
                var10_2 /* !! */  = (int)gv.gfcc("gilc", gfbz(int ), (int)967);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl186
            }
lbl118:
            // 2 sources

            case 15: {
                var10_2 /* !! */  = (int)gv.gfcc("gile", gfbz(int ), (int)968);
                if (!var11_1) ** GOTO lbl48
                throw null;
            }
lbl122:
            // 2 sources

            case 16: {
                var10_2 /* !! */  = (int)gv.gfcc("gilg", gfbz(int ), (int)969);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl139
            }
lbl127:
            // 2 sources

            case 17: {
                var10_2 /* !! */  = (int)gv.gfcc("gili", gfbz(int ), (int)970);
                if (!var11_1) ** GOTO lbl95
                throw null;
            }
lbl131:
            // 3 sources

            case 18: {
                var10_2 /* !! */  = (int)gv.gfcc("gilj", gfbz(int ), (int)971);
                if (var11_1) {
                    throw null;
                }
            }
lbl135:
            // 5 sources

            case 19: {
                var10_2 /* !! */  = (int)gv.gfcc("gill", gfbz(int ), (int)972);
                if (!var11_1) ** GOTO lbl122
                throw null;
            }
lbl139:
            // 2 sources

            case 20: {
                var10_2 /* !! */  = (int)gv.gfcc("gilo", gfbz(int ), (int)973);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl144:
            // 2 sources

            case 21: {
                var10_2 /* !! */  = (int)gv.gfcc("gilq", gfbz(int ), (int)974);
                if (!var11_1) ** GOTO lbl118
                throw null;
            }
            case 22: {
                var10_2 /* !! */  = (int)gv.gfcc("gilr", gfbz(int ), (int)975);
                if (!var11_1) ** GOTO lbl63
                throw null;
            }
            case 23: {
                var10_2 /* !! */  = (int)gv.gfcc("gilt", gfbz(int ), (int)976);
                if (!var11_1) ** GOTO lbl53
                throw null;
            }
            case 24: {
                var10_2 /* !! */  = (int)gv.gfcc("gilv", gfbz(int ), (int)977);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl170
            }
            case 25: {
                var10_2 /* !! */  = (int)gv.gfcc("gilw", gfbz(int ), (int)978);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl182
            }
lbl166:
            // 2 sources

            case 26: {
                var10_2 /* !! */  = (int)gv.gfcc("gily", gfbz(int ), (int)979);
                if (!var11_1) ** GOTO lbl76
                throw null;
            }
lbl170:
            // 2 sources

            case 27: {
                var10_2 /* !! */  = (int)gv.gfcc("gimb", gfbz(int ), (int)980);
                if (!var11_1) ** GOTO lbl135
                throw null;
            }
lbl174:
            // 2 sources

            case 28: {
                var10_2 /* !! */  = (int)gv.gfcc("gimd", gfbz(int ), (int)981);
                if (!var11_1) ** GOTO lbl127
                throw null;
            }
lbl178:
            // 4 sources

            case 29: {
                var10_2 /* !! */  = (int)gv.gfcc("gimf", gfbz(int ), (int)982);
                if (!var11_1) ** GOTO lbl131
                throw null;
            }
lbl182:
            // 2 sources

            case 30: {
                var10_2 /* !! */  = (int)gv.gfcc("gimg", gfbz(int ), (int)983);
                if (!var11_1) ** GOTO lbl131
                throw null;
            }
lbl186:
            // 2 sources

            case 31: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var10_2 /* !! */  = (int)gv.gfcc("gimi", gfbz(int ), (int)984);
                    if (!var11_1) ** GOTO lbl58
                    throw null;
                }
            }
            case 32: 
        }
        var10_2 /* !! */  = (int)gv.gfcc("gimk", gfbz(int ), (int)985);
        ** while (!var11_1)
lbl194:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gqoh() {
        gv.gfdf[500] = -8582999804789358029L;
        gv.gfdf[501] = 8436667500143919059L;
        gv.gfdf[502] = 8863807527070330139L;
        gv.gfdf[503] = 3071284279035145233L;
        gv.gfdf[504] = 5911968811033131016L;
        gv.gfdf[505] = -2496090958603964867L;
        gv.gfdf[506] = 4331079205869357881L;
        gv.gfdf[507] = -3038282080070425767L;
        gv.gfdf[508] = -652057947974645100L;
        gv.gfdf[509] = 8485972235952915718L;
        gv.gfdf[510] = 7747476170269674425L;
        gv.gfdf[511] = 4436800289535061121L;
        gv.gfdf[512] = 1306909602031730320L;
        gv.gfdf[513] = -690640094263393148L;
        gv.gfdf[514] = -8024889974896040354L;
        gv.gfdf[515] = 5814520829933312133L;
        gv.gfdf[516] = 3933287756693186075L;
        gv.gfdf[517] = -1396184404907102262L;
        gv.gfdf[518] = 3848230029482807861L;
        gv.gfdf[519] = 5924392780874680962L;
        gv.gfdf[520] = -2239441493406745409L;
        gv.gfdf[521] = -5912361052928515144L;
        gv.gfdf[522] = -2350151056388307792L;
        gv.gfdf[523] = -5516769985947001430L;
        gv.gfdf[524] = -4522850025390948238L;
        gv.gfdf[525] = 2172241056445446191L;
        gv.gfdf[526] = 1233760479447260102L;
        gv.gfdf[527] = 3209571160640089368L;
        gv.gfdf[528] = 4481974504406630242L;
        gv.gfdf[529] = 3885058578903400369L;
        gv.gfdf[530] = 7829697345801594197L;
        gv.gfdf[531] = -3425467904775397817L;
        gv.gfdf[532] = -7438960664137713447L;
        gv.gfdf[533] = 7451113535473559721L;
        gv.gfdf[534] = -3092936980369508107L;
        gv.gfdf[535] = -8164502572703292869L;
        gv.gfdf[536] = -476440568602200932L;
        gv.gfdf[537] = 910454363137763766L;
        gv.gfdf[538] = 8420700796555519902L;
        gv.gfdf[539] = 7962881749905750852L;
        gv.gfdf[540] = 5123416268079555830L;
        gv.gfdf[541] = -9174983208068689202L;
        gv.gfdf[542] = 7743578226932669094L;
        gv.gfdf[543] = -749666171783452156L;
        gv.gfdf[544] = -7810075241079776053L;
        gv.gfdf[545] = -8971038133815350089L;
        gv.gfdf[546] = 7510021540139272757L;
        gv.gfdf[547] = -5547840599888124037L;
        gv.gfdf[548] = 3561870818140186591L;
        gv.gfdf[549] = -889592108772493719L;
        gv.gfdf[550] = -878017934727942694L;
        gv.gfdf[551] = 2123747212859591558L;
        gv.gfdf[552] = 9095880389735462306L;
        gv.gfdf[553] = -3493766956499928026L;
        gv.gfdf[554] = -4431109867355431209L;
        gv.gfdf[555] = 2679714525868897258L;
        gv.gfdf[556] = -1646969971351996550L;
        gv.gfdf[557] = 1005337650906857029L;
        gv.gfdf[558] = -7780261982470196226L;
        gv.gfdf[559] = 1003669407143175927L;
        gv.gfdf[560] = 5818646779684199064L;
        gv.gfdf[561] = -1327692267693654968L;
        gv.gfdf[562] = 2919699717732770478L;
        gv.gfdf[563] = -9108573785758815263L;
        gv.gfdf[564] = -22870077698507975L;
        gv.gfdf[565] = -6547184328129240755L;
        gv.gfdf[566] = 5597671528804263650L;
        gv.gfdf[567] = -4020578783125844721L;
        gv.gfdf[568] = -9170993016345064634L;
        gv.gfdf[569] = -1798723296460414969L;
        gv.gfdf[570] = -7143503829948105666L;
        gv.gfdf[571] = -6472692018429283874L;
        gv.gfdf[572] = -444575251656046526L;
        gv.gfdf[573] = -1617002172902769334L;
        gv.gfdf[574] = -4140596405693924189L;
        gv.gfdf[575] = 6253807193045947909L;
        gv.gfdf[576] = -6679792495056147747L;
        gv.gfdf[577] = -3056254055002605287L;
        gv.gfdf[578] = -8151866955380908798L;
        gv.gfdf[579] = -933328431259032618L;
        gv.gfdf[580] = 6822904720809807120L;
        gv.gfdf[581] = 4244967370409401762L;
        gv.gfdf[582] = 5950581914391411295L;
        gv.gfdf[583] = -5644593132681227162L;
        gv.gfdf[584] = 5757834785409595096L;
        gv.gfdf[585] = -2271792981326569749L;
        gv.gfdf[586] = -1019339186788514510L;
        gv.gfdf[587] = 7403612048654567780L;
        gv.gfdf[588] = -8170628101088298834L;
        gv.gfdf[589] = -2426690835374851614L;
        gv.gfdf[590] = 1490183180303437818L;
        gv.gfdf[591] = -1567345793302022461L;
        gv.gfdf[592] = 8793490340822882416L;
        gv.gfdf[593] = -6138659651895391090L;
        gv.gfdf[594] = 5751314968166438459L;
        gv.gfdf[595] = 6663206146499591853L;
        gv.gfdf[596] = 3694593764291408618L;
        gv.gfdf[597] = 2959993470965161322L;
        gv.gfdf[598] = 490173173438622699L;
        gv.gfdf[599] = -5586162442789800792L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int findFoodSlot() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gv.nl - gv.gfcc("gknx", gfdd(int ), (int)466)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == gv.gfcc("gkny", gfbz(int ), (int)1170)) break;
            v0 /* !! */  = (long)gv.gfcc("gknz", gfbz(int ), (int)1171);
        }
        var5_1 = gv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gv.nl - gv.gfcc("gkoa", gfdd(int ), (int)467)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == gv.gfcc("gkob", gfbz(int ), (int)1172)) break;
            v1 /* !! */  = (long)gv.gfcc("gkoc", gfbz(int ), (int)1173);
        }
        var4_2 /* !! */  = gv.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = gv.nl - gv.gfcc("gkof", gfdd(int ), (int)468)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == gv.gfcc("gkog", gfbz(int ), (int)1174)) break;
            v2 /* !! */  = (long)gv.gfcc("gkoi", gfbz(int ), (int)1175);
        }
        var3_3 = gv.a;
        if (var5_1) {
            throw null;
lbl21:
            // 11 sources

            return (int)gv.gfcc("gkoj", gfbz(int ), (int)1176);
        }
        if (var3_3 || var3_3) ** GOTO lbl21
        var1_4 = gv.gfcc("gkok", gfbz(int ), (int)1177);
        if (var3_3) ** GOTO lbl21
        block37: while (true) {
            if (var3_3) ** GOTO lbl21
            if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var4_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var3_3) ** GOTO lbl21
                    if (var1_4 >= gv.gfcc("gkom", gfbz(int ), (int)1178)) ** GOTO lbl103
                    if (var3_3 || var3_3) ** GOTO lbl21
                    v3 /* !! */  = gv.nl;
                    if (true) ** GOTO lbl38
                    block38: while (true) {
                        v3 /* !! */  = (long)(v4 - gv.gfcc("gkon", gfdd(int ), (int)469));
lbl38:
                        // 2 sources

                        switch ((int)v3 /* !! */ ) {
                            case -895768912: {
                                v4 = gv.gfcc("gkor", gfdd(int ), (int)470);
                                continue block38;
                            }
                            case 1185080505: {
                                break block38;
                            }
                            case 1844881696: {
                                v4 = gv.gfcc("gkos", gfdd(int ), (int)471);
                                continue block38;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v5 /* !! */  = (cfr_temp_3 = gv.nl - gv.gfcc("gkot", gfdd(int ), (int)472)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v5 /* !! */  == gv.gfcc("gkou", gfbz(int ), (int)1179)) break;
                        v5 /* !! */  = (long)gv.gfcc("gkow", gfbz(int ), (int)1180);
                    }
                    v6 = gv.mc.field_1724;
                    v7 /* !! */  = gv.nl;
                    if (true) ** GOTO lbl57
                    block40: while (true) {
                        v7 /* !! */  = (long)(v8 - gv.gfcc("gkoy", gfdd(int ), (int)473));
lbl57:
                        // 2 sources

                        switch ((int)v7 /* !! */ ) {
                            case -462791658: {
                                v8 = gv.gfcc("gkoz", gfdd(int ), (int)474);
                                continue block40;
                            }
                            case 1185080505: {
                                break block40;
                            }
                            case 1218080494: {
                                v8 = gv.gfcc("gkpd", gfdd(int ), (int)475);
                                continue block40;
                            }
                            case 2040876323: {
                                v8 = gv.gfcc("gkpf", gfdd(int ), (int)476);
                                continue block40;
                            }
                        }
                        break;
                    }
                    v9 = v6.method_31548();
                    while (true) {
                        if ((v10 /* !! */  = (cfr_temp_4 = gv.nl - gv.gfcc("gkpg", gfdd(int ), (int)477)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v10 /* !! */  == gv.gfcc("gkph", gfbz(int ), (int)1181)) break;
                        v10 /* !! */  = (long)gv.gfcc("gkpi", gfbz(int ), (int)1182);
                    }
                    var2_5 = v9.method_5438((int)var1_4);
                    if (var3_3 || var3_3) ** GOTO lbl21
                    while (true) {
                        if ((v11 /* !! */  = (cfr_temp_5 = gv.nl - gv.gfcc("gkpj", gfdd(int ), (int)478)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v11 /* !! */  == gv.gfcc("gkpn", gfbz(int ), (int)1183)) break;
                        v11 /* !! */  = (long)gv.gfcc("gkpo", gfbz(int ), (int)1184);
                    }
                    if (var2_5.method_7960()) ** GOTO lbl98
                    if (var3_3) ** GOTO lbl21
                    while (true) {
                        if ((v12 /* !! */  = (cfr_temp_6 = gv.nl - gv.gfcc("gkpq", gfdd(int ), (int)479)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v12 /* !! */  == gv.gfcc("gkps", gfbz(int ), (int)1185)) break;
                        v12 /* !! */  = (long)gv.gfcc("gkpu", gfbz(int ), (int)1186);
                    }
                    v13 = var2_5.method_7909();
                    while (true) {
                        if ((v14 /* !! */  = (cfr_temp_7 = gv.nl - gv.gfcc("gkpw", gfdd(int ), (int)480)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v14 /* !! */  == gv.gfcc("gkpx", gfbz(int ), (int)1187)) break;
                        v14 /* !! */  = (long)gv.gfcc("gkqb", gfbz(int ), (int)1188);
                    }
                    if (!this.isHealFood(v13)) ** GOTO lbl98
                    if (var3_3 || var3_3) ** GOTO lbl21
                    return (int)var1_4;
lbl98:
                    // 2 sources

                    if (var3_3 || var3_3) ** GOTO lbl21
                    ++var1_4;
                    if (var3_3) ** GOTO lbl21
                    if (!var5_1) continue block37;
                    throw null;
lbl103:
                    // 1 sources

                    if (!var3_3 && !var3_3) ** break;
                    ** continue;
                    return (int)gv.gfcc("gkqf", gfbz(int ), (int)1189);
                }
                case 0: {
                    var4_2 /* !! */  = (int)gv.gfcc("gkqg", gfbz(int ), (int)1190);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl187
                }
                case 1: {
                    var4_2 /* !! */  = (int)gv.gfcc("gkqi", gfbz(int ), (int)1191);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl135
                }
lbl116:
                // 4 sources

                case 2: {
                    do {
                        var4_2 /* !! */  = (int)gv.gfcc("gkqj", gfbz(int ), (int)1192);
                    } while (!var5_1);
                    throw null;
                }
                case 3: {
                    var4_2 /* !! */  = (int)gv.gfcc("gkqk", gfbz(int ), (int)1193);
                    if (!var5_1) ** GOTO lbl116
                    throw null;
                }
                case 4: {
                    var4_2 /* !! */  = (int)gv.gfcc("gkqm", gfbz(int ), (int)1194);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl158
                }
lbl130:
                // 5 sources

                case 5: {
                    var4_2 /* !! */  = (int)gv.gfcc("gkqt", gfbz(int ), (int)1195);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl187
                }
lbl135:
                // 2 sources

                case 6: {
                    var4_2 /* !! */  = (int)gv.gfcc("gkqu", gfbz(int ), (int)1196);
                    if (!var5_1) ** GOTO lbl116
                    throw null;
                }
                case 7: {
                    var4_2 /* !! */  = (int)gv.gfcc("gkqw", gfbz(int ), (int)1197);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl158
                }
lbl144:
                // 2 sources

                case 8: {
                    var4_2 /* !! */  = (int)gv.gfcc("gkqy", gfbz(int ), (int)1198);
                    if (!var5_1) ** GOTO lbl116
                    throw null;
                }
                case 9: {
                    var4_2 /* !! */  = (int)gv.gfcc("gkrb", gfbz(int ), (int)1199);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl158
                }
lbl153:
                // 2 sources

                case 10: {
                    var4_2 /* !! */  = (int)gv.gfcc("gkrd", gfbz(int ), (int)1200);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl187
                }
lbl158:
                // 4 sources

                case 11: {
                    var4_2 /* !! */  = (int)gv.gfcc("gkrg", gfbz(int ), (int)1201);
                    if (!var5_1) ** GOTO lbl130
                    throw null;
                }
                case 12: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var4_2 /* !! */  = (int)gv.gfcc("gkrl", gfbz(int ), (int)1202);
                        if (!var5_1) ** GOTO lbl144
                        throw null;
                    }
                }
lbl167:
                // 2 sources

                case 13: {
                    var4_2 /* !! */  = (int)gv.gfcc("gkrn", gfbz(int ), (int)1203);
                    if (!var5_1) ** GOTO lbl130
                    throw null;
                }
lbl171:
                // 2 sources

                case 14: {
                    var4_2 /* !! */  = (int)gv.gfcc("gkrp", gfbz(int ), (int)1204);
                    if (!var5_1) ** GOTO lbl153
                    throw null;
                }
                case 15: {
                    var4_2 /* !! */  = (int)gv.gfcc("gkrr", gfbz(int ), (int)1205);
                    if (!var5_1) ** GOTO lbl130
                    throw null;
                }
                case 16: {
                    var4_2 /* !! */  = (int)gv.gfcc("gkrs", gfbz(int ), (int)1206);
                    if (!var5_1) ** GOTO lbl167
                    throw null;
                }
                case 17: {
                    var4_2 /* !! */  = (int)gv.gfcc("gkrt", gfbz(int ), (int)1207);
                    if (!var5_1) ** GOTO lbl171
                    throw null;
                }
lbl187:
                // 4 sources

                case 18: {
                    var4_2 /* !! */  = (int)gv.gfcc("gkru", gfbz(int ), (int)1208);
                    if (!var5_1) ** GOTO lbl130
                    throw null;
                }
                case 19: 
            }
            break;
        }
        var4_2 /* !! */  = (int)gv.gfcc("gksc", gfbz(int ), (int)1209);
        ** while (!var5_1)
lbl194:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean dropCobblestoneStacks(class_1703 var1_1, int var2_2, int var3_3) {
        block66: {
            var9_4 = gv.c;
            var8_5 /* !! */  = gv.b;
            var7_6 = gv.a;
            if (var9_4) {
                throw null;
lbl6:
                // 17 sources

                return (boolean)gv.gfcc("glip", gfbz(int ), (int)1356);
            }
            if (var7_6 || var7_6) ** GOTO lbl6
            var4_7 = gv.gfcc("gliq", gfbz(int ), (int)1357);
            if (var7_6 || var7_6) ** GOTO lbl6
            var5_8 = var2_2;
            if (var7_6) ** GOTO lbl6
            do {
                block67: {
                    block68: {
                        if (var7_6 || var7_6) ** GOTO lbl6
                        if (var5_8 >= var1_1.field_7761.size()) break block66;
                        if (var7_6) ** GOTO lbl6
                        if (var4_7 >= var3_3) break block66;
                        if (var7_6 || var7_6) ** GOTO lbl6
                        var6_9 = var1_1.method_7611(var5_8);
                        if (var7_6 || var7_6) ** GOTO lbl6
                        if (!var6_9.method_7681()) break block67;
                        if (var7_6) ** GOTO lbl6
                        if (var6_9.method_7677().method_31574(class_1802.field_20412)) break block68;
                        if (var7_6 || var7_6) ** GOTO lbl6
                        if (var9_4) {
                            throw null;
                        }
                        break block67;
                    }
                    if (var7_6 || var7_6) ** GOTO lbl6
                    gv.mc.field_1761.method_2906(var1_1.field_7763, var6_9.field_7874, (int)gv.gfcc("glir", gfbz(int ), (int)1358), class_1713.field_7795, (class_1657)gv.mc.field_1724);
                    if (var7_6 || var7_6) ** GOTO lbl6
                    ++var4_7;
                    if (var7_6) ** GOTO lbl6
                }
                if (var7_6 || var7_6) ** GOTO lbl6
                ++var5_8;
                if (var7_6) ** GOTO lbl6
            } while (!var9_4);
            throw null;
        }
        if (var7_6 || var7_6) ** GOTO lbl6
        if (var4_7 <= 0) ** GOTO lbl51
        if (var7_6) ** GOTO lbl6
        if (var8_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v0 = gv.gfcc("glis", gfbz(int ), (int)1359);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl54
            }
lbl51:
            // 1 sources

            if (!var7_6 && !var7_6) ** break;
            ** continue;
            v0 = gv.gfcc("gliv", gfbz(int ), (int)1360);
lbl54:
            // 2 sources

            return (boolean)v0;
lbl55:
            // 2 sources

            case 0: {
                var8_5 /* !! */  = (int)gv.gfcc("glix", gfbz(int ), (int)1361);
                if (var9_4) {
                    throw null;
                }
            }
lbl59:
            // 4 sources

            case 1: {
                var8_5 /* !! */  = (int)gv.gfcc("gljc", gfbz(int ), (int)1362);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl147
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_5 /* !! */  = (int)gv.gfcc("gljd", gfbz(int ), (int)1363);
                    if (var9_4) {
                        throw null;
                    }
                    ** GOTO lbl112
                    break;
                }
            }
            case 3: {
                var8_5 /* !! */  = (int)gv.gfcc("glje", gfbz(int ), (int)1364);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl75:
            // 2 sources

            case 4: {
                var8_5 /* !! */  = (int)gv.gfcc("gljf", gfbz(int ), (int)1365);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl125
            }
lbl80:
            // 2 sources

            case 5: {
                var8_5 /* !! */  = (int)gv.gfcc("gljh", gfbz(int ), (int)1366);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl121
            }
lbl85:
            // 3 sources

            case 6: {
                do {
                    var8_5 /* !! */  = (int)gv.gfcc("gljj", gfbz(int ), (int)1367);
                } while (!var9_4);
                throw null;
            }
            case 7: {
                var8_5 /* !! */  = (int)gv.gfcc("gljk", gfbz(int ), (int)1368);
                if (!var9_4) ** GOTO lbl85
                throw null;
            }
lbl94:
            // 3 sources

            case 8: {
                var8_5 /* !! */  = (int)gv.gfcc("gljq", gfbz(int ), (int)1369);
                if (!var9_4) ** GOTO lbl75
                throw null;
            }
lbl98:
            // 2 sources

            case 9: {
                var8_5 /* !! */  = (int)gv.gfcc("gljr", gfbz(int ), (int)1370);
                if (!var9_4) ** GOTO lbl94
                throw null;
            }
lbl102:
            // 4 sources

            case 10: {
                var8_5 /* !! */  = (int)gv.gfcc("gljs", gfbz(int ), (int)1371);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl159
            }
lbl107:
            // 3 sources

            case 11: {
                var8_5 /* !! */  = (int)gv.gfcc("gljt", gfbz(int ), (int)1372);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl130
            }
lbl112:
            // 3 sources

            case 12: {
                var8_5 /* !! */  = (int)gv.gfcc("glju", gfbz(int ), (int)1373);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl117:
            // 2 sources

            case 13: {
                var8_5 /* !! */  = (int)gv.gfcc("gljv", gfbz(int ), (int)1374);
                if (!var9_4) ** GOTO lbl102
                throw null;
            }
lbl121:
            // 2 sources

            case 14: {
                var8_5 /* !! */  = (int)gv.gfcc("gljx", gfbz(int ), (int)1375);
                if (!var9_4) ** GOTO lbl102
                throw null;
            }
lbl125:
            // 2 sources

            case 15: {
                var8_5 /* !! */  = (int)gv.gfcc("glke", gfbz(int ), (int)1376);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl135
            }
lbl130:
            // 3 sources

            case 16: {
                var8_5 /* !! */  = (int)gv.gfcc("glkf", gfbz(int ), (int)1377);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl151
            }
lbl135:
            // 3 sources

            case 17: {
                var8_5 /* !! */  = (int)gv.gfcc("glkg", gfbz(int ), (int)1378);
                if (!var9_4) ** GOTO lbl98
                throw null;
            }
lbl139:
            // 2 sources

            case 18: {
                var8_5 /* !! */  = (int)gv.gfcc("glkh", gfbz(int ), (int)1379);
                if (!var9_4) ** GOTO lbl112
                throw null;
            }
            case 19: {
                var8_5 /* !! */  = (int)gv.gfcc("glki", gfbz(int ), (int)1380);
                if (!var9_4) ** GOTO lbl130
                throw null;
            }
lbl147:
            // 2 sources

            case 20: {
                var8_5 /* !! */  = (int)gv.gfcc("glkj", gfbz(int ), (int)1381);
                if (!var9_4) ** GOTO lbl139
                throw null;
            }
lbl151:
            // 2 sources

            case 21: {
                var8_5 /* !! */  = (int)gv.gfcc("glkk", gfbz(int ), (int)1382);
                if (!var9_4) ** GOTO lbl107
                throw null;
            }
            case 22: {
                var8_5 /* !! */  = (int)gv.gfcc("glkp", gfbz(int ), (int)1383);
                if (!var9_4) ** GOTO lbl102
                throw null;
            }
lbl159:
            // 2 sources

            case 23: {
                var8_5 /* !! */  = (int)gv.gfcc("glkq", gfbz(int ), (int)1384);
                if (!var9_4) ** GOTO lbl59
                throw null;
            }
            case 24: {
                var8_5 /* !! */  = (int)gv.gfcc("glkr", gfbz(int ), (int)1385);
                if (!var9_4) ** GOTO lbl80
                throw null;
            }
lbl167:
            // 3 sources

            case 25: {
                var8_5 /* !! */  = (int)gv.gfcc("gmpn", gfbz(int ), (int)1386);
                if (!var9_4) ** GOTO lbl117
                throw null;
            }
            case 26: {
                var8_5 /* !! */  = (int)gv.gfcc("gmpo", gfbz(int ), (int)1387);
                if (!var9_4) ** GOTO lbl135
                throw null;
            }
            case 27: {
                var8_5 /* !! */  = (int)gv.gfcc("gmpq", gfbz(int ), (int)1388);
                if (!var9_4) ** GOTO lbl94
                throw null;
            }
            case 28: {
                var8_5 /* !! */  = (int)gv.gfcc("gmpu", gfbz(int ), (int)1389);
                if (!var9_4) ** GOTO lbl107
                throw null;
            }
            case 29: {
                var8_5 /* !! */  = (int)gv.gfcc("gmqd", gfbz(int ), (int)1390);
                if (!var9_4) ** GOTO lbl55
                throw null;
            }
            case 30: {
                var8_5 /* !! */  = (int)gv.gfcc("gmqf", gfbz(int ), (int)1391);
                if (!var9_4) ** GOTO lbl85
                throw null;
            }
            case 31: 
        }
        var8_5 /* !! */  = (int)gv.gfcc("gmqg", gfbz(int ), (int)1392);
        ** while (!var9_4)
lbl194:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gqno() {
        gv.gfdf[200] = 3708171799757671617L;
        gv.gfdf[201] = 4893533081737934423L;
        gv.gfdf[202] = -7053687582750441118L;
        gv.gfdf[203] = -1981121854900541322L;
        gv.gfdf[204] = -8182471803591398904L;
        gv.gfdf[205] = 6887423307364557423L;
        gv.gfdf[206] = -4508966999959462090L;
        gv.gfdf[207] = 6465973455705551599L;
        gv.gfdf[208] = 2522015006023480154L;
        gv.gfdf[209] = 6321678661478847725L;
        gv.gfdf[210] = 8452314205294615590L;
        gv.gfdf[211] = 5911634779728376170L;
        gv.gfdf[212] = 2667306374453079650L;
        gv.gfdf[213] = -3412596747687610197L;
        gv.gfdf[214] = -5144835798821432L;
        gv.gfdf[215] = 1895848369487552010L;
        gv.gfdf[216] = -811741945730097307L;
        gv.gfdf[217] = -2611784159935621921L;
        gv.gfdf[218] = 642311815869130499L;
        gv.gfdf[219] = 8333604003463283264L;
        gv.gfdf[220] = -2035958798396653750L;
        gv.gfdf[221] = -7589374804015215376L;
        gv.gfdf[222] = 636609311579714575L;
        gv.gfdf[223] = -556515468403234520L;
        gv.gfdf[224] = -2955851871222650212L;
        gv.gfdf[225] = 1009065904660332690L;
        gv.gfdf[226] = -3263703709137924388L;
        gv.gfdf[227] = 3617622090543993428L;
        gv.gfdf[228] = -5391651063730560773L;
        gv.gfdf[229] = -7137807877897165228L;
        gv.gfdf[230] = 263092927008420389L;
        gv.gfdf[231] = -8243021946970292545L;
        gv.gfdf[232] = -4930841674862486267L;
        gv.gfdf[233] = 2059776191863625962L;
        gv.gfdf[234] = 4764972844941050823L;
        gv.gfdf[235] = -7321119514609635982L;
        gv.gfdf[236] = -1083415627845512951L;
        gv.gfdf[237] = 3342859109601744714L;
        gv.gfdf[238] = 1207782428132789327L;
        gv.gfdf[239] = 4490225364270274770L;
        gv.gfdf[240] = 1276367529207669575L;
        gv.gfdf[241] = -1533802432364229291L;
        gv.gfdf[242] = 7130746426939010780L;
        gv.gfdf[243] = -9069396796631081591L;
        gv.gfdf[244] = 1248166260375482786L;
        gv.gfdf[245] = 8763644631102919763L;
        gv.gfdf[246] = -3628911382526183763L;
        gv.gfdf[247] = 8817575722167260532L;
        gv.gfdf[248] = 7650909694215741427L;
        gv.gfdf[249] = -8023787172843209505L;
        gv.gfdf[250] = -7190432336257634366L;
        gv.gfdf[251] = -3350418509608087900L;
        gv.gfdf[252] = -3289390686661936272L;
        gv.gfdf[253] = 3964567187133940128L;
        gv.gfdf[254] = -7178805704773385696L;
        gv.gfdf[255] = 6530775540022194677L;
        gv.gfdf[256] = -7017318359705802142L;
        gv.gfdf[257] = 5941984643888414308L;
        gv.gfdf[258] = -7099459096183209376L;
        gv.gfdf[259] = -3935484976889424290L;
        gv.gfdf[260] = -4411353868247056811L;
        gv.gfdf[261] = 3418713095834284763L;
        gv.gfdf[262] = 7920724352818622201L;
        gv.gfdf[263] = 2007180107182963050L;
        gv.gfdf[264] = 4599919529585545709L;
        gv.gfdf[265] = 6403848509442456882L;
        gv.gfdf[266] = 3370140177243324722L;
        gv.gfdf[267] = 5049995014270823659L;
        gv.gfdf[268] = -2794788623307877925L;
        gv.gfdf[269] = 7556333241796686513L;
        gv.gfdf[270] = -8185282493722629628L;
        gv.gfdf[271] = -5408933481745153534L;
        gv.gfdf[272] = 8572972384065193354L;
        gv.gfdf[273] = -7653657043391544101L;
        gv.gfdf[274] = -4713194570624161851L;
        gv.gfdf[275] = -6925880866986851336L;
        gv.gfdf[276] = -583947411497804091L;
        gv.gfdf[277] = 8239997678593208856L;
        gv.gfdf[278] = -4700725399427614003L;
        gv.gfdf[279] = 210488246556075197L;
        gv.gfdf[280] = -8983557319101660504L;
        gv.gfdf[281] = 7785794647212046128L;
        gv.gfdf[282] = -7948884456790994525L;
        gv.gfdf[283] = 6290825808855575820L;
        gv.gfdf[284] = -3602543399612512033L;
        gv.gfdf[285] = 4763764644163069604L;
        gv.gfdf[286] = 5758026844019596084L;
        gv.gfdf[287] = 5106908136600937918L;
        gv.gfdf[288] = 6347093942611694407L;
        gv.gfdf[289] = -7238274426911377357L;
        gv.gfdf[290] = -4421071567891316957L;
        gv.gfdf[291] = -8357052624648563240L;
        gv.gfdf[292] = 3481940542482795121L;
        gv.gfdf[293] = -7932251202704962174L;
        gv.gfdf[294] = -1445573680526314292L;
        gv.gfdf[295] = 1222998050066281387L;
        gv.gfdf[296] = -3276638215691724432L;
        gv.gfdf[297] = -5925950369049537728L;
        gv.gfdf[298] = 5526017591343595056L;
        gv.gfdf[299] = -2087255814695086152L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_2338 createExploreTarget() {
        block101: {
            block98: {
                block100: {
                    block99: {
                        block97: {
                            var14_1 = gv.c;
                            var13_2 /* !! */  = gv.b;
                            var12_3 = gv.a;
                            if (var14_1) {
                                throw null;
lbl6:
                                // 27 sources

                                return null;
                            }
                            if (var12_3 || var12_3) ** GOTO lbl6
                            var1_4 = gv.EXPLORE_DIRECTIONS[this.exploreDirectionIndex];
                            if (var12_3 || var12_3) ** GOTO lbl6
                            var2_5 = gv.mc.field_1687.method_8621();
                            if (var12_3 || var12_3) ** GOTO lbl6
                            var3_6 = gv.mc.field_1724.method_31477();
                            if (var12_3 || var12_3) ** GOTO lbl6
                            var4_7 = gv.mc.field_1724.method_31479();
                            if (var12_3 || var12_3) ** GOTO lbl6
                            var5_8 = var3_6 + var1_4[0] * gv.gfcc("ghqk", gfbz(int ), (int)803);
                            if (var12_3 || var12_3) ** GOTO lbl6
                            var6_9 = var4_7 + var1_4[1] * gv.gfcc("ghqm", gfbz(int ), (int)804);
                            if (var12_3 || var12_3) ** GOTO lbl6
                            var7_10 = Math.min(gv.CAVE_SEARCH_LEVELS[this.caveLevelIndex], (int)gv.gfcc("ghqn", gfbz(int ), (int)805));
                            if (var12_3 || var12_3) ** GOTO lbl6
                            var8_11 = (int)Math.ceil(var2_5.method_11976()) + gv.gfcc("ghqo", gfbz(int ), (int)806);
                            if (var12_3 || var12_3) ** GOTO lbl6
                            var9_12 = (int)Math.floor(var2_5.method_11963()) - gv.gfcc("ghqp", gfbz(int ), (int)807);
                            if (var12_3 || var12_3) ** GOTO lbl6
                            var10_13 = (int)Math.ceil(var2_5.method_11958()) + gv.gfcc("ghqq", gfbz(int ), (int)808);
                            if (var12_3 || var12_3) ** GOTO lbl6
                            var11_14 = (int)Math.floor(var2_5.method_11977()) - gv.gfcc("ghqr", gfbz(int ), (int)809);
                            if (var12_3 || var12_3) ** GOTO lbl6
                            var5_8 = Math.max(var8_11, Math.min(var9_12, var5_8));
                            if (var12_3 || var12_3) ** GOTO lbl6
                            var6_9 = Math.max(var10_13, Math.min(var11_14, var6_9));
                            if (var12_3 || var12_3) ** GOTO lbl6
                            if (var1_4[0] <= 0) break block97;
                            if (var12_3) ** GOTO lbl6
                            if (var3_6 >= var9_12 - gv.gfcc("ghqz", gfbz(int ), (int)810)) break block98;
                            if (var12_3) ** GOTO lbl6
                        }
                        if (var12_3 || var12_3) ** GOTO lbl6
                        if (var1_4[0] >= 0) break block99;
                        if (var12_3) ** GOTO lbl6
                        if (var3_6 <= var8_11 + gv.gfcc("ghrb", gfbz(int ), (int)811)) break block98;
                        if (var12_3) ** GOTO lbl6
                    }
                    if (var12_3 || var12_3) ** GOTO lbl6
                    if (var1_4[1] <= 0) break block100;
                    if (var12_3) ** GOTO lbl6
                    if (var4_7 >= var11_14 - gv.gfcc("ghre", gfbz(int ), (int)812)) break block98;
                    if (var12_3) ** GOTO lbl6
                }
                if (var12_3 || var12_3) ** GOTO lbl6
                if (var1_4[1] >= 0) break block101;
                if (var12_3) ** GOTO lbl6
                if (var4_7 > var10_13 + gv.gfcc("ghrh", gfbz(int ), (int)813)) break block101;
                if (var12_3) ** GOTO lbl6
            }
            if (var12_3 || var12_3) ** GOTO lbl6
            return null;
        }
        if (var13_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var13_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var12_3 && !var12_3) ** break;
                ** continue;
                return new class_2338(var5_8, var7_10, var6_9);
            }
            case 0: {
                var13_2 /* !! */  = (int)gv.gfcc("ghrk", gfbz(int ), (int)814);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl177
            }
            case 1: {
                var13_2 /* !! */  = (int)gv.gfcc("ghrl", gfbz(int ), (int)815);
                if (var14_1) {
                    throw null;
                }
            }
            case 2: {
                var13_2 /* !! */  = (int)gv.gfcc("ghrm", gfbz(int ), (int)816);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl116
            }
lbl81:
            // 2 sources

            case 3: {
                var13_2 /* !! */  = (int)gv.gfcc("ghru", gfbz(int ), (int)817);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl121
            }
            case 4: {
                var13_2 /* !! */  = (int)gv.gfcc("ghrv", gfbz(int ), (int)818);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl270
            }
            case 5: {
                var13_2 /* !! */  = (int)gv.gfcc("ghsd", gfbz(int ), (int)819);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl234
            }
lbl96:
            // 2 sources

            case 6: {
                var13_2 /* !! */  = (int)gv.gfcc("ghsf", gfbz(int ), (int)820);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl101:
            // 2 sources

            case 7: {
                var13_2 /* !! */  = (int)gv.gfcc("ghsk", gfbz(int ), (int)821);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl183
            }
            case 8: {
                var13_2 /* !! */  = (int)gv.gfcc("ghsl", gfbz(int ), (int)822);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl262
            }
            case 9: {
                var13_2 /* !! */  = (int)gv.gfcc("ghsm", gfbz(int ), (int)823);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl250
            }
lbl116:
            // 4 sources

            case 10: {
                var13_2 /* !! */  = (int)gv.gfcc("ghsn", gfbz(int ), (int)824);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl121:
            // 2 sources

            case 11: {
                var13_2 /* !! */  = (int)gv.gfcc("ghso", gfbz(int ), (int)825);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl144
            }
            case 12: {
                var13_2 /* !! */  = (int)gv.gfcc("ghsp", gfbz(int ), (int)826);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl234
            }
lbl131:
            // 2 sources

            case 13: {
                var13_2 /* !! */  = (int)gv.gfcc("ghsq", gfbz(int ), (int)827);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl258
            }
lbl136:
            // 2 sources

            case 14: {
                var13_2 /* !! */  = (int)gv.gfcc("ghss", gfbz(int ), (int)828);
                if (!var14_1) ** GOTO lbl96
                throw null;
            }
            case 15: {
                var13_2 /* !! */  = (int)gv.gfcc("ghsw", gfbz(int ), (int)829);
                if (!var14_1) ** GOTO lbl116
                throw null;
            }
lbl144:
            // 2 sources

            case 16: {
                var13_2 /* !! */  = (int)gv.gfcc("ghsx", gfbz(int ), (int)830);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl270
            }
            case 17: {
                var13_2 /* !! */  = (int)gv.gfcc("ghsz", gfbz(int ), (int)831);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl234
            }
            case 18: {
                var13_2 /* !! */  = (int)gv.gfcc("ghtc", gfbz(int ), (int)832);
                if (!var14_1) ** GOTO lbl131
                throw null;
            }
            case 19: {
                var13_2 /* !! */  = (int)gv.gfcc("ghth", gfbz(int ), (int)833);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl163:
            // 2 sources

            case 20: {
                var13_2 /* !! */  = (int)gv.gfcc("ghti", gfbz(int ), (int)834);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl168:
            // 3 sources

            case 21: {
                var13_2 /* !! */  = (int)gv.gfcc("ghtq", gfbz(int ), (int)835);
                if (!var14_1) ** GOTO lbl116
                throw null;
            }
            case 22: {
                var13_2 /* !! */  = (int)gv.gfcc("ghts", gfbz(int ), (int)836);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl250
            }
lbl177:
            // 4 sources

            case 23: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var13_2 /* !! */  = (int)gv.gfcc("ghtu", gfbz(int ), (int)837);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl242
                    break;
                }
            }
lbl183:
            // 3 sources

            case 24: {
                var13_2 /* !! */  = (int)gv.gfcc("ghtv", gfbz(int ), (int)838);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl266
            }
lbl188:
            // 3 sources

            case 25: {
                var13_2 /* !! */  = (int)gv.gfcc("ghtw", gfbz(int ), (int)839);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl266
            }
lbl193:
            // 2 sources

            case 26: {
                var13_2 /* !! */  = (int)gv.gfcc("ghtx", gfbz(int ), (int)840);
                if (var14_1) {
                    throw null;
                }
            }
lbl197:
            // 6 sources

            case 27: {
                var13_2 /* !! */  = (int)gv.gfcc("ghty", gfbz(int ), (int)841);
                if (var14_1) {
                    throw null;
                }
            }
            case 28: {
                var13_2 /* !! */  = (int)gv.gfcc("ghtz", gfbz(int ), (int)842);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl266
            }
            case 29: {
                var13_2 /* !! */  = (int)gv.gfcc("ghub", gfbz(int ), (int)843);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl262
            }
            case 30: {
                var13_2 /* !! */  = (int)gv.gfcc("ghuc", gfbz(int ), (int)844);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl270
            }
            case 31: {
                var13_2 /* !! */  = (int)gv.gfcc("ghuf", gfbz(int ), (int)845);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl266
            }
            case 32: {
                var13_2 /* !! */  = (int)gv.gfcc("ghui", gfbz(int ), (int)846);
                if (!var14_1) ** GOTO lbl188
                throw null;
            }
            case 33: {
                var13_2 /* !! */  = (int)gv.gfcc("ghuj", gfbz(int ), (int)847);
                if (!var14_1) ** GOTO lbl81
                throw null;
            }
            case 34: {
                var13_2 /* !! */  = (int)gv.gfcc("ghuk", gfbz(int ), (int)848);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl258
            }
lbl234:
            // 4 sources

            case 35: {
                var13_2 /* !! */  = (int)gv.gfcc("ghus", gfbz(int ), (int)849);
                if (!var14_1) ** GOTO lbl193
                throw null;
            }
            case 36: {
                var13_2 /* !! */  = (int)gv.gfcc("ghuu", gfbz(int ), (int)850);
                if (!var14_1) ** GOTO lbl163
                throw null;
            }
lbl242:
            // 2 sources

            case 37: {
                var13_2 /* !! */  = (int)gv.gfcc("ghuw", gfbz(int ), (int)851);
                if (!var14_1) ** GOTO lbl177
                throw null;
            }
lbl246:
            // 3 sources

            case 38: {
                var13_2 /* !! */  = (int)gv.gfcc("ghuy", gfbz(int ), (int)852);
                if (!var14_1) ** GOTO lbl188
                throw null;
            }
lbl250:
            // 3 sources

            case 39: {
                var13_2 /* !! */  = (int)gv.gfcc("ghvb", gfbz(int ), (int)853);
                if (!var14_1) break;
                throw null;
            }
            case 40: {
                var13_2 /* !! */  = (int)gv.gfcc("ghvd", gfbz(int ), (int)854);
                if (var14_1) {
                    throw null;
                }
            }
lbl258:
            // 5 sources

            case 41: {
                var13_2 /* !! */  = (int)gv.gfcc("ghve", gfbz(int ), (int)855);
                if (!var14_1) ** GOTO lbl183
                throw null;
            }
lbl262:
            // 3 sources

            case 42: {
                var13_2 /* !! */  = (int)gv.gfcc("ghvm", gfbz(int ), (int)856);
                if (!var14_1) ** GOTO lbl246
                throw null;
            }
lbl266:
            // 5 sources

            case 43: {
                var13_2 /* !! */  = (int)gv.gfcc("ghvn", gfbz(int ), (int)857);
                if (!var14_1) ** GOTO lbl246
                throw null;
            }
lbl270:
            // 4 sources

            case 44: {
                var13_2 /* !! */  = (int)gv.gfcc("ghvp", gfbz(int ), (int)858);
                if (!var14_1) ** GOTO lbl136
                throw null;
            }
            case 45: {
                var13_2 /* !! */  = (int)gv.gfcc("ghvs", gfbz(int ), (int)859);
                if (!var14_1) ** GOTO lbl197
                throw null;
            }
            case 46: {
                var13_2 /* !! */  = (int)gv.gfcc("ghvv", gfbz(int ), (int)860);
                if (!var14_1) ** GOTO lbl101
                throw null;
            }
            case 47: {
                var13_2 /* !! */  = (int)gv.gfcc("ghvx", gfbz(int ), (int)861);
                if (!var14_1) ** GOTO lbl177
                throw null;
            }
            case 48: 
        }
        var13_2 /* !! */  = (int)gv.gfcc("ghvz", gfbz(int ), (int)862);
        ** while (!var14_1)
lbl289:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gqkk() {
        gv.gfde[0] = -1628008585376799020L;
        gv.gfde[1] = 6533234015512529917L;
        gv.gfde[2] = 4275186745550872614L;
        gv.gfde[3] = 6808723276071139192L;
        gv.gfde[4] = -100295376308647354L;
        gv.gfde[5] = -7093117326852389174L;
        gv.gfde[6] = 931987858600915626L;
        gv.gfde[7] = -6252096105160872482L;
        gv.gfde[8] = 779573254645402251L;
        gv.gfde[9] = -4340752713272151926L;
        gv.gfde[10] = 7940045753641293353L;
        gv.gfde[11] = 9108898995270955716L;
        gv.gfde[12] = 404535710005210888L;
        gv.gfde[13] = 3036167544262039277L;
        gv.gfde[14] = -7651267626394754877L;
        gv.gfde[15] = 1354276282335686632L;
        gv.gfde[16] = 5892559930311917704L;
        gv.gfde[17] = 7946909255573550174L;
        gv.gfde[18] = -7137127437302509576L;
        gv.gfde[19] = 3618836542231999578L;
        gv.gfde[20] = 6703169887967679507L;
        gv.gfde[21] = 286055798504713830L;
        gv.gfde[22] = 1958259534672949692L;
        gv.gfde[23] = -8456493218209051900L;
        gv.gfde[24] = 818665157581131779L;
        gv.gfde[25] = 6521107026821214097L;
        gv.gfde[26] = -2935528795873284898L;
        gv.gfde[27] = 8955469999106788632L;
        gv.gfde[28] = 8250098568147499892L;
        gv.gfde[29] = -5087350908777898948L;
        gv.gfde[30] = -5472619483996146311L;
        gv.gfde[31] = -5198898971856268873L;
        gv.gfde[32] = -7561015336631521661L;
        gv.gfde[33] = 7099131530032110281L;
        gv.gfde[34] = -7560248392255118637L;
        gv.gfde[35] = 3186557165979668813L;
        gv.gfde[36] = -4434355366755601304L;
        gv.gfde[37] = 3829206038739164713L;
        gv.gfde[38] = 9214617938988200883L;
        gv.gfde[39] = -8839976184960303060L;
        gv.gfde[40] = 6588145604227072259L;
        gv.gfde[41] = -5850875347828701259L;
        gv.gfde[42] = 1831276302676163385L;
        gv.gfde[43] = -375755145130249632L;
        gv.gfde[44] = 1944907647961270198L;
        gv.gfde[45] = 3688970917158405019L;
        gv.gfde[46] = 8674110794814332851L;
        gv.gfde[47] = -1953824192713919106L;
        gv.gfde[48] = 8351138643888356725L;
        gv.gfde[49] = 8153971811864041776L;
        gv.gfde[50] = -9075254755909307442L;
        gv.gfde[51] = 6021681199701681498L;
        gv.gfde[52] = 6373448381611002999L;
        gv.gfde[53] = 7971479314084521791L;
        gv.gfde[54] = 784590098546711097L;
        gv.gfde[55] = -6791626922242187933L;
        gv.gfde[56] = -5381717863371269775L;
        gv.gfde[57] = 1676251249916885564L;
        gv.gfde[58] = -7351943069263983710L;
        gv.gfde[59] = -5155760092752882876L;
        gv.gfde[60] = -8887866630140672461L;
        gv.gfde[61] = 8588262254281615676L;
        gv.gfde[62] = 8488897342520339490L;
        gv.gfde[63] = 3225950816923829525L;
        gv.gfde[64] = -9112798480510219528L;
        gv.gfde[65] = 4863794408016413956L;
        gv.gfde[66] = 4516929498874261922L;
        gv.gfde[67] = -1588321492746306527L;
        gv.gfde[68] = -2503326505303690014L;
        gv.gfde[69] = -7622097082307183638L;
        gv.gfde[70] = -1694569913657786762L;
        gv.gfde[71] = 1991506102422152514L;
        gv.gfde[72] = -2985002524442590044L;
        gv.gfde[73] = -741868946540440063L;
        gv.gfde[74] = -3310468015221321141L;
        gv.gfde[75] = 3300506245009044754L;
        gv.gfde[76] = -5211090077692862377L;
        gv.gfde[77] = -4211350105091589857L;
        gv.gfde[78] = 8460540789215210253L;
        gv.gfde[79] = -1334989542203285188L;
        gv.gfde[80] = -8940019578169843366L;
        gv.gfde[81] = 3704617703086431064L;
        gv.gfde[82] = 8178787276412949749L;
        gv.gfde[83] = -7802098663764651023L;
        gv.gfde[84] = 2798446413422752638L;
        gv.gfde[85] = 4831429844582049430L;
        gv.gfde[86] = -7807017384814086789L;
        gv.gfde[87] = -2697980196911509143L;
        gv.gfde[88] = -6694327538233445921L;
        gv.gfde[89] = -2315073857713934296L;
        gv.gfde[90] = 4381649871800290892L;
        gv.gfde[91] = 1324291468678476166L;
        gv.gfde[92] = 9182066190827068592L;
        gv.gfde[93] = 5580718597681008754L;
        gv.gfde[94] = 3363266637664261735L;
        gv.gfde[95] = -2916178965027049620L;
        gv.gfde[96] = 9174942611014351674L;
        gv.gfde[97] = 6033708904859099443L;
        gv.gfde[98] = -7003099141312679968L;
        gv.gfde[99] = -6649473745548383410L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onChat(bp var1_1) {
        v0 /* !! */  = gv.nl;
        if (true) ** GOTO lbl5
        block55: while (true) {
            v0 /* !! */  = (long)(gv.gfcc("gfhg", gfdd(int ), (int)19) - gv.gfcc("gfhf", gfdd(int ), (int)18));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1185080505: {
                    break block55;
                }
                case 1201014528: {
                    continue block55;
                }
            }
            break;
        }
        var5_2 = gv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = gv.nl - gv.gfcc("gfhh", gfdd(int ), (int)20)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == gv.gfcc("gfhi", gfbz(int ), (int)110)) break;
            v1 /* !! */  = (long)gv.gfcc("gfhj", gfbz(int ), (int)111);
        }
        var4_3 /* !! */  = gv.b;
        v2 /* !! */  = gv.nl;
        if (true) ** GOTO lbl21
        block57: while (true) {
            v2 /* !! */  = (long)(v3 - gv.gfcc("gfhk", gfdd(int ), (int)21));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1663870515: {
                    v3 = gv.gfcc("gfhl", gfdd(int ), (int)22);
                    continue block57;
                }
                case -998079508: {
                    v3 = gv.gfcc("gfhm", gfdd(int ), (int)23);
                    continue block57;
                }
                case 1185080505: {
                    break block57;
                }
                case 1257661558: {
                    v3 = gv.gfcc("gfhn", gfdd(int ), (int)24);
                    continue block57;
                }
            }
            break;
        }
        var3_4 = gv.a;
        if (var5_2) {
            throw null;
lbl36:
            // 10 sources

            return;
        }
        if (var3_4 || var3_4) ** GOTO lbl36
        v4 /* !! */  = gv.nl;
        if (true) ** GOTO lbl43
        block59: while (true) {
            v4 /* !! */  = (long)(gv.gfcc("gfhp", gfdd(int ), (int)26) - gv.gfcc("gfho", gfdd(int ), (int)25));
lbl43:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 1185080505: {
                    break block59;
                }
                case 1657813141: {
                    continue block59;
                }
            }
            break;
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = gv.nl - gv.gfcc("gfhq", gfdd(int ), (int)27)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == gv.gfcc("gfhr", gfbz(int ), (int)112)) break;
            v5 /* !! */  = (long)gv.gfcc("gfhs", gfbz(int ), (int)113);
        }
        if (gv.mc.field_1724 == null) ** GOTO lbl-1000
        if (var3_4) ** GOTO lbl36
        v6 /* !! */  = gv.nl;
        if (true) ** GOTO lbl59
        block61: while (true) {
            v6 /* !! */  = (long)(gv.gfcc("gfhu", gfdd(int ), (int)29) - gv.gfcc("gfht", gfdd(int ), (int)28));
lbl59:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case 1185080505: {
                    break block61;
                }
                case 2023219481: {
                    continue block61;
                }
            }
            break;
        }
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = gv.nl - gv.gfcc("gfhv", gfdd(int ), (int)30)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == gv.gfcc("gfhw", gfbz(int ), (int)114)) break;
            v7 /* !! */  = (long)gv.gfcc("gfhx", gfbz(int ), (int)115);
        }
        if (gv.mc.field_1687 == null) ** GOTO lbl-1000
        if (var3_4) ** GOTO lbl36
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_3 = gv.nl - gv.gfcc("gfhy", gfdd(int ), (int)31)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == gv.gfcc("gfhz", gfbz(int ), (int)116)) break;
            v8 /* !! */  = (long)gv.gfcc("gfia", gfbz(int ), (int)117);
        }
        if (var1_1.getMessage() != null) ** GOTO lbl83
        if (var3_4) ** GOTO lbl36
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 4 sources

            {
                if (var3_4 || var3_4) ** GOTO lbl36
                return;
            }
lbl83:
            // 1 sources

            if (var3_4 || var3_4) ** GOTO lbl36
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_4 = gv.nl - gv.gfcc("gfib", gfdd(int ), (int)32)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == gv.gfcc("gfic", gfbz(int ), (int)118)) break;
                v9 /* !! */  = (long)gv.gfcc("gfid", gfbz(int ), (int)119);
            }
            v10 = var1_1.getMessage();
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_5 = gv.nl - gv.gfcc("gfie", gfdd(int ), (int)33)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == gv.gfcc("gfif", gfbz(int ), (int)120)) break;
                v11 /* !! */  = (long)gv.gfcc("gfig", gfbz(int ), (int)121);
            }
            v12 /* !! */  = gv.nl;
            if (true) ** GOTO lbl99
            block66: while (true) {
                v12 /* !! */  = (long)(gv.gfcc("gfii", gfdd(int ), (int)35) - gv.gfcc("gfih", gfdd(int ), (int)34));
lbl99:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case -659119230: {
                        continue block66;
                    }
                    case 1185080505: {
                        break block66;
                    }
                }
                break;
            }
            var2_5 = v10.toLowerCase(Locale.ROOT);
            if (var3_4 || var3_4) ** GOTO lbl36
            v13 /* !! */  = gv.nl;
            if (true) ** GOTO lbl110
            block67: while (true) {
                v13 /* !! */  = (long)(v14 - gv.gfcc("gfij", gfdd(int ), (int)36));
lbl110:
                // 2 sources

                switch ((int)v13 /* !! */ ) {
                    case -749217143: {
                        v14 = gv.gfcc("gfik", gfdd(int ), (int)37);
                        continue block67;
                    }
                    case 561337754: {
                        v14 = gv.gfcc("gfil", gfdd(int ), (int)38);
                        continue block67;
                    }
                    case 1094194097: {
                        v14 = gv.gfcc("gfim", gfdd(int ), (int)39);
                        continue block67;
                    }
                    case 1185080505: {
                        break block67;
                    }
                }
                break;
            }
            if (!this.isRegionDenyMessage(var2_5)) ** GOTO lbl142
            if (var3_4 || var3_4) ** GOTO lbl36
            v15 /* !! */  = gv.nl;
            if (true) ** GOTO lbl128
            block68: while (true) {
                v15 /* !! */  = (long)(v16 - gv.gfcc("gfin", gfdd(int ), (int)40));
lbl128:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case -1203570078: {
                        v16 = gv.gfcc("gfio", gfdd(int ), (int)41);
                        continue block68;
                    }
                    case 958228154: {
                        v16 = gv.gfcc("gfip", gfdd(int ), (int)42);
                        continue block68;
                    }
                    case 960065070: {
                        v16 = gv.gfcc("gfiq", gfdd(int ), (int)43);
                        continue block68;
                    }
                    case 1185080505: {
                        break block68;
                    }
                }
                break;
            }
            this.handleRegionDeny();
            if (var3_4) ** GOTO lbl36
lbl142:
            // 2 sources

            if (!var3_4 && !var3_4) ** break;
            ** continue;
            return;
lbl145:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)gv.gfcc("gfir", gfbz(int ), (int)122);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl170
            }
lbl150:
            // 2 sources

            case 1: {
                var4_3 /* !! */  = (int)gv.gfcc("gfis", gfbz(int ), (int)123);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl199
            }
            case 2: {
                var4_3 /* !! */  = (int)gv.gfcc("gfit", gfbz(int ), (int)124);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl165
            }
            case 3: {
                var4_3 /* !! */  = (int)gv.gfcc("gfiu", gfbz(int ), (int)125);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl165:
            // 2 sources

            case 4: {
                var4_3 /* !! */  = (int)gv.gfcc("gfiv", gfbz(int ), (int)126);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl170:
            // 2 sources

            case 5: {
                var4_3 /* !! */  = (int)gv.gfcc("gfiw", gfbz(int ), (int)127);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl175:
            // 2 sources

            case 6: {
                var4_3 /* !! */  = (int)gv.gfcc("gfix", gfbz(int ), (int)128);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl199
            }
lbl180:
            // 2 sources

            case 7: {
                var4_3 /* !! */  = (int)gv.gfcc("gfiy", gfbz(int ), (int)129);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl208
            }
            case 8: {
                var4_3 /* !! */  = (int)gv.gfcc("gfiz", gfbz(int ), (int)130);
                if (!var5_2) ** GOTO lbl175
                throw null;
            }
            case 9: {
                var4_3 /* !! */  = (int)gv.gfcc("gfja", gfbz(int ), (int)131);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl220
            }
            case 10: {
                do {
                    var4_3 /* !! */  = (int)gv.gfcc("gfjb", gfbz(int ), (int)132);
                } while (!var5_2);
                throw null;
            }
lbl199:
            // 3 sources

            case 11: {
                var4_3 /* !! */  = (int)gv.gfcc("gfjc", gfbz(int ), (int)133);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl204:
            // 2 sources

            case 12: {
                var4_3 /* !! */  = (int)gv.gfcc("gfjd", gfbz(int ), (int)134);
                if (!var5_2) ** GOTO lbl150
                throw null;
            }
lbl208:
            // 2 sources

            case 13: {
                var4_3 /* !! */  = (int)gv.gfcc("gfje", gfbz(int ), (int)135);
                if (!var5_2) break;
                throw null;
            }
lbl212:
            // 3 sources

            case 14: {
                var4_3 /* !! */  = (int)gv.gfcc("gfjf", gfbz(int ), (int)136);
                if (!var5_2) ** GOTO lbl180
                throw null;
            }
lbl216:
            // 2 sources

            case 15: {
                var4_3 /* !! */  = (int)gv.gfcc("gfjg", gfbz(int ), (int)137);
                if (!var5_2) ** GOTO lbl212
                throw null;
            }
lbl220:
            // 2 sources

            case 16: {
                var4_3 /* !! */  = (int)gv.gfcc("gfjh", gfbz(int ), (int)138);
                if (!var5_2) ** GOTO lbl145
                throw null;
            }
lbl224:
            // 2 sources

            case 17: {
                var4_3 /* !! */  = (int)gv.gfcc("gfji", gfbz(int ), (int)139);
                if (!var5_2) break;
                throw null;
            }
            case 18: 
        }
        do {
            var4_3 /* !! */  = (int)gv.gfcc("gfjj", gfbz(int ), (int)140);
        } while (!var5_2);
        throw null;
    }

    private static /* synthetic */ void gqlr() {
        gv.gfde[400] = -4817505088928347675L;
        gv.gfde[401] = -849921399442246703L;
        gv.gfde[402] = -8727346041561522981L;
        gv.gfde[403] = 1688875970884845440L;
        gv.gfde[404] = 5983750460597576985L;
        gv.gfde[405] = -861952412826545917L;
        gv.gfde[406] = -227794604019551377L;
        gv.gfde[407] = 6172316546993950335L;
        gv.gfde[408] = -4723939635742177707L;
        gv.gfde[409] = -1221714299981805756L;
        gv.gfde[410] = -4782049041401385990L;
        gv.gfde[411] = -5091578013929130244L;
        gv.gfde[412] = 1949426745107187034L;
        gv.gfde[413] = -2033865863155280646L;
        gv.gfde[414] = -9098355614320677155L;
        gv.gfde[415] = -3042089531214785315L;
        gv.gfde[416] = 2470026874637227524L;
        gv.gfde[417] = -1084358000889994129L;
        gv.gfde[418] = -2039460447593513983L;
        gv.gfde[419] = 1360723576854125084L;
        gv.gfde[420] = -3275283772712460540L;
        gv.gfde[421] = 5385874981247582606L;
        gv.gfde[422] = 1903976106530300584L;
        gv.gfde[423] = -6613454186459625212L;
        gv.gfde[424] = -4204890136886972808L;
        gv.gfde[425] = 3910848372933587510L;
        gv.gfde[426] = 194060171007933040L;
        gv.gfde[427] = -2416030072552260632L;
        gv.gfde[428] = -1775020855102709078L;
        gv.gfde[429] = -6740824191161207275L;
        gv.gfde[430] = -7857855888451484445L;
        gv.gfde[431] = -2812803087608172243L;
        gv.gfde[432] = -6551692091212860218L;
        gv.gfde[433] = -1225273946400694582L;
        gv.gfde[434] = 4037153124977233098L;
        gv.gfde[435] = 8143617873781545089L;
        gv.gfde[436] = 2215107032652590409L;
        gv.gfde[437] = 6392190415329356846L;
        gv.gfde[438] = -4365083353804366295L;
        gv.gfde[439] = 2361190022591986132L;
        gv.gfde[440] = 317074277964351317L;
        gv.gfde[441] = 3263593012680506940L;
        gv.gfde[442] = -2272760789945760980L;
        gv.gfde[443] = 2816645137931486599L;
        gv.gfde[444] = -7809173984509776144L;
        gv.gfde[445] = -9184609112750601616L;
        gv.gfde[446] = -6998000416656700895L;
        gv.gfde[447] = -5514080840344327179L;
        gv.gfde[448] = 6043697252784136773L;
        gv.gfde[449] = -6761750716644555931L;
        gv.gfde[450] = -2114825816077627232L;
        gv.gfde[451] = 1288788772513972102L;
        gv.gfde[452] = -6787034317110418561L;
        gv.gfde[453] = -3250582481007718563L;
        gv.gfde[454] = -5195683863335723485L;
        gv.gfde[455] = -6018550529800315958L;
        gv.gfde[456] = -1959111470663317841L;
        gv.gfde[457] = -3810281151505612913L;
        gv.gfde[458] = 5951832458358518909L;
        gv.gfde[459] = -8993456853846862465L;
        gv.gfde[460] = -4938792956743090925L;
        gv.gfde[461] = 403942293681912541L;
        gv.gfde[462] = 8683803281926389316L;
        gv.gfde[463] = 4894380176943853710L;
        gv.gfde[464] = 5574142862791277436L;
        gv.gfde[465] = -7066298420936317827L;
        gv.gfde[466] = -4476336017771807564L;
        gv.gfde[467] = -3760527654827222818L;
        gv.gfde[468] = 6115424490096119098L;
        gv.gfde[469] = -6791806670974378044L;
        gv.gfde[470] = 6572619297195859750L;
        gv.gfde[471] = -4448560670950866893L;
        gv.gfde[472] = 6970447214432450298L;
        gv.gfde[473] = 1837306682857867645L;
        gv.gfde[474] = 3289633989903043990L;
        gv.gfde[475] = -6764764842931835366L;
        gv.gfde[476] = -9206942950190034736L;
        gv.gfde[477] = 7258219220902499353L;
        gv.gfde[478] = -2902849539307364143L;
        gv.gfde[479] = -6307314965467626408L;
        gv.gfde[480] = -5508872955626480673L;
        gv.gfde[481] = -3454637834471924415L;
        gv.gfde[482] = -1952742644931489822L;
        gv.gfde[483] = -1996177151234803259L;
        gv.gfde[484] = -103878426209790678L;
        gv.gfde[485] = -6665262993067577546L;
        gv.gfde[486] = 1321996751034147504L;
        gv.gfde[487] = -959593949646442175L;
        gv.gfde[488] = 89550506323246428L;
        gv.gfde[489] = 3525147002648181340L;
        gv.gfde[490] = 5931310104310381488L;
        gv.gfde[491] = -1271124284192209845L;
        gv.gfde[492] = -2969219928281596733L;
        gv.gfde[493] = -6634680712678876118L;
        gv.gfde[494] = -1363085237298786697L;
        gv.gfde[495] = 8905605097600016535L;
        gv.gfde[496] = -978662556176198666L;
        gv.gfde[497] = 238882688520704667L;
        gv.gfde[498] = -2735503847810594681L;
        gv.gfde[499] = 7052065986107010925L;
    }

    private static /* synthetic */ void gpvp() {
        gv.gfca[300] = -1546727789;
        gv.gfca[301] = 1934509962;
        gv.gfca[302] = -1805065632;
        gv.gfca[303] = -1709361415;
        gv.gfca[304] = 1470434638;
        gv.gfca[305] = 2101048119;
        gv.gfca[306] = -892820169;
        gv.gfca[307] = -537662501;
        gv.gfca[308] = 220750777;
        gv.gfca[309] = -749961698;
        gv.gfca[310] = -1051640113;
        gv.gfca[311] = -908304249;
        gv.gfca[312] = -932572238;
        gv.gfca[313] = 910363404;
        gv.gfca[314] = 94430095;
        gv.gfca[315] = -1567436620;
        gv.gfca[316] = -781608264;
        gv.gfca[317] = 2115437337;
        gv.gfca[318] = -742159224;
        gv.gfca[319] = 1761292945;
        gv.gfca[320] = -801778738;
        gv.gfca[321] = -949771462;
        gv.gfca[322] = -1211975240;
        gv.gfca[323] = -498828505;
        gv.gfca[324] = -1296837399;
        gv.gfca[325] = -1032380296;
        gv.gfca[326] = 340385097;
        gv.gfca[327] = 752857416;
        gv.gfca[328] = -1177597359;
        gv.gfca[329] = -2141791061;
        gv.gfca[330] = -386626610;
        gv.gfca[331] = -598373348;
        gv.gfca[332] = -552927139;
        gv.gfca[333] = -337470714;
        gv.gfca[334] = 924495562;
        gv.gfca[335] = -1484820580;
        gv.gfca[336] = 1797090037;
        gv.gfca[337] = -1506529778;
        gv.gfca[338] = 177181009;
        gv.gfca[339] = 2116981533;
        gv.gfca[340] = -491716665;
        gv.gfca[341] = 1124943532;
        gv.gfca[342] = 543683200;
        gv.gfca[343] = -1070780241;
        gv.gfca[344] = 385566307;
        gv.gfca[345] = 310922081;
        gv.gfca[346] = 472510534;
        gv.gfca[347] = -1305579879;
        gv.gfca[348] = 1852693828;
        gv.gfca[349] = -1565930;
        gv.gfca[350] = -14729946;
        gv.gfca[351] = 856656048;
        gv.gfca[352] = 2008766103;
        gv.gfca[353] = 1545129883;
        gv.gfca[354] = 256165420;
        gv.gfca[355] = 1095206452;
        gv.gfca[356] = -1659483913;
        gv.gfca[357] = -618889054;
        gv.gfca[358] = -1946572302;
        gv.gfca[359] = 1728751313;
        gv.gfca[360] = -1612180939;
        gv.gfca[361] = 1627570767;
        gv.gfca[362] = 1528829131;
        gv.gfca[363] = -708020202;
        gv.gfca[364] = -1440434729;
        gv.gfca[365] = 621348884;
        gv.gfca[366] = -243486727;
        gv.gfca[367] = -461126979;
        gv.gfca[368] = 521763319;
        gv.gfca[369] = -1823727879;
        gv.gfca[370] = -1050307730;
        gv.gfca[371] = 1740268921;
        gv.gfca[372] = 1672468008;
        gv.gfca[373] = -77651819;
        gv.gfca[374] = -1740035013;
        gv.gfca[375] = 1445392647;
        gv.gfca[376] = 861004006;
        gv.gfca[377] = -131456646;
        gv.gfca[378] = -1812063400;
        gv.gfca[379] = 1728991118;
        gv.gfca[380] = 42527991;
        gv.gfca[381] = -1969426942;
        gv.gfca[382] = 1460649806;
        gv.gfca[383] = 93834342;
        gv.gfca[384] = 1808860325;
        gv.gfca[385] = 1356252907;
        gv.gfca[386] = 489890715;
        gv.gfca[387] = 1345232327;
        gv.gfca[388] = -61641352;
        gv.gfca[389] = 1688145417;
        gv.gfca[390] = -1083175696;
        gv.gfca[391] = 2108621462;
        gv.gfca[392] = 782313078;
        gv.gfca[393] = 2054441803;
        gv.gfca[394] = -451224546;
        gv.gfca[395] = 1701604879;
        gv.gfca[396] = -1997269290;
        gv.gfca[397] = 328889177;
        gv.gfca[398] = 1664805564;
        gv.gfca[399] = -5006253;
    }

    private static /* synthetic */ void gqgf() {
        gv.gfcb[900] = -941720909;
        gv.gfcb[901] = 2120069021;
        gv.gfcb[902] = -1266263299;
        gv.gfcb[903] = 1554405041;
        gv.gfcb[904] = 685652460;
        gv.gfcb[905] = -211553101;
        gv.gfcb[906] = 696298229;
        gv.gfcb[907] = -1377103631;
        gv.gfcb[908] = -558742706;
        gv.gfcb[909] = 864132544;
        gv.gfcb[910] = 2142732319;
        gv.gfcb[911] = -1551335894;
        gv.gfcb[912] = 829590304;
        gv.gfcb[913] = -1237161424;
        gv.gfcb[914] = 1989616636;
        gv.gfcb[915] = -156266949;
        gv.gfcb[916] = -1756335344;
        gv.gfcb[917] = -813141865;
        gv.gfcb[918] = -390321578;
        gv.gfcb[919] = 782811380;
        gv.gfcb[920] = -1202717741;
        gv.gfcb[921] = 610642243;
        gv.gfcb[922] = 18054962;
        gv.gfcb[923] = 1298758766;
        gv.gfcb[924] = 1538497667;
        gv.gfcb[925] = 432899762;
        gv.gfcb[926] = 241207346;
        gv.gfcb[927] = -505406297;
        gv.gfcb[928] = 1020124325;
        gv.gfcb[929] = 904077636;
        gv.gfcb[930] = -1900447687;
        gv.gfcb[931] = -231151535;
        gv.gfcb[932] = 1237584487;
        gv.gfcb[933] = -950932943;
        gv.gfcb[934] = -1308444332;
        gv.gfcb[935] = -1044578586;
        gv.gfcb[936] = -3174103;
        gv.gfcb[937] = 445258172;
        gv.gfcb[938] = 451498613;
        gv.gfcb[939] = -1422402319;
        gv.gfcb[940] = 1605982630;
        gv.gfcb[941] = -2058906414;
        gv.gfcb[942] = 1768883366;
        gv.gfcb[943] = -1178267932;
        gv.gfcb[944] = 1736848123;
        gv.gfcb[945] = -983150290;
        gv.gfcb[946] = 474682722;
        gv.gfcb[947] = 2121727862;
        gv.gfcb[948] = 1887839996;
        gv.gfcb[949] = 648792653;
        gv.gfcb[950] = -1305477366;
        gv.gfcb[951] = 143657287;
        gv.gfcb[952] = 202069820;
        gv.gfcb[953] = 500823564;
        gv.gfcb[954] = 107048271;
        gv.gfcb[955] = 810083841;
        gv.gfcb[956] = 1213877343;
        gv.gfcb[957] = 2069636701;
        gv.gfcb[958] = -1427090864;
        gv.gfcb[959] = -93912750;
        gv.gfcb[960] = -745711799;
        gv.gfcb[961] = 177541263;
        gv.gfcb[962] = 1462568260;
        gv.gfcb[963] = -1690769677;
        gv.gfcb[964] = -1587954892;
        gv.gfcb[965] = 1033672046;
        gv.gfcb[966] = -1153342523;
        gv.gfcb[967] = 1803889320;
        gv.gfcb[968] = 914414733;
        gv.gfcb[969] = 634022953;
        gv.gfcb[970] = 550852836;
        gv.gfcb[971] = -1822861043;
        gv.gfcb[972] = 710296513;
        gv.gfcb[973] = -1329407603;
        gv.gfcb[974] = -771647925;
        gv.gfcb[975] = -689363990;
        gv.gfcb[976] = -1727466239;
        gv.gfcb[977] = 389752438;
        gv.gfcb[978] = -1873658974;
        gv.gfcb[979] = -1388085300;
        gv.gfcb[980] = 600047684;
        gv.gfcb[981] = 1743423873;
        gv.gfcb[982] = -1186852812;
        gv.gfcb[983] = -641497392;
        gv.gfcb[984] = -1527149166;
        gv.gfcb[985] = -13404154;
        gv.gfcb[986] = -1862454575;
        gv.gfcb[987] = 153892033;
        gv.gfcb[988] = -1164187266;
        gv.gfcb[989] = -1537437115;
        gv.gfcb[990] = -1346083851;
        gv.gfcb[991] = 716918885;
        gv.gfcb[992] = -1573104141;
        gv.gfcb[993] = 1592762078;
        gv.gfcb[994] = -1741140439;
        gv.gfcb[995] = -2056186348;
        gv.gfcb[996] = 1145021235;
        gv.gfcb[997] = 88623494;
        gv.gfcb[998] = -1889111895;
        gv.gfcb[999] = -678463607;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isMapKey(class_1799 var1_1) {
        block64: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = gv.nl - gv.gfcc("gkdm", gfdd(int ), (int)416)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == gv.gfcc("gkdn", gfbz(int ), (int)1111)) break;
                v0 /* !! */  = (long)gv.gfcc("gkdo", gfbz(int ), (int)1112);
            }
            var4_2 = gv.c;
            v1 /* !! */  = gv.nl;
            if (true) ** GOTO lbl11
            block41: while (true) {
                v1 /* !! */  = (long)(v2 - gv.gfcc("gkdp", gfdd(int ), (int)417));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -2031927446: {
                        v2 = gv.gfcc("gkdw", gfdd(int ), (int)418);
                        continue block41;
                    }
                    case -1805501434: {
                        v2 = gv.gfcc("gkdy", gfdd(int ), (int)419);
                        continue block41;
                    }
                    case 1185080505: {
                        break block41;
                    }
                }
                break;
            }
            var3_3 /* !! */  = gv.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = gv.nl - gv.gfcc("gkdz", gfdd(int ), (int)420)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == gv.gfcc("gkea", gfbz(int ), (int)1113)) break;
                v3 /* !! */  = (long)gv.gfcc("gkeb", gfbz(int ), (int)1114);
            }
            var2_4 = gv.a;
            if (var4_2) {
                throw null;
lbl29:
                // 5 sources

                return (boolean)gv.gfcc("gkec", gfbz(int ), (int)1115);
            }
            if (var2_4 || var2_4) ** GOTO lbl29
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = gv.nl - gv.gfcc("gked", gfdd(int ), (int)421)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == gv.gfcc("gkel", gfbz(int ), (int)1116)) break;
                v4 /* !! */  = (long)gv.gfcc("gkem", gfbz(int ), (int)1117);
            }
            v5 /* !! */  = gv.nl;
            if (true) ** GOTO lbl41
            block45: while (true) {
                v5 /* !! */  = (long)(v6 - gv.gfcc("gken", gfdd(int ), (int)422));
lbl41:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -629230469: {
                        v6 = gv.gfcc("gkeo", gfdd(int ), (int)423);
                        continue block45;
                    }
                    case -370140706: {
                        v6 = gv.gfcc("gkep", gfdd(int ), (int)424);
                        continue block45;
                    }
                    case 1185080505: {
                        break block45;
                    }
                    case 1216022774: {
                        v6 = gv.gfcc("gkeq", gfdd(int ), (int)425);
                        continue block45;
                    }
                }
                break;
            }
            if (!var1_1.method_31574(class_1802.field_8448)) break block64;
            if (var2_4) ** GOTO lbl29
            v7 /* !! */  = gv.nl;
            if (true) ** GOTO lbl59
            block46: while (true) {
                v7 /* !! */  = (long)(gv.gfcc("gkez", gfdd(int ), (int)427) - gv.gfcc("gkes", gfdd(int ), (int)426));
lbl59:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -1123505921: {
                        continue block46;
                    }
                    case 1185080505: {
                        break block46;
                    }
                }
                break;
            }
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_3 = gv.nl - gv.gfcc("gkfa", gfdd(int ), (int)428)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == gv.gfcc("gkfb", gfbz(int ), (int)1118)) break;
                v8 /* !! */  = (long)gv.gfcc("gkfc", gfbz(int ), (int)1119);
            }
            v9 = var1_1.method_7909();
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_4 = gv.nl - gv.gfcc("gkfe", gfdd(int ), (int)429)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == gv.gfcc("gkfg", gfbz(int ), (int)1120)) break;
                v10 /* !! */  = (long)gv.gfcc("gkfi", gfbz(int ), (int)1121);
            }
            v11 = class_7923.field_41178.method_10221((Object)v9);
            v12 /* !! */  = gv.nl;
            if (true) ** GOTO lbl80
            block49: while (true) {
                v12 /* !! */  = (long)(v13 - gv.gfcc("gkfm", gfdd(int ), (int)430));
lbl80:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case -1364772663: {
                        v13 = gv.gfcc("gkfo", gfdd(int ), (int)431);
                        continue block49;
                    }
                    case 854020934: {
                        v13 = gv.gfcc("gkfq", gfdd(int ), (int)432);
                        continue block49;
                    }
                    case 1185080505: {
                        break block49;
                    }
                }
                break;
            }
            v14 = v11.toString();
            while (true) {
                if ((v15 /* !! */  = (cfr_temp_5 = gv.nl - gv.gfcc("gkfu", gfdd(int ), (int)433)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v15 /* !! */  == gv.gfcc("gkfv", gfbz(int ), (int)1122)) break;
                v15 /* !! */  = (long)gv.gfcc("gkfx", gfbz(int ), (int)1123);
            }
            if (!v14.equals("minecraft:name_tag")) break block64;
            if (var2_4) ** GOTO lbl29
            while (true) {
                if ((v16 /* !! */  = (cfr_temp_6 = gv.nl - gv.gfcc("gkgc", gfdd(int ), (int)434)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v16 /* !! */  == gv.gfcc("gkgd", gfbz(int ), (int)1124)) break;
                v16 /* !! */  = (long)gv.gfcc("gkge", gfbz(int ), (int)1125);
            }
            v17 = var1_1.method_7964();
            while (true) {
                if ((v18 /* !! */  = (cfr_temp_7 = gv.nl - gv.gfcc("gkgf", gfdd(int ), (int)435)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v18 /* !! */  == gv.gfcc("gkgg", gfbz(int ), (int)1126)) break;
                v18 /* !! */  = (long)gv.gfcc("gkgh", gfbz(int ), (int)1127);
            }
            v19 = v17.getString();
            while (true) {
                if ((v20 /* !! */  = (cfr_temp_8 = gv.nl - gv.gfcc("gkgi", gfdd(int ), (int)436)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v20 /* !! */  == gv.gfcc("gkgj", gfbz(int ), (int)1128)) break;
                v20 /* !! */  = (long)gv.gfcc("gkgk", gfbz(int ), (int)1129);
            }
            v21 /* !! */  = gv.nl;
            if (true) ** GOTO lbl118
            block54: while (true) {
                v21 /* !! */  = (long)(gv.gfcc("gkgo", gfdd(int ), (int)438) - gv.gfcc("gkgl", gfdd(int ), (int)437));
lbl118:
                // 2 sources

                switch ((int)v21 /* !! */ ) {
                    case -1545271372: {
                        continue block54;
                    }
                    case 1185080505: {
                        break block54;
                    }
                }
                break;
            }
            v22 = v19.toLowerCase(Locale.ROOT);
            v23 /* !! */  = gv.nl;
            if (true) ** GOTO lbl128
            block55: while (true) {
                v23 /* !! */  = (long)(gv.gfcc("gkgt", gfdd(int ), (int)440) - gv.gfcc("gkgr", gfdd(int ), (int)439));
lbl128:
                // 2 sources

                switch ((int)v23 /* !! */ ) {
                    case 1185080505: {
                        break block55;
                    }
                    case 1896567947: {
                        continue block55;
                    }
                }
                break;
            }
            if (!v22.contains("\u043a\u043b\u044e\u0447")) break block64;
            if (var2_4) ** GOTO lbl29
            v24 = gv.gfcc("gkgv", gfbz(int ), (int)1130);
            if (var4_2) {
                throw null;
            }
            ** GOTO lbl146
        }
        if (!var2_4 && !var2_4) ** break;
        ** while (true)
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v24 = gv.gfcc("gkhc", gfbz(int ), (int)1131);
lbl146:
                // 2 sources

                return (boolean)v24;
            }
lbl147:
            // 3 sources

            case 0: {
                var3_3 /* !! */  = (int)gv.gfcc("gkhe", gfbz(int ), (int)1132);
                if (!var4_2) break;
                throw null;
            }
lbl151:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)gv.gfcc("gkhf", gfbz(int ), (int)1133);
                if (!var4_2) break;
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)gv.gfcc("gkhg", gfbz(int ), (int)1134);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl169
            }
            case 3: {
                var3_3 /* !! */  = (int)gv.gfcc("gkhi", gfbz(int ), (int)1135);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl177
            }
lbl165:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)gv.gfcc("gkhk", gfbz(int ), (int)1136);
                if (!var4_2) break;
                throw null;
            }
lbl169:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)gv.gfcc("gkhn", gfbz(int ), (int)1137);
                if (!var4_2) ** GOTO lbl147
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)gv.gfcc("gkhr", gfbz(int ), (int)1138);
                if (!var4_2) ** GOTO lbl165
                throw null;
            }
lbl177:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)gv.gfcc("gkhu", gfbz(int ), (int)1139);
                if (!var4_2) ** GOTO lbl151
                throw null;
            }
            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)gv.gfcc("gkhv", gfbz(int ), (int)1140);
                    if (!var4_2) ** GOTO lbl147
                    throw null;
                }
            }
            case 9: 
        }
        var3_3 /* !! */  = (int)gv.gfcc("gkhw", gfbz(int ), (int)1141);
        ** while (!var4_2)
lbl189:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite gfcc(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Override
    public void activate() {
        boolean bl2;
        Object object = nl;
        boolean bl3 = true;
        block6: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - gv.gfcc("gfdg", gfdd(int ), (int)0);
            }
            switch ((int)object) {
                case 378674953: {
                    callSite = gv.gfcc("gfdh", gfdd(int ), (int)1);
                    continue block6;
                }
                case 1185080505: {
                    break block6;
                }
                case 1381014102: {
                    callSite = gv.gfcc("gfdi", gfdd(int ), (int)2);
                    continue block6;
                }
                case 1688854251: {
                    callSite = gv.gfcc("gfdj", gfdd(int ), (int)3);
                    continue block6;
                }
            }
            break;
        }
        boolean bl4 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = nl - gv.gfcc("gfdk", gfdd(int ), (int)4)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == gv.gfcc("gfdl", gfbz(int ), (int)25)) break;
            object2 = gv.gfcc("gfdm", gfbz(int ), (int)26);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = nl - gv.gfcc("gfdn", gfdd(int ), (int)5)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == gv.gfcc("gfdo", gfbz(int ), (int)27)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = gv.gfcc("gfdp", gfbz(int ), (int)28);
        }
        if (bl2 || bl2) return;
        while (true) {
            long l4;
            Object object4;
            if ((object4 = (l4 = nl - gv.gfcc("gfdq", gfdd(int ), (int)6)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object4 == gv.gfcc("gfdr", gfbz(int ), (int)29)) {
                this.loadRememberedMinecarts();
                if (bl2) return;
                break;
            }
            object4 = gv.gfcc("gfds", gfbz(int ), (int)30);
        }
        if (bl2) return;
        while (true) {
            long l5;
            Object object5;
            if ((object5 = (l5 = nl - gv.gfcc("gfdt", gfdd(int ), (int)7)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object5 == gv.gfcc("gfdu", gfbz(int ), (int)31)) {
                this.resetRuntime();
                if (bl2) return;
                break;
            }
            object5 = gv.gfcc("gfdv", gfbz(int ), (int)32);
        }
        if (!bl2) return;
    }

    private static /* synthetic */ void gpwd() {
        gv.gfca[700] = 756848945;
        gv.gfca[701] = -556136037;
        gv.gfca[702] = 1235428974;
        gv.gfca[703] = 1282198193;
        gv.gfca[704] = 335018540;
        gv.gfca[705] = -914795014;
        gv.gfca[706] = 730670359;
        gv.gfca[707] = -499030640;
        gv.gfca[708] = 328675772;
        gv.gfca[709] = 766711455;
        gv.gfca[710] = -1721193604;
        gv.gfca[711] = -1108119284;
        gv.gfca[712] = -419847557;
        gv.gfca[713] = -1316265961;
        gv.gfca[714] = -943469070;
        gv.gfca[715] = -1803495052;
        gv.gfca[716] = 65087495;
        gv.gfca[717] = -1829422405;
        gv.gfca[718] = -1215938479;
        gv.gfca[719] = 1382880851;
        gv.gfca[720] = -1163385906;
        gv.gfca[721] = 852790111;
        gv.gfca[722] = 1723014974;
        gv.gfca[723] = 1243226836;
        gv.gfca[724] = -921574844;
        gv.gfca[725] = 883812492;
        gv.gfca[726] = -916440181;
        gv.gfca[727] = 549209529;
        gv.gfca[728] = -1170685892;
        gv.gfca[729] = -1880231467;
        gv.gfca[730] = 1699672390;
        gv.gfca[731] = 897473223;
        gv.gfca[732] = 1645195205;
        gv.gfca[733] = -600376811;
        gv.gfca[734] = -691091698;
        gv.gfca[735] = 1972606596;
        gv.gfca[736] = -1126906174;
        gv.gfca[737] = -1239080571;
        gv.gfca[738] = 1032798541;
        gv.gfca[739] = -719513245;
        gv.gfca[740] = 288294341;
        gv.gfca[741] = 1847666504;
        gv.gfca[742] = 246339692;
        gv.gfca[743] = 1465389123;
        gv.gfca[744] = 1385999618;
        gv.gfca[745] = -1721234476;
        gv.gfca[746] = -1645900428;
        gv.gfca[747] = 972838670;
        gv.gfca[748] = -2032189445;
        gv.gfca[749] = -899376582;
        gv.gfca[750] = 2095318256;
        gv.gfca[751] = -1003333128;
        gv.gfca[752] = 2017016401;
        gv.gfca[753] = -1518083378;
        gv.gfca[754] = 1466002872;
        gv.gfca[755] = 1481482908;
        gv.gfca[756] = -1544088290;
        gv.gfca[757] = -1645545150;
        gv.gfca[758] = -355152319;
        gv.gfca[759] = 1695310601;
        gv.gfca[760] = -2039018304;
        gv.gfca[761] = 175939568;
        gv.gfca[762] = 1763110660;
        gv.gfca[763] = -904556825;
        gv.gfca[764] = -845492245;
        gv.gfca[765] = 1630259900;
        gv.gfca[766] = -554963937;
        gv.gfca[767] = -904246873;
        gv.gfca[768] = -452248108;
        gv.gfca[769] = -2142012256;
        gv.gfca[770] = 1451932742;
        gv.gfca[771] = -1546873616;
        gv.gfca[772] = 1866589690;
        gv.gfca[773] = 1290950811;
        gv.gfca[774] = -2133991685;
        gv.gfca[775] = 555075439;
        gv.gfca[776] = 879701424;
        gv.gfca[777] = 824243151;
        gv.gfca[778] = -1783289762;
        gv.gfca[779] = 757245554;
        gv.gfca[780] = -2092811856;
        gv.gfca[781] = 879882893;
        gv.gfca[782] = 1320374311;
        gv.gfca[783] = -1524777398;
        gv.gfca[784] = 540193456;
        gv.gfca[785] = 316942375;
        gv.gfca[786] = -672509562;
        gv.gfca[787] = -2107816010;
        gv.gfca[788] = -2046880620;
        gv.gfca[789] = -572939353;
        gv.gfca[790] = -1519857783;
        gv.gfca[791] = 1168609360;
        gv.gfca[792] = -1001669506;
        gv.gfca[793] = -631029;
        gv.gfca[794] = -2011984901;
        gv.gfca[795] = -1622021509;
        gv.gfca[796] = -1286090570;
        gv.gfca[797] = -1257103686;
        gv.gfca[798] = 1125805263;
        gv.gfca[799] = 2040047115;
    }

    private static /* synthetic */ void gqnv() {
        gv.gfdf[300] = 8723589609393773997L;
        gv.gfdf[301] = 961401646602051780L;
        gv.gfdf[302] = 3878544114634046280L;
        gv.gfdf[303] = 1589268452331905994L;
        gv.gfdf[304] = 2841969805568499697L;
        gv.gfdf[305] = 4750209842994008044L;
        gv.gfdf[306] = -183978256923623533L;
        gv.gfdf[307] = 7530686733938729611L;
        gv.gfdf[308] = -113491803456431110L;
        gv.gfdf[309] = -8941254613898718316L;
        gv.gfdf[310] = -7454896925941524832L;
        gv.gfdf[311] = -8919451203524049287L;
        gv.gfdf[312] = -2194565596211639536L;
        gv.gfdf[313] = 7667349752719228551L;
        gv.gfdf[314] = -3693303405415382696L;
        gv.gfdf[315] = 1371975717557442793L;
        gv.gfdf[316] = -9196118559376555114L;
        gv.gfdf[317] = -6455662890056730534L;
        gv.gfdf[318] = -2694933587818322481L;
        gv.gfdf[319] = 3053571403106848592L;
        gv.gfdf[320] = -1254129917681809573L;
        gv.gfdf[321] = -2043829663064381986L;
        gv.gfdf[322] = 8330727364222903310L;
        gv.gfdf[323] = 740924458772151277L;
        gv.gfdf[324] = 1712256966559264776L;
        gv.gfdf[325] = -6430310276010907110L;
        gv.gfdf[326] = 1323425952217722885L;
        gv.gfdf[327] = -7934582433121347999L;
        gv.gfdf[328] = 2567134462179868578L;
        gv.gfdf[329] = 8573996669767625649L;
        gv.gfdf[330] = -3110886572782686995L;
        gv.gfdf[331] = -4313335547384794027L;
        gv.gfdf[332] = -1463850066448326738L;
        gv.gfdf[333] = 653795185422199689L;
        gv.gfdf[334] = -437460021379423650L;
        gv.gfdf[335] = -5212394303549386121L;
        gv.gfdf[336] = -4970316854373669293L;
        gv.gfdf[337] = -7442254856064002864L;
        gv.gfdf[338] = 1504500935122662409L;
        gv.gfdf[339] = -6907887842460599856L;
        gv.gfdf[340] = 3026716308663722079L;
        gv.gfdf[341] = -2826250990683243069L;
        gv.gfdf[342] = -3571100917988671226L;
        gv.gfdf[343] = 6976217092634180252L;
        gv.gfdf[344] = -2045020259707651847L;
        gv.gfdf[345] = -900943296184347566L;
        gv.gfdf[346] = -5658529599247107215L;
        gv.gfdf[347] = -8963841854316829405L;
        gv.gfdf[348] = -5979604671469928316L;
        gv.gfdf[349] = -2046149106601808419L;
        gv.gfdf[350] = 1736241570445769732L;
        gv.gfdf[351] = -3716082801671611714L;
        gv.gfdf[352] = -2641296332061747467L;
        gv.gfdf[353] = -2426737591635979031L;
        gv.gfdf[354] = -7460001732049589374L;
        gv.gfdf[355] = 4014384501033614305L;
        gv.gfdf[356] = -1056129518138768138L;
        gv.gfdf[357] = -6619412233626384079L;
        gv.gfdf[358] = -5870397684280796230L;
        gv.gfdf[359] = -1835942521437986513L;
        gv.gfdf[360] = 274399333040601429L;
        gv.gfdf[361] = 1666828553730492721L;
        gv.gfdf[362] = 8138983093708139063L;
        gv.gfdf[363] = 2300192273442955174L;
        gv.gfdf[364] = -4463641415272251678L;
        gv.gfdf[365] = -2433049974074113811L;
        gv.gfdf[366] = 2726137037060537993L;
        gv.gfdf[367] = -8989268320247071795L;
        gv.gfdf[368] = 6097983263882098237L;
        gv.gfdf[369] = -2380681507726785449L;
        gv.gfdf[370] = -8160473321812081533L;
        gv.gfdf[371] = 3700849460899426030L;
        gv.gfdf[372] = 8729435314387455518L;
        gv.gfdf[373] = -7716875514421237055L;
        gv.gfdf[374] = -7787989295854004790L;
        gv.gfdf[375] = -400628243890417791L;
        gv.gfdf[376] = -27988245007985664L;
        gv.gfdf[377] = 387226269422013608L;
        gv.gfdf[378] = -5114855773395022874L;
        gv.gfdf[379] = 2329964040172537067L;
        gv.gfdf[380] = 2548247349598932329L;
        gv.gfdf[381] = -4489645933813562975L;
        gv.gfdf[382] = -6294298229823069629L;
        gv.gfdf[383] = -3675560613927272017L;
        gv.gfdf[384] = -3986988858313084694L;
        gv.gfdf[385] = 671846227510235985L;
        gv.gfdf[386] = -671807579926861315L;
        gv.gfdf[387] = 2934398250730234032L;
        gv.gfdf[388] = 7447957098054545980L;
        gv.gfdf[389] = -3905388758592298669L;
        gv.gfdf[390] = -5818399875342984011L;
        gv.gfdf[391] = -8607326822129953012L;
        gv.gfdf[392] = -6541975133326339913L;
        gv.gfdf[393] = 4136728975132685366L;
        gv.gfdf[394] = 390623056679303457L;
        gv.gfdf[395] = -4110888154051948418L;
        gv.gfdf[396] = 1475311843393323777L;
        gv.gfdf[397] = -2493539523511175545L;
        gv.gfdf[398] = -2360591037544076180L;
        gv.gfdf[399] = 6014396033175718116L;
    }

    private static /* synthetic */ void gpwr() {
        gv.gfca[900] = -941720906;
        gv.gfca[901] = 2120069010;
        gv.gfca[902] = -1266263307;
        gv.gfca[903] = 1554405055;
        gv.gfca[904] = 685652461;
        gv.gfca[905] = -211553102;
        gv.gfca[906] = 696298229;
        gv.gfca[907] = -1377103633;
        gv.gfca[908] = -558742692;
        gv.gfca[909] = 864132572;
        gv.gfca[910] = 2142732297;
        gv.gfca[911] = -1551335899;
        gv.gfca[912] = 829590328;
        gv.gfca[913] = -1237161437;
        gv.gfca[914] = 1989616634;
        gv.gfca[915] = -156266963;
        gv.gfca[916] = -1756335343;
        gv.gfca[917] = -813141874;
        gv.gfca[918] = -390321584;
        gv.gfca[919] = 782811368;
        gv.gfca[920] = -1202717758;
        gv.gfca[921] = 610642246;
        gv.gfca[922] = 18054960;
        gv.gfca[923] = 1298758776;
        gv.gfca[924] = 1538497669;
        gv.gfca[925] = 432899774;
        gv.gfca[926] = 241207356;
        gv.gfca[927] = -505406284;
        gv.gfca[928] = 1020124350;
        gv.gfca[929] = 904077635;
        gv.gfca[930] = -1900447699;
        gv.gfca[931] = -231151521;
        gv.gfca[932] = 1237584508;
        gv.gfca[933] = -950932944;
        gv.gfca[934] = -1308444345;
        gv.gfca[935] = -1044578578;
        gv.gfca[936] = -3174092;
        gv.gfca[937] = 445258168;
        gv.gfca[938] = 451498612;
        gv.gfca[939] = 1394079465;
        gv.gfca[940] = -1605982631;
        gv.gfca[941] = 1358088006;
        gv.gfca[942] = 1768883367;
        gv.gfca[943] = 1178267931;
        gv.gfca[944] = 1736848122;
        gv.gfca[945] = -983150290;
        gv.gfca[946] = 474682724;
        gv.gfca[947] = 2121727856;
        gv.gfca[948] = 1887839997;
        gv.gfca[949] = 648792650;
        gv.gfca[950] = -1305477361;
        gv.gfca[951] = 143657286;
        gv.gfca[952] = 202069818;
        gv.gfca[953] = 500823573;
        gv.gfca[954] = 107048267;
        gv.gfca[955] = 810083841;
        gv.gfca[956] = 1213877340;
        gv.gfca[957] = 2069636674;
        gv.gfca[958] = -1427090860;
        gv.gfca[959] = -93912766;
        gv.gfca[960] = -745711784;
        gv.gfca[961] = 177541248;
        gv.gfca[962] = 1462568264;
        gv.gfca[963] = -1690769689;
        gv.gfca[964] = -1587954894;
        gv.gfca[965] = 1033672061;
        gv.gfca[966] = -1153342514;
        gv.gfca[967] = 1803889320;
        gv.gfca[968] = 914414742;
        gv.gfca[969] = 634022952;
        gv.gfca[970] = 550852837;
        gv.gfca[971] = -1822861037;
        gv.gfca[972] = 710296517;
        gv.gfca[973] = -1329407614;
        gv.gfca[974] = -771647936;
        gv.gfca[975] = -689363981;
        gv.gfca[976] = -1727466222;
        gv.gfca[977] = 389752444;
        gv.gfca[978] = -1873658960;
        gv.gfca[979] = -1388085310;
        gv.gfca[980] = 600047710;
        gv.gfca[981] = 1743423887;
        gv.gfca[982] = -1186852819;
        gv.gfca[983] = -641497405;
        gv.gfca[984] = -1527149166;
        gv.gfca[985] = -13404140;
        gv.gfca[986] = -1862454575;
        gv.gfca[987] = 153892033;
        gv.gfca[988] = -1164187276;
        gv.gfca[989] = -1537437070;
        gv.gfca[990] = -1346083851;
        gv.gfca[991] = 716918884;
        gv.gfca[992] = -1573104141;
        gv.gfca[993] = 1592762075;
        gv.gfca[994] = -1741140423;
        gv.gfca[995] = -2056186348;
        gv.gfca[996] = 1145021223;
        gv.gfca[997] = 88623517;
        gv.gfca[998] = -1889111895;
        gv.gfca[999] = -678463591;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isRememberedEntryForKey(String var1_1, String var2_2) {
        block50: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = gv.nl - gv.gfcc("gneq", gfdd(int ), (int)664)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == gv.gfcc("gner", gfbz(int ), (int)1532)) break;
                v0 /* !! */  = (long)gv.gfcc("gnet", gfbz(int ), (int)1533);
            }
            var5_3 = gv.c;
            v1 /* !! */  = gv.nl;
            if (true) ** GOTO lbl12
            block29: while (true) {
                v1 /* !! */  = (long)(v2 - gv.gfcc("gnew", gfdd(int ), (int)665));
lbl12:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1464003604: {
                        v2 = gv.gfcc("gnex", gfdd(int ), (int)666);
                        continue block29;
                    }
                    case -616606618: {
                        v2 = gv.gfcc("gney", gfdd(int ), (int)667);
                        continue block29;
                    }
                    case 1185080505: {
                        break block29;
                    }
                }
                break;
            }
            var4_4 /* !! */  = gv.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = gv.nl - gv.gfcc("gnez", gfdd(int ), (int)668)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == gv.gfcc("gnfa", gfbz(int ), (int)1534)) break;
                v3 /* !! */  = (long)gv.gfcc("gnfb", gfbz(int ), (int)1535);
            }
            var3_5 = gv.a;
            if (var5_3) {
                throw null;
lbl31:
                // 5 sources

                return (boolean)gv.gfcc("gngm", gfbz(int ), (int)1536);
            }
            if (var3_5 || var3_5) ** GOTO lbl31
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = gv.nl - gv.gfcc("gngp", gfdd(int ), (int)669)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == gv.gfcc("gngq", gfbz(int ), (int)1537)) break;
                v4 /* !! */  = (long)gv.gfcc("gngr", gfbz(int ), (int)1538);
            }
            if (var1_1.equals(var2_2)) break block50;
            if (var3_5) ** GOTO lbl31
            v5 /* !! */  = gv.nl;
            if (true) ** GOTO lbl46
            block33: while (true) {
                v5 /* !! */  = (long)(v6 - gv.gfcc("gngs", gfdd(int ), (int)670));
lbl46:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1790123218: {
                        v6 = gv.gfcc("gngt", gfdd(int ), (int)671);
                        continue block33;
                    }
                    case -774092941: {
                        v6 = gv.gfcc("gngu", gfdd(int ), (int)672);
                        continue block33;
                    }
                    case 1185080505: {
                        break block33;
                    }
                    case 1336610462: {
                        v6 = gv.gfcc("gngv", gfdd(int ), (int)673);
                        continue block33;
                    }
                }
                break;
            }
            v7 = var2_2 + " - ";
            v8 /* !! */  = gv.nl;
            if (true) ** GOTO lbl63
            block34: while (true) {
                v8 /* !! */  = (long)(gv.gfcc("gnha", gfdd(int ), (int)675) - gv.gfcc("gngy", gfdd(int ), (int)674));
lbl63:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case -708392190: {
                        continue block34;
                    }
                    case 1185080505: {
                        break block34;
                    }
                }
                break;
            }
            if (!var1_1.startsWith(v7)) ** GOTO lbl79
            if (var3_5) ** GOTO lbl31
        }
        if (var3_5 || var3_5) ** GOTO lbl31
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v9 = gv.gfcc("gnhd", gfbz(int ), (int)1539);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl82
            }
lbl79:
            // 1 sources

            if (!var3_5 && !var3_5) ** break;
            ** continue;
            v9 = gv.gfcc("gnhf", gfbz(int ), (int)1540);
lbl82:
            // 2 sources

            return (boolean)v9;
lbl83:
            // 2 sources

            case 0: {
                var4_4 /* !! */  = (int)gv.gfcc("gnhg", gfbz(int ), (int)1541);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl93
            }
lbl88:
            // 2 sources

            case 1: {
                var4_4 /* !! */  = (int)gv.gfcc("gnhh", gfbz(int ), (int)1542);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl107
            }
lbl93:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)gv.gfcc("gnhi", gfbz(int ), (int)1543);
                    if (!var5_3) ** GOTO lbl83
                    throw null;
                }
            }
lbl98:
            // 2 sources

            case 3: {
                var4_4 /* !! */  = (int)gv.gfcc("gnhn", gfbz(int ), (int)1544);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl123
            }
lbl103:
            // 2 sources

            case 4: {
                var4_4 /* !! */  = (int)gv.gfcc("gnhp", gfbz(int ), (int)1545);
                if (!var5_3) ** GOTO lbl98
                throw null;
            }
lbl107:
            // 3 sources

            case 5: {
                var4_4 /* !! */  = (int)gv.gfcc("gnhq", gfbz(int ), (int)1546);
                if (!var5_3) break;
                throw null;
            }
            case 6: {
                var4_4 /* !! */  = (int)gv.gfcc("gnhs", gfbz(int ), (int)1547);
                if (!var5_3) ** GOTO lbl107
                throw null;
            }
lbl115:
            // 2 sources

            case 7: {
                var4_4 /* !! */  = (int)gv.gfcc("gnht", gfbz(int ), (int)1548);
                if (!var5_3) ** GOTO lbl88
                throw null;
            }
            case 8: {
                var4_4 /* !! */  = (int)gv.gfcc("gnhu", gfbz(int ), (int)1549);
                if (!var5_3) ** GOTO lbl115
                throw null;
            }
lbl123:
            // 2 sources

            case 9: {
                var4_4 /* !! */  = (int)gv.gfcc("gnhv", gfbz(int ), (int)1550);
                if (!var5_3) ** GOTO lbl103
                throw null;
            }
            case 10: 
        }
        var4_4 /* !! */  = (int)gv.gfcc("gnib", gfbz(int ), (int)1551);
        ** while (!var5_3)
lbl130:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gqdc() {
        gv.gfcb[300] = -1546727791;
        gv.gfcb[301] = 1934509992;
        gv.gfcb[302] = -1805065602;
        gv.gfcb[303] = -1709361425;
        gv.gfcb[304] = 1470434652;
        gv.gfcb[305] = 2101048114;
        gv.gfcb[306] = -892820192;
        gv.gfcb[307] = -537662470;
        gv.gfcb[308] = 220750750;
        gv.gfcb[309] = -749961725;
        gv.gfcb[310] = -1051640088;
        gv.gfcb[311] = 908304248;
        gv.gfcb[312] = 467005246;
        gv.gfcb[313] = 910363405;
        gv.gfcb[314] = 56320599;
        gv.gfcb[315] = -1567436619;
        gv.gfcb[316] = 735803376;
        gv.gfcb[317] = 2115437336;
        gv.gfcb[318] = -915273713;
        gv.gfcb[319] = 1761292945;
        gv.gfcb[320] = -801778738;
        gv.gfcb[321] = 949771461;
        gv.gfcb[322] = 495989445;
        gv.gfcb[323] = -498828498;
        gv.gfcb[324] = -1296837398;
        gv.gfcb[325] = -1032380296;
        gv.gfcb[326] = 340385089;
        gv.gfcb[327] = 752857408;
        gv.gfcb[328] = -1177597351;
        gv.gfcb[329] = -2141791061;
        gv.gfcb[330] = -386626620;
        gv.gfcb[331] = -598373347;
        gv.gfcb[332] = -552927141;
        gv.gfcb[333] = -337470705;
        gv.gfcb[334] = 924495563;
        gv.gfcb[335] = 1674812508;
        gv.gfcb[336] = 1797090036;
        gv.gfcb[337] = -327716590;
        gv.gfcb[338] = -177181010;
        gv.gfcb[339] = 1061491072;
        gv.gfcb[340] = 491716664;
        gv.gfcb[341] = -1124943533;
        gv.gfcb[342] = -1144590288;
        gv.gfcb[343] = 1070780240;
        gv.gfcb[344] = -1328545371;
        gv.gfcb[345] = -310922082;
        gv.gfcb[346] = 1577195817;
        gv.gfcb[347] = 1305579878;
        gv.gfcb[348] = -1017139551;
        gv.gfcb[349] = -1565930;
        gv.gfcb[350] = -14729939;
        gv.gfcb[351] = 856656052;
        gv.gfcb[352] = 2008766096;
        gv.gfcb[353] = 1545129884;
        gv.gfcb[354] = 256165436;
        gv.gfcb[355] = 1095206439;
        gv.gfcb[356] = -1659483920;
        gv.gfcb[357] = -618889039;
        gv.gfcb[358] = -1946572313;
        gv.gfcb[359] = 1728751318;
        gv.gfcb[360] = -1612180937;
        gv.gfcb[361] = 1627570781;
        gv.gfcb[362] = 1528829133;
        gv.gfcb[363] = -708020208;
        gv.gfcb[364] = -1440434746;
        gv.gfcb[365] = 621348894;
        gv.gfcb[366] = -243486727;
        gv.gfcb[367] = -461126984;
        gv.gfcb[368] = 521763300;
        gv.gfcb[369] = -1823727876;
        gv.gfcb[370] = -1050307738;
        gv.gfcb[371] = 1740268925;
        gv.gfcb[372] = -1672468009;
        gv.gfcb[373] = -830405312;
        gv.gfcb[374] = -1740035014;
        gv.gfcb[375] = 1297017298;
        gv.gfcb[376] = -861004007;
        gv.gfcb[377] = 1789122508;
        gv.gfcb[378] = -1812063399;
        gv.gfcb[379] = -2012802299;
        gv.gfcb[380] = 42527998;
        gv.gfcb[381] = -1969426941;
        gv.gfcb[382] = -355691825;
        gv.gfcb[383] = -93834343;
        gv.gfcb[384] = -986911007;
        gv.gfcb[385] = -1356252908;
        gv.gfcb[386] = -1989785851;
        gv.gfcb[387] = 1345232326;
        gv.gfcb[388] = 1353639044;
        gv.gfcb[389] = 1688145416;
        gv.gfcb[390] = -2086996877;
        gv.gfcb[391] = 2108621463;
        gv.gfcb[392] = 665432169;
        gv.gfcb[393] = -2054441804;
        gv.gfcb[394] = 2138075485;
        gv.gfcb[395] = -1701604880;
        gv.gfcb[396] = -1788816474;
        gv.gfcb[397] = 328889169;
        gv.gfcb[398] = 1664805564;
        gv.gfcb[399] = -5006255;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ void lambda$handleAutoLeave$0() {
        v0 /* !! */  = gv.nl;
        if (true) ** GOTO lbl5
        block25: while (true) {
            v0 /* !! */  = (long)(v1 - gv.gfcc("gprj", gfdd(int ), (int)803));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -89317622: {
                    v1 = gv.gfcc("gprk", gfdd(int ), (int)804);
                    continue block25;
                }
                case 1159606189: {
                    v1 = gv.gfcc("gprl", gfdd(int ), (int)805);
                    continue block25;
                }
                case 1185080505: {
                    break block25;
                }
                case 2067379873: {
                    v1 = gv.gfcc("gprm", gfdd(int ), (int)806);
                    continue block25;
                }
            }
            break;
        }
        var3_1 = gv.c;
        v2 /* !! */  = gv.nl;
        if (true) ** GOTO lbl22
        block26: while (true) {
            v2 /* !! */  = (long)(v3 - gv.gfcc("gprn", gfdd(int ), (int)807));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -64054603: {
                    v3 = gv.gfcc("gpro", gfdd(int ), (int)808);
                    continue block26;
                }
                case -42465210: {
                    v3 = gv.gfcc("gprp", gfdd(int ), (int)809);
                    continue block26;
                }
                case 337967581: {
                    v3 = gv.gfcc("gprq", gfdd(int ), (int)810);
                    continue block26;
                }
                case 1185080505: {
                    break block26;
                }
            }
            break;
        }
        var2_2 /* !! */  = gv.b;
        v4 /* !! */  = gv.nl;
        if (true) ** GOTO lbl39
        block27: while (true) {
            v4 /* !! */  = (long)(v5 - gv.gfcc("gprs", gfdd(int ), (int)811));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2099334063: {
                    v5 = gv.gfcc("gpru", gfdd(int ), (int)812);
                    continue block27;
                }
                case -620718302: {
                    v5 = gv.gfcc("gprw", gfdd(int ), (int)813);
                    continue block27;
                }
                case 1185080505: {
                    break block27;
                }
                case 1876319931: {
                    v5 = gv.gfcc("gpry", gfdd(int ), (int)814);
                    continue block27;
                }
            }
            break;
        }
        var1_3 = gv.a;
        if (var3_1) {
            throw null;
lbl54:
            // 2 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl54
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_0 = gv.nl - gv.gfcc("gpsb", gfdd(int ), (int)815)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == gv.gfcc("gpsd", gfbz(int ), (int)1722)) break;
                    v6 /* !! */  = (long)gv.gfcc("gpsf", gfbz(int ), (int)1723);
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = gv.nl - gv.gfcc("gpsg", gfdd(int ), (int)816)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == gv.gfcc("gpsi", gfbz(int ), (int)1724)) break;
                    v7 /* !! */  = (long)gv.gfcc("gpsl", gfbz(int ), (int)1725);
                }
                v8 = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, stopBaritone(), ()V)((gv)this);
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = gv.nl - gv.gfcc("gpsn", gfdd(int ), (int)817)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == gv.gfcc("gpsp", gfbz(int ), (int)1726)) break;
                    v9 /* !! */  = (long)gv.gfcc("gpsr", gfbz(int ), (int)1727);
                }
                gv.mc.execute(v8);
                if (!var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)gv.gfcc("gpst", gfbz(int ), (int)1728);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl89
            }
            case 1: {
                var2_2 /* !! */  = (int)gv.gfcc("gpsv", gfbz(int ), (int)1729);
                if (!var3_1) break;
                throw null;
            }
lbl89:
            // 2 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)gv.gfcc("gpsy", gfbz(int ), (int)1730);
                } while (!var3_1);
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)gv.gfcc("gpta", gfbz(int ), (int)1731);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 4: 
        }
        var2_2 /* !! */  = (int)gv.gfcc("gptc", gfbz(int ), (int)1732);
        ** while (!var3_1)
lbl102:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isValidMinecart(class_1694 var1_1) {
        block64: {
            block63: {
                block62: {
                    block61: {
                        var6_2 = gv.c;
                        var5_3 /* !! */  = gv.b;
                        var4_4 = gv.a;
                        if (var6_2) {
                            throw null;
lbl6:
                            // 17 sources

                            return (boolean)gv.gfcc("gimp", gfbz(int ), (int)986);
                        }
                        if (var4_4 || var4_4) ** GOTO lbl6
                        if (var1_1 == null) break block61;
                        if (var4_4) ** GOTO lbl6
                        if (!var1_1.method_31481()) break block62;
                        if (var4_4) ** GOTO lbl6
                    }
                    if (var4_4 || var4_4) ** GOTO lbl6
                    return (boolean)gv.gfcc("gimr", gfbz(int ), (int)987);
                }
                if (var4_4 || var4_4) ** GOTO lbl6
                var2_5 = var1_1.method_24515();
                if (var4_4 || var4_4) ** GOTO lbl6
                if (!gv.mc.field_1687.method_8621().method_11952(var2_5)) break block63;
                if (var4_4) ** GOTO lbl6
                if (var2_5.method_10264() < gv.gfcc("gimt", gfbz(int ), (int)988)) break block63;
                if (var4_4) ** GOTO lbl6
                if (var2_5.method_10264() <= gv.gfcc("gimu", gfbz(int ), (int)989)) break block64;
                if (var4_4) ** GOTO lbl6
            }
            if (var4_4 || var4_4) ** GOTO lbl6
            return (boolean)gv.gfcc("gimw", gfbz(int ), (int)990);
        }
        if (var4_4 || var4_4) ** GOTO lbl6
        var3_6 = this.key(var2_5);
        if (var4_4 || var4_4) ** GOTO lbl6
        if (this.sessionLootedMinecarts.contains(var3_6)) ** GOTO lbl47
        if (var4_4) ** GOTO lbl6
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!this.rememberLooted.isValue()) ** GOTO lbl42
                if (var4_4) ** GOTO lbl6
                if (this.isRememberedMinecart(var3_6)) ** GOTO lbl47
                if (var4_4) ** GOTO lbl6
lbl42:
                // 2 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                v0 = gv.gfcc("gina", gfbz(int ), (int)991);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl50
lbl47:
                // 2 sources

                if (!var4_4 && !var4_4) ** break;
                ** continue;
                v0 = gv.gfcc("ginc", gfbz(int ), (int)992);
lbl50:
                // 2 sources

                return (boolean)v0;
            }
            case 0: {
                var5_3 /* !! */  = (int)gv.gfcc("gind", gfbz(int ), (int)993);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl165
            }
            case 1: {
                var5_3 /* !! */  = (int)gv.gfcc("gine", gfbz(int ), (int)994);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl161
            }
            case 2: {
                var5_3 /* !! */  = (int)gv.gfcc("ging", gfbz(int ), (int)995);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl66:
            // 2 sources

            case 3: {
                var5_3 /* !! */  = (int)gv.gfcc("ginh", gfbz(int ), (int)996);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl114
            }
lbl71:
            // 2 sources

            case 4: {
                var5_3 /* !! */  = (int)gv.gfcc("ginj", gfbz(int ), (int)997);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl173
            }
            case 5: {
                var5_3 /* !! */  = (int)gv.gfcc("ginm", gfbz(int ), (int)998);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl86
            }
lbl81:
            // 3 sources

            case 6: {
                var5_3 /* !! */  = (int)gv.gfcc("ginn", gfbz(int ), (int)999);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl169
            }
lbl86:
            // 4 sources

            case 7: {
                do {
                    var5_3 /* !! */  = (int)gv.gfcc("gino", gfbz(int ), (int)1000);
                } while (!var6_2);
                throw null;
            }
            case 8: {
                var5_3 /* !! */  = (int)gv.gfcc("ginq", gfbz(int ), (int)1001);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl169
            }
            case 9: {
                var5_3 /* !! */  = (int)gv.gfcc("ginr", gfbz(int ), (int)1002);
                if (!var6_2) ** GOTO lbl81
                throw null;
            }
            case 10: {
                var5_3 /* !! */  = (int)gv.gfcc("gint", gfbz(int ), (int)1003);
                if (!var6_2) ** GOTO lbl66
                throw null;
            }
            case 11: {
                var5_3 /* !! */  = (int)gv.gfcc("ginv", gfbz(int ), (int)1004);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl165
            }
lbl109:
            // 2 sources

            case 12: {
                var5_3 /* !! */  = (int)gv.gfcc("ginw", gfbz(int ), (int)1005);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl114:
            // 2 sources

            case 13: {
                var5_3 /* !! */  = (int)gv.gfcc("ginx", gfbz(int ), (int)1006);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl177
            }
            case 14: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)gv.gfcc("ginz", gfbz(int ), (int)1007);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl161
                    break;
                }
            }
            case 15: {
                var5_3 /* !! */  = (int)gv.gfcc("gioa", gfbz(int ), (int)1008);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl139
            }
lbl130:
            // 2 sources

            case 16: {
                var5_3 /* !! */  = (int)gv.gfcc("gioc", gfbz(int ), (int)1009);
                if (!var6_2) ** GOTO lbl86
                throw null;
            }
lbl134:
            // 2 sources

            case 17: {
                var5_3 /* !! */  = (int)gv.gfcc("gjqb", gfbz(int ), (int)1010);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl177
            }
lbl139:
            // 2 sources

            case 18: {
                var5_3 /* !! */  = (int)gv.gfcc("gjqd", gfbz(int ), (int)1011);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl165
            }
            case 19: {
                var5_3 /* !! */  = (int)gv.gfcc("gjqk", gfbz(int ), (int)1012);
                if (!var6_2) break;
                throw null;
            }
            case 20: {
                var5_3 /* !! */  = (int)gv.gfcc("gjql", gfbz(int ), (int)1013);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl169
            }
            case 21: {
                var5_3 /* !! */  = (int)gv.gfcc("gjqm", gfbz(int ), (int)1014);
                if (!var6_2) ** GOTO lbl86
                throw null;
            }
            case 22: {
                var5_3 /* !! */  = (int)gv.gfcc("gjqp", gfbz(int ), (int)1015);
                if (var6_2) {
                    throw null;
                }
            }
lbl161:
            // 6 sources

            case 23: {
                var5_3 /* !! */  = (int)gv.gfcc("gjqr", gfbz(int ), (int)1016);
                if (!var6_2) ** GOTO lbl130
                throw null;
            }
lbl165:
            // 4 sources

            case 24: {
                var5_3 /* !! */  = (int)gv.gfcc("gjqt", gfbz(int ), (int)1017);
                if (!var6_2) break;
                throw null;
            }
lbl169:
            // 4 sources

            case 25: {
                var5_3 /* !! */  = (int)gv.gfcc("gjqu", gfbz(int ), (int)1018);
                if (!var6_2) ** GOTO lbl71
                throw null;
            }
lbl173:
            // 3 sources

            case 26: {
                var5_3 /* !! */  = (int)gv.gfcc("gjrb", gfbz(int ), (int)1019);
                if (!var6_2) ** GOTO lbl81
                throw null;
            }
lbl177:
            // 3 sources

            case 27: {
                var5_3 /* !! */  = (int)gv.gfcc("gjrc", gfbz(int ), (int)1020);
                if (!var6_2) ** GOTO lbl173
                throw null;
            }
            case 28: {
                var5_3 /* !! */  = (int)gv.gfcc("gjre", gfbz(int ), (int)1021);
                if (!var6_2) ** GOTO lbl109
                throw null;
            }
            case 29: 
        }
        var5_3 /* !! */  = (int)gv.gfcc("gjri", gfbz(int ), (int)1022);
        ** while (!var6_2)
lbl188:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gv.nl - gv.gfcc("gfee", gfdd(int ), (int)8)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == gv.gfcc("gfef", gfbz(int ), (int)41)) break;
            v0 /* !! */  = (long)gv.gfcc("gfeg", gfbz(int ), (int)42);
        }
        var3_1 = gv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gv.nl - gv.gfcc("gfeh", gfdd(int ), (int)9)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == gv.gfcc("gfei", gfbz(int ), (int)43)) break;
            v1 /* !! */  = (long)gv.gfcc("gfej", gfbz(int ), (int)44);
        }
        var2_2 /* !! */  = gv.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = gv.nl - gv.gfcc("gfek", gfdd(int ), (int)10)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == gv.gfcc("gfel", gfbz(int ), (int)45)) break;
            v2 /* !! */  = (long)gv.gfcc("gfem", gfbz(int ), (int)46);
        }
        var1_3 = gv.a;
        if (var3_1) {
            throw null;
lbl21:
            // 5 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl21
        v3 /* !! */  = gv.nl;
        if (true) ** GOTO lbl28
        block26: while (true) {
            v3 /* !! */  = (long)(gv.gfcc("gfeo", gfdd(int ), (int)12) - gv.gfcc("gfen", gfdd(int ), (int)11));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 1113767905: {
                    continue block26;
                }
                case 1185080505: {
                    break block26;
                }
            }
            break;
        }
        this.stopBaritone();
        if (var1_3 || var1_3) ** GOTO lbl21
        v4 /* !! */  = gv.nl;
        if (true) ** GOTO lbl39
        block27: while (true) {
            v4 /* !! */  = (long)(v5 - gv.gfcc("gfep", gfdd(int ), (int)13));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1698972752: {
                    v5 = gv.gfcc("gfeq", gfdd(int ), (int)14);
                    continue block27;
                }
                case 410252367: {
                    v5 = gv.gfcc("gfer", gfdd(int ), (int)15);
                    continue block27;
                }
                case 1185080505: {
                    break block27;
                }
                case 1944753972: {
                    v5 = gv.gfcc("gfes", gfdd(int ), (int)16);
                    continue block27;
                }
            }
            break;
        }
        this.stopUsingItem();
        if (var1_3) ** GOTO lbl21
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl21
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = gv.nl - gv.gfcc("gfet", gfdd(int ), (int)17)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == gv.gfcc("gfeu", gfbz(int ), (int)47)) break;
                    v6 /* !! */  = (long)gv.gfcc("gfev", gfbz(int ), (int)48);
                }
                this.resetRuntime();
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl66:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)gv.gfcc("gfew", gfbz(int ), (int)49);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl102
            }
lbl71:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)gv.gfcc("gfex", gfbz(int ), (int)50);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)gv.gfcc("gfey", gfbz(int ), (int)51);
                if (var3_1) {
                    throw null;
                }
            }
            case 3: {
                var2_2 /* !! */  = (int)gv.gfcc("gfez", gfbz(int ), (int)52);
                if (!var3_1) break;
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)gv.gfcc("gffa", gfbz(int ), (int)53);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl94
            }
            case 5: {
                var2_2 /* !! */  = (int)gv.gfcc("gffb", gfbz(int ), (int)54);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl102
            }
lbl94:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)gv.gfcc("gffc", gfbz(int ), (int)55);
                if (!var3_1) break;
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)gv.gfcc("gffd", gfbz(int ), (int)56);
                if (!var3_1) ** GOTO lbl66
                throw null;
            }
lbl102:
            // 3 sources

            case 8: {
                var2_2 /* !! */  = (int)gv.gfcc("gffe", gfbz(int ), (int)57);
                if (!var3_1) ** GOTO lbl71
                throw null;
            }
            case 9: 
        }
        do {
            var2_2 /* !! */  = (int)gv.gfcc("gfff", gfbz(int ), (int)58);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void gqer() {
        gv.gfcb[600] = -237883797;
        gv.gfcb[601] = 2052410151;
        gv.gfcb[602] = 198880469;
        gv.gfcb[603] = -1218622727;
        gv.gfcb[604] = -1477487118;
        gv.gfcb[605] = 32913677;
        gv.gfcb[606] = -1076695126;
        gv.gfcb[607] = -1145853784;
        gv.gfcb[608] = -1470122280;
        gv.gfcb[609] = -1996297411;
        gv.gfcb[610] = -1385263532;
        gv.gfcb[611] = 1980343256;
        gv.gfcb[612] = -1378096993;
        gv.gfcb[613] = -1864481885;
        gv.gfcb[614] = 2053649483;
        gv.gfcb[615] = -1701013339;
        gv.gfcb[616] = 1880912783;
        gv.gfcb[617] = 643011308;
        gv.gfcb[618] = -1460395607;
        gv.gfcb[619] = -234163778;
        gv.gfcb[620] = -1503777539;
        gv.gfcb[621] = -444139136;
        gv.gfcb[622] = 891595536;
        gv.gfcb[623] = 1177908348;
        gv.gfcb[624] = -937847856;
        gv.gfcb[625] = -2032770129;
        gv.gfcb[626] = 1262244811;
        gv.gfcb[627] = 400603703;
        gv.gfcb[628] = 657781057;
        gv.gfcb[629] = 1011979562;
        gv.gfcb[630] = 352642611;
        gv.gfcb[631] = -2132514091;
        gv.gfcb[632] = 87114209;
        gv.gfcb[633] = 1457715124;
        gv.gfcb[634] = 1540697683;
        gv.gfcb[635] = -1652880221;
        gv.gfcb[636] = -1907479840;
        gv.gfcb[637] = -1784012520;
        gv.gfcb[638] = -1566474357;
        gv.gfcb[639] = 1956922461;
        gv.gfcb[640] = 540591413;
        gv.gfcb[641] = 1836446965;
        gv.gfcb[642] = 88376162;
        gv.gfcb[643] = -277810878;
        gv.gfcb[644] = -208736627;
        gv.gfcb[645] = 1851968562;
        gv.gfcb[646] = -504354577;
        gv.gfcb[647] = -1830274302;
        gv.gfcb[648] = -1073369537;
        gv.gfcb[649] = -1188898196;
        gv.gfcb[650] = -1443727464;
        gv.gfcb[651] = -1145120750;
        gv.gfcb[652] = -250929863;
        gv.gfcb[653] = -1385228725;
        gv.gfcb[654] = -690117664;
        gv.gfcb[655] = 1214522729;
        gv.gfcb[656] = -2003177827;
        gv.gfcb[657] = -1795596267;
        gv.gfcb[658] = -385529015;
        gv.gfcb[659] = -1913962303;
        gv.gfcb[660] = -696472893;
        gv.gfcb[661] = 873888498;
        gv.gfcb[662] = -1399609180;
        gv.gfcb[663] = -2019165765;
        gv.gfcb[664] = -1210606397;
        gv.gfcb[665] = 1727234418;
        gv.gfcb[666] = -18025022;
        gv.gfcb[667] = -476265159;
        gv.gfcb[668] = -274774465;
        gv.gfcb[669] = -388180743;
        gv.gfcb[670] = -2030021693;
        gv.gfcb[671] = -1040616713;
        gv.gfcb[672] = 437654247;
        gv.gfcb[673] = -1586964649;
        gv.gfcb[674] = 1469997745;
        gv.gfcb[675] = 1975691238;
        gv.gfcb[676] = -435951855;
        gv.gfcb[677] = -292481007;
        gv.gfcb[678] = 1991813503;
        gv.gfcb[679] = -971098467;
        gv.gfcb[680] = -1190906185;
        gv.gfcb[681] = -220334845;
        gv.gfcb[682] = -210565714;
        gv.gfcb[683] = -1723808392;
        gv.gfcb[684] = 1856599099;
        gv.gfcb[685] = 590268398;
        gv.gfcb[686] = -1723351036;
        gv.gfcb[687] = 1058745226;
        gv.gfcb[688] = 1342219950;
        gv.gfcb[689] = 1634859370;
        gv.gfcb[690] = -1033972117;
        gv.gfcb[691] = 1125629614;
        gv.gfcb[692] = -943611826;
        gv.gfcb[693] = -1076441317;
        gv.gfcb[694] = -127035056;
        gv.gfcb[695] = -1886295773;
        gv.gfcb[696] = -1485352977;
        gv.gfcb[697] = -2026650947;
        gv.gfcb[698] = -982109472;
        gv.gfcb[699] = -1831034153;
    }

    private static /* synthetic */ void gqpd() {
        gv.gfdf[800] = -8935621467830750553L;
        gv.gfdf[801] = 22901751570346541L;
        gv.gfdf[802] = 695901066917032926L;
        gv.gfdf[803] = 5176192348768881512L;
        gv.gfdf[804] = 74446689810566130L;
        gv.gfdf[805] = 5835603001378639539L;
        gv.gfdf[806] = -2179408511618621311L;
        gv.gfdf[807] = 7002875451032949116L;
        gv.gfdf[808] = 7238222151902093056L;
        gv.gfdf[809] = -5238630728205250233L;
        gv.gfdf[810] = -1534614222682048079L;
        gv.gfdf[811] = -145598273092511233L;
        gv.gfdf[812] = 4587376577560734223L;
        gv.gfdf[813] = -2747312805769625374L;
        gv.gfdf[814] = 4982477341743490782L;
        gv.gfdf[815] = -1836842591174894917L;
        gv.gfdf[816] = 1900085973683052887L;
        gv.gfdf[817] = -2085816758907569103L;
    }

    private static /* synthetic */ void gqjy() {
        gv.gfcb[1700] = 1814450736;
        gv.gfcb[1701] = 2045999544;
        gv.gfcb[1702] = -1388322121;
        gv.gfcb[1703] = -333931653;
        gv.gfcb[1704] = 1632371928;
        gv.gfcb[1705] = -874451936;
        gv.gfcb[1706] = -506258410;
        gv.gfcb[1707] = 1828540233;
        gv.gfcb[1708] = -1594005878;
        gv.gfcb[1709] = -1151486890;
        gv.gfcb[1710] = -1654469422;
        gv.gfcb[1711] = -1398396394;
        gv.gfcb[1712] = -1450427836;
        gv.gfcb[1713] = 677827388;
        gv.gfcb[1714] = 1176325047;
        gv.gfcb[1715] = -641299250;
        gv.gfcb[1716] = 498981297;
        gv.gfcb[1717] = -1721514088;
        gv.gfcb[1718] = 2044771909;
        gv.gfcb[1719] = 1194878148;
        gv.gfcb[1720] = -2051898143;
        gv.gfcb[1721] = 205027693;
        gv.gfcb[1722] = -1218717215;
        gv.gfcb[1723] = -308189315;
        gv.gfcb[1724] = -647385722;
        gv.gfcb[1725] = -2011314050;
        gv.gfcb[1726] = -1954792469;
        gv.gfcb[1727] = -1363270280;
        gv.gfcb[1728] = -402466091;
        gv.gfcb[1729] = 1934254191;
        gv.gfcb[1730] = 185796869;
        gv.gfcb[1731] = -1175913445;
        gv.gfcb[1732] = -713549200;
    }

    private static /* synthetic */ void gqmm() {
        gv.gfde[700] = 4121208641013049464L;
        gv.gfde[701] = -1942179748049509141L;
        gv.gfde[702] = 995099440834424814L;
        gv.gfde[703] = 6999706591145038468L;
        gv.gfde[704] = -9145199218657641366L;
        gv.gfde[705] = 7087190310406578202L;
        gv.gfde[706] = 2954181120057004958L;
        gv.gfde[707] = -4834487899220574167L;
        gv.gfde[708] = 9129811672099122074L;
        gv.gfde[709] = -6155083882875520736L;
        gv.gfde[710] = 8638697067969039284L;
        gv.gfde[711] = 1130264333138064147L;
        gv.gfde[712] = 1848647602695391088L;
        gv.gfde[713] = -5930506743863269660L;
        gv.gfde[714] = 7908394068595913523L;
        gv.gfde[715] = 5871169193898441812L;
        gv.gfde[716] = 330476809762522165L;
        gv.gfde[717] = 6016608848521256320L;
        gv.gfde[718] = -1720619295884094127L;
        gv.gfde[719] = 6683815580302081969L;
        gv.gfde[720] = -9016663992989893813L;
        gv.gfde[721] = -7510331136952626351L;
        gv.gfde[722] = 6596502525959102669L;
        gv.gfde[723] = -2304949468200912275L;
        gv.gfde[724] = 9192348630901379506L;
        gv.gfde[725] = 834481549158641027L;
        gv.gfde[726] = 3843416730408336365L;
        gv.gfde[727] = 757445730850966741L;
        gv.gfde[728] = -6920422308059638312L;
        gv.gfde[729] = -4961839733529721658L;
        gv.gfde[730] = -6039011433705337942L;
        gv.gfde[731] = -5967159034666782300L;
        gv.gfde[732] = -7748342560595664130L;
        gv.gfde[733] = -6481074178840924900L;
        gv.gfde[734] = 7418595608719868414L;
        gv.gfde[735] = -668843986565390723L;
        gv.gfde[736] = -8802162483740662319L;
        gv.gfde[737] = -8583879530866143498L;
        gv.gfde[738] = 7410927261797173659L;
        gv.gfde[739] = -1515650878803970560L;
        gv.gfde[740] = 8900094910418585397L;
        gv.gfde[741] = -5263752765267411944L;
        gv.gfde[742] = -1971679399349343670L;
        gv.gfde[743] = 651472026694804117L;
        gv.gfde[744] = 3509660287328879632L;
        gv.gfde[745] = -5666510941839041738L;
        gv.gfde[746] = -9081279154552193380L;
        gv.gfde[747] = -3623327371987425375L;
        gv.gfde[748] = 2406308834360855310L;
        gv.gfde[749] = -474252311266244802L;
        gv.gfde[750] = -1620573826332585129L;
        gv.gfde[751] = 4160673985506340353L;
        gv.gfde[752] = 2851808560050779919L;
        gv.gfde[753] = -8861713995471366533L;
        gv.gfde[754] = 2023687761175385362L;
        gv.gfde[755] = -7988165933309981814L;
        gv.gfde[756] = 5443265908075497869L;
        gv.gfde[757] = 2314246575897186032L;
        gv.gfde[758] = 3060242208580342944L;
        gv.gfde[759] = 6305561147156085589L;
        gv.gfde[760] = -7975552713910844272L;
        gv.gfde[761] = 4124905233077041628L;
        gv.gfde[762] = 7150948321853228636L;
        gv.gfde[763] = -525042991172126266L;
        gv.gfde[764] = -8908197371417128370L;
        gv.gfde[765] = 8420021846041385582L;
        gv.gfde[766] = -3785199225092857860L;
        gv.gfde[767] = -1563016965276999300L;
        gv.gfde[768] = -4421011647824837728L;
        gv.gfde[769] = -7733233966914129253L;
        gv.gfde[770] = 2858247888622484549L;
        gv.gfde[771] = 137055287921555755L;
        gv.gfde[772] = -883819273086703378L;
        gv.gfde[773] = 6584369011883707218L;
        gv.gfde[774] = 6599373659370838226L;
        gv.gfde[775] = 4040312431123280107L;
        gv.gfde[776] = 685075059813563943L;
        gv.gfde[777] = 371122355215483737L;
        gv.gfde[778] = 7825993614807648693L;
        gv.gfde[779] = 5678736483027394052L;
        gv.gfde[780] = 1451267458950061931L;
        gv.gfde[781] = 5526812228238621716L;
        gv.gfde[782] = -3052585844938025555L;
        gv.gfde[783] = -1007043736984904138L;
        gv.gfde[784] = 1280408785448621865L;
        gv.gfde[785] = -2255334215512861491L;
        gv.gfde[786] = -2992544924388699731L;
        gv.gfde[787] = 2844760737406301565L;
        gv.gfde[788] = 1298750631327028239L;
        gv.gfde[789] = -4756443815457839955L;
        gv.gfde[790] = -1984517768113422542L;
        gv.gfde[791] = -1377524071822148288L;
        gv.gfde[792] = -8998634591594001884L;
        gv.gfde[793] = -7520060359763277106L;
        gv.gfde[794] = 717995085884472311L;
        gv.gfde[795] = 4019997552297766466L;
        gv.gfde[796] = -1566202359925878927L;
        gv.gfde[797] = -7439198681175358328L;
        gv.gfde[798] = 6545575370955013280L;
        gv.gfde[799] = -755250929826230891L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private String key(class_2338 var1_1) {
        v0 /* !! */  = gv.nl;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - gv.gfcc("goaj", gfdd(int ), (int)750));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1164676737: {
                    v1 = gv.gfcc("goak", gfdd(int ), (int)751);
                    continue block23;
                }
                case -205559169: {
                    v1 = gv.gfcc("goal", gfdd(int ), (int)752);
                    continue block23;
                }
                case 1185080505: {
                    break block23;
                }
            }
            break;
        }
        var4_2 = gv.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = gv.nl - gv.gfcc("goam", gfdd(int ), (int)753)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == gv.gfcc("goan", gfbz(int ), (int)1679)) break;
            v2 /* !! */  = (long)gv.gfcc("goav", gfbz(int ), (int)1680);
        }
        var3_3 /* !! */  = gv.b;
        v3 /* !! */  = gv.nl;
        if (true) ** GOTO lbl25
        block25: while (true) {
            v3 /* !! */  = (long)(v4 - gv.gfcc("goaw", gfdd(int ), (int)754));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -254766549: {
                    v4 = gv.gfcc("goay", gfdd(int ), (int)755);
                    continue block25;
                }
                case 779357296: {
                    v4 = gv.gfcc("goba", gfdd(int ), (int)756);
                    continue block25;
                }
                case 782858737: {
                    v4 = gv.gfcc("gobc", gfdd(int ), (int)757);
                    continue block25;
                }
                case 1185080505: {
                    break block25;
                }
            }
            break;
        }
        var2_4 = gv.a;
        if (var4_2) {
            throw null;
lbl40:
            // 1 sources

            return null;
        }
        ** while (var2_4 || var2_4)
lbl43:
        // 1 sources

        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block11 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = gv.nl - gv.gfcc("gobg", gfdd(int ), (int)758)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == gv.gfcc("gobm", gfbz(int ), (int)1681)) break;
                    v5 /* !! */  = (long)gv.gfcc("gobo", gfbz(int ), (int)1682);
                }
                v6 = var1_1.method_10263();
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = gv.nl - gv.gfcc("gobq", gfdd(int ), (int)759)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == gv.gfcc("gobr", gfbz(int ), (int)1683)) break;
                    v7 /* !! */  = (long)gv.gfcc("gobs", gfbz(int ), (int)1684);
                }
                v8 = var1_1.method_10264();
                v9 /* !! */  = gv.nl;
                if (true) ** GOTO lbl62
                block29: while (true) {
                    v9 /* !! */  = (long)(v10 - gv.gfcc("gobt", gfdd(int ), (int)760));
lbl62:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -459520251: {
                            v10 = gv.gfcc("gobw", gfdd(int ), (int)761);
                            continue block29;
                        }
                        case 661500212: {
                            v10 = gv.gfcc("goby", gfdd(int ), (int)762);
                            continue block29;
                        }
                        case 1185080505: {
                            break block29;
                        }
                        case 1274896038: {
                            v10 = gv.gfcc("gobz", gfdd(int ), (int)763);
                            continue block29;
                        }
                    }
                    break;
                }
                v11 = var1_1.method_10260();
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_3 = gv.nl - gv.gfcc("goca", gfdd(int ), (int)764)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == gv.gfcc("gocb", gfbz(int ), (int)1685)) break;
                    v12 /* !! */  = (long)gv.gfcc("gocc", gfbz(int ), (int)1686);
                }
                return v6 + " " + v8 + " " + v11;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)gv.gfcc("gocd", gfbz(int ), (int)1687);
                    if (!var4_2) break block11;
                    throw null;
                }
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)gv.gfcc("goce", gfbz(int ), (int)1688);
                } while (!var4_2);
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)gv.gfcc("gocf", gfbz(int ), (int)1689);
                if (!var4_2) break;
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)gv.gfcc("gocg", gfbz(int ), (int)1690);
        ** while (!var4_2)
lbl98:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isWantedLoot(class_1799 var1_1) {
        block80: {
            v0 /* !! */  = gv.nl;
            if (true) ** GOTO lbl5
            block42: while (true) {
                v0 /* !! */  = (long)(v1 - gv.gfcc("gjyl", gfdd(int ), (int)399));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -568148460: {
                        v1 = gv.gfcc("gjym", gfdd(int ), (int)400);
                        continue block42;
                    }
                    case 816481268: {
                        v1 = gv.gfcc("gjyn", gfdd(int ), (int)401);
                        continue block42;
                    }
                    case 1185080505: {
                        break block42;
                    }
                }
                break;
            }
            var4_2 = gv.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = gv.nl - gv.gfcc("gjyo", gfdd(int ), (int)402)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  == gv.gfcc("gjyp", gfbz(int ), (int)1076)) break;
                v2 /* !! */  = (long)gv.gfcc("gjyu", gfbz(int ), (int)1077);
            }
            var3_3 /* !! */  = gv.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = gv.nl - gv.gfcc("gjyw", gfdd(int ), (int)403)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == gv.gfcc("gjyx", gfbz(int ), (int)1078)) break;
                v3 /* !! */  = (long)gv.gfcc("gjyz", gfbz(int ), (int)1079);
            }
            var2_4 = gv.a;
            if (var4_2) {
                throw null;
lbl31:
                // 10 sources

                return (boolean)gv.gfcc("gjzb", gfbz(int ), (int)1080);
            }
            if (var2_4 || var2_4) ** GOTO lbl31
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = gv.nl - gv.gfcc("gjzc", gfdd(int ), (int)404)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == gv.gfcc("gjzd", gfbz(int ), (int)1081)) break;
                v4 /* !! */  = (long)gv.gfcc("gjzh", gfbz(int ), (int)1082);
            }
            if (!var1_1.method_7960()) break block80;
            if (var2_4 || var2_4) ** GOTO lbl31
            return (boolean)gv.gfcc("gjzk", gfbz(int ), (int)1083);
        }
        if (var2_4 || var2_4) ** GOTO lbl31
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = gv.nl - gv.gfcc("gjzn", gfdd(int ), (int)405)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == gv.gfcc("gjzo", gfbz(int ), (int)1084)) break;
                    v5 /* !! */  = (long)gv.gfcc("gjzp", gfbz(int ), (int)1085);
                }
                v6 /* !! */  = gv.nl;
                if (true) ** GOTO lbl58
                block48: while (true) {
                    v6 /* !! */  = (long)(gv.gfcc("gkab", gfdd(int ), (int)407) - gv.gfcc("gjzx", gfdd(int ), (int)406));
lbl58:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -575749690: {
                            continue block48;
                        }
                        case 1185080505: {
                            break block48;
                        }
                    }
                    break;
                }
                if (!this.loot.isSelected("\u0427\u0430\u0440\u043a\u0438")) ** GOTO lbl82
                if (var2_4) ** GOTO lbl31
                v7 /* !! */  = gv.nl;
                if (true) ** GOTO lbl69
                block49: while (true) {
                    v7 /* !! */  = (long)(gv.gfcc("gkad", gfdd(int ), (int)409) - gv.gfcc("gkac", gfdd(int ), (int)408));
lbl69:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 679877910: {
                            continue block49;
                        }
                        case 1185080505: {
                            break block49;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = gv.nl - gv.gfcc("gkae", gfdd(int ), (int)410)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == gv.gfcc("gkag", gfbz(int ), (int)1086)) break;
                    v8 /* !! */  = (long)gv.gfcc("gkai", gfbz(int ), (int)1087);
                }
                if (var1_1.method_31574(class_1802.field_8367)) ** GOTO lbl111
                if (var2_4) ** GOTO lbl31
lbl82:
                // 2 sources

                if (var2_4 || var2_4) ** GOTO lbl31
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_5 = gv.nl - gv.gfcc("gkaj", gfdd(int ), (int)411)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v9 /* !! */  == gv.gfcc("gkak", gfbz(int ), (int)1088)) break;
                    v9 /* !! */  = (long)gv.gfcc("gkal", gfbz(int ), (int)1089);
                }
                v10 /* !! */  = gv.nl;
                if (true) ** GOTO lbl93
                block52: while (true) {
                    v10 /* !! */  = (long)(gv.gfcc("gkan", gfdd(int ), (int)413) - gv.gfcc("gkam", gfdd(int ), (int)412));
lbl93:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1005515705: {
                            continue block52;
                        }
                        case 1185080505: {
                            break block52;
                        }
                    }
                    break;
                }
                if (!this.loot.isSelected("\u041a\u043b\u044e\u0447-\u041a\u0430\u0440\u0442\u044b")) ** GOTO lbl116
                if (var2_4) ** GOTO lbl31
                v11 /* !! */  = gv.nl;
                if (true) ** GOTO lbl104
                block53: while (true) {
                    v11 /* !! */  = (long)(gv.gfcc("gkaq", gfdd(int ), (int)415) - gv.gfcc("gkap", gfdd(int ), (int)414));
lbl104:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1694074266: {
                            continue block53;
                        }
                        case 1185080505: {
                            break block53;
                        }
                    }
                    break;
                }
                if (!this.isMapKey(var1_1)) ** GOTO lbl116
                if (var2_4) ** GOTO lbl31
lbl111:
                // 2 sources

                if (var2_4 || var2_4) ** GOTO lbl31
                v12 = gv.gfcc("gkax", gfbz(int ), (int)1090);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl119
lbl116:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v12 = gv.gfcc("gkaz", gfbz(int ), (int)1091);
lbl119:
                // 2 sources

                return (boolean)v12;
            }
lbl120:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)gv.gfcc("gkba", gfbz(int ), (int)1092);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl125:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)gv.gfcc("gkbc", gfbz(int ), (int)1093);
                if (var4_2) {
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)gv.gfcc("gkbf", gfbz(int ), (int)1094);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl198
            }
lbl134:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)gv.gfcc("gkbh", gfbz(int ), (int)1095);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl149
            }
            case 4: {
                var3_3 /* !! */  = (int)gv.gfcc("gkbj", gfbz(int ), (int)1096);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl144:
            // 3 sources

            case 5: {
                var3_3 /* !! */  = (int)gv.gfcc("gkbm", gfbz(int ), (int)1097);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl198
            }
lbl149:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)gv.gfcc("gkbp", gfbz(int ), (int)1098);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl163
            }
            case 7: {
                var3_3 /* !! */  = (int)gv.gfcc("gkbs", gfbz(int ), (int)1099);
                if (!var4_2) ** GOTO lbl125
                throw null;
            }
lbl158:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)gv.gfcc("gkbu", gfbz(int ), (int)1100);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl163:
            // 3 sources

            case 9: {
                var3_3 /* !! */  = (int)gv.gfcc("gkbw", gfbz(int ), (int)1101);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl198
            }
lbl168:
            // 3 sources

            case 10: {
                var3_3 /* !! */  = (int)gv.gfcc("gkby", gfbz(int ), (int)1102);
                if (!var4_2) ** GOTO lbl120
                throw null;
            }
            case 11: {
                var3_3 /* !! */  = (int)gv.gfcc("gkbz", gfbz(int ), (int)1103);
                if (!var4_2) ** GOTO lbl163
                throw null;
            }
lbl176:
            // 2 sources

            case 12: {
                do {
                    var3_3 /* !! */  = (int)gv.gfcc("gkch", gfbz(int ), (int)1104);
                } while (!var4_2);
                throw null;
            }
lbl181:
            // 2 sources

            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)gv.gfcc("gkci", gfbz(int ), (int)1105);
                    if (!var4_2) ** GOTO lbl144
                    throw null;
                }
            }
            case 14: {
                var3_3 /* !! */  = (int)gv.gfcc("gkck", gfbz(int ), (int)1106);
                if (!var4_2) ** GOTO lbl176
                throw null;
            }
            case 15: {
                var3_3 /* !! */  = (int)gv.gfcc("gkcm", gfbz(int ), (int)1107);
                if (!var4_2) ** GOTO lbl168
                throw null;
            }
            case 16: {
                var3_3 /* !! */  = (int)gv.gfcc("gkcp", gfbz(int ), (int)1108);
                if (!var4_2) ** GOTO lbl144
                throw null;
            }
lbl198:
            // 4 sources

            case 17: {
                var3_3 /* !! */  = (int)gv.gfcc("gkcs", gfbz(int ), (int)1109);
                if (!var4_2) ** GOTO lbl134
                throw null;
            }
            case 18: 
        }
        var3_3 /* !! */  = (int)gv.gfcc("gkcu", gfbz(int ), (int)1110);
        ** while (!var4_2)
lbl205:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void stopUsingItem() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gv.nl - gv.gfcc("gfqt", gfdd(int ), (int)64)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == gv.gfcc("gfqu", gfbz(int ), (int)311)) break;
            v0 /* !! */  = (long)gv.gfcc("gfqv", gfbz(int ), (int)312);
        }
        var3_1 = gv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gv.nl - gv.gfcc("gfqw", gfdd(int ), (int)65)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == gv.gfcc("gfqx", gfbz(int ), (int)313)) break;
            v1 /* !! */  = (long)gv.gfcc("gfqy", gfbz(int ), (int)314);
        }
        var2_2 /* !! */  = gv.b;
        v2 /* !! */  = gv.nl;
        if (true) ** GOTO lbl17
        block42: while (true) {
            v2 /* !! */  = (long)(v3 - gv.gfcc("gfqz", gfdd(int ), (int)66));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1549925190: {
                    v3 = gv.gfcc("gfra", gfdd(int ), (int)67);
                    continue block42;
                }
                case 541616452: {
                    v3 = gv.gfcc("gfrb", gfdd(int ), (int)68);
                    continue block42;
                }
                case 1185080505: {
                    break block42;
                }
            }
            break;
        }
        var1_3 = gv.a;
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
                v4 /* !! */  = gv.nl;
                if (true) ** GOTO lbl40
                block44: while (true) {
                    v4 /* !! */  = (long)(v5 - gv.gfcc("gfrc", gfdd(int ), (int)69));
lbl40:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1246700428: {
                            v5 = gv.gfcc("gfrd", gfdd(int ), (int)70);
                            continue block44;
                        }
                        case -827361150: {
                            v5 = gv.gfcc("gfre", gfdd(int ), (int)71);
                            continue block44;
                        }
                        case -319663681: {
                            v5 = gv.gfcc("gfrf", gfdd(int ), (int)72);
                            continue block44;
                        }
                        case 1185080505: {
                            break block44;
                        }
                    }
                    break;
                }
                v6 /* !! */  = gv.nl;
                if (true) ** GOTO lbl56
                block45: while (true) {
                    v6 /* !! */  = (long)(v7 - gv.gfcc("gfrg", gfdd(int ), (int)73));
lbl56:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1475257445: {
                            v7 = gv.gfcc("gfrh", gfdd(int ), (int)74);
                            continue block45;
                        }
                        case -79516000: {
                            v7 = gv.gfcc("gfri", gfdd(int ), (int)75);
                            continue block45;
                        }
                        case 1185080505: {
                            break block45;
                        }
                    }
                    break;
                }
                if (gv.mc.field_1690 == null) ** GOTO lbl111
                if (var1_3 || var1_3) ** GOTO lbl29
                v8 /* !! */  = gv.nl;
                if (true) ** GOTO lbl71
                block46: while (true) {
                    v8 /* !! */  = (long)(v9 - gv.gfcc("gfrj", gfdd(int ), (int)76));
lbl71:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case 72809912: {
                            v9 = gv.gfcc("gfrk", gfdd(int ), (int)77);
                            continue block46;
                        }
                        case 1185080505: {
                            break block46;
                        }
                        case 1309847561: {
                            v9 = gv.gfcc("gfrl", gfdd(int ), (int)78);
                            continue block46;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_2 = gv.nl - gv.gfcc("gfrm", gfdd(int ), (int)79)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == gv.gfcc("gfrn", gfbz(int ), (int)315)) break;
                    v10 /* !! */  = (long)gv.gfcc("gfro", gfbz(int ), (int)316);
                }
                v11 = gv.mc.field_1690;
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_3 = gv.nl - gv.gfcc("gfrp", gfdd(int ), (int)80)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == gv.gfcc("gfrq", gfbz(int ), (int)317)) break;
                    v12 /* !! */  = (long)gv.gfcc("gfrr", gfbz(int ), (int)318);
                }
                v13 = v11.field_1904;
                v14 = gv.gfcc("gfrs", gfbz(int ), (int)319);
                v15 /* !! */  = gv.nl;
                if (true) ** GOTO lbl97
                block49: while (true) {
                    v15 /* !! */  = (long)(v16 - gv.gfcc("gfrt", gfdd(int ), (int)81));
lbl97:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1469062620: {
                            v16 = gv.gfcc("gfru", gfdd(int ), (int)82);
                            continue block49;
                        }
                        case -1069713197: {
                            v16 = gv.gfcc("gfrv", gfdd(int ), (int)83);
                            continue block49;
                        }
                        case 821023523: {
                            v16 = gv.gfcc("gfrw", gfdd(int ), (int)84);
                            continue block49;
                        }
                        case 1185080505: {
                            break block49;
                        }
                    }
                    break;
                }
                v13.method_23481((boolean)v14);
                if (var1_3) ** GOTO lbl29
lbl111:
                // 2 sources

                if (var1_3 || var1_3) ** GOTO lbl29
                v17 = gv.gfcc("gfrx", gfbz(int ), (int)320);
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_4 = gv.nl - gv.gfcc("gfry", gfdd(int ), (int)85)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == gv.gfcc("gfrz", gfbz(int ), (int)321)) break;
                    v18 /* !! */  = (long)gv.gfcc("gfsa", gfbz(int ), (int)322);
                }
                this.autoEating = v17;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)gv.gfcc("gfsb", gfbz(int ), (int)323);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl132
            }
lbl127:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)gv.gfcc("gfsc", gfbz(int ), (int)324);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl144
            }
lbl132:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)gv.gfcc("gfsd", gfbz(int ), (int)325);
                if (!var3_1) break;
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)gv.gfcc("gfse", gfbz(int ), (int)326);
                if (var3_1) {
                    throw null;
                }
            }
lbl140:
            // 6 sources

            case 4: {
                var2_2 /* !! */  = (int)gv.gfcc("gfsf", gfbz(int ), (int)327);
                if (!var3_1) ** GOTO lbl127
                throw null;
            }
lbl144:
            // 3 sources

            case 5: {
                var2_2 /* !! */  = (int)gv.gfcc("gfsg", gfbz(int ), (int)328);
                if (!var3_1) break;
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)gv.gfcc("gfsh", gfbz(int ), (int)329);
                if (!var3_1) ** GOTO lbl140
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)gv.gfcc("gfsi", gfbz(int ), (int)330);
                if (!var3_1) ** GOTO lbl140
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)gv.gfcc("gfsj", gfbz(int ), (int)331);
                if (!var3_1) ** GOTO lbl144
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)gv.gfcc("gfsk", gfbz(int ), (int)332);
                if (!var3_1) ** GOTO lbl140
                throw null;
            }
            case 10: 
        }
        do {
            var2_2 /* !! */  = (int)gv.gfcc("gfsl", gfbz(int ), (int)333);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void resetRuntime() {
        var3_1 = gv.c;
        var2_2 /* !! */  = gv.b;
        var1_3 = gv.a;
        if (var3_1) {
            throw null;
lbl6:
            // 18 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl6
        this.targetMinecart = null;
        if (var1_3 || var1_3) ** GOTO lbl6
        this.currentPathKey = null;
        if (var1_3 || var1_3) ** GOTO lbl6
        this.openedMinecartKey = null;
        if (var1_3 || var1_3) ** GOTO lbl6
        this.depositingToEnderChest = gv.gfcc("gnvo", gfbz(int ), (int)1635);
        if (var1_3 || var1_3) ** GOTO lbl6
        this.needsInvest = gv.gfcc("gnvr", gfbz(int ), (int)1636);
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl6
                this.autoEating = gv.gfcc("gnvw", gfbz(int ), (int)1637);
                if (var1_3 || var1_3) ** GOTO lbl6
                this.foundLootByMinecart.clear();
                if (var1_3 || var1_3) ** GOTO lbl6
                if (gv.mc.field_1724 == null) {
                    v0 /* !! */  = gv.gfcc("gnvz", gfbz(int ), (int)1638);
                    if (var3_1) {
                        throw null;
                    }
                } else {
                    v0 /* !! */  = (CallSite)Math.round(gv.mc.field_1724.method_36454() / gv.gfcc("gnwa", gfce(int ), (int)1639));
                }
                this.exploreDirectionIndex = Math.floorMod((int)v0 /* !! */ , gv.EXPLORE_DIRECTIONS.length);
                if (var1_3 || var1_3) ** GOTO lbl6
                this.caveLevelIndex = (int)gv.gfcc("gnwb", gfbz(int ), (int)1640);
                if (var1_3 || var1_3) ** GOTO lbl6
                this.exploreTarget = null;
                if (var1_3 || var1_3) ** GOTO lbl6
                this.lastMinecartScanPos = null;
                if (var1_3 || var1_3) ** GOTO lbl6
                this.nextMinecartScanDistance = (double)gv.gfcc("gnwh", gfjl(int ), (int)749);
                if (var1_3 || var1_3) ** GOTO lbl6
                this.pathTimer.reset();
                if (var1_3 || var1_3) ** GOTO lbl6
                this.clickTimer.reset();
                if (var1_3 || var1_3) ** GOTO lbl6
                this.interactTimer.reset();
                if (var1_3 || var1_3) ** GOTO lbl6
                this.leaveTimer.reset();
                if (var1_3 || var1_3) ** GOTO lbl6
                this.fixTimer.reset();
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)gv.gfcc("gnwk", gfbz(int ), (int)1641);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl87
            }
lbl58:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)gv.gfcc("gnwo", gfbz(int ), (int)1642);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl92
            }
            case 2: {
                var2_2 /* !! */  = (int)gv.gfcc("gnwu", gfbz(int ), (int)1643);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl184
            }
            case 3: {
                var2_2 /* !! */  = (int)gv.gfcc("gnwx", gfbz(int ), (int)1644);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl73:
            // 4 sources

            case 4: {
                var2_2 /* !! */  = (int)gv.gfcc("gnxa", gfbz(int ), (int)1645);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl130
            }
            case 5: {
                var2_2 /* !! */  = (int)gv.gfcc("gnxc", gfbz(int ), (int)1646);
                if (var3_1) {
                    throw null;
                }
            }
lbl82:
            // 5 sources

            case 6: {
                var2_2 /* !! */  = (int)gv.gfcc("gnxe", gfbz(int ), (int)1647);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl130
            }
lbl87:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)gv.gfcc("gnxf", gfbz(int ), (int)1648);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl218
            }
lbl92:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)gv.gfcc("gnxg", gfbz(int ), (int)1649);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl162
            }
lbl97:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)gv.gfcc("gnxl", gfbz(int ), (int)1650);
                if (!var3_1) ** GOTO lbl73
                throw null;
            }
            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)gv.gfcc("gnxo", gfbz(int ), (int)1651);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl188
                    break;
                }
            }
lbl107:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)gv.gfcc("gnxp", gfbz(int ), (int)1652);
                if (!var3_1) ** GOTO lbl73
                throw null;
            }
            case 12: {
                var2_2 /* !! */  = (int)gv.gfcc("gnxq", gfbz(int ), (int)1653);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl214
            }
            case 13: {
                var2_2 /* !! */  = (int)gv.gfcc("gnxr", gfbz(int ), (int)1654);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl121:
            // 2 sources

            case 14: {
                var2_2 /* !! */  = (int)gv.gfcc("gnxu", gfbz(int ), (int)1655);
                if (!var3_1) ** GOTO lbl107
                throw null;
            }
            case 15: {
                var2_2 /* !! */  = (int)gv.gfcc("gnxx", gfbz(int ), (int)1656);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl157
            }
lbl130:
            // 3 sources

            case 16: {
                var2_2 /* !! */  = (int)gv.gfcc("gnyc", gfbz(int ), (int)1657);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl157
            }
            case 17: {
                var2_2 /* !! */  = (int)gv.gfcc("gnyg", gfbz(int ), (int)1658);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl184
            }
            case 18: {
                var2_2 /* !! */  = (int)gv.gfcc("gnyi", gfbz(int ), (int)1659);
                if (!var3_1) break;
                throw null;
            }
            case 19: {
                var2_2 /* !! */  = (int)gv.gfcc("gnyk", gfbz(int ), (int)1660);
                if (!var3_1) ** GOTO lbl97
                throw null;
            }
lbl148:
            // 2 sources

            case 20: {
                var2_2 /* !! */  = (int)gv.gfcc("gnyl", gfbz(int ), (int)1661);
                if (!var3_1) ** GOTO lbl82
                throw null;
            }
lbl152:
            // 2 sources

            case 21: {
                var2_2 /* !! */  = (int)gv.gfcc("gnyn", gfbz(int ), (int)1662);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl175
            }
lbl157:
            // 4 sources

            case 22: {
                var2_2 /* !! */  = (int)gv.gfcc("gnyp", gfbz(int ), (int)1663);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl162:
            // 2 sources

            case 23: {
                var2_2 /* !! */  = (int)gv.gfcc("gnyv", gfbz(int ), (int)1664);
                if (!var3_1) ** GOTO lbl152
                throw null;
            }
lbl166:
            // 2 sources

            case 24: {
                var2_2 /* !! */  = (int)gv.gfcc("gnyw", gfbz(int ), (int)1665);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl218
            }
lbl171:
            // 2 sources

            case 25: {
                var2_2 /* !! */  = (int)gv.gfcc("gnyy", gfbz(int ), (int)1666);
                if (!var3_1) ** GOTO lbl73
                throw null;
            }
lbl175:
            // 2 sources

            case 26: {
                var2_2 /* !! */  = (int)gv.gfcc("gnza", gfbz(int ), (int)1667);
                if (!var3_1) ** GOTO lbl166
                throw null;
            }
lbl179:
            // 2 sources

            case 27: {
                var2_2 /* !! */  = (int)gv.gfcc("gnzd", gfbz(int ), (int)1668);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl205
            }
lbl184:
            // 3 sources

            case 28: {
                var2_2 /* !! */  = (int)gv.gfcc("gnzf", gfbz(int ), (int)1669);
                if (!var3_1) ** GOTO lbl148
                throw null;
            }
lbl188:
            // 2 sources

            case 29: {
                var2_2 /* !! */  = (int)gv.gfcc("gnzh", gfbz(int ), (int)1670);
                if (!var3_1) ** GOTO lbl171
                throw null;
            }
            case 30: {
                do {
                    var2_2 /* !! */  = (int)gv.gfcc("gnzm", gfbz(int ), (int)1671);
                } while (!var3_1);
                throw null;
            }
lbl197:
            // 3 sources

            case 31: {
                var2_2 /* !! */  = (int)gv.gfcc("gnzp", gfbz(int ), (int)1672);
                if (!var3_1) ** GOTO lbl82
                throw null;
            }
lbl201:
            // 2 sources

            case 32: {
                var2_2 /* !! */  = (int)gv.gfcc("gnzr", gfbz(int ), (int)1673);
                if (!var3_1) ** GOTO lbl58
                throw null;
            }
lbl205:
            // 2 sources

            case 33: {
                var2_2 /* !! */  = (int)gv.gfcc("gnzs", gfbz(int ), (int)1674);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl214
            }
            case 34: {
                var2_2 /* !! */  = (int)gv.gfcc("gnzu", gfbz(int ), (int)1675);
                if (!var3_1) ** GOTO lbl179
                throw null;
            }
lbl214:
            // 3 sources

            case 35: {
                var2_2 /* !! */  = (int)gv.gfcc("gnzx", gfbz(int ), (int)1676);
                if (!var3_1) ** GOTO lbl121
                throw null;
            }
lbl218:
            // 3 sources

            case 36: {
                var2_2 /* !! */  = (int)gv.gfcc("goaa", gfbz(int ), (int)1677);
                if (!var3_1) ** GOTO lbl157
                throw null;
            }
            case 37: 
        }
        var2_2 /* !! */  = (int)gv.gfcc("goae", gfbz(int ), (int)1678);
        ** while (!var3_1)
lbl225:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gqlu() {
        gv.gfde[500] = 6012240886211689060L;
        gv.gfde[501] = -4599693056173171114L;
        gv.gfde[502] = -6502015788362309365L;
        gv.gfde[503] = -2640200588338389051L;
        gv.gfde[504] = 9091774553692834633L;
        gv.gfde[505] = -554932046028537639L;
        gv.gfde[506] = 6745595014353020570L;
        gv.gfde[507] = -6151793692206944101L;
        gv.gfde[508] = 4463494412240774869L;
        gv.gfde[509] = -5511690705168863098L;
        gv.gfde[510] = -8484313968301997864L;
        gv.gfde[511] = 5317359407571243407L;
        gv.gfde[512] = -2996113136246115986L;
        gv.gfde[513] = 227200004995168371L;
        gv.gfde[514] = 5702998559438519545L;
        gv.gfde[515] = 838789752074198186L;
        gv.gfde[516] = 2261419211240832467L;
        gv.gfde[517] = -3356255360682313935L;
        gv.gfde[518] = -8454887418148200245L;
        gv.gfde[519] = 5857809817124545607L;
        gv.gfde[520] = 9119429235430167106L;
        gv.gfde[521] = 2918980063991205154L;
        gv.gfde[522] = -7304281131959323718L;
        gv.gfde[523] = 6965495551695097443L;
        gv.gfde[524] = 2961370279254915307L;
        gv.gfde[525] = -4710778458610722637L;
        gv.gfde[526] = 8775611268431046997L;
        gv.gfde[527] = -5147490183726596639L;
        gv.gfde[528] = -4635947428360638175L;
        gv.gfde[529] = 5872044966488475975L;
        gv.gfde[530] = 8298312101168561835L;
        gv.gfde[531] = -8199129872855655417L;
        gv.gfde[532] = 2046844871580331865L;
        gv.gfde[533] = 3617394096480922551L;
        gv.gfde[534] = -4023411265719452838L;
        gv.gfde[535] = -5263788947033818590L;
        gv.gfde[536] = -4042168762644661867L;
        gv.gfde[537] = 5940944649559086258L;
        gv.gfde[538] = 1173965267128661752L;
        gv.gfde[539] = 550765161813926314L;
        gv.gfde[540] = 4646718075497981987L;
        gv.gfde[541] = 7842235003962518162L;
        gv.gfde[542] = 5107186181924092188L;
        gv.gfde[543] = 3536615998501375206L;
        gv.gfde[544] = -351676573716117548L;
        gv.gfde[545] = -7299619202577269063L;
        gv.gfde[546] = 2334424623709041554L;
        gv.gfde[547] = 6207275748675395429L;
        gv.gfde[548] = 4678226201963974124L;
        gv.gfde[549] = -4477255174014743744L;
        gv.gfde[550] = 4491169052566278305L;
        gv.gfde[551] = 3099555602455146779L;
        gv.gfde[552] = -7767757223318335L;
        gv.gfde[553] = -3805135471643294681L;
        gv.gfde[554] = 1133835652288052899L;
        gv.gfde[555] = 8147151910077231441L;
        gv.gfde[556] = 6932715406842526278L;
        gv.gfde[557] = 7568186489648932252L;
        gv.gfde[558] = 5739802133888789772L;
        gv.gfde[559] = -2822540632481513411L;
        gv.gfde[560] = -79656814810687155L;
        gv.gfde[561] = 7145710756552133560L;
        gv.gfde[562] = -8776306286339177514L;
        gv.gfde[563] = 2247298862897194350L;
        gv.gfde[564] = 1726160053317000504L;
        gv.gfde[565] = -4131126271773477042L;
        gv.gfde[566] = 3698433578406616576L;
        gv.gfde[567] = -4482693219951192268L;
        gv.gfde[568] = 4255294341919379848L;
        gv.gfde[569] = 4291391318755345727L;
        gv.gfde[570] = 194371939506140382L;
        gv.gfde[571] = 5276273968913157873L;
        gv.gfde[572] = -6544608912634594087L;
        gv.gfde[573] = 2420551319441555848L;
        gv.gfde[574] = 2220254207202407532L;
        gv.gfde[575] = -6087747519339112173L;
        gv.gfde[576] = 7196537329015569157L;
        gv.gfde[577] = 6775641075646235302L;
        gv.gfde[578] = -8225198132950627765L;
        gv.gfde[579] = -183505552220788567L;
        gv.gfde[580] = -8009725630744903745L;
        gv.gfde[581] = -7843086116734764395L;
        gv.gfde[582] = 3678003990160188344L;
        gv.gfde[583] = -3641621466913865761L;
        gv.gfde[584] = 4470626407881067208L;
        gv.gfde[585] = 5463679845381657796L;
        gv.gfde[586] = 6562332472670286627L;
        gv.gfde[587] = -2643469423897761487L;
        gv.gfde[588] = 6731777364603329373L;
        gv.gfde[589] = 4087847105573939932L;
        gv.gfde[590] = -4310660135625353835L;
        gv.gfde[591] = -5219134077066143160L;
        gv.gfde[592] = 4848183223558409186L;
        gv.gfde[593] = 6188504052675860293L;
        gv.gfde[594] = 1317234833591925179L;
        gv.gfde[595] = 7763380504589895212L;
        gv.gfde[596] = 5714040809393441831L;
        gv.gfde[597] = 6451877726963143551L;
        gv.gfde[598] = -7797997879751637353L;
        gv.gfde[599] = -8707299901381134465L;
    }

    private static /* synthetic */ void gqln() {
        gv.gfde[300] = -6658160392150536762L;
        gv.gfde[301] = -3085519941870264478L;
        gv.gfde[302] = -7349650023323809323L;
        gv.gfde[303] = 1722455509617160131L;
        gv.gfde[304] = 600016079696543984L;
        gv.gfde[305] = -3394681046289500073L;
        gv.gfde[306] = -4767886213586878573L;
        gv.gfde[307] = 7025433774512368461L;
        gv.gfde[308] = -3733508147267983648L;
        gv.gfde[309] = -4995600464869921270L;
        gv.gfde[310] = -4768292736548980248L;
        gv.gfde[311] = 6054713820946236376L;
        gv.gfde[312] = 7086929552460236672L;
        gv.gfde[313] = -3043961138268481564L;
        gv.gfde[314] = -3344662317749640473L;
        gv.gfde[315] = 935577929210148406L;
        gv.gfde[316] = 7066939622438709614L;
        gv.gfde[317] = 4095923096219525227L;
        gv.gfde[318] = 1173827938112878369L;
        gv.gfde[319] = 5428915411111988915L;
        gv.gfde[320] = 7550111299560486116L;
        gv.gfde[321] = -6473657602150336468L;
        gv.gfde[322] = 6924812307315941622L;
        gv.gfde[323] = 4643809346473429916L;
        gv.gfde[324] = -5051730680587160718L;
        gv.gfde[325] = -5086859756899835339L;
        gv.gfde[326] = -9121593532391661804L;
        gv.gfde[327] = -869515848606557661L;
        gv.gfde[328] = -6437083546409260031L;
        gv.gfde[329] = 8706051325335028608L;
        gv.gfde[330] = 3304874935362010199L;
        gv.gfde[331] = 7816952009026395855L;
        gv.gfde[332] = 2562034514793285097L;
        gv.gfde[333] = -385091310163385565L;
        gv.gfde[334] = 7902780530761633103L;
        gv.gfde[335] = -3488657230277558992L;
        gv.gfde[336] = -5703422404814858662L;
        gv.gfde[337] = -8751365326880879791L;
        gv.gfde[338] = -3267437490546638370L;
        gv.gfde[339] = -546257498127916345L;
        gv.gfde[340] = 3579721961718596852L;
        gv.gfde[341] = 6881883032991203066L;
        gv.gfde[342] = -2782530442357633460L;
        gv.gfde[343] = 5955286465469882734L;
        gv.gfde[344] = -3076108119103998112L;
        gv.gfde[345] = 3811915979916129129L;
        gv.gfde[346] = -6493285270915551356L;
        gv.gfde[347] = -3403514181853421548L;
        gv.gfde[348] = 7365676688549946784L;
        gv.gfde[349] = -4856394642166911410L;
        gv.gfde[350] = -3575483711748717391L;
        gv.gfde[351] = 3535026107977137227L;
        gv.gfde[352] = 2100201628811525055L;
        gv.gfde[353] = 7969582680515566199L;
        gv.gfde[354] = 3784127369968796305L;
        gv.gfde[355] = 763669364886234241L;
        gv.gfde[356] = -4225203544476352175L;
        gv.gfde[357] = 3035126769390500856L;
        gv.gfde[358] = -1915921402601850297L;
        gv.gfde[359] = 8527271713467319109L;
        gv.gfde[360] = -4223478110799928986L;
        gv.gfde[361] = 1824805832602381004L;
        gv.gfde[362] = 3124410583076947351L;
        gv.gfde[363] = 3754366057444215631L;
        gv.gfde[364] = 5666956435734794846L;
        gv.gfde[365] = -4771081204186181320L;
        gv.gfde[366] = -3362798223503030294L;
        gv.gfde[367] = -2985893941045132552L;
        gv.gfde[368] = -4021325829739242058L;
        gv.gfde[369] = -7037966472381299625L;
        gv.gfde[370] = 1813903763592337028L;
        gv.gfde[371] = 8317602028907605742L;
        gv.gfde[372] = 4126756495214808606L;
        gv.gfde[373] = -3132211093758072127L;
        gv.gfde[374] = -3203324875190839862L;
        gv.gfde[375] = -5039335860082028671L;
        gv.gfde[376] = 537761575145207884L;
        gv.gfde[377] = -5750396835108935744L;
        gv.gfde[378] = -2133156269428247895L;
        gv.gfde[379] = 5266051741133061370L;
        gv.gfde[380] = 6639135555615628289L;
        gv.gfde[381] = 3327608676115490048L;
        gv.gfde[382] = -8621176727685825172L;
        gv.gfde[383] = -7382691534616931181L;
        gv.gfde[384] = -2591573243890110409L;
        gv.gfde[385] = -6956539788373618926L;
        gv.gfde[386] = 7585129156309931816L;
        gv.gfde[387] = 7487820482003922369L;
        gv.gfde[388] = 6338568970810108006L;
        gv.gfde[389] = -8995364941469832211L;
        gv.gfde[390] = 3857414857095773647L;
        gv.gfde[391] = -5977221077221255520L;
        gv.gfde[392] = 5579379834250150734L;
        gv.gfde[393] = -3412038213200510913L;
        gv.gfde[394] = -2583305296716774554L;
        gv.gfde[395] = -5553540781242359186L;
        gv.gfde[396] = -7771946619664345308L;
        gv.gfde[397] = -6734336112970970760L;
        gv.gfde[398] = -6858277399683329133L;
        gv.gfde[399] = 7038802845414358680L;
    }

    private static /* synthetic */ long gfdd(int n2) {
        return gfde[n2] ^ gfdf[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private String getRememberedEntry(String var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gv.nl - gv.gfcc("gnav", gfdd(int ), (int)636)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gv.gfcc("gnaw", gfbz(int ), (int)1498)) break;
            v0 /* !! */  = (long)gv.gfcc("gnax", gfbz(int ), (int)1499);
        }
        var5_2 = gv.c;
        v1 /* !! */  = gv.nl;
        if (true) ** GOTO lbl12
        block35: while (true) {
            v1 /* !! */  = (long)(v2 - gv.gfcc("gnay", gfdd(int ), (int)637));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -403981772: {
                    v2 = gv.gfcc("gnaz", gfdd(int ), (int)638);
                    continue block35;
                }
                case 966960109: {
                    v2 = gv.gfcc("gnba", gfdd(int ), (int)639);
                    continue block35;
                }
                case 1185080505: {
                    break block35;
                }
                case 1608210721: {
                    v2 = gv.gfcc("gnbb", gfdd(int ), (int)640);
                    continue block35;
                }
            }
            break;
        }
        var4_3 /* !! */  = gv.b;
        v3 /* !! */  = gv.nl;
        if (true) ** GOTO lbl29
        block36: while (true) {
            v3 /* !! */  = (long)(gv.gfcc("gnbe", gfdd(int ), (int)642) - gv.gfcc("gnbd", gfdd(int ), (int)641));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 150937439: {
                    continue block36;
                }
                case 1185080505: {
                    break block36;
                }
            }
            break;
        }
        var3_4 = gv.a;
        if (var5_2) {
            throw null;
lbl37:
            // 6 sources

            return null;
        }
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4 || var3_4) ** GOTO lbl37
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = gv.nl - gv.gfcc("gnbf", gfdd(int ), (int)643)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == gv.gfcc("gnbh", gfbz(int ), (int)1500)) break;
                    v4 /* !! */  = (long)gv.gfcc("gnbi", gfbz(int ), (int)1501);
                }
                v5 /* !! */  = gv.nl;
                if (true) ** GOTO lbl53
                block39: while (true) {
                    v5 /* !! */  = (long)(gv.gfcc("gnbk", gfdd(int ), (int)645) - gv.gfcc("gnbj", gfdd(int ), (int)644));
lbl53:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -177941338: {
                            continue block39;
                        }
                        case 1185080505: {
                            break block39;
                        }
                    }
                    break;
                }
                var2_5 = this.foundLootByMinecart.get(var1_1);
                if (var3_4 || var3_4) ** GOTO lbl37
                if (var2_5 == null) ** GOTO lbl70
                if (var3_4) ** GOTO lbl37
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = gv.nl - gv.gfcc("gnbm", gfdd(int ), (int)646)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == gv.gfcc("gnbn", gfbz(int ), (int)1502)) break;
                    v6 /* !! */  = (long)gv.gfcc("gnbo", gfbz(int ), (int)1503);
                }
                if (!var2_5.isEmpty()) ** GOTO lbl75
                if (var3_4) ** GOTO lbl37
lbl70:
                // 2 sources

                if (var3_4 || var3_4) ** GOTO lbl37
                v7 = var1_1;
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl99
lbl75:
                // 1 sources

                if (!var3_4 && !var3_4) ** break;
                ** continue;
                v8 /* !! */  = gv.nl;
                if (true) ** GOTO lbl81
                block41: while (true) {
                    v8 /* !! */  = (long)(v9 - gv.gfcc("gnbp", gfdd(int ), (int)647));
lbl81:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -616398777: {
                            v9 = gv.gfcc("gnbq", gfdd(int ), (int)648);
                            continue block41;
                        }
                        case -499909527: {
                            v9 = gv.gfcc("gnbr", gfdd(int ), (int)649);
                            continue block41;
                        }
                        case 1185080505: {
                            break block41;
                        }
                    }
                    break;
                }
                v10 = String.join((CharSequence)", ", var2_5);
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = gv.nl - gv.gfcc("gnbu", gfdd(int ), (int)650)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v11 /* !! */  == gv.gfcc("gnbv", gfbz(int ), (int)1504)) {
                        v7 = var1_1 + " - \u043d\u0430\u0439\u0434\u0435\u043d \u043f\u0440\u0435\u0434\u043c\u0435\u0442: " + v10;
                        break;
                    }
                    v11 /* !! */  = (long)gv.gfcc("gnbx", gfbz(int ), (int)1505);
                }
lbl99:
                // 2 sources

                return v7;
            }
            case 0: {
                var4_3 /* !! */  = (int)gv.gfcc("gnbz", gfbz(int ), (int)1506);
                if (!var5_2) break;
                throw null;
            }
lbl104:
            // 2 sources

            case 1: {
                var4_3 /* !! */  = (int)gv.gfcc("gnca", gfbz(int ), (int)1507);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl147
            }
lbl109:
            // 2 sources

            case 2: {
                var4_3 /* !! */  = (int)gv.gfcc("gncb", gfbz(int ), (int)1508);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl139
            }
            case 3: {
                var4_3 /* !! */  = (int)gv.gfcc("gncc", gfbz(int ), (int)1509);
                if (!var5_2) ** GOTO lbl104
                throw null;
            }
            case 4: {
                do {
                    var4_3 /* !! */  = (int)gv.gfcc("gncf", gfbz(int ), (int)1510);
                } while (!var5_2);
                throw null;
            }
            case 5: {
                var4_3 /* !! */  = (int)gv.gfcc("gnch", gfbz(int ), (int)1511);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl147
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)gv.gfcc("gncj", gfbz(int ), (int)1512);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl143
                    break;
                }
            }
            case 7: {
                var4_3 /* !! */  = (int)gv.gfcc("gncl", gfbz(int ), (int)1513);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl147
            }
lbl139:
            // 3 sources

            case 8: {
                var4_3 /* !! */  = (int)gv.gfcc("gncm", gfbz(int ), (int)1514);
                if (var5_2) {
                    throw null;
                }
            }
lbl143:
            // 5 sources

            case 9: {
                var4_3 /* !! */  = (int)gv.gfcc("gnco", gfbz(int ), (int)1515);
                if (!var5_2) ** GOTO lbl139
                throw null;
            }
lbl147:
            // 4 sources

            case 10: {
                var4_3 /* !! */  = (int)gv.gfcc("gncq", gfbz(int ), (int)1516);
                if (!var5_2) ** GOTO lbl109
                throw null;
            }
            case 11: {
                var4_3 /* !! */  = (int)gv.gfcc("gncs", gfbz(int ), (int)1517);
                if (!var5_2) ** GOTO lbl143
                throw null;
            }
            case 12: 
        }
        var4_3 /* !! */  = (int)gv.gfcc("gnct", gfbz(int ), (int)1518);
        ** while (!var5_2)
lbl158:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gpuf() {
        gv.gfca[100] = -681725783;
        gv.gfca[101] = -1951817457;
        gv.gfca[102] = 1203739877;
        gv.gfca[103] = -374776848;
        gv.gfca[104] = 1312121186;
        gv.gfca[105] = -1615215607;
        gv.gfca[106] = 339860056;
        gv.gfca[107] = -702027997;
        gv.gfca[108] = 1653329034;
        gv.gfca[109] = -1083720048;
        gv.gfca[110] = 2142952907;
        gv.gfca[111] = -613147884;
        gv.gfca[112] = 1430886380;
        gv.gfca[113] = -1644167358;
        gv.gfca[114] = -866374304;
        gv.gfca[115] = -394508882;
        gv.gfca[116] = 1823956972;
        gv.gfca[117] = -314210799;
        gv.gfca[118] = 35329676;
        gv.gfca[119] = -1648905275;
        gv.gfca[120] = 317039784;
        gv.gfca[121] = 1804862803;
        gv.gfca[122] = -267534413;
        gv.gfca[123] = 1504319684;
        gv.gfca[124] = 2076414722;
        gv.gfca[125] = -1505778934;
        gv.gfca[126] = -963179172;
        gv.gfca[127] = -464242549;
        gv.gfca[128] = -1351708132;
        gv.gfca[129] = 1119689196;
        gv.gfca[130] = -1507460487;
        gv.gfca[131] = 550495796;
        gv.gfca[132] = 1301420410;
        gv.gfca[133] = -1082478682;
        gv.gfca[134] = 1256043961;
        gv.gfca[135] = -452291862;
        gv.gfca[136] = -1853598313;
        gv.gfca[137] = -663850756;
        gv.gfca[138] = -509237649;
        gv.gfca[139] = -1885066385;
        gv.gfca[140] = -1390125710;
        gv.gfca[141] = 1854989124;
        gv.gfca[142] = -813173165;
        gv.gfca[143] = 206911096;
        gv.gfca[144] = 147032801;
        gv.gfca[145] = -1385753423;
        gv.gfca[146] = -1085524436;
        gv.gfca[147] = -793592978;
        gv.gfca[148] = 1356028835;
        gv.gfca[149] = 1747532109;
        gv.gfca[150] = 1232407691;
        gv.gfca[151] = 662802894;
        gv.gfca[152] = -1567020150;
        gv.gfca[153] = 533419369;
        gv.gfca[154] = 410030355;
        gv.gfca[155] = 1225754801;
        gv.gfca[156] = 559016858;
        gv.gfca[157] = -272375620;
        gv.gfca[158] = -1769256524;
        gv.gfca[159] = 380324760;
        gv.gfca[160] = 1125854257;
        gv.gfca[161] = 1031658584;
        gv.gfca[162] = -284925812;
        gv.gfca[163] = 1895509663;
        gv.gfca[164] = -1504160154;
        gv.gfca[165] = -1923371038;
        gv.gfca[166] = -1169412473;
        gv.gfca[167] = -966947851;
        gv.gfca[168] = 1984164033;
        gv.gfca[169] = -1417887573;
        gv.gfca[170] = -1278325757;
        gv.gfca[171] = 1330564958;
        gv.gfca[172] = -2064026426;
        gv.gfca[173] = -445517568;
        gv.gfca[174] = -1412346774;
        gv.gfca[175] = -906069322;
        gv.gfca[176] = -1157072628;
        gv.gfca[177] = 1008501656;
        gv.gfca[178] = -2081126716;
        gv.gfca[179] = 1593687722;
        gv.gfca[180] = 1718235894;
        gv.gfca[181] = -390722623;
        gv.gfca[182] = -1166634421;
        gv.gfca[183] = 1955034847;
        gv.gfca[184] = -927034133;
        gv.gfca[185] = -1263047760;
        gv.gfca[186] = -1762042455;
        gv.gfca[187] = -1491772110;
        gv.gfca[188] = 1400123142;
        gv.gfca[189] = -698746762;
        gv.gfca[190] = -133496186;
        gv.gfca[191] = 189051299;
        gv.gfca[192] = 995632600;
        gv.gfca[193] = -1818238740;
        gv.gfca[194] = -54119468;
        gv.gfca[195] = 720521694;
        gv.gfca[196] = 1032382630;
        gv.gfca[197] = 1795273215;
        gv.gfca[198] = -1657792922;
        gv.gfca[199] = -869369035;
    }

    private static /* synthetic */ void gqme() {
        gv.gfde[600] = 1733838186141563023L;
        gv.gfde[601] = 3948646646913154993L;
        gv.gfde[602] = -302194836887955984L;
        gv.gfde[603] = 411102332412231988L;
        gv.gfde[604] = 5484713635358110472L;
        gv.gfde[605] = -387047495176635314L;
        gv.gfde[606] = 264646206098228657L;
        gv.gfde[607] = -1976852568847531173L;
        gv.gfde[608] = -5959929994868490902L;
        gv.gfde[609] = 6210876000606362738L;
        gv.gfde[610] = 9060481478361257734L;
        gv.gfde[611] = 8755056240148378325L;
        gv.gfde[612] = 3591924469930590895L;
        gv.gfde[613] = -3128929100652431642L;
        gv.gfde[614] = -4125906093189216228L;
        gv.gfde[615] = 5207087056710644L;
        gv.gfde[616] = -3018984273916358360L;
        gv.gfde[617] = 8584602175233523905L;
        gv.gfde[618] = 8012926814324407784L;
        gv.gfde[619] = 3995161343244834618L;
        gv.gfde[620] = 6226914694012910034L;
        gv.gfde[621] = 1835115539365287053L;
        gv.gfde[622] = -7965977769472430014L;
        gv.gfde[623] = 7804788133075099491L;
        gv.gfde[624] = -3635750958520745821L;
        gv.gfde[625] = 660665394286667962L;
        gv.gfde[626] = 4969674805160686752L;
        gv.gfde[627] = -781024035481976639L;
        gv.gfde[628] = -7012904496321923866L;
        gv.gfde[629] = 7479526043605609408L;
        gv.gfde[630] = 4519848939561358080L;
        gv.gfde[631] = -3305633043475906634L;
        gv.gfde[632] = 8174063183664152443L;
        gv.gfde[633] = -9050692956139555509L;
        gv.gfde[634] = -5508726622000317152L;
        gv.gfde[635] = 778989345861092967L;
        gv.gfde[636] = 7466896855999035507L;
        gv.gfde[637] = 8283915248327537536L;
        gv.gfde[638] = 9118291450592171338L;
        gv.gfde[639] = 2493748186868509421L;
        gv.gfde[640] = 2116298028741934425L;
        gv.gfde[641] = 8319018653539525910L;
        gv.gfde[642] = 2539319137989826938L;
        gv.gfde[643] = 7856257008707250964L;
        gv.gfde[644] = -4944054106933640184L;
        gv.gfde[645] = -4700947272127140286L;
        gv.gfde[646] = -3992689219967981416L;
        gv.gfde[647] = 7872648800223703481L;
        gv.gfde[648] = -2816194012986576681L;
        gv.gfde[649] = 7963220889260979345L;
        gv.gfde[650] = 5310238094842960596L;
        gv.gfde[651] = 892890755535108347L;
        gv.gfde[652] = 5624280547403735607L;
        gv.gfde[653] = -4639862277340477510L;
        gv.gfde[654] = -2050048765197155400L;
        gv.gfde[655] = 1137430786060298430L;
        gv.gfde[656] = -5488994817197043063L;
        gv.gfde[657] = 1776793531787320444L;
        gv.gfde[658] = -7884121352330064191L;
        gv.gfde[659] = 743983106419674133L;
        gv.gfde[660] = 6807075887244704593L;
        gv.gfde[661] = -5412455642565932300L;
        gv.gfde[662] = -7340153913884824041L;
        gv.gfde[663] = -5955149479717091263L;
        gv.gfde[664] = -4573366890802472851L;
        gv.gfde[665] = 8888463395253987203L;
        gv.gfde[666] = 8373404712402350873L;
        gv.gfde[667] = -3244104029604428206L;
        gv.gfde[668] = -6993437870194198824L;
        gv.gfde[669] = -7274982999215554596L;
        gv.gfde[670] = -3236549176860817466L;
        gv.gfde[671] = -9082250084766633286L;
        gv.gfde[672] = 3030565234691931142L;
        gv.gfde[673] = -2649095657866323412L;
        gv.gfde[674] = 35899591211853346L;
        gv.gfde[675] = 7514729976534421809L;
        gv.gfde[676] = -4084303837659955031L;
        gv.gfde[677] = -6779073571910258631L;
        gv.gfde[678] = 8531820873676792061L;
        gv.gfde[679] = 2916601499251191573L;
        gv.gfde[680] = 4319250403326713748L;
        gv.gfde[681] = 7086339955451993805L;
        gv.gfde[682] = -1138172840915146580L;
        gv.gfde[683] = -7757305667786087935L;
        gv.gfde[684] = -8392801963614809933L;
        gv.gfde[685] = -562368577940446936L;
        gv.gfde[686] = -6829447633209640904L;
        gv.gfde[687] = -7481901435470251549L;
        gv.gfde[688] = -7649668567014284421L;
        gv.gfde[689] = 2919066190846772342L;
        gv.gfde[690] = -5135335304697330545L;
        gv.gfde[691] = 3857074810866956289L;
        gv.gfde[692] = 6138479260723058831L;
        gv.gfde[693] = -5849914190441289728L;
        gv.gfde[694] = 2040887125486034825L;
        gv.gfde[695] = 6925780224484731285L;
        gv.gfde[696] = 2405750989133860195L;
        gv.gfde[697] = 3425365192247080743L;
        gv.gfde[698] = -7797148377343251349L;
        gv.gfde[699] = 7087223246036591936L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void rememberFoundLoot(String var1_1, class_1799 var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gv.nl - gv.gfcc("gmqn", gfdd(int ), (int)550)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == gv.gfcc("gmqv", gfbz(int ), (int)1393)) break;
            v0 /* !! */  = (long)gv.gfcc("gmqw", gfbz(int ), (int)1394);
        }
        var5_3 = gv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gv.nl - gv.gfcc("gmqx", gfdd(int ), (int)551)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == gv.gfcc("gmqy", gfbz(int ), (int)1395)) break;
            v1 /* !! */  = (long)gv.gfcc("gmqz", gfbz(int ), (int)1396);
        }
        var4_4 /* !! */  = gv.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = gv.nl - gv.gfcc("gmrb", gfdd(int ), (int)552)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == gv.gfcc("gmrd", gfbz(int ), (int)1397)) break;
            v2 /* !! */  = (long)gv.gfcc("gmrj", gfbz(int ), (int)1398);
        }
        var3_5 = gv.a;
        if (var5_3) {
            throw null;
lbl21:
            // 6 sources

            return;
        }
        if (var3_5 || var3_5) ** GOTO lbl21
        if (var1_1 == null) ** GOTO lbl-1000
        if (var3_5) ** GOTO lbl21
        v3 /* !! */  = gv.nl;
        if (true) ** GOTO lbl30
        block48: while (true) {
            v3 /* !! */  = (long)(v4 - gv.gfcc("gmrk", gfdd(int ), (int)553));
lbl30:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1602728502: {
                    v4 = gv.gfcc("gmrl", gfdd(int ), (int)554);
                    continue block48;
                }
                case -126341272: {
                    v4 = gv.gfcc("gmrm", gfdd(int ), (int)555);
                    continue block48;
                }
                case 978104857: {
                    v4 = gv.gfcc("gmrn", gfdd(int ), (int)556);
                    continue block48;
                }
                case 1185080505: {
                    break block48;
                }
            }
            break;
        }
        if (var1_1.isBlank()) ** GOTO lbl-1000
        if (var3_5) ** GOTO lbl21
        v5 /* !! */  = gv.nl;
        if (true) ** GOTO lbl48
        block49: while (true) {
            v5 /* !! */  = (long)(gv.gfcc("gmrp", gfdd(int ), (int)558) - gv.gfcc("gmro", gfdd(int ), (int)557));
lbl48:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case 1185080505: {
                    break block49;
                }
                case 1965544519: {
                    continue block49;
                }
            }
            break;
        }
        if (var2_2.method_7960()) ** GOTO lbl-1000
        if (var3_5 || var3_5) ** GOTO lbl21
        v6 /* !! */  = gv.nl;
        if (true) ** GOTO lbl59
        block50: while (true) {
            v6 /* !! */  = (long)(v7 - gv.gfcc("gmrw", gfdd(int ), (int)559));
lbl59:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1858904116: {
                    v7 = gv.gfcc("gmrx", gfdd(int ), (int)560);
                    continue block50;
                }
                case -19692050: {
                    v7 = gv.gfcc("gmry", gfdd(int ), (int)561);
                    continue block50;
                }
                case 1185080505: {
                    break block50;
                }
            }
            break;
        }
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_3 = gv.nl - gv.gfcc("gmrz", gfdd(int ), (int)562)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == gv.gfcc("gmsa", gfbz(int ), (int)1399)) break;
            v8 /* !! */  = (long)gv.gfcc("gmsb", gfbz(int ), (int)1400);
        }
        v9 = (Function<String, Set>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$rememberFoundLoot$1(java.lang.String ), (Ljava/lang/String;)Ljava/util/Set;)();
        v10 /* !! */  = gv.nl;
        if (true) ** GOTO lbl78
        block52: while (true) {
            v10 /* !! */  = (long)(v11 - gv.gfcc("gmsc", gfdd(int ), (int)563));
lbl78:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -346190712: {
                    v11 = gv.gfcc("gmsg", gfdd(int ), (int)564);
                    continue block52;
                }
                case 102080927: {
                    v11 = gv.gfcc("gmsi", gfdd(int ), (int)565);
                    continue block52;
                }
                case 1185080505: {
                    break block52;
                }
                case 1714764103: {
                    v11 = gv.gfcc("gmsj", gfdd(int ), (int)566);
                    continue block52;
                }
            }
            break;
        }
        v12 /* !! */  = gv.nl;
        if (true) ** GOTO lbl94
        block53: while (true) {
            v12 /* !! */  = (long)(gv.gfcc("gmso", gfdd(int ), (int)568) - gv.gfcc("gmsm", gfdd(int ), (int)567));
lbl94:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case 503892463: {
                    continue block53;
                }
                case 1185080505: {
                    break block53;
                }
            }
            break;
        }
        v13 = var2_2.method_7964();
        v14 /* !! */  = gv.nl;
        if (true) ** GOTO lbl104
        block54: while (true) {
            v14 /* !! */  = (long)(v15 - gv.gfcc("gmsp", gfdd(int ), (int)569));
lbl104:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1939155664: {
                    v15 = gv.gfcc("gmsq", gfdd(int ), (int)570);
                    continue block54;
                }
                case -1322926144: {
                    v15 = gv.gfcc("gmsr", gfdd(int ), (int)571);
                    continue block54;
                }
                case -1002659696: {
                    v15 = gv.gfcc("gmss", gfdd(int ), (int)572);
                    continue block54;
                }
                case 1185080505: {
                    break block54;
                }
            }
            break;
        }
        v16 = v13.getString();
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_4 = gv.nl - gv.gfcc("gmst", gfdd(int ), (int)573)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == gv.gfcc("gmsu", gfbz(int ), (int)1401)) break;
            v17 /* !! */  = (long)gv.gfcc("gmsv", gfbz(int ), (int)1402);
        }
        this.foundLootByMinecart.computeIfAbsent(var1_1, v9).add(v16);
        if (var3_5) ** GOTO lbl21
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 5 sources

            {
                if (!var3_5 && !var3_5) ** break;
                ** continue;
                return;
            }
lbl130:
            // 2 sources

            case 0: {
                do {
                    var4_4 /* !! */  = (int)gv.gfcc("gmsw", gfbz(int ), (int)1403);
                } while (!var5_3);
                throw null;
            }
            case 1: {
                do {
                    var4_4 /* !! */  = (int)gv.gfcc("gmsx", gfbz(int ), (int)1404);
                } while (!var5_3);
                throw null;
            }
            case 2: {
                var4_4 /* !! */  = (int)gv.gfcc("gmsy", gfbz(int ), (int)1405);
                if (!var5_3) ** GOTO lbl130
                throw null;
            }
lbl144:
            // 2 sources

            case 3: {
                do {
                    var4_4 /* !! */  = (int)gv.gfcc("gmsz", gfbz(int ), (int)1406);
                } while (!var5_3);
                throw null;
            }
            case 4: {
                var4_4 /* !! */  = (int)gv.gfcc("gmta", gfbz(int ), (int)1407);
                if (var5_3) {
                    throw null;
                }
            }
lbl153:
            // 4 sources

            case 5: {
                var4_4 /* !! */  = (int)gv.gfcc("gmtb", gfbz(int ), (int)1408);
                if (var5_3) {
                    throw null;
                }
            }
            case 6: {
                var4_4 /* !! */  = (int)gv.gfcc("gmtc", gfbz(int ), (int)1409);
                if (!var5_3) break;
                throw null;
            }
lbl161:
            // 2 sources

            case 7: {
                var4_4 /* !! */  = (int)gv.gfcc("gmtd", gfbz(int ), (int)1410);
                if (!var5_3) ** GOTO lbl144
                throw null;
            }
            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)gv.gfcc("gmte", gfbz(int ), (int)1411);
                    if (!var5_3) ** GOTO lbl161
                    throw null;
                }
            }
            case 9: {
                var4_4 /* !! */  = (int)gv.gfcc("gmtf", gfbz(int ), (int)1412);
                if (!var5_3) ** GOTO lbl153
                throw null;
            }
            case 10: 
        }
        var4_4 /* !! */  = (int)gv.gfcc("gmtg", gfbz(int ), (int)1413);
        ** while (!var5_3)
lbl177:
        // 1 sources

        throw null;
    }

    /*
     * Exception decompiling
     */
    private void stopBaritone() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 12[SWITCH]
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
    private int countEmptyInventorySlots() {
        block76: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = gv.nl - gv.gfcc("glfe", gfdd(int ), (int)529)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == gv.gfcc("glff", gfbz(int ), (int)1320)) break;
                v0 /* !! */  = (long)gv.gfcc("glfg", gfbz(int ), (int)1321);
            }
            var6_1 = gv.c;
            v1 /* !! */  = gv.nl;
            if (true) ** GOTO lbl11
            block45: while (true) {
                v1 /* !! */  = (long)(v2 - gv.gfcc("glfn", gfdd(int ), (int)530));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1285230915: {
                        v2 = gv.gfcc("glfp", gfdd(int ), (int)531);
                        continue block45;
                    }
                    case 1140512105: {
                        v2 = gv.gfcc("glfq", gfdd(int ), (int)532);
                        continue block45;
                    }
                    case 1185080505: {
                        break block45;
                    }
                    case 1377238738: {
                        v2 = gv.gfcc("glfr", gfdd(int ), (int)533);
                        continue block45;
                    }
                }
                break;
            }
            var5_2 /* !! */  = gv.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = gv.nl - gv.gfcc("glfs", gfdd(int ), (int)534)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == gv.gfcc("glft", gfbz(int ), (int)1322)) break;
                v3 /* !! */  = (long)gv.gfcc("glfu", gfbz(int ), (int)1323);
            }
            var4_3 = gv.a;
            if (var6_1) {
                throw null;
lbl32:
                // 11 sources

                return (int)gv.gfcc("glfy", gfbz(int ), (int)1324);
            }
            if (var4_3 || var4_3) ** GOTO lbl32
            var1_4 = gv.gfcc("glfz", gfbz(int ), (int)1325);
            if (var4_3 || var4_3) ** GOTO lbl32
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = gv.nl - gv.gfcc("glga", gfdd(int ), (int)535)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == gv.gfcc("glgb", gfbz(int ), (int)1326)) break;
                v4 /* !! */  = (long)gv.gfcc("glgc", gfbz(int ), (int)1327);
            }
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_3 = gv.nl - gv.gfcc("glgd", gfdd(int ), (int)536)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == gv.gfcc("glge", gfbz(int ), (int)1328)) break;
                v5 /* !! */  = (long)gv.gfcc("glgf", gfbz(int ), (int)1329);
            }
            v6 = gv.mc.field_1724;
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_4 = gv.nl - gv.gfcc("glgg", gfdd(int ), (int)537)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v7 /* !! */  == gv.gfcc("glgh", gfbz(int ), (int)1330)) break;
                v7 /* !! */  = (long)gv.gfcc("glgi", gfbz(int ), (int)1331);
            }
            v8 = v6.method_31548();
            v9 /* !! */  = gv.nl;
            if (true) ** GOTO lbl58
            block51: while (true) {
                v9 /* !! */  = (long)(v10 - gv.gfcc("glgj", gfdd(int ), (int)538));
lbl58:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -1835899117: {
                        v10 = gv.gfcc("glgk", gfdd(int ), (int)539);
                        continue block51;
                    }
                    case 651298926: {
                        v10 = gv.gfcc("glgl", gfdd(int ), (int)540);
                        continue block51;
                    }
                    case 1185080505: {
                        break block51;
                    }
                    case 2017850977: {
                        v10 = gv.gfcc("glgm", gfdd(int ), (int)541);
                        continue block51;
                    }
                }
                break;
            }
            v11 = v8.method_67533();
            v12 /* !! */  = gv.nl;
            if (true) ** GOTO lbl75
            block52: while (true) {
                v12 /* !! */  = (long)(v13 - gv.gfcc("glgn", gfdd(int ), (int)542));
lbl75:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case -1011835614: {
                        v13 = gv.gfcc("glgo", gfdd(int ), (int)543);
                        continue block52;
                    }
                    case 1185080505: {
                        break block52;
                    }
                    case 2041644606: {
                        v13 = gv.gfcc("glgp", gfdd(int ), (int)544);
                        continue block52;
                    }
                }
                break;
            }
            var2_5 = v11.iterator();
            if (var4_3) ** GOTO lbl32
            do {
                block77: {
                    if (var4_3 || var4_3) ** GOTO lbl32
                    while (true) {
                        if ((v14 /* !! */  = (cfr_temp_5 = gv.nl - gv.gfcc("glgq", gfdd(int ), (int)545)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v14 /* !! */  == gv.gfcc("glgr", gfbz(int ), (int)1332)) break;
                        v14 /* !! */  = (long)gv.gfcc("glgs", gfbz(int ), (int)1333);
                    }
                    if (!var2_5.hasNext()) break block76;
                    if (var4_3) ** GOTO lbl32
                    v15 /* !! */  = gv.nl;
                    if (true) ** GOTO lbl99
                    block55: while (true) {
                        v15 /* !! */  = (long)(v16 - gv.gfcc("glgt", gfdd(int ), (int)546));
lbl99:
                        // 2 sources

                        switch ((int)v15 /* !! */ ) {
                            case 82766090: {
                                v16 = gv.gfcc("glgu", gfdd(int ), (int)547);
                                continue block55;
                            }
                            case 1185080505: {
                                break block55;
                            }
                            case 1198061169: {
                                v16 = gv.gfcc("glgv", gfdd(int ), (int)548);
                                continue block55;
                            }
                        }
                        break;
                    }
                    var3_6 = (class_1799)var2_5.next();
                    if (var4_3 || var4_3) ** GOTO lbl32
                    while (true) {
                        if ((v17 /* !! */  = (cfr_temp_6 = gv.nl - gv.gfcc("glgw", gfdd(int ), (int)549)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v17 /* !! */  == gv.gfcc("glgx", gfbz(int ), (int)1334)) break;
                        v17 /* !! */  = (long)gv.gfcc("glgy", gfbz(int ), (int)1335);
                    }
                    if (!var3_6.method_7960()) break block77;
                    if (var4_3 || var4_3) ** GOTO lbl32
                    ++var1_4;
                    if (var4_3) ** GOTO lbl32
                }
                if (var4_3 || var4_3) ** GOTO lbl32
            } while (!var6_1);
            throw null;
        }
        if (var4_3) ** GOTO lbl32
        if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var4_3) ** break;
                ** continue;
                return (int)var1_4;
            }
lbl131:
            // 2 sources

            case 0: {
                var5_2 /* !! */  = (int)gv.gfcc("glgz", gfbz(int ), (int)1336);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl185
            }
lbl136:
            // 2 sources

            case 1: {
                var5_2 /* !! */  = (int)gv.gfcc("glha", gfbz(int ), (int)1337);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl141:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_2 /* !! */  = (int)gv.gfcc("glhb", gfbz(int ), (int)1338);
                    if (!var6_1) ** GOTO lbl136
                    throw null;
                }
            }
lbl146:
            // 3 sources

            case 3: {
                var5_2 /* !! */  = (int)gv.gfcc("glhc", gfbz(int ), (int)1339);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl177
            }
            case 4: {
                var5_2 /* !! */  = (int)gv.gfcc("glhd", gfbz(int ), (int)1340);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl173
            }
            case 5: {
                var5_2 /* !! */  = (int)gv.gfcc("glhe", gfbz(int ), (int)1341);
                if (!var6_1) break;
                throw null;
            }
            case 6: {
                var5_2 /* !! */  = (int)gv.gfcc("glhg", gfbz(int ), (int)1342);
                if (var6_1) {
                    throw null;
                }
            }
lbl164:
            // 4 sources

            case 7: {
                var5_2 /* !! */  = (int)gv.gfcc("glhk", gfbz(int ), (int)1343);
                if (!var6_1) ** GOTO lbl146
                throw null;
            }
            case 8: {
                var5_2 /* !! */  = (int)gv.gfcc("glhl", gfbz(int ), (int)1344);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl185
            }
lbl173:
            // 2 sources

            case 9: {
                var5_2 /* !! */  = (int)gv.gfcc("glhn", gfbz(int ), (int)1345);
                if (!var6_1) ** GOTO lbl131
                throw null;
            }
lbl177:
            // 3 sources

            case 10: {
                var5_2 /* !! */  = (int)gv.gfcc("glhp", gfbz(int ), (int)1346);
                if (!var6_1) ** GOTO lbl164
                throw null;
            }
            case 11: {
                var5_2 /* !! */  = (int)gv.gfcc("glhs", gfbz(int ), (int)1347);
                if (!var6_1) ** GOTO lbl141
                throw null;
            }
lbl185:
            // 3 sources

            case 12: {
                var5_2 /* !! */  = (int)gv.gfcc("glhu", gfbz(int ), (int)1348);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl212
            }
            case 13: {
                var5_2 /* !! */  = (int)gv.gfcc("glhx", gfbz(int ), (int)1349);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl204
            }
            case 14: {
                var5_2 /* !! */  = (int)gv.gfcc("glia", gfbz(int ), (int)1350);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl200:
            // 2 sources

            case 15: {
                var5_2 /* !! */  = (int)gv.gfcc("glic", gfbz(int ), (int)1351);
                if (!var6_1) ** GOTO lbl177
                throw null;
            }
lbl204:
            // 4 sources

            case 16: {
                var5_2 /* !! */  = (int)gv.gfcc("glid", gfbz(int ), (int)1352);
                if (!var6_1) ** GOTO lbl200
                throw null;
            }
            case 17: {
                var5_2 /* !! */  = (int)gv.gfcc("glie", gfbz(int ), (int)1353);
                if (!var6_1) ** GOTO lbl204
                throw null;
            }
lbl212:
            // 3 sources

            case 18: {
                var5_2 /* !! */  = (int)gv.gfcc("glig", gfbz(int ), (int)1354);
                if (!var6_1) ** GOTO lbl204
                throw null;
            }
            case 19: 
        }
        var5_2 /* !! */  = (int)gv.gfcc("glih", gfbz(int ), (int)1355);
        ** while (!var6_1)
lbl219:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        block101: {
            block100: {
                block99: {
                    block98: {
                        var6_2 = gv.c;
                        var5_3 /* !! */  = gv.b;
                        var4_4 = gv.a;
                        if (var6_2) {
                            throw null;
lbl6:
                            // 29 sources

                            return;
                        }
                        if (var4_4 || var4_4) ** GOTO lbl6
                        if (gv.mc.field_1724 == null) break block98;
                        if (var4_4) ** GOTO lbl6
                        if (gv.mc.field_1687 == null) break block98;
                        if (var4_4) ** GOTO lbl6
                        if (gv.mc.method_1562() == null) break block98;
                        if (var4_4) ** GOTO lbl6
                        if (gv.mc.field_1761 != null) break block99;
                        if (var4_4) ** GOTO lbl6
                    }
                    if (var4_4 || var4_4) ** GOTO lbl6
                    return;
                }
                if (var4_4 || var4_4) ** GOTO lbl6
                if (this.handleAutoLeave()) break block100;
                if (var4_4) ** GOTO lbl6
                if (!this.handleAutoHeal()) break block101;
                if (var4_4) ** GOTO lbl6
            }
            if (var4_4 || var4_4) ** GOTO lbl6
            return;
        }
        if (var4_4 || var4_4) ** GOTO lbl6
        this.handleAutoFix();
        if (var4_4 || var4_4) ** GOTO lbl6
        var2_5 = gv.mc.field_1724.field_7512;
        if (var4_4) ** GOTO lbl6
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4) ** GOTO lbl6
                if (!(var2_5 instanceof class_1707)) ** GOTO lbl55
                if (var4_4) ** GOTO lbl6
                var3_6 = (class_1707)var2_5;
                if (var4_4 || var4_4) ** GOTO lbl6
                if (!this.depositingToEnderChest) ** GOTO lbl50
                if (var4_4 || var4_4) ** GOTO lbl6
                this.handleEnderChestDeposit(var3_6);
                if (var4_4) ** GOTO lbl6
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl53
lbl50:
                // 1 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                this.handleMinecartLoot(var3_6);
                if (var4_4) ** GOTO lbl6
lbl53:
                // 2 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                return;
lbl55:
                // 1 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                if (!this.autoInvest.isValue()) ** GOTO lbl65
                if (var4_4) ** GOTO lbl6
                if (!this.needsInvest) ** GOTO lbl65
                if (var4_4) ** GOTO lbl6
                if (!this.hasWantedLootInInventory()) ** GOTO lbl65
                if (var4_4 || var4_4) ** GOTO lbl6
                this.handleInvestPathing();
                if (var4_4 || var4_4) ** GOTO lbl6
                return;
lbl65:
                // 3 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                this.depositingToEnderChest = gv.gfcc("gffg", gfbz(int ), (int)59);
                if (var4_4 || var4_4) ** GOTO lbl6
                this.handleMinecartSearch();
                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
            }
lbl72:
            // 3 sources

            case 0: {
                var5_3 /* !! */  = (int)gv.gfcc("gffh", gfbz(int ), (int)60);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl184
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)gv.gfcc("gffi", gfbz(int ), (int)61);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl210
                    break;
                }
            }
            case 2: {
                var5_3 /* !! */  = (int)gv.gfcc("gffj", gfbz(int ), (int)62);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl275
            }
lbl88:
            // 2 sources

            case 3: {
                var5_3 /* !! */  = (int)gv.gfcc("gffk", gfbz(int ), (int)63);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl98
            }
lbl93:
            // 4 sources

            case 4: {
                var5_3 /* !! */  = (int)gv.gfcc("gffl", gfbz(int ), (int)64);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl230
            }
lbl98:
            // 4 sources

            case 5: {
                var5_3 /* !! */  = (int)gv.gfcc("gffm", gfbz(int ), (int)65);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl287
            }
            case 6: {
                var5_3 /* !! */  = (int)gv.gfcc("gffn", gfbz(int ), (int)66);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl243
            }
lbl108:
            // 2 sources

            case 7: {
                var5_3 /* !! */  = (int)gv.gfcc("gffo", gfbz(int ), (int)67);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl267
            }
            case 8: {
                var5_3 /* !! */  = (int)gv.gfcc("gffp", gfbz(int ), (int)68);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl141
            }
            case 9: {
                var5_3 /* !! */  = (int)gv.gfcc("gffq", gfbz(int ), (int)69);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl132
            }
            case 10: {
                var5_3 /* !! */  = (int)gv.gfcc("gffr", gfbz(int ), (int)70);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl283
            }
lbl128:
            // 2 sources

            case 11: {
                var5_3 /* !! */  = (int)gv.gfcc("gffs", gfbz(int ), (int)71);
                if (!var6_2) ** GOTO lbl98
                throw null;
            }
lbl132:
            // 3 sources

            case 12: {
                var5_3 /* !! */  = (int)gv.gfcc("gfft", gfbz(int ), (int)72);
                if (!var6_2) ** GOTO lbl72
                throw null;
            }
            case 13: {
                var5_3 /* !! */  = (int)gv.gfcc("gffu", gfbz(int ), (int)73);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl259
            }
lbl141:
            // 3 sources

            case 14: {
                var5_3 /* !! */  = (int)gv.gfcc("gffv", gfbz(int ), (int)74);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl196
            }
            case 15: {
                var5_3 /* !! */  = (int)gv.gfcc("gffw", gfbz(int ), (int)75);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl275
            }
            case 16: {
                var5_3 /* !! */  = (int)gv.gfcc("gffx", gfbz(int ), (int)76);
                if (var6_2) {
                    throw null;
                }
            }
lbl155:
            // 4 sources

            case 17: {
                var5_3 /* !! */  = (int)gv.gfcc("gffy", gfbz(int ), (int)77);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl283
            }
lbl160:
            // 2 sources

            case 18: {
                var5_3 /* !! */  = (int)gv.gfcc("gffz", gfbz(int ), (int)78);
                if (!var6_2) ** GOTO lbl155
                throw null;
            }
lbl164:
            // 3 sources

            case 19: {
                var5_3 /* !! */  = (int)gv.gfcc("gfga", gfbz(int ), (int)79);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl184
            }
lbl169:
            // 2 sources

            case 20: {
                var5_3 /* !! */  = (int)gv.gfcc("gfgb", gfbz(int ), (int)80);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl206
            }
lbl174:
            // 3 sources

            case 21: {
                var5_3 /* !! */  = (int)gv.gfcc("gfgc", gfbz(int ), (int)81);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl184
            }
            case 22: {
                var5_3 /* !! */  = (int)gv.gfcc("gfgd", gfbz(int ), (int)82);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl196
            }
lbl184:
            // 6 sources

            case 23: {
                var5_3 /* !! */  = (int)gv.gfcc("gfge", gfbz(int ), (int)83);
                if (!var6_2) ** GOTO lbl174
                throw null;
            }
            case 24: {
                var5_3 /* !! */  = (int)gv.gfcc("gfgf", gfbz(int ), (int)84);
                if (!var6_2) ** GOTO lbl93
                throw null;
            }
            case 25: {
                var5_3 /* !! */  = (int)gv.gfcc("gfgg", gfbz(int ), (int)85);
                if (!var6_2) ** GOTO lbl184
                throw null;
            }
lbl196:
            // 4 sources

            case 26: {
                var5_3 /* !! */  = (int)gv.gfcc("gfgh", gfbz(int ), (int)86);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl279
            }
            case 27: {
                var5_3 /* !! */  = (int)gv.gfcc("gfgi", gfbz(int ), (int)87);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl247
            }
lbl206:
            // 3 sources

            case 28: {
                var5_3 /* !! */  = (int)gv.gfcc("gfgj", gfbz(int ), (int)88);
                if (!var6_2) ** GOTO lbl98
                throw null;
            }
lbl210:
            // 2 sources

            case 29: {
                var5_3 /* !! */  = (int)gv.gfcc("gfgk", gfbz(int ), (int)89);
                if (!var6_2) ** GOTO lbl132
                throw null;
            }
lbl214:
            // 2 sources

            case 30: {
                var5_3 /* !! */  = (int)gv.gfcc("gfgl", gfbz(int ), (int)90);
                if (!var6_2) ** GOTO lbl88
                throw null;
            }
            case 31: {
                var5_3 /* !! */  = (int)gv.gfcc("gfgm", gfbz(int ), (int)91);
                if (!var6_2) ** GOTO lbl164
                throw null;
            }
lbl222:
            // 2 sources

            case 32: {
                var5_3 /* !! */  = (int)gv.gfcc("gfgn", gfbz(int ), (int)92);
                if (!var6_2) ** GOTO lbl93
                throw null;
            }
            case 33: {
                var5_3 /* !! */  = (int)gv.gfcc("gfgo", gfbz(int ), (int)93);
                if (!var6_2) ** GOTO lbl93
                throw null;
            }
lbl230:
            // 2 sources

            case 34: {
                var5_3 /* !! */  = (int)gv.gfcc("gfgp", gfbz(int ), (int)94);
                if (!var6_2) ** GOTO lbl169
                throw null;
            }
            case 35: {
                var5_3 /* !! */  = (int)gv.gfcc("gfgq", gfbz(int ), (int)95);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl275
            }
            case 36: {
                var5_3 /* !! */  = (int)gv.gfcc("gfgr", gfbz(int ), (int)96);
                if (!var6_2) ** GOTO lbl141
                throw null;
            }
lbl243:
            // 2 sources

            case 37: {
                var5_3 /* !! */  = (int)gv.gfcc("gfgs", gfbz(int ), (int)97);
                if (!var6_2) ** GOTO lbl72
                throw null;
            }
lbl247:
            // 2 sources

            case 38: {
                var5_3 /* !! */  = (int)gv.gfcc("gfgt", gfbz(int ), (int)98);
                if (!var6_2) ** GOTO lbl160
                throw null;
            }
            case 39: {
                var5_3 /* !! */  = (int)gv.gfcc("gfgu", gfbz(int ), (int)99);
                if (!var6_2) ** GOTO lbl164
                throw null;
            }
lbl255:
            // 2 sources

            case 40: {
                var5_3 /* !! */  = (int)gv.gfcc("gfgv", gfbz(int ), (int)100);
                if (!var6_2) ** GOTO lbl128
                throw null;
            }
lbl259:
            // 2 sources

            case 41: {
                var5_3 /* !! */  = (int)gv.gfcc("gfgw", gfbz(int ), (int)101);
                if (!var6_2) ** GOTO lbl174
                throw null;
            }
            case 42: {
                var5_3 /* !! */  = (int)gv.gfcc("gfgx", gfbz(int ), (int)102);
                if (!var6_2) ** GOTO lbl214
                throw null;
            }
lbl267:
            // 2 sources

            case 43: {
                var5_3 /* !! */  = (int)gv.gfcc("gfgy", gfbz(int ), (int)103);
                if (!var6_2) ** GOTO lbl222
                throw null;
            }
            case 44: {
                var5_3 /* !! */  = (int)gv.gfcc("gfgz", gfbz(int ), (int)104);
                if (!var6_2) ** GOTO lbl184
                throw null;
            }
lbl275:
            // 4 sources

            case 45: {
                var5_3 /* !! */  = (int)gv.gfcc("gfha", gfbz(int ), (int)105);
                if (!var6_2) ** GOTO lbl108
                throw null;
            }
lbl279:
            // 2 sources

            case 46: {
                var5_3 /* !! */  = (int)gv.gfcc("gfhb", gfbz(int ), (int)106);
                if (!var6_2) ** GOTO lbl255
                throw null;
            }
lbl283:
            // 3 sources

            case 47: {
                var5_3 /* !! */  = (int)gv.gfcc("gfhc", gfbz(int ), (int)107);
                if (!var6_2) ** GOTO lbl196
                throw null;
            }
lbl287:
            // 2 sources

            case 48: {
                var5_3 /* !! */  = (int)gv.gfcc("gfhd", gfbz(int ), (int)108);
                if (!var6_2) ** GOTO lbl206
                throw null;
            }
            case 49: 
        }
        var5_3 /* !! */  = (int)gv.gfcc("gfhe", gfbz(int ), (int)109);
        ** while (!var6_2)
lbl294:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gqjn() {
        gv.gfcb[1600] = 1789145835;
        gv.gfcb[1601] = 1915791605;
        gv.gfcb[1602] = -1380417054;
        gv.gfcb[1603] = -2075296352;
        gv.gfcb[1604] = 1583198983;
        gv.gfcb[1605] = 1614067751;
        gv.gfcb[1606] = -1429730765;
        gv.gfcb[1607] = 934021678;
        gv.gfcb[1608] = -916097054;
        gv.gfcb[1609] = 270126134;
        gv.gfcb[1610] = -157643619;
        gv.gfcb[1611] = 63742347;
        gv.gfcb[1612] = -544777062;
        gv.gfcb[1613] = 931572996;
        gv.gfcb[1614] = -1477263807;
        gv.gfcb[1615] = 727209677;
        gv.gfcb[1616] = 1145877395;
        gv.gfcb[1617] = 100747048;
        gv.gfcb[1618] = -177883497;
        gv.gfcb[1619] = 942009234;
        gv.gfcb[1620] = 735239708;
        gv.gfcb[1621] = -972491329;
        gv.gfcb[1622] = 833930890;
        gv.gfcb[1623] = 1336023822;
        gv.gfcb[1624] = -103935892;
        gv.gfcb[1625] = -1536805994;
        gv.gfcb[1626] = 181751268;
        gv.gfcb[1627] = 51914154;
        gv.gfcb[1628] = -180846110;
        gv.gfcb[1629] = 1644540497;
        gv.gfcb[1630] = 584251655;
        gv.gfcb[1631] = 613304711;
        gv.gfcb[1632] = 1958139416;
        gv.gfcb[1633] = -1592563040;
        gv.gfcb[1634] = 969342126;
        gv.gfcb[1635] = 250593593;
        gv.gfcb[1636] = -1983956501;
        gv.gfcb[1637] = 1241484957;
        gv.gfcb[1638] = 339731856;
        gv.gfcb[1639] = 681422295;
        gv.gfcb[1640] = -1554382804;
        gv.gfcb[1641] = 974257601;
        gv.gfcb[1642] = -2068060545;
        gv.gfcb[1643] = -1817177249;
        gv.gfcb[1644] = -1228216917;
        gv.gfcb[1645] = -359091759;
        gv.gfcb[1646] = -1203420027;
        gv.gfcb[1647] = -1383412186;
        gv.gfcb[1648] = 1538945774;
        gv.gfcb[1649] = -633617968;
        gv.gfcb[1650] = -1155364547;
        gv.gfcb[1651] = 533679750;
        gv.gfcb[1652] = 488957253;
        gv.gfcb[1653] = 337925163;
        gv.gfcb[1654] = 0x7AACAAA7;
        gv.gfcb[1655] = 1899107870;
        gv.gfcb[1656] = 28354909;
        gv.gfcb[1657] = -106218267;
        gv.gfcb[1658] = -579966038;
        gv.gfcb[1659] = -797588972;
        gv.gfcb[1660] = -221629232;
        gv.gfcb[1661] = 998111183;
        gv.gfcb[1662] = -794977226;
        gv.gfcb[1663] = 433828461;
        gv.gfcb[1664] = 1566620910;
        gv.gfcb[1665] = 1255969271;
        gv.gfcb[1666] = -299518035;
        gv.gfcb[1667] = -802729314;
        gv.gfcb[1668] = 1810961855;
        gv.gfcb[1669] = -465029539;
        gv.gfcb[1670] = 693339518;
        gv.gfcb[1671] = 590665570;
        gv.gfcb[1672] = 447806792;
        gv.gfcb[1673] = -431926804;
        gv.gfcb[1674] = -821583853;
        gv.gfcb[1675] = 2094892493;
        gv.gfcb[1676] = 722294541;
        gv.gfcb[1677] = -1120959832;
        gv.gfcb[1678] = 1951401453;
        gv.gfcb[1679] = -2088297823;
        gv.gfcb[1680] = -1130880950;
        gv.gfcb[1681] = 23820424;
        gv.gfcb[1682] = 0x45255425;
        gv.gfcb[1683] = 713844200;
        gv.gfcb[1684] = 238146538;
        gv.gfcb[1685] = 976732693;
        gv.gfcb[1686] = 1764190275;
        gv.gfcb[1687] = -2111733723;
        gv.gfcb[1688] = -1741411783;
        gv.gfcb[1689] = 779738245;
        gv.gfcb[1690] = -1831776781;
        gv.gfcb[1691] = -1500373684;
        gv.gfcb[1692] = 1382009190;
        gv.gfcb[1693] = -609094137;
        gv.gfcb[1694] = 1383975860;
        gv.gfcb[1695] = 1120706353;
        gv.gfcb[1696] = 1638481610;
        gv.gfcb[1697] = -1404247819;
        gv.gfcb[1698] = -1340616064;
        gv.gfcb[1699] = -1442968360;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean hasWantedLootInInventory() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gv.nl - gv.gfcc("gkii", gfdd(int ), (int)441)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == gv.gfcc("gkij", gfbz(int ), (int)1142)) break;
            v0 /* !! */  = (long)gv.gfcc("gkik", gfbz(int ), (int)1143);
        }
        var5_1 = gv.c;
        v1 /* !! */  = gv.nl;
        if (true) ** GOTO lbl11
        block55: while (true) {
            v1 /* !! */  = (long)(gv.gfcc("gkio", gfdd(int ), (int)443) - gv.gfcc("gkil", gfdd(int ), (int)442));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -405916639: {
                    continue block55;
                }
                case 1185080505: {
                    break block55;
                }
            }
            break;
        }
        var4_2 /* !! */  = gv.b;
        v2 /* !! */  = gv.nl;
        if (true) ** GOTO lbl21
        block56: while (true) {
            v2 /* !! */  = (long)(v3 - gv.gfcc("gkis", gfdd(int ), (int)444));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1741962544: {
                    v3 = gv.gfcc("gkit", gfdd(int ), (int)445);
                    continue block56;
                }
                case -1292731205: {
                    v3 = gv.gfcc("gkiy", gfdd(int ), (int)446);
                    continue block56;
                }
                case 1185080505: {
                    break block56;
                }
            }
            break;
        }
        var3_3 = gv.a;
        if (var5_1) {
            throw null;
lbl33:
            // 8 sources

            return (boolean)gv.gfcc("gkjc", gfbz(int ), (int)1144);
        }
        if (var3_3 || var3_3) ** GOTO lbl33
        v4 /* !! */  = gv.nl;
        if (true) ** GOTO lbl40
        block58: while (true) {
            v4 /* !! */  = (long)(v5 - gv.gfcc("gkjd", gfdd(int ), (int)447));
lbl40:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1313073190: {
                    v5 = gv.gfcc("gkje", gfdd(int ), (int)448);
                    continue block58;
                }
                case -12351062: {
                    v5 = gv.gfcc("gkjf", gfdd(int ), (int)449);
                    continue block58;
                }
                case 1185080505: {
                    break block58;
                }
            }
            break;
        }
        v6 /* !! */  = gv.nl;
        if (true) ** GOTO lbl53
        block59: while (true) {
            v6 /* !! */  = (long)(v7 - gv.gfcc("gkjg", gfdd(int ), (int)450));
lbl53:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case 837298122: {
                    v7 = gv.gfcc("gkjh", gfdd(int ), (int)451);
                    continue block59;
                }
                case 1185080505: {
                    break block59;
                }
                case 1277173828: {
                    v7 = gv.gfcc("gkjp", gfdd(int ), (int)452);
                    continue block59;
                }
                case 1455910103: {
                    v7 = gv.gfcc("gkjq", gfdd(int ), (int)453);
                    continue block59;
                }
            }
            break;
        }
        v8 = gv.mc.field_1724;
        v9 /* !! */  = gv.nl;
        if (true) ** GOTO lbl70
        block60: while (true) {
            v9 /* !! */  = (long)(v10 - gv.gfcc("gkjr", gfdd(int ), (int)454));
lbl70:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -1373792612: {
                    v10 = gv.gfcc("gkjs", gfdd(int ), (int)455);
                    continue block60;
                }
                case -170208730: {
                    v10 = gv.gfcc("gkju", gfdd(int ), (int)456);
                    continue block60;
                }
                case -68365267: {
                    v10 = gv.gfcc("gkjv", gfdd(int ), (int)457);
                    continue block60;
                }
                case 1185080505: {
                    break block60;
                }
            }
            break;
        }
        v11 = v8.method_31548();
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_1 = gv.nl - gv.gfcc("gkka", gfdd(int ), (int)458)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == gv.gfcc("gkkb", gfbz(int ), (int)1145)) break;
            v12 /* !! */  = (long)gv.gfcc("gkkd", gfbz(int ), (int)1146);
        }
        v13 = v11.method_67533();
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_2 = gv.nl - gv.gfcc("gkkf", gfdd(int ), (int)459)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == gv.gfcc("gkkg", gfbz(int ), (int)1147)) break;
            v14 /* !! */  = (long)gv.gfcc("gkki", gfbz(int ), (int)1148);
        }
        var1_4 = v13.iterator();
        if (var3_3) ** GOTO lbl33
        block63: while (true) {
            if (var3_3 || var3_3) ** GOTO lbl33
            v15 /* !! */  = gv.nl;
            if (true) ** GOTO lbl102
            block64: while (true) {
                v15 /* !! */  = (long)(v16 - gv.gfcc("gkkm", gfdd(int ), (int)460));
lbl102:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case -2014866273: {
                        v16 = gv.gfcc("gkku", gfdd(int ), (int)461);
                        continue block64;
                    }
                    case 1056461096: {
                        v16 = gv.gfcc("gkkv", gfdd(int ), (int)462);
                        continue block64;
                    }
                    case 1185080505: {
                        break block64;
                    }
                }
                break;
            }
            if (!var1_4.hasNext()) ** GOTO lbl138
            if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var4_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var3_3) ** GOTO lbl33
                    while (true) {
                        if ((v17 /* !! */  = (cfr_temp_3 = gv.nl - gv.gfcc("gkkz", gfdd(int ), (int)463)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v17 /* !! */  == gv.gfcc("gklc", gfbz(int ), (int)1149)) break;
                        v17 /* !! */  = (long)gv.gfcc("gkle", gfbz(int ), (int)1150);
                    }
                    var2_5 = (class_1799)var1_4.next();
                    if (var3_3 || var3_3) ** GOTO lbl33
                    v18 /* !! */  = gv.nl;
                    if (true) ** GOTO lbl127
                    block66: while (true) {
                        v18 /* !! */  = (long)(gv.gfcc("gklh", gfdd(int ), (int)465) - gv.gfcc("gklg", gfdd(int ), (int)464));
lbl127:
                        // 2 sources

                        switch ((int)v18 /* !! */ ) {
                            case 653422323: {
                                continue block66;
                            }
                            case 1185080505: {
                                break block66;
                            }
                        }
                        break;
                    }
                    if (!this.isWantedLoot(var2_5)) ** GOTO lbl135
                    if (var3_3 || var3_3) ** GOTO lbl33
                    return (boolean)gv.gfcc("gklp", gfbz(int ), (int)1151);
lbl135:
                    // 1 sources

                    if (var3_3 || var3_3) ** GOTO lbl33
                    if (!var5_1) continue block63;
                    throw null;
                }
lbl138:
                // 1 sources

                if (!var3_3 && !var3_3) ** break;
                ** continue;
                return (boolean)gv.gfcc("gklr", gfbz(int ), (int)1152);
lbl141:
                // 2 sources

                case 0: {
                    do {
                        var4_2 /* !! */  = (int)gv.gfcc("gklw", gfbz(int ), (int)1153);
                    } while (!var5_1);
                    throw null;
                }
                case 1: {
                    var4_2 /* !! */  = (int)gv.gfcc("gklz", gfbz(int ), (int)1154);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl204
                }
lbl151:
                // 3 sources

                case 2: {
                    var4_2 /* !! */  = (int)gv.gfcc("gkma", gfbz(int ), (int)1155);
                    if (!var5_1) break block63;
                    throw null;
                }
                case 3: {
                    var4_2 /* !! */  = (int)gv.gfcc("gkmb", gfbz(int ), (int)1156);
                    if (!var5_1) break block63;
                    throw null;
                }
lbl159:
                // 2 sources

                case 4: {
                    var4_2 /* !! */  = (int)gv.gfcc("gkmd", gfbz(int ), (int)1157);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl204
                }
                case 5: {
                    var4_2 /* !! */  = (int)gv.gfcc("gkmm", gfbz(int ), (int)1158);
                    if (!var5_1) break block63;
                    throw null;
                }
                case 6: {
                    var4_2 /* !! */  = (int)gv.gfcc("gkmp", gfbz(int ), (int)1159);
                    if (!var5_1) ** GOTO lbl159
                    throw null;
                }
                case 7: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var4_2 /* !! */  = (int)gv.gfcc("gkms", gfbz(int ), (int)1160);
                        if (var5_1) {
                            throw null;
                        }
                        ** GOTO lbl187
                        break;
                    }
                }
                case 8: {
                    var4_2 /* !! */  = (int)gv.gfcc("gkmu", gfbz(int ), (int)1161);
                    if (!var5_1) ** GOTO lbl151
                    throw null;
                }
lbl182:
                // 3 sources

                case 9: {
                    do {
                        var4_2 /* !! */  = (int)gv.gfcc("gkmv", gfbz(int ), (int)1162);
                    } while (!var5_1);
                    throw null;
                }
lbl187:
                // 3 sources

                case 10: {
                    var4_2 /* !! */  = (int)gv.gfcc("gkmw", gfbz(int ), (int)1163);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl196
                }
                case 11: {
                    var4_2 /* !! */  = (int)gv.gfcc("gkmz", gfbz(int ), (int)1164);
                    if (!var5_1) ** GOTO lbl182
                    throw null;
                }
lbl196:
                // 2 sources

                case 12: {
                    var4_2 /* !! */  = (int)gv.gfcc("gkng", gfbz(int ), (int)1165);
                    if (!var5_1) ** GOTO lbl151
                    throw null;
                }
                case 13: {
                    var4_2 /* !! */  = (int)gv.gfcc("gknj", gfbz(int ), (int)1166);
                    if (!var5_1) ** GOTO lbl187
                    throw null;
                }
lbl204:
                // 3 sources

                case 14: {
                    var4_2 /* !! */  = (int)gv.gfcc("gknm", gfbz(int ), (int)1167);
                    if (!var5_1) ** GOTO lbl141
                    throw null;
                }
                case 15: {
                    var4_2 /* !! */  = (int)gv.gfcc("gknn", gfbz(int ), (int)1168);
                    if (!var5_1) ** GOTO lbl182
                    throw null;
                }
                case 16: 
            }
            break;
        }
        var4_2 /* !! */  = (int)gv.gfcc("gkno", gfbz(int ), (int)1169);
        ** while (!var5_1)
lbl215:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void handleMinecartSearch() {
        block101: {
            block100: {
                var3_1 = gv.c;
                var2_2 /* !! */  = gv.b;
                var1_3 = gv.a;
                if (var3_1) {
                    throw null;
lbl6:
                    // 27 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl6
                if (this.targetMinecart == null) break block100;
                if (var1_3) ** GOTO lbl6
                if (this.isValidMinecart(this.targetMinecart)) break block100;
                if (var1_3 || var1_3) ** GOTO lbl6
                this.targetMinecart = null;
                if (var1_3 || var1_3) ** GOTO lbl6
                this.currentPathKey = null;
                if (var1_3) ** GOTO lbl6
            }
            if (var1_3 || var1_3) ** GOTO lbl6
            if (this.targetMinecart != null) break block101;
            if (var1_3) ** GOTO lbl6
            if (!this.shouldScanMinecarts()) break block101;
            if (var1_3 || var1_3) ** GOTO lbl6
            this.targetMinecart = this.findNearestMinecart();
            if (var1_3 || var1_3) ** GOTO lbl6
            this.updateMinecartScanCheckpoint();
            if (var1_3 || var1_3) ** GOTO lbl6
            if (this.targetMinecart == null) break block101;
            if (var1_3 || var1_3) ** GOTO lbl6
            this.currentPathKey = null;
            if (var1_3 || var1_3) ** GOTO lbl6
            this.exploreTarget = null;
            if (var1_3) ** GOTO lbl6
        }
        if (var1_3 || var1_3) ** GOTO lbl6
        if (this.targetMinecart != null) ** GOTO lbl44
        if (var1_3) ** GOTO lbl6
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl6
                this.handleDistantCaveSearch();
                if (var1_3 || var1_3) ** GOTO lbl6
                return;
            }
lbl44:
            // 1 sources

            if (var1_3 || var1_3) ** GOTO lbl6
            this.exploreTarget = null;
            if (var1_3 || var1_3) ** GOTO lbl6
            if (!((double)gv.mc.field_1724.method_5739((class_1297)this.targetMinecart) <= gv.gfcc("gfya", gfjl(int ), (int)150))) ** GOTO lbl60
            if (var1_3 || var1_3) ** GOTO lbl6
            if (!this.interactTimer.finished((double)gv.gfcc("gfyb", gfjl(int ), (int)151))) ** GOTO lbl58
            if (var1_3 || var1_3) ** GOTO lbl6
            this.openedMinecartKey = this.key(this.targetMinecart.method_24515());
            if (var1_3 || var1_3) ** GOTO lbl6
            gv.mc.field_1761.method_2905((class_1657)gv.mc.field_1724, (class_1297)this.targetMinecart, class_1268.field_5808);
            if (var1_3 || var1_3) ** GOTO lbl6
            this.interactTimer.reset();
            if (var1_3) ** GOTO lbl6
lbl58:
            // 2 sources

            if (var1_3 || var1_3) ** GOTO lbl6
            return;
lbl60:
            // 1 sources

            if (var1_3 || var1_3) ** GOTO lbl6
            this.pathTo(this.targetMinecart.method_24515(), (int)gv.gfcc("gfyc", gfbz(int ), (int)414));
            if (!var1_3 && !var1_3) ** break;
            ** continue;
            return;
lbl65:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)gv.gfcc("gfyd", gfbz(int ), (int)415);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl235
            }
            case 1: {
                var2_2 /* !! */  = (int)gv.gfcc("gfye", gfbz(int ), (int)416);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl75:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)gv.gfcc("gfyf", gfbz(int ), (int)417);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl132
            }
lbl80:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)gv.gfcc("gfyg", gfbz(int ), (int)418);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl169
            }
lbl85:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)gv.gfcc("gfyh", gfbz(int ), (int)419);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl173
            }
            case 5: {
                var2_2 /* !! */  = (int)gv.gfcc("gfyi", gfbz(int ), (int)420);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl137
            }
lbl95:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)gv.gfcc("gfyj", gfbz(int ), (int)421);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl222
            }
lbl100:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)gv.gfcc("gfyk", gfbz(int ), (int)422);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl169
            }
lbl105:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)gv.gfcc("gfyl", gfbz(int ), (int)423);
                if (!var3_1) ** GOTO lbl85
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)gv.gfcc("gfym", gfbz(int ), (int)424);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl209
            }
            case 10: {
                var2_2 /* !! */  = (int)gv.gfcc("gfyn", gfbz(int ), (int)425);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl119:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)gv.gfcc("gfyo", gfbz(int ), (int)426);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl218
            }
            case 12: {
                var2_2 /* !! */  = (int)gv.gfcc("gfyp", gfbz(int ), (int)427);
                if (var3_1) {
                    throw null;
                }
            }
lbl128:
            // 4 sources

            case 13: {
                var2_2 /* !! */  = (int)gv.gfcc("gfyq", gfbz(int ), (int)428);
                if (!var3_1) ** GOTO lbl65
                throw null;
            }
lbl132:
            // 2 sources

            case 14: {
                var2_2 /* !! */  = (int)gv.gfcc("gfyr", gfbz(int ), (int)429);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl248
            }
lbl137:
            // 4 sources

            case 15: {
                var2_2 /* !! */  = (int)gv.gfcc("gfys", gfbz(int ), (int)430);
                if (!var3_1) ** GOTO lbl75
                throw null;
            }
            case 16: {
                var2_2 /* !! */  = (int)gv.gfcc("gfyt", gfbz(int ), (int)431);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl277
            }
lbl146:
            // 2 sources

            case 17: {
                var2_2 /* !! */  = (int)gv.gfcc("gfyu", gfbz(int ), (int)432);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl191
            }
            case 18: {
                var2_2 /* !! */  = (int)gv.gfcc("gfyv", gfbz(int ), (int)433);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl244
            }
lbl156:
            // 2 sources

            case 19: {
                var2_2 /* !! */  = (int)gv.gfcc("gfyw", gfbz(int ), (int)434);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl261
            }
lbl161:
            // 3 sources

            case 20: {
                var2_2 /* !! */  = (int)gv.gfcc("gfyx", gfbz(int ), (int)435);
                if (!var3_1) ** GOTO lbl146
                throw null;
            }
            case 21: {
                var2_2 /* !! */  = (int)gv.gfcc("gfyy", gfbz(int ), (int)436);
                if (!var3_1) ** GOTO lbl156
                throw null;
            }
lbl169:
            // 5 sources

            case 22: {
                var2_2 /* !! */  = (int)gv.gfcc("gfyz", gfbz(int ), (int)437);
                if (!var3_1) ** GOTO lbl100
                throw null;
            }
lbl173:
            // 2 sources

            case 23: {
                var2_2 /* !! */  = (int)gv.gfcc("gfza", gfbz(int ), (int)438);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl200
            }
lbl178:
            // 4 sources

            case 24: {
                var2_2 /* !! */  = (int)gv.gfcc("gfzb", gfbz(int ), (int)439);
                if (!var3_1) ** GOTO lbl137
                throw null;
            }
            case 25: {
                var2_2 /* !! */  = (int)gv.gfcc("gfzc", gfbz(int ), (int)440);
                if (var3_1) {
                    throw null;
                }
            }
            case 26: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)gv.gfcc("gfzd", gfbz(int ), (int)441);
                    if (!var3_1) ** GOTO lbl169
                    throw null;
                }
            }
lbl191:
            // 2 sources

            case 27: {
                var2_2 /* !! */  = (int)gv.gfcc("gfze", gfbz(int ), (int)442);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl196:
            // 2 sources

            case 28: {
                var2_2 /* !! */  = (int)gv.gfcc("gfzf", gfbz(int ), (int)443);
                if (!var3_1) ** GOTO lbl137
                throw null;
            }
lbl200:
            // 2 sources

            case 29: {
                var2_2 /* !! */  = (int)gv.gfcc("gfzg", gfbz(int ), (int)444);
                if (!var3_1) ** GOTO lbl178
                throw null;
            }
            case 30: {
                var2_2 /* !! */  = (int)gv.gfcc("gfzh", gfbz(int ), (int)445);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl253
            }
lbl209:
            // 4 sources

            case 31: {
                var2_2 /* !! */  = (int)gv.gfcc("gfzi", gfbz(int ), (int)446);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl277
            }
            case 32: {
                var2_2 /* !! */  = (int)gv.gfcc("gfzj", gfbz(int ), (int)447);
                if (!var3_1) ** GOTO lbl209
                throw null;
            }
lbl218:
            // 2 sources

            case 33: {
                var2_2 /* !! */  = (int)gv.gfcc("gfzk", gfbz(int ), (int)448);
                if (!var3_1) ** GOTO lbl169
                throw null;
            }
lbl222:
            // 3 sources

            case 34: {
                var2_2 /* !! */  = (int)gv.gfcc("gfzl", gfbz(int ), (int)449);
                if (!var3_1) ** GOTO lbl80
                throw null;
            }
lbl226:
            // 2 sources

            case 35: {
                var2_2 /* !! */  = (int)gv.gfcc("gfzm", gfbz(int ), (int)450);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl240
            }
            case 36: {
                var2_2 /* !! */  = (int)gv.gfcc("gfzn", gfbz(int ), (int)451);
                if (!var3_1) ** GOTO lbl128
                throw null;
            }
lbl235:
            // 2 sources

            case 37: {
                var2_2 /* !! */  = (int)gv.gfcc("gfzo", gfbz(int ), (int)452);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl248
            }
lbl240:
            // 2 sources

            case 38: {
                var2_2 /* !! */  = (int)gv.gfcc("gfzp", gfbz(int ), (int)453);
                if (!var3_1) ** GOTO lbl209
                throw null;
            }
lbl244:
            // 3 sources

            case 39: {
                var2_2 /* !! */  = (int)gv.gfcc("gfzq", gfbz(int ), (int)454);
                if (!var3_1) ** GOTO lbl222
                throw null;
            }
lbl248:
            // 3 sources

            case 40: {
                var2_2 /* !! */  = (int)gv.gfcc("gfzr", gfbz(int ), (int)455);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl261
            }
lbl253:
            // 2 sources

            case 41: {
                var2_2 /* !! */  = (int)gv.gfcc("gfzs", gfbz(int ), (int)456);
                if (!var3_1) ** GOTO lbl178
                throw null;
            }
            case 42: {
                var2_2 /* !! */  = (int)gv.gfcc("gfzt", gfbz(int ), (int)457);
                if (!var3_1) ** GOTO lbl105
                throw null;
            }
lbl261:
            // 3 sources

            case 43: {
                var2_2 /* !! */  = (int)gv.gfcc("gfzu", gfbz(int ), (int)458);
                if (!var3_1) ** GOTO lbl95
                throw null;
            }
            case 44: {
                var2_2 /* !! */  = (int)gv.gfcc("gfzv", gfbz(int ), (int)459);
                if (!var3_1) ** GOTO lbl119
                throw null;
            }
lbl269:
            // 2 sources

            case 45: {
                var2_2 /* !! */  = (int)gv.gfcc("gfzw", gfbz(int ), (int)460);
                if (!var3_1) ** GOTO lbl196
                throw null;
            }
            case 46: {
                var2_2 /* !! */  = (int)gv.gfcc("gfzx", gfbz(int ), (int)461);
                if (!var3_1) ** GOTO lbl244
                throw null;
            }
lbl277:
            // 3 sources

            case 47: {
                var2_2 /* !! */  = (int)gv.gfcc("gfzy", gfbz(int ), (int)462);
                if (!var3_1) ** GOTO lbl269
                throw null;
            }
            case 48: {
                var2_2 /* !! */  = (int)gv.gfcc("gfzz", gfbz(int ), (int)463);
                if (!var3_1) ** GOTO lbl161
                throw null;
            }
            case 49: 
        }
        var2_2 /* !! */  = (int)gv.gfcc("ggaa", gfbz(int ), (int)464);
        ** while (!var3_1)
lbl288:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isRememberedMinecart(String var1_1) {
        v0 /* !! */  = gv.nl;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - gv.gfcc("gncx", gfdd(int ), (int)651));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 916530582: {
                    v1 = gv.gfcc("gncz", gfdd(int ), (int)652);
                    continue block21;
                }
                case 1185080505: {
                    break block21;
                }
                case 1566785324: {
                    v1 = gv.gfcc("gnda", gfdd(int ), (int)653);
                    continue block21;
                }
            }
            break;
        }
        var4_2 = gv.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = gv.nl - gv.gfcc("gndc", gfdd(int ), (int)654)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == gv.gfcc("gndd", gfbz(int ), (int)1519)) break;
            v2 /* !! */  = (long)gv.gfcc("gndf", gfbz(int ), (int)1520);
        }
        var3_3 /* !! */  = gv.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = gv.nl - gv.gfcc("gndg", gfdd(int ), (int)655)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == gv.gfcc("gndi", gfbz(int ), (int)1521)) break;
            v3 /* !! */  = (long)gv.gfcc("gndj", gfbz(int ), (int)1522);
        }
        var2_4 = gv.a;
        if (var4_2) {
            throw null;
lbl29:
            // 1 sources

            return (boolean)gv.gfcc("gndl", gfbz(int ), (int)1523);
        }
        ** while (var2_4 || var2_4)
lbl32:
        // 1 sources

        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = gv.nl;
                if (true) ** GOTO lbl39
                block25: while (true) {
                    v4 /* !! */  = (long)(v5 - gv.gfcc("gndn", gfdd(int ), (int)656));
lbl39:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 505861273: {
                            v5 = gv.gfcc("gndr", gfdd(int ), (int)657);
                            continue block25;
                        }
                        case 1185080505: {
                            break block25;
                        }
                        case 1519856052: {
                            v5 = gv.gfcc("gnds", gfdd(int ), (int)658);
                            continue block25;
                        }
                    }
                    break;
                }
                v6 /* !! */  = gv.nl;
                if (true) ** GOTO lbl52
                block26: while (true) {
                    v6 /* !! */  = (long)(v7 - gv.gfcc("gndt", gfdd(int ), (int)659));
lbl52:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1561676822: {
                            v7 = gv.gfcc("gndu", gfdd(int ), (int)660);
                            continue block26;
                        }
                        case -304676467: {
                            v7 = gv.gfcc("gndv", gfdd(int ), (int)661);
                            continue block26;
                        }
                        case 1185080505: {
                            break block26;
                        }
                    }
                    break;
                }
                v8 = this.rememberedMinecarts.stream();
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = gv.nl - gv.gfcc("gndw", gfdd(int ), (int)662)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == gv.gfcc("gnea", gfbz(int ), (int)1524)) break;
                    v9 /* !! */  = (long)gv.gfcc("gneb", gfbz(int ), (int)1525);
                }
                v10 = (Predicate<String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$isRememberedMinecart$4(java.lang.String java.lang.String ), (Ljava/lang/String;)Z)((gv)this, (String)var1_1);
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = gv.nl - gv.gfcc("gned", gfdd(int ), (int)663)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == gv.gfcc("gnef", gfbz(int ), (int)1526)) break;
                    v11 /* !! */  = (long)gv.gfcc("gneg", gfbz(int ), (int)1527);
                }
                return v8.anyMatch(v10);
            }
lbl74:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)gv.gfcc("gnei", gfbz(int ), (int)1528);
                if (!var4_2) break;
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)gv.gfcc("gnej", gfbz(int ), (int)1529);
                if (!var4_2) break;
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)gv.gfcc("gnem", gfbz(int ), (int)1530);
                if (!var4_2) ** GOTO lbl74
                throw null;
            }
            case 3: 
        }
        do {
            var3_3 /* !! */  = (int)gv.gfcc("gnen", gfbz(int ), (int)1531);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void gqov() {
        gv.gfdf[700] = 215747805373333870L;
        gv.gfdf[701] = 9024543851721216113L;
        gv.gfdf[702] = 1792527538339263416L;
        gv.gfdf[703] = 472354687488974468L;
        gv.gfdf[704] = 3507615094932133260L;
        gv.gfdf[705] = 141334004772181515L;
        gv.gfdf[706] = -6434405153905805362L;
        gv.gfdf[707] = -229233755110819905L;
        gv.gfdf[708] = -7240144507301815562L;
        gv.gfdf[709] = -1519093025697421913L;
        gv.gfdf[710] = -7176791079745763736L;
        gv.gfdf[711] = 2534754369142738355L;
        gv.gfdf[712] = 7015595230910928142L;
        gv.gfdf[713] = 2932772421285139943L;
        gv.gfdf[714] = -4486671915744801554L;
        gv.gfdf[715] = 2323487816176243604L;
        gv.gfdf[716] = -2356313018732197023L;
        gv.gfdf[717] = 1942859219105472154L;
        gv.gfdf[718] = 2534378516119654332L;
        gv.gfdf[719] = 4781750842527937378L;
        gv.gfdf[720] = 7180339670798466181L;
        gv.gfdf[721] = -8649976260379768510L;
        gv.gfdf[722] = -6667081160257130883L;
        gv.gfdf[723] = 1821326741752578017L;
        gv.gfdf[724] = -2288818826083305878L;
        gv.gfdf[725] = -6959346086604309525L;
        gv.gfdf[726] = -2481475549453966323L;
        gv.gfdf[727] = -7548018020883560801L;
        gv.gfdf[728] = 5234435784645262531L;
        gv.gfdf[729] = -154095641877491666L;
        gv.gfdf[730] = -4271665233337785275L;
        gv.gfdf[731] = 3166703778721622197L;
        gv.gfdf[732] = 7377520999895412418L;
        gv.gfdf[733] = 2445946200454804030L;
        gv.gfdf[734] = -1141639728613171017L;
        gv.gfdf[735] = 452111776489577426L;
        gv.gfdf[736] = 6504743616346237856L;
        gv.gfdf[737] = 4874520753464259062L;
        gv.gfdf[738] = 9194992837536595807L;
        gv.gfdf[739] = 5491915502941905192L;
        gv.gfdf[740] = -5647099835724758627L;
        gv.gfdf[741] = -4704415735805951493L;
        gv.gfdf[742] = 3394869725603678327L;
        gv.gfdf[743] = -4805911982501047027L;
        gv.gfdf[744] = -6978981412541982515L;
        gv.gfdf[745] = 7513352648092769516L;
        gv.gfdf[746] = 6897585291507512061L;
        gv.gfdf[747] = 7448949552188835363L;
        gv.gfdf[748] = -5840293336941926434L;
        gv.gfdf[749] = -5089316029414160578L;
        gv.gfdf[750] = 1581000550291479511L;
        gv.gfdf[751] = -1694261504131000052L;
        gv.gfdf[752] = -7373781416209088073L;
        gv.gfdf[753] = -3490119061355319149L;
        gv.gfdf[754] = -8147281198361337684L;
        gv.gfdf[755] = 7120955333071213885L;
        gv.gfdf[756] = 1264047765969460393L;
        gv.gfdf[757] = -7617448246150075117L;
        gv.gfdf[758] = -6946527510746785941L;
        gv.gfdf[759] = -5897458536731769337L;
        gv.gfdf[760] = -4565835052609066843L;
        gv.gfdf[761] = -6562852975672418184L;
        gv.gfdf[762] = 7098996522400038316L;
        gv.gfdf[763] = -9017139100555691446L;
        gv.gfdf[764] = -2085130761498606821L;
        gv.gfdf[765] = 822291092776362353L;
        gv.gfdf[766] = 5838489683444212248L;
        gv.gfdf[767] = -8085992683449149322L;
        gv.gfdf[768] = -7897110216213732690L;
        gv.gfdf[769] = 4738419313232959882L;
        gv.gfdf[770] = 232388158341779205L;
        gv.gfdf[771] = 582873569833992007L;
        gv.gfdf[772] = 4387828470629262809L;
        gv.gfdf[773] = -2799641857896438292L;
        gv.gfdf[774] = -8136593909869892848L;
        gv.gfdf[775] = -232195196293645790L;
        gv.gfdf[776] = -5607610865372574924L;
        gv.gfdf[777] = -9207308582626789897L;
        gv.gfdf[778] = 8914707406455775030L;
        gv.gfdf[779] = -1279316242967309011L;
        gv.gfdf[780] = -9181028964328208643L;
        gv.gfdf[781] = -5605895464828840730L;
        gv.gfdf[782] = -109261551867101104L;
        gv.gfdf[783] = 6817686367398204655L;
        gv.gfdf[784] = -2596150700617910244L;
        gv.gfdf[785] = -7471004799774489906L;
        gv.gfdf[786] = 3906185038934477389L;
        gv.gfdf[787] = 381535352026004808L;
        gv.gfdf[788] = 7501717369896188173L;
        gv.gfdf[789] = -1036718652328341810L;
        gv.gfdf[790] = -1761276401166173640L;
        gv.gfdf[791] = -5500404564861326686L;
        gv.gfdf[792] = 8015374005714627166L;
        gv.gfdf[793] = 73757045405952051L;
        gv.gfdf[794] = 1256648055947596266L;
        gv.gfdf[795] = -1396224436700373972L;
        gv.gfdf[796] = 3736622221026405366L;
        gv.gfdf[797] = -7973842646504829465L;
        gv.gfdf[798] = -8826710205840355183L;
        gv.gfdf[799] = -8239286976871349234L;
    }

    private static /* synthetic */ void gqcp() {
        gv.gfcb[200] = 882991450;
        gv.gfcb[201] = -406729056;
        gv.gfcb[202] = -1047153363;
        gv.gfcb[203] = 444669075;
        gv.gfcb[204] = 663557488;
        gv.gfcb[205] = 1096453442;
        gv.gfcb[206] = 1672553084;
        gv.gfcb[207] = 1704105792;
        gv.gfcb[208] = 1141511927;
        gv.gfcb[209] = 1967311832;
        gv.gfcb[210] = -2019697502;
        gv.gfcb[211] = -1255975194;
        gv.gfcb[212] = -572794005;
        gv.gfcb[213] = 1339752184;
        gv.gfcb[214] = 1697080278;
        gv.gfcb[215] = -530811973;
        gv.gfcb[216] = -144597448;
        gv.gfcb[217] = -89670657;
        gv.gfcb[218] = 248564314;
        gv.gfcb[219] = -1866962476;
        gv.gfcb[220] = 1825695613;
        gv.gfcb[221] = 342766221;
        gv.gfcb[222] = -637361445;
        gv.gfcb[223] = 1575973302;
        gv.gfcb[224] = 803289874;
        gv.gfcb[225] = -1474672332;
        gv.gfcb[226] = -893456099;
        gv.gfcb[227] = 1660440108;
        gv.gfcb[228] = 158741452;
        gv.gfcb[229] = -1851960981;
        gv.gfcb[230] = 420544727;
        gv.gfcb[231] = 1541907290;
        gv.gfcb[232] = -1737650433;
        gv.gfcb[233] = 795838152;
        gv.gfcb[234] = 2036942555;
        gv.gfcb[235] = -964351214;
        gv.gfcb[236] = 1402268739;
        gv.gfcb[237] = 1129172334;
        gv.gfcb[238] = 1903407225;
        gv.gfcb[239] = 1963940453;
        gv.gfcb[240] = -903133829;
        gv.gfcb[241] = -261069885;
        gv.gfcb[242] = -1560738523;
        gv.gfcb[243] = 689654909;
        gv.gfcb[244] = 362963731;
        gv.gfcb[245] = 537820006;
        gv.gfcb[246] = 1816280663;
        gv.gfcb[247] = -586676566;
        gv.gfcb[248] = -917712760;
        gv.gfcb[249] = -1177686688;
        gv.gfcb[250] = -2088830542;
        gv.gfcb[251] = 1784244666;
        gv.gfcb[252] = -849865428;
        gv.gfcb[253] = -67273320;
        gv.gfcb[254] = -1491179160;
        gv.gfcb[255] = -608148340;
        gv.gfcb[256] = -1574226645;
        gv.gfcb[257] = 2053857676;
        gv.gfcb[258] = 572286684;
        gv.gfcb[259] = 1742420967;
        gv.gfcb[260] = -197280056;
        gv.gfcb[261] = 2039545406;
        gv.gfcb[262] = -1623553144;
        gv.gfcb[263] = 1460796295;
        gv.gfcb[264] = 519825388;
        gv.gfcb[265] = 1239945579;
        gv.gfcb[266] = -1556646880;
        gv.gfcb[267] = -794794887;
        gv.gfcb[268] = -208633887;
        gv.gfcb[269] = 869054978;
        gv.gfcb[270] = 1922339319;
        gv.gfcb[271] = 706735272;
        gv.gfcb[272] = -2034910886;
        gv.gfcb[273] = 1653806035;
        gv.gfcb[274] = 899493538;
        gv.gfcb[275] = 519676854;
        gv.gfcb[276] = -348516170;
        gv.gfcb[277] = -189900153;
        gv.gfcb[278] = -748190246;
        gv.gfcb[279] = -1554968304;
        gv.gfcb[280] = 368497285;
        gv.gfcb[281] = 36882384;
        gv.gfcb[282] = 1421023654;
        gv.gfcb[283] = -2055839940;
        gv.gfcb[284] = -137755062;
        gv.gfcb[285] = -1713725216;
        gv.gfcb[286] = 672507065;
        gv.gfcb[287] = 50292852;
        gv.gfcb[288] = 1795015042;
        gv.gfcb[289] = -1437980898;
        gv.gfcb[290] = 2082098968;
        gv.gfcb[291] = -259229576;
        gv.gfcb[292] = 1872963301;
        gv.gfcb[293] = -1059758057;
        gv.gfcb[294] = 403507455;
        gv.gfcb[295] = 1043781536;
        gv.gfcb[296] = 1845990891;
        gv.gfcb[297] = -473569102;
        gv.gfcb[298] = -748277755;
        gv.gfcb[299] = -67865808;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void handleDistantCaveSearch() {
        var4_1 = gv.c;
        var3_2 /* !! */  = gv.b;
        var2_3 = gv.a;
        if (var4_1) {
            throw null;
lbl6:
            // 28 sources

            return;
        }
        if (var2_3 || var2_3) ** GOTO lbl6
        if (!(gv.mc.field_1724.method_23318() > gv.gfcc("ggdv", gfjl(int ), (int)194))) ** GOTO lbl21
        if (var2_3 || var2_3) ** GOTO lbl6
        this.exploreTarget = new class_2338(gv.mc.field_1724.method_31477(), gv.CAVE_SEARCH_LEVELS[this.caveLevelIndex], gv.mc.field_1724.method_31479());
        if (var2_3 || var2_3) ** GOTO lbl6
        this.currentPathKey = null;
        if (var2_3 || var2_3) ** GOTO lbl6
        this.pathToExplore(this.exploreTarget);
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3 || var2_3) ** GOTO lbl6
                return;
            }
lbl21:
            // 1 sources

            if (var2_3 || var2_3) ** GOTO lbl6
            if (!this.shouldTurnAwayFromBorder()) ** GOTO lbl30
            if (var2_3 || var2_3) ** GOTO lbl6
            this.rotateExploreDirection();
            if (var2_3 || var2_3) ** GOTO lbl6
            this.exploreTarget = null;
            if (var2_3 || var2_3) ** GOTO lbl6
            this.currentPathKey = null;
            if (var2_3) ** GOTO lbl6
lbl30:
            // 2 sources

            if (var2_3 || var2_3) ** GOTO lbl6
            var1_4 = this.isNearExploreTarget();
            if (var2_3 || var2_3) ** GOTO lbl6
            if (this.exploreTarget == null) ** GOTO lbl37
            if (var2_3) ** GOTO lbl6
            if (!var1_4) ** GOTO lbl47
            if (var2_3) ** GOTO lbl6
lbl37:
            // 2 sources

            if (var2_3 || var2_3) ** GOTO lbl6
            if (!var1_4) ** GOTO lbl42
            if (var2_3 || var2_3) ** GOTO lbl6
            this.caveLevelIndex = (this.caveLevelIndex + 1) % gv.CAVE_SEARCH_LEVELS.length;
            if (var2_3) ** GOTO lbl6
lbl42:
            // 2 sources

            if (var2_3 || var2_3) ** GOTO lbl6
            this.exploreTarget = this.createExploreTarget();
            if (var2_3 || var2_3) ** GOTO lbl6
            this.currentPathKey = null;
            if (var2_3) ** GOTO lbl6
lbl47:
            // 2 sources

            if (var2_3 || var2_3) ** GOTO lbl6
            if (this.exploreTarget != null) ** GOTO lbl54
            if (var2_3 || var2_3) ** GOTO lbl6
            this.rotateExploreDirection();
            if (var2_3 || var2_3) ** GOTO lbl6
            this.exploreTarget = this.createExploreTarget();
            if (var2_3) ** GOTO lbl6
lbl54:
            // 2 sources

            if (var2_3 || var2_3) ** GOTO lbl6
            if (this.exploreTarget == null) ** GOTO lbl59
            if (var2_3 || var2_3) ** GOTO lbl6
            this.pathToExplore(this.exploreTarget);
            if (var2_3) ** GOTO lbl6
lbl59:
            // 2 sources

            if (!var2_3 && !var2_3) ** break;
            ** continue;
            return;
lbl62:
            // 3 sources

            case 0: {
                var3_2 /* !! */  = (int)gv.gfcc("ggdw", gfbz(int ), (int)521);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl217
            }
lbl67:
            // 2 sources

            case 1: {
                var3_2 /* !! */  = (int)gv.gfcc("ggdx", gfbz(int ), (int)522);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl250
            }
            case 2: {
                var3_2 /* !! */  = (int)gv.gfcc("ggdy", gfbz(int ), (int)523);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl275
            }
lbl77:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)gv.gfcc("ggdz", gfbz(int ), (int)524);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl86
            }
            case 4: {
                var3_2 /* !! */  = (int)gv.gfcc("ggea", gfbz(int ), (int)525);
                if (!var4_1) ** GOTO lbl77
                throw null;
            }
lbl86:
            // 2 sources

            case 5: {
                var3_2 /* !! */  = (int)gv.gfcc("ggeb", gfbz(int ), (int)526);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl287
            }
lbl91:
            // 2 sources

            case 6: {
                var3_2 /* !! */  = (int)gv.gfcc("ggec", gfbz(int ), (int)527);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl151
            }
            case 7: {
                var3_2 /* !! */  = (int)gv.gfcc("gged", gfbz(int ), (int)528);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl106
            }
lbl101:
            // 2 sources

            case 8: {
                var3_2 /* !! */  = (int)gv.gfcc("ggee", gfbz(int ), (int)529);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl242
            }
lbl106:
            // 2 sources

            case 9: {
                var3_2 /* !! */  = (int)gv.gfcc("ggef", gfbz(int ), (int)530);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl175
            }
lbl111:
            // 2 sources

            case 10: {
                var3_2 /* !! */  = (int)gv.gfcc("ggeg", gfbz(int ), (int)531);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl189
            }
            case 11: {
                var3_2 /* !! */  = (int)gv.gfcc("ggeh", gfbz(int ), (int)532);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl238
            }
            case 12: {
                var3_2 /* !! */  = (int)gv.gfcc("ggei", gfbz(int ), (int)533);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl185
            }
            case 13: {
                var3_2 /* !! */  = (int)gv.gfcc("ggej", gfbz(int ), (int)534);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl198
            }
            case 14: {
                var3_2 /* !! */  = (int)gv.gfcc("ggek", gfbz(int ), (int)535);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl250
            }
lbl136:
            // 3 sources

            case 15: {
                var3_2 /* !! */  = (int)gv.gfcc("ggel", gfbz(int ), (int)536);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl246
            }
            case 16: {
                var3_2 /* !! */  = (int)gv.gfcc("ggem", gfbz(int ), (int)537);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl217
            }
            case 17: {
                var3_2 /* !! */  = (int)gv.gfcc("ggen", gfbz(int ), (int)538);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl258
            }
lbl151:
            // 2 sources

            case 18: {
                var3_2 /* !! */  = (int)gv.gfcc("ggeo", gfbz(int ), (int)539);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl246
            }
            case 19: {
                var3_2 /* !! */  = (int)gv.gfcc("ggep", gfbz(int ), (int)540);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl217
            }
            case 20: {
                var3_2 /* !! */  = (int)gv.gfcc("ggeq", gfbz(int ), (int)541);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl279
            }
lbl166:
            // 2 sources

            case 21: {
                var3_2 /* !! */  = (int)gv.gfcc("gger", gfbz(int ), (int)542);
                if (!var4_1) ** GOTO lbl111
                throw null;
            }
            case 22: {
                var3_2 /* !! */  = (int)gv.gfcc("gges", gfbz(int ), (int)543);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl189
            }
lbl175:
            // 2 sources

            case 23: {
                var3_2 /* !! */  = (int)gv.gfcc("gget", gfbz(int ), (int)544);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl262
            }
lbl180:
            // 2 sources

            case 24: {
                var3_2 /* !! */  = (int)gv.gfcc("ggeu", gfbz(int ), (int)545);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl185:
            // 2 sources

            case 25: {
                var3_2 /* !! */  = (int)gv.gfcc("ggev", gfbz(int ), (int)546);
                if (!var4_1) ** GOTO lbl166
                throw null;
            }
lbl189:
            // 3 sources

            case 26: {
                var3_2 /* !! */  = (int)gv.gfcc("ggew", gfbz(int ), (int)547);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl234
            }
lbl194:
            // 2 sources

            case 27: {
                var3_2 /* !! */  = (int)gv.gfcc("ggex", gfbz(int ), (int)548);
                if (!var4_1) ** GOTO lbl67
                throw null;
            }
lbl198:
            // 3 sources

            case 28: {
                var3_2 /* !! */  = (int)gv.gfcc("ggey", gfbz(int ), (int)549);
                if (!var4_1) ** GOTO lbl180
                throw null;
            }
            case 29: {
                var3_2 /* !! */  = (int)gv.gfcc("ggez", gfbz(int ), (int)550);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl287
            }
lbl207:
            // 2 sources

            case 30: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)gv.gfcc("ggfa", gfbz(int ), (int)551);
                    if (!var4_1) ** GOTO lbl194
                    throw null;
                }
            }
lbl212:
            // 3 sources

            case 31: {
                var3_2 /* !! */  = (int)gv.gfcc("ggfb", gfbz(int ), (int)552);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl246
            }
lbl217:
            // 4 sources

            case 32: {
                var3_2 /* !! */  = (int)gv.gfcc("ggfc", gfbz(int ), (int)553);
                if (!var4_1) ** GOTO lbl207
                throw null;
            }
lbl221:
            // 2 sources

            case 33: {
                var3_2 /* !! */  = (int)gv.gfcc("ggfd", gfbz(int ), (int)554);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl250
            }
lbl226:
            // 3 sources

            case 34: {
                var3_2 /* !! */  = (int)gv.gfcc("ggfe", gfbz(int ), (int)555);
                if (!var4_1) ** GOTO lbl101
                throw null;
            }
            case 35: {
                var3_2 /* !! */  = (int)gv.gfcc("ggff", gfbz(int ), (int)556);
                if (!var4_1) ** GOTO lbl62
                throw null;
            }
lbl234:
            // 3 sources

            case 36: {
                var3_2 /* !! */  = (int)gv.gfcc("ggfg", gfbz(int ), (int)557);
                if (!var4_1) ** GOTO lbl212
                throw null;
            }
lbl238:
            // 3 sources

            case 37: {
                var3_2 /* !! */  = (int)gv.gfcc("ggfh", gfbz(int ), (int)558);
                if (!var4_1) ** GOTO lbl136
                throw null;
            }
lbl242:
            // 2 sources

            case 38: {
                var3_2 /* !! */  = (int)gv.gfcc("ggfi", gfbz(int ), (int)559);
                if (!var4_1) ** GOTO lbl221
                throw null;
            }
lbl246:
            // 4 sources

            case 39: {
                var3_2 /* !! */  = (int)gv.gfcc("ggfj", gfbz(int ), (int)560);
                if (!var4_1) ** GOTO lbl91
                throw null;
            }
lbl250:
            // 4 sources

            case 40: {
                var3_2 /* !! */  = (int)gv.gfcc("ggfk", gfbz(int ), (int)561);
                if (!var4_1) ** GOTO lbl234
                throw null;
            }
lbl254:
            // 2 sources

            case 41: {
                var3_2 /* !! */  = (int)gv.gfcc("ggfl", gfbz(int ), (int)562);
                if (!var4_1) ** GOTO lbl226
                throw null;
            }
lbl258:
            // 2 sources

            case 42: {
                var3_2 /* !! */  = (int)gv.gfcc("ggfm", gfbz(int ), (int)563);
                if (!var4_1) ** GOTO lbl198
                throw null;
            }
lbl262:
            // 2 sources

            case 43: {
                var3_2 /* !! */  = (int)gv.gfcc("ggfn", gfbz(int ), (int)564);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl283
            }
lbl267:
            // 3 sources

            case 44: {
                var3_2 /* !! */  = (int)gv.gfcc("ggfo", gfbz(int ), (int)565);
                if (!var4_1) ** GOTO lbl226
                throw null;
            }
            case 45: {
                var3_2 /* !! */  = (int)gv.gfcc("ggfp", gfbz(int ), (int)566);
                if (!var4_1) ** GOTO lbl62
                throw null;
            }
lbl275:
            // 2 sources

            case 46: {
                var3_2 /* !! */  = (int)gv.gfcc("ggfq", gfbz(int ), (int)567);
                if (!var4_1) ** GOTO lbl267
                throw null;
            }
lbl279:
            // 2 sources

            case 47: {
                var3_2 /* !! */  = (int)gv.gfcc("ggfr", gfbz(int ), (int)568);
                if (!var4_1) ** GOTO lbl254
                throw null;
            }
lbl283:
            // 2 sources

            case 48: {
                var3_2 /* !! */  = (int)gv.gfcc("ggfs", gfbz(int ), (int)569);
                if (!var4_1) ** GOTO lbl267
                throw null;
            }
lbl287:
            // 3 sources

            case 49: {
                var3_2 /* !! */  = (int)gv.gfcc("ggft", gfbz(int ), (int)570);
                if (!var4_1) ** GOTO lbl136
                throw null;
            }
            case 50: {
                var3_2 /* !! */  = (int)gv.gfcc("ggfu", gfbz(int ), (int)571);
                if (!var4_1) ** GOTO lbl238
                throw null;
            }
            case 51: 
        }
        var3_2 /* !! */  = (int)gv.gfcc("ggfv", gfbz(int ), (int)572);
        ** while (!var4_1)
lbl298:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gqgq() {
        gv.gfcb[1000] = -1613441763;
        gv.gfcb[1001] = 532912375;
        gv.gfcb[1002] = 1357353030;
        gv.gfcb[1003] = 724370684;
        gv.gfcb[1004] = -2124785490;
        gv.gfcb[1005] = 1302089768;
        gv.gfcb[1006] = -1275473267;
        gv.gfcb[1007] = -739978385;
        gv.gfcb[1008] = -1130197559;
        gv.gfcb[1009] = -1601196354;
        gv.gfcb[1010] = -1199642839;
        gv.gfcb[1011] = 812512328;
        gv.gfcb[1012] = 1146136890;
        gv.gfcb[1013] = -701938494;
        gv.gfcb[1014] = 1315496837;
        gv.gfcb[1015] = 343560735;
        gv.gfcb[1016] = -476892424;
        gv.gfcb[1017] = 1481362835;
        gv.gfcb[1018] = -173624139;
        gv.gfcb[1019] = 82183897;
        gv.gfcb[1020] = 403809450;
        gv.gfcb[1021] = 494421533;
        gv.gfcb[1022] = -1437906026;
        gv.gfcb[1023] = -340544950;
        gv.gfcb[1024] = 1857611571;
        gv.gfcb[1025] = -550371803;
        gv.gfcb[1026] = -1940203566;
        gv.gfcb[1027] = -369146440;
        gv.gfcb[1028] = -833871510;
        gv.gfcb[1029] = -839296736;
        gv.gfcb[1030] = -1796691156;
        gv.gfcb[1031] = -1956781139;
        gv.gfcb[1032] = 1821942223;
        gv.gfcb[1033] = 705624246;
        gv.gfcb[1034] = -1665046261;
        gv.gfcb[1035] = -1633867193;
        gv.gfcb[1036] = -905733425;
        gv.gfcb[1037] = 1050245668;
        gv.gfcb[1038] = 469536260;
        gv.gfcb[1039] = 247954679;
        gv.gfcb[1040] = -458853096;
        gv.gfcb[1041] = 35225769;
        gv.gfcb[1042] = 1074939059;
        gv.gfcb[1043] = -1266171344;
        gv.gfcb[1044] = -165262024;
        gv.gfcb[1045] = -1858368423;
        gv.gfcb[1046] = -1582934526;
        gv.gfcb[1047] = -2011248550;
        gv.gfcb[1048] = -623695996;
        gv.gfcb[1049] = -1376785872;
        gv.gfcb[1050] = -1915004501;
        gv.gfcb[1051] = -921336308;
        gv.gfcb[1052] = 1714159162;
        gv.gfcb[1053] = -1584852631;
        gv.gfcb[1054] = 1988750074;
        gv.gfcb[1055] = -69817989;
        gv.gfcb[1056] = 722669033;
        gv.gfcb[1057] = -1680735728;
        gv.gfcb[1058] = 271574487;
        gv.gfcb[1059] = 1359817516;
        gv.gfcb[1060] = -858782704;
        gv.gfcb[1061] = 1578334422;
        gv.gfcb[1062] = 1864888323;
        gv.gfcb[1063] = 2118965233;
        gv.gfcb[1064] = 1874064389;
        gv.gfcb[1065] = -115864540;
        gv.gfcb[1066] = -939928926;
        gv.gfcb[1067] = -832240110;
        gv.gfcb[1068] = 520959512;
        gv.gfcb[1069] = 1034716785;
        gv.gfcb[1070] = -996644872;
        gv.gfcb[1071] = 957147593;
        gv.gfcb[1072] = 676828408;
        gv.gfcb[1073] = 1763381720;
        gv.gfcb[1074] = 577380727;
        gv.gfcb[1075] = 1486634227;
        gv.gfcb[1076] = -1240165142;
        gv.gfcb[1077] = -1818501078;
        gv.gfcb[1078] = 1803576276;
        gv.gfcb[1079] = -1168435011;
        gv.gfcb[1080] = 682712588;
        gv.gfcb[1081] = 1913082897;
        gv.gfcb[1082] = -188188437;
        gv.gfcb[1083] = -914688661;
        gv.gfcb[1084] = 1193047865;
        gv.gfcb[1085] = -893012560;
        gv.gfcb[1086] = 543565347;
        gv.gfcb[1087] = -1173899206;
        gv.gfcb[1088] = 339981388;
        gv.gfcb[1089] = 730447571;
        gv.gfcb[1090] = 623954734;
        gv.gfcb[1091] = 1875983420;
        gv.gfcb[1092] = 2134662954;
        gv.gfcb[1093] = -1013731387;
        gv.gfcb[1094] = 1882089631;
        gv.gfcb[1095] = 1308054969;
        gv.gfcb[1096] = 847166618;
        gv.gfcb[1097] = -303218870;
        gv.gfcb[1098] = 942912994;
        gv.gfcb[1099] = 903490933;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean handleAutoHeal() {
        boolean bl2;
        block23: {
            block22: {
                block19: {
                    block21: {
                        block20: {
                            boolean bl3 = c;
                            int n2 = b;
                            bl2 = a;
                            if (bl3) {
                                throw null;
                            }
                            if (bl2 || bl2) return (boolean)gv.gfcc("gfos", gfbz(int ), (int)258);
                            if (!this.autoEating) break block19;
                            if (bl2 || bl2) return (boolean)gv.gfcc("gfos", gfbz(int ), (int)258);
                            if (!this.autoHeal.isValue()) break block20;
                            if (bl2) return (boolean)gv.gfcc("gfos", gfbz(int ), (int)258);
                            if (gv.mc.field_1724.method_6032() > gv.gfcc("gfot", gfce(int ), (int)259)) break block20;
                            if (bl2) return (boolean)gv.gfcc("gfos", gfbz(int ), (int)258);
                            if (gv.mc.field_1724.method_6115()) break block21;
                            if (bl2) return (boolean)gv.gfcc("gfos", gfbz(int ), (int)258);
                        }
                        if (bl2 || bl2) return (boolean)gv.gfcc("gfos", gfbz(int ), (int)258);
                        this.stopUsingItem();
                        if (bl2 || bl2) return (boolean)gv.gfcc("gfos", gfbz(int ), (int)258);
                        return (boolean)gv.gfcc("gfou", gfbz(int ), (int)260);
                    }
                    if (bl2 || bl2) return (boolean)gv.gfcc("gfos", gfbz(int ), (int)258);
                    return (boolean)gv.gfcc("gfov", gfbz(int ), (int)261);
                }
                if (bl2 || bl2) return (boolean)gv.gfcc("gfos", gfbz(int ), (int)258);
                if (!this.autoHeal.isValue()) break block22;
                if (bl2) return (boolean)gv.gfcc("gfos", gfbz(int ), (int)258);
                if (gv.mc.field_1724.method_6032() > gv.gfcc("gfow", gfce(int ), (int)262)) break block22;
                if (bl2) return (boolean)gv.gfcc("gfos", gfbz(int ), (int)258);
                if (gv.mc.field_1724.method_6115()) break block22;
                if (bl2) return (boolean)gv.gfcc("gfos", gfbz(int ), (int)258);
                if (gv.mc.field_1724.method_7332((boolean)gv.gfcc("gfox", gfbz(int ), (int)263))) break block23;
                if (bl2) return (boolean)gv.gfcc("gfos", gfbz(int ), (int)258);
            }
            if (bl2 || bl2) return (boolean)gv.gfcc("gfos", gfbz(int ), (int)258);
            return (boolean)gv.gfcc("gfoy", gfbz(int ), (int)264);
        }
        if (bl2 || bl2) return (boolean)gv.gfcc("gfos", gfbz(int ), (int)258);
        int n3 = this.findFoodSlot();
        if (bl2 || bl2) return (boolean)gv.gfcc("gfos", gfbz(int ), (int)258);
        if (n3 == gv.gfcc("gfoz", gfbz(int ), (int)265)) {
            if (bl2 || bl2) return (boolean)gv.gfcc("gfos", gfbz(int ), (int)258);
            return (boolean)gv.gfcc("gfpa", gfbz(int ), (int)266);
        }
        if (bl2 || bl2) return (boolean)gv.gfcc("gfos", gfbz(int ), (int)258);
        this.selectInventorySlot(n3);
        if (bl2 || bl2) return (boolean)gv.gfcc("gfos", gfbz(int ), (int)258);
        gv.mc.field_1761.method_2919((class_1657)gv.mc.field_1724, class_1268.field_5808);
        if (bl2 || bl2) return (boolean)gv.gfcc("gfos", gfbz(int ), (int)258);
        gv.mc.field_1690.field_1904.method_23481((boolean)gv.gfcc("gfpb", gfbz(int ), (int)267));
        if (bl2 || bl2) return (boolean)gv.gfcc("gfos", gfbz(int ), (int)258);
        this.autoEating = gv.gfcc("gfpc", gfbz(int ), (int)268);
        if (!bl2 && !bl2) return (boolean)gv.gfcc("gfpd", gfbz(int ), (int)269);
        return (boolean)gv.gfcc("gfos", gfbz(int ), (int)258);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean handleAutoLeave() {
        block83: {
            block82: {
                var5_1 = gv.c;
                var4_2 /* !! */  = gv.b;
                var3_3 = gv.a;
                if (var5_1) {
                    throw null;
lbl6:
                    // 21 sources

                    return (boolean)gv.gfcc("gfjk", gfbz(int ), (int)141);
                }
                if (var3_3 || var3_3) ** GOTO lbl6
                if (!this.autoLeave.isValue()) break block82;
                if (var3_3) ** GOTO lbl6
                if (this.leaveTimer.finished((double)gv.gfcc("gfjm", gfjl(int ), (int)44))) break block83;
                if (var3_3) ** GOTO lbl6
            }
            if (var3_3 || var3_3) ** GOTO lbl6
            return (boolean)gv.gfcc("gfjn", gfbz(int ), (int)142);
        }
        if (var3_3 || var3_3) ** GOTO lbl6
        var1_4 = gv.mc.field_1687.method_18456().iterator();
        if (var3_3) ** GOTO lbl6
        block44: while (true) {
            block84: {
                if (var3_3 || var3_3) ** GOTO lbl6
                if (!var1_4.hasNext()) ** GOTO lbl56
                if (var3_3) ** GOTO lbl6
                var2_5 = (class_1657)var1_4.next();
                if (var3_3 || var3_3) ** GOTO lbl6
                if (var2_5 == gv.mc.field_1724) continue;
                if (var3_3) ** GOTO lbl6
                if (!dl.isFriend((class_1297)var2_5)) break block84;
                if (var3_3 || var3_3) ** GOTO lbl6
                if (!var5_1) continue;
                throw null;
            }
            if (var3_3 || var3_3) ** GOTO lbl6
            if (!(gv.mc.field_1724.method_5739((class_1297)var2_5) <= this.leaveRadius.getValue())) ** GOTO lbl52
            if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var4_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var3_3 || var3_3) ** GOTO lbl6
                    gv.mc.method_1562().method_45730("hub");
                    if (var3_3 || var3_3) ** GOTO lbl6
                    this.stopBaritone();
                    if (var3_3 || var3_3) ** GOTO lbl6
                    CompletableFuture.delayedExecutor((long)gv.gfcc("gfjo", gfdd(int ), (int)45), TimeUnit.MILLISECONDS).execute((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$handleAutoLeave$0(), ()V)((gv)this));
                    if (var3_3 || var3_3) ** GOTO lbl6
                    this.targetMinecart = null;
                    if (var3_3 || var3_3) ** GOTO lbl6
                    this.currentPathKey = null;
                    if (var3_3 || var3_3) ** GOTO lbl6
                    this.leaveTimer.reset();
                    if (var3_3 || var3_3) ** GOTO lbl6
                    return (boolean)gv.gfcc("gfjp", gfbz(int ), (int)143);
                }
lbl52:
                // 1 sources

                if (var3_3 || var3_3) ** GOTO lbl6
                if (var5_1) ** break;
                continue block44;
                throw null;
lbl56:
                // 1 sources

                if (!var3_3 && !var3_3) ** break;
                ** continue;
                return (boolean)gv.gfcc("gfjq", gfbz(int ), (int)144);
lbl59:
                // 2 sources

                case 0: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfjr", gfbz(int ), (int)145);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl173
                }
lbl64:
                // 2 sources

                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var4_2 /* !! */  = (int)gv.gfcc("gfjs", gfbz(int ), (int)146);
                        if (var5_1) {
                            throw null;
                        }
                        ** GOTO lbl145
                        break;
                    }
                }
lbl70:
                // 2 sources

                case 2: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfjt", gfbz(int ), (int)147);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl168
                }
lbl75:
                // 3 sources

                case 3: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfju", gfbz(int ), (int)148);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl85
                }
lbl80:
                // 2 sources

                case 4: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfjv", gfbz(int ), (int)149);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl204
                }
lbl85:
                // 2 sources

                case 5: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfjw", gfbz(int ), (int)150);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl141
                }
                case 6: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfjx", gfbz(int ), (int)151);
                    if (!var5_1) ** GOTO lbl59
                    throw null;
                }
lbl94:
                // 2 sources

                case 7: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfjy", gfbz(int ), (int)152);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl118
                }
lbl99:
                // 3 sources

                case 8: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfjz", gfbz(int ), (int)153);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl212
                }
                case 9: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfka", gfbz(int ), (int)154);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl159
                }
                case 10: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfkb", gfbz(int ), (int)155);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl118
                }
lbl114:
                // 2 sources

                case 11: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfkc", gfbz(int ), (int)156);
                    if (!var5_1) ** GOTO lbl80
                    throw null;
                }
lbl118:
                // 3 sources

                case 12: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfkd", gfbz(int ), (int)157);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl200
                }
lbl123:
                // 2 sources

                case 13: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfke", gfbz(int ), (int)158);
                    if (!var5_1) ** GOTO lbl94
                    throw null;
                }
                case 14: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfkf", gfbz(int ), (int)159);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl182
                }
                case 15: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfkg", gfbz(int ), (int)160);
                    if (!var5_1) ** GOTO lbl99
                    throw null;
                }
                case 16: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfkh", gfbz(int ), (int)161);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl236
                }
lbl141:
                // 2 sources

                case 17: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfki", gfbz(int ), (int)162);
                    if (!var5_1) ** GOTO lbl114
                    throw null;
                }
lbl145:
                // 2 sources

                case 18: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfkj", gfbz(int ), (int)163);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl164
                }
lbl150:
                // 2 sources

                case 19: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfkk", gfbz(int ), (int)164);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl200
                }
                case 20: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfkl", gfbz(int ), (int)165);
                    if (!var5_1) ** GOTO lbl123
                    throw null;
                }
lbl159:
                // 2 sources

                case 21: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfkm", gfbz(int ), (int)166);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl196
                }
lbl164:
                // 2 sources

                case 22: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfkn", gfbz(int ), (int)167);
                    if (!var5_1) ** GOTO lbl150
                    throw null;
                }
lbl168:
                // 2 sources

                case 23: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfko", gfbz(int ), (int)168);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl182
                }
lbl173:
                // 2 sources

                case 24: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfkp", gfbz(int ), (int)169);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl182
                }
                case 25: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfkq", gfbz(int ), (int)170);
                    if (!var5_1) ** GOTO lbl70
                    throw null;
                }
lbl182:
                // 7 sources

                case 26: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfkr", gfbz(int ), (int)171);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl236
                }
lbl187:
                // 2 sources

                case 27: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfks", gfbz(int ), (int)172);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl224
                }
lbl192:
                // 2 sources

                case 28: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfkt", gfbz(int ), (int)173);
                    if (!var5_1) ** GOTO lbl182
                    throw null;
                }
lbl196:
                // 2 sources

                case 29: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfku", gfbz(int ), (int)174);
                    if (!var5_1) ** GOTO lbl99
                    throw null;
                }
lbl200:
                // 4 sources

                case 30: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfkv", gfbz(int ), (int)175);
                    if (!var5_1) ** GOTO lbl64
                    throw null;
                }
lbl204:
                // 2 sources

                case 31: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfkw", gfbz(int ), (int)176);
                    if (!var5_1) ** GOTO lbl192
                    throw null;
                }
                case 32: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfkx", gfbz(int ), (int)177);
                    if (!var5_1) ** GOTO lbl75
                    throw null;
                }
lbl212:
                // 2 sources

                case 33: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfky", gfbz(int ), (int)178);
                    if (!var5_1) ** GOTO lbl200
                    throw null;
                }
                case 34: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfkz", gfbz(int ), (int)179);
                    if (!var5_1) ** GOTO lbl75
                    throw null;
                }
                case 35: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfla", gfbz(int ), (int)180);
                    if (!var5_1) ** GOTO lbl187
                    throw null;
                }
lbl224:
                // 4 sources

                case 36: {
                    var4_2 /* !! */  = (int)gv.gfcc("gflb", gfbz(int ), (int)181);
                    if (!var5_1) ** GOTO lbl182
                    throw null;
                }
                case 37: {
                    var4_2 /* !! */  = (int)gv.gfcc("gflc", gfbz(int ), (int)182);
                    if (!var5_1) ** GOTO lbl224
                    throw null;
                }
                case 38: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfld", gfbz(int ), (int)183);
                    if (!var5_1) ** GOTO lbl182
                    throw null;
                }
lbl236:
                // 3 sources

                case 39: {
                    var4_2 /* !! */  = (int)gv.gfcc("gfle", gfbz(int ), (int)184);
                    if (!var5_1) ** GOTO lbl224
                    throw null;
                }
                case 40: 
            }
            break;
        }
        var4_2 /* !! */  = (int)gv.gfcc("gflf", gfbz(int ), (int)185);
        ** while (!var5_1)
lbl243:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gqob() {
        gv.gfdf[400] = 4559166714884533765L;
        gv.gfdf[401] = 4293236410127253678L;
        gv.gfdf[402] = -7036196803408573892L;
        gv.gfdf[403] = 5014729489090500376L;
        gv.gfdf[404] = -1140168224489911643L;
        gv.gfdf[405] = 6603070297416608557L;
        gv.gfdf[406] = -1937375284590101825L;
        gv.gfdf[407] = 4487364167777108444L;
        gv.gfdf[408] = 6131468717802399932L;
        gv.gfdf[409] = 49700459400766517L;
        gv.gfdf[410] = 5031092399951736618L;
        gv.gfdf[411] = 854599816241315900L;
        gv.gfdf[412] = -2730222963557132385L;
        gv.gfdf[413] = 8451907925729280458L;
        gv.gfdf[414] = 5085107671340993810L;
        gv.gfdf[415] = 8399729213891197562L;
        gv.gfdf[416] = 3311749642574734716L;
        gv.gfdf[417] = -4299187015313263109L;
        gv.gfdf[418] = -4542614453716117656L;
        gv.gfdf[419] = 7561048965879555106L;
        gv.gfdf[420] = 16935378652430262L;
        gv.gfdf[421] = -1350574035540271184L;
        gv.gfdf[422] = -419436808791373573L;
        gv.gfdf[423] = -518192120402007452L;
        gv.gfdf[424] = -1678972350263341244L;
        gv.gfdf[425] = 8082148601376962770L;
        gv.gfdf[426] = -4782276953488967035L;
        gv.gfdf[427] = -7268871148813163291L;
        gv.gfdf[428] = -24872568441080283L;
        gv.gfdf[429] = -7548095027089566139L;
        gv.gfdf[430] = -2403044092168102311L;
        gv.gfdf[431] = -8582128521604099922L;
        gv.gfdf[432] = -7245721967451267845L;
        gv.gfdf[433] = 3909120981900430773L;
        gv.gfdf[434] = -3390554292681048814L;
        gv.gfdf[435] = 5338466159419103273L;
        gv.gfdf[436] = 5566964904962639997L;
        gv.gfdf[437] = 6023125433480101546L;
        gv.gfdf[438] = -6072530275076391856L;
        gv.gfdf[439] = 5398877533031007384L;
        gv.gfdf[440] = 5407055952000440903L;
        gv.gfdf[441] = 4611412524233015696L;
        gv.gfdf[442] = 6317322669823110095L;
        gv.gfdf[443] = 4480546195753798529L;
        gv.gfdf[444] = 5384090774712338758L;
        gv.gfdf[445] = 3944299133716412841L;
        gv.gfdf[446] = -4598660698225497189L;
        gv.gfdf[447] = 1900390583961919979L;
        gv.gfdf[448] = 653026753179232032L;
        gv.gfdf[449] = 2650932006302282721L;
        gv.gfdf[450] = 4218448445158540056L;
        gv.gfdf[451] = 7454544963019068204L;
        gv.gfdf[452] = -489899455330962035L;
        gv.gfdf[453] = 5300374279939220281L;
        gv.gfdf[454] = 2456466203288261985L;
        gv.gfdf[455] = -3268156291320243817L;
        gv.gfdf[456] = 6895996917931600687L;
        gv.gfdf[457] = -3385400150056249416L;
        gv.gfdf[458] = 8931190006421056178L;
        gv.gfdf[459] = -4837307642190242200L;
        gv.gfdf[460] = -3314463105500780174L;
        gv.gfdf[461] = -2099807049369451105L;
        gv.gfdf[462] = 8946573648441836478L;
        gv.gfdf[463] = -6887875547615894806L;
        gv.gfdf[464] = 4961002384261941475L;
        gv.gfdf[465] = 4087717782813658715L;
        gv.gfdf[466] = 6695487829280276111L;
        gv.gfdf[467] = 6783937949656025574L;
        gv.gfdf[468] = -7410691182271319880L;
        gv.gfdf[469] = -7370051845638875639L;
        gv.gfdf[470] = -7511976106779227876L;
        gv.gfdf[471] = 6482170045538464051L;
        gv.gfdf[472] = 8297102789753704328L;
        gv.gfdf[473] = -1965226485521429531L;
        gv.gfdf[474] = 9088112190108238032L;
        gv.gfdf[475] = -5281418801705673570L;
        gv.gfdf[476] = -4860067906823700053L;
        gv.gfdf[477] = 8599081320844133647L;
        gv.gfdf[478] = 5576733597429621831L;
        gv.gfdf[479] = -1152088015566203890L;
        gv.gfdf[480] = -8311219855778778071L;
        gv.gfdf[481] = 8000144816033199940L;
        gv.gfdf[482] = 3904135161265908418L;
        gv.gfdf[483] = 7378982110649453368L;
        gv.gfdf[484] = 1505523386511583992L;
        gv.gfdf[485] = 8630615065769721389L;
        gv.gfdf[486] = -1769946863937610163L;
        gv.gfdf[487] = -7280894691053731712L;
        gv.gfdf[488] = 1932956202588522753L;
        gv.gfdf[489] = -4964548530571209626L;
        gv.gfdf[490] = -3046537489433376061L;
        gv.gfdf[491] = 1480207187969161835L;
        gv.gfdf[492] = -8186573067065603105L;
        gv.gfdf[493] = 8088719507134824242L;
        gv.gfdf[494] = 3850901437597880689L;
        gv.gfdf[495] = -4726655889947754200L;
        gv.gfdf[496] = 6171690471563010418L;
        gv.gfdf[497] = -1533481399887217354L;
        gv.gfdf[498] = 4644880658920278145L;
        gv.gfdf[499] = 6140469484439910374L;
    }

    private static /* synthetic */ void gpxx() {
        gv.gfca[1100] = 1305953824;
        gv.gfca[1101] = -1772403238;
        gv.gfca[1102] = -916243271;
        gv.gfca[1103] = 823188028;
        gv.gfca[1104] = -167317998;
        gv.gfca[1105] = 2004982542;
        gv.gfca[1106] = 1715897583;
        gv.gfca[1107] = -737199467;
        gv.gfca[1108] = 1406371270;
        gv.gfca[1109] = 894899376;
        gv.gfca[1110] = 633048753;
        gv.gfca[1111] = 776422395;
        gv.gfca[1112] = 991645553;
        gv.gfca[1113] = -549824835;
        gv.gfca[1114] = -721138195;
        gv.gfca[1115] = 546139812;
        gv.gfca[1116] = -2092659574;
        gv.gfca[1117] = 1857871245;
        gv.gfca[1118] = 1909053534;
        gv.gfca[1119] = -1728377484;
        gv.gfca[1120] = 1474426958;
        gv.gfca[1121] = 1210198824;
        gv.gfca[1122] = -575933870;
        gv.gfca[1123] = -1041795496;
        gv.gfca[1124] = 1202084392;
        gv.gfca[1125] = -898829678;
        gv.gfca[1126] = 1132778882;
        gv.gfca[1127] = 1865311937;
        gv.gfca[1128] = -865073799;
        gv.gfca[1129] = -2020054554;
        gv.gfca[1130] = -260370713;
        gv.gfca[1131] = -1751613715;
        gv.gfca[1132] = 1595072040;
        gv.gfca[1133] = -2053196526;
        gv.gfca[1134] = 2002862163;
        gv.gfca[1135] = 1182568903;
        gv.gfca[1136] = -1896242987;
        gv.gfca[1137] = -504701851;
        gv.gfca[1138] = 501430984;
        gv.gfca[1139] = 229661843;
        gv.gfca[1140] = 1793177065;
        gv.gfca[1141] = 831997319;
        gv.gfca[1142] = -98052625;
        gv.gfca[1143] = 1141376362;
        gv.gfca[1144] = -1611443880;
        gv.gfca[1145] = -64718984;
        gv.gfca[1146] = 782117619;
        gv.gfca[1147] = -1027341228;
        gv.gfca[1148] = -499078559;
        gv.gfca[1149] = 1222544500;
        gv.gfca[1150] = 2144008790;
        gv.gfca[1151] = 981377084;
        gv.gfca[1152] = -149789847;
        gv.gfca[1153] = -1410462580;
        gv.gfca[1154] = 1347220281;
        gv.gfca[1155] = 2033339359;
        gv.gfca[1156] = -1019640431;
        gv.gfca[1157] = 1703330947;
        gv.gfca[1158] = 1455448199;
        gv.gfca[1159] = 932715335;
        gv.gfca[1160] = 542995887;
        gv.gfca[1161] = 1000242002;
        gv.gfca[1162] = 1008929548;
        gv.gfca[1163] = -1912752973;
        gv.gfca[1164] = -930647898;
        gv.gfca[1165] = 873619165;
        gv.gfca[1166] = -1034662843;
        gv.gfca[1167] = 393738200;
        gv.gfca[1168] = -1600066769;
        gv.gfca[1169] = 1638967701;
        gv.gfca[1170] = 1305956713;
        gv.gfca[1171] = -1926939847;
        gv.gfca[1172] = -1738748853;
        gv.gfca[1173] = -866699797;
        gv.gfca[1174] = 1894387264;
        gv.gfca[1175] = -1727324683;
        gv.gfca[1176] = -1220414833;
        gv.gfca[1177] = 1311368069;
        gv.gfca[1178] = -1843303291;
        gv.gfca[1179] = -2141697175;
        gv.gfca[1180] = 385601938;
        gv.gfca[1181] = 783032462;
        gv.gfca[1182] = 1570640957;
        gv.gfca[1183] = 895070737;
        gv.gfca[1184] = 787195166;
        gv.gfca[1185] = 1552078950;
        gv.gfca[1186] = 1946038500;
        gv.gfca[1187] = -1434454968;
        gv.gfca[1188] = 1882243690;
        gv.gfca[1189] = -280109580;
        gv.gfca[1190] = -1404443181;
        gv.gfca[1191] = -1840609475;
        gv.gfca[1192] = -103995350;
        gv.gfca[1193] = 1628661238;
        gv.gfca[1194] = -1206780996;
        gv.gfca[1195] = 676138591;
        gv.gfca[1196] = 22206922;
        gv.gfca[1197] = 1532158493;
        gv.gfca[1198] = -1477254796;
        gv.gfca[1199] = -848411974;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int findDamagedPickaxeSlot() {
        var8_1 = gv.c;
        var7_2 /* !! */  = gv.b;
        var6_3 = gv.a;
        if (var8_1) {
            throw null;
lbl6:
            // 20 sources

            return (int)gv.gfcc("gksf", gfbz(int ), (int)1210);
        }
        if (var6_3 || var6_3) ** GOTO lbl6
        var1_4 = gv.gfcc("gksh", gfbz(int ), (int)1211);
        if (var6_3 || var6_3) ** GOTO lbl6
        var2_5 /* !! */  = gv.gfcc("gksj", gfbz(int ), (int)1212);
        if (var6_3 || var6_3) ** GOTO lbl6
        var3_6 = gv.gfcc("gksn", gfbz(int ), (int)1213);
        if (var6_3) ** GOTO lbl6
        block39: while (true) {
            if (var6_3 || var6_3) ** GOTO lbl6
            if (var3_6 >= gv.gfcc("gksp", gfbz(int ), (int)1214)) ** GOTO lbl51
            if (var6_3 || var6_3) ** GOTO lbl6
            var4_7 = gv.mc.field_1724.method_31548().method_5438((int)var3_6);
            if (var6_3 || var6_3) ** GOTO lbl6
            if (var4_7.method_7960()) ** GOTO lbl46
            if (var6_3) ** GOTO lbl6
            if (var7_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var7_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (!var4_7.method_31573(class_3489.field_42614)) ** GOTO lbl46
                    if (var6_3) ** GOTO lbl6
                    if (var4_7.method_7963()) ** GOTO lbl33
                    if (var6_3 || var6_3) ** GOTO lbl6
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl46
lbl33:
                    // 1 sources

                    if (var6_3 || var6_3) ** GOTO lbl6
                    var5_8 = var4_7.method_7919();
                    if (var6_3 || var6_3) ** GOTO lbl6
                    if (var5_8 <= 0) ** GOTO lbl46
                    if (var6_3) ** GOTO lbl6
                    if (var5_8 * gv.gfcc("gkst", gfbz(int ), (int)1215) < var4_7.method_7936()) ** GOTO lbl46
                    if (var6_3) ** GOTO lbl6
                    if (var5_8 <= var2_5 /* !! */ ) ** GOTO lbl46
                    if (var6_3 || var6_3) ** GOTO lbl6
                    var2_5 /* !! */  = (CallSite)var5_8;
                    if (var6_3 || var6_3) ** GOTO lbl6
                    var1_4 = var3_6;
                    if (var6_3) ** GOTO lbl6
lbl46:
                    // 7 sources

                    if (var6_3 || var6_3) ** GOTO lbl6
                    ++var3_6;
                    if (var6_3) ** GOTO lbl6
                    if (!var8_1) continue block39;
                    throw null;
                }
lbl51:
                // 1 sources

                if (!var6_3 && !var6_3) ** break;
                ** continue;
                return (int)var1_4;
                case 0: {
                    var7_2 /* !! */  = (int)gv.gfcc("gksw", gfbz(int ), (int)1216);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl88
                }
                case 1: {
                    var7_2 /* !! */  = (int)gv.gfcc("gksx", gfbz(int ), (int)1217);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl160
                }
lbl64:
                // 4 sources

                case 2: {
                    var7_2 /* !! */  = (int)gv.gfcc("gksz", gfbz(int ), (int)1218);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl88
                }
lbl69:
                // 2 sources

                case 3: {
                    var7_2 /* !! */  = (int)gv.gfcc("gkta", gfbz(int ), (int)1219);
                    if (!var8_1) ** GOTO lbl64
                    throw null;
                }
lbl73:
                // 2 sources

                case 4: {
                    var7_2 /* !! */  = (int)gv.gfcc("gktd", gfbz(int ), (int)1220);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl108
                }
                case 5: {
                    var7_2 /* !! */  = (int)gv.gfcc("gkte", gfbz(int ), (int)1221);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl112
                }
                case 6: {
                    var7_2 /* !! */  = (int)gv.gfcc("gktg", gfbz(int ), (int)1222);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl201
                }
lbl88:
                // 3 sources

                case 7: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var7_2 /* !! */  = (int)gv.gfcc("gkth", gfbz(int ), (int)1223);
                        if (var8_1) {
                            throw null;
                        }
                        ** GOTO lbl185
                        break;
                    }
                }
lbl94:
                // 3 sources

                case 8: {
                    var7_2 /* !! */  = (int)gv.gfcc("gktj", gfbz(int ), (int)1224);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl164
                }
lbl99:
                // 2 sources

                case 9: {
                    var7_2 /* !! */  = (int)gv.gfcc("gktk", gfbz(int ), (int)1225);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl160
                }
                case 10: {
                    var7_2 /* !! */  = (int)gv.gfcc("gktm", gfbz(int ), (int)1226);
                    if (!var8_1) ** GOTO lbl64
                    throw null;
                }
lbl108:
                // 3 sources

                case 11: {
                    var7_2 /* !! */  = (int)gv.gfcc("gktp", gfbz(int ), (int)1227);
                    if (!var8_1) break block39;
                    throw null;
                }
lbl112:
                // 3 sources

                case 12: {
                    var7_2 /* !! */  = (int)gv.gfcc("gktx", gfbz(int ), (int)1228);
                    if (!var8_1) ** GOTO lbl108
                    throw null;
                }
                case 13: {
                    var7_2 /* !! */  = (int)gv.gfcc("gkty", gfbz(int ), (int)1229);
                    if (!var8_1) ** GOTO lbl73
                    throw null;
                }
                case 14: {
                    var7_2 /* !! */  = (int)gv.gfcc("gkua", gfbz(int ), (int)1230);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl193
                }
lbl125:
                // 2 sources

                case 15: {
                    var7_2 /* !! */  = (int)gv.gfcc("gkub", gfbz(int ), (int)1231);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl189
                }
                case 16: {
                    var7_2 /* !! */  = (int)gv.gfcc("gkud", gfbz(int ), (int)1232);
                    if (!var8_1) ** GOTO lbl99
                    throw null;
                }
lbl134:
                // 2 sources

                case 17: {
                    var7_2 /* !! */  = (int)gv.gfcc("gkue", gfbz(int ), (int)1233);
                    if (!var8_1) ** GOTO lbl69
                    throw null;
                }
lbl138:
                // 2 sources

                case 18: {
                    var7_2 /* !! */  = (int)gv.gfcc("gkug", gfbz(int ), (int)1234);
                    if (!var8_1) ** GOTO lbl94
                    throw null;
                }
                case 19: {
                    var7_2 /* !! */  = (int)gv.gfcc("gkuh", gfbz(int ), (int)1235);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl197
                }
                case 20: {
                    do {
                        var7_2 /* !! */  = (int)gv.gfcc("gkuj", gfbz(int ), (int)1236);
                    } while (!var8_1);
                    throw null;
                }
lbl152:
                // 2 sources

                case 21: {
                    var7_2 /* !! */  = (int)gv.gfcc("gkun", gfbz(int ), (int)1237);
                    if (!var8_1) ** GOTO lbl125
                    throw null;
                }
                case 22: {
                    var7_2 /* !! */  = (int)gv.gfcc("gkuo", gfbz(int ), (int)1238);
                    if (var8_1) {
                        throw null;
                    }
                }
lbl160:
                // 7 sources

                case 23: {
                    var7_2 /* !! */  = (int)gv.gfcc("gkup", gfbz(int ), (int)1239);
                    if (!var8_1) ** GOTO lbl112
                    throw null;
                }
lbl164:
                // 2 sources

                case 24: {
                    var7_2 /* !! */  = (int)gv.gfcc("gkuq", gfbz(int ), (int)1240);
                    if (!var8_1) ** GOTO lbl134
                    throw null;
                }
                case 25: {
                    var7_2 /* !! */  = (int)gv.gfcc("gkur", gfbz(int ), (int)1241);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl185
                }
lbl173:
                // 3 sources

                case 26: {
                    var7_2 /* !! */  = (int)gv.gfcc("gkus", gfbz(int ), (int)1242);
                    if (!var8_1) ** GOTO lbl152
                    throw null;
                }
lbl177:
                // 2 sources

                case 27: {
                    var7_2 /* !! */  = (int)gv.gfcc("gkvb", gfbz(int ), (int)1243);
                    if (!var8_1) ** GOTO lbl160
                    throw null;
                }
                case 28: {
                    var7_2 /* !! */  = (int)gv.gfcc("gkve", gfbz(int ), (int)1244);
                    if (!var8_1) ** GOTO lbl177
                    throw null;
                }
lbl185:
                // 3 sources

                case 29: {
                    var7_2 /* !! */  = (int)gv.gfcc("gkvg", gfbz(int ), (int)1245);
                    if (!var8_1) ** GOTO lbl160
                    throw null;
                }
lbl189:
                // 2 sources

                case 30: {
                    var7_2 /* !! */  = (int)gv.gfcc("gkvh", gfbz(int ), (int)1246);
                    if (!var8_1) ** GOTO lbl94
                    throw null;
                }
lbl193:
                // 2 sources

                case 31: {
                    var7_2 /* !! */  = (int)gv.gfcc("gkvi", gfbz(int ), (int)1247);
                    if (!var8_1) ** GOTO lbl173
                    throw null;
                }
lbl197:
                // 2 sources

                case 32: {
                    var7_2 /* !! */  = (int)gv.gfcc("gkvj", gfbz(int ), (int)1248);
                    if (!var8_1) ** GOTO lbl138
                    throw null;
                }
lbl201:
                // 2 sources

                case 33: {
                    var7_2 /* !! */  = (int)gv.gfcc("gkvk", gfbz(int ), (int)1249);
                    if (!var8_1) ** GOTO lbl173
                    throw null;
                }
                case 34: {
                    var7_2 /* !! */  = (int)gv.gfcc("gkvs", gfbz(int ), (int)1250);
                    if (!var8_1) ** GOTO lbl64
                    throw null;
                }
                case 35: 
            }
            break;
        }
        var7_2 /* !! */  = (int)gv.gfcc("gkvt", gfbz(int ), (int)1251);
        ** while (!var8_1)
lbl212:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gqko() {
        gv.gfde[100] = -7889030845635201778L;
        gv.gfde[101] = -5554084986762303259L;
        gv.gfde[102] = -3872347667871242082L;
        gv.gfde[103] = 7257994389762568412L;
        gv.gfde[104] = -6662159303304272627L;
        gv.gfde[105] = 5912120588817120944L;
        gv.gfde[106] = 2430130836436411515L;
        gv.gfde[107] = -5820269769231666531L;
        gv.gfde[108] = -5060431523997315206L;
        gv.gfde[109] = 3642791514450720402L;
        gv.gfde[110] = -5582803198666124962L;
        gv.gfde[111] = -5114544131476104564L;
        gv.gfde[112] = 7324593316913631591L;
        gv.gfde[113] = 5582290544840401661L;
        gv.gfde[114] = 6169086164254351620L;
        gv.gfde[115] = -3545189695295176980L;
        gv.gfde[116] = -6757028312786505220L;
        gv.gfde[117] = -6636474383132869168L;
        gv.gfde[118] = 5186299488627638L;
        gv.gfde[119] = -5955121005966301175L;
        gv.gfde[120] = -3694699691120972139L;
        gv.gfde[121] = -4948069686459563084L;
        gv.gfde[122] = -1920713036285514639L;
        gv.gfde[123] = 6228394572899599421L;
        gv.gfde[124] = 3904051001450073188L;
        gv.gfde[125] = -6463277521941150736L;
        gv.gfde[126] = -7049175193134297570L;
        gv.gfde[127] = 1776119641957444415L;
        gv.gfde[128] = 984174612986520081L;
        gv.gfde[129] = 7548900026652441875L;
        gv.gfde[130] = 4482329253625263726L;
        gv.gfde[131] = 7788788233538290612L;
        gv.gfde[132] = -5053686577496299173L;
        gv.gfde[133] = -137455564263202493L;
        gv.gfde[134] = 1131088228473683004L;
        gv.gfde[135] = -6622242673824486914L;
        gv.gfde[136] = -6254053623949512197L;
        gv.gfde[137] = 3587124493538136544L;
        gv.gfde[138] = -3203349399071185514L;
        gv.gfde[139] = 2461703674725917498L;
        gv.gfde[140] = -3014077092535178166L;
        gv.gfde[141] = -8193038887149061945L;
        gv.gfde[142] = -4733622269601642093L;
        gv.gfde[143] = 7730731897723581608L;
        gv.gfde[144] = 116154237978733567L;
        gv.gfde[145] = -1390947204509458196L;
        gv.gfde[146] = -113984453306735573L;
        gv.gfde[147] = -2000181795814621376L;
        gv.gfde[148] = -4369889536605070997L;
        gv.gfde[149] = 5380675475727712690L;
        gv.gfde[150] = -657013677154469110L;
        gv.gfde[151] = -6272364932063326540L;
        gv.gfde[152] = 6129351955897092477L;
        gv.gfde[153] = 3251693027538784116L;
        gv.gfde[154] = -7253833637978914494L;
        gv.gfde[155] = 3048141422627596042L;
        gv.gfde[156] = 729860688001304702L;
        gv.gfde[157] = 3238079340972312841L;
        gv.gfde[158] = 7498544455546702277L;
        gv.gfde[159] = -6239744827424645701L;
        gv.gfde[160] = 422789926574848889L;
        gv.gfde[161] = -1663076145660390455L;
        gv.gfde[162] = -5914664551817211587L;
        gv.gfde[163] = -8968318450543396238L;
        gv.gfde[164] = -6013520684529314006L;
        gv.gfde[165] = 7497321442997283176L;
        gv.gfde[166] = 83066005097312889L;
        gv.gfde[167] = 4837038899008352988L;
        gv.gfde[168] = -1888311522596011295L;
        gv.gfde[169] = 741098138981204865L;
        gv.gfde[170] = 7940714347671227110L;
        gv.gfde[171] = 6218703630833395784L;
        gv.gfde[172] = -544810239061030181L;
        gv.gfde[173] = 8504223205036879805L;
        gv.gfde[174] = -8540601852962155161L;
        gv.gfde[175] = 4527028836164867431L;
        gv.gfde[176] = 4869682706687249537L;
        gv.gfde[177] = 4379050070985867119L;
        gv.gfde[178] = -4874871309036718745L;
        gv.gfde[179] = -97419315862980475L;
        gv.gfde[180] = -2837915569115299057L;
        gv.gfde[181] = -3880844957458625401L;
        gv.gfde[182] = 4771618080141707744L;
        gv.gfde[183] = -4522469730987541444L;
        gv.gfde[184] = -4979248068757137173L;
        gv.gfde[185] = 6500897165540624260L;
        gv.gfde[186] = 1348930384912040539L;
        gv.gfde[187] = 7859780345669180027L;
        gv.gfde[188] = 468069802592414788L;
        gv.gfde[189] = 7269845662111752643L;
        gv.gfde[190] = -4671172717829957588L;
        gv.gfde[191] = 6191464712878430706L;
        gv.gfde[192] = 4755180435175123828L;
        gv.gfde[193] = 4500932004931051661L;
        gv.gfde[194] = 9046045519542097827L;
        gv.gfde[195] = -8011984146311314820L;
        gv.gfde[196] = -5736791958023642099L;
        gv.gfde[197] = 7990032734631633893L;
        gv.gfde[198] = -8691077815413658335L;
        gv.gfde[199] = 2872847332949300893L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void markBlockedMinecart(String var1_1) {
        block111: {
            block110: {
                v0 /* !! */  = gv.nl;
                if (true) ** GOTO lbl5
                block71: while (true) {
                    v0 /* !! */  = (long)(v1 - gv.gfcc("gmwj", gfdd(int ), (int)604));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case 564494588: {
                            v1 = gv.gfcc("gmwk", gfdd(int ), (int)605);
                            continue block71;
                        }
                        case 725807108: {
                            v1 = gv.gfcc("gmwl", gfdd(int ), (int)606);
                            continue block71;
                        }
                        case 1185080505: {
                            break block71;
                        }
                    }
                    break;
                }
                var5_2 = gv.c;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_0 = gv.nl - gv.gfcc("gmwm", gfdd(int ), (int)607)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == gv.gfcc("gmwn", gfbz(int ), (int)1464)) break;
                    v2 /* !! */  = (long)gv.gfcc("gmwo", gfbz(int ), (int)1465);
                }
                var4_3 /* !! */  = gv.b;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = gv.nl - gv.gfcc("gmwp", gfdd(int ), (int)608)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == gv.gfcc("gmwq", gfbz(int ), (int)1466)) break;
                    v3 /* !! */  = (long)gv.gfcc("gmwr", gfbz(int ), (int)1467);
                }
                var3_4 = gv.a;
                if (var5_2) {
                    throw null;
lbl31:
                    // 13 sources

                    return;
                }
                if (var3_4 || var3_4) ** GOTO lbl31
                if (var1_1 == null) break block110;
                if (var3_4) ** GOTO lbl31
                v4 /* !! */  = gv.nl;
                if (true) ** GOTO lbl40
                block75: while (true) {
                    v4 /* !! */  = (long)(v5 - gv.gfcc("gmws", gfdd(int ), (int)609));
lbl40:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -60037810: {
                            v5 = gv.gfcc("gmwt", gfdd(int ), (int)610);
                            continue block75;
                        }
                        case 572506953: {
                            v5 = gv.gfcc("gmwu", gfdd(int ), (int)611);
                            continue block75;
                        }
                        case 781301984: {
                            v5 = gv.gfcc("gmwv", gfdd(int ), (int)612);
                            continue block75;
                        }
                        case 1185080505: {
                            break block75;
                        }
                    }
                    break;
                }
                if (!var1_1.isBlank()) break block111;
                if (var3_4) ** GOTO lbl31
            }
            if (var3_4 || var3_4) ** GOTO lbl31
            return;
        }
        if (var3_4 || var3_4) ** GOTO lbl31
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = gv.nl - gv.gfcc("gmwy", gfdd(int ), (int)613)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v6 /* !! */  == gv.gfcc("gmwz", gfbz(int ), (int)1468)) break;
            v6 /* !! */  = (long)gv.gfcc("gmxb", gfbz(int ), (int)1469);
        }
        v7 /* !! */  = gv.nl;
        if (true) ** GOTO lbl69
        block77: while (true) {
            v7 /* !! */  = (long)(v8 - gv.gfcc("gmxd", gfdd(int ), (int)614));
lbl69:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -91535497: {
                    v8 = gv.gfcc("gmxe", gfdd(int ), (int)615);
                    continue block77;
                }
                case 1102235471: {
                    v8 = gv.gfcc("gmxg", gfdd(int ), (int)616);
                    continue block77;
                }
                case 1185080505: {
                    break block77;
                }
            }
            break;
        }
        this.sessionLootedMinecarts.add(var1_1);
        if (var3_4 || var3_4) ** GOTO lbl31
        v9 /* !! */  = gv.nl;
        if (true) ** GOTO lbl85
        block78: while (true) {
            v9 /* !! */  = (long)(gv.gfcc("gmxk", gfdd(int ), (int)618) - gv.gfcc("gmxi", gfdd(int ), (int)617));
lbl85:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -1321759796: {
                    continue block78;
                }
                case 1185080505: {
                    break block78;
                }
            }
            break;
        }
        v10 /* !! */  = gv.nl;
        if (true) ** GOTO lbl94
        block79: while (true) {
            v10 /* !! */  = (long)(v11 - gv.gfcc("gmxl", gfdd(int ), (int)619));
lbl94:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1946552329: {
                    v11 = gv.gfcc("gmxn", gfdd(int ), (int)620);
                    continue block79;
                }
                case -1685082538: {
                    v11 = gv.gfcc("gmxp", gfdd(int ), (int)621);
                    continue block79;
                }
                case 1185080505: {
                    break block79;
                }
            }
            break;
        }
        this.foundLootByMinecart.remove(var1_1);
        if (var3_4 || var3_4) ** GOTO lbl31
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_3 = gv.nl - gv.gfcc("gmxr", gfdd(int ), (int)622)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v12 /* !! */  == gv.gfcc("gmxt", gfbz(int ), (int)1470)) break;
            v12 /* !! */  = (long)gv.gfcc("gmxv", gfbz(int ), (int)1471);
        }
        v13 /* !! */  = gv.nl;
        if (true) ** GOTO lbl116
        block81: while (true) {
            v13 /* !! */  = (long)(gv.gfcc("gmxy", gfdd(int ), (int)624) - gv.gfcc("gmxx", gfdd(int ), (int)623));
lbl116:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case 728869920: {
                    continue block81;
                }
                case 1185080505: {
                    break block81;
                }
            }
            break;
        }
        v14 = (Predicate<String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$markBlockedMinecart$3(java.lang.String java.lang.String ), (Ljava/lang/String;)Z)((gv)this, (String)var1_1);
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_4 = gv.nl - gv.gfcc("gmxz", gfdd(int ), (int)625)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v15 /* !! */  == gv.gfcc("gmya", gfbz(int ), (int)1472)) break;
            v15 /* !! */  = (long)gv.gfcc("gmyb", gfbz(int ), (int)1473);
        }
        var2_5 = this.rememberedMinecarts.removeIf(v14);
        if (var3_4 || var3_4) ** GOTO lbl31
        v16 /* !! */  = gv.nl;
        if (true) ** GOTO lbl134
        block83: while (true) {
            v16 /* !! */  = (long)(v17 - gv.gfcc("gmyc", gfdd(int ), (int)626));
lbl134:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case -1389984127: {
                    v17 = gv.gfcc("gmye", gfdd(int ), (int)627);
                    continue block83;
                }
                case -1141898156: {
                    v17 = gv.gfcc("gmyi", gfdd(int ), (int)628);
                    continue block83;
                }
                case 1185080505: {
                    break block83;
                }
            }
            break;
        }
        v18 /* !! */  = gv.nl;
        if (true) ** GOTO lbl147
        block84: while (true) {
            v18 /* !! */  = (long)(v19 - gv.gfcc("gmyj", gfdd(int ), (int)629));
lbl147:
            // 2 sources

            switch ((int)v18 /* !! */ ) {
                case -745977033: {
                    v19 = gv.gfcc("gmyl", gfdd(int ), (int)630);
                    continue block84;
                }
                case -98935779: {
                    v19 = gv.gfcc("gmyo", gfdd(int ), (int)631);
                    continue block84;
                }
                case 1185080505: {
                    break block84;
                }
            }
            break;
        }
        if (this.rememberedMinecarts.add(var1_1)) ** GOTO lbl163
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4) ** GOTO lbl31
                if (!var2_5) ** GOTO lbl182
                if (var3_4) ** GOTO lbl31
lbl163:
                // 2 sources

                if (var3_4 || var3_4) ** GOTO lbl31
                v20 /* !! */  = gv.nl;
                if (true) ** GOTO lbl168
                block85: while (true) {
                    v20 /* !! */  = (long)(v21 - gv.gfcc("gmys", gfdd(int ), (int)632));
lbl168:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -857967969: {
                            v21 = gv.gfcc("gmyu", gfdd(int ), (int)633);
                            continue block85;
                        }
                        case -423751843: {
                            v21 = gv.gfcc("gmyz", gfdd(int ), (int)634);
                            continue block85;
                        }
                        case -52466307: {
                            v21 = gv.gfcc("gmzb", gfdd(int ), (int)635);
                            continue block85;
                        }
                        case 1185080505: {
                            break block85;
                        }
                    }
                    break;
                }
                this.saveRememberedMinecarts();
                if (var3_4) ** GOTO lbl31
lbl182:
                // 2 sources

                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return;
            }
lbl185:
            // 3 sources

            case 0: {
                var4_3 /* !! */  = (int)gv.gfcc("gmzd", gfbz(int ), (int)1474);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl231
            }
            case 1: {
                var4_3 /* !! */  = (int)gv.gfcc("gmze", gfbz(int ), (int)1475);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl252
            }
lbl195:
            // 3 sources

            case 2: {
                var4_3 /* !! */  = (int)gv.gfcc("gmzf", gfbz(int ), (int)1476);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl280
            }
lbl200:
            // 4 sources

            case 3: {
                do {
                    var4_3 /* !! */  = (int)gv.gfcc("gmzg", gfbz(int ), (int)1477);
                } while (!var5_2);
                throw null;
            }
lbl205:
            // 2 sources

            case 4: {
                var4_3 /* !! */  = (int)gv.gfcc("gmzh", gfbz(int ), (int)1478);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl244
            }
lbl210:
            // 2 sources

            case 5: {
                var4_3 /* !! */  = (int)gv.gfcc("gmzm", gfbz(int ), (int)1479);
                if (!var5_2) ** GOTO lbl200
                throw null;
            }
lbl214:
            // 2 sources

            case 6: {
                var4_3 /* !! */  = (int)gv.gfcc("gmzp", gfbz(int ), (int)1480);
                if (!var5_2) ** GOTO lbl200
                throw null;
            }
lbl218:
            // 2 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)gv.gfcc("gmzr", gfbz(int ), (int)1481);
                    if (!var5_2) ** GOTO lbl210
                    throw null;
                }
            }
            case 8: {
                var4_3 /* !! */  = (int)gv.gfcc("gmzs", gfbz(int ), (int)1482);
                if (!var5_2) ** GOTO lbl195
                throw null;
            }
lbl227:
            // 2 sources

            case 9: {
                var4_3 /* !! */  = (int)gv.gfcc("gmzt", gfbz(int ), (int)1483);
                if (!var5_2) ** GOTO lbl218
                throw null;
            }
lbl231:
            // 2 sources

            case 10: {
                var4_3 /* !! */  = (int)gv.gfcc("gmzu", gfbz(int ), (int)1484);
                if (!var5_2) ** GOTO lbl195
                throw null;
            }
lbl235:
            // 3 sources

            case 11: {
                var4_3 /* !! */  = (int)gv.gfcc("gmzv", gfbz(int ), (int)1485);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl256
            }
            case 12: {
                var4_3 /* !! */  = (int)gv.gfcc("gnac", gfbz(int ), (int)1486);
                if (!var5_2) ** GOTO lbl235
                throw null;
            }
lbl244:
            // 3 sources

            case 13: {
                var4_3 /* !! */  = (int)gv.gfcc("gnae", gfbz(int ), (int)1487);
                if (!var5_2) ** GOTO lbl185
                throw null;
            }
lbl248:
            // 3 sources

            case 14: {
                var4_3 /* !! */  = (int)gv.gfcc("gnaf", gfbz(int ), (int)1488);
                if (!var5_2) ** GOTO lbl205
                throw null;
            }
lbl252:
            // 2 sources

            case 15: {
                var4_3 /* !! */  = (int)gv.gfcc("gnag", gfbz(int ), (int)1489);
                if (!var5_2) ** GOTO lbl248
                throw null;
            }
lbl256:
            // 2 sources

            case 16: {
                var4_3 /* !! */  = (int)gv.gfcc("gnah", gfbz(int ), (int)1490);
                if (!var5_2) ** GOTO lbl244
                throw null;
            }
            case 17: {
                var4_3 /* !! */  = (int)gv.gfcc("gnaj", gfbz(int ), (int)1491);
                if (!var5_2) ** GOTO lbl227
                throw null;
            }
            case 18: {
                var4_3 /* !! */  = (int)gv.gfcc("gnam", gfbz(int ), (int)1492);
                if (!var5_2) ** GOTO lbl248
                throw null;
            }
            case 19: {
                var4_3 /* !! */  = (int)gv.gfcc("gnap", gfbz(int ), (int)1493);
                if (!var5_2) ** GOTO lbl185
                throw null;
            }
            case 20: {
                var4_3 /* !! */  = (int)gv.gfcc("gnaq", gfbz(int ), (int)1494);
                if (!var5_2) ** GOTO lbl214
                throw null;
            }
            case 21: {
                var4_3 /* !! */  = (int)gv.gfcc("gnar", gfbz(int ), (int)1495);
                if (!var5_2) ** GOTO lbl235
                throw null;
            }
lbl280:
            // 2 sources

            case 22: {
                var4_3 /* !! */  = (int)gv.gfcc("gnas", gfbz(int ), (int)1496);
                if (!var5_2) ** GOTO lbl200
                throw null;
            }
            case 23: 
        }
        var4_3 /* !! */  = (int)gv.gfcc("gnat", gfbz(int ), (int)1497);
        ** while (!var5_2)
lbl287:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ double gfjl(int n2) {
        return Double.longBitsToDouble(gfde[n2] ^ gfdf[n2]);
    }

    private static /* synthetic */ void gqfs() {
        gv.gfcb[800] = -782196746;
        gv.gfcb[801] = -446375465;
        gv.gfcb[802] = 1353316594;
        gv.gfcb[803] = 94230135;
        gv.gfcb[804] = -2002869475;
        gv.gfcb[805] = 557766833;
        gv.gfcb[806] = -1099763726;
        gv.gfcb[807] = -895336503;
        gv.gfcb[808] = -665478803;
        gv.gfcb[809] = -2078053105;
        gv.gfcb[810] = -337861970;
        gv.gfcb[811] = -290742637;
        gv.gfcb[812] = 1349516943;
        gv.gfcb[813] = -1555130508;
        gv.gfcb[814] = 1827000347;
        gv.gfcb[815] = 1397407634;
        gv.gfcb[816] = -2116469000;
        gv.gfcb[817] = 1935617459;
        gv.gfcb[818] = -1699739064;
        gv.gfcb[819] = -177792427;
        gv.gfcb[820] = 1797017232;
        gv.gfcb[821] = 442783428;
        gv.gfcb[822] = 535685023;
        gv.gfcb[823] = 454878003;
        gv.gfcb[824] = -1459452524;
        gv.gfcb[825] = -1205440549;
        gv.gfcb[826] = 1143768170;
        gv.gfcb[827] = 1242941566;
        gv.gfcb[828] = -1740052548;
        gv.gfcb[829] = 1802546870;
        gv.gfcb[830] = -780855143;
        gv.gfcb[831] = 1116983032;
        gv.gfcb[832] = -834651745;
        gv.gfcb[833] = -241035978;
        gv.gfcb[834] = 608937410;
        gv.gfcb[835] = -2098658939;
        gv.gfcb[836] = -1399945130;
        gv.gfcb[837] = -1289647567;
        gv.gfcb[838] = -2099510936;
        gv.gfcb[839] = 1267591202;
        gv.gfcb[840] = -1903229088;
        gv.gfcb[841] = 2092575622;
        gv.gfcb[842] = -42549377;
        gv.gfcb[843] = 414448149;
        gv.gfcb[844] = 2134337733;
        gv.gfcb[845] = 2023894385;
        gv.gfcb[846] = 1553187119;
        gv.gfcb[847] = -632258714;
        gv.gfcb[848] = 1261966205;
        gv.gfcb[849] = -1287660769;
        gv.gfcb[850] = -2019005480;
        gv.gfcb[851] = 1651479949;
        gv.gfcb[852] = 2122243089;
        gv.gfcb[853] = -320500603;
        gv.gfcb[854] = 679201878;
        gv.gfcb[855] = 40258412;
        gv.gfcb[856] = -1264966782;
        gv.gfcb[857] = 334931308;
        gv.gfcb[858] = 1753426565;
        gv.gfcb[859] = -847902593;
        gv.gfcb[860] = 49578090;
        gv.gfcb[861] = 1064628688;
        gv.gfcb[862] = -1787440889;
        gv.gfcb[863] = -1307118741;
        gv.gfcb[864] = 1475284292;
        gv.gfcb[865] = -1959867563;
        gv.gfcb[866] = 1058367236;
        gv.gfcb[867] = -1947690660;
        gv.gfcb[868] = -1855105471;
        gv.gfcb[869] = 484090664;
        gv.gfcb[870] = 1572059671;
        gv.gfcb[871] = 706337176;
        gv.gfcb[872] = -418126605;
        gv.gfcb[873] = 155215045;
        gv.gfcb[874] = 1660001102;
        gv.gfcb[875] = 883473154;
        gv.gfcb[876] = -1925371763;
        gv.gfcb[877] = 153235387;
        gv.gfcb[878] = 60340074;
        gv.gfcb[879] = 13444500;
        gv.gfcb[880] = -943989652;
        gv.gfcb[881] = 226456137;
        gv.gfcb[882] = -1192958777;
        gv.gfcb[883] = -881089601;
        gv.gfcb[884] = -1366372085;
        gv.gfcb[885] = -665681580;
        gv.gfcb[886] = -1384324996;
        gv.gfcb[887] = 483190207;
        gv.gfcb[888] = 915842509;
        gv.gfcb[889] = -1886676241;
        gv.gfcb[890] = 272624191;
        gv.gfcb[891] = 1237288484;
        gv.gfcb[892] = 1426035633;
        gv.gfcb[893] = -1971497260;
        gv.gfcb[894] = 922954303;
        gv.gfcb[895] = 644961570;
        gv.gfcb[896] = -1595639077;
        gv.gfcb[897] = 622568231;
        gv.gfcb[898] = 1661959326;
        gv.gfcb[899] = 861923739;
    }

    private static /* synthetic */ void gpym() {
        gv.gfca[1200] = 1575182362;
        gv.gfca[1201] = -1402191801;
        gv.gfca[1202] = 511393924;
        gv.gfca[1203] = 998816802;
        gv.gfca[1204] = -446081328;
        gv.gfca[1205] = 1438732174;
        gv.gfca[1206] = -1163811765;
        gv.gfca[1207] = -1203245845;
        gv.gfca[1208] = 911717696;
        gv.gfca[1209] = 723363170;
        gv.gfca[1210] = -910116909;
        gv.gfca[1211] = -2020775177;
        gv.gfca[1212] = -385405443;
        gv.gfca[1213] = 1346535502;
        gv.gfca[1214] = -1814278346;
        gv.gfca[1215] = -1666942667;
        gv.gfca[1216] = -1965116977;
        gv.gfca[1217] = 901103571;
        gv.gfca[1218] = 1584411480;
        gv.gfca[1219] = -144682840;
        gv.gfca[1220] = 78575747;
        gv.gfca[1221] = 1424491842;
        gv.gfca[1222] = -2076352065;
        gv.gfca[1223] = 763240031;
        gv.gfca[1224] = -507300758;
        gv.gfca[1225] = -797748584;
        gv.gfca[1226] = -840018842;
        gv.gfca[1227] = 1367959855;
        gv.gfca[1228] = -1062775964;
        gv.gfca[1229] = -1753958103;
        gv.gfca[1230] = 291940376;
        gv.gfca[1231] = -874117020;
        gv.gfca[1232] = 465990142;
        gv.gfca[1233] = 1634156;
        gv.gfca[1234] = 1489302054;
        gv.gfca[1235] = 466187723;
        gv.gfca[1236] = -2062915896;
        gv.gfca[1237] = 1453121103;
        gv.gfca[1238] = -1749731557;
        gv.gfca[1239] = -612246489;
        gv.gfca[1240] = 2127529256;
        gv.gfca[1241] = 1216380261;
        gv.gfca[1242] = 177587514;
        gv.gfca[1243] = 73618665;
        gv.gfca[1244] = -871497670;
        gv.gfca[1245] = -1598321044;
        gv.gfca[1246] = -355960817;
        gv.gfca[1247] = -146339628;
        gv.gfca[1248] = -2083745968;
        gv.gfca[1249] = -1901523022;
        gv.gfca[1250] = -257513624;
        gv.gfca[1251] = -2062604450;
        gv.gfca[1252] = 1239611365;
        gv.gfca[1253] = -46294727;
        gv.gfca[1254] = 523654667;
        gv.gfca[1255] = 1444407566;
        gv.gfca[1256] = 1827726395;
        gv.gfca[1257] = -1439957390;
        gv.gfca[1258] = 483317729;
        gv.gfca[1259] = -2022535596;
        gv.gfca[1260] = -633005403;
        gv.gfca[1261] = 2062575243;
        gv.gfca[1262] = -2029230512;
        gv.gfca[1263] = -1419393176;
        gv.gfca[1264] = -1691046501;
        gv.gfca[1265] = 1472070248;
        gv.gfca[1266] = 784120119;
        gv.gfca[1267] = -342646813;
        gv.gfca[1268] = -649046713;
        gv.gfca[1269] = 329849183;
        gv.gfca[1270] = -877096667;
        gv.gfca[1271] = -1542917987;
        gv.gfca[1272] = -1209402647;
        gv.gfca[1273] = 2040224529;
        gv.gfca[1274] = 1987068358;
        gv.gfca[1275] = 872952511;
        gv.gfca[1276] = 79962453;
        gv.gfca[1277] = 2088087224;
        gv.gfca[1278] = -1812794340;
        gv.gfca[1279] = 948262970;
        gv.gfca[1280] = -1179285822;
        gv.gfca[1281] = -1173347818;
        gv.gfca[1282] = 1090737086;
        gv.gfca[1283] = 344543655;
        gv.gfca[1284] = 656985646;
        gv.gfca[1285] = -1093973638;
        gv.gfca[1286] = -1883668857;
        gv.gfca[1287] = 2039761358;
        gv.gfca[1288] = 1792102458;
        gv.gfca[1289] = 62777864;
        gv.gfca[1290] = -2078824945;
        gv.gfca[1291] = 1140407677;
        gv.gfca[1292] = 1450946285;
        gv.gfca[1293] = 175384860;
        gv.gfca[1294] = 1168605673;
        gv.gfca[1295] = 353558759;
        gv.gfca[1296] = 558529419;
        gv.gfca[1297] = -846854171;
        gv.gfca[1298] = 1714129758;
        gv.gfca[1299] = -802368614;
    }

    private static /* synthetic */ void gqbs() {
        gv.gfcb[0] = -1678758698;
        gv.gfcb[1] = 1237831581;
        gv.gfcb[2] = 1809030490;
        gv.gfcb[3] = -229163982;
        gv.gfcb[4] = -1836682554;
        gv.gfcb[5] = 1108983408;
        gv.gfcb[6] = 1165245053;
        gv.gfcb[7] = 807664355;
        gv.gfcb[8] = -1892439617;
        gv.gfcb[9] = -1663559856;
        gv.gfcb[10] = -887676142;
        gv.gfcb[11] = -953553366;
        gv.gfcb[12] = 956638900;
        gv.gfcb[13] = 516346289;
        gv.gfcb[14] = 325003861;
        gv.gfcb[15] = -183522373;
        gv.gfcb[16] = -113683329;
        gv.gfcb[17] = 786031214;
        gv.gfcb[18] = 1241788994;
        gv.gfcb[19] = 726177664;
        gv.gfcb[20] = -820166104;
        gv.gfcb[21] = 940304053;
        gv.gfcb[22] = 1723936124;
        gv.gfcb[23] = 1045334444;
        gv.gfcb[24] = -1455533722;
        gv.gfcb[25] = 2054732680;
        gv.gfcb[26] = -1457546766;
        gv.gfcb[27] = 704584132;
        gv.gfcb[28] = 234139777;
        gv.gfcb[29] = 596360173;
        gv.gfcb[30] = 613273371;
        gv.gfcb[31] = 146223507;
        gv.gfcb[32] = -1415405972;
        gv.gfcb[33] = -742370698;
        gv.gfcb[34] = -1089947970;
        gv.gfcb[35] = 20339736;
        gv.gfcb[36] = -1953089937;
        gv.gfcb[37] = 234574655;
        gv.gfcb[38] = -1634939109;
        gv.gfcb[39] = -1872449847;
        gv.gfcb[40] = 1649827563;
        gv.gfcb[41] = 1621744690;
        gv.gfcb[42] = 416273472;
        gv.gfcb[43] = 1459389613;
        gv.gfcb[44] = -488926109;
        gv.gfcb[45] = 717797948;
        gv.gfcb[46] = 1715828774;
        gv.gfcb[47] = 481129538;
        gv.gfcb[48] = -1059130399;
        gv.gfcb[49] = -39862804;
        gv.gfcb[50] = -315380627;
        gv.gfcb[51] = 1190292558;
        gv.gfcb[52] = -68885938;
        gv.gfcb[53] = -1119122314;
        gv.gfcb[54] = -861064779;
        gv.gfcb[55] = -1304581151;
        gv.gfcb[56] = -1484817479;
        gv.gfcb[57] = 1403513857;
        gv.gfcb[58] = -1954190758;
        gv.gfcb[59] = 854404272;
        gv.gfcb[60] = 734504300;
        gv.gfcb[61] = 1462296528;
        gv.gfcb[62] = -222777073;
        gv.gfcb[63] = -236300874;
        gv.gfcb[64] = 1035403946;
        gv.gfcb[65] = 682553612;
        gv.gfcb[66] = -1233836165;
        gv.gfcb[67] = 731152968;
        gv.gfcb[68] = -1127256008;
        gv.gfcb[69] = 578772471;
        gv.gfcb[70] = 203392864;
        gv.gfcb[71] = 1759798885;
        gv.gfcb[72] = 683684895;
        gv.gfcb[73] = 422807655;
        gv.gfcb[74] = 410083838;
        gv.gfcb[75] = -1217338286;
        gv.gfcb[76] = 264758704;
        gv.gfcb[77] = -1383311503;
        gv.gfcb[78] = -634293831;
        gv.gfcb[79] = -1368184986;
        gv.gfcb[80] = 1962824136;
        gv.gfcb[81] = -1548910493;
        gv.gfcb[82] = 1793909241;
        gv.gfcb[83] = 1920014370;
        gv.gfcb[84] = -559816875;
        gv.gfcb[85] = -1542460680;
        gv.gfcb[86] = 1679995217;
        gv.gfcb[87] = 1947368836;
        gv.gfcb[88] = -1539819496;
        gv.gfcb[89] = 1673110726;
        gv.gfcb[90] = 1254134242;
        gv.gfcb[91] = -99197028;
        gv.gfcb[92] = 1527396780;
        gv.gfcb[93] = -683862022;
        gv.gfcb[94] = 383970305;
        gv.gfcb[95] = 396590943;
        gv.gfcb[96] = 1367306950;
        gv.gfcb[97] = 1575516488;
        gv.gfcb[98] = 683665175;
        gv.gfcb[99] = 143128506;
    }

    private static /* synthetic */ void gqiu() {
        gv.gfcb[1500] = 538691989;
        gv.gfcb[1501] = -1388434393;
        gv.gfcb[1502] = -395932143;
        gv.gfcb[1503] = 1341638930;
        gv.gfcb[1504] = 1827037386;
        gv.gfcb[1505] = -1849020064;
        gv.gfcb[1506] = -583205175;
        gv.gfcb[1507] = -1424301467;
        gv.gfcb[1508] = 637045242;
        gv.gfcb[1509] = 1256909755;
        gv.gfcb[1510] = -1662672188;
        gv.gfcb[1511] = -1638715225;
        gv.gfcb[1512] = 860780734;
        gv.gfcb[1513] = -160351147;
        gv.gfcb[1514] = 1457680815;
        gv.gfcb[1515] = 282723917;
        gv.gfcb[1516] = 331051154;
        gv.gfcb[1517] = 86320169;
        gv.gfcb[1518] = 237661606;
        gv.gfcb[1519] = 513299700;
        gv.gfcb[1520] = -1430998489;
        gv.gfcb[1521] = 2063716293;
        gv.gfcb[1522] = -1184202392;
        gv.gfcb[1523] = 520681413;
        gv.gfcb[1524] = 422694278;
        gv.gfcb[1525] = -1678425333;
        gv.gfcb[1526] = 161025379;
        gv.gfcb[1527] = -3181996;
        gv.gfcb[1528] = -260910871;
        gv.gfcb[1529] = -855460610;
        gv.gfcb[1530] = 1447255327;
        gv.gfcb[1531] = 1330250601;
        gv.gfcb[1532] = -10103383;
        gv.gfcb[1533] = 1107895497;
        gv.gfcb[1534] = -1499151303;
        gv.gfcb[1535] = 1850424352;
        gv.gfcb[1536] = 801096996;
        gv.gfcb[1537] = 32345208;
        gv.gfcb[1538] = 1869054883;
        gv.gfcb[1539] = -1497827008;
        gv.gfcb[1540] = -1066653362;
        gv.gfcb[1541] = -590375373;
        gv.gfcb[1542] = 474266650;
        gv.gfcb[1543] = -326668766;
        gv.gfcb[1544] = -470284345;
        gv.gfcb[1545] = -1005814421;
        gv.gfcb[1546] = 2030536091;
        gv.gfcb[1547] = -1621908706;
        gv.gfcb[1548] = -1532255577;
        gv.gfcb[1549] = 862531101;
        gv.gfcb[1550] = 812528436;
        gv.gfcb[1551] = 95944843;
        gv.gfcb[1552] = -1565393466;
        gv.gfcb[1553] = -504286050;
        gv.gfcb[1554] = -366384992;
        gv.gfcb[1555] = -21582852;
        gv.gfcb[1556] = -506664277;
        gv.gfcb[1557] = 1243868062;
        gv.gfcb[1558] = -339134592;
        gv.gfcb[1559] = -1424214298;
        gv.gfcb[1560] = -1582241324;
        gv.gfcb[1561] = 1140962348;
        gv.gfcb[1562] = -710518754;
        gv.gfcb[1563] = 102756059;
        gv.gfcb[1564] = -979600527;
        gv.gfcb[1565] = -1405265796;
        gv.gfcb[1566] = -1783874145;
        gv.gfcb[1567] = 1246780828;
        gv.gfcb[1568] = -92293021;
        gv.gfcb[1569] = 227443212;
        gv.gfcb[1570] = -916357813;
        gv.gfcb[1571] = -1178919177;
        gv.gfcb[1572] = 1383835600;
        gv.gfcb[1573] = 346936605;
        gv.gfcb[1574] = -1506861847;
        gv.gfcb[1575] = -1114818677;
        gv.gfcb[1576] = 1010166893;
        gv.gfcb[1577] = 1291574847;
        gv.gfcb[1578] = 807856312;
        gv.gfcb[1579] = -1078252587;
        gv.gfcb[1580] = 1045912641;
        gv.gfcb[1581] = -260876073;
        gv.gfcb[1582] = 48394510;
        gv.gfcb[1583] = 995962482;
        gv.gfcb[1584] = 410584099;
        gv.gfcb[1585] = -365517929;
        gv.gfcb[1586] = 150851419;
        gv.gfcb[1587] = 1084660432;
        gv.gfcb[1588] = -2119098792;
        gv.gfcb[1589] = 895229015;
        gv.gfcb[1590] = -217368729;
        gv.gfcb[1591] = -775035096;
        gv.gfcb[1592] = -1079619711;
        gv.gfcb[1593] = 1392764203;
        gv.gfcb[1594] = 341301470;
        gv.gfcb[1595] = 456695711;
        gv.gfcb[1596] = -1821054171;
        gv.gfcb[1597] = 1344812859;
        gv.gfcb[1598] = -1464565756;
        gv.gfcb[1599] = -1671358753;
    }

    private static /* synthetic */ void gqhd() {
        gv.gfcb[1100] = 1305953840;
        gv.gfcb[1101] = -1772403241;
        gv.gfcb[1102] = -916243287;
        gv.gfcb[1103] = 823188029;
        gv.gfcb[1104] = -167318016;
        gv.gfcb[1105] = 2004982556;
        gv.gfcb[1106] = 1715897578;
        gv.gfcb[1107] = -737199470;
        gv.gfcb[1108] = 1406371274;
        gv.gfcb[1109] = 894899362;
        gv.gfcb[1110] = 633048767;
        gv.gfcb[1111] = 776422394;
        gv.gfcb[1112] = -1088059763;
        gv.gfcb[1113] = -549824836;
        gv.gfcb[1114] = 1118044170;
        gv.gfcb[1115] = 546139813;
        gv.gfcb[1116] = -2092659573;
        gv.gfcb[1117] = -2070946552;
        gv.gfcb[1118] = -1909053535;
        gv.gfcb[1119] = -1482199591;
        gv.gfcb[1120] = -1474426959;
        gv.gfcb[1121] = -71783155;
        gv.gfcb[1122] = -575933869;
        gv.gfcb[1123] = 1238315259;
        gv.gfcb[1124] = 1202084393;
        gv.gfcb[1125] = -719336518;
        gv.gfcb[1126] = -1132778883;
        gv.gfcb[1127] = -1974057801;
        gv.gfcb[1128] = 865073798;
        gv.gfcb[1129] = -1073737110;
        gv.gfcb[1130] = -260370714;
        gv.gfcb[1131] = -1751613715;
        gv.gfcb[1132] = 1595072046;
        gv.gfcb[1133] = -2053196517;
        gv.gfcb[1134] = 2002862164;
        gv.gfcb[1135] = 1182568899;
        gv.gfcb[1136] = -1896242979;
        gv.gfcb[1137] = -504701856;
        gv.gfcb[1138] = 501430985;
        gv.gfcb[1139] = 229661851;
        gv.gfcb[1140] = 1793177066;
        gv.gfcb[1141] = 831997313;
        gv.gfcb[1142] = 98052624;
        gv.gfcb[1143] = 628279321;
        gv.gfcb[1144] = -1611443879;
        gv.gfcb[1145] = 64718983;
        gv.gfcb[1146] = 1158012151;
        gv.gfcb[1147] = 1027341227;
        gv.gfcb[1148] = 880497884;
        gv.gfcb[1149] = 1222544501;
        gv.gfcb[1150] = -1455565721;
        gv.gfcb[1151] = 981377085;
        gv.gfcb[1152] = -149789847;
        gv.gfcb[1153] = -1410462581;
        gv.gfcb[1154] = 1347220286;
        gv.gfcb[1155] = 2033339359;
        gv.gfcb[1156] = -1019640419;
        gv.gfcb[1157] = 1703330951;
        gv.gfcb[1158] = 1455448205;
        gv.gfcb[1159] = 932715351;
        gv.gfcb[1160] = 542995875;
        gv.gfcb[1161] = 1000242013;
        gv.gfcb[1162] = 1008929542;
        gv.gfcb[1163] = -1912752973;
        gv.gfcb[1164] = -930647895;
        gv.gfcb[1165] = 873619153;
        gv.gfcb[1166] = -1034662841;
        gv.gfcb[1167] = 393738198;
        gv.gfcb[1168] = -1600066777;
        gv.gfcb[1169] = 1638967708;
        gv.gfcb[1170] = 1305956712;
        gv.gfcb[1171] = 274215843;
        gv.gfcb[1172] = -1738748854;
        gv.gfcb[1173] = 1585729900;
        gv.gfcb[1174] = 1894387265;
        gv.gfcb[1175] = -1418545459;
        gv.gfcb[1176] = 1740511566;
        gv.gfcb[1177] = 1311368069;
        gv.gfcb[1178] = -1843303263;
        gv.gfcb[1179] = 2141697174;
        gv.gfcb[1180] = 861161866;
        gv.gfcb[1181] = -783032463;
        gv.gfcb[1182] = -764051509;
        gv.gfcb[1183] = 895070736;
        gv.gfcb[1184] = -1812911;
        gv.gfcb[1185] = -1552078951;
        gv.gfcb[1186] = -1580963729;
        gv.gfcb[1187] = 1434454967;
        gv.gfcb[1188] = 1944856651;
        gv.gfcb[1189] = 280109579;
        gv.gfcb[1190] = -1404443172;
        gv.gfcb[1191] = -1840609491;
        gv.gfcb[1192] = -103995352;
        gv.gfcb[1193] = 1628661239;
        gv.gfcb[1194] = -1206781009;
        gv.gfcb[1195] = 676138575;
        gv.gfcb[1196] = 22206919;
        gv.gfcb[1197] = 1532158491;
        gv.gfcb[1198] = -1477254795;
        gv.gfcb[1199] = -848411981;
    }

    private static /* synthetic */ void gpwk() {
        gv.gfca[800] = -782196750;
        gv.gfca[801] = -446375470;
        gv.gfca[802] = 1353316604;
        gv.gfca[803] = 94230519;
        gv.gfca[804] = -2002869603;
        gv.gfca[805] = 557766787;
        gv.gfca[806] = -1099763790;
        gv.gfca[807] = -895336567;
        gv.gfca[808] = -665478867;
        gv.gfca[809] = -2078053041;
        gv.gfca[810] = -337861906;
        gv.gfca[811] = -290742573;
        gv.gfca[812] = 1349517007;
        gv.gfca[813] = -1555130572;
        gv.gfca[814] = 1827000377;
        gv.gfca[815] = 1397407674;
        gv.gfca[816] = -2116469017;
        gv.gfca[817] = 1935617431;
        gv.gfca[818] = -1699739049;
        gv.gfca[819] = -177792429;
        gv.gfca[820] = 1797017220;
        gv.gfca[821] = 442783425;
        gv.gfca[822] = 535685052;
        gv.gfca[823] = 454877968;
        gv.gfca[824] = -1459452482;
        gv.gfca[825] = -1205440525;
        gv.gfca[826] = 1143768135;
        gv.gfca[827] = 1242941560;
        gv.gfca[828] = -1740052564;
        gv.gfca[829] = 1802546852;
        gv.gfca[830] = -780855112;
        gv.gfca[831] = 1116983026;
        gv.gfca[832] = -834651749;
        gv.gfca[833] = -241036003;
        gv.gfca[834] = 608937436;
        gv.gfca[835] = -2098658898;
        gv.gfca[836] = -1399945136;
        gv.gfca[837] = -1289647577;
        gv.gfca[838] = -2099510918;
        gv.gfca[839] = 1267591174;
        gv.gfca[840] = -1903229084;
        gv.gfca[841] = 2092575620;
        gv.gfca[842] = -42549379;
        gv.gfca[843] = 414448140;
        gv.gfca[844] = 2134337736;
        gv.gfca[845] = 2023894367;
        gv.gfca[846] = 1553187079;
        gv.gfca[847] = -632258698;
        gv.gfca[848] = 1261966193;
        gv.gfca[849] = -1287660744;
        gv.gfca[850] = -2019005490;
        gv.gfca[851] = 1651479976;
        gv.gfca[852] = 2122243100;
        gv.gfca[853] = -320500588;
        gv.gfca[854] = 679201914;
        gv.gfca[855] = 40258412;
        gv.gfca[856] = -1264966764;
        gv.gfca[857] = 334931277;
        gv.gfca[858] = 1753426603;
        gv.gfca[859] = -847902637;
        gv.gfca[860] = 49578085;
        gv.gfca[861] = 1064628689;
        gv.gfca[862] = -1787440860;
        gv.gfca[863] = 1307118740;
        gv.gfca[864] = 160350448;
        gv.gfca[865] = -1959867563;
        gv.gfca[866] = 1058367237;
        gv.gfca[867] = -1947690659;
        gv.gfca[868] = 203500173;
        gv.gfca[869] = -484090665;
        gv.gfca[870] = 497651973;
        gv.gfca[871] = -706337177;
        gv.gfca[872] = -77499926;
        gv.gfca[873] = 155215044;
        gv.gfca[874] = -1514650133;
        gv.gfca[875] = 883473155;
        gv.gfca[876] = 1546482359;
        gv.gfca[877] = -153235388;
        gv.gfca[878] = 1648682844;
        gv.gfca[879] = -13444501;
        gv.gfca[880] = -359773016;
        gv.gfca[881] = 226456136;
        gv.gfca[882] = 1085593823;
        gv.gfca[883] = -881089602;
        gv.gfca[884] = -1366372085;
        gv.gfca[885] = -665681572;
        gv.gfca[886] = -1384325001;
        gv.gfca[887] = 483190206;
        gv.gfca[888] = 915842500;
        gv.gfca[889] = -1886676244;
        gv.gfca[890] = 272624179;
        gv.gfca[891] = 1237288500;
        gv.gfca[892] = 1426035619;
        gv.gfca[893] = -1971497259;
        gv.gfca[894] = 922954301;
        gv.gfca[895] = 644961582;
        gv.gfca[896] = -1595639083;
        gv.gfca[897] = 622568226;
        gv.gfca[898] = 1661959317;
        gv.gfca[899] = 861923741;
    }

    private static /* synthetic */ void gqlb() {
        gv.gfde[200] = 7352638652851682230L;
        gv.gfde[201] = 1066845435717274532L;
        gv.gfde[202] = 3894829730111513767L;
        gv.gfde[203] = 8718779550880656793L;
        gv.gfde[204] = 4632720316637432277L;
        gv.gfde[205] = 829243190710290675L;
        gv.gfde[206] = -3958409102938845219L;
        gv.gfde[207] = 7915658080130943491L;
        gv.gfde[208] = -1011169631103562863L;
        gv.gfde[209] = -6173291763054033058L;
        gv.gfde[210] = 3853083454586674214L;
        gv.gfde[211] = 5632357371223067967L;
        gv.gfde[212] = -5844217014499134964L;
        gv.gfde[213] = -7160763551065192215L;
        gv.gfde[214] = -4642374708362701368L;
        gv.gfde[215] = 6474732568208891186L;
        gv.gfde[216] = 1819039234777440288L;
        gv.gfde[217] = -1086719326003255394L;
        gv.gfde[218] = 5394336274608960476L;
        gv.gfde[219] = -4080488070066877940L;
        gv.gfde[220] = 4587418042657318678L;
        gv.gfde[221] = -1774051193347495687L;
        gv.gfde[222] = 8689260358757469503L;
        gv.gfde[223] = -696604798555543144L;
        gv.gfde[224] = -1727610688711171435L;
        gv.gfde[225] = -3847318162370270078L;
        gv.gfde[226] = 864177269315118645L;
        gv.gfde[227] = 5561603159860252488L;
        gv.gfde[228] = 4822406076711713273L;
        gv.gfde[229] = 9086733303196194016L;
        gv.gfde[230] = -7497880343636659758L;
        gv.gfde[231] = 6034954159227451949L;
        gv.gfde[232] = 580431048532534757L;
        gv.gfde[233] = 5677174013416297943L;
        gv.gfde[234] = -980097655198195986L;
        gv.gfde[235] = -899685918401653147L;
        gv.gfde[236] = 1010184099401362133L;
        gv.gfde[237] = -1578655350745802469L;
        gv.gfde[238] = -4634727286630438423L;
        gv.gfde[239] = 5091754216956231730L;
        gv.gfde[240] = 3886210676456991135L;
        gv.gfde[241] = -3604079413782850306L;
        gv.gfde[242] = 2498231260235034332L;
        gv.gfde[243] = 7695061168164517702L;
        gv.gfde[244] = 2169535634975588177L;
        gv.gfde[245] = -1353064375017872614L;
        gv.gfde[246] = -1749974890923245173L;
        gv.gfde[247] = 6529471413024045804L;
        gv.gfde[248] = -262801012593786584L;
        gv.gfde[249] = 1755430695059423828L;
        gv.gfde[250] = 8478426159597664925L;
        gv.gfde[251] = -7446090449292446927L;
        gv.gfde[252] = -7900526117741615258L;
        gv.gfde[253] = -1752273148554633898L;
        gv.gfde[254] = 4156382879483475115L;
        gv.gfde[255] = -5862247877915963515L;
        gv.gfde[256] = 5381044330792378978L;
        gv.gfde[257] = -3147057071190867974L;
        gv.gfde[258] = -2454787728922541472L;
        gv.gfde[259] = 8734537935066353841L;
        gv.gfde[260] = -7048824263486389556L;
        gv.gfde[261] = -9066662172172234891L;
        gv.gfde[262] = 2525465836366089421L;
        gv.gfde[263] = 3566937918102062421L;
        gv.gfde[264] = 3989044160832121966L;
        gv.gfde[265] = 543470051175932466L;
        gv.gfde[266] = -5457139704326686355L;
        gv.gfde[267] = -6787354452883524610L;
        gv.gfde[268] = -6357165312966928860L;
        gv.gfde[269] = -4135365386875507279L;
        gv.gfde[270] = -2697811087162518560L;
        gv.gfde[271] = 4185465376212725933L;
        gv.gfde[272] = 2094779812673510237L;
        gv.gfde[273] = 3056992287768280435L;
        gv.gfde[274] = 404423164908016153L;
        gv.gfde[275] = -5532945134659588568L;
        gv.gfde[276] = 976809349851520925L;
        gv.gfde[277] = 5671825641905382616L;
        gv.gfde[278] = -6371168523904911707L;
        gv.gfde[279] = 525458523211288263L;
        gv.gfde[280] = 2630486324260688074L;
        gv.gfde[281] = 4198923600274733519L;
        gv.gfde[282] = 7649717931643867149L;
        gv.gfde[283] = -7933330630134306489L;
        gv.gfde[284] = 602970280023681538L;
        gv.gfde[285] = -3359602715985940271L;
        gv.gfde[286] = 2290604253115881319L;
        gv.gfde[287] = -7174239758714413814L;
        gv.gfde[288] = -1630773442809186918L;
        gv.gfde[289] = -625352885098597903L;
        gv.gfde[290] = -2079563428749892373L;
        gv.gfde[291] = 1639498446305573082L;
        gv.gfde[292] = 2928811058417649192L;
        gv.gfde[293] = 3309915101902762769L;
        gv.gfde[294] = -6014343597903058560L;
        gv.gfde[295] = -8322211592165371920L;
        gv.gfde[296] = -4083328896545877734L;
        gv.gfde[297] = -6002075265577787884L;
        gv.gfde[298] = 7914100356874466249L;
        gv.gfde[299] = -304222582594883115L;
    }

    private static /* synthetic */ void gqmx() {
        gv.gfde[800] = 7676024280698650085L;
        gv.gfde[801] = -276758881642722524L;
        gv.gfde[802] = -4126081784431112153L;
        gv.gfde[803] = -8092974852149436668L;
        gv.gfde[804] = 5130820805076354416L;
        gv.gfde[805] = -6568708658079105267L;
        gv.gfde[806] = -8357969735725917196L;
        gv.gfde[807] = 2311164402542348643L;
        gv.gfde[808] = 6866742419060319262L;
        gv.gfde[809] = 8009253553921359874L;
        gv.gfde[810] = 2170551580083260338L;
        gv.gfde[811] = -6508528662838454965L;
        gv.gfde[812] = 4259198324185455859L;
        gv.gfde[813] = -6872424641120916568L;
        gv.gfde[814] = 847520301207738906L;
        gv.gfde[815] = 5398274301139848226L;
        gv.gfde[816] = -2171772248715063335L;
        gv.gfde[817] = 914950535869623480L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean shouldTurnAwayFromBorder() {
        block64: {
            var9_1 = gv.c;
            var8_2 /* !! */  = gv.b;
            var7_3 = gv.a;
            if (var9_1) {
                throw null;
lbl6:
                // 19 sources

                return (boolean)gv.gfcc("giee", gfbz(int ), (int)904);
            }
            if (var7_3 || var7_3) ** GOTO lbl6
            var1_4 = gv.mc.field_1687.method_8621();
            if (var7_3 || var7_3) ** GOTO lbl6
            var2_5 = gv.EXPLORE_DIRECTIONS[this.exploreDirectionIndex];
            if (var7_3 || var7_3) ** GOTO lbl6
            var3_6 = gv.mc.field_1724.method_23317();
            if (var7_3 || var7_3) ** GOTO lbl6
            var5_7 = gv.mc.field_1724.method_23321();
            if (var7_3 || var7_3) ** GOTO lbl6
            if (var2_5[0] <= 0) break block64;
            if (var7_3) ** GOTO lbl6
            if (var1_4.method_11963() - var3_6 <= gv.gfcc("gief", gfjl(int ), (int)372)) ** GOTO lbl41
            if (var7_3) ** GOTO lbl6
        }
        if (var7_3) ** GOTO lbl6
        if (var8_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var7_3) ** GOTO lbl6
                if (var2_5[0] >= 0) ** GOTO lbl31
                if (var7_3) ** GOTO lbl6
                if (var3_6 - var1_4.method_11976() <= gv.gfcc("gieg", gfjl(int ), (int)373)) ** GOTO lbl41
                if (var7_3) ** GOTO lbl6
lbl31:
                // 2 sources

                if (var7_3 || var7_3) ** GOTO lbl6
                if (var2_5[1] <= 0) ** GOTO lbl36
                if (var7_3) ** GOTO lbl6
                if (var1_4.method_11977() - var5_7 <= gv.gfcc("gieh", gfjl(int ), (int)374)) ** GOTO lbl41
                if (var7_3) ** GOTO lbl6
lbl36:
                // 2 sources

                if (var7_3 || var7_3) ** GOTO lbl6
                if (var2_5[1] >= 0) ** GOTO lbl46
                if (var7_3) ** GOTO lbl6
                if (!(var5_7 - var1_4.method_11958() <= gv.gfcc("giei", gfjl(int ), (int)375))) ** GOTO lbl46
                if (var7_3) ** GOTO lbl6
lbl41:
                // 4 sources

                if (var7_3 || var7_3) ** GOTO lbl6
                v0 = gv.gfcc("giek", gfbz(int ), (int)905);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl49
lbl46:
                // 2 sources

                if (!var7_3 && !var7_3) ** break;
                ** continue;
                v0 = gv.gfcc("gien", gfbz(int ), (int)906);
lbl49:
                // 2 sources

                return (boolean)v0;
            }
lbl50:
            // 3 sources

            case 0: {
                var8_2 /* !! */  = (int)gv.gfcc("gieo", gfbz(int ), (int)907);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl65
            }
lbl55:
            // 2 sources

            case 1: {
                var8_2 /* !! */  = (int)gv.gfcc("gieq", gfbz(int ), (int)908);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl169
            }
            case 2: {
                var8_2 /* !! */  = (int)gv.gfcc("gieu", gfbz(int ), (int)909);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl173
            }
lbl65:
            // 2 sources

            case 3: {
                var8_2 /* !! */  = (int)gv.gfcc("giev", gfbz(int ), (int)910);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl144
            }
lbl70:
            // 2 sources

            case 4: {
                var8_2 /* !! */  = (int)gv.gfcc("giew", gfbz(int ), (int)911);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl121
            }
lbl75:
            // 2 sources

            case 5: {
                var8_2 /* !! */  = (int)gv.gfcc("giex", gfbz(int ), (int)912);
                if (!var9_1) ** GOTO lbl55
                throw null;
            }
lbl79:
            // 3 sources

            case 6: {
                var8_2 /* !! */  = (int)gv.gfcc("giey", gfbz(int ), (int)913);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl135
            }
lbl84:
            // 2 sources

            case 7: {
                var8_2 /* !! */  = (int)gv.gfcc("giez", gfbz(int ), (int)914);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl98
            }
lbl89:
            // 2 sources

            case 8: {
                do {
                    var8_2 /* !! */  = (int)gv.gfcc("gifa", gfbz(int ), (int)915);
                } while (!var9_1);
                throw null;
            }
            case 9: {
                var8_2 /* !! */  = (int)gv.gfcc("gife", gfbz(int ), (int)916);
                if (!var9_1) ** GOTO lbl70
                throw null;
            }
lbl98:
            // 3 sources

            case 10: {
                var8_2 /* !! */  = (int)gv.gfcc("giff", gfbz(int ), (int)917);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl121
            }
lbl103:
            // 3 sources

            case 11: {
                var8_2 /* !! */  = (int)gv.gfcc("gifg", gfbz(int ), (int)918);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl131
            }
            case 12: {
                var8_2 /* !! */  = (int)gv.gfcc("gifh", gfbz(int ), (int)919);
                if (!var9_1) ** GOTO lbl79
                throw null;
            }
lbl112:
            // 2 sources

            case 13: {
                var8_2 /* !! */  = (int)gv.gfcc("gifj", gfbz(int ), (int)920);
                if (!var9_1) ** GOTO lbl75
                throw null;
            }
            case 14: {
                var8_2 /* !! */  = (int)gv.gfcc("gifk", gfbz(int ), (int)921);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl121:
            // 3 sources

            case 15: {
                var8_2 /* !! */  = (int)gv.gfcc("gifl", gfbz(int ), (int)922);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl135
            }
            case 16: {
                do {
                    var8_2 /* !! */  = (int)gv.gfcc("gifo", gfbz(int ), (int)923);
                } while (!var9_1);
                throw null;
            }
lbl131:
            // 2 sources

            case 17: {
                var8_2 /* !! */  = (int)gv.gfcc("gifq", gfbz(int ), (int)924);
                if (!var9_1) ** GOTO lbl50
                throw null;
            }
lbl135:
            // 3 sources

            case 18: {
                var8_2 /* !! */  = (int)gv.gfcc("gifr", gfbz(int ), (int)925);
                if (!var9_1) ** GOTO lbl103
                throw null;
            }
            case 19: {
                var8_2 /* !! */  = (int)gv.gfcc("gift", gfbz(int ), (int)926);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl165
            }
lbl144:
            // 3 sources

            case 20: {
                var8_2 /* !! */  = (int)gv.gfcc("gifu", gfbz(int ), (int)927);
                if (!var9_1) ** GOTO lbl79
                throw null;
            }
lbl148:
            // 2 sources

            case 21: {
                var8_2 /* !! */  = (int)gv.gfcc("gifw", gfbz(int ), (int)928);
                if (!var9_1) ** GOTO lbl84
                throw null;
            }
            case 22: {
                var8_2 /* !! */  = (int)gv.gfcc("gifx", gfbz(int ), (int)929);
                if (!var9_1) ** GOTO lbl112
                throw null;
            }
            case 23: {
                var8_2 /* !! */  = (int)gv.gfcc("gify", gfbz(int ), (int)930);
                if (!var9_1) ** GOTO lbl50
                throw null;
            }
            case 24: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_2 /* !! */  = (int)gv.gfcc("gifz", gfbz(int ), (int)931);
                    if (!var9_1) ** GOTO lbl89
                    throw null;
                }
            }
lbl165:
            // 2 sources

            case 25: {
                var8_2 /* !! */  = (int)gv.gfcc("giga", gfbz(int ), (int)932);
                if (!var9_1) ** GOTO lbl148
                throw null;
            }
lbl169:
            // 3 sources

            case 26: {
                var8_2 /* !! */  = (int)gv.gfcc("gigb", gfbz(int ), (int)933);
                if (!var9_1) ** GOTO lbl98
                throw null;
            }
lbl173:
            // 2 sources

            case 27: {
                var8_2 /* !! */  = (int)gv.gfcc("gigd", gfbz(int ), (int)934);
                if (!var9_1) ** GOTO lbl144
                throw null;
            }
            case 28: {
                var8_2 /* !! */  = (int)gv.gfcc("gigf", gfbz(int ), (int)935);
                if (!var9_1) ** GOTO lbl103
                throw null;
            }
lbl181:
            // 2 sources

            case 29: {
                var8_2 /* !! */  = (int)gv.gfcc("gigh", gfbz(int ), (int)936);
                if (!var9_1) ** GOTO lbl169
                throw null;
            }
            case 30: 
        }
        var8_2 /* !! */  = (int)gv.gfcc("gigl", gfbz(int ), (int)937);
        ** while (!var9_1)
lbl188:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gqng() {
        gv.gfdf[100] = -3387410424009961089L;
        gv.gfdf[101] = 2154704465050257633L;
        gv.gfdf[102] = -3895291560506727222L;
        gv.gfdf[103] = -6239634404402174147L;
        gv.gfdf[104] = -555509691792680640L;
        gv.gfdf[105] = 3111120191892134517L;
        gv.gfdf[106] = 7681102492199701901L;
        gv.gfdf[107] = 7152840332235555427L;
        gv.gfdf[108] = -2895193522544583224L;
        gv.gfdf[109] = 1327338746885988741L;
        gv.gfdf[110] = -2739851298237116430L;
        gv.gfdf[111] = 5132930564860765482L;
        gv.gfdf[112] = 9038717647567399532L;
        gv.gfdf[113] = -404781118655902654L;
        gv.gfdf[114] = -4799432211091958599L;
        gv.gfdf[115] = -7482862849286556453L;
        gv.gfdf[116] = -8426414380475474355L;
        gv.gfdf[117] = 3514472920473698576L;
        gv.gfdf[118] = 5966828033583347467L;
        gv.gfdf[119] = -8846601775296880075L;
        gv.gfdf[120] = -6737777626499298946L;
        gv.gfdf[121] = 7323908561929014925L;
        gv.gfdf[122] = -5189810423083602775L;
        gv.gfdf[123] = -264238995607209591L;
        gv.gfdf[124] = -6370316431556208088L;
        gv.gfdf[125] = 7068737580438151965L;
        gv.gfdf[126] = -8436803702486554377L;
        gv.gfdf[127] = -645143931853861435L;
        gv.gfdf[128] = 3634305526970233361L;
        gv.gfdf[129] = -5692288448422608787L;
        gv.gfdf[130] = -7565702600526806758L;
        gv.gfdf[131] = 8856052584260903324L;
        gv.gfdf[132] = -3145981872990018721L;
        gv.gfdf[133] = -6719957035076406436L;
        gv.gfdf[134] = -771521695422110982L;
        gv.gfdf[135] = -5633945802553013317L;
        gv.gfdf[136] = -5425011916587087522L;
        gv.gfdf[137] = 4354738346597432849L;
        gv.gfdf[138] = 902263957147472616L;
        gv.gfdf[139] = 5963094028104649383L;
        gv.gfdf[140] = 737238914212657885L;
        gv.gfdf[141] = 7595710624903612003L;
        gv.gfdf[142] = 1655710472299012620L;
        gv.gfdf[143] = 791897113685834246L;
        gv.gfdf[144] = 7202681824165456986L;
        gv.gfdf[145] = -8577845825868994532L;
        gv.gfdf[146] = -6549931687709886199L;
        gv.gfdf[147] = 2335842401608501805L;
        gv.gfdf[148] = -3755573941396371820L;
        gv.gfdf[149] = 3074125818601194943L;
        gv.gfdf[150] = -5264394301249505337L;
        gv.gfdf[151] = -1690163417446379852L;
        gv.gfdf[152] = 4583243850316048127L;
        gv.gfdf[153] = 7809701211411430468L;
        gv.gfdf[154] = -4643290745985216785L;
        gv.gfdf[155] = -6996931412308335817L;
        gv.gfdf[156] = -5970986095095660950L;
        gv.gfdf[157] = 6930760471148327166L;
        gv.gfdf[158] = -6470322593553754694L;
        gv.gfdf[159] = 1040232064262001006L;
        gv.gfdf[160] = -3434544292763161072L;
        gv.gfdf[161] = 7134973682692379615L;
        gv.gfdf[162] = -5371054012687701607L;
        gv.gfdf[163] = -268221847092248117L;
        gv.gfdf[164] = -6965684920746112114L;
        gv.gfdf[165] = -6046498962166321029L;
        gv.gfdf[166] = 7746840965985597119L;
        gv.gfdf[167] = -2133771504325746512L;
        gv.gfdf[168] = 2419947470384715464L;
        gv.gfdf[169] = -6962263994553487227L;
        gv.gfdf[170] = -8132924605816295530L;
        gv.gfdf[171] = -9180347062224657572L;
        gv.gfdf[172] = -1138056963018693231L;
        gv.gfdf[173] = -1893114662277074715L;
        gv.gfdf[174] = -5684253303698920848L;
        gv.gfdf[175] = 6991990957752031704L;
        gv.gfdf[176] = 3260154443744239875L;
        gv.gfdf[177] = -2767182826555636298L;
        gv.gfdf[178] = -2159655083480492961L;
        gv.gfdf[179] = 8747462568351521634L;
        gv.gfdf[180] = 895339606800814230L;
        gv.gfdf[181] = 2052305108119867413L;
        gv.gfdf[182] = 8856762758989907815L;
        gv.gfdf[183] = -5846549919964936165L;
        gv.gfdf[184] = -7812487532194458793L;
        gv.gfdf[185] = 784315343987819543L;
        gv.gfdf[186] = -1365667629446506148L;
        gv.gfdf[187] = -3976009524455845197L;
        gv.gfdf[188] = 4050439434410771641L;
        gv.gfdf[189] = -7243531979899023583L;
        gv.gfdf[190] = 1269741731362550241L;
        gv.gfdf[191] = 1592423622904019935L;
        gv.gfdf[192] = 128857717958781812L;
        gv.gfdf[193] = 7011242647995222717L;
        gv.gfdf[194] = 4449981362322151331L;
        gv.gfdf[195] = -3417749576439987588L;
        gv.gfdf[196] = -4943480353405895321L;
        gv.gfdf[197] = -1645142071125055307L;
        gv.gfdf[198] = 4171207459178676792L;
        gv.gfdf[199] = 1367327799727050625L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ boolean lambda$markMinecartLooted$2(String var1_1, String var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gv.nl - gv.gfcc("gogs", gfdd(int ), (int)781)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gv.gfcc("gogt", gfbz(int ), (int)1707)) break;
            v0 /* !! */  = (long)gv.gfcc("gogv", gfbz(int ), (int)1708);
        }
        var5_3 = gv.c;
        v1 /* !! */  = gv.nl;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - gv.gfcc("gogx", gfdd(int ), (int)782));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1319782117: {
                    v2 = gv.gfcc("gpow", gfdd(int ), (int)783);
                    continue block17;
                }
                case -873388312: {
                    v2 = gv.gfcc("gpoy", gfdd(int ), (int)784);
                    continue block17;
                }
                case 1185080505: {
                    break block17;
                }
            }
            break;
        }
        var4_4 /* !! */  = gv.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = gv.nl - gv.gfcc("gpoz", gfdd(int ), (int)785)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == gv.gfcc("gppa", gfbz(int ), (int)1709)) break;
            v3 /* !! */  = (long)gv.gfcc("gppb", gfbz(int ), (int)1710);
        }
        var3_5 = gv.a;
        if (var5_3) {
            throw null;
            return (boolean)gv.gfcc("gppe", gfbz(int ), (int)1711);
        }
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_5 || var3_5) ** continue;
                v4 /* !! */  = gv.nl;
                if (true) ** GOTO lbl41
                block20: while (true) {
                    v4 /* !! */  = (long)(v5 - gv.gfcc("gppg", gfdd(int ), (int)786));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1213901025: {
                            v5 = gv.gfcc("gppl", gfdd(int ), (int)787);
                            continue block20;
                        }
                        case 944461657: {
                            v5 = gv.gfcc("gppm", gfdd(int ), (int)788);
                            continue block20;
                        }
                        case 1185080505: {
                            break block20;
                        }
                    }
                    break;
                }
                return this.isRememberedEntryForKey(var2_2, var1_1);
            }
            case 0: {
                var4_4 /* !! */  = (int)gv.gfcc("gppo", gfbz(int ), (int)1712);
                if (!var5_3) break;
                throw null;
            }
lbl55:
            // 2 sources

            case 1: {
                do {
                    var4_4 /* !! */  = (int)gv.gfcc("gppq", gfbz(int ), (int)1713);
                } while (!var5_3);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)gv.gfcc("gppr", gfbz(int ), (int)1714);
                    if (!var5_3) ** GOTO lbl55
                    throw null;
                }
            }
            case 3: 
        }
        var4_4 /* !! */  = (int)gv.gfcc("gppt", gfbz(int ), (int)1715);
        ** while (!var5_3)
lbl68:
        // 1 sources

        throw null;
    }

    static {
        gfca = new int[1733];
        gfcb = new int[1733];
        gv.gptk();
        gv.gpuf();
        gv.gpuw();
        gv.gpvp();
        gv.gpwa();
        gv.gpwb();
        gv.gpwc();
        gv.gpwd();
        gv.gpwk();
        gv.gpwr();
        gv.gpxi();
        gv.gpxx();
        gv.gpym();
        gv.gpzb();
        gv.gpzt();
        gv.gqal();
        gv.gqba();
        gv.gqbo();
        gv.gqbs();
        gv.gqcj();
        gv.gqcp();
        gv.gqdc();
        gv.gqdp();
        gv.gqeg();
        gv.gqer();
        gv.gqff();
        gv.gqfs();
        gv.gqgf();
        gv.gqgq();
        gv.gqhd();
        gv.gqhm();
        gv.gqhu();
        gv.gqif();
        gv.gqiu();
        gv.gqjn();
        gv.gqjy();
        gfde = new long[818];
        gfdf = new long[818];
        gv.gqkk();
        gv.gqko();
        gv.gqlb();
        gv.gqln();
        gv.gqlr();
        gv.gqlu();
        gv.gqme();
        gv.gqmm();
        gv.gqmx();
        gv.gqmy();
        gv.gqng();
        gv.gqno();
        gv.gqnv();
        gv.gqob();
        gv.gqoh();
        gv.gqoo();
        gv.gqov();
        gv.gqpd();
        CAVE_SEARCH_LEVELS = new int[]{32, 24, 42, 16, 50};
        EXPLORE_DIRECTIONS = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    }

    private static /* synthetic */ void gpzt() {
        gv.gfca[1400] = 674781632;
        gv.gfca[1401] = -877772575;
        gv.gfca[1402] = -1834091192;
        gv.gfca[1403] = 556185970;
        gv.gfca[1404] = -181855088;
        gv.gfca[1405] = 26926191;
        gv.gfca[1406] = 1659316775;
        gv.gfca[1407] = -122880440;
        gv.gfca[1408] = 2002029122;
        gv.gfca[1409] = -1737266833;
        gv.gfca[1410] = -504543129;
        gv.gfca[1411] = 1195515973;
        gv.gfca[1412] = -1482053024;
        gv.gfca[1413] = 737023337;
        gv.gfca[1414] = -1657725057;
        gv.gfca[1415] = -605618661;
        gv.gfca[1416] = -1847578571;
        gv.gfca[1417] = 878763265;
        gv.gfca[1418] = -329474728;
        gv.gfca[1419] = 2015460911;
        gv.gfca[1420] = -619445546;
        gv.gfca[1421] = -2018401152;
        gv.gfca[1422] = 940085356;
        gv.gfca[1423] = 2048634241;
        gv.gfca[1424] = -832060164;
        gv.gfca[1425] = 1203748945;
        gv.gfca[1426] = -169424660;
        gv.gfca[1427] = -408862523;
        gv.gfca[1428] = 987030912;
        gv.gfca[1429] = -924148905;
        gv.gfca[1430] = 1829030410;
        gv.gfca[1431] = -1794239315;
        gv.gfca[1432] = -2031533315;
        gv.gfca[1433] = -1954727221;
        gv.gfca[1434] = 601328875;
        gv.gfca[1435] = -678653176;
        gv.gfca[1436] = -1060886291;
        gv.gfca[1437] = 52281869;
        gv.gfca[1438] = 160364920;
        gv.gfca[1439] = -218234153;
        gv.gfca[1440] = -277558670;
        gv.gfca[1441] = -381790277;
        gv.gfca[1442] = -1683610569;
        gv.gfca[1443] = 2086822897;
        gv.gfca[1444] = 1680596381;
        gv.gfca[1445] = 1065629584;
        gv.gfca[1446] = 1481230513;
        gv.gfca[1447] = 906424252;
        gv.gfca[1448] = -1261061805;
        gv.gfca[1449] = -1761573375;
        gv.gfca[1450] = 849353773;
        gv.gfca[1451] = 580051807;
        gv.gfca[1452] = 2157732;
        gv.gfca[1453] = -707928218;
        gv.gfca[1454] = 658515174;
        gv.gfca[1455] = 334934622;
        gv.gfca[1456] = 763582975;
        gv.gfca[1457] = -442128615;
        gv.gfca[1458] = -757257391;
        gv.gfca[1459] = 1598130856;
        gv.gfca[1460] = 695666357;
        gv.gfca[1461] = 2099156438;
        gv.gfca[1462] = 1087740192;
        gv.gfca[1463] = -732280099;
        gv.gfca[1464] = -125789765;
        gv.gfca[1465] = 1657223037;
        gv.gfca[1466] = 144257303;
        gv.gfca[1467] = -977634118;
        gv.gfca[1468] = 1149802631;
        gv.gfca[1469] = 569019391;
        gv.gfca[1470] = -741624906;
        gv.gfca[1471] = 1526808693;
        gv.gfca[1472] = -1430854702;
        gv.gfca[1473] = -650086533;
        gv.gfca[1474] = -558674248;
        gv.gfca[1475] = -938092643;
        gv.gfca[1476] = -1908445343;
        gv.gfca[1477] = 757313880;
        gv.gfca[1478] = -1669081473;
        gv.gfca[1479] = -1434393126;
        gv.gfca[1480] = 487362512;
        gv.gfca[1481] = -560931700;
        gv.gfca[1482] = -1660765390;
        gv.gfca[1483] = -876145114;
        gv.gfca[1484] = -1041817941;
        gv.gfca[1485] = 1696688174;
        gv.gfca[1486] = 1410080694;
        gv.gfca[1487] = -1573598752;
        gv.gfca[1488] = -721923201;
        gv.gfca[1489] = -1328722682;
        gv.gfca[1490] = 1433413352;
        gv.gfca[1491] = 731605959;
        gv.gfca[1492] = 1952079292;
        gv.gfca[1493] = 1601500025;
        gv.gfca[1494] = -1994171961;
        gv.gfca[1495] = -785091607;
        gv.gfca[1496] = 627565531;
        gv.gfca[1497] = 2057401024;
        gv.gfca[1498] = -1888035537;
        gv.gfca[1499] = -1177825078;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void pathTo(class_2338 var1_1, int var2_2) {
        block109: {
            v0 /* !! */  = gv.nl;
            if (true) ** GOTO lbl5
            block75: while (true) {
                v0 /* !! */  = (long)(v1 - gv.gfcc("ghdw", gfdd(int ), (int)243));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1692987889: {
                        v1 = gv.gfcc("ghec", gfdd(int ), (int)244);
                        continue block75;
                    }
                    case 285834215: {
                        v1 = gv.gfcc("ghee", gfdd(int ), (int)245);
                        continue block75;
                    }
                    case 1185080505: {
                        break block75;
                    }
                    case 1529472748: {
                        v1 = gv.gfcc("gheg", gfdd(int ), (int)246);
                        continue block75;
                    }
                }
                break;
            }
            var6_3 = gv.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = gv.nl - gv.gfcc("ghei", gfdd(int ), (int)247)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == gv.gfcc("ghej", gfbz(int ), (int)736)) break;
                v2 /* !! */  = (long)gv.gfcc("ghek", gfbz(int ), (int)737);
            }
            var5_4 /* !! */  = gv.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = gv.nl - gv.gfcc("ghem", gfdd(int ), (int)248)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == gv.gfcc("gheo", gfbz(int ), (int)738)) break;
                v3 /* !! */  = (long)gv.gfcc("gheq", gfbz(int ), (int)739);
            }
            var4_5 = gv.a;
            if (var6_3) {
                throw null;
lbl32:
                // 8 sources

                return;
            }
            if (var4_5 || var4_5) ** GOTO lbl32
            v4 /* !! */  = gv.nl;
            if (true) ** GOTO lbl39
            block79: while (true) {
                v4 /* !! */  = (long)(v5 - gv.gfcc("ghet", gfdd(int ), (int)249));
lbl39:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -2141989057: {
                        v5 = gv.gfcc("ghev", gfdd(int ), (int)250);
                        continue block79;
                    }
                    case -624833005: {
                        v5 = gv.gfcc("ghex", gfdd(int ), (int)251);
                        continue block79;
                    }
                    case 1185080505: {
                        break block79;
                    }
                    case 1795108445: {
                        v5 = gv.gfcc("ghey", gfdd(int ), (int)252);
                        continue block79;
                    }
                }
                break;
            }
            var3_6 = this.key(var1_1);
            if (var4_5 || var4_5) ** GOTO lbl32
            v6 /* !! */  = gv.nl;
            if (true) ** GOTO lbl57
            block80: while (true) {
                v6 /* !! */  = (long)(v7 - gv.gfcc("ghez", gfdd(int ), (int)253));
lbl57:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -185604465: {
                        v7 = gv.gfcc("ghfb", gfdd(int ), (int)254);
                        continue block80;
                    }
                    case 1008238324: {
                        v7 = gv.gfcc("ghfd", gfdd(int ), (int)255);
                        continue block80;
                    }
                    case 1185080505: {
                        break block80;
                    }
                }
                break;
            }
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_2 = gv.nl - gv.gfcc("ghfg", gfdd(int ), (int)256)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == gv.gfcc("ghfi", gfbz(int ), (int)740)) break;
                v8 /* !! */  = (long)gv.gfcc("ghfj", gfbz(int ), (int)741);
            }
            if (!var3_6.equals(this.currentPathKey)) break block109;
            if (var4_5) ** GOTO lbl32
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_3 = gv.nl - gv.gfcc("ghfk", gfdd(int ), (int)257)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == gv.gfcc("ghfo", gfbz(int ), (int)742)) break;
                v9 /* !! */  = (long)gv.gfcc("ghfq", gfbz(int ), (int)743);
            }
            v10 = gv.gfcc("ghfs", gfjl(int ), (int)258);
            v11 /* !! */  = gv.nl;
            if (true) ** GOTO lbl83
            block83: while (true) {
                v11 /* !! */  = (long)(v12 - gv.gfcc("ghfu", gfdd(int ), (int)259));
lbl83:
                // 2 sources

                switch ((int)v11 /* !! */ ) {
                    case -1821825943: {
                        v12 = gv.gfcc("ghfv", gfdd(int ), (int)260);
                        continue block83;
                    }
                    case -948323088: {
                        v12 = gv.gfcc("ghfx", gfdd(int ), (int)261);
                        continue block83;
                    }
                    case -159490327: {
                        v12 = gv.gfcc("ghfy", gfdd(int ), (int)262);
                        continue block83;
                    }
                    case 1185080505: {
                        break block83;
                    }
                }
                break;
            }
            if (this.pathTimer.finished((double)v10)) break block109;
            if (var4_5 || var4_5) ** GOTO lbl32
            return;
        }
        if (var4_5 || var4_5) ** GOTO lbl32
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v13 /* !! */  = gv.nl;
                if (true) ** GOTO lbl107
                block84: while (true) {
                    v13 /* !! */  = (long)(v14 - gv.gfcc("ghgc", gfdd(int ), (int)263));
lbl107:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1949974630: {
                            v14 = gv.gfcc("ghge", gfdd(int ), (int)264);
                            continue block84;
                        }
                        case -64972855: {
                            v14 = gv.gfcc("ghgg", gfdd(int ), (int)265);
                            continue block84;
                        }
                        case 1048779694: {
                            v14 = gv.gfcc("ghgi", gfdd(int ), (int)266);
                            continue block84;
                        }
                        case 1185080505: {
                            break block84;
                        }
                    }
                    break;
                }
                v15 = BaritoneAPI.getProvider();
                v16 /* !! */  = gv.nl;
                if (true) ** GOTO lbl124
                block85: while (true) {
                    v16 /* !! */  = (long)(v17 - gv.gfcc("ghgj", gfdd(int ), (int)267));
lbl124:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case 974051485: {
                            v17 = gv.gfcc("ghgk", gfdd(int ), (int)268);
                            continue block85;
                        }
                        case 1185080505: {
                            break block85;
                        }
                        case 1792965158: {
                            v17 = gv.gfcc("ghgo", gfdd(int ), (int)269);
                            continue block85;
                        }
                    }
                    break;
                }
                v18 = v15.getPrimaryBaritone();
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_4 = gv.nl - gv.gfcc("ghgq", gfdd(int ), (int)270)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == gv.gfcc("ghgs", gfbz(int ), (int)744)) break;
                    v19 /* !! */  = (long)gv.gfcc("ghgt", gfbz(int ), (int)745);
                }
                v20 = v18.getCustomGoalProcess();
                v21 /* !! */  = gv.nl;
                if (true) ** GOTO lbl144
                block87: while (true) {
                    v21 /* !! */  = (long)(v22 - gv.gfcc("ghgy", gfdd(int ), (int)271));
lbl144:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -396911571: {
                            v22 = gv.gfcc("ghgz", gfdd(int ), (int)272);
                            continue block87;
                        }
                        case 1185080505: {
                            break block87;
                        }
                        case 1682986417: {
                            v22 = gv.gfcc("ghhb", gfdd(int ), (int)273);
                            continue block87;
                        }
                    }
                    break;
                }
                v23 /* !! */  = gv.nl;
                if (true) ** GOTO lbl157
                block88: while (true) {
                    v23 /* !! */  = (long)(v24 - gv.gfcc("ghhc", gfdd(int ), (int)274));
lbl157:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -439514745: {
                            v24 = gv.gfcc("ghhe", gfdd(int ), (int)275);
                            continue block88;
                        }
                        case 1017621342: {
                            v24 = gv.gfcc("ghhf", gfdd(int ), (int)276);
                            continue block88;
                        }
                        case 1185080505: {
                            break block88;
                        }
                        case 1306279896: {
                            v24 = gv.gfcc("ghhh", gfdd(int ), (int)277);
                            continue block88;
                        }
                    }
                    break;
                }
                v25 = new GoalNear(var1_1, var2_2);
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_5 = gv.nl - gv.gfcc("ghhj", gfdd(int ), (int)278)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v26 /* !! */  == gv.gfcc("ghhl", gfbz(int ), (int)746)) break;
                    v26 /* !! */  = (long)gv.gfcc("ghhn", gfbz(int ), (int)747);
                }
                v20.setGoalAndPath((Goal)v25);
                if (var4_5 || var4_5) ** GOTO lbl32
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_6 = gv.nl - gv.gfcc("ghhq", gfdd(int ), (int)279)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == gv.gfcc("ghhs", gfbz(int ), (int)748)) break;
                    v27 /* !! */  = (long)gv.gfcc("ghhu", gfbz(int ), (int)749);
                }
                this.currentPathKey = var3_6;
                if (var4_5 || var4_5) ** GOTO lbl32
                v28 /* !! */  = gv.nl;
                if (true) ** GOTO lbl188
                block91: while (true) {
                    v28 /* !! */  = (long)(v29 - gv.gfcc("ghhw", gfdd(int ), (int)280));
lbl188:
                    // 2 sources

                    switch ((int)v28 /* !! */ ) {
                        case 971378932: {
                            v29 = gv.gfcc("ghhy", gfdd(int ), (int)281);
                            continue block91;
                        }
                        case 1185080505: {
                            break block91;
                        }
                        case 1502383914: {
                            v29 = gv.gfcc("ghhz", gfdd(int ), (int)282);
                            continue block91;
                        }
                    }
                    break;
                }
                v30 /* !! */  = gv.nl;
                if (true) ** GOTO lbl201
                block92: while (true) {
                    v30 /* !! */  = (long)(v31 - gv.gfcc("ghia", gfdd(int ), (int)283));
lbl201:
                    // 2 sources

                    switch ((int)v30 /* !! */ ) {
                        case -86244312: {
                            v31 = gv.gfcc("ghid", gfdd(int ), (int)284);
                            continue block92;
                        }
                        case 1020226902: {
                            v31 = gv.gfcc("ghik", gfdd(int ), (int)285);
                            continue block92;
                        }
                        case 1185080505: {
                            break block92;
                        }
                    }
                    break;
                }
                this.pathTimer.reset();
                if (!var4_5 && !var4_5) ** break;
                ** continue;
                return;
            }
lbl214:
            // 3 sources

            case 0: {
                var5_4 /* !! */  = (int)gv.gfcc("ghil", gfbz(int ), (int)750);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl264
            }
            case 1: {
                var5_4 /* !! */  = (int)gv.gfcc("ghio", gfbz(int ), (int)751);
                if (!var6_3) ** GOTO lbl214
                throw null;
            }
lbl223:
            // 2 sources

            case 2: {
                do {
                    var5_4 /* !! */  = (int)gv.gfcc("ghis", gfbz(int ), (int)752);
                } while (!var6_3);
                throw null;
            }
            case 3: {
                var5_4 /* !! */  = (int)gv.gfcc("ghiu", gfbz(int ), (int)753);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl238
            }
lbl233:
            // 2 sources

            case 4: {
                var5_4 /* !! */  = (int)gv.gfcc("ghiv", gfbz(int ), (int)754);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl252
            }
lbl238:
            // 3 sources

            case 5: {
                var5_4 /* !! */  = (int)gv.gfcc("ghiy", gfbz(int ), (int)755);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl273
            }
lbl243:
            // 4 sources

            case 6: {
                var5_4 /* !! */  = (int)gv.gfcc("ghjh", gfbz(int ), (int)756);
                if (!var6_3) ** GOTO lbl233
                throw null;
            }
            case 7: {
                var5_4 /* !! */  = (int)gv.gfcc("ghjk", gfbz(int ), (int)757);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl282
            }
lbl252:
            // 2 sources

            case 8: {
                var5_4 /* !! */  = (int)gv.gfcc("ghjn", gfbz(int ), (int)758);
                if (var6_3) {
                    throw null;
                }
            }
lbl256:
            // 4 sources

            case 9: {
                var5_4 /* !! */  = (int)gv.gfcc("ghjo", gfbz(int ), (int)759);
                if (!var6_3) ** GOTO lbl243
                throw null;
            }
            case 10: {
                var5_4 /* !! */  = (int)gv.gfcc("ghjp", gfbz(int ), (int)760);
                if (!var6_3) ** GOTO lbl243
                throw null;
            }
lbl264:
            // 2 sources

            case 11: {
                do {
                    var5_4 /* !! */  = (int)gv.gfcc("ghjq", gfbz(int ), (int)761);
                } while (!var6_3);
                throw null;
            }
            case 12: {
                var5_4 /* !! */  = (int)gv.gfcc("ghjr", gfbz(int ), (int)762);
                if (!var6_3) ** GOTO lbl243
                throw null;
            }
lbl273:
            // 2 sources

            case 13: {
                var5_4 /* !! */  = (int)gv.gfcc("ghjy", gfbz(int ), (int)763);
                if (!var6_3) ** GOTO lbl238
                throw null;
            }
            case 14: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)gv.gfcc("ghjz", gfbz(int ), (int)764);
                    if (!var6_3) ** GOTO lbl256
                    throw null;
                }
            }
lbl282:
            // 2 sources

            case 15: {
                var5_4 /* !! */  = (int)gv.gfcc("ghkc", gfbz(int ), (int)765);
                if (!var6_3) ** GOTO lbl223
                throw null;
            }
            case 16: {
                var5_4 /* !! */  = (int)gv.gfcc("ghkf", gfbz(int ), (int)766);
                if (!var6_3) ** GOTO lbl214
                throw null;
            }
            case 17: 
        }
        var5_4 /* !! */  = (int)gv.gfcc("ghkh", gfbz(int ), (int)767);
        ** while (!var6_3)
lbl293:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ Set lambda$rememberFoundLoot$1(String var0) {
        v0 /* !! */  = gv.nl;
        if (true) ** GOTO lbl5
        block27: while (true) {
            v0 /* !! */  = (long)(gv.gfcc("gpqa", gfdd(int ), (int)790) - gv.gfcc("gppz", gfdd(int ), (int)789));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 189879599: {
                    continue block27;
                }
                case 1185080505: {
                    break block27;
                }
            }
            break;
        }
        var3_1 = gv.c;
        v1 /* !! */  = gv.nl;
        if (true) ** GOTO lbl15
        block28: while (true) {
            v1 /* !! */  = (long)(v2 - gv.gfcc("gpqc", gfdd(int ), (int)791));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 870496607: {
                    v2 = gv.gfcc("gpqe", gfdd(int ), (int)792);
                    continue block28;
                }
                case 881000307: {
                    v2 = gv.gfcc("gpqf", gfdd(int ), (int)793);
                    continue block28;
                }
                case 1185080505: {
                    break block28;
                }
                case 1629578765: {
                    v2 = gv.gfcc("gpqh", gfdd(int ), (int)794);
                    continue block28;
                }
            }
            break;
        }
        var2_2 /* !! */  = gv.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = gv.nl - gv.gfcc("gpql", gfdd(int ), (int)795)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == gv.gfcc("gpqm", gfbz(int ), (int)1716)) break;
            v3 /* !! */  = (long)gv.gfcc("gpqn", gfbz(int ), (int)1717);
        }
        var1_3 = gv.a;
        if (var3_1) {
            throw null;
            return null;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = gv.nl;
                if (true) ** GOTO lbl47
                block31: while (true) {
                    v4 /* !! */  = (long)(v5 - gv.gfcc("gpqo", gfdd(int ), (int)796));
lbl47:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -704761537: {
                            v5 = gv.gfcc("gpqq", gfdd(int ), (int)797);
                            continue block31;
                        }
                        case -279153534: {
                            v5 = gv.gfcc("gpqr", gfdd(int ), (int)798);
                            continue block31;
                        }
                        case 617625896: {
                            v5 = gv.gfcc("gpqs", gfdd(int ), (int)799);
                            continue block31;
                        }
                        case 1185080505: {
                            break block31;
                        }
                    }
                    break;
                }
                v6 /* !! */  = gv.nl;
                if (true) ** GOTO lbl63
                block32: while (true) {
                    v6 /* !! */  = (long)(v7 - gv.gfcc("gpqy", gfdd(int ), (int)800));
lbl63:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 996015311: {
                            v7 = gv.gfcc("gpqz", gfdd(int ), (int)801);
                            continue block32;
                        }
                        case 1185080505: {
                            break block32;
                        }
                        case 1379920219: {
                            v7 = gv.gfcc("gprb", gfdd(int ), (int)802);
                            continue block32;
                        }
                    }
                    break;
                }
                return new LinkedHashSet<E>();
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)gv.gfcc("gprc", gfbz(int ), (int)1718);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl83
                    break;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)gv.gfcc("gprd", gfbz(int ), (int)1719);
                if (var3_1) {
                    throw null;
                }
            }
lbl83:
            // 4 sources

            case 2: {
                var2_2 /* !! */  = (int)gv.gfcc("gpre", gfbz(int ), (int)1720);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)gv.gfcc("gprf", gfbz(int ), (int)1721);
        ** while (!var3_1)
lbl90:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gqal() {
        gv.gfca[1500] = 538691988;
        gv.gfca[1501] = -1898618426;
        gv.gfca[1502] = -395932144;
        gv.gfca[1503] = -1536175949;
        gv.gfca[1504] = -1827037387;
        gv.gfca[1505] = -115619801;
        gv.gfca[1506] = -583205170;
        gv.gfca[1507] = -1424301467;
        gv.gfca[1508] = 637045245;
        gv.gfca[1509] = 1256909752;
        gv.gfca[1510] = -1662672191;
        gv.gfca[1511] = -1638715228;
        gv.gfca[1512] = 860780728;
        gv.gfca[1513] = -160351150;
        gv.gfca[1514] = 1457680812;
        gv.gfca[1515] = 282723908;
        gv.gfca[1516] = 331051163;
        gv.gfca[1517] = 86320160;
        gv.gfca[1518] = 237661610;
        gv.gfca[1519] = 513299701;
        gv.gfca[1520] = -319746155;
        gv.gfca[1521] = -2063716294;
        gv.gfca[1522] = -1917713202;
        gv.gfca[1523] = 520681413;
        gv.gfca[1524] = -422694279;
        gv.gfca[1525] = 28162749;
        gv.gfca[1526] = -161025380;
        gv.gfca[1527] = 1611238211;
        gv.gfca[1528] = -260910869;
        gv.gfca[1529] = -855460609;
        gv.gfca[1530] = 1447255327;
        gv.gfca[1531] = 1330250601;
        gv.gfca[1532] = 10103382;
        gv.gfca[1533] = -87852224;
        gv.gfca[1534] = -1499151304;
        gv.gfca[1535] = 1134258387;
        gv.gfca[1536] = 801096997;
        gv.gfca[1537] = 32345209;
        gv.gfca[1538] = -1992364010;
        gv.gfca[1539] = -1497827007;
        gv.gfca[1540] = -1066653362;
        gv.gfca[1541] = -590375373;
        gv.gfca[1542] = 474266643;
        gv.gfca[1543] = -326668766;
        gv.gfca[1544] = -470284339;
        gv.gfca[1545] = -1005814418;
        gv.gfca[1546] = 2030536081;
        gv.gfca[1547] = -1621908709;
        gv.gfca[1548] = -1532255580;
        gv.gfca[1549] = 862531095;
        gv.gfca[1550] = 812528437;
        gv.gfca[1551] = 95944843;
        gv.gfca[1552] = 1565393465;
        gv.gfca[1553] = -820195567;
        gv.gfca[1554] = -366384991;
        gv.gfca[1555] = -1546216117;
        gv.gfca[1556] = 506664276;
        gv.gfca[1557] = 153306811;
        gv.gfca[1558] = -339134591;
        gv.gfca[1559] = -427242449;
        gv.gfca[1560] = -1582241323;
        gv.gfca[1561] = 1019912078;
        gv.gfca[1562] = 710518753;
        gv.gfca[1563] = 1878872186;
        gv.gfca[1564] = -979600528;
        gv.gfca[1565] = 1289838696;
        gv.gfca[1566] = -1783874151;
        gv.gfca[1567] = 1246780807;
        gv.gfca[1568] = -92293000;
        gv.gfca[1569] = 227443209;
        gv.gfca[1570] = -916357811;
        gv.gfca[1571] = -1178919178;
        gv.gfca[1572] = 1383835593;
        gv.gfca[1573] = 346936584;
        gv.gfca[1574] = -1506861826;
        gv.gfca[1575] = -1114818684;
        gv.gfca[1576] = 1010166908;
        gv.gfca[1577] = 1291574847;
        gv.gfca[1578] = 807856300;
        gv.gfca[1579] = -1078252579;
        gv.gfca[1580] = 1045912665;
        gv.gfca[1581] = -260876094;
        gv.gfca[1582] = 48394498;
        gv.gfca[1583] = 995962472;
        gv.gfca[1584] = 410584100;
        gv.gfca[1585] = -365517924;
        gv.gfca[1586] = 150851419;
        gv.gfca[1587] = 1084660447;
        gv.gfca[1588] = -2119098803;
        gv.gfca[1589] = 895229007;
        gv.gfca[1590] = -217368730;
        gv.gfca[1591] = -775035075;
        gv.gfca[1592] = -1079619703;
        gv.gfca[1593] = 1392764204;
        gv.gfca[1594] = 341301470;
        gv.gfca[1595] = 456695710;
        gv.gfca[1596] = -1188496988;
        gv.gfca[1597] = 1344812858;
        gv.gfca[1598] = 1728300050;
        gv.gfca[1599] = -1671358754;
    }

    private static /* synthetic */ void gqbo() {
        gv.gfca[1700] = 1814450736;
        gv.gfca[1701] = 2045999545;
        gv.gfca[1702] = -563761489;
        gv.gfca[1703] = -333931655;
        gv.gfca[1704] = 1632371928;
        gv.gfca[1705] = -874451933;
        gv.gfca[1706] = -506258411;
        gv.gfca[1707] = 1828540232;
        gv.gfca[1708] = -1803841443;
        gv.gfca[1709] = 1151486889;
        gv.gfca[1710] = 1343040521;
        gv.gfca[1711] = -1398396394;
        gv.gfca[1712] = -1450427835;
        gv.gfca[1713] = 677827389;
        gv.gfca[1714] = 1176325044;
        gv.gfca[1715] = -641299251;
        gv.gfca[1716] = 498981296;
        gv.gfca[1717] = -1522256188;
        gv.gfca[1718] = 2044771908;
        gv.gfca[1719] = 1194878150;
        gv.gfca[1720] = -2051898144;
        gv.gfca[1721] = 205027692;
        gv.gfca[1722] = -1218717216;
        gv.gfca[1723] = -1418578464;
        gv.gfca[1724] = -647385721;
        gv.gfca[1725] = 1725403464;
        gv.gfca[1726] = -1954792470;
        gv.gfca[1727] = -1165311517;
        gv.gfca[1728] = -402466090;
        gv.gfca[1729] = 1934254190;
        gv.gfca[1730] = 185796868;
        gv.gfca[1731] = -1175913446;
        gv.gfca[1732] = -713549199;
    }

    /*
     * Exception decompiling
     */
    private void saveRememberedMinecarts() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 26[SWITCH]
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
    private void handleAutoFix() {
        block100: {
            block99: {
                block98: {
                    v0 /* !! */  = gv.nl;
                    if (true) ** GOTO lbl5
                    block60: while (true) {
                        v0 /* !! */  = (long)(v1 - gv.gfcc("gfsm", gfdd(int ), (int)86));
lbl5:
                        // 2 sources

                        switch ((int)v0 /* !! */ ) {
                            case -440419683: {
                                v1 = gv.gfcc("gfsn", gfdd(int ), (int)87);
                                continue block60;
                            }
                            case 105555845: {
                                v1 = gv.gfcc("gfso", gfdd(int ), (int)88);
                                continue block60;
                            }
                            case 1002140658: {
                                v1 = gv.gfcc("gfsp", gfdd(int ), (int)89);
                                continue block60;
                            }
                            case 1185080505: {
                                break block60;
                            }
                        }
                        break;
                    }
                    var4_1 = gv.c;
                    while (true) {
                        if ((v2 /* !! */  = (cfr_temp_0 = gv.nl - gv.gfcc("gfsq", gfdd(int ), (int)90)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                        if (v2 /* !! */  == gv.gfcc("gfsr", gfbz(int ), (int)334)) break;
                        v2 /* !! */  = (long)gv.gfcc("gfss", gfbz(int ), (int)335);
                    }
                    var3_2 /* !! */  = gv.b;
                    v3 /* !! */  = gv.nl;
                    if (true) ** GOTO lbl28
                    block62: while (true) {
                        v3 /* !! */  = (long)(v4 - gv.gfcc("gfst", gfdd(int ), (int)91));
lbl28:
                        // 2 sources

                        switch ((int)v3 /* !! */ ) {
                            case -924689363: {
                                v4 = gv.gfcc("gfsu", gfdd(int ), (int)92);
                                continue block62;
                            }
                            case 1185080505: {
                                break block62;
                            }
                            case 1842195735: {
                                v4 = gv.gfcc("gfsv", gfdd(int ), (int)93);
                                continue block62;
                            }
                        }
                        break;
                    }
                    var2_3 = gv.a;
                    if (var4_1) {
                        throw null;
lbl40:
                        // 12 sources

                        return;
                    }
                    if (var2_3 || var2_3) ** GOTO lbl40
                    v5 /* !! */  = gv.nl;
                    if (true) ** GOTO lbl47
                    block64: while (true) {
                        v5 /* !! */  = (long)(gv.gfcc("gfsx", gfdd(int ), (int)95) - gv.gfcc("gfsw", gfdd(int ), (int)94));
lbl47:
                        // 2 sources

                        switch ((int)v5 /* !! */ ) {
                            case -1658405259: {
                                continue block64;
                            }
                            case 1185080505: {
                                break block64;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v6 /* !! */  = (cfr_temp_1 = gv.nl - gv.gfcc("gfsy", gfdd(int ), (int)96)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v6 /* !! */  == gv.gfcc("gfsz", gfbz(int ), (int)336)) break;
                        v6 /* !! */  = (long)gv.gfcc("gfta", gfbz(int ), (int)337);
                    }
                    if (!this.autoFix.isValue()) break block98;
                    if (var2_3) ** GOTO lbl40
                    v7 /* !! */  = gv.nl;
                    if (true) ** GOTO lbl63
                    block66: while (true) {
                        v7 /* !! */  = (long)(gv.gfcc("gftc", gfdd(int ), (int)98) - gv.gfcc("gftb", gfdd(int ), (int)97));
lbl63:
                        // 2 sources

                        switch ((int)v7 /* !! */ ) {
                            case -538589975: {
                                continue block66;
                            }
                            case 1185080505: {
                                break block66;
                            }
                        }
                        break;
                    }
                    v8 = gv.gfcc("gftd", gfjl(int ), (int)99);
                    while (true) {
                        if ((v9 /* !! */  = (cfr_temp_2 = gv.nl - gv.gfcc("gfte", gfdd(int ), (int)100)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v9 /* !! */  == gv.gfcc("gftf", gfbz(int ), (int)338)) break;
                        v9 /* !! */  = (long)gv.gfcc("gftg", gfbz(int ), (int)339);
                    }
                    if (this.fixTimer.finished((double)v8)) break block99;
                    if (var2_3) ** GOTO lbl40
                }
                if (var2_3 || var2_3) ** GOTO lbl40
                return;
            }
            if (var2_3 || var2_3) ** GOTO lbl40
            v10 /* !! */  = gv.nl;
            if (true) ** GOTO lbl85
            block68: while (true) {
                v10 /* !! */  = (long)(v11 - gv.gfcc("gfth", gfdd(int ), (int)101));
lbl85:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case 297051359: {
                        v11 = gv.gfcc("gfti", gfdd(int ), (int)102);
                        continue block68;
                    }
                    case 854718090: {
                        v11 = gv.gfcc("gftj", gfdd(int ), (int)103);
                        continue block68;
                    }
                    case 1185080505: {
                        break block68;
                    }
                }
                break;
            }
            var1_4 = this.findDamagedPickaxeSlot();
            if (var2_3 || var2_3) ** GOTO lbl40
            if (var1_4 != gv.gfcc("gftk", gfbz(int ), (int)340)) break block100;
            if (var2_3 || var2_3) ** GOTO lbl40
            return;
        }
        if (var2_3 || var2_3) ** GOTO lbl40
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_3 = gv.nl - gv.gfcc("gftl", gfdd(int ), (int)104)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == gv.gfcc("gftm", gfbz(int ), (int)341)) break;
            v12 /* !! */  = (long)gv.gfcc("gftn", gfbz(int ), (int)342);
        }
        this.selectInventorySlot(var1_4);
        if (var2_3 || var2_3) ** GOTO lbl40
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_4 = gv.nl - gv.gfcc("gfto", gfdd(int ), (int)105)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == gv.gfcc("gftp", gfbz(int ), (int)343)) break;
            v13 /* !! */  = (long)gv.gfcc("gftq", gfbz(int ), (int)344);
        }
        v14 /* !! */  = gv.nl;
        if (true) ** GOTO lbl117
        block71: while (true) {
            v14 /* !! */  = (long)(v15 - gv.gfcc("gftr", gfdd(int ), (int)106));
lbl117:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -9555436: {
                    v15 = gv.gfcc("gfts", gfdd(int ), (int)107);
                    continue block71;
                }
                case 1185080505: {
                    break block71;
                }
                case 1424286924: {
                    v15 = gv.gfcc("gftt", gfdd(int ), (int)108);
                    continue block71;
                }
            }
            break;
        }
        v16 = gv.mc.method_1562();
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_5 = gv.nl - gv.gfcc("gftu", gfdd(int ), (int)109)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == gv.gfcc("gftv", gfbz(int ), (int)345)) break;
            v17 /* !! */  = (long)gv.gfcc("gftw", gfbz(int ), (int)346);
        }
        v16.method_45730("fix all");
        if (var2_3 || var2_3) ** GOTO lbl40
        while (true) {
            if ((v18 /* !! */  = (cfr_temp_6 = gv.nl - gv.gfcc("gftx", gfdd(int ), (int)110)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v18 /* !! */  == gv.gfcc("gfty", gfbz(int ), (int)347)) break;
            v18 /* !! */  = (long)gv.gfcc("gftz", gfbz(int ), (int)348);
        }
        v19 /* !! */  = gv.nl;
        if (true) ** GOTO lbl143
        block74: while (true) {
            v19 /* !! */  = (long)(v20 - gv.gfcc("gfua", gfdd(int ), (int)111));
lbl143:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case -1009479725: {
                    v20 = gv.gfcc("gfub", gfdd(int ), (int)112);
                    continue block74;
                }
                case 1185080505: {
                    break block74;
                }
                case 1372784172: {
                    v20 = gv.gfcc("gfuc", gfdd(int ), (int)113);
                    continue block74;
                }
                case 1737465802: {
                    v20 = gv.gfcc("gfud", gfdd(int ), (int)114);
                    continue block74;
                }
            }
            break;
        }
        this.fixTimer.reset();
        if (var2_3) ** GOTO lbl40
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
                var3_2 /* !! */  = (int)gv.gfcc("gfue", gfbz(int ), (int)349);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl240
            }
lbl168:
            // 3 sources

            case 1: {
                var3_2 /* !! */  = (int)gv.gfcc("gfuf", gfbz(int ), (int)350);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl212
            }
            case 2: {
                var3_2 /* !! */  = (int)gv.gfcc("gfug", gfbz(int ), (int)351);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl178:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)gv.gfcc("gfuh", gfbz(int ), (int)352);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl248
            }
            case 4: {
                var3_2 /* !! */  = (int)gv.gfcc("gfui", gfbz(int ), (int)353);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl188:
            // 2 sources

            case 5: {
                var3_2 /* !! */  = (int)gv.gfcc("gfuj", gfbz(int ), (int)354);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl193:
            // 2 sources

            case 6: {
                var3_2 /* !! */  = (int)gv.gfcc("gfuk", gfbz(int ), (int)355);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl212
            }
            case 7: {
                var3_2 /* !! */  = (int)gv.gfcc("gful", gfbz(int ), (int)356);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl212
            }
            case 8: {
                var3_2 /* !! */  = (int)gv.gfcc("gfum", gfbz(int ), (int)357);
                if (!var4_1) ** GOTO lbl188
                throw null;
            }
lbl207:
            // 2 sources

            case 9: {
                var3_2 /* !! */  = (int)gv.gfcc("gfun", gfbz(int ), (int)358);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl260
            }
lbl212:
            // 6 sources

            case 10: {
                var3_2 /* !! */  = (int)gv.gfcc("gfuo", gfbz(int ), (int)359);
                if (!var4_1) ** GOTO lbl168
                throw null;
            }
lbl216:
            // 2 sources

            case 11: {
                var3_2 /* !! */  = (int)gv.gfcc("gfup", gfbz(int ), (int)360);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl260
            }
            case 12: {
                var3_2 /* !! */  = (int)gv.gfcc("gfuq", gfbz(int ), (int)361);
                if (!var4_1) ** GOTO lbl212
                throw null;
            }
            case 13: {
                var3_2 /* !! */  = (int)gv.gfcc("gfur", gfbz(int ), (int)362);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl235
            }
lbl230:
            // 2 sources

            case 14: {
                do {
                    var3_2 /* !! */  = (int)gv.gfcc("gfus", gfbz(int ), (int)363);
                } while (!var4_1);
                throw null;
            }
lbl235:
            // 2 sources

            case 15: {
                var3_2 /* !! */  = (int)gv.gfcc("gfut", gfbz(int ), (int)364);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl260
            }
lbl240:
            // 3 sources

            case 16: {
                var3_2 /* !! */  = (int)gv.gfcc("gfuu", gfbz(int ), (int)365);
                if (!var4_1) ** GOTO lbl178
                throw null;
            }
lbl244:
            // 2 sources

            case 17: {
                var3_2 /* !! */  = (int)gv.gfcc("gfuv", gfbz(int ), (int)366);
                if (!var4_1) ** GOTO lbl240
                throw null;
            }
lbl248:
            // 2 sources

            case 18: {
                var3_2 /* !! */  = (int)gv.gfcc("gfuw", gfbz(int ), (int)367);
                if (!var4_1) ** GOTO lbl193
                throw null;
            }
            case 19: {
                var3_2 /* !! */  = (int)gv.gfcc("gfux", gfbz(int ), (int)368);
                if (!var4_1) ** GOTO lbl230
                throw null;
            }
            case 20: {
                var3_2 /* !! */  = (int)gv.gfcc("gfuy", gfbz(int ), (int)369);
                if (!var4_1) ** GOTO lbl244
                throw null;
            }
lbl260:
            // 4 sources

            case 21: {
                var3_2 /* !! */  = (int)gv.gfcc("gfuz", gfbz(int ), (int)370);
                if (!var4_1) ** GOTO lbl168
                throw null;
            }
            case 22: 
        }
        do {
            var3_2 /* !! */  = (int)gv.gfcc("gfva", gfbz(int ), (int)371);
        } while (!var4_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_2338 findNearestEnderChest(int var1_1) {
        var14_2 = gv.c;
        var13_3 /* !! */  = gv.b;
        var12_4 = gv.a;
        if (var14_2) {
            throw null;
lbl6:
            // 27 sources

            return null;
        }
        if (var12_4 || var12_4) ** GOTO lbl6
        var2_5 = gv.mc.field_1724.method_24515();
        if (var12_4 || var12_4) ** GOTO lbl6
        var3_6 = null;
        if (var13_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var13_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var12_4 || var12_4) ** GOTO lbl6
                var4_7 /* !! */  = gv.gfcc("gjru", gfjl(int ), (int)398);
                if (var12_4 || var12_4) ** GOTO lbl6
                var6_8 = -var1_1;
                if (var12_4) ** GOTO lbl6
                do {
                    if (var12_4 || var12_4) ** GOTO lbl6
                    if (var6_8 > var1_1) ** GOTO lbl67
                    if (var12_4 || var12_4) ** GOTO lbl6
                    var7_9 = gv.gfcc("gjry", gfbz(int ), (int)1023);
                    if (var12_4) ** GOTO lbl6
                    do {
                        if (var12_4 || var12_4) ** GOTO lbl6
                        if (var7_9 > gv.gfcc("gjsb", gfbz(int ), (int)1024)) ** GOTO lbl62
                        if (var12_4 || var12_4) ** GOTO lbl6
                        var8_10 = -var1_1;
                        if (var12_4) ** GOTO lbl6
                        do {
                            if (var12_4 || var12_4) ** GOTO lbl6
                            if (var8_10 > var1_1) ** GOTO lbl57
                            if (var12_4 || var12_4) ** GOTO lbl6
                            var9_11 = var2_5.method_10069(var6_8, (int)var7_9, var8_10);
                            if (var12_4 || var12_4) ** GOTO lbl6
                            if (gv.mc.field_1687.method_8320(var9_11).method_27852(class_2246.field_10443)) ** GOTO lbl43
                            if (var12_4 || var12_4) ** GOTO lbl6
                            if (var14_2) {
                                throw null;
                            }
                            ** GOTO lbl52
lbl43:
                            // 1 sources

                            if (var12_4 || var12_4) ** GOTO lbl6
                            var10_12 = gv.mc.field_1724.method_5707(class_243.method_24953((class_2382)var9_11));
                            if (var12_4 || var12_4) ** GOTO lbl6
                            if (!(var10_12 < var4_7 /* !! */ )) ** GOTO lbl52
                            if (var12_4 || var12_4) ** GOTO lbl6
                            var4_7 /* !! */  = (CallSite)var10_12;
                            if (var12_4 || var12_4) ** GOTO lbl6
                            var3_6 = var9_11;
                            if (var12_4) ** GOTO lbl6
lbl52:
                            // 3 sources

                            if (var12_4 || var12_4) ** GOTO lbl6
                            ++var8_10;
                            if (var12_4) ** GOTO lbl6
                        } while (!var14_2);
                        throw null;
lbl57:
                        // 1 sources

                        if (var12_4 || var12_4) ** GOTO lbl6
                        ++var7_9;
                        if (var12_4) ** GOTO lbl6
                    } while (!var14_2);
                    throw null;
lbl62:
                    // 1 sources

                    if (var12_4 || var12_4) ** GOTO lbl6
                    ++var6_8;
                    if (var12_4) ** GOTO lbl6
                } while (!var14_2);
                throw null;
lbl67:
                // 1 sources

                if (!var12_4 && !var12_4) ** break;
                ** continue;
                return var3_6;
            }
            case 0: {
                var13_3 /* !! */  = (int)gv.gfcc("gjsm", gfbz(int ), (int)1025);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl204
            }
            case 1: {
                do {
                    var13_3 /* !! */  = (int)gv.gfcc("gjsq", gfbz(int ), (int)1026);
                } while (!var14_2);
                throw null;
            }
            case 2: {
                var13_3 /* !! */  = (int)gv.gfcc("gjss", gfbz(int ), (int)1027);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl236
            }
lbl85:
            // 2 sources

            case 3: {
                var13_3 /* !! */  = (int)gv.gfcc("gjsx", gfbz(int ), (int)1028);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl208
            }
lbl90:
            // 4 sources

            case 4: {
                var13_3 /* !! */  = (int)gv.gfcc("gjta", gfbz(int ), (int)1029);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl110
            }
lbl95:
            // 2 sources

            case 5: {
                var13_3 /* !! */  = (int)gv.gfcc("gjtb", gfbz(int ), (int)1030);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl191
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var13_3 /* !! */  = (int)gv.gfcc("gjtc", gfbz(int ), (int)1031);
                    if (!var14_2) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl105:
            // 2 sources

            case 7: {
                var13_3 /* !! */  = (int)gv.gfcc("gjtd", gfbz(int ), (int)1032);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl213
            }
lbl110:
            // 2 sources

            case 8: {
                var13_3 /* !! */  = (int)gv.gfcc("gjte", gfbz(int ), (int)1033);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl115:
            // 3 sources

            case 9: {
                var13_3 /* !! */  = (int)gv.gfcc("gjth", gfbz(int ), (int)1034);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl213
            }
            case 10: {
                var13_3 /* !! */  = (int)gv.gfcc("gjtn", gfbz(int ), (int)1035);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl282
            }
            case 11: {
                var13_3 /* !! */  = (int)gv.gfcc("gjto", gfbz(int ), (int)1036);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl130:
            // 2 sources

            case 12: {
                var13_3 /* !! */  = (int)gv.gfcc("gjtq", gfbz(int ), (int)1037);
                if (!var14_2) ** GOTO lbl90
                throw null;
            }
            case 13: {
                var13_3 /* !! */  = (int)gv.gfcc("gjts", gfbz(int ), (int)1038);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl232
            }
lbl139:
            // 2 sources

            case 14: {
                var13_3 /* !! */  = (int)gv.gfcc("gjtv", gfbz(int ), (int)1039);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl227
            }
            case 15: {
                var13_3 /* !! */  = (int)gv.gfcc("gjtx", gfbz(int ), (int)1040);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl273
            }
            case 16: {
                var13_3 /* !! */  = (int)gv.gfcc("gjua", gfbz(int ), (int)1041);
                if (!var14_2) ** GOTO lbl90
                throw null;
            }
            case 17: {
                var13_3 /* !! */  = (int)gv.gfcc("gjue", gfbz(int ), (int)1042);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl182
            }
lbl158:
            // 3 sources

            case 18: {
                var13_3 /* !! */  = (int)gv.gfcc("gjuh", gfbz(int ), (int)1043);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl295
            }
lbl163:
            // 2 sources

            case 19: {
                var13_3 /* !! */  = (int)gv.gfcc("gjui", gfbz(int ), (int)1044);
                if (!var14_2) ** GOTO lbl130
                throw null;
            }
lbl167:
            // 3 sources

            case 20: {
                var13_3 /* !! */  = (int)gv.gfcc("gjuj", gfbz(int ), (int)1045);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl195
            }
            case 21: {
                var13_3 /* !! */  = (int)gv.gfcc("gjuk", gfbz(int ), (int)1046);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl257
            }
            case 22: {
                var13_3 /* !! */  = (int)gv.gfcc("gjul", gfbz(int ), (int)1047);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl218
            }
lbl182:
            // 2 sources

            case 23: {
                var13_3 /* !! */  = (int)gv.gfcc("gjum", gfbz(int ), (int)1048);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl278
            }
            case 24: {
                var13_3 /* !! */  = (int)gv.gfcc("gjup", gfbz(int ), (int)1049);
                if (!var14_2) ** GOTO lbl85
                throw null;
            }
lbl191:
            // 2 sources

            case 25: {
                var13_3 /* !! */  = (int)gv.gfcc("gjut", gfbz(int ), (int)1050);
                if (!var14_2) ** GOTO lbl105
                throw null;
            }
lbl195:
            // 2 sources

            case 26: {
                var13_3 /* !! */  = (int)gv.gfcc("gjux", gfbz(int ), (int)1051);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl222
            }
            case 27: {
                var13_3 /* !! */  = (int)gv.gfcc("gjuy", gfbz(int ), (int)1052);
                if (!var14_2) ** GOTO lbl95
                throw null;
            }
lbl204:
            // 3 sources

            case 28: {
                var13_3 /* !! */  = (int)gv.gfcc("gjuz", gfbz(int ), (int)1053);
                if (var14_2) {
                    throw null;
                }
            }
lbl208:
            // 4 sources

            case 29: {
                var13_3 /* !! */  = (int)gv.gfcc("gjvc", gfbz(int ), (int)1054);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl240
            }
lbl213:
            // 3 sources

            case 30: {
                var13_3 /* !! */  = (int)gv.gfcc("gjvg", gfbz(int ), (int)1055);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl261
            }
lbl218:
            // 3 sources

            case 31: {
                var13_3 /* !! */  = (int)gv.gfcc("gjvp", gfbz(int ), (int)1056);
                if (!var14_2) ** GOTO lbl115
                throw null;
            }
lbl222:
            // 2 sources

            case 32: {
                var13_3 /* !! */  = (int)gv.gfcc("gjvq", gfbz(int ), (int)1057);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl249
            }
lbl227:
            // 4 sources

            case 33: {
                var13_3 /* !! */  = (int)gv.gfcc("gjvt", gfbz(int ), (int)1058);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl282
            }
lbl232:
            // 2 sources

            case 34: {
                var13_3 /* !! */  = (int)gv.gfcc("gjvy", gfbz(int ), (int)1059);
                if (!var14_2) ** GOTO lbl204
                throw null;
            }
lbl236:
            // 3 sources

            case 35: {
                var13_3 /* !! */  = (int)gv.gfcc("gjwa", gfbz(int ), (int)1060);
                if (!var14_2) ** GOTO lbl115
                throw null;
            }
lbl240:
            // 3 sources

            case 36: {
                var13_3 /* !! */  = (int)gv.gfcc("gjwb", gfbz(int ), (int)1061);
                if (!var14_2) ** GOTO lbl167
                throw null;
            }
            case 37: {
                var13_3 /* !! */  = (int)gv.gfcc("gjwe", gfbz(int ), (int)1062);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl287
            }
lbl249:
            // 2 sources

            case 38: {
                var13_3 /* !! */  = (int)gv.gfcc("gjwk", gfbz(int ), (int)1063);
                if (!var14_2) ** GOTO lbl218
                throw null;
            }
            case 39: {
                var13_3 /* !! */  = (int)gv.gfcc("gjwp", gfbz(int ), (int)1064);
                if (!var14_2) ** GOTO lbl167
                throw null;
            }
lbl257:
            // 2 sources

            case 40: {
                var13_3 /* !! */  = (int)gv.gfcc("gjws", gfbz(int ), (int)1065);
                if (!var14_2) ** GOTO lbl240
                throw null;
            }
lbl261:
            // 3 sources

            case 41: {
                var13_3 /* !! */  = (int)gv.gfcc("gjwt", gfbz(int ), (int)1066);
                if (!var14_2) ** GOTO lbl90
                throw null;
            }
            case 42: {
                var13_3 /* !! */  = (int)gv.gfcc("gjww", gfbz(int ), (int)1067);
                if (!var14_2) ** GOTO lbl227
                throw null;
            }
            case 43: {
                var13_3 /* !! */  = (int)gv.gfcc("gjxb", gfbz(int ), (int)1068);
                if (!var14_2) ** GOTO lbl163
                throw null;
            }
lbl273:
            // 2 sources

            case 44: {
                do {
                    var13_3 /* !! */  = (int)gv.gfcc("gjxd", gfbz(int ), (int)1069);
                } while (!var14_2);
                throw null;
            }
lbl278:
            // 2 sources

            case 45: {
                var13_3 /* !! */  = (int)gv.gfcc("gjxl", gfbz(int ), (int)1070);
                if (!var14_2) ** GOTO lbl139
                throw null;
            }
lbl282:
            // 3 sources

            case 46: {
                var13_3 /* !! */  = (int)gv.gfcc("gjxm", gfbz(int ), (int)1071);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl291
            }
lbl287:
            // 2 sources

            case 47: {
                var13_3 /* !! */  = (int)gv.gfcc("gjxq", gfbz(int ), (int)1072);
                if (!var14_2) ** GOTO lbl227
                throw null;
            }
lbl291:
            // 2 sources

            case 48: {
                var13_3 /* !! */  = (int)gv.gfcc("gjxv", gfbz(int ), (int)1073);
                if (!var14_2) ** GOTO lbl261
                throw null;
            }
lbl295:
            // 2 sources

            case 49: {
                var13_3 /* !! */  = (int)gv.gfcc("gjxw", gfbz(int ), (int)1074);
                if (!var14_2) ** GOTO lbl236
                throw null;
            }
            case 50: 
        }
        var13_3 /* !! */  = (int)gv.gfcc("gjxx", gfbz(int ), (int)1075);
        ** while (!var14_2)
lbl302:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gqdp() {
        gv.gfcb[400] = -312258281;
        gv.gfcb[401] = 770816864;
        gv.gfcb[402] = -2034179639;
        gv.gfcb[403] = 796451631;
        gv.gfcb[404] = 868539029;
        gv.gfcb[405] = -1926839499;
        gv.gfcb[406] = -1517642639;
        gv.gfcb[407] = -161104567;
        gv.gfcb[408] = -394556943;
        gv.gfcb[409] = 1044676150;
        gv.gfcb[410] = -1838076733;
        gv.gfcb[411] = 1168475489;
        gv.gfcb[412] = 180998598;
        gv.gfcb[413] = -596231483;
        gv.gfcb[414] = 1876579938;
        gv.gfcb[415] = -1624279573;
        gv.gfcb[416] = 1456465537;
        gv.gfcb[417] = 1776424696;
        gv.gfcb[418] = 1682863613;
        gv.gfcb[419] = -674877646;
        gv.gfcb[420] = 2098847777;
        gv.gfcb[421] = 1706229403;
        gv.gfcb[422] = -77955736;
        gv.gfcb[423] = -1336179956;
        gv.gfcb[424] = -1749983114;
        gv.gfcb[425] = 315457783;
        gv.gfcb[426] = 300087676;
        gv.gfcb[427] = 1714401350;
        gv.gfcb[428] = 747775994;
        gv.gfcb[429] = -894510304;
        gv.gfcb[430] = 1416104192;
        gv.gfcb[431] = -1006688868;
        gv.gfcb[432] = 982655067;
        gv.gfcb[433] = 1679515810;
        gv.gfcb[434] = -2003245747;
        gv.gfcb[435] = 835127186;
        gv.gfcb[436] = -1212493882;
        gv.gfcb[437] = -1754028180;
        gv.gfcb[438] = -402337484;
        gv.gfcb[439] = 988528515;
        gv.gfcb[440] = -1833943960;
        gv.gfcb[441] = 1033633546;
        gv.gfcb[442] = -642674145;
        gv.gfcb[443] = -1454315526;
        gv.gfcb[444] = 1873019953;
        gv.gfcb[445] = 193439514;
        gv.gfcb[446] = -1438787722;
        gv.gfcb[447] = -585946561;
        gv.gfcb[448] = -1678005030;
        gv.gfcb[449] = -140740360;
        gv.gfcb[450] = -877120445;
        gv.gfcb[451] = 2055856437;
        gv.gfcb[452] = -1866633175;
        gv.gfcb[453] = -935659333;
        gv.gfcb[454] = -38170856;
        gv.gfcb[455] = 473929059;
        gv.gfcb[456] = -1287190413;
        gv.gfcb[457] = 1593966949;
        gv.gfcb[458] = -35902416;
        gv.gfcb[459] = -101865905;
        gv.gfcb[460] = 2047230306;
        gv.gfcb[461] = -1708883883;
        gv.gfcb[462] = -426330669;
        gv.gfcb[463] = -1988578030;
        gv.gfcb[464] = 1478709496;
        gv.gfcb[465] = -122641367;
        gv.gfcb[466] = -1014416173;
        gv.gfcb[467] = 124797064;
        gv.gfcb[468] = -1128738894;
        gv.gfcb[469] = 1972355218;
        gv.gfcb[470] = 813012349;
        gv.gfcb[471] = -2041585542;
        gv.gfcb[472] = -1199540939;
        gv.gfcb[473] = -1822824330;
        gv.gfcb[474] = 1846648417;
        gv.gfcb[475] = 91311192;
        gv.gfcb[476] = -1337399955;
        gv.gfcb[477] = 1240073778;
        gv.gfcb[478] = 968243427;
        gv.gfcb[479] = -1119102372;
        gv.gfcb[480] = -299325145;
        gv.gfcb[481] = -568060702;
        gv.gfcb[482] = 370716387;
        gv.gfcb[483] = 1721889724;
        gv.gfcb[484] = 1346706254;
        gv.gfcb[485] = -1247717397;
        gv.gfcb[486] = -200015478;
        gv.gfcb[487] = 1679907116;
        gv.gfcb[488] = 780598934;
        gv.gfcb[489] = -933151215;
        gv.gfcb[490] = 987517400;
        gv.gfcb[491] = 741333230;
        gv.gfcb[492] = -588285361;
        gv.gfcb[493] = 1221418230;
        gv.gfcb[494] = 474770320;
        gv.gfcb[495] = -1224016063;
        gv.gfcb[496] = 266228041;
        gv.gfcb[497] = 1889151677;
        gv.gfcb[498] = -1319317589;
        gv.gfcb[499] = -159631018;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void handleRegionDeny() {
        block94: {
            block93: {
                var5_1 = gv.c;
                var4_2 /* !! */  = gv.b;
                var3_3 = gv.a;
                if (var5_1) {
                    throw null;
lbl6:
                    // 25 sources

                    return;
                }
                if (var3_3 || var3_3) ** GOTO lbl6
                if (this.targetMinecart == null) break block93;
                if (var3_3 || var3_3) ** GOTO lbl6
                this.markBlockedMinecart(this.key(this.targetMinecart.method_24515()));
                if (var3_3) ** GOTO lbl6
                if (var5_1) {
                    throw null;
                }
                break block94;
            }
            if (var3_3 || var3_3) ** GOTO lbl6
            if (this.openedMinecartKey == null) break block94;
            if (var3_3 || var3_3) ** GOTO lbl6
            this.markBlockedMinecart(this.openedMinecartKey);
            if (var3_3) ** GOTO lbl6
        }
        if (var3_3 || var3_3) ** GOTO lbl6
        this.stopBaritone();
        if (var3_3 || var3_3) ** GOTO lbl6
        this.targetMinecart = null;
        if (var3_3 || var3_3) ** GOTO lbl6
        this.openedMinecartKey = null;
        if (var3_3 || var3_3) ** GOTO lbl6
        this.currentPathKey = null;
        if (var3_3 || var3_3) ** GOTO lbl6
        this.exploreTarget = null;
        if (var3_3 || var3_3) ** GOTO lbl6
        this.lastMinecartScanPos = null;
        if (var3_3) ** GOTO lbl6
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_3) ** GOTO lbl6
                var1_4 = gv.gfcc("gfmv", gfbz(int ), (int)209);
                if (var3_3) ** GOTO lbl6
                do {
                    if (var3_3 || var3_3) ** GOTO lbl6
                    if (var1_4 >= gv.EXPLORE_DIRECTIONS.length) ** GOTO lbl62
                    if (var3_3 || var3_3) ** GOTO lbl6
                    this.rotateExploreDirection();
                    if (var3_3 || var3_3) ** GOTO lbl6
                    var2_5 = this.createExploreTarget();
                    if (var3_3 || var3_3) ** GOTO lbl6
                    if (var2_5 == null) ** GOTO lbl57
                    if (var3_3 || var3_3) ** GOTO lbl6
                    this.exploreTarget = var2_5;
                    if (var3_3 || var3_3) ** GOTO lbl6
                    this.pathToExplore(var2_5);
                    if (var3_3 || var3_3) ** GOTO lbl6
                    return;
lbl57:
                    // 1 sources

                    if (var3_3 || var3_3) ** GOTO lbl6
                    ++var1_4;
                    if (var3_3) ** GOTO lbl6
                } while (!var5_1);
                throw null;
lbl62:
                // 1 sources

                if (!var3_3 && !var3_3) ** break;
                ** continue;
                return;
            }
lbl65:
            // 2 sources

            case 0: {
                var4_2 /* !! */  = (int)gv.gfcc("gfmw", gfbz(int ), (int)210);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl225
            }
lbl70:
            // 2 sources

            case 1: {
                var4_2 /* !! */  = (int)gv.gfcc("gfmx", gfbz(int ), (int)211);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl146
            }
            case 2: {
                var4_2 /* !! */  = (int)gv.gfcc("gfmy", gfbz(int ), (int)212);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl238
            }
            case 3: {
                var4_2 /* !! */  = (int)gv.gfcc("gfmz", gfbz(int ), (int)213);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl105
            }
lbl85:
            // 3 sources

            case 4: {
                var4_2 /* !! */  = (int)gv.gfcc("gfna", gfbz(int ), (int)214);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl90:
            // 4 sources

            case 5: {
                var4_2 /* !! */  = (int)gv.gfcc("gfnb", gfbz(int ), (int)215);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl262
            }
lbl95:
            // 3 sources

            case 6: {
                var4_2 /* !! */  = (int)gv.gfcc("gfnc", gfbz(int ), (int)216);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl209
            }
            case 7: {
                var4_2 /* !! */  = (int)gv.gfcc("gfnd", gfbz(int ), (int)217);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl182
            }
lbl105:
            // 2 sources

            case 8: {
                var4_2 /* !! */  = (int)gv.gfcc("gfne", gfbz(int ), (int)218);
                if (!var5_1) ** GOTO lbl85
                throw null;
            }
lbl109:
            // 2 sources

            case 9: {
                var4_2 /* !! */  = (int)gv.gfcc("gfnf", gfbz(int ), (int)219);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl217
            }
lbl114:
            // 3 sources

            case 10: {
                var4_2 /* !! */  = (int)gv.gfcc("gfng", gfbz(int ), (int)220);
                if (!var5_1) ** GOTO lbl95
                throw null;
            }
lbl118:
            // 3 sources

            case 11: {
                var4_2 /* !! */  = (int)gv.gfcc("gfnh", gfbz(int ), (int)221);
                if (!var5_1) ** GOTO lbl90
                throw null;
            }
lbl122:
            // 3 sources

            case 12: {
                var4_2 /* !! */  = (int)gv.gfcc("gfni", gfbz(int ), (int)222);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl191
            }
lbl127:
            // 3 sources

            case 13: {
                var4_2 /* !! */  = (int)gv.gfcc("gfnj", gfbz(int ), (int)223);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl164
            }
            case 14: {
                var4_2 /* !! */  = (int)gv.gfcc("gfnk", gfbz(int ), (int)224);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl182
            }
lbl137:
            // 2 sources

            case 15: {
                var4_2 /* !! */  = (int)gv.gfcc("gfnl", gfbz(int ), (int)225);
                if (!var5_1) ** GOTO lbl118
                throw null;
            }
            case 16: {
                var4_2 /* !! */  = (int)gv.gfcc("gfnm", gfbz(int ), (int)226);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl242
            }
lbl146:
            // 3 sources

            case 17: {
                var4_2 /* !! */  = (int)gv.gfcc("gfnn", gfbz(int ), (int)227);
                if (!var5_1) ** GOTO lbl122
                throw null;
            }
lbl150:
            // 2 sources

            case 18: {
                do {
                    var4_2 /* !! */  = (int)gv.gfcc("gfno", gfbz(int ), (int)228);
                } while (!var5_1);
                throw null;
            }
lbl155:
            // 2 sources

            case 19: {
                var4_2 /* !! */  = (int)gv.gfcc("gfnp", gfbz(int ), (int)229);
                if (!var5_1) ** GOTO lbl122
                throw null;
            }
lbl159:
            // 2 sources

            case 20: {
                var4_2 /* !! */  = (int)gv.gfcc("gfnq", gfbz(int ), (int)230);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl258
            }
lbl164:
            // 2 sources

            case 21: {
                var4_2 /* !! */  = (int)gv.gfcc("gfnr", gfbz(int ), (int)231);
                if (!var5_1) ** GOTO lbl90
                throw null;
            }
lbl168:
            // 2 sources

            case 22: {
                var4_2 /* !! */  = (int)gv.gfcc("gfns", gfbz(int ), (int)232);
                if (!var5_1) ** GOTO lbl90
                throw null;
            }
            case 23: {
                var4_2 /* !! */  = (int)gv.gfcc("gfnt", gfbz(int ), (int)233);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl250
            }
            case 24: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)gv.gfcc("gfnu", gfbz(int ), (int)234);
                    if (!var5_1) ** GOTO lbl137
                    throw null;
                }
            }
lbl182:
            // 4 sources

            case 25: {
                var4_2 /* !! */  = (int)gv.gfcc("gfnv", gfbz(int ), (int)235);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl258
            }
lbl187:
            // 2 sources

            case 26: {
                var4_2 /* !! */  = (int)gv.gfcc("gfnw", gfbz(int ), (int)236);
                if (!var5_1) ** GOTO lbl159
                throw null;
            }
lbl191:
            // 2 sources

            case 27: {
                var4_2 /* !! */  = (int)gv.gfcc("gfnx", gfbz(int ), (int)237);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl200
            }
            case 28: {
                var4_2 /* !! */  = (int)gv.gfcc("gfny", gfbz(int ), (int)238);
                if (!var5_1) ** GOTO lbl118
                throw null;
            }
lbl200:
            // 2 sources

            case 29: {
                var4_2 /* !! */  = (int)gv.gfcc("gfnz", gfbz(int ), (int)239);
                if (!var5_1) ** GOTO lbl150
                throw null;
            }
            case 30: {
                var4_2 /* !! */  = (int)gv.gfcc("gfoa", gfbz(int ), (int)240);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl250
            }
lbl209:
            // 2 sources

            case 31: {
                var4_2 /* !! */  = (int)gv.gfcc("gfob", gfbz(int ), (int)241);
                if (!var5_1) ** GOTO lbl146
                throw null;
            }
            case 32: {
                var4_2 /* !! */  = (int)gv.gfcc("gfoc", gfbz(int ), (int)242);
                if (!var5_1) ** GOTO lbl187
                throw null;
            }
lbl217:
            // 4 sources

            case 33: {
                var4_2 /* !! */  = (int)gv.gfcc("gfod", gfbz(int ), (int)243);
                if (!var5_1) ** GOTO lbl70
                throw null;
            }
            case 34: {
                var4_2 /* !! */  = (int)gv.gfcc("gfoe", gfbz(int ), (int)244);
                if (!var5_1) ** GOTO lbl127
                throw null;
            }
lbl225:
            // 2 sources

            case 35: {
                var4_2 /* !! */  = (int)gv.gfcc("gfof", gfbz(int ), (int)245);
                if (!var5_1) ** GOTO lbl155
                throw null;
            }
            case 36: {
                do {
                    var4_2 /* !! */  = (int)gv.gfcc("gfog", gfbz(int ), (int)246);
                } while (!var5_1);
                throw null;
            }
            case 37: {
                var4_2 /* !! */  = (int)gv.gfcc("gfoh", gfbz(int ), (int)247);
                if (!var5_1) ** GOTO lbl217
                throw null;
            }
lbl238:
            // 2 sources

            case 38: {
                var4_2 /* !! */  = (int)gv.gfcc("gfoi", gfbz(int ), (int)248);
                if (!var5_1) ** GOTO lbl85
                throw null;
            }
lbl242:
            // 2 sources

            case 39: {
                var4_2 /* !! */  = (int)gv.gfcc("gfoj", gfbz(int ), (int)249);
                if (!var5_1) ** GOTO lbl109
                throw null;
            }
            case 40: {
                var4_2 /* !! */  = (int)gv.gfcc("gfok", gfbz(int ), (int)250);
                if (!var5_1) ** GOTO lbl114
                throw null;
            }
lbl250:
            // 3 sources

            case 41: {
                var4_2 /* !! */  = (int)gv.gfcc("gfol", gfbz(int ), (int)251);
                if (!var5_1) ** GOTO lbl65
                throw null;
            }
            case 42: {
                var4_2 /* !! */  = (int)gv.gfcc("gfom", gfbz(int ), (int)252);
                if (!var5_1) ** GOTO lbl114
                throw null;
            }
lbl258:
            // 3 sources

            case 43: {
                var4_2 /* !! */  = (int)gv.gfcc("gfon", gfbz(int ), (int)253);
                if (!var5_1) ** GOTO lbl182
                throw null;
            }
lbl262:
            // 2 sources

            case 44: {
                var4_2 /* !! */  = (int)gv.gfcc("gfoo", gfbz(int ), (int)254);
                if (!var5_1) ** GOTO lbl95
                throw null;
            }
            case 45: {
                var4_2 /* !! */  = (int)gv.gfcc("gfop", gfbz(int ), (int)255);
                if (!var5_1) ** GOTO lbl127
                throw null;
            }
            case 46: {
                var4_2 /* !! */  = (int)gv.gfcc("gfoq", gfbz(int ), (int)256);
                if (!var5_1) ** GOTO lbl217
                throw null;
            }
            case 47: 
        }
        var4_2 /* !! */  = (int)gv.gfcc("gfor", gfbz(int ), (int)257);
        ** while (!var5_1)
lbl277:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean shouldScanMinecarts() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = gv.nl - gv.gfcc("ggab", gfdd(int ), (int)152)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == gv.gfcc("ggac", gfbz(int ), (int)465)) break;
            v0 /* !! */  = (long)gv.gfcc("ggad", gfbz(int ), (int)466);
        }
        var7_1 = gv.c;
        while (true) {
            block99: {
                if ((v1 /* !! */  = (cfr_temp_2 = gv.nl - gv.gfcc("ggae", gfdd(int ), (int)153)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  != gv.gfcc("ggaf", gfbz(int ), (int)467)) break block99;
                var6_2 /* !! */  = gv.b;
                v2 /* !! */  = gv.nl;
                if (true) ** GOTO lbl18
            }
            v1 /* !! */  = (long)gv.gfcc("ggag", gfbz(int ), (int)468);
        }
        block59: while (true) {
            v2 /* !! */  = (long)(v3 - gv.gfcc("ggah", gfdd(int ), (int)154));
lbl18:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1522160599: {
                    v3 = gv.gfcc("ggai", gfdd(int ), (int)155);
                    continue block59;
                }
                case 1005056967: {
                    v3 = gv.gfcc("ggaj", gfdd(int ), (int)156);
                    continue block59;
                }
                case 1185080505: {
                    break block59;
                }
            }
            break;
        }
        var5_3 = gv.a;
        if (var7_1) {
            throw null;
        }
        if (var5_3 || var5_3) return (boolean)gv.gfcc("ggak", gfbz(int ), (int)469);
        v4 /* !! */  = gv.nl;
        if (true) ** GOTO lbl35
        block60: while (true) {
            v4 /* !! */  = (long)(v5 - gv.gfcc("ggal", gfdd(int ), (int)157));
lbl35:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1946963618: {
                    v5 = gv.gfcc("ggam", gfdd(int ), (int)158);
                    continue block60;
                }
                case 133984187: {
                    v5 = gv.gfcc("ggan", gfdd(int ), (int)159);
                    continue block60;
                }
                case 922879304: {
                    v5 = gv.gfcc("ggao", gfdd(int ), (int)160);
                    continue block60;
                }
                case 1185080505: {
                    break block60;
                }
            }
            break;
        }
        if (this.lastMinecartScanPos == null) {
            if (var5_3 || var5_3) return (boolean)gv.gfcc("ggak", gfbz(int ), (int)469);
            return (boolean)gv.gfcc("ggap", gfbz(int ), (int)470);
        }
        if (var5_3 || var5_3) return (boolean)gv.gfcc("ggak", gfbz(int ), (int)469);
        v6 /* !! */  = gv.nl;
        block61: while (true) {
            switch ((int)v6 /* !! */ ) {
                case 0x4341441: {
                    v6 /* !! */  = (long)(gv.gfcc("ggar", gfdd(int ), (int)162) - gv.gfcc("ggaq", gfdd(int ), (int)161));
                    continue block61;
                }
                case 1185080505: {
                    break block61;
                }
            }
            break;
        }
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_3 = gv.nl - gv.gfcc("ggas", gfdd(int ), (int)163)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == gv.gfcc("ggat", gfbz(int ), (int)471)) break;
            v7 /* !! */  = (long)gv.gfcc("ggau", gfbz(int ), (int)472);
        }
        v8 = gv.mc.field_1724;
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_4 = gv.nl - gv.gfcc("ggav", gfdd(int ), (int)164)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == gv.gfcc("ggaw", gfbz(int ), (int)473)) break;
            v9 /* !! */  = (long)gv.gfcc("ggax", gfbz(int ), (int)474);
        }
        v10 = v8.method_23317();
        while (true) {
            block100: {
                if ((v11 /* !! */  = (cfr_temp_5 = gv.nl - gv.gfcc("ggay", gfdd(int ), (int)165)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  != gv.gfcc("ggaz", gfbz(int ), (int)475)) break block100;
                v12 /* !! */  = gv.nl;
                if (true) ** GOTO lbl81
            }
            v11 /* !! */  = (long)gv.gfcc("ggba", gfbz(int ), (int)476);
        }
        block65: while (true) {
            v12 /* !! */  = (long)(v13 - gv.gfcc("ggbb", gfdd(int ), (int)166));
lbl81:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -136004315: {
                    v13 = gv.gfcc("ggbc", gfdd(int ), (int)167);
                    continue block65;
                }
                case 8897112: {
                    v13 = gv.gfcc("ggbd", gfdd(int ), (int)168);
                    continue block65;
                }
                case 1185080505: {
                    break block65;
                }
            }
            break;
        }
        var1_4 = v10 - (double)this.lastMinecartScanPos.method_10263();
        if (var5_3 || var5_3) return (boolean)gv.gfcc("ggak", gfbz(int ), (int)469);
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_6 = gv.nl - gv.gfcc("ggbe", gfdd(int ), (int)169)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == gv.gfcc("ggbf", gfbz(int ), (int)477)) break;
            v14 /* !! */  = (long)gv.gfcc("ggbg", gfbz(int ), (int)478);
        }
        while (true) {
            block101: {
                if ((v15 /* !! */  = (cfr_temp_7 = gv.nl - gv.gfcc("ggbh", gfdd(int ), (int)170)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v15 /* !! */  != gv.gfcc("ggbi", gfbz(int ), (int)479)) break block101;
                v16 = gv.mc.field_1724;
                v17 /* !! */  = gv.nl;
                if (true) ** GOTO lbl108
            }
            v15 /* !! */  = (long)gv.gfcc("ggbj", gfbz(int ), (int)480);
        }
        block68: while (true) {
            v17 /* !! */  = (long)(v18 - gv.gfcc("ggbk", gfdd(int ), (int)171));
lbl108:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case -1821123054: {
                    v18 = gv.gfcc("ggbl", gfdd(int ), (int)172);
                    continue block68;
                }
                case 1185080505: {
                    break block68;
                }
                case 1317396433: {
                    v18 = gv.gfcc("ggbm", gfdd(int ), (int)173);
                    continue block68;
                }
            }
            break;
        }
        v19 = v16.method_23321();
        v20 /* !! */  = gv.nl;
        if (true) ** GOTO lbl122
        block69: while (true) {
            v20 /* !! */  = (long)(v21 - gv.gfcc("ggbn", gfdd(int ), (int)174));
lbl122:
            // 2 sources

            switch ((int)v20 /* !! */ ) {
                case -2086239794: {
                    v21 = gv.gfcc("ggbo", gfdd(int ), (int)175);
                    continue block69;
                }
                case -998367680: {
                    v21 = gv.gfcc("ggbp", gfdd(int ), (int)176);
                    continue block69;
                }
                case 1185080505: {
                    break block69;
                }
                case 1655866627: {
                    v21 = gv.gfcc("ggbq", gfdd(int ), (int)177);
                    continue block69;
                }
            }
            break;
        }
        v22 /* !! */  = gv.nl;
        block70: while (true) {
            switch ((int)v22 /* !! */ ) {
                case -2052871732: {
                    v22 /* !! */  = (long)(gv.gfcc("ggbs", gfdd(int ), (int)179) - gv.gfcc("ggbr", gfdd(int ), (int)178));
                    continue block70;
                }
                case 1185080505: {
                    break block70;
                }
            }
            break;
        }
        var3_5 = v19 - (double)this.lastMinecartScanPos.method_10260();
        if (var5_3 || var5_3) return (boolean)gv.gfcc("ggak", gfbz(int ), (int)469);
        while (true) {
            if ((v23 /* !! */  = (cfr_temp_8 = gv.nl - gv.gfcc("ggbt", gfdd(int ), (int)180)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v23 /* !! */  == gv.gfcc("ggbu", gfbz(int ), (int)481)) break;
            v23 /* !! */  = (long)gv.gfcc("ggbv", gfbz(int ), (int)482);
        }
        v24 /* !! */  = gv.nl;
        block72: while (true) {
            switch ((int)v24 /* !! */ ) {
                case 133703601: {
                    v24 /* !! */  = (long)(gv.gfcc("ggbx", gfdd(int ), (int)182) - gv.gfcc("ggbw", gfdd(int ), (int)181));
                    continue block72;
                }
                case 1185080505: {
                    break block72;
                }
            }
            break;
        }
        if (var1_4 * var1_4 + var3_5 * var3_5 >= this.nextMinecartScanDistance * this.nextMinecartScanDistance) {
            if (var5_3) return (boolean)gv.gfcc("ggak", gfbz(int ), (int)469);
            v25 = gv.gfcc("ggby", gfbz(int ), (int)483);
            if (!var7_1) return (boolean)v25;
            throw null;
        }
        if (var5_3) return (boolean)gv.gfcc("ggak", gfbz(int ), (int)469);
        if (var6_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block73: while (true) {
            block102: {
                switch (cfr_temp_0 == -2147483648 ? var6_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var5_3) {
                            return (boolean)gv.gfcc("ggak", gfbz(int ), (int)469);
                        }
                        v25 = gv.gfcc("ggbz", gfbz(int ), (int)484);
                        return (boolean)v25;
                    }
                    case 0: {
                        var6_2 /* !! */  = (int)gv.gfcc("ggca", gfbz(int ), (int)485);
                        cfr_temp_0 = 4;
                        if (var7_1) {
                            throw null;
                        }
                        break block102;
                    }
                    case 7: {
                        var6_2 /* !! */  = (int)gv.gfcc("ggch", gfbz(int ), (int)492);
                        cfr_temp_0 = 12;
                        if (var7_1) {
                            throw null;
                        }
                        break block102;
                    }
                    case 8: {
                        var6_2 /* !! */  = (int)gv.gfcc("ggci", gfbz(int ), (int)493);
                        cfr_temp_0 = 9;
                        if (var7_1) {
                            throw null;
                        }
                        break block102;
                    }
                    case 10: {
                        var6_2 /* !! */  = (int)gv.gfcc("ggck", gfbz(int ), (int)495);
                        cfr_temp_0 = 4;
                        if (var7_1) {
                            throw null;
                        }
                        break block102;
                    }
                    case 11: {
                        do {
                            var6_2 /* !! */  = (int)gv.gfcc("ggcl", gfbz(int ), (int)496);
                        } while (!var7_1);
                        throw null;
                    }
                    case 13: {
                        var6_2 /* !! */  = (int)gv.gfcc("ggcn", gfbz(int ), (int)498);
                        cfr_temp_0 = 9;
                        if (var7_1) {
                            throw null;
                        }
                        break block102;
                    }
                    case 14: {
                        var6_2 /* !! */  = (int)gv.gfcc("ggco", gfbz(int ), (int)499);
                        cfr_temp_0 = 6;
                        if (var7_1) {
                            throw null;
                        }
                        break block102;
                    }
                    case 15: {
                        var6_2 /* !! */  = (int)gv.gfcc("ggcp", gfbz(int ), (int)500);
                        if (var7_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 1: {
                        var6_2 /* !! */  = (int)gv.gfcc("ggcb", gfbz(int ), (int)486);
                        if (var7_1) {
                            throw null;
                        }
                    }
                    case 2: {
                        var6_2 /* !! */  = (int)gv.gfcc("ggcc", gfbz(int ), (int)487);
                        if (var7_1) {
                            throw null;
                        }
                    }
                    case 12: {
                        var6_2 /* !! */  = (int)gv.gfcc("ggcm", gfbz(int ), (int)497);
                        if (var7_1) {
                            throw null;
                        }
                    }
                    case 3: lbl-1000:
                    // 2 sources

                    {
                        var6_2 /* !! */  = (int)gv.gfcc("ggcd", gfbz(int ), (int)488);
                        if (var7_1) {
                            throw null;
                        }
                    }
                    case 6: {
                        var6_2 /* !! */  = (int)gv.gfcc("ggcg", gfbz(int ), (int)491);
                        if (var7_1) {
                            throw null;
                        }
                    }
                    case 4: {
                        var6_2 /* !! */  = (int)gv.gfcc("ggce", gfbz(int ), (int)489);
                        if (var7_1) {
                            throw null;
                        }
                    }
                    case 9: {
                        var6_2 /* !! */  = (int)gv.gfcc("ggcj", gfbz(int ), (int)494);
                        if (var7_1) {
                            throw null;
                        }
                    }
                    case 5: 
                }
                ** GOTO lbl251
            }
            do {
                if (true) continue block73;
lbl251:
                // 2 sources

                var6_2 /* !! */  = (int)gv.gfcc("ggcf", gfbz(int ), (int)490);
                cfr_temp_0 = 1;
            } while (!var7_1);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void gpwb() {
        gv.gfca[500] = -98854553;
        gv.gfca[501] = 744478393;
        gv.gfca[502] = -1877257293;
        gv.gfca[503] = 616905402;
        gv.gfca[504] = -1707832897;
        gv.gfca[505] = -1876014617;
        gv.gfca[506] = -1066295250;
        gv.gfca[507] = 241805509;
        gv.gfca[508] = -884932960;
        gv.gfca[509] = -681932922;
        gv.gfca[510] = -760942392;
        gv.gfca[511] = -52913588;
        gv.gfca[512] = -672143253;
        gv.gfca[513] = -1429349049;
        gv.gfca[514] = -1797211819;
        gv.gfca[515] = 1186169758;
        gv.gfca[516] = -264801520;
        gv.gfca[517] = -2014085917;
        gv.gfca[518] = -1620448646;
        gv.gfca[519] = 1441923539;
        gv.gfca[520] = 318200466;
        gv.gfca[521] = -284783620;
        gv.gfca[522] = -1588921054;
        gv.gfca[523] = -632010636;
        gv.gfca[524] = 1424684159;
        gv.gfca[525] = -1611783908;
        gv.gfca[526] = -406348185;
        gv.gfca[527] = -30895331;
        gv.gfca[528] = -1533433607;
        gv.gfca[529] = -838102442;
        gv.gfca[530] = -1898011698;
        gv.gfca[531] = -920121679;
        gv.gfca[532] = 1417364751;
        gv.gfca[533] = 1354059240;
        gv.gfca[534] = 391815209;
        gv.gfca[535] = 407043330;
        gv.gfca[536] = -996551754;
        gv.gfca[537] = 1367608197;
        gv.gfca[538] = 2069612025;
        gv.gfca[539] = 1609746015;
        gv.gfca[540] = -76173562;
        gv.gfca[541] = -653840680;
        gv.gfca[542] = 779749137;
        gv.gfca[543] = 763912404;
        gv.gfca[544] = -1833108652;
        gv.gfca[545] = 1937568180;
        gv.gfca[546] = -984390541;
        gv.gfca[547] = 535086003;
        gv.gfca[548] = -1589285740;
        gv.gfca[549] = 746171623;
        gv.gfca[550] = -332320590;
        gv.gfca[551] = -680994187;
        gv.gfca[552] = -1829062401;
        gv.gfca[553] = -750071391;
        gv.gfca[554] = -573092464;
        gv.gfca[555] = -2016564765;
        gv.gfca[556] = 1303797618;
        gv.gfca[557] = -241735391;
        gv.gfca[558] = 1530700765;
        gv.gfca[559] = 74227054;
        gv.gfca[560] = -367287563;
        gv.gfca[561] = 327756667;
        gv.gfca[562] = -618898713;
        gv.gfca[563] = 193670975;
        gv.gfca[564] = -472063741;
        gv.gfca[565] = 1105626362;
        gv.gfca[566] = -1455188294;
        gv.gfca[567] = 1857838790;
        gv.gfca[568] = -1820481930;
        gv.gfca[569] = -1137238440;
        gv.gfca[570] = 1635236908;
        gv.gfca[571] = 1620946410;
        gv.gfca[572] = 1190601803;
        gv.gfca[573] = -2107863160;
        gv.gfca[574] = -1931808923;
        gv.gfca[575] = -380933621;
        gv.gfca[576] = -1928768241;
        gv.gfca[577] = 1355581366;
        gv.gfca[578] = -1997921071;
        gv.gfca[579] = -1414680039;
        gv.gfca[580] = 19253390;
        gv.gfca[581] = -928684377;
        gv.gfca[582] = 534077823;
        gv.gfca[583] = -10896624;
        gv.gfca[584] = -1096472214;
        gv.gfca[585] = -1224452023;
        gv.gfca[586] = -1002690645;
        gv.gfca[587] = -1856709505;
        gv.gfca[588] = 1956603444;
        gv.gfca[589] = 1438760030;
        gv.gfca[590] = -414671028;
        gv.gfca[591] = 2032355871;
        gv.gfca[592] = 785242503;
        gv.gfca[593] = -438765736;
        gv.gfca[594] = -575746993;
        gv.gfca[595] = -15510311;
        gv.gfca[596] = -1746224759;
        gv.gfca[597] = -1002523495;
        gv.gfca[598] = 748987725;
        gv.gfca[599] = -1574122929;
    }
}

