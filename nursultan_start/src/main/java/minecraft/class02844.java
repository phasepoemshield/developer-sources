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
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SequencedMap;
import java.util.function.Supplier;
import minecraft.class00622;
import minecraft.class06962;

public class class02844
extends class00622 {
    public class02844(int n, Schema schema) {
        super(n, schema);
    }

    public static SequencedMap<String, Supplier<TypeTemplate>> N(Schema schema) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("minecraft:bees", () -> DSL.list((TypeTemplate)DSL.optionalFields((String)"entity_data", (TypeTemplate)class06962.J.in(schema))));
        linkedHashMap.put("minecraft:block_entity_data", () -> class06962.G.in(schema));
        linkedHashMap.put("minecraft:bundle_contents", () -> DSL.list((TypeTemplate)class06962.l.in(schema)));
        linkedHashMap.put("minecraft:can_break", () -> DSL.optionalFields((String)"predicates", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"blocks", (TypeTemplate)DSL.or((TypeTemplate)class06962.q.in(schema), (TypeTemplate)DSL.list((TypeTemplate)class06962.q.in(schema)))))));
        linkedHashMap.put("minecraft:can_place_on", () -> DSL.optionalFields((String)"predicates", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"blocks", (TypeTemplate)DSL.or((TypeTemplate)class06962.q.in(schema), (TypeTemplate)DSL.list((TypeTemplate)class06962.q.in(schema)))))));
        linkedHashMap.put("minecraft:charged_projectiles", () -> DSL.list((TypeTemplate)class06962.l.in(schema)));
        linkedHashMap.put("minecraft:container", () -> DSL.list((TypeTemplate)DSL.optionalFields((String)"item", (TypeTemplate)class06962.l.in(schema))));
        linkedHashMap.put("minecraft:entity_data", () -> class06962.J.in(schema));
        linkedHashMap.put("minecraft:pot_decorations", () -> DSL.list((TypeTemplate)class06962.K.in(schema)));
        linkedHashMap.put("minecraft:food", () -> DSL.optionalFields((String)"using_converts_to", (TypeTemplate)class06962.l.in(schema)));
        linkedHashMap.put("minecraft:custom_name", () -> class06962.O.in(schema));
        linkedHashMap.put("minecraft:item_name", () -> class06962.O.in(schema));
        linkedHashMap.put("minecraft:lore", () -> DSL.list((TypeTemplate)class06962.O.in(schema)));
        linkedHashMap.put("minecraft:written_book_content", () -> DSL.optionalFields((String)"pages", (TypeTemplate)DSL.list((TypeTemplate)DSL.or((TypeTemplate)DSL.optionalFields((String)"raw", (TypeTemplate)class06962.O.in(schema), (String)"filtered", (TypeTemplate)class06962.O.in(schema)), (TypeTemplate)class06962.O.in(schema)))));
        return linkedHashMap;
    }

    public void registerTypes(Schema schema, Map<String, Supplier<TypeTemplate>> map, Map<String, Supplier<TypeTemplate>> map2) {
        super.registerTypes(schema, map, map2);
        schema.registerType(true, class06962.k, () -> DSL.optionalFieldsLazy(class02844.N(schema)));
    }
}

