/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  minecraft.class00955
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import minecraft.class00955;
import minecraft.class05701;
import minecraft.class06962;

public class class05710
extends class00955 {
    public class05710(Schema schema, boolean bl) {
        super(schema, bl, "Zombie Villager XP rebuild", class06962.o, "minecraft:zombie_villager");
    }

    protected Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), dynamic -> {
            if (dynamic.get("Xp").asNumber().result().isEmpty()) {
                int n = dynamic.get("VillagerData").get("level").asInt(1);
                return dynamic.set("Xp", dynamic.createInt(class05701.N(n)));
            }
            return dynamic;
        });
    }
}

