/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.TaggedChoice
 *  com.mojang.datafixers.types.templates.TypeTemplate
 *  minecraft.class00622
 *  minecraft.class06962
 *  net.fabricmc.fabric.impl.dimension.TaggedChoiceExtension
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;
import minecraft.class00622;
import minecraft.class06962;
import net.fabricmc.fabric.impl.dimension.TaggedChoiceExtension;

public class class03310
extends class00622 {
    public class03310(int n, Schema schema) {
        super(n, schema);
    }

    private static TaggedChoice N(String string, Type type, Map map) {
        TaggedChoice taggedChoice = DSL.taggedChoiceLazy((String)string, (Type)type, (Map)map);
        ((TaggedChoiceExtension)taggedChoice).fabric$setFailSoft(true);
        return taggedChoice;
    }

    public void registerTypes(Schema schema, Map<String, Supplier<TypeTemplate>> map, Map<String, Supplier<TypeTemplate>> map2) {
        super.registerTypes(schema, map, map2);
        schema.registerType(false, class06962.u, () -> DSL.fields((String)"Level", (TypeTemplate)DSL.optionalFields((String)"Entities", (TypeTemplate)DSL.list((TypeTemplate)class06962.J.in(schema)), (String)"TileEntities", (TypeTemplate)DSL.list((TypeTemplate)DSL.or((TypeTemplate)class06962.G.in(schema), (TypeTemplate)DSL.remainder())), (String)"TileTicks", (TypeTemplate)DSL.list((TypeTemplate)DSL.fields((String)"i", (TypeTemplate)class06962.q.in(schema))), (String)"Sections", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"biomes", (TypeTemplate)DSL.optionalFields((String)"palette", (TypeTemplate)DSL.list((TypeTemplate)class06962.p.in(schema))), (String)"block_states", (TypeTemplate)DSL.optionalFields((String)"palette", (TypeTemplate)DSL.list((TypeTemplate)class06962.d.in(schema))))), (String)"Structures", (TypeTemplate)DSL.optionalFields((String)"Starts", (TypeTemplate)DSL.compoundList((TypeTemplate)class06962.H.in(schema))))));
        schema.registerType(false, class06962.F, () -> DSL.constType((Type)class03310.N()));
        schema.registerType(false, class06962.A, () -> DSL.fields((String)"dimensions", (TypeTemplate)DSL.compoundList((TypeTemplate)DSL.constType((Type)class03310.N()), (TypeTemplate)DSL.fields((String)"generator", (TypeTemplate)class03310.N("type", DSL.string(), (Map)ImmutableMap.of((Object)"minecraft:debug", DSL::remainder, (Object)"minecraft:flat", () -> DSL.optionalFields((String)"settings", (TypeTemplate)DSL.optionalFields((String)"biome", (TypeTemplate)class06962.p.in(schema), (String)"layers", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"block", (TypeTemplate)class06962.q.in(schema))))), (Object)"minecraft:noise", () -> DSL.optionalFields((String)"biome_source", (TypeTemplate)class03310.N("type", DSL.string(), (Map)ImmutableMap.of((Object)"minecraft:fixed", () -> DSL.fields((String)"biome", (TypeTemplate)class06962.p.in(schema)), (Object)"minecraft:multi_noise", () -> DSL.or((TypeTemplate)DSL.fields((String)"preset", (TypeTemplate)class06962.F.in(schema)), (TypeTemplate)DSL.list((TypeTemplate)DSL.fields((String)"biome", (TypeTemplate)class06962.p.in(schema)))), (Object)"minecraft:checkerboard", () -> DSL.fields((String)"biomes", (TypeTemplate)DSL.list((TypeTemplate)class06962.p.in(schema))), (Object)"minecraft:the_end", DSL::remainder)), (String)"settings", (TypeTemplate)DSL.or((TypeTemplate)DSL.constType((Type)DSL.string()), (TypeTemplate)DSL.optionalFields((String)"default_block", (TypeTemplate)class06962.q.in(schema), (String)"default_fluid", (TypeTemplate)class06962.q.in(schema))))))))));
    }
}

