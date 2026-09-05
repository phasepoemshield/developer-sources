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
 *  minecraft.class05246
 *  minecraft.class05248
 *  minecraft.class05281
 *  minecraft.class05946
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import minecraft.class01019;
import minecraft.class01027;
import minecraft.class03529;
import minecraft.class03556;
import minecraft.class03651;
import minecraft.class04116;
import minecraft.class04227;
import minecraft.class05246;
import minecraft.class05248;
import minecraft.class05281;
import minecraft.class05946;

public class class03642 {
    public static final class05946<class05281> N = class01019.N((String)"ancient_city/city_center");

    public static void N(class04116<class05281> class041162) {
        class03529 class035292 = class041162.N(class04227.yT).y(class01027.o);
        class03529 class035293 = class041162.N(class04227.yv).y(class01019.N);
        class041162.N(N, (Object)new class05281((class03556)class035293, (List)ImmutableList.of((Object)Pair.of((Object)class05248.y((String)"ancient_city/city_center/city_center_1", (class03556)class035292), (Object)1), (Object)Pair.of((Object)class05248.y((String)"ancient_city/city_center/city_center_2", (class03556)class035292), (Object)1), (Object)Pair.of((Object)class05248.y((String)"ancient_city/city_center/city_center_3", (class03556)class035292), (Object)1)), class05246.field_16687));
        class03651.N(class041162);
    }
}

