/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.templates.TypeTemplate
 *  java.util.SequencedMap
 *  minecraft.class00622
 *  minecraft.class02844
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.SequencedMap;
import java.util.function.Supplier;
import minecraft.class00622;
import minecraft.class02844;
import minecraft.class06962;

public class class08274
extends class00622 {
    public class08274(int n, Schema schema) {
        super(n, schema);
    }

    public static SequencedMap<String, Supplier<TypeTemplate>> N(Schema schema) {
        SequencedMap sequencedMap = class02844.N((Schema)schema);
        sequencedMap.remove((Object)"minecraft:food");
        sequencedMap.put((Object)"minecraft:use_remainder", () -> class06962.l.in(schema));
        sequencedMap.put((Object)"minecraft:equippable", () -> DSL.optionalFields((String)"allowed_entities", (TypeTemplate)DSL.or((TypeTemplate)class06962.I.in(schema), (TypeTemplate)DSL.list((TypeTemplate)class06962.I.in(schema)))));
        return sequencedMap;
    }

    public void registerTypes(Schema schema, Map<String, Supplier<TypeTemplate>> map, Map<String, Supplier<TypeTemplate>> map2) {
        super.registerTypes(schema, map, map2);
        schema.registerType(true, class06962.k, () -> DSL.optionalFieldsLazy(class08274.N(schema)));
    }
}

