/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00622
 *  minecraft.class01733
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import minecraft.class00622;
import minecraft.class01733;
import minecraft.class06962;

public class class02929
extends class01733 {
    public class02929(Schema schema) {
        super(schema, false, "RemoveEmptyItemInSuspiciousBlockFix", class06962.G, "minecraft:brushable_block");
    }

    private static boolean y(Dynamic<?> dynamic) {
        String string = class00622.N((String)dynamic.get("id").asString("minecraft:air"));
        int n = dynamic.get("count").asInt(0);
        return string.equals("minecraft:air") || n == 0;
    }

    protected <T> Dynamic<T> N(Dynamic<T> dynamic) {
        Optional optional = dynamic.get("item").result();
        if (optional.isPresent() && class02929.y((Dynamic)optional.get())) {
            return dynamic.remove("item");
        }
        return dynamic;
    }
}

