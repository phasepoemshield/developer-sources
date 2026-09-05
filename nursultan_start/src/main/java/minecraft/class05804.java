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

public class class05804
extends class00955 {
    public class05804(Schema schema, boolean bl) {
        super(schema, bl, "BlockEntityKeepPacked", class06962.G, "DUMMY");
    }

    private static Dynamic<?> N(Dynamic<?> dynamic) {
        return dynamic.set("keepPacked", dynamic.createBoolean(true));
    }

    protected Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), class05804::N);
    }
}

