/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10758
 *  com.google.common.collect.BiMap
 *  minecraft.class00159
 *  minecraft.class00392
 *  minecraft.class00786
 *  minecraft.class00800
 *  minecraft.class00802
 *  minecraft.class00806
 *  minecraft.class00810
 *  minecraft.class00818
 *  minecraft.class00821
 *  minecraft.class00824
 *  minecraft.class00830
 *  minecraft.class00836
 *  minecraft.class00837
 *  minecraft.class00843
 *  minecraft.class00854
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class01217
 *  minecraft.class01226
 *  minecraft.class01243
 *  minecraft.class01427
 *  minecraft.class01894
 *  minecraft.class01905
 *  minecraft.class01921
 *  minecraft.class01929
 *  minecraft.class02026
 *  minecraft.class02055
 *  minecraft.class02471
 *  minecraft.class02474
 *  minecraft.class02477
 *  minecraft.class02482
 *  minecraft.class02484
 *  minecraft.class02500
 *  minecraft.class02505
 *  minecraft.class02859
 *  minecraft.class03529
 *  minecraft.class03556
 *  minecraft.class03648
 *  minecraft.class03711
 *  minecraft.class03741
 *  minecraft.class04068
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04588
 *  minecraft.class05202
 *  minecraft.class05912
 *  minecraft.class05920
 *  minecraft.class06124
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06665
 *  minecraft.class07078
 *  minecraft.class07296
 *  minecraft.class07310
 *  minecraft.class07314
 *  minecraft.class07669
 *  minecraft.class08092
 */
package minecraft;

import Nursultan.class10758;
import com.google.common.collect.BiMap;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;
import minecraft.class00159;
import minecraft.class00392;
import minecraft.class00786;
import minecraft.class00800;
import minecraft.class00802;
import minecraft.class00806;
import minecraft.class00810;
import minecraft.class00818;
import minecraft.class00821;
import minecraft.class00824;
import minecraft.class00830;
import minecraft.class00836;
import minecraft.class00837;
import minecraft.class00843;
import minecraft.class00854;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01217;
import minecraft.class01226;
import minecraft.class01243;
import minecraft.class01427;
import minecraft.class01894;
import minecraft.class01905;
import minecraft.class01921;
import minecraft.class01929;
import minecraft.class02026;
import minecraft.class02055;
import minecraft.class02471;
import minecraft.class02474;
import minecraft.class02477;
import minecraft.class02482;
import minecraft.class02484;
import minecraft.class02500;
import minecraft.class02505;
import minecraft.class02859;
import minecraft.class03529;
import minecraft.class03556;
import minecraft.class03648;
import minecraft.class03711;
import minecraft.class03741;
import minecraft.class04068;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04588;
import minecraft.class05202;
import minecraft.class05912;
import minecraft.class05920;
import minecraft.class06124;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06665;
import minecraft.class07078;
import minecraft.class07165;
import minecraft.class07296;
import minecraft.class07310;
import minecraft.class07314;
import minecraft.class07669;
import minecraft.class08092;

public class class07116
implements class02026 {
    public static final List<class07078<?>> N = List.of(class07078.NT, class07078.H, class07078.Ne, class07078.yz, class07078.J, class07078.NV, class07078.Nh, class07078.Q, class07078.yC, class07078.Na, class07078.yM, class07078.NQ, class07078.l, class07078.NC, class07078.Ni, class07078.m, class07078.NP, class07078.yY, class07078.NW, class07078.z, class07078.t, class07078.M, class07078.NH);
    public static final List<class07078<?>> y = List.of(class07078.yK, class07078.NR, class07078.yb);
    private static final class06581[] u = new class06581[]{class06570.vu, class06570.vR, class06570.vM, class06570.vi};
    private static final class06581[] i = new class06581[]{class06570.jv, class06570.jn, class06570.jb, class06570.jj};
    private static final class06581[] R = new class06581[]{class06570.sS, class06570.TD, class06570.bu, class06570.bo, class06570.bq, class06570.bV, class06570.be, class06570.vu, class06570.vi, class06570.vR, class06570.vM, class06570.vB, class06570.vZ, class06570.vx, class06570.nN, class06570.ni, class06570.nR, class06570.nM, class06570.nB, class06570.nZ, class06570.nT, class06570.Gb, class06570.Gj, class06570.Gv, class06570.Gn, class06570.GG, class06570.GI, class06570.Gc, class06570.GX, class06570.Ga, class06570.lL, class06570.lu, class06570.lt, class06570.lw, class06570.lY, class06570.ny, class06570.dk, class06570.wN, class06570.wZ, class06570.wy};
    public static final class06581[] L = new class06581[]{class06570.TT, class06570.TI, class06570.Tk, class06570.Tt, class06570.TV, class06570.Ta, class06570.TC};
    private static final Comparator<class03529<?>> M = Comparator.comparing(class035292 -> class035292.B().N());

    private static class07165 L(class07165 class071652, class02055<class06581> class020552) {
        for (class06581 class065812 : u) {
            class071652.N(class04206.B.y((Object)class065812).N(), class00824.N(Optional.empty(), Optional.empty(), Optional.of(class00837.N().N(class020552, new class07310[]{class065812}).y())));
        }
        return class071652;
    }

    private static class07165 y_7(class07165 class071652, class02055<class06581> class020552) {
        for (class06581 class065812 : i) {
            class071652.N(class04206.B.y((Object)class065812).N(), class00830.N((class00837)class00837.N().N(class020552, new class07310[]{class065812})));
        }
        return class071652;
    }

    private static class07165 y(class07165 class071652, class01905<class02505> class019052) {
        class07116.N(class019052).forEach(class035292 -> class071652.N(class035292.B().N().toString(), class07669.N((class00810)class00810.N().N(class00159.N().N(class02471.N((class02477)class02484.NO, (Object)class035292)).y()))));
        return class071652;
    }

    private static class07165 N_69(class07165 class071652, class01905<class03648> class019052) {
        class07116.N(class019052).forEach(class035292 -> class071652.N(class035292.B().N().toString(), class07669.N((class00810)class00810.N().N(class00159.N().N(class02471.N((class02477)class02484.ND, (Object)class035292)).y()))));
        return class071652;
    }

    private static <T> Stream<class03529<T>> N(class01905<T> class019052) {
        return class019052.z().sorted(M);
    }

    private static class07165 N(class07165 class071652, class02055<class06581> class020552) {
        for (class06581 class065812 : R) {
            class071652.N(class04206.B.y((Object)class065812).N(), class00786.N(class020552, (class07310)class065812));
        }
        return class071652;
    }

    private static class07165 N(class07165 class071652, Stream<class07078<?>> stream, class02055<class07078<?>> class020552, Stream<class07078<?>> stream2) {
        stream.forEach(class070782 -> class071652.N(class07078.N((class07078)class070782).toString(), class00802.N((class00810)class00810.N().N(class020552, class070782))));
        stream2.forEach(class070782 -> class071652.N(class07078.N((class07078)class070782).toString(), class00802.N(Optional.of(class00810.N().N(class020552, class070782).y()), Optional.of(class00810.N().N(class020552, class070782).y()), Optional.empty())));
        return class071652;
    }

    public static class03711 N(class03711 class037112, Consumer<class03711> consumer, class02055<class07078<?>> class020552, Stream<class07078<?>> stream, Stream<class07078<?>> stream2) {
        return class07116.N(class07165.N(), stream, class020552, stream2).N(class037112).N((class07310)class06570.GG, (class00392)class00392.L((String)"advancements.husbandry.breed_all_animals.title"), (class00392)class00392.L((String)"advancements.husbandry.breed_all_animals.description"), null, class07296.field_1250, true, true, false).N(class10758.N((int)100)).N(consumer, "husbandry/bred_all_animals");
    }

    public void N(class01929 class019292, Consumer<class03711> consumer) {
        class01921 class019212 = class019292.y(class04227.I);
        class01921 class019213 = class019292.y(class04227.F);
        class01921 class019214 = class019292.y(class04227.Z);
        class01921 class019215 = class019292.y(class04227.yB);
        class01921 class019216 = class019292.y(class04227.Nf);
        class01921 class019217 = class019292.y(class04227.yY);
        class01921 class019218 = class019292.y(class04227.yR);
        class03711 class037112 = class07165.N().N((class07310)class00869.zy, (class00392)class00392.L((String)"advancements.husbandry.root.title"), (class00392)class00392.L((String)"advancements.husbandry.root.description"), class01894.y((String)"gui/advancements/backgrounds/husbandry"), class07296.field_1254, false, false, false).N("consumed_item", class00786.y()).N(consumer, "husbandry/root");
        class03711 class037113 = class07165.N().N(class037112).N((class07310)class06570.bL, (class00392)class00392.L((String)"advancements.husbandry.plant_seed.title"), (class00392)class00392.L((String)"advancements.husbandry.plant_seed.description"), null, class07296.field_1254, true, true, false).N(class03741.y).N("wheat", class05920.N((class00891)class00869.Lh)).N("pumpkin_stem", class05920.N((class00891)class00869.Re)).N("melon_stem", class05920.N((class00891)class00869.RH)).N("beetroots", class05920.N((class00891)class00869.Ew)).N("nether_wart", class05920.N((class00891)class00869.MR)).N("torchflower", class05920.N((class00891)class00869.EG)).N("pitcher_pod", class05920.N((class00891)class00869.El)).N(consumer, "husbandry/plant_seed");
        class07116.N(class07165.N().N(class037112).N((class07310)class06570.bL, (class00392)class00392.L((String)"advancements.husbandry.breed_an_animal.title"), (class00392)class00392.L((String)"advancements.husbandry.breed_an_animal.description"), null, class07296.field_1254, true, true, false).N(class03741.y).N("bred", class00802.y()).N(consumer, "husbandry/breed_an_animal"), consumer, class019212, N.stream(), y.stream());
        class07116.N(class07165.N(), (class02055<class06581>)class019213).N(class037113).N((class07310)class06570.sS, (class00392)class00392.L((String)"advancements.husbandry.balanced_diet.title"), (class00392)class00392.L((String)"advancements.husbandry.balanced_diet.description"), null, class07296.field_1250, true, true, false).N(class10758.N((int)100)).N(consumer, "husbandry/balanced_diet");
        class07165.N().N(class037113).N((class07310)class06570.TS, (class00392)class00392.L((String)"advancements.husbandry.netherite_hoe.title"), (class00392)class00392.L((String)"advancements.husbandry.netherite_hoe.description"), null, class07296.field_1250, true, true, false).N(class10758.N((int)100)).N("netherite_hoe", class00843.N((class07310[])new class07310[]{class06570.TS})).N(consumer, "husbandry/obtain_netherite_hoe");
        class03711 class037114 = class07165.N().N(class037112).N((class07310)class06570.Gr, (class00392)class00392.L((String)"advancements.husbandry.tame_an_animal.title"), (class00392)class00392.L((String)"advancements.husbandry.tame_an_animal.description"), null, class07296.field_1254, true, true, false).N("tamed_animal", class07669.y()).N(consumer, "husbandry/tame_an_animal");
        class03711 class037115 = class07116.L(class07165.N(), (class02055<class06581>)class019213).N(class037112).N(class03741.y).N((class07310)class06570.jr, (class00392)class00392.L((String)"advancements.husbandry.fishy_business.title"), (class00392)class00392.L((String)"advancements.husbandry.fishy_business.description"), null, class07296.field_1254, true, true, false).N(consumer, "husbandry/fishy_business");
        class03711 class037116 = class07116.y_7(class07165.N(), (class02055<class06581>)class019213).N(class037115).N(class03741.y).N((class07310)class06570.jb, (class00392)class00392.L((String)"advancements.husbandry.tactical_fishing.title"), (class00392)class00392.L((String)"advancements.husbandry.tactical_fishing.description"), null, class07296.field_1254, true, true, false).N(consumer, "husbandry/tactical_fishing");
        class03711 class037117 = class07165.N().N(class037116).N(class03741.y).N(class04206.B.y((Object)class06570.jt).N(), class00830.N((class00837)class00837.N().N((class02055)class019213, new class07310[]{class06570.jt}))).N((class07310)class06570.jt, (class00392)class00392.L((String)"advancements.husbandry.axolotl_in_a_bucket.title"), (class00392)class00392.L((String)"advancements.husbandry.axolotl_in_a_bucket.description"), null, class07296.field_1254, true, true, false).N(consumer, "husbandry/axolotl_in_a_bucket");
        class07165.N().N(class037117).N("kill_axolotl_target", class00806.N((class00810)class00810.N().N((class02055)class019212, class07078.z))).N((class07310)class06570.jn, (class00392)class00392.L((String)"advancements.husbandry.kill_axolotl_target.title"), (class00392)class00392.L((String)"advancements.husbandry.kill_axolotl_target.description"), null, class07296.field_1254, true, true, false).N(consumer, "husbandry/kill_axolotl_target");
        class07116.N_69(class07165.N(), (class01905<class03648>)class019216).N(class037114).N((class07310)class06570.vu, (class00392)class00392.L((String)"advancements.husbandry.complete_catalogue.title"), (class00392)class00392.L((String)"advancements.husbandry.complete_catalogue.description"), null, class07296.field_1250, true, true, false).N(class10758.N((int)50)).N(consumer, "husbandry/complete_catalogue");
        class07116.y(class07165.N(), (class01905<class02505>)class019217).N(class037114).N((class07310)class06570.vO, (class00392)class00392.L((String)"advancements.husbandry.whole_pack.title"), (class00392)class00392.L((String)"advancements.husbandry.whole_pack.description"), null, class07296.field_1250, true, true, false).N(class10758.N((int)50)).N(consumer, "husbandry/whole_pack");
        class03711 class037118 = class07165.N().N(class037112).N("safely_harvest_honey", class05920.N((class00818)class00818.N().N(class01427.N().N((class02055)class019214, class01210.NC)).N(true), (class00837)class00837.N().N((class02055)class019213, new class07310[]{class06570.nP}))).N((class07310)class06570.wZ, (class00392)class00392.L((String)"advancements.husbandry.safely_harvest_honey.title"), (class00392)class00392.L((String)"advancements.husbandry.safely_harvest_honey.description"), null, class07296.field_1254, true, true, false).N(consumer, "husbandry/safely_harvest_honey");
        class03711 class037119 = class07165.N().N(class037118).N((class07310)class06570.wR, (class00392)class00392.L((String)"advancements.husbandry.wax_on.title"), (class00392)class00392.L((String)"advancements.husbandry.wax_on.description"), null, class07296.field_1254, true, true, false).N("wax_on", class05920.N((class00818)class00818.N().N(class01427.N().N((class02055)class019214, (Collection)((BiMap)class02859.N.get()).keySet())), (class00837)class00837.N().N((class02055)class019213, new class07310[]{class06570.wR}))).N(consumer, "husbandry/wax_on");
        class07165.N().N(class037119).N((class07310)class06570.Tk, (class00392)class00392.L((String)"advancements.husbandry.wax_off.title"), (class00392)class00392.L((String)"advancements.husbandry.wax_off.description"), null, class07296.field_1254, true, true, false).N("wax_off", class05920.N((class00818)class00818.N().N(class01427.N().N((class02055)class019214, (Collection)((BiMap)class02859.y.get()).keySet())), (class00837)class00837.N().N((class02055)class019213, (class07310[])L))).N(consumer, "husbandry/wax_off");
        class03711 class0371110 = class07165.N().N(class037112).N(class04206.B.y((Object)class06570.jG).N(), class00830.N((class00837)class00837.N().N((class02055)class019213, new class07310[]{class06570.jG}))).N((class07310)class06570.jG, (class00392)class00392.L((String)"advancements.husbandry.tadpole_in_a_bucket.title"), (class00392)class00392.L((String)"advancements.husbandry.tadpole_in_a_bucket.description"), null, class07296.field_1254, true, true, false).N(consumer, "husbandry/tadpole_in_a_bucket");
        class03711 class0371111 = class07116.N(class019212, (class02055<class06581>)class019213, (class01905<class04068>)class019215, class07165.N()).N(class0371110).N((class07310)class06570.Gr, (class00392)class00392.L((String)"advancements.husbandry.leash_all_frog_variants.title"), (class00392)class00392.L((String)"advancements.husbandry.leash_all_frog_variants.description"), null, class07296.field_1254, true, true, false).N(consumer, "husbandry/leash_all_frog_variants");
        class07165.N().N(class0371111).N((class07310)class06570.wx, (class00392)class00392.L((String)"advancements.husbandry.froglights.title"), (class00392)class00392.L((String)"advancements.husbandry.froglights.description"), null, class07296.field_1250, true, true, false).N("froglights", class00843.N((class07310[])new class07310[]{class06570.wS, class06570.wD, class06570.wx})).N(consumer, "husbandry/froglights");
        class07165.N().N(class037112).N("silk_touch_nest", class05912.N((class00891)class00869.Ti, (class00837)class00837.N().N(class00159.N().N(class02482.y, (class02500)class02474.N(List.of(new class00800((class03556)class019218.y(class07314.t), class00836.y((int)1))))).y()), (class00836)class00836.N((int)3))).N((class07310)class00869.Ti, (class00392)class00392.L((String)"advancements.husbandry.silk_touch_nest.title"), (class00392)class00392.L((String)"advancements.husbandry.silk_touch_nest.description"), null, class07296.field_1254, true, true, false).N(consumer, "husbandry/silk_touch_nest");
        class07165.N().N(class037112).N((class07310)class06570.sb, (class00392)class00392.L((String)"advancements.husbandry.ride_a_boat_with_a_goat.title"), (class00392)class00392.L((String)"advancements.husbandry.ride_a_boat_with_a_goat.description"), null, class07296.field_1254, true, true, false).N("ride_a_boat_with_a_goat", class04588.N((class00810)class00810.N().N(class00810.N().N((class02055)class019212, class01217.K).y(class00810.N().N((class02055)class019212, class07078.NW))))).N(consumer, "husbandry/ride_a_boat_with_a_goat");
        class07165.N().N(class037112).N((class07310)class06570.vU, (class00392)class00392.L((String)"advancements.husbandry.make_a_sign_glow.title"), (class00392)class00392.L((String)"advancements.husbandry.make_a_sign_glow.description"), null, class07296.field_1254, true, true, false).N("make_a_sign_glow", class05920.N((class00818)class00818.N().N(class01427.N().N((class02055)class019214, class01210.Na)), (class00837)class00837.N().N((class02055)class019213, new class07310[]{class06570.vU}))).N(consumer, "husbandry/make_a_sign_glow");
        class03711 class0371112 = class07165.N().N(class037112).N((class07310)class06570.vx, (class00392)class00392.L((String)"advancements.husbandry.allay_deliver_item_to_player.title"), (class00392)class00392.L((String)"advancements.husbandry.allay_deliver_item_to_player.description"), null, class07296.field_1254, true, true, true).N("allay_deliver_item_to_player", class05202.N(Optional.empty(), Optional.empty(), Optional.of(class00821.N((class00810)class00810.N().N((class02055)class019212, class07078.i))))).N(consumer, "husbandry/allay_deliver_item_to_player");
        class07165.N().N(class0371112).N((class07310)class06570.mM, (class00392)class00392.L((String)"advancements.husbandry.allay_deliver_cake_to_note_block.title"), (class00392)class00392.L((String)"advancements.husbandry.allay_deliver_cake_to_note_block.description"), null, class07296.field_1254, true, true, true).N("allay_deliver_cake_to_note_block", class05920.y((class00818)class00818.N().N(class01427.N().N((class02055)class019214, new class00891[]{class00869.yR})), (class00837)class00837.N().N((class02055)class019213, new class07310[]{class06570.vI}))).N(consumer, "husbandry/allay_deliver_cake_to_note_block");
        class03711 class0371113 = class07165.N().N(class037112).N((class07310)class06570.Ez, (class00392)class00392.L((String)"advancements.husbandry.obtain_sniffer_egg.title"), (class00392)class00392.L((String)"advancements.husbandry.obtain_sniffer_egg.description"), null, class07296.field_1254, true, true, true).N("obtain_sniffer_egg", class00843.N((class07310[])new class07310[]{class06570.Ez})).N(consumer, "husbandry/obtain_sniffer_egg");
        class03711 class0371114 = class07165.N().N(class0371113).N((class07310)class06570.ll, (class00392)class00392.L((String)"advancements.husbandry.feed_snifflet.title"), (class00392)class00392.L((String)"advancements.husbandry.feed_snifflet.description"), null, class07296.field_1254, true, true, true).N("feed_snifflet", class01243.y((class00837)class00837.N().N((class02055)class019213, class01226.NY), Optional.of(class00821.N((class00810)class00810.N().N((class02055)class019212, class07078.yb).N(class00854.N().M(Boolean.valueOf(true))))))).N(consumer, "husbandry/feed_snifflet");
        class07165.N().N(class0371114).N((class07310)class06570.ld, (class00392)class00392.L((String)"advancements.husbandry.plant_any_sniffer_seed.title"), (class00392)class00392.L((String)"advancements.husbandry.plant_any_sniffer_seed.description"), null, class07296.field_1254, true, true, true).N(class03741.y).N("torchflower", class05920.N((class00891)class00869.EG)).N("pitcher_pod", class05920.N((class00891)class00869.El)).N(consumer, "husbandry/plant_any_sniffer_seed");
        class07165.N().N(class037114).N((class07310)class06570.vr, (class00392)class00392.L((String)"advancements.husbandry.remove_wolf_armor.title"), (class00392)class00392.L((String)"advancements.husbandry.remove_wolf_armor.description"), null, class07296.field_1254, true, true, false).N("remove_wolf_armor", class01243.N((class00837)class00837.N().N((class02055)class019213, new class07310[]{class06570.sA}), Optional.of(class00821.N((class00810)class00810.N().N((class02055)class019212, class07078.yC))))).N(consumer, "husbandry/remove_wolf_armor");
        class07165.N().N(class037114).N((class07310)class06570.sA, (class00392)class00392.L((String)"advancements.husbandry.repair_wolf_armor.title"), (class00392)class00392.L((String)"advancements.husbandry.repair_wolf_armor.description"), null, class07296.field_1254, true, true, false).N("repair_wolf_armor", class01243.y((class00837)class00837.N().N((class02055)class019213, new class07310[]{class06570.sF}), Optional.of(class00821.N((class00810)class00810.N().N((class02055)class019212, class07078.yC).N(class06124.N().i(class00837.N().N((class02055)class019213, new class07310[]{class06570.sA}).N(class00159.N().N(class02471.N((class02477)class02484.i, (Object)0)).y()))))))).N(consumer, "husbandry/repair_wolf_armor");
        class07165.N().N(class037112).N((class07310)class06570.EU, (class00392)class00392.L((String)"advancements.husbandry.place_dried_ghast_in_water.title"), (class00392)class00392.L((String)"advancements.husbandry.place_dried_ghast_in_water.description"), null, class07296.field_1254, true, true, false).N("place_dried_ghast_in_water", class05920.N((class00891)class00869.mu, (class08092)class06665.q, (boolean)true)).N(consumer, "husbandry/place_dried_ghast_in_water");
    }

    private static class07165 N(class02055<class07078<?>> class020552, class02055<class06581> class020553, class01905<class04068> class019052, class07165 class071652) {
        class07116.N(class019052).forEach(class035292 -> class071652.N(class035292.B().N().toString(), class01243.y((class00837)class00837.N().N(class020553, new class07310[]{class06570.Gr}), Optional.of(class00821.N((class00810)class00810.N().N(class020552, class07078.NR).N(class00159.N().N(class02471.N((class02477)class02484.NA, (Object)class035292)).y()))))));
        return class071652;
    }
}

