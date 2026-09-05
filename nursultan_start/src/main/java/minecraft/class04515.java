/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.templates.TypeTemplate
 *  minecraft.class00622
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;
import minecraft.class00622;
import minecraft.class06962;

public class class04515
extends class00622 {
    public class04515(int n, Schema schema) {
        super(n, schema);
    }

    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema schema) {
        Map map = super.registerBlockEntities(schema);
        schema.register(map, "minecraft:trial_spawner", () -> DSL.optionalFields((String)"spawn_potentials", (TypeTemplate)DSL.list((TypeTemplate)DSL.fields((String)"data", (TypeTemplate)DSL.fields((String)"entity", (TypeTemplate)class06962.J.in(schema)))), (String)"spawn_data", (TypeTemplate)DSL.fields((String)"entity", (TypeTemplate)class06962.J.in(schema))));
        return map;
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema schema) {
        Map map = super.registerEntities(schema);
        schema.registerSimple(map, "minecraft:breeze");
        schema.registerSimple(map, "minecraft:wind_charge");
        schema.registerSimple(map, "minecraft:breeze_wind_charge");
        return map;
    }
}

