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

public class class06544
extends class00622 {
    public class06544(int n, Schema schema) {
        super(n, schema);
    }

    protected static void N(Schema schema, Map<String, Supplier<TypeTemplate>> map, String string) {
        schema.registerSimple(map, string);
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema schema) {
        Map map = super.registerEntities(schema);
        class06544.N(schema, map, "minecraft:turtle");
        class06544.N(schema, map, "minecraft:cod_mob");
        class06544.N(schema, map, "minecraft:tropical_fish");
        class06544.N(schema, map, "minecraft:salmon_mob");
        class06544.N(schema, map, "minecraft:puffer_fish");
        class06544.N(schema, map, "minecraft:phantom");
        class06544.N(schema, map, "minecraft:dolphin");
        class06544.N(schema, map, "minecraft:drowned");
        schema.register(map, "minecraft:trident", string -> DSL.optionalFields((String)"inBlockState", (TypeTemplate)class06962.d.in(schema), (String)"Trident", (TypeTemplate)class06962.l.in(schema)));
        return map;
    }
}

