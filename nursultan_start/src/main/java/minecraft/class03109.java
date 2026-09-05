/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class01019
 *  minecraft.class03146
 *  minecraft.class03556
 *  minecraft.class04116
 *  minecraft.class05246
 *  minecraft.class05248
 *  minecraft.class05281
 */
package minecraft;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;
import minecraft.class00751;
import minecraft.class01019;
import minecraft.class03120;
import minecraft.class03129;
import minecraft.class03141;
import minecraft.class03146;
import minecraft.class03556;
import minecraft.class04116;
import minecraft.class05246;
import minecraft.class05248;
import minecraft.class05281;

public class class03109 {
    public static void N(class04116<class05281> class041162, class03556<class05281> class035562, List<class03129> list) {
        list.stream().flatMap(class03129::N).map(class059462 -> class059462.N().N()).forEach(string -> class01019.N((class04116)class041162, (String)string, (class05281)new class05281(class035562, List.of(Pair.of((Object)class05248.y((String)string), (Object)1)), class05246.field_16687)));
    }

    public static MapCodec<? extends class03129> N(class00751<MapCodec<? extends class03129>> class007512) {
        class00751.N(class007512, (String)"random", class03120.N);
        class00751.N(class007512, (String)"random_group", (Object)class03146.N);
        return (MapCodec)class00751.N(class007512, (String)"direct", class03141.N);
    }
}

