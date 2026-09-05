/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10758
 *  minecraft.class00392
 *  minecraft.class00761
 *  minecraft.class00767
 *  minecraft.class00773
 *  minecraft.class00779
 *  minecraft.class00789
 *  minecraft.class00806
 *  minecraft.class00810
 *  minecraft.class00811
 *  minecraft.class00814
 *  minecraft.class00816
 *  minecraft.class00818
 *  minecraft.class00821
 *  minecraft.class00825
 *  minecraft.class00836
 *  minecraft.class00837
 *  minecraft.class00843
 *  minecraft.class00853
 *  minecraft.class00854
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01226
 *  minecraft.class01243
 *  minecraft.class01338
 *  minecraft.class01408
 *  minecraft.class01427
 *  minecraft.class01514
 *  minecraft.class01894
 *  minecraft.class01921
 *  minecraft.class01929
 *  minecraft.class02026
 *  minecraft.class02055
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class03562
 *  minecraft.class03659
 *  minecraft.class03696
 *  minecraft.class03711
 *  minecraft.class03741
 *  minecraft.class04227
 *  minecraft.class04433
 *  minecraft.class05196
 *  minecraft.class05202
 *  minecraft.class05919
 *  minecraft.class05920
 *  minecraft.class05946
 *  minecraft.class05947
 *  minecraft.class05957
 *  minecraft.class06124
 *  minecraft.class06273
 *  minecraft.class06570
 *  minecraft.class07047
 *  minecraft.class07078
 *  minecraft.class07296
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07682
 *  minecraft.class07691
 *  minecraft.class07700
 *  minecraft.class08092
 */
package minecraft;

import Nursultan.class10758;
import java.util.Optional;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class00761;
import minecraft.class00767;
import minecraft.class00773;
import minecraft.class00779;
import minecraft.class00789;
import minecraft.class00806;
import minecraft.class00810;
import minecraft.class00811;
import minecraft.class00814;
import minecraft.class00816;
import minecraft.class00818;
import minecraft.class00821;
import minecraft.class00825;
import minecraft.class00836;
import minecraft.class00837;
import minecraft.class00843;
import minecraft.class00853;
import minecraft.class00854;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01226;
import minecraft.class01243;
import minecraft.class01338;
import minecraft.class01408;
import minecraft.class01427;
import minecraft.class01514;
import minecraft.class01894;
import minecraft.class01921;
import minecraft.class01929;
import minecraft.class02026;
import minecraft.class02055;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class03562;
import minecraft.class03659;
import minecraft.class03696;
import minecraft.class03711;
import minecraft.class03741;
import minecraft.class04227;
import minecraft.class04433;
import minecraft.class05196;
import minecraft.class05202;
import minecraft.class05919;
import minecraft.class05920;
import minecraft.class05946;
import minecraft.class05947;
import minecraft.class05957;
import minecraft.class06124;
import minecraft.class06273;
import minecraft.class06570;
import minecraft.class07047;
import minecraft.class07078;
import minecraft.class07118;
import minecraft.class07165;
import minecraft.class07296;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07682;
import minecraft.class07691;
import minecraft.class07700;
import minecraft.class08092;

public class class07114
implements class02026 {
    public void N(class01929 class019292, Consumer<class03711> consumer) {
        class01921 class019212 = class019292.y(class04227.I);
        class01921 class019213 = class019292.y(class04227.F);
        class01921 class019214 = class019292.y(class04227.Z);
        class03711 class037112 = class07165.N().N((class07310)class00869.Eo, (class00392)class00392.L((String)"advancements.nether.root.title"), (class00392)class00392.L((String)"advancements.nether.root.description"), class01894.y((String)"gui/advancements/backgrounds/nether"), class07296.field_1254, false, false, false).N("entered_nether", class00767.N((class05946)class07299.field_25180)).N(consumer, "nether/root");
        class03711 class037113 = class07165.N().N(class037112).N((class07310)class06570.GZ, (class00392)class00392.L((String)"advancements.nether.return_to_sender.title"), (class00392)class00392.L((String)"advancements.nether.return_to_sender.description"), null, class07296.field_1250, true, true, false).N(class10758.N((int)50)).N("killed_ghast", class00825.N((class00810)class00810.N().N((class02055)class019212, class07078.NB), (class00789)class00789.N().N(class03659.N((class03530)class03696.z)).N(class00810.N().N((class02055)class019212, class07078.NL)))).N(consumer, "nether/return_to_sender");
        class03711 class037114 = class07165.N().N(class037112).N((class07310)class00869.ML, (class00392)class00392.L((String)"advancements.nether.find_fortress.title"), (class00392)class00392.L((String)"advancements.nether.find_fortress.description"), null, class07296.field_1254, true, true, false).N("fortress", class07682.N((class00818)class00818.y((class03556)class019292.y(class04227.yj).y(class04433.P)))).N(consumer, "nether/find_fortress");
        class07165.N().N(class037112).N((class07310)class06570.Gt, (class00392)class00392.L((String)"advancements.nether.fast_travel.title"), (class00392)class00392.L((String)"advancements.nether.fast_travel.description"), null, class07296.field_1250, true, true, false).N(class10758.N((int)100)).N("travelled", class00811.N((class00761)class00761.N((class00816)class00816.y((double)7000.0)))).N(consumer, "nether/fast_travel");
        class07165.N().N(class037113).N((class07310)class06570.nE, (class00392)class00392.L((String)"advancements.nether.uneasy_alliance.title"), (class00392)class00392.L((String)"advancements.nether.uneasy_alliance.description"), null, class07296.field_1250, true, true, false).N(class10758.N((int)100)).N("killed_ghast", class00825.N((class00810)class00810.N().N((class02055)class019212, class07078.NB).N(class00818.N((class05946)class07299.field_25179)))).N(consumer, "nether/uneasy_alliance");
        class03711 class037115 = class07165.N().N(class037114).N((class07310)class00869.Bl, (class00392)class00392.L((String)"advancements.nether.get_wither_skull.title"), (class00392)class00392.L((String)"advancements.nether.get_wither_skull.description"), null, class07296.field_1254, true, true, false).N("wither_skull", class00843.N((class07310[])new class07310[]{class00869.Bl})).N(consumer, "nether/get_wither_skull");
        class03711 class037116 = class07165.N().N(class037115).N((class07310)class06570.Gg, (class00392)class00392.L((String)"advancements.nether.summon_wither.title"), (class00392)class00392.L((String)"advancements.nether.summon_wither.description"), null, class07296.field_1254, true, true, false).N("summoned", class07691.N((class00810)class00810.N().N((class02055)class019212, class07078.yF))).N(consumer, "nether/summon_wither");
        class03711 class037117 = class07165.N().N(class037114).N((class07310)class06570.nU, (class00392)class00392.L((String)"advancements.nether.obtain_blaze_rod.title"), (class00392)class00392.L((String)"advancements.nether.obtain_blaze_rod.description"), null, class07296.field_1254, true, true, false).N("blaze_rod", class00843.N((class07310[])new class07310[]{class06570.nU})).N(consumer, "nether/obtain_blaze_rod");
        class03711 class037118 = class07165.N().N(class037116).N((class07310)class00869.MO, (class00392)class00392.L((String)"advancements.nether.create_beacon.title"), (class00392)class00392.L((String)"advancements.nether.create_beacon.description"), null, class07296.field_1254, true, true, false).N("beacon", class00779.N((class00836)class00836.y((int)1))).N(consumer, "nether/create_beacon");
        class07165.N().N(class037118).N((class07310)class00869.MO, (class00392)class00392.L((String)"advancements.nether.create_full_beacon.title"), (class00392)class00392.L((String)"advancements.nether.create_full_beacon.description"), null, class07296.field_1249, true, true, false).N("beacon", class00779.N((class00836)class00836.N((int)4))).N(consumer, "nether/create_full_beacon");
        class03711 class037119 = class07165.N().N(class037117).N((class07310)class06570.ns, (class00392)class00392.L((String)"advancements.nether.brew_potion.title"), (class00392)class00392.L((String)"advancements.nether.brew_potion.description"), null, class07296.field_1254, true, true, false).N("potion", class00773.y()).N(consumer, "nether/brew_potion");
        class03711 class0371110 = class07165.N().N(class037119).N((class07310)class06570.jT, (class00392)class00392.L((String)"advancements.nether.all_potions.title"), (class00392)class00392.L((String)"advancements.nether.all_potions.description"), null, class07296.field_1250, true, true, false).N(class10758.N((int)100)).N("all_effects", class00806.N((class00814)class00814.N().N(class07047.N).N(class07047.y).N(class07047.i).N(class07047.B).N(class07047.z).N(class07047.E).N(class07047.W).N(class07047.m).N(class07047.s).N(class07047.b).N(class07047.j).N(class07047.Y).N(class07047.U).N(class07047.e).N(class07047.H).N(class07047.K).N(class07047.V))).N(consumer, "nether/all_potions");
        class07165.N().N(class0371110).N((class07310)class06570.jU, (class00392)class00392.L((String)"advancements.nether.all_effects.title"), (class00392)class00392.L((String)"advancements.nether.all_effects.description"), null, class07296.field_1250, true, true, true).N(class10758.N((int)1000)).N("all_effects", class00806.N((class00814)class00814.N().N(class07047.N).N(class07047.y).N(class07047.i).N(class07047.B).N(class07047.z).N(class07047.E).N(class07047.W).N(class07047.m).N(class07047.s).N(class07047.b).N(class07047.j).N(class07047.v).N(class07047.L).N(class07047.u).N(class07047.d).N(class07047.l).N(class07047.t).N(class07047.T).N(class07047.Z).N(class07047.U).N(class07047.Y).N(class07047.Q).N(class07047.O).N(class07047.P).N(class07047.g).N(class07047.I).N(class07047.J).N(class07047.e).N(class07047.H).N(class07047.K).N(class07047.V).N(class07047.o).N(class07047.q).N(class07047.c))).N(consumer, "nether/all_effects");
        class03711 class0371111 = class07165.N().N(class037112).N((class07310)class06570.Ng, (class00392)class00392.L((String)"advancements.nether.obtain_ancient_debris.title"), (class00392)class00392.L((String)"advancements.nether.obtain_ancient_debris.description"), null, class07296.field_1254, true, true, false).N("ancient_debris", class00843.N((class07310[])new class07310[]{class06570.Ng})).N(consumer, "nether/obtain_ancient_debris");
        class07165.N().N(class0371111).N((class07310)class06570.bO, (class00392)class00392.L((String)"advancements.nether.netherite_armor.title"), (class00392)class00392.L((String)"advancements.nether.netherite_armor.description"), null, class07296.field_1250, true, true, false).N(class10758.N((int)100)).N("netherite_armor", class00843.N((class07310[])new class07310[]{class06570.bQ, class06570.bO, class06570.bg, class06570.bI})).N(consumer, "nether/netherite_armor");
        class03711 class0371112 = class07165.N().N(class037112).N((class07310)class06570.wE, (class00392)class00392.L((String)"advancements.nether.obtain_crying_obsidian.title"), (class00392)class00392.L((String)"advancements.nether.obtain_crying_obsidian.description"), null, class07296.field_1254, true, true, false).N("crying_obsidian", class00843.N((class07310[])new class07310[]{class06570.wE})).N(consumer, "nether/obtain_crying_obsidian");
        class07165.N().N(class0371112).N((class07310)class06570.wd, (class00392)class00392.L((String)"advancements.nether.charge_respawn_anchor.title"), (class00392)class00392.L((String)"advancements.nether.charge_respawn_anchor.description"), null, class07296.field_1254, true, true, false).N("charge_respawn_anchor", class05920.N((class00818)class00818.N().N(class01427.N().N((class02055)class019214, new class00891[]{class00869.TE}).N(class01408.N().N((class08092)class01338.u, 4))), (class00837)class00837.N().N((class02055)class019213, new class07310[]{class00869.io}))).N(consumer, "nether/charge_respawn_anchor");
        class03711 class0371113 = class07165.N().N(class037112).N((class07310)class06570.sP, (class00392)class00392.L((String)"advancements.nether.ride_strider.title"), (class00392)class00392.L((String)"advancements.nether.ride_strider.description"), null, class07296.field_1254, true, true, false).N("used_warped_fungus_on_a_stick", class00853.N(Optional.of(class00821.N((class00810)class00810.N().N(class00810.N().N((class02055)class019212, class07078.yY)))), Optional.of(class00837.N().N((class02055)class019213, new class07310[]{class06570.sP}).y()), (class00836)class00836.L)).N(consumer, "nether/ride_strider");
        class07165.N().N(class0371113).N((class07310)class06570.sP, (class00392)class00392.L((String)"advancements.nether.ride_strider_in_overworld_lava.title"), (class00392)class00392.L((String)"advancements.nether.ride_strider_in_overworld_lava.description"), null, class07296.field_1254, true, true, false).N("ride_entity_distance", class00811.N((class00810)class00810.N().N(class00818.N((class05946)class07299.field_25179)).N(class00810.N().N((class02055)class019212, class07078.yY)), (class00761)class00761.N((class00816)class00816.y((double)50.0)))).N(consumer, "nether/ride_strider_in_overworld_lava");
        class07118.N(class07165.N(), class019292, class03562.y.N().toList()).N(class0371113).N((class07310)class06570.bI, (class00392)class00392.L((String)"advancements.nether.explore_nether.title"), (class00392)class00392.L((String)"advancements.nether.explore_nether.description"), null, class07296.field_1250, true, true, false).N(class10758.N((int)500)).N(consumer, "nether/explore_nether");
        class03711 class0371114 = class07165.N().N(class037112).N((class07310)class06570.wn, (class00392)class00392.L((String)"advancements.nether.find_bastion.title"), (class00392)class00392.L((String)"advancements.nether.find_bastion.description"), null, class07296.field_1254, true, true, false).N("bastion", class07682.N((class00818)class00818.y((class03556)class019292.y(class04227.yj).y(class04433.j)))).N(consumer, "nether/find_bastion");
        class07165.N().N(class0371114).N((class07310)class00869.LA, (class00392)class00392.L((String)"advancements.nether.loot_bastion.title"), (class00392)class00392.L((String)"advancements.nether.loot_bastion.description"), null, class07296.field_1254, true, true, false).N(class03741.y).N("loot_bastion_other", class05947.N((class05946)class06273.e)).N("loot_bastion_treasure", class05947.N((class05946)class06273.V)).N("loot_bastion_hoglin_stable", class05947.N((class05946)class06273.c)).N("loot_bastion_bridge", class05947.N((class05946)class06273.H)).N(consumer, "nether/loot_bastion");
        class05196 class051962 = class05196.N((class05957[])new class05957[]{class07700.N((class05919)class05919.field_935, (class00810)class00810.N().N(class06124.N().N(class00837.N().N((class02055)class019213, class01226.NG)))).y().build(), class07700.N((class05919)class05919.field_935, (class00810)class00810.N().N(class06124.N().y(class00837.N().N((class02055)class019213, class01226.NG)))).y().build(), class07700.N((class05919)class05919.field_935, (class00810)class00810.N().N(class06124.N().L(class00837.N().N((class02055)class019213, class01226.NG)))).y().build(), class07700.N((class05919)class05919.field_935, (class00810)class00810.N().N(class06124.N().u(class00837.N().N((class02055)class019213, class01226.NG)))).y().build()});
        class07165.N().N(class037112).N(class03741.y).N((class07310)class06570.TU, (class00392)class00392.L((String)"advancements.nether.distract_piglin.title"), (class00392)class00392.L((String)"advancements.nether.distract_piglin.description"), null, class07296.field_1254, true, true, false).N("distract_piglin", class05202.N((class05196)class051962, Optional.of(class00837.N().N((class02055)class019213, class01226.Nn).y()), Optional.of(class00821.N((class00810)class00810.N().N((class02055)class019212, class07078.Nr).N(class00854.N().M(Boolean.valueOf(false))))))).N("distract_piglin_directly", class01243.N(Optional.of(class051962), (class00837)class00837.N().N((class02055)class019213, new class07310[]{class01514.L}), Optional.of(class00821.N((class00810)class00810.N().N((class02055)class019212, class07078.Nr).N(class00854.N().M(Boolean.valueOf(false))))))).N(consumer, "nether/distract_piglin");
    }
}

