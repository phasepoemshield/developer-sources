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

public class class05224
extends class00955 {
    private static final double L = 16.0;
    private static final double u = 48.0;

    public class05224(Schema schema) {
        super(schema, false, "Villager Follow Range Fix", class06962.o, "minecraft:villager");
    }

    protected Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), class05224::N);
    }

    private static Dynamic<?> N(Dynamic<?> dynamic) {
        return dynamic.update("Attributes", dynamic3 -> dynamic.createList(dynamic3.asStream().map(dynamic -> {
            if (!dynamic.get("Name").asString("").equals("generic.follow_range") || dynamic.get("Base").asDouble(0.0) != 16.0) {
                return dynamic;
            }
            return dynamic.set("Base", dynamic.createDouble(48.0));
        })));
    }
}

