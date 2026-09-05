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

public class class08245
extends class00955 {
    private static final String L = "CanPickUpLoot";

    public class08245(Schema schema) {
        super(schema, true, "Villager CanPickUpLoot default value", class06962.o, "Villager");
    }

    protected Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), class08245::N);
    }

    private static Dynamic<?> N(Dynamic<?> dynamic) {
        return dynamic.set(L, dynamic.createBoolean(true));
    }
}

