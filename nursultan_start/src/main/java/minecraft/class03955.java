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

public class class03955
extends class00955 {
    public class03955(Schema schema) {
        super(schema, false, "EntityGoatMissingStateFix", class06962.o, "minecraft:goat");
    }

    protected Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), dynamic -> dynamic.set("HasLeftHorn", dynamic.createBoolean(true)).set("HasRightHorn", dynamic.createBoolean(true)));
    }
}

