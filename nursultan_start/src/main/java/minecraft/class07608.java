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

public class class07608
extends class00622 {
    public class07608(int n, Schema schema) {
        super(n, schema);
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema schema) {
        Map map = super.registerEntities(schema);
        schema.registerSimple(map, "minecraft:egg");
        schema.registerSimple(map, "minecraft:ender_pearl");
        schema.registerSimple(map, "minecraft:fireball");
        schema.register(map, "minecraft:potion", string -> DSL.optionalFields((String)"Potion", (TypeTemplate)class06962.l.in(schema)));
        schema.registerSimple(map, "minecraft:small_fireball");
        schema.registerSimple(map, "minecraft:snowball");
        schema.registerSimple(map, "minecraft:wither_skull");
        schema.registerSimple(map, "minecraft:xp_bottle");
        schema.register(map, "minecraft:arrow", () -> DSL.optionalFields((String)"inBlockState", (TypeTemplate)class06962.d.in(schema)));
        schema.register(map, "minecraft:enderman", () -> DSL.optionalFields((String)"carriedBlockState", (TypeTemplate)class06962.d.in(schema)));
        schema.register(map, "minecraft:falling_block", () -> DSL.optionalFields((String)"BlockState", (TypeTemplate)class06962.d.in(schema), (String)"TileEntityData", (TypeTemplate)class06962.G.in(schema)));
        schema.register(map, "minecraft:spectral_arrow", () -> DSL.optionalFields((String)"inBlockState", (TypeTemplate)class06962.d.in(schema)));
        schema.register(map, "minecraft:chest_minecart", () -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)class06962.d.in(schema), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)class06962.l.in(schema))));
        schema.register(map, "minecraft:commandblock_minecart", () -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)class06962.d.in(schema), (String)"LastOutput", (TypeTemplate)class06962.O.in(schema)));
        schema.register(map, "minecraft:furnace_minecart", () -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)class06962.d.in(schema)));
        schema.register(map, "minecraft:hopper_minecart", () -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)class06962.d.in(schema), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)class06962.l.in(schema))));
        schema.register(map, "minecraft:minecart", () -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)class06962.d.in(schema)));
        schema.register(map, "minecraft:spawner_minecart", () -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)class06962.d.in(schema), (TypeTemplate)class06962.e.in(schema)));
        schema.register(map, "minecraft:tnt_minecart", () -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)class06962.d.in(schema)));
        return map;
    }
}

