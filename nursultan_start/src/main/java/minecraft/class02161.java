/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class01733
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import minecraft.class01733;
import minecraft.class06962;

public class class02161
extends class01733 {
    public class02161(Schema schema) {
        super(schema, true, "Trial Spawner config tag fixer", class06962.G, "minecraft:trial_spawner");
    }

    private static <T> Dynamic<T> y(Dynamic<T> dynamic) {
        List<String> list = List.of("spawn_range", "total_mobs", "simultaneous_mobs", "total_mobs_added_per_player", "simultaneous_mobs_added_per_player", "ticks_between_spawn", "spawn_potentials", "loot_tables_to_eject", "items_to_drop_when_ominous");
        HashMap<Dynamic, Dynamic> hashMap = new HashMap<Dynamic, Dynamic>(list.size());
        for (String string : list) {
            Optional optional = dynamic.get(string).get().result();
            if (!optional.isPresent()) continue;
            hashMap.put(dynamic.createString(string), (Dynamic)optional.get());
            dynamic = dynamic.remove(string);
        }
        return hashMap.isEmpty() ? dynamic : dynamic.set("normal_config", dynamic.createMap(hashMap));
    }

    protected <T> Dynamic<T> N(Dynamic<T> dynamic) {
        return class02161.y(dynamic);
    }
}

