/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00955
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import minecraft.class00955;
import minecraft.class06962;

public class class03570
extends class00955 {
    public class03570(Schema schema) {
        super(schema, false, "EntityBrushableBlockFieldsRenameFix", class06962.G, "minecraft:brushable_block");
    }

    public Dynamic<?> N(Dynamic<?> dynamic) {
        return dynamic.renameField("loot_table", "LootTable").renameField("loot_table_seed", "LootTableSeed");
    }

    protected Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), this::N);
    }
}

