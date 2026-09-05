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

public class class08110
extends class00955 {
    public class08110(Schema schema, boolean bl) {
        super(schema, bl, "EntityShulkerColorFix", class06962.o, "minecraft:shulker");
    }

    public Dynamic<?> N(Dynamic<?> dynamic) {
        if (dynamic.get("Color").map(Dynamic::asNumber).result().isEmpty()) {
            return dynamic.set("Color", dynamic.createByte((byte)10));
        }
        return dynamic;
    }

    protected Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), this::N);
    }
}

