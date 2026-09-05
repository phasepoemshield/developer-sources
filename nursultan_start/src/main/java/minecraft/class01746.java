/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import java.util.Optional;
import minecraft.class01733;
import minecraft.class06962;

public class class01746
extends class01733 {
    private static <T> Dynamic<T> L(Dynamic<T> dynamic) {
        return dynamic.set("block_state", dynamic.createMap(Map.of(dynamic.createString("Name"), dynamic.createString("minecraft:tnt"))));
    }

    public class01746(Schema schema) {
        super(schema, true, "PrimedTnt BlockState fixer", class06962.o, "minecraft:tnt");
    }

    private static <T> Dynamic<T> y(Dynamic<T> dynamic) {
        Optional optional = dynamic.get("Fuse").get().result();
        if (optional.isPresent()) {
            return dynamic.set("fuse", (Dynamic)optional.get());
        }
        return dynamic;
    }

    @Override
    protected <T> Dynamic<T> N(Dynamic<T> dynamic) {
        return class01746.y(class01746.L(dynamic));
    }
}

