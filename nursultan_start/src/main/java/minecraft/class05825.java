/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00955
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import minecraft.class00955;
import minecraft.class06962;

public class class05825
extends class00955 {
    public class05825(Schema schema, boolean bl) {
        super(schema, bl, "EntityArmorStandSilentFix", class06962.o, "ArmorStand");
    }

    public Dynamic<?> N(Dynamic<?> dynamic) {
        if (dynamic.get("Silent").asBoolean(false) && !dynamic.get("Marker").asBoolean(false)) {
            return dynamic.remove("Silent");
        }
        return dynamic;
    }

    protected Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), this::N);
    }
}

