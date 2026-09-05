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

public class class00270
extends class00622 {
    public class00270(int n, Schema schema) {
        super(n, schema);
    }

    private void N(Map<String, Supplier<TypeTemplate>> map, String string2) {
        this.register(map, string2, string -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)class06962.l.in((Schema)this))));
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema schema) {
        Map map = super.registerEntities(schema);
        map.remove("minecraft:boat");
        map.remove("minecraft:chest_boat");
        this.registerSimple(map, "minecraft:oak_boat");
        this.registerSimple(map, "minecraft:spruce_boat");
        this.registerSimple(map, "minecraft:birch_boat");
        this.registerSimple(map, "minecraft:jungle_boat");
        this.registerSimple(map, "minecraft:acacia_boat");
        this.registerSimple(map, "minecraft:cherry_boat");
        this.registerSimple(map, "minecraft:dark_oak_boat");
        this.registerSimple(map, "minecraft:mangrove_boat");
        this.registerSimple(map, "minecraft:bamboo_raft");
        this.N(map, "minecraft:oak_chest_boat");
        this.N(map, "minecraft:spruce_chest_boat");
        this.N(map, "minecraft:birch_chest_boat");
        this.N(map, "minecraft:jungle_chest_boat");
        this.N(map, "minecraft:acacia_chest_boat");
        this.N(map, "minecraft:cherry_chest_boat");
        this.N(map, "minecraft:dark_oak_chest_boat");
        this.N(map, "minecraft:mangrove_chest_boat");
        this.N(map, "minecraft:bamboo_chest_raft");
        return map;
    }
}

