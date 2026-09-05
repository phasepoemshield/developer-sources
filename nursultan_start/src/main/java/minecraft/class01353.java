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

public class class01353
extends class00955 {
    public class01353(Schema schema, boolean bl) {
        super(schema, bl, "JigsawPropertiesFix", class06962.G, "minecraft:jigsaw");
    }

    private static Dynamic<?> N(Dynamic<?> dynamic) {
        String string = dynamic.get("attachement_type").asString("minecraft:empty");
        String string2 = dynamic.get("target_pool").asString("minecraft:empty");
        return dynamic.set("name", dynamic.createString(string)).set("target", dynamic.createString(string)).remove("attachement_type").set("pool", dynamic.createString(string2)).remove("target_pool");
    }

    protected Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), class01353::N);
    }
}

