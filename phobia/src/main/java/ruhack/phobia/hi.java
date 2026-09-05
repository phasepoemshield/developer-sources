/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  net.minecraft.class_1297
 *  net.minecraft.class_1304
 *  net.minecraft.class_1511
 *  net.minecraft.class_1541
 *  net.minecraft.class_1657
 *  net.minecraft.class_1701
 *  net.minecraft.class_1713
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_2649
 *  net.minecraft.class_2653
 *  net.minecraft.class_2744
 *  net.minecraft.class_9334
 */
package ruhack.phobia;

import com.mojang.datafixers.util.Pair;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1511;
import net.minecraft.class_1541;
import net.minecraft.class_1657;
import net.minecraft.class_1701;
import net.minecraft.class_1713;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2649;
import net.minecraft.class_2653;
import net.minecraft.class_2744;
import net.minecraft.class_9334;
import ruhack.phobia.aw;
import ruhack.phobia.cr;
import ruhack.phobia.cr$Type;
import ruhack.phobia.df;
import ruhack.phobia.dj;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.kb;
import ruhack.phobia.ke;
import ruhack.phobia.kf;
import ruhack.phobia.kg;
import ruhack.phobia.nu;
import ruhack.phobia.nz;
import ruhack.phobia.oc;

public class hi
extends ds {
    private boolean hasReplacedEnchanted;
    private final kg crystalDistance;
    private static final String CHECK_TNT_MINECART = "\u0412\u0430\u0433\u043e\u043d\u0435\u0442\u043a\u0430 \u0441 \u0434\u0438\u043d\u0430\u043c\u0438\u0442\u043e\u043c";
    private final kb saveTalismans;
    private final kb noSwapIfBall;
    private static int[] dmsj = new int[1749];
    private class_1799 pendingRevertItem;
    private volatile boolean placementServerConfirmed;
    private boolean awaitingInitialDisplacement;
    private long revertConfirmationAt;
    private final kb revertItem;
    private final kg healthThreshold;
    private volatile long placementConfirmationDeadline;
    private int totemSlot;
    public static final int b;
    private volatile boolean placementAwaitingConfirmation;
    private static int[] dmsk;
    public static final boolean c;
    private static final String CHECK_GOLDEN_HEARTS = "\u0417\u043e\u043b\u043e\u0442\u044b\u0435 \u0441\u0435\u0440\u0434\u0446\u0430";
    private static long[] dmtu;
    private final kg tntDistance;
    private final kg tntMinecartDistance;
    private static final String SWAP_ID = "AutoTotem";
    private final kg armorBonusHealth;
    private Deque<class_1799> itemHistory;
    private int rememberedItemSlot;
    private static long[] dmtt;
    private static final String CHECK_ARMOR = "\u041d\u0435 \u043f\u043e\u043b\u043d\u0430\u044f \u0431\u0440\u043e\u043d\u044f";
    private int pendingRevertSourceSlot;
    private final kb fallCheck;
    private final ke checks;
    private final kb lowHpOverride;
    private static final String CHECK_ELYTRA = "\u0417\u0434\u043e\u0440\u043e\u0432\u044c\u0435 \u043d\u0430 \u044d\u043b\u0438\u0442\u0440\u0430\u0445";
    private final kg crystalHealth;
    public static final long ib = -1359880382346290027L;
    private long lastSwapTime;
    private static final String CHECK_TNT = "\u0414\u0438\u043d\u0430\u043c\u0438\u0442";
    private volatile boolean placementServerRejected;
    public static final boolean a;
    private final kf mode;
    private final kg fallHeight;
    private boolean revertAwaitingConfirmation;
    private static final String CHECK_CRYSTAL = "\u041a\u0440\u0438\u0441\u0442\u0430\u043b\u043b";
    private static final long SWAP_COOLDOWN = 150L;
    private boolean revertSucceeded;
    private final kg elytraHealth;

    public static /* synthetic */ CallSite dmsl(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean lambda$hasCrystalNearby$9(class_1297 class_12972) {
        Object object = ib;
        block14: while (true) {
            switch ((int)object) {
                case 970105921: {
                    object = hi.dmsl("druh", dmts(int ), (int)718) - hi.dmsl("drug", dmts(int ), (int)717);
                    continue block14;
                }
                case 1228545173: {
                    break block14;
                }
            }
            break;
        }
        boolean bl2 = c;
        Object object2 = ib;
        block15: while (true) {
            switch ((int)object2) {
                case 404870538: {
                    object2 = hi.dmsl("druj", dmts(int ), (int)720) - hi.dmsl("drui", dmts(int ), (int)719);
                    continue block15;
                }
                case 1228545173: {
                    break block15;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = ib;
        boolean bl3 = true;
        block16: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object3 = callSite - hi.dmsl("druk", dmts(int ), (int)721);
            }
            switch ((int)object3) {
                case -142056407: {
                    callSite = hi.dmsl("drul", dmts(int ), (int)722);
                    continue block16;
                }
                case 388583652: {
                    callSite = hi.dmsl("drum", dmts(int ), (int)723);
                    continue block16;
                }
                case 814191470: {
                    callSite = hi.dmsl("drun", dmts(int ), (int)724);
                    continue block16;
                }
                case 1228545173: {
                    break block16;
                }
            }
            break;
        }
        boolean bl4 = a;
        if (bl2) {
            throw null;
        }
        if (bl4 || bl4) {
            return (boolean)hi.dmsl("druo", dmsv(int ), (int)1639);
        }
        return class_12972 instanceof class_1511;
    }

    private static /* synthetic */ void dtmb() {
        hi.dmsj[1600] = -1558591829;
        hi.dmsj[1601] = -1817312296;
        hi.dmsj[1602] = 131081110;
        hi.dmsj[1603] = 505282926;
        hi.dmsj[1604] = 464759272;
        hi.dmsj[1605] = 782605643;
        hi.dmsj[1606] = 1763626162;
        hi.dmsj[1607] = 1429013724;
        hi.dmsj[1608] = 1736318221;
        hi.dmsj[1609] = 1496412879;
        hi.dmsj[1610] = 1447602105;
        hi.dmsj[1611] = -872856865;
        hi.dmsj[1612] = -1955392006;
        hi.dmsj[1613] = -958214229;
        hi.dmsj[1614] = -601808489;
        hi.dmsj[1615] = 459060564;
        hi.dmsj[1616] = 74704065;
        hi.dmsj[1617] = 924308913;
        hi.dmsj[1618] = 488759900;
        hi.dmsj[1619] = 543530652;
        hi.dmsj[1620] = -614436519;
        hi.dmsj[1621] = 757883302;
        hi.dmsj[1622] = -1972154342;
        hi.dmsj[1623] = 1421898083;
        hi.dmsj[1624] = -282593474;
        hi.dmsj[1625] = -586668733;
        hi.dmsj[1626] = 188169912;
        hi.dmsj[1627] = -1829335850;
        hi.dmsj[1628] = 1053717864;
        hi.dmsj[1629] = -1781777112;
        hi.dmsj[1630] = -1664565040;
        hi.dmsj[1631] = -1945893314;
        hi.dmsj[1632] = 147574718;
        hi.dmsj[1633] = -1394530103;
        hi.dmsj[1634] = 1252529195;
        hi.dmsj[1635] = 1731719556;
        hi.dmsj[1636] = 900329691;
        hi.dmsj[1637] = -1209050705;
        hi.dmsj[1638] = 1242383000;
        hi.dmsj[1639] = -938745446;
        hi.dmsj[1640] = 705128067;
        hi.dmsj[1641] = -909025817;
        hi.dmsj[1642] = -1114991657;
        hi.dmsj[1643] = 1529152488;
        hi.dmsj[1644] = -1151913596;
        hi.dmsj[1645] = 2091203191;
        hi.dmsj[1646] = -1599091331;
        hi.dmsj[1647] = -1324881876;
        hi.dmsj[1648] = -615519788;
        hi.dmsj[1649] = -2015336704;
        hi.dmsj[1650] = 1882183744;
        hi.dmsj[1651] = 1634046658;
        hi.dmsj[1652] = 1665003140;
        hi.dmsj[1653] = -1667616289;
        hi.dmsj[1654] = 545671316;
        hi.dmsj[1655] = 2134068763;
        hi.dmsj[1656] = -988631556;
        hi.dmsj[1657] = -1972558473;
        hi.dmsj[1658] = 2027132698;
        hi.dmsj[1659] = -2078464497;
        hi.dmsj[1660] = 1715043380;
        hi.dmsj[1661] = 1072805560;
        hi.dmsj[1662] = 71744032;
        hi.dmsj[1663] = 1587997185;
        hi.dmsj[1664] = -866365672;
        hi.dmsj[1665] = 1350553716;
        hi.dmsj[1666] = -1703198833;
        hi.dmsj[1667] = -1343252357;
        hi.dmsj[1668] = 1531458672;
        hi.dmsj[1669] = 1990235912;
        hi.dmsj[1670] = 1048845664;
        hi.dmsj[1671] = -534607394;
        hi.dmsj[1672] = -391420252;
        hi.dmsj[1673] = -2116182464;
        hi.dmsj[1674] = 2053891283;
        hi.dmsj[1675] = 444246161;
        hi.dmsj[1676] = 1172125510;
        hi.dmsj[1677] = 404674511;
        hi.dmsj[1678] = 755823733;
        hi.dmsj[1679] = -1317992504;
        hi.dmsj[1680] = -478940400;
        hi.dmsj[1681] = 1246540386;
        hi.dmsj[1682] = 1280283579;
        hi.dmsj[1683] = 1483527534;
        hi.dmsj[1684] = -2001598218;
        hi.dmsj[1685] = 1936153795;
        hi.dmsj[1686] = 1184832538;
        hi.dmsj[1687] = 390500852;
        hi.dmsj[1688] = -1863629903;
        hi.dmsj[1689] = 470421870;
        hi.dmsj[1690] = 1300689651;
        hi.dmsj[1691] = 1365201096;
        hi.dmsj[1692] = 978605180;
        hi.dmsj[1693] = -1142947018;
        hi.dmsj[1694] = -1006647716;
        hi.dmsj[1695] = -1493671370;
        hi.dmsj[1696] = -1885033017;
        hi.dmsj[1697] = 1130596650;
        hi.dmsj[1698] = -1855147336;
        hi.dmsj[1699] = -894166499;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$6() {
        v0 /* !! */  = hi.ib;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - hi.dmsl("drwu", dmts(int ), (int)754));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -512586414: {
                    v1 = hi.dmsl("drwv", dmts(int ), (int)755);
                    continue block16;
                }
                case 874468231: {
                    v1 = hi.dmsl("drww", dmts(int ), (int)756);
                    continue block16;
                }
                case 914700719: {
                    v1 = hi.dmsl("drwx", dmts(int ), (int)757);
                    continue block16;
                }
                case 1228545173: {
                    break block16;
                }
            }
            break;
        }
        var3_1 = hi.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hi.ib - hi.dmsl("drwy", dmts(int ), (int)758)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hi.dmsl("drwz", dmsv(int ), (int)1668)) break;
            v2 /* !! */  = (long)hi.dmsl("drxa", dmsv(int ), (int)1669);
        }
        var2_2 = hi.b;
        v3 /* !! */  = hi.ib;
        if (true) ** GOTO lbl29
        block18: while (true) {
            v3 /* !! */  = (long)(v4 - hi.dmsl("drxb", dmts(int ), (int)759));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1079376099: {
                    v4 = hi.dmsl("drxc", dmts(int ), (int)760);
                    continue block18;
                }
                case 1228545173: {
                    break block18;
                }
                case 1383037638: {
                    v4 = hi.dmsl("drxd", dmts(int ), (int)761);
                    continue block18;
                }
                case 1490056424: {
                    v4 = hi.dmsl("drxe", dmts(int ), (int)762);
                    continue block18;
                }
            }
            break;
        }
        var1_3 = hi.a;
        if (var3_1) {
            throw null;
lbl44:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl47:
        // 1 sources

        v5 /* !! */  = hi.ib;
        if (true) ** GOTO lbl51
        block20: while (true) {
            v5 /* !! */  = (long)(hi.dmsl("drxg", dmts(int ), (int)764) - hi.dmsl("drxf", dmts(int ), (int)763));
lbl51:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1517677097: {
                    continue block20;
                }
                case 1228545173: {
                    break block20;
                }
            }
            break;
        }
        v6 = this.check("\u0414\u0438\u043d\u0430\u043c\u0438\u0442");
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_1 = hi.ib - hi.dmsl("drxh", dmts(int ), (int)765)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v7 /* !! */  == hi.dmsl("drxi", dmsv(int ), (int)1670)) break;
            v7 /* !! */  = (long)hi.dmsl("drxj", dmsv(int ), (int)1671);
        }
        return v6;
    }

    private static /* synthetic */ void dtrh() {
        hi.dmtu[200] = 7596234157855629023L;
        hi.dmtu[201] = -212449271614695477L;
        hi.dmtu[202] = 2595542482083727602L;
        hi.dmtu[203] = -2354668366574321568L;
        hi.dmtu[204] = -5060077158386769297L;
        hi.dmtu[205] = -8111287897460681742L;
        hi.dmtu[206] = 2351608735359458078L;
        hi.dmtu[207] = -4775803759001829477L;
        hi.dmtu[208] = 5608987639343639658L;
        hi.dmtu[209] = 6837237357384313155L;
        hi.dmtu[210] = 1957774012682089045L;
        hi.dmtu[211] = -1157937028237793211L;
        hi.dmtu[212] = -8260308635022853083L;
        hi.dmtu[213] = 497746223261756441L;
        hi.dmtu[214] = 3083919746942160210L;
        hi.dmtu[215] = -7855479597935055333L;
        hi.dmtu[216] = 7236846853921828669L;
        hi.dmtu[217] = -245089964345527510L;
        hi.dmtu[218] = 7471750529130367406L;
        hi.dmtu[219] = -1305791937153742252L;
        hi.dmtu[220] = 3885540918181340752L;
        hi.dmtu[221] = -6989021863170569390L;
        hi.dmtu[222] = 3052888529137506980L;
        hi.dmtu[223] = -2227077665195385732L;
        hi.dmtu[224] = -352065691546539666L;
        hi.dmtu[225] = 7817831435217793772L;
        hi.dmtu[226] = -5043359429405791656L;
        hi.dmtu[227] = -3908169768791545931L;
        hi.dmtu[228] = -6713761079249077692L;
        hi.dmtu[229] = 3475928103301507662L;
        hi.dmtu[230] = 6228590224036522867L;
        hi.dmtu[231] = 3841378234714982712L;
        hi.dmtu[232] = 6095524303600226260L;
        hi.dmtu[233] = -3420929403077190704L;
        hi.dmtu[234] = 782259857862386660L;
        hi.dmtu[235] = -3342656005870397994L;
        hi.dmtu[236] = 7238684167976348323L;
        hi.dmtu[237] = -2225491540052631121L;
        hi.dmtu[238] = 3092231836848561803L;
        hi.dmtu[239] = -2337216040332662711L;
        hi.dmtu[240] = 7129155258617197325L;
        hi.dmtu[241] = 3728839103609638833L;
        hi.dmtu[242] = -6569888207747146053L;
        hi.dmtu[243] = 3373153329553745679L;
        hi.dmtu[244] = -2793135656567519518L;
        hi.dmtu[245] = -8812235305530999664L;
        hi.dmtu[246] = 2430280227285394970L;
        hi.dmtu[247] = -1106472276842129659L;
        hi.dmtu[248] = 5554128624560200173L;
        hi.dmtu[249] = 4297915421492513805L;
        hi.dmtu[250] = -8010418226395968158L;
        hi.dmtu[251] = 7643409864619028550L;
        hi.dmtu[252] = -6453530920202133422L;
        hi.dmtu[253] = 4938266691212649932L;
        hi.dmtu[254] = -6437424553699291925L;
        hi.dmtu[255] = 7677333148406427676L;
        hi.dmtu[256] = 2175161193608217992L;
        hi.dmtu[257] = 8611527933347424195L;
        hi.dmtu[258] = 6327046617345450374L;
        hi.dmtu[259] = 7274739411737730650L;
        hi.dmtu[260] = 7940403119571049767L;
        hi.dmtu[261] = -7384147657968019265L;
        hi.dmtu[262] = 8309195979090141598L;
        hi.dmtu[263] = -2297195598170390134L;
        hi.dmtu[264] = 6022581492933999807L;
        hi.dmtu[265] = 99513775840806326L;
        hi.dmtu[266] = 3792145216363573497L;
        hi.dmtu[267] = -9188190446443122832L;
        hi.dmtu[268] = 3418821617573184743L;
        hi.dmtu[269] = 6801896922252490280L;
        hi.dmtu[270] = 7609672482238777195L;
        hi.dmtu[271] = 3504761633942671123L;
        hi.dmtu[272] = 910089046527178569L;
        hi.dmtu[273] = 4538012272044796664L;
        hi.dmtu[274] = -4429827740386808145L;
        hi.dmtu[275] = -8346409171943226857L;
        hi.dmtu[276] = -6099897994635256724L;
        hi.dmtu[277] = 3329144213164578691L;
        hi.dmtu[278] = 4679928740210066489L;
        hi.dmtu[279] = 292503501079571453L;
        hi.dmtu[280] = -2220781185916917690L;
        hi.dmtu[281] = -3671584989209557420L;
        hi.dmtu[282] = -1501400334985023261L;
        hi.dmtu[283] = 5827663951364484858L;
        hi.dmtu[284] = 2833734358152013643L;
        hi.dmtu[285] = -998070605038250070L;
        hi.dmtu[286] = 1320335293981954494L;
        hi.dmtu[287] = 8926565527017148047L;
        hi.dmtu[288] = 3796651529012757926L;
        hi.dmtu[289] = 2776000508642099169L;
        hi.dmtu[290] = -6608871710452585779L;
        hi.dmtu[291] = -4510349493546373259L;
        hi.dmtu[292] = -5462945252178802544L;
        hi.dmtu[293] = 3530186107992774157L;
        hi.dmtu[294] = -2524422364265758844L;
        hi.dmtu[295] = -4803929050701704962L;
        hi.dmtu[296] = -1809065713893010544L;
        hi.dmtu[297] = 6157813162049979747L;
        hi.dmtu[298] = -3194455950309760752L;
        hi.dmtu[299] = -1344104759986249756L;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private /* synthetic */ Boolean lambda$new$7() {
        boolean bl2;
        Object object = ib;
        boolean bl3 = true;
        block15: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - hi.dmsl("drwb", dmts(int ), (int)743);
            }
            switch ((int)object) {
                case -2017130467: {
                    callSite = hi.dmsl("drwc", dmts(int ), (int)744);
                    continue block15;
                }
                case -485201144: {
                    callSite = hi.dmsl("drwd", dmts(int ), (int)745);
                    continue block15;
                }
                case 1228545173: {
                    break block15;
                }
            }
            break;
        }
        boolean bl4 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = ib - hi.dmsl("drwe", dmts(int ), (int)746)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == hi.dmsl("drwf", dmsv(int ), (int)1660)) break;
            object2 = hi.dmsl("drwg", dmsv(int ), (int)1661);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = ib - hi.dmsl("drwh", dmts(int ), (int)747)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == hi.dmsl("drwi", dmsv(int ), (int)1662)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = hi.dmsl("drwj", dmsv(int ), (int)1663);
        }
        if (bl2) return null;
        if (bl2) return null;
        Object object4 = ib;
        boolean bl5 = true;
        block18: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object4 = callSite - hi.dmsl("drwk", dmts(int ), (int)748);
            }
            switch ((int)object4) {
                case -1314689748: {
                    callSite = hi.dmsl("drwl", dmts(int ), (int)749);
                    continue block18;
                }
                case 1039368810: {
                    callSite = hi.dmsl("drwm", dmts(int ), (int)750);
                    continue block18;
                }
                case 1228545173: {
                    break block18;
                }
                case 2067864600: {
                    callSite = hi.dmsl("drwn", dmts(int ), (int)751);
                    continue block18;
                }
            }
            break;
        }
        boolean bl6 = this.check(CHECK_TNT_MINECART);
        Object object5 = ib;
        block19: while (true) {
            switch ((int)object5) {
                case 29773953: {
                    object5 = hi.dmsl("drwp", dmts(int ), (int)753) - hi.dmsl("drwo", dmts(int ), (int)752);
                    continue block19;
                }
                case 1228545173: {
                    return bl6;
                }
            }
            break;
        }
        return bl6;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onWorldRender(dj var1_1) {
        block53: {
            v0 /* !! */  = hi.ib;
            if (true) ** GOTO lbl5
            block35: while (true) {
                v0 /* !! */  = (long)(v1 - hi.dmsl("dndt", dmts(int ), (int)2));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case 267953509: {
                        v1 = hi.dmsl("dndu", dmts(int ), (int)3);
                        continue block35;
                    }
                    case 1228545173: {
                        break block35;
                    }
                    case 1921940148: {
                        v1 = hi.dmsl("dndv", dmts(int ), (int)4);
                        continue block35;
                    }
                    case 2099401145: {
                        v1 = hi.dmsl("dndw", dmts(int ), (int)5);
                        continue block35;
                    }
                }
                break;
            }
            var4_2 = hi.c;
            v2 /* !! */  = hi.ib;
            if (true) ** GOTO lbl22
            block36: while (true) {
                v2 /* !! */  = (long)(v3 - hi.dmsl("dndx", dmts(int ), (int)6));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -2096480805: {
                        v3 = hi.dmsl("dndy", dmts(int ), (int)7);
                        continue block36;
                    }
                    case -775261961: {
                        v3 = hi.dmsl("dndz", dmts(int ), (int)8);
                        continue block36;
                    }
                    case -388624103: {
                        v3 = hi.dmsl("dnea", dmts(int ), (int)9);
                        continue block36;
                    }
                    case 1228545173: {
                        break block36;
                    }
                }
                break;
            }
            var3_3 /* !! */  = hi.b;
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_0 = hi.ib - hi.dmsl("dneb", dmts(int ), (int)10)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == hi.dmsl("dnec", dmsv(int ), (int)136)) break;
                v4 /* !! */  = (long)hi.dmsl("dned", dmsv(int ), (int)137);
            }
            var2_4 = hi.a;
            if (var4_2) {
                throw null;
lbl43:
                // 6 sources

                return;
            }
            if (var2_4 || var2_4) ** GOTO lbl43
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_1 = hi.ib - hi.dmsl("dnee", dmts(int ), (int)11)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == hi.dmsl("dnef", dmsv(int ), (int)138)) break;
                v5 /* !! */  = (long)hi.dmsl("dneg", dmsv(int ), (int)139);
            }
            v6 /* !! */  = hi.ib;
            if (true) ** GOTO lbl55
            block40: while (true) {
                v6 /* !! */  = (long)(v7 - hi.dmsl("dneh", dmts(int ), (int)12));
lbl55:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -290738268: {
                        v7 = hi.dmsl("dnei", dmts(int ), (int)13);
                        continue block40;
                    }
                    case 1228545173: {
                        break block40;
                    }
                    case 1329964853: {
                        v7 = hi.dmsl("dnej", dmts(int ), (int)14);
                        continue block40;
                    }
                }
                break;
            }
            if (!this.mode.isSelected("ReallyWorld")) break block53;
            if (var2_4) ** GOTO lbl43
            v8 /* !! */  = hi.ib;
            if (true) ** GOTO lbl70
            block41: while (true) {
                v8 /* !! */  = (long)(v9 - hi.dmsl("dnek", dmts(int ), (int)15));
lbl70:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case -783090142: {
                        v9 = hi.dmsl("dnel", dmts(int ), (int)16);
                        continue block41;
                    }
                    case -153421562: {
                        v9 = hi.dmsl("dnem", dmts(int ), (int)17);
                        continue block41;
                    }
                    case 1228545173: {
                        break block41;
                    }
                    case 1802550029: {
                        v9 = hi.dmsl("dnen", dmts(int ), (int)18);
                        continue block41;
                    }
                }
                break;
            }
            if (!nz.isSwapQueued("AutoTotem")) break block53;
            if (var2_4 || var2_4) ** GOTO lbl43
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_2 = hi.ib - hi.dmsl("dneo", dmts(int ), (int)19)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == hi.dmsl("dnep", dmsv(int ), (int)140)) break;
                v10 /* !! */  = (long)hi.dmsl("dneq", dmsv(int ), (int)141);
            }
            nz.tick();
            if (var2_4) ** GOTO lbl43
        }
        if (var2_4) ** GOTO lbl43
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hi.dmsl("dner", dmsv(int ), (int)142);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl115
                    break;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)hi.dmsl("dnes", dmsv(int ), (int)143);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl137
            }
lbl110:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)hi.dmsl("dnet", dmsv(int ), (int)144);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl128
            }
lbl115:
            // 3 sources

            case 3: {
                var3_3 /* !! */  = (int)hi.dmsl("dneu", dmsv(int ), (int)145);
                if (!var4_2) break;
                throw null;
            }
lbl119:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)hi.dmsl("dnev", dmsv(int ), (int)146);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl137
            }
            case 5: {
                var3_3 /* !! */  = (int)hi.dmsl("dnew", dmsv(int ), (int)147);
                if (!var4_2) ** GOTO lbl119
                throw null;
            }
lbl128:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)hi.dmsl("dnex", dmsv(int ), (int)148);
                if (!var4_2) ** GOTO lbl115
                throw null;
            }
            case 7: {
                do {
                    var3_3 /* !! */  = (int)hi.dmsl("dney", dmsv(int ), (int)149);
                } while (!var4_2);
                throw null;
            }
lbl137:
            // 3 sources

            case 8: {
                var3_3 /* !! */  = (int)hi.dmsl("dnez", dmsv(int ), (int)150);
                if (!var4_2) ** GOTO lbl110
                throw null;
            }
            case 9: 
        }
        var3_3 /* !! */  = (int)hi.dmsl("dnfa", dmsv(int ), (int)151);
        ** while (!var4_2)
lbl144:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dtsg() {
        hi.dmtu[400] = 6560402917118409034L;
        hi.dmtu[401] = -8895060941394682274L;
        hi.dmtu[402] = 7158979439750000604L;
        hi.dmtu[403] = 4712965270484912591L;
        hi.dmtu[404] = 8756459026732675923L;
        hi.dmtu[405] = 3996655369406979690L;
        hi.dmtu[406] = -6709198749892286035L;
        hi.dmtu[407] = -3333602890781019061L;
        hi.dmtu[408] = -8542997720248666223L;
        hi.dmtu[409] = 7713017808607649583L;
        hi.dmtu[410] = 4106196260295714100L;
        hi.dmtu[411] = 7858256355855252739L;
        hi.dmtu[412] = 7959152821866988126L;
        hi.dmtu[413] = 2248161005114653480L;
        hi.dmtu[414] = 88506164486191330L;
        hi.dmtu[415] = 4644031197947140744L;
        hi.dmtu[416] = 5528705891222396199L;
        hi.dmtu[417] = -7046380377622459165L;
        hi.dmtu[418] = -3853060362877984543L;
        hi.dmtu[419] = 5827903895885000179L;
        hi.dmtu[420] = 834272476886050571L;
        hi.dmtu[421] = -8415410267564518593L;
        hi.dmtu[422] = -5839620209014596414L;
        hi.dmtu[423] = 7595323655157975643L;
        hi.dmtu[424] = -9206112871214473604L;
        hi.dmtu[425] = -7400805484499194019L;
        hi.dmtu[426] = 3950136279444667853L;
        hi.dmtu[427] = 5133136573583633565L;
        hi.dmtu[428] = 2039663485872222907L;
        hi.dmtu[429] = 4137879378983447781L;
        hi.dmtu[430] = -2100647061097316232L;
        hi.dmtu[431] = -4056762168637737639L;
        hi.dmtu[432] = 6035968722422366671L;
        hi.dmtu[433] = -3698545462675873138L;
        hi.dmtu[434] = 1762236245111235133L;
        hi.dmtu[435] = -467210376096571177L;
        hi.dmtu[436] = -7971801522593855773L;
        hi.dmtu[437] = -3798266952086213079L;
        hi.dmtu[438] = 7843552709930074368L;
        hi.dmtu[439] = -4751729161865081624L;
        hi.dmtu[440] = 5960739187456685391L;
        hi.dmtu[441] = 7805488089419087665L;
        hi.dmtu[442] = -975156104500578180L;
        hi.dmtu[443] = 463708908704811477L;
        hi.dmtu[444] = 1706378090956866605L;
        hi.dmtu[445] = 5320842959531409699L;
        hi.dmtu[446] = -4076748972078165721L;
        hi.dmtu[447] = 1712655392470455399L;
        hi.dmtu[448] = -2644750900711772448L;
        hi.dmtu[449] = 6130411285261301834L;
        hi.dmtu[450] = -6043029086223606167L;
        hi.dmtu[451] = 1145969314702100353L;
        hi.dmtu[452] = -4517532927213854835L;
        hi.dmtu[453] = 2864459538008001836L;
        hi.dmtu[454] = -8651718321511242961L;
        hi.dmtu[455] = -8640940653279114086L;
        hi.dmtu[456] = -5541505916795527025L;
        hi.dmtu[457] = -2406330016396612884L;
        hi.dmtu[458] = 7017886084406434983L;
        hi.dmtu[459] = -9087645251707362177L;
        hi.dmtu[460] = -1281060884741140164L;
        hi.dmtu[461] = -3490973191210568688L;
        hi.dmtu[462] = -9017357538778661094L;
        hi.dmtu[463] = -5451171149916846980L;
        hi.dmtu[464] = -7883763457141296413L;
        hi.dmtu[465] = -6150318665775971729L;
        hi.dmtu[466] = -2603998639675241830L;
        hi.dmtu[467] = 4046309736745665822L;
        hi.dmtu[468] = 4966235344976487353L;
        hi.dmtu[469] = 7179122608713560046L;
        hi.dmtu[470] = 8770498266494277148L;
        hi.dmtu[471] = -6272626063338677866L;
        hi.dmtu[472] = 5322965135298934398L;
        hi.dmtu[473] = -4933282661426304927L;
        hi.dmtu[474] = 1051024035636069817L;
        hi.dmtu[475] = -7283571945308213040L;
        hi.dmtu[476] = 3899098072693880683L;
        hi.dmtu[477] = -2158548692339217098L;
        hi.dmtu[478] = 2278458119531583816L;
        hi.dmtu[479] = -2420709462138224760L;
        hi.dmtu[480] = 1312017015948258362L;
        hi.dmtu[481] = -5027956292203390101L;
        hi.dmtu[482] = 3696822428437218857L;
        hi.dmtu[483] = -4830898242717118229L;
        hi.dmtu[484] = -5117751682919024862L;
        hi.dmtu[485] = 6601870067988668828L;
        hi.dmtu[486] = 5202041931658777351L;
        hi.dmtu[487] = 5624821092644137133L;
        hi.dmtu[488] = -2390281592497354150L;
        hi.dmtu[489] = -2840468823210279507L;
        hi.dmtu[490] = -4492446995874036708L;
        hi.dmtu[491] = -9216084156127014389L;
        hi.dmtu[492] = 6876733119076116775L;
        hi.dmtu[493] = -720648813609863808L;
        hi.dmtu[494] = 1185281942486109962L;
        hi.dmtu[495] = -4042861218355051995L;
        hi.dmtu[496] = 8953142007712888508L;
        hi.dmtu[497] = 410223162306281943L;
        hi.dmtu[498] = 2945107119197721104L;
        hi.dmtu[499] = 8563009980380707605L;
    }

    private static /* synthetic */ void dtpa() {
        hi.dmtt[700] = -61494344950745172L;
        hi.dmtt[701] = 4507533932710878240L;
        hi.dmtt[702] = -5383308399919424556L;
        hi.dmtt[703] = -856230716975382189L;
        hi.dmtt[704] = 4068865288138936639L;
        hi.dmtt[705] = -1595744720887503557L;
        hi.dmtt[706] = -5345751994832143325L;
        hi.dmtt[707] = -5577706112569183027L;
        hi.dmtt[708] = -1009364440714042691L;
        hi.dmtt[709] = 5010657892049662304L;
        hi.dmtt[710] = 3490107562661991844L;
        hi.dmtt[711] = 3056263461281472580L;
        hi.dmtt[712] = -2982364130942587499L;
        hi.dmtt[713] = 5290465560107450321L;
        hi.dmtt[714] = -731646124959050909L;
        hi.dmtt[715] = 2194533814999413356L;
        hi.dmtt[716] = 4277601212625476678L;
        hi.dmtt[717] = 8498359423566343799L;
        hi.dmtt[718] = -4460133181473876830L;
        hi.dmtt[719] = -3748584427823966538L;
        hi.dmtt[720] = -90317370136469219L;
        hi.dmtt[721] = 8404347969853047613L;
        hi.dmtt[722] = -7423789646356969917L;
        hi.dmtt[723] = 398389293741999470L;
        hi.dmtt[724] = 7869834519427318696L;
        hi.dmtt[725] = 3067886104572689724L;
        hi.dmtt[726] = 4946564352816250427L;
        hi.dmtt[727] = -2393942650142984791L;
        hi.dmtt[728] = 5323881690279660040L;
        hi.dmtt[729] = -636930099268102871L;
        hi.dmtt[730] = -6380859187250678944L;
        hi.dmtt[731] = 8763864050784263016L;
        hi.dmtt[732] = -1397195488531401107L;
        hi.dmtt[733] = -6005537610835861146L;
        hi.dmtt[734] = -5912098207442437769L;
        hi.dmtt[735] = -1133465635803520074L;
        hi.dmtt[736] = 7406290941262596742L;
        hi.dmtt[737] = 7190726516237460279L;
        hi.dmtt[738] = -3167130971507066025L;
        hi.dmtt[739] = -6657461656223834357L;
        hi.dmtt[740] = 4274147480433022499L;
        hi.dmtt[741] = 407820689101770716L;
        hi.dmtt[742] = -5526681497555057697L;
        hi.dmtt[743] = -3223063663473907377L;
        hi.dmtt[744] = 156515924816928623L;
        hi.dmtt[745] = 7776947801623290111L;
        hi.dmtt[746] = 4753975156853991768L;
        hi.dmtt[747] = -7459674562733264002L;
        hi.dmtt[748] = -2387997093854198726L;
        hi.dmtt[749] = -6819362472616744403L;
        hi.dmtt[750] = -2619173548972076154L;
        hi.dmtt[751] = 3997791629427626688L;
        hi.dmtt[752] = -994572929451109028L;
        hi.dmtt[753] = -6343491440371027102L;
        hi.dmtt[754] = -6355294828758607503L;
        hi.dmtt[755] = -1144176720519804926L;
        hi.dmtt[756] = 6311350101919333537L;
        hi.dmtt[757] = 6733700094943908190L;
        hi.dmtt[758] = 3160318439562770468L;
        hi.dmtt[759] = 2439195341487108598L;
        hi.dmtt[760] = 9162339713177583739L;
        hi.dmtt[761] = 3523484861683905424L;
        hi.dmtt[762] = -3375328612841595934L;
        hi.dmtt[763] = 7554771109561834516L;
        hi.dmtt[764] = 4169772247010244542L;
        hi.dmtt[765] = 2261553145417375442L;
        hi.dmtt[766] = -3324060120373379833L;
        hi.dmtt[767] = -8152117729183613017L;
        hi.dmtt[768] = -3243822983052630751L;
        hi.dmtt[769] = 8172772510087174277L;
        hi.dmtt[770] = -282797974360627091L;
        hi.dmtt[771] = -484672724426587540L;
        hi.dmtt[772] = -3407437212520657800L;
        hi.dmtt[773] = -266480843689372309L;
        hi.dmtt[774] = 9069647421140224624L;
        hi.dmtt[775] = -4183738084597938901L;
        hi.dmtt[776] = 1270461092735899413L;
        hi.dmtt[777] = 9123408346295557870L;
        hi.dmtt[778] = 5977232232162215941L;
        hi.dmtt[779] = 2072187490117981014L;
        hi.dmtt[780] = 3265626307782845208L;
        hi.dmtt[781] = 3820864738037202639L;
        hi.dmtt[782] = 3152129588896617624L;
        hi.dmtt[783] = -3600815838521345846L;
        hi.dmtt[784] = -4216069037275939191L;
        hi.dmtt[785] = -4568192852925710721L;
        hi.dmtt[786] = -3338324796902598238L;
        hi.dmtt[787] = 8051958460634234665L;
        hi.dmtt[788] = -1651790501136673277L;
        hi.dmtt[789] = -8811679908454445520L;
        hi.dmtt[790] = 4505974615339021455L;
        hi.dmtt[791] = -7460952458837588949L;
        hi.dmtt[792] = 2395440717470887933L;
        hi.dmtt[793] = 731206370187166584L;
        hi.dmtt[794] = 715565435875647990L;
        hi.dmtt[795] = 3663746004880616101L;
        hi.dmtt[796] = -5139285642435458548L;
        hi.dmtt[797] = 7404397849377914082L;
        hi.dmtt[798] = -7081023887337498924L;
        hi.dmtt[799] = 7220343404576638313L;
    }

    private static /* synthetic */ int dmsv(int n2) {
        return dmsj[n2] ^ dmsk[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void executeTotemSwap() {
        block97: {
            block95: {
                block96: {
                    block94: {
                        block93: {
                            var5_1 = hi.c;
                            var4_2 /* !! */  = hi.b;
                            var3_3 = hi.a;
                            if (var5_1) {
                                throw null;
lbl6:
                                // 27 sources

                                return;
                            }
                            if (var3_3 || var3_3) ** GOTO lbl6
                            if (this.totemSlot == hi.dmsl("dpeu", dmsv(int ), (int)892)) break block93;
                            if (var3_3) ** GOTO lbl6
                            if (this.ensurePlayerInventoryHandler()) break block94;
                            if (var3_3) ** GOTO lbl6
                        }
                        if (var3_3 || var3_3) ** GOTO lbl6
                        return;
                    }
                    if (var3_3 || var3_3) ** GOTO lbl6
                    var1_4 = this.totemSlot;
                    if (var3_3 || var3_3) ** GOTO lbl6
                    if (this.isValidTotem(this.getStackAtScreenSlot(var1_4), (boolean)hi.dmsl("dpev", dmsv(int ), (int)893))) break block95;
                    if (var3_3 || var3_3) ** GOTO lbl6
                    var2_5 = this.findTotem((boolean)hi.dmsl("dpew", dmsv(int ), (int)894));
                    if (var3_3 || var3_3) ** GOTO lbl6
                    if (var2_5.found()) break block96;
                    if (var3_3) ** GOTO lbl6
                    return;
                }
                if (var3_3 || var3_3) ** GOTO lbl6
                var1_4 = var2_5.slot();
                if (var3_3 || var3_3) ** GOTO lbl6
                this.totemSlot = var1_4;
                if (var3_3) ** GOTO lbl6
            }
            if (var3_3 || var3_3) ** GOTO lbl6
            if (!this.awaitingInitialDisplacement) break block97;
            if (var3_3 || var3_3) ** GOTO lbl6
            this.rememberedItemSlot = var1_4;
            if (var3_3) ** GOTO lbl6
        }
        if (var3_3 || var3_3) ** GOTO lbl6
        hi.mc.field_1761.method_2906(hi.mc.field_1724.field_7498.field_7763, var1_4, (int)hi.dmsl("dpex", dmsv(int ), (int)895), class_1713.field_7791, (class_1657)hi.mc.field_1724);
        if (var3_3 || var3_3) ** GOTO lbl6
        this.placementAwaitingConfirmation = hi.dmsl("dpey", dmsv(int ), (int)896);
        if (var3_3 || var3_3) ** GOTO lbl6
        this.placementServerConfirmed = hi.dmsl("dpez", dmsv(int ), (int)897);
        if (var3_3 || var3_3) ** GOTO lbl6
        this.placementServerRejected = hi.dmsl("dpfa", dmsv(int ), (int)898);
        if (var3_3) ** GOTO lbl6
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_3) ** GOTO lbl6
                this.placementConfirmationDeadline = System.currentTimeMillis() + this.getServerConfirmationDelay() + hi.dmsl("dpfb", dmts(int ), (int)287);
                if (var3_3 || var3_3) ** GOTO lbl6
                if (!this.awaitingInitialDisplacement) ** GOTO lbl63
                if (var3_3) ** GOTO lbl6
                if (this.itemHistory.isEmpty()) ** GOTO lbl63
                if (var3_3) ** GOTO lbl6
                if (!this.isRememberedSlotItem(this.getStackAtScreenSlot(var1_4), this.itemHistory.peek())) ** GOTO lbl63
                if (var3_3 || var3_3) ** GOTO lbl6
                this.awaitingInitialDisplacement = hi.dmsl("dpfc", dmsv(int ), (int)899);
                if (var3_3) ** GOTO lbl6
lbl63:
                // 4 sources

                if (!var3_3 && !var3_3) ** break;
                ** continue;
                return;
            }
lbl66:
            // 2 sources

            case 0: {
                var4_2 /* !! */  = (int)hi.dmsl("dpfd", dmsv(int ), (int)900);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl175
            }
            case 1: {
                var4_2 /* !! */  = (int)hi.dmsl("dpfe", dmsv(int ), (int)901);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl175
            }
lbl76:
            // 2 sources

            case 2: {
                var4_2 /* !! */  = (int)hi.dmsl("dpff", dmsv(int ), (int)902);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl91
            }
lbl81:
            // 2 sources

            case 3: {
                var4_2 /* !! */  = (int)hi.dmsl("dpfg", dmsv(int ), (int)903);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl221
            }
lbl86:
            // 3 sources

            case 4: {
                do {
                    var4_2 /* !! */  = (int)hi.dmsl("dpfh", dmsv(int ), (int)904);
                } while (!var5_1);
                throw null;
            }
lbl91:
            // 4 sources

            case 5: {
                var4_2 /* !! */  = (int)hi.dmsl("dpfi", dmsv(int ), (int)905);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl139
            }
lbl96:
            // 2 sources

            case 6: {
                var4_2 /* !! */  = (int)hi.dmsl("dpfj", dmsv(int ), (int)906);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl241
            }
            case 7: {
                var4_2 /* !! */  = (int)hi.dmsl("dpfk", dmsv(int ), (int)907);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl266
            }
            case 8: {
                var4_2 /* !! */  = (int)hi.dmsl("dpfl", dmsv(int ), (int)908);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl188
            }
            case 9: {
                var4_2 /* !! */  = (int)hi.dmsl("dpfm", dmsv(int ), (int)909);
                if (!var5_1) ** GOTO lbl86
                throw null;
            }
            case 10: {
                var4_2 /* !! */  = (int)hi.dmsl("dpfn", dmsv(int ), (int)910);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl120:
            // 2 sources

            case 11: {
                var4_2 /* !! */  = (int)hi.dmsl("dpfo", dmsv(int ), (int)911);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl266
            }
lbl125:
            // 2 sources

            case 12: {
                var4_2 /* !! */  = (int)hi.dmsl("dpfp", dmsv(int ), (int)912);
                if (!var5_1) ** GOTO lbl81
                throw null;
            }
            case 13: {
                var4_2 /* !! */  = (int)hi.dmsl("dpfq", dmsv(int ), (int)913);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl266
            }
            case 14: {
                var4_2 /* !! */  = (int)hi.dmsl("dpfr", dmsv(int ), (int)914);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl139:
            // 2 sources

            case 15: {
                var4_2 /* !! */  = (int)hi.dmsl("dpfs", dmsv(int ), (int)915);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl258
            }
lbl144:
            // 2 sources

            case 16: {
                var4_2 /* !! */  = (int)hi.dmsl("dpft", dmsv(int ), (int)916);
                if (!var5_1) ** GOTO lbl96
                throw null;
            }
lbl148:
            // 3 sources

            case 17: {
                var4_2 /* !! */  = (int)hi.dmsl("dpfu", dmsv(int ), (int)917);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl153:
            // 2 sources

            case 18: {
                var4_2 /* !! */  = (int)hi.dmsl("dpfv", dmsv(int ), (int)918);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl203
            }
lbl158:
            // 2 sources

            case 19: {
                var4_2 /* !! */  = (int)hi.dmsl("dpfw", dmsv(int ), (int)919);
                if (!var5_1) ** GOTO lbl66
                throw null;
            }
lbl162:
            // 2 sources

            case 20: {
                var4_2 /* !! */  = (int)hi.dmsl("dpfx", dmsv(int ), (int)920);
                if (!var5_1) ** GOTO lbl91
                throw null;
            }
            case 21: {
                var4_2 /* !! */  = (int)hi.dmsl("dpfy", dmsv(int ), (int)921);
                if (!var5_1) ** GOTO lbl148
                throw null;
            }
lbl170:
            // 3 sources

            case 22: {
                var4_2 /* !! */  = (int)hi.dmsl("dpfz", dmsv(int ), (int)922);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl188
            }
lbl175:
            // 3 sources

            case 23: {
                var4_2 /* !! */  = (int)hi.dmsl("dpga", dmsv(int ), (int)923);
                if (!var5_1) ** GOTO lbl148
                throw null;
            }
lbl179:
            // 2 sources

            case 24: {
                do {
                    var4_2 /* !! */  = (int)hi.dmsl("dpgb", dmsv(int ), (int)924);
                } while (!var5_1);
                throw null;
            }
lbl184:
            // 3 sources

            case 25: {
                var4_2 /* !! */  = (int)hi.dmsl("dpgc", dmsv(int ), (int)925);
                if (!var5_1) ** GOTO lbl170
                throw null;
            }
lbl188:
            // 3 sources

            case 26: {
                var4_2 /* !! */  = (int)hi.dmsl("dpgd", dmsv(int ), (int)926);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl225
            }
lbl193:
            // 2 sources

            case 27: {
                var4_2 /* !! */  = (int)hi.dmsl("dpge", dmsv(int ), (int)927);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl254
            }
            case 28: {
                var4_2 /* !! */  = (int)hi.dmsl("dpgf", dmsv(int ), (int)928);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl203:
            // 2 sources

            case 29: {
                var4_2 /* !! */  = (int)hi.dmsl("dpsa", dmsv(int ), (int)929);
                if (!var5_1) ** GOTO lbl153
                throw null;
            }
            case 30: {
                var4_2 /* !! */  = (int)hi.dmsl("dpsb", dmsv(int ), (int)930);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl246
            }
lbl212:
            // 2 sources

            case 31: {
                var4_2 /* !! */  = (int)hi.dmsl("dpsc", dmsv(int ), (int)931);
                if (!var5_1) ** GOTO lbl86
                throw null;
            }
            case 32: {
                var4_2 /* !! */  = (int)hi.dmsl("dpsd", dmsv(int ), (int)932);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl270
            }
lbl221:
            // 2 sources

            case 33: {
                var4_2 /* !! */  = (int)hi.dmsl("dpse", dmsv(int ), (int)933);
                if (!var5_1) ** GOTO lbl76
                throw null;
            }
lbl225:
            // 2 sources

            case 34: {
                var4_2 /* !! */  = (int)hi.dmsl("dpsf", dmsv(int ), (int)934);
                if (var5_1) {
                    throw null;
                }
            }
lbl229:
            // 5 sources

            case 35: {
                var4_2 /* !! */  = (int)hi.dmsl("dpsg", dmsv(int ), (int)935);
                if (!var5_1) ** GOTO lbl162
                throw null;
            }
            case 36: {
                var4_2 /* !! */  = (int)hi.dmsl("dpsh", dmsv(int ), (int)936);
                if (!var5_1) ** GOTO lbl179
                throw null;
            }
            case 37: {
                var4_2 /* !! */  = (int)hi.dmsl("dpsi", dmsv(int ), (int)937);
                if (!var5_1) ** GOTO lbl120
                throw null;
            }
lbl241:
            // 2 sources

            case 38: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)hi.dmsl("dpsj", dmsv(int ), (int)938);
                    if (!var5_1) ** GOTO lbl184
                    throw null;
                }
            }
lbl246:
            // 2 sources

            case 39: {
                var4_2 /* !! */  = (int)hi.dmsl("dpsk", dmsv(int ), (int)939);
                if (!var5_1) ** GOTO lbl184
                throw null;
            }
            case 40: {
                var4_2 /* !! */  = (int)hi.dmsl("dpsl", dmsv(int ), (int)940);
                if (!var5_1) ** GOTO lbl125
                throw null;
            }
lbl254:
            // 2 sources

            case 41: {
                var4_2 /* !! */  = (int)hi.dmsl("dpsm", dmsv(int ), (int)941);
                if (!var5_1) ** GOTO lbl144
                throw null;
            }
lbl258:
            // 3 sources

            case 42: {
                var4_2 /* !! */  = (int)hi.dmsl("dpsn", dmsv(int ), (int)942);
                if (!var5_1) ** GOTO lbl193
                throw null;
            }
            case 43: {
                var4_2 /* !! */  = (int)hi.dmsl("dpso", dmsv(int ), (int)943);
                if (!var5_1) ** GOTO lbl91
                throw null;
            }
lbl266:
            // 4 sources

            case 44: {
                var4_2 /* !! */  = (int)hi.dmsl("dpsp", dmsv(int ), (int)944);
                if (!var5_1) ** GOTO lbl170
                throw null;
            }
lbl270:
            // 2 sources

            case 45: {
                var4_2 /* !! */  = (int)hi.dmsl("dpsq", dmsv(int ), (int)945);
                if (!var5_1) ** GOTO lbl258
                throw null;
            }
            case 46: 
        }
        var4_2 /* !! */  = (int)hi.dmsl("dpsr", dmsv(int ), (int)946);
        ** while (!var5_1)
lbl277:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void executeRevertSwap() {
        block73: {
            block72: {
                block71: {
                    block70: {
                        var6_1 = hi.c;
                        var5_2 /* !! */  = hi.b;
                        var4_3 = hi.a;
                        if (var6_1) {
                            throw null;
lbl6:
                            // 17 sources

                            return;
                        }
                        if (var4_3 || var4_3) ** GOTO lbl6
                        if (this.totemSlot == hi.dmsl("dqhs", dmsv(int ), (int)1207)) break block70;
                        if (var4_3) ** GOTO lbl6
                        if (this.ensurePlayerInventoryHandler()) break block71;
                        if (var4_3) ** GOTO lbl6
                    }
                    if (var4_3 || var4_3) ** GOTO lbl6
                    return;
                }
                if (var4_3 || var4_3) ** GOTO lbl6
                var1_4 = this.itemHistory.peek();
                if (var4_3 || var4_3) ** GOTO lbl6
                var2_5 = this.getStackAtScreenSlot(this.totemSlot);
                if (var4_3 || var4_3) ** GOTO lbl6
                if (this.totemSlot != this.rememberedItemSlot) break block72;
                if (var4_3) ** GOTO lbl6
                if (!this.isRememberedSlotItem(var2_5, var1_4)) break block72;
                if (var4_3) ** GOTO lbl6
                v0 = hi.dmsl("dqhw", dmsv(int ), (int)1208);
                if (var6_1) {
                    throw null;
                }
                break block73;
            }
            if (var4_3 || var4_3) ** GOTO lbl6
            v0 = var3_6 = hi.dmsl("dqhx", dmsv(int ), (int)1209);
        }
        if (var4_3 || var4_3) ** GOTO lbl6
        if (var3_6 != false) ** GOTO lbl43
        if (var4_3) ** GOTO lbl6
        if (this.isExactRememberedItem(var2_5, var1_4)) ** GOTO lbl43
        if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_3 || var4_3) ** GOTO lbl6
                return;
            }
lbl43:
            // 2 sources

            if (var4_3 || var4_3) ** GOTO lbl6
            this.pendingRevertItem = var2_5.method_7972();
            if (var4_3 || var4_3) ** GOTO lbl6
            this.pendingRevertSourceSlot = this.totemSlot;
            if (var4_3 || var4_3) ** GOTO lbl6
            hi.mc.field_1761.method_2906(hi.mc.field_1724.field_7498.field_7763, this.totemSlot, (int)hi.dmsl("dqhy", dmsv(int ), (int)1210), class_1713.field_7791, (class_1657)hi.mc.field_1724);
            if (!var4_3 && !var4_3) ** break;
            ** continue;
            return;
lbl52:
            // 2 sources

            case 0: {
                var5_2 /* !! */  = (int)hi.dmsl("dqhz", dmsv(int ), (int)1211);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl111
            }
            case 1: {
                var5_2 /* !! */  = (int)hi.dmsl("dqia", dmsv(int ), (int)1212);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl111
            }
lbl62:
            // 2 sources

            case 2: {
                var5_2 /* !! */  = (int)hi.dmsl("dqih", dmsv(int ), (int)1213);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl186
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_2 /* !! */  = (int)hi.dmsl("dqii", dmsv(int ), (int)1214);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl174
                    break;
                }
            }
            case 4: {
                var5_2 /* !! */  = (int)hi.dmsl("dqij", dmsv(int ), (int)1215);
                if (!var6_1) ** GOTO lbl52
                throw null;
            }
            case 5: {
                var5_2 /* !! */  = (int)hi.dmsl("dqik", dmsv(int ), (int)1216);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl165
            }
            case 6: {
                var5_2 /* !! */  = (int)hi.dmsl("dqil", dmsv(int ), (int)1217);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl102
            }
lbl87:
            // 2 sources

            case 7: {
                var5_2 /* !! */  = (int)hi.dmsl("dqin", dmsv(int ), (int)1218);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl97
            }
lbl92:
            // 2 sources

            case 8: {
                var5_2 /* !! */  = (int)hi.dmsl("dqip", dmsv(int ), (int)1219);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl147
            }
lbl97:
            // 4 sources

            case 9: {
                var5_2 /* !! */  = (int)hi.dmsl("dqiu", dmsv(int ), (int)1220);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl128
            }
lbl102:
            // 3 sources

            case 10: {
                var5_2 /* !! */  = (int)hi.dmsl("dqiv", dmsv(int ), (int)1221);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl137
            }
lbl107:
            // 2 sources

            case 11: {
                var5_2 /* !! */  = (int)hi.dmsl("dqiw", dmsv(int ), (int)1222);
                if (!var6_1) ** GOTO lbl97
                throw null;
            }
lbl111:
            // 3 sources

            case 12: {
                var5_2 /* !! */  = (int)hi.dmsl("dqix", dmsv(int ), (int)1223);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl182
            }
lbl116:
            // 2 sources

            case 13: {
                var5_2 /* !! */  = (int)hi.dmsl("dqiy", dmsv(int ), (int)1224);
                if (var6_1) {
                    throw null;
                }
            }
            case 14: {
                var5_2 /* !! */  = (int)hi.dmsl("dqjc", dmsv(int ), (int)1225);
                if (!var6_1) ** GOTO lbl62
                throw null;
            }
lbl124:
            // 2 sources

            case 15: {
                var5_2 /* !! */  = (int)hi.dmsl("dqje", dmsv(int ), (int)1226);
                if (!var6_1) ** GOTO lbl97
                throw null;
            }
lbl128:
            // 3 sources

            case 16: {
                var5_2 /* !! */  = (int)hi.dmsl("dqji", dmsv(int ), (int)1227);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl174
            }
            case 17: {
                var5_2 /* !! */  = (int)hi.dmsl("dqjm", dmsv(int ), (int)1228);
                if (!var6_1) ** GOTO lbl124
                throw null;
            }
lbl137:
            // 2 sources

            case 18: {
                do {
                    var5_2 /* !! */  = (int)hi.dmsl("dqjo", dmsv(int ), (int)1229);
                } while (!var6_1);
                throw null;
            }
            case 19: {
                var5_2 /* !! */  = (int)hi.dmsl("dqjp", dmsv(int ), (int)1230);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl147:
            // 2 sources

            case 20: {
                var5_2 /* !! */  = (int)hi.dmsl("dqjq", dmsv(int ), (int)1231);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl186
            }
            case 21: {
                var5_2 /* !! */  = (int)hi.dmsl("dqjr", dmsv(int ), (int)1232);
                if (!var6_1) ** GOTO lbl128
                throw null;
            }
            case 22: {
                var5_2 /* !! */  = (int)hi.dmsl("dqjs", dmsv(int ), (int)1233);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl174
            }
            case 23: {
                var5_2 /* !! */  = (int)hi.dmsl("dqjt", dmsv(int ), (int)1234);
                if (!var6_1) ** GOTO lbl102
                throw null;
            }
lbl165:
            // 2 sources

            case 24: {
                var5_2 /* !! */  = (int)hi.dmsl("dqju", dmsv(int ), (int)1235);
                if (!var6_1) ** GOTO lbl116
                throw null;
            }
            case 25: {
                var5_2 /* !! */  = (int)hi.dmsl("dqjv", dmsv(int ), (int)1236);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl182
            }
lbl174:
            // 5 sources

            case 26: {
                var5_2 /* !! */  = (int)hi.dmsl("dqjw", dmsv(int ), (int)1237);
                if (!var6_1) ** GOTO lbl87
                throw null;
            }
lbl178:
            // 2 sources

            case 27: {
                var5_2 /* !! */  = (int)hi.dmsl("dqjx", dmsv(int ), (int)1238);
                if (!var6_1) ** GOTO lbl107
                throw null;
            }
lbl182:
            // 4 sources

            case 28: {
                var5_2 /* !! */  = (int)hi.dmsl("dqjy", dmsv(int ), (int)1239);
                if (var6_1) {
                    throw null;
                }
            }
lbl186:
            // 5 sources

            case 29: {
                var5_2 /* !! */  = (int)hi.dmsl("dqjz", dmsv(int ), (int)1240);
                if (!var6_1) ** GOTO lbl178
                throw null;
            }
            case 30: {
                var5_2 /* !! */  = (int)hi.dmsl("dqka", dmsv(int ), (int)1241);
                if (!var6_1) ** GOTO lbl182
                throw null;
            }
            case 31: {
                var5_2 /* !! */  = (int)hi.dmsl("dqkb", dmsv(int ), (int)1242);
                if (!var6_1) ** GOTO lbl92
                throw null;
            }
            case 32: 
        }
        var5_2 /* !! */  = (int)hi.dmsl("dqkc", dmsv(int ), (int)1243);
        ** while (!var6_1)
lbl201:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dtsn() {
        hi.dmtu[800] = 4627500547353279900L;
        hi.dmtu[801] = 1597606553913782814L;
        hi.dmtu[802] = 3963778738726090011L;
        hi.dmtu[803] = -8721465434471568899L;
        hi.dmtu[804] = -3599377826344772741L;
        hi.dmtu[805] = 2551063907599098126L;
        hi.dmtu[806] = 7330783933217179339L;
        hi.dmtu[807] = -1024935876482264361L;
        hi.dmtu[808] = -1664865467367897131L;
        hi.dmtu[809] = 8022599470899058502L;
        hi.dmtu[810] = 7035241086794332391L;
        hi.dmtu[811] = -6815294956308845888L;
        hi.dmtu[812] = -3305884657531348186L;
        hi.dmtu[813] = 319041867261024485L;
        hi.dmtu[814] = -511259067333775935L;
        hi.dmtu[815] = -115437740297400666L;
        hi.dmtu[816] = -25430922835255025L;
        hi.dmtu[817] = -7132427786807202305L;
        hi.dmtu[818] = -7998737172049819800L;
        hi.dmtu[819] = 5411832787588614820L;
        hi.dmtu[820] = 6947572934754190085L;
        hi.dmtu[821] = -7820539194431743468L;
        hi.dmtu[822] = 5145458803028942126L;
        hi.dmtu[823] = -9062208623762233961L;
        hi.dmtu[824] = -6344049633285571258L;
        hi.dmtu[825] = -3835453640623584940L;
        hi.dmtu[826] = 371088326508916446L;
        hi.dmtu[827] = 8396298082437107042L;
        hi.dmtu[828] = 4947358325995628773L;
        hi.dmtu[829] = -7652301509507563406L;
        hi.dmtu[830] = -2658026079306412260L;
        hi.dmtu[831] = 3267382725547980628L;
        hi.dmtu[832] = -2905148009233432271L;
        hi.dmtu[833] = -8461284342811930540L;
        hi.dmtu[834] = 8985657722439266601L;
        hi.dmtu[835] = -5403185326752558335L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void startRevert() {
        v0 /* !! */  = hi.ib;
        if (true) ** GOTO lbl5
        block67: while (true) {
            v0 /* !! */  = (long)(v1 - hi.dmsl("dqaq", dmts(int ), (int)325));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1610357799: {
                    v1 = hi.dmsl("dqas", dmts(int ), (int)326);
                    continue block67;
                }
                case -1312226904: {
                    v1 = hi.dmsl("dqav", dmts(int ), (int)327);
                    continue block67;
                }
                case 560118747: {
                    v1 = hi.dmsl("dqaw", dmts(int ), (int)328);
                    continue block67;
                }
                case 1228545173: {
                    break block67;
                }
            }
            break;
        }
        var4_1 = hi.c;
        v2 /* !! */  = hi.ib;
        if (true) ** GOTO lbl22
        block68: while (true) {
            v2 /* !! */  = (long)(v3 - hi.dmsl("dqay", dmts(int ), (int)329));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2050735748: {
                    v3 = hi.dmsl("dqba", dmts(int ), (int)330);
                    continue block68;
                }
                case 281637597: {
                    v3 = hi.dmsl("dqbc", dmts(int ), (int)331);
                    continue block68;
                }
                case 355624775: {
                    v3 = hi.dmsl("dqbd", dmts(int ), (int)332);
                    continue block68;
                }
                case 1228545173: {
                    break block68;
                }
            }
            break;
        }
        var3_2 /* !! */  = hi.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = hi.ib - hi.dmsl("dqbf", dmts(int ), (int)333)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == hi.dmsl("dqbg", dmsv(int ), (int)1089)) {
                var2_3 = hi.a;
                if (var4_1) {
                    throw null;
                }
                break;
            }
            v4 /* !! */  = (long)hi.dmsl("dqbh", dmsv(int ), (int)1090);
        }
        if (var2_3 || var2_3) return;
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_2 = hi.ib - hi.dmsl("dqbl", dmts(int ), (int)334)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == hi.dmsl("dqbn", dmsv(int ), (int)1091)) {
                var1_4 = this.findPreviousItem();
                if (var2_3) return;
                break;
            }
            v5 /* !! */  = (long)hi.dmsl("dqbo", dmsv(int ), (int)1092);
        }
        if (var2_3) return;
        v6 /* !! */  = hi.ib;
        block71: while (true) {
            switch ((int)v6 /* !! */ ) {
                case 1228545173: {
                    break block71;
                }
                case 1325421250: {
                    v6 /* !! */  = (long)(hi.dmsl("dqbt", dmts(int ), (int)336) - hi.dmsl("dqbr", dmts(int ), (int)335));
                    continue block71;
                }
            }
            break;
        }
        if (!var1_4.found()) {
            if (var2_3 || var2_3) return;
            return;
        }
        if (var2_3 || var2_3) return;
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_3 = hi.ib - hi.dmsl("dqbw", dmts(int ), (int)337)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == hi.dmsl("dqby", dmsv(int ), (int)1093)) break;
            v7 /* !! */  = (long)hi.dmsl("dqbz", dmsv(int ), (int)1094);
        }
        v8 = var1_4.slot();
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_4 = hi.ib - hi.dmsl("dqca", dmts(int ), (int)338)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == hi.dmsl("dqcc", dmsv(int ), (int)1095)) {
                this.totemSlot = v8;
                if (var2_3) return;
                break;
            }
            v9 /* !! */  = (long)hi.dmsl("dqcd", dmsv(int ), (int)1096);
        }
        if (var2_3) return;
        v10 = hi.dmsl("dqce", dmsv(int ), (int)1097);
        v11 /* !! */  = hi.ib;
        block74: while (true) {
            switch ((int)v11 /* !! */ ) {
                case -736977311: {
                    v11 /* !! */  = (long)(hi.dmsl("dqch", dmts(int ), (int)340) - hi.dmsl("dqcf", dmts(int ), (int)339));
                    continue block74;
                }
                case 1228545173: {
                    break block74;
                }
            }
            break;
        }
        this.revertSucceeded = v10;
        if (var2_3 || var2_3) return;
        while (true) {
            block122: {
                if ((v12 /* !! */  = (cfr_temp_5 = hi.ib - hi.dmsl("dqci", dmts(int ), (int)341)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v12 /* !! */  != hi.dmsl("dqcj", dmsv(int ), (int)1098)) break block122;
                v13 /* !! */  = hi.ib;
                if (true) ** GOTO lbl102
            }
            v12 /* !! */  = (long)hi.dmsl("dqck", dmsv(int ), (int)1099);
        }
        block76: while (true) {
            v13 /* !! */  = (long)(v14 - hi.dmsl("dqcl", dmts(int ), (int)342));
lbl102:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -479437129: {
                    v14 = hi.dmsl("dqcm", dmts(int ), (int)343);
                    continue block76;
                }
                case -222057218: {
                    v14 = hi.dmsl("dqcn", dmts(int ), (int)344);
                    continue block76;
                }
                case 278052429: {
                    v14 = hi.dmsl("dqcp", dmts(int ), (int)345);
                    continue block76;
                }
                case 1228545173: {
                    break block76;
                }
            }
            break;
        }
        this.pendingRevertItem = class_1799.field_8037;
        if (var2_3 || var2_3) return;
        v15 = hi.dmsl("dqcq", dmsv(int ), (int)1100);
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_6 = hi.ib - hi.dmsl("dqcr", dmts(int ), (int)346)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v16 /* !! */  == hi.dmsl("dqcs", dmsv(int ), (int)1101)) {
                this.pendingRevertSourceSlot = (int)v15;
                if (var2_3) return;
                break;
            }
            v16 /* !! */  = (long)hi.dmsl("dqcu", dmsv(int ), (int)1102);
        }
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block78: while (true) {
            block123: {
                switch (cfr_temp_0 == -2147483648 ? var3_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var2_3) return;
                        v17 = hi.dmsl("dqcv", dmsv(int ), (int)1103);
                        v18 /* !! */  = hi.ib;
                        block79: while (true) {
                            switch ((int)v18 /* !! */ ) {
                                case 532845986: {
                                    v19 = hi.dmsl("dqcx", dmts(int ), (int)348);
                                    ** GOTO lbl145
                                }
                                case 728252068: {
                                    v19 = hi.dmsl("dqcy", dmts(int ), (int)349);
                                    ** GOTO lbl145
                                }
                                case 1228545173: {
                                    break block79;
                                }
                                case 1624085924: {
                                    v19 = hi.dmsl("dqcz", dmts(int ), (int)350);
lbl145:
                                    // 3 sources

                                    v18 /* !! */  = (long)(v19 - hi.dmsl("dqcw", dmts(int ), (int)347));
                                    continue block79;
                                }
                            }
                            break;
                        }
                        v20 = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, executeRevertSwap(), ()V)((hi)this);
                        v21 /* !! */  = hi.ib;
                        block80: while (true) {
                            switch ((int)v21 /* !! */ ) {
                                case 68142791: {
                                    v21 /* !! */  = (long)(hi.dmsl("dqdb", dmts(int ), (int)352) - hi.dmsl("dqda", dmts(int ), (int)351));
                                    continue block80;
                                }
                                case 1228545173: {
                                    break block80;
                                }
                            }
                            break;
                        }
                        v22 = this.createSwapSettings();
                        while (true) {
                            if ((v23 /* !! */  = (cfr_temp_7 = hi.ib - hi.dmsl("dqdc", dmts(int ), (int)353)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                            if (v23 /* !! */  != hi.dmsl("dqdd", dmsv(int ), (int)1104)) ** GOTO lbl163
                            v24 = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, cleanupAfterRevert(), ()V)((hi)this);
                            v25 /* !! */  = hi.ib;
                            if (true) ** GOTO lbl270
lbl163:
                            // 1 sources

                            v23 /* !! */  = (long)hi.dmsl("dqde", dmsv(int ), (int)1105);
                        }
                    }
                    case 2: {
                        var3_2 /* !! */  = (int)hi.dmsl("dqdo", dmsv(int ), (int)1110);
                        cfr_temp_0 = 5;
                        if (var4_1) {
                            throw null;
                        }
                        break block123;
                    }
                    case 3: {
                        var3_2 /* !! */  = (int)hi.dmsl("dqdp", dmsv(int ), (int)1111);
                        cfr_temp_0 = 12;
                        if (var4_1) {
                            throw null;
                        }
                        break block123;
                    }
                    case 4: {
                        var3_2 /* !! */  = (int)hi.dmsl("dqdq", dmsv(int ), (int)1112);
                        cfr_temp_0 = 19;
                        if (var4_1) {
                            throw null;
                        }
                        break block123;
                    }
                    case 6: {
                        var3_2 /* !! */  = (int)hi.dmsl("dqds", dmsv(int ), (int)1114);
                        cfr_temp_0 = 11;
                        if (var4_1) {
                            throw null;
                        }
                        break block123;
                    }
                    case 7: {
                        var3_2 /* !! */  = (int)hi.dmsl("dqdt", dmsv(int ), (int)1115);
                        cfr_temp_0 = 8;
                        if (var4_1) {
                            throw null;
                        }
                        break block123;
                    }
                    case 10: {
                        var3_2 /* !! */  = (int)hi.dmsl("dqdw", dmsv(int ), (int)1118);
                        cfr_temp_0 = 19;
                        if (var4_1) {
                            throw null;
                        }
                        break block123;
                    }
                    case 16: {
                        var3_2 /* !! */  = (int)hi.dmsl("dqec", dmsv(int ), (int)1124);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 5: {
                        var3_2 /* !! */  = (int)hi.dmsl("dqdr", dmsv(int ), (int)1113);
                        cfr_temp_0 = 21;
                        if (var4_1) {
                            throw null;
                        }
                        break block123;
                    }
                    case 17: {
                        var3_2 /* !! */  = (int)hi.dmsl("dqed", dmsv(int ), (int)1125);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 15: {
                        var3_2 /* !! */  = (int)hi.dmsl("dqeb", dmsv(int ), (int)1123);
                        cfr_temp_0 = 19;
                        if (var4_1) {
                            throw null;
                        }
                        break block123;
                    }
                    case 18: {
                        var3_2 /* !! */  = (int)hi.dmsl("dqee", dmsv(int ), (int)1126);
                        cfr_temp_0 = 12;
                        if (var4_1) {
                            throw null;
                        }
                        break block123;
                    }
                    case 19: {
                        var3_2 /* !! */  = (int)hi.dmsl("dqef", dmsv(int ), (int)1127);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 0: {
                        var3_2 /* !! */  = (int)hi.dmsl("dqdm", dmsv(int ), (int)1108);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 8: {
                        ** GOTO lbl264
                    }
                    case 20: {
                        var3_2 /* !! */  = (int)hi.dmsl("dqeg", dmsv(int ), (int)1128);
                        cfr_temp_0 = 1;
                        if (var4_1) {
                            throw null;
                        }
                        break block123;
                    }
                    case 21: {
                        var3_2 /* !! */  = (int)hi.dmsl("dqeh", dmsv(int ), (int)1129);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 11: {
                        var3_2 /* !! */  = (int)hi.dmsl("dqdx", dmsv(int ), (int)1119);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 1: {
                        var3_2 /* !! */  = (int)hi.dmsl("dqdn", dmsv(int ), (int)1109);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 13: {
                        do {
                            var3_2 /* !! */  = (int)hi.dmsl("dqdz", dmsv(int ), (int)1121);
                        } while (!var4_1);
                        throw null;
                    }
                    case 22: {
                        var3_2 /* !! */  = (int)hi.dmsl("dqei", dmsv(int ), (int)1130);
                        if (var4_1) {
                            throw null;
                        }
lbl264:
                        // 3 sources

                        var3_2 /* !! */  = (int)hi.dmsl("dqdu", dmsv(int ), (int)1116);
                        if (var4_1) {
                            throw null;
                        }
                        ** GOTO lbl295
                    }
                    block83: while (true) {
                        v25 /* !! */  = (long)(v26 - hi.dmsl("dqdf", dmts(int ), (int)354));
lbl270:
                        // 2 sources

                        switch ((int)v25 /* !! */ ) {
                            case -1219119509: {
                                v26 = hi.dmsl("dqdg", dmts(int ), (int)355);
                                continue block83;
                            }
                            case -871468510: {
                                v26 = hi.dmsl("dqdh", dmts(int ), (int)356);
                                continue block83;
                            }
                            case 738887489: {
                                v26 = hi.dmsl("dqdi", dmts(int ), (int)357);
                                continue block83;
                            }
                            case 1228545173: {
                                break block83;
                            }
                        }
                        break;
                    }
                    nz.queueSwap("AutoTotem", (int)v17, v20, v22, v24);
                    if (var2_3 || var2_3) return;
                    while (true) {
                        if ((v27 /* !! */  = (cfr_temp_8 = hi.ib - hi.dmsl("dqdj", dmts(int ), (int)358)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                        if (v27 /* !! */  == hi.dmsl("dqdk", dmsv(int ), (int)1106)) {
                            this.flushFastSwap();
                            if (var2_3) return;
                            break;
                        }
                        v27 /* !! */  = (long)hi.dmsl("dqdl", dmsv(int ), (int)1107);
                    }
                    if (!var2_3) return;
                    return;
lbl295:
                    // 2 sources

                    case 9: {
                        var3_2 /* !! */  = (int)hi.dmsl("dqdv", dmsv(int ), (int)1117);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 14: {
                        var3_2 /* !! */  = (int)hi.dmsl("dqea", dmsv(int ), (int)1122);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 12: 
                }
                ** GOTO lbl308
            }
            do {
                if (true) continue block78;
lbl308:
                // 2 sources

                var3_2 /* !! */  = (int)hi.dmsl("dqdy", dmsv(int ), (int)1120);
                cfr_temp_0 = 9;
            } while (!var4_1);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void dtsm() {
        hi.dmtu[700] = -1445241311793444274L;
        hi.dmtu[701] = -9023219441788459969L;
        hi.dmtu[702] = 1080014059716424918L;
        hi.dmtu[703] = -7720021887760604415L;
        hi.dmtu[704] = -2956506882320591929L;
        hi.dmtu[705] = 3657863547559708306L;
        hi.dmtu[706] = 1610902626444467319L;
        hi.dmtu[707] = -7176521317949470865L;
        hi.dmtu[708] = -3491297946059348400L;
        hi.dmtu[709] = -3013270683361127519L;
        hi.dmtu[710] = -7164429020121624658L;
        hi.dmtu[711] = -2237986884073557254L;
        hi.dmtu[712] = -2462683470112409334L;
        hi.dmtu[713] = 1767419234986999054L;
        hi.dmtu[714] = 2018597605225832948L;
        hi.dmtu[715] = -3340506097664715870L;
        hi.dmtu[716] = -3342248719346122639L;
        hi.dmtu[717] = 6026059344089759355L;
        hi.dmtu[718] = -3072356365857861530L;
        hi.dmtu[719] = -3057073103548929365L;
        hi.dmtu[720] = -3710181104241439475L;
        hi.dmtu[721] = -2314118330838469852L;
        hi.dmtu[722] = 3828972333785604155L;
        hi.dmtu[723] = 4738544548148678428L;
        hi.dmtu[724] = -2949975141464508819L;
        hi.dmtu[725] = -7832400187251723452L;
        hi.dmtu[726] = 3819118862702749675L;
        hi.dmtu[727] = 1366359556968670097L;
        hi.dmtu[728] = -1970136512037117076L;
        hi.dmtu[729] = -5120046553437925761L;
        hi.dmtu[730] = 5809602609111426898L;
        hi.dmtu[731] = -4188760790163574958L;
        hi.dmtu[732] = -4477221455460634254L;
        hi.dmtu[733] = 210594512028868799L;
        hi.dmtu[734] = 1725638276465547005L;
        hi.dmtu[735] = -8619921196836750014L;
        hi.dmtu[736] = -3211147002901251896L;
        hi.dmtu[737] = -7195767187924955959L;
        hi.dmtu[738] = -2277059331956920994L;
        hi.dmtu[739] = 2371597041555976895L;
        hi.dmtu[740] = 124769472000745814L;
        hi.dmtu[741] = -1492074140743900546L;
        hi.dmtu[742] = 9141993783327016321L;
        hi.dmtu[743] = -7337070872091980195L;
        hi.dmtu[744] = -4571383181723682798L;
        hi.dmtu[745] = 4654576042241114160L;
        hi.dmtu[746] = 2438415122147408893L;
        hi.dmtu[747] = -4321266429518800144L;
        hi.dmtu[748] = 5179712833706894269L;
        hi.dmtu[749] = 5362651447210015954L;
        hi.dmtu[750] = 2574170957423620214L;
        hi.dmtu[751] = -5344274890614418540L;
        hi.dmtu[752] = 8232153431283585346L;
        hi.dmtu[753] = 6933838040955790708L;
        hi.dmtu[754] = -7158846555344755751L;
        hi.dmtu[755] = -7727413480168059504L;
        hi.dmtu[756] = 6867033730489491281L;
        hi.dmtu[757] = -9105897324028614863L;
        hi.dmtu[758] = 8542872092641508512L;
        hi.dmtu[759] = -8669552649085121403L;
        hi.dmtu[760] = -8323953846142306086L;
        hi.dmtu[761] = -4506048039628069620L;
        hi.dmtu[762] = 9003004043227953038L;
        hi.dmtu[763] = 7624351583866429728L;
        hi.dmtu[764] = -8106645958266532788L;
        hi.dmtu[765] = -5894362048452164252L;
        hi.dmtu[766] = 8301422159122082627L;
        hi.dmtu[767] = 4324756524095597473L;
        hi.dmtu[768] = 8602063581447401323L;
        hi.dmtu[769] = -5164614278221799398L;
        hi.dmtu[770] = -7539044135830989306L;
        hi.dmtu[771] = -3864911623046185015L;
        hi.dmtu[772] = -2404073808162943061L;
        hi.dmtu[773] = -3045707742686689445L;
        hi.dmtu[774] = 8126902675770875344L;
        hi.dmtu[775] = -7875350173301249965L;
        hi.dmtu[776] = -7116462602672750961L;
        hi.dmtu[777] = 8092908653111519714L;
        hi.dmtu[778] = -1862214700924874575L;
        hi.dmtu[779] = -5532074132393484459L;
        hi.dmtu[780] = -3491334480254300182L;
        hi.dmtu[781] = -5278167195345024505L;
        hi.dmtu[782] = -3919293030853486063L;
        hi.dmtu[783] = 5227568088072025476L;
        hi.dmtu[784] = -1967832499943058206L;
        hi.dmtu[785] = 7868105153689449167L;
        hi.dmtu[786] = -712666020709507027L;
        hi.dmtu[787] = 6609654002659361543L;
        hi.dmtu[788] = -1267271942600480796L;
        hi.dmtu[789] = -811882126150654830L;
        hi.dmtu[790] = -4297812401099899764L;
        hi.dmtu[791] = 8734182015755719444L;
        hi.dmtu[792] = -3716098370843968311L;
        hi.dmtu[793] = 976439838750141161L;
        hi.dmtu[794] = 8454078230909807449L;
        hi.dmtu[795] = -828780533453630262L;
        hi.dmtu[796] = 6645253542005074747L;
        hi.dmtu[797] = -5289902873945990323L;
        hi.dmtu[798] = 2113239478509670408L;
        hi.dmtu[799] = 3028484288192741125L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isRememberedSlotItem(class_1799 var1_1, class_1799 var2_2) {
        v0 /* !! */  = hi.ib;
        if (true) ** GOTO lbl5
        block36: while (true) {
            v0 /* !! */  = (long)(hi.dmsl("dqsq", dmts(int ), (int)463) - hi.dmsl("dqsp", dmts(int ), (int)462));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1565738271: {
                    continue block36;
                }
                case 1228545173: {
                    break block36;
                }
            }
            break;
        }
        var5_3 = hi.c;
        v1 /* !! */  = hi.ib;
        if (true) ** GOTO lbl15
        block37: while (true) {
            v1 /* !! */  = (long)(v2 - hi.dmsl("dqsr", dmts(int ), (int)464));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 403878718: {
                    v2 = hi.dmsl("dqss", dmts(int ), (int)465);
                    continue block37;
                }
                case 1228545173: {
                    break block37;
                }
                case 1314615697: {
                    v2 = hi.dmsl("dqst", dmts(int ), (int)466);
                    continue block37;
                }
            }
            break;
        }
        var4_4 /* !! */  = hi.b;
        v3 /* !! */  = hi.ib;
        if (true) ** GOTO lbl29
        block38: while (true) {
            v3 /* !! */  = (long)(hi.dmsl("dqsv", dmts(int ), (int)468) - hi.dmsl("dqsu", dmts(int ), (int)467));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1636096319: {
                    continue block38;
                }
                case 1228545173: {
                    break block38;
                }
            }
            break;
        }
        var3_5 = hi.a;
        if (var5_3) {
            throw null;
lbl37:
            // 7 sources

            return (boolean)hi.dmsl("dqsw", dmsv(int ), (int)1340);
        }
        if (var3_5 || var3_5) ** GOTO lbl37
        if (var1_1 == null) ** GOTO lbl85
        if (var3_5) ** GOTO lbl37
        if (var2_2 == null) ** GOTO lbl85
        if (var3_5) ** GOTO lbl37
        v4 /* !! */  = hi.ib;
        if (true) ** GOTO lbl48
        block40: while (true) {
            v4 /* !! */  = (long)(v5 - hi.dmsl("dqsx", dmts(int ), (int)469));
lbl48:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 260169882: {
                    v5 = hi.dmsl("dqsy", dmts(int ), (int)470);
                    continue block40;
                }
                case 1179438492: {
                    v5 = hi.dmsl("dqsz", dmts(int ), (int)471);
                    continue block40;
                }
                case 1228545173: {
                    break block40;
                }
            }
            break;
        }
        if (var1_1.method_7960()) ** GOTO lbl85
        if (var3_5) ** GOTO lbl37
        v6 /* !! */  = hi.ib;
        if (true) ** GOTO lbl63
        block41: while (true) {
            v6 /* !! */  = (long)(hi.dmsl("dqtb", dmts(int ), (int)473) - hi.dmsl("dqta", dmts(int ), (int)472));
lbl63:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case 951689671: {
                    continue block41;
                }
                case 1228545173: {
                    break block41;
                }
            }
            break;
        }
        if (var2_2.method_7960()) ** GOTO lbl85
        if (var3_5) ** GOTO lbl37
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_0 = hi.ib - hi.dmsl("dqtc", dmts(int ), (int)474)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v7 /* !! */  == hi.dmsl("dqtd", dmsv(int ), (int)1341)) break;
            v7 /* !! */  = (long)hi.dmsl("dqte", dmsv(int ), (int)1342);
        }
        if (!class_1799.method_7984((class_1799)var1_1, (class_1799)var2_2)) ** GOTO lbl85
        if (var3_5) ** GOTO lbl37
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v8 = hi.dmsl("dqtf", dmsv(int ), (int)1343);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl88
            }
lbl85:
            // 5 sources

            if (!var3_5 && !var3_5) ** break;
            ** continue;
            v8 = hi.dmsl("dqtg", dmsv(int ), (int)1344);
lbl88:
            // 2 sources

            return (boolean)v8;
lbl89:
            // 2 sources

            case 0: {
                do {
                    var4_4 /* !! */  = (int)hi.dmsl("dqth", dmsv(int ), (int)1345);
                } while (!var5_3);
                throw null;
            }
            case 1: {
                var4_4 /* !! */  = (int)hi.dmsl("dqti", dmsv(int ), (int)1346);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl114
            }
            case 2: {
                var4_4 /* !! */  = (int)hi.dmsl("dqtj", dmsv(int ), (int)1347);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl119
            }
lbl104:
            // 4 sources

            case 3: {
                var4_4 /* !! */  = (int)hi.dmsl("dqtk", dmsv(int ), (int)1348);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl132
            }
            case 4: {
                var4_4 /* !! */  = (int)hi.dmsl("dqtl", dmsv(int ), (int)1349);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl127
            }
lbl114:
            // 2 sources

            case 5: {
                var4_4 /* !! */  = (int)hi.dmsl("dqtm", dmsv(int ), (int)1350);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl132
            }
lbl119:
            // 2 sources

            case 6: {
                var4_4 /* !! */  = (int)hi.dmsl("dqtn", dmsv(int ), (int)1351);
                if (!var5_3) ** GOTO lbl104
                throw null;
            }
            case 7: {
                var4_4 /* !! */  = (int)hi.dmsl("dqto", dmsv(int ), (int)1352);
                if (!var5_3) ** GOTO lbl104
                throw null;
            }
lbl127:
            // 3 sources

            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)hi.dmsl("dqtp", dmsv(int ), (int)1353);
                    if (!var5_3) ** GOTO lbl104
                    throw null;
                }
            }
lbl132:
            // 3 sources

            case 9: {
                var4_4 /* !! */  = (int)hi.dmsl("dqtq", dmsv(int ), (int)1354);
                if (!var5_3) ** GOTO lbl127
                throw null;
            }
            case 10: {
                var4_4 /* !! */  = (int)hi.dmsl("dqtr", dmsv(int ), (int)1355);
                if (!var5_3) ** GOTO lbl89
                throw null;
            }
            case 11: 
        }
        var4_4 /* !! */  = (int)hi.dmsl("dqts", dmsv(int ), (int)1356);
        ** while (!var5_3)
lbl143:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float dmsi(int n2) {
        return Float.intBitsToFloat(dmsj[n2] ^ dmsk[n2]);
    }

    private static /* synthetic */ void dtmk() {
        hi.dmsk[700] = -916575381;
        hi.dmsk[701] = -1045111062;
        hi.dmsk[702] = 1953421469;
        hi.dmsk[703] = 1850085730;
        hi.dmsk[704] = -1339508722;
        hi.dmsk[705] = 989394429;
        hi.dmsk[706] = 1480302184;
        hi.dmsk[707] = 431661709;
        hi.dmsk[708] = -1958576437;
        hi.dmsk[709] = -1471371670;
        hi.dmsk[710] = -454287560;
        hi.dmsk[711] = -573789841;
        hi.dmsk[712] = 50325275;
        hi.dmsk[713] = -1007671397;
        hi.dmsk[714] = -110720687;
        hi.dmsk[715] = -2044058010;
        hi.dmsk[716] = 1543410387;
        hi.dmsk[717] = 2066076504;
        hi.dmsk[718] = 1677793224;
        hi.dmsk[719] = 972215611;
        hi.dmsk[720] = -1783253761;
        hi.dmsk[721] = 1779079503;
        hi.dmsk[722] = -1852678753;
        hi.dmsk[723] = -1240649580;
        hi.dmsk[724] = -1427428274;
        hi.dmsk[725] = 1346946147;
        hi.dmsk[726] = -835255916;
        hi.dmsk[727] = -1323143451;
        hi.dmsk[728] = 1103115602;
        hi.dmsk[729] = -1212699860;
        hi.dmsk[730] = -221767809;
        hi.dmsk[731] = 729967106;
        hi.dmsk[732] = 1178205319;
        hi.dmsk[733] = -2023656542;
        hi.dmsk[734] = -1374475265;
        hi.dmsk[735] = -375002123;
        hi.dmsk[736] = -801977197;
        hi.dmsk[737] = 963960340;
        hi.dmsk[738] = 1779754581;
        hi.dmsk[739] = -1312262895;
        hi.dmsk[740] = 2017025231;
        hi.dmsk[741] = 2022984542;
        hi.dmsk[742] = 371287183;
        hi.dmsk[743] = -888156345;
        hi.dmsk[744] = -1288174587;
        hi.dmsk[745] = 575828570;
        hi.dmsk[746] = 536065512;
        hi.dmsk[747] = 2101936823;
        hi.dmsk[748] = -904539269;
        hi.dmsk[749] = -725583722;
        hi.dmsk[750] = 1095767918;
        hi.dmsk[751] = -2136506486;
        hi.dmsk[752] = -1793073616;
        hi.dmsk[753] = -84385209;
        hi.dmsk[754] = 75159269;
        hi.dmsk[755] = 376213758;
        hi.dmsk[756] = -618057627;
        hi.dmsk[757] = -1412821634;
        hi.dmsk[758] = -1451229205;
        hi.dmsk[759] = -483758655;
        hi.dmsk[760] = 1714699102;
        hi.dmsk[761] = -44028775;
        hi.dmsk[762] = 2003187548;
        hi.dmsk[763] = 716667267;
        hi.dmsk[764] = -480200343;
        hi.dmsk[765] = -1005194245;
        hi.dmsk[766] = 824797431;
        hi.dmsk[767] = 572230598;
        hi.dmsk[768] = 369446431;
        hi.dmsk[769] = 286093055;
        hi.dmsk[770] = -184538303;
        hi.dmsk[771] = 638210039;
        hi.dmsk[772] = -427006231;
        hi.dmsk[773] = 1772204073;
        hi.dmsk[774] = -147259991;
        hi.dmsk[775] = -1843719486;
        hi.dmsk[776] = 1226842054;
        hi.dmsk[777] = 1255100574;
        hi.dmsk[778] = 1865073900;
        hi.dmsk[779] = 387944610;
        hi.dmsk[780] = -961990582;
        hi.dmsk[781] = 2120282838;
        hi.dmsk[782] = 1854286266;
        hi.dmsk[783] = -83846730;
        hi.dmsk[784] = -933157655;
        hi.dmsk[785] = 1783938191;
        hi.dmsk[786] = -536101479;
        hi.dmsk[787] = -341795109;
        hi.dmsk[788] = 1400399989;
        hi.dmsk[789] = 1623915524;
        hi.dmsk[790] = 1552222730;
        hi.dmsk[791] = -1649312778;
        hi.dmsk[792] = 458547684;
        hi.dmsk[793] = 253586526;
        hi.dmsk[794] = 303885801;
        hi.dmsk[795] = -2123623535;
        hi.dmsk[796] = 771107415;
        hi.dmsk[797] = 818007402;
        hi.dmsk[798] = 1964371225;
        hi.dmsk[799] = 1861062569;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public hi() {
        var2_1 /* !! */  = hi.b;
        super("AutoTotem", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0441\u0442\u0430\u0432\u0438\u0442 \u0442\u043e\u0442\u0435\u043c \u0432 \u043e\u0444\u0444\u0445\u0430\u043d\u0434 \u043f\u0440\u0438 \u043e\u043f\u0430\u0441\u043d\u043e\u0441\u0442\u0438", du.RAGE);
        this.mode = new kf("\u0420\u0435\u0436\u0438\u043c", "\u0411\u044b\u0441\u0442\u0440\u044b\u0439 - \u043c\u043e\u043c\u0435\u043d\u0442\u0430\u043b\u044c\u043d\u044b\u0439, ReallyWorld - \u0437\u0430\u0434\u0435\u0440\u0436\u043a\u0430 \u043f\u043e\u043b \u0442\u0438\u043a\u0430, New - \u043e\u0441\u0442\u0430\u043d\u043e\u0432\u043a\u0430 \u043d\u0430 \u043e\u0434\u0438\u043d \u0442\u0438\u043a", "\u0411\u044b\u0441\u0442\u0440\u044b\u0439", new String[]{"\u0411\u044b\u0441\u0442\u0440\u044b\u0439", "ReallyWorld", "New"});
        this.healthThreshold = new kg("\u041f\u043e\u0440\u043e\u0433 \u0425\u041f", "\u0425\u041f, \u043d\u0438\u0436\u0435 \u043a\u043e\u0442\u043e\u0440\u043e\u0433\u043e \u0441\u0442\u0430\u0432\u0438\u0442\u0441\u044f \u0442\u043e\u0442\u0435\u043c", (float)hi.dmsl("dmsm", dmsi(int ), (int)0)).range(1.0f, (float)hi.dmsl("dmsn", dmsi(int ), (int)1)).step((float)hi.dmsl("dmso", dmsi(int ), (int)2));
        this.checks = new ke("\u0427\u0435\u043a\u0438", "\u0423\u0441\u043b\u043e\u0432\u0438\u044f \u0430\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u043e\u0439 \u0443\u0441\u0442\u0430\u043d\u043e\u0432\u043a\u0438 \u0442\u043e\u0442\u0435\u043c\u0430").value(new String[]{"\u0417\u0434\u043e\u0440\u043e\u0432\u044c\u0435 \u043d\u0430 \u044d\u043b\u0438\u0442\u0440\u0430\u0445", "\u041a\u0440\u0438\u0441\u0442\u0430\u043b\u043b", "\u0417\u043e\u043b\u043e\u0442\u044b\u0435 \u0441\u0435\u0440\u0434\u0446\u0430", "\u0414\u0438\u043d\u0430\u043c\u0438\u0442", "\u0412\u0430\u0433\u043e\u043d\u0435\u0442\u043a\u0430 \u0441 \u0434\u0438\u043d\u0430\u043c\u0438\u0442\u043e\u043c", "\u041d\u0435 \u043f\u043e\u043b\u043d\u0430\u044f \u0431\u0440\u043e\u043d\u044f"}).selected(new String[]{"\u0417\u0434\u043e\u0440\u043e\u0432\u044c\u0435 \u043d\u0430 \u044d\u043b\u0438\u0442\u0440\u0430\u0445", "\u041a\u0440\u0438\u0441\u0442\u0430\u043b\u043b"});
        this.elytraHealth = new kg("\u0425\u041f \u043d\u0430 \u044d\u043b\u0438\u0442\u0440\u0430\u0445", "\u041f\u043e\u0440\u043e\u0433 \u0437\u0434\u043e\u0440\u043e\u0432\u044c\u044f \u043f\u0440\u0438 \u043f\u043e\u043b\u0451\u0442\u0435 \u043d\u0430 \u044d\u043b\u0438\u0442\u0440\u0430\u0445", (float)hi.dmsl("dmsp", dmsi(int ), (int)3)).range(1.0f, (float)hi.dmsl("dmsq", dmsi(int ), (int)4)).step((float)hi.dmsl("dmsr", dmsi(int ), (int)5)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$0(), ()Ljava/lang/Boolean;)((hi)this));
        this.crystalDistance = new kg("\u0414\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f \u043a\u0440\u0438\u0441\u0442\u0430\u043b\u043b\u0430", "\u041c\u0430\u043a\u0441\u0438\u043c\u0430\u043b\u044c\u043d\u0430\u044f \u0434\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f \u0434\u043e \u043a\u0440\u0438\u0441\u0442\u0430\u043b\u043b\u0430", (float)hi.dmsl("dmss", dmsi(int ), (int)6)).range(1.0f, (float)hi.dmsl("dmst", dmsi(int ), (int)7)).step((float)hi.dmsl("dmsu", dmsi(int ), (int)8)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$1(), ()Ljava/lang/Boolean;)((hi)this));
        this.noSwapIfBall = new kb("\u041d\u0435 \u0431\u0440\u0430\u0442\u044c \u0435\u0441\u043b\u0438 \u0448\u0430\u0440", "\u041d\u0435 \u0431\u0440\u0430\u0442\u044c \u0442\u043e\u0442\u0435\u043c \u043d\u0430 \u043a\u0440\u0438\u0441\u0442\u0430\u043b\u043b \u0435\u0441\u043b\u0438 \u0448\u0430\u0440 \u0432 \u043e\u0444\u0444\u0445\u0430\u043d\u0434\u0435").setValue((boolean)hi.dmsl("dmsw", dmsv(int ), (int)9)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$2(), ()Ljava/lang/Boolean;)((hi)this));
        this.lowHpOverride = new kb("\u0411\u0440\u0430\u0442\u044c \u0435\u0441\u043b\u0438 \u043c\u0430\u043b\u043e \u0425\u041f", "\u0418\u0433\u043d\u043e\u0440\u0438\u0440\u043e\u0432\u0430\u0442\u044c '\u041d\u0435 \u0431\u0440\u0430\u0442\u044c \u0435\u0441\u043b\u0438 \u0448\u0430\u0440' \u043f\u0440\u0438 \u043a\u0440\u0438\u0442\u0438\u0447\u0435\u0441\u043a\u043e\u043c \u0425\u041f").setValue((boolean)hi.dmsl("dmsx", dmsv(int ), (int)10)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$3(), ()Ljava/lang/Boolean;)((hi)this));
        this.crystalHealth = new kg("\u0425\u041f \u043d\u0430 \u043a\u0440\u0438\u0441\u0442\u0430\u043b\u043b", "\u041f\u043e\u0440\u043e\u0433 \u0437\u0434\u043e\u0440\u043e\u0432\u044c\u044f \u0434\u043b\u044f \u0438\u0433\u043d\u043e\u0440\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f \u0448\u0430\u0440\u0430", (float)hi.dmsl("dmsy", dmsi(int ), (int)11)).range(1.0f, (float)hi.dmsl("dmsz", dmsi(int ), (int)12)).step((float)hi.dmsl("dmta", dmsi(int ), (int)13)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$4(), ()Ljava/lang/Boolean;)((hi)this));
        this.fallCheck = new kb("\u041f\u0430\u0434\u0435\u043d\u0438\u0435", "\u0411\u0440\u0430\u0442\u044c \u0442\u043e\u0442\u0435\u043c \u043f\u0440\u0438 \u043f\u0430\u0434\u0435\u043d\u0438\u0438 \u0441 \u0432\u044b\u0441\u043e\u0442\u044b").setValue((boolean)hi.dmsl("dmtb", dmsv(int ), (int)14));
        this.fallHeight = new kg("\u0412\u044b\u0441\u043e\u0442\u0430 \u043f\u0430\u0434\u0435\u043d\u0438\u044f", "\u041c\u0438\u043d\u0438\u043c\u0430\u043b\u044c\u043d\u0430\u044f \u0432\u044b\u0441\u043e\u0442\u0430 \u043f\u0430\u0434\u0435\u043d\u0438\u044f \u0434\u043b\u044f \u0442\u043e\u0442\u0435\u043c\u0430", (float)hi.dmsl("dmtc", dmsi(int ), (int)15)).range((float)hi.dmsl("dmtd", dmsi(int ), (int)16), (float)hi.dmsl("dmte", dmsi(int ), (int)17)).step(1.0f).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, isValue(), ()Ljava/lang/Boolean;)((kb)this.fallCheck));
        this.armorBonusHealth = new kg("\u0411\u043e\u043d\u0443\u0441 \u0425\u041f \u0437\u0430 \u0431\u0440\u043e\u043d\u044e", "\u0421\u043a\u043e\u043b\u044c\u043a\u043e \u0425\u041f \u0434\u043e\u0431\u0430\u0432\u0438\u0442\u044c \u043a \u043f\u043e\u0440\u043e\u0433\u0443 \u043f\u0440\u0438 \u043d\u0435\u043f\u043e\u043b\u043d\u043e\u0439 \u0431\u0440\u043e\u043d\u0435", 2.0f).range((float)hi.dmsl("dmtf", dmsi(int ), (int)18), (float)hi.dmsl("dmtg", dmsi(int ), (int)19)).step((float)hi.dmsl("dmth", dmsi(int ), (int)20)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$5(), ()Ljava/lang/Boolean;)((hi)this));
        this.revertItem = new kb("\u0412\u043e\u0437\u0432\u0440\u0430\u0449\u0435\u043d\u0438\u0435 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u0430", "\u0412\u0435\u0440\u043d\u0443\u0442\u044c \u043f\u0440\u0435\u0434\u043c\u0435\u0442 \u043f\u043e\u0441\u043b\u0435 \u0432\u043e\u0441\u0441\u0442\u0430\u043d\u043e\u0432\u043b\u0435\u043d\u0438\u044f \u0425\u041f").setValue((boolean)hi.dmsl("dmti", dmsv(int ), (int)21));
        this.saveTalismans = new kb("\u0421\u043e\u0445\u0440\u0430\u043d\u0435\u043d\u0438\u0435 \u0442\u0430\u043b\u0438\u0441\u043c\u0430\u043d\u043e\u0432", "\u041f\u0440\u0438\u043e\u0440\u0438\u0442\u0435\u0442 \u043e\u0431\u044b\u0447\u043d\u044b\u0445 \u0442\u043e\u0442\u0435\u043c\u043e\u0432 \u043d\u0430\u0434 \u0437\u0430\u0447\u0430\u0440\u043e\u0432\u0430\u043d\u043d\u044b\u043c\u0438").setValue((boolean)hi.dmsl("dmtj", dmsv(int ), (int)22));
        this.tntDistance = new kg("\u0414\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f \u0434\u0438\u043d\u0430\u043c\u0438\u0442\u0430", "\u041c\u0430\u043a\u0441\u0438\u043c\u0430\u043b\u044c\u043d\u0430\u044f \u0434\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f \u0434\u043e \u0434\u0438\u043d\u0430\u043c\u0438\u0442\u0430", (float)hi.dmsl("dmtk", dmsi(int ), (int)23)).range(1.0f, (float)hi.dmsl("dmtl", dmsi(int ), (int)24)).step((float)hi.dmsl("dmtm", dmsi(int ), (int)25)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$6(), ()Ljava/lang/Boolean;)((hi)this));
        this.tntMinecartDistance = new kg("\u0414\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f \u0432\u0430\u0433\u043e\u043d\u0435\u0442\u043a\u0438", "\u041c\u0430\u043a\u0441\u0438\u043c\u0430\u043b\u044c\u043d\u0430\u044f \u0434\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f \u0434\u043e \u0432\u0430\u0433\u043e\u043d\u0435\u0442\u043a\u0438 \u0441 TNT", (float)hi.dmsl("dmtn", dmsi(int ), (int)26)).range(1.0f, (float)hi.dmsl("dmto", dmsi(int ), (int)27)).step((float)hi.dmsl("dmtp", dmsi(int ), (int)28)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$7(), ()Ljava/lang/Boolean;)((hi)this));
        this.itemHistory = new ArrayDeque<class_1799>();
        this.totemSlot = (int)hi.dmsl("dmtq", dmsv(int ), (int)29);
        this.rememberedItemSlot = (int)hi.dmsl("dmtr", dmsv(int ), (int)30);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.lastSwapTime = (long)hi.dmsl("dmtv", dmts(int ), (int)0);
                this.hasReplacedEnchanted = hi.dmsl("dmtw", dmsv(int ), (int)31);
                this.pendingRevertSourceSlot = (int)hi.dmsl("dmtx", dmsv(int ), (int)32);
                this.pendingRevertItem = class_1799.field_8037;
                this.settings(new jx[]{this.mode, this.healthThreshold, this.checks, this.elytraHealth, this.crystalDistance, this.noSwapIfBall, this.lowHpOverride, this.crystalHealth, this.fallCheck, this.fallHeight, this.armorBonusHealth, this.revertItem, this.saveTalismans, this.tntDistance, this.tntMinecartDistance});
                return;
            }
lbl33:
            // 2 sources

            case 0: {
                var2_1 /* !! */  = (int)hi.dmsl("dmty", dmsv(int ), (int)33);
                ** GOTO lbl102
            }
lbl36:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)hi.dmsl("dmtz", dmsv(int ), (int)34);
                    ** GOTO lbl102
                    break;
                }
            }
            case 2: {
                var2_1 /* !! */  = (int)hi.dmsl("dmua", dmsv(int ), (int)35);
                ** GOTO lbl33
            }
lbl43:
            // 2 sources

            case 3: {
                var2_1 /* !! */  = (int)hi.dmsl("dmub", dmsv(int ), (int)36);
                ** GOTO lbl97
            }
lbl46:
            // 2 sources

            case 4: {
                var2_1 /* !! */  = (int)hi.dmsl("dmuc", dmsv(int ), (int)37);
                ** GOTO lbl105
            }
            case 5: {
                var2_1 /* !! */  = (int)hi.dmsl("dmud", dmsv(int ), (int)38);
                ** GOTO lbl94
            }
            case 6: {
                var2_1 /* !! */  = (int)hi.dmsl("dmue", dmsv(int ), (int)39);
                ** GOTO lbl82
            }
lbl55:
            // 2 sources

            case 7: {
                var2_1 /* !! */  = (int)hi.dmsl("dmuf", dmsv(int ), (int)40);
                ** GOTO lbl73
            }
lbl58:
            // 2 sources

            case 8: {
                var2_1 /* !! */  = (int)hi.dmsl("dmug", dmsv(int ), (int)41);
                ** GOTO lbl94
            }
            case 9: {
                var2_1 /* !! */  = (int)hi.dmsl("dmuh", dmsv(int ), (int)42);
                ** GOTO lbl97
            }
            case 10: {
                var2_1 /* !! */  = (int)hi.dmsl("dmui", dmsv(int ), (int)43);
                ** GOTO lbl76
            }
lbl67:
            // 3 sources

            case 11: {
                var2_1 /* !! */  = (int)hi.dmsl("dmuj", dmsv(int ), (int)44);
                ** GOTO lbl105
            }
            case 12: {
                var2_1 /* !! */  = (int)hi.dmsl("dmuk", dmsv(int ), (int)45);
                ** GOTO lbl58
            }
lbl73:
            // 2 sources

            case 13: {
                var2_1 /* !! */  = (int)hi.dmsl("dmul", dmsv(int ), (int)46);
                ** GOTO lbl43
            }
lbl76:
            // 2 sources

            case 14: {
                var2_1 /* !! */  = (int)hi.dmsl("dmum", dmsv(int ), (int)47);
                ** GOTO lbl36
            }
            case 15: {
                var2_1 /* !! */  = (int)hi.dmsl("dmun", dmsv(int ), (int)48);
                ** GOTO lbl88
            }
lbl82:
            // 2 sources

            case 16: {
                var2_1 /* !! */  = (int)hi.dmsl("dmuo", dmsv(int ), (int)49);
                ** GOTO lbl88
            }
lbl85:
            // 2 sources

            case 17: {
                var2_1 /* !! */  = (int)hi.dmsl("dmup", dmsv(int ), (int)50);
                ** GOTO lbl67
            }
lbl88:
            // 3 sources

            case 18: {
                var2_1 /* !! */  = (int)hi.dmsl("dmuq", dmsv(int ), (int)51);
                ** GOTO lbl105
            }
            case 19: {
                var2_1 /* !! */  = (int)hi.dmsl("dmur", dmsv(int ), (int)52);
                ** GOTO lbl55
            }
lbl94:
            // 3 sources

            case 20: {
                var2_1 /* !! */  = (int)hi.dmsl("dmus", dmsv(int ), (int)53);
                ** GOTO lbl99
            }
lbl97:
            // 3 sources

            case 21: {
                var2_1 /* !! */  = (int)hi.dmsl("dmut", dmsv(int ), (int)54);
            }
lbl99:
            // 3 sources

            case 22: {
                var2_1 /* !! */  = (int)hi.dmsl("dmuu", dmsv(int ), (int)55);
                ** GOTO lbl67
            }
lbl102:
            // 3 sources

            case 23: {
                var2_1 /* !! */  = (int)hi.dmsl("dmuv", dmsv(int ), (int)56);
                ** GOTO lbl85
            }
lbl105:
            // 4 sources

            case 24: {
                var2_1 /* !! */  = (int)hi.dmsl("dmuw", dmsv(int ), (int)57);
                ** GOTO lbl46
            }
            case 25: 
        }
        var2_1 /* !! */  = (int)hi.dmsl("dmux", dmsv(int ), (int)58);
        ** while (true)
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void clearPlacementConfirmation() {
        v0 /* !! */  = hi.ib;
        if (true) ** GOTO lbl5
        block29: while (true) {
            v0 /* !! */  = (long)(v1 - hi.dmsl("dpwe", dmts(int ), (int)311));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1746813624: {
                    v1 = hi.dmsl("dpwf", dmts(int ), (int)312);
                    continue block29;
                }
                case -1679817088: {
                    v1 = hi.dmsl("dpwg", dmts(int ), (int)313);
                    continue block29;
                }
                case -844137102: {
                    v1 = hi.dmsl("dpwh", dmts(int ), (int)314);
                    continue block29;
                }
                case 1228545173: {
                    break block29;
                }
            }
            break;
        }
        var3_1 = hi.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = hi.ib - hi.dmsl("dpwi", dmts(int ), (int)315)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == hi.dmsl("dpwj", dmsv(int ), (int)1014)) break;
            v2 /* !! */  = (long)hi.dmsl("dpwk", dmsv(int ), (int)1015);
        }
        var2_2 /* !! */  = hi.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = hi.ib - hi.dmsl("dpwl", dmts(int ), (int)316)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == hi.dmsl("dpwm", dmsv(int ), (int)1016)) {
                var1_3 = hi.a;
                if (var3_1) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)hi.dmsl("dpwn", dmsv(int ), (int)1017);
        }
        if (var1_3 || var1_3) return;
        v4 = hi.dmsl("dpwo", dmsv(int ), (int)1018);
        v5 /* !! */  = hi.ib;
        if (true) ** GOTO lbl39
        block32: while (true) {
            v5 /* !! */  = (long)(v6 - hi.dmsl("dpwp", dmts(int ), (int)317));
lbl39:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1673248400: {
                    v6 = hi.dmsl("dpwq", dmts(int ), (int)318);
                    continue block32;
                }
                case -631715268: {
                    v6 = hi.dmsl("dpwr", dmts(int ), (int)319);
                    continue block32;
                }
                case 1228545173: {
                    break block32;
                }
            }
            break;
        }
        this.placementAwaitingConfirmation = v4;
        if (var1_3 || var1_3) return;
        v7 = hi.dmsl("dpws", dmsv(int ), (int)1019);
        v8 /* !! */  = hi.ib;
        block33: while (true) {
            switch ((int)v8 /* !! */ ) {
                case -785039982: {
                    v8 /* !! */  = (long)(hi.dmsl("dpwu", dmts(int ), (int)321) - hi.dmsl("dpwt", dmts(int ), (int)320));
                    continue block33;
                }
                case 1228545173: {
                    break block33;
                }
            }
            break;
        }
        this.placementServerConfirmed = v7;
        if (var1_3 || var1_3) return;
        v9 = hi.dmsl("dpwv", dmsv(int ), (int)1020);
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_3 = hi.ib - hi.dmsl("dpww", dmts(int ), (int)322)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == hi.dmsl("dpwx", dmsv(int ), (int)1021)) {
                this.placementServerRejected = v9;
                if (var1_3) return;
                break;
            }
            v10 /* !! */  = (long)hi.dmsl("dpwy", dmsv(int ), (int)1022);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block35: do {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var1_3) return;
                    v11 = hi.dmsl("dpwz", dmts(int ), (int)323);
                    while (true) {
                        if ((v12 /* !! */  = (cfr_temp_4 = hi.ib - hi.dmsl("dpxa", dmts(int ), (int)324)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v12 /* !! */  == hi.dmsl("dpxb", dmsv(int ), (int)1023)) {
                            this.placementConfirmationDeadline = (long)v11;
                            if (var1_3) return;
                            break;
                        }
                        v12 /* !! */  = (long)hi.dmsl("dpxc", dmsv(int ), (int)1024);
                    }
                    if (!var1_3) return;
                    return;
                }
                case 0: {
                    var2_2 /* !! */  = (int)hi.dmsl("dpxd", dmsv(int ), (int)1025);
                    cfr_temp_0 = 8;
                    if (!var3_1) continue block35;
                    throw null;
                }
                case 1: {
                    ** GOTO lbl117
                }
                case 4: {
                    var2_2 /* !! */  = (int)hi.dmsl("dpxh", dmsv(int ), (int)1029);
                    cfr_temp_0 = 3;
                    if (!var3_1) continue block35;
                    throw null;
                }
                case 6: {
                    var2_2 /* !! */  = (int)hi.dmsl("dpxj", dmsv(int ), (int)1031);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 9: {
                    var2_2 /* !! */  = (int)hi.dmsl("dpxm", dmsv(int ), (int)1034);
                    cfr_temp_0 = 2;
                    if (!var3_1) continue block35;
                    throw null;
                }
                case 10: {
                    do {
                        var2_2 /* !! */  = (int)hi.dmsl("dpxn", dmsv(int ), (int)1035);
                    } while (!var3_1);
                    throw null;
                }
                case 11: {
                    var2_2 /* !! */  = (int)hi.dmsl("dpxo", dmsv(int ), (int)1036);
                    if (var3_1) {
                        throw null;
                    }
lbl117:
                    // 3 sources

                    var2_2 /* !! */  = (int)hi.dmsl("dpxe", dmsv(int ), (int)1026);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: {
                    var2_2 /* !! */  = (int)hi.dmsl("dpxf", dmsv(int ), (int)1027);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 7: {
                    var2_2 /* !! */  = (int)hi.dmsl("dpxk", dmsv(int ), (int)1032);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 5: {
                    var2_2 /* !! */  = (int)hi.dmsl("dpxi", dmsv(int ), (int)1030);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 3: {
                    var2_2 /* !! */  = (int)hi.dmsl("dpxg", dmsv(int ), (int)1028);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 8: 
            }
            break;
        } while (true);
        do {
            var2_2 /* !! */  = (int)hi.dmsl("dpxl", dmsv(int ), (int)1033);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean canRevert() {
        block91: {
            block90: {
                block89: {
                    block88: {
                        block87: {
                            block86: {
                                block85: {
                                    var8_1 = hi.c;
                                    var7_2 /* !! */  = hi.b;
                                    var6_3 = hi.a;
                                    if (var8_1) {
                                        throw null;
lbl6:
                                        // 20 sources

                                        return (boolean)hi.dmsl("dpxp", dmsv(int ), (int)1037);
                                    }
                                    if (var6_3 || var6_3) ** GOTO lbl6
                                    if (this.revertItem.isValue()) break block85;
                                    if (var6_3 || var6_3) ** GOTO lbl6
                                    return (boolean)hi.dmsl("dpxq", dmsv(int ), (int)1038);
                                }
                                if (var6_3 || var6_3) ** GOTO lbl6
                                if (!this.itemHistory.isEmpty()) break block86;
                                if (var6_3 || var6_3) ** GOTO lbl6
                                return (boolean)hi.dmsl("dpxr", dmsv(int ), (int)1039);
                            }
                            if (var6_3 || var6_3) ** GOTO lbl6
                            var1_4 = hi.mc.field_1724.method_6079();
                            if (var6_3 || var6_3) ** GOTO lbl6
                            if (var1_4.method_7960()) break block87;
                            if (var6_3) ** GOTO lbl6
                            if (var1_4.method_7909() != class_1802.field_8288) break block88;
                            if (var6_3) ** GOTO lbl6
                        }
                        if (var6_3 || var6_3) ** GOTO lbl6
                        v0 = hi.dmsl("dpxs", dmsv(int ), (int)1040);
                        if (var8_1) {
                            throw null;
                        }
                        break block89;
                    }
                    if (var6_3 || var6_3) ** GOTO lbl6
                    v0 = var2_5 = hi.dmsl("dpxt", dmsv(int ), (int)1041);
                }
                if (var6_3 || var6_3) ** GOTO lbl6
                if (var2_5 != false) break block90;
                if (var6_3 || var6_3) ** GOTO lbl6
                return (boolean)hi.dmsl("dpxu", dmsv(int ), (int)1042);
            }
            if (var6_3 || var6_3) ** GOTO lbl6
            var3_6 = this.getEffectiveHealth();
            if (var6_3 || var6_3) ** GOTO lbl6
            var4_7 = this.healthThreshold.getValue();
            if (var6_3 || var6_3) ** GOTO lbl6
            var5_8 = 1.0f;
            if (var6_3 || var6_3) ** GOTO lbl6
            if (!(var3_6 <= var4_7 + var5_8)) break block91;
            if (var6_3 || var6_3) ** GOTO lbl6
            return (boolean)hi.dmsl("dpxv", dmsv(int ), (int)1043);
        }
        if (var7_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_3 || var6_3) ** GOTO lbl6
                if (!this.hasImmediateThreat()) ** GOTO lbl58
                if (var6_3 || var6_3) ** GOTO lbl6
                return (boolean)hi.dmsl("dpxw", dmsv(int ), (int)1044);
lbl58:
                // 1 sources

                if (!var6_3 && !var6_3) ** break;
                ** continue;
                return (boolean)hi.dmsl("dpxx", dmsv(int ), (int)1045);
            }
lbl61:
            // 3 sources

            case 0: {
                var7_2 /* !! */  = (int)hi.dmsl("dpxy", dmsv(int ), (int)1046);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl143
            }
            case 1: {
                var7_2 /* !! */  = (int)hi.dmsl("dpxz", dmsv(int ), (int)1047);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl71:
            // 2 sources

            case 2: {
                var7_2 /* !! */  = (int)hi.dmsl("dpya", dmsv(int ), (int)1048);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 3: {
                var7_2 /* !! */  = (int)hi.dmsl("dpyb", dmsv(int ), (int)1049);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl81:
            // 2 sources

            case 4: {
                var7_2 /* !! */  = (int)hi.dmsl("dpyc", dmsv(int ), (int)1050);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl86:
            // 3 sources

            case 5: {
                var7_2 /* !! */  = (int)hi.dmsl("dpyd", dmsv(int ), (int)1051);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl162
            }
lbl91:
            // 3 sources

            case 6: {
                var7_2 /* !! */  = (int)hi.dmsl("dpye", dmsv(int ), (int)1052);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl96:
            // 2 sources

            case 7: {
                var7_2 /* !! */  = (int)hi.dmsl("dpyf", dmsv(int ), (int)1053);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl247
            }
lbl101:
            // 3 sources

            case 8: {
                var7_2 /* !! */  = (int)hi.dmsl("dpyg", dmsv(int ), (int)1054);
                if (!var8_1) break;
                throw null;
            }
lbl105:
            // 3 sources

            case 9: {
                var7_2 /* !! */  = (int)hi.dmsl("dpyh", dmsv(int ), (int)1055);
                if (!var8_1) ** GOTO lbl86
                throw null;
            }
            case 10: {
                var7_2 /* !! */  = (int)hi.dmsl("dpyi", dmsv(int ), (int)1056);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl235
            }
            case 11: {
                var7_2 /* !! */  = (int)hi.dmsl("dpyj", dmsv(int ), (int)1057);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl172
            }
            case 12: {
                var7_2 /* !! */  = (int)hi.dmsl("dpyk", dmsv(int ), (int)1058);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl162
            }
lbl124:
            // 2 sources

            case 13: {
                var7_2 /* !! */  = (int)hi.dmsl("dpyl", dmsv(int ), (int)1059);
                if (!var8_1) ** GOTO lbl101
                throw null;
            }
            case 14: {
                var7_2 /* !! */  = (int)hi.dmsl("dpym", dmsv(int ), (int)1060);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl181
            }
            case 15: {
                var7_2 /* !! */  = (int)hi.dmsl("dpyn", dmsv(int ), (int)1061);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl138:
            // 2 sources

            case 16: {
                var7_2 /* !! */  = (int)hi.dmsl("dpyo", dmsv(int ), (int)1062);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl143:
            // 2 sources

            case 17: {
                var7_2 /* !! */  = (int)hi.dmsl("dpyp", dmsv(int ), (int)1063);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl215
            }
            case 18: {
                var7_2 /* !! */  = (int)hi.dmsl("dpyq", dmsv(int ), (int)1064);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl172
            }
            case 19: {
                var7_2 /* !! */  = (int)hi.dmsl("dpyr", dmsv(int ), (int)1065);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl177
            }
lbl158:
            // 3 sources

            case 20: {
                var7_2 /* !! */  = (int)hi.dmsl("dpys", dmsv(int ), (int)1066);
                if (!var8_1) ** GOTO lbl105
                throw null;
            }
lbl162:
            // 3 sources

            case 21: {
                var7_2 /* !! */  = (int)hi.dmsl("dpyt", dmsv(int ), (int)1067);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl231
            }
lbl167:
            // 2 sources

            case 22: {
                var7_2 /* !! */  = (int)hi.dmsl("dpyu", dmsv(int ), (int)1068);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl172:
            // 3 sources

            case 23: {
                var7_2 /* !! */  = (int)hi.dmsl("dpyv", dmsv(int ), (int)1069);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl177:
            // 2 sources

            case 24: {
                var7_2 /* !! */  = (int)hi.dmsl("dpyx", dmsv(int ), (int)1070);
                if (!var8_1) ** GOTO lbl91
                throw null;
            }
lbl181:
            // 3 sources

            case 25: {
                var7_2 /* !! */  = (int)hi.dmsl("dpyz", dmsv(int ), (int)1071);
                if (!var8_1) ** GOTO lbl61
                throw null;
            }
            case 26: {
                var7_2 /* !! */  = (int)hi.dmsl("dpzb", dmsv(int ), (int)1072);
                if (!var8_1) ** GOTO lbl81
                throw null;
            }
            case 27: {
                var7_2 /* !! */  = (int)hi.dmsl("dpzd", dmsv(int ), (int)1073);
                if (!var8_1) ** GOTO lbl138
                throw null;
            }
            case 28: {
                var7_2 /* !! */  = (int)hi.dmsl("dpze", dmsv(int ), (int)1074);
                if (!var8_1) ** GOTO lbl96
                throw null;
            }
lbl197:
            // 4 sources

            case 29: {
                var7_2 /* !! */  = (int)hi.dmsl("dpzf", dmsv(int ), (int)1075);
                if (!var8_1) ** GOTO lbl91
                throw null;
            }
lbl201:
            // 4 sources

            case 30: {
                var7_2 /* !! */  = (int)hi.dmsl("dpzh", dmsv(int ), (int)1076);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl215
            }
lbl206:
            // 2 sources

            case 31: {
                var7_2 /* !! */  = (int)hi.dmsl("dpzk", dmsv(int ), (int)1077);
                if (!var8_1) ** GOTO lbl201
                throw null;
            }
            case 32: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_2 /* !! */  = (int)hi.dmsl("dpzn", dmsv(int ), (int)1078);
                    if (!var8_1) ** GOTO lbl101
                    throw null;
                }
            }
lbl215:
            // 3 sources

            case 33: {
                var7_2 /* !! */  = (int)hi.dmsl("dpzp", dmsv(int ), (int)1079);
                if (!var8_1) ** GOTO lbl61
                throw null;
            }
lbl219:
            // 3 sources

            case 34: {
                var7_2 /* !! */  = (int)hi.dmsl("dpzr", dmsv(int ), (int)1080);
                if (!var8_1) ** GOTO lbl197
                throw null;
            }
lbl223:
            // 2 sources

            case 35: {
                var7_2 /* !! */  = (int)hi.dmsl("dpzs", dmsv(int ), (int)1081);
                if (!var8_1) ** GOTO lbl105
                throw null;
            }
            case 36: {
                var7_2 /* !! */  = (int)hi.dmsl("dpzt", dmsv(int ), (int)1082);
                if (!var8_1) ** GOTO lbl86
                throw null;
            }
lbl231:
            // 2 sources

            case 37: {
                var7_2 /* !! */  = (int)hi.dmsl("dqaa", dmsv(int ), (int)1083);
                if (!var8_1) ** GOTO lbl223
                throw null;
            }
lbl235:
            // 2 sources

            case 38: {
                var7_2 /* !! */  = (int)hi.dmsl("dqac", dmsv(int ), (int)1084);
                if (!var8_1) ** GOTO lbl124
                throw null;
            }
            case 39: {
                var7_2 /* !! */  = (int)hi.dmsl("dqad", dmsv(int ), (int)1085);
                if (!var8_1) ** GOTO lbl71
                throw null;
            }
            case 40: {
                var7_2 /* !! */  = (int)hi.dmsl("dqae", dmsv(int ), (int)1086);
                if (!var8_1) ** GOTO lbl206
                throw null;
            }
lbl247:
            // 2 sources

            case 41: {
                var7_2 /* !! */  = (int)hi.dmsl("dqaf", dmsv(int ), (int)1087);
                if (!var8_1) ** GOTO lbl219
                throw null;
            }
            case 42: 
        }
        var7_2 /* !! */  = (int)hi.dmsl("dqai", dmsv(int ), (int)1088);
        ** while (!var8_1)
lbl254:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean needsTotem() {
        block115: {
            block116: {
                block117: {
                    block119: {
                        block118: {
                            block114: {
                                block113: {
                                    var6_1 = hi.c;
                                    var5_2 /* !! */  = hi.b;
                                    var4_3 = hi.a;
                                    if (var6_1) {
                                        throw null;
lbl6:
                                        // 30 sources

                                        return (boolean)hi.dmsl("dngy", dmsv(int ), (int)201);
                                    }
                                    if (var4_3 || var4_3) ** GOTO lbl6
                                    var1_4 = this.getEffectiveHealth();
                                    if (var4_3 || var4_3) ** GOTO lbl6
                                    var2_5 = this.getEffectiveThreshold();
                                    if (var4_3 || var4_3) ** GOTO lbl6
                                    if (!(var1_4 <= var2_5)) break block113;
                                    if (var4_3 || var4_3) ** GOTO lbl6
                                    return (boolean)hi.dmsl("dngz", dmsv(int ), (int)202);
                                }
                                if (var4_3 || var4_3) ** GOTO lbl6
                                if (!this.check("\u0417\u0434\u043e\u0440\u043e\u0432\u044c\u0435 \u043d\u0430 \u044d\u043b\u0438\u0442\u0440\u0430\u0445")) break block114;
                                if (var4_3) ** GOTO lbl6
                                if (!hi.mc.field_1724.method_6128()) break block114;
                                if (var4_3 || var4_3) ** GOTO lbl6
                                if (!(var1_4 <= this.elytraHealth.getValue())) break block114;
                                if (var4_3 || var4_3) ** GOTO lbl6
                                return (boolean)hi.dmsl("dnha", dmsv(int ), (int)203);
                            }
                            if (var4_3 || var4_3) ** GOTO lbl6
                            if (!this.check("\u041a\u0440\u0438\u0441\u0442\u0430\u043b\u043b")) break block115;
                            if (var4_3) ** GOTO lbl6
                            if (!this.hasCrystalNearby()) break block115;
                            if (var4_3 || var4_3) ** GOTO lbl6
                            var3_6 = this.hasPlayerHeadInOffhand();
                            if (var4_3 || var4_3) ** GOTO lbl6
                            if (!this.noSwapIfBall.isValue()) break block116;
                            if (var4_3) ** GOTO lbl6
                            if (!var3_6) break block116;
                            if (var4_3 || var4_3) ** GOTO lbl6
                            if (!this.lowHpOverride.isValue()) break block117;
                            if (var4_3 || var4_3) ** GOTO lbl6
                            if (!(var1_4 <= this.crystalHealth.getValue())) break block118;
                            if (var4_3) ** GOTO lbl6
                            v0 = hi.dmsl("dnhc", dmsv(int ), (int)204);
                            if (var6_1) {
                                throw null;
                            }
                            break block119;
                        }
                        if (var4_3 || var4_3) ** GOTO lbl6
                        v0 = hi.dmsl("dnhe", dmsv(int ), (int)205);
                    }
                    return (boolean)v0;
                }
                if (var4_3 || var4_3) ** GOTO lbl6
                return (boolean)hi.dmsl("dnhh", dmsv(int ), (int)206);
            }
            if (var4_3 || var4_3) ** GOTO lbl6
            return (boolean)hi.dmsl("dnhi", dmsv(int ), (int)207);
        }
        if (var4_3 || var4_3) ** GOTO lbl6
        if (!this.fallCheck.isValue()) ** GOTO lbl67
        if (var4_3) ** GOTO lbl6
        if (!(hi.mc.field_1724.field_6017 >= (double)this.fallHeight.getValue())) ** GOTO lbl67
        if (var4_3) ** GOTO lbl6
        if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_3) ** GOTO lbl6
                return (boolean)hi.dmsl("dnhj", dmsv(int ), (int)208);
            }
lbl67:
            // 2 sources

            if (var4_3 || var4_3) ** GOTO lbl6
            if (!this.check("\u0414\u0438\u043d\u0430\u043c\u0438\u0442")) ** GOTO lbl73
            if (var4_3) ** GOTO lbl6
            if (!this.hasTntNearby()) ** GOTO lbl73
            if (var4_3 || var4_3) ** GOTO lbl6
            return (boolean)hi.dmsl("dnhl", dmsv(int ), (int)209);
lbl73:
            // 2 sources

            if (var4_3 || var4_3) ** GOTO lbl6
            if (!this.check("\u0412\u0430\u0433\u043e\u043d\u0435\u0442\u043a\u0430 \u0441 \u0434\u0438\u043d\u0430\u043c\u0438\u0442\u043e\u043c")) ** GOTO lbl79
            if (var4_3) ** GOTO lbl6
            if (!this.hasTntMinecartNearby()) ** GOTO lbl79
            if (var4_3 || var4_3) ** GOTO lbl6
            return (boolean)hi.dmsl("dnhp", dmsv(int ), (int)210);
lbl79:
            // 2 sources

            if (!var4_3 && !var4_3) ** break;
            ** continue;
            return (boolean)hi.dmsl("dnhs", dmsv(int ), (int)211);
            case 0: {
                var5_2 /* !! */  = (int)hi.dmsl("dnhu", dmsv(int ), (int)212);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl236
            }
            case 1: {
                var5_2 /* !! */  = (int)hi.dmsl("dnhv", dmsv(int ), (int)213);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl127
            }
            case 2: {
                var5_2 /* !! */  = (int)hi.dmsl("dnhx", dmsv(int ), (int)214);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl97:
            // 2 sources

            case 3: {
                var5_2 /* !! */  = (int)hi.dmsl("dnhz", dmsv(int ), (int)215);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl112
            }
lbl102:
            // 2 sources

            case 4: {
                var5_2 /* !! */  = (int)hi.dmsl("dnic", dmsv(int ), (int)216);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl329
            }
lbl107:
            // 4 sources

            case 5: {
                var5_2 /* !! */  = (int)hi.dmsl("dnie", dmsv(int ), (int)217);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl132
            }
lbl112:
            // 4 sources

            case 6: {
                var5_2 /* !! */  = (int)hi.dmsl("dnif", dmsv(int ), (int)218);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl337
            }
            case 7: {
                var5_2 /* !! */  = (int)hi.dmsl("dnii", dmsv(int ), (int)219);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl329
            }
lbl122:
            // 2 sources

            case 8: {
                var5_2 /* !! */  = (int)hi.dmsl("dnik", dmsv(int ), (int)220);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl268
            }
lbl127:
            // 3 sources

            case 9: {
                var5_2 /* !! */  = (int)hi.dmsl("dnim", dmsv(int ), (int)221);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl289
            }
lbl132:
            // 2 sources

            case 10: {
                do {
                    var5_2 /* !! */  = (int)hi.dmsl("dnip", dmsv(int ), (int)222);
                } while (!var6_1);
                throw null;
            }
            case 11: {
                var5_2 /* !! */  = (int)hi.dmsl("dnir", dmsv(int ), (int)223);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl142:
            // 2 sources

            case 12: {
                var5_2 /* !! */  = (int)hi.dmsl("dnis", dmsv(int ), (int)224);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl209
            }
            case 13: {
                var5_2 /* !! */  = (int)hi.dmsl("dniu", dmsv(int ), (int)225);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl313
            }
lbl152:
            // 2 sources

            case 14: {
                var5_2 /* !! */  = (int)hi.dmsl("dniv", dmsv(int ), (int)226);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl157:
            // 2 sources

            case 15: {
                var5_2 /* !! */  = (int)hi.dmsl("dniz", dmsv(int ), (int)227);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl246
            }
            case 16: {
                var5_2 /* !! */  = (int)hi.dmsl("dnjb", dmsv(int ), (int)228);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl236
            }
            case 17: {
                var5_2 /* !! */  = (int)hi.dmsl("dnje", dmsv(int ), (int)229);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl232
            }
lbl172:
            // 2 sources

            case 18: {
                var5_2 /* !! */  = (int)hi.dmsl("dnjf", dmsv(int ), (int)230);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl196
            }
lbl177:
            // 3 sources

            case 19: {
                var5_2 /* !! */  = (int)hi.dmsl("dnjh", dmsv(int ), (int)231);
                if (!var6_1) ** GOTO lbl142
                throw null;
            }
            case 20: {
                var5_2 /* !! */  = (int)hi.dmsl("dnji", dmsv(int ), (int)232);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl289
            }
            case 21: {
                var5_2 /* !! */  = (int)hi.dmsl("dnjj", dmsv(int ), (int)233);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl321
            }
lbl191:
            // 4 sources

            case 22: {
                var5_2 /* !! */  = (int)hi.dmsl("dnjq", dmsv(int ), (int)234);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl272
            }
lbl196:
            // 2 sources

            case 23: {
                var5_2 /* !! */  = (int)hi.dmsl("dnjr", dmsv(int ), (int)235);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl209
            }
lbl201:
            // 2 sources

            case 24: {
                var5_2 /* !! */  = (int)hi.dmsl("dnjs", dmsv(int ), (int)236);
                if (!var6_1) ** GOTO lbl191
                throw null;
            }
lbl205:
            // 3 sources

            case 25: {
                var5_2 /* !! */  = (int)hi.dmsl("dnjt", dmsv(int ), (int)237);
                if (!var6_1) break;
                throw null;
            }
lbl209:
            // 3 sources

            case 26: {
                var5_2 /* !! */  = (int)hi.dmsl("dnjv", dmsv(int ), (int)238);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl241
            }
lbl214:
            // 2 sources

            case 27: {
                var5_2 /* !! */  = (int)hi.dmsl("dnjy", dmsv(int ), (int)239);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl325
            }
lbl219:
            // 3 sources

            case 28: {
                var5_2 /* !! */  = (int)hi.dmsl("dnkb", dmsv(int ), (int)240);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl337
            }
lbl224:
            // 2 sources

            case 29: {
                var5_2 /* !! */  = (int)hi.dmsl("dnkd", dmsv(int ), (int)241);
                if (!var6_1) ** GOTO lbl191
                throw null;
            }
            case 30: {
                var5_2 /* !! */  = (int)hi.dmsl("dnkg", dmsv(int ), (int)242);
                if (!var6_1) ** GOTO lbl172
                throw null;
            }
lbl232:
            // 2 sources

            case 31: {
                var5_2 /* !! */  = (int)hi.dmsl("dnkl", dmsv(int ), (int)243);
                if (!var6_1) ** GOTO lbl152
                throw null;
            }
lbl236:
            // 3 sources

            case 32: {
                var5_2 /* !! */  = (int)hi.dmsl("dnkm", dmsv(int ), (int)244);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl301
            }
lbl241:
            // 2 sources

            case 33: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_2 /* !! */  = (int)hi.dmsl("dnkn", dmsv(int ), (int)245);
                    if (!var6_1) ** GOTO lbl191
                    throw null;
                }
            }
lbl246:
            // 3 sources

            case 34: {
                var5_2 /* !! */  = (int)hi.dmsl("dnko", dmsv(int ), (int)246);
                if (!var6_1) ** GOTO lbl107
                throw null;
            }
lbl250:
            // 2 sources

            case 35: {
                var5_2 /* !! */  = (int)hi.dmsl("dnkq", dmsv(int ), (int)247);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl285
            }
            case 36: {
                var5_2 /* !! */  = (int)hi.dmsl("dnkt", dmsv(int ), (int)248);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl264
            }
lbl260:
            // 2 sources

            case 37: {
                var5_2 /* !! */  = (int)hi.dmsl("dnkw", dmsv(int ), (int)249);
                if (!var6_1) ** GOTO lbl219
                throw null;
            }
lbl264:
            // 3 sources

            case 38: {
                var5_2 /* !! */  = (int)hi.dmsl("dnky", dmsv(int ), (int)250);
                if (!var6_1) ** GOTO lbl250
                throw null;
            }
lbl268:
            // 2 sources

            case 39: {
                var5_2 /* !! */  = (int)hi.dmsl("dnla", dmsv(int ), (int)251);
                if (!var6_1) ** GOTO lbl214
                throw null;
            }
lbl272:
            // 2 sources

            case 40: {
                var5_2 /* !! */  = (int)hi.dmsl("dnld", dmsv(int ), (int)252);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl281
            }
            case 41: {
                var5_2 /* !! */  = (int)hi.dmsl("dnlh", dmsv(int ), (int)253);
                if (!var6_1) ** GOTO lbl205
                throw null;
            }
lbl281:
            // 2 sources

            case 42: {
                var5_2 /* !! */  = (int)hi.dmsl("dnlj", dmsv(int ), (int)254);
                if (!var6_1) ** GOTO lbl177
                throw null;
            }
lbl285:
            // 2 sources

            case 43: {
                var5_2 /* !! */  = (int)hi.dmsl("dnlk", dmsv(int ), (int)255);
                if (!var6_1) ** GOTO lbl112
                throw null;
            }
lbl289:
            // 3 sources

            case 44: {
                var5_2 /* !! */  = (int)hi.dmsl("dnll", dmsv(int ), (int)256);
                if (!var6_1) ** GOTO lbl107
                throw null;
            }
            case 45: {
                var5_2 /* !! */  = (int)hi.dmsl("dnls", dmsv(int ), (int)257);
                if (!var6_1) ** GOTO lbl127
                throw null;
            }
            case 46: {
                var5_2 /* !! */  = (int)hi.dmsl("dnlu", dmsv(int ), (int)258);
                if (!var6_1) ** GOTO lbl246
                throw null;
            }
lbl301:
            // 2 sources

            case 47: {
                var5_2 /* !! */  = (int)hi.dmsl("dnlv", dmsv(int ), (int)259);
                if (!var6_1) ** GOTO lbl260
                throw null;
            }
            case 48: {
                var5_2 /* !! */  = (int)hi.dmsl("dnlw", dmsv(int ), (int)260);
                if (!var6_1) ** GOTO lbl107
                throw null;
            }
            case 49: {
                var5_2 /* !! */  = (int)hi.dmsl("dnlx", dmsv(int ), (int)261);
                if (!var6_1) ** GOTO lbl97
                throw null;
            }
lbl313:
            // 2 sources

            case 50: {
                var5_2 /* !! */  = (int)hi.dmsl("dnly", dmsv(int ), (int)262);
                if (!var6_1) ** GOTO lbl264
                throw null;
            }
            case 51: {
                var5_2 /* !! */  = (int)hi.dmsl("dnlz", dmsv(int ), (int)263);
                if (!var6_1) ** GOTO lbl102
                throw null;
            }
lbl321:
            // 2 sources

            case 52: {
                var5_2 /* !! */  = (int)hi.dmsl("dnmd", dmsv(int ), (int)264);
                if (!var6_1) ** GOTO lbl157
                throw null;
            }
lbl325:
            // 2 sources

            case 53: {
                var5_2 /* !! */  = (int)hi.dmsl("dnmf", dmsv(int ), (int)265);
                if (!var6_1) ** GOTO lbl112
                throw null;
            }
lbl329:
            // 3 sources

            case 54: {
                var5_2 /* !! */  = (int)hi.dmsl("dnmi", dmsv(int ), (int)266);
                if (!var6_1) ** GOTO lbl205
                throw null;
            }
            case 55: {
                var5_2 /* !! */  = (int)hi.dmsl("dnmj", dmsv(int ), (int)267);
                if (!var6_1) ** GOTO lbl177
                throw null;
            }
lbl337:
            // 3 sources

            case 56: {
                var5_2 /* !! */  = (int)hi.dmsl("dnmk", dmsv(int ), (int)268);
                if (!var6_1) ** GOTO lbl122
                throw null;
            }
            case 57: 
        }
        var5_2 /* !! */  = (int)hi.dmsl("dnml", dmsv(int ), (int)269);
        ** while (!var6_1)
lbl344:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean hasTntNearby() {
        v0 /* !! */  = hi.ib;
        if (true) ** GOTO lbl5
        block31: while (true) {
            v0 /* !! */  = (long)(hi.dmsl("dogo", dmts(int ), (int)155) - hi.dmsl("dogn", dmts(int ), (int)154));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1035746963: {
                    continue block31;
                }
                case 1228545173: {
                    break block31;
                }
            }
            break;
        }
        var3_1 = hi.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = hi.ib - hi.dmsl("dogp", dmts(int ), (int)156)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hi.dmsl("dogq", dmsv(int ), (int)537)) break;
            v1 /* !! */  = (long)hi.dmsl("dogr", dmsv(int ), (int)538);
        }
        var2_2 /* !! */  = hi.b;
        v2 /* !! */  = hi.ib;
        if (true) ** GOTO lbl22
        block33: while (true) {
            v2 /* !! */  = (long)(v3 - hi.dmsl("dogs", dmts(int ), (int)157));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1071068347: {
                    v3 = hi.dmsl("dogt", dmts(int ), (int)158);
                    continue block33;
                }
                case 806031858: {
                    v3 = hi.dmsl("dogu", dmts(int ), (int)159);
                    continue block33;
                }
                case 1228545173: {
                    break block33;
                }
                case 1250751297: {
                    v3 = hi.dmsl("dogv", dmts(int ), (int)160);
                    continue block33;
                }
            }
            break;
        }
        var1_3 = hi.a;
        if (var3_1) {
            throw null;
lbl37:
            // 2 sources

            return (boolean)hi.dmsl("dogw", dmsv(int ), (int)539);
        }
        if (var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = hi.ib;
                if (true) ** GOTO lbl48
                block35: while (true) {
                    v4 /* !! */  = (long)(v5 - hi.dmsl("dogx", dmts(int ), (int)161));
lbl48:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -66636197: {
                            v5 = hi.dmsl("dogy", dmts(int ), (int)162);
                            continue block35;
                        }
                        case 872813157: {
                            v5 = hi.dmsl("dogz", dmts(int ), (int)163);
                            continue block35;
                        }
                        case 1228545173: {
                            break block35;
                        }
                        case 1484966287: {
                            v5 = hi.dmsl("doha", dmts(int ), (int)164);
                            continue block35;
                        }
                    }
                    break;
                }
                v6 = (Predicate<class_1297>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$hasTntNearby$10(net.minecraft.class_1297 ), (Lnet/minecraft/class_1297;)Z)();
                v7 /* !! */  = hi.ib;
                if (true) ** GOTO lbl65
                block36: while (true) {
                    v7 /* !! */  = (long)(v8 - hi.dmsl("dohb", dmts(int ), (int)165));
lbl65:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 711895313: {
                            v8 = hi.dmsl("dohc", dmts(int ), (int)166);
                            continue block36;
                        }
                        case 949917599: {
                            v8 = hi.dmsl("dohd", dmts(int ), (int)167);
                            continue block36;
                        }
                        case 1228545173: {
                            break block36;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_1 = hi.ib - hi.dmsl("dohe", dmts(int ), (int)168)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v9 /* !! */  == hi.dmsl("dohf", dmsv(int ), (int)540)) break;
                    v9 /* !! */  = (long)hi.dmsl("dohg", dmsv(int ), (int)541);
                }
                v10 = this.tntDistance.getValue();
                v11 /* !! */  = hi.ib;
                if (true) ** GOTO lbl85
                block38: while (true) {
                    v11 /* !! */  = (long)(hi.dmsl("dohi", dmts(int ), (int)170) - hi.dmsl("dohh", dmts(int ), (int)169));
lbl85:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case 1103482493: {
                            continue block38;
                        }
                        case 1228545173: {
                            break block38;
                        }
                    }
                    break;
                }
                return this.hasEntityNearby(v6, v10);
            }
            case 0: {
                var2_2 /* !! */  = (int)hi.dmsl("dohj", dmsv(int ), (int)542);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)hi.dmsl("dohk", dmsv(int ), (int)543);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)hi.dmsl("dohl", dmsv(int ), (int)544);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)hi.dmsl("dohm", dmsv(int ), (int)545);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void dtms() {
        hi.dmsk[1500] = 1449313289;
        hi.dmsk[1501] = -2105083804;
        hi.dmsk[1502] = -1968360007;
        hi.dmsk[1503] = -645211537;
        hi.dmsk[1504] = 398355343;
        hi.dmsk[1505] = -772583799;
        hi.dmsk[1506] = 8154414;
        hi.dmsk[1507] = -199084289;
        hi.dmsk[1508] = 1967537306;
        hi.dmsk[1509] = 1940459046;
        hi.dmsk[1510] = -929645450;
        hi.dmsk[1511] = 567705503;
        hi.dmsk[1512] = -342907197;
        hi.dmsk[1513] = -774705527;
        hi.dmsk[1514] = -1648864624;
        hi.dmsk[1515] = 1652386535;
        hi.dmsk[1516] = -1905168078;
        hi.dmsk[1517] = 1080972740;
        hi.dmsk[1518] = 2108555258;
        hi.dmsk[1519] = 321000153;
        hi.dmsk[1520] = -2055505528;
        hi.dmsk[1521] = 1140357060;
        hi.dmsk[1522] = 1231514159;
        hi.dmsk[1523] = 1706916881;
        hi.dmsk[1524] = 1576694640;
        hi.dmsk[1525] = 932437050;
        hi.dmsk[1526] = -217130297;
        hi.dmsk[1527] = -226798652;
        hi.dmsk[1528] = -1093900941;
        hi.dmsk[1529] = -1872355829;
        hi.dmsk[1530] = -1209744189;
        hi.dmsk[1531] = -1428246135;
        hi.dmsk[1532] = -166220772;
        hi.dmsk[1533] = -1488985197;
        hi.dmsk[1534] = -378769298;
        hi.dmsk[1535] = 1872104397;
        hi.dmsk[1536] = 1219931266;
        hi.dmsk[1537] = 1884649917;
        hi.dmsk[1538] = -956764206;
        hi.dmsk[1539] = 931382406;
        hi.dmsk[1540] = -61703148;
        hi.dmsk[1541] = -526687507;
        hi.dmsk[1542] = 1568641293;
        hi.dmsk[1543] = -2059399667;
        hi.dmsk[1544] = 274375749;
        hi.dmsk[1545] = -401770531;
        hi.dmsk[1546] = -2049331203;
        hi.dmsk[1547] = 1293353440;
        hi.dmsk[1548] = 1956170287;
        hi.dmsk[1549] = 1203889405;
        hi.dmsk[1550] = 2132029155;
        hi.dmsk[1551] = -795199265;
        hi.dmsk[1552] = 1371127997;
        hi.dmsk[1553] = 1621657489;
        hi.dmsk[1554] = -1135066906;
        hi.dmsk[1555] = 1910217584;
        hi.dmsk[1556] = -2037872694;
        hi.dmsk[1557] = 1071986857;
        hi.dmsk[1558] = 1669939942;
        hi.dmsk[1559] = 774829713;
        hi.dmsk[1560] = 663115866;
        hi.dmsk[1561] = -1854688883;
        hi.dmsk[1562] = -1795355272;
        hi.dmsk[1563] = -1619156687;
        hi.dmsk[1564] = -1960735994;
        hi.dmsk[1565] = -690018528;
        hi.dmsk[1566] = 2039910053;
        hi.dmsk[1567] = -1532719811;
        hi.dmsk[1568] = -509084762;
        hi.dmsk[1569] = 875315297;
        hi.dmsk[1570] = -1997495425;
        hi.dmsk[1571] = 480630850;
        hi.dmsk[1572] = 1378736497;
        hi.dmsk[1573] = -1579556373;
        hi.dmsk[1574] = 1957813850;
        hi.dmsk[1575] = 1552628570;
        hi.dmsk[1576] = -1487736361;
        hi.dmsk[1577] = 1772688452;
        hi.dmsk[1578] = 306168017;
        hi.dmsk[1579] = 409255456;
        hi.dmsk[1580] = -720484906;
        hi.dmsk[1581] = 1789953228;
        hi.dmsk[1582] = -1600835877;
        hi.dmsk[1583] = -1582950021;
        hi.dmsk[1584] = -42039320;
        hi.dmsk[1585] = 1411747368;
        hi.dmsk[1586] = 1864302899;
        hi.dmsk[1587] = -122676333;
        hi.dmsk[1588] = -633566906;
        hi.dmsk[1589] = 2077986738;
        hi.dmsk[1590] = -1193797432;
        hi.dmsk[1591] = 665964734;
        hi.dmsk[1592] = -1585530066;
        hi.dmsk[1593] = -20193034;
        hi.dmsk[1594] = -407402692;
        hi.dmsk[1595] = 2059906841;
        hi.dmsk[1596] = -2066834557;
        hi.dmsk[1597] = 2093492974;
        hi.dmsk[1598] = 1787335810;
        hi.dmsk[1599] = -1665661640;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean hasTotemInOffhand() {
        block32: {
            block31: {
                v0 /* !! */  = hi.ib;
                if (true) ** GOTO lbl5
                block20: while (true) {
                    v0 /* !! */  = (long)(v1 - hi.dmsl("dopc", dmts(int ), (int)222));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -183049841: {
                            v1 = hi.dmsl("dopd", dmts(int ), (int)223);
                            continue block20;
                        }
                        case 1228545173: {
                            break block20;
                        }
                        case 1752277850: {
                            v1 = hi.dmsl("dope", dmts(int ), (int)224);
                            continue block20;
                        }
                    }
                    break;
                }
                var3_1 = hi.c;
                v2 /* !! */  = hi.ib;
                if (true) ** GOTO lbl19
                block21: while (true) {
                    v2 /* !! */  = (long)(hi.dmsl("dopg", dmts(int ), (int)226) - hi.dmsl("dopf", dmts(int ), (int)225));
lbl19:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case 953951158: {
                            continue block21;
                        }
                        case 1228545173: {
                            break block21;
                        }
                    }
                    break;
                }
                var2_2 = hi.b;
                v3 /* !! */  = hi.ib;
                if (true) ** GOTO lbl29
                block22: while (true) {
                    v3 /* !! */  = (long)(v4 - hi.dmsl("doph", dmts(int ), (int)227));
lbl29:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1685542439: {
                            v4 = hi.dmsl("dopo", dmts(int ), (int)228);
                            continue block22;
                        }
                        case -926214821: {
                            v4 = hi.dmsl("dopq", dmts(int ), (int)229);
                            continue block22;
                        }
                        case 1228545173: {
                            break block22;
                        }
                        case 1584308196: {
                            v4 = hi.dmsl("dopr", dmts(int ), (int)230);
                            continue block22;
                        }
                    }
                    break;
                }
                var1_3 = hi.a;
                if (var3_1) {
                    throw null;
lbl44:
                    // 3 sources

                    return (boolean)hi.dmsl("dops", dmsv(int ), (int)617);
                }
                if (var1_3 || var1_3) ** GOTO lbl44
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = hi.ib - hi.dmsl("dopt", dmts(int ), (int)231)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == hi.dmsl("dopu", dmsv(int ), (int)618)) break;
                    v5 /* !! */  = (long)hi.dmsl("dopv", dmsv(int ), (int)619);
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = hi.ib - hi.dmsl("dopz", dmts(int ), (int)232)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == hi.dmsl("doqb", dmsv(int ), (int)620)) break;
                    v6 /* !! */  = (long)hi.dmsl("doqc", dmsv(int ), (int)621);
                }
                v7 = hi.mc.field_1724;
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = hi.ib - hi.dmsl("doqe", dmts(int ), (int)233)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == hi.dmsl("doqf", dmsv(int ), (int)622)) break;
                    v8 /* !! */  = (long)hi.dmsl("doqg", dmsv(int ), (int)623);
                }
                v9 = v7.method_6079();
                v10 /* !! */  = hi.ib;
                if (true) ** GOTO lbl68
                block27: while (true) {
                    v10 /* !! */  = (long)(v11 - hi.dmsl("doqj", dmts(int ), (int)234));
lbl68:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case 1126135238: {
                            v11 = hi.dmsl("doql", dmts(int ), (int)235);
                            continue block27;
                        }
                        case 1202202678: {
                            v11 = hi.dmsl("doqn", dmts(int ), (int)236);
                            continue block27;
                        }
                        case 1228545173: {
                            break block27;
                        }
                    }
                    break;
                }
                v12 = v9.method_7909();
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_3 = hi.ib - hi.dmsl("doqo", dmts(int ), (int)237)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == hi.dmsl("doqq", dmsv(int ), (int)624)) break;
                    v13 /* !! */  = (long)hi.dmsl("doqs", dmsv(int ), (int)625);
                }
                if (v12 != class_1802.field_8288) break block31;
                if (var1_3) ** GOTO lbl44
                v14 = hi.dmsl("doqt", dmsv(int ), (int)626);
                if (var3_1) {
                    throw null;
                }
                break block32;
            }
            if (!var1_3 && !var1_3) ** break;
            ** while (true)
            v14 = hi.dmsl("doqx", dmsv(int ), (int)627);
        }
        return (boolean)v14;
    }

    private static /* synthetic */ long dmts(int n2) {
        return dmtt[n2] ^ dmtu[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isExactRememberedItem(class_1799 var1_1, class_1799 var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hi.ib - hi.dmsl("dqri", dmts(int ), (int)450)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hi.dmsl("dqrj", dmsv(int ), (int)1319)) break;
            v0 /* !! */  = (long)hi.dmsl("dqrk", dmsv(int ), (int)1320);
        }
        var5_3 = hi.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hi.ib - hi.dmsl("dqrl", dmts(int ), (int)451)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hi.dmsl("dqrm", dmsv(int ), (int)1321)) break;
            v1 /* !! */  = (long)hi.dmsl("dqrn", dmsv(int ), (int)1322);
        }
        var4_4 /* !! */  = hi.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = hi.ib - hi.dmsl("dqro", dmts(int ), (int)452)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hi.dmsl("dqrp", dmsv(int ), (int)1323)) break;
            v2 /* !! */  = (long)hi.dmsl("dqrq", dmsv(int ), (int)1324);
        }
        var3_5 = hi.a;
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_3) {
                    throw null;
lbl27:
                    // 7 sources

                    return (boolean)hi.dmsl("dqrr", dmsv(int ), (int)1325);
                }
                if (var3_5 || var3_5) ** GOTO lbl27
                if (var1_1 == null) ** GOTO lbl82
                if (var3_5) ** GOTO lbl27
                if (var2_2 == null) ** GOTO lbl82
                if (var3_5) ** GOTO lbl27
                v3 /* !! */  = hi.ib;
                if (true) ** GOTO lbl38
                block33: while (true) {
                    v3 /* !! */  = (long)(hi.dmsl("dqrt", dmts(int ), (int)454) - hi.dmsl("dqrs", dmts(int ), (int)453));
lbl38:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1222796141: {
                            continue block33;
                        }
                        case 1228545173: {
                            break block33;
                        }
                    }
                    break;
                }
                if (var1_1.method_7960()) ** GOTO lbl82
                if (var3_5) ** GOTO lbl27
                v4 /* !! */  = hi.ib;
                if (true) ** GOTO lbl49
                block34: while (true) {
                    v4 /* !! */  = (long)(v5 - hi.dmsl("dqru", dmts(int ), (int)455));
lbl49:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2096004590: {
                            v5 = hi.dmsl("dqrv", dmts(int ), (int)456);
                            continue block34;
                        }
                        case -1795691723: {
                            v5 = hi.dmsl("dqrw", dmts(int ), (int)457);
                            continue block34;
                        }
                        case 802501712: {
                            v5 = hi.dmsl("dqrx", dmts(int ), (int)458);
                            continue block34;
                        }
                        case 1228545173: {
                            break block34;
                        }
                    }
                    break;
                }
                if (var2_2.method_7960()) ** GOTO lbl82
                if (var3_5) ** GOTO lbl27
                v6 /* !! */  = hi.ib;
                if (true) ** GOTO lbl67
                block35: while (true) {
                    v6 /* !! */  = (long)(v7 - hi.dmsl("dqry", dmts(int ), (int)459));
lbl67:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -184350856: {
                            v7 = hi.dmsl("dqrz", dmts(int ), (int)460);
                            continue block35;
                        }
                        case 765738343: {
                            v7 = hi.dmsl("dqsa", dmts(int ), (int)461);
                            continue block35;
                        }
                        case 1228545173: {
                            break block35;
                        }
                    }
                    break;
                }
                if (!class_1799.method_31577((class_1799)var1_1, (class_1799)var2_2)) ** GOTO lbl82
                if (var3_5) ** GOTO lbl27
                v8 = hi.dmsl("dqsb", dmsv(int ), (int)1326);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl85
lbl82:
                // 5 sources

                if (!var3_5 && !var3_5) ** break;
                ** continue;
                v8 = hi.dmsl("dqsc", dmsv(int ), (int)1327);
lbl85:
                // 2 sources

                return (boolean)v8;
            }
lbl86:
            // 2 sources

            case 0: {
                var4_4 /* !! */  = (int)hi.dmsl("dqsd", dmsv(int ), (int)1328);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl122
            }
lbl91:
            // 2 sources

            case 1: {
                var4_4 /* !! */  = (int)hi.dmsl("dqse", dmsv(int ), (int)1329);
                if (!var5_3) ** GOTO lbl86
                throw null;
            }
            case 2: {
                var4_4 /* !! */  = (int)hi.dmsl("dqsf", dmsv(int ), (int)1330);
                if (!var5_3) ** GOTO lbl91
                throw null;
            }
lbl99:
            // 2 sources

            case 3: {
                var4_4 /* !! */  = (int)hi.dmsl("dqsg", dmsv(int ), (int)1331);
                if (!var5_3) break;
                throw null;
            }
lbl103:
            // 2 sources

            case 4: {
                var4_4 /* !! */  = (int)hi.dmsl("dqsh", dmsv(int ), (int)1332);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl113
            }
lbl108:
            // 2 sources

            case 5: {
                var4_4 /* !! */  = (int)hi.dmsl("dqsi", dmsv(int ), (int)1333);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl122
            }
lbl113:
            // 2 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)hi.dmsl("dqsj", dmsv(int ), (int)1334);
                    if (!var5_3) ** GOTO lbl103
                    throw null;
                }
            }
lbl118:
            // 2 sources

            case 7: {
                var4_4 /* !! */  = (int)hi.dmsl("dqsk", dmsv(int ), (int)1335);
                if (!var5_3) ** GOTO lbl108
                throw null;
            }
lbl122:
            // 3 sources

            case 8: {
                do {
                    var4_4 /* !! */  = (int)hi.dmsl("dqsl", dmsv(int ), (int)1336);
                } while (!var5_3);
                throw null;
            }
            case 9: {
                var4_4 /* !! */  = (int)hi.dmsl("dqsm", dmsv(int ), (int)1337);
                if (!var5_3) ** GOTO lbl118
                throw null;
            }
            case 10: {
                var4_4 /* !! */  = (int)hi.dmsl("dqsn", dmsv(int ), (int)1338);
                if (!var5_3) ** GOTO lbl99
                throw null;
            }
            case 11: 
        }
        var4_4 /* !! */  = (int)hi.dmsl("dqso", dmsv(int ), (int)1339);
        ** while (!var5_3)
lbl138:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void observeServerOffhand(class_1799 var1_1, boolean var2_2) {
        block75: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = hi.ib - hi.dmsl("dpss", dmts(int ), (int)288)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == hi.dmsl("dpst", dmsv(int ), (int)947)) break;
                v0 /* !! */  = (long)hi.dmsl("dpsu", dmsv(int ), (int)948);
            }
            var5_3 = hi.c;
            v1 /* !! */  = hi.ib;
            if (true) ** GOTO lbl11
            block49: while (true) {
                v1 /* !! */  = (long)(v2 - hi.dmsl("dpsv", dmts(int ), (int)289));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1447717238: {
                        v2 = hi.dmsl("dpsw", dmts(int ), (int)290);
                        continue block49;
                    }
                    case -1274391085: {
                        v2 = hi.dmsl("dpsx", dmts(int ), (int)291);
                        continue block49;
                    }
                    case 2725760: {
                        v2 = hi.dmsl("dpsy", dmts(int ), (int)292);
                        continue block49;
                    }
                    case 1228545173: {
                        break block49;
                    }
                }
                break;
            }
            var4_4 /* !! */  = hi.b;
            v3 /* !! */  = hi.ib;
            if (true) ** GOTO lbl28
            block50: while (true) {
                v3 /* !! */  = (long)(v4 - hi.dmsl("dpsz", dmts(int ), (int)293));
lbl28:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -631533089: {
                        v4 = hi.dmsl("dpta", dmts(int ), (int)294);
                        continue block50;
                    }
                    case 1228545173: {
                        break block50;
                    }
                    case 1794341535: {
                        v4 = hi.dmsl("dptb", dmts(int ), (int)295);
                        continue block50;
                    }
                }
                break;
            }
            var3_5 = hi.a;
            if (var5_3) {
                throw null;
lbl40:
                // 11 sources

                return;
            }
            if (var3_5 || var3_5) ** GOTO lbl40
            if (var1_1 == null) break block75;
            if (var3_5) ** GOTO lbl40
            v5 /* !! */  = hi.ib;
            if (true) ** GOTO lbl49
            block52: while (true) {
                v5 /* !! */  = (long)(hi.dmsl("dptd", dmts(int ), (int)297) - hi.dmsl("dptc", dmts(int ), (int)296));
lbl49:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case 232474364: {
                        continue block52;
                    }
                    case 1228545173: {
                        break block52;
                    }
                }
                break;
            }
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_1 = hi.ib - hi.dmsl("dpte", dmts(int ), (int)298)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == hi.dmsl("dptf", dmsv(int ), (int)949)) break;
                v6 /* !! */  = (long)hi.dmsl("dptg", dmsv(int ), (int)950);
            }
            if (!var1_1.method_31574(class_1802.field_8288)) break block75;
            if (var3_5 || var3_5) ** GOTO lbl40
            v7 = hi.dmsl("dpth", dmsv(int ), (int)951);
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_2 = hi.ib - hi.dmsl("dpti", dmts(int ), (int)299)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == hi.dmsl("dptj", dmsv(int ), (int)952)) break;
                v8 /* !! */  = (long)hi.dmsl("dptk", dmsv(int ), (int)953);
            }
            this.placementServerConfirmed = v7;
            if (var3_5 || var3_5) ** GOTO lbl40
            v9 = hi.dmsl("dptl", dmsv(int ), (int)954);
            v10 /* !! */  = hi.ib;
            if (true) ** GOTO lbl74
            block55: while (true) {
                v10 /* !! */  = (long)(v11 - hi.dmsl("dptm", dmts(int ), (int)300));
lbl74:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -1581056893: {
                        v11 = hi.dmsl("dptn", dmts(int ), (int)301);
                        continue block55;
                    }
                    case -997396412: {
                        v11 = hi.dmsl("dpto", dmts(int ), (int)302);
                        continue block55;
                    }
                    case 1084968775: {
                        v11 = hi.dmsl("dptp", dmts(int ), (int)303);
                        continue block55;
                    }
                    case 1228545173: {
                        break block55;
                    }
                }
                break;
            }
            this.placementServerRejected = v9;
            if (var3_5) ** GOTO lbl40
            if (var5_3) {
                throw null;
            }
            ** GOTO lbl125
        }
        if (var3_5 || var3_5) ** GOTO lbl40
        if (!var2_2) ** GOTO lbl125
        if (var3_5) ** GOTO lbl40
        v12 /* !! */  = hi.ib;
        if (true) ** GOTO lbl99
        block56: while (true) {
            v12 /* !! */  = (long)(v13 - hi.dmsl("dptq", dmts(int ), (int)304));
lbl99:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -1715520065: {
                    v13 = hi.dmsl("dptr", dmts(int ), (int)305);
                    continue block56;
                }
                case -81761158: {
                    v13 = hi.dmsl("dpts", dmts(int ), (int)306);
                    continue block56;
                }
                case 701730784: {
                    v13 = hi.dmsl("dptt", dmts(int ), (int)307);
                    continue block56;
                }
                case 1228545173: {
                    break block56;
                }
            }
            break;
        }
        if (this.placementServerConfirmed) ** GOTO lbl125
        if (var3_5) ** GOTO lbl40
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_5) ** GOTO lbl40
                v14 = hi.dmsl("dptu", dmsv(int ), (int)955);
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_3 = hi.ib - hi.dmsl("dptv", dmts(int ), (int)308)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == hi.dmsl("dptw", dmsv(int ), (int)956)) break;
                    v15 /* !! */  = (long)hi.dmsl("dptx", dmsv(int ), (int)957);
                }
                this.placementServerRejected = v14;
                if (var3_5) ** GOTO lbl40
lbl125:
                // 4 sources

                if (!var3_5 && !var3_5) ** break;
                ** continue;
                return;
            }
lbl128:
            // 2 sources

            case 0: {
                var4_4 /* !! */  = (int)hi.dmsl("dpty", dmsv(int ), (int)958);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl153
            }
            case 1: {
                var4_4 /* !! */  = (int)hi.dmsl("dptz", dmsv(int ), (int)959);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl144
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)hi.dmsl("dpua", dmsv(int ), (int)960);
                    if (var5_3) {
                        throw null;
                    }
                    ** GOTO lbl149
                    break;
                }
            }
lbl144:
            // 2 sources

            case 3: {
                var4_4 /* !! */  = (int)hi.dmsl("dpub", dmsv(int ), (int)961);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl149:
            // 3 sources

            case 4: {
                var4_4 /* !! */  = (int)hi.dmsl("dpuc", dmsv(int ), (int)962);
                if (!var5_3) break;
                throw null;
            }
lbl153:
            // 2 sources

            case 5: {
                var4_4 /* !! */  = (int)hi.dmsl("dpud", dmsv(int ), (int)963);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl205
            }
lbl158:
            // 2 sources

            case 6: {
                var4_4 /* !! */  = (int)hi.dmsl("dpue", dmsv(int ), (int)964);
                if (!var5_3) break;
                throw null;
            }
            case 7: {
                var4_4 /* !! */  = (int)hi.dmsl("dpuf", dmsv(int ), (int)965);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl185
            }
lbl167:
            // 2 sources

            case 8: {
                var4_4 /* !! */  = (int)hi.dmsl("dpug", dmsv(int ), (int)966);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl181
            }
            case 9: {
                var4_4 /* !! */  = (int)hi.dmsl("dpuh", dmsv(int ), (int)967);
                if (!var5_3) break;
                throw null;
            }
lbl176:
            // 3 sources

            case 10: {
                var4_4 /* !! */  = (int)hi.dmsl("dpui", dmsv(int ), (int)968);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl193
            }
lbl181:
            // 3 sources

            case 11: {
                var4_4 /* !! */  = (int)hi.dmsl("dpuj", dmsv(int ), (int)969);
                if (!var5_3) ** GOTO lbl158
                throw null;
            }
lbl185:
            // 2 sources

            case 12: {
                var4_4 /* !! */  = (int)hi.dmsl("dpuk", dmsv(int ), (int)970);
                if (!var5_3) ** GOTO lbl167
                throw null;
            }
            case 13: {
                var4_4 /* !! */  = (int)hi.dmsl("dpul", dmsv(int ), (int)971);
                if (!var5_3) ** GOTO lbl181
                throw null;
            }
lbl193:
            // 2 sources

            case 14: {
                var4_4 /* !! */  = (int)hi.dmsl("dpum", dmsv(int ), (int)972);
                if (!var5_3) ** GOTO lbl176
                throw null;
            }
lbl197:
            // 2 sources

            case 15: {
                var4_4 /* !! */  = (int)hi.dmsl("dpun", dmsv(int ), (int)973);
                if (!var5_3) ** GOTO lbl149
                throw null;
            }
            case 16: {
                var4_4 /* !! */  = (int)hi.dmsl("dpuo", dmsv(int ), (int)974);
                if (!var5_3) ** GOTO lbl176
                throw null;
            }
lbl205:
            // 2 sources

            case 17: {
                var4_4 /* !! */  = (int)hi.dmsl("dpup", dmsv(int ), (int)975);
                if (!var5_3) ** GOTO lbl128
                throw null;
            }
            case 18: 
        }
        var4_4 /* !! */  = (int)hi.dmsl("dpuq", dmsv(int ), (int)976);
        ** while (!var5_3)
lbl212:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void clearPendingRevertConfirmation() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hi.ib - hi.dmsl("drpd", dmts(int ), (int)665)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == hi.dmsl("drpe", dmsv(int ), (int)1558)) break;
            v0 /* !! */  = (long)hi.dmsl("drpf", dmsv(int ), (int)1559);
        }
        var3_1 = hi.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hi.ib - hi.dmsl("drpg", dmts(int ), (int)666)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == hi.dmsl("drph", dmsv(int ), (int)1560)) break;
            v1 /* !! */  = (long)hi.dmsl("drpi", dmsv(int ), (int)1561);
        }
        var2_2 /* !! */  = hi.b;
        v2 /* !! */  = hi.ib;
        if (true) ** GOTO lbl17
        block43: while (true) {
            v2 /* !! */  = (long)(hi.dmsl("drpk", dmts(int ), (int)668) - hi.dmsl("drpj", dmts(int ), (int)667));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1946589413: {
                    continue block43;
                }
                case 1228545173: {
                    break block43;
                }
            }
            break;
        }
        var1_3 = hi.a;
        if (var3_1) {
            throw null;
lbl25:
            // 6 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl25
        v3 = hi.dmsl("drpl", dmsv(int ), (int)1562);
        v4 /* !! */  = hi.ib;
        if (true) ** GOTO lbl33
        block45: while (true) {
            v4 /* !! */  = (long)(hi.dmsl("drpn", dmts(int ), (int)670) - hi.dmsl("drpm", dmts(int ), (int)669));
lbl33:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2067501823: {
                    continue block45;
                }
                case 1228545173: {
                    break block45;
                }
            }
            break;
        }
        this.revertAwaitingConfirmation = v3;
        if (var1_3 || var1_3) ** GOTO lbl25
        v5 = hi.dmsl("drpo", dmts(int ), (int)671);
        v6 /* !! */  = hi.ib;
        if (true) ** GOTO lbl45
        block46: while (true) {
            v6 /* !! */  = (long)(v7 - hi.dmsl("drpp", dmts(int ), (int)672));
lbl45:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -211394852: {
                    v7 = hi.dmsl("drpq", dmts(int ), (int)673);
                    continue block46;
                }
                case -86585791: {
                    v7 = hi.dmsl("drpr", dmts(int ), (int)674);
                    continue block46;
                }
                case 182147767: {
                    v7 = hi.dmsl("drps", dmts(int ), (int)675);
                    continue block46;
                }
                case 1228545173: {
                    break block46;
                }
            }
            break;
        }
        this.revertConfirmationAt = (long)v5;
        if (var1_3 || var1_3) ** GOTO lbl25
        v8 = hi.dmsl("drpt", dmsv(int ), (int)1563);
        v9 /* !! */  = hi.ib;
        if (true) ** GOTO lbl64
        block47: while (true) {
            v9 /* !! */  = (long)(v10 - hi.dmsl("drpu", dmts(int ), (int)676));
lbl64:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -1127039191: {
                    v10 = hi.dmsl("drpv", dmts(int ), (int)677);
                    continue block47;
                }
                case 233146923: {
                    v10 = hi.dmsl("drpw", dmts(int ), (int)678);
                    continue block47;
                }
                case 1228545173: {
                    break block47;
                }
            }
            break;
        }
        this.pendingRevertSourceSlot = (int)v8;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl25
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_2 = hi.ib - hi.dmsl("drpx", dmts(int ), (int)679)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == hi.dmsl("drpy", dmsv(int ), (int)1564)) break;
                    v11 /* !! */  = (long)hi.dmsl("drpz", dmsv(int ), (int)1565);
                }
                v12 /* !! */  = hi.ib;
                if (true) ** GOTO lbl87
                block49: while (true) {
                    v12 /* !! */  = (long)(v13 - hi.dmsl("drqa", dmts(int ), (int)680));
lbl87:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1201213125: {
                            v13 = hi.dmsl("drqb", dmts(int ), (int)681);
                            continue block49;
                        }
                        case -1155096410: {
                            v13 = hi.dmsl("drqc", dmts(int ), (int)682);
                            continue block49;
                        }
                        case 1228545173: {
                            break block49;
                        }
                        case 1344010821: {
                            v13 = hi.dmsl("drqd", dmts(int ), (int)683);
                            continue block49;
                        }
                    }
                    break;
                }
                this.pendingRevertItem = class_1799.field_8037;
                if (var1_3 || var1_3) ** GOTO lbl25
                v14 = hi.dmsl("drqe", dmsv(int ), (int)1566);
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_3 = hi.ib - hi.dmsl("drqf", dmts(int ), (int)684)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == hi.dmsl("drqg", dmsv(int ), (int)1567)) break;
                    v15 /* !! */  = (long)hi.dmsl("drqh", dmsv(int ), (int)1568);
                }
                this.revertSucceeded = v14;
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl110:
            // 5 sources

            case 0: {
                var2_2 /* !! */  = (int)hi.dmsl("drqi", dmsv(int ), (int)1569);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl160
            }
lbl115:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)hi.dmsl("drqj", dmsv(int ), (int)1570);
                if (var3_1) {
                    throw null;
                }
            }
lbl119:
            // 4 sources

            case 2: {
                var2_2 /* !! */  = (int)hi.dmsl("drqk", dmsv(int ), (int)1571);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl164
            }
            case 3: {
                var2_2 /* !! */  = (int)hi.dmsl("drql", dmsv(int ), (int)1572);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl148
            }
            case 4: {
                var2_2 /* !! */  = (int)hi.dmsl("drqm", dmsv(int ), (int)1573);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl164
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hi.dmsl("drqn", dmsv(int ), (int)1574);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl156
                    break;
                }
            }
lbl140:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)hi.dmsl("drqo", dmsv(int ), (int)1575);
                if (!var3_1) ** GOTO lbl115
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)hi.dmsl("drqp", dmsv(int ), (int)1576);
                if (!var3_1) ** GOTO lbl110
                throw null;
            }
lbl148:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)hi.dmsl("drqq", dmsv(int ), (int)1577);
                if (!var3_1) ** GOTO lbl110
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)hi.dmsl("drqr", dmsv(int ), (int)1578);
                if (!var3_1) ** GOTO lbl140
                throw null;
            }
lbl156:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)hi.dmsl("drqs", dmsv(int ), (int)1579);
                if (!var3_1) ** GOTO lbl110
                throw null;
            }
lbl160:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)hi.dmsl("drqt", dmsv(int ), (int)1580);
                if (!var3_1) ** GOTO lbl119
                throw null;
            }
lbl164:
            // 3 sources

            case 12: {
                var2_2 /* !! */  = (int)hi.dmsl("drqu", dmsv(int ), (int)1581);
                if (!var3_1) ** GOTO lbl110
                throw null;
            }
            case 13: 
        }
        var2_2 /* !! */  = (int)hi.dmsl("drqv", dmsv(int ), (int)1582);
        ** while (!var3_1)
lbl171:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dsgd() {
        hi.dmsj[0] = -914008175;
        hi.dmsj[1] = 107628092;
        hi.dmsj[2] = 1361741084;
        hi.dmsj[3] = 1216498972;
        hi.dmsj[4] = -1966993243;
        hi.dmsj[5] = 281539132;
        hi.dmsj[6] = 1289288197;
        hi.dmsj[7] = 41546051;
        hi.dmsj[8] = -701751864;
        hi.dmsj[9] = -62098524;
        hi.dmsj[10] = -2006035060;
        hi.dmsj[11] = 418326916;
        hi.dmsj[12] = 1674282469;
        hi.dmsj[13] = 1047685255;
        hi.dmsj[14] = 1997545508;
        hi.dmsj[15] = -1267664164;
        hi.dmsj[16] = 363546809;
        hi.dmsj[17] = -1439676934;
        hi.dmsj[18] = -626252032;
        hi.dmsj[19] = 681562095;
        hi.dmsj[20] = 1960964538;
        hi.dmsj[21] = 1953479470;
        hi.dmsj[22] = 1540989839;
        hi.dmsj[23] = 695985215;
        hi.dmsj[24] = -239733451;
        hi.dmsj[25] = -1005080127;
        hi.dmsj[26] = 285660995;
        hi.dmsj[27] = 250785435;
        hi.dmsj[28] = 1225276341;
        hi.dmsj[29] = -1810202449;
        hi.dmsj[30] = -2105417631;
        hi.dmsj[31] = -2106123184;
        hi.dmsj[32] = -1333380711;
        hi.dmsj[33] = -1051802961;
        hi.dmsj[34] = 554000719;
        hi.dmsj[35] = 2062644233;
        hi.dmsj[36] = -1544678880;
        hi.dmsj[37] = -635394526;
        hi.dmsj[38] = 1261982904;
        hi.dmsj[39] = 460005956;
        hi.dmsj[40] = 224746288;
        hi.dmsj[41] = -865926420;
        hi.dmsj[42] = -889991612;
        hi.dmsj[43] = -2034945702;
        hi.dmsj[44] = -138270670;
        hi.dmsj[45] = 379769520;
        hi.dmsj[46] = -25800314;
        hi.dmsj[47] = 1205382724;
        hi.dmsj[48] = 2130155459;
        hi.dmsj[49] = 1433967052;
        hi.dmsj[50] = -262978176;
        hi.dmsj[51] = -1548147228;
        hi.dmsj[52] = -737633772;
        hi.dmsj[53] = 261127129;
        hi.dmsj[54] = 501265546;
        hi.dmsj[55] = 481910542;
        hi.dmsj[56] = -419250672;
        hi.dmsj[57] = 318894186;
        hi.dmsj[58] = -190883582;
        hi.dmsj[59] = 604621498;
        hi.dmsj[60] = -1941201490;
        hi.dmsj[61] = -1126810057;
        hi.dmsj[62] = 387187738;
        hi.dmsj[63] = -1624209228;
        hi.dmsj[64] = 2097967843;
        hi.dmsj[65] = 644532903;
        hi.dmsj[66] = -1469266029;
        hi.dmsj[67] = 1930566889;
        hi.dmsj[68] = 958340924;
        hi.dmsj[69] = 45270671;
        hi.dmsj[70] = -295937833;
        hi.dmsj[71] = -946100205;
        hi.dmsj[72] = 1168993643;
        hi.dmsj[73] = 842325630;
        hi.dmsj[74] = 352964062;
        hi.dmsj[75] = -857287086;
        hi.dmsj[76] = -244458012;
        hi.dmsj[77] = -782091360;
        hi.dmsj[78] = 775763969;
        hi.dmsj[79] = 2049036864;
        hi.dmsj[80] = 2139339779;
        hi.dmsj[81] = -1597956733;
        hi.dmsj[82] = 1840115470;
        hi.dmsj[83] = -1469184888;
        hi.dmsj[84] = 336544087;
        hi.dmsj[85] = 21056967;
        hi.dmsj[86] = -1897164756;
        hi.dmsj[87] = -1920003386;
        hi.dmsj[88] = 1413227342;
        hi.dmsj[89] = 393413755;
        hi.dmsj[90] = 577812573;
        hi.dmsj[91] = 2045169832;
        hi.dmsj[92] = -1885391448;
        hi.dmsj[93] = -1026682083;
        hi.dmsj[94] = 450540941;
        hi.dmsj[95] = 735189147;
        hi.dmsj[96] = 1117389285;
        hi.dmsj[97] = 1522559961;
        hi.dmsj[98] = 1899085217;
        hi.dmsj[99] = -2092580441;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int getArmorValue(class_1799 var1_1) {
        block143: {
            block142: {
                block141: {
                    block140: {
                        block139: {
                            block138: {
                                block137: {
                                    block136: {
                                        block135: {
                                            block134: {
                                                block133: {
                                                    var4_2 = hi.c;
                                                    var3_3 /* !! */  = hi.b;
                                                    var2_4 = hi.a;
                                                    if (var4_2) {
                                                        throw null;
lbl6:
                                                        // 30 sources

                                                        return (int)hi.dmsl("dnzd", dmsv(int ), (int)390);
                                                    }
                                                    if (var2_4 || var2_4) ** GOTO lbl6
                                                    if (!var1_1.method_7960()) break block133;
                                                    if (var2_4 || var2_4) ** GOTO lbl6
                                                    return (int)hi.dmsl("dnze", dmsv(int ), (int)391);
                                                }
                                                if (var2_4 || var2_4) ** GOTO lbl6
                                                if (var1_1.method_7909() != class_1802.field_22027) break block134;
                                                if (var2_4 || var2_4) ** GOTO lbl6
                                                return (int)hi.dmsl("dnzf", dmsv(int ), (int)392);
                                            }
                                            if (var2_4 || var2_4) ** GOTO lbl6
                                            if (var1_1.method_7909() != class_1802.field_22028) break block135;
                                            if (var2_4 || var2_4) ** GOTO lbl6
                                            return (int)hi.dmsl("dnzg", dmsv(int ), (int)393);
                                        }
                                        if (var2_4 || var2_4) ** GOTO lbl6
                                        if (var1_1.method_7909() != class_1802.field_22029) break block136;
                                        if (var2_4 || var2_4) ** GOTO lbl6
                                        return (int)hi.dmsl("dnzh", dmsv(int ), (int)394);
                                    }
                                    if (var2_4 || var2_4) ** GOTO lbl6
                                    if (var1_1.method_7909() != class_1802.field_22030) break block137;
                                    if (var2_4 || var2_4) ** GOTO lbl6
                                    return (int)hi.dmsl("dnzi", dmsv(int ), (int)395);
                                }
                                if (var2_4 || var2_4) ** GOTO lbl6
                                if (var1_1.method_7909() != class_1802.field_8805) break block138;
                                if (var2_4 || var2_4) ** GOTO lbl6
                                return (int)hi.dmsl("dnzj", dmsv(int ), (int)396);
                            }
                            if (var2_4 || var2_4) ** GOTO lbl6
                            if (var1_1.method_7909() != class_1802.field_8058) break block139;
                            if (var2_4 || var2_4) ** GOTO lbl6
                            return (int)hi.dmsl("dnzk", dmsv(int ), (int)397);
                        }
                        if (var2_4 || var2_4) ** GOTO lbl6
                        if (var1_1.method_7909() != class_1802.field_8348) break block140;
                        if (var2_4 || var2_4) ** GOTO lbl6
                        return (int)hi.dmsl("dnzl", dmsv(int ), (int)398);
                    }
                    if (var2_4 || var2_4) ** GOTO lbl6
                    if (var1_1.method_7909() != class_1802.field_8285) break block141;
                    if (var2_4 || var2_4) ** GOTO lbl6
                    return (int)hi.dmsl("dnzm", dmsv(int ), (int)399);
                }
                if (var2_4 || var2_4) ** GOTO lbl6
                if (var1_1.method_7909() != class_1802.field_8743) break block142;
                if (var2_4 || var2_4) ** GOTO lbl6
                return (int)hi.dmsl("dnzn", dmsv(int ), (int)400);
            }
            if (var2_4 || var2_4) ** GOTO lbl6
            if (var1_1.method_7909() != class_1802.field_8523) break block143;
            if (var2_4 || var2_4) ** GOTO lbl6
            return (int)hi.dmsl("dnzo", dmsv(int ), (int)401);
        }
        if (var2_4) ** GOTO lbl6
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl6
                if (var1_1.method_7909() != class_1802.field_8396) ** GOTO lbl71
                if (var2_4 || var2_4) ** GOTO lbl6
                return (int)hi.dmsl("dnzp", dmsv(int ), (int)402);
lbl71:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl6
                if (var1_1.method_7909() != class_1802.field_8660) ** GOTO lbl75
                if (var2_4 || var2_4) ** GOTO lbl6
                return (int)hi.dmsl("dnzq", dmsv(int ), (int)403);
lbl75:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl6
                if (var1_1.method_7909() != class_1802.field_8862) ** GOTO lbl79
                if (var2_4 || var2_4) ** GOTO lbl6
                return (int)hi.dmsl("dnzr", dmsv(int ), (int)404);
lbl79:
                // 1 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return (int)hi.dmsl("dnzs", dmsv(int ), (int)405);
            }
lbl82:
            // 4 sources

            case 0: {
                var3_3 /* !! */  = (int)hi.dmsl("dnzt", dmsv(int ), (int)406);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl142
            }
lbl87:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)hi.dmsl("dnzu", dmsv(int ), (int)407);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl232
            }
            case 2: {
                var3_3 /* !! */  = (int)hi.dmsl("dnzv", dmsv(int ), (int)408);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl117
            }
lbl97:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)hi.dmsl("dnzw", dmsv(int ), (int)409);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl278
            }
lbl102:
            // 3 sources

            case 4: {
                var3_3 /* !! */  = (int)hi.dmsl("dnzx", dmsv(int ), (int)410);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl282
            }
            case 5: {
                var3_3 /* !! */  = (int)hi.dmsl("dnzy", dmsv(int ), (int)411);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl303
            }
            case 6: {
                var3_3 /* !! */  = (int)hi.dmsl("dnzz", dmsv(int ), (int)412);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl328
            }
lbl117:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)hi.dmsl("doaa", dmsv(int ), (int)413);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl151
            }
            case 8: {
                var3_3 /* !! */  = (int)hi.dmsl("doab", dmsv(int ), (int)414);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl228
            }
lbl127:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)hi.dmsl("doac", dmsv(int ), (int)415);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl352
            }
lbl132:
            // 3 sources

            case 10: {
                var3_3 /* !! */  = (int)hi.dmsl("doad", dmsv(int ), (int)416);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl328
            }
lbl137:
            // 2 sources

            case 11: {
                var3_3 /* !! */  = (int)hi.dmsl("doae", dmsv(int ), (int)417);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl232
            }
lbl142:
            // 2 sources

            case 12: {
                var3_3 /* !! */  = (int)hi.dmsl("doaf", dmsv(int ), (int)418);
                if (!var4_2) ** GOTO lbl87
                throw null;
            }
            case 13: {
                var3_3 /* !! */  = (int)hi.dmsl("doag", dmsv(int ), (int)419);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl372
            }
lbl151:
            // 3 sources

            case 14: {
                var3_3 /* !! */  = (int)hi.dmsl("doah", dmsv(int ), (int)420);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl274
            }
            case 15: {
                var3_3 /* !! */  = (int)hi.dmsl("doai", dmsv(int ), (int)421);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl336
            }
lbl161:
            // 3 sources

            case 16: {
                var3_3 /* !! */  = (int)hi.dmsl("doaj", dmsv(int ), (int)422);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl282
            }
            case 17: {
                var3_3 /* !! */  = (int)hi.dmsl("doak", dmsv(int ), (int)423);
                if (!var4_2) ** GOTO lbl97
                throw null;
            }
lbl170:
            // 2 sources

            case 18: {
                var3_3 /* !! */  = (int)hi.dmsl("doal", dmsv(int ), (int)424);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl175:
            // 2 sources

            case 19: {
                var3_3 /* !! */  = (int)hi.dmsl("doam", dmsv(int ), (int)425);
                if (!var4_2) ** GOTO lbl161
                throw null;
            }
            case 20: {
                var3_3 /* !! */  = (int)hi.dmsl("doan", dmsv(int ), (int)426);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl224
            }
            case 21: {
                var3_3 /* !! */  = (int)hi.dmsl("doao", dmsv(int ), (int)427);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl352
            }
lbl189:
            // 2 sources

            case 22: {
                var3_3 /* !! */  = (int)hi.dmsl("doap", dmsv(int ), (int)428);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl364
            }
lbl194:
            // 2 sources

            case 23: {
                var3_3 /* !! */  = (int)hi.dmsl("doaq", dmsv(int ), (int)429);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl311
            }
            case 24: {
                var3_3 /* !! */  = (int)hi.dmsl("doar", dmsv(int ), (int)430);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl344
            }
            case 25: {
                var3_3 /* !! */  = (int)hi.dmsl("doas", dmsv(int ), (int)431);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl372
            }
            case 26: {
                var3_3 /* !! */  = (int)hi.dmsl("doat", dmsv(int ), (int)432);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl264
            }
lbl214:
            // 2 sources

            case 27: {
                var3_3 /* !! */  = (int)hi.dmsl("doau", dmsv(int ), (int)433);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl372
            }
lbl219:
            // 2 sources

            case 28: {
                var3_3 /* !! */  = (int)hi.dmsl("doav", dmsv(int ), (int)434);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl260
            }
lbl224:
            // 3 sources

            case 29: {
                var3_3 /* !! */  = (int)hi.dmsl("doaw", dmsv(int ), (int)435);
                if (!var4_2) ** GOTO lbl82
                throw null;
            }
lbl228:
            // 2 sources

            case 30: {
                var3_3 /* !! */  = (int)hi.dmsl("doax", dmsv(int ), (int)436);
                if (!var4_2) ** GOTO lbl224
                throw null;
            }
lbl232:
            // 3 sources

            case 31: {
                var3_3 /* !! */  = (int)hi.dmsl("doay", dmsv(int ), (int)437);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl336
            }
lbl237:
            // 2 sources

            case 32: {
                var3_3 /* !! */  = (int)hi.dmsl("doaz", dmsv(int ), (int)438);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl286
            }
            case 33: {
                var3_3 /* !! */  = (int)hi.dmsl("doba", dmsv(int ), (int)439);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl260
            }
            case 34: {
                var3_3 /* !! */  = (int)hi.dmsl("dobb", dmsv(int ), (int)440);
                if (!var4_2) ** GOTO lbl189
                throw null;
            }
lbl251:
            // 2 sources

            case 35: {
                var3_3 /* !! */  = (int)hi.dmsl("dobc", dmsv(int ), (int)441);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl264
            }
            case 36: {
                var3_3 /* !! */  = (int)hi.dmsl("dobd", dmsv(int ), (int)442);
                if (!var4_2) ** GOTO lbl132
                throw null;
            }
lbl260:
            // 3 sources

            case 37: {
                var3_3 /* !! */  = (int)hi.dmsl("dobe", dmsv(int ), (int)443);
                if (!var4_2) ** GOTO lbl82
                throw null;
            }
lbl264:
            // 4 sources

            case 38: {
                var3_3 /* !! */  = (int)hi.dmsl("dobf", dmsv(int ), (int)444);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl360
            }
            case 39: {
                var3_3 /* !! */  = (int)hi.dmsl("dobg", dmsv(int ), (int)445);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl356
            }
lbl274:
            // 2 sources

            case 40: {
                var3_3 /* !! */  = (int)hi.dmsl("dobh", dmsv(int ), (int)446);
                if (!var4_2) ** GOTO lbl151
                throw null;
            }
lbl278:
            // 3 sources

            case 41: {
                var3_3 /* !! */  = (int)hi.dmsl("dobi", dmsv(int ), (int)447);
                if (!var4_2) ** GOTO lbl127
                throw null;
            }
lbl282:
            // 3 sources

            case 42: {
                var3_3 /* !! */  = (int)hi.dmsl("dobj", dmsv(int ), (int)448);
                if (!var4_2) ** GOTO lbl194
                throw null;
            }
lbl286:
            // 2 sources

            case 43: {
                var3_3 /* !! */  = (int)hi.dmsl("dobk", dmsv(int ), (int)449);
                if (!var4_2) ** GOTO lbl102
                throw null;
            }
lbl290:
            // 2 sources

            case 44: {
                var3_3 /* !! */  = (int)hi.dmsl("dobl", dmsv(int ), (int)450);
                if (!var4_2) ** GOTO lbl170
                throw null;
            }
lbl294:
            // 2 sources

            case 45: {
                var3_3 /* !! */  = (int)hi.dmsl("dobm", dmsv(int ), (int)451);
                if (!var4_2) ** GOTO lbl175
                throw null;
            }
lbl298:
            // 2 sources

            case 46: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hi.dmsl("dobn", dmsv(int ), (int)452);
                    if (!var4_2) ** GOTO lbl132
                    throw null;
                }
            }
lbl303:
            // 3 sources

            case 47: {
                var3_3 /* !! */  = (int)hi.dmsl("dobo", dmsv(int ), (int)453);
                if (!var4_2) ** GOTO lbl251
                throw null;
            }
            case 48: {
                var3_3 /* !! */  = (int)hi.dmsl("dobp", dmsv(int ), (int)454);
                if (!var4_2) ** GOTO lbl290
                throw null;
            }
lbl311:
            // 2 sources

            case 49: {
                do {
                    var3_3 /* !! */  = (int)hi.dmsl("dobq", dmsv(int ), (int)455);
                } while (!var4_2);
                throw null;
            }
            case 50: {
                var3_3 /* !! */  = (int)hi.dmsl("dobr", dmsv(int ), (int)456);
                if (!var4_2) ** GOTO lbl278
                throw null;
            }
lbl320:
            // 2 sources

            case 51: {
                var3_3 /* !! */  = (int)hi.dmsl("dobs", dmsv(int ), (int)457);
                if (!var4_2) ** GOTO lbl264
                throw null;
            }
lbl324:
            // 2 sources

            case 52: {
                var3_3 /* !! */  = (int)hi.dmsl("dobt", dmsv(int ), (int)458);
                if (!var4_2) ** GOTO lbl214
                throw null;
            }
lbl328:
            // 4 sources

            case 53: {
                var3_3 /* !! */  = (int)hi.dmsl("dobu", dmsv(int ), (int)459);
                if (!var4_2) ** GOTO lbl298
                throw null;
            }
lbl332:
            // 2 sources

            case 54: {
                var3_3 /* !! */  = (int)hi.dmsl("dobv", dmsv(int ), (int)460);
                if (!var4_2) ** GOTO lbl294
                throw null;
            }
lbl336:
            // 3 sources

            case 55: {
                var3_3 /* !! */  = (int)hi.dmsl("dobw", dmsv(int ), (int)461);
                if (var4_2) {
                    throw null;
                }
            }
            case 56: {
                var3_3 /* !! */  = (int)hi.dmsl("dobx", dmsv(int ), (int)462);
                if (!var4_2) ** GOTO lbl102
                throw null;
            }
lbl344:
            // 2 sources

            case 57: {
                var3_3 /* !! */  = (int)hi.dmsl("doby", dmsv(int ), (int)463);
                if (!var4_2) ** GOTO lbl161
                throw null;
            }
            case 58: {
                var3_3 /* !! */  = (int)hi.dmsl("dobz", dmsv(int ), (int)464);
                if (!var4_2) ** GOTO lbl82
                throw null;
            }
lbl352:
            // 3 sources

            case 59: {
                var3_3 /* !! */  = (int)hi.dmsl("doca", dmsv(int ), (int)465);
                if (!var4_2) ** GOTO lbl137
                throw null;
            }
lbl356:
            // 2 sources

            case 60: {
                var3_3 /* !! */  = (int)hi.dmsl("docb", dmsv(int ), (int)466);
                if (!var4_2) ** GOTO lbl332
                throw null;
            }
lbl360:
            // 2 sources

            case 61: {
                var3_3 /* !! */  = (int)hi.dmsl("docc", dmsv(int ), (int)467);
                if (!var4_2) ** GOTO lbl324
                throw null;
            }
lbl364:
            // 2 sources

            case 62: {
                var3_3 /* !! */  = (int)hi.dmsl("docd", dmsv(int ), (int)468);
                if (!var4_2) ** GOTO lbl237
                throw null;
            }
            case 63: {
                var3_3 /* !! */  = (int)hi.dmsl("doce", dmsv(int ), (int)469);
                if (!var4_2) ** GOTO lbl303
                throw null;
            }
lbl372:
            // 4 sources

            case 64: {
                var3_3 /* !! */  = (int)hi.dmsl("docf", dmsv(int ), (int)470);
                if (!var4_2) ** GOTO lbl320
                throw null;
            }
            case 65: {
                var3_3 /* !! */  = (int)hi.dmsl("docg", dmsv(int ), (int)471);
                if (!var4_2) ** GOTO lbl328
                throw null;
            }
            case 66: 
        }
        var3_3 /* !! */  = (int)hi.dmsl("doch", dmsv(int ), (int)472);
        ** while (!var4_2)
lbl383:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dtmp() {
        hi.dmsk[1200] = 451535790;
        hi.dmsk[1201] = -1968393429;
        hi.dmsk[1202] = 2065395612;
        hi.dmsk[1203] = 1801670953;
        hi.dmsk[1204] = -1956517490;
        hi.dmsk[1205] = 272678348;
        hi.dmsk[1206] = -1074529280;
        hi.dmsk[1207] = 1248821693;
        hi.dmsk[1208] = 54615681;
        hi.dmsk[1209] = 17851071;
        hi.dmsk[1210] = 1911844353;
        hi.dmsk[1211] = 156885199;
        hi.dmsk[1212] = 1739096893;
        hi.dmsk[1213] = -1705934674;
        hi.dmsk[1214] = -661659130;
        hi.dmsk[1215] = -461312660;
        hi.dmsk[1216] = -675839935;
        hi.dmsk[1217] = -985912902;
        hi.dmsk[1218] = -1915387458;
        hi.dmsk[1219] = -521868536;
        hi.dmsk[1220] = -865292703;
        hi.dmsk[1221] = -1350165582;
        hi.dmsk[1222] = 1089563197;
        hi.dmsk[1223] = -855755051;
        hi.dmsk[1224] = -2046794879;
        hi.dmsk[1225] = -1843329151;
        hi.dmsk[1226] = -1068281750;
        hi.dmsk[1227] = -1894572457;
        hi.dmsk[1228] = -1381349472;
        hi.dmsk[1229] = -1269736474;
        hi.dmsk[1230] = -1167030371;
        hi.dmsk[1231] = -520352968;
        hi.dmsk[1232] = -956795368;
        hi.dmsk[1233] = -1738897557;
        hi.dmsk[1234] = -347255164;
        hi.dmsk[1235] = -1461839784;
        hi.dmsk[1236] = 1604382499;
        hi.dmsk[1237] = -1588009585;
        hi.dmsk[1238] = 1230210630;
        hi.dmsk[1239] = 105997352;
        hi.dmsk[1240] = -734388831;
        hi.dmsk[1241] = -424621243;
        hi.dmsk[1242] = -474269719;
        hi.dmsk[1243] = -1662405576;
        hi.dmsk[1244] = -634680328;
        hi.dmsk[1245] = 627916301;
        hi.dmsk[1246] = 1451300959;
        hi.dmsk[1247] = 2003740984;
        hi.dmsk[1248] = -1379015735;
        hi.dmsk[1249] = -1634470327;
        hi.dmsk[1250] = 485637398;
        hi.dmsk[1251] = -2084725513;
        hi.dmsk[1252] = 1217442286;
        hi.dmsk[1253] = -880499885;
        hi.dmsk[1254] = 1957891112;
        hi.dmsk[1255] = 952339719;
        hi.dmsk[1256] = -65345989;
        hi.dmsk[1257] = 664735310;
        hi.dmsk[1258] = 157823595;
        hi.dmsk[1259] = -1255629765;
        hi.dmsk[1260] = 855068794;
        hi.dmsk[1261] = -1549396657;
        hi.dmsk[1262] = 2140419107;
        hi.dmsk[1263] = -1971632460;
        hi.dmsk[1264] = -184115983;
        hi.dmsk[1265] = -292276771;
        hi.dmsk[1266] = -1319474860;
        hi.dmsk[1267] = 1425281783;
        hi.dmsk[1268] = 696205587;
        hi.dmsk[1269] = -924495570;
        hi.dmsk[1270] = -328455159;
        hi.dmsk[1271] = 530166951;
        hi.dmsk[1272] = 305459395;
        hi.dmsk[1273] = 649345332;
        hi.dmsk[1274] = 1799083857;
        hi.dmsk[1275] = -353890625;
        hi.dmsk[1276] = -481094447;
        hi.dmsk[1277] = 1995848618;
        hi.dmsk[1278] = -1574896068;
        hi.dmsk[1279] = 601416362;
        hi.dmsk[1280] = 437331320;
        hi.dmsk[1281] = 1877571813;
        hi.dmsk[1282] = 1503117761;
        hi.dmsk[1283] = 739205357;
        hi.dmsk[1284] = -517107515;
        hi.dmsk[1285] = -1990203901;
        hi.dmsk[1286] = 2080822165;
        hi.dmsk[1287] = 436650107;
        hi.dmsk[1288] = -903836119;
        hi.dmsk[1289] = 942395128;
        hi.dmsk[1290] = -1996467554;
        hi.dmsk[1291] = 606654794;
        hi.dmsk[1292] = -730754063;
        hi.dmsk[1293] = 1349426761;
        hi.dmsk[1294] = 1848451136;
        hi.dmsk[1295] = 1551307792;
        hi.dmsk[1296] = 1773572280;
        hi.dmsk[1297] = 2014989617;
        hi.dmsk[1298] = -2046011814;
        hi.dmsk[1299] = -1573888549;
    }

    private static /* synthetic */ void dtom() {
        hi.dmtt[600] = 6746947144401074848L;
        hi.dmtt[601] = 6027543346318632351L;
        hi.dmtt[602] = -5144546781525063215L;
        hi.dmtt[603] = -5544440156248485058L;
        hi.dmtt[604] = 3008901223212731393L;
        hi.dmtt[605] = -4698734544770586396L;
        hi.dmtt[606] = 110561337877493603L;
        hi.dmtt[607] = -1474489095022189862L;
        hi.dmtt[608] = 5304876535226591217L;
        hi.dmtt[609] = 2595719244937215426L;
        hi.dmtt[610] = -1601753486474376207L;
        hi.dmtt[611] = -553020080182771009L;
        hi.dmtt[612] = 2937663501455538620L;
        hi.dmtt[613] = -1209018713864051960L;
        hi.dmtt[614] = -8589477413626911349L;
        hi.dmtt[615] = 2094307629812273288L;
        hi.dmtt[616] = 3439384978394904396L;
        hi.dmtt[617] = -9220431194460418064L;
        hi.dmtt[618] = 4165566326304532404L;
        hi.dmtt[619] = -8159198379869573885L;
        hi.dmtt[620] = 3159438415350192995L;
        hi.dmtt[621] = 953434471334464103L;
        hi.dmtt[622] = 8249867809524052219L;
        hi.dmtt[623] = -1020988538569934893L;
        hi.dmtt[624] = 1243671150761327583L;
        hi.dmtt[625] = -2546918818479635530L;
        hi.dmtt[626] = -1629278669156863938L;
        hi.dmtt[627] = -4718793196639898855L;
        hi.dmtt[628] = 6130062467812418010L;
        hi.dmtt[629] = -8217811990518558123L;
        hi.dmtt[630] = -7529602787824778972L;
        hi.dmtt[631] = -3392516759790424755L;
        hi.dmtt[632] = 6996448905785702762L;
        hi.dmtt[633] = 2236629983342754416L;
        hi.dmtt[634] = 3827216083868789213L;
        hi.dmtt[635] = -3952353160756734776L;
        hi.dmtt[636] = 9202658405861212899L;
        hi.dmtt[637] = 7884240493771564231L;
        hi.dmtt[638] = 6235059749511712012L;
        hi.dmtt[639] = 2119047815875525953L;
        hi.dmtt[640] = 6064859689346463527L;
        hi.dmtt[641] = -332276115820352441L;
        hi.dmtt[642] = -5935341541897347422L;
        hi.dmtt[643] = -7954695546536120113L;
        hi.dmtt[644] = 3194157592344512183L;
        hi.dmtt[645] = 532587755102661732L;
        hi.dmtt[646] = -1355172601884900954L;
        hi.dmtt[647] = 3213348766221137433L;
        hi.dmtt[648] = 3359694311079288262L;
        hi.dmtt[649] = 4541121876073290402L;
        hi.dmtt[650] = 3588437765966983192L;
        hi.dmtt[651] = -3266622935159085121L;
        hi.dmtt[652] = 7342148025828119757L;
        hi.dmtt[653] = -3187800290663029973L;
        hi.dmtt[654] = -6297064318999110216L;
        hi.dmtt[655] = -3471820357442022820L;
        hi.dmtt[656] = 7961777362946822388L;
        hi.dmtt[657] = 2585061291228750391L;
        hi.dmtt[658] = -3096777663441074515L;
        hi.dmtt[659] = 911663805124423491L;
        hi.dmtt[660] = 794379169048278429L;
        hi.dmtt[661] = -2629461055249139583L;
        hi.dmtt[662] = -8039314916157406192L;
        hi.dmtt[663] = 3471513461090223694L;
        hi.dmtt[664] = 9010910758038364613L;
        hi.dmtt[665] = -1648634943940478839L;
        hi.dmtt[666] = 2369154461436131638L;
        hi.dmtt[667] = -5551706900421309465L;
        hi.dmtt[668] = -1174364469459253452L;
        hi.dmtt[669] = -7328975837643737625L;
        hi.dmtt[670] = -7435785877255723471L;
        hi.dmtt[671] = -6258473162628570960L;
        hi.dmtt[672] = 9096974318793839793L;
        hi.dmtt[673] = -3321632503980981996L;
        hi.dmtt[674] = 8592237214588440220L;
        hi.dmtt[675] = -3679930506168033351L;
        hi.dmtt[676] = -34487101009529457L;
        hi.dmtt[677] = -6562473712784326688L;
        hi.dmtt[678] = 6016752126149816996L;
        hi.dmtt[679] = -8539928388767472353L;
        hi.dmtt[680] = -7955286700595168929L;
        hi.dmtt[681] = -4999302738565612427L;
        hi.dmtt[682] = -4018278842319324123L;
        hi.dmtt[683] = -3259677717928745195L;
        hi.dmtt[684] = 763851766451538389L;
        hi.dmtt[685] = -2877988932852220329L;
        hi.dmtt[686] = -6413537204309766087L;
        hi.dmtt[687] = -1350560908300559958L;
        hi.dmtt[688] = 1966687734036511436L;
        hi.dmtt[689] = 7719363169128919416L;
        hi.dmtt[690] = 5110922159322376449L;
        hi.dmtt[691] = 1698960730969595541L;
        hi.dmtt[692] = 7323138105036982226L;
        hi.dmtt[693] = -7028520369664758113L;
        hi.dmtt[694] = -1361027450974844308L;
        hi.dmtt[695] = -4757068101832747815L;
        hi.dmtt[696] = 7703046394999259373L;
        hi.dmtt[697] = -5186089510476805040L;
        hi.dmtt[698] = 6595635449031091526L;
        hi.dmtt[699] = -5649924950648401728L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onPacket(cr var1_1) {
        var6_2 = hi.c;
        var5_3 /* !! */  = hi.b;
        var4_4 = hi.a;
        if (var6_2) {
            throw null;
lbl6:
            // 26 sources

            return;
        }
        if (var4_4 || var4_4) ** GOTO lbl6
        if (!this.placementAwaitingConfirmation) ** GOTO lbl18
        if (var4_4) ** GOTO lbl6
        if (var1_1.getType() != cr$Type.RECEIVE) ** GOTO lbl18
        if (var4_4) ** GOTO lbl6
        if (hi.mc.field_1724 != null) ** GOTO lbl20
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4) ** GOTO lbl6
lbl18:
                // 3 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                return;
            }
lbl20:
            // 1 sources

            if (var4_4 || var4_4) ** GOTO lbl6
            var3_5 = var1_1.getPacket();
            if (var4_4) ** GOTO lbl6
            if (!(var3_5 instanceof class_2653)) ** GOTO lbl34
            if (var4_4) ** GOTO lbl6
            var2_6 = (class_2653)var3_5;
            if (var4_4 || var4_4) ** GOTO lbl6
            if (var2_6.method_11452() != hi.mc.field_1724.field_7498.field_7763) ** GOTO lbl34
            if (var4_4) ** GOTO lbl6
            if (var2_6.method_11450() != hi.dmsl("dnfb", dmsv(int ), (int)152)) ** GOTO lbl34
            if (var4_4 || var4_4) ** GOTO lbl6
            this.observeServerOffhand(var2_6.method_11449(), (boolean)hi.dmsl("dnfc", dmsv(int ), (int)153));
            if (var4_4 || var4_4) ** GOTO lbl6
            return;
lbl34:
            // 3 sources

            if (var4_4 || var4_4) ** GOTO lbl6
            var3_5 = var1_1.getPacket();
            if (var4_4) ** GOTO lbl6
            if (!(var3_5 instanceof class_2649)) ** GOTO lbl48
            if (var4_4) ** GOTO lbl6
            var2_6 = (class_2649)var3_5;
            if (var4_4 || var4_4) ** GOTO lbl6
            if (var2_6.comp_3837() != hi.mc.field_1724.field_7498.field_7763) ** GOTO lbl48
            if (var4_4) ** GOTO lbl6
            if (var2_6.comp_3839().size() <= hi.dmsl("dnfd", dmsv(int ), (int)154)) ** GOTO lbl48
            if (var4_4 || var4_4) ** GOTO lbl6
            this.observeServerOffhand((class_1799)var2_6.comp_3839().get((int)hi.dmsl("dnfe", dmsv(int ), (int)155)), (boolean)hi.dmsl("dnff", dmsv(int ), (int)156));
            if (var4_4 || var4_4) ** GOTO lbl6
            return;
lbl48:
            // 3 sources

            if (var4_4 || var4_4) ** GOTO lbl6
            var3_5 = var1_1.getPacket();
            if (var4_4) ** GOTO lbl6
            if (!(var3_5 instanceof class_2744)) ** GOTO lbl59
            if (var4_4) ** GOTO lbl6
            var2_6 = (class_2744)var3_5;
            if (var4_4 || var4_4) ** GOTO lbl6
            if (var2_6.method_11820() != hi.mc.field_1724.method_5628()) ** GOTO lbl59
            if (var4_4 || var4_4) ** GOTO lbl6
            var2_6.method_30145().forEach((Consumer<Pair>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, lambda$onPacket$8(com.mojang.datafixers.util.Pair ), (Lcom/mojang/datafixers/util/Pair;)V)((hi)this));
            if (var4_4) ** GOTO lbl6
lbl59:
            // 3 sources

            if (!var4_4 && !var4_4) ** break;
            ** continue;
            return;
            case 0: {
                var5_3 /* !! */  = (int)hi.dmsl("dnfg", dmsv(int ), (int)157);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl236
            }
lbl67:
            // 3 sources

            case 1: {
                var5_3 /* !! */  = (int)hi.dmsl("dnfh", dmsv(int ), (int)158);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl227
            }
            case 2: {
                var5_3 /* !! */  = (int)hi.dmsl("dnfi", dmsv(int ), (int)159);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl87
            }
            case 3: {
                var5_3 /* !! */  = (int)hi.dmsl("dnfj", dmsv(int ), (int)160);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl189
            }
            case 4: {
                do {
                    var5_3 /* !! */  = (int)hi.dmsl("dnfk", dmsv(int ), (int)161);
                } while (!var6_2);
                throw null;
            }
lbl87:
            // 3 sources

            case 5: {
                var5_3 /* !! */  = (int)hi.dmsl("dnfl", dmsv(int ), (int)162);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl263
            }
            case 6: {
                var5_3 /* !! */  = (int)hi.dmsl("dnfm", dmsv(int ), (int)163);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl208
            }
lbl97:
            // 2 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)hi.dmsl("dnfn", dmsv(int ), (int)164);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl112
                    break;
                }
            }
            case 8: {
                var5_3 /* !! */  = (int)hi.dmsl("dnfo", dmsv(int ), (int)165);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl117
            }
lbl108:
            // 2 sources

            case 9: {
                var5_3 /* !! */  = (int)hi.dmsl("dnfp", dmsv(int ), (int)166);
                if (!var6_2) break;
                throw null;
            }
lbl112:
            // 2 sources

            case 10: {
                var5_3 /* !! */  = (int)hi.dmsl("dnfq", dmsv(int ), (int)167);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl184
            }
lbl117:
            // 3 sources

            case 11: {
                var5_3 /* !! */  = (int)hi.dmsl("dnfr", dmsv(int ), (int)168);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl127
            }
            case 12: {
                var5_3 /* !! */  = (int)hi.dmsl("dnfs", dmsv(int ), (int)169);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl250
            }
lbl127:
            // 3 sources

            case 13: {
                var5_3 /* !! */  = (int)hi.dmsl("dnft", dmsv(int ), (int)170);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl217
            }
lbl132:
            // 2 sources

            case 14: {
                var5_3 /* !! */  = (int)hi.dmsl("dnfu", dmsv(int ), (int)171);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl250
            }
            case 15: {
                var5_3 /* !! */  = (int)hi.dmsl("dnfv", dmsv(int ), (int)172);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl203
            }
            case 16: {
                var5_3 /* !! */  = (int)hi.dmsl("dnfw", dmsv(int ), (int)173);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl208
            }
            case 17: {
                var5_3 /* !! */  = (int)hi.dmsl("dnfx", dmsv(int ), (int)174);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl217
            }
            case 18: {
                var5_3 /* !! */  = (int)hi.dmsl("dnfy", dmsv(int ), (int)175);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl175
            }
            case 19: {
                var5_3 /* !! */  = (int)hi.dmsl("dnfz", dmsv(int ), (int)176);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl162:
            // 2 sources

            case 20: {
                var5_3 /* !! */  = (int)hi.dmsl("dnga", dmsv(int ), (int)177);
                if (!var6_2) ** GOTO lbl67
                throw null;
            }
lbl166:
            // 2 sources

            case 21: {
                var5_3 /* !! */  = (int)hi.dmsl("dngb", dmsv(int ), (int)178);
                if (!var6_2) ** GOTO lbl97
                throw null;
            }
            case 22: {
                var5_3 /* !! */  = (int)hi.dmsl("dngc", dmsv(int ), (int)179);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl213
            }
lbl175:
            // 2 sources

            case 23: {
                var5_3 /* !! */  = (int)hi.dmsl("dngd", dmsv(int ), (int)180);
                if (!var6_2) ** GOTO lbl117
                throw null;
            }
            case 24: {
                do {
                    var5_3 /* !! */  = (int)hi.dmsl("dnge", dmsv(int ), (int)181);
                } while (!var6_2);
                throw null;
            }
lbl184:
            // 2 sources

            case 25: {
                var5_3 /* !! */  = (int)hi.dmsl("dngf", dmsv(int ), (int)182);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl203
            }
lbl189:
            // 2 sources

            case 26: {
                var5_3 /* !! */  = (int)hi.dmsl("dngg", dmsv(int ), (int)183);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl246
            }
            case 27: {
                var5_3 /* !! */  = (int)hi.dmsl("dngh", dmsv(int ), (int)184);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl241
            }
            case 28: {
                var5_3 /* !! */  = (int)hi.dmsl("dngi", dmsv(int ), (int)185);
                if (!var6_2) ** GOTO lbl132
                throw null;
            }
lbl203:
            // 3 sources

            case 29: {
                var5_3 /* !! */  = (int)hi.dmsl("dngj", dmsv(int ), (int)186);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl227
            }
lbl208:
            // 3 sources

            case 30: {
                var5_3 /* !! */  = (int)hi.dmsl("dngk", dmsv(int ), (int)187);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl232
            }
lbl213:
            // 2 sources

            case 31: {
                var5_3 /* !! */  = (int)hi.dmsl("dngl", dmsv(int ), (int)188);
                if (!var6_2) ** GOTO lbl87
                throw null;
            }
lbl217:
            // 3 sources

            case 32: {
                var5_3 /* !! */  = (int)hi.dmsl("dngm", dmsv(int ), (int)189);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl250
            }
            case 33: {
                var5_3 /* !! */  = (int)hi.dmsl("dngn", dmsv(int ), (int)190);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl259
            }
lbl227:
            // 3 sources

            case 34: {
                do {
                    var5_3 /* !! */  = (int)hi.dmsl("dngo", dmsv(int ), (int)191);
                } while (!var6_2);
                throw null;
            }
lbl232:
            // 2 sources

            case 35: {
                var5_3 /* !! */  = (int)hi.dmsl("dngp", dmsv(int ), (int)192);
                if (!var6_2) ** GOTO lbl108
                throw null;
            }
lbl236:
            // 2 sources

            case 36: {
                do {
                    var5_3 /* !! */  = (int)hi.dmsl("dngq", dmsv(int ), (int)193);
                } while (!var6_2);
                throw null;
            }
lbl241:
            // 2 sources

            case 37: {
                do {
                    var5_3 /* !! */  = (int)hi.dmsl("dngr", dmsv(int ), (int)194);
                } while (!var6_2);
                throw null;
            }
lbl246:
            // 2 sources

            case 38: {
                var5_3 /* !! */  = (int)hi.dmsl("dngs", dmsv(int ), (int)195);
                if (!var6_2) ** GOTO lbl67
                throw null;
            }
lbl250:
            // 5 sources

            case 39: {
                var5_3 /* !! */  = (int)hi.dmsl("dngt", dmsv(int ), (int)196);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl263
            }
            case 40: {
                var5_3 /* !! */  = (int)hi.dmsl("dngu", dmsv(int ), (int)197);
                if (!var6_2) ** GOTO lbl127
                throw null;
            }
lbl259:
            // 2 sources

            case 41: {
                var5_3 /* !! */  = (int)hi.dmsl("dngv", dmsv(int ), (int)198);
                if (!var6_2) ** GOTO lbl162
                throw null;
            }
lbl263:
            // 3 sources

            case 42: {
                var5_3 /* !! */  = (int)hi.dmsl("dngw", dmsv(int ), (int)199);
                if (!var6_2) ** GOTO lbl250
                throw null;
            }
            case 43: 
        }
        var5_3 /* !! */  = (int)hi.dmsl("dngx", dmsv(int ), (int)200);
        ** while (!var6_2)
lbl270:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dsgn() {
        hi.dmsj[1000] = 1547768230;
        hi.dmsj[1001] = -1797042586;
        hi.dmsj[1002] = 44481353;
        hi.dmsj[1003] = -923950237;
        hi.dmsj[1004] = 300840563;
        hi.dmsj[1005] = 1962340384;
        hi.dmsj[1006] = -2075052923;
        hi.dmsj[1007] = -1173023136;
        hi.dmsj[1008] = 1703095183;
        hi.dmsj[1009] = 1179363298;
        hi.dmsj[1010] = -1076054575;
        hi.dmsj[1011] = -1377118240;
        hi.dmsj[1012] = -1799641862;
        hi.dmsj[1013] = 1939176041;
        hi.dmsj[1014] = 943487835;
        hi.dmsj[1015] = -973588374;
        hi.dmsj[1016] = -1467316676;
        hi.dmsj[1017] = 1958456599;
        hi.dmsj[1018] = -567759802;
        hi.dmsj[1019] = 1278770057;
        hi.dmsj[1020] = -1414892742;
        hi.dmsj[1021] = 1194676365;
        hi.dmsj[1022] = -1350126214;
        hi.dmsj[1023] = 1352188512;
        hi.dmsj[1024] = 1461237491;
        hi.dmsj[1025] = -1132299916;
        hi.dmsj[1026] = 2028129286;
        hi.dmsj[1027] = -1876433308;
        hi.dmsj[1028] = 860854970;
        hi.dmsj[1029] = -1458946893;
        hi.dmsj[1030] = 550630043;
        hi.dmsj[1031] = 1626605344;
        hi.dmsj[1032] = -1703395746;
        hi.dmsj[1033] = -1108972121;
        hi.dmsj[1034] = -840684087;
        hi.dmsj[1035] = 355440704;
        hi.dmsj[1036] = -1810800440;
        hi.dmsj[1037] = -773577149;
        hi.dmsj[1038] = 1534648767;
        hi.dmsj[1039] = -777905872;
        hi.dmsj[1040] = -104679023;
        hi.dmsj[1041] = 1256201327;
        hi.dmsj[1042] = 824180081;
        hi.dmsj[1043] = 726141387;
        hi.dmsj[1044] = -689940779;
        hi.dmsj[1045] = -1208924286;
        hi.dmsj[1046] = 294797356;
        hi.dmsj[1047] = -1060509359;
        hi.dmsj[1048] = 1819776419;
        hi.dmsj[1049] = 145468753;
        hi.dmsj[1050] = 792049072;
        hi.dmsj[1051] = -329003397;
        hi.dmsj[1052] = -1912808976;
        hi.dmsj[1053] = -1467053489;
        hi.dmsj[1054] = -99382322;
        hi.dmsj[1055] = -182064022;
        hi.dmsj[1056] = 1392364642;
        hi.dmsj[1057] = 1194346815;
        hi.dmsj[1058] = -1848465513;
        hi.dmsj[1059] = 1009228337;
        hi.dmsj[1060] = -1774969268;
        hi.dmsj[1061] = -403833564;
        hi.dmsj[1062] = 1369217796;
        hi.dmsj[1063] = 432778621;
        hi.dmsj[1064] = 361831275;
        hi.dmsj[1065] = -838118178;
        hi.dmsj[1066] = -1308040386;
        hi.dmsj[1067] = 1104035870;
        hi.dmsj[1068] = 1905953642;
        hi.dmsj[1069] = 126563872;
        hi.dmsj[1070] = 142904757;
        hi.dmsj[1071] = -1346292950;
        hi.dmsj[1072] = -1191860306;
        hi.dmsj[1073] = 953711497;
        hi.dmsj[1074] = 711634856;
        hi.dmsj[1075] = 35520768;
        hi.dmsj[1076] = -1752880849;
        hi.dmsj[1077] = 282690594;
        hi.dmsj[1078] = -26981224;
        hi.dmsj[1079] = 1298708451;
        hi.dmsj[1080] = -481578297;
        hi.dmsj[1081] = -1618966084;
        hi.dmsj[1082] = -957573994;
        hi.dmsj[1083] = 1816734166;
        hi.dmsj[1084] = -594273366;
        hi.dmsj[1085] = 60158792;
        hi.dmsj[1086] = -952067140;
        hi.dmsj[1087] = -1841516981;
        hi.dmsj[1088] = -1896522106;
        hi.dmsj[1089] = -156010205;
        hi.dmsj[1090] = 1971325740;
        hi.dmsj[1091] = 2073322125;
        hi.dmsj[1092] = -1983975152;
        hi.dmsj[1093] = -267026581;
        hi.dmsj[1094] = -1290831160;
        hi.dmsj[1095] = -1279166762;
        hi.dmsj[1096] = -1465810732;
        hi.dmsj[1097] = -1378093172;
        hi.dmsj[1098] = 1534468093;
        hi.dmsj[1099] = 1295028270;
    }

    private static /* synthetic */ void dtrw() {
        hi.dmtu[300] = 2002575995614015808L;
        hi.dmtu[301] = 3422938726054178242L;
        hi.dmtu[302] = -8266455413998096043L;
        hi.dmtu[303] = -3652085935774841719L;
        hi.dmtu[304] = -1482040954720909386L;
        hi.dmtu[305] = 904121305042686891L;
        hi.dmtu[306] = 1570365353044073778L;
        hi.dmtu[307] = -7551020348274005424L;
        hi.dmtu[308] = -2199649572273451054L;
        hi.dmtu[309] = 3430393408446011665L;
        hi.dmtu[310] = 5527924541365751561L;
        hi.dmtu[311] = -4834934160965515982L;
        hi.dmtu[312] = 3535382710184650199L;
        hi.dmtu[313] = -8875021941889894076L;
        hi.dmtu[314] = 6847405627875624239L;
        hi.dmtu[315] = 7449144303705005851L;
        hi.dmtu[316] = -2199589341979485796L;
        hi.dmtu[317] = 3545551868864923511L;
        hi.dmtu[318] = -240241319009317379L;
        hi.dmtu[319] = -3379578379278352581L;
        hi.dmtu[320] = 6403296497073147867L;
        hi.dmtu[321] = -306911223588290093L;
        hi.dmtu[322] = -3986108058797807778L;
        hi.dmtu[323] = 8684016369854460394L;
        hi.dmtu[324] = -9189820198245307102L;
        hi.dmtu[325] = 6240043908128043375L;
        hi.dmtu[326] = -1309420071812059097L;
        hi.dmtu[327] = -1556242388103087958L;
        hi.dmtu[328] = -3848860391513750878L;
        hi.dmtu[329] = 5413046154555827912L;
        hi.dmtu[330] = 5393632754730367301L;
        hi.dmtu[331] = -5497541381397771070L;
        hi.dmtu[332] = 4357008204132421648L;
        hi.dmtu[333] = -2587962789460160879L;
        hi.dmtu[334] = 1144326531786566864L;
        hi.dmtu[335] = 2005595216731931808L;
        hi.dmtu[336] = 3964410981527284479L;
        hi.dmtu[337] = -3364353529884153397L;
        hi.dmtu[338] = 1301955146440884011L;
        hi.dmtu[339] = 3434893343032176091L;
        hi.dmtu[340] = 303462271221445962L;
        hi.dmtu[341] = -3081808701364846402L;
        hi.dmtu[342] = 9047870273315275154L;
        hi.dmtu[343] = -7321875053061353L;
        hi.dmtu[344] = -9109548882436259891L;
        hi.dmtu[345] = -7851545063252815117L;
        hi.dmtu[346] = 3868087506293398392L;
        hi.dmtu[347] = 2228085088866148219L;
        hi.dmtu[348] = 2967422566674247751L;
        hi.dmtu[349] = 7488434630329531163L;
        hi.dmtu[350] = 5048687240072653181L;
        hi.dmtu[351] = -7636532692231743578L;
        hi.dmtu[352] = 8241181649783529167L;
        hi.dmtu[353] = 7122399681326131696L;
        hi.dmtu[354] = -2893851503663830359L;
        hi.dmtu[355] = -2172946536585308492L;
        hi.dmtu[356] = 8124278463480361169L;
        hi.dmtu[357] = 600337968738297059L;
        hi.dmtu[358] = -4116218935193567382L;
        hi.dmtu[359] = -4712944793554362209L;
        hi.dmtu[360] = -7539796508019094385L;
        hi.dmtu[361] = -2754897755952968770L;
        hi.dmtu[362] = 8797985733699998887L;
        hi.dmtu[363] = -1474094333502493751L;
        hi.dmtu[364] = 7715239054857365388L;
        hi.dmtu[365] = -5579090413725844993L;
        hi.dmtu[366] = -8876371210926427430L;
        hi.dmtu[367] = 8010746538533017092L;
        hi.dmtu[368] = 1773563176373715824L;
        hi.dmtu[369] = -878354662749804895L;
        hi.dmtu[370] = 581927496935630288L;
        hi.dmtu[371] = -8340571752379279031L;
        hi.dmtu[372] = 1806128829865696931L;
        hi.dmtu[373] = -8811005416230362098L;
        hi.dmtu[374] = 4929885976697325595L;
        hi.dmtu[375] = 2836447960695273142L;
        hi.dmtu[376] = -2064078572855079694L;
        hi.dmtu[377] = -3978950333484720126L;
        hi.dmtu[378] = 8461893179403130393L;
        hi.dmtu[379] = 4538493751288024059L;
        hi.dmtu[380] = -4177492779490698974L;
        hi.dmtu[381] = 809315233771821738L;
        hi.dmtu[382] = 4731432955961216357L;
        hi.dmtu[383] = 7891515955758496186L;
        hi.dmtu[384] = -8789944242796157103L;
        hi.dmtu[385] = 1216310945987513431L;
        hi.dmtu[386] = 3137383582458992168L;
        hi.dmtu[387] = 3470618803935168774L;
        hi.dmtu[388] = -908680598562895475L;
        hi.dmtu[389] = -5547026107321446775L;
        hi.dmtu[390] = -6428552551928018474L;
        hi.dmtu[391] = -932875558256409327L;
        hi.dmtu[392] = 6946437632499706711L;
        hi.dmtu[393] = 5235851616186989915L;
        hi.dmtu[394] = 5383417611479847089L;
        hi.dmtu[395] = 7756134164081066954L;
        hi.dmtu[396] = 7587935723643011463L;
        hi.dmtu[397] = -898625971392279579L;
        hi.dmtu[398] = -3016443226267311497L;
        hi.dmtu[399] = -8631612999077616027L;
    }

    private static /* synthetic */ void dtnd() {
        hi.dmtt[400] = 5173205158379316351L;
        hi.dmtt[401] = -2903287244151605475L;
        hi.dmtt[402] = -6567403541812333233L;
        hi.dmtt[403] = 62029651342819706L;
        hi.dmtt[404] = 5424897518790499144L;
        hi.dmtt[405] = -3016967748746325607L;
        hi.dmtt[406] = -2976026579157970751L;
        hi.dmtt[407] = 7705117955539065907L;
        hi.dmtt[408] = -2191608215882226955L;
        hi.dmtt[409] = 6511885295424095350L;
        hi.dmtt[410] = -9089170113848421822L;
        hi.dmtt[411] = -9062934353422330890L;
        hi.dmtt[412] = -8967280643627823815L;
        hi.dmtt[413] = 7854903032061224267L;
        hi.dmtt[414] = -4860123191441138801L;
        hi.dmtt[415] = 5865695332717812150L;
        hi.dmtt[416] = 522436937111186052L;
        hi.dmtt[417] = 3511508284070900317L;
        hi.dmtt[418] = -2230231835700096745L;
        hi.dmtt[419] = -8812695919816146821L;
        hi.dmtt[420] = -4169721743046768336L;
        hi.dmtt[421] = -7616531759940149541L;
        hi.dmtt[422] = 7709552017109370609L;
        hi.dmtt[423] = 2335258588455191112L;
        hi.dmtt[424] = -5501145084092323254L;
        hi.dmtt[425] = -3751218691708399366L;
        hi.dmtt[426] = 5586693388011700274L;
        hi.dmtt[427] = -410591358358491543L;
        hi.dmtt[428] = -6882957845380766250L;
        hi.dmtt[429] = -1223348710810408749L;
        hi.dmtt[430] = -3746790539556740909L;
        hi.dmtt[431] = -4725321603287557369L;
        hi.dmtt[432] = 4379727011465418251L;
        hi.dmtt[433] = -5494569828040643121L;
        hi.dmtt[434] = -6302814502060112253L;
        hi.dmtt[435] = -3558027820642140838L;
        hi.dmtt[436] = -5393550938745513845L;
        hi.dmtt[437] = -8837715391027549883L;
        hi.dmtt[438] = -6419781523807149764L;
        hi.dmtt[439] = -7655119142844803107L;
        hi.dmtt[440] = -2454633979575501011L;
        hi.dmtt[441] = 4307703673465513128L;
        hi.dmtt[442] = -7475225909560533106L;
        hi.dmtt[443] = 4939879879449035238L;
        hi.dmtt[444] = -1282582766625942299L;
        hi.dmtt[445] = -7692008855495978965L;
        hi.dmtt[446] = 772964664545234190L;
        hi.dmtt[447] = 3955676281668532092L;
        hi.dmtt[448] = 388900013661010152L;
        hi.dmtt[449] = 9027830664822463979L;
        hi.dmtt[450] = 2558174271682308323L;
        hi.dmtt[451] = -4919520313327620752L;
        hi.dmtt[452] = -7859130804423981467L;
        hi.dmtt[453] = 2374221008114557416L;
        hi.dmtt[454] = 6122857141961739436L;
        hi.dmtt[455] = 6551445209212559295L;
        hi.dmtt[456] = 6857605717087991206L;
        hi.dmtt[457] = -5262438101306580359L;
        hi.dmtt[458] = 8911458470605764635L;
        hi.dmtt[459] = 215782020318485098L;
        hi.dmtt[460] = -8984815596273257382L;
        hi.dmtt[461] = -7519377892832428783L;
        hi.dmtt[462] = 8657724385515840984L;
        hi.dmtt[463] = -4075002319715491317L;
        hi.dmtt[464] = -7566816454225940659L;
        hi.dmtt[465] = 800431963306547151L;
        hi.dmtt[466] = -5568055466876228885L;
        hi.dmtt[467] = -2775658299060363911L;
        hi.dmtt[468] = 2015719435114499495L;
        hi.dmtt[469] = 6679490612386350304L;
        hi.dmtt[470] = 4181432301122124389L;
        hi.dmtt[471] = 2842597300966260879L;
        hi.dmtt[472] = 4420406045953523407L;
        hi.dmtt[473] = -2285801053389399574L;
        hi.dmtt[474] = 1524616624550126401L;
        hi.dmtt[475] = 918378858055632810L;
        hi.dmtt[476] = 3859317274462441314L;
        hi.dmtt[477] = -8234658283583022977L;
        hi.dmtt[478] = 98974388103238014L;
        hi.dmtt[479] = -2395534851304825911L;
        hi.dmtt[480] = -9121223838660782791L;
        hi.dmtt[481] = 5044223320917905710L;
        hi.dmtt[482] = -5444959178386147927L;
        hi.dmtt[483] = 9113217771959420272L;
        hi.dmtt[484] = 7188369830308528985L;
        hi.dmtt[485] = 4484743542786304257L;
        hi.dmtt[486] = -9213176803447212580L;
        hi.dmtt[487] = 6839222294381949215L;
        hi.dmtt[488] = -736696426143466596L;
        hi.dmtt[489] = -7792884095541340431L;
        hi.dmtt[490] = -3923914555609254564L;
        hi.dmtt[491] = 7740906976447901052L;
        hi.dmtt[492] = -5480691998335202090L;
        hi.dmtt[493] = 3049907876088415452L;
        hi.dmtt[494] = -3472148585684076298L;
        hi.dmtt[495] = -8383236152412962773L;
        hi.dmtt[496] = -8933321357291695957L;
        hi.dmtt[497] = 5009707389463602478L;
        hi.dmtt[498] = -402388220328698799L;
        hi.dmtt[499] = -5234445428529868430L;
    }

    private static /* synthetic */ void dtmf() {
        hi.dmsk[200] = -1494139538;
        hi.dmsk[201] = -2058516758;
        hi.dmsk[202] = -332127098;
        hi.dmsk[203] = 1836242375;
        hi.dmsk[204] = -202121747;
        hi.dmsk[205] = 121844272;
        hi.dmsk[206] = 1180325922;
        hi.dmsk[207] = -1148450697;
        hi.dmsk[208] = 651740997;
        hi.dmsk[209] = -763192710;
        hi.dmsk[210] = -2002142064;
        hi.dmsk[211] = -835592762;
        hi.dmsk[212] = 181632273;
        hi.dmsk[213] = -582767012;
        hi.dmsk[214] = 1989989387;
        hi.dmsk[215] = 1097760366;
        hi.dmsk[216] = 1797994412;
        hi.dmsk[217] = 823908511;
        hi.dmsk[218] = -22357255;
        hi.dmsk[219] = 1316362623;
        hi.dmsk[220] = -2119350758;
        hi.dmsk[221] = -1412135336;
        hi.dmsk[222] = 75814514;
        hi.dmsk[223] = -1671386476;
        hi.dmsk[224] = -1916196312;
        hi.dmsk[225] = -1059358153;
        hi.dmsk[226] = 1379305219;
        hi.dmsk[227] = 1241345863;
        hi.dmsk[228] = -569388335;
        hi.dmsk[229] = 1595179292;
        hi.dmsk[230] = -1424145490;
        hi.dmsk[231] = 694403046;
        hi.dmsk[232] = 763468002;
        hi.dmsk[233] = -616997905;
        hi.dmsk[234] = 709034293;
        hi.dmsk[235] = 1609318246;
        hi.dmsk[236] = 1856823777;
        hi.dmsk[237] = -730991952;
        hi.dmsk[238] = 701237655;
        hi.dmsk[239] = 678991511;
        hi.dmsk[240] = -1571189461;
        hi.dmsk[241] = 1954292940;
        hi.dmsk[242] = 1057630170;
        hi.dmsk[243] = -1314967911;
        hi.dmsk[244] = 882610011;
        hi.dmsk[245] = -1064580429;
        hi.dmsk[246] = -1229960181;
        hi.dmsk[247] = 280206990;
        hi.dmsk[248] = 1139367922;
        hi.dmsk[249] = 1331739814;
        hi.dmsk[250] = 181267331;
        hi.dmsk[251] = 217825424;
        hi.dmsk[252] = -1065804492;
        hi.dmsk[253] = 544338645;
        hi.dmsk[254] = 686399851;
        hi.dmsk[255] = 1458348517;
        hi.dmsk[256] = 955353680;
        hi.dmsk[257] = 1221202600;
        hi.dmsk[258] = -301542527;
        hi.dmsk[259] = 1162461809;
        hi.dmsk[260] = -1968550973;
        hi.dmsk[261] = 416480604;
        hi.dmsk[262] = -388341989;
        hi.dmsk[263] = -793487509;
        hi.dmsk[264] = 1233716733;
        hi.dmsk[265] = 1983067090;
        hi.dmsk[266] = 1680773740;
        hi.dmsk[267] = -1797290669;
        hi.dmsk[268] = 876560963;
        hi.dmsk[269] = -1342364765;
        hi.dmsk[270] = 1611221533;
        hi.dmsk[271] = 54846750;
        hi.dmsk[272] = -467128713;
        hi.dmsk[273] = -746092745;
        hi.dmsk[274] = -594728548;
        hi.dmsk[275] = -1663889166;
        hi.dmsk[276] = 1804066612;
        hi.dmsk[277] = -1866898718;
        hi.dmsk[278] = 953637669;
        hi.dmsk[279] = 1482878192;
        hi.dmsk[280] = -625917963;
        hi.dmsk[281] = 1895338307;
        hi.dmsk[282] = -557875909;
        hi.dmsk[283] = 644158895;
        hi.dmsk[284] = 1130967519;
        hi.dmsk[285] = -345529143;
        hi.dmsk[286] = 1048868818;
        hi.dmsk[287] = 382851926;
        hi.dmsk[288] = 1602722210;
        hi.dmsk[289] = -528163209;
        hi.dmsk[290] = 234670509;
        hi.dmsk[291] = -2109499417;
        hi.dmsk[292] = 455039695;
        hi.dmsk[293] = 972812700;
        hi.dmsk[294] = -441359756;
        hi.dmsk[295] = 514209478;
        hi.dmsk[296] = 1952563228;
        hi.dmsk[297] = 1393055126;
        hi.dmsk[298] = -1838375044;
        hi.dmsk[299] = 631243140;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private /* synthetic */ Boolean lambda$new$5() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = ib - hi.dmsl("drxo", dmts(int ), (int)766)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == hi.dmsl("drxp", dmsv(int ), (int)1676)) break;
            object = hi.dmsl("drxq", dmsv(int ), (int)1677);
        }
        boolean bl3 = c;
        Object object = ib;
        block16: while (true) {
            switch ((int)object) {
                case 1228545173: {
                    break block16;
                }
                case 1264789111: {
                    object = hi.dmsl("dryc", dmts(int ), (int)768) - hi.dmsl("drxr", dmts(int ), (int)767);
                    continue block16;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object2;
            if ((object2 = (l3 = ib - hi.dmsl("dryd", dmts(int ), (int)769)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object2 == hi.dmsl("drye", dmsv(int ), (int)1678)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object2 = hi.dmsl("dryf", dmsv(int ), (int)1679);
        }
        if (bl2) return null;
        if (bl2) return null;
        Object object3 = ib;
        boolean bl4 = true;
        block18: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object3 = callSite - hi.dmsl("dryi", dmts(int ), (int)770);
            }
            switch ((int)object3) {
                case -1479031490: {
                    callSite = hi.dmsl("dryk", dmts(int ), (int)771);
                    continue block18;
                }
                case -611638776: {
                    callSite = hi.dmsl("drym", dmts(int ), (int)772);
                    continue block18;
                }
                case 1228545173: {
                    break block18;
                }
            }
            break;
        }
        boolean bl5 = this.check(CHECK_ARMOR);
        Object object4 = ib;
        boolean bl6 = true;
        block19: while (true) {
            CallSite callSite;
            if (!bl6 || (bl6 = false) || !true) {
                object4 = callSite - hi.dmsl("dryo", dmts(int ), (int)773);
            }
            switch ((int)object4) {
                case 1048887517: {
                    callSite = hi.dmsl("dryq", dmts(int ), (int)774);
                    continue block19;
                }
                case 1228545173: {
                    return bl5;
                }
                case 1499548191: {
                    callSite = hi.dmsl("drys", dmts(int ), (int)775);
                    continue block19;
                }
                case 1955285412: {
                    callSite = hi.dmsl("dryt", dmts(int ), (int)776);
                    continue block19;
                }
            }
            break;
        }
        return bl5;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int getArmorPoints() {
        block122: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = hi.ib - hi.dmsl("dnqu", dmts(int ), (int)69)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == hi.dmsl("dnqv", dmsv(int ), (int)328)) break;
                v0 /* !! */  = (long)hi.dmsl("dnqw", dmsv(int ), (int)329);
            }
            var8_1 = hi.c;
            v1 /* !! */  = hi.ib;
            if (true) ** GOTO lbl11
            block72: while (true) {
                v1 /* !! */  = (long)(v2 - hi.dmsl("dnqx", dmts(int ), (int)70));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case 1228545173: {
                        break block72;
                    }
                    case 1511305068: {
                        v2 = hi.dmsl("dnqy", dmts(int ), (int)71);
                        continue block72;
                    }
                    case 1625594790: {
                        v2 = hi.dmsl("dnqz", dmts(int ), (int)72);
                        continue block72;
                    }
                    case 1983689957: {
                        v2 = hi.dmsl("dnra", dmts(int ), (int)73);
                        continue block72;
                    }
                }
                break;
            }
            var7_2 /* !! */  = hi.b;
            v3 /* !! */  = hi.ib;
            if (true) ** GOTO lbl28
            block73: while (true) {
                v3 /* !! */  = (long)(v4 - hi.dmsl("dnrb", dmts(int ), (int)74));
lbl28:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1641330841: {
                        v4 = hi.dmsl("dnrc", dmts(int ), (int)75);
                        continue block73;
                    }
                    case -545409871: {
                        v4 = hi.dmsl("dnrd", dmts(int ), (int)76);
                        continue block73;
                    }
                    case 1228545173: {
                        break block73;
                    }
                }
                break;
            }
            var6_3 = hi.a;
            if (var8_1) {
                throw null;
lbl40:
                // 13 sources

                return (int)hi.dmsl("dnre", dmsv(int ), (int)330);
            }
            if (var6_3 || var6_3) ** GOTO lbl40
            v5 /* !! */  = hi.ib;
            if (true) ** GOTO lbl47
            block75: while (true) {
                v5 /* !! */  = (long)(hi.dmsl("dnrg", dmts(int ), (int)78) - hi.dmsl("dnrf", dmts(int ), (int)77));
lbl47:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -996049430: {
                        continue block75;
                    }
                    case 1228545173: {
                        break block75;
                    }
                }
                break;
            }
            v6 /* !! */  = hi.ib;
            if (true) ** GOTO lbl56
            block76: while (true) {
                v6 /* !! */  = (long)(v7 - hi.dmsl("dnrh", dmts(int ), (int)79));
lbl56:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -683691384: {
                        v7 = hi.dmsl("dnri", dmts(int ), (int)80);
                        continue block76;
                    }
                    case -114974415: {
                        v7 = hi.dmsl("dnrj", dmts(int ), (int)81);
                        continue block76;
                    }
                    case 1228545173: {
                        break block76;
                    }
                }
                break;
            }
            if (hi.mc.field_1724 != null) break block122;
            if (var6_3 || var6_3) ** GOTO lbl40
            return (int)hi.dmsl("dnrk", dmsv(int ), (int)331);
        }
        if (var6_3 || var6_3) ** GOTO lbl40
        var1_4 = hi.dmsl("dnrl", dmsv(int ), (int)332);
        if (var6_3) ** GOTO lbl40
        if (var7_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_3) ** GOTO lbl40
                v8 /* !! */  = hi.ib;
                if (true) ** GOTO lbl80
                block77: while (true) {
                    v8 /* !! */  = (long)(hi.dmsl("dnrn", dmts(int ), (int)83) - hi.dmsl("dnrm", dmts(int ), (int)82));
lbl80:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1264302818: {
                            continue block77;
                        }
                        case 1228545173: {
                            break block77;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_1 = hi.ib - hi.dmsl("dnro", dmts(int ), (int)84)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == hi.dmsl("dnrp", dmsv(int ), (int)333)) break;
                    v9 /* !! */  = (long)hi.dmsl("dnrq", dmsv(int ), (int)334);
                }
                v10 = hi.mc.field_1724;
                v11 /* !! */  = hi.ib;
                if (true) ** GOTO lbl95
                block79: while (true) {
                    v11 /* !! */  = (long)(hi.dmsl("dnrs", dmts(int ), (int)86) - hi.dmsl("dnrr", dmts(int ), (int)85));
lbl95:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case 1228545173: {
                            break block79;
                        }
                        case 1976343997: {
                            continue block79;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_2 = hi.ib - hi.dmsl("dnrt", dmts(int ), (int)87)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == hi.dmsl("dnru", dmsv(int ), (int)335)) break;
                    v12 /* !! */  = (long)hi.dmsl("dnrv", dmsv(int ), (int)336);
                }
                var2_5 = v10.method_6118(class_1304.field_6169);
                if (var6_3 || var6_3) ** GOTO lbl40
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_3 = hi.ib - hi.dmsl("dnrw", dmts(int ), (int)88)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == hi.dmsl("dnrx", dmsv(int ), (int)337)) break;
                    v13 /* !! */  = (long)hi.dmsl("dnry", dmsv(int ), (int)338);
                }
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_4 = hi.ib - hi.dmsl("dnrz", dmts(int ), (int)89)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == hi.dmsl("dnsa", dmsv(int ), (int)339)) break;
                    v14 /* !! */  = (long)hi.dmsl("dnsb", dmsv(int ), (int)340);
                }
                v15 = hi.mc.field_1724;
                v16 /* !! */  = hi.ib;
                if (true) ** GOTO lbl122
                block83: while (true) {
                    v16 /* !! */  = (long)(v17 - hi.dmsl("dnsc", dmts(int ), (int)90));
lbl122:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -2003624882: {
                            v17 = hi.dmsl("dnsd", dmts(int ), (int)91);
                            continue block83;
                        }
                        case -116584650: {
                            v17 = hi.dmsl("dnse", dmts(int ), (int)92);
                            continue block83;
                        }
                        case 1228545173: {
                            break block83;
                        }
                        case 1463972074: {
                            v17 = hi.dmsl("dnsf", dmts(int ), (int)93);
                            continue block83;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_5 = hi.ib - hi.dmsl("dnsg", dmts(int ), (int)94)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == hi.dmsl("dnsh", dmsv(int ), (int)341)) break;
                    v18 /* !! */  = (long)hi.dmsl("dnsi", dmsv(int ), (int)342);
                }
                var3_6 = v15.method_6118(class_1304.field_6174);
                if (var6_3 || var6_3) ** GOTO lbl40
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_6 = hi.ib - hi.dmsl("dnsj", dmts(int ), (int)95)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == hi.dmsl("dnsk", dmsv(int ), (int)343)) break;
                    v19 /* !! */  = (long)hi.dmsl("dnsl", dmsv(int ), (int)344);
                }
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_7 = hi.ib - hi.dmsl("dnsm", dmts(int ), (int)96)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == hi.dmsl("dnsn", dmsv(int ), (int)345)) break;
                    v20 /* !! */  = (long)hi.dmsl("dnso", dmsv(int ), (int)346);
                }
                v21 = hi.mc.field_1724;
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_8 = hi.ib - hi.dmsl("dnsp", dmts(int ), (int)97)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == hi.dmsl("dnsq", dmsv(int ), (int)347)) break;
                    v22 /* !! */  = (long)hi.dmsl("dnsr", dmsv(int ), (int)348);
                }
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_9 = hi.ib - hi.dmsl("dnss", dmts(int ), (int)98)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == hi.dmsl("dnst", dmsv(int ), (int)349)) break;
                    v23 /* !! */  = (long)hi.dmsl("dnsu", dmsv(int ), (int)350);
                }
                var4_7 = v21.method_6118(class_1304.field_6172);
                if (var6_3 || var6_3) ** GOTO lbl40
                v24 /* !! */  = hi.ib;
                if (true) ** GOTO lbl168
                block89: while (true) {
                    v24 /* !! */  = (long)(hi.dmsl("dnsw", dmts(int ), (int)100) - hi.dmsl("dnsv", dmts(int ), (int)99));
lbl168:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case -1876881952: {
                            continue block89;
                        }
                        case 1228545173: {
                            break block89;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v25 /* !! */  = (cfr_temp_10 = hi.ib - hi.dmsl("dnsx", dmts(int ), (int)101)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v25 /* !! */  == hi.dmsl("dnsy", dmsv(int ), (int)351)) break;
                    v25 /* !! */  = (long)hi.dmsl("dnsz", dmsv(int ), (int)352);
                }
                v26 = hi.mc.field_1724;
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_11 = hi.ib - hi.dmsl("dnta", dmts(int ), (int)102)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == hi.dmsl("dntb", dmsv(int ), (int)353)) break;
                    v27 /* !! */  = (long)hi.dmsl("dntc", dmsv(int ), (int)354);
                }
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_12 = hi.ib - hi.dmsl("dntd", dmts(int ), (int)103)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v28 /* !! */  == hi.dmsl("dnte", dmsv(int ), (int)355)) break;
                    v28 /* !! */  = (long)hi.dmsl("dntf", dmsv(int ), (int)356);
                }
                var5_8 = v26.method_6118(class_1304.field_6166);
                if (var6_3 || var6_3) ** GOTO lbl40
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_13 = hi.ib - hi.dmsl("dntg", dmts(int ), (int)104)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == hi.dmsl("dnth", dmsv(int ), (int)357)) break;
                    v29 /* !! */  = (long)hi.dmsl("dnti", dmsv(int ), (int)358);
                }
                var1_4 += this.getArmorValue(var2_5);
                if (var6_3 || var6_3) ** GOTO lbl40
                while (true) {
                    if ((v30 /* !! */  = (cfr_temp_14 = hi.ib - hi.dmsl("dntj", dmts(int ), (int)105)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                    if (v30 /* !! */  == hi.dmsl("dntk", dmsv(int ), (int)359)) break;
                    v30 /* !! */  = (long)hi.dmsl("dntl", dmsv(int ), (int)360);
                }
                var1_4 += this.getArmorValue(var3_6);
                if (var6_3 || var6_3) ** GOTO lbl40
                while (true) {
                    if ((v31 /* !! */  = (cfr_temp_15 = hi.ib - hi.dmsl("dntm", dmts(int ), (int)106)) == 0L ? 0 : (cfr_temp_15 < 0L ? -1 : 1)) == false) continue;
                    if (v31 /* !! */  == hi.dmsl("dntn", dmsv(int ), (int)361)) break;
                    v31 /* !! */  = (long)hi.dmsl("dnto", dmsv(int ), (int)362);
                }
                var1_4 += this.getArmorValue(var4_7);
                if (var6_3 || var6_3) ** GOTO lbl40
                v32 /* !! */  = hi.ib;
                if (true) ** GOTO lbl216
                block96: while (true) {
                    v32 /* !! */  = (long)(hi.dmsl("dntq", dmts(int ), (int)108) - hi.dmsl("dntp", dmts(int ), (int)107));
lbl216:
                    // 2 sources

                    switch ((int)v32 /* !! */ ) {
                        case 1228545173: {
                            break block96;
                        }
                        case 1382908904: {
                            continue block96;
                        }
                    }
                    break;
                }
                var1_4 += this.getArmorValue(var5_8);
                if (!var6_3 && !var6_3) ** break;
                ** continue;
                return (int)var1_4;
            }
            case 0: {
                var7_2 /* !! */  = (int)hi.dmsl("dntr", dmsv(int ), (int)363);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl245
            }
            case 1: {
                var7_2 /* !! */  = (int)hi.dmsl("dnyd", dmsv(int ), (int)364);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl310
            }
            case 2: {
                var7_2 /* !! */  = (int)hi.dmsl("dnye", dmsv(int ), (int)365);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl302
            }
lbl240:
            // 3 sources

            case 3: {
                var7_2 /* !! */  = (int)hi.dmsl("dnyf", dmsv(int ), (int)366);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl337
            }
lbl245:
            // 3 sources

            case 4: {
                var7_2 /* !! */  = (int)hi.dmsl("dnyg", dmsv(int ), (int)367);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl306
            }
            case 5: {
                var7_2 /* !! */  = (int)hi.dmsl("dnyh", dmsv(int ), (int)368);
                if (!var8_1) break;
                throw null;
            }
            case 6: {
                var7_2 /* !! */  = (int)hi.dmsl("dnyi", dmsv(int ), (int)369);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl287
            }
lbl259:
            // 2 sources

            case 7: {
                var7_2 /* !! */  = (int)hi.dmsl("dnyj", dmsv(int ), (int)370);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl341
            }
            case 8: {
                var7_2 /* !! */  = (int)hi.dmsl("dnyk", dmsv(int ), (int)371);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl341
            }
            case 9: {
                var7_2 /* !! */  = (int)hi.dmsl("dnyl", dmsv(int ), (int)372);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl337
            }
            case 10: {
                do {
                    var7_2 /* !! */  = (int)hi.dmsl("dnym", dmsv(int ), (int)373);
                } while (!var8_1);
                throw null;
            }
            case 11: {
                var7_2 /* !! */  = (int)hi.dmsl("dnyn", dmsv(int ), (int)374);
                if (!var8_1) break;
                throw null;
            }
            case 12: {
                var7_2 /* !! */  = (int)hi.dmsl("dnyo", dmsv(int ), (int)375);
                if (var8_1) {
                    throw null;
                }
            }
lbl287:
            // 4 sources

            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_2 /* !! */  = (int)hi.dmsl("dnyp", dmsv(int ), (int)376);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl306
                    break;
                }
            }
            case 14: {
                var7_2 /* !! */  = (int)hi.dmsl("dnyq", dmsv(int ), (int)377);
                if (!var8_1) ** GOTO lbl240
                throw null;
            }
            case 15: {
                var7_2 /* !! */  = (int)hi.dmsl("dnyr", dmsv(int ), (int)378);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl337
            }
lbl302:
            // 3 sources

            case 16: {
                var7_2 /* !! */  = (int)hi.dmsl("dnys", dmsv(int ), (int)379);
                if (!var8_1) ** GOTO lbl245
                throw null;
            }
lbl306:
            // 3 sources

            case 17: {
                var7_2 /* !! */  = (int)hi.dmsl("dnyt", dmsv(int ), (int)380);
                if (var8_1) {
                    throw null;
                }
            }
lbl310:
            // 4 sources

            case 18: {
                var7_2 /* !! */  = (int)hi.dmsl("dnyu", dmsv(int ), (int)381);
                if (!var8_1) ** GOTO lbl240
                throw null;
            }
            case 19: {
                var7_2 /* !! */  = (int)hi.dmsl("dnyv", dmsv(int ), (int)382);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl337
            }
lbl319:
            // 2 sources

            case 20: {
                var7_2 /* !! */  = (int)hi.dmsl("dnyw", dmsv(int ), (int)383);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl329
            }
            case 21: {
                var7_2 /* !! */  = (int)hi.dmsl("dnyx", dmsv(int ), (int)384);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl333
            }
lbl329:
            // 2 sources

            case 22: {
                var7_2 /* !! */  = (int)hi.dmsl("dnyy", dmsv(int ), (int)385);
                if (!var8_1) ** GOTO lbl319
                throw null;
            }
lbl333:
            // 2 sources

            case 23: {
                var7_2 /* !! */  = (int)hi.dmsl("dnyz", dmsv(int ), (int)386);
                if (!var8_1) ** GOTO lbl302
                throw null;
            }
lbl337:
            // 5 sources

            case 24: {
                var7_2 /* !! */  = (int)hi.dmsl("dnza", dmsv(int ), (int)387);
                if (var8_1) {
                    throw null;
                }
            }
lbl341:
            // 5 sources

            case 25: {
                var7_2 /* !! */  = (int)hi.dmsl("dnzb", dmsv(int ), (int)388);
                if (!var8_1) ** GOTO lbl259
                throw null;
            }
            case 26: 
        }
        var7_2 /* !! */  = (int)hi.dmsl("dnzc", dmsv(int ), (int)389);
        ** while (!var8_1)
lbl348:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dtmy() {
        hi.dmtt[300] = -2386012265609146173L;
        hi.dmtt[301] = 4979097437789561249L;
        hi.dmtt[302] = 2464886340077200792L;
        hi.dmtt[303] = 3066887518218145565L;
        hi.dmtt[304] = -5070364920299000587L;
        hi.dmtt[305] = -5718038657825158850L;
        hi.dmtt[306] = -8795733647752142505L;
        hi.dmtt[307] = -1578585795080064548L;
        hi.dmtt[308] = 6726995275537428067L;
        hi.dmtt[309] = 3430393408446011665L;
        hi.dmtt[310] = 5527924541365751561L;
        hi.dmtt[311] = -3091286886198295684L;
        hi.dmtt[312] = 1645895234248695216L;
        hi.dmtt[313] = 3995335322693722184L;
        hi.dmtt[314] = -9097953526185495699L;
        hi.dmtt[315] = 1462950957970360011L;
        hi.dmtt[316] = 9065051560042951341L;
        hi.dmtt[317] = 8188652254767478487L;
        hi.dmtt[318] = -3184049852907868578L;
        hi.dmtt[319] = -4303054672500152320L;
        hi.dmtt[320] = -983542741562461293L;
        hi.dmtt[321] = 5674007220618773660L;
        hi.dmtt[322] = 4541735491693581762L;
        hi.dmtt[323] = 8684016369854460394L;
        hi.dmtt[324] = -1360848071372022407L;
        hi.dmtt[325] = -6504692008127707407L;
        hi.dmtt[326] = 6464675639731255738L;
        hi.dmtt[327] = -6409843296103038889L;
        hi.dmtt[328] = -5441189315272130130L;
        hi.dmtt[329] = 957611325263795152L;
        hi.dmtt[330] = -168513800770418918L;
        hi.dmtt[331] = 7318716658314254817L;
        hi.dmtt[332] = -1555819251303951488L;
        hi.dmtt[333] = -321334171581889421L;
        hi.dmtt[334] = -4763650463616056194L;
        hi.dmtt[335] = -4531166465452643720L;
        hi.dmtt[336] = -1478584130616563926L;
        hi.dmtt[337] = 7606476888356361091L;
        hi.dmtt[338] = -7795469816667602286L;
        hi.dmtt[339] = -2110141157320511276L;
        hi.dmtt[340] = 5438802293650375899L;
        hi.dmtt[341] = 919337616413969066L;
        hi.dmtt[342] = 7684078235397686930L;
        hi.dmtt[343] = -1486760437812752794L;
        hi.dmtt[344] = 1051958961021489981L;
        hi.dmtt[345] = 1334197326086004102L;
        hi.dmtt[346] = 1384377794956880520L;
        hi.dmtt[347] = -1199977668616558421L;
        hi.dmtt[348] = -5221366134319321311L;
        hi.dmtt[349] = -2707464972052953312L;
        hi.dmtt[350] = 4283760965275713334L;
        hi.dmtt[351] = 6104404530962298941L;
        hi.dmtt[352] = 4616513087435344298L;
        hi.dmtt[353] = -8648410796051754773L;
        hi.dmtt[354] = -8563796082923488112L;
        hi.dmtt[355] = -6666352483953930731L;
        hi.dmtt[356] = 3697647883274892558L;
        hi.dmtt[357] = -4856197575446520762L;
        hi.dmtt[358] = -6637125190601608505L;
        hi.dmtt[359] = -4996470215696134L;
        hi.dmtt[360] = -4531185471005364287L;
        hi.dmtt[361] = -6207045969662741524L;
        hi.dmtt[362] = -1095492623147627029L;
        hi.dmtt[363] = 1660039984003534606L;
        hi.dmtt[364] = -5897720323577518114L;
        hi.dmtt[365] = 563926746380782850L;
        hi.dmtt[366] = 4455419936221310096L;
        hi.dmtt[367] = -8497197990448560575L;
        hi.dmtt[368] = 6953279667499823199L;
        hi.dmtt[369] = 7910415385240292061L;
        hi.dmtt[370] = 5088278870955119286L;
        hi.dmtt[371] = -3220064799488058308L;
        hi.dmtt[372] = 7318212361344705207L;
        hi.dmtt[373] = 3364394750207508350L;
        hi.dmtt[374] = -8215977114226933830L;
        hi.dmtt[375] = 7165953888597730980L;
        hi.dmtt[376] = -8281627834440676409L;
        hi.dmtt[377] = -3245008381357243757L;
        hi.dmtt[378] = 712374611606067392L;
        hi.dmtt[379] = 2375424484588553234L;
        hi.dmtt[380] = 117297903452153658L;
        hi.dmtt[381] = -7335585601491729876L;
        hi.dmtt[382] = -7051254204222262792L;
        hi.dmtt[383] = 2927491778403368234L;
        hi.dmtt[384] = -7819765782509115451L;
        hi.dmtt[385] = 6572053426320462256L;
        hi.dmtt[386] = 7601076716682017055L;
        hi.dmtt[387] = 7723129690213022652L;
        hi.dmtt[388] = 6213244974050346773L;
        hi.dmtt[389] = -4986189632343534100L;
        hi.dmtt[390] = 6208239840276072313L;
        hi.dmtt[391] = 475088767333022578L;
        hi.dmtt[392] = -8492623793275465055L;
        hi.dmtt[393] = -5603781673975531569L;
        hi.dmtt[394] = 4236595652502691969L;
        hi.dmtt[395] = 6862459897265632709L;
        hi.dmtt[396] = -8991644157507418944L;
        hi.dmtt[397] = -8370768108684240606L;
        hi.dmtt[398] = -3707302343070620441L;
        hi.dmtt[399] = -7721138929553877342L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        v0 /* !! */  = hi.ib;
        if (true) ** GOTO lbl5
        block41: while (true) {
            v0 /* !! */  = (long)(v1 - hi.dmsl("drqw", dmts(int ), (int)685));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -873604283: {
                    v1 = hi.dmsl("drqx", dmts(int ), (int)686);
                    continue block41;
                }
                case 1228545173: {
                    break block41;
                }
                case 1964625704: {
                    v1 = hi.dmsl("drqy", dmts(int ), (int)687);
                    continue block41;
                }
            }
            break;
        }
        var3_1 = hi.c;
        v2 /* !! */  = hi.ib;
        if (true) ** GOTO lbl19
        block42: while (true) {
            v2 /* !! */  = (long)(v3 - hi.dmsl("drqz", dmts(int ), (int)688));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1513269021: {
                    v3 = hi.dmsl("drra", dmts(int ), (int)689);
                    continue block42;
                }
                case 1228545173: {
                    break block42;
                }
                case 1996789201: {
                    v3 = hi.dmsl("drrb", dmts(int ), (int)690);
                    continue block42;
                }
            }
            break;
        }
        var2_2 /* !! */  = hi.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = hi.ib - hi.dmsl("drrc", dmts(int ), (int)691)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == hi.dmsl("drrd", dmsv(int ), (int)1583)) break;
            v4 /* !! */  = (long)hi.dmsl("drre", dmsv(int ), (int)1584);
        }
        var1_3 = hi.a;
        if (var3_1) {
            throw null;
lbl37:
            // 10 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl37
        v5 /* !! */  = hi.ib;
        if (true) ** GOTO lbl44
        block45: while (true) {
            v5 /* !! */  = (long)(hi.dmsl("drrg", dmts(int ), (int)693) - hi.dmsl("drrf", dmts(int ), (int)692));
lbl44:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1742925610: {
                    continue block45;
                }
                case 1228545173: {
                    break block45;
                }
            }
            break;
        }
        nz.cancelSwap("AutoTotem");
        if (var1_3 || var1_3) ** GOTO lbl37
        v6 = hi.dmsl("drrh", dmsv(int ), (int)1585);
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_1 = hi.ib - hi.dmsl("drri", dmts(int ), (int)694)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == hi.dmsl("drrj", dmsv(int ), (int)1586)) break;
            v7 /* !! */  = (long)hi.dmsl("drrk", dmsv(int ), (int)1587);
        }
        this.totemSlot = (int)v6;
        if (var1_3 || var1_3) ** GOTO lbl37
        v8 = hi.dmsl("drrl", dmsv(int ), (int)1588);
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_2 = hi.ib - hi.dmsl("drrm", dmts(int ), (int)695)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == hi.dmsl("drrn", dmsv(int ), (int)1589)) break;
            v9 /* !! */  = (long)hi.dmsl("drro", dmsv(int ), (int)1590);
        }
        this.rememberedItemSlot = (int)v8;
        if (var1_3 || var1_3) ** GOTO lbl37
        v10 = hi.dmsl("drrp", dmsv(int ), (int)1591);
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_3 = hi.ib - hi.dmsl("drrq", dmts(int ), (int)696)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == hi.dmsl("drrr", dmsv(int ), (int)1592)) break;
            v11 /* !! */  = (long)hi.dmsl("drrs", dmsv(int ), (int)1593);
        }
        this.revertSucceeded = v10;
        if (var1_3 || var1_3) ** GOTO lbl37
        v12 = hi.dmsl("drrt", dmsv(int ), (int)1594);
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_4 = hi.ib - hi.dmsl("drru", dmts(int ), (int)697)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == hi.dmsl("drrv", dmsv(int ), (int)1595)) break;
            v13 /* !! */  = (long)hi.dmsl("drrw", dmsv(int ), (int)1596);
        }
        this.awaitingInitialDisplacement = v12;
        if (var1_3 || var1_3) ** GOTO lbl37
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_5 = hi.ib - hi.dmsl("drrx", dmts(int ), (int)698)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == hi.dmsl("drry", dmsv(int ), (int)1597)) break;
            v14 /* !! */  = (long)hi.dmsl("drrz", dmsv(int ), (int)1598);
        }
        this.clearPlacementConfirmation();
        if (var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl37
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_6 = hi.ib - hi.dmsl("drsa", dmts(int ), (int)699)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == hi.dmsl("drsb", dmsv(int ), (int)1599)) break;
                    v15 /* !! */  = (long)hi.dmsl("drsc", dmsv(int ), (int)1600);
                }
                this.clearPendingRevertConfirmation();
                if (var1_3 || var1_3) ** GOTO lbl37
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_7 = hi.ib - hi.dmsl("drsd", dmts(int ), (int)700)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == hi.dmsl("drse", dmsv(int ), (int)1601)) break;
                    v16 /* !! */  = (long)hi.dmsl("drsf", dmsv(int ), (int)1602);
                }
                v17 /* !! */  = hi.ib;
                if (true) ** GOTO lbl110
                block53: while (true) {
                    v17 /* !! */  = (long)(v18 - hi.dmsl("drsg", dmts(int ), (int)701));
lbl110:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -1269360395: {
                            v18 = hi.dmsl("drsh", dmts(int ), (int)702);
                            continue block53;
                        }
                        case 1228545173: {
                            break block53;
                        }
                        case 1281530979: {
                            v18 = hi.dmsl("drsi", dmts(int ), (int)703);
                            continue block53;
                        }
                    }
                    break;
                }
                this.itemHistory.clear();
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)hi.dmsl("drsj", dmsv(int ), (int)1603);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl167
            }
            case 1: {
                var2_2 /* !! */  = (int)hi.dmsl("drsk", dmsv(int ), (int)1604);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl157
            }
            case 2: {
                var2_2 /* !! */  = (int)hi.dmsl("drsl", dmsv(int ), (int)1605);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl171
            }
lbl138:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)hi.dmsl("drsm", dmsv(int ), (int)1606);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl205
            }
            case 4: {
                var2_2 /* !! */  = (int)hi.dmsl("drsn", dmsv(int ), (int)1607);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl148:
            // 2 sources

            case 5: {
                do {
                    var2_2 /* !! */  = (int)hi.dmsl("drso", dmsv(int ), (int)1608);
                } while (!var3_1);
                throw null;
            }
lbl153:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)hi.dmsl("drsp", dmsv(int ), (int)1609);
                if (!var3_1) break;
                throw null;
            }
lbl157:
            // 3 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hi.dmsl("drsq", dmsv(int ), (int)1610);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl184
                    break;
                }
            }
            case 8: {
                var2_2 /* !! */  = (int)hi.dmsl("drsr", dmsv(int ), (int)1611);
                if (!var3_1) ** GOTO lbl157
                throw null;
            }
lbl167:
            // 3 sources

            case 9: {
                var2_2 /* !! */  = (int)hi.dmsl("drss", dmsv(int ), (int)1612);
                if (!var3_1) ** GOTO lbl138
                throw null;
            }
lbl171:
            // 3 sources

            case 10: {
                var2_2 /* !! */  = (int)hi.dmsl("drst", dmsv(int ), (int)1613);
                if (!var3_1) break;
                throw null;
            }
lbl175:
            // 3 sources

            case 11: {
                var2_2 /* !! */  = (int)hi.dmsl("drsu", dmsv(int ), (int)1614);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl201
            }
            case 12: {
                var2_2 /* !! */  = (int)hi.dmsl("drsv", dmsv(int ), (int)1615);
                if (!var3_1) ** GOTO lbl175
                throw null;
            }
lbl184:
            // 2 sources

            case 13: {
                do {
                    var2_2 /* !! */  = (int)hi.dmsl("drsw", dmsv(int ), (int)1616);
                } while (!var3_1);
                throw null;
            }
            case 14: {
                var2_2 /* !! */  = (int)hi.dmsl("drsx", dmsv(int ), (int)1617);
                if (!var3_1) ** GOTO lbl148
                throw null;
            }
            case 15: {
                var2_2 /* !! */  = (int)hi.dmsl("drsy", dmsv(int ), (int)1618);
                if (!var3_1) ** GOTO lbl167
                throw null;
            }
lbl197:
            // 2 sources

            case 16: {
                var2_2 /* !! */  = (int)hi.dmsl("drsz", dmsv(int ), (int)1619);
                if (!var3_1) ** GOTO lbl175
                throw null;
            }
lbl201:
            // 2 sources

            case 17: {
                var2_2 /* !! */  = (int)hi.dmsl("drta", dmsv(int ), (int)1620);
                if (!var3_1) ** GOTO lbl171
                throw null;
            }
lbl205:
            // 2 sources

            case 18: {
                var2_2 /* !! */  = (int)hi.dmsl("drtb", dmsv(int ), (int)1621);
                if (!var3_1) ** GOTO lbl153
                throw null;
            }
            case 19: 
        }
        var2_2 /* !! */  = (int)hi.dmsl("drtc", dmsv(int ), (int)1622);
        ** while (!var3_1)
lbl212:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dtma() {
        hi.dmsj[1500] = 1449313293;
        hi.dmsj[1501] = -2105083794;
        hi.dmsj[1502] = -1968360012;
        hi.dmsj[1503] = -645211524;
        hi.dmsj[1504] = 398355328;
        hi.dmsj[1505] = -772583793;
        hi.dmsj[1506] = 8154410;
        hi.dmsj[1507] = -199084310;
        hi.dmsj[1508] = 1967537295;
        hi.dmsj[1509] = 1940459047;
        hi.dmsj[1510] = -929645446;
        hi.dmsj[1511] = 567705492;
        hi.dmsj[1512] = -342907200;
        hi.dmsj[1513] = -774705521;
        hi.dmsj[1514] = -1648864616;
        hi.dmsj[1515] = 1652386548;
        hi.dmsj[1516] = -1905168092;
        hi.dmsj[1517] = 1080972753;
        hi.dmsj[1518] = 2108555247;
        hi.dmsj[1519] = 321000139;
        hi.dmsj[1520] = -2055505531;
        hi.dmsj[1521] = 1140357056;
        hi.dmsj[1522] = 1231514156;
        hi.dmsj[1523] = 1706916890;
        hi.dmsj[1524] = -1576694641;
        hi.dmsj[1525] = -268002455;
        hi.dmsj[1526] = 217130296;
        hi.dmsj[1527] = -1677956654;
        hi.dmsj[1528] = 1093900940;
        hi.dmsj[1529] = 686794602;
        hi.dmsj[1530] = 1209744188;
        hi.dmsj[1531] = 54675192;
        hi.dmsj[1532] = -166220772;
        hi.dmsj[1533] = -1488985198;
        hi.dmsj[1534] = 1170051740;
        hi.dmsj[1535] = -1872104398;
        hi.dmsj[1536] = 851906642;
        hi.dmsj[1537] = 1884649974;
        hi.dmsj[1538] = 956764205;
        hi.dmsj[1539] = -1790995085;
        hi.dmsj[1540] = -61703139;
        hi.dmsj[1541] = -526687512;
        hi.dmsj[1542] = 1568641289;
        hi.dmsj[1543] = -2059399677;
        hi.dmsj[1544] = 274375756;
        hi.dmsj[1545] = -401770542;
        hi.dmsj[1546] = -2049331206;
        hi.dmsj[1547] = 1293353448;
        hi.dmsj[1548] = 1956170287;
        hi.dmsj[1549] = 1203889402;
        hi.dmsj[1550] = 2132029161;
        hi.dmsj[1551] = -795199282;
        hi.dmsj[1552] = 1371127981;
        hi.dmsj[1553] = 1621657498;
        hi.dmsj[1554] = -1135066903;
        hi.dmsj[1555] = 1910217584;
        hi.dmsj[1556] = -2037872695;
        hi.dmsj[1557] = 1071986854;
        hi.dmsj[1558] = 1669939943;
        hi.dmsj[1559] = -1726925493;
        hi.dmsj[1560] = -663115867;
        hi.dmsj[1561] = 81636718;
        hi.dmsj[1562] = -1795355272;
        hi.dmsj[1563] = 1619156686;
        hi.dmsj[1564] = 1960735993;
        hi.dmsj[1565] = 1072206096;
        hi.dmsj[1566] = 2039910053;
        hi.dmsj[1567] = -1532719812;
        hi.dmsj[1568] = -2016763964;
        hi.dmsj[1569] = 875315297;
        hi.dmsj[1570] = -1997495438;
        hi.dmsj[1571] = 480630853;
        hi.dmsj[1572] = 1378736509;
        hi.dmsj[1573] = -1579556373;
        hi.dmsj[1574] = 1957813854;
        hi.dmsj[1575] = 1552628575;
        hi.dmsj[1576] = -1487736363;
        hi.dmsj[1577] = 1772688455;
        hi.dmsj[1578] = 306168029;
        hi.dmsj[1579] = 409255464;
        hi.dmsj[1580] = -720484900;
        hi.dmsj[1581] = 1789953224;
        hi.dmsj[1582] = -1600835886;
        hi.dmsj[1583] = 1582950020;
        hi.dmsj[1584] = -1314767253;
        hi.dmsj[1585] = -1411747369;
        hi.dmsj[1586] = -1864302900;
        hi.dmsj[1587] = 2100721362;
        hi.dmsj[1588] = 633566905;
        hi.dmsj[1589] = 2077986739;
        hi.dmsj[1590] = 1182467042;
        hi.dmsj[1591] = 665964734;
        hi.dmsj[1592] = -1585530065;
        hi.dmsj[1593] = 219000613;
        hi.dmsj[1594] = -407402692;
        hi.dmsj[1595] = 2059906840;
        hi.dmsj[1596] = -588782755;
        hi.dmsj[1597] = 2093492975;
        hi.dmsj[1598] = 502974171;
        hi.dmsj[1599] = 1665661639;
    }

    private static /* synthetic */ void dtsi() {
        hi.dmtu[500] = 7745783380880375578L;
        hi.dmtu[501] = -3199791881756483111L;
        hi.dmtu[502] = 3371825730552266980L;
        hi.dmtu[503] = 5025963959109111729L;
        hi.dmtu[504] = 3608025918500925847L;
        hi.dmtu[505] = -4767151218937294884L;
        hi.dmtu[506] = -8378301195866761064L;
        hi.dmtu[507] = 7449578397833680378L;
        hi.dmtu[508] = 4082661921157291720L;
        hi.dmtu[509] = 1152968965484854425L;
        hi.dmtu[510] = 334408762892535134L;
        hi.dmtu[511] = -884844143550276363L;
        hi.dmtu[512] = -8612150332271524932L;
        hi.dmtu[513] = -244073234471557608L;
        hi.dmtu[514] = -6857053941362462204L;
        hi.dmtu[515] = 7255922043698716635L;
        hi.dmtu[516] = 2227373697262557960L;
        hi.dmtu[517] = 7437679475685644764L;
        hi.dmtu[518] = -5798789650172338527L;
        hi.dmtu[519] = -8791191211257705853L;
        hi.dmtu[520] = -7320088460975476988L;
        hi.dmtu[521] = -4296137394174516883L;
        hi.dmtu[522] = 5730299565035324759L;
        hi.dmtu[523] = -6806030112969152741L;
        hi.dmtu[524] = 8978567519325000485L;
        hi.dmtu[525] = -2630700515374835853L;
        hi.dmtu[526] = 2974120705223172103L;
        hi.dmtu[527] = -9000469812153350778L;
        hi.dmtu[528] = -360532784539316694L;
        hi.dmtu[529] = 47143841541360623L;
        hi.dmtu[530] = 4327284121319119757L;
        hi.dmtu[531] = 5542137646277782616L;
        hi.dmtu[532] = 1268092464142535893L;
        hi.dmtu[533] = -4966902295258298416L;
        hi.dmtu[534] = 8893757921870325004L;
        hi.dmtu[535] = -6010045223284310850L;
        hi.dmtu[536] = -889648239701253992L;
        hi.dmtu[537] = 6180674577003144070L;
        hi.dmtu[538] = 7815099415837445572L;
        hi.dmtu[539] = 8356119298935354640L;
        hi.dmtu[540] = 5135751929954876995L;
        hi.dmtu[541] = 543302929226646001L;
        hi.dmtu[542] = 8102430335442042417L;
        hi.dmtu[543] = 4642353437611387802L;
        hi.dmtu[544] = 5965605599815483022L;
        hi.dmtu[545] = -5936571332392912174L;
        hi.dmtu[546] = 3978833395478719714L;
        hi.dmtu[547] = 3015636330538284959L;
        hi.dmtu[548] = -3109224215571410496L;
        hi.dmtu[549] = 1756106253488433529L;
        hi.dmtu[550] = 2074209606818294244L;
        hi.dmtu[551] = 3254893623570109429L;
        hi.dmtu[552] = 9144298264967298622L;
        hi.dmtu[553] = 6699798244333815969L;
        hi.dmtu[554] = -5418417557362536438L;
        hi.dmtu[555] = 1456409473756810868L;
        hi.dmtu[556] = -260414723979347422L;
        hi.dmtu[557] = 2372946244334973850L;
        hi.dmtu[558] = -2280612254106260916L;
        hi.dmtu[559] = 5435688180029369821L;
        hi.dmtu[560] = -4796903956340781969L;
        hi.dmtu[561] = 5989183989727804150L;
        hi.dmtu[562] = 8049482455857410279L;
        hi.dmtu[563] = 5241669403696916420L;
        hi.dmtu[564] = -2890359665411428588L;
        hi.dmtu[565] = -8911014523062136352L;
        hi.dmtu[566] = -6896039554829981211L;
        hi.dmtu[567] = -2611641748457045369L;
        hi.dmtu[568] = 8008428082083649625L;
        hi.dmtu[569] = -3247748787685684931L;
        hi.dmtu[570] = -9055312211593313982L;
        hi.dmtu[571] = 8667476707979665462L;
        hi.dmtu[572] = 8910187258509020799L;
        hi.dmtu[573] = -5782384101399953743L;
        hi.dmtu[574] = -4415853556284291488L;
        hi.dmtu[575] = -3601970752958573949L;
        hi.dmtu[576] = 4788291198950512655L;
        hi.dmtu[577] = -7429478332710466857L;
        hi.dmtu[578] = 98096871006006641L;
        hi.dmtu[579] = 8366717071782838746L;
        hi.dmtu[580] = 6605476870002775902L;
        hi.dmtu[581] = -1103924612296030170L;
        hi.dmtu[582] = 1653132270982356442L;
        hi.dmtu[583] = 8312962663512101663L;
        hi.dmtu[584] = -7566726778210577055L;
        hi.dmtu[585] = 4833021897890751992L;
        hi.dmtu[586] = 1593550271510132004L;
        hi.dmtu[587] = -792188250087470621L;
        hi.dmtu[588] = -2958325126412619479L;
        hi.dmtu[589] = 4583592282459945378L;
        hi.dmtu[590] = -7427237877850920263L;
        hi.dmtu[591] = -4787316927202057214L;
        hi.dmtu[592] = -8288632786772532412L;
        hi.dmtu[593] = 1218081753485166594L;
        hi.dmtu[594] = -2918541368205600092L;
        hi.dmtu[595] = 2527433151020170408L;
        hi.dmtu[596] = -9202498840729405120L;
        hi.dmtu[597] = 2004644871915780482L;
        hi.dmtu[598] = 5066359730756566375L;
        hi.dmtu[599] = -8665183228331589447L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void cleanupAfterRevert() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = hi.ib - hi.dmsl("dreb", dmts(int ), (int)555)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == hi.dmsl("drec", dmsv(int ), (int)1446)) break;
            v0 /* !! */  = (long)hi.dmsl("dred", dmsv(int ), (int)1447);
        }
        var3_1 = hi.c;
        while (true) {
            block84: {
                if ((v1 /* !! */  = (cfr_temp_2 = hi.ib - hi.dmsl("dree", dmts(int ), (int)556)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  != hi.dmsl("dref", dmsv(int ), (int)1448)) break block84;
                var2_2 /* !! */  = hi.b;
                v2 /* !! */  = hi.ib;
                if (true) ** GOTO lbl18
            }
            v1 /* !! */  = (long)hi.dmsl("dreg", dmsv(int ), (int)1449);
        }
        block50: while (true) {
            v2 /* !! */  = (long)(v3 - hi.dmsl("dreh", dmts(int ), (int)557));
lbl18:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1950783387: {
                    v3 = hi.dmsl("drei", dmts(int ), (int)558);
                    continue block50;
                }
                case -596296556: {
                    v3 = hi.dmsl("drej", dmts(int ), (int)559);
                    continue block50;
                }
                case 1228545173: {
                    break block50;
                }
            }
            break;
        }
        var1_3 = hi.a;
        if (var3_1) {
            throw null;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block51: while (true) {
            block85: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_3 || var1_3) return;
                        v4 = hi.dmsl("drek", dmsv(int ), (int)1450);
                        v5 /* !! */  = hi.ib;
                        block52: while (true) {
                            switch ((int)v5 /* !! */ ) {
                                case -1658027486: {
                                    v6 = hi.dmsl("drem", dmts(int ), (int)561);
                                    ** GOTO lbl50
                                }
                                case 1228545173: {
                                    break block52;
                                }
                                case 1503876890: {
                                    v6 = hi.dmsl("dren", dmts(int ), (int)562);
                                    ** GOTO lbl50
                                }
                                case 1987282181: {
                                    v6 = hi.dmsl("dreo", dmts(int ), (int)563);
lbl50:
                                    // 3 sources

                                    v5 /* !! */  = (long)(v6 - hi.dmsl("drel", dmts(int ), (int)560));
                                    continue block52;
                                }
                            }
                            break;
                        }
                        this.totemSlot = (int)v4;
                        if (var1_3 || var1_3) return;
                        v7 /* !! */  = hi.ib;
                        block53: while (true) {
                            switch ((int)v7 /* !! */ ) {
                                case -814358237: {
                                    v7 /* !! */  = (long)(hi.dmsl("dreq", dmts(int ), (int)565) - hi.dmsl("drep", dmts(int ), (int)564));
                                    continue block53;
                                }
                                case 1228545173: {
                                    break block53;
                                }
                            }
                            break;
                        }
                        while (true) {
                            if ((v8 /* !! */  = (cfr_temp_3 = hi.ib - hi.dmsl("drer", dmts(int ), (int)566)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v8 /* !! */  != hi.dmsl("dres", dmsv(int ), (int)1451)) ** GOTO lbl68
                            if (!this.pendingRevertItem.method_7960()) {
                                break;
                            }
                            ** GOTO lbl182
lbl68:
                            // 1 sources

                            v8 /* !! */  = (long)hi.dmsl("dret", dmsv(int ), (int)1452);
                        }
                        if (var1_3) return;
                        v9 /* !! */  = hi.ib;
                        block55: while (true) {
                            switch ((int)v9 /* !! */ ) {
                                case -892117903: {
                                    v9 /* !! */  = (long)(hi.dmsl("drev", dmts(int ), (int)568) - hi.dmsl("dreu", dmts(int ), (int)567));
                                    continue block55;
                                }
                                case 1228545173: {
                                    break block55;
                                }
                            }
                            break;
                        }
                        if (this.pendingRevertSourceSlot == hi.dmsl("drew", dmsv(int ), (int)1453)) ** GOTO lbl182
                        if (var1_3 || var1_3) return;
                        v10 = hi.dmsl("drex", dmsv(int ), (int)1454);
                        while (true) {
                            if ((v11 /* !! */  = (cfr_temp_4 = hi.ib - hi.dmsl("drey", dmts(int ), (int)569)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                            if (v11 /* !! */  == hi.dmsl("drez", dmsv(int ), (int)1455)) {
                                this.revertAwaitingConfirmation = v10;
                                if (var1_3) return;
                                break;
                            }
                            v11 /* !! */  = (long)hi.dmsl("drfa", dmsv(int ), (int)1456);
                        }
                        if (var1_3) return;
                        while (true) {
                            if ((v12 /* !! */  = (cfr_temp_5 = hi.ib - hi.dmsl("drfb", dmts(int ), (int)570)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                            if (v12 /* !! */  != hi.dmsl("drfc", dmsv(int ), (int)1457)) ** GOTO lbl96
                            v13 = System.currentTimeMillis();
                            ** GOTO lbl161
lbl96:
                            // 1 sources

                            v12 /* !! */  = (long)hi.dmsl("drfd", dmsv(int ), (int)1458);
                        }
                    }
                    case 1: {
                        ** GOTO lbl156
                    }
                    case 6: {
                        var2_2 /* !! */  = (int)hi.dmsl("drfv", dmsv(int ), (int)1468);
                        cfr_temp_0 = 5;
                        if (var3_1) {
                            throw null;
                        }
                        break block85;
                    }
                    case 7: {
                        var2_2 /* !! */  = (int)hi.dmsl("drfw", dmsv(int ), (int)1469);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)hi.dmsl("drfs", dmsv(int ), (int)1465);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 5: {
                        var2_2 /* !! */  = (int)hi.dmsl("drfu", dmsv(int ), (int)1467);
                        cfr_temp_0 = 11;
                        if (var3_1) {
                            throw null;
                        }
                        break block85;
                    }
                    case 8: {
                        var2_2 /* !! */  = (int)hi.dmsl("drfx", dmsv(int ), (int)1470);
                        cfr_temp_0 = 9;
                        if (var3_1) {
                            throw null;
                        }
                        break block85;
                    }
                    case 10: {
                        var2_2 /* !! */  = (int)hi.dmsl("drfz", dmsv(int ), (int)1472);
                        cfr_temp_0 = 13;
                        if (var3_1) {
                            throw null;
                        }
                        break block85;
                    }
                    case 12: {
                        var2_2 /* !! */  = (int)hi.dmsl("drgb", dmsv(int ), (int)1474);
                        cfr_temp_0 = 11;
                        if (var3_1) {
                            throw null;
                        }
                        break block85;
                    }
                    case 14: {
                        var2_2 /* !! */  = (int)hi.dmsl("drgd", dmsv(int ), (int)1476);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)hi.dmsl("drfp", dmsv(int ), (int)1462);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 4: {
                        var2_2 /* !! */  = (int)hi.dmsl("drft", dmsv(int ), (int)1466);
                        cfr_temp_0 = 13;
                        if (var3_1) {
                            throw null;
                        }
                        break block85;
                    }
                    case 15: {
                        var2_2 /* !! */  = (int)hi.dmsl("drge", dmsv(int ), (int)1477);
                        if (var3_1) {
                            throw null;
                        }
lbl156:
                        // 3 sources

                        var2_2 /* !! */  = (int)hi.dmsl("drfq", dmsv(int ), (int)1463);
                        cfr_temp_0 = 13;
                        if (var3_1) {
                            throw null;
                        }
                        break block85;
                    }
lbl161:
                    // 1 sources

                    while (true) {
                        if ((v14 /* !! */  = (cfr_temp_6 = hi.ib - hi.dmsl("drfe", dmts(int ), (int)571)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v14 /* !! */  != hi.dmsl("drff", dmsv(int ), (int)1459)) ** GOTO lbl167
                        v15 = v13 + this.getServerConfirmationDelay();
                        v16 /* !! */  = hi.ib;
                        if (true) ** GOTO lbl171
lbl167:
                        // 1 sources

                        v14 /* !! */  = (long)hi.dmsl("drfg", dmsv(int ), (int)1460);
                    }
                    block59: while (true) {
                        v16 /* !! */  = (long)(v17 - hi.dmsl("drfh", dmts(int ), (int)572));
lbl171:
                        // 2 sources

                        switch ((int)v16 /* !! */ ) {
                            case 743656630: {
                                v17 = hi.dmsl("drfi", dmts(int ), (int)573);
                                continue block59;
                            }
                            case 1228545173: {
                                break block59;
                            }
                            case 2056351801: {
                                v17 = hi.dmsl("drfj", dmts(int ), (int)574);
                                continue block59;
                            }
                        }
                        break;
                    }
                    this.revertConfirmationAt = v15;
                    if (var1_3) return;
lbl182:
                    // 3 sources

                    if (var1_3 || var1_3) return;
                    v18 = hi.dmsl("drfk", dmsv(int ), (int)1461);
                    v19 /* !! */  = hi.ib;
                    if (true) ** GOTO lbl188
                    block60: while (true) {
                        v19 /* !! */  = (long)(v20 - hi.dmsl("drfl", dmts(int ), (int)575));
lbl188:
                        // 2 sources

                        switch ((int)v19 /* !! */ ) {
                            case -1830243773: {
                                v20 = hi.dmsl("drfm", dmts(int ), (int)576);
                                continue block60;
                            }
                            case -153561038: {
                                v20 = hi.dmsl("drfn", dmts(int ), (int)577);
                                continue block60;
                            }
                            case 1228545173: {
                                break block60;
                            }
                            case 1880548310: {
                                v20 = hi.dmsl("drfo", dmts(int ), (int)578);
                                continue block60;
                            }
                        }
                        break;
                    }
                    this.revertSucceeded = v18;
                    if (!var1_3 && !var1_3) return;
                    return;
                    case 2: {
                        var2_2 /* !! */  = (int)hi.dmsl("drfr", dmsv(int ), (int)1464);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 13: {
                        var2_2 /* !! */  = (int)hi.dmsl("drgc", dmsv(int ), (int)1475);
                        cfr_temp_0 = 2;
                        if (var3_1) {
                            throw null;
                        }
                        break block85;
                    }
                    case 9: {
                        var2_2 /* !! */  = (int)hi.dmsl("drfy", dmsv(int ), (int)1471);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 11: 
                }
                ** GOTO lbl222
            }
            do {
                if (true) continue block51;
lbl222:
                // 2 sources

                var2_2 /* !! */  = (int)hi.dmsl("drga", dmsv(int ), (int)1473);
                cfr_temp_0 = 9;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private oc createSwapSettings() {
        block146: {
            block145: {
                v0 /* !! */  = hi.ib;
                if (true) ** GOTO lbl5
                block102: while (true) {
                    v0 /* !! */  = (long)(v1 - hi.dmsl("dqtt", dmts(int ), (int)475));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1284774743: {
                            v1 = hi.dmsl("dqtu", dmts(int ), (int)476);
                            continue block102;
                        }
                        case -741869573: {
                            v1 = hi.dmsl("dqtv", dmts(int ), (int)477);
                            continue block102;
                        }
                        case 1228545173: {
                            break block102;
                        }
                    }
                    break;
                }
                var3_1 = hi.c;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_0 = hi.ib - hi.dmsl("dqtw", dmts(int ), (int)478)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == hi.dmsl("dqtx", dmsv(int ), (int)1357)) break;
                    v2 /* !! */  = (long)hi.dmsl("dqty", dmsv(int ), (int)1358);
                }
                var2_2 /* !! */  = hi.b;
                v3 /* !! */  = hi.ib;
                if (true) ** GOTO lbl25
                block104: while (true) {
                    v3 /* !! */  = (long)(v4 - hi.dmsl("dqtz", dmts(int ), (int)479));
lbl25:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1306184087: {
                            v4 = hi.dmsl("dqua", dmts(int ), (int)480);
                            continue block104;
                        }
                        case 235079258: {
                            v4 = hi.dmsl("dqub", dmts(int ), (int)481);
                            continue block104;
                        }
                        case 1228545173: {
                            break block104;
                        }
                    }
                    break;
                }
                var1_3 = hi.a;
                if (var3_1) {
                    throw null;
lbl37:
                    // 5 sources

                    return null;
                }
                if (var1_3 || var1_3) ** GOTO lbl37
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = hi.ib - hi.dmsl("dquc", dmts(int ), (int)482)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == hi.dmsl("dqud", dmsv(int ), (int)1359)) break;
                    v5 /* !! */  = (long)hi.dmsl("dque", dmsv(int ), (int)1360);
                }
                v6 /* !! */  = hi.ib;
                if (true) ** GOTO lbl49
                block107: while (true) {
                    v6 /* !! */  = (long)(v7 - hi.dmsl("dquf", dmts(int ), (int)483));
lbl49:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -804361220: {
                            v7 = hi.dmsl("dqug", dmts(int ), (int)484);
                            continue block107;
                        }
                        case 1228545173: {
                            break block107;
                        }
                        case 1782196094: {
                            v7 = hi.dmsl("dquh", dmts(int ), (int)485);
                            continue block107;
                        }
                    }
                    break;
                }
                if (!this.mode.isSelected("\u0411\u044b\u0441\u0442\u0440\u044b\u0439")) break block145;
                if (var1_3 || var1_3) ** GOTO lbl37
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = hi.ib - hi.dmsl("dqui", dmts(int ), (int)486)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == hi.dmsl("dquj", dmsv(int ), (int)1361)) break;
                    v8 /* !! */  = (long)hi.dmsl("dquk", dmsv(int ), (int)1362);
                }
                v9 = oc.instant();
                v10 = hi.dmsl("dqul", dmsv(int ), (int)1363);
                v11 /* !! */  = hi.ib;
                if (true) ** GOTO lbl71
                block109: while (true) {
                    v11 /* !! */  = (long)(v12 - hi.dmsl("dqum", dmts(int ), (int)487));
lbl71:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1960571824: {
                            v12 = hi.dmsl("dqun", dmts(int ), (int)488);
                            continue block109;
                        }
                        case 802149115: {
                            v12 = hi.dmsl("dquo", dmts(int ), (int)489);
                            continue block109;
                        }
                        case 1228545173: {
                            break block109;
                        }
                        case 1705055208: {
                            v12 = hi.dmsl("dqup", dmts(int ), (int)490);
                            continue block109;
                        }
                    }
                    break;
                }
                return v9.closeInventory((boolean)v10);
            }
            if (var1_3 || var1_3) ** GOTO lbl37
            v13 /* !! */  = hi.ib;
            if (true) ** GOTO lbl90
            block110: while (true) {
                v13 /* !! */  = (long)(hi.dmsl("dqur", dmts(int ), (int)492) - hi.dmsl("dquq", dmts(int ), (int)491));
lbl90:
                // 2 sources

                switch ((int)v13 /* !! */ ) {
                    case -1992791054: {
                        continue block110;
                    }
                    case 1228545173: {
                        break block110;
                    }
                }
                break;
            }
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_3 = hi.ib - hi.dmsl("dqus", dmts(int ), (int)493)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  == hi.dmsl("dqut", dmsv(int ), (int)1364)) break;
                v14 /* !! */  = (long)hi.dmsl("dquu", dmsv(int ), (int)1365);
            }
            if (!this.mode.isSelected("ReallyWorld")) break block146;
            if (var1_3 || var1_3) ** GOTO lbl37
            while (true) {
                if ((v15 /* !! */  = (cfr_temp_4 = hi.ib - hi.dmsl("dquv", dmts(int ), (int)494)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v15 /* !! */  == hi.dmsl("dquw", dmsv(int ), (int)1366)) break;
                v15 /* !! */  = (long)hi.dmsl("dqux", dmsv(int ), (int)1367);
            }
            while (true) {
                if ((v16 /* !! */  = (cfr_temp_5 = hi.ib - hi.dmsl("dquy", dmts(int ), (int)495)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v16 /* !! */  == hi.dmsl("dquz", dmsv(int ), (int)1368)) break;
                v16 /* !! */  = (long)hi.dmsl("dqva", dmsv(int ), (int)1369);
            }
            v17 = new oc();
            v18 = hi.dmsl("dqvb", dmsv(int ), (int)1370);
            v19 /* !! */  = hi.ib;
            if (true) ** GOTO lbl118
            block114: while (true) {
                v19 /* !! */  = (long)(v20 - hi.dmsl("dqvc", dmts(int ), (int)496));
lbl118:
                // 2 sources

                switch ((int)v19 /* !! */ ) {
                    case -638733299: {
                        v20 = hi.dmsl("dqvd", dmts(int ), (int)497);
                        continue block114;
                    }
                    case 1228545173: {
                        break block114;
                    }
                    case 1937338045: {
                        v20 = hi.dmsl("dqve", dmts(int ), (int)498);
                        continue block114;
                    }
                }
                break;
            }
            v21 = v17.stopMovement((boolean)v18);
            v22 = hi.dmsl("dqvf", dmsv(int ), (int)1371);
            while (true) {
                if ((v23 /* !! */  = (cfr_temp_6 = hi.ib - hi.dmsl("dqvg", dmts(int ), (int)499)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v23 /* !! */  == hi.dmsl("dqvh", dmsv(int ), (int)1372)) break;
                v23 /* !! */  = (long)hi.dmsl("dqvi", dmsv(int ), (int)1373);
            }
            v24 = v21.stopSprint((boolean)v22);
            v25 = hi.dmsl("dqvj", dmsv(int ), (int)1374);
            while (true) {
                if ((v26 /* !! */  = (cfr_temp_7 = hi.ib - hi.dmsl("dqvk", dmts(int ), (int)500)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v26 /* !! */  == hi.dmsl("dqvl", dmsv(int ), (int)1375)) break;
                v26 /* !! */  = (long)hi.dmsl("dqvm", dmsv(int ), (int)1376);
            }
            v27 = v24.closeInventory((boolean)v25);
            v28 = hi.dmsl("dqvn", dmsv(int ), (int)1377);
            v29 = hi.dmsl("dqvo", dmsv(int ), (int)1378);
            v30 /* !! */  = hi.ib;
            if (true) ** GOTO lbl148
            block117: while (true) {
                v30 /* !! */  = (long)(v31 - hi.dmsl("dqvp", dmts(int ), (int)501));
lbl148:
                // 2 sources

                switch ((int)v30 /* !! */ ) {
                    case -989798367: {
                        v31 = hi.dmsl("dqvq", dmts(int ), (int)502);
                        continue block117;
                    }
                    case -277157084: {
                        v31 = hi.dmsl("dqvr", dmts(int ), (int)503);
                        continue block117;
                    }
                    case 1228545173: {
                        break block117;
                    }
                }
                break;
            }
            v32 = v27.preStopDelay((int)v28, (int)v29);
            v33 = hi.dmsl("dqvs", dmsv(int ), (int)1379);
            v34 = hi.dmsl("dqvt", dmsv(int ), (int)1380);
            v35 /* !! */  = hi.ib;
            if (true) ** GOTO lbl164
            block118: while (true) {
                v35 /* !! */  = (long)(hi.dmsl("dqvv", dmts(int ), (int)505) - hi.dmsl("dqvu", dmts(int ), (int)504));
lbl164:
                // 2 sources

                switch ((int)v35 /* !! */ ) {
                    case -972299582: {
                        continue block118;
                    }
                    case 1228545173: {
                        break block118;
                    }
                }
                break;
            }
            v36 = v32.waitStopDelay((int)v33, (int)v34);
            v37 = hi.dmsl("dqvw", dmsv(int ), (int)1381);
            while (true) {
                if ((v38 /* !! */  = (cfr_temp_8 = hi.ib - hi.dmsl("dqvx", dmts(int ), (int)506)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v38 /* !! */  == hi.dmsl("dqvy", dmsv(int ), (int)1382)) break;
                v38 /* !! */  = (long)hi.dmsl("dqvz", dmsv(int ), (int)1383);
            }
            v39 = v36.minimumStopDelay((int)v37);
            v40 = hi.dmsl("dqwa", dmsv(int ), (int)1384);
            v41 = hi.dmsl("dqwb", dmsv(int ), (int)1385);
            v42 /* !! */  = hi.ib;
            if (true) ** GOTO lbl183
            block120: while (true) {
                v42 /* !! */  = (long)(v43 - hi.dmsl("dqwc", dmts(int ), (int)507));
lbl183:
                // 2 sources

                switch ((int)v42 /* !! */ ) {
                    case -1656435817: {
                        v43 = hi.dmsl("dqwd", dmts(int ), (int)508);
                        continue block120;
                    }
                    case -1074659976: {
                        v43 = hi.dmsl("dqwe", dmts(int ), (int)509);
                        continue block120;
                    }
                    case 1228545173: {
                        break block120;
                    }
                    case 1774100051: {
                        v43 = hi.dmsl("dqwf", dmts(int ), (int)510);
                        continue block120;
                    }
                }
                break;
            }
            v44 = v39.preSwapDelay((int)v40, (int)v41);
            v45 = hi.dmsl("dqwg", dmsv(int ), (int)1386);
            v46 = hi.dmsl("dqwh", dmsv(int ), (int)1387);
            v47 /* !! */  = hi.ib;
            if (true) ** GOTO lbl202
            block121: while (true) {
                v47 /* !! */  = (long)(v48 - hi.dmsl("dqwi", dmts(int ), (int)511));
lbl202:
                // 2 sources

                switch ((int)v47 /* !! */ ) {
                    case 280002413: {
                        v48 = hi.dmsl("dqwj", dmts(int ), (int)512);
                        continue block121;
                    }
                    case 729115799: {
                        v48 = hi.dmsl("dqwk", dmts(int ), (int)513);
                        continue block121;
                    }
                    case 1228545173: {
                        break block121;
                    }
                    case 1546191872: {
                        v48 = hi.dmsl("dqwl", dmts(int ), (int)514);
                        continue block121;
                    }
                }
                break;
            }
            v49 = v44.postSwapDelay((int)v45, (int)v46);
            v50 = hi.dmsl("dqwm", dmsv(int ), (int)1388);
            v51 = hi.dmsl("dqwn", dmsv(int ), (int)1389);
            v52 /* !! */  = hi.ib;
            if (true) ** GOTO lbl221
            block122: while (true) {
                v52 /* !! */  = (long)(v53 - hi.dmsl("dqwo", dmts(int ), (int)515));
lbl221:
                // 2 sources

                switch ((int)v52 /* !! */ ) {
                    case -2131115412: {
                        v53 = hi.dmsl("dqwp", dmts(int ), (int)516);
                        continue block122;
                    }
                    case -109811990: {
                        v53 = hi.dmsl("dqwq", dmts(int ), (int)517);
                        continue block122;
                    }
                    case 103911722: {
                        v53 = hi.dmsl("dqwr", dmts(int ), (int)518);
                        continue block122;
                    }
                    case 1228545173: {
                        break block122;
                    }
                }
                break;
            }
            return v49.resumeDelay((int)v50, (int)v51);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block57 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v54 /* !! */  = (cfr_temp_9 = hi.ib - hi.dmsl("dqws", dmts(int ), (int)519)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v54 /* !! */  == hi.dmsl("dqwt", dmsv(int ), (int)1390)) break;
                    v54 /* !! */  = (long)hi.dmsl("dqwu", dmsv(int ), (int)1391);
                }
                v55 /* !! */  = hi.ib;
                if (true) ** GOTO lbl248
                block124: while (true) {
                    v55 /* !! */  = (long)(v56 - hi.dmsl("dqwv", dmts(int ), (int)520));
lbl248:
                    // 2 sources

                    switch ((int)v55 /* !! */ ) {
                        case -1543952363: {
                            v56 = hi.dmsl("dqww", dmts(int ), (int)521);
                            continue block124;
                        }
                        case -1208703260: {
                            v56 = hi.dmsl("dqwx", dmts(int ), (int)522);
                            continue block124;
                        }
                        case 893466431: {
                            v56 = hi.dmsl("dqwy", dmts(int ), (int)523);
                            continue block124;
                        }
                        case 1228545173: {
                            break block124;
                        }
                    }
                    break;
                }
                v57 = new oc();
                v58 = hi.dmsl("dqwz", dmsv(int ), (int)1392);
                v59 /* !! */  = hi.ib;
                if (true) ** GOTO lbl266
                block125: while (true) {
                    v59 /* !! */  = (long)(hi.dmsl("dqxb", dmts(int ), (int)525) - hi.dmsl("dqxa", dmts(int ), (int)524));
lbl266:
                    // 2 sources

                    switch ((int)v59 /* !! */ ) {
                        case 1228545173: {
                            break block125;
                        }
                        case 1329840242: {
                            continue block125;
                        }
                    }
                    break;
                }
                v60 = v57.stopMovement((boolean)v58);
                v61 = hi.dmsl("dqxc", dmsv(int ), (int)1393);
                v62 /* !! */  = hi.ib;
                if (true) ** GOTO lbl277
                block126: while (true) {
                    v62 /* !! */  = (long)(hi.dmsl("dqxe", dmts(int ), (int)527) - hi.dmsl("dqxd", dmts(int ), (int)526));
lbl277:
                    // 2 sources

                    switch ((int)v62 /* !! */ ) {
                        case -52172027: {
                            continue block126;
                        }
                        case 1228545173: {
                            break block126;
                        }
                    }
                    break;
                }
                v63 = v60.stopSprint((boolean)v61);
                v64 = hi.dmsl("dqxf", dmsv(int ), (int)1394);
                while (true) {
                    if ((v65 /* !! */  = (cfr_temp_10 = hi.ib - hi.dmsl("dqxg", dmts(int ), (int)528)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v65 /* !! */  == hi.dmsl("dqxh", dmsv(int ), (int)1395)) break;
                    v65 /* !! */  = (long)hi.dmsl("dqxi", dmsv(int ), (int)1396);
                }
                v66 = v63.closeInventory((boolean)v64);
                v67 = hi.dmsl("dqxj", dmsv(int ), (int)1397);
                v68 = hi.dmsl("dqxk", dmsv(int ), (int)1398);
                v69 /* !! */  = hi.ib;
                if (true) ** GOTO lbl296
                block128: while (true) {
                    v69 /* !! */  = (long)(v70 - hi.dmsl("dqxl", dmts(int ), (int)529));
lbl296:
                    // 2 sources

                    switch ((int)v69 /* !! */ ) {
                        case -832388408: {
                            v70 = hi.dmsl("dqxm", dmts(int ), (int)530);
                            continue block128;
                        }
                        case 536841663: {
                            v70 = hi.dmsl("dqxn", dmts(int ), (int)531);
                            continue block128;
                        }
                        case 1228545173: {
                            break block128;
                        }
                        case 1829922270: {
                            v70 = hi.dmsl("dqxo", dmts(int ), (int)532);
                            continue block128;
                        }
                    }
                    break;
                }
                v71 = v66.preStopDelay((int)v67, (int)v68);
                v72 = hi.dmsl("dqxp", dmsv(int ), (int)1399);
                v73 = hi.dmsl("dqxq", dmsv(int ), (int)1400);
                v74 /* !! */  = hi.ib;
                if (true) ** GOTO lbl315
                block129: while (true) {
                    v74 /* !! */  = (long)(hi.dmsl("dqxs", dmts(int ), (int)534) - hi.dmsl("dqxr", dmts(int ), (int)533));
lbl315:
                    // 2 sources

                    switch ((int)v74 /* !! */ ) {
                        case 1228545173: {
                            break block129;
                        }
                        case 2007609348: {
                            continue block129;
                        }
                    }
                    break;
                }
                v75 = v71.waitStopDelay((int)v72, (int)v73);
                v76 = hi.dmsl("dqxt", dmsv(int ), (int)1401);
                while (true) {
                    if ((v77 /* !! */  = (cfr_temp_11 = hi.ib - hi.dmsl("dqxu", dmts(int ), (int)535)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v77 /* !! */  == hi.dmsl("dqxv", dmsv(int ), (int)1402)) break;
                    v77 /* !! */  = (long)hi.dmsl("dqxw", dmsv(int ), (int)1403);
                }
                v78 = v75.minimumStopDelay((int)v76);
                v79 = hi.dmsl("dqxx", dmsv(int ), (int)1404);
                v80 = hi.dmsl("dqxy", dmsv(int ), (int)1405);
                v81 /* !! */  = hi.ib;
                if (true) ** GOTO lbl334
                block131: while (true) {
                    v81 /* !! */  = (long)(v82 - hi.dmsl("dqxz", dmts(int ), (int)536));
lbl334:
                    // 2 sources

                    switch ((int)v81 /* !! */ ) {
                        case -1344469806: {
                            v82 = hi.dmsl("dqya", dmts(int ), (int)537);
                            continue block131;
                        }
                        case -1232750268: {
                            v82 = hi.dmsl("dqyb", dmts(int ), (int)538);
                            continue block131;
                        }
                        case 166684465: {
                            v82 = hi.dmsl("dqyc", dmts(int ), (int)539);
                            continue block131;
                        }
                        case 1228545173: {
                            break block131;
                        }
                    }
                    break;
                }
                v83 = v78.preSwapDelay((int)v79, (int)v80);
                v84 = hi.dmsl("dqyd", dmsv(int ), (int)1406);
                v85 = hi.dmsl("dqye", dmsv(int ), (int)1407);
                while (true) {
                    if ((v86 /* !! */  = (cfr_temp_12 = hi.ib - hi.dmsl("dqyf", dmts(int ), (int)540)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v86 /* !! */  == hi.dmsl("dqyg", dmsv(int ), (int)1408)) break;
                    v86 /* !! */  = (long)hi.dmsl("dqyh", dmsv(int ), (int)1409);
                }
                v87 = v83.postSwapDelay((int)v84, (int)v85);
                v88 = hi.dmsl("dqyi", dmsv(int ), (int)1410);
                v89 = hi.dmsl("dqyj", dmsv(int ), (int)1411);
                while (true) {
                    if ((v90 /* !! */  = (cfr_temp_13 = hi.ib - hi.dmsl("dqyk", dmts(int ), (int)541)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v90 /* !! */  == hi.dmsl("dqyl", dmsv(int ), (int)1412)) break;
                    v90 /* !! */  = (long)hi.dmsl("dqym", dmsv(int ), (int)1413);
                }
                v91 = v87.resumeDelay((int)v88, (int)v89);
                v92 = hi.dmsl("dqyo", dqyn(int ), (int)542);
                while (true) {
                    if ((v93 /* !! */  = (cfr_temp_14 = hi.ib - hi.dmsl("dqyp", dmts(int ), (int)543)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                    if (v93 /* !! */  == hi.dmsl("dqyq", dmsv(int ), (int)1414)) break;
                    v93 /* !! */  = (long)hi.dmsl("dqyr", dmsv(int ), (int)1415);
                }
                return v91.velocityThreshold((double)v92);
            }
lbl370:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)hi.dmsl("dqys", dmsv(int ), (int)1416);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl398
            }
lbl375:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)hi.dmsl("dqyt", dmsv(int ), (int)1417);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl389
            }
            case 2: {
                var2_2 /* !! */  = (int)hi.dmsl("dqyu", dmsv(int ), (int)1418);
                if (var3_1) {
                    throw null;
                }
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hi.dmsl("dqyv", dmsv(int ), (int)1419);
                    if (!var3_1) break block57;
                    throw null;
                }
            }
lbl389:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)hi.dmsl("dqyw", dmsv(int ), (int)1420);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl410
            }
lbl394:
            // 3 sources

            case 5: {
                var2_2 /* !! */  = (int)hi.dmsl("dqyx", dmsv(int ), (int)1421);
                if (!var3_1) ** GOTO lbl370
                throw null;
            }
lbl398:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)hi.dmsl("dqyy", dmsv(int ), (int)1422);
                if (!var3_1) ** GOTO lbl394
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)hi.dmsl("dqyz", dmsv(int ), (int)1423);
                if (!var3_1) ** GOTO lbl375
                throw null;
            }
lbl406:
            // 3 sources

            case 8: {
                var2_2 /* !! */  = (int)hi.dmsl("dqza", dmsv(int ), (int)1424);
                if (!var3_1) ** GOTO lbl394
                throw null;
            }
lbl410:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)hi.dmsl("dqzb", dmsv(int ), (int)1425);
                if (!var3_1) ** GOTO lbl406
                throw null;
            }
            case 10: {
                var2_2 /* !! */  = (int)hi.dmsl("dqzc", dmsv(int ), (int)1426);
                if (!var3_1) ** GOTO lbl375
                throw null;
            }
            case 11: {
                var2_2 /* !! */  = (int)hi.dmsl("dqzd", dmsv(int ), (int)1427);
                if (!var3_1) ** GOTO lbl406
                throw null;
            }
            case 12: 
        }
        var2_2 /* !! */  = (int)hi.dmsl("dqze", dmsv(int ), (int)1428);
        ** while (!var3_1)
lbl425:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private boolean hasTntMinecartNearby() {
        boolean bl2;
        Object object = ib;
        block13: while (true) {
            switch ((int)object) {
                case -1042103245: {
                    object = hi.dmsl("doho", dmts(int ), (int)172) - hi.dmsl("dohn", dmts(int ), (int)171);
                    continue block13;
                }
                case 1228545173: {
                    break block13;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = ib;
        boolean bl4 = true;
        block14: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - hi.dmsl("dohp", dmts(int ), (int)173);
            }
            switch ((int)object2) {
                case 275942332: {
                    callSite = hi.dmsl("dohq", dmts(int ), (int)174);
                    continue block14;
                }
                case 961419051: {
                    callSite = hi.dmsl("dohr", dmts(int ), (int)175);
                    continue block14;
                }
                case 1228545173: {
                    break block14;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = ib - hi.dmsl("dohs", dmts(int ), (int)176)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object3 == hi.dmsl("doht", dmsv(int ), (int)546)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = hi.dmsl("dohu", dmsv(int ), (int)547);
        }
        if (bl2) return (boolean)hi.dmsl("dohv", dmsv(int ), (int)548);
        if (bl2) return (boolean)hi.dmsl("dohv", dmsv(int ), (int)548);
        while (true) {
            long l3;
            Object object4;
            if ((object4 = (l3 = ib - hi.dmsl("dohw", dmts(int ), (int)177)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object4 == hi.dmsl("dohx", dmsv(int ), (int)549)) break;
            object4 = hi.dmsl("dohy", dmsv(int ), (int)550);
        }
        Predicate<class_1297> predicate = class_12972 -> {
            boolean bl2;
            Object object = ib;
            boolean bl3 = true;
            block5: while (true) {
                CallSite callSite;
                if (!bl3 || (bl3 = false) || !true) {
                    object = callSite - hi.dmsl("drtd", dmts(int ), (int)704);
                }
                switch ((int)object) {
                    case -2139228566: {
                        callSite = hi.dmsl("drte", dmts(int ), (int)705);
                        continue block5;
                    }
                    case -1325602587: {
                        callSite = hi.dmsl("drtf", dmts(int ), (int)706);
                        continue block5;
                    }
                    case 1228545173: {
                        break block5;
                    }
                }
                break;
            }
            boolean bl4 = c;
            while (true) {
                long l2;
                Object object2;
                if ((object2 = (l2 = ib - hi.dmsl("drtg", dmts(int ), (int)707)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
                if (object2 == hi.dmsl("drth", dmsv(int ), (int)1623)) break;
                object2 = hi.dmsl("drti", dmsv(int ), (int)1624);
            }
            int n2 = b;
            while (true) {
                long l3;
                Object object3;
                if ((object3 = (l3 = ib - hi.dmsl("drtj", dmts(int ), (int)708)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
                if (object3 == hi.dmsl("drtk", dmsv(int ), (int)1625)) {
                    bl2 = a;
                    if (bl4) {
                        throw null;
                    }
                    break;
                }
                object3 = hi.dmsl("drtl", dmsv(int ), (int)1626);
            }
            if (!bl2 && !bl2) return class_12972 instanceof class_1701;
            return (boolean)hi.dmsl("drtm", dmsv(int ), (int)1627);
        };
        while (true) {
            long l4;
            Object object5;
            if ((object5 = (l4 = ib - hi.dmsl("dohz", dmts(int ), (int)178)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object5 == hi.dmsl("doia", dmsv(int ), (int)551)) break;
            object5 = hi.dmsl("doib", dmsv(int ), (int)552);
        }
        while (true) {
            long l5;
            Object object6;
            if ((object6 = (l5 = ib - hi.dmsl("doic", dmts(int ), (int)179)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object6 == hi.dmsl("doid", dmsv(int ), (int)553)) break;
            object6 = hi.dmsl("doie", dmsv(int ), (int)554);
        }
        double d2 = this.tntMinecartDistance.getValue();
        Object object7 = ib;
        block19: while (true) {
            switch ((int)object7) {
                case 1228545173: {
                    return this.hasEntityNearby(predicate, d2);
                }
                case 1633620804: {
                    object7 = hi.dmsl("doig", dmts(int ), (int)181) - hi.dmsl("doif", dmts(int ), (int)180);
                    continue block19;
                }
            }
            break;
        }
        return this.hasEntityNearby(predicate, d2);
    }

    private static /* synthetic */ void dsgz() {
        hi.dmsj[1400] = -1903124769;
        hi.dmsj[1401] = 103851572;
        hi.dmsj[1402] = -1319268433;
        hi.dmsj[1403] = -483546318;
        hi.dmsj[1404] = -1797430901;
        hi.dmsj[1405] = 363769750;
        hi.dmsj[1406] = -551153849;
        hi.dmsj[1407] = 1393122171;
        hi.dmsj[1408] = -1513839887;
        hi.dmsj[1409] = -1203910522;
        hi.dmsj[1410] = -24921409;
        hi.dmsj[1411] = -5645743;
        hi.dmsj[1412] = 1046394782;
        hi.dmsj[1413] = 844783796;
        hi.dmsj[1414] = 440987371;
        hi.dmsj[1415] = 679392967;
        hi.dmsj[1416] = -1596626676;
        hi.dmsj[1417] = -1415184747;
        hi.dmsj[1418] = 1569325758;
        hi.dmsj[1419] = -1070175827;
        hi.dmsj[1420] = 1457303218;
        hi.dmsj[1421] = 950017988;
        hi.dmsj[1422] = -665335463;
        hi.dmsj[1423] = -377361154;
        hi.dmsj[1424] = 151864050;
        hi.dmsj[1425] = -1615840920;
        hi.dmsj[1426] = 324696987;
        hi.dmsj[1427] = -590469436;
        hi.dmsj[1428] = 1326004585;
        hi.dmsj[1429] = 1168113263;
        hi.dmsj[1430] = 742104338;
        hi.dmsj[1431] = -1025177792;
        hi.dmsj[1432] = -2131646233;
        hi.dmsj[1433] = -1589045857;
        hi.dmsj[1434] = 710471015;
        hi.dmsj[1435] = 1764823168;
        hi.dmsj[1436] = 1882468927;
        hi.dmsj[1437] = -1789336962;
        hi.dmsj[1438] = -1206098389;
        hi.dmsj[1439] = -55699917;
        hi.dmsj[1440] = -1366040200;
        hi.dmsj[1441] = 1441760447;
        hi.dmsj[1442] = -1697245189;
        hi.dmsj[1443] = 371341352;
        hi.dmsj[1444] = 1075084766;
        hi.dmsj[1445] = 634676859;
        hi.dmsj[1446] = 2028347299;
        hi.dmsj[1447] = -285627547;
        hi.dmsj[1448] = 1003764369;
        hi.dmsj[1449] = 565426029;
        hi.dmsj[1450] = 341201820;
        hi.dmsj[1451] = 1831775817;
        hi.dmsj[1452] = -350637323;
        hi.dmsj[1453] = -440856951;
        hi.dmsj[1454] = 1080251910;
        hi.dmsj[1455] = -1325214502;
        hi.dmsj[1456] = -779818828;
        hi.dmsj[1457] = 1293089009;
        hi.dmsj[1458] = 1868489254;
        hi.dmsj[1459] = 604998039;
        hi.dmsj[1460] = -1049011166;
        hi.dmsj[1461] = -510056981;
        hi.dmsj[1462] = 1332454464;
        hi.dmsj[1463] = 1819221548;
        hi.dmsj[1464] = -1194286170;
        hi.dmsj[1465] = -1658350993;
        hi.dmsj[1466] = 887321154;
        hi.dmsj[1467] = 409001349;
        hi.dmsj[1468] = -1450709000;
        hi.dmsj[1469] = 873074674;
        hi.dmsj[1470] = 1947502563;
        hi.dmsj[1471] = -2128692076;
        hi.dmsj[1472] = -1347745041;
        hi.dmsj[1473] = 1017411035;
        hi.dmsj[1474] = -986951106;
        hi.dmsj[1475] = -305059661;
        hi.dmsj[1476] = -706968992;
        hi.dmsj[1477] = -780028929;
        hi.dmsj[1478] = -1651004207;
        hi.dmsj[1479] = 560970835;
        hi.dmsj[1480] = 1974789098;
        hi.dmsj[1481] = -1203423056;
        hi.dmsj[1482] = -2067944644;
        hi.dmsj[1483] = -1156613405;
        hi.dmsj[1484] = -2121420421;
        hi.dmsj[1485] = -2002034293;
        hi.dmsj[1486] = -89300192;
        hi.dmsj[1487] = 214139495;
        hi.dmsj[1488] = -1320946742;
        hi.dmsj[1489] = 2070216298;
        hi.dmsj[1490] = -1733093065;
        hi.dmsj[1491] = -1996420555;
        hi.dmsj[1492] = 1210615778;
        hi.dmsj[1493] = 983719091;
        hi.dmsj[1494] = -428610626;
        hi.dmsj[1495] = -1964260634;
        hi.dmsj[1496] = 1951673762;
        hi.dmsj[1497] = -636703177;
        hi.dmsj[1498] = 864929102;
        hi.dmsj[1499] = 4188318;
    }

    private static /* synthetic */ void dtpv() {
        hi.dmtt[800] = -529376634451905044L;
        hi.dmtt[801] = -5576082441375501536L;
        hi.dmtt[802] = -1282971040563775842L;
        hi.dmtt[803] = -4903834173834808350L;
        hi.dmtt[804] = 4281416634058624448L;
        hi.dmtt[805] = 7871750190068704476L;
        hi.dmtt[806] = -7871740778352050102L;
        hi.dmtt[807] = 1922341371240772835L;
        hi.dmtt[808] = 4933911454341610765L;
        hi.dmtt[809] = 141959514984928441L;
        hi.dmtt[810] = 2930658711955858377L;
        hi.dmtt[811] = 1422357560414942014L;
        hi.dmtt[812] = -3178315958311574655L;
        hi.dmtt[813] = -582959436285801907L;
        hi.dmtt[814] = 5212059018378797860L;
        hi.dmtt[815] = -4889586316280829288L;
        hi.dmtt[816] = -5931027645176707441L;
        hi.dmtt[817] = -7054546709128591942L;
        hi.dmtt[818] = 8783071788303874888L;
        hi.dmtt[819] = 3819082620597741230L;
        hi.dmtt[820] = 1950974926772167086L;
        hi.dmtt[821] = -4113696870572007780L;
        hi.dmtt[822] = 6916407627348071755L;
        hi.dmtt[823] = -3964733719501512753L;
        hi.dmtt[824] = 3644948833850792128L;
        hi.dmtt[825] = -5940387067315151881L;
        hi.dmtt[826] = 7075854221884707135L;
        hi.dmtt[827] = 2528637634056249536L;
        hi.dmtt[828] = -4655664796829818306L;
        hi.dmtt[829] = 3041530118338557175L;
        hi.dmtt[830] = 6800699453111151387L;
        hi.dmtt[831] = -2601177583245545061L;
        hi.dmtt[832] = -3381773406750983514L;
        hi.dmtt[833] = -437699976956271725L;
        hi.dmtt[834] = 8791023655602799883L;
        hi.dmtt[835] = 5548523022382995476L;
    }

    private static /* synthetic */ void dtpy() {
        hi.dmtu[0] = 262333389991935915L;
        hi.dmtu[1] = 7224026871383562288L;
        hi.dmtu[2] = -2424860787401317113L;
        hi.dmtu[3] = 3284612527163456082L;
        hi.dmtu[4] = -7755061528828977406L;
        hi.dmtu[5] = 4142380208225342004L;
        hi.dmtu[6] = -3616479178657249195L;
        hi.dmtu[7] = 7475640899644765965L;
        hi.dmtu[8] = -9165630139187683964L;
        hi.dmtu[9] = -1186235889528311597L;
        hi.dmtu[10] = -6071414129048203881L;
        hi.dmtu[11] = 2641387028069652713L;
        hi.dmtu[12] = 7429249070355040575L;
        hi.dmtu[13] = 6588361525460814095L;
        hi.dmtu[14] = 3035015090259253020L;
        hi.dmtu[15] = -215918328086469050L;
        hi.dmtu[16] = -5156904808563601326L;
        hi.dmtu[17] = -7014966435887822656L;
        hi.dmtu[18] = -1555528211035155492L;
        hi.dmtu[19] = -8921903954699559722L;
        hi.dmtu[20] = -6577799705861176029L;
        hi.dmtu[21] = 4001234786208035191L;
        hi.dmtu[22] = -7306902799270614844L;
        hi.dmtu[23] = -8341784338480196457L;
        hi.dmtu[24] = 9220098888634561219L;
        hi.dmtu[25] = 3678190073795729343L;
        hi.dmtu[26] = -5257069963639704252L;
        hi.dmtu[27] = 3118612453444883256L;
        hi.dmtu[28] = -835532355739292618L;
        hi.dmtu[29] = 1964790183759590438L;
        hi.dmtu[30] = -4945015303701317719L;
        hi.dmtu[31] = -5724897447841917244L;
        hi.dmtu[32] = -1700693822519734925L;
        hi.dmtu[33] = -2857597445572975532L;
        hi.dmtu[34] = 548657331910400139L;
        hi.dmtu[35] = 1525957444992919300L;
        hi.dmtu[36] = 2277046056877692899L;
        hi.dmtu[37] = 6663752431232286060L;
        hi.dmtu[38] = -1911871458012075239L;
        hi.dmtu[39] = -4390408070320348429L;
        hi.dmtu[40] = 2763094762043810633L;
        hi.dmtu[41] = 5359607405522804507L;
        hi.dmtu[42] = 8653386593001747923L;
        hi.dmtu[43] = 826106592768301243L;
        hi.dmtu[44] = 5460797565646543491L;
        hi.dmtu[45] = 2186509629358800927L;
        hi.dmtu[46] = -4429097097309278346L;
        hi.dmtu[47] = 1349131232538640325L;
        hi.dmtu[48] = -2966083804488382297L;
        hi.dmtu[49] = 7667419522470193167L;
        hi.dmtu[50] = 4550788778824426036L;
        hi.dmtu[51] = 8154214356161260049L;
        hi.dmtu[52] = 2432704934857097973L;
        hi.dmtu[53] = 6958168740359008919L;
        hi.dmtu[54] = -6437453755842606916L;
        hi.dmtu[55] = -4872137631885604277L;
        hi.dmtu[56] = 7608765008206879483L;
        hi.dmtu[57] = -6570772528464320064L;
        hi.dmtu[58] = -4954600882492327240L;
        hi.dmtu[59] = -6817861376065081606L;
        hi.dmtu[60] = -6806432766838259351L;
        hi.dmtu[61] = -693386772174065028L;
        hi.dmtu[62] = 277666219728750771L;
        hi.dmtu[63] = 4911749580273679677L;
        hi.dmtu[64] = 2496043857876952310L;
        hi.dmtu[65] = 7531487569333371594L;
        hi.dmtu[66] = -6771511907035517613L;
        hi.dmtu[67] = -6603816843703160222L;
        hi.dmtu[68] = 2211807254146469865L;
        hi.dmtu[69] = -7622323336452523123L;
        hi.dmtu[70] = 420685358056934313L;
        hi.dmtu[71] = -8337393257560357838L;
        hi.dmtu[72] = -8655231899320537399L;
        hi.dmtu[73] = 2227113783392316683L;
        hi.dmtu[74] = 3388485166060508045L;
        hi.dmtu[75] = 13418546265659528L;
        hi.dmtu[76] = -2840234580088887479L;
        hi.dmtu[77] = -5697059640439946697L;
        hi.dmtu[78] = -6831535946293016822L;
        hi.dmtu[79] = 270657489439658181L;
        hi.dmtu[80] = -3036583859286074090L;
        hi.dmtu[81] = 5787989956035496349L;
        hi.dmtu[82] = -6410058091518687074L;
        hi.dmtu[83] = 758258517496020836L;
        hi.dmtu[84] = -5840159866595781945L;
        hi.dmtu[85] = 5828693069040590843L;
        hi.dmtu[86] = -2131496945336202122L;
        hi.dmtu[87] = -8787306521393644284L;
        hi.dmtu[88] = -6461375087830808103L;
        hi.dmtu[89] = 6374803799481571363L;
        hi.dmtu[90] = 3822687319211470333L;
        hi.dmtu[91] = 1496204694228548320L;
        hi.dmtu[92] = 499336631973605627L;
        hi.dmtu[93] = 7493643862941078127L;
        hi.dmtu[94] = -1364193248494469778L;
        hi.dmtu[95] = 2612799194084830693L;
        hi.dmtu[96] = -1729542871199738123L;
        hi.dmtu[97] = 4188270037275933501L;
        hi.dmtu[98] = -2441406675375817820L;
        hi.dmtu[99] = -1717653358274328604L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean check(String var1_1) {
        v0 /* !! */  = hi.ib;
        if (true) ** GOTO lbl5
        block26: while (true) {
            v0 /* !! */  = (long)(v1 - hi.dmsl("dnmp", dmts(int ), (int)20));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1324931581: {
                    v1 = hi.dmsl("dnmq", dmts(int ), (int)21);
                    continue block26;
                }
                case -360360532: {
                    v1 = hi.dmsl("dnmr", dmts(int ), (int)22);
                    continue block26;
                }
                case 565202804: {
                    v1 = hi.dmsl("dnms", dmts(int ), (int)23);
                    continue block26;
                }
                case 1228545173: {
                    break block26;
                }
            }
            break;
        }
        var4_2 = hi.c;
        v2 /* !! */  = hi.ib;
        if (true) ** GOTO lbl22
        block27: while (true) {
            v2 /* !! */  = (long)(v3 - hi.dmsl("dnmt", dmts(int ), (int)24));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2138829821: {
                    v3 = hi.dmsl("dnmu", dmts(int ), (int)25);
                    continue block27;
                }
                case -344911478: {
                    v3 = hi.dmsl("dnmw", dmts(int ), (int)26);
                    continue block27;
                }
                case 4933851: {
                    v3 = hi.dmsl("dnmx", dmts(int ), (int)27);
                    continue block27;
                }
                case 1228545173: {
                    break block27;
                }
            }
            break;
        }
        var3_3 /* !! */  = hi.b;
        v4 /* !! */  = hi.ib;
        if (true) ** GOTO lbl39
        block28: while (true) {
            v4 /* !! */  = (long)(hi.dmsl("dnmz", dmts(int ), (int)29) - hi.dmsl("dnmy", dmts(int ), (int)28));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 345851453: {
                    continue block28;
                }
                case 1228545173: {
                    break block28;
                }
            }
            break;
        }
        var2_4 = hi.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
                    return (boolean)hi.dmsl("dnna", dmsv(int ), (int)270);
                }
                if (var2_4 || var2_4) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = hi.ib - hi.dmsl("dnnb", dmts(int ), (int)30)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == hi.dmsl("dnnc", dmsv(int ), (int)271)) break;
                    v5 /* !! */  = (long)hi.dmsl("dnnd", dmsv(int ), (int)272);
                }
                v6 /* !! */  = hi.ib;
                if (true) ** GOTO lbl63
                block31: while (true) {
                    v6 /* !! */  = (long)(hi.dmsl("dnnf", dmts(int ), (int)32) - hi.dmsl("dnne", dmts(int ), (int)31));
lbl63:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 1228545173: {
                            break block31;
                        }
                        case 2073176136: {
                            continue block31;
                        }
                    }
                    break;
                }
                return this.checks.isSelected(var1_1);
            }
lbl69:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)hi.dmsl("dnng", dmsv(int ), (int)273);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl79
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)hi.dmsl("dnnh", dmsv(int ), (int)274);
                } while (!var4_2);
                throw null;
            }
lbl79:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hi.dmsl("dnni", dmsv(int ), (int)275);
                    if (!var4_2) ** GOTO lbl69
                    throw null;
                }
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)hi.dmsl("dnnj", dmsv(int ), (int)276);
        ** while (!var4_2)
lbl87:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dsgg() {
        hi.dmsj[300] = 1517025299;
        hi.dmsj[301] = -2083654879;
        hi.dmsj[302] = 1200841624;
        hi.dmsj[303] = -1376725917;
        hi.dmsj[304] = 2049662695;
        hi.dmsj[305] = 834645378;
        hi.dmsj[306] = -1310420862;
        hi.dmsj[307] = 1098501959;
        hi.dmsj[308] = 1894518462;
        hi.dmsj[309] = -339831195;
        hi.dmsj[310] = 791008524;
        hi.dmsj[311] = 188311625;
        hi.dmsj[312] = 657229887;
        hi.dmsj[313] = -391881322;
        hi.dmsj[314] = 768189763;
        hi.dmsj[315] = -1935114753;
        hi.dmsj[316] = -1051121058;
        hi.dmsj[317] = 2052117138;
        hi.dmsj[318] = -340452184;
        hi.dmsj[319] = -2016675654;
        hi.dmsj[320] = 305900368;
        hi.dmsj[321] = -2022140669;
        hi.dmsj[322] = -1333383311;
        hi.dmsj[323] = -1727611554;
        hi.dmsj[324] = -1851666730;
        hi.dmsj[325] = -348570213;
        hi.dmsj[326] = -1490676928;
        hi.dmsj[327] = 1705498496;
        hi.dmsj[328] = -1637452611;
        hi.dmsj[329] = 1104010436;
        hi.dmsj[330] = 463983233;
        hi.dmsj[331] = -1046352526;
        hi.dmsj[332] = 552653038;
        hi.dmsj[333] = -931345925;
        hi.dmsj[334] = -1545207224;
        hi.dmsj[335] = 219563378;
        hi.dmsj[336] = 1945803870;
        hi.dmsj[337] = 71574679;
        hi.dmsj[338] = 1900350723;
        hi.dmsj[339] = 967157287;
        hi.dmsj[340] = -1024162708;
        hi.dmsj[341] = 475004271;
        hi.dmsj[342] = 1790783223;
        hi.dmsj[343] = -2061392926;
        hi.dmsj[344] = 925315859;
        hi.dmsj[345] = -904807628;
        hi.dmsj[346] = 1832886026;
        hi.dmsj[347] = -618888262;
        hi.dmsj[348] = 1605853199;
        hi.dmsj[349] = 397646049;
        hi.dmsj[350] = -1350988104;
        hi.dmsj[351] = -370478383;
        hi.dmsj[352] = -415543591;
        hi.dmsj[353] = -1233872537;
        hi.dmsj[354] = 130977575;
        hi.dmsj[355] = -2051690859;
        hi.dmsj[356] = 182355685;
        hi.dmsj[357] = 1734610066;
        hi.dmsj[358] = -667299856;
        hi.dmsj[359] = 587095714;
        hi.dmsj[360] = -606954243;
        hi.dmsj[361] = -1445582274;
        hi.dmsj[362] = 2081493438;
        hi.dmsj[363] = -392949882;
        hi.dmsj[364] = 1595634000;
        hi.dmsj[365] = 106612094;
        hi.dmsj[366] = 455803461;
        hi.dmsj[367] = 875904644;
        hi.dmsj[368] = -1172302612;
        hi.dmsj[369] = -1152247138;
        hi.dmsj[370] = 2109890832;
        hi.dmsj[371] = 618448411;
        hi.dmsj[372] = 683015344;
        hi.dmsj[373] = -638376409;
        hi.dmsj[374] = 1220476194;
        hi.dmsj[375] = 1424246759;
        hi.dmsj[376] = 999942309;
        hi.dmsj[377] = 1852924876;
        hi.dmsj[378] = -1938344247;
        hi.dmsj[379] = 354833654;
        hi.dmsj[380] = 1530900889;
        hi.dmsj[381] = -340527424;
        hi.dmsj[382] = 1466400044;
        hi.dmsj[383] = 234258945;
        hi.dmsj[384] = -920229782;
        hi.dmsj[385] = -1855895234;
        hi.dmsj[386] = 1148255707;
        hi.dmsj[387] = -1986663180;
        hi.dmsj[388] = 2145922625;
        hi.dmsj[389] = -1436443310;
        hi.dmsj[390] = -58104490;
        hi.dmsj[391] = 1693583330;
        hi.dmsj[392] = -232715962;
        hi.dmsj[393] = -561215883;
        hi.dmsj[394] = 418553272;
        hi.dmsj[395] = 1107606760;
        hi.dmsj[396] = 2016950278;
        hi.dmsj[397] = 889224647;
        hi.dmsj[398] = 974885570;
        hi.dmsj[399] = 218775493;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean finishPlacementConfirmation() {
        block64: {
            block63: {
                var4_1 = hi.c;
                var3_2 /* !! */  = hi.b;
                var2_3 = hi.a;
                if (var4_1) {
                    throw null;
lbl6:
                    // 16 sources

                    return (boolean)hi.dmsl("dpur", dmsv(int ), (int)977);
                }
                if (var2_3 || var2_3) ** GOTO lbl6
                if (!this.placementServerConfirmed) break block63;
                if (var2_3 || var2_3) ** GOTO lbl6
                this.clearPlacementConfirmation();
                if (var2_3 || var2_3) ** GOTO lbl6
                return (boolean)hi.dmsl("dpus", dmsv(int ), (int)978);
            }
            if (var2_3 || var2_3) ** GOTO lbl6
            if (!this.placementServerRejected) break block64;
            if (var2_3 || var2_3) ** GOTO lbl6
            this.clearPlacementConfirmation();
            if (var2_3 || var2_3) ** GOTO lbl6
            this.lastSwapTime = (long)hi.dmsl("dput", dmts(int ), (int)309);
            if (var2_3 || var2_3) ** GOTO lbl6
            return (boolean)hi.dmsl("dpuu", dmsv(int ), (int)979);
        }
        if (var2_3 || var2_3) ** GOTO lbl6
        if (System.currentTimeMillis() >= this.placementConfirmationDeadline) ** GOTO lbl32
        if (var2_3) ** GOTO lbl6
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3) ** GOTO lbl6
                return (boolean)hi.dmsl("dpuv", dmsv(int ), (int)980);
            }
lbl32:
            // 1 sources

            if (var2_3 || var2_3) ** GOTO lbl6
            var1_4 = this.hasTotemInOffhand();
            if (var2_3 || var2_3) ** GOTO lbl6
            this.clearPlacementConfirmation();
            if (var2_3 || var2_3) ** GOTO lbl6
            if (var1_4) ** GOTO lbl41
            if (var2_3) ** GOTO lbl6
            this.lastSwapTime = (long)hi.dmsl("dpuw", dmts(int ), (int)310);
            if (var2_3) ** GOTO lbl6
lbl41:
            // 2 sources

            if (!var2_3 && !var2_3) ** break;
            ** continue;
            return (boolean)hi.dmsl("dpux", dmsv(int ), (int)981);
            case 0: {
                var3_2 /* !! */  = (int)hi.dmsl("dpuy", dmsv(int ), (int)982);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl64
            }
lbl49:
            // 2 sources

            case 1: {
                var3_2 /* !! */  = (int)hi.dmsl("dpuz", dmsv(int ), (int)983);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl159
            }
            case 2: {
                var3_2 /* !! */  = (int)hi.dmsl("dpva", dmsv(int ), (int)984);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl151
            }
lbl59:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)hi.dmsl("dpvb", dmsv(int ), (int)985);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl108
            }
lbl64:
            // 5 sources

            case 4: {
                var3_2 /* !! */  = (int)hi.dmsl("dpvc", dmsv(int ), (int)986);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl163
            }
            case 5: {
                var3_2 /* !! */  = (int)hi.dmsl("dpvd", dmsv(int ), (int)987);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl74:
            // 2 sources

            case 6: {
                var3_2 /* !! */  = (int)hi.dmsl("dpve", dmsv(int ), (int)988);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl130
            }
            case 7: {
                var3_2 /* !! */  = (int)hi.dmsl("dpvf", dmsv(int ), (int)989);
                if (!var4_1) break;
                throw null;
            }
            case 8: {
                var3_2 /* !! */  = (int)hi.dmsl("dpvg", dmsv(int ), (int)990);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl103
            }
            case 9: {
                var3_2 /* !! */  = (int)hi.dmsl("dpvh", dmsv(int ), (int)991);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl155
            }
lbl93:
            // 2 sources

            case 10: {
                var3_2 /* !! */  = (int)hi.dmsl("dpvi", dmsv(int ), (int)992);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl130
            }
lbl98:
            // 2 sources

            case 11: {
                var3_2 /* !! */  = (int)hi.dmsl("dpvj", dmsv(int ), (int)993);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl175
            }
lbl103:
            // 2 sources

            case 12: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)hi.dmsl("dpvk", dmsv(int ), (int)994);
                    if (!var4_1) ** GOTO lbl59
                    throw null;
                }
            }
lbl108:
            // 2 sources

            case 13: {
                var3_2 /* !! */  = (int)hi.dmsl("dpvl", dmsv(int ), (int)995);
                if (!var4_1) ** GOTO lbl49
                throw null;
            }
            case 14: {
                var3_2 /* !! */  = (int)hi.dmsl("dpvm", dmsv(int ), (int)996);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl175
            }
lbl117:
            // 2 sources

            case 15: {
                var3_2 /* !! */  = (int)hi.dmsl("dpvn", dmsv(int ), (int)997);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl126
            }
lbl122:
            // 2 sources

            case 16: {
                var3_2 /* !! */  = (int)hi.dmsl("dpvo", dmsv(int ), (int)998);
                if (!var4_1) ** GOTO lbl117
                throw null;
            }
lbl126:
            // 2 sources

            case 17: {
                var3_2 /* !! */  = (int)hi.dmsl("dpvp", dmsv(int ), (int)999);
                if (!var4_1) ** GOTO lbl93
                throw null;
            }
lbl130:
            // 4 sources

            case 18: {
                var3_2 /* !! */  = (int)hi.dmsl("dpvq", dmsv(int ), (int)1000);
                if (!var4_1) ** GOTO lbl64
                throw null;
            }
lbl134:
            // 4 sources

            case 19: {
                var3_2 /* !! */  = (int)hi.dmsl("dpvr", dmsv(int ), (int)1001);
                if (!var4_1) ** GOTO lbl74
                throw null;
            }
lbl138:
            // 2 sources

            case 20: {
                var3_2 /* !! */  = (int)hi.dmsl("dpvs", dmsv(int ), (int)1002);
                if (!var4_1) ** GOTO lbl64
                throw null;
            }
            case 21: {
                var3_2 /* !! */  = (int)hi.dmsl("dpvt", dmsv(int ), (int)1003);
                if (!var4_1) ** GOTO lbl98
                throw null;
            }
            case 22: {
                var3_2 /* !! */  = (int)hi.dmsl("dpvu", dmsv(int ), (int)1004);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl159
            }
lbl151:
            // 2 sources

            case 23: {
                var3_2 /* !! */  = (int)hi.dmsl("dpvv", dmsv(int ), (int)1005);
                if (!var4_1) ** GOTO lbl134
                throw null;
            }
lbl155:
            // 2 sources

            case 24: {
                var3_2 /* !! */  = (int)hi.dmsl("dpvw", dmsv(int ), (int)1006);
                if (!var4_1) ** GOTO lbl138
                throw null;
            }
lbl159:
            // 3 sources

            case 25: {
                var3_2 /* !! */  = (int)hi.dmsl("dpvx", dmsv(int ), (int)1007);
                if (!var4_1) ** GOTO lbl134
                throw null;
            }
lbl163:
            // 2 sources

            case 26: {
                var3_2 /* !! */  = (int)hi.dmsl("dpvy", dmsv(int ), (int)1008);
                if (!var4_1) break;
                throw null;
            }
            case 27: {
                var3_2 /* !! */  = (int)hi.dmsl("dpvz", dmsv(int ), (int)1009);
                if (!var4_1) ** GOTO lbl130
                throw null;
            }
            case 28: {
                var3_2 /* !! */  = (int)hi.dmsl("dpwa", dmsv(int ), (int)1010);
                if (!var4_1) ** GOTO lbl64
                throw null;
            }
lbl175:
            // 3 sources

            case 29: {
                var3_2 /* !! */  = (int)hi.dmsl("dpwb", dmsv(int ), (int)1011);
                if (!var4_1) ** GOTO lbl122
                throw null;
            }
            case 30: {
                do {
                    var3_2 /* !! */  = (int)hi.dmsl("dpwc", dmsv(int ), (int)1012);
                } while (!var4_1);
                throw null;
            }
            case 31: 
        }
        var3_2 /* !! */  = (int)hi.dmsl("dpwd", dmsv(int ), (int)1013);
        ** while (!var4_1)
lbl187:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$4() {
        block36: {
            block35: {
                v0 /* !! */  = hi.ib;
                if (true) ** GOTO lbl5
                block18: while (true) {
                    v0 /* !! */  = (long)(hi.dmsl("drzj", dmts(int ), (int)778) - hi.dmsl("drzh", dmts(int ), (int)777));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case 1228545173: {
                            break block18;
                        }
                        case 1463134863: {
                            continue block18;
                        }
                    }
                    break;
                }
                var3_1 = hi.c;
                v1 /* !! */  = hi.ib;
                if (true) ** GOTO lbl15
                block19: while (true) {
                    v1 /* !! */  = (long)(hi.dmsl("drzm", dmts(int ), (int)780) - hi.dmsl("drzk", dmts(int ), (int)779));
lbl15:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case 1228545173: {
                            break block19;
                        }
                        case 1378432753: {
                            continue block19;
                        }
                    }
                    break;
                }
                var2_2 = hi.b;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_0 = hi.ib - hi.dmsl("drzo", dmts(int ), (int)781)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == hi.dmsl("drzp", dmsv(int ), (int)1684)) break;
                    v2 /* !! */  = (long)hi.dmsl("drzq", dmsv(int ), (int)1685);
                }
                var1_3 = hi.a;
                if (var3_1) {
                    throw null;
lbl30:
                    // 5 sources

                    return null;
                }
                if (var1_3 || var1_3) ** GOTO lbl30
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = hi.ib - hi.dmsl("drzv", dmts(int ), (int)782)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == hi.dmsl("drzw", dmsv(int ), (int)1686)) break;
                    v3 /* !! */  = (long)hi.dmsl("drzx", dmsv(int ), (int)1687);
                }
                if (!this.check("\u041a\u0440\u0438\u0441\u0442\u0430\u043b\u043b")) break block35;
                if (var1_3) ** GOTO lbl30
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = hi.ib - hi.dmsl("drzz", dmts(int ), (int)783)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hi.dmsl("dsab", dmsv(int ), (int)1688)) break;
                    v4 /* !! */  = (long)hi.dmsl("dsac", dmsv(int ), (int)1689);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = hi.ib - hi.dmsl("dsad", dmts(int ), (int)784)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == hi.dmsl("dsag", dmsv(int ), (int)1690)) break;
                    v5 /* !! */  = (long)hi.dmsl("dsai", dmsv(int ), (int)1691);
                }
                if (!this.noSwapIfBall.isValue()) break block35;
                if (var1_3) ** GOTO lbl30
                v6 /* !! */  = hi.ib;
                if (true) ** GOTO lbl59
                block25: while (true) {
                    v6 /* !! */  = (long)(v7 - hi.dmsl("dsak", dmts(int ), (int)785));
lbl59:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1002509100: {
                            v7 = hi.dmsl("dsam", dmts(int ), (int)786);
                            continue block25;
                        }
                        case -337895356: {
                            v7 = hi.dmsl("dsan", dmts(int ), (int)787);
                            continue block25;
                        }
                        case 1228545173: {
                            break block25;
                        }
                    }
                    break;
                }
                v8 /* !! */  = hi.ib;
                if (true) ** GOTO lbl72
                block26: while (true) {
                    v8 /* !! */  = (long)(v9 - hi.dmsl("dsap", dmts(int ), (int)788));
lbl72:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case 202704283: {
                            v9 = hi.dmsl("dsaq", dmts(int ), (int)789);
                            continue block26;
                        }
                        case 1080419616: {
                            v9 = hi.dmsl("dsas", dmts(int ), (int)790);
                            continue block26;
                        }
                        case 1228545173: {
                            break block26;
                        }
                    }
                    break;
                }
                if (!this.lowHpOverride.isValue()) break block35;
                if (var1_3) ** GOTO lbl30
                v10 = hi.dmsl("dsau", dmsv(int ), (int)1692);
                if (var3_1) {
                    throw null;
                }
                break block36;
            }
            if (!var1_3 && !var1_3) ** break;
            ** while (true)
            v10 = hi.dmsl("dsaw", dmsv(int ), (int)1693);
        }
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_4 = hi.ib - hi.dmsl("dsay", dmts(int ), (int)791)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v11 /* !! */  == hi.dmsl("dsba", dmsv(int ), (int)1694)) break;
            v11 /* !! */  = (long)hi.dmsl("dsbc", dmsv(int ), (int)1695);
        }
        return (boolean)v10;
    }

    private static /* synthetic */ void dtmh() {
        hi.dmsk[400] = 868993867;
        hi.dmsk[401] = 1625490685;
        hi.dmsk[402] = -340160406;
        hi.dmsk[403] = -734912462;
        hi.dmsk[404] = 1966507681;
        hi.dmsk[405] = 725290341;
        hi.dmsk[406] = -1925468556;
        hi.dmsk[407] = -843681325;
        hi.dmsk[408] = -1331409492;
        hi.dmsk[409] = -646015512;
        hi.dmsk[410] = 1102072508;
        hi.dmsk[411] = -1147331256;
        hi.dmsk[412] = -1129733709;
        hi.dmsk[413] = 478655526;
        hi.dmsk[414] = 1749986391;
        hi.dmsk[415] = -2079019395;
        hi.dmsk[416] = 546763617;
        hi.dmsk[417] = -1640727317;
        hi.dmsk[418] = 2002072823;
        hi.dmsk[419] = 1117729852;
        hi.dmsk[420] = 1560857802;
        hi.dmsk[421] = -1606909976;
        hi.dmsk[422] = -229718897;
        hi.dmsk[423] = -1907161846;
        hi.dmsk[424] = 1371674539;
        hi.dmsk[425] = 870173349;
        hi.dmsk[426] = -522702020;
        hi.dmsk[427] = -1918730960;
        hi.dmsk[428] = -1326578699;
        hi.dmsk[429] = 2078189238;
        hi.dmsk[430] = -383187613;
        hi.dmsk[431] = 1570310679;
        hi.dmsk[432] = 364597900;
        hi.dmsk[433] = -1235187924;
        hi.dmsk[434] = -2144289258;
        hi.dmsk[435] = -1836247335;
        hi.dmsk[436] = 454756427;
        hi.dmsk[437] = -1062479538;
        hi.dmsk[438] = -1572047941;
        hi.dmsk[439] = 1076604435;
        hi.dmsk[440] = 1133038923;
        hi.dmsk[441] = -1748783991;
        hi.dmsk[442] = 1101957871;
        hi.dmsk[443] = 800843008;
        hi.dmsk[444] = -1268548507;
        hi.dmsk[445] = 1941661092;
        hi.dmsk[446] = 885832615;
        hi.dmsk[447] = 851796931;
        hi.dmsk[448] = -1967085836;
        hi.dmsk[449] = 1591210295;
        hi.dmsk[450] = 2110178456;
        hi.dmsk[451] = -416899325;
        hi.dmsk[452] = -1123151649;
        hi.dmsk[453] = 678242653;
        hi.dmsk[454] = 1979347161;
        hi.dmsk[455] = -1386441027;
        hi.dmsk[456] = 813721814;
        hi.dmsk[457] = -717266264;
        hi.dmsk[458] = -719334459;
        hi.dmsk[459] = -75026860;
        hi.dmsk[460] = -2088845093;
        hi.dmsk[461] = -281258923;
        hi.dmsk[462] = -342696155;
        hi.dmsk[463] = -321752596;
        hi.dmsk[464] = 1932430083;
        hi.dmsk[465] = -2082615360;
        hi.dmsk[466] = 1511896975;
        hi.dmsk[467] = -828482311;
        hi.dmsk[468] = 440147581;
        hi.dmsk[469] = 515635994;
        hi.dmsk[470] = 1491692296;
        hi.dmsk[471] = 809760274;
        hi.dmsk[472] = 1043859667;
        hi.dmsk[473] = 76507703;
        hi.dmsk[474] = 1372674399;
        hi.dmsk[475] = 991618094;
        hi.dmsk[476] = -910827907;
        hi.dmsk[477] = -1920610604;
        hi.dmsk[478] = 1870862584;
        hi.dmsk[479] = -600669855;
        hi.dmsk[480] = -564941220;
        hi.dmsk[481] = 1013879212;
        hi.dmsk[482] = -927443728;
        hi.dmsk[483] = 1841934882;
        hi.dmsk[484] = -273409777;
        hi.dmsk[485] = 221646788;
        hi.dmsk[486] = 342254771;
        hi.dmsk[487] = 370914027;
        hi.dmsk[488] = -1274639173;
        hi.dmsk[489] = 273165242;
        hi.dmsk[490] = 1842047408;
        hi.dmsk[491] = 490142087;
        hi.dmsk[492] = 1963230913;
        hi.dmsk[493] = 742608657;
        hi.dmsk[494] = -115006061;
        hi.dmsk[495] = 1654493847;
        hi.dmsk[496] = 688364156;
        hi.dmsk[497] = 391310952;
        hi.dmsk[498] = 373706260;
        hi.dmsk[499] = 1874376002;
    }

    private static /* synthetic */ void dtmw() {
        hi.dmtt[100] = 5098893823598889083L;
        hi.dmtt[101] = -4501480591862862964L;
        hi.dmtt[102] = 5722980187690486042L;
        hi.dmtt[103] = -3048084643332350722L;
        hi.dmtt[104] = -1703947081138131907L;
        hi.dmtt[105] = -3264445569048903196L;
        hi.dmtt[106] = 8459686910491098998L;
        hi.dmtt[107] = -275327032597693464L;
        hi.dmtt[108] = -8168408622093935740L;
        hi.dmtt[109] = -2297276456284074759L;
        hi.dmtt[110] = 3468206305729589009L;
        hi.dmtt[111] = -5538445932498155829L;
        hi.dmtt[112] = -8320774030271823331L;
        hi.dmtt[113] = 5765414311553500960L;
        hi.dmtt[114] = -1256953106075071200L;
        hi.dmtt[115] = 8813606031257104839L;
        hi.dmtt[116] = 1231437525395116674L;
        hi.dmtt[117] = -2758831679060758600L;
        hi.dmtt[118] = 5679266502458240922L;
        hi.dmtt[119] = -3250206658711981696L;
        hi.dmtt[120] = -459011773578197363L;
        hi.dmtt[121] = 2810876138557072073L;
        hi.dmtt[122] = -6032967218123160140L;
        hi.dmtt[123] = -9022478238135319710L;
        hi.dmtt[124] = 3027356400948167484L;
        hi.dmtt[125] = 5034770762839548161L;
        hi.dmtt[126] = -1310391542683453800L;
        hi.dmtt[127] = -6306370248261190515L;
        hi.dmtt[128] = 1692844599979984284L;
        hi.dmtt[129] = -9060673576998185213L;
        hi.dmtt[130] = 4636239540377124080L;
        hi.dmtt[131] = 6867171786440723219L;
        hi.dmtt[132] = -3842518559583962766L;
        hi.dmtt[133] = 7282709638528393048L;
        hi.dmtt[134] = 2566201386103266670L;
        hi.dmtt[135] = -2166594518571478651L;
        hi.dmtt[136] = 6050029996963971741L;
        hi.dmtt[137] = -3121801662404290443L;
        hi.dmtt[138] = 2012225473991982350L;
        hi.dmtt[139] = -7745923831137106304L;
        hi.dmtt[140] = -6993403155508860681L;
        hi.dmtt[141] = -4981553326849882343L;
        hi.dmtt[142] = 3380339279605436911L;
        hi.dmtt[143] = 1301080879419870446L;
        hi.dmtt[144] = -777029112772775660L;
        hi.dmtt[145] = 3776893748726660680L;
        hi.dmtt[146] = 6480358818520700247L;
        hi.dmtt[147] = -5187492170814149507L;
        hi.dmtt[148] = 2062850047343912004L;
        hi.dmtt[149] = -371802506583558483L;
        hi.dmtt[150] = 5106270506028967442L;
        hi.dmtt[151] = 136278354879989008L;
        hi.dmtt[152] = 4310744826918903827L;
        hi.dmtt[153] = 3653799088757391234L;
        hi.dmtt[154] = 8169526020535071991L;
        hi.dmtt[155] = 3150021762209946964L;
        hi.dmtt[156] = 4820346641516033211L;
        hi.dmtt[157] = 5702233945081410654L;
        hi.dmtt[158] = 6159492657374002648L;
        hi.dmtt[159] = 7511714309388997286L;
        hi.dmtt[160] = 3841676284867892538L;
        hi.dmtt[161] = -9152806163917297261L;
        hi.dmtt[162] = -2239144787735147171L;
        hi.dmtt[163] = 5689940911637105859L;
        hi.dmtt[164] = -5866573184038112770L;
        hi.dmtt[165] = -7470957292748842823L;
        hi.dmtt[166] = 4977069539759869042L;
        hi.dmtt[167] = 932135007896554560L;
        hi.dmtt[168] = 8223064548402681442L;
        hi.dmtt[169] = -6590327292626965420L;
        hi.dmtt[170] = -2222252232737645025L;
        hi.dmtt[171] = 7919861981844308429L;
        hi.dmtt[172] = -939162104444585852L;
        hi.dmtt[173] = 8760578631419238153L;
        hi.dmtt[174] = -5907988555525117016L;
        hi.dmtt[175] = 6763370809060812039L;
        hi.dmtt[176] = 8183655996210126225L;
        hi.dmtt[177] = 6599374700231379966L;
        hi.dmtt[178] = 6586493386660240969L;
        hi.dmtt[179] = 996980688948702413L;
        hi.dmtt[180] = 5621740187730381438L;
        hi.dmtt[181] = 3728082510075325369L;
        hi.dmtt[182] = -1708289892137205794L;
        hi.dmtt[183] = 9185325652792523604L;
        hi.dmtt[184] = 7307635009574733871L;
        hi.dmtt[185] = -2631751708683418750L;
        hi.dmtt[186] = 8339694875626395732L;
        hi.dmtt[187] = 5561839002686645764L;
        hi.dmtt[188] = -6615838514615006235L;
        hi.dmtt[189] = 6055939788366604718L;
        hi.dmtt[190] = -6870654384480424460L;
        hi.dmtt[191] = 7915946096478489252L;
        hi.dmtt[192] = -6646476684819567406L;
        hi.dmtt[193] = 5785130321523888130L;
        hi.dmtt[194] = -7882154281358056487L;
        hi.dmtt[195] = -5579541776799431723L;
        hi.dmtt[196] = 1171580719117887039L;
        hi.dmtt[197] = 7922592675649925937L;
        hi.dmtt[198] = -8004914366350734520L;
        hi.dmtt[199] = 2736425805992023938L;
    }

    private static /* synthetic */ void dsgj() {
        hi.dmsj[600] = -889186251;
        hi.dmsj[601] = -851573214;
        hi.dmsj[602] = 722039123;
        hi.dmsj[603] = -417722540;
        hi.dmsj[604] = -2019016596;
        hi.dmsj[605] = 2095432293;
        hi.dmsj[606] = -520023884;
        hi.dmsj[607] = 1399419845;
        hi.dmsj[608] = 1343083303;
        hi.dmsj[609] = 143114436;
        hi.dmsj[610] = -2001395224;
        hi.dmsj[611] = -849125785;
        hi.dmsj[612] = 427163431;
        hi.dmsj[613] = -1245644505;
        hi.dmsj[614] = 1009130745;
        hi.dmsj[615] = -661262772;
        hi.dmsj[616] = -1710498619;
        hi.dmsj[617] = -424919330;
        hi.dmsj[618] = -707318606;
        hi.dmsj[619] = 1551131980;
        hi.dmsj[620] = 766037918;
        hi.dmsj[621] = 1971912300;
        hi.dmsj[622] = 261041320;
        hi.dmsj[623] = -1663169684;
        hi.dmsj[624] = 419884767;
        hi.dmsj[625] = 168511726;
        hi.dmsj[626] = -1433001345;
        hi.dmsj[627] = 634914760;
        hi.dmsj[628] = -1056501210;
        hi.dmsj[629] = 49037958;
        hi.dmsj[630] = -908529363;
        hi.dmsj[631] = -1392585701;
        hi.dmsj[632] = -1817087965;
        hi.dmsj[633] = 899682188;
        hi.dmsj[634] = 1766276376;
        hi.dmsj[635] = 243590334;
        hi.dmsj[636] = -1644084248;
        hi.dmsj[637] = -1778314221;
        hi.dmsj[638] = -1007100057;
        hi.dmsj[639] = -801001054;
        hi.dmsj[640] = 679487290;
        hi.dmsj[641] = -1607793311;
        hi.dmsj[642] = 2010581071;
        hi.dmsj[643] = 1882151415;
        hi.dmsj[644] = 1703515287;
        hi.dmsj[645] = 532593992;
        hi.dmsj[646] = -448307844;
        hi.dmsj[647] = -2138271836;
        hi.dmsj[648] = 483836408;
        hi.dmsj[649] = -1066993565;
        hi.dmsj[650] = 367190124;
        hi.dmsj[651] = 1823396108;
        hi.dmsj[652] = 783984506;
        hi.dmsj[653] = -360603212;
        hi.dmsj[654] = -175080809;
        hi.dmsj[655] = 1576570346;
        hi.dmsj[656] = -1201594682;
        hi.dmsj[657] = 1279721978;
        hi.dmsj[658] = 554323446;
        hi.dmsj[659] = 1040079387;
        hi.dmsj[660] = -1194889115;
        hi.dmsj[661] = -98419852;
        hi.dmsj[662] = -1133129268;
        hi.dmsj[663] = 547829166;
        hi.dmsj[664] = 1054684442;
        hi.dmsj[665] = -1002547970;
        hi.dmsj[666] = 651526685;
        hi.dmsj[667] = 351592477;
        hi.dmsj[668] = 360741631;
        hi.dmsj[669] = 1869636170;
        hi.dmsj[670] = -1687715023;
        hi.dmsj[671] = -769545625;
        hi.dmsj[672] = -550201163;
        hi.dmsj[673] = 1546345919;
        hi.dmsj[674] = 1231306309;
        hi.dmsj[675] = 1604615583;
        hi.dmsj[676] = -1763159135;
        hi.dmsj[677] = 1272940281;
        hi.dmsj[678] = 1346124094;
        hi.dmsj[679] = 1652754049;
        hi.dmsj[680] = 1497774944;
        hi.dmsj[681] = -1192207700;
        hi.dmsj[682] = 983871174;
        hi.dmsj[683] = -463126668;
        hi.dmsj[684] = 1549033396;
        hi.dmsj[685] = -460752616;
        hi.dmsj[686] = 1773579432;
        hi.dmsj[687] = 1616692740;
        hi.dmsj[688] = -1344879265;
        hi.dmsj[689] = 961284858;
        hi.dmsj[690] = -883116340;
        hi.dmsj[691] = -1987725485;
        hi.dmsj[692] = 171588699;
        hi.dmsj[693] = -1621918079;
        hi.dmsj[694] = -528008676;
        hi.dmsj[695] = 1875771577;
        hi.dmsj[696] = -1442611931;
        hi.dmsj[697] = 106394812;
        hi.dmsj[698] = 220032036;
        hi.dmsj[699] = 1328334225;
    }

    private static /* synthetic */ void dtqq() {
        hi.dmtu[100] = -4313993758887316784L;
        hi.dmtu[101] = -5280041679193894068L;
        hi.dmtu[102] = 7538438292558369217L;
        hi.dmtu[103] = 1620181980943040773L;
        hi.dmtu[104] = -8157575612956818885L;
        hi.dmtu[105] = -6068191511261263958L;
        hi.dmtu[106] = -4254177237886051647L;
        hi.dmtu[107] = 4489050735049899610L;
        hi.dmtu[108] = 422199855726350018L;
        hi.dmtu[109] = 8357558686619594224L;
        hi.dmtu[110] = 7561495441605504880L;
        hi.dmtu[111] = -4061268925224287713L;
        hi.dmtu[112] = -4758228648816016031L;
        hi.dmtu[113] = -1538033439777100726L;
        hi.dmtu[114] = 1735192935196531627L;
        hi.dmtu[115] = 5269176797510467596L;
        hi.dmtu[116] = -4750409333318499776L;
        hi.dmtu[117] = 1380292900678639534L;
        hi.dmtu[118] = -3588742755835680258L;
        hi.dmtu[119] = -7495793049917041053L;
        hi.dmtu[120] = 1639335788534883723L;
        hi.dmtu[121] = -6610745499050029496L;
        hi.dmtu[122] = -7052594886581998437L;
        hi.dmtu[123] = -8621865759395498400L;
        hi.dmtu[124] = 8350042685715080896L;
        hi.dmtu[125] = 4930044191472398673L;
        hi.dmtu[126] = -6968236986298653545L;
        hi.dmtu[127] = 7988779760406936599L;
        hi.dmtu[128] = 7559361086805921956L;
        hi.dmtu[129] = 6770760005221584950L;
        hi.dmtu[130] = 4342792433399314438L;
        hi.dmtu[131] = 7460924462837698454L;
        hi.dmtu[132] = -2957588470260261933L;
        hi.dmtu[133] = -3992260601543038338L;
        hi.dmtu[134] = 7011968852875494564L;
        hi.dmtu[135] = 6519185340067848169L;
        hi.dmtu[136] = -5839290677794441728L;
        hi.dmtu[137] = -4928694874055810803L;
        hi.dmtu[138] = -8383647371853536834L;
        hi.dmtu[139] = -4610632270550138641L;
        hi.dmtu[140] = -557955914944966888L;
        hi.dmtu[141] = -8593829464280667873L;
        hi.dmtu[142] = 9108704190881746061L;
        hi.dmtu[143] = -8482060839132712161L;
        hi.dmtu[144] = -4571630743826479529L;
        hi.dmtu[145] = 47024095545937976L;
        hi.dmtu[146] = -6636334344340110436L;
        hi.dmtu[147] = -6915783405539007095L;
        hi.dmtu[148] = 6171977296043111319L;
        hi.dmtu[149] = 7977412669696845113L;
        hi.dmtu[150] = -2941033711893898449L;
        hi.dmtu[151] = 8960745489957267200L;
        hi.dmtu[152] = 8643410262943327240L;
        hi.dmtu[153] = 8691235538311656225L;
        hi.dmtu[154] = -6627520268728219465L;
        hi.dmtu[155] = 306065298938929396L;
        hi.dmtu[156] = 6391768314382244330L;
        hi.dmtu[157] = -2292690812837497291L;
        hi.dmtu[158] = 6783237186502941662L;
        hi.dmtu[159] = 8131666110651123745L;
        hi.dmtu[160] = -7047971090979249323L;
        hi.dmtu[161] = 1055834070784547263L;
        hi.dmtu[162] = -481809361606154491L;
        hi.dmtu[163] = 5991504575943493740L;
        hi.dmtu[164] = 2776386258473679423L;
        hi.dmtu[165] = 346634318873643491L;
        hi.dmtu[166] = -9135761433475572857L;
        hi.dmtu[167] = -6130825177013414340L;
        hi.dmtu[168] = 7569836201855713646L;
        hi.dmtu[169] = -6679793679287680153L;
        hi.dmtu[170] = 482333528137561290L;
        hi.dmtu[171] = 3268470848224174487L;
        hi.dmtu[172] = 1225040198059400772L;
        hi.dmtu[173] = -689770295493705434L;
        hi.dmtu[174] = -5194870383543334091L;
        hi.dmtu[175] = -1225199395395745825L;
        hi.dmtu[176] = -5848352849134163510L;
        hi.dmtu[177] = -6346173409439888899L;
        hi.dmtu[178] = 8398920769634454748L;
        hi.dmtu[179] = -774314046299043490L;
        hi.dmtu[180] = -7829609929170526672L;
        hi.dmtu[181] = -920657839672062952L;
        hi.dmtu[182] = 5370787432609842328L;
        hi.dmtu[183] = 7107608995844843802L;
        hi.dmtu[184] = 6425577029395836233L;
        hi.dmtu[185] = -2520060877621973005L;
        hi.dmtu[186] = -1884470484468801205L;
        hi.dmtu[187] = -5958988153538191414L;
        hi.dmtu[188] = 2157321841855967220L;
        hi.dmtu[189] = 2398047443615301415L;
        hi.dmtu[190] = 1791678434949764390L;
        hi.dmtu[191] = 4815506486811900911L;
        hi.dmtu[192] = 3874969203643503151L;
        hi.dmtu[193] = 3656722175853275481L;
        hi.dmtu[194] = 1855049290936217880L;
        hi.dmtu[195] = -2058300736346459163L;
        hi.dmtu[196] = 2999763502126662247L;
        hi.dmtu[197] = -1642094540082169830L;
        hi.dmtu[198] = -7753902293667732373L;
        hi.dmtu[199] = 354737594376571618L;
    }

    /*
     * Unable to fully structure code
     */
    @aw
    public void onTick(df var1_1) {
        block21: {
            block16: {
                block20: {
                    block19: {
                        block18: {
                            block17: {
                                block15: {
                                    block13: {
                                        block14: {
                                            block12: {
                                                block11: {
                                                    block10: {
                                                        block9: {
                                                            var5_2 = hi.c;
                                                            var4_3 = hi.b;
                                                            var3_4 = hi.a;
                                                            if (var5_2) {
                                                                throw null;
lbl6:
                                                                // 36 sources

                                                                return;
                                                            }
                                                            if (var3_4 || var3_4) ** GOTO lbl6
                                                            if (hi.mc.field_1724 == null) break block9;
                                                            if (var3_4) ** GOTO lbl6
                                                            if (hi.mc.field_1687 != null) break block10;
                                                            if (var3_4) ** GOTO lbl6
                                                        }
                                                        if (var3_4 || var3_4) ** GOTO lbl6
                                                        return;
                                                    }
                                                    if (var3_4 || var3_4) ** GOTO lbl6
                                                    nz.tick();
                                                    if (var3_4 || var3_4) ** GOTO lbl6
                                                    if (!nz.isSwapQueued("AutoTotem")) break block11;
                                                    if (var3_4 || var3_4) ** GOTO lbl6
                                                    return;
                                                }
                                                if (var3_4 || var3_4) ** GOTO lbl6
                                                if (!this.placementAwaitingConfirmation) break block12;
                                                if (var3_4) ** GOTO lbl6
                                                if (this.finishPlacementConfirmation()) break block12;
                                                if (var3_4 || var3_4) ** GOTO lbl6
                                                return;
                                            }
                                            if (var3_4 || var3_4) ** GOTO lbl6
                                            if (!this.revertAwaitingConfirmation) break block13;
                                            if (var3_4 || var3_4) ** GOTO lbl6
                                            if (!this.needsTotem()) break block14;
                                            if (var3_4) ** GOTO lbl6
                                            if (this.hasTotemInOffhand()) break block14;
                                            if (var3_4 || var3_4) ** GOTO lbl6
                                            this.clearPendingRevertConfirmation();
                                            if (var3_4) ** GOTO lbl6
                                            if (var5_2) {
                                                throw null;
                                            }
                                            break block13;
                                        }
                                        if (var3_4 || var3_4) ** GOTO lbl6
                                        this.finishRevertConfirmation();
                                        if (var3_4 || var3_4) ** GOTO lbl6
                                        return;
                                    }
                                    if (var3_4 || var3_4) ** GOTO lbl6
                                    if (System.currentTimeMillis() - this.lastSwapTime >= hi.dmsl("dnat", dmts(int ), (int)1)) break block15;
                                    if (var3_4 || var3_4) ** GOTO lbl6
                                    return;
                                }
                                if (var3_4 || var3_4) ** GOTO lbl6
                                if (!this.needsTotem()) break block16;
                                if (var3_4 || var3_4) ** GOTO lbl6
                                if (!(this.getEffectiveHealth() <= this.getEffectiveThreshold())) break block17;
                                if (var3_4) ** GOTO lbl6
                                v0 = hi.dmsl("dnau", dmsv(int ), (int)59);
                                if (var5_2) {
                                    throw null;
                                }
                                break block18;
                            }
                            if (var3_4 || var3_4) ** GOTO lbl6
                            v0 = var2_5 = hi.dmsl("dnav", dmsv(int ), (int)60);
                        }
                        if (var3_4 || var3_4) ** GOTO lbl6
                        if (this.hasTotemInOffhand()) break block19;
                        if (var3_4 || var3_4) ** GOTO lbl6
                        this.hasReplacedEnchanted = hi.dmsl("dnaw", dmsv(int ), (int)61);
                        if (var3_4 || var3_4) ** GOTO lbl6
                        if (var2_5 != false || !this.saveTalismans.isValue()) {
                            v1 = hi.dmsl("dnax", dmsv(int ), (int)62);
                            if (var5_2) {
                                throw null;
                            }
                        } else {
                            v1 = hi.dmsl("dnay", dmsv(int ), (int)63);
                        }
                        this.startTotemPlacement((boolean)v1);
                        if (var3_4) ** GOTO lbl6
                        if (var5_2) {
                            throw null;
                        }
                        break block20;
                    }
                    if (var3_4 || var3_4) ** GOTO lbl6
                    if (!this.shouldReplaceEnchantedTotem()) break block20;
                    if (var3_4 || var3_4) ** GOTO lbl6
                    this.startTotemPlacement((boolean)hi.dmsl("dnaz", dmsv(int ), (int)64));
                    if (var3_4) ** GOTO lbl6
                }
                if (var3_4 || var3_4) ** GOTO lbl6
                if (var5_2) {
                    throw null;
                }
                break block21;
            }
            if (var3_4 || var3_4) ** GOTO lbl6
            this.hasReplacedEnchanted = hi.dmsl("dnba", dmsv(int ), (int)65);
            if (var3_4 || var3_4) ** GOTO lbl6
            if (!this.canRevert()) break block21;
            if (var3_4 || var3_4) ** GOTO lbl6
            this.startRevert();
            if (var3_4) ** GOTO lbl6
        }
        if (!var3_4 && !var3_4) ** break;
        ** while (true)
    }

    private static /* synthetic */ void dsgo() {
        hi.dmsj[1100] = -1634539649;
        hi.dmsj[1101] = 746325865;
        hi.dmsj[1102] = -68985469;
        hi.dmsj[1103] = 1172777851;
        hi.dmsj[1104] = 235222846;
        hi.dmsj[1105] = -1726512768;
        hi.dmsj[1106] = -1863281618;
        hi.dmsj[1107] = -1060218686;
        hi.dmsj[1108] = 1413857670;
        hi.dmsj[1109] = 1975417443;
        hi.dmsj[1110] = 1668038155;
        hi.dmsj[1111] = 652089733;
        hi.dmsj[1112] = 813012303;
        hi.dmsj[1113] = 1831368455;
        hi.dmsj[1114] = 1779640508;
        hi.dmsj[1115] = 1382475086;
        hi.dmsj[1116] = -1913736435;
        hi.dmsj[1117] = -775447815;
        hi.dmsj[1118] = 1203253343;
        hi.dmsj[1119] = 2086198328;
        hi.dmsj[1120] = 537739114;
        hi.dmsj[1121] = -1911111862;
        hi.dmsj[1122] = 1705443324;
        hi.dmsj[1123] = 822441516;
        hi.dmsj[1124] = -1733040560;
        hi.dmsj[1125] = 1535969907;
        hi.dmsj[1126] = 1127558419;
        hi.dmsj[1127] = -789142161;
        hi.dmsj[1128] = -866450601;
        hi.dmsj[1129] = 2047816998;
        hi.dmsj[1130] = 957966196;
        hi.dmsj[1131] = 132944028;
        hi.dmsj[1132] = -1170340148;
        hi.dmsj[1133] = 21325961;
        hi.dmsj[1134] = -1114927873;
        hi.dmsj[1135] = -522099204;
        hi.dmsj[1136] = -100353624;
        hi.dmsj[1137] = -2052419272;
        hi.dmsj[1138] = -1823106297;
        hi.dmsj[1139] = -1412421021;
        hi.dmsj[1140] = -558492636;
        hi.dmsj[1141] = 417356235;
        hi.dmsj[1142] = 104354217;
        hi.dmsj[1143] = -1708120851;
        hi.dmsj[1144] = -1424080830;
        hi.dmsj[1145] = -532135054;
        hi.dmsj[1146] = 1071544987;
        hi.dmsj[1147] = -464078052;
        hi.dmsj[1148] = 1024560072;
        hi.dmsj[1149] = -1569723835;
        hi.dmsj[1150] = 1170976122;
        hi.dmsj[1151] = 1954871633;
        hi.dmsj[1152] = 1626526058;
        hi.dmsj[1153] = -594374874;
        hi.dmsj[1154] = 2099385933;
        hi.dmsj[1155] = -1386309162;
        hi.dmsj[1156] = -1222293762;
        hi.dmsj[1157] = -2087345761;
        hi.dmsj[1158] = 814547090;
        hi.dmsj[1159] = 2103218557;
        hi.dmsj[1160] = -983985951;
        hi.dmsj[1161] = 991195962;
        hi.dmsj[1162] = -1972996277;
        hi.dmsj[1163] = 1125921188;
        hi.dmsj[1164] = 2109764482;
        hi.dmsj[1165] = 414133694;
        hi.dmsj[1166] = 887883619;
        hi.dmsj[1167] = 300245393;
        hi.dmsj[1168] = 1372131437;
        hi.dmsj[1169] = -54132354;
        hi.dmsj[1170] = 1110083813;
        hi.dmsj[1171] = 834403753;
        hi.dmsj[1172] = 758068099;
        hi.dmsj[1173] = 1055178419;
        hi.dmsj[1174] = -1788669399;
        hi.dmsj[1175] = 251508418;
        hi.dmsj[1176] = 526546265;
        hi.dmsj[1177] = -1884140128;
        hi.dmsj[1178] = -550930053;
        hi.dmsj[1179] = -70319558;
        hi.dmsj[1180] = -896060115;
        hi.dmsj[1181] = 2004531950;
        hi.dmsj[1182] = 1721698269;
        hi.dmsj[1183] = 1856957688;
        hi.dmsj[1184] = -446779959;
        hi.dmsj[1185] = -1499346573;
        hi.dmsj[1186] = 1261585403;
        hi.dmsj[1187] = 649260028;
        hi.dmsj[1188] = -1246515579;
        hi.dmsj[1189] = 2142716170;
        hi.dmsj[1190] = -1116277408;
        hi.dmsj[1191] = 2087253307;
        hi.dmsj[1192] = -1354910724;
        hi.dmsj[1193] = 1757768966;
        hi.dmsj[1194] = 1631045441;
        hi.dmsj[1195] = 1735360013;
        hi.dmsj[1196] = -1838912586;
        hi.dmsj[1197] = -838501741;
        hi.dmsj[1198] = -1055576637;
        hi.dmsj[1199] = 2042113090;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean hasImmediateThreat() {
        block112: {
            v0 /* !! */  = hi.ib;
            if (true) ** GOTO lbl5
            block70: while (true) {
                v0 /* !! */  = (long)(v1 - hi.dmsl("doci", dmts(int ), (int)109));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1791173643: {
                        v1 = hi.dmsl("docj", dmts(int ), (int)110);
                        continue block70;
                    }
                    case -1073959335: {
                        v1 = hi.dmsl("dock", dmts(int ), (int)111);
                        continue block70;
                    }
                    case 574956281: {
                        v1 = hi.dmsl("docl", dmts(int ), (int)112);
                        continue block70;
                    }
                    case 1228545173: {
                        break block70;
                    }
                }
                break;
            }
            var3_1 = hi.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = hi.ib - hi.dmsl("docm", dmts(int ), (int)113)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == hi.dmsl("docn", dmsv(int ), (int)473)) break;
                v2 /* !! */  = (long)hi.dmsl("doco", dmsv(int ), (int)474);
            }
            var2_2 /* !! */  = hi.b;
            v3 /* !! */  = hi.ib;
            if (true) ** GOTO lbl28
            block72: while (true) {
                v3 /* !! */  = (long)(hi.dmsl("docq", dmts(int ), (int)115) - hi.dmsl("docp", dmts(int ), (int)114));
lbl28:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case 1017626328: {
                        continue block72;
                    }
                    case 1228545173: {
                        break block72;
                    }
                }
                break;
            }
            var1_3 = hi.a;
            if (var3_1) {
                throw null;
lbl36:
                // 15 sources

                return (boolean)hi.dmsl("docr", dmsv(int ), (int)475);
            }
            if (var1_3 || var1_3) ** GOTO lbl36
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_1 = hi.ib - hi.dmsl("docs", dmts(int ), (int)116)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == hi.dmsl("doct", dmsv(int ), (int)476)) break;
                v4 /* !! */  = (long)hi.dmsl("docu", dmsv(int ), (int)477);
            }
            if (!this.check("\u041a\u0440\u0438\u0441\u0442\u0430\u043b\u043b")) break block112;
            if (var1_3) ** GOTO lbl36
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_2 = hi.ib - hi.dmsl("docv", dmts(int ), (int)117)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == hi.dmsl("docw", dmsv(int ), (int)478)) break;
                v5 /* !! */  = (long)hi.dmsl("docx", dmsv(int ), (int)479);
            }
            if (!this.hasCrystalNearby()) break block112;
            if (var1_3 || var1_3) ** GOTO lbl36
            return (boolean)hi.dmsl("docy", dmsv(int ), (int)480);
        }
        if (var1_3) ** GOTO lbl36
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl36
                v6 /* !! */  = hi.ib;
                if (true) ** GOTO lbl64
                block76: while (true) {
                    v6 /* !! */  = (long)(hi.dmsl("doda", dmts(int ), (int)119) - hi.dmsl("docz", dmts(int ), (int)118));
lbl64:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 722056349: {
                            continue block76;
                        }
                        case 1228545173: {
                            break block76;
                        }
                    }
                    break;
                }
                if (!this.check("\u0414\u0438\u043d\u0430\u043c\u0438\u0442")) ** GOTO lbl87
                if (var1_3) ** GOTO lbl36
                v7 /* !! */  = hi.ib;
                if (true) ** GOTO lbl75
                block77: while (true) {
                    v7 /* !! */  = (long)(v8 - hi.dmsl("dodb", dmts(int ), (int)120));
lbl75:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1244365407: {
                            v8 = hi.dmsl("dodc", dmts(int ), (int)121);
                            continue block77;
                        }
                        case 47070641: {
                            v8 = hi.dmsl("dodd", dmts(int ), (int)122);
                            continue block77;
                        }
                        case 1228545173: {
                            break block77;
                        }
                    }
                    break;
                }
                if (!this.hasTntNearby()) ** GOTO lbl87
                if (var1_3 || var1_3) ** GOTO lbl36
                return (boolean)hi.dmsl("dode", dmsv(int ), (int)481);
lbl87:
                // 2 sources

                if (var1_3 || var1_3) ** GOTO lbl36
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = hi.ib - hi.dmsl("dodf", dmts(int ), (int)123)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == hi.dmsl("dodg", dmsv(int ), (int)482)) break;
                    v9 /* !! */  = (long)hi.dmsl("dodh", dmsv(int ), (int)483);
                }
                if (!this.check("\u0412\u0430\u0433\u043e\u043d\u0435\u0442\u043a\u0430 \u0441 \u0434\u0438\u043d\u0430\u043c\u0438\u0442\u043e\u043c")) ** GOTO lbl107
                if (var1_3) ** GOTO lbl36
                v10 /* !! */  = hi.ib;
                if (true) ** GOTO lbl99
                block79: while (true) {
                    v10 /* !! */  = (long)(hi.dmsl("dodj", dmts(int ), (int)125) - hi.dmsl("dodi", dmts(int ), (int)124));
lbl99:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -714063911: {
                            continue block79;
                        }
                        case 1228545173: {
                            break block79;
                        }
                    }
                    break;
                }
                if (!this.hasTntMinecartNearby()) ** GOTO lbl107
                if (var1_3 || var1_3) ** GOTO lbl36
                return (boolean)hi.dmsl("dodk", dmsv(int ), (int)484);
lbl107:
                // 2 sources

                if (var1_3 || var1_3) ** GOTO lbl36
                v11 /* !! */  = hi.ib;
                if (true) ** GOTO lbl112
                block80: while (true) {
                    v11 /* !! */  = (long)(v12 - hi.dmsl("dodl", dmts(int ), (int)126));
lbl112:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1634659571: {
                            v12 = hi.dmsl("dodm", dmts(int ), (int)127);
                            continue block80;
                        }
                        case 201191309: {
                            v12 = hi.dmsl("dodn", dmts(int ), (int)128);
                            continue block80;
                        }
                        case 1228545173: {
                            break block80;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_4 = hi.ib - hi.dmsl("dodo", dmts(int ), (int)129)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == hi.dmsl("dodp", dmsv(int ), (int)485)) break;
                    v13 /* !! */  = (long)hi.dmsl("dodq", dmsv(int ), (int)486);
                }
                if (!this.fallCheck.isValue()) ** GOTO lbl186
                if (var1_3) ** GOTO lbl36
                v14 /* !! */  = hi.ib;
                if (true) ** GOTO lbl132
                block82: while (true) {
                    v14 /* !! */  = (long)(hi.dmsl("dods", dmts(int ), (int)131) - hi.dmsl("dodr", dmts(int ), (int)130));
lbl132:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case 149214289: {
                            continue block82;
                        }
                        case 1228545173: {
                            break block82;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_5 = hi.ib - hi.dmsl("dodt", dmts(int ), (int)132)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == hi.dmsl("dodu", dmsv(int ), (int)487)) break;
                    v15 /* !! */  = (long)hi.dmsl("dodv", dmsv(int ), (int)488);
                }
                if (hi.mc.field_1724 == null) ** GOTO lbl186
                if (var1_3) ** GOTO lbl36
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_6 = hi.ib - hi.dmsl("dodw", dmts(int ), (int)133)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == hi.dmsl("dodx", dmsv(int ), (int)489)) break;
                    v16 /* !! */  = (long)hi.dmsl("dody", dmsv(int ), (int)490);
                }
                v17 /* !! */  = hi.ib;
                if (true) ** GOTO lbl153
                block85: while (true) {
                    v17 /* !! */  = (long)(hi.dmsl("doea", dmts(int ), (int)135) - hi.dmsl("dodz", dmts(int ), (int)134));
lbl153:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case 451402093: {
                            continue block85;
                        }
                        case 1228545173: {
                            break block85;
                        }
                    }
                    break;
                }
                v18 = hi.mc.field_1724;
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_7 = hi.ib - hi.dmsl("doeb", dmts(int ), (int)136)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == hi.dmsl("doec", dmsv(int ), (int)491)) break;
                    v19 /* !! */  = (long)hi.dmsl("doed", dmsv(int ), (int)492);
                }
                v20 = v18.field_6017;
                v21 /* !! */  = hi.ib;
                if (true) ** GOTO lbl169
                block87: while (true) {
                    v21 /* !! */  = (long)(v22 - hi.dmsl("doee", dmts(int ), (int)137));
lbl169:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -393042815: {
                            v22 = hi.dmsl("doef", dmts(int ), (int)138);
                            continue block87;
                        }
                        case 732384053: {
                            v22 = hi.dmsl("doeg", dmts(int ), (int)139);
                            continue block87;
                        }
                        case 1228545173: {
                            break block87;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_8 = hi.ib - hi.dmsl("doeh", dmts(int ), (int)140)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == hi.dmsl("doei", dmsv(int ), (int)493)) break;
                    v23 /* !! */  = (long)hi.dmsl("doej", dmsv(int ), (int)494);
                }
                if (!(v20 >= (double)this.fallHeight.getValue())) ** GOTO lbl186
                if (var1_3 || var1_3) ** GOTO lbl36
                return (boolean)hi.dmsl("doek", dmsv(int ), (int)495);
lbl186:
                // 3 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return (boolean)hi.dmsl("doel", dmsv(int ), (int)496);
            }
lbl189:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)hi.dmsl("doem", dmsv(int ), (int)497);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl208
            }
lbl194:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)hi.dmsl("doen", dmsv(int ), (int)498);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)hi.dmsl("doeo", dmsv(int ), (int)499);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl267
            }
lbl203:
            // 3 sources

            case 3: {
                var2_2 /* !! */  = (int)hi.dmsl("doep", dmsv(int ), (int)500);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl231
            }
lbl208:
            // 3 sources

            case 4: {
                var2_2 /* !! */  = (int)hi.dmsl("doeq", dmsv(int ), (int)501);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl221
            }
            case 5: {
                var2_2 /* !! */  = (int)hi.dmsl("doer", dmsv(int ), (int)502);
                if (!var3_1) ** GOTO lbl203
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)hi.dmsl("does", dmsv(int ), (int)503);
                if (!var3_1) ** GOTO lbl194
                throw null;
            }
lbl221:
            // 3 sources

            case 7: {
                var2_2 /* !! */  = (int)hi.dmsl("doet", dmsv(int ), (int)504);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl267
            }
            case 8: {
                var2_2 /* !! */  = (int)hi.dmsl("doeu", dmsv(int ), (int)505);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl236
            }
lbl231:
            // 3 sources

            case 9: {
                var2_2 /* !! */  = (int)hi.dmsl("doev", dmsv(int ), (int)506);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl246
            }
lbl236:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)hi.dmsl("doew", dmsv(int ), (int)507);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl294
            }
            case 11: {
                var2_2 /* !! */  = (int)hi.dmsl("doex", dmsv(int ), (int)508);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl302
            }
lbl246:
            // 2 sources

            case 12: {
                var2_2 /* !! */  = (int)hi.dmsl("doey", dmsv(int ), (int)509);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl255
            }
            case 13: {
                var2_2 /* !! */  = (int)hi.dmsl("doez", dmsv(int ), (int)510);
                if (!var3_1) ** GOTO lbl208
                throw null;
            }
lbl255:
            // 3 sources

            case 14: {
                var2_2 /* !! */  = (int)hi.dmsl("dofa", dmsv(int ), (int)511);
                if (!var3_1) break;
                throw null;
            }
lbl259:
            // 2 sources

            case 15: {
                var2_2 /* !! */  = (int)hi.dmsl("dofb", dmsv(int ), (int)512);
                if (!var3_1) ** GOTO lbl203
                throw null;
            }
            case 16: {
                var2_2 /* !! */  = (int)hi.dmsl("dofc", dmsv(int ), (int)513);
                if (!var3_1) ** GOTO lbl189
                throw null;
            }
lbl267:
            // 3 sources

            case 17: {
                var2_2 /* !! */  = (int)hi.dmsl("dofd", dmsv(int ), (int)514);
                if (!var3_1) ** GOTO lbl231
                throw null;
            }
lbl271:
            // 2 sources

            case 18: {
                var2_2 /* !! */  = (int)hi.dmsl("dofe", dmsv(int ), (int)515);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl280
            }
            case 19: {
                var2_2 /* !! */  = (int)hi.dmsl("doff", dmsv(int ), (int)516);
                if (!var3_1) ** GOTO lbl271
                throw null;
            }
lbl280:
            // 2 sources

            case 20: {
                var2_2 /* !! */  = (int)hi.dmsl("dofg", dmsv(int ), (int)517);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl289
            }
            case 21: {
                var2_2 /* !! */  = (int)hi.dmsl("dofh", dmsv(int ), (int)518);
                if (!var3_1) ** GOTO lbl221
                throw null;
            }
lbl289:
            // 2 sources

            case 22: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hi.dmsl("dofi", dmsv(int ), (int)519);
                    if (!var3_1) ** GOTO lbl255
                    throw null;
                }
            }
lbl294:
            // 2 sources

            case 23: {
                var2_2 /* !! */  = (int)hi.dmsl("dofj", dmsv(int ), (int)520);
                if (!var3_1) break;
                throw null;
            }
            case 24: {
                var2_2 /* !! */  = (int)hi.dmsl("dofk", dmsv(int ), (int)521);
                if (!var3_1) break;
                throw null;
            }
lbl302:
            // 2 sources

            case 25: {
                var2_2 /* !! */  = (int)hi.dmsl("dofl", dmsv(int ), (int)522);
                if (!var3_1) ** GOTO lbl259
                throw null;
            }
            case 26: 
        }
        var2_2 /* !! */  = (int)hi.dmsl("dofm", dmsv(int ), (int)523);
        ** while (!var3_1)
lbl309:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$3() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hi.ib - hi.dmsl("dsbz", dmts(int ), (int)792)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hi.dmsl("dsca", dmsv(int ), (int)1706)) break;
            v0 /* !! */  = (long)hi.dmsl("dscd", dmsv(int ), (int)1707);
        }
        var3_1 = hi.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hi.ib - hi.dmsl("dscf", dmts(int ), (int)793)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hi.dmsl("dsch", dmsv(int ), (int)1708)) break;
            v1 /* !! */  = (long)hi.dmsl("dscj", dmsv(int ), (int)1709);
        }
        var2_2 /* !! */  = hi.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = hi.ib - hi.dmsl("dsck", dmts(int ), (int)794)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hi.dmsl("dscl", dmsv(int ), (int)1710)) break;
            v2 /* !! */  = (long)hi.dmsl("dscm", dmsv(int ), (int)1711);
        }
        var1_3 = hi.a;
        if (var3_1) {
            throw null;
lbl24:
            // 4 sources

            return null;
        }
        if (var1_3 || var1_3) ** GOTO lbl24
        v3 /* !! */  = hi.ib;
        if (true) ** GOTO lbl31
        block31: while (true) {
            v3 /* !! */  = (long)(v4 - hi.dmsl("dscn", dmts(int ), (int)795));
lbl31:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1380932433: {
                    v4 = hi.dmsl("dsco", dmts(int ), (int)796);
                    continue block31;
                }
                case -1177733659: {
                    v4 = hi.dmsl("dscq", dmts(int ), (int)797);
                    continue block31;
                }
                case 1228545173: {
                    break block31;
                }
            }
            break;
        }
        if (!this.check("\u041a\u0440\u0438\u0441\u0442\u0430\u043b\u043b")) ** GOTO lbl80
        if (var1_3) ** GOTO lbl24
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v5 /* !! */  = hi.ib;
                if (true) ** GOTO lbl49
                block32: while (true) {
                    v5 /* !! */  = (long)(v6 - hi.dmsl("dscs", dmts(int ), (int)798));
lbl49:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 443631832: {
                            v6 = hi.dmsl("dsct", dmts(int ), (int)799);
                            continue block32;
                        }
                        case 1228545173: {
                            break block32;
                        }
                        case 2059697700: {
                            v6 = hi.dmsl("dscv", dmts(int ), (int)800);
                            continue block32;
                        }
                    }
                    break;
                }
                v7 /* !! */  = hi.ib;
                if (true) ** GOTO lbl62
                block33: while (true) {
                    v7 /* !! */  = (long)(v8 - hi.dmsl("dscx", dmts(int ), (int)801));
lbl62:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1707631557: {
                            v8 = hi.dmsl("dsda", dmts(int ), (int)802);
                            continue block33;
                        }
                        case -751040098: {
                            v8 = hi.dmsl("dsdb", dmts(int ), (int)803);
                            continue block33;
                        }
                        case -213473293: {
                            v8 = hi.dmsl("dsdc", dmts(int ), (int)804);
                            continue block33;
                        }
                        case 1228545173: {
                            break block33;
                        }
                    }
                    break;
                }
                if (!this.noSwapIfBall.isValue()) ** GOTO lbl80
                if (var1_3) ** GOTO lbl24
                v9 = hi.dmsl("dsde", dmsv(int ), (int)1712);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl83
lbl80:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v9 = hi.dmsl("dsdf", dmsv(int ), (int)1713);
lbl83:
                // 2 sources

                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_3 = hi.ib - hi.dmsl("dsdh", dmts(int ), (int)805)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v10 /* !! */  == hi.dmsl("dsdj", dmsv(int ), (int)1714)) break;
                    v10 /* !! */  = (long)hi.dmsl("dsdn", dmsv(int ), (int)1715);
                }
                return (boolean)v9;
            }
lbl90:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hi.dmsl("dsdo", dmsv(int ), (int)1716);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl123
                    break;
                }
            }
lbl96:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)hi.dmsl("dsdp", dmsv(int ), (int)1717);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl106
            }
            case 2: {
                var2_2 /* !! */  = (int)hi.dmsl("dsdq", dmsv(int ), (int)1718);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl110
            }
lbl106:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)hi.dmsl("dsdr", dmsv(int ), (int)1719);
                if (var3_1) {
                    throw null;
                }
            }
lbl110:
            // 4 sources

            case 4: {
                var2_2 /* !! */  = (int)hi.dmsl("dsds", dmsv(int ), (int)1720);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl119
            }
            case 5: {
                var2_2 /* !! */  = (int)hi.dmsl("dsdt", dmsv(int ), (int)1721);
                if (!var3_1) ** GOTO lbl90
                throw null;
            }
lbl119:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)hi.dmsl("dsdv", dmsv(int ), (int)1722);
                if (!var3_1) ** GOTO lbl96
                throw null;
            }
lbl123:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)hi.dmsl("dsdw", dmsv(int ), (int)1723);
                if (!var3_1) ** GOTO lbl90
                throw null;
            }
            case 8: 
        }
        var2_2 /* !! */  = (int)hi.dmsl("dsdx", dmsv(int ), (int)1724);
        ** while (!var3_1)
lbl130:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float getEffectiveHealth() {
        block35: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = hi.ib - hi.dmsl("dnnl", dmts(int ), (int)33)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == hi.dmsl("dnnm", dmsv(int ), (int)277)) break;
                v0 /* !! */  = (long)hi.dmsl("dnnn", dmsv(int ), (int)278);
            }
            var4_1 = hi.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = hi.ib - hi.dmsl("dnno", dmts(int ), (int)34)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == hi.dmsl("dnnp", dmsv(int ), (int)279)) break;
                v1 /* !! */  = (long)hi.dmsl("dnnq", dmsv(int ), (int)280);
            }
            var3_2 = hi.b;
            v2 /* !! */  = hi.ib;
            if (true) ** GOTO lbl17
            block25: while (true) {
                v2 /* !! */  = (long)(hi.dmsl("dnns", dmts(int ), (int)36) - hi.dmsl("dnnr", dmts(int ), (int)35));
lbl17:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case 283374189: {
                        continue block25;
                    }
                    case 1228545173: {
                        break block25;
                    }
                }
                break;
            }
            var2_3 = hi.a;
            if (var4_1) {
                throw null;
lbl25:
                // 5 sources

                return (float)hi.dmsl("dnnt", dmsi(int ), (int)281);
            }
            if (var2_3 || var2_3) ** GOTO lbl25
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_2 = hi.ib - hi.dmsl("dnnu", dmts(int ), (int)37)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == hi.dmsl("dnnv", dmsv(int ), (int)282)) break;
                v3 /* !! */  = (long)hi.dmsl("dnnw", dmsv(int ), (int)283);
            }
            v4 /* !! */  = hi.ib;
            if (true) ** GOTO lbl37
            block28: while (true) {
                v4 /* !! */  = (long)(v5 - hi.dmsl("dnnx", dmts(int ), (int)38));
lbl37:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -1164106944: {
                        v5 = hi.dmsl("dnny", dmts(int ), (int)39);
                        continue block28;
                    }
                    case 189101936: {
                        v5 = hi.dmsl("dnnz", dmts(int ), (int)40);
                        continue block28;
                    }
                    case 1228545173: {
                        break block28;
                    }
                    case 1517386108: {
                        v5 = hi.dmsl("dnoa", dmts(int ), (int)41);
                        continue block28;
                    }
                }
                break;
            }
            v6 = hi.mc.field_1724;
            v7 /* !! */  = hi.ib;
            if (true) ** GOTO lbl54
            block29: while (true) {
                v7 /* !! */  = (long)(hi.dmsl("dnoc", dmts(int ), (int)43) - hi.dmsl("dnob", dmts(int ), (int)42));
lbl54:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -217473883: {
                        continue block29;
                    }
                    case 1228545173: {
                        break block29;
                    }
                }
                break;
            }
            var1_4 = v6.method_6032();
            if (var2_3 || var2_3) ** GOTO lbl25
            v8 /* !! */  = hi.ib;
            if (true) ** GOTO lbl65
            block30: while (true) {
                v8 /* !! */  = (long)(hi.dmsl("dnoe", dmts(int ), (int)45) - hi.dmsl("dnod", dmts(int ), (int)44));
lbl65:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case 790434472: {
                        continue block30;
                    }
                    case 1228545173: {
                        break block30;
                    }
                }
                break;
            }
            if (!this.check("\u0417\u043e\u043b\u043e\u0442\u044b\u0435 \u0441\u0435\u0440\u0434\u0446\u0430")) break block35;
            if (var2_3 || var2_3) ** GOTO lbl25
            v9 /* !! */  = hi.ib;
            if (true) ** GOTO lbl76
            block31: while (true) {
                v9 /* !! */  = (long)(v10 - hi.dmsl("dnof", dmts(int ), (int)46));
lbl76:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -1152214676: {
                        v10 = hi.dmsl("dnog", dmts(int ), (int)47);
                        continue block31;
                    }
                    case -1046763388: {
                        v10 = hi.dmsl("dnoh", dmts(int ), (int)48);
                        continue block31;
                    }
                    case 1228545173: {
                        break block31;
                    }
                }
                break;
            }
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_3 = hi.ib - hi.dmsl("dnoi", dmts(int ), (int)49)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == hi.dmsl("dnoj", dmsv(int ), (int)284)) break;
                v11 /* !! */  = (long)hi.dmsl("dnok", dmsv(int ), (int)285);
            }
            v12 = hi.mc.field_1724;
            while (true) {
                if ((v13 /* !! */  = (cfr_temp_4 = hi.ib - hi.dmsl("dnol", dmts(int ), (int)50)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v13 /* !! */  == hi.dmsl("dnom", dmsv(int ), (int)286)) break;
                v13 /* !! */  = (long)hi.dmsl("dnon", dmsv(int ), (int)287);
            }
            var1_4 += v12.method_6067();
            if (var2_3) ** GOTO lbl25
        }
        if (!var2_3 && !var2_3) ** break;
        ** while (true)
        return var1_4;
    }

    private static /* synthetic */ void dtsk() {
        hi.dmtu[600] = -5638221744367224065L;
        hi.dmtu[601] = -7081866273126865947L;
        hi.dmtu[602] = 4148597353690890110L;
        hi.dmtu[603] = -2974718115432061487L;
        hi.dmtu[604] = -1710747599482740998L;
        hi.dmtu[605] = -8087841501145071869L;
        hi.dmtu[606] = 6957579108705904479L;
        hi.dmtu[607] = 4438165231432325496L;
        hi.dmtu[608] = -5580153787518948868L;
        hi.dmtu[609] = 4007371232375249099L;
        hi.dmtu[610] = 5105016475269076514L;
        hi.dmtu[611] = -5946539209669759011L;
        hi.dmtu[612] = -3123188702828483865L;
        hi.dmtu[613] = 2220688621705570771L;
        hi.dmtu[614] = 2989344564010368232L;
        hi.dmtu[615] = 8114419806237558059L;
        hi.dmtu[616] = -6935839750715210955L;
        hi.dmtu[617] = 3679970650793151434L;
        hi.dmtu[618] = -3335505650923061363L;
        hi.dmtu[619] = 7037182622931027453L;
        hi.dmtu[620] = 2141842374004057758L;
        hi.dmtu[621] = 2564801585159863819L;
        hi.dmtu[622] = 3866039282081857919L;
        hi.dmtu[623] = 5732574951724128682L;
        hi.dmtu[624] = 7898565471871010671L;
        hi.dmtu[625] = 3770028967370288475L;
        hi.dmtu[626] = -8434963933594004830L;
        hi.dmtu[627] = -8521989384115545031L;
        hi.dmtu[628] = 6724198395849733368L;
        hi.dmtu[629] = -5974772262892990765L;
        hi.dmtu[630] = 6550159554913694712L;
        hi.dmtu[631] = 4475937671958823290L;
        hi.dmtu[632] = 2873914075553194064L;
        hi.dmtu[633] = -3795475976169737432L;
        hi.dmtu[634] = 6077564340348726184L;
        hi.dmtu[635] = -4655922757180011166L;
        hi.dmtu[636] = -4898160447744703988L;
        hi.dmtu[637] = -6378031464584158798L;
        hi.dmtu[638] = 4227365345872937730L;
        hi.dmtu[639] = 2431832226318523103L;
        hi.dmtu[640] = 6064859689346463709L;
        hi.dmtu[641] = -829469454020850339L;
        hi.dmtu[642] = -285011707019486381L;
        hi.dmtu[643] = 6244786487491828487L;
        hi.dmtu[644] = 4345786944193939021L;
        hi.dmtu[645] = -8044108548232800770L;
        hi.dmtu[646] = 3985479315548950308L;
        hi.dmtu[647] = -631428763987976394L;
        hi.dmtu[648] = 104221617092434702L;
        hi.dmtu[649] = 538875885606109944L;
        hi.dmtu[650] = 246167625807616823L;
        hi.dmtu[651] = 5822150430219008073L;
        hi.dmtu[652] = 2801632733977519538L;
        hi.dmtu[653] = -7346704001158668470L;
        hi.dmtu[654] = -351431880366446480L;
        hi.dmtu[655] = 6131373475891191701L;
        hi.dmtu[656] = 2964309423986175542L;
        hi.dmtu[657] = 2585061291228750467L;
        hi.dmtu[658] = -3096777663441075161L;
        hi.dmtu[659] = 911663805124423489L;
        hi.dmtu[660] = 794379169048278521L;
        hi.dmtu[661] = 3424957701207750497L;
        hi.dmtu[662] = 3867794974481175949L;
        hi.dmtu[663] = -112672388883414555L;
        hi.dmtu[664] = 8291928584549665408L;
        hi.dmtu[665] = 6343577595238238424L;
        hi.dmtu[666] = 7887454921583763404L;
        hi.dmtu[667] = 2554492427857148999L;
        hi.dmtu[668] = -3160967937471303739L;
        hi.dmtu[669] = -4849252419829322536L;
        hi.dmtu[670] = 3738757889335207334L;
        hi.dmtu[671] = -6258473162628570960L;
        hi.dmtu[672] = -379262747379739618L;
        hi.dmtu[673] = 1072726575108616258L;
        hi.dmtu[674] = -8665679937769178046L;
        hi.dmtu[675] = -2386462588668053140L;
        hi.dmtu[676] = 7502858964175197868L;
        hi.dmtu[677] = -251985968148629294L;
        hi.dmtu[678] = -124923919516239773L;
        hi.dmtu[679] = 8938777802293691262L;
        hi.dmtu[680] = -350774024533436321L;
        hi.dmtu[681] = -2029881196423374632L;
        hi.dmtu[682] = -3356297397704283863L;
        hi.dmtu[683] = 5228937675924598137L;
        hi.dmtu[684] = -3094716989440806505L;
        hi.dmtu[685] = -501906945445435293L;
        hi.dmtu[686] = -8790332240173108197L;
        hi.dmtu[687] = 3753693417600532841L;
        hi.dmtu[688] = -2315299723056289658L;
        hi.dmtu[689] = 945013746047941905L;
        hi.dmtu[690] = -1616934842482574520L;
        hi.dmtu[691] = 2161662944703359812L;
        hi.dmtu[692] = -5677226336331672723L;
        hi.dmtu[693] = -1699605251304547927L;
        hi.dmtu[694] = -8320821962427036701L;
        hi.dmtu[695] = 8124250120464490611L;
        hi.dmtu[696] = -219109863261901065L;
        hi.dmtu[697] = 3142494551576048311L;
        hi.dmtu[698] = -237668079947015939L;
        hi.dmtu[699] = -603256846135979909L;
    }

    private static /* synthetic */ void dsgm() {
        hi.dmsj[900] = 1778882416;
        hi.dmsj[901] = 480809;
        hi.dmsj[902] = -1616346451;
        hi.dmsj[903] = 587009829;
        hi.dmsj[904] = 1446992824;
        hi.dmsj[905] = 1208931103;
        hi.dmsj[906] = -563098882;
        hi.dmsj[907] = -1015638601;
        hi.dmsj[908] = 1225274870;
        hi.dmsj[909] = -67937287;
        hi.dmsj[910] = -1655104011;
        hi.dmsj[911] = 96186797;
        hi.dmsj[912] = 1965686790;
        hi.dmsj[913] = 224488415;
        hi.dmsj[914] = -1211312548;
        hi.dmsj[915] = 1685615524;
        hi.dmsj[916] = -1939462875;
        hi.dmsj[917] = -1686394181;
        hi.dmsj[918] = -1902733665;
        hi.dmsj[919] = 805948792;
        hi.dmsj[920] = 69114699;
        hi.dmsj[921] = 385440122;
        hi.dmsj[922] = 1939661217;
        hi.dmsj[923] = 1051937095;
        hi.dmsj[924] = 688966330;
        hi.dmsj[925] = -1664176185;
        hi.dmsj[926] = 605284565;
        hi.dmsj[927] = -690670729;
        hi.dmsj[928] = 197985859;
        hi.dmsj[929] = 1468333894;
        hi.dmsj[930] = 1572789066;
        hi.dmsj[931] = 753871297;
        hi.dmsj[932] = -1359381096;
        hi.dmsj[933] = 863088402;
        hi.dmsj[934] = -1153224816;
        hi.dmsj[935] = 193350211;
        hi.dmsj[936] = 670680330;
        hi.dmsj[937] = -581409544;
        hi.dmsj[938] = -1044007529;
        hi.dmsj[939] = 684027131;
        hi.dmsj[940] = 1887592380;
        hi.dmsj[941] = -17436588;
        hi.dmsj[942] = 255946768;
        hi.dmsj[943] = 1881219603;
        hi.dmsj[944] = -30283572;
        hi.dmsj[945] = -290010399;
        hi.dmsj[946] = -779847420;
        hi.dmsj[947] = -1732952258;
        hi.dmsj[948] = 422310169;
        hi.dmsj[949] = -869974496;
        hi.dmsj[950] = -423092420;
        hi.dmsj[951] = 767703793;
        hi.dmsj[952] = 1348381044;
        hi.dmsj[953] = -1015216371;
        hi.dmsj[954] = 624444025;
        hi.dmsj[955] = 539351133;
        hi.dmsj[956] = 2079591026;
        hi.dmsj[957] = 722554803;
        hi.dmsj[958] = -1986932293;
        hi.dmsj[959] = -356732300;
        hi.dmsj[960] = -420864605;
        hi.dmsj[961] = 845801513;
        hi.dmsj[962] = -2127047661;
        hi.dmsj[963] = -386851256;
        hi.dmsj[964] = 309604880;
        hi.dmsj[965] = 1279085530;
        hi.dmsj[966] = 140138292;
        hi.dmsj[967] = -1655253211;
        hi.dmsj[968] = 1965835164;
        hi.dmsj[969] = 1453915301;
        hi.dmsj[970] = 1621315225;
        hi.dmsj[971] = -1408667977;
        hi.dmsj[972] = -573532742;
        hi.dmsj[973] = 1787026973;
        hi.dmsj[974] = -830490928;
        hi.dmsj[975] = -1435296049;
        hi.dmsj[976] = 776986881;
        hi.dmsj[977] = 40912326;
        hi.dmsj[978] = -999816471;
        hi.dmsj[979] = 582607542;
        hi.dmsj[980] = -327713855;
        hi.dmsj[981] = -688001888;
        hi.dmsj[982] = -1540917701;
        hi.dmsj[983] = -730118304;
        hi.dmsj[984] = -196316164;
        hi.dmsj[985] = 1907543573;
        hi.dmsj[986] = -336755968;
        hi.dmsj[987] = 434490122;
        hi.dmsj[988] = -252117095;
        hi.dmsj[989] = -1992049246;
        hi.dmsj[990] = 113900995;
        hi.dmsj[991] = -267447987;
        hi.dmsj[992] = 236371785;
        hi.dmsj[993] = 1355283258;
        hi.dmsj[994] = -288973653;
        hi.dmsj[995] = -1993299104;
        hi.dmsj[996] = -961621596;
        hi.dmsj[997] = -1767595214;
        hi.dmsj[998] = 557508612;
        hi.dmsj[999] = 1154272621;
    }

    private static /* synthetic */ void dtmc() {
        hi.dmsj[1700] = -197578556;
        hi.dmsj[1701] = 1622778985;
        hi.dmsj[1702] = 1959297083;
        hi.dmsj[1703] = -1546585035;
        hi.dmsj[1704] = -1458157456;
        hi.dmsj[1705] = 687238776;
        hi.dmsj[1706] = -2035450181;
        hi.dmsj[1707] = -824553334;
        hi.dmsj[1708] = -1093610026;
        hi.dmsj[1709] = 666913911;
        hi.dmsj[1710] = -2124526758;
        hi.dmsj[1711] = -779411607;
        hi.dmsj[1712] = 1492615063;
        hi.dmsj[1713] = 1827114936;
        hi.dmsj[1714] = -856912448;
        hi.dmsj[1715] = -450261964;
        hi.dmsj[1716] = 160999268;
        hi.dmsj[1717] = 1138888293;
        hi.dmsj[1718] = 980902026;
        hi.dmsj[1719] = -1464981251;
        hi.dmsj[1720] = 1181230477;
        hi.dmsj[1721] = -1799075264;
        hi.dmsj[1722] = -927373747;
        hi.dmsj[1723] = 400140976;
        hi.dmsj[1724] = -283180001;
        hi.dmsj[1725] = -1539332555;
        hi.dmsj[1726] = 1502061349;
        hi.dmsj[1727] = -2012346102;
        hi.dmsj[1728] = -799343325;
        hi.dmsj[1729] = -632181338;
        hi.dmsj[1730] = -2085117140;
        hi.dmsj[1731] = -182319674;
        hi.dmsj[1732] = -846191592;
        hi.dmsj[1733] = -634360418;
        hi.dmsj[1734] = -751262183;
        hi.dmsj[1735] = -1242286705;
        hi.dmsj[1736] = -999986127;
        hi.dmsj[1737] = -535552149;
        hi.dmsj[1738] = -248291680;
        hi.dmsj[1739] = -728886090;
        hi.dmsj[1740] = -1363252941;
        hi.dmsj[1741] = -68780720;
        hi.dmsj[1742] = -1397136947;
        hi.dmsj[1743] = -1876944211;
        hi.dmsj[1744] = -1634103720;
        hi.dmsj[1745] = 1665913279;
        hi.dmsj[1746] = -1185677313;
        hi.dmsj[1747] = 314817868;
        hi.dmsj[1748] = 1129275834;
    }

    private static /* synthetic */ void dtmo() {
        hi.dmsk[1100] = 1634539648;
        hi.dmsk[1101] = -746325866;
        hi.dmsk[1102] = 1922856522;
        hi.dmsk[1103] = 1172777829;
        hi.dmsk[1104] = 235222847;
        hi.dmsk[1105] = 1671318813;
        hi.dmsk[1106] = 1863281617;
        hi.dmsk[1107] = 266948301;
        hi.dmsk[1108] = 1413857669;
        hi.dmsk[1109] = 1975417454;
        hi.dmsk[1110] = 1668038175;
        hi.dmsk[1111] = 652089729;
        hi.dmsk[1112] = 813012289;
        hi.dmsk[1113] = 1831368451;
        hi.dmsk[1114] = 1779640493;
        hi.dmsk[1115] = 1382475079;
        hi.dmsk[1116] = -1913736448;
        hi.dmsk[1117] = -775447828;
        hi.dmsk[1118] = 1203253337;
        hi.dmsk[1119] = 2086198332;
        hi.dmsk[1120] = 537739130;
        hi.dmsk[1121] = -1911111869;
        hi.dmsk[1122] = 1705443313;
        hi.dmsk[1123] = 822441505;
        hi.dmsk[1124] = -1733040576;
        hi.dmsk[1125] = 1535969893;
        hi.dmsk[1126] = 1127558428;
        hi.dmsk[1127] = -789142161;
        hi.dmsk[1128] = -866450619;
        hi.dmsk[1129] = 2047817004;
        hi.dmsk[1130] = 957966203;
        hi.dmsk[1131] = -132944029;
        hi.dmsk[1132] = -1562118645;
        hi.dmsk[1133] = -21325962;
        hi.dmsk[1134] = 1605838540;
        hi.dmsk[1135] = -522099203;
        hi.dmsk[1136] = -442686871;
        hi.dmsk[1137] = -2052419271;
        hi.dmsk[1138] = 2138225418;
        hi.dmsk[1139] = 1412421020;
        hi.dmsk[1140] = -786972825;
        hi.dmsk[1141] = 417356227;
        hi.dmsk[1142] = 104354210;
        hi.dmsk[1143] = -1708120856;
        hi.dmsk[1144] = -1424080823;
        hi.dmsk[1145] = -532135050;
        hi.dmsk[1146] = 1071544985;
        hi.dmsk[1147] = -464078050;
        hi.dmsk[1148] = 1024560064;
        hi.dmsk[1149] = -1569723840;
        hi.dmsk[1150] = 1170976121;
        hi.dmsk[1151] = 1954871640;
        hi.dmsk[1152] = 1626526059;
        hi.dmsk[1153] = -594374865;
        hi.dmsk[1154] = 2099385961;
        hi.dmsk[1155] = -1386309162;
        hi.dmsk[1156] = -1222293769;
        hi.dmsk[1157] = -2087345733;
        hi.dmsk[1158] = 814547134;
        hi.dmsk[1159] = 2103218517;
        hi.dmsk[1160] = -983985948;
        hi.dmsk[1161] = 991195965;
        hi.dmsk[1162] = -1972996263;
        hi.dmsk[1163] = 1125921191;
        hi.dmsk[1164] = 2109764495;
        hi.dmsk[1165] = 414133665;
        hi.dmsk[1166] = 887883596;
        hi.dmsk[1167] = 300245376;
        hi.dmsk[1168] = 1372131436;
        hi.dmsk[1169] = -54132390;
        hi.dmsk[1170] = 1110083779;
        hi.dmsk[1171] = 834403725;
        hi.dmsk[1172] = 758068114;
        hi.dmsk[1173] = 1055178390;
        hi.dmsk[1174] = -1788669407;
        hi.dmsk[1175] = 251508426;
        hi.dmsk[1176] = 526546300;
        hi.dmsk[1177] = -1884140110;
        hi.dmsk[1178] = -550930071;
        hi.dmsk[1179] = -70319596;
        hi.dmsk[1180] = -896060147;
        hi.dmsk[1181] = 2004531952;
        hi.dmsk[1182] = 1721698271;
        hi.dmsk[1183] = 1856957693;
        hi.dmsk[1184] = -446779948;
        hi.dmsk[1185] = -1499346585;
        hi.dmsk[1186] = 1261585390;
        hi.dmsk[1187] = 649259999;
        hi.dmsk[1188] = -1246515567;
        hi.dmsk[1189] = 2142716218;
        hi.dmsk[1190] = -1116277428;
        hi.dmsk[1191] = 2087253299;
        hi.dmsk[1192] = -1354910728;
        hi.dmsk[1193] = 1757768972;
        hi.dmsk[1194] = 1631045467;
        hi.dmsk[1195] = 1735360035;
        hi.dmsk[1196] = -1838912588;
        hi.dmsk[1197] = -838501709;
        hi.dmsk[1198] = -1055576622;
        hi.dmsk[1199] = 2042113117;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void cleanupAfterSwap() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hi.ib - hi.dmsl("dqzf", dmts(int ), (int)544)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == hi.dmsl("drda", dmsv(int ), (int)1429)) break;
            v0 /* !! */  = (long)hi.dmsl("drdb", dmsv(int ), (int)1430);
        }
        var3_1 = hi.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hi.ib - hi.dmsl("drdc", dmts(int ), (int)545)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == hi.dmsl("drdd", dmsv(int ), (int)1431)) break;
            v1 /* !! */  = (long)hi.dmsl("drde", dmsv(int ), (int)1432);
        }
        var2_2 /* !! */  = hi.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = hi.ib - hi.dmsl("drdf", dmts(int ), (int)546)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == hi.dmsl("drdg", dmsv(int ), (int)1433)) break;
            v2 /* !! */  = (long)hi.dmsl("drdh", dmsv(int ), (int)1434);
        }
        var1_3 = hi.a;
        if (var3_1) {
            throw null;
lbl21:
            // 3 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl21
        v3 = hi.dmsl("drdi", dmsv(int ), (int)1435);
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_3 = hi.ib - hi.dmsl("drdj", dmts(int ), (int)547)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == hi.dmsl("drdk", dmsv(int ), (int)1436)) break;
            v4 /* !! */  = (long)hi.dmsl("drdl", dmsv(int ), (int)1437);
        }
        this.totemSlot = (int)v3;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl21
                v5 /* !! */  = hi.ib;
                if (true) ** GOTO lbl39
                block26: while (true) {
                    v5 /* !! */  = (long)(v6 - hi.dmsl("drdm", dmts(int ), (int)548));
lbl39:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1146115365: {
                            v6 = hi.dmsl("drdn", dmts(int ), (int)549);
                            continue block26;
                        }
                        case -1007498736: {
                            v6 = hi.dmsl("drdo", dmts(int ), (int)550);
                            continue block26;
                        }
                        case 1059146959: {
                            v6 = hi.dmsl("drdp", dmts(int ), (int)551);
                            continue block26;
                        }
                        case 1228545173: {
                            break block26;
                        }
                    }
                    break;
                }
                v7 = System.currentTimeMillis();
                v8 /* !! */  = hi.ib;
                if (true) ** GOTO lbl56
                block27: while (true) {
                    v8 /* !! */  = (long)(v9 - hi.dmsl("drdq", dmts(int ), (int)552));
lbl56:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -689844497: {
                            v9 = hi.dmsl("drdr", dmts(int ), (int)553);
                            continue block27;
                        }
                        case 1026388875: {
                            v9 = hi.dmsl("drds", dmts(int ), (int)554);
                            continue block27;
                        }
                        case 1228545173: {
                            break block27;
                        }
                    }
                    break;
                }
                this.lastSwapTime = v7;
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)hi.dmsl("drdt", dmsv(int ), (int)1438);
                } while (!var3_1);
                throw null;
            }
lbl73:
            // 3 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)hi.dmsl("drdu", dmsv(int ), (int)1439);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)hi.dmsl("drdv", dmsv(int ), (int)1440);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl95
            }
            case 3: {
                var2_2 /* !! */  = (int)hi.dmsl("drdw", dmsv(int ), (int)1441);
                if (!var3_1) ** GOTO lbl73
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)hi.dmsl("drdx", dmsv(int ), (int)1442);
                if (!var3_1) ** GOTO lbl73
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)hi.dmsl("drdy", dmsv(int ), (int)1443);
                if (var3_1) {
                    throw null;
                }
            }
lbl95:
            // 4 sources

            case 6: {
                var2_2 /* !! */  = (int)hi.dmsl("drdz", dmsv(int ), (int)1444);
                if (!var3_1) break;
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)hi.dmsl("drea", dmsv(int ), (int)1445);
        ** while (!var3_1)
lbl102:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean ensurePlayerInventoryHandler() {
        block129: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = hi.ib - hi.dmsl("dqkd", dmts(int ), (int)369)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == hi.dmsl("dqke", dmsv(int ), (int)1244)) break;
                v0 /* !! */  = (long)hi.dmsl("dqkf", dmsv(int ), (int)1245);
            }
            var3_1 = hi.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = hi.ib - hi.dmsl("dqkg", dmts(int ), (int)370)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == hi.dmsl("dqkh", dmsv(int ), (int)1246)) break;
                v1 /* !! */  = (long)hi.dmsl("dqki", dmsv(int ), (int)1247);
            }
            var2_2 /* !! */  = hi.b;
            v2 /* !! */  = hi.ib;
            if (true) ** GOTO lbl17
            block91: while (true) {
                v2 /* !! */  = (long)(hi.dmsl("dqkk", dmts(int ), (int)372) - hi.dmsl("dqkj", dmts(int ), (int)371));
lbl17:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -348218896: {
                        continue block91;
                    }
                    case 1228545173: {
                        break block91;
                    }
                }
                break;
            }
            var1_3 = hi.a;
            if (var3_1) {
                throw null;
lbl25:
                // 10 sources

                return (boolean)hi.dmsl("dqkl", dmsv(int ), (int)1248);
            }
            if (var1_3 || var1_3) ** GOTO lbl25
            v3 /* !! */  = hi.ib;
            if (true) ** GOTO lbl32
            block93: while (true) {
                v3 /* !! */  = (long)(v4 - hi.dmsl("dqkm", dmts(int ), (int)373));
lbl32:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1318197479: {
                        v4 = hi.dmsl("dqkn", dmts(int ), (int)374);
                        continue block93;
                    }
                    case 920442539: {
                        v4 = hi.dmsl("dqko", dmts(int ), (int)375);
                        continue block93;
                    }
                    case 1228545173: {
                        break block93;
                    }
                }
                break;
            }
            v5 /* !! */  = hi.ib;
            if (true) ** GOTO lbl45
            block94: while (true) {
                v5 /* !! */  = (long)(v6 - hi.dmsl("dqkp", dmts(int ), (int)376));
lbl45:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -544300995: {
                        v6 = hi.dmsl("dqkq", dmts(int ), (int)377);
                        continue block94;
                    }
                    case 979389429: {
                        v6 = hi.dmsl("dqkr", dmts(int ), (int)378);
                        continue block94;
                    }
                    case 1228545173: {
                        break block94;
                    }
                }
                break;
            }
            if (hi.mc.field_1724 == null) break block129;
            if (var1_3) ** GOTO lbl25
            v7 /* !! */  = hi.ib;
            if (true) ** GOTO lbl60
            block95: while (true) {
                v7 /* !! */  = (long)(v8 - hi.dmsl("dqks", dmts(int ), (int)379));
lbl60:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -2046596638: {
                        v8 = hi.dmsl("dqkt", dmts(int ), (int)380);
                        continue block95;
                    }
                    case 1228545173: {
                        break block95;
                    }
                    case 1488286000: {
                        v8 = hi.dmsl("dqku", dmts(int ), (int)381);
                        continue block95;
                    }
                }
                break;
            }
            v9 /* !! */  = hi.ib;
            if (true) ** GOTO lbl73
            block96: while (true) {
                v9 /* !! */  = (long)(hi.dmsl("dqkw", dmts(int ), (int)383) - hi.dmsl("dqkv", dmts(int ), (int)382));
lbl73:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case 913837198: {
                        continue block96;
                    }
                    case 1228545173: {
                        break block96;
                    }
                }
                break;
            }
            if (hi.mc.field_1761 != null) ** GOTO lbl86
            if (var1_3) ** GOTO lbl25
        }
        if (var1_3 || var1_3) ** GOTO lbl25
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return (boolean)hi.dmsl("dqkx", dmsv(int ), (int)1249);
            }
lbl86:
            // 1 sources

            if (var1_3 || var1_3) ** GOTO lbl25
            v10 /* !! */  = hi.ib;
            if (true) ** GOTO lbl91
            block97: while (true) {
                v10 /* !! */  = (long)(v11 - hi.dmsl("dqky", dmts(int ), (int)384));
lbl91:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -1726564803: {
                        v11 = hi.dmsl("dqkz", dmts(int ), (int)385);
                        continue block97;
                    }
                    case 842483176: {
                        v11 = hi.dmsl("dqla", dmts(int ), (int)386);
                        continue block97;
                    }
                    case 1228545173: {
                        break block97;
                    }
                }
                break;
            }
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_2 = hi.ib - hi.dmsl("dqlb", dmts(int ), (int)387)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v12 /* !! */  == hi.dmsl("dqlc", dmsv(int ), (int)1250)) break;
                v12 /* !! */  = (long)hi.dmsl("dqld", dmsv(int ), (int)1251);
            }
            v13 = hi.mc.field_1724;
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_3 = hi.ib - hi.dmsl("dqle", dmts(int ), (int)388)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  == hi.dmsl("dqlf", dmsv(int ), (int)1252)) break;
                v14 /* !! */  = (long)hi.dmsl("dqlg", dmsv(int ), (int)1253);
            }
            v15 = v13.field_7512;
            v16 /* !! */  = hi.ib;
            if (true) ** GOTO lbl116
            block100: while (true) {
                v16 /* !! */  = (long)(v17 - hi.dmsl("dqlh", dmts(int ), (int)389));
lbl116:
                // 2 sources

                switch ((int)v16 /* !! */ ) {
                    case 389049547: {
                        v17 = hi.dmsl("dqli", dmts(int ), (int)390);
                        continue block100;
                    }
                    case 401454602: {
                        v17 = hi.dmsl("dqlj", dmts(int ), (int)391);
                        continue block100;
                    }
                    case 1228545173: {
                        break block100;
                    }
                }
                break;
            }
            while (true) {
                if ((v18 /* !! */  = (cfr_temp_4 = hi.ib - hi.dmsl("dqlk", dmts(int ), (int)392)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v18 /* !! */  == hi.dmsl("dqll", dmsv(int ), (int)1254)) break;
                v18 /* !! */  = (long)hi.dmsl("dqlm", dmsv(int ), (int)1255);
            }
            v19 = hi.mc.field_1724;
            v20 /* !! */  = hi.ib;
            if (true) ** GOTO lbl135
            block102: while (true) {
                v20 /* !! */  = (long)(v21 - hi.dmsl("dqln", dmts(int ), (int)393));
lbl135:
                // 2 sources

                switch ((int)v20 /* !! */ ) {
                    case -560877700: {
                        v21 = hi.dmsl("dqlo", dmts(int ), (int)394);
                        continue block102;
                    }
                    case -550912297: {
                        v21 = hi.dmsl("dqlp", dmts(int ), (int)395);
                        continue block102;
                    }
                    case 385487965: {
                        v21 = hi.dmsl("dqlq", dmts(int ), (int)396);
                        continue block102;
                    }
                    case 1228545173: {
                        break block102;
                    }
                }
                break;
            }
            if (v15 == v19.field_7498) ** GOTO lbl186
            if (var1_3 || var1_3) ** GOTO lbl25
            while (true) {
                if ((v22 /* !! */  = (cfr_temp_5 = hi.ib - hi.dmsl("dqlr", dmts(int ), (int)397)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v22 /* !! */  == hi.dmsl("dqls", dmsv(int ), (int)1256)) break;
                v22 /* !! */  = (long)hi.dmsl("dqlt", dmsv(int ), (int)1257);
            }
            v23 /* !! */  = hi.ib;
            if (true) ** GOTO lbl158
            block104: while (true) {
                v23 /* !! */  = (long)(v24 - hi.dmsl("dqlu", dmts(int ), (int)398));
lbl158:
                // 2 sources

                switch ((int)v23 /* !! */ ) {
                    case 29576352: {
                        v24 = hi.dmsl("dqlv", dmts(int ), (int)399);
                        continue block104;
                    }
                    case 632584816: {
                        v24 = hi.dmsl("dqlw", dmts(int ), (int)400);
                        continue block104;
                    }
                    case 1228545173: {
                        break block104;
                    }
                }
                break;
            }
            v25 = hi.mc.field_1724;
            v26 /* !! */  = hi.ib;
            if (true) ** GOTO lbl172
            block105: while (true) {
                v26 /* !! */  = (long)(v27 - hi.dmsl("dqlx", dmts(int ), (int)401));
lbl172:
                // 2 sources

                switch ((int)v26 /* !! */ ) {
                    case -1103236985: {
                        v27 = hi.dmsl("dqly", dmts(int ), (int)402);
                        continue block105;
                    }
                    case -294032553: {
                        v27 = hi.dmsl("dqlz", dmts(int ), (int)403);
                        continue block105;
                    }
                    case 1228545173: {
                        break block105;
                    }
                    case 1828055861: {
                        v27 = hi.dmsl("dqma", dmts(int ), (int)404);
                        continue block105;
                    }
                }
                break;
            }
            v25.method_7346();
            if (var1_3) ** GOTO lbl25
lbl186:
            // 2 sources

            if (var1_3 || var1_3) ** GOTO lbl25
            v28 /* !! */  = hi.ib;
            if (true) ** GOTO lbl191
            block106: while (true) {
                v28 /* !! */  = (long)(hi.dmsl("dqmc", dmts(int ), (int)406) - hi.dmsl("dqmb", dmts(int ), (int)405));
lbl191:
                // 2 sources

                switch ((int)v28 /* !! */ ) {
                    case -208216875: {
                        continue block106;
                    }
                    case 1228545173: {
                        break block106;
                    }
                }
                break;
            }
            while (true) {
                if ((v29 /* !! */  = (cfr_temp_6 = hi.ib - hi.dmsl("dqmd", dmts(int ), (int)407)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v29 /* !! */  == hi.dmsl("dqme", dmsv(int ), (int)1258)) break;
                v29 /* !! */  = (long)hi.dmsl("dqmf", dmsv(int ), (int)1259);
            }
            v30 = hi.mc.field_1724;
            while (true) {
                if ((v31 /* !! */  = (cfr_temp_7 = hi.ib - hi.dmsl("dqmg", dmts(int ), (int)408)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v31 /* !! */  == hi.dmsl("dqmh", dmsv(int ), (int)1260)) break;
                v31 /* !! */  = (long)hi.dmsl("dqmi", dmsv(int ), (int)1261);
            }
            v32 = v30.field_7512;
            v33 /* !! */  = hi.ib;
            if (true) ** GOTO lbl212
            block109: while (true) {
                v33 /* !! */  = (long)(v34 - hi.dmsl("dqmj", dmts(int ), (int)409));
lbl212:
                // 2 sources

                switch ((int)v33 /* !! */ ) {
                    case -1707164254: {
                        v34 = hi.dmsl("dqmk", dmts(int ), (int)410);
                        continue block109;
                    }
                    case 1228545173: {
                        break block109;
                    }
                    case 1803954634: {
                        v34 = hi.dmsl("dqml", dmts(int ), (int)411);
                        continue block109;
                    }
                }
                break;
            }
            v35 /* !! */  = hi.ib;
            if (true) ** GOTO lbl225
            block110: while (true) {
                v35 /* !! */  = (long)(v36 - hi.dmsl("dqmm", dmts(int ), (int)412));
lbl225:
                // 2 sources

                switch ((int)v35 /* !! */ ) {
                    case -1611894951: {
                        v36 = hi.dmsl("dqmn", dmts(int ), (int)413);
                        continue block110;
                    }
                    case 1228545173: {
                        break block110;
                    }
                    case 1573058203: {
                        v36 = hi.dmsl("dqmo", dmts(int ), (int)414);
                        continue block110;
                    }
                }
                break;
            }
            v37 = hi.mc.field_1724;
            v38 /* !! */  = hi.ib;
            if (true) ** GOTO lbl239
            block111: while (true) {
                v38 /* !! */  = (long)(hi.dmsl("dqmq", dmts(int ), (int)416) - hi.dmsl("dqmp", dmts(int ), (int)415));
lbl239:
                // 2 sources

                switch ((int)v38 /* !! */ ) {
                    case 1228545173: {
                        break block111;
                    }
                    case 1490222141: {
                        continue block111;
                    }
                }
                break;
            }
            if (v32 != v37.field_7498) ** GOTO lbl250
            if (var1_3) ** GOTO lbl25
            v39 = hi.dmsl("dqmr", dmsv(int ), (int)1262);
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl253
lbl250:
            // 1 sources

            if (!var1_3 && !var1_3) ** break;
            ** continue;
            v39 = hi.dmsl("dqms", dmsv(int ), (int)1263);
lbl253:
            // 2 sources

            return (boolean)v39;
lbl254:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)hi.dmsl("dqmt", dmsv(int ), (int)1264);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl330
            }
            case 1: {
                var2_2 /* !! */  = (int)hi.dmsl("dqmu", dmsv(int ), (int)1265);
                if (!var3_1) ** GOTO lbl254
                throw null;
            }
lbl263:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)hi.dmsl("dqmv", dmsv(int ), (int)1266);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl273
            }
lbl268:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)hi.dmsl("dqmw", dmsv(int ), (int)1267);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl326
            }
lbl273:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)hi.dmsl("dqmx", dmsv(int ), (int)1268);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl313
            }
            case 5: {
                var2_2 /* !! */  = (int)hi.dmsl("dqmy", dmsv(int ), (int)1269);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl313
            }
            case 6: {
                var2_2 /* !! */  = (int)hi.dmsl("dqmz", dmsv(int ), (int)1270);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl292
            }
            case 7: {
                var2_2 /* !! */  = (int)hi.dmsl("dqna", dmsv(int ), (int)1271);
                if (!var3_1) ** GOTO lbl254
                throw null;
            }
lbl292:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)hi.dmsl("dqnb", dmsv(int ), (int)1272);
                if (var3_1) {
                    throw null;
                }
            }
lbl296:
            // 5 sources

            case 9: {
                var2_2 /* !! */  = (int)hi.dmsl("dqnc", dmsv(int ), (int)1273);
                if (!var3_1) break;
                throw null;
            }
            case 10: {
                var2_2 /* !! */  = (int)hi.dmsl("dqnd", dmsv(int ), (int)1274);
                if (!var3_1) break;
                throw null;
            }
            case 11: {
                var2_2 /* !! */  = (int)hi.dmsl("dqne", dmsv(int ), (int)1275);
                if (var3_1) {
                    throw null;
                }
            }
            case 12: {
                do {
                    var2_2 /* !! */  = (int)hi.dmsl("dqnf", dmsv(int ), (int)1276);
                } while (!var3_1);
                throw null;
            }
lbl313:
            // 4 sources

            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hi.dmsl("dqng", dmsv(int ), (int)1277);
                    if (!var3_1) ** GOTO lbl263
                    throw null;
                }
            }
            case 14: {
                var2_2 /* !! */  = (int)hi.dmsl("dqnh", dmsv(int ), (int)1278);
                if (!var3_1) ** GOTO lbl313
                throw null;
            }
            case 15: {
                var2_2 /* !! */  = (int)hi.dmsl("dqni", dmsv(int ), (int)1279);
                if (!var3_1) ** GOTO lbl296
                throw null;
            }
lbl326:
            // 2 sources

            case 16: {
                var2_2 /* !! */  = (int)hi.dmsl("dqnj", dmsv(int ), (int)1280);
                if (!var3_1) ** GOTO lbl296
                throw null;
            }
lbl330:
            // 2 sources

            case 17: {
                var2_2 /* !! */  = (int)hi.dmsl("dqnk", dmsv(int ), (int)1281);
                if (!var3_1) ** GOTO lbl268
                throw null;
            }
            case 18: 
        }
        var2_2 /* !! */  = (int)hi.dmsl("dqnl", dmsv(int ), (int)1282);
        ** while (!var3_1)
lbl337:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dsgf() {
        hi.dmsj[200] = -1494139548;
        hi.dmsj[201] = -2058516757;
        hi.dmsj[202] = -332127097;
        hi.dmsj[203] = 1836242374;
        hi.dmsj[204] = -202121748;
        hi.dmsj[205] = 121844272;
        hi.dmsj[206] = 1180325922;
        hi.dmsj[207] = -1148450698;
        hi.dmsj[208] = 651740996;
        hi.dmsj[209] = -763192709;
        hi.dmsj[210] = -2002142063;
        hi.dmsj[211] = -835592762;
        hi.dmsj[212] = 181632262;
        hi.dmsj[213] = -582767016;
        hi.dmsj[214] = 1989989406;
        hi.dmsj[215] = 1097760329;
        hi.dmsj[216] = 1797994425;
        hi.dmsj[217] = 823908480;
        hi.dmsj[218] = -22357259;
        hi.dmsj[219] = 1316362617;
        hi.dmsj[220] = -2119350766;
        hi.dmsj[221] = -1412135348;
        hi.dmsj[222] = 75814518;
        hi.dmsj[223] = -1671386481;
        hi.dmsj[224] = -1916196293;
        hi.dmsj[225] = -1059358180;
        hi.dmsj[226] = 1379305241;
        hi.dmsj[227] = 1241345889;
        hi.dmsj[228] = -569388295;
        hi.dmsj[229] = 1595179273;
        hi.dmsj[230] = -1424145489;
        hi.dmsj[231] = 694403040;
        hi.dmsj[232] = 763467984;
        hi.dmsj[233] = -616997948;
        hi.dmsj[234] = 709034261;
        hi.dmsj[235] = 1609318263;
        hi.dmsj[236] = 1856823748;
        hi.dmsj[237] = -730991972;
        hi.dmsj[238] = 701237695;
        hi.dmsj[239] = 678991512;
        hi.dmsj[240] = -1571189446;
        hi.dmsj[241] = 1954292959;
        hi.dmsj[242] = 1057630200;
        hi.dmsj[243] = -1314967910;
        hi.dmsj[244] = 882610005;
        hi.dmsj[245] = -1064580443;
        hi.dmsj[246] = -1229960153;
        hi.dmsj[247] = 280207011;
        hi.dmsj[248] = 1139367920;
        hi.dmsj[249] = 1331739788;
        hi.dmsj[250] = 181267382;
        hi.dmsj[251] = 217825439;
        hi.dmsj[252] = -1065804484;
        hi.dmsj[253] = 544338642;
        hi.dmsj[254] = 686399853;
        hi.dmsj[255] = 1458348497;
        hi.dmsj[256] = 955353664;
        hi.dmsj[257] = 1221202574;
        hi.dmsj[258] = -301542485;
        hi.dmsj[259] = 1162461813;
        hi.dmsj[260] = -1968550943;
        hi.dmsj[261] = 416480596;
        hi.dmsj[262] = -388341972;
        hi.dmsj[263] = -793487501;
        hi.dmsj[264] = 1233716735;
        hi.dmsj[265] = 1983067078;
        hi.dmsj[266] = 1680773733;
        hi.dmsj[267] = -1797290678;
        hi.dmsj[268] = 876560998;
        hi.dmsj[269] = -1342364779;
        hi.dmsj[270] = 1611221532;
        hi.dmsj[271] = -54846751;
        hi.dmsj[272] = 490097267;
        hi.dmsj[273] = -746092747;
        hi.dmsj[274] = -594728545;
        hi.dmsj[275] = -1663889166;
        hi.dmsj[276] = 1804066612;
        hi.dmsj[277] = 1866898717;
        hi.dmsj[278] = -1684565672;
        hi.dmsj[279] = -1482878193;
        hi.dmsj[280] = 918909917;
        hi.dmsj[281] = 1315403003;
        hi.dmsj[282] = -557875910;
        hi.dmsj[283] = -1401315914;
        hi.dmsj[284] = 1130967518;
        hi.dmsj[285] = 829588357;
        hi.dmsj[286] = 1048868819;
        hi.dmsj[287] = -1870060240;
        hi.dmsj[288] = 1602722212;
        hi.dmsj[289] = -528163211;
        hi.dmsj[290] = 234670501;
        hi.dmsj[291] = -2109499419;
        hi.dmsj[292] = 455039688;
        hi.dmsj[293] = 972812701;
        hi.dmsj[294] = -441359753;
        hi.dmsj[295] = 514209474;
        hi.dmsj[296] = 1952563222;
        hi.dmsj[297] = 1393055125;
        hi.dmsj[298] = -1838375045;
        hi.dmsj[299] = 631243141;
    }

    private static /* synthetic */ void dsgk() {
        hi.dmsj[700] = -1315967371;
        hi.dmsj[701] = -1045111061;
        hi.dmsj[702] = 1953421468;
        hi.dmsj[703] = -1850085731;
        hi.dmsj[704] = -711368696;
        hi.dmsj[705] = 989394428;
        hi.dmsj[706] = 1480302185;
        hi.dmsj[707] = -1392973738;
        hi.dmsj[708] = -1958576438;
        hi.dmsj[709] = 1471371669;
        hi.dmsj[710] = -1504061528;
        hi.dmsj[711] = -573789842;
        hi.dmsj[712] = 50325275;
        hi.dmsj[713] = -1007671406;
        hi.dmsj[714] = -110720679;
        hi.dmsj[715] = -2044057998;
        hi.dmsj[716] = 1543410389;
        hi.dmsj[717] = 2066076498;
        hi.dmsj[718] = 1677793217;
        hi.dmsj[719] = 972215592;
        hi.dmsj[720] = -1783253773;
        hi.dmsj[721] = 1779079515;
        hi.dmsj[722] = -1852678765;
        hi.dmsj[723] = -1240649593;
        hi.dmsj[724] = -1427428282;
        hi.dmsj[725] = 1346946160;
        hi.dmsj[726] = -835255909;
        hi.dmsj[727] = -1323143439;
        hi.dmsj[728] = 1103115606;
        hi.dmsj[729] = -1212699847;
        hi.dmsj[730] = -221767819;
        hi.dmsj[731] = 729967121;
        hi.dmsj[732] = 1178205314;
        hi.dmsj[733] = -2023656534;
        hi.dmsj[734] = -1374475285;
        hi.dmsj[735] = -375002116;
        hi.dmsj[736] = -801977161;
        hi.dmsj[737] = 963960340;
        hi.dmsj[738] = 1779754581;
        hi.dmsj[739] = -1312262888;
        hi.dmsj[740] = 2017025231;
        hi.dmsj[741] = 2022984570;
        hi.dmsj[742] = 371287174;
        hi.dmsj[743] = -888156317;
        hi.dmsj[744] = -1288174588;
        hi.dmsj[745] = 575828570;
        hi.dmsj[746] = 536065505;
        hi.dmsj[747] = 2101936822;
        hi.dmsj[748] = -904539297;
        hi.dmsj[749] = -725583697;
        hi.dmsj[750] = 1095767890;
        hi.dmsj[751] = -2136506456;
        hi.dmsj[752] = -1793073619;
        hi.dmsj[753] = -84385276;
        hi.dmsj[754] = 75159294;
        hi.dmsj[755] = 376213733;
        hi.dmsj[756] = -618057619;
        hi.dmsj[757] = -1412821673;
        hi.dmsj[758] = -1451229270;
        hi.dmsj[759] = -483758720;
        hi.dmsj[760] = 1714699080;
        hi.dmsj[761] = -44028737;
        hi.dmsj[762] = 2003187526;
        hi.dmsj[763] = 716667320;
        hi.dmsj[764] = -480200355;
        hi.dmsj[765] = -1005194242;
        hi.dmsj[766] = 824797361;
        hi.dmsj[767] = 572230623;
        hi.dmsj[768] = 369446493;
        hi.dmsj[769] = 286092997;
        hi.dmsj[770] = -184538251;
        hi.dmsj[771] = 638209972;
        hi.dmsj[772] = -427006211;
        hi.dmsj[773] = 1772204136;
        hi.dmsj[774] = -147260000;
        hi.dmsj[775] = -1843719470;
        hi.dmsj[776] = 1226842091;
        hi.dmsj[777] = 1255100554;
        hi.dmsj[778] = 1865073901;
        hi.dmsj[779] = 387944617;
        hi.dmsj[780] = -961990578;
        hi.dmsj[781] = 2120282849;
        hi.dmsj[782] = 1854286244;
        hi.dmsj[783] = -83846779;
        hi.dmsj[784] = -933157651;
        hi.dmsj[785] = 1783938248;
        hi.dmsj[786] = -536101486;
        hi.dmsj[787] = -341795110;
        hi.dmsj[788] = 1400399949;
        hi.dmsj[789] = 1623915569;
        hi.dmsj[790] = 1552222724;
        hi.dmsj[791] = -1649312786;
        hi.dmsj[792] = 458547692;
        hi.dmsj[793] = 253586520;
        hi.dmsj[794] = 303885741;
        hi.dmsj[795] = -2123623547;
        hi.dmsj[796] = 771107429;
        hi.dmsj[797] = 818007373;
        hi.dmsj[798] = 1964371253;
        hi.dmsj[799] = 1861062589;
    }

    private static /* synthetic */ void dsgq() {
        hi.dmsj[1300] = 1665560609;
        hi.dmsj[1301] = -1780414384;
        hi.dmsj[1302] = 1108789748;
        hi.dmsj[1303] = -583153846;
        hi.dmsj[1304] = 950104753;
        hi.dmsj[1305] = 1122706212;
        hi.dmsj[1306] = 831445624;
        hi.dmsj[1307] = 1302726473;
        hi.dmsj[1308] = 337163825;
        hi.dmsj[1309] = -487440886;
        hi.dmsj[1310] = -1249444370;
        hi.dmsj[1311] = 1186191048;
        hi.dmsj[1312] = 1989591666;
        hi.dmsj[1313] = 1939868026;
        hi.dmsj[1314] = 245613079;
        hi.dmsj[1315] = -1613056759;
        hi.dmsj[1316] = 1719722884;
        hi.dmsj[1317] = -1982968769;
        hi.dmsj[1318] = 1701341733;
        hi.dmsj[1319] = 1044351692;
        hi.dmsj[1320] = -103059760;
        hi.dmsj[1321] = -652017004;
        hi.dmsj[1322] = 368341567;
        hi.dmsj[1323] = -79433547;
        hi.dmsj[1324] = -420231247;
        hi.dmsj[1325] = 1348829706;
        hi.dmsj[1326] = -38933889;
        hi.dmsj[1327] = 823636183;
        hi.dmsj[1328] = -1595204133;
        hi.dmsj[1329] = -2019519669;
        hi.dmsj[1330] = -70126121;
        hi.dmsj[1331] = -1650201740;
        hi.dmsj[1332] = -1980282332;
        hi.dmsj[1333] = -496586577;
        hi.dmsj[1334] = -1565473470;
        hi.dmsj[1335] = -426866072;
        hi.dmsj[1336] = 852009193;
        hi.dmsj[1337] = -393384345;
        hi.dmsj[1338] = -1053999821;
        hi.dmsj[1339] = 1331664836;
        hi.dmsj[1340] = -575722556;
        hi.dmsj[1341] = 398657513;
        hi.dmsj[1342] = 845436917;
        hi.dmsj[1343] = -816751559;
        hi.dmsj[1344] = 1630061754;
        hi.dmsj[1345] = 1323732887;
        hi.dmsj[1346] = 1293695531;
        hi.dmsj[1347] = 2141848729;
        hi.dmsj[1348] = -14453165;
        hi.dmsj[1349] = -1931985963;
        hi.dmsj[1350] = -1240640467;
        hi.dmsj[1351] = 1608235753;
        hi.dmsj[1352] = 138424646;
        hi.dmsj[1353] = 806363164;
        hi.dmsj[1354] = 277587604;
        hi.dmsj[1355] = 777431178;
        hi.dmsj[1356] = -1858056599;
        hi.dmsj[1357] = -2071562414;
        hi.dmsj[1358] = 1009628116;
        hi.dmsj[1359] = -272302963;
        hi.dmsj[1360] = 1154253658;
        hi.dmsj[1361] = 144744617;
        hi.dmsj[1362] = 53610496;
        hi.dmsj[1363] = -909466588;
        hi.dmsj[1364] = -376831047;
        hi.dmsj[1365] = -563044089;
        hi.dmsj[1366] = -756280530;
        hi.dmsj[1367] = -1921367761;
        hi.dmsj[1368] = 623766403;
        hi.dmsj[1369] = -545780507;
        hi.dmsj[1370] = -1375723157;
        hi.dmsj[1371] = 905359570;
        hi.dmsj[1372] = 213781886;
        hi.dmsj[1373] = 988555337;
        hi.dmsj[1374] = 739157824;
        hi.dmsj[1375] = 794555823;
        hi.dmsj[1376] = 177846345;
        hi.dmsj[1377] = -1586596202;
        hi.dmsj[1378] = -1124849056;
        hi.dmsj[1379] = 1312883619;
        hi.dmsj[1380] = 717769004;
        hi.dmsj[1381] = 125023796;
        hi.dmsj[1382] = 823032043;
        hi.dmsj[1383] = 1226798440;
        hi.dmsj[1384] = -1902170028;
        hi.dmsj[1385] = 1341516564;
        hi.dmsj[1386] = -1098634811;
        hi.dmsj[1387] = -1156688204;
        hi.dmsj[1388] = -309404460;
        hi.dmsj[1389] = -1165741606;
        hi.dmsj[1390] = 1734301110;
        hi.dmsj[1391] = 32813785;
        hi.dmsj[1392] = 422518858;
        hi.dmsj[1393] = -659683187;
        hi.dmsj[1394] = -1829839786;
        hi.dmsj[1395] = -1001127571;
        hi.dmsj[1396] = -630981942;
        hi.dmsj[1397] = 1278567868;
        hi.dmsj[1398] = -1767748052;
        hi.dmsj[1399] = -2145866948;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private /* synthetic */ Boolean lambda$new$0() {
        boolean bl2;
        Object object = ib;
        boolean bl3 = true;
        block20: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - hi.dmsl("dsfk", dmts(int ), (int)823);
            }
            switch ((int)object) {
                case -1571480476: {
                    callSite = hi.dmsl("dsfl", dmts(int ), (int)824);
                    continue block20;
                }
                case -1410383725: {
                    callSite = hi.dmsl("dsfm", dmts(int ), (int)825);
                    continue block20;
                }
                case -362323944: {
                    callSite = hi.dmsl("dsfn", dmts(int ), (int)826);
                    continue block20;
                }
                case 1228545173: {
                    break block20;
                }
            }
            break;
        }
        boolean bl4 = c;
        Object object2 = ib;
        boolean bl5 = true;
        block21: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object2 = callSite - hi.dmsl("dsfo", dmts(int ), (int)827);
            }
            switch ((int)object2) {
                case 20099250: {
                    callSite = hi.dmsl("dsfp", dmts(int ), (int)828);
                    continue block21;
                }
                case 924511295: {
                    callSite = hi.dmsl("dsfq", dmts(int ), (int)829);
                    continue block21;
                }
                case 1228545173: {
                    break block21;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = ib - hi.dmsl("dsfr", dmts(int ), (int)830)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == hi.dmsl("dsfs", dmsv(int ), (int)1743)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = hi.dmsl("dsft", dmsv(int ), (int)1744);
        }
        if (bl2) return null;
        if (bl2) return null;
        Object object4 = ib;
        block23: while (true) {
            switch ((int)object4) {
                case -345100317: {
                    object4 = hi.dmsl("dsfv", dmts(int ), (int)832) - hi.dmsl("dsfu", dmts(int ), (int)831);
                    continue block23;
                }
                case 1228545173: {
                    break block23;
                }
            }
            break;
        }
        boolean bl6 = this.check(CHECK_ELYTRA);
        Object object5 = ib;
        boolean bl7 = true;
        block24: while (true) {
            CallSite callSite;
            if (!bl7 || (bl7 = false) || !true) {
                object5 = callSite - hi.dmsl("dsfw", dmts(int ), (int)833);
            }
            switch ((int)object5) {
                case -1456440515: {
                    callSite = hi.dmsl("dsfx", dmts(int ), (int)834);
                    continue block24;
                }
                case 1228545173: {
                    return bl6;
                }
                case 1863260276: {
                    callSite = hi.dmsl("dsfy", dmts(int ), (int)835);
                    continue block24;
                }
            }
            break;
        }
        return bl6;
    }

    static {
        dmsk = new int[1749];
        hi.dsgd();
        hi.dsge();
        hi.dsgf();
        hi.dsgg();
        hi.dsgh();
        hi.dsgi();
        hi.dsgj();
        hi.dsgk();
        hi.dsgl();
        hi.dsgm();
        hi.dsgn();
        hi.dsgo();
        hi.dsgp();
        hi.dsgq();
        hi.dsgz();
        hi.dtma();
        hi.dtmb();
        hi.dtmc();
        hi.dtmd();
        hi.dtme();
        hi.dtmf();
        hi.dtmg();
        hi.dtmh();
        hi.dtmi();
        hi.dtmj();
        hi.dtmk();
        hi.dtml();
        hi.dtmm();
        hi.dtmn();
        hi.dtmo();
        hi.dtmp();
        hi.dtmq();
        hi.dtmr();
        hi.dtms();
        hi.dtmt();
        hi.dtmu();
        dmtt = new long[836];
        dmtu = new long[836];
        hi.dtmv();
        hi.dtmw();
        hi.dtmx();
        hi.dtmy();
        hi.dtnd();
        hi.dtnt();
        hi.dtom();
        hi.dtpa();
        hi.dtpv();
        hi.dtpy();
        hi.dtqq();
        hi.dtrh();
        hi.dtrw();
        hi.dtsg();
        hi.dtsi();
        hi.dtsk();
        hi.dtsm();
        hi.dtsn();
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void startTotemPlacement(boolean bl2) {
        int n2;
        boolean bl3;
        block74: {
            nu nu2;
            boolean bl4;
            block77: {
                class_1799 class_17992;
                block78: {
                    block76: {
                        block75: {
                            bl3 = c;
                            n2 = b;
                            bl4 = a;
                            if (bl3) {
                                throw null;
                            }
                            if (bl4 || bl4) break block74;
                            nu2 = this.findTotem((boolean)hi.dmsl("dpdb", dmsv(int ), (int)847));
                            if (bl4 || bl4) break block74;
                            if (nu2.found()) break block75;
                            if (bl4) break block74;
                            if (!bl2) break block75;
                            if (bl4 || bl4) break block74;
                            nu2 = this.findTotem((boolean)hi.dmsl("dpdc", dmsv(int ), (int)848));
                            if (bl4) break block74;
                        }
                        if (bl4 || bl4) break block74;
                        if (nu2.found()) break block76;
                        if (!bl4 && !bl4) {
                            return;
                        }
                        break block74;
                    }
                    if (bl4 || bl4) break block74;
                    if (!this.revertItem.isValue()) break block77;
                    if (bl4) break block74;
                    if (!this.itemHistory.isEmpty()) break block77;
                    if (bl4 || bl4) break block74;
                    class_17992 = hi.mc.field_1724.method_6079();
                    if (bl4 || bl4) break block74;
                    if (class_17992.method_7960()) break block77;
                    if (bl4 || bl4) break block74;
                    if (class_17992.method_7909() != class_1802.field_8288) break block78;
                    if (bl4) break block74;
                    if (!this.hasSpecialProperties(class_17992)) break block77;
                    if (bl4) break block74;
                }
                if (bl4 || bl4) break block74;
                this.itemHistory.push(class_17992.method_7972());
                if (bl4 || bl4) break block74;
                this.rememberedItemSlot = nu2.slot();
                if (bl4 || bl4) break block74;
                this.awaitingInitialDisplacement = hi.dmsl("dpdd", dmsv(int ), (int)849);
                if (bl4) break block74;
            }
            if (!bl4 && !bl4) {
                this.totemSlot = nu2.slot();
                if (!bl4 && !bl4) {
                    nz.queueSwap(SWAP_ID, (int)hi.dmsl("dpde", dmsv(int ), (int)850), this::executeTotemSwap, this.createSwapSettings(), this::cleanupAfterSwap);
                    if (!bl4 && !bl4) {
                        this.flushFastSwap();
                        if (!bl4 && !bl4) {
                            return;
                        }
                    }
                }
            }
        }
        if (n2 == 0) return;
        int n3 = Integer.MIN_VALUE;
        block43: do {
            switch (n3 == Integer.MIN_VALUE ? n2 : n3) {
                default: {
                    return;
                }
                case 0: {
                    CallSite callSite = hi.dmsl("dpdf", dmsv(int ), (int)851);
                    n3 = 24;
                    if (!bl3) continue block43;
                    throw null;
                }
                case 2: {
                    CallSite callSite = hi.dmsl("dpdh", dmsv(int ), (int)853);
                    n3 = 28;
                    if (!bl3) continue block43;
                    throw null;
                }
                case 6: {
                    CallSite callSite = hi.dmsl("dpdl", dmsv(int ), (int)857);
                    if (bl3) {
                        throw null;
                    }
                }
                case 7: {
                    CallSite callSite = hi.dmsl("dpdm", dmsv(int ), (int)858);
                    n3 = 30;
                    if (!bl3) continue block43;
                    throw null;
                }
                case 8: {
                    CallSite callSite = hi.dmsl("dpdn", dmsv(int ), (int)859);
                    n3 = 14;
                    if (!bl3) continue block43;
                    throw null;
                }
                case 9: {
                    CallSite callSite = hi.dmsl("dpdo", dmsv(int ), (int)860);
                    if (bl3) {
                        throw null;
                    }
                }
                case 4: {
                    CallSite callSite = hi.dmsl("dpdj", dmsv(int ), (int)855);
                    n3 = 1;
                    if (!bl3) continue block43;
                    throw null;
                }
                case 11: {
                    CallSite callSite = hi.dmsl("dpdq", dmsv(int ), (int)862);
                    n3 = 30;
                    if (!bl3) continue block43;
                    throw null;
                }
                case 13: {
                    CallSite callSite = hi.dmsl("dpds", dmsv(int ), (int)864);
                    if (bl3) {
                        throw null;
                    }
                }
                case 3: {
                    CallSite callSite = hi.dmsl("dpdi", dmsv(int ), (int)854);
                    n3 = 28;
                    if (!bl3) continue block43;
                    throw null;
                }
                case 15: {
                    CallSite callSite = hi.dmsl("dpdu", dmsv(int ), (int)866);
                    n3 = 20;
                    if (!bl3) continue block43;
                    throw null;
                }
                case 16: {
                    CallSite callSite = hi.dmsl("dpdv", dmsv(int ), (int)867);
                    n3 = 12;
                    if (!bl3) continue block43;
                    throw null;
                }
                case 19: {
                    CallSite callSite = hi.dmsl("dpdy", dmsv(int ), (int)870);
                    n3 = 14;
                    if (!bl3) continue block43;
                    throw null;
                }
                case 21: {
                    CallSite callSite = hi.dmsl("dpea", dmsv(int ), (int)872);
                    if (bl3) {
                        throw null;
                    }
                }
                case 17: {
                    CallSite callSite = hi.dmsl("dpdw", dmsv(int ), (int)868);
                    if (bl3) {
                        throw null;
                    }
                }
                case 18: {
                    CallSite callSite = hi.dmsl("dpdx", dmsv(int ), (int)869);
                    if (bl3) {
                        throw null;
                    }
                }
                case 20: {
                    CallSite callSite = hi.dmsl("dpdz", dmsv(int ), (int)871);
                    if (!bl3) break;
                    throw null;
                }
                case 22: {
                    CallSite callSite = hi.dmsl("dpeb", dmsv(int ), (int)873);
                    if (bl3) {
                        throw null;
                    }
                }
                case 12: {
                    CallSite callSite = hi.dmsl("dpdr", dmsv(int ), (int)863);
                    if (bl3) {
                        throw null;
                    }
                }
                case 14: {
                    CallSite callSite = hi.dmsl("dpdt", dmsv(int ), (int)865);
                    n3 = 24;
                    if (!bl3) continue block43;
                    throw null;
                }
                case 26: {
                    CallSite callSite = hi.dmsl("dpef", dmsv(int ), (int)877);
                    if (bl3) {
                        throw null;
                    }
                }
                case 1: {
                    CallSite callSite = hi.dmsl("dpdg", dmsv(int ), (int)852);
                    n3 = 30;
                    if (!bl3) continue block43;
                    throw null;
                }
                case 27: {
                    CallSite callSite = hi.dmsl("dpeg", dmsv(int ), (int)878);
                    n3 = 34;
                    if (!bl3) continue block43;
                    throw null;
                }
                case 29: {
                    CallSite callSite = hi.dmsl("dpei", dmsv(int ), (int)880);
                    if (bl3) {
                        throw null;
                    }
                }
                case 10: {
                    CallSite callSite = hi.dmsl("dpdp", dmsv(int ), (int)861);
                    n3 = 24;
                    if (!bl3) continue block43;
                    throw null;
                }
                case 33: {
                    CallSite callSite = hi.dmsl("dpem", dmsv(int ), (int)884);
                    if (bl3) {
                        throw null;
                    }
                }
                case 28: {
                    CallSite callSite = hi.dmsl("dpeh", dmsv(int ), (int)879);
                    n3 = 38;
                    if (!bl3) continue block43;
                    throw null;
                }
                case 34: {
                    CallSite callSite = hi.dmsl("dpen", dmsv(int ), (int)885);
                    if (bl3) {
                        throw null;
                    }
                }
                case 31: {
                    CallSite callSite = hi.dmsl("dpek", dmsv(int ), (int)882);
                    if (bl3) {
                        throw null;
                    }
                }
                case 5: {
                    CallSite callSite = hi.dmsl("dpdk", dmsv(int ), (int)856);
                    if (bl3) {
                        throw null;
                    }
                }
                case 24: {
                    do {
                        CallSite callSite = hi.dmsl("dped", dmsv(int ), (int)875);
                    } while (!bl3);
                    throw null;
                }
                case 35: {
                    CallSite callSite = hi.dmsl("dpeo", dmsv(int ), (int)886);
                    if (!bl3) break;
                    throw null;
                }
                case 36: {
                    CallSite callSite = hi.dmsl("dpep", dmsv(int ), (int)887);
                    n3 = 38;
                    if (!bl3) continue block43;
                    throw null;
                }
                case 37: {
                    CallSite callSite = hi.dmsl("dpeq", dmsv(int ), (int)888);
                    if (bl3) {
                        throw null;
                    }
                }
                case 30: {
                    CallSite callSite = hi.dmsl("dpej", dmsv(int ), (int)881);
                    if (!bl3) break;
                    throw null;
                }
                case 38: {
                    CallSite callSite = hi.dmsl("dper", dmsv(int ), (int)889);
                    if (bl3) {
                        throw null;
                    }
                }
                case 23: {
                    CallSite callSite = hi.dmsl("dpec", dmsv(int ), (int)874);
                    if (!bl3) break;
                    throw null;
                }
                case 39: {
                    CallSite callSite = hi.dmsl("dpes", dmsv(int ), (int)890);
                    if (bl3) {
                        throw null;
                    }
                }
                case 25: {
                    CallSite callSite = hi.dmsl("dpee", dmsv(int ), (int)876);
                    if (bl3) {
                        throw null;
                    }
                }
                case 32: {
                    CallSite callSite = hi.dmsl("dpel", dmsv(int ), (int)883);
                    if (!bl3) break;
                    throw null;
                }
                case 40: 
            }
            break;
        } while (true);
        do {
            CallSite callSite = hi.dmsl("dpet", dmsv(int ), (int)891);
        } while (!bl3);
        throw null;
    }

    private static /* synthetic */ void dtmn() {
        hi.dmsk[1000] = 1547768244;
        hi.dmsk[1001] = -1797042570;
        hi.dmsk[1002] = 44481371;
        hi.dmsk[1003] = -923950240;
        hi.dmsk[1004] = 300840569;
        hi.dmsk[1005] = 1962340403;
        hi.dmsk[1006] = -2075052910;
        hi.dmsk[1007] = -1173023121;
        hi.dmsk[1008] = 1703095178;
        hi.dmsk[1009] = 1179363314;
        hi.dmsk[1010] = -1076054591;
        hi.dmsk[1011] = -1377118235;
        hi.dmsk[1012] = -1799641867;
        hi.dmsk[1013] = 1939176048;
        hi.dmsk[1014] = -943487836;
        hi.dmsk[1015] = -1785252077;
        hi.dmsk[1016] = -1467316675;
        hi.dmsk[1017] = 1813478312;
        hi.dmsk[1018] = -567759802;
        hi.dmsk[1019] = 1278770057;
        hi.dmsk[1020] = -1414892742;
        hi.dmsk[1021] = -1194676366;
        hi.dmsk[1022] = -2009736369;
        hi.dmsk[1023] = -1352188513;
        hi.dmsk[1024] = 1472223399;
        hi.dmsk[1025] = -1132299913;
        hi.dmsk[1026] = 2028129285;
        hi.dmsk[1027] = -1876433300;
        hi.dmsk[1028] = 860854961;
        hi.dmsk[1029] = -1458946889;
        hi.dmsk[1030] = 550630047;
        hi.dmsk[1031] = 1626605350;
        hi.dmsk[1032] = -1703395745;
        hi.dmsk[1033] = -1108972126;
        hi.dmsk[1034] = -840684085;
        hi.dmsk[1035] = 355440709;
        hi.dmsk[1036] = -1810800438;
        hi.dmsk[1037] = -773577149;
        hi.dmsk[1038] = 1534648767;
        hi.dmsk[1039] = -777905872;
        hi.dmsk[1040] = -104679024;
        hi.dmsk[1041] = 1256201327;
        hi.dmsk[1042] = 824180081;
        hi.dmsk[1043] = 726141387;
        hi.dmsk[1044] = -689940779;
        hi.dmsk[1045] = -1208924285;
        hi.dmsk[1046] = 294797365;
        hi.dmsk[1047] = -1060509356;
        hi.dmsk[1048] = 1819776394;
        hi.dmsk[1049] = 145468751;
        hi.dmsk[1050] = 792049066;
        hi.dmsk[1051] = -329003409;
        hi.dmsk[1052] = -1912808975;
        hi.dmsk[1053] = -1467053487;
        hi.dmsk[1054] = -99382313;
        hi.dmsk[1055] = -182064002;
        hi.dmsk[1056] = 1392364640;
        hi.dmsk[1057] = 1194346789;
        hi.dmsk[1058] = -1848465520;
        hi.dmsk[1059] = 1009228342;
        hi.dmsk[1060] = -1774969276;
        hi.dmsk[1061] = -403833540;
        hi.dmsk[1062] = 1369217822;
        hi.dmsk[1063] = 432778607;
        hi.dmsk[1064] = 361831272;
        hi.dmsk[1065] = -838118196;
        hi.dmsk[1066] = -1308040418;
        hi.dmsk[1067] = 1104035898;
        hi.dmsk[1068] = 1905953655;
        hi.dmsk[1069] = 126563847;
        hi.dmsk[1070] = 142904745;
        hi.dmsk[1071] = -1346292936;
        hi.dmsk[1072] = -1191860289;
        hi.dmsk[1073] = 953711502;
        hi.dmsk[1074] = 711634869;
        hi.dmsk[1075] = 35520809;
        hi.dmsk[1076] = -1752880841;
        hi.dmsk[1077] = 282690600;
        hi.dmsk[1078] = -26981190;
        hi.dmsk[1079] = 1298708419;
        hi.dmsk[1080] = -481578301;
        hi.dmsk[1081] = -1618966098;
        hi.dmsk[1082] = -957573992;
        hi.dmsk[1083] = 1816734148;
        hi.dmsk[1084] = -594273355;
        hi.dmsk[1085] = 60158794;
        hi.dmsk[1086] = -952067145;
        hi.dmsk[1087] = -1841516982;
        hi.dmsk[1088] = -1896522089;
        hi.dmsk[1089] = 156010204;
        hi.dmsk[1090] = 1069874125;
        hi.dmsk[1091] = 2073322124;
        hi.dmsk[1092] = -1246460336;
        hi.dmsk[1093] = -267026582;
        hi.dmsk[1094] = 107804564;
        hi.dmsk[1095] = -1279166761;
        hi.dmsk[1096] = -2029325023;
        hi.dmsk[1097] = -1378093172;
        hi.dmsk[1098] = 1534468092;
        hi.dmsk[1099] = -860207086;
    }

    private static /* synthetic */ void dtmd() {
        hi.dmsk[0] = -1991944303;
        hi.dmsk[1] = 1204438588;
        hi.dmsk[2] = 1848280348;
        hi.dmsk[3] = 161631516;
        hi.dmsk[4] = -882765659;
        hi.dmsk[5] = 801632828;
        hi.dmsk[6] = 202963461;
        hi.dmsk[7] = 1127870787;
        hi.dmsk[8] = -382984760;
        hi.dmsk[9] = -62098523;
        hi.dmsk[10] = -2006035060;
        hi.dmsk[11] = 1483680132;
        hi.dmsk[12] = 577471973;
        hi.dmsk[13] = 24275079;
        hi.dmsk[14] = 1997545509;
        hi.dmsk[15] = -184485156;
        hi.dmsk[16] = 1441482937;
        hi.dmsk[17] = -394770950;
        hi.dmsk[18] = -441702656;
        hi.dmsk[19] = 1774178287;
        hi.dmsk[20] = 1273098682;
        hi.dmsk[21] = 1953479471;
        hi.dmsk[22] = 1540989838;
        hi.dmsk[23] = 1776018495;
        hi.dmsk[24] = -1332349643;
        hi.dmsk[25] = -82333247;
        hi.dmsk[26] = 1369888579;
        hi.dmsk[27] = 1339207323;
        hi.dmsk[28] = 1980251061;
        hi.dmsk[29] = 1810202448;
        hi.dmsk[30] = 2105417630;
        hi.dmsk[31] = -2106123184;
        hi.dmsk[32] = 1333380710;
        hi.dmsk[33] = -1051802954;
        hi.dmsk[34] = 554000715;
        hi.dmsk[35] = 2062644254;
        hi.dmsk[36] = -1544678859;
        hi.dmsk[37] = -635394506;
        hi.dmsk[38] = 1261982899;
        hi.dmsk[39] = 460005972;
        hi.dmsk[40] = 224746297;
        hi.dmsk[41] = -865926425;
        hi.dmsk[42] = -889991598;
        hi.dmsk[43] = -2034945699;
        hi.dmsk[44] = -138270663;
        hi.dmsk[45] = 379769523;
        hi.dmsk[46] = -25800313;
        hi.dmsk[47] = 1205382731;
        hi.dmsk[48] = 2130155478;
        hi.dmsk[49] = 1433967046;
        hi.dmsk[50] = -262978168;
        hi.dmsk[51] = -1548147225;
        hi.dmsk[52] = -737633773;
        hi.dmsk[53] = 261127117;
        hi.dmsk[54] = 501265541;
        hi.dmsk[55] = 481910537;
        hi.dmsk[56] = -419250665;
        hi.dmsk[57] = 318894176;
        hi.dmsk[58] = -190883572;
        hi.dmsk[59] = 604621499;
        hi.dmsk[60] = -1941201490;
        hi.dmsk[61] = -1126810057;
        hi.dmsk[62] = 387187739;
        hi.dmsk[63] = -1624209228;
        hi.dmsk[64] = 2097967843;
        hi.dmsk[65] = 644532903;
        hi.dmsk[66] = -1469266046;
        hi.dmsk[67] = 1930566889;
        hi.dmsk[68] = 958340906;
        hi.dmsk[69] = 45270735;
        hi.dmsk[70] = -295937851;
        hi.dmsk[71] = -946100168;
        hi.dmsk[72] = 1168993652;
        hi.dmsk[73] = 842325620;
        hi.dmsk[74] = 352964093;
        hi.dmsk[75] = -857287053;
        hi.dmsk[76] = -244458046;
        hi.dmsk[77] = -782091358;
        hi.dmsk[78] = 775764029;
        hi.dmsk[79] = 2049036884;
        hi.dmsk[80] = 2139339788;
        hi.dmsk[81] = -1597956677;
        hi.dmsk[82] = 1840115482;
        hi.dmsk[83] = -1469184850;
        hi.dmsk[84] = 336544101;
        hi.dmsk[85] = 21056978;
        hi.dmsk[86] = -1897164691;
        hi.dmsk[87] = -1920003355;
        hi.dmsk[88] = 1413227355;
        hi.dmsk[89] = 393413689;
        hi.dmsk[90] = 577812567;
        hi.dmsk[91] = 2045169824;
        hi.dmsk[92] = -1885391453;
        hi.dmsk[93] = -1026682024;
        hi.dmsk[94] = 450540932;
        hi.dmsk[95] = 735189180;
        hi.dmsk[96] = 1117389302;
        hi.dmsk[97] = 1522559936;
        hi.dmsk[98] = 1899085236;
        hi.dmsk[99] = -2092580477;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private nu findTotem(boolean var1_1) {
        block139: {
            block138: {
                block140: {
                    var6_2 = hi.c;
                    var5_3 /* !! */  = hi.b;
                    var4_4 = hi.a;
                    if (var6_2) {
                        throw null;
lbl6:
                        // 37 sources

                        return null;
                    }
                    if (var4_4 || var4_4) ** GOTO lbl6
                    if (hi.mc.field_1724 != null) break block140;
                    if (var4_4 || var4_4) ** GOTO lbl6
                    return nu.notFound();
                }
                if (var4_4 || var4_4) ** GOTO lbl6
                if (!this.saveTalismans.isValue()) break block139;
                if (var4_4) ** GOTO lbl6
                if (var1_1) break block139;
                if (var4_4 || var4_4) ** GOTO lbl6
                var2_5 = hi.dmsl("doyf", dmsv(int ), (int)735);
                if (var4_4) ** GOTO lbl6
                do {
                    block141: {
                        if (var4_4 || var4_4) ** GOTO lbl6
                        if (var2_5 >= hi.dmsl("doyg", dmsv(int ), (int)736)) break block138;
                        if (var4_4 || var4_4) ** GOTO lbl6
                        var3_6 = hi.mc.field_1724.method_31548().method_5438((int)var2_5);
                        if (var4_4 || var4_4) ** GOTO lbl6
                        if (!this.isValidTotem(var3_6, (boolean)hi.dmsl("doyh", dmsv(int ), (int)737))) break block141;
                        if (var4_4 || var4_4) ** GOTO lbl6
                        return nu.of((int)var2_5, var3_6);
                    }
                    if (var4_4 || var4_4) ** GOTO lbl6
                    ++var2_5;
                    if (var4_4) ** GOTO lbl6
                } while (!var6_2);
                throw null;
            }
            if (var4_4 || var4_4) ** GOTO lbl6
            var2_5 = hi.dmsl("doyi", dmsv(int ), (int)738);
            if (var4_4) ** GOTO lbl6
            do {
                block142: {
                    if (var4_4 || var4_4) ** GOTO lbl6
                    if (var2_5 >= hi.dmsl("doyj", dmsv(int ), (int)739)) break block139;
                    if (var4_4 || var4_4) ** GOTO lbl6
                    var3_6 = hi.mc.field_1724.method_31548().method_5438((int)var2_5);
                    if (var4_4 || var4_4) ** GOTO lbl6
                    if (!this.isValidTotem(var3_6, (boolean)hi.dmsl("doyk", dmsv(int ), (int)740))) break block142;
                    if (var4_4 || var4_4) ** GOTO lbl6
                    return nu.of((int)(var2_5 + hi.dmsl("doyl", dmsv(int ), (int)741)), var3_6);
                }
                if (var4_4 || var4_4) ** GOTO lbl6
                ++var2_5;
                if (var4_4) ** GOTO lbl6
            } while (!var6_2);
            throw null;
        }
        if (var4_4 || var4_4) ** GOTO lbl6
        var2_5 = hi.dmsl("doym", dmsv(int ), (int)742);
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4) ** GOTO lbl6
                do {
                    if (var4_4 || var4_4) ** GOTO lbl6
                    if (var2_5 >= hi.dmsl("doyn", dmsv(int ), (int)743)) ** GOTO lbl75
                    if (var4_4 || var4_4) ** GOTO lbl6
                    var3_6 = hi.mc.field_1724.method_31548().method_5438((int)var2_5);
                    if (var4_4 || var4_4) ** GOTO lbl6
                    if (!this.isValidTotem(var3_6, (boolean)hi.dmsl("doyo", dmsv(int ), (int)744))) ** GOTO lbl70
                    if (var4_4 || var4_4) ** GOTO lbl6
                    return nu.of((int)var2_5, var3_6);
lbl70:
                    // 1 sources

                    if (var4_4 || var4_4) ** GOTO lbl6
                    ++var2_5;
                    if (var4_4) ** GOTO lbl6
                } while (!var6_2);
                throw null;
lbl75:
                // 1 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                var2_5 = hi.dmsl("doyp", dmsv(int ), (int)745);
                if (var4_4) ** GOTO lbl6
                do {
                    if (var4_4 || var4_4) ** GOTO lbl6
                    if (var2_5 >= hi.dmsl("doyq", dmsv(int ), (int)746)) ** GOTO lbl92
                    if (var4_4 || var4_4) ** GOTO lbl6
                    var3_6 = hi.mc.field_1724.method_31548().method_5438((int)var2_5);
                    if (var4_4 || var4_4) ** GOTO lbl6
                    if (!this.isValidTotem(var3_6, (boolean)hi.dmsl("doyr", dmsv(int ), (int)747))) ** GOTO lbl87
                    if (var4_4 || var4_4) ** GOTO lbl6
                    return nu.of((int)(var2_5 + hi.dmsl("doys", dmsv(int ), (int)748)), var3_6);
lbl87:
                    // 1 sources

                    if (var4_4 || var4_4) ** GOTO lbl6
                    ++var2_5;
                    if (var4_4) ** GOTO lbl6
                } while (!var6_2);
                throw null;
lbl92:
                // 1 sources

                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return nu.notFound();
            }
lbl95:
            // 2 sources

            case 0: {
                var5_3 /* !! */  = (int)hi.dmsl("doyt", dmsv(int ), (int)749);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl174
            }
            case 1: {
                var5_3 /* !! */  = (int)hi.dmsl("doyu", dmsv(int ), (int)750);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl357
            }
lbl105:
            // 3 sources

            case 2: {
                var5_3 /* !! */  = (int)hi.dmsl("doyv", dmsv(int ), (int)751);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl333
            }
lbl110:
            // 4 sources

            case 3: {
                var5_3 /* !! */  = (int)hi.dmsl("doyw", dmsv(int ), (int)752);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl179
            }
            case 4: {
                var5_3 /* !! */  = (int)hi.dmsl("doyx", dmsv(int ), (int)753);
                if (!var6_2) ** GOTO lbl110
                throw null;
            }
lbl119:
            // 2 sources

            case 5: {
                var5_3 /* !! */  = (int)hi.dmsl("doyy", dmsv(int ), (int)754);
                if (!var6_2) break;
                throw null;
            }
lbl123:
            // 2 sources

            case 6: {
                var5_3 /* !! */  = (int)hi.dmsl("doyz", dmsv(int ), (int)755);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl128:
            // 2 sources

            case 7: {
                var5_3 /* !! */  = (int)hi.dmsl("doza", dmsv(int ), (int)756);
                if (!var6_2) ** GOTO lbl95
                throw null;
            }
lbl132:
            // 4 sources

            case 8: {
                var5_3 /* !! */  = (int)hi.dmsl("dozb", dmsv(int ), (int)757);
                if (!var6_2) ** GOTO lbl123
                throw null;
            }
lbl136:
            // 4 sources

            case 9: {
                var5_3 /* !! */  = (int)hi.dmsl("dozc", dmsv(int ), (int)758);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl277
            }
lbl141:
            // 2 sources

            case 10: {
                var5_3 /* !! */  = (int)hi.dmsl("dozd", dmsv(int ), (int)759);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl345
            }
lbl146:
            // 3 sources

            case 11: {
                var5_3 /* !! */  = (int)hi.dmsl("doze", dmsv(int ), (int)760);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl254
            }
            case 12: {
                var5_3 /* !! */  = (int)hi.dmsl("dozf", dmsv(int ), (int)761);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl291
            }
            case 13: {
                var5_3 /* !! */  = (int)hi.dmsl("dozg", dmsv(int ), (int)762);
                if (!var6_2) ** GOTO lbl110
                throw null;
            }
            case 14: {
                var5_3 /* !! */  = (int)hi.dmsl("dozh", dmsv(int ), (int)763);
                if (!var6_2) ** GOTO lbl146
                throw null;
            }
            case 15: {
                do {
                    var5_3 /* !! */  = (int)hi.dmsl("dozi", dmsv(int ), (int)764);
                } while (!var6_2);
                throw null;
            }
lbl169:
            // 3 sources

            case 16: {
                var5_3 /* !! */  = (int)hi.dmsl("dozj", dmsv(int ), (int)765);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl361
            }
lbl174:
            // 3 sources

            case 17: {
                var5_3 /* !! */  = (int)hi.dmsl("dozk", dmsv(int ), (int)766);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl263
            }
lbl179:
            // 3 sources

            case 18: {
                var5_3 /* !! */  = (int)hi.dmsl("dozl", dmsv(int ), (int)767);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl399
            }
            case 19: {
                var5_3 /* !! */  = (int)hi.dmsl("dozm", dmsv(int ), (int)768);
                if (!var6_2) ** GOTO lbl169
                throw null;
            }
lbl188:
            // 3 sources

            case 20: {
                var5_3 /* !! */  = (int)hi.dmsl("dozn", dmsv(int ), (int)769);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl213
            }
            case 21: {
                var5_3 /* !! */  = (int)hi.dmsl("dozo", dmsv(int ), (int)770);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl300
            }
            case 22: {
                var5_3 /* !! */  = (int)hi.dmsl("dozp", dmsv(int ), (int)771);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl365
            }
            case 23: {
                var5_3 /* !! */  = (int)hi.dmsl("dozq", dmsv(int ), (int)772);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl369
            }
            case 24: {
                var5_3 /* !! */  = (int)hi.dmsl("dozr", dmsv(int ), (int)773);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl263
            }
lbl213:
            // 4 sources

            case 25: {
                var5_3 /* !! */  = (int)hi.dmsl("dozs", dmsv(int ), (int)774);
                if (!var6_2) ** GOTO lbl141
                throw null;
            }
            case 26: {
                var5_3 /* !! */  = (int)hi.dmsl("dozt", dmsv(int ), (int)775);
                if (!var6_2) ** GOTO lbl105
                throw null;
            }
lbl221:
            // 2 sources

            case 27: {
                var5_3 /* !! */  = (int)hi.dmsl("dozu", dmsv(int ), (int)776);
                if (!var6_2) ** GOTO lbl105
                throw null;
            }
            case 28: {
                var5_3 /* !! */  = (int)hi.dmsl("dozv", dmsv(int ), (int)777);
                if (!var6_2) ** GOTO lbl213
                throw null;
            }
lbl229:
            // 3 sources

            case 29: {
                var5_3 /* !! */  = (int)hi.dmsl("dozw", dmsv(int ), (int)778);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl258
            }
lbl234:
            // 2 sources

            case 30: {
                var5_3 /* !! */  = (int)hi.dmsl("dozx", dmsv(int ), (int)779);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl268
            }
            case 31: {
                var5_3 /* !! */  = (int)hi.dmsl("dozy", dmsv(int ), (int)780);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl304
            }
            case 32: {
                var5_3 /* !! */  = (int)hi.dmsl("dozz", dmsv(int ), (int)781);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl324
            }
            case 33: {
                var5_3 /* !! */  = (int)hi.dmsl("dpaa", dmsv(int ), (int)782);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl329
            }
lbl254:
            // 3 sources

            case 34: {
                var5_3 /* !! */  = (int)hi.dmsl("dpab", dmsv(int ), (int)783);
                if (!var6_2) ** GOTO lbl146
                throw null;
            }
lbl258:
            // 2 sources

            case 35: {
                var5_3 /* !! */  = (int)hi.dmsl("dpac", dmsv(int ), (int)784);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl369
            }
lbl263:
            // 3 sources

            case 36: {
                var5_3 /* !! */  = (int)hi.dmsl("dpad", dmsv(int ), (int)785);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl273
            }
lbl268:
            // 2 sources

            case 37: {
                var5_3 /* !! */  = (int)hi.dmsl("dpae", dmsv(int ), (int)786);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl308
            }
lbl273:
            // 2 sources

            case 38: {
                var5_3 /* !! */  = (int)hi.dmsl("dpaf", dmsv(int ), (int)787);
                if (!var6_2) break;
                throw null;
            }
lbl277:
            // 2 sources

            case 39: {
                var5_3 /* !! */  = (int)hi.dmsl("dpag", dmsv(int ), (int)788);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl291
            }
            case 40: {
                var5_3 /* !! */  = (int)hi.dmsl("dpah", dmsv(int ), (int)789);
                if (!var6_2) ** GOTO lbl136
                throw null;
            }
lbl286:
            // 2 sources

            case 41: {
                var5_3 /* !! */  = (int)hi.dmsl("dpai", dmsv(int ), (int)790);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl316
            }
lbl291:
            // 3 sources

            case 42: {
                var5_3 /* !! */  = (int)hi.dmsl("dpaj", dmsv(int ), (int)791);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl399
            }
            case 43: {
                var5_3 /* !! */  = (int)hi.dmsl("dpak", dmsv(int ), (int)792);
                if (!var6_2) ** GOTO lbl254
                throw null;
            }
lbl300:
            // 2 sources

            case 44: {
                var5_3 /* !! */  = (int)hi.dmsl("dpal", dmsv(int ), (int)793);
                if (!var6_2) ** GOTO lbl132
                throw null;
            }
lbl304:
            // 2 sources

            case 45: {
                var5_3 /* !! */  = (int)hi.dmsl("dpam", dmsv(int ), (int)794);
                if (!var6_2) break;
                throw null;
            }
lbl308:
            // 2 sources

            case 46: {
                var5_3 /* !! */  = (int)hi.dmsl("dpan", dmsv(int ), (int)795);
                if (!var6_2) ** GOTO lbl179
                throw null;
            }
            case 47: {
                var5_3 /* !! */  = (int)hi.dmsl("dpao", dmsv(int ), (int)796);
                if (!var6_2) ** GOTO lbl136
                throw null;
            }
lbl316:
            // 3 sources

            case 48: {
                var5_3 /* !! */  = (int)hi.dmsl("dpap", dmsv(int ), (int)797);
                if (!var6_2) ** GOTO lbl132
                throw null;
            }
            case 49: {
                var5_3 /* !! */  = (int)hi.dmsl("dpaq", dmsv(int ), (int)798);
                if (!var6_2) ** GOTO lbl188
                throw null;
            }
lbl324:
            // 2 sources

            case 50: {
                var5_3 /* !! */  = (int)hi.dmsl("dpar", dmsv(int ), (int)799);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl383
            }
lbl329:
            // 3 sources

            case 51: {
                var5_3 /* !! */  = (int)hi.dmsl("dpas", dmsv(int ), (int)800);
                if (!var6_2) ** GOTO lbl169
                throw null;
            }
lbl333:
            // 2 sources

            case 52: {
                var5_3 /* !! */  = (int)hi.dmsl("dpat", dmsv(int ), (int)801);
                if (!var6_2) ** GOTO lbl234
                throw null;
            }
            case 53: {
                var5_3 /* !! */  = (int)hi.dmsl("dpau", dmsv(int ), (int)802);
                if (!var6_2) ** GOTO lbl128
                throw null;
            }
            case 54: {
                var5_3 /* !! */  = (int)hi.dmsl("dpav", dmsv(int ), (int)803);
                if (!var6_2) ** GOTO lbl329
                throw null;
            }
lbl345:
            // 2 sources

            case 55: {
                var5_3 /* !! */  = (int)hi.dmsl("dpaw", dmsv(int ), (int)804);
                if (!var6_2) ** GOTO lbl286
                throw null;
            }
lbl349:
            // 2 sources

            case 56: {
                var5_3 /* !! */  = (int)hi.dmsl("dpax", dmsv(int ), (int)805);
                if (!var6_2) ** GOTO lbl188
                throw null;
            }
            case 57: {
                var5_3 /* !! */  = (int)hi.dmsl("dpay", dmsv(int ), (int)806);
                if (!var6_2) ** GOTO lbl221
                throw null;
            }
lbl357:
            // 2 sources

            case 58: {
                var5_3 /* !! */  = (int)hi.dmsl("dpaz", dmsv(int ), (int)807);
                if (!var6_2) ** GOTO lbl132
                throw null;
            }
lbl361:
            // 3 sources

            case 59: {
                var5_3 /* !! */  = (int)hi.dmsl("dpba", dmsv(int ), (int)808);
                if (!var6_2) ** GOTO lbl316
                throw null;
            }
lbl365:
            // 2 sources

            case 60: {
                var5_3 /* !! */  = (int)hi.dmsl("dpbb", dmsv(int ), (int)809);
                if (!var6_2) ** GOTO lbl229
                throw null;
            }
lbl369:
            // 4 sources

            case 61: {
                do {
                    var5_3 /* !! */  = (int)hi.dmsl("dpbc", dmsv(int ), (int)810);
                } while (!var6_2);
                throw null;
            }
            case 62: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)hi.dmsl("dpbd", dmsv(int ), (int)811);
                    if (!var6_2) ** GOTO lbl119
                    throw null;
                }
            }
            case 63: {
                var5_3 /* !! */  = (int)hi.dmsl("dpbe", dmsv(int ), (int)812);
                if (!var6_2) ** GOTO lbl349
                throw null;
            }
lbl383:
            // 3 sources

            case 64: {
                var5_3 /* !! */  = (int)hi.dmsl("dpbf", dmsv(int ), (int)813);
                if (!var6_2) ** GOTO lbl213
                throw null;
            }
            case 65: {
                var5_3 /* !! */  = (int)hi.dmsl("dpbg", dmsv(int ), (int)814);
                if (!var6_2) ** GOTO lbl383
                throw null;
            }
            case 66: {
                var5_3 /* !! */  = (int)hi.dmsl("dpbh", dmsv(int ), (int)815);
                if (!var6_2) ** GOTO lbl110
                throw null;
            }
            case 67: {
                var5_3 /* !! */  = (int)hi.dmsl("dpbi", dmsv(int ), (int)816);
                if (!var6_2) ** GOTO lbl369
                throw null;
            }
lbl399:
            // 3 sources

            case 68: {
                var5_3 /* !! */  = (int)hi.dmsl("dpbj", dmsv(int ), (int)817);
                if (!var6_2) ** GOTO lbl136
                throw null;
            }
            case 69: {
                var5_3 /* !! */  = (int)hi.dmsl("dpbk", dmsv(int ), (int)818);
                if (!var6_2) ** GOTO lbl174
                throw null;
            }
            case 70: {
                var5_3 /* !! */  = (int)hi.dmsl("dpbl", dmsv(int ), (int)819);
                if (!var6_2) ** GOTO lbl361
                throw null;
            }
            case 71: 
        }
        var5_3 /* !! */  = (int)hi.dmsl("dpbm", dmsv(int ), (int)820);
        ** while (!var6_2)
lbl414:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$hasTntNearby$10(class_1297 var0) {
        v0 /* !! */  = hi.ib;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - hi.dmsl("drtr", dmts(int ), (int)709));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1592967773: {
                    v1 = hi.dmsl("drts", dmts(int ), (int)710);
                    continue block17;
                }
                case -1280013189: {
                    v1 = hi.dmsl("drtt", dmts(int ), (int)711);
                    continue block17;
                }
                case -1057395381: {
                    v1 = hi.dmsl("drtu", dmts(int ), (int)712);
                    continue block17;
                }
                case 1228545173: {
                    break block17;
                }
            }
            break;
        }
        var3_1 = hi.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hi.ib - hi.dmsl("drtv", dmts(int ), (int)713)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hi.dmsl("drtw", dmsv(int ), (int)1632)) break;
            v2 /* !! */  = (long)hi.dmsl("drtx", dmsv(int ), (int)1633);
        }
        var2_2 /* !! */  = hi.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = hi.ib;
                if (true) ** GOTO lbl32
                block19: while (true) {
                    v3 /* !! */  = (long)(v4 - hi.dmsl("drty", dmts(int ), (int)714));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1882411522: {
                            v4 = hi.dmsl("drtz", dmts(int ), (int)715);
                            continue block19;
                        }
                        case 1228545173: {
                            break block19;
                        }
                        case 1873962382: {
                            v4 = hi.dmsl("drua", dmts(int ), (int)716);
                            continue block19;
                        }
                    }
                    break;
                }
                var1_3 = hi.a;
                if (var3_1) {
                    throw null;
                    return (boolean)hi.dmsl("drub", dmsv(int ), (int)1634);
                }
                if (var1_3 || var1_3) ** continue;
                return var0 instanceof class_1541;
            }
lbl48:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)hi.dmsl("druc", dmsv(int ), (int)1635);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)hi.dmsl("drud", dmsv(int ), (int)1636);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)hi.dmsl("drue", dmsv(int ), (int)1637);
                if (!var3_1) ** GOTO lbl48
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)hi.dmsl("druf", dmsv(int ), (int)1638);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void dsgp() {
        hi.dmsj[1200] = 451535774;
        hi.dmsj[1201] = -1968393457;
        hi.dmsj[1202] = 2065395632;
        hi.dmsj[1203] = 1801670914;
        hi.dmsj[1204] = -1956517496;
        hi.dmsj[1205] = 272678378;
        hi.dmsj[1206] = -1074529261;
        hi.dmsj[1207] = -1248821694;
        hi.dmsj[1208] = 54615680;
        hi.dmsj[1209] = 17851071;
        hi.dmsj[1210] = 1911844393;
        hi.dmsj[1211] = 156885214;
        hi.dmsj[1212] = 1739096893;
        hi.dmsj[1213] = -1705934664;
        hi.dmsj[1214] = -661659116;
        hi.dmsj[1215] = -461312653;
        hi.dmsj[1216] = -675839914;
        hi.dmsj[1217] = -985912916;
        hi.dmsj[1218] = -1915387474;
        hi.dmsj[1219] = -521868516;
        hi.dmsj[1220] = -865292684;
        hi.dmsj[1221] = -1350165585;
        hi.dmsj[1222] = 1089563187;
        hi.dmsj[1223] = -855755070;
        hi.dmsj[1224] = -2046794874;
        hi.dmsj[1225] = -1843329142;
        hi.dmsj[1226] = -1068281741;
        hi.dmsj[1227] = -1894572458;
        hi.dmsj[1228] = -1381349441;
        hi.dmsj[1229] = -1269736467;
        hi.dmsj[1230] = -1167030386;
        hi.dmsj[1231] = -520352964;
        hi.dmsj[1232] = -956795371;
        hi.dmsj[1233] = -1738897549;
        hi.dmsj[1234] = -347255155;
        hi.dmsj[1235] = -1461839782;
        hi.dmsj[1236] = 1604382511;
        hi.dmsj[1237] = -1588009574;
        hi.dmsj[1238] = 1230210628;
        hi.dmsj[1239] = 105997369;
        hi.dmsj[1240] = -734388832;
        hi.dmsj[1241] = -424621217;
        hi.dmsj[1242] = -474269713;
        hi.dmsj[1243] = -1662405600;
        hi.dmsj[1244] = -634680327;
        hi.dmsj[1245] = 414057287;
        hi.dmsj[1246] = -1451300960;
        hi.dmsj[1247] = -1194844862;
        hi.dmsj[1248] = -1379015736;
        hi.dmsj[1249] = -1634470327;
        hi.dmsj[1250] = -485637399;
        hi.dmsj[1251] = -1664647451;
        hi.dmsj[1252] = 1217442287;
        hi.dmsj[1253] = 1245955940;
        hi.dmsj[1254] = 1957891113;
        hi.dmsj[1255] = 1553281733;
        hi.dmsj[1256] = 65345988;
        hi.dmsj[1257] = 1032178033;
        hi.dmsj[1258] = 157823594;
        hi.dmsj[1259] = 2002817256;
        hi.dmsj[1260] = -855068795;
        hi.dmsj[1261] = -1081822421;
        hi.dmsj[1262] = 2140419106;
        hi.dmsj[1263] = -1971632460;
        hi.dmsj[1264] = -184115977;
        hi.dmsj[1265] = -292276770;
        hi.dmsj[1266] = -1319474862;
        hi.dmsj[1267] = 1425281785;
        hi.dmsj[1268] = 696205584;
        hi.dmsj[1269] = -924495575;
        hi.dmsj[1270] = -328455167;
        hi.dmsj[1271] = 530166953;
        hi.dmsj[1272] = 305459407;
        hi.dmsj[1273] = 649345339;
        hi.dmsj[1274] = 1799083871;
        hi.dmsj[1275] = -353890636;
        hi.dmsj[1276] = -481094441;
        hi.dmsj[1277] = 1995848612;
        hi.dmsj[1278] = -1574896071;
        hi.dmsj[1279] = 601416361;
        hi.dmsj[1280] = 437331317;
        hi.dmsj[1281] = 1877571808;
        hi.dmsj[1282] = 1503117761;
        hi.dmsj[1283] = 739205356;
        hi.dmsj[1284] = 1069710911;
        hi.dmsj[1285] = -1990203902;
        hi.dmsj[1286] = -543553425;
        hi.dmsj[1287] = 436650098;
        hi.dmsj[1288] = -903836147;
        hi.dmsj[1289] = -942395129;
        hi.dmsj[1290] = -761115208;
        hi.dmsj[1291] = -606654795;
        hi.dmsj[1292] = 1662835504;
        hi.dmsj[1293] = -1349426762;
        hi.dmsj[1294] = 1426264271;
        hi.dmsj[1295] = 1551307828;
        hi.dmsj[1296] = 1773572245;
        hi.dmsj[1297] = -2014989618;
        hi.dmsj[1298] = 1457838526;
        hi.dmsj[1299] = -1573888513;
    }

    private static /* synthetic */ void dtmu() {
        hi.dmsk[1700] = -197578560;
        hi.dmsk[1701] = 1622778985;
        hi.dmsk[1702] = 1959297083;
        hi.dmsk[1703] = -1546585037;
        hi.dmsk[1704] = -1458157452;
        hi.dmsk[1705] = 687238779;
        hi.dmsk[1706] = 2035450180;
        hi.dmsk[1707] = 1392460511;
        hi.dmsk[1708] = 1093610025;
        hi.dmsk[1709] = -1327554139;
        hi.dmsk[1710] = 2124526757;
        hi.dmsk[1711] = 1151032199;
        hi.dmsk[1712] = 1492615062;
        hi.dmsk[1713] = 1827114936;
        hi.dmsk[1714] = 856912447;
        hi.dmsk[1715] = 2081326024;
        hi.dmsk[1716] = 160999268;
        hi.dmsk[1717] = 1138888288;
        hi.dmsk[1718] = 980902024;
        hi.dmsk[1719] = -1464981251;
        hi.dmsk[1720] = 1181230475;
        hi.dmsk[1721] = -1799075262;
        hi.dmsk[1722] = -927373752;
        hi.dmsk[1723] = 400140977;
        hi.dmsk[1724] = -283180003;
        hi.dmsk[1725] = 1539332554;
        hi.dmsk[1726] = -1818759251;
        hi.dmsk[1727] = -2012346101;
        hi.dmsk[1728] = -1933950933;
        hi.dmsk[1729] = 632181337;
        hi.dmsk[1730] = 241946141;
        hi.dmsk[1731] = -182319675;
        hi.dmsk[1732] = -846191592;
        hi.dmsk[1733] = -634360420;
        hi.dmsk[1734] = -751262181;
        hi.dmsk[1735] = 1242286704;
        hi.dmsk[1736] = 2109828891;
        hi.dmsk[1737] = -535552150;
        hi.dmsk[1738] = 1285067766;
        hi.dmsk[1739] = -728886092;
        hi.dmsk[1740] = -1363252944;
        hi.dmsk[1741] = -68780718;
        hi.dmsk[1742] = -1397136946;
        hi.dmsk[1743] = -1876944212;
        hi.dmsk[1744] = 124716522;
        hi.dmsk[1745] = 1665913277;
        hi.dmsk[1746] = -1185677316;
        hi.dmsk[1747] = 314817869;
        hi.dmsk[1748] = 1129275832;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void flushFastSwap() {
        block43: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = hi.ib - hi.dmsl("dqej", dmts(int ), (int)359)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == hi.dmsl("dqek", dmsv(int ), (int)1131)) break;
                v0 /* !! */  = (long)hi.dmsl("dqel", dmsv(int ), (int)1132);
            }
            var3_1 = hi.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = hi.ib - hi.dmsl("dqem", dmts(int ), (int)360)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == hi.dmsl("dqen", dmsv(int ), (int)1133)) break;
                v1 /* !! */  = (long)hi.dmsl("dqeo", dmsv(int ), (int)1134);
            }
            var2_2 /* !! */  = hi.b;
            v2 /* !! */  = hi.ib;
            if (true) ** GOTO lbl17
            block25: while (true) {
                v2 /* !! */  = (long)(v3 - hi.dmsl("dqep", dmts(int ), (int)361));
lbl17:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -150987335: {
                        v3 = hi.dmsl("dqeq", dmts(int ), (int)362);
                        continue block25;
                    }
                    case 909750098: {
                        v3 = hi.dmsl("dqer", dmts(int ), (int)363);
                        continue block25;
                    }
                    case 1228545173: {
                        break block25;
                    }
                }
                break;
            }
            var1_3 = hi.a;
            if (var3_1) {
                throw null;
lbl29:
                // 5 sources

                return;
            }
            if (var1_3 || var1_3) ** GOTO lbl29
            v4 /* !! */  = hi.ib;
            if (true) ** GOTO lbl36
            block27: while (true) {
                v4 /* !! */  = (long)(hi.dmsl("dqet", dmts(int ), (int)365) - hi.dmsl("dqes", dmts(int ), (int)364));
lbl36:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case 1228545173: {
                        break block27;
                    }
                    case 1810991993: {
                        continue block27;
                    }
                }
                break;
            }
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_2 = hi.ib - hi.dmsl("dqeu", dmts(int ), (int)366)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == hi.dmsl("dqev", dmsv(int ), (int)1135)) break;
                v5 /* !! */  = (long)hi.dmsl("dqew", dmsv(int ), (int)1136);
            }
            if (this.mode.isSelected("\u0411\u044b\u0441\u0442\u0440\u044b\u0439")) break block43;
            if (var1_3) ** GOTO lbl29
            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl29
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_3 = hi.ib - hi.dmsl("dqex", dmts(int ), (int)367)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == hi.dmsl("dqey", dmsv(int ), (int)1137)) break;
            v6 /* !! */  = (long)hi.dmsl("dqez", dmsv(int ), (int)1138);
        }
        nz.tick();
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl29
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_4 = hi.ib - hi.dmsl("dqfa", dmts(int ), (int)368)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == hi.dmsl("dqfb", dmsv(int ), (int)1139)) break;
                    v7 /* !! */  = (long)hi.dmsl("dqfc", dmsv(int ), (int)1140);
                }
                nz.tick();
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl70:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)hi.dmsl("dqfd", dmsv(int ), (int)1141);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl88
            }
            case 1: {
                var2_2 /* !! */  = (int)hi.dmsl("dqfe", dmsv(int ), (int)1142);
                if (!var3_1) ** GOTO lbl70
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)hi.dmsl("dqff", dmsv(int ), (int)1143);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl108
            }
lbl84:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)hi.dmsl("dqfg", dmsv(int ), (int)1144);
                if (!var3_1) ** GOTO lbl70
                throw null;
            }
lbl88:
            // 3 sources

            case 4: {
                do {
                    var2_2 /* !! */  = (int)hi.dmsl("dqfh", dmsv(int ), (int)1145);
                } while (!var3_1);
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)hi.dmsl("dqfi", dmsv(int ), (int)1146);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl112
            }
lbl98:
            // 2 sources

            case 6: {
                do {
                    var2_2 /* !! */  = (int)hi.dmsl("dqfj", dmsv(int ), (int)1147);
                } while (!var3_1);
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)hi.dmsl("dqfk", dmsv(int ), (int)1148);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl116
            }
lbl108:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)hi.dmsl("dqfl", dmsv(int ), (int)1149);
                if (!var3_1) ** GOTO lbl98
                throw null;
            }
lbl112:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)hi.dmsl("dqfm", dmsv(int ), (int)1150);
                if (!var3_1) ** GOTO lbl84
                throw null;
            }
lbl116:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)hi.dmsl("dqfn", dmsv(int ), (int)1151);
                if (!var3_1) ** GOTO lbl88
                throw null;
            }
            case 11: 
        }
        do {
            var2_2 /* !! */  = (int)hi.dmsl("dqfo", dmsv(int ), (int)1152);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void dsgl() {
        hi.dmsj[800] = -1151820015;
        hi.dmsj[801] = 1167180467;
        hi.dmsj[802] = -1885120909;
        hi.dmsj[803] = 1676106734;
        hi.dmsj[804] = -696199857;
        hi.dmsj[805] = 373107952;
        hi.dmsj[806] = 1670669240;
        hi.dmsj[807] = -1316213651;
        hi.dmsj[808] = -1855115590;
        hi.dmsj[809] = -1672776390;
        hi.dmsj[810] = 701413362;
        hi.dmsj[811] = 1299556157;
        hi.dmsj[812] = -2067555805;
        hi.dmsj[813] = 1885566772;
        hi.dmsj[814] = 864542861;
        hi.dmsj[815] = 803438901;
        hi.dmsj[816] = -51528137;
        hi.dmsj[817] = 685311939;
        hi.dmsj[818] = -1912357774;
        hi.dmsj[819] = -1368512989;
        hi.dmsj[820] = 2025199198;
        hi.dmsj[821] = -783008790;
        hi.dmsj[822] = 1554052285;
        hi.dmsj[823] = 1363561958;
        hi.dmsj[824] = 1823564143;
        hi.dmsj[825] = 1171269906;
        hi.dmsj[826] = 497811360;
        hi.dmsj[827] = -1677239306;
        hi.dmsj[828] = -1114412207;
        hi.dmsj[829] = -443789933;
        hi.dmsj[830] = 261509431;
        hi.dmsj[831] = -1752432898;
        hi.dmsj[832] = -1979123851;
        hi.dmsj[833] = 1877834785;
        hi.dmsj[834] = -1351549190;
        hi.dmsj[835] = 195343684;
        hi.dmsj[836] = 406278625;
        hi.dmsj[837] = 32902200;
        hi.dmsj[838] = -304368298;
        hi.dmsj[839] = -2038795842;
        hi.dmsj[840] = 1655206534;
        hi.dmsj[841] = 626905901;
        hi.dmsj[842] = 939273683;
        hi.dmsj[843] = -2071042285;
        hi.dmsj[844] = -1672295722;
        hi.dmsj[845] = -1555128555;
        hi.dmsj[846] = 311444436;
        hi.dmsj[847] = -1534218999;
        hi.dmsj[848] = -1120179344;
        hi.dmsj[849] = 1666840366;
        hi.dmsj[850] = -1851606832;
        hi.dmsj[851] = -2027662955;
        hi.dmsj[852] = -1194781900;
        hi.dmsj[853] = 926790601;
        hi.dmsj[854] = 1756700550;
        hi.dmsj[855] = -1676725197;
        hi.dmsj[856] = 664956489;
        hi.dmsj[857] = -515530325;
        hi.dmsj[858] = -421326467;
        hi.dmsj[859] = 1409810070;
        hi.dmsj[860] = 1337084718;
        hi.dmsj[861] = -179854218;
        hi.dmsj[862] = -1541336814;
        hi.dmsj[863] = -1123561961;
        hi.dmsj[864] = 1028965651;
        hi.dmsj[865] = 840633287;
        hi.dmsj[866] = -369377046;
        hi.dmsj[867] = -1861066296;
        hi.dmsj[868] = -1621316142;
        hi.dmsj[869] = 574820748;
        hi.dmsj[870] = 291655199;
        hi.dmsj[871] = 814015416;
        hi.dmsj[872] = -321866537;
        hi.dmsj[873] = -242241294;
        hi.dmsj[874] = 1649490005;
        hi.dmsj[875] = 755014941;
        hi.dmsj[876] = 1798575299;
        hi.dmsj[877] = -1577628178;
        hi.dmsj[878] = 400610253;
        hi.dmsj[879] = -759484807;
        hi.dmsj[880] = 1596377274;
        hi.dmsj[881] = 119464212;
        hi.dmsj[882] = 1166881313;
        hi.dmsj[883] = 948115744;
        hi.dmsj[884] = -1285190471;
        hi.dmsj[885] = 86874049;
        hi.dmsj[886] = -1614590644;
        hi.dmsj[887] = -1805601029;
        hi.dmsj[888] = -470667221;
        hi.dmsj[889] = -2015091842;
        hi.dmsj[890] = -468082451;
        hi.dmsj[891] = 11070040;
        hi.dmsj[892] = 256837021;
        hi.dmsj[893] = 29303821;
        hi.dmsj[894] = 2069400997;
        hi.dmsj[895] = 886580039;
        hi.dmsj[896] = 2085628442;
        hi.dmsj[897] = 862939426;
        hi.dmsj[898] = 1121530336;
        hi.dmsj[899] = -1452672960;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private long getServerConfirmationDelay() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hi.ib - hi.dmsl("drmi", dmts(int ), (int)626)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == hi.dmsl("drmj", dmsv(int ), (int)1524)) break;
            v0 /* !! */  = (long)hi.dmsl("drmk", dmsv(int ), (int)1525);
        }
        var5_1 = hi.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hi.ib - hi.dmsl("drml", dmts(int ), (int)627)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == hi.dmsl("drmm", dmsv(int ), (int)1526)) break;
            v1 /* !! */  = (long)hi.dmsl("drmn", dmsv(int ), (int)1527);
        }
        var4_2 /* !! */  = hi.b;
        v2 /* !! */  = hi.ib;
        if (true) ** GOTO lbl17
        block68: while (true) {
            v2 /* !! */  = (long)(hi.dmsl("drmp", dmts(int ), (int)629) - hi.dmsl("drmo", dmts(int ), (int)628));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 1228545173: {
                    break block68;
                }
                case 1639780315: {
                    continue block68;
                }
            }
            break;
        }
        var3_3 = hi.a;
        if (var5_1) {
            throw null;
lbl25:
            // 9 sources

            return (long)hi.dmsl("drmq", dmts(int ), (int)630);
        }
        if (var3_3 || var3_3) ** GOTO lbl25
        v3 /* !! */  = hi.ib;
        if (true) ** GOTO lbl32
        block70: while (true) {
            v3 /* !! */  = (long)(v4 - hi.dmsl("drmr", dmts(int ), (int)631));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1116394053: {
                    v4 = hi.dmsl("drms", dmts(int ), (int)632);
                    continue block70;
                }
                case 1228545173: {
                    break block70;
                }
                case 2083950715: {
                    v4 = hi.dmsl("drmt", dmts(int ), (int)633);
                    continue block70;
                }
            }
            break;
        }
        v5 /* !! */  = hi.ib;
        if (true) ** GOTO lbl45
        block71: while (true) {
            v5 /* !! */  = (long)(hi.dmsl("drmv", dmts(int ), (int)635) - hi.dmsl("drmu", dmts(int ), (int)634));
lbl45:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -454650549: {
                    continue block71;
                }
                case 1228545173: {
                    break block71;
                }
            }
            break;
        }
        if (hi.mc.method_1562() == null) ** GOTO lbl-1000
        if (var3_3) ** GOTO lbl25
        v6 /* !! */  = hi.ib;
        if (true) ** GOTO lbl56
        block72: while (true) {
            v6 /* !! */  = (long)(hi.dmsl("drmx", dmts(int ), (int)637) - hi.dmsl("drmw", dmts(int ), (int)636));
lbl56:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1796274341: {
                    continue block72;
                }
                case 1228545173: {
                    break block72;
                }
            }
            break;
        }
        v7 /* !! */  = hi.ib;
        if (true) ** GOTO lbl65
        block73: while (true) {
            v7 /* !! */  = (long)(hi.dmsl("drmz", dmts(int ), (int)639) - hi.dmsl("drmy", dmts(int ), (int)638));
lbl65:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1497934425: {
                    continue block73;
                }
                case 1228545173: {
                    break block73;
                }
            }
            break;
        }
        if (hi.mc.field_1724 != null) ** GOTO lbl77
        if (var3_3) ** GOTO lbl25
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 3 sources

            {
                if (var3_3 || var3_3) ** GOTO lbl25
                return (long)hi.dmsl("drna", dmts(int ), (int)640);
            }
lbl77:
            // 1 sources

            if (var3_3 || var3_3) ** GOTO lbl25
            v8 /* !! */  = hi.ib;
            if (true) ** GOTO lbl82
            block74: while (true) {
                v8 /* !! */  = (long)(v9 - hi.dmsl("drnb", dmts(int ), (int)641));
lbl82:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case 1228545173: {
                        break block74;
                    }
                    case 1482103888: {
                        v9 = hi.dmsl("drnc", dmts(int ), (int)642);
                        continue block74;
                    }
                    case 1763808664: {
                        v9 = hi.dmsl("drnd", dmts(int ), (int)643);
                        continue block74;
                    }
                }
                break;
            }
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_2 = hi.ib - hi.dmsl("drne", dmts(int ), (int)644)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == hi.dmsl("drnf", dmsv(int ), (int)1528)) break;
                v10 /* !! */  = (long)hi.dmsl("drng", dmsv(int ), (int)1529);
            }
            v11 = hi.mc.method_1562();
            v12 /* !! */  = hi.ib;
            if (true) ** GOTO lbl101
            block76: while (true) {
                v12 /* !! */  = (long)(v13 - hi.dmsl("drnh", dmts(int ), (int)645));
lbl101:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case -1410225531: {
                        v13 = hi.dmsl("drni", dmts(int ), (int)646);
                        continue block76;
                    }
                    case -1096252570: {
                        v13 = hi.dmsl("drnj", dmts(int ), (int)647);
                        continue block76;
                    }
                    case 1228545173: {
                        break block76;
                    }
                    case 1926455303: {
                        v13 = hi.dmsl("drnk", dmts(int ), (int)648);
                        continue block76;
                    }
                }
                break;
            }
            v14 /* !! */  = hi.ib;
            if (true) ** GOTO lbl117
            block77: while (true) {
                v14 /* !! */  = (long)(v15 - hi.dmsl("drnl", dmts(int ), (int)649));
lbl117:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case -161364413: {
                        v15 = hi.dmsl("drnm", dmts(int ), (int)650);
                        continue block77;
                    }
                    case 1228545173: {
                        break block77;
                    }
                    case 1506385134: {
                        v15 = hi.dmsl("drnn", dmts(int ), (int)651);
                        continue block77;
                    }
                }
                break;
            }
            v16 = hi.mc.field_1724;
            v17 /* !! */  = hi.ib;
            if (true) ** GOTO lbl131
            block78: while (true) {
                v17 /* !! */  = (long)(hi.dmsl("drnp", dmts(int ), (int)653) - hi.dmsl("drno", dmts(int ), (int)652));
lbl131:
                // 2 sources

                switch ((int)v17 /* !! */ ) {
                    case -1357450944: {
                        continue block78;
                    }
                    case 1228545173: {
                        break block78;
                    }
                }
                break;
            }
            v18 = v16.method_5667();
            while (true) {
                if ((v19 /* !! */  = (cfr_temp_3 = hi.ib - hi.dmsl("drnq", dmts(int ), (int)654)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v19 /* !! */  == hi.dmsl("drnr", dmsv(int ), (int)1530)) break;
                v19 /* !! */  = (long)hi.dmsl("drns", dmsv(int ), (int)1531);
            }
            var1_4 = v11.method_2871(v18);
            if (var3_3 || var3_3) ** GOTO lbl25
            if (var1_4 == null) ** GOTO lbl162
            if (var3_3) ** GOTO lbl25
            v20 = hi.dmsl("drnt", dmsv(int ), (int)1532);
            while (true) {
                if ((v21 /* !! */  = (cfr_temp_4 = hi.ib - hi.dmsl("drnu", dmts(int ), (int)655)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v21 /* !! */  == hi.dmsl("drnv", dmsv(int ), (int)1533)) break;
                v21 /* !! */  = (long)hi.dmsl("drnw", dmsv(int ), (int)1534);
            }
            v22 = var1_4.method_2959();
            while (true) {
                if ((v23 /* !! */  = (cfr_temp_5 = hi.ib - hi.dmsl("drnx", dmts(int ), (int)656)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v23 /* !! */  == hi.dmsl("drny", dmsv(int ), (int)1535)) break;
                v23 /* !! */  = (long)hi.dmsl("drnz", dmsv(int ), (int)1536);
            }
            v24 /* !! */  = (CallSite)Math.max((int)v20, v22);
            if (var5_1) {
                throw null;
            }
            ** GOTO lbl164
lbl162:
            // 1 sources

            if (var3_3 || var3_3) ** GOTO lbl25
            v24 /* !! */  = var2_5 = hi.dmsl("droa", dmsv(int ), (int)1537);
lbl164:
            // 2 sources

            if (!var3_3 && !var3_3) ** break;
            ** continue;
            v25 = hi.dmsl("drob", dmts(int ), (int)657);
            v26 = hi.dmsl("droc", dmts(int ), (int)658);
            v27 = (long)var2_5 * hi.dmsl("drod", dmts(int ), (int)659) + hi.dmsl("droe", dmts(int ), (int)660);
            v28 /* !! */  = hi.ib;
            if (true) ** GOTO lbl173
            block82: while (true) {
                v28 /* !! */  = (long)(v29 - hi.dmsl("drof", dmts(int ), (int)661));
lbl173:
                // 2 sources

                switch ((int)v28 /* !! */ ) {
                    case -2022624189: {
                        v29 = hi.dmsl("drog", dmts(int ), (int)662);
                        continue block82;
                    }
                    case 392104247: {
                        v29 = hi.dmsl("droh", dmts(int ), (int)663);
                        continue block82;
                    }
                    case 1228545173: {
                        break block82;
                    }
                }
                break;
            }
            v30 = Math.min((long)v26, v27);
            while (true) {
                if ((v31 /* !! */  = (cfr_temp_6 = hi.ib - hi.dmsl("droi", dmts(int ), (int)664)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v31 /* !! */  == hi.dmsl("droj", dmsv(int ), (int)1538)) break;
                v31 /* !! */  = (long)hi.dmsl("drok", dmsv(int ), (int)1539);
            }
            return Math.max((long)v25, v30);
            case 0: {
                var4_2 /* !! */  = (int)hi.dmsl("drol", dmsv(int ), (int)1540);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl208
            }
lbl194:
            // 4 sources

            case 1: {
                var4_2 /* !! */  = (int)hi.dmsl("drom", dmsv(int ), (int)1541);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl249
            }
            case 2: {
                var4_2 /* !! */  = (int)hi.dmsl("dron", dmsv(int ), (int)1542);
                if (var5_1) {
                    throw null;
                }
            }
            case 3: {
                var4_2 /* !! */  = (int)hi.dmsl("droo", dmsv(int ), (int)1543);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl249
            }
lbl208:
            // 2 sources

            case 4: {
                var4_2 /* !! */  = (int)hi.dmsl("drop", dmsv(int ), (int)1544);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl249
            }
            case 5: {
                var4_2 /* !! */  = (int)hi.dmsl("droq", dmsv(int ), (int)1545);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl235
            }
            case 6: {
                var4_2 /* !! */  = (int)hi.dmsl("dror", dmsv(int ), (int)1546);
                if (!var5_1) ** GOTO lbl194
                throw null;
            }
lbl222:
            // 3 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)hi.dmsl("dros", dmsv(int ), (int)1547);
                    if (!var5_1) ** GOTO lbl194
                    throw null;
                }
            }
lbl227:
            // 2 sources

            case 8: {
                var4_2 /* !! */  = (int)hi.dmsl("drot", dmsv(int ), (int)1548);
                if (!var5_1) ** GOTO lbl222
                throw null;
            }
            case 9: {
                var4_2 /* !! */  = (int)hi.dmsl("drou", dmsv(int ), (int)1549);
                if (!var5_1) ** GOTO lbl222
                throw null;
            }
lbl235:
            // 2 sources

            case 10: {
                do {
                    var4_2 /* !! */  = (int)hi.dmsl("drov", dmsv(int ), (int)1550);
                } while (!var5_1);
                throw null;
            }
lbl240:
            // 3 sources

            case 11: {
                do {
                    var4_2 /* !! */  = (int)hi.dmsl("drow", dmsv(int ), (int)1551);
                } while (!var5_1);
                throw null;
            }
            case 12: {
                var4_2 /* !! */  = (int)hi.dmsl("drox", dmsv(int ), (int)1552);
                if (!var5_1) ** GOTO lbl227
                throw null;
            }
lbl249:
            // 4 sources

            case 13: {
                var4_2 /* !! */  = (int)hi.dmsl("droy", dmsv(int ), (int)1553);
                if (!var5_1) ** GOTO lbl240
                throw null;
            }
lbl253:
            // 2 sources

            case 14: {
                var4_2 /* !! */  = (int)hi.dmsl("droz", dmsv(int ), (int)1554);
                if (!var5_1) ** GOTO lbl240
                throw null;
            }
            case 15: {
                var4_2 /* !! */  = (int)hi.dmsl("drpa", dmsv(int ), (int)1555);
                if (!var5_1) ** GOTO lbl194
                throw null;
            }
            case 16: {
                var4_2 /* !! */  = (int)hi.dmsl("drpb", dmsv(int ), (int)1556);
                if (!var5_1) ** GOTO lbl253
                throw null;
            }
            case 17: 
        }
        var4_2 /* !! */  = (int)hi.dmsl("drpc", dmsv(int ), (int)1557);
        ** while (!var5_1)
lbl268:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dtmj() {
        hi.dmsk[600] = -889186258;
        hi.dmsk[601] = -851573204;
        hi.dmsk[602] = 722039115;
        hi.dmsk[603] = -417722538;
        hi.dmsk[604] = -2019016603;
        hi.dmsk[605] = 2095432294;
        hi.dmsk[606] = -520023881;
        hi.dmsk[607] = 1399419851;
        hi.dmsk[608] = 1343083302;
        hi.dmsk[609] = 143114449;
        hi.dmsk[610] = -2001395220;
        hi.dmsk[611] = -849125774;
        hi.dmsk[612] = 427163424;
        hi.dmsk[613] = -1245644512;
        hi.dmsk[614] = 1009130738;
        hi.dmsk[615] = -661262763;
        hi.dmsk[616] = -1710498616;
        hi.dmsk[617] = -424919330;
        hi.dmsk[618] = 707318605;
        hi.dmsk[619] = -1632791766;
        hi.dmsk[620] = -766037919;
        hi.dmsk[621] = 1642071955;
        hi.dmsk[622] = 261041321;
        hi.dmsk[623] = -468915412;
        hi.dmsk[624] = -419884768;
        hi.dmsk[625] = 118183700;
        hi.dmsk[626] = -1433001346;
        hi.dmsk[627] = 634914760;
        hi.dmsk[628] = -1056501214;
        hi.dmsk[629] = 49037952;
        hi.dmsk[630] = -908529364;
        hi.dmsk[631] = -1392585702;
        hi.dmsk[632] = -1817087964;
        hi.dmsk[633] = 899682189;
        hi.dmsk[634] = 1766276379;
        hi.dmsk[635] = 243590329;
        hi.dmsk[636] = 1644084247;
        hi.dmsk[637] = -2084240025;
        hi.dmsk[638] = -1007100057;
        hi.dmsk[639] = 801001053;
        hi.dmsk[640] = 25959984;
        hi.dmsk[641] = -1607793312;
        hi.dmsk[642] = 1524340793;
        hi.dmsk[643] = 1882151414;
        hi.dmsk[644] = 1985387293;
        hi.dmsk[645] = 532593993;
        hi.dmsk[646] = -448307844;
        hi.dmsk[647] = -2138271836;
        hi.dmsk[648] = 483836414;
        hi.dmsk[649] = -1066993568;
        hi.dmsk[650] = 367190120;
        hi.dmsk[651] = 1823396111;
        hi.dmsk[652] = 783984506;
        hi.dmsk[653] = -360603213;
        hi.dmsk[654] = -175080814;
        hi.dmsk[655] = 1576570346;
        hi.dmsk[656] = -1201594682;
        hi.dmsk[657] = 1279721978;
        hi.dmsk[658] = 554323446;
        hi.dmsk[659] = 1040079387;
        hi.dmsk[660] = -1194889115;
        hi.dmsk[661] = -98419851;
        hi.dmsk[662] = -1133129267;
        hi.dmsk[663] = 547829166;
        hi.dmsk[664] = 1054684437;
        hi.dmsk[665] = -1002547973;
        hi.dmsk[666] = 651526672;
        hi.dmsk[667] = 351592459;
        hi.dmsk[668] = 360741611;
        hi.dmsk[669] = 1869636177;
        hi.dmsk[670] = -1687715014;
        hi.dmsk[671] = -769545621;
        hi.dmsk[672] = -550201156;
        hi.dmsk[673] = 1546345919;
        hi.dmsk[674] = 1231306322;
        hi.dmsk[675] = 1604615560;
        hi.dmsk[676] = -1763159105;
        hi.dmsk[677] = 1272940256;
        hi.dmsk[678] = 1346124072;
        hi.dmsk[679] = 1652754067;
        hi.dmsk[680] = 1497774960;
        hi.dmsk[681] = -1192207686;
        hi.dmsk[682] = 983871198;
        hi.dmsk[683] = -463126677;
        hi.dmsk[684] = 1549033398;
        hi.dmsk[685] = -460752627;
        hi.dmsk[686] = 1773579433;
        hi.dmsk[687] = 1616692747;
        hi.dmsk[688] = -1344879289;
        hi.dmsk[689] = 961284847;
        hi.dmsk[690] = -883116327;
        hi.dmsk[691] = -1987725501;
        hi.dmsk[692] = 171588683;
        hi.dmsk[693] = -1621918056;
        hi.dmsk[694] = -528008682;
        hi.dmsk[695] = 1875771562;
        hi.dmsk[696] = -1442611905;
        hi.dmsk[697] = 106394813;
        hi.dmsk[698] = -67518025;
        hi.dmsk[699] = 1328334224;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean hasCrystalNearby() {
        v0 /* !! */  = hi.ib;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - hi.dmsl("dofn", dmts(int ), (int)141));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1019517041: {
                    v1 = hi.dmsl("dofo", dmts(int ), (int)142);
                    continue block21;
                }
                case 287336018: {
                    v1 = hi.dmsl("dofp", dmts(int ), (int)143);
                    continue block21;
                }
                case 632696260: {
                    v1 = hi.dmsl("dofq", dmts(int ), (int)144);
                    continue block21;
                }
                case 1228545173: {
                    break block21;
                }
            }
            break;
        }
        var3_1 = hi.c;
        v2 /* !! */  = hi.ib;
        if (true) ** GOTO lbl22
        block22: while (true) {
            v2 /* !! */  = (long)(v3 - hi.dmsl("dofr", dmts(int ), (int)145));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1573247804: {
                    v3 = hi.dmsl("dofs", dmts(int ), (int)146);
                    continue block22;
                }
                case -1306086717: {
                    v3 = hi.dmsl("doft", dmts(int ), (int)147);
                    continue block22;
                }
                case 1228545173: {
                    break block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = hi.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = hi.ib - hi.dmsl("dofu", dmts(int ), (int)148)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == hi.dmsl("dofv", dmsv(int ), (int)524)) {
                var1_3 = hi.a;
                if (var3_1) {
                    throw null;
                }
                break;
            }
            v4 /* !! */  = (long)hi.dmsl("dofw", dmsv(int ), (int)525);
        }
        if (var1_3 != false) return (boolean)hi.dmsl("dofx", dmsv(int ), (int)526);
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block24: while (true) {
            block36: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_3 != false) return (boolean)hi.dmsl("dofx", dmsv(int ), (int)526);
                        while (true) {
                            if ((v5 /* !! */  = (cfr_temp_2 = hi.ib - hi.dmsl("dofy", dmts(int ), (int)149)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                            if (v5 /* !! */  == hi.dmsl("dofz", dmsv(int ), (int)527)) {
                                v6 = (Predicate<class_1297>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$hasCrystalNearby$9(net.minecraft.class_1297 ), (Lnet/minecraft/class_1297;)Z)();
                                ** break;
                            }
                            v5 /* !! */  = (long)hi.dmsl("doga", dmsv(int ), (int)528);
                        }
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)hi.dmsl("dogj", dmsv(int ), (int)533);
                        cfr_temp_0 = 1;
                        if (var3_1) {
                            throw null;
                        }
                        break block36;
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)hi.dmsl("dogm", dmsv(int ), (int)536);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
lbl66:
                    // 1 sources

                    while (true) {
                        if ((v7 /* !! */  = (cfr_temp_3 = hi.ib - hi.dmsl("dogb", dmts(int ), (int)150)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v7 /* !! */  == hi.dmsl("dogc", dmsv(int ), (int)529)) break;
                        v7 /* !! */  = (long)hi.dmsl("dogd", dmsv(int ), (int)530);
                    }
                    while (true) {
                        if ((v8 /* !! */  = (cfr_temp_4 = hi.ib - hi.dmsl("doge", dmts(int ), (int)151)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v8 /* !! */  == hi.dmsl("dogf", dmsv(int ), (int)531)) break;
                        v8 /* !! */  = (long)hi.dmsl("dogg", dmsv(int ), (int)532);
                    }
                    v9 = this.crystalDistance.getValue();
                    v10 /* !! */  = hi.ib;
                    block28: while (true) {
                        switch ((int)v10 /* !! */ ) {
                            case 1228545173: {
                                return this.hasEntityNearby(v6, v9);
                            }
                            case 1496596742: {
                                v10 /* !! */  = (long)(hi.dmsl("dogi", dmts(int ), (int)153) - hi.dmsl("dogh", dmts(int ), (int)152));
                                continue block28;
                            }
                        }
                        break;
                    }
                    return this.hasEntityNearby(v6, v9);
                    case 1: lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)hi.dmsl("dogk", dmsv(int ), (int)534);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 2: 
                }
                ** GOTO lbl95
            }
            do {
                if (true) continue block24;
lbl95:
                // 2 sources

                var2_2 /* !! */  = (int)hi.dmsl("dogl", dmsv(int ), (int)535);
                cfr_temp_0 = 1;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void dsgi() {
        hi.dmsj[500] = -132696039;
        hi.dmsj[501] = -1524081850;
        hi.dmsj[502] = -441367197;
        hi.dmsj[503] = -1266205037;
        hi.dmsj[504] = 78277545;
        hi.dmsj[505] = -160011925;
        hi.dmsj[506] = -91560674;
        hi.dmsj[507] = 705775656;
        hi.dmsj[508] = 1931763823;
        hi.dmsj[509] = 715611189;
        hi.dmsj[510] = -1439653163;
        hi.dmsj[511] = -2009965298;
        hi.dmsj[512] = 772715662;
        hi.dmsj[513] = 1111834931;
        hi.dmsj[514] = 786123538;
        hi.dmsj[515] = -1318118557;
        hi.dmsj[516] = 195706151;
        hi.dmsj[517] = 1500053085;
        hi.dmsj[518] = 153587617;
        hi.dmsj[519] = -1265968384;
        hi.dmsj[520] = -1845918001;
        hi.dmsj[521] = -970979750;
        hi.dmsj[522] = -1159247134;
        hi.dmsj[523] = -1462735433;
        hi.dmsj[524] = -721456822;
        hi.dmsj[525] = -392241174;
        hi.dmsj[526] = 1296333864;
        hi.dmsj[527] = -386700760;
        hi.dmsj[528] = 1511140209;
        hi.dmsj[529] = -631094994;
        hi.dmsj[530] = -1293203370;
        hi.dmsj[531] = -803739265;
        hi.dmsj[532] = -1481458640;
        hi.dmsj[533] = 383825427;
        hi.dmsj[534] = -2081076904;
        hi.dmsj[535] = 533984129;
        hi.dmsj[536] = -1405486721;
        hi.dmsj[537] = 1340426213;
        hi.dmsj[538] = -919767728;
        hi.dmsj[539] = 1311364187;
        hi.dmsj[540] = -1280251517;
        hi.dmsj[541] = 1801772414;
        hi.dmsj[542] = 1409171626;
        hi.dmsj[543] = -458867999;
        hi.dmsj[544] = -308077378;
        hi.dmsj[545] = -1939230431;
        hi.dmsj[546] = 68809034;
        hi.dmsj[547] = 738959399;
        hi.dmsj[548] = 2106452876;
        hi.dmsj[549] = -1965301084;
        hi.dmsj[550] = -516040459;
        hi.dmsj[551] = 398846656;
        hi.dmsj[552] = 959203752;
        hi.dmsj[553] = 720964357;
        hi.dmsj[554] = -135650627;
        hi.dmsj[555] = -423521954;
        hi.dmsj[556] = -1663103404;
        hi.dmsj[557] = 921334784;
        hi.dmsj[558] = -545664553;
        hi.dmsj[559] = 797239478;
        hi.dmsj[560] = -1638139627;
        hi.dmsj[561] = 990476155;
        hi.dmsj[562] = -150723253;
        hi.dmsj[563] = -42886046;
        hi.dmsj[564] = -691182915;
        hi.dmsj[565] = -836049433;
        hi.dmsj[566] = 769370617;
        hi.dmsj[567] = 370477577;
        hi.dmsj[568] = -1150313159;
        hi.dmsj[569] = 2106082113;
        hi.dmsj[570] = -1765299414;
        hi.dmsj[571] = 1849885050;
        hi.dmsj[572] = 10795315;
        hi.dmsj[573] = 1392513955;
        hi.dmsj[574] = -192721412;
        hi.dmsj[575] = 105614031;
        hi.dmsj[576] = -855303595;
        hi.dmsj[577] = -291586744;
        hi.dmsj[578] = -943906608;
        hi.dmsj[579] = 947700924;
        hi.dmsj[580] = 1180562490;
        hi.dmsj[581] = -1033189459;
        hi.dmsj[582] = 672696736;
        hi.dmsj[583] = 1918450405;
        hi.dmsj[584] = -1409096262;
        hi.dmsj[585] = 2105094333;
        hi.dmsj[586] = 128571503;
        hi.dmsj[587] = 209181244;
        hi.dmsj[588] = -939510625;
        hi.dmsj[589] = 2022327392;
        hi.dmsj[590] = -1562796943;
        hi.dmsj[591] = 0x777CC7DD;
        hi.dmsj[592] = 211197050;
        hi.dmsj[593] = 1231974623;
        hi.dmsj[594] = 1832855786;
        hi.dmsj[595] = -797519432;
        hi.dmsj[596] = -372588121;
        hi.dmsj[597] = 1432464193;
        hi.dmsj[598] = 726146027;
        hi.dmsj[599] = 149603347;
    }

    private static /* synthetic */ void dsge() {
        hi.dmsj[100] = -880444874;
        hi.dmsj[101] = -1625797285;
        hi.dmsj[102] = 1004627556;
        hi.dmsj[103] = -758505442;
        hi.dmsj[104] = -1529665392;
        hi.dmsj[105] = -1647330648;
        hi.dmsj[106] = 1203332628;
        hi.dmsj[107] = 434556758;
        hi.dmsj[108] = 1600553825;
        hi.dmsj[109] = -226230445;
        hi.dmsj[110] = -1857363617;
        hi.dmsj[111] = -1208504997;
        hi.dmsj[112] = -664910858;
        hi.dmsj[113] = 1027433105;
        hi.dmsj[114] = -680081303;
        hi.dmsj[115] = 1753171214;
        hi.dmsj[116] = -962598175;
        hi.dmsj[117] = -606579537;
        hi.dmsj[118] = -1706686258;
        hi.dmsj[119] = -627435780;
        hi.dmsj[120] = 754307624;
        hi.dmsj[121] = 1151512180;
        hi.dmsj[122] = -345205042;
        hi.dmsj[123] = -411470945;
        hi.dmsj[124] = -1884131375;
        hi.dmsj[125] = 517265242;
        hi.dmsj[126] = 2086966720;
        hi.dmsj[127] = 923000944;
        hi.dmsj[128] = -154030333;
        hi.dmsj[129] = -1212685998;
        hi.dmsj[130] = -786490229;
        hi.dmsj[131] = 556020736;
        hi.dmsj[132] = -507803952;
        hi.dmsj[133] = 1724315360;
        hi.dmsj[134] = -1306763089;
        hi.dmsj[135] = 1563419919;
        hi.dmsj[136] = 1775324797;
        hi.dmsj[137] = -1022143012;
        hi.dmsj[138] = 552576149;
        hi.dmsj[139] = 713776543;
        hi.dmsj[140] = -1636349234;
        hi.dmsj[141] = -809443477;
        hi.dmsj[142] = -903728371;
        hi.dmsj[143] = -1592719143;
        hi.dmsj[144] = -1972403277;
        hi.dmsj[145] = 1632741174;
        hi.dmsj[146] = -1083005117;
        hi.dmsj[147] = 1583286669;
        hi.dmsj[148] = -1553813654;
        hi.dmsj[149] = -174661954;
        hi.dmsj[150] = -1827144183;
        hi.dmsj[151] = -402742830;
        hi.dmsj[152] = -480141999;
        hi.dmsj[153] = 865287208;
        hi.dmsj[154] = -1974262556;
        hi.dmsj[155] = 770937224;
        hi.dmsj[156] = 408836444;
        hi.dmsj[157] = 1482413434;
        hi.dmsj[158] = -1715255447;
        hi.dmsj[159] = -1636431779;
        hi.dmsj[160] = 58387715;
        hi.dmsj[161] = 370693884;
        hi.dmsj[162] = -41918627;
        hi.dmsj[163] = 1513457148;
        hi.dmsj[164] = 520198029;
        hi.dmsj[165] = -1145044102;
        hi.dmsj[166] = -745969263;
        hi.dmsj[167] = 711188387;
        hi.dmsj[168] = -1254128242;
        hi.dmsj[169] = -515003521;
        hi.dmsj[170] = -1808757963;
        hi.dmsj[171] = 1763663042;
        hi.dmsj[172] = -2017464329;
        hi.dmsj[173] = -337860071;
        hi.dmsj[174] = -569400327;
        hi.dmsj[175] = 181279898;
        hi.dmsj[176] = 635421990;
        hi.dmsj[177] = -1179761634;
        hi.dmsj[178] = 2058622590;
        hi.dmsj[179] = 292306357;
        hi.dmsj[180] = 1183858891;
        hi.dmsj[181] = -164105559;
        hi.dmsj[182] = -556218286;
        hi.dmsj[183] = -1125026016;
        hi.dmsj[184] = 1973491078;
        hi.dmsj[185] = 525367383;
        hi.dmsj[186] = 284270064;
        hi.dmsj[187] = -1928717709;
        hi.dmsj[188] = 2136017803;
        hi.dmsj[189] = 1603980233;
        hi.dmsj[190] = -1287915730;
        hi.dmsj[191] = -1683313145;
        hi.dmsj[192] = -1217512248;
        hi.dmsj[193] = -1666502027;
        hi.dmsj[194] = -1883508659;
        hi.dmsj[195] = 1824823983;
        hi.dmsj[196] = 1648184143;
        hi.dmsj[197] = -1839982213;
        hi.dmsj[198] = 482765646;
        hi.dmsj[199] = 685086824;
    }

    private static /* synthetic */ void dtmx() {
        hi.dmtt[200] = -3158683291481688123L;
        hi.dmtt[201] = 7250163804365169668L;
        hi.dmtt[202] = -21988224356453785L;
        hi.dmtt[203] = 4753856132811154770L;
        hi.dmtt[204] = 7577373386620041727L;
        hi.dmtt[205] = -8607636499175286445L;
        hi.dmtt[206] = -4583930963967933630L;
        hi.dmtt[207] = -5230619218166085897L;
        hi.dmtt[208] = -3810686997167249424L;
        hi.dmtt[209] = -4659100238629910777L;
        hi.dmtt[210] = 6577219868031143349L;
        hi.dmtt[211] = 3289682507328892632L;
        hi.dmtt[212] = -9131755136157159395L;
        hi.dmtt[213] = 1867246002144302793L;
        hi.dmtt[214] = -8922846317962760296L;
        hi.dmtt[215] = 4233018948202948461L;
        hi.dmtt[216] = -2103258431232041491L;
        hi.dmtt[217] = 3977556252434130392L;
        hi.dmtt[218] = 3284012201623173171L;
        hi.dmtt[219] = -2500740548657132296L;
        hi.dmtt[220] = 6307725318801591044L;
        hi.dmtt[221] = -6878067374197977246L;
        hi.dmtt[222] = 2873566963987865213L;
        hi.dmtt[223] = -702342307490790913L;
        hi.dmtt[224] = 8642941379511158745L;
        hi.dmtt[225] = -7245065599350637820L;
        hi.dmtt[226] = -9159084347918572441L;
        hi.dmtt[227] = 332553426730145977L;
        hi.dmtt[228] = -8729213881997465580L;
        hi.dmtt[229] = 6171363456445978659L;
        hi.dmtt[230] = 8778104599741919172L;
        hi.dmtt[231] = 6298822779604235175L;
        hi.dmtt[232] = -5112490257847592798L;
        hi.dmtt[233] = 3862218826168754368L;
        hi.dmtt[234] = -773689034402010207L;
        hi.dmtt[235] = 7176503668676174272L;
        hi.dmtt[236] = -2665950312426932811L;
        hi.dmtt[237] = -1071125700444048640L;
        hi.dmtt[238] = -1214447527295192240L;
        hi.dmtt[239] = 5985078491443283078L;
        hi.dmtt[240] = -1787382398367477501L;
        hi.dmtt[241] = 6043676573570982020L;
        hi.dmtt[242] = 1778871181069714188L;
        hi.dmtt[243] = 7413137291489239020L;
        hi.dmtt[244] = -8335526928571760595L;
        hi.dmtt[245] = 8833906293641146103L;
        hi.dmtt[246] = -2403032159004440702L;
        hi.dmtt[247] = 3384782335979236718L;
        hi.dmtt[248] = -4393775758355208495L;
        hi.dmtt[249] = 218128020848472768L;
        hi.dmtt[250] = -4842961604836281844L;
        hi.dmtt[251] = -9191614692673160891L;
        hi.dmtt[252] = 5577300008603673090L;
        hi.dmtt[253] = -1716507454605014435L;
        hi.dmtt[254] = 5293716364684569940L;
        hi.dmtt[255] = 4172159248398046166L;
        hi.dmtt[256] = -3494855507879795640L;
        hi.dmtt[257] = -2774815505630306455L;
        hi.dmtt[258] = 7245197404039308848L;
        hi.dmtt[259] = -3329214489836081379L;
        hi.dmtt[260] = 9098694067681231843L;
        hi.dmtt[261] = 5268988693819785160L;
        hi.dmtt[262] = 4012701514274706186L;
        hi.dmtt[263] = -6842428965283805663L;
        hi.dmtt[264] = 3458291285986815302L;
        hi.dmtt[265] = -3639924481130137609L;
        hi.dmtt[266] = 2041340067367070353L;
        hi.dmtt[267] = -2139699823827321442L;
        hi.dmtt[268] = -2365580559690653389L;
        hi.dmtt[269] = -1841295718631585553L;
        hi.dmtt[270] = -2306240657790115163L;
        hi.dmtt[271] = 4141422859651814538L;
        hi.dmtt[272] = 4045399004327157006L;
        hi.dmtt[273] = -5996015093389747672L;
        hi.dmtt[274] = -3726312205381842144L;
        hi.dmtt[275] = 7609369752840868268L;
        hi.dmtt[276] = 539781549071826134L;
        hi.dmtt[277] = -8696820547919035759L;
        hi.dmtt[278] = -2064790474762167900L;
        hi.dmtt[279] = -161247314317656363L;
        hi.dmtt[280] = -3789834419886846467L;
        hi.dmtt[281] = 8745035001785189701L;
        hi.dmtt[282] = -7585088380624645891L;
        hi.dmtt[283] = 1644638164328917020L;
        hi.dmtt[284] = 1792331762630737592L;
        hi.dmtt[285] = 1863775122832430673L;
        hi.dmtt[286] = 3519335332750114362L;
        hi.dmtt[287] = 8926565527017148021L;
        hi.dmtt[288] = -4905298804153918506L;
        hi.dmtt[289] = -8148764182903563090L;
        hi.dmtt[290] = -3567957663831712999L;
        hi.dmtt[291] = 1785329335487934062L;
        hi.dmtt[292] = 5151674073509246671L;
        hi.dmtt[293] = -3917644749588291973L;
        hi.dmtt[294] = -3999502642936295324L;
        hi.dmtt[295] = 4419962822125300962L;
        hi.dmtt[296] = -4675916518404575359L;
        hi.dmtt[297] = -3588737824818904222L;
        hi.dmtt[298] = 3712114495100957199L;
        hi.dmtt[299] = -504179477851456967L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private float getEffectiveThreshold() {
        block60: {
            block59: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_1 = hi.ib - hi.dmsl("dnoz", dmts(int ), (int)51)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == hi.dmsl("dnpa", dmsv(int ), (int)299)) break;
                    v0 /* !! */  = (long)hi.dmsl("dnpb", dmsv(int ), (int)300);
                }
                var5_1 = hi.c;
                while (true) {
                    block61: {
                        if ((v1 /* !! */  = (cfr_temp_2 = hi.ib - hi.dmsl("dnpc", dmts(int ), (int)52)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v1 /* !! */  != hi.dmsl("dnpd", dmsv(int ), (int)301)) break block61;
                        var4_2 /* !! */  = hi.b;
                        v2 /* !! */  = hi.ib;
                        if (true) ** GOTO lbl18
                    }
                    v1 /* !! */  = (long)hi.dmsl("dnpe", dmsv(int ), (int)302);
                }
                block37: while (true) {
                    v2 /* !! */  = (long)(v3 - hi.dmsl("dnpf", dmts(int ), (int)53));
lbl18:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1876097129: {
                            v3 = hi.dmsl("dnpg", dmts(int ), (int)54);
                            continue block37;
                        }
                        case -539845535: {
                            v3 = hi.dmsl("dnph", dmts(int ), (int)55);
                            continue block37;
                        }
                        case 839517192: {
                            v3 = hi.dmsl("dnpi", dmts(int ), (int)56);
                            continue block37;
                        }
                        case 1228545173: {
                            break block37;
                        }
                    }
                    break;
                }
                var3_3 = hi.a;
                if (var5_1) {
                    throw null;
                }
                if (var3_3 || var3_3) return (float)hi.dmsl("dnpj", dmsi(int ), (int)303);
                while (true) {
                    block62: {
                        if ((v4 /* !! */  = (cfr_temp_3 = hi.ib - hi.dmsl("dnpk", dmts(int ), (int)57)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v4 /* !! */  != hi.dmsl("dnpl", dmsv(int ), (int)304)) break block62;
                        v5 /* !! */  = hi.ib;
                        if (true) ** GOTO lbl44
                    }
                    v4 /* !! */  = (long)hi.dmsl("dnpm", dmsv(int ), (int)305);
                }
                block39: while (true) {
                    v5 /* !! */  = (long)(v6 - hi.dmsl("dnpn", dmts(int ), (int)58));
lbl44:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1589717353: {
                            v6 = hi.dmsl("dnpo", dmts(int ), (int)59);
                            continue block39;
                        }
                        case 1156465453: {
                            v6 = hi.dmsl("dnpp", dmts(int ), (int)60);
                            continue block39;
                        }
                        case 1228545173: {
                            break block39;
                        }
                        case 2143727631: {
                            v6 = hi.dmsl("dnpq", dmts(int ), (int)61);
                            continue block39;
                        }
                    }
                    break;
                }
                var1_4 = this.healthThreshold.getValue();
                if (var3_3 || var3_3) return (float)hi.dmsl("dnpj", dmsi(int ), (int)303);
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_4 = hi.ib - hi.dmsl("dnpr", dmts(int ), (int)62)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == hi.dmsl("dnps", dmsv(int ), (int)306)) {
                        if (this.check("\u041d\u0435 \u043f\u043e\u043b\u043d\u0430\u044f \u0431\u0440\u043e\u043d\u044f")) {
                            break;
                        }
                        break block59;
                    }
                    v7 /* !! */  = (long)hi.dmsl("dnpt", dmsv(int ), (int)307);
                }
                if (var3_3 || var3_3) return (float)hi.dmsl("dnpj", dmsi(int ), (int)303);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_5 = hi.ib - hi.dmsl("dnpu", dmts(int ), (int)63)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == hi.dmsl("dnpv", dmsv(int ), (int)308)) {
                        var2_5 = this.getArmorPoints();
                        if (var3_3) return (float)hi.dmsl("dnpj", dmsi(int ), (int)303);
                        break;
                    }
                    v8 /* !! */  = (long)hi.dmsl("dnpw", dmsv(int ), (int)309);
                }
                if (var3_3) return (float)hi.dmsl("dnpj", dmsi(int ), (int)303);
                if (var2_5 >= hi.dmsl("dnpx", dmsv(int ), (int)310)) break block59;
                if (var3_3 || var3_3) return (float)hi.dmsl("dnpj", dmsi(int ), (int)303);
                while (true) {
                    block63: {
                        if ((v9 /* !! */  = (cfr_temp_6 = hi.ib - hi.dmsl("dnpy", dmts(int ), (int)64)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v9 /* !! */  != hi.dmsl("dnpz", dmsv(int ), (int)311)) break block63;
                        v10 /* !! */  = hi.ib;
                        if (true) ** GOTO lbl88
                    }
                    v9 /* !! */  = (long)hi.dmsl("dnqa", dmsv(int ), (int)312);
                }
                block43: while (true) {
                    v10 /* !! */  = (long)(v11 - hi.dmsl("dnqb", dmts(int ), (int)65));
lbl88:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1763915992: {
                            v11 = hi.dmsl("dnqc", dmts(int ), (int)66);
                            continue block43;
                        }
                        case -1736268301: {
                            v11 = hi.dmsl("dnqd", dmts(int ), (int)67);
                            continue block43;
                        }
                        case -652605985: {
                            v11 = hi.dmsl("dnqe", dmts(int ), (int)68);
                            continue block43;
                        }
                        case 1228545173: {
                            break block43;
                        }
                    }
                    break;
                }
                var1_4 += this.armorBonusHealth.getValue();
                if (var3_3) return (float)hi.dmsl("dnpj", dmsi(int ), (int)303);
            }
            if (var3_3) return (float)hi.dmsl("dnpj", dmsi(int ), (int)303);
            if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block44: do {
                switch (cfr_temp_0 == -2147483648 ? var4_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (!var3_3) return var1_4;
                        return (float)hi.dmsl("dnpj", dmsi(int ), (int)303);
                    }
                    case 0: {
                        var4_2 /* !! */  = (int)hi.dmsl("dnqf", dmsv(int ), (int)313);
                        cfr_temp_0 = 11;
                        if (!var5_1) continue block44;
                        throw null;
                    }
                    case 1: {
                        var4_2 /* !! */  = (int)hi.dmsl("dnqg", dmsv(int ), (int)314);
                        cfr_temp_0 = 13;
                        if (!var5_1) continue block44;
                        throw null;
                    }
                    case 5: {
                        var4_2 /* !! */  = (int)hi.dmsl("dnqk", dmsv(int ), (int)318);
                        if (var5_1) {
                            throw null;
                        }
                    }
                    case 3: {
                        var4_2 /* !! */  = (int)hi.dmsl("dnqi", dmsv(int ), (int)316);
                        cfr_temp_0 = 2;
                        if (!var5_1) continue block44;
                        throw null;
                    }
                    case 6: {
                        ** break;
                    }
                    case 8: {
                        var4_2 /* !! */  = (int)hi.dmsl("dnqn", dmsv(int ), (int)321);
                        cfr_temp_0 = 2;
                        if (!var5_1) continue block44;
                        throw null;
                    }
                    case 9: {
                        var4_2 /* !! */  = (int)hi.dmsl("dnqo", dmsv(int ), (int)322);
                        if (var5_1) {
                            throw null;
                        }
                    }
                    case 12: {
                        var4_2 /* !! */  = (int)hi.dmsl("dnqr", dmsv(int ), (int)325);
                        cfr_temp_0 = 7;
                        if (!var5_1) continue block44;
                        throw null;
                    }
                    case 13: {
                        var4_2 /* !! */  = (int)hi.dmsl("dnqs", dmsv(int ), (int)326);
                        if (var5_1) {
                            throw null;
                        }
                    }
                    case 10: {
                        var4_2 /* !! */  = (int)hi.dmsl("dnqp", dmsv(int ), (int)323);
                        cfr_temp_0 = 4;
                        if (!var5_1) continue block44;
                        throw null;
                    }
                    case 14: {
                        break block60;
                    }
                    case 2: {
                        var4_2 /* !! */  = (int)hi.dmsl("dnqh", dmsv(int ), (int)315);
                        if (var5_1) {
                            throw null;
                        }
                    }
                    case 4: {
                        var4_2 /* !! */  = (int)hi.dmsl("dnqj", dmsv(int ), (int)317);
                        if (var5_1) {
                            throw null;
                        }
                    }
                    case 11: {
                        var4_2 /* !! */  = (int)hi.dmsl("dnqq", dmsv(int ), (int)324);
                        cfr_temp_0 = 2;
                        if (!var5_1) continue block44;
                        throw null;
                    }
lbl170:
                    // 2 sources

                    while (true) {
                        var4_2 /* !! */  = (int)hi.dmsl("dnql", dmsv(int ), (int)319);
                        cfr_temp_0 = 7;
                        if (!var5_1) continue block44;
                        throw null;
                    }
                    case 7: 
                }
                break;
            } while (true);
            var4_2 /* !! */  = (int)hi.dmsl("dnqm", dmsv(int ), (int)320);
            if (!var5_1) ** break;
            throw null;
        }
        var4_2 /* !! */  = (int)hi.dmsl("dnqt", dmsv(int ), (int)327);
        ** while (!var5_1)
lbl184:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dtmi() {
        hi.dmsk[500] = -132696051;
        hi.dmsk[501] = -1524081834;
        hi.dmsk[502] = -441367200;
        hi.dmsk[503] = -1266205036;
        hi.dmsk[504] = 78277546;
        hi.dmsk[505] = -160011921;
        hi.dmsk[506] = -91560677;
        hi.dmsk[507] = 705775663;
        hi.dmsk[508] = 1931763830;
        hi.dmsk[509] = 715611170;
        hi.dmsk[510] = -1439653181;
        hi.dmsk[511] = -2009965281;
        hi.dmsk[512] = 772715668;
        hi.dmsk[513] = 1111834929;
        hi.dmsk[514] = 786123540;
        hi.dmsk[515] = -1318118541;
        hi.dmsk[516] = 195706162;
        hi.dmsk[517] = 1500053084;
        hi.dmsk[518] = 153587629;
        hi.dmsk[519] = -1265968370;
        hi.dmsk[520] = -1845918007;
        hi.dmsk[521] = -970979745;
        hi.dmsk[522] = -1159247118;
        hi.dmsk[523] = -1462735426;
        hi.dmsk[524] = 721456821;
        hi.dmsk[525] = 1227839147;
        hi.dmsk[526] = 1296333864;
        hi.dmsk[527] = -386700759;
        hi.dmsk[528] = -626188712;
        hi.dmsk[529] = -631094993;
        hi.dmsk[530] = 2147280118;
        hi.dmsk[531] = 803739264;
        hi.dmsk[532] = 810668712;
        hi.dmsk[533] = 383825424;
        hi.dmsk[534] = -2081076904;
        hi.dmsk[535] = 533984131;
        hi.dmsk[536] = -1405486721;
        hi.dmsk[537] = -1340426214;
        hi.dmsk[538] = -1285360728;
        hi.dmsk[539] = 1311364186;
        hi.dmsk[540] = 1280251516;
        hi.dmsk[541] = 384707107;
        hi.dmsk[542] = 1409171625;
        hi.dmsk[543] = -458867999;
        hi.dmsk[544] = -308077378;
        hi.dmsk[545] = -1939230431;
        hi.dmsk[546] = 68809035;
        hi.dmsk[547] = 1733924574;
        hi.dmsk[548] = 2106452877;
        hi.dmsk[549] = 1965301083;
        hi.dmsk[550] = -1202399283;
        hi.dmsk[551] = -398846657;
        hi.dmsk[552] = -1344359873;
        hi.dmsk[553] = -720964358;
        hi.dmsk[554] = 274197130;
        hi.dmsk[555] = -423521954;
        hi.dmsk[556] = -1663103401;
        hi.dmsk[557] = 921334784;
        hi.dmsk[558] = -545664555;
        hi.dmsk[559] = 797239479;
        hi.dmsk[560] = -1716702666;
        hi.dmsk[561] = -990476156;
        hi.dmsk[562] = 321628029;
        hi.dmsk[563] = 42886045;
        hi.dmsk[564] = -2123024326;
        hi.dmsk[565] = -836049434;
        hi.dmsk[566] = 769370616;
        hi.dmsk[567] = 1571687819;
        hi.dmsk[568] = 1150313158;
        hi.dmsk[569] = -1073917735;
        hi.dmsk[570] = -1765299413;
        hi.dmsk[571] = 1119670497;
        hi.dmsk[572] = 10795315;
        hi.dmsk[573] = -1392513956;
        hi.dmsk[574] = 334710068;
        hi.dmsk[575] = 105614030;
        hi.dmsk[576] = 909523583;
        hi.dmsk[577] = -291586743;
        hi.dmsk[578] = 1544241371;
        hi.dmsk[579] = 947700925;
        hi.dmsk[580] = 115453149;
        hi.dmsk[581] = -1033189460;
        hi.dmsk[582] = -1877160868;
        hi.dmsk[583] = -1918450406;
        hi.dmsk[584] = 651215170;
        hi.dmsk[585] = -2105094334;
        hi.dmsk[586] = 590000807;
        hi.dmsk[587] = 209181245;
        hi.dmsk[588] = -939510625;
        hi.dmsk[589] = 2022327397;
        hi.dmsk[590] = -1562796929;
        hi.dmsk[591] = 0x777CC7C7;
        hi.dmsk[592] = 0xC969C6C;
        hi.dmsk[593] = 1231974610;
        hi.dmsk[594] = 1832855778;
        hi.dmsk[595] = -797519428;
        hi.dmsk[596] = -372588107;
        hi.dmsk[597] = 1432464197;
        hi.dmsk[598] = 726146027;
        hi.dmsk[599] = 149603329;
    }

    private static /* synthetic */ void dtmm() {
        hi.dmsk[900] = 1778882420;
        hi.dmsk[901] = 480805;
        hi.dmsk[902] = -1616346495;
        hi.dmsk[903] = 587009854;
        hi.dmsk[904] = 1446992824;
        hi.dmsk[905] = 1208931077;
        hi.dmsk[906] = -563098903;
        hi.dmsk[907] = -1015638606;
        hi.dmsk[908] = 1225274869;
        hi.dmsk[909] = -67937302;
        hi.dmsk[910] = -1655104009;
        hi.dmsk[911] = 96186790;
        hi.dmsk[912] = 1965686786;
        hi.dmsk[913] = 224488406;
        hi.dmsk[914] = -1211312554;
        hi.dmsk[915] = 1685615498;
        hi.dmsk[916] = -1939462862;
        hi.dmsk[917] = -1686394202;
        hi.dmsk[918] = -1902733643;
        hi.dmsk[919] = 805948780;
        hi.dmsk[920] = 69114733;
        hi.dmsk[921] = 385440099;
        hi.dmsk[922] = 1939661186;
        hi.dmsk[923] = 1051937125;
        hi.dmsk[924] = 688966300;
        hi.dmsk[925] = -1664176169;
        hi.dmsk[926] = 605284600;
        hi.dmsk[927] = -690670762;
        hi.dmsk[928] = 197985866;
        hi.dmsk[929] = 1468333923;
        hi.dmsk[930] = 1572789083;
        hi.dmsk[931] = 753871316;
        hi.dmsk[932] = -1359381113;
        hi.dmsk[933] = 863088400;
        hi.dmsk[934] = -1153224830;
        hi.dmsk[935] = 193350240;
        hi.dmsk[936] = 670680336;
        hi.dmsk[937] = -581409565;
        hi.dmsk[938] = -1044007530;
        hi.dmsk[939] = 684027099;
        hi.dmsk[940] = 1887592364;
        hi.dmsk[941] = -17436556;
        hi.dmsk[942] = 255946776;
        hi.dmsk[943] = 1881219640;
        hi.dmsk[944] = -30283560;
        hi.dmsk[945] = -290010431;
        hi.dmsk[946] = -779847384;
        hi.dmsk[947] = -1732952257;
        hi.dmsk[948] = -1983940605;
        hi.dmsk[949] = -869974495;
        hi.dmsk[950] = -455300472;
        hi.dmsk[951] = 767703792;
        hi.dmsk[952] = -1348381045;
        hi.dmsk[953] = 1956612962;
        hi.dmsk[954] = 624444025;
        hi.dmsk[955] = 539351132;
        hi.dmsk[956] = 2079591027;
        hi.dmsk[957] = -1809462372;
        hi.dmsk[958] = -1986932295;
        hi.dmsk[959] = -356732293;
        hi.dmsk[960] = -420864607;
        hi.dmsk[961] = 845801515;
        hi.dmsk[962] = -2127047664;
        hi.dmsk[963] = -386851259;
        hi.dmsk[964] = 309604864;
        hi.dmsk[965] = 1279085522;
        hi.dmsk[966] = 140138276;
        hi.dmsk[967] = -1655253214;
        hi.dmsk[968] = 1965835154;
        hi.dmsk[969] = 1453915296;
        hi.dmsk[970] = 1621315209;
        hi.dmsk[971] = -1408667973;
        hi.dmsk[972] = -573532741;
        hi.dmsk[973] = 1787026974;
        hi.dmsk[974] = -830490928;
        hi.dmsk[975] = -1435296056;
        hi.dmsk[976] = 776986880;
        hi.dmsk[977] = 40912327;
        hi.dmsk[978] = -999816472;
        hi.dmsk[979] = 582607542;
        hi.dmsk[980] = -327713855;
        hi.dmsk[981] = -688001887;
        hi.dmsk[982] = -1540917711;
        hi.dmsk[983] = -730118278;
        hi.dmsk[984] = -196316173;
        hi.dmsk[985] = 1907543557;
        hi.dmsk[986] = -336755941;
        hi.dmsk[987] = 434490117;
        hi.dmsk[988] = -252117105;
        hi.dmsk[989] = -1992049246;
        hi.dmsk[990] = 113901005;
        hi.dmsk[991] = -267447973;
        hi.dmsk[992] = 236371798;
        hi.dmsk[993] = 1355283242;
        hi.dmsk[994] = -288973654;
        hi.dmsk[995] = -1993299097;
        hi.dmsk[996] = -961621572;
        hi.dmsk[997] = -1767595212;
        hi.dmsk[998] = 557508616;
        hi.dmsk[999] = 1154272622;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean hasEntityNearby(Predicate<class_1297> var1_1, double var2_2) {
        block127: {
            block126: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = hi.ib - hi.dmsl("doil", dmts(int ), (int)182)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == hi.dmsl("doim", dmsv(int ), (int)559)) break;
                    v0 /* !! */  = (long)hi.dmsl("doin", dmsv(int ), (int)560);
                }
                var9_3 = hi.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_1 = hi.ib - hi.dmsl("doio", dmts(int ), (int)183)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  == hi.dmsl("doip", dmsv(int ), (int)561)) break;
                    v1 /* !! */  = (long)hi.dmsl("doiq", dmsv(int ), (int)562);
                }
                var8_4 /* !! */  = hi.b;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = hi.ib - hi.dmsl("doir", dmts(int ), (int)184)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == hi.dmsl("dois", dmsv(int ), (int)563)) break;
                    v2 /* !! */  = (long)hi.dmsl("doit", dmsv(int ), (int)564);
                }
                var7_5 = hi.a;
                if (var9_3) {
                    throw null;
lbl21:
                    // 15 sources

                    return (boolean)hi.dmsl("doiu", dmsv(int ), (int)565);
                }
                if (var7_5 || var7_5) ** GOTO lbl21
                v3 /* !! */  = hi.ib;
                if (true) ** GOTO lbl28
                block81: while (true) {
                    v3 /* !! */  = (long)(v4 - hi.dmsl("doiv", dmts(int ), (int)185));
lbl28:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -817100905: {
                            v4 = hi.dmsl("doiw", dmts(int ), (int)186);
                            continue block81;
                        }
                        case 496975468: {
                            v4 = hi.dmsl("doix", dmts(int ), (int)187);
                            continue block81;
                        }
                        case 1228545173: {
                            break block81;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = hi.ib - hi.dmsl("doiy", dmts(int ), (int)188)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == hi.dmsl("doiz", dmsv(int ), (int)566)) break;
                    v5 /* !! */  = (long)hi.dmsl("doja", dmsv(int ), (int)567);
                }
                if (hi.mc.field_1687 == null) break block126;
                if (var7_5) ** GOTO lbl21
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_4 = hi.ib - hi.dmsl("dojb", dmts(int ), (int)189)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == hi.dmsl("dojc", dmsv(int ), (int)568)) break;
                    v6 /* !! */  = (long)hi.dmsl("dojd", dmsv(int ), (int)569);
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_5 = hi.ib - hi.dmsl("doje", dmts(int ), (int)190)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == hi.dmsl("dojf", dmsv(int ), (int)570)) break;
                    v7 /* !! */  = (long)hi.dmsl("dojg", dmsv(int ), (int)571);
                }
                if (hi.mc.field_1724 != null) break block127;
                if (var7_5) ** GOTO lbl21
            }
            if (var7_5 || var7_5) ** GOTO lbl21
            return (boolean)hi.dmsl("dojh", dmsv(int ), (int)572);
        }
        if (var7_5 || var7_5) ** GOTO lbl21
        v8 /* !! */  = hi.ib;
        if (true) ** GOTO lbl65
        block85: while (true) {
            v8 /* !! */  = (long)(hi.dmsl("dojj", dmts(int ), (int)192) - hi.dmsl("doji", dmts(int ), (int)191));
lbl65:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1406239791: {
                    continue block85;
                }
                case 1228545173: {
                    break block85;
                }
            }
            break;
        }
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_6 = hi.ib - hi.dmsl("dojk", dmts(int ), (int)193)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == hi.dmsl("dojl", dmsv(int ), (int)573)) break;
            v9 /* !! */  = (long)hi.dmsl("dojm", dmsv(int ), (int)574);
        }
        v10 = hi.mc.field_1724;
        v11 /* !! */  = hi.ib;
        if (true) ** GOTO lbl80
        block87: while (true) {
            v11 /* !! */  = (long)(v12 - hi.dmsl("dojn", dmts(int ), (int)194));
lbl80:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -2126820018: {
                    v12 = hi.dmsl("dojo", dmts(int ), (int)195);
                    continue block87;
                }
                case -1645251205: {
                    v12 = hi.dmsl("dojp", dmts(int ), (int)196);
                    continue block87;
                }
                case 1228545173: {
                    break block87;
                }
            }
            break;
        }
        v13 = v10.method_5829();
        v14 /* !! */  = hi.ib;
        if (true) ** GOTO lbl94
        block88: while (true) {
            v14 /* !! */  = (long)(hi.dmsl("dojr", dmts(int ), (int)198) - hi.dmsl("dojq", dmts(int ), (int)197));
lbl94:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case 1187605091: {
                    continue block88;
                }
                case 1228545173: {
                    break block88;
                }
            }
            break;
        }
        var4_6 = v13.method_1014(var2_2);
        if (var7_5 || var7_5) ** GOTO lbl21
        v15 /* !! */  = hi.ib;
        if (true) ** GOTO lbl105
        block89: while (true) {
            v15 /* !! */  = (long)(v16 - hi.dmsl("dojs", dmts(int ), (int)199));
lbl105:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -19808458: {
                    v16 = hi.dmsl("dojt", dmts(int ), (int)200);
                    continue block89;
                }
                case 1228545173: {
                    break block89;
                }
                case 1530369847: {
                    v16 = hi.dmsl("doju", dmts(int ), (int)201);
                    continue block89;
                }
            }
            break;
        }
        v17 /* !! */  = hi.ib;
        if (true) ** GOTO lbl118
        block90: while (true) {
            v17 /* !! */  = (long)(v18 - hi.dmsl("dojv", dmts(int ), (int)202));
lbl118:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case -1124556562: {
                    v18 = hi.dmsl("dojw", dmts(int ), (int)203);
                    continue block90;
                }
                case -571763751: {
                    v18 = hi.dmsl("dojx", dmts(int ), (int)204);
                    continue block90;
                }
                case 195370905: {
                    v18 = hi.dmsl("dojy", dmts(int ), (int)205);
                    continue block90;
                }
                case 1228545173: {
                    break block90;
                }
            }
            break;
        }
        v19 = hi.mc.field_1687;
        v20 /* !! */  = hi.ib;
        if (true) ** GOTO lbl135
        block91: while (true) {
            v20 /* !! */  = (long)(hi.dmsl("doka", dmts(int ), (int)207) - hi.dmsl("dojz", dmts(int ), (int)206));
lbl135:
            // 2 sources

            switch ((int)v20 /* !! */ ) {
                case 246313544: {
                    continue block91;
                }
                case 1228545173: {
                    break block91;
                }
            }
            break;
        }
        while (true) {
            if ((v21 /* !! */  = (cfr_temp_7 = hi.ib - hi.dmsl("dokb", dmts(int ), (int)208)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v21 /* !! */  == hi.dmsl("dokc", dmsv(int ), (int)575)) break;
            v21 /* !! */  = (long)hi.dmsl("dokg", dmsv(int ), (int)576);
        }
        v22 = hi.mc.field_1724;
        v23 /* !! */  = hi.ib;
        if (true) ** GOTO lbl150
        block93: while (true) {
            v23 /* !! */  = (long)(v24 - hi.dmsl("dokh", dmts(int ), (int)209));
lbl150:
            // 2 sources

            switch ((int)v23 /* !! */ ) {
                case -2046949772: {
                    v24 = hi.dmsl("doki", dmts(int ), (int)210);
                    continue block93;
                }
                case 1019718305: {
                    v24 = hi.dmsl("dokj", dmts(int ), (int)211);
                    continue block93;
                }
                case 1228545173: {
                    break block93;
                }
            }
            break;
        }
        v25 = v19.method_8335((class_1297)v22, var4_6);
        v26 /* !! */  = hi.ib;
        if (true) ** GOTO lbl164
        block94: while (true) {
            v26 /* !! */  = (long)(v27 - hi.dmsl("dokk", dmts(int ), (int)212));
lbl164:
            // 2 sources

            switch ((int)v26 /* !! */ ) {
                case -1520966606: {
                    v27 = hi.dmsl("dokm", dmts(int ), (int)213);
                    continue block94;
                }
                case -1215291186: {
                    v27 = hi.dmsl("dokt", dmts(int ), (int)214);
                    continue block94;
                }
                case 1228545173: {
                    break block94;
                }
            }
            break;
        }
        var5_7 = v25.iterator();
        if (var7_5) ** GOTO lbl21
        block95: while (true) {
            block128: {
                if (var7_5 || var7_5) ** GOTO lbl21
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_8 = hi.ib - hi.dmsl("doku", dmts(int ), (int)215)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v28 /* !! */  == hi.dmsl("dokv", dmsv(int ), (int)577)) break;
                    v28 /* !! */  = (long)hi.dmsl("dokw", dmsv(int ), (int)578);
                }
                if (!var5_7.hasNext()) ** GOTO lbl229
                if (var7_5) ** GOTO lbl21
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_9 = hi.ib - hi.dmsl("doky", dmts(int ), (int)216)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == hi.dmsl("dola", dmsv(int ), (int)579)) break;
                    v29 /* !! */  = (long)hi.dmsl("dold", dmsv(int ), (int)580);
                }
                var6_8 = (class_1297)var5_7.next();
                if (var7_5 || var7_5) ** GOTO lbl21
                while (true) {
                    if ((v30 /* !! */  = (cfr_temp_10 = hi.ib - hi.dmsl("dolh", dmts(int ), (int)217)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v30 /* !! */  == hi.dmsl("dolk", dmsv(int ), (int)581)) break;
                    v30 /* !! */  = (long)hi.dmsl("dolm", dmsv(int ), (int)582);
                }
                if (!var1_1.test(var6_8)) break block128;
                if (var7_5 || var7_5) ** GOTO lbl21
                while (true) {
                    if ((v31 /* !! */  = (cfr_temp_11 = hi.ib - hi.dmsl("dolp", dmts(int ), (int)218)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v31 /* !! */  == hi.dmsl("dolq", dmsv(int ), (int)583)) break;
                    v31 /* !! */  = (long)hi.dmsl("dolr", dmsv(int ), (int)584);
                }
                while (true) {
                    if ((v32 /* !! */  = (cfr_temp_12 = hi.ib - hi.dmsl("dols", dmts(int ), (int)219)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v32 /* !! */  == hi.dmsl("dolz", dmsv(int ), (int)585)) break;
                    v32 /* !! */  = (long)hi.dmsl("domb", dmsv(int ), (int)586);
                }
                v33 = hi.mc.field_1724;
                v34 /* !! */  = hi.ib;
                if (true) ** GOTO lbl213
                block101: while (true) {
                    v34 /* !! */  = (long)(hi.dmsl("domd", dmts(int ), (int)221) - hi.dmsl("domc", dmts(int ), (int)220));
lbl213:
                    // 2 sources

                    switch ((int)v34 /* !! */ ) {
                        case 1228545173: {
                            break block101;
                        }
                        case 1460236933: {
                            continue block101;
                        }
                    }
                    break;
                }
                if (!((double)v33.method_5739(var6_8) <= var2_2)) break block128;
                if (var7_5 || var7_5) ** GOTO lbl21
                return (boolean)hi.dmsl("dome", dmsv(int ), (int)587);
            }
            if (var7_5) ** GOTO lbl21
            if (var8_4 /* !! */  == 0) ** GOTO lbl-1000
            switch (var8_4 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var7_5) ** GOTO lbl21
                    if (!var9_3) continue block95;
                    throw null;
                }
lbl229:
                // 1 sources

                if (!var7_5 && !var7_5) ** break;
                ** continue;
                return (boolean)hi.dmsl("doml", dmsv(int ), (int)588);
lbl232:
                // 3 sources

                case 0: {
                    var8_4 /* !! */  = (int)hi.dmsl("domm", dmsv(int ), (int)589);
                    if (var9_3) {
                        throw null;
                    }
                    ** GOTO lbl252
                }
lbl237:
                // 2 sources

                case 1: {
                    var8_4 /* !! */  = (int)hi.dmsl("domp", dmsv(int ), (int)590);
                    if (var9_3) {
                        throw null;
                    }
                    ** GOTO lbl276
                }
lbl242:
                // 4 sources

                case 2: {
                    var8_4 /* !! */  = (int)hi.dmsl("domr", dmsv(int ), (int)591);
                    if (var9_3) {
                        throw null;
                    }
                }
                case 3: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var8_4 /* !! */  = (int)hi.dmsl("domu", dmsv(int ), (int)592);
                        if (var9_3) {
                            throw null;
                        }
                        ** GOTO lbl299
                        break;
                    }
                }
lbl252:
                // 2 sources

                case 4: {
                    var8_4 /* !! */  = (int)hi.dmsl("domx", dmsv(int ), (int)593);
                    if (var9_3) {
                        throw null;
                    }
                    ** GOTO lbl313
                }
lbl257:
                // 3 sources

                case 5: {
                    var8_4 /* !! */  = (int)hi.dmsl("domy", dmsv(int ), (int)594);
                    if (var9_3) {
                        throw null;
                    }
                    ** GOTO lbl281
                }
                case 6: {
                    var8_4 /* !! */  = (int)hi.dmsl("domz", dmsv(int ), (int)595);
                    if (!var9_3) ** GOTO lbl232
                    throw null;
                }
lbl266:
                // 3 sources

                case 7: {
                    var8_4 /* !! */  = (int)hi.dmsl("dona", dmsv(int ), (int)596);
                    if (var9_3) {
                        throw null;
                    }
                    ** GOTO lbl346
                }
                case 8: {
                    do {
                        var8_4 /* !! */  = (int)hi.dmsl("donh", dmsv(int ), (int)597);
                    } while (!var9_3);
                    throw null;
                }
lbl276:
                // 2 sources

                case 9: {
                    var8_4 /* !! */  = (int)hi.dmsl("doni", dmsv(int ), (int)598);
                    if (var9_3) {
                        throw null;
                    }
                    ** GOTO lbl330
                }
lbl281:
                // 2 sources

                case 10: {
                    do {
                        var8_4 /* !! */  = (int)hi.dmsl("donj", dmsv(int ), (int)599);
                    } while (!var9_3);
                    throw null;
                }
                case 11: {
                    var8_4 /* !! */  = (int)hi.dmsl("donk", dmsv(int ), (int)600);
                    if (!var9_3) ** GOTO lbl257
                    throw null;
                }
lbl290:
                // 2 sources

                case 12: {
                    var8_4 /* !! */  = (int)hi.dmsl("donn", dmsv(int ), (int)601);
                    if (var9_3) {
                        throw null;
                    }
                }
                case 13: {
                    var8_4 /* !! */  = (int)hi.dmsl("donq", dmsv(int ), (int)602);
                    if (var9_3) {
                        throw null;
                    }
                    ** GOTO lbl321
                }
lbl299:
                // 2 sources

                case 14: {
                    var8_4 /* !! */  = (int)hi.dmsl("dons", dmsv(int ), (int)603);
                    if (var9_3) {
                        throw null;
                    }
                    ** GOTO lbl317
                }
                case 15: {
                    var8_4 /* !! */  = (int)hi.dmsl("donu", dmsv(int ), (int)604);
                    if (!var9_3) ** GOTO lbl266
                    throw null;
                }
                case 16: {
                    var8_4 /* !! */  = (int)hi.dmsl("donx", dmsv(int ), (int)605);
                    if (var9_3) {
                        throw null;
                    }
                    ** GOTO lbl330
                }
lbl313:
                // 2 sources

                case 17: {
                    var8_4 /* !! */  = (int)hi.dmsl("donz", dmsv(int ), (int)606);
                    if (!var9_3) ** GOTO lbl257
                    throw null;
                }
lbl317:
                // 2 sources

                case 18: {
                    var8_4 /* !! */  = (int)hi.dmsl("doob", dmsv(int ), (int)607);
                    if (!var9_3) ** GOTO lbl242
                    throw null;
                }
lbl321:
                // 2 sources

                case 19: {
                    var8_4 /* !! */  = (int)hi.dmsl("dooc", dmsv(int ), (int)608);
                    if (!var9_3) ** GOTO lbl242
                    throw null;
                }
lbl325:
                // 2 sources

                case 20: {
                    var8_4 /* !! */  = (int)hi.dmsl("dood", dmsv(int ), (int)609);
                    if (var9_3) {
                        throw null;
                    }
                    ** GOTO lbl338
                }
lbl330:
                // 3 sources

                case 21: {
                    var8_4 /* !! */  = (int)hi.dmsl("doof", dmsv(int ), (int)610);
                    if (!var9_3) ** GOTO lbl232
                    throw null;
                }
                case 22: {
                    var8_4 /* !! */  = (int)hi.dmsl("dool", dmsv(int ), (int)611);
                    if (!var9_3) ** GOTO lbl242
                    throw null;
                }
lbl338:
                // 2 sources

                case 23: {
                    var8_4 /* !! */  = (int)hi.dmsl("doom", dmsv(int ), (int)612);
                    if (!var9_3) ** GOTO lbl325
                    throw null;
                }
                case 24: {
                    var8_4 /* !! */  = (int)hi.dmsl("dooo", dmsv(int ), (int)613);
                    if (!var9_3) ** GOTO lbl237
                    throw null;
                }
lbl346:
                // 2 sources

                case 25: {
                    var8_4 /* !! */  = (int)hi.dmsl("door", dmsv(int ), (int)614);
                    if (!var9_3) ** GOTO lbl266
                    throw null;
                }
                case 26: {
                    var8_4 /* !! */  = (int)hi.dmsl("doou", dmsv(int ), (int)615);
                    if (!var9_3) ** GOTO lbl290
                    throw null;
                }
                case 27: 
            }
            break;
        }
        var8_4 /* !! */  = (int)hi.dmsl("doov", dmsv(int ), (int)616);
        ** while (!var9_3)
lbl357:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dtmr() {
        hi.dmsk[1400] = -1903124805;
        hi.dmsk[1401] = 103851600;
        hi.dmsk[1402] = 1319268432;
        hi.dmsk[1403] = -1513157165;
        hi.dmsk[1404] = -1797430901;
        hi.dmsk[1405] = 363769750;
        hi.dmsk[1406] = -551153849;
        hi.dmsk[1407] = 1393122171;
        hi.dmsk[1408] = -1513839888;
        hi.dmsk[1409] = -1491889330;
        hi.dmsk[1410] = -24921409;
        hi.dmsk[1411] = -5645743;
        hi.dmsk[1412] = 1046394783;
        hi.dmsk[1413] = 398036574;
        hi.dmsk[1414] = 440987370;
        hi.dmsk[1415] = 1566599972;
        hi.dmsk[1416] = -1596626676;
        hi.dmsk[1417] = -1415184751;
        hi.dmsk[1418] = 1569325752;
        hi.dmsk[1419] = -1070175839;
        hi.dmsk[1420] = 1457303224;
        hi.dmsk[1421] = 950017985;
        hi.dmsk[1422] = -665335472;
        hi.dmsk[1423] = -377361166;
        hi.dmsk[1424] = 151864058;
        hi.dmsk[1425] = -1615840915;
        hi.dmsk[1426] = 324696990;
        hi.dmsk[1427] = -590469432;
        hi.dmsk[1428] = 1326004578;
        hi.dmsk[1429] = 1168113262;
        hi.dmsk[1430] = -343051239;
        hi.dmsk[1431] = -1025177791;
        hi.dmsk[1432] = 1728891721;
        hi.dmsk[1433] = 1589045856;
        hi.dmsk[1434] = 684443323;
        hi.dmsk[1435] = -1764823169;
        hi.dmsk[1436] = -1882468928;
        hi.dmsk[1437] = 1528348910;
        hi.dmsk[1438] = -1206098392;
        hi.dmsk[1439] = -55699917;
        hi.dmsk[1440] = -1366040193;
        hi.dmsk[1441] = 1441760445;
        hi.dmsk[1442] = -1697245185;
        hi.dmsk[1443] = 371341357;
        hi.dmsk[1444] = 1075084767;
        hi.dmsk[1445] = 634676862;
        hi.dmsk[1446] = -2028347300;
        hi.dmsk[1447] = 334657492;
        hi.dmsk[1448] = -1003764370;
        hi.dmsk[1449] = 206753439;
        hi.dmsk[1450] = -341201821;
        hi.dmsk[1451] = -1831775818;
        hi.dmsk[1452] = -39069091;
        hi.dmsk[1453] = 440856950;
        hi.dmsk[1454] = 1080251911;
        hi.dmsk[1455] = -1325214501;
        hi.dmsk[1456] = -2022510277;
        hi.dmsk[1457] = 1293089008;
        hi.dmsk[1458] = -60367134;
        hi.dmsk[1459] = -604998040;
        hi.dmsk[1460] = 250852362;
        hi.dmsk[1461] = -510056981;
        hi.dmsk[1462] = 1332454474;
        hi.dmsk[1463] = 1819221548;
        hi.dmsk[1464] = -1194286175;
        hi.dmsk[1465] = -1658350994;
        hi.dmsk[1466] = 887321159;
        hi.dmsk[1467] = 409001359;
        hi.dmsk[1468] = -1450709001;
        hi.dmsk[1469] = 873074681;
        hi.dmsk[1470] = 1947502560;
        hi.dmsk[1471] = -2128692073;
        hi.dmsk[1472] = -1347745052;
        hi.dmsk[1473] = 1017411027;
        hi.dmsk[1474] = -986951114;
        hi.dmsk[1475] = -305059655;
        hi.dmsk[1476] = -706968986;
        hi.dmsk[1477] = -780028934;
        hi.dmsk[1478] = -1651004208;
        hi.dmsk[1479] = -1215022473;
        hi.dmsk[1480] = 1974789099;
        hi.dmsk[1481] = -648803042;
        hi.dmsk[1482] = -2067944643;
        hi.dmsk[1483] = 761723040;
        hi.dmsk[1484] = -2121420422;
        hi.dmsk[1485] = -1678387536;
        hi.dmsk[1486] = -89300191;
        hi.dmsk[1487] = 214139495;
        hi.dmsk[1488] = 1320946741;
        hi.dmsk[1489] = -1046963393;
        hi.dmsk[1490] = 1733093064;
        hi.dmsk[1491] = 1996420554;
        hi.dmsk[1492] = 1333062098;
        hi.dmsk[1493] = 983719091;
        hi.dmsk[1494] = -428610625;
        hi.dmsk[1495] = 719110623;
        hi.dmsk[1496] = -1951673763;
        hi.dmsk[1497] = 1140370337;
        hi.dmsk[1498] = 864929103;
        hi.dmsk[1499] = -969221433;
    }

    private static /* synthetic */ double dqyn(int n2) {
        return Double.longBitsToDouble(dmtt[n2] ^ dmtu[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_1799 getStackAtScreenSlot(int var1_1) {
        v0 /* !! */  = hi.ib;
        if (true) ** GOTO lbl5
        block66: while (true) {
            v0 /* !! */  = (long)(hi.dmsl("dqnn", dmts(int ), (int)418) - hi.dmsl("dqnm", dmts(int ), (int)417));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1516881523: {
                    continue block66;
                }
                case 1228545173: {
                    break block66;
                }
            }
            break;
        }
        var4_2 = hi.c;
        v1 /* !! */  = hi.ib;
        if (true) ** GOTO lbl15
        block67: while (true) {
            v1 /* !! */  = (long)(v2 - hi.dmsl("dqno", dmts(int ), (int)419));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 334059699: {
                    v2 = hi.dmsl("dqnp", dmts(int ), (int)420);
                    continue block67;
                }
                case 1228545173: {
                    break block67;
                }
                case 1394784148: {
                    v2 = hi.dmsl("dqnq", dmts(int ), (int)421);
                    continue block67;
                }
                case 1784032198: {
                    v2 = hi.dmsl("dqnr", dmts(int ), (int)422);
                    continue block67;
                }
            }
            break;
        }
        var3_3 /* !! */  = hi.b;
        v3 /* !! */  = hi.ib;
        if (true) ** GOTO lbl32
        block68: while (true) {
            v3 /* !! */  = (long)(v4 - hi.dmsl("dqns", dmts(int ), (int)423));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 324357898: {
                    v4 = hi.dmsl("dqnt", dmts(int ), (int)424);
                    continue block68;
                }
                case 743865362: {
                    v4 = hi.dmsl("dqnu", dmts(int ), (int)425);
                    continue block68;
                }
                case 746326229: {
                    v4 = hi.dmsl("dqnv", dmts(int ), (int)426);
                    continue block68;
                }
                case 1228545173: {
                    break block68;
                }
            }
            break;
        }
        var2_4 = hi.a;
        if (!var4_2) ** GOTO lbl51
        throw null;
        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl51:
                // 1 sources

                if (var2_4 || var2_4) continue block69;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = hi.ib - hi.dmsl("dqnw", dmts(int ), (int)427)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == hi.dmsl("dqnx", dmsv(int ), (int)1283)) break;
                    v5 /* !! */  = (long)hi.dmsl("dqny", dmsv(int ), (int)1284);
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = hi.ib - hi.dmsl("dqnz", dmts(int ), (int)428)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == hi.dmsl("dqoa", dmsv(int ), (int)1285)) break;
                    v6 /* !! */  = (long)hi.dmsl("dqob", dmsv(int ), (int)1286);
                }
                if (hi.mc.field_1724 != null) ** GOTO lbl81
                if (var2_4) continue block69;
                v7 /* !! */  = hi.ib;
                if (true) ** GOTO lbl68
                block72: while (true) {
                    v7 /* !! */  = (long)(v8 - hi.dmsl("dqoc", dmts(int ), (int)429));
lbl68:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1679986320: {
                            v8 = hi.dmsl("dqod", dmts(int ), (int)430);
                            continue block72;
                        }
                        case 626682912: {
                            v8 = hi.dmsl("dqoe", dmts(int ), (int)431);
                            continue block72;
                        }
                        case 1093480591: {
                            v8 = hi.dmsl("dqog", dmts(int ), (int)432);
                            continue block72;
                        }
                        case 1228545173: {
                            break block72;
                        }
                    }
                    break;
                }
                return class_1799.field_8037;
lbl81:
                // 1 sources

                if (var2_4 || var2_4) continue block69;
                if (var1_1 < hi.dmsl("dqoj", dmsv(int ), (int)1287)) ** GOTO lbl113
                if (var2_4) continue block69;
                if (var1_1 >= hi.dmsl("dqol", dmsv(int ), (int)1288)) ** GOTO lbl113
                if (var2_4 || var2_4) continue block69;
                v9 /* !! */  = hi.ib;
                if (true) ** GOTO lbl90
                block73: while (true) {
                    v9 /* !! */  = (long)(hi.dmsl("dqon", dmts(int ), (int)434) - hi.dmsl("dqom", dmts(int ), (int)433));
lbl90:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case 444033257: {
                            continue block73;
                        }
                        case 1228545173: {
                            break block73;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_2 = hi.ib - hi.dmsl("dqoo", dmts(int ), (int)435)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == hi.dmsl("dqop", dmsv(int ), (int)1289)) break;
                    v10 /* !! */  = (long)hi.dmsl("dqot", dmsv(int ), (int)1290);
                }
                v11 = hi.mc.field_1724;
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_3 = hi.ib - hi.dmsl("dqow", dmts(int ), (int)436)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == hi.dmsl("dqoy", dmsv(int ), (int)1291)) break;
                    v12 /* !! */  = (long)hi.dmsl("dqoz", dmsv(int ), (int)1292);
                }
                v13 = v11.method_31548();
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_4 = hi.ib - hi.dmsl("dqpa", dmts(int ), (int)437)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == hi.dmsl("dqpb", dmsv(int ), (int)1293)) break;
                    v14 /* !! */  = (long)hi.dmsl("dqpc", dmsv(int ), (int)1294);
                }
                return v13.method_5438(var1_1);
lbl113:
                // 2 sources

                if (var2_4 || var2_4) continue block69;
                if (var1_1 < hi.dmsl("dqpf", dmsv(int ), (int)1295)) ** GOTO lbl161
                if (var2_4) continue block69;
                if (var1_1 >= hi.dmsl("dqph", dmsv(int ), (int)1296)) ** GOTO lbl161
                if (var2_4 || var2_4) continue block69;
                v15 /* !! */  = hi.ib;
                if (true) ** GOTO lbl122
                block77: while (true) {
                    v15 /* !! */  = (long)(hi.dmsl("dqpm", dmts(int ), (int)439) - hi.dmsl("dqpl", dmts(int ), (int)438));
lbl122:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1091499210: {
                            continue block77;
                        }
                        case 1228545173: {
                            break block77;
                        }
                    }
                    break;
                }
                v16 /* !! */  = hi.ib;
                if (true) ** GOTO lbl131
                block78: while (true) {
                    v16 /* !! */  = (long)(hi.dmsl("dqpp", dmts(int ), (int)441) - hi.dmsl("dqpo", dmts(int ), (int)440));
lbl131:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case 676812977: {
                            continue block78;
                        }
                        case 1228545173: {
                            break block78;
                        }
                    }
                    break;
                }
                v17 = hi.mc.field_1724;
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_5 = hi.ib - hi.dmsl("dqpq", dmts(int ), (int)442)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == hi.dmsl("dqpv", dmsv(int ), (int)1297)) break;
                    v18 /* !! */  = (long)hi.dmsl("dqpy", dmsv(int ), (int)1298);
                }
                v19 = v17.method_31548();
                v20 = var1_1 - hi.dmsl("dqqa", dmsv(int ), (int)1299);
                v21 /* !! */  = hi.ib;
                if (true) ** GOTO lbl148
                block80: while (true) {
                    v21 /* !! */  = (long)(v22 - hi.dmsl("dqqb", dmts(int ), (int)443));
lbl148:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -2109972243: {
                            v22 = hi.dmsl("dqqc", dmts(int ), (int)444);
                            continue block80;
                        }
                        case -9510815: {
                            v22 = hi.dmsl("dqqd", dmts(int ), (int)445);
                            continue block80;
                        }
                        case 1228545173: {
                            break block80;
                        }
                        case 1840716228: {
                            v22 = hi.dmsl("dqqe", dmts(int ), (int)446);
                            continue block80;
                        }
                    }
                    break;
                }
                return v19.method_5438(v20);
lbl161:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                continue block69;
                v23 /* !! */  = hi.ib;
                if (true) ** GOTO lbl167
                block81: while (true) {
                    v23 /* !! */  = (long)(v24 - hi.dmsl("dqqj", dmts(int ), (int)447));
lbl167:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -495208400: {
                            v24 = hi.dmsl("dqqk", dmts(int ), (int)448);
                            continue block81;
                        }
                        case 1228545173: {
                            break block81;
                        }
                        case 1232272420: {
                            v24 = hi.dmsl("dqql", dmts(int ), (int)449);
                            continue block81;
                        }
                    }
                    break;
                }
                return class_1799.field_8037;
                case 0: {
                    var3_3 /* !! */  = (int)hi.dmsl("dqqm", dmsv(int ), (int)1300);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl258
                }
                case 1: {
                    var3_3 /* !! */  = (int)hi.dmsl("dqqn", dmsv(int ), (int)1301);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl192
                }
                case 2: {
                    var3_3 /* !! */  = (int)hi.dmsl("dqqo", dmsv(int ), (int)1302);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl218
                }
lbl192:
                // 2 sources

                case 3: {
                    var3_3 /* !! */  = (int)hi.dmsl("dqqq", dmsv(int ), (int)1303);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl218
                }
                case 4: {
                    var3_3 /* !! */  = (int)hi.dmsl("dqqs", dmsv(int ), (int)1304);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl250
                }
                case 5: {
                    var3_3 /* !! */  = (int)hi.dmsl("dqqu", dmsv(int ), (int)1305);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl218
                }
                case 6: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var3_3 /* !! */  = (int)hi.dmsl("dqqv", dmsv(int ), (int)1306);
                        if (var4_2) {
                            throw null;
                        }
                        ** GOTO lbl223
                        break;
                    }
                }
lbl213:
                // 2 sources

                case 7: {
                    var3_3 /* !! */  = (int)hi.dmsl("dqqw", dmsv(int ), (int)1307);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl246
                }
lbl218:
                // 4 sources

                case 8: {
                    var3_3 /* !! */  = (int)hi.dmsl("dqqx", dmsv(int ), (int)1308);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl258
                }
lbl223:
                // 4 sources

                case 9: {
                    var3_3 /* !! */  = (int)hi.dmsl("dqqy", dmsv(int ), (int)1309);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl237
                }
                case 10: {
                    var3_3 /* !! */  = (int)hi.dmsl("dqqz", dmsv(int ), (int)1310);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl250
                }
lbl233:
                // 2 sources

                case 11: {
                    var3_3 /* !! */  = (int)hi.dmsl("dqra", dmsv(int ), (int)1311);
                    if (!var4_2) ** GOTO lbl223
                    throw null;
                }
lbl237:
                // 2 sources

                case 12: {
                    var3_3 /* !! */  = (int)hi.dmsl("dqrb", dmsv(int ), (int)1312);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl246
                }
                case 13: {
                    var3_3 /* !! */  = (int)hi.dmsl("dqrc", dmsv(int ), (int)1313);
                    if (!var4_2) ** GOTO lbl233
                    throw null;
                }
lbl246:
                // 4 sources

                case 14: {
                    var3_3 /* !! */  = (int)hi.dmsl("dqrd", dmsv(int ), (int)1314);
                    if (!var4_2) ** GOTO lbl223
                    throw null;
                }
lbl250:
                // 3 sources

                case 15: {
                    var3_3 /* !! */  = (int)hi.dmsl("dqre", dmsv(int ), (int)1315);
                    if (!var4_2) ** GOTO lbl213
                    throw null;
                }
lbl254:
                // 2 sources

                case 16: {
                    var3_3 /* !! */  = (int)hi.dmsl("dqrf", dmsv(int ), (int)1316);
                    if (!var4_2) ** GOTO lbl246
                    throw null;
                }
lbl258:
                // 3 sources

                case 17: {
                    var3_3 /* !! */  = (int)hi.dmsl("dqrg", dmsv(int ), (int)1317);
                    if (!var4_2) ** GOTO lbl254
                    throw null;
                }
                case 18: 
            }
        }
        var3_3 /* !! */  = (int)hi.dmsl("dqrh", dmsv(int ), (int)1318);
        ** while (!var4_2)
lbl265:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean hasPlayerHeadInOffhand() {
        block47: {
            v0 /* !! */  = hi.ib;
            if (true) ** GOTO lbl5
            block30: while (true) {
                v0 /* !! */  = (long)(v1 - hi.dmsl("dorq", dmts(int ), (int)238));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -759295756: {
                        v1 = hi.dmsl("dorr", dmts(int ), (int)239);
                        continue block30;
                    }
                    case 911709043: {
                        v1 = hi.dmsl("dort", dmts(int ), (int)240);
                        continue block30;
                    }
                    case 1228545173: {
                        break block30;
                    }
                }
                break;
            }
            var3_1 = hi.c;
            v2 /* !! */  = hi.ib;
            if (true) ** GOTO lbl19
            block31: while (true) {
                v2 /* !! */  = (long)(hi.dmsl("dosa", dmts(int ), (int)242) - hi.dmsl("dorz", dmts(int ), (int)241));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case 954715075: {
                        continue block31;
                    }
                    case 1228545173: {
                        break block31;
                    }
                }
                break;
            }
            var2_2 /* !! */  = hi.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_0 = hi.ib - hi.dmsl("dosb", dmts(int ), (int)243)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == hi.dmsl("dosc", dmsv(int ), (int)636)) break;
                v3 /* !! */  = (long)hi.dmsl("dose", dmsv(int ), (int)637);
            }
            var1_3 = hi.a;
            if (var3_1) {
                throw null;
lbl33:
                // 4 sources

                return (boolean)hi.dmsl("dosh", dmsv(int ), (int)638);
            }
            if (var1_3 || var1_3) ** GOTO lbl33
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_1 = hi.ib - hi.dmsl("dosi", dmts(int ), (int)244)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == hi.dmsl("dosn", dmsv(int ), (int)639)) break;
                v4 /* !! */  = (long)hi.dmsl("doso", dmsv(int ), (int)640);
            }
            v5 /* !! */  = hi.ib;
            if (true) ** GOTO lbl45
            block35: while (true) {
                v5 /* !! */  = (long)(v6 - hi.dmsl("dosp", dmts(int ), (int)245));
lbl45:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1348299513: {
                        v6 = hi.dmsl("dosq", dmts(int ), (int)246);
                        continue block35;
                    }
                    case 806599470: {
                        v6 = hi.dmsl("dosr", dmts(int ), (int)247);
                        continue block35;
                    }
                    case 1228545173: {
                        break block35;
                    }
                }
                break;
            }
            v7 = hi.mc.field_1724;
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_2 = hi.ib - hi.dmsl("dost", dmts(int ), (int)248)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == hi.dmsl("dosv", dmsv(int ), (int)641)) break;
                v8 /* !! */  = (long)hi.dmsl("dota", dmsv(int ), (int)642);
            }
            v9 = v7.method_6079();
            v10 /* !! */  = hi.ib;
            if (true) ** GOTO lbl65
            block37: while (true) {
                v10 /* !! */  = (long)(v11 - hi.dmsl("dotb", dmts(int ), (int)249));
lbl65:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case 735719635: {
                        v11 = hi.dmsl("dotc", dmts(int ), (int)250);
                        continue block37;
                    }
                    case 936622804: {
                        v11 = hi.dmsl("dotd", dmts(int ), (int)251);
                        continue block37;
                    }
                    case 1228545173: {
                        break block37;
                    }
                    case 1610883528: {
                        v11 = hi.dmsl("dote", dmts(int ), (int)252);
                        continue block37;
                    }
                }
                break;
            }
            v12 = v9.method_7909();
            while (true) {
                if ((v13 /* !! */  = (cfr_temp_3 = hi.ib - hi.dmsl("dotf", dmts(int ), (int)253)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v13 /* !! */  == hi.dmsl("dotg", dmsv(int ), (int)643)) break;
                v13 /* !! */  = (long)hi.dmsl("dotm", dmsv(int ), (int)644);
            }
            if (v12 != class_1802.field_8575) break block47;
            if (var1_3) ** GOTO lbl33
            v14 = hi.dmsl("dotn", dmsv(int ), (int)645);
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl97
        }
        if (var1_3) ** GOTO lbl33
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                v14 = hi.dmsl("dotp", dmsv(int ), (int)646);
lbl97:
                // 2 sources

                return (boolean)v14;
            }
lbl98:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)hi.dmsl("dotq", dmsv(int ), (int)647);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl126
            }
lbl103:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)hi.dmsl("dots", dmsv(int ), (int)648);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)hi.dmsl("dott", dmsv(int ), (int)649);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl126
            }
            case 3: {
                var2_2 /* !! */  = (int)hi.dmsl("dotv", dmsv(int ), (int)650);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl122
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hi.dmsl("dotz", dmsv(int ), (int)651);
                    if (!var3_1) ** GOTO lbl103
                    throw null;
                }
            }
lbl122:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)hi.dmsl("doua", dmsv(int ), (int)652);
                if (!var3_1) break;
                throw null;
            }
lbl126:
            // 3 sources

            case 6: {
                var2_2 /* !! */  = (int)hi.dmsl("doub", dmsv(int ), (int)653);
                if (!var3_1) ** GOTO lbl98
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)hi.dmsl("doud", dmsv(int ), (int)654);
        ** while (!var3_1)
lbl133:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean isValidTotem(class_1799 var1_1, boolean var2_2) {
        block71: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_1 = hi.ib - hi.dmsl("dpbn", dmts(int ), (int)273)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == hi.dmsl("dpbo", dmsv(int ), (int)821)) break;
                v0 /* !! */  = (long)hi.dmsl("dpbp", dmsv(int ), (int)822);
            }
            var5_3 = hi.c;
            v1 /* !! */  = hi.ib;
            block38: while (true) {
                switch ((int)v1 /* !! */ ) {
                    case -1212787478: {
                        v1 /* !! */  = (long)(hi.dmsl("dpbr", dmts(int ), (int)275) - hi.dmsl("dpbq", dmts(int ), (int)274));
                        continue block38;
                    }
                    case 1228545173: {
                        break block38;
                    }
                }
                break;
            }
            var4_4 /* !! */  = hi.b;
            v2 /* !! */  = hi.ib;
            if (true) ** GOTO lbl20
            block39: while (true) {
                v2 /* !! */  = (long)(v3 - hi.dmsl("dpbs", dmts(int ), (int)276));
lbl20:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1281379222: {
                        v3 = hi.dmsl("dpbt", dmts(int ), (int)277);
                        continue block39;
                    }
                    case 681908712: {
                        v3 = hi.dmsl("dpbu", dmts(int ), (int)278);
                        continue block39;
                    }
                    case 949892115: {
                        v3 = hi.dmsl("dpbv", dmts(int ), (int)279);
                        continue block39;
                    }
                    case 1228545173: {
                        break block39;
                    }
                }
                break;
            }
            var3_5 = hi.a;
            if (var5_3) {
                throw null;
            }
            if (var3_5 || var3_5) return (boolean)hi.dmsl("dpbw", dmsv(int ), (int)823);
            v4 /* !! */  = hi.ib;
            if (true) ** GOTO lbl40
            block40: while (true) {
                v4 /* !! */  = (long)(v5 - hi.dmsl("dpbx", dmts(int ), (int)280));
lbl40:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -511151008: {
                        v5 = hi.dmsl("dpby", dmts(int ), (int)281);
                        continue block40;
                    }
                    case 444550332: {
                        v5 = hi.dmsl("dpbz", dmts(int ), (int)282);
                        continue block40;
                    }
                    case 1228545173: {
                        break block40;
                    }
                }
                break;
            }
            if (!var1_1.method_7960()) {
                if (var3_5) return (boolean)hi.dmsl("dpbw", dmsv(int ), (int)823);
                v6 /* !! */  = hi.ib;
                block41: while (true) {
                    switch ((int)v6 /* !! */ ) {
                        case 1228545173: {
                            break block41;
                        }
                        case 2110264417: {
                            v6 /* !! */  = (long)(hi.dmsl("dpcb", dmts(int ), (int)284) - hi.dmsl("dpca", dmts(int ), (int)283));
                            continue block41;
                        }
                    }
                    break;
                }
                v7 = var1_1.method_7909();
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = hi.ib - hi.dmsl("dpcc", dmts(int ), (int)285)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == hi.dmsl("dpcd", dmsv(int ), (int)824)) {
                        if (v7 != class_1802.field_8288) {
                            break;
                        }
                        break block71;
                    }
                    v8 /* !! */  = (long)hi.dmsl("dpce", dmsv(int ), (int)825);
                }
                if (var3_5) return (boolean)hi.dmsl("dpbw", dmsv(int ), (int)823);
            }
            if (var3_5 || var3_5) return (boolean)hi.dmsl("dpbw", dmsv(int ), (int)823);
            return (boolean)hi.dmsl("dpcf", dmsv(int ), (int)826);
        }
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block43: while (true) {
            block72: {
                switch (cfr_temp_0 == -2147483648 ? var4_4 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var3_5 || var3_5) return (boolean)hi.dmsl("dpbw", dmsv(int ), (int)823);
                        if (var2_2) ** GOTO lbl90
                        if (var3_5) return (boolean)hi.dmsl("dpbw", dmsv(int ), (int)823);
                        while (true) {
                            if ((v9 /* !! */  = (cfr_temp_3 = hi.ib - hi.dmsl("dpcg", dmts(int ), (int)286)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v9 /* !! */  != hi.dmsl("dpch", dmsv(int ), (int)827)) ** GOTO lbl86
                            if (this.hasSpecialProperties(var1_1)) {
                                break;
                            }
                            ** GOTO lbl90
lbl86:
                            // 1 sources

                            v9 /* !! */  = (long)hi.dmsl("dpci", dmsv(int ), (int)828);
                        }
                        if (var3_5 || var3_5) return (boolean)hi.dmsl("dpbw", dmsv(int ), (int)823);
                        return (boolean)hi.dmsl("dpcj", dmsv(int ), (int)829);
lbl90:
                        // 2 sources

                        if (!var3_5 && !var3_5) return (boolean)hi.dmsl("dpck", dmsv(int ), (int)830);
                        return (boolean)hi.dmsl("dpbw", dmsv(int ), (int)823);
                    }
                    case 0: {
                        var4_4 /* !! */  = (int)hi.dmsl("dpcl", dmsv(int ), (int)831);
                        cfr_temp_0 = 3;
                        if (var5_3) {
                            throw null;
                        }
                        break block72;
                    }
                    case 9: {
                        var4_4 /* !! */  = (int)hi.dmsl("dpcu", dmsv(int ), (int)840);
                        cfr_temp_0 = 3;
                        if (var5_3) {
                            throw null;
                        }
                        break block72;
                    }
                    case 14: {
                        var4_4 /* !! */  = (int)hi.dmsl("dpcz", dmsv(int ), (int)845);
                        if (var5_3) {
                            throw null;
                        }
                    }
                    case 6: {
                        var4_4 /* !! */  = (int)hi.dmsl("dpcr", dmsv(int ), (int)837);
                        if (var5_3) {
                            throw null;
                        }
                    }
                    case 13: {
                        var4_4 /* !! */  = (int)hi.dmsl("dpcy", dmsv(int ), (int)844);
                        if (var5_3) {
                            throw null;
                        }
                    }
                    case 3: {
                        ** GOTO lbl149
                    }
                    case 15: {
                        ** GOTO lbl146
                    }
                    case 1: {
                        var4_4 /* !! */  = (int)hi.dmsl("dpcm", dmsv(int ), (int)832);
                        if (var5_3) {
                            throw null;
                        }
                    }
                    case 5: {
                        var4_4 /* !! */  = (int)hi.dmsl("dpcq", dmsv(int ), (int)836);
                        if (var5_3) {
                            throw null;
                        }
                    }
                    case 10: {
                        var4_4 /* !! */  = (int)hi.dmsl("dpcv", dmsv(int ), (int)841);
                        if (var5_3) {
                            throw null;
                        }
                    }
                    case 11: {
                        var4_4 /* !! */  = (int)hi.dmsl("dpcw", dmsv(int ), (int)842);
                        if (var5_3) {
                            throw null;
                        }
                    }
                    case 12: {
                        var4_4 /* !! */  = (int)hi.dmsl("dpcx", dmsv(int ), (int)843);
                        cfr_temp_0 = 1;
                        if (var5_3) {
                            throw null;
                        }
                        break block72;
                    }
                    case 2: {
                        var4_4 /* !! */  = (int)hi.dmsl("dpcn", dmsv(int ), (int)833);
                        if (!var5_3) ** break;
                        throw null;
lbl146:
                        // 2 sources

                        var4_4 /* !! */  = (int)hi.dmsl("dpda", dmsv(int ), (int)846);
                        if (var5_3) {
                            throw null;
                        }
lbl149:
                        // 3 sources

                        var4_4 /* !! */  = (int)hi.dmsl("dpco", dmsv(int ), (int)834);
                        if (var5_3) {
                            throw null;
                        }
                    }
                    case 7: {
                        var4_4 /* !! */  = (int)hi.dmsl("dpcs", dmsv(int ), (int)838);
                        if (var5_3) {
                            throw null;
                        }
                    }
                    case 4: {
                        var4_4 /* !! */  = (int)hi.dmsl("dpcp", dmsv(int ), (int)835);
                        if (var5_3) {
                            throw null;
                        }
                    }
                    case 8: 
                }
                ** GOTO lbl165
            }
            do {
                if (true) continue block43;
lbl165:
                // 2 sources

                var4_4 /* !! */  = (int)hi.dmsl("dpct", dmsv(int ), (int)839);
                cfr_temp_0 = 2;
            } while (!var5_3);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$2() {
        v0 /* !! */  = hi.ib;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - hi.dmsl("dsdz", dmts(int ), (int)806));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1543063337: {
                    v1 = hi.dmsl("dsea", dmts(int ), (int)807);
                    continue block16;
                }
                case -1046896356: {
                    v1 = hi.dmsl("dseb", dmts(int ), (int)808);
                    continue block16;
                }
                case 1228545173: {
                    break block16;
                }
                case 1887044780: {
                    v1 = hi.dmsl("dsec", dmts(int ), (int)809);
                    continue block16;
                }
            }
            break;
        }
        var3_1 = hi.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hi.ib - hi.dmsl("dsed", dmts(int ), (int)810)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == hi.dmsl("dsee", dmsv(int ), (int)1725)) break;
            v2 /* !! */  = (long)hi.dmsl("dsef", dmsv(int ), (int)1726);
        }
        var2_2 /* !! */  = hi.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = hi.ib - hi.dmsl("dseg", dmts(int ), (int)811)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == hi.dmsl("dseh", dmsv(int ), (int)1727)) break;
            v3 /* !! */  = (long)hi.dmsl("dsej", dmsv(int ), (int)1728);
        }
        var1_3 = hi.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = hi.ib - hi.dmsl("dsek", dmts(int ), (int)812)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == hi.dmsl("dsel", dmsv(int ), (int)1729)) break;
                    v4 /* !! */  = (long)hi.dmsl("dsem", dmsv(int ), (int)1730);
                }
                v5 = this.check("\u041a\u0440\u0438\u0441\u0442\u0430\u043b\u043b");
                v6 /* !! */  = hi.ib;
                if (true) ** GOTO lbl48
                block21: while (true) {
                    v6 /* !! */  = (long)(hi.dmsl("dseo", dmts(int ), (int)814) - hi.dmsl("dsen", dmts(int ), (int)813));
lbl48:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -698273015: {
                            continue block21;
                        }
                        case 1228545173: {
                            break block21;
                        }
                    }
                    break;
                }
                return v5;
            }
            case 0: {
                var2_2 /* !! */  = (int)hi.dmsl("dsep", dmsv(int ), (int)1731);
                if (var3_1) {
                    throw null;
                }
            }
lbl58:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)hi.dmsl("dser", dmsv(int ), (int)1732);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hi.dmsl("dses", dmsv(int ), (int)1733);
                    if (!var3_1) ** GOTO lbl58
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hi.dmsl("dset", dmsv(int ), (int)1734);
        ** while (!var3_1)
lbl70:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dtmv() {
        hi.dmtt[0] = 262333389991935915L;
        hi.dmtt[1] = 7224026871383562406L;
        hi.dmtt[2] = -7666396584167727105L;
        hi.dmtt[3] = 901452026869058734L;
        hi.dmtt[4] = 3395794979697176800L;
        hi.dmtt[5] = 5786350735479924502L;
        hi.dmtt[6] = -3299762794682007880L;
        hi.dmtt[7] = 7262080015131512240L;
        hi.dmtt[8] = 1737384653802371145L;
        hi.dmtt[9] = 7137907609945986141L;
        hi.dmtt[10] = 3937668966418137203L;
        hi.dmtt[11] = -6993833228926125559L;
        hi.dmtt[12] = -8191849387172491995L;
        hi.dmtt[13] = 1779190523161585209L;
        hi.dmtt[14] = 444506907748897368L;
        hi.dmtt[15] = 93602043185467372L;
        hi.dmtt[16] = -5606779601405466858L;
        hi.dmtt[17] = -4708511822985675664L;
        hi.dmtt[18] = 4940575678661167399L;
        hi.dmtt[19] = -8737865301316619430L;
        hi.dmtt[20] = 2564536076251469369L;
        hi.dmtt[21] = 5594627314230790194L;
        hi.dmtt[22] = -368527613570492652L;
        hi.dmtt[23] = 1715674571231192713L;
        hi.dmtt[24] = 8537583614963066690L;
        hi.dmtt[25] = 3357931917357375537L;
        hi.dmtt[26] = -4463188036006669481L;
        hi.dmtt[27] = 2036923982365358947L;
        hi.dmtt[28] = 5552006608524862730L;
        hi.dmtt[29] = -2683219509340734901L;
        hi.dmtt[30] = 6206003310058321267L;
        hi.dmtt[31] = -8199135559010850532L;
        hi.dmtt[32] = -942991111518900331L;
        hi.dmtt[33] = -2930255644496232162L;
        hi.dmtt[34] = 1026264515392515447L;
        hi.dmtt[35] = -6299293522425984236L;
        hi.dmtt[36] = 7331415059300597038L;
        hi.dmtt[37] = -914935996836702728L;
        hi.dmtt[38] = -2919074210827969096L;
        hi.dmtt[39] = -2775468186514041613L;
        hi.dmtt[40] = -6764237272146651039L;
        hi.dmtt[41] = -6327319337274440792L;
        hi.dmtt[42] = -9076776792120604649L;
        hi.dmtt[43] = -7471859547616410594L;
        hi.dmtt[44] = -3818975220446128957L;
        hi.dmtt[45] = -5455820732395838187L;
        hi.dmtt[46] = -2626519383953088754L;
        hi.dmtt[47] = 2367107491233078991L;
        hi.dmtt[48] = 1576600315251047257L;
        hi.dmtt[49] = -8689536123212006882L;
        hi.dmtt[50] = -30015386966124501L;
        hi.dmtt[51] = -2799326911538767801L;
        hi.dmtt[52] = 9013466824040433160L;
        hi.dmtt[53] = -2890501773545610349L;
        hi.dmtt[54] = -6797606623764347322L;
        hi.dmtt[55] = 7960886890491969315L;
        hi.dmtt[56] = -1295873250487351835L;
        hi.dmtt[57] = 3330870211721218171L;
        hi.dmtt[58] = -6265459771342407335L;
        hi.dmtt[59] = 2477753465296391478L;
        hi.dmtt[60] = -6781626011747111842L;
        hi.dmtt[61] = 6812816803814199996L;
        hi.dmtt[62] = 5023742575139179599L;
        hi.dmtt[63] = -2695027996500666323L;
        hi.dmtt[64] = 7025994469759208311L;
        hi.dmtt[65] = -1433151677630870354L;
        hi.dmtt[66] = 1080439901500358357L;
        hi.dmtt[67] = 652384765593914426L;
        hi.dmtt[68] = 4831896922364670866L;
        hi.dmtt[69] = -1348474872540127529L;
        hi.dmtt[70] = 1041603247258201843L;
        hi.dmtt[71] = 525243450902892636L;
        hi.dmtt[72] = 4059807382362876231L;
        hi.dmtt[73] = -6076309684523858399L;
        hi.dmtt[74] = -2795124974729811745L;
        hi.dmtt[75] = 2819582090147072529L;
        hi.dmtt[76] = 5616751513680045044L;
        hi.dmtt[77] = -7594203854196722362L;
        hi.dmtt[78] = -7086117980812579020L;
        hi.dmtt[79] = 6690494713668886182L;
        hi.dmtt[80] = 8601678903161221027L;
        hi.dmtt[81] = -3935102379561921610L;
        hi.dmtt[82] = -6386165042946452606L;
        hi.dmtt[83] = -8760301292166562207L;
        hi.dmtt[84] = -7622376166472842196L;
        hi.dmtt[85] = 7258978094733302574L;
        hi.dmtt[86] = 2711500708331151210L;
        hi.dmtt[87] = -7573228317285566465L;
        hi.dmtt[88] = 7742615277689884324L;
        hi.dmtt[89] = 319176169327479021L;
        hi.dmtt[90] = 6931801829612512125L;
        hi.dmtt[91] = -2016822067233022417L;
        hi.dmtt[92] = -3969414907691690149L;
        hi.dmtt[93] = 7800532957744919206L;
        hi.dmtt[94] = -3242919746527369034L;
        hi.dmtt[95] = -5510703423898126263L;
        hi.dmtt[96] = -976589195355350041L;
        hi.dmtt[97] = -7013962692138760756L;
        hi.dmtt[98] = -8338109996943287565L;
        hi.dmtt[99] = 2241627478639707233L;
    }

    private static /* synthetic */ void dtnt() {
        hi.dmtt[500] = -2654981755249538392L;
        hi.dmtt[501] = -9039626923149409409L;
        hi.dmtt[502] = 8599057628483854264L;
        hi.dmtt[503] = 4824280647190311635L;
        hi.dmtt[504] = -1954397943643499830L;
        hi.dmtt[505] = -1786578247599665123L;
        hi.dmtt[506] = -538270029282180380L;
        hi.dmtt[507] = -1564124438638101305L;
        hi.dmtt[508] = 8204073177280159557L;
        hi.dmtt[509] = 2229450117443729698L;
        hi.dmtt[510] = -5076212173306602192L;
        hi.dmtt[511] = 7159036183098878277L;
        hi.dmtt[512] = -3947342830906231666L;
        hi.dmtt[513] = -3098776356438133095L;
        hi.dmtt[514] = 7057567431093273334L;
        hi.dmtt[515] = 8937517188652119579L;
        hi.dmtt[516] = 8850834496968467339L;
        hi.dmtt[517] = -687534536713364313L;
        hi.dmtt[518] = 6768700043137349071L;
        hi.dmtt[519] = 4243044848359253572L;
        hi.dmtt[520] = -2387283613088292459L;
        hi.dmtt[521] = -4033487937502093483L;
        hi.dmtt[522] = 4966965359316792660L;
        hi.dmtt[523] = -6222405800275347270L;
        hi.dmtt[524] = 107600053955714353L;
        hi.dmtt[525] = 9180378994266929536L;
        hi.dmtt[526] = -7632516264556539132L;
        hi.dmtt[527] = -536527595744341770L;
        hi.dmtt[528] = 9201581267210263847L;
        hi.dmtt[529] = -5953332188749256120L;
        hi.dmtt[530] = 2822743063810495095L;
        hi.dmtt[531] = 2182639213297929976L;
        hi.dmtt[532] = 8676030907053820948L;
        hi.dmtt[533] = 4199781654827221065L;
        hi.dmtt[534] = 1238295985459884719L;
        hi.dmtt[535] = 6033580219259874239L;
        hi.dmtt[536] = 2909450633443628652L;
        hi.dmtt[537] = 4034466142585868174L;
        hi.dmtt[538] = -9177733093872524785L;
        hi.dmtt[539] = 8392362365937089850L;
        hi.dmtt[540] = -1811786283703430106L;
        hi.dmtt[541] = -6519507271908163053L;
        hi.dmtt[542] = 5699602207670091979L;
        hi.dmtt[543] = -3707968709471163862L;
        hi.dmtt[544] = -387637798248584637L;
        hi.dmtt[545] = 7977979065214826878L;
        hi.dmtt[546] = 41473980774072892L;
        hi.dmtt[547] = 4091327786540877716L;
        hi.dmtt[548] = 3876457671895949119L;
        hi.dmtt[549] = 7301951593747341007L;
        hi.dmtt[550] = 4446768520312600090L;
        hi.dmtt[551] = 7127874805887939223L;
        hi.dmtt[552] = 7815143425594339977L;
        hi.dmtt[553] = -7910629764589955318L;
        hi.dmtt[554] = -7737841680216570370L;
        hi.dmtt[555] = 3318109167255532911L;
        hi.dmtt[556] = -8153954920991820805L;
        hi.dmtt[557] = 3378850177232582593L;
        hi.dmtt[558] = 4353965375092789929L;
        hi.dmtt[559] = 8366015586953942280L;
        hi.dmtt[560] = -5626234958886924584L;
        hi.dmtt[561] = 1865308616736074635L;
        hi.dmtt[562] = 9047182739540701580L;
        hi.dmtt[563] = 284640539136224316L;
        hi.dmtt[564] = -137082340382897639L;
        hi.dmtt[565] = 929357832512796825L;
        hi.dmtt[566] = 6881025581009601038L;
        hi.dmtt[567] = -5118116781155320046L;
        hi.dmtt[568] = -1967297789896414189L;
        hi.dmtt[569] = 3805465103134618318L;
        hi.dmtt[570] = 6218592863276469770L;
        hi.dmtt[571] = 5023000364492110447L;
        hi.dmtt[572] = 190970663237836390L;
        hi.dmtt[573] = -7959215857695934913L;
        hi.dmtt[574] = 7221160378774834114L;
        hi.dmtt[575] = 362850467262849822L;
        hi.dmtt[576] = -7104410475058997523L;
        hi.dmtt[577] = -2710196587770312689L;
        hi.dmtt[578] = 7103254189662393243L;
        hi.dmtt[579] = -3161044393153750942L;
        hi.dmtt[580] = -4525169989135340163L;
        hi.dmtt[581] = -1996134090122727549L;
        hi.dmtt[582] = -7468316509653265144L;
        hi.dmtt[583] = 5484600287964161638L;
        hi.dmtt[584] = 4461710076025040868L;
        hi.dmtt[585] = -6762777820210690774L;
        hi.dmtt[586] = 3905286348179251602L;
        hi.dmtt[587] = 3645569724294268103L;
        hi.dmtt[588] = 5441651159866067525L;
        hi.dmtt[589] = 2327697966511463544L;
        hi.dmtt[590] = 2338052334944833216L;
        hi.dmtt[591] = 1583624684264750630L;
        hi.dmtt[592] = 530371918572856627L;
        hi.dmtt[593] = 9054257125207345889L;
        hi.dmtt[594] = -8758921649949194778L;
        hi.dmtt[595] = -3510804987043745654L;
        hi.dmtt[596] = 5399712862653236319L;
        hi.dmtt[597] = -7050467981701611363L;
        hi.dmtt[598] = 8533263164691878848L;
        hi.dmtt[599] = 7991976222682239757L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean hasSpecialProperties(class_1799 var1_1) {
        block83: {
            v0 /* !! */  = hi.ib;
            if (true) ** GOTO lbl5
            block48: while (true) {
                v0 /* !! */  = (long)(hi.dmsl("dowb", dmts(int ), (int)255) - hi.dmsl("dowa", dmts(int ), (int)254));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case 1081422903: {
                        continue block48;
                    }
                    case 1228545173: {
                        break block48;
                    }
                }
                break;
            }
            var4_2 = hi.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_0 = hi.ib - hi.dmsl("dowc", dmts(int ), (int)256)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v1 /* !! */  == hi.dmsl("dowd", dmsv(int ), (int)697)) break;
                v1 /* !! */  = (long)hi.dmsl("dowe", dmsv(int ), (int)698);
            }
            var3_3 /* !! */  = hi.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_1 = hi.ib - hi.dmsl("dowf", dmts(int ), (int)257)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  == hi.dmsl("dowg", dmsv(int ), (int)699)) break;
                v2 /* !! */  = (long)hi.dmsl("dowh", dmsv(int ), (int)700);
            }
            var2_4 = hi.a;
            if (var4_2) {
                throw null;
lbl27:
                // 10 sources

                return (boolean)hi.dmsl("dowi", dmsv(int ), (int)701);
            }
            if (var2_4 || var2_4) ** GOTO lbl27
            v3 /* !! */  = hi.ib;
            if (true) ** GOTO lbl34
            block52: while (true) {
                v3 /* !! */  = (long)(v4 - hi.dmsl("dowj", dmts(int ), (int)258));
lbl34:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1833609030: {
                        v4 = hi.dmsl("dowk", dmts(int ), (int)259);
                        continue block52;
                    }
                    case 38179750: {
                        v4 = hi.dmsl("dowl", dmts(int ), (int)260);
                        continue block52;
                    }
                    case 1228545173: {
                        break block52;
                    }
                }
                break;
            }
            if (!var1_1.method_7942()) break block83;
            if (var2_4 || var2_4) ** GOTO lbl27
            return (boolean)hi.dmsl("dowm", dmsv(int ), (int)702);
        }
        if (var2_4 || var2_4) ** GOTO lbl27
        v5 /* !! */  = hi.ib;
        if (true) ** GOTO lbl52
        block53: while (true) {
            v5 /* !! */  = (long)(v6 - hi.dmsl("down", dmts(int ), (int)261));
lbl52:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -2063564000: {
                    v6 = hi.dmsl("dowo", dmts(int ), (int)262);
                    continue block53;
                }
                case -506650337: {
                    v6 = hi.dmsl("dowp", dmts(int ), (int)263);
                    continue block53;
                }
                case 1228545173: {
                    break block53;
                }
            }
            break;
        }
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = hi.ib - hi.dmsl("dowq", dmts(int ), (int)264)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v7 /* !! */  == hi.dmsl("dowr", dmsv(int ), (int)703)) break;
            v7 /* !! */  = (long)hi.dmsl("dows", dmsv(int ), (int)704);
        }
        if (!var1_1.method_57826(class_9334.field_49631)) ** GOTO lbl74
        if (var2_4) ** GOTO lbl27
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl27
                return (boolean)hi.dmsl("dowt", dmsv(int ), (int)705);
            }
lbl74:
            // 1 sources

            if (var2_4 || var2_4) ** GOTO lbl27
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_3 = hi.ib - hi.dmsl("dowu", dmts(int ), (int)265)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v8 /* !! */  == hi.dmsl("dowv", dmsv(int ), (int)706)) break;
                v8 /* !! */  = (long)hi.dmsl("doww", dmsv(int ), (int)707);
            }
            v9 /* !! */  = hi.ib;
            if (true) ** GOTO lbl85
            block56: while (true) {
                v9 /* !! */  = (long)(hi.dmsl("dowy", dmts(int ), (int)267) - hi.dmsl("dowx", dmts(int ), (int)266));
lbl85:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -1779472772: {
                        continue block56;
                    }
                    case 1228545173: {
                        break block56;
                    }
                }
                break;
            }
            if (!var1_1.method_57826(class_9334.field_49632)) ** GOTO lbl93
            if (var2_4 || var2_4) ** GOTO lbl27
            return (boolean)hi.dmsl("dowz", dmsv(int ), (int)708);
lbl93:
            // 1 sources

            if (var2_4 || var2_4) ** GOTO lbl27
            v10 /* !! */  = hi.ib;
            if (true) ** GOTO lbl98
            block57: while (true) {
                v10 /* !! */  = (long)(v11 - hi.dmsl("doxa", dmts(int ), (int)268));
lbl98:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -763161404: {
                        v11 = hi.dmsl("doxb", dmts(int ), (int)269);
                        continue block57;
                    }
                    case 590471788: {
                        v11 = hi.dmsl("doxc", dmts(int ), (int)270);
                        continue block57;
                    }
                    case 940790719: {
                        v11 = hi.dmsl("doxd", dmts(int ), (int)271);
                        continue block57;
                    }
                    case 1228545173: {
                        break block57;
                    }
                }
                break;
            }
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_4 = hi.ib - hi.dmsl("doxe", dmts(int ), (int)272)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v12 /* !! */  == hi.dmsl("doxf", dmsv(int ), (int)709)) break;
                v12 /* !! */  = (long)hi.dmsl("doxg", dmsv(int ), (int)710);
            }
            if (!var1_1.method_57826(class_9334.field_49636)) ** GOTO lbl119
            if (var2_4 || var2_4) ** GOTO lbl27
            return (boolean)hi.dmsl("doxh", dmsv(int ), (int)711);
lbl119:
            // 1 sources

            if (!var2_4 && !var2_4) ** break;
            ** continue;
            return (boolean)hi.dmsl("doxi", dmsv(int ), (int)712);
lbl122:
            // 3 sources

            case 0: {
                var3_3 /* !! */  = (int)hi.dmsl("doxj", dmsv(int ), (int)713);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl127:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)hi.dmsl("doxk", dmsv(int ), (int)714);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl173
            }
            case 2: {
                var3_3 /* !! */  = (int)hi.dmsl("doxl", dmsv(int ), (int)715);
                if (!var4_2) ** GOTO lbl127
                throw null;
            }
lbl136:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)hi.dmsl("doxm", dmsv(int ), (int)716);
                if (var4_2) {
                    throw null;
                }
            }
lbl140:
            // 5 sources

            case 4: {
                var3_3 /* !! */  = (int)hi.dmsl("doxn", dmsv(int ), (int)717);
                if (!var4_2) ** GOTO lbl136
                throw null;
            }
            case 5: {
                var3_3 /* !! */  = (int)hi.dmsl("doxo", dmsv(int ), (int)718);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl177
            }
lbl149:
            // 3 sources

            case 6: {
                var3_3 /* !! */  = (int)hi.dmsl("doxp", dmsv(int ), (int)719);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl159
            }
            case 7: {
                var3_3 /* !! */  = (int)hi.dmsl("doxq", dmsv(int ), (int)720);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl169
            }
lbl159:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)hi.dmsl("doxr", dmsv(int ), (int)721);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl210
            }
            case 9: {
                var3_3 /* !! */  = (int)hi.dmsl("doxs", dmsv(int ), (int)722);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl210
            }
lbl169:
            // 2 sources

            case 10: {
                var3_3 /* !! */  = (int)hi.dmsl("doxt", dmsv(int ), (int)723);
                if (!var4_2) break;
                throw null;
            }
lbl173:
            // 3 sources

            case 11: {
                var3_3 /* !! */  = (int)hi.dmsl("doxu", dmsv(int ), (int)724);
                if (!var4_2) ** GOTO lbl122
                throw null;
            }
lbl177:
            // 3 sources

            case 12: {
                var3_3 /* !! */  = (int)hi.dmsl("doxv", dmsv(int ), (int)725);
                if (!var4_2) ** GOTO lbl173
                throw null;
            }
            case 13: {
                var3_3 /* !! */  = (int)hi.dmsl("doxw", dmsv(int ), (int)726);
                if (!var4_2) ** GOTO lbl122
                throw null;
            }
lbl185:
            // 2 sources

            case 14: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hi.dmsl("doxx", dmsv(int ), (int)727);
                    if (!var4_2) ** GOTO lbl177
                    throw null;
                }
            }
lbl190:
            // 2 sources

            case 15: {
                var3_3 /* !! */  = (int)hi.dmsl("doxy", dmsv(int ), (int)728);
                if (!var4_2) ** GOTO lbl149
                throw null;
            }
            case 16: {
                var3_3 /* !! */  = (int)hi.dmsl("doxz", dmsv(int ), (int)729);
                if (!var4_2) ** GOTO lbl185
                throw null;
            }
            case 17: {
                var3_3 /* !! */  = (int)hi.dmsl("doya", dmsv(int ), (int)730);
                if (!var4_2) ** GOTO lbl190
                throw null;
            }
            case 18: {
                var3_3 /* !! */  = (int)hi.dmsl("doyb", dmsv(int ), (int)731);
                if (!var4_2) break;
                throw null;
            }
            case 19: {
                var3_3 /* !! */  = (int)hi.dmsl("doyc", dmsv(int ), (int)732);
                if (!var4_2) ** GOTO lbl140
                throw null;
            }
lbl210:
            // 3 sources

            case 20: {
                var3_3 /* !! */  = (int)hi.dmsl("doyd", dmsv(int ), (int)733);
                if (!var4_2) ** GOTO lbl140
                throw null;
            }
            case 21: 
        }
        var3_3 /* !! */  = (int)hi.dmsl("doye", dmsv(int ), (int)734);
        ** while (!var4_2)
lbl217:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dtmq() {
        hi.dmsk[1300] = 1665560612;
        hi.dmsk[1301] = -1780414370;
        hi.dmsk[1302] = 1108789750;
        hi.dmsk[1303] = -583153853;
        hi.dmsk[1304] = 950104757;
        hi.dmsk[1305] = 1122706215;
        hi.dmsk[1306] = 831445608;
        hi.dmsk[1307] = 1302726477;
        hi.dmsk[1308] = 337163836;
        hi.dmsk[1309] = -487440872;
        hi.dmsk[1310] = -1249444356;
        hi.dmsk[1311] = 1186191066;
        hi.dmsk[1312] = 1989591669;
        hi.dmsk[1313] = 1939868020;
        hi.dmsk[1314] = 245613077;
        hi.dmsk[1315] = -1613056761;
        hi.dmsk[1316] = 1719722887;
        hi.dmsk[1317] = -1982968769;
        hi.dmsk[1318] = 1701341734;
        hi.dmsk[1319] = 1044351693;
        hi.dmsk[1320] = 1659819200;
        hi.dmsk[1321] = -652017003;
        hi.dmsk[1322] = -875942709;
        hi.dmsk[1323] = 79433546;
        hi.dmsk[1324] = -57873645;
        hi.dmsk[1325] = 1348829707;
        hi.dmsk[1326] = -38933890;
        hi.dmsk[1327] = 823636183;
        hi.dmsk[1328] = -1595204143;
        hi.dmsk[1329] = -2019519667;
        hi.dmsk[1330] = -70126124;
        hi.dmsk[1331] = -1650201743;
        hi.dmsk[1332] = -1980282330;
        hi.dmsk[1333] = -496586583;
        hi.dmsk[1334] = -1565473466;
        hi.dmsk[1335] = -426866070;
        hi.dmsk[1336] = 852009184;
        hi.dmsk[1337] = -393384337;
        hi.dmsk[1338] = -1053999822;
        hi.dmsk[1339] = 1331664832;
        hi.dmsk[1340] = -575722556;
        hi.dmsk[1341] = -398657514;
        hi.dmsk[1342] = -461342831;
        hi.dmsk[1343] = -816751560;
        hi.dmsk[1344] = 1630061754;
        hi.dmsk[1345] = 1323732880;
        hi.dmsk[1346] = 1293695522;
        hi.dmsk[1347] = 2141848720;
        hi.dmsk[1348] = -14453164;
        hi.dmsk[1349] = -1931985966;
        hi.dmsk[1350] = -1240640466;
        hi.dmsk[1351] = 1608235752;
        hi.dmsk[1352] = 138424643;
        hi.dmsk[1353] = 806363157;
        hi.dmsk[1354] = 277587601;
        hi.dmsk[1355] = 777431178;
        hi.dmsk[1356] = -1858056594;
        hi.dmsk[1357] = 2071562413;
        hi.dmsk[1358] = 932531008;
        hi.dmsk[1359] = -272302964;
        hi.dmsk[1360] = 1663712115;
        hi.dmsk[1361] = 0x8A0A0A8;
        hi.dmsk[1362] = 435820604;
        hi.dmsk[1363] = -909466587;
        hi.dmsk[1364] = -376831048;
        hi.dmsk[1365] = -1419306789;
        hi.dmsk[1366] = -756280529;
        hi.dmsk[1367] = -204634285;
        hi.dmsk[1368] = -623766404;
        hi.dmsk[1369] = -1473230923;
        hi.dmsk[1370] = -1375723158;
        hi.dmsk[1371] = 905359570;
        hi.dmsk[1372] = 213781887;
        hi.dmsk[1373] = 1927078290;
        hi.dmsk[1374] = 739157825;
        hi.dmsk[1375] = 794555822;
        hi.dmsk[1376] = -342709397;
        hi.dmsk[1377] = -1586596202;
        hi.dmsk[1378] = -1124849056;
        hi.dmsk[1379] = 1312883619;
        hi.dmsk[1380] = 717769004;
        hi.dmsk[1381] = 125023796;
        hi.dmsk[1382] = -823032044;
        hi.dmsk[1383] = -1130775943;
        hi.dmsk[1384] = -1902169991;
        hi.dmsk[1385] = 1341516601;
        hi.dmsk[1386] = -1098634811;
        hi.dmsk[1387] = -1156688204;
        hi.dmsk[1388] = -309404460;
        hi.dmsk[1389] = -1165741606;
        hi.dmsk[1390] = 1734301111;
        hi.dmsk[1391] = -127006842;
        hi.dmsk[1392] = 422518859;
        hi.dmsk[1393] = -659683188;
        hi.dmsk[1394] = -1829839785;
        hi.dmsk[1395] = -1001127572;
        hi.dmsk[1396] = 1625685473;
        hi.dmsk[1397] = 1278567868;
        hi.dmsk[1398] = -1767748052;
        hi.dmsk[1399] = -2145866920;
    }

    private static /* synthetic */ void dsgh() {
        hi.dmsj[400] = 868993865;
        hi.dmsj[401] = 1625490683;
        hi.dmsj[402] = -340160401;
        hi.dmsj[403] = -734912464;
        hi.dmsj[404] = 1966507682;
        hi.dmsj[405] = 725290340;
        hi.dmsj[406] = -1925468552;
        hi.dmsj[407] = -843681293;
        hi.dmsj[408] = -1331409484;
        hi.dmsj[409] = -646015512;
        hi.dmsj[410] = 1102072454;
        hi.dmsj[411] = -1147331201;
        hi.dmsj[412] = -1129733721;
        hi.dmsj[413] = 478655528;
        hi.dmsj[414] = 1749986374;
        hi.dmsj[415] = -2079019412;
        hi.dmsj[416] = 546763616;
        hi.dmsj[417] = -1640727309;
        hi.dmsj[418] = 2002072775;
        hi.dmsj[419] = 1117729812;
        hi.dmsj[420] = 1560857803;
        hi.dmsj[421] = -1606910008;
        hi.dmsj[422] = -229718898;
        hi.dmsj[423] = -1907161843;
        hi.dmsj[424] = 1371674531;
        hi.dmsj[425] = 870173370;
        hi.dmsj[426] = -522702033;
        hi.dmsj[427] = -1918730975;
        hi.dmsj[428] = -1326578736;
        hi.dmsj[429] = 2078189202;
        hi.dmsj[430] = -383187597;
        hi.dmsj[431] = 1570310702;
        hi.dmsj[432] = 364597966;
        hi.dmsj[433] = -1235187965;
        hi.dmsj[434] = -2144289256;
        hi.dmsj[435] = -1836247330;
        hi.dmsj[436] = 454756451;
        hi.dmsj[437] = -1062479604;
        hi.dmsj[438] = -1572047986;
        hi.dmsj[439] = 1076604444;
        hi.dmsj[440] = 1133038914;
        hi.dmsj[441] = -1748783964;
        hi.dmsj[442] = 1101957824;
        hi.dmsj[443] = 800843049;
        hi.dmsj[444] = -1268548534;
        hi.dmsj[445] = 1941661098;
        hi.dmsj[446] = 885832617;
        hi.dmsj[447] = 851796969;
        hi.dmsj[448] = -1967085841;
        hi.dmsj[449] = 1591210269;
        hi.dmsj[450] = 2110178481;
        hi.dmsj[451] = -416899269;
        hi.dmsj[452] = -1123151673;
        hi.dmsj[453] = 678242669;
        hi.dmsj[454] = 1979347185;
        hi.dmsj[455] = -1386441025;
        hi.dmsj[456] = 813721845;
        hi.dmsj[457] = -717266293;
        hi.dmsj[458] = -719334407;
        hi.dmsj[459] = -75026861;
        hi.dmsj[460] = -2088845093;
        hi.dmsj[461] = -281258912;
        hi.dmsj[462] = -342696192;
        hi.dmsj[463] = -321752611;
        hi.dmsj[464] = 1932430119;
        hi.dmsj[465] = -2082615317;
        hi.dmsj[466] = 1511896977;
        hi.dmsj[467] = -828482352;
        hi.dmsj[468] = 440147517;
        hi.dmsj[469] = 515636008;
        hi.dmsj[470] = 1491692297;
        hi.dmsj[471] = 809760258;
        hi.dmsj[472] = 1043859601;
        hi.dmsj[473] = 76507702;
        hi.dmsj[474] = 453517098;
        hi.dmsj[475] = 991618094;
        hi.dmsj[476] = -910827908;
        hi.dmsj[477] = -1033535974;
        hi.dmsj[478] = 1870862585;
        hi.dmsj[479] = 260242336;
        hi.dmsj[480] = -564941219;
        hi.dmsj[481] = 1013879213;
        hi.dmsj[482] = 927443727;
        hi.dmsj[483] = 1891553154;
        hi.dmsj[484] = -273409778;
        hi.dmsj[485] = 221646789;
        hi.dmsj[486] = 516524532;
        hi.dmsj[487] = -370914028;
        hi.dmsj[488] = -2113458437;
        hi.dmsj[489] = 273165243;
        hi.dmsj[490] = -1681697434;
        hi.dmsj[491] = -490142088;
        hi.dmsj[492] = -990337669;
        hi.dmsj[493] = -742608658;
        hi.dmsj[494] = 1518572440;
        hi.dmsj[495] = 1654493846;
        hi.dmsj[496] = 688364156;
        hi.dmsj[497] = 391310968;
        hi.dmsj[498] = 373706265;
        hi.dmsj[499] = 1874376014;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private nu findPreviousItem() {
        block98: {
            block97: {
                block96: {
                    var7_1 = hi.c;
                    var6_2 /* !! */  = hi.b;
                    var5_3 = hi.a;
                    if (var7_1) {
                        throw null;
lbl6:
                        // 25 sources

                        return null;
                    }
                    if (var5_3 || var5_3) ** GOTO lbl6
                    if (hi.mc.field_1724 == null) break block96;
                    if (var5_3) ** GOTO lbl6
                    if (!this.itemHistory.isEmpty()) break block97;
                    if (var5_3) ** GOTO lbl6
                }
                if (var5_3 || var5_3) ** GOTO lbl6
                return nu.notFound();
            }
            if (var5_3 || var5_3) ** GOTO lbl6
            var1_4 = this.itemHistory.peek();
            if (var5_3 || var5_3) ** GOTO lbl6
            var2_5 = this.getStackAtScreenSlot(this.rememberedItemSlot);
            if (var5_3 || var5_3) ** GOTO lbl6
            if (!this.isRememberedSlotItem(var2_5, var1_4)) break block98;
            if (var5_3 || var5_3) ** GOTO lbl6
            return nu.of(this.rememberedItemSlot, var2_5);
        }
        if (var5_3 || var5_3) ** GOTO lbl6
        var3_6 = hi.dmsl("dqfp", dmsv(int ), (int)1153);
        if (var5_3) ** GOTO lbl6
        block52: while (true) {
            block99: {
                if (var5_3 || var5_3) ** GOTO lbl6
                if (var3_6 >= hi.dmsl("dqfq", dmsv(int ), (int)1154)) ** GOTO lbl47
                if (var5_3 || var5_3) ** GOTO lbl6
                var4_7 = hi.mc.field_1724.method_31548().method_5438((int)var3_6);
                if (var5_3 || var5_3) ** GOTO lbl6
                if (!this.isExactRememberedItem(var4_7, var1_4)) break block99;
                if (var5_3 || var5_3) ** GOTO lbl6
                return nu.of((int)var3_6, var4_7);
            }
            if (var6_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var6_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var5_3 || var5_3) ** GOTO lbl6
                    ++var3_6;
                    if (var5_3) ** GOTO lbl6
                    if (!var7_1) continue block52;
                    throw null;
                }
lbl47:
                // 1 sources

                if (var5_3 || var5_3) ** GOTO lbl6
                var3_6 = hi.dmsl("dqfr", dmsv(int ), (int)1155);
                if (var5_3) ** GOTO lbl6
                do {
                    if (var5_3 || var5_3) ** GOTO lbl6
                    if (var3_6 >= hi.dmsl("dqfs", dmsv(int ), (int)1156)) ** GOTO lbl64
                    if (var5_3 || var5_3) ** GOTO lbl6
                    var4_7 = hi.mc.field_1724.method_31548().method_5438((int)var3_6);
                    if (var5_3 || var5_3) ** GOTO lbl6
                    if (!this.isExactRememberedItem(var4_7, var1_4)) ** GOTO lbl59
                    if (var5_3 || var5_3) ** GOTO lbl6
                    return nu.of((int)(var3_6 + hi.dmsl("dqft", dmsv(int ), (int)1157)), var4_7);
lbl59:
                    // 1 sources

                    if (var5_3 || var5_3) ** GOTO lbl6
                    ++var3_6;
                    if (var5_3) ** GOTO lbl6
                } while (!var7_1);
                throw null;
lbl64:
                // 1 sources

                if (!var5_3 && !var5_3) ** break;
                ** continue;
                return nu.notFound();
                case 0: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqfu", dmsv(int ), (int)1158);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl107
                }
lbl72:
                // 3 sources

                case 1: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqfv", dmsv(int ), (int)1159);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl112
                }
lbl77:
                // 2 sources

                case 2: {
                    do {
                        var6_2 /* !! */  = (int)hi.dmsl("dqfw", dmsv(int ), (int)1160);
                    } while (!var7_1);
                    throw null;
                }
lbl82:
                // 2 sources

                case 3: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqfx", dmsv(int ), (int)1161);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl274
                }
lbl87:
                // 2 sources

                case 4: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqfy", dmsv(int ), (int)1162);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl220
                }
                case 5: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqfz", dmsv(int ), (int)1163);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl136
                }
lbl97:
                // 4 sources

                case 6: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqga", dmsv(int ), (int)1164);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl278
                }
lbl102:
                // 2 sources

                case 7: {
                    do {
                        var6_2 /* !! */  = (int)hi.dmsl("dqgb", dmsv(int ), (int)1165);
                    } while (!var7_1);
                    throw null;
                }
lbl107:
                // 2 sources

                case 8: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqgc", dmsv(int ), (int)1166);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl136
                }
lbl112:
                // 2 sources

                case 9: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqgd", dmsv(int ), (int)1167);
                    if (!var7_1) ** GOTO lbl97
                    throw null;
                }
lbl116:
                // 3 sources

                case 10: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqge", dmsv(int ), (int)1168);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl274
                }
lbl121:
                // 2 sources

                case 11: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqgf", dmsv(int ), (int)1169);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl195
                }
                case 12: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqgg", dmsv(int ), (int)1170);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl181
                }
                case 13: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqgh", dmsv(int ), (int)1171);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl241
                }
lbl136:
                // 3 sources

                case 14: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqgi", dmsv(int ), (int)1172);
                    if (!var7_1) ** GOTO lbl102
                    throw null;
                }
lbl140:
                // 2 sources

                case 15: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqgj", dmsv(int ), (int)1173);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl181
                }
                case 16: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqgk", dmsv(int ), (int)1174);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl195
                }
lbl150:
                // 2 sources

                case 17: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqgl", dmsv(int ), (int)1175);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl168
                }
lbl155:
                // 3 sources

                case 18: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqgm", dmsv(int ), (int)1176);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl250
                }
lbl160:
                // 2 sources

                case 19: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqgn", dmsv(int ), (int)1177);
                    if (!var7_1) ** GOTO lbl87
                    throw null;
                }
lbl164:
                // 2 sources

                case 20: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqgo", dmsv(int ), (int)1178);
                    if (!var7_1) ** GOTO lbl155
                    throw null;
                }
lbl168:
                // 2 sources

                case 21: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqgp", dmsv(int ), (int)1179);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl207
                }
lbl173:
                // 2 sources

                case 22: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqgq", dmsv(int ), (int)1180);
                    if (!var7_1) ** GOTO lbl97
                    throw null;
                }
                case 23: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqgr", dmsv(int ), (int)1181);
                    if (!var7_1) ** GOTO lbl173
                    throw null;
                }
lbl181:
                // 3 sources

                case 24: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqgs", dmsv(int ), (int)1182);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl233
                }
lbl186:
                // 3 sources

                case 25: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqgt", dmsv(int ), (int)1183);
                    if (!var7_1) ** GOTO lbl77
                    throw null;
                }
                case 26: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqgu", dmsv(int ), (int)1184);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl250
                }
lbl195:
                // 5 sources

                case 27: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqgv", dmsv(int ), (int)1185);
                    if (!var7_1) ** GOTO lbl155
                    throw null;
                }
                case 28: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqgw", dmsv(int ), (int)1186);
                    if (!var7_1) ** GOTO lbl82
                    throw null;
                }
                case 29: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqgx", dmsv(int ), (int)1187);
                    if (!var7_1) ** GOTO lbl121
                    throw null;
                }
lbl207:
                // 2 sources

                case 30: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqgy", dmsv(int ), (int)1188);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl258
                }
                case 31: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqgz", dmsv(int ), (int)1189);
                    if (!var7_1) ** GOTO lbl116
                    throw null;
                }
                case 32: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqha", dmsv(int ), (int)1190);
                    if (!var7_1) ** GOTO lbl97
                    throw null;
                }
lbl220:
                // 2 sources

                case 33: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqhb", dmsv(int ), (int)1191);
                    if (!var7_1) ** GOTO lbl186
                    throw null;
                }
lbl224:
                // 3 sources

                case 34: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqhc", dmsv(int ), (int)1192);
                    if (!var7_1) ** GOTO lbl140
                    throw null;
                }
                case 35: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqhd", dmsv(int ), (int)1193);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl274
                }
lbl233:
                // 2 sources

                case 36: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqhe", dmsv(int ), (int)1194);
                    if (!var7_1) ** GOTO lbl150
                    throw null;
                }
                case 37: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqhf", dmsv(int ), (int)1195);
                    if (!var7_1) ** GOTO lbl195
                    throw null;
                }
lbl241:
                // 2 sources

                case 38: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqhg", dmsv(int ), (int)1196);
                    if (!var7_1) ** GOTO lbl72
                    throw null;
                }
                case 39: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var6_2 /* !! */  = (int)hi.dmsl("dqhh", dmsv(int ), (int)1197);
                        if (!var7_1) ** GOTO lbl116
                        throw null;
                    }
                }
lbl250:
                // 4 sources

                case 40: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqhi", dmsv(int ), (int)1198);
                    if (!var7_1) ** GOTO lbl195
                    throw null;
                }
                case 41: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqhj", dmsv(int ), (int)1199);
                    if (!var7_1) ** GOTO lbl250
                    throw null;
                }
lbl258:
                // 2 sources

                case 42: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqhk", dmsv(int ), (int)1200);
                    if (!var7_1) ** GOTO lbl224
                    throw null;
                }
                case 43: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqhl", dmsv(int ), (int)1201);
                    if (!var7_1) ** GOTO lbl164
                    throw null;
                }
                case 44: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqhm", dmsv(int ), (int)1202);
                    if (!var7_1) ** GOTO lbl72
                    throw null;
                }
                case 45: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqhn", dmsv(int ), (int)1203);
                    if (!var7_1) ** GOTO lbl186
                    throw null;
                }
lbl274:
                // 4 sources

                case 46: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqho", dmsv(int ), (int)1204);
                    if (!var7_1) ** GOTO lbl224
                    throw null;
                }
lbl278:
                // 2 sources

                case 47: {
                    var6_2 /* !! */  = (int)hi.dmsl("dqhp", dmsv(int ), (int)1205);
                    if (!var7_1) ** GOTO lbl160
                    throw null;
                }
                case 48: 
            }
            break;
        }
        var6_2 /* !! */  = (int)hi.dmsl("dqhq", dmsv(int ), (int)1206);
        ** while (!var7_1)
lbl285:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dtmg() {
        hi.dmsk[300] = 741714770;
        hi.dmsk[301] = 2083654878;
        hi.dmsk[302] = -1755876645;
        hi.dmsk[303] = -1823022711;
        hi.dmsk[304] = 2049662694;
        hi.dmsk[305] = 54717152;
        hi.dmsk[306] = 1310420861;
        hi.dmsk[307] = -2130286547;
        hi.dmsk[308] = 1894518463;
        hi.dmsk[309] = 1800758801;
        hi.dmsk[310] = 791008536;
        hi.dmsk[311] = -188311626;
        hi.dmsk[312] = -846145004;
        hi.dmsk[313] = -391881328;
        hi.dmsk[314] = 768189773;
        hi.dmsk[315] = -1935114767;
        hi.dmsk[316] = -1051121063;
        hi.dmsk[317] = 2052117144;
        hi.dmsk[318] = -340452187;
        hi.dmsk[319] = -2016675655;
        hi.dmsk[320] = 305900378;
        hi.dmsk[321] = -2022140669;
        hi.dmsk[322] = -1333383311;
        hi.dmsk[323] = -1727611565;
        hi.dmsk[324] = -1851666722;
        hi.dmsk[325] = -348570215;
        hi.dmsk[326] = -1490676917;
        hi.dmsk[327] = 1705498496;
        hi.dmsk[328] = 1637452610;
        hi.dmsk[329] = 1867828188;
        hi.dmsk[330] = 1838200718;
        hi.dmsk[331] = -1046352526;
        hi.dmsk[332] = 552653038;
        hi.dmsk[333] = 931345924;
        hi.dmsk[334] = 2099701251;
        hi.dmsk[335] = -219563379;
        hi.dmsk[336] = 113893419;
        hi.dmsk[337] = 71574678;
        hi.dmsk[338] = 214623795;
        hi.dmsk[339] = -967157288;
        hi.dmsk[340] = -98424981;
        hi.dmsk[341] = -475004272;
        hi.dmsk[342] = 302656940;
        hi.dmsk[343] = -2061392925;
        hi.dmsk[344] = 1778849541;
        hi.dmsk[345] = 904807627;
        hi.dmsk[346] = -2018799834;
        hi.dmsk[347] = -618888261;
        hi.dmsk[348] = -285603171;
        hi.dmsk[349] = -397646050;
        hi.dmsk[350] = 807232961;
        hi.dmsk[351] = 370478382;
        hi.dmsk[352] = 2008073815;
        hi.dmsk[353] = 1233872536;
        hi.dmsk[354] = -2079595050;
        hi.dmsk[355] = -2051690860;
        hi.dmsk[356] = -269992797;
        hi.dmsk[357] = -1734610067;
        hi.dmsk[358] = 990542606;
        hi.dmsk[359] = -587095715;
        hi.dmsk[360] = 2037531589;
        hi.dmsk[361] = -1445582273;
        hi.dmsk[362] = -1360180358;
        hi.dmsk[363] = -392949858;
        hi.dmsk[364] = 1595633986;
        hi.dmsk[365] = 106612087;
        hi.dmsk[366] = 455803456;
        hi.dmsk[367] = 875904657;
        hi.dmsk[368] = -1172302599;
        hi.dmsk[369] = -1152247157;
        hi.dmsk[370] = 2109890818;
        hi.dmsk[371] = 618448412;
        hi.dmsk[372] = 683015349;
        hi.dmsk[373] = -638376395;
        hi.dmsk[374] = 1220476202;
        hi.dmsk[375] = 1424246761;
        hi.dmsk[376] = 999942316;
        hi.dmsk[377] = 1852924879;
        hi.dmsk[378] = -1938344240;
        hi.dmsk[379] = 354833660;
        hi.dmsk[380] = 1530900883;
        hi.dmsk[381] = -340527412;
        hi.dmsk[382] = 1466400039;
        hi.dmsk[383] = 234258951;
        hi.dmsk[384] = -920229791;
        hi.dmsk[385] = -1855895249;
        hi.dmsk[386] = 1148255710;
        hi.dmsk[387] = -1986663173;
        hi.dmsk[388] = 2145922648;
        hi.dmsk[389] = -1436443327;
        hi.dmsk[390] = -783718712;
        hi.dmsk[391] = 1693583330;
        hi.dmsk[392] = -232715963;
        hi.dmsk[393] = -561215875;
        hi.dmsk[394] = 418553278;
        hi.dmsk[395] = 1107606763;
        hi.dmsk[396] = 2016950277;
        hi.dmsk[397] = 889224655;
        hi.dmsk[398] = 974885572;
        hi.dmsk[399] = 218775494;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ void lambda$onPacket$8(Pair var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hi.ib - hi.dmsl("drut", dmts(int ), (int)725)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == hi.dmsl("druu", dmsv(int ), (int)1644)) break;
            v0 /* !! */  = (long)hi.dmsl("druv", dmsv(int ), (int)1645);
        }
        var4_2 = hi.c;
        v1 /* !! */  = hi.ib;
        if (true) ** GOTO lbl11
        block35: while (true) {
            v1 /* !! */  = (long)(v2 - hi.dmsl("druw", dmts(int ), (int)726));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -483900298: {
                    v2 = hi.dmsl("drux", dmts(int ), (int)727);
                    continue block35;
                }
                case -262132189: {
                    v2 = hi.dmsl("druy", dmts(int ), (int)728);
                    continue block35;
                }
                case 1228545173: {
                    break block35;
                }
                case 1835952203: {
                    v2 = hi.dmsl("druz", dmts(int ), (int)729);
                    continue block35;
                }
            }
            break;
        }
        var3_3 /* !! */  = hi.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = hi.ib - hi.dmsl("drva", dmts(int ), (int)730)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == hi.dmsl("drvb", dmsv(int ), (int)1646)) break;
            v3 /* !! */  = (long)hi.dmsl("drvc", dmsv(int ), (int)1647);
        }
        var2_4 = hi.a;
        if (var4_2) {
            throw null;
lbl32:
            // 4 sources

            return;
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block6 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl32
                v4 /* !! */  = hi.ib;
                if (true) ** GOTO lbl42
                block38: while (true) {
                    v4 /* !! */  = (long)(v5 - hi.dmsl("drvd", dmts(int ), (int)731));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1706833751: {
                            v5 = hi.dmsl("drve", dmts(int ), (int)732);
                            continue block38;
                        }
                        case 298374024: {
                            v5 = hi.dmsl("drvf", dmts(int ), (int)733);
                            continue block38;
                        }
                        case 715408990: {
                            v5 = hi.dmsl("drvg", dmts(int ), (int)734);
                            continue block38;
                        }
                        case 1228545173: {
                            break block38;
                        }
                    }
                    break;
                }
                v6 = var1_1.getFirst();
                v7 /* !! */  = hi.ib;
                if (true) ** GOTO lbl59
                block39: while (true) {
                    v7 /* !! */  = (long)(v8 - hi.dmsl("drvh", dmts(int ), (int)735));
lbl59:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1273620497: {
                            v8 = hi.dmsl("drvi", dmts(int ), (int)736);
                            continue block39;
                        }
                        case 41533574: {
                            v8 = hi.dmsl("drvj", dmts(int ), (int)737);
                            continue block39;
                        }
                        case 1228545173: {
                            break block39;
                        }
                    }
                    break;
                }
                if (v6 != class_1304.field_6171) ** GOTO lbl95
                if (var2_4 || var2_4) ** GOTO lbl32
                v9 /* !! */  = hi.ib;
                if (true) ** GOTO lbl74
                block40: while (true) {
                    v9 /* !! */  = (long)(v10 - hi.dmsl("drvk", dmts(int ), (int)738));
lbl74:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1898833285: {
                            v10 = hi.dmsl("drvl", dmts(int ), (int)739);
                            continue block40;
                        }
                        case -28824469: {
                            v10 = hi.dmsl("drvm", dmts(int ), (int)740);
                            continue block40;
                        }
                        case 374843829: {
                            v10 = hi.dmsl("drvn", dmts(int ), (int)741);
                            continue block40;
                        }
                        case 1228545173: {
                            break block40;
                        }
                    }
                    break;
                }
                v11 = (class_1799)var1_1.getSecond();
                v12 = hi.dmsl("drvo", dmsv(int ), (int)1648);
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_2 = hi.ib - hi.dmsl("drvp", dmts(int ), (int)742)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == hi.dmsl("drvq", dmsv(int ), (int)1649)) break;
                    v13 /* !! */  = (long)hi.dmsl("drvr", dmsv(int ), (int)1650);
                }
                this.observeServerOffhand(v11, (boolean)v12);
                if (var2_4) ** GOTO lbl32
lbl95:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)hi.dmsl("drvs", dmsv(int ), (int)1651);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl117
            }
lbl103:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)hi.dmsl("drvt", dmsv(int ), (int)1652);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl130
            }
            case 2: {
                var3_3 /* !! */  = (int)hi.dmsl("drvu", dmsv(int ), (int)1653);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl130
            }
lbl113:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)hi.dmsl("drvv", dmsv(int ), (int)1654);
                if (var4_2) {
                    throw null;
                }
            }
lbl117:
            // 4 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hi.dmsl("drvw", dmsv(int ), (int)1655);
                    if (!var4_2) break block6;
                    throw null;
                }
            }
            case 5: {
                var3_3 /* !! */  = (int)hi.dmsl("drvx", dmsv(int ), (int)1656);
                if (!var4_2) ** GOTO lbl113
                throw null;
            }
lbl126:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)hi.dmsl("drvy", dmsv(int ), (int)1657);
                if (!var4_2) ** GOTO lbl103
                throw null;
            }
lbl130:
            // 3 sources

            case 7: {
                var3_3 /* !! */  = (int)hi.dmsl("drvz", dmsv(int ), (int)1658);
                if (!var4_2) ** GOTO lbl126
                throw null;
            }
            case 8: 
        }
        var3_3 /* !! */  = (int)hi.dmsl("drwa", dmsv(int ), (int)1659);
        ** while (!var4_2)
lbl137:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean shouldReplaceEnchantedTotem() {
        block67: {
            block66: {
                block65: {
                    block64: {
                        var5_1 = hi.c;
                        var4_2 /* !! */  = hi.b;
                        var3_3 = hi.a;
                        if (var5_1) {
                            throw null;
lbl6:
                            // 14 sources

                            return (boolean)hi.dmsl("douh", dmsv(int ), (int)655);
                        }
                        if (var3_3 || var3_3) ** GOTO lbl6
                        if (this.saveTalismans.isValue()) break block64;
                        if (var3_3 || var3_3) ** GOTO lbl6
                        return (boolean)hi.dmsl("doui", dmsv(int ), (int)656);
                    }
                    if (var3_3 || var3_3) ** GOTO lbl6
                    if (!this.hasReplacedEnchanted) break block65;
                    if (var3_3 || var3_3) ** GOTO lbl6
                    return (boolean)hi.dmsl("douj", dmsv(int ), (int)657);
                }
                if (var3_3 || var3_3) ** GOTO lbl6
                var1_4 = hi.mc.field_1724.method_6079();
                if (var3_3 || var3_3) ** GOTO lbl6
                if (var1_4.method_7909() == class_1802.field_8288) break block66;
                if (var3_3 || var3_3) ** GOTO lbl6
                return (boolean)hi.dmsl("douk", dmsv(int ), (int)658);
            }
            if (var3_3 || var3_3) ** GOTO lbl6
            if (this.hasSpecialProperties(var1_4)) break block67;
            if (var3_3 || var3_3) ** GOTO lbl6
            return (boolean)hi.dmsl("doul", dmsv(int ), (int)659);
        }
        if (var3_3 || var3_3) ** GOTO lbl6
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var2_5 = this.findTotem((boolean)hi.dmsl("doum", dmsv(int ), (int)660));
                if (var3_3 || var3_3) ** GOTO lbl6
                if (!var2_5.found()) ** GOTO lbl41
                if (var3_3 || var3_3) ** GOTO lbl6
                this.hasReplacedEnchanted = hi.dmsl("doun", dmsv(int ), (int)661);
                if (var3_3 || var3_3) ** GOTO lbl6
                return (boolean)hi.dmsl("douo", dmsv(int ), (int)662);
lbl41:
                // 1 sources

                if (var3_3 || var3_3) ** continue;
                return (boolean)hi.dmsl("doup", dmsv(int ), (int)663);
            }
lbl43:
            // 2 sources

            case 0: {
                var4_2 /* !! */  = (int)hi.dmsl("douq", dmsv(int ), (int)664);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl73
            }
lbl48:
            // 2 sources

            case 1: {
                var4_2 /* !! */  = (int)hi.dmsl("dour", dmsv(int ), (int)665);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl83
            }
            case 2: {
                var4_2 /* !! */  = (int)hi.dmsl("dous", dmsv(int ), (int)666);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl68
            }
lbl58:
            // 3 sources

            case 3: {
                do {
                    var4_2 /* !! */  = (int)hi.dmsl("dout", dmsv(int ), (int)667);
                } while (!var5_1);
                throw null;
            }
lbl63:
            // 3 sources

            case 4: {
                var4_2 /* !! */  = (int)hi.dmsl("douu", dmsv(int ), (int)668);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl141
            }
lbl68:
            // 3 sources

            case 5: {
                var4_2 /* !! */  = (int)hi.dmsl("douw", dmsv(int ), (int)669);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl114
            }
lbl73:
            // 2 sources

            case 6: {
                var4_2 /* !! */  = (int)hi.dmsl("doux", dmsv(int ), (int)670);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl97
            }
            case 7: {
                var4_2 /* !! */  = (int)hi.dmsl("douy", dmsv(int ), (int)671);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl184
            }
lbl83:
            // 3 sources

            case 8: {
                var4_2 /* !! */  = (int)hi.dmsl("douz", dmsv(int ), (int)672);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl141
            }
            case 9: {
                var4_2 /* !! */  = (int)hi.dmsl("dova", dmsv(int ), (int)673);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl163
            }
            case 10: {
                var4_2 /* !! */  = (int)hi.dmsl("dovb", dmsv(int ), (int)674);
                if (!var5_1) ** GOTO lbl68
                throw null;
            }
lbl97:
            // 2 sources

            case 11: {
                var4_2 /* !! */  = (int)hi.dmsl("dovc", dmsv(int ), (int)675);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl167
            }
            case 12: {
                var4_2 /* !! */  = (int)hi.dmsl("dovd", dmsv(int ), (int)676);
                if (!var5_1) ** GOTO lbl58
                throw null;
            }
            case 13: {
                var4_2 /* !! */  = (int)hi.dmsl("dove", dmsv(int ), (int)677);
                if (!var5_1) break;
                throw null;
            }
lbl110:
            // 2 sources

            case 14: {
                var4_2 /* !! */  = (int)hi.dmsl("dovf", dmsv(int ), (int)678);
                if (!var5_1) ** GOTO lbl63
                throw null;
            }
lbl114:
            // 2 sources

            case 15: {
                var4_2 /* !! */  = (int)hi.dmsl("dovg", dmsv(int ), (int)679);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl180
            }
lbl119:
            // 2 sources

            case 16: {
                var4_2 /* !! */  = (int)hi.dmsl("dovh", dmsv(int ), (int)680);
                if (!var5_1) break;
                throw null;
            }
lbl123:
            // 2 sources

            case 17: {
                var4_2 /* !! */  = (int)hi.dmsl("dovi", dmsv(int ), (int)681);
                if (!var5_1) ** GOTO lbl110
                throw null;
            }
            case 18: {
                var4_2 /* !! */  = (int)hi.dmsl("dovj", dmsv(int ), (int)682);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl145
            }
            case 19: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)hi.dmsl("dovl", dmsv(int ), (int)683);
                    if (!var5_1) break block0;
                    throw null;
                }
            }
lbl137:
            // 3 sources

            case 20: {
                var4_2 /* !! */  = (int)hi.dmsl("dovm", dmsv(int ), (int)684);
                if (!var5_1) ** GOTO lbl119
                throw null;
            }
lbl141:
            // 3 sources

            case 21: {
                var4_2 /* !! */  = (int)hi.dmsl("dovn", dmsv(int ), (int)685);
                if (!var5_1) ** GOTO lbl48
                throw null;
            }
lbl145:
            // 2 sources

            case 22: {
                var4_2 /* !! */  = (int)hi.dmsl("dovo", dmsv(int ), (int)686);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl158
            }
            case 23: {
                var4_2 /* !! */  = (int)hi.dmsl("dovp", dmsv(int ), (int)687);
                if (!var5_1) ** GOTO lbl137
                throw null;
            }
            case 24: {
                var4_2 /* !! */  = (int)hi.dmsl("dovq", dmsv(int ), (int)688);
                if (!var5_1) ** GOTO lbl58
                throw null;
            }
lbl158:
            // 2 sources

            case 25: {
                var4_2 /* !! */  = (int)hi.dmsl("dovr", dmsv(int ), (int)689);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl163:
            // 2 sources

            case 26: {
                var4_2 /* !! */  = (int)hi.dmsl("dovs", dmsv(int ), (int)690);
                if (!var5_1) ** GOTO lbl63
                throw null;
            }
lbl167:
            // 3 sources

            case 27: {
                var4_2 /* !! */  = (int)hi.dmsl("dovt", dmsv(int ), (int)691);
                if (!var5_1) ** GOTO lbl137
                throw null;
            }
            case 28: {
                var4_2 /* !! */  = (int)hi.dmsl("dovu", dmsv(int ), (int)692);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl184
            }
            case 29: {
                var4_2 /* !! */  = (int)hi.dmsl("dovw", dmsv(int ), (int)693);
                if (!var5_1) ** GOTO lbl43
                throw null;
            }
lbl180:
            // 2 sources

            case 30: {
                var4_2 /* !! */  = (int)hi.dmsl("dovx", dmsv(int ), (int)694);
                if (!var5_1) ** GOTO lbl123
                throw null;
            }
lbl184:
            // 3 sources

            case 31: {
                var4_2 /* !! */  = (int)hi.dmsl("dovy", dmsv(int ), (int)695);
                if (!var5_1) ** GOTO lbl83
                throw null;
            }
            case 32: 
        }
        var4_2 /* !! */  = (int)hi.dmsl("dovz", dmsv(int ), (int)696);
        ** while (!var5_1)
lbl191:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dtml() {
        hi.dmsk[800] = -1151819945;
        hi.dmsk[801] = 1167180429;
        hi.dmsk[802] = -1885120928;
        hi.dmsk[803] = 1676106693;
        hi.dmsk[804] = -696199839;
        hi.dmsk[805] = 373107956;
        hi.dmsk[806] = 1670669198;
        hi.dmsk[807] = -1316213686;
        hi.dmsk[808] = -1855115612;
        hi.dmsk[809] = -1672776433;
        hi.dmsk[810] = 701413349;
        hi.dmsk[811] = 1299556109;
        hi.dmsk[812] = -2067555832;
        hi.dmsk[813] = 1885566783;
        hi.dmsk[814] = 864542900;
        hi.dmsk[815] = 803438890;
        hi.dmsk[816] = -51528078;
        hi.dmsk[817] = 685311949;
        hi.dmsk[818] = -1912357820;
        hi.dmsk[819] = -1368513005;
        hi.dmsk[820] = 2025199174;
        hi.dmsk[821] = -783008789;
        hi.dmsk[822] = 1973206829;
        hi.dmsk[823] = 1363561959;
        hi.dmsk[824] = 1823564142;
        hi.dmsk[825] = 1874200207;
        hi.dmsk[826] = 497811360;
        hi.dmsk[827] = 1677239305;
        hi.dmsk[828] = 1261907327;
        hi.dmsk[829] = -443789933;
        hi.dmsk[830] = 261509430;
        hi.dmsk[831] = -1752432907;
        hi.dmsk[832] = -1979123853;
        hi.dmsk[833] = 1877834794;
        hi.dmsk[834] = -1351549191;
        hi.dmsk[835] = 195343686;
        hi.dmsk[836] = 406278635;
        hi.dmsk[837] = 32902193;
        hi.dmsk[838] = -304368299;
        hi.dmsk[839] = -2038795849;
        hi.dmsk[840] = 1655206535;
        hi.dmsk[841] = 626905897;
        hi.dmsk[842] = 939273692;
        hi.dmsk[843] = -2071042273;
        hi.dmsk[844] = -1672295718;
        hi.dmsk[845] = -1555128553;
        hi.dmsk[846] = 311444435;
        hi.dmsk[847] = -1534218999;
        hi.dmsk[848] = -1120179343;
        hi.dmsk[849] = 1666840367;
        hi.dmsk[850] = -1851606832;
        hi.dmsk[851] = -2027662973;
        hi.dmsk[852] = -1194781932;
        hi.dmsk[853] = 926790606;
        hi.dmsk[854] = 1756700574;
        hi.dmsk[855] = -1676725194;
        hi.dmsk[856] = 664956491;
        hi.dmsk[857] = -515530323;
        hi.dmsk[858] = -421326493;
        hi.dmsk[859] = 1409810102;
        hi.dmsk[860] = 1337084707;
        hi.dmsk[861] = -179854253;
        hi.dmsk[862] = -1541336827;
        hi.dmsk[863] = -1123561957;
        hi.dmsk[864] = 1028965681;
        hi.dmsk[865] = 840633291;
        hi.dmsk[866] = -369377080;
        hi.dmsk[867] = -1861066288;
        hi.dmsk[868] = -1621316137;
        hi.dmsk[869] = 574820759;
        hi.dmsk[870] = 291655227;
        hi.dmsk[871] = 814015402;
        hi.dmsk[872] = -321866554;
        hi.dmsk[873] = -242241308;
        hi.dmsk[874] = 1649490004;
        hi.dmsk[875] = 755014972;
        hi.dmsk[876] = 1798575299;
        hi.dmsk[877] = -1577628162;
        hi.dmsk[878] = 400610266;
        hi.dmsk[879] = -759484823;
        hi.dmsk[880] = 1596377260;
        hi.dmsk[881] = 119464197;
        hi.dmsk[882] = 1166881283;
        hi.dmsk[883] = 948115770;
        hi.dmsk[884] = -1285190467;
        hi.dmsk[885] = 86874081;
        hi.dmsk[886] = -1614590627;
        hi.dmsk[887] = -1805601040;
        hi.dmsk[888] = -470667249;
        hi.dmsk[889] = -2015091854;
        hi.dmsk[890] = -468082448;
        hi.dmsk[891] = 11070045;
        hi.dmsk[892] = -256837022;
        hi.dmsk[893] = 29303820;
        hi.dmsk[894] = 2069400996;
        hi.dmsk[895] = 886580079;
        hi.dmsk[896] = 2085628443;
        hi.dmsk[897] = 862939426;
        hi.dmsk[898] = 1121530336;
        hi.dmsk[899] = -1452672960;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void finishRevertConfirmation() {
        block138: {
            v0 /* !! */  = hi.ib;
            if (true) ** GOTO lbl5
            block92: while (true) {
                v0 /* !! */  = (long)(hi.dmsl("drgg", dmts(int ), (int)580) - hi.dmsl("drgf", dmts(int ), (int)579));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case 1228545173: {
                        break block92;
                    }
                    case 2090721609: {
                        continue block92;
                    }
                }
                break;
            }
            var3_1 = hi.c;
            v1 /* !! */  = hi.ib;
            if (true) ** GOTO lbl15
            block93: while (true) {
                v1 /* !! */  = (long)(v2 - hi.dmsl("drgh", dmts(int ), (int)581));
lbl15:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -629320901: {
                        v2 = hi.dmsl("drgi", dmts(int ), (int)582);
                        continue block93;
                    }
                    case -553561145: {
                        v2 = hi.dmsl("drgj", dmts(int ), (int)583);
                        continue block93;
                    }
                    case 1228545173: {
                        break block93;
                    }
                    case 1932092566: {
                        v2 = hi.dmsl("drgn", dmts(int ), (int)584);
                        continue block93;
                    }
                }
                break;
            }
            var2_2 /* !! */  = hi.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_0 = hi.ib - hi.dmsl("drgo", dmts(int ), (int)585)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == hi.dmsl("drgp", dmsv(int ), (int)1478)) break;
                v3 /* !! */  = (long)hi.dmsl("drgq", dmsv(int ), (int)1479);
            }
            var1_3 = hi.a;
            if (var3_1) {
                throw null;
lbl36:
                // 12 sources

                return;
            }
            if (var1_3 || var1_3) ** GOTO lbl36
            v4 /* !! */  = hi.ib;
            if (true) ** GOTO lbl43
            block96: while (true) {
                v4 /* !! */  = (long)(v5 - hi.dmsl("drgr", dmts(int ), (int)586));
lbl43:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -795921169: {
                        v5 = hi.dmsl("drgs", dmts(int ), (int)587);
                        continue block96;
                    }
                    case 461431594: {
                        v5 = hi.dmsl("drgt", dmts(int ), (int)588);
                        continue block96;
                    }
                    case 1228545173: {
                        break block96;
                    }
                    case 1839345726: {
                        v5 = hi.dmsl("drgz", dmts(int ), (int)589);
                        continue block96;
                    }
                }
                break;
            }
            v6 = System.currentTimeMillis();
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_1 = hi.ib - hi.dmsl("drhb", dmts(int ), (int)590)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v7 /* !! */  == hi.dmsl("drhc", dmsv(int ), (int)1480)) break;
                v7 /* !! */  = (long)hi.dmsl("drhd", dmsv(int ), (int)1481);
            }
            if (v6 >= this.revertConfirmationAt) break block138;
            if (var1_3) ** GOTO lbl36
            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl36
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_2 = hi.ib - hi.dmsl("drhe", dmts(int ), (int)591)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == hi.dmsl("drhf", dmsv(int ), (int)1482)) break;
            v8 /* !! */  = (long)hi.dmsl("drhg", dmsv(int ), (int)1483);
        }
        v9 /* !! */  = hi.ib;
        if (true) ** GOTO lbl75
        block99: while (true) {
            v9 /* !! */  = (long)(hi.dmsl("drhp", dmts(int ), (int)593) - hi.dmsl("drho", dmts(int ), (int)592));
lbl75:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -604300201: {
                    continue block99;
                }
                case 1228545173: {
                    break block99;
                }
            }
            break;
        }
        if (this.pendingRevertItem.method_7960()) ** GOTO lbl-1000
        v10 /* !! */  = hi.ib;
        if (true) ** GOTO lbl85
        block100: while (true) {
            v10 /* !! */  = (long)(hi.dmsl("drhr", dmts(int ), (int)595) - hi.dmsl("drhq", dmts(int ), (int)594));
lbl85:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -499751366: {
                    continue block100;
                }
                case 1228545173: {
                    break block100;
                }
            }
            break;
        }
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_3 = hi.ib - hi.dmsl("drhs", dmts(int ), (int)596)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == hi.dmsl("drht", dmsv(int ), (int)1484)) break;
            v11 /* !! */  = (long)hi.dmsl("drhu", dmsv(int ), (int)1485);
        }
        v12 = hi.mc.field_1724;
        v13 /* !! */  = hi.ib;
        if (true) ** GOTO lbl100
        block102: while (true) {
            v13 /* !! */  = (long)(hi.dmsl("drid", dmts(int ), (int)598) - hi.dmsl("dric", dmts(int ), (int)597));
lbl100:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case 1228545173: {
                    break block102;
                }
                case 1492011053: {
                    continue block102;
                }
            }
            break;
        }
        v14 = v12.method_6079();
        v15 /* !! */  = hi.ib;
        if (true) ** GOTO lbl110
        block103: while (true) {
            v15 /* !! */  = (long)(v16 - hi.dmsl("drie", dmts(int ), (int)599));
lbl110:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -370022500: {
                    v16 = hi.dmsl("drif", dmts(int ), (int)600);
                    continue block103;
                }
                case 1228545173: {
                    break block103;
                }
                case 1901697076: {
                    v16 = hi.dmsl("drig", dmts(int ), (int)601);
                    continue block103;
                }
            }
            break;
        }
        v17 /* !! */  = hi.ib;
        if (true) ** GOTO lbl123
        block104: while (true) {
            v17 /* !! */  = (long)(v18 - hi.dmsl("drii", dmts(int ), (int)602));
lbl123:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case -309811679: {
                    v18 = hi.dmsl("drio", dmts(int ), (int)603);
                    continue block104;
                }
                case 1228545173: {
                    break block104;
                }
                case 1317582222: {
                    v18 = hi.dmsl("drip", dmts(int ), (int)604);
                    continue block104;
                }
            }
            break;
        }
        if (class_1799.method_31577((class_1799)v14, (class_1799)this.pendingRevertItem)) {
            v19 = hi.dmsl("driq", dmsv(int ), (int)1486);
            if (var3_1) {
                throw null;
            }
        } else lbl-1000:
        // 2 sources

        {
            v19 = hi.dmsl("drir", dmsv(int ), (int)1487);
        }
        while (true) {
            if ((v20 /* !! */  = (cfr_temp_4 = hi.ib - hi.dmsl("dris", dmts(int ), (int)605)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v20 /* !! */  == hi.dmsl("drit", dmsv(int ), (int)1488)) break;
            v20 /* !! */  = (long)hi.dmsl("driw", dmsv(int ), (int)1489);
        }
        this.revertSucceeded = v19;
        if (var1_3 || var1_3) ** GOTO lbl36
        v21 /* !! */  = hi.ib;
        if (true) ** GOTO lbl149
        block106: while (true) {
            v21 /* !! */  = (long)(v22 - hi.dmsl("drjc", dmts(int ), (int)606));
lbl149:
            // 2 sources

            switch ((int)v21 /* !! */ ) {
                case 240298893: {
                    v22 = hi.dmsl("drjd", dmts(int ), (int)607);
                    continue block106;
                }
                case 549944046: {
                    v22 = hi.dmsl("drje", dmts(int ), (int)608);
                    continue block106;
                }
                case 1228545173: {
                    break block106;
                }
            }
            break;
        }
        if (!this.revertSucceeded) ** GOTO lbl236
        if (var1_3) ** GOTO lbl36
        v23 /* !! */  = hi.ib;
        if (true) ** GOTO lbl164
        block107: while (true) {
            v23 /* !! */  = (long)(hi.dmsl("drjo", dmts(int ), (int)610) - hi.dmsl("drjm", dmts(int ), (int)609));
lbl164:
            // 2 sources

            switch ((int)v23 /* !! */ ) {
                case -1184011431: {
                    continue block107;
                }
                case 1228545173: {
                    break block107;
                }
            }
            break;
        }
        v24 /* !! */  = hi.ib;
        if (true) ** GOTO lbl173
        block108: while (true) {
            v24 /* !! */  = (long)(v25 - hi.dmsl("drjq", dmts(int ), (int)611));
lbl173:
            // 2 sources

            switch ((int)v24 /* !! */ ) {
                case 1228545173: {
                    break block108;
                }
                case 1412550523: {
                    v25 = hi.dmsl("drjs", dmts(int ), (int)612);
                    continue block108;
                }
                case 1870017874: {
                    v25 = hi.dmsl("drju", dmts(int ), (int)613);
                    continue block108;
                }
            }
            break;
        }
        if (this.itemHistory.isEmpty()) ** GOTO lbl236
        if (var1_3 || var1_3) ** GOTO lbl36
        v26 /* !! */  = hi.ib;
        if (true) ** GOTO lbl188
        block109: while (true) {
            v26 /* !! */  = (long)(v27 - hi.dmsl("drjy", dmts(int ), (int)614));
lbl188:
            // 2 sources

            switch ((int)v26 /* !! */ ) {
                case -212229723: {
                    v27 = hi.dmsl("drkb", dmts(int ), (int)615);
                    continue block109;
                }
                case 1228545173: {
                    break block109;
                }
                case 1868363375: {
                    v27 = hi.dmsl("drkd", dmts(int ), (int)616);
                    continue block109;
                }
            }
            break;
        }
        v28 /* !! */  = hi.ib;
        if (true) ** GOTO lbl201
        block110: while (true) {
            v28 /* !! */  = (long)(hi.dmsl("drkh", dmts(int ), (int)618) - hi.dmsl("drkg", dmts(int ), (int)617));
lbl201:
            // 2 sources

            switch ((int)v28 /* !! */ ) {
                case 1228545173: {
                    break block110;
                }
                case 1559502079: {
                    continue block110;
                }
            }
            break;
        }
        this.itemHistory.pop();
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl36
                v29 = hi.dmsl("drki", dmsv(int ), (int)1490);
                while (true) {
                    if ((v30 /* !! */  = (cfr_temp_5 = hi.ib - hi.dmsl("drkj", dmts(int ), (int)619)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v30 /* !! */  == hi.dmsl("drkq", dmsv(int ), (int)1491)) break;
                    v30 /* !! */  = (long)hi.dmsl("drkr", dmsv(int ), (int)1492);
                }
                this.rememberedItemSlot = (int)v29;
                if (var1_3 || var1_3) ** GOTO lbl36
                v31 = hi.dmsl("drks", dmsv(int ), (int)1493);
                v32 /* !! */  = hi.ib;
                if (true) ** GOTO lbl225
                block112: while (true) {
                    v32 /* !! */  = (long)(v33 - hi.dmsl("drku", dmts(int ), (int)620));
lbl225:
                    // 2 sources

                    switch ((int)v32 /* !! */ ) {
                        case -1158205372: {
                            v33 = hi.dmsl("drkw", dmts(int ), (int)621);
                            continue block112;
                        }
                        case 1228545173: {
                            break block112;
                        }
                        case 1848430987: {
                            v33 = hi.dmsl("drkx", dmts(int ), (int)622);
                            continue block112;
                        }
                    }
                    break;
                }
                this.awaitingInitialDisplacement = v31;
                if (var1_3) ** GOTO lbl36
lbl236:
                // 3 sources

                if (var1_3 || var1_3) ** GOTO lbl36
                while (true) {
                    if ((v34 /* !! */  = (cfr_temp_6 = hi.ib - hi.dmsl("drkz", dmts(int ), (int)623)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v34 /* !! */  == hi.dmsl("drla", dmsv(int ), (int)1494)) break;
                    v34 /* !! */  = (long)hi.dmsl("drlb", dmsv(int ), (int)1495);
                }
                v35 = System.currentTimeMillis();
                while (true) {
                    if ((v36 /* !! */  = (cfr_temp_7 = hi.ib - hi.dmsl("drlc", dmts(int ), (int)624)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v36 /* !! */  == hi.dmsl("drld", dmsv(int ), (int)1496)) break;
                    v36 /* !! */  = (long)hi.dmsl("drle", dmsv(int ), (int)1497);
                }
                this.lastSwapTime = v35;
                if (var1_3 || var1_3) ** GOTO lbl36
                while (true) {
                    if ((v37 /* !! */  = (cfr_temp_8 = hi.ib - hi.dmsl("drlg", dmts(int ), (int)625)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v37 /* !! */  == hi.dmsl("drlh", dmsv(int ), (int)1498)) break;
                    v37 /* !! */  = (long)hi.dmsl("drli", dmsv(int ), (int)1499);
                }
                this.clearPendingRevertConfirmation();
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)hi.dmsl("drlj", dmsv(int ), (int)1500);
                if (var3_1) {
                    throw null;
                }
            }
lbl263:
            // 5 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)hi.dmsl("drlk", dmsv(int ), (int)1501);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)hi.dmsl("drll", dmsv(int ), (int)1502);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl282
            }
lbl273:
            // 3 sources

            case 3: {
                var2_2 /* !! */  = (int)hi.dmsl("drlm", dmsv(int ), (int)1503);
                if (!var3_1) break;
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)hi.dmsl("drlo", dmsv(int ), (int)1504);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl332
            }
lbl282:
            // 3 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hi.dmsl("drlp", dmsv(int ), (int)1505);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl327
                    break;
                }
            }
            case 6: {
                var2_2 /* !! */  = (int)hi.dmsl("drlq", dmsv(int ), (int)1506);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl353
            }
            case 7: {
                var2_2 /* !! */  = (int)hi.dmsl("drlr", dmsv(int ), (int)1507);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl349
            }
            case 8: {
                var2_2 /* !! */  = (int)hi.dmsl("drls", dmsv(int ), (int)1508);
                if (!var3_1) ** GOTO lbl273
                throw null;
            }
lbl302:
            // 3 sources

            case 9: {
                var2_2 /* !! */  = (int)hi.dmsl("drlt", dmsv(int ), (int)1509);
                if (!var3_1) ** GOTO lbl263
                throw null;
            }
lbl306:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)hi.dmsl("drlu", dmsv(int ), (int)1510);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl341
            }
            case 11: {
                var2_2 /* !! */  = (int)hi.dmsl("drlv", dmsv(int ), (int)1511);
                if (!var3_1) break;
                throw null;
            }
            case 12: {
                var2_2 /* !! */  = (int)hi.dmsl("drlw", dmsv(int ), (int)1512);
                if (!var3_1) ** GOTO lbl273
                throw null;
            }
lbl319:
            // 3 sources

            case 13: {
                var2_2 /* !! */  = (int)hi.dmsl("drlx", dmsv(int ), (int)1513);
                if (!var3_1) ** GOTO lbl306
                throw null;
            }
            case 14: {
                var2_2 /* !! */  = (int)hi.dmsl("drly", dmsv(int ), (int)1514);
                if (!var3_1) ** GOTO lbl263
                throw null;
            }
lbl327:
            // 2 sources

            case 15: {
                var2_2 /* !! */  = (int)hi.dmsl("drlz", dmsv(int ), (int)1515);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl357
            }
lbl332:
            // 2 sources

            case 16: {
                var2_2 /* !! */  = (int)hi.dmsl("drma", dmsv(int ), (int)1516);
                if (!var3_1) ** GOTO lbl319
                throw null;
            }
            case 17: {
                var2_2 /* !! */  = (int)hi.dmsl("drmb", dmsv(int ), (int)1517);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl353
            }
lbl341:
            // 2 sources

            case 18: {
                var2_2 /* !! */  = (int)hi.dmsl("drmc", dmsv(int ), (int)1518);
                if (!var3_1) ** GOTO lbl319
                throw null;
            }
            case 19: {
                var2_2 /* !! */  = (int)hi.dmsl("drmd", dmsv(int ), (int)1519);
                if (!var3_1) ** GOTO lbl282
                throw null;
            }
lbl349:
            // 2 sources

            case 20: {
                var2_2 /* !! */  = (int)hi.dmsl("drme", dmsv(int ), (int)1520);
                if (!var3_1) ** GOTO lbl302
                throw null;
            }
lbl353:
            // 4 sources

            case 21: {
                var2_2 /* !! */  = (int)hi.dmsl("drmf", dmsv(int ), (int)1521);
                if (!var3_1) ** GOTO lbl302
                throw null;
            }
lbl357:
            // 2 sources

            case 22: {
                var2_2 /* !! */  = (int)hi.dmsl("drmg", dmsv(int ), (int)1522);
                if (!var3_1) ** GOTO lbl353
                throw null;
            }
            case 23: 
        }
        var2_2 /* !! */  = (int)hi.dmsl("drmh", dmsv(int ), (int)1523);
        ** while (!var3_1)
lbl364:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dtmt() {
        hi.dmsk[1600] = -2101272672;
        hi.dmsk[1601] = 1817312295;
        hi.dmsk[1602] = 487233060;
        hi.dmsk[1603] = 505282913;
        hi.dmsk[1604] = 464759271;
        hi.dmsk[1605] = 782605644;
        hi.dmsk[1606] = 1763626166;
        hi.dmsk[1607] = 1429013711;
        hi.dmsk[1608] = 1736318221;
        hi.dmsk[1609] = 1496412879;
        hi.dmsk[1610] = 1447602103;
        hi.dmsk[1611] = -872856879;
        hi.dmsk[1612] = -1955392014;
        hi.dmsk[1613] = -958214235;
        hi.dmsk[1614] = -601808492;
        hi.dmsk[1615] = 459060560;
        hi.dmsk[1616] = 74704078;
        hi.dmsk[1617] = 924308912;
        hi.dmsk[1618] = 488759897;
        hi.dmsk[1619] = 543530655;
        hi.dmsk[1620] = -614436526;
        hi.dmsk[1621] = 757883309;
        hi.dmsk[1622] = -1972154349;
        hi.dmsk[1623] = -1421898084;
        hi.dmsk[1624] = -673125045;
        hi.dmsk[1625] = 586668732;
        hi.dmsk[1626] = -1109276235;
        hi.dmsk[1627] = -1829335850;
        hi.dmsk[1628] = 1053717866;
        hi.dmsk[1629] = -1781777112;
        hi.dmsk[1630] = -1664565040;
        hi.dmsk[1631] = -1945893316;
        hi.dmsk[1632] = -147574719;
        hi.dmsk[1633] = 1110143653;
        hi.dmsk[1634] = 1252529195;
        hi.dmsk[1635] = 1731719559;
        hi.dmsk[1636] = 900329690;
        hi.dmsk[1637] = -1209050707;
        hi.dmsk[1638] = 1242383001;
        hi.dmsk[1639] = -938745446;
        hi.dmsk[1640] = 705128066;
        hi.dmsk[1641] = -909025820;
        hi.dmsk[1642] = -1114991658;
        hi.dmsk[1643] = 1529152488;
        hi.dmsk[1644] = -1151913595;
        hi.dmsk[1645] = -755824784;
        hi.dmsk[1646] = 1599091330;
        hi.dmsk[1647] = 267062614;
        hi.dmsk[1648] = -615519788;
        hi.dmsk[1649] = -2015336703;
        hi.dmsk[1650] = -1944102941;
        hi.dmsk[1651] = 1634046659;
        hi.dmsk[1652] = 1665003142;
        hi.dmsk[1653] = -1667616290;
        hi.dmsk[1654] = 545671312;
        hi.dmsk[1655] = 2134068765;
        hi.dmsk[1656] = -988631564;
        hi.dmsk[1657] = -1972558478;
        hi.dmsk[1658] = 2027132700;
        hi.dmsk[1659] = -2078464501;
        hi.dmsk[1660] = -1715043381;
        hi.dmsk[1661] = 1790003557;
        hi.dmsk[1662] = -71744033;
        hi.dmsk[1663] = -1318554993;
        hi.dmsk[1664] = -866365671;
        hi.dmsk[1665] = 1350553716;
        hi.dmsk[1666] = -1703198836;
        hi.dmsk[1667] = -1343252358;
        hi.dmsk[1668] = -1531458673;
        hi.dmsk[1669] = -60422305;
        hi.dmsk[1670] = 1048845665;
        hi.dmsk[1671] = 1210724285;
        hi.dmsk[1672] = -391420252;
        hi.dmsk[1673] = -2116182462;
        hi.dmsk[1674] = 2053891281;
        hi.dmsk[1675] = 444246163;
        hi.dmsk[1676] = 1172125511;
        hi.dmsk[1677] = 53778688;
        hi.dmsk[1678] = 755823732;
        hi.dmsk[1679] = 1431514721;
        hi.dmsk[1680] = -478940399;
        hi.dmsk[1681] = 1246540385;
        hi.dmsk[1682] = 1280283578;
        hi.dmsk[1683] = 1483527535;
        hi.dmsk[1684] = -2001598217;
        hi.dmsk[1685] = 810098641;
        hi.dmsk[1686] = 1184832539;
        hi.dmsk[1687] = -1888657574;
        hi.dmsk[1688] = -1863629904;
        hi.dmsk[1689] = 1112367619;
        hi.dmsk[1690] = -1300689652;
        hi.dmsk[1691] = -524868755;
        hi.dmsk[1692] = 978605181;
        hi.dmsk[1693] = -1142947018;
        hi.dmsk[1694] = -1006647715;
        hi.dmsk[1695] = -500818899;
        hi.dmsk[1696] = -1885033010;
        hi.dmsk[1697] = 1130596655;
        hi.dmsk[1698] = -1855147331;
        hi.dmsk[1699] = -894166504;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$1() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hi.ib - hi.dmsl("dseu", dmts(int ), (int)815)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hi.dmsl("dsev", dmsv(int ), (int)1735)) break;
            v0 /* !! */  = (long)hi.dmsl("dsew", dmsv(int ), (int)1736);
        }
        var3_1 = hi.c;
        v1 /* !! */  = hi.ib;
        if (true) ** GOTO lbl12
        block19: while (true) {
            v1 /* !! */  = (long)(hi.dmsl("dsey", dmts(int ), (int)817) - hi.dmsl("dsex", dmts(int ), (int)816));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 1228545173: {
                    break block19;
                }
                case 1503206753: {
                    continue block19;
                }
            }
            break;
        }
        var2_2 /* !! */  = hi.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = hi.ib - hi.dmsl("dsez", dmts(int ), (int)818)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hi.dmsl("dsfa", dmsv(int ), (int)1737)) break;
            v2 /* !! */  = (long)hi.dmsl("dsfb", dmsv(int ), (int)1738);
        }
        var1_3 = hi.a;
        if (!var3_1) ** GOTO lbl31
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl31:
                // 1 sources

                if (var1_3 || var1_3) continue block21;
                v3 /* !! */  = hi.ib;
                if (true) ** GOTO lbl36
                block22: while (true) {
                    v3 /* !! */  = (long)(hi.dmsl("dsfd", dmts(int ), (int)820) - hi.dmsl("dsfc", dmts(int ), (int)819));
lbl36:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -2017591362: {
                            continue block22;
                        }
                        case 1228545173: {
                            break block22;
                        }
                    }
                    break;
                }
                v4 = this.check("\u041a\u0440\u0438\u0441\u0442\u0430\u043b\u043b");
                v5 /* !! */  = hi.ib;
                if (true) ** GOTO lbl46
                block23: while (true) {
                    v5 /* !! */  = (long)(hi.dmsl("dsff", dmts(int ), (int)822) - hi.dmsl("dsfe", dmts(int ), (int)821));
lbl46:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 1092542631: {
                            continue block23;
                        }
                        case 1228545173: {
                            break block23;
                        }
                    }
                    break;
                }
                return v4;
                case 0: {
                    var2_2 /* !! */  = (int)hi.dmsl("dsfg", dmsv(int ), (int)1739);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl61
                }
lbl57:
                // 2 sources

                case 1: {
                    var2_2 /* !! */  = (int)hi.dmsl("dsfh", dmsv(int ), (int)1740);
                    if (var3_1) {
                        throw null;
                    }
                }
lbl61:
                // 4 sources

                case 2: {
                    var2_2 /* !! */  = (int)hi.dmsl("dsfi", dmsv(int ), (int)1741);
                    if (!var3_1) ** GOTO lbl57
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var2_2 /* !! */  = (int)hi.dmsl("dsfj", dmsv(int ), (int)1742);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void dtme() {
        hi.dmsk[100] = -880444875;
        hi.dmsk[101] = -1625797249;
        hi.dmsk[102] = 1004627575;
        hi.dmsk[103] = -758505443;
        hi.dmsk[104] = -1529665325;
        hi.dmsk[105] = -1647330635;
        hi.dmsk[106] = 1203332663;
        hi.dmsk[107] = 434556742;
        hi.dmsk[108] = 1600553843;
        hi.dmsk[109] = -226230425;
        hi.dmsk[110] = -1857363589;
        hi.dmsk[111] = -1208505023;
        hi.dmsk[112] = -664910897;
        hi.dmsk[113] = 1027433106;
        hi.dmsk[114] = -680081303;
        hi.dmsk[115] = 1753171211;
        hi.dmsk[116] = -962598180;
        hi.dmsk[117] = -606579581;
        hi.dmsk[118] = -1706686323;
        hi.dmsk[119] = -627435820;
        hi.dmsk[120] = 754307627;
        hi.dmsk[121] = 1151512165;
        hi.dmsk[122] = -345205032;
        hi.dmsk[123] = -411470934;
        hi.dmsk[124] = -1884131438;
        hi.dmsk[125] = 517265179;
        hi.dmsk[126] = 2086966762;
        hi.dmsk[127] = 923000951;
        hi.dmsk[128] = -154030325;
        hi.dmsk[129] = -1212686000;
        hi.dmsk[130] = -786490221;
        hi.dmsk[131] = 556020781;
        hi.dmsk[132] = -507803941;
        hi.dmsk[133] = 1724315339;
        hi.dmsk[134] = -1306763113;
        hi.dmsk[135] = 1563419967;
        hi.dmsk[136] = 1775324796;
        hi.dmsk[137] = -1443312893;
        hi.dmsk[138] = 552576148;
        hi.dmsk[139] = -706330227;
        hi.dmsk[140] = 1636349233;
        hi.dmsk[141] = -767412501;
        hi.dmsk[142] = -903728380;
        hi.dmsk[143] = -1592719143;
        hi.dmsk[144] = -1972403278;
        hi.dmsk[145] = 1632741182;
        hi.dmsk[146] = -1083005110;
        hi.dmsk[147] = 1583286667;
        hi.dmsk[148] = -1553813651;
        hi.dmsk[149] = -174661962;
        hi.dmsk[150] = -1827144181;
        hi.dmsk[151] = -402742831;
        hi.dmsk[152] = -480141956;
        hi.dmsk[153] = 865287209;
        hi.dmsk[154] = -1974262583;
        hi.dmsk[155] = 770937253;
        hi.dmsk[156] = 408836445;
        hi.dmsk[157] = 1482413429;
        hi.dmsk[158] = -1715255432;
        hi.dmsk[159] = -1636431791;
        hi.dmsk[160] = 58387738;
        hi.dmsk[161] = 370693848;
        hi.dmsk[162] = -41918656;
        hi.dmsk[163] = 1513457113;
        hi.dmsk[164] = 520198058;
        hi.dmsk[165] = -1145044097;
        hi.dmsk[166] = -745969279;
        hi.dmsk[167] = 711188408;
        hi.dmsk[168] = -1254128233;
        hi.dmsk[169] = -515003556;
        hi.dmsk[170] = -1808757993;
        hi.dmsk[171] = 1763663055;
        hi.dmsk[172] = -2017464352;
        hi.dmsk[173] = -337860036;
        hi.dmsk[174] = -569400354;
        hi.dmsk[175] = 181279898;
        hi.dmsk[176] = 635421984;
        hi.dmsk[177] = -1179761640;
        hi.dmsk[178] = 2058622584;
        hi.dmsk[179] = 292306340;
        hi.dmsk[180] = 1183858927;
        hi.dmsk[181] = -164105558;
        hi.dmsk[182] = -556218291;
        hi.dmsk[183] = -1125025987;
        hi.dmsk[184] = 1973491079;
        hi.dmsk[185] = 525367363;
        hi.dmsk[186] = 284270035;
        hi.dmsk[187] = -1928717719;
        hi.dmsk[188] = 2136017834;
        hi.dmsk[189] = 1603980251;
        hi.dmsk[190] = -1287915761;
        hi.dmsk[191] = -1683313126;
        hi.dmsk[192] = -1217512253;
        hi.dmsk[193] = -1666502039;
        hi.dmsk[194] = -1883508646;
        hi.dmsk[195] = 1824823970;
        hi.dmsk[196] = 1648184139;
        hi.dmsk[197] = -1839982219;
        hi.dmsk[198] = 482765672;
        hi.dmsk[199] = 685086818;
    }
}

