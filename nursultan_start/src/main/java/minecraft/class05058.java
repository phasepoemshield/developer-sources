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
 *  minecraft.class05076
 *  minecraft.class05089
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
import minecraft.class04116;
import minecraft.class04227;
import minecraft.class05040;
import minecraft.class05060;
import minecraft.class05063;
import minecraft.class05076;
import minecraft.class05089;
import minecraft.class05246;
import minecraft.class05248;
import minecraft.class05281;
import minecraft.class05946;

public class class05058 {
    public static final class05946<class05281> N = class01019.N((String)"bastion/starts");

    public static void N(class04116<class05281> class041162) {
        class03529 class035292 = class041162.N(class04227.yT).y(class01027.l);
        class03529 class035293 = class041162.N(class04227.yv).y(class01019.N);
        class041162.N(N, (Object)new class05281((class03556)class035293, (List)ImmutableList.of((Object)Pair.of((Object)class05248.y((String)"bastion/units/air_base", (class03556)class035292), (Object)1), (Object)Pair.of((Object)class05248.y((String)"bastion/hoglin_stable/air_base", (class03556)class035292), (Object)1), (Object)Pair.of((Object)class05248.y((String)"bastion/treasure/big_air_full", (class03556)class035292), (Object)1), (Object)Pair.of((Object)class05248.y((String)"bastion/bridge/starting_pieces/entrance_base", (class03556)class035292), (Object)1)), class05246.field_16687));
        class05089.N(class041162);
        class05063.N(class041162);
        class05076.N(class041162);
        class05040.N(class041162);
        class05060.N(class041162);
    }
}

