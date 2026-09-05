/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class02479
 */
package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import minecraft.class02479;

public class class08708
extends class02479 {
    public class08708(Schema schema) {
        super(schema, "FireResistantToDamageResistantComponentFix", "minecraft:fire_resistant", "minecraft:damage_resistant");
    }

    protected <T> Dynamic<T> N(Dynamic<T> dynamic) {
        return dynamic.emptyMap().set("types", dynamic.createString("#minecraft:is_fire"));
    }
}

