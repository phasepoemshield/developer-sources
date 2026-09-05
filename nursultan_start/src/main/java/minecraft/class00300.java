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
import minecraft.class06962;

public class class00300
extends class00955 {
    public class00300(Schema schema) {
        super(schema, false, "EntitySalmonSizeFix", class06962.o, "minecraft:salmon");
    }

    protected Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), dynamic -> {
            if (dynamic.get("type").asString("medium").equals("large")) {
                return dynamic;
            }
            return dynamic.set("type", dynamic.createString("medium"));
        });
    }
}

