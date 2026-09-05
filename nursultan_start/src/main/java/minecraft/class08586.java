/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.templates.TypeTemplate
 *  java.util.SequencedMap
 *  minecraft.class00622
 *  minecraft.class06962
 *  minecraft.class08274
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.SequencedMap;
import java.util.function.Supplier;
import minecraft.class00622;
import minecraft.class06962;
import minecraft.class08274;

public class class08586
extends class00622 {
    public class08586(int n, Schema schema) {
        super(n, schema);
    }

    private static TypeTemplate y(Schema schema) {
        TypeTemplate typeTemplate = DSL.optionalFields((String)"blocks", (TypeTemplate)DSL.or((TypeTemplate)class06962.q.in(schema), (TypeTemplate)DSL.list((TypeTemplate)class06962.q.in(schema))));
        return DSL.or((TypeTemplate)typeTemplate, (TypeTemplate)DSL.list((TypeTemplate)typeTemplate));
    }

    public static SequencedMap<String, Supplier<TypeTemplate>> N(Schema schema) {
        SequencedMap sequencedMap = class08274.N((Schema)schema);
        sequencedMap.put((Object)"minecraft:can_place_on", () -> class08586.y(schema));
        sequencedMap.put((Object)"minecraft:can_break", () -> class08586.y(schema));
        return sequencedMap;
    }

    public void registerTypes(Schema schema, Map<String, Supplier<TypeTemplate>> map, Map<String, Supplier<TypeTemplate>> map2) {
        super.registerTypes(schema, map, map2);
        schema.registerType(true, class06962.k, () -> DSL.optionalFieldsLazy(class08586.N(schema)));
    }
}

