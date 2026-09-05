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

public class class01044
extends class00955 {
    public class01044(Schema schema, boolean bl) {
        super(schema, bl, "Remove Golem Gossip Fix", class06962.o, "minecraft:villager");
    }

    protected Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), class01044::N);
    }

    private static Dynamic<?> N(Dynamic<?> dynamic) {
        return dynamic.update("Gossips", dynamic3 -> dynamic.createList(dynamic3.asStream().filter(dynamic -> !dynamic.get("Type").asString("").equals("golem"))));
    }
}

