/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.templates.TypeTemplate
 *  minecraft.class00622
 */
package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;
import minecraft.class00622;

public class class03603
extends class00622 {
    public class03603(int n, Schema schema) {
        super(n, schema);
    }

    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema schema) {
        Map var2 = super.registerBlockEntities(schema);
        var2.put("minecraft:brushable_block", (Supplier)var2.remove("minecraft:suspicious_sand"));
        schema.registerSimple(var2, "minecraft:calibrated_sculk_sensor");
        return var2;
    }
}

