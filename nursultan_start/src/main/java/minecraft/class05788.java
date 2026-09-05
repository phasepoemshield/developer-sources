/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  minecraft.class00955
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import minecraft.class00955;
import minecraft.class06962;

public class class05788
extends class00955 {
    public class05788(Schema schema, boolean bl) {
        super(schema, bl, "BlockEntityShulkerBoxColorFix", class06962.G, "minecraft:shulker_box");
    }

    protected Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), dynamic -> dynamic.remove("Color"));
    }
}

