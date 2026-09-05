/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class01894
 *  minecraft.class07001
 *  minecraft.class07709
 *  minecraft.class07713
 *  minecraft.class07755
 */
package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.HashMap;
import java.util.Map;
import minecraft.class01894;
import minecraft.class07001;
import minecraft.class07709;
import minecraft.class07713;
import minecraft.class07755;

final class class08203 {
    public static final Map<Pair<Dynamic<class07709>, Dynamic<class07709>>, class01894> N = new HashMap<Pair<Dynamic<class07709>, Dynamic<class07709>>, class01894>();

    private class08203() {
    }

    static {
        class08203.N(class01894.y((String)"trial_chamber/breeze"), "{simultaneous_mobs: 1.0f, simultaneous_mobs_added_per_player: 0.5f, spawn_potentials: [{data: {entity: {id: \"minecraft:breeze\"}}, weight: 1}], ticks_between_spawn: 20, total_mobs: 2.0f, total_mobs_added_per_player: 1.0f}", "{loot_tables_to_eject: [{data: \"minecraft:spawners/ominous/trial_chamber/key\", weight: 3}, {data: \"minecraft:spawners/ominous/trial_chamber/consumables\", weight: 7}], simultaneous_mobs: 2.0f, total_mobs: 4.0f}");
        class08203.N(class01894.y((String)"trial_chamber/melee/husk"), "{simultaneous_mobs: 3.0f, simultaneous_mobs_added_per_player: 0.5f, spawn_potentials: [{data: {entity: {id: \"minecraft:husk\"}}, weight: 1}], ticks_between_spawn: 20}", "{loot_tables_to_eject: [{data: \"minecraft:spawners/ominous/trial_chamber/key\", weight: 3}, {data: \"minecraft:spawners/ominous/trial_chamber/consumables\", weight: 7}], spawn_potentials: [{data: {entity: {id: \"minecraft:husk\"}, equipment: {loot_table: \"minecraft:equipment/trial_chamber_melee\", slot_drop_chances: 0.0f}}, weight: 1}]}");
        class08203.N(class01894.y((String)"trial_chamber/melee/spider"), "{simultaneous_mobs: 3.0f, simultaneous_mobs_added_per_player: 0.5f, spawn_potentials: [{data: {entity: {id: \"minecraft:spider\"}}, weight: 1}], ticks_between_spawn: 20}", "{loot_tables_to_eject: [{data: \"minecraft:spawners/ominous/trial_chamber/key\", weight: 3}, {data: \"minecraft:spawners/ominous/trial_chamber/consumables\", weight: 7}],simultaneous_mobs: 4.0f, total_mobs: 12.0f}");
        class08203.N(class01894.y((String)"trial_chamber/melee/zombie"), "{simultaneous_mobs: 3.0f, simultaneous_mobs_added_per_player: 0.5f, spawn_potentials: [{data: {entity: {id: \"minecraft:zombie\"}}, weight: 1}], ticks_between_spawn: 20}", "{loot_tables_to_eject: [{data: \"minecraft:spawners/ominous/trial_chamber/key\", weight: 3}, {data: \"minecraft:spawners/ominous/trial_chamber/consumables\", weight: 7}],spawn_potentials: [{data: {entity: {id: \"minecraft:zombie\"}, equipment: {loot_table: \"minecraft:equipment/trial_chamber_melee\", slot_drop_chances: 0.0f}}, weight: 1}]}");
        class08203.N(class01894.y((String)"trial_chamber/ranged/poison_skeleton"), "{simultaneous_mobs: 3.0f, simultaneous_mobs_added_per_player: 0.5f, spawn_potentials: [{data: {entity: {id: \"minecraft:bogged\"}}, weight: 1}], ticks_between_spawn: 20}", "{loot_tables_to_eject: [{data: \"minecraft:spawners/ominous/trial_chamber/key\", weight: 3}, {data: \"minecraft:spawners/ominous/trial_chamber/consumables\", weight: 7}],spawn_potentials: [{data: {entity: {id: \"minecraft:bogged\"}, equipment: {loot_table: \"minecraft:equipment/trial_chamber_ranged\", slot_drop_chances: 0.0f}}, weight: 1}]}");
        class08203.N(class01894.y((String)"trial_chamber/ranged/skeleton"), "{simultaneous_mobs: 3.0f, simultaneous_mobs_added_per_player: 0.5f, spawn_potentials: [{data: {entity: {id: \"minecraft:skeleton\"}}, weight: 1}], ticks_between_spawn: 20}", "{loot_tables_to_eject: [{data: \"minecraft:spawners/ominous/trial_chamber/key\", weight: 3}, {data: \"minecraft:spawners/ominous/trial_chamber/consumables\", weight: 7}], spawn_potentials: [{data: {entity: {id: \"minecraft:skeleton\"}, equipment: {loot_table: \"minecraft:equipment/trial_chamber_ranged\", slot_drop_chances: 0.0f}}, weight: 1}]}");
        class08203.N(class01894.y((String)"trial_chamber/ranged/stray"), "{simultaneous_mobs: 3.0f, simultaneous_mobs_added_per_player: 0.5f, spawn_potentials: [{data: {entity: {id: \"minecraft:stray\"}}, weight: 1}], ticks_between_spawn: 20}", "{loot_tables_to_eject: [{data: \"minecraft:spawners/ominous/trial_chamber/key\", weight: 3}, {data: \"minecraft:spawners/ominous/trial_chamber/consumables\", weight: 7}], spawn_potentials: [{data: {entity: {id: \"minecraft:stray\"}, equipment: {loot_table: \"minecraft:equipment/trial_chamber_ranged\", slot_drop_chances: 0.0f}}, weight: 1}]}");
        class08203.N(class01894.y((String)"trial_chamber/slow_ranged/poison_skeleton"), "{simultaneous_mobs: 4.0f, simultaneous_mobs_added_per_player: 2.0f, spawn_potentials: [{data: {entity: {id: \"minecraft:bogged\"}}, weight: 1}], ticks_between_spawn: 160}", "{loot_tables_to_eject: [{data: \"minecraft:spawners/ominous/trial_chamber/key\", weight: 3}, {data: \"minecraft:spawners/ominous/trial_chamber/consumables\", weight: 7}], spawn_potentials: [{data: {entity: {id: \"minecraft:bogged\"}, equipment: {loot_table: \"minecraft:equipment/trial_chamber_ranged\", slot_drop_chances: 0.0f}}, weight: 1}]}");
        class08203.N(class01894.y((String)"trial_chamber/slow_ranged/skeleton"), "{simultaneous_mobs: 4.0f, simultaneous_mobs_added_per_player: 2.0f, spawn_potentials: [{data: {entity: {id: \"minecraft:skeleton\"}}, weight: 1}], ticks_between_spawn: 160}", "{loot_tables_to_eject: [{data: \"minecraft:spawners/ominous/trial_chamber/key\", weight: 3}, {data: \"minecraft:spawners/ominous/trial_chamber/consumables\", weight: 7}], spawn_potentials: [{data: {entity: {id: \"minecraft:skeleton\"}, equipment: {loot_table: \"minecraft:equipment/trial_chamber_ranged\", slot_drop_chances: 0.0f}}, weight: 1}]}");
        class08203.N(class01894.y((String)"trial_chamber/slow_ranged/stray"), "{simultaneous_mobs: 4.0f, simultaneous_mobs_added_per_player: 2.0f, spawn_potentials: [{data: {entity: {id: \"minecraft:stray\"}}, weight: 1}], ticks_between_spawn: 160}", "{loot_tables_to_eject: [{data: \"minecraft:spawners/ominous/trial_chamber/key\", weight: 3}, {data: \"minecraft:spawners/ominous/trial_chamber/consumables\", weight: 7}],spawn_potentials: [{data: {entity: {id: \"minecraft:stray\"}, equipment: {loot_table: \"minecraft:equipment/trial_chamber_ranged\", slot_drop_chances: 0.0f}}, weight: 1}]}");
        class08203.N(class01894.y((String)"trial_chamber/small_melee/baby_zombie"), "{simultaneous_mobs: 2.0f, simultaneous_mobs_added_per_player: 0.5f, spawn_potentials: [{data: {entity: {IsBaby: 1b, id: \"minecraft:zombie\"}}, weight: 1}], ticks_between_spawn: 20}", "{loot_tables_to_eject: [{data: \"minecraft:spawners/ominous/trial_chamber/key\", weight: 3}, {data: \"minecraft:spawners/ominous/trial_chamber/consumables\", weight: 7}], spawn_potentials: [{data: {entity: {IsBaby: 1b, id: \"minecraft:zombie\"}, equipment: {loot_table: \"minecraft:equipment/trial_chamber_melee\", slot_drop_chances: 0.0f}}, weight: 1}]}");
        class08203.N(class01894.y((String)"trial_chamber/small_melee/cave_spider"), "{simultaneous_mobs: 3.0f, simultaneous_mobs_added_per_player: 0.5f, spawn_potentials: [{data: {entity: {id: \"minecraft:cave_spider\"}}, weight: 1}], ticks_between_spawn: 20}", "{loot_tables_to_eject: [{data: \"minecraft:spawners/ominous/trial_chamber/key\", weight: 3}, {data: \"minecraft:spawners/ominous/trial_chamber/consumables\", weight: 7}], simultaneous_mobs: 4.0f, total_mobs: 12.0f}");
        class08203.N(class01894.y((String)"trial_chamber/small_melee/silverfish"), "{simultaneous_mobs: 3.0f, simultaneous_mobs_added_per_player: 0.5f, spawn_potentials: [{data: {entity: {id: \"minecraft:silverfish\"}}, weight: 1}], ticks_between_spawn: 20}", "{loot_tables_to_eject: [{data: \"minecraft:spawners/ominous/trial_chamber/key\", weight: 3}, {data: \"minecraft:spawners/ominous/trial_chamber/consumables\", weight: 7}], simultaneous_mobs: 4.0f, total_mobs: 12.0f}");
        class08203.N(class01894.y((String)"trial_chamber/small_melee/slime"), "{simultaneous_mobs: 3.0f, simultaneous_mobs_added_per_player: 0.5f, spawn_potentials: [{data: {entity: {Size: 1, id: \"minecraft:slime\"}}, weight: 3}, {data: {entity: {Size: 2, id: \"minecraft:slime\"}}, weight: 1}], ticks_between_spawn: 20}", "{loot_tables_to_eject: [{data: \"minecraft:spawners/ominous/trial_chamber/key\", weight: 3}, {data: \"minecraft:spawners/ominous/trial_chamber/consumables\", weight: 7}], simultaneous_mobs: 4.0f, total_mobs: 12.0f}");
    }

    private static class07001 y(class07001 class070012) {
        if (class070012.y("spawn_range", 0) == 4) {
            class070012.b("spawn_range");
        }
        if (class070012.y("total_mobs", 0.0f) == 6.0f) {
            class070012.b("total_mobs");
        }
        if (class070012.y("simultaneous_mobs", 0.0f) == 2.0f) {
            class070012.b("simultaneous_mobs");
        }
        if (class070012.y("total_mobs_added_per_player", 0.0f) == 2.0f) {
            class070012.b("total_mobs_added_per_player");
        }
        if (class070012.y("simultaneous_mobs_added_per_player", 0.0f) == 1.0f) {
            class070012.b("simultaneous_mobs_added_per_player");
        }
        if (class070012.y("ticks_between_spawn", 0) == 40) {
            class070012.b("ticks_between_spawn");
        }
        return class070012;
    }

    private static class07001 N(String string) {
        try {
            return class07755.N((String)string);
        }
        catch (CommandSyntaxException commandSyntaxException) {
            throw new IllegalArgumentException("Failed to parse Trial Spawner NBT config: " + string, commandSyntaxException);
        }
    }

    private static Dynamic<class07709> N(class07001 class070012) {
        return new Dynamic((DynamicOps)class07713.N, (Object)class070012);
    }

    private static void N(class01894 class018942, String string, String string2) {
        try {
            class07001 class070012 = class08203.N(string);
            class07001 class070013 = class08203.N(string2);
            class07001 class070014 = class070012.N().N(class070013);
            class07001 class070015 = class08203.y(class070014.N());
            Dynamic<class07709> var7 = class08203.N(class070012);
            N.put((Pair<Dynamic<class07709>, Dynamic<class07709>>)Pair.of(var7, class08203.N(class070013)), class018942);
            N.put((Pair<Dynamic<class07709>, Dynamic<class07709>>)Pair.of(var7, class08203.N(class070014)), class018942);
            N.put((Pair<Dynamic<class07709>, Dynamic<class07709>>)Pair.of(var7, class08203.N(class070015)), class018942);
        }
        catch (RuntimeException runtimeException) {
            throw new IllegalStateException("Failed to parse NBT for " + String.valueOf(class018942), runtimeException);
        }
    }
}

