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

public class class08348
extends class00955 {
    public class08348(Schema schema) {
        super(schema, false, "AreaEffectCloudDurationScaleFix", class06962.o, "minecraft:area_effect_cloud");
    }

    protected Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), dynamic -> dynamic.set("potion_duration_scale", dynamic.createFloat(0.25f)));
    }
}

