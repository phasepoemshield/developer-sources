/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.minecraft.class_10192
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1304
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_2703
 *  net.minecraft.class_2703$class_2705
 *  net.minecraft.class_640
 *  net.minecraft.class_742
 *  net.minecraft.class_7828
 *  net.minecraft.class_9334
 */
package ruhack.phobia;

import com.mojang.authlib.GameProfile;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Predicate;
import net.minecraft.class_10192;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2703;
import net.minecraft.class_640;
import net.minecraft.class_742;
import net.minecraft.class_7828;
import net.minecraft.class_9334;
import ruhack.phobia.aw;
import ruhack.phobia.cr;
import ruhack.phobia.df;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.kb;
import ruhack.phobia.kf;
import ruhack.phobia.nj;

public class hb
extends ds {
    private static long[] fcxs;
    private static final class_1304[] ARMOR_SLOTS;
    public static final boolean c;
    private static int[] fcyv;
    public static final int b;
    private static long[] fcxu;
    private final kf mode;
    public static final boolean a;
    private final Set<UUID> suspectSet;
    static Set<UUID> botSet;
    protected static final long lq = -2453794728270146930L;
    private static int[] fcyu;
    private final kb removeFromWorld;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isFullyEquipped(class_1657 var1_1) {
        v0 /* !! */  = hb.lq;
        if (true) ** GOTO lbl5
        block40: while (true) {
            v0 /* !! */  = (long)(v1 - hb.fcxy("feek", fcxr(int ), (int)287));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 96162446: {
                    break block40;
                }
                case 557907040: {
                    v1 = hb.fcxy("feel", fcxr(int ), (int)288);
                    continue block40;
                }
                case 741095819: {
                    v1 = hb.fcxy("feem", fcxr(int ), (int)289);
                    continue block40;
                }
                case 2094395164: {
                    v1 = hb.fcxy("feen", fcxr(int ), (int)290);
                    continue block40;
                }
            }
            break;
        }
        var9_2 = hb.c;
        v2 /* !! */  = hb.lq;
        if (true) ** GOTO lbl22
        block41: while (true) {
            v2 /* !! */  = (long)(hb.fcxy("feep", fcxr(int ), (int)292) - hb.fcxy("feeo", fcxr(int ), (int)291));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -829716141: {
                    continue block41;
                }
                case 96162446: {
                    break block41;
                }
            }
            break;
        }
        var8_3 /* !! */  = hb.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = hb.lq - hb.fcxy("feeq", fcxr(int ), (int)293)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == hb.fcxy("feer", fcys(int ), (int)505)) break;
            v3 /* !! */  = (long)hb.fcxy("fees", fcys(int ), (int)506);
        }
        var7_4 = hb.a;
        if (var9_2) {
            throw null;
lbl37:
            // 14 sources

            return (boolean)hb.fcxy("feet", fcys(int ), (int)507);
        }
        if (var7_4 || var7_4) ** GOTO lbl37
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = hb.lq - hb.fcxy("feeu", fcxr(int ), (int)294)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == hb.fcxy("feev", fcys(int ), (int)508)) break;
            v4 /* !! */  = (long)hb.fcxy("feew", fcys(int ), (int)509);
        }
        var2_5 = hb.ARMOR_SLOTS;
        if (var7_4) ** GOTO lbl37
        var3_6 = var2_5.length;
        if (var7_4) ** GOTO lbl37
        var4_7 = hb.fcxy("feex", fcys(int ), (int)510);
        if (var7_4) ** GOTO lbl37
        block45: while (true) {
            block73: {
                block72: {
                    if (var7_4 || var7_4) ** GOTO lbl37
                    if (var4_7 >= var3_6) ** GOTO lbl97
                    if (var7_4) ** GOTO lbl37
                    var5_8 = var2_5[var4_7];
                    if (var7_4 || var7_4) ** GOTO lbl37
                    while (true) {
                        if ((v5 /* !! */  = (cfr_temp_2 = hb.lq - hb.fcxy("feey", fcxr(int ), (int)295)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v5 /* !! */  == hb.fcxy("feez", fcys(int ), (int)511)) break;
                        v5 /* !! */  = (long)hb.fcxy("fefa", fcys(int ), (int)512);
                    }
                    var6_9 = var1_1.method_6118(var5_8);
                    if (var7_4 || var7_4) ** GOTO lbl37
                    while (true) {
                        if ((v6 /* !! */  = (cfr_temp_3 = hb.lq - hb.fcxy("fefb", fcxr(int ), (int)296)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v6 /* !! */  == hb.fcxy("fefc", fcys(int ), (int)513)) break;
                        v6 /* !! */  = (long)hb.fcxy("fefd", fcys(int ), (int)514);
                    }
                    if (!this.isArmorItem(var6_9)) break block72;
                    if (var7_4) ** GOTO lbl37
                    v7 /* !! */  = hb.lq;
                    if (true) ** GOTO lbl78
                    block48: while (true) {
                        v7 /* !! */  = (long)(hb.fcxy("feff", fcxr(int ), (int)298) - hb.fcxy("fefe", fcxr(int ), (int)297));
lbl78:
                        // 2 sources

                        switch ((int)v7 /* !! */ ) {
                            case 96162446: {
                                break block48;
                            }
                            case 1563704239: {
                                continue block48;
                            }
                        }
                        break;
                    }
                    if (!var6_9.method_7942()) break block73;
                    if (var7_4) ** GOTO lbl37
                }
                if (var7_4 || var7_4) ** GOTO lbl37
                return (boolean)hb.fcxy("fefg", fcys(int ), (int)515);
            }
            if (var7_4 || var7_4) ** GOTO lbl37
            ++var4_7;
            if (var7_4) ** GOTO lbl37
            if (var8_3 /* !! */  == 0) continue;
            switch (var8_3 /* !! */ ) {
                default: {
                    if (!var9_2) continue block45;
                    throw null;
                }
lbl97:
                // 1 sources

                if (!var7_4 && !var7_4) ** break;
                ** continue;
                return (boolean)hb.fcxy("fefh", fcys(int ), (int)516);
                case 0: {
                    var8_3 /* !! */  = (int)hb.fcxy("fefi", fcys(int ), (int)517);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl144
                }
                case 1: {
                    var8_3 /* !! */  = (int)hb.fcxy("fefj", fcys(int ), (int)518);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl125
                }
                case 2: {
                    var8_3 /* !! */  = (int)hb.fcxy("fefk", fcys(int ), (int)519);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl184
                }
                case 3: {
                    var8_3 /* !! */  = (int)hb.fcxy("fefl", fcys(int ), (int)520);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl200
                }
lbl120:
                // 5 sources

                case 4: {
                    var8_3 /* !! */  = (int)hb.fcxy("fefm", fcys(int ), (int)521);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl135
                }
lbl125:
                // 3 sources

                case 5: {
                    var8_3 /* !! */  = (int)hb.fcxy("fefn", fcys(int ), (int)522);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl172
                }
                case 6: {
                    do {
                        var8_3 /* !! */  = (int)hb.fcxy("fefo", fcys(int ), (int)523);
                    } while (!var9_2);
                    throw null;
                }
lbl135:
                // 2 sources

                case 7: {
                    var8_3 /* !! */  = (int)hb.fcxy("fefp", fcys(int ), (int)524);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl180
                }
lbl140:
                // 3 sources

                case 8: {
                    var8_3 /* !! */  = (int)hb.fcxy("fefq", fcys(int ), (int)525);
                    if (!var9_2) ** GOTO lbl120
                    throw null;
                }
lbl144:
                // 2 sources

                case 9: {
                    var8_3 /* !! */  = (int)hb.fcxy("fefr", fcys(int ), (int)526);
                    if (!var9_2) ** GOTO lbl140
                    throw null;
                }
lbl148:
                // 2 sources

                case 10: {
                    var8_3 /* !! */  = (int)hb.fcxy("fefs", fcys(int ), (int)527);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl200
                }
                case 11: {
                    var8_3 /* !! */  = (int)hb.fcxy("feft", fcys(int ), (int)528);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl188
                }
                case 12: {
                    var8_3 /* !! */  = (int)hb.fcxy("fefu", fcys(int ), (int)529);
                    if (!var9_2) ** GOTO lbl120
                    throw null;
                }
                case 13: {
                    var8_3 /* !! */  = (int)hb.fcxy("fefv", fcys(int ), (int)530);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl188
                }
lbl167:
                // 2 sources

                case 14: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var8_3 /* !! */  = (int)hb.fcxy("fefw", fcys(int ), (int)531);
                        if (!var9_2) ** GOTO lbl140
                        throw null;
                    }
                }
lbl172:
                // 2 sources

                case 15: {
                    var8_3 /* !! */  = (int)hb.fcxy("fefx", fcys(int ), (int)532);
                    if (!var9_2) ** GOTO lbl148
                    throw null;
                }
                case 16: {
                    var8_3 /* !! */  = (int)hb.fcxy("fefy", fcys(int ), (int)533);
                    if (!var9_2) ** GOTO lbl120
                    throw null;
                }
lbl180:
                // 3 sources

                case 17: {
                    var8_3 /* !! */  = (int)hb.fcxy("fefz", fcys(int ), (int)534);
                    if (!var9_2) ** GOTO lbl167
                    throw null;
                }
lbl184:
                // 2 sources

                case 18: {
                    var8_3 /* !! */  = (int)hb.fcxy("fega", fcys(int ), (int)535);
                    if (!var9_2) break block45;
                    throw null;
                }
lbl188:
                // 3 sources

                case 19: {
                    var8_3 /* !! */  = (int)hb.fcxy("fegb", fcys(int ), (int)536);
                    if (!var9_2) ** GOTO lbl120
                    throw null;
                }
                case 20: {
                    var8_3 /* !! */  = (int)hb.fcxy("fegc", fcys(int ), (int)537);
                    if (!var9_2) break block45;
                    throw null;
                }
                case 21: {
                    var8_3 /* !! */  = (int)hb.fcxy("fegd", fcys(int ), (int)538);
                    if (!var9_2) ** GOTO lbl125
                    throw null;
                }
lbl200:
                // 3 sources

                case 22: {
                    var8_3 /* !! */  = (int)hb.fcxy("fege", fcys(int ), (int)539);
                    if (!var9_2) ** GOTO lbl180
                    throw null;
                }
                case 23: 
            }
            break;
        }
        var8_3 /* !! */  = (int)hb.fcxy("fegf", fcys(int ), (int)540);
        ** while (!var9_2)
lbl207:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void removePlayerBecauseLeftServer(class_7828 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hb.lq - hb.fcxy("fdhw", fcxr(int ), (int)87)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hb.fcxy("fdhx", fcys(int ), (int)134)) break;
            v0 /* !! */  = (long)hb.fcxy("fdhy", fcys(int ), (int)135);
        }
        var4_2 = hb.c;
        v1 /* !! */  = hb.lq;
        if (true) ** GOTO lbl12
        block33: while (true) {
            v1 /* !! */  = (long)(v2 - hb.fcxy("fdhz", fcxr(int ), (int)88));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 96162446: {
                    break block33;
                }
                case 1024293699: {
                    v2 = hb.fcxy("fdia", fcxr(int ), (int)89);
                    continue block33;
                }
                case 1843030908: {
                    v2 = hb.fcxy("fdib", fcxr(int ), (int)90);
                    continue block33;
                }
            }
            break;
        }
        var3_3 /* !! */  = hb.b;
        v3 /* !! */  = hb.lq;
        if (true) ** GOTO lbl26
        block34: while (true) {
            v3 /* !! */  = (long)(hb.fcxy("fdid", fcxr(int ), (int)92) - hb.fcxy("fdic", fcxr(int ), (int)91));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 96162446: {
                    break block34;
                }
                case 534010297: {
                    continue block34;
                }
            }
            break;
        }
        var2_4 = hb.a;
        if (var4_2) {
            throw null;
lbl34:
            // 3 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl34
        v4 /* !! */  = hb.lq;
        if (true) ** GOTO lbl41
        block36: while (true) {
            v4 /* !! */  = (long)(v5 - hb.fcxy("fdif", fcxr(int ), (int)93));
lbl41:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -821103273: {
                    v5 = hb.fcxy("fdig", fcxr(int ), (int)94);
                    continue block36;
                }
                case 96162446: {
                    break block36;
                }
                case 970275815: {
                    v5 = hb.fcxy("fdih", fcxr(int ), (int)95);
                    continue block36;
                }
            }
            break;
        }
        v6 = var1_1.comp_1105();
        v7 /* !! */  = hb.lq;
        if (true) ** GOTO lbl55
        block37: while (true) {
            v7 /* !! */  = (long)(v8 - hb.fcxy("fdij", fcxr(int ), (int)96));
lbl55:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1074449863: {
                    v8 = hb.fcxy("fdik", fcxr(int ), (int)97);
                    continue block37;
                }
                case -1031156170: {
                    v8 = hb.fcxy("fdil", fcxr(int ), (int)98);
                    continue block37;
                }
                case 96162446: {
                    break block37;
                }
                case 1422031842: {
                    v8 = hb.fcxy("fdim", fcxr(int ), (int)99);
                    continue block37;
                }
            }
            break;
        }
        v9 = (Consumer<UUID>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, lambda$removePlayerBecauseLeftServer$2(java.util.UUID ), (Ljava/util/UUID;)V)((hb)this);
        v10 /* !! */  = hb.lq;
        if (true) ** GOTO lbl72
        block38: while (true) {
            v10 /* !! */  = (long)(hb.fcxy("fdio", fcxr(int ), (int)101) - hb.fcxy("fdin", fcxr(int ), (int)100));
lbl72:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case 96162446: {
                    break block38;
                }
                case 993516569: {
                    continue block38;
                }
            }
            break;
        }
        v6.forEach(v9);
        if (var2_4) ** GOTO lbl34
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
lbl85:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)hb.fcxy("fdip", fcys(int ), (int)136);
                if (!var4_2) break;
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hb.fcxy("fdiq", fcys(int ), (int)137);
                    if (!var4_2) ** GOTO lbl85
                    throw null;
                }
            }
lbl94:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)hb.fcxy("fdir", fcys(int ), (int)138);
                if (var4_2) {
                    throw null;
                }
            }
            case 3: {
                var3_3 /* !! */  = (int)hb.fcxy("fdis", fcys(int ), (int)139);
                if (!var4_2) break;
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)hb.fcxy("fdit", fcys(int ), (int)140);
                if (!var4_2) ** GOTO lbl94
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)hb.fcxy("fdiu", fcys(int ), (int)141);
        ** while (!var4_2)
lbl109:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void feya() {
        hb.fcxs[400] = -4419963385259390903L;
        hb.fcxs[401] = 7305405455935327918L;
        hb.fcxs[402] = 7226443043130673504L;
        hb.fcxs[403] = -8186577444310710054L;
        hb.fcxs[404] = 2269603860499010857L;
        hb.fcxs[405] = -95777269075449712L;
        hb.fcxs[406] = -5287593523638551690L;
        hb.fcxs[407] = -3916674794142502526L;
        hb.fcxs[408] = -6239937982596760908L;
        hb.fcxs[409] = 1651490797376008372L;
        hb.fcxs[410] = 8698016822579185675L;
        hb.fcxs[411] = -7908632675647998689L;
        hb.fcxs[412] = 955784006353478758L;
        hb.fcxs[413] = 5878192003193345361L;
        hb.fcxs[414] = -1667616949999034954L;
        hb.fcxs[415] = -9020038683997585776L;
        hb.fcxs[416] = -2063389631787022035L;
        hb.fcxs[417] = 5625693692683995898L;
        hb.fcxs[418] = -8843746195136317373L;
        hb.fcxs[419] = 3902502197627924449L;
        hb.fcxs[420] = 8529434752015149889L;
        hb.fcxs[421] = -2939396663439235687L;
        hb.fcxs[422] = 7049745427594376421L;
        hb.fcxs[423] = 1501758514220249619L;
        hb.fcxs[424] = 2605438155040423703L;
        hb.fcxs[425] = -8920512509145468231L;
        hb.fcxs[426] = -2786763619285231288L;
        hb.fcxs[427] = -2778160520429300484L;
        hb.fcxs[428] = 6639220045541446469L;
        hb.fcxs[429] = -3978187856909058906L;
        hb.fcxs[430] = -4892392416362836480L;
        hb.fcxs[431] = -119452498717298076L;
        hb.fcxs[432] = -7220763826798270867L;
        hb.fcxs[433] = -8847740688290824445L;
        hb.fcxs[434] = 2007637019413740731L;
        hb.fcxs[435] = 8563456729789980677L;
        hb.fcxs[436] = -4679332169458095281L;
        hb.fcxs[437] = -400954154439152645L;
        hb.fcxs[438] = 8623324149979135865L;
        hb.fcxs[439] = -9208005650172054638L;
        hb.fcxs[440] = 6303642668535506275L;
        hb.fcxs[441] = 3335144195263985387L;
        hb.fcxs[442] = -6893400952960370175L;
        hb.fcxs[443] = 210870448352203658L;
        hb.fcxs[444] = -5363789945762189908L;
        hb.fcxs[445] = 7624323931882363683L;
        hb.fcxs[446] = -7578170801849198090L;
        hb.fcxs[447] = 4858631644269257886L;
        hb.fcxs[448] = 2661509670810989718L;
        hb.fcxs[449] = -1156438212734633617L;
        hb.fcxs[450] = -4273250903020509443L;
        hb.fcxs[451] = -3308556597297386334L;
        hb.fcxs[452] = -8314055915610429158L;
        hb.fcxs[453] = -5852872055523376849L;
        hb.fcxs[454] = -4904388749597525037L;
        hb.fcxs[455] = 6214164769219125891L;
        hb.fcxs[456] = 18887390387441560L;
        hb.fcxs[457] = -4848790150172004937L;
        hb.fcxs[458] = -4224546396801766258L;
        hb.fcxs[459] = 6030014386541641049L;
        hb.fcxs[460] = -6522096498734313549L;
        hb.fcxs[461] = 7521072640631714708L;
        hb.fcxs[462] = -7788425762408319069L;
        hb.fcxs[463] = -2211205259348009458L;
        hb.fcxs[464] = 5630675570619656408L;
        hb.fcxs[465] = -4704026593828550832L;
        hb.fcxs[466] = 8126958382093158228L;
        hb.fcxs[467] = -7787937492247621964L;
        hb.fcxs[468] = 3449443641084949939L;
        hb.fcxs[469] = -7485176475655689922L;
        hb.fcxs[470] = 1509399076527135624L;
        hb.fcxs[471] = 2686501612978837545L;
        hb.fcxs[472] = 8720554276094284605L;
        hb.fcxs[473] = 4950719855998418289L;
        hb.fcxs[474] = -6845924128007417496L;
        hb.fcxs[475] = -7094991784775047731L;
        hb.fcxs[476] = 7113063865435504366L;
        hb.fcxs[477] = -6973237483384593951L;
        hb.fcxs[478] = 5870919197600917908L;
        hb.fcxs[479] = -3596668275033282148L;
        hb.fcxs[480] = -310527026655790366L;
        hb.fcxs[481] = 2538630062299916039L;
        hb.fcxs[482] = -4575481700737376629L;
        hb.fcxs[483] = 3192770960892947262L;
    }

    private static /* synthetic */ void fexr() {
        hb.fcyv[300] = -1520300568;
        hb.fcyv[301] = 1438791528;
        hb.fcyv[302] = -1164329671;
        hb.fcyv[303] = 2073163703;
        hb.fcyv[304] = -1866556777;
        hb.fcyv[305] = -181550493;
        hb.fcyv[306] = 458603050;
        hb.fcyv[307] = -1907558886;
        hb.fcyv[308] = -1752424687;
        hb.fcyv[309] = -574447633;
        hb.fcyv[310] = -1452735933;
        hb.fcyv[311] = -1792421309;
        hb.fcyv[312] = 1503495804;
        hb.fcyv[313] = -1460253797;
        hb.fcyv[314] = 101252048;
        hb.fcyv[315] = -1826008751;
        hb.fcyv[316] = 717761692;
        hb.fcyv[317] = -221886395;
        hb.fcyv[318] = -192317717;
        hb.fcyv[319] = -1481095688;
        hb.fcyv[320] = 1559560328;
        hb.fcyv[321] = 1579261627;
        hb.fcyv[322] = -96538283;
        hb.fcyv[323] = -899225139;
        hb.fcyv[324] = 705994400;
        hb.fcyv[325] = 102310564;
        hb.fcyv[326] = 673235849;
        hb.fcyv[327] = 1072039616;
        hb.fcyv[328] = -1259956802;
        hb.fcyv[329] = -1093361247;
        hb.fcyv[330] = -1195865330;
        hb.fcyv[331] = -806439704;
        hb.fcyv[332] = 433277867;
        hb.fcyv[333] = 948527278;
        hb.fcyv[334] = -1209178612;
        hb.fcyv[335] = 314683526;
        hb.fcyv[336] = -1726270253;
        hb.fcyv[337] = -745501746;
        hb.fcyv[338] = -1676749790;
        hb.fcyv[339] = 2084015171;
        hb.fcyv[340] = 680874812;
        hb.fcyv[341] = 1971485671;
        hb.fcyv[342] = -1452519306;
        hb.fcyv[343] = 1512784828;
        hb.fcyv[344] = 274870452;
        hb.fcyv[345] = -836372758;
        hb.fcyv[346] = -1727792883;
        hb.fcyv[347] = -795020736;
        hb.fcyv[348] = -359151542;
        hb.fcyv[349] = 1985007158;
        hb.fcyv[350] = 1218697051;
        hb.fcyv[351] = -8212009;
        hb.fcyv[352] = 209624605;
        hb.fcyv[353] = 957998726;
        hb.fcyv[354] = 2028859495;
        hb.fcyv[355] = 1407941074;
        hb.fcyv[356] = 1680442872;
        hb.fcyv[357] = 1171901057;
        hb.fcyv[358] = 1146863829;
        hb.fcyv[359] = -306752345;
        hb.fcyv[360] = -1314866796;
        hb.fcyv[361] = 542635148;
        hb.fcyv[362] = -1398328500;
        hb.fcyv[363] = 31231524;
        hb.fcyv[364] = 1626874694;
        hb.fcyv[365] = 1180938998;
        hb.fcyv[366] = -21015142;
        hb.fcyv[367] = 140090894;
        hb.fcyv[368] = 1797857604;
        hb.fcyv[369] = -702528118;
        hb.fcyv[370] = 366218888;
        hb.fcyv[371] = 516969452;
        hb.fcyv[372] = -1332923658;
        hb.fcyv[373] = 1530859892;
        hb.fcyv[374] = 865875099;
        hb.fcyv[375] = -753253800;
        hb.fcyv[376] = 274969374;
        hb.fcyv[377] = -940127923;
        hb.fcyv[378] = -1123966010;
        hb.fcyv[379] = 555401695;
        hb.fcyv[380] = -823173844;
        hb.fcyv[381] = 196897125;
        hb.fcyv[382] = 1921489992;
        hb.fcyv[383] = 1322621353;
        hb.fcyv[384] = 394179946;
        hb.fcyv[385] = -340047392;
        hb.fcyv[386] = -1067765986;
        hb.fcyv[387] = 1898268719;
        hb.fcyv[388] = 1638668268;
        hb.fcyv[389] = 1040059578;
        hb.fcyv[390] = 1684909197;
        hb.fcyv[391] = -221471676;
        hb.fcyv[392] = -1696768634;
        hb.fcyv[393] = -1719058351;
        hb.fcyv[394] = 1265909828;
        hb.fcyv[395] = 1303653147;
        hb.fcyv[396] = 2142929955;
        hb.fcyv[397] = -764104066;
        hb.fcyv[398] = 111209900;
        hb.fcyv[399] = -1177445876;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void checkPlayerAfterSpawn(class_2703 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hb.lq - hb.fcxy("fdgw", fcxr(int ), (int)74)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == hb.fcxy("fdgx", fcys(int ), (int)122)) break;
            v0 /* !! */  = (long)hb.fcxy("fdgy", fcys(int ), (int)123);
        }
        var4_2 = hb.c;
        v1 /* !! */  = hb.lq;
        if (true) ** GOTO lbl11
        block25: while (true) {
            v1 /* !! */  = (long)(v2 - hb.fcxy("fdgz", fcxr(int ), (int)75));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1441535382: {
                    v2 = hb.fcxy("fdha", fcxr(int ), (int)76);
                    continue block25;
                }
                case 96162446: {
                    break block25;
                }
                case 1227280363: {
                    v2 = hb.fcxy("fdhb", fcxr(int ), (int)77);
                    continue block25;
                }
                case 1935461075: {
                    v2 = hb.fcxy("fdhc", fcxr(int ), (int)78);
                    continue block25;
                }
            }
            break;
        }
        var3_3 /* !! */  = hb.b;
        v3 /* !! */  = hb.lq;
        if (true) ** GOTO lbl28
        block26: while (true) {
            v3 /* !! */  = (long)(hb.fcxy("fdhe", fcxr(int ), (int)80) - hb.fcxy("fdhd", fcxr(int ), (int)79));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 96162446: {
                    break block26;
                }
                case 1726016141: {
                    continue block26;
                }
            }
            break;
        }
        var2_4 = hb.a;
        if (var4_2) {
            throw null;
lbl36:
            // 2 sources

            return;
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl36
                v4 /* !! */  = hb.lq;
                if (true) ** GOTO lbl46
                block28: while (true) {
                    v4 /* !! */  = (long)(v5 - hb.fcxy("fdhf", fcxr(int ), (int)81));
lbl46:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1170140963: {
                            v5 = hb.fcxy("fdhg", fcxr(int ), (int)82);
                            continue block28;
                        }
                        case -193715987: {
                            v5 = hb.fcxy("fdhi", fcxr(int ), (int)83);
                            continue block28;
                        }
                        case 96162446: {
                            break block28;
                        }
                        case 1498877022: {
                            v5 = hb.fcxy("fdhj", fcxr(int ), (int)84);
                            continue block28;
                        }
                    }
                    break;
                }
                v6 = var1_1.method_46330();
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = hb.lq - hb.fcxy("fdhk", fcxr(int ), (int)85)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == hb.fcxy("fdhl", fcys(int ), (int)124)) break;
                    v7 /* !! */  = (long)hb.fcxy("fdhm", fcys(int ), (int)125);
                }
                v8 = (Consumer<class_2703.class_2705>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, lambda$checkPlayerAfterSpawn$1(net.minecraft.class_2703$class_2705 ), (Lnet/minecraft/class_2703$class_2705;)V)((hb)this);
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = hb.lq - hb.fcxy("fdhn", fcxr(int ), (int)86)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == hb.fcxy("fdho", fcys(int ), (int)126)) break;
                    v9 /* !! */  = (long)hb.fcxy("fdhp", fcys(int ), (int)127);
                }
                v6.forEach(v8);
                if (var2_4 || var2_4) ** continue;
                return;
            }
lbl73:
            // 3 sources

            case 0: {
                var3_3 /* !! */  = (int)hb.fcxy("fdhq", fcys(int ), (int)128);
                if (!var4_2) break;
                throw null;
            }
lbl77:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)hb.fcxy("fdhr", fcys(int ), (int)129);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl91
            }
            case 2: {
                var3_3 /* !! */  = (int)hb.fcxy("fdhs", fcys(int ), (int)130);
                if (!var4_2) ** GOTO lbl77
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hb.fcxy("fdht", fcys(int ), (int)131);
                    if (!var4_2) ** GOTO lbl73
                    throw null;
                }
            }
lbl91:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)hb.fcxy("fdhu", fcys(int ), (int)132);
                if (!var4_2) ** GOTO lbl73
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)hb.fcxy("fdhv", fcys(int ), (int)133);
        ** while (!var4_2)
lbl98:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void feyc() {
        hb.fcxu[100] = 7411548567592061500L;
        hb.fcxu[101] = -384746422954448136L;
        hb.fcxu[102] = 5648648601503858379L;
        hb.fcxu[103] = -2851389697798390136L;
        hb.fcxu[104] = -4187382157286648318L;
        hb.fcxu[105] = 2322636318540976774L;
        hb.fcxu[106] = -2190147075218967573L;
        hb.fcxu[107] = 7231593577086641036L;
        hb.fcxu[108] = 4497619427189091804L;
        hb.fcxu[109] = 1918852042190980566L;
        hb.fcxu[110] = 2891424749053073258L;
        hb.fcxu[111] = -8338210120772841720L;
        hb.fcxu[112] = -3736971472903349854L;
        hb.fcxu[113] = -410490739581308972L;
        hb.fcxu[114] = 4397135924708781428L;
        hb.fcxu[115] = -7519437598506481868L;
        hb.fcxu[116] = -8790994381190189601L;
        hb.fcxu[117] = -3730616646944077629L;
        hb.fcxu[118] = -959602950900329349L;
        hb.fcxu[119] = -4299716512646714512L;
        hb.fcxu[120] = -7303355018007386465L;
        hb.fcxu[121] = -7092289099256359812L;
        hb.fcxu[122] = -6110159977159286640L;
        hb.fcxu[123] = -4933655357853044489L;
        hb.fcxu[124] = 5956952726945556261L;
        hb.fcxu[125] = -2035575859089483642L;
        hb.fcxu[126] = -2748402307967443656L;
        hb.fcxu[127] = -198070133560695497L;
        hb.fcxu[128] = -5961501894188636350L;
        hb.fcxu[129] = -1059123178983164588L;
        hb.fcxu[130] = 6341238484905424078L;
        hb.fcxu[131] = 3035413443255135655L;
        hb.fcxu[132] = 6377544239190059957L;
        hb.fcxu[133] = -2694312083717855303L;
        hb.fcxu[134] = 7445901969506272039L;
        hb.fcxu[135] = 3143016719344403119L;
        hb.fcxu[136] = -1996603814714597207L;
        hb.fcxu[137] = 4790002536042830301L;
        hb.fcxu[138] = 5371689226422105635L;
        hb.fcxu[139] = -6984203158514323360L;
        hb.fcxu[140] = -695339311347159567L;
        hb.fcxu[141] = -225035808623363196L;
        hb.fcxu[142] = -1547125637558446617L;
        hb.fcxu[143] = 336214688140668773L;
        hb.fcxu[144] = 5283274097429606872L;
        hb.fcxu[145] = -5072411565511435571L;
        hb.fcxu[146] = 9082732931948287883L;
        hb.fcxu[147] = -3963348674462512286L;
        hb.fcxu[148] = -8557754969031864470L;
        hb.fcxu[149] = -7317372621872381134L;
        hb.fcxu[150] = 7153940912357120145L;
        hb.fcxu[151] = -3159548552073068106L;
        hb.fcxu[152] = -3746575775199228554L;
        hb.fcxu[153] = 7868926167011059145L;
        hb.fcxu[154] = -6598960316618747380L;
        hb.fcxu[155] = -9089936870721745597L;
        hb.fcxu[156] = -6191186200237551119L;
        hb.fcxu[157] = 658576045924029542L;
        hb.fcxu[158] = -8811903799294374151L;
        hb.fcxu[159] = -3142123039847495600L;
        hb.fcxu[160] = 7457117665172118953L;
        hb.fcxu[161] = -6525314288943225019L;
        hb.fcxu[162] = 6672743788642275940L;
        hb.fcxu[163] = 6748867019234401721L;
        hb.fcxu[164] = -4159233549117049984L;
        hb.fcxu[165] = 2471810683458368671L;
        hb.fcxu[166] = -4723236178204935567L;
        hb.fcxu[167] = 2697780633660246571L;
        hb.fcxu[168] = -7703991066598248961L;
        hb.fcxu[169] = -2688633914315695838L;
        hb.fcxu[170] = -2085683491417450509L;
        hb.fcxu[171] = 2253196394516185556L;
        hb.fcxu[172] = -1836580363947146064L;
        hb.fcxu[173] = -1960613723768636911L;
        hb.fcxu[174] = 8679677013161456165L;
        hb.fcxu[175] = -3771014895575371725L;
        hb.fcxu[176] = 380888680880828865L;
        hb.fcxu[177] = 8496737648746250679L;
        hb.fcxu[178] = -6282773032649745727L;
        hb.fcxu[179] = -6004565990295706311L;
        hb.fcxu[180] = 1311552351801918012L;
        hb.fcxu[181] = 686240314706060323L;
        hb.fcxu[182] = -5672513598400095851L;
        hb.fcxu[183] = 1069492642985318837L;
        hb.fcxu[184] = 2883662895841331241L;
        hb.fcxu[185] = -6430607620381156556L;
        hb.fcxu[186] = -5591877500211122939L;
        hb.fcxu[187] = 4798801212364960497L;
        hb.fcxu[188] = 6223022596505362876L;
        hb.fcxu[189] = 6479494746158739715L;
        hb.fcxu[190] = 6640827861684240424L;
        hb.fcxu[191] = 951616192401813301L;
        hb.fcxu[192] = -6722604419722945643L;
        hb.fcxu[193] = 5814396924524426712L;
        hb.fcxu[194] = -1556822868812213176L;
        hb.fcxu[195] = 7798944922035997849L;
        hb.fcxu[196] = -769682947291354770L;
        hb.fcxu[197] = 7652505017026955260L;
        hb.fcxu[198] = -3017585407413234808L;
        hb.fcxu[199] = 4800089430696184371L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        v0 /* !! */  = hb.lq;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(hb.fcxy("fepm", fcxr(int ), (int)387) - hb.fcxy("fepl", fcxr(int ), (int)386));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -372369655: {
                    continue block22;
                }
                case 96162446: {
                    break block22;
                }
            }
            break;
        }
        var3_1 = hb.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = hb.lq - hb.fcxy("fepn", fcxr(int ), (int)388)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hb.fcxy("fepo", fcys(int ), (int)693)) break;
            v1 /* !! */  = (long)hb.fcxy("fepp", fcys(int ), (int)694);
        }
        var2_2 /* !! */  = hb.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = hb.lq - hb.fcxy("fepq", fcxr(int ), (int)389)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hb.fcxy("fepr", fcys(int ), (int)695)) break;
            v2 /* !! */  = (long)hb.fcxy("feps", fcys(int ), (int)696);
        }
        var1_3 = hb.a;
        if (var3_1) {
            throw null;
lbl27:
            // 4 sources

            return;
        }
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl27
                v3 /* !! */  = hb.lq;
                if (true) ** GOTO lbl38
                block26: while (true) {
                    v3 /* !! */  = (long)(hb.fcxy("fepu", fcxr(int ), (int)391) - hb.fcxy("fept", fcxr(int ), (int)390));
lbl38:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 96162446: {
                            break block26;
                        }
                        case 1222824800: {
                            continue block26;
                        }
                    }
                    break;
                }
                this.reset();
                if (var1_3 || var1_3) ** GOTO lbl27
                v4 /* !! */  = hb.lq;
                if (true) ** GOTO lbl49
                block27: while (true) {
                    v4 /* !! */  = (long)(hb.fcxy("fepw", fcxr(int ), (int)393) - hb.fcxy("fepv", fcxr(int ), (int)392));
lbl49:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 96162446: {
                            break block27;
                        }
                        case 789950214: {
                            continue block27;
                        }
                    }
                    break;
                }
                super.deactivate();
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl58:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)hb.fcxy("fepx", fcys(int ), (int)697);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl77
            }
lbl63:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)hb.fcxy("fepy", fcys(int ), (int)698);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hb.fcxy("fepz", fcys(int ), (int)699);
                    if (!var3_1) ** GOTO lbl58
                    throw null;
                }
            }
            case 3: {
                var2_2 /* !! */  = (int)hb.fcxy("feqa", fcys(int ), (int)700);
                if (!var3_1) ** GOTO lbl58
                throw null;
            }
lbl77:
            // 3 sources

            case 4: {
                do {
                    var2_2 /* !! */  = (int)hb.fcxy("feqb", fcys(int ), (int)701);
                } while (!var3_1);
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)hb.fcxy("feqc", fcys(int ), (int)702);
                if (!var3_1) ** GOTO lbl77
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)hb.fcxy("feqd", fcys(int ), (int)703);
                if (!var3_1) ** GOTO lbl63
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)hb.fcxy("feqe", fcys(int ), (int)704);
        ** while (!var3_1)
lbl93:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fexj() {
        hb.fcyu[300] = -1520300549;
        hb.fcyu[301] = 1438791531;
        hb.fcyu[302] = -1164329671;
        hb.fcyu[303] = 2073163649;
        hb.fcyu[304] = -1866556714;
        hb.fcyu[305] = -181550511;
        hb.fcyu[306] = 458603033;
        hb.fcyu[307] = -1907558866;
        hb.fcyu[308] = -1752424645;
        hb.fcyu[309] = -574447622;
        hb.fcyu[310] = -1452735920;
        hb.fcyu[311] = -1792421277;
        hb.fcyu[312] = 1503495804;
        hb.fcyu[313] = -1460253794;
        hb.fcyu[314] = 101251985;
        hb.fcyu[315] = -1826008730;
        hb.fcyu[316] = 717761710;
        hb.fcyu[317] = -221886374;
        hb.fcyu[318] = -192317751;
        hb.fcyu[319] = -1481095706;
        hb.fcyu[320] = 1559560337;
        hb.fcyu[321] = 1579261621;
        hb.fcyu[322] = -96538277;
        hb.fcyu[323] = -899225092;
        hb.fcyu[324] = 705994409;
        hb.fcyu[325] = 102310544;
        hb.fcyu[326] = 673235903;
        hb.fcyu[327] = 1072039616;
        hb.fcyu[328] = -1259956862;
        hb.fcyu[329] = -1093361263;
        hb.fcyu[330] = -1195865284;
        hb.fcyu[331] = -806439735;
        hb.fcyu[332] = 433277931;
        hb.fcyu[333] = 948527239;
        hb.fcyu[334] = -1209178579;
        hb.fcyu[335] = 314683569;
        hb.fcyu[336] = -1726270264;
        hb.fcyu[337] = -745501746;
        hb.fcyu[338] = -1676749799;
        hb.fcyu[339] = 2084015186;
        hb.fcyu[340] = 680874876;
        hb.fcyu[341] = 1971485652;
        hb.fcyu[342] = -1452519359;
        hb.fcyu[343] = 1512784803;
        hb.fcyu[344] = 274870456;
        hb.fcyu[345] = -836372740;
        hb.fcyu[346] = -1727792891;
        hb.fcyu[347] = -795020678;
        hb.fcyu[348] = -359151545;
        hb.fcyu[349] = 1985007218;
        hb.fcyu[350] = 1218697067;
        hb.fcyu[351] = -8212025;
        hb.fcyu[352] = -209624606;
        hb.fcyu[353] = -1105903610;
        hb.fcyu[354] = -2028859496;
        hb.fcyu[355] = 1859152802;
        hb.fcyu[356] = 1680442873;
        hb.fcyu[357] = -1387559799;
        hb.fcyu[358] = -1146863830;
        hb.fcyu[359] = 781092874;
        hb.fcyu[360] = 1314866795;
        hb.fcyu[361] = -946030149;
        hb.fcyu[362] = -1398328499;
        hb.fcyu[363] = 425559996;
        hb.fcyu[364] = 1626874695;
        hb.fcyu[365] = -1382519989;
        hb.fcyu[366] = 21015141;
        hb.fcyu[367] = -1296723456;
        hb.fcyu[368] = -1797857605;
        hb.fcyu[369] = 1978854306;
        hb.fcyu[370] = 366218889;
        hb.fcyu[371] = -547040676;
        hb.fcyu[372] = 1332923657;
        hb.fcyu[373] = -203162617;
        hb.fcyu[374] = -865875100;
        hb.fcyu[375] = -1117449490;
        hb.fcyu[376] = 274969375;
        hb.fcyu[377] = 1021446233;
        hb.fcyu[378] = 1123966009;
        hb.fcyu[379] = 1062036271;
        hb.fcyu[380] = 823173843;
        hb.fcyu[381] = 1479132430;
        hb.fcyu[382] = -1921489993;
        hb.fcyu[383] = 642870148;
        hb.fcyu[384] = 394179947;
        hb.fcyu[385] = -1330866145;
        hb.fcyu[386] = 1067765985;
        hb.fcyu[387] = 751782115;
        hb.fcyu[388] = 1638668284;
        hb.fcyu[389] = 1040059569;
        hb.fcyu[390] = 1684909215;
        hb.fcyu[391] = -221471671;
        hb.fcyu[392] = -1696768637;
        hb.fcyu[393] = -1719058341;
        hb.fcyu[394] = 1265909828;
        hb.fcyu[395] = 1303653142;
        hb.fcyu[396] = 2142929964;
        hb.fcyu[397] = -764104086;
        hb.fcyu[398] = 111209900;
        hb.fcyu[399] = -1177445884;
    }

    private static /* synthetic */ void feye() {
        hb.fcxu[300] = -2744964922240407507L;
        hb.fcxu[301] = 3228695945731354680L;
        hb.fcxu[302] = -74050687473183183L;
        hb.fcxu[303] = -5712347741133962249L;
        hb.fcxu[304] = -5912944276476848858L;
        hb.fcxu[305] = -4907269914780295658L;
        hb.fcxu[306] = -4502576069669782L;
        hb.fcxu[307] = 8766171168103475417L;
        hb.fcxu[308] = 5609868749517390909L;
        hb.fcxu[309] = -4734684287749730922L;
        hb.fcxu[310] = -5013028682833175967L;
        hb.fcxu[311] = 2177712413417375763L;
        hb.fcxu[312] = -1974297698212768913L;
        hb.fcxu[313] = 202297671608662572L;
        hb.fcxu[314] = -8439166554072223599L;
        hb.fcxu[315] = 2444222681757612264L;
        hb.fcxu[316] = -3627176673998741900L;
        hb.fcxu[317] = -4925599927809544451L;
        hb.fcxu[318] = -8301001600446979679L;
        hb.fcxu[319] = -6799840984788292485L;
        hb.fcxu[320] = 2187445328450796496L;
        hb.fcxu[321] = 2147246968674574L;
        hb.fcxu[322] = -3888965113293204018L;
        hb.fcxu[323] = 6591768481344099472L;
        hb.fcxu[324] = 8473379885642206379L;
        hb.fcxu[325] = -4231600634821844581L;
        hb.fcxu[326] = -4995448813766735486L;
        hb.fcxu[327] = 5692812775406877235L;
        hb.fcxu[328] = -2869718449442234441L;
        hb.fcxu[329] = 3540586239459955103L;
        hb.fcxu[330] = -4275211586762173022L;
        hb.fcxu[331] = -5401361315075696544L;
        hb.fcxu[332] = 2639942611526939854L;
        hb.fcxu[333] = 532163281090453010L;
        hb.fcxu[334] = -643545052759127968L;
        hb.fcxu[335] = 8823332072530299527L;
        hb.fcxu[336] = -319755892383216936L;
        hb.fcxu[337] = 8928835732033545946L;
        hb.fcxu[338] = -1377643848616303469L;
        hb.fcxu[339] = 9013124191715233482L;
        hb.fcxu[340] = -3092284028517318979L;
        hb.fcxu[341] = -7002415245232536680L;
        hb.fcxu[342] = 6822011433420567413L;
        hb.fcxu[343] = 7648939623502240341L;
        hb.fcxu[344] = 5222348933766329834L;
        hb.fcxu[345] = -2640082937897479101L;
        hb.fcxu[346] = -618995129417560464L;
        hb.fcxu[347] = 422156603621064865L;
        hb.fcxu[348] = -6220440612925811926L;
        hb.fcxu[349] = 4346527284062848047L;
        hb.fcxu[350] = -7126776763998811307L;
        hb.fcxu[351] = -5369741241606095180L;
        hb.fcxu[352] = -7729891552779436756L;
        hb.fcxu[353] = 3899291009830013192L;
        hb.fcxu[354] = 3413621771924583966L;
        hb.fcxu[355] = -7795939529172036569L;
        hb.fcxu[356] = -8813165739784383984L;
        hb.fcxu[357] = -2623310425231038880L;
        hb.fcxu[358] = -7760124135917384497L;
        hb.fcxu[359] = 2762370722977264484L;
        hb.fcxu[360] = 8577049439067219296L;
        hb.fcxu[361] = -741036468566766025L;
        hb.fcxu[362] = 6703411906415536722L;
        hb.fcxu[363] = 7253057921701185667L;
        hb.fcxu[364] = -9149801735140061679L;
        hb.fcxu[365] = 723304259756473848L;
        hb.fcxu[366] = -1439305434514839006L;
        hb.fcxu[367] = 8606241548179720666L;
        hb.fcxu[368] = 6091605645418999137L;
        hb.fcxu[369] = -4741198413652886342L;
        hb.fcxu[370] = -4522244268394196579L;
        hb.fcxu[371] = 4271002946507170089L;
        hb.fcxu[372] = 8613472630223824624L;
        hb.fcxu[373] = -7474656588601820508L;
        hb.fcxu[374] = 3900306165159590521L;
        hb.fcxu[375] = -7197004967483796646L;
        hb.fcxu[376] = 8827909080852569517L;
        hb.fcxu[377] = -2765363585003334046L;
        hb.fcxu[378] = -4405383347299090223L;
        hb.fcxu[379] = -6511388468721492647L;
        hb.fcxu[380] = -6392451104702228045L;
        hb.fcxu[381] = -5228432819925399100L;
        hb.fcxu[382] = -7571283306408419420L;
        hb.fcxu[383] = 6333683321519649014L;
        hb.fcxu[384] = -1621185784800647578L;
        hb.fcxu[385] = -1901885079609792145L;
        hb.fcxu[386] = 8846939469299675795L;
        hb.fcxu[387] = -5872873237366983636L;
        hb.fcxu[388] = -7500846545089552875L;
        hb.fcxu[389] = -3626322096750189501L;
        hb.fcxu[390] = 8372867922029289786L;
        hb.fcxu[391] = -6742777320282066799L;
        hb.fcxu[392] = 6424905902113319103L;
        hb.fcxu[393] = 6572684437627289963L;
        hb.fcxu[394] = -81023151414599389L;
        hb.fcxu[395] = 1892188148859437451L;
        hb.fcxu[396] = 7036518525533312510L;
        hb.fcxu[397] = -6572100360433014073L;
        hb.fcxu[398] = -8283134820519301911L;
        hb.fcxu[399] = 3420356716091285293L;
    }

    private static /* synthetic */ void fexw() {
        hb.fcxs[0] = -6484696511887444782L;
        hb.fcxs[1] = -1036840779908732860L;
        hb.fcxs[2] = -6122814963981411855L;
        hb.fcxs[3] = -2676859793954999005L;
        hb.fcxs[4] = 5822526901961087177L;
        hb.fcxs[5] = 2853523910362040838L;
        hb.fcxs[6] = 5170020840376981541L;
        hb.fcxs[7] = 8090119439099208317L;
        hb.fcxs[8] = -5438724682628409749L;
        hb.fcxs[9] = 8680968799293905867L;
        hb.fcxs[10] = -8053680771711577496L;
        hb.fcxs[11] = 3696189654640267905L;
        hb.fcxs[12] = 3619681188630498996L;
        hb.fcxs[13] = 2687294263355127981L;
        hb.fcxs[14] = 2260350992707614729L;
        hb.fcxs[15] = 5418184455840906322L;
        hb.fcxs[16] = -4417499506602749603L;
        hb.fcxs[17] = 8519588588629714645L;
        hb.fcxs[18] = 8822525891004641564L;
        hb.fcxs[19] = 3157756211913181971L;
        hb.fcxs[20] = 3499097781209064495L;
        hb.fcxs[21] = 4909590901455800887L;
        hb.fcxs[22] = -5731772807105955509L;
        hb.fcxs[23] = 6732151904158879445L;
        hb.fcxs[24] = 6612905737978520142L;
        hb.fcxs[25] = 2793874818774916493L;
        hb.fcxs[26] = -7822753989639766726L;
        hb.fcxs[27] = -3654671338003521484L;
        hb.fcxs[28] = -4041282060291238410L;
        hb.fcxs[29] = -177789451581962011L;
        hb.fcxs[30] = 136594462231123244L;
        hb.fcxs[31] = -937036495777126614L;
        hb.fcxs[32] = -4090181928000014281L;
        hb.fcxs[33] = -5200197384907931318L;
        hb.fcxs[34] = 8083278366439110900L;
        hb.fcxs[35] = 4102019710541703484L;
        hb.fcxs[36] = 3840655691800531408L;
        hb.fcxs[37] = -4419492405563668955L;
        hb.fcxs[38] = 4364601027925945703L;
        hb.fcxs[39] = -4134089015058926162L;
        hb.fcxs[40] = 5774045713312443290L;
        hb.fcxs[41] = -750503595349011348L;
        hb.fcxs[42] = 2143124174063884384L;
        hb.fcxs[43] = 8270224725205718560L;
        hb.fcxs[44] = 7940024898002323290L;
        hb.fcxs[45] = -8170584775827496810L;
        hb.fcxs[46] = 505418018018226960L;
        hb.fcxs[47] = 2968866661660624450L;
        hb.fcxs[48] = -2172792266542006931L;
        hb.fcxs[49] = 4289381848720344145L;
        hb.fcxs[50] = -6510379181423787538L;
        hb.fcxs[51] = -7213115846243861587L;
        hb.fcxs[52] = 3123686039957739706L;
        hb.fcxs[53] = 6657670068164798781L;
        hb.fcxs[54] = -8748633897329616809L;
        hb.fcxs[55] = -3387909230339440642L;
        hb.fcxs[56] = -7573480847744169663L;
        hb.fcxs[57] = -6697180343894824057L;
        hb.fcxs[58] = -6172869848320439721L;
        hb.fcxs[59] = -3223733950824821868L;
        hb.fcxs[60] = 7034096876950908954L;
        hb.fcxs[61] = -1988904327202391896L;
        hb.fcxs[62] = 5151131438969980805L;
        hb.fcxs[63] = 7062684748621231619L;
        hb.fcxs[64] = -1209430498916418739L;
        hb.fcxs[65] = -1155245174625937337L;
        hb.fcxs[66] = -7589572890852787200L;
        hb.fcxs[67] = 8906880046472523810L;
        hb.fcxs[68] = -4530565013750744693L;
        hb.fcxs[69] = -951183576031912793L;
        hb.fcxs[70] = -8559258099851243338L;
        hb.fcxs[71] = -8312991607435462403L;
        hb.fcxs[72] = -3717872701598562664L;
        hb.fcxs[73] = -9016218919197469454L;
        hb.fcxs[74] = 126751915419112329L;
        hb.fcxs[75] = 3947476088360199827L;
        hb.fcxs[76] = -7804457826981182515L;
        hb.fcxs[77] = -6045700333938717263L;
        hb.fcxs[78] = -8102571073923624593L;
        hb.fcxs[79] = 952993947898434818L;
        hb.fcxs[80] = -4467343309095501584L;
        hb.fcxs[81] = 1593964338034211113L;
        hb.fcxs[82] = -1457648199539348674L;
        hb.fcxs[83] = 2390779532044888508L;
        hb.fcxs[84] = 232523674550556143L;
        hb.fcxs[85] = -3609855925355233680L;
        hb.fcxs[86] = -9211097407158476392L;
        hb.fcxs[87] = -4512561699205603564L;
        hb.fcxs[88] = -3288991876648046743L;
        hb.fcxs[89] = -5956814718373535353L;
        hb.fcxs[90] = 262413469994801005L;
        hb.fcxs[91] = -7194959877902414022L;
        hb.fcxs[92] = -6945531678823727099L;
        hb.fcxs[93] = 2246987648347249621L;
        hb.fcxs[94] = -5994925787313456049L;
        hb.fcxs[95] = -5384621068992585092L;
        hb.fcxs[96] = 173927667377362144L;
        hb.fcxs[97] = 6040618685414557965L;
        hb.fcxs[98] = 782373651633071733L;
        hb.fcxs[99] = -765836663740558047L;
    }

    private static /* synthetic */ void fexx() {
        hb.fcxs[100] = 8889018601031417163L;
        hb.fcxs[101] = -3594873008195767745L;
        hb.fcxs[102] = -80191556939107749L;
        hb.fcxs[103] = 8375064806695756066L;
        hb.fcxs[104] = 3690531729163855608L;
        hb.fcxs[105] = -2282137230064231405L;
        hb.fcxs[106] = 8362085380688876651L;
        hb.fcxs[107] = -2564514689377779177L;
        hb.fcxs[108] = -2576693263552152413L;
        hb.fcxs[109] = -7389790332154546323L;
        hb.fcxs[110] = 872991564501670491L;
        hb.fcxs[111] = -7399201179723992054L;
        hb.fcxs[112] = -2653703819797371555L;
        hb.fcxs[113] = -7553027021697688428L;
        hb.fcxs[114] = -5384644106707280602L;
        hb.fcxs[115] = -5964195533989887724L;
        hb.fcxs[116] = -7036907059790365089L;
        hb.fcxs[117] = 4142265188551358644L;
        hb.fcxs[118] = 7428236571928558299L;
        hb.fcxs[119] = 3079620319349830268L;
        hb.fcxs[120] = 6544099418161548436L;
        hb.fcxs[121] = 14063789994634823L;
        hb.fcxs[122] = 4456536745546880198L;
        hb.fcxs[123] = 8430309111491611280L;
        hb.fcxs[124] = -7236890073505564312L;
        hb.fcxs[125] = 77772525665810864L;
        hb.fcxs[126] = 4635096972868394831L;
        hb.fcxs[127] = -3053300162566862573L;
        hb.fcxs[128] = 3823229669043733890L;
        hb.fcxs[129] = -2273789626861619799L;
        hb.fcxs[130] = -8205845939474220756L;
        hb.fcxs[131] = 8293835989514703039L;
        hb.fcxs[132] = 1032120742522591760L;
        hb.fcxs[133] = 4626525425784201663L;
        hb.fcxs[134] = -2980640088836682604L;
        hb.fcxs[135] = 7519439131523189803L;
        hb.fcxs[136] = -1656206622180656213L;
        hb.fcxs[137] = -5156791451758351698L;
        hb.fcxs[138] = -2497310366306170697L;
        hb.fcxs[139] = 7390399743950829303L;
        hb.fcxs[140] = 4903505711892091088L;
        hb.fcxs[141] = -8818292811621026708L;
        hb.fcxs[142] = 8136329658470832865L;
        hb.fcxs[143] = 821925036874912683L;
        hb.fcxs[144] = 7770435309581132733L;
        hb.fcxs[145] = -3261769358367933049L;
        hb.fcxs[146] = 941098308542754533L;
        hb.fcxs[147] = -486499164591025490L;
        hb.fcxs[148] = -1623060214569875551L;
        hb.fcxs[149] = -8519331555222122071L;
        hb.fcxs[150] = 3922414023386102136L;
        hb.fcxs[151] = 8132700509239780939L;
        hb.fcxs[152] = 3382354408446970828L;
        hb.fcxs[153] = -4534779855743626153L;
        hb.fcxs[154] = 9185561896547821676L;
        hb.fcxs[155] = -432573079104047203L;
        hb.fcxs[156] = 8479516742924285624L;
        hb.fcxs[157] = -1406909867877615985L;
        hb.fcxs[158] = -1940166435079310251L;
        hb.fcxs[159] = 7899983188998534818L;
        hb.fcxs[160] = 4146312537868311457L;
        hb.fcxs[161] = 8458397624710210464L;
        hb.fcxs[162] = -3604918798215885525L;
        hb.fcxs[163] = -3612236050902880957L;
        hb.fcxs[164] = -968482356706878887L;
        hb.fcxs[165] = -216037973001155473L;
        hb.fcxs[166] = 331557023663974695L;
        hb.fcxs[167] = 7564330102071325364L;
        hb.fcxs[168] = -978395889999659612L;
        hb.fcxs[169] = -5431975108259653578L;
        hb.fcxs[170] = -6426652938097340564L;
        hb.fcxs[171] = -66501758838799261L;
        hb.fcxs[172] = 7161362607090736560L;
        hb.fcxs[173] = -6054851384076479645L;
        hb.fcxs[174] = 8578603199914198630L;
        hb.fcxs[175] = 4783401303158154258L;
        hb.fcxs[176] = -8448926986758036179L;
        hb.fcxs[177] = 1234161475783619404L;
        hb.fcxs[178] = -2162355333907197476L;
        hb.fcxs[179] = -8310268664485698243L;
        hb.fcxs[180] = -5431610440987115634L;
        hb.fcxs[181] = 722091581783717708L;
        hb.fcxs[182] = -4527882347066540795L;
        hb.fcxs[183] = -3337457111845220474L;
        hb.fcxs[184] = -4204508080374177712L;
        hb.fcxs[185] = 5655506543092489491L;
        hb.fcxs[186] = -4858074389923127341L;
        hb.fcxs[187] = -6195589445340216503L;
        hb.fcxs[188] = -2044150502981902188L;
        hb.fcxs[189] = 500022731699306093L;
        hb.fcxs[190] = -8908483331335875694L;
        hb.fcxs[191] = 2446269810224941755L;
        hb.fcxs[192] = -713643356828063456L;
        hb.fcxs[193] = -6990694453833799302L;
        hb.fcxs[194] = -2883657860776648389L;
        hb.fcxs[195] = 4817930009651882244L;
        hb.fcxs[196] = -1224726114280560236L;
        hb.fcxs[197] = -5222816643040844893L;
        hb.fcxs[198] = -1262338988181177835L;
        hb.fcxs[199] = 2536210894514168726L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static hb getInstance() {
        v0 /* !! */  = hb.lq;
        if (true) ** GOTO lbl5
        block27: while (true) {
            v0 /* !! */  = (long)(v1 - hb.fcxy("fcxz", fcxr(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1238725781: {
                    v1 = hb.fcxy("fcya", fcxr(int ), (int)1);
                    continue block27;
                }
                case 96162446: {
                    break block27;
                }
                case 763432271: {
                    v1 = hb.fcxy("fcyb", fcxr(int ), (int)2);
                    continue block27;
                }
                case 1893653496: {
                    v1 = hb.fcxy("fcyc", fcxr(int ), (int)3);
                    continue block27;
                }
            }
            break;
        }
        var2 = hb.c;
        v2 /* !! */  = hb.lq;
        if (true) ** GOTO lbl22
        block28: while (true) {
            v2 /* !! */  = (long)(v3 - hb.fcxy("fcyd", fcxr(int ), (int)4));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1925641677: {
                    v3 = hb.fcxy("fcyg", fcxr(int ), (int)5);
                    continue block28;
                }
                case 96162446: {
                    break block28;
                }
                case 1432945369: {
                    v3 = hb.fcxy("fcyi", fcxr(int ), (int)6);
                    continue block28;
                }
            }
            break;
        }
        var1_1 /* !! */  = hb.b;
        v4 /* !! */  = hb.lq;
        if (true) ** GOTO lbl36
        block29: while (true) {
            v4 /* !! */  = (long)(v5 - hb.fcxy("fcyk", fcxr(int ), (int)7));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -365903826: {
                    v5 = hb.fcxy("fcyl", fcxr(int ), (int)8);
                    continue block29;
                }
                case 96162446: {
                    break block29;
                }
                case 1653078690: {
                    v5 = hb.fcxy("fcyn", fcxr(int ), (int)9);
                    continue block29;
                }
            }
            break;
        }
        var0_2 = hb.a;
        if (var2) {
            throw null;
lbl48:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl51:
        // 1 sources

        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v6 /* !! */  = hb.lq;
                if (true) ** GOTO lbl58
                block31: while (true) {
                    v6 /* !! */  = (long)(v7 - hb.fcxy("fcyp", fcxr(int ), (int)10));
lbl58:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -2121296889: {
                            v7 = hb.fcxy("fcyq", fcxr(int ), (int)11);
                            continue block31;
                        }
                        case -1321064672: {
                            v7 = hb.fcxy("fcyr", fcxr(int ), (int)12);
                            continue block31;
                        }
                        case 96162446: {
                            break block31;
                        }
                    }
                    break;
                }
                return nj.get(hb.class);
            }
            case 0: {
                var1_1 /* !! */  = (int)hb.fcxy("fcyw", fcys(int ), (int)0);
                if (!var2) break;
                throw null;
            }
lbl72:
            // 2 sources

            case 1: {
                var1_1 /* !! */  = (int)hb.fcxy("fcyy", fcys(int ), (int)1);
                if (var2) {
                    throw null;
                }
            }
            case 2: {
                var1_1 /* !! */  = (int)hb.fcxy("fcza", fcys(int ), (int)2);
                if (!var2) ** GOTO lbl72
                throw null;
            }
            case 3: 
        }
        do {
            var1_1 /* !! */  = (int)hb.fcxy("fcze", fcys(int ), (int)3);
        } while (!var2);
        throw null;
    }

    private static /* synthetic */ void fexl() {
        hb.fcyu[500] = -1098821584;
        hb.fcyu[501] = -743830082;
        hb.fcyu[502] = 1202330505;
        hb.fcyu[503] = -1893487023;
        hb.fcyu[504] = -780954952;
        hb.fcyu[505] = 773890229;
        hb.fcyu[506] = -1566929268;
        hb.fcyu[507] = -1523952637;
        hb.fcyu[508] = -1626128974;
        hb.fcyu[509] = -1111354189;
        hb.fcyu[510] = -733392757;
        hb.fcyu[511] = -398233832;
        hb.fcyu[512] = -521630817;
        hb.fcyu[513] = -1385291992;
        hb.fcyu[514] = -2122517779;
        hb.fcyu[515] = 121975249;
        hb.fcyu[516] = -1178621508;
        hb.fcyu[517] = -1997253231;
        hb.fcyu[518] = 242903667;
        hb.fcyu[519] = -1908952487;
        hb.fcyu[520] = -1214605616;
        hb.fcyu[521] = -1608184900;
        hb.fcyu[522] = -1017700578;
        hb.fcyu[523] = -972902496;
        hb.fcyu[524] = -1943985931;
        hb.fcyu[525] = -702804078;
        hb.fcyu[526] = 1436444074;
        hb.fcyu[527] = -100354436;
        hb.fcyu[528] = 255879311;
        hb.fcyu[529] = -701492344;
        hb.fcyu[530] = 692486680;
        hb.fcyu[531] = 435322783;
        hb.fcyu[532] = -1577299404;
        hb.fcyu[533] = -1872521660;
        hb.fcyu[534] = -1543227988;
        hb.fcyu[535] = 994767307;
        hb.fcyu[536] = 1675674837;
        hb.fcyu[537] = 998812204;
        hb.fcyu[538] = 144761543;
        hb.fcyu[539] = -582273124;
        hb.fcyu[540] = 1982662051;
        hb.fcyu[541] = -1558402566;
        hb.fcyu[542] = 202628162;
        hb.fcyu[543] = -959671582;
        hb.fcyu[544] = 1047698021;
        hb.fcyu[545] = 1403111167;
        hb.fcyu[546] = 388379272;
        hb.fcyu[547] = 200560018;
        hb.fcyu[548] = -29943600;
        hb.fcyu[549] = -969834335;
        hb.fcyu[550] = 780250829;
        hb.fcyu[551] = -1894775065;
        hb.fcyu[552] = -759875233;
        hb.fcyu[553] = 657890012;
        hb.fcyu[554] = 323649217;
        hb.fcyu[555] = -473542194;
        hb.fcyu[556] = 284492340;
        hb.fcyu[557] = -149615277;
        hb.fcyu[558] = -960968335;
        hb.fcyu[559] = -2037634822;
        hb.fcyu[560] = -35178673;
        hb.fcyu[561] = -326957172;
        hb.fcyu[562] = 1690557987;
        hb.fcyu[563] = -2014525015;
        hb.fcyu[564] = -1495475990;
        hb.fcyu[565] = -395861489;
        hb.fcyu[566] = 55674220;
        hb.fcyu[567] = 1547878726;
        hb.fcyu[568] = -1916307539;
        hb.fcyu[569] = -1712267163;
        hb.fcyu[570] = 1702405345;
        hb.fcyu[571] = 1269999931;
        hb.fcyu[572] = -1823484931;
        hb.fcyu[573] = 1394848067;
        hb.fcyu[574] = -1806241067;
        hb.fcyu[575] = -103198086;
        hb.fcyu[576] = 1218879892;
        hb.fcyu[577] = 2002331053;
        hb.fcyu[578] = -29711179;
        hb.fcyu[579] = -1581228291;
        hb.fcyu[580] = -1080702060;
        hb.fcyu[581] = 1980711500;
        hb.fcyu[582] = -236227581;
        hb.fcyu[583] = -1355248194;
        hb.fcyu[584] = -384302789;
        hb.fcyu[585] = -446271997;
        hb.fcyu[586] = 903063644;
        hb.fcyu[587] = -1407542239;
        hb.fcyu[588] = -618939362;
        hb.fcyu[589] = 1611726973;
        hb.fcyu[590] = -1699062347;
        hb.fcyu[591] = -1726350360;
        hb.fcyu[592] = -1906205332;
        hb.fcyu[593] = 403245377;
        hb.fcyu[594] = -1740890194;
        hb.fcyu[595] = -2140171673;
        hb.fcyu[596] = 1850642471;
        hb.fcyu[597] = 1725906327;
        hb.fcyu[598] = -1340467525;
        hb.fcyu[599] = -1523213329;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void ReallyWorldMode() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hb.lq - hb.fcxy("fdvp", fcxr(int ), (int)211)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == hb.fcxy("fdvq", fcys(int ), (int)352)) break;
            v0 /* !! */  = (long)hb.fcxy("fdvr", fcys(int ), (int)353);
        }
        var5_1 = hb.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hb.lq - hb.fcxy("fdvs", fcxr(int ), (int)212)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == hb.fcxy("fdvt", fcys(int ), (int)354)) break;
            v1 /* !! */  = (long)hb.fcxy("fdvu", fcys(int ), (int)355);
        }
        var4_2 /* !! */  = hb.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = hb.lq - hb.fcxy("fdvv", fcxr(int ), (int)213)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == hb.fcxy("fdvw", fcys(int ), (int)356)) break;
            v2 /* !! */  = (long)hb.fcxy("fdvx", fcys(int ), (int)357);
        }
        var3_3 = hb.a;
        if (var5_1) {
            throw null;
lbl21:
            // 13 sources

            return;
        }
        if (var3_3) ** GOTO lbl21
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_3) ** GOTO lbl21
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = hb.lq - hb.fcxy("fdvy", fcxr(int ), (int)214)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == hb.fcxy("fdvz", fcys(int ), (int)358)) break;
                    v3 /* !! */  = (long)hb.fcxy("fdwa", fcys(int ), (int)359);
                }
                v4 /* !! */  = hb.lq;
                if (true) ** GOTO lbl37
                block78: while (true) {
                    v4 /* !! */  = (long)(v5 - hb.fcxy("fdwb", fcxr(int ), (int)215));
lbl37:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -883073033: {
                            v5 = hb.fcxy("fdwc", fcxr(int ), (int)216);
                            continue block78;
                        }
                        case 96162446: {
                            break block78;
                        }
                        case 1935916175: {
                            v5 = hb.fcxy("fdwd", fcxr(int ), (int)217);
                            continue block78;
                        }
                    }
                    break;
                }
                v6 = hb.mc.field_1687;
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_4 = hb.lq - hb.fcxy("fdwe", fcxr(int ), (int)218)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == hb.fcxy("fdwf", fcys(int ), (int)360)) break;
                    v7 /* !! */  = (long)hb.fcxy("fdwg", fcys(int ), (int)361);
                }
                v8 = v6.method_18456();
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_5 = hb.lq - hb.fcxy("fdwh", fcxr(int ), (int)219)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == hb.fcxy("fdwi", fcys(int ), (int)362)) break;
                    v9 /* !! */  = (long)hb.fcxy("fdwj", fcys(int ), (int)363);
                }
                var1_4 = v8.iterator();
                if (var3_3) ** GOTO lbl21
                do {
                    if (var3_3 || var3_3) ** GOTO lbl21
                    while (true) {
                        if ((v10 /* !! */  = (cfr_temp_6 = hb.lq - hb.fcxy("fdwk", fcxr(int ), (int)220)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v10 /* !! */  == hb.fcxy("fdwl", fcys(int ), (int)364)) break;
                        v10 /* !! */  = (long)hb.fcxy("fdwm", fcys(int ), (int)365);
                    }
                    if (!var1_4.hasNext()) ** GOTO lbl264
                    if (var3_3) ** GOTO lbl21
                    v11 /* !! */  = hb.lq;
                    if (true) ** GOTO lbl73
                    block83: while (true) {
                        v11 /* !! */  = (long)(v12 - hb.fcxy("fdwn", fcxr(int ), (int)221));
lbl73:
                        // 2 sources

                        switch ((int)v11 /* !! */ ) {
                            case -1352933875: {
                                v12 = hb.fcxy("fdwo", fcxr(int ), (int)222);
                                continue block83;
                            }
                            case -348771826: {
                                v12 = hb.fcxy("fdwp", fcxr(int ), (int)223);
                                continue block83;
                            }
                            case 96162446: {
                                break block83;
                            }
                            case 467722073: {
                                v12 = hb.fcxy("fdwq", fcxr(int ), (int)224);
                                continue block83;
                            }
                        }
                        break;
                    }
                    var2_5 = (class_1657)var1_4.next();
                    if (var3_3 || var3_3) ** GOTO lbl21
                    v13 /* !! */  = hb.lq;
                    if (true) ** GOTO lbl91
                    block84: while (true) {
                        v13 /* !! */  = (long)(v14 - hb.fcxy("fdwr", fcxr(int ), (int)225));
lbl91:
                        // 2 sources

                        switch ((int)v13 /* !! */ ) {
                            case -1837199937: {
                                v14 = hb.fcxy("fdws", fcxr(int ), (int)226);
                                continue block84;
                            }
                            case -123452560: {
                                v14 = hb.fcxy("fdwt", fcxr(int ), (int)227);
                                continue block84;
                            }
                            case 96162446: {
                                break block84;
                            }
                            case 750775160: {
                                v14 = hb.fcxy("fdwu", fcxr(int ), (int)228);
                                continue block84;
                            }
                        }
                        break;
                    }
                    v15 = var2_5.method_5667();
                    while (true) {
                        if ((v16 /* !! */  = (cfr_temp_7 = hb.lq - hb.fcxy("fdwv", fcxr(int ), (int)229)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v16 /* !! */  == hb.fcxy("fdww", fcys(int ), (int)366)) break;
                        v16 /* !! */  = (long)hb.fcxy("fdwx", fcys(int ), (int)367);
                    }
                    v17 = var2_5.method_5477();
                    while (true) {
                        if ((v18 /* !! */  = (cfr_temp_8 = hb.lq - hb.fcxy("fdwy", fcxr(int ), (int)230)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                        if (v18 /* !! */  == hb.fcxy("fdwz", fcys(int ), (int)368)) break;
                        v18 /* !! */  = (long)hb.fcxy("fdxa", fcys(int ), (int)369);
                    }
                    v19 = v17.getString();
                    v20 /* !! */  = hb.lq;
                    if (true) ** GOTO lbl120
                    block87: while (true) {
                        v20 /* !! */  = (long)(hb.fcxy("fdxc", fcxr(int ), (int)232) - hb.fcxy("fdxb", fcxr(int ), (int)231));
lbl120:
                        // 2 sources

                        switch ((int)v20 /* !! */ ) {
                            case 96162446: {
                                break block87;
                            }
                            case 1522129555: {
                                continue block87;
                            }
                        }
                        break;
                    }
                    v21 = "OfflinePlayer:" + v19;
                    while (true) {
                        if ((v22 /* !! */  = (cfr_temp_9 = hb.lq - hb.fcxy("fdxd", fcxr(int ), (int)233)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                        if (v22 /* !! */  == hb.fcxy("fdxe", fcys(int ), (int)370)) break;
                        v22 /* !! */  = (long)hb.fcxy("fdxf", fcys(int ), (int)371);
                    }
                    v23 = v21.getBytes();
                    while (true) {
                        if ((v24 /* !! */  = (cfr_temp_10 = hb.lq - hb.fcxy("fdxg", fcxr(int ), (int)234)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                        if (v24 /* !! */  == hb.fcxy("fdxh", fcys(int ), (int)372)) break;
                        v24 /* !! */  = (long)hb.fcxy("fdxi", fcys(int ), (int)373);
                    }
                    v25 = UUID.nameUUIDFromBytes(v23);
                    v26 /* !! */  = hb.lq;
                    if (true) ** GOTO lbl142
                    block90: while (true) {
                        v26 /* !! */  = (long)(v27 - hb.fcxy("fdxj", fcxr(int ), (int)235));
lbl142:
                        // 2 sources

                        switch ((int)v26 /* !! */ ) {
                            case -2050774331: {
                                v27 = hb.fcxy("fdxk", fcxr(int ), (int)236);
                                continue block90;
                            }
                            case -468996316: {
                                v27 = hb.fcxy("fdxl", fcxr(int ), (int)237);
                                continue block90;
                            }
                            case 96162446: {
                                break block90;
                            }
                            case 1631333777: {
                                v27 = hb.fcxy("fdxm", fcxr(int ), (int)238);
                                continue block90;
                            }
                        }
                        break;
                    }
                    if (v15.equals(v25)) ** GOTO lbl261
                    if (var3_3) ** GOTO lbl21
                    while (true) {
                        if ((v28 /* !! */  = (cfr_temp_11 = hb.lq - hb.fcxy("fdxn", fcxr(int ), (int)239)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                        if (v28 /* !! */  == hb.fcxy("fdxo", fcys(int ), (int)374)) break;
                        v28 /* !! */  = (long)hb.fcxy("fdxp", fcys(int ), (int)375);
                    }
                    while (true) {
                        if ((v29 /* !! */  = (cfr_temp_12 = hb.lq - hb.fcxy("fdxq", fcxr(int ), (int)240)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                        if (v29 /* !! */  == hb.fcxy("fdxr", fcys(int ), (int)376)) break;
                        v29 /* !! */  = (long)hb.fcxy("fdxs", fcys(int ), (int)377);
                    }
                    v30 = var2_5.method_5667();
                    v31 /* !! */  = hb.lq;
                    if (true) ** GOTO lbl171
                    block93: while (true) {
                        v31 /* !! */  = (long)(v32 - hb.fcxy("fdxt", fcxr(int ), (int)241));
lbl171:
                        // 2 sources

                        switch ((int)v31 /* !! */ ) {
                            case -1461915955: {
                                v32 = hb.fcxy("fdxu", fcxr(int ), (int)242);
                                continue block93;
                            }
                            case -246276552: {
                                v32 = hb.fcxy("fdxv", fcxr(int ), (int)243);
                                continue block93;
                            }
                            case 96162446: {
                                break block93;
                            }
                        }
                        break;
                    }
                    if (hb.botSet.contains(v30)) ** GOTO lbl261
                    if (var3_3) ** GOTO lbl21
                    while (true) {
                        if ((v33 /* !! */  = (cfr_temp_13 = hb.lq - hb.fcxy("fdxw", fcxr(int ), (int)244)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                        if (v33 /* !! */  == hb.fcxy("fdxx", fcys(int ), (int)378)) break;
                        v33 /* !! */  = (long)hb.fcxy("fdxy", fcys(int ), (int)379);
                    }
                    v34 = var2_5.method_5477();
                    while (true) {
                        if ((v35 /* !! */  = (cfr_temp_14 = hb.lq - hb.fcxy("fdxz", fcxr(int ), (int)245)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                        if (v35 /* !! */  == hb.fcxy("fdya", fcys(int ), (int)380)) break;
                        v35 /* !! */  = (long)hb.fcxy("fdyb", fcys(int ), (int)381);
                    }
                    v36 = v34.getString();
                    v37 /* !! */  = hb.lq;
                    if (true) ** GOTO lbl198
                    block96: while (true) {
                        v37 /* !! */  = (long)(hb.fcxy("fdyd", fcxr(int ), (int)247) - hb.fcxy("fdyc", fcxr(int ), (int)246));
lbl198:
                        // 2 sources

                        switch ((int)v37 /* !! */ ) {
                            case -274793990: {
                                continue block96;
                            }
                            case 96162446: {
                                break block96;
                            }
                        }
                        break;
                    }
                    if (v36.contains("NPC")) ** GOTO lbl261
                    if (var3_3) ** GOTO lbl21
                    while (true) {
                        if ((v38 /* !! */  = (cfr_temp_15 = hb.lq - hb.fcxy("fdye", fcxr(int ), (int)248)) == 0L ? 0 : (cfr_temp_15 < 0L ? -1 : 1)) == false) continue;
                        if (v38 /* !! */  == hb.fcxy("fdyf", fcys(int ), (int)382)) break;
                        v38 /* !! */  = (long)hb.fcxy("fdyg", fcys(int ), (int)383);
                    }
                    v39 = var2_5.method_5477();
                    v40 /* !! */  = hb.lq;
                    if (true) ** GOTO lbl215
                    block98: while (true) {
                        v40 /* !! */  = (long)(v41 - hb.fcxy("fdyh", fcxr(int ), (int)249));
lbl215:
                        // 2 sources

                        switch ((int)v40 /* !! */ ) {
                            case -1437534827: {
                                v41 = hb.fcxy("fdyi", fcxr(int ), (int)250);
                                continue block98;
                            }
                            case 96162446: {
                                break block98;
                            }
                            case 401973063: {
                                v41 = hb.fcxy("fdyj", fcxr(int ), (int)251);
                                continue block98;
                            }
                            case 1193260789: {
                                v41 = hb.fcxy("fdyk", fcxr(int ), (int)252);
                                continue block98;
                            }
                        }
                        break;
                    }
                    v42 = v39.getString();
                    while (true) {
                        if ((v43 /* !! */  = (cfr_temp_16 = hb.lq - hb.fcxy("fdyl", fcxr(int ), (int)253)) == 0L ? 0 : (cfr_temp_16 < 0L ? -1 : 1)) == false) continue;
                        if (v43 /* !! */  == hb.fcxy("fdym", fcys(int ), (int)384)) break;
                        v43 /* !! */  = (long)hb.fcxy("fdyn", fcys(int ), (int)385);
                    }
                    if (v42.startsWith("[ZNPC]")) ** GOTO lbl261
                    if (var3_3 || var3_3) ** GOTO lbl21
                    v44 /* !! */  = hb.lq;
                    if (true) ** GOTO lbl239
                    block100: while (true) {
                        v44 /* !! */  = (long)(hb.fcxy("fdyp", fcxr(int ), (int)255) - hb.fcxy("fdyo", fcxr(int ), (int)254));
lbl239:
                        // 2 sources

                        switch ((int)v44 /* !! */ ) {
                            case 96162446: {
                                break block100;
                            }
                            case 902994904: {
                                continue block100;
                            }
                        }
                        break;
                    }
                    v45 /* !! */  = hb.lq;
                    if (true) ** GOTO lbl248
                    block101: while (true) {
                        v45 /* !! */  = (long)(hb.fcxy("fdyr", fcxr(int ), (int)257) - hb.fcxy("fdyq", fcxr(int ), (int)256));
lbl248:
                        // 2 sources

                        switch ((int)v45 /* !! */ ) {
                            case 96162446: {
                                break block101;
                            }
                            case 1735308941: {
                                continue block101;
                            }
                        }
                        break;
                    }
                    v46 = var2_5.method_5667();
                    while (true) {
                        if ((v47 /* !! */  = (cfr_temp_17 = hb.lq - hb.fcxy("fdys", fcxr(int ), (int)258)) == 0L ? 0 : (cfr_temp_17 < 0L ? -1 : 1)) == false) continue;
                        if (v47 /* !! */  == hb.fcxy("fdyt", fcys(int ), (int)386)) break;
                        v47 /* !! */  = (long)hb.fcxy("fdyu", fcys(int ), (int)387);
                    }
                    hb.botSet.add(v46);
                    if (var3_3) ** GOTO lbl21
lbl261:
                    // 5 sources

                    if (var3_3 || var3_3) ** GOTO lbl21
                } while (!var5_1);
                throw null;
lbl264:
                // 1 sources

                if (!var3_3 && !var3_3) ** break;
                ** continue;
                return;
            }
lbl267:
            // 2 sources

            case 0: {
                var4_2 /* !! */  = (int)hb.fcxy("fdyv", fcys(int ), (int)388);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl315
            }
            case 1: {
                var4_2 /* !! */  = (int)hb.fcxy("fdyw", fcys(int ), (int)389);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl328
            }
lbl277:
            // 2 sources

            case 2: {
                var4_2 /* !! */  = (int)hb.fcxy("fdyx", fcys(int ), (int)390);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl306
            }
lbl282:
            // 4 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)hb.fcxy("fdyy", fcys(int ), (int)391);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl344
                    break;
                }
            }
lbl288:
            // 2 sources

            case 4: {
                var4_2 /* !! */  = (int)hb.fcxy("fdyz", fcys(int ), (int)392);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl324
            }
            case 5: {
                var4_2 /* !! */  = (int)hb.fcxy("fdza", fcys(int ), (int)393);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl328
            }
            case 6: {
                var4_2 /* !! */  = (int)hb.fcxy("fdzb", fcys(int ), (int)394);
                if (var5_1) {
                    throw null;
                }
            }
            case 7: {
                var4_2 /* !! */  = (int)hb.fcxy("fdzc", fcys(int ), (int)395);
                if (!var5_1) ** GOTO lbl277
                throw null;
            }
lbl306:
            // 2 sources

            case 8: {
                var4_2 /* !! */  = (int)hb.fcxy("fdzd", fcys(int ), (int)396);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl348
            }
lbl311:
            // 2 sources

            case 9: {
                var4_2 /* !! */  = (int)hb.fcxy("fdze", fcys(int ), (int)397);
                if (!var5_1) ** GOTO lbl267
                throw null;
            }
lbl315:
            // 3 sources

            case 10: {
                var4_2 /* !! */  = (int)hb.fcxy("fdzf", fcys(int ), (int)398);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl332
            }
            case 11: {
                var4_2 /* !! */  = (int)hb.fcxy("fdzg", fcys(int ), (int)399);
                if (var5_1) {
                    throw null;
                }
            }
lbl324:
            // 4 sources

            case 12: {
                var4_2 /* !! */  = (int)hb.fcxy("fdzh", fcys(int ), (int)400);
                if (!var5_1) ** GOTO lbl282
                throw null;
            }
lbl328:
            // 4 sources

            case 13: {
                var4_2 /* !! */  = (int)hb.fcxy("fdzi", fcys(int ), (int)401);
                if (!var5_1) ** GOTO lbl282
                throw null;
            }
lbl332:
            // 2 sources

            case 14: {
                var4_2 /* !! */  = (int)hb.fcxy("fdzj", fcys(int ), (int)402);
                if (!var5_1) ** GOTO lbl288
                throw null;
            }
            case 15: {
                var4_2 /* !! */  = (int)hb.fcxy("fdzk", fcys(int ), (int)403);
                if (!var5_1) ** GOTO lbl315
                throw null;
            }
            case 16: {
                var4_2 /* !! */  = (int)hb.fcxy("fdzl", fcys(int ), (int)404);
                if (!var5_1) ** GOTO lbl328
                throw null;
            }
lbl344:
            // 2 sources

            case 17: {
                var4_2 /* !! */  = (int)hb.fcxy("fdzm", fcys(int ), (int)405);
                if (var5_1) {
                    throw null;
                }
            }
lbl348:
            // 4 sources

            case 18: {
                var4_2 /* !! */  = (int)hb.fcxy("fdzn", fcys(int ), (int)406);
                if (!var5_1) ** GOTO lbl282
                throw null;
            }
            case 19: {
                var4_2 /* !! */  = (int)hb.fcxy("fdzo", fcys(int ), (int)407);
                if (!var5_1) ** GOTO lbl311
                throw null;
            }
            case 20: 
        }
        var4_2 /* !! */  = (int)hb.fcxy("fdzp", fcys(int ), (int)408);
        ** while (!var5_1)
lbl359:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fexp() {
        hb.fcyv[100] = -2036161099;
        hb.fcyv[101] = 1944756444;
        hb.fcyv[102] = 165169504;
        hb.fcyv[103] = -152492385;
        hb.fcyv[104] = -723719624;
        hb.fcyv[105] = -306594220;
        hb.fcyv[106] = -655814243;
        hb.fcyv[107] = 1134128108;
        hb.fcyv[108] = 402625411;
        hb.fcyv[109] = -897234971;
        hb.fcyv[110] = 2085420782;
        hb.fcyv[111] = -1686004672;
        hb.fcyv[112] = 12447084;
        hb.fcyv[113] = 1610799735;
        hb.fcyv[114] = -1968438348;
        hb.fcyv[115] = -1206803730;
        hb.fcyv[116] = 10859278;
        hb.fcyv[117] = 1111010031;
        hb.fcyv[118] = -1483314632;
        hb.fcyv[119] = 1666161724;
        hb.fcyv[120] = 2008528350;
        hb.fcyv[121] = 839426481;
        hb.fcyv[122] = 1694196220;
        hb.fcyv[123] = -1437390235;
        hb.fcyv[124] = -1889123616;
        hb.fcyv[125] = 1874620544;
        hb.fcyv[126] = -1424086263;
        hb.fcyv[127] = -1713767941;
        hb.fcyv[128] = 987399141;
        hb.fcyv[129] = -664023612;
        hb.fcyv[130] = 1125448137;
        hb.fcyv[131] = 2146109096;
        hb.fcyv[132] = -282526405;
        hb.fcyv[133] = -525730887;
        hb.fcyv[134] = 1458094824;
        hb.fcyv[135] = 433111515;
        hb.fcyv[136] = -1058408910;
        hb.fcyv[137] = 1350856952;
        hb.fcyv[138] = 1666342073;
        hb.fcyv[139] = -447546854;
        hb.fcyv[140] = 711973101;
        hb.fcyv[141] = 781476652;
        hb.fcyv[142] = -708741244;
        hb.fcyv[143] = 1734773716;
        hb.fcyv[144] = 1091047470;
        hb.fcyv[145] = -2092645979;
        hb.fcyv[146] = -1485157173;
        hb.fcyv[147] = 1728688202;
        hb.fcyv[148] = -647563723;
        hb.fcyv[149] = 345940690;
        hb.fcyv[150] = 1607845031;
        hb.fcyv[151] = 1877329366;
        hb.fcyv[152] = -754231042;
        hb.fcyv[153] = -1333101590;
        hb.fcyv[154] = -2098643887;
        hb.fcyv[155] = 2126043152;
        hb.fcyv[156] = -2017465080;
        hb.fcyv[157] = -317410778;
        hb.fcyv[158] = 556951259;
        hb.fcyv[159] = 66558972;
        hb.fcyv[160] = 1873400954;
        hb.fcyv[161] = -2123525485;
        hb.fcyv[162] = 1499843254;
        hb.fcyv[163] = -352208150;
        hb.fcyv[164] = -80490502;
        hb.fcyv[165] = 629666718;
        hb.fcyv[166] = -1740593543;
        hb.fcyv[167] = 1072258590;
        hb.fcyv[168] = 792371047;
        hb.fcyv[169] = 209991318;
        hb.fcyv[170] = 527628454;
        hb.fcyv[171] = -1991598012;
        hb.fcyv[172] = -1531379492;
        hb.fcyv[173] = -1800904859;
        hb.fcyv[174] = -177196160;
        hb.fcyv[175] = 299916462;
        hb.fcyv[176] = -1239428332;
        hb.fcyv[177] = -460369930;
        hb.fcyv[178] = -1852016235;
        hb.fcyv[179] = -1735626457;
        hb.fcyv[180] = 406440835;
        hb.fcyv[181] = -526136206;
        hb.fcyv[182] = 72843354;
        hb.fcyv[183] = -1693929348;
        hb.fcyv[184] = -1399168141;
        hb.fcyv[185] = 1403965695;
        hb.fcyv[186] = -1237156969;
        hb.fcyv[187] = -391150994;
        hb.fcyv[188] = -19323690;
        hb.fcyv[189] = -117446753;
        hb.fcyv[190] = -1390173656;
        hb.fcyv[191] = -1428032120;
        hb.fcyv[192] = -1390164574;
        hb.fcyv[193] = 320819213;
        hb.fcyv[194] = -1458903312;
        hb.fcyv[195] = -1690287322;
        hb.fcyv[196] = 1367975590;
        hb.fcyv[197] = 1377331003;
        hb.fcyv[198] = -441689040;
        hb.fcyv[199] = 768116447;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void matrixMode() {
        var14_1 = hb.c;
        var13_2 /* !! */  = hb.b;
        var12_3 = hb.a;
        if (var14_1) {
            throw null;
lbl6:
            // 43 sources

            return;
        }
        if (var12_3 || var12_3) ** GOTO lbl6
        var1_4 = this.suspectSet.iterator();
        if (var12_3) ** GOTO lbl6
        block76: while (true) {
            block148: {
                block147: {
                    if (var12_3 || var12_3) ** GOTO lbl6
                    if (!var1_4.hasNext()) ** GOTO lbl101
                    if (var12_3 || var12_3) ** GOTO lbl6
                    var2_5 = var1_4.next();
                    if (var12_3 || var12_3) ** GOTO lbl6
                    var3_6 = hb.mc.field_1687.method_18470(var2_5);
                    if (var12_3 || var12_3) ** GOTO lbl6
                    if (var3_6 == null) ** GOTO lbl96
                    if (var12_3 || var12_3) ** GOTO lbl6
                    var4_7 = var3_6.method_5477().getString();
                    if (var12_3 || var12_3) ** GOTO lbl6
                    if (!var4_7.startsWith("CIT-")) break block147;
                    if (var12_3) ** GOTO lbl6
                    if (var4_7.contains("NPC")) break block147;
                    if (var12_3) ** GOTO lbl6
                    if (var4_7.contains("[ZNPC]")) break block147;
                    if (var12_3) ** GOTO lbl6
                    v0 = hb.fcxy("fdsk", fcys(int ), (int)269);
                    if (var14_1) {
                        throw null;
                    }
                    break block148;
                }
                if (var12_3 || var12_3) ** GOTO lbl6
                v0 = var5_8 = hb.fcxy("fdsl", fcys(int ), (int)270);
            }
            if (var12_3 || var12_3) ** GOTO lbl6
            var6_9 = hb.fcxy("fdsm", fcys(int ), (int)271);
            if (var12_3 || var12_3) ** GOTO lbl6
            var7_11 = hb.ARMOR_SLOTS;
            if (var12_3) ** GOTO lbl6
            var8_12 /* !! */  = var7_11.length;
            if (var12_3) ** GOTO lbl6
            var9_13 = hb.fcxy("fdsn", fcys(int ), (int)272);
            if (var12_3) ** GOTO lbl6
            block77: while (true) {
                if (var12_3 || var12_3) ** GOTO lbl6
                if (var9_13 >= var8_12 /* !! */ ) ** GOTO lbl66
                if (var12_3) ** GOTO lbl6
                var10_14 = var7_11[var9_13];
                if (var12_3 || var12_3) ** GOTO lbl6
                var11_15 = var3_6.method_6118(var10_14);
                if (var12_3 || var12_3) ** GOTO lbl6
                if (var11_15.method_7960()) ** GOTO lbl61
                if (var12_3) ** GOTO lbl6
                if (var13_2 /* !! */  == 0) ** GOTO lbl-1000
                switch (var13_2 /* !! */ ) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        ++var6_9;
                        if (var12_3) ** GOTO lbl6
lbl61:
                        // 2 sources

                        if (var12_3 || var12_3) ** GOTO lbl6
                        ++var9_13;
                        if (var12_3) ** GOTO lbl6
                        if (!var14_1) continue block77;
                        throw null;
                    }
lbl66:
                    // 1 sources

                    if (var12_3 || var12_3) ** GOTO lbl6
                    if (var6_9 != hb.fcxy("fdso", fcys(int ), (int)273)) ** GOTO lbl73
                    if (var12_3) ** GOTO lbl6
                    v1 = hb.fcxy("fdsp", fcys(int ), (int)274);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl75
lbl73:
                    // 1 sources

                    if (var12_3 || var12_3) ** GOTO lbl6
                    v1 = var7_10 = hb.fcxy("fdsq", fcys(int ), (int)275);
lbl75:
                    // 2 sources

                    if (var12_3 || var12_3) ** GOTO lbl6
                    if (var3_6.method_5667().equals(UUID.nameUUIDFromBytes(("OfflinePlayer:" + var4_7).getBytes()))) ** GOTO lbl82
                    if (var12_3) ** GOTO lbl6
                    v2 = hb.fcxy("fdsr", fcys(int ), (int)276);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl84
lbl82:
                    // 1 sources

                    if (var12_3 || var12_3) ** GOTO lbl6
                    v2 = hb.fcxy("fdss", fcys(int ), (int)277);
lbl84:
                    // 2 sources

                    var8_12 /* !! */  = (int)v2;
                    if (var12_3 || var12_3) ** GOTO lbl6
                    if (var7_10 != false) ** GOTO lbl92
                    if (var12_3) ** GOTO lbl6
                    if (var5_8 != false) ** GOTO lbl92
                    if (var12_3) ** GOTO lbl6
                    if (var8_12 /* !! */  == 0) ** GOTO lbl96
                    if (var12_3) ** GOTO lbl6
lbl92:
                    // 3 sources

                    if (var12_3 || var12_3) ** GOTO lbl6
                    hb.botSet.add(var2_5);
                    if (var12_3) ** GOTO lbl6
lbl96:
                    // 3 sources

                    if (var12_3 || var12_3) ** GOTO lbl6
                    var1_4.remove();
                    if (var12_3 || var12_3) ** GOTO lbl6
                    if (!var14_1) continue block76;
                    throw null;
lbl101:
                    // 1 sources

                    if (var12_3 || var12_3) ** GOTO lbl6
                    if (hb.mc.field_1724.field_6012 % hb.fcxy("fdst", fcys(int ), (int)278) != 0) ** GOTO lbl107
                    if (var12_3 || var12_3) ** GOTO lbl6
                    hb.botSet.removeIf((Predicate<UUID>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$matrixMode$3(java.util.UUID ), (Ljava/util/UUID;)Z)());
                    if (var12_3) ** GOTO lbl6
lbl107:
                    // 2 sources

                    if (!var12_3 && !var12_3) ** break;
                    ** continue;
                    return;
lbl110:
                    // 2 sources

                    case 0: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdsu", fcys(int ), (int)279);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl360
                    }
lbl115:
                    // 2 sources

                    case 1: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdsv", fcys(int ), (int)280);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl405
                    }
lbl120:
                    // 2 sources

                    case 2: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdsw", fcys(int ), (int)281);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl154
                    }
                    case 3: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdsx", fcys(int ), (int)282);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl433
                    }
                    case 4: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdsy", fcys(int ), (int)283);
                        if (!var14_1) break block76;
                        throw null;
                    }
                    case 5: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdsz", fcys(int ), (int)284);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl149
                    }
                    case 6: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdta", fcys(int ), (int)285);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl355
                    }
                    case 7: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdtb", fcys(int ), (int)286);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl355
                    }
lbl149:
                    // 2 sources

                    case 8: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdtc", fcys(int ), (int)287);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl179
                    }
lbl154:
                    // 3 sources

                    case 9: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdtd", fcys(int ), (int)288);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl232
                    }
lbl159:
                    // 5 sources

                    case 10: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdte", fcys(int ), (int)289);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl393
                    }
                    case 11: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdtf", fcys(int ), (int)290);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl263
                    }
                    case 12: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdtg", fcys(int ), (int)291);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl224
                    }
lbl174:
                    // 3 sources

                    case 13: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdth", fcys(int ), (int)292);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl267
                    }
lbl179:
                    // 2 sources

                    case 14: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdti", fcys(int ), (int)293);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl328
                    }
                    case 15: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdtj", fcys(int ), (int)294);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl272
                    }
                    case 16: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdtk", fcys(int ), (int)295);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl199
                    }
lbl194:
                    // 2 sources

                    case 17: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdtl", fcys(int ), (int)296);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl417
                    }
lbl199:
                    // 3 sources

                    case 18: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdtm", fcys(int ), (int)297);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl373
                    }
lbl204:
                    // 2 sources

                    case 19: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdtn", fcys(int ), (int)298);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl397
                    }
                    case 20: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdto", fcys(int ), (int)299);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl421
                    }
lbl214:
                    // 2 sources

                    case 21: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdtp", fcys(int ), (int)300);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl267
                    }
                    case 22: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdtq", fcys(int ), (int)301);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl389
                    }
lbl224:
                    // 3 sources

                    case 23: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdtr", fcys(int ), (int)302);
                        if (!var14_1) ** GOTO lbl120
                        throw null;
                    }
                    case 24: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdts", fcys(int ), (int)303);
                        if (!var14_1) ** GOTO lbl110
                        throw null;
                    }
lbl232:
                    // 3 sources

                    case 25: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdtt", fcys(int ), (int)304);
                        if (!var14_1) ** GOTO lbl174
                        throw null;
                    }
lbl236:
                    // 3 sources

                    case 26: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdtu", fcys(int ), (int)305);
                        if (var14_1) {
                            throw null;
                        }
                    }
lbl240:
                    // 5 sources

                    case 27: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdtv", fcys(int ), (int)306);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl433
                    }
                    case 28: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdtw", fcys(int ), (int)307);
                        if (!var14_1) ** GOTO lbl224
                        throw null;
                    }
lbl249:
                    // 2 sources

                    case 29: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdtx", fcys(int ), (int)308);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl385
                    }
                    case 30: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdty", fcys(int ), (int)309);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl425
                    }
                    case 31: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdtz", fcys(int ), (int)310);
                        if (!var14_1) ** GOTO lbl214
                        throw null;
                    }
lbl263:
                    // 2 sources

                    case 32: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdua", fcys(int ), (int)311);
                        if (!var14_1) ** GOTO lbl236
                        throw null;
                    }
lbl267:
                    // 3 sources

                    case 33: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdub", fcys(int ), (int)312);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl341
                    }
lbl272:
                    // 3 sources

                    case 34: {
                        var13_2 /* !! */  = (int)hb.fcxy("fduc", fcys(int ), (int)313);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl413
                    }
                    case 35: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdud", fcys(int ), (int)314);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl413
                    }
lbl282:
                    // 2 sources

                    case 36: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdue", fcys(int ), (int)315);
                        if (!var14_1) ** GOTO lbl115
                        throw null;
                    }
                    case 37: {
                        var13_2 /* !! */  = (int)hb.fcxy("fduf", fcys(int ), (int)316);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl421
                    }
                    case 38: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdug", fcys(int ), (int)317);
                        if (!var14_1) ** GOTO lbl249
                        throw null;
                    }
                    case 39: {
                        var13_2 /* !! */  = (int)hb.fcxy("fduh", fcys(int ), (int)318);
                        if (!var14_1) ** GOTO lbl199
                        throw null;
                    }
                    case 40: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdui", fcys(int ), (int)319);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl429
                    }
lbl304:
                    // 2 sources

                    case 41: {
                        var13_2 /* !! */  = (int)hb.fcxy("fduj", fcys(int ), (int)320);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl360
                    }
                    case 42: {
                        var13_2 /* !! */  = (int)hb.fcxy("fduk", fcys(int ), (int)321);
                        if (!var14_1) break block76;
                        throw null;
                    }
lbl313:
                    // 2 sources

                    case 43: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdul", fcys(int ), (int)322);
                        if (!var14_1) ** GOTO lbl159
                        throw null;
                    }
                    case 44: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var13_2 /* !! */  = (int)hb.fcxy("fdum", fcys(int ), (int)323);
                            if (var14_1) {
                                throw null;
                            }
                            ** GOTO lbl413
                            break;
                        }
                    }
lbl323:
                    // 2 sources

                    case 45: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdun", fcys(int ), (int)324);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl351
                    }
lbl328:
                    // 3 sources

                    case 46: {
                        var13_2 /* !! */  = (int)hb.fcxy("fduo", fcys(int ), (int)325);
                        if (!var14_1) ** GOTO lbl194
                        throw null;
                    }
lbl332:
                    // 2 sources

                    case 47: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdup", fcys(int ), (int)326);
                        if (!var14_1) ** GOTO lbl174
                        throw null;
                    }
                    case 48: {
                        var13_2 /* !! */  = (int)hb.fcxy("fduq", fcys(int ), (int)327);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl377
                    }
lbl341:
                    // 2 sources

                    case 49: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdur", fcys(int ), (int)328);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl429
                    }
                    case 50: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdus", fcys(int ), (int)329);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl397
                    }
lbl351:
                    // 2 sources

                    case 51: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdut", fcys(int ), (int)330);
                        if (!var14_1) ** GOTO lbl159
                        throw null;
                    }
lbl355:
                    // 4 sources

                    case 52: {
                        var13_2 /* !! */  = (int)hb.fcxy("fduu", fcys(int ), (int)331);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl373
                    }
lbl360:
                    // 3 sources

                    case 53: {
                        var13_2 /* !! */  = (int)hb.fcxy("fduv", fcys(int ), (int)332);
                        if (var14_1) {
                            throw null;
                        }
                        ** GOTO lbl409
                    }
                    case 54: {
                        var13_2 /* !! */  = (int)hb.fcxy("fduw", fcys(int ), (int)333);
                        if (!var14_1) ** GOTO lbl313
                        throw null;
                    }
                    case 55: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdux", fcys(int ), (int)334);
                        if (!var14_1) ** GOTO lbl159
                        throw null;
                    }
lbl373:
                    // 3 sources

                    case 56: {
                        var13_2 /* !! */  = (int)hb.fcxy("fduy", fcys(int ), (int)335);
                        if (!var14_1) ** GOTO lbl240
                        throw null;
                    }
lbl377:
                    // 2 sources

                    case 57: {
                        var13_2 /* !! */  = (int)hb.fcxy("fduz", fcys(int ), (int)336);
                        if (!var14_1) ** GOTO lbl328
                        throw null;
                    }
                    case 58: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdva", fcys(int ), (int)337);
                        if (!var14_1) ** GOTO lbl204
                        throw null;
                    }
lbl385:
                    // 3 sources

                    case 59: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdvb", fcys(int ), (int)338);
                        if (!var14_1) ** GOTO lbl154
                        throw null;
                    }
lbl389:
                    // 3 sources

                    case 60: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdvc", fcys(int ), (int)339);
                        if (!var14_1) ** GOTO lbl304
                        throw null;
                    }
lbl393:
                    // 2 sources

                    case 61: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdvd", fcys(int ), (int)340);
                        if (!var14_1) ** GOTO lbl240
                        throw null;
                    }
lbl397:
                    // 3 sources

                    case 62: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdve", fcys(int ), (int)341);
                        if (!var14_1) ** GOTO lbl282
                        throw null;
                    }
                    case 63: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdvf", fcys(int ), (int)342);
                        if (!var14_1) ** GOTO lbl355
                        throw null;
                    }
lbl405:
                    // 2 sources

                    case 64: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdvg", fcys(int ), (int)343);
                        if (!var14_1) ** GOTO lbl236
                        throw null;
                    }
lbl409:
                    // 2 sources

                    case 65: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdvh", fcys(int ), (int)344);
                        if (!var14_1) ** GOTO lbl232
                        throw null;
                    }
lbl413:
                    // 4 sources

                    case 66: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdvi", fcys(int ), (int)345);
                        if (!var14_1) ** GOTO lbl272
                        throw null;
                    }
lbl417:
                    // 2 sources

                    case 67: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdvj", fcys(int ), (int)346);
                        if (!var14_1) ** GOTO lbl389
                        throw null;
                    }
lbl421:
                    // 3 sources

                    case 68: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdvk", fcys(int ), (int)347);
                        if (!var14_1) ** GOTO lbl323
                        throw null;
                    }
lbl425:
                    // 2 sources

                    case 69: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdvl", fcys(int ), (int)348);
                        if (!var14_1) ** GOTO lbl385
                        throw null;
                    }
lbl429:
                    // 3 sources

                    case 70: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdvm", fcys(int ), (int)349);
                        if (!var14_1) ** GOTO lbl332
                        throw null;
                    }
lbl433:
                    // 3 sources

                    case 71: {
                        var13_2 /* !! */  = (int)hb.fcxy("fdvn", fcys(int ), (int)350);
                        if (!var14_1) ** GOTO lbl159
                        throw null;
                    }
                    case 72: 
                }
                break;
            }
            break;
        }
        var13_2 /* !! */  = (int)hb.fcxy("fdvo", fcys(int ), (int)351);
        ** while (!var14_1)
lbl440:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ boolean lambda$onTick$0(class_742 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hb.lq - hb.fcxy("fewj", fcxr(int ), (int)474)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hb.fcxy("fewk", fcys(int ), (int)785)) break;
            v0 /* !! */  = (long)hb.fcxy("fewl", fcys(int ), (int)786);
        }
        var4_2 = hb.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hb.lq - hb.fcxy("fewm", fcxr(int ), (int)475)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hb.fcxy("fewn", fcys(int ), (int)787)) break;
            v1 /* !! */  = (long)hb.fcxy("fewo", fcys(int ), (int)788);
        }
        var3_3 /* !! */  = hb.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = hb.lq - hb.fcxy("fewp", fcxr(int ), (int)476)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hb.fcxy("fewq", fcys(int ), (int)789)) break;
            v2 /* !! */  = (long)hb.fcxy("fewr", fcys(int ), (int)790);
        }
        var2_4 = hb.a;
        if (var4_2) {
            throw null;
lbl24:
            // 2 sources

            return (boolean)hb.fcxy("fews", fcys(int ), (int)791);
        }
        if (var2_4) ** GOTO lbl24
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = hb.lq - hb.fcxy("fewt", fcxr(int ), (int)477)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == hb.fcxy("fewu", fcys(int ), (int)792)) break;
                    v3 /* !! */  = (long)hb.fcxy("fewv", fcys(int ), (int)793);
                }
                v4 /* !! */  = hb.lq;
                if (true) ** GOTO lbl41
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - hb.fcxy("feww", fcxr(int ), (int)478));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2012011655: {
                            v5 = hb.fcxy("fewx", fcxr(int ), (int)479);
                            continue block21;
                        }
                        case -880267859: {
                            v5 = hb.fcxy("fewy", fcxr(int ), (int)480);
                            continue block21;
                        }
                        case 96162446: {
                            break block21;
                        }
                        case 1850182091: {
                            v5 = hb.fcxy("fewz", fcxr(int ), (int)481);
                            continue block21;
                        }
                    }
                    break;
                }
                v6 = var1_1.method_5667();
                v7 /* !! */  = hb.lq;
                if (true) ** GOTO lbl58
                block22: while (true) {
                    v7 /* !! */  = (long)(hb.fcxy("fexb", fcxr(int ), (int)483) - hb.fcxy("fexa", fcxr(int ), (int)482));
lbl58:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 96162446: {
                            break block22;
                        }
                        case 1992088242: {
                            continue block22;
                        }
                    }
                    break;
                }
                return this.suspectSet.contains(v6);
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hb.fcxy("fexc", fcys(int ), (int)794);
                    if (!var4_2) break block0;
                    throw null;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)hb.fcxy("fexd", fcys(int ), (int)795);
                if (!var4_2) break;
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)hb.fcxy("fexe", fcys(int ), (int)796);
                if (!var4_2) break;
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)hb.fcxy("fexf", fcys(int ), (int)797);
        ** while (!var4_2)
lbl80:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fexu() {
        hb.fcyv[600] = 1522757333;
        hb.fcyv[601] = 1123390264;
        hb.fcyv[602] = -935244779;
        hb.fcyv[603] = 457577651;
        hb.fcyv[604] = 1735261407;
        hb.fcyv[605] = 1805446074;
        hb.fcyv[606] = -2084427799;
        hb.fcyv[607] = 2007763902;
        hb.fcyv[608] = -205388284;
        hb.fcyv[609] = -1794216396;
        hb.fcyv[610] = 1397421979;
        hb.fcyv[611] = -1681795720;
        hb.fcyv[612] = 1432507111;
        hb.fcyv[613] = -2025749844;
        hb.fcyv[614] = 307422837;
        hb.fcyv[615] = -1041826628;
        hb.fcyv[616] = 283945627;
        hb.fcyv[617] = -1669480376;
        hb.fcyv[618] = -1551961064;
        hb.fcyv[619] = 254906654;
        hb.fcyv[620] = -1656899715;
        hb.fcyv[621] = -1520911826;
        hb.fcyv[622] = -1525150706;
        hb.fcyv[623] = 371447588;
        hb.fcyv[624] = -564335041;
        hb.fcyv[625] = -1892459774;
        hb.fcyv[626] = -900492038;
        hb.fcyv[627] = 657062258;
        hb.fcyv[628] = -581479867;
        hb.fcyv[629] = 238220461;
        hb.fcyv[630] = 2134458128;
        hb.fcyv[631] = 2078222376;
        hb.fcyv[632] = 1891199419;
        hb.fcyv[633] = -55858973;
        hb.fcyv[634] = 1820104605;
        hb.fcyv[635] = -948744158;
        hb.fcyv[636] = 1434423301;
        hb.fcyv[637] = -1227321106;
        hb.fcyv[638] = -206381318;
        hb.fcyv[639] = 426425370;
        hb.fcyv[640] = -733960804;
        hb.fcyv[641] = -1510758734;
        hb.fcyv[642] = 1903440969;
        hb.fcyv[643] = -248527746;
        hb.fcyv[644] = 826657317;
        hb.fcyv[645] = -1683962298;
        hb.fcyv[646] = 1991650833;
        hb.fcyv[647] = 1670912175;
        hb.fcyv[648] = 1447122652;
        hb.fcyv[649] = 945190270;
        hb.fcyv[650] = -1583123421;
        hb.fcyv[651] = -558020862;
        hb.fcyv[652] = 1013767645;
        hb.fcyv[653] = 1144189090;
        hb.fcyv[654] = 246249171;
        hb.fcyv[655] = -944692351;
        hb.fcyv[656] = -943464444;
        hb.fcyv[657] = 221290210;
        hb.fcyv[658] = 1820921978;
        hb.fcyv[659] = -2119204401;
        hb.fcyv[660] = 2100797674;
        hb.fcyv[661] = 294448514;
        hb.fcyv[662] = -118804540;
        hb.fcyv[663] = -1154893861;
        hb.fcyv[664] = 33651338;
        hb.fcyv[665] = -535334471;
        hb.fcyv[666] = -549980608;
        hb.fcyv[667] = -1492566316;
        hb.fcyv[668] = -888863009;
        hb.fcyv[669] = 473168767;
        hb.fcyv[670] = -321918937;
        hb.fcyv[671] = 1063759092;
        hb.fcyv[672] = -1040164847;
        hb.fcyv[673] = 1439151579;
        hb.fcyv[674] = 570500083;
        hb.fcyv[675] = 1987083546;
        hb.fcyv[676] = 576429882;
        hb.fcyv[677] = 600711917;
        hb.fcyv[678] = 870285307;
        hb.fcyv[679] = 944057827;
        hb.fcyv[680] = -42014431;
        hb.fcyv[681] = -1402322096;
        hb.fcyv[682] = -880176275;
        hb.fcyv[683] = -452062267;
        hb.fcyv[684] = 248951469;
        hb.fcyv[685] = 1821670599;
        hb.fcyv[686] = 1749526757;
        hb.fcyv[687] = -1451304201;
        hb.fcyv[688] = -1964239718;
        hb.fcyv[689] = -1420248845;
        hb.fcyv[690] = -626868911;
        hb.fcyv[691] = -1665954606;
        hb.fcyv[692] = -898277298;
        hb.fcyv[693] = -1656264040;
        hb.fcyv[694] = -1654372043;
        hb.fcyv[695] = 1344572267;
        hb.fcyv[696] = -440305766;
        hb.fcyv[697] = -903504661;
        hb.fcyv[698] = 113316210;
        hb.fcyv[699] = 136486427;
    }

    private static /* synthetic */ void fexq() {
        hb.fcyv[200] = 2000404908;
        hb.fcyv[201] = 113408469;
        hb.fcyv[202] = 129223614;
        hb.fcyv[203] = -416151405;
        hb.fcyv[204] = -1051547223;
        hb.fcyv[205] = -131666557;
        hb.fcyv[206] = -740713671;
        hb.fcyv[207] = -1519635120;
        hb.fcyv[208] = -1304665424;
        hb.fcyv[209] = 58569258;
        hb.fcyv[210] = -407469885;
        hb.fcyv[211] = -1309609682;
        hb.fcyv[212] = 1164213918;
        hb.fcyv[213] = 1286854994;
        hb.fcyv[214] = -277643972;
        hb.fcyv[215] = -1293079165;
        hb.fcyv[216] = -1048017248;
        hb.fcyv[217] = 35478081;
        hb.fcyv[218] = 44309185;
        hb.fcyv[219] = 951388572;
        hb.fcyv[220] = 1002895044;
        hb.fcyv[221] = -1948353208;
        hb.fcyv[222] = -1322534998;
        hb.fcyv[223] = -1934738305;
        hb.fcyv[224] = -1303368505;
        hb.fcyv[225] = -1605242139;
        hb.fcyv[226] = -1993988254;
        hb.fcyv[227] = -353859044;
        hb.fcyv[228] = -1189656080;
        hb.fcyv[229] = -1425797881;
        hb.fcyv[230] = -2047005200;
        hb.fcyv[231] = 777570911;
        hb.fcyv[232] = -1719341774;
        hb.fcyv[233] = -34033222;
        hb.fcyv[234] = 1052496967;
        hb.fcyv[235] = -1280322033;
        hb.fcyv[236] = 1698127554;
        hb.fcyv[237] = 1414608408;
        hb.fcyv[238] = 794644599;
        hb.fcyv[239] = 233761750;
        hb.fcyv[240] = -1463638912;
        hb.fcyv[241] = -212968040;
        hb.fcyv[242] = -933902798;
        hb.fcyv[243] = -2121839868;
        hb.fcyv[244] = -766766980;
        hb.fcyv[245] = -16956528;
        hb.fcyv[246] = -367740372;
        hb.fcyv[247] = -859039198;
        hb.fcyv[248] = -696397469;
        hb.fcyv[249] = -93086759;
        hb.fcyv[250] = 1630062227;
        hb.fcyv[251] = -100070907;
        hb.fcyv[252] = 1181039775;
        hb.fcyv[253] = 212449335;
        hb.fcyv[254] = 2097261605;
        hb.fcyv[255] = -490303040;
        hb.fcyv[256] = -735386511;
        hb.fcyv[257] = -1798266058;
        hb.fcyv[258] = -638743121;
        hb.fcyv[259] = 540604673;
        hb.fcyv[260] = 991334182;
        hb.fcyv[261] = 1565528568;
        hb.fcyv[262] = -1513673352;
        hb.fcyv[263] = 84041111;
        hb.fcyv[264] = 1976576067;
        hb.fcyv[265] = -2112762023;
        hb.fcyv[266] = 1837425555;
        hb.fcyv[267] = -2117006028;
        hb.fcyv[268] = 320999679;
        hb.fcyv[269] = -562678446;
        hb.fcyv[270] = 865084787;
        hb.fcyv[271] = -1595721868;
        hb.fcyv[272] = -1297382415;
        hb.fcyv[273] = 1825331362;
        hb.fcyv[274] = -2141883708;
        hb.fcyv[275] = 226835485;
        hb.fcyv[276] = 1319698441;
        hb.fcyv[277] = -240203094;
        hb.fcyv[278] = 623229816;
        hb.fcyv[279] = 36706728;
        hb.fcyv[280] = 1340337860;
        hb.fcyv[281] = 407901592;
        hb.fcyv[282] = -1451257057;
        hb.fcyv[283] = -1102987264;
        hb.fcyv[284] = -1942357605;
        hb.fcyv[285] = -942647608;
        hb.fcyv[286] = -1788361349;
        hb.fcyv[287] = 329337737;
        hb.fcyv[288] = 37733052;
        hb.fcyv[289] = -1754817690;
        hb.fcyv[290] = -1780604845;
        hb.fcyv[291] = -1052939165;
        hb.fcyv[292] = 478803195;
        hb.fcyv[293] = 1707533143;
        hb.fcyv[294] = 2079622791;
        hb.fcyv[295] = -1183613457;
        hb.fcyv[296] = 1885527819;
        hb.fcyv[297] = -506728871;
        hb.fcyv[298] = 1356570724;
        hb.fcyv[299] = 2001867409;
    }

    private static /* synthetic */ int fcys(int n2) {
        return fcyu[n2] ^ fcyv[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean hasArmorChanged(class_1657 var1_1, List<class_1799> var2_2) {
        block74: {
            block73: {
                v0 /* !! */  = hb.lq;
                if (true) ** GOTO lbl5
                block39: while (true) {
                    v0 /* !! */  = (long)(hb.fcxy("fegh", fcxr(int ), (int)300) - hb.fcxy("fegg", fcxr(int ), (int)299));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case 96162446: {
                            break block39;
                        }
                        case 662703414: {
                            continue block39;
                        }
                    }
                    break;
                }
                var7_3 = hb.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_0 = hb.lq - hb.fcxy("fegi", fcxr(int ), (int)301)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  == hb.fcxy("fegj", fcys(int ), (int)541)) break;
                    v1 /* !! */  = (long)hb.fcxy("fegk", fcys(int ), (int)542);
                }
                var6_4 /* !! */  = hb.b;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = hb.lq - hb.fcxy("fegl", fcxr(int ), (int)302)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == hb.fcxy("fegm", fcys(int ), (int)543)) break;
                    v2 /* !! */  = (long)hb.fcxy("fegn", fcys(int ), (int)544);
                }
                var5_5 = hb.a;
                if (var7_3) {
                    throw null;
lbl25:
                    // 14 sources

                    return (boolean)hb.fcxy("fego", fcys(int ), (int)545);
                }
                if (var5_5 || var5_5) ** GOTO lbl25
                if (var2_2 != null) break block73;
                if (var5_5 || var5_5) ** GOTO lbl25
                return (boolean)hb.fcxy("fegp", fcys(int ), (int)546);
            }
            if (var5_5 || var5_5) ** GOTO lbl25
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_2 = hb.lq - hb.fcxy("fegq", fcxr(int ), (int)303)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == hb.fcxy("fegr", fcys(int ), (int)547)) break;
                v3 /* !! */  = (long)hb.fcxy("fegs", fcys(int ), (int)548);
            }
            var3_6 = this.getArmorItems(var1_1);
            if (var5_5 || var5_5) ** GOTO lbl25
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_3 = hb.lq - hb.fcxy("fegt", fcxr(int ), (int)304)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == hb.fcxy("fegu", fcys(int ), (int)549)) break;
                v4 /* !! */  = (long)hb.fcxy("fegv", fcys(int ), (int)550);
            }
            v5 = var3_6.size();
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_4 = hb.lq - hb.fcxy("fegw", fcxr(int ), (int)305)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == hb.fcxy("fegx", fcys(int ), (int)551)) break;
                v6 /* !! */  = (long)hb.fcxy("fegy", fcys(int ), (int)552);
            }
            if (v5 == var2_2.size()) break block74;
            if (var5_5 || var5_5) ** GOTO lbl25
            return (boolean)hb.fcxy("fegz", fcys(int ), (int)553);
        }
        if (var5_5 || var5_5) ** GOTO lbl25
        var4_7 = hb.fcxy("feha", fcys(int ), (int)554);
        if (var5_5) ** GOTO lbl25
        block46: while (true) {
            if (var5_5) ** GOTO lbl25
            if (var6_4 /* !! */  == 0) ** GOTO lbl-1000
            switch (var6_4 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var5_5) ** GOTO lbl25
                    while (true) {
                        if ((v7 /* !! */  = (cfr_temp_5 = hb.lq - hb.fcxy("fehb", fcxr(int ), (int)306)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v7 /* !! */  == hb.fcxy("fehc", fcys(int ), (int)555)) break;
                        v7 /* !! */  = (long)hb.fcxy("fehd", fcys(int ), (int)556);
                    }
                    if (var4_7 >= var3_6.size()) ** GOTO lbl102
                    if (var5_5 || var5_5) ** GOTO lbl25
                    v8 /* !! */  = hb.lq;
                    if (true) ** GOTO lbl75
                    block48: while (true) {
                        v8 /* !! */  = (long)(v9 - hb.fcxy("fehe", fcxr(int ), (int)307));
lbl75:
                        // 2 sources

                        switch ((int)v8 /* !! */ ) {
                            case 78723820: {
                                v9 = hb.fcxy("fehf", fcxr(int ), (int)308);
                                continue block48;
                            }
                            case 96162446: {
                                break block48;
                            }
                            case 1806921121: {
                                v9 = hb.fcxy("fehg", fcxr(int ), (int)309);
                                continue block48;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v10 /* !! */  = (cfr_temp_6 = hb.lq - hb.fcxy("fehh", fcxr(int ), (int)310)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v10 /* !! */  == hb.fcxy("fehi", fcys(int ), (int)557)) break;
                        v10 /* !! */  = (long)hb.fcxy("fehj", fcys(int ), (int)558);
                    }
                    while (true) {
                        if ((v11 /* !! */  = (cfr_temp_7 = hb.lq - hb.fcxy("fehk", fcxr(int ), (int)311)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v11 /* !! */  == hb.fcxy("fehl", fcys(int ), (int)559)) break;
                        v11 /* !! */  = (long)hb.fcxy("fehm", fcys(int ), (int)560);
                    }
                    if (class_1799.method_7973((class_1799)var3_6.get((int)var4_7), (class_1799)var2_2.get((int)var4_7))) ** GOTO lbl97
                    if (var5_5 || var5_5) ** GOTO lbl25
                    return (boolean)hb.fcxy("fehn", fcys(int ), (int)561);
lbl97:
                    // 1 sources

                    if (var5_5 || var5_5) ** GOTO lbl25
                    ++var4_7;
                    if (var5_5) ** GOTO lbl25
                    if (!var7_3) continue block46;
                    throw null;
lbl102:
                    // 1 sources

                    if (!var5_5 && !var5_5) ** break;
                    ** continue;
                    return (boolean)hb.fcxy("feho", fcys(int ), (int)562);
                }
lbl105:
                // 5 sources

                case 0: {
                    var6_4 /* !! */  = (int)hb.fcxy("fehp", fcys(int ), (int)563);
                    if (var7_3) {
                        throw null;
                    }
                    ** GOTO lbl157
                }
lbl110:
                // 2 sources

                case 1: {
                    var6_4 /* !! */  = (int)hb.fcxy("fehq", fcys(int ), (int)564);
                    if (!var7_3) ** GOTO lbl105
                    throw null;
                }
                case 2: {
                    do {
                        var6_4 /* !! */  = (int)hb.fcxy("fehr", fcys(int ), (int)565);
                    } while (!var7_3);
                    throw null;
                }
lbl119:
                // 2 sources

                case 3: {
                    var6_4 /* !! */  = (int)hb.fcxy("fehs", fcys(int ), (int)566);
                    if (var7_3) {
                        throw null;
                    }
                    ** GOTO lbl134
                }
                case 4: {
                    var6_4 /* !! */  = (int)hb.fcxy("feht", fcys(int ), (int)567);
                    if (var7_3) {
                        throw null;
                    }
                    ** GOTO lbl139
                }
lbl129:
                // 5 sources

                case 5: {
                    var6_4 /* !! */  = (int)hb.fcxy("fehu", fcys(int ), (int)568);
                    if (var7_3) {
                        throw null;
                    }
                    ** GOTO lbl144
                }
lbl134:
                // 2 sources

                case 6: {
                    var6_4 /* !! */  = (int)hb.fcxy("fehv", fcys(int ), (int)569);
                    if (var7_3) {
                        throw null;
                    }
                    ** GOTO lbl144
                }
lbl139:
                // 3 sources

                case 7: {
                    var6_4 /* !! */  = (int)hb.fcxy("fehw", fcys(int ), (int)570);
                    if (var7_3) {
                        throw null;
                    }
                    ** GOTO lbl217
                }
lbl144:
                // 3 sources

                case 8: {
                    var6_4 /* !! */  = (int)hb.fcxy("fehx", fcys(int ), (int)571);
                    if (!var7_3) ** GOTO lbl139
                    throw null;
                }
lbl148:
                // 2 sources

                case 9: {
                    var6_4 /* !! */  = (int)hb.fcxy("fehy", fcys(int ), (int)572);
                    if (var7_3) {
                        throw null;
                    }
                    ** GOTO lbl209
                }
                case 10: {
                    var6_4 /* !! */  = (int)hb.fcxy("fehz", fcys(int ), (int)573);
                    if (!var7_3) ** GOTO lbl110
                    throw null;
                }
lbl157:
                // 3 sources

                case 11: {
                    do {
                        var6_4 /* !! */  = (int)hb.fcxy("feia", fcys(int ), (int)574);
                    } while (!var7_3);
                    throw null;
                }
                case 12: {
                    var6_4 /* !! */  = (int)hb.fcxy("feib", fcys(int ), (int)575);
                    if (!var7_3) ** GOTO lbl129
                    throw null;
                }
lbl166:
                // 2 sources

                case 13: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var6_4 /* !! */  = (int)hb.fcxy("feic", fcys(int ), (int)576);
                        if (!var7_3) ** GOTO lbl148
                        throw null;
                    }
                }
                case 14: {
                    var6_4 /* !! */  = (int)hb.fcxy("feid", fcys(int ), (int)577);
                    if (!var7_3) break block46;
                    throw null;
                }
                case 15: {
                    var6_4 /* !! */  = (int)hb.fcxy("feie", fcys(int ), (int)578);
                    if (!var7_3) ** GOTO lbl157
                    throw null;
                }
                case 16: {
                    var6_4 /* !! */  = (int)hb.fcxy("feif", fcys(int ), (int)579);
                    if (!var7_3) ** GOTO lbl105
                    throw null;
                }
                case 17: {
                    var6_4 /* !! */  = (int)hb.fcxy("feig", fcys(int ), (int)580);
                    if (!var7_3) ** GOTO lbl129
                    throw null;
                }
                case 18: {
                    var6_4 /* !! */  = (int)hb.fcxy("feih", fcys(int ), (int)581);
                    if (var7_3) {
                        throw null;
                    }
                    ** GOTO lbl201
                }
                case 19: {
                    var6_4 /* !! */  = (int)hb.fcxy("feii", fcys(int ), (int)582);
                    if (!var7_3) ** GOTO lbl166
                    throw null;
                }
                case 20: {
                    var6_4 /* !! */  = (int)hb.fcxy("feij", fcys(int ), (int)583);
                    if (var7_3) {
                        throw null;
                    }
                    ** GOTO lbl209
                }
lbl201:
                // 3 sources

                case 21: {
                    var6_4 /* !! */  = (int)hb.fcxy("feik", fcys(int ), (int)584);
                    if (!var7_3) ** GOTO lbl129
                    throw null;
                }
                case 22: {
                    var6_4 /* !! */  = (int)hb.fcxy("feil", fcys(int ), (int)585);
                    if (!var7_3) ** GOTO lbl129
                    throw null;
                }
lbl209:
                // 3 sources

                case 23: {
                    var6_4 /* !! */  = (int)hb.fcxy("feim", fcys(int ), (int)586);
                    if (!var7_3) ** GOTO lbl201
                    throw null;
                }
                case 24: {
                    var6_4 /* !! */  = (int)hb.fcxy("fein", fcys(int ), (int)587);
                    if (!var7_3) ** GOTO lbl105
                    throw null;
                }
lbl217:
                // 2 sources

                case 25: {
                    var6_4 /* !! */  = (int)hb.fcxy("feio", fcys(int ), (int)588);
                    if (!var7_3) ** GOTO lbl119
                    throw null;
                }
                case 26: {
                    var6_4 /* !! */  = (int)hb.fcxy("feip", fcys(int ), (int)589);
                    if (!var7_3) ** GOTO lbl105
                    throw null;
                }
                case 27: 
            }
            break;
        }
        var6_4 /* !! */  = (int)hb.fcxy("feiq", fcys(int ), (int)590);
        ** while (!var7_3)
lbl228:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$isDuplicateProfile$4(GameProfile var0, class_640 var1_1) {
        v0 /* !! */  = hb.lq;
        if (true) ** GOTO lbl5
        block52: while (true) {
            v0 /* !! */  = (long)(v1 - hb.fcxy("feqf", fcxr(int ), (int)394));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1570414214: {
                    v1 = hb.fcxy("feqg", fcxr(int ), (int)395);
                    continue block52;
                }
                case 96162446: {
                    break block52;
                }
                case 475570216: {
                    v1 = hb.fcxy("feqh", fcxr(int ), (int)396);
                    continue block52;
                }
            }
            break;
        }
        var4_2 = hb.c;
        v2 /* !! */  = hb.lq;
        if (true) ** GOTO lbl19
        block53: while (true) {
            v2 /* !! */  = (long)(hb.fcxy("feqj", fcxr(int ), (int)398) - hb.fcxy("feqi", fcxr(int ), (int)397));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -755291013: {
                    continue block53;
                }
                case 96162446: {
                    break block53;
                }
            }
            break;
        }
        var3_3 /* !! */  = hb.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = hb.lq - hb.fcxy("feqk", fcxr(int ), (int)399)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == hb.fcxy("feql", fcys(int ), (int)705)) break;
            v3 /* !! */  = (long)hb.fcxy("feqm", fcys(int ), (int)706);
        }
        var2_4 = hb.a;
        if (var4_2) {
            throw null;
lbl33:
            // 4 sources

            return (boolean)hb.fcxy("feqn", fcys(int ), (int)707);
        }
        if (var2_4 || var2_4) ** GOTO lbl33
        v4 /* !! */  = hb.lq;
        if (true) ** GOTO lbl40
        block56: while (true) {
            v4 /* !! */  = (long)(v5 - hb.fcxy("feqo", fcxr(int ), (int)400));
lbl40:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -814487909: {
                    v5 = hb.fcxy("feqp", fcxr(int ), (int)401);
                    continue block56;
                }
                case 96162446: {
                    break block56;
                }
                case 836429879: {
                    v5 = hb.fcxy("feqq", fcxr(int ), (int)402);
                    continue block56;
                }
            }
            break;
        }
        v6 = var1_1.method_2966();
        v7 /* !! */  = hb.lq;
        if (true) ** GOTO lbl54
        block57: while (true) {
            v7 /* !! */  = (long)(v8 - hb.fcxy("feqr", fcxr(int ), (int)403));
lbl54:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -2067513824: {
                    v8 = hb.fcxy("feqs", fcxr(int ), (int)404);
                    continue block57;
                }
                case -1046469912: {
                    v8 = hb.fcxy("feqt", fcxr(int ), (int)405);
                    continue block57;
                }
                case 96162446: {
                    break block57;
                }
                case 637735007: {
                    v8 = hb.fcxy("fequ", fcxr(int ), (int)406);
                    continue block57;
                }
            }
            break;
        }
        v9 = v6.name();
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_1 = hb.lq - hb.fcxy("feqv", fcxr(int ), (int)407)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == hb.fcxy("feqw", fcys(int ), (int)708)) break;
            v10 /* !! */  = (long)hb.fcxy("feqx", fcys(int ), (int)709);
        }
        v11 = var0.name();
        v12 /* !! */  = hb.lq;
        if (true) ** GOTO lbl77
        block59: while (true) {
            v12 /* !! */  = (long)(hb.fcxy("feqz", fcxr(int ), (int)409) - hb.fcxy("feqy", fcxr(int ), (int)408));
lbl77:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -510433178: {
                    continue block59;
                }
                case 96162446: {
                    break block59;
                }
            }
            break;
        }
        if (!v9.equals(v11)) ** GOTO lbl146
        if (var2_4) ** GOTO lbl33
        v13 /* !! */  = hb.lq;
        if (true) ** GOTO lbl88
        block60: while (true) {
            v13 /* !! */  = (long)(v14 - hb.fcxy("fera", fcxr(int ), (int)410));
lbl88:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -1346785163: {
                    v14 = hb.fcxy("ferb", fcxr(int ), (int)411);
                    continue block60;
                }
                case -395502953: {
                    v14 = hb.fcxy("ferc", fcxr(int ), (int)412);
                    continue block60;
                }
                case 96162446: {
                    break block60;
                }
                case 1615197575: {
                    v14 = hb.fcxy("ferd", fcxr(int ), (int)413);
                    continue block60;
                }
            }
            break;
        }
        v15 = var1_1.method_2966();
        v16 /* !! */  = hb.lq;
        if (true) ** GOTO lbl105
        block61: while (true) {
            v16 /* !! */  = (long)(v17 - hb.fcxy("fere", fcxr(int ), (int)414));
lbl105:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case -1521894739: {
                    v17 = hb.fcxy("ferf", fcxr(int ), (int)415);
                    continue block61;
                }
                case 96162446: {
                    break block61;
                }
                case 805523794: {
                    v17 = hb.fcxy("ferg", fcxr(int ), (int)416);
                    continue block61;
                }
            }
            break;
        }
        v18 = v15.id();
        while (true) {
            if ((v19 /* !! */  = (cfr_temp_2 = hb.lq - hb.fcxy("ferh", fcxr(int ), (int)417)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v19 /* !! */  == hb.fcxy("feri", fcys(int ), (int)710)) break;
            v19 /* !! */  = (long)hb.fcxy("ferj", fcys(int ), (int)711);
        }
        v20 = var0.id();
        v21 /* !! */  = hb.lq;
        if (true) ** GOTO lbl125
        block63: while (true) {
            v21 /* !! */  = (long)(v22 - hb.fcxy("ferk", fcxr(int ), (int)418));
lbl125:
            // 2 sources

            switch ((int)v21 /* !! */ ) {
                case -262980132: {
                    v22 = hb.fcxy("ferl", fcxr(int ), (int)419);
                    continue block63;
                }
                case 96162446: {
                    break block63;
                }
                case 1152713291: {
                    v22 = hb.fcxy("ferm", fcxr(int ), (int)420);
                    continue block63;
                }
                case 1258748513: {
                    v22 = hb.fcxy("fern", fcxr(int ), (int)421);
                    continue block63;
                }
            }
            break;
        }
        if (v18.equals(v20)) ** GOTO lbl146
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl33
                v23 = hb.fcxy("fero", fcys(int ), (int)712);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl146:
            // 2 sources

            if (!var2_4 && !var2_4) ** break;
            ** continue;
            v23 = hb.fcxy("ferp", fcys(int ), (int)713);
lbl149:
            // 2 sources

            return (boolean)v23;
            case 0: {
                var3_3 /* !! */  = (int)hb.fcxy("ferq", fcys(int ), (int)714);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl169
            }
lbl155:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)hb.fcxy("ferr", fcys(int ), (int)715);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl178
            }
            case 2: {
                var3_3 /* !! */  = (int)hb.fcxy("fers", fcys(int ), (int)716);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl182
            }
lbl165:
            // 3 sources

            case 3: {
                var3_3 /* !! */  = (int)hb.fcxy("fert", fcys(int ), (int)717);
                if (!var4_2) ** GOTO lbl155
                throw null;
            }
lbl169:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)hb.fcxy("feru", fcys(int ), (int)718);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl182
            }
            case 5: {
                var3_3 /* !! */  = (int)hb.fcxy("ferv", fcys(int ), (int)719);
                if (!var4_2) ** GOTO lbl165
                throw null;
            }
lbl178:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)hb.fcxy("ferw", fcys(int ), (int)720);
                if (!var4_2) ** GOTO lbl165
                throw null;
            }
lbl182:
            // 3 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)hb.fcxy("ferx", fcys(int ), (int)721);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 8: 
        }
        var3_3 /* !! */  = (int)hb.fcxy("fery", fcys(int ), (int)722);
        ** while (!var4_2)
lbl190:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fexn() {
        hb.fcyu[700] = -202509339;
        hb.fcyu[701] = 1751965491;
        hb.fcyu[702] = -1535508666;
        hb.fcyu[703] = 1490204732;
        hb.fcyu[704] = -13967432;
        hb.fcyu[705] = -1452602106;
        hb.fcyu[706] = -1085264413;
        hb.fcyu[707] = 627932791;
        hb.fcyu[708] = 1766170189;
        hb.fcyu[709] = -1205669026;
        hb.fcyu[710] = 1028141114;
        hb.fcyu[711] = -1009780674;
        hb.fcyu[712] = 1701911387;
        hb.fcyu[713] = -525044637;
        hb.fcyu[714] = 1866618361;
        hb.fcyu[715] = -1675783955;
        hb.fcyu[716] = -201873306;
        hb.fcyu[717] = 523416538;
        hb.fcyu[718] = 1073446178;
        hb.fcyu[719] = 2014997943;
        hb.fcyu[720] = -1929544356;
        hb.fcyu[721] = 528676171;
        hb.fcyu[722] = 1863764348;
        hb.fcyu[723] = 2064194297;
        hb.fcyu[724] = -1646617443;
        hb.fcyu[725] = -271556267;
        hb.fcyu[726] = 1292886722;
        hb.fcyu[727] = 842946426;
        hb.fcyu[728] = 1824513632;
        hb.fcyu[729] = 2131132328;
        hb.fcyu[730] = -250818352;
        hb.fcyu[731] = -1863074430;
        hb.fcyu[732] = 2103650355;
        hb.fcyu[733] = -1003836862;
        hb.fcyu[734] = -816817883;
        hb.fcyu[735] = -272756622;
        hb.fcyu[736] = 449864579;
        hb.fcyu[737] = -945160737;
        hb.fcyu[738] = -157123462;
        hb.fcyu[739] = 169679271;
        hb.fcyu[740] = 326338244;
        hb.fcyu[741] = 615598326;
        hb.fcyu[742] = -1946756680;
        hb.fcyu[743] = -826611621;
        hb.fcyu[744] = 847089602;
        hb.fcyu[745] = 425575265;
        hb.fcyu[746] = 426484030;
        hb.fcyu[747] = -52997814;
        hb.fcyu[748] = -1439840205;
        hb.fcyu[749] = 148528818;
        hb.fcyu[750] = 280224419;
        hb.fcyu[751] = 277089037;
        hb.fcyu[752] = -592222938;
        hb.fcyu[753] = 548795512;
        hb.fcyu[754] = -1773807496;
        hb.fcyu[755] = 1201799176;
        hb.fcyu[756] = 490022654;
        hb.fcyu[757] = 948863058;
        hb.fcyu[758] = -1110472784;
        hb.fcyu[759] = 994460457;
        hb.fcyu[760] = 36806258;
        hb.fcyu[761] = 364158070;
        hb.fcyu[762] = -961347311;
        hb.fcyu[763] = -453675696;
        hb.fcyu[764] = 1223118812;
        hb.fcyu[765] = -256544700;
        hb.fcyu[766] = -1234769590;
        hb.fcyu[767] = -955797198;
        hb.fcyu[768] = -1147726101;
        hb.fcyu[769] = -710504353;
        hb.fcyu[770] = 836194827;
        hb.fcyu[771] = 1312941141;
        hb.fcyu[772] = -1112983054;
        hb.fcyu[773] = -1291189225;
        hb.fcyu[774] = -2056696966;
        hb.fcyu[775] = -1859512241;
        hb.fcyu[776] = -524370922;
        hb.fcyu[777] = -709067672;
        hb.fcyu[778] = 1400808573;
        hb.fcyu[779] = -2100464791;
        hb.fcyu[780] = 936130574;
        hb.fcyu[781] = 400588648;
        hb.fcyu[782] = -106528883;
        hb.fcyu[783] = -1966329036;
        hb.fcyu[784] = 1499313404;
        hb.fcyu[785] = -1613215405;
        hb.fcyu[786] = -365381868;
        hb.fcyu[787] = 779001274;
        hb.fcyu[788] = 47688374;
        hb.fcyu[789] = 1507386246;
        hb.fcyu[790] = -876874015;
        hb.fcyu[791] = 208584820;
        hb.fcyu[792] = -2025975320;
        hb.fcyu[793] = 1652028595;
        hb.fcyu[794] = 281030059;
        hb.fcyu[795] = 1639377613;
        hb.fcyu[796] = 239331347;
        hb.fcyu[797] = -1289367670;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isArmorItem(class_1799 var1_1) {
        block100: {
            block99: {
                v0 /* !! */  = hb.lq;
                if (true) ** GOTO lbl5
                block65: while (true) {
                    v0 /* !! */  = (long)(v1 - hb.fcxy("fdpz", fcxr(int ), (int)185));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -284028108: {
                            v1 = hb.fcxy("fdqa", fcxr(int ), (int)186);
                            continue block65;
                        }
                        case 96162446: {
                            break block65;
                        }
                        case 1890729293: {
                            v1 = hb.fcxy("fdqb", fcxr(int ), (int)187);
                            continue block65;
                        }
                    }
                    break;
                }
                var6_2 = hb.c;
                v2 /* !! */  = hb.lq;
                if (true) ** GOTO lbl19
                block66: while (true) {
                    v2 /* !! */  = (long)(hb.fcxy("fdqd", fcxr(int ), (int)189) - hb.fcxy("fdqc", fcxr(int ), (int)188));
lbl19:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1923752419: {
                            continue block66;
                        }
                        case 96162446: {
                            break block66;
                        }
                    }
                    break;
                }
                var5_3 /* !! */  = hb.b;
                v3 /* !! */  = hb.lq;
                if (true) ** GOTO lbl29
                block67: while (true) {
                    v3 /* !! */  = (long)(hb.fcxy("fdqg", fcxr(int ), (int)191) - hb.fcxy("fdqe", fcxr(int ), (int)190));
lbl29:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -443672577: {
                            continue block67;
                        }
                        case 96162446: {
                            break block67;
                        }
                    }
                    break;
                }
                var4_4 = hb.a;
                if (var6_2) {
                    throw null;
lbl37:
                    // 14 sources

                    return (boolean)hb.fcxy("fdqh", fcys(int ), (int)234);
                }
                if (var4_4 || var4_4) ** GOTO lbl37
                v4 /* !! */  = hb.lq;
                if (true) ** GOTO lbl44
                block69: while (true) {
                    v4 /* !! */  = (long)(hb.fcxy("fdqj", fcxr(int ), (int)193) - hb.fcxy("fdqi", fcxr(int ), (int)192));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 96162446: {
                            break block69;
                        }
                        case 160067550: {
                            continue block69;
                        }
                    }
                    break;
                }
                if (!var1_1.method_7960()) break block99;
                if (var4_4) ** GOTO lbl37
                return (boolean)hb.fcxy("fdqk", fcys(int ), (int)235);
            }
            if (var4_4 || var4_4) ** GOTO lbl37
            v5 /* !! */  = hb.lq;
            if (true) ** GOTO lbl58
            block70: while (true) {
                v5 /* !! */  = (long)(v6 - hb.fcxy("fdql", fcxr(int ), (int)194));
lbl58:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -879039571: {
                        v6 = hb.fcxy("fdqm", fcxr(int ), (int)195);
                        continue block70;
                    }
                    case -25190081: {
                        v6 = hb.fcxy("fdqn", fcxr(int ), (int)196);
                        continue block70;
                    }
                    case 96162446: {
                        break block70;
                    }
                    case 1426006430: {
                        v6 = hb.fcxy("fdqo", fcxr(int ), (int)197);
                        continue block70;
                    }
                }
                break;
            }
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_0 = hb.lq - hb.fcxy("fdqp", fcxr(int ), (int)198)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v7 /* !! */  == hb.fcxy("fdqq", fcys(int ), (int)236)) break;
                v7 /* !! */  = (long)hb.fcxy("fdqr", fcys(int ), (int)237);
            }
            var2_5 = (class_10192)var1_1.method_58694(class_9334.field_54196);
            if (var4_4 || var4_4) ** GOTO lbl37
            if (var2_5 != null) break block100;
            if (var4_4) ** GOTO lbl37
            return (boolean)hb.fcxy("fdqs", fcys(int ), (int)238);
        }
        if (var4_4) ** GOTO lbl37
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4) ** GOTO lbl37
                v8 /* !! */  = hb.lq;
                if (true) ** GOTO lbl91
                block72: while (true) {
                    v8 /* !! */  = (long)(v9 - hb.fcxy("fdqt", fcxr(int ), (int)199));
lbl91:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -116196056: {
                            v9 = hb.fcxy("fdqu", fcxr(int ), (int)200);
                            continue block72;
                        }
                        case 96162446: {
                            break block72;
                        }
                        case 1901011161: {
                            v9 = hb.fcxy("fdqw", fcxr(int ), (int)201);
                            continue block72;
                        }
                    }
                    break;
                }
                var3_6 = var2_5.comp_3174();
                if (var4_4 || var4_4) ** GOTO lbl37
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_1 = hb.lq - hb.fcxy("fdqx", fcxr(int ), (int)202)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v10 /* !! */  == hb.fcxy("fdqy", fcys(int ), (int)239)) break;
                    v10 /* !! */  = (long)hb.fcxy("fdqz", fcys(int ), (int)240);
                }
                if (var3_6 == class_1304.field_6169) ** GOTO lbl151
                if (var4_4) ** GOTO lbl37
                v11 /* !! */  = hb.lq;
                if (true) ** GOTO lbl114
                block74: while (true) {
                    v11 /* !! */  = (long)(v12 - hb.fcxy("fdra", fcxr(int ), (int)203));
lbl114:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1965844877: {
                            v12 = hb.fcxy("fdrb", fcxr(int ), (int)204);
                            continue block74;
                        }
                        case 96162446: {
                            break block74;
                        }
                        case 599659515: {
                            v12 = hb.fcxy("fdrc", fcxr(int ), (int)205);
                            continue block74;
                        }
                    }
                    break;
                }
                if (var3_6 == class_1304.field_6174) ** GOTO lbl151
                if (var4_4) ** GOTO lbl37
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_2 = hb.lq - hb.fcxy("fdrd", fcxr(int ), (int)206)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v13 /* !! */  == hb.fcxy("fdre", fcys(int ), (int)241)) break;
                    v13 /* !! */  = (long)hb.fcxy("fdrf", fcys(int ), (int)242);
                }
                if (var3_6 == class_1304.field_6172) ** GOTO lbl151
                if (var4_4) ** GOTO lbl37
                v14 /* !! */  = hb.lq;
                if (true) ** GOTO lbl137
                block76: while (true) {
                    v14 /* !! */  = (long)(v15 - hb.fcxy("fdrg", fcxr(int ), (int)207));
lbl137:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1367952621: {
                            v15 = hb.fcxy("fdrh", fcxr(int ), (int)208);
                            continue block76;
                        }
                        case -1085797050: {
                            v15 = hb.fcxy("fdri", fcxr(int ), (int)209);
                            continue block76;
                        }
                        case 96162446: {
                            break block76;
                        }
                        case 1001765420: {
                            v15 = hb.fcxy("fdrj", fcxr(int ), (int)210);
                            continue block76;
                        }
                    }
                    break;
                }
                if (var3_6 != class_1304.field_6166) ** GOTO lbl156
                if (var4_4) ** GOTO lbl37
lbl151:
                // 4 sources

                if (var4_4 || var4_4) ** GOTO lbl37
                v16 = hb.fcxy("fdrk", fcys(int ), (int)243);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl159
lbl156:
                // 1 sources

                if (!var4_4 && !var4_4) ** break;
                ** continue;
                v16 = hb.fcxy("fdrl", fcys(int ), (int)244);
lbl159:
                // 2 sources

                return (boolean)v16;
            }
lbl160:
            // 3 sources

            case 0: {
                var5_3 /* !! */  = (int)hb.fcxy("fdrm", fcys(int ), (int)245);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl193
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)hb.fcxy("fdrn", fcys(int ), (int)246);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl230
                    break;
                }
            }
lbl171:
            // 2 sources

            case 2: {
                var5_3 /* !! */  = (int)hb.fcxy("fdro", fcys(int ), (int)247);
                if (var6_2) {
                    throw null;
                }
            }
            case 3: {
                var5_3 /* !! */  = (int)hb.fcxy("fdrp", fcys(int ), (int)248);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl250
            }
            case 4: {
                var5_3 /* !! */  = (int)hb.fcxy("fdrq", fcys(int ), (int)249);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl193
            }
            case 5: {
                var5_3 /* !! */  = (int)hb.fcxy("fdrr", fcys(int ), (int)250);
                if (!var6_2) ** GOTO lbl171
                throw null;
            }
lbl189:
            // 6 sources

            case 6: {
                var5_3 /* !! */  = (int)hb.fcxy("fdrs", fcys(int ), (int)251);
                if (!var6_2) break;
                throw null;
            }
lbl193:
            // 3 sources

            case 7: {
                var5_3 /* !! */  = (int)hb.fcxy("fdrt", fcys(int ), (int)252);
                if (!var6_2) ** GOTO lbl189
                throw null;
            }
            case 8: {
                var5_3 /* !! */  = (int)hb.fcxy("fdru", fcys(int ), (int)253);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl210
            }
lbl202:
            // 2 sources

            case 9: {
                var5_3 /* !! */  = (int)hb.fcxy("fdrv", fcys(int ), (int)254);
                if (!var6_2) ** GOTO lbl189
                throw null;
            }
lbl206:
            // 2 sources

            case 10: {
                var5_3 /* !! */  = (int)hb.fcxy("fdrw", fcys(int ), (int)255);
                if (!var6_2) ** GOTO lbl202
                throw null;
            }
lbl210:
            // 3 sources

            case 11: {
                var5_3 /* !! */  = (int)hb.fcxy("fdrx", fcys(int ), (int)256);
                if (!var6_2) ** GOTO lbl189
                throw null;
            }
            case 12: {
                var5_3 /* !! */  = (int)hb.fcxy("fdry", fcys(int ), (int)257);
                if (!var6_2) ** GOTO lbl210
                throw null;
            }
lbl218:
            // 2 sources

            case 13: {
                var5_3 /* !! */  = (int)hb.fcxy("fdrz", fcys(int ), (int)258);
                if (!var6_2) ** GOTO lbl189
                throw null;
            }
lbl222:
            // 2 sources

            case 14: {
                var5_3 /* !! */  = (int)hb.fcxy("fdsa", fcys(int ), (int)259);
                if (!var6_2) break;
                throw null;
            }
            case 15: {
                var5_3 /* !! */  = (int)hb.fcxy("fdsb", fcys(int ), (int)260);
                if (!var6_2) ** GOTO lbl222
                throw null;
            }
lbl230:
            // 3 sources

            case 16: {
                var5_3 /* !! */  = (int)hb.fcxy("fdsc", fcys(int ), (int)261);
                if (!var6_2) ** GOTO lbl206
                throw null;
            }
            case 17: {
                var5_3 /* !! */  = (int)hb.fcxy("fdsd", fcys(int ), (int)262);
                if (!var6_2) ** GOTO lbl160
                throw null;
            }
            case 18: {
                var5_3 /* !! */  = (int)hb.fcxy("fdse", fcys(int ), (int)263);
                if (!var6_2) ** GOTO lbl160
                throw null;
            }
            case 19: {
                var5_3 /* !! */  = (int)hb.fcxy("fdsf", fcys(int ), (int)264);
                if (!var6_2) ** GOTO lbl230
                throw null;
            }
            case 20: {
                var5_3 /* !! */  = (int)hb.fcxy("fdsg", fcys(int ), (int)265);
                if (!var6_2) ** GOTO lbl189
                throw null;
            }
lbl250:
            // 2 sources

            case 21: {
                var5_3 /* !! */  = (int)hb.fcxy("fdsh", fcys(int ), (int)266);
                if (var6_2) {
                    throw null;
                }
            }
            case 22: {
                var5_3 /* !! */  = (int)hb.fcxy("fdsi", fcys(int ), (int)267);
                if (!var6_2) ** GOTO lbl218
                throw null;
            }
            case 23: 
        }
        var5_3 /* !! */  = (int)hb.fcxy("fdsj", fcys(int ), (int)268);
        ** while (!var6_2)
lbl261:
        // 1 sources

        throw null;
    }

    /*
     * Exception decompiling
     */
    @aw
    public void onPacket(cr var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [29[CASE]], but top level block is 32[SWITCH]
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
    private void removeDetectedBots() {
        block75: {
            block77: {
                block76: {
                    while (true) {
                        if ((v0 /* !! */  = (cfr_temp_0 = hb.lq - hb.fcxy("fddn", fcxr(int ), (int)35)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                        if (v0 /* !! */  == hb.fcxy("fddo", fcys(int ), (int)79)) break;
                        v0 /* !! */  = (long)hb.fcxy("fddp", fcys(int ), (int)80);
                    }
                    var5_1 = hb.c;
                    v1 /* !! */  = hb.lq;
                    if (true) ** GOTO lbl11
                    block53: while (true) {
                        v1 /* !! */  = (long)(v2 - hb.fcxy("fddq", fcxr(int ), (int)36));
lbl11:
                        // 2 sources

                        switch ((int)v1 /* !! */ ) {
                            case 96162446: {
                                break block53;
                            }
                            case 283121134: {
                                v2 = hb.fcxy("fdds", fcxr(int ), (int)37);
                                continue block53;
                            }
                            case 442951415: {
                                v2 = hb.fcxy("fddt", fcxr(int ), (int)38);
                                continue block53;
                            }
                        }
                        break;
                    }
                    var4_2 = hb.b;
                    while (true) {
                        if ((v3 /* !! */  = (cfr_temp_1 = hb.lq - hb.fcxy("fddu", fcxr(int ), (int)39)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v3 /* !! */  == hb.fcxy("fddv", fcys(int ), (int)81)) break;
                        v3 /* !! */  = (long)hb.fcxy("fddw", fcys(int ), (int)82);
                    }
                    var3_3 = hb.a;
                    if (var5_1) {
                        throw null;
lbl29:
                        // 14 sources

                        return;
                    }
                    if (var3_3 || var3_3) ** GOTO lbl29
                    while (true) {
                        if ((v4 /* !! */  = (cfr_temp_2 = hb.lq - hb.fcxy("fddx", fcxr(int ), (int)40)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v4 /* !! */  == hb.fcxy("fddy", fcys(int ), (int)83)) break;
                        v4 /* !! */  = (long)hb.fcxy("fddz", fcys(int ), (int)84);
                    }
                    while (true) {
                        if ((v5 /* !! */  = (cfr_temp_3 = hb.lq - hb.fcxy("fdea", fcxr(int ), (int)41)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v5 /* !! */  == hb.fcxy("fdeb", fcys(int ), (int)85)) break;
                        v5 /* !! */  = (long)hb.fcxy("fdec", fcys(int ), (int)86);
                    }
                    if (!this.removeFromWorld.isValue()) break block76;
                    if (var3_3) ** GOTO lbl29
                    v6 /* !! */  = hb.lq;
                    if (true) ** GOTO lbl48
                    block58: while (true) {
                        v6 /* !! */  = (long)(hb.fcxy("fdee", fcxr(int ), (int)43) - hb.fcxy("fded", fcxr(int ), (int)42));
lbl48:
                        // 2 sources

                        switch ((int)v6 /* !! */ ) {
                            case 96162446: {
                                break block58;
                            }
                            case 947593802: {
                                continue block58;
                            }
                        }
                        break;
                    }
                    v7 /* !! */  = hb.lq;
                    if (true) ** GOTO lbl57
                    block59: while (true) {
                        v7 /* !! */  = (long)(v8 - hb.fcxy("fdef", fcxr(int ), (int)44));
lbl57:
                        // 2 sources

                        switch ((int)v7 /* !! */ ) {
                            case -1681201795: {
                                v8 = hb.fcxy("fdeg", fcxr(int ), (int)45);
                                continue block59;
                            }
                            case 96162446: {
                                break block59;
                            }
                            case 1902438455: {
                                v8 = hb.fcxy("fdeh", fcxr(int ), (int)46);
                                continue block59;
                            }
                        }
                        break;
                    }
                    if (!hb.botSet.isEmpty()) break block77;
                    if (var3_3) ** GOTO lbl29
                }
                if (var3_3 || var3_3) ** GOTO lbl29
                return;
            }
            if (var3_3 || var3_3) ** GOTO lbl29
            v9 /* !! */  = hb.lq;
            if (true) ** GOTO lbl77
            block60: while (true) {
                v9 /* !! */  = (long)(v10 - hb.fcxy("fdei", fcxr(int ), (int)47));
lbl77:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -1829254198: {
                        v10 = hb.fcxy("fdej", fcxr(int ), (int)48);
                        continue block60;
                    }
                    case -1799845538: {
                        v10 = hb.fcxy("fdek", fcxr(int ), (int)49);
                        continue block60;
                    }
                    case 96162446: {
                        break block60;
                    }
                    case 1725762991: {
                        v10 = hb.fcxy("fdel", fcxr(int ), (int)50);
                        continue block60;
                    }
                }
                break;
            }
            v11 /* !! */  = hb.lq;
            if (true) ** GOTO lbl93
            block61: while (true) {
                v11 /* !! */  = (long)(hb.fcxy("fdeo", fcxr(int ), (int)52) - hb.fcxy("fden", fcxr(int ), (int)51));
lbl93:
                // 2 sources

                switch ((int)v11 /* !! */ ) {
                    case -809885120: {
                        continue block61;
                    }
                    case 96162446: {
                        break block61;
                    }
                }
                break;
            }
            v12 = hb.mc.field_1687;
            while (true) {
                if ((v13 /* !! */  = (cfr_temp_4 = hb.lq - hb.fcxy("fdep", fcxr(int ), (int)53)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v13 /* !! */  == hb.fcxy("fdeq", fcys(int ), (int)87)) break;
                v13 /* !! */  = (long)hb.fcxy("fder", fcys(int ), (int)88);
            }
            v14 = v12.method_18456();
            v15 /* !! */  = hb.lq;
            if (true) ** GOTO lbl109
            block63: while (true) {
                v15 /* !! */  = (long)(v16 - hb.fcxy("fdes", fcxr(int ), (int)54));
lbl109:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case -1315309493: {
                        v16 = hb.fcxy("fdet", fcxr(int ), (int)55);
                        continue block63;
                    }
                    case 96162446: {
                        break block63;
                    }
                    case 140118679: {
                        v16 = hb.fcxy("fdeu", fcxr(int ), (int)56);
                        continue block63;
                    }
                }
                break;
            }
            v17 = List.copyOf(v14);
            while (true) {
                if ((v18 /* !! */  = (cfr_temp_5 = hb.lq - hb.fcxy("fdev", fcxr(int ), (int)57)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v18 /* !! */  == hb.fcxy("fdew", fcys(int ), (int)89)) break;
                v18 /* !! */  = (long)hb.fcxy("fdex", fcys(int ), (int)90);
            }
            var1_4 = v17.iterator();
            if (var3_3) ** GOTO lbl29
            do {
                block78: {
                    if (var3_3 || var3_3) ** GOTO lbl29
                    v19 /* !! */  = hb.lq;
                    if (true) ** GOTO lbl132
                    block66: while (true) {
                        v19 /* !! */  = (long)(hb.fcxy("fdez", fcxr(int ), (int)59) - hb.fcxy("fdey", fcxr(int ), (int)58));
lbl132:
                        // 2 sources

                        switch ((int)v19 /* !! */ ) {
                            case -2092927257: {
                                continue block66;
                            }
                            case 96162446: {
                                break block66;
                            }
                        }
                        break;
                    }
                    if (!var1_4.hasNext()) break block75;
                    if (var3_3) ** GOTO lbl29
                    v20 /* !! */  = hb.lq;
                    if (true) ** GOTO lbl143
                    block67: while (true) {
                        v20 /* !! */  = (long)(v21 - hb.fcxy("fdfa", fcxr(int ), (int)60));
lbl143:
                        // 2 sources

                        switch ((int)v20 /* !! */ ) {
                            case 96162446: {
                                break block67;
                            }
                            case 348699165: {
                                v21 = hb.fcxy("fdfb", fcxr(int ), (int)61);
                                continue block67;
                            }
                            case 896676177: {
                                v21 = hb.fcxy("fdfc", fcxr(int ), (int)62);
                                continue block67;
                            }
                        }
                        break;
                    }
                    var2_5 = (class_1657)var1_4.next();
                    if (var3_3 || var3_3) ** GOTO lbl29
                    v22 /* !! */  = hb.lq;
                    if (true) ** GOTO lbl158
                    block68: while (true) {
                        v22 /* !! */  = (long)(hb.fcxy("fdfe", fcxr(int ), (int)64) - hb.fcxy("fdfd", fcxr(int ), (int)63));
lbl158:
                        // 2 sources

                        switch ((int)v22 /* !! */ ) {
                            case -717545667: {
                                continue block68;
                            }
                            case 96162446: {
                                break block68;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v23 /* !! */  = (cfr_temp_6 = hb.lq - hb.fcxy("fdff", fcxr(int ), (int)65)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v23 /* !! */  == hb.fcxy("fdfg", fcys(int ), (int)91)) break;
                        v23 /* !! */  = (long)hb.fcxy("fdfi", fcys(int ), (int)92);
                    }
                    if (var2_5 == hb.mc.field_1724) break block78;
                    if (var3_3) ** GOTO lbl29
                    v24 /* !! */  = hb.lq;
                    if (true) ** GOTO lbl174
                    block70: while (true) {
                        v24 /* !! */  = (long)(v25 - hb.fcxy("fdfj", fcxr(int ), (int)66));
lbl174:
                        // 2 sources

                        switch ((int)v24 /* !! */ ) {
                            case -1950584986: {
                                v25 = hb.fcxy("fdfk", fcxr(int ), (int)67);
                                continue block70;
                            }
                            case -1866344673: {
                                v25 = hb.fcxy("fdfl", fcxr(int ), (int)68);
                                continue block70;
                            }
                            case 96162446: {
                                break block70;
                            }
                            case 477574832: {
                                v25 = hb.fcxy("fdfm", fcxr(int ), (int)69);
                                continue block70;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v26 /* !! */  = (cfr_temp_7 = hb.lq - hb.fcxy("fdfn", fcxr(int ), (int)70)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v26 /* !! */  == hb.fcxy("fdfo", fcys(int ), (int)93)) break;
                        v26 /* !! */  = (long)hb.fcxy("fdfp", fcys(int ), (int)94);
                    }
                    v27 = var2_5.method_5667();
                    while (true) {
                        if ((v28 /* !! */  = (cfr_temp_8 = hb.lq - hb.fcxy("fdfq", fcxr(int ), (int)71)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                        if (v28 /* !! */  == hb.fcxy("fdfr", fcys(int ), (int)95)) break;
                        v28 /* !! */  = (long)hb.fcxy("fdfs", fcys(int ), (int)96);
                    }
                    if (!hb.botSet.contains(v27)) break block78;
                    if (var3_3 || var3_3) ** GOTO lbl29
                    v29 /* !! */  = hb.lq;
                    if (true) ** GOTO lbl203
                    block73: while (true) {
                        v29 /* !! */  = (long)(hb.fcxy("fdfv", fcxr(int ), (int)73) - hb.fcxy("fdft", fcxr(int ), (int)72));
lbl203:
                        // 2 sources

                        switch ((int)v29 /* !! */ ) {
                            case 96162446: {
                                break block73;
                            }
                            case 325887796: {
                                continue block73;
                            }
                        }
                        break;
                    }
                    var2_5.method_31472();
                    if (var3_3) ** GOTO lbl29
                }
                if (var3_3 || var3_3) ** GOTO lbl29
            } while (!var5_1);
            throw null;
        }
        if (!var3_3 && !var3_3) ** break;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isBot(UUID var1_1) {
        v0 /* !! */  = hb.lq;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - hb.fcxy("felc", fcxr(int ), (int)334));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1505737837: {
                    v1 = hb.fcxy("feld", fcxr(int ), (int)335);
                    continue block17;
                }
                case 96162446: {
                    break block17;
                }
                case 1798097917: {
                    v1 = hb.fcxy("fele", fcxr(int ), (int)336);
                    continue block17;
                }
            }
            break;
        }
        var4_2 = hb.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hb.lq - hb.fcxy("felf", fcxr(int ), (int)337)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hb.fcxy("felg", fcys(int ), (int)632)) break;
            v2 /* !! */  = (long)hb.fcxy("felh", fcys(int ), (int)633);
        }
        var3_3 /* !! */  = hb.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = hb.lq - hb.fcxy("feli", fcxr(int ), (int)338)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == hb.fcxy("felj", fcys(int ), (int)634)) break;
            v3 /* !! */  = (long)hb.fcxy("felk", fcys(int ), (int)635);
        }
        var2_4 = hb.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
                    return (boolean)hb.fcxy("fell", fcys(int ), (int)636);
                }
                if (var2_4 || var2_4) ** continue;
                v4 /* !! */  = hb.lq;
                if (true) ** GOTO lbl41
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - hb.fcxy("felm", fcxr(int ), (int)339));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1272185041: {
                            v5 = hb.fcxy("feln", fcxr(int ), (int)340);
                            continue block21;
                        }
                        case -148634351: {
                            v5 = hb.fcxy("felo", fcxr(int ), (int)341);
                            continue block21;
                        }
                        case -96658161: {
                            v5 = hb.fcxy("felp", fcxr(int ), (int)342);
                            continue block21;
                        }
                        case 96162446: {
                            break block21;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = hb.lq - hb.fcxy("felq", fcxr(int ), (int)343)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == hb.fcxy("felr", fcys(int ), (int)637)) break;
                    v6 /* !! */  = (long)hb.fcxy("fels", fcys(int ), (int)638);
                }
                return hb.botSet.contains(var1_1);
            }
            case 0: {
                var3_3 /* !! */  = (int)hb.fcxy("felt", fcys(int ), (int)639);
                if (!var4_2) break;
                throw null;
            }
lbl64:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)hb.fcxy("felu", fcys(int ), (int)640);
                if (!var4_2) break;
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)hb.fcxy("felv", fcys(int ), (int)641);
                if (!var4_2) ** GOTO lbl64
                throw null;
            }
            case 3: 
        }
        do {
            var3_3 /* !! */  = (int)hb.fcxy("felw", fcys(int ), (int)642);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void fexo() {
        hb.fcyv[0] = 1459597714;
        hb.fcyv[1] = -819380666;
        hb.fcyv[2] = 406320905;
        hb.fcyv[3] = -1359862839;
        hb.fcyv[4] = 37109060;
        hb.fcyv[5] = -1941065680;
        hb.fcyv[6] = -711713851;
        hb.fcyv[7] = 1939397089;
        hb.fcyv[8] = 1326447165;
        hb.fcyv[9] = -821223204;
        hb.fcyv[10] = 1857484429;
        hb.fcyv[11] = -234255745;
        hb.fcyv[12] = 2088442165;
        hb.fcyv[13] = 243889793;
        hb.fcyv[14] = 1740220473;
        hb.fcyv[15] = 1554093738;
        hb.fcyv[16] = 1511645762;
        hb.fcyv[17] = 324891347;
        hb.fcyv[18] = -1685245827;
        hb.fcyv[19] = 452488957;
        hb.fcyv[20] = 1736553335;
        hb.fcyv[21] = -1209622400;
        hb.fcyv[22] = 1827284412;
        hb.fcyv[23] = 1574224161;
        hb.fcyv[24] = 1143708452;
        hb.fcyv[25] = -1974044188;
        hb.fcyv[26] = -1451338282;
        hb.fcyv[27] = 1884107834;
        hb.fcyv[28] = 1745823738;
        hb.fcyv[29] = -122419085;
        hb.fcyv[30] = 1653444574;
        hb.fcyv[31] = 1555102360;
        hb.fcyv[32] = 2038074568;
        hb.fcyv[33] = -1920763307;
        hb.fcyv[34] = 1956268045;
        hb.fcyv[35] = -885911837;
        hb.fcyv[36] = 215559461;
        hb.fcyv[37] = 1891157511;
        hb.fcyv[38] = -306201387;
        hb.fcyv[39] = 436663718;
        hb.fcyv[40] = 480221860;
        hb.fcyv[41] = 10432898;
        hb.fcyv[42] = -119482059;
        hb.fcyv[43] = 489198353;
        hb.fcyv[44] = 1138602309;
        hb.fcyv[45] = -628119653;
        hb.fcyv[46] = -734894002;
        hb.fcyv[47] = 636557562;
        hb.fcyv[48] = -1435400403;
        hb.fcyv[49] = 1106018220;
        hb.fcyv[50] = 586968631;
        hb.fcyv[51] = 1135431973;
        hb.fcyv[52] = 2051875737;
        hb.fcyv[53] = -232809612;
        hb.fcyv[54] = -338183668;
        hb.fcyv[55] = -679360572;
        hb.fcyv[56] = 1709977872;
        hb.fcyv[57] = 2093088571;
        hb.fcyv[58] = -1150679731;
        hb.fcyv[59] = 471439936;
        hb.fcyv[60] = 271982296;
        hb.fcyv[61] = 501368890;
        hb.fcyv[62] = 821310564;
        hb.fcyv[63] = -1397952967;
        hb.fcyv[64] = -1998821974;
        hb.fcyv[65] = -808344264;
        hb.fcyv[66] = 53185671;
        hb.fcyv[67] = 860443851;
        hb.fcyv[68] = 84665256;
        hb.fcyv[69] = -1540016776;
        hb.fcyv[70] = -1173359936;
        hb.fcyv[71] = -2077843949;
        hb.fcyv[72] = 776176526;
        hb.fcyv[73] = 1804857810;
        hb.fcyv[74] = -1426159543;
        hb.fcyv[75] = -1619599119;
        hb.fcyv[76] = -275668184;
        hb.fcyv[77] = 1299678239;
        hb.fcyv[78] = -2006894563;
        hb.fcyv[79] = -1816612646;
        hb.fcyv[80] = 860948939;
        hb.fcyv[81] = -83944820;
        hb.fcyv[82] = 1377761258;
        hb.fcyv[83] = 2005819506;
        hb.fcyv[84] = 517184830;
        hb.fcyv[85] = -1728130644;
        hb.fcyv[86] = 965582890;
        hb.fcyv[87] = 1855884132;
        hb.fcyv[88] = 306557877;
        hb.fcyv[89] = -225737232;
        hb.fcyv[90] = -1547059489;
        hb.fcyv[91] = -553051753;
        hb.fcyv[92] = -1504104885;
        hb.fcyv[93] = -90481631;
        hb.fcyv[94] = -1665682955;
        hb.fcyv[95] = 1952283952;
        hb.fcyv[96] = -1686566313;
        hb.fcyv[97] = -1417101490;
        hb.fcyv[98] = 601327560;
        hb.fcyv[99] = 572173083;
    }

    public static /* synthetic */ CallSite fcxy(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    static {
        fcyu = new int[798];
        fcyv = new int[798];
        hb.fexg();
        hb.fexh();
        hb.fexi();
        hb.fexj();
        hb.fexk();
        hb.fexl();
        hb.fexm();
        hb.fexn();
        hb.fexo();
        hb.fexp();
        hb.fexq();
        hb.fexr();
        hb.fexs();
        hb.fext();
        hb.fexu();
        hb.fexv();
        fcxs = new long[484];
        fcxu = new long[484];
        hb.fexw();
        hb.fexx();
        hb.fexy();
        hb.fexz();
        hb.feya();
        hb.feyb();
        hb.feyc();
        hb.feyd();
        hb.feye();
        hb.feyf();
        botSet = new HashSet<UUID>();
        ARMOR_SLOTS = new class_1304[]{class_1304.field_6169, class_1304.field_6174, class_1304.field_6172, class_1304.field_6166};
    }

    private static /* synthetic */ void feyb() {
        hb.fcxu[0] = -7221781091359465219L;
        hb.fcxu[1] = -7230966749155886596L;
        hb.fcxu[2] = -8034553735257048211L;
        hb.fcxu[3] = -4662137397311987492L;
        hb.fcxu[4] = 2782809938370149929L;
        hb.fcxu[5] = -9156718520658795364L;
        hb.fcxu[6] = 5023864164052775174L;
        hb.fcxu[7] = -4411762944619116401L;
        hb.fcxu[8] = 8293984662383584798L;
        hb.fcxu[9] = 4795365214068093060L;
        hb.fcxu[10] = -6187356255886626352L;
        hb.fcxu[11] = -1259333619559808402L;
        hb.fcxu[12] = -5657711936262611190L;
        hb.fcxu[13] = -358599148951550342L;
        hb.fcxu[14] = 8891416484084803748L;
        hb.fcxu[15] = 3433087453121984380L;
        hb.fcxu[16] = 1827483024901235272L;
        hb.fcxu[17] = 7015674632930968450L;
        hb.fcxu[18] = 3831971643232768262L;
        hb.fcxu[19] = -6039896720907744775L;
        hb.fcxu[20] = 819425704608243530L;
        hb.fcxu[21] = -9188199608486416589L;
        hb.fcxu[22] = 3835201426045894487L;
        hb.fcxu[23] = -107952673218213197L;
        hb.fcxu[24] = -8421889928691790696L;
        hb.fcxu[25] = -6431512761998824757L;
        hb.fcxu[26] = 10203681395883177L;
        hb.fcxu[27] = 790277028357536112L;
        hb.fcxu[28] = 8317721897110924089L;
        hb.fcxu[29] = 866653725686862957L;
        hb.fcxu[30] = 5182060583731727323L;
        hb.fcxu[31] = -405798211843068959L;
        hb.fcxu[32] = -5887744291156797648L;
        hb.fcxu[33] = -5631874108300369255L;
        hb.fcxu[34] = -1070980447805965935L;
        hb.fcxu[35] = 8415181574284045571L;
        hb.fcxu[36] = 3386439877421996391L;
        hb.fcxu[37] = -1588021333977313908L;
        hb.fcxu[38] = 2761189721734335108L;
        hb.fcxu[39] = 2936147144705242520L;
        hb.fcxu[40] = 5830203680640774324L;
        hb.fcxu[41] = 2384834884383382031L;
        hb.fcxu[42] = 1441681049767875150L;
        hb.fcxu[43] = -1278816784302202475L;
        hb.fcxu[44] = 2554820651529246181L;
        hb.fcxu[45] = -7270878275911373292L;
        hb.fcxu[46] = 5859381314684691624L;
        hb.fcxu[47] = -1921366205428072033L;
        hb.fcxu[48] = 5052129628346060449L;
        hb.fcxu[49] = -3868048680394239353L;
        hb.fcxu[50] = -4360008127184225757L;
        hb.fcxu[51] = -5891473699645106265L;
        hb.fcxu[52] = -3350805609842985185L;
        hb.fcxu[53] = -8424790805227799079L;
        hb.fcxu[54] = -2129575858997624661L;
        hb.fcxu[55] = -4158022263943846386L;
        hb.fcxu[56] = 2882359619636681299L;
        hb.fcxu[57] = 1017721143107338088L;
        hb.fcxu[58] = -3332520098065023886L;
        hb.fcxu[59] = 6014824171094841008L;
        hb.fcxu[60] = -5290916403257940263L;
        hb.fcxu[61] = -7466579575000388568L;
        hb.fcxu[62] = 5553669005750590498L;
        hb.fcxu[63] = 916908807784399010L;
        hb.fcxu[64] = -840495204478030406L;
        hb.fcxu[65] = 3610959927034510498L;
        hb.fcxu[66] = 4127231395120541517L;
        hb.fcxu[67] = 1034813991626965072L;
        hb.fcxu[68] = 3765404878478971163L;
        hb.fcxu[69] = 6427729049576126955L;
        hb.fcxu[70] = -5763647144453931574L;
        hb.fcxu[71] = -3385091807541667435L;
        hb.fcxu[72] = 2832648910590875046L;
        hb.fcxu[73] = -10659160468042857L;
        hb.fcxu[74] = -1934256599816649074L;
        hb.fcxu[75] = -6686341744773504573L;
        hb.fcxu[76] = -6280916420904567810L;
        hb.fcxu[77] = 5912350708109025502L;
        hb.fcxu[78] = -5521005486835671816L;
        hb.fcxu[79] = -8758157222016314903L;
        hb.fcxu[80] = 9119724946021525472L;
        hb.fcxu[81] = 7948750813823180821L;
        hb.fcxu[82] = 51073617659237401L;
        hb.fcxu[83] = -2262544909851126746L;
        hb.fcxu[84] = 8762428111304099548L;
        hb.fcxu[85] = -7250863984549611763L;
        hb.fcxu[86] = 6788740232870558422L;
        hb.fcxu[87] = 3886769600116231754L;
        hb.fcxu[88] = 5187054622242444112L;
        hb.fcxu[89] = -1724169044304856971L;
        hb.fcxu[90] = -7518713911462905510L;
        hb.fcxu[91] = -3120871178006956262L;
        hb.fcxu[92] = 2492511182241710075L;
        hb.fcxu[93] = 7588010487168964367L;
        hb.fcxu[94] = 8909783379805365696L;
        hb.fcxu[95] = -3349578593589889046L;
        hb.fcxu[96] = -5673287826766465167L;
        hb.fcxu[97] = -3696786132137285002L;
        hb.fcxu[98] = 4858826958076514198L;
        hb.fcxu[99] = 8554890743885931993L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public hb() {
        var2_1 /* !! */  = hb.b;
        var1_2 = hb.a;
        super("AntiBot", "\u041d\u0435 \u0434\u0430\u0435\u0442 \u0430\u0443\u0440\u0430\u043c \u0431\u0438\u0442\u044c \u043f\u043e \u0431\u043e\u0442\u0443", du.RAGE);
        this.suspectSet = new HashSet<UUID>();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.mode = new kf("\u0420\u0435\u0436\u0438\u043c", "\u0412\u044b\u0431\u0435\u0440\u0438\u0442\u0435 \u0440\u0435\u0436\u0438\u043c \u043e\u0431\u043d\u0430\u0440\u0443\u0436\u0435\u043d\u0438\u044f \u0431\u043e\u0442\u043e\u0432", "ReallyWorld", new String[]{"Matrix", "ReallyWorld", "Divine"});
                this.removeFromWorld = new kb("\u0423\u0434\u0430\u043b\u0435\u043d\u0438\u0435 \u0438\u0437 \u043c\u0438\u0440\u0430", "\u0423\u0434\u0430\u043b\u044f\u0435\u0442 \u043e\u0431\u043d\u0430\u0440\u0443\u0436\u0435\u043d\u043d\u044b\u0445 \u0431\u043e\u0442\u043e\u0432 \u0438\u0437 \u043a\u043b\u0438\u0435\u043d\u0442\u0441\u043a\u043e\u0433\u043e \u043c\u0438\u0440\u0430");
                this.settings(new jx[]{this.mode, this.removeFromWorld});
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)hb.fcxy("fczg", fcys(int ), (int)4);
                break;
            }
lbl15:
            // 2 sources

            case 1: {
                var2_1 /* !! */  = (int)hb.fcxy("fczh", fcys(int ), (int)5);
                ** GOTO lbl24
            }
lbl18:
            // 2 sources

            case 2: {
                var2_1 /* !! */  = (int)hb.fcxy("fczi", fcys(int ), (int)6);
                ** GOTO lbl15
            }
lbl21:
            // 2 sources

            case 3: {
                var2_1 /* !! */  = (int)hb.fcxy("fczj", fcys(int ), (int)7);
                break;
            }
lbl24:
            // 2 sources

            case 4: {
                var2_1 /* !! */  = (int)hb.fcxy("fczk", fcys(int ), (int)8);
                ** GOTO lbl21
            }
            case 5: {
                var2_1 /* !! */  = (int)hb.fcxy("fczl", fcys(int ), (int)9);
                ** GOTO lbl18
            }
            case 6: 
        }
        while (true) {
            var2_1 /* !! */  = (int)hb.fcxy("fczm", fcys(int ), (int)10);
        }
    }

    private static /* synthetic */ void fexk() {
        hb.fcyu[400] = 1240505426;
        hb.fcyu[401] = -1926746398;
        hb.fcyu[402] = -962073643;
        hb.fcyu[403] = -1896244103;
        hb.fcyu[404] = -24136930;
        hb.fcyu[405] = 413974237;
        hb.fcyu[406] = -1553055425;
        hb.fcyu[407] = -454926237;
        hb.fcyu[408] = 1044487891;
        hb.fcyu[409] = -1452780807;
        hb.fcyu[410] = 1241353646;
        hb.fcyu[411] = 474070791;
        hb.fcyu[412] = -1281041978;
        hb.fcyu[413] = -572036017;
        hb.fcyu[414] = -1478847365;
        hb.fcyu[415] = -1416153573;
        hb.fcyu[416] = -1028316771;
        hb.fcyu[417] = -756128068;
        hb.fcyu[418] = 111238045;
        hb.fcyu[419] = 1420684464;
        hb.fcyu[420] = -191705807;
        hb.fcyu[421] = -209565458;
        hb.fcyu[422] = -710740142;
        hb.fcyu[423] = 1977829723;
        hb.fcyu[424] = 1251282240;
        hb.fcyu[425] = -231522056;
        hb.fcyu[426] = 1986940086;
        hb.fcyu[427] = -1341990025;
        hb.fcyu[428] = -375223060;
        hb.fcyu[429] = -521065174;
        hb.fcyu[430] = -1242666093;
        hb.fcyu[431] = -816800572;
        hb.fcyu[432] = -561043859;
        hb.fcyu[433] = -1101736214;
        hb.fcyu[434] = -211923779;
        hb.fcyu[435] = 1214697635;
        hb.fcyu[436] = 2096405660;
        hb.fcyu[437] = -2133932503;
        hb.fcyu[438] = 704316386;
        hb.fcyu[439] = -1474493848;
        hb.fcyu[440] = -1494772865;
        hb.fcyu[441] = 1138150335;
        hb.fcyu[442] = 1331349171;
        hb.fcyu[443] = -721295488;
        hb.fcyu[444] = 877212024;
        hb.fcyu[445] = -1085952711;
        hb.fcyu[446] = 2145406933;
        hb.fcyu[447] = -1186321725;
        hb.fcyu[448] = 2005478527;
        hb.fcyu[449] = 1068798092;
        hb.fcyu[450] = -634947377;
        hb.fcyu[451] = -374184847;
        hb.fcyu[452] = 984819708;
        hb.fcyu[453] = 1985220728;
        hb.fcyu[454] = 1522605402;
        hb.fcyu[455] = -1326268557;
        hb.fcyu[456] = 1843240832;
        hb.fcyu[457] = 1365710624;
        hb.fcyu[458] = -2141086891;
        hb.fcyu[459] = -465102721;
        hb.fcyu[460] = 2126500551;
        hb.fcyu[461] = -1297355837;
        hb.fcyu[462] = -1895398060;
        hb.fcyu[463] = 1685491529;
        hb.fcyu[464] = 60252659;
        hb.fcyu[465] = -121631040;
        hb.fcyu[466] = 1405966344;
        hb.fcyu[467] = -873342981;
        hb.fcyu[468] = 282956638;
        hb.fcyu[469] = -2110664711;
        hb.fcyu[470] = -864138496;
        hb.fcyu[471] = -1504719898;
        hb.fcyu[472] = 1960276824;
        hb.fcyu[473] = 1320990946;
        hb.fcyu[474] = -630485233;
        hb.fcyu[475] = -1947992585;
        hb.fcyu[476] = -586464205;
        hb.fcyu[477] = -883147497;
        hb.fcyu[478] = -1854502240;
        hb.fcyu[479] = -2052893004;
        hb.fcyu[480] = -78057520;
        hb.fcyu[481] = 1790068319;
        hb.fcyu[482] = -149819533;
        hb.fcyu[483] = 1581711342;
        hb.fcyu[484] = 1914336160;
        hb.fcyu[485] = -1829402013;
        hb.fcyu[486] = 1798354575;
        hb.fcyu[487] = -1377952697;
        hb.fcyu[488] = 730624855;
        hb.fcyu[489] = 1869990306;
        hb.fcyu[490] = 765393873;
        hb.fcyu[491] = 766414629;
        hb.fcyu[492] = 724217745;
        hb.fcyu[493] = 345385027;
        hb.fcyu[494] = -1828500069;
        hb.fcyu[495] = 2057016525;
        hb.fcyu[496] = 1073175239;
        hb.fcyu[497] = -912091985;
        hb.fcyu[498] = -1800041329;
        hb.fcyu[499] = -1861818388;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_1799 getArmorStack(class_1657 var1_1, int var2_2) {
        block28: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = hb.lq - hb.fcxy("fdou", fcxr(int ), (int)172)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == hb.fcxy("fdov", fcys(int ), (int)217)) break;
                v0 /* !! */  = (long)hb.fcxy("fdow", fcys(int ), (int)218);
            }
            var5_3 = hb.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = hb.lq - hb.fcxy("fdox", fcxr(int ), (int)173)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v1 /* !! */  == hb.fcxy("fdoy", fcys(int ), (int)219)) break;
                v1 /* !! */  = (long)hb.fcxy("fdoz", fcys(int ), (int)220);
            }
            var4_4 = hb.b;
            v2 /* !! */  = hb.lq;
            if (true) ** GOTO lbl19
            block17: while (true) {
                v2 /* !! */  = (long)(v3 - hb.fcxy("fdpa", fcxr(int ), (int)174));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case 96162446: {
                        break block17;
                    }
                    case 1305796893: {
                        v3 = hb.fcxy("fdpb", fcxr(int ), (int)175);
                        continue block17;
                    }
                    case 2046902775: {
                        v3 = hb.fcxy("fdpc", fcxr(int ), (int)176);
                        continue block17;
                    }
                }
                break;
            }
            var3_5 = hb.a;
            if (var5_3) {
                throw null;
lbl31:
                // 4 sources

                return null;
            }
            if (var3_5 || var3_5) ** GOTO lbl31
            if (var2_2 < 0) break block28;
            if (var3_5) ** GOTO lbl31
            while (true) {
                if ((v4 = (cfr_temp_2 = hb.lq - hb.fcxy("fdpd", fcxr(int ), (int)177)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 == hb.fcxy("fdpe", fcys(int ), (int)221)) break;
                v4 = 1630817858;
            }
            if (var2_2 >= hb.ARMOR_SLOTS.length) break block28;
            if (var3_5 || var3_5) ** GOTO lbl31
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_3 = hb.lq - hb.fcxy("fdpf", fcxr(int ), (int)178)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v5 /* !! */  == hb.fcxy("fdpg", fcys(int ), (int)222)) break;
                v5 /* !! */  = (long)hb.fcxy("fdph", fcys(int ), (int)223);
            }
            v6 = hb.ARMOR_SLOTS[var2_2];
            v7 /* !! */  = hb.lq;
            if (true) ** GOTO lbl55
            block21: while (true) {
                v7 /* !! */  = (long)(v8 - hb.fcxy("fdpi", fcxr(int ), (int)179));
lbl55:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -304142973: {
                        v8 = hb.fcxy("fdpj", fcxr(int ), (int)180);
                        continue block21;
                    }
                    case 96162446: {
                        break block21;
                    }
                    case 1404513945: {
                        v8 = hb.fcxy("fdpk", fcxr(int ), (int)181);
                        continue block21;
                    }
                    case 2067378296: {
                        v8 = hb.fcxy("fdpl", fcxr(int ), (int)182);
                        continue block21;
                    }
                }
                break;
            }
            return var1_1.method_6118(v6);
        }
        if (!var3_5 && !var3_5) ** break;
        ** while (true)
        v9 /* !! */  = hb.lq;
        if (true) ** GOTO lbl75
        block22: while (true) {
            v9 /* !! */  = (long)(hb.fcxy("fdpo", fcxr(int ), (int)184) - hb.fcxy("fdpm", fcxr(int ), (int)183));
lbl75:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case 96162446: {
                    break block22;
                }
                case 254976440: {
                    continue block22;
                }
            }
            break;
        }
        return class_1799.field_8037;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isRealPlayer(class_2703.class_2705 var1_1, GameProfile var2_2) {
        block31: {
            block30: {
                block29: {
                    v0 /* !! */  = hb.lq;
                    if (true) ** GOTO lbl5
                    block19: while (true) {
                        v0 /* !! */  = (long)(hb.fcxy("fdiw", fcxr(int ), (int)103) - hb.fcxy("fdiv", fcxr(int ), (int)102));
lbl5:
                        // 2 sources

                        switch ((int)v0 /* !! */ ) {
                            case 96162446: {
                                break block19;
                            }
                            case 733501380: {
                                continue block19;
                            }
                        }
                        break;
                    }
                    var5_3 = hb.c;
                    while (true) {
                        if ((v1 /* !! */  = (cfr_temp_0 = hb.lq - hb.fcxy("fdix", fcxr(int ), (int)104)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                        if (v1 /* !! */  == hb.fcxy("fdiy", fcys(int ), (int)142)) break;
                        v1 /* !! */  = (long)hb.fcxy("fdiz", fcys(int ), (int)143);
                    }
                    var4_4 = hb.b;
                    v2 /* !! */  = hb.lq;
                    if (true) ** GOTO lbl21
                    block21: while (true) {
                        v2 /* !! */  = (long)(v3 - hb.fcxy("fdja", fcxr(int ), (int)105));
lbl21:
                        // 2 sources

                        switch ((int)v2 /* !! */ ) {
                            case -1884014637: {
                                v3 = hb.fcxy("fdjc", fcxr(int ), (int)106);
                                continue block21;
                            }
                            case 96162446: {
                                break block21;
                            }
                            case 103715720: {
                                v3 = hb.fcxy("fdjd", fcxr(int ), (int)107);
                                continue block21;
                            }
                        }
                        break;
                    }
                    var3_5 = hb.a;
                    if (var5_3) {
                        throw null;
lbl33:
                        // 6 sources

                        return (boolean)hb.fcxy("fdje", fcys(int ), (int)144);
                    }
                    if (var3_5 || var3_5) ** GOTO lbl33
                    while (true) {
                        if ((v4 /* !! */  = (cfr_temp_1 = hb.lq - hb.fcxy("fdjf", fcxr(int ), (int)108)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v4 /* !! */  == hb.fcxy("fdjg", fcys(int ), (int)145)) break;
                        v4 /* !! */  = (long)hb.fcxy("fdjh", fcys(int ), (int)146);
                    }
                    if (var1_1.comp_1109() < hb.fcxy("fdji", fcys(int ), (int)147)) break block29;
                    if (var3_5) ** GOTO lbl33
                    v5 /* !! */  = hb.lq;
                    if (true) ** GOTO lbl47
                    block24: while (true) {
                        v5 /* !! */  = (long)(hb.fcxy("fdjk", fcxr(int ), (int)110) - hb.fcxy("fdjj", fcxr(int ), (int)109));
lbl47:
                        // 2 sources

                        switch ((int)v5 /* !! */ ) {
                            case -115497269: {
                                continue block24;
                            }
                            case 96162446: {
                                break block24;
                            }
                        }
                        break;
                    }
                    if (var2_2.properties() == null) break block30;
                    if (var3_5) ** GOTO lbl33
                    while (true) {
                        if ((v6 /* !! */  = (cfr_temp_2 = hb.lq - hb.fcxy("fdjl", fcxr(int ), (int)111)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v6 /* !! */  == hb.fcxy("fdjm", fcys(int ), (int)148)) break;
                        v6 /* !! */  = (long)hb.fcxy("fdjn", fcys(int ), (int)149);
                    }
                    v7 = var2_2.properties();
                    v8 /* !! */  = hb.lq;
                    if (true) ** GOTO lbl64
                    block26: while (true) {
                        v8 /* !! */  = (long)(v9 - hb.fcxy("fdjo", fcxr(int ), (int)112));
lbl64:
                        // 2 sources

                        switch ((int)v8 /* !! */ ) {
                            case -1500369448: {
                                v9 = hb.fcxy("fdjp", fcxr(int ), (int)113);
                                continue block26;
                            }
                            case -136521643: {
                                v9 = hb.fcxy("fdjq", fcxr(int ), (int)114);
                                continue block26;
                            }
                            case 96162446: {
                                break block26;
                            }
                            case 904001554: {
                                v9 = hb.fcxy("fdjr", fcxr(int ), (int)115);
                                continue block26;
                            }
                        }
                        break;
                    }
                    if (v7.isEmpty()) break block30;
                    if (var3_5) ** GOTO lbl33
                }
                if (var3_5 || var3_5) ** GOTO lbl33
                v10 = hb.fcxy("fdjs", fcys(int ), (int)150);
                if (var5_3) {
                    throw null;
                }
                break block31;
            }
            if (!var3_5 && !var3_5) ** break;
            ** while (true)
            v10 = hb.fcxy("fdjt", fcys(int ), (int)151);
        }
        return (boolean)v10;
    }

    private static /* synthetic */ void fexg() {
        hb.fcyu[0] = 1459597712;
        hb.fcyu[1] = -819380668;
        hb.fcyu[2] = 406320906;
        hb.fcyu[3] = -1359862838;
        hb.fcyu[4] = 37109058;
        hb.fcyu[5] = -1941065679;
        hb.fcyu[6] = -711713851;
        hb.fcyu[7] = 1939397095;
        hb.fcyu[8] = 1326447167;
        hb.fcyu[9] = -821223206;
        hb.fcyu[10] = 1857484427;
        hb.fcyu[11] = -234255746;
        hb.fcyu[12] = -382727147;
        hb.fcyu[13] = 243889792;
        hb.fcyu[14] = -910960403;
        hb.fcyu[15] = 1554093738;
        hb.fcyu[16] = -1511645763;
        hb.fcyu[17] = 93893106;
        hb.fcyu[18] = -1685245826;
        hb.fcyu[19] = 452488936;
        hb.fcyu[20] = 1736553338;
        hb.fcyu[21] = -1209622385;
        hb.fcyu[22] = 1827284401;
        hb.fcyu[23] = 1574224183;
        hb.fcyu[24] = 1143708454;
        hb.fcyu[25] = -1974044191;
        hb.fcyu[26] = -1451338286;
        hb.fcyu[27] = 1884107839;
        hb.fcyu[28] = 1745823740;
        hb.fcyu[29] = -122419093;
        hb.fcyu[30] = 1653444550;
        hb.fcyu[31] = 1555102351;
        hb.fcyu[32] = 2038074584;
        hb.fcyu[33] = -1920763327;
        hb.fcyu[34] = 1956268053;
        hb.fcyu[35] = -885911827;
        hb.fcyu[36] = 215559471;
        hb.fcyu[37] = 1891157504;
        hb.fcyu[38] = -306201384;
        hb.fcyu[39] = 436663715;
        hb.fcyu[40] = 480221870;
        hb.fcyu[41] = 10432905;
        hb.fcyu[42] = -119482059;
        hb.fcyu[43] = 489198337;
        hb.fcyu[44] = 1138602323;
        hb.fcyu[45] = -628119676;
        hb.fcyu[46] = -734893997;
        hb.fcyu[47] = 636557540;
        hb.fcyu[48] = -1435400415;
        hb.fcyu[49] = 1106018220;
        hb.fcyu[50] = 586968622;
        hb.fcyu[51] = 1135431994;
        hb.fcyu[52] = 2051875732;
        hb.fcyu[53] = -232809632;
        hb.fcyu[54] = -338183635;
        hb.fcyu[55] = -679360571;
        hb.fcyu[56] = 1709977875;
        hb.fcyu[57] = 2093088566;
        hb.fcyu[58] = -1150679700;
        hb.fcyu[59] = 471439947;
        hb.fcyu[60] = 271982282;
        hb.fcyu[61] = 501368879;
        hb.fcyu[62] = 821310571;
        hb.fcyu[63] = -1397952983;
        hb.fcyu[64] = -1998821965;
        hb.fcyu[65] = -808344295;
        hb.fcyu[66] = 53185678;
        hb.fcyu[67] = 860443860;
        hb.fcyu[68] = 84665255;
        hb.fcyu[69] = -1540016782;
        hb.fcyu[70] = -1173359909;
        hb.fcyu[71] = -2077843939;
        hb.fcyu[72] = 776176543;
        hb.fcyu[73] = 1804857820;
        hb.fcyu[74] = -1426159527;
        hb.fcyu[75] = -1619599109;
        hb.fcyu[76] = -275668164;
        hb.fcyu[77] = 1299678225;
        hb.fcyu[78] = -2006894531;
        hb.fcyu[79] = 1816612645;
        hb.fcyu[80] = -1363483054;
        hb.fcyu[81] = 83944819;
        hb.fcyu[82] = -2105431061;
        hb.fcyu[83] = -2005819507;
        hb.fcyu[84] = 1422495427;
        hb.fcyu[85] = -1728130643;
        hb.fcyu[86] = -1373382981;
        hb.fcyu[87] = 1855884133;
        hb.fcyu[88] = 1020539976;
        hb.fcyu[89] = -225737231;
        hb.fcyu[90] = -1319373436;
        hb.fcyu[91] = -553051754;
        hb.fcyu[92] = -2120849674;
        hb.fcyu[93] = 90481630;
        hb.fcyu[94] = -1645316244;
        hb.fcyu[95] = -1952283953;
        hb.fcyu[96] = 600399286;
        hb.fcyu[97] = -1417101500;
        hb.fcyu[98] = 601327568;
        hb.fcyu[99] = 572173087;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private List<class_1799> getArmorItems(class_1657 var1_1) {
        v0 /* !! */  = hb.lq;
        if (true) ** GOTO lbl5
        block51: while (true) {
            v0 /* !! */  = (long)(v1 - hb.fcxy("fdmt", fcxr(int ), (int)150));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1335950967: {
                    v1 = hb.fcxy("fdmv", fcxr(int ), (int)151);
                    continue block51;
                }
                case -662516755: {
                    v1 = hb.fcxy("fdmw", fcxr(int ), (int)152);
                    continue block51;
                }
                case 96162446: {
                    break block51;
                }
                case 487136146: {
                    v1 = hb.fcxy("fdmx", fcxr(int ), (int)153);
                    continue block51;
                }
            }
            break;
        }
        var9_2 = hb.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hb.lq - hb.fcxy("fdmy", fcxr(int ), (int)154)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == hb.fcxy("fdmz", fcys(int ), (int)190)) break;
            v2 /* !! */  = (long)hb.fcxy("fdna", fcys(int ), (int)191);
        }
        var8_3 /* !! */  = hb.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = hb.lq - hb.fcxy("fdnb", fcxr(int ), (int)155)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == hb.fcxy("fdnc", fcys(int ), (int)192)) break;
            v3 /* !! */  = (long)hb.fcxy("fdnd", fcys(int ), (int)193);
        }
        var7_4 = hb.a;
        if (var9_2) {
            throw null;
lbl32:
            // 11 sources

            return null;
        }
        if (var7_4 || var7_4) ** GOTO lbl32
        v4 /* !! */  = hb.lq;
        if (true) ** GOTO lbl39
        block55: while (true) {
            v4 /* !! */  = (long)(v5 - hb.fcxy("fdne", fcxr(int ), (int)156));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1587615804: {
                    v5 = hb.fcxy("fdnf", fcxr(int ), (int)157);
                    continue block55;
                }
                case -484131657: {
                    v5 = hb.fcxy("fdng", fcxr(int ), (int)158);
                    continue block55;
                }
                case 96162446: {
                    break block55;
                }
            }
            break;
        }
        v6 /* !! */  = hb.lq;
        if (true) ** GOTO lbl52
        block56: while (true) {
            v6 /* !! */  = (long)(v7 - hb.fcxy("fdnh", fcxr(int ), (int)159));
lbl52:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -764499610: {
                    v7 = hb.fcxy("fdni", fcxr(int ), (int)160);
                    continue block56;
                }
                case 96162446: {
                    break block56;
                }
                case 930860700: {
                    v7 = hb.fcxy("fdnj", fcxr(int ), (int)161);
                    continue block56;
                }
                case 1477145657: {
                    v7 = hb.fcxy("fdnk", fcxr(int ), (int)162);
                    continue block56;
                }
            }
            break;
        }
        var2_5 = new ArrayList<class_1799>();
        if (var7_4 || var7_4) ** GOTO lbl32
        v8 /* !! */  = hb.lq;
        if (true) ** GOTO lbl70
        block57: while (true) {
            v8 /* !! */  = (long)(v9 - hb.fcxy("fdnl", fcxr(int ), (int)163));
lbl70:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1826710431: {
                    v9 = hb.fcxy("fdnn", fcxr(int ), (int)164);
                    continue block57;
                }
                case 96162446: {
                    break block57;
                }
                case 1064932964: {
                    v9 = hb.fcxy("fdno", fcxr(int ), (int)165);
                    continue block57;
                }
                case 1177155004: {
                    v9 = hb.fcxy("fdnp", fcxr(int ), (int)166);
                    continue block57;
                }
            }
            break;
        }
        var3_6 = hb.ARMOR_SLOTS;
        if (var7_4) ** GOTO lbl32
        var4_7 = var3_6.length;
        if (var7_4) ** GOTO lbl32
        var5_8 = hb.fcxy("fdnq", fcys(int ), (int)194);
        if (var7_4) ** GOTO lbl32
        block58: while (true) {
            if (var7_4 || var7_4) ** GOTO lbl32
            if (var8_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var8_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var5_8 >= var4_7) ** GOTO lbl126
                    if (var7_4) ** GOTO lbl32
                    var6_9 = var3_6[var5_8];
                    if (var7_4 || var7_4) ** GOTO lbl32
                    while (true) {
                        if ((v10 /* !! */  = (cfr_temp_2 = hb.lq - hb.fcxy("fdnr", fcxr(int ), (int)167)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v10 /* !! */  == hb.fcxy("fdns", fcys(int ), (int)195)) break;
                        v10 /* !! */  = (long)hb.fcxy("fdnt", fcys(int ), (int)196);
                    }
                    v11 = var1_1.method_6118(var6_9);
                    v12 /* !! */  = hb.lq;
                    if (true) ** GOTO lbl107
                    block60: while (true) {
                        v12 /* !! */  = (long)(v13 - hb.fcxy("fdnu", fcxr(int ), (int)168));
lbl107:
                        // 2 sources

                        switch ((int)v12 /* !! */ ) {
                            case -1416059229: {
                                v13 = hb.fcxy("fdnv", fcxr(int ), (int)169);
                                continue block60;
                            }
                            case 96162446: {
                                break block60;
                            }
                            case 742200186: {
                                v13 = hb.fcxy("fdnw", fcxr(int ), (int)170);
                                continue block60;
                            }
                            case 1201784414: {
                                v13 = hb.fcxy("fdnx", fcxr(int ), (int)171);
                                continue block60;
                            }
                        }
                        break;
                    }
                    var2_5.add(v11);
                    if (var7_4 || var7_4) ** GOTO lbl32
                    ++var5_8;
                    if (var7_4) ** GOTO lbl32
                    if (!var9_2) continue block58;
                    throw null;
lbl126:
                    // 1 sources

                    if (!var7_4 && !var7_4) ** break;
                    ** continue;
                    return var2_5;
                }
                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var8_3 /* !! */  = (int)hb.fcxy("fdny", fcys(int ), (int)197);
                        if (var9_2) {
                            throw null;
                        }
                        ** GOTO lbl159
                        break;
                    }
                }
                case 1: {
                    var8_3 /* !! */  = (int)hb.fcxy("fdnz", fcys(int ), (int)198);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl150
                }
lbl140:
                // 4 sources

                case 2: {
                    var8_3 /* !! */  = (int)hb.fcxy("fdoa", fcys(int ), (int)199);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl155
                }
                case 3: {
                    var8_3 /* !! */  = (int)hb.fcxy("fdoc", fcys(int ), (int)200);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl190
                }
lbl150:
                // 3 sources

                case 4: {
                    var8_3 /* !! */  = (int)hb.fcxy("fdod", fcys(int ), (int)201);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl202
                }
lbl155:
                // 2 sources

                case 5: {
                    var8_3 /* !! */  = (int)hb.fcxy("fdoe", fcys(int ), (int)202);
                    if (!var9_2) ** GOTO lbl140
                    throw null;
                }
lbl159:
                // 2 sources

                case 6: {
                    var8_3 /* !! */  = (int)hb.fcxy("fdof", fcys(int ), (int)203);
                    if (!var9_2) ** GOTO lbl150
                    throw null;
                }
lbl163:
                // 3 sources

                case 7: {
                    var8_3 /* !! */  = (int)hb.fcxy("fdog", fcys(int ), (int)204);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl185
                }
                case 8: {
                    var8_3 /* !! */  = (int)hb.fcxy("fdoh", fcys(int ), (int)205);
                    if (!var9_2) break block58;
                    throw null;
                }
lbl172:
                // 2 sources

                case 9: {
                    var8_3 /* !! */  = (int)hb.fcxy("fdoi", fcys(int ), (int)206);
                    if (!var9_2) ** GOTO lbl140
                    throw null;
                }
                case 10: {
                    var8_3 /* !! */  = (int)hb.fcxy("fdoj", fcys(int ), (int)207);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl190
                }
                case 11: {
                    var8_3 /* !! */  = (int)hb.fcxy("fdok", fcys(int ), (int)208);
                    if (!var9_2) ** GOTO lbl163
                    throw null;
                }
lbl185:
                // 2 sources

                case 12: {
                    var8_3 /* !! */  = (int)hb.fcxy("fdol", fcys(int ), (int)209);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl202
                }
lbl190:
                // 3 sources

                case 13: {
                    var8_3 /* !! */  = (int)hb.fcxy("fdom", fcys(int ), (int)210);
                    if (!var9_2) ** GOTO lbl172
                    throw null;
                }
lbl194:
                // 2 sources

                case 14: {
                    var8_3 /* !! */  = (int)hb.fcxy("fdon", fcys(int ), (int)211);
                    if (!var9_2) ** GOTO lbl163
                    throw null;
                }
                case 15: {
                    var8_3 /* !! */  = (int)hb.fcxy("fdoo", fcys(int ), (int)212);
                    if (!var9_2) ** GOTO lbl140
                    throw null;
                }
lbl202:
                // 4 sources

                case 16: {
                    var8_3 /* !! */  = (int)hb.fcxy("fdop", fcys(int ), (int)213);
                    if (!var9_2) break block58;
                    throw null;
                }
                case 17: {
                    var8_3 /* !! */  = (int)hb.fcxy("fdoq", fcys(int ), (int)214);
                    if (!var9_2) ** GOTO lbl194
                    throw null;
                }
                case 18: {
                    var8_3 /* !! */  = (int)hb.fcxy("fdor", fcys(int ), (int)215);
                    if (!var9_2) ** GOTO lbl202
                    throw null;
                }
                case 19: 
            }
            break;
        }
        var8_3 /* !! */  = (int)hb.fcxy("fdos", fcys(int ), (int)216);
        ** while (!var9_2)
lbl217:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void feyd() {
        hb.fcxu[200] = 6194781915564208579L;
        hb.fcxu[201] = 7045810252749371135L;
        hb.fcxu[202] = 914950951597352960L;
        hb.fcxu[203] = -5104399012352004094L;
        hb.fcxu[204] = -8462441410594029193L;
        hb.fcxu[205] = -2532808596793016203L;
        hb.fcxu[206] = 34806072258769728L;
        hb.fcxu[207] = -8261973872975619002L;
        hb.fcxu[208] = 6103233896765231571L;
        hb.fcxu[209] = -1137298600085449288L;
        hb.fcxu[210] = 1040769677114149512L;
        hb.fcxu[211] = 8448210833339154238L;
        hb.fcxu[212] = 1673979767383112296L;
        hb.fcxu[213] = -1204362684361083848L;
        hb.fcxu[214] = 6845391091358000301L;
        hb.fcxu[215] = -7594087334803924757L;
        hb.fcxu[216] = -7786292660807838240L;
        hb.fcxu[217] = -589841592045077735L;
        hb.fcxu[218] = 5011516789948543449L;
        hb.fcxu[219] = -7504167691791262955L;
        hb.fcxu[220] = 7570992659457098734L;
        hb.fcxu[221] = -653417684359767080L;
        hb.fcxu[222] = 1500595829824780587L;
        hb.fcxu[223] = 5528780999802084589L;
        hb.fcxu[224] = 1757810711932441895L;
        hb.fcxu[225] = 6423759842625121701L;
        hb.fcxu[226] = 1615860265448135405L;
        hb.fcxu[227] = 3774019215784205028L;
        hb.fcxu[228] = 8564690552389530049L;
        hb.fcxu[229] = -4058181517182243271L;
        hb.fcxu[230] = 2670474810706945124L;
        hb.fcxu[231] = 2009228629309261849L;
        hb.fcxu[232] = 5383288420963422615L;
        hb.fcxu[233] = 4081638818651878659L;
        hb.fcxu[234] = 8556035142447892235L;
        hb.fcxu[235] = -6541006410295690791L;
        hb.fcxu[236] = -8923263715414157451L;
        hb.fcxu[237] = 6325264088140905626L;
        hb.fcxu[238] = 1973997854089592565L;
        hb.fcxu[239] = 4970271835025784323L;
        hb.fcxu[240] = 1130402989772649622L;
        hb.fcxu[241] = -6611804829048985820L;
        hb.fcxu[242] = 5176496256478875371L;
        hb.fcxu[243] = -2879757167106934382L;
        hb.fcxu[244] = 7244978913191609878L;
        hb.fcxu[245] = -9133187982077124569L;
        hb.fcxu[246] = 4719403411957684684L;
        hb.fcxu[247] = -8065743304643043746L;
        hb.fcxu[248] = 5533066729538597419L;
        hb.fcxu[249] = 3946020015176511565L;
        hb.fcxu[250] = -4789593606051562290L;
        hb.fcxu[251] = -5101878268345656646L;
        hb.fcxu[252] = -174384907058918337L;
        hb.fcxu[253] = 8955764531394495839L;
        hb.fcxu[254] = -5099884908380710472L;
        hb.fcxu[255] = 3719022885978108873L;
        hb.fcxu[256] = -7329855917556597462L;
        hb.fcxu[257] = -1515684148677104822L;
        hb.fcxu[258] = -2498531766315812432L;
        hb.fcxu[259] = 1981403000488531084L;
        hb.fcxu[260] = -4031162594214388363L;
        hb.fcxu[261] = -484727099908587448L;
        hb.fcxu[262] = -5490650425698699586L;
        hb.fcxu[263] = -5105215875183155843L;
        hb.fcxu[264] = -2422342624811764607L;
        hb.fcxu[265] = -9018887807866708906L;
        hb.fcxu[266] = -2802796776881720385L;
        hb.fcxu[267] = -7842597158334540364L;
        hb.fcxu[268] = -7332241979001831961L;
        hb.fcxu[269] = -1832390904359583407L;
        hb.fcxu[270] = 6284625377046166787L;
        hb.fcxu[271] = -8022505951843258357L;
        hb.fcxu[272] = 9072150653862440681L;
        hb.fcxu[273] = -8605533052153030075L;
        hb.fcxu[274] = 6064241908974620436L;
        hb.fcxu[275] = -6455973472940331547L;
        hb.fcxu[276] = -7086319075920850344L;
        hb.fcxu[277] = 7766038788150234896L;
        hb.fcxu[278] = -2158822331794747493L;
        hb.fcxu[279] = -6927327156808645648L;
        hb.fcxu[280] = -7152990418650889245L;
        hb.fcxu[281] = 2829113625396730382L;
        hb.fcxu[282] = -2068501494326825450L;
        hb.fcxu[283] = -782049513089422904L;
        hb.fcxu[284] = 5827024600684016396L;
        hb.fcxu[285] = 7329394586834424027L;
        hb.fcxu[286] = -4870745477941098940L;
        hb.fcxu[287] = 1478599359578070691L;
        hb.fcxu[288] = 3078268840905392068L;
        hb.fcxu[289] = 4689906174763758852L;
        hb.fcxu[290] = 4794615954771070650L;
        hb.fcxu[291] = 6130360170690829555L;
        hb.fcxu[292] = 2292315088133152404L;
        hb.fcxu[293] = -4666701659048820628L;
        hb.fcxu[294] = 3911366295946712541L;
        hb.fcxu[295] = 1707005409574858476L;
        hb.fcxu[296] = 3280018622508763803L;
        hb.fcxu[297] = 4409618522545286331L;
        hb.fcxu[298] = -1533007220931617356L;
        hb.fcxu[299] = -5280600142508982303L;
    }

    private static /* synthetic */ void fexh() {
        hb.fcyu[100] = -2036161092;
        hb.fcyu[101] = 1944756420;
        hb.fcyu[102] = 165169522;
        hb.fcyu[103] = -152492401;
        hb.fcyu[104] = -723719636;
        hb.fcyu[105] = -306594211;
        hb.fcyu[106] = -655814249;
        hb.fcyu[107] = 1134128103;
        hb.fcyu[108] = 402625415;
        hb.fcyu[109] = -897234964;
        hb.fcyu[110] = 2085420793;
        hb.fcyu[111] = -1686004665;
        hb.fcyu[112] = 12447083;
        hb.fcyu[113] = 1610799734;
        hb.fcyu[114] = -1968438352;
        hb.fcyu[115] = -1206803738;
        hb.fcyu[116] = 10859268;
        hb.fcyu[117] = 1111010017;
        hb.fcyu[118] = -1483314639;
        hb.fcyu[119] = 1666161711;
        hb.fcyu[120] = 2008528342;
        hb.fcyu[121] = 839426468;
        hb.fcyu[122] = -1694196221;
        hb.fcyu[123] = 1324856926;
        hb.fcyu[124] = 1889123615;
        hb.fcyu[125] = 145867226;
        hb.fcyu[126] = 1424086262;
        hb.fcyu[127] = -132413474;
        hb.fcyu[128] = 987399136;
        hb.fcyu[129] = -664023616;
        hb.fcyu[130] = 1125448136;
        hb.fcyu[131] = 2146109098;
        hb.fcyu[132] = -282526408;
        hb.fcyu[133] = -525730883;
        hb.fcyu[134] = -1458094825;
        hb.fcyu[135] = -989511415;
        hb.fcyu[136] = -1058408905;
        hb.fcyu[137] = 1350856955;
        hb.fcyu[138] = 1666342073;
        hb.fcyu[139] = -447546853;
        hb.fcyu[140] = 711973096;
        hb.fcyu[141] = 781476655;
        hb.fcyu[142] = 708741243;
        hb.fcyu[143] = 1845509014;
        hb.fcyu[144] = 1091047470;
        hb.fcyu[145] = 2092645978;
        hb.fcyu[146] = -102983342;
        hb.fcyu[147] = 1728688200;
        hb.fcyu[148] = 647563722;
        hb.fcyu[149] = -1439230082;
        hb.fcyu[150] = 1607845030;
        hb.fcyu[151] = 1877329366;
        hb.fcyu[152] = -754231042;
        hb.fcyu[153] = -1333101592;
        hb.fcyu[154] = -2098643884;
        hb.fcyu[155] = 2126043152;
        hb.fcyu[156] = -2017465075;
        hb.fcyu[157] = -317410784;
        hb.fcyu[158] = 556951262;
        hb.fcyu[159] = 66558972;
        hb.fcyu[160] = 1873400959;
        hb.fcyu[161] = -2123525482;
        hb.fcyu[162] = 1499843255;
        hb.fcyu[163] = -352208151;
        hb.fcyu[164] = -80490501;
        hb.fcyu[165] = 2141431853;
        hb.fcyu[166] = -1740593544;
        hb.fcyu[167] = -1056327582;
        hb.fcyu[168] = -792371048;
        hb.fcyu[169] = -2039954907;
        hb.fcyu[170] = 527628461;
        hb.fcyu[171] = -1991598008;
        hb.fcyu[172] = -1531379497;
        hb.fcyu[173] = -1800904855;
        hb.fcyu[174] = -177196148;
        hb.fcyu[175] = 299916452;
        hb.fcyu[176] = -1239428322;
        hb.fcyu[177] = -460369946;
        hb.fcyu[178] = -1852016250;
        hb.fcyu[179] = -1735626459;
        hb.fcyu[180] = 406440834;
        hb.fcyu[181] = -526136202;
        hb.fcyu[182] = 72843337;
        hb.fcyu[183] = -1693929358;
        hb.fcyu[184] = -1399168158;
        hb.fcyu[185] = 1403965685;
        hb.fcyu[186] = -1237156966;
        hb.fcyu[187] = -391151006;
        hb.fcyu[188] = -19323681;
        hb.fcyu[189] = -117446755;
        hb.fcyu[190] = -1390173655;
        hb.fcyu[191] = 1021863;
        hb.fcyu[192] = 1390164573;
        hb.fcyu[193] = 1926172594;
        hb.fcyu[194] = -1458903312;
        hb.fcyu[195] = 1690287321;
        hb.fcyu[196] = 897258371;
        hb.fcyu[197] = 1377330992;
        hb.fcyu[198] = -441689030;
        hb.fcyu[199] = 768116432;
    }

    private static /* synthetic */ void fexy() {
        hb.fcxs[200] = -9053158269402531154L;
        hb.fcxs[201] = -8477023895777051208L;
        hb.fcxs[202] = 6727149958524091489L;
        hb.fcxs[203] = -5567490794800960586L;
        hb.fcxs[204] = 5648128268487742950L;
        hb.fcxs[205] = -5887133545882341302L;
        hb.fcxs[206] = 2238134578279932085L;
        hb.fcxs[207] = -2432230061145144033L;
        hb.fcxs[208] = 109561649876479009L;
        hb.fcxs[209] = 7055963245758778015L;
        hb.fcxs[210] = 6356242409598040998L;
        hb.fcxs[211] = -6935461797968865992L;
        hb.fcxs[212] = 273427379324741772L;
        hb.fcxs[213] = 7958356528114393599L;
        hb.fcxs[214] = -6379557476924849962L;
        hb.fcxs[215] = -4284736173851685912L;
        hb.fcxs[216] = 7871695143544084731L;
        hb.fcxs[217] = -2825308296353815494L;
        hb.fcxs[218] = -5210162606643339199L;
        hb.fcxs[219] = 3520220938057330371L;
        hb.fcxs[220] = -2390143838886242193L;
        hb.fcxs[221] = 1204741533081710166L;
        hb.fcxs[222] = 1264799967389139068L;
        hb.fcxs[223] = -357507864600770796L;
        hb.fcxs[224] = -1088761935979574378L;
        hb.fcxs[225] = -4452326111457918242L;
        hb.fcxs[226] = 3174108075300846596L;
        hb.fcxs[227] = 3315065352776498360L;
        hb.fcxs[228] = 4021246480858951822L;
        hb.fcxs[229] = -6527641645689161302L;
        hb.fcxs[230] = 6702086596871706502L;
        hb.fcxs[231] = 7527186998908178171L;
        hb.fcxs[232] = -5635152418361462170L;
        hb.fcxs[233] = -2118857117087858115L;
        hb.fcxs[234] = 3189328691763477289L;
        hb.fcxs[235] = -2321963498840517741L;
        hb.fcxs[236] = 5836910851730769941L;
        hb.fcxs[237] = 746497239704293439L;
        hb.fcxs[238] = -4204732469325130234L;
        hb.fcxs[239] = 3688156493408912119L;
        hb.fcxs[240] = -8528601494631854845L;
        hb.fcxs[241] = -605245361258422355L;
        hb.fcxs[242] = -1016939451921816900L;
        hb.fcxs[243] = -1468305965428400722L;
        hb.fcxs[244] = 4571124284066235703L;
        hb.fcxs[245] = -5548658127765591522L;
        hb.fcxs[246] = 1208831674729010247L;
        hb.fcxs[247] = -4074390362219833519L;
        hb.fcxs[248] = -6357521409649336695L;
        hb.fcxs[249] = -5360298260411388672L;
        hb.fcxs[250] = -8511943555785188913L;
        hb.fcxs[251] = 8929598890379472125L;
        hb.fcxs[252] = -2627073140869188585L;
        hb.fcxs[253] = -2580298915286055783L;
        hb.fcxs[254] = 2444466801496162288L;
        hb.fcxs[255] = 8282385065074369195L;
        hb.fcxs[256] = 5124039905055861852L;
        hb.fcxs[257] = -2255021969245022766L;
        hb.fcxs[258] = -6046022824282734177L;
        hb.fcxs[259] = 6562454062738820316L;
        hb.fcxs[260] = 3656210467336856089L;
        hb.fcxs[261] = -5514089695536395142L;
        hb.fcxs[262] = -429660670914644759L;
        hb.fcxs[263] = -8760552265042345470L;
        hb.fcxs[264] = -3977619135112394881L;
        hb.fcxs[265] = 3188813186169543434L;
        hb.fcxs[266] = 4668328762985507780L;
        hb.fcxs[267] = -2907936088466835491L;
        hb.fcxs[268] = 3860329939994710106L;
        hb.fcxs[269] = -2182756340513196195L;
        hb.fcxs[270] = -4388716870821486978L;
        hb.fcxs[271] = 8134014397470549605L;
        hb.fcxs[272] = -4921002436584421418L;
        hb.fcxs[273] = 1573335985279238061L;
        hb.fcxs[274] = 7990070490872412518L;
        hb.fcxs[275] = 8143809697940615019L;
        hb.fcxs[276] = -2460571602538579618L;
        hb.fcxs[277] = 6761035478094078609L;
        hb.fcxs[278] = 176269319905555794L;
        hb.fcxs[279] = -5284470810916030001L;
        hb.fcxs[280] = 1356263261525827298L;
        hb.fcxs[281] = 466064787796579624L;
        hb.fcxs[282] = -5132010848236252584L;
        hb.fcxs[283] = 6653948928282905658L;
        hb.fcxs[284] = 1469439369506428980L;
        hb.fcxs[285] = -5253178770474149595L;
        hb.fcxs[286] = -4870745477941098939L;
        hb.fcxs[287] = -8552618854305399731L;
        hb.fcxs[288] = 6741343682664130219L;
        hb.fcxs[289] = -3958533795669051187L;
        hb.fcxs[290] = -710006033174360235L;
        hb.fcxs[291] = 246653091344374569L;
        hb.fcxs[292] = -9106481861313274431L;
        hb.fcxs[293] = -6706379853263959840L;
        hb.fcxs[294] = -1527014347290807258L;
        hb.fcxs[295] = -8481582198094233857L;
        hb.fcxs[296] = -790275522298984725L;
        hb.fcxs[297] = 3437805327243807988L;
        hb.fcxs[298] = -5309201350891559237L;
        hb.fcxs[299] = 4816417044105444642L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isDuplicateProfile(GameProfile var1_1) {
        v0 /* !! */  = hb.lq;
        if (true) ** GOTO lbl5
        block53: while (true) {
            v0 /* !! */  = (long)(v1 - hb.fcxy("fect", fcxr(int ), (int)259));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 96162446: {
                    break block53;
                }
                case 1186709804: {
                    v1 = hb.fcxy("fecu", fcxr(int ), (int)260);
                    continue block53;
                }
                case 2016666379: {
                    v1 = hb.fcxy("fecv", fcxr(int ), (int)261);
                    continue block53;
                }
                case 2144417809: {
                    v1 = hb.fcxy("fecw", fcxr(int ), (int)262);
                    continue block53;
                }
            }
            break;
        }
        var4_2 = hb.c;
        v2 /* !! */  = hb.lq;
        if (true) ** GOTO lbl22
        block54: while (true) {
            v2 /* !! */  = (long)(v3 - hb.fcxy("fecx", fcxr(int ), (int)263));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -152591362: {
                    v3 = hb.fcxy("fecy", fcxr(int ), (int)264);
                    continue block54;
                }
                case 96162446: {
                    break block54;
                }
                case 1624766251: {
                    v3 = hb.fcxy("fecz", fcxr(int ), (int)265);
                    continue block54;
                }
            }
            break;
        }
        var3_3 /* !! */  = hb.b;
        v4 /* !! */  = hb.lq;
        if (true) ** GOTO lbl36
        block55: while (true) {
            v4 /* !! */  = (long)(v5 - hb.fcxy("feda", fcxr(int ), (int)266));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 84811008: {
                    v5 = hb.fcxy("fedb", fcxr(int ), (int)267);
                    continue block55;
                }
                case 96162446: {
                    break block55;
                }
                case 426657701: {
                    v5 = hb.fcxy("fedc", fcxr(int ), (int)268);
                    continue block55;
                }
            }
            break;
        }
        var2_4 = hb.a;
        if (var4_2) {
            throw null;
lbl48:
            // 4 sources

            return (boolean)hb.fcxy("fedd", fcys(int ), (int)490);
        }
        if (var2_4) ** GOTO lbl48
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl48
                v6 /* !! */  = hb.lq;
                if (true) ** GOTO lbl59
                block57: while (true) {
                    v6 /* !! */  = (long)(hb.fcxy("fedf", fcxr(int ), (int)270) - hb.fcxy("fede", fcxr(int ), (int)269));
lbl59:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 96162446: {
                            break block57;
                        }
                        case 1740121632: {
                            continue block57;
                        }
                    }
                    break;
                }
                v7 /* !! */  = hb.lq;
                if (true) ** GOTO lbl68
                block58: while (true) {
                    v7 /* !! */  = (long)(v8 - hb.fcxy("fedg", fcxr(int ), (int)271));
lbl68:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 96162446: {
                            break block58;
                        }
                        case 233491699: {
                            v8 = hb.fcxy("fedh", fcxr(int ), (int)272);
                            continue block58;
                        }
                        case 1179301067: {
                            v8 = hb.fcxy("fedi", fcxr(int ), (int)273);
                            continue block58;
                        }
                    }
                    break;
                }
                v9 = hb.mc.method_1562();
                v10 /* !! */  = hb.lq;
                if (true) ** GOTO lbl82
                block59: while (true) {
                    v10 /* !! */  = (long)(v11 - hb.fcxy("fedj", fcxr(int ), (int)274));
lbl82:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1436463903: {
                            v11 = hb.fcxy("fedk", fcxr(int ), (int)275);
                            continue block59;
                        }
                        case -913545174: {
                            v11 = hb.fcxy("fedl", fcxr(int ), (int)276);
                            continue block59;
                        }
                        case 96162446: {
                            break block59;
                        }
                        case 1216933284: {
                            v11 = hb.fcxy("fedm", fcxr(int ), (int)277);
                            continue block59;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_0 = hb.lq - hb.fcxy("fedn", fcxr(int ), (int)278)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == hb.fcxy("fedo", fcys(int ), (int)491)) break;
                    v12 /* !! */  = (long)hb.fcxy("fedp", fcys(int ), (int)492);
                }
                v13 = Objects.requireNonNull(v9).method_2880();
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_1 = hb.lq - hb.fcxy("fedq", fcxr(int ), (int)279)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == hb.fcxy("fedr", fcys(int ), (int)493)) break;
                    v14 /* !! */  = (long)hb.fcxy("feds", fcys(int ), (int)494);
                }
                v15 = v13.stream();
                v16 /* !! */  = hb.lq;
                if (true) ** GOTO lbl110
                block62: while (true) {
                    v16 /* !! */  = (long)(hb.fcxy("fedu", fcxr(int ), (int)281) - hb.fcxy("fedt", fcxr(int ), (int)280));
lbl110:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -832370791: {
                            continue block62;
                        }
                        case 96162446: {
                            break block62;
                        }
                    }
                    break;
                }
                v17 = (Predicate<class_640>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$isDuplicateProfile$4(com.mojang.authlib.GameProfile net.minecraft.class_640 ), (Lnet/minecraft/class_640;)Z)((GameProfile)var1_1);
                v18 /* !! */  = hb.lq;
                if (true) ** GOTO lbl120
                block63: while (true) {
                    v18 /* !! */  = (long)(hb.fcxy("fedw", fcxr(int ), (int)283) - hb.fcxy("fedv", fcxr(int ), (int)282));
lbl120:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case 96162446: {
                            break block63;
                        }
                        case 1728762910: {
                            continue block63;
                        }
                    }
                    break;
                }
                v19 = v15.filter(v17);
                v20 /* !! */  = hb.lq;
                if (true) ** GOTO lbl130
                block64: while (true) {
                    v20 /* !! */  = (long)(hb.fcxy("fedy", fcxr(int ), (int)285) - hb.fcxy("fedx", fcxr(int ), (int)284));
lbl130:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -258682018: {
                            continue block64;
                        }
                        case 96162446: {
                            break block64;
                        }
                    }
                    break;
                }
                if (v19.count() != hb.fcxy("fedz", fcxr(int ), (int)286)) ** GOTO lbl141
                if (var2_4) ** GOTO lbl48
                v21 = hb.fcxy("feea", fcys(int ), (int)495);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl144
lbl141:
                // 1 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v21 = hb.fcxy("feeb", fcys(int ), (int)496);
lbl144:
                // 2 sources

                return (boolean)v21;
            }
            case 0: {
                var3_3 /* !! */  = (int)hb.fcxy("feec", fcys(int ), (int)497);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl175
            }
            case 1: {
                var3_3 /* !! */  = (int)hb.fcxy("feed", fcys(int ), (int)498);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl160
            }
lbl155:
            // 3 sources

            case 2: {
                var3_3 /* !! */  = (int)hb.fcxy("feee", fcys(int ), (int)499);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl175
            }
lbl160:
            // 2 sources

            case 3: {
                do {
                    var3_3 /* !! */  = (int)hb.fcxy("feef", fcys(int ), (int)500);
                } while (!var4_2);
                throw null;
            }
            case 4: {
                do {
                    var3_3 /* !! */  = (int)hb.fcxy("feeg", fcys(int ), (int)501);
                } while (!var4_2);
                throw null;
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hb.fcxy("feeh", fcys(int ), (int)502);
                    if (!var4_2) ** GOTO lbl155
                    throw null;
                }
            }
lbl175:
            // 3 sources

            case 6: {
                var3_3 /* !! */  = (int)hb.fcxy("feei", fcys(int ), (int)503);
                if (!var4_2) ** GOTO lbl155
                throw null;
            }
            case 7: 
        }
        var3_3 /* !! */  = (int)hb.fcxy("feej", fcys(int ), (int)504);
        ** while (!var4_2)
lbl182:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fexi() {
        hb.fcyu[200] = 2000404911;
        hb.fcyu[201] = 113408467;
        hb.fcyu[202] = 129223602;
        hb.fcyu[203] = -416151396;
        hb.fcyu[204] = -1051547230;
        hb.fcyu[205] = -131666543;
        hb.fcyu[206] = -740713667;
        hb.fcyu[207] = -1519635113;
        hb.fcyu[208] = -1304665437;
        hb.fcyu[209] = 58569249;
        hb.fcyu[210] = -407469869;
        hb.fcyu[211] = -1309609667;
        hb.fcyu[212] = 1164213919;
        hb.fcyu[213] = 1286854993;
        hb.fcyu[214] = -277643976;
        hb.fcyu[215] = -1293079150;
        hb.fcyu[216] = -1048017232;
        hb.fcyu[217] = 35478080;
        hb.fcyu[218] = 1530000018;
        hb.fcyu[219] = -951388573;
        hb.fcyu[220] = -2041941234;
        hb.fcyu[221] = 1948353207;
        hb.fcyu[222] = 1322534997;
        hb.fcyu[223] = 1305674644;
        hb.fcyu[224] = -1303368509;
        hb.fcyu[225] = -1605242138;
        hb.fcyu[226] = -1993988253;
        hb.fcyu[227] = -353859042;
        hb.fcyu[228] = -1189656078;
        hb.fcyu[229] = -1425797886;
        hb.fcyu[230] = -2047005192;
        hb.fcyu[231] = 777570904;
        hb.fcyu[232] = -1719341774;
        hb.fcyu[233] = -34033220;
        hb.fcyu[234] = 1052496966;
        hb.fcyu[235] = -1280322033;
        hb.fcyu[236] = -1698127555;
        hb.fcyu[237] = -1106526056;
        hb.fcyu[238] = 794644599;
        hb.fcyu[239] = -233761751;
        hb.fcyu[240] = 754746092;
        hb.fcyu[241] = 212968039;
        hb.fcyu[242] = 340507440;
        hb.fcyu[243] = -2121839867;
        hb.fcyu[244] = -766766980;
        hb.fcyu[245] = -16956514;
        hb.fcyu[246] = -367740373;
        hb.fcyu[247] = -859039200;
        hb.fcyu[248] = -696397449;
        hb.fcyu[249] = -93086764;
        hb.fcyu[250] = 1630062212;
        hb.fcyu[251] = -100070896;
        hb.fcyu[252] = 1181039762;
        hb.fcyu[253] = 212449343;
        hb.fcyu[254] = 2097261601;
        hb.fcyu[255] = -490303017;
        hb.fcyu[256] = -735386512;
        hb.fcyu[257] = -1798266056;
        hb.fcyu[258] = -638743129;
        hb.fcyu[259] = 540604678;
        hb.fcyu[260] = 991334181;
        hb.fcyu[261] = 1565528575;
        hb.fcyu[262] = -1513673346;
        hb.fcyu[263] = 84041111;
        hb.fcyu[264] = 1976576084;
        hb.fcyu[265] = -2112762020;
        hb.fcyu[266] = 1837425542;
        hb.fcyu[267] = -2117006042;
        hb.fcyu[268] = 320999670;
        hb.fcyu[269] = -562678445;
        hb.fcyu[270] = 865084787;
        hb.fcyu[271] = -1595721868;
        hb.fcyu[272] = -1297382415;
        hb.fcyu[273] = 1825331366;
        hb.fcyu[274] = -2141883707;
        hb.fcyu[275] = 226835485;
        hb.fcyu[276] = 1319698440;
        hb.fcyu[277] = -240203094;
        hb.fcyu[278] = 623229724;
        hb.fcyu[279] = 36706713;
        hb.fcyu[280] = 1340337863;
        hb.fcyu[281] = 407901627;
        hb.fcyu[282] = -1451257071;
        hb.fcyu[283] = -1102987258;
        hb.fcyu[284] = -1942357607;
        hb.fcyu[285] = -942647558;
        hb.fcyu[286] = -1788361393;
        hb.fcyu[287] = 329337755;
        hb.fcyu[288] = 37732992;
        hb.fcyu[289] = -1754817719;
        hb.fcyu[290] = -1780604856;
        hb.fcyu[291] = -1052939156;
        hb.fcyu[292] = 478803131;
        hb.fcyu[293] = 1707533177;
        hb.fcyu[294] = 2079622784;
        hb.fcyu[295] = -1183613478;
        hb.fcyu[296] = 1885527865;
        hb.fcyu[297] = -506728866;
        hb.fcyu[298] = 1356570730;
        hb.fcyu[299] = 2001867409;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void reset() {
        v0 /* !! */  = hb.lq;
        if (true) ** GOTO lbl5
        block26: while (true) {
            v0 /* !! */  = (long)(v1 - hb.fcxy("feoh", fcxr(int ), (int)372));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -421716900: {
                    v1 = hb.fcxy("feoi", fcxr(int ), (int)373);
                    continue block26;
                }
                case 96162446: {
                    break block26;
                }
                case 682670167: {
                    v1 = hb.fcxy("feoj", fcxr(int ), (int)374);
                    continue block26;
                }
                case 1353089684: {
                    v1 = hb.fcxy("feok", fcxr(int ), (int)375);
                    continue block26;
                }
            }
            break;
        }
        var3_1 = hb.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hb.lq - hb.fcxy("feol", fcxr(int ), (int)376)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == hb.fcxy("feom", fcys(int ), (int)677)) break;
            v2 /* !! */  = (long)hb.fcxy("feon", fcys(int ), (int)678);
        }
        var2_2 /* !! */  = hb.b;
        v3 /* !! */  = hb.lq;
        if (true) ** GOTO lbl28
        block28: while (true) {
            v3 /* !! */  = (long)(hb.fcxy("feop", fcxr(int ), (int)378) - hb.fcxy("feoo", fcxr(int ), (int)377));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 96162446: {
                    break block28;
                }
                case 1485417827: {
                    continue block28;
                }
            }
            break;
        }
        var1_3 = hb.a;
        if (var3_1) {
            throw null;
lbl36:
            // 3 sources

            return;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl36
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = hb.lq - hb.fcxy("feoq", fcxr(int ), (int)379)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == hb.fcxy("feor", fcys(int ), (int)679)) break;
                    v4 /* !! */  = (long)hb.fcxy("feos", fcys(int ), (int)680);
                }
                v5 /* !! */  = hb.lq;
                if (true) ** GOTO lbl51
                block31: while (true) {
                    v5 /* !! */  = (long)(v6 - hb.fcxy("feot", fcxr(int ), (int)380));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -852393647: {
                            v6 = hb.fcxy("feou", fcxr(int ), (int)381);
                            continue block31;
                        }
                        case 96162446: {
                            break block31;
                        }
                        case 309692066: {
                            v6 = hb.fcxy("feov", fcxr(int ), (int)382);
                            continue block31;
                        }
                        case 561224218: {
                            v6 = hb.fcxy("feow", fcxr(int ), (int)383);
                            continue block31;
                        }
                    }
                    break;
                }
                this.suspectSet.clear();
                if (var1_3 || var1_3) ** GOTO lbl36
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = hb.lq - hb.fcxy("feox", fcxr(int ), (int)384)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == hb.fcxy("feoy", fcys(int ), (int)681)) break;
                    v7 /* !! */  = (long)hb.fcxy("feoz", fcys(int ), (int)682);
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = hb.lq - hb.fcxy("fepa", fcxr(int ), (int)385)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == hb.fcxy("fepb", fcys(int ), (int)683)) break;
                    v8 /* !! */  = (long)hb.fcxy("fepc", fcys(int ), (int)684);
                }
                hb.botSet.clear();
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl78:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hb.fcxy("fepd", fcys(int ), (int)685);
                    if (!var3_1) break block10;
                    throw null;
                }
            }
lbl83:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)hb.fcxy("fepe", fcys(int ), (int)686);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl92
            }
            case 2: {
                var2_2 /* !! */  = (int)hb.fcxy("fepf", fcys(int ), (int)687);
                if (!var3_1) ** GOTO lbl83
                throw null;
            }
lbl92:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)hb.fcxy("fepg", fcys(int ), (int)688);
                if (!var3_1) ** GOTO lbl78
                throw null;
            }
lbl96:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)hb.fcxy("feph", fcys(int ), (int)689);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl105
            }
            case 5: {
                var2_2 /* !! */  = (int)hb.fcxy("fepi", fcys(int ), (int)690);
                if (!var3_1) break;
                throw null;
            }
lbl105:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)hb.fcxy("fepj", fcys(int ), (int)691);
                if (!var3_1) ** GOTO lbl96
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)hb.fcxy("fepk", fcys(int ), (int)692);
        ** while (!var3_1)
lbl112:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        var4_2 = hb.c;
        var3_3 /* !! */  = hb.b;
        var2_4 = hb.a;
        if (var4_2) {
            throw null;
lbl6:
            // 19 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl6
        if (hb.mc.field_1724 == null) ** GOTO lbl18
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl6
                if (hb.mc.field_1687 == null) ** GOTO lbl18
                if (var2_4) ** GOTO lbl6
                if (hb.mc.method_1562() != null) ** GOTO lbl20
                if (var2_4) ** GOTO lbl6
lbl18:
                // 3 sources

                if (var2_4 || var2_4) ** GOTO lbl6
                return;
lbl20:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl6
                if (this.suspectSet.isEmpty()) ** GOTO lbl25
                if (var2_4 || var2_4) ** GOTO lbl6
                hb.mc.field_1687.method_18456().stream().filter((Predicate<class_742>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$onTick$0(net.minecraft.class_742 ), (Lnet/minecraft/class_742;)Z)((hb)this)).forEach((Consumer<class_742>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, evaluateSuspectPlayer(net.minecraft.class_1657 ), (Lnet/minecraft/class_742;)V)((hb)this));
                if (var2_4) ** GOTO lbl6
lbl25:
                // 2 sources

                if (var2_4 || var2_4) ** GOTO lbl6
                if (!this.mode.isSelected("Matrix")) ** GOTO lbl33
                if (var2_4 || var2_4) ** GOTO lbl6
                this.matrixMode();
                if (var2_4) ** GOTO lbl6
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl46
lbl33:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl6
                if (!this.mode.isSelected("ReallyWorld")) ** GOTO lbl41
                if (var2_4 || var2_4) ** GOTO lbl6
                this.ReallyWorldMode();
                if (var2_4) ** GOTO lbl6
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl46
lbl41:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl6
                if (!this.mode.isSelected("Divine")) ** GOTO lbl46
                if (var2_4 || var2_4) ** GOTO lbl6
                this.newMatrixMode();
                if (var2_4) ** GOTO lbl6
lbl46:
                // 4 sources

                if (var2_4 || var2_4) ** GOTO lbl6
                this.removeDetectedBots();
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl51:
            // 3 sources

            case 0: {
                var3_3 /* !! */  = (int)hb.fcxy("fdcb", fcys(int ), (int)44);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl101
            }
            case 1: {
                var3_3 /* !! */  = (int)hb.fcxy("fdcc", fcys(int ), (int)45);
                if (!var4_2) break;
                throw null;
            }
lbl60:
            // 3 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hb.fcxy("fdcd", fcys(int ), (int)46);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl183
                    break;
                }
            }
lbl66:
            // 3 sources

            case 3: {
                var3_3 /* !! */  = (int)hb.fcxy("fdce", fcys(int ), (int)47);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl179
            }
lbl71:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)hb.fcxy("fdcf", fcys(int ), (int)48);
                if (!var4_2) ** GOTO lbl51
                throw null;
            }
            case 5: {
                var3_3 /* !! */  = (int)hb.fcxy("fdcg", fcys(int ), (int)49);
                if (!var4_2) ** GOTO lbl66
                throw null;
            }
lbl79:
            // 3 sources

            case 6: {
                var3_3 /* !! */  = (int)hb.fcxy("fdci", fcys(int ), (int)50);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl84:
            // 3 sources

            case 7: {
                do {
                    var3_3 /* !! */  = (int)hb.fcxy("fdcj", fcys(int ), (int)51);
                } while (!var4_2);
                throw null;
            }
            case 8: {
                var3_3 /* !! */  = (int)hb.fcxy("fdck", fcys(int ), (int)52);
                if (!var4_2) ** GOTO lbl84
                throw null;
            }
lbl93:
            // 4 sources

            case 9: {
                var3_3 /* !! */  = (int)hb.fcxy("fdcl", fcys(int ), (int)53);
                if (!var4_2) ** GOTO lbl79
                throw null;
            }
lbl97:
            // 2 sources

            case 10: {
                var3_3 /* !! */  = (int)hb.fcxy("fdcm", fcys(int ), (int)54);
                if (!var4_2) ** GOTO lbl84
                throw null;
            }
lbl101:
            // 2 sources

            case 11: {
                var3_3 /* !! */  = (int)hb.fcxy("fdcn", fcys(int ), (int)55);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl129
            }
            case 12: {
                var3_3 /* !! */  = (int)hb.fcxy("fdco", fcys(int ), (int)56);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl138
            }
lbl111:
            // 2 sources

            case 13: {
                var3_3 /* !! */  = (int)hb.fcxy("fdcp", fcys(int ), (int)57);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl150
            }
            case 14: {
                var3_3 /* !! */  = (int)hb.fcxy("fdcq", fcys(int ), (int)58);
                if (!var4_2) ** GOTO lbl66
                throw null;
            }
lbl120:
            // 2 sources

            case 15: {
                var3_3 /* !! */  = (int)hb.fcxy("fdcr", fcys(int ), (int)59);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl187
            }
            case 16: {
                var3_3 /* !! */  = (int)hb.fcxy("fdcs", fcys(int ), (int)60);
                if (!var4_2) ** GOTO lbl71
                throw null;
            }
lbl129:
            // 3 sources

            case 17: {
                var3_3 /* !! */  = (int)hb.fcxy("fdct", fcys(int ), (int)61);
                if (!var4_2) ** GOTO lbl93
                throw null;
            }
            case 18: {
                var3_3 /* !! */  = (int)hb.fcxy("fdcu", fcys(int ), (int)62);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl138:
            // 2 sources

            case 19: {
                var3_3 /* !! */  = (int)hb.fcxy("fdcv", fcys(int ), (int)63);
                if (!var4_2) ** GOTO lbl79
                throw null;
            }
            case 20: {
                var3_3 /* !! */  = (int)hb.fcxy("fdcw", fcys(int ), (int)64);
                if (!var4_2) ** GOTO lbl120
                throw null;
            }
lbl146:
            // 3 sources

            case 21: {
                var3_3 /* !! */  = (int)hb.fcxy("fdcx", fcys(int ), (int)65);
                if (!var4_2) ** GOTO lbl60
                throw null;
            }
lbl150:
            // 3 sources

            case 22: {
                var3_3 /* !! */  = (int)hb.fcxy("fdcy", fcys(int ), (int)66);
                if (!var4_2) ** GOTO lbl93
                throw null;
            }
lbl154:
            // 2 sources

            case 23: {
                var3_3 /* !! */  = (int)hb.fcxy("fdcz", fcys(int ), (int)67);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl196
            }
            case 24: {
                var3_3 /* !! */  = (int)hb.fcxy("fdda", fcys(int ), (int)68);
                if (!var4_2) ** GOTO lbl97
                throw null;
            }
            case 25: {
                var3_3 /* !! */  = (int)hb.fcxy("fddc", fcys(int ), (int)69);
                if (!var4_2) ** GOTO lbl60
                throw null;
            }
            case 26: {
                var3_3 /* !! */  = (int)hb.fcxy("fddd", fcys(int ), (int)70);
                if (!var4_2) ** GOTO lbl154
                throw null;
            }
            case 27: {
                var3_3 /* !! */  = (int)hb.fcxy("fdde", fcys(int ), (int)71);
                if (!var4_2) ** GOTO lbl150
                throw null;
            }
            case 28: {
                var3_3 /* !! */  = (int)hb.fcxy("fddf", fcys(int ), (int)72);
                if (!var4_2) ** GOTO lbl51
                throw null;
            }
lbl179:
            // 2 sources

            case 29: {
                var3_3 /* !! */  = (int)hb.fcxy("fddg", fcys(int ), (int)73);
                if (!var4_2) ** GOTO lbl93
                throw null;
            }
lbl183:
            // 2 sources

            case 30: {
                var3_3 /* !! */  = (int)hb.fcxy("fddh", fcys(int ), (int)74);
                if (!var4_2) ** GOTO lbl129
                throw null;
            }
lbl187:
            // 2 sources

            case 31: {
                var3_3 /* !! */  = (int)hb.fcxy("fddi", fcys(int ), (int)75);
                if (var4_2) {
                    throw null;
                }
            }
            case 32: {
                do {
                    var3_3 /* !! */  = (int)hb.fcxy("fddj", fcys(int ), (int)76);
                } while (!var4_2);
                throw null;
            }
lbl196:
            // 2 sources

            case 33: {
                var3_3 /* !! */  = (int)hb.fcxy("fddk", fcys(int ), (int)77);
                if (!var4_2) ** GOTO lbl111
                throw null;
            }
            case 34: 
        }
        var3_3 /* !! */  = (int)hb.fcxy("fddl", fcys(int ), (int)78);
        ** while (!var4_2)
lbl203:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean lambda$matrixMode$3(UUID var0) {
        v0 /* !! */  = hb.lq;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(v1 - hb.fcxy("ferz", fcxr(int ), (int)422));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 96162446: {
                    break block19;
                }
                case 1635877541: {
                    v1 = hb.fcxy("fesa", fcxr(int ), (int)423);
                    continue block19;
                }
                case 1984203559: {
                    v1 = hb.fcxy("fesb", fcxr(int ), (int)424);
                    continue block19;
                }
            }
            break;
        }
        var3_1 = hb.c;
        v2 /* !! */  = hb.lq;
        block20: while (true) {
            switch ((int)v2 /* !! */ ) {
                case -1709431917: {
                    v2 /* !! */  = (long)(hb.fcxy("fesd", fcxr(int ), (int)426) - hb.fcxy("fesc", fcxr(int ), (int)425));
                    continue block20;
                }
                case 96162446: {
                    break block20;
                }
            }
            break;
        }
        var2_2 /* !! */  = hb.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = hb.lq - hb.fcxy("fese", fcxr(int ), (int)427)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == hb.fcxy("fesf", fcys(int ), (int)723)) {
                var1_3 = hb.a;
                if (var3_1) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)hb.fcxy("fesg", fcys(int ), (int)724);
        }
        if (var1_3) return (boolean)hb.fcxy("fesh", fcys(int ), (int)725);
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block22: while (true) {
            block42: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_3) return (boolean)hb.fcxy("fesh", fcys(int ), (int)725);
                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_2 = hb.lq - hb.fcxy("fesi", fcxr(int ), (int)428)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                            if (v4 /* !! */  != hb.fcxy("fesj", fcys(int ), (int)726)) {
                                v4 /* !! */  = (long)hb.fcxy("fesk", fcys(int ), (int)727);
                                continue;
                            }
                            ** GOTO lbl56
                            break;
                        }
                    }
                    case 1: {
                        var2_2 /* !! */  = (int)hb.fcxy("fesu", fcys(int ), (int)735);
                        cfr_temp_0 = 5;
                        if (var3_1) {
                            throw null;
                        }
                        break block42;
                    }
                    case 4: {
                        ** GOTO lbl93
                    }
                    case 7: {
                        ** GOTO lbl90
                    }
lbl56:
                    // 1 sources

                    while (true) {
                        if ((v5 /* !! */  = (cfr_temp_3 = hb.lq - hb.fcxy("fesl", fcxr(int ), (int)429)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v5 /* !! */  == hb.fcxy("fesm", fcys(int ), (int)728)) break;
                        v5 /* !! */  = (long)hb.fcxy("fesn", fcys(int ), (int)729);
                    }
                    v6 = hb.mc.field_1687;
                    while (true) {
                        if ((v7 /* !! */  = (cfr_temp_4 = hb.lq - hb.fcxy("feso", fcxr(int ), (int)430)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v7 /* !! */  != hb.fcxy("fesp", fcys(int ), (int)730)) ** GOTO lbl68
                        if (v6.method_18470(var0) == null) {
                            break;
                        }
                        ** GOTO lbl74
lbl68:
                        // 1 sources

                        v7 /* !! */  = (long)hb.fcxy("fesq", fcys(int ), (int)731);
                    }
                    if (var1_3) return (boolean)hb.fcxy("fesh", fcys(int ), (int)725);
                    v8 = hb.fcxy("fesr", fcys(int ), (int)732);
                    if (!var3_1) return (boolean)v8;
                    throw null;
lbl74:
                    // 1 sources

                    if (var1_3 || var1_3) {
                        return (boolean)hb.fcxy("fesh", fcys(int ), (int)725);
                    }
                    v8 = hb.fcxy("fess", fcys(int ), (int)733);
                    return (boolean)v8;
                    case 0: {
                        var2_2 /* !! */  = (int)hb.fcxy("fest", fcys(int ), (int)734);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 2: {
                        var2_2 /* !! */  = (int)hb.fcxy("fesv", fcys(int ), (int)736);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)hb.fcxy("fesw", fcys(int ), (int)737);
                        if (!var3_1) ** break;
                        throw null;
lbl90:
                        // 2 sources

                        var2_2 /* !! */  = (int)hb.fcxy("feta", fcys(int ), (int)741);
                        if (var3_1) {
                            throw null;
                        }
lbl93:
                        // 3 sources

                        var2_2 /* !! */  = (int)hb.fcxy("fesx", fcys(int ), (int)738);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 5: {
                        var2_2 /* !! */  = (int)hb.fcxy("fesy", fcys(int ), (int)739);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 6: 
                }
                ** GOTO lbl105
            }
            do {
                if (true) continue block22;
lbl105:
                // 2 sources

                var2_2 /* !! */  = (int)hb.fcxy("fesz", fcys(int ), (int)740);
                cfr_temp_0 = 0;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void fext() {
        hb.fcyv[500] = -1098821577;
        hb.fcyv[501] = -743830084;
        hb.fcyv[502] = 1202330504;
        hb.fcyv[503] = -1893487017;
        hb.fcyv[504] = -780954946;
        hb.fcyv[505] = -773890230;
        hb.fcyv[506] = -550246792;
        hb.fcyv[507] = -1523952637;
        hb.fcyv[508] = -1626128973;
        hb.fcyv[509] = -1774583191;
        hb.fcyv[510] = -733392757;
        hb.fcyv[511] = -398233831;
        hb.fcyv[512] = 630521423;
        hb.fcyv[513] = -1385291991;
        hb.fcyv[514] = -1206703170;
        hb.fcyv[515] = 121975249;
        hb.fcyv[516] = -1178621507;
        hb.fcyv[517] = -1997253243;
        hb.fcyv[518] = 242903671;
        hb.fcyv[519] = -1908952489;
        hb.fcyv[520] = -1214605632;
        hb.fcyv[521] = -1608184907;
        hb.fcyv[522] = -1017700600;
        hb.fcyv[523] = -972902473;
        hb.fcyv[524] = -1943985921;
        hb.fcyv[525] = -702804075;
        hb.fcyv[526] = 1436444091;
        hb.fcyv[527] = -100354433;
        hb.fcyv[528] = 255879306;
        hb.fcyv[529] = -701492341;
        hb.fcyv[530] = 692486665;
        hb.fcyv[531] = 435322776;
        hb.fcyv[532] = -1577299399;
        hb.fcyv[533] = -1872521643;
        hb.fcyv[534] = -1543227995;
        hb.fcyv[535] = 994767310;
        hb.fcyv[536] = 1675674844;
        hb.fcyv[537] = 998812204;
        hb.fcyv[538] = 144761548;
        hb.fcyv[539] = -582273137;
        hb.fcyv[540] = 1982662071;
        hb.fcyv[541] = -1558402565;
        hb.fcyv[542] = -354237254;
        hb.fcyv[543] = 959671581;
        hb.fcyv[544] = 420244262;
        hb.fcyv[545] = 1403111167;
        hb.fcyv[546] = 388379273;
        hb.fcyv[547] = -200560019;
        hb.fcyv[548] = -1107925780;
        hb.fcyv[549] = -969834336;
        hb.fcyv[550] = 482075085;
        hb.fcyv[551] = 1894775064;
        hb.fcyv[552] = -531451526;
        hb.fcyv[553] = 657890013;
        hb.fcyv[554] = 323649217;
        hb.fcyv[555] = 473542193;
        hb.fcyv[556] = 629710388;
        hb.fcyv[557] = 149615276;
        hb.fcyv[558] = 1621081627;
        hb.fcyv[559] = -2037634821;
        hb.fcyv[560] = 1691571166;
        hb.fcyv[561] = -326957171;
        hb.fcyv[562] = 1690557987;
        hb.fcyv[563] = -2014525022;
        hb.fcyv[564] = -1495475994;
        hb.fcyv[565] = -395861475;
        hb.fcyv[566] = 55674228;
        hb.fcyv[567] = 1547878731;
        hb.fcyv[568] = -1916307552;
        hb.fcyv[569] = -1712267162;
        hb.fcyv[570] = 1702405362;
        hb.fcyv[571] = 1269999929;
        hb.fcyv[572] = -1823484942;
        hb.fcyv[573] = 1394848084;
        hb.fcyv[574] = -1806241086;
        hb.fcyv[575] = -103198104;
        hb.fcyv[576] = 1218879888;
        hb.fcyv[577] = 2002331069;
        hb.fcyv[578] = -29711174;
        hb.fcyv[579] = -1581228302;
        hb.fcyv[580] = -1080702066;
        hb.fcyv[581] = 1980711514;
        hb.fcyv[582] = -236227566;
        hb.fcyv[583] = -1355248205;
        hb.fcyv[584] = -384302793;
        hb.fcyv[585] = -446271982;
        hb.fcyv[586] = 903063644;
        hb.fcyv[587] = -1407542224;
        hb.fcyv[588] = -618939364;
        hb.fcyv[589] = 1611726974;
        hb.fcyv[590] = -1699062351;
        hb.fcyv[591] = 1726350359;
        hb.fcyv[592] = -732100964;
        hb.fcyv[593] = 403245377;
        hb.fcyv[594] = 1740890193;
        hb.fcyv[595] = 396557406;
        hb.fcyv[596] = 1850642470;
        hb.fcyv[597] = 1519765808;
        hb.fcyv[598] = -1340467526;
        hb.fcyv[599] = 1355915073;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ void lambda$removePlayerBecauseLeftServer$2(UUID var1_1) {
        v0 /* !! */  = hb.lq;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(hb.fcxy("fetc", fcxr(int ), (int)432) - hb.fcxy("fetb", fcxr(int ), (int)431));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 89375095: {
                    continue block24;
                }
                case 96162446: {
                    break block24;
                }
            }
            break;
        }
        var4_2 = hb.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = hb.lq - hb.fcxy("fetd", fcxr(int ), (int)433)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hb.fcxy("fete", fcys(int ), (int)742)) break;
            v1 /* !! */  = (long)hb.fcxy("fetf", fcys(int ), (int)743);
        }
        var3_3 /* !! */  = hb.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = hb.lq - hb.fcxy("fetg", fcxr(int ), (int)434)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hb.fcxy("feth", fcys(int ), (int)744)) break;
            v2 /* !! */  = (long)hb.fcxy("feti", fcys(int ), (int)745);
        }
        var2_4 = hb.a;
        if (var4_2) {
            throw null;
lbl27:
            // 4 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl27
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = hb.lq - hb.fcxy("fetj", fcxr(int ), (int)435)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == hb.fcxy("fetk", fcys(int ), (int)746)) break;
            v3 /* !! */  = (long)hb.fcxy("fetl", fcys(int ), (int)747);
        }
        v4 /* !! */  = hb.lq;
        if (true) ** GOTO lbl40
        block29: while (true) {
            v4 /* !! */  = (long)(v5 - hb.fcxy("fetm", fcxr(int ), (int)436));
lbl40:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -450366376: {
                    v5 = hb.fcxy("fetn", fcxr(int ), (int)437);
                    continue block29;
                }
                case 96162446: {
                    break block29;
                }
                case 281970883: {
                    v5 = hb.fcxy("feto", fcxr(int ), (int)438);
                    continue block29;
                }
            }
            break;
        }
        this.suspectSet.remove(var1_1);
        if (var2_4 || var2_4) ** GOTO lbl27
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_3 = hb.lq - hb.fcxy("fetp", fcxr(int ), (int)439)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v6 /* !! */  == hb.fcxy("fetq", fcys(int ), (int)748)) break;
            v6 /* !! */  = (long)hb.fcxy("fetr", fcys(int ), (int)749);
        }
        v7 /* !! */  = hb.lq;
        if (true) ** GOTO lbl62
        block31: while (true) {
            v7 /* !! */  = (long)(v8 - hb.fcxy("fets", fcxr(int ), (int)440));
lbl62:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -2047397525: {
                    v8 = hb.fcxy("fett", fcxr(int ), (int)441);
                    continue block31;
                }
                case 96162446: {
                    break block31;
                }
                case 1847804738: {
                    v8 = hb.fcxy("fetu", fcxr(int ), (int)442);
                    continue block31;
                }
            }
            break;
        }
        hb.botSet.remove(var1_1);
        if (var2_4) ** GOTO lbl27
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
lbl80:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)hb.fcxy("fetv", fcys(int ), (int)750);
                if (var4_2) {
                    throw null;
                }
            }
lbl84:
            // 4 sources

            case 1: {
                var3_3 /* !! */  = (int)hb.fcxy("fetw", fcys(int ), (int)751);
                if (!var4_2) ** GOTO lbl80
                throw null;
            }
lbl88:
            // 3 sources

            case 2: {
                var3_3 /* !! */  = (int)hb.fcxy("fetx", fcys(int ), (int)752);
                if (!var4_2) ** GOTO lbl84
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)hb.fcxy("fety", fcys(int ), (int)753);
                if (!var4_2) break;
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)hb.fcxy("fetz", fcys(int ), (int)754);
                if (var4_2) {
                    throw null;
                }
            }
            case 5: {
                var3_3 /* !! */  = (int)hb.fcxy("feua", fcys(int ), (int)755);
                if (!var4_2) ** GOTO lbl88
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)hb.fcxy("feub", fcys(int ), (int)756);
                if (!var4_2) ** GOTO lbl88
                throw null;
            }
            case 7: 
        }
        do {
            var3_3 /* !! */  = (int)hb.fcxy("feuc", fcys(int ), (int)757);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void feyf() {
        hb.fcxu[400] = 77110164397001598L;
        hb.fcxu[401] = 6876519520543930363L;
        hb.fcxu[402] = -8576331118277777299L;
        hb.fcxu[403] = 603120226781278903L;
        hb.fcxu[404] = -3530117196684200075L;
        hb.fcxu[405] = -2865488791760169608L;
        hb.fcxu[406] = -8721452989987404449L;
        hb.fcxu[407] = -7064786379887189650L;
        hb.fcxu[408] = -5436543719322103351L;
        hb.fcxu[409] = 515582009558380284L;
        hb.fcxu[410] = 3475871044954722720L;
        hb.fcxu[411] = -1455007340024592042L;
        hb.fcxu[412] = 405326149642136596L;
        hb.fcxu[413] = -2919665778451805913L;
        hb.fcxu[414] = -723428790534251851L;
        hb.fcxu[415] = 2906708217085256742L;
        hb.fcxu[416] = 7037080386675398180L;
        hb.fcxu[417] = 2239588130543609096L;
        hb.fcxu[418] = 4202771501545166593L;
        hb.fcxu[419] = -6482651687871683355L;
        hb.fcxu[420] = -1195671025907145335L;
        hb.fcxu[421] = 2638258835249949211L;
        hb.fcxu[422] = 8815522406151414378L;
        hb.fcxu[423] = -2954638507945548497L;
        hb.fcxu[424] = 8579680209323181010L;
        hb.fcxu[425] = -2472892061330771417L;
        hb.fcxu[426] = -1983333980725716552L;
        hb.fcxu[427] = 19677944502167491L;
        hb.fcxu[428] = -4296473486142039190L;
        hb.fcxu[429] = -2142960748620559928L;
        hb.fcxu[430] = 8442764119301033095L;
        hb.fcxu[431] = 8720871568805693733L;
        hb.fcxu[432] = 4878154533384276061L;
        hb.fcxu[433] = 7366932675500233103L;
        hb.fcxu[434] = -2445659700359741381L;
        hb.fcxu[435] = -6678591074700197627L;
        hb.fcxu[436] = -9147622927385847214L;
        hb.fcxu[437] = -859618714895232860L;
        hb.fcxu[438] = -8703910208489773741L;
        hb.fcxu[439] = -347787514640987169L;
        hb.fcxu[440] = -6058216410441181706L;
        hb.fcxu[441] = -6133931170854131058L;
        hb.fcxu[442] = -5681518829458058755L;
        hb.fcxu[443] = -5668119862169198214L;
        hb.fcxu[444] = -1631754353367597850L;
        hb.fcxu[445] = -7990228893385727933L;
        hb.fcxu[446] = 7101133870957044614L;
        hb.fcxu[447] = 2469737743259602251L;
        hb.fcxu[448] = 6333143754499019902L;
        hb.fcxu[449] = -3636140468930135281L;
        hb.fcxu[450] = -6765801663528663199L;
        hb.fcxu[451] = 1166876407900338232L;
        hb.fcxu[452] = 9122964215434566391L;
        hb.fcxu[453] = 5049315553049981535L;
        hb.fcxu[454] = 7245424454495349823L;
        hb.fcxu[455] = -1474867728427118932L;
        hb.fcxu[456] = 3269439505937029558L;
        hb.fcxu[457] = -3630612112763475776L;
        hb.fcxu[458] = -7900362890319497511L;
        hb.fcxu[459] = 152390194568977364L;
        hb.fcxu[460] = -4655355383942892567L;
        hb.fcxu[461] = 3289150490145585698L;
        hb.fcxu[462] = -3667481304678695442L;
        hb.fcxu[463] = 6485808606806906499L;
        hb.fcxu[464] = 9198552708108786429L;
        hb.fcxu[465] = 3616943653507286105L;
        hb.fcxu[466] = -1987818781544266052L;
        hb.fcxu[467] = -2399593337528421970L;
        hb.fcxu[468] = -1939611659969391834L;
        hb.fcxu[469] = 7171239653455609757L;
        hb.fcxu[470] = -4331135771980459637L;
        hb.fcxu[471] = 7834574807901371632L;
        hb.fcxu[472] = -6402473939219839014L;
        hb.fcxu[473] = -1419753477543741918L;
        hb.fcxu[474] = 1814075120415493196L;
        hb.fcxu[475] = 2051802761364182717L;
        hb.fcxu[476] = 5465216125556646609L;
        hb.fcxu[477] = 5233471696150065353L;
        hb.fcxu[478] = 1303713905389507272L;
        hb.fcxu[479] = -2296363941706866922L;
        hb.fcxu[480] = -8931688781361214628L;
        hb.fcxu[481] = 7562917366110757922L;
        hb.fcxu[482] = 7513580464781136469L;
        hb.fcxu[483] = 8662598883212300278L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isBot(class_1657 var1_1) {
        v0 /* !! */  = hb.lq;
        if (true) ** GOTO lbl5
        block54: while (true) {
            v0 /* !! */  = (long)(hb.fcxy("feis", fcxr(int ), (int)313) - hb.fcxy("feir", fcxr(int ), (int)312));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -349048499: {
                    continue block54;
                }
                case 96162446: {
                    break block54;
                }
            }
            break;
        }
        var7_2 = hb.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = hb.lq - hb.fcxy("feit", fcxr(int ), (int)314)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == hb.fcxy("feiu", fcys(int ), (int)591)) break;
            v1 /* !! */  = (long)hb.fcxy("feiv", fcys(int ), (int)592);
        }
        var6_3 /* !! */  = hb.b;
        v2 /* !! */  = hb.lq;
        if (true) ** GOTO lbl21
        block56: while (true) {
            v2 /* !! */  = (long)(hb.fcxy("feix", fcxr(int ), (int)316) - hb.fcxy("feiw", fcxr(int ), (int)315));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 96162446: {
                    break block56;
                }
                case 2017225846: {
                    continue block56;
                }
            }
            break;
        }
        var5_4 = hb.a;
        if (var7_2) {
            throw null;
lbl29:
            // 13 sources

            return (boolean)hb.fcxy("feiy", fcys(int ), (int)593);
        }
        if (var5_4 || var5_4) ** GOTO lbl29
        v3 /* !! */  = hb.lq;
        if (true) ** GOTO lbl36
        block58: while (true) {
            v3 /* !! */  = (long)(v4 - hb.fcxy("feiz", fcxr(int ), (int)317));
lbl36:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1628862091: {
                    v4 = hb.fcxy("feja", fcxr(int ), (int)318);
                    continue block58;
                }
                case 77329038: {
                    v4 = hb.fcxy("fejb", fcxr(int ), (int)319);
                    continue block58;
                }
                case 96162446: {
                    break block58;
                }
                case 320823205: {
                    v4 = hb.fcxy("fejc", fcxr(int ), (int)320);
                    continue block58;
                }
            }
            break;
        }
        v5 = var1_1.method_5477();
        v6 /* !! */  = hb.lq;
        if (true) ** GOTO lbl53
        block59: while (true) {
            v6 /* !! */  = (long)(hb.fcxy("feje", fcxr(int ), (int)322) - hb.fcxy("fejd", fcxr(int ), (int)321));
lbl53:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1670139774: {
                    continue block59;
                }
                case 96162446: {
                    break block59;
                }
            }
            break;
        }
        var2_5 = v5.getString();
        if (var5_4 || var5_4) ** GOTO lbl29
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_1 = hb.lq - hb.fcxy("fejf", fcxr(int ), (int)323)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == hb.fcxy("fejg", fcys(int ), (int)594)) break;
            v7 /* !! */  = (long)hb.fcxy("fejh", fcys(int ), (int)595);
        }
        if (!var2_5.startsWith("CIT-")) ** GOTO lbl88
        if (var5_4) ** GOTO lbl29
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_2 = hb.lq - hb.fcxy("feji", fcxr(int ), (int)324)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == hb.fcxy("fejj", fcys(int ), (int)596)) break;
            v8 /* !! */  = (long)hb.fcxy("fejk", fcys(int ), (int)597);
        }
        if (var2_5.contains("NPC")) ** GOTO lbl88
        if (var5_4) ** GOTO lbl29
        if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
        block18 : switch (var6_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = hb.lq - hb.fcxy("fejl", fcxr(int ), (int)325)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == hb.fcxy("fejm", fcys(int ), (int)598)) break;
                    v9 /* !! */  = (long)hb.fcxy("fejn", fcys(int ), (int)599);
                }
                if (var2_5.startsWith("[ZNPC]")) ** GOTO lbl88
                if (var5_4) ** GOTO lbl29
                v10 = hb.fcxy("fejo", fcys(int ), (int)600);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl90
lbl88:
                // 3 sources

                if (var5_4 || var5_4) ** GOTO lbl29
                v10 = var3_6 = hb.fcxy("fejp", fcys(int ), (int)601);
lbl90:
                // 2 sources

                if (var5_4 || var5_4) ** GOTO lbl29
                v11 /* !! */  = hb.lq;
                if (true) ** GOTO lbl95
                block63: while (true) {
                    v11 /* !! */  = (long)(v12 - hb.fcxy("fejq", fcxr(int ), (int)326));
lbl95:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1008486977: {
                            v12 = hb.fcxy("fejr", fcxr(int ), (int)327);
                            continue block63;
                        }
                        case 96162446: {
                            break block63;
                        }
                        case 284284241: {
                            v12 = hb.fcxy("fejs", fcxr(int ), (int)328);
                            continue block63;
                        }
                        case 2051644630: {
                            v12 = hb.fcxy("fejt", fcxr(int ), (int)329);
                            continue block63;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_4 = hb.lq - hb.fcxy("feju", fcxr(int ), (int)330)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == hb.fcxy("fejv", fcys(int ), (int)602)) break;
                    v13 /* !! */  = (long)hb.fcxy("fejw", fcys(int ), (int)603);
                }
                v14 = var1_1.method_5667();
                v15 /* !! */  = hb.lq;
                if (true) ** GOTO lbl117
                block65: while (true) {
                    v15 /* !! */  = (long)(hb.fcxy("fejy", fcxr(int ), (int)332) - hb.fcxy("fejx", fcxr(int ), (int)331));
lbl117:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case 96162446: {
                            break block65;
                        }
                        case 1814186944: {
                            continue block65;
                        }
                    }
                    break;
                }
                var4_7 = hb.botSet.contains(v14);
                if (var5_4 || var5_4) ** GOTO lbl29
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_5 = hb.lq - hb.fcxy("fejz", fcxr(int ), (int)333)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == hb.fcxy("feka", fcys(int ), (int)604)) break;
                    v16 /* !! */  = (long)hb.fcxy("fekb", fcys(int ), (int)605);
                }
                this.isBotU((class_1297)var1_1);
                if (var5_4 || var5_4) ** GOTO lbl29
                if (var3_6 != false) ** GOTO lbl135
                if (var5_4) ** GOTO lbl29
                if (!var4_7) ** GOTO lbl140
                if (var5_4) ** GOTO lbl29
lbl135:
                // 2 sources

                if (var5_4 || var5_4) ** GOTO lbl29
                v17 = hb.fcxy("fekc", fcys(int ), (int)606);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl143
lbl140:
                // 1 sources

                if (!var5_4 && !var5_4) ** break;
                ** continue;
                v17 = hb.fcxy("fekd", fcys(int ), (int)607);
lbl143:
                // 2 sources

                return (boolean)v17;
            }
            case 0: {
                var6_3 /* !! */  = (int)hb.fcxy("feke", fcys(int ), (int)608);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl149:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_3 /* !! */  = (int)hb.fcxy("fekf", fcys(int ), (int)609);
                    if (!var7_2) break block18;
                    throw null;
                }
            }
lbl154:
            // 4 sources

            case 2: {
                var6_3 /* !! */  = (int)hb.fcxy("fekg", fcys(int ), (int)610);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl159:
            // 3 sources

            case 3: {
                var6_3 /* !! */  = (int)hb.fcxy("fekh", fcys(int ), (int)611);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl164:
            // 3 sources

            case 4: {
                var6_3 /* !! */  = (int)hb.fcxy("feki", fcys(int ), (int)612);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl200
            }
            case 5: {
                var6_3 /* !! */  = (int)hb.fcxy("fekj", fcys(int ), (int)613);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl196
            }
lbl174:
            // 3 sources

            case 6: {
                var6_3 /* !! */  = (int)hb.fcxy("fekk", fcys(int ), (int)614);
                if (!var7_2) ** GOTO lbl159
                throw null;
            }
            case 7: {
                var6_3 /* !! */  = (int)hb.fcxy("fekl", fcys(int ), (int)615);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl230
            }
            case 8: {
                var6_3 /* !! */  = (int)hb.fcxy("fekm", fcys(int ), (int)616);
                if (!var7_2) ** GOTO lbl164
                throw null;
            }
            case 9: {
                var6_3 /* !! */  = (int)hb.fcxy("fekn", fcys(int ), (int)617);
                if (!var7_2) ** GOTO lbl164
                throw null;
            }
lbl191:
            // 2 sources

            case 10: {
                var6_3 /* !! */  = (int)hb.fcxy("feko", fcys(int ), (int)618);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl230
            }
lbl196:
            // 2 sources

            case 11: {
                var6_3 /* !! */  = (int)hb.fcxy("fekp", fcys(int ), (int)619);
                if (!var7_2) break;
                throw null;
            }
lbl200:
            // 3 sources

            case 12: {
                var6_3 /* !! */  = (int)hb.fcxy("fekq", fcys(int ), (int)620);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl242
            }
            case 13: {
                var6_3 /* !! */  = (int)hb.fcxy("fekr", fcys(int ), (int)621);
                if (!var7_2) ** GOTO lbl149
                throw null;
            }
            case 14: {
                var6_3 /* !! */  = (int)hb.fcxy("feks", fcys(int ), (int)622);
                if (!var7_2) ** GOTO lbl154
                throw null;
            }
lbl213:
            // 2 sources

            case 15: {
                var6_3 /* !! */  = (int)hb.fcxy("fekt", fcys(int ), (int)623);
                if (!var7_2) ** GOTO lbl191
                throw null;
            }
            case 16: {
                var6_3 /* !! */  = (int)hb.fcxy("feku", fcys(int ), (int)624);
                if (!var7_2) break;
                throw null;
            }
            case 17: {
                do {
                    var6_3 /* !! */  = (int)hb.fcxy("fekv", fcys(int ), (int)625);
                } while (!var7_2);
                throw null;
            }
lbl226:
            // 2 sources

            case 18: {
                var6_3 /* !! */  = (int)hb.fcxy("fekw", fcys(int ), (int)626);
                if (!var7_2) ** GOTO lbl200
                throw null;
            }
lbl230:
            // 3 sources

            case 19: {
                var6_3 /* !! */  = (int)hb.fcxy("fekx", fcys(int ), (int)627);
                if (!var7_2) ** GOTO lbl159
                throw null;
            }
            case 20: {
                var6_3 /* !! */  = (int)hb.fcxy("feky", fcys(int ), (int)628);
                if (!var7_2) ** GOTO lbl154
                throw null;
            }
            case 21: {
                var6_3 /* !! */  = (int)hb.fcxy("fekz", fcys(int ), (int)629);
                if (!var7_2) ** GOTO lbl154
                throw null;
            }
lbl242:
            // 2 sources

            case 22: {
                var6_3 /* !! */  = (int)hb.fcxy("fela", fcys(int ), (int)630);
                if (!var7_2) ** GOTO lbl213
                throw null;
            }
            case 23: 
        }
        var6_3 /* !! */  = (int)hb.fcxy("felb", fcys(int ), (int)631);
        ** while (!var7_2)
lbl249:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long fcxr(int n2) {
        return fcxs[n2] ^ fcxu[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ void lambda$checkPlayerAfterSpawn$1(class_2703.class_2705 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hb.lq - hb.fcxy("feud", fcxr(int ), (int)443)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == hb.fcxy("feue", fcys(int ), (int)758)) break;
            v0 /* !! */  = (long)hb.fcxy("feuf", fcys(int ), (int)759);
        }
        var5_2 = hb.c;
        v1 /* !! */  = hb.lq;
        if (true) ** GOTO lbl11
        block70: while (true) {
            v1 /* !! */  = (long)(hb.fcxy("feuh", fcxr(int ), (int)445) - hb.fcxy("feug", fcxr(int ), (int)444));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 96162446: {
                    break block70;
                }
                case 735498503: {
                    continue block70;
                }
            }
            break;
        }
        var4_3 /* !! */  = hb.b;
        v2 /* !! */  = hb.lq;
        if (true) ** GOTO lbl21
        block71: while (true) {
            v2 /* !! */  = (long)(hb.fcxy("feuj", fcxr(int ), (int)447) - hb.fcxy("feui", fcxr(int ), (int)446));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1062875512: {
                    continue block71;
                }
                case 96162446: {
                    break block71;
                }
            }
            break;
        }
        var3_4 = hb.a;
        if (var5_2) {
            throw null;
lbl29:
            // 11 sources

            return;
        }
        if (var3_4 || var3_4) ** GOTO lbl29
        v3 /* !! */  = hb.lq;
        if (true) ** GOTO lbl36
        block73: while (true) {
            v3 /* !! */  = (long)(v4 - hb.fcxy("feuk", fcxr(int ), (int)448));
lbl36:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 96162446: {
                    break block73;
                }
                case 552250505: {
                    v4 = hb.fcxy("feul", fcxr(int ), (int)449);
                    continue block73;
                }
                case 962168600: {
                    v4 = hb.fcxy("feum", fcxr(int ), (int)450);
                    continue block73;
                }
                case 1837445875: {
                    v4 = hb.fcxy("feun", fcxr(int ), (int)451);
                    continue block73;
                }
            }
            break;
        }
        var2_5 = var1_1.comp_1107();
        if (var3_4 || var3_4) ** GOTO lbl29
        if (var2_5 == null) ** GOTO lbl73
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4) ** GOTO lbl29
                v5 /* !! */  = hb.lq;
                if (true) ** GOTO lbl59
                block74: while (true) {
                    v5 /* !! */  = (long)(v6 - hb.fcxy("feuo", fcxr(int ), (int)452));
lbl59:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -370650901: {
                            v6 = hb.fcxy("feup", fcxr(int ), (int)453);
                            continue block74;
                        }
                        case 96162446: {
                            break block74;
                        }
                        case 877565606: {
                            v6 = hb.fcxy("feuq", fcxr(int ), (int)454);
                            continue block74;
                        }
                        case 1366674644: {
                            v6 = hb.fcxy("feur", fcxr(int ), (int)455);
                            continue block74;
                        }
                    }
                    break;
                }
                if (!this.isRealPlayer(var1_1, var2_5)) ** GOTO lbl75
                if (var3_4) ** GOTO lbl29
lbl73:
                // 2 sources

                if (var3_4 || var3_4) ** GOTO lbl29
                return;
lbl75:
                // 1 sources

                if (var3_4 || var3_4) ** GOTO lbl29
                v7 /* !! */  = hb.lq;
                if (true) ** GOTO lbl80
                block75: while (true) {
                    v7 /* !! */  = (long)(v8 - hb.fcxy("feus", fcxr(int ), (int)456));
lbl80:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -683682683: {
                            v8 = hb.fcxy("feut", fcxr(int ), (int)457);
                            continue block75;
                        }
                        case -182562872: {
                            v8 = hb.fcxy("feuu", fcxr(int ), (int)458);
                            continue block75;
                        }
                        case 96162446: {
                            break block75;
                        }
                    }
                    break;
                }
                if (!this.isDuplicateProfile(var2_5)) ** GOTO lbl139
                if (var3_4 || var3_4) ** GOTO lbl29
                v9 /* !! */  = hb.lq;
                if (true) ** GOTO lbl95
                block76: while (true) {
                    v9 /* !! */  = (long)(v10 - hb.fcxy("feuv", fcxr(int ), (int)459));
lbl95:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1247807564: {
                            v10 = hb.fcxy("feuw", fcxr(int ), (int)460);
                            continue block76;
                        }
                        case -841398191: {
                            v10 = hb.fcxy("feux", fcxr(int ), (int)461);
                            continue block76;
                        }
                        case -223549686: {
                            v10 = hb.fcxy("feuy", fcxr(int ), (int)462);
                            continue block76;
                        }
                        case 96162446: {
                            break block76;
                        }
                    }
                    break;
                }
                v11 /* !! */  = hb.lq;
                if (true) ** GOTO lbl111
                block77: while (true) {
                    v11 /* !! */  = (long)(hb.fcxy("feva", fcxr(int ), (int)464) - hb.fcxy("feuz", fcxr(int ), (int)463));
lbl111:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1419256279: {
                            continue block77;
                        }
                        case 96162446: {
                            break block77;
                        }
                    }
                    break;
                }
                v12 = var2_5.id();
                v13 /* !! */  = hb.lq;
                if (true) ** GOTO lbl121
                block78: while (true) {
                    v13 /* !! */  = (long)(v14 - hb.fcxy("fevb", fcxr(int ), (int)465));
lbl121:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -622784839: {
                            v14 = hb.fcxy("fevc", fcxr(int ), (int)466);
                            continue block78;
                        }
                        case 96162446: {
                            break block78;
                        }
                        case 1650696513: {
                            v14 = hb.fcxy("fevd", fcxr(int ), (int)467);
                            continue block78;
                        }
                        case 1859583304: {
                            v14 = hb.fcxy("feve", fcxr(int ), (int)468);
                            continue block78;
                        }
                    }
                    break;
                }
                hb.botSet.add(v12);
                if (var3_4) ** GOTO lbl29
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl166
lbl139:
                // 1 sources

                if (var3_4 || var3_4) ** GOTO lbl29
                v15 /* !! */  = hb.lq;
                if (true) ** GOTO lbl144
                block79: while (true) {
                    v15 /* !! */  = (long)(v16 - hb.fcxy("fevf", fcxr(int ), (int)469));
lbl144:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -794675094: {
                            v16 = hb.fcxy("fevg", fcxr(int ), (int)470);
                            continue block79;
                        }
                        case -212271402: {
                            v16 = hb.fcxy("fevh", fcxr(int ), (int)471);
                            continue block79;
                        }
                        case 96162446: {
                            break block79;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_1 = hb.lq - hb.fcxy("fevi", fcxr(int ), (int)472)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == hb.fcxy("fevj", fcys(int ), (int)760)) break;
                    v17 /* !! */  = (long)hb.fcxy("fevk", fcys(int ), (int)761);
                }
                v18 = var2_5.id();
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_2 = hb.lq - hb.fcxy("fevl", fcxr(int ), (int)473)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == hb.fcxy("fevm", fcys(int ), (int)762)) break;
                    v19 /* !! */  = (long)hb.fcxy("fevn", fcys(int ), (int)763);
                }
                this.suspectSet.add(v18);
                if (var3_4) ** GOTO lbl29
lbl166:
                // 2 sources

                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return;
            }
lbl169:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)hb.fcxy("fevo", fcys(int ), (int)764);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl233
            }
lbl174:
            // 2 sources

            case 1: {
                var4_3 /* !! */  = (int)hb.fcxy("fevp", fcys(int ), (int)765);
                if (!var5_2) ** GOTO lbl169
                throw null;
            }
            case 2: {
                var4_3 /* !! */  = (int)hb.fcxy("fevq", fcys(int ), (int)766);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl192
            }
lbl183:
            // 2 sources

            case 3: {
                var4_3 /* !! */  = (int)hb.fcxy("fevr", fcys(int ), (int)767);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl192
            }
            case 4: {
                var4_3 /* !! */  = (int)hb.fcxy("fevs", fcys(int ), (int)768);
                if (!var5_2) break;
                throw null;
            }
lbl192:
            // 6 sources

            case 5: {
                var4_3 /* !! */  = (int)hb.fcxy("fevt", fcys(int ), (int)769);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl217
            }
lbl197:
            // 2 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)hb.fcxy("fevu", fcys(int ), (int)770);
                    if (!var5_2) ** GOTO lbl192
                    throw null;
                }
            }
            case 7: {
                var4_3 /* !! */  = (int)hb.fcxy("fevv", fcys(int ), (int)771);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl217
            }
lbl207:
            // 2 sources

            case 8: {
                var4_3 /* !! */  = (int)hb.fcxy("fevw", fcys(int ), (int)772);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl217
            }
lbl212:
            // 2 sources

            case 9: {
                var4_3 /* !! */  = (int)hb.fcxy("fevx", fcys(int ), (int)773);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl233
            }
lbl217:
            // 5 sources

            case 10: {
                var4_3 /* !! */  = (int)hb.fcxy("fevy", fcys(int ), (int)774);
                if (!var5_2) ** GOTO lbl197
                throw null;
            }
            case 11: {
                var4_3 /* !! */  = (int)hb.fcxy("fevz", fcys(int ), (int)775);
                if (!var5_2) break;
                throw null;
            }
            case 12: {
                var4_3 /* !! */  = (int)hb.fcxy("fewa", fcys(int ), (int)776);
                if (!var5_2) ** GOTO lbl212
                throw null;
            }
            case 13: {
                var4_3 /* !! */  = (int)hb.fcxy("fewb", fcys(int ), (int)777);
                if (!var5_2) ** GOTO lbl217
                throw null;
            }
lbl233:
            // 3 sources

            case 14: {
                var4_3 /* !! */  = (int)hb.fcxy("fewc", fcys(int ), (int)778);
                if (!var5_2) ** GOTO lbl192
                throw null;
            }
            case 15: {
                var4_3 /* !! */  = (int)hb.fcxy("fewd", fcys(int ), (int)779);
                if (!var5_2) ** GOTO lbl207
                throw null;
            }
            case 16: {
                var4_3 /* !! */  = (int)hb.fcxy("fewe", fcys(int ), (int)780);
                if (!var5_2) break;
                throw null;
            }
            case 17: {
                var4_3 /* !! */  = (int)hb.fcxy("fewf", fcys(int ), (int)781);
                if (!var5_2) ** GOTO lbl174
                throw null;
            }
            case 18: {
                var4_3 /* !! */  = (int)hb.fcxy("fewg", fcys(int ), (int)782);
                if (!var5_2) ** GOTO lbl192
                throw null;
            }
            case 19: {
                var4_3 /* !! */  = (int)hb.fcxy("fewh", fcys(int ), (int)783);
                if (!var5_2) ** GOTO lbl183
                throw null;
            }
            case 20: 
        }
        var4_3 /* !! */  = (int)hb.fcxy("fewi", fcys(int ), (int)784);
        ** while (!var5_2)
lbl260:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fexs() {
        hb.fcyv[400] = 1240505408;
        hb.fcyv[401] = -1926746388;
        hb.fcyv[402] = -962073659;
        hb.fcyv[403] = -1896244099;
        hb.fcyv[404] = -24136939;
        hb.fcyv[405] = 413974220;
        hb.fcyv[406] = -1553055431;
        hb.fcyv[407] = -454926238;
        hb.fcyv[408] = 1044487873;
        hb.fcyv[409] = -1452780808;
        hb.fcyv[410] = 1241353646;
        hb.fcyv[411] = 474070791;
        hb.fcyv[412] = -1281041977;
        hb.fcyv[413] = -572036005;
        hb.fcyv[414] = -1478847397;
        hb.fcyv[415] = -1416153588;
        hb.fcyv[416] = -1028316743;
        hb.fcyv[417] = -756128113;
        hb.fcyv[418] = 111238110;
        hb.fcyv[419] = 1420684465;
        hb.fcyv[420] = -191705806;
        hb.fcyv[421] = -209565497;
        hb.fcyv[422] = -710740149;
        hb.fcyv[423] = 1977829716;
        hb.fcyv[424] = 1251282184;
        hb.fcyv[425] = -231522066;
        hb.fcyv[426] = 1986940039;
        hb.fcyv[427] = -1341990090;
        hb.fcyv[428] = -375223102;
        hb.fcyv[429] = -521065200;
        hb.fcyv[430] = -1242666025;
        hb.fcyv[431] = -816800635;
        hb.fcyv[432] = -561043897;
        hb.fcyv[433] = -1101736199;
        hb.fcyv[434] = -211923789;
        hb.fcyv[435] = 1214697622;
        hb.fcyv[436] = 2096405720;
        hb.fcyv[437] = -2133932517;
        hb.fcyv[438] = 704316384;
        hb.fcyv[439] = -1474493839;
        hb.fcyv[440] = -1494772928;
        hb.fcyv[441] = 1138150324;
        hb.fcyv[442] = 1331349181;
        hb.fcyv[443] = -721295470;
        hb.fcyv[444] = 877211978;
        hb.fcyv[445] = -1085952720;
        hb.fcyv[446] = 2145406940;
        hb.fcyv[447] = -1186321682;
        hb.fcyv[448] = 2005478514;
        hb.fcyv[449] = 1068798155;
        hb.fcyv[450] = -634947372;
        hb.fcyv[451] = -374184909;
        hb.fcyv[452] = 984819678;
        hb.fcyv[453] = 1985220730;
        hb.fcyv[454] = 1522605396;
        hb.fcyv[455] = -1326268588;
        hb.fcyv[456] = 1843240846;
        hb.fcyv[457] = 1365710603;
        hb.fcyv[458] = -2141086853;
        hb.fcyv[459] = -465102780;
        hb.fcyv[460] = 2126500562;
        hb.fcyv[461] = -1297355894;
        hb.fcyv[462] = -1895398041;
        hb.fcyv[463] = 1685491457;
        hb.fcyv[464] = 60252668;
        hb.fcyv[465] = -121631002;
        hb.fcyv[466] = 1405966348;
        hb.fcyv[467] = -873343021;
        hb.fcyv[468] = 282956631;
        hb.fcyv[469] = -2110664747;
        hb.fcyv[470] = -864138426;
        hb.fcyv[471] = -1504719915;
        hb.fcyv[472] = 1960276823;
        hb.fcyv[473] = 1320990964;
        hb.fcyv[474] = -630485200;
        hb.fcyv[475] = -1947992652;
        hb.fcyv[476] = -586464239;
        hb.fcyv[477] = -883147471;
        hb.fcyv[478] = -1854502218;
        hb.fcyv[479] = -2052893002;
        hb.fcyv[480] = -78057491;
        hb.fcyv[481] = 1790068332;
        hb.fcyv[482] = -149819544;
        hb.fcyv[483] = 1581711358;
        hb.fcyv[484] = 1914336153;
        hb.fcyv[485] = -1829402020;
        hb.fcyv[486] = 1798354577;
        hb.fcyv[487] = -1377952755;
        hb.fcyv[488] = 730624832;
        hb.fcyv[489] = 1869990319;
        hb.fcyv[490] = 765393873;
        hb.fcyv[491] = -766414630;
        hb.fcyv[492] = 945140005;
        hb.fcyv[493] = -345385028;
        hb.fcyv[494] = -826209556;
        hb.fcyv[495] = 2057016524;
        hb.fcyv[496] = 1073175239;
        hb.fcyv[497] = -912091986;
        hb.fcyv[498] = -1800041335;
        hb.fcyv[499] = -1861818391;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void evaluateSuspectPlayer(class_1657 var1_1) {
        block108: {
            block107: {
                v0 /* !! */  = hb.lq;
                if (true) ** GOTO lbl5
                block73: while (true) {
                    v0 /* !! */  = (long)(v1 - hb.fcxy("fdkh", fcxr(int ), (int)116));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1931670045: {
                            v1 = hb.fcxy("fdki", fcxr(int ), (int)117);
                            continue block73;
                        }
                        case -1844991923: {
                            v1 = hb.fcxy("fdkj", fcxr(int ), (int)118);
                            continue block73;
                        }
                        case 96162446: {
                            break block73;
                        }
                        case 425228145: {
                            v1 = hb.fcxy("fdkk", fcxr(int ), (int)119);
                            continue block73;
                        }
                    }
                    break;
                }
                var5_2 = hb.c;
                v2 /* !! */  = hb.lq;
                if (true) ** GOTO lbl22
                block74: while (true) {
                    v2 /* !! */  = (long)(v3 - hb.fcxy("fdkl", fcxr(int ), (int)120));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case 72685645: {
                            v3 = hb.fcxy("fdkm", fcxr(int ), (int)121);
                            continue block74;
                        }
                        case 96162446: {
                            break block74;
                        }
                        case 400757573: {
                            v3 = hb.fcxy("fdkn", fcxr(int ), (int)122);
                            continue block74;
                        }
                        case 518501301: {
                            v3 = hb.fcxy("fdko", fcxr(int ), (int)123);
                            continue block74;
                        }
                    }
                    break;
                }
                var4_3 /* !! */  = hb.b;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = hb.lq - hb.fcxy("fdkp", fcxr(int ), (int)124)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hb.fcxy("fdkq", fcys(int ), (int)164)) break;
                    v4 /* !! */  = (long)hb.fcxy("fdks", fcys(int ), (int)165);
                }
                var3_4 = hb.a;
                if (var5_2) {
                    throw null;
lbl44:
                    // 11 sources

                    return;
                }
                if (var3_4 || var3_4) ** GOTO lbl44
                var2_5 = null;
                if (var3_4 || var3_4) ** GOTO lbl44
                v5 /* !! */  = hb.lq;
                if (true) ** GOTO lbl53
                block77: while (true) {
                    v5 /* !! */  = (long)(v6 - hb.fcxy("fdkt", fcxr(int ), (int)125));
lbl53:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 96162446: {
                            break block77;
                        }
                        case 554484565: {
                            v6 = hb.fcxy("fdku", fcxr(int ), (int)126);
                            continue block77;
                        }
                        case 2050419859: {
                            v6 = hb.fcxy("fdkv", fcxr(int ), (int)127);
                            continue block77;
                        }
                    }
                    break;
                }
                if (this.isFullyEquipped(var1_1)) break block107;
                if (var3_4 || var3_4) ** GOTO lbl44
                v7 /* !! */  = hb.lq;
                if (true) ** GOTO lbl68
                block78: while (true) {
                    v7 /* !! */  = (long)(hb.fcxy("fdkx", fcxr(int ), (int)129) - hb.fcxy("fdkw", fcxr(int ), (int)128));
lbl68:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1383015406: {
                            continue block78;
                        }
                        case 96162446: {
                            break block78;
                        }
                    }
                    break;
                }
                var2_5 = this.getArmorItems(var1_1);
                if (var3_4) ** GOTO lbl44
            }
            if (var3_4 || var3_4) ** GOTO lbl44
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_1 = hb.lq - hb.fcxy("fdky", fcxr(int ), (int)130)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v8 /* !! */  == hb.fcxy("fdkz", fcys(int ), (int)166)) break;
                v8 /* !! */  = (long)hb.fcxy("fdla", fcys(int ), (int)167);
            }
            if (this.isFullyEquipped(var1_1)) break block108;
            if (var3_4) ** GOTO lbl44
            v9 /* !! */  = hb.lq;
            if (true) ** GOTO lbl89
            block80: while (true) {
                v9 /* !! */  = (long)(v10 - hb.fcxy("fdlb", fcxr(int ), (int)131));
lbl89:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case 96162446: {
                        break block80;
                    }
                    case 935532126: {
                        v10 = hb.fcxy("fdlc", fcxr(int ), (int)132);
                        continue block80;
                    }
                    case 1321262003: {
                        v10 = hb.fcxy("fdld", fcxr(int ), (int)133);
                        continue block80;
                    }
                }
                break;
            }
            if (!this.hasArmorChanged(var1_1, var2_5)) ** GOTO lbl147
            if (var3_4) ** GOTO lbl44
        }
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4 || var3_4) ** GOTO lbl44
                v11 /* !! */  = hb.lq;
                if (true) ** GOTO lbl109
                block81: while (true) {
                    v11 /* !! */  = (long)(v12 - hb.fcxy("fdle", fcxr(int ), (int)134));
lbl109:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case 96162446: {
                            break block81;
                        }
                        case 1040135938: {
                            v12 = hb.fcxy("fdlf", fcxr(int ), (int)135);
                            continue block81;
                        }
                        case 1219211977: {
                            v12 = hb.fcxy("fdlg", fcxr(int ), (int)136);
                            continue block81;
                        }
                        case 1543797247: {
                            v12 = hb.fcxy("fdlh", fcxr(int ), (int)137);
                            continue block81;
                        }
                    }
                    break;
                }
                v13 /* !! */  = hb.lq;
                if (true) ** GOTO lbl125
                block82: while (true) {
                    v13 /* !! */  = (long)(v14 - hb.fcxy("fdli", fcxr(int ), (int)138));
lbl125:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -2020621525: {
                            v14 = hb.fcxy("fdlj", fcxr(int ), (int)139);
                            continue block82;
                        }
                        case -779119407: {
                            v14 = hb.fcxy("fdlk", fcxr(int ), (int)140);
                            continue block82;
                        }
                        case 96162446: {
                            break block82;
                        }
                    }
                    break;
                }
                v15 = var1_1.method_5667();
                v16 /* !! */  = hb.lq;
                if (true) ** GOTO lbl139
                block83: while (true) {
                    v16 /* !! */  = (long)(hb.fcxy("fdlm", fcxr(int ), (int)142) - hb.fcxy("fdll", fcxr(int ), (int)141));
lbl139:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -711661202: {
                            continue block83;
                        }
                        case 96162446: {
                            break block83;
                        }
                    }
                    break;
                }
                hb.botSet.add(v15);
                if (var3_4) ** GOTO lbl44
lbl147:
                // 2 sources

                if (var3_4 || var3_4) ** GOTO lbl44
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_2 = hb.lq - hb.fcxy("fdlo", fcxr(int ), (int)143)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v17 /* !! */  == hb.fcxy("fdlp", fcys(int ), (int)168)) break;
                    v17 /* !! */  = (long)hb.fcxy("fdlq", fcys(int ), (int)169);
                }
                v18 /* !! */  = hb.lq;
                if (true) ** GOTO lbl158
                block85: while (true) {
                    v18 /* !! */  = (long)(v19 - hb.fcxy("fdlr", fcxr(int ), (int)144));
lbl158:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case 96162446: {
                            break block85;
                        }
                        case 939809727: {
                            v19 = hb.fcxy("fdls", fcxr(int ), (int)145);
                            continue block85;
                        }
                        case 1766231043: {
                            v19 = hb.fcxy("fdlt", fcxr(int ), (int)146);
                            continue block85;
                        }
                    }
                    break;
                }
                v20 = var1_1.method_5667();
                v21 /* !! */  = hb.lq;
                if (true) ** GOTO lbl172
                block86: while (true) {
                    v21 /* !! */  = (long)(v22 - hb.fcxy("fdlu", fcxr(int ), (int)147));
lbl172:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -476292406: {
                            v22 = hb.fcxy("fdlv", fcxr(int ), (int)148);
                            continue block86;
                        }
                        case 96162446: {
                            break block86;
                        }
                        case 1452960194: {
                            v22 = hb.fcxy("fdlw", fcxr(int ), (int)149);
                            continue block86;
                        }
                    }
                    break;
                }
                this.suspectSet.remove(v20);
                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var4_3 /* !! */  = (int)hb.fcxy("fdlx", fcys(int ), (int)170);
                if (!var5_2) break;
                throw null;
            }
lbl190:
            // 3 sources

            case 1: {
                var4_3 /* !! */  = (int)hb.fcxy("fdly", fcys(int ), (int)171);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl200
            }
            case 2: {
                var4_3 /* !! */  = (int)hb.fcxy("fdlz", fcys(int ), (int)172);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl227
            }
lbl200:
            // 4 sources

            case 3: {
                var4_3 /* !! */  = (int)hb.fcxy("fdma", fcys(int ), (int)173);
                if (!var5_2) ** GOTO lbl190
                throw null;
            }
lbl204:
            // 3 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)hb.fcxy("fdmb", fcys(int ), (int)174);
                    if (!var5_2) ** GOTO lbl190
                    throw null;
                }
            }
            case 5: {
                var4_3 /* !! */  = (int)hb.fcxy("fdmc", fcys(int ), (int)175);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl236
            }
lbl214:
            // 2 sources

            case 6: {
                var4_3 /* !! */  = (int)hb.fcxy("fdmd", fcys(int ), (int)176);
                if (var5_2) {
                    throw null;
                }
            }
lbl218:
            // 4 sources

            case 7: {
                var4_3 /* !! */  = (int)hb.fcxy("fdme", fcys(int ), (int)177);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl227
            }
            case 8: {
                var4_3 /* !! */  = (int)hb.fcxy("fdmf", fcys(int ), (int)178);
                if (!var5_2) ** GOTO lbl204
                throw null;
            }
lbl227:
            // 3 sources

            case 9: {
                var4_3 /* !! */  = (int)hb.fcxy("fdmg", fcys(int ), (int)179);
                if (var5_2) {
                    throw null;
                }
            }
lbl231:
            // 4 sources

            case 10: {
                var4_3 /* !! */  = (int)hb.fcxy("fdmi", fcys(int ), (int)180);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl266
            }
lbl236:
            // 2 sources

            case 11: {
                var4_3 /* !! */  = (int)hb.fcxy("fdmj", fcys(int ), (int)181);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl245
            }
            case 12: {
                var4_3 /* !! */  = (int)hb.fcxy("fdmk", fcys(int ), (int)182);
                if (!var5_2) ** GOTO lbl200
                throw null;
            }
lbl245:
            // 2 sources

            case 13: {
                var4_3 /* !! */  = (int)hb.fcxy("fdml", fcys(int ), (int)183);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl254
            }
            case 14: {
                var4_3 /* !! */  = (int)hb.fcxy("fdmm", fcys(int ), (int)184);
                if (!var5_2) ** GOTO lbl214
                throw null;
            }
lbl254:
            // 2 sources

            case 15: {
                var4_3 /* !! */  = (int)hb.fcxy("fdmn", fcys(int ), (int)185);
                if (!var5_2) ** GOTO lbl204
                throw null;
            }
            case 16: {
                var4_3 /* !! */  = (int)hb.fcxy("fdmo", fcys(int ), (int)186);
                if (!var5_2) ** GOTO lbl218
                throw null;
            }
            case 17: {
                var4_3 /* !! */  = (int)hb.fcxy("fdmp", fcys(int ), (int)187);
                if (!var5_2) ** GOTO lbl200
                throw null;
            }
lbl266:
            // 2 sources

            case 18: {
                var4_3 /* !! */  = (int)hb.fcxy("fdmq", fcys(int ), (int)188);
                if (!var5_2) ** GOTO lbl231
                throw null;
            }
            case 19: 
        }
        var4_3 /* !! */  = (int)hb.fcxy("fdmr", fcys(int ), (int)189);
        ** while (!var5_2)
lbl273:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fexz() {
        hb.fcxs[300] = 7279962391222212572L;
        hb.fcxs[301] = -8486085438662532132L;
        hb.fcxs[302] = -5846158874585294357L;
        hb.fcxs[303] = -8824395901195467490L;
        hb.fcxs[304] = 8141895964002488905L;
        hb.fcxs[305] = -9180499541250459765L;
        hb.fcxs[306] = -1514880809763043567L;
        hb.fcxs[307] = -2987613507613123787L;
        hb.fcxs[308] = 9062329046159583905L;
        hb.fcxs[309] = -3077965188985620402L;
        hb.fcxs[310] = -4586200715787322665L;
        hb.fcxs[311] = -9098317477088837274L;
        hb.fcxs[312] = -7159360917712605299L;
        hb.fcxs[313] = -5216646547651868219L;
        hb.fcxs[314] = -2511984845466625741L;
        hb.fcxs[315] = 1203242962192083936L;
        hb.fcxs[316] = -5332221139096838129L;
        hb.fcxs[317] = -5264123650971939752L;
        hb.fcxs[318] = 147539491298618656L;
        hb.fcxs[319] = 472249867170050895L;
        hb.fcxs[320] = 284111103466366818L;
        hb.fcxs[321] = 7786952736693987121L;
        hb.fcxs[322] = -5314233293395349748L;
        hb.fcxs[323] = 5504628988125524869L;
        hb.fcxs[324] = -2642496516939515250L;
        hb.fcxs[325] = 723498218996543929L;
        hb.fcxs[326] = 2168220265774670684L;
        hb.fcxs[327] = 5528477818678769092L;
        hb.fcxs[328] = 1022064038565447953L;
        hb.fcxs[329] = 2177339107402032308L;
        hb.fcxs[330] = 6274968750114517569L;
        hb.fcxs[331] = -4200254535148133372L;
        hb.fcxs[332] = -5502406817784703891L;
        hb.fcxs[333] = -5622770964780909802L;
        hb.fcxs[334] = 609181543551405826L;
        hb.fcxs[335] = -7529264919330413149L;
        hb.fcxs[336] = 7385598768684938279L;
        hb.fcxs[337] = 1882549791567146279L;
        hb.fcxs[338] = 2709193256369262606L;
        hb.fcxs[339] = -2792699274898611105L;
        hb.fcxs[340] = -6871984365296634128L;
        hb.fcxs[341] = -9009389248171636602L;
        hb.fcxs[342] = 1599658372444223694L;
        hb.fcxs[343] = 5319955391480516588L;
        hb.fcxs[344] = -3876296147868569213L;
        hb.fcxs[345] = 4140881111039656412L;
        hb.fcxs[346] = -7348647092185880506L;
        hb.fcxs[347] = 5656261782179237108L;
        hb.fcxs[348] = -2294461626264157100L;
        hb.fcxs[349] = -5534899098511715924L;
        hb.fcxs[350] = -6822944824006769740L;
        hb.fcxs[351] = -5696080566149107699L;
        hb.fcxs[352] = -8742688272667972200L;
        hb.fcxs[353] = 8109286512279656410L;
        hb.fcxs[354] = 1159659375388007924L;
        hb.fcxs[355] = 9071194665939459319L;
        hb.fcxs[356] = 3479242828863721519L;
        hb.fcxs[357] = -3569989381479414858L;
        hb.fcxs[358] = -8788037514730355401L;
        hb.fcxs[359] = 757573587487407441L;
        hb.fcxs[360] = -4852047888432342515L;
        hb.fcxs[361] = 8256304603008010222L;
        hb.fcxs[362] = 1648005286913955722L;
        hb.fcxs[363] = 2591393960649879083L;
        hb.fcxs[364] = 7776006978833083854L;
        hb.fcxs[365] = -4987943145270064698L;
        hb.fcxs[366] = -7069869336120681548L;
        hb.fcxs[367] = 5311571322697370535L;
        hb.fcxs[368] = 3584954288346630299L;
        hb.fcxs[369] = -2859445244428057402L;
        hb.fcxs[370] = -1656593280487875503L;
        hb.fcxs[371] = -4895880690349036418L;
        hb.fcxs[372] = 1589502586258516066L;
        hb.fcxs[373] = 4343640904249907502L;
        hb.fcxs[374] = 8630549148294089355L;
        hb.fcxs[375] = -4835770764012141452L;
        hb.fcxs[376] = 7102940451643478305L;
        hb.fcxs[377] = -835957883831491573L;
        hb.fcxs[378] = 811214618827714109L;
        hb.fcxs[379] = 7703120605184095702L;
        hb.fcxs[380] = -6338298263919609260L;
        hb.fcxs[381] = 8827554310229919730L;
        hb.fcxs[382] = -4013290208417433032L;
        hb.fcxs[383] = 2789243576069940487L;
        hb.fcxs[384] = -6585499107217357919L;
        hb.fcxs[385] = -2644272744804758722L;
        hb.fcxs[386] = 5593174550871741651L;
        hb.fcxs[387] = 2897687942786911281L;
        hb.fcxs[388] = -4473953580868583120L;
        hb.fcxs[389] = 3128532338210195342L;
        hb.fcxs[390] = 6827647881606517339L;
        hb.fcxs[391] = -6614196390682235937L;
        hb.fcxs[392] = -2546127361258279850L;
        hb.fcxs[393] = -8355140654915032140L;
        hb.fcxs[394] = -2248999169467681993L;
        hb.fcxs[395] = 8986765979279961311L;
        hb.fcxs[396] = -8024722975974621110L;
        hb.fcxs[397] = 418084394370701088L;
        hb.fcxs[398] = -3557286575648519851L;
        hb.fcxs[399] = -6229843573630697193L;
    }

    private static /* synthetic */ void fexm() {
        hb.fcyu[600] = 1522757332;
        hb.fcyu[601] = 1123390264;
        hb.fcyu[602] = -935244780;
        hb.fcyu[603] = -326805954;
        hb.fcyu[604] = 1735261406;
        hb.fcyu[605] = -1978712453;
        hb.fcyu[606] = -2084427800;
        hb.fcyu[607] = 2007763902;
        hb.fcyu[608] = -205388276;
        hb.fcyu[609] = -1794216400;
        hb.fcyu[610] = 1397421966;
        hb.fcyu[611] = -1681795728;
        hb.fcyu[612] = 1432507125;
        hb.fcyu[613] = -2025749851;
        hb.fcyu[614] = 307422835;
        hb.fcyu[615] = -1041826647;
        hb.fcyu[616] = 283945623;
        hb.fcyu[617] = -1669480353;
        hb.fcyu[618] = -1551961076;
        hb.fcyu[619] = 254906644;
        hb.fcyu[620] = -1656899730;
        hb.fcyu[621] = -1520911834;
        hb.fcyu[622] = -1525150692;
        hb.fcyu[623] = 371447604;
        hb.fcyu[624] = -564335060;
        hb.fcyu[625] = -1892459765;
        hb.fcyu[626] = -900492037;
        hb.fcyu[627] = 657062240;
        hb.fcyu[628] = -581479870;
        hb.fcyu[629] = 238220474;
        hb.fcyu[630] = 2134458118;
        hb.fcyu[631] = 2078222369;
        hb.fcyu[632] = -1891199420;
        hb.fcyu[633] = 26132044;
        hb.fcyu[634] = 1820104604;
        hb.fcyu[635] = -1784962971;
        hb.fcyu[636] = 1434423301;
        hb.fcyu[637] = 1227321105;
        hb.fcyu[638] = -30062042;
        hb.fcyu[639] = 426425370;
        hb.fcyu[640] = -733960802;
        hb.fcyu[641] = -1510758734;
        hb.fcyu[642] = 1903440968;
        hb.fcyu[643] = 248527745;
        hb.fcyu[644] = -873260561;
        hb.fcyu[645] = -1683962297;
        hb.fcyu[646] = -436455531;
        hb.fcyu[647] = 1670912175;
        hb.fcyu[648] = -1447122653;
        hb.fcyu[649] = -1173358646;
        hb.fcyu[650] = 1583123420;
        hb.fcyu[651] = 1225624389;
        hb.fcyu[652] = -1013767646;
        hb.fcyu[653] = -2122949776;
        hb.fcyu[654] = -246249172;
        hb.fcyu[655] = 1233654576;
        hb.fcyu[656] = -943464443;
        hb.fcyu[657] = -1734334473;
        hb.fcyu[658] = -1820921979;
        hb.fcyu[659] = 1983983668;
        hb.fcyu[660] = -2100797675;
        hb.fcyu[661] = 1518274896;
        hb.fcyu[662] = 118804539;
        hb.fcyu[663] = -568009965;
        hb.fcyu[664] = 33651339;
        hb.fcyu[665] = -535334471;
        hb.fcyu[666] = -549980602;
        hb.fcyu[667] = -1492566314;
        hb.fcyu[668] = -888863012;
        hb.fcyu[669] = 473168758;
        hb.fcyu[670] = -321918938;
        hb.fcyu[671] = 1063759102;
        hb.fcyu[672] = -1040164846;
        hb.fcyu[673] = 1439151580;
        hb.fcyu[674] = 570500082;
        hb.fcyu[675] = 1987083539;
        hb.fcyu[676] = 576429885;
        hb.fcyu[677] = -600711918;
        hb.fcyu[678] = 1824194389;
        hb.fcyu[679] = 944057826;
        hb.fcyu[680] = 512195902;
        hb.fcyu[681] = 1402322095;
        hb.fcyu[682] = -733224158;
        hb.fcyu[683] = 452062266;
        hb.fcyu[684] = -823545695;
        hb.fcyu[685] = 1821670595;
        hb.fcyu[686] = 1749526759;
        hb.fcyu[687] = -1451304206;
        hb.fcyu[688] = -1964239719;
        hb.fcyu[689] = -1420248842;
        hb.fcyu[690] = -626868907;
        hb.fcyu[691] = -1665954602;
        hb.fcyu[692] = -898277303;
        hb.fcyu[693] = 1656264039;
        hb.fcyu[694] = -1441067952;
        hb.fcyu[695] = -1344572268;
        hb.fcyu[696] = 50416672;
        hb.fcyu[697] = -903504664;
        hb.fcyu[698] = 113316210;
        hb.fcyu[699] = 136486425;
    }

    private static /* synthetic */ void fexv() {
        hb.fcyv[700] = -202509338;
        hb.fcyv[701] = 1751965494;
        hb.fcyv[702] = -1535508670;
        hb.fcyv[703] = 1490204730;
        hb.fcyv[704] = -13967425;
        hb.fcyv[705] = -1452602105;
        hb.fcyv[706] = -1607601000;
        hb.fcyv[707] = 627932790;
        hb.fcyv[708] = -1766170190;
        hb.fcyv[709] = 10984984;
        hb.fcyv[710] = -1028141115;
        hb.fcyv[711] = -1398272776;
        hb.fcyv[712] = 1701911386;
        hb.fcyv[713] = -525044637;
        hb.fcyv[714] = 1866618353;
        hb.fcyv[715] = -1675783957;
        hb.fcyv[716] = -201873307;
        hb.fcyv[717] = 523416538;
        hb.fcyv[718] = 1073446182;
        hb.fcyv[719] = 2014997936;
        hb.fcyv[720] = -1929544357;
        hb.fcyv[721] = 528676173;
        hb.fcyv[722] = 1863764344;
        hb.fcyv[723] = 2064194296;
        hb.fcyv[724] = 1676507450;
        hb.fcyv[725] = -271556267;
        hb.fcyv[726] = 1292886723;
        hb.fcyv[727] = -272778754;
        hb.fcyv[728] = -1824513633;
        hb.fcyv[729] = -1353384055;
        hb.fcyv[730] = -250818351;
        hb.fcyv[731] = 1545160245;
        hb.fcyv[732] = 2103650354;
        hb.fcyv[733] = -1003836862;
        hb.fcyv[734] = -816817884;
        hb.fcyv[735] = -272756622;
        hb.fcyv[736] = 449864579;
        hb.fcyv[737] = -945160737;
        hb.fcyv[738] = -157123457;
        hb.fcyv[739] = 169679267;
        hb.fcyv[740] = 326338242;
        hb.fcyv[741] = 615598321;
        hb.fcyv[742] = 1946756679;
        hb.fcyv[743] = -1808142529;
        hb.fcyv[744] = 847089603;
        hb.fcyv[745] = -992220146;
        hb.fcyv[746] = 426484031;
        hb.fcyv[747] = 363912189;
        hb.fcyv[748] = 1439840204;
        hb.fcyv[749] = -506476917;
        hb.fcyv[750] = 280224418;
        hb.fcyv[751] = 277089034;
        hb.fcyv[752] = -592222940;
        hb.fcyv[753] = 548795518;
        hb.fcyv[754] = -1773807489;
        hb.fcyv[755] = 1201799179;
        hb.fcyv[756] = 490022651;
        hb.fcyv[757] = 948863060;
        hb.fcyv[758] = -1110472783;
        hb.fcyv[759] = -352703015;
        hb.fcyv[760] = -36806259;
        hb.fcyv[761] = 443688714;
        hb.fcyv[762] = -961347312;
        hb.fcyv[763] = 1645974791;
        hb.fcyv[764] = 1223118814;
        hb.fcyv[765] = -256544682;
        hb.fcyv[766] = -1234769595;
        hb.fcyv[767] = -955797215;
        hb.fcyv[768] = -1147726086;
        hb.fcyv[769] = -710504368;
        hb.fcyv[770] = 836194820;
        hb.fcyv[771] = 1312941141;
        hb.fcyv[772] = -1112983047;
        hb.fcyv[773] = -1291189224;
        hb.fcyv[774] = -2056696962;
        hb.fcyv[775] = -1859512251;
        hb.fcyv[776] = -524370928;
        hb.fcyv[777] = -709067675;
        hb.fcyv[778] = 1400808558;
        hb.fcyv[779] = -2100464800;
        hb.fcyv[780] = 936130575;
        hb.fcyv[781] = 400588643;
        hb.fcyv[782] = -106528882;
        hb.fcyv[783] = -1966329025;
        hb.fcyv[784] = 1499313398;
        hb.fcyv[785] = -1613215406;
        hb.fcyv[786] = 124432334;
        hb.fcyv[787] = 779001275;
        hb.fcyv[788] = 1082158773;
        hb.fcyv[789] = -1507386247;
        hb.fcyv[790] = -1412042439;
        hb.fcyv[791] = 208584821;
        hb.fcyv[792] = -2025975319;
        hb.fcyv[793] = 623396213;
        hb.fcyv[794] = 281030057;
        hb.fcyv[795] = 1639377614;
        hb.fcyv[796] = 239331344;
        hb.fcyv[797] = -1289367672;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void newMatrixMode() {
        var10_1 = hb.c;
        var9_2 /* !! */  = hb.b;
        var8_3 = hb.a;
        if (var10_1) {
            throw null;
lbl6:
            // 49 sources

            return;
        }
        if (var8_3 || var8_3) ** GOTO lbl6
        var1_4 = hb.mc.field_1687.method_18456().iterator();
        if (var8_3) ** GOTO lbl6
        block79: while (true) {
            block147: {
                if (var8_3 || var8_3) ** GOTO lbl6
                if (!var1_4.hasNext()) ** GOTO lbl118
                if (var8_3) ** GOTO lbl6
                var2_5 = (class_1657)var1_4.next();
                if (var8_3 || var8_3) ** GOTO lbl6
                if (var2_5 == hb.mc.field_1724) ** GOTO lbl115
                if (var8_3 || var8_3) ** GOTO lbl6
                var3_6 = this.getArmorItems(var2_5);
                if (var8_3 || var8_3) ** GOTO lbl6
                var4_7 = hb.fcxy("fdzq", fcys(int ), (int)409);
                if (var8_3 || var8_3) ** GOTO lbl6
                var5_9 = var3_6.iterator();
                if (var8_3) ** GOTO lbl6
                do {
                    block149: {
                        block148: {
                            if (var8_3 || var8_3) ** GOTO lbl6
                            if (!var5_9.hasNext()) break block147;
                            if (var8_3) ** GOTO lbl6
                            var6_10 = var5_9.next();
                            if (var8_3 || var8_3) ** GOTO lbl6
                            if (var6_10.method_7960()) break block148;
                            if (var8_3) ** GOTO lbl6
                            if (!var6_10.method_7923()) break block148;
                            if (var8_3) ** GOTO lbl6
                            if (var6_10.method_7919() <= 0) break block149;
                            if (var8_3) ** GOTO lbl6
                        }
                        if (var8_3 || var8_3) ** GOTO lbl6
                        var4_7 = hb.fcxy("fdzr", fcys(int ), (int)410);
                        if (var8_3 || var8_3) ** GOTO lbl6
                        if (var10_1) {
                            throw null;
                        }
                        break block147;
                    }
                    if (var8_3 || var8_3) ** GOTO lbl6
                } while (!var10_1);
                throw null;
            }
            if (var8_3 || var8_3) ** GOTO lbl6
            var5_8 = hb.fcxy("fdzs", fcys(int ), (int)411);
            if (var8_3 || var8_3) ** GOTO lbl6
            var6_10 = var3_6.iterator();
            if (var8_3) ** GOTO lbl6
            block81: while (true) {
                block150: {
                    if (var8_3 || var8_3) ** GOTO lbl6
                    if (!var6_10.hasNext()) ** GOTO lbl90
                    if (var8_3) ** GOTO lbl6
                    var7_11 = (class_1799)var6_10.next();
                    if (var8_3 || var8_3) ** GOTO lbl6
                    if (var7_11.method_7909() == class_1802.field_8370) break block150;
                    if (var8_3) ** GOTO lbl6
                    if (var7_11.method_7909() == class_1802.field_8570) break block150;
                    if (var8_3) ** GOTO lbl6
                    if (var7_11.method_7909() == class_1802.field_8577) break block150;
                    if (var8_3) ** GOTO lbl6
                    if (var7_11.method_7909() == class_1802.field_8267) break block150;
                    if (var8_3) ** GOTO lbl6
                    if (var7_11.method_7909() == class_1802.field_8660) break block150;
                    if (var8_3) ** GOTO lbl6
                    if (var7_11.method_7909() == class_1802.field_8396) break block150;
                    if (var8_3) ** GOTO lbl6
                    if (var7_11.method_7909() == class_1802.field_8523) break block150;
                    if (var8_3) ** GOTO lbl6
                    if (var7_11.method_7909() != class_1802.field_8743) ** GOTO lbl87
                    if (var8_3) ** GOTO lbl6
                }
                if (var8_3) ** GOTO lbl6
                if (var9_2 /* !! */  == 0) ** GOTO lbl-1000
                switch (var9_2 /* !! */ ) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var8_3) ** GOTO lbl6
                        var5_8 = hb.fcxy("fdzt", fcys(int ), (int)412);
                        if (var8_3 || var8_3) ** GOTO lbl6
                        if (var10_1) {
                            throw null;
                        }
                        ** GOTO lbl90
                    }
lbl87:
                    // 1 sources

                    if (var8_3 || var8_3) ** GOTO lbl6
                    if (!var10_1) continue block81;
                    throw null;
lbl90:
                    // 2 sources

                    if (var8_3 || var8_3) ** GOTO lbl6
                    if (var4_7 == false) ** GOTO lbl111
                    if (var8_3) ** GOTO lbl6
                    if (var5_8 == false) ** GOTO lbl111
                    if (var8_3) ** GOTO lbl6
                    if (var2_5.method_5998(class_1268.field_5810).method_7909() != class_1802.field_8162) ** GOTO lbl111
                    if (var8_3) ** GOTO lbl6
                    if (var2_5.method_5998(class_1268.field_5808).method_7909() == class_1802.field_8162) ** GOTO lbl111
                    if (var8_3) ** GOTO lbl6
                    if (var2_5.method_7344().method_7586() != hb.fcxy("fdzu", fcys(int ), (int)413)) ** GOTO lbl111
                    if (var8_3) ** GOTO lbl6
                    if (var2_5.method_5477().getString().contains("NPC")) ** GOTO lbl111
                    if (var8_3) ** GOTO lbl6
                    if (var2_5.method_5477().getString().startsWith("[ZNPC]")) ** GOTO lbl111
                    if (var8_3 || var8_3) ** GOTO lbl6
                    hb.botSet.add(var2_5.method_5667());
                    if (var8_3) ** GOTO lbl6
                    if (var10_1) {
                        throw null;
                    }
                    ** GOTO lbl115
lbl111:
                    // 7 sources

                    if (var8_3 || var8_3) ** GOTO lbl6
                    hb.botSet.remove(var2_5.method_5667());
                    if (var8_3) ** GOTO lbl6
lbl115:
                    // 3 sources

                    if (var8_3 || var8_3) ** GOTO lbl6
                    if (!var10_1) continue block79;
                    throw null;
lbl118:
                    // 1 sources

                    if (!var8_3 && !var8_3) ** break;
                    ** continue;
                    return;
                    case 0: {
                        var9_2 /* !! */  = (int)hb.fcxy("fdzv", fcys(int ), (int)414);
                        if (var10_1) {
                            throw null;
                        }
                        ** GOTO lbl156
                    }
lbl126:
                    // 2 sources

                    case 1: {
                        var9_2 /* !! */  = (int)hb.fcxy("fdzw", fcys(int ), (int)415);
                        if (var10_1) {
                            throw null;
                        }
                        ** GOTO lbl201
                    }
                    case 2: {
                        var9_2 /* !! */  = (int)hb.fcxy("fdzx", fcys(int ), (int)416);
                        if (var10_1) {
                            throw null;
                        }
                        ** GOTO lbl372
                    }
lbl136:
                    // 2 sources

                    case 3: {
                        var9_2 /* !! */  = (int)hb.fcxy("fdzy", fcys(int ), (int)417);
                        if (var10_1) {
                            throw null;
                        }
                        ** GOTO lbl420
                    }
                    case 4: {
                        var9_2 /* !! */  = (int)hb.fcxy("fdzz", fcys(int ), (int)418);
                        if (var10_1) {
                            throw null;
                        }
                        ** GOTO lbl336
                    }
                    case 5: {
                        var9_2 /* !! */  = (int)hb.fcxy("feaa", fcys(int ), (int)419);
                        if (var10_1) {
                            throw null;
                        }
                        ** GOTO lbl446
                    }
                    case 6: {
                        var9_2 /* !! */  = (int)hb.fcxy("feab", fcys(int ), (int)420);
                        if (var10_1) {
                            throw null;
                        }
                        ** GOTO lbl181
                    }
lbl156:
                    // 5 sources

                    case 7: {
                        var9_2 /* !! */  = (int)hb.fcxy("feac", fcys(int ), (int)421);
                        if (var10_1) {
                            throw null;
                        }
                        ** GOTO lbl404
                    }
                    case 8: {
                        var9_2 /* !! */  = (int)hb.fcxy("fead", fcys(int ), (int)422);
                        if (var10_1) {
                            throw null;
                        }
                        ** GOTO lbl307
                    }
lbl166:
                    // 3 sources

                    case 9: {
                        var9_2 /* !! */  = (int)hb.fcxy("feae", fcys(int ), (int)423);
                        if (var10_1) {
                            throw null;
                        }
                        ** GOTO lbl331
                    }
lbl171:
                    // 3 sources

                    case 10: {
                        var9_2 /* !! */  = (int)hb.fcxy("feaf", fcys(int ), (int)424);
                        if (var10_1) {
                            throw null;
                        }
                        ** GOTO lbl247
                    }
lbl176:
                    // 3 sources

                    case 11: {
                        var9_2 /* !! */  = (int)hb.fcxy("feag", fcys(int ), (int)425);
                        if (var10_1) {
                            throw null;
                        }
                        ** GOTO lbl400
                    }
lbl181:
                    // 3 sources

                    case 12: {
                        var9_2 /* !! */  = (int)hb.fcxy("feah", fcys(int ), (int)426);
                        if (var10_1) {
                            throw null;
                        }
                        ** GOTO lbl265
                    }
lbl186:
                    // 3 sources

                    case 13: {
                        var9_2 /* !! */  = (int)hb.fcxy("feai", fcys(int ), (int)427);
                        if (var10_1) {
                            throw null;
                        }
                        ** GOTO lbl323
                    }
lbl191:
                    // 5 sources

                    case 14: {
                        var9_2 /* !! */  = (int)hb.fcxy("feaj", fcys(int ), (int)428);
                        if (var10_1) {
                            throw null;
                        }
                        ** GOTO lbl225
                    }
                    case 15: {
                        var9_2 /* !! */  = (int)hb.fcxy("feak", fcys(int ), (int)429);
                        if (var10_1) {
                            throw null;
                        }
                        ** GOTO lbl388
                    }
lbl201:
                    // 3 sources

                    case 16: {
                        var9_2 /* !! */  = (int)hb.fcxy("feal", fcys(int ), (int)430);
                        if (var10_1) {
                            throw null;
                        }
                        ** GOTO lbl404
                    }
                    case 17: {
                        var9_2 /* !! */  = (int)hb.fcxy("feam", fcys(int ), (int)431);
                        if (var10_1) {
                            throw null;
                        }
                        ** GOTO lbl315
                    }
                    case 18: {
                        var9_2 /* !! */  = (int)hb.fcxy("fean", fcys(int ), (int)432);
                        if (!var10_1) ** GOTO lbl136
                        throw null;
                    }
lbl215:
                    // 2 sources

                    case 19: {
                        var9_2 /* !! */  = (int)hb.fcxy("feao", fcys(int ), (int)433);
                        if (var10_1) {
                            throw null;
                        }
                        ** GOTO lbl428
                    }
lbl220:
                    // 3 sources

                    case 20: {
                        var9_2 /* !! */  = (int)hb.fcxy("feap", fcys(int ), (int)434);
                        if (var10_1) {
                            throw null;
                        }
                        ** GOTO lbl323
                    }
lbl225:
                    // 4 sources

                    case 21: {
                        var9_2 /* !! */  = (int)hb.fcxy("feaq", fcys(int ), (int)435);
                        if (var10_1) {
                            throw null;
                        }
                        ** GOTO lbl432
                    }
lbl230:
                    // 2 sources

                    case 22: {
                        var9_2 /* !! */  = (int)hb.fcxy("fear", fcys(int ), (int)436);
                        if (!var10_1) ** GOTO lbl220
                        throw null;
                    }
lbl234:
                    // 2 sources

                    case 23: {
                        var9_2 /* !! */  = (int)hb.fcxy("feas", fcys(int ), (int)437);
                        if (!var10_1) ** GOTO lbl225
                        throw null;
                    }
                    case 24: {
                        var9_2 /* !! */  = (int)hb.fcxy("feat", fcys(int ), (int)438);
                        if (var10_1) {
                            throw null;
                        }
                        ** GOTO lbl350
                    }
                    case 25: {
                        var9_2 /* !! */  = (int)hb.fcxy("feau", fcys(int ), (int)439);
                        if (!var10_1) ** GOTO lbl156
                        throw null;
                    }
lbl247:
                    // 2 sources

                    case 26: {
                        var9_2 /* !! */  = (int)hb.fcxy("feav", fcys(int ), (int)440);
                        if (!var10_1) ** GOTO lbl186
                        throw null;
                    }
lbl251:
                    // 3 sources

                    case 27: {
                        var9_2 /* !! */  = (int)hb.fcxy("feaw", fcys(int ), (int)441);
                        if (var10_1) {
                            throw null;
                        }
                        ** GOTO lbl428
                    }
                    case 28: {
                        var9_2 /* !! */  = (int)hb.fcxy("feax", fcys(int ), (int)442);
                        if (!var10_1) ** GOTO lbl156
                        throw null;
                    }
                    case 29: {
                        var9_2 /* !! */  = (int)hb.fcxy("feay", fcys(int ), (int)443);
                        if (var10_1) {
                            throw null;
                        }
                        ** GOTO lbl319
                    }
lbl265:
                    // 2 sources

                    case 30: {
                        var9_2 /* !! */  = (int)hb.fcxy("feaz", fcys(int ), (int)444);
                        if (var10_1) {
                            throw null;
                        }
                        ** GOTO lbl290
                    }
                    case 31: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var9_2 /* !! */  = (int)hb.fcxy("feba", fcys(int ), (int)445);
                            if (var10_1) {
                                throw null;
                            }
                            ** GOTO lbl336
                            break;
                        }
                    }
                    case 32: {
                        var9_2 /* !! */  = (int)hb.fcxy("febb", fcys(int ), (int)446);
                        if (var10_1) {
                            throw null;
                        }
                        ** GOTO lbl376
                    }
                    case 33: {
                        var9_2 /* !! */  = (int)hb.fcxy("febc", fcys(int ), (int)447);
                        if (!var10_1) ** GOTO lbl220
                        throw null;
                    }
lbl285:
                    // 2 sources

                    case 34: {
                        var9_2 /* !! */  = (int)hb.fcxy("febd", fcys(int ), (int)448);
                        if (var10_1) {
                            throw null;
                        }
                        ** GOTO lbl327
                    }
lbl290:
                    // 2 sources

                    case 35: {
                        var9_2 /* !! */  = (int)hb.fcxy("febe", fcys(int ), (int)449);
                        if (!var10_1) ** GOTO lbl234
                        throw null;
                    }
lbl294:
                    // 3 sources

                    case 36: {
                        var9_2 /* !! */  = (int)hb.fcxy("febf", fcys(int ), (int)450);
                        if (var10_1) {
                            throw null;
                        }
                        ** GOTO lbl416
                    }
                    case 37: {
                        var9_2 /* !! */  = (int)hb.fcxy("febg", fcys(int ), (int)451);
                        if (!var10_1) ** GOTO lbl126
                        throw null;
                    }
                    case 38: {
                        var9_2 /* !! */  = (int)hb.fcxy("febh", fcys(int ), (int)452);
                        if (!var10_1) ** GOTO lbl285
                        throw null;
                    }
lbl307:
                    // 4 sources

                    case 39: {
                        var9_2 /* !! */  = (int)hb.fcxy("febi", fcys(int ), (int)453);
                        if (!var10_1) ** GOTO lbl166
                        throw null;
                    }
                    case 40: {
                        var9_2 /* !! */  = (int)hb.fcxy("febj", fcys(int ), (int)454);
                        if (!var10_1) ** GOTO lbl230
                        throw null;
                    }
lbl315:
                    // 4 sources

                    case 41: {
                        var9_2 /* !! */  = (int)hb.fcxy("febk", fcys(int ), (int)455);
                        if (!var10_1) ** GOTO lbl176
                        throw null;
                    }
lbl319:
                    // 2 sources

                    case 42: {
                        var9_2 /* !! */  = (int)hb.fcxy("febl", fcys(int ), (int)456);
                        if (!var10_1) ** GOTO lbl307
                        throw null;
                    }
lbl323:
                    // 4 sources

                    case 43: {
                        var9_2 /* !! */  = (int)hb.fcxy("febm", fcys(int ), (int)457);
                        if (!var10_1) ** GOTO lbl171
                        throw null;
                    }
lbl327:
                    // 2 sources

                    case 44: {
                        var9_2 /* !! */  = (int)hb.fcxy("febn", fcys(int ), (int)458);
                        if (!var10_1) ** GOTO lbl307
                        throw null;
                    }
lbl331:
                    // 2 sources

                    case 45: {
                        var9_2 /* !! */  = (int)hb.fcxy("febo", fcys(int ), (int)459);
                        if (var10_1) {
                            throw null;
                        }
                        ** GOTO lbl454
                    }
lbl336:
                    // 3 sources

                    case 46: {
                        var9_2 /* !! */  = (int)hb.fcxy("febp", fcys(int ), (int)460);
                        if (var10_1) {
                            throw null;
                        }
                        ** GOTO lbl388
                    }
                    case 47: {
                        var9_2 /* !! */  = (int)hb.fcxy("febq", fcys(int ), (int)461);
                        if (var10_1) {
                            throw null;
                        }
                        ** GOTO lbl392
                    }
lbl346:
                    // 2 sources

                    case 48: {
                        var9_2 /* !! */  = (int)hb.fcxy("febr", fcys(int ), (int)462);
                        if (!var10_1) ** GOTO lbl251
                        throw null;
                    }
lbl350:
                    // 2 sources

                    case 49: {
                        var9_2 /* !! */  = (int)hb.fcxy("febs", fcys(int ), (int)463);
                        if (!var10_1) ** GOTO lbl176
                        throw null;
                    }
                    case 50: {
                        var9_2 /* !! */  = (int)hb.fcxy("febt", fcys(int ), (int)464);
                        if (var10_1) {
                            throw null;
                        }
                        ** GOTO lbl408
                    }
                    case 51: {
                        var9_2 /* !! */  = (int)hb.fcxy("febu", fcys(int ), (int)465);
                        if (var10_1) {
                            throw null;
                        }
                        ** GOTO lbl396
                    }
lbl364:
                    // 2 sources

                    case 52: {
                        var9_2 /* !! */  = (int)hb.fcxy("febv", fcys(int ), (int)466);
                        if (!var10_1) ** GOTO lbl171
                        throw null;
                    }
                    case 53: {
                        var9_2 /* !! */  = (int)hb.fcxy("febw", fcys(int ), (int)467);
                        if (!var10_1) ** GOTO lbl215
                        throw null;
                    }
lbl372:
                    // 2 sources

                    case 54: {
                        var9_2 /* !! */  = (int)hb.fcxy("febx", fcys(int ), (int)468);
                        if (!var10_1) ** GOTO lbl191
                        throw null;
                    }
lbl376:
                    // 2 sources

                    case 55: {
                        var9_2 /* !! */  = (int)hb.fcxy("feby", fcys(int ), (int)469);
                        if (!var10_1) ** GOTO lbl191
                        throw null;
                    }
                    case 56: {
                        var9_2 /* !! */  = (int)hb.fcxy("febz", fcys(int ), (int)470);
                        if (!var10_1) ** GOTO lbl225
                        throw null;
                    }
                    case 57: {
                        var9_2 /* !! */  = (int)hb.fcxy("feca", fcys(int ), (int)471);
                        if (!var10_1) ** GOTO lbl251
                        throw null;
                    }
lbl388:
                    // 3 sources

                    case 58: {
                        var9_2 /* !! */  = (int)hb.fcxy("fecb", fcys(int ), (int)472);
                        if (!var10_1) ** GOTO lbl346
                        throw null;
                    }
lbl392:
                    // 2 sources

                    case 59: {
                        var9_2 /* !! */  = (int)hb.fcxy("fecc", fcys(int ), (int)473);
                        if (!var10_1) ** GOTO lbl191
                        throw null;
                    }
lbl396:
                    // 2 sources

                    case 60: {
                        var9_2 /* !! */  = (int)hb.fcxy("fecd", fcys(int ), (int)474);
                        if (!var10_1) ** GOTO lbl364
                        throw null;
                    }
lbl400:
                    // 3 sources

                    case 61: {
                        var9_2 /* !! */  = (int)hb.fcxy("fece", fcys(int ), (int)475);
                        if (!var10_1) ** GOTO lbl186
                        throw null;
                    }
lbl404:
                    // 3 sources

                    case 62: {
                        var9_2 /* !! */  = (int)hb.fcxy("fecf", fcys(int ), (int)476);
                        if (!var10_1) ** GOTO lbl315
                        throw null;
                    }
lbl408:
                    // 2 sources

                    case 63: {
                        var9_2 /* !! */  = (int)hb.fcxy("fecg", fcys(int ), (int)477);
                        if (!var10_1) ** GOTO lbl323
                        throw null;
                    }
                    case 64: {
                        var9_2 /* !! */  = (int)hb.fcxy("fech", fcys(int ), (int)478);
                        if (!var10_1) ** GOTO lbl294
                        throw null;
                    }
lbl416:
                    // 2 sources

                    case 65: {
                        var9_2 /* !! */  = (int)hb.fcxy("feci", fcys(int ), (int)479);
                        if (!var10_1) ** GOTO lbl400
                        throw null;
                    }
lbl420:
                    // 2 sources

                    case 66: {
                        var9_2 /* !! */  = (int)hb.fcxy("fecj", fcys(int ), (int)480);
                        if (!var10_1) ** GOTO lbl156
                        throw null;
                    }
                    case 67: {
                        var9_2 /* !! */  = (int)hb.fcxy("feck", fcys(int ), (int)481);
                        if (!var10_1) ** GOTO lbl294
                        throw null;
                    }
lbl428:
                    // 3 sources

                    case 68: {
                        var9_2 /* !! */  = (int)hb.fcxy("fecl", fcys(int ), (int)482);
                        if (!var10_1) ** GOTO lbl201
                        throw null;
                    }
lbl432:
                    // 2 sources

                    case 69: {
                        var9_2 /* !! */  = (int)hb.fcxy("fecm", fcys(int ), (int)483);
                        if (var10_1) {
                            throw null;
                        }
                        ** GOTO lbl441
                    }
                    case 70: {
                        var9_2 /* !! */  = (int)hb.fcxy("fecn", fcys(int ), (int)484);
                        if (!var10_1) ** GOTO lbl315
                        throw null;
                    }
lbl441:
                    // 2 sources

                    case 71: {
                        do {
                            var9_2 /* !! */  = (int)hb.fcxy("feco", fcys(int ), (int)485);
                        } while (!var10_1);
                        throw null;
                    }
lbl446:
                    // 2 sources

                    case 72: {
                        var9_2 /* !! */  = (int)hb.fcxy("fecp", fcys(int ), (int)486);
                        if (!var10_1) ** GOTO lbl166
                        throw null;
                    }
                    case 73: {
                        var9_2 /* !! */  = (int)hb.fcxy("fecq", fcys(int ), (int)487);
                        if (!var10_1) ** GOTO lbl191
                        throw null;
                    }
lbl454:
                    // 2 sources

                    case 74: {
                        var9_2 /* !! */  = (int)hb.fcxy("fecr", fcys(int ), (int)488);
                        if (!var10_1) ** GOTO lbl181
                        throw null;
                    }
                    case 75: 
                }
                break;
            }
            break;
        }
        var9_2 /* !! */  = (int)hb.fcxy("fecs", fcys(int ), (int)489);
        ** while (!var10_1)
lbl461:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isBotU(class_1297 var1_1) {
        v0 /* !! */  = hb.lq;
        if (true) ** GOTO lbl5
        block45: while (true) {
            v0 /* !! */  = (long)(v1 - hb.fcxy("felx", fcxr(int ), (int)344));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1277069305: {
                    v1 = hb.fcxy("fely", fcxr(int ), (int)345);
                    continue block45;
                }
                case 96162446: {
                    break block45;
                }
                case 1608738791: {
                    v1 = hb.fcxy("felz", fcxr(int ), (int)346);
                    continue block45;
                }
                case 1685663408: {
                    v1 = hb.fcxy("fema", fcxr(int ), (int)347);
                    continue block45;
                }
            }
            break;
        }
        var4_2 = hb.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hb.lq - hb.fcxy("femb", fcxr(int ), (int)348)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == hb.fcxy("femc", fcys(int ), (int)643)) break;
            v2 /* !! */  = (long)hb.fcxy("femd", fcys(int ), (int)644);
        }
        var3_3 /* !! */  = hb.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = hb.lq - hb.fcxy("feme", fcxr(int ), (int)349)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == hb.fcxy("femf", fcys(int ), (int)645)) break;
            v3 /* !! */  = (long)hb.fcxy("femg", fcys(int ), (int)646);
        }
        var2_4 = hb.a;
        if (var4_2) {
            throw null;
lbl32:
            // 6 sources

            return (boolean)hb.fcxy("femh", fcys(int ), (int)647);
        }
        if (var2_4 || var2_4) ** GOTO lbl32
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = hb.lq - hb.fcxy("femi", fcxr(int ), (int)350)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == hb.fcxy("femj", fcys(int ), (int)648)) break;
            v4 /* !! */  = (long)hb.fcxy("femk", fcys(int ), (int)649);
        }
        v5 = var1_1.method_5667();
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_3 = hb.lq - hb.fcxy("feml", fcxr(int ), (int)351)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == hb.fcxy("femm", fcys(int ), (int)650)) break;
            v6 /* !! */  = (long)hb.fcxy("femn", fcys(int ), (int)651);
        }
        v7 = var1_1.method_5477();
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_4 = hb.lq - hb.fcxy("femo", fcxr(int ), (int)352)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == hb.fcxy("femp", fcys(int ), (int)652)) break;
            v8 /* !! */  = (long)hb.fcxy("femq", fcys(int ), (int)653);
        }
        v9 = v7.getString();
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_5 = hb.lq - hb.fcxy("femr", fcxr(int ), (int)353)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == hb.fcxy("fems", fcys(int ), (int)654)) break;
            v10 /* !! */  = (long)hb.fcxy("femt", fcys(int ), (int)655);
        }
        v11 = "OfflinePlayer:" + v9;
        v12 /* !! */  = hb.lq;
        if (true) ** GOTO lbl63
        block53: while (true) {
            v12 /* !! */  = (long)(v13 - hb.fcxy("femu", fcxr(int ), (int)354));
lbl63:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -1433431009: {
                    v13 = hb.fcxy("femv", fcxr(int ), (int)355);
                    continue block53;
                }
                case 96162446: {
                    break block53;
                }
                case 1347974329: {
                    v13 = hb.fcxy("femw", fcxr(int ), (int)356);
                    continue block53;
                }
            }
            break;
        }
        v14 = v11.getBytes();
        v15 /* !! */  = hb.lq;
        if (true) ** GOTO lbl77
        block54: while (true) {
            v15 /* !! */  = (long)(hb.fcxy("femy", fcxr(int ), (int)358) - hb.fcxy("femx", fcxr(int ), (int)357));
lbl77:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -1617820698: {
                    continue block54;
                }
                case 96162446: {
                    break block54;
                }
            }
            break;
        }
        v16 = UUID.nameUUIDFromBytes(v14);
        v17 /* !! */  = hb.lq;
        if (true) ** GOTO lbl87
        block55: while (true) {
            v17 /* !! */  = (long)(hb.fcxy("fena", fcxr(int ), (int)360) - hb.fcxy("femz", fcxr(int ), (int)359));
lbl87:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case -993825275: {
                    continue block55;
                }
                case 96162446: {
                    break block55;
                }
            }
            break;
        }
        if (v5.equals(v16)) ** GOTO lbl162
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl32
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_6 = hb.lq - hb.fcxy("fenb", fcxr(int ), (int)361)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == hb.fcxy("fenc", fcys(int ), (int)656)) break;
                    v18 /* !! */  = (long)hb.fcxy("fend", fcys(int ), (int)657);
                }
                if (!var1_1.method_5767()) ** GOTO lbl162
                if (var2_4) ** GOTO lbl32
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_7 = hb.lq - hb.fcxy("fene", fcxr(int ), (int)362)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == hb.fcxy("fenf", fcys(int ), (int)658)) break;
                    v19 /* !! */  = (long)hb.fcxy("feng", fcys(int ), (int)659);
                }
                v20 = var1_1.method_5477();
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_8 = hb.lq - hb.fcxy("fenh", fcxr(int ), (int)363)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == hb.fcxy("feni", fcys(int ), (int)660)) break;
                    v21 /* !! */  = (long)hb.fcxy("fenj", fcys(int ), (int)661);
                }
                v22 = v20.getString();
                v23 /* !! */  = hb.lq;
                if (true) ** GOTO lbl120
                block59: while (true) {
                    v23 /* !! */  = (long)(hb.fcxy("fenl", fcxr(int ), (int)365) - hb.fcxy("fenk", fcxr(int ), (int)364));
lbl120:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -546499327: {
                            continue block59;
                        }
                        case 96162446: {
                            break block59;
                        }
                    }
                    break;
                }
                if (v22.contains("NPC")) ** GOTO lbl162
                if (var2_4) ** GOTO lbl32
                v24 /* !! */  = hb.lq;
                if (true) ** GOTO lbl131
                block60: while (true) {
                    v24 /* !! */  = (long)(v25 - hb.fcxy("fenm", fcxr(int ), (int)366));
lbl131:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case -1978921692: {
                            v25 = hb.fcxy("fenn", fcxr(int ), (int)367);
                            continue block60;
                        }
                        case 96162446: {
                            break block60;
                        }
                        case 247494514: {
                            v25 = hb.fcxy("feno", fcxr(int ), (int)368);
                            continue block60;
                        }
                    }
                    break;
                }
                v26 = var1_1.method_5477();
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_9 = hb.lq - hb.fcxy("fenp", fcxr(int ), (int)369)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == hb.fcxy("fenq", fcys(int ), (int)662)) break;
                    v27 /* !! */  = (long)hb.fcxy("fenr", fcys(int ), (int)663);
                }
                v28 = v26.getString();
                v29 /* !! */  = hb.lq;
                if (true) ** GOTO lbl151
                block62: while (true) {
                    v29 /* !! */  = (long)(hb.fcxy("fent", fcxr(int ), (int)371) - hb.fcxy("fens", fcxr(int ), (int)370));
lbl151:
                    // 2 sources

                    switch ((int)v29 /* !! */ ) {
                        case -913213216: {
                            continue block62;
                        }
                        case 96162446: {
                            break block62;
                        }
                    }
                    break;
                }
                if (v28.startsWith("[ZNPC]")) ** GOTO lbl162
                if (var2_4) ** GOTO lbl32
                v30 = hb.fcxy("fenu", fcys(int ), (int)664);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl165
lbl162:
                // 4 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v30 = hb.fcxy("fenv", fcys(int ), (int)665);
lbl165:
                // 2 sources

                return (boolean)v30;
            }
lbl166:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)hb.fcxy("fenw", fcys(int ), (int)666);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl203
            }
lbl171:
            // 3 sources

            case 1: {
                var3_3 /* !! */  = (int)hb.fcxy("fenx", fcys(int ), (int)667);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl181
            }
            case 2: {
                var3_3 /* !! */  = (int)hb.fcxy("feny", fcys(int ), (int)668);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl181:
            // 3 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hb.fcxy("fenz", fcys(int ), (int)669);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl195
                    break;
                }
            }
lbl187:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)hb.fcxy("feoa", fcys(int ), (int)670);
                if (!var4_2) ** GOTO lbl166
                throw null;
            }
            case 5: {
                var3_3 /* !! */  = (int)hb.fcxy("feob", fcys(int ), (int)671);
                if (!var4_2) ** GOTO lbl181
                throw null;
            }
lbl195:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)hb.fcxy("feoc", fcys(int ), (int)672);
                if (!var4_2) break;
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)hb.fcxy("feod", fcys(int ), (int)673);
                if (!var4_2) ** GOTO lbl171
                throw null;
            }
lbl203:
            // 2 sources

            case 8: {
                do {
                    var3_3 /* !! */  = (int)hb.fcxy("feoe", fcys(int ), (int)674);
                } while (!var4_2);
                throw null;
            }
            case 9: {
                var3_3 /* !! */  = (int)hb.fcxy("feof", fcys(int ), (int)675);
                if (!var4_2) ** GOTO lbl171
                throw null;
            }
            case 10: 
        }
        var3_3 /* !! */  = (int)hb.fcxy("feog", fcys(int ), (int)676);
        ** while (!var4_2)
lbl215:
        // 1 sources

        throw null;
    }
}

