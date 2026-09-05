/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10758
 *  com.google.common.collect.Sets
 *  com.google.common.collect.Sets$SetView
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  minecraft.class00159
 *  minecraft.class00325
 *  minecraft.class00392
 *  minecraft.class00753
 *  minecraft.class00761
 *  minecraft.class00764
 *  minecraft.class00780
 *  minecraft.class00789
 *  minecraft.class00795
 *  minecraft.class00799
 *  minecraft.class00810
 *  minecraft.class00811
 *  minecraft.class00816
 *  minecraft.class00818
 *  minecraft.class00821
 *  minecraft.class00825
 *  minecraft.class00836
 *  minecraft.class00837
 *  minecraft.class00843
 *  minecraft.class00844
 *  minecraft.class00851
 *  minecraft.class00857
 *  minecraft.class00859
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class01217
 *  minecraft.class01226
 *  minecraft.class01243
 *  minecraft.class01403
 *  minecraft.class01408
 *  minecraft.class01427
 *  minecraft.class01894
 *  minecraft.class01905
 *  minecraft.class01921
 *  minecraft.class01929
 *  minecraft.class01958
 *  minecraft.class02005
 *  minecraft.class02016
 *  minecraft.class02026
 *  minecraft.class02055
 *  minecraft.class02187
 *  minecraft.class02208
 *  minecraft.class02271
 *  minecraft.class02482
 *  minecraft.class02500
 *  minecraft.class03135
 *  minecraft.class03488
 *  minecraft.class03490
 *  minecraft.class03494
 *  minecraft.class03496
 *  minecraft.class03529
 *  minecraft.class03530
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class03562
 *  minecraft.class03622
 *  minecraft.class03659
 *  minecraft.class03696
 *  minecraft.class03711
 *  minecraft.class03741
 *  minecraft.class03753
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04433
 *  minecraft.class04545
 *  minecraft.class04547
 *  minecraft.class04558
 *  minecraft.class04877
 *  minecraft.class04943
 *  minecraft.class05891
 *  minecraft.class05920
 *  minecraft.class05946
 *  minecraft.class05947
 *  minecraft.class05952
 *  minecraft.class06110
 *  minecraft.class06124
 *  minecraft.class06273
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06775
 *  minecraft.class06915
 *  minecraft.class07078
 *  minecraft.class07296
 *  minecraft.class07310
 *  minecraft.class07428
 *  minecraft.class07575
 *  minecraft.class07668
 *  minecraft.class07670
 *  minecraft.class07672
 *  minecraft.class07677
 *  minecraft.class07682
 *  minecraft.class07691
 *  minecraft.class08092
 *  minecraft.class08630
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class10758;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00159;
import minecraft.class00325;
import minecraft.class00392;
import minecraft.class00753;
import minecraft.class00761;
import minecraft.class00764;
import minecraft.class00780;
import minecraft.class00789;
import minecraft.class00795;
import minecraft.class00799;
import minecraft.class00810;
import minecraft.class00811;
import minecraft.class00816;
import minecraft.class00818;
import minecraft.class00821;
import minecraft.class00825;
import minecraft.class00836;
import minecraft.class00837;
import minecraft.class00843;
import minecraft.class00844;
import minecraft.class00851;
import minecraft.class00857;
import minecraft.class00859;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01217;
import minecraft.class01226;
import minecraft.class01243;
import minecraft.class01403;
import minecraft.class01408;
import minecraft.class01427;
import minecraft.class01894;
import minecraft.class01905;
import minecraft.class01921;
import minecraft.class01929;
import minecraft.class01958;
import minecraft.class02005;
import minecraft.class02016;
import minecraft.class02026;
import minecraft.class02055;
import minecraft.class02187;
import minecraft.class02208;
import minecraft.class02271;
import minecraft.class02482;
import minecraft.class02500;
import minecraft.class03135;
import minecraft.class03488;
import minecraft.class03490;
import minecraft.class03494;
import minecraft.class03496;
import minecraft.class03529;
import minecraft.class03530;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class03562;
import minecraft.class03622;
import minecraft.class03659;
import minecraft.class03696;
import minecraft.class03711;
import minecraft.class03741;
import minecraft.class03753;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04433;
import minecraft.class04545;
import minecraft.class04547;
import minecraft.class04558;
import minecraft.class04877;
import minecraft.class04943;
import minecraft.class05891;
import minecraft.class05920;
import minecraft.class05946;
import minecraft.class05947;
import minecraft.class05952;
import minecraft.class06110;
import minecraft.class06124;
import minecraft.class06273;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06775;
import minecraft.class06915;
import minecraft.class07078;
import minecraft.class07116;
import minecraft.class07165;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07296;
import minecraft.class07310;
import minecraft.class07428;
import minecraft.class07575;
import minecraft.class07668;
import minecraft.class07670;
import minecraft.class07672;
import minecraft.class07677;
import minecraft.class07682;
import minecraft.class07691;
import minecraft.class08092;
import minecraft.class08630;
import org.slf4j.Logger;

public class class07118
implements class02026 {
    private static final Logger N = LogUtils.getLogger();
    private static final int y = 384;
    private static final int L = 320;
    private static final int u = -64;
    private static final int i = 5;
    private static final Map<class07428, Set<class07078<?>>> R = Map.of(class07428.field_6302, Set.of(class07078.Nz, class07078.Nj, class07078.yX));
    private static final List<class07078<?>> M = Arrays.asList(class07078.T, class07078.j, class07078.v, class07078.G, class07078.d, class07078.o, class07078.q, class07078.X, class07078.p, class07078.f, class07078.F, class07078.A, class07078.x, class07078.NB, class07078.Nm, class07078.NP, class07078.Nb, class07078.Ng, class07078.NS, class07078.ND, class07078.Nr, class07078.yN, class07078.yy, class07078.yB, class07078.yU, class07078.yW, class07078.ym, class07078.ys, class07078.yG, class07078.yk, class07078.yV, class07078.yH, class07078.yp, class07078.yA, class07078.yF, class07078.yS, class07078.yr, class07078.yx, class07078.yD, class07078.LN, class07078.yh);

    private static class06915<class05920> y(class02055<class00891> class020552, class00891 class008912) {
        class05952[] class05952Array = (class05952[])class06775.R.N().stream().map(class072112 -> {
            class01408 class014082 = class01408.N().N((class08092)class06775.R, (Comparable)((Object)class072112));
            class07670 class076702 = new class07670(class00869.Ba).N(class014082);
            class05952 class059522 = class00859.N((class00818)class00818.N().N(class01427.N().N(class020552, new class00891[]{class008912})), (class07209)new class07209(class072112.E()));
            return class03496.N((class05952[])new class05952[]{class076702, class059522});
        }).toArray(class05952[]::new);
        return class05920.N((class05952[])new class05952[]{class03494.N((class05952[])class05952Array)});
    }

    private static class07165 y(class07165 class071652) {
        class071652.N(class03741.y);
        class02016.y().map(class02005::L).forEach(class059462 -> class071652.N("armor_trimmed_" + String.valueOf(class059462.N()), class03488.N((class05946)class059462)));
        return class071652;
    }

    private static List<class07078<?>> N(List<class07078<?>> list, class01905<class07078<?>> class019052) {
        Sets.SetView setView;
        ArrayList<CallSite> arrayList = new ArrayList<CallSite>();
        Set<class07078<?>> set2 = Set.copyOf(list);
        Set set3 = set2.stream().map(class07078::i).collect(Collectors.toSet());
        Sets.SetView setView2 = Sets.symmetricDifference(R.keySet(), set3);
        if (!setView2.isEmpty()) {
            arrayList.add((CallSite)((Object)("Found EntityType with MobCategory only in either expected exceptions or kill_all_mobs advancement: " + setView2.stream().map(Object::toString).sorted().collect(Collectors.joining(", ")))));
        }
        if (!(setView = Sets.intersection(R.values().stream().flatMap(Collection::stream).collect(Collectors.toSet()), set2)).isEmpty()) {
            arrayList.add((CallSite)((Object)("Found EntityType in both expected exceptions and kill_all_mobs advancement: " + setView.stream().map(Object::toString).sorted().collect(Collectors.joining(", ")))));
        }
        Map map = class019052.z().map(class03529::N).filter(Predicate.not(set2::contains)).collect(Collectors.groupingBy(class07078::i, Collectors.toSet()));
        R.forEach((class074282, set) -> {
            Sets.SetView setView = Sets.difference(map.getOrDefault(class074282, Set.of()), (Set)set);
            if (!setView.isEmpty()) {
                arrayList.add((CallSite)((Object)String.format(Locale.ROOT, "Found (new?) EntityType with MobCategory %s which are in neither expected exceptions nor kill_all_mobs advancement: %s", class074282, setView.stream().map(Object::toString).sorted().collect(Collectors.joining(", ")))));
            }
        });
        if (!arrayList.isEmpty()) {
            arrayList.forEach(arg_0 -> ((Logger)N).error(arg_0));
            throw new IllegalStateException("Found inconsistencies with kill_all_mobs advancement");
        }
        return list;
    }

    private static class06915<class04545> N(class00836 class008362, Optional<class00821> optional) {
        return class04545.N(Optional.of(class00810.N().N(class00761.L((class00816)class00816.L((double)30.0))).N((class03622)class04558.N((class00836)class008362)).y()), optional);
    }

    private static class07165 N(class02055<class06581> class020552, class07165 class071652) {
        List<Pair> list = List.of(Pair.of((Object)"desert_pyramid", (Object)class05947.N((class05946)class06273.yU)), Pair.of((Object)"desert_well", (Object)class05947.N((class05946)class06273.yz)), Pair.of((Object)"ocean_ruin_cold", (Object)class05947.N((class05946)class06273.yP)), Pair.of((Object)"ocean_ruin_warm", (Object)class05947.N((class05946)class06273.ym)), Pair.of((Object)"trail_ruins_rare", (Object)class05947.N((class05946)class06273.yW)), Pair.of((Object)"trail_ruins_common", (Object)class05947.N((class05946)class06273.yE)));
        list.forEach(pair -> class071652.N((String)pair.getFirst(), (class06915)pair.getSecond()));
        String string = "has_sherd";
        class071652.N("has_sherd", class00843.N((class00837[])new class00837[]{class00837.N().N(class020552, class01226.yh)}));
        class071652.N(new class03753(List.of(list.stream().map(Pair::getFirst).toList(), List.of("has_sherd"))));
        return class071652;
    }

    private static class07165 N(class07165 class071652) {
        class071652.N(class03741.N);
        Set<class06581> set = Set.of(class06570.kW, class06570.kU, class06570.kE, class06570.kM, class06570.ks, class06570.kZ, class06570.kz, class06570.km);
        class02016.y().filter(class020052 -> set.contains(class020052.N())).forEach(class020052 -> class071652.N("armor_trimmed_" + String.valueOf(class020052.L().N()), class03488.N((class05946)class020052.L())));
        return class071652;
    }

    private static class06915<class05920> N(class02055<class00891> class020552, class03530<class00891> class035302) {
        class05952[] class05952Array = (class05952[])Stream.of(class07211.values()).map(class072112 -> {
            class01408 class014082 = class01408.N().N((class08092)class00325.y, (Comparable)((Object)class072112.z()));
            class01427 class014272 = class01427.N().N(class020552, class035302).N(class014082);
            class00753 class007532 = class072112.E();
            class05952 class059522 = class00859.N((class00818)class00818.N().N(class014272));
            class05952 class059523 = class00859.N((class00818)class00818.N().N(class01427.N().N(class020552, new class00891[]{class00869.Lp}).N(class014082)), (class07209)new class07209(class007532));
            class05952 class059524 = class00859.N((class00818)class00818.N().N(class014272), (class07209)new class07209(class007532.method_35862(2)));
            return class03496.N((class05952[])new class05952[]{class059522, class059523, class059524});
        }).toArray(class05952[]::new);
        return class05920.N((class05952[])new class05952[]{class03494.N((class05952[])class05952Array)});
    }

    private static class06915<class05920> N(class02055<class00891> class020552, class00891 class008912) {
        class05952[] class05952Array = (class05952[])class06775.R.N().stream().map(class072112 -> {
            class01408 class014082 = class01408.N().N((class08092)class06775.R, (Comparable)((Object)class072112));
            class01427 class014272 = class01427.N().N(class020552, new class00891[]{class00869.Ba}).N(class014082);
            return class00859.N((class00818)class00818.N().N(class014272), (class07209)new class07209(class072112.b().E()));
        }).toArray(class05952[]::new);
        return class05920.N((class05952[])new class05952[]{class00851.N((class00891)class008912), class03494.N((class05952[])class05952Array)});
    }

    public static class03711 N(class03711 class037112, Consumer<class03711> consumer, class02055<class07078<?>> class020552, List<class07078<?>> list) {
        class03711 class037113 = class07118.N(class07165.N(), class020552, list).N(class037112).N((class07310)class06570.To, (class00392)class00392.L((String)"advancements.adventure.kill_a_mob.title"), (class00392)class00392.L((String)"advancements.adventure.kill_a_mob.description"), null, class07296.field_1254, true, true, false).N(class03741.y).N(consumer, "adventure/kill_a_mob");
        class07118.N(class07165.N(), class020552, list).N(class037113).N((class07310)class06570.TH, (class00392)class00392.L((String)"advancements.adventure.kill_all_mobs.title"), (class00392)class00392.L((String)"advancements.adventure.kill_all_mobs.description"), null, class07296.field_1250, true, true, false).N(class10758.N((int)100)).N(consumer, "adventure/kill_all_mobs");
        return class037113;
    }

    public void N(class01929 class019292, Consumer<class03711> consumer) {
        class01921 class019212 = class019292.y(class04227.I);
        class01921 class019213 = class019292.y(class04227.F);
        class01921 class019214 = class019292.y(class04227.Z);
        class03711 class037112 = class07165.N().N((class07310)class06570.Gt, (class00392)class00392.L((String)"advancements.adventure.root.title"), (class00392)class00392.L((String)"advancements.adventure.root.description"), class01894.y((String)"gui/advancements/backgrounds/adventure"), class07296.field_1254, false, false, false).N(class03741.y).N("killed_something", class00825.y()).N("killed_by_something", class00825.u()).N(consumer, "adventure/root");
        class03711 class037113 = class07165.N().N(class037112).N((class07310)class00869.yn, (class00392)class00392.L((String)"advancements.adventure.sleep_in_bed.title"), (class00392)class00392.L((String)"advancements.adventure.sleep_in_bed.description"), null, class07296.field_1254, true, true, false).N("slept_in_bed", class07682.y()).N(consumer, "adventure/sleep_in_bed");
        class07118.N(class019292, consumer, class037113, class03562.L);
        class03711 class037114 = class07165.N().N(class037112).N((class07310)class06570.Ty, (class00392)class00392.L((String)"advancements.adventure.trade.title"), (class00392)class00392.L((String)"advancements.adventure.trade.description"), null, class07296.field_1254, true, true, false).N("traded", class07677.y()).N(consumer, "adventure/trade");
        class07165.N().N(class037114).N((class07310)class06570.Ty, (class00392)class00392.L((String)"advancements.adventure.trade_at_world_height.title"), (class00392)class00392.L((String)"advancements.adventure.trade_at_world_height.description"), null, class07296.field_1254, true, true, false).N("trade_at_world_height", class07677.N((class00810)class00810.N().N(class00818.N((class00816)class00816.y((double)319.0))))).N(consumer, "adventure/trade_at_world_height");
        class03711 class037115 = class07118.N(class037112, consumer, class019212, class07118.N(M, class019212));
        class03711 class037116 = class07165.N().N(class037115).N((class07310)class06570.sx, (class00392)class00392.L((String)"advancements.adventure.shoot_arrow.title"), (class00392)class00392.L((String)"advancements.adventure.shoot_arrow.description"), null, class07296.field_1254, true, true, false).N("shot_arrow", class00857.N((class00764)class00764.N().N(class00789.N().N(class03659.N((class03530)class03696.z)).N(class00810.N().N((class02055)class019212, class01217.M))))).N(consumer, "adventure/shoot_arrow");
        class03711 class037117 = class07165.N().N(class037115).N((class07310)class06570.db, (class00392)class00392.L((String)"advancements.adventure.throw_trident.title"), (class00392)class00392.L((String)"advancements.adventure.throw_trident.description"), null, class07296.field_1254, true, true, false).N("shot_trident", class00857.N((class00764)class00764.N().N(class00789.N().N(class03659.N((class03530)class03696.z)).N(class00810.N().N((class02055)class019212, class07078.yo))))).N(consumer, "adventure/throw_trident");
        class07165.N().N(class037117).N((class07310)class06570.db, (class00392)class00392.L((String)"advancements.adventure.very_very_frightening.title"), (class00392)class00392.L((String)"advancements.adventure.very_very_frightening.description"), null, class07296.field_1254, true, true, false).N("struck_villager", class00799.N((class00810[])new class00810[]{class00810.N().N((class02055)class019212, class07078.ye)})).N(consumer, "adventure/very_very_frightening");
        class07165.N().N(class037114).N((class07310)class00869.iK, (class00392)class00392.L((String)"advancements.adventure.summon_iron_golem.title"), (class00392)class00392.L((String)"advancements.adventure.summon_iron_golem.description"), null, class07296.field_1249, true, true, false).N("summoned_golem", class07691.N((class00810)class00810.N().N((class02055)class019212, class07078.Nn))).N(consumer, "adventure/summon_iron_golem");
        class07165.N().N(class037116).N((class07310)class06570.sD, (class00392)class00392.L((String)"advancements.adventure.sniper_duel.title"), (class00392)class00392.L((String)"advancements.adventure.sniper_duel.description"), null, class07296.field_1250, true, true, false).N(class10758.N((int)50)).N("killed_skeleton", class00825.N((class00810)class00810.N().N((class02055)class019212, class07078.ym).N(class00761.N((class00816)class00816.y((double)50.0))), (class00789)class00789.N().N(class03659.N((class03530)class03696.z)))).N(consumer, "adventure/sniper_duel");
        class07165.N().N(class037115).N((class07310)class06570.la, (class00392)class00392.L((String)"advancements.adventure.totem_of_undying.title"), (class00392)class00392.L((String)"advancements.adventure.totem_of_undying.description"), null, class07296.field_1249, true, true, false).N("used_totem", class07672.N((class02055)class019213, (class07310)class06570.la)).N(consumer, "adventure/totem_of_undying");
        class07165.N().N(class037115).N((class07310)class06570.le, (class00392)class00392.L((String)"advancements.adventure.spear_many_mobs.title"), (class00392)class00392.L((String)"advancements.adventure.spear_many_mobs.description"), null, class07296.field_1249, true, true, false).N("spear_many_mobs", class07575.N((int)5)).N(consumer, "adventure/spear_many_mobs");
        class03711 class037118 = class07165.N().N(class037112).N((class07310)class06570.dw, (class00392)class00392.L((String)"advancements.adventure.ol_betsy.title"), (class00392)class00392.L((String)"advancements.adventure.ol_betsy.description"), null, class07296.field_1254, true, true, false).N("shot_crossbow", class07668.N((class02055)class019213, (class07310)class06570.dw)).N(consumer, "adventure/ol_betsy");
        class07165.N().N(class037118).N((class07310)class06570.dw, (class00392)class00392.L((String)"advancements.adventure.whos_the_pillager_now.title"), (class00392)class00392.L((String)"advancements.adventure.whos_the_pillager_now.description"), null, class07296.field_1254, true, true, false).N("kill_pillager", class00844.N((class02055)class019213, (class00810[])new class00810[]{class00810.N().N((class02055)class019212, class07078.yy)})).N(consumer, "adventure/whos_the_pillager_now");
        class07165.N().N(class037118).N((class07310)class06570.dw, (class00392)class00392.L((String)"advancements.adventure.two_birds_one_arrow.title"), (class00392)class00392.L((String)"advancements.adventure.two_birds_one_arrow.description"), null, class07296.field_1250, true, true, false).N(class10758.N((int)65)).N("two_birds", class00844.N((class02055)class019213, (class00810[])new class00810[]{class00810.N().N((class02055)class019212, class07078.ND), class00810.N().N((class02055)class019212, class07078.ND)})).N(consumer, "adventure/two_birds_one_arrow");
        class07165.N().N(class037118).N((class07310)class06570.dw, (class00392)class00392.L((String)"advancements.adventure.arbalistic.title"), (class00392)class00392.L((String)"advancements.adventure.arbalistic.description"), null, class07296.field_1250, true, true, true).N(class10758.N((int)85)).N("arbalistic", class00844.N((class02055)class019213, (class00836)class00836.N((int)5))).N(consumer, "adventure/arbalistic");
        class01921 class019215 = class019292.y(class04227.NF);
        class03711 class037119 = class07165.N().N(class037112).N(class04877.N((class02055)class019215), (class00392)class00392.L((String)"advancements.adventure.voluntary_exile.title"), (class00392)class00392.L((String)"advancements.adventure.voluntary_exile.description"), null, class07296.field_1254, true, true, true).N("voluntary_exile", class00825.N((class00810)class00810.N().N((class02055)class019212, class01217.L).N(class06110.N((class02055)class019213, (class02055)class019215)))).N(consumer, "adventure/voluntary_exile");
        class07165.N().N(class037119).N(class04877.N((class02055)class019215), (class00392)class00392.L((String)"advancements.adventure.hero_of_the_village.title"), (class00392)class00392.L((String)"advancements.adventure.hero_of_the_village.description"), null, class07296.field_1250, true, true, true).N(class10758.N((int)100)).N("hero_of_the_village", class07682.L()).N(consumer, "adventure/hero_of_the_village");
        class07165.N().N(class037112).N((class07310)class00869.TM.B(), (class00392)class00392.L((String)"advancements.adventure.honey_block_slide.title"), (class00392)class00392.L((String)"advancements.adventure.honey_block_slide.description"), null, class07296.field_1254, true, true, false).N("honey_block_slide", class05891.N((class00891)class00869.TM)).N(consumer, "adventure/honey_block_slide");
        class07165.N().N(class037116).N((class07310)class00869.Tu.B(), (class00392)class00392.L((String)"advancements.adventure.bullseye.title"), (class00392)class00392.L((String)"advancements.adventure.bullseye.description"), null, class07296.field_1250, true, true, false).N(class10758.N((int)50)).N("bullseye", class04943.N((class00836)class00836.N((int)15), Optional.of(class00821.N((class00810)class00810.N().N(class00761.N((class00816)class00816.y((double)30.0))))))).N(consumer, "adventure/bullseye");
        class07165.N().N(class037113).N((class07310)class06570.bB, (class00392)class00392.L((String)"advancements.adventure.walk_on_powder_snow_with_leather_boots.title"), (class00392)class00392.L((String)"advancements.adventure.walk_on_powder_snow_with_leather_boots.description"), null, class07296.field_1254, true, true, false).N("walk_on_powder_snow_with_leather_boots", class07682.N((class02055)class019214, (class02055)class019213, (class00891)class00869.ba, (class06581)class06570.bB)).N(consumer, "adventure/walk_on_powder_snow_with_leather_boots");
        class07165.N().N(class037112).N((class07310)class06570.WF, (class00392)class00392.L((String)"advancements.adventure.lightning_rod_with_villager_no_fire.title"), (class00392)class00392.L((String)"advancements.adventure.lightning_rod_with_villager_no_fire.description"), null, class07296.field_1254, true, true, false).N("lightning_rod_with_villager_no_fire", class07118.N(class00836.N((int)0), Optional.of(class00810.N().N((class02055)class019212, class07078.ye).y()))).N(consumer, "adventure/lightning_rod_with_villager_no_fire");
        class03711 class0371110 = class07165.N().N(class037112).N((class07310)class06570.vy, (class00392)class00392.L((String)"advancements.adventure.spyglass_at_parrot.title"), (class00392)class00392.L((String)"advancements.adventure.spyglass_at_parrot.description"), null, class07296.field_1254, true, true, false).N("spyglass_at_parrot", class07118.N(class00810.N().N((class02055)class019212, class07078.Nx), class00837.N().N((class02055)class019213, new class07310[]{class06570.vy}))).N(consumer, "adventure/spyglass_at_parrot");
        class03711 class0371111 = class07165.N().N(class0371110).N((class07310)class06570.vy, (class00392)class00392.L((String)"advancements.adventure.spyglass_at_ghast.title"), (class00392)class00392.L((String)"advancements.adventure.spyglass_at_ghast.description"), null, class07296.field_1254, true, true, false).N("spyglass_at_ghast", class07118.N(class00810.N().N((class02055)class019212, class07078.NB), class00837.N().N((class02055)class019213, new class07310[]{class06570.vy}))).N(consumer, "adventure/spyglass_at_ghast");
        class07165.N().N(class037113).N((class07310)class06570.RI, (class00392)class00392.L((String)"advancements.adventure.play_jukebox_in_meadows.title"), (class00392)class00392.L((String)"advancements.adventure.play_jukebox_in_meadows.description"), null, class07296.field_1254, true, true, false).N("play_jukebox_in_meadows", class05920.N((class00818)class00818.N().N((class03543)class03543.N((class03556[])new class03556[]{class019292.y(class04227.NA).y(class00795.g)})).N(class01427.N().N((class02055)class019214, new class00891[]{class00869.iG})), (class00837)class00837.N().N(class00159.N().N(class02482.m, (class02500)class02208.N()).y()))).N(consumer, "adventure/play_jukebox_in_meadows");
        class07165.N().N(class0371111).N((class07310)class06570.vy, (class00392)class00392.L((String)"advancements.adventure.spyglass_at_dragon.title"), (class00392)class00392.L((String)"advancements.adventure.spyglass_at_dragon.description"), null, class07296.field_1254, true, true, false).N("spyglass_at_dragon", class07118.N(class00810.N().N((class02055)class019212, class07078.f), class00837.N().N((class02055)class019213, new class07310[]{class06570.vy}))).N(consumer, "adventure/spyglass_at_dragon");
        class07165.N().N(class037112).N((class07310)class06570.jE, (class00392)class00392.L((String)"advancements.adventure.fall_from_world_height.title"), (class00392)class00392.L((String)"advancements.adventure.fall_from_world_height.description"), null, class07296.field_1254, true, true, false).N("fall_from_world_height", class00811.N((class00810)class00810.N().N(class00818.N((class00816)class00816.L((double)-59.0))), (class00761)class00761.y((class00816)class00816.y((double)379.0)), (class00818)class00818.N((class00816)class00816.y((double)319.0)))).N(consumer, "adventure/fall_from_world_height");
        class07165.N().N(class037115).N((class07310)class00869.bC, (class00392)class00392.L((String)"advancements.adventure.kill_mob_near_sculk_catalyst.title"), (class00392)class00392.L((String)"advancements.adventure.kill_mob_near_sculk_catalyst.description"), null, class07296.field_1250, true, true, false).N("kill_mob_near_sculk_catalyst", class00825.L()).N(consumer, "adventure/kill_mob_near_sculk_catalyst");
        class07165.N().N(class037112).N((class07310)class00869.bp, (class00392)class00392.L((String)"advancements.adventure.avoid_vibration.title"), (class00392)class00392.L((String)"advancements.adventure.avoid_vibration.description"), null, class07296.field_1254, true, true, false).N("avoid_vibration", class07682.u()).N(consumer, "adventure/avoid_vibration");
        class03711 class0371112 = class07118.N((class02055<class06581>)class019213, class07165.N()).N(class037112).N((class07310)class06570.kN, (class00392)class00392.L((String)"advancements.adventure.salvage_sherd.title"), (class00392)class00392.L((String)"advancements.adventure.salvage_sherd.description"), null, class07296.field_1254, true, true, false).N(consumer, "adventure/salvage_sherd");
        class07165.N().N(class0371112).N(class01958.N((class03490)new class03490(Optional.empty(), Optional.of(class06570.kI), Optional.empty(), Optional.of(class06570.kY))), (class00392)class00392.L((String)"advancements.adventure.craft_decorated_pot_using_only_sherds.title"), (class00392)class00392.L((String)"advancements.adventure.craft_decorated_pot_using_only_sherds.description"), null, class07296.field_1254, true, true, false).N("pot_crafted_using_only_sherds", class03488.N((class05946)class05946.N((class05946)class04227.yV, (class01894)class01894.y((String)"decorated_pot")), List.of(class00837.N().N((class02055)class019213, class01226.yh), class00837.N().N((class02055)class019213, class01226.yh), class00837.N().N((class02055)class019213, class01226.yh), class00837.N().N((class02055)class019213, class01226.yh)))).N(consumer, "adventure/craft_decorated_pot_using_only_sherds");
        class03711 class0371113 = class07118.y(class07165.N()).N(class037112).N(new class06584((class07310)class06570.ku), (class00392)class00392.L((String)"advancements.adventure.trim_with_any_armor_pattern.title"), (class00392)class00392.L((String)"advancements.adventure.trim_with_any_armor_pattern.description"), null, class07296.field_1254, true, true, false).N(consumer, "adventure/trim_with_any_armor_pattern");
        class07118.N(class07165.N()).N(class0371113).N(new class06584((class07310)class06570.ks), (class00392)class00392.L((String)"advancements.adventure.trim_with_all_exclusive_armor_patterns.title"), (class00392)class00392.L((String)"advancements.adventure.trim_with_all_exclusive_armor_patterns.description"), null, class07296.field_1250, true, true, false).N(class10758.N((int)150)).N(consumer, "adventure/trim_with_all_exclusive_armor_patterns");
        class07165.N().N(class037112).N((class07310)class06570.RM, (class00392)class00392.L((String)"advancements.adventure.read_power_from_chiseled_bookshelf.title"), (class00392)class00392.L((String)"advancements.adventure.read_power_from_chiseled_bookshelf.description"), null, class07296.field_1254, true, true, false).N(class03741.y).N("chiseled_bookshelf", class07118.N((class02055<class00891>)class019214, class00869.LG)).N("comparator", class07118.y((class02055<class00891>)class019214, class00869.LG)).N(consumer, "adventure/read_power_of_chiseled_bookshelf");
        class07165.N().N(class037112).N((class07310)class06570.sF, (class00392)class00392.L((String)"advancements.adventure.brush_armadillo.title"), (class00392)class00392.L((String)"advancements.adventure.brush_armadillo.description"), null, class07296.field_1254, true, true, false).N("brush_armadillo", class01243.y((class00837)class00837.N().N((class02055)class019213, new class07310[]{class06570.kN}), Optional.of(class00821.N((class00810)class00810.N().N((class02055)class019212, class07078.M))))).N(consumer, "adventure/brush_armadillo");
        class03711 class0371114 = class07165.N().N(class037112).N((class07310)class00869.bo, (class00392)class00392.L((String)"advancements.adventure.minecraft_trials_edition.title"), (class00392)class00392.L((String)"advancements.adventure.minecraft_trials_edition.description"), null, class07296.field_1254, true, true, false).N("minecraft_trials_edition", class07682.N((class00818)class00818.y((class03556)class019292.y(class04227.yj).y(class04433.o)))).N(consumer, "adventure/minecraft_trials_edition");
        class07165.N().N(class0371114).N((class07310)class06570.kr, (class00392)class00392.L((String)"advancements.adventure.lighten_up.title"), (class00392)class00392.L((String)"advancements.adventure.lighten_up.description"), null, class07296.field_1254, true, true, false).N("lighten_up", class05920.N((class00818)class00818.N().N(class01427.N().N((class02055)class019214, new class00891[]{class00869.vm, class00869.vW, class00869.vE, class00869.vb, class00869.vT, class00869.vs}).N(class01408.N().N((class08092)class03135.L, true))), (class00837)class00837.N().N((class02055)class019213, (class07310[])class07116.L))).N(consumer, "adventure/lighten_up");
        class03711 class0371115 = class07165.N().N(class0371114).N((class07310)class06570.Yd, (class00392)class00392.L((String)"advancements.adventure.under_lock_and_key.title"), (class00392)class00392.L((String)"advancements.adventure.under_lock_and_key.description"), null, class07296.field_1254, true, true, false).N("under_lock_and_key", class05920.N((class00818)class00818.N().N(class01427.N().N((class02055)class019214, new class00891[]{class00869.nF}).N(class01408.N().N((class08092)class02271.u, false))), (class00837)class00837.N().N((class02055)class019213, new class07310[]{class06570.Yd}))).N(consumer, "adventure/under_lock_and_key");
        class07165.N().N(class0371115).N((class07310)class06570.Yw, (class00392)class00392.L((String)"advancements.adventure.revaulting.title"), (class00392)class00392.L((String)"advancements.adventure.revaulting.description"), null, class07296.field_1249, true, true, false).N("revaulting", class05920.N((class00818)class00818.N().N(class01427.N().N((class02055)class019214, new class00891[]{class00869.nF}).N(class01408.N().N((class08092)class02271.u, true))), (class00837)class00837.N().N((class02055)class019213, new class07310[]{class06570.Yw}))).N(consumer, "adventure/revaulting");
        class07165.N().N(class0371114).N((class07310)class06570.Gz, (class00392)class00392.L((String)"advancements.adventure.blowback.title"), (class00392)class00392.L((String)"advancements.adventure.blowback.description"), null, class07296.field_1250, true, true, false).N(class10758.N((int)40)).N("blowback", class00825.N((class00810)class00810.N().N((class02055)class019212, class07078.v), (class00789)class00789.N().N(class03659.N((class03530)class03696.z)).N(class00810.N().N((class02055)class019212, class07078.n)))).N(consumer, "adventure/blowback");
        class07165.N().N(class037112).N((class07310)class06570.vD, (class00392)class00392.L((String)"advancements.adventure.crafters_crafting_crafters.title"), (class00392)class00392.L((String)"advancements.adventure.crafters_crafting_crafters.description"), null, class07296.field_1254, true, true, false).N("crafter_crafted_crafter", class03488.y((class05946)class05946.N((class05946)class04227.yV, (class01894)class01894.y((String)"crafter")))).N(consumer, "adventure/crafters_crafting_crafters");
        class07165.N().N(class037112).N((class07310)class06570.wU, (class00392)class00392.L((String)"advancements.adventure.use_lodestone.title"), (class00392)class00392.L((String)"advancements.adventure.use_lodestone.description"), null, class07296.field_1254, true, true, false).N("use_lodestone", class05920.N((class00818)class00818.N().N(class01427.N().N((class02055)class019214, new class00891[]{class00869.TT})), (class00837)class00837.N().N((class02055)class019213, new class07310[]{class06570.jJ}))).N(consumer, "adventure/use_lodestone");
        class07165.N().N(class0371114).N((class07310)class06570.Gz, (class00392)class00392.L((String)"advancements.adventure.who_needs_rockets.title"), (class00392)class00392.L((String)"advancements.adventure.who_needs_rockets.description"), null, class07296.field_1254, true, true, false).N("who_needs_rockets", class02187.N((class00761)class00761.y((class00816)class00816.y((double)7.0)), (class00810)class00810.N().N((class02055)class019212, class07078.ya))).N(consumer, "adventure/who_needs_rockets");
        class07165.N().N(class0371114).N((class07310)class06570.Gm, (class00392)class00392.L((String)"advancements.adventure.overoverkill.title"), (class00392)class00392.L((String)"advancements.adventure.overoverkill.description"), null, class07296.field_1250, true, true, false).N(class10758.N((int)50)).N("overoverkill", class00857.N((class00764)class00764.N().N(class00816.y((double)100.0)).N(class00789.N().N(class03659.N((class03530)class03696.o)).N(class00810.N().N((class02055)class019212, class07078.Ly).N(class06124.N().R(class00837.N().N((class02055)class019213, new class07310[]{class06570.Gm}))))))).N(consumer, "adventure/overoverkill");
        class07165.N().N(class037112).N((class07310)class00869.Lp, (class00392)class00392.L((String)"advancements.adventure.heart_transplanter.title"), (class00392)class00392.L((String)"advancements.adventure.heart_transplanter.description"), null, class07296.field_1254, true, true, false).N(class03741.y).N("place_creaking_heart_dormant", class05920.N((class00891)class00869.Lp, (class08092)class06665.yI, (Comparable)class08630.field_55832)).N("place_creaking_heart_awake", class05920.N((class00891)class00869.Lp, (class08092)class06665.yI, (Comparable)class08630.field_55833)).N("place_pale_oak_log", class07118.N((class02055<class00891>)class019214, (class03530<class00891>)class01210.v)).N(consumer, "adventure/heart_transplanter");
    }

    private static class06915<class04547> N(class00810 class008102, class00837 class008372) {
        return class04547.N((class00810)class00810.N().N((class03622)class01403.N().N(class008102).y()), (class00837)class008372);
    }

    protected static class07165 N(class07165 class071652, class01929 class019292, List<class05946<class00780>> list) {
        class01921 class019212 = class019292.y(class04227.NA);
        for (class05946<class00780> class059462 : list) {
            class071652.N(class059462.N().toString(), class07682.N((class00818)class00818.N((class03556)class019212.y(class059462))));
        }
        return class071652;
    }

    private static class07165 N(class07165 class071652, class02055<class07078<?>> class020552, List<class07078<?>> list) {
        list.forEach(class070782 -> class071652.N(class04206.M.y(class070782).toString(), class00825.N((class00810)class00810.N().N(class020552, class070782))));
        return class071652;
    }

    protected static void N(class01929 class019292, Consumer<class03711> consumer, class03711 class037112, class03562 class035622) {
        class07118.N(class07165.N(), class019292, class035622.N().toList()).N(class037112).N((class07310)class06570.bl, (class00392)class00392.L((String)"advancements.adventure.adventuring_time.title"), (class00392)class00392.L((String)"advancements.adventure.adventuring_time.description"), null, class07296.field_1250, true, true, false).N(class10758.N((int)500)).N(consumer, "adventure/adventuring_time");
    }
}

