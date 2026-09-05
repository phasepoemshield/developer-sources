/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  minecraft.class00955
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import minecraft.class00955;
import minecraft.class06962;

public class class05689
extends class00955 {
    public class05689(Schema schema, boolean bl) {
        super(schema, bl, "OminousBannerBlockEntityRenameFix", class06962.G, "minecraft:banner");
    }

    protected Typed<?> N(Typed<?> typed2) {
        OpticFinder var2 = typed2.getType().findField("CustomName");
        OpticFinder opticFinder = DSL.typeFinder((Type)this.getInputSchema().getType(class06962.O));
        return typed2.updateTyped(var2, typed -> typed.update(opticFinder, pair -> pair.mapSecond(string -> string.replace("\"translate\":\"block.minecraft.illager_banner\"", "\"translate\":\"block.minecraft.ominous_banner\""))));
    }
}

