/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10691
 *  net.minecraft.class_1268
 *  net.minecraft.class_1291
 *  net.minecraft.class_1293
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1844
 *  net.minecraft.class_2596
 *  net.minecraft.class_2783
 *  net.minecraft.class_2868
 *  net.minecraft.class_437
 *  net.minecraft.class_6880
 *  net.minecraft.class_9334
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.UUID;
import java.util.function.Function;
import net.minecraft.class_10691;
import net.minecraft.class_1268;
import net.minecraft.class_1291;
import net.minecraft.class_1293;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1844;
import net.minecraft.class_2596;
import net.minecraft.class_2783;
import net.minecraft.class_2868;
import net.minecraft.class_437;
import net.minecraft.class_6880;
import net.minecraft.class_9334;
import ruhack.phobia.aw;
import ruhack.phobia.bw;
import ruhack.phobia.cn;
import ruhack.phobia.cr;
import ruhack.phobia.df;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.hj$PlayerPotionHit;
import ruhack.phobia.hj$ReceivedPotionEffect;
import ruhack.phobia.hj$TrackedSplashPotion;
import ruhack.phobia.jx;
import ruhack.phobia.ka;
import ruhack.phobia.kb;
import ruhack.phobia.kf;
import ruhack.phobia.me;
import ruhack.phobia.nv;
import ruhack.phobia.nx;
import ruhack.phobia.ov;
import ruhack.phobia.pn;
import ruhack.phobia.pp;

public final class hj
extends ds {
    private int pendingHotbarSlot;
    private final kb debugPotions;
    public static final int RING_SIZE = 3;
    private final class_1799[] selectedPotions;
    private class_1799 pendingPotion;
    private static int[] dcoq;
    public static final boolean a;
    private final Map<Integer, hj$TrackedSplashPotion> trackedPotions;
    private static final int THROW_IDLE = 0;
    private static int[] dcop;
    private static final int THROW_WAITING_USE = 2;
    private static long[] ddko;
    public static final boolean c;
    private static final int THROW_WAITING_RESTORE = 3;
    private final ka openRingBind;
    private boolean pendingSwapApplied;
    private final kf openRingMode;
    private static final long he = 4114043761483594198L;
    private int pendingInventoryScreenSlot;
    private final nx throwMovement;
    public static final int b;
    private static final int THROW_WAITING_SWAP = 1;
    private int throwStageTicks;
    private int throwStage;
    private static long[] ddkp;

    private static /* synthetic */ void dgkt() {
        hj.dcop[600] = -1443787581;
        hj.dcop[601] = 996405568;
        hj.dcop[602] = -2013154060;
        hj.dcop[603] = -1712121868;
        hj.dcop[604] = -570026671;
        hj.dcop[605] = -263891790;
        hj.dcop[606] = 1604447817;
        hj.dcop[607] = 706868933;
        hj.dcop[608] = 1473322728;
        hj.dcop[609] = -428937382;
        hj.dcop[610] = 1783427899;
        hj.dcop[611] = 1378192175;
        hj.dcop[612] = -599723236;
        hj.dcop[613] = 2087118338;
        hj.dcop[614] = 62094012;
        hj.dcop[615] = 1124717006;
        hj.dcop[616] = -1369647138;
        hj.dcop[617] = 1676907295;
        hj.dcop[618] = 1796239869;
        hj.dcop[619] = -1251995649;
        hj.dcop[620] = -987710222;
        hj.dcop[621] = -215519714;
        hj.dcop[622] = 244840090;
        hj.dcop[623] = -2018263691;
        hj.dcop[624] = 2103739532;
        hj.dcop[625] = 2030875926;
        hj.dcop[626] = -1549487929;
        hj.dcop[627] = 789039962;
        hj.dcop[628] = -312002275;
        hj.dcop[629] = -482043489;
        hj.dcop[630] = -362415907;
        hj.dcop[631] = 1985980856;
        hj.dcop[632] = 1346880132;
        hj.dcop[633] = -1662651131;
        hj.dcop[634] = 17073124;
        hj.dcop[635] = 1286187919;
        hj.dcop[636] = 574223344;
        hj.dcop[637] = -115095038;
        hj.dcop[638] = -2024111110;
        hj.dcop[639] = 1301722787;
        hj.dcop[640] = 1138753213;
        hj.dcop[641] = -435939789;
        hj.dcop[642] = -1799915907;
        hj.dcop[643] = 705284857;
        hj.dcop[644] = -268592848;
        hj.dcop[645] = 152473388;
        hj.dcop[646] = 3420807;
        hj.dcop[647] = 136687424;
        hj.dcop[648] = 1365673343;
        hj.dcop[649] = -873471055;
        hj.dcop[650] = 1130326842;
        hj.dcop[651] = -1288786660;
        hj.dcop[652] = -385706950;
        hj.dcop[653] = 1916968035;
        hj.dcop[654] = -1028725933;
        hj.dcop[655] = -639063605;
        hj.dcop[656] = -1433881795;
        hj.dcop[657] = -181633860;
        hj.dcop[658] = 1386012206;
        hj.dcop[659] = -2022362057;
        hj.dcop[660] = 1611754805;
        hj.dcop[661] = -877365754;
        hj.dcop[662] = 1950104923;
        hj.dcop[663] = -868373286;
        hj.dcop[664] = -1454349609;
        hj.dcop[665] = -447619735;
        hj.dcop[666] = 2052978501;
        hj.dcop[667] = 1622576983;
        hj.dcop[668] = 2065889541;
        hj.dcop[669] = 2061442053;
        hj.dcop[670] = 1992577490;
        hj.dcop[671] = 1645777594;
        hj.dcop[672] = 1705154167;
        hj.dcop[673] = -1821346501;
        hj.dcop[674] = -1335987324;
        hj.dcop[675] = -1810717399;
        hj.dcop[676] = -1491556753;
        hj.dcop[677] = -187851012;
        hj.dcop[678] = 846547308;
        hj.dcop[679] = 1656615594;
        hj.dcop[680] = -1814469363;
        hj.dcop[681] = 1355993592;
        hj.dcop[682] = -484248263;
        hj.dcop[683] = -678158279;
        hj.dcop[684] = -1224068241;
        hj.dcop[685] = 1732549238;
        hj.dcop[686] = 2040594602;
        hj.dcop[687] = 1813235071;
        hj.dcop[688] = 380647172;
        hj.dcop[689] = 175863355;
        hj.dcop[690] = 898842249;
        hj.dcop[691] = -1710820122;
        hj.dcop[692] = 105771008;
        hj.dcop[693] = -587278050;
        hj.dcop[694] = 1880547034;
        hj.dcop[695] = -827547648;
        hj.dcop[696] = 600591118;
        hj.dcop[697] = -1808520224;
        hj.dcop[698] = -134416538;
        hj.dcop[699] = -1604835673;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isRingSlot(int var1_1) {
        v0 /* !! */  = hj.he;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - hj.dcos("dgiu", ddkn(int ), (int)436));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2078411072: {
                    v1 = hj.dcos("dgiv", ddkn(int ), (int)437);
                    continue block16;
                }
                case 27539926: {
                    break block16;
                }
                case 1403217465: {
                    v1 = hj.dcos("dgiw", ddkn(int ), (int)438);
                    continue block16;
                }
            }
            break;
        }
        var4_2 = hj.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hj.he - hj.dcos("dgix", ddkn(int ), (int)439)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hj.dcos("dgiy", dcoo(int ), (int)1003)) break;
            v2 /* !! */  = (long)hj.dcos("dgiz", dcoo(int ), (int)1004);
        }
        var3_3 /* !! */  = hj.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = hj.he - hj.dcos("dgja", ddkn(int ), (int)440)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == hj.dcos("dgjb", dcoo(int ), (int)1005)) break;
                    v3 /* !! */  = (long)hj.dcos("dgjc", dcoo(int ), (int)1006);
                }
                var2_4 = hj.a;
                if (var4_2) {
                    throw null;
lbl34:
                    // 4 sources

                    return (boolean)hj.dcos("dgjd", dcoo(int ), (int)1007);
                }
                if (var2_4 || var2_4) ** GOTO lbl34
                if (var1_1 < 0) ** GOTO lbl51
                if (var2_4) ** GOTO lbl34
                while (true) {
                    if ((v4 = (cfr_temp_2 = hj.he - hj.dcos("dgje", ddkn(int ), (int)441)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 == hj.dcos("dgjf", dcoo(int ), (int)1008)) break;
                    v4 = -1220496763;
                }
                if (var1_1 >= this.selectedPotions.length) ** GOTO lbl51
                if (var2_4) ** GOTO lbl34
                v5 = hj.dcos("dgjg", dcoo(int ), (int)1009);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl54
lbl51:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v5 = hj.dcos("dgjh", dcoo(int ), (int)1010);
lbl54:
                // 2 sources

                return (boolean)v5;
            }
lbl55:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)hj.dcos("dgji", dcoo(int ), (int)1011);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl86
            }
lbl60:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)hj.dcos("dgjj", dcoo(int ), (int)1012);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl86
            }
            case 2: {
                var3_3 /* !! */  = (int)hj.dcos("dgjk", dcoo(int ), (int)1013);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl86
            }
            case 3: {
                var3_3 /* !! */  = (int)hj.dcos("dgjl", dcoo(int ), (int)1014);
                if (!var4_2) ** GOTO lbl55
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)hj.dcos("dgjm", dcoo(int ), (int)1015);
                if (!var4_2) break;
                throw null;
            }
            case 5: {
                var3_3 /* !! */  = (int)hj.dcos("dgjn", dcoo(int ), (int)1016);
                if (!var4_2) ** GOTO lbl60
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)hj.dcos("dgjo", dcoo(int ), (int)1017);
                if (!var4_2) break;
                throw null;
            }
lbl86:
            // 4 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)hj.dcos("dgjp", dcoo(int ), (int)1018);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 8: 
        }
        var3_3 /* !! */  = (int)hj.dcos("dgjq", dcoo(int ), (int)1019);
        ** while (!var4_2)
lbl94:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void openRing() {
        block77: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = hj.he - hj.dcos("ddro", ddkn(int ), (int)62)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == hj.dcos("ddrp", dcoo(int ), (int)175)) break;
                v0 /* !! */  = (long)hj.dcos("ddrq", dcoo(int ), (int)176);
            }
            var3_1 = hj.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = hj.he - hj.dcos("ddrr", ddkn(int ), (int)63)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == hj.dcos("ddrs", dcoo(int ), (int)177)) break;
                v1 /* !! */  = (long)hj.dcos("ddrt", dcoo(int ), (int)178);
            }
            var2_2 /* !! */  = hj.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = hj.he - hj.dcos("ddru", ddkn(int ), (int)64)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == hj.dcos("ddrv", dcoo(int ), (int)179)) break;
                v2 /* !! */  = (long)hj.dcos("ddrw", dcoo(int ), (int)180);
            }
            var1_3 = hj.a;
            if (var3_1) {
                throw null;
lbl21:
                // 7 sources

                return;
            }
            if (var1_3 || var1_3) ** GOTO lbl21
            v3 /* !! */  = hj.he;
            if (true) ** GOTO lbl28
            block57: while (true) {
                v3 /* !! */  = (long)(v4 - hj.dcos("ddrx", ddkn(int ), (int)65));
lbl28:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1706150829: {
                        v4 = hj.dcos("ddry", ddkn(int ), (int)66);
                        continue block57;
                    }
                    case -1197140468: {
                        v4 = hj.dcos("ddrz", ddkn(int ), (int)67);
                        continue block57;
                    }
                    case 27539926: {
                        break block57;
                    }
                }
                break;
            }
            v5 /* !! */  = hj.he;
            if (true) ** GOTO lbl41
            block58: while (true) {
                v5 /* !! */  = (long)(v6 - hj.dcos("ddsa", ddkn(int ), (int)68));
lbl41:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -2129608033: {
                        v6 = hj.dcos("ddsb", ddkn(int ), (int)69);
                        continue block58;
                    }
                    case 27539926: {
                        break block58;
                    }
                    case 855142808: {
                        v6 = hj.dcos("ddsc", ddkn(int ), (int)70);
                        continue block58;
                    }
                }
                break;
            }
            if (hj.mc.field_1724 == null) break block77;
            if (var1_3) ** GOTO lbl21
            v7 /* !! */  = hj.he;
            if (true) ** GOTO lbl56
            block59: while (true) {
                v7 /* !! */  = (long)(hj.dcos("ddse", ddkn(int ), (int)72) - hj.dcos("ddsd", ddkn(int ), (int)71));
lbl56:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case 27539926: {
                        break block59;
                    }
                    case 1177060732: {
                        continue block59;
                    }
                }
                break;
            }
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_3 = hj.he - hj.dcos("ddsf", ddkn(int ), (int)73)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == hj.dcos("ddsg", dcoo(int ), (int)181)) break;
                v8 /* !! */  = (long)hj.dcos("ddsh", dcoo(int ), (int)182);
            }
            if (hj.mc.field_1687 != null) ** GOTO lbl75
            if (var1_3) ** GOTO lbl21
        }
        if (var1_3) ** GOTO lbl21
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl21
                return;
            }
lbl75:
            // 1 sources

            if (var1_3 || var1_3) ** GOTO lbl21
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_4 = hj.he - hj.dcos("ddsi", ddkn(int ), (int)74)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == hj.dcos("ddsj", dcoo(int ), (int)183)) break;
                v9 /* !! */  = (long)hj.dcos("ddsk", dcoo(int ), (int)184);
            }
            v10 /* !! */  = hj.he;
            if (true) ** GOTO lbl85
            block62: while (true) {
                v10 /* !! */  = (long)(v11 - hj.dcos("ddsl", ddkn(int ), (int)75));
lbl85:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -1382159248: {
                        v11 = hj.dcos("ddsm", ddkn(int ), (int)76);
                        continue block62;
                    }
                    case 27539926: {
                        break block62;
                    }
                    case 663419815: {
                        v11 = hj.dcos("ddsn", ddkn(int ), (int)77);
                        continue block62;
                    }
                    case 876374062: {
                        v11 = hj.dcos("ddso", ddkn(int ), (int)78);
                        continue block62;
                    }
                }
                break;
            }
            v12 /* !! */  = hj.he;
            if (true) ** GOTO lbl101
            block63: while (true) {
                v12 /* !! */  = (long)(v13 - hj.dcos("ddsp", ddkn(int ), (int)79));
lbl101:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case -2104920396: {
                        v13 = hj.dcos("ddsq", ddkn(int ), (int)80);
                        continue block63;
                    }
                    case -836334623: {
                        v13 = hj.dcos("ddsr", ddkn(int ), (int)81);
                        continue block63;
                    }
                    case -12834427: {
                        v13 = hj.dcos("ddss", ddkn(int ), (int)82);
                        continue block63;
                    }
                    case 27539926: {
                        break block63;
                    }
                }
                break;
            }
            v14 /* !! */  = hj.he;
            if (true) ** GOTO lbl117
            block64: while (true) {
                v14 /* !! */  = (long)(v15 - hj.dcos("ddst", ddkn(int ), (int)83));
lbl117:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case -845989315: {
                        v15 = hj.dcos("ddsu", ddkn(int ), (int)84);
                        continue block64;
                    }
                    case 27539926: {
                        break block64;
                    }
                    case 466312187: {
                        v15 = hj.dcos("ddsv", ddkn(int ), (int)85);
                        continue block64;
                    }
                    case 1501908312: {
                        v15 = hj.dcos("ddsw", ddkn(int ), (int)86);
                        continue block64;
                    }
                }
                break;
            }
            v16 = hj.mc.field_1755;
            while (true) {
                if ((v17 /* !! */  = (cfr_temp_5 = hj.he - hj.dcos("ddsx", ddkn(int ), (int)87)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v17 /* !! */  == hj.dcos("ddsy", dcoo(int ), (int)185)) break;
                v17 /* !! */  = (long)hj.dcos("ddsz", dcoo(int ), (int)186);
            }
            v18 = new me(this, v16);
            v19 /* !! */  = hj.he;
            if (true) ** GOTO lbl140
            block66: while (true) {
                v19 /* !! */  = (long)(v20 - hj.dcos("ddta", ddkn(int ), (int)88));
lbl140:
                // 2 sources

                switch ((int)v19 /* !! */ ) {
                    case -72142794: {
                        v20 = hj.dcos("ddtb", ddkn(int ), (int)89);
                        continue block66;
                    }
                    case 27539926: {
                        break block66;
                    }
                    case 1973367096: {
                        v20 = hj.dcos("ddtc", ddkn(int ), (int)90);
                        continue block66;
                    }
                    case 1984419661: {
                        v20 = hj.dcos("ddtd", ddkn(int ), (int)91);
                        continue block66;
                    }
                }
                break;
            }
            hj.mc.method_1507((class_437)v18);
            if (!var1_3 && !var1_3) ** break;
            ** continue;
            return;
lbl156:
            // 4 sources

            case 0: {
                var2_2 /* !! */  = (int)hj.dcos("ddte", dcoo(int ), (int)187);
                if (var3_1) {
                    throw null;
                }
            }
lbl160:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)hj.dcos("ddtf", dcoo(int ), (int)188);
                if (!var3_1) ** GOTO lbl156
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)hj.dcos("ddtg", dcoo(int ), (int)189);
                if (!var3_1) ** GOTO lbl160
                throw null;
            }
lbl168:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)hj.dcos("ddth", dcoo(int ), (int)190);
                if (!var3_1) ** GOTO lbl156
                throw null;
            }
lbl172:
            // 3 sources

            case 4: {
                var2_2 /* !! */  = (int)hj.dcos("ddti", dcoo(int ), (int)191);
                if (!var3_1) ** GOTO lbl156
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)hj.dcos("ddtj", dcoo(int ), (int)192);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl203
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)hj.dcos("ddtk", dcoo(int ), (int)193);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 7: {
                var2_2 /* !! */  = (int)hj.dcos("ddtl", dcoo(int ), (int)194);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl199
            }
            case 8: {
                var2_2 /* !! */  = (int)hj.dcos("ddtm", dcoo(int ), (int)195);
                if (!var3_1) ** GOTO lbl172
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)hj.dcos("ddtn", dcoo(int ), (int)196);
                if (!var3_1) ** GOTO lbl168
                throw null;
            }
lbl199:
            // 3 sources

            case 10: {
                var2_2 /* !! */  = (int)hj.dcos("ddto", dcoo(int ), (int)197);
                if (!var3_1) ** GOTO lbl172
                throw null;
            }
lbl203:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)hj.dcos("ddtp", dcoo(int ), (int)198);
                if (!var3_1) ** GOTO lbl199
                throw null;
            }
            case 12: 
        }
        var2_2 /* !! */  = (int)hj.dcos("ddtq", dcoo(int ), (int)199);
        ** while (!var3_1)
lbl210:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onKey(cn var1_1) {
        block76: {
            block78: {
                block77: {
                    var6_2 = hj.c;
                    var5_3 /* !! */  = hj.b;
                    var4_4 = hj.a;
                    if (var6_2) {
                        throw null;
lbl6:
                        // 22 sources

                        return;
                    }
                    if (var4_4 || var4_4) ** GOTO lbl6
                    if (!this.openRingMode.isSelected("\u041f\u0440\u0438 \u0443\u0434\u0435\u0440\u0436\u0430\u043d\u0438\u0438")) break block76;
                    if (var4_4 || var4_4) ** GOTO lbl6
                    if (!var1_1.isBindDown(this.openRingBind)) break block77;
                    if (var4_4 || var4_4) ** GOTO lbl6
                    this.openRing();
                    if (var4_4) ** GOTO lbl6
                    if (var6_2) {
                        throw null;
                    }
                    break block78;
                }
                if (var4_4 || var4_4) ** GOTO lbl6
                if (!var1_1.isBindReleased(this.openRingBind, (boolean)hj.dcos("dcqc", dcoo(int ), (int)17))) break block78;
                if (var4_4 || var4_4) ** GOTO lbl6
                var3_5 = hj.mc.field_1755;
                if (var4_4) ** GOTO lbl6
                if (!(var3_5 instanceof me)) break block78;
                if (var4_4) ** GOTO lbl6
                var2_7 = (me)var3_5;
                if (var4_4 || var4_4) ** GOTO lbl6
                var2_7.method_25419();
                if (var4_4) ** GOTO lbl6
            }
            if (var4_4 || var4_4) ** GOTO lbl6
            return;
        }
        if (var4_4 || var4_4) ** GOTO lbl6
        if (!var1_1.isBindDown(this.openRingBind)) ** GOTO lbl46
        if (var4_4) ** GOTO lbl6
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4) ** GOTO lbl6
                this.openRing();
                if (var4_4) ** GOTO lbl6
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl57
            }
lbl46:
            // 1 sources

            if (var4_4 || var4_4) ** GOTO lbl6
            if (!var1_1.isBindDown(this.openRingBind, (boolean)hj.dcos("dcqj", dcoo(int ), (int)18))) ** GOTO lbl57
            if (var4_4 || var4_4) ** GOTO lbl6
            var3_6 = hj.mc.field_1755;
            if (var4_4) ** GOTO lbl6
            if (!(var3_6 instanceof me)) ** GOTO lbl57
            if (var4_4) ** GOTO lbl6
            var2_8 = (me)var3_6;
            if (var4_4 || var4_4) ** GOTO lbl6
            var2_8.method_25419();
            if (var4_4) ** GOTO lbl6
lbl57:
            // 4 sources

            if (!var4_4 && !var4_4) ** break;
            ** continue;
            return;
lbl60:
            // 2 sources

            case 0: {
                var5_3 /* !! */  = (int)hj.dcos("dcqo", dcoo(int ), (int)19);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl75
            }
lbl65:
            // 2 sources

            case 1: {
                var5_3 /* !! */  = (int)hj.dcos("dcqq", dcoo(int ), (int)20);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl222
            }
lbl70:
            // 2 sources

            case 2: {
                var5_3 /* !! */  = (int)hj.dcos("dcqs", dcoo(int ), (int)21);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl75:
            // 2 sources

            case 3: {
                var5_3 /* !! */  = (int)hj.dcos("ddje", dcoo(int ), (int)22);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl206
            }
            case 4: {
                var5_3 /* !! */  = (int)hj.dcos("ddjf", dcoo(int ), (int)23);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl165
            }
lbl85:
            // 2 sources

            case 5: {
                var5_3 /* !! */  = (int)hj.dcos("ddjg", dcoo(int ), (int)24);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl136
            }
            case 6: {
                var5_3 /* !! */  = (int)hj.dcos("ddjh", dcoo(int ), (int)25);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl113
            }
            case 7: {
                var5_3 /* !! */  = (int)hj.dcos("ddji", dcoo(int ), (int)26);
                if (!var6_2) break;
                throw null;
            }
lbl99:
            // 2 sources

            case 8: {
                var5_3 /* !! */  = (int)hj.dcos("ddjj", dcoo(int ), (int)27);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl196
            }
            case 9: {
                var5_3 /* !! */  = (int)hj.dcos("ddjk", dcoo(int ), (int)28);
                if (!var6_2) ** GOTO lbl65
                throw null;
            }
lbl108:
            // 3 sources

            case 10: {
                var5_3 /* !! */  = (int)hj.dcos("ddjl", dcoo(int ), (int)29);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl218
            }
lbl113:
            // 2 sources

            case 11: {
                var5_3 /* !! */  = (int)hj.dcos("ddjm", dcoo(int ), (int)30);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl218
            }
            case 12: {
                var5_3 /* !! */  = (int)hj.dcos("ddjn", dcoo(int ), (int)31);
                if (!var6_2) ** GOTO lbl85
                throw null;
            }
            case 13: {
                var5_3 /* !! */  = (int)hj.dcos("ddjo", dcoo(int ), (int)32);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl201
            }
            case 14: {
                var5_3 /* !! */  = (int)hj.dcos("ddjp", dcoo(int ), (int)33);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl149
            }
            case 15: {
                var5_3 /* !! */  = (int)hj.dcos("ddjq", dcoo(int ), (int)34);
                if (!var6_2) ** GOTO lbl70
                throw null;
            }
lbl136:
            // 3 sources

            case 16: {
                var5_3 /* !! */  = (int)hj.dcos("ddjr", dcoo(int ), (int)35);
                if (var6_2) {
                    throw null;
                }
            }
            case 17: {
                var5_3 /* !! */  = (int)hj.dcos("ddjs", dcoo(int ), (int)36);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl145:
            // 3 sources

            case 18: {
                var5_3 /* !! */  = (int)hj.dcos("ddjt", dcoo(int ), (int)37);
                if (!var6_2) ** GOTO lbl108
                throw null;
            }
lbl149:
            // 2 sources

            case 19: {
                var5_3 /* !! */  = (int)hj.dcos("ddju", dcoo(int ), (int)38);
                if (!var6_2) ** GOTO lbl145
                throw null;
            }
            case 20: {
                var5_3 /* !! */  = (int)hj.dcos("ddjv", dcoo(int ), (int)39);
                if (!var6_2) ** GOTO lbl99
                throw null;
            }
lbl157:
            // 2 sources

            case 21: {
                var5_3 /* !! */  = (int)hj.dcos("ddjw", dcoo(int ), (int)40);
                if (!var6_2) ** GOTO lbl108
                throw null;
            }
            case 22: {
                var5_3 /* !! */  = (int)hj.dcos("ddjx", dcoo(int ), (int)41);
                if (!var6_2) ** GOTO lbl60
                throw null;
            }
lbl165:
            // 2 sources

            case 23: {
                var5_3 /* !! */  = (int)hj.dcos("ddjy", dcoo(int ), (int)42);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl210
            }
lbl170:
            // 4 sources

            case 24: {
                var5_3 /* !! */  = (int)hj.dcos("ddjz", dcoo(int ), (int)43);
                if (!var6_2) ** GOTO lbl145
                throw null;
            }
lbl174:
            // 2 sources

            case 25: {
                var5_3 /* !! */  = (int)hj.dcos("ddka", dcoo(int ), (int)44);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl187
            }
            case 26: {
                var5_3 /* !! */  = (int)hj.dcos("ddkb", dcoo(int ), (int)45);
                if (!var6_2) ** GOTO lbl170
                throw null;
            }
            case 27: {
                var5_3 /* !! */  = (int)hj.dcos("ddkc", dcoo(int ), (int)46);
                if (!var6_2) ** GOTO lbl136
                throw null;
            }
lbl187:
            // 2 sources

            case 28: {
                var5_3 /* !! */  = (int)hj.dcos("ddkd", dcoo(int ), (int)47);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl206
            }
            case 29: {
                var5_3 /* !! */  = (int)hj.dcos("ddke", dcoo(int ), (int)48);
                if (!var6_2) ** GOTO lbl157
                throw null;
            }
lbl196:
            // 3 sources

            case 30: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)hj.dcos("ddkf", dcoo(int ), (int)49);
                    if (!var6_2) ** GOTO lbl174
                    throw null;
                }
            }
lbl201:
            // 4 sources

            case 31: {
                var5_3 /* !! */  = (int)hj.dcos("ddkg", dcoo(int ), (int)50);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl210
            }
lbl206:
            // 5 sources

            case 32: {
                var5_3 /* !! */  = (int)hj.dcos("ddkh", dcoo(int ), (int)51);
                if (!var6_2) ** GOTO lbl170
                throw null;
            }
lbl210:
            // 3 sources

            case 33: {
                var5_3 /* !! */  = (int)hj.dcos("ddki", dcoo(int ), (int)52);
                if (!var6_2) ** GOTO lbl196
                throw null;
            }
            case 34: {
                var5_3 /* !! */  = (int)hj.dcos("ddkj", dcoo(int ), (int)53);
                if (!var6_2) ** GOTO lbl206
                throw null;
            }
lbl218:
            // 3 sources

            case 35: {
                var5_3 /* !! */  = (int)hj.dcos("ddkk", dcoo(int ), (int)54);
                if (!var6_2) ** GOTO lbl206
                throw null;
            }
lbl222:
            // 2 sources

            case 36: {
                var5_3 /* !! */  = (int)hj.dcos("ddkl", dcoo(int ), (int)55);
                if (!var6_2) ** GOTO lbl170
                throw null;
            }
            case 37: 
        }
        var5_3 /* !! */  = (int)hj.dcos("ddkm", dcoo(int ), (int)56);
        ** while (!var6_2)
lbl229:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dgks() {
        hj.dcop[500] = 490660938;
        hj.dcop[501] = 648090997;
        hj.dcop[502] = -135996328;
        hj.dcop[503] = -1672378303;
        hj.dcop[504] = -2094827765;
        hj.dcop[505] = -1888631208;
        hj.dcop[506] = 1966652541;
        hj.dcop[507] = 671466130;
        hj.dcop[508] = 754117907;
        hj.dcop[509] = -1922609202;
        hj.dcop[510] = 1974240407;
        hj.dcop[511] = 3672256;
        hj.dcop[512] = 1604853034;
        hj.dcop[513] = 44836602;
        hj.dcop[514] = -975942777;
        hj.dcop[515] = 426164061;
        hj.dcop[516] = -1939784406;
        hj.dcop[517] = -1277814504;
        hj.dcop[518] = -1226935284;
        hj.dcop[519] = 1954280607;
        hj.dcop[520] = 903506827;
        hj.dcop[521] = -1450244490;
        hj.dcop[522] = 710582462;
        hj.dcop[523] = -1574720217;
        hj.dcop[524] = 600842546;
        hj.dcop[525] = 905541389;
        hj.dcop[526] = -1001341366;
        hj.dcop[527] = -1856572904;
        hj.dcop[528] = 1680937952;
        hj.dcop[529] = 521054306;
        hj.dcop[530] = -427712979;
        hj.dcop[531] = 25796038;
        hj.dcop[532] = -433625595;
        hj.dcop[533] = 124593998;
        hj.dcop[534] = -1233246702;
        hj.dcop[535] = 542904018;
        hj.dcop[536] = 508765151;
        hj.dcop[537] = 258719915;
        hj.dcop[538] = 407782338;
        hj.dcop[539] = -2088919067;
        hj.dcop[540] = -224238124;
        hj.dcop[541] = -1427990371;
        hj.dcop[542] = 5234658;
        hj.dcop[543] = -463752536;
        hj.dcop[544] = -585700961;
        hj.dcop[545] = -1041925508;
        hj.dcop[546] = 393203786;
        hj.dcop[547] = -1683068310;
        hj.dcop[548] = -2125363080;
        hj.dcop[549] = 663353588;
        hj.dcop[550] = -2125715265;
        hj.dcop[551] = -348447986;
        hj.dcop[552] = -637283669;
        hj.dcop[553] = -1983162812;
        hj.dcop[554] = -797526829;
        hj.dcop[555] = -1482045391;
        hj.dcop[556] = -2031917320;
        hj.dcop[557] = -402427420;
        hj.dcop[558] = 617098600;
        hj.dcop[559] = -1013099154;
        hj.dcop[560] = 1949985058;
        hj.dcop[561] = -1362445964;
        hj.dcop[562] = 1089312104;
        hj.dcop[563] = -1550636777;
        hj.dcop[564] = 1402838984;
        hj.dcop[565] = 679174328;
        hj.dcop[566] = 931324913;
        hj.dcop[567] = -1498659960;
        hj.dcop[568] = -1027601120;
        hj.dcop[569] = 1165747036;
        hj.dcop[570] = 1104935108;
        hj.dcop[571] = -200908801;
        hj.dcop[572] = 451354569;
        hj.dcop[573] = -1823449810;
        hj.dcop[574] = -212856044;
        hj.dcop[575] = 1501939042;
        hj.dcop[576] = -269101467;
        hj.dcop[577] = 532297115;
        hj.dcop[578] = -1200609336;
        hj.dcop[579] = -1325696947;
        hj.dcop[580] = 358822747;
        hj.dcop[581] = 503078957;
        hj.dcop[582] = -1948434400;
        hj.dcop[583] = 1102708641;
        hj.dcop[584] = -1888226817;
        hj.dcop[585] = -442848317;
        hj.dcop[586] = -2098985419;
        hj.dcop[587] = 133564531;
        hj.dcop[588] = 1678944933;
        hj.dcop[589] = -499813535;
        hj.dcop[590] = 671668427;
        hj.dcop[591] = 1099675489;
        hj.dcop[592] = 63665838;
        hj.dcop[593] = 15547102;
        hj.dcop[594] = 1583217318;
        hj.dcop[595] = -1432618804;
        hj.dcop[596] = -915206926;
        hj.dcop[597] = -1715918214;
        hj.dcop[598] = -1840124595;
        hj.dcop[599] = 1817215550;
    }

    private static /* synthetic */ void dglk() {
        hj.ddko[100] = -2715006946056091786L;
        hj.ddko[101] = 3113167425590555374L;
        hj.ddko[102] = -9185200032438882517L;
        hj.ddko[103] = -8418380071066684756L;
        hj.ddko[104] = 4051947375096671718L;
        hj.ddko[105] = -525166602613469679L;
        hj.ddko[106] = 1762777113057147115L;
        hj.ddko[107] = -7199820743642760371L;
        hj.ddko[108] = -5412980132349394852L;
        hj.ddko[109] = -995586800392508528L;
        hj.ddko[110] = 2216566922912952978L;
        hj.ddko[111] = 74052368004313482L;
        hj.ddko[112] = -5732788989258360812L;
        hj.ddko[113] = 5949730615183414457L;
        hj.ddko[114] = 7228695125244985033L;
        hj.ddko[115] = -5531175006967926266L;
        hj.ddko[116] = -6490326905983345147L;
        hj.ddko[117] = 2090814784539445275L;
        hj.ddko[118] = 8644125984346880447L;
        hj.ddko[119] = -2093611636836212881L;
        hj.ddko[120] = -2856188860709941127L;
        hj.ddko[121] = 8844297531292418972L;
        hj.ddko[122] = -8539348469372528254L;
        hj.ddko[123] = 3955870662028531567L;
        hj.ddko[124] = -5404553167551537791L;
        hj.ddko[125] = -447681919011712007L;
        hj.ddko[126] = 6659776891817778093L;
        hj.ddko[127] = 9117784715416198242L;
        hj.ddko[128] = 2019873073174749688L;
        hj.ddko[129] = 8209137898717833512L;
        hj.ddko[130] = -4035713230900720523L;
        hj.ddko[131] = 6200144460264146044L;
        hj.ddko[132] = -6650916608834408760L;
        hj.ddko[133] = -3358563131949812710L;
        hj.ddko[134] = -3841436690042144041L;
        hj.ddko[135] = -8091920018990072614L;
        hj.ddko[136] = -2234717018186569198L;
        hj.ddko[137] = 5677381020838179250L;
        hj.ddko[138] = -8126451730022176648L;
        hj.ddko[139] = 6534544393778361360L;
        hj.ddko[140] = -4413873541299380069L;
        hj.ddko[141] = 4282089597102565962L;
        hj.ddko[142] = 6904428134368475867L;
        hj.ddko[143] = -1518914375059046624L;
        hj.ddko[144] = -6418768094756010881L;
        hj.ddko[145] = 4419796768853628L;
        hj.ddko[146] = 1633600442649787171L;
        hj.ddko[147] = -740712733685060401L;
        hj.ddko[148] = 5925893858846903282L;
        hj.ddko[149] = -4056827869512703462L;
        hj.ddko[150] = -4413561502511011731L;
        hj.ddko[151] = -9015856480450417911L;
        hj.ddko[152] = 3722744602030766636L;
        hj.ddko[153] = -3368334270163247122L;
        hj.ddko[154] = -6605077554799072703L;
        hj.ddko[155] = 3346615861505831822L;
        hj.ddko[156] = -6924114673343740414L;
        hj.ddko[157] = -5385202002658248636L;
        hj.ddko[158] = -2807272181498929129L;
        hj.ddko[159] = -136881207291354703L;
        hj.ddko[160] = -4487563421435515926L;
        hj.ddko[161] = 5943113197840962245L;
        hj.ddko[162] = -6250760777345066365L;
        hj.ddko[163] = 5545014448461566329L;
        hj.ddko[164] = -7706426754106700188L;
        hj.ddko[165] = -8288574895869490775L;
        hj.ddko[166] = -7529763381673109341L;
        hj.ddko[167] = -6692660159573902704L;
        hj.ddko[168] = 929194420050078476L;
        hj.ddko[169] = 6146277131352080860L;
        hj.ddko[170] = 3786896966562007224L;
        hj.ddko[171] = 7592152786309239395L;
        hj.ddko[172] = 2868595585283783107L;
        hj.ddko[173] = -6854942670557555861L;
        hj.ddko[174] = 5362750537609025187L;
        hj.ddko[175] = -2349492163914804222L;
        hj.ddko[176] = -4545470799622444343L;
        hj.ddko[177] = -1045635428172176097L;
        hj.ddko[178] = 8765754370141095926L;
        hj.ddko[179] = 6205018030529303352L;
        hj.ddko[180] = 7986162333604957798L;
        hj.ddko[181] = -6549994457063750185L;
        hj.ddko[182] = -1188028958305710471L;
        hj.ddko[183] = -7225023513867645995L;
        hj.ddko[184] = 4900651494010778033L;
        hj.ddko[185] = -8654786351704381316L;
        hj.ddko[186] = 8120951353459431268L;
        hj.ddko[187] = 369732675121862339L;
        hj.ddko[188] = -4067297505072449420L;
        hj.ddko[189] = 6630260987024487362L;
        hj.ddko[190] = 7415329150400862323L;
        hj.ddko[191] = 7539246455745548806L;
        hj.ddko[192] = -3759971893055109002L;
        hj.ddko[193] = 7175629562154995823L;
        hj.ddko[194] = -1940356269013099706L;
        hj.ddko[195] = 2675675036413350279L;
        hj.ddko[196] = 919015275032485650L;
        hj.ddko[197] = -7154543498937035178L;
        hj.ddko[198] = -3320123880709857008L;
        hj.ddko[199] = 2688093605881335043L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void validateSelections() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hj.he - hj.dcos("ddys", ddkn(int ), (int)148)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hj.dcos("ddyt", dcoo(int ), (int)275)) break;
            v0 /* !! */  = (long)hj.dcos("ddyu", dcoo(int ), (int)276);
        }
        var4_1 = hj.c;
        v1 /* !! */  = hj.he;
        if (true) ** GOTO lbl12
        block31: while (true) {
            v1 /* !! */  = (long)(hj.dcos("ddyw", ddkn(int ), (int)150) - hj.dcos("ddyv", ddkn(int ), (int)149));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 27539926: {
                    break block31;
                }
                case 1711720980: {
                    continue block31;
                }
            }
            break;
        }
        var3_2 /* !! */  = hj.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = hj.he - hj.dcos("ddyx", ddkn(int ), (int)151)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hj.dcos("ddyy", dcoo(int ), (int)277)) break;
            v2 /* !! */  = (long)hj.dcos("ddyz", dcoo(int ), (int)278);
        }
        var2_3 = hj.a;
        if (var4_1) {
            throw null;
lbl27:
            // 10 sources

            return;
        }
        if (var2_3 || var2_3) ** GOTO lbl27
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var1_4 = hj.dcos("ddza", dcoo(int ), (int)279);
                if (var2_3) ** GOTO lbl27
                do {
                    if (var2_3 || var2_3) ** GOTO lbl27
                    while (true) {
                        if ((v3 = (cfr_temp_2 = hj.he - hj.dcos("ddzb", ddkn(int ), (int)152)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v3 == hj.dcos("ddzc", dcoo(int ), (int)280)) break;
                        v3 = -1548469440;
                    }
                    if (var1_4 >= this.selectedPotions.length) ** GOTO lbl101
                    if (var2_3 || var2_3) ** GOTO lbl27
                    while (true) {
                        if ((v4 /* !! */  = (cfr_temp_3 = hj.he - hj.dcos("ddzd", ddkn(int ), (int)153)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v4 /* !! */  == hj.dcos("ddze", dcoo(int ), (int)281)) break;
                        v4 /* !! */  = (long)hj.dcos("ddzf", dcoo(int ), (int)282);
                    }
                    v5 = this.selectedPotions[var1_4];
                    v6 /* !! */  = hj.he;
                    if (true) ** GOTO lbl56
                    block37: while (true) {
                        v6 /* !! */  = (long)(v7 - hj.dcos("ddzg", ddkn(int ), (int)154));
lbl56:
                        // 2 sources

                        switch ((int)v6 /* !! */ ) {
                            case -1250664248: {
                                v7 = hj.dcos("ddzh", ddkn(int ), (int)155);
                                continue block37;
                            }
                            case 27539926: {
                                break block37;
                            }
                            case 1719266744: {
                                v7 = hj.dcos("ddzi", ddkn(int ), (int)156);
                                continue block37;
                            }
                        }
                        break;
                    }
                    if (v5.method_7960()) ** GOTO lbl96
                    if (var2_3) ** GOTO lbl27
                    while (true) {
                        if ((v8 /* !! */  = (cfr_temp_4 = hj.he - hj.dcos("ddzj", ddkn(int ), (int)157)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v8 /* !! */  == hj.dcos("ddzk", dcoo(int ), (int)283)) break;
                        v8 /* !! */  = (long)hj.dcos("ddzl", dcoo(int ), (int)284);
                    }
                    v9 = this.selectedPotions[var1_4];
                    while (true) {
                        if ((v10 /* !! */  = (cfr_temp_5 = hj.he - hj.dcos("ddzm", ddkn(int ), (int)158)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v10 /* !! */  == hj.dcos("ddzn", dcoo(int ), (int)285)) break;
                        v10 /* !! */  = (long)hj.dcos("ddzo", dcoo(int ), (int)286);
                    }
                    if (this.findPotionSlot(v9) != hj.dcos("ddzp", dcoo(int ), (int)287)) ** GOTO lbl96
                    if (var2_3 || var2_3) ** GOTO lbl27
                    while (true) {
                        if ((v11 /* !! */  = (cfr_temp_6 = hj.he - hj.dcos("ddzq", ddkn(int ), (int)159)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v11 /* !! */  == hj.dcos("ddzr", dcoo(int ), (int)288)) break;
                        v11 /* !! */  = (long)hj.dcos("ddzs", dcoo(int ), (int)289);
                    }
                    while (true) {
                        if ((v12 = (cfr_temp_7 = hj.he - hj.dcos("ddzt", ddkn(int ), (int)160)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v12 == hj.dcos("ddzu", dcoo(int ), (int)290)) break;
                        v12 = 1317592302;
                    }
                    this.selectedPotions[var1_4] = class_1799.field_8037;
                    if (var2_3) ** GOTO lbl27
lbl96:
                    // 3 sources

                    if (var2_3 || var2_3) ** GOTO lbl27
                    ++var1_4;
                    if (var2_3) ** GOTO lbl27
                } while (!var4_1);
                throw null;
lbl101:
                // 1 sources

                if (!var2_3 && !var2_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_2 /* !! */  = (int)hj.dcos("ddzv", dcoo(int ), (int)291);
                if (var4_1) {
                    throw null;
                }
            }
lbl108:
            // 5 sources

            case 1: {
                var3_2 /* !! */  = (int)hj.dcos("ddzw", dcoo(int ), (int)292);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl166
            }
            case 2: {
                var3_2 /* !! */  = (int)hj.dcos("ddzx", dcoo(int ), (int)293);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl118:
            // 4 sources

            case 3: {
                var3_2 /* !! */  = (int)hj.dcos("ddzy", dcoo(int ), (int)294);
                if (!var4_1) ** GOTO lbl108
                throw null;
            }
            case 4: {
                var3_2 /* !! */  = (int)hj.dcos("ddzz", dcoo(int ), (int)295);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 5: {
                var3_2 /* !! */  = (int)hj.dcos("deaa", dcoo(int ), (int)296);
                if (!var4_1) ** GOTO lbl118
                throw null;
            }
lbl131:
            // 2 sources

            case 6: {
                var3_2 /* !! */  = (int)hj.dcos("deab", dcoo(int ), (int)297);
                if (!var4_1) ** GOTO lbl118
                throw null;
            }
lbl135:
            // 2 sources

            case 7: {
                var3_2 /* !! */  = (int)hj.dcos("deac", dcoo(int ), (int)298);
                if (!var4_1) ** GOTO lbl131
                throw null;
            }
            case 8: {
                var3_2 /* !! */  = (int)hj.dcos("dead", dcoo(int ), (int)299);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl162
            }
            case 9: {
                var3_2 /* !! */  = (int)hj.dcos("deae", dcoo(int ), (int)300);
                if (!var4_1) ** GOTO lbl118
                throw null;
            }
lbl148:
            // 2 sources

            case 10: {
                var3_2 /* !! */  = (int)hj.dcos("deaf", dcoo(int ), (int)301);
                if (!var4_1) ** GOTO lbl135
                throw null;
            }
lbl152:
            // 5 sources

            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)hj.dcos("deag", dcoo(int ), (int)302);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl178
                    break;
                }
            }
            case 12: {
                var3_2 /* !! */  = (int)hj.dcos("deah", dcoo(int ), (int)303);
                if (!var4_1) ** GOTO lbl108
                throw null;
            }
lbl162:
            // 3 sources

            case 13: {
                var3_2 /* !! */  = (int)hj.dcos("deai", dcoo(int ), (int)304);
                if (!var4_1) ** GOTO lbl152
                throw null;
            }
lbl166:
            // 2 sources

            case 14: {
                var3_2 /* !! */  = (int)hj.dcos("deaj", dcoo(int ), (int)305);
                if (!var4_1) break;
                throw null;
            }
            case 15: {
                var3_2 /* !! */  = (int)hj.dcos("deak", dcoo(int ), (int)306);
                if (!var4_1) ** GOTO lbl148
                throw null;
            }
            case 16: {
                var3_2 /* !! */  = (int)hj.dcos("deal", dcoo(int ), (int)307);
                if (!var4_1) ** GOTO lbl152
                throw null;
            }
lbl178:
            // 2 sources

            case 17: {
                var3_2 /* !! */  = (int)hj.dcos("deam", dcoo(int ), (int)308);
                if (!var4_1) ** GOTO lbl162
                throw null;
            }
            case 18: 
        }
        var3_2 /* !! */  = (int)hj.dcos("dean", dcoo(int ), (int)309);
        ** while (!var4_1)
lbl185:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int dcoo(int n2) {
        return dcop[n2] ^ dcoq[n2];
    }

    private static /* synthetic */ double dfix(int n2) {
        return Double.longBitsToDouble(ddko[n2] ^ ddkp[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        v0 /* !! */  = hj.he;
        if (true) ** GOTO lbl5
        block32: while (true) {
            v0 /* !! */  = (long)(v1 - hj.dcos("ddkq", ddkn(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 27539926: {
                    break block32;
                }
                case 45675704: {
                    v1 = hj.dcos("ddkr", ddkn(int ), (int)1);
                    continue block32;
                }
                case 1266299033: {
                    v1 = hj.dcos("ddks", ddkn(int ), (int)2);
                    continue block32;
                }
                case 1678772757: {
                    v1 = hj.dcos("ddkt", ddkn(int ), (int)3);
                    continue block32;
                }
            }
            break;
        }
        var4_2 = hj.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hj.he - hj.dcos("ddku", ddkn(int ), (int)4)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hj.dcos("ddkv", dcoo(int ), (int)57)) break;
            v2 /* !! */  = (long)hj.dcos("ddkw", dcoo(int ), (int)58);
        }
        var3_3 /* !! */  = hj.b;
        v3 /* !! */  = hj.he;
        if (true) ** GOTO lbl29
        block34: while (true) {
            v3 /* !! */  = (long)(v4 - hj.dcos("ddkx", ddkn(int ), (int)5));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 27539926: {
                    break block34;
                }
                case 116131479: {
                    v4 = hj.dcos("ddky", ddkn(int ), (int)6);
                    continue block34;
                }
                case 152010072: {
                    v4 = hj.dcos("ddkz", ddkn(int ), (int)7);
                    continue block34;
                }
            }
            break;
        }
        var2_4 = hj.a;
        if (var4_2) {
            throw null;
lbl41:
            // 4 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl41
        v5 /* !! */  = hj.he;
        if (true) ** GOTO lbl48
        block36: while (true) {
            v5 /* !! */  = (long)(v6 - hj.dcos("ddla", ddkn(int ), (int)8));
lbl48:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1261937791: {
                    v6 = hj.dcos("ddlb", ddkn(int ), (int)9);
                    continue block36;
                }
                case -998294622: {
                    v6 = hj.dcos("ddlc", ddkn(int ), (int)10);
                    continue block36;
                }
                case 27539926: {
                    break block36;
                }
                case 414961440: {
                    v6 = hj.dcos("ddld", ddkn(int ), (int)11);
                    continue block36;
                }
            }
            break;
        }
        this.processPendingInventoryThrow();
        if (var2_4) ** GOTO lbl41
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block17 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl41
                v7 /* !! */  = hj.he;
                if (true) ** GOTO lbl70
                block37: while (true) {
                    v7 /* !! */  = (long)(v8 - hj.dcos("ddle", ddkn(int ), (int)12));
lbl70:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -362622871: {
                            v8 = hj.dcos("ddlf", ddkn(int ), (int)13);
                            continue block37;
                        }
                        case 27539926: {
                            break block37;
                        }
                        case 1627739712: {
                            v8 = hj.dcos("ddlg", ddkn(int ), (int)14);
                            continue block37;
                        }
                    }
                    break;
                }
                this.processWorldPotionDebug();
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl83:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)hj.dcos("ddlh", dcoo(int ), (int)59);
                if (var4_2) {
                    throw null;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)hj.dcos("ddli", dcoo(int ), (int)60);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl109
            }
            case 2: {
                var3_3 /* !! */  = (int)hj.dcos("ddlj", dcoo(int ), (int)61);
                if (!var4_2) ** GOTO lbl83
                throw null;
            }
lbl96:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)hj.dcos("ddlk", dcoo(int ), (int)62);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl105
            }
            case 4: {
                var3_3 /* !! */  = (int)hj.dcos("ddll", dcoo(int ), (int)63);
                if (!var4_2) ** GOTO lbl96
                throw null;
            }
lbl105:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)hj.dcos("ddlm", dcoo(int ), (int)64);
                if (var4_2) {
                    throw null;
                }
            }
lbl109:
            // 4 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hj.dcos("ddln", dcoo(int ), (int)65);
                    if (!var4_2) break block17;
                    throw null;
                }
            }
            case 7: 
        }
        var3_3 /* !! */  = (int)hj.dcos("ddlo", dcoo(int ), (int)66);
        ** while (!var4_2)
lbl117:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dgkw() {
        hj.dcop[900] = 1653836411;
        hj.dcop[901] = 1765918040;
        hj.dcop[902] = 1778425647;
        hj.dcop[903] = -937678843;
        hj.dcop[904] = 1589570839;
        hj.dcop[905] = 780822225;
        hj.dcop[906] = 1109956387;
        hj.dcop[907] = -398853849;
        hj.dcop[908] = -200091536;
        hj.dcop[909] = 294080195;
        hj.dcop[910] = -1007352489;
        hj.dcop[911] = 986555929;
        hj.dcop[912] = 1345663176;
        hj.dcop[913] = -560940456;
        hj.dcop[914] = 2115516158;
        hj.dcop[915] = -399713183;
        hj.dcop[916] = 1837871802;
        hj.dcop[917] = -1787757143;
        hj.dcop[918] = 1094656779;
        hj.dcop[919] = 1086193656;
        hj.dcop[920] = 1506790248;
        hj.dcop[921] = 1865465684;
        hj.dcop[922] = -1835456479;
        hj.dcop[923] = -1263065335;
        hj.dcop[924] = 1314799141;
        hj.dcop[925] = 2134548353;
        hj.dcop[926] = 74216567;
        hj.dcop[927] = 1436667909;
        hj.dcop[928] = 16556953;
        hj.dcop[929] = 646212672;
        hj.dcop[930] = 132843879;
        hj.dcop[931] = -1243650761;
        hj.dcop[932] = 2146580993;
        hj.dcop[933] = 1127599704;
        hj.dcop[934] = -360288141;
        hj.dcop[935] = -613937050;
        hj.dcop[936] = -2004838152;
        hj.dcop[937] = 470887770;
        hj.dcop[938] = -1518031369;
        hj.dcop[939] = -749657650;
        hj.dcop[940] = 197993973;
        hj.dcop[941] = 2110463857;
        hj.dcop[942] = -698558665;
        hj.dcop[943] = -1742878365;
        hj.dcop[944] = 729851356;
        hj.dcop[945] = -596836078;
        hj.dcop[946] = 1412717059;
        hj.dcop[947] = -111070037;
        hj.dcop[948] = 1621515437;
        hj.dcop[949] = -1104501922;
        hj.dcop[950] = -294435094;
        hj.dcop[951] = 1979438589;
        hj.dcop[952] = -176179874;
        hj.dcop[953] = 1439045551;
        hj.dcop[954] = -205687918;
        hj.dcop[955] = -348157942;
        hj.dcop[956] = -205831725;
        hj.dcop[957] = 81924808;
        hj.dcop[958] = 1123313931;
        hj.dcop[959] = 1155527144;
        hj.dcop[960] = 1205727147;
        hj.dcop[961] = 804903432;
        hj.dcop[962] = -1926410473;
        hj.dcop[963] = -554672018;
        hj.dcop[964] = 597619601;
        hj.dcop[965] = 725698738;
        hj.dcop[966] = -1444401219;
        hj.dcop[967] = 762006838;
        hj.dcop[968] = -1075728245;
        hj.dcop[969] = 1536540064;
        hj.dcop[970] = -724978249;
        hj.dcop[971] = 1171354488;
        hj.dcop[972] = -20338901;
        hj.dcop[973] = 2030913697;
        hj.dcop[974] = 1252190857;
        hj.dcop[975] = -1189155652;
        hj.dcop[976] = -2146435663;
        hj.dcop[977] = -1716053090;
        hj.dcop[978] = -1579176950;
        hj.dcop[979] = -32645168;
        hj.dcop[980] = 660970311;
        hj.dcop[981] = -513862285;
        hj.dcop[982] = -321637353;
        hj.dcop[983] = 894346069;
        hj.dcop[984] = 2100444774;
        hj.dcop[985] = 116705743;
        hj.dcop[986] = -991386229;
        hj.dcop[987] = 1230341587;
        hj.dcop[988] = -89506618;
        hj.dcop[989] = 1521596783;
        hj.dcop[990] = 93386432;
        hj.dcop[991] = 1519045473;
        hj.dcop[992] = -858792617;
        hj.dcop[993] = -935486897;
        hj.dcop[994] = -1584615870;
        hj.dcop[995] = 1132256851;
        hj.dcop[996] = -1802254526;
        hj.dcop[997] = 1217286511;
        hj.dcop[998] = -280494651;
        hj.dcop[999] = -1780701173;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void refreshPotionStack(hj$TrackedSplashPotion var1_1) {
        block64: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = hj.he - hj.dcos("dfmz", ddkn(int ), (int)346)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == hj.dcos("dfna", dcoo(int ), (int)767)) break;
                v0 /* !! */  = (long)hj.dcos("dfnb", dcoo(int ), (int)768);
            }
            var6_2 = hj.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = hj.he - hj.dcos("dfnc", ddkn(int ), (int)347)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == hj.dcos("dfnd", dcoo(int ), (int)769)) break;
                v1 /* !! */  = (long)hj.dcos("dfne", dcoo(int ), (int)770);
            }
            var5_3 /* !! */  = hj.b;
            v2 /* !! */  = hj.he;
            if (true) ** GOTO lbl17
            block39: while (true) {
                v2 /* !! */  = (long)(hj.dcos("dfng", ddkn(int ), (int)349) - hj.dcos("dfnf", ddkn(int ), (int)348));
lbl17:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1960682976: {
                        continue block39;
                    }
                    case 27539926: {
                        break block39;
                    }
                }
                break;
            }
            var4_4 = hj.a;
            if (var6_2) {
                throw null;
lbl25:
                // 11 sources

                return;
            }
            if (var4_4 || var4_4) ** GOTO lbl25
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_2 = hj.he - hj.dcos("dfnh", ddkn(int ), (int)350)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == hj.dcos("dfni", dcoo(int ), (int)771)) break;
                v3 /* !! */  = (long)hj.dcos("dfnj", dcoo(int ), (int)772);
            }
            v4 = var1_1.entity;
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_3 = hj.he - hj.dcos("dfnk", ddkn(int ), (int)351)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == hj.dcos("dfnl", dcoo(int ), (int)773)) break;
                v5 /* !! */  = (long)hj.dcos("dfnm", dcoo(int ), (int)774);
            }
            var2_5 = v4.method_7495();
            if (var4_4 || var4_4) ** GOTO lbl25
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_4 = hj.he - hj.dcos("dfnn", ddkn(int ), (int)352)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == hj.dcos("dfno", dcoo(int ), (int)775)) break;
                v6 /* !! */  = (long)hj.dcos("dfnp", dcoo(int ), (int)776);
            }
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_5 = hj.he - hj.dcos("dfnq", ddkn(int ), (int)353)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v7 /* !! */  == hj.dcos("dfnr", dcoo(int ), (int)777)) break;
                v7 /* !! */  = (long)hj.dcos("dfns", dcoo(int ), (int)778);
            }
            var3_6 = (class_1844)var2_5.method_58694(class_9334.field_49651);
            if (var4_4 || var4_4) ** GOTO lbl25
            if (var3_6 == null) ** GOTO lbl128
            if (var4_4) ** GOTO lbl25
            v8 /* !! */  = hj.he;
            if (true) ** GOTO lbl59
            block45: while (true) {
                v8 /* !! */  = (long)(v9 - hj.dcos("dfnt", ddkn(int ), (int)354));
lbl59:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case -1335006198: {
                        v9 = hj.dcos("dfnu", ddkn(int ), (int)355);
                        continue block45;
                    }
                    case -1296014424: {
                        v9 = hj.dcos("dfnv", ddkn(int ), (int)356);
                        continue block45;
                    }
                    case 27539926: {
                        break block45;
                    }
                }
                break;
            }
            v10 = var3_6.comp_2378();
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_6 = hj.he - hj.dcos("dfnw", ddkn(int ), (int)357)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == hj.dcos("dfnx", dcoo(int ), (int)779)) break;
                v11 /* !! */  = (long)hj.dcos("dfny", dcoo(int ), (int)780);
            }
            if (v10.isPresent()) break block64;
            if (var4_4) ** GOTO lbl25
            v12 /* !! */  = hj.he;
            if (true) ** GOTO lbl80
            block47: while (true) {
                v12 /* !! */  = (long)(v13 - hj.dcos("dfnz", ddkn(int ), (int)358));
lbl80:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case -1052224339: {
                        v13 = hj.dcos("dfoa", ddkn(int ), (int)359);
                        continue block47;
                    }
                    case -742007085: {
                        v13 = hj.dcos("dfob", ddkn(int ), (int)360);
                        continue block47;
                    }
                    case 27539926: {
                        break block47;
                    }
                }
                break;
            }
            if (var3_6.method_57405()) break block64;
            if (var4_4) ** GOTO lbl25
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_7 = hj.he - hj.dcos("dfoc", ddkn(int ), (int)361)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  == hj.dcos("dfod", dcoo(int ), (int)781)) break;
                v14 /* !! */  = (long)hj.dcos("dfoe", dcoo(int ), (int)782);
            }
            v15 = var3_6.comp_2380();
            while (true) {
                if ((v16 /* !! */  = (cfr_temp_8 = hj.he - hj.dcos("dfof", ddkn(int ), (int)362)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v16 /* !! */  == hj.dcos("dfog", dcoo(int ), (int)783)) break;
                v16 /* !! */  = (long)hj.dcos("dfoh", dcoo(int ), (int)784);
            }
            if (v15.isEmpty()) ** GOTO lbl128
            if (var4_4) ** GOTO lbl25
        }
        if (var4_4) ** GOTO lbl25
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4) ** GOTO lbl25
                v17 = hj.dcos("dfoi", dcoo(int ), (int)785);
                v18 /* !! */  = hj.he;
                if (true) ** GOTO lbl115
                block50: while (true) {
                    v18 /* !! */  = (long)(hj.dcos("dfok", ddkn(int ), (int)364) - hj.dcos("dfoj", ddkn(int ), (int)363));
lbl115:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case 27539926: {
                            break block50;
                        }
                        case 1458993083: {
                            continue block50;
                        }
                    }
                    break;
                }
                v19 = var2_5.method_46651((int)v17);
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_9 = hj.he - hj.dcos("dfol", ddkn(int ), (int)365)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == hj.dcos("dfom", dcoo(int ), (int)786)) break;
                    v20 /* !! */  = (long)hj.dcos("dfon", dcoo(int ), (int)787);
                }
                var1_1.potion = v19;
                if (var4_4) ** GOTO lbl25
lbl128:
                // 3 sources

                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)hj.dcos("dfoo", dcoo(int ), (int)788);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl184
                    break;
                }
            }
lbl137:
            // 2 sources

            case 1: {
                var5_3 /* !! */  = (int)hj.dcos("dfop", dcoo(int ), (int)789);
                if (!var6_2) break;
                throw null;
            }
lbl141:
            // 4 sources

            case 2: {
                var5_3 /* !! */  = (int)hj.dcos("dfoq", dcoo(int ), (int)790);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl180
            }
lbl146:
            // 2 sources

            case 3: {
                var5_3 /* !! */  = (int)hj.dcos("dfor", dcoo(int ), (int)791);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl163
            }
lbl151:
            // 3 sources

            case 4: {
                var5_3 /* !! */  = (int)hj.dcos("dfos", dcoo(int ), (int)792);
                if (var6_2) {
                    throw null;
                }
            }
            case 5: {
                var5_3 /* !! */  = (int)hj.dcos("dfot", dcoo(int ), (int)793);
                if (!var6_2) ** GOTO lbl151
                throw null;
            }
lbl159:
            // 4 sources

            case 6: {
                var5_3 /* !! */  = (int)hj.dcos("dfou", dcoo(int ), (int)794);
                if (!var6_2) ** GOTO lbl141
                throw null;
            }
lbl163:
            // 2 sources

            case 7: {
                var5_3 /* !! */  = (int)hj.dcos("dfov", dcoo(int ), (int)795);
                if (!var6_2) ** GOTO lbl146
                throw null;
            }
            case 8: {
                var5_3 /* !! */  = (int)hj.dcos("dfow", dcoo(int ), (int)796);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl184
            }
            case 9: {
                var5_3 /* !! */  = (int)hj.dcos("dfox", dcoo(int ), (int)797);
                if (!var6_2) ** GOTO lbl159
                throw null;
            }
            case 10: {
                var5_3 /* !! */  = (int)hj.dcos("dfoy", dcoo(int ), (int)798);
                if (!var6_2) ** GOTO lbl159
                throw null;
            }
lbl180:
            // 2 sources

            case 11: {
                var5_3 /* !! */  = (int)hj.dcos("dfoz", dcoo(int ), (int)799);
                if (!var6_2) ** GOTO lbl159
                throw null;
            }
lbl184:
            // 3 sources

            case 12: {
                var5_3 /* !! */  = (int)hj.dcos("dfpa", dcoo(int ), (int)800);
                if (!var6_2) ** GOTO lbl151
                throw null;
            }
            case 13: {
                var5_3 /* !! */  = (int)hj.dcos("dfpb", dcoo(int ), (int)801);
                if (!var6_2) ** GOTO lbl137
                throw null;
            }
            case 14: {
                var5_3 /* !! */  = (int)hj.dcos("dfpc", dcoo(int ), (int)802);
                if (!var6_2) ** GOTO lbl141
                throw null;
            }
            case 15: {
                var5_3 /* !! */  = (int)hj.dcos("dfpd", dcoo(int ), (int)803);
                if (!var6_2) ** GOTO lbl141
                throw null;
            }
            case 16: 
        }
        var5_3 /* !! */  = (int)hj.dcos("dfpe", dcoo(int ), (int)804);
        ** while (!var6_2)
lbl203:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dgkx() {
        hj.dcop[1000] = 523974064;
        hj.dcop[1001] = 829408813;
        hj.dcop[1002] = -615134585;
        hj.dcop[1003] = -826031614;
        hj.dcop[1004] = -596048366;
        hj.dcop[1005] = -968710348;
        hj.dcop[1006] = -1478607176;
        hj.dcop[1007] = -1065762172;
        hj.dcop[1008] = 608982805;
        hj.dcop[1009] = -1729852767;
        hj.dcop[1010] = 1692149994;
        hj.dcop[1011] = 313798176;
        hj.dcop[1012] = 1452523229;
        hj.dcop[1013] = 1436800068;
        hj.dcop[1014] = 265859682;
        hj.dcop[1015] = 2134802202;
        hj.dcop[1016] = -2066401957;
        hj.dcop[1017] = 639277620;
        hj.dcop[1018] = 1577688908;
        hj.dcop[1019] = 656777812;
        hj.dcop[1020] = -718629369;
        hj.dcop[1021] = 1475860676;
        hj.dcop[1022] = 1454646715;
        hj.dcop[1023] = -1481554575;
        hj.dcop[1024] = -2120705462;
        hj.dcop[1025] = 2128633599;
        hj.dcop[1026] = -1660649420;
        hj.dcop[1027] = 541866525;
        hj.dcop[1028] = -196619113;
        hj.dcop[1029] = 907738622;
    }

    private static /* synthetic */ void dgku() {
        hj.dcop[700] = -1438633249;
        hj.dcop[701] = 904613095;
        hj.dcop[702] = 1376248818;
        hj.dcop[703] = -830667246;
        hj.dcop[704] = 23262877;
        hj.dcop[705] = 1407361531;
        hj.dcop[706] = -1961879622;
        hj.dcop[707] = 1224571536;
        hj.dcop[708] = 1717989849;
        hj.dcop[709] = 1322338574;
        hj.dcop[710] = -737475023;
        hj.dcop[711] = 1658039428;
        hj.dcop[712] = 794323256;
        hj.dcop[713] = -2096147609;
        hj.dcop[714] = -755485801;
        hj.dcop[715] = 1523183114;
        hj.dcop[716] = -1232514110;
        hj.dcop[717] = 1879975457;
        hj.dcop[718] = 929416158;
        hj.dcop[719] = -1120220022;
        hj.dcop[720] = -503708610;
        hj.dcop[721] = -900633005;
        hj.dcop[722] = 1249843524;
        hj.dcop[723] = 1377434344;
        hj.dcop[724] = 648895072;
        hj.dcop[725] = -1885545533;
        hj.dcop[726] = -1526394628;
        hj.dcop[727] = 1255937997;
        hj.dcop[728] = 1477948317;
        hj.dcop[729] = 1357226066;
        hj.dcop[730] = -316834838;
        hj.dcop[731] = 1769480923;
        hj.dcop[732] = 923080110;
        hj.dcop[733] = 1627934007;
        hj.dcop[734] = 869979726;
        hj.dcop[735] = 240464783;
        hj.dcop[736] = -1997201977;
        hj.dcop[737] = -381380468;
        hj.dcop[738] = 450646058;
        hj.dcop[739] = 357550512;
        hj.dcop[740] = 1210970096;
        hj.dcop[741] = 1199168396;
        hj.dcop[742] = 606855740;
        hj.dcop[743] = -370403145;
        hj.dcop[744] = 1172607845;
        hj.dcop[745] = 718384970;
        hj.dcop[746] = -1959456694;
        hj.dcop[747] = -910479072;
        hj.dcop[748] = -279306368;
        hj.dcop[749] = -1159005591;
        hj.dcop[750] = 368399137;
        hj.dcop[751] = -130803139;
        hj.dcop[752] = -1800839258;
        hj.dcop[753] = 1008805587;
        hj.dcop[754] = 1958361536;
        hj.dcop[755] = -31483219;
        hj.dcop[756] = 371829568;
        hj.dcop[757] = -1521457793;
        hj.dcop[758] = 1517440692;
        hj.dcop[759] = 242326603;
        hj.dcop[760] = -1726658793;
        hj.dcop[761] = 112953823;
        hj.dcop[762] = 332969901;
        hj.dcop[763] = 732218540;
        hj.dcop[764] = -1445152184;
        hj.dcop[765] = -32240536;
        hj.dcop[766] = 477999667;
        hj.dcop[767] = -1880588518;
        hj.dcop[768] = -1072890245;
        hj.dcop[769] = -880266147;
        hj.dcop[770] = 1604830578;
        hj.dcop[771] = -1084673856;
        hj.dcop[772] = 1700068180;
        hj.dcop[773] = -1013140962;
        hj.dcop[774] = -76625729;
        hj.dcop[775] = 595630133;
        hj.dcop[776] = 506389462;
        hj.dcop[777] = -1583711913;
        hj.dcop[778] = -1871980273;
        hj.dcop[779] = -657187054;
        hj.dcop[780] = -1709269358;
        hj.dcop[781] = 1024893631;
        hj.dcop[782] = 2078426495;
        hj.dcop[783] = -985455818;
        hj.dcop[784] = -1655159213;
        hj.dcop[785] = 799959156;
        hj.dcop[786] = 2018719136;
        hj.dcop[787] = -1300826347;
        hj.dcop[788] = 696006264;
        hj.dcop[789] = -1145873351;
        hj.dcop[790] = 104699871;
        hj.dcop[791] = -1307084276;
        hj.dcop[792] = 1771411086;
        hj.dcop[793] = 212790118;
        hj.dcop[794] = 335622713;
        hj.dcop[795] = 1144344788;
        hj.dcop[796] = -1659738919;
        hj.dcop[797] = -1403033810;
        hj.dcop[798] = -1117507502;
        hj.dcop[799] = -1283785079;
    }

    private static /* synthetic */ void dglg() {
        hj.dcoq[800] = 1397289808;
        hj.dcoq[801] = -1563579005;
        hj.dcoq[802] = -1719160409;
        hj.dcoq[803] = 65555299;
        hj.dcoq[804] = 194890123;
        hj.dcoq[805] = -1065082977;
        hj.dcoq[806] = 1685274287;
        hj.dcoq[807] = 1599394971;
        hj.dcoq[808] = -1647827689;
        hj.dcoq[809] = -113565048;
        hj.dcoq[810] = -2018633456;
        hj.dcoq[811] = 79030844;
        hj.dcoq[812] = -514464066;
        hj.dcoq[813] = -542202914;
        hj.dcoq[814] = 102816527;
        hj.dcoq[815] = 56732577;
        hj.dcoq[816] = -1729068772;
        hj.dcoq[817] = 146843351;
        hj.dcoq[818] = 875371073;
        hj.dcoq[819] = -281213412;
        hj.dcoq[820] = 1944697969;
        hj.dcoq[821] = -1949753981;
        hj.dcoq[822] = 1502609800;
        hj.dcoq[823] = -377980462;
        hj.dcoq[824] = -1716493385;
        hj.dcoq[825] = 489919063;
        hj.dcoq[826] = 1786779196;
        hj.dcoq[827] = 358205667;
        hj.dcoq[828] = 1144663799;
        hj.dcoq[829] = -745576984;
        hj.dcoq[830] = 1875221671;
        hj.dcoq[831] = 131003597;
        hj.dcoq[832] = -1586397480;
        hj.dcoq[833] = -29383434;
        hj.dcoq[834] = -1383051337;
        hj.dcoq[835] = -982962671;
        hj.dcoq[836] = -1920287368;
        hj.dcoq[837] = 1279507116;
        hj.dcoq[838] = -976986130;
        hj.dcoq[839] = 723819031;
        hj.dcoq[840] = -770803586;
        hj.dcoq[841] = 425886501;
        hj.dcoq[842] = -811340387;
        hj.dcoq[843] = 345342514;
        hj.dcoq[844] = -78024112;
        hj.dcoq[845] = -619296873;
        hj.dcoq[846] = 1450039617;
        hj.dcoq[847] = -1674952102;
        hj.dcoq[848] = -684012148;
        hj.dcoq[849] = 2005653731;
        hj.dcoq[850] = 2123868205;
        hj.dcoq[851] = 1860968481;
        hj.dcoq[852] = -1511790409;
        hj.dcoq[853] = 1058825242;
        hj.dcoq[854] = -1860416823;
        hj.dcoq[855] = 2114520461;
        hj.dcoq[856] = -1832704425;
        hj.dcoq[857] = 1463980606;
        hj.dcoq[858] = 339661653;
        hj.dcoq[859] = 1434966501;
        hj.dcoq[860] = -1784606593;
        hj.dcoq[861] = -654993456;
        hj.dcoq[862] = 1937778260;
        hj.dcoq[863] = 1364175291;
        hj.dcoq[864] = -800064891;
        hj.dcoq[865] = -1448556942;
        hj.dcoq[866] = 2088326494;
        hj.dcoq[867] = -2027238611;
        hj.dcoq[868] = 1799850488;
        hj.dcoq[869] = -8383283;
        hj.dcoq[870] = -645901516;
        hj.dcoq[871] = 1394704998;
        hj.dcoq[872] = -373597488;
        hj.dcoq[873] = -26558284;
        hj.dcoq[874] = -1797565164;
        hj.dcoq[875] = -281286037;
        hj.dcoq[876] = -1963248921;
        hj.dcoq[877] = -1555861623;
        hj.dcoq[878] = -1497860785;
        hj.dcoq[879] = -1703729644;
        hj.dcoq[880] = 954103976;
        hj.dcoq[881] = 1512534239;
        hj.dcoq[882] = 90467096;
        hj.dcoq[883] = -124379817;
        hj.dcoq[884] = 1357111557;
        hj.dcoq[885] = 204277601;
        hj.dcoq[886] = 731147165;
        hj.dcoq[887] = 1986415308;
        hj.dcoq[888] = 315197614;
        hj.dcoq[889] = 817552369;
        hj.dcoq[890] = 1766099035;
        hj.dcoq[891] = 1316314476;
        hj.dcoq[892] = -353309569;
        hj.dcoq[893] = -297730285;
        hj.dcoq[894] = 166534830;
        hj.dcoq[895] = 76853916;
        hj.dcoq[896] = 472216889;
        hj.dcoq[897] = -1489625972;
        hj.dcoq[898] = -1410913113;
        hj.dcoq[899] = -885789590;
    }

    private static /* synthetic */ void dgla() {
        hj.dcoq[200] = -549131943;
        hj.dcoq[201] = 1616630769;
        hj.dcoq[202] = 1300656083;
        hj.dcoq[203] = -113773212;
        hj.dcoq[204] = 278114386;
        hj.dcoq[205] = -191094137;
        hj.dcoq[206] = -1317523512;
        hj.dcoq[207] = 399050505;
        hj.dcoq[208] = 1044751573;
        hj.dcoq[209] = 941625631;
        hj.dcoq[210] = -803655327;
        hj.dcoq[211] = -1368642574;
        hj.dcoq[212] = -1755348197;
        hj.dcoq[213] = 724309202;
        hj.dcoq[214] = 1795101397;
        hj.dcoq[215] = -1128366942;
        hj.dcoq[216] = 883511149;
        hj.dcoq[217] = -1071730703;
        hj.dcoq[218] = -794915921;
        hj.dcoq[219] = 1716663314;
        hj.dcoq[220] = -811767875;
        hj.dcoq[221] = -1730359619;
        hj.dcoq[222] = -51272105;
        hj.dcoq[223] = -1536502647;
        hj.dcoq[224] = 402360361;
        hj.dcoq[225] = -1453165244;
        hj.dcoq[226] = -932613517;
        hj.dcoq[227] = -566490519;
        hj.dcoq[228] = -1839175459;
        hj.dcoq[229] = 1557602635;
        hj.dcoq[230] = 1531595123;
        hj.dcoq[231] = -395166762;
        hj.dcoq[232] = 322482750;
        hj.dcoq[233] = -1465512064;
        hj.dcoq[234] = -43360295;
        hj.dcoq[235] = 418180202;
        hj.dcoq[236] = -1035192900;
        hj.dcoq[237] = -727110013;
        hj.dcoq[238] = 572533215;
        hj.dcoq[239] = 1048753143;
        hj.dcoq[240] = -1212696257;
        hj.dcoq[241] = -1026471476;
        hj.dcoq[242] = 168448026;
        hj.dcoq[243] = -1975271315;
        hj.dcoq[244] = 1670537578;
        hj.dcoq[245] = 1452319622;
        hj.dcoq[246] = -57474745;
        hj.dcoq[247] = -757306519;
        hj.dcoq[248] = -134488875;
        hj.dcoq[249] = -557940630;
        hj.dcoq[250] = 1671019202;
        hj.dcoq[251] = 1718434520;
        hj.dcoq[252] = -649478473;
        hj.dcoq[253] = -1615526649;
        hj.dcoq[254] = -2035553609;
        hj.dcoq[255] = -1842868033;
        hj.dcoq[256] = -1490922132;
        hj.dcoq[257] = 463556710;
        hj.dcoq[258] = 1317344300;
        hj.dcoq[259] = 786946887;
        hj.dcoq[260] = 1730668347;
        hj.dcoq[261] = -1616035838;
        hj.dcoq[262] = 1791540973;
        hj.dcoq[263] = -1384303064;
        hj.dcoq[264] = 806569543;
        hj.dcoq[265] = 1639572610;
        hj.dcoq[266] = -1035525630;
        hj.dcoq[267] = -250071598;
        hj.dcoq[268] = 1709453959;
        hj.dcoq[269] = -692995621;
        hj.dcoq[270] = -593812900;
        hj.dcoq[271] = -2121132550;
        hj.dcoq[272] = 1921901868;
        hj.dcoq[273] = -1310673091;
        hj.dcoq[274] = -1076475861;
        hj.dcoq[275] = 562224889;
        hj.dcoq[276] = 2109868420;
        hj.dcoq[277] = -178153724;
        hj.dcoq[278] = -731753863;
        hj.dcoq[279] = -348923177;
        hj.dcoq[280] = 928292198;
        hj.dcoq[281] = -395979136;
        hj.dcoq[282] = -891800407;
        hj.dcoq[283] = 943453243;
        hj.dcoq[284] = -1743819096;
        hj.dcoq[285] = 1558661309;
        hj.dcoq[286] = -626060992;
        hj.dcoq[287] = 812124152;
        hj.dcoq[288] = 1018131209;
        hj.dcoq[289] = 1945599527;
        hj.dcoq[290] = -982520415;
        hj.dcoq[291] = -196541808;
        hj.dcoq[292] = 1863191554;
        hj.dcoq[293] = -1182277209;
        hj.dcoq[294] = 762933438;
        hj.dcoq[295] = -976244185;
        hj.dcoq[296] = 1267927007;
        hj.dcoq[297] = -1851235328;
        hj.dcoq[298] = -2053914933;
        hj.dcoq[299] = 837852888;
    }

    private static /* synthetic */ void dgli() {
        hj.dcoq[1000] = 523974064;
        hj.dcoq[1001] = 829408809;
        hj.dcoq[1002] = -615134581;
        hj.dcoq[1003] = -826031613;
        hj.dcoq[1004] = -1002187429;
        hj.dcoq[1005] = -968710347;
        hj.dcoq[1006] = -1160580736;
        hj.dcoq[1007] = -1065762172;
        hj.dcoq[1008] = 608982804;
        hj.dcoq[1009] = -1729852768;
        hj.dcoq[1010] = 1692149994;
        hj.dcoq[1011] = 313798180;
        hj.dcoq[1012] = 1452523230;
        hj.dcoq[1013] = 1436800071;
        hj.dcoq[1014] = 265859683;
        hj.dcoq[1015] = 2134802202;
        hj.dcoq[1016] = -2066401959;
        hj.dcoq[1017] = 639277620;
        hj.dcoq[1018] = 1577688910;
        hj.dcoq[1019] = 656777808;
        hj.dcoq[1020] = -718629370;
        hj.dcoq[1021] = 1345187528;
        hj.dcoq[1022] = 1454646714;
        hj.dcoq[1023] = -399915459;
        hj.dcoq[1024] = -2120705461;
        hj.dcoq[1025] = -495706016;
        hj.dcoq[1026] = -1660649420;
        hj.dcoq[1027] = 541866524;
        hj.dcoq[1028] = -196619115;
        hj.dcoq[1029] = 907738623;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isSelectablePotion(class_1799 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hj.he - hj.dcos("ddtr", ddkn(int ), (int)92)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hj.dcos("ddts", dcoo(int ), (int)200)) break;
            v0 /* !! */  = (long)hj.dcos("ddtt", dcoo(int ), (int)201);
        }
        var4_2 = hj.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hj.he - hj.dcos("ddtu", ddkn(int ), (int)93)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hj.dcos("ddtv", dcoo(int ), (int)202)) break;
            v1 /* !! */  = (long)hj.dcos("ddtw", dcoo(int ), (int)203);
        }
        var3_3 /* !! */  = hj.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = hj.he - hj.dcos("ddtx", ddkn(int ), (int)94)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hj.dcos("ddty", dcoo(int ), (int)204)) break;
            v2 /* !! */  = (long)hj.dcos("ddtz", dcoo(int ), (int)205);
        }
        var2_4 = hj.a;
        if (var4_2) {
            throw null;
lbl24:
            // 7 sources

            return (boolean)hj.dcos("ddua", dcoo(int ), (int)206);
        }
        if (var2_4) ** GOTO lbl24
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl24
                if (var1_1 == null) ** GOTO lbl107
                if (var2_4) ** GOTO lbl24
                v3 /* !! */  = hj.he;
                if (true) ** GOTO lbl37
                block39: while (true) {
                    v3 /* !! */  = (long)(v4 - hj.dcos("ddub", ddkn(int ), (int)95));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1101014956: {
                            v4 = hj.dcos("dduc", ddkn(int ), (int)96);
                            continue block39;
                        }
                        case -561662407: {
                            v4 = hj.dcos("ddud", ddkn(int ), (int)97);
                            continue block39;
                        }
                        case -520930636: {
                            v4 = hj.dcos("ddue", ddkn(int ), (int)98);
                            continue block39;
                        }
                        case 27539926: {
                            break block39;
                        }
                    }
                    break;
                }
                if (var1_1.method_7960()) ** GOTO lbl107
                if (var2_4) ** GOTO lbl24
                v5 /* !! */  = hj.he;
                if (true) ** GOTO lbl55
                block40: while (true) {
                    v5 /* !! */  = (long)(v6 - hj.dcos("dduf", ddkn(int ), (int)99));
lbl55:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 27539926: {
                            break block40;
                        }
                        case 47136393: {
                            v6 = hj.dcos("ddug", ddkn(int ), (int)100);
                            continue block40;
                        }
                        case 1512989596: {
                            v6 = hj.dcos("dduh", ddkn(int ), (int)101);
                            continue block40;
                        }
                    }
                    break;
                }
                v7 /* !! */  = hj.he;
                if (true) ** GOTO lbl68
                block41: while (true) {
                    v7 /* !! */  = (long)(v8 - hj.dcos("ddui", ddkn(int ), (int)102));
lbl68:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -69688838: {
                            v8 = hj.dcos("dduj", ddkn(int ), (int)103);
                            continue block41;
                        }
                        case 27539926: {
                            break block41;
                        }
                        case 862771643: {
                            v8 = hj.dcos("dduk", ddkn(int ), (int)104);
                            continue block41;
                        }
                        case 2116328227: {
                            v8 = hj.dcos("ddul", ddkn(int ), (int)105);
                            continue block41;
                        }
                    }
                    break;
                }
                if (!var1_1.method_31574(class_1802.field_8436)) ** GOTO lbl107
                if (var2_4) ** GOTO lbl24
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = hj.he - hj.dcos("ddum", ddkn(int ), (int)106)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v9 /* !! */  == hj.dcos("ddun", dcoo(int ), (int)207)) break;
                    v9 /* !! */  = (long)hj.dcos("dduo", dcoo(int ), (int)208);
                }
                v10 /* !! */  = hj.he;
                if (true) ** GOTO lbl92
                block43: while (true) {
                    v10 /* !! */  = (long)(v11 - hj.dcos("ddup", ddkn(int ), (int)107));
lbl92:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1152519969: {
                            v11 = hj.dcos("dduq", ddkn(int ), (int)108);
                            continue block43;
                        }
                        case 27539926: {
                            break block43;
                        }
                        case 1385955742: {
                            v11 = hj.dcos("ddur", ddkn(int ), (int)109);
                            continue block43;
                        }
                    }
                    break;
                }
                if (!var1_1.method_57826(class_9334.field_49651)) ** GOTO lbl107
                if (var2_4) ** GOTO lbl24
                v12 = hj.dcos("ddus", dcoo(int ), (int)209);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl110
lbl107:
                // 4 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v12 = hj.dcos("ddut", dcoo(int ), (int)210);
lbl110:
                // 2 sources

                return (boolean)v12;
            }
lbl111:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)hj.dcos("dduu", dcoo(int ), (int)211);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl116:
            // 3 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hj.dcos("dduv", dcoo(int ), (int)212);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl135
                    break;
                }
            }
lbl122:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)hj.dcos("dduw", dcoo(int ), (int)213);
                if (!var4_2) ** GOTO lbl111
                throw null;
            }
lbl126:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)hj.dcos("ddux", dcoo(int ), (int)214);
                if (!var4_2) break;
                throw null;
            }
            case 4: {
                do {
                    var3_3 /* !! */  = (int)hj.dcos("dduy", dcoo(int ), (int)215);
                } while (!var4_2);
                throw null;
            }
lbl135:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)hj.dcos("dduz", dcoo(int ), (int)216);
                if (!var4_2) ** GOTO lbl126
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)hj.dcos("ddva", dcoo(int ), (int)217);
                if (!var4_2) ** GOTO lbl116
                throw null;
            }
            case 7: {
                do {
                    var3_3 /* !! */  = (int)hj.dcos("ddvb", dcoo(int ), (int)218);
                } while (!var4_2);
                throw null;
            }
            case 8: {
                var3_3 /* !! */  = (int)hj.dcos("ddvc", dcoo(int ), (int)219);
                if (!var4_2) ** GOTO lbl116
                throw null;
            }
lbl152:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)hj.dcos("ddvd", dcoo(int ), (int)220);
                if (!var4_2) ** GOTO lbl122
                throw null;
            }
            case 10: 
        }
        var3_3 /* !! */  = (int)hj.dcos("ddve", dcoo(int ), (int)221);
        ** while (!var4_2)
lbl159:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public hj() {
        var2_1 /* !! */  = hj.b;
        super("BuffHelper", "\u041a\u043e\u043b\u044c\u0446\u043e \u0434\u043b\u044f \u0431\u044b\u0441\u0442\u0440\u043e\u0433\u043e \u0432\u044b\u0431\u043e\u0440\u0430 \u0438 \u0431\u0440\u043e\u0441\u043a\u0430 \u0431\u0430\u0444\u043e\u0432", du.RAGE);
        this.selectedPotions = new class_1799[]{class_1799.field_8037, class_1799.field_8037, class_1799.field_8037};
        this.throwStage = (int)hj.dcos("dcoz", dcoo(int ), (int)0);
        this.pendingInventoryScreenSlot = (int)hj.dcos("dcpa", dcoo(int ), (int)1);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.pendingHotbarSlot = (int)hj.dcos("dcpb", dcoo(int ), (int)2);
                this.pendingPotion = class_1799.field_8037;
                this.throwMovement = new nx();
                this.trackedPotions = new LinkedHashMap<Integer, hj$TrackedSplashPotion>();
                this.openRingBind = new ka("\u0411\u0438\u043d\u0434 \u043a\u043e\u043b\u044c\u0446\u0430", "\u041a\u043b\u0430\u0432\u0438\u0448\u0430 \u043e\u0442\u043a\u0440\u044b\u0442\u0438\u044f \u043a\u043e\u043b\u044c\u0446\u0430 \u0431\u0430\u0444\u043e\u0432");
                this.openRingMode = new kf("\u0420\u0435\u0436\u0438\u043c \u043e\u0442\u043a\u0440\u044b\u0442\u0438\u044f", "\u041e\u043f\u0440\u0435\u0434\u0435\u043b\u044f\u0435\u0442 \u043f\u043e\u0432\u0435\u0434\u0435\u043d\u0438\u0435 \u043a\u043b\u0430\u0432\u0438\u0448\u0438 \u043a\u043e\u043b\u044c\u0446\u0430", "\u041f\u043e \u043d\u0430\u0436\u0430\u0442\u0438\u044e", new String[]{"\u041f\u043e \u043d\u0430\u0436\u0430\u0442\u0438\u044e", "\u041f\u0440\u0438 \u0443\u0434\u0435\u0440\u0436\u0430\u043d\u0438\u0438"});
                this.debugPotions = new kb("\u0414\u0435\u0431\u0430\u0433 \u0437\u0435\u043b\u0438\u0439", "\u041f\u0438\u0448\u0435\u0442 \u043f\u043e\u043f\u0430\u0434\u0430\u043d\u0438\u0435 \u043b\u044e\u0431\u043e\u0433\u043e \u0432\u0437\u0440\u044b\u0432\u043d\u043e\u0433\u043e \u0437\u0435\u043b\u044c\u044f \u043f\u043e \u0438\u0433\u0440\u043e\u043a\u0430\u043c");
                this.settings(new jx[]{this.openRingBind, this.openRingMode, this.debugPotions});
                return;
            }
lbl18:
            // 3 sources

            case 0: {
                var2_1 /* !! */  = (int)hj.dcos("dcpd", dcoo(int ), (int)3);
                ** GOTO lbl36
            }
            case 1: {
                var2_1 /* !! */  = (int)hj.dcos("dcpf", dcoo(int ), (int)4);
                ** GOTO lbl45
            }
lbl24:
            // 3 sources

            case 2: {
                var2_1 /* !! */  = (int)hj.dcos("dcpg", dcoo(int ), (int)5);
                ** GOTO lbl55
            }
lbl27:
            // 2 sources

            case 3: {
                var2_1 /* !! */  = (int)hj.dcos("dcpi", dcoo(int ), (int)6);
                ** GOTO lbl51
            }
            case 4: {
                var2_1 /* !! */  = (int)hj.dcos("dcpm", dcoo(int ), (int)7);
                ** GOTO lbl42
            }
            case 5: {
                var2_1 /* !! */  = (int)hj.dcos("dcpo", dcoo(int ), (int)8);
                ** GOTO lbl18
            }
lbl36:
            // 2 sources

            case 6: {
                var2_1 /* !! */  = (int)hj.dcos("dcpp", dcoo(int ), (int)9);
                ** GOTO lbl27
            }
lbl39:
            // 3 sources

            case 7: {
                var2_1 /* !! */  = (int)hj.dcos("dcpq", dcoo(int ), (int)10);
                ** GOTO lbl18
            }
lbl42:
            // 2 sources

            case 8: {
                var2_1 /* !! */  = (int)hj.dcos("dcpr", dcoo(int ), (int)11);
                break;
            }
lbl45:
            // 2 sources

            case 9: {
                var2_1 /* !! */  = (int)hj.dcos("dcps", dcoo(int ), (int)12);
                ** GOTO lbl39
            }
            case 10: {
                var2_1 /* !! */  = (int)hj.dcos("dcpt", dcoo(int ), (int)13);
                ** GOTO lbl24
            }
lbl51:
            // 2 sources

            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)hj.dcos("dcpu", dcoo(int ), (int)14);
                    ** GOTO lbl39
                    break;
                }
            }
lbl55:
            // 2 sources

            case 12: {
                var2_1 /* !! */  = (int)hj.dcos("dcpx", dcoo(int ), (int)15);
                ** GOTO lbl24
            }
            case 13: 
        }
        var2_1 /* !! */  = (int)hj.dcos("dcpz", dcoo(int ), (int)16);
        ** while (true)
    }

    private static /* synthetic */ void dgko() {
        hj.dcop[100] = 90761377;
        hj.dcop[101] = -1406968155;
        hj.dcop[102] = 1516933058;
        hj.dcop[103] = 1101547416;
        hj.dcop[104] = 215474049;
        hj.dcop[105] = 2090471696;
        hj.dcop[106] = 2046376978;
        hj.dcop[107] = -467923952;
        hj.dcop[108] = 330768491;
        hj.dcop[109] = 856034970;
        hj.dcop[110] = 586609003;
        hj.dcop[111] = 1659457267;
        hj.dcop[112] = -1472685859;
        hj.dcop[113] = -1309219473;
        hj.dcop[114] = -2089501728;
        hj.dcop[115] = -1654992349;
        hj.dcop[116] = -1116783944;
        hj.dcop[117] = -1730059999;
        hj.dcop[118] = -109952977;
        hj.dcop[119] = 87713251;
        hj.dcop[120] = 796285203;
        hj.dcop[121] = 1371047916;
        hj.dcop[122] = -1339877898;
        hj.dcop[123] = 1442830746;
        hj.dcop[124] = -1510900139;
        hj.dcop[125] = 237091387;
        hj.dcop[126] = -600154421;
        hj.dcop[127] = -1176328005;
        hj.dcop[128] = 644550531;
        hj.dcop[129] = -1980910475;
        hj.dcop[130] = -962786564;
        hj.dcop[131] = 555205763;
        hj.dcop[132] = 162091249;
        hj.dcop[133] = 1926789808;
        hj.dcop[134] = -2047966534;
        hj.dcop[135] = 1077354980;
        hj.dcop[136] = 1752604571;
        hj.dcop[137] = -986812482;
        hj.dcop[138] = 779265475;
        hj.dcop[139] = -1940198844;
        hj.dcop[140] = 517141697;
        hj.dcop[141] = -770368307;
        hj.dcop[142] = 1207654102;
        hj.dcop[143] = 1212447544;
        hj.dcop[144] = 894568034;
        hj.dcop[145] = 1394240711;
        hj.dcop[146] = -498661965;
        hj.dcop[147] = 1542557516;
        hj.dcop[148] = 1758107692;
        hj.dcop[149] = 1066754285;
        hj.dcop[150] = -1130828449;
        hj.dcop[151] = -238141932;
        hj.dcop[152] = 229692092;
        hj.dcop[153] = -1483767659;
        hj.dcop[154] = -1398081355;
        hj.dcop[155] = 1213640214;
        hj.dcop[156] = 666809207;
        hj.dcop[157] = -979465707;
        hj.dcop[158] = -22773034;
        hj.dcop[159] = -2033867731;
        hj.dcop[160] = 220916195;
        hj.dcop[161] = -845459583;
        hj.dcop[162] = -725006031;
        hj.dcop[163] = 1235949613;
        hj.dcop[164] = -1623286797;
        hj.dcop[165] = -1919892439;
        hj.dcop[166] = -1834268641;
        hj.dcop[167] = 381253140;
        hj.dcop[168] = -1378337411;
        hj.dcop[169] = 230337916;
        hj.dcop[170] = 1924078954;
        hj.dcop[171] = -1469313568;
        hj.dcop[172] = -376978802;
        hj.dcop[173] = -1791938550;
        hj.dcop[174] = 1393887952;
        hj.dcop[175] = 1150911097;
        hj.dcop[176] = 1602343488;
        hj.dcop[177] = -1327506267;
        hj.dcop[178] = 1974142373;
        hj.dcop[179] = -2108975976;
        hj.dcop[180] = 115717250;
        hj.dcop[181] = -207476813;
        hj.dcop[182] = 523961618;
        hj.dcop[183] = 1297184249;
        hj.dcop[184] = 894788390;
        hj.dcop[185] = 1221995078;
        hj.dcop[186] = -1829057372;
        hj.dcop[187] = 334588778;
        hj.dcop[188] = -1940753835;
        hj.dcop[189] = -1554711662;
        hj.dcop[190] = -1101813079;
        hj.dcop[191] = -1658277748;
        hj.dcop[192] = -1527348006;
        hj.dcop[193] = 834142747;
        hj.dcop[194] = 1372345635;
        hj.dcop[195] = 1771147935;
        hj.dcop[196] = -2046427286;
        hj.dcop[197] = -1394114335;
        hj.dcop[198] = -226339070;
        hj.dcop[199] = 1623228182;
    }

    private static /* synthetic */ void dgkr() {
        hj.dcop[400] = 1178055196;
        hj.dcop[401] = -10097891;
        hj.dcop[402] = 1969581535;
        hj.dcop[403] = -976074296;
        hj.dcop[404] = 1517610910;
        hj.dcop[405] = 1792392968;
        hj.dcop[406] = 762344795;
        hj.dcop[407] = 417974061;
        hj.dcop[408] = -607093032;
        hj.dcop[409] = 1514956457;
        hj.dcop[410] = -824480031;
        hj.dcop[411] = 1323609782;
        hj.dcop[412] = -1907483843;
        hj.dcop[413] = -1047864505;
        hj.dcop[414] = 827808986;
        hj.dcop[415] = 331058761;
        hj.dcop[416] = 40017006;
        hj.dcop[417] = -745236240;
        hj.dcop[418] = -853224488;
        hj.dcop[419] = 571907712;
        hj.dcop[420] = 998922082;
        hj.dcop[421] = -179869349;
        hj.dcop[422] = -800179128;
        hj.dcop[423] = -1895176129;
        hj.dcop[424] = -78645018;
        hj.dcop[425] = 6376826;
        hj.dcop[426] = -990742574;
        hj.dcop[427] = -1205187643;
        hj.dcop[428] = -1479028893;
        hj.dcop[429] = -1374671862;
        hj.dcop[430] = 1690090381;
        hj.dcop[431] = -1564886189;
        hj.dcop[432] = 1980394417;
        hj.dcop[433] = -474143706;
        hj.dcop[434] = 438284859;
        hj.dcop[435] = -775347903;
        hj.dcop[436] = -239809887;
        hj.dcop[437] = 2071963645;
        hj.dcop[438] = -625525441;
        hj.dcop[439] = 974306280;
        hj.dcop[440] = -1868332848;
        hj.dcop[441] = 163760802;
        hj.dcop[442] = 144008654;
        hj.dcop[443] = 1563947236;
        hj.dcop[444] = -1004431278;
        hj.dcop[445] = -982950444;
        hj.dcop[446] = 1198806104;
        hj.dcop[447] = 1463410457;
        hj.dcop[448] = -40168395;
        hj.dcop[449] = -1385970591;
        hj.dcop[450] = 672161804;
        hj.dcop[451] = -390844893;
        hj.dcop[452] = -1834069422;
        hj.dcop[453] = 141861182;
        hj.dcop[454] = 76188728;
        hj.dcop[455] = 718660185;
        hj.dcop[456] = 167164469;
        hj.dcop[457] = -2012232876;
        hj.dcop[458] = -974846244;
        hj.dcop[459] = -2020852748;
        hj.dcop[460] = 2140040942;
        hj.dcop[461] = 1880159548;
        hj.dcop[462] = -1045398277;
        hj.dcop[463] = -183509629;
        hj.dcop[464] = -965332409;
        hj.dcop[465] = -1524891768;
        hj.dcop[466] = -1765349678;
        hj.dcop[467] = -441717912;
        hj.dcop[468] = -425031848;
        hj.dcop[469] = 1885196054;
        hj.dcop[470] = 218716569;
        hj.dcop[471] = -1102351428;
        hj.dcop[472] = -1091468290;
        hj.dcop[473] = -1553720864;
        hj.dcop[474] = -948587315;
        hj.dcop[475] = 991478359;
        hj.dcop[476] = 1941178096;
        hj.dcop[477] = -1466333089;
        hj.dcop[478] = -1319284677;
        hj.dcop[479] = -109075688;
        hj.dcop[480] = -880418154;
        hj.dcop[481] = -1619184264;
        hj.dcop[482] = 1607109586;
        hj.dcop[483] = -1303748892;
        hj.dcop[484] = -633057896;
        hj.dcop[485] = -1359499210;
        hj.dcop[486] = 1650106973;
        hj.dcop[487] = 1250608246;
        hj.dcop[488] = 1111647815;
        hj.dcop[489] = -785784371;
        hj.dcop[490] = -1272477698;
        hj.dcop[491] = 1675178911;
        hj.dcop[492] = -464649124;
        hj.dcop[493] = -1956369478;
        hj.dcop[494] = -821036171;
        hj.dcop[495] = -561161552;
        hj.dcop[496] = -81606118;
        hj.dcop[497] = -344152796;
        hj.dcop[498] = -2014874840;
        hj.dcop[499] = -732889997;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int findFullEffectDuration(class_1799 var1_1, class_6880<class_1291> var2_2, int var3_3) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hj.he - hj.dcos("dfkn", ddkn(int ), (int)325)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == hj.dcos("dfko", dcoo(int ), (int)724)) break;
            v0 /* !! */  = (long)hj.dcos("dfkp", dcoo(int ), (int)725);
        }
        var9_4 = hj.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hj.he - hj.dcos("dfkq", ddkn(int ), (int)326)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == hj.dcos("dfkr", dcoo(int ), (int)726)) break;
            v1 /* !! */  = (long)hj.dcos("dfks", dcoo(int ), (int)727);
        }
        var8_5 /* !! */  = hj.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = hj.he - hj.dcos("dfkt", ddkn(int ), (int)327)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == hj.dcos("dfku", dcoo(int ), (int)728)) break;
            v2 /* !! */  = (long)hj.dcos("dfkv", dcoo(int ), (int)729);
        }
        var7_6 = hj.a;
        if (var9_4) {
            throw null;
lbl21:
            // 12 sources

            return (int)hj.dcos("dfkw", dcoo(int ), (int)730);
        }
        if (var7_6 || var7_6) ** GOTO lbl21
        if (var8_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = hj.he;
                if (true) ** GOTO lbl31
                block53: while (true) {
                    v3 /* !! */  = (long)(hj.dcos("dfky", ddkn(int ), (int)329) - hj.dcos("dfkx", ddkn(int ), (int)328));
lbl31:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 27539926: {
                            break block53;
                        }
                        case 288193359: {
                            continue block53;
                        }
                    }
                    break;
                }
                v4 /* !! */  = hj.he;
                if (true) ** GOTO lbl40
                block54: while (true) {
                    v4 /* !! */  = (long)(v5 - hj.dcos("dfkz", ddkn(int ), (int)330));
lbl40:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1531678869: {
                            v5 = hj.dcos("dfla", ddkn(int ), (int)331);
                            continue block54;
                        }
                        case -1187339777: {
                            v5 = hj.dcos("dflb", ddkn(int ), (int)332);
                            continue block54;
                        }
                        case -603679865: {
                            v5 = hj.dcos("dflc", ddkn(int ), (int)333);
                            continue block54;
                        }
                        case 27539926: {
                            break block54;
                        }
                    }
                    break;
                }
                var4_7 = (class_1844)var1_1.method_58694(class_9334.field_49651);
                if (var7_6 || var7_6) ** GOTO lbl21
                if (var4_7 != null) ** GOTO lbl57
                if (var7_6) ** GOTO lbl21
                return (int)hj.dcos("dfld", dcoo(int ), (int)731);
lbl57:
                // 1 sources

                if (var7_6 || var7_6) ** GOTO lbl21
                v6 /* !! */  = hj.he;
                if (true) ** GOTO lbl62
                block55: while (true) {
                    v6 /* !! */  = (long)(hj.dcos("dflf", ddkn(int ), (int)335) - hj.dcos("dfle", ddkn(int ), (int)334));
lbl62:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1282308186: {
                            continue block55;
                        }
                        case 27539926: {
                            break block55;
                        }
                    }
                    break;
                }
                v7 = var4_7.method_57397();
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = hj.he - hj.dcos("dflg", ddkn(int ), (int)336)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == hj.dcos("dflh", dcoo(int ), (int)732)) break;
                    v8 /* !! */  = (long)hj.dcos("dfli", dcoo(int ), (int)733);
                }
                var5_8 = v7.iterator();
                if (var7_6) ** GOTO lbl21
                do {
                    if (var7_6 || var7_6) ** GOTO lbl21
                    v9 /* !! */  = hj.he;
                    if (true) ** GOTO lbl81
                    block58: while (true) {
                        v9 /* !! */  = (long)(hj.dcos("dflk", ddkn(int ), (int)338) - hj.dcos("dflj", ddkn(int ), (int)337));
lbl81:
                        // 2 sources

                        switch ((int)v9 /* !! */ ) {
                            case -1478977098: {
                                continue block58;
                            }
                            case 27539926: {
                                break block58;
                            }
                        }
                        break;
                    }
                    if (!var5_8.hasNext()) ** GOTO lbl132
                    if (var7_6) ** GOTO lbl21
                    while (true) {
                        if ((v10 /* !! */  = (cfr_temp_4 = hj.he - hj.dcos("dfll", ddkn(int ), (int)339)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v10 /* !! */  == hj.dcos("dflm", dcoo(int ), (int)734)) break;
                        v10 /* !! */  = (long)hj.dcos("dfln", dcoo(int ), (int)735);
                    }
                    var6_9 = (class_1293)var5_8.next();
                    if (var7_6 || var7_6) ** GOTO lbl21
                    while (true) {
                        if ((v11 /* !! */  = (cfr_temp_5 = hj.he - hj.dcos("dflo", ddkn(int ), (int)340)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v11 /* !! */  == hj.dcos("dflp", dcoo(int ), (int)736)) break;
                        v11 /* !! */  = (long)hj.dcos("dflq", dcoo(int ), (int)737);
                    }
                    v12 = var6_9.method_5579();
                    while (true) {
                        if ((v13 /* !! */  = (cfr_temp_6 = hj.he - hj.dcos("dflr", ddkn(int ), (int)341)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v13 /* !! */  == hj.dcos("dfls", dcoo(int ), (int)738)) break;
                        v13 /* !! */  = (long)hj.dcos("dflt", dcoo(int ), (int)739);
                    }
                    if (!Objects.equals(v12, var2_2)) ** GOTO lbl129
                    if (var7_6) ** GOTO lbl21
                    v14 /* !! */  = hj.he;
                    if (true) ** GOTO lbl112
                    block62: while (true) {
                        v14 /* !! */  = (long)(v15 - hj.dcos("dflu", ddkn(int ), (int)342));
lbl112:
                        // 2 sources

                        switch ((int)v14 /* !! */ ) {
                            case -1924932581: {
                                v15 = hj.dcos("dflv", ddkn(int ), (int)343);
                                continue block62;
                            }
                            case 27539926: {
                                break block62;
                            }
                            case 1633478878: {
                                v15 = hj.dcos("dflw", ddkn(int ), (int)344);
                                continue block62;
                            }
                        }
                        break;
                    }
                    if (var6_9.method_5578() != var3_3) ** GOTO lbl129
                    if (var7_6 || var7_6) ** GOTO lbl21
                    while (true) {
                        if ((v16 /* !! */  = (cfr_temp_7 = hj.he - hj.dcos("dflx", ddkn(int ), (int)345)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v16 /* !! */  == hj.dcos("dfly", dcoo(int ), (int)740)) break;
                        v16 /* !! */  = (long)hj.dcos("dflz", dcoo(int ), (int)741);
                    }
                    return var6_9.method_5584();
lbl129:
                    // 2 sources

                    if (var7_6 || var7_6) ** GOTO lbl21
                } while (!var9_4);
                throw null;
lbl132:
                // 1 sources

                if (!var7_6 && !var7_6) ** break;
                ** continue;
                return (int)hj.dcos("dfma", dcoo(int ), (int)742);
            }
lbl135:
            // 4 sources

            case 0: {
                var8_5 /* !! */  = (int)hj.dcos("dfmb", dcoo(int ), (int)743);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl169
            }
lbl140:
            // 2 sources

            case 1: {
                var8_5 /* !! */  = (int)hj.dcos("dfmc", dcoo(int ), (int)744);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl229
            }
            case 2: {
                var8_5 /* !! */  = (int)hj.dcos("dfmd", dcoo(int ), (int)745);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl159
            }
lbl150:
            // 2 sources

            case 3: {
                var8_5 /* !! */  = (int)hj.dcos("dfme", dcoo(int ), (int)746);
                if (!var9_4) ** GOTO lbl135
                throw null;
            }
lbl154:
            // 2 sources

            case 4: {
                var8_5 /* !! */  = (int)hj.dcos("dfmf", dcoo(int ), (int)747);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl225
            }
lbl159:
            // 3 sources

            case 5: {
                do {
                    var8_5 /* !! */  = (int)hj.dcos("dfmg", dcoo(int ), (int)748);
                } while (!var9_4);
                throw null;
            }
            case 6: {
                var8_5 /* !! */  = (int)hj.dcos("dfmh", dcoo(int ), (int)749);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl169:
            // 2 sources

            case 7: {
                var8_5 /* !! */  = (int)hj.dcos("dfmi", dcoo(int ), (int)750);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl179
            }
            case 8: {
                var8_5 /* !! */  = (int)hj.dcos("dfmj", dcoo(int ), (int)751);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl198
            }
lbl179:
            // 2 sources

            case 9: {
                var8_5 /* !! */  = (int)hj.dcos("dfmk", dcoo(int ), (int)752);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl198
            }
            case 10: {
                var8_5 /* !! */  = (int)hj.dcos("dfml", dcoo(int ), (int)753);
                if (!var9_4) ** GOTO lbl150
                throw null;
            }
            case 11: {
                var8_5 /* !! */  = (int)hj.dcos("dfmm", dcoo(int ), (int)754);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl193:
            // 2 sources

            case 12: {
                var8_5 /* !! */  = (int)hj.dcos("dfmn", dcoo(int ), (int)755);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl198:
            // 3 sources

            case 13: {
                var8_5 /* !! */  = (int)hj.dcos("dfmo", dcoo(int ), (int)756);
                if (!var9_4) ** GOTO lbl154
                throw null;
            }
            case 14: {
                var8_5 /* !! */  = (int)hj.dcos("dfmp", dcoo(int ), (int)757);
                if (!var9_4) ** GOTO lbl135
                throw null;
            }
            case 15: {
                var8_5 /* !! */  = (int)hj.dcos("dfmq", dcoo(int ), (int)758);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl211:
            // 3 sources

            case 16: {
                var8_5 /* !! */  = (int)hj.dcos("dfmr", dcoo(int ), (int)759);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl221
            }
lbl216:
            // 4 sources

            case 17: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_5 /* !! */  = (int)hj.dcos("dfms", dcoo(int ), (int)760);
                    if (!var9_4) ** GOTO lbl135
                    throw null;
                }
            }
lbl221:
            // 2 sources

            case 18: {
                var8_5 /* !! */  = (int)hj.dcos("dfmt", dcoo(int ), (int)761);
                if (!var9_4) ** GOTO lbl140
                throw null;
            }
lbl225:
            // 2 sources

            case 19: {
                var8_5 /* !! */  = (int)hj.dcos("dfmu", dcoo(int ), (int)762);
                if (!var9_4) ** GOTO lbl159
                throw null;
            }
lbl229:
            // 3 sources

            case 20: {
                var8_5 /* !! */  = (int)hj.dcos("dfmv", dcoo(int ), (int)763);
                if (!var9_4) ** GOTO lbl193
                throw null;
            }
            case 21: {
                var8_5 /* !! */  = (int)hj.dcos("dfmw", dcoo(int ), (int)764);
                if (!var9_4) ** GOTO lbl216
                throw null;
            }
            case 22: {
                var8_5 /* !! */  = (int)hj.dcos("dfmx", dcoo(int ), (int)765);
                if (!var9_4) ** GOTO lbl216
                throw null;
            }
            case 23: 
        }
        var8_5 /* !! */  = (int)hj.dcos("dfmy", dcoo(int ), (int)766);
        ** while (!var9_4)
lbl244:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long ddkn(int n2) {
        return ddko[n2] ^ ddkp[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int findPotionSlot(class_1799 var1_1) {
        block107: {
            block106: {
                v0 /* !! */  = hj.he;
                if (true) ** GOTO lbl5
                block69: while (true) {
                    v0 /* !! */  = (long)(v1 - hj.dcos("dfwq", ddkn(int ), (int)388));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case 27539926: {
                            break block69;
                        }
                        case 361846518: {
                            v1 = hj.dcos("dfwr", ddkn(int ), (int)389);
                            continue block69;
                        }
                        case 1437267670: {
                            v1 = hj.dcos("dfws", ddkn(int ), (int)390);
                            continue block69;
                        }
                    }
                    break;
                }
                var6_2 = hj.c;
                v2 /* !! */  = hj.he;
                if (true) ** GOTO lbl19
                block70: while (true) {
                    v2 /* !! */  = (long)(v3 - hj.dcos("dfwt", ddkn(int ), (int)391));
lbl19:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -512182429: {
                            v3 = hj.dcos("dfwu", ddkn(int ), (int)392);
                            continue block70;
                        }
                        case -325299734: {
                            v3 = hj.dcos("dfwv", ddkn(int ), (int)393);
                            continue block70;
                        }
                        case 27539926: {
                            break block70;
                        }
                        case 2046972624: {
                            v3 = hj.dcos("dfww", ddkn(int ), (int)394);
                            continue block70;
                        }
                    }
                    break;
                }
                var5_3 /* !! */  = hj.b;
                v4 /* !! */  = hj.he;
                if (true) ** GOTO lbl36
                block71: while (true) {
                    v4 /* !! */  = (long)(v5 - hj.dcos("dfwx", ddkn(int ), (int)395));
lbl36:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -390295190: {
                            v5 = hj.dcos("dfwy", ddkn(int ), (int)396);
                            continue block71;
                        }
                        case 27539926: {
                            break block71;
                        }
                        case 664685205: {
                            v5 = hj.dcos("dfwz", ddkn(int ), (int)397);
                            continue block71;
                        }
                        case 750465171: {
                            v5 = hj.dcos("dfxa", ddkn(int ), (int)398);
                            continue block71;
                        }
                    }
                    break;
                }
                var4_4 = hj.a;
                if (var6_2) {
                    throw null;
lbl51:
                    // 15 sources

                    return (int)hj.dcos("dfxb", dcoo(int ), (int)938);
                }
                if (var4_4 || var4_4) ** GOTO lbl51
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_0 = hj.he - hj.dcos("dfxd", ddkn(int ), (int)399)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == hj.dcos("dfxf", dcoo(int ), (int)939)) break;
                    v6 /* !! */  = (long)hj.dcos("dfxh", dcoo(int ), (int)940);
                }
                v7 /* !! */  = hj.he;
                if (true) ** GOTO lbl63
                block74: while (true) {
                    v7 /* !! */  = (long)(v8 - hj.dcos("dfxi", ddkn(int ), (int)400));
lbl63:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -145691938: {
                            v8 = hj.dcos("dfxj", ddkn(int ), (int)401);
                            continue block74;
                        }
                        case 27539926: {
                            break block74;
                        }
                        case 1051098517: {
                            v8 = hj.dcos("dfxl", ddkn(int ), (int)402);
                            continue block74;
                        }
                    }
                    break;
                }
                if (hj.mc.field_1724 == null) break block106;
                if (var4_4) ** GOTO lbl51
                if (var1_1 == null) break block106;
                if (var4_4) ** GOTO lbl51
                v9 /* !! */  = hj.he;
                if (true) ** GOTO lbl80
                block75: while (true) {
                    v9 /* !! */  = (long)(v10 - hj.dcos("dfxm", ddkn(int ), (int)403));
lbl80:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1765107865: {
                            v10 = hj.dcos("dfxn", ddkn(int ), (int)404);
                            continue block75;
                        }
                        case 27539926: {
                            break block75;
                        }
                        case 2024290558: {
                            v10 = hj.dcos("dfxo", ddkn(int ), (int)405);
                            continue block75;
                        }
                    }
                    break;
                }
                if (!var1_1.method_7960()) break block107;
                if (var4_4) ** GOTO lbl51
            }
            if (var4_4 || var4_4) ** GOTO lbl51
            return (int)hj.dcos("dfxp", dcoo(int ), (int)941);
        }
        if (var4_4 || var4_4) ** GOTO lbl51
        var2_5 = hj.dcos("dfxq", dcoo(int ), (int)942);
        if (var4_4) ** GOTO lbl51
        block76: while (true) {
            if (var4_4 || var4_4) ** GOTO lbl51
            if (var2_5 >= hj.dcos("dfxs", dcoo(int ), (int)943)) ** GOTO lbl159
            if (var4_4 || var4_4) ** GOTO lbl51
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_1 = hj.he - hj.dcos("dfxz", ddkn(int ), (int)406)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == hj.dcos("dfya", dcoo(int ), (int)944)) break;
                v11 /* !! */  = (long)hj.dcos("dfyd", dcoo(int ), (int)945);
            }
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_2 = hj.he - hj.dcos("dfyf", ddkn(int ), (int)407)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v12 /* !! */  == hj.dcos("dfyg", dcoo(int ), (int)946)) break;
                v12 /* !! */  = (long)hj.dcos("dfyk", dcoo(int ), (int)947);
            }
            v13 = hj.mc.field_1724;
            v14 /* !! */  = hj.he;
            if (true) ** GOTO lbl117
            block79: while (true) {
                v14 /* !! */  = (long)(hj.dcos("dfym", ddkn(int ), (int)409) - hj.dcos("dfyl", ddkn(int ), (int)408));
lbl117:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case 27539926: {
                        break block79;
                    }
                    case 1685620845: {
                        continue block79;
                    }
                }
                break;
            }
            v15 = v13.method_31548();
            v16 /* !! */  = hj.he;
            if (true) ** GOTO lbl127
            block80: while (true) {
                v16 /* !! */  = (long)(v17 - hj.dcos("dfyo", ddkn(int ), (int)410));
lbl127:
                // 2 sources

                switch ((int)v16 /* !! */ ) {
                    case -1723721785: {
                        v17 = hj.dcos("dfyq", ddkn(int ), (int)411);
                        continue block80;
                    }
                    case -113637190: {
                        v17 = hj.dcos("dfys", ddkn(int ), (int)412);
                        continue block80;
                    }
                    case 27539926: {
                        break block80;
                    }
                }
                break;
            }
            var3_6 = v15.method_5438((int)var2_5);
            if (var4_4 || var4_4) ** GOTO lbl51
            v18 /* !! */  = hj.he;
            if (true) ** GOTO lbl142
            block81: while (true) {
                v18 /* !! */  = (long)(hj.dcos("dfyy", ddkn(int ), (int)414) - hj.dcos("dfyu", ddkn(int ), (int)413));
lbl142:
                // 2 sources

                switch ((int)v18 /* !! */ ) {
                    case 27539926: {
                        break block81;
                    }
                    case 2122233219: {
                        continue block81;
                    }
                }
                break;
            }
            if (!this.samePotion(var3_6, var1_1)) ** GOTO lbl154
            if (var4_4) ** GOTO lbl51
            if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var5_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var4_4) ** GOTO lbl51
                    return (int)var2_5;
                }
lbl154:
                // 1 sources

                if (var4_4 || var4_4) ** GOTO lbl51
                ++var2_5;
                if (var4_4) ** GOTO lbl51
                if (!var6_2) continue block76;
                throw null;
lbl159:
                // 1 sources

                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return (int)hj.dcos("dfzc", dcoo(int ), (int)948);
lbl162:
                // 2 sources

                case 0: {
                    var5_3 /* !! */  = (int)hj.dcos("dfze", dcoo(int ), (int)949);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl171
                }
                case 1: {
                    var5_3 /* !! */  = (int)hj.dcos("dgfy", dcoo(int ), (int)950);
                    if (var6_2) {
                        throw null;
                    }
                }
lbl171:
                // 4 sources

                case 2: {
                    var5_3 /* !! */  = (int)hj.dcos("dgfz", dcoo(int ), (int)951);
                    if (!var6_2) break block76;
                    throw null;
                }
lbl175:
                // 2 sources

                case 3: {
                    var5_3 /* !! */  = (int)hj.dcos("dgga", dcoo(int ), (int)952);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl243
                }
lbl180:
                // 3 sources

                case 4: {
                    var5_3 /* !! */  = (int)hj.dcos("dggb", dcoo(int ), (int)953);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl209
                }
                case 5: {
                    var5_3 /* !! */  = (int)hj.dcos("dggc", dcoo(int ), (int)954);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl230
                }
lbl190:
                // 2 sources

                case 6: {
                    var5_3 /* !! */  = (int)hj.dcos("dggd", dcoo(int ), (int)955);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl265
                }
lbl195:
                // 2 sources

                case 7: {
                    var5_3 /* !! */  = (int)hj.dcos("dgge", dcoo(int ), (int)956);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl269
                }
                case 8: {
                    var5_3 /* !! */  = (int)hj.dcos("dggf", dcoo(int ), (int)957);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl273
                }
                case 9: {
                    var5_3 /* !! */  = (int)hj.dcos("dggg", dcoo(int ), (int)958);
                    if (!var6_2) ** GOTO lbl180
                    throw null;
                }
lbl209:
                // 3 sources

                case 10: {
                    var5_3 /* !! */  = (int)hj.dcos("dggh", dcoo(int ), (int)959);
                    if (!var6_2) ** GOTO lbl175
                    throw null;
                }
lbl213:
                // 2 sources

                case 11: {
                    var5_3 /* !! */  = (int)hj.dcos("dggi", dcoo(int ), (int)960);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl243
                }
lbl218:
                // 3 sources

                case 12: {
                    var5_3 /* !! */  = (int)hj.dcos("dggj", dcoo(int ), (int)961);
                    if (!var6_2) ** GOTO lbl162
                    throw null;
                }
lbl222:
                // 2 sources

                case 13: {
                    var5_3 /* !! */  = (int)hj.dcos("dggk", dcoo(int ), (int)962);
                    if (!var6_2) ** GOTO lbl180
                    throw null;
                }
lbl226:
                // 2 sources

                case 14: {
                    var5_3 /* !! */  = (int)hj.dcos("dggl", dcoo(int ), (int)963);
                    if (!var6_2) ** GOTO lbl190
                    throw null;
                }
lbl230:
                // 2 sources

                case 15: {
                    do {
                        var5_3 /* !! */  = (int)hj.dcos("dggm", dcoo(int ), (int)964);
                    } while (!var6_2);
                    throw null;
                }
                case 16: {
                    var5_3 /* !! */  = (int)hj.dcos("dggn", dcoo(int ), (int)965);
                    if (!var6_2) ** GOTO lbl218
                    throw null;
                }
                case 17: {
                    var5_3 /* !! */  = (int)hj.dcos("dggo", dcoo(int ), (int)966);
                    if (!var6_2) ** GOTO lbl218
                    throw null;
                }
lbl243:
                // 3 sources

                case 18: {
                    var5_3 /* !! */  = (int)hj.dcos("dggp", dcoo(int ), (int)967);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl265
                }
lbl248:
                // 2 sources

                case 19: {
                    var5_3 /* !! */  = (int)hj.dcos("dggq", dcoo(int ), (int)968);
                    if (!var6_2) ** GOTO lbl222
                    throw null;
                }
                case 20: {
                    var5_3 /* !! */  = (int)hj.dcos("dggr", dcoo(int ), (int)969);
                    if (!var6_2) ** GOTO lbl213
                    throw null;
                }
                case 21: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var5_3 /* !! */  = (int)hj.dcos("dggs", dcoo(int ), (int)970);
                        if (!var6_2) ** GOTO lbl248
                        throw null;
                    }
                }
                case 22: {
                    var5_3 /* !! */  = (int)hj.dcos("dggt", dcoo(int ), (int)971);
                    if (!var6_2) ** GOTO lbl209
                    throw null;
                }
lbl265:
                // 3 sources

                case 23: {
                    var5_3 /* !! */  = (int)hj.dcos("dggu", dcoo(int ), (int)972);
                    if (!var6_2) ** GOTO lbl226
                    throw null;
                }
lbl269:
                // 2 sources

                case 24: {
                    var5_3 /* !! */  = (int)hj.dcos("dggv", dcoo(int ), (int)973);
                    if (!var6_2) ** GOTO lbl195
                    throw null;
                }
lbl273:
                // 2 sources

                case 25: {
                    var5_3 /* !! */  = (int)hj.dcos("dggw", dcoo(int ), (int)974);
                    if (!var6_2) break block76;
                    throw null;
                }
                case 26: 
            }
            break;
        }
        var5_3 /* !! */  = (int)hj.dcos("dggx", dcoo(int ), (int)975);
        ** while (!var6_2)
lbl280:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void clearPendingThrow() {
        block54: {
            v0 /* !! */  = hj.he;
            if (true) ** GOTO lbl5
            block36: while (true) {
                v0 /* !! */  = (long)(v1 - hj.dcos("delq", ddkn(int ), (int)190));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -414413371: {
                        v1 = hj.dcos("delr", ddkn(int ), (int)191);
                        continue block36;
                    }
                    case 27539926: {
                        break block36;
                    }
                    case 1750246889: {
                        v1 = hj.dcos("dels", ddkn(int ), (int)192);
                        continue block36;
                    }
                    case 2113251355: {
                        v1 = hj.dcos("delt", ddkn(int ), (int)193);
                        continue block36;
                    }
                }
                break;
            }
            var3_1 = hj.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = hj.he - hj.dcos("delu", ddkn(int ), (int)194)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == hj.dcos("delv", dcoo(int ), (int)489)) break;
                v2 /* !! */  = (long)hj.dcos("delw", dcoo(int ), (int)490);
            }
            var2_2 = hj.b;
            v3 /* !! */  = hj.he;
            if (true) ** GOTO lbl28
            block38: while (true) {
                v3 /* !! */  = (long)(v4 - hj.dcos("delx", ddkn(int ), (int)195));
lbl28:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -221687136: {
                        v4 = hj.dcos("dely", ddkn(int ), (int)196);
                        continue block38;
                    }
                    case 27539926: {
                        break block38;
                    }
                    case 68903090: {
                        v4 = hj.dcos("delz", ddkn(int ), (int)197);
                        continue block38;
                    }
                    case 1720743823: {
                        v4 = hj.dcos("dema", ddkn(int ), (int)198);
                        continue block38;
                    }
                }
                break;
            }
            var1_3 = hj.a;
            if (var3_1) {
                throw null;
lbl43:
                // 11 sources

                return;
            }
            if (var1_3 || var1_3) ** GOTO lbl43
            v5 = hj.dcos("demb", dcoo(int ), (int)491);
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_1 = hj.he - hj.dcos("demc", ddkn(int ), (int)199)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == hj.dcos("demd", dcoo(int ), (int)492)) break;
                v6 /* !! */  = (long)hj.dcos("deme", dcoo(int ), (int)493);
            }
            this.throwStage = (int)v5;
            if (var1_3 || var1_3) ** GOTO lbl43
            v7 = hj.dcos("demf", dcoo(int ), (int)494);
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_2 = hj.he - hj.dcos("demg", ddkn(int ), (int)200)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == hj.dcos("demh", dcoo(int ), (int)495)) break;
                v8 /* !! */  = (long)hj.dcos("demi", dcoo(int ), (int)496);
            }
            this.throwStageTicks = (int)v7;
            if (var1_3 || var1_3) ** GOTO lbl43
            v9 = hj.dcos("demj", dcoo(int ), (int)497);
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_3 = hj.he - hj.dcos("demk", ddkn(int ), (int)201)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == hj.dcos("deml", dcoo(int ), (int)498)) break;
                v10 /* !! */  = (long)hj.dcos("demm", dcoo(int ), (int)499);
            }
            this.pendingInventoryScreenSlot = (int)v9;
            if (var1_3 || var1_3) ** GOTO lbl43
            v11 = hj.dcos("demn", dcoo(int ), (int)500);
            v12 /* !! */  = hj.he;
            if (true) ** GOTO lbl75
            block43: while (true) {
                v12 /* !! */  = (long)(v13 - hj.dcos("demo", ddkn(int ), (int)202));
lbl75:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case -2124076230: {
                        v13 = hj.dcos("demp", ddkn(int ), (int)203);
                        continue block43;
                    }
                    case 27539926: {
                        break block43;
                    }
                    case 568535034: {
                        v13 = hj.dcos("demq", ddkn(int ), (int)204);
                        continue block43;
                    }
                    case 1856499432: {
                        v13 = hj.dcos("demr", ddkn(int ), (int)205);
                        continue block43;
                    }
                }
                break;
            }
            this.pendingHotbarSlot = (int)v11;
            if (var1_3 || var1_3) ** GOTO lbl43
            v14 /* !! */  = hj.he;
            if (true) ** GOTO lbl93
            block44: while (true) {
                v14 /* !! */  = (long)(hj.dcos("demt", ddkn(int ), (int)207) - hj.dcos("dems", ddkn(int ), (int)206));
lbl93:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case -176274706: {
                        continue block44;
                    }
                    case 27539926: {
                        break block44;
                    }
                }
                break;
            }
            while (true) {
                if ((v15 /* !! */  = (cfr_temp_4 = hj.he - hj.dcos("demu", ddkn(int ), (int)208)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v15 /* !! */  == hj.dcos("demv", dcoo(int ), (int)501)) break;
                v15 /* !! */  = (long)hj.dcos("demw", dcoo(int ), (int)502);
            }
            this.pendingPotion = class_1799.field_8037;
            if (var1_3 || var1_3) ** GOTO lbl43
            v16 = hj.dcos("demx", dcoo(int ), (int)503);
            while (true) {
                if ((v17 /* !! */  = (cfr_temp_5 = hj.he - hj.dcos("demy", ddkn(int ), (int)209)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v17 /* !! */  == hj.dcos("demz", dcoo(int ), (int)504)) break;
                v17 /* !! */  = (long)hj.dcos("dena", dcoo(int ), (int)505);
            }
            this.pendingSwapApplied = v16;
            if (var1_3 || var1_3) ** GOTO lbl43
            while (true) {
                if ((v18 /* !! */  = (cfr_temp_6 = hj.he - hj.dcos("denb", ddkn(int ), (int)210)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v18 /* !! */  == hj.dcos("denc", dcoo(int ), (int)506)) break;
                v18 /* !! */  = (long)hj.dcos("dend", dcoo(int ), (int)507);
            }
            v19 /* !! */  = hj.he;
            if (true) ** GOTO lbl122
            block48: while (true) {
                v19 /* !! */  = (long)(v20 - hj.dcos("dene", ddkn(int ), (int)211));
lbl122:
                // 2 sources

                switch ((int)v19 /* !! */ ) {
                    case 27539926: {
                        break block48;
                    }
                    case 1661574567: {
                        v20 = hj.dcos("denf", ddkn(int ), (int)212);
                        continue block48;
                    }
                    case 2110744104: {
                        v20 = hj.dcos("deng", ddkn(int ), (int)213);
                        continue block48;
                    }
                }
                break;
            }
            if (!this.throwMovement.isBlocked()) break block54;
            if (var1_3 || var1_3) ** GOTO lbl43
            v21 /* !! */  = hj.he;
            if (true) ** GOTO lbl137
            block49: while (true) {
                v21 /* !! */  = (long)(hj.dcos("deni", ddkn(int ), (int)215) - hj.dcos("denh", ddkn(int ), (int)214));
lbl137:
                // 2 sources

                switch ((int)v21 /* !! */ ) {
                    case 27539926: {
                        break block49;
                    }
                    case 1076256584: {
                        continue block49;
                    }
                }
                break;
            }
            v22 /* !! */  = hj.he;
            if (true) ** GOTO lbl146
            block50: while (true) {
                v22 /* !! */  = (long)(v23 - hj.dcos("denj", ddkn(int ), (int)216));
lbl146:
                // 2 sources

                switch ((int)v22 /* !! */ ) {
                    case -1772307374: {
                        v23 = hj.dcos("denk", ddkn(int ), (int)217);
                        continue block50;
                    }
                    case 27539926: {
                        break block50;
                    }
                    case 1153798020: {
                        v23 = hj.dcos("denl", ddkn(int ), (int)218);
                        continue block50;
                    }
                }
                break;
            }
            this.throwMovement.restoreFromCurrent();
            if (var1_3) ** GOTO lbl43
        }
        if (var1_3 || var1_3) ** GOTO lbl43
        while (true) {
            if ((v24 /* !! */  = (cfr_temp_7 = hj.he - hj.dcos("denm", ddkn(int ), (int)219)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v24 /* !! */  == hj.dcos("denn", dcoo(int ), (int)508)) break;
            v24 /* !! */  = (long)hj.dcos("deno", dcoo(int ), (int)509);
        }
        while (true) {
            if ((v25 /* !! */  = (cfr_temp_8 = hj.he - hj.dcos("denp", ddkn(int ), (int)220)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v25 /* !! */  == hj.dcos("denq", dcoo(int ), (int)510)) break;
            v25 /* !! */  = (long)hj.dcos("denr", dcoo(int ), (int)511);
        }
        this.throwMovement.reset();
        if (!var1_3 && !var1_3) ** break;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void restorePendingInventorySwap() {
        v0 /* !! */  = hj.he;
        if (true) ** GOTO lbl5
        block57: while (true) {
            v0 /* !! */  = (long)(v1 - hj.dcos("dejo", ddkn(int ), (int)161));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1934088105: {
                    v1 = hj.dcos("dejp", ddkn(int ), (int)162);
                    continue block57;
                }
                case 27539926: {
                    break block57;
                }
                case 137817325: {
                    v1 = hj.dcos("dejq", ddkn(int ), (int)163);
                    continue block57;
                }
                case 1112208072: {
                    v1 = hj.dcos("dejr", ddkn(int ), (int)164);
                    continue block57;
                }
            }
            break;
        }
        var3_1 = hj.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hj.he - hj.dcos("dejs", ddkn(int ), (int)165)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == hj.dcos("dejt", dcoo(int ), (int)464)) break;
            v2 /* !! */  = (long)hj.dcos("deju", dcoo(int ), (int)465);
        }
        var2_2 /* !! */  = hj.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = hj.he - hj.dcos("dejv", ddkn(int ), (int)166)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == hj.dcos("dejw", dcoo(int ), (int)466)) break;
            v3 /* !! */  = (long)hj.dcos("dejx", dcoo(int ), (int)467);
        }
        var1_3 = hj.a;
        if (var3_1) {
            throw null;
lbl32:
            // 9 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl32
        v4 /* !! */  = hj.he;
        if (true) ** GOTO lbl39
        block61: while (true) {
            v4 /* !! */  = (long)(hj.dcos("dejz", ddkn(int ), (int)168) - hj.dcos("dejy", ddkn(int ), (int)167));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -625322319: {
                    continue block61;
                }
                case 27539926: {
                    break block61;
                }
            }
            break;
        }
        if (this.throwStage == 0) ** GOTO lbl146
        if (var1_3) ** GOTO lbl32
        v5 /* !! */  = hj.he;
        if (true) ** GOTO lbl50
        block62: while (true) {
            v5 /* !! */  = (long)(v6 - hj.dcos("deka", ddkn(int ), (int)169));
lbl50:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1386883888: {
                    v6 = hj.dcos("dekb", ddkn(int ), (int)170);
                    continue block62;
                }
                case -1109696913: {
                    v6 = hj.dcos("dekc", ddkn(int ), (int)171);
                    continue block62;
                }
                case 27539926: {
                    break block62;
                }
            }
            break;
        }
        v7 /* !! */  = hj.he;
        if (true) ** GOTO lbl63
        block63: while (true) {
            v7 /* !! */  = (long)(v8 - hj.dcos("dekd", ddkn(int ), (int)172));
lbl63:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case 27539926: {
                    break block63;
                }
                case 126056785: {
                    v8 = hj.dcos("deke", ddkn(int ), (int)173);
                    continue block63;
                }
                case 1985554900: {
                    v8 = hj.dcos("dekf", ddkn(int ), (int)174);
                    continue block63;
                }
            }
            break;
        }
        if (hj.mc.field_1724 == null) ** GOTO lbl146
        if (var1_3) ** GOTO lbl32
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_2 = hj.he - hj.dcos("dekg", ddkn(int ), (int)175)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == hj.dcos("dekh", dcoo(int ), (int)468)) break;
            v9 /* !! */  = (long)hj.dcos("deki", dcoo(int ), (int)469);
        }
        if (this.pendingInventoryScreenSlot < 0) ** GOTO lbl146
        if (var1_3) ** GOTO lbl32
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_3 = hj.he - hj.dcos("dekj", ddkn(int ), (int)176)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == hj.dcos("dekk", dcoo(int ), (int)470)) break;
            v10 /* !! */  = (long)hj.dcos("dekl", dcoo(int ), (int)471);
        }
        if (this.pendingHotbarSlot < 0) ** GOTO lbl146
        if (var1_3) ** GOTO lbl32
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v11 /* !! */  = hj.he;
                if (true) ** GOTO lbl95
                block66: while (true) {
                    v11 /* !! */  = (long)(hj.dcos("dekn", ddkn(int ), (int)178) - hj.dcos("dekm", ddkn(int ), (int)177));
lbl95:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case 27539926: {
                            break block66;
                        }
                        case 391301413: {
                            continue block66;
                        }
                    }
                    break;
                }
                if (!this.pendingSwapApplied) ** GOTO lbl146
                if (var1_3 || var1_3) ** GOTO lbl32
                v12 /* !! */  = hj.he;
                if (true) ** GOTO lbl106
                block67: while (true) {
                    v12 /* !! */  = (long)(v13 - hj.dcos("deko", ddkn(int ), (int)179));
lbl106:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1313028233: {
                            v13 = hj.dcos("dekp", ddkn(int ), (int)180);
                            continue block67;
                        }
                        case -902633751: {
                            v13 = hj.dcos("dekq", ddkn(int ), (int)181);
                            continue block67;
                        }
                        case 27539926: {
                            break block67;
                        }
                        case 257869947: {
                            v13 = hj.dcos("dekr", ddkn(int ), (int)182);
                            continue block67;
                        }
                    }
                    break;
                }
                v14 /* !! */  = hj.he;
                if (true) ** GOTO lbl122
                block68: while (true) {
                    v14 /* !! */  = (long)(v15 - hj.dcos("deks", ddkn(int ), (int)183));
lbl122:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case 27539926: {
                            break block68;
                        }
                        case 517358030: {
                            v15 = hj.dcos("dekt", ddkn(int ), (int)184);
                            continue block68;
                        }
                        case 1770945275: {
                            v15 = hj.dcos("deku", ddkn(int ), (int)185);
                            continue block68;
                        }
                    }
                    break;
                }
                v16 /* !! */  = hj.he;
                if (true) ** GOTO lbl135
                block69: while (true) {
                    v16 /* !! */  = (long)(v17 - hj.dcos("dekv", ddkn(int ), (int)186));
lbl135:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1995227715: {
                            v17 = hj.dcos("dekw", ddkn(int ), (int)187);
                            continue block69;
                        }
                        case -1606656836: {
                            v17 = hj.dcos("dekx", ddkn(int ), (int)188);
                            continue block69;
                        }
                        case 27539926: {
                            break block69;
                        }
                    }
                    break;
                }
                nv.swapHotbar(this.pendingInventoryScreenSlot, this.pendingHotbarSlot);
                if (var1_3) ** GOTO lbl32
lbl146:
                // 6 sources

                if (var1_3 || var1_3) ** GOTO lbl32
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_4 = hj.he - hj.dcos("deky", ddkn(int ), (int)189)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == hj.dcos("dekz", dcoo(int ), (int)472)) break;
                    v18 /* !! */  = (long)hj.dcos("dela", dcoo(int ), (int)473);
                }
                this.clearPendingThrow();
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl156:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)hj.dcos("delb", dcoo(int ), (int)474);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl193
            }
lbl161:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)hj.dcos("delc", dcoo(int ), (int)475);
                } while (!var3_1);
                throw null;
            }
lbl166:
            // 3 sources

            case 2: {
                var2_2 /* !! */  = (int)hj.dcos("deld", dcoo(int ), (int)476);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl214
            }
lbl171:
            // 2 sources

            case 3: {
                do {
                    var2_2 /* !! */  = (int)hj.dcos("dele", dcoo(int ), (int)477);
                } while (!var3_1);
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)hj.dcos("delf", dcoo(int ), (int)478);
                if (!var3_1) ** GOTO lbl166
                throw null;
            }
lbl180:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)hj.dcos("delg", dcoo(int ), (int)479);
                if (!var3_1) ** GOTO lbl156
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)hj.dcos("delh", dcoo(int ), (int)480);
                if (!var3_1) break;
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)hj.dcos("deli", dcoo(int ), (int)481);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl214
            }
lbl193:
            // 3 sources

            case 8: {
                var2_2 /* !! */  = (int)hj.dcos("delj", dcoo(int ), (int)482);
                if (!var3_1) ** GOTO lbl161
                throw null;
            }
            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hj.dcos("delk", dcoo(int ), (int)483);
                    if (!var3_1) ** GOTO lbl166
                    throw null;
                }
            }
            case 10: {
                var2_2 /* !! */  = (int)hj.dcos("dell", dcoo(int ), (int)484);
                if (!var3_1) ** GOTO lbl171
                throw null;
            }
lbl206:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)hj.dcos("delm", dcoo(int ), (int)485);
                if (!var3_1) ** GOTO lbl193
                throw null;
            }
            case 12: {
                var2_2 /* !! */  = (int)hj.dcos("deln", dcoo(int ), (int)486);
                if (!var3_1) ** GOTO lbl180
                throw null;
            }
lbl214:
            // 3 sources

            case 13: {
                var2_2 /* !! */  = (int)hj.dcos("delo", dcoo(int ), (int)487);
                if (!var3_1) ** GOTO lbl206
                throw null;
            }
            case 14: 
        }
        var2_2 /* !! */  = (int)hj.dcos("delp", dcoo(int ), (int)488);
        ** while (!var3_1)
lbl221:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dgkn() {
        hj.dcop[0] = -1992329052;
        hj.dcop[1] = 1935044131;
        hj.dcop[2] = 1718499310;
        hj.dcop[3] = -692660739;
        hj.dcop[4] = 1566643116;
        hj.dcop[5] = -370099462;
        hj.dcop[6] = -732136645;
        hj.dcop[7] = -839822821;
        hj.dcop[8] = 1207057746;
        hj.dcop[9] = -366160744;
        hj.dcop[10] = 884043217;
        hj.dcop[11] = 1054011715;
        hj.dcop[12] = -1232789647;
        hj.dcop[13] = -1923310923;
        hj.dcop[14] = 1804374440;
        hj.dcop[15] = -2025940381;
        hj.dcop[16] = 1733593958;
        hj.dcop[17] = -876371474;
        hj.dcop[18] = -459599945;
        hj.dcop[19] = -1184579286;
        hj.dcop[20] = 1798031155;
        hj.dcop[21] = 239903092;
        hj.dcop[22] = -1815007901;
        hj.dcop[23] = 879932826;
        hj.dcop[24] = -699033598;
        hj.dcop[25] = -1526181842;
        hj.dcop[26] = -849555128;
        hj.dcop[27] = 751124600;
        hj.dcop[28] = 130096547;
        hj.dcop[29] = -208282727;
        hj.dcop[30] = 1272404551;
        hj.dcop[31] = 148714489;
        hj.dcop[32] = -1721740435;
        hj.dcop[33] = 1284389363;
        hj.dcop[34] = -678379750;
        hj.dcop[35] = 991613229;
        hj.dcop[36] = 414009839;
        hj.dcop[37] = 383507278;
        hj.dcop[38] = 16328707;
        hj.dcop[39] = -1053874080;
        hj.dcop[40] = -8360182;
        hj.dcop[41] = -562265468;
        hj.dcop[42] = 1590524110;
        hj.dcop[43] = -276769106;
        hj.dcop[44] = 221476262;
        hj.dcop[45] = 1707295409;
        hj.dcop[46] = -1040286379;
        hj.dcop[47] = -1967929367;
        hj.dcop[48] = -340675527;
        hj.dcop[49] = -116593966;
        hj.dcop[50] = -862868263;
        hj.dcop[51] = 844749981;
        hj.dcop[52] = -456127650;
        hj.dcop[53] = -46571111;
        hj.dcop[54] = 2033564168;
        hj.dcop[55] = -1345545456;
        hj.dcop[56] = -1890342229;
        hj.dcop[57] = 1078343636;
        hj.dcop[58] = -1939454937;
        hj.dcop[59] = -367993882;
        hj.dcop[60] = 1541757396;
        hj.dcop[61] = -1292871061;
        hj.dcop[62] = 1886384769;
        hj.dcop[63] = -1422899396;
        hj.dcop[64] = 406802841;
        hj.dcop[65] = -813161269;
        hj.dcop[66] = -970521167;
        hj.dcop[67] = -1089242264;
        hj.dcop[68] = 1913380718;
        hj.dcop[69] = -17158634;
        hj.dcop[70] = -831567536;
        hj.dcop[71] = -1230747646;
        hj.dcop[72] = -1521684265;
        hj.dcop[73] = -1102781403;
        hj.dcop[74] = 1582603042;
        hj.dcop[75] = -2128943900;
        hj.dcop[76] = -464186508;
        hj.dcop[77] = 1128846236;
        hj.dcop[78] = -795893955;
        hj.dcop[79] = -1551535987;
        hj.dcop[80] = 1652406026;
        hj.dcop[81] = 2034170926;
        hj.dcop[82] = 66524586;
        hj.dcop[83] = -1396957122;
        hj.dcop[84] = -246734176;
        hj.dcop[85] = -2113801543;
        hj.dcop[86] = 996236270;
        hj.dcop[87] = 867211653;
        hj.dcop[88] = 1765556444;
        hj.dcop[89] = -701852305;
        hj.dcop[90] = -1307787396;
        hj.dcop[91] = -1345146467;
        hj.dcop[92] = -1793193797;
        hj.dcop[93] = -1258177674;
        hj.dcop[94] = 2120048219;
        hj.dcop[95] = -204733156;
        hj.dcop[96] = -1630477159;
        hj.dcop[97] = -1111810857;
        hj.dcop[98] = -1026378171;
        hj.dcop[99] = -906418047;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onEntitySpawn(bw var1_1) {
        block110: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = hj.he - hj.dcos("ddlp", ddkn(int ), (int)15)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == hj.dcos("ddlq", dcoo(int ), (int)67)) break;
                v0 /* !! */  = (long)hj.dcos("ddlr", dcoo(int ), (int)68);
            }
            var7_2 = hj.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = hj.he - hj.dcos("ddls", ddkn(int ), (int)16)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == hj.dcos("ddlt", dcoo(int ), (int)69)) break;
                v1 /* !! */  = (long)hj.dcos("ddlu", dcoo(int ), (int)70);
            }
            var6_3 /* !! */  = hj.b;
            v2 /* !! */  = hj.he;
            if (true) ** GOTO lbl17
            block64: while (true) {
                v2 /* !! */  = (long)(hj.dcos("ddlw", ddkn(int ), (int)18) - hj.dcos("ddlv", ddkn(int ), (int)17));
lbl17:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1317729434: {
                        continue block64;
                    }
                    case 27539926: {
                        break block64;
                    }
                }
                break;
            }
            var5_4 = hj.a;
            if (var7_2) {
                throw null;
lbl25:
                // 14 sources

                return;
            }
            if (var5_4 || var5_4) ** GOTO lbl25
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_2 = hj.he - hj.dcos("ddlx", ddkn(int ), (int)19)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == hj.dcos("ddly", dcoo(int ), (int)71)) break;
                v3 /* !! */  = (long)hj.dcos("ddlz", dcoo(int ), (int)72);
            }
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_3 = hj.he - hj.dcos("ddma", ddkn(int ), (int)20)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == hj.dcos("ddmb", dcoo(int ), (int)73)) break;
                v4 /* !! */  = (long)hj.dcos("ddmc", dcoo(int ), (int)74);
            }
            if (!this.debugPotions.isValue()) break block110;
            if (var5_4 || var5_4) ** GOTO lbl25
            v5 /* !! */  = hj.he;
            if (true) ** GOTO lbl44
            block68: while (true) {
                v5 /* !! */  = (long)(hj.dcos("ddme", ddkn(int ), (int)22) - hj.dcos("ddmd", ddkn(int ), (int)21));
lbl44:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1549487681: {
                        continue block68;
                    }
                    case 27539926: {
                        break block68;
                    }
                }
                break;
            }
            var3_5 = var1_1.getEntity();
            if (var5_4) ** GOTO lbl25
            if (!(var3_5 instanceof class_10691)) break block110;
            if (var5_4) ** GOTO lbl25
            var2_6 = (class_10691)var3_5;
            if (var5_4 || var5_4) ** GOTO lbl25
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_4 = hj.he - hj.dcos("ddmf", ddkn(int ), (int)23)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == hj.dcos("ddmg", dcoo(int ), (int)75)) break;
                v6 /* !! */  = (long)hj.dcos("ddmh", dcoo(int ), (int)76);
            }
            v7 = var2_6.method_7495();
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_5 = hj.he - hj.dcos("ddmi", ddkn(int ), (int)24)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == hj.dcos("ddmj", dcoo(int ), (int)77)) break;
                v8 /* !! */  = (long)hj.dcos("ddmk", dcoo(int ), (int)78);
            }
            if (!v7.method_7960()) ** GOTO lbl75
            if (var5_4) ** GOTO lbl25
        }
        if (var5_4) ** GOTO lbl25
        if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_4) ** GOTO lbl25
                return;
            }
lbl75:
            // 1 sources

            if (var5_4 || var5_4) ** GOTO lbl25
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_6 = hj.he - hj.dcos("ddml", ddkn(int ), (int)25)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == hj.dcos("ddmm", dcoo(int ), (int)79)) break;
                v9 /* !! */  = (long)hj.dcos("ddmn", dcoo(int ), (int)80);
            }
            var3_5 = var2_6.method_24921();
            if (var5_4 || var5_4) ** GOTO lbl25
            if (var3_5 != null) ** GOTO lbl89
            if (var5_4) ** GOTO lbl25
            v10 = "\u043d\u0435\u0438\u0437\u0432\u0435\u0441\u0442\u043d\u043e";
            if (var7_2) {
                throw null;
            }
            ** GOTO lbl103
lbl89:
            // 1 sources

            if (var5_4 || var5_4) ** GOTO lbl25
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_7 = hj.he - hj.dcos("ddmo", ddkn(int ), (int)26)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == hj.dcos("ddmp", dcoo(int ), (int)81)) break;
                v11 /* !! */  = (long)hj.dcos("ddmq", dcoo(int ), (int)82);
            }
            v12 = var3_5.method_5477();
            while (true) {
                if ((v13 /* !! */  = (cfr_temp_8 = hj.he - hj.dcos("ddmr", ddkn(int ), (int)27)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v13 /* !! */  == hj.dcos("ddms", dcoo(int ), (int)83)) {
                    v10 = v12.getString();
                    break;
                }
                v13 /* !! */  = (long)hj.dcos("ddmt", dcoo(int ), (int)84);
            }
lbl103:
            // 2 sources

            var4_7 = v10;
            if (var5_4 || var5_4) ** GOTO lbl25
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_9 = hj.he - hj.dcos("ddmu", ddkn(int ), (int)28)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  == hj.dcos("ddmv", dcoo(int ), (int)85)) break;
                v14 /* !! */  = (long)hj.dcos("ddmw", dcoo(int ), (int)86);
            }
            while (true) {
                if ((v15 /* !! */  = (cfr_temp_10 = hj.he - hj.dcos("ddmx", ddkn(int ), (int)29)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                if (v15 /* !! */  == hj.dcos("ddmy", dcoo(int ), (int)87)) break;
                v15 /* !! */  = (long)hj.dcos("ddmz", dcoo(int ), (int)88);
            }
            v16 = var2_6.method_5628();
            while (true) {
                if ((v17 /* !! */  = (cfr_temp_11 = hj.he - hj.dcos("ddna", ddkn(int ), (int)30)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                if (v17 /* !! */  == hj.dcos("ddnb", dcoo(int ), (int)89)) break;
                v17 /* !! */  = (long)hj.dcos("ddnc", dcoo(int ), (int)90);
            }
            v18 = v16;
            while (true) {
                if ((v19 /* !! */  = (cfr_temp_12 = hj.he - hj.dcos("ddnd", ddkn(int ), (int)31)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                if (v19 /* !! */  == hj.dcos("ddne", dcoo(int ), (int)91)) break;
                v19 /* !! */  = (long)hj.dcos("ddnf", dcoo(int ), (int)92);
            }
            v20 /* !! */  = hj.he;
            if (true) ** GOTO lbl131
            block78: while (true) {
                v20 /* !! */  = (long)(v21 - hj.dcos("ddng", ddkn(int ), (int)32));
lbl131:
                // 2 sources

                switch ((int)v20 /* !! */ ) {
                    case -167782589: {
                        v21 = hj.dcos("ddnh", ddkn(int ), (int)33);
                        continue block78;
                    }
                    case 27539926: {
                        break block78;
                    }
                    case 1060559124: {
                        v21 = hj.dcos("ddni", ddkn(int ), (int)34);
                        continue block78;
                    }
                    case 1526520502: {
                        v21 = hj.dcos("ddnj", ddkn(int ), (int)35);
                        continue block78;
                    }
                }
                break;
            }
            v22 = var2_6.method_5628();
            while (true) {
                if ((v23 /* !! */  = (cfr_temp_13 = hj.he - hj.dcos("ddnk", ddkn(int ), (int)36)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                if (v23 /* !! */  == hj.dcos("ddnl", dcoo(int ), (int)93)) break;
                v23 /* !! */  = (long)hj.dcos("ddnm", dcoo(int ), (int)94);
            }
            v24 = var2_6.method_7495();
            v25 = hj.dcos("ddnn", dcoo(int ), (int)95);
            while (true) {
                if ((v26 /* !! */  = (cfr_temp_14 = hj.he - hj.dcos("ddno", ddkn(int ), (int)37)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                if (v26 /* !! */  == hj.dcos("ddnp", dcoo(int ), (int)96)) break;
                v26 /* !! */  = (long)hj.dcos("ddnq", dcoo(int ), (int)97);
            }
            v27 = v24.method_46651((int)v25);
            while (true) {
                if ((v28 /* !! */  = (cfr_temp_15 = hj.he - hj.dcos("ddnr", ddkn(int ), (int)38)) == 0L ? 0 : (cfr_temp_15 < 0L ? -1 : 1)) == false) continue;
                if (v28 /* !! */  == hj.dcos("ddns", dcoo(int ), (int)98)) break;
                v28 /* !! */  = (long)hj.dcos("ddnt", dcoo(int ), (int)99);
            }
            v29 = var2_6.method_23317();
            v30 /* !! */  = hj.he;
            if (true) ** GOTO lbl167
            block82: while (true) {
                v30 /* !! */  = (long)(v31 - hj.dcos("ddnu", ddkn(int ), (int)39));
lbl167:
                // 2 sources

                switch ((int)v30 /* !! */ ) {
                    case 27539926: {
                        break block82;
                    }
                    case 389722856: {
                        v31 = hj.dcos("ddnv", ddkn(int ), (int)40);
                        continue block82;
                    }
                    case 392771705: {
                        v31 = hj.dcos("ddnw", ddkn(int ), (int)41);
                        continue block82;
                    }
                    case 2003667215: {
                        v31 = hj.dcos("ddnx", ddkn(int ), (int)42);
                        continue block82;
                    }
                }
                break;
            }
            v32 = var2_6.method_23318();
            v33 /* !! */  = hj.he;
            if (true) ** GOTO lbl184
            block83: while (true) {
                v33 /* !! */  = (long)(v34 - hj.dcos("ddny", ddkn(int ), (int)43));
lbl184:
                // 2 sources

                switch ((int)v33 /* !! */ ) {
                    case 27539926: {
                        break block83;
                    }
                    case 111463025: {
                        v34 = hj.dcos("ddnz", ddkn(int ), (int)44);
                        continue block83;
                    }
                    case 1911726717: {
                        v34 = hj.dcos("ddoa", ddkn(int ), (int)45);
                        continue block83;
                    }
                }
                break;
            }
            v35 = var2_6.method_23321();
            v36 /* !! */  = hj.he;
            if (true) ** GOTO lbl198
            block84: while (true) {
                v36 /* !! */  = (long)(v37 - hj.dcos("ddob", ddkn(int ), (int)46));
lbl198:
                // 2 sources

                switch ((int)v36 /* !! */ ) {
                    case -1844514206: {
                        v37 = hj.dcos("ddoc", ddkn(int ), (int)47);
                        continue block84;
                    }
                    case -1590629246: {
                        v37 = hj.dcos("ddod", ddkn(int ), (int)48);
                        continue block84;
                    }
                    case 27539926: {
                        break block84;
                    }
                    case 702428774: {
                        v37 = hj.dcos("ddoe", ddkn(int ), (int)49);
                        continue block84;
                    }
                }
                break;
            }
            v38 = new hj$TrackedSplashPotion(v22, var2_6, v27, var4_7, v29, v32, v35);
            v39 /* !! */  = hj.he;
            if (true) ** GOTO lbl215
            block85: while (true) {
                v39 /* !! */  = (long)(hj.dcos("ddog", ddkn(int ), (int)51) - hj.dcos("ddof", ddkn(int ), (int)50));
lbl215:
                // 2 sources

                switch ((int)v39 /* !! */ ) {
                    case 27539926: {
                        break block85;
                    }
                    case 1818721144: {
                        continue block85;
                    }
                }
                break;
            }
            this.trackedPotions.put(v18, v38);
            if (!var5_4 && !var5_4) ** break;
            ** continue;
            return;
lbl225:
            // 2 sources

            case 0: {
                var6_3 /* !! */  = (int)hj.dcos("ddoh", dcoo(int ), (int)100);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl268
            }
            case 1: {
                var6_3 /* !! */  = (int)hj.dcos("ddoi", dcoo(int ), (int)101);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl259
            }
            case 2: {
                var6_3 /* !! */  = (int)hj.dcos("ddoj", dcoo(int ), (int)102);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl290
            }
            case 3: {
                var6_3 /* !! */  = (int)hj.dcos("ddok", dcoo(int ), (int)103);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl263
            }
lbl245:
            // 2 sources

            case 4: {
                var6_3 /* !! */  = (int)hj.dcos("ddol", dcoo(int ), (int)104);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl281
            }
lbl250:
            // 2 sources

            case 5: {
                var6_3 /* !! */  = (int)hj.dcos("ddom", dcoo(int ), (int)105);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl303
            }
lbl255:
            // 3 sources

            case 6: {
                var6_3 /* !! */  = (int)hj.dcos("ddon", dcoo(int ), (int)106);
                if (!var7_2) ** GOTO lbl225
                throw null;
            }
lbl259:
            // 2 sources

            case 7: {
                var6_3 /* !! */  = (int)hj.dcos("ddoo", dcoo(int ), (int)107);
                if (!var7_2) ** GOTO lbl255
                throw null;
            }
lbl263:
            // 2 sources

            case 8: {
                var6_3 /* !! */  = (int)hj.dcos("ddop", dcoo(int ), (int)108);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl286
            }
lbl268:
            // 3 sources

            case 9: {
                var6_3 /* !! */  = (int)hj.dcos("ddoq", dcoo(int ), (int)109);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl295
            }
lbl273:
            // 3 sources

            case 10: {
                var6_3 /* !! */  = (int)hj.dcos("ddor", dcoo(int ), (int)110);
                if (!var7_2) ** GOTO lbl245
                throw null;
            }
            case 11: {
                var6_3 /* !! */  = (int)hj.dcos("ddos", dcoo(int ), (int)111);
                if (!var7_2) ** GOTO lbl268
                throw null;
            }
lbl281:
            // 2 sources

            case 12: {
                var6_3 /* !! */  = (int)hj.dcos("ddot", dcoo(int ), (int)112);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl324
            }
lbl286:
            // 2 sources

            case 13: {
                var6_3 /* !! */  = (int)hj.dcos("ddou", dcoo(int ), (int)113);
                if (!var7_2) break;
                throw null;
            }
lbl290:
            // 2 sources

            case 14: {
                var6_3 /* !! */  = (int)hj.dcos("ddov", dcoo(int ), (int)114);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl329
            }
lbl295:
            // 2 sources

            case 15: {
                var6_3 /* !! */  = (int)hj.dcos("ddow", dcoo(int ), (int)115);
                if (!var7_2) ** GOTO lbl273
                throw null;
            }
            case 16: {
                var6_3 /* !! */  = (int)hj.dcos("ddox", dcoo(int ), (int)116);
                if (!var7_2) ** GOTO lbl255
                throw null;
            }
lbl303:
            // 3 sources

            case 17: {
                var6_3 /* !! */  = (int)hj.dcos("ddoy", dcoo(int ), (int)117);
                if (!var7_2) ** GOTO lbl250
                throw null;
            }
lbl307:
            // 2 sources

            case 18: {
                var6_3 /* !! */  = (int)hj.dcos("ddoz", dcoo(int ), (int)118);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl329
            }
            case 19: {
                var6_3 /* !! */  = (int)hj.dcos("ddpa", dcoo(int ), (int)119);
                if (!var7_2) ** GOTO lbl273
                throw null;
            }
lbl316:
            // 2 sources

            case 20: {
                var6_3 /* !! */  = (int)hj.dcos("ddpb", dcoo(int ), (int)120);
                if (!var7_2) ** GOTO lbl307
                throw null;
            }
            case 21: {
                var6_3 /* !! */  = (int)hj.dcos("ddpc", dcoo(int ), (int)121);
                if (!var7_2) break;
                throw null;
            }
lbl324:
            // 2 sources

            case 22: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_3 /* !! */  = (int)hj.dcos("ddpd", dcoo(int ), (int)122);
                    if (!var7_2) ** GOTO lbl303
                    throw null;
                }
            }
lbl329:
            // 3 sources

            case 23: {
                var6_3 /* !! */  = (int)hj.dcos("ddpe", dcoo(int ), (int)123);
                if (!var7_2) ** GOTO lbl316
                throw null;
            }
            case 24: 
        }
        var6_3 /* !! */  = (int)hj.dcos("ddpf", dcoo(int ), (int)124);
        ** while (!var7_2)
lbl336:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dgkv() {
        hj.dcop[800] = 1397289816;
        hj.dcop[801] = -1563579006;
        hj.dcop[802] = -1719160401;
        hj.dcop[803] = 65555305;
        hj.dcop[804] = 194890123;
        hj.dcop[805] = -1065082978;
        hj.dcop[806] = 1685274281;
        hj.dcop[807] = 1599394953;
        hj.dcop[808] = -1647827708;
        hj.dcop[809] = -113565025;
        hj.dcop[810] = -2018633472;
        hj.dcop[811] = 79030819;
        hj.dcop[812] = -514464065;
        hj.dcop[813] = -542202940;
        hj.dcop[814] = 102816537;
        hj.dcop[815] = 56732603;
        hj.dcop[816] = -1729068794;
        hj.dcop[817] = 146843356;
        hj.dcop[818] = 875371075;
        hj.dcop[819] = -281213413;
        hj.dcop[820] = 1944697978;
        hj.dcop[821] = -1949753974;
        hj.dcop[822] = 1502609801;
        hj.dcop[823] = -377980453;
        hj.dcop[824] = -1716493395;
        hj.dcop[825] = 489919057;
        hj.dcop[826] = 1786779198;
        hj.dcop[827] = 358205681;
        hj.dcop[828] = 1144663797;
        hj.dcop[829] = -745576985;
        hj.dcop[830] = 1875221682;
        hj.dcop[831] = 131003611;
        hj.dcop[832] = -1586397474;
        hj.dcop[833] = -29383454;
        hj.dcop[834] = -1383051332;
        hj.dcop[835] = -982962670;
        hj.dcop[836] = -1920287387;
        hj.dcop[837] = 1279507113;
        hj.dcop[838] = -976986143;
        hj.dcop[839] = 723819037;
        hj.dcop[840] = -770803592;
        hj.dcop[841] = 12091745;
        hj.dcop[842] = -811340387;
        hj.dcop[843] = 345342519;
        hj.dcop[844] = -78024102;
        hj.dcop[845] = -619296893;
        hj.dcop[846] = 1450039632;
        hj.dcop[847] = -1674952120;
        hj.dcop[848] = -684012139;
        hj.dcop[849] = 2005653748;
        hj.dcop[850] = 2123868192;
        hj.dcop[851] = 1860968487;
        hj.dcop[852] = -1511790408;
        hj.dcop[853] = 1058825232;
        hj.dcop[854] = -1860416805;
        hj.dcop[855] = 2114520455;
        hj.dcop[856] = -1832704432;
        hj.dcop[857] = 1463980596;
        hj.dcop[858] = 339661636;
        hj.dcop[859] = 1434966508;
        hj.dcop[860] = -1784606618;
        hj.dcop[861] = -654993448;
        hj.dcop[862] = 1937778269;
        hj.dcop[863] = 1364175273;
        hj.dcop[864] = -800064889;
        hj.dcop[865] = -1448556937;
        hj.dcop[866] = 2088326470;
        hj.dcop[867] = -2027238598;
        hj.dcop[868] = 1799850488;
        hj.dcop[869] = -8383269;
        hj.dcop[870] = -645901530;
        hj.dcop[871] = 1394705014;
        hj.dcop[872] = -373597487;
        hj.dcop[873] = -26558294;
        hj.dcop[874] = -1797565154;
        hj.dcop[875] = -281286020;
        hj.dcop[876] = -1963248928;
        hj.dcop[877] = -1555861614;
        hj.dcop[878] = -1497860783;
        hj.dcop[879] = -1703729663;
        hj.dcop[880] = 954103978;
        hj.dcop[881] = 1512534209;
        hj.dcop[882] = 90467102;
        hj.dcop[883] = -124379831;
        hj.dcop[884] = 1357111574;
        hj.dcop[885] = 204277616;
        hj.dcop[886] = 731147143;
        hj.dcop[887] = 1986415308;
        hj.dcop[888] = 315197600;
        hj.dcop[889] = 817552353;
        hj.dcop[890] = 1766099010;
        hj.dcop[891] = 1316314491;
        hj.dcop[892] = -353309580;
        hj.dcop[893] = -297730279;
        hj.dcop[894] = 166534845;
        hj.dcop[895] = 76853897;
        hj.dcop[896] = 472216876;
        hj.dcop[897] = -1489625957;
        hj.dcop[898] = -1410913113;
        hj.dcop[899] = -885789577;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hj.he - hj.dcos("ddqq", ddkn(int ), (int)52)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == hj.dcos("ddqr", dcoo(int ), (int)161)) break;
            v0 /* !! */  = (long)hj.dcos("ddqs", dcoo(int ), (int)162);
        }
        var3_1 = hj.c;
        v1 /* !! */  = hj.he;
        if (true) ** GOTO lbl11
        block24: while (true) {
            v1 /* !! */  = (long)(v2 - hj.dcos("ddqt", ddkn(int ), (int)53));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1240376261: {
                    v2 = hj.dcos("ddqu", ddkn(int ), (int)54);
                    continue block24;
                }
                case 27539926: {
                    break block24;
                }
                case 187030266: {
                    v2 = hj.dcos("ddqv", ddkn(int ), (int)55);
                    continue block24;
                }
            }
            break;
        }
        var2_2 /* !! */  = hj.b;
        v3 /* !! */  = hj.he;
        if (true) ** GOTO lbl25
        block25: while (true) {
            v3 /* !! */  = (long)(hj.dcos("ddqx", ddkn(int ), (int)57) - hj.dcos("ddqw", ddkn(int ), (int)56));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -505198239: {
                    continue block25;
                }
                case 27539926: {
                    break block25;
                }
            }
            break;
        }
        var1_3 = hj.a;
        if (var3_1) {
            throw null;
lbl33:
            // 3 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl33
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = hj.he - hj.dcos("ddqy", ddkn(int ), (int)58)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == hj.dcos("ddqz", dcoo(int ), (int)163)) break;
            v4 /* !! */  = (long)hj.dcos("ddra", dcoo(int ), (int)164);
        }
        this.restorePendingInventorySwap();
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl33
                v5 /* !! */  = hj.he;
                if (true) ** GOTO lbl50
                block28: while (true) {
                    v5 /* !! */  = (long)(hj.dcos("ddrc", ddkn(int ), (int)60) - hj.dcos("ddrb", ddkn(int ), (int)59));
lbl50:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 27539926: {
                            break block28;
                        }
                        case 818189895: {
                            continue block28;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = hj.he - hj.dcos("ddrd", ddkn(int ), (int)61)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == hj.dcos("ddre", dcoo(int ), (int)165)) break;
                    v6 /* !! */  = (long)hj.dcos("ddrf", dcoo(int ), (int)166);
                }
                this.trackedPotions.clear();
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl63:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)hj.dcos("ddrg", dcoo(int ), (int)167);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)hj.dcos("ddrh", dcoo(int ), (int)168);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl86
            }
lbl72:
            // 3 sources

            case 2: {
                var2_2 /* !! */  = (int)hj.dcos("ddri", dcoo(int ), (int)169);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl90
            }
            case 3: {
                var2_2 /* !! */  = (int)hj.dcos("ddrj", dcoo(int ), (int)170);
                if (!var3_1) ** GOTO lbl63
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hj.dcos("ddrk", dcoo(int ), (int)171);
                    if (!var3_1) ** GOTO lbl72
                    throw null;
                }
            }
lbl86:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)hj.dcos("ddrl", dcoo(int ), (int)172);
                if (!var3_1) ** GOTO lbl72
                throw null;
            }
lbl90:
            // 2 sources

            case 6: {
                do {
                    var2_2 /* !! */  = (int)hj.dcos("ddrm", dcoo(int ), (int)173);
                } while (!var3_1);
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)hj.dcos("ddrn", dcoo(int ), (int)174);
        ** while (!var3_1)
lbl98:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dgkp() {
        hj.dcop[200] = -549131944;
        hj.dcop[201] = 748335652;
        hj.dcop[202] = 1300656082;
        hj.dcop[203] = 474123197;
        hj.dcop[204] = -278114387;
        hj.dcop[205] = -1928883396;
        hj.dcop[206] = -1317523512;
        hj.dcop[207] = -399050506;
        hj.dcop[208] = 1144681994;
        hj.dcop[209] = 941625630;
        hj.dcop[210] = -803655327;
        hj.dcop[211] = -1368642565;
        hj.dcop[212] = -1755348196;
        hj.dcop[213] = 724309206;
        hj.dcop[214] = 1795101404;
        hj.dcop[215] = -1128366937;
        hj.dcop[216] = 883511149;
        hj.dcop[217] = -1071730696;
        hj.dcop[218] = -794915928;
        hj.dcop[219] = 1716663320;
        hj.dcop[220] = -811767884;
        hj.dcop[221] = -1730359624;
        hj.dcop[222] = 51272104;
        hj.dcop[223] = -1242276608;
        hj.dcop[224] = -402360362;
        hj.dcop[225] = 935034176;
        hj.dcop[226] = -932613518;
        hj.dcop[227] = 2087511126;
        hj.dcop[228] = -1839175460;
        hj.dcop[229] = -1993980202;
        hj.dcop[230] = -1531595124;
        hj.dcop[231] = -692383089;
        hj.dcop[232] = 322482751;
        hj.dcop[233] = -1465512064;
        hj.dcop[234] = -43360303;
        hj.dcop[235] = 418180203;
        hj.dcop[236] = -1035192904;
        hj.dcop[237] = -727110001;
        hj.dcop[238] = 572533211;
        hj.dcop[239] = 1048753150;
        hj.dcop[240] = -1212696267;
        hj.dcop[241] = -1026471479;
        hj.dcop[242] = 168448029;
        hj.dcop[243] = -1975271327;
        hj.dcop[244] = 1670537576;
        hj.dcop[245] = 1452319628;
        hj.dcop[246] = -57474747;
        hj.dcop[247] = -757306523;
        hj.dcop[248] = -134488876;
        hj.dcop[249] = -1463039208;
        hj.dcop[250] = 1671019200;
        hj.dcop[251] = 1718434523;
        hj.dcop[252] = -649478473;
        hj.dcop[253] = -1615526656;
        hj.dcop[254] = -2035553611;
        hj.dcop[255] = -1842868034;
        hj.dcop[256] = -1490922133;
        hj.dcop[257] = 463556708;
        hj.dcop[258] = 1317344297;
        hj.dcop[259] = 786946886;
        hj.dcop[260] = -1775628748;
        hj.dcop[261] = 1616035837;
        hj.dcop[262] = 835201776;
        hj.dcop[263] = -1384303063;
        hj.dcop[264] = 359711646;
        hj.dcop[265] = 1639572611;
        hj.dcop[266] = 103909032;
        hj.dcop[267] = -250071599;
        hj.dcop[268] = 1709453959;
        hj.dcop[269] = -692995620;
        hj.dcop[270] = -593812902;
        hj.dcop[271] = -2121132550;
        hj.dcop[272] = 1921901870;
        hj.dcop[273] = -1310673090;
        hj.dcop[274] = -1076475863;
        hj.dcop[275] = 562224888;
        hj.dcop[276] = -302670134;
        hj.dcop[277] = -178153723;
        hj.dcop[278] = -191542313;
        hj.dcop[279] = -348923177;
        hj.dcop[280] = 928292199;
        hj.dcop[281] = -395979135;
        hj.dcop[282] = 2046257497;
        hj.dcop[283] = 943453242;
        hj.dcop[284] = 1453269790;
        hj.dcop[285] = 1558661308;
        hj.dcop[286] = 2135068453;
        hj.dcop[287] = -812124153;
        hj.dcop[288] = 1018131208;
        hj.dcop[289] = -1729632628;
        hj.dcop[290] = -982520416;
        hj.dcop[291] = -196541801;
        hj.dcop[292] = 1863191554;
        hj.dcop[293] = -1182277210;
        hj.dcop[294] = 762933420;
        hj.dcop[295] = -976244184;
        hj.dcop[296] = 1267927000;
        hj.dcop[297] = -1851235311;
        hj.dcop[298] = -2053914943;
        hj.dcop[299] = 837852874;
    }

    private static /* synthetic */ void dglj() {
        hj.ddko[0] = 1186748387679605378L;
        hj.ddko[1] = 4871509813891357992L;
        hj.ddko[2] = 2992545576922729955L;
        hj.ddko[3] = -3686627358068443097L;
        hj.ddko[4] = 3325732220236928923L;
        hj.ddko[5] = -1314609816954820137L;
        hj.ddko[6] = 2148695907664716458L;
        hj.ddko[7] = 4582139195313369630L;
        hj.ddko[8] = -4706039578876608252L;
        hj.ddko[9] = 3124128470110693338L;
        hj.ddko[10] = 8841292853402678026L;
        hj.ddko[11] = -1627514269934707022L;
        hj.ddko[12] = 8900069534755293251L;
        hj.ddko[13] = -7608670304799445886L;
        hj.ddko[14] = -6891244108119502111L;
        hj.ddko[15] = 2164048046634773361L;
        hj.ddko[16] = 189728845119198711L;
        hj.ddko[17] = 199965712569812645L;
        hj.ddko[18] = 2670390191192892721L;
        hj.ddko[19] = -2788256649373925914L;
        hj.ddko[20] = 4750393565141329766L;
        hj.ddko[21] = -235313339222663381L;
        hj.ddko[22] = -8735292457822252471L;
        hj.ddko[23] = -8784932965050138768L;
        hj.ddko[24] = -2030096838948425971L;
        hj.ddko[25] = 6009830486693480793L;
        hj.ddko[26] = 6581305833742287552L;
        hj.ddko[27] = 1182004539340353180L;
        hj.ddko[28] = -3938306194926819987L;
        hj.ddko[29] = 6236975652500709776L;
        hj.ddko[30] = -2207268335048322713L;
        hj.ddko[31] = 3323770491343455162L;
        hj.ddko[32] = 7300632712444026918L;
        hj.ddko[33] = 3394970728888810110L;
        hj.ddko[34] = 1995793676941700111L;
        hj.ddko[35] = 7695118395843707591L;
        hj.ddko[36] = 4995050814696299988L;
        hj.ddko[37] = -949588639326510576L;
        hj.ddko[38] = 7065840036730031317L;
        hj.ddko[39] = -7216709753526240739L;
        hj.ddko[40] = 5492493163438928776L;
        hj.ddko[41] = -5640302577260738749L;
        hj.ddko[42] = -5452676646142788949L;
        hj.ddko[43] = -6689825100242031402L;
        hj.ddko[44] = -2026759898388761276L;
        hj.ddko[45] = -1398932006502858168L;
        hj.ddko[46] = 7252191491086221805L;
        hj.ddko[47] = -6221889228272894587L;
        hj.ddko[48] = 477292783534817924L;
        hj.ddko[49] = 7231421523798598842L;
        hj.ddko[50] = -8138307129034953116L;
        hj.ddko[51] = 7180956931049725247L;
        hj.ddko[52] = 2050808728851515149L;
        hj.ddko[53] = 3482030341818793457L;
        hj.ddko[54] = -508219438457568577L;
        hj.ddko[55] = -5913372494978012991L;
        hj.ddko[56] = -1285401091779531822L;
        hj.ddko[57] = 383314160322210350L;
        hj.ddko[58] = -2333595249300877653L;
        hj.ddko[59] = 7949531476517990425L;
        hj.ddko[60] = 7116065442893517815L;
        hj.ddko[61] = 3876502194139179732L;
        hj.ddko[62] = 6989193342197224233L;
        hj.ddko[63] = 80076968981991490L;
        hj.ddko[64] = 5297783879453193479L;
        hj.ddko[65] = -6270934387913419260L;
        hj.ddko[66] = 1575575972922027394L;
        hj.ddko[67] = 6136684823796319058L;
        hj.ddko[68] = -1749382353492372426L;
        hj.ddko[69] = -2354086069232521570L;
        hj.ddko[70] = -5316251710546042203L;
        hj.ddko[71] = -1066644004761284882L;
        hj.ddko[72] = -7306718941041564434L;
        hj.ddko[73] = -2222859993577206266L;
        hj.ddko[74] = -2157239423093311830L;
        hj.ddko[75] = 7158971579322142198L;
        hj.ddko[76] = -3888882058639159598L;
        hj.ddko[77] = -4592536077207754987L;
        hj.ddko[78] = -890340641523650042L;
        hj.ddko[79] = -4713508906132409680L;
        hj.ddko[80] = -3401204540090923585L;
        hj.ddko[81] = 6544988470380415615L;
        hj.ddko[82] = 147819576197079386L;
        hj.ddko[83] = 8209698084419002396L;
        hj.ddko[84] = -1123399086746801795L;
        hj.ddko[85] = 8640045668144308317L;
        hj.ddko[86] = -4962759714442854759L;
        hj.ddko[87] = 7010131601703314165L;
        hj.ddko[88] = -3927211515274669542L;
        hj.ddko[89] = 6232977317609535171L;
        hj.ddko[90] = -645161774084825316L;
        hj.ddko[91] = 8746374784366285089L;
        hj.ddko[92] = -8421661507573949258L;
        hj.ddko[93] = -631953813232840866L;
        hj.ddko[94] = 7587682943429657343L;
        hj.ddko[95] = -928272344622574203L;
        hj.ddko[96] = 5236905511533189895L;
        hj.ddko[97] = -8015922655503354897L;
        hj.ddko[98] = -3638508436800205949L;
        hj.ddko[99] = 3557489961881392408L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void processPendingInventoryThrow() {
        block144: {
            block143: {
                block142: {
                    var4_1 = hj.c;
                    var3_2 /* !! */  = hj.b;
                    var2_3 = hj.a;
                    if (var4_1) {
                        throw null;
lbl6:
                        // 37 sources

                        return;
                    }
                    if (var2_3 || var2_3) ** GOTO lbl6
                    if (this.throwStage != 0) break block142;
                    if (var2_3) ** GOTO lbl6
                    return;
                }
                if (var2_3 || var2_3) ** GOTO lbl6
                if (hj.mc.field_1724 == null) break block143;
                if (var2_3) ** GOTO lbl6
                if (hj.mc.field_1687 == null) break block143;
                if (var2_3) ** GOTO lbl6
                if (hj.mc.field_1724.field_3944 != null) break block144;
                if (var2_3) ** GOTO lbl6
            }
            if (var2_3 || var2_3) ** GOTO lbl6
            this.clearPendingThrow();
            if (var2_3 || var2_3) ** GOTO lbl6
            return;
        }
        if (var2_3 || var2_3) ** GOTO lbl6
        this.throwStageTicks += hj.dcos("dedg", dcoo(int ), (int)380);
        if (var2_3 || var2_3) ** GOTO lbl6
        this.throwMovement.block();
        if (var2_3 || var2_3) ** GOTO lbl6
        if (this.throwStage != hj.dcos("dedh", dcoo(int ), (int)381)) ** GOTO lbl49
        if (var2_3 || var2_3) ** GOTO lbl6
        if (this.throwStageTicks >= hj.dcos("dedi", dcoo(int ), (int)382)) ** GOTO lbl39
        if (var2_3) ** GOTO lbl6
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl39:
            // 1 sources

            if (var2_3 || var2_3) ** GOTO lbl6
            nv.swapHotbar(this.pendingInventoryScreenSlot, this.pendingHotbarSlot);
            if (var2_3 || var2_3) ** GOTO lbl6
            this.pendingSwapApplied = hj.dcos("dedj", dcoo(int ), (int)383);
            if (var2_3 || var2_3) ** GOTO lbl6
            this.throwStage = (int)hj.dcos("dedk", dcoo(int ), (int)384);
            if (var2_3 || var2_3) ** GOTO lbl6
            this.throwStageTicks = (int)hj.dcos("dedl", dcoo(int ), (int)385);
            if (var2_3 || var2_3) ** GOTO lbl6
            return;
lbl49:
            // 1 sources

            if (var2_3 || var2_3) ** GOTO lbl6
            if (this.throwStage != hj.dcos("dedm", dcoo(int ), (int)386)) ** GOTO lbl76
            if (var2_3 || var2_3) ** GOTO lbl6
            if (this.throwStageTicks >= hj.dcos("dedn", dcoo(int ), (int)387)) ** GOTO lbl55
            if (var2_3) ** GOTO lbl6
            return;
lbl55:
            // 1 sources

            if (var2_3 || var2_3) ** GOTO lbl6
            var1_4 = hj.mc.field_1724.method_31548().method_5438(this.pendingHotbarSlot);
            if (var2_3 || var2_3) ** GOTO lbl6
            if (this.samePotion(var1_4, this.pendingPotion)) ** GOTO lbl66
            if (var2_3 || var2_3) ** GOTO lbl6
            if (this.throwStageTicks <= hj.dcos("dedo", dcoo(int ), (int)388)) ** GOTO lbl64
            if (var2_3 || var2_3) ** GOTO lbl6
            this.restorePendingInventorySwap();
            if (var2_3) ** GOTO lbl6
lbl64:
            // 2 sources

            if (var2_3 || var2_3) ** GOTO lbl6
            return;
lbl66:
            // 1 sources

            if (var2_3 || var2_3) ** GOTO lbl6
            this.selectHotbarSlot(this.pendingHotbarSlot);
            if (var2_3 || var2_3) ** GOTO lbl6
            this.throwSelectedPotion(this.pendingPotion);
            if (var2_3 || var2_3) ** GOTO lbl6
            this.throwStage = (int)hj.dcos("dedp", dcoo(int ), (int)389);
            if (var2_3 || var2_3) ** GOTO lbl6
            this.throwStageTicks = (int)hj.dcos("dedq", dcoo(int ), (int)390);
            if (var2_3 || var2_3) ** GOTO lbl6
            return;
lbl76:
            // 1 sources

            if (var2_3 || var2_3) ** GOTO lbl6
            if (this.throwStage != hj.dcos("dedr", dcoo(int ), (int)391)) ** GOTO lbl83
            if (var2_3) ** GOTO lbl6
            if (this.throwStageTicks < hj.dcos("deds", dcoo(int ), (int)392)) ** GOTO lbl83
            if (var2_3 || var2_3) ** GOTO lbl6
            this.restorePendingInventorySwap();
            if (var2_3) ** GOTO lbl6
lbl83:
            // 3 sources

            if (!var2_3 && !var2_3) ** break;
            ** continue;
            return;
lbl86:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)hj.dcos("dedt", dcoo(int ), (int)393);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl91:
            // 2 sources

            case 1: {
                var3_2 /* !! */  = (int)hj.dcos("dedu", dcoo(int ), (int)394);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl330
            }
lbl96:
            // 3 sources

            case 2: {
                var3_2 /* !! */  = (int)hj.dcos("dedv", dcoo(int ), (int)395);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl361
            }
            case 3: {
                var3_2 /* !! */  = (int)hj.dcos("dedw", dcoo(int ), (int)396);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl399
            }
            case 4: {
                var3_2 /* !! */  = (int)hj.dcos("dedx", dcoo(int ), (int)397);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl193
            }
lbl111:
            // 2 sources

            case 5: {
                var3_2 /* !! */  = (int)hj.dcos("dedy", dcoo(int ), (int)398);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl293
            }
            case 6: {
                var3_2 /* !! */  = (int)hj.dcos("dedz", dcoo(int ), (int)399);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl271
            }
lbl121:
            // 3 sources

            case 7: {
                var3_2 /* !! */  = (int)hj.dcos("deea", dcoo(int ), (int)400);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl275
            }
lbl126:
            // 2 sources

            case 8: {
                var3_2 /* !! */  = (int)hj.dcos("deeb", dcoo(int ), (int)401);
                if (!var4_1) ** GOTO lbl111
                throw null;
            }
            case 9: {
                var3_2 /* !! */  = (int)hj.dcos("deec", dcoo(int ), (int)402);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl284
            }
            case 10: {
                var3_2 /* !! */  = (int)hj.dcos("deed", dcoo(int ), (int)403);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl203
            }
            case 11: {
                var3_2 /* !! */  = (int)hj.dcos("deee", dcoo(int ), (int)404);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl155
            }
lbl145:
            // 3 sources

            case 12: {
                var3_2 /* !! */  = (int)hj.dcos("deef", dcoo(int ), (int)405);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl262
            }
            case 13: {
                var3_2 /* !! */  = (int)hj.dcos("deeg", dcoo(int ), (int)406);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl301
            }
lbl155:
            // 3 sources

            case 14: {
                var3_2 /* !! */  = (int)hj.dcos("deeh", dcoo(int ), (int)407);
                if (!var4_1) ** GOTO lbl121
                throw null;
            }
lbl159:
            // 2 sources

            case 15: {
                var3_2 /* !! */  = (int)hj.dcos("deei", dcoo(int ), (int)408);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl399
            }
lbl164:
            // 2 sources

            case 16: {
                var3_2 /* !! */  = (int)hj.dcos("deej", dcoo(int ), (int)409);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl365
            }
lbl169:
            // 2 sources

            case 17: {
                var3_2 /* !! */  = (int)hj.dcos("deek", dcoo(int ), (int)410);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl352
            }
lbl174:
            // 2 sources

            case 18: {
                var3_2 /* !! */  = (int)hj.dcos("deel", dcoo(int ), (int)411);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl179:
            // 2 sources

            case 19: {
                var3_2 /* !! */  = (int)hj.dcos("deem", dcoo(int ), (int)412);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl318
            }
lbl184:
            // 2 sources

            case 20: {
                var3_2 /* !! */  = (int)hj.dcos("deen", dcoo(int ), (int)413);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl334
            }
            case 21: {
                var3_2 /* !! */  = (int)hj.dcos("deeo", dcoo(int ), (int)414);
                if (!var4_1) ** GOTO lbl145
                throw null;
            }
lbl193:
            // 3 sources

            case 22: {
                var3_2 /* !! */  = (int)hj.dcos("deep", dcoo(int ), (int)415);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl330
            }
lbl198:
            // 2 sources

            case 23: {
                var3_2 /* !! */  = (int)hj.dcos("deeq", dcoo(int ), (int)416);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl293
            }
lbl203:
            // 2 sources

            case 24: {
                var3_2 /* !! */  = (int)hj.dcos("deht", dcoo(int ), (int)417);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl288
            }
            case 25: {
                var3_2 /* !! */  = (int)hj.dcos("dehu", dcoo(int ), (int)418);
                if (!var4_1) ** GOTO lbl164
                throw null;
            }
lbl212:
            // 3 sources

            case 26: {
                var3_2 /* !! */  = (int)hj.dcos("dehv", dcoo(int ), (int)419);
                if (!var4_1) ** GOTO lbl126
                throw null;
            }
lbl216:
            // 3 sources

            case 27: {
                var3_2 /* !! */  = (int)hj.dcos("dehw", dcoo(int ), (int)420);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl262
            }
            case 28: {
                var3_2 /* !! */  = (int)hj.dcos("dehx", dcoo(int ), (int)421);
                if (!var4_1) ** GOTO lbl169
                throw null;
            }
lbl225:
            // 2 sources

            case 29: {
                var3_2 /* !! */  = (int)hj.dcos("dehy", dcoo(int ), (int)422);
                if (!var4_1) ** GOTO lbl91
                throw null;
            }
            case 30: {
                var3_2 /* !! */  = (int)hj.dcos("dehz", dcoo(int ), (int)423);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl244
            }
            case 31: {
                var3_2 /* !! */  = (int)hj.dcos("deia", dcoo(int ), (int)424);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl284
            }
lbl239:
            // 2 sources

            case 32: {
                var3_2 /* !! */  = (int)hj.dcos("deib", dcoo(int ), (int)425);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl352
            }
lbl244:
            // 3 sources

            case 33: {
                var3_2 /* !! */  = (int)hj.dcos("deic", dcoo(int ), (int)426);
                if (!var4_1) ** GOTO lbl86
                throw null;
            }
lbl248:
            // 2 sources

            case 34: {
                var3_2 /* !! */  = (int)hj.dcos("deid", dcoo(int ), (int)427);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl348
            }
            case 35: {
                var3_2 /* !! */  = (int)hj.dcos("deie", dcoo(int ), (int)428);
                if (!var4_1) ** GOTO lbl198
                throw null;
            }
            case 36: {
                var3_2 /* !! */  = (int)hj.dcos("deif", dcoo(int ), (int)429);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl279
            }
lbl262:
            // 3 sources

            case 37: {
                var3_2 /* !! */  = (int)hj.dcos("deig", dcoo(int ), (int)430);
                if (!var4_1) ** GOTO lbl96
                throw null;
            }
lbl266:
            // 2 sources

            case 38: {
                var3_2 /* !! */  = (int)hj.dcos("deih", dcoo(int ), (int)431);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl330
            }
lbl271:
            // 2 sources

            case 39: {
                var3_2 /* !! */  = (int)hj.dcos("deii", dcoo(int ), (int)432);
                if (!var4_1) ** GOTO lbl216
                throw null;
            }
lbl275:
            // 3 sources

            case 40: {
                var3_2 /* !! */  = (int)hj.dcos("deij", dcoo(int ), (int)433);
                if (!var4_1) ** GOTO lbl193
                throw null;
            }
lbl279:
            // 2 sources

            case 41: {
                var3_2 /* !! */  = (int)hj.dcos("deik", dcoo(int ), (int)434);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl318
            }
lbl284:
            // 4 sources

            case 42: {
                var3_2 /* !! */  = (int)hj.dcos("deil", dcoo(int ), (int)435);
                if (!var4_1) ** GOTO lbl179
                throw null;
            }
lbl288:
            // 2 sources

            case 43: {
                var3_2 /* !! */  = (int)hj.dcos("deim", dcoo(int ), (int)436);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl326
            }
lbl293:
            // 4 sources

            case 44: {
                var3_2 /* !! */  = (int)hj.dcos("dein", dcoo(int ), (int)437);
                if (!var4_1) ** GOTO lbl96
                throw null;
            }
            case 45: {
                var3_2 /* !! */  = (int)hj.dcos("deio", dcoo(int ), (int)438);
                if (!var4_1) ** GOTO lbl293
                throw null;
            }
lbl301:
            // 2 sources

            case 46: {
                var3_2 /* !! */  = (int)hj.dcos("deip", dcoo(int ), (int)439);
                if (!var4_1) ** GOTO lbl159
                throw null;
            }
            case 47: {
                var3_2 /* !! */  = (int)hj.dcos("deiq", dcoo(int ), (int)440);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl382
            }
            case 48: {
                var3_2 /* !! */  = (int)hj.dcos("deir", dcoo(int ), (int)441);
                if (!var4_1) ** GOTO lbl248
                throw null;
            }
            case 49: {
                var3_2 /* !! */  = (int)hj.dcos("deis", dcoo(int ), (int)442);
                if (!var4_1) ** GOTO lbl244
                throw null;
            }
lbl318:
            // 3 sources

            case 50: {
                var3_2 /* !! */  = (int)hj.dcos("deit", dcoo(int ), (int)443);
                if (!var4_1) ** GOTO lbl284
                throw null;
            }
lbl322:
            // 2 sources

            case 51: {
                var3_2 /* !! */  = (int)hj.dcos("deiu", dcoo(int ), (int)444);
                if (!var4_1) ** GOTO lbl212
                throw null;
            }
lbl326:
            // 2 sources

            case 52: {
                var3_2 /* !! */  = (int)hj.dcos("deiv", dcoo(int ), (int)445);
                if (!var4_1) ** GOTO lbl322
                throw null;
            }
lbl330:
            // 4 sources

            case 53: {
                var3_2 /* !! */  = (int)hj.dcos("deiw", dcoo(int ), (int)446);
                if (!var4_1) ** GOTO lbl184
                throw null;
            }
lbl334:
            // 3 sources

            case 54: {
                var3_2 /* !! */  = (int)hj.dcos("deix", dcoo(int ), (int)447);
                if (!var4_1) break;
                throw null;
            }
            case 55: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)hj.dcos("deiy", dcoo(int ), (int)448);
                    if (!var4_1) ** GOTO lbl155
                    throw null;
                }
            }
            case 56: {
                var3_2 /* !! */  = (int)hj.dcos("deiz", dcoo(int ), (int)449);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl382
            }
lbl348:
            // 2 sources

            case 57: {
                var3_2 /* !! */  = (int)hj.dcos("deja", dcoo(int ), (int)450);
                if (!var4_1) ** GOTO lbl121
                throw null;
            }
lbl352:
            // 4 sources

            case 58: {
                var3_2 /* !! */  = (int)hj.dcos("dejb", dcoo(int ), (int)451);
                if (!var4_1) ** GOTO lbl334
                throw null;
            }
            case 59: {
                var3_2 /* !! */  = (int)hj.dcos("dejc", dcoo(int ), (int)452);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl391
            }
lbl361:
            // 2 sources

            case 60: {
                var3_2 /* !! */  = (int)hj.dcos("dejd", dcoo(int ), (int)453);
                if (!var4_1) ** GOTO lbl275
                throw null;
            }
lbl365:
            // 2 sources

            case 61: {
                var3_2 /* !! */  = (int)hj.dcos("deje", dcoo(int ), (int)454);
                if (!var4_1) ** GOTO lbl174
                throw null;
            }
lbl369:
            // 2 sources

            case 62: {
                var3_2 /* !! */  = (int)hj.dcos("dejf", dcoo(int ), (int)455);
                if (!var4_1) ** GOTO lbl145
                throw null;
            }
            case 63: {
                var3_2 /* !! */  = (int)hj.dcos("dejg", dcoo(int ), (int)456);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl391
            }
            case 64: {
                var3_2 /* !! */  = (int)hj.dcos("dejh", dcoo(int ), (int)457);
                if (!var4_1) ** GOTO lbl352
                throw null;
            }
lbl382:
            // 3 sources

            case 65: {
                var3_2 /* !! */  = (int)hj.dcos("deji", dcoo(int ), (int)458);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl395
            }
            case 66: {
                var3_2 /* !! */  = (int)hj.dcos("dejj", dcoo(int ), (int)459);
                if (!var4_1) ** GOTO lbl369
                throw null;
            }
lbl391:
            // 3 sources

            case 67: {
                var3_2 /* !! */  = (int)hj.dcos("dejk", dcoo(int ), (int)460);
                if (!var4_1) ** GOTO lbl225
                throw null;
            }
lbl395:
            // 2 sources

            case 68: {
                var3_2 /* !! */  = (int)hj.dcos("dejl", dcoo(int ), (int)461);
                if (!var4_1) ** GOTO lbl239
                throw null;
            }
lbl399:
            // 3 sources

            case 69: {
                var3_2 /* !! */  = (int)hj.dcos("dejm", dcoo(int ), (int)462);
                if (!var4_1) ** GOTO lbl266
                throw null;
            }
            case 70: 
        }
        var3_2 /* !! */  = (int)hj.dcos("dejn", dcoo(int ), (int)463);
        ** while (!var4_1)
lbl406:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dglm() {
        hj.ddko[300] = -8324321071885683375L;
        hj.ddko[301] = 4931285205844332945L;
        hj.ddko[302] = 4932479102481700989L;
        hj.ddko[303] = 3218780787487784615L;
        hj.ddko[304] = 4665260396373682322L;
        hj.ddko[305] = -6538736554353011936L;
        hj.ddko[306] = 2557570847012595745L;
        hj.ddko[307] = -609680644187376347L;
        hj.ddko[308] = -4579300160712442838L;
        hj.ddko[309] = 3022279907741980952L;
        hj.ddko[310] = -1492843904382839628L;
        hj.ddko[311] = 3689745139001057790L;
        hj.ddko[312] = 3326925084020404871L;
        hj.ddko[313] = -8672315328299437063L;
        hj.ddko[314] = -5878404495291769422L;
        hj.ddko[315] = -8723149745842119348L;
        hj.ddko[316] = -4199984926584057015L;
        hj.ddko[317] = 631037267399994449L;
        hj.ddko[318] = -5552649653874003611L;
        hj.ddko[319] = 4641145970434564254L;
        hj.ddko[320] = 4711629869884541584L;
        hj.ddko[321] = 4638994147677024902L;
        hj.ddko[322] = -7760195871325422919L;
        hj.ddko[323] = 1860055839110151301L;
        hj.ddko[324] = 5271312981779855082L;
        hj.ddko[325] = -5690245418793501677L;
        hj.ddko[326] = 8481181709566327171L;
        hj.ddko[327] = -7895698166410890843L;
        hj.ddko[328] = 3080812575110202623L;
        hj.ddko[329] = -7926596226971904109L;
        hj.ddko[330] = -6127172948473483800L;
        hj.ddko[331] = -3182072989645682119L;
        hj.ddko[332] = -2680543059637583207L;
        hj.ddko[333] = 6153637740235420358L;
        hj.ddko[334] = 2628734910090552686L;
        hj.ddko[335] = -3034667545360767471L;
        hj.ddko[336] = -7397975690258548890L;
        hj.ddko[337] = -8822199313153944129L;
        hj.ddko[338] = 4883634206645915728L;
        hj.ddko[339] = -3991167184423304674L;
        hj.ddko[340] = 8300614468281213485L;
        hj.ddko[341] = 8334164901064758983L;
        hj.ddko[342] = 3409413913705107108L;
        hj.ddko[343] = 872749876692956259L;
        hj.ddko[344] = 5317473387726271515L;
        hj.ddko[345] = -4049631865289965630L;
        hj.ddko[346] = -8271084485994613566L;
        hj.ddko[347] = 835878771680931327L;
        hj.ddko[348] = -3397915585285884502L;
        hj.ddko[349] = 8387561848430132379L;
        hj.ddko[350] = -3540505797109720493L;
        hj.ddko[351] = -4060781146296407766L;
        hj.ddko[352] = 4606467791848164377L;
        hj.ddko[353] = 5967104326553816627L;
        hj.ddko[354] = 260831343537025334L;
        hj.ddko[355] = 1965354367865756119L;
        hj.ddko[356] = -7719884979402670528L;
        hj.ddko[357] = -3578881299422874194L;
        hj.ddko[358] = 5315143765845519703L;
        hj.ddko[359] = -2868541003570543590L;
        hj.ddko[360] = -2843381710767281879L;
        hj.ddko[361] = -2717960008184837104L;
        hj.ddko[362] = 163513344002707905L;
        hj.ddko[363] = -4120408998290707729L;
        hj.ddko[364] = 8103740920751509591L;
        hj.ddko[365] = 6628749180305811732L;
        hj.ddko[366] = 4977906188263000175L;
        hj.ddko[367] = 2962279343887505499L;
        hj.ddko[368] = -122481987988365152L;
        hj.ddko[369] = -2333049134077245939L;
        hj.ddko[370] = 9195668093825335276L;
        hj.ddko[371] = 7061067525288258787L;
        hj.ddko[372] = 3656993335911391163L;
        hj.ddko[373] = 8235026874901687132L;
        hj.ddko[374] = -1692445233901634332L;
        hj.ddko[375] = 8530668060412690638L;
        hj.ddko[376] = -1927677816638843546L;
        hj.ddko[377] = 5089467476105604899L;
        hj.ddko[378] = 928725363445200377L;
        hj.ddko[379] = 6891325878311714994L;
        hj.ddko[380] = 2917249687108411998L;
        hj.ddko[381] = 2937819932805812017L;
        hj.ddko[382] = -3792808691913962254L;
        hj.ddko[383] = -4518814843707205651L;
        hj.ddko[384] = 83809645579936987L;
        hj.ddko[385] = -3573257560935813191L;
        hj.ddko[386] = 7847247176859898392L;
        hj.ddko[387] = -2604012752463431364L;
        hj.ddko[388] = 2175540282500066754L;
        hj.ddko[389] = 1099847355845996114L;
        hj.ddko[390] = -874615246232592011L;
        hj.ddko[391] = 2770591085295416243L;
        hj.ddko[392] = -998942650489166962L;
        hj.ddko[393] = -6189292466071493333L;
        hj.ddko[394] = 2156229504228397354L;
        hj.ddko[395] = -4493048925320786829L;
        hj.ddko[396] = 1754787225484321272L;
        hj.ddko[397] = -466382418295288029L;
        hj.ddko[398] = 3058067050543841948L;
        hj.ddko[399] = 3473799260334645772L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private String getPotionName(class_1799 var1_1) {
        var8_2 = hj.c;
        var7_3 /* !! */  = hj.b;
        var6_4 = hj.a;
        if (var8_2) {
            throw null;
lbl6:
            // 17 sources

            return null;
        }
        if (var6_4 || var6_4) ** GOTO lbl6
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_1.method_65130() == null) ** GOTO lbl15
                if (var6_4 || var6_4) ** GOTO lbl6
                return var1_1.method_65130().getString();
lbl15:
                // 1 sources

                if (var6_4 || var6_4) ** GOTO lbl6
                var2_5 = (class_1844)var1_1.method_58694(class_9334.field_49651);
                if (var6_4 || var6_4) ** GOTO lbl6
                if (var2_5 != null) ** GOTO lbl21
                if (var6_4) ** GOTO lbl6
                return var1_1.method_7964().getString();
lbl21:
                // 1 sources

                if (var6_4 || var6_4) ** GOTO lbl6
                if (!var2_5.comp_2378().isPresent()) ** GOTO lbl25
                if (var6_4 || var6_4) ** GOTO lbl6
                return var2_5.method_64195("item.minecraft.splash_potion.effect.").getString();
lbl25:
                // 1 sources

                if (var6_4 || var6_4) ** GOTO lbl6
                var3_6 = new StringJoiner(" + ");
                if (var6_4 || var6_4) ** GOTO lbl6
                var4_7 = var2_5.method_57397().iterator();
                if (var6_4) ** GOTO lbl6
                do {
                    if (var6_4 || var6_4) ** GOTO lbl6
                    if (!var4_7.hasNext()) ** GOTO lbl41
                    if (var6_4) ** GOTO lbl6
                    var5_8 = (class_1293)var4_7.next();
                    if (var6_4 || var6_4) ** GOTO lbl6
                    var3_6.add(((class_1291)var5_8.method_5579().comp_349()).method_5560().getString() + " " + (var5_8.method_5578() + hj.dcos("dfpf", dcoo(int ), (int)805)));
                    if (var6_4 || var6_4) ** GOTO lbl6
                } while (!var8_2);
                throw null;
lbl41:
                // 1 sources

                if (var6_4 || var6_4) ** GOTO lbl6
                if (var3_6.length() != 0) ** GOTO lbl48
                if (var6_4) ** GOTO lbl6
                v0 = var1_1.method_7964().getString();
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl51
lbl48:
                // 1 sources

                if (!var6_4 && !var6_4) ** break;
                ** continue;
                v0 = var3_6.toString();
lbl51:
                // 2 sources

                return v0;
            }
            case 0: {
                var7_3 /* !! */  = (int)hj.dcos("dfpg", dcoo(int ), (int)806);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl156
            }
            case 1: {
                var7_3 /* !! */  = (int)hj.dcos("dfph", dcoo(int ), (int)807);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl189
            }
lbl62:
            // 2 sources

            case 2: {
                var7_3 /* !! */  = (int)hj.dcos("dfpi", dcoo(int ), (int)808);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl201
            }
            case 3: {
                var7_3 /* !! */  = (int)hj.dcos("dfpj", dcoo(int ), (int)809);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl193
            }
            case 4: {
                var7_3 /* !! */  = (int)hj.dcos("dfpk", dcoo(int ), (int)810);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl156
            }
lbl77:
            // 3 sources

            case 5: {
                var7_3 /* !! */  = (int)hj.dcos("dfpl", dcoo(int ), (int)811);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl110
            }
            case 6: {
                var7_3 /* !! */  = (int)hj.dcos("dfpm", dcoo(int ), (int)812);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl184
            }
lbl87:
            // 2 sources

            case 7: {
                var7_3 /* !! */  = (int)hj.dcos("dfpn", dcoo(int ), (int)813);
                if (!var8_2) ** GOTO lbl77
                throw null;
            }
            case 8: {
                var7_3 /* !! */  = (int)hj.dcos("dfpo", dcoo(int ), (int)814);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl168
            }
            case 9: {
                var7_3 /* !! */  = (int)hj.dcos("dfpp", dcoo(int ), (int)815);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl184
            }
lbl101:
            // 2 sources

            case 10: {
                var7_3 /* !! */  = (int)hj.dcos("dfpq", dcoo(int ), (int)816);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl137
            }
            case 11: {
                var7_3 /* !! */  = (int)hj.dcos("dfpr", dcoo(int ), (int)817);
                if (!var8_2) break;
                throw null;
            }
lbl110:
            // 2 sources

            case 12: {
                var7_3 /* !! */  = (int)hj.dcos("dfps", dcoo(int ), (int)818);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl151
            }
            case 13: {
                var7_3 /* !! */  = (int)hj.dcos("dfpt", dcoo(int ), (int)819);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl142
            }
            case 14: {
                var7_3 /* !! */  = (int)hj.dcos("dfpu", dcoo(int ), (int)820);
                if (!var8_2) ** GOTO lbl62
                throw null;
            }
            case 15: {
                var7_3 /* !! */  = (int)hj.dcos("dfpv", dcoo(int ), (int)821);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl193
            }
lbl129:
            // 3 sources

            case 16: {
                var7_3 /* !! */  = (int)hj.dcos("dfpw", dcoo(int ), (int)822);
                if (!var8_2) break;
                throw null;
            }
lbl133:
            // 2 sources

            case 17: {
                var7_3 /* !! */  = (int)hj.dcos("dfpx", dcoo(int ), (int)823);
                if (!var8_2) ** GOTO lbl129
                throw null;
            }
lbl137:
            // 3 sources

            case 18: {
                var7_3 /* !! */  = (int)hj.dcos("dfpy", dcoo(int ), (int)824);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl156
            }
lbl142:
            // 3 sources

            case 19: {
                var7_3 /* !! */  = (int)hj.dcos("dfpz", dcoo(int ), (int)825);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl156
            }
            case 20: {
                var7_3 /* !! */  = (int)hj.dcos("dfqa", dcoo(int ), (int)826);
                if (!var8_2) ** GOTO lbl129
                throw null;
            }
lbl151:
            // 2 sources

            case 21: {
                var7_3 /* !! */  = (int)hj.dcos("dfqb", dcoo(int ), (int)827);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl189
            }
lbl156:
            // 5 sources

            case 22: {
                var7_3 /* !! */  = (int)hj.dcos("dfqc", dcoo(int ), (int)828);
                if (var8_2) {
                    throw null;
                }
            }
            case 23: {
                var7_3 /* !! */  = (int)hj.dcos("dfqd", dcoo(int ), (int)829);
                if (var8_2) {
                    throw null;
                }
            }
lbl164:
            // 4 sources

            case 24: {
                var7_3 /* !! */  = (int)hj.dcos("dfqe", dcoo(int ), (int)830);
                if (!var8_2) ** GOTO lbl137
                throw null;
            }
lbl168:
            // 2 sources

            case 25: {
                var7_3 /* !! */  = (int)hj.dcos("dfqf", dcoo(int ), (int)831);
                if (!var8_2) ** GOTO lbl87
                throw null;
            }
            case 26: {
                var7_3 /* !! */  = (int)hj.dcos("dfqg", dcoo(int ), (int)832);
                if (!var8_2) ** GOTO lbl142
                throw null;
            }
            case 27: {
                var7_3 /* !! */  = (int)hj.dcos("dfqh", dcoo(int ), (int)833);
                if (!var8_2) ** GOTO lbl101
                throw null;
            }
            case 28: {
                var7_3 /* !! */  = (int)hj.dcos("dfqi", dcoo(int ), (int)834);
                if (var8_2) {
                    throw null;
                }
            }
lbl184:
            // 6 sources

            case 29: {
                var7_3 /* !! */  = (int)hj.dcos("dfqj", dcoo(int ), (int)835);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl189:
            // 3 sources

            case 30: {
                var7_3 /* !! */  = (int)hj.dcos("dfqk", dcoo(int ), (int)836);
                if (!var8_2) ** GOTO lbl77
                throw null;
            }
lbl193:
            // 3 sources

            case 31: {
                var7_3 /* !! */  = (int)hj.dcos("dfql", dcoo(int ), (int)837);
                if (!var8_2) ** GOTO lbl184
                throw null;
            }
lbl197:
            // 2 sources

            case 32: {
                var7_3 /* !! */  = (int)hj.dcos("dfqm", dcoo(int ), (int)838);
                if (!var8_2) ** GOTO lbl133
                throw null;
            }
lbl201:
            // 2 sources

            case 33: {
                var7_3 /* !! */  = (int)hj.dcos("dfqn", dcoo(int ), (int)839);
                if (!var8_2) ** GOTO lbl164
                throw null;
            }
            case 34: 
        }
        do {
            var7_3 /* !! */  = (int)hj.dcos("dfqo", dcoo(int ), (int)840);
        } while (!var8_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void selectPotion(int var1_1, class_1799 var2_2) {
        v0 /* !! */  = hj.he;
        if (true) ** GOTO lbl5
        block30: while (true) {
            v0 /* !! */  = (long)(hj.dcos("ddvg", ddkn(int ), (int)111) - hj.dcos("ddvf", ddkn(int ), (int)110));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 27539926: {
                    break block30;
                }
                case 647976973: {
                    continue block30;
                }
            }
            break;
        }
        var5_3 = hj.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = hj.he - hj.dcos("ddvh", ddkn(int ), (int)112)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hj.dcos("ddvi", dcoo(int ), (int)222)) break;
            v1 /* !! */  = (long)hj.dcos("ddvj", dcoo(int ), (int)223);
        }
        var4_4 /* !! */  = hj.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = hj.he - hj.dcos("ddvk", ddkn(int ), (int)113)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hj.dcos("ddvl", dcoo(int ), (int)224)) break;
            v2 /* !! */  = (long)hj.dcos("ddvm", dcoo(int ), (int)225);
        }
        var3_5 = hj.a;
        if (var5_3) {
            throw null;
lbl27:
            // 7 sources

            return;
        }
        if (var3_5 || var3_5) ** GOTO lbl27
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = hj.he - hj.dcos("ddvn", ddkn(int ), (int)114)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == hj.dcos("ddvo", dcoo(int ), (int)226)) break;
                    v3 /* !! */  = (long)hj.dcos("ddvp", dcoo(int ), (int)227);
                }
                if (!this.isRingSlot(var1_1)) ** GOTO lbl49
                if (var3_5) ** GOTO lbl27
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = hj.he - hj.dcos("ddvq", ddkn(int ), (int)115)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hj.dcos("ddvr", dcoo(int ), (int)228)) break;
                    v4 /* !! */  = (long)hj.dcos("ddvs", dcoo(int ), (int)229);
                }
                if (this.isSelectablePotion(var2_2)) ** GOTO lbl51
                if (var3_5) ** GOTO lbl27
lbl49:
                // 2 sources

                if (var3_5 || var3_5) ** GOTO lbl27
                return;
lbl51:
                // 1 sources

                if (var3_5 || var3_5) ** GOTO lbl27
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_4 = hj.he - hj.dcos("ddvt", ddkn(int ), (int)116)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == hj.dcos("ddvu", dcoo(int ), (int)230)) break;
                    v5 /* !! */  = (long)hj.dcos("ddvv", dcoo(int ), (int)231);
                }
                v6 = hj.dcos("ddvw", dcoo(int ), (int)232);
                v7 /* !! */  = hj.he;
                if (true) ** GOTO lbl63
                block37: while (true) {
                    v7 /* !! */  = (long)(hj.dcos("ddvy", ddkn(int ), (int)118) - hj.dcos("ddvx", ddkn(int ), (int)117));
lbl63:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -2022660304: {
                            continue block37;
                        }
                        case 27539926: {
                            break block37;
                        }
                    }
                    break;
                }
                this.selectedPotions[var1_1] = var2_2.method_46651((int)v6);
                if (var3_5 || var3_5) ** GOTO lbl27
                v8 /* !! */  = hj.he;
                if (true) ** GOTO lbl74
                block38: while (true) {
                    v8 /* !! */  = (long)(v9 - hj.dcos("ddvz", ddkn(int ), (int)119));
lbl74:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -879498588: {
                            v9 = hj.dcos("ddwa", ddkn(int ), (int)120);
                            continue block38;
                        }
                        case 27539926: {
                            break block38;
                        }
                        case 2106200800: {
                            v9 = hj.dcos("ddwb", ddkn(int ), (int)121);
                            continue block38;
                        }
                    }
                    break;
                }
                this.validateSelections();
                if (!var3_5 && !var3_5) ** break;
                ** continue;
                return;
            }
lbl87:
            // 2 sources

            case 0: {
                var4_4 /* !! */  = (int)hj.dcos("ddwc", dcoo(int ), (int)233);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl106
            }
lbl92:
            // 2 sources

            case 1: {
                var4_4 /* !! */  = (int)hj.dcos("ddwd", dcoo(int ), (int)234);
                if (!var5_3) ** GOTO lbl87
                throw null;
            }
            case 2: {
                var4_4 /* !! */  = (int)hj.dcos("ddwe", dcoo(int ), (int)235);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl135
            }
            case 3: {
                var4_4 /* !! */  = (int)hj.dcos("ddwf", dcoo(int ), (int)236);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl139
            }
lbl106:
            // 4 sources

            case 4: {
                var4_4 /* !! */  = (int)hj.dcos("ddwg", dcoo(int ), (int)237);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl135
            }
lbl111:
            // 2 sources

            case 5: {
                var4_4 /* !! */  = (int)hj.dcos("ddwh", dcoo(int ), (int)238);
                if (!var5_3) ** GOTO lbl106
                throw null;
            }
            case 6: {
                var4_4 /* !! */  = (int)hj.dcos("ddwi", dcoo(int ), (int)239);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl139
            }
            case 7: {
                do {
                    var4_4 /* !! */  = (int)hj.dcos("ddwj", dcoo(int ), (int)240);
                } while (!var5_3);
                throw null;
            }
            case 8: {
                var4_4 /* !! */  = (int)hj.dcos("ddwk", dcoo(int ), (int)241);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl139
            }
            case 9: {
                var4_4 /* !! */  = (int)hj.dcos("ddwl", dcoo(int ), (int)242);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl139
            }
lbl135:
            // 3 sources

            case 10: {
                var4_4 /* !! */  = (int)hj.dcos("ddwm", dcoo(int ), (int)243);
                if (!var5_3) ** GOTO lbl111
                throw null;
            }
lbl139:
            // 6 sources

            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)hj.dcos("ddwn", dcoo(int ), (int)244);
                    if (!var5_3) ** GOTO lbl92
                    throw null;
                }
            }
            case 12: {
                var4_4 /* !! */  = (int)hj.dcos("ddwo", dcoo(int ), (int)245);
                if (!var5_3) ** GOTO lbl106
                throw null;
            }
            case 13: {
                var4_4 /* !! */  = (int)hj.dcos("ddwp", dcoo(int ), (int)246);
                if (!var5_3) ** GOTO lbl139
                throw null;
            }
            case 14: 
        }
        var4_4 /* !! */  = (int)hj.dcos("ddwq", dcoo(int ), (int)247);
        ** while (!var5_3)
lbl155:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dglh() {
        hj.dcoq[900] = 1653836404;
        hj.dcoq[901] = 1765918022;
        hj.dcoq[902] = 1778425633;
        hj.dcoq[903] = -937678827;
        hj.dcoq[904] = 1589570838;
        hj.dcoq[905] = -657876782;
        hj.dcoq[906] = 1109956456;
        hj.dcoq[907] = -398853884;
        hj.dcoq[908] = -200091534;
        hj.dcoq[909] = 294080198;
        hj.dcoq[910] = -1007352496;
        hj.dcoq[911] = 986555935;
        hj.dcoq[912] = 1345663181;
        hj.dcoq[913] = -560940449;
        hj.dcoq[914] = 2115516155;
        hj.dcoq[915] = -399713176;
        hj.dcoq[916] = 1837871802;
        hj.dcoq[917] = -1787757141;
        hj.dcoq[918] = 1094656780;
        hj.dcoq[919] = 1086193657;
        hj.dcoq[920] = -1062325297;
        hj.dcoq[921] = -1865465685;
        hj.dcoq[922] = 518199198;
        hj.dcoq[923] = -1263065335;
        hj.dcoq[924] = 1314799153;
        hj.dcoq[925] = -2134548354;
        hj.dcoq[926] = -1840340479;
        hj.dcoq[927] = 1436667961;
        hj.dcoq[928] = 16556953;
        hj.dcoq[929] = 646212732;
        hj.dcoq[930] = 132843878;
        hj.dcoq[931] = -643678817;
        hj.dcoq[932] = 2146580993;
        hj.dcoq[933] = 1127599708;
        hj.dcoq[934] = -360288137;
        hj.dcoq[935] = -613937050;
        hj.dcoq[936] = -2004838147;
        hj.dcoq[937] = 470887769;
        hj.dcoq[938] = -383932075;
        hj.dcoq[939] = -749657649;
        hj.dcoq[940] = -1812192572;
        hj.dcoq[941] = -2110463858;
        hj.dcoq[942] = -698558665;
        hj.dcoq[943] = -1742878393;
        hj.dcoq[944] = -729851357;
        hj.dcoq[945] = 1587931860;
        hj.dcoq[946] = 1412717058;
        hj.dcoq[947] = -1397237917;
        hj.dcoq[948] = -1621515438;
        hj.dcoq[949] = -1104501948;
        hj.dcoq[950] = -294435089;
        hj.dcoq[951] = 1979438567;
        hj.dcoq[952] = -176179879;
        hj.dcoq[953] = 1439045545;
        hj.dcoq[954] = -205687920;
        hj.dcoq[955] = -348157952;
        hj.dcoq[956] = -205831717;
        hj.dcoq[957] = 81924805;
        hj.dcoq[958] = 1123313950;
        hj.dcoq[959] = 1155527149;
        hj.dcoq[960] = 1205727148;
        hj.dcoq[961] = 804903430;
        hj.dcoq[962] = -1926410483;
        hj.dcoq[963] = -554672008;
        hj.dcoq[964] = 597619605;
        hj.dcoq[965] = 725698720;
        hj.dcoq[966] = -1444401222;
        hj.dcoq[967] = 762006842;
        hj.dcoq[968] = -1075728245;
        hj.dcoq[969] = 1536540084;
        hj.dcoq[970] = -724978241;
        hj.dcoq[971] = 1171354466;
        hj.dcoq[972] = -20338908;
        hj.dcoq[973] = 2030913710;
        hj.dcoq[974] = 1252190855;
        hj.dcoq[975] = -1189155660;
        hj.dcoq[976] = -2146435664;
        hj.dcoq[977] = -1466289704;
        hj.dcoq[978] = -1579176949;
        hj.dcoq[979] = -32645168;
        hj.dcoq[980] = -660970312;
        hj.dcoq[981] = 1561321481;
        hj.dcoq[982] = -321637354;
        hj.dcoq[983] = -901510757;
        hj.dcoq[984] = 2100444775;
        hj.dcoq[985] = 307847726;
        hj.dcoq[986] = -991386230;
        hj.dcoq[987] = -1222332805;
        hj.dcoq[988] = -89506612;
        hj.dcoq[989] = 1521596777;
        hj.dcoq[990] = 93386440;
        hj.dcoq[991] = 1519045478;
        hj.dcoq[992] = -858792614;
        hj.dcoq[993] = -935486897;
        hj.dcoq[994] = -1584615863;
        hj.dcoq[995] = 1132256863;
        hj.dcoq[996] = -1802254513;
        hj.dcoq[997] = 1217286498;
        hj.dcoq[998] = -280494647;
        hj.dcoq[999] = -1780701174;
    }

    private static /* synthetic */ void dglb() {
        hj.dcoq[300] = -1348857083;
        hj.dcoq[301] = 2127498533;
        hj.dcoq[302] = 1712938678;
        hj.dcoq[303] = 276119242;
        hj.dcoq[304] = -1473685071;
        hj.dcoq[305] = 0x246642;
        hj.dcoq[306] = 1454921480;
        hj.dcoq[307] = -350286874;
        hj.dcoq[308] = 1224366713;
        hj.dcoq[309] = -657980197;
        hj.dcoq[310] = -1424292299;
        hj.dcoq[311] = -380168294;
        hj.dcoq[312] = -173152057;
        hj.dcoq[313] = -803615177;
        hj.dcoq[314] = 215329845;
        hj.dcoq[315] = 542938841;
        hj.dcoq[316] = -484875643;
        hj.dcoq[317] = -1211527941;
        hj.dcoq[318] = 1001027922;
        hj.dcoq[319] = 419539558;
        hj.dcoq[320] = 994381077;
        hj.dcoq[321] = -1885881068;
        hj.dcoq[322] = 738145859;
        hj.dcoq[323] = -952768686;
        hj.dcoq[324] = 1270795652;
        hj.dcoq[325] = 2013049306;
        hj.dcoq[326] = -444802694;
        hj.dcoq[327] = 898786243;
        hj.dcoq[328] = 543404030;
        hj.dcoq[329] = 546929266;
        hj.dcoq[330] = 981638586;
        hj.dcoq[331] = 806570998;
        hj.dcoq[332] = -940182909;
        hj.dcoq[333] = -1079498637;
        hj.dcoq[334] = 1503358443;
        hj.dcoq[335] = -244890746;
        hj.dcoq[336] = 318539482;
        hj.dcoq[337] = -1965597493;
        hj.dcoq[338] = 498973233;
        hj.dcoq[339] = 1845303021;
        hj.dcoq[340] = -205242426;
        hj.dcoq[341] = 1784102627;
        hj.dcoq[342] = -32830918;
        hj.dcoq[343] = 1132233035;
        hj.dcoq[344] = 1059724663;
        hj.dcoq[345] = -493075967;
        hj.dcoq[346] = 1128653015;
        hj.dcoq[347] = -1965094298;
        hj.dcoq[348] = -1671860925;
        hj.dcoq[349] = 1253989614;
        hj.dcoq[350] = 1032438990;
        hj.dcoq[351] = 187318513;
        hj.dcoq[352] = 488616085;
        hj.dcoq[353] = -1969121320;
        hj.dcoq[354] = 825918189;
        hj.dcoq[355] = 1394398481;
        hj.dcoq[356] = -1675395291;
        hj.dcoq[357] = 662639737;
        hj.dcoq[358] = -2082669214;
        hj.dcoq[359] = -1791731940;
        hj.dcoq[360] = 1768609897;
        hj.dcoq[361] = 355726455;
        hj.dcoq[362] = -639820726;
        hj.dcoq[363] = 1267310243;
        hj.dcoq[364] = -2089772982;
        hj.dcoq[365] = -114441714;
        hj.dcoq[366] = -1435913337;
        hj.dcoq[367] = 1952325042;
        hj.dcoq[368] = 315622171;
        hj.dcoq[369] = -1893581076;
        hj.dcoq[370] = -1211600426;
        hj.dcoq[371] = -183196586;
        hj.dcoq[372] = -1014457146;
        hj.dcoq[373] = 440057179;
        hj.dcoq[374] = -1777259233;
        hj.dcoq[375] = 1945393247;
        hj.dcoq[376] = 139181896;
        hj.dcoq[377] = 221865893;
        hj.dcoq[378] = 1231101967;
        hj.dcoq[379] = -641931930;
        hj.dcoq[380] = 627614814;
        hj.dcoq[381] = -878634573;
        hj.dcoq[382] = 747367652;
        hj.dcoq[383] = 117385489;
        hj.dcoq[384] = -654125440;
        hj.dcoq[385] = -347164425;
        hj.dcoq[386] = -78022265;
        hj.dcoq[387] = -23208043;
        hj.dcoq[388] = -1869988594;
        hj.dcoq[389] = 729609867;
        hj.dcoq[390] = -1799554849;
        hj.dcoq[391] = 2064520316;
        hj.dcoq[392] = -953468983;
        hj.dcoq[393] = 1243252634;
        hj.dcoq[394] = -211634845;
        hj.dcoq[395] = 1059543975;
        hj.dcoq[396] = -1990165116;
        hj.dcoq[397] = 2095800318;
        hj.dcoq[398] = -357076751;
        hj.dcoq[399] = 1641027222;
    }

    private static /* synthetic */ void dgle() {
        hj.dcoq[600] = -1443787563;
        hj.dcoq[601] = 996405578;
        hj.dcoq[602] = -2013154055;
        hj.dcoq[603] = -1712121897;
        hj.dcoq[604] = -570026625;
        hj.dcoq[605] = -263891821;
        hj.dcoq[606] = 1604447869;
        hj.dcoq[607] = 706868976;
        hj.dcoq[608] = 1473322731;
        hj.dcoq[609] = -428937383;
        hj.dcoq[610] = 1783427849;
        hj.dcoq[611] = 1378192168;
        hj.dcoq[612] = -599723220;
        hj.dcoq[613] = 2087118376;
        hj.dcoq[614] = 62093988;
        hj.dcoq[615] = 1124717027;
        hj.dcoq[616] = -1369647143;
        hj.dcoq[617] = 1676907284;
        hj.dcoq[618] = 1796239832;
        hj.dcoq[619] = -1251995671;
        hj.dcoq[620] = -987710242;
        hj.dcoq[621] = -215519744;
        hj.dcoq[622] = 244840104;
        hj.dcoq[623] = -2018263737;
        hj.dcoq[624] = 2103739537;
        hj.dcoq[625] = 2030875933;
        hj.dcoq[626] = -1549487934;
        hj.dcoq[627] = 789039987;
        hj.dcoq[628] = -312002301;
        hj.dcoq[629] = -482043471;
        hj.dcoq[630] = -362415888;
        hj.dcoq[631] = 1985980850;
        hj.dcoq[632] = 1346880152;
        hj.dcoq[633] = -1662651111;
        hj.dcoq[634] = 17073108;
        hj.dcoq[635] = 1286187966;
        hj.dcoq[636] = 574223322;
        hj.dcoq[637] = -115095023;
        hj.dcoq[638] = -2024111148;
        hj.dcoq[639] = 1301722786;
        hj.dcoq[640] = 1138753161;
        hj.dcoq[641] = -435939791;
        hj.dcoq[642] = -1799915950;
        hj.dcoq[643] = 705284856;
        hj.dcoq[644] = 1986661241;
        hj.dcoq[645] = -152473389;
        hj.dcoq[646] = -737868129;
        hj.dcoq[647] = 136687425;
        hj.dcoq[648] = 727777811;
        hj.dcoq[649] = -873471056;
        hj.dcoq[650] = -340195289;
        hj.dcoq[651] = -1288786659;
        hj.dcoq[652] = 1991691632;
        hj.dcoq[653] = 1916968034;
        hj.dcoq[654] = -149785106;
        hj.dcoq[655] = -639063606;
        hj.dcoq[656] = -1622961538;
        hj.dcoq[657] = -181633859;
        hj.dcoq[658] = -1489979727;
        hj.dcoq[659] = -2022362058;
        hj.dcoq[660] = 985538979;
        hj.dcoq[661] = -877365749;
        hj.dcoq[662] = 1950104915;
        hj.dcoq[663] = -868373288;
        hj.dcoq[664] = -1454349609;
        hj.dcoq[665] = -447619738;
        hj.dcoq[666] = 2052978519;
        hj.dcoq[667] = 1622576982;
        hj.dcoq[668] = 2065889542;
        hj.dcoq[669] = 2061442049;
        hj.dcoq[670] = 1992577493;
        hj.dcoq[671] = 1645777583;
        hj.dcoq[672] = 1705154167;
        hj.dcoq[673] = -1821346499;
        hj.dcoq[674] = -1335987328;
        hj.dcoq[675] = -1810717406;
        hj.dcoq[676] = -1491556759;
        hj.dcoq[677] = -187851030;
        hj.dcoq[678] = 846547327;
        hj.dcoq[679] = 1656615591;
        hj.dcoq[680] = -1814469363;
        hj.dcoq[681] = 1355993577;
        hj.dcoq[682] = -484248261;
        hj.dcoq[683] = -678158285;
        hj.dcoq[684] = -1224068228;
        hj.dcoq[685] = 1732549207;
        hj.dcoq[686] = 2040594605;
        hj.dcoq[687] = 1813235061;
        hj.dcoq[688] = 380647196;
        hj.dcoq[689] = 175863337;
        hj.dcoq[690] = 898842245;
        hj.dcoq[691] = -1710820123;
        hj.dcoq[692] = 105771031;
        hj.dcoq[693] = -587278054;
        hj.dcoq[694] = 1880547019;
        hj.dcoq[695] = -827547626;
        hj.dcoq[696] = 600591129;
        hj.dcoq[697] = -1808520253;
        hj.dcoq[698] = -134416528;
        hj.dcoq[699] = -1604835672;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ hj$PlayerPotionHit lambda$onPacket$0(class_1657 var0, UUID var1_1) {
        v0 /* !! */  = hj.he;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(hj.dcos("dgjs", ddkn(int ), (int)443) - hj.dcos("dgjr", ddkn(int ), (int)442));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 27539926: {
                    break block17;
                }
                case 1163009627: {
                    continue block17;
                }
            }
            break;
        }
        var4_2 = hj.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = hj.he - hj.dcos("dgjt", ddkn(int ), (int)444)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == hj.dcos("dgju", dcoo(int ), (int)1020)) break;
            v1 /* !! */  = (long)hj.dcos("dgjv", dcoo(int ), (int)1021);
        }
        var3_3 = hj.b;
        v2 /* !! */  = hj.he;
        if (true) ** GOTO lbl21
        block19: while (true) {
            v2 /* !! */  = (long)(hj.dcos("dgjx", ddkn(int ), (int)446) - hj.dcos("dgjw", ddkn(int ), (int)445));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 27539926: {
                    break block19;
                }
                case 451661328: {
                    continue block19;
                }
            }
            break;
        }
        var2_4 = hj.a;
        if (var4_2) {
            throw null;
lbl29:
            // 1 sources

            return null;
        }
        ** while (var2_4 || var2_4)
lbl32:
        // 1 sources

        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = hj.he - hj.dcos("dgjy", ddkn(int ), (int)447)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == hj.dcos("dgjz", dcoo(int ), (int)1022)) break;
            v3 /* !! */  = (long)hj.dcos("dgka", dcoo(int ), (int)1023);
        }
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = hj.he - hj.dcos("dgkb", ddkn(int ), (int)448)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == hj.dcos("dgkc", dcoo(int ), (int)1024)) break;
            v4 /* !! */  = (long)hj.dcos("dgkd", dcoo(int ), (int)1025);
        }
        v5 = var0.method_5477();
        v6 /* !! */  = hj.he;
        if (true) ** GOTO lbl47
        block23: while (true) {
            v6 /* !! */  = (long)(v7 - hj.dcos("dgke", ddkn(int ), (int)449));
lbl47:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -656090823: {
                    v7 = hj.dcos("dgkf", ddkn(int ), (int)450);
                    continue block23;
                }
                case 27539926: {
                    break block23;
                }
                case 330220343: {
                    v7 = hj.dcos("dgkg", ddkn(int ), (int)451);
                    continue block23;
                }
            }
            break;
        }
        v8 = v5.getString();
        v9 /* !! */  = hj.he;
        if (true) ** GOTO lbl61
        block24: while (true) {
            v9 /* !! */  = (long)(hj.dcos("dgki", ddkn(int ), (int)453) - hj.dcos("dgkh", ddkn(int ), (int)452));
lbl61:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -360619427: {
                    continue block24;
                }
                case 27539926: {
                    break block24;
                }
            }
            break;
        }
        return new hj$PlayerPotionHit(v8);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private String formatDuration(int var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hj.he - hj.dcos("dfuj", ddkn(int ), (int)374)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == hj.dcos("dfuk", dcoo(int ), (int)919)) break;
            v0 /* !! */  = (long)hj.dcos("dful", dcoo(int ), (int)920);
        }
        var5_2 = hj.c;
        v1 /* !! */  = hj.he;
        if (true) ** GOTO lbl11
        block25: while (true) {
            v1 /* !! */  = (long)(v2 - hj.dcos("dfum", ddkn(int ), (int)375));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1986187573: {
                    v2 = hj.dcos("dfun", ddkn(int ), (int)376);
                    continue block25;
                }
                case -369780208: {
                    v2 = hj.dcos("dfuo", ddkn(int ), (int)377);
                    continue block25;
                }
                case 27539926: {
                    break block25;
                }
                case 1134952621: {
                    v2 = hj.dcos("dfuu", ddkn(int ), (int)378);
                    continue block25;
                }
            }
            break;
        }
        var4_3 /* !! */  = hj.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = hj.he - hj.dcos("dfuv", ddkn(int ), (int)379)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == hj.dcos("dfux", dcoo(int ), (int)921)) break;
            v3 /* !! */  = (long)hj.dcos("dfuy", dcoo(int ), (int)922);
        }
        var3_4 = hj.a;
        if (!var5_2) ** GOTO lbl36
        throw null;
lbl-1000:
        // 2 sources

        {
            if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var4_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl36:
                // 1 sources

                if (var3_4 || var3_4) ** GOTO lbl-1000
                v4 = hj.dcos("dfuz", dcoo(int ), (int)923);
                v5 = var1_1 / hj.dcos("dfva", dcoo(int ), (int)924);
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = hj.he - hj.dcos("dfvb", ddkn(int ), (int)380)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == hj.dcos("dfvc", dcoo(int ), (int)925)) break;
                    v6 /* !! */  = (long)hj.dcos("dfvd", dcoo(int ), (int)926);
                }
                var2_5 = Math.max((int)v4, v5);
                if (var3_4 || var3_4) continue block27;
                v7 = var2_5 / hj.dcos("dfve", dcoo(int ), (int)927);
                v8 = new Object[1];
                v9 = hj.dcos("dfvf", dcoo(int ), (int)928);
                v10 = var2_5 % hj.dcos("dfvg", dcoo(int ), (int)929);
                v11 /* !! */  = hj.he;
                if (true) ** GOTO lbl54
                block29: while (true) {
                    v11 /* !! */  = (long)(hj.dcos("dfvi", ddkn(int ), (int)382) - hj.dcos("dfvh", ddkn(int ), (int)381));
lbl54:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1880537420: {
                            continue block29;
                        }
                        case 27539926: {
                            break block29;
                        }
                    }
                    break;
                }
                v8[v9] = v10;
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_3 = hj.he - hj.dcos("dfvj", ddkn(int ), (int)383)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == hj.dcos("dfvk", dcoo(int ), (int)930)) break;
                    v12 /* !! */  = (long)hj.dcos("dfvl", dcoo(int ), (int)931);
                }
                v13 = String.format("%02d", v8);
                v14 /* !! */  = hj.he;
                if (true) ** GOTO lbl70
                block31: while (true) {
                    v14 /* !! */  = (long)(v15 - hj.dcos("dfvt", ddkn(int ), (int)384));
lbl70:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1231205296: {
                            v15 = hj.dcos("dfvu", ddkn(int ), (int)385);
                            continue block31;
                        }
                        case 27539926: {
                            break block31;
                        }
                        case 89912251: {
                            v15 = hj.dcos("dfvw", ddkn(int ), (int)386);
                            continue block31;
                        }
                        case 513129131: {
                            v15 = hj.dcos("dfvx", ddkn(int ), (int)387);
                            continue block31;
                        }
                    }
                    break;
                }
                return v7 + ":" + v13;
lbl83:
                // 2 sources

                case 0: {
                    var4_3 /* !! */  = (int)hj.dcos("dfwe", dcoo(int ), (int)932);
                    if (var5_2) {
                        throw null;
                    }
                }
lbl87:
                // 4 sources

                case 1: {
                    var4_3 /* !! */  = (int)hj.dcos("dfwf", dcoo(int ), (int)933);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl96
                }
lbl92:
                // 2 sources

                case 2: {
                    var4_3 /* !! */  = (int)hj.dcos("dfwg", dcoo(int ), (int)934);
                    if (!var5_2) ** GOTO lbl87
                    throw null;
                }
lbl96:
                // 2 sources

                case 3: {
                    var4_3 /* !! */  = (int)hj.dcos("dfwh", dcoo(int ), (int)935);
                    if (!var5_2) ** GOTO lbl83
                    throw null;
                }
                case 4: {
                    var4_3 /* !! */  = (int)hj.dcos("dfwi", dcoo(int ), (int)936);
                    if (!var5_2) ** GOTO lbl92
                    throw null;
                }
                case 5: 
            }
        }
        do {
            var4_3 /* !! */  = (int)hj.dcos("dfwj", dcoo(int ), (int)937);
        } while (!var5_2);
        throw null;
    }

    private static /* synthetic */ void dgky() {
        hj.dcoq[0] = -1992329052;
        hj.dcoq[1] = -1935044132;
        hj.dcoq[2] = -1718499311;
        hj.dcoq[3] = -692660752;
        hj.dcoq[4] = 1566643115;
        hj.dcoq[5] = -370099470;
        hj.dcoq[6] = -732136653;
        hj.dcoq[7] = -839822818;
        hj.dcoq[8] = 1207057759;
        hj.dcoq[9] = -366160737;
        hj.dcoq[10] = 884043219;
        hj.dcoq[11] = 1054011723;
        hj.dcoq[12] = -1232789636;
        hj.dcoq[13] = -1923310920;
        hj.dcoq[14] = 1804374442;
        hj.dcoq[15] = -2025940376;
        hj.dcoq[16] = 1733593954;
        hj.dcoq[17] = -876371473;
        hj.dcoq[18] = -459599946;
        hj.dcoq[19] = -1184579271;
        hj.dcoq[20] = 1798031148;
        hj.dcoq[21] = 239903063;
        hj.dcoq[22] = -1815007885;
        hj.dcoq[23] = 879932800;
        hj.dcoq[24] = -699033600;
        hj.dcoq[25] = -1526181849;
        hj.dcoq[26] = -849555128;
        hj.dcoq[27] = 751124569;
        hj.dcoq[28] = 130096552;
        hj.dcoq[29] = -208282691;
        hj.dcoq[30] = 1272404548;
        hj.dcoq[31] = 148714471;
        hj.dcoq[32] = -1721740447;
        hj.dcoq[33] = 1284389350;
        hj.dcoq[34] = -678379767;
        hj.dcoq[35] = 991613232;
        hj.dcoq[36] = 414009843;
        hj.dcoq[37] = 383507292;
        hj.dcoq[38] = 16328712;
        hj.dcoq[39] = -1053874107;
        hj.dcoq[40] = -8360191;
        hj.dcoq[41] = -562265457;
        hj.dcoq[42] = 1590524142;
        hj.dcoq[43] = -276769114;
        hj.dcoq[44] = 221476258;
        hj.dcoq[45] = 1707295400;
        hj.dcoq[46] = -1040286371;
        hj.dcoq[47] = -1967929373;
        hj.dcoq[48] = -340675537;
        hj.dcoq[49] = -116593974;
        hj.dcoq[50] = -862868257;
        hj.dcoq[51] = 844749958;
        hj.dcoq[52] = -456127650;
        hj.dcoq[53] = -46571110;
        hj.dcoq[54] = 2033564183;
        hj.dcoq[55] = -1345545424;
        hj.dcoq[56] = -1890342257;
        hj.dcoq[57] = -1078343637;
        hj.dcoq[58] = 874318858;
        hj.dcoq[59] = -367993883;
        hj.dcoq[60] = 1541757394;
        hj.dcoq[61] = -1292871062;
        hj.dcoq[62] = 1886384768;
        hj.dcoq[63] = -1422899394;
        hj.dcoq[64] = 406802840;
        hj.dcoq[65] = -813161268;
        hj.dcoq[66] = -970521165;
        hj.dcoq[67] = -1089242263;
        hj.dcoq[68] = 1819247576;
        hj.dcoq[69] = -17158633;
        hj.dcoq[70] = 787192074;
        hj.dcoq[71] = -1230747645;
        hj.dcoq[72] = 932095549;
        hj.dcoq[73] = -1102781404;
        hj.dcoq[74] = 2017534581;
        hj.dcoq[75] = 2128943899;
        hj.dcoq[76] = 925969889;
        hj.dcoq[77] = 1128846237;
        hj.dcoq[78] = 1414686743;
        hj.dcoq[79] = 1551535986;
        hj.dcoq[80] = -1459163322;
        hj.dcoq[81] = -2034170927;
        hj.dcoq[82] = 2051450433;
        hj.dcoq[83] = 1396957121;
        hj.dcoq[84] = 921049643;
        hj.dcoq[85] = -2113801544;
        hj.dcoq[86] = -1018409395;
        hj.dcoq[87] = 867211652;
        hj.dcoq[88] = -1952911063;
        hj.dcoq[89] = -701852306;
        hj.dcoq[90] = 1364217551;
        hj.dcoq[91] = -1345146468;
        hj.dcoq[92] = 1428395118;
        hj.dcoq[93] = -1258177673;
        hj.dcoq[94] = -2071377884;
        hj.dcoq[95] = -204733155;
        hj.dcoq[96] = 1630477158;
        hj.dcoq[97] = 1632160094;
        hj.dcoq[98] = -1026378172;
        hj.dcoq[99] = 1229220342;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private String percentColor(int var1_1) {
        block40: {
            block39: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = hj.he - hj.dcos("dftd", ddkn(int ), (int)367)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v0 /* !! */  == hj.dcos("dfte", dcoo(int ), (int)904)) break;
                    v0 /* !! */  = (long)hj.dcos("dfth", dcoo(int ), (int)905);
                }
                var4_2 = hj.c;
                v1 /* !! */  = hj.he;
                if (true) ** GOTO lbl12
                block24: while (true) {
                    v1 /* !! */  = (long)(v2 - hj.dcos("dfti", ddkn(int ), (int)368));
lbl12:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case -1904078629: {
                            v2 = hj.dcos("dftj", ddkn(int ), (int)369);
                            continue block24;
                        }
                        case 27539926: {
                            break block24;
                        }
                        case 1848299417: {
                            v2 = hj.dcos("dftl", ddkn(int ), (int)370);
                            continue block24;
                        }
                    }
                    break;
                }
                var3_3 /* !! */  = hj.b;
                v3 /* !! */  = hj.he;
                if (true) ** GOTO lbl26
                block25: while (true) {
                    v3 /* !! */  = (long)(v4 - hj.dcos("dftn", ddkn(int ), (int)371));
lbl26:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -2027313834: {
                            v4 = hj.dcos("dfto", ddkn(int ), (int)372);
                            continue block25;
                        }
                        case -1932806772: {
                            v4 = hj.dcos("dftq", ddkn(int ), (int)373);
                            continue block25;
                        }
                        case 27539926: {
                            break block25;
                        }
                    }
                    break;
                }
                var2_4 = hj.a;
                if (var4_2) {
                    throw null;
lbl38:
                    // 5 sources

                    return null;
                }
                if (var2_4 || var2_4) ** GOTO lbl38
                if (var1_1 < hj.dcos("dftr", dcoo(int ), (int)906)) break block39;
                if (var2_4) ** GOTO lbl38
                return "\u00a7a";
            }
            if (var2_4 || var2_4) ** GOTO lbl38
            if (var1_1 < hj.dcos("dfts", dcoo(int ), (int)907)) break block40;
            if (var2_4) ** GOTO lbl38
            return "\u00a7e";
        }
        if (!var2_4 && !var2_4) ** break;
        ** while (true)
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return "\u00a7c";
            }
lbl56:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)hj.dcos("dftt", dcoo(int ), (int)908);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl98
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)hj.dcos("dftu", dcoo(int ), (int)909);
                } while (!var4_2);
                throw null;
            }
lbl66:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)hj.dcos("dftv", dcoo(int ), (int)910);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl98
            }
            case 3: {
                do {
                    var3_3 /* !! */  = (int)hj.dcos("dftw", dcoo(int ), (int)911);
                } while (!var4_2);
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)hj.dcos("dftx", dcoo(int ), (int)912);
                if (!var4_2) ** GOTO lbl66
                throw null;
            }
            case 5: {
                do {
                    var3_3 /* !! */  = (int)hj.dcos("dftz", dcoo(int ), (int)913);
                } while (!var4_2);
                throw null;
            }
lbl85:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)hj.dcos("dfua", dcoo(int ), (int)914);
                if (var4_2) {
                    throw null;
                }
            }
            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hj.dcos("dfub", dcoo(int ), (int)915);
                    if (!var4_2) ** GOTO lbl85
                    throw null;
                }
            }
            case 8: {
                var3_3 /* !! */  = (int)hj.dcos("dfuc", dcoo(int ), (int)916);
                if (!var4_2) break;
                throw null;
            }
lbl98:
            // 3 sources

            case 9: {
                var3_3 /* !! */  = (int)hj.dcos("dfud", dcoo(int ), (int)917);
                if (!var4_2) ** GOTO lbl56
                throw null;
            }
            case 10: 
        }
        var3_3 /* !! */  = (int)hj.dcos("dfue", dcoo(int ), (int)918);
        ** while (!var4_2)
lbl105:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dglp() {
        hj.ddkp[100] = -8435870788504577926L;
        hj.ddkp[101] = 847823358402730097L;
        hj.ddkp[102] = -9221922069945700359L;
        hj.ddkp[103] = -7429869603782176647L;
        hj.ddkp[104] = 5329000396458832819L;
        hj.ddkp[105] = -2936895433037232861L;
        hj.ddkp[106] = 2471683449318284202L;
        hj.ddkp[107] = 7795697445597837369L;
        hj.ddkp[108] = -5496479131465891657L;
        hj.ddkp[109] = -4240549402191686994L;
        hj.ddkp[110] = 7304578675538673787L;
        hj.ddkp[111] = -8127849548740306371L;
        hj.ddkp[112] = -437925559226036039L;
        hj.ddkp[113] = 3153511598179308586L;
        hj.ddkp[114] = -6714949644433763108L;
        hj.ddkp[115] = 1834656990788734950L;
        hj.ddkp[116] = -1733609414061166570L;
        hj.ddkp[117] = 2785000059355661755L;
        hj.ddkp[118] = 3241208657451742221L;
        hj.ddkp[119] = -5629465291720632056L;
        hj.ddkp[120] = 855472865682970445L;
        hj.ddkp[121] = -3192234808814989296L;
        hj.ddkp[122] = 6176723433551662677L;
        hj.ddkp[123] = 5698875216406544983L;
        hj.ddkp[124] = 1658206196404524186L;
        hj.ddkp[125] = 6361702593557727581L;
        hj.ddkp[126] = -8583274767883284492L;
        hj.ddkp[127] = -4927128010118281097L;
        hj.ddkp[128] = -7307047773769878263L;
        hj.ddkp[129] = 8027780893681616610L;
        hj.ddkp[130] = 7429564309950945157L;
        hj.ddkp[131] = 5889600113829877950L;
        hj.ddkp[132] = 3510979546039020130L;
        hj.ddkp[133] = 8981200345757557486L;
        hj.ddkp[134] = 900256676516772162L;
        hj.ddkp[135] = 7408818878559441146L;
        hj.ddkp[136] = 5029591540730164576L;
        hj.ddkp[137] = 4465203653721546584L;
        hj.ddkp[138] = -8066810482079971139L;
        hj.ddkp[139] = -888439387573577488L;
        hj.ddkp[140] = 1814763435403443310L;
        hj.ddkp[141] = -4342284311468944250L;
        hj.ddkp[142] = -3170717105143139119L;
        hj.ddkp[143] = -1719081052695040833L;
        hj.ddkp[144] = -7191412549178883285L;
        hj.ddkp[145] = -418052963897400855L;
        hj.ddkp[146] = 2765913565272266801L;
        hj.ddkp[147] = 3484217465501188575L;
        hj.ddkp[148] = -6428798256143584496L;
        hj.ddkp[149] = 333415258629074571L;
        hj.ddkp[150] = 3979239148138830517L;
        hj.ddkp[151] = 2734235263928375069L;
        hj.ddkp[152] = -647398190383661566L;
        hj.ddkp[153] = 3795795182467061910L;
        hj.ddkp[154] = 78969252236433535L;
        hj.ddkp[155] = 1595974343559187446L;
        hj.ddkp[156] = -6584156245294355342L;
        hj.ddkp[157] = 4225064158855539385L;
        hj.ddkp[158] = -2219794120812206959L;
        hj.ddkp[159] = 5280511236354356689L;
        hj.ddkp[160] = -4117202277218618333L;
        hj.ddkp[161] = -3032053994722783196L;
        hj.ddkp[162] = -5108675479019927387L;
        hj.ddkp[163] = -2838354577032086097L;
        hj.ddkp[164] = -2523929897837926219L;
        hj.ddkp[165] = 5883774853984453361L;
        hj.ddkp[166] = 825732626284347706L;
        hj.ddkp[167] = 8573238859413425090L;
        hj.ddkp[168] = 240098151418375566L;
        hj.ddkp[169] = 873106824147105736L;
        hj.ddkp[170] = 7200693807612286862L;
        hj.ddkp[171] = -4037039231306904836L;
        hj.ddkp[172] = -1772561217163559793L;
        hj.ddkp[173] = 7839625012029565985L;
        hj.ddkp[174] = -5349587978191531421L;
        hj.ddkp[175] = 5897217562755643886L;
        hj.ddkp[176] = -3399930828649763787L;
        hj.ddkp[177] = 5944789931216331591L;
        hj.ddkp[178] = 9098842326218973060L;
        hj.ddkp[179] = -594114966002415211L;
        hj.ddkp[180] = 1299564887897167606L;
        hj.ddkp[181] = 2795085517338848154L;
        hj.ddkp[182] = -7490988780941491978L;
        hj.ddkp[183] = 6433390555836049912L;
        hj.ddkp[184] = -5102289497747005482L;
        hj.ddkp[185] = 6212992728134756833L;
        hj.ddkp[186] = 707339221595873983L;
        hj.ddkp[187] = 3265567103538816952L;
        hj.ddkp[188] = 3536782313706369784L;
        hj.ddkp[189] = 7541152969854685175L;
        hj.ddkp[190] = -1454785774501446583L;
        hj.ddkp[191] = 5206751353581493814L;
        hj.ddkp[192] = 6375363743981108728L;
        hj.ddkp[193] = 6251288246731769510L;
        hj.ddkp[194] = 2696608543058196421L;
        hj.ddkp[195] = -6623848728503259587L;
        hj.ddkp[196] = -8156330330673471345L;
        hj.ddkp[197] = 3355888151822511431L;
        hj.ddkp[198] = 1468440722208777638L;
        hj.ddkp[199] = 415415955364044283L;
    }

    private static /* synthetic */ void dgld() {
        hj.dcoq[500] = -490660939;
        hj.dcoq[501] = 648090996;
        hj.dcoq[502] = -2142964722;
        hj.dcoq[503] = -1672378303;
        hj.dcoq[504] = -2094827766;
        hj.dcoq[505] = -553032550;
        hj.dcoq[506] = 1966652540;
        hj.dcoq[507] = 1301551549;
        hj.dcoq[508] = 754117906;
        hj.dcoq[509] = 639492862;
        hj.dcoq[510] = 1974240406;
        hj.dcoq[511] = -1802302331;
        hj.dcoq[512] = 1604853033;
        hj.dcoq[513] = 44836594;
        hj.dcoq[514] = -975942772;
        hj.dcoq[515] = 426164050;
        hj.dcoq[516] = -1939784405;
        hj.dcoq[517] = -1277814511;
        hj.dcoq[518] = -1226935292;
        hj.dcoq[519] = 1954280605;
        hj.dcoq[520] = 903506845;
        hj.dcoq[521] = -1450244505;
        hj.dcoq[522] = 710582456;
        hj.dcoq[523] = -1574720215;
        hj.dcoq[524] = 600842544;
        hj.dcoq[525] = 905541406;
        hj.dcoq[526] = -1001341346;
        hj.dcoq[527] = -1856572910;
        hj.dcoq[528] = 1680937973;
        hj.dcoq[529] = 521054321;
        hj.dcoq[530] = -427712963;
        hj.dcoq[531] = 25796040;
        hj.dcoq[532] = -433625585;
        hj.dcoq[533] = 124593995;
        hj.dcoq[534] = -1233246717;
        hj.dcoq[535] = -542904019;
        hj.dcoq[536] = -463394603;
        hj.dcoq[537] = -258719916;
        hj.dcoq[538] = 1881488806;
        hj.dcoq[539] = 2088919066;
        hj.dcoq[540] = -2125388085;
        hj.dcoq[541] = -1427990372;
        hj.dcoq[542] = -582443388;
        hj.dcoq[543] = -463752535;
        hj.dcoq[544] = 1926983770;
        hj.dcoq[545] = -1041925507;
        hj.dcoq[546] = 311567603;
        hj.dcoq[547] = -1683068309;
        hj.dcoq[548] = -1970847312;
        hj.dcoq[549] = 663353589;
        hj.dcoq[550] = -502046911;
        hj.dcoq[551] = -348447985;
        hj.dcoq[552] = -1259733277;
        hj.dcoq[553] = -1983162809;
        hj.dcoq[554] = -797526828;
        hj.dcoq[555] = -1482045390;
        hj.dcoq[556] = -2031917313;
        hj.dcoq[557] = -402427411;
        hj.dcoq[558] = 617098594;
        hj.dcoq[559] = -1013099156;
        hj.dcoq[560] = 1949985058;
        hj.dcoq[561] = -1362445954;
        hj.dcoq[562] = 1089312107;
        hj.dcoq[563] = -1550636770;
        hj.dcoq[564] = 1402838987;
        hj.dcoq[565] = 679174329;
        hj.dcoq[566] = 1584128258;
        hj.dcoq[567] = -1498659959;
        hj.dcoq[568] = -965978131;
        hj.dcoq[569] = 1165747037;
        hj.dcoq[570] = 853039489;
        hj.dcoq[571] = -200908802;
        hj.dcoq[572] = 1180744133;
        hj.dcoq[573] = -773563090;
        hj.dcoq[574] = -212856043;
        hj.dcoq[575] = -1392594740;
        hj.dcoq[576] = -269101472;
        hj.dcoq[577] = 532297114;
        hj.dcoq[578] = -1200609333;
        hj.dcoq[579] = -1325696946;
        hj.dcoq[580] = 358822746;
        hj.dcoq[581] = 503078959;
        hj.dcoq[582] = -1948434400;
        hj.dcoq[583] = 1102708640;
        hj.dcoq[584] = -1888225969;
        hj.dcoq[585] = -442848318;
        hj.dcoq[586] = -2098985421;
        hj.dcoq[587] = 133564519;
        hj.dcoq[588] = 1678944944;
        hj.dcoq[589] = -499813568;
        hj.dcoq[590] = 671668478;
        hj.dcoq[591] = 1099675500;
        hj.dcoq[592] = 63665849;
        hj.dcoq[593] = 15547083;
        hj.dcoq[594] = 1583217283;
        hj.dcoq[595] = -1432618810;
        hj.dcoq[596] = -915206974;
        hj.dcoq[597] = -1715918219;
        hj.dcoq[598] = -1840124603;
        hj.dcoq[599] = 1817215544;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private String describeReceivedEffects(hj$PlayerPotionHit var1_1) {
        block62: {
            var10_2 = hj.c;
            var9_3 /* !! */  = hj.b;
            var8_4 = hj.a;
            if (var10_2) {
                throw null;
lbl6:
                // 15 sources

                return null;
            }
            if (var8_4 || var8_4) ** GOTO lbl6
            var2_5 = new StringJoiner("\u00a78, \u00a7f");
            if (var8_4 || var8_4) ** GOTO lbl6
            var3_6 = var1_1.effects.values().iterator();
            if (var8_4) ** GOTO lbl6
            do {
                block64: {
                    block63: {
                        if (var8_4 || var8_4) ** GOTO lbl6
                        if (!var3_6.hasNext()) break block62;
                        if (var8_4) ** GOTO lbl6
                        var4_7 = var3_6.next();
                        if (var8_4 || var8_4) ** GOTO lbl6
                        var5_8 = ((class_1291)var4_7.effectType.comp_349()).method_5560().getString();
                        if (var8_4 || var8_4) ** GOTO lbl6
                        var6_9 = var4_7.amplifier + hj.dcos("dfrv", dcoo(int ), (int)872);
                        if (var8_4 || var8_4) ** GOTO lbl6
                        if (!((class_1291)var4_7.effectType.comp_349()).method_5561()) break block63;
                        if (var8_4 || var8_4) ** GOTO lbl6
                        v0 = "\u043c\u0433\u043d\u043e\u0432\u0435\u043d\u043d\u043e";
                        if (var10_2) {
                            throw null;
                        }
                        break block64;
                    }
                    if (var8_4 || var8_4) ** GOTO lbl6
                    v0 = var7_10 = this.formatDuration(var4_7.receivedDuration);
                }
                if (var8_4 || var8_4) ** GOTO lbl6
                var2_5.add(var5_8 + " " + var6_9 + " \u00a77(" + var7_10 + ")");
                if (var8_4 || var8_4) ** GOTO lbl6
            } while (!var10_2);
            throw null;
        }
        if (var9_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var8_4 || var8_4) ** GOTO lbl6
                if (var2_5.length() != 0) ** GOTO lbl50
                if (var8_4) ** GOTO lbl6
                v1 = "\u043d\u0435\u0442";
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl53
lbl50:
                // 1 sources

                if (!var8_4 && !var8_4) ** break;
                ** continue;
                v1 = var2_5.toString();
lbl53:
                // 2 sources

                return v1;
            }
lbl54:
            // 4 sources

            case 0: {
                var9_3 /* !! */  = (int)hj.dcos("dfrw", dcoo(int ), (int)873);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl83
            }
            case 1: {
                var9_3 /* !! */  = (int)hj.dcos("dfrx", dcoo(int ), (int)874);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl96
            }
lbl64:
            // 4 sources

            case 2: {
                var9_3 /* !! */  = (int)hj.dcos("dfry", dcoo(int ), (int)875);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl141
            }
            case 3: {
                var9_3 /* !! */  = (int)hj.dcos("dfrz", dcoo(int ), (int)876);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl181
            }
            case 4: {
                var9_3 /* !! */  = (int)hj.dcos("dfsa", dcoo(int ), (int)877);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl155
            }
            case 5: {
                var9_3 /* !! */  = (int)hj.dcos("dfsb", dcoo(int ), (int)878);
                if (!var10_2) ** GOTO lbl54
                throw null;
            }
lbl83:
            // 2 sources

            case 6: {
                var9_3 /* !! */  = (int)hj.dcos("dfsc", dcoo(int ), (int)879);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl105
            }
lbl88:
            // 3 sources

            case 7: {
                var9_3 /* !! */  = (int)hj.dcos("dfsd", dcoo(int ), (int)880);
                if (!var10_2) ** GOTO lbl64
                throw null;
            }
            case 8: {
                var9_3 /* !! */  = (int)hj.dcos("dfse", dcoo(int ), (int)881);
                if (!var10_2) ** GOTO lbl88
                throw null;
            }
lbl96:
            // 2 sources

            case 9: {
                var9_3 /* !! */  = (int)hj.dcos("dfsf", dcoo(int ), (int)882);
                if (!var10_2) ** GOTO lbl64
                throw null;
            }
            case 10: {
                var9_3 /* !! */  = (int)hj.dcos("dfsg", dcoo(int ), (int)883);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl105:
            // 4 sources

            case 11: {
                var9_3 /* !! */  = (int)hj.dcos("dfsh", dcoo(int ), (int)884);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl141
            }
lbl110:
            // 2 sources

            case 12: {
                var9_3 /* !! */  = (int)hj.dcos("dfsi", dcoo(int ), (int)885);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl115:
            // 3 sources

            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_3 /* !! */  = (int)hj.dcos("dfsj", dcoo(int ), (int)886);
                    if (!var10_2) ** GOTO lbl54
                    throw null;
                }
            }
            case 14: {
                var9_3 /* !! */  = (int)hj.dcos("dfsk", dcoo(int ), (int)887);
                if (!var10_2) ** GOTO lbl105
                throw null;
            }
lbl124:
            // 2 sources

            case 15: {
                var9_3 /* !! */  = (int)hj.dcos("dfsl", dcoo(int ), (int)888);
                if (!var10_2) ** GOTO lbl115
                throw null;
            }
            case 16: {
                var9_3 /* !! */  = (int)hj.dcos("dfsm", dcoo(int ), (int)889);
                if (!var10_2) ** GOTO lbl110
                throw null;
            }
lbl132:
            // 2 sources

            case 17: {
                var9_3 /* !! */  = (int)hj.dcos("dfsn", dcoo(int ), (int)890);
                if (!var10_2) ** GOTO lbl105
                throw null;
            }
            case 18: {
                var9_3 /* !! */  = (int)hj.dcos("dfso", dcoo(int ), (int)891);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl159
            }
lbl141:
            // 3 sources

            case 19: {
                var9_3 /* !! */  = (int)hj.dcos("dfsp", dcoo(int ), (int)892);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl173
            }
            case 20: {
                var9_3 /* !! */  = (int)hj.dcos("dfsq", dcoo(int ), (int)893);
                if (!var10_2) ** GOTO lbl124
                throw null;
            }
            case 21: {
                var9_3 /* !! */  = (int)hj.dcos("dfsr", dcoo(int ), (int)894);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl177
            }
lbl155:
            // 2 sources

            case 22: {
                var9_3 /* !! */  = (int)hj.dcos("dfss", dcoo(int ), (int)895);
                if (!var10_2) ** GOTO lbl54
                throw null;
            }
lbl159:
            // 3 sources

            case 23: {
                var9_3 /* !! */  = (int)hj.dcos("dfst", dcoo(int ), (int)896);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl185
            }
            case 24: {
                var9_3 /* !! */  = (int)hj.dcos("dfsu", dcoo(int ), (int)897);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl177
            }
            case 25: {
                var9_3 /* !! */  = (int)hj.dcos("dfsv", dcoo(int ), (int)898);
                if (!var10_2) ** GOTO lbl132
                throw null;
            }
lbl173:
            // 2 sources

            case 26: {
                var9_3 /* !! */  = (int)hj.dcos("dfsw", dcoo(int ), (int)899);
                if (!var10_2) ** GOTO lbl64
                throw null;
            }
lbl177:
            // 3 sources

            case 27: {
                var9_3 /* !! */  = (int)hj.dcos("dfsx", dcoo(int ), (int)900);
                if (!var10_2) ** GOTO lbl159
                throw null;
            }
lbl181:
            // 4 sources

            case 28: {
                var9_3 /* !! */  = (int)hj.dcos("dfta", dcoo(int ), (int)901);
                if (!var10_2) ** GOTO lbl115
                throw null;
            }
lbl185:
            // 2 sources

            case 29: {
                var9_3 /* !! */  = (int)hj.dcos("dftb", dcoo(int ), (int)902);
                if (!var10_2) ** GOTO lbl88
                throw null;
            }
            case 30: 
        }
        var9_3 /* !! */  = (int)hj.dcos("dftc", dcoo(int ), (int)903);
        ** while (!var10_2)
lbl192:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void processWorldPotionDebug() {
        block112: {
            block111: {
                var6_1 = hj.c;
                var5_2 /* !! */  = hj.b;
                var4_3 = hj.a;
                if (var6_1) {
                    throw null;
lbl6:
                    // 30 sources

                    return;
                }
                if (var4_3 || var4_3) ** GOTO lbl6
                if (!this.debugPotions.isValue()) break block111;
                if (var4_3) ** GOTO lbl6
                if (hj.mc.field_1687 != null) break block112;
                if (var4_3) ** GOTO lbl6
            }
            if (var4_3 || var4_3) ** GOTO lbl6
            this.trackedPotions.clear();
            if (var4_3 || var4_3) ** GOTO lbl6
            return;
        }
        if (var4_3 || var4_3) ** GOTO lbl6
        var1_4 = this.trackedPotions.values().iterator();
        if (var4_3) ** GOTO lbl6
        block59: while (true) {
            if (var4_3 || var4_3) ** GOTO lbl6
            if (!var1_4.hasNext()) ** GOTO lbl73
            if (var4_3 || var4_3) ** GOTO lbl6
            var2_5 = var1_4.next();
            if (var4_3 || var4_3) ** GOTO lbl6
            var3_6 = hj.mc.field_1687.method_8469(var2_5.entityId);
            if (var4_3 || var4_3) ** GOTO lbl6
            if (!(var3_6 instanceof class_10691)) ** GOTO lbl56
            if (var4_3) ** GOTO lbl6
            if (var3_6.method_31481()) ** GOTO lbl56
            if (var4_3 || var4_3) ** GOTO lbl6
            var2_5.missingTicks = (int)hj.dcos("desr", dcoo(int ), (int)582);
            if (var4_3 || var4_3) ** GOTO lbl6
            var2_5.x = var3_6.method_23317();
            if (var4_3 || var4_3) ** GOTO lbl6
            var2_5.y = var3_6.method_23318();
            if (var4_3 || var4_3) ** GOTO lbl6
            var2_5.z = var3_6.method_23321();
            if (var4_3 || var4_3) ** GOTO lbl6
            this.refreshPotionStack(var2_5);
            if (var4_3 || var4_3) ** GOTO lbl6
            var2_5.age += hj.dcos("dess", dcoo(int ), (int)583);
            if (var4_3) ** GOTO lbl6
            if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var5_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var4_3) ** GOTO lbl6
                    if (var2_5.age <= hj.dcos("dest", dcoo(int ), (int)584)) continue block59;
                    if (var4_3 || var4_3) ** GOTO lbl6
                    var1_4.remove();
                    if (var4_3) ** GOTO lbl6
                    if (!var6_1) continue block59;
                    throw null;
                }
lbl56:
                // 2 sources

                if (var4_3 || var4_3) ** GOTO lbl6
                this.refreshPotionStack(var2_5);
                if (var4_3 || var4_3) ** GOTO lbl6
                var2_5.missingTicks += hj.dcos("desu", dcoo(int ), (int)585);
                if (var4_3 || var4_3) ** GOTO lbl6
                if (var2_5.missingTicks >= hj.dcos("desv", dcoo(int ), (int)586)) ** GOTO lbl65
                if (var4_3) ** GOTO lbl6
                if (!var6_1) continue block59;
                throw null;
lbl65:
                // 1 sources

                if (var4_3 || var4_3) ** GOTO lbl6
                this.printPotionImpact(var2_5);
                if (var4_3 || var4_3) ** GOTO lbl6
                var1_4.remove();
                if (var4_3 || var4_3) ** GOTO lbl6
                if (var6_1) ** break;
                continue block59;
                throw null;
lbl73:
                // 1 sources

                if (!var4_3 && !var4_3) ** break;
                ** continue;
                return;
                case 0: {
                    var5_2 /* !! */  = (int)hj.dcos("desw", dcoo(int ), (int)587);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl237
                }
                case 1: {
                    var5_2 /* !! */  = (int)hj.dcos("desx", dcoo(int ), (int)588);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl250
                }
lbl86:
                // 2 sources

                case 2: {
                    var5_2 /* !! */  = (int)hj.dcos("desy", dcoo(int ), (int)589);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl96
                }
lbl91:
                // 3 sources

                case 3: {
                    var5_2 /* !! */  = (int)hj.dcos("desz", dcoo(int ), (int)590);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl174
                }
lbl96:
                // 3 sources

                case 4: {
                    var5_2 /* !! */  = (int)hj.dcos("deta", dcoo(int ), (int)591);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl155
                }
                case 5: {
                    var5_2 /* !! */  = (int)hj.dcos("detb", dcoo(int ), (int)592);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl293
                }
lbl106:
                // 2 sources

                case 6: {
                    var5_2 /* !! */  = (int)hj.dcos("detc", dcoo(int ), (int)593);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl301
                }
                case 7: {
                    var5_2 /* !! */  = (int)hj.dcos("detd", dcoo(int ), (int)594);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl275
                }
lbl116:
                // 2 sources

                case 8: {
                    var5_2 /* !! */  = (int)hj.dcos("dete", dcoo(int ), (int)595);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl313
                }
                case 9: {
                    var5_2 /* !! */  = (int)hj.dcos("detf", dcoo(int ), (int)596);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl284
                }
lbl126:
                // 3 sources

                case 10: {
                    var5_2 /* !! */  = (int)hj.dcos("detg", dcoo(int ), (int)597);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl227
                }
                case 11: {
                    var5_2 /* !! */  = (int)hj.dcos("deth", dcoo(int ), (int)598);
                    if (!var6_1) ** GOTO lbl106
                    throw null;
                }
lbl135:
                // 2 sources

                case 12: {
                    var5_2 /* !! */  = (int)hj.dcos("deti", dcoo(int ), (int)599);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl250
                }
lbl140:
                // 2 sources

                case 13: {
                    var5_2 /* !! */  = (int)hj.dcos("detj", dcoo(int ), (int)600);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl174
                }
                case 14: {
                    var5_2 /* !! */  = (int)hj.dcos("detk", dcoo(int ), (int)601);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl288
                }
                case 15: {
                    var5_2 /* !! */  = (int)hj.dcos("detl", dcoo(int ), (int)602);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl164
                }
lbl155:
                // 3 sources

                case 16: {
                    var5_2 /* !! */  = (int)hj.dcos("detm", dcoo(int ), (int)603);
                    if (!var6_1) ** GOTO lbl135
                    throw null;
                }
                case 17: {
                    var5_2 /* !! */  = (int)hj.dcos("detn", dcoo(int ), (int)604);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl169
                }
lbl164:
                // 3 sources

                case 18: {
                    var5_2 /* !! */  = (int)hj.dcos("deto", dcoo(int ), (int)605);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl258
                }
lbl169:
                // 2 sources

                case 19: {
                    var5_2 /* !! */  = (int)hj.dcos("detp", dcoo(int ), (int)606);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl309
                }
lbl174:
                // 3 sources

                case 20: {
                    var5_2 /* !! */  = (int)hj.dcos("detq", dcoo(int ), (int)607);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl215
                }
lbl179:
                // 2 sources

                case 21: {
                    var5_2 /* !! */  = (int)hj.dcos("detr", dcoo(int ), (int)608);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl293
                }
lbl184:
                // 3 sources

                case 22: {
                    var5_2 /* !! */  = (int)hj.dcos("dets", dcoo(int ), (int)609);
                    if (!var6_1) ** GOTO lbl155
                    throw null;
                }
                case 23: {
                    var5_2 /* !! */  = (int)hj.dcos("dett", dcoo(int ), (int)610);
                    if (!var6_1) ** GOTO lbl164
                    throw null;
                }
lbl192:
                // 3 sources

                case 24: {
                    var5_2 /* !! */  = (int)hj.dcos("detu", dcoo(int ), (int)611);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl258
                }
                case 25: {
                    var5_2 /* !! */  = (int)hj.dcos("detv", dcoo(int ), (int)612);
                    if (var6_1) {
                        throw null;
                    }
                }
                case 26: {
                    var5_2 /* !! */  = (int)hj.dcos("detw", dcoo(int ), (int)613);
                    if (!var6_1) ** GOTO lbl86
                    throw null;
                }
lbl205:
                // 2 sources

                case 27: {
                    var5_2 /* !! */  = (int)hj.dcos("detx", dcoo(int ), (int)614);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl219
                }
lbl210:
                // 3 sources

                case 28: {
                    var5_2 /* !! */  = (int)hj.dcos("dety", dcoo(int ), (int)615);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl258
                }
lbl215:
                // 3 sources

                case 29: {
                    var5_2 /* !! */  = (int)hj.dcos("detz", dcoo(int ), (int)616);
                    if (!var6_1) ** GOTO lbl210
                    throw null;
                }
lbl219:
                // 2 sources

                case 30: {
                    var5_2 /* !! */  = (int)hj.dcos("deua", dcoo(int ), (int)617);
                    if (!var6_1) ** GOTO lbl192
                    throw null;
                }
                case 31: {
                    var5_2 /* !! */  = (int)hj.dcos("deub", dcoo(int ), (int)618);
                    if (!var6_1) ** GOTO lbl116
                    throw null;
                }
lbl227:
                // 2 sources

                case 32: {
                    var5_2 /* !! */  = (int)hj.dcos("deuc", dcoo(int ), (int)619);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl301
                }
                case 33: {
                    var5_2 /* !! */  = (int)hj.dcos("deud", dcoo(int ), (int)620);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl293
                }
lbl237:
                // 2 sources

                case 34: {
                    var5_2 /* !! */  = (int)hj.dcos("deue", dcoo(int ), (int)621);
                    if (!var6_1) ** GOTO lbl210
                    throw null;
                }
                case 35: {
                    var5_2 /* !! */  = (int)hj.dcos("deuf", dcoo(int ), (int)622);
                    if (!var6_1) ** GOTO lbl192
                    throw null;
                }
lbl245:
                // 2 sources

                case 36: {
                    var5_2 /* !! */  = (int)hj.dcos("deug", dcoo(int ), (int)623);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl267
                }
lbl250:
                // 4 sources

                case 37: {
                    var5_2 /* !! */  = (int)hj.dcos("deuh", dcoo(int ), (int)624);
                    if (!var6_1) ** GOTO lbl91
                    throw null;
                }
lbl254:
                // 2 sources

                case 38: {
                    var5_2 /* !! */  = (int)hj.dcos("deui", dcoo(int ), (int)625);
                    if (!var6_1) break block59;
                    throw null;
                }
lbl258:
                // 4 sources

                case 39: {
                    do {
                        var5_2 /* !! */  = (int)hj.dcos("deuj", dcoo(int ), (int)626);
                    } while (!var6_1);
                    throw null;
                }
                case 40: {
                    var5_2 /* !! */  = (int)hj.dcos("deuk", dcoo(int ), (int)627);
                    if (!var6_1) ** GOTO lbl184
                    throw null;
                }
lbl267:
                // 2 sources

                case 41: {
                    var5_2 /* !! */  = (int)hj.dcos("deul", dcoo(int ), (int)628);
                    if (!var6_1) ** GOTO lbl215
                    throw null;
                }
                case 42: {
                    var5_2 /* !! */  = (int)hj.dcos("deum", dcoo(int ), (int)629);
                    if (!var6_1) ** GOTO lbl254
                    throw null;
                }
lbl275:
                // 2 sources

                case 43: {
                    do {
                        var5_2 /* !! */  = (int)hj.dcos("deun", dcoo(int ), (int)630);
                    } while (!var6_1);
                    throw null;
                }
                case 44: {
                    var5_2 /* !! */  = (int)hj.dcos("deuo", dcoo(int ), (int)631);
                    if (!var6_1) ** GOTO lbl126
                    throw null;
                }
lbl284:
                // 2 sources

                case 45: {
                    var5_2 /* !! */  = (int)hj.dcos("deup", dcoo(int ), (int)632);
                    if (!var6_1) ** GOTO lbl91
                    throw null;
                }
lbl288:
                // 2 sources

                case 46: {
                    var5_2 /* !! */  = (int)hj.dcos("deuq", dcoo(int ), (int)633);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl313
                }
lbl293:
                // 4 sources

                case 47: {
                    var5_2 /* !! */  = (int)hj.dcos("deur", dcoo(int ), (int)634);
                    if (!var6_1) ** GOTO lbl140
                    throw null;
                }
                case 48: {
                    var5_2 /* !! */  = (int)hj.dcos("deus", dcoo(int ), (int)635);
                    if (!var6_1) ** GOTO lbl205
                    throw null;
                }
lbl301:
                // 3 sources

                case 49: {
                    var5_2 /* !! */  = (int)hj.dcos("deut", dcoo(int ), (int)636);
                    if (!var6_1) ** GOTO lbl126
                    throw null;
                }
                case 50: {
                    var5_2 /* !! */  = (int)hj.dcos("deuu", dcoo(int ), (int)637);
                    if (!var6_1) ** GOTO lbl184
                    throw null;
                }
lbl309:
                // 2 sources

                case 51: {
                    var5_2 /* !! */  = (int)hj.dcos("deuv", dcoo(int ), (int)638);
                    if (!var6_1) ** GOTO lbl245
                    throw null;
                }
lbl313:
                // 3 sources

                case 52: {
                    var5_2 /* !! */  = (int)hj.dcos("deuw", dcoo(int ), (int)639);
                    if (!var6_1) ** GOTO lbl250
                    throw null;
                }
                case 53: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var5_2 /* !! */  = (int)hj.dcos("deux", dcoo(int ), (int)640);
                        if (!var6_1) ** GOTO lbl179
                        throw null;
                    }
                }
                case 54: {
                    var5_2 /* !! */  = (int)hj.dcos("deuy", dcoo(int ), (int)641);
                    if (!var6_1) ** GOTO lbl96
                    throw null;
                }
                case 55: 
            }
            break;
        }
        var5_2 /* !! */  = (int)hj.dcos("deuz", dcoo(int ), (int)642);
        ** while (!var6_1)
lbl329:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dgls() {
        hj.ddkp[400] = -7100994902517373334L;
        hj.ddkp[401] = 7661794531169253041L;
        hj.ddkp[402] = -3809023012465716590L;
        hj.ddkp[403] = 4606932882315045553L;
        hj.ddkp[404] = -5072157351190044801L;
        hj.ddkp[405] = -1429436822931325144L;
        hj.ddkp[406] = 3762342808634118861L;
        hj.ddkp[407] = -1418313096525937066L;
        hj.ddkp[408] = 6294410635659503282L;
        hj.ddkp[409] = -8115046583847291728L;
        hj.ddkp[410] = 759774457193140700L;
        hj.ddkp[411] = 2892475105192207528L;
        hj.ddkp[412] = -2534592036930510008L;
        hj.ddkp[413] = 6942630841072677384L;
        hj.ddkp[414] = -2977355875700987098L;
        hj.ddkp[415] = -6279873554575935506L;
        hj.ddkp[416] = 2602458415045712596L;
        hj.ddkp[417] = 6557662313584487850L;
        hj.ddkp[418] = -2702511213066821436L;
        hj.ddkp[419] = -9196484174864048367L;
        hj.ddkp[420] = -5667671208681082709L;
        hj.ddkp[421] = -6792311594474282572L;
        hj.ddkp[422] = 1235441093733433900L;
        hj.ddkp[423] = -4424924052180158070L;
        hj.ddkp[424] = 4216115619665588987L;
        hj.ddkp[425] = -7723289773491638602L;
        hj.ddkp[426] = -6563989570814240142L;
        hj.ddkp[427] = 129505721770103660L;
        hj.ddkp[428] = -4767852508344638634L;
        hj.ddkp[429] = 3311951669029072193L;
        hj.ddkp[430] = -3776155366589725165L;
        hj.ddkp[431] = 5125700723222415046L;
        hj.ddkp[432] = -1238908900634503645L;
        hj.ddkp[433] = 2701895965838741721L;
        hj.ddkp[434] = 6846462604585379158L;
        hj.ddkp[435] = 8399746040822392135L;
        hj.ddkp[436] = 3711209225660550778L;
        hj.ddkp[437] = -9149383927470156147L;
        hj.ddkp[438] = -8238304618484313862L;
        hj.ddkp[439] = -1869940727451006724L;
        hj.ddkp[440] = -1376866532200412694L;
        hj.ddkp[441] = -153503656496267223L;
        hj.ddkp[442] = -986256969074214816L;
        hj.ddkp[443] = -3827613874455493821L;
        hj.ddkp[444] = -8939655203788579965L;
        hj.ddkp[445] = 5926262341278311643L;
        hj.ddkp[446] = 9066185801511904884L;
        hj.ddkp[447] = 1880910647051257387L;
        hj.ddkp[448] = 889452706571590150L;
        hj.ddkp[449] = 8949109559475665996L;
        hj.ddkp[450] = -4214497048090152058L;
        hj.ddkp[451] = -7524156641428085003L;
        hj.ddkp[452] = 3754540158889729826L;
        hj.ddkp[453] = -8357730533313014003L;
    }

    public static /* synthetic */ CallSite dcos(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void dgll() {
        hj.ddko[200] = 274060033948194066L;
        hj.ddko[201] = 3304616220402371120L;
        hj.ddko[202] = 1795293493783818313L;
        hj.ddko[203] = 8667787595749161604L;
        hj.ddko[204] = 1693832635724665250L;
        hj.ddko[205] = -5247769786949576111L;
        hj.ddko[206] = -3903246256867016970L;
        hj.ddko[207] = 654847984358622774L;
        hj.ddko[208] = 8147757593086832911L;
        hj.ddko[209] = 1824197456273933348L;
        hj.ddko[210] = 7205886279410490479L;
        hj.ddko[211] = -330705980266588701L;
        hj.ddko[212] = -6880088456561478482L;
        hj.ddko[213] = 2080528353277751502L;
        hj.ddko[214] = -2398623239966278296L;
        hj.ddko[215] = -8405509244773943634L;
        hj.ddko[216] = -2743647995190311938L;
        hj.ddko[217] = -6652786358315049252L;
        hj.ddko[218] = 7078511769370743932L;
        hj.ddko[219] = -2990756990958824600L;
        hj.ddko[220] = 6487076844913846806L;
        hj.ddko[221] = -8404141621700947729L;
        hj.ddko[222] = 586969873717793601L;
        hj.ddko[223] = 3540406621104525781L;
        hj.ddko[224] = -7772070719308428189L;
        hj.ddko[225] = 5582027156109958644L;
        hj.ddko[226] = -430841166390327727L;
        hj.ddko[227] = 8807018428908336678L;
        hj.ddko[228] = 2286714325835156214L;
        hj.ddko[229] = 6865476963427869267L;
        hj.ddko[230] = 7806009460644026710L;
        hj.ddko[231] = 8310229845780499418L;
        hj.ddko[232] = 5561405955921802991L;
        hj.ddko[233] = -9171832358128752508L;
        hj.ddko[234] = -2691435953934079875L;
        hj.ddko[235] = -5656319318698414261L;
        hj.ddko[236] = 5512907298639462113L;
        hj.ddko[237] = -7401239192798498914L;
        hj.ddko[238] = -2859909104678739341L;
        hj.ddko[239] = 799622329704687835L;
        hj.ddko[240] = 617395053016605642L;
        hj.ddko[241] = -1744112023396043704L;
        hj.ddko[242] = 7110332922265558807L;
        hj.ddko[243] = -7180600589148435288L;
        hj.ddko[244] = -7629375871616980879L;
        hj.ddko[245] = -534125205428541756L;
        hj.ddko[246] = 3377935127866565572L;
        hj.ddko[247] = 4739854864355375496L;
        hj.ddko[248] = 7975469471783615564L;
        hj.ddko[249] = -6308016171347174265L;
        hj.ddko[250] = -3737740954335288655L;
        hj.ddko[251] = -1544718650614684711L;
        hj.ddko[252] = -4673349351867289885L;
        hj.ddko[253] = 9116277829204005238L;
        hj.ddko[254] = -8310023899638786381L;
        hj.ddko[255] = 5195942375015529507L;
        hj.ddko[256] = 6768820206711192696L;
        hj.ddko[257] = 3098855838233996470L;
        hj.ddko[258] = -6861673339279947066L;
        hj.ddko[259] = -5510785428309332145L;
        hj.ddko[260] = -5667088233561614994L;
        hj.ddko[261] = -3022940240745837189L;
        hj.ddko[262] = -4970504526405274584L;
        hj.ddko[263] = 1328222708568175679L;
        hj.ddko[264] = 6715989444433074746L;
        hj.ddko[265] = 7021036468504478872L;
        hj.ddko[266] = 1822379799493023428L;
        hj.ddko[267] = -5123334009571931183L;
        hj.ddko[268] = -1261968568519042869L;
        hj.ddko[269] = 8340538751391663029L;
        hj.ddko[270] = 8131362129308533956L;
        hj.ddko[271] = 8646940030336561283L;
        hj.ddko[272] = -3877701636419730705L;
        hj.ddko[273] = 3330962070789914132L;
        hj.ddko[274] = 3262925610586142760L;
        hj.ddko[275] = 4082958194598245425L;
        hj.ddko[276] = 6257744585208843396L;
        hj.ddko[277] = -2039244903218503651L;
        hj.ddko[278] = 6481123537372348664L;
        hj.ddko[279] = 1007733762638304301L;
        hj.ddko[280] = -364864877403328177L;
        hj.ddko[281] = 5402906601552523087L;
        hj.ddko[282] = -8918960345040802812L;
        hj.ddko[283] = -1960352618674202822L;
        hj.ddko[284] = 8069537589131009572L;
        hj.ddko[285] = 66033667652017499L;
        hj.ddko[286] = -1096329385988853461L;
        hj.ddko[287] = 7076402451046619234L;
        hj.ddko[288] = -1377510767199081202L;
        hj.ddko[289] = -2437268743740367349L;
        hj.ddko[290] = 4687872202460233892L;
        hj.ddko[291] = 7844819502744319063L;
        hj.ddko[292] = -3919073700217128066L;
        hj.ddko[293] = -8857295956224243345L;
        hj.ddko[294] = -6380804860642274702L;
        hj.ddko[295] = 2359038920312205359L;
        hj.ddko[296] = 5487205858577828427L;
        hj.ddko[297] = 4488082673615792491L;
        hj.ddko[298] = 7314995461895188159L;
        hj.ddko[299] = -2878849297208291118L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private int hitPercent(hj$PlayerPotionHit var1_1) {
        block66: {
            var8_2 = hj.c;
            var7_3 /* !! */  = hj.b;
            var6_4 = hj.a;
            if (var8_2) {
                throw null;
            }
            if (var6_4 != false) return (int)hj.dcos("dfqp", dcoo(int ), (int)841);
            if (var6_4 != false) return (int)hj.dcos("dfqp", dcoo(int ), (int)841);
            if (var1_1.effects.isEmpty()) {
                if (var6_4 != false) return (int)hj.dcos("dfqp", dcoo(int ), (int)841);
                return (int)hj.dcos("dfqq", dcoo(int ), (int)842);
            }
            if (var6_4 != false) return (int)hj.dcos("dfqp", dcoo(int ), (int)841);
            if (var6_4 != false) return (int)hj.dcos("dfqp", dcoo(int ), (int)841);
            var2_5 = 0.0;
            if (var6_4 != false) return (int)hj.dcos("dfqp", dcoo(int ), (int)841);
            if (var6_4 != false) return (int)hj.dcos("dfqp", dcoo(int ), (int)841);
            var4_6 = var1_1.effects.values().iterator();
            if (var6_4 != false) return (int)hj.dcos("dfqp", dcoo(int ), (int)841);
            block31: while (true) {
                if (var6_4 != false) return (int)hj.dcos("dfqp", dcoo(int ), (int)841);
                if (var6_4 != false) return (int)hj.dcos("dfqp", dcoo(int ), (int)841);
                if (!var4_6.hasNext()) ** GOTO lbl50
                if (var6_4 != false) return (int)hj.dcos("dfqp", dcoo(int ), (int)841);
                var5_7 = var4_6.next();
                if (var6_4 != false) return (int)hj.dcos("dfqp", dcoo(int ), (int)841);
                if (var6_4 != false) return (int)hj.dcos("dfqp", dcoo(int ), (int)841);
                if (!((class_1291)var5_7.effectType.comp_349()).method_5561()) ** GOTO lbl39
                if (var6_4 != false) return (int)hj.dcos("dfqp", dcoo(int ), (int)841);
                if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
                cfr_temp_0 = -2147483648;
                while (true) {
                    switch (cfr_temp_0 == -2147483648 ? var7_3 /* !! */  : cfr_temp_0) {
                        default: lbl-1000:
                        // 2 sources

                        {
                            if (var6_4 != false) return (int)hj.dcos("dfqp", dcoo(int ), (int)841);
                            var2_5 += 1.0;
                            if (var6_4 != false) return (int)hj.dcos("dfqp", dcoo(int ), (int)841);
                            if (var8_2) {
                                throw null;
                            }
                            ** GOTO lbl46
                        }
lbl39:
                        // 1 sources

                        if (var6_4 != false) return (int)hj.dcos("dfqp", dcoo(int ), (int)841);
                        if (var6_4 != false) return (int)hj.dcos("dfqp", dcoo(int ), (int)841);
                        if (var5_7.fullDuration > 0) {
                            if (var6_4 != false) return (int)hj.dcos("dfqp", dcoo(int ), (int)841);
                            if (var6_4 != false) return (int)hj.dcos("dfqp", dcoo(int ), (int)841);
                            var2_5 += Math.min(1.0, (double)var5_7.receivedDuration / (double)var5_7.fullDuration);
                            if (var6_4 != false) return (int)hj.dcos("dfqp", dcoo(int ), (int)841);
                        }
lbl46:
                        // 4 sources

                        if (var6_4 != false) return (int)hj.dcos("dfqp", dcoo(int ), (int)841);
                        if (var6_4 != false) return (int)hj.dcos("dfqp", dcoo(int ), (int)841);
                        if (!var8_2) continue block31;
                        throw null;
lbl50:
                        // 1 sources

                        if (var6_4 != false) return (int)hj.dcos("dfqp", dcoo(int ), (int)841);
                        if (var6_4 != false) return (int)hj.dcos("dfqp", dcoo(int ), (int)841);
                        return (int)Math.round(var2_5 * hj.dcos("dfqr", dfix(int ), (int)366) / (double)var1_1.effects.size());
                        case 2: {
                            var7_3 /* !! */  = (int)hj.dcos("dfqu", dcoo(int ), (int)845);
                            cfr_temp_0 = 20;
                            if (var8_2) {
                                throw null;
                            }
                            break block66;
                        }
                        case 7: {
                            var7_3 /* !! */  = (int)hj.dcos("dfqz", dcoo(int ), (int)850);
                            cfr_temp_0 = 5;
                            if (var8_2) {
                                throw null;
                            }
                            break block66;
                        }
                        case 10: {
                            var7_3 /* !! */  = (int)hj.dcos("dfrc", dcoo(int ), (int)853);
                            cfr_temp_0 = 1;
                            if (var8_2) {
                                throw null;
                            }
                            break block66;
                        }
                        case 12: {
                            var7_3 /* !! */  = (int)hj.dcos("dfre", dcoo(int ), (int)855);
                            if (var8_2) {
                                throw null;
                            }
                        }
                        case 8: {
                            var7_3 /* !! */  = (int)hj.dcos("dfra", dcoo(int ), (int)851);
                            if (var8_2) {
                                throw null;
                            }
                        }
                        case 0: {
                            var7_3 /* !! */  = (int)hj.dcos("dfqs", dcoo(int ), (int)843);
                            cfr_temp_0 = 20;
                            if (var8_2) {
                                throw null;
                            }
                            break block66;
                        }
                        case 14: {
                            var7_3 /* !! */  = (int)hj.dcos("dfrg", dcoo(int ), (int)857);
                            cfr_temp_0 = 23;
                            if (var8_2) {
                                throw null;
                            }
                            break block66;
                        }
                        case 18: {
                            var7_3 /* !! */  = (int)hj.dcos("dfrk", dcoo(int ), (int)861);
                            if (var8_2) {
                                throw null;
                            }
                        }
                        case 6: {
                            var7_3 /* !! */  = (int)hj.dcos("dfqy", dcoo(int ), (int)849);
                            if (var8_2) {
                                throw null;
                            }
                        }
                        case 3: {
                            var7_3 /* !! */  = (int)hj.dcos("dfqv", dcoo(int ), (int)846);
                            if (var8_2) {
                                throw null;
                            }
                        }
                        case 4: {
                            ** GOTO lbl158
                        }
                        case 19: {
                            var7_3 /* !! */  = (int)hj.dcos("dfrl", dcoo(int ), (int)862);
                            if (var8_2) {
                                throw null;
                            }
                        }
                        case 9: {
                            var7_3 /* !! */  = (int)hj.dcos("dfrb", dcoo(int ), (int)852);
                            if (var8_2) {
                                throw null;
                            }
                        }
                        case 1: {
                            var7_3 /* !! */  = (int)hj.dcos("dfqt", dcoo(int ), (int)844);
                            cfr_temp_0 = 16;
                            if (var8_2) {
                                throw null;
                            }
                            break block66;
                        }
                        case 22: {
                            var7_3 /* !! */  = (int)hj.dcos("dfro", dcoo(int ), (int)865);
                            cfr_temp_0 = 27;
                            if (var8_2) {
                                throw null;
                            }
                            break block66;
                        }
                        case 23: {
                            var7_3 /* !! */  = (int)hj.dcos("dfrp", dcoo(int ), (int)866);
                            if (var8_2) {
                                throw null;
                            }
                        }
                        case 20: {
                            var7_3 /* !! */  = (int)hj.dcos("dfrm", dcoo(int ), (int)863);
                            if (var8_2) {
                                throw null;
                            }
                        }
                        case 13: {
                            var7_3 /* !! */  = (int)hj.dcos("dfrf", dcoo(int ), (int)856);
                            if (var8_2) {
                                throw null;
                            }
                        }
                        case 16: {
                            var7_3 /* !! */  = (int)hj.dcos("dfri", dcoo(int ), (int)859);
                            cfr_temp_0 = 25;
                            if (var8_2) {
                                throw null;
                            }
                            break block66;
                        }
                        case 24: {
                            var7_3 /* !! */  = (int)hj.dcos("dfrq", dcoo(int ), (int)867);
                            cfr_temp_0 = 25;
                            if (var8_2) {
                                throw null;
                            }
                            break block66;
                        }
                        case 27: {
                            do {
                                var7_3 /* !! */  = (int)hj.dcos("dfrt", dcoo(int ), (int)870);
                            } while (!var8_2);
                            throw null;
                        }
                        case 28: {
                            var7_3 /* !! */  = (int)hj.dcos("dfru", dcoo(int ), (int)871);
                            if (var8_2) {
                                throw null;
                            }
lbl158:
                            // 3 sources

                            var7_3 /* !! */  = (int)hj.dcos("dfqw", dcoo(int ), (int)847);
                            cfr_temp_0 = 26;
                            if (var8_2) {
                                throw null;
                            }
                            break block66;
                        }
                        case 5: {
                            var7_3 /* !! */  = (int)hj.dcos("dfqx", dcoo(int ), (int)848);
                            if (var8_2) {
                                throw null;
                            }
                        }
                        case 26: {
                            var7_3 /* !! */  = (int)hj.dcos("dfrs", dcoo(int ), (int)869);
                            if (var8_2) {
                                throw null;
                            }
                        }
                        case 17: {
                            var7_3 /* !! */  = (int)hj.dcos("dfrj", dcoo(int ), (int)860);
                            if (var8_2) {
                                throw null;
                            }
                        }
                        case 11: {
                            var7_3 /* !! */  = (int)hj.dcos("dfrd", dcoo(int ), (int)854);
                            if (var8_2) {
                                throw null;
                            }
                        }
                        case 15: {
                            var7_3 /* !! */  = (int)hj.dcos("dfrh", dcoo(int ), (int)858);
                            if (var8_2) {
                                throw null;
                            }
                        }
                        case 21: {
                            var7_3 /* !! */  = (int)hj.dcos("dfrn", dcoo(int ), (int)864);
                            if (var8_2) {
                                throw null;
                            }
                        }
                        case 25: 
                    }
                    break;
                }
                break;
            }
            ** GOTO lbl192
        }
        do {
            if (true) ** continue;
lbl192:
            // 2 sources

            var7_3 /* !! */  = (int)hj.dcos("dfrr", dcoo(int ), (int)868);
            cfr_temp_0 = 5;
        } while (!var8_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void selectHotbarSlot(int var1_1) {
        block70: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = hj.he - hj.dcos("deop", ddkn(int ), (int)221)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == hj.dcos("deoq", dcoo(int ), (int)535)) break;
                v0 /* !! */  = (long)hj.dcos("deor", dcoo(int ), (int)536);
            }
            var4_2 = hj.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = hj.he - hj.dcos("deos", ddkn(int ), (int)222)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == hj.dcos("deot", dcoo(int ), (int)537)) break;
                v1 /* !! */  = (long)hj.dcos("deou", dcoo(int ), (int)538);
            }
            var3_3 /* !! */  = hj.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = hj.he - hj.dcos("deov", ddkn(int ), (int)223)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == hj.dcos("deow", dcoo(int ), (int)539)) break;
                v2 /* !! */  = (long)hj.dcos("deox", dcoo(int ), (int)540);
            }
            var2_4 = hj.a;
            if (var4_2) {
                throw null;
lbl21:
                // 7 sources

                return;
            }
            if (var2_4 || var2_4) ** GOTO lbl21
            v3 /* !! */  = hj.he;
            if (true) ** GOTO lbl28
            block46: while (true) {
                v3 /* !! */  = (long)(hj.dcos("deoz", ddkn(int ), (int)225) - hj.dcos("deoy", ddkn(int ), (int)224));
lbl28:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case 27539926: {
                        break block46;
                    }
                    case 627619291: {
                        continue block46;
                    }
                }
                break;
            }
            nv.selectSlot(var1_1);
            if (var2_4 || var2_4) ** GOTO lbl21
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_3 = hj.he - hj.dcos("depa", ddkn(int ), (int)226)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == hj.dcos("depb", dcoo(int ), (int)541)) break;
                v4 /* !! */  = (long)hj.dcos("depc", dcoo(int ), (int)542);
            }
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_4 = hj.he - hj.dcos("depd", ddkn(int ), (int)227)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == hj.dcos("depe", dcoo(int ), (int)543)) break;
                v5 /* !! */  = (long)hj.dcos("depf", dcoo(int ), (int)544);
            }
            if (hj.mc.field_1724 == null) break block70;
            if (var2_4) ** GOTO lbl21
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_5 = hj.he - hj.dcos("depg", ddkn(int ), (int)228)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == hj.dcos("deph", dcoo(int ), (int)545)) break;
                v6 /* !! */  = (long)hj.dcos("depi", dcoo(int ), (int)546);
            }
            v7 /* !! */  = hj.he;
            if (true) ** GOTO lbl56
            block50: while (true) {
                v7 /* !! */  = (long)(hj.dcos("depk", ddkn(int ), (int)230) - hj.dcos("depj", ddkn(int ), (int)229));
lbl56:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -2140095811: {
                        continue block50;
                    }
                    case 27539926: {
                        break block50;
                    }
                }
                break;
            }
            v8 = hj.mc.field_1724;
            v9 /* !! */  = hj.he;
            if (true) ** GOTO lbl66
            block51: while (true) {
                v9 /* !! */  = (long)(v10 - hj.dcos("depl", ddkn(int ), (int)231));
lbl66:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -435837262: {
                        v10 = hj.dcos("depm", ddkn(int ), (int)232);
                        continue block51;
                    }
                    case 27539926: {
                        break block51;
                    }
                    case 1035185014: {
                        v10 = hj.dcos("depn", ddkn(int ), (int)233);
                        continue block51;
                    }
                    case 1918165650: {
                        v10 = hj.dcos("depo", ddkn(int ), (int)234);
                        continue block51;
                    }
                }
                break;
            }
            if (v8.field_3944 == null) break block70;
            if (var2_4 || var2_4) ** GOTO lbl21
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_6 = hj.he - hj.dcos("depp", ddkn(int ), (int)235)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == hj.dcos("depq", dcoo(int ), (int)547)) break;
                v11 /* !! */  = (long)hj.dcos("depr", dcoo(int ), (int)548);
            }
            v12 /* !! */  = hj.he;
            if (true) ** GOTO lbl89
            block53: while (true) {
                v12 /* !! */  = (long)(v13 - hj.dcos("deps", ddkn(int ), (int)236));
lbl89:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case 27539926: {
                        break block53;
                    }
                    case 1189290891: {
                        v13 = hj.dcos("dept", ddkn(int ), (int)237);
                        continue block53;
                    }
                    case 1839029903: {
                        v13 = hj.dcos("depu", ddkn(int ), (int)238);
                        continue block53;
                    }
                    case 1896386685: {
                        v13 = hj.dcos("depv", ddkn(int ), (int)239);
                        continue block53;
                    }
                }
                break;
            }
            v14 = hj.mc.field_1724;
            v15 /* !! */  = hj.he;
            if (true) ** GOTO lbl106
            block54: while (true) {
                v15 /* !! */  = (long)(hj.dcos("depx", ddkn(int ), (int)241) - hj.dcos("depw", ddkn(int ), (int)240));
lbl106:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case -1519305269: {
                        continue block54;
                    }
                    case 27539926: {
                        break block54;
                    }
                }
                break;
            }
            v16 = v14.field_3944;
            while (true) {
                if ((v17 /* !! */  = (cfr_temp_7 = hj.he - hj.dcos("depy", ddkn(int ), (int)242)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v17 /* !! */  == hj.dcos("depz", dcoo(int ), (int)549)) break;
                v17 /* !! */  = (long)hj.dcos("deqa", dcoo(int ), (int)550);
            }
            v18 /* !! */  = hj.he;
            if (true) ** GOTO lbl121
            block56: while (true) {
                v18 /* !! */  = (long)(hj.dcos("deqc", ddkn(int ), (int)244) - hj.dcos("deqb", ddkn(int ), (int)243));
lbl121:
                // 2 sources

                switch ((int)v18 /* !! */ ) {
                    case -1371581515: {
                        continue block56;
                    }
                    case 27539926: {
                        break block56;
                    }
                }
                break;
            }
            v19 = new class_2868(var1_1);
            while (true) {
                if ((v20 /* !! */  = (cfr_temp_8 = hj.he - hj.dcos("deqd", ddkn(int ), (int)245)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v20 /* !! */  == hj.dcos("deqe", dcoo(int ), (int)551)) break;
                v20 /* !! */  = (long)hj.dcos("deqf", dcoo(int ), (int)552);
            }
            v16.method_52787((class_2596)v19);
            if (var2_4) ** GOTO lbl21
        }
        if (var2_4) ** GOTO lbl21
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
                    var3_3 /* !! */  = (int)hj.dcos("deqg", dcoo(int ), (int)553);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl179
                    break;
                }
            }
lbl148:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)hj.dcos("deqh", dcoo(int ), (int)554);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl153:
            // 3 sources

            case 2: {
                var3_3 /* !! */  = (int)hj.dcos("deqi", dcoo(int ), (int)555);
                if (!var4_2) ** GOTO lbl148
                throw null;
            }
lbl157:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)hj.dcos("deqj", dcoo(int ), (int)556);
                if (var4_2) {
                    throw null;
                }
            }
            case 4: {
                do {
                    var3_3 /* !! */  = (int)hj.dcos("deqk", dcoo(int ), (int)557);
                } while (!var4_2);
                throw null;
            }
            case 5: {
                var3_3 /* !! */  = (int)hj.dcos("deql", dcoo(int ), (int)558);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl183
            }
            case 6: {
                var3_3 /* !! */  = (int)hj.dcos("deqm", dcoo(int ), (int)559);
                if (!var4_2) ** GOTO lbl153
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)hj.dcos("deqn", dcoo(int ), (int)560);
                if (!var4_2) ** GOTO lbl153
                throw null;
            }
lbl179:
            // 3 sources

            case 8: {
                var3_3 /* !! */  = (int)hj.dcos("deqo", dcoo(int ), (int)561);
                if (!var4_2) ** GOTO lbl157
                throw null;
            }
lbl183:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)hj.dcos("deqq", dcoo(int ), (int)562);
                if (var4_2) {
                    throw null;
                }
            }
lbl187:
            // 4 sources

            case 10: {
                var3_3 /* !! */  = (int)hj.dcos("deqs", dcoo(int ), (int)563);
                if (!var4_2) ** GOTO lbl179
                throw null;
            }
            case 11: 
        }
        var3_3 /* !! */  = (int)hj.dcos("dequ", dcoo(int ), (int)564);
        ** while (!var4_2)
lbl194:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dglr() {
        hj.ddkp[300] = 2907569324060502244L;
        hj.ddkp[301] = -7849536500113086500L;
        hj.ddkp[302] = -3832086117014557857L;
        hj.ddkp[303] = -8797778860439439285L;
        hj.ddkp[304] = -8768222596253622849L;
        hj.ddkp[305] = -4690693318303465471L;
        hj.ddkp[306] = -8611009608934907160L;
        hj.ddkp[307] = 414857969590954501L;
        hj.ddkp[308] = 8369196539310214198L;
        hj.ddkp[309] = 6415453389441471739L;
        hj.ddkp[310] = -7442912632132173610L;
        hj.ddkp[311] = -7640554824746067691L;
        hj.ddkp[312] = 4450232783807948958L;
        hj.ddkp[313] = -7964108818011474871L;
        hj.ddkp[314] = -5337065610832387702L;
        hj.ddkp[315] = -1405358763006231854L;
        hj.ddkp[316] = 3252016603082062381L;
        hj.ddkp[317] = -5754778192087443452L;
        hj.ddkp[318] = 1356533118622064722L;
        hj.ddkp[319] = -2568349626926973469L;
        hj.ddkp[320] = -1197090890771862770L;
        hj.ddkp[321] = 4493755253234125553L;
        hj.ddkp[322] = 6657001569283243243L;
        hj.ddkp[323] = 7367819797371995002L;
        hj.ddkp[324] = 682144961489319658L;
        hj.ddkp[325] = -5541991619831840185L;
        hj.ddkp[326] = 4341107611278793991L;
        hj.ddkp[327] = -2378438600159948372L;
        hj.ddkp[328] = 5473525058807898455L;
        hj.ddkp[329] = -8307684281828238686L;
        hj.ddkp[330] = -5500373687143352254L;
        hj.ddkp[331] = -7768227231214687630L;
        hj.ddkp[332] = -7309715216247578086L;
        hj.ddkp[333] = -5497801714291868737L;
        hj.ddkp[334] = -3466647164029452491L;
        hj.ddkp[335] = 604072651047549423L;
        hj.ddkp[336] = -7624604439032587944L;
        hj.ddkp[337] = 8314271093875176532L;
        hj.ddkp[338] = -6113253314621737898L;
        hj.ddkp[339] = -3178531484263759127L;
        hj.ddkp[340] = 158753421488268270L;
        hj.ddkp[341] = -6321336963604207791L;
        hj.ddkp[342] = 5400947551850225500L;
        hj.ddkp[343] = 8694149462125593604L;
        hj.ddkp[344] = 3370301050072285753L;
        hj.ddkp[345] = 2918645943676835393L;
        hj.ddkp[346] = 1775671291588193799L;
        hj.ddkp[347] = -496156209265694274L;
        hj.ddkp[348] = 2876302592689062018L;
        hj.ddkp[349] = 1878880064799511327L;
        hj.ddkp[350] = 1502437529215271938L;
        hj.ddkp[351] = 4855121411421098136L;
        hj.ddkp[352] = 4932801623795451545L;
        hj.ddkp[353] = -7164411665694554898L;
        hj.ddkp[354] = 8550501773869283555L;
        hj.ddkp[355] = 5962034656547376102L;
        hj.ddkp[356] = 3674790089810827070L;
        hj.ddkp[357] = 2508662109004597274L;
        hj.ddkp[358] = -8134618672607142189L;
        hj.ddkp[359] = 2337369755053777622L;
        hj.ddkp[360] = -37206802880392916L;
        hj.ddkp[361] = -4322969260835687886L;
        hj.ddkp[362] = 9090278157381239576L;
        hj.ddkp[363] = 3214764853217023785L;
        hj.ddkp[364] = -1792988480303270368L;
        hj.ddkp[365] = 6064310168122171075L;
        hj.ddkp[366] = 381701293554698351L;
        hj.ddkp[367] = 2605720321711862646L;
        hj.ddkp[368] = 3493095094822644992L;
        hj.ddkp[369] = -3323775076523996467L;
        hj.ddkp[370] = 3949085942984271897L;
        hj.ddkp[371] = 2417107647401497197L;
        hj.ddkp[372] = 3140541771269150254L;
        hj.ddkp[373] = 6533027738542992348L;
        hj.ddkp[374] = -4434057679413618130L;
        hj.ddkp[375] = -8389413790035458852L;
        hj.ddkp[376] = 550017154793344691L;
        hj.ddkp[377] = -5850477720533464889L;
        hj.ddkp[378] = -7935433471961538827L;
        hj.ddkp[379] = 2181708805658533912L;
        hj.ddkp[380] = 5386013255291756719L;
        hj.ddkp[381] = -4705213118731337778L;
        hj.ddkp[382] = -2575378447654758899L;
        hj.ddkp[383] = 8561953115601707576L;
        hj.ddkp[384] = -1846029160518247974L;
        hj.ddkp[385] = -4738002401106091732L;
        hj.ddkp[386] = -442297457702433461L;
        hj.ddkp[387] = -298298362057227621L;
        hj.ddkp[388] = -1934787279402453892L;
        hj.ddkp[389] = -955726573048628081L;
        hj.ddkp[390] = 374122753215868263L;
        hj.ddkp[391] = -3768361219957733362L;
        hj.ddkp[392] = -5823009167620926031L;
        hj.ddkp[393] = 3565911902254581168L;
        hj.ddkp[394] = -5099499437587137148L;
        hj.ddkp[395] = 816186029767573849L;
        hj.ddkp[396] = 5930087507876936336L;
        hj.ddkp[397] = 4971825851536968063L;
        hj.ddkp[398] = -4633899116869463504L;
        hj.ddkp[399] = 78848090970502066L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void clearPotion(int var1_1) {
        block51: {
            v0 /* !! */  = hj.he;
            if (true) ** GOTO lbl5
            block34: while (true) {
                v0 /* !! */  = (long)(v1 - hj.dcos("ddwr", ddkn(int ), (int)122));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1439763152: {
                        v1 = hj.dcos("ddws", ddkn(int ), (int)123);
                        continue block34;
                    }
                    case -1204587779: {
                        v1 = hj.dcos("ddwt", ddkn(int ), (int)124);
                        continue block34;
                    }
                    case 27539926: {
                        break block34;
                    }
                    case 1803465041: {
                        v1 = hj.dcos("ddwu", ddkn(int ), (int)125);
                        continue block34;
                    }
                }
                break;
            }
            var4_2 = hj.c;
            v2 /* !! */  = hj.he;
            if (true) ** GOTO lbl22
            block35: while (true) {
                v2 /* !! */  = (long)(hj.dcos("ddww", ddkn(int ), (int)127) - hj.dcos("ddwv", ddkn(int ), (int)126));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -146589949: {
                        continue block35;
                    }
                    case 27539926: {
                        break block35;
                    }
                }
                break;
            }
            var3_3 /* !! */  = hj.b;
            v3 /* !! */  = hj.he;
            if (true) ** GOTO lbl32
            block36: while (true) {
                v3 /* !! */  = (long)(v4 - hj.dcos("ddwx", ddkn(int ), (int)128));
lbl32:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1299880537: {
                        v4 = hj.dcos("ddwy", ddkn(int ), (int)129);
                        continue block36;
                    }
                    case -87810100: {
                        v4 = hj.dcos("ddwz", ddkn(int ), (int)130);
                        continue block36;
                    }
                    case 27539926: {
                        break block36;
                    }
                }
                break;
            }
            var2_4 = hj.a;
            if (var4_2) {
                throw null;
lbl44:
                // 5 sources

                return;
            }
            if (var2_4 || var2_4) ** GOTO lbl44
            v5 /* !! */  = hj.he;
            if (true) ** GOTO lbl51
            block38: while (true) {
                v5 /* !! */  = (long)(hj.dcos("ddxb", ddkn(int ), (int)132) - hj.dcos("ddxa", ddkn(int ), (int)131));
lbl51:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case 27539926: {
                        break block38;
                    }
                    case 1594922636: {
                        continue block38;
                    }
                }
                break;
            }
            if (!this.isRingSlot(var1_1)) break block51;
            if (var2_4 || var2_4) ** GOTO lbl44
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_0 = hj.he - hj.dcos("ddxc", ddkn(int ), (int)133)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v6 /* !! */  == hj.dcos("ddxd", dcoo(int ), (int)248)) break;
                v6 /* !! */  = (long)hj.dcos("ddxe", dcoo(int ), (int)249);
            }
            v7 /* !! */  = hj.he;
            if (true) ** GOTO lbl68
            block40: while (true) {
                v7 /* !! */  = (long)(hj.dcos("ddxg", ddkn(int ), (int)135) - hj.dcos("ddxf", ddkn(int ), (int)134));
lbl68:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -281718980: {
                        continue block40;
                    }
                    case 27539926: {
                        break block40;
                    }
                }
                break;
            }
            this.selectedPotions[var1_1] = class_1799.field_8037;
            if (var2_4) ** GOTO lbl44
        }
        if (var2_4) ** GOTO lbl44
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
                    var3_3 /* !! */  = (int)hj.dcos("ddxh", dcoo(int ), (int)250);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl115
                    break;
                }
            }
lbl89:
            // 2 sources

            case 1: {
                do {
                    var3_3 /* !! */  = (int)hj.dcos("ddxi", dcoo(int ), (int)251);
                } while (!var4_2);
                throw null;
            }
lbl94:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)hj.dcos("ddxj", dcoo(int ), (int)252);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl115
            }
lbl99:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)hj.dcos("ddxk", dcoo(int ), (int)253);
                if (!var4_2) ** GOTO lbl89
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)hj.dcos("ddxl", dcoo(int ), (int)254);
                if (!var4_2) break;
                throw null;
            }
lbl107:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)hj.dcos("ddxm", dcoo(int ), (int)255);
                if (!var4_2) ** GOTO lbl94
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)hj.dcos("ddxn", dcoo(int ), (int)256);
                if (!var4_2) ** GOTO lbl99
                throw null;
            }
lbl115:
            // 3 sources

            case 7: {
                var3_3 /* !! */  = (int)hj.dcos("ddxo", dcoo(int ), (int)257);
                if (!var4_2) ** GOTO lbl107
                throw null;
            }
            case 8: 
        }
        var3_3 /* !! */  = (int)hj.dcos("ddxp", dcoo(int ), (int)258);
        ** while (!var4_2)
lbl122:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean samePotion(class_1799 var1_1, class_1799 var2_2) {
        block76: {
            block75: {
                v0 /* !! */  = hj.he;
                if (true) ** GOTO lbl5
                block43: while (true) {
                    v0 /* !! */  = (long)(hj.dcos("dggz", ddkn(int ), (int)416) - hj.dcos("dggy", ddkn(int ), (int)415));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case 27539926: {
                            break block43;
                        }
                        case 420362451: {
                            continue block43;
                        }
                    }
                    break;
                }
                var7_3 = hj.c;
                v1 /* !! */  = hj.he;
                if (true) ** GOTO lbl15
                block44: while (true) {
                    v1 /* !! */  = (long)(v2 - hj.dcos("dgha", ddkn(int ), (int)417));
lbl15:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case -207405904: {
                            v2 = hj.dcos("dghb", ddkn(int ), (int)418);
                            continue block44;
                        }
                        case -154588156: {
                            v2 = hj.dcos("dghc", ddkn(int ), (int)419);
                            continue block44;
                        }
                        case 27539926: {
                            break block44;
                        }
                        case 1881551593: {
                            v2 = hj.dcos("dghd", ddkn(int ), (int)420);
                            continue block44;
                        }
                    }
                    break;
                }
                var6_4 /* !! */  = hj.b;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_0 = hj.he - hj.dcos("dghe", ddkn(int ), (int)421)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == hj.dcos("dghf", dcoo(int ), (int)976)) break;
                    v3 /* !! */  = (long)hj.dcos("dghg", dcoo(int ), (int)977);
                }
                var5_5 = hj.a;
                if (var7_3) {
                    throw null;
lbl37:
                    // 7 sources

                    return (boolean)hj.dcos("dghh", dcoo(int ), (int)978);
                }
                if (var5_5 || var5_5) ** GOTO lbl37
                v4 /* !! */  = hj.he;
                if (true) ** GOTO lbl44
                block47: while (true) {
                    v4 /* !! */  = (long)(v5 - hj.dcos("dghi", ddkn(int ), (int)422));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1126189008: {
                            v5 = hj.dcos("dghj", ddkn(int ), (int)423);
                            continue block47;
                        }
                        case -350420173: {
                            v5 = hj.dcos("dghk", ddkn(int ), (int)424);
                            continue block47;
                        }
                        case 27539926: {
                            break block47;
                        }
                        case 580563238: {
                            v5 = hj.dcos("dghl", ddkn(int ), (int)425);
                            continue block47;
                        }
                    }
                    break;
                }
                if (!this.isSelectablePotion(var1_1)) break block75;
                if (var5_5) ** GOTO lbl37
                v6 /* !! */  = hj.he;
                if (true) ** GOTO lbl62
                block48: while (true) {
                    v6 /* !! */  = (long)(v7 - hj.dcos("dghm", ddkn(int ), (int)426));
lbl62:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1691219593: {
                            v7 = hj.dcos("dghn", ddkn(int ), (int)427);
                            continue block48;
                        }
                        case -644800232: {
                            v7 = hj.dcos("dgho", ddkn(int ), (int)428);
                            continue block48;
                        }
                        case 27539926: {
                            break block48;
                        }
                    }
                    break;
                }
                if (this.isSelectablePotion(var2_2)) break block76;
                if (var5_5) ** GOTO lbl37
            }
            if (var5_5 || var5_5) ** GOTO lbl37
            return (boolean)hj.dcos("dghp", dcoo(int ), (int)979);
        }
        if (var5_5 || var5_5) ** GOTO lbl37
        v8 /* !! */  = hj.he;
        if (true) ** GOTO lbl82
        block49: while (true) {
            v8 /* !! */  = (long)(v9 - hj.dcos("dghq", ddkn(int ), (int)429));
lbl82:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1590769496: {
                    v9 = hj.dcos("dghr", ddkn(int ), (int)430);
                    continue block49;
                }
                case 27539926: {
                    break block49;
                }
                case 613926291: {
                    v9 = hj.dcos("dghs", ddkn(int ), (int)431);
                    continue block49;
                }
            }
            break;
        }
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_1 = hj.he - hj.dcos("dght", ddkn(int ), (int)432)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v10 /* !! */  == hj.dcos("dghu", dcoo(int ), (int)980)) break;
            v10 /* !! */  = (long)hj.dcos("dghv", dcoo(int ), (int)981);
        }
        var3_6 = (class_1844)var1_1.method_58694(class_9334.field_49651);
        if (var5_5 || var5_5) ** GOTO lbl37
        if (var6_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_2 = hj.he - hj.dcos("dghw", ddkn(int ), (int)433)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v11 /* !! */  == hj.dcos("dghx", dcoo(int ), (int)982)) break;
                    v11 /* !! */  = (long)hj.dcos("dghy", dcoo(int ), (int)983);
                }
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_3 = hj.he - hj.dcos("dghz", ddkn(int ), (int)434)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v12 /* !! */  == hj.dcos("dgia", dcoo(int ), (int)984)) break;
                    v12 /* !! */  = (long)hj.dcos("dgib", dcoo(int ), (int)985);
                }
                var4_7 = (class_1844)var2_2.method_58694(class_9334.field_49651);
                if (!var5_5 && !var5_5) ** break;
                ** continue;
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_4 = hj.he - hj.dcos("dgic", ddkn(int ), (int)435)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v13 /* !! */  == hj.dcos("dgid", dcoo(int ), (int)986)) break;
                    v13 /* !! */  = (long)hj.dcos("dgie", dcoo(int ), (int)987);
                }
                return Objects.equals(var3_6, var4_7);
            }
lbl124:
            // 2 sources

            case 0: {
                var6_4 /* !! */  = (int)hj.dcos("dgif", dcoo(int ), (int)988);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl129:
            // 2 sources

            case 1: {
                var6_4 /* !! */  = (int)hj.dcos("dgig", dcoo(int ), (int)989);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 2: {
                var6_4 /* !! */  = (int)hj.dcos("dgih", dcoo(int ), (int)990);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl165
            }
            case 3: {
                var6_4 /* !! */  = (int)hj.dcos("dgii", dcoo(int ), (int)991);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl144:
            // 2 sources

            case 4: {
                var6_4 /* !! */  = (int)hj.dcos("dgij", dcoo(int ), (int)992);
                if (var7_3) {
                    throw null;
                }
            }
lbl148:
            // 4 sources

            case 5: {
                var6_4 /* !! */  = (int)hj.dcos("dgik", dcoo(int ), (int)993);
                if (var7_3) {
                    throw null;
                }
            }
lbl152:
            // 6 sources

            case 6: {
                var6_4 /* !! */  = (int)hj.dcos("dgil", dcoo(int ), (int)994);
                if (var7_3) {
                    throw null;
                }
            }
            case 7: {
                var6_4 /* !! */  = (int)hj.dcos("dgim", dcoo(int ), (int)995);
                if (!var7_3) ** GOTO lbl152
                throw null;
            }
            case 8: {
                do {
                    var6_4 /* !! */  = (int)hj.dcos("dgin", dcoo(int ), (int)996);
                } while (!var7_3);
                throw null;
            }
lbl165:
            // 2 sources

            case 9: {
                var6_4 /* !! */  = (int)hj.dcos("dgio", dcoo(int ), (int)997);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl182
            }
            case 10: {
                var6_4 /* !! */  = (int)hj.dcos("dgip", dcoo(int ), (int)998);
                if (!var7_3) ** GOTO lbl144
                throw null;
            }
            case 11: {
                var6_4 /* !! */  = (int)hj.dcos("dgiq", dcoo(int ), (int)999);
                if (!var7_3) ** GOTO lbl129
                throw null;
            }
lbl178:
            // 2 sources

            case 12: {
                var6_4 /* !! */  = (int)hj.dcos("dgir", dcoo(int ), (int)1000);
                if (!var7_3) ** GOTO lbl148
                throw null;
            }
lbl182:
            // 2 sources

            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_4 /* !! */  = (int)hj.dcos("dgis", dcoo(int ), (int)1001);
                    if (!var7_3) ** GOTO lbl124
                    throw null;
                }
            }
            case 14: 
        }
        var6_4 /* !! */  = (int)hj.dcos("dgit", dcoo(int ), (int)1002);
        ** while (!var7_3)
lbl190:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float desd(int n2) {
        return Float.intBitsToFloat(dcop[n2] ^ dcoq[n2]);
    }

    private static /* synthetic */ void dglq() {
        hj.ddkp[200] = -1258741527735407410L;
        hj.ddkp[201] = -639418238816500074L;
        hj.ddkp[202] = -7605349450373135651L;
        hj.ddkp[203] = 8152350403309548543L;
        hj.ddkp[204] = -5119881778490299918L;
        hj.ddkp[205] = 6251410139172133912L;
        hj.ddkp[206] = 3361638918948117117L;
        hj.ddkp[207] = -7309501742490499853L;
        hj.ddkp[208] = -1624143132280972142L;
        hj.ddkp[209] = 2042429374894117738L;
        hj.ddkp[210] = -850369435427748704L;
        hj.ddkp[211] = -1993134499924224172L;
        hj.ddkp[212] = -3461678196587162531L;
        hj.ddkp[213] = 1916470104003798096L;
        hj.ddkp[214] = -7118317860946716062L;
        hj.ddkp[215] = -6297460207293635254L;
        hj.ddkp[216] = -6191173804166544917L;
        hj.ddkp[217] = -3858428578408977010L;
        hj.ddkp[218] = 4875172463816807574L;
        hj.ddkp[219] = 4003105316755720410L;
        hj.ddkp[220] = -3597702305174821752L;
        hj.ddkp[221] = -2381786986534302806L;
        hj.ddkp[222] = 5702465290768423979L;
        hj.ddkp[223] = 4798315693746750120L;
        hj.ddkp[224] = 186563510774251930L;
        hj.ddkp[225] = -8426161663731130673L;
        hj.ddkp[226] = 5904842091764235729L;
        hj.ddkp[227] = 5948490686865523879L;
        hj.ddkp[228] = 4476035213149159800L;
        hj.ddkp[229] = -1888060460976515503L;
        hj.ddkp[230] = -3029181313834140426L;
        hj.ddkp[231] = -1801171163538175001L;
        hj.ddkp[232] = 833669949455047714L;
        hj.ddkp[233] = 2582006396607007945L;
        hj.ddkp[234] = -160958747282237018L;
        hj.ddkp[235] = -6381159684673527847L;
        hj.ddkp[236] = 764271615920035320L;
        hj.ddkp[237] = 3712124188006030404L;
        hj.ddkp[238] = 5103544813684301568L;
        hj.ddkp[239] = 3853711826465590606L;
        hj.ddkp[240] = -3520932066915468809L;
        hj.ddkp[241] = 5943462843377197561L;
        hj.ddkp[242] = -6837190580161694592L;
        hj.ddkp[243] = -5252078531828650604L;
        hj.ddkp[244] = 3511880432125863367L;
        hj.ddkp[245] = 179104861897920370L;
        hj.ddkp[246] = -3234304695710468910L;
        hj.ddkp[247] = -8235644943722975488L;
        hj.ddkp[248] = -7960117302040503994L;
        hj.ddkp[249] = 5374795540672711589L;
        hj.ddkp[250] = 2427142876067078069L;
        hj.ddkp[251] = 8245006116240892945L;
        hj.ddkp[252] = 7863927419640708574L;
        hj.ddkp[253] = 7574340205941470708L;
        hj.ddkp[254] = 3507052511877799168L;
        hj.ddkp[255] = -8108701254712113550L;
        hj.ddkp[256] = -7155119934924339176L;
        hj.ddkp[257] = 4927664384087358986L;
        hj.ddkp[258] = 8981011987451465500L;
        hj.ddkp[259] = 8631019107329749196L;
        hj.ddkp[260] = -5485010495984920337L;
        hj.ddkp[261] = -584880619066282308L;
        hj.ddkp[262] = -8414226313971014326L;
        hj.ddkp[263] = 804136943512698562L;
        hj.ddkp[264] = -5687595801490874186L;
        hj.ddkp[265] = -1049278640358300738L;
        hj.ddkp[266] = -7762701724713900554L;
        hj.ddkp[267] = 68600429435883552L;
        hj.ddkp[268] = -1412816404327185776L;
        hj.ddkp[269] = 8109975305184476467L;
        hj.ddkp[270] = -1020715447407351105L;
        hj.ddkp[271] = 6390088406854428565L;
        hj.ddkp[272] = 6203705687491826928L;
        hj.ddkp[273] = 1755652806958741920L;
        hj.ddkp[274] = -5748597492555888912L;
        hj.ddkp[275] = 5182428399862435688L;
        hj.ddkp[276] = -5923802233430956419L;
        hj.ddkp[277] = -7792917914741276902L;
        hj.ddkp[278] = -4630956619330223422L;
        hj.ddkp[279] = 302913717475774755L;
        hj.ddkp[280] = 4470381088220132303L;
        hj.ddkp[281] = 6322554256124558880L;
        hj.ddkp[282] = 6409039182675148094L;
        hj.ddkp[283] = 6956810603391051357L;
        hj.ddkp[284] = -3912792433954371733L;
        hj.ddkp[285] = 9212006190210616249L;
        hj.ddkp[286] = 260020400884913517L;
        hj.ddkp[287] = 248652884636782014L;
        hj.ddkp[288] = 1281113572857196870L;
        hj.ddkp[289] = 3296466246286545650L;
        hj.ddkp[290] = -4714368122332584107L;
        hj.ddkp[291] = 88315440095228780L;
        hj.ddkp[292] = 1347552298442949903L;
        hj.ddkp[293] = 7438211532103432361L;
        hj.ddkp[294] = -2713669315952800018L;
        hj.ddkp[295] = -6717833195064401496L;
        hj.ddkp[296] = -4708624678844910940L;
        hj.ddkp[297] = -8433554151989730391L;
        hj.ddkp[298] = 7762290724616850230L;
        hj.ddkp[299] = -1833044039183311400L;
    }

    private static /* synthetic */ void dgkz() {
        hj.dcoq[100] = 90761387;
        hj.dcoq[101] = -1406968142;
        hj.dcoq[102] = 1516933065;
        hj.dcoq[103] = 1101547409;
        hj.dcoq[104] = 215474057;
        hj.dcoq[105] = 2090471706;
        hj.dcoq[106] = 2046376982;
        hj.dcoq[107] = -467923951;
        hj.dcoq[108] = 330768492;
        hj.dcoq[109] = 856034961;
        hj.dcoq[110] = 586609004;
        hj.dcoq[111] = 1659457251;
        hj.dcoq[112] = -1472685864;
        hj.dcoq[113] = -1309219461;
        hj.dcoq[114] = -2089501714;
        hj.dcoq[115] = -1654992335;
        hj.dcoq[116] = -1116783951;
        hj.dcoq[117] = -1730059997;
        hj.dcoq[118] = -109952986;
        hj.dcoq[119] = 87713256;
        hj.dcoq[120] = 796285201;
        hj.dcoq[121] = 1371047935;
        hj.dcoq[122] = -1339877901;
        hj.dcoq[123] = 1442830746;
        hj.dcoq[124] = -1510900133;
        hj.dcoq[125] = 237091383;
        hj.dcoq[126] = -600154430;
        hj.dcoq[127] = -1176328027;
        hj.dcoq[128] = 644550544;
        hj.dcoq[129] = -1980910488;
        hj.dcoq[130] = -962786564;
        hj.dcoq[131] = 555205781;
        hj.dcoq[132] = 162091232;
        hj.dcoq[133] = 1926789796;
        hj.dcoq[134] = -2047966529;
        hj.dcoq[135] = 1077354950;
        hj.dcoq[136] = 1752604548;
        hj.dcoq[137] = -986812483;
        hj.dcoq[138] = 779265487;
        hj.dcoq[139] = -1940198834;
        hj.dcoq[140] = 517141706;
        hj.dcoq[141] = -770368317;
        hj.dcoq[142] = 1207654094;
        hj.dcoq[143] = 1212447513;
        hj.dcoq[144] = 894568049;
        hj.dcoq[145] = 1394240714;
        hj.dcoq[146] = -498661973;
        hj.dcoq[147] = 1542557524;
        hj.dcoq[148] = 1758107702;
        hj.dcoq[149] = 1066754287;
        hj.dcoq[150] = -1130828456;
        hj.dcoq[151] = -238141937;
        hj.dcoq[152] = 229692078;
        hj.dcoq[153] = -1483767651;
        hj.dcoq[154] = -1398081345;
        hj.dcoq[155] = 1213640221;
        hj.dcoq[156] = 666809174;
        hj.dcoq[157] = -979465716;
        hj.dcoq[158] = -22773002;
        hj.dcoq[159] = -2033867714;
        hj.dcoq[160] = 220916200;
        hj.dcoq[161] = -845459584;
        hj.dcoq[162] = -1344293137;
        hj.dcoq[163] = -1235949614;
        hj.dcoq[164] = -583073791;
        hj.dcoq[165] = -1919892440;
        hj.dcoq[166] = 570660973;
        hj.dcoq[167] = 381253138;
        hj.dcoq[168] = -1378337416;
        hj.dcoq[169] = 230337918;
        hj.dcoq[170] = 1924078953;
        hj.dcoq[171] = -1469313566;
        hj.dcoq[172] = -376978804;
        hj.dcoq[173] = -1791938549;
        hj.dcoq[174] = 1393887954;
        hj.dcoq[175] = -1150911098;
        hj.dcoq[176] = 1419480984;
        hj.dcoq[177] = -1327506268;
        hj.dcoq[178] = -1297192042;
        hj.dcoq[179] = -2108975975;
        hj.dcoq[180] = 710725311;
        hj.dcoq[181] = -207476814;
        hj.dcoq[182] = -1429979640;
        hj.dcoq[183] = -1297184250;
        hj.dcoq[184] = 1419184076;
        hj.dcoq[185] = 1221995079;
        hj.dcoq[186] = 614972155;
        hj.dcoq[187] = 334588769;
        hj.dcoq[188] = -1940753836;
        hj.dcoq[189] = -1554711661;
        hj.dcoq[190] = -1101813088;
        hj.dcoq[191] = -1658277749;
        hj.dcoq[192] = -1527348008;
        hj.dcoq[193] = 834142745;
        hj.dcoq[194] = 1372345639;
        hj.dcoq[195] = 1771147927;
        hj.dcoq[196] = -2046427295;
        hj.dcoq[197] = -1394114334;
        hj.dcoq[198] = -226339062;
        hj.dcoq[199] = 1623228186;
    }

    static {
        dcop = new int[1030];
        dcoq = new int[1030];
        hj.dgkn();
        hj.dgko();
        hj.dgkp();
        hj.dgkq();
        hj.dgkr();
        hj.dgks();
        hj.dgkt();
        hj.dgku();
        hj.dgkv();
        hj.dgkw();
        hj.dgkx();
        hj.dgky();
        hj.dgkz();
        hj.dgla();
        hj.dglb();
        hj.dglc();
        hj.dgld();
        hj.dgle();
        hj.dglf();
        hj.dglg();
        hj.dglh();
        hj.dgli();
        ddko = new long[454];
        ddkp = new long[454];
        hj.dglj();
        hj.dglk();
        hj.dgll();
        hj.dglm();
        hj.dgln();
        hj.dglo();
        hj.dglp();
        hj.dglq();
        hj.dglr();
        hj.dgls();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private hj$TrackedSplashPotion findPotionForEffect(class_1657 var1_1, class_6880<class_1291> var2_2, int var3_3) {
        var19_4 = hj.c;
        var18_5 /* !! */  = hj.b;
        var17_6 = hj.a;
        if (var18_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var18_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var19_4) {
                    throw null;
lbl9:
                    // 20 sources

                    return null;
                }
                if (var17_6 || var17_6) ** GOTO lbl9
                var4_7 = null;
                if (var17_6 || var17_6) ** GOTO lbl9
                var5_8 /* !! */  = hj.dcos("dfiy", dfix(int ), (int)323);
                if (var17_6 || var17_6) ** GOTO lbl9
                var7_9 = this.trackedPotions.values().iterator();
                if (var17_6) ** GOTO lbl9
                while (true) {
                    if (var17_6 || var17_6) ** GOTO lbl9
                    if (!var7_9.hasNext()) ** GOTO lbl53
                    if (var17_6) ** GOTO lbl9
                    var8_10 = var7_9.next();
                    if (var17_6 || var17_6) ** GOTO lbl9
                    this.refreshPotionStack(var8_10);
                    if (var17_6 || var17_6) ** GOTO lbl9
                    if (this.findFullEffectDuration(var8_10.potion, var2_2, var3_3) >= 0) ** GOTO lbl30
                    if (var17_6) ** GOTO lbl9
                    if (!var19_4) continue;
                    throw null;
lbl30:
                    // 1 sources

                    if (var17_6 || var17_6) ** GOTO lbl9
                    var9_11 = var1_1.method_23317() - var8_10.x;
                    if (var17_6 || var17_6) ** GOTO lbl9
                    var11_12 = var1_1.method_23318() - var8_10.y;
                    if (var17_6 || var17_6) ** GOTO lbl9
                    var13_13 = var1_1.method_23321() - var8_10.z;
                    if (var17_6 || var17_6) ** GOTO lbl9
                    var15_14 = var9_11 * var9_11 + var11_12 * var11_12 + var13_13 * var13_13;
                    if (var17_6 || var17_6) ** GOTO lbl9
                    if (var15_14 > hj.dcos("dfiz", dfix(int ), (int)324)) continue;
                    if (var17_6) ** GOTO lbl9
                    if (!(var15_14 >= var5_8 /* !! */ )) ** GOTO lbl45
                    if (var17_6) ** GOTO lbl9
                    if (!var19_4) continue;
                    throw null;
lbl45:
                    // 1 sources

                    if (var17_6 || var17_6) ** GOTO lbl9
                    var4_7 = var8_10;
                    if (var17_6 || var17_6) ** GOTO lbl9
                    var5_8 /* !! */  = (CallSite)var15_14;
                    if (var17_6 || var17_6) ** GOTO lbl9
                    if (var19_4) break;
                }
                throw null;
lbl53:
                // 1 sources

                if (!var17_6 && !var17_6) ** break;
                ** continue;
                return var4_7;
            }
lbl56:
            // 4 sources

            case 0: {
                var18_5 /* !! */  = (int)hj.dcos("dfja", dcoo(int ), (int)685);
                if (var19_4) {
                    throw null;
                }
                ** GOTO lbl224
            }
            case 1: {
                var18_5 /* !! */  = (int)hj.dcos("dfjb", dcoo(int ), (int)686);
                if (var19_4) {
                    throw null;
                }
                ** GOTO lbl172
            }
lbl66:
            // 2 sources

            case 2: {
                var18_5 /* !! */  = (int)hj.dcos("dfjc", dcoo(int ), (int)687);
                if (!var19_4) ** GOTO lbl56
                throw null;
            }
            case 3: {
                var18_5 /* !! */  = (int)hj.dcos("dfjd", dcoo(int ), (int)688);
                if (var19_4) {
                    throw null;
                }
                ** GOTO lbl103
            }
            case 4: {
                var18_5 /* !! */  = (int)hj.dcos("dfje", dcoo(int ), (int)689);
                if (var19_4) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 5: {
                var18_5 /* !! */  = (int)hj.dcos("dfjf", dcoo(int ), (int)690);
                if (var19_4) {
                    throw null;
                }
                ** GOTO lbl194
            }
            case 6: {
                var18_5 /* !! */  = (int)hj.dcos("dfjg", dcoo(int ), (int)691);
                if (!var19_4) break;
                throw null;
            }
lbl89:
            // 3 sources

            case 7: {
                var18_5 /* !! */  = (int)hj.dcos("dfjh", dcoo(int ), (int)692);
                if (var19_4) {
                    throw null;
                }
                ** GOTO lbl203
            }
            case 8: {
                var18_5 /* !! */  = (int)hj.dcos("dfji", dcoo(int ), (int)693);
                if (var19_4) {
                    throw null;
                }
                ** GOTO lbl207
            }
            case 9: {
                var18_5 /* !! */  = (int)hj.dcos("dfjj", dcoo(int ), (int)694);
                if (!var19_4) ** GOTO lbl89
                throw null;
            }
lbl103:
            // 4 sources

            case 10: {
                var18_5 /* !! */  = (int)hj.dcos("dfjk", dcoo(int ), (int)695);
                if (var19_4) {
                    throw null;
                }
                ** GOTO lbl162
            }
lbl108:
            // 2 sources

            case 11: {
                var18_5 /* !! */  = (int)hj.dcos("dfjl", dcoo(int ), (int)696);
                if (var19_4) {
                    throw null;
                }
                ** GOTO lbl194
            }
            case 12: {
                var18_5 /* !! */  = (int)hj.dcos("dfjm", dcoo(int ), (int)697);
                if (var19_4) {
                    throw null;
                }
                ** GOTO lbl220
            }
            case 13: {
                var18_5 /* !! */  = (int)hj.dcos("dfjn", dcoo(int ), (int)698);
                if (var19_4) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl123:
            // 2 sources

            case 14: {
                var18_5 /* !! */  = (int)hj.dcos("dfjo", dcoo(int ), (int)699);
                if (var19_4) {
                    throw null;
                }
            }
lbl127:
            // 4 sources

            case 15: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var18_5 /* !! */  = (int)hj.dcos("dfjp", dcoo(int ), (int)700);
                    if (!var19_4) ** GOTO lbl108
                    throw null;
                }
            }
            case 16: {
                var18_5 /* !! */  = (int)hj.dcos("dfjq", dcoo(int ), (int)701);
                if (var19_4) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl137:
            // 2 sources

            case 17: {
                var18_5 /* !! */  = (int)hj.dcos("dfjr", dcoo(int ), (int)702);
                if (!var19_4) ** GOTO lbl89
                throw null;
            }
lbl141:
            // 2 sources

            case 18: {
                var18_5 /* !! */  = (int)hj.dcos("dfjs", dcoo(int ), (int)703);
                if (!var19_4) ** GOTO lbl56
                throw null;
            }
            case 19: {
                var18_5 /* !! */  = (int)hj.dcos("dfjt", dcoo(int ), (int)704);
                if (var19_4) {
                    throw null;
                }
                ** GOTO lbl177
            }
            case 20: {
                var18_5 /* !! */  = (int)hj.dcos("dfju", dcoo(int ), (int)705);
                if (var19_4) {
                    throw null;
                }
            }
            case 21: {
                var18_5 /* !! */  = (int)hj.dcos("dfjv", dcoo(int ), (int)706);
                if (!var19_4) ** GOTO lbl141
                throw null;
            }
lbl158:
            // 2 sources

            case 22: {
                var18_5 /* !! */  = (int)hj.dcos("dfjw", dcoo(int ), (int)707);
                if (!var19_4) ** GOTO lbl66
                throw null;
            }
lbl162:
            // 2 sources

            case 23: {
                var18_5 /* !! */  = (int)hj.dcos("dfjx", dcoo(int ), (int)708);
                if (var19_4) {
                    throw null;
                }
                ** GOTO lbl199
            }
            case 24: {
                var18_5 /* !! */  = (int)hj.dcos("dfjy", dcoo(int ), (int)709);
                if (var19_4) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl172:
            // 2 sources

            case 25: {
                var18_5 /* !! */  = (int)hj.dcos("dfjz", dcoo(int ), (int)710);
                if (var19_4) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl177:
            // 2 sources

            case 26: {
                var18_5 /* !! */  = (int)hj.dcos("dfka", dcoo(int ), (int)711);
                if (var19_4) {
                    throw null;
                }
                ** GOTO lbl224
            }
            case 27: {
                var18_5 /* !! */  = (int)hj.dcos("dfkb", dcoo(int ), (int)712);
                if (!var19_4) ** GOTO lbl56
                throw null;
            }
lbl186:
            // 2 sources

            case 28: {
                var18_5 /* !! */  = (int)hj.dcos("dfkc", dcoo(int ), (int)713);
                if (!var19_4) ** GOTO lbl127
                throw null;
            }
            case 29: {
                var18_5 /* !! */  = (int)hj.dcos("dfkd", dcoo(int ), (int)714);
                if (!var19_4) ** GOTO lbl186
                throw null;
            }
lbl194:
            // 3 sources

            case 30: {
                var18_5 /* !! */  = (int)hj.dcos("dfke", dcoo(int ), (int)715);
                if (var19_4) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl199:
            // 2 sources

            case 31: {
                var18_5 /* !! */  = (int)hj.dcos("dfkf", dcoo(int ), (int)716);
                if (!var19_4) ** GOTO lbl103
                throw null;
            }
lbl203:
            // 3 sources

            case 32: {
                var18_5 /* !! */  = (int)hj.dcos("dfkg", dcoo(int ), (int)717);
                if (!var19_4) ** GOTO lbl123
                throw null;
            }
lbl207:
            // 4 sources

            case 33: {
                var18_5 /* !! */  = (int)hj.dcos("dfkh", dcoo(int ), (int)718);
                if (!var19_4) ** GOTO lbl203
                throw null;
            }
lbl211:
            // 3 sources

            case 34: {
                do {
                    var18_5 /* !! */  = (int)hj.dcos("dfki", dcoo(int ), (int)719);
                } while (!var19_4);
                throw null;
            }
lbl216:
            // 2 sources

            case 35: {
                var18_5 /* !! */  = (int)hj.dcos("dfkj", dcoo(int ), (int)720);
                if (!var19_4) ** GOTO lbl137
                throw null;
            }
lbl220:
            // 2 sources

            case 36: {
                var18_5 /* !! */  = (int)hj.dcos("dfkk", dcoo(int ), (int)721);
                if (!var19_4) ** GOTO lbl103
                throw null;
            }
lbl224:
            // 4 sources

            case 37: {
                var18_5 /* !! */  = (int)hj.dcos("dfkl", dcoo(int ), (int)722);
                if (!var19_4) ** GOTO lbl158
                throw null;
            }
            case 38: 
        }
        var18_5 /* !! */  = (int)hj.dcos("dfkm", dcoo(int ), (int)723);
        ** while (!var19_4)
lbl231:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void throwSelectedPotion(class_1799 var1_1) {
        v0 /* !! */  = hj.he;
        if (true) ** GOTO lbl5
        block25: while (true) {
            v0 /* !! */  = (long)(hj.dcos("deqy", ddkn(int ), (int)247) - hj.dcos("deqx", ddkn(int ), (int)246));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -316163346: {
                    continue block25;
                }
                case 27539926: {
                    break block25;
                }
            }
            break;
        }
        var4_2 = hj.c;
        v1 /* !! */  = hj.he;
        if (true) ** GOTO lbl15
        block26: while (true) {
            v1 /* !! */  = (long)(v2 - hj.dcos("deqz", ddkn(int ), (int)248));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1014674188: {
                    v2 = hj.dcos("dera", ddkn(int ), (int)249);
                    continue block26;
                }
                case -121759643: {
                    v2 = hj.dcos("derb", ddkn(int ), (int)250);
                    continue block26;
                }
                case 27539926: {
                    break block26;
                }
            }
            break;
        }
        var3_3 = hj.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = hj.he - hj.dcos("derc", ddkn(int ), (int)251)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == hj.dcos("derk", dcoo(int ), (int)565)) break;
            v3 /* !! */  = (long)hj.dcos("derl", dcoo(int ), (int)566);
        }
        var2_4 = hj.a;
        if (var4_2) {
            throw null;
lbl33:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl33
        v4 /* !! */  = hj.he;
        if (true) ** GOTO lbl40
        block29: while (true) {
            v4 /* !! */  = (long)(v5 - hj.dcos("derm", ddkn(int ), (int)252));
lbl40:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 27539926: {
                    break block29;
                }
                case 900172985: {
                    v5 = hj.dcos("dern", ddkn(int ), (int)253);
                    continue block29;
                }
                case 1710200605: {
                    v5 = hj.dcos("dero", ddkn(int ), (int)254);
                    continue block29;
                }
                case 1778167686: {
                    v5 = hj.dcos("derp", ddkn(int ), (int)255);
                    continue block29;
                }
            }
            break;
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_1 = hj.he - hj.dcos("derr", ddkn(int ), (int)256)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == hj.dcos("ders", dcoo(int ), (int)567)) break;
            v6 /* !! */  = (long)hj.dcos("dert", dcoo(int ), (int)568);
        }
        v7 /* !! */  = hj.he;
        if (true) ** GOTO lbl61
        block31: while (true) {
            v7 /* !! */  = (long)(v8 - hj.dcos("deru", ddkn(int ), (int)257));
lbl61:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case 27539926: {
                    break block31;
                }
                case 651341446: {
                    v8 = hj.dcos("derv", ddkn(int ), (int)258);
                    continue block31;
                }
                case 1220154388: {
                    v8 = hj.dcos("derw", ddkn(int ), (int)259);
                    continue block31;
                }
            }
            break;
        }
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_2 = hj.he - hj.dcos("derx", ddkn(int ), (int)260)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == hj.dcos("dery", dcoo(int ), (int)569)) break;
            v9 /* !! */  = (long)hj.dcos("derz", dcoo(int ), (int)570);
        }
        v10 = hj.mc.field_1724;
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_3 = hj.he - hj.dcos("desa", ddkn(int ), (int)261)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == hj.dcos("desb", dcoo(int ), (int)571)) break;
            v11 /* !! */  = (long)hj.dcos("desc", dcoo(int ), (int)572);
        }
        v12 = v10.method_36454();
        v13 = hj.dcos("dese", desd(int ), (int)573);
        v14 /* !! */  = hj.he;
        if (true) ** GOTO lbl87
        block34: while (true) {
            v14 /* !! */  = (long)(v15 - hj.dcos("desf", ddkn(int ), (int)262));
lbl87:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1996365378: {
                    v15 = hj.dcos("desg", ddkn(int ), (int)263);
                    continue block34;
                }
                case -1182054893: {
                    v15 = hj.dcos("desh", ddkn(int ), (int)264);
                    continue block34;
                }
                case 27539926: {
                    break block34;
                }
            }
            break;
        }
        v16 = new ov(v12, (float)v13);
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_4 = hj.he - hj.dcos("desi", ddkn(int ), (int)265)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == hj.dcos("desj", dcoo(int ), (int)574)) break;
            v17 /* !! */  = (long)hj.dcos("desk", dcoo(int ), (int)575);
        }
        pn.interactItem(class_1268.field_5808, v16);
        ** while (var2_4 || var2_4)
lbl104:
        // 1 sources

    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_1799 getSelectedPotion(int var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hj.he - hj.dcos("ddxq", ddkn(int ), (int)136)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hj.dcos("ddxr", dcoo(int ), (int)259)) break;
            v0 /* !! */  = (long)hj.dcos("ddxs", dcoo(int ), (int)260);
        }
        var4_2 = hj.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hj.he - hj.dcos("ddxt", ddkn(int ), (int)137)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hj.dcos("ddxu", dcoo(int ), (int)261)) break;
            v1 /* !! */  = (long)hj.dcos("ddxv", dcoo(int ), (int)262);
        }
        var3_3 /* !! */  = hj.b;
        v2 /* !! */  = hj.he;
        if (true) ** GOTO lbl19
        block24: while (true) {
            v2 /* !! */  = (long)(v3 - hj.dcos("ddxw", ddkn(int ), (int)138));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -685453842: {
                    v3 = hj.dcos("ddxx", ddkn(int ), (int)139);
                    continue block24;
                }
                case -417209451: {
                    v3 = hj.dcos("ddxy", ddkn(int ), (int)140);
                    continue block24;
                }
                case 27539926: {
                    break block24;
                }
                case 1398846297: {
                    v3 = hj.dcos("ddxz", ddkn(int ), (int)141);
                    continue block24;
                }
            }
            break;
        }
        var2_4 = hj.a;
        if (var4_2) {
            throw null;
lbl34:
            // 4 sources

            return null;
        }
        if (var2_4) ** GOTO lbl34
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl34
                v4 /* !! */  = hj.he;
                if (true) ** GOTO lbl45
                block26: while (true) {
                    v4 /* !! */  = (long)(v5 - hj.dcos("ddya", ddkn(int ), (int)142));
lbl45:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2130656880: {
                            v5 = hj.dcos("ddyb", ddkn(int ), (int)143);
                            continue block26;
                        }
                        case 27539926: {
                            break block26;
                        }
                        case 414935772: {
                            v5 = hj.dcos("ddyc", ddkn(int ), (int)144);
                            continue block26;
                        }
                        case 1311021755: {
                            v5 = hj.dcos("ddyd", ddkn(int ), (int)145);
                            continue block26;
                        }
                    }
                    break;
                }
                if (this.isRingSlot(var1_1)) ** GOTO lbl66
                if (var2_4) ** GOTO lbl34
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = hj.he - hj.dcos("ddye", ddkn(int ), (int)146)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == hj.dcos("ddyf", dcoo(int ), (int)263)) break;
                    v6 /* !! */  = (long)hj.dcos("ddyg", dcoo(int ), (int)264);
                }
                return class_1799.field_8037;
lbl66:
                // 1 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = hj.he - hj.dcos("ddyh", ddkn(int ), (int)147)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == hj.dcos("ddyi", dcoo(int ), (int)265)) break;
                    v7 /* !! */  = (long)hj.dcos("ddyj", dcoo(int ), (int)266);
                }
                return this.selectedPotions[var1_1];
            }
lbl75:
            // 3 sources

            case 0: {
                var3_3 /* !! */  = (int)hj.dcos("ddyk", dcoo(int ), (int)267);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl93
            }
lbl80:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)hj.dcos("ddyl", dcoo(int ), (int)268);
                if (var4_2) {
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)hj.dcos("ddym", dcoo(int ), (int)269);
                if (var4_2) {
                    throw null;
                }
            }
            case 3: {
                var3_3 /* !! */  = (int)hj.dcos("ddyn", dcoo(int ), (int)270);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl97
            }
lbl93:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)hj.dcos("ddyo", dcoo(int ), (int)271);
                if (!var4_2) ** GOTO lbl80
                throw null;
            }
lbl97:
            // 2 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hj.dcos("ddyp", dcoo(int ), (int)272);
                    if (!var4_2) ** GOTO lbl75
                    throw null;
                }
            }
            case 6: {
                var3_3 /* !! */  = (int)hj.dcos("ddyq", dcoo(int ), (int)273);
                if (!var4_2) ** GOTO lbl75
                throw null;
            }
            case 7: 
        }
        var3_3 /* !! */  = (int)hj.dcos("ddyr", dcoo(int ), (int)274);
        ** while (!var4_2)
lbl109:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dglf() {
        hj.dcoq[700] = -1438633268;
        hj.dcoq[701] = 904613095;
        hj.dcoq[702] = 1376248803;
        hj.dcoq[703] = -830667253;
        hj.dcoq[704] = 23262905;
        hj.dcoq[705] = 1407361496;
        hj.dcoq[706] = -1961879646;
        hj.dcoq[707] = 1224571529;
        hj.dcoq[708] = 1717989882;
        hj.dcoq[709] = 1322338585;
        hj.dcoq[710] = -737475052;
        hj.dcoq[711] = 1658039433;
        hj.dcoq[712] = 794323251;
        hj.dcoq[713] = -2096147644;
        hj.dcoq[714] = -755485804;
        hj.dcoq[715] = 1523183121;
        hj.dcoq[716] = -1232514109;
        hj.dcoq[717] = 1879975470;
        hj.dcoq[718] = 929416144;
        hj.dcoq[719] = -1120220020;
        hj.dcoq[720] = -503708619;
        hj.dcoq[721] = -900633016;
        hj.dcoq[722] = 1249843540;
        hj.dcoq[723] = 1377434317;
        hj.dcoq[724] = 648895073;
        hj.dcoq[725] = 1326667603;
        hj.dcoq[726] = 1526394627;
        hj.dcoq[727] = -560098610;
        hj.dcoq[728] = -1477948318;
        hj.dcoq[729] = -21873951;
        hj.dcoq[730] = 1590175174;
        hj.dcoq[731] = -1769480924;
        hj.dcoq[732] = 923080111;
        hj.dcoq[733] = -956979978;
        hj.dcoq[734] = 869979727;
        hj.dcoq[735] = -549828459;
        hj.dcoq[736] = 1997201976;
        hj.dcoq[737] = -1229545207;
        hj.dcoq[738] = 450646059;
        hj.dcoq[739] = -1926704519;
        hj.dcoq[740] = 1210970097;
        hj.dcoq[741] = -397172808;
        hj.dcoq[742] = -606855741;
        hj.dcoq[743] = -370403161;
        hj.dcoq[744] = 1172607851;
        hj.dcoq[745] = 718384974;
        hj.dcoq[746] = -1959456680;
        hj.dcoq[747] = -910479057;
        hj.dcoq[748] = -279306347;
        hj.dcoq[749] = -1159005600;
        hj.dcoq[750] = 368399140;
        hj.dcoq[751] = -130803145;
        hj.dcoq[752] = -1800839249;
        hj.dcoq[753] = 1008805569;
        hj.dcoq[754] = 1958361547;
        hj.dcoq[755] = -31483223;
        hj.dcoq[756] = 371829589;
        hj.dcoq[757] = -1521457799;
        hj.dcoq[758] = 1517440694;
        hj.dcoq[759] = 242326620;
        hj.dcoq[760] = -1726658795;
        hj.dcoq[761] = 112953800;
        hj.dcoq[762] = 332969918;
        hj.dcoq[763] = 732218554;
        hj.dcoq[764] = -1445152190;
        hj.dcoq[765] = -32240534;
        hj.dcoq[766] = 477999651;
        hj.dcoq[767] = -1880588517;
        hj.dcoq[768] = -465151550;
        hj.dcoq[769] = -880266148;
        hj.dcoq[770] = -1060819065;
        hj.dcoq[771] = -1084673855;
        hj.dcoq[772] = -1462787086;
        hj.dcoq[773] = -1013140961;
        hj.dcoq[774] = 135216464;
        hj.dcoq[775] = -595630134;
        hj.dcoq[776] = 1897136617;
        hj.dcoq[777] = -1583711914;
        hj.dcoq[778] = 934587010;
        hj.dcoq[779] = -657187053;
        hj.dcoq[780] = 1678545555;
        hj.dcoq[781] = 1024893630;
        hj.dcoq[782] = -1414312813;
        hj.dcoq[783] = 985455817;
        hj.dcoq[784] = -1970925308;
        hj.dcoq[785] = 799959157;
        hj.dcoq[786] = 2018719137;
        hj.dcoq[787] = 982876803;
        hj.dcoq[788] = 696006267;
        hj.dcoq[789] = -1145873355;
        hj.dcoq[790] = 104699855;
        hj.dcoq[791] = -1307084287;
        hj.dcoq[792] = 1771411073;
        hj.dcoq[793] = 212790114;
        hj.dcoq[794] = 335622709;
        hj.dcoq[795] = 1144344791;
        hj.dcoq[796] = -1659738919;
        hj.dcoq[797] = -1403033811;
        hj.dcoq[798] = -1117507503;
        hj.dcoq[799] = -1283785085;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void printPotionImpact(hj$TrackedSplashPotion var1_1) {
        v0 /* !! */  = hj.he;
        if (true) ** GOTO lbl5
        block104: while (true) {
            v0 /* !! */  = (long)(v1 - hj.dcos("deva", ddkn(int ), (int)266));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2093816603: {
                    v1 = hj.dcos("devb", ddkn(int ), (int)267);
                    continue block104;
                }
                case 27539926: {
                    break block104;
                }
                case 1217892066: {
                    v1 = hj.dcos("devc", ddkn(int ), (int)268);
                    continue block104;
                }
                case 1939088978: {
                    v1 = hj.dcos("devd", ddkn(int ), (int)269);
                    continue block104;
                }
            }
            break;
        }
        var7_2 = hj.c;
        v2 /* !! */  = hj.he;
        if (true) ** GOTO lbl22
        block105: while (true) {
            v2 /* !! */  = (long)(v3 - hj.dcos("deve", ddkn(int ), (int)270));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -796773277: {
                    v3 = hj.dcos("devf", ddkn(int ), (int)271);
                    continue block105;
                }
                case 27539926: {
                    break block105;
                }
                case 548083463: {
                    v3 = hj.dcos("devg", ddkn(int ), (int)272);
                    continue block105;
                }
                case 1983996707: {
                    v3 = hj.dcos("devh", ddkn(int ), (int)273);
                    continue block105;
                }
            }
            break;
        }
        var6_3 /* !! */  = hj.b;
        v4 /* !! */  = hj.he;
        if (true) ** GOTO lbl39
        block106: while (true) {
            v4 /* !! */  = (long)(hj.dcos("devj", ddkn(int ), (int)275) - hj.dcos("devi", ddkn(int ), (int)274));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 27539926: {
                    break block106;
                }
                case 1249677694: {
                    continue block106;
                }
            }
            break;
        }
        var5_4 = hj.a;
        if (var7_2) {
            throw null;
lbl47:
            // 12 sources

            return;
        }
        if (var5_4 || var5_4) ** GOTO lbl47
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_0 = hj.he - hj.dcos("devk", ddkn(int ), (int)276)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == hj.dcos("devl", dcoo(int ), (int)643)) break;
            v5 /* !! */  = (long)hj.dcos("devm", dcoo(int ), (int)644);
        }
        v6 = var1_1.hits;
        v7 /* !! */  = hj.he;
        if (true) ** GOTO lbl60
        block109: while (true) {
            v7 /* !! */  = (long)(hj.dcos("devo", ddkn(int ), (int)278) - hj.dcos("devn", ddkn(int ), (int)277));
lbl60:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -222840181: {
                    continue block109;
                }
                case 27539926: {
                    break block109;
                }
            }
            break;
        }
        if (v6.isEmpty()) ** GOTO lbl239
        if (var5_4 || var5_4) ** GOTO lbl47
        v8 /* !! */  = hj.he;
        if (true) ** GOTO lbl71
        block110: while (true) {
            v8 /* !! */  = (long)(v9 - hj.dcos("devp", ddkn(int ), (int)279));
lbl71:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1580900889: {
                    v9 = hj.dcos("devq", ddkn(int ), (int)280);
                    continue block110;
                }
                case -22400269: {
                    v9 = hj.dcos("devr", ddkn(int ), (int)281);
                    continue block110;
                }
                case 27539926: {
                    break block110;
                }
                case 1915847886: {
                    v9 = hj.dcos("devs", ddkn(int ), (int)282);
                    continue block110;
                }
            }
            break;
        }
        v10 = var1_1.hits;
        v11 /* !! */  = hj.he;
        if (true) ** GOTO lbl88
        block111: while (true) {
            v11 /* !! */  = (long)(v12 - hj.dcos("devt", ddkn(int ), (int)283));
lbl88:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -1878140185: {
                    v12 = hj.dcos("devu", ddkn(int ), (int)284);
                    continue block111;
                }
                case 27539926: {
                    break block111;
                }
                case 1319515939: {
                    v12 = hj.dcos("devv", ddkn(int ), (int)285);
                    continue block111;
                }
            }
            break;
        }
        v13 = v10.values();
        v14 /* !! */  = hj.he;
        if (true) ** GOTO lbl102
        block112: while (true) {
            v14 /* !! */  = (long)(hj.dcos("devx", ddkn(int ), (int)287) - hj.dcos("devw", ddkn(int ), (int)286));
lbl102:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1069555096: {
                    continue block112;
                }
                case 27539926: {
                    break block112;
                }
            }
            break;
        }
        var2_5 = v13.iterator();
        if (var5_4) ** GOTO lbl47
        block113: while (true) {
            if (var5_4 || var5_4) ** GOTO lbl47
            v15 /* !! */  = hj.he;
            if (true) ** GOTO lbl115
            block114: while (true) {
                v15 /* !! */  = (long)(hj.dcos("devz", ddkn(int ), (int)289) - hj.dcos("devy", ddkn(int ), (int)288));
lbl115:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case 27539926: {
                        break block114;
                    }
                    case 575258357: {
                        continue block114;
                    }
                }
                break;
            }
            if (!var2_5.hasNext()) ** GOTO lbl235
            if (var5_4) ** GOTO lbl47
            v16 /* !! */  = hj.he;
            if (true) ** GOTO lbl126
            block115: while (true) {
                v16 /* !! */  = (long)(v17 - hj.dcos("dewa", ddkn(int ), (int)290));
lbl126:
                // 2 sources

                switch ((int)v16 /* !! */ ) {
                    case -1967066936: {
                        v17 = hj.dcos("dewb", ddkn(int ), (int)291);
                        continue block115;
                    }
                    case -928491717: {
                        v17 = hj.dcos("dewc", ddkn(int ), (int)292);
                        continue block115;
                    }
                    case 27539926: {
                        break block115;
                    }
                    case 49406753: {
                        v17 = hj.dcos("dewd", ddkn(int ), (int)293);
                        continue block115;
                    }
                }
                break;
            }
            var3_6 = var2_5.next();
            if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var6_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var5_4 || var5_4) ** GOTO lbl47
                    while (true) {
                        if ((v18 /* !! */  = (cfr_temp_1 = hj.he - hj.dcos("dewe", ddkn(int ), (int)294)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v18 /* !! */  == hj.dcos("dewf", dcoo(int ), (int)645)) break;
                        v18 /* !! */  = (long)hj.dcos("dewg", dcoo(int ), (int)646);
                    }
                    var4_7 = this.hitPercent(var3_6);
                    if (var5_4 || var5_4) ** GOTO lbl47
                    while (true) {
                        if ((v19 /* !! */  = (cfr_temp_2 = hj.he - hj.dcos("dewh", ddkn(int ), (int)295)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v19 /* !! */  == hj.dcos("dewi", dcoo(int ), (int)647)) break;
                        v19 /* !! */  = (long)hj.dcos("dewj", dcoo(int ), (int)648);
                    }
                    v20 = var1_1.throwerName;
                    while (true) {
                        if ((v21 /* !! */  = (cfr_temp_3 = hj.he - hj.dcos("dewk", ddkn(int ), (int)296)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v21 /* !! */  == hj.dcos("dewl", dcoo(int ), (int)649)) break;
                        v21 /* !! */  = (long)hj.dcos("dewm", dcoo(int ), (int)650);
                    }
                    v22 = var1_1.potion;
                    v23 /* !! */  = hj.he;
                    if (true) ** GOTO lbl166
                    block119: while (true) {
                        v23 /* !! */  = (long)(v24 - hj.dcos("dewn", ddkn(int ), (int)297));
lbl166:
                        // 2 sources

                        switch ((int)v23 /* !! */ ) {
                            case 27539926: {
                                break block119;
                            }
                            case 973369264: {
                                v24 = hj.dcos("dewo", ddkn(int ), (int)298);
                                continue block119;
                            }
                            case 1227416849: {
                                v24 = hj.dcos("dewp", ddkn(int ), (int)299);
                                continue block119;
                            }
                            case 1318713613: {
                                v24 = hj.dcos("dewq", ddkn(int ), (int)300);
                                continue block119;
                            }
                        }
                        break;
                    }
                    v25 = this.getPotionName(v22);
                    while (true) {
                        if ((v26 /* !! */  = (cfr_temp_4 = hj.he - hj.dcos("dewr", ddkn(int ), (int)301)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v26 /* !! */  == hj.dcos("dews", dcoo(int ), (int)651)) break;
                        v26 /* !! */  = (long)hj.dcos("dewt", dcoo(int ), (int)652);
                    }
                    v27 = var3_6.playerName;
                    v28 /* !! */  = hj.he;
                    if (true) ** GOTO lbl189
                    block121: while (true) {
                        v28 /* !! */  = (long)(hj.dcos("dewv", ddkn(int ), (int)303) - hj.dcos("dewu", ddkn(int ), (int)302));
lbl189:
                        // 2 sources

                        switch ((int)v28 /* !! */ ) {
                            case -729010293: {
                                continue block121;
                            }
                            case 27539926: {
                                break block121;
                            }
                        }
                        break;
                    }
                    v29 = this.percentColor(var4_7);
                    while (true) {
                        if ((v30 /* !! */  = (cfr_temp_5 = hj.he - hj.dcos("deww", ddkn(int ), (int)304)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v30 /* !! */  == hj.dcos("dewx", dcoo(int ), (int)653)) break;
                        v30 /* !! */  = (long)hj.dcos("dewy", dcoo(int ), (int)654);
                    }
                    v31 = this.describeReceivedEffects(var3_6);
                    v32 /* !! */  = hj.he;
                    if (true) ** GOTO lbl205
                    block123: while (true) {
                        v32 /* !! */  = (long)(v33 - hj.dcos("dewz", ddkn(int ), (int)305));
lbl205:
                        // 2 sources

                        switch ((int)v32 /* !! */ ) {
                            case -684890176: {
                                v33 = hj.dcos("dexa", ddkn(int ), (int)306);
                                continue block123;
                            }
                            case 27539926: {
                                break block123;
                            }
                            case 841706021: {
                                v33 = hj.dcos("dexb", ddkn(int ), (int)307);
                                continue block123;
                            }
                            case 2014283568: {
                                v33 = hj.dcos("dexc", ddkn(int ), (int)308);
                                continue block123;
                            }
                        }
                        break;
                    }
                    v34 = "\u00a7d\u0417\u0435\u043b\u044c\u044f \u00a78| \u00a77\u0411\u0440\u043e\u0441\u0438\u043b: \u00a7f" + v20 + " \u00a78| \u00a77\u0417\u0435\u043b\u044c\u0435: \u00a7f" + v25 + " \u00a78| \u00a77\u0418\u0433\u0440\u043e\u043a: \u00a7f" + v27 + " \u00a78| \u00a77\u041f\u043e\u043f\u0430\u0434\u0430\u043d\u0438\u0435: " + v29 + var4_7 + "% \u00a78| \u00a77\u041f\u043e\u043b\u0443\u0447\u0438\u043b: \u00a7f" + v31;
                    v35 /* !! */  = hj.he;
                    if (true) ** GOTO lbl222
                    block124: while (true) {
                        v35 /* !! */  = (long)(v36 - hj.dcos("dexd", ddkn(int ), (int)309));
lbl222:
                        // 2 sources

                        switch ((int)v35 /* !! */ ) {
                            case -1125013958: {
                                v36 = hj.dcos("dexe", ddkn(int ), (int)310);
                                continue block124;
                            }
                            case 27539926: {
                                break block124;
                            }
                            case 486134569: {
                                v36 = hj.dcos("dexf", ddkn(int ), (int)311);
                                continue block124;
                            }
                        }
                        break;
                    }
                    pp.brandmessage(v34);
                    if (var5_4 || var5_4) ** GOTO lbl47
                    if (!var7_2) continue block113;
                    throw null;
                }
lbl235:
                // 1 sources

                if (var5_4 || var5_4) ** GOTO lbl47
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl293
lbl239:
                // 1 sources

                if (var5_4 || var5_4) ** GOTO lbl47
                while (true) {
                    if ((v37 /* !! */  = (cfr_temp_6 = hj.he - hj.dcos("dexg", ddkn(int ), (int)312)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v37 /* !! */  == hj.dcos("dexh", dcoo(int ), (int)655)) break;
                    v37 /* !! */  = (long)hj.dcos("dexi", dcoo(int ), (int)656);
                }
                v38 = var1_1.throwerName;
                v39 /* !! */  = hj.he;
                if (true) ** GOTO lbl250
                block126: while (true) {
                    v39 /* !! */  = (long)(v40 - hj.dcos("dexj", ddkn(int ), (int)313));
lbl250:
                    // 2 sources

                    switch ((int)v39 /* !! */ ) {
                        case -1352734698: {
                            v40 = hj.dcos("dexk", ddkn(int ), (int)314);
                            continue block126;
                        }
                        case -703870894: {
                            v40 = hj.dcos("dexl", ddkn(int ), (int)315);
                            continue block126;
                        }
                        case -159032432: {
                            v40 = hj.dcos("dexm", ddkn(int ), (int)316);
                            continue block126;
                        }
                        case 27539926: {
                            break block126;
                        }
                    }
                    break;
                }
                v41 = var1_1.potion;
                while (true) {
                    if ((v42 /* !! */  = (cfr_temp_7 = hj.he - hj.dcos("dexn", ddkn(int ), (int)317)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v42 /* !! */  == hj.dcos("dexo", dcoo(int ), (int)657)) break;
                    v42 /* !! */  = (long)hj.dcos("dexp", dcoo(int ), (int)658);
                }
                v43 = this.getPotionName(v41);
                while (true) {
                    if ((v44 /* !! */  = (cfr_temp_8 = hj.he - hj.dcos("dexq", ddkn(int ), (int)318)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v44 /* !! */  == hj.dcos("dexr", dcoo(int ), (int)659)) break;
                    v44 /* !! */  = (long)hj.dcos("dexs", dcoo(int ), (int)660);
                }
                v45 = "\u00a7d\u0417\u0435\u043b\u044c\u044f \u00a78| \u00a77\u0411\u0440\u043e\u0441\u0438\u043b: \u00a7f" + v38 + " \u00a78| \u00a77\u0417\u0435\u043b\u044c\u0435: \u00a7f" + v43 + " \u00a78| \u00a77\u0418\u0433\u0440\u043e\u043a: \u00a7f\u043d\u0438\u043a\u0442\u043e \u00a78| \u00a77\u041f\u043e\u043f\u0430\u0434\u0430\u043d\u0438\u0435: \u00a7c0% \u00a78| \u00a77\u041f\u043e\u043b\u0443\u0447\u0438\u043b: \u00a7f\u043d\u0435\u0442";
                v46 /* !! */  = hj.he;
                if (true) ** GOTO lbl279
                block129: while (true) {
                    v46 /* !! */  = (long)(v47 - hj.dcos("dext", ddkn(int ), (int)319));
lbl279:
                    // 2 sources

                    switch ((int)v46 /* !! */ ) {
                        case -2111188586: {
                            v47 = hj.dcos("dexu", ddkn(int ), (int)320);
                            continue block129;
                        }
                        case -45065308: {
                            v47 = hj.dcos("dexv", ddkn(int ), (int)321);
                            continue block129;
                        }
                        case 27539926: {
                            break block129;
                        }
                        case 268150724: {
                            v47 = hj.dcos("dexw", ddkn(int ), (int)322);
                            continue block129;
                        }
                    }
                    break;
                }
                pp.brandmessage(v45);
                if (var5_4) ** GOTO lbl47
lbl293:
                // 2 sources

                if (!var5_4 && !var5_4) ** break;
                ** continue;
                return;
lbl296:
                // 2 sources

                case 0: {
                    var6_3 /* !! */  = (int)hj.dcos("dexx", dcoo(int ), (int)661);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl347
                }
lbl301:
                // 2 sources

                case 1: {
                    var6_3 /* !! */  = (int)hj.dcos("dexy", dcoo(int ), (int)662);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl311
                }
lbl306:
                // 2 sources

                case 2: {
                    var6_3 /* !! */  = (int)hj.dcos("dexz", dcoo(int ), (int)663);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl321
                }
lbl311:
                // 3 sources

                case 3: {
                    var6_3 /* !! */  = (int)hj.dcos("deya", dcoo(int ), (int)664);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl378
                }
lbl316:
                // 3 sources

                case 4: {
                    do {
                        var6_3 /* !! */  = (int)hj.dcos("deyb", dcoo(int ), (int)665);
                    } while (!var7_2);
                    throw null;
                }
lbl321:
                // 3 sources

                case 5: {
                    var6_3 /* !! */  = (int)hj.dcos("deyc", dcoo(int ), (int)666);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl360
                }
                case 6: {
                    var6_3 /* !! */  = (int)hj.dcos("deyd", dcoo(int ), (int)667);
                    if (!var7_2) ** GOTO lbl316
                    throw null;
                }
lbl330:
                // 3 sources

                case 7: {
                    var6_3 /* !! */  = (int)hj.dcos("deye", dcoo(int ), (int)668);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl351
                }
                case 8: {
                    var6_3 /* !! */  = (int)hj.dcos("deyf", dcoo(int ), (int)669);
                    if (!var7_2) ** GOTO lbl330
                    throw null;
                }
                case 9: {
                    var6_3 /* !! */  = (int)hj.dcos("deyg", dcoo(int ), (int)670);
                    if (!var7_2) ** GOTO lbl301
                    throw null;
                }
lbl343:
                // 2 sources

                case 10: {
                    var6_3 /* !! */  = (int)hj.dcos("deyh", dcoo(int ), (int)671);
                    if (!var7_2) ** GOTO lbl311
                    throw null;
                }
lbl347:
                // 2 sources

                case 11: {
                    var6_3 /* !! */  = (int)hj.dcos("deyi", dcoo(int ), (int)672);
                    if (!var7_2) ** GOTO lbl306
                    throw null;
                }
lbl351:
                // 2 sources

                case 12: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var6_3 /* !! */  = (int)hj.dcos("deyj", dcoo(int ), (int)673);
                        if (!var7_2) ** GOTO lbl343
                        throw null;
                    }
                }
lbl356:
                // 2 sources

                case 13: {
                    var6_3 /* !! */  = (int)hj.dcos("deyk", dcoo(int ), (int)674);
                    if (!var7_2) break block113;
                    throw null;
                }
lbl360:
                // 2 sources

                case 14: {
                    var6_3 /* !! */  = (int)hj.dcos("deyl", dcoo(int ), (int)675);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl374
                }
                case 15: {
                    var6_3 /* !! */  = (int)hj.dcos("deym", dcoo(int ), (int)676);
                    if (!var7_2) ** GOTO lbl356
                    throw null;
                }
lbl369:
                // 3 sources

                case 16: {
                    var6_3 /* !! */  = (int)hj.dcos("deyn", dcoo(int ), (int)677);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl382
                }
lbl374:
                // 2 sources

                case 17: {
                    var6_3 /* !! */  = (int)hj.dcos("deyo", dcoo(int ), (int)678);
                    if (!var7_2) ** GOTO lbl316
                    throw null;
                }
lbl378:
                // 2 sources

                case 18: {
                    var6_3 /* !! */  = (int)hj.dcos("deyp", dcoo(int ), (int)679);
                    if (!var7_2) ** GOTO lbl321
                    throw null;
                }
lbl382:
                // 2 sources

                case 19: {
                    var6_3 /* !! */  = (int)hj.dcos("deyq", dcoo(int ), (int)680);
                    if (!var7_2) ** GOTO lbl296
                    throw null;
                }
                case 20: {
                    var6_3 /* !! */  = (int)hj.dcos("deyr", dcoo(int ), (int)681);
                    if (!var7_2) ** GOTO lbl330
                    throw null;
                }
                case 21: {
                    var6_3 /* !! */  = (int)hj.dcos("deys", dcoo(int ), (int)682);
                    if (!var7_2) ** GOTO lbl369
                    throw null;
                }
                case 22: {
                    var6_3 /* !! */  = (int)hj.dcos("deyt", dcoo(int ), (int)683);
                    if (!var7_2) ** GOTO lbl369
                    throw null;
                }
                case 23: 
            }
            break;
        }
        var6_3 /* !! */  = (int)hj.dcos("deyu", dcoo(int ), (int)684);
        ** while (!var7_2)
lbl401:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dgln() {
        hj.ddko[400] = -4897384209410760539L;
        hj.ddko[401] = -8049902795134370655L;
        hj.ddko[402] = 1058355118592566101L;
        hj.ddko[403] = -5602109206742592689L;
        hj.ddko[404] = -4036308453225413502L;
        hj.ddko[405] = 8141260019179377624L;
        hj.ddko[406] = 5628783546820987249L;
        hj.ddko[407] = 2749307965114718192L;
        hj.ddko[408] = -2465789510451577345L;
        hj.ddko[409] = -3405021334929885690L;
        hj.ddko[410] = 549275173128267467L;
        hj.ddko[411] = 2501882154229927910L;
        hj.ddko[412] = 2426719977580067476L;
        hj.ddko[413] = -2512514847161195187L;
        hj.ddko[414] = 5305336334916542066L;
        hj.ddko[415] = 3412253800939047546L;
        hj.ddko[416] = -1669991224638910983L;
        hj.ddko[417] = -28997722172183371L;
        hj.ddko[418] = 8094907102332944332L;
        hj.ddko[419] = 2959576330644956398L;
        hj.ddko[420] = -353373504911944159L;
        hj.ddko[421] = 8403647345388561153L;
        hj.ddko[422] = 1232625685172661931L;
        hj.ddko[423] = 5662352262376237996L;
        hj.ddko[424] = 972710674284316986L;
        hj.ddko[425] = 3590628638124374393L;
        hj.ddko[426] = -1810694680629449245L;
        hj.ddko[427] = 1737259855938991630L;
        hj.ddko[428] = -2208362603767473798L;
        hj.ddko[429] = -2547221993187811403L;
        hj.ddko[430] = -3872599937712566367L;
        hj.ddko[431] = -3416402283452196912L;
        hj.ddko[432] = -7039796351633550771L;
        hj.ddko[433] = -7097562855821521752L;
        hj.ddko[434] = 5965891617841990634L;
        hj.ddko[435] = -7070598933448906923L;
        hj.ddko[436] = 9148926826848283115L;
        hj.ddko[437] = 3323509500832140022L;
        hj.ddko[438] = -8198322263413987686L;
        hj.ddko[439] = -1061973153649816144L;
        hj.ddko[440] = 4042100053184247264L;
        hj.ddko[441] = 1905056425397901137L;
        hj.ddko[442] = 2915331117615983636L;
        hj.ddko[443] = 1905550933199784017L;
        hj.ddko[444] = 2688557910212779552L;
        hj.ddko[445] = -1993945222922883285L;
        hj.ddko[446] = -8982929867611197688L;
        hj.ddko[447] = -5500039983424626635L;
        hj.ddko[448] = -3548944476871742585L;
        hj.ddko[449] = -9219668559561589923L;
        hj.ddko[450] = -6122960394292662188L;
        hj.ddko[451] = -6396236365832991218L;
        hj.ddko[452] = -1327264695230861111L;
        hj.ddko[453] = -8436308037727213422L;
    }

    private static /* synthetic */ void dglc() {
        hj.dcoq[400] = 1178055194;
        hj.dcoq[401] = -10097878;
        hj.dcoq[402] = 1969581534;
        hj.dcoq[403] = -976074265;
        hj.dcoq[404] = 1517610914;
        hj.dcoq[405] = 1792393034;
        hj.dcoq[406] = 762344781;
        hj.dcoq[407] = 417974044;
        hj.dcoq[408] = -607093023;
        hj.dcoq[409] = 1514956456;
        hj.dcoq[410] = -824480060;
        hj.dcoq[411] = 1323609761;
        hj.dcoq[412] = -1907483904;
        hj.dcoq[413] = -1047864495;
        hj.dcoq[414] = 827809020;
        hj.dcoq[415] = 331058700;
        hj.dcoq[416] = 40017022;
        hj.dcoq[417] = -745236232;
        hj.dcoq[418] = -853224457;
        hj.dcoq[419] = 571907750;
        hj.dcoq[420] = 998922087;
        hj.dcoq[421] = -179869415;
        hj.dcoq[422] = -800179112;
        hj.dcoq[423] = -1895176151;
        hj.dcoq[424] = -78645051;
        hj.dcoq[425] = 6376801;
        hj.dcoq[426] = -990742546;
        hj.dcoq[427] = -1205187637;
        hj.dcoq[428] = -1479028905;
        hj.dcoq[429] = -1374671796;
        hj.dcoq[430] = 1690090385;
        hj.dcoq[431] = -1564886149;
        hj.dcoq[432] = 1980394368;
        hj.dcoq[433] = -474143728;
        hj.dcoq[434] = 438284849;
        hj.dcoq[435] = -775347863;
        hj.dcoq[436] = -239809918;
        hj.dcoq[437] = 2071963577;
        hj.dcoq[438] = -625525461;
        hj.dcoq[439] = 974306252;
        hj.dcoq[440] = -1868332821;
        hj.dcoq[441] = 163760788;
        hj.dcoq[442] = 144008670;
        hj.dcoq[443] = 1563947231;
        hj.dcoq[444] = -1004431281;
        hj.dcoq[445] = -982950447;
        hj.dcoq[446] = 1198806142;
        hj.dcoq[447] = 1463410475;
        hj.dcoq[448] = -40168394;
        hj.dcoq[449] = -1385970589;
        hj.dcoq[450] = 672161831;
        hj.dcoq[451] = -390844917;
        hj.dcoq[452] = -1834069416;
        hj.dcoq[453] = 141861163;
        hj.dcoq[454] = 76188725;
        hj.dcoq[455] = 718660205;
        hj.dcoq[456] = 167164423;
        hj.dcoq[457] = -2012232876;
        hj.dcoq[458] = -974846254;
        hj.dcoq[459] = -2020852779;
        hj.dcoq[460] = 2140040940;
        hj.dcoq[461] = 1880159488;
        hj.dcoq[462] = -1045398321;
        hj.dcoq[463] = -183509593;
        hj.dcoq[464] = -965332410;
        hj.dcoq[465] = -765642008;
        hj.dcoq[466] = -1765349677;
        hj.dcoq[467] = -890908745;
        hj.dcoq[468] = -425031847;
        hj.dcoq[469] = -1462017695;
        hj.dcoq[470] = 218716568;
        hj.dcoq[471] = -994524127;
        hj.dcoq[472] = -1091468289;
        hj.dcoq[473] = -1090547353;
        hj.dcoq[474] = -948587320;
        hj.dcoq[475] = 991478354;
        hj.dcoq[476] = 1941178103;
        hj.dcoq[477] = -1466333097;
        hj.dcoq[478] = -1319284674;
        hj.dcoq[479] = -109075683;
        hj.dcoq[480] = -880418147;
        hj.dcoq[481] = -1619184261;
        hj.dcoq[482] = 1607109598;
        hj.dcoq[483] = -1303748886;
        hj.dcoq[484] = -633057901;
        hj.dcoq[485] = -1359499214;
        hj.dcoq[486] = 1650106961;
        hj.dcoq[487] = 1250608246;
        hj.dcoq[488] = 1111647811;
        hj.dcoq[489] = -785784372;
        hj.dcoq[490] = -1783098799;
        hj.dcoq[491] = 1675178911;
        hj.dcoq[492] = -464649123;
        hj.dcoq[493] = 1056970645;
        hj.dcoq[494] = -821036171;
        hj.dcoq[495] = -561161551;
        hj.dcoq[496] = -99901051;
        hj.dcoq[497] = 344152795;
        hj.dcoq[498] = -2014874839;
        hj.dcoq[499] = 598034740;
    }

    private static /* synthetic */ void dgkq() {
        hj.dcop[300] = -1348857080;
        hj.dcop[301] = 2127498548;
        hj.dcop[302] = 1712938673;
        hj.dcop[303] = 276119259;
        hj.dcop[304] = -1473685067;
        hj.dcop[305] = 2385486;
        hj.dcop[306] = 1454921482;
        hj.dcop[307] = -350286866;
        hj.dcop[308] = 1224366717;
        hj.dcop[309] = -657980201;
        hj.dcop[310] = -1424292299;
        hj.dcop[311] = -380168294;
        hj.dcop[312] = 173152056;
        hj.dcop[313] = -803615177;
        hj.dcop[314] = 215329852;
        hj.dcop[315] = 542938840;
        hj.dcop[316] = -484875643;
        hj.dcop[317] = -1211527942;
        hj.dcop[318] = 1001027922;
        hj.dcop[319] = 419539559;
        hj.dcop[320] = 994381070;
        hj.dcop[321] = -1885881075;
        hj.dcop[322] = 738145858;
        hj.dcop[323] = -952768677;
        hj.dcop[324] = 1270795701;
        hj.dcop[325] = 2013049311;
        hj.dcop[326] = -444802697;
        hj.dcop[327] = 898786288;
        hj.dcop[328] = 543404018;
        hj.dcop[329] = 546929227;
        hj.dcop[330] = 981638547;
        hj.dcop[331] = 806570961;
        hj.dcop[332] = -940182870;
        hj.dcop[333] = -1079498637;
        hj.dcop[334] = 1503358451;
        hj.dcop[335] = -244890735;
        hj.dcop[336] = 318539478;
        hj.dcop[337] = -1965597481;
        hj.dcop[338] = 498973206;
        hj.dcop[339] = 1845303019;
        hj.dcop[340] = -205242412;
        hj.dcop[341] = 1784102611;
        hj.dcop[342] = -32830929;
        hj.dcop[343] = 1132233032;
        hj.dcop[344] = 1059724634;
        hj.dcop[345] = -493075911;
        hj.dcop[346] = 1128653004;
        hj.dcop[347] = -1965094289;
        hj.dcop[348] = -1671860889;
        hj.dcop[349] = 1253989612;
        hj.dcop[350] = 1032439030;
        hj.dcop[351] = 187318475;
        hj.dcop[352] = 488616103;
        hj.dcop[353] = -1969121313;
        hj.dcop[354] = 825918155;
        hj.dcop[355] = 1394398492;
        hj.dcop[356] = -1675395291;
        hj.dcop[357] = 662639692;
        hj.dcop[358] = -2082669237;
        hj.dcop[359] = -1791731950;
        hj.dcop[360] = 1768609885;
        hj.dcop[361] = 355726454;
        hj.dcop[362] = -639820691;
        hj.dcop[363] = 1267310254;
        hj.dcop[364] = -2089772966;
        hj.dcop[365] = -114441705;
        hj.dcop[366] = -1435913303;
        hj.dcop[367] = 1952324995;
        hj.dcop[368] = 315622173;
        hj.dcop[369] = -1893581113;
        hj.dcop[370] = -1211600394;
        hj.dcop[371] = -183196605;
        hj.dcop[372] = -1014457107;
        hj.dcop[373] = 440057184;
        hj.dcop[374] = -1777259263;
        hj.dcop[375] = 1945393217;
        hj.dcop[376] = 139181907;
        hj.dcop[377] = 221865888;
        hj.dcop[378] = 1231101967;
        hj.dcop[379] = -641931923;
        hj.dcop[380] = 627614815;
        hj.dcop[381] = -878634574;
        hj.dcop[382] = 747367653;
        hj.dcop[383] = 117385488;
        hj.dcop[384] = -654125438;
        hj.dcop[385] = -347164425;
        hj.dcop[386] = -78022267;
        hj.dcop[387] = -23208044;
        hj.dcop[388] = -1869988600;
        hj.dcop[389] = 729609864;
        hj.dcop[390] = -1799554849;
        hj.dcop[391] = 2064520319;
        hj.dcop[392] = -953468984;
        hj.dcop[393] = 1243252622;
        hj.dcop[394] = -211634872;
        hj.dcop[395] = 1059543980;
        hj.dcop[396] = -1990165049;
        hj.dcop[397] = 2095800304;
        hj.dcop[398] = -357076746;
        hj.dcop[399] = 1641027230;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onPacket(cr var1_1) {
        block6: {
            block5: {
                block4: {
                    block3: {
                        var9_2 = hj.c;
                        var8_3 = hj.b;
                        var7_4 = hj.a;
                        if (var9_2) {
                            throw null;
lbl6:
                            // 20 sources

                            return;
                        }
                        if (var7_4 || var7_4) ** GOTO lbl6
                        if (!this.debugPotions.isValue()) break block3;
                        if (var7_4) ** GOTO lbl6
                        if (var1_1.isSend()) break block3;
                        if (var7_4) ** GOTO lbl6
                        if (hj.mc.field_1687 == null) break block3;
                        if (var7_4 || var7_4) ** GOTO lbl6
                        var4_5 /* !! */  = var1_1.getPacket();
                        if (var7_4) ** GOTO lbl6
                        if (!(var4_5 /* !! */  instanceof class_2783)) break block3;
                        if (var7_4) ** GOTO lbl6
                        var2_6 = (class_2783)var4_5 /* !! */ ;
                        if (var7_4 || var7_4) ** GOTO lbl6
                        var4_5 /* !! */  = hj.mc.field_1687.method_8469(var2_6.method_11943());
                        if (var7_4) ** GOTO lbl6
                        if (!(var4_5 /* !! */  instanceof class_1657)) break block3;
                        if (var7_4) ** GOTO lbl6
                        var3_7 = (class_1657)var4_5 /* !! */ ;
                        if (var7_4 || var7_4) ** GOTO lbl6
                        if (var9_2) {
                            throw null;
                        }
                        break block4;
                    }
                    if (var7_4 || var7_4) ** GOTO lbl6
                    return;
                }
                if (var7_4 || var7_4) ** GOTO lbl6
                var4_5 /* !! */  = this.findPotionForEffect(var3_7, (class_6880<class_1291>)var2_6.method_11946(), var2_6.method_11945());
                if (var7_4 || var7_4) ** GOTO lbl6
                if (var4_5 /* !! */  != null) break block5;
                if (var7_4) ** GOTO lbl6
                return;
            }
            if (var7_4 || var7_4) ** GOTO lbl6
            var5_8 = this.findFullEffectDuration(var4_5 /* !! */ .potion, (class_6880<class_1291>)var2_6.method_11946(), var2_6.method_11945());
            if (var7_4 || var7_4) ** GOTO lbl6
            if (var5_8 >= 0) break block6;
            if (var7_4) ** GOTO lbl6
            return;
        }
        if (var7_4 || var7_4) ** GOTO lbl6
        var6_9 = var4_5 /* !! */ .hits.computeIfAbsent(var3_7.method_5667(), (Function<UUID, hj$PlayerPotionHit>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$onPacket$0(net.minecraft.class_1657 java.util.UUID ), (Ljava/util/UUID;)Lruhack/phobia/hj$PlayerPotionHit;)((class_1657)var3_7));
        if (var7_4 || var7_4) ** GOTO lbl6
        var6_9.effects.put((class_6880<class_1291>)var2_6.method_11946(), new hj$ReceivedPotionEffect((class_6880<class_1291>)var2_6.method_11946(), var2_6.method_11945(), var2_6.method_11944(), var5_8));
        if (!var7_4 && !var7_4) ** break;
        ** while (true)
    }

    private static /* synthetic */ void dglo() {
        hj.ddkp[0] = -8835863452897222343L;
        hj.ddkp[1] = 2994418765756646758L;
        hj.ddkp[2] = 5071864824867989947L;
        hj.ddkp[3] = 8688356537170366105L;
        hj.ddkp[4] = 6583587435280863052L;
        hj.ddkp[5] = 6702346816142067205L;
        hj.ddkp[6] = -1674581222453503976L;
        hj.ddkp[7] = 8324003294468804061L;
        hj.ddkp[8] = 3137001770324272177L;
        hj.ddkp[9] = 8030179061051410786L;
        hj.ddkp[10] = 5064923495021842603L;
        hj.ddkp[11] = 429549216454134694L;
        hj.ddkp[12] = 8559538944272936404L;
        hj.ddkp[13] = -548737226798034570L;
        hj.ddkp[14] = -7049312400591111609L;
        hj.ddkp[15] = -4150756323286006143L;
        hj.ddkp[16] = -6101533731056052911L;
        hj.ddkp[17] = 2659568998071584586L;
        hj.ddkp[18] = 4728588674910366225L;
        hj.ddkp[19] = 3474267032598647521L;
        hj.ddkp[20] = 5447755830496670644L;
        hj.ddkp[21] = 483223829119651258L;
        hj.ddkp[22] = 7030372040185647503L;
        hj.ddkp[23] = -3597422704627953733L;
        hj.ddkp[24] = 8772807213101123843L;
        hj.ddkp[25] = 2930491903852668498L;
        hj.ddkp[26] = 872878740019481110L;
        hj.ddkp[27] = 6496138874933392347L;
        hj.ddkp[28] = 1529871346595441410L;
        hj.ddkp[29] = 6711820344819097776L;
        hj.ddkp[30] = -4364699721804432119L;
        hj.ddkp[31] = -7586404917650437218L;
        hj.ddkp[32] = 4480549782554295075L;
        hj.ddkp[33] = -6507460982711699155L;
        hj.ddkp[34] = -3756865867659582363L;
        hj.ddkp[35] = 8887445724862783547L;
        hj.ddkp[36] = -6688379511967134598L;
        hj.ddkp[37] = -6918841598868219842L;
        hj.ddkp[38] = -7320716729248457926L;
        hj.ddkp[39] = -5620560211530518020L;
        hj.ddkp[40] = 5278700181945873873L;
        hj.ddkp[41] = -6713774622292592467L;
        hj.ddkp[42] = 5228789596645744543L;
        hj.ddkp[43] = -7013008271966625418L;
        hj.ddkp[44] = -3148201884523033127L;
        hj.ddkp[45] = 2716100628316974626L;
        hj.ddkp[46] = 4973328991378499332L;
        hj.ddkp[47] = -6733679261021511678L;
        hj.ddkp[48] = -6243963123034890697L;
        hj.ddkp[49] = 2840707749288346129L;
        hj.ddkp[50] = 6035205152974324699L;
        hj.ddkp[51] = -3825767149323226793L;
        hj.ddkp[52] = -6230124212309170512L;
        hj.ddkp[53] = 4112254841961582839L;
        hj.ddkp[54] = -965468099821658211L;
        hj.ddkp[55] = -656937134423241961L;
        hj.ddkp[56] = 111590779367394012L;
        hj.ddkp[57] = -5040374412996399139L;
        hj.ddkp[58] = -9077985442060887134L;
        hj.ddkp[59] = -3135199784180163447L;
        hj.ddkp[60] = 6893986315499260384L;
        hj.ddkp[61] = -8560755068397481826L;
        hj.ddkp[62] = 1935478695811551680L;
        hj.ddkp[63] = -8528977765305656003L;
        hj.ddkp[64] = -3200105114239545719L;
        hj.ddkp[65] = 1980692831080127188L;
        hj.ddkp[66] = -8787775365279287400L;
        hj.ddkp[67] = -2764980426741380975L;
        hj.ddkp[68] = -6529193394219399963L;
        hj.ddkp[69] = -9166879535594882488L;
        hj.ddkp[70] = 7486963791077813927L;
        hj.ddkp[71] = -2533787153963101526L;
        hj.ddkp[72] = 6895020191827483205L;
        hj.ddkp[73] = 2700508972752094693L;
        hj.ddkp[74] = -6789046173844378567L;
        hj.ddkp[75] = -6012864163844249141L;
        hj.ddkp[76] = -4319275886887519500L;
        hj.ddkp[77] = -3224415454089723975L;
        hj.ddkp[78] = -7139536038149768802L;
        hj.ddkp[79] = -5441757895359423890L;
        hj.ddkp[80] = -7483761906314990313L;
        hj.ddkp[81] = -7100522394935512778L;
        hj.ddkp[82] = 1819897599236931985L;
        hj.ddkp[83] = -4463211140112889068L;
        hj.ddkp[84] = -8929990307790460653L;
        hj.ddkp[85] = 4538421659067235539L;
        hj.ddkp[86] = 548878786710837680L;
        hj.ddkp[87] = -297444915607276454L;
        hj.ddkp[88] = 8766117698355750212L;
        hj.ddkp[89] = -6317591209350252871L;
        hj.ddkp[90] = -4421820282423792976L;
        hj.ddkp[91] = -5006759328654892840L;
        hj.ddkp[92] = 90092244943097119L;
        hj.ddkp[93] = 8658550554548209490L;
        hj.ddkp[94] = 4473660284546979857L;
        hj.ddkp[95] = 6603039056718892424L;
        hj.ddkp[96] = -5344176392938890926L;
        hj.ddkp[97] = -2759468743575317L;
        hj.ddkp[98] = -687519855340319165L;
        hj.ddkp[99] = 6039929295464959982L;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean usePotion(int n2) {
        boolean bl2;
        block18: {
            int n3;
            int n4;
            class_1799 class_17992;
            block17: {
                boolean bl3;
                block16: {
                    block15: {
                        bl3 = c;
                        int n5 = b;
                        bl2 = a;
                        if (bl3) {
                            throw null;
                        }
                        if (bl2 || bl2) return (boolean)hj.dcos("deao", dcoo(int ), (int)310);
                        if (!this.isRingSlot(n2)) break block15;
                        if (bl2) return (boolean)hj.dcos("deao", dcoo(int ), (int)310);
                        if (hj.mc.field_1724 == null) break block15;
                        if (bl2) return (boolean)hj.dcos("deao", dcoo(int ), (int)310);
                        if (hj.mc.field_1687 == null) break block15;
                        if (bl2) return (boolean)hj.dcos("deao", dcoo(int ), (int)310);
                        if (this.throwStage == 0) break block16;
                        if (bl2) return (boolean)hj.dcos("deao", dcoo(int ), (int)310);
                    }
                    if (bl2 || bl2) return (boolean)hj.dcos("deao", dcoo(int ), (int)310);
                    return (boolean)hj.dcos("deap", dcoo(int ), (int)311);
                }
                if (bl2 || bl2) return (boolean)hj.dcos("deao", dcoo(int ), (int)310);
                this.validateSelections();
                if (bl2 || bl2) return (boolean)hj.dcos("deao", dcoo(int ), (int)310);
                class_17992 = this.selectedPotions[n2];
                if (bl2 || bl2) return (boolean)hj.dcos("deao", dcoo(int ), (int)310);
                n4 = this.findPotionSlot(class_17992);
                if (bl2 || bl2) return (boolean)hj.dcos("deao", dcoo(int ), (int)310);
                if (n4 == hj.dcos("deaq", dcoo(int ), (int)312)) {
                    if (bl2 || bl2) return (boolean)hj.dcos("deao", dcoo(int ), (int)310);
                    this.clearPotion(n2);
                    if (bl2 || bl2) return (boolean)hj.dcos("deao", dcoo(int ), (int)310);
                    return (boolean)hj.dcos("dear", dcoo(int ), (int)313);
                }
                if (bl2 || bl2) return (boolean)hj.dcos("deao", dcoo(int ), (int)310);
                mc.method_1507(null);
                if (bl2 || bl2) return (boolean)hj.dcos("deao", dcoo(int ), (int)310);
                n3 = hj.mc.field_1724.method_31548().method_67532();
                if (bl2 || bl2) return (boolean)hj.dcos("deao", dcoo(int ), (int)310);
                if (n4 >= hj.dcos("deas", dcoo(int ), (int)314)) break block17;
                if (bl2 || bl2) return (boolean)hj.dcos("deao", dcoo(int ), (int)310);
                this.selectHotbarSlot(n4);
                if (bl2 || bl2) return (boolean)hj.dcos("deao", dcoo(int ), (int)310);
                this.throwSelectedPotion(class_17992);
                if (bl2 || bl2) return (boolean)hj.dcos("deao", dcoo(int ), (int)310);
                if (n3 != n4) {
                    if (bl2 || bl2) return (boolean)hj.dcos("deao", dcoo(int ), (int)310);
                    this.selectHotbarSlot(n3);
                    if (bl2) return (boolean)hj.dcos("deao", dcoo(int ), (int)310);
                    if (bl3) {
                        throw null;
                    }
                }
                break block18;
            }
            if (bl2 || bl2) return (boolean)hj.dcos("deao", dcoo(int ), (int)310);
            int n6 = nv.wrapSlot(n4);
            if (bl2 || bl2) return (boolean)hj.dcos("deao", dcoo(int ), (int)310);
            this.pendingInventoryScreenSlot = n6;
            if (bl2 || bl2) return (boolean)hj.dcos("deao", dcoo(int ), (int)310);
            this.pendingHotbarSlot = n3;
            if (bl2 || bl2) return (boolean)hj.dcos("deao", dcoo(int ), (int)310);
            this.pendingPotion = class_17992.method_46651((int)hj.dcos("deat", dcoo(int ), (int)315));
            if (bl2 || bl2) return (boolean)hj.dcos("deao", dcoo(int ), (int)310);
            this.pendingSwapApplied = hj.dcos("deau", dcoo(int ), (int)316);
            if (bl2 || bl2) return (boolean)hj.dcos("deao", dcoo(int ), (int)310);
            this.throwMovement.saveState();
            if (bl2 || bl2) return (boolean)hj.dcos("deao", dcoo(int ), (int)310);
            this.throwMovement.block();
            if (bl2 || bl2) return (boolean)hj.dcos("deao", dcoo(int ), (int)310);
            this.throwStage = (int)hj.dcos("deav", dcoo(int ), (int)317);
            if (bl2 || bl2) return (boolean)hj.dcos("deao", dcoo(int ), (int)310);
            this.throwStageTicks = (int)hj.dcos("deaw", dcoo(int ), (int)318);
            if (bl2) return (boolean)hj.dcos("deao", dcoo(int ), (int)310);
        }
        if (!bl2 && !bl2) return (boolean)hj.dcos("deax", dcoo(int ), (int)319);
        return (boolean)hj.dcos("deao", dcoo(int ), (int)310);
    }
}

