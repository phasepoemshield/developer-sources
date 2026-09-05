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

public class class08100
extends class00955 {
    public class08100(Schema schema) {
        super(schema, false, "CopperGolemWeatherStateFix", class06962.o, "minecraft:copper_golem");
    }

    protected Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), dynamic -> dynamic.update("weather_state", class08100::N));
    }

    private static Dynamic<?> N(Dynamic<?> dynamic) {
        return switch (dynamic.asInt(0)) {
            case 1 -> dynamic.createString("exposed");
            case 2 -> dynamic.createString("weathered");
            case 3 -> dynamic.createString("oxidized");
            default -> dynamic.createString("unaffected");
        };
    }
}

