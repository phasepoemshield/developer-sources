/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class01019
 *  minecraft.class01027
 *  minecraft.class03529
 *  minecraft.class03556
 *  minecraft.class04116
 *  minecraft.class04227
 *  minecraft.class05483
 *  minecraft.class05946
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;
import minecraft.class01019;
import minecraft.class01027;
import minecraft.class03529;
import minecraft.class03556;
import minecraft.class04116;
import minecraft.class04227;
import minecraft.class05246;
import minecraft.class05248;
import minecraft.class05281;
import minecraft.class05483;
import minecraft.class05946;

public class class05260 {
    public static final class05946<class05281> N = class01019.N((String)"pillager_outpost/base_plates");

    public static void N(class04116<class05281> class041162) {
        class03529 class035292 = class041162.N(class04227.yT).y(class01027.b);
        class03529 class035293 = class041162.N(class04227.yv).y(class01019.N);
        class041162.N(N, (Object)new class05281((class03556<class05281>)class035293, (List<Pair<Function<class05246, ? extends class05248>, Integer>>)ImmutableList.of((Object)Pair.of(class05248.N("pillager_outpost/base_plate"), (Object)1)), class05246.field_16687));
        class01019.N(class041162, (String)"pillager_outpost/towers", (class05281)new class05281((class03556<class05281>)class035293, (List<Pair<Function<class05246, ? extends class05248>, Integer>>)ImmutableList.of((Object)Pair.of(class05248.y((List<Function<class05246, ? extends class05248>>)ImmutableList.of(class05248.N("pillager_outpost/watchtower"), class05248.N("pillager_outpost/watchtower_overgrown", (class03556<class05483>)class035292))), (Object)1)), class05246.field_16687));
        class01019.N(class041162, (String)"pillager_outpost/feature_plates", (class05281)new class05281((class03556<class05281>)class035293, (List<Pair<Function<class05246, ? extends class05248>, Integer>>)ImmutableList.of((Object)Pair.of(class05248.N("pillager_outpost/feature_plate"), (Object)1)), class05246.field_16686));
        class01019.N(class041162, (String)"pillager_outpost/features", (class05281)new class05281((class03556<class05281>)class035293, (List<Pair<Function<class05246, ? extends class05248>, Integer>>)ImmutableList.of((Object)Pair.of(class05248.N("pillager_outpost/feature_cage1"), (Object)1), (Object)Pair.of(class05248.N("pillager_outpost/feature_cage2"), (Object)1), (Object)Pair.of(class05248.N("pillager_outpost/feature_cage_with_allays"), (Object)1), (Object)Pair.of(class05248.N("pillager_outpost/feature_logs"), (Object)1), (Object)Pair.of(class05248.N("pillager_outpost/feature_tent1"), (Object)1), (Object)Pair.of(class05248.N("pillager_outpost/feature_tent2"), (Object)1), (Object)Pair.of(class05248.N("pillager_outpost/feature_targets"), (Object)1), (Object)Pair.of(class05248.Z(), (Object)6)), class05246.field_16687));
    }
}

