/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class01019
 *  minecraft.class03529
 *  minecraft.class03556
 *  minecraft.class04116
 *  minecraft.class04227
 *  minecraft.class05246
 *  minecraft.class05248
 *  minecraft.class05281
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import minecraft.class01019;
import minecraft.class03529;
import minecraft.class03556;
import minecraft.class04116;
import minecraft.class04227;
import minecraft.class05246;
import minecraft.class05248;
import minecraft.class05281;

public class class05060 {
    public static void N(class04116<class05281> class041162) {
        class03529 class035292 = class041162.N(class04227.yv).y(class01019.N);
        class01019.N(class041162, (String)"bastion/mobs/piglin", (class05281)new class05281((class03556)class035292, (List)ImmutableList.of((Object)Pair.of((Object)class05248.y((String)"bastion/mobs/melee_piglin"), (Object)1), (Object)Pair.of((Object)class05248.y((String)"bastion/mobs/sword_piglin"), (Object)4), (Object)Pair.of((Object)class05248.y((String)"bastion/mobs/crossbow_piglin"), (Object)4), (Object)Pair.of((Object)class05248.y((String)"bastion/mobs/empty"), (Object)1)), class05246.field_16687));
        class01019.N(class041162, (String)"bastion/mobs/hoglin", (class05281)new class05281((class03556)class035292, (List)ImmutableList.of((Object)Pair.of((Object)class05248.y((String)"bastion/mobs/hoglin"), (Object)2), (Object)Pair.of((Object)class05248.y((String)"bastion/mobs/empty"), (Object)1)), class05246.field_16687));
        class01019.N(class041162, (String)"bastion/blocks/gold", (class05281)new class05281((class03556)class035292, (List)ImmutableList.of((Object)Pair.of((Object)class05248.y((String)"bastion/blocks/air"), (Object)3), (Object)Pair.of((Object)class05248.y((String)"bastion/blocks/gold"), (Object)1)), class05246.field_16687));
        class01019.N(class041162, (String)"bastion/mobs/piglin_melee", (class05281)new class05281((class03556)class035292, (List)ImmutableList.of((Object)Pair.of((Object)class05248.y((String)"bastion/mobs/melee_piglin_always"), (Object)1), (Object)Pair.of((Object)class05248.y((String)"bastion/mobs/melee_piglin"), (Object)5), (Object)Pair.of((Object)class05248.y((String)"bastion/mobs/sword_piglin"), (Object)1)), class05246.field_16687));
    }
}

