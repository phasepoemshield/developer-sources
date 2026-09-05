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
import java.util.List;
import minecraft.class00955;
import minecraft.class06962;

public class class05215
extends class00955 {
    public class05215(Schema schema) {
        super(schema, false, "EntityShulkerRotationFix", class06962.o, "minecraft:shulker");
    }

    public Dynamic<?> N(Dynamic<?> dynamic2) {
        List list = dynamic2.get("Rotation").asList(dynamic -> dynamic.asDouble(180.0));
        if (!list.isEmpty()) {
            list.set(0, (Double)list.get(0) - 180.0);
            return dynamic2.set("Rotation", dynamic2.createList(list.stream().map(arg_0 -> dynamic2.createDouble(arg_0))));
        }
        return dynamic2;
    }

    protected Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), this::N);
    }
}

